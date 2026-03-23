# UpgradeableHoppers API Reference

Wireless hopper linking and upgrading plugin. The API lets plugins query hoppers at locations, manage links and filters, check permissions, handle hopper items, and listen for place/break/link events. Add `UpgradeableHoppers` to `depend` or `softdepend` in plugin.yml.

## Code Examples

### Getting the API

```java
import me.angeschossen.upgradeablehoppers.api.UpgradeableHoppersAPI;

UpgradeableHoppersAPI api = UpgradeableHoppersAPI.getInstance();
```

### Get a Hopper at a Location

```java
import me.angeschossen.upgradeablehoppers.api.UpgradeableHoppersAPI;
import me.angeschossen.upgradeablehoppers.api.hopper.Hopper;
import org.bukkit.Location;

UpgradeableHoppersAPI api = UpgradeableHoppersAPI.getInstance();

Hopper hopper = api.getHopper(location); // null if not an upgradeable hopper
if (hopper != null) {
    java.util.UUID owner = hopper.getOwner();
    boolean full = hopper.isFull();
}
```

### Add and Remove Items

```java
import me.angeschossen.upgradeablehoppers.api.hopper.Hopper;
import me.angeschossen.upgradeablehoppers.api.UpgradeableHoppersAPI;
import org.bukkit.inventory.ItemStack;

Hopper hopper = UpgradeableHoppersAPI.getInstance().getHopper(location);
if (hopper != null) {
    // Add item (returns leftover, null if fully added)
    ItemStack leftover = hopper.addItem(itemStack);

    // Remove item (returns removed item, null if not found)
    ItemStack removed = hopper.removeItem(itemStack);
}
```

### Check Permissions

```java
import me.angeschossen.upgradeablehoppers.api.hopper.Hopper;
import me.angeschossen.upgradeablehoppers.api.hopper.role.RoleFlag;
import me.angeschossen.upgradeablehoppers.api.UpgradeableHoppersAPI;
import org.bukkit.entity.Player;

Hopper hopper = UpgradeableHoppersAPI.getInstance().getHopper(location);
if (hopper != null) {
    boolean canOpen = hopper.canAction(player, RoleFlag.OPEN);
    boolean canUpgrade = hopper.canAction(player, RoleFlag.UPGRADE);
    boolean canDelete = hopper.canAction(player, RoleFlag.DELETE);
}
```

### Manage Links

```java
import me.angeschossen.upgradeablehoppers.api.hopper.Hopper;
import me.angeschossen.upgradeablehoppers.api.hopper.link.Link;
import me.angeschossen.upgradeablehoppers.api.UpgradeableHoppersAPI;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

Hopper hopper = UpgradeableHoppersAPI.getInstance().getHopper(location);
if (hopper != null) {
    // Add a link to a container
    Link link = hopper.addLink(containerBlock, player);

    // Get all links
    List<? extends Link> links = hopper.getLinks();
    boolean hasLinks = hopper.hasLinks();

    // Check if an item passes link filters
    boolean passes = hopper.passesLinkFilters(itemStack);

    // Work with individual links
    for (Link l : links) {
        boolean loaded = l.isLoaded();
        boolean passesFilter = l.passesFilter(itemStack);
        l.setWhiteList(true);
        l.setStrictFiltering(false);
    }
}
```

### Register a Hopper Programmatically

```java
import me.angeschossen.upgradeablehoppers.api.UpgradeableHoppersAPI;
import me.angeschossen.upgradeablehoppers.api.hopper.Hopper;
import org.bukkit.block.Block;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

UpgradeableHoppersAPI api = UpgradeableHoppersAPI.getInstance();

CompletableFuture<Hopper> future = api.registerHopper(plugin, null, block, ownerUUID);
future.thenAccept(hopper -> {
    // Hopper registered
});
```

### Listen for Hopper Events

```java
import me.angeschossen.upgradeablehoppers.api.events.hopper.HopperPlaceEvent;
import me.angeschossen.upgradeablehoppers.api.events.hopper.HopperBreakEvent;
import me.angeschossen.upgradeablehoppers.api.events.hopper.link.LinkCreationEvent;
import me.angeschossen.upgradeablehoppers.api.events.hopper.link.LinkDeletionEvent;
import me.angeschossen.upgradeablehoppers.api.hopper.Hopper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class HopperListener implements Listener {

    @EventHandler
    public void onPlace(HopperPlaceEvent event) {
        // Cancellable
        Hopper hopper = event.getHopper();
    }

    @EventHandler
    public void onBreak(HopperBreakEvent event) {
        // Cancellable (except when reason is INVALID)
        Hopper hopper = event.getHopper();
        HopperBreakEvent.Reason reason = event.getReason();
        // Reason: PLAYER, INVALID, EXPLOSION
    }

    @EventHandler
    public void onLinkCreate(LinkCreationEvent event) {
        // Cancellable
        Hopper hopper = event.getHopper();
    }

    @EventHandler
    public void onLinkDelete(LinkDeletionEvent event) {
        // Cancellable (except when reason is INVALID)
        Hopper hopper = event.getHopper();
        LinkDeletionEvent.Reason reason = event.getReason();
    }
}
```

## API Reference (Trimmed)

### `me.angeschossen.upgradeablehoppers.api.UpgradeableHoppersAPI`

| Return | Method | Description |
|---|---|---|
| `static UpgradeableHoppersAPI` | `getInstance()` | Singleton |
| `Hopper` | `getHopper(Location)` | Get hopper at location |
| `HopperPlayer` | `getHopperPlayer(Player)` | Get online player data |
| `CompletableFuture<Hopper>` | `registerHopper(Plugin, String type, Block, UUID owner)` | Register new hopper |

### `me.angeschossen.upgradeablehoppers.api.hopper.Hopper`

| Return | Method | Description |
|---|---|---|
| `ItemStack` | `addItem(ItemStack)` | Add item (returns leftover) |
| `ItemStack` | `removeItem(ItemStack)` | Remove item |
| `Link` | `addLink(Block, Player)` | Link a container |
| `boolean` | `removeLink(HopperPlayer, World, int x, int y, int z, Reason)` | Remove a link |
| `List<? extends Link>` | `getLinks()` | All links |
| `boolean` | `hasLinks()` | Has any links |
| `boolean` | `passesLinkFilters(ItemStack)` | Passes filters |
| `boolean` | `canAction(Player, RoleFlag)` | Permission check |
| `UUID` | `getOwner()` | Owner UUID |
| `void` | `setOwner(UUID)` | Set owner |
| `boolean` | `isFull()` | Is full |
| `ItemStack` | `buildUpgradeableHopperItem()` | Get hopper item |

### Enums

| Enum | Values |
|---|---|
| `RoleFlag` | `UPGRADE`, `OPEN`, `DELETE` |
| `HopperFlag` | `SUCTION_ENABLED`, `FILTER_DELETE`, `FILTER_BLACKLIST`, `INSERT_BY_ORDER` |
| `Action` | `LINK`, `LINK_PERMANENT`, `UNLINK`, `UNLINK_PERMANENT`, `NONE` |

### Events

| Event | Package | Cancellable | Key Methods |
|---|---|---|---|
| `HopperPlaceEvent` | `me.angeschossen.upgradeablehoppers.api.events.hopper` | Yes | `getHopper()`, `getHopperPlayer()` |
| `HopperBreakEvent` | `me.angeschossen.upgradeablehoppers.api.events.hopper` | Yes* | `getHopper()`, `getReason()` |
| `LinkCreationEvent` | `me.angeschossen.upgradeablehoppers.api.events.hopper.link` | Yes | `getHopper()`, `getBlockInventoryHolder()` |
| `LinkDeletionEvent` | `me.angeschossen.upgradeablehoppers.api.events.hopper.link` | Yes* | `getHopper()`, `getLink()`, `getReason()` |

> *Cannot cancel when reason is `INVALID`
