# AdvancedChests API Reference

Multi-page chest plugin with sorting, selling, smelting, compression, auto-sells, and hologram titles. The API lets plugins query chests at locations, add/remove items, open chest pages, create chests programmatically, register custom sell services, and listen for chest events. Add `AdvancedChests` to `depend` or `softdepend` in plugin.yml.

## Code Examples

### Getting the API and Managers

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.ChestsManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.DataManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.InventoryManager;

// All static access — no singleton to retrieve
ChestsManager chestManager = AdvancedChestsAPI.getChestManager();
DataManager dataManager = AdvancedChestsAPI.getDataManager();
InventoryManager inventoryManager = AdvancedChestsAPI.getInventoryManager();
```

### Get a Chest at a Location

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.ChestsManager;
import org.bukkit.Location;

ChestsManager manager = AdvancedChestsAPI.getChestManager();
AdvancedChest chest = manager.getAdvancedChest(location);

if (chest != null) {
    String type = chest.getType();              // config type name
    int size = chest.getSize();                  // total slot capacity
    int used = chest.getSlotsUsed();             // occupied slots
    int free = chest.getSlotsLeft();             // empty slots
    Location loc = chest.getLocation();          // world location
    java.util.UUID uuid = chest.getUniqueId();   // unique ID
    double money = chest.getMoney();             // auto-sell balance
}
```

### Add and Remove Items

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import org.bukkit.inventory.ItemStack;

AdvancedChest chest = AdvancedChestsAPI.getChestManager().getAdvancedChest(location);
if (chest != null) {
    // Check if there's space first
    boolean hasSpace = AdvancedChestsAPI.hasSpaceForItem(chest, itemStack);

    // Add an item (returns true if added)
    boolean added = AdvancedChestsAPI.addItemToChest(chest, itemStack);

    // Get the last item WITHOUT removing it
    AdvancedChestsAPI api = new AdvancedChestsAPI();
    ItemStack lastItem = api.getLastItemFromChest(chest);

    // Get AND remove the last item
    ItemStack dispensed = AdvancedChestsAPI.dispenseLastItemFromChest(chest);

    // Get all items across all pages
    java.util.List<ItemStack> allItems = chest.getAllItems();
}
```

### Open a Chest Page for a Player

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.gui.page.ChestPage;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import org.bukkit.entity.Player;

AdvancedChest chest = AdvancedChestsAPI.getChestManager().getAdvancedChest(location);
if (chest != null) {
    // Open specific page (0-based)
    chest.openPage(player, 0);

    // Get all pages
    java.util.Set<ChestPage> pages = chest.getPages();

    // Get ordered pages
    ChestPage[] ordered = chest.getOrderedPages();

    // Get page by ID
    ChestPage page = chest.getPageById(0);
    if (page != null) {
        page.open(player);
        ItemStack[] items = page.getItems(); // content items only (no action bar)
        int[] inputSlots = page.getInputSlots();
    }

    // Check which page a player is viewing
    ChestPage playerPage = chest.getPlayerPage(player);
}
```

### Chest Actions (Sort, Sell, Smelt, Compress)

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SortStatus;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SortType;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import org.bukkit.entity.Player;

AdvancedChest chest = AdvancedChestsAPI.getChestManager().getAdvancedChest(location);
if (chest != null) {
    // Sort
    SortStatus status = chest.sort(SortType.BYID);
    // status: EXECUTED, ANYTHING_TO_SORT, ALREADY_SORTED

    // Sell all contents for a player
    chest.sell(player); // player can be null

    // Smelt all smeltable items
    boolean smelted = chest.smelt();

    // Compress items
    chest.compress(player); // player can be null

    // Check ongoing operations
    boolean selling = chest.isBeingSold();
    boolean compressing = chest.isBeingCompressed();
}
```

### Upgrade and Expand a Chest

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;

AdvancedChest chest = AdvancedChestsAPI.getChestManager().getAdvancedChest(location);
if (chest != null) {
    // Expand by adding slots
    chest.expandSlots(9); // add 9 slots (1 row)

    // Upgrade to a different chest type
    chest.upgrade("diamond_chest"); // type name from config

    // Save changes
    chest.save();
}
```

### Create a Chest Programmatically

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.ChestBuilder;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.LocationUtils;
import org.bukkit.Location;

// Serialize the location
String serializedLoc = LocationUtils.serializeLoc(location);

// Build the chest
AdvancedChest chest = new ChestBuilder(54, "iron_chest", serializedLoc)
        .setAutomaticSellsStatus(true)
        .setMoney(0.0)
        .build();

// Register it with the manager
AdvancedChestsAPI.getChestManager().register(chest);

// Load its entity (makes it visible)
chest.loadEntity();
```

### Get Chest Type Item and Identify Chest Items

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import org.bukkit.inventory.ItemStack;

// Get the placeable item for a chest type
ItemStack chestItem = AdvancedChestsAPI.getAdvancedChestItem("iron_chest");

// Check if an ItemStack is an advanced chest item
String chestType = AdvancedChestsAPI.getAdvancedChestsTypeByItem(itemStack);
if (chestType != null) {
    // It's an advanced chest of type: chestType
}
```

### Query Chest Type Configuration

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.DataManager;
import org.bukkit.inventory.ItemStack;

import java.util.List;

DataManager data = AdvancedChestsAPI.getDataManager();

// Check if a type exists
boolean exists = data.isAdvancedChest("iron_chest");

// List all types
List<String> allTypes = data.getAdvancedChestNames();

// Query type properties
int size = data.getChestSize("iron_chest");
String invName = data.getInventoryName("iron_chest");
ItemStack icon = data.getIcon("iron_chest");
double shopPrice = data.getChestShopPrice("iron_chest");

// Upgrade info
boolean canUpgrade = data.isUpgradable("iron_chest");
String nextUpgrade = data.getChestUpgrade("iron_chest");
double upgradePrice = data.getChestUpgradePrice("iron_chest");

// Feature availability
boolean canSort = data.areSortersAvailable("iron_chest");
boolean canSell = data.areSellsAvailable("iron_chest");
boolean canSmelt = data.isSmelterAvailable("iron_chest");
boolean canCompress = data.isCompressorAvailable("iron_chest");
boolean canAutoSell = data.areAutoSellsAvailable("iron_chest");
boolean hasHoppers = data.areHoppersUseAllowed("iron_chest");
boolean hasTitle = data.isTitleAvailable("iron_chest");

// Pricing
double sellMultiplier = data.getSellsMultiplier("iron_chest");
double sortPrice = data.getSortersPrice("iron_chest");
double smeltPrice = data.getSmelterPrice("iron_chest");
double compressPrice = data.getCompressorPrice("iron_chest");
double autoSellTax = data.getAutoSellsTax("iron_chest");
int autoSellFrequency = data.getAutoSellsFrequency("iron_chest"); // ticks
```

### Query Chests by World or Chunk

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.ChestsManager;
import us.lynuxcraft.deadsilenceiv.advancedchests.utils.ChunkLocation;
import org.bukkit.World;

import java.util.Set;

ChestsManager manager = AdvancedChestsAPI.getChestManager();

// All chests in a world
Set<AdvancedChest> worldChests = manager.getAdvancedChests(world);

// All loaded chests in a chunk
ChunkLocation chunkLoc = new ChunkLocation(location);
Set<AdvancedChest> chunkChests = manager.getAdvancedChests(chunkLoc);

// Total chest count
int total = manager.getTotalChests();
```

### Identify a Chest from a Bukkit Inventory

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.InventoryManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class ChestClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Inventory inv = event.getInventory();
        InventoryManager invManager = AdvancedChestsAPI.getInventoryManager();
        AdvancedChest chest = invManager.getAdvancedChest(inv);

        if (chest != null) {
            // This click is inside an advanced chest
            String type = chest.getType();
        }
    }
}
```

### Register a Custom Sell Service

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.ChestSeller;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SellService;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

ChestSeller seller = AdvancedChestsAPI.getChestSeller();

// Replace the default sell pricing with your own
seller.setService(new SellService() {
    @Override
    public Double getSellPrice(Player player, ItemStack stack) {
        // Return the price for a single item
        return myEconomy.getWorth(stack);
    }
});
```

### Listen for Chest Removal

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.events.ChestRemoveEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChestListener implements Listener {

    @EventHandler
    public void onChestRemove(ChestRemoveEvent event) {
        // Cancellable
        AdvancedChest chest = event.getChest();

        // Prevent removal
        event.setCancelled(true);
    }
}
```

### Manage Chest Titles (Holograms)

```java
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest;
import us.lynuxcraft.deadsilenceiv.advancedchests.chest.title.ChestTitle;
import us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI;

import java.util.Arrays;

AdvancedChest chest = AdvancedChestsAPI.getChestManager().getAdvancedChest(location);
if (chest != null) {
    ChestTitle title = chest.getChestTitle();
    if (title != null) {
        // Read current lines
        java.util.List<String> lines = title.getContent();

        // Update hologram text
        title.setContent(Arrays.asList("&6My Chest", "&7Items: " + chest.getSlotsUsed()));
        title.update();

        // Remove hologram
        title.delete();

        // Re-spawn hologram
        title.spawn();
    }
}
```

## API Reference (Trimmed)

### `us.lynuxcraft.deadsilenceiv.advancedchests.AdvancedChestsAPI`

| Return | Method | Description |
|---|---|---|
| `static ItemStack` | `dispenseLastItemFromChest(AdvancedChest)` | Get and remove last item |
| `static boolean` | `addItemToChest(AdvancedChest, ItemStack)` | Add item (true if added) |
| `static boolean` | `hasSpaceForItem(AdvancedChest, ItemStack)` | Check for space |
| `static ItemStack` | `getAdvancedChestItem(String type)` | Get placeable chest item |
| `static String` | `getAdvancedChestsTypeByItem(ItemStack)` | Identify chest type from item |
| `ItemStack` | `getLastItemFromChest(AdvancedChest)` | Get last item without removing (instance method) |
| `static ChestsManager` | `getChestManager()` | Chest manager |
| `static DataManager` | `getDataManager()` | Config data manager |
| `static InventoryManager` | `getInventoryManager()` | Inventory-to-chest mapper |
| `static ChestSeller` | `getChestSeller()` | Sell service access |

### `us.lynuxcraft.deadsilenceiv.advancedchests.chest.AdvancedChest`

| Return | Method | Description |
|---|---|---|
| `Location` | `getLocation()` | World location |
| `UUID` | `getUniqueId()` | Unique ID |
| `String` | `getType()` | Config type name |
| `Integer` | `getSize()` | Total slot capacity |
| `int` | `getSlotsUsed()` | Occupied slots |
| `int` | `getSlotsLeft()` | Empty slots |
| `double` | `getMoney()` | Auto-sell balance |
| `List<ItemStack>` | `getAllItems()` | All items across pages |
| `Set<ChestPage>` | `getPages()` | All pages |
| `ChestPage[]` | `getOrderedPages()` | Pages in order |
| `ChestPage` | `getPageById(int)` | Page by ID |
| `ChestPage` | `getPlayerPage(Player)` | Page player is viewing |
| `ChestTitle` | `getChestTitle()` | Hologram title |
| `void` | `openPage(Player, int)` | Open specific page |
| `void` | `expandSlots(int)` | Add slots |
| `void` | `upgrade(String)` | Upgrade to type |
| `SortStatus` | `sort(SortType)` | Sort contents |
| `void` | `sell(Player)` | Sell all contents |
| `boolean` | `smelt()` | Smelt items |
| `void` | `compress(Player)` | Compress items |
| `void` | `remove(BlockBreakEvent, boolean dropItems)` | Remove chest |
| `void` | `closeForViewers()` | Close for all viewers |
| `void` | `save()` | Persist to storage |
| `void` | `setContent(List<ItemStack>)` | Replace all contents |
| `void` | `loadEntity()` | Make visible |
| `void` | `unLoadEntity()` | Unload entity |

### `us.lynuxcraft.deadsilenceiv.advancedchests.chest.ChestBuilder`

| Return | Method | Description |
|---|---|---|
| *(constructor)* | `ChestBuilder(Integer size, String type, String location)` | Create builder |
| `ChestBuilder` | `setUUID(UUID)` | Set UUID |
| `ChestBuilder` | `setPages(Set<ChestPage>)` | Set pages |
| `ChestBuilder` | `setMoney(Double)` | Set auto-sell money |
| `ChestBuilder` | `setAutomaticSellsStatus(boolean)` | Enable/disable auto-sells |
| `AdvancedChest` | `build()` | Build the chest |

### `us.lynuxcraft.deadsilenceiv.advancedchests.managers.ChestsManager`

| Return | Method | Description |
|---|---|---|
| `AdvancedChest` | `getAdvancedChest(Location)` | Loaded chest at location |
| `Set<AdvancedChest>` | `getAdvancedChests(World)` | All chests in world |
| `Set<AdvancedChest>` | `getAdvancedChests(ChunkLocation)` | Loaded chests in chunk |
| `int` | `getTotalChests()` | Total chest count |
| `void` | `register(AdvancedChest)` | Register a chest |
| `void` | `unRegister(AdvancedChest)` | Unregister a chest |

### `us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.SellService` (interface)

| Return | Method | Description |
|---|---|---|
| `Double` | `getSellPrice(Player, ItemStack)` | Price for a single item |

### Enums

| Enum | Package | Values |
|---|---|---|
| `SortType` | `us.lynuxcraft.deadsilenceiv.advancedchests.services.chest` | `BYID` |
| `SortStatus` | `us.lynuxcraft.deadsilenceiv.advancedchests.services.chest` | `EXECUTED`, `ANYTHING_TO_SORT`, `ALREADY_SORTED` |

### Events

| Event | Package | Cancellable | Key Methods |
|---|---|---|---|
| `ChestRemoveEvent` | `us.lynuxcraft.deadsilenceiv.advancedchests.events` | Yes | `getChest()` |
