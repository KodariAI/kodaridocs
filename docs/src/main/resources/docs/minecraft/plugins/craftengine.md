# CraftEngine API

CraftEngine (by Xiao-MoMi) is a Paper/Folia plugin for creating custom blocks, items, furniture, and recipes via configuration. The Bukkit API under `net.momirealms.craftengine.bukkit.api` provides static utility classes for programmatic access. All data is loaded asynchronously -- do NOT access during `onEnable`; listen for `CraftEngineReloadEvent` instead.

---

## Key Creation

All lookups use `net.momirealms.craftengine.core.util.Key`, a `record(String namespace, String value)`.

```java
import net.momirealms.craftengine.core.util.Key;

// Parse "namespace:value" (defaults to "minecraft" namespace)
Key id = Key.of("myplugin:ruby_ore");

// Explicit namespace + value
Key id2 = Key.of("myplugin", "ruby_ore");

// Default "craftengine" namespace
Key id3 = Key.withDefaultNamespace("my_block");
```

---

## Custom Items

```java
import net.momirealms.craftengine.bukkit.api.CraftEngineItems;
import net.momirealms.craftengine.core.item.CustomItem;
import net.momirealms.craftengine.core.util.Key;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

// Check if an ItemStack is a CraftEngine custom item
boolean custom = CraftEngineItems.isCustomItem(itemStack);

// Get the custom item ID from an ItemStack (null if not custom)
Key itemId = CraftEngineItems.getCustomItemId(itemStack);

// Lookup a custom item definition by ID
CustomItem<ItemStack> ruby = CraftEngineItems.byId(Key.of("myplugin:ruby"));

// Build a new ItemStack from a custom item definition
if (ruby != null) {
    ItemStack stack = ruby.buildItem(/* context */);
}

// Get the CustomItem wrapper from an existing ItemStack
CustomItem<ItemStack> wrapped = CraftEngineItems.byItemStack(playerItem);
if (wrapped != null) {
    Key id = wrapped.id();           // e.g. myplugin:ruby
    Key material = wrapped.material(); // underlying vanilla material key
}

// Iterate all loaded custom items
Map<Key, CustomItem<ItemStack>> allItems = CraftEngineItems.loadedItems();
for (Map.Entry<Key, CustomItem<ItemStack>> entry : allItems.entrySet()) {
    Key id = entry.getKey();
    CustomItem<ItemStack> item = entry.getValue();
}
```

---

## Custom Blocks

```java
import net.momirealms.craftengine.bukkit.api.CraftEngineBlocks;
import net.momirealms.craftengine.core.block.CustomBlock;
import net.momirealms.craftengine.core.block.ImmutableBlockState;
import net.momirealms.craftengine.core.block.UpdateOption;
import net.momirealms.craftengine.core.util.Key;
import net.momirealms.sparrow.nbt.CompoundTag;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;

import java.util.Map;

// Check if a Block in the world is a CraftEngine custom block
boolean isCustom = CraftEngineBlocks.isCustomBlock(block);

// Get the custom block state from a world Block (null if not custom)
ImmutableBlockState state = CraftEngineBlocks.getCustomBlockState(block);
if (state != null) {
    CustomBlock customBlock = state.owner().value();
    Key blockId = customBlock.id();
}

// Lookup a custom block definition by ID
CustomBlock rubyOre = CraftEngineBlocks.byId(Key.of("myplugin:ruby_ore"));

// Place a custom block by ID at a location
boolean placed = CraftEngineBlocks.place(
    location,
    Key.of("myplugin:ruby_ore"),
    true  // playSound
);

// Place with specific block state properties
CompoundTag properties = new CompoundTag();
properties.putString("facing", "north");
CraftEngineBlocks.place(location, Key.of("myplugin:ruby_ore"), properties, true);

// Place with UpdateOption control
CraftEngineBlocks.place(
    location,
    Key.of("myplugin:ruby_ore"),
    properties,
    UpdateOption.UPDATE_ALL,  // block update flags
    true                      // playSound
);

// Place using ImmutableBlockState directly
if (rubyOre != null) {
    ImmutableBlockState defaultState = rubyOre.defaultState();
    CraftEngineBlocks.place(location, defaultState, true);
}

// Remove a custom block
CraftEngineBlocks.remove(block);                           // simple remove
CraftEngineBlocks.remove(block, false);                    // isMoving = false
CraftEngineBlocks.remove(block, player, false, true, true); // player, isMoving, dropLoot, sendLevelEvent

// Convert between ImmutableBlockState and Bukkit BlockData
BlockData data = CraftEngineBlocks.getBukkitBlockData(state);
ImmutableBlockState fromData = CraftEngineBlocks.getCustomBlockState(data);

// Iterate all loaded custom blocks
Map<Key, CustomBlock> allBlocks = CraftEngineBlocks.loadedBlocks();
```

---

## Furniture

```java
import net.momirealms.craftengine.bukkit.api.CraftEngineFurniture;
import net.momirealms.craftengine.bukkit.entity.furniture.BukkitFurniture;
import net.momirealms.craftengine.core.entity.furniture.CustomFurniture;
import net.momirealms.craftengine.core.entity.furniture.FurnitureDataAccessor;
import net.momirealms.craftengine.core.util.Key;
import net.momirealms.sparrow.nbt.CompoundTag;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.Map;

// Check entity types
boolean isFurn = CraftEngineFurniture.isFurniture(entity);
boolean isSeat = CraftEngineFurniture.isSeat(entity);
boolean isCollider = CraftEngineFurniture.isCollisionEntity(entity);

// Lookup furniture definition by ID
CustomFurniture chair = CraftEngineFurniture.byId(Key.of("myplugin:wooden_chair"));

// Place furniture at a location (returns BukkitFurniture or null)
BukkitFurniture placed = CraftEngineFurniture.place(location, Key.of("myplugin:wooden_chair"));

// Place with a specific variant name
BukkitFurniture placed2 = CraftEngineFurniture.place(
    location,
    Key.of("myplugin:wooden_chair"),
    "wall",   // variant name
    true      // playSound
);

// Place using CustomFurniture reference + variant
if (chair != null) {
    BukkitFurniture placed3 = CraftEngineFurniture.place(
        location, chair, "floor", true
    );
}

// Place with CompoundTag data
CompoundTag data = new CompoundTag();
data.putString("variant", "ceiling");
BukkitFurniture placed4 = CraftEngineFurniture.place(location, chair, data, false);

// Place with FurnitureDataAccessor
BukkitFurniture placed5 = CraftEngineFurniture.place(
    location, chair, FurnitureDataAccessor.ofVariant("wall"), true
);

// Raytrace furniture the player is looking at
BukkitFurniture target = CraftEngineFurniture.rayTrace(player);          // default interaction range
BukkitFurniture target2 = CraftEngineFurniture.rayTrace(player, 5.0);    // custom max distance

// Get loaded furniture from entities
BukkitFurniture fromMeta = CraftEngineFurniture.getLoadedFurnitureByMetaEntity(entity);
BukkitFurniture fromSeat = CraftEngineFurniture.getLoadedFurnitureBySeat(seatEntity);
BukkitFurniture fromCollider = CraftEngineFurniture.getLoadedFurnitureByCollider(colliderEntity);

// Work with a BukkitFurniture instance
if (placed != null) {
    Location loc = placed.location();
    Entity bukkitEntity = placed.bukkitEntity();
    placed.setVariant("wall", false);  // change variant, force=false
    placed.refresh();                   // refresh display for all tracked players
    placed.destroy();                   // remove from world
}

// Remove furniture
CraftEngineFurniture.remove(entity);                          // simple remove
CraftEngineFurniture.remove(entity, true, true);              // dropLoot, playSound
CraftEngineFurniture.remove(entity, player, true, true);      // with player context

// Iterate all loaded furniture definitions
Map<Key, CustomFurniture> allFurniture = CraftEngineFurniture.loadedFurniture();
```

---

## Bukkit Adaptors

Convert Bukkit objects to CraftEngine wrappers.

```java
import net.momirealms.craftengine.bukkit.api.BukkitAdaptors;
import net.momirealms.craftengine.bukkit.entity.BukkitEntity;
import net.momirealms.craftengine.bukkit.plugin.user.BukkitServerPlayer;
import net.momirealms.craftengine.bukkit.world.BukkitExistingBlock;
import net.momirealms.craftengine.bukkit.world.BukkitWorld;
import net.momirealms.craftengine.core.item.Item;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

BukkitServerPlayer serverPlayer = BukkitAdaptors.adapt(player);  // nullable
BukkitWorld world = BukkitAdaptors.adapt(player.getWorld());
BukkitEntity ceEntity = BukkitAdaptors.adapt(entity);
BukkitExistingBlock ceBlock = BukkitAdaptors.adapt(block);
Item<ItemStack> ceItem = BukkitAdaptors.adapt(itemStack);
```

---

## Images

```java
import net.momirealms.craftengine.bukkit.api.CraftEngineImages;
import net.momirealms.craftengine.core.font.Image;
import net.momirealms.craftengine.core.util.Key;

import java.util.Map;

Image img = CraftEngineImages.byId(Key.of("myplugin:my_icon"));
Map<Key, Image> allImages = CraftEngineImages.loadedImages();
```

---

## Events

All events are in `net.momirealms.craftengine.bukkit.api.event`. The official recommendation is to prefer listening to standard Bukkit events and then use `CraftEngineBlocks.getCustomBlockState(block)` for conversion, rather than relying solely on custom events.

### Block Events

```java
import net.momirealms.craftengine.bukkit.api.event.CustomBlockPlaceEvent;
import net.momirealms.craftengine.bukkit.api.event.CustomBlockBreakEvent;
import net.momirealms.craftengine.bukkit.api.event.CustomBlockAttemptPlaceEvent;
import net.momirealms.craftengine.bukkit.api.event.CustomBlockInteractEvent;
import net.momirealms.craftengine.core.block.CustomBlock;
import net.momirealms.craftengine.core.block.ImmutableBlockState;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BlockListener implements Listener {

    @EventHandler
    public void onCustomBlockPlace(CustomBlockPlaceEvent event) {
        Player player = event.player();
        Location location = event.location();
        Block bukkitBlock = event.bukkitBlock();
        CustomBlock customBlock = event.customBlock();
        ImmutableBlockState state = event.blockState();
        // event.setCancelled(true);
    }

    @EventHandler
    public void onCustomBlockBreak(CustomBlockBreakEvent event) {
        // event.player() returns BukkitServerPlayer
        Location location = event.location();
        CustomBlock customBlock = event.customBlock();
        boolean dropsItems = event.dropItems();
        event.setDropItems(false); // prevent drops
        // event.setCancelled(true);
    }

    @EventHandler
    public void onCustomBlockAttemptPlace(CustomBlockAttemptPlaceEvent event) {
        Player player = event.player();
        Location location = event.location();
        BlockFace face = event.clickedFace();
        Block clicked = event.clickedBlock();
        // Cancel to prevent placement
        // event.setCancelled(true);
    }

    @EventHandler
    public void onCustomBlockInteract(CustomBlockInteractEvent event) {
        Player player = event.player();
        CustomBlockInteractEvent.Action action = event.action(); // LEFT_CLICK or RIGHT_CLICK
        Location interactionPoint = event.interactionPoint();
        BlockFace face = event.clickedFace();
        // event.setCancelled(true);
    }
}
```

### Furniture Events

```java
import net.momirealms.craftengine.bukkit.api.event.FurniturePlaceEvent;
import net.momirealms.craftengine.bukkit.api.event.FurnitureBreakEvent;
import net.momirealms.craftengine.bukkit.api.event.FurnitureAttemptPlaceEvent;
import net.momirealms.craftengine.bukkit.api.event.FurnitureAttemptBreakEvent;
import net.momirealms.craftengine.bukkit.api.event.FurnitureInteractEvent;
import net.momirealms.craftengine.bukkit.entity.furniture.BukkitFurniture;
import net.momirealms.craftengine.core.entity.furniture.CustomFurniture;
import net.momirealms.craftengine.core.entity.furniture.FurnitureHitBox;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FurnitureListener implements Listener {

    @EventHandler
    public void onFurniturePlace(FurniturePlaceEvent event) {
        Player player = event.player();
        BukkitFurniture furniture = event.furniture();
        Location location = event.location();
        // event.setCancelled(true);
    }

    @EventHandler
    public void onFurnitureBreak(FurnitureBreakEvent event) {
        Player player = event.player();
        BukkitFurniture furniture = event.furniture();
        Location location = event.location();
        // event.setCancelled(true);
    }

    @EventHandler
    public void onFurnitureAttemptPlace(FurnitureAttemptPlaceEvent event) {
        CustomFurniture furniture = event.furniture();
        Location location = event.location();
        // event.setCancelled(true);
    }

    @EventHandler
    public void onFurnitureAttemptBreak(FurnitureAttemptBreakEvent event) {
        BukkitFurniture furniture = event.furniture();
        // event.setCancelled(true);
    }

    @EventHandler
    public void onFurnitureInteract(FurnitureInteractEvent event) {
        Player player = event.player();
        BukkitFurniture furniture = event.furniture();
        FurnitureHitBox hitBox = event.hitBox();
        Location interactionPoint = event.interactionPoint();
        // event.setCancelled(true);
    }
}
```

### Plugin Lifecycle Events

```java
import net.momirealms.craftengine.bukkit.api.event.CraftEngineReloadEvent;
import net.momirealms.craftengine.bukkit.api.event.AsyncResourcePackGenerateEvent;
import net.momirealms.craftengine.bukkit.api.event.AsyncResourcePackCacheEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.nio.file.Path;

public class LifecycleListener implements Listener {

    // Fired after CraftEngine finishes loading/reloading. Use this to safely access loaded data.
    @EventHandler
    public void onReload(CraftEngineReloadEvent event) {
        boolean firstLoad = event.isFirstReload();
        // Safe to call CraftEngineItems.loadedItems(), CraftEngineBlocks.loadedBlocks(), etc.
    }

    // Fired asynchronously after resource pack generation
    @EventHandler
    public void onPackGenerate(AsyncResourcePackGenerateEvent event) {
        Path packFolder = event.resourcePackFolder();
        Path zipFile = event.zipFilePath();
    }

    // Fired asynchronously when resource pack cache is built
    @EventHandler
    public void onPackCache(AsyncResourcePackCacheEvent event) {
        // Register external resource pack files to merge
        // event.registerExternalResourcePack(pathToExternalPack);
    }
}
```

---

## Practical Example: Full Integration Plugin

```java
import net.momirealms.craftengine.bukkit.api.CraftEngineBlocks;
import net.momirealms.craftengine.bukkit.api.CraftEngineItems;
import net.momirealms.craftengine.bukkit.api.CraftEngineFurniture;
import net.momirealms.craftengine.bukkit.api.event.CraftEngineReloadEvent;
import net.momirealms.craftengine.bukkit.api.event.CustomBlockBreakEvent;
import net.momirealms.craftengine.bukkit.entity.furniture.BukkitFurniture;
import net.momirealms.craftengine.core.block.CustomBlock;
import net.momirealms.craftengine.core.item.CustomItem;
import net.momirealms.craftengine.core.util.Key;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    // Wait for CraftEngine to finish loading before accessing data
    @EventHandler
    public void onCraftEngineReload(CraftEngineReloadEvent event) {
        int items = CraftEngineItems.loadedItems().size();
        int blocks = CraftEngineBlocks.loadedBlocks().size();
        int furniture = CraftEngineFurniture.loadedFurniture().size();
        getLogger().info("CraftEngine loaded: " + items + " items, " + blocks + " blocks, " + furniture + " furniture");
    }

    // Example: detect right-clicking a custom block
    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Block block = event.getClickedBlock();
        if (block == null) return;
        if (!CraftEngineBlocks.isCustomBlock(block)) return;

        var state = CraftEngineBlocks.getCustomBlockState(block);
        if (state != null) {
            Key blockId = state.owner().value().id();
            event.getPlayer().sendMessage("You clicked custom block: " + blockId.asString());
        }
    }

    // Example: prevent breaking a specific custom block
    @EventHandler
    public void onBreak(CustomBlockBreakEvent event) {
        if (event.customBlock().id().equals(Key.of("myplugin:unbreakable_ore"))) {
            event.setCancelled(true);
        }
    }

    // Example command: place custom block and furniture at player location
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player player)) return false;
        if (args.length < 2) return false;

        String type = args[0];    // "block" or "furniture"
        String idStr = args[1];   // e.g. "myplugin:ruby_ore"
        Key id = Key.of(idStr);
        Location loc = player.getLocation();

        if (type.equals("block")) {
            boolean success = CraftEngineBlocks.place(loc, id, true);
            player.sendMessage(success ? "Block placed!" : "Unknown block: " + idStr);
        } else if (type.equals("furniture")) {
            BukkitFurniture furn = CraftEngineFurniture.place(loc, id);
            player.sendMessage(furn != null ? "Furniture placed!" : "Unknown furniture: " + idStr);
        }
        return true;
    }
}
```

---

## API Reference

### net.momirealms.craftengine.core.util.Key
```
record Key(String namespace, String value)
static Key of(String namespacedId)                              // parse "namespace:value", default ns = "minecraft"
static Key of(String namespace, String value)                   // explicit ns + value
static Key withDefaultNamespace(String value)                   // ns = "craftengine"
static Key ce(String namespacedId)                              // parse with default ns = "craftengine"
static Key from(String namespacedId)                            // alias for of()
String asString()                                               // "namespace:value"
String asMinimalString()                                        // omits "minecraft:" prefix
```

### net.momirealms.craftengine.bukkit.api.CraftEngineItems
```
static boolean isCustomItem(ItemStack)
static Key getCustomItemId(ItemStack)                           // null if not custom
static CustomItem<ItemStack> byId(Key)                          // null if not found
static CustomItem<ItemStack> byItemStack(ItemStack)             // null if not custom
static Map<Key, CustomItem<ItemStack>> loadedItems()
```

### net.momirealms.craftengine.core.item.CustomItem<I>
```
Key id()
Key material()
Key clientBoundMaterial()
boolean isVanillaItem()
String translationKey()
boolean is(Key tag)
ItemSettings settings()
List<ItemBehavior> behaviors()
```

### net.momirealms.craftengine.bukkit.api.CraftEngineBlocks
```
static boolean isCustomBlock(Block)
static boolean isVanillaBlockState(int id)
static ImmutableBlockState getCustomBlockState(Block)           // null if not custom
static ImmutableBlockState getCustomBlockState(BlockData)       // null if not custom
static BlockData getBukkitBlockData(ImmutableBlockState)
static CustomBlock byId(Key)                                    // null if not found
static Map<Key, CustomBlock> loadedBlocks()
static boolean place(Location, Key blockId, boolean playSound)
static boolean place(Location, Key, CompoundTag properties, boolean playSound)
static boolean place(Location, Key, CompoundTag, UpdateOption, boolean playSound)
static boolean place(Location, ImmutableBlockState, boolean playSound)
static boolean place(Location, ImmutableBlockState, UpdateOption, boolean playSound)
static boolean remove(Block)
static boolean remove(Block, boolean isMoving)
static boolean remove(Block, Player, boolean isMoving, boolean dropLoot, boolean sendLevelEvent)
```

### net.momirealms.craftengine.core.block.CustomBlock
```
Key id()
String translationKey()
ImmutableBlockState defaultState()
ImmutableBlockState getBlockState(CompoundTag properties)
ImmutableBlockState getStateForPlacement(BlockPlaceContext)
Collection<Property<?>> properties()
Property<?> getProperty(String name)
LootTable<?> lootTable()
BlockStateVariantProvider variantProvider()
```

### net.momirealms.craftengine.core.block.ImmutableBlockState
```
boolean isEmpty()
Holder<CustomBlock> owner()
BlockSettings settings()
BlockBehavior behavior()
BlockStateWrapper customBlockState()
BlockStateWrapper visualBlockState()
<T extends Comparable<T>> T get(Property<T> property)
<T extends Comparable<T>> T get(Property<T> property, T fallback)
<T extends Comparable<T>> boolean contains(Property<T> property)
Collection<Property<?>> getProperties()
<T extends Comparable<T>, V extends T> ImmutableBlockState with(Property<T> property, V value)
ImmutableBlockState with(CompoundTag propertiesNBT)
ImmutableBlockState cycle(Property<T> property)
CompoundTag propertiesNbt()
String getPropertiesAsString()
List<Item<Object>> getDrops(ContextHolder.Builder, World, Player)
boolean hasBlockEntity()
```

### net.momirealms.craftengine.core.block.UpdateOption
```
UPDATE_ALL                                                      // default, updates neighbors + clients
// Other flag combinations available via constructor
```

### net.momirealms.craftengine.bukkit.api.CraftEngineFurniture
```
static boolean isFurniture(Entity)
static boolean isSeat(Entity)
static boolean isCollisionEntity(Entity)
static CustomFurniture byId(Key)                                // null if not found
static Map<Key, CustomFurniture> loadedFurniture()
static BukkitFurniture place(Location, Key furnitureId)
static BukkitFurniture place(Location, Key, String variant)
static BukkitFurniture place(Location, Key, String variant, boolean playSound)
static BukkitFurniture place(Location, CustomFurniture, String variant, boolean playSound)
static BukkitFurniture place(Location, CustomFurniture, CompoundTag data, boolean playSound)
static BukkitFurniture place(Location, CustomFurniture, FurnitureDataAccessor, boolean playSound)
static BukkitFurniture rayTrace(Player)
static BukkitFurniture rayTrace(Player, double maxDistance)
static BukkitFurniture getLoadedFurnitureByMetaEntity(Entity)
static BukkitFurniture getLoadedFurnitureBySeat(Entity)
static BukkitFurniture getLoadedFurnitureByCollider(Entity)
static boolean remove(Entity)
static boolean remove(Entity, boolean dropLoot, boolean playSound)
static boolean remove(Entity, Player, boolean dropLoot, boolean playSound)
static void remove(Furniture, boolean dropLoot, boolean playSound)
static void remove(Furniture, Player, boolean dropLoot, boolean playSound)
```

### net.momirealms.craftengine.core.entity.furniture.CustomFurniture
```
Key id()
String translationKey()
FurnitureSettings settings()
LootTable<?> lootTable()
Map<String, FurnitureVariant> variants()
FurnitureVariant anyVariant()
String anyVariantName()
FurnitureVariant getVariant(String variantName)
FurnitureBehavior behavior()
```

### net.momirealms.craftengine.bukkit.entity.furniture.BukkitFurniture
```
Location location()
Entity bukkitEntity()
Location getDropLocation()
boolean setVariant(String variantName, boolean force)
CompletableFuture<Boolean> moveTo(WorldPosition position, boolean force)
void refresh()
void refresh(Player)
void destroy()
Set<Player> getTrackedBy()
void addCollidersToWorld()
```

### net.momirealms.craftengine.bukkit.api.BukkitAdaptors
```
static BukkitServerPlayer adapt(Player)                         // nullable
static BukkitWorld adapt(World)
static BukkitEntity adapt(Entity)
static BukkitExistingBlock adapt(Block)
static Item<ItemStack> adapt(ItemStack)
```

### net.momirealms.craftengine.bukkit.api.CraftEngineImages
```
static Image byId(Key)                                          // null if not found
static Map<Key, Image> loadedImages()
```

### Events (net.momirealms.craftengine.bukkit.api.event)

| Event | Extends | Cancellable | Key Methods |
|-------|---------|-------------|-------------|
| `CustomBlockPlaceEvent` | PlayerEvent | Yes | `player()`, `location()`, `bukkitBlock()`, `customBlock()`, `blockState()`, `hand()` |
| `CustomBlockBreakEvent` | PlayerEvent | Yes | `player()` (BukkitServerPlayer), `location()`, `bukkitBlock()`, `customBlock()`, `blockState()`, `dropItems()`, `setDropItems(boolean)` |
| `CustomBlockAttemptPlaceEvent` | PlayerEvent | Yes | `player()`, `location()`, `blockState()`, `customBlock()`, `clickedFace()`, `clickedBlock()`, `hand()` |
| `CustomBlockInteractEvent` | PlayerEvent | Yes | `player()`, `location()`, `interactionPoint()`, `customBlock()`, `blockState()`, `bukkitBlock()`, `clickedFace()`, `hand()`, `action()`, `item()` |
| `FurniturePlaceEvent` | PlayerEvent | Yes | `player()`, `furniture()` (BukkitFurniture), `location()`, `hand()` |
| `FurnitureBreakEvent` | PlayerEvent | Yes | `player()`, `furniture()` (BukkitFurniture), `location()` |
| `FurnitureAttemptPlaceEvent` | PlayerEvent | Yes | `player()`, `furniture()` (CustomFurniture), `variant()`, `location()`, `clickedBlock()`, `hand()` |
| `FurnitureAttemptBreakEvent` | PlayerEvent | Yes | `player()`, `furniture()` (BukkitFurniture), `location()` |
| `FurnitureInteractEvent` | PlayerEvent | Yes | `player()`, `furniture()` (BukkitFurniture), `hand()`, `interactionPoint()`, `hitBox()` |
| `CraftEngineReloadEvent` | Event | No | `plugin()`, `isFirstReload()` |
| `AsyncResourcePackGenerateEvent` | Event (async) | No | `resourcePackFolder()`, `zipFilePath()` |
| `AsyncResourcePackCacheEvent` | Event (async) | No | `cacheData()`, `registerExternalResourcePack(Path)` |

### CustomBlockInteractEvent.Action (Enum)
```
LEFT_CLICK
RIGHT_CLICK
```
