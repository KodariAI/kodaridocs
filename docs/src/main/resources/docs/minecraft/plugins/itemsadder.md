# ItemsAdder API

ItemsAdder is a Minecraft plugin that lets server owners create custom items, blocks, furniture, entities, HUDs, and resource packs without modding the client. The Java API (package `dev.lone.itemsadder.api`) allows other plugins to interact with all custom content programmatically.

**Important:** Always wait for ItemsAdder to finish loading before using the API. Listen to `ItemsAdderLoadDataEvent` before accessing any custom content.

## Class Overview

| Class | Package | Purpose |
|---|---|---|
| `CustomStack` | `dev.lone.itemsadder.api` | Core class for custom items. Get/create/modify custom item stacks. |
| `CustomBlock` | `dev.lone.itemsadder.api` | Extends `CustomStack`. Place, remove, and query custom blocks in the world. |
| `CustomFurniture` | `dev.lone.itemsadder.api` | Extends `CustomStack`. Spawn, remove, and manipulate custom furniture entities. |
| `CustomEntity` | `dev.lone.itemsadder.api` | Custom entity spawning, animations, bones, and passengers. |
| `CustomCrop` | `dev.lone.itemsadder.api` | Custom crop placement, age management, and loot. |
| `CustomFire` | `dev.lone.itemsadder.api` | Extends `CustomStack`. Custom fire placement and age control. |
| `ItemsAdder` | `dev.lone.itemsadder.api` | Static utility class. Many methods are deprecated in favor of the classes above. Still useful for `areItemsLoaded()`, `isCustomItem()`, `getAllItems()`, resource pack, and liquid management. |
| `FontImageWrapper` | `dev.lone.itemsadder.api.FontImages` | Custom font image/emoji access and rendering. |
| `PlayerHudsHolderWrapper` | `dev.lone.itemsadder.api.FontImages` | Per-player HUD holder. Required to create HUD wrappers. |
| `PlayerQuantityHudWrapper` | `dev.lone.itemsadder.api.FontImages` | Controls quantity-based HUDs (health bars, mana, etc). |
| `PlayerCustomHudWrapper` | `dev.lone.itemsadder.api.FontImages` | Controls custom HUDs with font image lists. |
| `TexturedInventoryWrapper` | `dev.lone.itemsadder.api.FontImages` | Opens inventories with custom textures. |

**Note:** `CustomMob` is fully deprecated and removed as of 4.0.10. Use `CustomEntity` instead.

## Code Examples

### Wait for ItemsAdder to Load

Always listen for this event before accessing custom content. This fires on first load AND on `/iareload`.

```java
import dev.lone.itemsadder.api.Events.ItemsAdderLoadDataEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class IALoadListener implements Listener {

    @EventHandler
    public void onItemsAdderLoad(ItemsAdderLoadDataEvent event) {
        if (event.getCause() == ItemsAdderLoadDataEvent.Cause.FIRST_LOAD) {
            // Safe to access ItemsAdder API now
            // Register your custom logic, cache items, etc.
        }
    }
}
```

### Get and Give a Custom Item

```java
import dev.lone.itemsadder.api.CustomStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemGiver {

    public void giveCustomItem(Player player, String namespacedId) {
        // namespacedId format: "namespace:item_id", e.g. "myitems:ruby"
        CustomStack stack = CustomStack.getInstance(namespacedId);
        if (stack == null) {
            player.sendMessage("Item not found: " + namespacedId);
            return;
        }
        ItemStack itemStack = stack.getItemStack();
        itemStack.setAmount(1);
        player.getInventory().addItem(itemStack);
    }
}
```

### Check if an ItemStack is a Custom Item

```java
import dev.lone.itemsadder.api.CustomStack;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class CustomItemChecker implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        ItemStack itemInHand = event.getItem();
        if (itemInHand == null) return;

        CustomStack customStack = CustomStack.byItemStack(itemInHand);
        if (customStack != null) {
            String id = customStack.getNamespacedID(); // e.g. "myitems:ruby_sword"
            String namespace = customStack.getNamespace(); // e.g. "myitems"
            String itemId = customStack.getId(); // e.g. "ruby_sword"
            event.getPlayer().sendMessage("Custom item: " + id);
        }
    }
}
```

### Custom Item Durability and Usages

```java
import dev.lone.itemsadder.api.CustomStack;
import org.bukkit.inventory.ItemStack;

public class DurabilityExample {

    public void manipulateDurability(ItemStack itemStack) {
        CustomStack stack = CustomStack.byItemStack(itemStack);
        if (stack == null) return;

        if (stack.hasCustomDurability()) {
            int current = stack.getDurability();
            int max = stack.getMaxDurability();
            stack.setDurability(current - 10); // reduce by 10
        }

        if (stack.hasUsagesAttribute()) {
            int usages = stack.getUsages();
            stack.reduceUsages(1); // decrement by 1
        }
    }
}
```

### Place and Remove Custom Blocks

```java
import dev.lone.itemsadder.api.CustomBlock;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class BlockExample {

    public void placeBlock(Location location, String namespacedId) {
        // Static method: place by namespaced ID directly
        CustomBlock placed = CustomBlock.place(namespacedId, location);
        if (placed == null) {
            // Block ID not found in registry
            return;
        }
    }

    public void removeBlock(Location location) {
        CustomBlock.remove(location);
    }

    public boolean isCustomBlock(Block block) {
        CustomBlock customBlock = CustomBlock.byAlreadyPlaced(block);
        return customBlock != null;
    }

    public List<ItemStack> getBlockDrops(Block block, ItemStack tool) {
        // includeSelfBlock=true means the block item itself is included in drops
        return CustomBlock.getLoot(block, tool, true);
    }
}
```

### Custom Block Events

```java
import dev.lone.itemsadder.api.Events.CustomBlockBreakEvent;
import dev.lone.itemsadder.api.Events.CustomBlockPlaceEvent;
import dev.lone.itemsadder.api.Events.CustomBlockInteractEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BlockEventListener implements Listener {

    @EventHandler
    public void onCustomBlockBreak(CustomBlockBreakEvent event) {
        String id = event.getNamespacedID();
        if (id.equals("myitems:ruby_ore")) {
            event.getPlayer().sendMessage("You broke a ruby ore!");
            // event.setCancelled(true); // prevent breaking
        }
    }

    @EventHandler
    public void onCustomBlockPlace(CustomBlockPlaceEvent event) {
        String id = event.getNamespacedID();
        event.getPlayer().sendMessage("Placed custom block: " + id);
    }

    @EventHandler
    public void onCustomBlockInteract(CustomBlockInteractEvent event) {
        String id = event.getNamespacedID();
        event.getPlayer().sendMessage("Interacted with: " + id);
    }
}
```

### Spawn and Manage Custom Furniture

```java
import dev.lone.itemsadder.api.CustomFurniture;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;

public class FurnitureExample {

    public void spawnFurniture(String namespacedId, Block block) {
        // Spawns at the block location (snapped to block grid)
        CustomFurniture furniture = CustomFurniture.spawn(namespacedId, block);
        if (furniture == null) return;

        Entity entity = furniture.getEntity();
        // furniture.setCurrentLightLevel(15);
    }

    public void spawnPrecise(String namespacedId, Location location) {
        // Spawns at exact coordinates (non-solid, no hitbox collision)
        CustomFurniture furniture = CustomFurniture.spawnPreciseNonSolid(namespacedId, location);
    }

    public void removeFurniture(Entity entity) {
        CustomFurniture furniture = CustomFurniture.byAlreadySpawned(entity);
        if (furniture != null) {
            furniture.remove(true); // true = drop item
        }
    }

    public void replaceFurniture(Entity entity, String newNamespacedId) {
        CustomFurniture furniture = CustomFurniture.byAlreadySpawned(entity);
        if (furniture != null) {
            furniture.replaceFurniture(newNamespacedId);
        }
    }
}
```

### Furniture Events

```java
import dev.lone.itemsadder.api.CustomFurniture;
import dev.lone.itemsadder.api.Events.FurnitureBreakEvent;
import dev.lone.itemsadder.api.Events.FurnitureInteractEvent;
import dev.lone.itemsadder.api.Events.FurniturePlacedEvent;
import dev.lone.itemsadder.api.Events.FurniturePrePlaceEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FurnitureEventListener implements Listener {

    @EventHandler
    public void onFurnitureBreak(FurnitureBreakEvent event) {
        String id = event.getNamespacedID();
        CustomFurniture furniture = event.getFurniture();
        event.getPlayer().sendMessage("Broke furniture: " + id);
        // event.setCancelled(true);
    }

    @EventHandler
    public void onFurnitureInteract(FurnitureInteractEvent event) {
        String id = event.getNamespacedID();
        CustomFurniture furniture = event.getFurniture();
        event.getPlayer().sendMessage("Interacted with furniture: " + id);
    }

    @EventHandler
    public void onFurniturePlaced(FurniturePlacedEvent event) {
        // Called AFTER furniture is placed successfully
        String id = event.getNamespacedID();
        event.getPlayer().sendMessage("Placed furniture: " + id);
    }

    @EventHandler
    public void onFurniturePrePlace(FurniturePrePlaceEvent event) {
        // Called BEFORE placing, cancel here to prevent placement
        // event.setCancelled(true);
    }
}
```

### Spawn Custom Entities and Play Animations

```java
import dev.lone.itemsadder.api.CustomEntity;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

public class EntityExample {

    public void spawnEntity(String namespacedId, Location location) {
        CustomEntity entity = CustomEntity.spawn(namespacedId, location);
        if (entity == null) return;

        Entity bukkitEntity = entity.getEntity();
        String id = entity.getNamespacedID();
    }

    public void checkAndAnimate(Entity bukkitEntity) {
        CustomEntity customEntity = CustomEntity.byAlreadySpawned(bukkitEntity);
        if (customEntity == null) return;

        // Check and play animation
        if (customEntity.hasAnimation("attack")) {
            customEntity.playAnimation("attack", () -> {
                // Runnable called when animation finishes
            });
        }

        // Stop current animation
        customEntity.stopAnimation();
    }

    public boolean isCustomEntity(Entity entity) {
        return CustomEntity.isCustomEntity(entity);
    }

    public void mountEntity(CustomEntity customEntity, LivingEntity passenger) {
        if (customEntity.hasMountBones()) {
            customEntity.addPassenger(passenger);
        }
    }

    public void destroyEntity(Entity bukkitEntity) {
        CustomEntity customEntity = CustomEntity.byAlreadySpawned(bukkitEntity);
        if (customEntity != null) {
            customEntity.destroy();
        }
    }
}
```

### Custom Entity Death Event

```java
import dev.lone.itemsadder.api.Events.CustomEntityDeathEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EntityDeathListener implements Listener {

    @EventHandler
    public void onCustomEntityDeath(CustomEntityDeathEvent event) {
        String id = event.getNamespacedID();
        Player killer = event.getKiller(); // may be null
        if (killer != null) {
            killer.sendMessage("You killed: " + id);
        }
    }
}
```

### Custom Crops

```java
import dev.lone.itemsadder.api.CustomCrop;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class CropExample {

    public void plantCrop(String namespacedId, Location location) {
        CustomCrop crop = CustomCrop.place(namespacedId, location);
    }

    public void growCrop(Block block) {
        CustomCrop crop = CustomCrop.byAlreadyPlaced(block);
        if (crop == null) return;

        int age = crop.getAge();
        int maxAge = crop.getMaxAge();
        if (!crop.isFullyGrown()) {
            crop.incrementAge();
            // or set directly: crop.setAge(maxAge);
            // or fully grow: crop.setFullyGrown();
        }
    }

    public List<ItemStack> harvestLoot(Block block, ItemStack tool) {
        return CustomCrop.getLoot(block, tool);
    }
}
```

### HUD Management

```java
import dev.lone.itemsadder.api.FontImages.PlayerHudsHolderWrapper;
import dev.lone.itemsadder.api.FontImages.PlayerQuantityHudWrapper;
import org.bukkit.entity.Player;

public class HudExample {

    public void setManaBar(Player player, float value) {
        PlayerHudsHolderWrapper holder = new PlayerHudsHolderWrapper(player);
        PlayerQuantityHudWrapper hud = new PlayerQuantityHudWrapper(holder, "mynamespace:mana_bar");
        hud.setFloatValue(value); // 0.0 to 1.0 typically
        hud.setVisible(true);
        holder.sendUpdate();
    }

    public void hideHud(Player player, String namespacedId) {
        PlayerHudsHolderWrapper holder = new PlayerHudsHolderWrapper(player);
        PlayerQuantityHudWrapper hud = new PlayerQuantityHudWrapper(holder, namespacedId);
        hud.setVisible(false);
        holder.sendUpdate();
    }
}
```

### Font Images

```java
import dev.lone.itemsadder.api.FontImages.FontImageWrapper;
import net.kyori.adventure.text.Component;

public class FontImageExample {

    public String getEmojiString(String namespacedId) {
        // e.g. "mynamespace:smile_emoji"
        FontImageWrapper wrapper = FontImageWrapper.instance(namespacedId);
        if (wrapper == null || !wrapper.exists()) return "";
        return wrapper.getString(); // Returns the unicode character(s)
    }

    public Component replaceInComponent(Component text) {
        // Replaces :emoji_name: placeholders with actual font images
        return FontImageWrapper.replaceFontImages(text);
    }

    public String replaceInString(String text) {
        return FontImageWrapper.replaceFontImages(text);
    }
}
```

### Textured Inventory

```java
import dev.lone.itemsadder.api.FontImages.FontImageWrapper;
import dev.lone.itemsadder.api.FontImages.TexturedInventoryWrapper;
import org.bukkit.entity.Player;

public class TexturedGuiExample {

    public void openCustomGui(Player player) {
        FontImageWrapper texture = FontImageWrapper.instance("mynamespace:custom_gui");
        if (texture == null || !texture.exists()) return;

        // 54 = 6 rows of 9 slots
        TexturedInventoryWrapper gui = new TexturedInventoryWrapper(
                null, 54, "My Custom GUI", texture, 0, 0
        );
        gui.showInventory(player);
    }
}
```

### Utility: List All Custom Items

```java
import dev.lone.itemsadder.api.CustomStack;
import dev.lone.itemsadder.api.ItemsAdder;

import java.util.List;
import java.util.Set;

public class RegistryQuery {

    public void listAllItems() {
        // Get all registered namespaced IDs
        Set<String> allIds = CustomStack.getNamespacedIdsInRegistry();
        for (String id : allIds) {
            CustomStack stack = CustomStack.getInstance(id);
            if (stack != null) {
                String display = stack.getDisplayName();
            }
        }
    }

    public void listByNamespace(String namespace) {
        List<CustomStack> items = ItemsAdder.getAllItems(namespace);
        for (CustomStack stack : items) {
            String id = stack.getNamespacedID();
        }
    }

    public boolean itemsReady() {
        return ItemsAdder.areItemsLoaded();
    }
}
```

### Liquids

```java
import dev.lone.itemsadder.api.ItemsAdder;
import org.bukkit.Location;

public class LiquidExample {

    public void placeLiquid(String namespacedId, Location location) {
        // e.g. "ialiquids:red_water"
        ItemsAdder.setLiquid(namespacedId, location);
    }

    public String getLiquidAt(Location location) {
        return ItemsAdder.getLiquidName(location); // null if no custom liquid
    }
}
```

## API Reference

### dev.lone.itemsadder.api.CustomStack

Core class representing any custom item.

- `@Nullable static CustomStack getInstance(String namespacedID)` -- Get a clone from registry. Returns null if not found.
- `@Nullable static CustomStack byItemStack(ItemStack itemStack)` -- Get CustomStack from an existing Bukkit ItemStack. Returns null if not custom.
- `static Set<String> getNamespacedIdsInRegistry()` -- All registered IDs in `namespace:id` format.
- `static boolean isInRegistry(String namespacedId)` -- Check if ID exists.
- `ItemStack getItemStack()` -- Get the underlying Bukkit ItemStack.
- `String getNamespacedID()` -- Returns `namespace:id`.
- `String getNamespace()` -- Namespace portion.
- `String getId()` -- ID portion.
- `String getDisplayName()` -- Display name string.
- `Component itemName()` -- Adventure Component name.
- `void setDisplayName(String displayName)` -- Change display name.
- `boolean isBlock()` -- True if this item is a custom block.
- `boolean hasCustomDurability()` -- Has custom durability system.
- `int getDurability()` / `void setDurability(int)` -- Current durability.
- `int getMaxDurability()` / `void setMaxDurability(int)` -- Max durability.
- `boolean hasUsagesAttribute()` -- Has usage tracking.
- `int getUsages()` / `void setUsages(int)` / `void reduceUsages(int)` -- Usage count.
- `void setAttributeModifier(String attribute, String slot, double value)` -- Set attribute modifier. Slots: `mainhand`, `offhand`, `head`, `chest`, `legs`, `feet`.
- `double getDamageMainhand()` -- Main hand damage value.
- `boolean matchNamespacedID(CustomStack other)` -- Compare IDs.
- `boolean drop(Location loc)` -- Drop item at location.
- `@Nullable String getPermission()` / `boolean hasPermission()` -- Permission node.
- `String getModelPath()` -- Model path.
- `String getConfigPath()` -- Config file path.
- `FileConfiguration getConfig()` -- Bukkit FileConfiguration.
- `List<String> getTextures()` -- Texture paths.
- `boolean isBlockAllEnchants()` -- Enchanting blocked.

### dev.lone.itemsadder.api.CustomBlock extends CustomStack

- `@Nullable static CustomBlock getInstance(String namespacedID)` -- Get instance from registry.
- `@Nullable static CustomBlock byAlreadyPlaced(Block block)` -- Get from a placed block. Null if not custom.
- `@Nullable static CustomBlock byItemStack(ItemStack itemStack)` -- Get from ItemStack.
- `static Set<String> getNamespacedIdsInRegistry()` -- All registered custom block IDs.
- `static boolean isInRegistry(String namespacedId)` -- Check existence.
- `@Nullable static CustomBlock place(String namespacedId, Location location)` -- Place block.
- `CustomBlock place(Location location)` -- Place this instance.
- `boolean isPlaced()` -- Whether currently placed.
- `boolean remove()` / `static boolean remove(Location)` -- Remove custom block.
- `Block getBlock()` -- Get Bukkit Block.
- `BlockData getBaseBlockData()` / `static BlockData getBaseBlockData(String namespacedID)` -- Base block data.
- `int getOriginalLightLevel()` / `void setCurrentLightLevel(int)` -- Light level.
- `List<ItemStack> getLoot()` / `List<ItemStack> getLoot(boolean includeSelfBlock)` / `List<ItemStack> getLoot(ItemStack tool, boolean includeSelfBlock)` -- Get drops.
- `static List<ItemStack> getLoot(Block, ItemStack, boolean)` -- Static loot query.
- `boolean playBreakEffect()` / `boolean playBreakSound()` / `boolean playBreakParticles()` / `boolean playPlaceSound()` -- Effects.
- `static boolean playBreakEffect(Block)` / `static boolean playBreakSound(Block)` / `static boolean playBreakParticles(Block)` / `static boolean playPlaceSound(Block)` -- Static effect methods.

#### dev.lone.itemsadder.api.CustomBlock.Advanced (static inner class)

- `static String getInCustomRegion(Location)` -- Get block ID at location from region data.
- `static void placeInCustomRegion(CustomBlock, Location)` -- Write to region file.
- `static boolean placeInCustomRegion(String, Location)` -- Write by ID.
- `static boolean removeFromCustomRegion(Location)` -- Remove from region file.
- `static List<Location> getAllBlocksLocationsList(Chunk)` -- All custom block locations in chunk.
- `static Map<Location, String> getAllBlocksLocations(Chunk)` -- Location-to-ID map in chunk.
- `static void deleteAllCustomBlocksInChunk(Chunk)` -- Clear all custom blocks in chunk.
- `static void deleteAllCustomBlocksInChunk(Chunk, boolean removeVanillaBlock, boolean sendChunkPacket)` -- Clear with options.
- `static void runActionOnBlocks(Chunk, BiConsumer<String, Location>)` -- Iterate all custom blocks in chunk.

### dev.lone.itemsadder.api.CustomFurniture extends CustomStack

- `@Nullable static CustomFurniture spawn(String namespacedId, Block block)` -- Spawn at block.
- `@Nullable static CustomFurniture spawnPreciseNonSolid(String namespacedId, Location location)` -- Spawn at exact location (no collision).
- `@Nullable static CustomFurniture byAlreadySpawned(Entity entity)` -- Get from entity.
- `@Nullable static CustomFurniture byAlreadySpawned(Block block)` -- Get from block.
- `static Set<String> getNamespacedIdsInRegistry()` -- All registered furniture IDs.
- `void remove(boolean dropItem)` -- Remove furniture. `true` to drop item.
- `static void remove(Entity, boolean)` -- Static removal.
- `void teleport(Location)` / `void teleport(Entity)` -- Move furniture.
- `void replaceFurniture(String newNamespacedId)` -- Swap model.
- `void replaceFurniture(String newNamespacedId, Color color)` -- Swap model with color.
- `void setColor(Color color)` -- Set color.
- `int getOriginalLightLevel()` / `void setCurrentLightLevel(int)` -- Light.
- `@Nullable Entity getEntity()` -- Get backing entity (armor stand or display entity).

### dev.lone.itemsadder.api.CustomEntity

- `@Nullable static CustomEntity spawn(String namespacedId, Location location)` -- Basic spawn.
- `@Nullable static CustomEntity spawn(String namespacedId, Location location, boolean frustumCulling)` -- Spawn with culling option.
- `@Nullable static CustomEntity byAlreadySpawned(Entity entity)` -- Get from Bukkit entity. Null if not custom.
- `static boolean isCustomEntity(Entity entity)` / `static boolean isCustomEntity(UUID uuid)` -- Check if entity is custom.
- `static Set<String> getNamespacedIdsInRegistry()` -- All registered entity IDs.
- `static boolean isInRegistry(String namespacedId)` -- Check existence.
- `static CustomEntity convert(String namespacedId, LivingEntity entity)` -- Convert existing entity.
- `Entity getEntity()` -- Bukkit entity.
- `EntityType getType()` -- Entity type.
- `Location getLocation()` -- Current location.
- `String getNamespacedID()` / `String getNamespace()` / `String getId()` -- Identifiers.
- `boolean playAnimation(String name)` -- Play animation. Returns false if not found.
- `boolean playAnimation(String name, Runnable onFinish)` -- Play with callback.
- `void stopAnimation()` -- Stop current animation.
- `boolean isPlayingAnimation(String name)` -- Check animation state.
- `boolean hasAnimation(String name)` / `static boolean hasAnimation(String namespacedId, String animName)` -- Animation existence check.
- `List<String> getAnimationsNames()` / `static List<String> getAnimationsNames(String namespacedId)` -- List animations.
- `void teleport(Location location)` -- Move entity.
- `void destroy()` -- Remove entity.
- `void respawn(Player player)` -- Respawn for player.
- `void playDamageEffect(boolean enabled)` -- Damage flash effect.
- `Set<CustomEntity.Bone> getBones()` -- All bones.
- `CustomEntity.Bone getBone(String name)` / `CustomEntity.Bone getBone(int id)` -- Specific bone.
- `Set<CustomEntity.MountBone> getMountBones()` -- Mount bones.
- `boolean hasMountBones()` -- Has mount slots.
- `boolean addPassenger(LivingEntity)` -- Add rider.
- `boolean setPassenger(LivingEntity, int slot)` -- Set rider to slot.
- `static void removePassenger(LivingEntity)` -- Remove rider.
- `Set<LivingEntity> getPassengers()` -- All riders.
- `boolean hasPassenger()` / `boolean hasPassenger(LivingEntity)` -- Check riders.
- `void setColorAllBones(int color)` -- Tint all bones (RGB int).
- `void setEnchantedAllBones(boolean enchanted)` -- Enchant glow on all bones.
- `void addViewer(Player)` / `void removeViewer(Player)` -- Per-player visibility.
- `boolean getFrustumCulling()` / `void setFrustumCulling(boolean)` -- Culling control.
- `List<ItemStack> getLoot()` / `List<ItemStack> getLoot(ItemStack tool)` / `static List<ItemStack> getLoot(LivingEntity, ItemStack)` -- Drop loot.

#### dev.lone.itemsadder.api.CustomEntity.Bone

- `String getName()` / `int getId()` / `int getOrdinal()` -- Identification.
- `Location getLocation()` -- Bone world location.
- `int getColor()` / `void setColor(int color)` -- RGB color.
- `boolean getEnchanted()` / `void setEnchanted(boolean)` -- Enchant glow.

#### dev.lone.itemsadder.api.CustomEntity.MountBone extends Bone

- `boolean setPassenger(LivingEntity)` -- Mount a passenger.
- `LivingEntity getPassenger()` -- Current rider.
- `void removePassenger()` -- Dismount.
- `boolean canControl()` / `void setCanControl(boolean)` -- Rider control.
- `boolean isLocked()` / `void setLocked(boolean)` -- Lock seat.

### dev.lone.itemsadder.api.CustomCrop

- `@Nullable static CustomCrop place(String namespacedId, Location location)` -- Plant crop.
- `@Nullable static CustomCrop byAlreadyPlaced(Block block)` -- Get from placed block.
- `static boolean isSeed(ItemStack itemStack)` -- Check if item is a custom seed.
- `int getAge()` / `void setAge(int)` -- Growth stage.
- `int getMaxAge()` -- Maximum growth stage.
- `boolean isFullyGrown()` -- At max age.
- `void setFullyGrown()` -- Set to max age.
- `void incrementAge()` -- Advance one stage.
- `CustomStack getSeed()` -- Get the seed item.
- `List<ItemStack> getLoot()` / `List<ItemStack> getLoot(ItemStack tool)` -- Drop loot.
- `static List<ItemStack> getLoot(Block)` / `static List<ItemStack> getLoot(Block, ItemStack)` -- Static loot.

### dev.lone.itemsadder.api.CustomFire extends CustomStack

- `@Nullable static CustomFire getInstance(String namespacedID)` -- Get from registry.
- `@Nullable static CustomFire byItemStack(ItemStack)` -- Get from ItemStack.
- `@Nullable static CustomFire byAlreadyPlaced(Block)` -- Get from placed block.
- `@Nullable static CustomFire place(String namespacedId, Location)` -- Place fire.
- `CustomFire place(Location)` -- Place this instance.
- `boolean isPlaced()` -- Check if placed.
- `boolean remove()` / `static boolean remove(Location)` -- Remove fire.
- `int getAge()` / `void setAge(int)` / `static int getAge(Block)` / `static void setAge(Block, int)` -- Fire age.
- `Location getLocation()` -- Placed location.

### dev.lone.itemsadder.api.ItemsAdder (static utility)

Most methods are deprecated in favor of `CustomStack`/`CustomBlock`/`CustomCrop`. These remain useful:

- `static boolean areItemsLoaded()` -- Check if ItemsAdder finished loading.
- `static boolean isCustomItem(ItemStack)` / `static boolean isCustomItem(String)` -- Quick custom item check.
- `static boolean isCustomBlock(Block)` -- Quick custom block check.
- `static boolean isCustomCrop(Block)` -- Quick custom crop check.
- `static boolean isFurniture(Entity)` -- Quick furniture check.
- `static boolean matchCustomItemName(ItemStack, String)` -- Match item to namespaced ID.
- `static List<CustomStack> getAllItems()` -- All registered items.
- `static List<CustomStack> getAllItems(String namespace)` -- Items in namespace.
- `static List<CustomStack> getAllItems(Material material)` -- Items using material.
- `static String getCustomItemName(ItemStack)` -- Get namespaced ID from ItemStack.
- `static ItemStack getCustomItem(String namespacedId)` -- Get ItemStack by ID (prefer `CustomStack.getInstance`).
- `static void applyResourcepack(Player)` -- Force resource pack on player.
- `static @Nullable String getPackUrl(boolean appendHash)` -- Resource pack URL.
- `static void setLiquid(String namespacedId, Location)` -- Place custom liquid.
- `static @Nullable String getLiquidName(Location)` -- Get liquid at location.
- `static boolean playTotemAnimation(Player, String namespacedId)` -- Play totem animation.
- `static boolean hasKeepOnDeath(ItemStack)` / `static boolean hasKeepOnDeath(String)` -- Keep on death check.

### dev.lone.itemsadder.api.Events (event classes)

All events are in package `dev.lone.itemsadder.api.Events`.

| Event | Extends | Cancellable | Key Methods |
|---|---|---|---|
| `ItemsAdderLoadDataEvent` | `Event` | No | `getCause()` returns `Cause.FIRST_LOAD` or `Cause.RELOAD` |
| `CustomBlockBreakEvent` | `PlayerEvent` | Yes | `getBlock()`, `getNamespacedID()`, `getCustomBlockItem()` |
| `CustomBlockPlaceEvent` | `PlayerEvent` | Yes | `getBlock()`, `getNamespacedID()`, `getCustomBlockItem()`, `getItemInHand()`, `getPlacedAgainst()`, `getReplacedBlockState()` |
| `CustomBlockInteractEvent` | `PlayerEvent` | Yes | `getBlockClicked()`, `getNamespacedID()`, `getItem()`, `getCustomBlockItem()`, `getAction()`, `getBlockFace()`, `getHand()` |
| `CustomEntityDeathEvent` | `Event` | No | `getEntity()`, `getNamespacedID()`, `getKiller()` |
| `FurnitureBreakEvent` | `FurnitureEvent` | Yes | `getFurniture()`, `getNamespacedID()`, `getBukkitEntity()` |
| `FurnitureInteractEvent` | `FurnitureEvent` | Yes | `getFurniture()`, `getNamespacedID()`, `getBukkitEntity()` |
| `FurniturePrePlaceEvent` | `PlayerEvent` | Yes | `getNamespacedID()`, `getLocation()` |
| `FurniturePlacedEvent` | `FurnitureEvent` | Yes | `getFurniture()`, `getNamespacedID()`, `getBukkitEntity()` |
| `ResourcePackSendEvent` | `PlayerEvent` | No | `getUrl()`, `getHash()`, `isItemsAdderPack()` |
| `ItemsAdderPackCompressedEvent` | `Event` | No | *(no extra methods)* |
| `PlayerEmotePlayEvent` | `PlayerEvent` | Yes | `getEmoteName()` |
| `PlayerEmoteEndEvent` | `PlayerEvent` | No | `getEmoteName()`, `getCause()` returns `Cause.STOP` or `Cause.FINISHED` |

### dev.lone.itemsadder.api.FontImages

| Class | Key Methods |
|---|---|
| `FontImageWrapper` | `instance(String)`, `getString()`, `exists()`, `getWidth()`, `getHeight()`, `getOffset()`, `setOffset(int)`, `getColor()`, `setColor(TextColor)`, `setColor(ChatColor)`, `applyPixelsOffset(int)`, `static replaceFontImages(String)`, `static replaceFontImages(Component)`, `static replaceFontImages(Permissible, String)`, `static getNamespacedIdsInRegistry()` |
| `PlayerHudsHolderWrapper` | `new PlayerHudsHolderWrapper(Player)`, `sendUpdate()`, `getPlayer()`, `recalculateOffsets()`, `exists()` |
| `PlayerHudWrapper` | `new PlayerHudWrapper(PlayerHudsHolderWrapper, String)`, `setVisible(boolean)`, `isVisible()`, `setOffsetX(int)`, `getOffsetX()`, `getInitialOffsetX()`, `getNamespacedID()`, `exists()` |
| `PlayerQuantityHudWrapper` extends `PlayerHudWrapper` | `new PlayerQuantityHudWrapper(PlayerHudsHolderWrapper, String)`, `setFloatValue(float)`, `getFloatValue()` |
| `PlayerCustomHudWrapper` extends `PlayerQuantityHudWrapper` | `new PlayerCustomHudWrapper(PlayerHudsHolderWrapper, String)`, `addFontImage(FontImageWrapper)`, `addFontImageToIndex(FontImageWrapper, int)`, `removeFontImageByIndex(int)`, `setFontImages(List)`, `clearFontImagesAndRefresh()`, `getFontImagesCount()` |
| `TexturedInventoryWrapper` | `new TexturedInventoryWrapper(InventoryHolder, int size, String title, FontImageWrapper, int offsetX, int offsetY)`, `new TexturedInventoryWrapper(InventoryHolder, InventoryType, String title, FontImageWrapper, int offsetX, int offsetY)`, `showInventory(Player)`, `getInternal()`, `static setPlayerInventoryTexture(Player, FontImageWrapper)`, `static setPlayerInventoryTexture(Player, FontImageWrapper, String)`, `static setPlayerInventoryTexture(Player, FontImageWrapper, int)` |
