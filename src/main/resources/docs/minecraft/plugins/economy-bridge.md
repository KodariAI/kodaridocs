# economy-bridge-1.2.1

Lightweight library plugin providing a unified static API to handle multiple currency plugins (Vault, CoinsEngine, UltraEconomy, PlayerPoints, BeastTokens, EliteMobs, VotingPlugin) and custom item plugins (ItemsAdder, Nexo, Oraxen, MMOItems, ExecutableItems) with a few lines of code.

## Currency Operations via EconomyBridge

All currency operations go through the static `EconomyBridge` class. Currency IDs: `"vault"`, `"xp_levels"`, `"xp_points"`, `"player_points"`, `"beast_tokens"`, `"voting_plugin"`, `"elite_mobs"`, `"coinsengine_<name>"`, `"ultraeconomy_<name>"`.

```java
import su.nightexpress.economybridge.EconomyBridge;
import su.nightexpress.economybridge.api.Currency;
import org.bukkit.entity.Player;
import java.util.UUID;
import java.util.Set;

// --- Check if any economy / specific currency is available ---
boolean hasAnyEconomy = EconomyBridge.hasEconomy();         // Vault economy present
boolean hasAnyCurrency = EconomyBridge.hasCurrency();        // any currency registered
boolean hasCoins = EconomyBridge.hasCurrency("coinsengine_coins"); // specific currency
boolean disabled = EconomyBridge.isDisabled("vault");        // check if disabled in config

// --- Get balance ---
Player player = /* ... */;
double vaultBal = EconomyBridge.getEconomyBalance(player);       // Vault shorthand
double vaultBalUuid = EconomyBridge.getEconomyBalance(player.getUniqueId());
double coinsBal = EconomyBridge.getBalance(player, "coinsengine_coins");
double coinsBal2 = EconomyBridge.getBalance(player.getUniqueId(), "coinsengine_coins");

// --- Check affordability ---
boolean canAfford = EconomyBridge.hasEnough(player, "vault", 100.0);
boolean canAffordUuid = EconomyBridge.hasEnough(player.getUniqueId(), "coinsengine_coins", 50.0);

// --- Deposit (add funds) ---
boolean depositOk = EconomyBridge.deposit(player, "vault", 250.0);
boolean depositOk2 = EconomyBridge.deposit(player.getUniqueId(), "coinsengine_coins", 100.0);
boolean depositVault = EconomyBridge.depositEconomy(player, 250.0); // Vault shorthand
boolean depositVaultUuid = EconomyBridge.depositEconomy(player.getUniqueId(), 250.0);

// --- Withdraw (remove funds) ---
boolean withdrawOk = EconomyBridge.withdraw(player, "vault", 50.0);
boolean withdrawOk2 = EconomyBridge.withdraw(player.getUniqueId(), "ultraeconomy_gems", 25.0);
boolean withdrawVault = EconomyBridge.withdrawEconomy(player, 50.0); // Vault shorthand
boolean withdrawVaultUuid = EconomyBridge.withdrawEconomy(player.getUniqueId(), 50.0);
```

## Working with Currency Objects

```java
import su.nightexpress.economybridge.EconomyBridge;
import su.nightexpress.economybridge.api.Currency;
import org.bukkit.entity.Player;
import java.util.Set;

// --- Get currency object ---
Currency currency = EconomyBridge.getCurrency("vault");            // null if not found
Currency safe = EconomyBridge.getCurrencyOrDummy("vault");         // never null, returns dummy if missing

// --- Query all registered currencies ---
Set<Currency> all = EconomyBridge.getCurrencies();
Set<String> allIds = EconomyBridge.getCurrencyIds();

// --- Currency object methods ---
if (currency != null) {
    String name = currency.getName();                  // display name
    String id = currency.getInternalId();              // internal id (lowercase)
    String origId = currency.getOriginalId();          // original plugin id
    boolean decimals = currency.canHandleDecimals();
    boolean offline = currency.canHandleOffline();
    boolean dummy = currency.isDummy();

    // Direct balance/give/take on currency object
    Player player = /* ... */;
    double bal = currency.getBalance(player);
    currency.give(player, 100.0);
    currency.take(player, 50.0);
    currency.give(player.getUniqueId(), 100.0);       // UUID overloads
    currency.take(player.getUniqueId(), 50.0);

    // Formatting
    String formatted = currency.format(1234.56);       // e.g. "$1,234.56"
    String valueOnly = currency.formatValue(1234.56);  // e.g. "1,234.56"
    double fined = currency.fineValue(1234.567);       // rounds if no decimals
}
```

## Handling Currencies with Consumer

```java
import su.nightexpress.economybridge.EconomyBridge;
import su.nightexpress.economybridge.api.Currency;
import java.util.function.Consumer;

// Execute logic only if the currency exists; returns false if not found
boolean handled = EconomyBridge.handle("coinsengine_coins", (Currency currency) -> {
    // do something with the currency
    double bal = currency.getBalance(somePlayer);
});
```

## Registering a Custom Currency

```java
import su.nightexpress.economybridge.EconomyBridge;
import su.nightexpress.economybridge.api.Currency;

Currency myCurrency = /* your Currency implementation */;
EconomyBridge.registerCurrency(myCurrency);
```

## Custom Item Operations via ItemBridge

```java
import su.nightexpress.economybridge.ItemBridge;
import su.nightexpress.economybridge.api.item.ItemHandler;
import org.bukkit.inventory.ItemStack;
import java.util.Set;

// --- Check if an item is custom ---
ItemStack item = /* ... */;
boolean isCustom = ItemBridge.isCustomItem(item);

// --- Get item ID ---
String itemId = ItemBridge.getItemId(item);                       // auto-detect handler
String itemId2 = ItemBridge.getItemId("itemsadder", item);        // specific handler

// --- Create a custom item ---
ItemStack created = ItemBridge.createItem("nexo", "my_custom_sword");
ItemStack created2 = ItemBridge.createItem("itemsadder", "namespace:item_id");

// --- Get handler for an item ---
ItemHandler handler = ItemBridge.getHandler(item);                // null if none
ItemHandler handler2 = ItemBridge.getHandler("nexo");             // by name, null if not found
ItemHandler safe = ItemBridge.getHandlerOrDummy(item);            // never null
ItemHandler safe2 = ItemBridge.getHandlerOrDummy("nexo");         // never null

// --- List all handlers ---
Set<ItemHandler> handlers = ItemBridge.getHandlers();

// --- Register custom handler ---
ItemHandler myHandler = /* your ItemHandler implementation */;
boolean registered = ItemBridge.registerHandler(myHandler);
```

## ItemHandler Interface

```java
import su.nightexpress.economybridge.api.item.ItemHandler;
import org.bukkit.inventory.ItemStack;

// Implement to add support for a custom item plugin
public class MyItemHandler implements ItemHandler {
    @Override public String getName() { return "my_plugin"; }
    @Override public boolean canHandle(ItemStack item) { /* check if yours */ }
    @Override public ItemStack createItem(String itemId) { /* create from id */ }
    @Override public String getItemId(ItemStack itemStack) { /* extract id */ }
    @Override public boolean isValidId(String itemId) { /* validate format */ }
    @Override public boolean isDummy() { return false; }
}
```

## Currency ID Constants

```java
import su.nightexpress.economybridge.currency.CurrencyId;

// Built-in IDs
String vault       = "vault";
String xpLevels    = "xp_levels";
String xpPoints    = "xp_points";
String playerPts   = "player_points";
String beastTokens = "beast_tokens";
String voting      = "voting_plugin";
String eliteMobs   = "elite_mobs";

// Multi-currency plugin IDs (prefix + currency name, lowercase)
String coinsEngine = CurrencyId.forCoinsEngine("coins");        // "coinsengine_coins"
String ultraEcon   = CurrencyId.forUltraEconomy("gems");        // "ultraeconomy_gems"

// Legacy ID rerouting
String rerouted = CurrencyId.reroute("money");  // returns "vault"
// "exp"/"level" -> "xp_levels", "xp" -> "xp_points", "money"/"economy" -> "vault"
```

## API Reference

### su.nightexpress.economybridge.EconomyBridge
| Method | Returns |
|---|---|
| `hasCurrency()` | `boolean` |
| `hasCurrency(String id)` | `boolean` |
| `hasEconomy()` | `boolean` |
| `isDisabled(String id)` | `boolean` |
| `getCurrency(String id)` | `Currency` (nullable) |
| `getCurrencyOrDummy(String id)` | `Currency` |
| `getDummyCurrency()` | `DummyCurrency` |
| `getCurrencies()` | `Set<Currency>` |
| `getCurrencyIds()` | `Set<String>` |
| `getCurrencyManager()` | `CurrencyManager` |
| `getBalance(Player, String id)` | `double` |
| `getBalance(UUID, String id)` | `double` |
| `getEconomyBalance(Player)` | `double` |
| `getEconomyBalance(UUID)` | `double` |
| `hasEnough(Player, String id, double)` | `boolean` |
| `hasEnough(UUID, String id, double)` | `boolean` |
| `deposit(Player, String id, double)` | `boolean` |
| `deposit(UUID, String id, double)` | `boolean` |
| `depositEconomy(Player, double)` | `boolean` |
| `depositEconomy(UUID, double)` | `boolean` |
| `withdraw(Player, String id, double)` | `boolean` |
| `withdraw(UUID, String id, double)` | `boolean` |
| `withdrawEconomy(Player, double)` | `boolean` |
| `withdrawEconomy(UUID, double)` | `boolean` |
| `handle(String id, Consumer<Currency>)` | `boolean` |
| `registerCurrency(Currency)` | `void` |
| `getPlugin()` | `BridgePlugin` |

### su.nightexpress.economybridge.api.Currency
| Method | Returns |
|---|---|
| `getName()` | `String` |
| `getInternalId()` | `String` |
| `getOriginalId()` | `String` |
| `getBalance(Player)` | `double` |
| `getBalance(UUID)` | `double` |
| `give(Player, double)` | `void` |
| `give(UUID, double)` | `void` |
| `take(Player, double)` | `void` |
| `take(UUID, double)` | `void` |
| `format(double)` | `String` |
| `formatValue(double)` | `String` |
| `applyFormat(String, double)` | `String` |
| `fineValue(double)` | `double` |
| `getFormat()` | `String` |
| `getDefaultFormat()` | `String` |
| `getDefaultName()` | `String` |
| `canHandleDecimals()` | `boolean` |
| `canHandleOffline()` | `boolean` |
| `isDummy()` | `boolean` |
| `getIcon()` | `ItemStack` |
| `getDefaultIcon()` | `ItemStack` |
| `replacePlaceholders()` | `UnaryOperator<String>` |

### su.nightexpress.economybridge.ItemBridge
| Method | Returns |
|---|---|
| `isCustomItem(ItemStack)` | `boolean` |
| `getItemId(ItemStack)` | `String` |
| `getItemId(String handler, ItemStack)` | `String` |
| `createItem(String handler, String itemId)` | `ItemStack` |
| `getHandler(String)` | `ItemHandler` (nullable) |
| `getHandler(ItemStack)` | `ItemHandler` (nullable) |
| `getHandlerOrDummy(String)` | `ItemHandler` |
| `getHandlerOrDummy(ItemStack)` | `ItemHandler` |
| `getHandlers()` | `Set<ItemHandler>` |
| `getDummyHandler()` | `DummyHandler` |
| `getItemManager()` | `ItemManager` |
| `registerHandler(ItemHandler)` | `boolean` |

### su.nightexpress.economybridge.api.item.ItemHandler
| Method | Returns |
|---|---|
| `getName()` | `String` |
| `canHandle(ItemStack)` | `boolean` |
| `createItem(String itemId)` | `ItemStack` (nullable) |
| `getItemId(ItemStack)` | `String` (nullable) |
| `isValidId(String)` | `boolean` |
| `isDummy()` | `boolean` |

### su.nightexpress.economybridge.currency.CurrencyId
| Method | Returns |
|---|---|
| `forCoinsEngine(String id)` | `String` |
| `forUltraEconomy(String id)` | `String` |
| `reroute(String oldName)` | `String` |
