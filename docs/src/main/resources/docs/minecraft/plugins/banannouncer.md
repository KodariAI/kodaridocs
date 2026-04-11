# BanAnnouncer API Reference

Plugin that announces bans/mutes/warnings from LiteBans, AdvancedBan, and LibertyBans to Discord via webhook, Spicord, or proxy forwarding. The API lets plugins write custom extensions, register placeholders, and hook into the punishment pipeline. Add `BanAnnouncer` to `depend` or `softdepend` in plugin.yml.

> **Note:** BanAnnouncer does NOT fire its own Bukkit events. It hooks directly into the punishment plugins' event APIs. All punishment detection happens after the fact — you cannot cancel a punishment via BanAnnouncer.

## Code Examples

### Register a Custom Placeholder

```java
import me.tini.announcer.BanAnnouncer;
import me.tini.announcer.PunishmentInfo;

BanAnnouncer announcer = myPlugin.getAnnouncer();

announcer.registerPlaceholder("%server_name%", punishment -> "Hub-01");
announcer.registerPlaceholder("%player_rank%", punishment -> {
    return getRankOf(punishment.getPlayerId());
});
```

### Read Punishment Info

```java
import me.tini.announcer.PunishmentInfo;
import me.tini.announcer.PunishmentInfo.Type;

public void handle(PunishmentInfo punishment) {
    String id = punishment.getId();
    String playerName = punishment.getPlayer();
    String playerUuid = punishment.getPlayerId();
    String operator = punishment.getOperator();
    String reason = punishment.getReason();        // null-safe, defaults to "none"
    String duration = punishment.getDuration();    // null-safe, defaults to "unknown"
    boolean permanent = punishment.isPermanent();
    Type type = punishment.getType();              // BAN, TEMPBAN, MUTE, UNBAN, etc.
    long startMs = punishment.getDateStart();
    long endMs = punishment.getDateEnd();

    boolean isUnban = punishment.isRevoked();      // UNBAN, UNMUTE, UNWARN, UNBANIP, UNJAIL
}
```

### Write a Custom Extension (Bukkit)

```java
import me.tini.announcer.BanAnnouncer;
import me.tini.announcer.PunishmentInfo;
import me.tini.announcer.PunishmentInfo.Type;
import me.tini.announcer.extension.AbstractExtension;
import me.tini.announcer.plugin.bukkit.BukkitPunishmentListener;
import org.bukkit.event.EventHandler;

public class MyBanExtension extends AbstractExtension {

    private final BanAnnouncer announcer;
    private final MyListener listener;

    public MyBanExtension(BanAnnouncer announcer) {
        this.announcer = announcer;
        this.listener = new MyListener(announcer);
    }

    @Override
    public String processPlaceholder(PunishmentInfo info, String placeholder) {
        if (placeholder.equals("%custom_tag%")) {
            return "MyValue";
        }
        return null;
    }

    @Override
    public me.tini.announcer.PunishmentListener getPunishmentListener() {
        return listener;
    }

    public static class MyListener extends BukkitPunishmentListener {

        public MyListener(BanAnnouncer announcer) {
            super(announcer);
        }

        @Override
        public void register() {
            org.bukkit.Bukkit.getPluginManager().registerEvents(this,
                    getAnnouncer().getPlugin().getFile() != null ? myPlugin : myPlugin);
        }

        @Override
        public void unregister() {
            org.bukkit.event.HandlerList.unregisterAll(this);
        }

        @EventHandler
        public void onCustomBan(/* your custom ban event */) {
            PunishmentInfo info = new PunishmentInfo();
            info.setType(Type.BAN);
            info.setPlayer("PlayerName");
            info.setPlayerId("uuid-here");
            info.setOperator("Admin");
            info.setReason("griefing");
            info.setPermanent(true);
            info.setDateStart(System.currentTimeMillis());

            handlePunishment(info);
        }
    }
}
```

### Register the Extension

```java
import me.tini.announcer.BanAnnouncer;

BanAnnouncer announcer = myPlugin.getAnnouncer();

announcer.registerExtension(
    "MyBanExtension",
    "my_extension_id",
    () -> new MyBanExtension(announcer),
    "com.example.MyBanPlugin"  // required class that must exist
);

announcer.enableExtensions();
```

## API Reference (Trimmed)

### `me.tini.announcer.BanAnnouncer`

| Return | Method | Description |
|---|---|---|
| `Config` | `getConfig()` | Config access |
| `BanAnnouncerPlugin` | `getPlugin()` | Main plugin |
| `boolean` | `isEnabled()` | Whether enabled |
| `void` | `handlePunishment(PunishmentInfo, PunishmentListener)` | Trigger announcement |
| `Embed` | `buildEmbed(PunishmentInfo)` | Build Discord embed |
| `void` | `registerPlaceholder(String, Function<PunishmentInfo, String>)` | Register custom `%placeholder%` |
| `String` | `processPlaceholder(PunishmentInfo, String)` | Resolve placeholder |
| `void` | `registerExtension(String name, String id, Supplier<AbstractExtension>, String requiredClass)` | Register extension |
| `void` | `enableExtensions()` | Enable registered extensions |

### `me.tini.announcer.PunishmentInfo`

Lombok `@Data` — all fields have getters and setters.

| Return | Method | Description |
|---|---|---|
| `String` | `getId()` | Punishment ID |
| `String` | `getPlayer()` | Player name |
| `String` | `getPlayerId()` | Player UUID string |
| `String` | `getOperator()` | Who issued it |
| `String` | `getReason()` | Reason (defaults to "none") |
| `String` | `getDuration()` | Duration string |
| `String` | `getJail()` | Jail name |
| `boolean` | `isPermanent()` | Is permanent |
| `Type` | `getType()` | Punishment type |
| `long` | `getDateStart()` | Start epoch ms |
| `long` | `getDateEnd()` | End epoch ms |
| `boolean` | `isRevoked()` | True for UNBAN/UNMUTE/UNWARN/UNBANIP/UNJAIL |

**`PunishmentInfo.Type` enum:** `KICK`, `BAN`, `TEMPBAN`, `UNBAN`, `BANIP`, `TEMPBANIP`, `UNBANIP`, `MUTE`, `TEMPMUTE`, `UNMUTE`, `WARN`, `TEMPWARN`, `UNWARN`, `JAIL`, `UNJAIL`, `NOTE`, `UNNOTE`

### `me.tini.announcer.PunishmentListener` (abstract)

| Return | Method | Description |
|---|---|---|
| `void` | `handlePunishment(PunishmentInfo)` | Trigger the announcement pipeline |
| `abstract void` | `register()` | Subscribe to target plugin's events |
| `abstract void` | `unregister()` | Unsubscribe |

**Platform subclasses to extend:**
- `me.tini.announcer.plugin.bukkit.BukkitPunishmentListener` (also implements `org.bukkit.event.Listener`)
- `me.tini.announcer.plugin.bungee.BungeePunishmentListener`
- `me.tini.announcer.plugin.velocity.VelocityPunishmentListener`
- `me.tini.announcer.plugin.sponge.SpongePunishmentListener`

### `me.tini.announcer.extension.AbstractExtension` (abstract)

| Return | Method | Description |
|---|---|---|
| `String` | `processPlaceholder(PunishmentInfo, String)` | Custom placeholder resolver |
| `PunishmentListener` | `getPunishmentListener()` | Extension's listener |

### Built-in Placeholders

`%id%`, `%player%`, `%player_uuid%`, `%staff%`, `%reason%`, `%duration%`, `%jail%`, `%date_start_t%` through `%date_start_F%`, `%date_end_t%` through `%date_end_F%` (Discord timestamp formats), plus LiteBans-specific: `%litebans_server_origin%`, `%litebans_server_scope%`, `%litebans_random_id%`, `%litebans_removal_reason%`, `%litebans_removed_by_name%`
