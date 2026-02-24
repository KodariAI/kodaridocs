# RedisEconomy API Reference

RedisEconomy is a Redis-backed economy plugin supporting unlimited currencies, cross-server balances, and offline payments. Each Currency implements the Vault Economy interface. For the default (Vault-linked) currency, you can use Vault API directly; use RedisEconomy's API for multi-currency access.

## Code Examples

### Get the API instance and default currency
```java
import dev.unnm3d.rediseconomy.api.RedisEconomyAPI;
import dev.unnm3d.rediseconomy.currency.Currency;
import org.bukkit.Bukkit;

RedisEconomyAPI api = RedisEconomyAPI.getAPI();
if (api == null) {
    Bukkit.getLogger().warning("RedisEconomy API not available!");
    return;
}

Currency defaultCurrency = api.getDefaultCurrency();
```

### Get a specific currency by name or symbol
```java
import dev.unnm3d.rediseconomy.api.RedisEconomyAPI;
import dev.unnm3d.rediseconomy.currency.Currency;

RedisEconomyAPI api = RedisEconomyAPI.getAPI();

Currency gems = api.getCurrencyByName("gems");
Currency euro = api.getCurrencyBySymbol("€");
```

### Check balance, withdraw, and deposit
```java
import dev.unnm3d.rediseconomy.api.RedisEconomyAPI;
import dev.unnm3d.rediseconomy.currency.Currency;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

RedisEconomyAPI api = RedisEconomyAPI.getAPI();
Currency currency = api.getCurrencyByName("vault");

// Get balance
double balance = currency.getBalance(player); // OfflinePlayer

// Withdraw with reason (logged)
currency.withdrawPlayer(player, 100.0, "Purchase from shop");

// Deposit
currency.depositPlayer(player, 50.0);

// Set balance directly by UUID
currency.setPlayerBalance(player.getUniqueId(), 1000.0);
```

### Iterate all cached accounts for a currency
```java
import dev.unnm3d.rediseconomy.api.RedisEconomyAPI;
import dev.unnm3d.rediseconomy.currency.Currency;
import java.util.Map;
import java.util.UUID;

RedisEconomyAPI api = RedisEconomyAPI.getAPI();
Currency currency = api.getDefaultCurrency();

Map<UUID, Double> accounts = currency.getAccounts();
accounts.forEach((uuid, bal) -> {
    System.out.println(uuid + " has " + bal);
});
```

### Async leaderboard from Redis (ordered by balance descending)
```java
import dev.unnm3d.rediseconomy.api.RedisEconomyAPI;
import dev.unnm3d.rediseconomy.currency.Currency;

RedisEconomyAPI api = RedisEconomyAPI.getAPI();
Currency currency = api.getDefaultCurrency();

currency.getOrderedAccounts().thenAccept(accounts -> {
    accounts.forEach(entry -> {
        System.out.println("UUID: " + entry.getElement() + " Balance: " + entry.getScore());
    });
});
```

### Listen for transactions
```java
import dev.unnm3d.rediseconomy.api.TransactionEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EconListener implements Listener {

    @EventHandler
    public void onTransaction(TransactionEvent event) {
        var transaction = event.getTransaction();
        // Transaction contains details about the economy operation
    }
}
```

### UUID/name cache lookups (cross-server)
```java
import dev.unnm3d.rediseconomy.api.RedisEconomyAPI;
import java.util.UUID;

RedisEconomyAPI api = RedisEconomyAPI.getAPI();

UUID uuid = api.getUUIDFromUsernameCache("PlayerName");
String name = api.getUsernameFromUUIDCache(uuid);
// Returns case-sensitive name
String caseName = api.getCaseSensitiveName("playername");
```

### List all registered currencies
```java
import dev.unnm3d.rediseconomy.api.RedisEconomyAPI;
import dev.unnm3d.rediseconomy.currency.Currency;
import java.util.Collection;
import java.util.Map;

RedisEconomyAPI api = RedisEconomyAPI.getAPI();

Collection<Currency> all = api.getCurrencies();
Map<String, Currency> named = api.getCurrenciesWithNames();
```

## API Reference

### Abstract Class: dev.unnm3d.rediseconomy.api.RedisEconomyAPI
Entry point. Obtain via static getAPI().

- **static** RedisEconomyAPI getAPI() - Returns null if plugin not loaded
- Currency getDefaultCurrency() - The Vault-linked primary currency
- Currency getCurrencyByName(String name)
- Currency getCurrencyBySymbol(String symbol)
- Collection\<Currency\> getCurrencies()
- Map\<String, Currency\> getCurrenciesWithNames()
- EconomyExchange getExchange()
- UUID getUUIDFromUsernameCache(String name)
- String getUsernameFromUUIDCache(UUID uuid)
- String getCaseSensitiveName(String name)

### Class: dev.unnm3d.rediseconomy.currency.Currency
Implements net.milkbowl.vault.economy.Economy. Each currency is also a Vault Economy provider.

Key methods (beyond standard Vault Economy interface):
- double getBalance(OfflinePlayer)
- void withdrawPlayer(OfflinePlayer, double amount, String reason)
- void depositPlayer(OfflinePlayer, double amount)
- void setPlayerBalance(UUID, double amount)
- Map\<UUID, Double\> getAccounts() - Cached local account map
- CompletableFuture getOrderedAccounts() - Async sorted from Redis
- CompletableFuture getAccountRedis(UUID) - Direct Redis balance query

### Class: dev.unnm3d.rediseconomy.api.TransactionEvent
Extends: org.bukkit.event.Event

Fired after economy transactions occur.

- Transaction getTransaction()
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

Note: The Currency class in RedisEconomy implements the full Vault Economy interface, so all standard Vault methods (has, hasAccount, createPlayerAccount, format, etc.) are also available.
