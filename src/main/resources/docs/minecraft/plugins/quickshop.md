# QuickShop-Hikari API

Chest-shop plugin API for creating, querying, and managing player shops. Supports per-shop permissions, phased events, economy integration, and item matching.

## Getting the API Instance

```java
import com.ghostchu.quickshop.api.QuickShopAPI;
import com.ghostchu.quickshop.api.shop.ShopManager;

QuickShopAPI api = QuickShopAPI.getInstance();
ShopManager shopManager = api.getShopManager();
```

Alternative via Bukkit ServiceManager:

```java
import com.ghostchu.quickshop.api.QuickShopAPI;
import com.ghostchu.quickshop.api.QuickShopProvider;
import com.ghostchu.quickshop.api.shop.ShopManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

RegisteredServiceProvider<QuickShopProvider> provider =
    Bukkit.getServicesManager().getRegistration(QuickShopProvider.class);
if (provider == null) {
    throw new IllegalStateException("QuickShop hasn't loaded yet.");
}
QuickShopAPI api = provider.getProvider().getApiInstance();
ShopManager shopManager = api.getShopManager();
```

## Finding and Querying Shops

```java
import com.ghostchu.quickshop.api.QuickShopAPI;
import com.ghostchu.quickshop.api.shop.Shop;
import com.ghostchu.quickshop.api.shop.ShopManager;
import com.ghostchu.quickshop.api.shop.ShopType;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Set;

ShopManager manager = QuickShopAPI.getInstance().getShopManager();

// Get shop at location (includes double-chest attached shops, uses cache)
// MUST be called on the main server thread
Shop shop = manager.getShopIncludeAttached(location);

// Bypass cache (main thread only, slightly more expensive)
Shop freshShop = manager.getShopIncludeAttached(location, false);

// Get shop by persistent ID (survives restarts, unlike RuntimeRandomUniqueId)
Shop byId = manager.getShop(shopId);

// Get all shops on the server
List<Shop> allShops = manager.getAllShops();

// Get all shops owned by a specific player (by UUID)
List<Shop> playerShops = manager.getAllShops(player.getUniqueId());

// Get only currently loaded shops (chunks loaded)
Set<Shop> loadedShops = manager.getLoadedShops();

// Get all shops in a specific world
List<Shop> worldShops = manager.getShopsInWorld(world);
```

## Reading Shop Properties

```java
import com.ghostchu.quickshop.api.shop.Shop;
import com.ghostchu.quickshop.api.shop.ShopType;
import com.ghostchu.quickshop.api.obj.QUser;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

Shop shop = /* obtained from ShopManager */;

double price = shop.getPrice();
ItemStack item = shop.getItem();
QUser owner = shop.getOwner();
Location loc = shop.getLocation();
long id = shop.getShopId(); // persistent ID, can be -1 if not yet initialized
String name = shop.getShopName(); // nullable
String currency = shop.getCurrency(); // nullable
ShopType type = shop.getShopType(); // SELLING, BUYING, or FROZEN

boolean selling = shop.isSelling();
boolean buying = shop.isBuying();
boolean unlimited = shop.isUnlimited();
boolean free = shop.isFreeShop();

int stock = shop.getRemainingStock();
int space = shop.getRemainingSpace();
int stackAmount = shop.getShopStackingAmount();
```

## Modifying Shop Properties

```java
import com.ghostchu.quickshop.api.shop.Shop;
import com.ghostchu.quickshop.api.shop.ShopType;

Shop shop = /* obtained from ShopManager */;

shop.setPrice(100.0);
shop.setShopType(ShopType.BUYING);
shop.setUnlimited(true);
shop.setShopName("My Diamond Shop");
shop.setCurrency("dollars");
shop.setSignText(); // refresh the sign display
```

## Deleting / Unloading Shops

Must be called on the main server thread.

```java
import com.ghostchu.quickshop.api.shop.Shop;
import com.ghostchu.quickshop.api.shop.ShopManager;

ShopManager manager = /* ... */;
Shop shop = /* ... */;

manager.deleteShop(shop); // permanent: removes from memory AND database
manager.unloadShop(shop); // removes from loaded shops list (chunk unloaded)
manager.loadShop(shop);   // puts shop back into loaded shops list
```

## Item Matching

Do not use `ItemStack.isSimilar()` directly. QuickShop has its own matching system with user-configurable options.

```java
import com.ghostchu.quickshop.api.QuickShopAPI;
import com.ghostchu.quickshop.api.shop.ItemMatcher;
import com.ghostchu.quickshop.api.shop.Shop;
import org.bukkit.inventory.ItemStack;

Shop shop = /* ... */;
ItemStack myItem = /* ... */;

// Compare against a shop's item (preferred)
boolean matches = shop.matches(myItem);

// Compare two standalone items
ItemMatcher matcher = QuickShopAPI.getInstance().getItemMatcher();
boolean result = matcher.matches(original, target);
```

## Per-Shop Permissions

```java
import com.ghostchu.quickshop.api.shop.Shop;
import com.ghostchu.quickshop.api.shop.permission.BuiltInShopPermission;
import com.ghostchu.quickshop.api.shop.permission.BuiltInShopPermissionGroup;

import java.util.UUID;

Shop shop = /* ... */;
UUID playerUuid = /* ... */;

// Check if player has a built-in shop permission
boolean canPurchase = shop.playerAuthorize(playerUuid, BuiltInShopPermission.PURCHASE);
boolean canDelete = shop.playerAuthorize(playerUuid, BuiltInShopPermission.DELETE);
boolean canSetPrice = shop.playerAuthorize(playerUuid, BuiltInShopPermission.SET_PRICE);

// Check a custom permission from another plugin
boolean hasCustomPerm = shop.playerAuthorize(playerUuid, myPlugin, "my-custom-permission");

// Set a player's permission group on a shop
shop.setPlayerGroup(playerUuid, BuiltInShopPermissionGroup.STAFF);
shop.setPlayerGroup(playerUuid, BuiltInShopPermissionGroup.ADMINISTRATOR);
```

## Listening to Shop Events

All QuickShop events extend `AbstractQSEvent`. Many are phased (PRE/MAIN/POST). Use PRE to cancel or modify, POST for logging/side-effects. Register your listener class with Bukkit as normal.

### Purchase Events

```java
import com.ghostchu.quickshop.api.event.economy.ShopPurchaseEvent;
import com.ghostchu.quickshop.api.event.economy.ShopSuccessPurchaseEvent;
import com.ghostchu.quickshop.api.shop.Shop;
import com.ghostchu.quickshop.api.obj.QUser;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ShopPurchaseListener implements Listener {

    // Fires BEFORE the purchase is processed. Cancellable.
    @EventHandler
    public void onShopPurchase(ShopPurchaseEvent event) {
        Shop shop = event.getShop();
        QUser buyer = event.getPurchaser();
        int amount = event.getAmount();
        double total = event.getTotal();

        // Example: block purchases over 10000
        if (total > 10000) {
            event.setCancelled(true, Component.text("Purchase too expensive!"));
        }
    }

    // Fires AFTER a successful purchase
    @EventHandler
    public void onPurchaseSuccess(ShopSuccessPurchaseEvent event) {
        Shop shop = event.getShop();
        QUser buyer = event.getPurchaser();
        double total = event.getBalance();
        double tax = event.getTax();
        int amount = event.getAmount();
        // Log or react to successful purchase
    }
}
```

### Shop Create / Delete Events

```java
import com.ghostchu.quickshop.api.event.management.ShopCreateEvent;
import com.ghostchu.quickshop.api.event.management.ShopDeleteEvent;
import com.ghostchu.quickshop.api.shop.Shop;
import com.ghostchu.quickshop.api.obj.QUser;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ShopLifecycleListener implements Listener {

    @EventHandler
    public void onShopCreate(ShopCreateEvent event) {
        if (event.isCancelled()) return;
        Shop shop = event.shop().orElse(null);
        if (shop == null) return;
        QUser creator = event.user();
        Location location = event.location();
        // Note: shop.getShopId() may be -1 here; use ShopDatabaseEvent for post-registration ID
    }

    @EventHandler
    public void onShopDelete(ShopDeleteEvent event) {
        Shop shop = event.shop().orElse(null);
        if (shop == null) return;
        boolean memoryOnly = event.memory();
        // Cleanup, logging, etc.
    }
}
```

### Price Change Event

```java
import com.ghostchu.quickshop.api.event.settings.type.ShopPriceEvent;
import com.ghostchu.quickshop.api.event.Phase;
import com.ghostchu.quickshop.api.shop.Shop;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PriceChangeListener implements Listener {

    @EventHandler
    public void onPriceChange(ShopPriceEvent event) {
        if (!event.isPhase(Phase.PRE)) return; // only act on PRE phase
        Shop shop = event.shop();
        Double oldPrice = event.old();
        Double newPrice = event.updated();
        if (newPrice != null && newPrice < 0) {
            event.setCancelled(true, Component.text("Negative prices are not allowed."));
        }
    }
}
```

### Tax Event

```java
import com.ghostchu.quickshop.api.event.economy.ShopTaxEvent;
import com.ghostchu.quickshop.api.shop.Shop;
import com.ghostchu.quickshop.api.obj.QUser;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class TaxListener implements Listener {

    @EventHandler
    public void onTax(ShopTaxEvent event) {
        Shop shop = event.getShop();
        QUser user = event.getUser();
        double currentTax = event.getTax();
        // Example: VIP players get 50% tax reduction
        if (user.getBukkitPlayer().isPresent()
                && user.getBukkitPlayer().get().hasPermission("shop.vip")) {
            event.setTax(currentTax * 0.5);
        }
    }
}
```

### Shop Type Change Event

```java
import com.ghostchu.quickshop.api.event.settings.type.ShopTypeEvent;
import com.ghostchu.quickshop.api.shop.ShopType;
import com.ghostchu.quickshop.api.shop.Shop;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ShopTypeListener implements Listener {

    @EventHandler
    public void onTypeChange(ShopTypeEvent event) {
        Shop shop = event.shop();
        ShopType oldType = event.old();
        ShopType newType = event.updated();
        // React to type changes (SELLING, BUYING, FROZEN)
    }
}
```

## Economy Integration

```java
import com.ghostchu.quickshop.api.QuickShopAPI;
import com.ghostchu.quickshop.api.shop.Shop;
import com.ghostchu.quickshop.api.shop.ShopManager;
import org.bukkit.World;

ShopManager manager = QuickShopAPI.getInstance().getShopManager();

// Format a price using QuickShop's economy formatter
String formatted = manager.format(100.50, world, null);

// Get the tax rate for a specific shop and user
double tax = manager.getTax(shop, qUser);
```

## QUser - User Abstraction

QuickShop uses `QUser` instead of `Player`/`UUID` directly. It supports real players, virtual/system accounts, and offline resolution.

```java
import com.ghostchu.quickshop.api.obj.QUser;

import java.util.Optional;
import java.util.UUID;

QUser owner = shop.getOwner();

// Get display name
String display = owner.getDisplay();

// Check if it's a real player (not a system/virtual account)
boolean real = owner.isRealPlayer();

// Get UUID (may be null for virtual accounts)
Optional<UUID> uuid = owner.getUniqueIdIfRealPlayer();

// Get the online Bukkit Player if available
owner.getBukkitPlayer().ifPresent(player -> {
    player.sendMessage("Your shop was purchased from!");
});
```

## Storing Extra Data on a Shop

```java
import com.ghostchu.quickshop.api.shop.Shop;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    public void storeData(Shop shop) {
        ConfigurationSection extra = shop.getExtra(this);
        extra.set("custom-key", "custom-value");
        extra.set("visits", 42);
        shop.setExtra(this, extra);
    }

    public String readData(Shop shop) {
        ConfigurationSection extra = shop.getExtra(this);
        return extra.getString("custom-key");
    }
}
```

## Trimmed API Reference

### com.ghostchu.quickshop.api.QuickShopAPI (Interface)
- `static QuickShopAPI getInstance()`
- `static Plugin getPluginInstance()`
- `ShopManager getShopManager()`
- `ItemMatcher getItemMatcher()`
- `TextManager getTextManager()`
- `CommandManager getCommandManager()`
- `DatabaseHelper getDatabaseHelper()`
- `RegistryManager getRegistry()`
- `ShopControlPanelManager getShopControlPanelManager()`
- `InventoryWrapperRegistry getInventoryWrapperRegistry()`
- `PlayerFinder getPlayerFinder()`
- `RankLimiter getRankLimiter()`
- `ShopItemBlackList getShopItemBlackList()`
- `GameVersion getGameVersion()`
- `boolean isAllowStack()`
- `boolean isLimit()`
- `Map<String, Integer> getLimits()`

### com.ghostchu.quickshop.api.shop.ShopManager (Interface)
- `Shop getShop(Location)` / `Shop getShop(Location, boolean)` / `Shop getShop(long)`
- `Shop getShopIncludeAttached(Location)` / `Shop getShopIncludeAttached(Location, boolean)`
- `Shop getShopViaCache(Location)`
- `Shop getShopIncludeAttachedViaCache(Location)`
- `List<Shop> getAllShops()` / `List<Shop> getAllShops(QUser)` / `List<Shop> getAllShops(UUID)`
- `Set<Shop> getLoadedShops()`
- `List<Shop> getShopsInWorld(World)` / `List<Shop> getShopsInWorld(String)`
- `Map<Location, Shop> getShops(Chunk)` / `Map<Location, Shop> getShops(ShopChunk)`
- `Iterator<Shop> getShopIterator()`
- `void createShop(Shop, Block, boolean)`
- `CompletableFuture<?> registerShop(Shop, boolean)`
- `CompletableFuture<?> unregisterShop(Shop, boolean)`
- `void deleteShop(Shop)`
- `void loadShop(Shop)` / `void unloadShop(Shop)`
- `double getTax(Shop, QUser)`
- `String format(double, World, String)` / `String format(double, Shop)`
- `PriceLimiter getPriceLimiter()`
- `CompletableFuture<Integer> tagShop(UUID, Shop, String)` / `CompletableFuture<Integer> removeTag(UUID, Shop, String)`
- `CompletableFuture<List<Shop>> queryTaggedShops(UUID, String)`
- `List<String> listTags(UUID)`

### com.ghostchu.quickshop.api.shop.Shop (Interface)
- `double getPrice()` / `void setPrice(double)`
- `ItemStack getItem()` / `void setItem(ItemStack)`
- `QUser getOwner()` / `void setOwner(QUser)`
- `Location getLocation()`
- `long getShopId()` / `void setShopId(long)`
- `ShopType getShopType()` / `void setShopType(ShopType)`
- `boolean isSelling()` / `boolean isBuying()` / `boolean isFreeShop()` / `boolean isFrozen()`
- `boolean isUnlimited()` / `void setUnlimited(boolean)`
- `int getRemainingStock()` / `int getRemainingSpace()`
- `int getShopStackingAmount()` / `boolean isStackingShop()`
- `String getShopName()` / `void setShopName(String)`
- `String getCurrency()` / `void setCurrency(String)`
- `boolean matches(ItemStack)`
- `boolean playerAuthorize(UUID, BuiltInShopPermission)` / `boolean playerAuthorize(UUID, Plugin, String)`
- `void setPlayerGroup(UUID, String)` / `void setPlayerGroup(UUID, BuiltInShopPermissionGroup)`
- `String getPlayerGroup(UUID)`
- `List<UUID> playersCanAuthorize(BuiltInShopPermission)`
- `Map<UUID, String> getPermissionAudiences()`
- `Benefit getShopBenefit()` / `void setShopBenefit(Benefit)`
- `QUser getTaxAccount()` / `QUser getTaxAccountActual()` / `void setTaxAccount(QUser)`
- `InventoryWrapper getInventory()` / `void setInventory(InventoryWrapper, InventoryWrapperManager)`
- `boolean inventoryAvailable()` / `boolean isValid()` / `boolean isLoaded()`
- `ConfigurationSection getExtra(Plugin)` / `void setExtra(Plugin, ConfigurationSection)`
- `void buy(QUser, InventoryWrapper, Location, int)` / `void sell(QUser, InventoryWrapper, Location, int)`
- `void setSignText()` / `List<Component> getSignText(ProxiedLocale)`
- `List<Sign> getSigns()` / `void claimShopSign(Sign)`
- `void openPreview(Player)` / `void onClick(Player)`
- `CompletableFuture<Void> update()` / `void refresh()`
- `boolean isDisableDisplay()` / `void setDisableDisplay(boolean)`
- `void add(ItemStack, int)` / `void remove(ItemStack, int)`

### com.ghostchu.quickshop.api.obj.QUser (Interface)
- `String getUsername()` / `void setUsername(String)`
- `UUID getUniqueId()` / `void setUniqueId(UUID)`
- `String getDisplay()`
- `boolean isRealPlayer()` / `void setRealPlayer(boolean)`
- `boolean isFull()`
- `Optional<UUID> getUniqueIdIfRealPlayer()` / `Optional<UUID> getUniqueIdOptional()`
- `Optional<String> getUsernameIfRealPlayer()` / `Optional<String> getUsernameOptional()`
- `Optional<Player> getBukkitPlayer()`
- `String serialize()`

### com.ghostchu.quickshop.api.shop.ShopType (Enum)
- `SELLING`, `BUYING`, `FROZEN`
- `static ShopType fromID(int)` / `static ShopType fromString(String)` / `int toID()`

### com.ghostchu.quickshop.api.shop.permission.BuiltInShopPermission (Enum)
- `PURCHASE`, `SHOW_INFORMATION`, `PREVIEW_SHOP`, `SEARCH`, `DELETE`, `RECEIVE_ALERT`, `ACCESS_INVENTORY`, `OWNERSHIP_TRANSFER`, `MANAGEMENT_PERMISSION`, `TOGGLE_DISPLAY`, `SET_SHOPTYPE`, `SET_PRICE`, `SET_ITEM`, `SET_STACK_AMOUNT`, `SET_CURRENCY`, `SET_NAME`, `SET_BENEFIT`, `SET_SIGN_TYPE`, `VIEW_PURCHASE_LOGS`

### com.ghostchu.quickshop.api.shop.permission.BuiltInShopPermissionGroup (Enum)
- `BLOCKED`, `EVERYONE`, `STAFF`, `ADMINISTRATOR`
- `List<BuiltInShopPermission> getPermissions()`
- `boolean hasPermission(BuiltInShopPermission)`

### com.ghostchu.quickshop.api.shop.ItemMatcher (Interface)
- `boolean matches(ItemStack, ItemStack)`
- `String getName()`
- `Plugin getPlugin()`

### com.ghostchu.quickshop.api.shop.PriceLimiter (Interface)
- `PriceLimiterCheckResult check(QUser, ItemStack, String, double)`

### com.ghostchu.quickshop.api.shop.PriceLimiterCheckResult (Interface)
- `PriceLimiterStatus getStatus()` / `double getMin()` / `double getMax()`

### com.ghostchu.quickshop.api.shop.PriceLimiterStatus (Enum)
- `PASS`, `REACHED_PRICE_MAX_LIMIT`, `REACHED_PRICE_MIN_LIMIT`, `PRICE_RESTRICTED`, `NOT_A_WHOLE_NUMBER`, `NOT_VALID`

### com.ghostchu.quickshop.api.shop.ShopItemBlackList (Interface)
- `boolean isBlacklisted(ItemStack)`

### Key Event Classes

#### com.ghostchu.quickshop.api.event.economy.ShopPurchaseEvent (Cancellable)
- `Shop getShop()` / `QUser getPurchaser()` / `int getAmount()` / `double getTotal()` / `void setTotal(double)`

#### com.ghostchu.quickshop.api.event.economy.ShopSuccessPurchaseEvent
- `Shop getShop()` / `QUser getPurchaser()` / `int getAmount()` / `double getBalance()` / `double getTax()`

#### com.ghostchu.quickshop.api.event.economy.ShopTaxEvent
- `Shop getShop()` / `QUser getUser()` / `double getTax()` / `void setTax(double)`

#### com.ghostchu.quickshop.api.event.management.ShopCreateEvent (Cancellable, Phased)
- `Optional<Shop> shop()` / `QUser user()` / `Location location()`

#### com.ghostchu.quickshop.api.event.management.ShopDeleteEvent (Cancellable, Phased)
- `Optional<Shop> shop()` / `boolean memory()`

#### com.ghostchu.quickshop.api.event.management.ShopClickEvent (Cancellable, Phased)
- `Optional<Shop> shop()` / `QUser user()`

#### com.ghostchu.quickshop.api.event.settings.type.ShopPriceEvent (Cancellable, Phased)
- `Shop shop()` / `Double old()` / `Double updated()` / `void updated(Double)`

#### com.ghostchu.quickshop.api.event.settings.type.ShopTypeEvent (Cancellable, Phased)
- `Shop shop()` / `ShopType old()` / `ShopType updated()` / `void updated(ShopType)`

#### com.ghostchu.quickshop.api.event.settings.type.ShopOwnerEvent (Cancellable, Phased)
- `Shop shop()` / `QUser old()` / `QUser updated()` / `void updated(QUser)`

#### com.ghostchu.quickshop.api.event.settings.type.ShopNameEvent (Cancellable, Phased)
- `Shop shop()` / `String old()` / `String updated()` / `void updated(String)`

#### com.ghostchu.quickshop.api.event.general.ShopControlPanelOpenEvent (Cancellable)
- `Shop getShop()` / `CommandSender getSender()`

#### com.ghostchu.quickshop.api.event.inventory.ShopInventoryPreviewEvent (Cancellable)
- `Player getPlayer()` / `ItemStack getItemStack()`

#### com.ghostchu.quickshop.api.event.inventory.ShopInventoryCalculateEvent
- `Shop getShop()` / `int getStock()` / `int getSpace()`

#### com.ghostchu.quickshop.api.event.general.ShopOngoingFeeEvent (Cancellable)
- `Shop getShop()` / `QUser getPlayer()` / `double getCost()` / `void setCost(double)`

### com.ghostchu.quickshop.api.economy.EconomyCore (Interface)
- `double getBalance(QUser, World, String)`
- `boolean deposit(QUser, double, World, String)`
- `boolean withdraw(QUser, double, World, String)`
- `boolean transfer(QUser, QUser, double, World, String)`
- `String format(double, World, String)`
- `boolean isValid()` / `boolean supportCurrency()` / `boolean hasCurrency(World, String)`

### com.ghostchu.quickshop.api.economy.EconomyType (Enum)
- `UNKNOWN`, `VAULT`, `RESERVE`, `GEMS_ECONOMY`, `TNE`, `COINS_ENGINE`, `TREASURY`

### com.ghostchu.quickshop.api.economy.Benefit (Interface)
- `Map<QUser, Double> getRegistry()`
- `void addBenefit(QUser, double)` / `void removeBenefit(QUser)`
- `boolean isEmpty()` / `String serialize()`

### com.ghostchu.quickshop.api.database.DatabaseHelper (Interface)
- `CompletableFuture<Long> locateShopId(String, int, int, int)`
- `CompletableFuture<DataRecord> getDataRecord(long)`
- `List<ShopRecord> listShops(boolean)` / `List<ShopRecord> listShops(String, boolean)`
- `CompletableFuture<Integer> removeShop(long)`
- `void insertTransactionRecord(UUID, UUID, double, String, double, UUID, String)`
- `CompletableFuture<Integer> insertMetricRecord(ShopMetricRecord)`

### com.ghostchu.quickshop.api.database.ShopOperationEnum (Enum)
- `PURCHASE`, `PURCHASE_SELLING_SHOP`, `PURCHASE_BUYING_SHOP`, `CREATE`, `DELETE`, `ONGOING_FEE`, `FROZEN`

### com.ghostchu.quickshop.api.event.Phase (Enum)
- `PRE`, `PRE_CANCELLABLE`, `MAIN`, `POST`, `RETRIEVE`
- `boolean allowUpdate()` / `boolean cancellable()`
