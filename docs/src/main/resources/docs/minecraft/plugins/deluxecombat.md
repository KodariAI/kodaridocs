# DeluxeCombat API Reference

PvP combat tagging plugin with bounties, kill stats, protection, and PvP toggling. The API lets plugins check combat state, tag/untag players, manage bounties, query stats (kills, deaths, K/D, streaks), and listen for combat events. Add `DeluxeCombat` to `depend` or `softdepend` in plugin.yml.

## Code Examples

### Getting the API

```java
import nl.marido.deluxecombat.api.DeluxeCombatAPI;

DeluxeCombatAPI api = new DeluxeCombatAPI();
```

### Check Combat State

```java
import nl.marido.deluxecombat.api.DeluxeCombatAPI;
import org.bukkit.entity.Player;

DeluxeCombatAPI api = new DeluxeCombatAPI();

boolean inCombat = api.isInCombat(player);
int secondsLeft = api.getRemainingCombatTime(player);       // seconds
long millisLeft = api.getRemainingCombatTimeMillis(player);  // ms, 0L if not in combat
Player opponent = api.getCurrentOpponent(player);            // null if none
```

### Tag and Untag Players

```java
import nl.marido.deluxecombat.api.DeluxeCombatAPI;
import org.bukkit.entity.Player;

DeluxeCombatAPI api = new DeluxeCombatAPI();

// Tag a player into combat (attacker can be Player, Entity, or null)
api.tag(player, attacker, 15); // 15 seconds

// Remove combat tag
api.untag(player);
```

### Query Player Stats

```java
import nl.marido.deluxecombat.api.DeluxeCombatAPI;
import org.bukkit.entity.Player;

DeluxeCombatAPI api = new DeluxeCombatAPI();

int kills = api.getKills(player);
int deaths = api.getDeaths(player);
double kd = api.getKD(player);
int streak = api.getStreak(player);
int highestStreak = api.getHighestStreak(player);
int combatlogs = api.getCombatlogs(player);
int points = api.getPoints(player);
```

### Manage Points

```java
import nl.marido.deluxecombat.api.DeluxeCombatAPI;
import org.bukkit.entity.Player;

DeluxeCombatAPI api = new DeluxeCombatAPI();

api.addPoints(player, 100);
api.removePoints(player, 50);
```

### PvP Toggle and Protection

```java
import nl.marido.deluxecombat.api.DeluxeCombatAPI;
import org.bukkit.entity.Player;

DeluxeCombatAPI api = new DeluxeCombatAPI();

boolean pvpEnabled = api.hasPvPEnabled(player);
api.togglePvP(player, false); // disable PvP for player

boolean hasProtection = api.hasProtection(player); // newbie or respawn protection
```

### Bounties

```java
import nl.marido.deluxecombat.api.DeluxeCombatAPI;
import org.bukkit.entity.Player;

DeluxeCombatAPI api = new DeluxeCombatAPI();

// Create a bounty (returns false if failed)
boolean created = api.createBounty(target, initiator, false, 500.0, true);
// args: target, initiator, anonymous, amount, removeTax

boolean hasBounty = api.hasBounty(player);
api.removeBounty(player);
```

### Listen for Combat Events

```java
import nl.marido.deluxecombat.events.CombatStateChangeEvent;
import nl.marido.deluxecombat.events.CombatlogEvent;
import nl.marido.deluxecombat.events.PlayerTogglePVPEvent;
import nl.marido.deluxecombat.events.BountyInitiateEvent;
import nl.marido.deluxecombat.events.EntityCombatlogEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class CombatListener implements Listener {

    @EventHandler
    public void onCombatStateChange(CombatStateChangeEvent event) {
        // NOT cancellable
        Player player = event.getPlayer();
        CombatStateChangeEvent.CombatState state = event.getState();
        // CombatState.TAGGED or CombatState.UNTAGGED
    }

    @EventHandler
    public void onCombatlog(CombatlogEvent event) {
        // Cancellable
        Player logger = event.getCombatlogger();
        Player attacker = event.getLastAttacker();
        event.setCancelled(true); // prevent combatlog punishment
    }

    @EventHandler
    public void onEntityCombatlog(EntityCombatlogEvent event) {
        // Cancellable — entity caused the combatlog
        Player victim = event.getVictim();
        String entityName = event.getEntityName();
        org.bukkit.entity.EntityType entityType = event.getEntityType();
    }

    @EventHandler
    public void onPvPToggle(PlayerTogglePVPEvent event) {
        // Cancellable
        Player player = event.getPlayer();
        boolean oldStatus = event.getOldPVPStatus();
        boolean newStatus = event.getNewPVPStatus();
        // event.cancel("Custom reason"); // cancel with reason message
    }

    @EventHandler
    public void onBountyInitiate(BountyInitiateEvent event) {
        // Cancellable
        Player initiator = event.getInitiator();
        Player target = event.getTarget();
        double bounty = event.getBounty();
        boolean anonymous = event.isAnonymous();
    }
}
```

## API Reference (Trimmed)

### `nl.marido.deluxecombat.api.DeluxeCombatAPI`

Instantiate with `new DeluxeCombatAPI()`.

| Return | Method | Description |
|---|---|---|
| `boolean` | `isInCombat(Player)` | In combat |
| `int` | `getRemainingCombatTime(Player)` | Seconds left |
| `long` | `getRemainingCombatTimeMillis(Player)` | Millis left (0L if none) |
| `Player` | `getCurrentOpponent(Player)` | Current opponent |
| `void` | `tag(Player, Object attacker, int seconds)` | Tag into combat |
| `void` | `untag(Player)` | Remove combat tag |
| `boolean` | `hasPvPEnabled(Player)` | PvP status |
| `void` | `togglePvP(Player, boolean)` | Set PvP status |
| `boolean` | `hasProtection(Player)` | Newbie/respawn protection |
| `int` | `getKills(Player)` | Kill count |
| `int` | `getDeaths(Player)` | Death count |
| `double` | `getKD(Player)` | K/D ratio |
| `int` | `getStreak(Player)` | Current kill streak |
| `int` | `getHighestStreak(Player)` | Best kill streak |
| `int` | `getCombatlogs(Player)` | Combatlog count |
| `int` | `getPoints(Player)` | Points |
| `void` | `addPoints(Player, int)` | Add points |
| `void` | `removePoints(Player, int)` | Remove points |
| `boolean` | `createBounty(Player target, Player initiator, boolean anon, double amount, boolean removeTax)` | Create bounty |
| `boolean` | `hasBounty(Player)` | Has bounty |
| `void` | `removeBounty(Player)` | Remove bounty |

### Events (`nl.marido.deluxecombat.events`)

| Event | Cancellable | Key Methods |
|---|---|---|
| `CombatStateChangeEvent` | No | `getPlayer()`, `getState()` (`TAGGED`/`UNTAGGED`) |
| `CombatlogEvent` | Yes | `getCombatlogger()`, `getLastAttacker()`, `getLocation()` |
| `EntityCombatlogEvent` | Yes | `getVictim()`, `getEntityName()`, `getEntityType()` |
| `PlayerTogglePVPEvent` | Yes | `getPlayer()`, `getOldPVPStatus()`, `getNewPVPStatus()`, `cancel(String reason)` |
| `BountyInitiateEvent` | Yes | `getInitiator()`, `getTarget()`, `getBounty()`, `isAnonymous()` |
