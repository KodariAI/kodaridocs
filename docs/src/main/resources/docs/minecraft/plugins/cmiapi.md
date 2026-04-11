# CMI API

Server management plugin API for economy, homes, warps, kits, vanish, AFK, holograms, tablist, and more. Access via `CMI.getInstance()` and its manager getters.

## Getting the CMI Instance and a CMIUser

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.PlayerManager;
import org.bukkit.entity.Player;

// Get the CMI plugin instance
CMI cmi = CMI.getInstance();

// Get a CMIUser from an online player
CMIUser user = cmi.getPlayerManager().getUser(player);
// IMPORTANT: can return null - always check
if (user == null) return;

// Get CMIUser by UUID (works for offline players too)
CMIUser offlineUser = cmi.getPlayerManager().getUser(uuid);

// Static shorthand (also nullable)
CMIUser user2 = CMIUser.getUser(player);
CMIUser user3 = CMIUser.getUser(uuid);
```

## Economy

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Economy.EconomyManager;
import org.bukkit.entity.Player;

CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user == null) return;

// Check balance
Double balance = user.getBalance();
String formatted = user.getFormatedBalance();

// Check if player has enough money
boolean canAfford = user.hasMoney(100.0);

// Deposit money (returns new balance)
Double newBal = user.deposit(500.0);

// Withdraw money (returns new balance)
Double afterWithdraw = user.withdraw(100.0);

// Deposit with source tracking
CMIUser sourceUser = CMI.getInstance().getPlayerManager().getUser(otherPlayer);
user.deposit(250.0, sourceUser);

// World-specific economy (if multi-world economy enabled)
Double worldBal = user.getBalance("world_nether");
user.deposit("world_nether", 100.0);
user.withdraw("world_nether", 50.0);

// Format any money value
EconomyManager econManager = CMI.getInstance().getEconomyManager();
String prettyMoney = econManager.format(1234.56);

// Balance top
java.util.SortedMap<Double, java.util.UUID> balTop = econManager.getBalTopMap();
int place = econManager.getBalTopPlace(player.getUniqueId());
```

## Listen for Balance Changes

```java
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.events.CMIUserBalanceChangeEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EconomyListener implements Listener {
    @EventHandler
    public void onBalanceChange(CMIUserBalanceChangeEvent event) {
        CMIUser user = event.getUser();
        double from = event.getFrom();
        double to = event.getTo();
        String actionType = event.getActionType(); // "setBalance", "Withdraw", "Deposit"
        CMIUser source = event.getSource(); // who initiated it (nullable)

        // Cancel to prevent the transaction
        if (to < 0) {
            event.setCancelled(true);
        }
    }
}
```

## Homes

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Homes.CmiHome;
import com.Zrips.CMI.Modules.Homes.HomeManager;
import net.Zrips.CMILib.Container.CMILocation;
import org.bukkit.entity.Player;
import java.util.LinkedHashMap;

CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user == null) return;

// Get all homes
LinkedHashMap<String, CmiHome> homes = user.getHomes();

// Get a specific home by name
CmiHome home = user.getHome("mybase");
if (home != null) {
    CMILocation loc = home.getLoc();
    boolean isPrivate = home.isPrivate();
    boolean isBed = home.isBed();
    boolean isFavorite = home.isFavorite();
}

// Get home names list
java.util.ArrayList<String> homeNames = user.getHomesList();

// Add a new home
CMILocation homeLoc = new CMILocation(player.getLocation());
CmiHome newHome = new CmiHome("newbase", homeLoc);
user.addHome(newHome, true); // true = save to database

// Remove a home
user.removeHome("oldbase");

// Get max homes for a player
HomeManager homeManager = CMI.getInstance().getHomeManager();
int maxHomes = homeManager.getMaxHomes(player);

// Count valid homes
int homeCount = user.getValidHomeCount();
```

## Warps

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Warps.WarpManager;
import com.Zrips.CMI.Modules.Warps.CmiWarp;
import net.Zrips.CMILib.Container.CMILocation;
import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.List;

WarpManager warpManager = CMI.getInstance().getWarpManager();

// Get all warps
HashMap<String, CmiWarp> allWarps = warpManager.getWarps();

// Get a specific warp by name
CmiWarp warp = warpManager.getWarp("spawn");
if (warp != null) {
    CMILocation loc = warp.getLoc();
    String name = warp.getName();
    String displayName = warp.getDisplayName();
    boolean reqPerm = warp.isReqPerm();
    java.util.UUID creator = warp.getCreator();
}

// Get warps visible to a player (respects permissions)
List<CmiWarp> playerWarps = warpManager.getWarps(player);

// Create a new warp
CMILocation warpLoc = new CMILocation(player.getLocation());
CmiWarp newWarp = new CmiWarp("myshop", warpLoc);
newWarp.setCreator(player.getUniqueId());
newWarp.setGroup("shops");
newWarp.setReqPerm(true);
warpManager.addWarp(newWarp, true); // true = save

// Remove a warp
CmiWarp toRemove = warpManager.getWarp("oldwarp");
if (toRemove != null) {
    warpManager.remove(toRemove);
}

// Open the warp GUI for a player
warpManager.openGUI(player, 1, null); // page 1, no group filter
```

## Listen for Warp Events

```java
import com.Zrips.CMI.events.CMIPlayerWarpEvent;
import com.Zrips.CMI.Modules.Warps.CmiWarp;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class WarpListener implements Listener {
    @EventHandler
    public void onWarp(CMIPlayerWarpEvent event) {
        CmiWarp warp = event.getWarp();
        org.bukkit.entity.Player target = event.getPlayer();
        org.bukkit.command.CommandSender sender = event.getCommandSender();

        // Cancel to prevent the warp
        if (warp.getName().equals("restricted")) {
            event.setCancelled(true);
        }
    }
}
```

## Kits

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Kits.Kit;
import com.Zrips.CMI.Modules.Kits.KitsManager;
import com.Zrips.CMI.Containers.CMIKitUsage;
import org.bukkit.entity.Player;
import java.util.LinkedHashMap;

KitsManager kitsManager = CMI.getInstance().getKitsManager();

// Get a kit by name
Kit kit = kitsManager.getKit("starter");

// Get a kit respecting player permissions
Kit kitForPlayer = kitsManager.getKit(player, "starter");

// Get all kits available to a player (grouped by category)
java.util.HashMap<String, java.util.List<Kit>> validKits = kitsManager.getValidKitsForPlayer(player, false);

// Give a kit to a player
if (kit != null) {
    kitsManager.giveKit(player, kit);
}

// Check kit usage on a user
CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user != null && kit != null) {
    boolean canUse = user.canUseKit(kit);
    int usedTimes = user.getKitUseTimes(kit);
    int remainingUses = user.getLeftKitUseTimes(kit);
    Long nextUseTime = user.getKitUseTimeIn(kit); // milliseconds until next use, null if ready

    // Record kit usage
    user.addKit(kit, System.currentTimeMillis(), true);

    // Reset kit cooldown
    user.resetKitUseTimes(kit);
}

// Kit properties
if (kit != null) {
    String name = kit.getConfigName();
    String commandName = kit.getCommandName();
    double cost = kit.getCost();
    long delay = kit.getDelay();
    boolean enabled = kit.isEnabled();
    java.util.List<org.bukkit.inventory.ItemStack> items = kit.getItems();
    java.util.List<String> commands = kit.getCommands();
}

// Open kit GUI
kitsManager.listPlayersKitsInGUI(player);
```

## Vanish

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Vanish.VanishManager;
import org.bukkit.entity.Player;
import java.util.Set;
import java.util.UUID;

CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user == null) return;

// Check if player is vanished
boolean vanished = user.isVanished();

// Toggle vanish
user.setVanished(true);
user.setVanished(true, true); // second param: fire CMIPlayerVanishEvent

// Vanish manager operations
VanishManager vanishManager = CMI.getInstance().getVanishManager();

// Get all vanished player UUIDs
Set<UUID> allVanished = vanishManager.getAllVanished();

// Get vanished players currently online
Set<UUID> vanishedOnline = vanishManager.getVanishedOnlineList();

// Apply vanish effects (hide from other players, etc.)
vanishManager.applyVanish(user);
vanishManager.applyVanish(user, true, true); // fireEvent, showMessages
```

## Listen for Vanish Events

```java
import com.Zrips.CMI.events.CMIPlayerVanishEvent;
import com.Zrips.CMI.events.CMIPlayerUnVanishEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class VanishListener implements Listener {
    @EventHandler
    public void onVanish(CMIPlayerVanishEvent event) {
        // Cancellable - prevents the player from vanishing
        event.setCancelled(true);
    }

    @EventHandler
    public void onUnVanish(CMIPlayerUnVanishEvent event) {
        // Fired when player becomes visible again
        org.bukkit.entity.Player player = event.getPlayer();
    }
}
```

## AFK

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Afk.AfkManager;
import com.Zrips.CMI.Modules.Afk.AfkInfo;
import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;
import org.bukkit.entity.Player;

CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user == null) return;

// Check AFK status
boolean isAfk = user.isAfk();

// Set AFK manually
user.setAfk(true);
user.setAfk(true, AfkType.manual);

// Set AFK reason
user.setAfkReason("Eating dinner");
String reason = user.getAfkReason();

// Get detailed AFK info
AfkInfo info = user.getAfkInfo(); // nullable
if (info != null) {
    long afkSince = info.getAfkFrom();
    AfkType type = info.getType();
}

// AFK manager
AfkManager afkManager = CMI.getInstance().getAfkManager();
boolean isPlayerAfk = afkManager.isAfk(player.getUniqueId());
java.util.Set<CMIUser> afkPlayers = afkManager.getAfkPlayers();
int afkCount = afkManager.getAfkPlayerCount();
```

## Listen for AFK Events

```java
import com.Zrips.CMI.events.CMIAfkEnterEvent;
import com.Zrips.CMI.events.CMIAfkLeaveEvent;
import com.Zrips.CMI.events.CMIAfkKickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class AfkListener implements Listener {
    @EventHandler
    public void onAfkEnter(CMIAfkEnterEvent event) {
        // Cancellable
        CMIAfkEnterEvent.AfkType type = event.getType(); // auto or manual
        java.util.List<String> cmds = event.getAwayTrigerCommands();
    }

    @EventHandler
    public void onAfkLeave(CMIAfkLeaveEvent event) {
        org.bukkit.entity.Player player = event.getPlayer();
    }

    @EventHandler
    public void onAfkKick(CMIAfkKickEvent event) {
        // Cancellable - prevent AFK kick
        event.setCancelled(true);
    }
}
```

## Holograms

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Holograms.CMIHologram;
import com.Zrips.CMI.Modules.Holograms.HologramManager;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import java.util.Arrays;
import java.util.HashMap;

HologramManager holoManager = CMI.getInstance().getHologramManager();

// Create a persistent (server-wide) hologram
Location center = player.getLocation().add(0, 2, 0);
CMIHologram holo = new CMIHologram("MyHologram", center);
holo.setLines(Arrays.asList("&aWelcome!", "&7Right-click me"));
holo.setShowRange(32);
holo.setUpdateIntervalSec(5.0);
holoManager.addHologram(holo);
holo.update();
holo.makePersistent(); // saves to file so it survives restarts

// Create a personal (lightweight) hologram for one player
CMIHologram personal = new CMIHologram(center, player, Arrays.asList("&eOnly you see this"));
personal.setSelfDestructIn(100); // auto-remove after 100 ticks (5 seconds)
personal.showToPlayer();

// Modify an existing hologram
CMIHologram existing = holoManager.getByName("MyHologram");
if (existing != null) {
    existing.setLine(0, "&cUpdated line!");
    existing.addLine("&7New line added");
    existing.update();
}

// Remove a hologram
if (existing != null) {
    existing.remove();
}

// Get all holograms
HashMap<String, CMIHologram> allHolos = holoManager.getHolograms();

// Hide a hologram from a specific player
if (existing != null) {
    existing.hide(player);
}

// Display method settings (1.19.3+)
holo.setNewDisplayMethod(true);
holo.setBillboard(com.Zrips.CMI.Containers.CMIBillboard.CENTER);
holo.setScaleW(1.5);
holo.setScaleH(1.5);
holo.setBackgroundAlpha(128);
holo.setShadowed(true);
```

## Item Worth / Sell Prices

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Worth.WorthManager;
import com.Zrips.CMI.Modules.Worth.WorthItem;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

WorthManager worthManager = CMI.getInstance().getWorthManager();

// Get the worth of an item
ItemStack item = new ItemStack(Material.DIAMOND);
WorthItem worth = worthManager.getWorth(item);
if (worth != null) {
    Double sellPrice = worth.getSellPrice();
    Double buyPrice = worth.getBuyPrice();
    boolean hasBuyPrice = worth.isBuyPriceSet();
}

// Set a new worth
WorthItem newWorth = new WorthItem(new ItemStack(Material.EMERALD));
newWorth.setSellPrice(50.0);
newWorth.setBuyPrice(100.0);
worthManager.addWorth(newWorth);
worthManager.updatePriceInFile(newWorth);
```

## Teleportation

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Teleportations.TeleportManager;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import java.util.concurrent.CompletableFuture;

CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user == null) return;

// Teleport a user (async-safe, returns feedback)
Location destination = new Location(player.getWorld(), 100, 64, 100);
CompletableFuture<?> future = user.teleport(destination);

// Get last death / teleport locations
Location deathLoc = user.getDeathLoc();
Location lastTp = user.getLastTeleportLocation();
```

## Listen for Teleport Events

```java
import com.Zrips.CMI.events.CMIPlayerTeleportRequestEvent;
import com.Zrips.CMI.events.CMIAsyncPlayerTeleportEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class TeleportListener implements Listener {
    @EventHandler
    public void onTpRequest(CMIPlayerTeleportRequestEvent event) {
        // Fired on /tpa, /tpahere requests - cancellable
    }

    @EventHandler
    public void onTeleport(CMIAsyncPlayerTeleportEvent event) {
        // Fired when a CMI teleport completes
    }
}
```

## Nicknames

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.NickName.NickNameManager;
import org.bukkit.entity.Player;

CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user == null) return;

// Get nickname
String nick = user.getNickName(); // null if not set
String displayName = user.getDisplayName();

// Set nickname
user.setNickName("&aCoolName", true); // true = save to database

// Force display name update (recalculates prefix, suffix, nick)
user.updateDisplayName();
```

## Jail

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.CMIUserJailData;
import com.Zrips.CMI.Modules.Jail.JailManager;
import com.Zrips.CMI.Modules.Jail.CMIJail;
import org.bukkit.entity.Player;

CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user == null) return;

// Check if jailed
boolean jailed = user.isJailed();

// Jail a player (time in seconds, jail object, cell id, reason)
JailManager jailManager = CMI.getInstance().getJailManager();
// You need to get a jail object from the jail manager first
// user.jail(300L, jail, 1, "Breaking rules");

// Unjail
user.unjail();

// Get jail details
if (user.isJailed()) {
    Long until = user.getJailedUntil();
    String reason = user.getJailedReason();
    java.util.UUID jailedBy = user.getJailedBy();
}
```

## Banning

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.CMIBanEntry;
import org.bukkit.entity.Player;
import java.util.Date;

CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user == null) return;

// Check ban status
boolean banned = user.isBanned();

// Ban permanently
user.setBanned("Hacking");

// Ban with expiry
Date until = new Date(System.currentTimeMillis() + 86400000L); // 24 hours
user.setBanned("Griefing", until);

// Ban with reason, issuer, and expiry
user.setBanned("Spam", sender, until);

// Unban
user.unBan();

// Get ban details
CMIBanEntry banEntry = user.getBanEntry();
```

## Player Options and State

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import org.bukkit.entity.Player;

CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user == null) return;

// God mode (read-only via API)
boolean isGod = user.isGod();

// Flight
boolean canFly = user.isAllowFlight();
user.setAllowFlight(true);
user.setFlying(true);

// Timed fly (millis)
user.setTfly(System.currentTimeMillis() + 3600000L, true); // 1 hour

// Mute status
boolean muted = user.isMuted();
Long mutedUntil = user.getMutedUntil();
String muteReason = user.getMutedReason();

// Cuffed (cannot move/interact)
boolean cuffed = user.isCuffed();
user.setCuffed(true, true);

// Online status and login tracking
boolean online = user.isOnline();
long lastLogin = user.getLastLogin();
long lastLogoff = user.getLastLogoff();
long totalPlayTime = user.getTotalPlayTime();

// Sitting
boolean sitting = user.isSitting();
```

## Tab List

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.TabList.TabListManager;
import org.bukkit.entity.Player;

TabListManager tabListManager = CMI.getInstance().getTabListManager();

// Force update tablist for a specific player
tabListManager.updateTabList(player);

// Force update tablist for all players
tabListManager.updateTabList();

// Update just the tablist name (prefix/suffix/nick) for a player
tabListManager.updateTablistName(player);

// Check if tablist module is enabled
boolean enabled = tabListManager.isEnabled();
```

## Action Bar / Boss Bar

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import net.Zrips.CMILib.BossBar.BossBarInfo;
import org.bukkit.entity.Player;

CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user == null) return;

// Add a boss bar
BossBarInfo barInfo = new BossBarInfo("mybar");
// Configure barInfo as needed, then:
user.addBossBar(barInfo);

// Remove a boss bar by name
user.removeBossBar("mybar");

// Hide all boss bars
user.hideBossBars();

// Send a message to the user
user.sendMessage("&aHello from CMI!");
```

## Custom Aliases (Custom Commands)

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Alias.AliasManager;
import org.bukkit.entity.Player;

AliasManager aliasManager = CMI.getInstance().getAliasManager();
// Custom aliases are managed through CMI's config files.
// The AliasManager provides programmatic access to the alias system.
```

## Performing CMI Commands Programmatically

```java
import com.Zrips.CMI.CMI;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

// Execute a CMI command as a sender
CMI.getInstance().performCommand(player, "cmi heal");
CMI.getInstance().performCommand(consoleSender, "cmi fly PlayerName");
```

## Warnings

```java
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Warnings.CMIPlayerWarning;
import org.bukkit.entity.Player;
import java.util.List;

CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
if (user == null) return;

// Get warnings
List<CMIPlayerWarning> warnings = user.getWarnings();

// Add a warning
CMIPlayerWarning warning = user.addWarning("Console", "Spamming", null);

// Get warning points total
int points = user.getWarningPoints();

// Remove a warning
if (warnings != null && !warnings.isEmpty()) {
    user.removeWarning(warnings.get(0));
}
```

## Additional Events

```java
import com.Zrips.CMI.events.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class CMIEventListener implements Listener {

    // Player ban/unban
    @EventHandler
    public void onBan(CMIPlayerBanEvent event) { /* cancellable */ }
    @EventHandler
    public void onUnBan(CMIPlayerUnBanEvent event) { }

    // Jail
    @EventHandler
    public void onJail(CMIPlayerJailEvent event) { /* cancellable */ }
    @EventHandler
    public void onUnjail(CMIPlayerUnjailEvent event) { }

    // Warn
    @EventHandler
    public void onWarn(CMIPlayerWarnEvent event) { /* cancellable */ }

    // Nickname change
    @EventHandler
    public void onNickChange(CMIPlayerNickNameChangeEvent event) { /* cancellable */ }

    // PvP tracking
    @EventHandler
    public void onPvpStart(CMIPvPStartEventAsync event) { }
    @EventHandler
    public void onPvpEnd(CMIPvPEndEventAsync event) { }

    // PvE tracking
    @EventHandler
    public void onPveStart(CMIPvEStartEventAsync event) { }
    @EventHandler
    public void onPveEnd(CMIPvEEndEventAsync event) { }

    // Portal events
    @EventHandler
    public void onPortalCreate(CMIPortalCreateEvent event) { /* cancellable */ }
    @EventHandler
    public void onPortalUse(CMIPortalUseEvent event) { /* cancellable */ }

    // Cheque events
    @EventHandler
    public void onChequeCreate(CMIChequeCreationEvent event) { /* cancellable */ }
    @EventHandler
    public void onChequeUse(CMIChequeUsageEvent event) { /* cancellable */ }

    // Item sell
    @EventHandler
    public void onSell(CMIPlayerItemsSellEvent event) { /* cancellable */ }

    // Armor change
    @EventHandler
    public void onArmorChange(CMIArmorChangeEvent event) { }

    // Config reload
    @EventHandler
    public void onReload(CMIConfigReloadEvent event) { }

    // Player sit
    @EventHandler
    public void onSit(CMIPlayerSitEvent event) { /* cancellable */ }
}
```

## API Reference

### Main Plugin Class
`com.Zrips.CMI.CMI extends JavaPlugin`
- `static CMI getInstance()`
- `static boolean isShuttingDown()`
- `boolean isFullyLoaded()`
- `PlayerManager getPlayerManager()`
- `EconomyManager getEconomyManager()`
- `WarpManager getWarpManager()`
- `HomeManager getHomeManager()`
- `KitsManager getKitsManager()`
- `VanishManager getVanishManager()`
- `AfkManager getAfkManager()`
- `HologramManager getHologramManager()`
- `WorthManager getWorthManager()`
- `TabListManager getTabListManager()`
- `TabListHeaderFooterHandler getTabListHandler()`
- `JailManager getJailManager()`
- `NickNameManager getNickNameManager()`
- `TeleportManager getTeleportManager()`
- `TeleportHandler getTeleportHandler()`
- `AliasManager getAliasManager()`
- `PortalManager getPortalManager()`
- `RankManager getRankManager()`
- `WarningManager getWarningManager()`
- `ChatManager getChatManager()`
- `ChatFormatManager getChatFormatManager()`
- `ChatFilterManager getChatFilterManager()`
- `SkinManager getSkinManager()`
- `ParticleManager getParticleManager()`
- `PlayTimeManager getPlayTimeManager()`
- `PlayTimeRewardsManager getPlayTimeRewardManager()`
- `RandomTeleportationManager getRandomTeleportationManager()`
- `BungeeCordManager getBungeeCordManager()`
- `CooldownManager getCooldownManager()`
- `WarmUpManager getWarmUpManager()`
- `FlightChargeManager getFlightChargeManager()`
- `TagManager getTagManager()`
- `StatsManager getStatsManager()`
- `EnchantManager getEnchantManager()`
- `RepairManager getRepairManager()`
- `ArmorStandManager getArmorStandManager()`
- `SignManager getSignManager()`
- `RecipeManager getRecipeManager()`
- `EventActionManager getEventActionManager()`
- `CustomNBTManager getCustomNBTManager()`
- `SavedItemManager getSavedItemManager()`
- `SavedInventoryManager getSavedInventoryManager()`
- `SelectionManager getSelectionManager()`
- `EnderChestManager getEnderChestManager()`
- `ElytraManager getElytraManager()`
- `ScavengeManager getScavengeManager()`
- `TotemManager getTotemManager()`
- `AnvilManager getAnvilManager()`
- `Config getConfigManager()`
- `DBManager getDbManager()`
- `CommandsHandler getCommandManager()`
- `Placeholder getPlaceholderAPIManager()`
- `Scoreboard getSB()`
- `Lag getLagMeter()`
- `NMS getNMS()`
- `void performCommand(CommandSender sender, String cmd)`
- `void save(Player player)`
- `Player getTarget(CommandSender sender, String playerName, String cmd)`
- `CMIUser getUser(CommandSender sender, String playerName, String cmd)`

### PlayerManager (`com.Zrips.CMI.PlayerManager`)
- `CMIUser getUser(Player player)`
- `CMIUser getUser(OfflinePlayer player)`
- `CMIUser getUser(UUID uuid)`
- `CMIUser getUser(String name)`
- `CMIUser getUser(Integer id)`
- `Map<UUID, CMIUser> getAllUsers()`
- `int getTotalUserCount()`
- `boolean isUserExist(UUID uuid)`
- `void saveUser(CMIUser user)`

### CMIUser (`com.Zrips.CMI.Containers.CMIUser`)
**Static:**
- `static CMIUser getUser(Player player)`
- `static CMIUser getUser(UUID uuid)` -- nullable
- `static CMIUser getUser(String playerName)` -- nullable
- `static Player getOnlinePlayer(String playerName)`
- `static Collection<CMIUser> getUsers()`

**Identity:**
- `String getName()`
- `UUID getUniqueId()`
- `Player getPlayer()` -- nullable
- `OfflinePlayer getOfflinePlayer()`
- `boolean isOnline()`
- `boolean isSame(Player player)`

**Economy:**
- `Double getBalance()`
- `Double getBalance(String worldName)`
- `boolean hasMoney(Double balance)`
- `Double deposit(Double balance)`
- `Double deposit(Double balance, CMIUser source)`
- `Double deposit(String worldName, Double balance)`
- `Double withdraw(Double balance)`
- `Double withdraw(Double balance, CMIUser target)`
- `Double withdraw(String worldName, Double balance)`
- `String getFormatedBalance()`

**Homes:**
- `LinkedHashMap<String, CmiHome> getHomes()`
- `CmiHome getHome(String name)`
- `CmiHome getBedHome()`
- `ArrayList<String> getHomesList()`
- `int getValidHomeCount()`
- `void addHome(CmiHome home, boolean save)`
- `void removeHome(String name)`

**Vanish:**
- `boolean isVanished()`
- `boolean isCMIVanished()`
- `void setVanished(boolean vanished)`
- `void setVanished(boolean vanished, boolean fireEvent)`
- `CMIVanish getVanish()`

**AFK:**
- `boolean isAfk()`
- `void setAfk(boolean afk)`
- `void setAfk(boolean afk, AfkType type)`
- `void setAfkReason(String reason)`
- `String getAfkReason()`
- `AfkInfo getAfkInfo()` -- nullable

**Kits:**
- `boolean canUseKit(Kit kit)`
- `int getKitUseTimes(Kit kit)`
- `int getLeftKitUseTimes(Kit kit)`
- `Long getKitUseTimeIn(Kit kit)`
- `void addKit(Kit kit, Long time, boolean save)`
- `CMIUser resetKitUseTimes(Kit kit)`
- `Collection<CMIKitUsage> getKitsUsages()`

**Nickname / Display:**
- `String getNickName()`
- `void setNickName(String nickName, boolean save)`
- `String getDisplayName()`
- `void setDisplayName(String displayName)`
- `void updateDisplayName()`
- `String getPrefix()`
- `String getSuffix()`
- `String getGroupName()`

**Jail:**
- `boolean isJailed()`
- `boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId, String reason)`
- `void unjail()`
- `Long getJailedUntil()`
- `String getJailedReason()`
- `UUID getJailedBy()`

**Ban:**
- `boolean isBanned()`
- `CMIUser setBanned(String reason)`
- `CMIUser setBanned(String reason, Date until)`
- `CMIUser setBanned(String reason, CommandSender by, Date until)`
- `CMIUser unBan()`
- `CMIBanEntry getBanEntry()`

**Mute:**
- `boolean isMuted()`
- `Long getMutedUntil()`
- `String getMutedReason()`
- `void setMutedUntil(long mutedUntil)`

**God / Flight:**
- `boolean isGod()`
- `boolean isAllowFlight()`
- `void setAllowFlight(boolean allowFlight)`
- `boolean isFlying()`
- `void setFlying(boolean flying)`
- `void setTfly(long tfly, boolean save)`

**Teleport:**
- `CompletableFuture<CMITeleportFeedback> teleport(Location loc)`
- `CompletableFuture<CMITeleportFeedback> teleport(Entity ent)`
- `Location getDeathLoc()`
- `Location getLastTeleportLocation()`
- `Location getLogOutLocation()`

**Tracking:**
- `long getLastLogin()`
- `long getLastLogoff()`
- `long getTotalPlayTime()`
- `int getVotifierVotes()`

**Boss Bar:**
- `void addBossBar(BossBarInfo barInfo)`
- `void removeBossBar(String name)`
- `void hideBossBars()`

**Ignore:**
- `boolean isIgnoring(UUID uuid)`
- `void addIgnore(UUID ignore, boolean save)`
- `void removeIgnore(UUID ignore)`
- `Set<UUID> getIgnores()`

**Communication:**
- `void sendMessage(String msg)`
- `boolean isSilenceMode()`

**Warnings:**
- `List<CMIPlayerWarning> getWarnings()` -- nullable
- `CMIPlayerWarning addWarning(String source, String reason, CMIWarningCategory category)`
- `int removeWarning(CMIPlayerWarning warning)`
- `int getWarningPoints()`

**Skin:**
- `String getSkin()`
- `void setSkin(String skin)`
- `boolean hasSetSkin()`

**Cuff:**
- `boolean isCuffed()`
- `void setCuffed(boolean cuffed, boolean save)`

### WarpManager (`com.Zrips.CMI.Modules.Warps.WarpManager`)
- `HashMap<String, CmiWarp> getWarps()`
- `CmiWarp getWarp(String name)`
- `CmiWarp getWarp(Player player, String name)`
- `List<CmiWarp> getWarps(Player player)`
- `void addWarp(CmiWarp warp, boolean save)`
- `void remove(CmiWarp warp)`
- `int getWarpCount(Player player)`
- `int getMaxWarps(Player player)`
- `CMIGui openGUI(Player player, int page, String group)`

### CmiWarp (`com.Zrips.CMI.Modules.Warps.CmiWarp`)
- `CmiWarp(String name)` / `CmiWarp(String name, CMILocation loc)`
- `String getName()` / `void setName(String name)`
- `CMILocation getLoc()` / `void setLoc(CMILocation loc)`
- `String getDisplayName()` / `void setDisplayName(String displayName)`
- `UUID getCreator()` / `void setCreator(UUID creator)`
- `String getGroup()` / `void setGroup(String group)`
- `boolean isReqPerm()` / `void setReqPerm(boolean reqPerm)`
- `boolean isHidden()` / `void setHidden(boolean hidden)`
- `Integer getSlot()` / `void setSlot(Integer slot)`
- `ItemStack getIcon()` / `void setItem(ItemStack item)`

### HomeManager (`com.Zrips.CMI.Modules.Homes.HomeManager`)
- `int getMaxHomes(Player player)`
- `String getDefaultHomeName()`
- `Location getReSpawnLocation(Player player)`
- `boolean openHomeGui(Player player, CMIUser user, int page)`

### CmiHome (`com.Zrips.CMI.Modules.Homes.CmiHome`)
- `CmiHome(String name, CMILocation loc)` / `CmiHome(String name, CMILocation loc, boolean privateH)`
- `String getName()`
- `CMILocation getLoc()`
- `boolean isPrivate()` / `void setPrivate(boolean privateH)`
- `boolean isBed()` / `void setBed(boolean bed)`
- `boolean isFavorite()` / `void setFavorite(boolean fav)`
- `Integer getSlot()` / `void setSlot(Integer slot)`
- `CMIMaterial getMaterial()` / `void setMaterial(CMIMaterial material)`

### KitsManager (`com.Zrips.CMI.Modules.Kits.KitsManager`)
- `Kit getKit(String name)`
- `Kit getKit(Player player, String name)`
- `LinkedHashMap<String, Kit> getKitMap()`
- `HashMap<String, List<Kit>> getValidKitsForPlayer(Player player, boolean includePreview)`
- `void giveKit(Player player, Kit kit)`
- `void addKit(Kit kit)`
- `boolean removeKit(String name)`
- `void listPlayersKitsInGUI(Player player)`

### Kit (`com.Zrips.CMI.Modules.Kits.Kit`)
- `Kit(String name)`
- `String getConfigName()` / `String getCommandName()`
- `List<ItemStack> getItems()` / `List<ItemStack> getItems(Player player)`
- `List<String> getCommands()` / `List<String> getCommands(Player player)`
- `double getCost()` / `void setCost(double cost)`
- `long getDelay()` / `void setDelay(long delay)`
- `boolean isEnabled()` / `void setEnabled(boolean enabled)`
- `int getMaxUsages()` / `void setMaxUsages(int maxUsages)`
- `String getDisplayName()` / `void setDisplayName(String displayName)`
- `ItemStack getIcon()` / `void setIcon(ItemStack icon)`

### VanishManager (`com.Zrips.CMI.Modules.Vanish.VanishManager`)
- `Set<UUID> getAllVanished()`
- `Set<UUID> getVanishedOnlineList()`
- `void applyVanish(CMIUser user)`
- `void applyVanish(CMIUser user, boolean fireEvent, boolean showMessages)`
- `void addPlayer(CMIUser user)` / `void removePlayer(CMIUser user)`

### AfkManager (`com.Zrips.CMI.Modules.Afk.AfkManager`)
- `boolean isAfk(UUID uuid)`
- `AfkInfo getAfkInfo(UUID uuid)`
- `Set<CMIUser> getAfkPlayers()`
- `int getAfkPlayerCount()`
- `boolean isAfkEnabled()`

### HologramManager (`com.Zrips.CMI.Modules.Holograms.HologramManager`)
- `void addHologram(CMIHologram holo)`
- `CMIHologram getByName(String name)`
- `HashMap<String, CMIHologram> getHolograms()`
- `void removeHolo(CMIHologram holo)`
- `void hideAllHolograms()`

### CMIHologram (`com.Zrips.CMI.Modules.Holograms.CMIHologram`)
- `CMIHologram(String name, Location loc)`
- `CMIHologram(Location loc, Player playerToShowFor, List<String> lines)`
- `void setLines(List<String> l)` / `List<String> getLines()`
- `void setLine(int place, String line)` / `void addLine(String line)`
- `void update()` / `void refresh()` / `void remove()`
- `void hide()` / `void hide(Player player)` / `void enable()` / `void disable()`
- `void makePersistent()`
- `void showToPlayer()` -- for personal holograms
- `CMIHologram setSelfDestructIn(int ticks)` -- for personal holograms
- `void setShowRange(int showRange)` / `void setUpdateIntervalSec(double d)`
- `Location getLoc()` / `void setLoc(Location loc)`
- `String getName()` / `void setName(String name)`

### WorthManager (`com.Zrips.CMI.Modules.Worth.WorthManager`)
- `WorthItem getWorth(ItemStack item)`
- `WorthItem addWorth(WorthItem worth)`
- `void updatePriceInFile(WorthItem worth)`

### WorthItem (`com.Zrips.CMI.Modules.Worth.WorthItem`)
- `WorthItem(ItemStack item)`
- `Double getSellPrice()` / `void setSellPrice(double price)`
- `Double getBuyPrice()` / `void setBuyPrice(Double buyPrice)`
- `boolean isBuyPriceSet()`

### EconomyManager (`com.Zrips.CMI.Modules.Economy.EconomyManager`)
- `String format(Double money)`
- `boolean isEnabled()`
- `SortedMap<Double, UUID> getBalTopMap()`
- `int getBalTopPlace(UUID uuid)`
- `Double getMaxChequeValue()`
- `Double getTotalServerMoney()`

### TabListManager (`com.Zrips.CMI.Modules.TabList.TabListManager`)
- `void updateTabList()`
- `void updateTabList(Player player)`
- `void updateTablistName(Player player)`
- `boolean isEnabled()`

### Events (`com.Zrips.CMI.events`)
| Event | Cancellable | Key Methods |
|---|---|---|
| `CMIUserBalanceChangeEvent` | Yes | `getUser()`, `getFrom()`, `getTo()`, `getActionType()`, `getSource()` |
| `CMIAfkEnterEvent` | Yes | `getPlayer()`, `getType()`, `getAwayTrigerCommands()` |
| `CMIAfkLeaveEvent` | No | `getPlayer()` |
| `CMIAfkKickEvent` | Yes | `getPlayer()` |
| `CMIPlayerVanishEvent` | Yes | `getPlayer()` |
| `CMIPlayerUnVanishEvent` | Yes | `getPlayer()` |
| `CMIPlayerWarpEvent` | Yes | `getPlayer()`, `getWarp()`, `getCommandSender()` |
| `CMIPlayerTeleportRequestEvent` | Yes | `getPlayer()` |
| `CMIAsyncPlayerTeleportEvent` | No | `getPlayer()` |
| `CMIPlayerNickNameChangeEvent` | Yes | `getPlayer()` |
| `CMIPlayerBanEvent` | Yes | `getPlayer()` |
| `CMIPlayerUnBanEvent` | No | `getPlayer()` |
| `CMIPlayerJailEvent` | Yes | `getPlayer()` |
| `CMIPlayerUnjailEvent` | No | `getPlayer()` |
| `CMIPlayerWarnEvent` | Yes | `getPlayer()` |
| `CMIPlayerSitEvent` | Yes | `getPlayer()` |
| `CMIPlayerItemsSellEvent` | Yes | `getPlayer()` |
| `CMIChequeCreationEvent` | Yes | `getPlayer()` |
| `CMIChequeUsageEvent` | Yes | `getPlayer()` |
| `CMIArmorChangeEvent` | No | `getPlayer()` |
| `CMIPvPStartEventAsync` | No | `getPlayer()` |
| `CMIPvPEndEventAsync` | No | `getPlayer()` |
| `CMIPvEStartEventAsync` | No | `getPlayer()` |
| `CMIPvEEndEventAsync` | No | `getPlayer()` |
| `CMIPortalCreateEvent` | Yes | -- |
| `CMIPortalUseEvent` | Yes | -- |
| `CMIConfigReloadEvent` | No | -- |
