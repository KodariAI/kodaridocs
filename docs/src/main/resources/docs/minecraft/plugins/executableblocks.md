# ExecutableBlocks API

API for managing custom blocks created with ExecutableBlocks (SSOMAR). Retrieve block configs, place/break executable blocks, detect placed blocks, and listen to block events.

## Code Examples

### Check if ExecutableBlocks is Available

```java
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

Plugin eb = Bukkit.getPluginManager().getPlugin("ExecutableBlocks");
if (eb != null && eb.isEnabled()) {
    // ExecutableBlocks API is available
}
```

### Get an ExecutableBlock by ID and Place It

```java
import com.ssomar.score.api.executableblocks.ExecutableBlocksAPI;
import com.ssomar.score.api.executableblocks.config.ExecutableBlockInterface;
import com.ssomar.score.api.executableblocks.config.ExecutableBlocksManagerInterface;
import com.ssomar.score.api.executableblocks.config.placed.ExecutableBlockPlacedInterface;
import com.ssomar.score.utils.place.OverrideMode;
import org.bukkit.Location;

import java.util.Optional;

ExecutableBlocksManagerInterface manager = ExecutableBlocksAPI.getExecutableBlocksManager();
Optional<ExecutableBlockInterface> ebOpt = manager.getExecutableBlock("my_block_id");
if (ebOpt.isPresent()) {
    ExecutableBlockInterface eb = ebOpt.get();
    Location loc = new Location(world, 100, 64, 200);
    // placeBlock=true physically sets the block, OverrideMode controls existing EBP behavior
    Optional<ExecutableBlockPlacedInterface> placed = eb.place(loc, true, OverrideMode.REMOVE_EXISTING, null, null);
}
```

### Check if a Block is an ExecutableBlock

```java
import com.ssomar.score.api.executableblocks.ExecutableBlocksAPI;
import com.ssomar.score.api.executableblocks.config.placed.ExecutableBlockPlacedInterface;
import com.ssomar.score.api.executableblocks.config.placed.ExecutableBlocksPlacedManagerInterface;
import org.bukkit.block.Block;

import java.util.Optional;

ExecutableBlocksPlacedManagerInterface placedManager = ExecutableBlocksAPI.getExecutableBlocksPlacedManager();
Block block = /* target block */;
Optional<ExecutableBlockPlacedInterface> ebpOpt = placedManager.getExecutableBlockPlaced(block);
if (ebpOpt.isPresent()) {
    ExecutableBlockPlacedInterface ebp = ebpOpt.get();
    String ebId = ebp.getEB_ID();
    // This block is an ExecutableBlock with ID: ebId
}
```

### Identify an ExecutableBlock from an ItemStack

```java
import com.ssomar.score.api.executableblocks.ExecutableBlocksAPI;
import com.ssomar.score.api.executableblocks.config.ExecutableBlockObjectInterface;
import org.bukkit.inventory.ItemStack;

ItemStack item = /* some item */;
ExecutableBlockObjectInterface ebObj = ExecutableBlocksAPI.getExecutableBlockObject(item);
if (ebObj.isValid()) {
    // This ItemStack is an ExecutableBlock item
}
```

### Break an ExecutableBlock Programmatically

```java
import com.ssomar.score.api.executableblocks.ExecutableBlocksAPI;
import com.ssomar.score.api.executableblocks.config.placed.ExecutableBlockPlacedInterface;
import com.ssomar.score.api.executableblocks.config.placed.ExecutableBlocksPlacedManagerInterface;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Optional;

ExecutableBlocksPlacedManagerInterface placedManager = ExecutableBlocksAPI.getExecutableBlocksPlacedManager();
Optional<ExecutableBlockPlacedInterface> ebpOpt = placedManager.getExecutableBlockPlaced(block);
if (ebpOpt.isPresent()) {
    ExecutableBlockPlacedInterface ebp = ebpOpt.get();
    ebp.breakBlock(player, true);  // true = drop items
    // Or remove without dropping:
    // ebp.remove();
}
```

### Drop an ExecutableBlock Item at a Location

```java
import com.ssomar.score.api.executableblocks.ExecutableBlocksAPI;
import com.ssomar.score.api.executableblocks.config.ExecutableBlockInterface;
import com.ssomar.score.api.executableblocks.config.ExecutableBlocksManagerInterface;
import org.bukkit.Location;
import org.bukkit.entity.Item;

import java.util.Optional;

ExecutableBlocksManagerInterface manager = ExecutableBlocksAPI.getExecutableBlocksManager();
Optional<ExecutableBlockInterface> ebOpt = manager.getExecutableBlock("my_block_id");
if (ebOpt.isPresent()) {
    Item droppedItem = ebOpt.get().dropItem(location, 1);
}
```

### List All ExecutableBlock IDs

```java
import com.ssomar.score.api.executableblocks.ExecutableBlocksAPI;
import com.ssomar.score.api.executableblocks.config.ExecutableBlocksManagerInterface;

import java.util.List;

ExecutableBlocksManagerInterface manager = ExecutableBlocksAPI.getExecutableBlocksManager();
List<String> allIds = manager.getExecutableBlockIdsList();
boolean exists = manager.isValidID("my_block_id");
```

### Update a Variable on a Placed Block

```java
import com.ssomar.score.api.executableblocks.ExecutableBlocksAPI;
import com.ssomar.score.api.executableblocks.config.placed.ExecutableBlockPlacedInterface;
import com.ssomar.score.api.executableblocks.config.placed.ExecutableBlocksPlacedManagerInterface;
import com.ssomar.score.utils.emums.VariableUpdateType;
import org.bukkit.block.Block;

import java.util.Optional;

ExecutableBlocksPlacedManagerInterface placedManager = ExecutableBlocksAPI.getExecutableBlocksPlacedManager();
Optional<ExecutableBlockPlacedInterface> ebpOpt = placedManager.getExecutableBlockPlaced(block);
if (ebpOpt.isPresent()) {
    ExecutableBlockPlacedInterface ebp = ebpOpt.get();
    ebp.updateVariable("myVar", "100", VariableUpdateType.SET);
    ebp.updateVariable("myList", "newEntry", VariableUpdateType.LIST_ADD);
    ebp.updateUsage(5);
}
```

### Listen to ExecutableBlock Events

```java
import com.ssomar.score.api.executableblocks.events.ExecutableBlockPlaceEvent;
import com.ssomar.score.api.executableblocks.events.ExecutableBlockBreakEvent;
import com.ssomar.score.api.executableblocks.config.placed.ExecutableBlockPlacedInterface;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EBListener implements Listener {

    @EventHandler
    public void onEBPlace(ExecutableBlockPlaceEvent event) {
        ExecutableBlockPlacedInterface placed = event.getExecutableBlockPlaced();
        // event.getPlacer() returns Entity (nullable), event.setCancelled(true) to cancel
        String ebId = placed.getEB_ID();
    }

    @EventHandler
    public void onEBBreak(ExecutableBlockBreakEvent event) {
        // event.getPlayer() may be null
        // event.getBlock() returns the bukkit Block
        // event.getBreakMethod() returns ExecutableBlockPlaced.BreakMethod enum
        // event.getSourceEvent() returns the original bukkit Event (nullable)
        event.setCancelled(true); // prevent breaking
    }
}
```

### Wait for ExecutableBlocks to Finish Loading

```java
import com.ssomar.score.api.executableblocks.load.ExecutableBlocksPostLoadEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EBLoadListener implements Listener {

    @EventHandler
    public void onEBLoaded(ExecutableBlocksPostLoadEvent event) {
        // All ExecutableBlocks configs are now loaded and ready to query
    }
}
```

## API Reference

### com.ssomar.score.api.executableblocks.ExecutableBlocksAPI

Static entry point for the entire API.

- `static ExecutableBlocksManagerInterface getExecutableBlocksManager()` - access block configs
- `static ExecutableBlocksPlacedManagerInterface getExecutableBlocksPlacedManager()` - access placed blocks
- `static ExecutableBlockObjectInterface getExecutableBlockObject(ItemStack)` - wrap an ItemStack to check if it is an EB

### com.ssomar.score.api.executableblocks.config.ExecutableBlocksManagerInterface

- `boolean isValidID(String id)`
- `Optional<ExecutableBlockInterface> getExecutableBlock(String id)`
- `Optional<ExecutableBlockInterface> getExecutableBlock(ItemStack itemStack)`
- `List<ExecutableBlockInterface> getAllExecutableBlocks()`
- `List<String> getExecutableBlockIdsList()`

### com.ssomar.score.api.executableblocks.config.ExecutableBlockInterface

Extends: `com.ssomar.score.sobject.SObjectInterface`, `SObjectWithActivators`, `SObjectBuildable`, `SObjectWithVariables`

- `String getId()` - inherited from SObjectInterface
- `boolean hasBlockPerm(@NotNull Player player, boolean showError)`
- `void addCooldown(Player player, int cooldown, boolean isInTicks)`
- `void addCooldown(Player player, int cooldown, boolean isInTicks, String activatorID)`
- `Item dropItem(Location location, int amount)`
- `Optional<ExecutableBlockPlacedInterface> place(@NotNull Location location, boolean placeBlock, OverrideMode overrideMode, @Nullable Entity placer, @Nullable InternalData overrideInternalData)`

### com.ssomar.score.api.executableblocks.config.ExecutableBlockObjectInterface

Wraps an ItemStack to extract ExecutableBlock data.

- `boolean isValid()` - true if the ItemStack is an ExecutableBlock
- `InternalData getInternalData()`
- `String updateVariable(String variableName, String value, VariableUpdateType type)`

### com.ssomar.score.api.executableblocks.config.placed.ExecutableBlockPlacedInterface

Represents an ExecutableBlock that has been placed in the world.

- `String getEB_ID()`
- `Location getLocation()`
- `ExecutableBlockInterface getExecutableBlockConfig()`
- `InternalData getInternalData()`
- `void breakBlock(@Nullable Player player, boolean drop)` - break with optional drops
- `void remove()` - remove without break logic
- `String updateVariable(String variableName, String value, VariableUpdateType type)`
- `void updateUsage(int usage)`

### com.ssomar.score.api.executableblocks.config.placed.ExecutableBlocksPlacedManagerInterface

- `Optional<ExecutableBlockPlacedInterface> getExecutableBlockPlaced(Location location)`
- `Optional<ExecutableBlockPlacedInterface> getExecutableBlockPlaced(Block block)`
- `void removeExecutableBlockPlaced(ExecutableBlockPlacedInterface eBP)`

### com.ssomar.score.api.executableblocks.events.ExecutableBlockPlaceEvent

Extends: `org.bukkit.event.Event`, implements `org.bukkit.event.Cancellable`

- `@Nullable Entity getPlacer()`
- `ExecutableBlockPlacedInterface getExecutableBlockPlaced()`
- `boolean isCancelled()` / `void setCancelled(boolean)`

### com.ssomar.score.api.executableblocks.events.ExecutableBlockBreakEvent

Extends: `org.bukkit.event.Event`, implements `org.bukkit.event.Cancellable`

- `@Nullable Player getPlayer()`
- `Block getBlock()`
- `ExecutableBlockPlaced.BreakMethod getBreakMethod()`
- `@Nullable Event getSourceEvent()`
- `boolean isCancelled()` / `void setCancelled(boolean)`

### com.ssomar.score.api.executableblocks.load.ExecutableBlocksPostLoadEvent

Extends: `org.bukkit.event.Event` - fired when all ExecutableBlocks configs finish loading.

### com.ssomar.score.utils.place.OverrideMode

Enum controlling behavior when placing at a location that already has an ExecutableBlock.

- `REMOVE_EXISTING` - silently remove the existing placed block
- `KEEP_EXISTING` - keep the existing placed block, skip placement
- `BREAK_EXISTING` - break the existing placed block (with break logic)

### com.ssomar.score.utils.emums.VariableUpdateType

Enum for variable update operations.

- `SET` - set the variable to the value
- `MODIFICATION` - modify (add/subtract) a numeric variable
- `LIST_ADD` - add an entry to a list variable
- `LIST_REMOVE` - remove an entry from a list variable
- `LIST_CLEAR` - clear all entries from a list variable

### com.ssomar.score.sobject.InternalData

Data carrier for usage, variables, and owner info. Setters return `this` for chaining.

- `InternalData()` - constructor, defaults: usage=-1, all fields null
- `InternalData setUsage(int usage)`
- `InternalData setVariables(Map<String, String> variables)`
- `InternalData setOwnerUUID(UUID ownerUUID)`
- `Optional<Integer> getUsageOptional()`
- `Map<String, String> getVariables()`
- `Optional<UUID> getOwnerUUIDOptional()`
