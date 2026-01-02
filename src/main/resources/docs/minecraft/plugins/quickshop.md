# QuickShop-Hikari-6.2.0.10 (1)-com-ghostchu-quickshop-api API Reference

**Package Filter:** `com.ghostchu.quickshop.api`

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
- **static** Plugin getPluginInstance()
- boolean isDisplayEnabled()
- void logEvent(Object)
- ShopControlPanelManager getShopControlPanelManager()
- DatabaseHelper getDatabaseHelper()
- Map<String, Integer> getLimits()
- InventoryWrapperRegistry getInventoryWrapperRegistry()
- ShopManager getShopManager()
- RankLimiter getRankLimiter()
- boolean isLimit()
- CommandManager getCommandManager()
- **static** QuickShopAPI getInstance()
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
- Map<String, Integer> getLimits()
- int getShopLimit(QUser)
- boolean isLimit()

### Class: com.ghostchu.quickshop.api.CommonUtil
Type: Class

Methods:
- **static** boolean isEmptyComponent(Component component)

### Class: com.ghostchu.quickshop.api.GameVersion
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- v1_18_R1
- v1_18_R2
- v1_19_R1
- v1_19_R2
- v1_19_R3
- v1_20_R1
- v1_20_R2
- v1_20_R3
- v1_20_R4
- v1_21_R1
- v1_21_R2
- v1_21_R3
- v1_21_R4
- v1_21_R5
- v1_21_R6
- UNKNOWN

Methods:
- boolean isVirtualDisplaySupports()
- **static** GameVersion valueOf(String name)
- boolean isNewPotionAPI()
- **static** GameVersion get(String nmsVersion)
- **static** GameVersion[] values()
- boolean isEndOfLife()
- boolean isCoreSupports()
- boolean isNewNmsName()
- String[] getMcVersion()

### Class: com.ghostchu.quickshop.api.QuickShopInstanceHolder
Type: Class

Constructors:
- QuickShopInstanceHolder(Plugin plugin)

No public methods found

## Package: com.ghostchu.quickshop.api.command

### Class: com.ghostchu.quickshop.api.command.CommandHandler
Type: Interface

Methods:
- CompletableFuture<List<Shop>> getTaggedShops(T sender, T tag)
- Map<Long, Shop> getShopsByIds(List<Long> ids)
- V onCommand(T sender, T commandLabel, ; parser)
- V onCommand(T sender, T commandLabel, ; cmdArgs)
- List<String> onTabComplete(T sender, T commandLabel, ; parser)
- List<String> onTabComplete(T sender, T commandLabel, ; cmdArgs)
- List<String> onTabComplete_Internal(T sender, T commandLabel, ; cmdArg)
- Shop getLookingShop(T sender) throws IllegalStateException
- V onCommand_Internal(T sender, T commandLabel, ; cmdArg)

### Class: com.ghostchu.quickshop.api.command.CommandManager
Type: Interface

Methods:
- void unregisterCmd(String)
- void unregisterCmd(CommandContainer)
- boolean onCommand(CommandSender, Command, String, String[])
- List<String> onTabComplete(CommandSender, Command, String, String)
- List<CommandContainer> getRegisteredCommands()
- void registerCmd(CommandContainer)

### Class: com.ghostchu.quickshop.api.command.CommandProcesser
Type: Interface
Implements: com.ghostchu.quickshop.api.command.CommandHandler

Methods:
- void onCommand(CommandSender, String, String[])
- List<String> onTabComplete(CommandSender sender, String commandLabel, String cmdArg)

### Class: com.ghostchu.quickshop.api.command.CommandContainer
Type: Class

Methods:
- void setDisabled(boolean disabled)
- V setDescription(Function<String, Component> description)
- V setPermissions(List<String> permissions)
- V setExecutor(CommandHandler<*> executor)
- Function<String, Component> getDescription()
- Function<CommandSender, Component> getDisableCallback()
- V setSelectivePermissions(List<String> selectivePermissions)
- int hashCode()
- void setHidden(boolean hidden)
- V setDisabledSupplier(Supplier<Boolean> disabledSupplier)
- **static** CommandContainer$CommandContainerBuilder builder()
- boolean isDisabled()
- V setDisablePlaceholder(Supplier<Component> disablePlaceholder)
- Supplier<Boolean> getDisabledSupplier()
- void bakeExecutorType()
- Class<*> getExecutorType()
- String getPrefix()
- V setDisableCallback(Function<CommandSender, Component> disableCallback)
- Supplier<Component> getDisablePlaceholder()
- V setExecutorType(Class<*> executorType)
- List<String> getPermissions()
- CommandHandler<*> getExecutor()
- boolean isHidden()
- List<String> getSelectivePermissions()
- void setPrefix(String prefix)
- boolean equals(Object o)
- String toString()
- Component getDisableText(CommandSender sender)

### Class: com.ghostchu.quickshop.api.command.CommandContainer$CommandContainerBuilder
Type: Class

Methods:
- CommandContainer$CommandContainerBuilder disabledSupplier(Supplier<Boolean> disabledSupplier)
- CommandContainer$CommandContainerBuilder clearPermissions()
- CommandContainer$CommandContainerBuilder executorType(Class<*> executorType)
- CommandContainer$CommandContainerBuilder disablePlaceholder(Supplier<Component> disablePlaceholder)
- CommandContainer$CommandContainerBuilder clearSelectivePermissions()
- CommandContainer$CommandContainerBuilder hidden(boolean hidden)
- CommandContainer$CommandContainerBuilder prefix(String prefix)
- CommandContainer$CommandContainerBuilder selectivePermissions(Collection<String> selectivePermissions)
- CommandContainer$CommandContainerBuilder description(Function<String, Component> description)
- CommandContainer$CommandContainerBuilder permission(String permission)
- CommandContainer$CommandContainerBuilder selectivePermission(String selectivePermission)
- CommandContainer build()
- CommandContainer$CommandContainerBuilder permissions(Collection<String> permissions)
- CommandContainer$CommandContainerBuilder executor(CommandHandler<*> executor)
- String toString()
- CommandContainer$CommandContainerBuilder disableCallback(Function<CommandSender, Component> disableCallback)
- CommandContainer$CommandContainerBuilder disabled(boolean disabled)

### Class: com.ghostchu.quickshop.api.command.CommandParser
Type: Class

Constructors:
- CommandParser(String raw, boolean trimTail)

Methods:
- Map<String, List<String>> getColonArgs()
- String getRaw()
- List<String> getArgs()

## Package: com.ghostchu.quickshop.api.database

### Class: com.ghostchu.quickshop.api.database.DatabaseHelper
Type: Interface

Methods:
- SQLQuery selectTable(String) throws SQLException
- CompletableFuture<Void> updateShop(Shop)
- CompletableFuture<Integer> cleanMessageForPlayer(UUID)
- CompletableFuture<Integer> cleanMessage(long)
- CompletableFuture<Integer> insertHistoryRecord(Object)
- CompletableFuture<Long> locateShopDataId(long)
- CompletableFuture<Integer> saveOfflineTransactionMessage(UUID, String, long)
- CompletableFuture<Long> createShop(long)
- CompletableFuture<Integer> updateExternalInventoryProfileCache(long, int, int)
- CompletableFuture<Long> createData(Shop)
- CompletableFuture<Integer> removeShopMap(String, int, int, int)
- CompletableFuture<Integer> removeShopTag(UUID, Long, String)
- CompletableFuture<Integer> removeShopAllTag(UUID, Long)
- CompletableFuture<Integer> tagShop(UUID, Long, String)
- CompletableFuture<DataRecord> getDataRecord(long)
- CompletableFuture<Integer> removeShop(long)
- SQLQuery selectAllMessages() throws SQLException
- List<String> listTags(UUID)
- CompletableFuture<ShopInventoryCountCache> queryInventoryCache(long)
- List<ShopRecord> listShops(boolean)
- List<ShopRecord> listShops(String, boolean)
- CompletableFuture<Integer> removeTagFromShops(UUID, String)
- CompletableFuture<String> getPlayerName(UUID)
- CompletableFuture<Integer> updatePlayerProfile(UUID, String, String)
- CompletableFuture<Integer> updatePlayerProfileInBatch(List<Triple<UUID, String, String>>)
- CompletableFuture<Void> createShopMap(long, Location)
- CompletableFuture<List<String>> selectPlayerMessages(UUID)
- List<Long> listShopsTaggedBy(UUID, String)
- CompletableFuture<String> getPlayerLocale(UUID)
- CompletableFuture<String> getPlayerLocale(QUser)
- void insertTransactionRecord(UUID, UUID, double, String, double, UUID, String)
- CompletableFuture<Integer> removeData(long)
- CompletableFuture<Integer> insertMetricRecord(ShopMetricRecord)
- CompletableFuture<Long> locateShopId(String, int, int, int)
- CompletableFuture<UUID> getPlayerUUID(String)

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

Constructors:
- ShopMetricRecord(long time, long shopId, ShopOperationEnum type, double total, double tax, int amount, QUser player)

Methods:
- void setTotal(double total)
- String getPlayer()
- void setShopId(long shopId)
- long getShopId()
- long getTime()
- void setPlayer(String player)
- void setTax(double tax)
- void setType(ShopOperationEnum type)
- long getV()
- ShopOperationEnum getType()
- int hashCode()
- boolean equals(Object o)
- **static** ShopMetricRecord$ShopMetricRecordBuilder builder()
- String toString()
- double getTotal()
- void setAmount(int amount)
- double getTax()
- void setTime(long time)
- int getAmount()

### Class: com.ghostchu.quickshop.api.database.ShopMetricRecord$ShopMetricRecordBuilder
Type: Class

Methods:
- ShopMetricRecord$ShopMetricRecordBuilder amount(int amount)
- ShopMetricRecord$ShopMetricRecordBuilder total(double total)
- ShopMetricRecord build()
- String toString()
- ShopMetricRecord$ShopMetricRecordBuilder tax(double tax)
- ShopMetricRecord$ShopMetricRecordBuilder shopId(long shopId)
- ShopMetricRecord$ShopMetricRecordBuilder time(long time)
- ShopMetricRecord$ShopMetricRecordBuilder type(ShopOperationEnum type)
- ShopMetricRecord$ShopMetricRecordBuilder player(QUser player)

### Class: com.ghostchu.quickshop.api.database.ShopOperationEnum
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PURCHASE
- PURCHASE_SELLING_SHOP
- PURCHASE_BUYING_SHOP
- CREATE
- DELETE
- ONGOING_FEE
- FROZEN

Methods:
- **static** ShopOperationEnum valueOf(String name)
- **static** ShopOperationEnum[] values()

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

Constructors:
- ShopRecord(DataRecord dataRecord, InfoRecord infoRecord)

Methods:
- void setInfoRecord(InfoRecord infoRecord)
- int hashCode()
- boolean equals(Object o)
- String toString()
- InfoRecord getInfoRecord()
- void setDataRecord(DataRecord dataRecord)
- DataRecord getDataRecord()

## Package: com.ghostchu.quickshop.api.economy

### Class: com.ghostchu.quickshop.api.economy.Benefit
Type: Interface

Methods:
- String serialize()
- void addBenefit(QUser, double) throws Benefit$BenefitOverflowException, Benefit$BenefitExistsException
- double getOverflow(double)
- Map<QUser, Double> getRegistry()
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
- Deque<Operation> getProcessingStack()
- void setAmount(double)
- boolean checkBalance()
- QUser getFrom()
- double getAmount()
- List<Operation> rollback(boolean)
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

### Class: com.ghostchu.quickshop.api.economy.EconomyTransaction$TransactionCallback
Type: Interface

Methods:
- boolean onCommit(EconomyTransaction economyTransaction)
- void onFailed(EconomyTransaction economyTransaction)
- void onTaxFailed(EconomyTransaction economyTransaction)
- void onSuccess(EconomyTransaction economyTransaction)

### Class: com.ghostchu.quickshop.api.economy.AbstractEconomy
Type: Abstract Class
Implements: com.ghostchu.quickshop.api.economy.EconomyCore, com.ghostchu.simplereloadlib.Reloadable

Methods:
- boolean transfer(QUser from, QUser to, double amount, World, String world)
- double getBalance(QUser, World, String)
- String getName()
- String getProviderName()
- boolean deposit(QUser, double, World, String)
- String toString()
- ReloadResult reloadModule()
- boolean withdraw(QUser, double, World, String)

### Class: com.ghostchu.quickshop.api.economy.Benefit$BenefitExistsException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.ghostchu.quickshop.api.economy.Benefit$BenefitOverflowException
Type: Class
Extends: java.lang.Exception

Constructors:
- Benefit$BenefitOverflowException(double overflow)

Methods:
- double getOverflow()

### Class: com.ghostchu.quickshop.api.economy.EconomyType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UNKNOWN
- VAULT
- RESERVE
- GEMS_ECONOMY
- TNE
- COINS_ENGINE
- TREASURY

Methods:
- **static** int toID(EconomyType economyType)
- int toID()
- **static** EconomyType valueOf(String name)
- **static** EconomyType[] values()
- **static** EconomyType fromID(int id)

### Class: com.ghostchu.quickshop.api.economy.NonSeparateAbstractEconomy
Type: Abstract Class
Extends: com.ghostchu.quickshop.api.economy.AbstractEconomy

Methods:
- boolean transfer(UUID from, UUID to, double amount, World, String world)
- boolean transfer(String from, String to, double amount, World, String world)
- double getBalance(QUser qUser, World world, String currency)
- double getBalance(String, World, String)
- double getBalance(UUID, World, String)
- double getBalance(OfflinePlayer, World, String)
- boolean deposit(QUser qUser, double amount, World, String world)
- boolean deposit(String, double, World, String)
- boolean deposit(UUID, double, World, String)
- boolean deposit(OfflinePlayer, double, World, String)
- boolean withdraw(QUser qUser, double amount, World, String world)
- boolean withdraw(String, double, World, String)
- boolean withdraw(UUID, double, World, String)
- boolean withdraw(OfflinePlayer, double, World, String)

## Package: com.ghostchu.quickshop.api.economy.operation

### Class: com.ghostchu.quickshop.api.economy.operation.DepositEconomyOperation
Type: Class
Implements: com.ghostchu.quickshop.api.operation.Operation

Constructors:
- DepositEconomyOperation(QUser account, double amount, World world, String currency, EconomyCore economyCore)

Methods:
- boolean rollback()
- boolean isRollback()
- boolean commit()
- boolean isCommitted()

### Class: com.ghostchu.quickshop.api.economy.operation.WithdrawEconomyOperation
Type: Class
Implements: com.ghostchu.quickshop.api.operation.Operation

Constructors:
- WithdrawEconomyOperation(QUser account, double amount, World world, String currency, EconomyCore economyCore)

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
- void setCancelled(boolean cancel, String reason) throws IllegalStateException
- void setCancelled(boolean, Component) throws IllegalStateException
- void setCancelled(boolean cancel) throws IllegalStateException

### Class: com.ghostchu.quickshop.api.event.AbstractQSEvent
Type: Abstract Class
Extends: org.bukkit.event.Event

Methods:
- boolean callCancellableEvent()
- void callEvent()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: com.ghostchu.quickshop.api.event.CalendarEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- CalendarEvent(CalendarEvent$CalendarTriggerType calendarTriggerType)

Methods:
- CalendarEvent$CalendarTriggerType getCalendarTriggerType()
- void setCalendarTriggerType(CalendarEvent$CalendarTriggerType calendarTriggerType)
- int hashCode()
- boolean equals(Object o)
- String toString()

### Class: com.ghostchu.quickshop.api.event.CalendarEvent$CalendarTriggerType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NOTHING_CHANGED
- SECOND
- MINUTE
- HOUR
- DAY
- WEEK
- MONTH
- YEAR

Methods:
- **static** CalendarEvent$CalendarTriggerType valueOf(String name)
- **static** CalendarEvent$CalendarTriggerType[] values()

### Class: com.ghostchu.quickshop.api.event.Phase
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PRE
- PRE_CANCELLABLE
- MAIN
- POST
- RETRIEVE

Methods:
- **static** Phase valueOf(String name)
- **static** Phase[] values()
- boolean allowUpdate()
- boolean cancellable()

### Class: com.ghostchu.quickshop.api.event.PhasedEvent
Type: Abstract Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Constructors:
- PhasedEvent(boolean cancelReason)
- PhasedEvent(Phase phase)
- PhasedEvent(Phase phase, boolean cancelReason)

Methods:
- Component getCancelReason()
- Phase phase()
- boolean isCancelled()
- boolean isPhase(Phase phase)
- void setCancelled(boolean cancel, Component reason) throws IllegalStateException
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.QSConfigurationReloadEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- QSConfigurationReloadEvent(Plugin instance)

Methods:
- Plugin getInstance()

### Class: com.ghostchu.quickshop.api.event.QSHandleChatEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- QSHandleChatEvent(QUser sender, String message)

Methods:
- int hashCode()
- boolean equals(Object o)
- String getMessage()
- String toString()
- QUser getSender()
- void setMessage(String message)

## Package: com.ghostchu.quickshop.api.event.display

### Class: com.ghostchu.quickshop.api.event.display.DisplayApplicableCheckEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- DisplayApplicableCheckEvent(Shop shop, UUID player)

Methods:
- UUID getPlayer()
- boolean isApplicable()
- Shop getShop()
- void setApplicable(boolean applicable)

### Class: com.ghostchu.quickshop.api.event.display.ItemPreviewComponentPopulateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- ItemPreviewComponentPopulateEvent(Component component, Player player)

Methods:
- Player getPlayer()
- void setComponent(Component component)
- Component getComponent()

### Class: com.ghostchu.quickshop.api.event.display.ItemPreviewComponentPrePopulateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- ItemPreviewComponentPrePopulateEvent(ItemStack itemStack, Player player)

Methods:
- Player getPlayer()
- void setItemStack(ItemStack itemStack)
- ItemStack getItemStack()

### Class: com.ghostchu.quickshop.api.event.display.ShopDisplayItemSpawnEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Constructors:
- ShopDisplayItemSpawnEvent(Shop shop, ItemStack itemStack, DisplayType displayType)

Methods:
- Component getCancelReason()
- boolean isCancelled()
- DisplayType getDisplayType()
- void setCancelled(boolean cancel, Component reason)
- Shop getShop()
- ItemStack getItemStack()

## Package: com.ghostchu.quickshop.api.event.economy

### Class: com.ghostchu.quickshop.api.event.economy.EconomyTransactionEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- EconomyTransactionEvent(EconomyTransaction transaction)

Methods:
- EconomyTransaction getTransaction()

### Class: com.ghostchu.quickshop.api.event.economy.ShopPurchaseEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Constructors:
- ShopPurchaseEvent(Shop shop, QUser purchaser, InventoryWrapper purchaserInventory, int amount, double total)

Methods:
- void setTotal(double total)
- Component getCancelReason()
- boolean isCancelled()
- void setCancelled(boolean cancel, Component reason)
- Shop getShop()
- double getTotal()
- QUser getPurchaser()
- InventoryWrapper getPurchaserInventory()
- int getAmount()

### Class: com.ghostchu.quickshop.api.event.economy.ShopSuccessPurchaseEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- ShopSuccessPurchaseEvent(Shop shop, QUser purchaser, InventoryWrapper purchaserInventory, int amount, double total, double tax)

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

Constructors:
- ShopTaxEvent(Shop shop, double tax, QUser user)

Methods:
- QUser getUser()
- Shop getShop()
- void setTax(double tax)
- double getTax()

## Package: com.ghostchu.quickshop.api.event.general

### Class: com.ghostchu.quickshop.api.event.general.ProtectionCheckStatus
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BEGIN
- END

Methods:
- **static** ProtectionCheckStatus valueOf(String name)
- **static** ProtectionCheckStatus[] values()

### Class: com.ghostchu.quickshop.api.event.general.ShopControlPanelOpenEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Constructors:
- ShopControlPanelOpenEvent(Shop shop, CommandSender sender)

Methods:
- Component getCancelReason()
- boolean isCancelled()
- void setCancelled(boolean cancel, Component reason)
- Shop getShop()
- CommandSender getSender()

### Class: com.ghostchu.quickshop.api.event.general.ShopHistoryGuiOpenEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- ShopHistoryGuiOpenEvent(List<Shop> shops, Player player, Inventory inventory)

Methods:
- Player getPlayer()
- List<Shop> getShops()
- Inventory getInventory()

### Class: com.ghostchu.quickshop.api.event.general.ShopInfoPanelEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Constructors:
- ShopInfoPanelEvent(Shop shop, UUID purchaser)

Methods:
- Component getCancelReason()
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean cancel, Component reason)
- Shop getShop()
- UUID getPurchaser()

### Class: com.ghostchu.quickshop.api.event.general.ShopItemMatchEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- ShopItemMatchEvent(ItemStack original, ItemStack comparison)

Methods:
- ItemStack original()
- ItemStack comparison()
- boolean matches()
- void matches(boolean matches)

### Class: com.ghostchu.quickshop.api.event.general.ShopOngoingFeeEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Constructors:
- ShopOngoingFeeEvent(Shop shop, QUser player, double cost)

Methods:
- Component getCancelReason()
- boolean isCancelled()
- QUser getPlayer()
- void setCancelled(boolean cancel, Component reason)
- void setCost(double cost)
- Shop getShop()
- double getCost()

### Class: com.ghostchu.quickshop.api.event.general.ShopProtectionCheckEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- ShopProtectionCheckEvent(Location loc, QUser player, ProtectionCheckStatus status, Event event)

Methods:
- Event getEvent()
- QUser getPlayer()
- Location getLocation()
- ProtectionCheckStatus getStatus()

### Class: com.ghostchu.quickshop.api.event.general.ShopSignUpdateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- ShopSignUpdateEvent(Shop shop, Sign sign)

Methods:
- Sign getSign()
- Shop getShop()

## Package: com.ghostchu.quickshop.api.event.inventory

### Class: com.ghostchu.quickshop.api.event.inventory.InventoryTransactionEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- InventoryTransactionEvent(InventoryTransaction transaction)

Methods:
- InventoryTransaction getTransaction()

### Class: com.ghostchu.quickshop.api.event.inventory.ShopInventoryCalculateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- ShopInventoryCalculateEvent(Shop shop, int space, int stock)

Methods:
- int hashCode()
- int getSpace()
- boolean equals(Object o)
- int getStock()
- Shop getShop()
- String toString()

### Class: com.ghostchu.quickshop.api.event.inventory.ShopInventoryChangedEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- ShopInventoryChangedEvent(InventoryWrapper wrapper, InventoryWrapperManager manager)

Methods:
- InventoryWrapperManager getInventoryManager()
- InventoryWrapper getInventoryWrapper()

### Class: com.ghostchu.quickshop.api.event.inventory.ShopInventoryPreviewEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Constructors:
- ShopInventoryPreviewEvent(Player player, ItemStack itemStack)

Methods:
- Component getCancelReason()
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean cancel, Component reason)
- ItemStack getItemStack()

## Package: com.ghostchu.quickshop.api.event.management

### Class: com.ghostchu.quickshop.api.event.management.ShopClickEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Constructors:
- ShopClickEvent(Shop shop, QUser user)
- ShopClickEvent(Phase phase, Shop shop, QUser user)

Methods:
- ShopClickEvent clone(Phase newPhase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)
- QUser user()

### Class: com.ghostchu.quickshop.api.event.management.ShopCreateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Constructors:
- ShopCreateEvent(Shop shop, QUser user, Location location)
- ShopCreateEvent(Phase phase, Shop shop, QUser user, Location location)

Methods:
- ShopCreateEvent clone(Phase newPhase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)
- Location location()
- QUser user()

### Class: com.ghostchu.quickshop.api.event.management.ShopDatabaseEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Constructors:
- ShopDatabaseEvent(Shop shop)
- ShopDatabaseEvent(Phase phase, Shop shop)

Methods:
- ShopDatabaseEvent clone(Phase newPhase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.management.ShopDeleteEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Constructors:
- ShopDeleteEvent(Shop shop, boolean memory)
- ShopDeleteEvent(Phase phase, Shop shop, boolean memory)

Methods:
- boolean memory()
- ShopDeleteEvent clone(Phase newPhase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.management.ShopEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.PhasedEvent

Constructors:
- ShopEvent(Shop shop)
- ShopEvent(Phase phase, Shop shop)

Methods:
- Optional<Shop> shop()
- ShopEvent clone(Phase newPhase)
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.management.ShopLoadEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Constructors:
- ShopLoadEvent(Shop shop)
- ShopLoadEvent(Phase phase, Shop shop)

Methods:
- ShopLoadEvent clone(Phase newPhase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.management.ShopPermissionCheckEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Constructors:
- ShopPermissionCheckEvent(Shop shop, UUID playerUUID, String pluginNamespace, String permissionNode, boolean hasPermission)
- ShopPermissionCheckEvent(Phase phase, Shop shop, UUID playerUUID, String pluginNamespace, String permissionNode, boolean hasPermission)

Methods:
- UUID playerUUID()
- String permissionNode()
- String pluginNamespace()
- boolean hasPermission()
- void hasPermission(boolean hasPermission)
- ShopPermissionCheckEvent clone(Phase newPhase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)

### Class: com.ghostchu.quickshop.api.event.management.ShopUnloadEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.management.ShopEvent

Constructors:
- ShopUnloadEvent(Shop shop)
- ShopUnloadEvent(Phase phase, Shop shop)

Methods:
- ShopUnloadEvent clone(Phase newPhase)
- ShopEvent clone(Phase)
- PhasedEvent clone(Phase)

## Package: com.ghostchu.quickshop.api.event.packet

### Class: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent
Type: Abstract Class
Extends: com.ghostchu.quickshop.api.event.AbstractQSEvent

Constructors:
- PacketHandlerEvent(PacketHandler<*> packetHandler)

Methods:
- PacketHandler<*> packetHandler()

## Package: com.ghostchu.quickshop.api.event.packet.handler

### Class: com.ghostchu.quickshop.api.event.packet.handler.PacketHandlerAddedEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Constructors:
- PacketHandlerAddedEvent(PacketHandler<*> packetHandler)

Methods:
- Component getCancelReason()
- boolean isCancelled()
- void setCancelled(boolean cancel, Component reason)

### Class: com.ghostchu.quickshop.api.event.packet.handler.PacketHandlerInitEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Constructors:
- PacketHandlerInitEvent(PacketHandler<*> packetHandler)

Methods:
- Component getCancelReason()
- boolean isCancelled()
- void setCancelled(boolean cancel, Component reason)

## Package: com.ghostchu.quickshop.api.event.packet.send

### Class: com.ghostchu.quickshop.api.event.packet.send.PacketHandlerSendDestroyEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent

Constructors:
- PacketHandlerSendDestroyEvent(PacketHandler<*> packetHandler, PacketFactory<TT> packetFactory, T destroyPacket)

Methods:
- PacketFactory<TT> packetFactory()
- V packetFactory(PacketFactory<TT> packetFactory)
- TT destroyPacket()
- V destroyPacket(T destroyPacket)

### Class: com.ghostchu.quickshop.api.event.packet.send.PacketHandlerSendMetaEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent

Constructors:
- PacketHandlerSendMetaEvent(PacketHandler<*> packetHandler, PacketFactory<TT> packetFactory, T metaPacket)

Methods:
- PacketFactory<TT> packetFactory()
- V packetFactory(PacketFactory<TT> packetFactory)
- TT metaPacket()
- V metaPacket(T metaPacket)

### Class: com.ghostchu.quickshop.api.event.packet.send.PacketHandlerSendSpawnEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.packet.PacketHandlerEvent
Implements: com.ghostchu.quickshop.api.event.QSCancellable

Constructors:
- PacketHandlerSendSpawnEvent(PacketHandler<*> packetHandler, PacketFactory<TT> packetFactory, T spawnPacket)

Methods:
- Component getCancelReason()
- boolean isCancelled()
- PacketFactory<TT> packetFactory()
- V packetFactory(PacketFactory<TT> packetFactory)
- void setCancelled(boolean cancel, Component reason)
- TT spawnPacket()
- V spawnPacket(T spawnPacket)

## Package: com.ghostchu.quickshop.api.event.panel

### Class: com.ghostchu.quickshop.api.event.panel.ControlComponentGenerateEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.PhasedEvent

Constructors:
- ControlComponentGenerateEvent(Phase phase, Shop shop, QUser user, ControlComponent old)
- ControlComponentGenerateEvent(Phase phase, Shop shop, QUser user, ControlComponent old, ControlComponent updated)

Methods:
- Shop shop()
- ControlComponent old()
- PhasedEvent clone(Phase newPhase)
- ControlComponentGenerateEvent clone(Phase newPhase, ControlComponent old, ControlComponent updated)
- ControlComponent updated()
- void updated(ControlComponent updated)
- QUser user()

## Package: com.ghostchu.quickshop.api.event.settings

### Class: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.PhasedEvent

Constructors:
- ShopSettingEvent(Phase phase, Shop shop, T old)
- ShopSettingEvent(Phase phase, Shop shop, T old, T updated)

Methods:
- Shop shop()
- TT old()
- PhasedEvent clone(Phase newPhase)
- ShopSettingEvent<TT> clone(Phase newPhase, T old, T updated)
- TT updated()
- V updated(T updated)

## Package: com.ghostchu.quickshop.api.event.settings.type

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopCurrencyEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopCurrencyEvent(Phase phase, Shop shop, String old)
- ShopCurrencyEvent(Phase phase, Shop shop, String old, String updated)

Methods:
- **static** ShopCurrencyEvent PRE(Shop shop, String old)
- **static** ShopCurrencyEvent PRE(Shop shop, String old, String updated)
- **static** ShopCurrencyEvent POST(Shop shop, String old)
- **static** ShopCurrencyEvent POST(Shop shop, String old, String updated)
- **static** ShopCurrencyEvent RETRIEVE(Shop shop, String old)
- **static** ShopCurrencyEvent RETRIEVE(Shop shop, String old, String updated)
- ShopCurrencyEvent clone(Phase newPhase)
- ShopCurrencyEvent clone(Phase newPhase, String old, String updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopCurrencyEvent MAIN(Shop shop, String old)
- **static** ShopCurrencyEvent MAIN(Shop shop, String old, String updated)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopDisplayEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopDisplayEvent(Phase phase, Shop shop, Boolean old)
- ShopDisplayEvent(Phase phase, Shop shop, Boolean old, Boolean updated)

Methods:
- **static** ShopDisplayEvent PRE(Shop shop, Boolean old)
- **static** ShopDisplayEvent PRE(Shop shop, Boolean old, Boolean updated)
- **static** ShopDisplayEvent POST(Shop shop, Boolean old)
- **static** ShopDisplayEvent POST(Shop shop, Boolean old, Boolean updated)
- **static** ShopDisplayEvent RETRIEVE(Shop shop, Boolean old)
- **static** ShopDisplayEvent RETRIEVE(Shop shop, Boolean old, Boolean updated)
- ShopDisplayEvent clone(Phase newPhase)
- ShopDisplayEvent clone(Phase newPhase, Boolean old, Boolean updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopDisplayEvent MAIN(Shop shop, Boolean old)
- **static** ShopDisplayEvent MAIN(Shop shop, Boolean old, Boolean updated)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopItemEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopItemEvent(Phase phase, Shop shop, ItemStack old)
- ShopItemEvent(Phase phase, Shop shop, ItemStack old, ItemStack updated)

Methods:
- **static** ShopItemEvent PRE(Shop shop, ItemStack old)
- **static** ShopItemEvent PRE(Shop shop, ItemStack old, ItemStack updated)
- **static** ShopItemEvent POST(Shop shop, ItemStack old)
- **static** ShopItemEvent POST(Shop shop, ItemStack old, ItemStack updated)
- **static** ShopItemEvent RETRIEVE(Shop shop, ItemStack old)
- **static** ShopItemEvent RETRIEVE(Shop shop, ItemStack old, ItemStack updated)
- ShopItemEvent clone(Phase newPhase)
- ShopItemEvent clone(Phase newPhase, ItemStack old, ItemStack updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopItemEvent MAIN(Shop shop, ItemStack old)
- **static** ShopItemEvent MAIN(Shop shop, ItemStack old, ItemStack updated)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopNameEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopNameEvent(Phase phase, Shop shop, String old)
- ShopNameEvent(Phase phase, Shop shop, String old, String updated)

Methods:
- **static** ShopNameEvent PRE(Shop shop, String old)
- **static** ShopNameEvent PRE(Shop shop, String old, String updated)
- **static** ShopNameEvent POST(Shop shop, String old)
- **static** ShopNameEvent POST(Shop shop, String old, String updated)
- **static** ShopNameEvent RETRIEVE(Shop shop, String old)
- **static** ShopNameEvent RETRIEVE(Shop shop, String old, String updated)
- ShopNameEvent clone(Phase newPhase)
- ShopNameEvent clone(Phase newPhase, String old, String updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopNameEvent MAIN(Shop shop, String old)
- **static** ShopNameEvent MAIN(Shop shop, String old, String updated)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopOwnerEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopOwnerEvent(Phase phase, Shop shop, QUser old)
- ShopOwnerEvent(Phase phase, Shop shop, QUser old, QUser updated)

Methods:
- **static** ShopOwnerEvent PRE(Shop shop, QUser old)
- **static** ShopOwnerEvent PRE(Shop shop, QUser old, QUser updated)
- **static** ShopOwnerEvent POST(Shop shop, QUser old)
- **static** ShopOwnerEvent POST(Shop shop, QUser old, QUser updated)
- **static** ShopOwnerEvent RETRIEVE(Shop shop, QUser old)
- **static** ShopOwnerEvent RETRIEVE(Shop shop, QUser old, QUser updated)
- ShopOwnerEvent clone(Phase newPhase)
- ShopOwnerEvent clone(Phase newPhase, QUser old, QUser updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopOwnerEvent MAIN(Shop shop, QUser old)
- **static** ShopOwnerEvent MAIN(Shop shop, QUser old, QUser updated)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopOwnerNameEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopOwnerNameEvent(Phase phase, Shop shop, Component old)
- ShopOwnerNameEvent(Phase phase, Shop shop, Component old, Component updated)

Methods:
- **static** ShopOwnerNameEvent PRE(Shop shop, Component old)
- **static** ShopOwnerNameEvent PRE(Shop shop, Component old, Component updated)
- **static** ShopOwnerNameEvent POST(Shop shop, Component old)
- **static** ShopOwnerNameEvent POST(Shop shop, Component old, Component updated)
- **static** ShopOwnerNameEvent RETRIEVE(Shop shop, Component old)
- **static** ShopOwnerNameEvent RETRIEVE(Shop shop, Component old, Component updated)
- ShopOwnerNameEvent clone(Phase newPhase)
- ShopOwnerNameEvent clone(Phase newPhase, Component old, Component updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopOwnerNameEvent MAIN(Shop shop, Component old)
- **static** ShopOwnerNameEvent MAIN(Shop shop, Component old, Component updated)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopPlayerGroupEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopPlayerGroupEvent(Phase phase, Shop shop, UUID player, String old)
- ShopPlayerGroupEvent(Phase phase, Shop shop, UUID player, String old, String updated)

Methods:
- **static** ShopPlayerGroupEvent PRE(Shop shop, UUID player, String old)
- **static** ShopPlayerGroupEvent PRE(Shop shop, UUID player, String old, String updated)
- **static** ShopPlayerGroupEvent POST(Shop shop, UUID player, String old)
- **static** ShopPlayerGroupEvent POST(Shop shop, UUID player, String old, String updated)
- **static** ShopPlayerGroupEvent RETRIEVE(Shop shop, UUID player, String old)
- **static** ShopPlayerGroupEvent RETRIEVE(Shop shop, UUID player, String old, String updated)
- ShopPlayerGroupEvent clone(Phase newPhase, String old, String updated)
- ShopPlayerGroupEvent clone(Phase newPhase)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopPlayerGroupEvent MAIN(Shop shop, UUID player, String old)
- **static** ShopPlayerGroupEvent MAIN(Shop shop, UUID player, String old, String updated)
- UUID player()

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopPriceEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopPriceEvent(Phase phase, Shop shop, Double old)
- ShopPriceEvent(Phase phase, Shop shop, Double old, Double updated)

Methods:
- **static** ShopPriceEvent PRE(Shop shop, Double old)
- **static** ShopPriceEvent PRE(Shop shop, Double old, Double updated)
- **static** ShopPriceEvent POST(Shop shop, Double old)
- **static** ShopPriceEvent POST(Shop shop, Double old, Double updated)
- **static** ShopPriceEvent RETRIEVE(Shop shop, Double old)
- **static** ShopPriceEvent RETRIEVE(Shop shop, Double old, Double updated)
- ShopPriceEvent clone(Phase newPhase)
- ShopPriceEvent clone(Phase newPhase, Double old, Double updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopPriceEvent MAIN(Shop shop, Double old)
- **static** ShopPriceEvent MAIN(Shop shop, Double old, Double updated)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopSignLinesEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopSignLinesEvent(Phase phase, Shop shop, List<Component> old)
- ShopSignLinesEvent(Phase phase, Shop shop, List<Component> old, List<Component> updated)

Methods:
- **static** ShopSignLinesEvent PRE(Shop shop, List<Component> old)
- **static** ShopSignLinesEvent PRE(Shop shop, List<Component> old, List<Component> updated)
- **static** ShopSignLinesEvent POST(Shop shop, List<Component> old)
- **static** ShopSignLinesEvent POST(Shop shop, List<Component> old, List<Component> updated)
- **static** ShopSignLinesEvent RETRIEVE(Shop shop, List<Component> old)
- **static** ShopSignLinesEvent RETRIEVE(Shop shop, List<Component> old, List<Component> updated)
- ShopSignLinesEvent clone(Phase newPhase)
- ShopSignLinesEvent clone(Phase newPhase, List<Component> old, List<Component> updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopSignLinesEvent MAIN(Shop shop, List<Component> old)
- **static** ShopSignLinesEvent MAIN(Shop shop, List<Component> old, List<Component> updated)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopTaxAccountEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopTaxAccountEvent(Phase phase, Shop shop, QUser old)
- ShopTaxAccountEvent(Phase phase, Shop shop, QUser old, QUser updated)

Methods:
- **static** ShopTaxAccountEvent PRE(Shop shop, QUser old)
- **static** ShopTaxAccountEvent PRE(Shop shop, QUser old, QUser updated)
- **static** ShopTaxAccountEvent POST(Shop shop, QUser old)
- **static** ShopTaxAccountEvent POST(Shop shop, QUser old, QUser updated)
- **static** ShopTaxAccountEvent RETRIEVE(Shop shop, QUser old)
- **static** ShopTaxAccountEvent RETRIEVE(Shop shop, QUser old, QUser updated)
- ShopTaxAccountEvent clone(Phase newPhase)
- ShopTaxAccountEvent clone(Phase newPhase, QUser old, QUser updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopTaxAccountEvent MAIN(Shop shop, QUser old)
- **static** ShopTaxAccountEvent MAIN(Shop shop, QUser old, QUser updated)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopTypeEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopTypeEvent(Phase phase, Shop shop, ShopType old)
- ShopTypeEvent(Phase phase, Shop shop, ShopType old, ShopType updated)

Methods:
- **static** ShopTypeEvent PRE(Shop shop, ShopType old)
- **static** ShopTypeEvent PRE(Shop shop, ShopType old, ShopType updated)
- **static** ShopTypeEvent POST(Shop shop, ShopType old)
- **static** ShopTypeEvent POST(Shop shop, ShopType old, ShopType updated)
- **static** ShopTypeEvent RETRIEVE(Shop shop, ShopType old)
- **static** ShopTypeEvent RETRIEVE(Shop shop, ShopType old, ShopType updated)
- ShopTypeEvent clone(Phase newPhase)
- ShopTypeEvent clone(Phase newPhase, ShopType old, ShopType updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopTypeEvent MAIN(Shop shop, ShopType old)
- **static** ShopTypeEvent MAIN(Shop shop, ShopType old, ShopType updated)

### Class: com.ghostchu.quickshop.api.event.settings.type.ShopUnlimitedEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopUnlimitedEvent(Phase phase, Shop shop, Boolean old)
- ShopUnlimitedEvent(Phase phase, Shop shop, Boolean old, Boolean updated)

Methods:
- **static** ShopUnlimitedEvent PRE(Shop shop, Boolean old)
- **static** ShopUnlimitedEvent PRE(Shop shop, Boolean old, Boolean updated)
- **static** ShopUnlimitedEvent POST(Shop shop, Boolean old)
- **static** ShopUnlimitedEvent POST(Shop shop, Boolean old, Boolean updated)
- **static** ShopUnlimitedEvent RETRIEVE(Shop shop, Boolean old)
- **static** ShopUnlimitedEvent RETRIEVE(Shop shop, Boolean old, Boolean updated)
- ShopUnlimitedEvent clone(Phase newPhase)
- ShopUnlimitedEvent clone(Phase newPhase, Boolean old, Boolean updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopUnlimitedEvent MAIN(Shop shop, Boolean old)
- **static** ShopUnlimitedEvent MAIN(Shop shop, Boolean old, Boolean updated)

## Package: com.ghostchu.quickshop.api.event.settings.type.benefit

### Class: com.ghostchu.quickshop.api.event.settings.type.benefit.ShopBenefitAddEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopBenefitAddEvent(Phase phase, Shop shop, QUser user, double benefit)
- ShopBenefitAddEvent(Phase phase, Shop shop, QUser user, double benefit, double updated)

Methods:
- **static** ShopBenefitAddEvent PRE(Shop shop, QUser user, Double old)
- **static** ShopBenefitAddEvent PRE(Shop shop, QUser user, Double old, Double updated)
- **static** ShopBenefitAddEvent POST(Shop shop, QUser user, Double old)
- **static** ShopBenefitAddEvent POST(Shop shop, QUser user, Double old, Double updated)
- **static** ShopBenefitAddEvent RETRIEVE(Shop shop, QUser user, Double old)
- **static** ShopBenefitAddEvent RETRIEVE(Shop shop, QUser user, Double old, Double updated)
- ShopBenefitAddEvent clone(Phase newPhase)
- ShopBenefitAddEvent clone(Phase newPhase, Double old, Double updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopBenefitAddEvent MAIN(Shop shop, QUser user, Double old)
- **static** ShopBenefitAddEvent MAIN(Shop shop, QUser user, Double old, Double updated)
- QUser user()

### Class: com.ghostchu.quickshop.api.event.settings.type.benefit.ShopBenefitEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopBenefitEvent(Phase phase, Shop shop, Benefit old)
- ShopBenefitEvent(Phase phase, Shop shop, Benefit old, Benefit updated)

Methods:
- **static** ShopBenefitEvent PRE(Shop shop, Benefit old)
- **static** ShopBenefitEvent PRE(Shop shop, Benefit old, Benefit updated)
- **static** ShopBenefitEvent POST(Shop shop, Benefit old)
- **static** ShopBenefitEvent POST(Shop shop, Benefit old, Benefit updated)
- **static** ShopBenefitEvent RETRIEVE(Shop shop, Benefit old)
- **static** ShopBenefitEvent RETRIEVE(Shop shop, Benefit old, Benefit updated)
- ShopBenefitEvent clone(Phase newPhase)
- ShopBenefitEvent clone(Phase newPhase, Benefit old, Benefit updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopBenefitEvent MAIN(Shop shop, Benefit old)
- **static** ShopBenefitEvent MAIN(Shop shop, Benefit old, Benefit updated)

### Class: com.ghostchu.quickshop.api.event.settings.type.benefit.ShopBenefitRemoveEvent
Type: Class
Extends: com.ghostchu.quickshop.api.event.settings.ShopSettingEvent

Constructors:
- ShopBenefitRemoveEvent(Phase phase, Shop shop, QUser user, Double benefit)
- ShopBenefitRemoveEvent(Phase phase, Shop shop, QUser user, Double benefit, Double updated)

Methods:
- **static** ShopBenefitRemoveEvent PRE(Shop shop, QUser user, Double old)
- **static** ShopBenefitRemoveEvent PRE(Shop shop, QUser user, Double old, Double updated)
- **static** ShopBenefitRemoveEvent POST(Shop shop, QUser user, Double old)
- **static** ShopBenefitRemoveEvent POST(Shop shop, QUser user, Double old, Double updated)
- QUser getUser()
- **static** ShopBenefitRemoveEvent RETRIEVE(Shop shop, QUser user, Double old)
- **static** ShopBenefitRemoveEvent RETRIEVE(Shop shop, QUser user, Double old, Double updated)
- ShopBenefitRemoveEvent clone(Phase newPhase)
- ShopBenefitRemoveEvent clone(Phase newPhase, Double old, Double updated)
- ShopSettingEvent clone(Phase, Object, Object)
- PhasedEvent clone(Phase)
- **static** ShopBenefitRemoveEvent MAIN(Shop shop, QUser user, Double old)
- **static** ShopBenefitRemoveEvent MAIN(Shop shop, QUser user, Double old, Double updated)

## Package: com.ghostchu.quickshop.api.eventmanager

### Class: com.ghostchu.quickshop.api.eventmanager.QuickEventManager
Type: Interface

Methods:
- V callEvent(Event, Consumer<Event>) throws IllegalStateException

## Package: com.ghostchu.quickshop.api.inventory

### Class: com.ghostchu.quickshop.api.inventory.CountableInventoryWrapper
Type: Interface
Implements: com.ghostchu.quickshop.api.inventory.InventoryWrapper

Methods:
- int countSpace(CountableInventoryWrapper$ItemPredicate)
- int countItem(CountableInventoryWrapper$ItemPredicate)

### Class: com.ghostchu.quickshop.api.inventory.CountableInventoryWrapper$ItemPredicate
Type: Interface

Methods:
- boolean isMatch(ItemStack)

### Class: com.ghostchu.quickshop.api.inventory.InventoryWrapper
Type: Interface
Implements: java.lang.Iterable

Methods:
- InventoryWrapperManager getWrapperManager()
- Map<Integer, ItemStack> removeItem(ItemStack itemStacks)
- Location getLocation()
- boolean isValid()
- void clear()
- void changeItem(InventoryWrapper$ItemChanger itemChanger)
- boolean isNeedUpdate()
- Map<Integer, ItemStack> addItem(ItemStack itemStacks)
- boolean restoreSnapshot(ItemStack[] snapshot)
- InventoryWrapperIterator iterator()
- Iterator iterator()
- InventoryWrapperType getInventoryType()
- ItemStack[] createSnapshot()
- void setContents(ItemStack[])
- InventoryHolder getHolder()

### Class: com.ghostchu.quickshop.api.inventory.InventoryWrapper$ItemChanger
Type: Interface

Methods:
- boolean changeItem(int, ItemStack)

### Class: com.ghostchu.quickshop.api.inventory.InventoryWrapperIterator
Type: Interface
Implements: java.util.Iterator

Methods:
- ItemStack next()
- Object next()
- **static** InventoryWrapperIterator ofBukkitInventory(Inventory inventory)
- boolean hasNext()
- **static** InventoryWrapperIterator ofItemStacks(ItemStack[] itemStacks)
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
- String find(InventoryWrapperManager manager)
- InventoryWrapperManager get(String pluginName)
- void unregister(Plugin plugin)
- void register(Plugin plugin, InventoryWrapperManager manager)

### Class: com.ghostchu.quickshop.api.inventory.InventoryWrapperType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BUKKIT
- PLUGIN

Methods:
- **static** InventoryWrapperType valueOf(String name)
- **static** InventoryWrapperType[] values()

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
- List<Component> forLocale(String)
- List<Component> forLocale()
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
- Z localeEnabled(String, List<String>)
- List<String> getAvailableLanguages()
- Component[] convert(Object[])
- TextList ofList(String, Object[])
- TextList ofList(UUID, String, Object[])
- TextList ofList(QUser, String, Object[])
- TextList ofList(CommandSender, String, Object[])
- List<String> getAvailableLocales()
- void register(String, String, String)

### Class: com.ghostchu.quickshop.api.localization.text.ProxiedLocale
Type: Class

Constructors:
- ProxiedLocale(String origin, String relative, NumberFormat nf, Locale locale)

Methods:
- NumberFormat getNumberFormat()
- String getOrigin()
- NumberFormat getNf()
- int hashCode()
- void setOrigin(String origin)
- boolean equals(Object o)
- void setRelative(String relative)
- String toString()
- Locale getJavaLocale()
- String getRelative()
- String getLocale()
- void setNf(NumberFormat nf)
- void setLocale(Locale locale)

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
- Optional<UUID> getUniqueIdIfRealPlayer()
- void setUniqueId(UUID)
- Optional<Player> getBukkitPlayer()
- void setRealPlayer(boolean)
- UUID getUniqueId()
- String getUsername()
- String serialize()
- Optional<UUID> getUniqueIdOptional()
- boolean isFull()
- Optional<String> getUsernameIfRealPlayer()
- boolean isRealPlayer()
- String getDisplay()
- Optional<String> getUsernameOptional()

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

Constructors:
- ProviderIsEmptyException(String providerName)

Methods:
- String getProviderName()

## Package: com.ghostchu.quickshop.api.registry

### Class: com.ghostchu.quickshop.api.registry.Registry
Type: Interface

No public methods found

### Class: com.ghostchu.quickshop.api.registry.RegistryManager
Type: Interface

Methods:
- Map<String, Registry> getRegistries()
- Registry getRegistry(BuiltInRegistry)
- Registry getRegistry(String)
- void registerRegistry(String, Registry)
- Map<String, Registry> getRegistryList()
- void unregisterRegistry(String)

### Class: com.ghostchu.quickshop.api.registry.BuiltInRegistry
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ITEM_EXPRESSION

Methods:
- String getName()
- **static** BuiltInRegistry valueOf(String name)
- **static** BuiltInRegistry[] values()

### Class: com.ghostchu.quickshop.api.registry.PrefixAlreadyRegisteredException
Type: Class
Extends: java.lang.Exception

Constructors:
- PrefixAlreadyRegisteredException(String prefix, Plugin plugin, ItemExpressionHandler handler)

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
- int compareTo(ItemExpressionHandler o)
- int compareTo(Object)

### Class: com.ghostchu.quickshop.api.registry.builtin.itemexpression.ItemExpressionRegistry
Type: Interface
Implements: com.ghostchu.quickshop.api.registry.Registry

Methods:
- void registerHandler(ItemExpressionHandler) throws PrefixAlreadyRegisteredException
- void unregisterHandlers(Plugin)
- Set<ItemExpressionHandler> getHandlers()
- boolean registerHandlerSafely(ItemExpressionHandler)
- boolean match(ItemStack, String)
- void unregisterHandler(ItemExpressionHandler)
- void unregisterHandler(String)

## Package: com.ghostchu.quickshop.api.serialize

### Class: com.ghostchu.quickshop.api.serialize.BlockPos
Type: Class

Constructors:
- BlockPos(Location x)
- BlockPos(int x, int y, int z, String world)

Methods:
- String serialize()
- String getWorld()
- int getX()
- int getY()
- int getZ()
- int hashCode()
- boolean equals(Object o)
- String toString()
- **static** BlockPos deserialize(String string)

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
- List<Operation> rollback(boolean)
- void setLastError(String)
- String getLastError()
- void setFrom(InventoryWrapper)
- boolean commit()
- boolean commit(InventoryTransaction$TransactionCallback)
- ItemStack getItem()
- boolean failSafeCommit()
- InventoryWrapper getTo()
- Deque<Operation> getProcessingStack()
- void setTo(InventoryWrapper)
- void setAmount(int)
- void setItem(ItemStack)
- InventoryWrapper getFrom()
- int getAmount()

### Class: com.ghostchu.quickshop.api.shop.InventoryTransaction$TransactionCallback
Type: Interface

Methods:
- boolean onCommit(InventoryTransaction transaction)
- void onFailed(InventoryTransaction transaction)
- void onSuccess(InventoryTransaction transaction)

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
- CompletableFuture<String> uuid2NameFuture(UUID)
- CompletableFuture<String> uuid2NameFuture(UUID, boolean, ExecutorService)
- String uuid2Name(UUID)
- String uuid2Name(UUID, boolean, ExecutorService)
- boolean isCached(UUID)
- CompletableFuture<UUID> name2UuidFuture(String)
- CompletableFuture<UUID> name2UuidFuture(String, boolean, ExecutorService)

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
- List<Sign> getSigns()
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
- V setSignText(List<Component>)
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
- CompletableFuture<Void> update()
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
- List<Component> getSignText(ProxiedLocale locale)
- Map<UUID, String> getPermissionAudiences()
- void refresh()
- double getPrice()
- boolean isBuying()
- QUser getTaxAccount()
- List<UUID> playersCanAuthorize(BuiltInShopPermission)
- List<UUID> playersCanAuthorize(BuiltInShopPermissionGroup)
- List<UUID> playersCanAuthorize(Plugin, String)
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
- LinkedList<Component> generate(Player, Shop)

### Class: com.ghostchu.quickshop.api.shop.ShopControlPanelManager
Type: Interface

Methods:
- LinkedList<String> enabledComponents()
- void unregister(Plugin)
- void unregister(ShopControlPanel)
- void addComponent(ControlComponent component)
- void initialize()
- LinkedHashMap<String, ControlComponent> controlComponents()
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
- List<Shop> getAllShops()
- List<Shop> getAllShops(QUser)
- List<Shop> getAllShops(UUID)
- Map<UUID, Info> getActions()
- Set<Shop> getLoadedShops()
- CompletableFuture<*> registerShop(Shop, boolean)
- CompletableFuture<*> unregisterShop(Shop, boolean)
- void createShop(Shop, Block, boolean) throws IllegalStateException
- void handleChat(Player, String)
- void sendPurchaseSuccess(QUser, Shop, int, double, double)
- boolean actionSelling(Player, InventoryWrapper, AbstractEconomy, Info, Shop, int)
- List<Shop> getShopsInWorld(World)
- List<Shop> getShopsInWorld(String)
- CompletableFuture<Integer> removeTag(UUID, Shop, String)
- CompletableFuture<Integer> clearTagFromShops(UUID, String)
- CompletableFuture<Integer> tagShop(UUID, Shop, String)
- boolean shopIsNotValid(QUser, Info, Shop)
- List<String> listTags(UUID)
- BlockState makeShopSign(Block, Block, Material)
- Map<String, Map<ShopChunk, Map<Location, Shop>>> getShops()
- Map<Location, Shop> getShops(Chunk)
- Map<Location, Shop> getShops(String, int, int)
- Map<Location, Shop> getShops(ShopChunk)
- Map<ShopChunk, Map<Location, Shop>> getShops(String)
- Shop getShopIncludeAttachedViaCache(Location)
- void actionCreate(Player, Info, String)
- String format(double, World, String)
- String format(double, Shop)
- void clear()
- Shop getShop(long)
- Shop getShop(Location)
- Shop getShop(Location, boolean)
- CompletableFuture<ShopInventoryCountCache> queryShopInventoryCacheInDatabase(Shop)
- void deleteShop(Shop)
- void unloadShop(Shop)
- void unloadShop(Shop, boolean)
- PriceLimiter getPriceLimiter()
- Shop getShopFromRuntimeRandomUniqueId(UUID)
- Shop getShopFromRuntimeRandomUniqueId(UUID, boolean)
- CompletableFuture<Integer> clearShopTags(UUID, Shop)
- ShopManager$InteractiveManager getInteractiveManager()
- void migrateOwnerToUnlimitedShopOwner(Shop)
- void loadShop(Shop)
- double getTax(Shop, QUser)
- Iterator<Shop> getShopIterator()
- Shop getShopIncludeAttached(Location)
- CompletableFuture<List<Shop>> queryTaggedShops(UUID, String)
- void sendShopInfo(Player, Shop)
- void bakeShopRuntimeRandomUniqueIdCache(Shop)

### Class: com.ghostchu.quickshop.api.shop.ShopManager$InteractiveManager
Type: Interface

Methods:
- int size()
- boolean containsKey(UUID)
- Info get(UUID)
- boolean isEmpty()
- void reset()
- boolean containsValue(Info)
- Info remove(UUID)
- Info put(UUID, Info)

### Class: com.ghostchu.quickshop.api.shop.ShopModerator
Type: Interface

Methods:
- **static** String serialize(ShopModerator shopModerator)
- boolean addStaff(UUID)
- boolean isModerator(UUID)
- boolean isStaff(UUID)
- boolean isOwner(UUID)
- void clearStaffs()
- String toString()
- boolean delStaff(UUID)
- V setStaffs(List<UUID>)
- UUID getOwner()
- List<UUID> getStaffs()
- void setOwner(UUID)
- **static** ShopModerator deserialize(String serilized) throws JsonSyntaxException

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
- List<String> getGroupPermissions(String)
- void unregisterPermission(String, Plugin, String)
- boolean hasPermission(String, BuiltInShopPermission)
- boolean hasPermission(String, Plugin, String)
- boolean hasGroup(String)
- V registerGroup(String, Collection<String>)
- void unregisterGroup(String)
- List<String> getGroups()

### Class: com.ghostchu.quickshop.api.shop.PriceLimiterStatus
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PASS
- REACHED_PRICE_MAX_LIMIT
- REACHED_PRICE_MIN_LIMIT
- PRICE_RESTRICTED
- NOT_A_WHOLE_NUMBER
- NOT_VALID

Methods:
- **static** PriceLimiterStatus valueOf(String name)
- **static** PriceLimiterStatus[] values()

### Class: com.ghostchu.quickshop.api.shop.ShopAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PURCHASE_BUY
- PURCHASE_SELL
- CREATE_SELL
- CREATE_BUY
- CANCELLED

Methods:
- boolean isTrading()
- **static** ShopAction valueOf(String name)
- **static** ShopAction[] values()
- boolean isCreating()

### Class: com.ghostchu.quickshop.api.shop.ShopControlPanelPriority
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LOWEST
- LOW
- NORMAL
- HIGH
- HIGHEST

Methods:
- **static** ShopControlPanelPriority valueOf(String name)
- **static** ShopControlPanelPriority[] values()
- int getPriority()

### Class: com.ghostchu.quickshop.api.shop.ShopInfoStorage
Type: Class

Constructors:
- ShopInfoStorage(String world, BlockPos position, QUser owner, double price, String item, int unlimited, int shopType, String extra, String currency, boolean disableDisplay, QUser taxAccount, String inventoryWrapperName, String symbolLink, Map<UUID, String> permission)

Methods:
- String getCurrency()
- String getWorld()
- Map<UUID, String> getPermission()
- int getShopType()
- String getItem()
- String getOwner()
- double getPrice()
- String getInventoryWrapperName()
- String getSymbolLink()
- BlockPos getPosition()
- boolean isDisableDisplay()
- int hashCode()
- boolean equals(Object o)
- String getTaxAccount()
- String toString()
- String getExtra()
- int getUnlimited()

### Class: com.ghostchu.quickshop.api.shop.ShopType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SELLING
- BUYING
- FROZEN

Methods:
- **static** int toID(ShopType shopType)
- int toID()
- **static** ShopType valueOf(String name)
- **static** ShopType[] values()
- **static** ShopType fromString(String string)
- **static** ShopType fromID(int id)

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

Enum Constants:
- SINGLE
- INCLUDE_ATTACHED

Methods:
- **static** ShopCacheNamespacedKey valueOf(String name)
- **static** ShopCacheNamespacedKey[] values()

## Package: com.ghostchu.quickshop.api.shop.display

### Class: com.ghostchu.quickshop.api.shop.display.PacketFactory
Type: Interface

Methods:
- void registerUnloadChunk()
- TT createVelocityPacket(int)
- TT createMetaDataPacket(int, ItemStack)
- void registerSendChunk()
- Z sendPacket(Player, T)
- void unregisterUnloadChunk()
- TT createDestroyPacket(int)
- TT createSpawnPacket(int, Location)
- void unregisterSendChunk()

### Class: com.ghostchu.quickshop.api.shop.display.PacketHandler
Type: Interface

Methods:
- Optional<PacketFactory<*>> factory(String version)
- String identifier()
- TT internal()
- String pluginName()
- Map<String, PacketFactory<*>> factories()
- void initialize()

### Class: com.ghostchu.quickshop.api.shop.display.DisplayType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- VIRTUALITEM
- CUSTOM

Methods:
- **static** int toID(DisplayType displayType)
- int toID()
- **static** DisplayType valueOf(String name)
- **static** DisplayType[] values()
- **static** DisplayType fromID(int id)

## Package: com.ghostchu.quickshop.api.shop.permission

### Class: com.ghostchu.quickshop.api.shop.permission.BuiltInShopPermission
Type: Enum
Extends: java.lang.Enum
Implements: com.ghostchu.quickshop.api.shop.ShopPermissionAudience

Enum Constants:
- PURCHASE
- SHOW_INFORMATION
- PREVIEW_SHOP
- SEARCH
- DELETE
- RECEIVE_ALERT
- ACCESS_INVENTORY
- OWNERSHIP_TRANSFER
- MANAGEMENT_PERMISSION
- TOGGLE_DISPLAY
- SET_SHOPTYPE
- SET_PRICE
- SET_ITEM
- SET_STACK_AMOUNT
- SET_CURRENCY
- SET_NAME
- SET_BENEFIT
- SET_SIGN_TYPE
- VIEW_PURCHASE_LOGS

Methods:
- String getNamespacedNode()
- String getName()
- **static** BuiltInShopPermission valueOf(String name)
- boolean hasPermission(BuiltInShopPermission permission)
- boolean hasPermission(String permission)
- **static** BuiltInShopPermission[] values()
- String getDescriptionKey()
- String getRawNode()

### Class: com.ghostchu.quickshop.api.shop.permission.BuiltInShopPermissionGroup
Type: Enum
Extends: java.lang.Enum
Implements: com.ghostchu.quickshop.api.shop.ShopPermissionAudience

Enum Constants:
- BLOCKED
- EVERYONE
- STAFF
- ADMINISTRATOR

Methods:
- String getNamespacedNode()
- String getName()
- **static** BuiltInShopPermissionGroup valueOf(String name)
- List<BuiltInShopPermission> getPermissions()
- boolean hasPermission(BuiltInShopPermission permission)
- boolean hasPermission(String permission)
- **static** BuiltInShopPermissionGroup[] values()
- String getDescriptionKey()
- String getRawNode()

