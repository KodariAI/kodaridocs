# Nexo API Reference

Nexo is a Minecraft plugin for creating custom items, blocks, furniture, and resource packs. Successor to Oraxen. Written in Kotlin, exposed as Java API. Items load asynchronously -- always use `NexoItemsLoadedEvent` before accessing items.

JavaDocs: https://jd.nexomc.com/

---

## Code Examples

### Get a Custom Item by ID

```java
import com.nexomc.nexo.api.NexoItems;
import com.nexomc.nexo.items.ItemBuilder;
import org.bukkit.inventory.ItemStack;

ItemBuilder builder = NexoItems.itemFromId("my_custom_sword");
if (builder != null) {
    ItemStack item = builder.build();
    player.getInventory().addItem(item);
}
```

### Check if an ItemStack is a Nexo Item

```java
import com.nexomc.nexo.api.NexoItems;
import org.bukkit.inventory.ItemStack;

ItemStack item = player.getInventory().getItemInMainHand();
if (NexoItems.exists(item)) {
    String id = NexoItems.idFromItem(item);
    // id is the Nexo item ID, e.g. "my_custom_sword"
}
```

### Safely Get an Item (Optional)

```java
import com.nexomc.nexo.api.NexoItems;
import com.nexomc.nexo.items.ItemBuilder;
import java.util.Optional;

Optional<ItemBuilder> opt = NexoItems.optionalItemFromId("my_item");
opt.ifPresent(builder -> {
    player.getInventory().addItem(builder.build());
});
```

### Check if an Item Has a Specific Mechanic

```java
import com.nexomc.nexo.api.NexoItems;

boolean hasFurniture = NexoItems.hasMechanic("my_chair", "furniture");
boolean hasNoteBlock = NexoItems.hasMechanic("my_block", "noteblock");
```

### Listen for Items Loaded (REQUIRED before accessing items)

```java
import com.nexomc.nexo.api.NexoItems;
import com.nexomc.nexo.api.events.NexoItemsLoadedEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MyListener implements Listener {

    @EventHandler
    public void onNexoItemsLoaded(NexoItemsLoadedEvent event) {
        // Safe to access NexoItems here
        for (String name : NexoItems.itemNames()) {
            // process each registered item ID
        }
    }
}
```

### Register an Update Callback (modify items during Nexo reload)

```java
import com.nexomc.nexo.api.NexoItems;
import com.nexomc.nexo.api.events.NexoItemsLoadedEvent;
import com.nexomc.nexo.items.UpdateCallback;
import net.kyori.adventure.key.Key;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class MyListener implements Listener {

    @EventHandler
    public void onNexoItemsLoaded(NexoItemsLoadedEvent event) {
        NexoItems.registerUpdateCallback(
            Key.key("myplugin", "my_callback"),
            new UpdateCallback() {
                @Override
                public ItemStack preUpdate(ItemStack itemStack) {
                    // Return null to skip Nexo's update for this item
                    // Return the itemStack to let Nexo update it
                    return itemStack;
                }

                @Override
                public ItemStack postUpdate(ItemStack itemStack) {
                    // Modify the item after Nexo finishes updating
                    return itemStack;
                }
            }
        );
    }
}
```

### Check if a Block is a Custom Nexo Block

```java
import com.nexomc.nexo.api.NexoBlocks;
import org.bukkit.block.Block;

Block block = player.getTargetBlockExact(5);
if (block != null && NexoBlocks.isCustomBlock(block)) {
    // This is a Nexo custom block
    String itemId = NexoBlocks.customBlockMechanic(block).getItemID();
}
```

### Place a Custom Block

```java
import com.nexomc.nexo.api.NexoBlocks;
import org.bukkit.Location;

Location loc = player.getLocation().add(0, -1, 0);
NexoBlocks.place("my_custom_block", loc);
```

### Remove a Custom Block

```java
import com.nexomc.nexo.api.NexoBlocks;
import org.bukkit.Location;
import org.bukkit.entity.Player;

Location loc = block.getLocation();

// Remove with player context (respects drops)
boolean removed = NexoBlocks.remove(loc, player);

// Remove with forced drop
boolean removedWithDrop = NexoBlocks.remove(loc, player, true);

// Remove without player (no drops)
boolean removedSilent = NexoBlocks.remove(loc);
```

### Get Custom Block Mechanic Details

```java
import com.nexomc.nexo.api.NexoBlocks;
import com.nexomc.nexo.mechanics.custom_block.CustomBlockMechanic;
import org.bukkit.block.BlockData;

CustomBlockMechanic mechanic = NexoBlocks.customBlockMechanic(block);
if (mechanic != null) {
    String itemId = mechanic.getItemID();
    BlockData data = mechanic.getBlockData();
    boolean hasLight = mechanic.hasLight();
}
```

### Check Specific Block Types

```java
import com.nexomc.nexo.api.NexoBlocks;

// Check block type
boolean isNoteBlock = NexoBlocks.isNexoNoteBlock(block);
boolean isStringBlock = NexoBlocks.isNexoStringBlock(block);
boolean isChorusBlock = NexoBlocks.isNexoChorusBlock(block);

// Check by item ID
boolean isNoteBlockById = NexoBlocks.isNexoNoteBlock("my_block_id");

// Get all registered block IDs
String[] allBlockIds = NexoBlocks.blockIDs();
String[] noteBlockIds = NexoBlocks.noteBlockIDs();
String[] stringBlockIds = NexoBlocks.stringBlockIDs();
```

### Check if Something is Furniture

```java
import com.nexomc.nexo.api.NexoFurniture;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemDisplay;

boolean isFurnitureAtLoc = NexoFurniture.isFurniture(location);
boolean isFurnitureEntity = NexoFurniture.isFurniture(entity);
boolean isFurnitureById = NexoFurniture.isFurniture("my_chair");
```

### Place Furniture

```java
import com.nexomc.nexo.api.NexoFurniture;
import org.bukkit.Location;
import org.bukkit.Rotation;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.ItemDisplay;

// Place with rotation enum and block face
ItemDisplay entity = NexoFurniture.place("my_chair", location, Rotation.NONE, BlockFace.UP);

// Place with yaw angle and block face
ItemDisplay entity2 = NexoFurniture.place("my_chair", location, 90.0f, BlockFace.UP);
```

### Remove Furniture

```java
import com.nexomc.nexo.api.NexoFurniture;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

// Remove by location
NexoFurniture.remove(location, player);
NexoFurniture.remove(location);

// Remove by base entity
NexoFurniture.remove(baseEntity, player);
NexoFurniture.remove(baseEntity);
```

### Get Furniture Mechanic and Properties

```java
import com.nexomc.nexo.api.NexoFurniture;
import com.nexomc.nexo.mechanics.furniture.FurnitureMechanic;
import org.bukkit.entity.ItemDisplay;

FurnitureMechanic mechanic = NexoFurniture.furnitureMechanic(entity);
if (mechanic != null) {
    String itemId = mechanic.getItemID();
    boolean hasStorage = mechanic.isStorage();
    boolean hasSeats = mechanic.getHasSeats();
    boolean isJukebox = mechanic.isJukebox();
    boolean interactable = mechanic.isInteractable(player);
}
```

### Get/Set Furniture Dye Color and Item

```java
import com.nexomc.nexo.api.NexoFurniture;
import org.bukkit.Color;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.inventory.ItemStack;

// Get the base entity at a location
ItemDisplay baseEntity = NexoFurniture.baseEntity(location);

// Get/set dye color
Color color = NexoFurniture.furnitureDye(baseEntity);
NexoFurniture.furnitureDye(baseEntity, Color.RED);

// Get/set the displayed item
ItemStack displayedItem = NexoFurniture.furnitureItem(baseEntity);
NexoFurniture.furnitureItem(baseEntity, newItemStack);

// Toggle light
NexoFurniture.toggleLight(baseEntity);
NexoFurniture.toggleLight(baseEntity, true); // force on
boolean lightOn = NexoFurniture.lightState(baseEntity);
```

### Find Furniture Player is Looking At

```java
import com.nexomc.nexo.api.NexoFurniture;
import org.bukkit.entity.ItemDisplay;

ItemDisplay targeted = NexoFurniture.findTargetFurniture(player);
if (targeted != null) {
    FurnitureMechanic mechanic = NexoFurniture.furnitureMechanic(targeted);
}
```

### Listen for Custom Block Events

```java
import com.nexomc.nexo.api.events.custom_block.NexoBlockBreakEvent;
import com.nexomc.nexo.api.events.custom_block.NexoBlockPlaceEvent;
import com.nexomc.nexo.api.events.custom_block.NexoBlockInteractEvent;
import com.nexomc.nexo.mechanics.custom_block.CustomBlockMechanic;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BlockListener implements Listener {

    @EventHandler
    public void onBlockBreak(NexoBlockBreakEvent event) {
        CustomBlockMechanic mechanic = event.getMechanic();
        String itemId = mechanic.getItemID();
        event.setCancelled(true); // prevent breaking
    }

    @EventHandler
    public void onBlockPlace(NexoBlockPlaceEvent event) {
        String itemId = event.getMechanic().getItemID();
        // event.getPlayer(), event.getBlock(), event.getItemInHand()
    }

    @EventHandler
    public void onBlockInteract(NexoBlockInteractEvent event) {
        String itemId = event.getMechanic().getItemID();
        // event.getPlayer(), event.getBlock(), event.getBlockFace()
        // event.getHand(), event.getItemInHand(), event.getAction()
    }
}
```

### Listen for Furniture Events

```java
import com.nexomc.nexo.api.events.furniture.NexoFurnitureBreakEvent;
import com.nexomc.nexo.api.events.furniture.NexoFurniturePlaceEvent;
import com.nexomc.nexo.api.events.furniture.NexoFurnitureInteractEvent;
import com.nexomc.nexo.mechanics.furniture.FurnitureMechanic;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FurnitureListener implements Listener {

    @EventHandler
    public void onFurnitureBreak(NexoFurnitureBreakEvent event) {
        FurnitureMechanic mechanic = event.getMechanic();
        ItemDisplay baseEntity = event.getBaseEntity();
        String itemId = mechanic.getItemID();
        event.setCancelled(true); // prevent breaking
    }

    @EventHandler
    public void onFurniturePlace(NexoFurniturePlaceEvent event) {
        String itemId = event.getMechanic().getItemID();
        // event.getPlayer(), event.getBlock(), event.getBaseEntity()
        // event.getItemInHand(), event.getHand()
    }

    @EventHandler
    public void onFurnitureInteract(NexoFurnitureInteractEvent event) {
        String itemId = event.getMechanic().getItemID();
        ItemDisplay baseEntity = event.getBaseEntity();
        // event.getPlayer(), event.getItemInHand(), event.getHand()
        // event.getInteractionPoint(), event.getBlockFace()

        // Control interaction sub-behaviors:
        // event.setCanSit(Event.Result.DENY);
        // event.setCanRotate(Event.Result.DENY);
        // event.setCanOpenStorage(Event.Result.DENY);
        // event.setCanToggleLight(Event.Result.DENY);
        // event.setCanRunAction(Event.Result.DENY);
    }
}
```

### Resource Pack Events

```java
import com.nexomc.nexo.api.events.resourcepack.NexoPrePackGenerateEvent;
import com.nexomc.nexo.api.events.resourcepack.NexoPostPackGenerateEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PackListener implements Listener {

    @EventHandler
    public void onPrePackGenerate(NexoPrePackGenerateEvent event) {
        // Add custom resources before pack is generated
        event.addResourcePack(myResourcePackFile);
        event.addUnknownFile("assets/myplugin/custom.json", jsonBytes);
    }

    @EventHandler
    public void onPostPackGenerate(NexoPostPackGenerateEvent event) {
        // Modify pack after generation
        event.addResourcePack(additionalPack);
    }
}
```

### Send Resource Pack to a Player

```java
import com.nexomc.nexo.api.NexoPack;
import org.bukkit.entity.Player;

NexoPack.sendPack(player);
```

---

## API Reference

### com.nexomc.nexo.api.NexoItems
| Method | Returns |
|---|---|
| `itemFromId(String id)` | `ItemBuilder` (null if not found) |
| `optionalItemFromId(String id)` | `Optional<ItemBuilder>` |
| `builderFromItem(ItemStack item)` | `ItemBuilder` |
| `idFromItem(ItemStack item)` | `String` |
| `idFromItem(ItemBuilder item)` | `String` |
| `exists(String itemId)` | `boolean` |
| `exists(ItemStack itemStack)` | `boolean` |
| `isSameId(ItemStack first, ItemStack second)` | `boolean` |
| `hasMechanic(String itemID, String mechanicID)` | `boolean` |
| `itemNames()` | `Set<String>` |
| `items()` | `Set<ItemBuilder>` |
| `entries()` | `Map<String, ItemBuilder>` |
| `loadItems()` | `void` |
| `updateItem(ItemStack item)` | `ItemStack` |
| `registerUpdateCallback(Key key, UpdateCallback cb)` | `void` |
| `unregisterUpdateCallback(Key key)` | `void` |

### com.nexomc.nexo.items.ItemBuilder
| Method | Returns |
|---|---|
| `build()` | `ItemStack` |
| `buildArray(int amount)` | `ItemStack[]` |
| `clone()` | `ItemBuilder` |
| `getType()` | `Material` |
| `setType(Material type)` | `ItemBuilder` |
| `getAmount()` | `Integer` |
| `setAmount(Integer amount)` | `ItemBuilder` |
| `getDisplayName()` | `Component` |
| `displayName(Component name)` | `ItemBuilder` |
| `getItemName()` | `Component` |
| `itemName(Component name)` | `ItemBuilder` |
| `getLore()` / `lore()` | `List<Component>` |
| `lore(List<Component> lore)` | `ItemBuilder` |
| `setUnbreakable(Boolean val)` | `ItemBuilder` |
| `setDurability(Integer val)` | `ItemBuilder` |
| `setColor(Color color)` | `ItemBuilder` |
| `setItemModel(Key model)` | `ItemBuilder` |
| `customModelData(Integer cmd)` | `ItemBuilder` |
| `addEnchant(Enchantment e, Integer lvl)` | `ItemBuilder` |
| `addItemFlags(ItemFlag... flags)` | `ItemBuilder` |
| `addAttributeModifiers(Attribute a, AttributeModifier m)` | `ItemBuilder` |
| `customTag(NamespacedKey key, PersistentDataType type, Object val)` | `ItemBuilder` |
| `customTag(NamespacedKey key, PersistentDataType type)` | `Object` (getter) |
| `removeCustomTag(NamespacedKey key)` | `ItemBuilder` |
| `maxStackSize(Integer size)` | `ItemBuilder` |
| `setRarity(ItemRarity rarity)` | `ItemBuilder` |
| `setFireResistant(Boolean val)` | `ItemBuilder` |
| `setEnchantmentGlintOverride(Boolean val)` | `ItemBuilder` |
| `setFoodComponent(FoodComponent fc)` | `ItemBuilder` |
| `setToolComponent(ToolComponent tc)` | `ItemBuilder` |
| `setEquippableComponent(EquippableComponent ec)` | `ItemBuilder` |

### com.nexomc.nexo.api.NexoBlocks
| Method | Returns |
|---|---|
| `isCustomBlock(Block block)` | `boolean` |
| `isCustomBlock(ItemStack item)` | `boolean` |
| `isCustomBlock(String itemId)` | `boolean` |
| `isNexoNoteBlock(Block / String / ItemStack)` | `boolean` |
| `isNexoStringBlock(Block / String)` | `boolean` |
| `isNexoChorusBlock(Block / String)` | `boolean` |
| `place(String itemID, Location loc)` | `void` |
| `remove(Location loc)` | `boolean` |
| `remove(Location loc, Player player)` | `boolean` |
| `remove(Location loc, Player player, boolean forceDrop)` | `boolean` |
| `remove(Location loc, Player player, Drop overrideDrop)` | `boolean` |
| `blockData(String itemID)` | `BlockData` |
| `customBlockMechanic(Block / Location / BlockData / String)` | `CustomBlockMechanic` |
| `noteBlockMechanic(Block / BlockData / String)` | `NoteBlockMechanic` |
| `stringMechanic(Block / BlockData / String)` | `StringBlockMechanic` |
| `chorusBlockMechanic(Block / BlockData / String)` | `ChorusBlockMechanic` |
| `blockIDs()` | `String[]` |
| `noteBlockIDs()` | `String[]` |
| `stringBlockIDs()` | `String[]` |
| `chorusBlockIDs()` | `String[]` |

### com.nexomc.nexo.api.NexoFurniture
| Method | Returns |
|---|---|
| `isFurniture(Location / Entity / String / ItemStack)` | `boolean` |
| `place(String itemID, Location loc, Rotation rot, BlockFace face)` | `ItemDisplay` |
| `place(String itemID, Location loc, float yaw, BlockFace face)` | `ItemDisplay` |
| `remove(Location loc)` | `boolean` |
| `remove(Location loc, Player player)` | `boolean` |
| `remove(Location loc, Player player, Drop drop)` | `boolean` |
| `remove(Entity entity)` | `boolean` |
| `remove(Entity entity, Player player)` | `boolean` |
| `remove(Entity entity, Player player, Drop drop)` | `boolean` |
| `furnitureMechanic(Block / Location / Entity / String / ItemStack)` | `FurnitureMechanic` |
| `baseEntity(Block / Location)` | `ItemDisplay` |
| `baseEntity(int interactionId)` | `ItemDisplay` |
| `findTargetFurniture(Player player)` | `ItemDisplay` |
| `furnitureItem(ItemDisplay entity)` | `ItemStack` (getter) |
| `furnitureItem(ItemDisplay entity, ItemStack item)` | `void` (setter) |
| `furnitureDye(ItemDisplay entity)` | `Color` (getter) |
| `furnitureDye(ItemDisplay entity, Color color)` | `void` (setter) |
| `updateFurniture(ItemDisplay entity)` | `void` |
| `toggleLight(ItemDisplay entity)` | `boolean` |
| `toggleLight(ItemDisplay entity, Boolean state)` | `boolean` |
| `lightState(ItemDisplay entity)` | `boolean` |
| `furnitureIDs()` | `String[]` |

### com.nexomc.nexo.mechanics.Mechanic (base class)
| Method | Returns |
|---|---|
| `getItemID()` | `String` |
| `getFactory()` | `MechanicFactory` |
| `getSection()` | `ConfigurationSection` |

### com.nexomc.nexo.mechanics.custom_block.CustomBlockMechanic extends Mechanic
| Method | Returns |
|---|---|
| `getBlockData()` | `BlockData` |
| `getModel()` | `Key` |
| `getCustomVariation()` | `Integer` |
| `getLight()` | `LightMechanic` |
| `hasLight()` | `boolean` |
| `getBlockSounds()` | `BlockSounds` |
| `hasBlockSounds()` | `boolean` |
| `getLimitedPlacing()` | `LimitedPlacing` |
| `getBreakable()` | `Breakable` |
| `isBlastResistant()` | `boolean` |
| `getImmovable()` | `boolean` |
| `getClickActions()` | `List<ClickAction>` |
| `runClickActions(Player player)` | `void` |

### com.nexomc.nexo.mechanics.furniture.FurnitureMechanic extends Mechanic
| Method | Returns |
|---|---|
| `place(Location loc)` | `ItemDisplay` |
| `place(Location loc, float yaw, BlockFace facing)` | `ItemDisplay` |
| `removeBaseEntity(ItemDisplay entity)` | `void` |
| `getProperties()` | `FurnitureProperties` |
| `getLight()` | `LightMechanic` |
| `getStorage()` | `StorageMechanic` |
| `isStorage()` | `boolean` |
| `getRotatable()` | `Rotatable` |
| `getHitbox()` | `FurnitureHitbox` |
| `getSeats()` | `List<FurnitureSeat>` |
| `getHasSeats()` | `boolean` |
| `getBeds()` | `List<FurnitureBed>` |
| `getHasBeds()` | `boolean` |
| `getEvolution()` | `EvolvingFurniture` |
| `getHasEvolution()` | `boolean` |
| `getClickActions()` | `List<ClickAction>` |
| `getBlockSounds()` | `BlockSounds` |
| `getBreakable()` | `Breakable` |
| `isJukebox()` | `boolean` |
| `isInteractable(Player player)` | `boolean` |
| `isModelEngine()` | `boolean` |
| `getWaterloggable()` | `boolean` |
| `runClickActions(Player player)` | `void` |
| `rotateFurniture(ItemDisplay entity)` | `void` |
| `placedItem(ItemDisplay entity)` | `ItemBuilder` |

### com.nexomc.nexo.api.NexoPack
| Method | Returns |
|---|---|
| `resourcePack()` | `ResourcePack` |
| `builtResourcePack()` | `BuiltResourcePack` |
| `sendPack(Player player)` | `void` |
| `mergePack(ResourcePack rp, ResourcePack imported)` | `void` |
| `overwritePack(ResourcePack rp, ResourcePack overwrite)` | `void` |
| `clearPack(ResourcePack rp)` | `void` |
| `mergePackFromDirectory(File dir)` | `void` |
| `mergePackFromZip(File zip)` | `void` |

### Events

| Event Class | Package | Cancellable | Key Getters |
|---|---|---|---|
| `NexoItemsLoadedEvent` | `com.nexomc.nexo.api.events` | No | -- |
| `NexoMechanicsRegisteredEvent` | `com.nexomc.nexo.api.events` | No | -- |
| `NexoBlockBreakEvent` | `com.nexomc.nexo.api.events.custom_block` | Yes | `getMechanic()`, `getBlock()`, `getPlayer()`, `getDrop()` / `setDrop()` |
| `NexoBlockPlaceEvent` | `com.nexomc.nexo.api.events.custom_block` | Yes | `getMechanic()`, `getBlock()`, `getPlayer()`, `getItemInHand()`, `getHand()` |
| `NexoBlockInteractEvent` | `com.nexomc.nexo.api.events.custom_block` | Yes | `getMechanic()`, `getBlock()`, `getPlayer()`, `getItemInHand()`, `getHand()`, `getBlockFace()`, `getAction()` |
| `NexoBlockDamageEvent` | `com.nexomc.nexo.api.events.custom_block` | Yes | `getMechanic()`, `getBlock()`, `getPlayer()` |
| `NexoCustomBlockDropLootEvent` | `com.nexomc.nexo.api.events.custom_block` | No | `getMechanic()`, `getBlock()`, `getPlayer()`, `getLoots()` |
| `NexoFurnitureBreakEvent` | `com.nexomc.nexo.api.events.furniture` | Yes | `getMechanic()`, `getBaseEntity()`, `getPlayer()`, `getDrop()` / `setDrop()` |
| `NexoFurniturePlaceEvent` | `com.nexomc.nexo.api.events.furniture` | Yes | `getMechanic()`, `getBaseEntity()`, `getBlock()`, `getPlayer()`, `getItemInHand()`, `getHand()` |
| `NexoFurnitureInteractEvent` | `com.nexomc.nexo.api.events.furniture` | Yes | `getMechanic()`, `getBaseEntity()`, `getPlayer()`, `getItemInHand()`, `getHand()`, `getInteractionPoint()`, `getBlockFace()`, `getUseFurniture()`, `getUseItemInHand()`, `getCanSit()`, `getCanRotate()`, `getCanOpenStorage()`, `getCanToggleLight()`, `getCanRunAction()`, `getCanSleep()` |
| `NexoFurnitureDamageEvent` | `com.nexomc.nexo.api.events.furniture` | Yes | `getMechanic()`, `getBaseEntity()`, `getPlayer()` |
| `NexoPrePackGenerateEvent` | `com.nexomc.nexo.api.events.resourcepack` | No | `getResourcePack()`, `addResourcePack(ResourcePack/File)`, `addUnknownFile(String, byte[])` |
| `NexoPostPackGenerateEvent` | `com.nexomc.nexo.api.events.resourcepack` | No | `getResourcePack()`, `addResourcePack(ResourcePack/File)`, `addUnknownFile(String, byte[])` |
| `NexoPackUploadEvent` | `com.nexomc.nexo.api.events.resourcepack` | No | `getUrl()`, `getHash()` |

Subclass block events exist for specific block types in sub-packages: `NexoNoteBlockBreakEvent`, `NexoStringBlockBreakEvent`, `NexoChorusBlockBreakEvent` (and Place/Interact/Damage/DropLoot variants) under `com.nexomc.nexo.api.events.custom_block.noteblock`, `.stringblock`, `.chorusblock`. They extend the base block events and override `getMechanic()` to return the specific mechanic type.
