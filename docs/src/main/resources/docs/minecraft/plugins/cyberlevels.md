# CyberLevels API

Server leveling system with XP, levels, custom rewards, and MySQL support.

## Accessing the API

Get the plugin instance and use `levelCache()` to access player data.

```java
import net.zerotoil.dev.cyberlevels.CyberLevels;
import net.zerotoil.dev.cyberlevels.objects.levels.LevelCache;
import net.zerotoil.dev.cyberlevels.objects.levels.PlayerData;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

CyberLevels cyberLevels = (CyberLevels) Bukkit.getPluginManager().getPlugin("CyberLevels");
LevelCache levelCache = cyberLevels.levelCache();
```

## Get Player Level and XP

```java
import net.zerotoil.dev.cyberlevels.CyberLevels;
import net.zerotoil.dev.cyberlevels.objects.levels.LevelCache;
import net.zerotoil.dev.cyberlevels.objects.levels.PlayerData;
import org.bukkit.entity.Player;

Player player = /* target player */;
LevelCache levelCache = cyberLevels.levelCache();
PlayerData data = levelCache.playerLevels().get(player);

if (data != null) {
    Long level = data.getLevel();
    Double exp = data.getExp();
    Long maxLevel = data.getMaxLevel();
    double requiredXP = data.nextExpRequirement();
}
```

## Add, Remove, and Set XP

```java
import net.zerotoil.dev.cyberlevels.objects.levels.PlayerData;
import org.bukkit.entity.Player;

PlayerData data = cyberLevels.levelCache().playerLevels().get(player);

// Add XP (doMultiplier: whether permission-based multipliers apply)
data.addExp(100.0, true);

// Add XP with more control (amount, difference, sendMessage, doMultiplier)
data.addExp(100.0, 0.0, true, true);

// Remove XP
data.removeExp(50.0);

// Set XP directly (amount, checkLevel, sendMessage)
data.setExp(500.0, true, true);

// Set XP with leaderboard control (amount, checkLevel, sendMessage, checkLeaderboard)
data.setExp(500.0, true, true, true);
```

## Add, Remove, and Set Levels

```java
import net.zerotoil.dev.cyberlevels.objects.levels.PlayerData;
import org.bukkit.entity.Player;

PlayerData data = cyberLevels.levelCache().playerLevels().get(player);

// Add levels
data.addLevel(5);

// Remove levels
data.removeLevel(2);

// Set level directly (amount, sendMessage)
data.setLevel(10, true);

// Set max level cap for player
data.setMaxLevel(100L);
```

## Listen for XP Changes

The `XPChangeEvent` fires when a player gains or loses XP. You can modify the amount.

```java
import net.zerotoil.dev.cyberlevels.api.events.XPChangeEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MyXPListener implements Listener {

    @EventHandler
    public void onXPChange(XPChangeEvent event) {
        Player player = event.getPlayer();
        double oldXP = event.getOldXP();
        double newXP = event.getNewXP();
        double amount = event.getAmount();

        // Modify the XP change amount
        event.setAmount(amount * 2.0);
    }
}
```

## Leaderboard Access

```java
import net.zerotoil.dev.cyberlevels.objects.leaderboard.Leaderboard;
import net.zerotoil.dev.cyberlevels.objects.leaderboard.LeaderboardPlayer;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import java.util.List;

Leaderboard leaderboard = cyberLevels.levelCache().getLeaderboard();

// Get top 10 players
List<LeaderboardPlayer> topTen = leaderboard.getTopTenPlayers();

// Get a specific rank (0-indexed)
LeaderboardPlayer top1 = leaderboard.getTopPlayer(0);
long level = top1.getLevel();
double exp = top1.getExp();
String uuid = top1.getUUID();
OfflinePlayer offlinePlayer = top1.getPlayer();

// Check a player's rank
int rank = leaderboard.checkFrom(player);

// Force leaderboard refresh
leaderboard.updateLeaderboard();
```

## Player Multipliers

```java
import net.zerotoil.dev.cyberlevels.utilities.PlayerUtils;
import org.bukkit.entity.Player;

PlayerUtils playerUtils = cyberLevels.playerUtils();
double multiplier = playerUtils.getMultiplier(player);
```

## Utility Methods

```java
import net.zerotoil.dev.cyberlevels.utilities.LevelUtils;
import org.bukkit.entity.Player;

LevelUtils levelUtils = cyberLevels.levelUtils();

// Get progress bar string between current and required XP
String bar = levelUtils.progressBar(currentExp, requiredExp);

// Get percentage string
String percent = levelUtils.getPercent(currentExp, requiredExp);

// Round a decimal according to plugin settings
String rounded = levelUtils.roundStringDecimal(3.14159);
double roundedD = levelUtils.roundDecimal(3.14159);

// Parse placeholders in a string for a player
String parsed = levelUtils.getPlaceholders("{level}", player, true);
```

## API Reference

### net.zerotoil.dev.cyberlevels.CyberLevels
Extends: `org.bukkit.plugin.java.JavaPlugin`
- `LevelCache levelCache()`
- `LevelUtils levelUtils()`
- `PlayerUtils playerUtils()`
- `LangUtils langUtils()`
- `EXPCache expCache()`
- `EXPListeners expListeners()`
- `Files files()`
- `int serverVersion()`
- `String serverFork()`

### net.zerotoil.dev.cyberlevels.objects.levels.PlayerData
- `Long getLevel()`
- `Double getExp()`
- `Long getMaxLevel()`
- `Player getPlayer()`
- `double nextExpRequirement()`
- `void addLevel(long)`
- `void removeLevel(long)`
- `void setLevel(long, boolean sendMessage)`
- `void setMaxLevel(Long)`
- `void addExp(double amount, boolean doMultiplier)`
- `void addExp(double amount, double difference, boolean sendMessage, boolean doMultiplier)`
- `void removeExp(double)`
- `void setExp(double amount, boolean checkLevel, boolean sendMessage)`
- `void setExp(double amount, boolean checkLevel, boolean sendMessage, boolean checkLeaderboard)`

### net.zerotoil.dev.cyberlevels.objects.levels.LevelCache
- `Map<Player, PlayerData> playerLevels()`
- `Map<Long, LevelData> levelData()`
- `Leaderboard getLeaderboard()`
- `Long maxLevel()`
- `Long startLevel()`
- `Double startExp()`
- `MySQL getMySQL()`
- `void loadPlayer(Player)`
- `void savePlayer(Player, boolean)`
- `void saveOnlinePlayers(boolean)`
- `void loadOnlinePlayers()`
- `boolean addLevelReward()`
- `boolean doEventMultiplier()`
- `boolean doCommandMultiplier()`
- `boolean isLeaderboardEnabled()`
- `boolean isLeaderboardInstantUpdate()`
- `boolean isPreventDuplicateRewards()`
- `boolean isStackComboExp()`

### net.zerotoil.dev.cyberlevels.objects.levels.LevelData
- `Double getRequiredExp(Player)`
- `List<RewardObject> getRewards()`
- `void addReward(RewardObject)`
- `void clearRewards()`

### net.zerotoil.dev.cyberlevels.api.events.XPChangeEvent
Extends: `org.bukkit.event.Event`
- `Player getPlayer()`
- `double getOldXP()`
- `double getNewXP()`
- `double getAmount()`
- `void setAmount(double)`
- `static HandlerList getHandlerList()`
- `HandlerList getHandlers()`

### net.zerotoil.dev.cyberlevels.objects.leaderboard.Leaderboard
- `List<LeaderboardPlayer> getTopTenPlayers()`
- `LeaderboardPlayer getTopPlayer(int)`
- `int checkFrom(Player)`
- `void updateLeaderboard()`
- `boolean isUpdating()`

### net.zerotoil.dev.cyberlevels.objects.leaderboard.LeaderboardPlayer
Implements: `Comparable`
- `long getLevel()`
- `double getExp()`
- `String getUUID()`
- `OfflinePlayer getPlayer()`

### net.zerotoil.dev.cyberlevels.utilities.PlayerUtils
- `double getMultiplier(Player)`
- `boolean hasParentPerm(Player, String, boolean)`

### net.zerotoil.dev.cyberlevels.utilities.LevelUtils
- `String progressBar(Double current, Double required)`
- `String getPercent(Double current, Double required)`
- `String roundStringDecimal(double)`
- `double roundDecimal(double)`
- `String getPlaceholders(String, Player, boolean)`
- `String getPlaceholders(String, Player, boolean, boolean)`
- `int getDecimals()`
- `String generalFormula()`
- `String levelFormula(long)`

### net.zerotoil.dev.cyberlevels.utilities.LangUtils
- `void sendMessage(Player, String)`
- `void sendMessage(Player, String, boolean)`
- `void sendMessage(Player, Player, String)`
- `String colorize(Player, String)`
- `String parsePAPI(Player, String)`
- `void sendCentered(Player, String)`
- `void actionBar(Player, String)`
- `void title(Player, String[], String[])`

### net.zerotoil.dev.cyberlevels.objects.exp.EXPCache
- `Map<String, EXPEarnEvent> expEarnEvents()`
- `boolean isAntiAbuse(Player, String)`
- `boolean roundExp()`
- `boolean useDouble()`
- `boolean isOnlyNaturalBlocks()`
- `boolean isPreventSilkTouchAbuse()`
- `boolean isIncludeNaturalCrops()`

### net.zerotoil.dev.cyberlevels.objects.exp.EXPEarnEvent
- `String getName()`
- `String getCategory()`
- `Boolean getEnabled()`
- `boolean isEnabled()`
- `double getMinEXP()`
- `double getMaxEXP()`
- `double getGeneralExp()`
- `double getSpecificExp(String)`
- `double getPartialMatchesExp(String)`
- `boolean hasPermission(Player)`
- `boolean hasGeneralPermission(Player)`
- `boolean isWhitelist()`
- `boolean isInGeneralList(String)`
- `boolean isInSpecificList(String)`
- `boolean hasPartialMatches(String, boolean)`
- `List<String> getList()`
- `HashMap<String, Double> getSpecificMin()`
- `HashMap<String, Double> getSpecificMax()`

### net.zerotoil.dev.cyberlevels.objects.RewardObject
- `void giveReward(Player)`
- `void sendMessage(Player)`
