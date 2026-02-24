# Vulcan Anti-Cheat API

Developer API for Vulcan, a packet-level Minecraft anticheat. Requires `enable-api: true` in Vulcan's config.

## Getting the API Instance

```java
import me.frep.vulcan.api.VulcanAPI;

VulcanAPI vulcan = VulcanAPI.Factory.getApi();
```

## Listen for Flag Events (Player Triggered a Check)

```java
import me.frep.vulcan.api.VulcanAPI;
import me.frep.vulcan.api.check.Check;
import me.frep.vulcan.api.event.VulcanFlagEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class VulcanFlagListener implements Listener {

    @EventHandler
    public void onFlag(VulcanFlagEvent event) {
        Player player = event.getPlayer();
        Check check = event.getCheck();
        String info = event.getInfo();

        String msg = player.getName() + " flagged " + check.getName()
                + " (type " + check.getType() + ") VL: " + check.getVl()
                + "/" + check.getMaxVl() + " - " + info;
        player.getServer().getLogger().info(msg);

        // Cancel to prevent Vulcan from processing this flag further
        // event.setCancelled(true);
    }
}
```

## Listen for Punishment Events

```java
import me.frep.vulcan.api.check.Check;
import me.frep.vulcan.api.event.VulcanPunishEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class VulcanPunishListener implements Listener {

    @EventHandler
    public void onPunish(VulcanPunishEvent event) {
        Player player = event.getPlayer();
        Check check = event.getCheck();

        // Cancel to prevent the punishment from executing
        // event.setCancelled(true);
    }
}
```

## Query Player Data and Violations

```java
import me.frep.vulcan.api.VulcanAPI;
import me.frep.vulcan.api.data.IPlayerData;
import org.bukkit.entity.Player;

public class VulcanPlayerInfo {

    public void printPlayerInfo(Player player) {
        VulcanAPI vulcan = VulcanAPI.Factory.getApi();

        int totalVl = vulcan.getTotalViolations(player);
        int combatVl = vulcan.getCombatViolations(player);
        int movementVl = vulcan.getMovementViolations(player);
        int ping = vulcan.getPing(player);
        int transactionPing = vulcan.getTransactionPing(player);
        double cps = vulcan.getCps(player);
        String clientVersion = vulcan.getClientVersion(player);
        boolean frozen = vulcan.isFrozen(player);

        IPlayerData data = vulcan.getPlayerData(player);
        int scaffoldVl = data.getScaffoldViolations();
        int timerVl = data.getTimerViolations();
        int autoClickerVl = data.getAutoClickerViolations();
        String clientBrand = data.getClientBrand();
        long joinTime = data.getJoinTime();
    }
}
```

## Query and Manipulate Checks

```java
import me.frep.vulcan.api.VulcanAPI;
import me.frep.vulcan.api.check.Check;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Set;

public class VulcanCheckQuery {

    public void inspectChecks(Player player) {
        VulcanAPI vulcan = VulcanAPI.Factory.getApi();

        // Get all registered check names
        Set<String> allChecks = vulcan.getChecks();

        // Get all checks for a specific player
        List<Check> playerChecks = vulcan.getChecks(player);

        // Get a specific check by name and type char (e.g., "Speed" type 'A')
        Check speedA = vulcan.getCheck(player, "Speed", 'A');
        if (speedA != null) {
            int vl = speedA.getVl();
            speedA.setVl(0); // Reset violations
            double buffer = speedA.getBuffer();
            speedA.setBuffer(0.0); // Reset buffer
        }

        // Check if a check is enabled globally
        boolean enabled = vulcan.isCheckEnabled("Speed A");
    }
}
```

## Freeze / Unfreeze a Player

```java
import me.frep.vulcan.api.VulcanAPI;
import org.bukkit.entity.Player;

public class VulcanFreeze {

    public void toggleFreeze(Player player) {
        VulcanAPI vulcan = VulcanAPI.Factory.getApi();

        vulcan.setFrozen(player, true);   // Freeze
        vulcan.setFrozen(player, false);  // Unfreeze
        boolean frozen = vulcan.isFrozen(player);
    }
}
```

## Toggle Alerts and Verbose

```java
import me.frep.vulcan.api.VulcanAPI;
import org.bukkit.entity.Player;

public class VulcanAlerts {

    public void manageAlerts(Player staffMember) {
        VulcanAPI vulcan = VulcanAPI.Factory.getApi();

        vulcan.toggleAlerts(staffMember);
        boolean hasAlerts = vulcan.hasAlertsEnabled(staffMember);

        vulcan.toggleVerbose(staffMember);
    }
}
```

## Trigger a Flag Programmatically

```java
import me.frep.vulcan.api.VulcanAPI;
import org.bukkit.entity.Player;

public class VulcanCustomFlag {

    public void flagPlayer(Player player) {
        VulcanAPI vulcan = VulcanAPI.Factory.getApi();
        // flag(player, checkName, checkType, info)
        vulcan.flag(player, "CustomCheck", "A", "Triggered by external plugin");
    }
}
```

## Server Info and Ban Wave

```java
import me.frep.vulcan.api.VulcanAPI;

public class VulcanServerInfo {

    public void printInfo() {
        VulcanAPI vulcan = VulcanAPI.Factory.getApi();

        String vulcanVersion = vulcan.getVulcanVersion();
        String serverVersion = vulcan.getServerVersion();
        double tps = vulcan.getTps();
        int ticks = vulcan.getTicks();

        // Execute all pending ban wave punishments
        vulcan.executeBanWave();
    }
}
```

## Listen for Setback Events

```java
import me.frep.vulcan.api.check.Check;
import me.frep.vulcan.api.event.VulcanSetbackEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class VulcanSetbackListener implements Listener {

    @EventHandler
    public void onSetback(VulcanSetbackEvent event) {
        Player player = event.getPlayer();
        Check check = event.getCheck();
        // Cancel to prevent the setback (teleport-back)
        // event.setCancelled(true);
    }
}
```

## API Reference

### Interface `me.frep.vulcan.api.VulcanAPI`
- `static VulcanAPI Factory.getApi()` -- obtain the API instance
- `void flag(Player, String checkName, String checkType, String info)` -- trigger a flag
- `void executeBanWave()` -- execute pending ban wave
- `IPlayerData getPlayerData(Player)` -- get player data
- `List<Check> getChecks(Player)` -- checks for a player
- `Set<String> getChecks()` -- all registered check names
- `Check getCheck(Player, String name, char type)` -- specific check
- `boolean isCheckEnabled(String)` -- check enabled globally
- `int getTotalViolations(Player)` -- total VL
- `int getPlayerViolations(Player)` -- player VL
- `int getCombatViolations(Player)` -- combat VL
- `int getMovementViolations(Player)` -- movement VL
- `double getCps(Player)` -- clicks per second
- `int getPing(Player)` -- player ping
- `int getTransactionPing(Player)` -- transaction ping
- `int getSensitivity(Player)` -- mouse sensitivity
- `double getKurtosis(Player)` -- rotation kurtosis
- `String getClientVersion(Player)` -- client version string
- `int getJoinTicks(Player)` -- ticks since join
- `boolean isFrozen(Player)` -- freeze state
- `void setFrozen(Player, boolean)` -- set freeze state
- `void toggleAlerts(Player)` -- toggle alert notifications
- `boolean hasAlertsEnabled(Player)` -- check alert state
- `void toggleVerbose(Player)` -- toggle verbose mode
- `double getTps()` -- server TPS
- `int getTicks()` -- server tick count
- `String getVulcanVersion()` -- Vulcan version
- `String getServerVersion()` -- server version
- `Map getMaxViolations()` -- max VL per check
- `Map getPunishmentCommands()` -- punishment commands per check
- `Map getPunishableChecks()` -- punishable check map
- `Map getEnabledChecks()` -- enabled check map
- `Map getCheckData()` -- all check data
- `Map getMaxBuffers()` -- max buffers per check
- `Map getBufferDecays()` -- buffer decay per check
- `Map getBufferMultiples()` -- buffer multiples per check
- `Map getAlertIntervals()` -- alert intervals per check
- `Map getMinimumViolationsToNotify()` -- min VL to notify per check
- `Map getMinimumTps()` -- min TPS per check
- `Map getMaximumPings()` -- max ping per check
- `Map getBroadcastPunishments()` -- broadcast punishment map
- `Map getRandomRotation()` -- random rotation map
- `Map getRandomRotationIntervals()` -- random rotation intervals
- `Map getRandomRotationMinimums()` -- random rotation minimums
- `Map getHotbarShuffle()` -- hotbar shuffle map
- `Map getHotbarShuffleIntervals()` -- hotbar shuffle intervals
- `Map getHotbarShuffleMinimums()` -- hotbar shuffle minimums

### Interface `me.frep.vulcan.api.check.Check`
- `String getName()` -- check name (e.g. "Speed")
- `char getType()` -- type char (e.g. 'A')
- `String getComplexType()` -- full type string
- `String getDisplayName()` -- display name
- `char getDisplayType()` -- display type char
- `String getCategory()` -- category (Combat, Movement, Player)
- `String getDescription()` -- description
- `int getVl()` / `void setVl(int)` -- violation level
- `double getBuffer()` / `void setBuffer(double)` -- buffer value
- `double getMaxBuffer()` -- max buffer
- `double getBufferDecay()` -- buffer decay rate
- `double getBufferMultiple()` -- buffer multiple
- `int getMaxVl()` -- max violations before punishment
- `int getAlertInterval()` -- alert interval
- `int getMinimumVlToNotify()` -- min VL before alerts
- `boolean isPunishable()` -- whether check can punish
- `boolean isExperimental()` -- whether check is experimental

### Interface `me.frep.vulcan.api.check.ICheckData`
- `boolean isEnabled()` -- check enabled
- `boolean isPunishable()` -- check punishable
- `int getMaxViolations()` -- max VL
- `List<String> getPunishmentCommands()` -- commands on punish
- `boolean isBroadcastPunishment()` -- broadcast on punish
- `double getMinimumTps()` -- min TPS to activate
- `int getMaxPing()` -- max ping to activate
- `int getAlertInterval()` -- alert interval
- `int getMinimumVlToNotify()` -- min VL to alert
- `double getMaxBuffer()` / `getBufferDecay()` / `getBufferMultiple()` -- buffer settings
- `boolean isRandomRotation()` -- random rotation enabled
- `int getRandomRotationInterval()` / `getMinimumVlToRandomlyRotate()` -- rotation settings
- `boolean isHotbarShuffle()` -- hotbar shuffle enabled
- `int getMinimumVlToShuffleHotbar()` -- min VL for hotbar shuffle

### Interface `me.frep.vulcan.api.data.IPlayerData`
- `long getJoinTime()` -- join timestamp
- `int getJoinTicks()` -- ticks since join
- `int getTotalViolations()` -- total VL
- `int getPlayerViolations()` -- player VL
- `int getCombatViolations()` -- combat VL
- `int getMovementViolations()` -- movement VL
- `int getScaffoldViolations()` -- scaffold VL
- `int getTimerViolations()` -- timer VL
- `int getAutoClickerViolations()` -- autoclicker VL
- `String getClientBrand()` -- client brand string
- `long getLastClientBrandAlert()` -- last brand alert timestamp

### Event Classes (all in `me.frep.vulcan.api.event`, extend `Event`, implement `Cancellable`)

| Event | Key Methods |
|---|---|
| `VulcanFlagEvent` | `getPlayer()`, `getCheck()`, `getInfo()`, `getTimestamp()` |
| `VulcanPostFlagEvent` | `getPlayer()`, `getCheck()`, `getInfo()`, `getTimestamp()` |
| `VulcanPunishEvent` | `getPlayer()`, `getCheck()` |
| `VulcanSetbackEvent` | `getPlayer()`, `getCheck()`, `getTimestamp()` |
| `VulcanGhostBlockEvent` | `getPlayer()`, `getTimestamp()` |
| `VulcanEnableAlertsEvent` | `getPlayer()`, `getTimestamp()` |
| `VulcanDisableAlertsEvent` | `getPlayer()`, `getTimestamp()` |
| `VulcanRegisterPlayerEvent` | `getPlayer()` |
| `VulcanPunishmentLogCreateEvent` | `getPlayer()` |
| `VulcanDiscordWebhookPunishEvent` | `getPlayer()`, `getTimestamp()` |
| `VulcanJudgementDayStartEvent` | *(no player)* |
| `VulcanJudgementDayEndEvent` | *(no player)* |
| `VulcanViolationResetEvent` | *(no player)* |
