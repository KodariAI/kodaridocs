# VaultUnlocked API Reference

VaultUnlocked is the actively maintained fork of Vault, providing a unified abstraction layer for Economy, Permissions, and Chat on Bukkit/Spigot/Paper servers. It is fully backward-compatible with original Vault plugins and adds Folia support plus a modern vault2 API with UUID-based accounts and multi-currency via BigDecimal. The legacy vault1 API (OfflinePlayer/double-based) remains functional. When writing new code, check the plugin with "Vault" in the plugin manager -- VaultUnlocked registers under that name.

## Hooking into VaultUnlocked (Economy, Permission, Chat)

```java
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

    private static Economy econ = null;
    private static Permission perms = null;
    private static Chat chat = null;

    @Override
    public void onEnable() {
        if (!setupEconomy()) {
            getLogger().severe("No Vault/VaultUnlocked economy provider found! Disabling.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        setupPermissions();
        setupChat();
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp =
                getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    private boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp =
                getServer().getServicesManager().getRegistration(Permission.class);
        if (rsp == null) {
            return false;
        }
        perms = rsp.getProvider();
        return perms != null;
    }

    private boolean setupChat() {
        RegisteredServiceProvider<Chat> rsp =
                getServer().getServicesManager().getRegistration(Chat.class);
        if (rsp == null) {
            return false;
        }
        chat = rsp.getProvider();
        return chat != null;
    }

    public static Economy getEconomy() { return econ; }
    public static Permission getPermissions() { return perms; }
    public static Chat getChat() { return chat; }
}
```

## Economy Usage Examples

```java
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.OfflinePlayer;

// Check balance
double balance = econ.getBalance(player);

// Check if player can afford something
boolean canAfford = econ.has(player, 500.0);

// Withdraw money - always check transactionSuccess()
EconomyResponse resp = econ.withdrawPlayer(player, 500.0);
if (resp.transactionSuccess()) {
    sender.sendMessage("Paid " + econ.format(resp.amount) + ". New balance: " + econ.format(resp.balance));
} else {
    sender.sendMessage("Transaction failed: " + resp.errorMessage);
}

// Deposit money
EconomyResponse deposit = econ.depositPlayer(player, 100.0);
if (deposit.transactionSuccess()) {
    sender.sendMessage("Received " + econ.format(deposit.amount));
}

// Format currency for display
String formatted = econ.format(1234.56); // e.g. "$1,234.56"

// World-specific balance (if provider supports it)
double worldBalance = econ.getBalance(player, "world_nether");

// Bank operations (if hasBankSupport() returns true)
if (econ.hasBankSupport()) {
    econ.createBank("MyBank", player);
    EconomyResponse bankBal = econ.bankBalance("MyBank");
    econ.bankDeposit("MyBank", 1000.0);
    econ.bankWithdraw("MyBank", 250.0);
}

// Create player account (usually auto-created, but useful for first-join)
if (!econ.hasAccount(player)) {
    econ.createPlayerAccount(player);
}
```

## Permission Usage Examples

```java
import net.milkbowl.vault.permission.Permission;
import org.bukkit.entity.Player;

// Check if player has a permission
boolean hasPerm = perms.playerHas(player, "myplugin.use");

// Also works with world-specific context
boolean hasWorldPerm = perms.playerHas("world", player, "myplugin.admin");

// Add/remove permissions
perms.playerAdd(player, "myplugin.vip");
perms.playerRemove(player, "myplugin.vip");

// Transient permissions (session-only, lost on disconnect)
perms.playerAddTransient(player, "myplugin.temp");
perms.playerRemoveTransient(player, "myplugin.temp");

// Group operations (if hasGroupSupport() returns true)
if (perms.hasGroupSupport()) {
    String primaryGroup = perms.getPrimaryGroup(player);
    String[] groups = perms.getPlayerGroups(player);
    boolean inGroup = perms.playerInGroup(player, "vip");

    perms.playerAddGroup(player, "moderator");
    perms.playerRemoveGroup(player, "moderator");

    // All registered groups
    String[] allGroups = perms.getGroups();

    // Group-level permission management
    perms.groupAdd("world", "admin", "myplugin.admin");
    perms.groupRemove("world", "admin", "myplugin.admin");
    boolean groupHas = perms.groupHas("world", "admin", "myplugin.admin");
}
```

## Chat (Prefix/Suffix) Usage Examples

```java
import net.milkbowl.vault.chat.Chat;
import org.bukkit.entity.Player;

// Player prefix/suffix
String prefix = chat.getPlayerPrefix(player);
String suffix = chat.getPlayerSuffix(player);
chat.setPlayerPrefix(player, "&a[VIP] ");
chat.setPlayerSuffix(player, " &7[Pro]");

// Group prefix/suffix
String groupPrefix = chat.getGroupPrefix("world", "admin");
String groupSuffix = chat.getGroupSuffix("world", "admin");
chat.setGroupPrefix("world", "admin", "&c[Admin] ");
chat.setGroupSuffix("world", "admin", "");

// Info nodes (custom metadata stored per-player or per-group)
int kills = chat.getPlayerInfoInteger(player, "kills", 0);
chat.setPlayerInfoInteger(player, "kills", kills + 1);

double rating = chat.getPlayerInfoDouble(player, "rating", 0.0);
String title = chat.getPlayerInfoString(player, "title", "Newcomer");
boolean flagged = chat.getPlayerInfoBoolean(player, "flagged", false);

// Group info nodes
chat.setGroupInfoInteger("world", "vip", "max_homes", 5);
int maxHomes = chat.getGroupInfoInteger("world", "vip", "max_homes", 1);
```

## Vault2 Modern Economy API (UUID + BigDecimal + Multi-Currency)

VaultUnlocked provides a modern vault2 Economy interface under `net.milkbowl.vault2.economy`. Use this for new plugins that need UUID-based accounts, BigDecimal precision, or multi-currency support.

```java
import net.milkbowl.vault2.economy.Economy;
import net.milkbowl.vault2.economy.EconomyResponse;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

import java.math.BigDecimal;
import java.util.UUID;

// Setup (same pattern, different class)
RegisteredServiceProvider<Economy> rsp =
        Bukkit.getServicesManager().getRegistration(Economy.class);
Economy econ2 = rsp.getProvider();

UUID accountId = player.getUniqueId();
String pluginName = "MyPlugin";

// Balance (returns BigDecimal)
BigDecimal balance = econ2.getBalance(pluginName, accountId);

// Check affordability
boolean canAfford = econ2.has(pluginName, accountId, new BigDecimal("500.00"));

// Withdraw / Deposit
EconomyResponse resp = econ2.withdraw(pluginName, accountId, new BigDecimal("100.50"));
if (resp.transactionSuccess()) {
    // resp.amount = BigDecimal, resp.balance = BigDecimal
}
EconomyResponse dep = econ2.deposit(pluginName, accountId, new BigDecimal("200.00"));

// Multi-currency (if hasMultiCurrencySupport())
String defaultCurrency = econ2.getDefaultCurrency(pluginName);
BigDecimal gemBalance = econ2.getBalance(pluginName, accountId, "world", "gems");
econ2.withdraw(pluginName, accountId, "world", "gems", new BigDecimal("10"));

// Shared accounts
UUID sharedAccId = UUID.randomUUID();
econ2.createSharedAccount(pluginName, sharedAccId, "GuildBank", player.getUniqueId());

// Format for display
String formatted = econ2.format(new BigDecimal("1234.56"));
String formattedCurrency = econ2.format(pluginName, new BigDecimal("1234.56"), "gems");
```

---

## API Reference

### net.milkbowl.vault.economy.Economy (interface) -- Legacy API

Core methods (prefer OfflinePlayer overloads; String-name overloads are @Deprecated):

- `boolean isEnabled()`
- `String getName()`
- `int fractionalDigits()`
- `String format(double amount)`
- `String currencyNamePlural()` / `String currencyNameSingular()`
- `boolean hasBankSupport()`
- `boolean hasAccount(OfflinePlayer player)` / `boolean hasAccount(OfflinePlayer player, String worldName)`
- `double getBalance(OfflinePlayer player)` / `double getBalance(OfflinePlayer player, String world)`
- `boolean has(OfflinePlayer player, double amount)` / `boolean has(OfflinePlayer player, String worldName, double amount)`
- `EconomyResponse withdrawPlayer(OfflinePlayer player, double amount)` / `EconomyResponse withdrawPlayer(OfflinePlayer player, String worldName, double amount)`
- `EconomyResponse depositPlayer(OfflinePlayer player, double amount)` / `EconomyResponse depositPlayer(OfflinePlayer player, String worldName, double amount)`
- `boolean createPlayerAccount(OfflinePlayer player)` / `boolean createPlayerAccount(OfflinePlayer player, String worldName)`
- `EconomyResponse createBank(String name, OfflinePlayer player)`
- `EconomyResponse deleteBank(String name)`
- `EconomyResponse bankBalance(String name)` / `EconomyResponse bankHas(String name, double amount)`
- `EconomyResponse bankWithdraw(String name, double amount)` / `EconomyResponse bankDeposit(String name, double amount)`
- `EconomyResponse isBankOwner(String name, OfflinePlayer player)` / `EconomyResponse isBankMember(String name, OfflinePlayer player)`
- `List<String> getBanks()`

### net.milkbowl.vault.economy.EconomyResponse (class)

Fields (all `public final`):
- `double amount` -- amount modified
- `double balance` -- new account balance
- `ResponseType type` -- SUCCESS, FAILURE, or NOT_IMPLEMENTED
- `String errorMessage` -- error detail (null on success)

Methods:
- `boolean transactionSuccess()` -- returns true if type == SUCCESS

### net.milkbowl.vault.permission.Permission (abstract class)

- `boolean isEnabled()`
- `String getName()`
- `boolean hasSuperPermsCompat()`
- `boolean hasGroupSupport()`
- `boolean playerHas(Player player, String permission)` / `boolean playerHas(String world, OfflinePlayer player, String permission)`
- `boolean playerAdd(Player player, String permission)` / `boolean playerAdd(String world, OfflinePlayer player, String permission)`
- `boolean playerRemove(Player player, String permission)` / `boolean playerRemove(String world, OfflinePlayer player, String permission)`
- `boolean playerAddTransient(Player player, String permission)` / `boolean playerAddTransient(String world, Player player, String permission)`
- `boolean playerRemoveTransient(Player player, String permission)` / `boolean playerRemoveTransient(String world, Player player, String permission)`
- `boolean playerInGroup(Player player, String group)` / `boolean playerInGroup(String world, OfflinePlayer player, String group)`
- `boolean playerAddGroup(Player player, String group)` / `boolean playerAddGroup(String world, OfflinePlayer player, String group)`
- `boolean playerRemoveGroup(Player player, String group)` / `boolean playerRemoveGroup(String world, OfflinePlayer player, String group)`
- `String[] getPlayerGroups(Player player)` / `String[] getPlayerGroups(String world, OfflinePlayer player)`
- `String getPrimaryGroup(Player player)` / `String getPrimaryGroup(String world, OfflinePlayer player)`
- `String[] getGroups()`
- `boolean groupHas(String world, String group, String permission)`
- `boolean groupAdd(String world, String group, String permission)`
- `boolean groupRemove(String world, String group, String permission)`
- `boolean has(Player player, String permission)` / `boolean has(CommandSender sender, String permission)`

### net.milkbowl.vault.chat.Chat (abstract class)

- `boolean isEnabled()`
- `String getName()`
- `String getPlayerPrefix(Player player)` / `String getPlayerPrefix(String world, OfflinePlayer player)`
- `void setPlayerPrefix(Player player, String prefix)` / `void setPlayerPrefix(String world, OfflinePlayer player, String prefix)`
- `String getPlayerSuffix(Player player)` / `String getPlayerSuffix(String world, OfflinePlayer player)`
- `void setPlayerSuffix(Player player, String suffix)` / `void setPlayerSuffix(String world, OfflinePlayer player, String suffix)`
- `String getGroupPrefix(String world, String group)` / `void setGroupPrefix(String world, String group, String prefix)`
- `String getGroupSuffix(String world, String group)` / `void setGroupSuffix(String world, String group, String suffix)`
- `int getPlayerInfoInteger(Player player, String node, int defaultValue)` / `void setPlayerInfoInteger(Player player, String node, int value)`
- `double getPlayerInfoDouble(Player player, String node, double defaultValue)` / `void setPlayerInfoDouble(Player player, String node, double value)`
- `boolean getPlayerInfoBoolean(Player player, String node, boolean defaultValue)` / `void setPlayerInfoBoolean(Player player, String node, boolean value)`
- `String getPlayerInfoString(Player player, String node, String defaultValue)` / `void setPlayerInfoString(Player player, String node, String value)`
- `int getGroupInfoInteger(String world, String group, String node, int defaultValue)` / `void setGroupInfoInteger(String world, String group, String node, int value)`
- `double getGroupInfoDouble(String world, String group, String node, double defaultValue)` / `void setGroupInfoDouble(String world, String group, String node, double value)`
- `boolean getGroupInfoBoolean(String world, String group, String node, boolean defaultValue)` / `void setGroupInfoBoolean(String world, String group, String node, boolean value)`
- `String getGroupInfoString(String world, String group, String node, String defaultValue)` / `void setGroupInfoString(String world, String group, String node, String value)`
- `boolean playerInGroup(Player player, String group)` / `String[] getPlayerGroups(Player player)`
- `String getPrimaryGroup(Player player)` / `String[] getGroups()`

### net.milkbowl.vault2.economy.Economy (interface) -- Modern API

Key methods (UUID-based, BigDecimal precision, multi-currency):

- `boolean isEnabled()` / `String getName()`
- `boolean hasMultiCurrencySupport()` / `boolean hasSharedAccountSupport()`
- `int fractionalDigits(String pluginName)`
- `String getDefaultCurrency(String pluginName)`
- `Collection<String> currencies()`
- `boolean hasCurrency(String currency)`
- `String format(BigDecimal amount)` / `String format(String pluginName, BigDecimal amount, String currency)`
- `boolean hasAccount(UUID accountID)` / `boolean hasAccount(UUID accountID, String worldName)`
- `boolean createAccount(UUID accountID, String name)` / `boolean createAccount(UUID accountID, String name, String worldName, boolean player)`
- `boolean deleteAccount(String pluginName, UUID accountID)`
- `boolean renameAccount(UUID accountID, String name)`
- `Optional<String> getAccountName(UUID accountID)`
- `Map<UUID, String> getUUIDNameMap()`
- `BigDecimal getBalance(String pluginName, UUID accountID)` / `BigDecimal getBalance(String pluginName, UUID accountID, String world, String currency)`
- `boolean has(String pluginName, UUID accountID, BigDecimal amount)` / `boolean has(String pluginName, UUID accountID, String world, String currency, BigDecimal amount)`
- `EconomyResponse withdraw(String pluginName, UUID accountID, BigDecimal amount)` / `EconomyResponse withdraw(String pluginName, UUID accountID, String world, String currency, BigDecimal amount)`
- `EconomyResponse deposit(String pluginName, UUID accountID, BigDecimal amount)` / `EconomyResponse deposit(String pluginName, UUID accountID, String world, String currency, BigDecimal amount)`
- `EconomyResponse set(String pluginName, UUID accountID, BigDecimal amount)`
- `boolean createSharedAccount(String pluginName, UUID accountID, String name, UUID owner)`
- `boolean isAccountOwner(String pluginName, UUID accountID, UUID uuid)`
- `boolean isAccountMember(String pluginName, UUID accountID, UUID uuid)`
- `boolean addAccountMember(String pluginName, UUID accountID, UUID uuid, AccountPermission... perms)`
- `boolean removeAccountMember(String pluginName, UUID accountID, UUID uuid)`

### net.milkbowl.vault2.economy.EconomyResponse (class)

Fields (all `public final`):
- `BigDecimal amount` / `BigDecimal balance` / `ResponseType type` / `String errorMessage`

Methods:
- `boolean transactionSuccess()`

### net.milkbowl.vault2.economy.AccountPermission (enum)

Values: retrievable via `AccountPermission.valueOf(String)` and `AccountPermission.values()`. Used for shared account permission management.

### net.milkbowl.vault2.permission.Permission (abstract class)

Identical method signatures to `net.milkbowl.vault.permission.Permission`. Use the vault2 package for new plugins.

### net.milkbowl.vault2.chat.Chat (abstract class)

Identical method signatures to `net.milkbowl.vault.chat.Chat`. Use the vault2 package for new plugins.
