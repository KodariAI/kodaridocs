# GSit API Reference

Sit, lay, crawl, and pose plugin by Gecolay. The API lets plugins create/remove seats, poses, and crawls, check player states, manage player-on-player sitting, and listen for pre/post events on all actions. Add `GSit` to `depend` or `softdepend` in plugin.yml.

## Code Examples

### Getting the API

```java
import dev.geco.gsit.api.GSitAPI;

// All methods are static — no instance needed
boolean sitting = GSitAPI.isEntitySitting(entity);
```

### Check if a Player is Sitting, Posing, or Crawling

```java
import dev.geco.gsit.api.GSitAPI;
import org.bukkit.entity.Player;

boolean sitting = GSitAPI.isEntitySitting(player);
boolean posing = GSitAPI.isPlayerPosing(player);
boolean crawling = GSitAPI.isPlayerCrawling(player);
```

### Create and Remove a Seat

```java
import dev.geco.gsit.api.GSitAPI;
import dev.geco.gsit.model.Seat;
import dev.geco.gsit.model.StopReason;
import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;

// Simple seat on a block
Seat seat = GSitAPI.createSeat(block, player); // null if failed

// Seat with options
Seat seat = GSitAPI.createSeat(block, player,
    true,   // canRotate
    0.0,    // xOffset
    0.0,    // yOffset
    0.0,    // zOffset
    0.0f,   // seatRotation
    true    // sitInBlockCenter
);

// Remove a seat
if (seat != null) {
    GSitAPI.removeSeat(seat, StopReason.PLUGIN);
}

// Get seat info
if (seat != null) {
    Block seatBlock = seat.getBlock();
    LivingEntity sittingEntity = seat.getEntity();
    org.bukkit.Location returnLoc = seat.getReturnLocation();
}
```

### Create and Remove a Pose

```java
import dev.geco.gsit.api.GSitAPI;
import dev.geco.gsit.model.Pose;
import dev.geco.gsit.model.PoseType;
import dev.geco.gsit.model.StopReason;
import org.bukkit.entity.Player;

// PoseType: LAY, LAY_BACK, BELLYFLOP, SPIN
Pose pose = GSitAPI.createPose(block, player, PoseType.LAY);

// With options
Pose pose = GSitAPI.createPose(block, player, PoseType.BELLYFLOP,
    0.0f,  // seatRotation
    true   // sitInBlockCenter
);

// Remove
if (pose != null) {
    GSitAPI.removePose(pose, StopReason.PLUGIN);
}
```

### Start and Stop Crawling

```java
import dev.geco.gsit.api.GSitAPI;
import dev.geco.gsit.model.Crawl;
import dev.geco.gsit.model.StopReason;
import org.bukkit.entity.Player;

Crawl crawl = GSitAPI.startCrawl(player); // null if failed

if (crawl != null) {
    GSitAPI.stopCrawl(crawl, StopReason.PLUGIN);
}
```

### Player-on-Player Sitting

```java
import dev.geco.gsit.api.GSitAPI;
import dev.geco.gsit.model.StopReason;
import org.bukkit.entity.Player;

// Sit on another player
GSitAPI.sitOnPlayer(player, targetPlayer);

// Stop
GSitAPI.stopPlayerSit(player, StopReason.PLUGIN);

// Toggle permission
GSitAPI.setPlayerCanUsePlayerSit(player.getUniqueId(), false);
boolean canSit = GSitAPI.canPlayerUsePlayerSit(player.getUniqueId());
```

### Query All Active Seats/Poses/Crawls

```java
import dev.geco.gsit.api.GSitAPI;
import dev.geco.gsit.model.Seat;
import dev.geco.gsit.model.Pose;
import dev.geco.gsit.model.Crawl;

import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

HashMap<UUID, Seat> allSeats = GSitAPI.getAllSeats();
HashMap<UUID, Pose> allPoses = GSitAPI.getAllPoses();
HashMap<UUID, Crawl> allCrawls = GSitAPI.getAllCrawls();

// Seats on a specific block
Set<Seat> blockSeats = GSitAPI.getSeatsByBlock(block);
Set<Pose> blockPoses = GSitAPI.getPosesByBlock(block);

// Get by entity/player
Seat seat = GSitAPI.getSeatByEntity(entity);    // null if not sitting
Pose pose = GSitAPI.getPoseByPlayer(player);     // null if not posing
Crawl crawl = GSitAPI.getCrawlByPlayer(player);  // null if not crawling
```

### Listen for Events

Pre-events fire before the action and are cancellable. Post-events fire after and are not cancellable.

```java
import dev.geco.gsit.api.event.PreEntitySitEvent;
import dev.geco.gsit.api.event.EntitySitEvent;
import dev.geco.gsit.api.event.PreEntityStopSitEvent;
import dev.geco.gsit.api.event.PrePlayerPoseEvent;
import dev.geco.gsit.api.event.PrePlayerCrawlEvent;
import dev.geco.gsit.api.event.PlayerCrawlEvent;
import dev.geco.gsit.model.StopReason;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class SitListener implements Listener {

    @EventHandler
    public void onPreSit(PreEntitySitEvent event) {
        // Cancellable — block before sitting happens
        if (!event.getEntity().hasPermission("myPlugin.sit")) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onSit(EntitySitEvent event) {
        // NOT cancellable — entity is now sitting
        event.getEntity();  // the sitting entity
        event.getSeat();    // the Seat object
    }

    @EventHandler
    public void onPreStopSit(PreEntityStopSitEvent event) {
        // Cancellable (depends on StopReason)
        StopReason reason = event.getReason();
        if (reason.isCancellable()) {
            event.setCancelled(true); // keep them sitting
        }
    }

    @EventHandler
    public void onPrePose(PrePlayerPoseEvent event) {
        // Cancellable
        event.setCancelled(true);
    }

    @EventHandler
    public void onPreCrawl(PrePlayerCrawlEvent event) {
        // Cancellable
        event.setCancelled(true);
    }
}
```

## API Reference (Trimmed)

### `dev.geco.gsit.api.GSitAPI` (all static)

| Return | Method | Description |
|---|---|---|
| `GSitMain` | `getInstance()` | Plugin instance |
| `boolean` | `isEntitySitting(LivingEntity)` | Is sitting |
| `boolean` | `isPlayerPosing(Player)` | Is posing |
| `boolean` | `isPlayerCrawling(Player)` | Is crawling |
| `Seat` | `getSeatByEntity(LivingEntity)` | Get seat |
| `Pose` | `getPoseByPlayer(Player)` | Get pose |
| `Crawl` | `getCrawlByPlayer(Player)` | Get crawl |
| `Set<Seat>` | `getSeatsByBlock(Block)` | Seats on block |
| `Set<Pose>` | `getPosesByBlock(Block)` | Poses on block |
| `HashMap<UUID, Seat>` | `getAllSeats()` | All seats |
| `HashMap<UUID, Pose>` | `getAllPoses()` | All poses |
| `HashMap<UUID, Crawl>` | `getAllCrawls()` | All crawls |
| `Seat` | `createSeat(Block, LivingEntity)` | Create seat |
| `Seat` | `createSeat(Block, LivingEntity, boolean rotate, double x, double y, double z, float rotation, boolean center)` | Full options |
| `boolean` | `removeSeat(Seat, StopReason)` | Remove seat |
| `Pose` | `createPose(Block, Player, PoseType)` | Create pose |
| `boolean` | `removePose(Pose, StopReason)` | Remove pose |
| `Crawl` | `startCrawl(Player)` | Start crawling |
| `boolean` | `stopCrawl(Crawl, StopReason)` | Stop crawling |
| `boolean` | `sitOnPlayer(Player, Player target)` | Sit on player |
| `boolean` | `stopPlayerSit(Player, StopReason)` | Stop player sit |

### Enums

**`PoseType`** (`dev.geco.gsit.model`): `LAY`, `LAY_BACK`, `BELLYFLOP`, `SPIN`

**`StopReason`** (`dev.geco.gsit.model`): `BLOCK_BREAK`, `DAMAGE`, `DEATH`, `ENVIRONMENT`, `GAMEMODE_CHANGE`, `GET_UP`, `KICKED`, `PLUGIN`, `REGION`, `TELEPORT`, `DISCONNECT`
- Use `reason.isCancellable()` to check if the stop can be prevented

### Events (`dev.geco.gsit.api.event`)

All `Pre*` events are cancellable. All non-pre events are NOT cancellable.

| Event | Cancellable | Key Methods |
|---|---|---|
| `PreEntitySitEvent` | Yes | `getEntity()`, `getBlock()` |
| `EntitySitEvent` | No | `getEntity()`, `getSeat()` |
| `PreEntityStopSitEvent` | Yes | `getEntity()`, `getSeat()`, `getReason()` |
| `EntityStopSitEvent` | No | `getEntity()`, `getSeat()`, `getReason()` |
| `PrePlayerPlayerSitEvent` | Yes | `getPlayer()`, `getTarget()` |
| `PlayerPlayerSitEvent` | No | `getPlayer()`, `getTarget()` |
| `PrePlayerStopPlayerSitEvent` | Yes | `getPlayer()`, `getReason()` |
| `PlayerStopPlayerSitEvent` | No | `getPlayer()`, `getReason()` |
| `PrePlayerPoseEvent` | Yes | `getPlayer()`, `getBlock()` |
| `PlayerPoseEvent` | No | `getPlayer()`, `getPose()` |
| `PrePlayerStopPoseEvent` | Yes | `getPlayer()`, `getPose()`, `getReason()` |
| `PlayerStopPoseEvent` | No | `getPlayer()`, `getPose()`, `getReason()` |
| `PrePlayerCrawlEvent` | Yes | `getPlayer()` |
| `PlayerCrawlEvent` | No | `getPlayer()`, `getCrawl()` |
| `PrePlayerStopCrawlEvent` | Yes | `getPlayer()`, `getCrawl()`, `getReason()` |
| `PlayerStopCrawlEvent` | No | `getPlayer()`, `getCrawl()`, `getReason()` |
