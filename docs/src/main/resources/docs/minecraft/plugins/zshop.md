# zShop API Reference

Premium GUI shop plugin by Maxlego08 (uses zMenu under the hood). The API lets plugins look up shop items, query/modify prices, sell items programmatically, register custom economies, and listen for buy/sell events. Add `zShop` to `depend` or `softdepend` in plugin.yml.

> **Important:** The package is `fr.maxlego08.shop.api` (the original "shop" name), NOT `fr.maxlego08.zshop.api` despite the plugin being branded as zShop.

## Code Examples

### Getting the API

Two ways to obtain the `ShopManager` — via Bukkit's `ServicesManager` (preferred) or by casting the plugin instance:

```java
import fr.maxlego08.shop.api.ShopManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

// Preferred: services manager
RegisteredServiceProvider<ShopManager> provider =
        Bukkit.getServicesManager().getRegistration(ShopManager.class);

ShopManager shopManager = provider != null ? provider.getProvider() : null;
```

### Look Up a Shop Item

```java
import fr.maxlego08.shop.api.ShopManager;
import fr.maxlego08.shop.api.buttons.ItemButton;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.Optional;

ShopManager shopManager = /* ... */;

// By Material
Optional<ItemButton> byMat = shopManager.getItemButton(Material.DIAMOND);

// By material name string
Optional<ItemButton> byName = shopManager.getItemButton("DIAMOND");

// Match an ItemStack (player-aware — respects pricing modifiers)
Optional<ItemButton> matched = shopManager.getItemButton(player, itemStack);

// All loaded shop items
Collection<ItemButton> all = shopManager.getItemButtons();
```

### Get Buy/Sell Prices

```java
import fr.maxlego08.shop.api.buttons.ItemButton;
import org.bukkit.entity.Player;

ItemButton button = /* ... */;

// Base unit prices
double unitBuy = button.getUnitBuyPrice();
double unitSell = button.getUnitSellPrice();

// Bulk prices for an amount
double buy64 = button.getBuyPrice(64);
double sell64 = button.getSellPrice(64);

// Player-aware prices (with modifiers applied)
double buyForPlayer = button.getBuyPrice(player, 64);
double sellForPlayer = button.getSellPrice(player, 64);

// Formatted price strings
String formattedBuy = button.getBuyPriceFormat(player, 64);
String formattedSell = button.getSellPriceFormat(player, 64);

// Capabilities
boolean canBuy = button.canBuy();
boolean canSell = button.canSell();
int maxStack = button.getMaxStack();
```

### Open Shop GUIs Programmatically

```java
import fr.maxlego08.shop.api.ShopManager;
import fr.maxlego08.shop.api.buttons.ItemButton;
import fr.maxlego08.shop.api.buttons.ItemConfirmButton;
import org.bukkit.entity.Player;

ShopManager shopManager = /* ... */;
ItemButton button = /* ... */;

shopManager.openBuy(player, button, "default_buy_inventory");
shopManager.openSell(player, button, "default_sell_inventory");
shopManager.openSellInventory(player); // sell-all UI
```

### Sell Items Programmatically

```java
import fr.maxlego08.shop.api.ShopManager;
import org.bukkit.entity.Player;

ShopManager shopManager = /* ... */;

shopManager.sellAll(player);          // sell entire inventory
shopManager.sellAllHand(player);      // sell entire stack in hand
shopManager.sellHand(player, 16);     // sell 16 from hand
```

### Query Player Cache and Price Modifiers

```java
import fr.maxlego08.shop.api.PlayerCache;
import fr.maxlego08.shop.api.PriceModifier;
import fr.maxlego08.shop.api.PriceType;
import fr.maxlego08.shop.api.ShopManager;
import org.bukkit.entity.Player;

import java.util.Optional;

ShopManager shopManager = /* ... */;

// Per-player active modifier (e.g. permission-based)
Optional<PriceModifier> mod = shopManager.getPriceModifier(player, PriceType.BUY);

// Player's currently selected item / amount in shop UI
PlayerCache cache = shopManager.getCache(player);
```

### Register a Custom Economy

```java
import fr.maxlego08.shop.api.economy.EconomyManager;
import fr.maxlego08.shop.api.economy.ShopEconomy;
import fr.maxlego08.shop.api.event.events.ZShopEconomyRegisterEvent;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MyEconomyHook implements Listener {

    @EventHandler
    public void onEconomyRegister(ZShopEconomyRegisterEvent event) {
        // Fired when zShop is loading economies — register here
        event.getManager().registerEconomy(new GemsEconomy());
    }
}

public class GemsEconomy implements ShopEconomy {

    @Override
    public String getName() {
        return "gems";
    }

    @Override
    public String getCurrency() {
        return " gems";
    }

    @Override
    public double getMoney(OfflinePlayer player) {
        return getGemsBalance(player);
    }

    @Override
    public boolean hasMoney(OfflinePlayer player, double price) {
        return getMoney(player) >= price;
    }

    @Override
    public void depositMoney(OfflinePlayer player, double value, String reason) {
        addGems(player, value);
    }

    @Override
    public void withdrawMoney(OfflinePlayer player, double value, String reason) {
        removeGems(player, value);
    }

    @Override
    public String getDenyMessage() {
        return "&cYou don't have enough gems!";
    }
}
```

### Listen for Buy/Sell Events

```java
import fr.maxlego08.shop.api.buttons.ItemButton;
import fr.maxlego08.shop.api.event.ShopAction;
import fr.maxlego08.shop.api.event.events.ZShopBuyEvent;
import fr.maxlego08.shop.api.event.events.ZShopSellEvent;
import fr.maxlego08.shop.api.event.events.ZShopSellAllEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.List;

public class ShopListener implements Listener {

    @EventHandler
    public void onBuy(ZShopBuyEvent event) {
        // Cancellable
        Player player = event.getPlayer();
        ItemButton item = event.getItemButton();
        int amount = event.getAmount();
        double price = event.getPrice();

        // Modify the price
        if (player.hasPermission("vip.discount")) {
            event.setPrice(price * 0.8);
        }

        // Modify amount or limits
        // event.setAmount(amount * 2);
        // event.setServerLimit(event.getServerLimit() + 100);
        // event.setPlayerLimit(event.getPlayerLimit() + 10);

        // Cancel
        // event.setCancelled(true);
    }

    @EventHandler
    public void onSell(ZShopSellEvent event) {
        // Cancellable — same setters as ZShopBuyEvent
        Player player = event.getPlayer();
        double price = event.getPrice();
        event.setPrice(price * 1.5); // 50% bonus
    }

    @EventHandler
    public void onSellAll(ZShopSellAllEvent event) {
        // Cancellable
        Player player = event.getPlayer();
        List<ShopAction> actions = event.getShopActions();
    }
}
```

## API Reference (Trimmed)

### `fr.maxlego08.shop.api.ShopManager`

| Return | Method | Description |
|---|---|---|
| `Optional<ItemButton>` | `getItemButton(Material)` | Lookup by material |
| `Optional<ItemButton>` | `getItemButton(String)` | Lookup by material name |
| `Optional<ItemButton>` | `getItemButton(Player, ItemStack)` | Match item, player-aware |
| `Collection<ItemButton>` | `getItemButtons()` | All shop items |
| `void` | `openBuy(Player, ItemButton, String inventoryName)` | Open buy GUI |
| `void` | `openSell(Player, ItemButton, String inventoryName)` | Open sell GUI |
| `void` | `openConfirm(Player, ItemConfirmButton, String inventoryName)` | Open confirm GUI |
| `void` | `openSellInventory(Player)` | Open sell-all UI |
| `void` | `sellAll(Player)` | Sell entire inventory |
| `void` | `sellHand(Player, int amount)` | Sell N from hand |
| `void` | `sellAllHand(Player)` | Sell entire stack in hand |
| `PlayerCache` | `getCache(Player)` | Player's UI state |
| `Optional<PriceModifier>` | `getPriceModifier(Player, PriceType)` | Active modifier |
| `String` | `transformPrice(double)` | Format price string |
| `List<String>` | `getDefaultLore()` | Default item lore |

### `fr.maxlego08.shop.api.buttons.ItemButton`

| Return | Method | Description |
|---|---|---|
| `double` | `getUnitBuyPrice()` | Base buy price (1 unit) |
| `double` | `getUnitSellPrice()` | Base sell price (1 unit) |
| `double` | `getBuyPrice(int amount)` | Bulk buy price |
| `double` | `getSellPrice(int amount)` | Bulk sell price |
| `double` | `getBuyPrice(Player, int amount)` | Buy with modifiers |
| `double` | `getSellPrice(Player, int amount)` | Sell with modifiers |
| `String` | `getBuyPriceFormat(Player, int)` | Formatted buy string |
| `String` | `getSellPriceFormat(Player, int)` | Formatted sell string |
| `boolean` | `canBuy()` | Buyable |
| `boolean` | `canSell()` | Sellable |
| `int` | `getMaxStack()` | Max purchase amount |
| `ShopEconomy` | `getEconomy()` | Currency used |
| `Optional<Limit>` | `getServerBuyLimit()` | Server-wide buy limit |
| `Optional<Limit>` | `getServerSellLimit()` | Server-wide sell limit |
| `Optional<Limit>` | `getPlayerBuyLimit()` | Per-player buy limit |
| `Optional<Limit>` | `getPlayerSellLimit()` | Per-player sell limit |
| `boolean` | `affectByPriceModifier()` | Subject to modifiers |
| `boolean` | `giveItem()` | Gives the item on buy |
| `boolean` | `isUnStackable()` | Treat as unstackable |
| `String` | `getMob()` | Mob ID (for spawner items) |

### `fr.maxlego08.shop.api.economy.EconomyManager`

| Return | Method | Description |
|---|---|---|
| `Collection<ShopEconomy>` | `getEconomies()` | All registered |
| `boolean` | `registerEconomy(ShopEconomy)` | Register custom |
| `boolean` | `removeEconomy(ShopEconomy)` | Unregister |
| `Optional<ShopEconomy>` | `getEconomy(String name)` | Lookup by name |
| `void` | `loadEconomies()` | Reload all |

### `fr.maxlego08.shop.api.economy.ShopEconomy` (interface)

Implement to register a custom currency.

| Return | Method | Required |
|---|---|---|
| `String` | `getName()` | Yes — unique name |
| `String` | `getCurrency()` | Yes — display suffix |
| `String` | `getDenyMessage()` | Yes |
| `double` | `getMoney(OfflinePlayer)` | Yes |
| `boolean` | `hasMoney(OfflinePlayer, double)` | Yes |
| `void` | `depositMoney(OfflinePlayer, double, String reason)` | Yes |
| `void` | `withdrawMoney(OfflinePlayer, double, String reason)` | Yes |
| `String` | `format(String priceAsString, double amount)` | Default impl |

### `fr.maxlego08.shop.api.PlayerCache` (interface)

| Return | Method | Description |
|---|---|---|
| `ItemButton` | `getItemButton()` | Currently selected item |
| `EconomyAction` | `getEconomyAction()` | BUY or SELL |
| `int` | `getAmount()` | Selected amount |
| `PriceModifierCache` | `getPriceModifier(PriceType)` | Modifier cache |

### `fr.maxlego08.shop.api.PriceType` (enum)

`BUY`, `SELL`, `BOTH`

### Events (`fr.maxlego08.shop.api.event.events`)

All extend `CancelledShopEvent` (cancellable) except `ZShopEconomyRegisterEvent` which extends `ShopEvent` (not cancellable).

| Event | Cancellable | Constructor | Key Methods |
|---|---|---|---|
| `ZShopBuyEvent` | Yes | `(Player, ItemButton, int amount, double price, int serverLimit, int playerLimit)` | `getPlayer()`, `getItemButton()`, `getAmount()`, `setAmount(int)`, `getPrice()`, `setPrice(double)`, `getServerLimit()`, `setServerLimit(int)`, `getPlayerLimit()`, `setPlayerLimit(int)` |
| `ZShopSellEvent` | Yes | Same as `ZShopBuyEvent` | Same as `ZShopBuyEvent` |
| `ZShopSellAllEvent` | Yes | `(Player, List<ShopAction>)` | `getPlayer()`, `getShopActions()` |
| `ZShopEconomyRegisterEvent` | No | `(EconomyManager)` | `getManager()` — register custom economies here |
