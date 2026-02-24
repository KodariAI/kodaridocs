# Slimefun4 API Documentation

Slimefun4 is a Spigot/Paper plugin that adds 500+ items, machines, and resources to Minecraft without mods. Addon developers extend it by implementing the `SlimefunAddon` interface and registering custom `SlimefunItem` instances.

---

## 1. Creating a Slimefun Addon (Main Class)

Your plugin class must extend `JavaPlugin` and implement `SlimefunAddon`.

```java
package com.example.myaddon;

import org.bukkit.plugin.java.JavaPlugin;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

public class MyAddon extends JavaPlugin implements SlimefunAddon {

    private static MyAddon instance;

    @Override
    public void onEnable() {
        instance = this;
        // Register items here (see examples below)
    }

    @Override
    public void onDisable() {
        // Cleanup if needed
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/YourName/MyAddon/issues";
    }

    public static MyAddon getInstance() {
        return instance;
    }
}
```

---

## 2. Creating and Registering a Basic SlimefunItem

Every item needs: an `ItemGroup` (category), a `SlimefunItemStack` (appearance + ID), a `RecipeType`, and a recipe array.

```java
package com.example.myaddon;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class ItemSetup {

    public static void registerItems(MyAddon addon) {
        // 1. Create an ItemGroup (category in the Slimefun guide)
        NamespacedKey groupKey = new NamespacedKey(addon, "my_addon_group");
        CustomItemStack groupItem = new CustomItemStack(Material.DIAMOND, "&bMy Addon Items");
        ItemGroup itemGroup = new ItemGroup(groupKey, groupItem);

        // 2. Create the SlimefunItemStack (defines ID, material, name, lore)
        SlimefunItemStack myItemStack = new SlimefunItemStack(
            "MY_CUSTOM_SWORD",        // Unique ID (uppercase, underscores)
            Material.DIAMOND_SWORD,
            "&6Inferno Blade",
            "",
            "&7A sword forged in flames",
            "&7Deals extra fire damage"
        );

        // 3. Define the 3x3 recipe (null = empty slot)
        ItemStack[] recipe = {
            null,                          new ItemStack(Material.BLAZE_ROD),  null,
            null,                          new ItemStack(Material.BLAZE_ROD),  null,
            new ItemStack(Material.STICK), null,                               null
        };

        // 4. Create and register the item
        SlimefunItem myItem = new SlimefunItem(
            itemGroup,
            myItemStack,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            recipe
        );
        myItem.register(addon);
    }
}
```

---

## 3. Custom SlimefunItem Subclass with Right-Click Handlers

Override `preRegister()` to attach `ItemUseHandler` (right-click while holding) and `BlockUseHandler` (right-click placed block).

```java
package com.example.myaddon.items;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;

public class HealingOrb extends SlimefunItem {

    public HealingOrb(ItemGroup group, SlimefunItemStack item,
                      RecipeType recipeType, ItemStack[] recipe) {
        super(group, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        // Triggered when player right-clicks while holding this item
        ItemUseHandler itemUseHandler = e -> {
            e.cancel(); // Prevent placing/default interaction
            e.getPlayer().setHealth(Math.min(
                e.getPlayer().getHealth() + 4.0,
                e.getPlayer().getMaxHealth()
            ));
            e.getPlayer().sendMessage("&aYou feel restored!");
        };
        addItemHandler(itemUseHandler);

        // Triggered when player right-clicks a placed block of this type
        BlockUseHandler blockUseHandler = e -> {
            e.cancel();
            e.getPlayer().sendMessage("&eThis orb pulses with energy.");
        };
        addItemHandler(blockUseHandler);
    }
}
```

---

## 4. Implementing Attributes (Radioactive, WitherProof)

Implement attribute interfaces directly on your SlimefunItem subclass.

```java
package com.example.myaddon.items;

import org.bukkit.block.Block;
import org.bukkit.entity.Wither;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.core.attributes.WitherProof;

public class ToxicBlock extends SlimefunItem implements Radioactive, WitherProof {

    public ToxicBlock(ItemGroup group, SlimefunItemStack item,
                      RecipeType recipeType, ItemStack[] recipe) {
        super(group, item, recipeType, recipe);
    }

    @Override
    public Radioactivity getRadioactivity() {
        return Radioactivity.HIGH;
    }

    @Override
    public void onAttack(Block block, Wither wither) {
        // Called when a Wither tries to destroy this block
        wither.damage(10.0);
    }
}
```

Use `LoreBuilder` to display attribute info in item lore:

```java
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;

SlimefunItemStack toxicStack = new SlimefunItemStack(
    "TOXIC_BLOCK",
    Material.GREEN_CONCRETE,
    "&2Toxic Block",
    "",
    LoreBuilder.radioactive(Radioactivity.HIGH),
    LoreBuilder.HAZMAT_SUIT_REQUIRED
);
```

---

## 5. Ticking Machine with BlockTicker

A `BlockTicker` makes a placed block execute code every Slimefun tick (~0.5s). Override `preRegister()` or `getBlockTicker()`.

```java
package com.example.myaddon.items;

import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;

public class AutoHealer extends SlimefunItem {

    public AutoHealer(ItemGroup group, SlimefunItemStack item,
                      RecipeType recipeType, ItemStack[] recipe) {
        super(group, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        addItemHandler(new BlockTicker() {
            @Override
            public boolean isSynchronized() {
                // true = runs on main server thread (required for world/entity interaction)
                // false = runs async (use for calculations only, no Bukkit API calls)
                return true;
            }

            @Override
            public void tick(Block b, SlimefunItem item, Config data) {
                // Called every Slimefun tick for each placed instance of this block
                b.getWorld().getNearbyEntities(b.getLocation(), 5, 5, 5).forEach(entity -> {
                    if (entity instanceof org.bukkit.entity.Player player) {
                        if (player.getHealth() < player.getMaxHealth()) {
                            player.setHealth(Math.min(
                                player.getHealth() + 1.0,
                                player.getMaxHealth()
                            ));
                        }
                    }
                });
            }
        });
    }
}
```

---

## 6. Machine with BlockMenuPreset (GUI Inventory)

Machines with inventories use `BlockMenuPreset` for their GUI layout.

```java
package com.example.myaddon.items;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;

public class SimpleMachine extends SlimefunItem {

    private static final int[] BACKGROUND_SLOTS = {0, 1, 2, 3, 5, 6, 7, 8};
    private static final int INPUT_SLOT = 4;
    private static final int OUTPUT_SLOT = 13;

    public SimpleMachine(ItemGroup group, SlimefunItemStack item,
                         RecipeType recipeType, ItemStack[] recipe) {
        super(group, item, recipeType, recipe);

        // Define the inventory layout
        new BlockMenuPreset(getId(), "&6Simple Machine") {
            @Override
            public void init() {
                drawBackground(new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "),
                    BACKGROUND_SLOTS);
            }

            @Override
            public boolean canOpen(Block b, Player p) {
                // Permission check; return true to allow opening
                return p.hasPermission("myaddon.machine.use");
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
                if (flow == ItemTransportFlow.INSERT) {
                    return new int[]{INPUT_SLOT};
                } else {
                    return new int[]{OUTPUT_SLOT};
                }
            }

            @Override
            public void newInstance(BlockMenu menu, Block b) {
                // Called when a new block of this machine is placed
            }
        };
    }

    @Override
    public void preRegister() {
        addItemHandler(new BlockTicker() {
            @Override
            public boolean isSynchronized() {
                return false;
            }

            @Override
            public void tick(Block b, SlimefunItem item, Config data) {
                BlockMenu menu = BlockStorage.getInventory(b);
                if (menu == null) return;

                ItemStack input = menu.getItemInSlot(INPUT_SLOT);
                if (input == null || input.getType() == Material.AIR) return;

                // Example: convert cobblestone to stone
                if (input.getType() == Material.COBBLESTONE) {
                    menu.consumeItem(INPUT_SLOT);
                    menu.pushItem(new ItemStack(Material.STONE), OUTPUT_SLOT);
                }
            }
        });
    }
}
```

Note: `BlockStorage` is imported from `me.mrCookieSlime.Slimefun.api.BlockStorage`.

---

## 7. Energy-Powered Machine (EnergyNetComponent)

Implement `EnergyNetComponent` to connect a machine to the Slimefun energy network.

```java
package com.example.myaddon.items;

import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;

public class ElectricGrinder extends SlimefunItem implements EnergyNetComponent {

    private static final int ENERGY_CONSUMPTION = 16; // Joules per tick

    public ElectricGrinder(ItemGroup group, SlimefunItemStack item,
                           RecipeType recipeType, ItemStack[] recipe) {
        super(group, item, recipeType, recipe);
    }

    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    @Override
    public int getCapacity() {
        return 128; // Max stored energy (Joules)
    }

    @Override
    public void preRegister() {
        addItemHandler(new BlockTicker() {
            @Override
            public boolean isSynchronized() {
                return false;
            }

            @Override
            public void tick(Block b, SlimefunItem item, Config data) {
                int charge = getCharge(b.getLocation());
                if (charge >= ENERGY_CONSUMPTION) {
                    removeCharge(b.getLocation(), ENERGY_CONSUMPTION);
                    // Perform machine work here
                }
            }
        });
    }
}
```

`EnergyNetComponentType` values: `GENERATOR`, `CONSUMER`, `CAPACITOR`, `CONNECTOR`.

---

## 8. Researches

Lock items behind a research that costs XP levels to unlock.

```java
package com.example.myaddon;

import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;

public class ResearchSetup {

    public static void register(MyAddon addon, SlimefunItem myItem) {
        NamespacedKey key = new NamespacedKey(addon, "inferno_research");
        // Parameters: key, unique integer ID, display name, XP level cost
        Research research = new Research(key, 6001, "Inferno Mastery", 15);
        research.addItems(myItem);
        research.register();
    }
}
```

The integer ID must be globally unique across all addons. Pick a high number range to avoid collisions.

---

## 9. Custom Head Textures

Use a Base64-encoded skin texture string instead of a Material.

```java
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

// Pass the Base64 texture as the second parameter
SlimefunItemStack headItem = new SlimefunItemStack(
    "CUSTOM_ORB",
    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3...",
    "&dMagic Orb",
    "",
    "&7A mysterious glowing orb"
);
```

Get Base64 texture values from minecraft-heads.com (copy the "Value" field).

---

## 10. GEO Resources

Custom mineable resources that generate per-chunk based on biome/environment.

```java
package com.example.myaddon.geo;

import org.bukkit.NamespacedKey;
import org.bukkit.World.Environment;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;

public class MythrilOre implements GEOResource {

    private final NamespacedKey key;
    private final ItemStack item;

    public MythrilOre(Plugin plugin, ItemStack item) {
        this.key = new NamespacedKey(plugin, "mythril_ore");
        this.item = item;
    }

    @Override
    public NamespacedKey getKey() {
        return key;
    }

    @Override
    public String getName() {
        return "Mythril Ore";
    }

    @Override
    public ItemStack getItem() {
        return item.clone();
    }

    @Override
    public boolean isObtainableFromGEOMiner() {
        return true;
    }

    @Override
    public int getDefaultSupply(Environment environment, Biome biome) {
        if (environment == Environment.NORMAL) {
            return biome == Biome.MOUNTAINS ? 12 : 4;
        }
        return 0;
    }

    @Override
    public int getMaxDeviation() {
        return 4;
    }
}
```

Register it alongside its SlimefunItem:

```java
SlimefunItemStack mythrilStack = new SlimefunItemStack("MYTHRIL_ORE", Material.IRON_ORE,
    "&9Mythril Ore", "", "&7A rare ore found in mountains");
SlimefunItem mythrilItem = new SlimefunItem(itemGroup, mythrilStack,
    RecipeType.GEO_MINER, new ItemStack[9]);
mythrilItem.register(addon);

MythrilOre mythrilResource = new MythrilOre(addon, mythrilStack);
mythrilResource.register();
```

---

## 11. Checking Slimefun Items and Blocks

```java
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

// Check if an ItemStack is a Slimefun item
SlimefunItem sfItem = SlimefunItem.getByItem(someItemStack);
if (sfItem != null) {
    String id = sfItem.getId(); // e.g. "MY_CUSTOM_SWORD"
}

// Look up a Slimefun item by its string ID
SlimefunItem found = SlimefunItem.getById("MY_CUSTOM_SWORD");

// Optional variants (return Optional<SlimefunItem>)
SlimefunItem.getOptionalById("MY_CUSTOM_SWORD").ifPresent(item -> { /* ... */ });
SlimefunItem.getOptionalByItem(someItemStack).ifPresent(item -> { /* ... */ });

// Check if a placed block is a Slimefun block
Block block = player.getTargetBlockExact(5);
SlimefunItem blockItem = BlockStorage.check(block);
if (blockItem != null) {
    String blockId = blockItem.getId();
}

// Check if a block is a specific Slimefun item
boolean isMyMachine = BlockStorage.check(block, "MY_MACHINE_ID");

// Get/set custom data on a Slimefun block
String value = BlockStorage.getLocationInfo(block.getLocation(), "myKey");
BlockStorage.addBlockInfo(block, "myKey", "myValue");
```

---

## 12. Listening to Slimefun Events

```java
package com.example.myaddon.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import io.github.thebusybiscuit.slimefun4.api.events.SlimefunBlockBreakEvent;
import io.github.thebusybiscuit.slimefun4.api.events.SlimefunBlockPlaceEvent;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.events.SlimefunItemSpawnEvent;

public class SlimefunListener implements Listener {

    @EventHandler
    public void onSlimefunBlockBreak(SlimefunBlockBreakEvent event) {
        String itemId = event.getSlimefunItem().getId();
        event.getPlayer().sendMessage("You broke: " + itemId);
        // event.setCancelled(true); // to prevent breaking
    }

    @EventHandler
    public void onSlimefunBlockPlace(SlimefunBlockPlaceEvent event) {
        String itemId = event.getSlimefunItem().getId();
        // event.setCancelled(true); // to prevent placing
    }

    @EventHandler
    public void onSlimefunItemSpawn(SlimefunItemSpawnEvent event) {
        // Fired when a Slimefun item entity spawns in the world
        event.getItemSpawnReason(); // CARGO_OVERFLOW, GOLD_PAN_USE, etc.
    }
}
```

Register listeners in `onEnable()`:

```java
getServer().getPluginManager().registerEvents(new SlimefunListener(), this);
```

---

## API Reference (Trimmed)

### Core Items

| Class | Package |
|---|---|
| `SlimefunItem` | `io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem` |
| `SlimefunItemStack` | `io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack` |
| `ItemGroup` | `io.github.thebusybiscuit.slimefun4.api.items.ItemGroup` |
| `RecipeType` | `io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType` |
| `ItemSetting<T>` | `io.github.thebusybiscuit.slimefun4.api.items.ItemSetting` |
| `SlimefunAddon` (interface) | `io.github.thebusybiscuit.slimefun4.api.SlimefunAddon` |

### SlimefunItem Key Methods

- `void register(SlimefunAddon addon)` -- register with Slimefun
- `void preRegister()` -- override to add handlers before registration
- `void postRegister()` -- override for logic after registration
- `void addItemHandler(ItemHandler... handlers)` -- attach event handlers
- `static SlimefunItem getByItem(ItemStack item)` -- resolve ItemStack to SlimefunItem (or null)
- `static SlimefunItem getById(String id)` -- lookup by string ID (or null)
- `static Optional<SlimefunItem> getOptionalById(String id)`
- `static Optional<SlimefunItem> getOptionalByItem(ItemStack item)`
- `boolean isItem(ItemStack item)` -- check if ItemStack matches this item
- `String getId()` -- get the unique item ID string
- `ItemStack getItem()` -- get the ItemStack template
- `ItemGroup getItemGroup()`
- `RecipeType getRecipeType()`
- `ItemStack[] getRecipe()`
- `void setResearch(Research research)`
- `boolean canUse(Player p, boolean sendMessage)`
- `BlockTicker getBlockTicker()`
- `boolean isTicking()`
- `void addItemSetting(ItemSetting<?>... settings)`

### SlimefunItemStack Constructors

- `SlimefunItemStack(String id, Material type, String name, String... lore)`
- `SlimefunItemStack(String id, Material type, String name, Consumer<ItemMeta> consumer)`
- `SlimefunItemStack(String id, String base64Texture, String name, String... lore)` -- custom head
- `SlimefunItemStack(String id, ItemStack item, String name, String... lore)`
- `SlimefunItemStack(String id, Material type, Color color, String name, String... lore)` -- leather armor

### ItemGroup

- `ItemGroup(NamespacedKey key, ItemStack item)`
- `ItemGroup(NamespacedKey key, ItemStack item, int tier)` -- tier controls ordering
- `void register(SlimefunAddon addon)` -- auto-registered when items are added
- `void add(SlimefunItem item)` / `void remove(SlimefunItem item)`
- `List<SlimefunItem> getItems()`

### ItemGroup Variants

| Class | Package | Purpose |
|---|---|---|
| `NestedItemGroup` | `io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup` | Parent group containing sub-groups |
| `SubItemGroup` | `io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup` | Child of a NestedItemGroup |
| `LockedItemGroup` | `io.github.thebusybiscuit.slimefun4.api.items.groups.LockedItemGroup` | Requires parent groups unlocked |
| `SeasonalItemGroup` | `io.github.thebusybiscuit.slimefun4.api.items.groups.SeasonalItemGroup` | Visible only in a specific month |
| `FlexItemGroup` | `io.github.thebusybiscuit.slimefun4.api.items.groups.FlexItemGroup` | Fully custom GUI (abstract) |

### RecipeType Built-in Constants

- `RecipeType.ENHANCED_CRAFTING_TABLE`
- `RecipeType.MAGIC_WORKBENCH`
- `RecipeType.ARMOR_FORGE`
- `RecipeType.SMELTERY`
- `RecipeType.COMPRESSOR`
- `RecipeType.PRESSURE_CHAMBER`
- `RecipeType.GRIND_STONE`
- `RecipeType.ORE_CRUSHER`
- `RecipeType.ORE_WASHER`
- `RecipeType.JUICER`
- `RecipeType.ANCIENT_ALTAR`
- `RecipeType.GEO_MINER`
- `RecipeType.NULL` -- no recipe (unobtainable / obtained by other means)

### Research

| Method | Description |
|---|---|
| `Research(NamespacedKey key, int id, String name, int levelCost)` | Constructor |
| `void addItems(SlimefunItem... items)` | Attach items to this research |
| `void register()` | Register with Slimefun |
| `boolean canUnlock(Player p)` | Check if player has enough XP |
| `void unlock(Player p, boolean instant)` | Unlock for a player |

### BlockTicker (Abstract)

Package: `me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker`

| Method | Description |
|---|---|
| `abstract void tick(Block b, SlimefunItem item, Config data)` | Called every Slimefun tick per block |
| `abstract boolean isSynchronized()` | true = main thread, false = async |
| `void uniqueTick()` | Called once per tick (not per block) |

### BlockStorage (Static Utilities)

Package: `me.mrCookieSlime.Slimefun.api.BlockStorage`

| Method | Description |
|---|---|
| `static SlimefunItem check(Block b)` | Get SlimefunItem at block, or null |
| `static SlimefunItem check(Location l)` | Get SlimefunItem at location, or null |
| `static boolean check(Block b, String sfId)` | Check if block is a specific SF item |
| `static String checkID(Block b)` | Get SF item ID string at block, or null |
| `static String getLocationInfo(Location l, String key)` | Read custom block data |
| `static void addBlockInfo(Block b, String key, String value)` | Write custom block data |
| `static void clearBlockInfo(Block b)` | Remove all SF data from block |
| `static void store(Block b, String itemId)` | Mark block as a Slimefun block |
| `static BlockMenu getInventory(Block b)` | Get the machine's inventory GUI |

### BlockMenuPreset

Package: `me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset`

| Method | Description |
|---|---|
| `BlockMenuPreset(String sfItemId, String title)` | Constructor (pass `getId()`) |
| `abstract void init()` | Set up background slots, decorations |
| `abstract boolean canOpen(Block b, Player p)` | Permission check |
| `abstract int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow)` | Cargo integration slots |
| `void drawBackground(ItemStack item, int[] slots)` | Fill background slots |
| `void newInstance(BlockMenu menu, Block b)` | Called when block is placed |

### BlockMenu Key Methods

Package: `me.mrCookieSlime.Slimefun.api.inventory.BlockMenu`

- `ItemStack getItemInSlot(int slot)`
- `void replaceExistingItem(int slot, ItemStack item)`
- `void consumeItem(int slot)` / `void consumeItem(int slot, int amount)`
- `ItemStack pushItem(ItemStack item, int... slots)` -- returns leftover or null
- `void addMenuClickHandler(int slot, ChestMenu.MenuClickHandler handler)`
- `void open(Player p)`
- `Block getBlock()`
- `Location getLocation()`

### Attributes (Interfaces on SlimefunItem)

| Interface | Package | Key Method |
|---|---|---|
| `EnergyNetComponent` | `io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent` | `EnergyNetComponentType getEnergyComponentType()`, `int getCapacity()` |
| `Radioactive` | `io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive` | `Radioactivity getRadioactivity()` |
| `WitherProof` | `io.github.thebusybiscuit.slimefun4.core.attributes.WitherProof` | `void onAttack(Block, Wither)` |
| `Placeable` | `io.github.thebusybiscuit.slimefun4.core.attributes.Placeable` | Already on SlimefunItem |

### EnergyNetComponent Methods

- `EnergyNetComponentType getEnergyComponentType()` -- GENERATOR, CONSUMER, CAPACITOR, CONNECTOR
- `int getCapacity()` -- max stored Joules
- `int getCharge(Location l)` -- current stored Joules
- `void setCharge(Location l, int charge)`
- `void addCharge(Location l, int charge)`
- `void removeCharge(Location l, int charge)`
- `boolean isChargeable()` -- default: capacity > 0

### EnergyNetComponentType Enum

Package: `io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType`

- `GENERATOR` -- produces energy
- `CONSUMER` -- consumes energy
- `CAPACITOR` -- stores and distributes energy
- `CONNECTOR` -- passes energy through the network

### Radioactivity Enum

Package: `io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity`

- `LOW`, `MODERATE`, `HIGH`, `VERY_HIGH`, `VERY_DEADLY`

### GEOResource Interface

Package: `io.github.thebusybiscuit.slimefun4.api.geo.GEOResource`

- `NamespacedKey getKey()`
- `String getName()`
- `ItemStack getItem()`
- `boolean isObtainableFromGEOMiner()`
- `int getDefaultSupply(Environment, Biome)`
- `int getMaxDeviation()`
- `void register()`

### Events (Bukkit-style, all Cancellable unless noted)

| Event | Package | Key Methods |
|---|---|---|
| `SlimefunBlockBreakEvent` | `...api.events` | `getPlayer()`, `getSlimefunItem()`, `getBlockBroken()`, `getHeldItem()` |
| `SlimefunBlockPlaceEvent` | `...api.events` | `getPlayer()`, `getSlimefunItem()`, `getBlockPlaced()`, `getItemStack()` |
| `PlayerRightClickEvent` | `...api.events` | `getPlayer()`, `getSlimefunItem()`, `getSlimefunBlock()`, `getClickedBlock()`, `cancel()` |
| `SlimefunItemSpawnEvent` | `...api.events` | `getLocation()`, `getItemStack()`, `getItemSpawnReason()` |
| `ResearchUnlockEvent` | `...api.events` | `getPlayer()`, `getResearch()` |
| `PlayerPreResearchEvent` | `...api.events` | `getPlayer()`, `getResearch()`, `getSlimefunItem()` |
| `SlimefunGuideOpenEvent` | `...api.events` | `getPlayer()`, `getGuideLayout()` |
| `SlimefunItemRegistryFinalizedEvent` | `...api.events` | (not cancellable) fired when all items are loaded |

### Item Handlers (Functional Interfaces)

| Handler | Package | When Triggered |
|---|---|---|
| `ItemUseHandler` | `io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler` | Player right-clicks while holding item |
| `BlockUseHandler` | `io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler` | Player right-clicks a placed SF block |
| `BlockTicker` | `me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker` | Every Slimefun tick for placed blocks |
| `ItemHandler` (base) | `io.github.thebusybiscuit.slimefun4.api.items.ItemHandler` | Base interface for all handlers |

### Utility Classes

| Class | Package | Purpose |
|---|---|---|
| `CustomItemStack` | `io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack` | Quick ItemStack with name/lore |
| `LoreBuilder` | `io.github.thebusybiscuit.slimefun4.utils.LoreBuilder` | Standard lore lines (power, radioactive, etc.) |
| `SlimefunUtils` | `io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils` | Item comparison and utility methods |
| `Config` | `io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config` | Simple YAML config wrapper |
| `ItemTransportFlow` | `me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow` | Enum: `INSERT`, `WITHDRAW` |
| `MinecraftVersion` | `io.github.thebusybiscuit.slimefun4.api.MinecraftVersion` | Version checking enum |
