# Vault API Documentation

Vault is an abstraction layer that provides unified Economy, Permissions, and Chat APIs for Bukkit/Spigot plugins. Instead of depending on specific economy or permissions plugins directly, plugins depend on Vault and access whichever provider the server has installed (e.g., EssentialsX for economy, LuckPerms for permissions).

**Plugin.yml requirement:** `depend: [Vault]` or `softdepend: [Vault]`

---

## Setup - Hooking Into Vault

Vault services are obtained via Bukkit's `RegisteredServiceProvider`. You must check that the provider exists before using it. Do this in `onEnable()`.

```java
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

    private static Economy economy;
    private static Permission permissions;
    private static Chat chat;

    @Override
    public void onEnable() {
        if (!setupEconomy()) {
            getLogger().severe("No Vault economy provider found! Disabling plugin.");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }
        setupPermissions();
        setupChat();
    }

    private boolean setupEconomy() {
        if (Bukkit.getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp =
                getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        economy = rsp.getProvider();
        return economy != null;
    }

    private boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp =
                getServer().getServicesManager().getRegistration(Permission.class);
        if (rsp == null) {
            return false;
        }
        permissions = rsp.getProvider();
        return permissions != null;
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

    public static Economy getEconomy() { return economy; }
    public static Permission getPermissions() { return permissions; }
    public static Chat getChat() { return chat; }
}
```

---

## Economy Examples

### Check Balance, Withdraw, and Deposit

```java
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PayCommand implements CommandExecutor {

    private final Economy economy;

    public PayCommand(Economy economy) {
        this.economy = economy;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player player)) return false;

        // Check balance
        double balance = economy.getBalance(player);
        player.sendMessage("Your balance: " + economy.format(balance));

        // Check if player can afford something
        double cost = 100.0;
        if (!economy.has(player, cost)) {
            player.sendMessage("You cannot afford this! You need " + economy.format(cost));
            return true;
        }

        // Withdraw money
        EconomyResponse withdrawal = economy.withdrawPlayer(player, cost);
        if (withdrawal.transactionSuccess()) {
            player.sendMessage("Withdrew " + economy.format(withdrawal.amount)
                    + ". New balance: " + economy.format(withdrawal.balance));
        } else {
            player.sendMessage("Withdrawal failed: " + withdrawal.errorMessage);
        }

        // Deposit money
        EconomyResponse deposit = economy.depositPlayer(player, 50.0);
        if (deposit.transactionSuccess()) {
            player.sendMessage("Deposited " + economy.format(deposit.amount)
                    + ". New balance: " + economy.format(deposit.balance));
        } else {
            player.sendMessage("Deposit failed: " + deposit.errorMessage);
        }

        return true;
    }
}
```

### Transfer Money Between Players

```java
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class EconomyUtil {

    public static boolean transfer(Economy economy, OfflinePlayer from, OfflinePlayer to, double amount) {
        if (!economy.has(from, amount)) {
            return false;
        }
        EconomyResponse withdraw = economy.withdrawPlayer(from, amount);
        if (!withdraw.transactionSuccess()) {
            return false;
        }
        EconomyResponse deposit = economy.depositPlayer(to, amount);
        if (!deposit.transactionSuccess()) {
            // Refund on failure
            economy.depositPlayer(from, amount);
            return false;
        }
        return true;
    }

    public static boolean ensureAccount(Economy economy, OfflinePlayer player) {
        if (!economy.hasAccount(player)) {
            return economy.createPlayerAccount(player);
        }
        return true;
    }
}
```

---

## Permissions Examples

### Check and Modify Permissions

```java
import net.milkbowl.vault.permission.Permission;
import org.bukkit.entity.Player;

public class PermissionUtil {

    private final Permission permissions;

    public PermissionUtil(Permission permissions) {
        this.permissions = permissions;
    }

    public boolean canBuild(Player player) {
        return permissions.has(player, "myplugin.build");
    }

    public void grantPermission(Player player, String permission) {
        permissions.playerAdd(player, permission);
    }

    public void revokePermission(Player player, String permission) {
        permissions.playerRemove(player, permission);
    }

    // Transient permissions last only for the current session (not saved to disk)
    public void grantTemporary(Player player, String permission) {
        permissions.playerAddTransient(player, permission);
    }

    public void revokeTemporary(Player player, String permission) {
        permissions.playerRemoveTransient(player, permission);
    }

    public String getPrimaryGroup(Player player) {
        return permissions.getPrimaryGroup(player);
    }

    public String[] getGroups(Player player) {
        return permissions.getPlayerGroups(player);
    }

    public boolean isInGroup(Player player, String group) {
        return permissions.playerInGroup(player, group);
    }

    public void addToGroup(Player player, String group) {
        permissions.playerAddGroup(player, group);
    }

    public void removeFromGroup(Player player, String group) {
        permissions.playerRemoveGroup(player, group);
    }

    // Group-level permission management
    public void addGroupPermission(String world, String group, String permission) {
        permissions.groupAdd(world, group, permission);
    }

    public void removeGroupPermission(String world, String group, String permission) {
        permissions.groupRemove(world, group, permission);
    }

    public String[] getAllGroups() {
        return permissions.getGroups();
    }
}
```

---

## Chat Examples

### Get and Set Prefix/Suffix

```java
import net.milkbowl.vault.chat.Chat;
import org.bukkit.entity.Player;

public class ChatUtil {

    private final Chat chat;

    public ChatUtil(Chat chat) {
        this.chat = chat;
    }

    public String getPrefix(Player player) {
        return chat.getPlayerPrefix(player);
    }

    public String getSuffix(Player player) {
        return chat.getPlayerSuffix(player);
    }

    public void setPrefix(Player player, String prefix) {
        chat.setPlayerPrefix(player, prefix);
    }

    public void setSuffix(Player player, String suffix) {
        chat.setPlayerSuffix(player, suffix);
    }

    // Group-level prefix/suffix
    public String getGroupPrefix(String world, String group) {
        return chat.getGroupPrefix(world, group);
    }

    public void setGroupPrefix(String world, String group, String prefix) {
        chat.setGroupPrefix(world, group, prefix);
    }

    public String getGroupSuffix(String world, String group) {
        return chat.getGroupSuffix(world, group);
    }

    public void setGroupSuffix(String world, String group, String suffix) {
        chat.setGroupSuffix(world, group, suffix);
    }

    // Build a formatted display name
    public String getFormattedName(Player player) {
        String prefix = getPrefix(player);
        String suffix = getSuffix(player);
        return (prefix != null ? prefix : "") + player.getName() + (suffix != null ? suffix : "");
    }
}
```

---

## API Reference

### `net.milkbowl.vault.economy.Economy` (Interface)

| Method | Returns | Description |
|---|---|---|
| `isEnabled()` | `boolean` | Whether the economy provider is active |
| `getName()` | `String` | Name of the economy implementation |
| `hasBankSupport()` | `boolean` | Whether bank accounts are supported |
| `fractionalDigits()` | `int` | Number of decimal places maintained |
| `format(double amount)` | `String` | Format amount as currency string (e.g. "$1,000.00") |
| `currencyNamePlural()` | `String` | Plural currency name (e.g. "Dollars") |
| `currencyNameSingular()` | `String` | Singular currency name (e.g. "Dollar") |
| `hasAccount(OfflinePlayer player)` | `boolean` | Whether the player has an account |
| `hasAccount(OfflinePlayer player, String world)` | `boolean` | World-specific account check |
| `getBalance(OfflinePlayer player)` | `double` | Get player balance |
| `getBalance(OfflinePlayer player, String world)` | `double` | Get player balance in specific world |
| `has(OfflinePlayer player, double amount)` | `boolean` | Whether player has at least this amount |
| `has(OfflinePlayer player, String world, double amount)` | `boolean` | World-specific balance check |
| `withdrawPlayer(OfflinePlayer player, double amount)` | `EconomyResponse` | Withdraw from player |
| `withdrawPlayer(OfflinePlayer player, String world, double amount)` | `EconomyResponse` | World-specific withdrawal |
| `depositPlayer(OfflinePlayer player, double amount)` | `EconomyResponse` | Deposit to player |
| `depositPlayer(OfflinePlayer player, String world, double amount)` | `EconomyResponse` | World-specific deposit |
| `createPlayerAccount(OfflinePlayer player)` | `boolean` | Create a player account |
| `createPlayerAccount(OfflinePlayer player, String world)` | `boolean` | Create world-specific account |
| `createBank(String name, OfflinePlayer player)` | `EconomyResponse` | Create a bank owned by player |
| `deleteBank(String name)` | `EconomyResponse` | Delete a bank |
| `bankBalance(String name)` | `EconomyResponse` | Get bank balance |
| `bankHas(String name, double amount)` | `EconomyResponse` | Check if bank has amount |
| `bankWithdraw(String name, double amount)` | `EconomyResponse` | Withdraw from bank |
| `bankDeposit(String name, double amount)` | `EconomyResponse` | Deposit to bank |
| `isBankOwner(String name, OfflinePlayer player)` | `EconomyResponse` | Check if player owns bank |
| `isBankMember(String name, OfflinePlayer player)` | `EconomyResponse` | Check if player is bank member |
| `getBanks()` | `List<String>` | Get all bank names |

### `net.milkbowl.vault.economy.EconomyResponse` (Class)

| Field/Method | Type | Description |
|---|---|---|
| `amount` | `double` | Amount modified by the transaction |
| `balance` | `double` | New balance after the transaction |
| `type` | `ResponseType` | `SUCCESS`, `FAILURE`, or `NOT_IMPLEMENTED` |
| `errorMessage` | `String` | Error message if `type` is `FAILURE` |
| `transactionSuccess()` | `boolean` | Returns `true` if `type == ResponseType.SUCCESS` |

### `net.milkbowl.vault.permission.Permission` (Abstract Class)

| Method | Returns | Description |
|---|---|---|
| `isEnabled()` | `boolean` | Whether the permission provider is active |
| `getName()` | `String` | Name of the permission implementation |
| `hasGroupSupport()` | `boolean` | Whether the provider supports groups |
| `hasSuperPermsCompat()` | `boolean` | Whether SuperPerms is supported |
| `has(Player player, String permission)` | `boolean` | Check if player has permission |
| `playerHas(Player player, String permission)` | `boolean` | Same as `has()` |
| `playerHas(String world, OfflinePlayer player, String permission)` | `boolean` | World-specific permission check |
| `playerAdd(Player player, String permission)` | `boolean` | Add permission to player |
| `playerAdd(String world, OfflinePlayer player, String permission)` | `boolean` | Add permission in specific world |
| `playerRemove(Player player, String permission)` | `boolean` | Remove permission from player |
| `playerRemove(String world, OfflinePlayer player, String permission)` | `boolean` | Remove permission in specific world |
| `playerAddTransient(Player player, String permission)` | `boolean` | Add session-only permission |
| `playerAddTransient(String world, OfflinePlayer player, String permission)` | `boolean` | Add world-specific transient permission |
| `playerRemoveTransient(Player player, String permission)` | `boolean` | Remove transient permission |
| `playerRemoveTransient(String world, OfflinePlayer player, String permission)` | `boolean` | Remove world-specific transient permission |
| `playerInGroup(Player player, String group)` | `boolean` | Check if player is in group |
| `playerInGroup(String world, OfflinePlayer player, String group)` | `boolean` | World-specific group check |
| `playerAddGroup(Player player, String group)` | `boolean` | Add player to group |
| `playerAddGroup(String world, OfflinePlayer player, String group)` | `boolean` | Add player to group in specific world |
| `playerRemoveGroup(Player player, String group)` | `boolean` | Remove player from group |
| `playerRemoveGroup(String world, OfflinePlayer player, String group)` | `boolean` | Remove player from group in specific world |
| `getPlayerGroups(Player player)` | `String[]` | Get all groups the player is in |
| `getPlayerGroups(String world, OfflinePlayer player)` | `String[]` | World-specific group list |
| `getPrimaryGroup(Player player)` | `String` | Get player's primary group |
| `getPrimaryGroup(String world, OfflinePlayer player)` | `String` | World-specific primary group |
| `getGroups()` | `String[]` | Get all registered groups |
| `groupHas(String world, String group, String permission)` | `boolean` | Check if group has permission |
| `groupAdd(String world, String group, String permission)` | `boolean` | Add permission to group |
| `groupRemove(String world, String group, String permission)` | `boolean` | Remove permission from group |

### `net.milkbowl.vault.chat.Chat` (Abstract Class)

| Method | Returns | Description |
|---|---|---|
| `isEnabled()` | `boolean` | Whether the chat provider is active |
| `getName()` | `String` | Name of the chat implementation |
| `getPlayerPrefix(Player player)` | `String` | Get player's prefix |
| `getPlayerPrefix(String world, OfflinePlayer player)` | `String` | World-specific player prefix |
| `setPlayerPrefix(Player player, String prefix)` | `void` | Set player's prefix |
| `setPlayerPrefix(String world, OfflinePlayer player, String prefix)` | `void` | Set world-specific player prefix |
| `getPlayerSuffix(Player player)` | `String` | Get player's suffix |
| `getPlayerSuffix(String world, OfflinePlayer player)` | `String` | World-specific player suffix |
| `setPlayerSuffix(Player player, String suffix)` | `void` | Set player's suffix |
| `setPlayerSuffix(String world, OfflinePlayer player, String suffix)` | `void` | Set world-specific player suffix |
| `getGroupPrefix(String world, String group)` | `String` | Get group prefix |
| `setGroupPrefix(String world, String group, String prefix)` | `void` | Set group prefix |
| `getGroupSuffix(String world, String group)` | `String` | Get group suffix |
| `setGroupSuffix(String world, String group, String suffix)` | `void` | Set group suffix |
| `getPlayerInfoInteger(Player player, String node, int defaultValue)` | `int` | Get player info integer metadata |
| `setPlayerInfoInteger(Player player, String node, int value)` | `void` | Set player info integer metadata |
| `getPlayerInfoDouble(Player player, String node, double defaultValue)` | `double` | Get player info double metadata |
| `setPlayerInfoDouble(Player player, String node, double value)` | `void` | Set player info double metadata |
| `getPlayerInfoBoolean(Player player, String node, boolean defaultValue)` | `boolean` | Get player info boolean metadata |
| `setPlayerInfoBoolean(Player player, String node, boolean value)` | `void` | Set player info boolean metadata |
| `getPlayerInfoString(Player player, String node, String defaultValue)` | `String` | Get player info string metadata |
| `setPlayerInfoString(Player player, String node, String value)` | `void` | Set player info string metadata |
| `getGroupInfoInteger(String world, String group, String node, int defaultValue)` | `int` | Get group info integer |
| `setGroupInfoInteger(String world, String group, String node, int value)` | `void` | Set group info integer |
| `getGroupInfoDouble(String world, String group, String node, double defaultValue)` | `double` | Get group info double |
| `setGroupInfoDouble(String world, String group, String node, double value)` | `void` | Set group info double |
| `getGroupInfoBoolean(String world, String group, String node, boolean defaultValue)` | `boolean` | Get group info boolean |
| `setGroupInfoBoolean(String world, String group, String node, boolean value)` | `void` | Set group info boolean |
| `getGroupInfoString(String world, String group, String node, String defaultValue)` | `String` | Get group info string |
| `setGroupInfoString(String world, String group, String node, String value)` | `void` | Set group info string |
| `getPlayerGroups(Player player)` | `String[]` | Get player's groups |
| `getPrimaryGroup(Player player)` | `String` | Get player's primary group |
| `getGroups()` | `String[]` | Get all registered groups |
