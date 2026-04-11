# TAB API (NEZNAMY/TAB)

TAB is a tablist formatting, nametag, scoreboard, bossbar, and layout plugin. All API changes are temporary -- they reset on plugin reload or server restart. Manager getters return `null` if that feature is disabled in config. Always null-check players from `getPlayer()`.

## Getting the API Instance

```java
import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;

TabAPI api = TabAPI.getInstance();
TabPlayer tabPlayer = api.getPlayer(player.getUniqueId()); // returns null if not loaded
TabPlayer byName = api.getPlayer("Steve"); // returns null if not found
TabPlayer[] allPlayers = api.getOnlinePlayers();
```

## Events (Use Instead of Join Events)

Players may not be loaded in TAB when Bukkit's PlayerJoinEvent fires. Always use `PlayerLoadEvent` to safely access a `TabPlayer`.

```java
import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.api.event.EventBus;
import me.neznamy.tab.api.event.player.PlayerLoadEvent;
import me.neznamy.tab.api.event.plugin.TabLoadEvent;
import me.neznamy.tab.api.event.plugin.PlaceholderRegisterEvent;

EventBus eventBus = TabAPI.getInstance().getEventBus();

// Fires when a player finishes loading in TAB (on join or reload)
eventBus.register(PlayerLoadEvent.class, event -> {
    TabPlayer tabPlayer = event.getPlayer();
    boolean isJoin = event.isJoin(); // false if triggered by /tab reload
});

// Fires when TAB finishes loading or is reloaded -- re-register API calls here
eventBus.register(TabLoadEvent.class, event -> {
    // Re-apply any API modifications after reload
});

// Fires when a placeholder identifier is being looked up
eventBus.register(PlaceholderRegisterEvent.class, event -> {
    if (event.getIdentifier().equals("%my_placeholder%")) {
        event.setPlayerPlaceholder(player -> player.getName());
    }
});
```

## Header and Footer

```java
import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.api.tablist.HeaderFooterManager;

HeaderFooterManager hfManager = TabAPI.getInstance().getHeaderFooterManager();
if (hfManager == null) return; // feature disabled

hfManager.setHeader(tabPlayer, "&aWelcome to the server!");
hfManager.setFooter(tabPlayer, "&7Online: %online%");
hfManager.setHeaderAndFooter(tabPlayer, "&aHeader", "&bFooter");

// Reset to config defaults by passing null
hfManager.setHeader(tabPlayer, null);
hfManager.setFooter(tabPlayer, null);
```

## Tablist Name Formatting

```java
import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.api.tablist.TabListFormatManager;

TabListFormatManager tabFormat = TabAPI.getInstance().getTabListFormatManager();
if (tabFormat == null) return; // feature disabled

tabFormat.setPrefix(tabPlayer, "&c[Admin] ");
tabFormat.setName(tabPlayer, "&e%player%");
tabFormat.setSuffix(tabPlayer, " &7[Lvl 50]");

// Reset to config defaults by passing null
tabFormat.setPrefix(tabPlayer, null);
tabFormat.setName(tabPlayer, null);
tabFormat.setSuffix(tabPlayer, null);

// Read current custom values (null if not set via API)
String customPrefix = tabFormat.getCustomPrefix(tabPlayer);

// Read original config values with placeholders resolved
String resolvedPrefix = tabFormat.getOriginalReplacedPrefix(tabPlayer);
String resolvedName = tabFormat.getOriginalReplacedName(tabPlayer);

// Read raw config values with placeholder identifiers
String rawPrefix = tabFormat.getOriginalRawPrefix(tabPlayer);
```

## Nametags (Above-Head Prefix/Suffix)

```java
import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.api.nametag.NameTagManager;

NameTagManager nameTagManager = TabAPI.getInstance().getNameTagManager();
if (nameTagManager == null) return; // feature disabled

// Set prefix/suffix (pass null to reset)
nameTagManager.setPrefix(tabPlayer, "&c[Owner] ");
nameTagManager.setSuffix(tabPlayer, " &4HP: 20");

// Hide nametag globally
nameTagManager.hideNameTag(tabPlayer);
nameTagManager.showNameTag(tabPlayer);

// Hide nametag only for a specific viewer
nameTagManager.hideNameTag(tabPlayer, viewerPlayer);
nameTagManager.showNameTag(tabPlayer, viewerPlayer);
boolean hiddenForViewer = nameTagManager.hasHiddenNameTag(tabPlayer, viewerPlayer);

// Collision control (null to reset to config default)
nameTagManager.setCollisionRule(tabPlayer, false);

// Pause team handling to let another plugin manage teams
nameTagManager.pauseTeamHandling(tabPlayer);
// Resume later
nameTagManager.resumeTeamHandling(tabPlayer);
boolean paused = nameTagManager.hasTeamHandlingPaused(tabPlayer);
```

## Scoreboard

```java
import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.api.scoreboard.Scoreboard;
import me.neznamy.tab.api.scoreboard.ScoreboardManager;

import java.util.Arrays;

ScoreboardManager sbManager = TabAPI.getInstance().getScoreboardManager();
if (sbManager == null) return; // feature disabled

// Create a custom scoreboard
Scoreboard scoreboard = sbManager.createScoreboard(
    "my_scoreboard",           // unique name
    "&6My Server",             // title
    Arrays.asList(             // lines (supports placeholders)
        "&aWelcome %player%",
        "",
        "&7Coins: &e%vault_eco_balance%",
        "&7Online: &b%online%",
        "",
        "&ewww.example.com"
    )
);

// Show it to a player (disables automatic scoreboard switching for that player)
sbManager.showScoreboard(tabPlayer, scoreboard);

// Reset back to config-defined scoreboard
sbManager.resetScoreboard(tabPlayer);

// Check if player has API-assigned scoreboard
boolean hasCustom = sbManager.hasCustomScoreboard(tabPlayer);

// Toggle visibility (second param = send toggle message)
sbManager.toggleScoreboard(tabPlayer, false);
sbManager.setScoreboardVisible(tabPlayer, true, false);
boolean visible = sbManager.hasScoreboardVisible(tabPlayer);

// Announce a config-defined scoreboard to all players for 10 seconds
sbManager.announceScoreboard("scoreboard_name", 10000);

// Modify scoreboard lines dynamically
scoreboard.setTitle("&cNew Title");
scoreboard.addLine("&7New line at bottom");
scoreboard.removeLine(0); // remove first line
scoreboard.getLines().get(0).setText("&aUpdated first line");

// Unregister when done
scoreboard.unregister();
```

## BossBar

```java
import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.api.bossbar.BossBar;
import me.neznamy.tab.api.bossbar.BossBarManager;
import me.neznamy.tab.api.bossbar.BarColor;
import me.neznamy.tab.api.bossbar.BarStyle;

BossBarManager bbManager = TabAPI.getInstance().getBossBarManager();
if (bbManager == null) return; // feature disabled

// Create with enum values
BossBar bar = bbManager.createBossBar("Welcome!", 1.0f, BarColor.BLUE, BarStyle.PROGRESS);

// Create with strings (supports placeholders for dynamic values)
BossBar dynamicBar = bbManager.createBossBar(
    "&aHP: %player_health%",   // title
    "%player_health_percent%", // progress (must evaluate to 0-1 float)
    "GREEN",                   // color string
    "PROGRESS"                 // style string
);

// Show/hide from specific players
bar.addPlayer(tabPlayer);
bar.removePlayer(tabPlayer);
boolean canSee = bar.containsPlayer(tabPlayer);

// Modify properties (string setters support placeholders)
bar.setTitle("&cNew Title");
bar.setProgress(0.5f);
bar.setColor(BarColor.RED);
bar.setStyle(BarStyle.NOTCHED_10);

// Toggle all bossbars for a player (second param = send toggle message)
bbManager.toggleBossBar(tabPlayer, false);
bbManager.setBossBarVisible(tabPlayer, true, false);
boolean barsVisible = bbManager.hasBossBarVisible(tabPlayer);

// Temporarily show a config-defined bossbar to one player (duration in ms)
bbManager.sendBossBarTemporarily(tabPlayer, "config_bar_name", 5000);

// Announce a config-defined bossbar to all players (duration in ms)
bbManager.announceBossBar("config_bar_name", 10000);

// Get a config-defined bossbar
BossBar configBar = bbManager.getBossBar("config_bar_name");

// Cleanup
bbManager.removeBossBar(bar);
```

BarColor values: `BLUE`, `GREEN`, `PINK`, `PURPLE`, `RED`, `WHITE`, `YELLOW`
BarStyle values: `PROGRESS`, `NOTCHED_6`, `NOTCHED_10`, `NOTCHED_12`, `NOTCHED_20`

## Layout (Fake Player Slots in Tablist)

```java
import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.api.tablist.layout.Layout;
import me.neznamy.tab.api.tablist.layout.LayoutManager;

LayoutManager layoutManager = TabAPI.getInstance().getLayoutManager();
if (layoutManager == null) return; // feature disabled

// Create a layout (80 slots, fills tablist with fake entries)
Layout layout = layoutManager.createNewLayout("my_layout");

// Create with custom slot count (1.19.3+ only)
Layout smallLayout = layoutManager.createNewLayout("small_layout", 20);

// Add fixed text slots (slot range: 1-80)
layout.addFixedSlot(1, "&6Server Info");
layout.addFixedSlot(2, "&7Online: &a%online%");
layout.addFixedSlot(3, "&7TPS: &a%tps%", "mineskin:some-uuid"); // with skin
layout.addFixedSlot(4, "&7Ping: &a%ping%ms", "player:Notch", 0); // skin + ping

// Add a player group (real players fill these slots)
// condition null = all players, or use condition name/short format from config
layout.addGroup(null, new int[]{21, 22, 23, 24, 25, 26, 27, 28, 29, 30});

// Conditional group (only players matching condition appear)
layout.addGroup("permission:vip", new int[]{41, 42, 43, 44, 45});

// Send layout to a player
layoutManager.sendLayout(tabPlayer, layout);

// Remove layout (player sees default tablist)
layoutManager.sendLayout(tabPlayer, null);

// Reset to config-defined layout
layoutManager.resetLayout(tabPlayer);

// Get a config-defined layout
Layout configLayout = layoutManager.getLayout("config_layout_name");
```

## Sorting (Team Name Control)

```java
import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.api.tablist.SortingManager;

SortingManager sortingManager = TabAPI.getInstance().getSortingManager();
if (sortingManager == null) return; // feature disabled

// Force a specific team name (controls sort position, triggers re-register)
sortingManager.forceTeamName(tabPlayer, "001_admin");

// Reset to default sorting
sortingManager.forceTeamName(tabPlayer, null);

// Check current forced team name (null if none)
String forced = sortingManager.getForcedTeamName(tabPlayer);

// Get the original team name from config
String original = sortingManager.getOriginalTeamName(tabPlayer);

// Change the group TAB uses for sorting this player
tabPlayer.setTemporaryGroup("vip");
tabPlayer.hasTemporaryGroup(); // true
tabPlayer.setTemporaryGroup(null); // reset
```

## Custom Placeholders

```java
import me.neznamy.tab.api.TabAPI;
import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.api.placeholder.PlaceholderManager;
import me.neznamy.tab.api.placeholder.PlayerPlaceholder;
import me.neznamy.tab.api.placeholder.ServerPlaceholder;
import me.neznamy.tab.api.placeholder.RelationalPlaceholder;

PlaceholderManager pm = TabAPI.getInstance().getPlaceholderManager();

// Server placeholder (global, same value for all players)
// Args: identifier, refresh interval ms (-1 = never refresh), supplier
ServerPlaceholder serverPh = pm.registerServerPlaceholder(
    "%server_time%", 1000, () -> String.valueOf(System.currentTimeMillis())
);

// Player placeholder (unique per player)
// Args: identifier, refresh interval ms (-1 = constant), function(TabPlayer)
PlayerPlaceholder playerPh = pm.registerPlayerPlaceholder(
    "%my_uuid%", -1, player -> player.getUniqueId().toString()
);

// Relational placeholder (depends on viewer-target pair, identifier must start with %rel_)
// Args: identifier, refresh interval ms, bifunction(viewer, target)
RelationalPlaceholder relPh = pm.registerRelationalPlaceholder(
    "%rel_can_see%", 1000, (viewer, target) -> {
        return String.valueOf(!target.isBedrockPlayer());
    }
);

// Force-update a placeholder value
playerPh.updateValue(tabPlayer, "custom_value");
serverPh.updateValue("new_global_value");

// Unregister
pm.unregisterPlaceholder(playerPh);
pm.unregisterPlaceholder("%server_time%");
```

## TabPlayer Properties

```java
import me.neznamy.tab.api.TabPlayer;

TabPlayer p = TabAPI.getInstance().getPlayer(uuid);
if (p == null) return;

String name = p.getName();
java.util.UUID id = p.getUniqueId();
String world = p.getWorld();          // current world name
String server = p.getServer();        // BungeeCord/Velocity server name
String group = p.getGroup();          // permission group TAB is using
boolean bedrock = p.isBedrockPlayer();// Floodgate/Geyser player
boolean loaded = p.isLoaded();        // true if fully loaded in TAB
Object handle = p.getPlayer();        // platform player object (Player on Bukkit)
```

## Vanish Integration

```java
import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.api.integration.VanishIntegration;

// Extend VanishIntegration to integrate a custom vanish plugin
public class MyVanish extends VanishIntegration {

    @Override
    public String getPlugin() {
        return "MyVanishPlugin";
    }

    @Override
    public boolean isVanished(TabPlayer player) {
        // return true if player is vanished
        return false;
    }

    @Override
    public boolean canSee(TabPlayer viewer, TabPlayer target) {
        // return true if viewer can see target
        return true;
    }
}

// Register it
MyVanish vanish = new MyVanish();
vanish.register();

// Unregister later
vanish.unregister();
```

---

## API Reference

### me.neznamy.tab.api.TabAPI
- `static TabAPI getInstance()`
- `TabPlayer getPlayer(UUID)` -- null if not loaded
- `TabPlayer getPlayer(String)` -- null if not found
- `TabPlayer[] getOnlinePlayers()`
- `EventBus getEventBus()`
- `BossBarManager getBossBarManager()` -- null if disabled
- `ScoreboardManager getScoreboardManager()` -- null if disabled
- `NameTagManager getNameTagManager()` -- null if disabled
- `TabListFormatManager getTabListFormatManager()` -- null if disabled
- `HeaderFooterManager getHeaderFooterManager()` -- null if disabled
- `LayoutManager getLayoutManager()` -- null if disabled
- `SortingManager getSortingManager()` -- null if disabled
- `PlaceholderManager getPlaceholderManager()`

### me.neznamy.tab.api.TabPlayer
- `String getName()` / `UUID getUniqueId()`
- `String getWorld()` / `String getServer()`
- `String getGroup()` / `void setTemporaryGroup(String)` / `boolean hasTemporaryGroup()`
- `Object getPlayer()` -- platform player object
- `boolean isBedrockPlayer()` / `boolean isLoaded()`

### me.neznamy.tab.api.tablist.HeaderFooterManager
- `void setHeader(TabPlayer, String)` / `void setFooter(TabPlayer, String)`
- `void setHeaderAndFooter(TabPlayer, String, String)`

### me.neznamy.tab.api.tablist.TabListFormatManager
- `void setPrefix(TabPlayer, String)` / `void setName(TabPlayer, String)` / `void setSuffix(TabPlayer, String)`
- `String getCustomPrefix(TabPlayer)` / `String getCustomName(TabPlayer)` / `String getCustomSuffix(TabPlayer)`
- `String getOriginalRawPrefix(TabPlayer)` / `String getOriginalRawName(TabPlayer)` / `String getOriginalRawSuffix(TabPlayer)`
- `String getOriginalReplacedPrefix(TabPlayer)` / `String getOriginalReplacedName(TabPlayer)` / `String getOriginalReplacedSuffix(TabPlayer)`

### me.neznamy.tab.api.tablist.SortingManager
- `void forceTeamName(TabPlayer, String)` / `String getForcedTeamName(TabPlayer)`
- `String getOriginalTeamName(TabPlayer)`

### me.neznamy.tab.api.tablist.layout.LayoutManager
- `Layout createNewLayout(String)` / `Layout createNewLayout(String, int)`
- `Layout getLayout(String)` -- null if not defined
- `void sendLayout(TabPlayer, Layout)` / `void resetLayout(TabPlayer)`

### me.neznamy.tab.api.tablist.layout.Layout
- `String getName()`
- `void addFixedSlot(int, String)` / `void addFixedSlot(int, String, String)` / `void addFixedSlot(int, String, int)` / `void addFixedSlot(int, String, String, int)` / `void addFixedSlot(int, String, String, String)`
- `void addGroup(String, int[])` -- condition (nullable) + slot indices

### me.neznamy.tab.api.nametag.NameTagManager
- `void setPrefix(TabPlayer, String)` / `void setSuffix(TabPlayer, String)`
- `String getCustomPrefix(TabPlayer)` / `String getCustomSuffix(TabPlayer)`
- `String getOriginalRawPrefix(TabPlayer)` / `String getOriginalRawSuffix(TabPlayer)`
- `String getOriginalReplacedPrefix(TabPlayer)` / `String getOriginalReplacedSuffix(TabPlayer)`
- `void hideNameTag(TabPlayer)` / `void hideNameTag(TabPlayer, TabPlayer)`
- `void showNameTag(TabPlayer)` / `void showNameTag(TabPlayer, TabPlayer)`
- `boolean hasHiddenNameTag(TabPlayer)` / `boolean hasHiddenNameTag(TabPlayer, TabPlayer)`
- `void setCollisionRule(TabPlayer, Boolean)` / `Boolean getCollisionRule(TabPlayer)`
- `void pauseTeamHandling(TabPlayer)` / `void resumeTeamHandling(TabPlayer)` / `boolean hasTeamHandlingPaused(TabPlayer)`

### me.neznamy.tab.api.scoreboard.ScoreboardManager
- `Scoreboard createScoreboard(String, String, List<String>)`
- `void showScoreboard(TabPlayer, Scoreboard)` / `void resetScoreboard(TabPlayer)`
- `boolean hasCustomScoreboard(TabPlayer)`
- `void toggleScoreboard(TabPlayer, boolean)` / `void setScoreboardVisible(TabPlayer, boolean, boolean)` / `boolean hasScoreboardVisible(TabPlayer)`
- `void announceScoreboard(String, int)` -- name + duration ms
- `Scoreboard getActiveScoreboard(TabPlayer)`
- `Map getRegisteredScoreboards()`
- `void removeScoreboard(String)` / `void removeScoreboard(Scoreboard)`

### me.neznamy.tab.api.scoreboard.Scoreboard
- `String getName()` / `String getTitle()` / `void setTitle(String)`
- `List<Line> getLines()` / `void addLine(String)` / `void removeLine(int)`
- `void unregister()`

### me.neznamy.tab.api.scoreboard.Line
- `String getText()` / `void setText(String)`

### me.neznamy.tab.api.bossbar.BossBarManager
- `BossBar createBossBar(String, float, BarColor, BarStyle)` / `BossBar createBossBar(String, String, String, String)`
- `BossBar getBossBar(String)` / `Map getRegisteredBossBars()`
- `void toggleBossBar(TabPlayer, boolean)` / `void setBossBarVisible(TabPlayer, boolean, boolean)` / `boolean hasBossBarVisible(TabPlayer)`
- `void sendBossBarTemporarily(TabPlayer, String, int)` / `void announceBossBar(String, int)`
- `void removeBossBar(String)` / `void removeBossBar(BossBar)`

### me.neznamy.tab.api.bossbar.BossBar
- `String getName()` / `UUID getUniqueId()`
- `String getTitle()` / `void setTitle(String)`
- `String getProgress()` / `void setProgress(String)` / `void setProgress(float)`
- `String getColor()` / `void setColor(String)` / `void setColor(BarColor)`
- `String getStyle()` / `void setStyle(String)` / `void setStyle(BarStyle)`
- `void addPlayer(TabPlayer)` / `void removePlayer(TabPlayer)` / `boolean containsPlayer(TabPlayer)` / `List getPlayers()`

### me.neznamy.tab.api.bossbar.BarColor
Enum: `BLUE`, `GREEN`, `PINK`, `PURPLE`, `RED`, `WHITE`, `YELLOW`

### me.neznamy.tab.api.bossbar.BarStyle
Enum: `PROGRESS`, `NOTCHED_6`, `NOTCHED_10`, `NOTCHED_12`, `NOTCHED_20`

### me.neznamy.tab.api.placeholder.PlaceholderManager
- `ServerPlaceholder registerServerPlaceholder(String, int, Supplier)`
- `PlayerPlaceholder registerPlayerPlaceholder(String, int, Function<TabPlayer, Object>)`
- `RelationalPlaceholder registerRelationalPlaceholder(String, int, BiFunction<TabPlayer, TabPlayer, Object>)`
- `Placeholder getPlaceholder(String)` / `void unregisterPlaceholder(Placeholder)` / `void unregisterPlaceholder(String)`

### me.neznamy.tab.api.placeholder.PlayerPlaceholder
- `void updateValue(TabPlayer, String)` / `void update(TabPlayer)`

### me.neznamy.tab.api.placeholder.ServerPlaceholder
- `void updateValue(String)` / `void update()`

### me.neznamy.tab.api.placeholder.RelationalPlaceholder
- `void updateValue(TabPlayer, TabPlayer, String)` / `void update(TabPlayer, TabPlayer)`

### me.neznamy.tab.api.event.EventBus
- `void register(Class<T>, EventHandler<T>)` / `void register(Object)` -- annotation-based
- `void unregister(EventHandler)` / `void unregister(Object)`

### Event Classes
- `me.neznamy.tab.api.event.player.PlayerLoadEvent` -- `TabPlayer getPlayer()`, `boolean isJoin()`
- `me.neznamy.tab.api.event.plugin.TabLoadEvent` -- no methods (marker event)
- `me.neznamy.tab.api.event.plugin.PlaceholderRegisterEvent` -- `String getIdentifier()`, `void setPlayerPlaceholder(Function)`, `void setServerPlaceholder(Supplier)`, `void setRelationalPlaceholder(BiFunction)`

### me.neznamy.tab.api.integration.VanishIntegration (abstract)
- `abstract boolean isVanished(TabPlayer)` / `abstract boolean canSee(TabPlayer, TabPlayer)` / `abstract String getPlugin()`
- `void register()` / `void unregister()`
