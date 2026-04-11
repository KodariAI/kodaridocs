# RoseStacker API Reference

Entity, item, block, and spawner stacking plugin. The API lets plugins query stacked entities/items/blocks/spawners, create and remove stacks, get stack sizes, generate loot drops, and listen for stack/unstack events. Add `RoseStacker` to `depend` or `softdepend` in plugin.yml.

## Code Examples

### Getting the API

```java
import dev.rosewood.rosestacker.api.RoseStackerAPI;

RoseStackerAPI api = RoseStackerAPI.getInstance();
```

### Check if an Entity is Stacked

```java
import dev.rosewood.rosestacker.api.RoseStackerAPI;
import dev.rosewood.rosestacker.stack.StackedEntity;
import org.bukkit.entity.LivingEntity;

RoseStackerAPI api = RoseStackerAPI.getInstance();

boolean stacked = api.isEntityStacked(livingEntity);
if (stacked) {
    StackedEntity stack = api.getStackedEntity(livingEntity);
    int size = stack.getStackSize();
    String displayName = stack.getDisplayName();
}
```

### Check Stacked Items, Blocks, and Spawners

```java
import dev.rosewood.rosestacker.api.RoseStackerAPI;
import dev.rosewood.rosestacker.stack.StackedItem;
import dev.rosewood.rosestacker.stack.StackedBlock;
import dev.rosewood.rosestacker.stack.StackedSpawner;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;

RoseStackerAPI api = RoseStackerAPI.getInstance();

// Items
boolean itemStacked = api.isItemStacked(itemEntity);
StackedItem stackedItem = api.getStackedItem(itemEntity);

// Blocks
boolean blockStacked = api.isBlockStacked(block);
StackedBlock stackedBlock = api.getStackedBlock(block);

// Spawners
boolean spawnerStacked = api.isSpawnerStacked(block);
StackedSpawner stackedSpawner = api.getStackedSpawner(block);
```

### Create Stacks Programmatically

```java
import dev.rosewood.rosestacker.api.RoseStackerAPI;
import dev.rosewood.rosestacker.stack.StackedEntity;
import dev.rosewood.rosestacker.stack.StackedBlock;
import dev.rosewood.rosestacker.stack.StackedSpawner;
import org.bukkit.entity.LivingEntity;
import org.bukkit.block.Block;

RoseStackerAPI api = RoseStackerAPI.getInstance();

// Create entity stack (tryStack = attempt to merge with nearby stacks)
StackedEntity entityStack = api.createEntityStack(livingEntity, true);

// Create block stack with amount
StackedBlock blockStack = api.createBlockStack(block, 64);

// Create spawner stack
StackedSpawner spawnerStack = api.createSpawnerStack(block, 5, true); // placedByPlayer
```

### Pre-stack Entities and Items (spawn already stacked)

```java
import dev.rosewood.rosestacker.api.RoseStackerAPI;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.inventory.ItemStack;

import java.util.List;

RoseStackerAPI api = RoseStackerAPI.getInstance();

// Spawn 50 zombies as a single stack
api.preStackEntities(EntityType.ZOMBIE, 50, location, SpawnReason.CUSTOM);

// Drop items already stacked
api.preStackItems(List.of(new ItemStack(org.bukkit.Material.DIAMOND, 64)), location);

// Drop a stacked item
api.dropItemStack(itemStack, 100, location, true); // dropNaturally
```

### Remove Stacks

```java
import dev.rosewood.rosestacker.api.RoseStackerAPI;
import dev.rosewood.rosestacker.stack.StackedEntity;

RoseStackerAPI api = RoseStackerAPI.getInstance();

StackedEntity stack = api.getStackedEntity(livingEntity);
if (stack != null) {
    api.removeEntityStack(stack);
}

// Remove all entity/item stacks
int removedEntities = api.removeAllEntityStacks();
int removedItems = api.removeAllItemStacks();
```

### Get Loot from a Stacked Entity

```java
import dev.rosewood.rosestacker.api.RoseStackerAPI;
import dev.rosewood.rosestacker.event.EntityStackMultipleDeathEvent.EntityDrops;
import dev.rosewood.rosestacker.stack.StackedEntity;
import org.bukkit.inventory.ItemStack;

import java.util.List;

RoseStackerAPI api = RoseStackerAPI.getInstance();

StackedEntity stack = api.getStackedEntity(livingEntity);
if (stack != null) {
    EntityDrops drops = api.getStackedEntityLoot(stack);
    List<ItemStack> items = drops.getDrops();
    int exp = drops.getExperience();
}
```

### Listen for Stack Events

```java
import dev.rosewood.rosestacker.event.EntityStackEvent;
import dev.rosewood.rosestacker.event.EntityUnstackEvent;
import dev.rosewood.rosestacker.event.BlockStackEvent;
import dev.rosewood.rosestacker.event.SpawnerStackEvent;
import dev.rosewood.rosestacker.event.PreDropStackedItemsEvent;
import dev.rosewood.rosestacker.event.StackGUIOpenEvent;
import dev.rosewood.rosestacker.stack.StackedEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class StackListener implements Listener {

    @EventHandler
    public void onEntityStack(EntityStackEvent event) {
        // Cancellable
        StackedEntity result = event.getStack(); // receiving stack
        event.getTargets(); // entities being merged in
    }

    @EventHandler
    public void onEntityUnstack(EntityUnstackEvent event) {
        // Cancellable
        StackedEntity original = event.getStack();
        StackedEntity splitOff = event.getResult();
    }

    @EventHandler
    public void onBlockStack(BlockStackEvent event) {
        // Cancellable
        Player player = event.getPlayer();
        int amount = event.getIncreaseAmount();
        boolean isNew = event.isNew(); // new stack vs adding to existing
    }

    @EventHandler
    public void onSpawnerStack(SpawnerStackEvent event) {
        // Cancellable
        Player player = event.getPlayer();
        int amount = event.getIncreaseAmount();
    }

    @EventHandler
    public void onItemDrop(PreDropStackedItemsEvent event) {
        // Cancellable — modify drops before they spawn
        var items = event.getItems(); // Map<ItemStack, Integer> — mutable
        org.bukkit.Location location = event.getLocation();
    }

    @EventHandler
    public void onGUIOpen(StackGUIOpenEvent event) {
        // Cancellable
        Player player = event.getPlayer();
    }
}
```

## API Reference (Trimmed)

### `dev.rosewood.rosestacker.api.RoseStackerAPI`

| Return | Method | Description |
|---|---|---|
| `static RoseStackerAPI` | `getInstance()` | Singleton |
| `StackedEntity` | `getStackedEntity(LivingEntity)` | Get entity stack (null if none) |
| `StackedItem` | `getStackedItem(Item)` | Get item stack |
| `StackedBlock` | `getStackedBlock(Block)` | Get block stack |
| `StackedSpawner` | `getStackedSpawner(Block)` | Get spawner stack |
| `boolean` | `isEntityStacked(LivingEntity)` | Is entity stacked |
| `boolean` | `isItemStacked(Item)` | Is item stacked |
| `boolean` | `isBlockStacked(Block)` | Is block stacked |
| `boolean` | `isSpawnerStacked(Block)` | Is spawner stacked |
| `StackedEntity` | `createEntityStack(LivingEntity, boolean tryStack)` | Create entity stack |
| `StackedItem` | `createItemStack(Item, boolean tryStack)` | Create item stack |
| `StackedBlock` | `createBlockStack(Block, int amount)` | Create block stack |
| `StackedSpawner` | `createSpawnerStack(Block, int amount, boolean placedByPlayer)` | Create spawner stack |
| `void` | `removeEntityStack(StackedEntity)` | Remove entity stack |
| `void` | `removeItemStack(StackedItem)` | Remove item stack |
| `void` | `removeBlockStack(StackedBlock)` | Remove block stack |
| `void` | `removeSpawnerStack(StackedSpawner)` | Remove spawner stack |
| `int` | `removeAllEntityStacks()` | Remove all entity stacks |
| `int` | `removeAllItemStacks()` | Remove all item stacks |
| `void` | `preStackEntities(EntityType, int, Location, SpawnReason)` | Spawn pre-stacked |
| `void` | `preStackItems(Collection<ItemStack>, Location)` | Drop pre-stacked items |
| `StackedItem` | `dropItemStack(ItemStack, int, Location, boolean)` | Drop stacked item |
| `EntityDrops` | `getStackedEntityLoot(StackedEntity)` | Get loot drops |

### Stack Classes (`dev.rosewood.rosestacker.stack`)

All stacks have: `getStackSize()`, `getLocation()`, `updateDisplay()`, `getStackSettings()`

| Class | Extra Methods |
|---|---|
| `StackedEntity` | `getEntity()`, `increaseStackSize(LivingEntity)`, `decreaseStackSize()`, `getDisplayName()`, `killEntireStack()`, `killPartialStack(event, amount)` |
| `StackedItem` | `getItem()`, `increaseStackSize(int, boolean)`, `setStackSize(int)` |
| `StackedBlock` | `getBlock()`, `increaseStackSize(int)`, `setStackSize(int)`, `openGui(Player)` |
| `StackedSpawner` | `getSpawner()`, `getBlock()`, `increaseStackSize(int)`, `setStackSize(int)`, `openGui(Player)`, `isPlacedByPlayer()` |

### Events (`dev.rosewood.rosestacker.event`)

| Event | Cancellable | Key Methods |
|---|---|---|
| `EntityStackEvent` | Yes | `getStack()`, `getTargets()` |
| `EntityUnstackEvent` | Yes | `getStack()`, `getResult()` |
| `EntityStackClearEvent` | Yes | `getWorld()`, `getStacks()` |
| `EntityStackMultipleDeathEvent` | No | `getStack()`, `getEntityDrops()`, `getKiller()`, `getEntityKillCount()` |
| `ItemStackEvent` | Yes | `getStack()`, `getTarget()` |
| `ItemStackClearEvent` | Yes | `getWorld()`, `getStacks()` |
| `PreDropStackedItemsEvent` | Yes | `getItems()` (mutable Map), `getLocation()` |
| `BlockStackEvent` | Yes | `getStack()`, `getPlayer()`, `getIncreaseAmount()`, `isNew()` |
| `BlockUnstackEvent` | Yes | `getStack()`, `getPlayer()`, `getDecreaseAmount()` |
| `SpawnerStackEvent` | Yes | `getStack()`, `getPlayer()`, `getIncreaseAmount()`, `isNew()` |
| `SpawnerUnstackEvent` | Yes | `getStack()`, `getPlayer()`, `getDecreaseAmount()` |
| `PreStackedSpawnerSpawnEvent` | Yes | `getStack()`, `getSpawnAmount()`, `setSpawnAmount(int)` |
| `StackGUIOpenEvent` | Yes | `getPlayer()`, `getStack()` |
