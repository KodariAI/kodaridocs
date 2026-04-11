# BedWars1058 API Reference

BedWars1058 is an open-source Minecraft BedWars minigame plugin by andrei1058. Players defend their bed and destroy enemy beds. The API is in the `com.andrei1058.bedwars.api` package. Access is via Bukkit's ServicesManager. Add `softdepend: [BedWars1058]` to your plugin.yml.

---

## Code Examples

### Get the API Instance

```java
import com.andrei1058.bedwars.api.BedWars;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

RegisteredServiceProvider<BedWars> reg = Bukkit.getServicesManager().getRegistration(BedWars.class);
if (reg == null) {
    getLogger().severe("BedWars1058 not found!");
    Bukkit.getPluginManager().disablePlugin(this);
    return;
}
BedWars api = reg.getProvider();
```

### Check if a Player is in a Game

```java
import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.arena.IArena;
import org.bukkit.entity.Player;

// Check playing or spectating
boolean inGame = api.getArenaUtil().isPlaying(player);
boolean spectating = api.getArenaUtil().isSpectating(player);

// Get the arena a player is in (returns null if not in any)
IArena arena = api.getArenaUtil().getArenaByPlayer(player);
if (arena != null) {
    String arenaName = arena.getArenaName();
    int playerCount = arena.getPlayers().size();
}
```

### Get Arena by Name and Query State

```java
import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.arena.GameState;

IArena arena = api.getArenaUtil().getArenaByName("MyArena");
if (arena != null) {
    GameState state = arena.getStatus(); // waiting, starting, playing, restarting
    if (state == GameState.playing) {
        // Game is live
    }
}
```

### List All Arenas

```java
import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.arena.IArena;
import java.util.LinkedList;

LinkedList<IArena> arenas = api.getArenaUtil().getArenas();
for (IArena arena : arenas) {
    getLogger().info(arena.getArenaName() + " - " + arena.getStatus() + " - " + arena.getPlayers().size() + " players");
}
```

### Get a Player's Team

```java
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.arena.team.ITeam;
import org.bukkit.entity.Player;

IArena arena = api.getArenaUtil().getArenaByPlayer(player);
if (arena != null) {
    ITeam team = arena.getTeam(player);
    if (team != null) {
        String teamName = team.getName();
        boolean bedGone = team.isBedDestroyed();
        int members = team.getMembers().size();
    }
}
```

### Listen for Player Kill Events

```java
import com.andrei1058.bedwars.api.events.player.PlayerKillEvent;
import com.andrei1058.bedwars.api.arena.team.ITeam;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class KillListener implements Listener {

    @EventHandler
    public void onKill(PlayerKillEvent e) {
        Player victim = e.getVictim();
        Player killer = e.getKiller(); // may be null
        boolean finalKill = e.getCause().isFinalKill();

        if (killer != null && finalKill) {
            killer.sendMessage("Final kill on " + victim.getName() + "!");
        }
    }
}
```

### Listen for Bed Break Events

```java
import com.andrei1058.bedwars.api.events.player.PlayerBedBreakEvent;
import com.andrei1058.bedwars.api.arena.team.ITeam;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BedBreakListener implements Listener {

    @EventHandler
    public void onBedBreak(PlayerBedBreakEvent e) {
        Player breaker = e.getPlayer();
        ITeam victimTeam = e.getVictimTeam();
        ITeam breakerTeam = e.getPlayerTeam();
        // e.setMessage(Function<Player, String>) to change broadcast message
        // e.setTitle(Function<Player, String>) to change title
    }
}
```

### Listen for Game State Changes

```java
import com.andrei1058.bedwars.api.events.gameplay.GameStateChangeEvent;
import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class GameListener implements Listener {

    @EventHandler
    public void onStateChange(GameStateChangeEvent e) {
        IArena arena = e.getArena();
        GameState oldState = e.getOldState();
        GameState newState = e.getNewState();

        if (newState == GameState.playing) {
            // Game just started in this arena
        }
    }
}
```

### Listen for Game End

```java
import com.andrei1058.bedwars.api.events.gameplay.GameEndEvent;
import com.andrei1058.bedwars.api.arena.team.ITeam;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class GameEndListener implements Listener {

    @EventHandler
    public void onGameEnd(GameEndEvent e) {
        ITeam winnerTeam = e.getTeamWinner();
        java.util.List<Player> winners = e.getWinners();       // all winner UUIDs that were in team
        java.util.List<Player> aliveWinners = e.getAliveWinners(); // still alive at end
        java.util.List<Player> losers = e.getLosers();
    }
}
```

### Cancel a Shop Purchase

```java
import com.andrei1058.bedwars.api.events.shop.ShopBuyEvent;
import com.andrei1058.bedwars.api.arena.shop.ICategoryContent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ShopListener implements Listener {

    @EventHandler
    public void onShopBuy(ShopBuyEvent e) {
        Player buyer = e.getBuyer();
        ICategoryContent content = e.getCategoryContent();
        String itemId = content.getIdentifier();

        if (itemId.equals("some-restricted-item")) {
            e.setCancelled(true);
            buyer.sendMessage("You cannot buy this item!");
        }
    }
}
```

### Register a Custom /bw Subcommand

```java
import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MyCommand extends SubCommand {

    public MyCommand(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(14);
        showInList(true);
        setOpCommand(false);
        setArenaSetupCommand(false);
    }

    @Override
    public boolean execute(String[] args, CommandSender sender) {
        if (!(sender instanceof Player)) return false;
        Player p = (Player) sender;
        p.sendMessage("Hello from custom BedWars command!");
        return true;
    }
}

// In your onEnable():
// BedWars api = ...;
// new MyCommand(api.getBedWarsCommand(), "mycommand");
// Usage: /bw mycommand
```

### Get Player Stats

```java
import com.andrei1058.bedwars.api.BedWars;
import java.util.UUID;

UUID uuid = player.getUniqueId();
BedWars.IStats stats = api.getStatsUtil();

int wins = stats.getPlayerWins(uuid);
int kills = stats.getPlayerKills(uuid);
int finalKills = stats.getPlayerFinalKills(uuid);
int deaths = stats.getPlayerDeaths(uuid);
int bedsDestroyed = stats.getPlayerBedsDestroyed(uuid);
int gamesPlayed = stats.getPlayerGamesPlayed(uuid);
```

### Register a Custom Level Adapter

```java
import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.levels.Level;
import com.andrei1058.bedwars.api.events.player.PlayerXpGainEvent;
import org.bukkit.entity.Player;

public class MyLevelAdapter implements Level {

    @Override
    public String getLevel(Player p) { return "[5]"; }

    @Override
    public int getPlayerLevel(Player p) { return 5; }

    @Override
    public String getProgressBar(Player p) { return "||||------"; }

    @Override
    public int getCurrentXp(Player p) { return 100; }

    @Override
    public String getCurrentXpFormatted(Player p) { return "100"; }

    @Override
    public int getRequiredXp(Player p) { return 500; }

    @Override
    public String getRequiredXpFormatted(Player p) { return "500"; }

    @Override
    public void addXp(Player p, int amount, PlayerXpGainEvent.XpSource source) { }

    @Override
    public void setXp(Player p, int amount) { }

    @Override
    public void setLevel(Player p, int level) { }
}

// In your onEnable():
// api.setLevelAdapter(new MyLevelAdapter());
```

### Full Addon Plugin Template

```java
import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.events.player.PlayerJoinArenaEvent;
import com.andrei1058.bedwars.api.events.player.PlayerLeaveArenaEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class MyBedWarsAddon extends JavaPlugin implements Listener {

    private BedWars api;

    @Override
    public void onEnable() {
        RegisteredServiceProvider<BedWars> reg = Bukkit.getServicesManager().getRegistration(BedWars.class);
        if (reg == null) {
            getLogger().severe("BedWars1058 not found! Disabling...");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }
        api = reg.getProvider();

        // Addon configs go in: plugins/BedWars1058/Addons/MyBedWarsAddon/
        // api.getAddonsPath() returns that base directory

        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("MyBedWarsAddon enabled!");
    }

    @EventHandler
    public void onJoin(PlayerJoinArenaEvent e) {
        if (e.isCancelled()) return;
        Player p = e.getPlayer();
        IArena arena = e.getArena();
        p.sendMessage("Welcome to " + arena.getArenaName() + "!");
    }

    @EventHandler
    public void onLeave(PlayerLeaveArenaEvent e) {
        Player p = e.getPlayer();
        p.sendMessage("You left the game!");
    }
}
```

---

## API Reference

### Main API -- `com.andrei1058.bedwars.api.BedWars` (interface)

| Method | Returns | Description |
|---|---|---|
| `getArenaUtil()` | `BedWars.ArenaUtil` | Arena management |
| `getStatsUtil()` | `BedWars.IStats` | Player statistics |
| `getShopUtil()` | `BedWars.ShopUtil` | Shop/currency utilities |
| `getTeamUpgradesUtil()` | `BedWars.TeamUpgradesUtil` | Team upgrades |
| `getAFKUtil()` | `BedWars.AFKUtil` | AFK detection |
| `getScoreboardUtil()` | `BedWars.ScoreboardUtil` | Sidebar management |
| `getScoreboardManager()` | `ISidebarService` | Sidebar service |
| `getBedWarsCommand()` | `ParentCommand` | Register subcommands |
| `getConfigs()` | `BedWars.Configs` | Config file access |
| `getVersionSupport()` | `VersionSupport` | NMS version layer |
| `getRestoreAdapter()` | `RestoreAdapter` | World restore system |
| `setRestoreAdapter(RestoreAdapter)` | `void` | Replace restore system |
| `setLevelAdapter(Level)` | `void` | Replace level system |
| `getLevelsUtil()` | `Level` | Current level adapter |
| `getPartyUtil()` | `Party` | Party system |
| `setPartyAdapter(Party)` | `void` | Replace party system |
| `getDefaultLang()` | `Language` | Default language |
| `getPlayerLanguage(Player)` | `Language` | Player's language |
| `getLanguageByIso(String)` | `Language` | Language by ISO code |
| `getLangIso(Player)` | `String` | Player's language ISO |
| `getAddonsPath()` | `File` | Addons config folder |
| `getLobbyWorld()` | `String` | Lobby world name |
| `getServerType()` | `ServerType` | BUNGEE, MULTIARENA, or SHARED |
| `isAutoScale()` | `boolean` | Auto-scale enabled |
| `isShuttingDown()` | `boolean` | Server shutting down |
| `getSetupSession(UUID)` | `ISetupSession` | Active setup session |
| `isInSetupSession(UUID)` | `boolean` | Player in setup mode |

### ArenaUtil -- `com.andrei1058.bedwars.api.BedWars.ArenaUtil` (interface)

| Method | Returns | Description |
|---|---|---|
| `getArenaByPlayer(Player)` | `IArena` | Get arena player is in (null if none) |
| `getArenaByName(String)` | `IArena` | Get arena by name |
| `getArenaByIdentifier(String)` | `IArena` | Get arena by identifier |
| `getArenas()` | `LinkedList<IArena>` | All loaded arenas |
| `isPlaying(Player)` | `boolean` | Player is in active game |
| `isSpectating(Player)` | `boolean` | Player is spectating |
| `joinRandomArena(Player)` | `boolean` | Join random available arena |
| `joinRandomFromGroup(Player, String)` | `boolean` | Join random from group |
| `vipJoin(Player)` | `boolean` | VIP priority join |
| `getPlayers(String)` | `int` | Player count in group |
| `loadArena(String, Player)` | `void` | Load arena from config |
| `getGamesBeforeRestart()` | `int` | Games until server restart |
| `setGamesBeforeRestart(int)` | `void` | Set restart threshold |
| `sendLobbyCommandItems(Player)` | `void` | Give lobby items |

### IArena -- `com.andrei1058.bedwars.api.arena.IArena` (interface)

| Method | Returns | Description |
|---|---|---|
| `getArenaName()` | `String` | Arena name |
| `getWorldName()` | `String` | World name |
| `getWorld()` | `World` | Bukkit world |
| `getStatus()` | `GameState` | Current game state |
| `getGroup()` | `String` | Arena group name |
| `getDisplayName()` | `String` | Display name |
| `getPlayers()` | `List<Player>` | Active players |
| `getSpectators()` | `List<Player>` | Spectators |
| `getTeams()` | `List<ITeam>` | All teams |
| `getTeam(Player)` | `ITeam` | Player's team |
| `getTeam(String)` | `ITeam` | Team by name |
| `getExTeam(UUID)` | `ITeam` | Team player was on (after elimination) |
| `getOreGenerators()` | `List<IGenerator>` | Map generators (diamond/emerald) |
| `getNextEvent()` | `NextEvent` | Next scheduled event |
| `getMaxPlayers()` | `int` | Max player count |
| `getMaxInTeam()` | `int` | Max per team |
| `isPlayer(Player)` | `boolean` | Is active player |
| `isSpectator(Player)` | `boolean` | Is spectating |
| `addPlayer(Player, boolean)` | `boolean` | Add player (boolean = spectator) |
| `removePlayer(Player, boolean)` | `void` | Remove player |
| `addSpectator(Player, boolean, Location)` | `boolean` | Add spectator |
| `reJoin(Player)` | `boolean` | Rejoin after disconnect |
| `isBlockPlaced(Block)` | `boolean` | Is player-placed block |
| `addPlacedBlock(Block)` | `void` | Track placed block |
| `getWinner()` | `ITeam` | Winning team |
| `updateNextEvent()` | `void` | Progress to next event |
| `getConfig()` | `ConfigManager` | Arena config |
| `getStatsHolder()` | `GameStatsHolder` | In-game stats tracker |

### ITeam -- `com.andrei1058.bedwars.api.arena.team.ITeam` (interface)

| Method | Returns | Description |
|---|---|---|
| `getName()` | `String` | Team name |
| `getColor()` | `TeamColor` | Team color enum |
| `getDisplayName(Language)` | `String` | Localized display name |
| `getMembers()` | `List<Player>` | Living members |
| `getMembersCache()` | `List<Player>` | All members ever assigned |
| `getArena()` | `IArena` | Parent arena |
| `isBedDestroyed()` | `boolean` | Bed status |
| `isMember(Player)` | `boolean` | Is current member |
| `wasMember(UUID)` | `boolean` | Was ever on this team |
| `getGenerators()` | `List<IGenerator>` | Team generators |
| `getIronGenerator()` | `IGenerator` | Iron generator |
| `getGoldGenerator()` | `IGenerator` | Gold generator |
| `getEmeraldGenerator()` | `IGenerator` | Emerald generator (if exists) |
| `getBed()` | `Location` | Bed location |
| `getSpawn()` | `Location` | Team spawn |
| `getShop()` | `Location` | Shop NPC location |
| `getTeamUpgrades()` | `Location` | Upgrades NPC location |
| `getTeamUpgradeTiers()` | `ConcurrentHashMap` | Purchased upgrade tiers |
| `getActiveTraps()` | `LinkedList` | Active traps |
| `getDragons()` | `int` | Dragon count (sudden death) |
| `getSize()` | `int` | Current member count |
| `addSwordEnchantment(Enchantment, int)` | `void` | Add sword enchant to team |
| `addBowEnchantment(Enchantment, int)` | `void` | Add bow enchant to team |
| `addArmorEnchantment(Enchantment, int)` | `void` | Add armor enchant to team |
| `addBaseEffect(PotionEffectType, int, int)` | `void` | Add base potion effect |
| `addTeamEffect(PotionEffectType, int, int)` | `void` | Add team potion effect |
| `respawnMember(Player)` | `void` | Force respawn |
| `firstSpawn(Player)` | `void` | Initial spawn |
| `sendDefaultInventory(Player, boolean)` | `void` | Give default items |
| `sendArmor(Player)` | `void` | Give team armor |
| `onBedDestroy(Location)` | `void` | Trigger bed destroy |
| `setBedDestroyed(boolean)` | `void` | Set bed status |

### IStats -- `com.andrei1058.bedwars.api.BedWars.IStats` (interface)

All methods take `UUID` parameter:

| Method | Returns |
|---|---|
| `getPlayerWins(UUID)` | `int` |
| `getPlayerLoses(UUID)` | `int` |
| `getPlayerKills(UUID)` | `int` |
| `getPlayerTotalKills(UUID)` | `int` |
| `getPlayerFinalKills(UUID)` | `int` |
| `getPlayerDeaths(UUID)` | `int` |
| `getPlayerFinalDeaths(UUID)` | `int` |
| `getPlayerBedsDestroyed(UUID)` | `int` |
| `getPlayerGamesPlayed(UUID)` | `int` |
| `getPlayerFirstPlay(UUID)` | `Timestamp` |
| `getPlayerLastPlay(UUID)` | `Timestamp` |

### Enums

**`com.andrei1058.bedwars.api.arena.GameState`**: `waiting`, `starting`, `playing`, `restarting`

**`com.andrei1058.bedwars.api.arena.NextEvent`**: `DIAMOND_GENERATOR_TIER_II`, `DIAMOND_GENERATOR_TIER_III`, `EMERALD_GENERATOR_TIER_II`, `EMERALD_GENERATOR_TIER_III`, `BEDS_DESTROY`, `ENDER_DRAGON`, `GAME_END`

**`com.andrei1058.bedwars.api.arena.team.TeamColor`**: RED, BLUE, GREEN, YELLOW, AQUA, WHITE, PINK, GRAY. Key methods: `chat()` returns ChatColor, `dye()` returns DyeColor, `woolMaterial()`, `glassMaterial()`, `glassPaneMaterial()`, `bedMaterial()`, `glazedTerracottaMaterial()`, `bukkitColor()`.

**`com.andrei1058.bedwars.api.server.ServerType`**: `BUNGEE`, `MULTIARENA`, `SHARED`

**`com.andrei1058.bedwars.api.events.player.PlayerKillEvent.PlayerKillCause`**: `UNKNOWN`, `UNKNOWN_FINAL_KILL`, `EXPLOSION`, `EXPLOSION_FINAL_KILL`, `VOID`, `VOID_FINAL_KILL`, `PVP`, `PVP_FINAL_KILL`, `PLAYER_SHOOT`, `PLAYER_SHOOT_FINAL_KILL`, `SILVERFISH`, `SILVERFISH_FINAL_KILL`, `IRON_GOLEM`, `IRON_GOLEM_FINAL_KILL`, `PLAYER_PUSH`, `PLAYER_PUSH_FINAL`, `PLAYER_DISCONNECT`, `PLAYER_DISCONNECT_FINAL`. Key methods: `isFinalKill()`, `isDespawnable()`, `isPvpLogOut()`.

### Events Quick Reference

All events extend `org.bukkit.event.Event`. Cancellable events implement `Cancellable`.

**Gameplay** (`com.andrei1058.bedwars.api.events.gameplay`):

| Event | Key Methods | Cancellable |
|---|---|---|
| `GameStateChangeEvent` | `getArena()`, `getOldState()`, `getNewState()` | No |
| `GameEndEvent` | `getArena()`, `getTeamWinner()`, `getWinners()`, `getLosers()`, `getAliveWinners()` | No |
| `TeamAssignEvent` | `getPlayer()`, `getTeam()`, `getArena()` | Yes |
| `NextEventChangeEvent` | `getArena()`, `getOldEvent()`, `getNewEvent()` | No |
| `GeneratorUpgradeEvent` | `getGenerator()` | No |
| `EggBridgeThrowEvent` | `getPlayer()`, `getArena()` | Yes |
| `EggBridgeBuildEvent` | `getBlock()`, `getTeamColor()`, `getArena()` | No |

**Player** (`com.andrei1058.bedwars.api.events.player`):

| Event | Key Methods | Cancellable |
|---|---|---|
| `PlayerJoinArenaEvent` | `getPlayer()`, `getArena()`, `isSpectator()` | Yes |
| `PlayerLeaveArenaEvent` | `getPlayer()`, `getArena()`, `isSpectator()`, `getLastDamager()` | No |
| `PlayerReJoinEvent` | `getPlayer()`, `getArena()`, `getRespawnTime()`, `setRespawnTime(int)` | Yes |
| `PlayerKillEvent` | `getVictim()`, `getKiller()`, `getCause()`, `getArena()`, `getKillerTeam()`, `getVictimTeam()`, `setMessage(Function)` | No |
| `PlayerBedBreakEvent` | `getPlayer()`, `getPlayerTeam()`, `getVictimTeam()`, `getArena()`, `setMessage(Function)`, `setTitle(Function)` | No |
| `PlayerFirstSpawnEvent` | `getPlayer()`, `getTeam()`, `getArena()` | No |
| `PlayerReSpawnEvent` | `getPlayer()`, `getTeam()`, `getArena()` | No |
| `PlayerBaseEnterEvent` | `getPlayer()`, `getTeam()` | No |
| `PlayerBaseLeaveEvent` | `getPlayer()`, `getTeam()` | No |
| `PlayerGeneratorCollectEvent` | `getPlayer()`, `getArena()`, `getItem()`, `getItemStack()` | Yes |
| `PlayerAfkEvent` | `getPlayer()`, `getAfkType()` | No |
| `PlayerInvisibilityPotionEvent` | `getPlayer()`, `getTeam()`, `getArena()`, `getType()` | No |
| `PlayerBedBugSpawnEvent` | `getPlayer()`, `getPlayerTeam()`, `getArena()` | No |
| `PlayerDreamDefenderSpawnEvent` | `getPlayer()`, `getPlayerTeam()`, `getArena()` | No |
| `PlayerXpGainEvent` | `getPlayer()`, `getAmount()`, `getXpSource()` | No |
| `PlayerLevelUpEvent` | `getPlayer()`, `getNewLevel()`, `getNewXpTarget()` | No |
| `PlayerLangChangeEvent` | `getPlayer()`, `getOldLang()`, `getNewLang()` | Yes |

**Server** (`com.andrei1058.bedwars.api.events.server`):

| Event | Key Methods | Cancellable |
|---|---|---|
| `ArenaEnableEvent` | `getArena()` | No |
| `ArenaDisableEvent` | `getArenaName()`, `getWorldName()` | No |
| `ArenaRestartEvent` | `getArenaName()`, `getWorldName()` | No |
| `SetupSessionStartEvent` | `getSetupSession()` | No |
| `SetupSessionCloseEvent` | `getSetupSession()` | No |

**Shop** (`com.andrei1058.bedwars.api.events.shop`):

| Event | Key Methods | Cancellable |
|---|---|---|
| `ShopBuyEvent` | `getBuyer()`, `getCategoryContent()`, `getArena()` | Yes |
| `ShopOpenEvent` | `getPlayer()`, `getArena()` | Yes |

**Team** (`com.andrei1058.bedwars.api.events.team`):

| Event | Key Methods | Cancellable |
|---|---|---|
| `TeamEliminatedEvent` | `getTeam()`, `getArena()` | No |

**Upgrades** (`com.andrei1058.bedwars.api.events.upgrades`):

| Event | Key Methods | Cancellable |
|---|---|---|
| `UpgradeBuyEvent` | `getPlayer()`, `getTeam()`, `getArena()`, `getTeamUpgrade()` | Yes |

**Spectator** (`com.andrei1058.bedwars.api.events.spectator`):

| Event | Key Methods | Cancellable |
|---|---|---|
| `SpectatorFirstPersonEnterEvent` | `getSpectator()`, `getTarget()`, `getArena()`, `setTitle(Function)` | Yes |
| `SpectatorFirstPersonLeaveEvent` | `getSpectator()`, `getArena()`, `setTitle(Function)` | No |
| `SpectatorTeleportToPlayerEvent` | `getSpectator()`, `getTarget()`, `getArena()` | Yes |

**Sidebar** (`com.andrei1058.bedwars.api.events.sidebar`):

| Event | Key Methods | Cancellable |
|---|---|---|
| `PlayerSidebarInitEvent` | `getPlayer()`, `getSidebar()`, `setSidebar(ISidebar)` | Yes |

### IGenerator -- `com.andrei1058.bedwars.api.arena.generator.IGenerator` (interface)

| Method | Returns | Description |
|---|---|---|
| `getArena()` | `IArena` | Parent arena |
| `getBwt()` | `ITeam` | Owning team (null for map generators) |
| `getType()` | `GeneratorType` | DIAMOND, EMERALD, GOLD, IRON, CUSTOM |
| `getOre()` | `ItemStack` | Item being spawned |
| `setOre(ItemStack)` | `void` | Change spawn item |
| `getLocation()` | `Location` | Generator location |
| `getDelay()` | `int` | Spawn delay in seconds |
| `setDelay(int)` | `void` | Set spawn delay |
| `getAmount()` | `int` | Items per spawn |
| `setAmount(int)` | `void` | Set items per spawn |
| `getSpawnLimit()` | `int` | Max items before pausing |
| `setSpawnLimit(int)` | `void` | Set spawn limit |
| `getNextSpawn()` | `int` | Seconds until next drop |
| `setNextSpawn(int)` | `void` | Set next spawn timer |
| `isStack()` | `boolean` | Stack dropped items |
| `setStack(boolean)` | `void` | Set stacking |
| `upgrade()` | `void` | Upgrade generator tier |
| `spawn()` | `void` | Force spawn items |
| `dropItem(Location)` | `void` | Drop item at location |
| `disable()` | `void` | Disable generator |
| `enableRotation()` | `void` | Enable item rotation |
| `rotate()` | `void` | Rotate display item |
| `destroyData()` | `void` | Clean up on restart |

### Language -- `com.andrei1058.bedwars.api.language.Language`

| Method | Returns | Description |
|---|---|---|
| `static getMsg(Player, String)` | `String` | Get translated message for player |
| `static getList(Player, String)` | `List<String>` | Get translated list |
| `static getPlayerLanguage(Player)` | `Language` | Player's language object |
| `static getPlayerLanguage(UUID)` | `Language` | Player's language by UUID |
| `static getLanguages()` | `List<Language>` | All loaded languages |
| `static getDefaultLanguage()` | `Language` | Default language |
| `static setPlayerLanguage(UUID, String)` | `boolean` | Set player language by ISO |
| `static getLang(String)` | `Language` | Get language by ISO |
| `m(String)` | `String` | Get message from this language |
| `l(String)` | `List<String>` | Get list from this language |
| `getIso()` | `String` | Language ISO code |

### ShopUtil -- `com.andrei1058.bedwars.api.BedWars.ShopUtil` (interface)

| Method | Returns | Description |
|---|---|---|
| `calculateMoney(Player, Material)` | `int` | Count currency in inventory |
| `takeMoney(Player, Material, int)` | `void` | Remove currency from inventory |
| `getCurrency(String)` | `Material` | Get currency material by name |
| `getCurrencyColor(Material)` | `ChatColor` | Color for currency type |
| `getRomanNumber(int)` | `String` | Integer to Roman numeral |

### AFKUtil -- `com.andrei1058.bedwars.api.BedWars.AFKUtil` (interface)

| Method | Returns | Description |
|---|---|---|
| `isPlayerAFK(Player)` | `boolean` | Check AFK status |
| `setPlayerAFK(Player, boolean)` | `void` | Set AFK status |
| `getPlayerTimeAFK(Player)` | `int` | Seconds player has been AFK |

### Configs -- `com.andrei1058.bedwars.api.BedWars.Configs` (interface)

| Method | Returns | Description |
|---|---|---|
| `getMainConfig()` | `ConfigManager` | Main plugin config |
| `getGeneratorsConfig()` | `ConfigManager` | Generators config |
| `getShopConfig()` | `ConfigManager` | Shop config |
| `getSignsConfig()` | `ConfigManager` | Join signs config |
| `getUpgradesConfig()` | `ConfigManager` | Upgrades config |

### ConfigManager -- `com.andrei1058.bedwars.api.configuration.ConfigManager`

| Method | Returns | Description |
|---|---|---|
| `getYml()` | `YamlConfiguration` | Raw YAML access |
| `getString(String)` | `String` | Get string value |
| `getInt(String)` | `int` | Get int value |
| `getDouble(String)` | `double` | Get double value |
| `getBoolean(String)` | `boolean` | Get boolean value |
| `getList(String)` | `List` | Get list value |
| `set(String, Object)` | `void` | Set config value |
| `save()` | `void` | Save to disk |
| `reload()` | `void` | Reload from disk |
