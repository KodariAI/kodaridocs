# CoinsEngine API Reference

CoinsEngine by NightExpress is a lightweight custom virtual currency plugin with Vault integration. Supports unlimited currencies, decimal/integer modes, exchange rates, and leaderboards.

## Code Examples

### Get a currency and check a player's balance
```java
import su.nightexpress.coinsengine.api.CoinsEngineAPI;
import su.nightexpress.coinsengine.api.currency.Currency;
import org.bukkit.entity.Player;

Currency currency = CoinsEngineAPI.getCurrency("coins");
if (currency == null) return;

double balance = CoinsEngineAPI.getBalance(player, currency);
player.sendMessage("Balance: " + currency.format(balance));
```

### Add, remove, and set balance
```java
import su.nightexpress.coinsengine.api.CoinsEngineAPI;
import su.nightexpress.coinsengine.api.currency.Currency;
import org.bukkit.entity.Player;
import java.util.UUID;

Currency currency = CoinsEngineAPI.getCurrency("gems");

// Online player methods (auto-saves)
CoinsEngineAPI.addBalance(player, currency, 100.0);
CoinsEngineAPI.removeBalance(player, currency, 50.0);
CoinsEngineAPI.setBalance(player, currency, 500.0);

// Offline player by UUID (returns boolean success)
UUID uuid = targetUUID;
boolean success = CoinsEngineAPI.addBalance(uuid, currency, 100.0);
boolean removed = CoinsEngineAPI.removeBalance(uuid, "coins", 50.0);
boolean set = CoinsEngineAPI.setBalance(uuid, "coins", 500.0);
```

### Access user data directly
```java
import su.nightexpress.coinsengine.api.CoinsEngineAPI;
import su.nightexpress.coinsengine.api.CoinsUser;
import su.nightexpress.coinsengine.api.currency.Currency;
import java.util.concurrent.CompletableFuture;
import java.util.UUID;

// Online player
CoinsUser user = CoinsEngineAPI.getUserData(player);

// By name or UUID
CoinsUser userByName = CoinsEngineAPI.getUserData("PlayerName");
CoinsUser userByUuid = CoinsEngineAPI.getUserData(uuid);

// Async for offline players (returns CompletableFuture)
CompletableFuture<CoinsUser> future = CoinsEngineAPI.getUserDataAsync(uuid);
future.thenAccept(coinsUser -> {
    if (coinsUser != null) {
        // Use on main thread if needed
    }
});
```

### Listen for balance changes
```java
import su.nightexpress.coinsengine.api.event.ChangeBalanceEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BalanceListener implements Listener {

    @EventHandler
    public void onBalanceChange(ChangeBalanceEvent event) {
        String currencyId = event.getCurrency().getId();
        double oldAmount = event.getOldAmount();
        double newAmount = event.getNewAmount();

        if (currencyId.equals("coins") && newAmount > 10000) {
            event.setCancelled(true); // Block the change
        }
    }
}
```

### Iterate all currencies
```java
import su.nightexpress.coinsengine.api.CoinsEngineAPI;
import su.nightexpress.coinsengine.api.currency.Currency;
import java.util.Collection;

Collection<Currency> currencies = CoinsEngineAPI.getCurrencies();
for (Currency c : currencies) {
    String id = c.getId();
    String name = c.getName();
    boolean isVault = c.isVaultEconomy();
}
```

## API Reference

### Class: su.nightexpress.coinsengine.api.CoinsEngineAPI
Static utility class. All balance methods work with online Player or offline UUID.

- **static** boolean isLoaded()
- **static** Currency getCurrency(String id)
- **static** boolean hasCurrency(String id)
- **static** Collection\<Currency\> getCurrencies()
- **static** CurrencyManager getCurrencyManager()
- **static** UserManager getUserManager()
- **static** CoinsUser getUserData(Player)
- **static** CoinsUser getUserData(String name)
- **static** CoinsUser getUserData(UUID)
- **static** CompletableFuture\<CoinsUser\> getUserDataAsync(String name)
- **static** CompletableFuture\<CoinsUser\> getUserDataAsync(UUID)
- **static** double getBalance(Player, Currency)
- **static** double getBalance(UUID, Currency)
- **static** double getBalance(UUID, String currencyId)
- **static** void addBalance(Player, Currency, double)
- **static** boolean addBalance(UUID, Currency, double)
- **static** boolean addBalance(UUID, String currencyId, double)
- **static** void removeBalance(Player, Currency, double)
- **static** boolean removeBalance(UUID, Currency, double)
- **static** boolean removeBalance(UUID, String currencyId, double)
- **static** void setBalance(Player, Currency, double)
- **static** boolean setBalance(UUID, Currency, double)
- **static** boolean setBalance(UUID, String currencyId, double)

### Interface: su.nightexpress.coinsengine.api.currency.Currency
Represents a single currency definition.

- String getId()
- String getName()
- String getSymbol()
- String getPrefix()
- String format(double) - Formats value with currency prefix/symbol
- String formatValue(double) - Formats only the numeric value
- String formatCompact(double) - Compact format (e.g. 1.2K)
- boolean isVaultEconomy()
- boolean isDecimal()
- boolean isInteger()
- boolean isTransferAllowed()
- boolean isExchangeAllowed()
- boolean isLimited()
- boolean isUnlimited()
- double getMaxValue()
- double getStartValue()
- double getMinTransferAmount()
- double getExchangeRate(Currency other)
- double getExchangeRate(String currencyId)
- boolean canExchangeTo(Currency other)
- double getExchangeResult(Currency target, double amount)
- double fine(double) - Rounds to integer if needed
- double limit(double) - Clamps to max value
- double fineAndLimit(double) - Rounds and clamps
- boolean hasPermission(Player)
- ItemStack getIcon()
- String[] getCommandAliases()
- Map\<String, Double\> getExchangeRates()

### Class: su.nightexpress.coinsengine.api.event.ChangeBalanceEvent
Extends: org.bukkit.event.Event | Implements: org.bukkit.event.Cancellable

Fired whenever any player's balance changes for any currency.

- Player getPlayer()
- CoinsUser getUser()
- Currency getCurrency()
- double getOldAmount()
- double getNewAmount()
- boolean isCancelled()
- void setCancelled(boolean)
