# EconomyShopGUI API

Hook into EconomyShopGUI to look up shop item prices, manage stock/sell limits, listen to buy/sell transactions, and register custom economy providers.

## Getting a ShopItem and its Price

```java
import me.gypopo.economyshopgui.api.EconomyShopGUIHook;
import me.gypopo.economyshopgui.api.objects.SellPrice;
import me.gypopo.economyshopgui.api.objects.BuyPrice;
import me.gypopo.economyshopgui.objects.ShopItem;
import me.gypopo.economyshopgui.util.EcoType;
import me.gypopo.economyshopgui.util.EconomyType;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Map;
import java.util.Optional;

public class PriceChecker {

    // Recommended approach (v6.3+) - validates permissions, limits, and stock automatically
    public double getSellPrice(Player player, ItemStack item) {
        Optional<SellPrice> optional = EconomyShopGUIHook.getSellPrice(player, item);
        if (!optional.isPresent()) return -1;

        SellPrice price = optional.get();
        price.updateLimits(); // Apply stock/sell limit adjustments

        // Single economy type price
        return price.getPrice(EconomyType.getFromString("VAULT"));
        // Or get all prices: Map<EcoType, Double> prices = price.getPrices();
    }

    public double getBuyPrice(Player player, ItemStack item) {
        Optional<BuyPrice> optional = EconomyShopGUIHook.getBuyPrice(player, item);
        if (!optional.isPresent()) return -1;

        BuyPrice price = optional.get();
        price.updateLimits();
        return price.getPrice(EconomyType.getFromString("VAULT"));
    }

    // Manual approach - more control but you handle validation yourself
    public double getManualSellPrice(Player player, ItemStack item) {
        ShopItem shopItem = EconomyShopGUIHook.getShopItem(player, item);
        if (shopItem == null) return -1; // Item not in shop or player lacks permission

        return EconomyShopGUIHook.getItemSellPrice(shopItem, item, player);
    }

    public double getManualBuyPrice(Player player, int amount) {
        ShopItem shopItem = EconomyShopGUIHook.getShopItem(new ItemStack(Material.DIAMOND));
        if (shopItem == null) return -1;

        return EconomyShopGUIHook.getItemBuyPrice(shopItem, player, amount);
    }
}
```

## Bulk Sell Prices for Multiple Items

```java
import me.gypopo.economyshopgui.api.EconomyShopGUIHook;
import me.gypopo.economyshopgui.api.objects.SellPrices;
import me.gypopo.economyshopgui.util.EcoType;
import me.gypopo.economyshopgui.util.EconomyType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class BulkSellExample {

    public double getTotalSellValue(Player player, ItemStack[] items) {
        // Get aggregated sell prices for multiple items at once
        SellPrices prices = EconomyShopGUIHook.getSellPrices(player, items);
        if (prices.isEmpty()) return 0;

        return prices.getPrice(EconomyType.getFromString("VAULT"));
    }

    public double getCutSellValue(Player player, ItemStack[] items) {
        // Adjusts stack amounts to fit within sell limits; allowModify=true modifies the stacks in place
        SellPrices prices = EconomyShopGUIHook.getCutSellPrices(player, items, true);
        if (prices.isEmpty()) return 0;

        Map<EcoType, Double> allPrices = prices.getPrices();
        return allPrices.getOrDefault(EconomyType.getFromString("VAULT"), 0.0);
    }
}
```

## Multi-Currency Price Handling

```java
import me.gypopo.economyshopgui.api.EconomyShopGUIHook;
import me.gypopo.economyshopgui.api.prices.AdvancedBuyPrice;
import me.gypopo.economyshopgui.api.prices.AdvancedSellPrice;
import me.gypopo.economyshopgui.objects.ShopItem;
import me.gypopo.economyshopgui.util.EcoType;
import me.gypopo.economyshopgui.util.EconomyType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class MultiCurrencyExample {

    public Map<EcoType, Double> getAllBuyPrices(Player player, ShopItem shopItem, int amount) {
        Map<EcoType, Double> buyPrices = new HashMap<>();

        if (EconomyShopGUIHook.hasMultipleBuyPrices(shopItem)) {
            AdvancedBuyPrice advanced = EconomyShopGUIHook.getMultipleBuyPrices(shopItem);
            buyPrices.putAll(advanced.getBuyPrices(null, player, amount));
        } else {
            double price = EconomyShopGUIHook.getItemBuyPrice(shopItem, player, amount);
            buyPrices.put(shopItem.getEcoType(), price);
        }
        return buyPrices;
    }

    public Map<EcoType, Double> getAllSellPrices(Player player, ShopItem shopItem, ItemStack item) {
        Map<EcoType, Double> sellPrices = new HashMap<>();

        if (EconomyShopGUIHook.hasMultipleSellPrices(shopItem)) {
            AdvancedSellPrice advanced = EconomyShopGUIHook.getMultipleSellPrices(shopItem);
            sellPrices.putAll(advanced.getSellPrices(null, player, item));
        } else {
            double price = EconomyShopGUIHook.getItemSellPrice(shopItem, item, player);
            sellPrices.put(shopItem.getEcoType(), price);
        }
        return sellPrices;
    }
}
```

## Stock and Sell Limit Checks

```java
import me.gypopo.economyshopgui.api.EconomyShopGUIHook;
import me.gypopo.economyshopgui.objects.ShopItem;
import org.bukkit.entity.Player;

import java.util.UUID;

public class StockChecker {

    // Check if a player can buy/sell a given amount
    public boolean canBuy(Player player, ShopItem shopItem, int amount) {
        if (!EconomyShopGUIHook.isBuyAble(shopItem)) return false;
        if (shopItem.isMaxBuy(amount)) return false; // Exceeds max per-transaction buy limit

        if (shopItem.getLimitedStockMode() != 0) {
            int stock = EconomyShopGUIHook.getItemStock(shopItem, player.getUniqueId());
            if (amount > stock) return false; // Not enough stock
        }
        return true;
    }

    public boolean canSell(Player player, ShopItem shopItem, int amount) {
        if (!EconomyShopGUIHook.isSellAble(shopItem)) return false;
        if (shopItem.isMaxSell(amount)) return false; // Exceeds max per-transaction sell limit

        if (shopItem.getLimitedSellMode() != 0) {
            int limit = EconomyShopGUIHook.getSellLimit(shopItem, player.getUniqueId());
            if (amount > limit) return false; // Sell limit reached
        }
        return true;
    }

    // Update stock/limits AFTER a successful buy transaction
    public void afterBuy(ShopItem shopItem, Player player, int amount) {
        if (shopItem.getLimitedStockMode() != 0)
            EconomyShopGUIHook.buyItemStock(shopItem, player.getUniqueId(), amount);
        if (shopItem.isDynamicPricing())
            EconomyShopGUIHook.buyItem(shopItem, amount);
    }

    // Update stock/limits AFTER a successful sell transaction
    public void afterSell(ShopItem shopItem, Player player, int amount) {
        if (shopItem.isRefillStock())
            EconomyShopGUIHook.sellItemStock(shopItem, player.getUniqueId(), amount);
        if (shopItem.getLimitedSellMode() != 0)
            EconomyShopGUIHook.sellItemLimit(shopItem, player.getUniqueId(), amount);
        if (shopItem.isDynamicPricing())
            EconomyShopGUIHook.sellItem(shopItem, amount);
    }

    public long getStockRestockTimeMs(ShopItem shopItem, UUID playerUUID) {
        return EconomyShopGUIHook.getItemStockRestockTime(shopItem, playerUUID);
    }

    public long getSellLimitRestockTimeMs(ShopItem shopItem, UUID playerUUID) {
        return EconomyShopGUIHook.getSellLimitRestockTime(shopItem, playerUUID);
    }
}
```

## Browsing Shop Sections and Items

```java
import me.gypopo.economyshopgui.api.EconomyShopGUIHook;
import me.gypopo.economyshopgui.objects.ShopItem;
import me.gypopo.economyshopgui.objects.shops.ShopSection;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ShopBrowser {

    public void listAllSections() {
        List<String> sectionNames = EconomyShopGUIHook.getShopSections();
        Map<String, ShopSection> sections = EconomyShopGUIHook.getSections();

        for (Map.Entry<String, ShopSection> entry : sections.entrySet()) {
            ShopSection section = entry.getValue();
            Collection<ShopItem> items = section.getShopItems();
            int pages = section.getPages();
        }
    }

    public void openSectionForPlayer(Player player, String sectionName) {
        ShopSection section = EconomyShopGUIHook.getShopSection(sectionName);
        if (section == null) return;

        // boolean param = whether to play sound; optional String = sub-section
        section.openShopSection(player, true);
        // Or open a specific page: section.openShopSection(player, 2, true);
    }

    public ShopItem findItemByPath(String configPath) {
        // configPath is the path in the shop config, e.g. "blocks.COBBLESTONE"
        return EconomyShopGUIHook.getShopItem(configPath);
    }
}
```

## Listening to Transactions (PreTransactionEvent / PostTransactionEvent)

```java
import me.gypopo.economyshopgui.api.events.PreTransactionEvent;
import me.gypopo.economyshopgui.api.events.PostTransactionEvent;
import me.gypopo.economyshopgui.objects.ShopItem;
import me.gypopo.economyshopgui.util.EcoType;
import me.gypopo.economyshopgui.util.Transaction;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Map;

public class TransactionListener implements Listener {

    // Called BEFORE the transaction completes - can cancel or modify price
    @EventHandler
    public void onPreTransaction(PreTransactionEvent event) {
        Player player = event.getPlayer();
        ShopItem shopItem = event.getShopItem();
        Transaction.Type type = event.getTransactionType();
        int amount = event.getAmount();
        double price = event.getPrice();
        double originalPrice = event.getOriginalPrice();

        // Apply a 10% discount for buy transactions
        if (type == Transaction.Type.BUY_SCREEN || type == Transaction.Type.BUY_STACKS_SCREEN) {
            if (player.hasPermission("shop.discount")) {
                event.setPrice(price * 0.9);
            }
        }

        // Cancel sell transactions for a specific item
        // event.setCancelled(true);

        // For multi-item transactions (sell-all, etc.)
        Map<ShopItem, Integer> items = event.getItems(); // Empty for single-item transactions
        Map<EcoType, Double> prices = event.getPrices();  // Populated for multi-item transactions
    }

    // Called AFTER the transaction completes - read-only, for logging/rewards
    @EventHandler
    public void onPostTransaction(PostTransactionEvent event) {
        Player player = event.getPlayer();
        Transaction.Type type = event.getTransactionType();
        Transaction.Result result = event.getTransactionResult();
        double finalPrice = event.getPrice();
        int amount = event.getAmount();

        if (result == Transaction.Result.SUCCESS) {
            // Log or reward the player
        }

        // For multi-item transactions
        Map<ShopItem, Integer> items = event.getItems();
        Map<EcoType, Double> prices = event.getPrices();
    }
}
```

## Using the Economy Provider

```java
import me.gypopo.economyshopgui.api.EconomyShopGUIHook;
import me.gypopo.economyshopgui.providers.EconomyProvider;
import me.gypopo.economyshopgui.objects.ShopItem;
import me.gypopo.economyshopgui.util.EcoType;
import me.gypopo.economyshopgui.util.EconomyType;
import org.bukkit.OfflinePlayer;

public class EconomyExample {

    public void manipulateBalance(OfflinePlayer player, ShopItem shopItem) {
        EcoType type = shopItem.getEcoType();
        EconomyProvider provider = EconomyShopGUIHook.getEcon(type);

        double balance = provider.getBalance(player);
        provider.depositBalance(player, 100.0);
        provider.withdrawBalance(player, 50.0);

        String formatted = provider.formatPrice(balance);
        String currencyName = provider.getSingular(); // e.g. "Dollar"
        String pluralName = provider.getPlural();     // e.g. "Dollars"
    }

    public EconomyProvider getVaultProvider() {
        return EconomyShopGUIHook.getEcon(EconomyType.getFromString("VAULT"));
    }
}
```

## Registering a Custom Economy Provider

```java
import me.gypopo.economyshopgui.api.events.EconomyPreLoadEvent;
import me.gypopo.economyshopgui.api.objects.ExternalEconomy;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class CustomEconomyListener implements Listener {

    // Fires when EconomyShopGUI initializes economies (startup + /sreload)
    @EventHandler
    public void onEconomyPreLoad(EconomyPreLoadEvent event) {
        event.registerExternal(new MyCustomEconomy());
    }
}

// After registering, use in shop configs: economy: EXTERNAL:MyTokens
// If getCurrencyName() is overridden: economy: EXTERNAL:MyTokens:gems
class MyCustomEconomy extends ExternalEconomy {
    @Override public String getName() { return "MyTokens"; }
    @Override public String getSingular() { return "token"; }
    @Override public String getPlural() { return "tokens"; }
    @Override public String getFriendly() { return "Tokens"; }
    @Override public boolean isDecimal() { return false; }

    @Override
    public double getBalance(OfflinePlayer player) {
        // Return the player's token balance from your system
        return 0;
    }

    @Override
    public void depositBalance(OfflinePlayer player, double amount) {
        // Add tokens to the player
    }

    @Override
    public void withdrawBalance(OfflinePlayer player, double amount) {
        // Remove tokens from the player
    }
}
```

## Waiting for Shop Items to Load

```java
import me.gypopo.economyshopgui.api.events.ShopItemsLoadEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ShopLoadListener implements Listener {

    // Fired when all shop items have been preloaded on startup
    // Only interact with shop items AFTER this event fires
    @EventHandler
    public void onShopItemsLoad(ShopItemsLoadEvent event) {
        // Safe to call EconomyShopGUIHook methods here
    }
}
```

## API Reference

### me.gypopo.economyshopgui.api.EconomyShopGUIHook
| Method | Returns |
|---|---|
| `getShopItem(ItemStack)` | `me.gypopo.economyshopgui.objects.ShopItem` |
| `getShopItem(Player, ItemStack)` | `me.gypopo.economyshopgui.objects.ShopItem` |
| `getShopItem(String)` | `me.gypopo.economyshopgui.objects.ShopItem` |
| `getItemSellPrice(ShopItem, ItemStack)` | `Double` |
| `getItemSellPrice(ShopItem, ItemStack, Player)` | `Double` |
| `getItemSellPrice(ShopItem, ItemStack, Player, int, int)` | `Double` |
| `getItemSellPrice(ShopItem, ItemStack, int, int)` | `Double` |
| `getItemBuyPrice(ShopItem, int)` | `double` |
| `getItemBuyPrice(ShopItem, Player, int)` | `double` |
| `getSellPrice(OfflinePlayer, ItemStack)` | `Optional<me.gypopo.economyshopgui.api.objects.SellPrice>` |
| `getSellPrices(OfflinePlayer, ItemStack[])` | `me.gypopo.economyshopgui.api.objects.SellPrices` |
| `getCutSellPrices(OfflinePlayer, ItemStack[], boolean)` | `me.gypopo.economyshopgui.api.objects.SellPrices` |
| `getBuyPrice(OfflinePlayer, ItemStack)` | `Optional<me.gypopo.economyshopgui.api.objects.BuyPrice>` |
| `isSellAble(ShopItem)` | `boolean` |
| `isBuyAble(ShopItem)` | `boolean` |
| `hasMultipleBuyPrices(ShopItem)` | `boolean` |
| `getMultipleBuyPrices(ShopItem)` | `me.gypopo.economyshopgui.api.prices.AdvancedBuyPrice` |
| `hasMultipleSellPrices(ShopItem)` | `boolean` |
| `getMultipleSellPrices(ShopItem)` | `me.gypopo.economyshopgui.api.prices.AdvancedSellPrice` |
| `getEcon(EcoType)` | `me.gypopo.economyshopgui.providers.EconomyProvider` |
| `getShopSection(String)` | `me.gypopo.economyshopgui.objects.shops.ShopSection` |
| `getShopSections()` | `List<String>` |
| `getSections()` | `Map<String, me.gypopo.economyshopgui.objects.shops.ShopSection>` |
| `getItemStock(ShopItem, UUID)` | `int` |
| `getItemStockRestockTime(ShopItem, UUID)` | `Long` |
| `buyItemStock(ShopItem, UUID, int)` | `int` |
| `sellItemStock(ShopItem, UUID, int)` | `void` |
| `getSellLimit(ShopItem, UUID)` | `int` |
| `getSellLimitRestockTime(ShopItem, UUID)` | `Long` |
| `sellItemLimit(ShopItem, UUID, int)` | `int` |
| `buyItem(ShopItem, int)` | `void` |
| `buyItem(ItemStack, int)` | `void` |
| `sellItem(ShopItem, int)` | `void` |
| `sellItem(ItemStack, int)` | `void` |
| `hasPermissions(ShopItem, Player)` | `boolean` |
| `hasPermissions(ShopItem, Player, String)` | `boolean` |

### me.gypopo.economyshopgui.objects.ShopItem
| Method | Returns |
|---|---|
| `getShopItem()` | `ItemStack` |
| `getItemToGive()` | `ItemStack` |
| `getEcoType()` | `me.gypopo.economyshopgui.util.EcoType` |
| `getItemPath()` | `String` |
| `getStackSize()` | `int` |
| `isDynamicPricing()` | `boolean` |
| `isHidden()` | `boolean` |
| `isLinked()` | `boolean` |
| `isDisplayItem()` | `boolean` |
| `isRefillStock()` | `boolean` |
| `hasItemError()` | `boolean` |
| `getLimitedStockMode()` | `int` |
| `getLimitedSellMode()` | `int` |
| `getMinBuy()` | `int` |
| `getMaxBuy()` | `int` |
| `getMinSell()` | `int` |
| `getMaxSell()` | `int` |
| `isMinBuy(int)` | `boolean` |
| `isMaxBuy(int)` | `boolean` |
| `isMinSell(int)` | `boolean` |
| `isMaxSell(int)` | `boolean` |
| `getSubSection()` | `String` |
| `hasSeasonModifier(String)` | `boolean` |

### me.gypopo.economyshopgui.objects.shops.ShopSection (Interface)
| Method | Returns |
|---|---|
| `openShopSection(Player, boolean)` | `void` |
| `openShopSection(Player, boolean, String)` | `void` |
| `openShopSection(Player, int, boolean)` | `void` |
| `openShopSection(Player, int, boolean, String)` | `void` |
| `getShopItems()` | `Collection<me.gypopo.economyshopgui.objects.ShopItem>` |
| `getShopItem(String)` | `me.gypopo.economyshopgui.objects.ShopItem` |
| `getSection()` | `String` |
| `getType()` | `me.gypopo.economyshopgui.objects.shops.ShopType` |
| `getPages()` | `int` |
| `getShopPageItems(int)` | `me.gypopo.economyshopgui.objects.ShopPageItems` |
| `getPageForShopItem(String)` | `int` |
| `getItemLocs()` | `List<String>` |
| `getClickCommands()` | `List<String>` |
| `getClickAction(ClickType)` | `me.gypopo.economyshopgui.objects.mappings.ClickAction` |
| `isHidden()` | `boolean` |
| `isSubSection()` | `boolean` |
| `isCommandItem()` | `boolean` |
| `isCloseMenu()` | `boolean` |
| `reloadItem(String)` | `void` |

### me.gypopo.economyshopgui.api.events.PreTransactionEvent
Extends `me.gypopo.economyshopgui.api.events.CustomEvent`, implements `org.bukkit.event.Cancellable`.

| Method | Returns |
|---|---|
| `getPlayer()` | `Player` |
| `getShopItem()` | `me.gypopo.economyshopgui.objects.ShopItem` |
| `getItems()` | `Map<me.gypopo.economyshopgui.objects.ShopItem, Integer>` |
| `getAmount()` | `int` |
| `getPrice()` | `double` |
| `getOriginalPrice()` | `double` |
| `setPrice(double)` | `void` |
| `getPrices()` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |
| `getOriginalPrices()` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |
| `getTransactionType()` | `me.gypopo.economyshopgui.util.Transaction.Type` |
| `isCancelled()` | `boolean` |
| `setCancelled(boolean)` | `void` |

### me.gypopo.economyshopgui.api.events.PostTransactionEvent
Extends `me.gypopo.economyshopgui.api.events.CustomEvent`.

| Method | Returns |
|---|---|
| `getPlayer()` | `Player` |
| `getShopItem()` | `me.gypopo.economyshopgui.objects.ShopItem` |
| `getItems()` | `Map<me.gypopo.economyshopgui.objects.ShopItem, Integer>` |
| `getAmount()` | `int` |
| `getPrice()` | `double` |
| `getPrices()` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |
| `getTransactionType()` | `me.gypopo.economyshopgui.util.Transaction.Type` |
| `getTransactionResult()` | `me.gypopo.economyshopgui.util.Transaction.Result` |

### me.gypopo.economyshopgui.api.events.EconomyPreLoadEvent
| Method | Returns |
|---|---|
| `registerExternal(me.gypopo.economyshopgui.api.objects.ExternalEconomy)` | `void` |

### me.gypopo.economyshopgui.api.objects.BuyPrice
| Method | Returns |
|---|---|
| `getPlayer()` | `OfflinePlayer` |
| `getShopItem()` | `me.gypopo.economyshopgui.objects.ShopItem` |
| `getAmount()` | `int` |
| `getPrice(me.gypopo.economyshopgui.util.EcoType)` | `double` |
| `getPrices()` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |
| `updateLimits()` | `me.gypopo.economyshopgui.api.objects.BuyPrice` |

### me.gypopo.economyshopgui.api.objects.SellPrice
| Method | Returns |
|---|---|
| `getPlayer()` | `OfflinePlayer` |
| `getShopItem()` | `me.gypopo.economyshopgui.objects.ShopItem` |
| `getAmount()` | `int` |
| `getPrice(me.gypopo.economyshopgui.util.EcoType)` | `double` |
| `getPrices()` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |
| `updateLimits()` | `me.gypopo.economyshopgui.api.objects.SellPrice` |

### me.gypopo.economyshopgui.api.objects.SellPrices
| Method | Returns |
|---|---|
| `getPlayer()` | `OfflinePlayer` |
| `getItems()` | `Map<me.gypopo.economyshopgui.objects.ShopItem, Integer>` |
| `isEmpty()` | `boolean` |
| `getPrice(me.gypopo.economyshopgui.util.EcoType)` | `double` |
| `getPrices()` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |
| `updateLimits()` | `me.gypopo.economyshopgui.api.objects.SellPrices` |

### me.gypopo.economyshopgui.api.prices.AdvancedBuyPrice
| Method | Returns |
|---|---|
| `isBuyAble()` | `boolean` |
| `requireAll()` | `boolean` |
| `getBuyTypes()` | `List<me.gypopo.economyshopgui.util.EcoType>` |
| `getBuyPrices(EcoType, int)` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |
| `getBuyPrices(EcoType, Player, int)` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |

### me.gypopo.economyshopgui.api.prices.AdvancedSellPrice
| Method | Returns |
|---|---|
| `isSellAble()` | `boolean` |
| `giveAll()` | `boolean` |
| `getSellTypes()` | `List<me.gypopo.economyshopgui.util.EcoType>` |
| `getSellPrices(EcoType, ItemStack)` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |
| `getSellPrices(EcoType, ItemStack, int, int)` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |
| `getSellPrices(EcoType, Player, ItemStack)` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |
| `getSellPrices(EcoType, Player, ItemStack, int, int)` | `Map<me.gypopo.economyshopgui.util.EcoType, Double>` |

### me.gypopo.economyshopgui.providers.EconomyProvider (Interface)
| Method | Returns |
|---|---|
| `getBalance(OfflinePlayer)` | `double` |
| `depositBalance(OfflinePlayer, double)` | `void` |
| `withdrawBalance(OfflinePlayer, double)` | `void` |
| `getType()` | `me.gypopo.economyshopgui.util.EcoType` |
| `formatPrice(double)` | `String` |
| `getSingular()` | `String` |
| `getPlural()` | `String` |
| `getFriendly()` | `String` |
| `isDecimal()` | `boolean` |

### me.gypopo.economyshopgui.util.EcoType
| Method | Returns |
|---|---|
| `getType()` | `me.gypopo.economyshopgui.util.EconomyType` |
| `getCurrency()` | `String` |

### me.gypopo.economyshopgui.util.EconomyType (Enum)
Constants: `VAULT`, `EXP`, `LEVELS`, `ITEM`, `PLAYER_POINTS`, `GEMS_ECONOMY`, `ULTRA_ECONOMY`, `COINS_ENGINE`, `ECOBITS`, `VOTING_PLUGIN`, `EXTERNAL`

| Method | Returns |
|---|---|
| `getFromString(String)` | `me.gypopo.economyshopgui.util.EcoType` |
| `getName()` | `String` |

### me.gypopo.economyshopgui.util.Transaction.Type (Enum)
Constants: `BUY_SCREEN`, `BUY_STACKS_SCREEN`, `SELL_SCREEN`, `SELL_GUI_SCREEN`, `SELL_ALL_SCREEN`, `SELL_ALL_COMMAND`, `QUICK_BUY`, `QUICK_SELL`, `SHOPSTAND_BUY_SCREEN`, `SHOPSTAND_SELL_SCREEN`, `AUTO_SELL_CHEST`

| Method | Returns |
|---|---|
| `getName()` | `String` |
| `getMode()` | `String` |

### me.gypopo.economyshopgui.util.Transaction.Result (Enum)
Constants: `SUCCESS`, `SUCCESS_COMMANDS_EXECUTED`, `NOT_ALL_ITEMS_ADDED`, `CANT_STORE_PAYMENT`, `NOT_ENOUGH_SPACE`, `INSUFFICIENT_FUNDS`, `NO_INVENTORY_SPACE`, `NEGATIVE_ITEM_PRICE`, `TRANSACTION_CANCELLED`, `NO_ITEMS_FOUND`, `NO_ITEM_STOCK_LEFT`, `HIGHER_LEVEL_REQUIRED`, `REACHED_SELL_LIMIT`, `NOT_ENOUGH_ITEMS`

### me.gypopo.economyshopgui.util.Transaction.Mode (Enum)
Constants: `BUY`, `SELL`

| Method | Returns |
|---|---|
| `getFromType(me.gypopo.economyshopgui.util.Transaction.Type)` | `me.gypopo.economyshopgui.util.Transaction.Mode` |
| `getName()` | `String` |

### me.gypopo.economyshopgui.objects.shops.ShopType (Enum)
Constants: `CATEGORY`, `ROTATING`

### me.gypopo.economyshopgui.objects.mappings.ClickAction (Enum)
Constants: `BUY`, `SELL`, `SELL_ALL`, `GUI_EDITOR`

### me.gypopo.economyshopgui.api.objects.ExternalEconomy (Abstract)
Extends `me.gypopo.economyshopgui.providers.economys.ExternalEconomyProvider`.

| Method | Returns |
|---|---|
| `getName()` | `String` |
| `getSingular()` | `String` |
| `getPlural()` | `String` |
| `getFriendly()` | `String` |
| `isDecimal()` | `boolean` |
| `getBalance(OfflinePlayer)` | `double` |
| `depositBalance(OfflinePlayer, double)` | `void` |
| `withdrawBalance(OfflinePlayer, double)` | `void` |
