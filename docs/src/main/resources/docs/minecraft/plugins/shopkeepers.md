# Shopkeepers API

Bukkit plugin for creating custom villager shopkeepers (NPC merchants). Supports admin shops with unlimited stock and player shops backed by containers. Shopkeepers can appear as any living entity, sign, hanging sign, or Citizens NPC.

## Code Examples

### Getting the API

```java
import com.nisovin.shopkeepers.api.ShopkeepersAPI;
import com.nisovin.shopkeepers.api.ShopkeepersPlugin;
import com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperRegistry;

// Static access (preferred)
ShopkeeperRegistry registry = ShopkeepersAPI.getShopkeeperRegistry();

// Plugin instance access
ShopkeepersPlugin plugin = ShopkeepersAPI.getPlugin();

// Check if API is ready before using
if (ShopkeepersAPI.isEnabled()) {
    // Safe to use
}
```

### Creating an Admin Shopkeeper Programmatically

```java
import com.nisovin.shopkeepers.api.ShopkeepersAPI;
import com.nisovin.shopkeepers.api.shopkeeper.DefaultShopTypes;
import com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperRegistry;
import com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperCreateException;
import com.nisovin.shopkeepers.api.shopkeeper.Shopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.admin.AdminShopCreationData;
import com.nisovin.shopkeepers.api.shopkeeper.admin.AdminShopType;
import com.nisovin.shopkeepers.api.shopkeeper.admin.regular.RegularAdminShopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.offers.TradeOffer;
import com.nisovin.shopkeepers.api.shopobjects.DefaultShopObjectTypes;
import com.nisovin.shopkeepers.api.shopobjects.ShopObjectType;
import com.nisovin.shopkeepers.api.shopobjects.living.LivingShopObjectTypes;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

// Get default types
AdminShopType<?> adminType = ShopkeepersAPI.getDefaultShopTypes().getRegularAdminShopType();

// Choose shop object type - villager mob
LivingShopObjectTypes livingTypes = ShopkeepersAPI.getDefaultShopObjectTypes().getLivingShopObjectTypes();
ShopObjectType<?> villagerObject = livingTypes.get(EntityType.VILLAGER);

// Build creation data (creator can be null for server-created shops)
Location spawnLoc = new Location(world, 100, 65, 200);
AdminShopCreationData creationData = AdminShopCreationData.create(
    null,           // creator Player (null = server-created)
    adminType,      // AdminShopType
    villagerObject, // ShopObjectType
    spawnLoc,       // spawn location
    BlockFace.NORTH // targeted block face (can be null)
);

// Create via registry (throws ShopkeeperCreateException on failure)
ShopkeeperRegistry registry = ShopkeepersAPI.getShopkeeperRegistry();
try {
    Shopkeeper shopkeeper = registry.createShopkeeper(creationData);
    shopkeeper.setName("Weapon Smith");

    // Cast to RegularAdminShopkeeper to add trade offers
    if (shopkeeper instanceof RegularAdminShopkeeper adminShop) {
        // TradeOffer.create(resultItem, item1cost, item2cost)
        // item2 can be null for single-item trades
        TradeOffer offer = TradeOffer.create(
            new ItemStack(Material.DIAMOND_SWORD),  // result item
            new ItemStack(Material.EMERALD, 10),    // cost item 1
            null                                     // cost item 2 (optional)
        );
        adminShop.addOffer(offer);
    }

    shopkeeper.save();
} catch (ShopkeeperCreateException e) {
    e.printStackTrace();
}
```

### Creating a Player Shopkeeper

```java
import com.nisovin.shopkeepers.api.ShopkeepersAPI;
import com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperRegistry;
import com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperCreateException;
import com.nisovin.shopkeepers.api.shopkeeper.Shopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopCreationData;
import com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopType;
import com.nisovin.shopkeepers.api.shopobjects.DefaultShopObjectTypes;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

// Player selling shop - sells items from a container to customers
PlayerShopType<?> sellingType = ShopkeepersAPI.getDefaultShopTypes().getSellingPlayerShopType();
var villagerObj = ShopkeepersAPI.getDefaultShopObjectTypes().getLivingShopObjectTypes().get(EntityType.VILLAGER);

Location spawnLoc = player.getLocation();
Block containerBlock = player.getLocation().add(2, 0, 0).getBlock(); // chest block

// Player shops require: non-null creator, a container block in the same world
PlayerShopCreationData creationData = PlayerShopCreationData.create(
    player,         // creator (required, non-null)
    sellingType,    // PlayerShopType
    villagerObj,    // ShopObjectType
    spawnLoc,       // spawn location
    BlockFace.NORTH,// targeted block face
    containerBlock  // shop container (chest) - must be same world as spawnLoc
);

try {
    Shopkeeper shopkeeper = ShopkeepersAPI.getShopkeeperRegistry().createShopkeeper(creationData);
    shopkeeper.save();
} catch (ShopkeeperCreateException e) {
    e.printStackTrace();
}
```

### Player-style Creation (with limits/messages)

```java
import com.nisovin.shopkeepers.api.ShopkeepersAPI;
import com.nisovin.shopkeepers.api.shopkeeper.Shopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.admin.AdminShopCreationData;

// handleShopkeeperCreation respects player limits and sends feedback messages
// Returns null on failure instead of throwing
AdminShopCreationData data = AdminShopCreationData.create(
    player,
    ShopkeepersAPI.getDefaultShopTypes().getRegularAdminShopType(),
    ShopkeepersAPI.getDefaultShopObjectTypes().getLivingShopObjectTypes().get(EntityType.VILLAGER),
    player.getLocation(),
    null
);
Shopkeeper shopkeeper = ShopkeepersAPI.handleShopkeeperCreation(data); // nullable
if (shopkeeper != null) {
    // Success
}
```

### Finding Shopkeepers

```java
import com.nisovin.shopkeepers.api.ShopkeepersAPI;
import com.nisovin.shopkeepers.api.shopkeeper.Shopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperRegistry;
import com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopkeeper;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import java.util.Collection;
import java.util.UUID;

ShopkeeperRegistry registry = ShopkeepersAPI.getShopkeeperRegistry();

// By unique ID
Shopkeeper sk = registry.getShopkeeperByUniqueId(someUUID); // nullable

// By integer ID
Shopkeeper sk2 = registry.getShopkeeperById(42); // nullable

// By entity (right-clicked villager, etc.)
Shopkeeper sk3 = registry.getShopkeeperByEntity(entity); // nullable
boolean isShop = registry.isShopkeeper(entity);

// By block (sign shops)
Shopkeeper sk4 = registry.getShopkeeperByBlock(block); // nullable
boolean isBlockShop = registry.isShopkeeper(block);

// All shopkeepers at a specific location
Collection<? extends Shopkeeper> atLoc = registry.getShopkeepersAtLocation(location);

// All shopkeepers in a world
Collection<? extends Shopkeeper> inWorld = registry.getShopkeepersInWorld("world");

// All player shopkeepers owned by a player
Collection<? extends PlayerShopkeeper> owned = registry.getPlayerShopkeepersByOwner(playerUUID);

// Search by name (case-insensitive, ignores color codes)
registry.getShopkeepersByName("Weapon Smith").forEach(s -> {
    // process matching shopkeepers
});

// All shopkeepers
Collection<? extends Shopkeeper> all = registry.getAllShopkeepers();
```

### Listening to Trade Events

```java
import com.nisovin.shopkeepers.api.events.ShopkeeperTradeEvent;
import com.nisovin.shopkeepers.api.events.ShopkeeperTradeCompletedEvent;
import com.nisovin.shopkeepers.api.shopkeeper.Shopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.TradingRecipe;
import com.nisovin.shopkeepers.api.util.UnmodifiableItemStack;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ShopListener implements Listener {

    // Fires BEFORE trade is applied -- can cancel or modify items
    @EventHandler
    public void onTrade(ShopkeeperTradeEvent event) {
        Player player = event.getPlayer();
        Shopkeeper shopkeeper = event.getShopkeeper();
        TradingRecipe recipe = event.getTradingRecipe();

        UnmodifiableItemStack resultItem = event.getResultItem();
        UnmodifiableItemStack offeredItem1 = event.getOfferedItem1();
        UnmodifiableItemStack offeredItem2 = event.getOfferedItem2(); // nullable

        // Cancel the trade
        event.setCancelled(true);

        // Or modify what the shopkeeper receives
        event.setReceivedItem1(UnmodifiableItemStack.of(someItemStack));

        // Or modify the result the player gets
        event.setResultItem(UnmodifiableItemStack.of(modifiedResult));
    }

    // Fires AFTER trade is successfully completed
    @EventHandler
    public void onTradeCompleted(ShopkeeperTradeCompletedEvent event) {
        Shopkeeper shopkeeper = event.getShopkeeper();
        ShopkeeperTradeEvent completedTrade = event.getCompletedTrade();
        Player buyer = completedTrade.getPlayer();
        // Log or reward
    }
}
```

### Listening to Shopkeeper Lifecycle Events

```java
import com.nisovin.shopkeepers.api.events.PlayerCreateShopkeeperEvent;
import com.nisovin.shopkeepers.api.events.PlayerCreatePlayerShopkeeperEvent;
import com.nisovin.shopkeepers.api.events.PlayerDeleteShopkeeperEvent;
import com.nisovin.shopkeepers.api.events.ShopkeeperAddedEvent;
import com.nisovin.shopkeepers.api.events.ShopkeeperRemoveEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ShopLifecycleListener implements Listener {

    // Player is about to create a shopkeeper (cancellable)
    @EventHandler
    public void onCreate(PlayerCreateShopkeeperEvent event) {
        // event.getShopCreationData() - inspect creation data
        event.setCancelled(true); // block creation
    }

    // Player creating a player-owned shop (cancellable, can adjust shop limit)
    @EventHandler
    public void onCreatePlayerShop(PlayerCreatePlayerShopkeeperEvent event) {
        event.setMaxShopsLimit(50); // override max shops for this creation
    }

    // Player is about to delete a shopkeeper (cancellable)
    @EventHandler
    public void onDelete(PlayerDeleteShopkeeperEvent event) {
        event.getPlayer();
        event.getShopkeeper();
        event.setCancelled(true);
    }

    // Shopkeeper was added to the registry (not cancellable)
    @EventHandler
    public void onAdded(ShopkeeperAddedEvent event) {
        ShopkeeperAddedEvent.Cause cause = event.getCause(); // CREATED, LOADED
    }

    // Shopkeeper is about to be removed from the registry (not cancellable)
    @EventHandler
    public void onRemove(ShopkeeperRemoveEvent event) {
        ShopkeeperRemoveEvent.Cause cause = event.getCause(); // DELETE, UNLOAD, etc.
    }
}
```

### Shop Object Types

```java
import com.nisovin.shopkeepers.api.ShopkeepersAPI;
import com.nisovin.shopkeepers.api.shopobjects.DefaultShopObjectTypes;
import com.nisovin.shopkeepers.api.shopobjects.ShopObjectType;
import com.nisovin.shopkeepers.api.shopobjects.living.LivingShopObjectType;
import com.nisovin.shopkeepers.api.shopobjects.living.LivingShopObjectTypes;
import org.bukkit.entity.EntityType;

DefaultShopObjectTypes objectTypes = ShopkeepersAPI.getDefaultShopObjectTypes();

// Living entity types (villager, zombie, etc.)
LivingShopObjectTypes living = objectTypes.getLivingShopObjectTypes();
LivingShopObjectType<?> villager = living.get(EntityType.VILLAGER);
LivingShopObjectType<?> skeleton = living.get(EntityType.SKELETON);

// Sign-based shopkeepers
ShopObjectType<?> sign = objectTypes.getSignShopObjectType();
ShopObjectType<?> hangingSign = objectTypes.getHangingSignShopObjectType();

// Citizens NPC (requires Citizens plugin)
ShopObjectType<?> citizens = objectTypes.getCitizensShopObjectType();

// Static convenience accessors
var signType = DefaultShopObjectTypes.SIGN();
var livingTypes = DefaultShopObjectTypes.LIVING();
```

### Working with Player Shopkeeper Offers

```java
import com.nisovin.shopkeepers.api.shopkeeper.Shopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.player.sell.SellingPlayerShopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.player.buy.BuyingPlayerShopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.player.trade.TradingPlayerShopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.player.book.BookPlayerShopkeeper;
import com.nisovin.shopkeepers.api.shopkeeper.offers.PriceOffer;
import com.nisovin.shopkeepers.api.shopkeeper.offers.TradeOffer;
import com.nisovin.shopkeepers.api.shopkeeper.offers.BookOffer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

// Selling shop: sells items to players for emeralds
if (shopkeeper instanceof SellingPlayerShopkeeper seller) {
    // PriceOffer: item + price in emeralds
    PriceOffer offer = PriceOffer.create(new ItemStack(Material.DIAMOND), 5);
    seller.addOffer(offer);
    seller.save();
}

// Buying shop: buys items from players for emeralds
if (shopkeeper instanceof BuyingPlayerShopkeeper buyer) {
    PriceOffer offer = PriceOffer.create(new ItemStack(Material.WHEAT, 16), 1);
    buyer.addOffer(offer);
    buyer.save();
}

// Trading shop: custom item-for-item trades
if (shopkeeper instanceof TradingPlayerShopkeeper trader) {
    TradeOffer offer = TradeOffer.create(
        new ItemStack(Material.DIAMOND),       // result
        new ItemStack(Material.EMERALD, 3),    // cost 1
        new ItemStack(Material.GOLD_INGOT, 2)  // cost 2 (nullable)
    );
    trader.addOffer(offer);
    trader.save();
}

// Book shop: sells written books
if (shopkeeper instanceof BookPlayerShopkeeper bookShop) {
    BookOffer offer = BookOffer.create("My Book Title", 10); // title, price
    bookShop.addOffer(offer);
    bookShop.save();
}
```

### PlayerShopkeeper Owner Management

```java
import com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopkeeper;
import org.bukkit.entity.Player;
import java.util.UUID;

if (shopkeeper instanceof PlayerShopkeeper playerShop) {
    UUID ownerUUID = playerShop.getOwnerUUID();
    String ownerName = playerShop.getOwnerName();
    boolean isOwner = playerShop.isOwner(player);

    // Transfer ownership
    playerShop.setOwner(newPlayer);
    // or by UUID + name
    playerShop.setOwner(newUUID, "NewPlayerName");

    // Hire system
    playerShop.setForHire(new ItemStack(Material.EMERALD, 20)); // set hire cost
    boolean forHire = playerShop.isForHire();

    // Notify owner on trades
    playerShop.setNotifyOnTrades(true);

    playerShop.save();
}
```

### Opening Shopkeeper UIs

```java
import com.nisovin.shopkeepers.api.shopkeeper.Shopkeeper;
import org.bukkit.entity.Player;

// Open trading window for a player
shopkeeper.openTradingWindow(player);

// Open editor window
shopkeeper.openEditorWindow(player);
```

## API Reference

### Core Access - `com.nisovin.shopkeepers.api`

**`ShopkeepersAPI`** - Static entry point.
- `static boolean isEnabled()`
- `static ShopkeepersPlugin getPlugin()`
- `static ShopkeeperRegistry getShopkeeperRegistry()`
- `static ShopkeeperStorage getShopkeeperStorage()`
- `static DefaultShopTypes getDefaultShopTypes()`
- `static DefaultShopObjectTypes getDefaultShopObjectTypes()`
- `static DefaultUITypes getDefaultUITypes()`
- `static UIRegistry<?> getUIRegistry()`
- `static Shopkeeper handleShopkeeperCreation(ShopCreationData)` - creates like a player would (respects limits, sends messages). Returns null on failure.

### Shopkeeper - `com.nisovin.shopkeepers.api.shopkeeper`

**`Shopkeeper`** (interface) - Core shopkeeper entity.
- `UUID getUniqueId()` / `int getId()`
- `String getName()` / `void setName(String)`
- `Location getLocation()` / `String getWorldName()`
- `int getX()` / `int getY()` / `int getZ()` / `float getYaw()`
- `ShopType<?> getType()` / `ShopObject getShopObject()`
- `boolean isValid()` / `boolean isVirtual()`
- `boolean openTradingWindow(Player)` / `boolean openEditorWindow(Player)`
- `List<? extends TradingRecipe> getTradingRecipes(Player)`
- `void save()` / `void saveDelayed()` / `void delete()` / `void delete(Player)`
- `ShopkeeperSnapshot createSnapshot(String)` / `void applySnapshot(ShopkeeperSnapshot)`

**`ShopkeeperRegistry`** (interface) - Query and create shopkeepers.
- `Shopkeeper createShopkeeper(ShopCreationData) throws ShopkeeperCreateException`
- `Shopkeeper getShopkeeperByUniqueId(UUID)` - nullable
- `Shopkeeper getShopkeeperById(int)` - nullable
- `Shopkeeper getShopkeeperByEntity(Entity)` - nullable
- `Shopkeeper getShopkeeperByBlock(Block)` - nullable
- `boolean isShopkeeper(Entity)` / `boolean isShopkeeper(Block)`
- `Collection<? extends Shopkeeper> getShopkeepersAtLocation(Location)`
- `Collection<? extends Shopkeeper> getShopkeepersInWorld(String)`
- `Collection<? extends Shopkeeper> getAllShopkeepers()`
- `Collection<? extends PlayerShopkeeper> getPlayerShopkeepersByOwner(UUID)`
- `Collection<? extends PlayerShopkeeper> getAllPlayerShopkeepers()`
- `Stream<? extends Shopkeeper> getShopkeepersByName(String)` - case-insensitive
- `Stream<? extends Shopkeeper> getShopkeepersByNamePrefix(String)`
- `Collection<? extends Shopkeeper> getActiveShopkeepers()`

**`ShopCreationData`** (abstract class) - Base for creation data. Use subclasses.
- `ShopType<?> getShopType()` / `ShopObjectType<?> getShopObjectType()`
- `Player getCreator()` / `Location getSpawnLocation()`

**`TradingRecipe`** (interface)
- `UnmodifiableItemStack getResultItem()` / `getItem1()` / `getItem2()`
- `boolean hasItem2()` / `boolean isOutOfStock()`

**`DefaultShopTypes`** (interface)
- `AdminShopType<?> getRegularAdminShopType()` / `static ShopType<?> ADMIN()`
- `PlayerShopType<?> getSellingPlayerShopType()` / `static PlayerShopType<?> PLAYER_SELLING()`
- `PlayerShopType<?> getBuyingPlayerShopType()` / `static PlayerShopType<?> PLAYER_BUYING()`
- `PlayerShopType<?> getTradingPlayerShopType()` / `static PlayerShopType<?> PLAYER_TRADING()`
- `PlayerShopType<?> getBookPlayerShopType()` / `static PlayerShopType<?> PLAYER_BOOK()`

### Admin Shops - `com.nisovin.shopkeepers.api.shopkeeper.admin`

**`AdminShopCreationData`** extends `ShopCreationData`
- `static AdminShopCreationData create(Player, AdminShopType<?>, ShopObjectType<?>, Location, BlockFace)` - creator can be null

**`AdminShopkeeper`** (interface) extends `Shopkeeper`
- `String getTradePermission()` / `void setTradePermission(String)`

**`RegularAdminShopkeeper`** (interface, `com.nisovin.shopkeepers.api.shopkeeper.admin.regular`) extends `AdminShopkeeper`
- `List<? extends TradeOffer> getOffers()`
- `void addOffer(TradeOffer)` / `void addOffers(List<? extends TradeOffer>)`
- `void setOffers(List<? extends TradeOffer>)` / `void clearOffers()`

### Player Shops - `com.nisovin.shopkeepers.api.shopkeeper.player`

**`PlayerShopCreationData`** extends `ShopCreationData`
- `static PlayerShopCreationData create(Player, PlayerShopType<?>, ShopObjectType<?>, Location, BlockFace, Block)` - creator must be non-null, container must be in same world

**`PlayerShopkeeper`** (interface) extends `Shopkeeper`
- `UUID getOwnerUUID()` / `String getOwnerName()` / `Player getOwner()`
- `void setOwner(Player)` / `void setOwner(UUID, String)`
- `boolean isOwner(Player)`
- `Block getContainer()` / `void setContainer(int, int, int)`
- `boolean isForHire()` / `void setForHire(ItemStack)` / `UnmodifiableItemStack getHireCost()`
- `void setNotifyOnTrades(boolean)` / `boolean isNotifyOnTrades()`
- `boolean openContainerWindow(Player)` / `boolean openHireWindow(Player)`

**`SellingPlayerShopkeeper`** (`...player.sell`) / **`BuyingPlayerShopkeeper`** (`...player.buy`) - use `PriceOffer`
- `List<? extends PriceOffer> getOffers()`
- `void addOffer(PriceOffer)` / `void setOffers(List)` / `void clearOffers()`
- `PriceOffer getOffer(ItemStack)` - nullable

**`TradingPlayerShopkeeper`** (`...player.trade`) - uses `TradeOffer`
- `List<? extends TradeOffer> getOffers()`
- `void addOffer(TradeOffer)` / `void setOffers(List)` / `void clearOffers()`

**`BookPlayerShopkeeper`** (`...player.book`) - uses `BookOffer`
- `List<? extends BookOffer> getOffers()`
- `void addOffer(BookOffer)` / `void setOffers(List)` / `void clearOffers()`
- `BookOffer getOffer(String bookTitle)` - nullable

### Offers - `com.nisovin.shopkeepers.api.shopkeeper.offers`

**`TradeOffer`** (interface) - Custom item-for-item trade.
- `static TradeOffer create(ItemStack resultItem, ItemStack item1, ItemStack item2)` - item2 can be null
- `UnmodifiableItemStack getResultItem()` / `getItem1()` / `getItem2()`

**`PriceOffer`** (interface) - Item for emerald price.
- `static PriceOffer create(ItemStack item, int price)` - price must be positive
- `UnmodifiableItemStack getItem()` / `int getPrice()`

**`BookOffer`** (interface) - Book title for emerald price.
- `static BookOffer create(String bookTitle, int price)`
- `String getBookTitle()` / `int getPrice()`

### Shop Objects - `com.nisovin.shopkeepers.api.shopobjects`

**`DefaultShopObjectTypes`** (interface)
- `LivingShopObjectTypes getLivingShopObjectTypes()` / `static LivingShopObjectTypes LIVING()`
- `SignShopObjectType<?> getSignShopObjectType()` / `static SignShopObjectType<?> SIGN()`
- `HangingSignShopObjectType<?> getHangingSignShopObjectType()` / `static HangingSignShopObjectType<?> HANGING_SIGN()`
- `CitizensShopObjectType<?> getCitizensShopObjectType()` / `static CitizensShopObjectType<?> CITIZEN()`

**`LivingShopObjectTypes`** (`...shopobjects.living`)
- `LivingShopObjectType<?> get(EntityType)` - get type for any supported mob
- `Collection<? extends LivingShopObjectType<?>> getAll()`

**`ShopObject`** (interface) - The visual representation of a shopkeeper.
- `ShopObjectType<?> getType()` / `Location getLocation()`
- `String getName()` / `void setName(String)`
- `boolean isSpawned()` / `boolean isActive()`

### Events - `com.nisovin.shopkeepers.api.events`

**`ShopkeeperTradeEvent`** extends `ShopkeeperEvent`, `Cancellable` - Before trade is applied.
- `Player getPlayer()` / `Shopkeeper getShopkeeper()` / `TradingRecipe getTradingRecipe()`
- `UnmodifiableItemStack getOfferedItem1()` / `getOfferedItem2()` / `getResultItem()`
- `void setReceivedItem1(UnmodifiableItemStack)` / `setReceivedItem2(...)` / `setResultItem(...)`
- `InventoryClickEvent getClickEvent()`

**`ShopkeeperTradeCompletedEvent`** extends `ShopkeeperEvent` - After trade is done.
- `ShopkeeperTradeEvent getCompletedTrade()`

**`PlayerCreateShopkeeperEvent`** extends `Event`, `Cancellable`
- `ShopCreationData getShopCreationData()`

**`PlayerCreatePlayerShopkeeperEvent`** extends `PlayerCreateShopkeeperEvent`
- `int getMaxShopsLimit()` / `void setMaxShopsLimit(int)`

**`PlayerDeleteShopkeeperEvent`** extends `ShopkeeperEvent`, `Cancellable`
- `Player getPlayer()`

**`ShopkeeperAddedEvent`** extends `ShopkeeperEvent` - Shopkeeper added to registry.
- `ShopkeeperAddedEvent.Cause getCause()` - CREATED, LOADED

**`ShopkeeperRemoveEvent`** extends `ShopkeeperEvent` - Shopkeeper being removed.
- `ShopkeeperRemoveEvent.Cause getCause()`

**`ShopkeeperEditedEvent`** extends `ShopkeeperEvent`
- `Player getPlayer()`

**`ShopkeeperOpenUIEvent`** extends `PlayerOpenUIEvent`
- `Shopkeeper getShopkeeper()`

### UI - `com.nisovin.shopkeepers.api.ui`

**`DefaultUITypes`** (interface)
- `static UIType TRADING()` / `static UIType EDITOR()` / `static UIType HIRING()`

**`UISession`** (interface) - Active UI session.
- `Player getPlayer()` / `Shopkeeper getShopkeeper()` / `UIType getUIType()`
- `boolean isValid()` / `void close()` / `void abort()`

### Storage - `com.nisovin.shopkeepers.api.storage`

**`ShopkeeperStorage`** (interface)
- `void save()` / `void saveDelayed()` / `void saveImmediate()` / `void saveNow()`
- `boolean isDirty()` / `void saveIfDirty()`

### Utilities - `com.nisovin.shopkeepers.api.util`

**`UnmodifiableItemStack`** (interface) - Immutable ItemStack wrapper.
- `static UnmodifiableItemStack of(ItemStack)` - nullable-safe, returns null if input is null
- `static UnmodifiableItemStack ofNonNull(ItemStack)` - throws if null
- `ItemStack copy()` - mutable copy
- `Material getType()` / `int getAmount()` / `boolean hasItemMeta()` / `ItemMeta getItemMeta()`
- `boolean isSimilar(ItemStack)` / `boolean isSimilar(UnmodifiableItemStack)`

**`ChunkCoords`** (class)
- `static ChunkCoords fromBlock(String worldName, int blockX, int blockZ)`
- `String getWorldName()` / `int getChunkX()` / `int getChunkZ()`
- `boolean isChunkLoaded()`
