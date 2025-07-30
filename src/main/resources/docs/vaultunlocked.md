# VaultUnlocked-2.15.0 API Reference

## Package: net.milkbowl.vault

### Class: net.milkbowl.vault.PluginEnableListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onEvent(PluginEnableEvent)

### Class: net.milkbowl.vault.Vault
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- Vault instance()
- boolean onCommand(CommandSender, Command, String, String[])
- Optional modernProvider()
- void onEnable()
- void onDisable()
- double updateCheck(double)

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

## Package: net.milkbowl.vault.metrics

### Class: net.milkbowl.vault.metrics.MetricsBase
Type: Class

Methods:
- void addCustomChart(CustomChart)

## Package: net.milkbowl.vault.metrics.bukkit

### Class: net.milkbowl.vault.metrics.bukkit.Metrics
Type: Class

Methods:
- void addCustomChart(CustomChart)

## Package: net.milkbowl.vault.metrics.charts

### Class: net.milkbowl.vault.metrics.charts.AdvancedBarChart
Type: Class
Extends: net.milkbowl.vault.metrics.charts.CustomChart

No public methods found

### Class: net.milkbowl.vault.metrics.charts.AdvancedPie
Type: Class
Extends: net.milkbowl.vault.metrics.charts.CustomChart

No public methods found

### Class: net.milkbowl.vault.metrics.charts.CustomChart
Type: Abstract Class

Methods:
- JsonObjectBuilder$JsonObject getRequestJsonObject(BiConsumer, boolean)

### Class: net.milkbowl.vault.metrics.charts.DrilldownPie
Type: Class
Extends: net.milkbowl.vault.metrics.charts.CustomChart

Methods:
- JsonObjectBuilder$JsonObject getChartData() throws Exception

### Class: net.milkbowl.vault.metrics.charts.MultiLineChart
Type: Class
Extends: net.milkbowl.vault.metrics.charts.CustomChart

No public methods found

### Class: net.milkbowl.vault.metrics.charts.SimpleBarChart
Type: Class
Extends: net.milkbowl.vault.metrics.charts.CustomChart

No public methods found

### Class: net.milkbowl.vault.metrics.charts.SimplePie
Type: Class
Extends: net.milkbowl.vault.metrics.charts.CustomChart

No public methods found

### Class: net.milkbowl.vault.metrics.charts.SingleLineChart
Type: Class
Extends: net.milkbowl.vault.metrics.charts.CustomChart

No public methods found

## Package: net.milkbowl.vault.metrics.config

### Class: net.milkbowl.vault.metrics.config.MetricsConfig
Type: Class

Methods:
- boolean isLogResponseStatusTextEnabled()
- boolean isLogSentDataEnabled()
- boolean didExistBefore()
- boolean isEnabled()
- boolean isLogErrorsEnabled()
- String getServerUUID()

## Package: net.milkbowl.vault.metrics.json

### Class: net.milkbowl.vault.metrics.json.JsonObjectBuilder
Type: Class

Methods:
- JsonObjectBuilder$JsonObject build()
- JsonObjectBuilder appendNull(String)
- JsonObjectBuilder appendField(String, String)
- JsonObjectBuilder appendField(String, int)
- JsonObjectBuilder appendField(String, JsonObjectBuilder$JsonObject)
- JsonObjectBuilder appendField(String, String[])
- JsonObjectBuilder appendField(String, int[])
- JsonObjectBuilder appendField(String, JsonObjectBuilder$JsonObject[])

## Package: net.milkbowl.vault.papi

### Class: net.milkbowl.vault.papi.EconomyPlaceholders
Type: Class
Extends: me.clip.placeholderapi.expansion.PlaceholderExpansion

Methods:
- String getVersion()
- String onRequest(OfflinePlayer, String)
- String getAuthor()
- String getIdentifier()
- boolean persist()

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

## Package: net.milkbowl.vault2.chat

### Class: net.milkbowl.vault2.chat.Chat
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

## Package: net.milkbowl.vault2.economy

### Class: net.milkbowl.vault2.economy.Economy
Type: Interface

Methods:
- String defaultCurrencyNameSingular(String)
- boolean renameAccount(UUID, String)
- boolean renameAccount(String, UUID, String)
- String getName()
- List accountsMemberOf(String, UUID)
- boolean hasAccount(UUID)
- boolean hasAccount(UUID, String)
- boolean hasSharedAccountSupport()
- boolean updateAccountPermission(String, UUID, UUID, AccountPermission, boolean)
- boolean setOwner(String, UUID, UUID)
- boolean accountSupportsCurrency(String, UUID, String)
- boolean accountSupportsCurrency(String, UUID, String, String)
- String defaultCurrencyNamePlural(String)
- Optional getAccountName(UUID)
- BigDecimal balance(String, UUID)
- BigDecimal balance(String, UUID, String)
- BigDecimal balance(String, UUID, String, String)
- boolean hasAccountPermission(String, UUID, UUID, AccountPermission)
- boolean has(String, UUID, BigDecimal)
- boolean has(String, UUID, String, BigDecimal)
- boolean has(String, UUID, String, String, BigDecimal)
- boolean isAccountOwner(String, UUID, UUID)
- boolean deleteAccount(String, UUID)
- List accountsAccessTo(String, UUID, AccountPermission[])
- EconomyResponse set(String, UUID, BigDecimal)
- EconomyResponse set(String, UUID, String, BigDecimal)
- EconomyResponse set(String, UUID, String, String, BigDecimal)
- boolean removeAccountMember(String, UUID, UUID)
- List accountsOwnedBy(String, UUID)
- boolean addAccountMember(String, UUID, UUID)
- boolean addAccountMember(String, UUID, UUID, AccountPermission[])
- String format(BigDecimal)
- String format(String, BigDecimal)
- String format(BigDecimal, String)
- String format(String, BigDecimal, String)
- boolean createAccount(UUID, String)
- boolean createAccount(UUID, String, boolean)
- boolean createAccount(UUID, String, String)
- boolean createAccount(UUID, String, String, boolean)
- boolean hasCurrency(String)
- Map getUUIDNameMap()
- BigDecimal getBalance(String, UUID)
- BigDecimal getBalance(String, UUID, String)
- BigDecimal getBalance(String, UUID, String, String)
- boolean isEnabled()
- boolean createSharedAccount(String, UUID, String, UUID)
- EconomyResponse deposit(String, UUID, BigDecimal)
- EconomyResponse deposit(String, UUID, String, BigDecimal)
- EconomyResponse deposit(String, UUID, String, String, BigDecimal)
- String getDefaultCurrency(String)
- int fractionalDigits(String)
- boolean hasMultiCurrencySupport()
- boolean isAccountMember(String, UUID, UUID)
- EconomyResponse withdraw(String, UUID, BigDecimal)
- EconomyResponse withdraw(String, UUID, String, BigDecimal)
- EconomyResponse withdraw(String, UUID, String, String, BigDecimal)
- Collection currencies()

### Class: net.milkbowl.vault2.economy.AccountPermission
Type: Enum
Extends: java.lang.Enum

Methods:
- AccountPermission valueOf(String)
- AccountPermission[] values()

### Class: net.milkbowl.vault2.economy.EconomyResponse
Type: Class

Methods:
- boolean transactionSuccess()

## Package: net.milkbowl.vault2.permission

### Class: net.milkbowl.vault2.permission.Permission
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

