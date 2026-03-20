# ShopGUI+ API Reference

GUI-based shop plugin with per-item/shop/global price modifiers, multiple economy support, and custom provider registration. The API lets plugins look up shop items and prices, open shop menus, manage price modifiers per player, register custom economy/item/spawner providers, and listen to transaction events. Add `ShopGUIPlus` to `softdepend` in plugin.yml.

**Important:** Do NOT call the API in `onEnable()`. Wait for `ShopGUIPlusPostEnableEvent` before registering providers or accessing shops.

## Code Examples

### Getting Shops and Items

```java
import net.brcdev.shopgui.ShopGuiPlusApi;
import net.brcdev.shopgui.shop.Shop;
import net.brcdev.shopgui.shop.item.ShopItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

// Get a shop by ID
Shop shop = ShopGuiPlusApi.getShop("blocks");

// Find which shop an item belongs to
Shop itemShop = ShopGuiPlusApi.getItemStackShop(player, itemStack); // respects player access
Shop itemShopGlobal = ShopGuiPlusApi.getItemStackShop(itemStack);   // ignores access

// Get the ShopItem for an ItemStack
ShopItem shopItem = ShopGuiPlusApi.getItemStackShopItem(player, itemStack);
ShopItem shopItemGlobal = ShopGuiPlusApi.getItemStackShopItem(itemStack);

// Get an item within a shop by ID or by page+slot
ShopItem byId = shop.getShopItem("diamond_sword");
ShopItem bySlot = shop.getShopItem(1, 0); // page 1, slot 0
```

### Get Buy/Sell Prices

```java
import net.brcdev.shopgui.ShopGuiPlusApi;
import net.brcdev.shopgui.shop.item.ShopItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

// Price for the item's stack amount (returns -1.0 if not found)
double buyPrice = ShopGuiPlusApi.getItemStackPriceBuy(player, itemStack);   // with modifiers
double sellPrice = ShopGuiPlusApi.getItemStackPriceSell(player, itemStack); // with modifiers

// Without player modifiers
double buyPriceRaw = ShopGuiPlusApi.getItemStackPriceBuy(itemStack);
double sellPriceRaw = ShopGuiPlusApi.getItemStackPriceSell(itemStack);

// Price for a specific amount via ShopItem
ShopItem shopItem = ShopGuiPlusApi.getItemStackShopItem(player, itemStack);
if (shopItem != null) {
    double buy64 = shopItem.getBuyPriceForAmount(player, 64);
    double sell64 = shopItem.getSellPriceForAmount(player, 64);

    // Base prices without modifiers
    double baseBuy = shopItem.getBuyPrice();
    double baseSell = shopItem.getSellPrice();
}
```

### Open Shop Menus

```java
import net.brcdev.shopgui.ShopGuiPlusApi;
import net.brcdev.shopgui.exception.player.PlayerDataNotLoadedException;
import org.bukkit.entity.Player;

try {
    // Open main shop menu
    ShopGuiPlusApi.openMainMenu(player);

    // Open a specific shop at a specific page
    ShopGuiPlusApi.openShop(player, "blocks", 1);
} catch (PlayerDataNotLoadedException e) {
    player.sendMessage("Your data hasn't loaded yet, please wait.");
}
```

### Price Modifiers (Per-Player Discounts/Markups)

```java
import net.brcdev.shopgui.ShopGuiPlusApi;
import net.brcdev.shopgui.modifier.PriceModifier;
import net.brcdev.shopgui.modifier.PriceModifierActionType;
import net.brcdev.shopgui.shop.Shop;
import net.brcdev.shopgui.shop.item.ShopItem;
import net.brcdev.shopgui.exception.player.PlayerDataNotLoadedException;
import org.bukkit.entity.Player;

try {
    // Global modifier: 0.9 = 10% discount on all buys
    ShopGuiPlusApi.setPriceModifier(player, PriceModifierActionType.BUY, 0.9);

    // Per-shop modifier: 50% discount on sells in "ores" shop
    Shop oresShop = ShopGuiPlusApi.getShop("ores");
    ShopGuiPlusApi.setPriceModifier(player, oresShop, PriceModifierActionType.SELL, 0.5);

    // Per-item modifier: double price for a specific item
    ShopItem item = ShopGuiPlusApi.getItemStackShopItem(itemStack);
    ShopGuiPlusApi.setPriceModifier(player, item, PriceModifierActionType.BOTH, 2.0);

    // Read current modifier
    PriceModifier mod = ShopGuiPlusApi.getPriceModifier(player, PriceModifierActionType.BUY);
    double multiplier = mod.getModifier(); // 1.0 = 100% (no change)

    // Reset modifiers
    ShopGuiPlusApi.resetPriceModifier(player, PriceModifierActionType.BUY);
    ShopGuiPlusApi.resetPriceModifier(player, oresShop, PriceModifierActionType.SELL);
    ShopGuiPlusApi.resetPriceModifier(player, item, PriceModifierActionType.BOTH);
} catch (PlayerDataNotLoadedException e) {
    // Player data not loaded yet
}
```

### Listen for Shop Transactions

```java
import net.brcdev.shopgui.event.ShopPreTransactionEvent;
import net.brcdev.shopgui.event.ShopPostTransactionEvent;
import net.brcdev.shopgui.shop.ShopManager.ShopAction;
import net.brcdev.shopgui.shop.ShopTransactionResult;
import net.brcdev.shopgui.shop.ShopTransactionResult.ShopTransactionResultType;
import net.brcdev.shopgui.shop.item.ShopItem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ShopListener implements Listener {

    @EventHandler
    public void onPreTransaction(ShopPreTransactionEvent event) {
        // Cancellable — fires before the transaction
        Player player = event.getPlayer();
        ShopItem item = event.getShopItem();
        ShopAction action = event.getShopAction(); // BUY, SELL, SELL_ALL
        double price = event.getPrice();
        int amount = event.getAmount();

        // Modify the price
        if (player.hasPermission("vip.discount")) {
            event.setPrice(price * 0.8); // 20% discount
        }

        // Modify the amount
        event.setAmount(amount * 2);

        // Or cancel entirely
        if (!player.hasPermission("shop.use")) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onPostTransaction(ShopPostTransactionEvent event) {
        // NOT cancellable — transaction already completed
        ShopTransactionResult result = event.getResult();
        Player player = result.getPlayer();
        ShopAction action = result.getShopAction();
        ShopTransactionResultType resultType = result.getResult();
        double price = result.getPrice();
        int amount = result.getAmount();
        ShopItem item = result.getShopItem();

        if (resultType == ShopTransactionResultType.SUCCESS) {
            player.sendMessage("Transaction complete: " + amount + "x for $" + price);
        }
    }
}
```

### Wait for ShopGUI+ to Load

```java
import net.brcdev.shopgui.event.ShopGUIPlusPostEnableEvent;
import net.brcdev.shopgui.event.ShopsPostLoadEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ShopHookListener implements Listener {

    @EventHandler
    public void onShopGUIReady(ShopGUIPlusPostEnableEvent event) {
        // Safe to register providers here
        // ShopGuiPlusApi.registerEconomyProvider(...);
        // ShopGuiPlusApi.registerItemProvider(...);
        // ShopGuiPlusApi.registerSpawnerProvider(...);
    }

    @EventHandler
    public void onShopsLoaded(ShopsPostLoadEvent event) {
        // All shops are now loaded and accessible
    }
}
```

### Register a Custom Economy Provider

```java
import net.brcdev.shopgui.ShopGuiPlusApi;
import net.brcdev.shopgui.provider.economy.EconomyProvider;
import org.bukkit.entity.Player;

public class GemsEconomy extends EconomyProvider {

    public GemsEconomy() {
        setCurrencyPrefix("");
        setCurrencySuffix(" gems");
    }

    @Override
    public String getName() {
        return "Gems";
    }

    @Override
    public double getBalance(Player player) {
        return getGemsBalance(player); // your implementation
    }

    @Override
    public void deposit(Player player, double amount) {
        addGems(player, amount);
    }

    @Override
    public void withdraw(Player player, double amount) {
        removeGems(player, amount);
    }
}

// Register in ShopGUIPlusPostEnableEvent handler:
ShopGuiPlusApi.registerEconomyProvider(new GemsEconomy());
```

### Register a Custom Item Provider

```java
import net.brcdev.shopgui.ShopGuiPlusApi;
import net.brcdev.shopgui.provider.item.ItemProvider;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;

public class CustomItemProvider extends ItemProvider {

    public CustomItemProvider() {
        super("MyCustomItems");
    }

    @Override
    public boolean isValidItem(ItemStack itemStack) {
        // Check if this ItemStack is from your custom item system
        return isMyCustomItem(itemStack);
    }

    @Override
    public ItemStack loadItem(ConfigurationSection config) {
        // Load from shop YAML config section
        String customId = config.getString("customItemId");
        return getMyCustomItem(customId);
    }

    @Override
    public boolean compare(ItemStack item1, ItemStack item2) {
        // Compare two custom items for equality
        return getCustomId(item1).equals(getCustomId(item2));
    }
}

// Register in ShopGUIPlusPostEnableEvent handler:
ShopGuiPlusApi.registerItemProvider(new CustomItemProvider());
```

### Register a Custom Spawner Provider

```java
import net.brcdev.shopgui.ShopGuiPlusApi;
import net.brcdev.shopgui.spawner.external.provider.ExternalSpawnerProvider;
import net.brcdev.shopgui.exception.api.ExternalSpawnerProviderNameConflictException;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class MySpawnerProvider implements ExternalSpawnerProvider {

    @Override
    public String getName() {
        return "MySpawnerPlugin";
    }

    @Override
    public ItemStack getSpawnerItem(EntityType entityType) {
        return createSpawner(entityType); // your spawner creation
    }

    @Override
    public EntityType getSpawnerEntityType(ItemStack itemStack) {
        return readEntityType(itemStack); // extract entity type from spawner
    }
}

// Register in ShopGUIPlusPostEnableEvent handler:
try {
    ShopGuiPlusApi.registerSpawnerProvider(new MySpawnerProvider());
} catch (ExternalSpawnerProviderNameConflictException e) {
    // Provider name already taken
}
```

### Browse All Shops and Items

```java
import net.brcdev.shopgui.ShopGuiPlugin;
import net.brcdev.shopgui.shop.Shop;
import net.brcdev.shopgui.shop.ShopManager;
import net.brcdev.shopgui.shop.item.ShopItem;
import net.brcdev.shopgui.exception.shop.ShopsNotLoadedException;

import java.util.Set;

try {
    ShopManager shopManager = ShopGuiPlugin.getInstance().getShopManager();
    Set<Shop> allShops = shopManager.getShops();

    for (Shop shop : allShops) {
        String shopId = shop.getId();
        String shopName = shop.getName();

        for (ShopItem item : shop.getShopItems()) {
            String itemId = item.getId();
            double buyPrice = item.getBuyPrice();
            double sellPrice = item.getSellPrice();
            int page = item.getPage();
            int slot = item.getSlot();
        }
    }
} catch (ShopsNotLoadedException e) {
    // Shops haven't loaded yet — wait for ShopsPostLoadEvent
}
```

## API Reference (Trimmed)

### `net.brcdev.shopgui.ShopGuiPlusApi`

| Return | Method | Description |
|---|---|---|
| `Shop` | `getShop(String shopId)` | Get shop by ID |
| `void` | `openMainMenu(Player)` | Open main shop menu |
| `void` | `openShop(Player, String shopId, int page)` | Open specific shop page |
| `Shop` | `getItemStackShop(Player, ItemStack)` | Find item's shop (player-aware) |
| `Shop` | `getItemStackShop(ItemStack)` | Find item's shop |
| `ShopItem` | `getItemStackShopItem(Player, ItemStack)` | Get ShopItem for ItemStack |
| `ShopItem` | `getItemStackShopItem(ItemStack)` | Get ShopItem (no modifiers) |
| `double` | `getItemStackPriceBuy(Player, ItemStack)` | Buy price with modifiers (-1 if not found) |
| `double` | `getItemStackPriceBuy(ItemStack)` | Buy price without modifiers |
| `double` | `getItemStackPriceSell(Player, ItemStack)` | Sell price with modifiers |
| `double` | `getItemStackPriceSell(ItemStack)` | Sell price without modifiers |
| `PriceModifier` | `getPriceModifier(Player, ShopItem, PriceModifierActionType)` | Get item modifier |
| `void` | `setPriceModifier(Player, ShopItem, PriceModifierActionType, double)` | Set item modifier |
| `void` | `resetPriceModifier(Player, ShopItem, PriceModifierActionType)` | Reset item modifier |
| `PriceModifier` | `getPriceModifier(Player, Shop, PriceModifierActionType)` | Get shop modifier |
| `void` | `setPriceModifier(Player, Shop, PriceModifierActionType, double)` | Set shop modifier |
| `void` | `resetPriceModifier(Player, Shop, PriceModifierActionType)` | Reset shop modifier |
| `PriceModifier` | `getPriceModifier(Player, PriceModifierActionType)` | Get global modifier |
| `void` | `setPriceModifier(Player, PriceModifierActionType, double)` | Set global modifier |
| `void` | `resetPriceModifier(Player, PriceModifierActionType)` | Reset global modifier |
| `void` | `registerEconomyProvider(EconomyProvider)` | Register custom economy |
| `void` | `registerItemProvider(ItemProvider)` | Register custom item provider |
| `void` | `registerSpawnerProvider(ExternalSpawnerProvider)` | Register custom spawner provider |
| `ShopGuiPlugin` | `getPlugin()` | Plugin instance |

### `net.brcdev.shopgui.shop.Shop`

| Return | Method | Description |
|---|---|---|
| `String` | `getId()` | Shop ID |
| `String` | `getName()` | Shop name |
| `String` | `getName(int page)` | Name for specific page |
| `List<ShopItem>` | `getShopItems()` | All items |
| `ShopItem` | `getShopItem(String itemId)` | Item by ID |
| `ShopItem` | `getShopItem(int page, int slot)` | Item by position |
| `EconomyType` | `getEconomyType()` | Economy type |
| `EconomyProvider` | `getEconomyProvider()` | Economy provider instance |
| `boolean` | `hasAccess(Player, ShopItem, boolean sendMessage)` | Check player access |
| `ShopItem` | `findShopItem(Player, PlayerData, ItemStack, boolean excludeFree)` | Find matching item |

### `net.brcdev.shopgui.shop.item.ShopItem`

| Return | Method | Description |
|---|---|---|
| `Shop` | `getShop()` | Parent shop |
| `String` | `getId()` | Item ID |
| `ItemStack` | `getItem()` | Bukkit ItemStack |
| `ShopItemType` | `getType()` | `ITEM`, `PERMISSION`, `ENCHANTMENT`, `COMMAND`, `SPECIAL`, `SHOP_LINK`, `DUMMY` |
| `int` | `getPage()` | Page in shop |
| `int` | `getSlot()` | Slot position |
| `double` | `getBuyPrice()` | Base buy price |
| `double` | `getBuyPrice(Player)` | Buy price with modifiers |
| `double` | `getSellPrice()` | Base sell price |
| `double` | `getSellPrice(Player)` | Sell price with modifiers |
| `double` | `getBuyPriceForAmount(Player, int)` | Scaled buy price with modifiers |
| `double` | `getSellPriceForAmount(Player, int)` | Scaled sell price with modifiers |

### `net.brcdev.shopgui.shop.ShopTransactionResult`

| Return | Method | Description |
|---|---|---|
| `ShopAction` | `getShopAction()` | `BUY`, `SELL`, `SELL_ALL` |
| `ShopTransactionResultType` | `getResult()` | Result type |
| `ShopItem` | `getShopItem()` | Item transacted |
| `Player` | `getPlayer()` | Player |
| `int` | `getAmount()` | Amount |
| `double` | `getPrice()` | Price |

`ShopTransactionResultType`: `SUCCESS`, `FAILURE_CANCELLED`, `FAILURE_NO_MONEY`, `FAILURE_NO_ITEMS`, `FAILURE_FULL_INVENTORY`, `FAILURE_ENCHANTMENT_INAPPLICABLE`, `FAILURE_ENCHANTMENT_ALREADY_APPLIED`, `FAILURE_ENCHANTMENT_MAX_AMOUNT`, `FAILURE_ENCHANTMENT_LEVEL_DIFF`, `FAILURE_ENCHANTMENT_TOO_MANY_ITEMS`, `FAILURE_PERMISSION_DISABLED`, `FAILURE_PERMISSION_ALREADY_HAVE`

### Provider Base Classes

| Class | Package | Purpose |
|---|---|---|
| `EconomyProvider` | `net.brcdev.shopgui.provider.economy` | Custom economy (abstract: `getName()`, `getBalance()`, `deposit()`, `withdraw()`) |
| `ItemProvider` | `net.brcdev.shopgui.provider.item` | Custom item type (abstract: `isValidItem()`, `loadItem()`, `compare()`) |
| `ExternalSpawnerProvider` | `net.brcdev.shopgui.spawner.external.provider` | Custom spawner (interface: `getName()`, `getSpawnerItem()`, `getSpawnerEntityType()`) |

### Enums

| Enum | Package | Values |
|---|---|---|
| `ShopItemType` | `net.brcdev.shopgui.shop.item` | `ITEM`, `PERMISSION`, `ENCHANTMENT`, `COMMAND`, `SPECIAL`, `SHOP_LINK`, `DUMMY` |
| `EconomyType` | `net.brcdev.shopgui.economy` | `CUSTOM`, `EXP`, `EXP_LEVELS`, `COINS_ENGINE`, `GEMS_ECONOMY`, `GRINGOTTS`, `MYSQL_TOKENS`, `PLAYER_POINTS`, `TOKEN_ENCHANT`, `TOKEN_MANAGER`, `VAULT`, `VOTING_PLUGIN` |
| `PriceModifierActionType` | `net.brcdev.shopgui.modifier` | `BUY`, `SELL`, `BOTH` |
| `ShopAction` | `net.brcdev.shopgui.shop.ShopManager` | `BUY`, `SELL`, `SELL_ALL` |

### Events

| Event | Package | Cancellable | Key Methods |
|---|---|---|---|
| `ShopPreTransactionEvent` | `net.brcdev.shopgui.event` | Yes | `getPlayer()`, `getShopItem()`, `getShopAction()`, `getPrice()`, `setPrice(double)`, `getAmount()`, `setAmount(int)` |
| `ShopPostTransactionEvent` | `net.brcdev.shopgui.event` | No | `getResult()` → `ShopTransactionResult` |
| `ShopGUIPlusPostEnableEvent` | `net.brcdev.shopgui.event` | No | (none — use as hook point for provider registration) |
| `ShopsPostLoadEvent` | `net.brcdev.shopgui.event` | No | (none — all shops now accessible) |
| `PlayerDataPostLoadEvent` | `net.brcdev.shopgui.event` | No | `getPlayer()`, `getPlayerData()` |
