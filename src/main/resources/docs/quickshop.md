# quickshop-api-6.2.0.11-SNAPSHOT-1 API Reference

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
- InteractionManager getInteractionManager()
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

## Package: com.ghostchu.quickshop.api.shop.interaction

### Class: com.ghostchu.quickshop.api.shop.interaction.InteractionBehavior
Type: Interface

Methods:
- String identifier()
- void handle(QuickShopAPI, Shop, Player, PlayerInteractEvent, InteractionClick, InteractionType)

### Class: com.ghostchu.quickshop.api.shop.interaction.InteractionManager
Type: Interface

Methods:
- Collection getInteractions()
- void interaction(InteractionType)
- Optional interaction(String)
- Optional interaction(PlayerInteractEvent, InteractionClick)
- boolean hasInteraction(String)
- void behavior(InteractionBehavior)
- Optional behavior(String)
- Optional behavior(InteractionType)
- Collection getBehaviors()
- boolean hasBehavior(String)

### Class: com.ghostchu.quickshop.api.shop.interaction.InteractionType
Type: Interface

Methods:
- String identifier()
- boolean applies(PlayerInteractEvent, InteractionClick)

### Class: com.ghostchu.quickshop.api.shop.interaction.InteractionClick
Type: Enum
Extends: java.lang.Enum

Methods:
- InteractionClick valueOf(String)
- InteractionClick[] values()

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

