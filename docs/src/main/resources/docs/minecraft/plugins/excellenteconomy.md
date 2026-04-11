# ExcellentEconomy Reference

Multi-currency economy plugin by nulli0n. Supports unlimited custom currencies with Vault integration, leaderboards, and cross-server sync. Requires NightCore plugin. Add `CoinsEngine` to `depend` or `softdepend` in plugin.yml.

> **Note:** The plugin is being renamed from CoinsEngine to ExcellentEconomy. The artifact ID and some internal packages still use the old `coinsengine` name.

## Getting the API Instance

```java
import su.nightexpress.excellenteconomy.api.ExcellentEconomyAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

RegisteredServiceProvider<ExcellentEconomyAPI> provider =
    Bukkit.getServicesManager().getRegistration(ExcellentEconomyAPI.class);

if (provider != null) {
    ExcellentEconomyAPI api = provider.getProvider();
}
```

## API Classes

### ExcellentEconomyAPI

Package: `su.nightexpress.excellenteconomy.api`

Main interface. Provides both **async** methods (for offline/database queries) and **cached** methods (for online players only).

**Currency lookup:**
```java
boolean hasCurrency(String id)
Set<ExcellentCurrency> getCurrencies()
ExcellentCurrency getCurrency(String id)           // nullable
Optional<ExcellentCurrency> currencyById(String id)
boolean canPerformOperations()
```

**Balance — cached (online players only):**
```java
double getBalance(Player player, String currencyId)
double getBalance(Player player, ExcellentCurrency currency)
boolean deposit(Player player, String currencyId, double amount)
boolean deposit(Player player, ExcellentCurrency currency, double amount)
boolean deposit(Player player, String currencyId, double amount, OperationContext context)
boolean deposit(Player player, ExcellentCurrency currency, double amount, OperationContext context)
boolean withdraw(Player player, String currencyId, double amount)
boolean withdraw(Player player, ExcellentCurrency currency, double amount)
boolean withdraw(Player player, String currencyId, double amount, OperationContext context)
boolean withdraw(Player player, ExcellentCurrency currency, double amount, OperationContext context)
boolean setBalance(Player player, String currencyId, double amount)
boolean setBalance(Player player, ExcellentCurrency currency, double amount)
boolean setBalance(Player player, String currencyId, double amount, OperationContext context)
boolean setBalance(Player player, ExcellentCurrency currency, double amount, OperationContext context)
```

**Balance — async (works for offline players):**
```java
CompletableFuture<Double> getBalanceAsync(UUID playerId, String currencyName)
CompletableFuture<Double> getBalanceAsync(UUID playerId, ExcellentCurrency currency)
CompletableFuture<OperationResult> depositAsync(UUID playerId, String currencyName, double amount)
CompletableFuture<OperationResult> depositAsync(UUID playerId, ExcellentCurrency currency, double amount)
CompletableFuture<OperationResult> depositAsync(UUID playerId, String currencyName, double amount, OperationContext context)
CompletableFuture<OperationResult> depositAsync(UUID playerId, ExcellentCurrency currency, double amount, OperationContext context)
CompletableFuture<OperationResult> withdrawAsync(UUID playerId, String currencyId, double amount)
CompletableFuture<OperationResult> withdrawAsync(UUID playerId, ExcellentCurrency currency, double amount)
CompletableFuture<OperationResult> withdrawAsync(UUID playerId, String currencyId, double amount, OperationContext context)
CompletableFuture<OperationResult> withdrawAsync(UUID playerId, ExcellentCurrency currency, double amount, OperationContext context)
CompletableFuture<OperationResult> setBalanceAsync(UUID playerId, String currencyId, double amount)
CompletableFuture<OperationResult> setBalanceAsync(UUID playerId, ExcellentCurrency currency, double amount)
CompletableFuture<OperationResult> setBalanceAsync(UUID playerId, String currencyId, double amount, OperationContext context)
CompletableFuture<OperationResult> setBalanceAsync(UUID playerId, ExcellentCurrency currency, double amount, OperationContext context)
```

**User data:**
```java
CoinsUser getCachedUserData(Player player)
Optional<CoinsUser> getCachedUserData(String name)
Optional<CoinsUser> getCachedUserData(UUID uuid)
CompletableFuture<Optional<CoinsUser>> loadUserDataByName(String name)
CompletableFuture<Optional<CoinsUser>> loadUserDataById(UUID uuid)
```

---

### ExcellentCurrency

Package: `su.nightexpress.excellenteconomy.api.currency`

Represents a currency configuration.

```java
String getId()
String getName()
String getPrefix()
String getSymbol()
String getFormat()
String getFormatShort()
String[] getCommandAliases()
String getColumnName()
String getPermission()
boolean hasPermission(Player player)
boolean isPrimary()
boolean isDecimal()
boolean isInteger()
boolean isPermissionRequired()
boolean isSynchronizable()
boolean isTransferAllowed()
boolean isExchangeAllowed()
boolean isLeaderboardEnabled()
boolean isUnlimited()
boolean isLimited()
double getMaxValue()
double getMinTransferAmount()
double getStartValue()
boolean isUnderLimit(double value)
double floorIfNeeded(double amount)
double limitIfNeeded(double amount)
double floorAndLimit(double amount)
String formatValue(double balance)
String format(double balance)
String formatCompact(double balance)
String formatRaw(double balance)
Map<String, Double> getExchangeRates()
double getExchangeRate(ExcellentCurrency currency)
double getExchangeRate(String id)
boolean canExchangeTo(ExcellentCurrency other)
double getExchangeResult(ExcellentCurrency other, double amount)
```

---

### CoinsUser

Package: `su.nightexpress.coinsengine.user`

Represents a player's economy data. Obtained from the API; direct balance methods fire `ChangeBalanceEvent`.

```java
double getBalance(ExcellentCurrency currency)
boolean hasEnough(ExcellentCurrency currency, double amount)
void addBalance(ExcellentCurrency currency, double amount)
void removeBalance(ExcellentCurrency currency, double amount)
void setBalance(ExcellentCurrency currency, double amount)
void resetBalance(ExcellentCurrency currency)
void resetBalance(Collection<ExcellentCurrency> currencies)
void editBalance(ExcellentCurrency currency, Consumer<UserBalance> consumer)  // fires ChangeBalanceEvent
UserBalance getBalance()
CurrencySettings getSettings(ExcellentCurrency currency)
long getLastSeen()
boolean isHiddenFromTops()
```

---

### OperationResult

Package: `su.nightexpress.excellenteconomy.api.currency.operation`

Enum returned by all async operations.

```java
enum OperationResult { SUCCESS, FAILURE }

boolean success()   // true if SUCCESS
boolean failure()   // true if FAILURE
boolean bool()      // alias for success()
```

---

### OperationContext

Package: `su.nightexpress.excellenteconomy.api.currency.operation`

Optional context passed to balance operations to control logging and notifications. Use factory methods to create instances.

```java
// Factory methods
static OperationContext of(CommandSender sender)
static OperationContext custom(String name)     // plugin name or any label
static OperationContext console()
static OperationContext consoleQuiet()          // console + all notifications suppressed

// Silence notifications
OperationContext silent()                                   // suppress all targets
OperationContext silentFor(NotificationTarget... targets)   // suppress specific targets
OperationContext silentFor(NotificationTarget target, boolean flag)

boolean shouldNotify(NotificationTarget target)
boolean shouldNotifyLogger()
OperationExecutor getExecutor()
Optional<CommandSender> getBukkitSender()
```

**NotificationTarget enum values:** `USER`, `EXECUTOR`, `FILE_LOGGER`, `CONSOLE_LOGGER`

---

## Events

### ChangeBalanceEvent

Package: `su.nightexpress.coinsengine.api.event`
Cancellable: **yes**
Async: **yes** (fires on the calling thread — may be async)

Fired when any player's currency balance is about to change. If cancelled, the balance is reverted to the old value.

```java
CoinsUser getUser()
Player getPlayer()                  // may be null if offline
ExcellentCurrency getCurrency()
double getOldAmount()
double getNewAmount()
boolean isCancelled()
void setCancelled(boolean cancelled)
```

**Example listener:**
```java
import su.nightexpress.coinsengine.api.event.ChangeBalanceEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EconomyListener implements Listener {

    @EventHandler
    public void onBalanceChange(ChangeBalanceEvent event) {
        double gained = event.getNewAmount() - event.getOldAmount();
        if (gained > 0) {
            // player received currency
        }
        // cancel to block the transaction
        // event.setCancelled(true);
    }
}
```

---

## Code Examples

### Give currency to an online player

```java
import su.nightexpress.excellenteconomy.api.ExcellentEconomyAPI;
import su.nightexpress.excellenteconomy.api.currency.ExcellentCurrency;
import org.bukkit.entity.Player;

ExcellentCurrency coins = api.getCurrency("coins"); // use your currency ID
if (coins != null) {
    boolean success = api.deposit(player, coins, 100.0);
}
```

### Give currency to an offline player (async)

```java
import su.nightexpress.excellenteconomy.api.currency.operation.OperationContext;
import su.nightexpress.excellenteconomy.api.currency.operation.OperationResult;

api.depositAsync(playerUUID, "coins", 500.0, OperationContext.custom("MyPlugin"))
    .thenAccept(result -> {
        if (result.success()) {
            // deposit went through
        }
    });
```

### Check and deduct balance

```java
import su.nightexpress.coinsengine.user.CoinsUser;

CoinsUser user = api.getCachedUserData(player);
ExcellentCurrency coins = api.getCurrency("coins");

if (user.hasEnough(coins, 50.0)) {
    user.removeBalance(coins, 50.0);
}
```

### Silent withdrawal (no notifications)

```java
api.withdrawAsync(playerUUID, "coins", 100.0, OperationContext.consoleQuiet())
    .thenAccept(result -> { /* ... */ });
```

## Key Rules

- Currency IDs are case-sensitive — match the ID configured in ExcellentEconomy
- Cached methods (`getBalance`, `deposit`, etc. with `Player`) only work for **online** players
- Async methods return `CompletableFuture` — always check `result.success()` before acting on the result
- `ChangeBalanceEvent` may fire on an async thread; use `Bukkit.getScheduler().runTask()` if you need to interact with the Bukkit API inside the handler
- `OperationContext` is optional on all balance methods; omit it if you don't need custom logging or notification control
