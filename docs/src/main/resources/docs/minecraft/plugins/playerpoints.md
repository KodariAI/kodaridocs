# PlayerPoints API Reference

Currency plugin by Rosewood Development. The API lets plugins give/take/set/reset/transfer points, query balances, look up leaderboards, and listen for change events. All API methods take `UUID` (not `Player`). Add `PlayerPoints` to `depend` or `softdepend` in plugin.yml.

> **Important:** Events may fire on either the main thread or async. Always treat handlers as async-safe — if you need to interact with the Bukkit API, schedule back to the main thread.

> **Important:** The API does NOT prevent negative balances. If that matters, check `look()` before calling `take()`.

## Code Examples

### Getting the API

```java
import org.black_ixx.playerpoints.PlayerPoints;
import org.black_ixx.playerpoints.PlayerPointsAPI;

PlayerPointsAPI api = PlayerPoints.getInstance().getAPI();
```

### Give and Take Points

```java
import org.black_ixx.playerpoints.PlayerPoints;
import org.black_ixx.playerpoints.PlayerPointsAPI;
import org.bukkit.entity.Player;

import java.util.UUID;

PlayerPointsAPI api = PlayerPoints.getInstance().getAPI();
UUID playerId = player.getUniqueId();

// Give 100 points
api.give(playerId, 100);

// Take 50 points (won't auto-clamp at 0 — guard yourself)
api.take(playerId, 50);

// Optionally pass a sourceId for audit tracking (who initiated)
api.give(playerId, sourceUuid, 100);
```

### Check Balance

```java
import org.black_ixx.playerpoints.PlayerPointsAPI;

PlayerPointsAPI api = PlayerPoints.getInstance().getAPI();

int balance = api.look(playerId);
String formatted = api.lookFormatted(playerId);  // "1,234,567"
String shorthand = api.lookShorthand(playerId);  // "1.2M"
```

### Set or Reset Balance

```java
import org.black_ixx.playerpoints.PlayerPointsAPI;

PlayerPointsAPI api = PlayerPoints.getInstance().getAPI();

// Set exact balance
api.set(playerId, 500);

// Reset to 0 (fires PlayerPointsResetEvent)
api.reset(playerId);
```

### Player-to-Player Transfer

```java
import org.black_ixx.playerpoints.PlayerPointsAPI;

PlayerPointsAPI api = PlayerPoints.getInstance().getAPI();

// Atomic — if receiver side fails or is cancelled, sender is refunded
boolean success = api.pay(fromUuid, toUuid, 200);
```

### Give to Multiple Players

```java
import org.black_ixx.playerpoints.PlayerPointsAPI;

import java.util.List;
import java.util.UUID;

PlayerPointsAPI api = PlayerPoints.getInstance().getAPI();

List<UUID> winners = List.of(uuid1, uuid2, uuid3);
api.giveAll(winners, 50); // returns true if at least one succeeded
```

### Leaderboard

```java
import org.black_ixx.playerpoints.PlayerPointsAPI;
import org.black_ixx.playerpoints.models.SortedPlayer;

import java.util.List;

PlayerPointsAPI api = PlayerPoints.getInstance().getAPI();

List<SortedPlayer> top10 = api.getTopSortedPoints(10);
for (SortedPlayer entry : top10) {
    String name = entry.getUsername();
    int points = entry.getPoints();
}
```

### Look Up UUID by Name

```java
import org.black_ixx.playerpoints.PlayerPointsAPI;

import java.util.UUID;

PlayerPointsAPI api = PlayerPoints.getInstance().getAPI();
UUID id = api.getAccountUUIDByName("PlayerName"); // offline-safe, uses cache
```

### Listen for Point Changes

```java
import org.black_ixx.playerpoints.event.PlayerPointsChangeEvent;
import org.black_ixx.playerpoints.event.PlayerPointsResetEvent;
import org.black_ixx.playerpoints.models.TransactionType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.UUID;

public class PointsListener implements Listener {

    @EventHandler
    public void onChange(PlayerPointsChangeEvent event) {
        // Cancellable, may be async
        UUID playerId = event.getPlayerId();
        int delta = event.getChange();   // delta, NOT the final balance
        TransactionType type = event.getTransactionType();
        // OFFSET, PAY_SENDER, PAY_RECEIVER, SET

        // Modify the change amount
        if (type == TransactionType.OFFSET && delta > 0) {
            event.setChange((int) (delta * 1.5)); // 50% bonus on gains
        }

        // Or cancel entirely
        if (delta < -1000) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onReset(PlayerPointsResetEvent event) {
        // Cancellable, may be async
        UUID playerId = event.getPlayerId();
    }
}
```

## API Reference (Trimmed)

### `org.black_ixx.playerpoints.PlayerPointsAPI`

Get via `PlayerPoints.getInstance().getAPI()`.

| Return | Method | Description |
|---|---|---|
| `boolean` | `give(UUID, int)` | Add points |
| `boolean` | `give(UUID, UUID sourceId, int)` | Add with audit source |
| `boolean` | `take(UUID, int)` | Subtract (no negative protection) |
| `boolean` | `take(UUID, UUID sourceId, int)` | Subtract with source |
| `boolean` | `giveAll(Collection<UUID>, int)` | Bulk give |
| `boolean` | `set(UUID, int)` | Set exact balance |
| `boolean` | `set(UUID, UUID sourceId, int)` | Set with source |
| `boolean` | `reset(UUID)` | Reset to 0 (fires reset event) |
| `boolean` | `reset(UUID, UUID sourceId)` | Reset with source |
| `boolean` | `pay(UUID source, UUID target, int)` | Atomic transfer (auto-refund on fail) |
| `int` | `look(UUID)` | Current balance |
| `String` | `lookFormatted(UUID)` | Comma-formatted balance |
| `String` | `lookShorthand(UUID)` | Shorthand balance ("1.2M") |
| `List<SortedPlayer>` | `getTopSortedPoints(int limit)` | Leaderboard |
| `List<SortedPlayer>` | `getTopSortedPoints()` | Full leaderboard |
| `UUID` | `getAccountUUIDByName(String name)` | UUID lookup by name |

### `org.black_ixx.playerpoints.models.SortedPlayer`

| Return | Method | Description |
|---|---|---|
| `UUID` | `getUniqueId()` | Player UUID |
| `String` | `getUsername()` | Player name |
| `int` | `getPoints()` | Point balance |

### `org.black_ixx.playerpoints.models.TransactionType` (enum)

| Value | When |
|---|---|
| `OFFSET` | `give`, `take`, `giveAll` |
| `PAY_SENDER` | `pay` (debit side) |
| `PAY_RECEIVER` | `pay` (credit side) |
| `SET` | `set` |

### Events (`org.black_ixx.playerpoints.event`)

| Event | Cancellable | Key Methods |
|---|---|---|
| `PlayerPointsChangeEvent` | Yes | `getPlayerId()`, `getChange()` (delta), `setChange(int)`, `getTransactionType()` |
| `PlayerPointsResetEvent` | Yes | `getPlayerId()`, `getChange()` (always 0) |

> **Note:** For a `SET` transaction, `event.getChange()` is the delta `(target - current)`, NOT the final balance. To get the final balance, use `currentBalance + event.getChange()` or call `api.look()` after the event.
