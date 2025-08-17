# Vault API Reference

## Package: net.milkbowl.vault

### Class: net.milkbowl.vault.Vault
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- boolean onCommand(CommandSender, Command, String, String[])
- void onEnable()
- void onDisable()
- double updateCheck(double)

### Class: net.milkbowl.vault.VaultEco
Type: Class
Implements: com.nijikokun.register.payment.Method

Methods:
- String getVersion()
- String getName()
- boolean hasAccount(String)
- void setPlugin(Plugin)
- String format(double)
- boolean createAccount(String, Double)
- boolean createAccount(String)
- boolean isCompatible(Plugin)
- Method$MethodBankAccount getBankAccount(String, String)
- boolean hasBank(String)
- Method$MethodAccount getAccount(String)
- Vault getPlugin()
- Object getPlugin()
- int fractionalDigits()
- boolean hasBanks()
- boolean hasBankAccount(String, String)

## Package: net.milkbowl.vault.chat

### Class: net.milkbowl.vault.chat.Chat
Type: Abstract Class

Methods:
- String getName()
- void setPlayerInfoInteger(String, OfflinePlayer, String, int)
- void setPlayerInfoInteger(String, String, String, int)
- void setPlayerInfoInteger(World, String, String, int)
- void setPlayerInfoInteger(Player, String, int)
- void setGroupInfoString(String, String, String, String)
- void setGroupInfoString(World, String, String, String)
- String getGroupInfoString(String, String, String, String)
- String getGroupInfoString(World, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- boolean getGroupInfoBoolean(World, String, String, boolean)
- void setGroupPrefix(String, String, String)
- void setGroupPrefix(World, String, String)
- boolean getPlayerInfoBoolean(String, OfflinePlayer, String, boolean)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- boolean getPlayerInfoBoolean(World, String, String, boolean)
- boolean getPlayerInfoBoolean(Player, String, boolean)
- String[] getPlayerGroups(String, OfflinePlayer)
- String[] getPlayerGroups(String, String)
- String[] getPlayerGroups(World, String)
- String[] getPlayerGroups(Player)
- void setPlayerInfoString(String, OfflinePlayer, String, String)
- void setPlayerInfoString(String, String, String, String)
- void setPlayerInfoString(World, String, String, String)
- void setPlayerInfoString(Player, String, String)
- boolean playerInGroup(String, OfflinePlayer, String)
- boolean playerInGroup(String, String, String)
- boolean playerInGroup(World, String, String)
- boolean playerInGroup(Player, String)
- String getGroupSuffix(String, String)
- String getGroupSuffix(World, String)
- void setPlayerInfoBoolean(String, OfflinePlayer, String, boolean)
- void setPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoBoolean(World, String, String, boolean)
- void setPlayerInfoBoolean(Player, String, boolean)
- String[] getGroups()
- String getPlayerPrefix(String, String)
- String getPlayerPrefix(String, OfflinePlayer)
- String getPlayerPrefix(World, String)
- String getPlayerPrefix(Player)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setGroupInfoBoolean(World, String, String, boolean)
- String getPrimaryGroup(String, OfflinePlayer)
- String getPrimaryGroup(String, String)
- String getPrimaryGroup(World, String)
- String getPrimaryGroup(Player)
- void setPlayerPrefix(String, String, String)
- void setPlayerPrefix(String, OfflinePlayer, String)
- void setPlayerPrefix(World, String, String)
- void setPlayerPrefix(Player, String)
- String getPlayerInfoString(String, OfflinePlayer, String, String)
- String getPlayerInfoString(String, String, String, String)
- String getPlayerInfoString(World, String, String, String)
- String getPlayerInfoString(Player, String, String)
- void setGroupSuffix(String, String, String)
- void setGroupSuffix(World, String, String)
- void setGroupInfoInteger(String, String, String, int)
- void setGroupInfoInteger(World, String, String, int)
- String getGroupPrefix(String, String)
- String getGroupPrefix(World, String)
- void setGroupInfoDouble(String, String, String, double)
- void setGroupInfoDouble(World, String, String, double)
- void setPlayerSuffix(String, String, String)
- void setPlayerSuffix(String, OfflinePlayer, String)
- void setPlayerSuffix(World, String, String)
- void setPlayerSuffix(Player, String)
- double getGroupInfoDouble(String, String, String, double)
- double getGroupInfoDouble(World, String, String, double)
- double getPlayerInfoDouble(String, OfflinePlayer, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(World, String, String, double)
- double getPlayerInfoDouble(Player, String, double)
- int getPlayerInfoInteger(String, OfflinePlayer, String, int)
- int getPlayerInfoInteger(String, String, String, int)
- int getPlayerInfoInteger(World, String, String, int)
- int getPlayerInfoInteger(Player, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- int getGroupInfoInteger(World, String, String, int)
- String getPlayerSuffix(String, String)
- String getPlayerSuffix(String, OfflinePlayer)
- String getPlayerSuffix(World, String)
- String getPlayerSuffix(Player)
- void setPlayerInfoDouble(String, OfflinePlayer, String, double)
- void setPlayerInfoDouble(String, String, String, double)
- void setPlayerInfoDouble(World, String, String, double)
- void setPlayerInfoDouble(Player, String, double)

## Package: net.milkbowl.vault.chat.plugins

### Class: net.milkbowl.vault.chat.plugins.Chat_DroxPerms
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- void setGroupPrefix(String, String, String)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupSuffix(String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setGroupInfoDouble(String, String, String, double)
- void setPlayerSuffix(String, String, String)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- String getPlayerSuffix(String, String)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_GroupManager
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- void setGroupPrefix(String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- String getPrimaryGroup(String, String)
- void setPlayerPrefix(String, String, String)
- void setGroupSuffix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setPlayerSuffix(String, String, String)
- void setGroupInfoDouble(String, String, String, double)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- String getPlayerSuffix(String, String)
- int getGroupInfoInteger(String, String, String, int)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_OverPermissions
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- void setGroupPrefix(String, String, String)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupSuffix(String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setGroupInfoDouble(String, String, String, double)
- void setPlayerSuffix(String, String, String)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- String getPlayerSuffix(String, String)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_Permissions3
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- void setGroupPrefix(String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setGroupInfo(String, String, String, Object)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, String, String)
- void setGroupSuffix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setGroupInfoDouble(String, String, String, double)
- void setPlayerSuffix(String, String, String)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- String getPlayerSuffix(String, String)
- void setPlayerInfo(String, String, String, Object)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_PermissionsEx
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, OfflinePlayer, String, int)
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- void setGroupPrefix(String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- boolean getPlayerInfoBoolean(String, OfflinePlayer, String, boolean)
- void setPlayerInfoString(String, OfflinePlayer, String, String)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, OfflinePlayer, String, boolean)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, OfflinePlayer)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, OfflinePlayer, String)
- void setPlayerPrefix(String, String, String)
- void setGroupSuffix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- String getPlayerInfoString(String, OfflinePlayer, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setPlayerSuffix(String, OfflinePlayer, String)
- void setPlayerSuffix(String, String, String)
- void setGroupInfoDouble(String, String, String, double)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, OfflinePlayer, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- int getPlayerInfoInteger(String, OfflinePlayer, String, int)
- boolean isEnabled()
- String getPlayerSuffix(String, OfflinePlayer)
- String getPlayerSuffix(String, String)
- int getGroupInfoInteger(String, String, String, int)
- void setPlayerInfoDouble(String, OfflinePlayer, String, double)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_Privileges
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- void setGroupPrefix(String, String, String)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupSuffix(String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setGroupInfoDouble(String, String, String, double)
- void setPlayerSuffix(String, String, String)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- String getPlayerSuffix(String, String)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_TotalPermissions
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- void setGroupPrefix(String, String, String)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupSuffix(String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setGroupInfoDouble(String, String, String, double)
- void setPlayerSuffix(String, String, String)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- String getPlayerSuffix(String, String)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_bPermissions
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- void setGroupPrefix(String, String, String)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupSuffix(String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setGroupInfoDouble(String, String, String, double)
- void setPlayerSuffix(String, String, String)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- String getPlayerSuffix(String, String)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_bPermissions2
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- void setGroupPrefix(String, String, String)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupSuffix(String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setGroupInfoDouble(String, String, String, double)
- void setPlayerSuffix(String, String, String)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- String getPlayerSuffix(String, String)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_iChat
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- void setGroupPrefix(String, String, String)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupSuffix(String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setGroupInfoDouble(String, String, String, double)
- void setPlayerSuffix(String, String, String)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- String getPlayerSuffix(String, String)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_mChat
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- void setGroupPrefix(String, String, String)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupSuffix(String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setGroupInfoDouble(String, String, String, double)
- void setPlayerSuffix(String, String, String)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- String getPlayerSuffix(String, String)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_mChatSuite
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- void setGroupPrefix(String, String, String)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupSuffix(String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setGroupInfoDouble(String, String, String, double)
- void setPlayerSuffix(String, String, String)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- String getPlayerSuffix(String, String)
- void setPlayerInfoDouble(String, String, String, double)

### Class: net.milkbowl.vault.chat.plugins.Chat_rscPermissions
Type: Class
Extends: net.milkbowl.vault.chat.Chat

Methods:
- String getName()
- void setPlayerInfoInteger(String, String, String, int)
- void setGroupInfoString(String, String, String, String)
- String getGroupInfoString(String, String, String, String)
- boolean getGroupInfoBoolean(String, String, String, boolean)
- void setGroupPrefix(String, String, String)
- boolean getPlayerInfoBoolean(String, String, String, boolean)
- void setPlayerInfoString(String, String, String, String)
- String getGroupSuffix(String, String)
- void setPlayerInfoBoolean(String, String, String, boolean)
- String getPlayerPrefix(String, String)
- void setGroupInfoBoolean(String, String, String, boolean)
- void setPlayerPrefix(String, String, String)
- String getPlayerInfoString(String, String, String, String)
- void setGroupSuffix(String, String, String)
- void setGroupInfoInteger(String, String, String, int)
- String getGroupPrefix(String, String)
- void setGroupInfoDouble(String, String, String, double)
- void setPlayerSuffix(String, String, String)
- double getGroupInfoDouble(String, String, String, double)
- double getPlayerInfoDouble(String, String, String, double)
- int getPlayerInfoInteger(String, String, String, int)
- boolean isEnabled()
- int getGroupInfoInteger(String, String, String, int)
- String getPlayerSuffix(String, String)
- void setPlayerInfoDouble(String, String, String, double)

## Package: net.milkbowl.vault.economy

### Class: net.milkbowl.vault.economy.Economy
Type: Interface

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(OfflinePlayer)
- boolean hasAccount(String, String)
- boolean hasAccount(OfflinePlayer, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(OfflinePlayer, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse depositPlayer(OfflinePlayer, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(OfflinePlayer, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse withdrawPlayer(OfflinePlayer, String, double)
- EconomyResponse createBank(String, String)
- EconomyResponse createBank(String, OfflinePlayer)
- List getBanks()
- double getBalance(String)
- double getBalance(OfflinePlayer)
- double getBalance(String, String)
- double getBalance(OfflinePlayer, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(OfflinePlayer)
- boolean createPlayerAccount(String, String)
- boolean createPlayerAccount(OfflinePlayer, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- EconomyResponse isBankMember(String, OfflinePlayer)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- EconomyResponse isBankOwner(String, OfflinePlayer)
- boolean has(String, double)
- boolean has(OfflinePlayer, double)
- boolean has(String, String, double)
- boolean has(OfflinePlayer, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.AbstractEconomy
Type: Abstract Class
Implements: net.milkbowl.vault.economy.Economy

Methods:
- double getBalance(OfflinePlayer)
- double getBalance(OfflinePlayer, String)
- boolean createPlayerAccount(OfflinePlayer)
- boolean createPlayerAccount(OfflinePlayer, String)
- boolean hasAccount(OfflinePlayer)
- boolean hasAccount(OfflinePlayer, String)
- EconomyResponse depositPlayer(OfflinePlayer, double)
- EconomyResponse depositPlayer(OfflinePlayer, String, double)
- EconomyResponse isBankMember(String, OfflinePlayer)
- EconomyResponse withdrawPlayer(OfflinePlayer, double)
- EconomyResponse withdrawPlayer(OfflinePlayer, String, double)
- EconomyResponse isBankOwner(String, OfflinePlayer)
- boolean has(OfflinePlayer, double)
- boolean has(OfflinePlayer, String, double)
- EconomyResponse createBank(String, OfflinePlayer)

### Class: net.milkbowl.vault.economy.EconomyResponse
Type: Class

Methods:
- boolean transactionSuccess()

## Package: net.milkbowl.vault.economy.plugins

### Class: net.milkbowl.vault.economy.plugins.Economy_BOSE7
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- boolean has(String, double)
- boolean has(String, String, double)
- EconomyResponse isBankOwner(String, String)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_CommandsEX
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_Craftconomy3
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_CurrencyCore
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_DigiCoin
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_Dosh
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_EconXP
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_Essentials
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse tryDepositPlayer(String, double, int)
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_GoldIsMoney2
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_GoldenChestEconomy
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_Gringotts
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_McMoney
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_MiConomy
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_MineConomy
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_Minefaconomy
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_MultiCurrency
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_SDFEconomy
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- void unload_api()
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- void load_api()
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_TAEcon
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_XPBank
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_eWallet
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

### Class: net.milkbowl.vault.economy.plugins.Economy_iConomy6
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(String, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse createBank(String, String)
- List getBanks()
- double getBalance(String)
- double getBalance(String, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(String, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- boolean has(String, double)
- boolean has(String, String, double)
- boolean hasBankSupport()

## Package: net.milkbowl.vault.metrics.bukkit

### Class: net.milkbowl.vault.metrics.bukkit.Metrics
Type: Class

Methods:
- JsonObject getPluginData()
- boolean isEnabled()
- void addCustomChart(Metrics$CustomChart)

## Package: net.milkbowl.vault.permission

### Class: net.milkbowl.vault.permission.Permission
Type: Abstract Class

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- String getPrimaryGroup(World, String)
- String getPrimaryGroup(String, OfflinePlayer)
- String getPrimaryGroup(Player)
- boolean playerRemove(String, String, String)
- boolean playerRemove(String, OfflinePlayer, String)
- boolean playerRemove(World, String, String)
- boolean playerRemove(Player, String)
- boolean playerAddTransient(OfflinePlayer, String) throws UnsupportedOperationException
- boolean playerAddTransient(Player, String)
- boolean playerAddTransient(String, OfflinePlayer, String)
- boolean playerAddTransient(String, Player, String)
- boolean playerAdd(String, String, String)
- boolean playerAdd(World, String, String)
- boolean playerAdd(String, OfflinePlayer, String)
- boolean playerAdd(Player, String)
- boolean playerRemoveGroup(String, String, String)
- boolean playerRemoveGroup(World, String, String)
- boolean playerRemoveGroup(String, OfflinePlayer, String)
- boolean playerRemoveGroup(Player, String)
- boolean groupAdd(String, String, String)
- boolean groupAdd(World, String, String)
- boolean playerHas(String, String, String)
- boolean playerHas(World, String, String)
- boolean playerHas(String, OfflinePlayer, String)
- boolean playerHas(Player, String)
- boolean groupRemove(String, String, String)
- boolean groupRemove(World, String, String)
- boolean hasSuperPermsCompat()
- boolean groupHas(String, String, String)
- boolean groupHas(World, String, String)
- boolean playerAddGroup(String, String, String)
- boolean playerAddGroup(World, String, String)
- boolean playerAddGroup(String, OfflinePlayer, String)
- boolean playerAddGroup(Player, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- String[] getPlayerGroups(World, String)
- String[] getPlayerGroups(String, OfflinePlayer)
- String[] getPlayerGroups(Player)
- boolean playerRemoveTransient(String, OfflinePlayer, String)
- boolean playerRemoveTransient(String, Player, String)
- boolean playerRemoveTransient(OfflinePlayer, String)
- boolean playerRemoveTransient(Player, String)
- boolean playerInGroup(String, String, String)
- boolean playerInGroup(World, String, String)
- boolean playerInGroup(String, OfflinePlayer, String)
- boolean playerInGroup(Player, String)
- boolean has(String, String, String)
- boolean has(World, String, String)
- boolean has(CommandSender, String)
- boolean has(Player, String)
- String[] getGroups()

## Package: net.milkbowl.vault.permission.plugins

### Class: net.milkbowl.vault.permission.plugins.Permission_DroxPerms
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean groupRemove(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_GroupManager
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupRemove(String, String, String)
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_KPerms
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean groupRemove(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_OverPermissions
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupRemove(String, String, String)
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_Permissions3
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAddTransient(Player, String)
- boolean playerAddTransient(String, Player, String)
- boolean playerAdd(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean playerHas(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupRemove(String, String, String)
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- boolean playerRemoveTransient(Player, String)
- boolean playerRemoveTransient(String, Player, String)
- String[] getPlayerGroups(String, String)
- boolean has(CommandSender, String)
- boolean has(Player, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_PermissionsBukkit
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupRemove(String, String, String)
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_PermissionsEx
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, OfflinePlayer)
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, OfflinePlayer, String)
- boolean playerRemove(String, String, String)
- boolean playerAddTransient(String, Player, String)
- boolean playerAddTransient(Player, String)
- boolean playerAdd(String, OfflinePlayer, String)
- boolean playerAdd(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerRemoveGroup(String, OfflinePlayer, String)
- boolean playerRemoveGroup(String, String, String)
- boolean playerHas(String, OfflinePlayer, String)
- boolean playerHas(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupRemove(String, String, String)
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, OfflinePlayer, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- boolean playerRemoveTransient(Player, String)
- boolean playerRemoveTransient(String, Player, String)
- String[] getPlayerGroups(String, OfflinePlayer)
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, OfflinePlayer, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_Privileges
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupRemove(String, String, String)
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_SimplyPerms
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean groupRemove(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_Starburst
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupRemove(String, String, String)
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_SuperPerms
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupRemove(String, String, String)
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_TotalPermissions
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean groupRemove(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_Xperms
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean groupRemove(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_bPermissions
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupRemove(String, String, String)
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_bPermissions2
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupRemove(String, String, String)
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- boolean has(Player, String)
- boolean has(String, String, String)
- boolean has(CommandSender, String)
- boolean has(World, String, String)
- String[] getGroups()

### Class: net.milkbowl.vault.permission.plugins.Permission_rscPermissions
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean groupRemove(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

