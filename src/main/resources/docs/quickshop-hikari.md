# QuickShop-Hikari-6.2.0.10 API Reference

## Package: com.ghostchu.quickshop

### Class: com.ghostchu.quickshop.BootError
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()
- void printErrors(CommandSender)
- String[] getErrors()

### Class: com.ghostchu.quickshop.BuildInfo
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()
- BuildInfo$JenkinsInfo getCiInfo()
- BuildInfo$GitInfo getGitInfo()

### Class: com.ghostchu.quickshop.BuiltInSolution
Type: Class

Methods:
- BootError databaseError()
- BootError econError()

### Class: com.ghostchu.quickshop.NbtApiInitializer
Type: Class

No public methods found

### Class: com.ghostchu.quickshop.QuickShop
Type: Class
Implements: com.ghostchu.quickshop.api.QuickShopAPI, com.ghostchu.simplereloadlib.Reloadable

Methods:
- QuickShopPAPI getQuickShopPAPI()
- SQLManager getSqlManager()
- AbstractItemStack stack()
- TextManager getTextManager()
- RegistryManager getRegistry()
- GameVersion getGameVersion()
- boolean isPriceChangeRequiresFee()
- Logger logger()
- BootError getBootError()
- ReloadResult reloadModule() throws Exception
- MenuPlayer createMenuPlayer(OfflinePlayer)
- boolean setupDatabase()
- ItemMarker getItemMarker()
- QuickShop$DatabaseDriverType getDatabaseDriverType()
- InventoryWrapperRegistry getInventoryWrapperRegistry()
- VirtualDisplayItemManager getVirtualDisplayItemManager()
- LogWatcher getLogWatcher()
- ReloadManager getReloadManager()
- RankLimiter getRankLimiter()
- MetricManager getMetricManager()
- TextManager text()
- void registerQuickShopCommands()
- ShopControlPanelManager controlPanelManager()
- SignHooker getSignHooker()
- QuickShopBukkit getJavaPlugin()
- String getCurrency()
- ShopPurger getShopPurger()
- SimpleShopPermissionManager getShopPermissionManager()
- PermissionManager getPermissionManager()
- String getMainCommand()
- boolean isValidDisplayProvider()
- OngoingFeeWatcher getOngoingFeeWatcher()
- void setBootError(BootError)
- InventoryWrapperManager getInventoryWrapperManager()
- UpdateWatcher getUpdateWatcher()
- void logEvent(Object)
- DisplayAutoDespawnWatcher getDisplayAutoDespawnWatcher()
- PermissionChecker getPermissionChecker()
- void setupBootError(BootError, boolean)
- void reloadConfigSubModule()
- UUID getServerUniqueID()
- ShopDataSaveWatcher getShopSaveWatcher()
- ShopManager getShopManager()
- boolean isLimit()
- CommandManager getCommandManager()
- PasteManager getPasteManager()
- SignUpdateWatcher getSignUpdateWatcher()
- boolean isTESTING()
- Semver getSemVersion()
- boolean isAllowStack()
- PlayerFinder getPlayerFinder()
- int getDisplayItemCheckTicks()
- PermissionManager perm()
- String getFork()
- CalendarWatcher getCalendarWatcher()
- String getCommandPrefix(String)
- ItemMatcher getItemMatcher()
- InteractionController getInteractionController()
- String getDbPrefix()
- FoliaLib folia()
- File getDataFolder()
- void onEnable()
- void onDisable()
- DatabaseHelper getDatabaseHelper()
- Map getLimits()
- EnvironmentChecker getEnvironmentChecker()
- RollbarErrorReporter getSentryErrorReporter()
- String getVersion()
- BuildInfo getBuildInfo()
- void registerLocalizedTranslationKeyMapping(String, String)
- AbstractEconomy getEconomy()
- MenuHandler menu()
- boolean isDisplayEnabled()
- FileConfiguration getConfig()
- QuickShop$EconomyLoader getEconomyLoader()
- Plugin getPlaceHolderAPI()
- ShopControlPanelManager getShopControlPanelManager()
- void onLoad()
- NexusManager getNexusManager()
- PrivacyController getPrivacyController()
- QuickShop getInstance()
- BungeeListener getBungeeListener()
- ShopItemBlackList getShopItemBlackList()
- ShopLoader getShopLoader()
- Platform getPlatform()

### Class: com.ghostchu.quickshop.QuickShopBukkit
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- String getVersion()
- Logger getBootstrapLogger()
- Logger logger()
- String getFork()
- QuickShop getQuickShop()
- void reloadConfig()
- void onLoad()
- void onEnable()
- void onDisable()
- Platform platform()
- Semver getSemVersion()

### Class: com.ghostchu.quickshop.ServiceInjector
Type: Class

Methods:
- Object getInjectedService(Class, Object)

### Class: com.ghostchu.quickshop.SimpleRankLimiter
Type: Class
Implements: com.ghostchu.simplereloadlib.Reloadable, com.ghostchu.quickshop.api.RankLimiter, com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- Map getLimits()
- int getShopLimit(QUser)
- ReloadResult reloadModule() throws Exception
- boolean isLimit()
- String genBody()

## Package: com.ghostchu.quickshop.api

### Class: com.ghostchu.quickshop.api.QuickShopAPI
Type: Interface

Methods:
- void registerLocalizedTranslationKeyMapping(String, String)
- boolean isAllowStack()
- PlayerFinder getPlayerFinder()
- TextManager getTextManager()
- RegistryManager getRegistry()
- GameVersion getGameVersion()
- boolean isPriceChangeRequiresFee()
- ItemMatcher getItemMatcher()
- Plugin getPluginInstance()
- boolean isDisplayEnabled()
- void logEvent(Object)
- ShopControlPanelManager getShopControlPanelManager()
- DatabaseHelper getDatabaseHelper()
- Map getLimits()
- InventoryWrapperRegistry getInventoryWrapperRegistry()
- ShopManager getShopManager()
- RankLimiter getRankLimiter()
- boolean isLimit()
- CommandManager getCommandManager()
- QuickShopAPI getInstance()
- ShopItemBlackList getShopItemBlackList()
- Semver getSemVersion()

### Class: com.ghostchu.quickshop.api.QuickShopProvider
Type: Interface

Methods:
- QuickShopAPI getApiInstance()
- Plugin getInstance()

### Class: com.ghostchu.quickshop.api.RankLimiter
Type: Interface

Methods:
- Map getLimits()
- int getShopLimit(QUser)
- boolean isLimit()

### Class: com.ghostchu.quickshop.api.CommonUtil
Type: Class

Methods:
- boolean isEmptyComponent(Component)

### Class: com.ghostchu.quickshop.api.GameVersion
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean isVirtualDisplaySupports()
- GameVersion valueOf(String)
- boolean isNewPotionAPI()
- GameVersion get(String)
- GameVersion[] values()
- boolean isEndOfLife()
- boolean isCoreSupports()
- boolean isNewNmsName()
- String[] getMcVersion()

### Class: com.ghostchu.quickshop.api.QuickShopInstanceHolder
Type: Class

No public methods found

## Package: com.ghostchu.quickshop.api.command

### Class: com.ghostchu.quickshop.api.command.CommandHandler
Type: Interface

Methods:
- CompletableFuture getTaggedShops(CommandSender, String)
- Map getShopsByIds(List)
- void onCommand(CommandSender, String, CommandParser)
- void onCommand(CommandSender, String, String[])
- List onTabComplete(CommandSender, String, CommandParser)
- List onTabComplete(CommandSender, String, String[])
- List onTabComplete_Internal(CommandSender, String, String[])
- Shop getLookingShop(CommandSender) throws IllegalStateException
- void onCommand_Internal(CommandSender, String, String[])

### Class: com.ghostchu.quickshop.api.command.CommandManager
Type: Interface

Methods:
- void unregisterCmd(String)
- void unregisterCmd(CommandContainer)
- boolean onCommand(CommandSender, Command, String, String[])
- List onTabComplete(CommandSender, Command, String, String[])
- List getRegisteredCommands()
- void registerCmd(CommandContainer)

### Class: com.ghostchu.quickshop.api.command.CommandProcesser
Type: Interface
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, String[])
- List onTabComplete(CommandSender, String, String[])

### Class: com.ghostchu.quickshop.api.command.CommandContainer
Type: Class

Methods:
- void setDisabled(boolean)
- void setDescription(Function)
- void setPermissions(List)
- void setExecutor(CommandHandler)
- Function getDescription()
- Function getDisableCallback()
- void setSelectivePermissions(List)
- int hashCode()
- void setHidden(boolean)
- void setDisabledSupplier(Supplier)
- CommandContainer$CommandContainerBuilder builder()
- boolean isDisabled()
- void setDisablePlaceholder(Supplier)
- Supplier getDisabledSupplier()
- void bakeExecutorType()
- Class getExecutorType()
- String getPrefix()
- void setDisableCallback(Function)
- Supplier getDisablePlaceholder()
- void setExecutorType(Class)
- List getPermissions()
- CommandHandler getExecutor()
- boolean isHidden()
- List getSelectivePermissions()
- void setPrefix(String)
- boolean equals(Object)
- String toString()
- Component getDisableText(CommandSender)

### Class: com.ghostchu.quickshop.api.command.CommandParser
Type: Class

Methods:
- Map getColonArgs()
- String getRaw()
- List getArgs()

## Package: com.ghostchu.quickshop.api.database

### Class: com.ghostchu.quickshop.api.database.DatabaseHelper
Type: Interface

Methods:
- SQLQuery selectTable(String) throws SQLException
- CompletableFuture updateShop(Shop)
- CompletableFuture cleanMessageForPlayer(UUID)
- CompletableFuture cleanMessage(long)
- CompletableFuture insertHistoryRecord(Object)
- CompletableFuture locateShopDataId(long)
- CompletableFuture saveOfflineTransactionMessage(UUID, String, long)
- CompletableFuture createShop(long)
- CompletableFuture updateExternalInventoryProfileCache(long, int, int)
- CompletableFuture createData(Shop)
- CompletableFuture removeShopMap(String, int, int, int)
- CompletableFuture removeShopTag(UUID, Long, String)
- CompletableFuture removeShopAllTag(UUID, Long)
- CompletableFuture tagShop(UUID, Long, String)
- CompletableFuture getDataRecord(long)
- CompletableFuture removeShop(long)
- SQLQuery selectAllMessages() throws SQLException
- List listTags(UUID)
- CompletableFuture queryInventoryCache(long)
- List listShops(boolean)
- List listShops(String, boolean)
- CompletableFuture removeTagFromShops(UUID, String)
- CompletableFuture getPlayerName(UUID)
- CompletableFuture updatePlayerProfile(UUID, String, String)
- CompletableFuture updatePlayerProfileInBatch(List)
- CompletableFuture createShopMap(long, Location)
- CompletableFuture selectPlayerMessages(UUID)
- List listShopsTaggedBy(UUID, String)
- CompletableFuture getPlayerLocale(UUID)
- CompletableFuture getPlayerLocale(QUser)
- void insertTransactionRecord(UUID, UUID, double, String, double, UUID, String)
- CompletableFuture removeData(long)
- CompletableFuture insertMetricRecord(ShopMetricRecord)
- CompletableFuture locateShopId(String, int, int, int)
- CompletableFuture getPlayerUUID(String)

### Class: com.ghostchu.quickshop.api.database.MetricRecord
Type: Interface

Methods:
- int getX()
- String getWorld()
- UUID getPlayer()
- int getY()
- int getZ()
- ShopOperationEnum getType()
- long getTimestamp()
- double getTotal()
- double getTax()
- int getAmount()

### Class: com.ghostchu.quickshop.api.database.ShopMetricRecord
Type: Class

Methods:
- void setTotal(double)
- String getPlayer()
- void setShopId(long)
- long getShopId()
- long getTime()
- void setPlayer(String)
- void setTax(double)
- void setType(ShopOperationEnum)
- long getV()
- ShopOperationEnum getType()
- int hashCode()
- boolean equals(Object)
- ShopMetricRecord$ShopMetricRecordBuilder builder()
- String toString()
- double getTotal()
- void setAmount(int)
- double getTax()
- void setTime(long)
- int getAmount()

### Class: com.ghostchu.quickshop.api.database.ShopOperationEnum
Type: Enum
Extends: java.lang.Enum

Methods:
- ShopOperationEnum valueOf(String)
- ShopOperationEnum[] values()

## Package: com.ghostchu.quickshop.api.database.bean

### Class: com.ghostchu.quickshop.api.database.bean.DataRecord
Type: Interface

Methods:
- String getCurrency()
- Date getCreateTime()
- String getName()
- String getInventoryWrapper()
- String getEncoded()
- String getBenefit()
- String getPermissions()
- String getItem()
- QUser getOwner()
- double getPrice()
- boolean isUnlimited()
- int getType()
- boolean isHologram()
- QUser getTaxAccount()
- String getInventorySymbolLink()
- String getExtra()

### Class: com.ghostchu.quickshop.api.database.bean.InfoRecord
Type: Interface

Methods:
- int getX()
- String getWorld()
- int getY()
- int getZ()
- long getShopId()

### Class: com.ghostchu.quickshop.api.database.bean.ShopRecord
Type: Class

Methods:
- void setInfoRecord(InfoRecord)
- int hashCode()
- boolean equals(Object)
- String toString()
- InfoRecord getInfoRecord()
- void setDataRecord(DataRecord)
- DataRecord getDataRecord()

## Package: com.ghostchu.quickshop.api.economy

### Class: com.ghostchu.quickshop.api.economy.Benefit
Type: Interface

Methods:
- String serialize()
- void addBenefit(QUser, double) throws Benefit$BenefitOverflowException, Benefit$BenefitExistsException
- double getOverflow(double)
- Map getRegistry()
- boolean isEmpty()
- void removeBenefit(QUser)

### Class: com.ghostchu.quickshop.api.economy.EconomyCore
Type: Interface

Methods:
- String getLastError()
- boolean transfer(QUser, QUser, double, World, String)
- String getName()
- double getBalance(QUser, World, String)
- boolean isValid()
- Plugin getPlugin()
- String format(double, World, String)
- boolean deposit(QUser, double, World, String)
- boolean hasCurrency(World, String)
- boolean withdraw(QUser, double, World, String)
- boolean supportCurrency()

### Class: com.ghostchu.quickshop.api.economy.EconomyTransaction
Type: Interface

Methods:
- World getWorld()
- void setLastError(String)
- boolean commit()
- boolean commit(EconomyTransaction$TransactionCallback)
- QUser getTaxer()
- void setCurrency(String)
- Deque getProcessingStack()
- void setAmount(double)
- boolean checkBalance()
- QUser getFrom()
- double getAmount()
- List rollback(boolean)
- String getCurrency()
- String getLastError()
- void setFrom(QUser)
- void setCore(EconomyCore)
- boolean failSafeCommit()
- QUser getTo()
- void setTaxer(QUser)
- void setTax(double)
- EconomyCore getCore()
- void setAmountAfterTax(double)
- void setTo(QUser)
- double getAmountAfterTax()
- void setWorld(World)
- void setAllowLoan(boolean)
- double getTax()

### Class: com.ghostchu.quickshop.api.economy.AbstractEconomy
Type: Abstract Class
Implements: com.ghostchu.quickshop.api.economy.EconomyCore, com.ghostchu.simplereloadlib.Reloadable

Methods:
- boolean transfer(QUser, QUser, double, World, String)
- double getBalance(QUser, World, String)
- String getName()
- String getProviderName()
- boolean deposit(QUser, double, World, String)
- String toString()
- ReloadResult reloadModule()
- boolean withdraw(QUser, double, World, String)

### Class: com.ghostchu.quickshop.api.economy.EconomyType
Type: Enum
Extends: java.lang.Enum

Methods:
- int toID(EconomyType)
- int toID()
- EconomyType valueOf(String)
- EconomyType[] values()
- EconomyType fromID(int)

### Class: com.ghostchu.quickshop.api.economy.NonSeparateAbstractEconomy
Type: Abstract Class
Extends: com.ghostchu.quickshop.api.economy.AbstractEconomy

Methods:
- boolean transfer(UUID, UUID, double, World, String)
- boolean transfer(String, String, double, World, String)
- double getBalance(QUser, World, String)
- double getBalance(String, World, String)
- double getBalance(UUID, World, String)
- double getBalance(OfflinePlayer, World, String)
- boolean deposit(QUser, double, World, String)
- boolean deposit(String, double, World, String)
- boolean deposit(UUID, double, World, String)
- boolean deposit(OfflinePlayer, double, World, String)
- boolean withdraw(QUser, double, World, String)
- boolean withdraw(String, double, World, String)
- boolean withdraw(UUID, double, World, String)
- boolean withdraw(OfflinePlayer, double, World, String)

## Package: com.ghostchu.quickshop.api.economy.operation

### Class: com.ghostchu.quickshop.api.economy.operation.DepositEconomyOperation
Type: Class
Implements: com.ghostchu.quickshop.api.operation.Operation

Methods:
- boolean rollback()
- boolean isRollback()
- boolean commit()
- boolean isCommitted()

### Class: com.ghostchu.quickshop.api.economy.operation.WithdrawEconomyOperation
Type: Class
Implements: com.ghostchu.quickshop.api.operation.Operation

Methods:
- boolean rollback()
- boolean isRollback()
- boolean commit()
- boolean isCommitted()

## Package: com.ghostchu.quickshop.api.event

### Class: com.ghostchu.quickshop.api.event.QSCancellable
Type: Interface
Implements: org.bukkit.event.Cancellable

Methods:
- Component getCancelReason()
- void setCancelled(boolean, String) throws IllegalStateException
- void setCancelled(boolean, Component) throws IllegalStateException
- void setCancelled(boolean) throws IllegalStateException

### Class: com.ghostchu.quickshop.api.event.AbstractQSEvent
Type: Abstract Class
Extends: org.bukkit.event.Event

Methods:
- boolean callCancellableEvent()
- void callEvent()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: com.ghostchu.quickshop.api.event.CalendarEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- CalendarEvent$CalendarTriggerType getCalendarTriggerType()
- void setCalendarTriggerType(CalendarEvent$CalendarTriggerType)
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: com.ghostchu.quickshop.api.event.Phase
Type: Enum
Extends: java.lang.Enum

Methods:
- Phase valueOf(String)
- Phase[] values()
- boolean allowUpdate()
- boolean cancellable()

### Class: com.ghostchu.quickshop.api.event.PhasedEvent
Type: Abstract Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Methods:
- Component getCancelReason()
- Phase phase()
- boolean isCancelled()
- boolean isPhase(Phase)
- void setCancelled(boolean, Component) throws IllegalStateException
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.QSConfigurationReloadEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- Plugin getInstance()

### Class: com.ghostchu.quickshop.api.event.QSHandleChatEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- int hashCode()
- boolean equals(Object)
- String getMessage()
- String toString()
- QUser getSender()
- void setMessage(String)

## Package: com.ghostchu.quickshop.api.event.display

### Class: com.ghostchu.quickshop.api.event.display.DisplayApplicableCheckEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- UUID getPlayer()
- boolean isApplicable()
- Shop getShop()
- void setApplicable(boolean)

### Class: com.ghostchu.quickshop.api.event.display.ItemPreviewComponentPopulateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- Player getPlayer()
- void setComponent(Component)
- Component getComponent()

### Class: com.ghostchu.quickshop.api.event.display.ItemPreviewComponentPrePopulateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- Player getPlayer()
- void setItemStack(ItemStack)
- ItemStack getItemStack()

### Class: com.ghostchu.quickshop.api.event.display.ShopDisplayItemSpawnEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Methods:
- Component getCancelReason()
- boolean isCancelled()
- DisplayType getDisplayType()
- void setCancelled(boolean, Component)
- Shop getShop()
- ItemStack getItemStack()

## Package: com.ghostchu.quickshop.api.event.economy

### Class: com.ghostchu.quickshop.api.event.economy.EconomyTransactionEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- EconomyTransaction getTransaction()

### Class: com.ghostchu.quickshop.api.event.economy.ShopPurchaseEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Methods:
- void setTotal(double)
- Component getCancelReason()
- boolean isCancelled()
- void setCancelled(boolean, Component)
- Shop getShop()
- double getTotal()
- QUser getPurchaser()
- InventoryWrapper getPurchaserInventory()
- int getAmount()

### Class: com.ghostchu.quickshop.api.event.economy.ShopSuccessPurchaseEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- double getBalance()
- double getBalanceWithoutTax()
- Shop getShop()
- double getTax()
- QUser getPurchaser()
- InventoryWrapper getPurchaserInventory()
- int getAmount()

### Class: com.ghostchu.quickshop.api.event.economy.ShopTaxEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- QUser getUser()
- Shop getShop()
- void setTax(double)
- double getTax()

## Package: com.ghostchu.quickshop.api.event.general

### Class: com.ghostchu.quickshop.api.event.general.ProtectionCheckStatus
Type: Enum
Extends: java.lang.Enum

Methods:
- ProtectionCheckStatus valueOf(String)
- ProtectionCheckStatus[] values()

### Class: com.ghostchu.quickshop.api.event.general.ShopControlPanelOpenEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Methods:
- Component getCancelReason()
- boolean isCancelled()
- void setCancelled(boolean, Component)
- Shop getShop()
- CommandSender getSender()

### Class: com.ghostchu.quickshop.api.event.general.ShopHistoryGuiOpenEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- Player getPlayer()
- List getShops()
- Inventory getInventory()

### Class: com.ghostchu.quickshop.api.event.general.ShopInfoPanelEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Methods:
- Component getCancelReason()
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean, Component)
- Shop getShop()
- UUID getPurchaser()

### Class: com.ghostchu.quickshop.api.event.general.ShopItemMatchEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- ItemStack original()
- ItemStack comparison()
- boolean matches()
- void matches(boolean)

### Class: com.ghostchu.quickshop.api.event.general.ShopOngoingFeeEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Methods:
- Component getCancelReason()
- boolean isCancelled()
- QUser getPlayer()
- void setCancelled(boolean, Component)
- void setCost(double)
- Shop getShop()
- double getCost()

### Class: com.ghostchu.quickshop.api.event.general.ShopProtectionCheckEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- Event getEvent()
- QUser getPlayer()
- Location getLocation()
- ProtectionCheckStatus getStatus()

### Class: com.ghostchu.quickshop.api.event.general.ShopSignUpdateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- Sign getSign()
- Shop getShop()

## Package: com.ghostchu.quickshop.api.event.inventory

### Class: com.ghostchu.quickshop.api.event.inventory.InventoryTransactionEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- InventoryTransaction getTransaction()

### Class: com.ghostchu.quickshop.api.event.inventory.ShopInventoryCalculateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- int hashCode()
- int getSpace()
- boolean equals(Object)
- int getStock()
- Shop getShop()
- String toString()

### Class: com.ghostchu.quickshop.api.event.inventory.ShopInventoryChangedEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- InventoryWrapperManager getInventoryManager()
- InventoryWrapper getInventoryWrapper()

### Class: com.ghostchu.quickshop.api.event.inventory.ShopInventoryPreviewEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Methods:
- Component getCancelReason()
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean, Component)
- ItemStack getItemStack()

## Package: com.ghostchu.quickshop.api.event.management

### Class: com.ghostchu.quickshop.api.event.management.ShopClickEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Methods:
- ShopClickEvent clone(Phase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)
- QUser user()

### Class: com.ghostchu.quickshop.api.event.management.ShopCreateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Methods:
- ShopCreateEvent clone(Phase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)
- Location location()
- QUser user()

### Class: com.ghostchu.quickshop.api.event.management.ShopDatabaseEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Methods:
- ShopDatabaseEvent clone(Phase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.management.ShopDeleteEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Methods:
- boolean memory()
- ShopDeleteEvent clone(Phase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.management.ShopEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.PhasedEvent

Methods:
- Optional shop()
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.management.ShopLoadEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Methods:
- ShopLoadEvent clone(Phase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.management.ShopPermissionCheckEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Methods:
- UUID playerUUID()
- String permissionNode()
- String pluginNamespace()
- boolean hasPermission()
- void hasPermission(boolean)
- ShopPermissionCheckEvent clone(Phase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.management.ShopUnloadEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Methods:
- ShopUnloadEvent clone(Phase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)

## Package: com.ghostchu.quickshop.api.event.packet

### Class: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent
Type: Abstract Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Methods:
- PacketHandler packetHandler()

## Package: com.ghostchu.quickshop.api.event.packet.handler

### Class: com.ghostchu.quickshop.api.event.packet.handler.PacketHandlerAddedEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Methods:
- Component getCancelReason()
- boolean isCancelled()
- void setCancelled(boolean, Component)

### Class: com.ghostchu.quickshop.api.event.packet.handler.PacketHandlerInitEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Methods:
- Component getCancelReason()
- boolean isCancelled()
- void setCancelled(boolean, Component)

## Package: com.ghostchu.quickshop.api.event.packet.send

### Class: com.ghostchu.quickshop.api.event.packet.send.PacketHandlerSendDestroyEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent

Methods:
- PacketFactory packetFactory()
- void packetFactory(PacketFactory)
- Object destroyPacket()
- void destroyPacket(Object)

### Class: com.ghostchu.quickshop.api.event.packet.send.PacketHandlerSendMetaEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent

Methods:
- PacketFactory packetFactory()
- void packetFactory(PacketFactory)
- Object metaPacket()
- void metaPacket(Object)

### Class: com.ghostchu.quickshop.api.event.packet.send.PacketHandlerSendSpawnEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Methods:
- Component getCancelReason()
- boolean isCancelled()
- PacketFactory packetFactory()
- void packetFactory(PacketFactory)
- void setCancelled(boolean, Component)
- Object spawnPacket()
- void spawnPacket(Object)

## Package: com.ghostchu.quickshop.api.event.panel

### Class: com.ghostchu.quickshop.api.event.panel.ControlComponentGenerateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.PhasedEvent

Methods:
- Shop shop()
- ControlComponent old()
- PhasedEvent clone(Phase)
- ControlComponentGenerateEvent clone(Phase, ControlComponent, ControlComponent)
- ControlComponent updated()
- void updated(ControlComponent)
- QUser user()

## Package: com.ghostchu.quickshop.api.event.settings

### Class: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.PhasedEvent

Methods:
- Shop shop()
- Object old()
- PhasedEvent clone(Phase)
- ShopSettingEvent clone(Phase, Object, Object)
- Object updated()
- void updated(Object)

## Package: com.ghostchu.quickshop.api.event.settings.type

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopCurrencyEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopCurrencyEvent PRE(Shop, String)
- ShopCurrencyEvent PRE(Shop, String, String)
- ShopCurrencyEvent POST(Shop, String)
- ShopCurrencyEvent POST(Shop, String, String)
- ShopCurrencyEvent RETRIEVE(Shop, String)
- ShopCurrencyEvent RETRIEVE(Shop, String, String)
- ShopCurrencyEvent clone(Phase)
- ShopCurrencyEvent clone(Phase, String, String)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopCurrencyEvent MAIN(Shop, String)
- ShopCurrencyEvent MAIN(Shop, String, String)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopDisplayEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopDisplayEvent PRE(Shop, Boolean)
- ShopDisplayEvent PRE(Shop, Boolean, Boolean)
- ShopDisplayEvent POST(Shop, Boolean)
- ShopDisplayEvent POST(Shop, Boolean, Boolean)
- ShopDisplayEvent RETRIEVE(Shop, Boolean)
- ShopDisplayEvent RETRIEVE(Shop, Boolean, Boolean)
- ShopDisplayEvent clone(Phase)
- ShopDisplayEvent clone(Phase, Boolean, Boolean)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopDisplayEvent MAIN(Shop, Boolean)
- ShopDisplayEvent MAIN(Shop, Boolean, Boolean)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopItemEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopItemEvent PRE(Shop, ItemStack)
- ShopItemEvent PRE(Shop, ItemStack, ItemStack)
- ShopItemEvent POST(Shop, ItemStack)
- ShopItemEvent POST(Shop, ItemStack, ItemStack)
- ShopItemEvent RETRIEVE(Shop, ItemStack)
- ShopItemEvent RETRIEVE(Shop, ItemStack, ItemStack)
- ShopItemEvent clone(Phase)
- ShopItemEvent clone(Phase, ItemStack, ItemStack)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopItemEvent MAIN(Shop, ItemStack)
- ShopItemEvent MAIN(Shop, ItemStack, ItemStack)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopNameEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopNameEvent PRE(Shop, String)
- ShopNameEvent PRE(Shop, String, String)
- ShopNameEvent POST(Shop, String)
- ShopNameEvent POST(Shop, String, String)
- ShopNameEvent RETRIEVE(Shop, String)
- ShopNameEvent RETRIEVE(Shop, String, String)
- ShopNameEvent clone(Phase)
- ShopNameEvent clone(Phase, String, String)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopNameEvent MAIN(Shop, String)
- ShopNameEvent MAIN(Shop, String, String)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopOwnerEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopOwnerEvent PRE(Shop, QUser)
- ShopOwnerEvent PRE(Shop, QUser, QUser)
- ShopOwnerEvent POST(Shop, QUser)
- ShopOwnerEvent POST(Shop, QUser, QUser)
- ShopOwnerEvent RETRIEVE(Shop, QUser)
- ShopOwnerEvent RETRIEVE(Shop, QUser, QUser)
- ShopOwnerEvent clone(Phase)
- ShopOwnerEvent clone(Phase, QUser, QUser)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopOwnerEvent MAIN(Shop, QUser)
- ShopOwnerEvent MAIN(Shop, QUser, QUser)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopOwnerNameEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopOwnerNameEvent PRE(Shop, Component)
- ShopOwnerNameEvent PRE(Shop, Component, Component)
- ShopOwnerNameEvent POST(Shop, Component)
- ShopOwnerNameEvent POST(Shop, Component, Component)
- ShopOwnerNameEvent RETRIEVE(Shop, Component)
- ShopOwnerNameEvent RETRIEVE(Shop, Component, Component)
- ShopOwnerNameEvent clone(Phase)
- ShopOwnerNameEvent clone(Phase, Component, Component)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopOwnerNameEvent MAIN(Shop, Component)
- ShopOwnerNameEvent MAIN(Shop, Component, Component)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopPlayerGroupEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopPlayerGroupEvent PRE(Shop, UUID, String)
- ShopPlayerGroupEvent PRE(Shop, UUID, String, String)
- ShopPlayerGroupEvent POST(Shop, UUID, String)
- ShopPlayerGroupEvent POST(Shop, UUID, String, String)
- ShopPlayerGroupEvent RETRIEVE(Shop, UUID, String)
- ShopPlayerGroupEvent RETRIEVE(Shop, UUID, String, String)
- ShopPlayerGroupEvent clone(Phase, String, String)
- ShopPlayerGroupEvent clone(Phase)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopPlayerGroupEvent MAIN(Shop, UUID, String)
- ShopPlayerGroupEvent MAIN(Shop, UUID, String, String)
- UUID player()

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopPriceEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopPriceEvent PRE(Shop, Double)
- ShopPriceEvent PRE(Shop, Double, Double)
- ShopPriceEvent POST(Shop, Double)
- ShopPriceEvent POST(Shop, Double, Double)
- ShopPriceEvent RETRIEVE(Shop, Double)
- ShopPriceEvent RETRIEVE(Shop, Double, Double)
- ShopPriceEvent clone(Phase)
- ShopPriceEvent clone(Phase, Double, Double)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopPriceEvent MAIN(Shop, Double)
- ShopPriceEvent MAIN(Shop, Double, Double)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopSignLinesEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopSignLinesEvent PRE(Shop, List)
- ShopSignLinesEvent PRE(Shop, List, List)
- ShopSignLinesEvent POST(Shop, List)
- ShopSignLinesEvent POST(Shop, List, List)
- ShopSignLinesEvent RETRIEVE(Shop, List)
- ShopSignLinesEvent RETRIEVE(Shop, List, List)
- ShopSignLinesEvent clone(Phase)
- ShopSignLinesEvent clone(Phase, List, List)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopSignLinesEvent MAIN(Shop, List)
- ShopSignLinesEvent MAIN(Shop, List, List)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopTaxAccountEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopTaxAccountEvent PRE(Shop, QUser)
- ShopTaxAccountEvent PRE(Shop, QUser, QUser)
- ShopTaxAccountEvent POST(Shop, QUser)
- ShopTaxAccountEvent POST(Shop, QUser, QUser)
- ShopTaxAccountEvent RETRIEVE(Shop, QUser)
- ShopTaxAccountEvent RETRIEVE(Shop, QUser, QUser)
- ShopTaxAccountEvent clone(Phase)
- ShopTaxAccountEvent clone(Phase, QUser, QUser)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopTaxAccountEvent MAIN(Shop, QUser)
- ShopTaxAccountEvent MAIN(Shop, QUser, QUser)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopTypeEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopTypeEvent PRE(Shop, ShopType)
- ShopTypeEvent PRE(Shop, ShopType, ShopType)
- ShopTypeEvent POST(Shop, ShopType)
- ShopTypeEvent POST(Shop, ShopType, ShopType)
- ShopTypeEvent RETRIEVE(Shop, ShopType)
- ShopTypeEvent RETRIEVE(Shop, ShopType, ShopType)
- ShopTypeEvent clone(Phase)
- ShopTypeEvent clone(Phase, ShopType, ShopType)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopTypeEvent MAIN(Shop, ShopType)
- ShopTypeEvent MAIN(Shop, ShopType, ShopType)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopUnlimitedEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopUnlimitedEvent PRE(Shop, Boolean)
- ShopUnlimitedEvent PRE(Shop, Boolean, Boolean)
- ShopUnlimitedEvent POST(Shop, Boolean)
- ShopUnlimitedEvent POST(Shop, Boolean, Boolean)
- ShopUnlimitedEvent RETRIEVE(Shop, Boolean)
- ShopUnlimitedEvent RETRIEVE(Shop, Boolean, Boolean)
- ShopUnlimitedEvent clone(Phase)
- ShopUnlimitedEvent clone(Phase, Boolean, Boolean)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopUnlimitedEvent MAIN(Shop, Boolean)
- ShopUnlimitedEvent MAIN(Shop, Boolean, Boolean)

## Package: com.ghostchu.quickshop.api.event.settings.type.benefit

### Class: com.ghostchu.quickshop.api.event.settings.type.benefit.ShopBenefitAddEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopBenefitAddEvent PRE(Shop, QUser, Double)
- ShopBenefitAddEvent PRE(Shop, QUser, Double, Double)
- ShopBenefitAddEvent POST(Shop, QUser, Double)
- ShopBenefitAddEvent POST(Shop, QUser, Double, Double)
- ShopBenefitAddEvent RETRIEVE(Shop, QUser, Double)
- ShopBenefitAddEvent RETRIEVE(Shop, QUser, Double, Double)
- ShopBenefitAddEvent clone(Phase)
- ShopBenefitAddEvent clone(Phase, Double, Double)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopBenefitAddEvent MAIN(Shop, QUser, Double)
- ShopBenefitAddEvent MAIN(Shop, QUser, Double, Double)
- QUser user()

### Class: com.ghostchu.quickshop.api.event.settings.type.benefit.ShopBenefitEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopBenefitEvent PRE(Shop, Benefit)
- ShopBenefitEvent PRE(Shop, Benefit, Benefit)
- ShopBenefitEvent POST(Shop, Benefit)
- ShopBenefitEvent POST(Shop, Benefit, Benefit)
- ShopBenefitEvent RETRIEVE(Shop, Benefit)
- ShopBenefitEvent RETRIEVE(Shop, Benefit, Benefit)
- ShopBenefitEvent clone(Phase)
- ShopBenefitEvent clone(Phase, Benefit, Benefit)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopBenefitEvent MAIN(Shop, Benefit)
- ShopBenefitEvent MAIN(Shop, Benefit, Benefit)

### Class: com.ghostchu.quickshop.api.event.settings.type.benefit.ShopBenefitRemoveEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Methods:
- ShopBenefitRemoveEvent PRE(Shop, QUser, Double)
- ShopBenefitRemoveEvent PRE(Shop, QUser, Double, Double)
- ShopBenefitRemoveEvent POST(Shop, QUser, Double)
- ShopBenefitRemoveEvent POST(Shop, QUser, Double, Double)
- QUser getUser()
- ShopBenefitRemoveEvent RETRIEVE(Shop, QUser, Double)
- ShopBenefitRemoveEvent RETRIEVE(Shop, QUser, Double, Double)
- ShopBenefitRemoveEvent clone(Phase)
- ShopBenefitRemoveEvent clone(Phase, Double, Double)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- ShopBenefitRemoveEvent MAIN(Shop, QUser, Double)
- ShopBenefitRemoveEvent MAIN(Shop, QUser, Double, Double)

## Package: com.ghostchu.quickshop.api.eventmanager

### Class: com.ghostchu.quickshop.api.eventmanager.QuickEventManager
Type: Interface

Methods:
- void callEvent(Event, Consumer) throws IllegalStateException

## Package: com.ghostchu.quickshop.api.inventory

### Class: com.ghostchu.quickshop.api.inventory.CountableInventoryWrapper
Type: Interface
Implements: com.ghostchu.quickshop.api.inventory.InventoryWrapper

Methods:
- int countSpace(CountableInventoryWrapper$ItemPredicate)
- int countItem(CountableInventoryWrapper$ItemPredicate)

### Class: com.ghostchu.quickshop.api.inventory.InventoryWrapper
Type: Interface
Implements: java.lang.Iterable

Methods:
- InventoryWrapperManager getWrapperManager()
- Map removeItem(ItemStack[])
- Location getLocation()
- boolean isValid()
- void clear()
- void changeItem(InventoryWrapper$ItemChanger)
- boolean isNeedUpdate()
- Map addItem(ItemStack[])
- boolean restoreSnapshot(ItemStack[])
- InventoryWrapperIterator iterator()
- Iterator iterator()
- InventoryWrapperType getInventoryType()
- ItemStack[] createSnapshot()
- void setContents(ItemStack[])
- InventoryHolder getHolder()

### Class: com.ghostchu.quickshop.api.inventory.InventoryWrapperIterator
Type: Interface
Implements: java.util.Iterator

Methods:
- ItemStack next()
- Object next()
- InventoryWrapperIterator ofBukkitInventory(Inventory)
- boolean hasNext()
- InventoryWrapperIterator ofItemStacks(ItemStack[])
- void setCurrent(ItemStack)
- void remove()

### Class: com.ghostchu.quickshop.api.inventory.InventoryWrapperManager
Type: Interface

Methods:
- InventoryWrapper locate(String) throws IllegalArgumentException
- String mklink(InventoryWrapper) throws IllegalArgumentException

### Class: com.ghostchu.quickshop.api.inventory.InventoryWrapperRegistry
Type: Class

Methods:
- String find(InventoryWrapperManager)
- InventoryWrapperManager get(String)
- void unregister(Plugin)
- void register(Plugin, InventoryWrapperManager)

### Class: com.ghostchu.quickshop.api.inventory.InventoryWrapperType
Type: Enum
Extends: java.lang.Enum

Methods:
- InventoryWrapperType valueOf(String)
- InventoryWrapperType[] values()

## Package: com.ghostchu.quickshop.api.localization.text

### Class: com.ghostchu.quickshop.api.localization.text.Text
Type: Interface

Methods:
- String legacy()
- String legacy(String)
- String plain()
- String plain(String)
- boolean isPresent()
- Component forLocale(String)
- Component forLocale()
- void send()

### Class: com.ghostchu.quickshop.api.localization.text.TextList
Type: Interface

Methods:
- boolean isPresent()
- List forLocale(String)
- List forLocale()
- void send()

### Class: com.ghostchu.quickshop.api.localization.text.TextManager
Type: Interface

Methods:
- ProxiedLocale findRelativeLanguages(String)
- ProxiedLocale findRelativeLanguages(CommandSender)
- ProxiedLocale findRelativeLanguages(UUID, boolean)
- ProxiedLocale findRelativeLanguages(QUser, boolean)
- Text of(String, Object[])
- Text of(CommandSender, String, Object[])
- Text of(UUID, String, Object[])
- Text of(QUser, String, Object[])
- boolean localeEnabled(String, List)
- List getAvailableLanguages()
- Component[] convert(Object[])
- TextList ofList(String, Object[])
- TextList ofList(UUID, String, Object[])
- TextList ofList(QUser, String, Object[])
- TextList ofList(CommandSender, String, Object[])
- List getAvailableLocales()
- void register(String, String, String)

### Class: com.ghostchu.quickshop.api.localization.text.ProxiedLocale
Type: Class

Methods:
- NumberFormat getNumberFormat()
- String getOrigin()
- NumberFormat getNf()
- int hashCode()
- void setOrigin(String)
- boolean equals(Object)
- void setRelative(String)
- String toString()
- Locale getJavaLocale()
- String getRelative()
- String getLocale()
- void setNf(NumberFormat)
- void setLocale(Locale)

## Package: com.ghostchu.quickshop.api.localization.text.postprocessor

### Class: com.ghostchu.quickshop.api.localization.text.postprocessor.PostProcessor
Type: Interface

Methods:
- Component process(Component, CommandSender, Component[])

## Package: com.ghostchu.quickshop.api.obj

### Class: com.ghostchu.quickshop.api.obj.QUser
Type: Interface

Methods:
- void setUsername(String)
- Optional getUniqueIdIfRealPlayer()
- void setUniqueId(UUID)
- Optional getBukkitPlayer()
- void setRealPlayer(boolean)
- UUID getUniqueId()
- String getUsername()
- String serialize()
- Optional getUniqueIdOptional()
- boolean isFull()
- Optional getUsernameIfRealPlayer()
- boolean isRealPlayer()
- String getDisplay()
- Optional getUsernameOptional()

## Package: com.ghostchu.quickshop.api.operation

### Class: com.ghostchu.quickshop.api.operation.Operation
Type: Interface

Methods:
- boolean rollback()
- boolean isRollback()
- boolean commit()
- boolean isCommitted()

## Package: com.ghostchu.quickshop.api.permission

### Class: com.ghostchu.quickshop.api.permission.PermissionProvider
Type: Interface

Methods:
- String getName()
- boolean hasPermission(CommandSender, String)
- boolean hasPermission(QUser, String)

### Class: com.ghostchu.quickshop.api.permission.ProviderIsEmptyException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- String getProviderName()

## Package: com.ghostchu.quickshop.api.registry

### Class: com.ghostchu.quickshop.api.registry.Registry
Type: Interface

No public methods found

### Class: com.ghostchu.quickshop.api.registry.RegistryManager
Type: Interface

Methods:
- Map getRegistries()
- Registry getRegistry(BuiltInRegistry)
- Registry getRegistry(String)
- void registerRegistry(String, Registry)
- Map getRegistryList()
- void unregisterRegistry(String)

### Class: com.ghostchu.quickshop.api.registry.BuiltInRegistry
Type: Enum
Extends: java.lang.Enum

Methods:
- String getName()
- BuiltInRegistry valueOf(String)
- BuiltInRegistry[] values()

### Class: com.ghostchu.quickshop.api.registry.PrefixAlreadyRegisteredException
Type: Class
Extends: java.lang.Exception

Methods:
- String getPrefix()
- Plugin getPlugin()
- ItemExpressionHandler getHandler()

## Package: com.ghostchu.quickshop.api.registry.builtin.itemexpression

### Class: com.ghostchu.quickshop.api.registry.builtin.itemexpression.ItemExpressionHandler
Type: Interface
Implements: java.lang.Comparable

Methods:
- String getPrefix()
- String getInternalPrefix0()
- int hashCode()
- Plugin getPlugin()
- boolean match(ItemStack, String)
- int compareTo(ItemExpressionHandler)
- int compareTo(Object)

### Class: com.ghostchu.quickshop.api.registry.builtin.itemexpression.ItemExpressionRegistry
Type: Interface
Implements: com.ghostchu.quickshop.api.registry.Registry

Methods:
- void registerHandler(ItemExpressionHandler) throws PrefixAlreadyRegisteredException
- void unregisterHandlers(Plugin)
- Set getHandlers()
- boolean registerHandlerSafely(ItemExpressionHandler)
- boolean match(ItemStack, String)
- void unregisterHandler(ItemExpressionHandler)
- void unregisterHandler(String)

## Package: com.ghostchu.quickshop.api.serialize

### Class: com.ghostchu.quickshop.api.serialize.BlockPos
Type: Class

Methods:
- String serialize()
- String getWorld()
- int getX()
- int getY()
- int getZ()
- int hashCode()
- boolean equals(Object)
- String toString()
- BlockPos deserialize(String)

## Package: com.ghostchu.quickshop.api.shop

### Class: com.ghostchu.quickshop.api.shop.ControlComponent
Type: Interface

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

### Class: com.ghostchu.quickshop.api.shop.Info
Type: Interface

Methods:
- Location getLocation()
- void setAction(ShopAction)
- boolean hasChanged(Shop)
- Block getSignBlock()
- boolean isBypassed()
- ItemStack getItem()
- ShopAction getAction()

### Class: com.ghostchu.quickshop.api.shop.InventoryTransaction
Type: Interface

Methods:
- List rollback(boolean)
- void setLastError(String)
- String getLastError()
- void setFrom(InventoryWrapper)
- boolean commit()
- boolean commit(InventoryTransaction$TransactionCallback)
- ItemStack getItem()
- boolean failSafeCommit()
- InventoryWrapper getTo()
- Deque getProcessingStack()
- void setTo(InventoryWrapper)
- void setAmount(int)
- void setItem(ItemStack)
- InventoryWrapper getFrom()
- int getAmount()

### Class: com.ghostchu.quickshop.api.shop.ItemMatcher
Type: Interface

Methods:
- String getName()
- Plugin getPlugin()
- boolean matches(ItemStack, ItemStack)

### Class: com.ghostchu.quickshop.api.shop.PlayerFinder
Type: Interface

Methods:
- UUID name2Uuid(String)
- UUID name2Uuid(String, boolean, ExecutorService)
- void cache(UUID, String)
- CompletableFuture uuid2NameFuture(UUID)
- CompletableFuture uuid2NameFuture(UUID, boolean, ExecutorService)
- String uuid2Name(UUID)
- String uuid2Name(UUID, boolean, ExecutorService)
- boolean isCached(UUID)
- CompletableFuture name2UuidFuture(String)
- CompletableFuture name2UuidFuture(String, boolean, ExecutorService)

### Class: com.ghostchu.quickshop.api.shop.PriceLimiter
Type: Interface

Methods:
- PriceLimiterCheckResult check(CommandSender, ItemStack, String, double)
- PriceLimiterCheckResult check(QUser, ItemStack, String, double)

### Class: com.ghostchu.quickshop.api.shop.PriceLimiterCheckResult
Type: Interface

Methods:
- double getMin()
- double getMax()
- PriceLimiterStatus getStatus()

### Class: com.ghostchu.quickshop.api.shop.Shop
Type: Interface

Methods:
- Benefit getShopBenefit()
- void onClick(Player)
- Location getLocation()
- List getSigns()
- ShopType getShopType()
- int getRemainingStock()
- void buy(QUser, InventoryWrapper, Location, int) throws Exception
- boolean playerAuthorize(UUID, Plugin, String)
- boolean playerAuthorize(UUID, BuiltInShopPermission)
- ItemStack getItem()
- void handleLoading()
- void setPrice(double)
- QUser getOwner()
- boolean isLoaded()
- void setOwner(QUser)
- void setShopBenefit(Benefit)
- short getDurability()
- boolean isUnlimited()
- int getRemainingSpace()
- QUser getTaxAccountActual()
- boolean isSelling()
- void checkDisplay()
- String saveToSymbolLink()
- void add(ItemStack, int)
- String getCurrency()
- ShopInfoStorage saveToInfoStorage()
- void setDisableDisplay(boolean)
- void setShopType(ShopType)
- void setSignText()
- void setSignText(List)
- void setSignText(ProxiedLocale)
- boolean matches(ItemStack)
- int getShopStackingAmount()
- boolean isDisableDisplay()
- void setTaxAccount(QUser)
- boolean isAttached(Block)
- void setExtra(Plugin, ConfigurationSection)
- boolean isShopSign(Sign)
- ConfigurationSection getExtra(Plugin)
- void setPlayerGroup(UUID, String)
- void setPlayerGroup(UUID, BuiltInShopPermissionGroup)
- void setShopId(long)
- CompletableFuture update()
- boolean isFreeShop()
- void setInventory(InventoryWrapper, InventoryWrapperManager)
- void setCurrency(String)
- void remove(ItemStack, int)
- void setDirty(boolean)
- void setDirty()
- String getPlayerGroup(UUID)
- boolean isStackingShop()
- void openPreview(Player)
- boolean isDirty()
- Component ownerName(boolean, ProxiedLocale)
- Component ownerName(ProxiedLocale)
- Component ownerName()
- String getShopName()
- void setUnlimited(boolean)
- boolean inventoryAvailable()
- void setShopName(String)
- String getInventoryWrapperProvider()
- InventoryWrapper getInventory()
- boolean isFrozen()
- void setItem(ItemStack)
- void claimShopSign(Sign)
- void handleUnloading(boolean)
- long getShopId()
- void sell(QUser, InventoryWrapper, Location, int) throws Exception
- boolean isValid()
- List getSignText(ProxiedLocale)
- Map getPermissionAudiences()
- void refresh()
- double getPrice()
- boolean isBuying()
- QUser getTaxAccount()
- List playersCanAuthorize(BuiltInShopPermission)
- List playersCanAuthorize(BuiltInShopPermissionGroup)
- List playersCanAuthorize(Plugin, String)
- String saveExtraToYaml()
- UUID getRuntimeRandomUniqueId()

### Class: com.ghostchu.quickshop.api.shop.ShopChunk
Type: Interface

Methods:
- int getX()
- String getWorld()
- int getZ()
- boolean isSame(String, int, int)
- boolean isSame(World, int, int)

### Class: com.ghostchu.quickshop.api.shop.ShopControlPanel
Type: Interface

Methods:
- Plugin getPlugin()
- ShopControlPanelPriority getPriority()
- int getInternalPriority()
- LinkedList generate(Player, Shop)

### Class: com.ghostchu.quickshop.api.shop.ShopControlPanelManager
Type: Interface

Methods:
- LinkedList enabledComponents()
- void unregister(Plugin)
- void unregister(ShopControlPanel)
- void addComponent(ControlComponent)
- void initialize()
- LinkedHashMap controlComponents()
- void openControlPanel(Player, Shop)
- void register(ShopControlPanel)

### Class: com.ghostchu.quickshop.api.shop.ShopItemBlackList
Type: Interface

Methods:
- boolean isBlacklisted(ItemStack)

### Class: com.ghostchu.quickshop.api.shop.ShopManager
Type: Interface

Methods:
- boolean actionBuying(Player, InventoryWrapper, AbstractEconomy, Info, Shop, int)
- void sendSellSuccess(QUser, Shop, int, double, double)
- boolean isReachedLimit(QUser, boolean)
- Shop getShopViaCache(Location)
- List getAllShops()
- List getAllShops(QUser)
- List getAllShops(UUID)
- Map getActions()
- Set getLoadedShops()
- CompletableFuture registerShop(Shop, boolean)
- CompletableFuture unregisterShop(Shop, boolean)
- void createShop(Shop, Block, boolean) throws IllegalStateException
- void handleChat(Player, String)
- void sendPurchaseSuccess(QUser, Shop, int, double, double)
- boolean actionSelling(Player, InventoryWrapper, AbstractEconomy, Info, Shop, int)
- List getShopsInWorld(World)
- List getShopsInWorld(String)
- CompletableFuture removeTag(UUID, Shop, String)
- CompletableFuture clearTagFromShops(UUID, String)
- CompletableFuture tagShop(UUID, Shop, String)
- boolean shopIsNotValid(QUser, Info, Shop)
- List listTags(UUID)
- BlockState makeShopSign(Block, Block, Material)
- Map getShops()
- Map getShops(Chunk)
- Map getShops(String, int, int)
- Map getShops(ShopChunk)
- Map getShops(String)
- Shop getShopIncludeAttachedViaCache(Location)
- void actionCreate(Player, Info, String)
- String format(double, World, String)
- String format(double, Shop)
- void clear()
- Shop getShop(long)
- Shop getShop(Location)
- Shop getShop(Location, boolean)
- CompletableFuture queryShopInventoryCacheInDatabase(Shop)
- void deleteShop(Shop)
- void unloadShop(Shop)
- void unloadShop(Shop, boolean)
- PriceLimiter getPriceLimiter()
- Shop getShopFromRuntimeRandomUniqueId(UUID)
- Shop getShopFromRuntimeRandomUniqueId(UUID, boolean)
- CompletableFuture clearShopTags(UUID, Shop)
- ShopManager$InteractiveManager getInteractiveManager()
- void migrateOwnerToUnlimitedShopOwner(Shop)
- void loadShop(Shop)
- double getTax(Shop, QUser)
- Iterator getShopIterator()
- Shop getShopIncludeAttached(Location)
- CompletableFuture queryTaggedShops(UUID, String)
- void sendShopInfo(Player, Shop)
- void bakeShopRuntimeRandomUniqueIdCache(Shop)

### Class: com.ghostchu.quickshop.api.shop.ShopModerator
Type: Interface

Methods:
- String serialize(ShopModerator)
- boolean addStaff(UUID)
- boolean isModerator(UUID)
- boolean isStaff(UUID)
- boolean isOwner(UUID)
- void clearStaffs()
- String toString()
- boolean delStaff(UUID)
- void setStaffs(List)
- UUID getOwner()
- List getStaffs()
- void setOwner(UUID)
- ShopModerator deserialize(String) throws JsonSyntaxException

### Class: com.ghostchu.quickshop.api.shop.ShopPermissionAudience
Type: Interface

Methods:
- String getName()
- boolean hasPermission(BuiltInShopPermission)
- boolean hasPermission(String)

### Class: com.ghostchu.quickshop.api.shop.ShopPermissionManager
Type: Interface

Methods:
- void registerPermission(String, Plugin, String)
- List getGroupPermissions(String)
- void unregisterPermission(String, Plugin, String)
- boolean hasPermission(String, BuiltInShopPermission)
- boolean hasPermission(String, Plugin, String)
- boolean hasGroup(String)
- void registerGroup(String, Collection)
- void unregisterGroup(String)
- List getGroups()

### Class: com.ghostchu.quickshop.api.shop.PriceLimiterStatus
Type: Enum
Extends: java.lang.Enum

Methods:
- PriceLimiterStatus valueOf(String)
- PriceLimiterStatus[] values()

### Class: com.ghostchu.quickshop.api.shop.ShopAction
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean isTrading()
- ShopAction valueOf(String)
- ShopAction[] values()
- boolean isCreating()

### Class: com.ghostchu.quickshop.api.shop.ShopControlPanelPriority
Type: Enum
Extends: java.lang.Enum

Methods:
- ShopControlPanelPriority valueOf(String)
- ShopControlPanelPriority[] values()
- int getPriority()

### Class: com.ghostchu.quickshop.api.shop.ShopInfoStorage
Type: Class

Methods:
- String getCurrency()
- String getWorld()
- Map getPermission()
- int getShopType()
- String getItem()
- String getOwner()
- double getPrice()
- String getInventoryWrapperName()
- String getSymbolLink()
- BlockPos getPosition()
- boolean isDisableDisplay()
- int hashCode()
- boolean equals(Object)
- String getTaxAccount()
- String toString()
- String getExtra()
- int getUnlimited()

### Class: com.ghostchu.quickshop.api.shop.ShopType
Type: Enum
Extends: java.lang.Enum

Methods:
- int toID(ShopType)
- int toID()
- ShopType valueOf(String)
- ShopType[] values()
- ShopType fromString(String)
- ShopType fromID(int)

## Package: com.ghostchu.quickshop.api.shop.cache

### Class: com.ghostchu.quickshop.api.shop.cache.ShopCache
Type: Interface

Methods:
- CacheStats getCacheStats(ShopCacheNamespacedKey)
- void invalidateAll(ShopCacheNamespacedKey)
- Shop get(ShopCacheNamespacedKey, Location, boolean)
- void invalidate(ShopCacheNamespacedKey, Location)

### Class: com.ghostchu.quickshop.api.shop.cache.ShopInventoryCountCache
Type: Interface

Methods:
- int getSpace()
- int getStock()
- boolean initialized()

### Class: com.ghostchu.quickshop.api.shop.cache.ShopCacheNamespacedKey
Type: Enum
Extends: java.lang.Enum

Methods:
- ShopCacheNamespacedKey valueOf(String)
- ShopCacheNamespacedKey[] values()

## Package: com.ghostchu.quickshop.api.shop.display

### Class: com.ghostchu.quickshop.api.shop.display.PacketFactory
Type: Interface

Methods:
- void registerUnloadChunk()
- Object createVelocityPacket(int)
- Object createMetaDataPacket(int, ItemStack)
- void registerSendChunk()
- boolean sendPacket(Player, Object)
- void unregisterUnloadChunk()
- Object createDestroyPacket(int)
- Object createSpawnPacket(int, Location)
- void unregisterSendChunk()

### Class: com.ghostchu.quickshop.api.shop.display.PacketHandler
Type: Interface

Methods:
- Optional factory(String)
- String identifier()
- Object internal()
- String pluginName()
- Map factories()
- void initialize()

### Class: com.ghostchu.quickshop.api.shop.display.DisplayType
Type: Enum
Extends: java.lang.Enum

Methods:
- int toID(DisplayType)
- int toID()
- DisplayType valueOf(String)
- DisplayType[] values()
- DisplayType fromID(int)

## Package: com.ghostchu.quickshop.api.shop.permission

### Class: com.ghostchu.quickshop.api.shop.permission.BuiltInShopPermission
Type: Enum
Extends: java.lang.Enum
Implements: com.ghostchu.quickshop.api.shop.ShopPermissionAudience

Methods:
- String getNamespacedNode()
- String getName()
- BuiltInShopPermission valueOf(String)
- boolean hasPermission(BuiltInShopPermission)
- boolean hasPermission(String)
- BuiltInShopPermission[] values()
- String getDescriptionKey()
- String getRawNode()

### Class: com.ghostchu.quickshop.api.shop.permission.BuiltInShopPermissionGroup
Type: Enum
Extends: java.lang.Enum
Implements: com.ghostchu.quickshop.api.shop.ShopPermissionAudience

Methods:
- String getNamespacedNode()
- String getName()
- BuiltInShopPermissionGroup valueOf(String)
- List getPermissions()
- boolean hasPermission(BuiltInShopPermission)
- boolean hasPermission(String)
- BuiltInShopPermissionGroup[] values()
- String getDescriptionKey()
- String getRawNode()

## Package: com.ghostchu.quickshop.bootstrap

### Class: com.ghostchu.quickshop.bootstrap.Bootstrap
Type: Class

Methods:
- void main(String[])

## Package: com.ghostchu.quickshop.command

### Class: com.ghostchu.quickshop.command.QuickShopCommand
Type: Class
Extends: org.bukkit.command.defaults.BukkitCommand

Methods:
- List tabComplete(CommandSender, String, String[]) throws IllegalArgumentException
- boolean execute(CommandSender, String, String[])

### Class: com.ghostchu.quickshop.command.SimpleCommandManager
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandManager, org.bukkit.command.TabCompleter, org.bukkit.command.CommandExecutor, com.ghostchu.quickshop.util.paste.item.SubPasteItem, com.ghostchu.simplereloadlib.Reloadable

Methods:
- void setPlaySoundOnTabComplete(boolean)
- boolean onCommand(CommandSender, Command, String, String[])
- void setPlaySoundOnCommand(boolean)
- boolean isPlaySoundOnTabComplete()
- CommandContainer getRootContainer()
- ReloadResult reloadModule() throws Exception
- void registerCmd(CommandContainer)
- List getCmds()
- void unregisterCmd(String)
- void unregisterCmd(CommandContainer)
- String getTitle()
- int hashCode()
- boolean equals(Object)
- QuickShop getPlugin()
- String toString()
- boolean isPlaySoundOnCommand()
- List onTabComplete(CommandSender, Command, String, String[])
- List getRegisteredCommands()
- String genBody()

## Package: com.ghostchu.quickshop.command.subcommand

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_About
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Amount
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Benefit
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_BenefitAll
Type: Class

No public methods found

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Browse
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Buy
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Clean
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_CleanGhost
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Create
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Currency
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Database
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Debug
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void switchDebug(CommandSender)
- void onCommand(CommandSender, String, CommandParser)
- void printHandlerList(CommandSender, String)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Empty
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Export
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(ConsoleCommandSender, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_FetchMessage
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Find
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Freeze
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Help
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_History
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Info
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Item
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Lookup
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Name
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Paste
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Permission
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Price
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Purge
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_ROOT
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Recovery
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(ConsoleCommandSender, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Refill
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Reload
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Remove
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_RemoveAll
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_RemoveWorld
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Reset
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Sell
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_SetOwner
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Sign
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Size
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Staff
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_StaffAll
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_SuggestPrice
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_SuperCreate
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_TaxAccount
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_ToggleDisplay
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_ToggleDisplayAll
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_TransferAll
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_TransferOwnership
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.SubCommand_Unlimited
Type: Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)

## Package: com.ghostchu.quickshop.command.subcommand.silent

### Class: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentBase
Type: Abstract Class
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(Player, String, CommandParser)
- void onCommand(CommandSender, String, CommandParser)
- List onTabComplete(Player, String, CommandParser)
- List onTabComplete(CommandSender, String, CommandParser)

### Class: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentBuy
Type: Class
Extends: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentBase

No public methods found

### Class: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentEmpty
Type: Class
Extends: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentBase

No public methods found

### Class: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentFreeze
Type: Class
Extends: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentBase

No public methods found

### Class: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentHistory
Type: Class
Extends: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentBase

No public methods found

### Class: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentPreview
Type: Class
Extends: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentBase

No public methods found

### Class: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentRemove
Type: Class
Extends: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentBase

No public methods found

### Class: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentSell
Type: Class
Extends: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentBase

No public methods found

### Class: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentToggleDisplay
Type: Class
Extends: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentBase

No public methods found

### Class: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentUnlimited
Type: Class
Extends: com.ghostchu.quickshop.command.subcommand.silent.SubCommand_SilentBase

No public methods found

## Package: com.ghostchu.quickshop.common.util

### Class: com.ghostchu.quickshop.common.util.CalculateUtil
Type: Class

Methods:
- double add(double, double)
- double subtract(double, double)
- double divide(double, double)
- double multiply(double, double)

### Class: com.ghostchu.quickshop.common.util.CommonUtil
Type: Class

Methods:
- String firstUppercase(String)
- int multiProcessorThreadRecommended()
- String array2String(String[])
- UUID fromTrimmedUUID(String)
- String mergeArgs(String[])
- String getClassPrefix(Class)
- String getClassPrefix()
- boolean isUUID(String)
- double med(List)
- boolean isClassAvailable(String)
- String getClassPath(Class)
- String boolean2Status(boolean)
- Date zuluTime2Date(String)
- LocalDate getDateFromTimestamp(long)
- double avg(List)
- double min(List)
- boolean isJson(String)
- String list2String(Collection)
- String createRegexFromGlob(String)
- Date parseTime(String)
- String getTZTimestamp(Date)
- boolean isTrimmedUUID(String)
- UUID getNilUniqueId()
- String list2StringBreaks(Collection)
- List linkLists(List[])
- double max(List)
- List tail(List, int)
- String prettifyText(String)
- LocalDateTime getDateTimeFromTimestamp(long)
- String getClassPathRelative(Class)
- boolean listDisorderMatches(Collection, Collection)
- String readToString(String)
- String readToString(File)
- byte[] inputStream2ByteArray(String)
- String getRelativePath(File, File)
- String getRelativePath(File)
- boolean deleteDirectory(File)

### Class: com.ghostchu.quickshop.common.util.GeoUtil
Type: Class

Methods:
- List determineBestMirrorServer(Logger)
- boolean inChinaRegion()
- CompletableFuture connectTest(String, int, int)

### Class: com.ghostchu.quickshop.common.util.GrabConcurrentTask
Type: Class

Methods:
- void addSupplier(Supplier)
- Object invokeAll(String, long, TimeUnit, Predicate) throws InterruptedException

### Class: com.ghostchu.quickshop.common.util.JsonUtil
Type: Class

Methods:
- Gson standard()
- void writeElement(Appendable, JsonElement)
- Gson getPrettyPrinting()
- void writeObjectPretty(Appendable, JsonObject)
- void writeObject(Appendable, JsonObject)
- void writeElementPretty(Appendable, JsonElement)
- Gson prettyPrinting()
- Gson get()
- String toStringPretty(JsonElement)
- String toString(JsonElement)
- Gson regular()
- Gson getGson()
- JsonObject readObject(Reader)
- JsonObject readObject(String)

### Class: com.ghostchu.quickshop.common.util.QuickExecutor
Type: Class

Methods:
- ExecutorService getSecondaryProfileIoExecutor()
- ExecutorService getCommonExecutor()
- ExecutorService getShopSaveExecutor()
- void setCommonExecutor(ExecutorService)
- ExecutorService provideShopHistoryQueryExecutor()
- void setShopHistoryQueryExecutor(ExecutorService)
- ExecutorService getPrimaryProfileIoExecutor()
- void setPrimaryProfileIoExecutor(ExecutorService)
- void setSecondaryProfileIoExecutor(ExecutorService)
- ExecutorService getHikaricpExecutor()
- ExecutorService getShopHistoryQueryExecutor()
- void setShopSaveExecutor(ExecutorService)
- void setHikaricpExecutor(ExecutorService)
- ExecutorService provideHikariCPExecutor()

### Class: com.ghostchu.quickshop.common.util.QuickSLF4JLogger
Type: Class

Methods:
- Logger initializeLoggerService(Logger)

### Class: com.ghostchu.quickshop.common.util.RomanNumber
Type: Class

Methods:
- String toRoman(Integer)
- String toRoman(int)

### Class: com.ghostchu.quickshop.common.util.Timer
Type: Class

Methods:
- void resume()
- long stopAndGetTimePassed()
- long getPassedTimeOffsetFrom(long)
- long getPassedTime()
- int hashCode()
- boolean equals(Object)
- void start()
- String toString()
- void pause()

### Class: com.ghostchu.quickshop.common.util.UrlEncoderDecoder
Type: Class

Methods:
- String decodePath(String) throws IOException
- String encodeToLegalPath(String)
- String encodePath(String)

## Package: com.ghostchu.quickshop.common.util.jacky

### Class: com.ghostchu.quickshop.common.util.jacky.ResultSetToJson
Type: Class

Methods:
- String resultSetToJsonString(ResultSet)
- JsonObject resultSetToJsonObject(ResultSet)
- JsonArray resultSetToJsonArray(ResultSet)

## Package: com.ghostchu.quickshop.common.util.mirror

### Class: com.ghostchu.quickshop.common.util.mirror.MavenCentralMirror
Type: Enum
Extends: java.lang.Enum

Methods:
- String getTestUrl()
- String getRegion()
- MavenCentralMirror valueOf(String)
- MavenCentralMirror[] values()
- String getRepoUrl()

## Package: com.ghostchu.quickshop.database

### Class: com.ghostchu.quickshop.database.DataTables
Type: Enum
Extends: java.lang.Enum

Methods:
- TableQueryBuilder createQuery()
- TableQueryBuilder createQuery(SQLManager)
- String getName()
- DataTables valueOf(String)
- DataTables[] values()
- UpdateBuilder createUpdate()
- UpdateBuilder createUpdate(SQLManager)
- InsertBuilder createInsert()
- InsertBuilder createInsert(SQLManager)
- void initializeTables(SQLManager, String) throws SQLException
- InsertBuilder createInsertBatch()
- InsertBuilder createInsertBatch(SQLManager)
- boolean isExists()
- boolean isExists(SQLManager, String)
- ReplaceBuilder createReplaceBatch()
- ReplaceBuilder createReplaceBatch(SQLManager)
- boolean purgeTable()
- boolean purgeTable(SQLManager)
- void setPrefix(String)
- ReplaceBuilder createReplace()
- ReplaceBuilder createReplace(SQLManager)
- DeleteBuilder createDelete()
- DeleteBuilder createDelete(SQLManager)

### Class: com.ghostchu.quickshop.database.DatabaseIOUtil
Type: Class

Methods:
- boolean performBackup(String)
- void importFromCSV(File, DataTables) throws SQLException, ClassNotFoundException
- SimpleDatabaseHelperV2 getHelper()
- void importTables(File) throws SQLException, ClassNotFoundException
- void exportTables(File) throws SQLException, IOException
- int hashCode()
- boolean equals(Object)
- String toString()
- void writeToCSV(ResultSet, File) throws SQLException, IOException

### Class: com.ghostchu.quickshop.database.HikariUtil
Type: Class

Methods:
- HikariConfig createHikariConfig()

### Class: com.ghostchu.quickshop.database.MetricQuery
Type: Class

Methods:
- List queryTransactions(Date, long, boolean)
- long queryServerPurchaseCount()
- List queryServerPurchaseRecords(Date, int, boolean)
- LinkedHashMap mapToDataRecord(List) throws ExecutionException, InterruptedException

### Class: com.ghostchu.quickshop.database.SimpleDatabaseHelperV2
Type: Class
Implements: com.ghostchu.quickshop.api.database.DatabaseHelper

Methods:
- SQLQuery selectTable(String) throws SQLException
- CompletableFuture updateShop(Shop)
- CompletableFuture cleanMessageForPlayer(UUID)
- CompletableFuture cleanMessage(long)
- CompletableFuture insertHistoryRecord(Object)
- void checkColumns()
- CompletableFuture locateShopDataId(long)
- CompletableFuture saveOfflineTransactionMessage(UUID, String, long)
- CompletableFuture createShop(long)
- CompletableFuture updateExternalInventoryProfileCache(long, int, int)
- CompletableFuture createData(Shop)
- CompletableFuture setDatabaseVersion(int)
- CompletableFuture removeShopMap(String, int, int, int)
- boolean hasTable(String) throws SQLException
- CompletableFuture removeShopTag(UUID, Long, String)
- int getDatabaseVersion()
- CompletableFuture removeShopAllTag(UUID, Long)
- CompletableFuture tagShop(UUID, Long, String)
- CompletableFuture getDataRecord(long)
- CompletableFuture removeShop(long)
- SQLManager getManager()
- List listAllANotExistsInB(DataTables, String, DataTables, String)
- SQLQuery selectAllMessages() throws SQLException
- List listTags(UUID)
- String getPrefix()
- CompletableFuture queryInventoryCache(long)
- List listShops(boolean)
- List listShops(String, boolean)
- CompletableFuture removeTagFromShops(UUID, String)
- CompletableFuture getPlayerName(UUID)
- CompletableFuture updatePlayerProfile(UUID, String, String)
- CompletableFuture updatePlayerProfileInBatch(List)
- CompletableFuture createShopMap(long, Location)
- CompletableFuture purgeIsolated()
- CompletableFuture selectPlayerMessages(UUID)
- List listShopsTaggedBy(UUID, String)
- CompletableFuture getPlayerLocale(UUID)
- CompletableFuture getPlayerLocale(QUser)
- void insertTransactionRecord(UUID, UUID, double, String, double, UUID, String)
- CompletableFuture removeData(long)
- CompletableFuture insertMetricRecord(ShopMetricRecord)
- CompletableFuture purgeLogsRecords(Date)
- CompletableFuture locateShopId(String, int, int, int)
- CompletableFuture getPlayerUUID(String)
- boolean hasColumn(String, String) throws SQLException
- CompletableFuture queryDataId(SimpleDataRecord)
- void checkTables() throws SQLException

## Package: com.ghostchu.quickshop.database.bean

### Class: com.ghostchu.quickshop.database.bean.IsolatedScanResult
Type: Class

Methods:
- List getIsolated()
- int hashCode()
- boolean equals(Object)
- String toString()
- List getTotal()

### Class: com.ghostchu.quickshop.database.bean.SimpleDataRecord
Type: Class
Implements: com.ghostchu.quickshop.api.database.bean.DataRecord

Methods:
- String getCurrency()
- Date getCreateTime()
- String getName()
- String getInventoryWrapper()
- String getEncoded()
- String getBenefit()
- String getPermissions()
- String getItem()
- Map generateLookupParams()
- QUser getOwner()
- double getPrice()
- boolean isUnlimited()
- int getType()
- int hashCode()
- boolean isHologram()
- Map generateParams()
- boolean equals(Object)
- QUser getTaxAccount()
- String getInventorySymbolLink()
- String toString()
- String getExtra()

## Package: com.ghostchu.quickshop.economy

### Class: com.ghostchu.quickshop.economy.SimpleBenefit
Type: Class
Implements: com.ghostchu.quickshop.api.economy.Benefit

Methods:
- String serialize()
- void addBenefit(QUser, double) throws Benefit$BenefitOverflowException, Benefit$BenefitExistsException
- double getOverflow(double)
- Map getRegistry()
- void removeBenefit(QUser)
- boolean isEmpty()
- SimpleBenefit deserialize(String)

### Class: com.ghostchu.quickshop.economy.SimpleEconomyTransaction
Type: Class
Implements: com.ghostchu.quickshop.api.economy.EconomyTransaction

Methods:
- void setLastError(String)
- World getWorld()
- boolean commit(EconomyTransaction$TransactionCallback)
- boolean commit()
- QUser getTaxer()
- void setCurrency(String)
- Deque getProcessingStack()
- SimpleEconomyTransaction$SimpleEconomyTransactionBuilder builder()
- void setAmount(double)
- boolean checkBalance()
- double getAmount()
- QUser getFrom()
- List rollback(boolean)
- String getCurrency()
- String getLastError()
- void setFrom(QUser)
- boolean failSafeCommit()
- void setCore(EconomyCore)
- void setTaxer(QUser)
- QUser getTo()
- void setTax(double)
- EconomyCore getCore()
- void setAmountAfterTax(double)
- void setTo(QUser)
- String toString()
- double getAmountAfterTax()
- void setWorld(World)
- double getTax()
- void setAllowLoan(boolean)

## Package: com.ghostchu.quickshop.economy.impl

### Class: com.ghostchu.quickshop.economy.impl.Economy_Vault
Type: Class
Extends: com.ghostchu.quickshop.api.economy.NonSeparateAbstractEconomy
Implements: org.bukkit.event.Listener

Methods:
- void onServiceUnregister(ServiceUnregisterEvent)
- String getLastError()
- String getName()
- void onServiceRegister(ServiceRegisterEvent)
- String getProviderName()
- boolean isValid()
- void setVault(Economy)
- String format(double, World, String)
- ReloadResult reloadModule()
- boolean hasCurrency(World, String)
- double getBalance(String, World, String)
- double getBalance(UUID, World, String)
- double getBalance(OfflinePlayer, World, String)
- Economy getVault()
- Plugin getPlugin()
- boolean deposit(String, double, World, String)
- boolean deposit(UUID, double, World, String)
- boolean deposit(OfflinePlayer, double, World, String)
- String toString()
- boolean withdraw(String, double, World, String)
- boolean withdraw(UUID, double, World, String)
- boolean withdraw(OfflinePlayer, double, World, String)
- boolean supportCurrency()

### Class: com.ghostchu.quickshop.economy.impl.Economy_VaultUnlocked
Type: Class
Extends: com.ghostchu.quickshop.api.economy.NonSeparateAbstractEconomy
Implements: org.bukkit.event.Listener

Methods:
- void onServiceUnregister(ServiceUnregisterEvent)
- String getLastError()
- void onServiceRegister(ServiceRegisterEvent)
- boolean isValid()
- String getProviderName()
- void setVault(Economy)
- String format(double, World, String)
- ReloadResult reloadModule()
- boolean hasCurrency(World, String)
- double getBalance(String, World, String)
- double getBalance(UUID, World, String)
- double getBalance(OfflinePlayer, World, String)
- Economy getVault()
- Plugin getPlugin()
- boolean deposit(String, double, World, String)
- boolean deposit(UUID, double, World, String)
- boolean deposit(OfflinePlayer, double, World, String)
- String toString()
- boolean supportCurrency()
- boolean withdraw(String, double, World, String)
- boolean withdraw(UUID, double, World, String)
- boolean withdraw(OfflinePlayer, double, World, String)

## Package: com.ghostchu.quickshop.eventmanager

### Class: com.ghostchu.quickshop.eventmanager.BukkitEventManager
Type: Class
Implements: com.ghostchu.quickshop.api.eventmanager.QuickEventManager

Methods:
- void callEvent(Event, Consumer)

### Class: com.ghostchu.quickshop.eventmanager.QSEventManager
Type: Class
Implements: com.ghostchu.quickshop.api.eventmanager.QuickEventManager, org.bukkit.event.Listener, com.ghostchu.simplereloadlib.Reloadable

Methods:
- void callEvent(Event, Consumer)
- void pluginDisable(PluginDisableEvent)
- void pluginEnable(PluginEnableEvent)
- ReloadResult reloadModule()
- void serverReloaded(ServerLoadEvent)

## Package: com.ghostchu.quickshop.listener

### Class: com.ghostchu.quickshop.listener.AbstractProtectionListener
Type: Abstract Class
Extends: com.ghostchu.quickshop.listener.AbstractQSListener

Methods:
- Shop getShopRedstone(Location, boolean)
- Shop getShopPlayer(Location, boolean)
- QuickShop getPlugin()
- Shop getShopNature(Location, boolean)

### Class: com.ghostchu.quickshop.listener.AbstractQSListener
Type: Abstract Class
Implements: org.bukkit.event.Listener, com.ghostchu.simplereloadlib.Reloadable

Methods:
- void unregister()
- void register()

### Class: com.ghostchu.quickshop.listener.BlockListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractProtectionListener

Methods:
- void onBreak(BlockBreakEvent)
- void onInventoryMove(InventoryMoveItemEvent)
- void onPlayerSignOpen(PlayerSignOpenEvent)
- ReloadResult reloadModule()
- void onPlace(BlockPlaceEvent)
- void onSignUpdate(SignChangeEvent)

### Class: com.ghostchu.quickshop.listener.BungeeListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractQSListener
Implements: org.bukkit.plugin.messaging.PluginMessageListener

Methods:
- void onPluginMessageReceived(String, Player, byte[])
- void notifyForForward(Player)
- void onPlayerDisconnect(PlayerQuitEvent)
- void unregister()
- void notifyForCancel(Player)
- void register()

### Class: com.ghostchu.quickshop.listener.ChatListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractQSListener

Methods:
- ReloadResult reloadModule()
- void onChat(AsyncPlayerChatEvent)

### Class: com.ghostchu.quickshop.listener.ChunkListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractQSListener

Methods:
- void onChunkLoad(ChunkLoadEvent)
- void onChunkUnload(ChunkUnloadEvent)
- ReloadResult reloadModule()

### Class: com.ghostchu.quickshop.listener.CustomInventoryListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractQSListener

Methods:
- void invEvent(InventoryInteractEvent)
- void invEvent(InventoryClickEvent)
- void invEvent(InventoryDragEvent)
- ReloadResult reloadModule()

### Class: com.ghostchu.quickshop.listener.DisplayProtectionListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractProtectionListener

Methods:
- void item(ItemDespawnEvent)
- void portal(EntityPortalEvent)
- void inventory(InventoryOpenEvent)
- void inventory(InventoryPickupItemEvent)
- void player(PlayerFishEvent)
- void player(PlayerArmorStandManipulateEvent)

### Class: com.ghostchu.quickshop.listener.EconomySetupListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractQSListener

Methods:
- void onPluginEnable(PluginEnableEvent)
- ReloadResult reloadModule()

### Class: com.ghostchu.quickshop.listener.InternalListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractQSListener

Methods:
- void shopPriceChanges(ShopPriceEvent)
- void shopDelete(ShopDeleteEvent)
- void shopCreate(ShopCreateEvent)
- boolean isForbidden(Material, Material)
- void shopPurchase(ShopSuccessPurchaseEvent)
- ReloadResult reloadModule()
- void shopPrePurchase(ShopPurchaseEvent)
- void shopInventoryCalc(ShopInventoryCalculateEvent)

### Class: com.ghostchu.quickshop.listener.LockListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractProtectionListener

Methods:
- void onBreak(BlockBreakEvent)
- ReloadResult reloadModule()
- void register()
- void onSignPlace(BlockPlaceEvent)
- void onHopperPlace(BlockPlaceEvent)

### Class: com.ghostchu.quickshop.listener.PlayerListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractQSListener

Methods:
- void onClick(PlayerInteractEvent)
- void onPlayerBreakShopCreationChest(BlockBreakEvent)
- void onDyeing(PlayerInteractEvent)
- void onPlayerQuit(PlayerQuitEvent)
- void onAdventureClick(PlayerAnimationEvent)
- ReloadResult reloadModule()
- void onJoinEasterEgg(PlayerJoinEvent)
- void onMove(PlayerMoveEvent)
- void onTeleport(PlayerTeleportEvent)
- boolean createShop(Player, Block, BlockFace, EquipmentSlot, ItemStack)
- void onJoin(PlayerLocaleChangeEvent)
- void onJoin(PlayerJoinEvent)
- void onSignEditing(SignChangeEvent)
- Map$Entry searchShop(Block, Player)
- boolean buyFromShop(Player, Shop, boolean, boolean)
- boolean buyFromShop(Player, Shop, int, boolean, boolean)
- boolean sellToShop(Player, Shop, boolean, boolean)
- void onInventoryClose(InventoryCloseEvent)

### Class: com.ghostchu.quickshop.listener.PlayerLockClickListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractProtectionListener

Methods:
- void onClick(PlayerInteractEvent)
- ReloadResult reloadModule()

### Class: com.ghostchu.quickshop.listener.ShopProtectionListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractProtectionListener

Methods:
- void onPlaceHopper(BlockPlaceEvent)
- void onInventoryMove(InventoryMoveItemEvent)
- void onStructureGrow(StructureGrowEvent)
- void onEntityBlockChange(EntityChangeBlockEvent)
- void onPistonExtend(BlockPistonExtendEvent)
- void onPistonRetract(BlockPistonRetractEvent)
- ReloadResult reloadModule()
- void onExplode(EntityExplodeEvent)
- void onBlockExplode(BlockExplodeEvent)

### Class: com.ghostchu.quickshop.listener.WorldListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractQSListener

Methods:
- ReloadResult reloadModule()
- void onWorldLoad(WorldLoadEvent)
- void onWorldUnload(WorldUnloadEvent)

## Package: com.ghostchu.quickshop.localization.text

### Class: com.ghostchu.quickshop.localization.text.LanguageFilesManager
Type: Class

Methods:
- FileConfiguration getDistribution(String)
- void fillMissing(FileConfiguration)
- Map getDistributions()
- void reset()
- void destroy(String)
- void remove(String)
- void remove(String, String)
- void deploy(String, FileConfiguration)

### Class: com.ghostchu.quickshop.localization.text.SimpleTextManager
Type: Class
Implements: com.ghostchu.quickshop.api.localization.text.TextManager, com.ghostchu.simplereloadlib.Reloadable, com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- ProxiedLocale findRelativeLanguages(String)
- ProxiedLocale findRelativeLanguages(CommandSender)
- ProxiedLocale findRelativeLanguages(UUID, boolean)
- ProxiedLocale findRelativeLanguages(QUser, boolean)
- String getTitle()
- void load()
- SimpleTextManager$Text of(String, Object[])
- SimpleTextManager$Text of(CommandSender, String, Object[])
- SimpleTextManager$Text of(UUID, String, Object[])
- SimpleTextManager$Text of(QUser, String, Object[])
- Text of(QUser, String, Object[])
- Text of(UUID, String, Object[])
- Text of(CommandSender, String, Object[])
- Text of(String, Object[])
- boolean localeEnabled(String, List)
- List getAvailableLanguages()
- ReloadResult reloadModule()
- Component[] convert(Object[])
- String genBody()
- SimpleTextManager$TextList ofList(String, Object[])
- SimpleTextManager$TextList ofList(UUID, String, Object[])
- TextList ofList(QUser, String, Object[])
- SimpleTextManager$TextList ofList(CommandSender, String, Object[])
- TextList ofList(CommandSender, String, Object[])
- TextList ofList(UUID, String, Object[])
- TextList ofList(String, Object[])
- void register(String, String, String)

## Package: com.ghostchu.quickshop.localization.text.postprocessing.impl

### Class: com.ghostchu.quickshop.localization.text.postprocessing.impl.FillerProcessor
Type: Class
Implements: com.ghostchu.quickshop.api.localization.text.postprocessor.PostProcessor

Methods:
- Component process(Component, CommandSender, Component[])
- int hashCode()
- boolean equals(Object)

### Class: com.ghostchu.quickshop.localization.text.postprocessing.impl.FixClientItemItalicRenderProcessor
Type: Class
Implements: com.ghostchu.quickshop.api.localization.text.postprocessor.PostProcessor

Methods:
- Component process(Component, CommandSender, Component[])
- int hashCode()
- boolean equals(Object)

### Class: com.ghostchu.quickshop.localization.text.postprocessing.impl.ForceReplaceFillerProcessor
Type: Class
Implements: com.ghostchu.quickshop.api.localization.text.postprocessor.PostProcessor

Methods:
- Component process(Component, CommandSender, Component[])
- int hashCode()
- boolean equals(Object)

### Class: com.ghostchu.quickshop.localization.text.postprocessing.impl.PlaceHolderApiProcessor
Type: Class
Implements: com.ghostchu.quickshop.api.localization.text.postprocessor.PostProcessor

Methods:
- Component process(Component, CommandSender, Component[])
- int hashCode()
- boolean equals(Object)

## Package: com.ghostchu.quickshop.menu

### Class: com.ghostchu.quickshop.menu.ShopBrowseMenu
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.Menu

No public methods found

### Class: com.ghostchu.quickshop.menu.ShopHistoryMenu
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.Menu

No public methods found

### Class: com.ghostchu.quickshop.menu.ShopKeeperMenu
Type: Class
Extends: com.ghostchu.quickshop.menu.shared.QuickShopMenu

No public methods found

### Class: com.ghostchu.quickshop.menu.ShopStaffMenu
Type: Class
Extends: com.ghostchu.quickshop.menu.shared.QuickShopMenu

No public methods found

### Class: com.ghostchu.quickshop.menu.ShopTradeMenu
Type: Class
Extends: com.ghostchu.quickshop.menu.shared.QuickShopMenu

No public methods found

## Package: com.ghostchu.quickshop.menu.browse

### Class: com.ghostchu.quickshop.menu.browse.MainPage
Type: Class

Methods:
- void handle(PageOpenCallback)

## Package: com.ghostchu.quickshop.menu.history

### Class: com.ghostchu.quickshop.menu.history.MainPage
Type: Class

Methods:
- void handle(PageOpenCallback)

## Package: com.ghostchu.quickshop.menu.keeper

### Class: com.ghostchu.quickshop.menu.keeper.MainPage
Type: Class
Extends: com.ghostchu.quickshop.menu.shared.QuickShopPage

Methods:
- void open(PageOpenCallback)

## Package: com.ghostchu.quickshop.menu.shared

### Class: com.ghostchu.quickshop.menu.shared.PageSwitchWithCloseAction
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.IconAction

Methods:
- boolean onClick(MenuClickHandler)

### Class: com.ghostchu.quickshop.menu.shared.QuickShopMenu
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.Menu

No public methods found

### Class: com.ghostchu.quickshop.menu.shared.QuickShopPage
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.Page

Methods:
- Optional getPlayer(UUID)
- String legacy(UUID, String, Object[])
- List getList(UUID, String, Object[])
- Component get(UUID, String, Object[])
- Optional getShop(MenuViewer)

## Package: com.ghostchu.quickshop.menu.staff

### Class: com.ghostchu.quickshop.menu.staff.PlayerSelectionPage
Type: Class

Methods:
- List sorted(Shop)
- void handle(PageOpenCallback)

### Class: com.ghostchu.quickshop.menu.staff.StaffSelectionPage
Type: Class

Methods:
- void handle(PageOpenCallback)

## Package: com.ghostchu.quickshop.menu.trade

### Class: com.ghostchu.quickshop.menu.trade.MainPage
Type: Class
Extends: com.ghostchu.quickshop.menu.shared.QuickShopPage

Methods:
- void handle(PageOpenCallback)

## Package: com.ghostchu.quickshop.metric

### Class: com.ghostchu.quickshop.metric.MetricListener
Type: Class
Extends: com.ghostchu.quickshop.listener.AbstractQSListener
Implements: org.bukkit.event.Listener

Methods:
- void onDelete(ShopDeleteEvent)
- void onDelete(ShopOngoingFeeEvent)
- void onCreate(ShopCreateEvent)
- void onPurchase(ShopSuccessPurchaseEvent)

## Package: com.ghostchu.quickshop.mock

### Class: com.ghostchu.quickshop.mock.MckFileConfiguration
Type: Class
Extends: org.bukkit.configuration.file.FileConfiguration

Methods:
- String saveToString()
- void loadFromString(String)
- String toString()

## Package: com.ghostchu.quickshop.obj

### Class: com.ghostchu.quickshop.obj.QUserImpl
Type: Class
Implements: com.ghostchu.quickshop.api.obj.QUser

Methods:
- void set(String)
- void setUsername(String)
- Optional getUniqueIdIfRealPlayer()
- void setUniqueId(UUID)
- QUser createSync(PlayerFinder, String, ExecutorService)
- QUser createSync(PlayerFinder, UUID, ExecutorService)
- QUser createSync(PlayerFinder, String)
- QUser createSync(PlayerFinder, UUID)
- QUser createSync(PlayerFinder, CommandSender, ExecutorService)
- QUser createSync(PlayerFinder, CommandSender)
- QUser createFullFilled(UUID, String, boolean)
- QUser createFullFilled(Player)
- Optional getBukkitPlayer()
- CompletableFuture createAsync(PlayerFinder, String)
- CompletableFuture createAsync(PlayerFinder, UUID)
- CompletableFuture createAsync(PlayerFinder, String, ExecutorService)
- CompletableFuture createAsync(PlayerFinder, UUID, ExecutorService)
- CompletableFuture createAsync(PlayerFinder, CommandSender, ExecutorService)
- CompletableFuture createAsync(PlayerFinder, CommandSender)
- void setRealPlayer(boolean)
- UUID getUniqueId()
- String getUsername()
- String serialize()
- int hashCode()
- Optional getUniqueIdOptional()
- boolean equals(Object)
- String toString()
- boolean isFull()
- Optional getUsernameIfRealPlayer()
- boolean isRealPlayer()
- String getDisplay()
- Optional getUsernameOptional()
- QUserImpl deserialize(PlayerFinder, String, ExecutorService)

## Package: com.ghostchu.quickshop.papi

### Class: com.ghostchu.quickshop.papi.PAPISubHandler
Type: Interface

Methods:
- String handle0(OfflinePlayer, String)
- String getPrefix()
- String handle(OfflinePlayer, String)

### Class: com.ghostchu.quickshop.papi.PAPICache
Type: Class
Implements: com.ghostchu.simplereloadlib.Reloadable

Methods:
- void writeCache(UUID, String, String)
- CacheStats getStats()
- String readCache(UUID, String)
- Optional getCached(UUID, String, BiFunction)
- ReloadResult reloadModule() throws Exception
- long getExpiredTime()

### Class: com.ghostchu.quickshop.papi.PAPIManager
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- List getHandlers()
- void unregister(PAPISubHandler)
- void unregister(String)
- String handle(OfflinePlayer, String)
- String genBody()
- void register(PAPISubHandler)

### Class: com.ghostchu.quickshop.papi.QuickShopPAPI
Type: Class
Extends: me.clip.placeholderapi.expansion.PlaceholderExpansion

Methods:
- boolean canRegister()
- String getVersion()
- PAPIManager getManager()
- String onRequest(OfflinePlayer, String)
- String getAuthor()
- String getIdentifier()
- boolean persist()

## Package: com.ghostchu.quickshop.papi.impl

### Class: com.ghostchu.quickshop.papi.impl.MetadataPAPI
Type: Class
Implements: com.ghostchu.quickshop.papi.PAPISubHandler

Methods:
- String handle0(OfflinePlayer, String)
- String getPrefix()

### Class: com.ghostchu.quickshop.papi.impl.PurchasesPAPI
Type: Class
Implements: com.ghostchu.quickshop.papi.PAPISubHandler

Methods:
- String handle0(OfflinePlayer, String)
- String getPrefix()

### Class: com.ghostchu.quickshop.papi.impl.ShopManagerPAPI
Type: Class
Implements: com.ghostchu.quickshop.papi.PAPISubHandler

Methods:
- String handle0(OfflinePlayer, String)
- String getPrefix()

### Class: com.ghostchu.quickshop.papi.impl.TransactionAmountPAPI
Type: Class
Implements: com.ghostchu.quickshop.papi.PAPISubHandler

Methods:
- String handle0(OfflinePlayer, String)
- String getPrefix()

## Package: com.ghostchu.quickshop.permission

### Class: com.ghostchu.quickshop.permission.PermissionInformationContainer
Type: Class

Methods:
- String getOtherInfos()
- void setGroupName(String)
- String getGroupName()
- String getPermission()
- boolean isConsole()
- int hashCode()
- boolean equals(Object)
- void setOtherInfos(String)
- String toString()
- void setPermission(String)
- void setSender(CommandSender)
- CommandSender getSender()

### Class: com.ghostchu.quickshop.permission.PermissionManager
Type: Class

Methods:
- QuickShop getPlugin()
- boolean hasPermission(CommandSender, String)
- boolean hasPermission(QUser, String)
- PermissionProvider getProvider()

### Class: com.ghostchu.quickshop.permission.PermissionProviderType
Type: Enum
Extends: java.lang.Enum

Methods:
- int toID()
- PermissionProviderType valueOf(String)
- PermissionProviderType[] values()
- PermissionProviderType fromID(int) throws IllegalArgumentException

## Package: com.ghostchu.quickshop.permission.impl

### Class: com.ghostchu.quickshop.permission.impl.BukkitPermsProvider
Type: Class
Implements: com.ghostchu.quickshop.api.permission.PermissionProvider

Methods:
- String getName()
- boolean hasPermission(CommandSender, String)
- boolean hasPermission(QUser, String)
- PermissionInformationContainer getDebugInfo(CommandSender, String)

### Class: com.ghostchu.quickshop.permission.impl.VaultPermissionProvider
Type: Class
Implements: com.ghostchu.quickshop.api.permission.PermissionProvider

Methods:
- String getName()
- boolean hasPermission(CommandSender, String)
- boolean hasPermission(QUser, String)
- PermissionInformationContainer getDebugInfo(CommandSender, String)

## Package: com.ghostchu.quickshop.platform

### Class: com.ghostchu.quickshop.platform.Platform
Type: Interface

Methods:
- String encodeStack(ItemStack)
- ItemStack decodeStack(String)
- String getTranslationKey(Material)
- String getTranslationKey(EntityType)
- String getTranslationKey(PotionEffectType)
- String getTranslationKey(Enchantment)
- String getTranslationKey(ItemStack)
- Component getLine(Sign, int)
- String getMinecraftVersion()
- void sendMessage(CommandSender, Component)
- String getItemShopId(ItemStack)
- void sendSignTextChange(Player, Sign, boolean, List)
- void setDisplayName(ItemStack, Component)
- void setDisplayName(Entity, Component)
- List getLore(ItemStack)
- List getLore(ItemMeta)
- void setLines(Sign, List)
- Component setItemStackHoverEvent(Component, ItemStack)
- void setLore(ItemStack, Collection)
- Component getDisplayName(ItemStack)
- Component getDisplayName(ItemMeta)
- MiniMessage miniMessage()
- void registerCommand(String, Command)
- Component getTranslation(Material)
- Component getTranslation(EntityType)
- Component getTranslation(PotionEffectType)
- Component getTranslation(Enchantment)
- Component getTranslation(ItemStack)
- Logger getSlf4jLogger(Plugin)
- void shutdown()
- void updateTranslationMappingSection(Map)

### Class: com.ghostchu.quickshop.platform.Util
Type: Class

Methods:
- boolean methodExists(Class, String)

## Package: com.ghostchu.quickshop.platform.paper

### Class: com.ghostchu.quickshop.platform.paper.PaperPlatform
Type: Class
Implements: com.ghostchu.quickshop.platform.Platform

Methods:
- String encodeStack(ItemStack)
- ItemStack decodeStack(String)
- String getTranslationKey(Material)
- String getTranslationKey(EntityType)
- String getTranslationKey(PotionEffectType)
- String getTranslationKey(Enchantment)
- String getTranslationKey(ItemStack)
- String getMinecraftVersion()
- Component getLine(Sign, int)
- void sendMessage(CommandSender, Component)
- void sendSignTextChange(Player, Sign, boolean, List)
- void setDisplayName(ItemStack, Component)
- void setDisplayName(Entity, Component)
- List getLore(ItemStack)
- List getLore(ItemMeta)
- void setLines(Sign, List)
- Component setItemStackHoverEvent(Component, ItemStack)
- void setLore(ItemStack, Collection)
- Component getDisplayName(ItemStack)
- Component getDisplayName(ItemMeta)
- MiniMessage miniMessage()
- void registerCommand(String, Command)
- Component getTranslation(Material)
- Component getTranslation(EntityType)
- Component getTranslation(PotionEffectType)
- Component getTranslation(Enchantment)
- Component getTranslation(ItemStack)
- Logger getSlf4jLogger(Plugin)
- void shutdown()
- void updateTranslationMappingSection(Map)

## Package: com.ghostchu.quickshop.platform.spigot

### Class: com.ghostchu.quickshop.platform.spigot.AbstractSpigotPlatform
Type: Abstract Class
Implements: com.ghostchu.quickshop.platform.Platform

Methods:
- Component getLine(Sign, int)
- void sendMessage(CommandSender, Component)
- String getNMSVersion()
- void sendSignTextChange(Player, Sign, boolean, List)
- void setDisplayName(ItemStack, Component)
- void setDisplayName(Entity, Component)
- List getLore(ItemStack)
- List getLore(ItemMeta)
- void setLines(Sign, List)
- Component setItemStackHoverEvent(Component, ItemStack)
- void setLore(ItemStack, Collection)
- Component getDisplayName(ItemStack)
- Component getDisplayName(ItemMeta)
- MiniMessage miniMessage()
- Component getTranslation(Material)
- Component getTranslation(EntityType)
- Component getTranslation(PotionEffectType)
- Component getTranslation(Enchantment)
- Component getTranslation(ItemStack)
- Logger getSlf4jLogger(Plugin)
- void shutdown()
- void updateTranslationMappingSection(Map)

## Package: com.ghostchu.quickshop.platform.spigot.v1_20_1

### Class: com.ghostchu.quickshop.platform.spigot.v1_20_1.Spigot1201Platform
Type: Class
Extends: com.ghostchu.quickshop.platform.spigot.AbstractSpigotPlatform
Implements: com.ghostchu.quickshop.platform.Platform

Methods:
- String getTranslationKey(Material)
- String getTranslationKey(EntityType)
- String getTranslationKey(PotionEffectType)
- String getTranslationKey(Enchantment)
- String getTranslationKey(ItemStack)
- String getMinecraftVersion()
- void registerCommand(String, Command)

## Package: com.ghostchu.quickshop.platform.spigot.v1_20_2

### Class: com.ghostchu.quickshop.platform.spigot.v1_20_2.Spigot1202Platform
Type: Class
Extends: com.ghostchu.quickshop.platform.spigot.AbstractSpigotPlatform
Implements: com.ghostchu.quickshop.platform.Platform

Methods:
- String getTranslationKey(Material)
- String getTranslationKey(EntityType)
- String getTranslationKey(PotionEffectType)
- String getTranslationKey(Enchantment)
- String getTranslationKey(ItemStack)
- String getMinecraftVersion()
- void registerCommand(String, Command)

## Package: com.ghostchu.quickshop.platform.spigot.v1_20_3

### Class: com.ghostchu.quickshop.platform.spigot.v1_20_3.Spigot1203Platform
Type: Class
Extends: com.ghostchu.quickshop.platform.spigot.AbstractSpigotPlatform
Implements: com.ghostchu.quickshop.platform.Platform

Methods:
- String getTranslationKey(Material)
- String getTranslationKey(EntityType)
- String getTranslationKey(PotionEffectType)
- String getTranslationKey(Enchantment)
- String getTranslationKey(ItemStack)
- String getMinecraftVersion()
- void registerCommand(String, Command)

## Package: com.ghostchu.quickshop.platform.spigot.v1_20_4

### Class: com.ghostchu.quickshop.platform.spigot.v1_20_4.Spigot1205Platform
Type: Class
Extends: com.ghostchu.quickshop.platform.spigot.AbstractSpigotPlatform
Implements: com.ghostchu.quickshop.platform.Platform

Methods:
- Component setItemStackHoverEvent(Component, ItemStack)
- void setLore(ItemStack, Collection)
- String getTranslationKey(Material)
- String getTranslationKey(EntityType)
- String getTranslationKey(PotionEffectType)
- String getTranslationKey(Enchantment)
- String getTranslationKey(ItemStack)
- String getMinecraftVersion()
- void registerCommand(String, Command)
- void setDisplayName(ItemStack, Component)

## Package: com.ghostchu.quickshop.platform.spigot.v1_21_1

### Class: com.ghostchu.quickshop.platform.spigot.v1_21_1.Spigot1210Platform
Type: Class
Extends: com.ghostchu.quickshop.platform.spigot.AbstractSpigotPlatform
Implements: com.ghostchu.quickshop.platform.Platform

Methods:
- Component setItemStackHoverEvent(Component, ItemStack)
- void setLore(ItemStack, Collection)
- String getTranslationKey(Material)
- String getTranslationKey(EntityType)
- String getTranslationKey(PotionEffectType)
- String getTranslationKey(Enchantment)
- String getTranslationKey(ItemStack)
- String getMinecraftVersion()
- void registerCommand(String, Command)
- void setDisplayName(ItemStack, Component)

### Class: com.ghostchu.quickshop.platform.spigot.v1_21_1.Spigot1211Platform
Type: Class
Extends: com.ghostchu.quickshop.platform.spigot.AbstractSpigotPlatform
Implements: com.ghostchu.quickshop.platform.Platform

Methods:
- Component setItemStackHoverEvent(Component, ItemStack)
- void setLore(ItemStack, Collection)
- String getTranslationKey(Material)
- String getTranslationKey(EntityType)
- String getTranslationKey(PotionEffectType)
- String getTranslationKey(Enchantment)
- String getTranslationKey(ItemStack)
- String getMinecraftVersion()
- void registerCommand(String, Command)
- void setDisplayName(ItemStack, Component)

## Package: com.ghostchu.quickshop.platform.spigot.v1_21_3

### Class: com.ghostchu.quickshop.platform.spigot.v1_21_3.Spigot1231Platform
Type: Class
Extends: com.ghostchu.quickshop.platform.spigot.AbstractSpigotPlatform
Implements: com.ghostchu.quickshop.platform.Platform

Methods:
- Component setItemStackHoverEvent(Component, ItemStack)
- void setLore(ItemStack, Collection)
- String getTranslationKey(Material)
- String getTranslationKey(EntityType)
- String getTranslationKey(PotionEffectType)
- String getTranslationKey(Enchantment)
- String getTranslationKey(ItemStack)
- String getMinecraftVersion()
- void registerCommand(String, Command)
- void setDisplayName(ItemStack, Component)

## Package: com.ghostchu.quickshop.platform.spigot.v1_21_4

### Class: com.ghostchu.quickshop.platform.spigot.v1_21_4.Spigot1214Platform
Type: Class
Extends: com.ghostchu.quickshop.platform.spigot.AbstractSpigotPlatform
Implements: com.ghostchu.quickshop.platform.Platform

Methods:
- Component setItemStackHoverEvent(Component, ItemStack)
- void setLore(ItemStack, Collection)
- String getTranslationKey(Material)
- String getTranslationKey(EntityType)
- String getTranslationKey(PotionEffectType)
- String getTranslationKey(Enchantment)
- String getTranslationKey(ItemStack)
- String getMinecraftVersion()
- void registerCommand(String, Command)
- void setDisplayName(ItemStack, Component)

## Package: com.ghostchu.quickshop.platform.spigot.v1_21_5

### Class: com.ghostchu.quickshop.platform.spigot.v1_21_5.Spigot1215Platform
Type: Class
Extends: com.ghostchu.quickshop.platform.spigot.AbstractSpigotPlatform
Implements: com.ghostchu.quickshop.platform.Platform

Methods:
- void setLines(Sign, List)
- Component setItemStackHoverEvent(Component, ItemStack)
- void setLore(ItemStack, Collection)
- String getTranslationKey(Material)
- String getTranslationKey(EntityType)
- String getTranslationKey(PotionEffectType)
- String getTranslationKey(Enchantment)
- String getTranslationKey(ItemStack)
- String getMinecraftVersion()
- void registerCommand(String, Command)
- void setDisplayName(ItemStack, Component)

## Package: com.ghostchu.quickshop.registry

### Class: com.ghostchu.quickshop.registry.SimpleRegistryManager
Type: Class
Implements: com.ghostchu.quickshop.api.registry.RegistryManager

Methods:
- Map getRegistries()
- Registry getRegistry(BuiltInRegistry)
- Registry getRegistry(String)
- void registerRegistry(String, Registry)
- Map getRegistryList()
- void unregisterRegistry(String)

## Package: com.ghostchu.quickshop.registry.builtin.itemexpression

### Class: com.ghostchu.quickshop.registry.builtin.itemexpression.SimpleItemExpressionRegistry
Type: Class
Implements: com.ghostchu.quickshop.api.registry.builtin.itemexpression.ItemExpressionRegistry

Methods:
- void registerHandler(ItemExpressionHandler) throws PrefixAlreadyRegisteredException
- void unregisterHandlers(Plugin)
- Set getHandlers()
- boolean registerHandlerSafely(ItemExpressionHandler)
- boolean match(ItemStack, String)
- void unregisterHandler(ItemExpressionHandler)
- void unregisterHandler(String)

## Package: com.ghostchu.quickshop.registry.builtin.itemexpression.handlers

### Class: com.ghostchu.quickshop.registry.builtin.itemexpression.handlers.SimpleEnchantmentExpressionHandler
Type: Class
Implements: com.ghostchu.quickshop.api.registry.builtin.itemexpression.ItemExpressionHandler

Methods:
- String getPrefix()
- String getInternalPrefix0()
- Plugin getPlugin()
- boolean match(ItemStack, String)

### Class: com.ghostchu.quickshop.registry.builtin.itemexpression.handlers.SimpleItemReferenceExpressionHandler
Type: Class
Implements: com.ghostchu.quickshop.api.registry.builtin.itemexpression.ItemExpressionHandler

Methods:
- String getPrefix()
- String getInternalPrefix0()
- Plugin getPlugin()
- boolean match(ItemStack, String)

### Class: com.ghostchu.quickshop.registry.builtin.itemexpression.handlers.SimpleMaterialExpressionHandler
Type: Class
Implements: com.ghostchu.quickshop.api.registry.builtin.itemexpression.ItemExpressionHandler

Methods:
- String getPrefix()
- String getInternalPrefix0()
- Plugin getPlugin()
- boolean match(ItemStack, String)

## Package: com.ghostchu.quickshop.shade.com.alessiodp.libby

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.BukkitLibraryManager
Type: Class
Extends: com.ghostchu.quickshop.shade.com.alessiodp.libby.LibraryManager

No public methods found

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.LibbyProperties
Type: Class

No public methods found

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.Library
Type: Class

Methods:
- String getVersion()
- String getLoaderId()
- boolean hasClassifier()
- byte[] getChecksum()
- boolean hasChecksum()
- String getClassifier()
- String getGroupId()
- String getRelocatedPath()
- Collection getRepositories()
- boolean resolveTransitiveDependencies()
- String getPartialPath()
- Library$Builder builder()
- Collection getExcludedTransitiveDependencies()
- String getPath()
- String toString()
- boolean hasRelocations()
- boolean isIsolatedLoad()
- String getArtifactId()
- boolean isSnapshot()
- Collection getUrls()
- Collection getRelocations()

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.LibraryManager
Type: Abstract Class

Methods:
- void addSonatype()
- void loadLibrary(Library)
- Collection resolveLibrary(Library)
- void setLogLevel(LogLevel)
- Path downloadLibrary(Library)
- Logger getLogger()
- void addJitPack()
- void addMavenCentral()
- Collection getRepositories()
- void addRepository(String)
- void configureFromJSON()
- void configureFromJSON(String)
- void configureFromJSON(InputStream)
- Path relocate(Path, String, Collection)
- void addJCenter()
- LogLevel getLogLevel()
- void loadLibraries(Library[])
- IsolatedClassLoader getIsolatedClassLoaderById(String)
- void addMavenLocal()
- IsolatedClassLoader getGlobalIsolatedClassLoader()

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.Repositories
Type: Class

No public methods found

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.Util
Type: Class

Methods:
- String craftPartialPath(String, String, String)
- String craftPath(String, String, String, String)
- byte[] hexStringToByteArray(String)
- String replaceWithDots(String)

## Package: com.ghostchu.quickshop.shade.com.alessiodp.libby.classloader

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.classloader.ClassLoaderHelper
Type: Abstract Class

Methods:
- void addToClasspath(URL)
- void addToClasspath(Path)

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.classloader.IsolatedClassLoader
Type: Class
Extends: java.net.URLClassLoader

Methods:
- Class defineClass(String, InputStream) throws IOException, ClassFormatError
- void addURL(URL)
- void addPath(Path)

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.classloader.SystemClassLoaderHelper
Type: Class
Extends: com.ghostchu.quickshop.shade.com.alessiodp.libby.classloader.ClassLoaderHelper

Methods:
- void addToClasspath(URL)

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.classloader.URLClassLoaderHelper
Type: Class
Extends: com.ghostchu.quickshop.shade.com.alessiodp.libby.classloader.ClassLoaderHelper

Methods:
- void addToClasspath(URL)

## Package: com.ghostchu.quickshop.shade.com.alessiodp.libby.configuration

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.configuration.Configuration
Type: Class

Methods:
- Integer getVersion()
- Set getRepositories()
- Set getGlobalRelocations()
- List getLibraries()

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.configuration.ConfigurationException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.configuration.ConfigurationFetcher
Type: Class

Methods:
- Configuration readJsonFile(InputStream)

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.configuration.MalformedConfigurationException
Type: Class
Extends: com.ghostchu.quickshop.shade.com.alessiodp.libby.configuration.ConfigurationException

No public methods found

## Package: com.ghostchu.quickshop.shade.com.alessiodp.libby.logging

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.logging.LogLevel
Type: Enum
Extends: java.lang.Enum

Methods:
- LogLevel valueOf(String)
- LogLevel[] values()

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.logging.Logger
Type: Class

Methods:
- void warn(String)
- void warn(String, Throwable)
- LogLevel getLevel()
- void debug(String)
- void debug(String, Throwable)
- void log(LogLevel, String)
- void log(LogLevel, String, Throwable)
- void error(String)
- void error(String, Throwable)
- void info(String)
- void info(String, Throwable)
- void setLevel(LogLevel)

## Package: com.ghostchu.quickshop.shade.com.alessiodp.libby.logging.adapters

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.logging.adapters.LogAdapter
Type: Interface

Methods:
- void log(LogLevel, String)
- void log(LogLevel, String, Throwable)

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.logging.adapters.JDKLogAdapter
Type: Class
Implements: com.ghostchu.quickshop.shade.com.alessiodp.libby.logging.adapters.LogAdapter

Methods:
- void log(LogLevel, String)
- void log(LogLevel, String, Throwable)

## Package: com.ghostchu.quickshop.shade.com.alessiodp.libby.relocation

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.relocation.Relocation
Type: Class

Methods:
- String getRelocatedPattern()
- int hashCode()
- boolean equals(Object)
- Relocation$Builder builder()
- Collection getExcludes()
- Collection getIncludes()
- String getPattern()

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.relocation.RelocationHelper
Type: Class

Methods:
- void relocate(Path, Path, Collection)

## Package: com.ghostchu.quickshop.shade.com.alessiodp.libby.transitive

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.transitive.ExcludedDependency
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)
- String getArtifactId()
- String getGroupId()

### Class: com.ghostchu.quickshop.shade.com.alessiodp.libby.transitive.TransitiveDependencyHelper
Type: Class

Methods:
- Collection findTransitiveLibraries(Library)

## Package: com.ghostchu.quickshop.shade.com.tcoded

### Class: com.ghostchu.quickshop.shade.com.tcoded.FoliaLib
Type: Class

Methods:
- boolean isUnsupported()
- void disableInvalidTickValueWarning()
- boolean isPaper()
- ImplementationType getImplType()
- PlatformScheduler getImpl()
- void enableInvalidTickValueDebug()
- Plugin getPlugin()
- InvalidTickDelayNotifier getInvalidTickDelayNotifier()
- FoliaLibOptions getOptions()
- boolean isFolia()
- PlatformScheduler getScheduler()
- boolean isSpigot()

## Package: com.ghostchu.quickshop.shade.com.tcoded.enums

### Class: com.ghostchu.quickshop.shade.com.tcoded.enums.EntityTaskResult
Type: Enum
Extends: java.lang.Enum

Methods:
- EntityTaskResult valueOf(String)
- EntityTaskResult[] values()

### Class: com.ghostchu.quickshop.shade.com.tcoded.enums.ImplementationType
Type: Enum
Extends: java.lang.Enum

Methods:
- Supplier[] getTests()
- ImplementationType valueOf(String)
- ImplementationType[] values()
- boolean selfCheck()
- String getImplementationClassName()
- String[] getClassNames()

## Package: com.ghostchu.quickshop.shade.com.tcoded.impl

### Class: com.ghostchu.quickshop.shade.com.tcoded.impl.PlatformScheduler
Type: Interface
Implements: com.ghostchu.quickshop.shade.com.tcoded.impl.ServerImplementation

No public methods found

### Class: com.ghostchu.quickshop.shade.com.tcoded.impl.ServerImplementation
Type: Interface

Methods:
- CompletableFuture runAtEntityWithFallback(Entity, Consumer, Runnable)
- WrappedTask runLaterAsync(Runnable, long)
- CompletableFuture runLaterAsync(Consumer, long)
- WrappedTask runLaterAsync(Runnable, long, TimeUnit)
- CompletableFuture runLaterAsync(Consumer, long, TimeUnit)
- Player getPlayer(String)
- Player getPlayer(UUID)
- WrappedTask runTimerAsync(Runnable, long, long)
- void runTimerAsync(Consumer, long, long)
- WrappedTask runTimerAsync(Runnable, long, long, TimeUnit)
- void runTimerAsync(Consumer, long, long, TimeUnit)
- WrappedTask wrapTask(Object)
- List getAllTasks()
- List getAllServerTasks()
- void cancelAllTasks()
- WrappedTask runAtLocationLater(Location, Runnable, long)
- CompletableFuture runAtLocationLater(Location, Consumer, long)
- WrappedTask runAtLocationLater(Location, Runnable, long, TimeUnit)
- CompletableFuture runAtLocationLater(Location, Consumer, long, TimeUnit)
- CompletableFuture runNextTick(Consumer)
- boolean isOwnedByCurrentRegion(Location)
- boolean isOwnedByCurrentRegion(Location, int)
- boolean isOwnedByCurrentRegion(Block)
- boolean isOwnedByCurrentRegion(World, int, int)
- boolean isOwnedByCurrentRegion(World, int, int, int)
- boolean isOwnedByCurrentRegion(Entity)
- WrappedTask runAtEntityLater(Entity, Runnable, long)
- WrappedTask runAtEntityLater(Entity, Runnable, Runnable, long)
- CompletableFuture runAtEntityLater(Entity, Consumer, long)
- CompletableFuture runAtEntityLater(Entity, Consumer, Runnable, long)
- WrappedTask runAtEntityLater(Entity, Runnable, long, TimeUnit)
- CompletableFuture runAtEntityLater(Entity, Consumer, long, TimeUnit)
- void cancelTask(WrappedTask)
- CompletableFuture teleportAsync(Entity, Location)
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)
- CompletableFuture runAsync(Consumer)
- WrappedTask runLater(Runnable, long)
- CompletableFuture runLater(Consumer, long)
- WrappedTask runLater(Runnable, long, TimeUnit)
- CompletableFuture runLater(Consumer, long, TimeUnit)
- CompletableFuture runAtEntity(Entity, Consumer)
- CompletableFuture runAtLocation(Location, Consumer)
- boolean isGlobalTickThread()
- Player getPlayerExact(String)
- WrappedTask runAtLocationTimer(Location, Runnable, long, long)
- void runAtLocationTimer(Location, Consumer, long, long)
- WrappedTask runAtLocationTimer(Location, Runnable, long, long, TimeUnit)
- void runAtLocationTimer(Location, Consumer, long, long, TimeUnit)
- WrappedTask runAtEntityTimer(Entity, Runnable, long, long)
- WrappedTask runAtEntityTimer(Entity, Runnable, Runnable, long, long)
- void runAtEntityTimer(Entity, Consumer, long, long)
- void runAtEntityTimer(Entity, Consumer, Runnable, long, long)
- WrappedTask runAtEntityTimer(Entity, Runnable, long, long, TimeUnit)
- void runAtEntityTimer(Entity, Consumer, long, long, TimeUnit)
- WrappedTask runTimer(Runnable, long, long)
- void runTimer(Consumer, long, long)
- WrappedTask runTimer(Runnable, long, long, TimeUnit)
- void runTimer(Consumer, long, long, TimeUnit)

### Class: com.ghostchu.quickshop.shade.com.tcoded.impl.FoliaImplementation
Type: Class
Implements: com.ghostchu.quickshop.shade.com.tcoded.impl.PlatformScheduler

Methods:
- CompletableFuture runAtEntityWithFallback(Entity, Consumer, Runnable)
- WrappedTask runLaterAsync(Runnable, long)
- CompletableFuture runLaterAsync(Consumer, long)
- WrappedTask runLaterAsync(Runnable, long, TimeUnit)
- CompletableFuture runLaterAsync(Consumer, long, TimeUnit)
- Player getPlayer(String)
- Player getPlayer(UUID)
- WrappedTask runTimerAsync(Runnable, long, long)
- void runTimerAsync(Consumer, long, long)
- WrappedTask runTimerAsync(Runnable, long, long, TimeUnit)
- void runTimerAsync(Consumer, long, long, TimeUnit)
- WrappedTask wrapTask(Object)
- List getAllTasks()
- List getAllServerTasks()
- void cancelAllTasks()
- WrappedTask runAtLocationLater(Location, Runnable, long)
- CompletableFuture runAtLocationLater(Location, Consumer, long)
- WrappedTask runAtLocationLater(Location, Runnable, long, TimeUnit)
- CompletableFuture runAtLocationLater(Location, Consumer, long, TimeUnit)
- CompletableFuture runNextTick(Consumer)
- boolean isOwnedByCurrentRegion(Location)
- boolean isOwnedByCurrentRegion(Location, int)
- boolean isOwnedByCurrentRegion(Block)
- boolean isOwnedByCurrentRegion(World, int, int)
- boolean isOwnedByCurrentRegion(World, int, int, int)
- boolean isOwnedByCurrentRegion(Entity)
- WrappedTask runAtEntityLater(Entity, Runnable, long)
- WrappedTask runAtEntityLater(Entity, Runnable, Runnable, long)
- CompletableFuture runAtEntityLater(Entity, Consumer, long)
- CompletableFuture runAtEntityLater(Entity, Consumer, Runnable, long)
- WrappedTask runAtEntityLater(Entity, Runnable, long, TimeUnit)
- CompletableFuture runAtEntityLater(Entity, Consumer, long, TimeUnit)
- void cancelTask(WrappedTask)
- CompletableFuture teleportAsync(Entity, Location)
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)
- CompletableFuture runAsync(Consumer)
- WrappedTask runLater(Runnable, long)
- CompletableFuture runLater(Consumer, long)
- WrappedTask runLater(Runnable, long, TimeUnit)
- CompletableFuture runLater(Consumer, long, TimeUnit)
- CompletableFuture runAtEntity(Entity, Consumer)
- CompletableFuture runAtLocation(Location, Consumer)
- boolean isGlobalTickThread()
- Player getPlayerExact(String)
- WrappedTask runAtLocationTimer(Location, Runnable, long, long)
- void runAtLocationTimer(Location, Consumer, long, long)
- WrappedTask runAtLocationTimer(Location, Runnable, long, long, TimeUnit)
- void runAtLocationTimer(Location, Consumer, long, long, TimeUnit)
- WrappedTask runAtEntityTimer(Entity, Runnable, long, long)
- WrappedTask runAtEntityTimer(Entity, Runnable, Runnable, long, long)
- void runAtEntityTimer(Entity, Consumer, long, long)
- void runAtEntityTimer(Entity, Consumer, Runnable, long, long)
- WrappedTask runAtEntityTimer(Entity, Runnable, long, long, TimeUnit)
- void runAtEntityTimer(Entity, Consumer, long, long, TimeUnit)
- WrappedTask runTimer(Runnable, long, long)
- void runTimer(Consumer, long, long)
- WrappedTask runTimer(Runnable, long, long, TimeUnit)
- void runTimer(Consumer, long, long, TimeUnit)

### Class: com.ghostchu.quickshop.shade.com.tcoded.impl.LegacyPaperImplementation
Type: Class
Extends: com.ghostchu.quickshop.shade.com.tcoded.impl.LegacySpigotImplementation

No public methods found

### Class: com.ghostchu.quickshop.shade.com.tcoded.impl.LegacySpigotImplementation
Type: Class
Implements: com.ghostchu.quickshop.shade.com.tcoded.impl.PlatformScheduler

Methods:
- CompletableFuture runAtEntityWithFallback(Entity, Consumer, Runnable)
- WrappedTask runLaterAsync(Runnable, long)
- CompletableFuture runLaterAsync(Consumer, long)
- WrappedTask runLaterAsync(Runnable, long, TimeUnit)
- CompletableFuture runLaterAsync(Consumer, long, TimeUnit)
- Player getPlayer(String)
- Player getPlayer(UUID)
- WrappedTask runTimerAsync(Runnable, long, long)
- void runTimerAsync(Consumer, long, long)
- WrappedTask runTimerAsync(Runnable, long, long, TimeUnit)
- void runTimerAsync(Consumer, long, long, TimeUnit)
- WrappedTask wrapTask(Object)
- List getAllTasks()
- List getAllServerTasks()
- void cancelAllTasks()
- WrappedTask runAtLocationLater(Location, Runnable, long)
- CompletableFuture runAtLocationLater(Location, Consumer, long)
- WrappedTask runAtLocationLater(Location, Runnable, long, TimeUnit)
- CompletableFuture runAtLocationLater(Location, Consumer, long, TimeUnit)
- CompletableFuture runNextTick(Consumer)
- boolean isOwnedByCurrentRegion(Location)
- boolean isOwnedByCurrentRegion(Location, int)
- boolean isOwnedByCurrentRegion(Block)
- boolean isOwnedByCurrentRegion(World, int, int)
- boolean isOwnedByCurrentRegion(World, int, int, int)
- boolean isOwnedByCurrentRegion(Entity)
- WrappedTask runAtEntityLater(Entity, Runnable, long)
- WrappedTask runAtEntityLater(Entity, Runnable, Runnable, long)
- CompletableFuture runAtEntityLater(Entity, Consumer, long)
- CompletableFuture runAtEntityLater(Entity, Consumer, Runnable, long)
- WrappedTask runAtEntityLater(Entity, Runnable, long, TimeUnit)
- CompletableFuture runAtEntityLater(Entity, Consumer, long, TimeUnit)
- void cancelTask(WrappedTask)
- CompletableFuture teleportAsync(Entity, Location)
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)
- CompletableFuture runAsync(Consumer)
- WrappedTask runLater(Runnable, long)
- CompletableFuture runLater(Consumer, long)
- WrappedTask runLater(Runnable, long, TimeUnit)
- CompletableFuture runLater(Consumer, long, TimeUnit)
- CompletableFuture runAtEntity(Entity, Consumer)
- CompletableFuture runAtLocation(Location, Consumer)
- boolean isGlobalTickThread()
- Player getPlayerExact(String)
- WrappedTask runAtLocationTimer(Location, Runnable, long, long)
- void runAtLocationTimer(Location, Consumer, long, long)
- WrappedTask runAtLocationTimer(Location, Runnable, long, long, TimeUnit)
- void runAtLocationTimer(Location, Consumer, long, long, TimeUnit)
- WrappedTask runAtEntityTimer(Entity, Runnable, long, long)
- WrappedTask runAtEntityTimer(Entity, Runnable, Runnable, long, long)
- void runAtEntityTimer(Entity, Consumer, long, long)
- void runAtEntityTimer(Entity, Consumer, Runnable, long, long)
- WrappedTask runAtEntityTimer(Entity, Runnable, long, long, TimeUnit)
- void runAtEntityTimer(Entity, Consumer, long, long, TimeUnit)
- WrappedTask runTimer(Runnable, long, long)
- void runTimer(Consumer, long, long)
- WrappedTask runTimer(Runnable, long, long, TimeUnit)
- void runTimer(Consumer, long, long, TimeUnit)

### Class: com.ghostchu.quickshop.shade.com.tcoded.impl.PaperImplementation
Type: Class
Extends: com.ghostchu.quickshop.shade.com.tcoded.impl.SpigotImplementation

Methods:
- CompletableFuture teleportAsync(Entity, Location)
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.ghostchu.quickshop.shade.com.tcoded.impl.SpigotImplementation
Type: Class
Implements: com.ghostchu.quickshop.shade.com.tcoded.impl.PlatformScheduler

Methods:
- CompletableFuture runAtEntityWithFallback(Entity, Consumer, Runnable)
- WrappedTask runLaterAsync(Runnable, long)
- CompletableFuture runLaterAsync(Consumer, long)
- WrappedTask runLaterAsync(Runnable, long, TimeUnit)
- CompletableFuture runLaterAsync(Consumer, long, TimeUnit)
- Player getPlayer(String)
- Player getPlayer(UUID)
- WrappedTask runTimerAsync(Runnable, long, long)
- void runTimerAsync(Consumer, long, long)
- WrappedTask runTimerAsync(Runnable, long, long, TimeUnit)
- void runTimerAsync(Consumer, long, long, TimeUnit)
- WrappedTask wrapTask(Object)
- List getAllTasks()
- List getAllServerTasks()
- void cancelAllTasks()
- WrappedTask runAtLocationLater(Location, Runnable, long)
- CompletableFuture runAtLocationLater(Location, Consumer, long)
- WrappedTask runAtLocationLater(Location, Runnable, long, TimeUnit)
- CompletableFuture runAtLocationLater(Location, Consumer, long, TimeUnit)
- CompletableFuture runNextTick(Consumer)
- boolean isOwnedByCurrentRegion(Location)
- boolean isOwnedByCurrentRegion(Location, int)
- boolean isOwnedByCurrentRegion(Block)
- boolean isOwnedByCurrentRegion(World, int, int)
- boolean isOwnedByCurrentRegion(World, int, int, int)
- boolean isOwnedByCurrentRegion(Entity)
- WrappedTask runAtEntityLater(Entity, Runnable, long)
- WrappedTask runAtEntityLater(Entity, Runnable, Runnable, long)
- CompletableFuture runAtEntityLater(Entity, Consumer, long)
- CompletableFuture runAtEntityLater(Entity, Consumer, Runnable, long)
- WrappedTask runAtEntityLater(Entity, Runnable, long, TimeUnit)
- CompletableFuture runAtEntityLater(Entity, Consumer, long, TimeUnit)
- void cancelTask(WrappedTask)
- CompletableFuture teleportAsync(Entity, Location)
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)
- CompletableFuture runAsync(Consumer)
- WrappedTask runLater(Runnable, long)
- CompletableFuture runLater(Consumer, long)
- WrappedTask runLater(Runnable, long, TimeUnit)
- CompletableFuture runLater(Consumer, long, TimeUnit)
- CompletableFuture runAtEntity(Entity, Consumer)
- CompletableFuture runAtLocation(Location, Consumer)
- boolean isGlobalTickThread()
- Player getPlayerExact(String)
- WrappedTask runAtLocationTimer(Location, Runnable, long, long)
- void runAtLocationTimer(Location, Consumer, long, long)
- WrappedTask runAtLocationTimer(Location, Runnable, long, long, TimeUnit)
- void runAtLocationTimer(Location, Consumer, long, long, TimeUnit)
- WrappedTask runAtEntityTimer(Entity, Runnable, long, long)
- WrappedTask runAtEntityTimer(Entity, Runnable, Runnable, long, long)
- void runAtEntityTimer(Entity, Consumer, long, long)
- void runAtEntityTimer(Entity, Consumer, Runnable, long, long)
- WrappedTask runAtEntityTimer(Entity, Runnable, long, long, TimeUnit)
- void runAtEntityTimer(Entity, Consumer, long, long, TimeUnit)
- WrappedTask runTimer(Runnable, long, long)
- void runTimer(Consumer, long, long)
- WrappedTask runTimer(Runnable, long, long, TimeUnit)
- void runTimer(Consumer, long, long, TimeUnit)

### Class: com.ghostchu.quickshop.shade.com.tcoded.impl.UnsupportedImplementation
Type: Class
Extends: com.ghostchu.quickshop.shade.com.tcoded.impl.LegacySpigotImplementation

No public methods found

## Package: com.ghostchu.quickshop.shade.com.tcoded.type

### Class: com.ghostchu.quickshop.shade.com.tcoded.type.Ref
Type: Class

Methods:
- void set(Object)
- Object get()

## Package: com.ghostchu.quickshop.shade.com.tcoded.util

### Class: com.ghostchu.quickshop.shade.com.tcoded.util.FoliaLibOptions
Type: Class

Methods:
- void enableInvalidTickDebugMode()
- boolean isInvalidTickDebugMode()
- void disableIsValidOnNonFolia()
- boolean isDisableNotifications()
- boolean useIsValidOnNonFolia()
- void disableInvalidTickDebugMode()
- void disableNotifications()

### Class: com.ghostchu.quickshop.shade.com.tcoded.util.ImplementationTestsUtil
Type: Class

Methods:
- boolean isCancelledSupported()
- boolean isTaskConsumersSupported()
- boolean isAsyncTeleportSupported()

### Class: com.ghostchu.quickshop.shade.com.tcoded.util.InvalidTickDelayNotifier
Type: Class

Methods:
- void notifyOnce(long)

### Class: com.ghostchu.quickshop.shade.com.tcoded.util.TimeConverter
Type: Class

Methods:
- long toTicks(long, TimeUnit)
- long toMillis(long)

## Package: com.ghostchu.quickshop.shade.com.tcoded.wrapper.task

### Class: com.ghostchu.quickshop.shade.com.tcoded.wrapper.task.WrappedTask
Type: Interface

Methods:
- void cancel()
- Plugin getOwningPlugin()
- boolean isCancelled()
- boolean isAsync()

### Class: com.ghostchu.quickshop.shade.com.tcoded.wrapper.task.WrappedBukkitTask
Type: Class
Implements: com.ghostchu.quickshop.shade.com.tcoded.wrapper.task.WrappedTask

Methods:
- void cancel()
- Plugin getOwningPlugin()
- boolean isCancelled()
- boolean isAsync()

### Class: com.ghostchu.quickshop.shade.com.tcoded.wrapper.task.WrappedFoliaTask
Type: Class
Implements: com.ghostchu.quickshop.shade.com.tcoded.wrapper.task.WrappedTask

Methods:
- void cancel()
- Plugin getOwningPlugin()
- boolean isCancelled()
- boolean isAsync()

### Class: com.ghostchu.quickshop.shade.com.tcoded.wrapper.task.WrappedLegacyBukkitTask
Type: Class
Implements: com.ghostchu.quickshop.shade.com.tcoded.wrapper.task.WrappedTask

Methods:
- void cancel()
- Plugin getOwningPlugin()
- boolean isCancelled()
- boolean isAsync()

## Package: com.ghostchu.quickshop.shade.io.papermc.lib

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.PaperLib
Type: Class

Methods:
- boolean isPaper()
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)
- CompletableFuture getChunkAtAsync(Location)
- CompletableFuture getChunkAtAsync(Location, boolean)
- CompletableFuture getChunkAtAsync(World, int, int)
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)
- int getMinecraftVersion()
- boolean isVersion(int)
- boolean isVersion(int, int)
- Environment getEnvironment()
- int getMinecraftReleaseCandidateVersion()
- int getMinecraftPatchVersion()
- CompletableFuture teleportAsync(Entity, Location)
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)
- boolean isSpigot()
- CompletableFuture getChunkAtAsyncUrgently(World, int, int, boolean)
- boolean isChunkGenerated(Location)
- boolean isChunkGenerated(World, int, int)
- void setCustomEnvironment(Environment)
- void suggestPaper(Plugin)
- void suggestPaper(Plugin, Level)
- BlockStateSnapshotResult getBlockState(Block, boolean)
- int getMinecraftPreReleaseVersion()
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

## Package: com.ghostchu.quickshop.shade.io.papermc.lib.environments

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.environments.CraftBukkitEnvironment
Type: Class
Extends: com.ghostchu.quickshop.shade.io.papermc.lib.environments.Environment

Methods:
- String getName()

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.environments.Environment
Type: Abstract Class

Methods:
- boolean isPaper()
- String getName()
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)
- CompletableFuture teleport(Entity, Location, PlayerTeleportEvent$TeleportCause)
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)
- int getMinecraftVersion()
- boolean isVersion(int)
- boolean isVersion(int, int)
- int getMinecraftReleaseCandidateVersion()
- int getMinecraftPatchVersion()
- boolean isSpigot()
- CompletableFuture getChunkAtAsyncUrgently(World, int, int, boolean)
- boolean isChunkGenerated(World, int, int)
- BlockStateSnapshotResult getBlockState(Block, boolean)
- int getMinecraftPreReleaseVersion()
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.environments.PaperEnvironment
Type: Class
Extends: com.ghostchu.quickshop.shade.io.papermc.lib.environments.SpigotEnvironment

Methods:
- boolean isPaper()
- String getName()

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.environments.SpigotEnvironment
Type: Class
Extends: com.ghostchu.quickshop.shade.io.papermc.lib.environments.CraftBukkitEnvironment

Methods:
- String getName()
- boolean isSpigot()

## Package: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncchunks

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncchunks.AsyncChunks
Type: Interface

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncchunks.AsyncChunksPaper_13
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncchunks.AsyncChunksPaper_15
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncchunks.AsyncChunksPaper_9_12
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncchunks.AsyncChunksSync
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

## Package: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncteleport

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncteleport.AsyncTeleport
Type: Interface

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncteleport.AsyncTeleportPaper
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncteleport.AsyncTeleportPaper_13
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncteleport.AsyncTeleportSync
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

## Package: com.ghostchu.quickshop.shade.io.papermc.lib.features.bedspawnlocation

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.bedspawnlocation.BedSpawnLocation
Type: Interface

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.bedspawnlocation.BedSpawnLocationPaper
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.bedspawnlocation.BedSpawnLocation

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.bedspawnlocation.BedSpawnLocationSync
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.bedspawnlocation.BedSpawnLocation

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

## Package: com.ghostchu.quickshop.shade.io.papermc.lib.features.blockstatesnapshot

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.blockstatesnapshot.BlockStateSnapshot
Type: Interface

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.blockstatesnapshot.BlockStateSnapshotBeforeSnapshots
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.blockstatesnapshot.BlockStateSnapshotNoOption
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.blockstatesnapshot.BlockStateSnapshotOptionalSnapshots
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.blockstatesnapshot.BlockStateSnapshotResult
Type: Class

Methods:
- BlockState getState()
- boolean isSnapshot()

## Package: com.ghostchu.quickshop.shade.io.papermc.lib.features.chunkisgenerated

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.chunkisgenerated.ChunkIsGenerated
Type: Interface

Methods:
- boolean isChunkGenerated(World, int, int)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.chunkisgenerated.ChunkIsGeneratedApiExists
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.chunkisgenerated.ChunkIsGenerated

Methods:
- boolean isChunkGenerated(World, int, int)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.chunkisgenerated.ChunkIsGeneratedUnknown
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.chunkisgenerated.ChunkIsGenerated

Methods:
- boolean isChunkGenerated(World, int, int)

## Package: com.ghostchu.quickshop.shade.io.papermc.lib.features.inventoryholdersnapshot

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.inventoryholdersnapshot.InventoryHolderSnapshot
Type: Interface

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.inventoryholdersnapshot.InventoryHolderSnapshotBeforeSnapshots
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.inventoryholdersnapshot.InventoryHolderSnapshotNoOption
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.inventoryholdersnapshot.InventoryHolderSnapshotOptionalSnapshots
Type: Class
Implements: com.ghostchu.quickshop.shade.io.papermc.lib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.ghostchu.quickshop.shade.io.papermc.lib.features.inventoryholdersnapshot.InventoryHolderSnapshotResult
Type: Class

Methods:
- boolean isSnapshot()
- InventoryHolder getHolder()

## Package: com.ghostchu.quickshop.shade.org.bstats

### Class: com.ghostchu.quickshop.shade.org.bstats.MetricsBase
Type: Class

Methods:
- void shutdown()
- void addCustomChart(CustomChart)

## Package: com.ghostchu.quickshop.shade.org.bstats.bukkit

### Class: com.ghostchu.quickshop.shade.org.bstats.bukkit.Metrics
Type: Class

Methods:
- void shutdown()
- void addCustomChart(CustomChart)

## Package: com.ghostchu.quickshop.shade.org.bstats.charts

### Class: com.ghostchu.quickshop.shade.org.bstats.charts.AdvancedBarChart
Type: Class
Extends: com.ghostchu.quickshop.shade.org.bstats.charts.CustomChart

No public methods found

### Class: com.ghostchu.quickshop.shade.org.bstats.charts.AdvancedPie
Type: Class
Extends: com.ghostchu.quickshop.shade.org.bstats.charts.CustomChart

No public methods found

### Class: com.ghostchu.quickshop.shade.org.bstats.charts.CustomChart
Type: Abstract Class

Methods:
- JsonObjectBuilder$JsonObject getRequestJsonObject(BiConsumer, boolean)

### Class: com.ghostchu.quickshop.shade.org.bstats.charts.DrilldownPie
Type: Class
Extends: com.ghostchu.quickshop.shade.org.bstats.charts.CustomChart

Methods:
- JsonObjectBuilder$JsonObject getChartData() throws Exception

### Class: com.ghostchu.quickshop.shade.org.bstats.charts.MultiLineChart
Type: Class
Extends: com.ghostchu.quickshop.shade.org.bstats.charts.CustomChart

No public methods found

### Class: com.ghostchu.quickshop.shade.org.bstats.charts.SimpleBarChart
Type: Class
Extends: com.ghostchu.quickshop.shade.org.bstats.charts.CustomChart

No public methods found

### Class: com.ghostchu.quickshop.shade.org.bstats.charts.SimplePie
Type: Class
Extends: com.ghostchu.quickshop.shade.org.bstats.charts.CustomChart

No public methods found

### Class: com.ghostchu.quickshop.shade.org.bstats.charts.SingleLineChart
Type: Class
Extends: com.ghostchu.quickshop.shade.org.bstats.charts.CustomChart

No public methods found

## Package: com.ghostchu.quickshop.shade.org.bstats.config

### Class: com.ghostchu.quickshop.shade.org.bstats.config.MetricsConfig
Type: Class

Methods:
- boolean isLogResponseStatusTextEnabled()
- boolean isLogSentDataEnabled()
- boolean didExistBefore()
- boolean isEnabled()
- boolean isLogErrorsEnabled()
- String getServerUUID()

## Package: com.ghostchu.quickshop.shade.org.bstats.json

### Class: com.ghostchu.quickshop.shade.org.bstats.json.JsonObjectBuilder
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

## Package: com.ghostchu.quickshop.shade.tne.item

### Class: com.ghostchu.quickshop.shade.tne.item.AbstractInventory
Type: Interface

Methods:
- Optional setSlot(int, SerialItem, boolean)
- Optional addItem(SerialItem, boolean)
- boolean canFit(SerialItem)
- Object inventory()

### Class: com.ghostchu.quickshop.shade.tne.item.AbstractItemStack
Type: Interface
Implements: java.lang.Cloneable

Methods:
- boolean similar(AbstractItemStack)
- AbstractItemStack damage(short)
- short damage()
- AbstractItemStack amount(int)
- int amount()
- AbstractItemStack debug(boolean)
- Optional data()
- void markDirty()
- AbstractItemStack lore(List)
- List lore()
- AbstractItemStack profile(SkullProfile)
- AbstractItemStack display(Component)
- Component display()
- AbstractItemStack flags(List)
- List flags()
- AbstractItemStack slot(int)
- int slot()
- Object locale()
- Map enchantments()
- boolean setsEquals(Set, Set)
- boolean listsEquals(List, List)
- boolean componentsEqual(List, List)
- AbstractItemStack modelData(int)
- int modelData()
- AbstractItemStack material(String)
- String material()
- AbstractItemStack enchant(String, int)
- AbstractItemStack enchant(Map)
- AbstractItemStack enchant(List)
- AbstractItemStack of(String, int)
- AbstractItemStack of(SerialItem)
- AbstractItemStack of(Object)
- AbstractItemStack of(JSONObject)
- AbstractItemStack applyData(SerialItemData)
- AbstractItemStack unbreakable(boolean)
- boolean unbreakable()
- Map attributes()
- AbstractItemStack attribute(String, SerialAttribute)
- AbstractItemStack attribute(Map)
- void setAmount(int)

### Class: com.ghostchu.quickshop.shade.tne.item.SerialItemData
Type: Interface

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean applies()
- Object apply(Object)
- void of(Object)
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.InventoryType
Type: Enum
Extends: java.lang.Enum

Methods:
- InventoryType valueOf(String)
- InventoryType[] values()

### Class: com.ghostchu.quickshop.shade.tne.item.JSONHelper
Type: Class

Methods:
- JSONObject getObject()
- UUID getUUID(String)
- Short getShort(String)
- JSONHelper getHelper(String)
- boolean isNull(String)
- Double getDouble(String)
- Boolean getBoolean(String)
- Integer getInteger(String)
- String getString(String)
- Float getFloat(String)
- boolean has(String)
- void setObject(JSONObject)
- JSONObject getJSON(String)

### Class: com.ghostchu.quickshop.shade.tne.item.SerialItem
Type: Class

Methods:
- String serialize()
- Optional unserialize(String) throws ParseException
- Optional unserialize(JSONObject) throws ParseException
- JSONObject toJSON()
- boolean jsonEquals(SerialItem)
- SerialItem of(AbstractItemStack)
- AbstractItemStack getStack()
- Optional parse(JSONObject)

## Package: com.ghostchu.quickshop.shade.tne.item.attribute

### Class: com.ghostchu.quickshop.shade.tne.item.attribute.SerialAttribute
Type: Class

Methods:
- void setSlot(SerialAttributeSlot)
- void setName(String)
- SerialAttributeSlot getSlot()
- String getName()
- void setIdentifier(UUID)
- UUID getIdentifier()
- void setOperation(SerialAttributeOperation)
- SerialAttributeOperation getOperation()
- void setAmount(double)
- double getAmount()

### Class: com.ghostchu.quickshop.shade.tne.item.attribute.SerialAttributeOperation
Type: Enum
Extends: java.lang.Enum

Methods:
- SerialAttributeOperation valueOf(String)
- SerialAttributeOperation[] values()

### Class: com.ghostchu.quickshop.shade.tne.item.attribute.SerialAttributeSlot
Type: Enum
Extends: java.lang.Enum

Methods:
- SerialAttributeSlot valueOf(String)
- SerialAttributeSlot[] values()

## Package: com.ghostchu.quickshop.shade.tne.item.bukkit

### Class: com.ghostchu.quickshop.shade.tne.item.bukkit.BukkitCalculationsProvider
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.item.providers.CalculationsProvider

Methods:
- boolean drop(Collection, UUID)
- int removeItem(BukkitItemStack, Inventory)
- int removeItem(AbstractItemStack, Object)
- int removeAll(BukkitItemStack, Inventory)
- int removeAll(AbstractItemStack, Object)
- Collection giveItems(Collection, Inventory)
- Collection giveItems(Collection, Object)
- int count(BukkitItemStack, Inventory)
- int count(AbstractItemStack, Object)
- void takeItems(Collection, Inventory)
- void takeItems(Collection, Object)
- Optional getInventory(UUID, InventoryType)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkit.BukkitHelper
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.item.providers.HelperMethods

Methods:
- LinkedList materials()
- LinkedList flags()
- LinkedList enchantments()

### Class: com.ghostchu.quickshop.shade.tne.item.bukkit.BukkitItemStack
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.item.AbstractItemStack

Methods:
- boolean similarStack(BukkitItemStack)
- boolean similar(AbstractItemStack)
- BukkitItemStack damage(short)
- short damage()
- AbstractItemStack damage(short)
- BukkitItemStack amount(int)
- int amount()
- AbstractItemStack amount(int)
- BukkitItemStack debug(boolean)
- AbstractItemStack debug(boolean)
- Optional data()
- void markDirty()
- BukkitItemStack lore(List)
- List lore()
- AbstractItemStack lore(List)
- String displayPlain()
- AbstractItemStack profile(SkullProfile)
- BukkitItemStack display(Component)
- Component display()
- AbstractItemStack display(Component)
- BukkitItemStack flags(List)
- List flags()
- AbstractItemStack flags(List)
- BukkitItemStack slot(int)
- int slot()
- AbstractItemStack slot(int)
- BukkitItemStack locale(ItemStack)
- ItemStack locale()
- Object locale()
- Map enchantments()
- BukkitItemStack modelData(int)
- int modelData()
- AbstractItemStack modelData(int)
- BukkitItemStack material(String)
- String material()
- AbstractItemStack material(String)
- BukkitItemStack enchant(String, int)
- BukkitItemStack enchant(Map)
- BukkitItemStack enchant(List)
- AbstractItemStack enchant(List)
- AbstractItemStack enchant(Map)
- AbstractItemStack enchant(String, int)
- BukkitItemStack of(String, int)
- BukkitItemStack of(SerialItem)
- BukkitItemStack of(ItemStack)
- BukkitItemStack of(JSONObject)
- AbstractItemStack of(JSONObject)
- AbstractItemStack of(Object)
- AbstractItemStack of(SerialItem)
- AbstractItemStack of(String, int)
- BukkitItemStack applyData(SerialItemData)
- AbstractItemStack applyData(SerialItemData)
- BukkitItemStack unbreakable(boolean)
- boolean unbreakable()
- AbstractItemStack unbreakable(boolean)
- Map attributes()
- BukkitItemStack attribute(String, SerialAttribute)
- BukkitItemStack attribute(Map)
- AbstractItemStack attribute(Map)
- AbstractItemStack attribute(String, SerialAttribute)
- void setAmount(int)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkit.BukkitMetaBuild
Type: Class

Methods:
- Optional parseMeta(ItemStack)

## Package: com.ghostchu.quickshop.shade.tne.item.bukkit.data

### Class: com.ghostchu.quickshop.shade.tne.item.bukkit.data.BukkitBundleData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.BundleData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkit.data.BukkitCrossbowMeta
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.CrossBowMeta

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkit.data.BukkitShulkerData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.ShulkerData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

## Package: com.ghostchu.quickshop.shade.tne.item.bukkitbase

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.ParsingUtil
Type: Class

Methods:
- ItemMeta buildFor(ItemStack, Class)
- FireworkEffect fromSerial(SerialFireworkEffect)
- SerialAttributeSlot attributeSlot(EquipmentSlot)
- EquipmentSlot attributeSlot(SerialAttributeSlot)
- SerialFireworkEffect fromEffect(FireworkEffect)
- SerialAttributeOperation attributeOperation(AttributeModifier$Operation)
- AttributeModifier$Operation attributeOperation(SerialAttributeOperation)

## Package: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitAxolotlData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.AxolotlData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitBannerData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.BannerData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitBookData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.BookData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitCompassData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.CompassData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitEnchantData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.EnchantStorageData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitFireworkData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.FireworkData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitFireworkEffectData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.FireworkData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitKnowledgeBookData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.KnowledgeBookData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitLeatherData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.LeatherData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitMapData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.MapData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitPotionData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.SerialPotionData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitRepairableMeta
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.RepairableData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitSkullData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.SkullData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitSuspiciousStewData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.SuspiciousStewData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.bukkitbase.data.BukkitTropicalFishData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.TropicalFishData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

## Package: com.ghostchu.quickshop.shade.tne.item.data

### Class: com.ghostchu.quickshop.shade.tne.item.data.AxolotlData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.BannerData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.BookData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.BundleData
Type: Abstract Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.ItemStorageData

Methods:
- JSONObject toJSON()
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.CompassData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.CrossBowMeta
Type: Abstract Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.ItemStorageData

Methods:
- JSONObject toJSON()
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.EnchantStorageData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.FireworkData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.FireworkEffectData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- JSONObject toJSON()
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.InstrumentMeta
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.ItemStorageData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- Map getItems()
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.KnowledgeBookData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.LeatherData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.MapData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.RepairableData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean hasCost()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.SerialPotionData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.ShulkerData
Type: Abstract Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.ItemStorageData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.SkullData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- SkullProfile getProfile()
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.SuspiciousStewData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

### Class: com.ghostchu.quickshop.shade.tne.item.data.TropicalFishData
Type: Abstract Class
Implements: com.ghostchu.quickshop.shade.tne.item.SerialItemData

Methods:
- boolean similar(SerialItemData)
- JSONObject toJSON()
- boolean equals(SerialItemData)
- void readJSON(JSONHelper)

## Package: com.ghostchu.quickshop.shade.tne.item.data.banner

### Class: com.ghostchu.quickshop.shade.tne.item.data.banner.PatternData
Type: Class

Methods:
- void setColor(String)
- void setPattern(String)
- String getColor()
- String getPattern()

## Package: com.ghostchu.quickshop.shade.tne.item.data.firework

### Class: com.ghostchu.quickshop.shade.tne.item.data.firework.SerialFireworkEffect
Type: Class

Methods:
- List getFadeColors()
- JSONObject toJSON()
- List getColors()
- boolean hasTrail()
- String getType()
- void setTrail(boolean)
- void setColors(List)
- void setFadeColors(List)
- SerialFireworkEffect readJSON(JSONHelper)
- void setType(String)
- void setFlicker(boolean)
- boolean hasFlicker()

## Package: com.ghostchu.quickshop.shade.tne.item.data.potion

### Class: com.ghostchu.quickshop.shade.tne.item.data.potion.PotionEffectData
Type: Class

Methods:
- void setDuration(int)
- void setName(String)
- void setAmplifier(int)
- int getAmplifier()
- String getName()
- void setAmbient(boolean)
- boolean hasParticles()
- boolean isAmbient()
- void setIcon(boolean)
- JSONObject toJSON()
- int getDuration()
- boolean hasIcon()
- void setParticles(boolean)
- PotionEffectData readJSON(JSONHelper)

## Package: com.ghostchu.quickshop.shade.tne.item.paper

### Class: com.ghostchu.quickshop.shade.tne.item.paper.PaperCalculationsProvider
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.item.providers.CalculationsProvider

Methods:
- boolean drop(Collection, UUID)
- int removeItem(PaperItemStack, Inventory)
- int removeItem(AbstractItemStack, Object)
- int removeAll(PaperItemStack, Inventory)
- int removeAll(AbstractItemStack, Object)
- Collection giveItems(Collection, Inventory)
- Collection giveItems(Collection, Object)
- int count(PaperItemStack, Inventory)
- int count(AbstractItemStack, Object)
- void takeItems(Collection, Inventory)
- void takeItems(Collection, Object)
- Optional getInventory(UUID, InventoryType)

### Class: com.ghostchu.quickshop.shade.tne.item.paper.PaperHelper
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.item.providers.HelperMethods

Methods:
- LinkedList materials()
- LinkedList flags()
- LinkedList enchantments()

### Class: com.ghostchu.quickshop.shade.tne.item.paper.PaperItemStack
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.item.AbstractItemStack

Methods:
- PaperItemStack damage(short)
- short damage()
- AbstractItemStack damage(short)
- Optional data()
- void markDirty()
- PaperItemStack lore(List)
- List lore()
- AbstractItemStack lore(List)
- String displayPlain()
- PaperItemStack flags(List)
- List flags()
- AbstractItemStack flags(List)
- PaperItemStack slot(int)
- int slot()
- AbstractItemStack slot(int)
- PaperItemStack locale(ItemStack)
- ItemStack locale()
- Object locale()
- PaperItemStack modelData(int)
- int modelData()
- AbstractItemStack modelData(int)
- PaperItemStack of(String, int)
- PaperItemStack of(SerialItem)
- PaperItemStack of(ItemStack)
- PaperItemStack of(JSONObject)
- AbstractItemStack of(JSONObject)
- AbstractItemStack of(Object)
- AbstractItemStack of(SerialItem)
- AbstractItemStack of(String, int)
- PaperItemStack unbreakable(boolean)
- boolean unbreakable()
- AbstractItemStack unbreakable(boolean)
- PaperItemStack attribute(String, SerialAttribute)
- PaperItemStack attribute(Map)
- AbstractItemStack attribute(Map)
- AbstractItemStack attribute(String, SerialAttribute)
- void setAmount(int)
- boolean similarStack(PaperItemStack)
- boolean similar(AbstractItemStack)
- PaperItemStack amount(int)
- int amount()
- AbstractItemStack amount(int)
- PaperItemStack debug(boolean)
- boolean debug()
- AbstractItemStack debug(boolean)
- AbstractItemStack profile(SkullProfile)
- PaperItemStack display(Component)
- Component display()
- AbstractItemStack display(Component)
- Map enchantments()
- PaperItemStack material(String)
- String material()
- AbstractItemStack material(String)
- Material getType()
- PaperItemStack enchant(String, int)
- PaperItemStack enchant(Map)
- PaperItemStack enchant(List)
- AbstractItemStack enchant(List)
- AbstractItemStack enchant(Map)
- AbstractItemStack enchant(String, int)
- PaperItemStack applyData(SerialItemData)
- AbstractItemStack applyData(SerialItemData)
- Map attributes()

### Class: com.ghostchu.quickshop.shade.tne.item.paper.PaperMetaBuild
Type: Class

Methods:
- Optional parseMeta(ItemStack)

## Package: com.ghostchu.quickshop.shade.tne.item.paper.data

### Class: com.ghostchu.quickshop.shade.tne.item.paper.data.PaperBundleData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.BundleData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.paper.data.PaperCrossbowMeta
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.CrossBowMeta

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

### Class: com.ghostchu.quickshop.shade.tne.item.paper.data.PaperShulkerData
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.item.data.ShulkerData

Methods:
- ItemStack apply(ItemStack)
- Object apply(Object)
- void of(ItemStack)
- void of(Object)

## Package: com.ghostchu.quickshop.shade.tne.item.providers

### Class: com.ghostchu.quickshop.shade.tne.item.providers.CalculationsProvider
Type: Interface

Methods:
- boolean drop(Collection, UUID)
- int removeItem(AbstractItemStack, Object)
- int removeItem(AbstractItemStack, UUID)
- int removeAll(AbstractItemStack, Object)
- int removeAll(AbstractItemStack, UUID)
- Collection giveItems(Collection, Object)
- Collection giveItems(Collection, UUID)
- int count(AbstractItemStack, Object)
- int count(AbstractItemStack, UUID)
- boolean itemsEqual(AbstractItemStack, AbstractItemStack)
- void takeItems(Collection, Object)
- void takeItems(Collection, UUID)
- Optional getInventory(UUID, InventoryType)

### Class: com.ghostchu.quickshop.shade.tne.item.providers.HelperMethods
Type: Interface

Methods:
- LinkedList materials()
- LinkedList flags()
- LinkedList enchantments()

### Class: com.ghostchu.quickshop.shade.tne.item.providers.SkullProfile
Type: Class

Methods:
- void setName(String)
- String getName()
- void setTexture(String)
- boolean equals(SkullProfile)
- UUID getUuid()
- void setUuid(UUID)
- String getTexture()

### Class: com.ghostchu.quickshop.shade.tne.item.providers.VersionUtil
Type: Class

Methods:
- boolean isOneNine(String)
- boolean isOneThirteen(String)
- boolean isOneSeven(String)
- boolean isOneTen(String)
- boolean isOneTwelve(String)
- boolean isVersion(String, String)
- boolean isOneFourteen(String)
- boolean isOneEleven(String)
- boolean isOneEight(String)

## Package: com.ghostchu.quickshop.shade.tne.menu.bukkit

### Class: com.ghostchu.quickshop.shade.tne.menu.bukkit.BukkitInventory
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.menu.core.compatibility.PlayerInventory

Methods:
- void openInventory(Inventory)
- void openInventory(Object)
- Inventory build(MenuPlayer, Menu, int)
- Object build(MenuPlayer, Menu, int)
- void updateInventory(int, AbstractItemStack)
- void close()
- UUID player()

### Class: com.ghostchu.quickshop.shade.tne.menu.bukkit.BukkitMenuHandler
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.menu.core.MenuHandler

Methods:
- AbstractItemStack stackBuilder()
- MenuManager getManager()
- void registerListeners()

### Class: com.ghostchu.quickshop.shade.tne.menu.bukkit.BukkitPlayer
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.menu.core.compatibility.MenuPlayer

Methods:
- UUID identifier()
- boolean hasPermission(String)
- void message(String)
- BukkitInventory inventory()
- PlayerInventory inventory()

## Package: com.ghostchu.quickshop.shade.tne.menu.bukkit.listener

### Class: com.ghostchu.quickshop.shade.tne.menu.bukkit.listener.BukkitChatListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onChat(AsyncPlayerChatEvent)

### Class: com.ghostchu.quickshop.shade.tne.menu.bukkit.listener.BukkitInventoryClickListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onClick(InventoryClickEvent)

### Class: com.ghostchu.quickshop.shade.tne.menu.bukkit.listener.BukkitInventoryCloseListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onClose(InventoryCloseEvent)

## Package: com.ghostchu.quickshop.shade.tne.menu.core

### Class: com.ghostchu.quickshop.shade.tne.menu.core.MenuHandler
Type: Interface

Methods:
- AbstractItemStack stackBuilder()
- void registerListeners()

### Class: com.ghostchu.quickshop.shade.tne.menu.core.Menu
Type: Class

Methods:
- void setName(String)
- Consumer getClose()
- void setOpen(Consumer)
- void setNonIcon(boolean)
- boolean onClick(MenuClickHandler)
- String getName()
- Consumer getOpen()
- boolean isNonIcon()
- void setClose(Consumer)
- void setTitle(String)
- int getRows()
- int maxSlot()
- boolean isBottom()
- void onClose(MenuPlayer)
- String getTitle()
- void setRows(int)
- void setBottom(boolean)
- void onOpen(MenuPlayer, int)
- void addPage(Page)
- Map getPages()

### Class: com.ghostchu.quickshop.shade.tne.menu.core.Page
Type: Class

Methods:
- Function getClickHandler()
- int number()
- void setOpen(Consumer)
- boolean onClick(MenuClickHandler)
- Consumer getOpen()
- void setColumn(int, int, IconBuilder)
- void setColumn(int, int, int, IconBuilder)
- void setColumn(int, int, int, int, IconBuilder)
- void setClickHandler(Function)
- Map getIcons()
- void setRow(int, IconBuilder)
- void setRow(int, int, IconBuilder)
- void setRow(int, int, int, IconBuilder)
- void addIcon(Icon)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.PlayerInstancePage
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.Page

Methods:
- boolean onClick(UUID, MenuClickHandler)
- void setColumn(UUID, int, int, IconBuilder)
- void setColumn(UUID, int, int, int, IconBuilder)
- void setColumn(UUID, int, int, int, int, IconBuilder)
- void removeInstance(UUID)
- boolean hasInstance(UUID)
- Map getIcons(UUID)
- void setRow(UUID, int, IconBuilder)
- void setRow(UUID, int, int, IconBuilder)
- void setRow(UUID, int, int, int, IconBuilder)
- void addIcon(UUID, Icon)

## Package: com.ghostchu.quickshop.shade.tne.menu.core.builder

### Class: com.ghostchu.quickshop.shade.tne.menu.core.builder.IconBuilder
Type: Class

Methods:
- IconBuilder withDefaultState(String)
- IconBuilder withPdcApplication(boolean)
- IconBuilder withItemProvider(Function)
- IconBuilder withActions(IconAction[])
- Icon build()
- IconBuilder withConstraint(Constraint, String)
- IconBuilder withState(String, AbstractItemStack)
- IconBuilder withStateID(String)
- IconBuilder withSlot(int)
- IconBuilder withSlot(SlotPos)
- IconBuilder withClick(Consumer)
- IconBuilder withStateHandler(Function)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.builder.MenuBuilder
Type: Class

Methods:
- MenuBuilder withRows(int)
- MenuBuilder withPages(Page[])
- Menu build()
- MenuBuilder withTitle(String)
- MenuBuilder withBottom(boolean)
- MenuBuilder withOpenCallback(Consumer)
- MenuBuilder withNonIcon(boolean)
- MenuBuilder withCloseCallback(Consumer)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.builder.PageBuilder
Type: Class

Methods:
- PageBuilder withClickHandler(Function)
- PageBuilder withRow(int, IconBuilder)
- PageBuilder withOpenHandler(Consumer)
- Page build()
- PageBuilder withColumn(int, int, IconBuilder)
- PageBuilder withColumn(int, int, int, IconBuilder)
- PageBuilder withColumn(int, int, int, int, IconBuilder)
- PageBuilder withIcons(Icon[])

### Class: com.ghostchu.quickshop.shade.tne.menu.core.builder.PlayerPageBuilder
Type: Class

Methods:
- PlayerPageBuilder withClickHandler(Function)
- PlayerPageBuilder withRow(UUID, int, IconBuilder)
- PlayerPageBuilder withRow(UUID, int, int, IconBuilder)
- PlayerPageBuilder withRow(UUID, int, int, int, IconBuilder)
- PlayerPageBuilder withOpenHandler(Consumer)
- PlayerInstancePage build()
- PlayerPageBuilder withColumn(UUID, int, int, IconBuilder)
- PlayerPageBuilder withColumn(UUID, int, int, int, IconBuilder)
- PlayerPageBuilder withColumn(UUID, int, int, int, int, IconBuilder)
- PlayerPageBuilder withIcons(UUID, Icon[])

## Package: com.ghostchu.quickshop.shade.tne.menu.core.callbacks

### Class: com.ghostchu.quickshop.shade.tne.menu.core.callbacks.ChatCallback
Type: Class

Methods:
- MenuPlayer getPlayer()
- int getPage()
- String getMenu()
- String getMessage()
- void setMenu(String)
- void setPage(int)

## Package: com.ghostchu.quickshop.shade.tne.menu.core.callbacks.menu

### Class: com.ghostchu.quickshop.shade.tne.menu.core.callbacks.menu.MenuCallback
Type: Class

Methods:
- Menu getMenu()
- void setMenu(Menu)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.callbacks.menu.MenuCloseCallback
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.callbacks.menu.MenuCallback

Methods:
- MenuPlayer getPlayer()
- Page getPage()

### Class: com.ghostchu.quickshop.shade.tne.menu.core.callbacks.menu.MenuOpenCallback
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.callbacks.menu.MenuCallback

Methods:
- MenuPlayer getPlayer()
- Page getPage()
- Menu getMenu()

## Package: com.ghostchu.quickshop.shade.tne.menu.core.callbacks.page

### Class: com.ghostchu.quickshop.shade.tne.menu.core.callbacks.page.PageCallback
Type: Class

Methods:
- Page getPage()
- void setPage(Page)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.callbacks.page.PageOpenCallback
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.callbacks.page.PageCallback

Methods:
- MenuPlayer getPlayer()
- Page getPage()

## Package: com.ghostchu.quickshop.shade.tne.menu.core.compatibility

### Class: com.ghostchu.quickshop.shade.tne.menu.core.compatibility.MenuPlayer
Type: Interface

Methods:
- Optional viewer()
- UUID identifier()
- boolean hasPermission(String)
- void message(String)
- PlayerInventory inventory()
- void status(ViewerStatus)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.compatibility.PlayerInventory
Type: Interface

Methods:
- void openMenu(MenuPlayer, Menu)
- void openMenu(MenuPlayer, Menu, int)
- void openMenu(MenuPlayer, String)
- void openMenu(MenuPlayer, String, int)
- void openInventory(Object)
- Object build(MenuPlayer, Menu)
- Object build(MenuPlayer, Menu, int)
- void updateInventory(int, AbstractItemStack)
- boolean inMenu()
- void close()
- UUID player()

## Package: com.ghostchu.quickshop.shade.tne.menu.core.constraints

### Class: com.ghostchu.quickshop.shade.tne.menu.core.constraints.Constraint
Type: Interface

Methods:
- String identifier()
- Object defaultValue()
- String asString(Object)
- Object convert(String)
- boolean validate(String)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.constraints.ConstraintHolder
Type: Interface

Methods:
- Object getConstraint(Constraint)
- void addConstraint(Constraint, Object)
- void removeConstraint(Constraint)
- Map constraints()

## Package: com.ghostchu.quickshop.shade.tne.menu.core.constraints.impl

### Class: com.ghostchu.quickshop.shade.tne.menu.core.constraints.impl.BoolConstraint
Type: Interface
Implements: com.ghostchu.quickshop.shade.tne.menu.core.constraints.Constraint

Methods:
- Boolean convert(String)
- Object convert(String)
- boolean validate(String)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.constraints.impl.DoubleConstraint
Type: Interface
Implements: com.ghostchu.quickshop.shade.tne.menu.core.constraints.Constraint

Methods:
- Double convert(String)
- Object convert(String)
- boolean validate(String)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.constraints.impl.IntConstraint
Type: Interface
Implements: com.ghostchu.quickshop.shade.tne.menu.core.constraints.Constraint

Methods:
- Integer convert(String)
- Object convert(String)
- boolean validate(String)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.constraints.impl.StringConstraint
Type: Interface
Implements: com.ghostchu.quickshop.shade.tne.menu.core.constraints.Constraint

Methods:
- String convert(String)
- Object convert(String)
- boolean validate(String)

## Package: com.ghostchu.quickshop.shade.tne.menu.core.handlers

### Class: com.ghostchu.quickshop.shade.tne.menu.core.handlers.MenuClickHandler
Type: Class

Methods:
- ActionType action()
- String toString()
- Integer page()
- SlotPos slot()
- Menu menu()
- MenuPlayer player()

## Package: com.ghostchu.quickshop.shade.tne.menu.core.icon

### Class: com.ghostchu.quickshop.shade.tne.menu.core.icon.Icon
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.menu.core.constraints.ConstraintHolder

Methods:
- void setSlot(int)
- void setSlot(SlotPos)
- void addAction(IconAction)
- Consumer getClick()
- boolean onClick(MenuClickHandler)
- void setClick(Consumer)
- boolean pdcApplicaton()
- void pdcApplicaton(boolean)
- AbstractItemStack getItem(MenuPlayer)
- List getActions()
- int slot()
- Map constraints()

## Package: com.ghostchu.quickshop.shade.tne.menu.core.icon.action

### Class: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.ActionType
Type: Enum
Extends: java.lang.Enum

Methods:
- ActionType valueOf(String)
- ActionType[] values()

### Class: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.IconAction
Type: Abstract Class

Methods:
- boolean onClick(MenuClickHandler)
- ActionType getType()
- boolean continueOther()

## Package: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.impl

### Class: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.impl.ChatAction
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.IconAction

Methods:
- boolean onClick(MenuClickHandler)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.impl.DataAction
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.IconAction

Methods:
- boolean onClick(MenuClickHandler)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.impl.RunnableAction
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.IconAction

Methods:
- boolean onClick(MenuClickHandler)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.impl.SwitchMenuAction
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.IconAction

Methods:
- boolean onClick(MenuClickHandler)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.impl.SwitchPageAction
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.icon.action.IconAction

Methods:
- boolean onClick(MenuClickHandler)

## Package: com.ghostchu.quickshop.shade.tne.menu.core.icon.constraints

### Class: com.ghostchu.quickshop.shade.tne.menu.core.icon.constraints.IconStringConstraints
Type: Enum
Extends: java.lang.Enum
Implements: com.ghostchu.quickshop.shade.tne.menu.core.constraints.impl.StringConstraint

Methods:
- IconStringConstraints valueOf(String)
- IconStringConstraints[] values()

## Package: com.ghostchu.quickshop.shade.tne.menu.core.icon.impl

### Class: com.ghostchu.quickshop.shade.tne.menu.core.icon.impl.StateIcon
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.core.icon.Icon

Methods:
- boolean onClick(MenuClickHandler)
- AbstractItemStack getItem(MenuPlayer)
- Map getStates()
- void addState(String, AbstractItemStack)

## Package: com.ghostchu.quickshop.shade.tne.menu.core.manager

### Class: com.ghostchu.quickshop.shade.tne.menu.core.manager.MenuManager
Type: Class

Methods:
- MenuManager instance()
- HelperMethods getHelper()
- void setHelper(HelperMethods)
- Optional findViewer(UUID)
- void addMenu(Menu)
- Optional findMenu(String)
- void removeViewer(UUID)
- void updateViewer(UUID, String, int)
- void updateViewer(UUID, ViewerStatus)
- void addViewer(MenuViewer)
- Map recentlyClosed()
- boolean inMenu(UUID)
- void open(String, int, MenuPlayer)

## Package: com.ghostchu.quickshop.shade.tne.menu.core.utils

### Class: com.ghostchu.quickshop.shade.tne.menu.core.utils.PlayerInstance
Type: Class

Methods:
- Map getIcons()
- void addIcon(Icon)

### Class: com.ghostchu.quickshop.shade.tne.menu.core.utils.SlotPos
Type: Class

Methods:
- int getColumn()
- String toString()
- int slot()
- int getRow()

## Package: com.ghostchu.quickshop.shade.tne.menu.core.viewer

### Class: com.ghostchu.quickshop.shade.tne.menu.core.viewer.ViewerStatus
Type: Interface

Methods:
- boolean awaitingChatInput()
- boolean changing()
- boolean closeMenu()

### Class: com.ghostchu.quickshop.shade.tne.menu.core.viewer.CoreStatus
Type: Enum
Extends: java.lang.Enum
Implements: com.ghostchu.quickshop.shade.tne.menu.core.viewer.ViewerStatus

Methods:
- CoreStatus valueOf(String)
- CoreStatus[] values()

### Class: com.ghostchu.quickshop.shade.tne.menu.core.viewer.MenuViewer
Type: Class

Methods:
- void removeInstances()
- void addData(String, Object)
- Predicate getChatHandler()
- void setMenu(String)
- String menu()
- void setChatHandler(Predicate)
- UUID uuid()
- void setStatus(ViewerStatus)
- void addInstance(String)
- boolean chat(ChatCallback)
- Object dataOrDefault(String, Object)
- void merge(MenuViewer)
- int page()
- void close(MenuPlayer)
- ViewerStatus status()
- void setPage(int)
- Optional findData(String)

## Package: com.ghostchu.quickshop.shade.tne.menu.folia

### Class: com.ghostchu.quickshop.shade.tne.menu.folia.FoliaInventory
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.paper.PaperInventory

Methods:
- void openInventory(Inventory)
- void openInventory(Object)
- void updateInventory(int, AbstractItemStack)
- void close()

### Class: com.ghostchu.quickshop.shade.tne.menu.folia.FoliaMenuHandler
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.menu.core.MenuHandler

Methods:
- AbstractItemStack stackBuilder()
- MenuManager getManager()
- void registerListeners()

### Class: com.ghostchu.quickshop.shade.tne.menu.folia.FoliaPlayer
Type: Class
Extends: com.ghostchu.quickshop.shade.tne.menu.paper.PaperPlayer

Methods:
- PaperInventory inventory()
- PlayerInventory inventory()

## Package: com.ghostchu.quickshop.shade.tne.menu.folia.listener

### Class: com.ghostchu.quickshop.shade.tne.menu.folia.listener.FoliaChatListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onChat(AsyncPlayerChatEvent)

### Class: com.ghostchu.quickshop.shade.tne.menu.folia.listener.FoliaInventoryClickListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onClick(InventoryClickEvent)

### Class: com.ghostchu.quickshop.shade.tne.menu.folia.listener.FoliaInventoryCloseListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onClose(InventoryCloseEvent)

## Package: com.ghostchu.quickshop.shade.tne.menu.paper

### Class: com.ghostchu.quickshop.shade.tne.menu.paper.PaperInventory
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.menu.core.compatibility.PlayerInventory

Methods:
- void openInventory(Inventory)
- void openInventory(Object)
- Inventory build(MenuPlayer, Menu, int)
- Object build(MenuPlayer, Menu, int)
- void updateInventory(int, AbstractItemStack)
- void close()
- UUID player()

### Class: com.ghostchu.quickshop.shade.tne.menu.paper.PaperMenuHandler
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.menu.core.MenuHandler

Methods:
- AbstractItemStack stackBuilder()
- MenuManager getManager()
- void registerListeners()

### Class: com.ghostchu.quickshop.shade.tne.menu.paper.PaperPlayer
Type: Class
Implements: com.ghostchu.quickshop.shade.tne.menu.core.compatibility.MenuPlayer

Methods:
- UUID identifier()
- boolean hasPermission(String)
- void message(String)
- PaperInventory inventory()
- PlayerInventory inventory()

## Package: com.ghostchu.quickshop.shade.tne.menu.paper.listener

### Class: com.ghostchu.quickshop.shade.tne.menu.paper.listener.PaperChatListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onChat(AsyncPlayerChatEvent)

### Class: com.ghostchu.quickshop.shade.tne.menu.paper.listener.PaperInventoryClickListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onClick(InventoryClickEvent)

### Class: com.ghostchu.quickshop.shade.tne.menu.paper.listener.PaperInventoryCloseListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onClose(InventoryCloseEvent)

## Package: com.ghostchu.quickshop.shop

### Class: com.ghostchu.quickshop.shop.DisplayProvider
Type: Interface

Methods:
- AbstractDisplayItem provide(Shop)
- Plugin getProvider()

### Class: com.ghostchu.quickshop.shop.AbstractShopManager
Type: Abstract Class
Implements: com.ghostchu.quickshop.api.shop.ShopManager

Methods:
- void init()
- ShopCache getShopCache()
- List listTags(UUID)
- Map getShops()
- Map getShops(Chunk)
- Map getShops(String, int, int)
- Map getShops(ShopChunk)
- Map getShops(String)
- String format(double, World, String)
- String format(double, Shop)
- Shop getShop(long)
- Shop getShop(Location, boolean)
- List getAllShops()
- List getAllShops(QUser)
- List getAllShops(UUID)
- CompletableFuture queryShopInventoryCacheInDatabase(Shop)
- Set getLoadedShops()
- CompletableFuture registerShop(Shop, boolean)
- void unloadShop(Shop)
- void unloadShop(Shop, boolean)
- CompletableFuture unregisterShop(Shop, boolean)
- Shop findShopIncludeAttached(Location, boolean)
- List getShopsInWorld(World)
- List getShopsInWorld(String)
- Shop getShopFromRuntimeRandomUniqueId(UUID)
- Shop getShopFromRuntimeRandomUniqueId(UUID, boolean)
- CompletableFuture clearShopTags(UUID, Shop)
- CompletableFuture removeTag(UUID, Shop, String)
- CompletableFuture clearTagFromShops(UUID, String)
- CompletableFuture tagShop(UUID, Shop, String)
- Shop getShopIncludeAttached(Location)
- void loadShop(Shop)
- CompletableFuture queryTaggedShops(UUID, String)
- void bakeShopRuntimeRandomUniqueIdCache(Shop)

### Class: com.ghostchu.quickshop.shop.ContainerShop
Type: Class
Implements: com.ghostchu.quickshop.api.shop.Shop, com.ghostchu.simplereloadlib.Reloadable

Methods:
- Benefit getShopBenefit()
- void onClick(Player)
- Location getLocation()
- List getSigns()
- ShopType getShopType()
- int getRemainingStock()
- void buy(QUser, InventoryWrapper, Location, int) throws Exception
- boolean playerAuthorize(UUID, Plugin, String)
- boolean playerAuthorize(UUID, BuiltInShopPermission)
- ItemStack getItem()
- ReloadResult reloadModule() throws Exception
- void handleLoading()
- void setPrice(double)
- QUser getOwner()
- boolean isLoaded()
- void setOwner(QUser)
- void setShopBenefit(Benefit)
- short getDurability()
- boolean isUnlimited()
- int getRemainingSpace()
- QUser getTaxAccountActual()
- boolean isSelling()
- void checkDisplay()
- String saveToSymbolLink()
- void add(ItemStack, int)
- String getCurrency()
- ShopInfoStorage saveToInfoStorage()
- void setDisableDisplay(boolean)
- void setShopType(ShopType)
- void setSignText()
- void setSignText(List)
- void setSignText(ProxiedLocale)
- boolean matches(ItemStack)
- int getShopStackingAmount()
- Material getMaterial()
- boolean isDisableDisplay()
- void setTaxAccount(QUser)
- boolean isAttached(Block)
- void setExtra(Plugin, ConfigurationSection)
- AbstractDisplayItem getDisplayItem()
- boolean isShopSign(Sign)
- ConfigurationSection getExtra(Plugin)
- void setPlayerGroup(UUID, String)
- void setPlayerGroup(UUID, BuiltInShopPermissionGroup)
- void setShopId(long)
- Map getEnchants()
- CompletableFuture update()
- boolean isFreeShop()
- void setInventory(InventoryWrapper, InventoryWrapperManager)
- void setCurrency(String)
- void remove(ItemStack, int)
- void setDirty(boolean)
- void setDirty()
- String getPlayerGroup(UUID)
- boolean isStackingShop()
- void openPreview(Player)
- boolean isDirty()
- Component ownerName(boolean, ProxiedLocale)
- Component ownerName(ProxiedLocale)
- Component ownerName()
- String getShopName()
- int hashCode()
- void setUnlimited(boolean)
- boolean inventoryAvailable()
- void setShopName(String)
- String getInventoryWrapperProvider()
- InventoryWrapper getInventory()
- boolean isFrozen()
- void setItem(ItemStack)
- void claimShopSign(Sign)
- void handleUnloading(boolean)
- long getShopId()
- void sell(QUser, InventoryWrapper, Location, int) throws Exception
- boolean isValid()
- List getSignText(ProxiedLocale)
- Map getPermissionAudiences()
- SimpleDataRecord createDataRecord()
- double getPrice()
- boolean equals(Object)
- boolean isBuying()
- QUser getTaxAccount()
- String toString()
- List playersCanAuthorize(BuiltInShopPermission)
- List playersCanAuthorize(BuiltInShopPermissionGroup)
- List playersCanAuthorize(Plugin, String)
- String saveExtraToYaml()
- UUID getRuntimeRandomUniqueId()

### Class: com.ghostchu.quickshop.shop.InteractionController
Type: Class
Implements: com.ghostchu.simplereloadlib.Reloadable, com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- InteractionController$InteractionBehavior getBehavior(InteractionController$Interaction)
- String getTitle()
- ReloadResult reloadModule() throws Exception
- String genBody()
- void loadInteractionConfig()

### Class: com.ghostchu.quickshop.shop.InventoryPreview
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- int hashCode()
- boolean equals(Object)
- void show(Player)
- String toString()
- void close()

### Class: com.ghostchu.quickshop.shop.ShopLoader
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- void loadShops()
- void loadShops(String)
- String genBody()

### Class: com.ghostchu.quickshop.shop.ShopPurger
Type: Class

Methods:
- void purge()

### Class: com.ghostchu.quickshop.shop.ShopSignStorage
Type: Class

Methods:
- void setY(int)
- int getX()
- String getWorld()
- void setX(int)
- int getY()
- int getZ()
- int hashCode()
- boolean equals(String, int, int, int)
- boolean equals(Object)
- ShopSignStorage$ShopSignStorageBuilder builder()
- String toString()
- void setWorld(String)
- void setZ(int)

### Class: com.ghostchu.quickshop.shop.SimpleInfo
Type: Class
Implements: com.ghostchu.quickshop.api.shop.Info

Methods:
- Location getLocation()
- void setAction(ShopAction)
- boolean hasChanged(Shop)
- int hashCode()
- boolean equals(Object)
- Block getSignBlock()
- boolean isBypassed()
- ItemStack getItem()
- String toString()
- ShopAction getAction()

### Class: com.ghostchu.quickshop.shop.SimpleInventoryTransaction
Type: Class
Implements: com.ghostchu.quickshop.api.shop.InventoryTransaction

Methods:
- List rollback(boolean)
- void setLastError(String)
- String getLastError()
- void setFrom(InventoryWrapper)
- boolean commit()
- boolean commit(InventoryTransaction$TransactionCallback)
- boolean failSafeCommit()
- ItemStack getItem()
- InventoryWrapper getTo()
- Deque getProcessingStack()
- SimpleInventoryTransaction$SimpleInventoryTransactionBuilder builder()
- void setTo(InventoryWrapper)
- void setAmount(int)
- void setItem(ItemStack)
- InventoryWrapper getFrom()
- int getAmount()

### Class: com.ghostchu.quickshop.shop.SimplePriceLimiter
Type: Class
Implements: com.ghostchu.simplereloadlib.Reloadable, com.ghostchu.quickshop.api.shop.PriceLimiter, com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- void loadConfiguration()
- String getTitle()
- ReloadResult reloadModule() throws Exception
- String genBody()
- PriceLimiterCheckResult check(CommandSender, ItemStack, String, double)
- PriceLimiterCheckResult check(QUser, ItemStack, String, double)

### Class: com.ghostchu.quickshop.shop.SimplePriceLimiterCheckResult
Type: Class
Implements: com.ghostchu.quickshop.api.shop.PriceLimiterCheckResult

Methods:
- void setMax(double)
- void setMin(double)
- double getMin()
- int hashCode()
- double getMax()
- boolean equals(Object)
- String toString()
- PriceLimiterStatus getStatus()
- void setStatus(PriceLimiterStatus)

### Class: com.ghostchu.quickshop.shop.SimpleShopChunk
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ShopChunk

Methods:
- int getX()
- String getWorld()
- int getZ()
- int hashCode()
- boolean equals(Object)
- boolean isSame(String, int, int)
- boolean isSame(World, int, int)
- String toString()
- ShopChunk fromLocation(Location)

### Class: com.ghostchu.quickshop.shop.SimpleShopExtra
Type: Class

Methods:
- void setData(Map)
- String getNamespace()
- int hashCode()
- boolean equals(Object)
- String toString()
- void setNamespace(String)
- Map getData()

### Class: com.ghostchu.quickshop.shop.SimpleShopItemBlackList
Type: Class
Implements: com.ghostchu.simplereloadlib.Reloadable, com.ghostchu.quickshop.api.shop.ShopItemBlackList, com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- boolean isBlacklisted(ItemStack)
- String getTitle()
- ReloadResult reloadModule() throws Exception
- String genBody()

### Class: com.ghostchu.quickshop.shop.SimpleShopManager
Type: Class
Extends: com.ghostchu.quickshop.shop.AbstractShopManager
Implements: com.ghostchu.quickshop.api.shop.ShopManager, com.ghostchu.simplereloadlib.Reloadable

Methods:
- boolean actionBuying(Player, InventoryWrapper, AbstractEconomy, Info, Shop, int)
- void sendSellSuccess(QUser, Shop, int, double, double)
- boolean isReachedLimit(QUser, boolean)
- Shop getShopViaCache(Location)
- ReloadResult reloadModule()
- Map getActions()
- void createShop(Shop, Block, boolean) throws IllegalStateException
- void handleChat(Player, String)
- void sendPurchaseSuccess(QUser, Shop, int, double, double)
- boolean actionSelling(Player, InventoryWrapper, AbstractEconomy, Info, Shop, int)
- QUser getCacheUnlimitedShopAccount()
- QUser getCacheTaxAccount()
- void init()
- boolean shopIsNotValid(QUser, Info, Shop)
- BlockState makeShopSign(Block, Block, Material)
- Shop getShopIncludeAttachedViaCache(Location)
- void actionCreate(Player, Info, String)
- void clear()
- Shop getShop(Location)
- void deleteShop(Shop)
- PriceLimiter getPriceLimiter()
- ShopManager$InteractiveManager getInteractiveManager()
- void migrateOwnerToUnlimitedShopOwner(Shop)
- Iterator getShopIterator()
- double getTax(Shop, QUser)
- void sendShopInfo(Player, Shop)

### Class: com.ghostchu.quickshop.shop.SimpleShopModerator
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ShopModerator

Methods:
- boolean isModerator(UUID)
- boolean isStaff(UUID)
- boolean delStaff(UUID)
- void setStaffs(List)
- UUID getOwner()
- List getStaffs()
- void setOwner(UUID)
- String serialize(ShopModerator)
- boolean addStaff(UUID)
- boolean isOwner(UUID)
- int hashCode()
- boolean equals(Object)
- void clearStaffs()
- String toString()
- ShopModerator deserialize(String) throws JsonSyntaxException

### Class: com.ghostchu.quickshop.shop.SimpleShopPermissionManager
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ShopPermissionManager, com.ghostchu.simplereloadlib.Reloadable

Methods:
- void registerPermission(String, Plugin, String)
- List getGroupPermissions(String)
- void unregisterPermission(String, Plugin, String)
- boolean hasPermission(String, BuiltInShopPermission)
- boolean hasPermission(String, Plugin, String)
- boolean hasGroup(String)
- void registerGroup(String, Collection)
- ReloadResult reloadModule() throws Exception
- void unregisterGroup(String)
- List getGroups()

## Package: com.ghostchu.quickshop.shop.cache

### Class: com.ghostchu.quickshop.shop.cache.BoxedShop
Type: Class

Methods:
- boolean isValid()
- Shop getShop()

### Class: com.ghostchu.quickshop.shop.cache.SimpleShopCache
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem, com.ghostchu.quickshop.api.shop.cache.ShopCache

Methods:
- CacheStats getCacheStats(ShopCacheNamespacedKey)
- String getTitle()
- void invalidateAll(ShopCacheNamespacedKey)
- Shop get(ShopCacheNamespacedKey, Location, boolean)
- String genBody()
- void invalidate(ShopCacheNamespacedKey, Location)
- Map getCaches()

### Class: com.ghostchu.quickshop.shop.cache.SimpleShopInventoryCountCache
Type: Class
Implements: com.ghostchu.quickshop.api.shop.cache.ShopInventoryCountCache

Methods:
- void setSpace(int)
- void setStock(int)
- int getSpace()
- int getStock()
- boolean initialized()

## Package: com.ghostchu.quickshop.shop.controlpanel

### Class: com.ghostchu.quickshop.shop.controlpanel.SimpleShopControlPanel
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ShopControlPanel

Methods:
- Plugin getPlugin()
- ShopControlPanelPriority getPriority()
- LinkedList generate(Player, Shop)

### Class: com.ghostchu.quickshop.shop.controlpanel.SimpleShopControlPanelManager
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ShopControlPanelManager, com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- LinkedList enabledComponents()
- String getTitle()
- void unregister(Plugin)
- void unregister(ShopControlPanel)
- void addComponent(ControlComponent)
- String genBody()
- void initialize()
- LinkedHashMap controlComponents()
- void openControlPanel(Player, Shop)
- void register(ShopControlPanel)

## Package: com.ghostchu.quickshop.shop.controlpanel.component

### Class: com.ghostchu.quickshop.shop.controlpanel.component.DisplayComponent
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ControlComponent

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

### Class: com.ghostchu.quickshop.shop.controlpanel.component.EmptyComponent
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ControlComponent

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

### Class: com.ghostchu.quickshop.shop.controlpanel.component.FreezeComponent
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ControlComponent

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

### Class: com.ghostchu.quickshop.shop.controlpanel.component.HistoryComponent
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ControlComponent

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

### Class: com.ghostchu.quickshop.shop.controlpanel.component.OwnerComponent
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ControlComponent

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

### Class: com.ghostchu.quickshop.shop.controlpanel.component.RefillComponent
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ControlComponent

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

### Class: com.ghostchu.quickshop.shop.controlpanel.component.RemoveComponent
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ControlComponent

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

### Class: com.ghostchu.quickshop.shop.controlpanel.component.SetAmountComponent
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ControlComponent

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

### Class: com.ghostchu.quickshop.shop.controlpanel.component.SetPriceComponent
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ControlComponent

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

### Class: com.ghostchu.quickshop.shop.controlpanel.component.ShopModeComponent
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ControlComponent

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

### Class: com.ghostchu.quickshop.shop.controlpanel.component.UnlimitedComponent
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ControlComponent

Methods:
- String identifier()
- boolean applies(QuickShopAPI, Player, Shop)
- Component generate(QuickShopAPI, Player, Shop)

## Package: com.ghostchu.quickshop.shop.datatype

### Class: com.ghostchu.quickshop.shop.datatype.DisplayItemPersistentDataType
Type: Class
Implements: org.bukkit.persistence.PersistentDataType

Methods:
- String toPrimitive(ShopProtectionFlag, PersistentDataAdapterContext)
- Object toPrimitive(Object, PersistentDataAdapterContext)
- Class getComplexType()
- Class getPrimitiveType()
- ShopProtectionFlag fromPrimitive(String, PersistentDataAdapterContext)
- Object fromPrimitive(Object, PersistentDataAdapterContext)

### Class: com.ghostchu.quickshop.shop.datatype.HopperPersistentData
Type: Class

Methods:
- UUID getPlayer()

### Class: com.ghostchu.quickshop.shop.datatype.HopperPersistentDataType
Type: Class
Implements: org.bukkit.persistence.PersistentDataType

Methods:
- String toPrimitive(HopperPersistentData, PersistentDataAdapterContext)
- Object toPrimitive(Object, PersistentDataAdapterContext)
- Class getComplexType()
- Class getPrimitiveType()
- HopperPersistentData fromPrimitive(String, PersistentDataAdapterContext)
- Object fromPrimitive(Object, PersistentDataAdapterContext)

### Class: com.ghostchu.quickshop.shop.datatype.PreviewGuiPersistentDataType
Type: Class
Implements: org.bukkit.persistence.PersistentDataType

Methods:
- String toPrimitive(UUID, PersistentDataAdapterContext)
- Object toPrimitive(Object, PersistentDataAdapterContext)
- Class getComplexType()
- Class getPrimitiveType()
- UUID fromPrimitive(String, PersistentDataAdapterContext)
- Object fromPrimitive(Object, PersistentDataAdapterContext)

### Class: com.ghostchu.quickshop.shop.datatype.ShopPersistentData
Type: Class

Methods:
- int getX()
- String getWorld()
- int getY()
- int getZ()
- boolean isSetup()

### Class: com.ghostchu.quickshop.shop.datatype.ShopPersistentDataType
Type: Class
Implements: org.bukkit.persistence.PersistentDataType

Methods:
- String toPrimitive(ShopPersistentData, PersistentDataAdapterContext)
- Object toPrimitive(Object, PersistentDataAdapterContext)
- Class getComplexType()
- Class getPrimitiveType()
- ShopPersistentData fromPrimitive(String, PersistentDataAdapterContext)
- Object fromPrimitive(Object, PersistentDataAdapterContext)

### Class: com.ghostchu.quickshop.shop.datatype.ShopProtectionFlag
Type: Class

Methods:
- String getMark()
- int hashCode()
- boolean equals(Object)
- String getItemStackString()
- String toString()
- String getShopLocation()
- String getDefaultMark()

### Class: com.ghostchu.quickshop.shop.datatype.ShopSignPersistentDataType
Type: Class
Implements: org.bukkit.persistence.PersistentDataType

Methods:
- String toPrimitive(ShopSignStorage, PersistentDataAdapterContext)
- Object toPrimitive(Object, PersistentDataAdapterContext)
- Class getComplexType()
- Class getPrimitiveType()
- ShopSignStorage fromPrimitive(String, PersistentDataAdapterContext)
- Object fromPrimitive(Object, PersistentDataAdapterContext)

## Package: com.ghostchu.quickshop.shop.display

### Class: com.ghostchu.quickshop.shop.display.AbstractDisplayItem
Type: Abstract Class
Implements: com.ghostchu.simplereloadlib.Reloadable

Methods:
- void respawn()
- boolean isPendingRemoval()
- void fixDisplayNeedRegen()
- boolean isApplicableForPlayer(Player)
- ItemStack createGuardItemStack(ItemStack, Shop)
- void pendingRemoval()
- ItemStack getOriginalItemStack()
- boolean checkDisplayNeedRegen()
- ShopProtectionFlag createShopProtectionFlag(ItemStack, Shop)
- boolean checkIsShopEntity(Entity)
- void fixDisplayMoved()
- DisplayType getNowUsing()
- Shop getShop()
- ReloadResult reloadModule()
- void setVirtualDisplayDoesntWork(boolean)
- void remove(boolean)
- void spawn()
- Location getDisplayLocation()
- boolean checkDisplayIsMoved()
- boolean checkIsGuardItemStack(ItemStack)
- boolean removeDupe()
- boolean isSpawned()
- void safeGuard(Entity)
- Entity getDisplay()
- boolean isVirtualDisplayDoesntWork()

## Package: com.ghostchu.quickshop.shop.display.virtual

### Class: com.ghostchu.quickshop.shop.display.virtual.VirtualDisplayItem
Type: Class
Extends: com.ghostchu.quickshop.shop.display.AbstractDisplayItem
Implements: com.ghostchu.simplereloadlib.Reloadable

Methods:
- void respawn()
- void sendSpawnPacket(Player)
- void fixDisplayNeedRegen()
- boolean isApplicableForPlayer(Player)
- boolean checkDisplayNeedRegen()
- boolean checkIsShopEntity(Entity)
- void fixDisplayMoved()
- Set getPacketSenders()
- void remove(boolean)
- void spawn()
- boolean checkDisplayIsMoved()
- void sendMetaPacket(Player)
- void sendFakeItemToAll()
- void sendFakeItem(Player)
- boolean removeDupe()
- boolean isSpawned()
- void safeGuard(Entity)
- void sendDestroyPacket(Player)
- Entity getDisplay()

### Class: com.ghostchu.quickshop.shop.display.virtual.VirtualDisplayItemManager
Type: Class

Methods:
- void addHandler(PacketHandler)
- void setHandler()
- Map getChunksMapping()
- VirtualDisplayItemManager instance()
- VirtualDisplayItem createVirtualDisplayItem(Shop)
- int generateEntityId()
- void remove(ShopChunk, VirtualDisplayItem)
- void put(ShopChunk, VirtualDisplayItem)
- boolean isTestPassed()
- void setTestPassed(boolean)
- PacketHandler packetHandler()
- void load()
- void unload()
- Map packetHandlers()

## Package: com.ghostchu.quickshop.shop.display.virtual.packet

### Class: com.ghostchu.quickshop.shop.display.virtual.packet.PacketEventsHandler
Type: Class
Implements: com.ghostchu.quickshop.api.shop.display.PacketHandler

Methods:
- String identifier()
- PacketEventsAPI internal()
- Object internal()
- PacketEventsHandler instance()
- String pluginName()
- Map factories()
- void initialize()

### Class: com.ghostchu.quickshop.shop.display.virtual.packet.ProtocolLibHandler
Type: Class
Implements: com.ghostchu.quickshop.api.shop.display.PacketHandler

Methods:
- String identifier()
- ProtocolManager internal()
- Object internal()
- ProtocolLibHandler instance()
- String pluginName()
- Map factories()
- void initialize()

## Package: com.ghostchu.quickshop.shop.display.virtual.packet.packetevents

### Class: com.ghostchu.quickshop.shop.display.virtual.packet.packetevents.PacketFactoryv1_20
Type: Class
Implements: com.ghostchu.quickshop.api.shop.display.PacketFactory

Methods:
- void registerUnloadChunk()
- PacketWrapper createVelocityPacket(int)
- Object createVelocityPacket(int)
- PacketWrapper createMetaDataPacket(int, ItemStack)
- Object createMetaDataPacket(int, ItemStack)
- void registerSendChunk()
- boolean sendPacket(Player, PacketWrapper)
- boolean sendPacket(Player, Object)
- PacketListenerCommon getChunkUnloadingPacketAdapter()
- void unregisterUnloadChunk()
- PacketWrapper createDestroyPacket(int)
- Object createDestroyPacket(int)
- PacketWrapper createSpawnPacket(int, Location)
- Object createSpawnPacket(int, Location)
- void unregisterSendChunk()
- PacketListenerCommon getChunkSendingPacketAdapter()

### Class: com.ghostchu.quickshop.shop.display.virtual.packet.packetevents.PacketFactoryv1_21
Type: Class
Implements: com.ghostchu.quickshop.api.shop.display.PacketFactory

Methods:
- void registerUnloadChunk()
- PacketWrapper createVelocityPacket(int)
- Object createVelocityPacket(int)
- PacketWrapper createMetaDataPacket(int, ItemStack)
- Object createMetaDataPacket(int, ItemStack)
- void registerSendChunk()
- boolean sendPacket(Player, PacketWrapper)
- boolean sendPacket(Player, Object)
- PacketListenerCommon getChunkUnloadingPacketAdapter()
- void unregisterUnloadChunk()
- PacketWrapper createDestroyPacket(int)
- Object createDestroyPacket(int)
- PacketWrapper createSpawnPacket(int, Location)
- Object createSpawnPacket(int, Location)
- void unregisterSendChunk()
- PacketListenerCommon getChunkSendingPacketAdapter()

### Class: com.ghostchu.quickshop.shop.display.virtual.packet.packetevents.PacketFactoryv1_21_6
Type: Class
Implements: com.ghostchu.quickshop.api.shop.display.PacketFactory

Methods:
- void registerUnloadChunk()
- PacketWrapper createVelocityPacket(int)
- Object createVelocityPacket(int)
- PacketWrapper createMetaDataPacket(int, ItemStack)
- Object createMetaDataPacket(int, ItemStack)
- void registerSendChunk()
- boolean sendPacket(Player, PacketWrapper)
- boolean sendPacket(Player, Object)
- PacketListenerCommon getChunkUnloadingPacketAdapter()
- void unregisterUnloadChunk()
- PacketWrapper createDestroyPacket(int)
- Object createDestroyPacket(int)
- PacketWrapper createSpawnPacket(int, Location)
- Object createSpawnPacket(int, Location)
- void unregisterSendChunk()
- PacketListenerCommon getChunkSendingPacketAdapter()

## Package: com.ghostchu.quickshop.shop.display.virtual.packet.protocollib

### Class: com.ghostchu.quickshop.shop.display.virtual.packet.protocollib.PacketFactoryv1_20
Type: Class
Implements: com.ghostchu.quickshop.api.shop.display.PacketFactory

Methods:
- void registerUnloadChunk()
- PacketContainer createVelocityPacket(int)
- Object createVelocityPacket(int)
- PacketContainer createMetaDataPacket(int, ItemStack)
- Object createMetaDataPacket(int, ItemStack)
- void registerSendChunk()
- boolean sendPacket(Player, PacketContainer)
- boolean sendPacket(Player, Object)
- PacketAdapter getChunkUnloadingPacketAdapter()
- void unregisterUnloadChunk()
- PacketContainer createDestroyPacket(int)
- Object createDestroyPacket(int)
- PacketContainer createSpawnPacket(int, Location)
- Object createSpawnPacket(int, Location)
- void unregisterSendChunk()
- PacketAdapter getChunkSendingPacketAdapter()

### Class: com.ghostchu.quickshop.shop.display.virtual.packet.protocollib.PacketFactoryv1_21
Type: Class
Implements: com.ghostchu.quickshop.api.shop.display.PacketFactory

Methods:
- void registerUnloadChunk()
- PacketContainer createVelocityPacket(int)
- Object createVelocityPacket(int)
- PacketContainer createMetaDataPacket(int, ItemStack)
- Object createMetaDataPacket(int, ItemStack)
- void registerSendChunk()
- boolean sendPacket(Player, PacketContainer)
- boolean sendPacket(Player, Object)
- PacketAdapter getChunkUnloadingPacketAdapter()
- void unregisterUnloadChunk()
- PacketContainer createDestroyPacket(int)
- Object createDestroyPacket(int)
- PacketContainer createSpawnPacket(int, Location)
- Object createSpawnPacket(int, Location)
- void unregisterSendChunk()
- PacketAdapter getChunkSendingPacketAdapter()

## Package: com.ghostchu.quickshop.shop.history

### Class: com.ghostchu.quickshop.shop.history.ShopHistory
Type: Class

Methods:
- List query() throws SQLException
- List shops()
- Map shopsMapping()
- CompletableFuture generateSummary()

## Package: com.ghostchu.quickshop.shop.inventory

### Class: com.ghostchu.quickshop.shop.inventory.BukkitInventoryWrapper
Type: Class
Implements: com.ghostchu.quickshop.api.inventory.InventoryWrapper

Methods:
- InventoryWrapperManager getWrapperManager()
- Location getLocation()
- boolean isValid()
- void clear()
- boolean isNeedUpdate()
- Map addItem(ItemStack[])
- boolean restoreSnapshot(ItemStack[])
- InventoryWrapperIterator iterator()
- Iterator iterator()
- InventoryWrapperType getInventoryType()
- ItemStack[] createSnapshot()
- String toString()
- void setContents(ItemStack[])
- InventoryHolder getHolder()

### Class: com.ghostchu.quickshop.shop.inventory.BukkitInventoryWrapperManager
Type: Class
Implements: com.ghostchu.quickshop.api.inventory.InventoryWrapperManager

Methods:
- InventoryWrapper locate(String) throws IllegalArgumentException
- InventoryHolder fromLocation(World, int, int, int)
- String mklink(InventoryWrapper) throws IllegalArgumentException
- String mklink(Location) throws IllegalArgumentException

## Package: com.ghostchu.quickshop.shop.operation

### Class: com.ghostchu.quickshop.shop.operation.AddItemOperation
Type: Class
Implements: com.ghostchu.quickshop.api.operation.Operation

Methods:
- boolean rollback()
- boolean isRollback()
- boolean commit()
- boolean isCommitted()

### Class: com.ghostchu.quickshop.shop.operation.RemoveItemOperation
Type: Class
Implements: com.ghostchu.quickshop.api.operation.Operation

Methods:
- boolean rollback()
- boolean isRollback()
- boolean commit()
- boolean isCommitted()

## Package: com.ghostchu.quickshop.shop.sign

### Class: com.ghostchu.quickshop.shop.sign.SignParser
Type: Interface

Methods:
- String identifier()
- boolean applies(ItemStack)
- String parse(ItemStack)

### Class: com.ghostchu.quickshop.shop.sign.SignHooker
Type: Class

Methods:
- void updatePerPlayerShopSign(Player, Location, Shop)
- void unload()
- void updatePerPlayerShopSignBroadcast(Location, Shop)
- void registerListener()

## Package: com.ghostchu.quickshop.shop.sign.impl

### Class: com.ghostchu.quickshop.shop.sign.impl.PotionParser
Type: Class
Implements: com.ghostchu.quickshop.shop.sign.SignParser

Methods:
- String identifier()
- boolean applies(ItemStack)
- String parse(ItemStack)

### Class: com.ghostchu.quickshop.shop.sign.impl.TrimParser
Type: Class
Implements: com.ghostchu.quickshop.shop.sign.SignParser

Methods:
- String identifier()
- boolean applies(ItemStack)
- String parse(ItemStack)

## Package: com.ghostchu.quickshop.util

### Class: com.ghostchu.quickshop.util.ChatSheetPrinter
Type: Class

Methods:
- void printCenterLine(Component)
- void printLine(Component)
- void printFooter()
- void printHeader()
- CommandSender getP()
- CommandSender getSender()

### Class: com.ghostchu.quickshop.util.ComponentJoiner
Type: Class

Methods:
- Component toComponent()
- void append(Component)

### Class: com.ghostchu.quickshop.util.ExpiringSet
Type: Class

Methods:
- void add(Object)
- boolean contains(Object)
- long size()
- void remove(Object)

### Class: com.ghostchu.quickshop.util.FastPlayerFinder
Type: Class
Implements: com.ghostchu.quickshop.api.shop.PlayerFinder, com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- UUID name2Uuid(String)
- UUID name2Uuid(String, boolean, ExecutorService)
- void cache(UUID, String)
- void cacheInBatch(List)
- void bakeCaches()
- String getTitle()
- Cache getNameCache()
- CompletableFuture uuid2NameFuture(UUID)
- CompletableFuture uuid2NameFuture(UUID, boolean, ExecutorService)
- String uuid2Name(UUID)
- String uuid2Name(UUID, boolean, ExecutorService)
- String genBody()
- boolean isCached(UUID)
- CompletableFuture name2UuidFuture(String)
- CompletableFuture name2UuidFuture(String, boolean, ExecutorService)

### Class: com.ghostchu.quickshop.util.ItemContainerUtil
Type: Class

Methods:
- List flattenContents(ItemStack, boolean, boolean)

### Class: com.ghostchu.quickshop.util.ItemExpression
Type: Class

Methods:
- Optional getFunction()

### Class: com.ghostchu.quickshop.util.ItemMarker
Type: Class
Implements: com.ghostchu.simplereloadlib.Reloadable, com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- void init()
- List getRegisteredItems()
- String getTitle()
- String getNameRegExp()
- ItemStack get(String)
- String get(ItemStack)
- ItemMarker$OperationResult save(String, ItemStack)
- ReloadResult reloadModule() throws Exception
- String genBody()
- ItemMarker$OperationResult remove(String)

### Class: com.ghostchu.quickshop.util.MetricDataUtil
Type: Class

Methods:
- String getItemName(DataRecord)
- String getItemName(ItemStack)
- String getShopName(ShopMetricRecord, DataRecord)
- String getPlayerName(UUID)
- String formatEconomy(ShopMetricRecord)
- String loc2String(Location)

### Class: com.ghostchu.quickshop.util.MsgUtil
Type: Class

Methods:
- void sendMessageToOps(String)
- void sendMessageToOps(Component)
- String fillArgs(String, String[])
- Component fillArgs(Component, Component[])
- Component formatPlayerProfile(Profile, CommandSender)
- void sendGlobalAlert(String)
- void sendGlobalAlert(Component)
- Component addLeftLine(CommandSender, Component)
- void clean()
- String getGameLanguageCode(String)
- void sendDirectMessage(UUID, Component[])
- void sendDirectMessage(CommandSender, Component[])
- void sendDirectMessage(QUser, Component[])
- void sendDirectMessage(CommandSender, String[])
- String getDefaultGameLanguageCode()
- boolean flush(OfflinePlayer)
- boolean isJson(String)
- Component getTranslateText(ItemStack)
- String decimalFormat(double)
- Component bool2String(boolean)
- void sendBungeeMessage(String, Component, String)
- void debugStackTrace(StackTraceElement[])
- void send(Shop, UUID, Component)
- void send(Shop, QUser, Component)
- void send(UUID, Component, boolean)
- Component setHandleFailedHover(CommandSender, Component)
- void sendControlPanelInfo(CommandSender, Shop)
- void printEnchantment(Shop, ChatSheetPrinter)
- ProxiedLocale getDefaultGameLanguageLocale()

### Class: com.ghostchu.quickshop.util.PackageUtil
Type: Class

Methods:
- PackageUtil$SysPropertiesParseResult parsePackageProperly(String)

### Class: com.ghostchu.quickshop.util.PermissionChecker
Type: Class
Implements: com.ghostchu.simplereloadlib.Reloadable

Methods:
- Result canBuild(Player, Location)
- Result canBuild(Player, Block)
- ReloadResult reloadModule()

### Class: com.ghostchu.quickshop.util.Profile
Type: Class

Methods:
- String getName()
- int hashCode()
- boolean equals(Object)
- String toString()
- UUID getUniqueId()

### Class: com.ghostchu.quickshop.util.ProgressMonitor
Type: Class
Implements: java.lang.Iterable

Methods:
- Iterator iterator()

### Class: com.ghostchu.quickshop.util.ReflectFactory
Type: Class

Methods:
- String getNMSVersion()

### Class: com.ghostchu.quickshop.util.ShopUtil
Type: Class

Methods:
- void transferRequest(UUID, UUID, String, Shop)
- void transferRequest(UUID, UUID, String, List)
- boolean allowed(Shop, ItemStack)
- boolean allowed(Block, ItemStack)
- void setPrice(QuickShop, QUser, double, Shop)

### Class: com.ghostchu.quickshop.util.Util
Type: Class

Methods:
- String getToolPercentage(ItemStack)
- EnumMap getCustomStacksize()
- boolean fireCancellableEvent(Cancellable)
- Component enchantmentDataToComponent(Enchantment, Integer)
- boolean isLoaded(Location)
- boolean isDevMode()
- boolean findStringInList(List, String)
- boolean useEnchantmentForEnchantedBook()
- int countSpace(InventoryWrapper, Shop)
- int countSpace(InventoryWrapper, ItemStack)
- DyeColor getDyeColor()
- boolean isMethodAvailable(String, String, Class[])
- int getItemTotalAmountsInMap(Map)
- int getItemMaxStackSize(Material)
- List getStartupFlags()
- boolean isShoppables(Material)
- void mainThreadRun(Runnable)
- void mainThreadRun(Runnable, long)
- Component getItemStackName(ItemStack)
- List getVerticalFacing()
- boolean findStringInComponent(Component, String)
- boolean isDevEdition()
- void setPlugin(QuickShop)
- Location lookAt(Location, Location)
- String serialize(ItemStack)
- BlockFace getRightSide(BlockFace)
- List getPlayerList()
- UUID getSenderUniqueId(CommandSender)
- boolean isOtherShopWithinHopperReach(Block, Player)
- Block getSecondHalf(Block)
- boolean canBeShop(Block)
- int getBypassedCustomStacksize()
- File getPluginJarFile(Plugin) throws FileNotFoundException
- boolean isTool(Material)
- boolean isDoubleChest(BlockData)
- void regionThread(Location, Runnable)
- Material getSignMaterial()
- boolean checkIfBungee()
- void unregisterListenerClazz(Plugin, Class)
- void debugLog(String[])
- void asyncThreadRun(Runnable)
- boolean isBlacklistWorld(World)
- ItemStack deserialize(String) throws InvalidConfigurationException
- Location getBlockLocation(Location)
- BlockFace getYawFace(float)
- int countItems(InventoryWrapper, ItemStack)
- int countItems(InventoryWrapper, Shop)
- Component getItemCustomName(ItemStack)
- void ensureThread(boolean)
- BigDecimal parse(String)
- Block getAttached(Block)
- boolean isDyes(Material)
- boolean isBlacklisted(ItemStack)
- Component getFirstEnchantmentName(EnchantmentStorageMeta)
- EnumSet getShopables()
- boolean isWallSign(Material)
- List getEnchantsForItemStack(ItemStack)
- File getCacheFolder()
- void inventoryCheck(InventoryWrapper)
- void initialize()
- boolean isEmptyComponent(Component)
- boolean isDisplayAllowBlock(Material)
- String getPluginJarPath(Plugin)

### Class: com.ghostchu.quickshop.util.WarningSender
Type: Class

Methods:
- boolean sendWarn(String)
- int hashCode()
- boolean equals(Object)
- String toString()

## Package: com.ghostchu.quickshop.util.config

### Class: com.ghostchu.quickshop.util.config.UpdateScript
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String description()
- int version()

### Class: com.ghostchu.quickshop.util.config.ConfigProvider
Type: Class
Extends: com.ghostchu.quickshop.api.QuickShopInstanceHolder

Methods:
- void reload()
- void reload(boolean)
- FileConfiguration get()
- void save()

### Class: com.ghostchu.quickshop.util.config.ConfigUpdateScript
Type: Class

Methods:
- void asyncOwnerNameFetch()
- void toggleEnchantsAndEffectList()
- void configControlPanel()
- void disableDefaultShopCorruptDeletion()
- void allowDisableQsSizeCommandMaxStackSizeCheck()
- void removeTryingFixBanlanceInsuffientFeature()
- void removePurgerRefund()
- void allowPublicKeyRetrieve()
- void configWorldLoadingBlacklist()
- void deleteSqlitePlayerMapping()
- void oldConfigCleanup()
- void donationKey()
- void fixDbSettings()
- void configCleanup_1028()
- void disableCSMByDefault()
- void sqlSectionOptimization()
- void displayVirtualStatusReset()
- void removeDisplayCenterConfig()
- void protectionCheckMonitorListeners()
- void configProtocol()
- FileConfiguration getConfig()
- void tweakBackupPolicy()
- void disableTaxForUnlimitedShopAndPerPlayerSignShop()
- void displayCenterControl()
- void refundFromTaxAccountOption()
- void configDisplayCoords()
- void cacheSystemReworked()
- void privacySystem()
- void addQsToCommands()

### Class: com.ghostchu.quickshop.util.config.ConfigurationFixer
Type: Class

Methods:
- boolean fix()

### Class: com.ghostchu.quickshop.util.config.ConfigurationUpdater
Type: Class

Methods:
- List getUpdateScripts(Object)
- ConfigurationSection getConfiguration()
- void update(Object)

## Package: com.ghostchu.quickshop.util.economyformatter

### Class: com.ghostchu.quickshop.util.economyformatter.BuiltInEconomyFormatter
Type: Class
Implements: com.ghostchu.simplereloadlib.Reloadable

Methods:
- String getInternalFormat(double, String)
- ReloadResult reloadModule()

### Class: com.ghostchu.quickshop.util.economyformatter.EconomyFormatter
Type: Class
Implements: com.ghostchu.simplereloadlib.Reloadable

Methods:
- String format(double, World, String)
- String format(double, boolean, World, String)
- String format(double, Shop)
- String format(double, boolean, World, Shop)
- ReloadResult reloadModule()

## Package: com.ghostchu.quickshop.util.envcheck

### Class: com.ghostchu.quickshop.util.envcheck.EnvCheckEntry
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- EnvCheckEntry$Stage[] stage()
- String name()
- int priority()

### Class: com.ghostchu.quickshop.util.envcheck.CheckResult
Type: Enum
Extends: java.lang.Enum

Methods:
- CheckResult valueOf(String)
- CheckResult[] values()
- String getDisplay()

### Class: com.ghostchu.quickshop.util.envcheck.EnvironmentChecker
Type: Class

Methods:
- void registerTest(Method)
- ResultContainer protocolLibBadLocateTest()
- ResultContainer oldQuickShopTest()
- ResultContainer moddedServerDatabaseDriverTest()
- ResultContainer virtualDisplayWorkingTest()
- ResultContainer permManagerConflictTest()
- ResultContainer plapiConflictTest()
- ResultContainer coreSupportTest()
- ResultContainer spigotBasedServer()
- ResultContainer rereMakeTest()
- boolean isForgeBasedServer()
- ResultReport run(EnvCheckEntry$Stage)
- ResultContainer virtualDisplaySupportTest()
- ResultContainer eolTest()
- boolean isFabricBasedServer()
- ResultContainer ecoEnchantsNewerVersionWarning()
- void registerTests(Class)
- boolean isOutdatedJvm()
- ResultContainer gamerVersionSupportTest()
- ResultContainer moddedBasedTest()

### Class: com.ghostchu.quickshop.util.envcheck.ResultContainer
Type: Class

Methods:
- String getResultMessage()
- CheckResult getResult()

### Class: com.ghostchu.quickshop.util.envcheck.ResultReport
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)
- Map getResults()
- String toString()
- CheckResult getFinalResult()

## Package: com.ghostchu.quickshop.util.holder

### Class: com.ghostchu.quickshop.util.holder.DatabaseStatusHolder
Type: Class

Methods:
- long getReportGeneratedAt()
- void setShopIds(IsolatedScanResult)
- int hashCode()
- boolean equals(Object)
- String toString()
- IsolatedScanResult getDataIds()
- void setReportGeneratedAt(long)
- DatabaseStatusHolder$Status getStatus()
- void setStatus(DatabaseStatusHolder$Status)
- IsolatedScanResult getShopIds()
- void setDataIds(IsolatedScanResult)

### Class: com.ghostchu.quickshop.util.holder.QuickShopPreviewGUIHolder
Type: Class
Implements: org.bukkit.inventory.InventoryHolder

Methods:
- Inventory getInventory()

### Class: com.ghostchu.quickshop.util.holder.Result
Type: Class

Methods:
- void setResult(boolean)
- int hashCode()
- boolean equals(Object)
- void setListener(String)
- String getMessage()
- String toString()
- void setMessage(String)
- String getListener()
- boolean isSuccess()

## Package: com.ghostchu.quickshop.util.logger

### Class: com.ghostchu.quickshop.util.logger.Log
Type: Class

Methods:
- void cron(String)
- void cron(Level, String, Log$Caller)
- void cron(Level, String)
- List fetchLogs()
- List fetchLogs(Log$Type)
- void performance(Level, String, Log$Caller)
- void debug(String)
- void debug(Level, String, Log$Caller)
- void debug(Level, String)
- void timing(String, Timer)
- void timing(Level, String, Timer, Log$Caller)
- void privacy(String)
- void privacy(Level, String, Log$Caller)
- void privacy(Level, String)
- void permission(String)
- void permission(Level, String, Log$Caller)
- void permission(Level, String)
- List fetchLogsExclude(Log$Type[])
- List fetchLogsLevel(Log$Type, Level)
- void transaction(String)
- void transaction(Level, String, Log$Caller)
- void transaction(Level, String)

## Package: com.ghostchu.quickshop.util.logging.container

### Class: com.ghostchu.quickshop.util.logging.container.EconomyTransactionLog
Type: Class

Methods:
- String getCurrency()
- void setLastError(String)
- String getLastError()
- void setFrom(String)
- String getTo()
- void setTax(double)
- void setCurrency(String)
- void setSuccess(boolean)
- int hashCode()
- boolean equals(Object)
- void setTaxAccount(String)
- String getTaxAccount()
- void setTo(String)
- String toString()
- void setAmount(double)
- double getTax()
- double getAmount()
- String getFrom()
- boolean isSuccess()

### Class: com.ghostchu.quickshop.util.logging.container.PlayerEconomyPreCheckLog
Type: Class

Methods:
- void setHolding(double)
- String getPlayer()
- int hashCode()
- void setBeforeTrading(boolean)
- boolean equals(Object)
- boolean isBeforeTrading()
- void setPlayer(String)
- String toString()
- double getHolding()

### Class: com.ghostchu.quickshop.util.logging.container.PluginGlobalAlertLog
Type: Class

Methods:
- void setContent(String)
- int hashCode()
- boolean equals(Object)
- String getContent()
- String toString()

### Class: com.ghostchu.quickshop.util.logging.container.ShopCreationLog
Type: Class

Methods:
- BlockPos getLocation()
- void setLocation(BlockPos)
- int hashCode()
- boolean equals(Object)
- void setCreator(String)
- void setShop(ShopInfoStorage)
- ShopInfoStorage getShop()
- String toString()
- String getCreator()

### Class: com.ghostchu.quickshop.util.logging.container.ShopPriceChangedLog
Type: Class

Methods:
- double getNewPrice()
- void setOldPrice(double)
- int hashCode()
- boolean equals(Object)
- double getOldPrice()
- void setShop(ShopInfoStorage)
- ShopInfoStorage getShop()
- String toString()
- void setNewPrice(double)

### Class: com.ghostchu.quickshop.util.logging.container.ShopPurchaseLog
Type: Class

Methods:
- void setTrader(String)
- void setShop(ShopInfoStorage)
- ShopInfoStorage getShop()
- void setTax(double)
- void setItemStack(String)
- void setType(ShopType)
- String getItemName()
- double getBalance()
- ShopType getType()
- int hashCode()
- boolean equals(Object)
- String getTrader()
- String toString()
- String getItemStack()
- void setBalance(double)
- void setAmount(int)
- double getTax()
- void setItemName(String)
- int getAmount()

### Class: com.ghostchu.quickshop.util.logging.container.ShopRemoveLog
Type: Class

Methods:
- String getPlayer()
- int hashCode()
- String getReason()
- boolean equals(Object)
- void setReason(String)
- void setShop(ShopInfoStorage)
- void setPlayer(String)
- ShopInfoStorage getShop()
- String toString()

## Package: com.ghostchu.quickshop.util.matcher.item

### Class: com.ghostchu.quickshop.util.matcher.item.BukkitItemMatcherImpl
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ItemMatcher

Methods:
- String getName()
- Plugin getPlugin()
- boolean matches(ItemStack, ItemStack)

### Class: com.ghostchu.quickshop.util.matcher.item.QuickShopItemMatcherImpl
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ItemMatcher, com.ghostchu.simplereloadlib.Reloadable

Methods:
- String getName()
- Plugin getPlugin()
- ReloadResult reloadModule()
- boolean matches(ItemStack[], ItemStack[])
- boolean matches(ItemStack, ItemStack)

### Class: com.ghostchu.quickshop.util.matcher.item.TNEItemMatcherImpl
Type: Class
Implements: com.ghostchu.quickshop.api.shop.ItemMatcher

Methods:
- String getName()
- Plugin getPlugin()
- boolean matches(ItemStack, ItemStack)
- Integer fishData(ItemStack)

## Package: com.ghostchu.quickshop.util.metric

### Class: com.ghostchu.quickshop.util.metric.MetricCollectEntry
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- MetricDataType dataType()
- String moduleName()
- String description()

### Class: com.ghostchu.quickshop.util.metric.MetricDataType
Type: Enum
Extends: java.lang.Enum

Methods:
- MetricDataType valueOf(String)
- MetricDataType[] values()

### Class: com.ghostchu.quickshop.util.metric.MetricManager
Type: Class

Methods:
- void initCollects()
- void registerMetricCollector(Object)
- void registerChart(MetricDataType, String, String, CustomChart)

## Package: com.ghostchu.quickshop.util.metric.collect

### Class: com.ghostchu.quickshop.util.metric.collect.BuiltInCollects
Type: Class

Methods:
- CustomChart researchAddonsCompacts()
- CustomChart researchProtocolLibVersion()
- CustomChart researchPacketEventsVersion()
- CustomChart researchItemStackingShop()
- CustomChart statisticAllShops()
- CustomChart researchCommandAlias()
- CustomChart statisticEconomyTypes()
- CustomChart statisticDatabaseTypes()
- CustomChart researchProtectionListenerBlacklist()
- CustomChart statisticServerSoftwareBuildVersion()
- CustomChart researchGeyser()
- CustomChart statisticBackgroundDebugLogger()
- CustomChart statisticPublisher()
- CustomChart statisticDisplayImpl()
- CustomChart statisticItemMatcher()

## Package: com.ghostchu.quickshop.util.mojangapi

### Class: com.ghostchu.quickshop.util.mojangapi.MojangApiMirror
Type: Interface

Methods:
- String getLauncherMetaRoot()
- String getResourcesDownloadRoot()
- String getLibrariesRoot()

### Class: com.ghostchu.quickshop.util.mojangapi.MojangAPI
Type: Class

Methods:
- MojangAPI$GameInfoAPI getGameInfoAPI(String)
- MojangAPI$AssetsAPI getAssetsAPI(String)
- MojangAPI$MetaAPI getMetaAPI(String)
- MojangAPI$ResourcesAPI getResourcesAPI()

### Class: com.ghostchu.quickshop.util.mojangapi.MojangApiBmclApiMirror
Type: Class
Implements: com.ghostchu.quickshop.util.mojangapi.MojangApiMirror

Methods:
- String getLauncherMetaRoot()
- String getResourcesDownloadRoot()
- String getLibrariesRoot()

### Class: com.ghostchu.quickshop.util.mojangapi.MojangApiOfficialMirror
Type: Class
Implements: com.ghostchu.quickshop.util.mojangapi.MojangApiMirror

Methods:
- String getLauncherMetaRoot()
- String getResourcesDownloadRoot()
- String getLibrariesRoot()

## Package: com.ghostchu.quickshop.util.paste

### Class: com.ghostchu.quickshop.util.paste.PasteInterface
Type: Interface

Methods:
- String pasteTheText(String) throws Exception
- String pasteTheTextJson(String) throws Exception

### Class: com.ghostchu.quickshop.util.paste.GuavaCacheRender
Type: Class

Methods:
- String renderTable(CacheStats)

### Class: com.ghostchu.quickshop.util.paste.LuckoPastebinPaster
Type: Class
Implements: com.ghostchu.quickshop.util.paste.PasteInterface

Methods:
- String pasteTheText(String) throws IOException
- String pasteTheTextJson(String) throws Exception

### Class: com.ghostchu.quickshop.util.paste.Paste
Type: Class

Methods:
- String paste(String)

### Class: com.ghostchu.quickshop.util.paste.PasteGenerator
Type: Class

Methods:
- void add(PasteItem)
- List getPasteItems()
- String render()

### Class: com.ghostchu.quickshop.util.paste.PasteManager
Type: Class

Methods:
- List getAllRegistered()
- void unregister(Plugin, SubPasteItem)
- void unregister(Plugin)
- void register(Plugin, List)
- void register(Plugin, SubPasteItem)

## Package: com.ghostchu.quickshop.util.paste.item

### Class: com.ghostchu.quickshop.util.paste.item.PasteItem
Type: Interface

Methods:
- String toHTML()

### Class: com.ghostchu.quickshop.util.paste.item.SubPasteItem
Type: Interface
Implements: com.ghostchu.quickshop.util.paste.item.PasteItem

Methods:
- String getTitle()
- String toHTML()
- String genBody()
- String genTitle()

### Class: com.ghostchu.quickshop.util.paste.item.CachePerformanceItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.ChatProcessorInfoItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.ConfigCollectorItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.CronLogsItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.DatabaseInfoItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.DebugLogsItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.DisplaySystemItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.HeaderItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.PasteItem

Methods:
- Map getItems()
- int hashCode()
- long getTimestamp()
- String toHTML()
- boolean equals(Object)
- String toString()

### Class: com.ghostchu.quickshop.util.paste.item.MiscUtilItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.PerformanceLogsItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.PermissionLogsItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.PluginsInfoItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.PrivacyLogsItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.ReplaceableModulesItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.ServerInfoItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.ShopsInfoItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.SystemInfoItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.TimingsLogsItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

### Class: com.ghostchu.quickshop.util.paste.item.TransactionLogsItem
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- String genBody()

## Package: com.ghostchu.quickshop.util.paste.util

### Class: com.ghostchu.quickshop.util.paste.util.HTMLTable
Type: Class

Methods:
- void setTableTitle(String[])
- void insert(Object[])
- String render()

## Package: com.ghostchu.quickshop.util.performance

### Class: com.ghostchu.quickshop.util.performance.BatchBukkitExecutor
Type: Class

Methods:
- CompletableFuture startHandle(Plugin, Consumer)
- Instant getStartTime()
- void addTasks(Object[])
- void addTasks(Collection)
- void addTask(Object)

### Class: com.ghostchu.quickshop.util.performance.PerfMonitor
Type: Class
Implements: java.lang.AutoCloseable

Methods:
- Duration getExceptedDuration()
- String getName()
- boolean isReachedLimit()
- void setContext(String)
- Instant getStartTime()
- Duration getTimePassed()
- void close()

## Package: com.ghostchu.quickshop.util.privacy

### Class: com.ghostchu.quickshop.util.privacy.PrivacyController
Type: Class

Methods:
- void privacyReview(MetricDataType, String, String, Runnable, Runnable)

## Package: com.ghostchu.quickshop.util.reporter.error

### Class: com.ghostchu.quickshop.util.reporter.error.RollbarErrorReporter
Type: Class

Methods:
- void ignoreThrow()
- RollbarErrorReporter$PossiblyLevel checkWasCauseByQS(Throwable)
- boolean canReport(Throwable)
- void ignoreThrows()
- boolean isEnabled()
- void unregister()
- void sendError(Throwable, String[])
- void resetIgnores()

## Package: com.ghostchu.quickshop.util.skin

### Class: com.ghostchu.quickshop.util.skin.SkullProvider
Type: Interface

Methods:
- CompletableFuture provide(UUID)
- CompletableFuture provide(String)

### Class: com.ghostchu.quickshop.util.skin.BukkitSkullProvider
Type: Class
Implements: com.ghostchu.quickshop.util.skin.SkullProvider

Methods:
- CompletableFuture provide(UUID)
- CompletableFuture provide(String)

## Package: com.ghostchu.quickshop.util.updater

### Class: com.ghostchu.quickshop.util.updater.NexusManager
Type: Class
Implements: com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- boolean isLatest()
- String genBody()
- String getLatestVersion()

## Package: com.ghostchu.quickshop.watcher

### Class: com.ghostchu.quickshop.watcher.CalendarWatcher
Type: Class
Implements: java.lang.Runnable

Methods:
- YamlConfiguration getConfiguration()
- void stop()
- File getCalendarFile()
- void start()
- void save()
- void run()
- CalendarEvent$CalendarTriggerType getAndUpdate()

### Class: com.ghostchu.quickshop.watcher.DisplayAutoDespawnWatcher
Type: Class
Implements: java.lang.Runnable, com.ghostchu.simplereloadlib.Reloadable, com.ghostchu.quickshop.util.paste.item.SubPasteItem

Methods:
- String getTitle()
- void stop()
- void start(int, int)
- void run()
- ReloadResult reloadModule()
- String genBody()

### Class: com.ghostchu.quickshop.watcher.LogWatcher
Type: Class
Implements: java.lang.AutoCloseable, java.lang.Runnable

Methods:
- void stop()
- void log(String)
- void start(int, int)
- void run()
- void close()

### Class: com.ghostchu.quickshop.watcher.OngoingFeeWatcher
Type: Class
Implements: java.lang.Runnable

Methods:
- void removeShop(Shop)
- void stop()
- void start(int, int)
- void run()

### Class: com.ghostchu.quickshop.watcher.ShopDataSaveWatcher
Type: Class
Implements: java.lang.Runnable

Methods:
- void stop()
- void start(int, long)
- void run()

### Class: com.ghostchu.quickshop.watcher.SignUpdateWatcher
Type: Class
Implements: java.lang.Runnable

Methods:
- void stop()
- void scheduleSignUpdate(Shop)
- void start(int, int)
- void run()

### Class: com.ghostchu.quickshop.watcher.UpdateWatcher
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void init()
- void playerJoin(PlayerJoinEvent)
- void uninit()

## Package: com.ghostchu.simplereloadlib

### Class: com.ghostchu.simplereloadlib.Reloadable
Type: Interface

Methods:
- ReloadResult reloadModule() throws Exception

### Class: com.ghostchu.simplereloadlib.ReloadManager
Type: Class

Methods:
- Map reload()
- Map reload(Class)
- void unregister(Method)
- void unregister(Reloadable)
- void unregister(Class)
- void register(Reloadable)
- void register(Method)

### Class: com.ghostchu.simplereloadlib.ReloadResult
Type: Class

Methods:
- Throwable getException()
- int hashCode()
- String getReason()
- boolean equals(Object)
- void setReason(String)
- ReloadResult$ReloadResultBuilder builder()
- String toString()
- void setException(Throwable)
- ReloadStatus getStatus()
- void setStatus(ReloadStatus)

### Class: com.ghostchu.simplereloadlib.ReloadStatus
Type: Enum
Extends: java.lang.Enum

Methods:
- ReloadStatus valueOf(String)
- ReloadStatus[] values()

### Class: com.ghostchu.simplereloadlib.ReloadableContainer
Type: Class

Methods:
- void setReloadableMethod(Method)
- Method getReloadableMethod()
- boolean isObject()
- void setReloadable(WeakReference)
- WeakReference getReloadable()
- int hashCode()
- boolean equals(Object)
- ReloadableContainer$ReloadableContainerBuilder builder()
- String toString()

## Package: com.vdurmont.semver4j

### Class: com.vdurmont.semver4j.Range
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean isSatisfiedBy(String)
- boolean isSatisfiedBy(Semver)

### Class: com.vdurmont.semver4j.Requirement
Type: Class

Methods:
- Requirement buildStrict(String)
- Requirement buildCocoapods(String)
- Requirement buildNPM(String)
- Requirement build(Semver)
- int hashCode()
- boolean equals(Object)
- Requirement buildIvy(String)
- Requirement buildLoose(String)
- String toString()
- boolean isSatisfiedBy(String)
- boolean isSatisfiedBy(Semver)

### Class: com.vdurmont.semver4j.Semver
Type: Class
Implements: java.lang.Comparable

Methods:
- String getBuild()
- Semver nextMajor()
- String getOriginalValue()
- Semver withBuild(String)
- Integer getMajor()
- Semver nextMinor()
- Semver withClearedBuild()
- int compareTo(Semver)
- int compareTo(Object)
- boolean isEquivalentTo(String)
- boolean isEquivalentTo(Semver)
- Semver withIncMajor()
- Semver withIncMajor(int)
- boolean isGreaterThanOrEqualTo(String)
- boolean isGreaterThanOrEqualTo(Semver)
- boolean satisfies(Requirement)
- boolean satisfies(String)
- int hashCode()
- boolean isLowerThanOrEqualTo(String)
- boolean isLowerThanOrEqualTo(Semver)
- Semver nextPatch()
- Integer getPatch()
- boolean isGreaterThan(String)
- boolean isGreaterThan(Semver)
- Semver withClearedSuffix()
- Semver withIncMinor()
- Semver withIncMinor(int)
- Semver$VersionDiff diff(String)
- Semver$VersionDiff diff(Semver)
- Semver withIncPatch()
- Semver withIncPatch(int)
- Integer getMinor()
- String getValue()
- Semver toStrict()
- boolean isLowerThan(String)
- boolean isLowerThan(Semver)
- Semver$SemverType getType()
- boolean equals(Object)
- String[] getSuffixTokens()
- String toString()
- Semver withClearedSuffixAndBuild()
- boolean isEqualTo(String)
- boolean isEqualTo(Semver)
- Semver withSuffix(String)
- boolean isStable()

### Class: com.vdurmont.semver4j.SemverException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: com.vdurmont.semver4j.Tokenizer
Type: Class

No public methods found

## Package: net.kyori.adventure

### Class: net.kyori.adventure.Adventure
Type: Class

No public methods found

## Package: net.kyori.adventure.audience

### Class: net.kyori.adventure.audience.Audience
Type: Interface
Implements: net.kyori.adventure.pointer.Pointered

Methods:
- void sendPlayerListHeader(ComponentLike)
- void sendPlayerListHeader(Component)
- void forEachAudience(Consumer)
- void removeResourcePacks(ResourcePackRequestLike)
- void removeResourcePacks(ResourcePackRequest)
- void removeResourcePacks(ResourcePackInfoLike, ResourcePackInfoLike[])
- void removeResourcePacks(Iterable)
- void removeResourcePacks(UUID, UUID[])
- Audience audience(Audience[])
- ForwardingAudience audience(Iterable)
- void sendResourcePacks(ResourcePackInfoLike, ResourcePackInfoLike[])
- void sendResourcePacks(ResourcePackRequestLike)
- void sendResourcePacks(ResourcePackRequest)
- void sendTitlePart(TitlePart, Object)
- void sendMessage(ComponentLike)
- void sendMessage(Component)
- void sendMessage(ComponentLike, MessageType)
- void sendMessage(Component, MessageType)
- void sendMessage(Identified, ComponentLike)
- void sendMessage(Identity, ComponentLike)
- void sendMessage(Identified, Component)
- void sendMessage(Identity, Component)
- void sendMessage(Identified, ComponentLike, MessageType)
- void sendMessage(Identity, ComponentLike, MessageType)
- void sendMessage(Identified, Component, MessageType)
- void sendMessage(Identity, Component, MessageType)
- void sendMessage(Component, ChatType$Bound)
- void sendMessage(ComponentLike, ChatType$Bound)
- void sendMessage(SignedMessage, ChatType$Bound)
- void deleteMessage(SignedMessage)
- void deleteMessage(SignedMessage$Signature)
- void sendPlayerListHeaderAndFooter(ComponentLike, ComponentLike)
- void sendPlayerListHeaderAndFooter(Component, Component)
- Collector toAudience()
- void hideBossBar(BossBar)
- Audience empty()
- void openBook(Book$Builder)
- void openBook(Book)
- void showBossBar(BossBar)
- void clearResourcePacks()
- void stopSound(Sound)
- void stopSound(SoundStop)
- void showTitle(Title)
- void playSound(Sound)
- void playSound(Sound, double, double, double)
- void playSound(Sound, Sound$Emitter)
- void clearTitle()
- void resetTitle()
- void sendPlayerListFooter(ComponentLike)
- void sendPlayerListFooter(Component)
- void sendActionBar(ComponentLike)
- void sendActionBar(Component)
- Audience filterAudience(Predicate)

### Class: net.kyori.adventure.audience.ForwardingAudience
Type: Interface
Implements: net.kyori.adventure.audience.Audience

Methods:
- void sendPlayerListHeader(Component)
- void forEachAudience(Consumer)
- void removeResourcePacks(Iterable)
- void removeResourcePacks(UUID, UUID[])
- void sendResourcePacks(ResourcePackRequest)
- void sendTitlePart(TitlePart, Object)
- void sendMessage(Component)
- void sendMessage(Component, ChatType$Bound)
- void sendMessage(SignedMessage, ChatType$Bound)
- void sendMessage(Identified, Component, MessageType)
- void sendMessage(Identity, Component, MessageType)
- void deleteMessage(SignedMessage$Signature)
- void sendPlayerListHeaderAndFooter(Component, Component)
- void hideBossBar(BossBar)
- void openBook(Book)
- void showBossBar(BossBar)
- void clearResourcePacks()
- void stopSound(SoundStop)
- void playSound(Sound)
- void playSound(Sound, double, double, double)
- void playSound(Sound, Sound$Emitter)
- void clearTitle()
- Iterable audiences()
- void resetTitle()
- Pointers pointers()
- void sendPlayerListFooter(Component)
- void sendActionBar(Component)
- Audience filterAudience(Predicate)

### Class: net.kyori.adventure.audience.Audiences
Type: Class

Methods:
- Consumer sendingMessage(ComponentLike)

### Class: net.kyori.adventure.audience.MessageType
Type: Enum
Extends: java.lang.Enum

Methods:
- MessageType valueOf(String)
- MessageType[] values()

## Package: net.kyori.adventure.bossbar

### Class: net.kyori.adventure.bossbar.BossBar
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- boolean hasFlag(BossBar$Flag)
- BossBar removeFlag(BossBar$Flag)
- BossBar$Overlay overlay()
- BossBar overlay(BossBar$Overlay)
- BossBar$Color color()
- BossBar color(BossBar$Color)
- Set flags()
- BossBar flags(Set)
- BossBar removeViewer(Audience)
- BossBar removeListener(BossBar$Listener)
- float percent()
- BossBar percent(float)
- BossBar addFlag(BossBar$Flag)
- BossBar bossBar(ComponentLike, float, BossBar$Color, BossBar$Overlay)
- BossBar bossBar(Component, float, BossBar$Color, BossBar$Overlay)
- BossBar bossBar(ComponentLike, float, BossBar$Color, BossBar$Overlay, Set)
- BossBar bossBar(Component, float, BossBar$Color, BossBar$Overlay, Set)
- Iterable viewers()
- BossBar addFlags(BossBar$Flag[])
- BossBar addFlags(Iterable)
- Component name()
- BossBar name(ComponentLike)
- BossBar name(Component)
- BossBar addViewer(Audience)
- float progress()
- BossBar progress(float)
- BossBar addListener(BossBar$Listener)
- BossBar removeFlags(BossBar$Flag[])
- BossBar removeFlags(Iterable)

### Class: net.kyori.adventure.bossbar.BossBarImplementation
Type: Interface

Methods:
- Iterable viewers()
- BossBarImplementation get(BossBar, Class)

### Class: net.kyori.adventure.bossbar.BossBarViewer
Type: Interface

Methods:
- Iterable activeBossBars()

## Package: net.kyori.adventure.builder

### Class: net.kyori.adventure.builder.AbstractBuilder
Type: Interface

Methods:
- Object configureAndBuild(AbstractBuilder, Consumer)
- Object build()

## Package: net.kyori.adventure.chat

### Class: net.kyori.adventure.chat.ChatType
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.key.Keyed

Methods:
- ChatType$Bound bind(ComponentLike)
- ChatType$Bound bind(ComponentLike, ComponentLike)
- Stream examinableProperties()
- ChatType chatType(Keyed)

### Class: net.kyori.adventure.chat.SignedMessage
Type: Interface
Implements: net.kyori.adventure.identity.Identified, net.kyori.examination.Examinable

Methods:
- boolean isSystem()
- Component unsignedContent()
- long salt()
- SignedMessage system(String, ComponentLike)
- SignedMessage$Signature signature(byte[])
- SignedMessage$Signature signature()
- boolean canDelete()
- Stream examinableProperties()
- String message()
- Instant timestamp()

## Package: net.kyori.adventure.identity

### Class: net.kyori.adventure.identity.Identified
Type: Interface

Methods:
- Identity identity()

### Class: net.kyori.adventure.identity.Identity
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.identity.Identified

Methods:
- Identity nil()
- Identity identity(UUID)
- Identity identity()
- Stream examinableProperties()
- UUID uuid()

## Package: net.kyori.adventure.internal

### Class: net.kyori.adventure.internal.Internals
Type: Class

Methods:
- String toString(Examinable)

## Package: net.kyori.adventure.internal.properties

### Class: net.kyori.adventure.internal.properties.AdventureProperties
Type: Class

Methods:
- AdventureProperties$Property property(String, Function, Object)

## Package: net.kyori.adventure.inventory

### Class: net.kyori.adventure.inventory.Book
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable

Methods:
- Book$Builder toBuilder()
- Buildable$Builder toBuilder()
- List pages()
- Book pages(Component[])
- Book pages(List)
- Component author()
- Book author(Component)
- Book book(Component, Component, Collection)
- Book book(Component, Component, Component[])
- Book$Builder builder()
- Component title()
- Book title(Component)

## Package: net.kyori.adventure.key

### Class: net.kyori.adventure.key.Key
Type: Interface
Implements: java.lang.Comparable, net.kyori.examination.Examinable, net.kyori.adventure.key.Namespaced, net.kyori.adventure.key.Keyed

Methods:
- boolean parseableValue(String)
- boolean allowedInNamespace(char)
- boolean parseableNamespace(String)
- int compareTo(Key)
- int compareTo(Object)
- boolean allowedInValue(char)
- boolean parseable(String)
- Comparator comparator()
- String namespace()
- OptionalInt checkValue(String)
- Stream examinableProperties()
- String asString()
- String value()
- OptionalInt checkNamespace(String)
- Key key(String)
- Key key(String, char)
- Key key(Namespaced, String)
- Key key(String, String)
- Key key()
- String asMinimalString()

### Class: net.kyori.adventure.key.KeyPattern
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.kyori.adventure.key.Keyed
Type: Interface

Methods:
- Key key()

### Class: net.kyori.adventure.key.KeyedValue
Type: Interface
Implements: net.kyori.adventure.key.Keyed

Methods:
- KeyedValue keyedValue(Key, Object)
- KeyedValue of(Key, Object)
- Object value()

### Class: net.kyori.adventure.key.Namespaced
Type: Interface

Methods:
- String namespace()

### Class: net.kyori.adventure.key.InvalidKeyException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- String keyValue()
- String keyNamespace()

## Package: net.kyori.adventure.nbt

### Class: net.kyori.adventure.nbt.ArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- BinaryTagType type()

### Class: net.kyori.adventure.nbt.BinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTagLike, net.kyori.examination.Examinable

Methods:
- BinaryTag asBinaryTag()
- BinaryTagType type()

### Class: net.kyori.adventure.nbt.BinaryTagLike
Type: Interface

Methods:
- BinaryTag asBinaryTag()

### Class: net.kyori.adventure.nbt.ByteArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- int size()
- byte get(int)
- ByteArrayBinaryTag of(byte[])
- ByteArrayBinaryTag byteArrayBinaryTag(byte[])
- BinaryTagType type()
- byte[] value()

### Class: net.kyori.adventure.nbt.ByteBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- ByteBinaryTag of(byte)
- BinaryTagType type()
- byte value()
- ByteBinaryTag byteBinaryTag(byte)

### Class: net.kyori.adventure.nbt.CompoundBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag, net.kyori.adventure.nbt.CompoundTagSetter, java.lang.Iterable

Methods:
- CompoundBinaryTag getCompound(String)
- CompoundBinaryTag getCompound(String, CompoundBinaryTag)
- Collector toCompoundTag()
- Collector toCompoundTag(Function, Function)
- Collector toCompoundTag(CompoundBinaryTag)
- Collector toCompoundTag(CompoundBinaryTag, Function, Function)
- byte getByte(String)
- byte getByte(String, byte)
- short getShort(String)
- short getShort(String, short)
- boolean isEmpty()
- double getDouble(String)
- double getDouble(String, double)
- String getString(String)
- String getString(String, String)
- float getFloat(String)
- float getFloat(String, float)
- BinaryTagType type()
- long[] getLongArray(String)
- long[] getLongArray(String, long[])
- CompoundBinaryTag empty()
- long getLong(String)
- long getLong(String, long)
- int getInt(String)
- int getInt(String, int)
- int size()
- Stream stream()
- ListBinaryTag getList(String)
- ListBinaryTag getList(String, ListBinaryTag)
- ListBinaryTag getList(String, BinaryTagType)
- ListBinaryTag getList(String, BinaryTagType, ListBinaryTag)
- BinaryTag get(String)
- byte[] getByteArray(String)
- byte[] getByteArray(String, byte[])
- CompoundBinaryTag$Builder builder()
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- CompoundBinaryTag from(Map)
- Set keySet()
- int[] getIntArray(String)
- int[] getIntArray(String, int[])

### Class: net.kyori.adventure.nbt.CompoundTagSetter
Type: Interface

Methods:
- Object putFloat(String, float)
- Object putByte(String, byte)
- Object putInt(String, int)
- Object putString(String, String)
- Object putIntArray(String, int[])
- Object putDouble(String, double)
- Object putLongArray(String, long[])
- Object putLong(String, long)
- Object putShort(String, short)
- Object putBoolean(String, boolean)
- Object remove(String)
- Object remove(String, Consumer)
- Object put(String, BinaryTag)
- Object put(CompoundBinaryTag)
- Object put(Map)
- Object putByteArray(String, byte[])

### Class: net.kyori.adventure.nbt.DoubleBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- DoubleBinaryTag doubleBinaryTag(double)
- DoubleBinaryTag of(double)
- BinaryTagType type()
- double value()

### Class: net.kyori.adventure.nbt.EndBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- EndBinaryTag endBinaryTag()
- EndBinaryTag get()
- BinaryTagType type()

### Class: net.kyori.adventure.nbt.FloatBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- FloatBinaryTag floatBinaryTag(float)
- FloatBinaryTag of(float)
- BinaryTagType type()
- float value()

### Class: net.kyori.adventure.nbt.IntArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- PrimitiveIterator$OfInt iterator()
- Iterator iterator()
- int size()
- IntStream stream()
- Spliterator$OfInt spliterator()
- Spliterator spliterator()
- IntArrayBinaryTag intArrayBinaryTag(int[])
- int get(int)
- IntArrayBinaryTag of(int[])
- void forEachInt(IntConsumer)
- BinaryTagType type()
- int[] value()

### Class: net.kyori.adventure.nbt.IntBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- IntBinaryTag intBinaryTag(int)
- IntBinaryTag of(int)
- BinaryTagType type()
- int value()

### Class: net.kyori.adventure.nbt.ListBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ListTagSetter, net.kyori.adventure.nbt.BinaryTag, java.lang.Iterable

Methods:
- CompoundBinaryTag getCompound(int)
- CompoundBinaryTag getCompound(int, CompoundBinaryTag)
- ListBinaryTag listBinaryTag(BinaryTagType, List)
- byte getByte(int)
- byte getByte(int, byte)
- ListBinaryTag unwrapHeterogeneity()
- double getDouble(int)
- double getDouble(int, double)
- float getFloat(int)
- float getFloat(int, float)
- BinaryTagType type()
- BinaryTagType listType()
- ListBinaryTag remove(int, Consumer)
- ListBinaryTag empty()
- Collector toListTag()
- Collector toListTag(ListBinaryTag)
- Stream stream()
- ListBinaryTag getList(int)
- ListBinaryTag getList(int, BinaryTagType)
- ListBinaryTag getList(int, ListBinaryTag)
- ListBinaryTag getList(int, BinaryTagType, ListBinaryTag)
- BinaryTag get(int)
- ListBinaryTag of(BinaryTagType, List)
- ListBinaryTag$Builder builder()
- ListBinaryTag$Builder builder(BinaryTagType)
- ListBinaryTag from(Iterable)
- ListBinaryTag set(int, BinaryTag, Consumer)
- short getShort(int)
- short getShort(int, short)
- ListBinaryTag$Builder heterogeneousListBinaryTag()
- boolean isEmpty()
- String getString(int)
- String getString(int, String)
- long[] getLongArray(int)
- long[] getLongArray(int, long[])
- long getLong(int)
- long getLong(int, long)
- ListBinaryTag wrapHeterogeneity()
- int getInt(int)
- int getInt(int, int)
- int size()
- byte[] getByteArray(int)
- byte[] getByteArray(int, byte[])
- BinaryTagType elementType()
- int[] getIntArray(int)
- int[] getIntArray(int, int[])

### Class: net.kyori.adventure.nbt.ListTagSetter
Type: Interface

Methods:
- Object add(BinaryTag)
- Object add(Iterable)

### Class: net.kyori.adventure.nbt.LongArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- LongArrayBinaryTag longArrayBinaryTag(long[])
- PrimitiveIterator$OfLong iterator()
- Iterator iterator()
- int size()
- LongStream stream()
- Spliterator$OfLong spliterator()
- Spliterator spliterator()
- long get(int)
- LongArrayBinaryTag of(long[])
- BinaryTagType type()
- void forEachLong(LongConsumer)
- long[] value()

### Class: net.kyori.adventure.nbt.LongBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- LongBinaryTag of(long)
- BinaryTagType type()
- LongBinaryTag longBinaryTag(long)
- long value()

### Class: net.kyori.adventure.nbt.NumberBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- int intValue()
- float floatValue()
- short shortValue()
- Number numberValue()
- double doubleValue()
- BinaryTagType type()
- long longValue()
- byte byteValue()

### Class: net.kyori.adventure.nbt.ShortBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- ShortBinaryTag of(short)
- ShortBinaryTag shortBinaryTag(short)
- BinaryTagType type()
- short value()

### Class: net.kyori.adventure.nbt.StringBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- StringBinaryTag stringBinaryTag(String)
- StringBinaryTag of(String)
- BinaryTagType type()
- String value()

### Class: net.kyori.adventure.nbt.BinaryTagIO
Type: Class

Methods:
- void writeCompressedPath(CompoundBinaryTag, Path) throws IOException
- void writeOutputStream(CompoundBinaryTag, OutputStream) throws IOException
- CompoundBinaryTag readCompressedInputStream(InputStream) throws IOException
- CompoundBinaryTag readPath(Path) throws IOException
- BinaryTagIO$Reader reader()
- BinaryTagIO$Reader reader(long)
- CompoundBinaryTag readCompressedPath(Path) throws IOException
- CompoundBinaryTag readInputStream(InputStream) throws IOException
- void writeCompressedOutputStream(CompoundBinaryTag, OutputStream) throws IOException
- BinaryTagIO$Writer writer()
- CompoundBinaryTag readDataInput(DataInput) throws IOException
- BinaryTagIO$Reader unlimitedReader()
- void writeDataOutput(CompoundBinaryTag, DataOutput) throws IOException
- void writePath(CompoundBinaryTag, Path) throws IOException

### Class: net.kyori.adventure.nbt.BinaryTagType
Type: Abstract Class
Implements: java.util.function.Predicate

Methods:
- BinaryTag read(DataInput) throws IOException
- boolean test(BinaryTagType)
- boolean test(Object)
- byte id()
- void write(BinaryTag, DataOutput) throws IOException

### Class: net.kyori.adventure.nbt.BinaryTagTypes
Type: Class

No public methods found

### Class: net.kyori.adventure.nbt.TagStringIO
Type: Class

Methods:
- BinaryTag asTag(String) throws IOException
- BinaryTag asTag(String, Appendable) throws IOException
- TagStringIO tagStringIO()
- void toWriter(CompoundBinaryTag, Writer) throws IOException
- void toWriter(BinaryTag, Writer) throws IOException
- TagStringIO get()
- TagStringIO$Builder builder()
- String asString(CompoundBinaryTag) throws IOException
- String asString(BinaryTag) throws IOException
- CompoundBinaryTag asCompound(String) throws IOException
- CompoundBinaryTag asCompound(String, Appendable) throws IOException

## Package: net.kyori.adventure.nbt.api

### Class: net.kyori.adventure.nbt.api.BinaryTagHolder
Type: Interface
Implements: net.kyori.adventure.text.event.DataComponentValue$TagSerializable

Methods:
- BinaryTagHolder asBinaryTag()
- BinaryTagHolder encode(Object, Codec) throws Exception
- BinaryTagHolder binaryTagHolder(String)
- String string()
- Object get(Codec) throws Exception
- BinaryTagHolder of(String)

## Package: net.kyori.adventure.permission

### Class: net.kyori.adventure.permission.PermissionChecker
Type: Interface
Implements: java.util.function.Predicate

Methods:
- PermissionChecker always(TriState)
- boolean test(String)
- boolean test(Object)
- TriState value(String)

## Package: net.kyori.adventure.platform

### Class: net.kyori.adventure.platform.AudienceProvider
Type: Interface
Implements: java.lang.AutoCloseable

Methods:
- Audience all()
- Audience server(String)
- Audience console()
- ComponentFlattener flattener()
- Audience world(Key)
- Audience players()
- Audience permission(Key)
- Audience permission(String)
- void close()
- Audience player(UUID)

## Package: net.kyori.adventure.platform.bukkit

### Class: net.kyori.adventure.platform.bukkit.BukkitAudiences
Type: Interface
Implements: net.kyori.adventure.platform.AudienceProvider

Methods:
- Audience filter(Predicate)
- Audience sender(CommandSender)
- BukkitAudiences$Builder builder(Plugin)
- BukkitAudiences create(Plugin)
- Sound$Emitter asEmitter(Entity)
- Audience player(Player)

### Class: net.kyori.adventure.platform.bukkit.BukkitComponentSerializer
Type: Class

Methods:
- LegacyComponentSerializer legacy()
- GsonComponentSerializer gson()

### Class: net.kyori.adventure.platform.bukkit.MinecraftComponentSerializer
Type: Class
Implements: net.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- Object serialize(Component)
- MinecraftComponentSerializer get()
- boolean isSupported()
- Component deserialize(Object)

## Package: net.kyori.adventure.platform.facet

### Class: net.kyori.adventure.platform.facet.Facet
Type: Interface

Methods:
- Collection of(Supplier[])
- Facet of(Collection, Object)
- boolean isApplicable(Object)
- boolean isSupported()

### Class: net.kyori.adventure.platform.facet.FacetAudience
Type: Class
Implements: net.kyori.adventure.audience.Audience, java.io.Closeable

Methods:
- void sendPlayerListHeader(Component)
- void sendTitlePart(TitlePart, Object)
- void sendMessage(Identity, Component, MessageType)
- void sendMessage(Component, ChatType$Bound)
- void sendMessage(SignedMessage, ChatType$Bound)
- void refresh()
- void removeViewer(Object)
- void sendPlayerListHeaderAndFooter(Component, Component)
- void hideBossBar(BossBar)
- void showBossBar(BossBar)
- void openBook(Book)
- void stopSound(SoundStop)
- void showTitle(Title)
- void playSound(Sound)
- void playSound(Sound, Sound$Emitter)
- void playSound(Sound, double, double, double)
- void clearTitle()
- void addViewer(Object)
- void close()
- void resetTitle()
- Pointers pointers()
- void sendPlayerListFooter(Component)
- void sendActionBar(Component)

### Class: net.kyori.adventure.platform.facet.FacetAudienceProvider
Type: Abstract Class
Implements: net.kyori.adventure.platform.AudienceProvider, net.kyori.adventure.audience.ForwardingAudience

Methods:
- Audience filter(Predicate)
- Audience all()
- Audience server(String)
- Audience console()
- Audience world(Key)
- void refreshViewer(Object)
- Audience players()
- Iterable audiences()
- void removeViewer(Object)
- void addViewer(Object)
- Audience permission(String)
- void close()
- Audience player(UUID)

### Class: net.kyori.adventure.platform.facet.FacetBase
Type: Abstract Class
Implements: net.kyori.adventure.platform.facet.Facet

Methods:
- boolean isApplicable(Object)
- boolean isSupported()

### Class: net.kyori.adventure.platform.facet.FacetComponentFlattener
Type: Class

Methods:
- ComponentFlattener get(Object, Collection)

### Class: net.kyori.adventure.platform.facet.FacetPointers
Type: Class

No public methods found

### Class: net.kyori.adventure.platform.facet.Knob
Type: Class

Methods:
- void logError(Throwable, String, Object[])
- void logMessage(String, Object[])
- boolean isEnabled(String, boolean)
- void logUnsupported(Object, Object)

## Package: net.kyori.adventure.platform.viaversion

### Class: net.kyori.adventure.platform.viaversion.ViaFacet
Type: Class
Extends: net.kyori.adventure.platform.facet.FacetBase
Implements: net.kyori.adventure.platform.facet.Facet$Message

Methods:
- int findProtocol(Object)
- boolean isApplicable(Object)
- String createMessage(Object, Component)
- Object createMessage(Object, Component)
- UserConnection findConnection(Object)
- boolean isSupported()

## Package: net.kyori.adventure.pointer

### Class: net.kyori.adventure.pointer.Pointer
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- Pointer pointer(Class, Key)
- Stream examinableProperties()
- Class type()
- Key key()

### Class: net.kyori.adventure.pointer.Pointered
Type: Interface

Methods:
- Object getOrDefaultFrom(Pointer, Supplier)
- Object getOrDefault(Pointer, Object)
- Optional get(Pointer)
- Pointers pointers()

### Class: net.kyori.adventure.pointer.Pointers
Type: Interface
Implements: net.kyori.adventure.util.Buildable

Methods:
- Object getOrDefaultFrom(Pointer, Supplier)
- Object getOrDefault(Pointer, Object)
- Optional get(Pointer)
- Pointers$Builder builder()
- boolean supports(Pointer)
- Pointers empty()

### Class: net.kyori.adventure.pointer.PointersSupplier
Type: Interface

Methods:
- Function resolver(Pointer)
- Pointers view(Object)
- PointersSupplier$Builder builder()
- boolean supports(Pointer)

## Package: net.kyori.adventure.resource

### Class: net.kyori.adventure.resource.ResourcePackCallback
Type: Interface

Methods:
- ResourcePackCallback noOp()
- void packEventReceived(UUID, ResourcePackStatus, Audience)
- ResourcePackCallback onTerminal(BiConsumer, BiConsumer)

### Class: net.kyori.adventure.resource.ResourcePackInfo
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.resource.ResourcePackInfoLike

Methods:
- ResourcePackInfo resourcePackInfo(UUID, URI, String)
- ResourcePackInfo$Builder resourcePackInfo()
- ResourcePackInfo asResourcePackInfo()
- UUID id()
- URI uri()
- String hash()

### Class: net.kyori.adventure.resource.ResourcePackInfoLike
Type: Interface

Methods:
- ResourcePackInfo asResourcePackInfo()

### Class: net.kyori.adventure.resource.ResourcePackRequest
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.resource.ResourcePackRequestLike

Methods:
- boolean replace()
- ResourcePackRequest replace(boolean)
- ResourcePackRequest$Builder resourcePackRequest()
- ResourcePackRequest$Builder resourcePackRequest(ResourcePackRequest)
- ResourcePackCallback callback()
- ResourcePackRequest callback(ResourcePackCallback)
- ResourcePackRequest addingRequest(ResourcePackInfoLike, ResourcePackInfoLike[])
- ResourcePackRequest asResourcePackRequest()
- Component prompt()
- List packs()
- ResourcePackRequest packs(Iterable)
- boolean required()

### Class: net.kyori.adventure.resource.ResourcePackRequestLike
Type: Interface

Methods:
- ResourcePackRequest asResourcePackRequest()

### Class: net.kyori.adventure.resource.ResourcePackStatus
Type: Enum
Extends: java.lang.Enum

Methods:
- ResourcePackStatus valueOf(String)
- ResourcePackStatus[] values()
- boolean intermediate()

## Package: net.kyori.adventure.sound

### Class: net.kyori.adventure.sound.Sound
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- float volume()
- OptionalLong seed()
- SoundStop asStop()
- Sound$Builder sound()
- Sound$Builder sound(Sound)
- Sound sound(Consumer)
- Sound sound(Key, Sound$Source, float, float)
- Sound sound(Sound$Type, Sound$Source, float, float)
- Sound sound(Supplier, Sound$Source, float, float)
- Sound sound(Key, Sound$Source$Provider, float, float)
- Sound sound(Sound$Type, Sound$Source$Provider, float, float)
- Sound sound(Supplier, Sound$Source$Provider, float, float)
- Key name()
- float pitch()
- Sound$Source source()

### Class: net.kyori.adventure.sound.SoundStop
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- SoundStop all()
- SoundStop namedOnSource(Key, Sound$Source)
- SoundStop namedOnSource(Sound$Type, Sound$Source)
- SoundStop namedOnSource(Supplier, Sound$Source)
- SoundStop named(Key)
- SoundStop named(Sound$Type)
- SoundStop named(Supplier)
- Key sound()
- SoundStop source(Sound$Source)
- Sound$Source source()

## Package: net.kyori.adventure.text

### Class: net.kyori.adventure.text.BlockNBTComponent
Type: Interface
Implements: net.kyori.adventure.text.NBTComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- BlockNBTComponent localPos(double, double, double)
- BlockNBTComponent$Pos pos()
- BlockNBTComponent pos(BlockNBTComponent$Pos)
- BlockNBTComponent worldPos(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)
- Stream examinableProperties()
- BlockNBTComponent relativeWorldPos(int, int, int)
- BlockNBTComponent absoluteWorldPos(int, int, int)

### Class: net.kyori.adventure.text.BuildableComponent
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.adventure.text.Component

Methods:
- ComponentBuilder toBuilder()
- Buildable$Builder toBuilder()

### Class: net.kyori.adventure.text.Component
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilderApplicable, net.kyori.adventure.text.ComponentLike, net.kyori.examination.Examinable, net.kyori.adventure.text.event.HoverEventSource, net.kyori.adventure.text.format.StyleGetter, net.kyori.adventure.text.format.StyleSetter

Methods:
- Component decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- VirtualComponent virtual(Class, VirtualComponentRenderer)
- VirtualComponent virtual(Class, VirtualComponentRenderer, Style)
- VirtualComponent virtual(Class, VirtualComponentRenderer, StyleBuilderApplicable[])
- VirtualComponent virtual(Class, VirtualComponentRenderer, Iterable)
- Component compact()
- TextColor color()
- Component color(TextColor)
- StyleSetter color(TextColor)
- EntityNBTComponent$Builder entityNBT()
- EntityNBTComponent entityNBT(Consumer)
- EntityNBTComponent entityNBT(String, String)
- Component replaceFirstText(String, ComponentLike)
- Component replaceFirstText(Pattern, Function)
- Iterable iterable(ComponentIteratorType, ComponentIteratorFlag[])
- Iterable iterable(ComponentIteratorType, Set)
- TextComponent textOfChildren(ComponentLike[])
- Map decorations()
- Component decorations(Map)
- StyleSetter decorations(Map)
- StorageNBTComponent$Builder storageNBT()
- StorageNBTComponent storageNBT(Consumer)
- StorageNBTComponent storageNBT(String, Key)
- StorageNBTComponent storageNBT(String, boolean, Key)
- StorageNBTComponent storageNBT(String, boolean, ComponentLike, Key)
- Component asComponent()
- TextComponent space()
- Component shadowColorIfAbsent(ARGBLike)
- StyleSetter shadowColorIfAbsent(ARGBLike)
- Component colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- void detectCycle(Component)
- TextComponent empty()
- HoverEvent hoverEvent()
- Component hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- BlockNBTComponent$Builder blockNBT()
- BlockNBTComponent blockNBT(Consumer)
- BlockNBTComponent blockNBT(String, BlockNBTComponent$Pos)
- BlockNBTComponent blockNBT(String, boolean, BlockNBTComponent$Pos)
- BlockNBTComponent blockNBT(String, boolean, ComponentLike, BlockNBTComponent$Pos)
- ScoreComponent$Builder score()
- ScoreComponent score(Consumer)
- ScoreComponent score(String, String)
- ScoreComponent score(String, String, String)
- Iterator iterator(ComponentIteratorType, ComponentIteratorFlag[])
- Iterator iterator(ComponentIteratorType, Set)
- TextComponent newline()
- List children()
- Component children(List)
- Component mergeStyle(Component)
- Component mergeStyle(Component, Style$Merge[])
- Component mergeStyle(Component, Set)
- Component appendNewline()
- SelectorComponent$Builder selector()
- SelectorComponent selector(Consumer)
- SelectorComponent selector(String)
- SelectorComponent selector(String, ComponentLike)
- Stream examinableProperties()
- HoverEvent asHoverEvent(UnaryOperator)
- TextComponent$Builder text()
- TextComponent text(Consumer)
- TextComponent text(String)
- TextComponent text(String, Style)
- TextComponent text(String, TextColor)
- TextComponent text(String, TextColor, TextDecoration[])
- TextComponent text(String, TextColor, Set)
- TextComponent text(boolean)
- TextComponent text(boolean, Style)
- TextComponent text(boolean, TextColor)
- TextComponent text(boolean, TextColor, TextDecoration[])
- TextComponent text(boolean, TextColor, Set)
- TextComponent text(char)
- TextComponent text(char, Style)
- TextComponent text(char, TextColor)
- TextComponent text(char, TextColor, TextDecoration[])
- TextComponent text(char, TextColor, Set)
- TextComponent text(double)
- TextComponent text(double, Style)
- TextComponent text(double, TextColor)
- TextComponent text(double, TextColor, TextDecoration[])
- TextComponent text(double, TextColor, Set)
- TextComponent text(float)
- TextComponent text(float, Style)
- TextComponent text(float, TextColor)
- TextComponent text(float, TextColor, TextDecoration[])
- TextComponent text(float, TextColor, Set)
- TextComponent text(int)
- TextComponent text(int, Style)
- TextComponent text(int, TextColor)
- TextComponent text(int, TextColor, TextDecoration[])
- TextComponent text(int, TextColor, Set)
- TextComponent text(long)
- TextComponent text(long, Style)
- TextComponent text(long, TextColor)
- TextComponent text(long, TextColor, TextDecoration[])
- TextComponent text(long, TextColor, Set)
- TextComponent join(ComponentLike, ComponentLike[])
- TextComponent join(ComponentLike, Iterable)
- Component join(JoinConfiguration$Builder, ComponentLike[])
- Component join(JoinConfiguration$Builder, Iterable)
- Component join(JoinConfiguration, ComponentLike[])
- Component join(JoinConfiguration, Iterable)
- TextDecoration$State decoration(TextDecoration)
- Component decoration(TextDecoration, boolean)
- Component decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- ShadowColor shadowColor()
- Component shadowColor(ARGBLike)
- StyleSetter shadowColor(ARGBLike)
- void componentBuilderApply(ComponentBuilder)
- TranslatableComponent$Builder translatable()
- TranslatableComponent translatable(Consumer)
- TranslatableComponent translatable(String)
- TranslatableComponent translatable(Translatable)
- TranslatableComponent translatable(String, String)
- TranslatableComponent translatable(Translatable, String)
- TranslatableComponent translatable(String, Style)
- TranslatableComponent translatable(Translatable, Style)
- TranslatableComponent translatable(String, String, Style)
- TranslatableComponent translatable(Translatable, String, Style)
- TranslatableComponent translatable(String, String, StyleBuilderApplicable[])
- TranslatableComponent translatable(Translatable, String, Iterable)
- TranslatableComponent translatable(String, String, ComponentLike[])
- TranslatableComponent translatable(Translatable, String, ComponentLike[])
- TranslatableComponent translatable(String, String, Style, ComponentLike[])
- TranslatableComponent translatable(Translatable, String, Style, ComponentLike[])
- TranslatableComponent translatable(String, String, Style, List)
- TranslatableComponent translatable(Translatable, String, Style, List)
- TranslatableComponent translatable(String, String, List, Iterable)
- TranslatableComponent translatable(Translatable, String, List, Iterable)
- TranslatableComponent translatable(String, String, List, StyleBuilderApplicable[])
- TranslatableComponent translatable(Translatable, String, List, StyleBuilderApplicable[])
- TranslatableComponent translatable(String, TextColor)
- TranslatableComponent translatable(Translatable, TextColor)
- TranslatableComponent translatable(String, TextColor, TextDecoration[])
- TranslatableComponent translatable(Translatable, TextColor, TextDecoration[])
- TranslatableComponent translatable(String, TextColor, Set)
- TranslatableComponent translatable(Translatable, TextColor, Set)
- TranslatableComponent translatable(String, ComponentLike[])
- TranslatableComponent translatable(Translatable, ComponentLike[])
- TranslatableComponent translatable(String, Style, ComponentLike[])
- TranslatableComponent translatable(Translatable, Style, ComponentLike[])
- TranslatableComponent translatable(String, TextColor, ComponentLike[])
- TranslatableComponent translatable(Translatable, TextColor, ComponentLike[])
- TranslatableComponent translatable(String, TextColor, Set, ComponentLike[])
- TranslatableComponent translatable(Translatable, TextColor, Set, ComponentLike[])
- TranslatableComponent translatable(String, List)
- TranslatableComponent translatable(Translatable, List)
- TranslatableComponent translatable(String, Style, List)
- TranslatableComponent translatable(Translatable, Style, List)
- TranslatableComponent translatable(String, TextColor, List)
- TranslatableComponent translatable(Translatable, TextColor, List)
- TranslatableComponent translatable(String, TextColor, Set, List)
- TranslatableComponent translatable(Translatable, TextColor, Set, List)
- Component replaceText(Consumer)
- Component replaceText(TextReplacementConfig)
- Component replaceText(String, ComponentLike)
- Component replaceText(Pattern, Function)
- Component replaceText(String, ComponentLike, int)
- Component replaceText(Pattern, Function, int)
- Component replaceText(String, ComponentLike, IntFunction2)
- Component replaceText(Pattern, Function, IntFunction2)
- Component appendSpace()
- Spliterator spliterator(ComponentIteratorType, ComponentIteratorFlag[])
- Spliterator spliterator(ComponentIteratorType, Set)
- boolean hasStyling()
- boolean hasDecoration(TextDecoration)
- ClickEvent clickEvent()
- Component clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- boolean contains(Component)
- boolean contains(Component, BiPredicate)
- Component applyFallbackStyle(Style)
- Component applyFallbackStyle(StyleBuilderApplicable[])
- KeybindComponent$Builder keybind()
- KeybindComponent keybind(Consumer)
- KeybindComponent keybind(String)
- KeybindComponent keybind(KeybindComponent$KeybindLike)
- KeybindComponent keybind(String, Style)
- KeybindComponent keybind(KeybindComponent$KeybindLike, Style)
- KeybindComponent keybind(String, TextColor)
- KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor)
- KeybindComponent keybind(String, TextColor, TextDecoration[])
- KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor, TextDecoration[])
- KeybindComponent keybind(String, TextColor, Set)
- KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor, Set)
- Collector toComponent()
- Collector toComponent(Component)
- String insertion()
- Component insertion(String)
- StyleSetter insertion(String)
- Style style()
- Component style(Style)
- Component style(Consumer)
- Component style(Consumer, Style$Merge$Strategy)
- Component style(Style$Builder)
- Component append(Component)
- Component append(ComponentLike)
- Component append(ComponentBuilder)
- Component append(ComponentLike[])
- Component append(List)
- Component decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- Key font()
- Component font(Key)
- StyleSetter font(Key)

### Class: net.kyori.adventure.text.ComponentApplicable
Type: Interface

Methods:
- Component componentApply(Component)

### Class: net.kyori.adventure.text.ComponentBuilder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder, net.kyori.adventure.text.ComponentBuilderApplicable, net.kyori.adventure.text.ComponentLike, net.kyori.adventure.text.format.MutableStyleSetter

Methods:
- ComponentBuilder decorate(TextDecoration)
- ComponentBuilder decorate(TextDecoration[])
- MutableStyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration)
- ComponentBuilder color(TextColor)
- StyleSetter color(TextColor)
- ComponentBuilder applicableApply(ComponentBuilderApplicable)
- ComponentBuilder resetStyle()
- ComponentBuilder decorations(Set, boolean)
- ComponentBuilder decorations(Map)
- MutableStyleSetter decorations(Set, boolean)
- MutableStyleSetter decorations(Map)
- StyleSetter decorations(Set, boolean)
- StyleSetter decorations(Map)
- Component asComponent()
- ComponentBuilder colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- ComponentBuilder hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- ComponentBuilder mapChildren(Function)
- List children()
- ComponentBuilder mergeStyle(Component)
- ComponentBuilder mergeStyle(Component, Style$Merge[])
- ComponentBuilder mergeStyle(Component, Set)
- ComponentBuilder appendNewline()
- ComponentBuilder decoration(TextDecoration, boolean)
- ComponentBuilder decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- void componentBuilderApply(ComponentBuilder)
- ComponentBuilder appendSpace()
- ComponentBuilder apply(Consumer)
- ComponentBuilder clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- BuildableComponent build()
- Object build()
- ComponentBuilder mapChildrenDeep(Function)
- ComponentBuilder insertion(String)
- StyleSetter insertion(String)
- ComponentBuilder style(Style)
- ComponentBuilder style(Consumer)
- ComponentBuilder applyDeep(Consumer)
- ComponentBuilder append(Component)
- ComponentBuilder append(ComponentLike)
- ComponentBuilder append(ComponentBuilder)
- ComponentBuilder append(Component[])
- ComponentBuilder append(ComponentLike[])
- ComponentBuilder append(Iterable)
- ComponentBuilder decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- ComponentBuilder font(Key)
- StyleSetter font(Key)

### Class: net.kyori.adventure.text.ComponentBuilderApplicable
Type: Interface

Methods:
- void componentBuilderApply(ComponentBuilder)

### Class: net.kyori.adventure.text.ComponentIteratorType
Type: Interface

Methods:
- void populate(Component, Deque, Set)

### Class: net.kyori.adventure.text.ComponentLike
Type: Interface

Methods:
- Component unbox(ComponentLike)
- List asComponents(List)
- List asComponents(List, Predicate)
- Component asComponent()

### Class: net.kyori.adventure.text.EntityNBTComponent
Type: Interface
Implements: net.kyori.adventure.text.NBTComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String selector()
- EntityNBTComponent selector(String)
- Stream examinableProperties()

### Class: net.kyori.adventure.text.JoinConfiguration
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable

Methods:
- JoinConfiguration commas(boolean)
- Component prefix()
- Component suffix()
- JoinConfiguration noSeparators()
- JoinConfiguration separator(ComponentLike)
- Component separator()
- Predicate predicate()
- Function convertor()
- JoinConfiguration newlines()
- Component lastSeparatorIfSerial()
- JoinConfiguration spaces()
- JoinConfiguration$Builder builder()
- Component lastSeparator()
- JoinConfiguration separators(ComponentLike, ComponentLike)
- JoinConfiguration arrayLike()
- Style parentStyle()

### Class: net.kyori.adventure.text.KeybindComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String keybind()
- KeybindComponent keybind(String)
- KeybindComponent keybind(KeybindComponent$KeybindLike)
- Stream examinableProperties()

### Class: net.kyori.adventure.text.NBTComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent

Methods:
- String nbtPath()
- NBTComponent nbtPath(String)
- boolean interpret()
- NBTComponent interpret(boolean)
- Stream examinableProperties()
- Component separator()
- NBTComponent separator(ComponentLike)

### Class: net.kyori.adventure.text.NBTComponentBuilder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- NBTComponentBuilder nbtPath(String)
- NBTComponentBuilder interpret(boolean)
- NBTComponentBuilder separator(ComponentLike)

### Class: net.kyori.adventure.text.ScopedComponent
Type: Interface
Implements: net.kyori.adventure.text.Component

Methods:
- Component decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- Component color(TextColor)
- StyleSetter color(TextColor)
- Component appendSpace()
- Component decorations(Map)
- StyleSetter decorations(Map)
- Component asComponent()
- Component shadowColorIfAbsent(ARGBLike)
- StyleSetter shadowColorIfAbsent(ARGBLike)
- Component colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- Component hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- Component clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- Component applyFallbackStyle(StyleBuilderApplicable[])
- Component applyFallbackStyle(Style)
- Component children(List)
- Component mergeStyle(Component)
- Component mergeStyle(Component, Style$Merge[])
- Component mergeStyle(Component, Set)
- Component appendNewline()
- Component insertion(String)
- StyleSetter insertion(String)
- Component style(Style)
- Component style(Consumer)
- Component style(Style$Builder)
- Component style(Consumer, Style$Merge$Strategy)
- Component decoration(TextDecoration, boolean)
- Component decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- Component shadowColor(ARGBLike)
- StyleSetter shadowColor(ARGBLike)
- Component append(Component)
- Component append(ComponentLike)
- Component append(ComponentBuilder)
- Component append(List)
- Component append(ComponentLike[])
- Component font(Key)
- StyleSetter font(Key)
- Component decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)

### Class: net.kyori.adventure.text.ScoreComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String name()
- ScoreComponent name(String)
- Stream examinableProperties()
- String value()
- ScoreComponent value(String)
- String objective()
- ScoreComponent objective(String)

### Class: net.kyori.adventure.text.SelectorComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String pattern()
- SelectorComponent pattern(String)
- Stream examinableProperties()
- Component separator()
- SelectorComponent separator(ComponentLike)

### Class: net.kyori.adventure.text.StorageNBTComponent
Type: Interface
Implements: net.kyori.adventure.text.NBTComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- Stream examinableProperties()
- Key storage()
- StorageNBTComponent storage(Key)

### Class: net.kyori.adventure.text.TextComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- TextComponent ofChildren(ComponentLike[])
- Stream examinableProperties()
- String content()
- TextComponent content(String)

### Class: net.kyori.adventure.text.TextReplacementConfig
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable

Methods:
- TextReplacementConfig$Builder builder()
- Pattern matchPattern()

### Class: net.kyori.adventure.text.TranslatableComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- List args()
- TranslatableComponent args(ComponentLike[])
- TranslatableComponent args(List)
- List arguments()
- TranslatableComponent arguments(ComponentLike[])
- TranslatableComponent arguments(List)
- Stream examinableProperties()
- String fallback()
- TranslatableComponent fallback(String)
- String key()
- TranslatableComponent key(Translatable)
- TranslatableComponent key(String)

### Class: net.kyori.adventure.text.TranslationArgument
Type: Interface
Implements: net.kyori.adventure.text.TranslationArgumentLike, net.kyori.examination.Examinable

Methods:
- TranslationArgument asTranslationArgument()
- TranslationArgument component(ComponentLike)
- TranslationArgument bool(boolean)
- TranslationArgument numeric(Number)
- Object value()

### Class: net.kyori.adventure.text.TranslationArgumentLike
Type: Interface
Implements: net.kyori.adventure.text.ComponentLike

Methods:
- TranslationArgument asTranslationArgument()
- Component asComponent()

### Class: net.kyori.adventure.text.VirtualComponent
Type: Interface
Implements: net.kyori.adventure.text.TextComponent

Methods:
- VirtualComponentRenderer renderer()
- Class contextType()

### Class: net.kyori.adventure.text.VirtualComponentRenderer
Type: Interface

Methods:
- ComponentLike apply(Object)
- String fallbackString()

### Class: net.kyori.adventure.text.AbstractComponent
Type: Abstract Class
Implements: net.kyori.adventure.text.Component

Methods:
- List children()
- int hashCode()
- boolean equals(Object)
- String toString()
- Style style()

### Class: net.kyori.adventure.text.ComponentIteratorFlag
Type: Enum
Extends: java.lang.Enum

Methods:
- ComponentIteratorFlag valueOf(String)
- ComponentIteratorFlag[] values()

### Class: net.kyori.adventure.text.LinearComponents
Type: Class

Methods:
- Component linear(ComponentBuilderApplicable[])

### Class: net.kyori.adventure.text.PatternReplacementResult
Type: Enum
Extends: java.lang.Enum

Methods:
- PatternReplacementResult valueOf(String)
- PatternReplacementResult[] values()

## Package: net.kyori.adventure.text.event

### Class: net.kyori.adventure.text.event.ClickCallback
Type: Interface

Methods:
- ClickCallback filter(Predicate)
- ClickCallback filter(Predicate, Consumer)
- ClickCallback requiringPermission(String)
- ClickCallback requiringPermission(String, Consumer)
- ClickCallback widen(ClickCallback, Class, Consumer)
- ClickCallback widen(ClickCallback, Class)
- void accept(Audience)

### Class: net.kyori.adventure.text.event.DataComponentValue
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- DataComponentValue$Removed removed()

### Class: net.kyori.adventure.text.event.HoverEventSource
Type: Interface

Methods:
- HoverEvent unbox(HoverEventSource)
- HoverEvent asHoverEvent()
- HoverEvent asHoverEvent(UnaryOperator)

### Class: net.kyori.adventure.text.event.ClickEvent
Type: Class
Implements: net.kyori.examination.Examinable, net.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- ClickEvent openFile(String)
- void styleApply(Style$Builder)
- ClickEvent openUrl(String)
- ClickEvent openUrl(URL)
- ClickEvent clickEvent(ClickEvent$Action, String)
- ClickEvent changePage(String)
- ClickEvent changePage(int)
- int hashCode()
- boolean equals(Object)
- ClickEvent suggestCommand(String)
- ClickEvent$Action action()
- ClickEvent callback(ClickCallback)
- ClickEvent callback(ClickCallback, ClickCallback$Options)
- ClickEvent callback(ClickCallback, Consumer)
- ClickEvent copyToClipboard(String)
- String toString()
- ClickEvent runCommand(String)
- Stream examinableProperties()
- String value()

### Class: net.kyori.adventure.text.event.DataComponentValueConverterRegistry
Type: Class

Methods:
- DataComponentValue convert(Class, Key, DataComponentValue)
- Set knownProviders()

### Class: net.kyori.adventure.text.event.HoverEvent
Type: Class
Implements: net.kyori.examination.Examinable, net.kyori.adventure.text.event.HoverEventSource, net.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- HoverEvent showText(ComponentLike)
- HoverEvent showText(Component)
- HoverEvent withRenderedValue(ComponentRenderer, Object)
- void styleApply(Style$Builder)
- HoverEvent hoverEvent(HoverEvent$Action, Object)
- HoverEvent showAchievement(String)
- HoverEvent showEntity(Key, UUID)
- HoverEvent showEntity(Keyed, UUID)
- HoverEvent showEntity(Key, UUID, Component)
- HoverEvent showEntity(Keyed, UUID, Component)
- HoverEvent showEntity(HoverEvent$ShowEntity)
- int hashCode()
- boolean equals(Object)
- HoverEvent$Action action()
- HoverEvent showItem(Key, int)
- HoverEvent showItem(Keyed, int)
- HoverEvent showItem(Key, int, BinaryTagHolder)
- HoverEvent showItem(Keyed, int, BinaryTagHolder)
- HoverEvent showItem(Keyed, int, Map)
- HoverEvent showItem(HoverEvent$ShowItem)
- String toString()
- Stream examinableProperties()
- HoverEvent asHoverEvent()
- HoverEvent asHoverEvent(UnaryOperator)
- Object value()
- HoverEvent value(Object)

## Package: net.kyori.adventure.text.flattener

### Class: net.kyori.adventure.text.flattener.ComponentFlattener
Type: Interface
Implements: net.kyori.adventure.util.Buildable

Methods:
- void flatten(Component, FlattenerListener)
- ComponentFlattener textOnly()
- ComponentFlattener$Builder builder()
- ComponentFlattener basic()

### Class: net.kyori.adventure.text.flattener.FlattenerListener
Type: Interface

Methods:
- boolean shouldContinue()
- void pushStyle(Style)
- void component(String)
- void popStyle(Style)

## Package: net.kyori.adventure.text.format

### Class: net.kyori.adventure.text.format.MutableStyleSetter
Type: Interface
Implements: net.kyori.adventure.text.format.StyleSetter

Methods:
- MutableStyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration[])
- MutableStyleSetter decorations(Map)
- MutableStyleSetter decorations(Set, boolean)
- StyleSetter decorations(Set, boolean)
- StyleSetter decorations(Map)

### Class: net.kyori.adventure.text.format.ShadowColor
Type: Interface
Implements: net.kyori.adventure.text.format.StyleBuilderApplicable, net.kyori.adventure.util.ARGBLike

Methods:
- int red()
- int green()
- int blue()
- ShadowColor lerp(float, ARGBLike, ARGBLike)
- int alpha()
- ShadowColor fromHexString(String)
- String asHexString()
- ShadowColor none()
- void styleApply(Style$Builder)
- int value()
- ShadowColor shadowColor(int)
- ShadowColor shadowColor(int, int, int, int)
- ShadowColor shadowColor(RGBLike, int)
- ShadowColor shadowColor(ARGBLike)

### Class: net.kyori.adventure.text.format.Style
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable, net.kyori.adventure.text.format.StyleGetter, net.kyori.adventure.text.format.StyleSetter

Methods:
- Style$Builder toBuilder()
- Buildable$Builder toBuilder()
- Style decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- Style unmerge(Style)
- TextColor color()
- Style color(TextColor)
- StyleSetter color(TextColor)
- Style edit(Consumer)
- Style edit(Consumer, Style$Merge$Strategy)
- boolean isEmpty()
- Map decorations()
- Style decorations(Map)
- StyleSetter decorations(Map)
- boolean hasDecoration(TextDecoration)
- Style colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- Style empty()
- HoverEvent hoverEvent()
- Style hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- ClickEvent clickEvent()
- Style clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- Style merge(Style)
- Style merge(Style, Style$Merge$Strategy)
- Style merge(Style, Style$Merge)
- Style merge(Style, Style$Merge$Strategy, Style$Merge)
- Style merge(Style, Style$Merge[])
- Style merge(Style, Style$Merge$Strategy, Style$Merge[])
- Style merge(Style, Set)
- Style merge(Style, Style$Merge$Strategy, Set)
- String insertion()
- Style insertion(String)
- StyleSetter insertion(String)
- Style$Builder style()
- Style style(Consumer)
- Style style(TextColor)
- Style style(TextDecoration)
- Style style(TextColor, TextDecoration[])
- Style style(TextColor, Set)
- Style style(StyleBuilderApplicable[])
- Style style(Iterable)
- TextDecoration$State decoration(TextDecoration)
- Style decoration(TextDecoration, boolean)
- Style decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- Style decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- Key font()
- Style font(Key)
- StyleSetter font(Key)

### Class: net.kyori.adventure.text.format.StyleBuilderApplicable
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilderApplicable

Methods:
- void styleApply(Style$Builder)
- void componentBuilderApply(ComponentBuilder)

### Class: net.kyori.adventure.text.format.StyleGetter
Type: Interface

Methods:
- HoverEvent hoverEvent()
- ClickEvent clickEvent()
- TextColor color()
- String insertion()
- Map decorations()
- boolean hasDecoration(TextDecoration)
- TextDecoration$State decoration(TextDecoration)
- ShadowColor shadowColor()
- Key font()

### Class: net.kyori.adventure.text.format.StyleSetter
Type: Interface

Methods:
- StyleSetter hoverEvent(HoverEventSource)
- StyleSetter clickEvent(ClickEvent)
- StyleSetter decorate(TextDecoration)
- StyleSetter decorate(TextDecoration[])
- StyleSetter color(TextColor)
- StyleSetter insertion(String)
- StyleSetter decorations(Map)
- StyleSetter decorations(Set, boolean)
- StyleSetter decoration(TextDecoration, boolean)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter shadowColor(ARGBLike)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter shadowColorIfAbsent(ARGBLike)
- StyleSetter colorIfAbsent(TextColor)
- StyleSetter font(Key)

### Class: net.kyori.adventure.text.format.TextColor
Type: Interface
Implements: java.lang.Comparable, net.kyori.examination.Examinable, net.kyori.adventure.util.RGBLike, net.kyori.adventure.text.format.StyleBuilderApplicable, net.kyori.adventure.text.format.TextFormat

Methods:
- int green()
- TextColor fromCSSHexString(String)
- TextColor color(int)
- TextColor color(RGBLike)
- TextColor color(HSVLike)
- TextColor color(int, int, int)
- TextColor color(float, float, float)
- TextColor lerp(float, RGBLike, RGBLike)
- int compareTo(TextColor)
- int compareTo(Object)
- void styleApply(Style$Builder)
- int red()
- int blue()
- TextColor nearestColorTo(List, TextColor)
- TextColor fromHexString(String)
- Stream examinableProperties()
- String asHexString()
- int value()

### Class: net.kyori.adventure.text.format.TextDecorationAndState
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- Stream examinableProperties()
- TextDecoration$State state()
- void styleApply(Style$Builder)
- TextDecoration decoration()

### Class: net.kyori.adventure.text.format.TextFormat
Type: Interface

No public methods found

### Class: net.kyori.adventure.text.format.NamedTextColor
Type: Class
Implements: net.kyori.adventure.text.format.TextColor

Methods:
- NamedTextColor nearestTo(TextColor)
- NamedTextColor namedColor(int)
- HSVLike asHSV()
- String toString()
- Stream examinableProperties()
- int value()
- NamedTextColor ofExact(int)

### Class: net.kyori.adventure.text.format.TextDecoration
Type: Enum
Extends: java.lang.Enum
Implements: net.kyori.adventure.text.format.StyleBuilderApplicable, net.kyori.adventure.text.format.TextFormat

Methods:
- TextDecorationAndState as(boolean)
- TextDecorationAndState as(TextDecoration$State)
- TextDecorationAndState withState(boolean)
- TextDecorationAndState withState(TextDecoration$State)
- TextDecorationAndState withState(TriState)
- TextDecoration valueOf(String)
- TextDecoration[] values()
- String toString()
- void styleApply(Style$Builder)

## Package: net.kyori.adventure.text.logger.slf4j

### Class: net.kyori.adventure.text.logger.slf4j.ComponentLogger
Type: Interface
Implements: org.slf4j.Logger

Methods:
- void warn(Component)
- void warn(Component, Object)
- void warn(Component, Object[])
- void warn(Component, Object, Object)
- void warn(Component, Throwable)
- void warn(Marker, Component)
- void warn(Marker, Component, Object)
- void warn(Marker, Component, Object, Object)
- void warn(Marker, Component, Object[])
- void warn(Marker, Component, Throwable)
- void trace(Component)
- void trace(Component, Object)
- void trace(Component, Object, Object)
- void trace(Component, Object[])
- void trace(Component, Throwable)
- void trace(Marker, Component)
- void trace(Marker, Component, Object)
- void trace(Marker, Component, Object, Object)
- void trace(Marker, Component, Object[])
- void trace(Marker, Component, Throwable)
- void debug(Component)
- void debug(Component, Object)
- void debug(Component, Object, Object)
- void debug(Component, Object[])
- void debug(Component, Throwable)
- void debug(Marker, Component)
- void debug(Marker, Component, Object)
- void debug(Marker, Component, Object, Object)
- void debug(Marker, Component, Object[])
- void debug(Marker, Component, Throwable)
- ComponentLogger logger()
- ComponentLogger logger(String)
- ComponentLogger logger(Class)
- void error(Component)
- void error(Component, Object)
- void error(Component, Object, Object)
- void error(Component, Object[])
- void error(Component, Throwable)
- void error(Marker, Component)
- void error(Marker, Component, Object)
- void error(Marker, Component, Object, Object)
- void error(Marker, Component, Object[])
- void error(Marker, Component, Throwable)
- void info(Component)
- void info(Component, Object)
- void info(Component, Object, Object)
- void info(Component, Object[])
- void info(Component, Throwable)
- void info(Marker, Component)
- void info(Marker, Component, Object)
- void info(Marker, Component, Object, Object)
- void info(Marker, Component, Object[])
- void info(Marker, Component, Throwable)

### Class: net.kyori.adventure.text.logger.slf4j.ComponentLoggerProvider
Type: Interface

Methods:
- ComponentLogger logger(ComponentLoggerProvider$LoggerHelper, String)

## Package: net.kyori.adventure.text.minimessage

### Class: net.kyori.adventure.text.minimessage.Context
Type: Interface

Methods:
- Pointered targetOrThrow()
- boolean emitVirtuals()
- Pointered targetAsType(Class)
- ParsingException newException(String, ArgumentQueue)
- ParsingException newException(String)
- ParsingException newException(String, Throwable, ArgumentQueue)
- Component deserialize(String)
- Component deserialize(String, TagResolver)
- Component deserialize(String, TagResolver[])
- Pointered target()

### Class: net.kyori.adventure.text.minimessage.MiniMessage
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- String escapeTags(String)
- String escapeTags(String, TagResolver)
- String escapeTags(String, TagResolver[])
- MiniMessage miniMessage()
- MiniMessage$Builder builder()
- String stripTags(String)
- String stripTags(String, TagResolver)
- String stripTags(String, TagResolver[])
- Node$Root deserializeToTree(String)
- Node$Root deserializeToTree(String, Pointered)
- Node$Root deserializeToTree(String, TagResolver)
- Node$Root deserializeToTree(String, Pointered, TagResolver)
- Node$Root deserializeToTree(String, TagResolver[])
- Node$Root deserializeToTree(String, Pointered, TagResolver[])
- boolean strict()
- TagResolver tags()
- Component deserialize(String, Pointered)
- Component deserialize(String, TagResolver)
- Component deserialize(String, Pointered, TagResolver)
- Component deserialize(String, TagResolver[])
- Component deserialize(String, Pointered, TagResolver[])

### Class: net.kyori.adventure.text.minimessage.ParsingException
Type: Abstract Class
Extends: java.lang.RuntimeException

Methods:
- String originalText()
- int startIndex()
- int endIndex()
- String detailMessage()

## Package: net.kyori.adventure.text.minimessage.internal

### Class: net.kyori.adventure.text.minimessage.internal.TagInternals
Type: Class

Methods:
- boolean sanitizeAndCheckValidTagName(String)
- void assertValidTagName(String)
- void sanitizeAndAssertValidTagName(String)

## Package: net.kyori.adventure.text.minimessage.internal.parser

### Class: net.kyori.adventure.text.minimessage.internal.parser.ParsingExceptionImpl
Type: Class
Extends: net.kyori.adventure.text.minimessage.ParsingException

Methods:
- String originalText()
- int startIndex()
- int endIndex()
- String getMessage()
- Token[] tokens()
- void tokens(Token[])
- String detailMessage()

### Class: net.kyori.adventure.text.minimessage.internal.parser.Token
Type: Class
Implements: net.kyori.examination.Examinable

Methods:
- int startIndex()
- int hashCode()
- int endIndex()
- boolean equals(Object)
- CharSequence get(CharSequence)
- String toString()
- List childTokens()
- void childTokens(List)
- Stream examinableProperties()
- TokenType type()

### Class: net.kyori.adventure.text.minimessage.internal.parser.TokenParser
Type: Class

Methods:
- String resolvePreProcessTags(String, TokenParser$TagProvider)
- void parseString(String, boolean, MatchedTokenConsumer)
- String unescape(String, int, int, IntPredicate)
- RootNode parse(TokenParser$TagProvider, Predicate, String, String, boolean) throws ParsingException
- List tokenize(String, boolean)

### Class: net.kyori.adventure.text.minimessage.internal.parser.TokenType
Type: Enum
Extends: java.lang.Enum

Methods:
- TokenType valueOf(String)
- TokenType[] values()

## Package: net.kyori.adventure.text.minimessage.internal.parser.match

### Class: net.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer
Type: Abstract Class

Methods:
- Object result()
- int lastEndIndex()
- void accept(int, int, TokenType)

### Class: net.kyori.adventure.text.minimessage.internal.parser.match.StringResolvingMatchedTokenConsumer
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer

Methods:
- String result()
- Object result()
- void accept(int, int, TokenType)

### Class: net.kyori.adventure.text.minimessage.internal.parser.match.TokenListProducingMatchedTokenConsumer
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer

Methods:
- List result()
- Object result()
- void accept(int, int, TokenType)

## Package: net.kyori.adventure.text.minimessage.internal.parser.node

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode
Type: Class
Implements: net.kyori.adventure.text.minimessage.tree.Node

Methods:
- String sourceMessage()
- ElementNode parent()
- Node parent()
- List unsafeChildren()
- StringBuilder buildToString(StringBuilder, int)
- List children()
- String toString()
- void addChild(ElementNode)
- Token token()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.RootNode
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode
Implements: net.kyori.adventure.text.minimessage.tree.Node$Root

Methods:
- String input()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.TagNode
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode

Methods:
- StringBuilder buildToString(StringBuilder, int)
- String name()
- List parts()
- Tag tag()
- void tag(Tag)
- Token token()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.TagPart
Type: Class
Implements: net.kyori.adventure.text.minimessage.tag.Tag$Argument

Methods:
- String unquoteAndEscape(String, int, int)
- String toString()
- String value()
- Token token()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.TextNode
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ValueNode

No public methods found

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.ValueNode
Type: Abstract Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode

Methods:
- StringBuilder buildToString(StringBuilder, int)
- String value()
- Token token()

## Package: net.kyori.adventure.text.minimessage.internal.serializer

### Class: net.kyori.adventure.text.minimessage.internal.serializer.ClaimConsumer
Type: Interface

Methods:
- boolean component(Emitable)
- boolean styleClaimed(String)
- boolean componentClaimed()
- void style(String, Emitable)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.Emitable
Type: Interface

Methods:
- void emit(TokenEmitter)
- Component substitute()

### Class: net.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver
Type: Interface

Methods:
- TagResolver claimingStyle(String, BiFunction, StyleClaim)
- TagResolver claimingStyle(Set, BiFunction, StyleClaim)
- TagResolver claimingComponent(String, BiFunction, Function)
- TagResolver claimingComponent(Set, BiFunction, Function)
- void handle(Component, ClaimConsumer)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.StyleClaim
Type: Interface

Methods:
- Emitable apply(Style)
- String claimKey()
- StyleClaim claim(String, Function, BiConsumer)
- StyleClaim claim(String, Function, Predicate, BiConsumer)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.TokenEmitter
Type: Interface

Methods:
- TokenEmitter pop()
- TokenEmitter argument(String)
- TokenEmitter argument(String, QuotingOverride)
- TokenEmitter argument(Component)
- TokenEmitter selfClosingTag(String)
- TokenEmitter arguments(String[])
- TokenEmitter text(String)
- TokenEmitter tag(String)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.QuotingOverride
Type: Enum
Extends: java.lang.Enum

Methods:
- QuotingOverride valueOf(String)
- QuotingOverride[] values()

## Package: net.kyori.adventure.text.minimessage.tag

### Class: net.kyori.adventure.text.minimessage.tag.Inserting
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

Methods:
- boolean allowsChildren()
- Component value()

### Class: net.kyori.adventure.text.minimessage.tag.Modifying
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

Methods:
- void postVisit()
- Component apply(Component, int)
- void visit(Node, int)

### Class: net.kyori.adventure.text.minimessage.tag.ParserDirective
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

No public methods found

### Class: net.kyori.adventure.text.minimessage.tag.PreProcess
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

Methods:
- String value()

### Class: net.kyori.adventure.text.minimessage.tag.Tag
Type: Interface

Methods:
- Tag styling(Consumer)
- Tag styling(StyleBuilderApplicable[])
- PreProcess preProcessParsed(String)
- Tag inserting(Component)
- Tag inserting(ComponentLike)
- Tag selfClosingInserting(Component)
- Tag selfClosingInserting(ComponentLike)

### Class: net.kyori.adventure.text.minimessage.tag.TagPattern
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

## Package: net.kyori.adventure.text.minimessage.tag.resolver

### Class: net.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue
Type: Interface

Methods:
- Tag$Argument pop()
- void reset()
- boolean hasNext()
- Tag$Argument popOr(String)
- Tag$Argument popOr(Supplier)
- Tag$Argument peek()

### Class: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver
Type: Interface

Methods:
- TagResolver standard()
- TagResolver$Single resolver(String, Tag)
- TagResolver resolver(String, BiFunction)
- TagResolver resolver(Set, BiFunction)
- TagResolver resolver(TagResolver[])
- TagResolver resolver(Iterable)
- Tag resolve(String, ArgumentQueue, Context) throws ParsingException
- TagResolver$Builder builder()
- boolean has(String)
- Collector toTagResolver()
- TagResolver caching(TagResolver$WithoutArguments)
- TagResolver empty()

### Class: net.kyori.adventure.text.minimessage.tag.resolver.Formatter
Type: Class

Methods:
- TagResolver date(String, TemporalAccessor)
- TagResolver joining(String, Iterable)
- TagResolver joining(String, ComponentLike[])
- TagResolver number(String, Number)
- TagResolver booleanChoice(String, boolean)
- TagResolver choice(String, Number)

### Class: net.kyori.adventure.text.minimessage.tag.resolver.Placeholder
Type: Class

Methods:
- TagResolver$Single component(String, ComponentLike)
- TagResolver$Single styling(String, StyleBuilderApplicable[])
- TagResolver$Single unparsed(String, String)
- TagResolver$Single parsed(String, String)

## Package: net.kyori.adventure.text.minimessage.tag.standard

### Class: net.kyori.adventure.text.minimessage.tag.standard.StandardTags
Type: Class

Methods:
- TagResolver nbt()
- TagResolver translatable()
- TagResolver color()
- TagResolver gradient()
- TagResolver decorations(TextDecoration)
- TagResolver decorations()
- TagResolver transition()
- TagResolver hoverEvent()
- TagResolver score()
- TagResolver rainbow()
- TagResolver clickEvent()
- TagResolver newline()
- TagResolver defaults()
- TagResolver pride()
- TagResolver keybind()
- TagResolver reset()
- TagResolver translatableFallback()
- TagResolver selector()
- TagResolver insertion()
- TagResolver shadowColor()
- TagResolver font()

### Class: net.kyori.adventure.text.minimessage.tag.standard.TransitionTag
Type: Class
Implements: net.kyori.adventure.text.minimessage.tag.Inserting, net.kyori.examination.Examinable

Methods:
- int hashCode()
- boolean equals(Object)
- Stream examinableProperties()
- Component value()

## Package: net.kyori.adventure.text.minimessage.translation

### Class: net.kyori.adventure.text.minimessage.translation.MiniMessageTranslationStore
Type: Interface
Implements: net.kyori.adventure.translation.TranslationStore$StringBased

Methods:
- MiniMessageTranslationStore create(Key)
- MiniMessageTranslationStore create(Key, MiniMessage)

### Class: net.kyori.adventure.text.minimessage.translation.Argument
Type: Class

Methods:
- ComponentLike argument(String, TranslationArgumentLike)
- ComponentLike argument(String, TranslationArgument)
- ComponentLike component(String, ComponentLike)
- ComponentLike bool(String, boolean)
- ComponentLike numeric(String, Number)
- ComponentLike numeric(String, String)
- ComponentLike tag(String, Tag)
- ComponentLike target(Pointered)
- ComponentLike tagResolver(TagResolver[])
- ComponentLike tagResolver(Iterable)
- ComponentLike tagResolver(TagResolver)

### Class: net.kyori.adventure.text.minimessage.translation.MiniMessageTranslator
Type: Abstract Class
Implements: net.kyori.adventure.translation.Translator

Methods:
- MessageFormat translate(String, Locale)
- Component translate(TranslatableComponent, Locale)

## Package: net.kyori.adventure.text.minimessage.tree

### Class: net.kyori.adventure.text.minimessage.tree.Node
Type: Interface

Methods:
- Node parent()
- List children()
- String toString()

## Package: net.kyori.adventure.text.renderer

### Class: net.kyori.adventure.text.renderer.ComponentRenderer
Type: Interface

Methods:
- ComponentRenderer mapContext(Function)
- Component render(Component, Object)

### Class: net.kyori.adventure.text.renderer.AbstractComponentRenderer
Type: Abstract Class
Implements: net.kyori.adventure.text.renderer.ComponentRenderer

Methods:
- Component render(Component, Object)

### Class: net.kyori.adventure.text.renderer.TranslatableComponentRenderer
Type: Abstract Class
Extends: net.kyori.adventure.text.renderer.AbstractComponentRenderer

Methods:
- TranslatableComponentRenderer usingTranslationSource(Translator)

## Package: net.kyori.adventure.text.serializer

### Class: net.kyori.adventure.text.serializer.ComponentDecoder
Type: Interface

Methods:
- Component deserializeOr(Object, Component)
- Component deserializeOrNull(Object)
- Component deserialize(Object)

### Class: net.kyori.adventure.text.serializer.ComponentEncoder
Type: Interface

Methods:
- Object serializeOr(Component, Object)
- Object serializeOrNull(Component)
- Object serialize(Component)

### Class: net.kyori.adventure.text.serializer.ComponentSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentEncoder, net.kyori.adventure.text.serializer.ComponentDecoder

Methods:
- Object serializeOr(Component, Object)
- Object serializeOrNull(Component)
- Object serialize(Component)
- Component deseializeOrNull(Object)
- Component deserializeOr(Object, Component)
- Component deserializeOrNull(Object)
- Component deserialize(Object)

## Package: net.kyori.adventure.text.serializer.ansi

### Class: net.kyori.adventure.text.serializer.ansi.ANSIComponentSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentEncoder

Methods:
- ANSIComponentSerializer$Builder builder()
- ANSIComponentSerializer ansi()

## Package: net.kyori.adventure.text.serializer.bungeecord

### Class: net.kyori.adventure.text.serializer.bungeecord.BungeeComponentSerializer
Type: Class
Implements: net.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- BaseComponent[] serialize(Component)
- Object serialize(Component)
- BungeeComponentSerializer legacy()
- BungeeComponentSerializer of(GsonComponentSerializer, LegacyComponentSerializer)
- BungeeComponentSerializer get()
- boolean inject(Gson)
- boolean isNative()
- Component deserialize(BaseComponent[])
- Component deserialize(Object)

## Package: net.kyori.adventure.text.serializer.commons

### Class: net.kyori.adventure.text.serializer.commons.ComponentTreeConstants
Type: Class

No public methods found

## Package: net.kyori.adventure.text.serializer.craftbukkit

### Class: net.kyori.adventure.text.serializer.craftbukkit.BukkitComponentSerializer
Type: Class

Methods:
- LegacyComponentSerializer legacy()
- GsonComponentSerializer gson()

### Class: net.kyori.adventure.text.serializer.craftbukkit.MinecraftComponentSerializer
Type: Class
Implements: net.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- Object serialize(Component)
- MinecraftComponentSerializer get()
- boolean isSupported()
- Component deserialize(Object)

## Package: net.kyori.adventure.text.serializer.gson

### Class: net.kyori.adventure.text.serializer.gson.GsonComponentSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.json.JSONComponentSerializer, net.kyori.adventure.util.Buildable

Methods:
- JsonElement serializeToTree(Component)
- Component deserializeFromTree(JsonElement)
- GsonComponentSerializer$Builder builder()
- Gson serializer()
- GsonComponentSerializer colorDownsamplingGson()
- GsonComponentSerializer gson()
- UnaryOperator populator()

### Class: net.kyori.adventure.text.serializer.gson.GsonDataComponentValue
Type: Interface
Implements: net.kyori.adventure.text.event.DataComponentValue

Methods:
- GsonDataComponentValue gsonDataComponentValue(JsonElement)
- JsonElement element()

### Class: net.kyori.adventure.text.serializer.gson.LegacyHoverEventSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.json.LegacyHoverEventSerializer

No public methods found

## Package: net.kyori.adventure.text.serializer.gson.impl

### Class: net.kyori.adventure.text.serializer.gson.impl.GsonDataComponentValueConverterProvider
Type: Class
Implements: net.kyori.adventure.text.event.DataComponentValueConverterRegistry$Provider

Methods:
- Iterable conversions()
- Key id()

### Class: net.kyori.adventure.text.serializer.gson.impl.JSONComponentSerializerProviderImpl
Type: Class
Implements: net.kyori.adventure.text.serializer.json.JSONComponentSerializer$Provider, net.kyori.adventure.util.Services$Fallback

Methods:
- JSONComponentSerializer instance()
- Supplier builder()
- String toString()

## Package: net.kyori.adventure.text.serializer.gson.legacyimpl

### Class: net.kyori.adventure.text.serializer.gson.legacyimpl.NBTLegacyHoverEventSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.gson.LegacyHoverEventSerializer, net.kyori.adventure.text.serializer.json.legacyimpl.NBTLegacyHoverEventSerializer

Methods:
- LegacyHoverEventSerializer get()

## Package: net.kyori.adventure.text.serializer.json

### Class: net.kyori.adventure.text.serializer.json.JSONComponentSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- JSONComponentSerializer$Builder builder()
- JSONComponentSerializer json()

### Class: net.kyori.adventure.text.serializer.json.LegacyHoverEventSerializer
Type: Interface

Methods:
- HoverEvent$ShowItem deserializeShowItem(Component) throws IOException
- HoverEvent$ShowEntity deserializeShowEntity(Component, Codec$Decoder) throws IOException
- Component serializeShowEntity(HoverEvent$ShowEntity, Codec$Encoder) throws IOException
- Component serializeShowItem(HoverEvent$ShowItem) throws IOException

### Class: net.kyori.adventure.text.serializer.json.JSONComponentConstants
Type: Class

No public methods found

### Class: net.kyori.adventure.text.serializer.json.JSONOptions
Type: Class

Methods:
- OptionSchema schema()
- OptionState$Versioned byDataVersion()
- OptionState compatibility()

## Package: net.kyori.adventure.text.serializer.json.legacyimpl

### Class: net.kyori.adventure.text.serializer.json.legacyimpl.NBTLegacyHoverEventSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.json.LegacyHoverEventSerializer

Methods:
- LegacyHoverEventSerializer get()

## Package: net.kyori.adventure.text.serializer.legacy

### Class: net.kyori.adventure.text.serializer.legacy.CharacterAndFormat
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- char character()
- List defaults()
- TextFormat format()
- boolean caseInsensitive()
- CharacterAndFormat characterAndFormat(char, TextFormat)
- CharacterAndFormat characterAndFormat(char, TextFormat, boolean)
- Stream examinableProperties()

### Class: net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentSerializer, net.kyori.adventure.util.Buildable

Methods:
- String serialize(Component)
- Object serialize(Component)
- LegacyComponentSerializer legacy(char)
- LegacyComponentSerializer$Builder builder()
- LegacyFormat parseChar(char)
- LegacyComponentSerializer legacyAmpersand()
- LegacyComponentSerializer legacySection()
- TextComponent deserialize(String)
- Component deserialize(Object)

### Class: net.kyori.adventure.text.serializer.legacy.LegacyFormat
Type: Class
Implements: net.kyori.examination.Examinable

Methods:
- TextColor color()
- int hashCode()
- boolean equals(Object)
- boolean reset()
- Stream examinableProperties()
- TextDecoration decoration()

### Class: net.kyori.adventure.text.serializer.legacy.Reset
Type: Enum
Extends: java.lang.Enum
Implements: net.kyori.adventure.text.format.TextFormat

Methods:
- Reset valueOf(String)
- Reset[] values()

## Package: net.kyori.adventure.text.serializer.plain

### Class: net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentSerializer, net.kyori.adventure.util.Buildable

Methods:
- String serialize(Component)
- void serialize(StringBuilder, Component)
- Object serialize(Component)
- PlainTextComponentSerializer$Builder builder()
- PlainTextComponentSerializer plainText()
- TextComponent deserialize(String)
- Component deserialize(Object)

### Class: net.kyori.adventure.text.serializer.plain.PlainComponentSerializer
Type: Class
Implements: net.kyori.adventure.text.serializer.ComponentSerializer, net.kyori.adventure.util.Buildable

Methods:
- PlainComponentSerializer$Builder toBuilder()
- Buildable$Builder toBuilder()
- String serialize(Component)
- void serialize(StringBuilder, Component)
- Object serialize(Component)
- PlainComponentSerializer plain()
- PlainComponentSerializer$Builder builder()
- TextComponent deserialize(String)
- Component deserialize(Object)

## Package: net.kyori.adventure.title

### Class: net.kyori.adventure.title.Title
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- Title$Times times()
- Object part(TitlePart)
- Component subtitle()
- Title title(Component, Component)
- Title title(Component, Component, Title$Times)
- Component title()

### Class: net.kyori.adventure.title.TitlePart
Type: Interface

No public methods found

## Package: net.kyori.adventure.translation

### Class: net.kyori.adventure.translation.GlobalTranslator
Type: Interface
Implements: net.kyori.adventure.translation.Translator, net.kyori.examination.Examinable

Methods:
- TranslatableComponentRenderer renderer()
- boolean removeSource(Translator)
- boolean addSource(Translator)
- Iterable sources()
- GlobalTranslator get()
- GlobalTranslator translator()
- Component render(Component, Locale)

### Class: net.kyori.adventure.translation.Translatable
Type: Interface

Methods:
- String translationKey()

### Class: net.kyori.adventure.translation.TranslationRegistry
Type: Interface
Implements: net.kyori.adventure.translation.Translator, net.kyori.adventure.translation.TranslationStore$StringBased

Methods:
- void defaultLocale(Locale)
- boolean contains(String)
- void registerAll(Locale, Map)
- void registerAll(Locale, Path, boolean)
- void registerAll(Locale, ResourceBundle, boolean)
- void registerAll(Locale, Set, Function)
- void unregister(String)
- TranslationRegistry create(Key)
- MessageFormat translate(String, Locale)
- void register(String, Locale, MessageFormat)
- void register(String, Locale, Object)

### Class: net.kyori.adventure.translation.TranslationStore
Type: Interface
Implements: net.kyori.adventure.translation.Translator

Methods:
- void defaultLocale(Locale)
- boolean canTranslate(String, Locale)
- boolean contains(String)
- boolean contains(String, Locale)
- TranslationStore component(Key)
- TranslationStore$StringBased messageFormat(Key)
- void registerAll(Locale, Map)
- void registerAll(Locale, Set, Function)
- void unregister(String)
- void register(String, Locale, Object)

### Class: net.kyori.adventure.translation.Translator
Type: Interface

Methods:
- boolean canTranslate(String, Locale)
- Key name()
- TriState hasAnyTranslations()
- MessageFormat translate(String, Locale)
- Component translate(TranslatableComponent, Locale)
- Locale parseLocale(String)

### Class: net.kyori.adventure.translation.AbstractTranslationStore
Type: Abstract Class
Implements: net.kyori.examination.Examinable, net.kyori.adventure.translation.TranslationStore

Methods:
- void defaultLocale(Locale)
- boolean canTranslate(String, Locale)
- boolean contains(String)
- boolean contains(String, Locale)
- int hashCode()
- void registerAll(Locale, Map)
- void registerAll(Locale, Set, Function)
- boolean equals(Object)
- Key name()
- void unregister(String)
- String toString()
- Stream examinableProperties()
- TriState hasAnyTranslations()
- void register(String, Locale, Object)

## Package: net.kyori.adventure.util

### Class: net.kyori.adventure.util.ARGBLike
Type: Interface
Implements: net.kyori.adventure.util.RGBLike

Methods:
- int alpha()

### Class: net.kyori.adventure.util.Buildable
Type: Interface

Methods:
- Buildable$Builder toBuilder()
- Buildable configureAndBuild(Buildable$Builder, Consumer)

### Class: net.kyori.adventure.util.Codec
Type: Interface

Methods:
- Object encode(Object) throws Throwable
- Codec codec(Codec$Decoder, Codec$Encoder)
- Codec of(Codec$Decoder, Codec$Encoder)
- Object decode(Object) throws Throwable

### Class: net.kyori.adventure.util.ComponentMessageThrowable
Type: Interface

Methods:
- Component getMessage(Throwable)
- Component getOrConvertMessage(Throwable)
- Component componentMessage()

### Class: net.kyori.adventure.util.HSVLike
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- HSVLike fromRGB(int, int, int)
- float s()
- float v()
- HSVLike of(float, float, float)
- float h()
- HSVLike hsvLike(float, float, float)
- Stream examinableProperties()

### Class: net.kyori.adventure.util.InheritanceAwareMap
Type: Interface

Methods:
- InheritanceAwareMap with(Class, Object)
- boolean containsKey(Class)
- Object get(Class)
- InheritanceAwareMap$Builder builder()
- InheritanceAwareMap$Builder builder(InheritanceAwareMap)
- InheritanceAwareMap without(Class)
- InheritanceAwareMap empty()

### Class: net.kyori.adventure.util.IntFunction2
Type: Interface

Methods:
- Object apply(int, int)

### Class: net.kyori.adventure.util.PlatformAPI
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.kyori.adventure.util.RGBLike
Type: Interface

Methods:
- int red()
- int green()
- int blue()
- HSVLike asHSV()

### Class: net.kyori.adventure.util.Ticks
Type: Interface

Methods:
- Duration duration(long)

### Class: net.kyori.adventure.util.ForwardingIterator
Type: Class
Implements: java.lang.Iterable

Methods:
- Iterator iterator()
- Spliterator spliterator()

### Class: net.kyori.adventure.util.Index
Type: Class

Methods:
- Object keyOr(Object, Object)
- Object keyOrThrow(Object)
- Set keys()
- Set values()
- Map keyToValue()
- Index create(Class, Function)
- Index create(Class, Function, Enum[])
- Index create(Function, Object[])
- Index create(Function, List)
- Object valueOr(Object, Object)
- Object valueOrThrow(Object)
- Object value(Object)
- Object key(Object)
- Map valueToKey()

### Class: net.kyori.adventure.util.Listenable
Type: Abstract Class

No public methods found

### Class: net.kyori.adventure.util.MonkeyBars
Type: Class

Methods:
- List addOne(List, Object)
- List toUnmodifiableList(Function, Iterable)
- List nonEmptyArrayToList(Function, Object, Object[])
- Set enumSet(Class, Enum[])

### Class: net.kyori.adventure.util.Nag
Type: Abstract Class
Extends: java.lang.RuntimeException

Methods:
- void print(Nag)

### Class: net.kyori.adventure.util.Services
Type: Class

Methods:
- Optional serviceWithFallback(Class)
- Optional service(Class)
- Set services(Class)

### Class: net.kyori.adventure.util.ShadyPines
Type: Class

Methods:
- boolean equals(double, double)
- boolean equals(float, float)
- Set enumSet(Class, Enum[])

### Class: net.kyori.adventure.util.TriState
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean toBooleanOrElseGet(BooleanSupplier)
- TriState byBoolean(boolean)
- TriState byBoolean(Boolean)
- Boolean toBoolean()
- boolean toBooleanOrElse(boolean)
- TriState valueOf(String)
- TriState[] values()

### Class: net.kyori.adventure.util.UTF8ResourceBundleControl
Type: Class
Extends: java.util.ResourceBundle$Control

Methods:
- ResourceBundle$Control get()
- ResourceBundle newBundle(String, Locale, String, ClassLoader, boolean) throws IllegalAccessException, InstantiationException, IOException

## Package: net.kyori.ansi

### Class: net.kyori.ansi.ANSIComponentRenderer
Type: Interface

Methods:
- ANSIComponentRenderer pushStyle(Object)
- ANSIComponentRenderer$ToString toString(StyleOps)
- ANSIComponentRenderer$ToString toString(StyleOps, ColorLevel)
- ANSIComponentRenderer text(String)
- ANSIComponentRenderer$ToStringBuilder toStringBuilder(StyleOps)
- ANSIComponentRenderer$ToStringBuilder toStringBuilder(StyleOps, ColorLevel)
- ANSIComponentRenderer complete()
- ANSIComponentRenderer popStyle(Object)

### Class: net.kyori.ansi.StyleOps
Type: Interface

Methods:
- int color(Object)
- StyleOps$State underlined(Object)
- StyleOps$State italics(Object)
- StyleOps$State strikethrough(Object)
- StyleOps$State bold(Object)
- StyleOps$State obfuscated(Object)
- String font(Object)

### Class: net.kyori.ansi.ColorLevel
Type: Enum
Extends: java.lang.Enum

Methods:
- ColorLevel compute()
- String determineEscape(int)
- ColorLevel valueOf(String)
- ColorLevel[] values()

## Package: net.kyori.examination

### Class: net.kyori.examination.Examinable
Type: Interface

Methods:
- Object examine(Examiner)
- Stream examinableProperties()
- String examinableName()

### Class: net.kyori.examination.Examiner
Type: Interface

Methods:
- Object examine(Examinable)
- Object examine(String, Stream)
- Object examine(Object)
- Object examine(boolean)
- Object examine(boolean[])
- Object examine(byte)
- Object examine(byte[])
- Object examine(char)
- Object examine(char[])
- Object examine(double)
- Object examine(double[])
- Object examine(float)
- Object examine(float[])
- Object examine(int)
- Object examine(int[])
- Object examine(long)
- Object examine(long[])
- Object examine(short)
- Object examine(short[])
- Object examine(String)

### Class: net.kyori.examination.AbstractExaminer
Type: Abstract Class
Implements: net.kyori.examination.Examiner

Methods:
- Object examine(Object)
- Object examine(String, Stream)
- Object examine(boolean[])
- Object examine(byte[])
- Object examine(char[])
- Object examine(double[])
- Object examine(float[])
- Object examine(int[])
- Object examine(long[])
- Object examine(short[])

### Class: net.kyori.examination.ExaminableProperty
Type: Abstract Class

Methods:
- Object examine(Examiner)
- ExaminableProperty of(String, Object)
- ExaminableProperty of(String, String)
- ExaminableProperty of(String, boolean)
- ExaminableProperty of(String, boolean[])
- ExaminableProperty of(String, byte)
- ExaminableProperty of(String, byte[])
- ExaminableProperty of(String, char)
- ExaminableProperty of(String, char[])
- ExaminableProperty of(String, double)
- ExaminableProperty of(String, double[])
- ExaminableProperty of(String, float)
- ExaminableProperty of(String, float[])
- ExaminableProperty of(String, int)
- ExaminableProperty of(String, int[])
- ExaminableProperty of(String, long)
- ExaminableProperty of(String, long[])
- ExaminableProperty of(String, short)
- ExaminableProperty of(String, short[])
- String name()
- String toString()

## Package: net.kyori.examination.string

### Class: net.kyori.examination.string.MultiLineStringExaminer
Type: Class
Extends: net.kyori.examination.AbstractExaminer

Methods:
- Stream examine(boolean)
- Stream examine(byte)
- Stream examine(char)
- Stream examine(double)
- Stream examine(float)
- Stream examine(int)
- Stream examine(long)
- Stream examine(short)
- Stream examine(String)
- Object examine(String)
- Object examine(short)
- Object examine(long)
- Object examine(int)
- Object examine(float)
- Object examine(double)
- Object examine(char)
- Object examine(byte)
- Object examine(boolean)
- MultiLineStringExaminer simpleEscaping()

### Class: net.kyori.examination.string.StringExaminer
Type: Class
Extends: net.kyori.examination.AbstractExaminer

Methods:
- String examine(boolean)
- String examine(byte)
- String examine(char)
- String examine(double)
- String examine(float)
- String examine(int)
- String examine(long)
- String examine(short)
- String examine(String)
- Object examine(String)
- Object examine(short)
- Object examine(long)
- Object examine(int)
- Object examine(float)
- Object examine(double)
- Object examine(char)
- Object examine(byte)
- Object examine(boolean)
- StringExaminer simpleEscaping()

## Package: net.kyori.option

### Class: net.kyori.option.Option
Type: Interface

Methods:
- Object defaultValue()
- ValueType valueType()
- Option enumOption(String, Class, Enum)
- String id()
- Class type()
- Option booleanOption(String, boolean)

### Class: net.kyori.option.OptionSchema
Type: Interface

Methods:
- OptionState emptyState()
- OptionSchema$Mutable childSchema(OptionSchema)
- OptionState$VersionedBuilder versionedStateBuilder()
- Set knownOptions()
- boolean has(Option)
- OptionSchema$Mutable globalSchema()
- OptionState$Builder stateBuilder()
- OptionSchema$Mutable emptySchema()

### Class: net.kyori.option.OptionState
Type: Interface

Methods:
- OptionSchema schema()
- OptionState$Builder optionState()
- OptionState emptyOptionState()
- OptionState$VersionedBuilder versionedOptionState()
- boolean has(Option)
- Object value(Option)

## Package: net.kyori.option.value

### Class: net.kyori.option.value.ValueSource
Type: Interface

Methods:
- ValueSource systemProperty()
- ValueSource systemProperty(String)
- Object value(Option)
- ValueSource environmentVariable()
- ValueSource environmentVariable(String)

### Class: net.kyori.option.value.ValueType
Type: Interface

Methods:
- ValueType doubleType()
- ValueType booleanType()
- ValueType integerType()
- ValueType stringType()
- ValueType enumType(Class)
- Object parse(String) throws IllegalArgumentException
- Class type()

## Package: org.intellij.lang.annotations

### Class: org.intellij.lang.annotations.Flow
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean targetIsContainer()
- String source()
- String target()
- boolean sourceIsContainer()

### Class: org.intellij.lang.annotations.Identifier
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.intellij.lang.annotations.Language
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String prefix()
- String suffix()
- String value()

### Class: org.intellij.lang.annotations.MagicConstant
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- long[] intValues()
- String[] stringValues()
- Class valuesFromClass()
- long[] flags()
- Class flagsFromClass()

### Class: org.intellij.lang.annotations.Pattern
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: org.intellij.lang.annotations.PrintFormat
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.intellij.lang.annotations.RegExp
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String prefix()
- String suffix()

### Class: org.intellij.lang.annotations.Subst
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: org.intellij.lang.annotations.JdkConstants
Type: Class

No public methods found

## Package: org.jetbrains.annotations

### Class: org.jetbrains.annotations.Blocking
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.jetbrains.annotations.BlockingExecutor
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.jetbrains.annotations.CheckReturnValue
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.jetbrains.annotations.Contract
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String mutates()
- boolean pure()
- String value()

### Class: org.jetbrains.annotations.MustBeInvokedByOverriders
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.jetbrains.annotations.Nls
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Nls$Capitalization capitalization()

### Class: org.jetbrains.annotations.NonBlocking
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.jetbrains.annotations.NonBlockingExecutor
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.jetbrains.annotations.NonNls
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.jetbrains.annotations.NotNull
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class exception()
- String value()

### Class: org.jetbrains.annotations.Nullable
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: org.jetbrains.annotations.PropertyKey
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String resourceBundle()

### Class: org.jetbrains.annotations.Range
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- long from()
- long to()

### Class: org.jetbrains.annotations.TestOnly
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.jetbrains.annotations.UnknownNullability
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: org.jetbrains.annotations.Unmodifiable
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.jetbrains.annotations.UnmodifiableView
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.jetbrains.annotations.VisibleForTesting
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.jetbrains.annotations.ApiStatus
Type: Class

No public methods found

### Class: org.jetbrains.annotations.Async
Type: Class

No public methods found

### Class: org.jetbrains.annotations.Debug
Type: Class

No public methods found

## Package: org.json.simple

### Class: org.json.simple.JSONAware
Type: Interface

Methods:
- String toJSONString()

### Class: org.json.simple.JSONStreamAware
Type: Interface

Methods:
- void writeJSONString(Writer) throws IOException

### Class: org.json.simple.ItemList
Type: Class

Methods:
- void add(int, String)
- void add(String)
- List getItems()
- void split(String, String, List, boolean)
- void split(String, String, List)
- int size()
- void addAll(ItemList)
- void addAll(String)
- void addAll(String, String)
- void addAll(String, String, boolean)
- String get(int)
- void clear()
- void reset()
- String[] getArray()
- String toString()
- String toString(String)
- void setSP(String)

### Class: org.json.simple.JSONArray
Type: Class
Extends: java.util.ArrayList
Implements: java.util.List, org.json.simple.JSONAware, org.json.simple.JSONStreamAware

Methods:
- String toJSONString(List)
- String toJSONString()
- void writeJSONString(List, Writer) throws IOException
- void writeJSONString(Writer) throws IOException
- String toString()

### Class: org.json.simple.JSONObject
Type: Class
Extends: java.util.HashMap
Implements: java.util.Map, org.json.simple.JSONAware, org.json.simple.JSONStreamAware

Methods:
- String toJSONString(Map)
- String toJSONString()
- void writeJSONString(Map, Writer) throws IOException
- void writeJSONString(Writer) throws IOException
- String toString()
- String toString(String, Object)
- String escape(String)

### Class: org.json.simple.JSONValue
Type: Class

Methods:
- String toJSONString(Object)
- Object parseWithException(Reader) throws IOException, ParseException
- Object parseWithException(String) throws ParseException
- void writeJSONString(Object, Writer) throws IOException
- Object parse(Reader)
- Object parse(String)
- String escape(String)

## Package: org.json.simple.parser

### Class: org.json.simple.parser.ContainerFactory
Type: Interface

Methods:
- List creatArrayContainer()
- Map createObjectContainer()

### Class: org.json.simple.parser.ContentHandler
Type: Interface

Methods:
- boolean startObject() throws ParseException, IOException
- boolean endObjectEntry() throws ParseException, IOException
- boolean startArray() throws ParseException, IOException
- boolean primitive(Object) throws ParseException, IOException
- void startJSON() throws ParseException, IOException
- boolean endArray() throws ParseException, IOException
- boolean startObjectEntry(String) throws ParseException, IOException
- void endJSON() throws ParseException, IOException
- boolean endObject() throws ParseException, IOException

### Class: org.json.simple.parser.JSONParser
Type: Class

Methods:
- int getPosition()
- void reset()
- void reset(Reader)
- Object parse(String) throws ParseException
- Object parse(String, ContainerFactory) throws ParseException
- Object parse(Reader) throws IOException, ParseException
- Object parse(Reader, ContainerFactory) throws IOException, ParseException
- void parse(String, ContentHandler) throws ParseException
- void parse(String, ContentHandler, boolean) throws ParseException
- void parse(Reader, ContentHandler) throws IOException, ParseException
- void parse(Reader, ContentHandler, boolean) throws IOException, ParseException

### Class: org.json.simple.parser.ParseException
Type: Class
Extends: java.lang.Exception

Methods:
- int getPosition()
- void setErrorType(int)
- String toString()
- void setUnexpectedObject(Object)
- Object getUnexpectedObject()
- void setPosition(int)
- int getErrorType()

### Class: org.json.simple.parser.Yytoken
Type: Class

Methods:
- String toString()

## Package: org.slf4j.jul

### Class: org.slf4j.jul.JDK14LoggerAdapter
Type: Class
Extends: org.slf4j.helpers.LegacyAbstractLogger
Implements: org.slf4j.spi.LocationAwareLogger

Methods:
- void log(Marker, String, int, String, Object[], Throwable)
- void log(LoggingEvent)
- boolean isInfoEnabled()
- boolean isErrorEnabled()
- boolean isTraceEnabled()
- boolean isWarnEnabled()
- boolean isDebugEnabled()

### Class: org.slf4j.jul.JDK14LoggerFactory
Type: Class
Implements: org.slf4j.ILoggerFactory

Methods:
- Logger getLogger(String)

### Class: org.slf4j.jul.JULServiceProvider
Type: Class
Implements: org.slf4j.spi.SLF4JServiceProvider

Methods:
- ILoggerFactory getLoggerFactory()
- IMarkerFactory getMarkerFactory()
- String getRequestedApiVersion()
- void initialize()
- MDCAdapter getMDCAdapter()

