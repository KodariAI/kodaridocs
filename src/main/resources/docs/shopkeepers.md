# ShopkeepersAPI-2.23.11-SNAPSHOT API Reference

## Package: com.nisovin.shopkeepers.api

### Class: com.nisovin.shopkeepers.api.ShopkeepersPlugin
Type: Interface
Implements: org.bukkit.plugin.Plugin

Methods:
- BookOffer createBookOffer(String, int)
- boolean hasCreatePermission(Player)
- TradeOffer createTradeOffer(ItemStack, ItemStack, ItemStack)
- TradeOffer createTradeOffer(UnmodifiableItemStack, UnmodifiableItemStack, UnmodifiableItemStack)
- ShopkeeperStorage getShopkeeperStorage()
- DefaultShopTypes getDefaultShopTypes()
- Shopkeeper handleShopkeeperCreation(ShopCreationData)
- DefaultShopObjectTypes getDefaultShopObjectTypes()
- int updateItems()
- ShopkeeperRegistry getShopkeeperRegistry()
- UIRegistry getUIRegistry()
- DefaultUITypes getDefaultUITypes()
- ShopTypesRegistry getShopTypeRegistry()
- ShopkeepersPlugin getInstance()
- PriceOffer createPriceOffer(ItemStack, int)
- PriceOffer createPriceOffer(UnmodifiableItemStack, int)
- ShopObjectTypesRegistry getShopObjectTypeRegistry()

### Class: com.nisovin.shopkeepers.api.ShopkeepersAPI
Type: Class

Methods:
- BookOffer createBookOffer(String, int)
- boolean hasCreatePermission(Player)
- TradeOffer createTradeOffer(ItemStack, ItemStack, ItemStack)
- TradeOffer createTradeOffer(UnmodifiableItemStack, UnmodifiableItemStack, UnmodifiableItemStack)
- ShopkeeperStorage getShopkeeperStorage()
- DefaultShopTypes getDefaultShopTypes()
- Shopkeeper handleShopkeeperCreation(ShopCreationData)
- DefaultShopObjectTypes getDefaultShopObjectTypes()
- int updateItems()
- ShopkeeperRegistry getShopkeeperRegistry()
- UIRegistry getUIRegistry()
- DefaultUITypes getDefaultUITypes()
- ShopkeepersPlugin getPlugin()
- boolean isEnabled()
- ShopTypesRegistry getShopTypeRegistry()
- PriceOffer createPriceOffer(ItemStack, int)
- PriceOffer createPriceOffer(UnmodifiableItemStack, int)
- ShopObjectTypesRegistry getShopObjectTypeRegistry()

## Package: com.nisovin.shopkeepers.api.events

### Class: com.nisovin.shopkeepers.api.events.PlayerCreatePlayerShopkeeperEvent
Type: Class
Extends: com.nisovin.shopkeepers.api.events.PlayerCreateShopkeeperEvent

Methods:
- void setMaxShopsLimit(int)
- int getMaxShopsLimit()

### Class: com.nisovin.shopkeepers.api.events.PlayerCreateShopkeeperEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- HandlerList getHandlerList()
- ShopCreationData getShopCreationData()

### Class: com.nisovin.shopkeepers.api.events.PlayerDeleteShopkeeperEvent
Type: Class
Extends: com.nisovin.shopkeepers.api.events.ShopkeeperEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- HandlerList getHandlers()
- void setCancelled(boolean)
- HandlerList getHandlerList()

### Class: com.nisovin.shopkeepers.api.events.PlayerInactiveEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Collection getShopkeepers()
- HandlerList getHandlers()
- void setCancelled(boolean)
- HandlerList getHandlerList()
- User getUser()

### Class: com.nisovin.shopkeepers.api.events.PlayerOpenUIEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- boolean isSilentRequest()
- HandlerList getHandlers()
- void setCancelled(boolean)
- HandlerList getHandlerList()
- UIType getUIType()

### Class: com.nisovin.shopkeepers.api.events.PlayerShopkeeperHireEvent
Type: Class
Extends: com.nisovin.shopkeepers.api.events.ShopkeeperEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- PlayerShopkeeper getShopkeeper()
- Shopkeeper getShopkeeper()
- HandlerList getHandlers()
- void setCancelled(boolean)
- HandlerList getHandlerList()
- void setMaxShopsLimit(int)
- ItemStack[] getNewPlayerInventoryContents()
- int getMaxShopsLimit()

### Class: com.nisovin.shopkeepers.api.events.ShopkeeperAddedEvent
Type: Class
Extends: com.nisovin.shopkeepers.api.events.ShopkeeperEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()
- ShopkeeperAddedEvent$Cause getCause()

### Class: com.nisovin.shopkeepers.api.events.ShopkeeperEditedEvent
Type: Class
Extends: com.nisovin.shopkeepers.api.events.ShopkeeperEvent

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: com.nisovin.shopkeepers.api.events.ShopkeeperEvent
Type: Abstract Class
Extends: org.bukkit.event.Event

Methods:
- Shopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.api.events.ShopkeeperOpenUIEvent
Type: Class
Extends: com.nisovin.shopkeepers.api.events.PlayerOpenUIEvent

Methods:
- Shopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.api.events.ShopkeeperRemoveEvent
Type: Class
Extends: com.nisovin.shopkeepers.api.events.ShopkeeperEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()
- ShopkeeperRemoveEvent$Cause getCause()

### Class: com.nisovin.shopkeepers.api.events.ShopkeeperTradeCompletedEvent
Type: Class
Extends: com.nisovin.shopkeepers.api.events.ShopkeeperEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()
- ShopkeeperTradeEvent getCompletedTrade()

### Class: com.nisovin.shopkeepers.api.events.ShopkeeperTradeEvent
Type: Class
Extends: com.nisovin.shopkeepers.api.events.ShopkeeperEvent
Implements: org.bukkit.event.Cancellable

Methods:
- UnmodifiableItemStack getResultItem()
- boolean isCancelled()
- UnmodifiableItemStack getReceivedItem2()
- Player getPlayer()
- boolean isReceivedItem1Altered()
- HandlerList getHandlers()
- void setCancelled(boolean)
- boolean isReceivedItem2Altered()
- HandlerList getHandlerList()
- boolean hasOfferedItem2()
- TradingRecipe getTradingRecipe()
- List getTradeEffects()
- UnmodifiableItemStack getOfferedItem2()
- InventoryClickEvent getClickEvent()
- UnmodifiableItemStack getReceivedItem1()
- UnmodifiableItemStack getOfferedItem1()
- void setResultItem(UnmodifiableItemStack)
- void setReceivedItem1(UnmodifiableItemStack)
- void setReceivedItem2(UnmodifiableItemStack)
- boolean isResultItemAltered()
- boolean isItemOrderSwapped()

### Class: com.nisovin.shopkeepers.api.events.ShopkeepersStartupEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: com.nisovin.shopkeepers.api.events.UpdateItemEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- boolean isItemAltered()
- HandlerList getHandlers()
- UnmodifiableItemStack getOriginalItem()
- HandlerList getHandlerList()
- UnmodifiableItemStack getItem()
- void setItem(UnmodifiableItemStack)

## Package: com.nisovin.shopkeepers.api.internal

### Class: com.nisovin.shopkeepers.api.internal.ApiInternals
Type: Interface

Methods:
- boolean isShopkeeperSnapshotNameValid(String)
- BookOffer createBookOffer(String, int)
- UnmodifiableItemStack createUnmodifiableItemStack(ItemStack)
- TradeOffer createTradeOffer(ItemStack, ItemStack, ItemStack)
- TradeOffer createTradeOffer(UnmodifiableItemStack, UnmodifiableItemStack, UnmodifiableItemStack)
- boolean isEmpty(UnmodifiableItemStack)
- ApiInternals getInstance()
- int getShopkeeperSnapshotMaxNameLength()
- PriceOffer createPriceOffer(ItemStack, int)
- PriceOffer createPriceOffer(UnmodifiableItemStack, int)

### Class: com.nisovin.shopkeepers.api.internal.InternalShopkeepersPlugin
Type: Interface
Implements: com.nisovin.shopkeepers.api.ShopkeepersPlugin

Methods:
- ApiInternals getApiInternals()

### Class: com.nisovin.shopkeepers.api.internal.InternalShopkeepersAPI
Type: Class

Methods:
- void disable()
- void enable(InternalShopkeepersPlugin)
- InternalShopkeepersPlugin getPlugin()
- boolean isEnabled()

## Package: com.nisovin.shopkeepers.api.internal.util

### Class: com.nisovin.shopkeepers.api.internal.util.Unsafe
Type: Class

Methods:
- Object nullableAsNonNull(Object)
- Object cast(Object)
- Object assertNonNull(Object)
- Object nullable(Object)
- Object uncheckedNull()
- Object initialized(Object)
- Object castNonNull(Object)

## Package: com.nisovin.shopkeepers.api.shopkeeper

### Class: com.nisovin.shopkeepers.api.shopkeeper.DefaultShopTypes
Type: Interface

Methods:
- List getAll()
- PlayerShopType PLAYER_BOOK()
- PlayerShopType PLAYER_TRADING()
- AdminShopType getRegularAdminShopType()
- PlayerShopType getBuyingPlayerShopType()
- AdminShopType ADMIN_REGULAR()
- PlayerShopType getSellingPlayerShopType()
- PlayerShopType getTradingPlayerShopType()
- PlayerShopType getBookPlayerShopType()
- PlayerShopType PLAYER_BUYING()
- ShopType ADMIN()
- DefaultShopTypes getInstance()
- PlayerShopType PLAYER_SELLING()
- ShopType getAdminShopType()

### Class: com.nisovin.shopkeepers.api.shopkeeper.ShopType
Type: Interface
Implements: com.nisovin.shopkeepers.api.types.SelectableType

Methods:
- String getDisplayName()
- List getTradeSetupDescription()
- String getSetupDescription()
- String getDescription()

### Class: com.nisovin.shopkeepers.api.shopkeeper.ShopTypesRegistry
Type: Interface
Implements: com.nisovin.shopkeepers.api.types.SelectableTypeRegistry

No public methods found

### Class: com.nisovin.shopkeepers.api.shopkeeper.Shopkeeper
Type: Interface

Methods:
- void setName(String)
- Location getLocation()
- String getName()
- String getUniqueIdLogPrefix()
- ShopObject getShopObject()
- boolean hasTradingRecipes(Player)
- void applySnapshot(ShopkeeperSnapshot) throws ShopkeeperLoadException
- Collection getUISessions()
- Collection getUISessions(UIType)
- List getTradingRecipes(Player)
- void save()
- String getLogPrefix()
- int getId()
- void delete()
- void delete(Player)
- UUID getUniqueId()
- String getWorldName()
- String getLocatedLogPrefix()
- ShopkeeperSnapshot createSnapshot(String)
- ShopkeeperSnapshot removeSnapshot(int)
- boolean openEditorWindow(Player)
- String getIdString()
- void abortUISessionsDelayed()
- boolean openWindow(UIType, Player)
- boolean isValid()
- int getSnapshotIndex(String)
- boolean openTradingWindow(Player)
- int updateItems()
- void addSnapshot(ShopkeeperSnapshot)
- ShopkeeperSnapshot getSnapshot(int)
- ShopkeeperSnapshot getSnapshot(String)
- ChunkCoords getChunkCoords()
- float getYaw()
- int getX()
- int getY()
- List getSnapshots()
- int getZ()
- ShopType getType()
- String getDisplayName()
- void saveDelayed()
- void removeAllSnapshots()
- boolean isVirtual()
- String getPositionString()

### Class: com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperRegistry
Type: Interface

Methods:
- Stream getShopkeepersByNamePrefix(String)
- Collection getPlayerShopkeepersByOwner(UUID)
- Shopkeeper getShopkeeperByUniqueId(UUID)
- Collection getShopkeepersAtLocation(Location)
- Shopkeeper createShopkeeper(ShopCreationData) throws ShopkeeperCreateException
- Collection getVirtualShopkeepers()
- Shopkeeper getShopkeeperByBlock(Block)
- Shopkeeper getShopkeeperByBlock(String, int, int, int)
- Collection getAllPlayerShopkeepers()
- Stream getShopkeepersByName(String)
- Collection getActiveShopkeepers()
- Collection getActiveShopkeepers(String)
- Collection getActiveChunks(String)
- boolean isShopkeeper(Entity)
- boolean isShopkeeper(Block)
- Map getShopkeepersByChunks(String)
- Collection getShopkeepersInChunk(ChunkCoords)
- Collection getShopkeepersInWorld(String)
- Collection getWorldsWithShopkeepers()
- Shopkeeper getShopkeeperByEntity(Entity)
- boolean isChunkActive(ChunkCoords)
- Shopkeeper getShopkeeperById(int)
- Collection getAllShopkeepers()

### Class: com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperSnapshot
Type: Interface

Methods:
- String getName()
- Instant getTimestamp()
- boolean isNameValid(String)
- int getMaxNameLength()

### Class: com.nisovin.shopkeepers.api.shopkeeper.TradingRecipe
Type: Interface

Methods:
- UnmodifiableItemStack getResultItem()
- UnmodifiableItemStack getItem2()
- boolean areItemsEqual(ItemStack, ItemStack, ItemStack)
- boolean areItemsEqual(UnmodifiableItemStack, UnmodifiableItemStack, UnmodifiableItemStack)
- boolean areItemsEqual(TradingRecipe)
- UnmodifiableItemStack getItem1()
- boolean hasItem2()
- boolean isOutOfStock()

### Class: com.nisovin.shopkeepers.api.shopkeeper.ShopCreationData
Type: Abstract Class

Methods:
- Object getValue(String)
- ShopType getShopType()
- ShopObjectType getShopObjectType()
- void setValue(String, Object)
- void setTargetedBlockFace(BlockFace)
- void setSpawnLocation(Location)
- Location getSpawnLocation()
- Player getCreator()
- BlockFace getTargetedBlockFace()

### Class: com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperCreateException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperLoadException
Type: Class
Extends: java.lang.Exception

No public methods found

## Package: com.nisovin.shopkeepers.api.shopkeeper.admin

### Class: com.nisovin.shopkeepers.api.shopkeeper.admin.AdminShopType
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopkeeper.ShopType

No public methods found

### Class: com.nisovin.shopkeepers.api.shopkeeper.admin.AdminShopkeeper
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopkeeper.Shopkeeper

Methods:
- String getTradePermission()
- void setTradePermission(String)

### Class: com.nisovin.shopkeepers.api.shopkeeper.admin.AdminShopCreationData
Type: Class
Extends: com.nisovin.shopkeepers.api.shopkeeper.ShopCreationData

Methods:
- AdminShopCreationData create(Player, ShopType, ShopObjectType, Location, BlockFace)
- AdminShopCreationData create(Player, AdminShopType, ShopObjectType, Location, BlockFace)

## Package: com.nisovin.shopkeepers.api.shopkeeper.admin.regular

### Class: com.nisovin.shopkeepers.api.shopkeeper.admin.regular.RegularAdminShopkeeper
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopkeeper.admin.AdminShopkeeper

Methods:
- List getOffers()
- void addOffer(TradeOffer)
- void clearOffers()
- void addOffers(List)
- void setOffers(List)

## Package: com.nisovin.shopkeepers.api.shopkeeper.offers

### Class: com.nisovin.shopkeepers.api.shopkeeper.offers.BookOffer
Type: Interface

Methods:
- String getBookTitle()
- BookOffer create(String, int)
- int getPrice()

### Class: com.nisovin.shopkeepers.api.shopkeeper.offers.PriceOffer
Type: Interface

Methods:
- UnmodifiableItemStack getItem()
- PriceOffer create(ItemStack, int)
- PriceOffer create(UnmodifiableItemStack, int)
- int getPrice()

### Class: com.nisovin.shopkeepers.api.shopkeeper.offers.TradeOffer
Type: Interface

Methods:
- UnmodifiableItemStack getResultItem()
- UnmodifiableItemStack getItem2()
- boolean areItemsEqual(ItemStack, ItemStack, ItemStack)
- boolean areItemsEqual(UnmodifiableItemStack, UnmodifiableItemStack, UnmodifiableItemStack)
- boolean areItemsEqual(TradingRecipe)
- UnmodifiableItemStack getItem1()
- TradeOffer create(ItemStack, ItemStack, ItemStack)
- TradeOffer create(UnmodifiableItemStack, UnmodifiableItemStack, UnmodifiableItemStack)
- boolean hasItem2()

## Package: com.nisovin.shopkeepers.api.shopkeeper.player

### Class: com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopType
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopkeeper.ShopType

No public methods found

### Class: com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopkeeper
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopkeeper.Shopkeeper

Methods:
- UUID getOwnerUUID()
- boolean openContainerWindow(Player)
- boolean isNotifyOnTrades()
- Block getContainer()
- int getContainerX()
- int getContainerY()
- int getCurrencyInContainer()
- int getContainerZ()
- boolean isForHire()
- Player getOwner()
- String getOwnerString()
- UnmodifiableItemStack getHireCost()
- void setOwner(Player)
- void setOwner(UUID, String)
- boolean openHireWindow(Player)
- boolean isOwner(Player)
- void setForHire(ItemStack)
- void setForHire(UnmodifiableItemStack)
- void setContainer(int, int, int)
- void setNotifyOnTrades(boolean)
- String getOwnerName()

### Class: com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopCreationData
Type: Class
Extends: com.nisovin.shopkeepers.api.shopkeeper.ShopCreationData

Methods:
- Block getShopContainer()
- PlayerShopCreationData create(Player, ShopType, ShopObjectType, Location, BlockFace, Block)
- PlayerShopCreationData create(Player, PlayerShopType, ShopObjectType, Location, BlockFace, Block)
- Block getShopChest()

## Package: com.nisovin.shopkeepers.api.shopkeeper.player.book

### Class: com.nisovin.shopkeepers.api.shopkeeper.player.book.BookPlayerShopkeeper
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopkeeper

Methods:
- void removeOffer(String)
- List getOffers()
- void addOffer(BookOffer)
- void clearOffers()
- void addOffers(List)
- void setOffers(List)
- BookOffer getOffer(ItemStack)
- BookOffer getOffer(UnmodifiableItemStack)
- BookOffer getOffer(String)

## Package: com.nisovin.shopkeepers.api.shopkeeper.player.buy

### Class: com.nisovin.shopkeepers.api.shopkeeper.player.buy.BuyingPlayerShopkeeper
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopkeeper

Methods:
- void removeOffer(ItemStack)
- void removeOffer(UnmodifiableItemStack)
- List getOffers()
- void addOffer(PriceOffer)
- void clearOffers()
- void addOffers(List)
- void setOffers(List)
- PriceOffer getOffer(ItemStack)
- PriceOffer getOffer(UnmodifiableItemStack)

## Package: com.nisovin.shopkeepers.api.shopkeeper.player.sell

### Class: com.nisovin.shopkeepers.api.shopkeeper.player.sell.SellingPlayerShopkeeper
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopkeeper

Methods:
- void removeOffer(ItemStack)
- void removeOffer(UnmodifiableItemStack)
- List getOffers()
- void addOffer(PriceOffer)
- void clearOffers()
- void addOffers(List)
- void setOffers(List)
- PriceOffer getOffer(ItemStack)
- PriceOffer getOffer(UnmodifiableItemStack)

## Package: com.nisovin.shopkeepers.api.shopkeeper.player.trade

### Class: com.nisovin.shopkeepers.api.shopkeeper.player.trade.TradingPlayerShopkeeper
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopkeeper

Methods:
- List getOffers()
- void addOffer(TradeOffer)
- void clearOffers()
- void addOffers(List)
- void setOffers(List)

## Package: com.nisovin.shopkeepers.api.shopobjects

### Class: com.nisovin.shopkeepers.api.shopobjects.DefaultShopObjectTypes
Type: Interface

Methods:
- CitizensShopObjectType getCitizensShopObjectType()
- LivingShopObjectTypes getLivingShopObjectTypes()
- List getAll()
- HangingSignShopObjectType HANGING_SIGN()
- LivingShopObjectTypes LIVING()
- HangingSignShopObjectType getHangingSignShopObjectType()
- SignShopObjectType SIGN()
- DefaultShopObjectTypes getInstance()
- SignShopObjectType getSignShopObjectType()
- CitizensShopObjectType CITIZEN()

### Class: com.nisovin.shopkeepers.api.shopobjects.ShopObject
Type: Interface

Methods:
- void setName(String)
- Location getLocation()
- String getName()
- ShopObjectType getType()
- int getNameLengthLimit()
- boolean isSpawned()
- boolean isActive()
- String prepareName(String)

### Class: com.nisovin.shopkeepers.api.shopobjects.ShopObjectType
Type: Interface
Implements: com.nisovin.shopkeepers.api.types.SelectableType

Methods:
- String getDisplayName()
- boolean isValidSpawnLocation(Location, BlockFace)

### Class: com.nisovin.shopkeepers.api.shopobjects.ShopObjectTypesRegistry
Type: Interface
Implements: com.nisovin.shopkeepers.api.types.SelectableTypeRegistry

No public methods found

## Package: com.nisovin.shopkeepers.api.shopobjects.block

### Class: com.nisovin.shopkeepers.api.shopobjects.block.BlockShopObject
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.ShopObject

Methods:
- Block getBlock()

### Class: com.nisovin.shopkeepers.api.shopobjects.block.BlockShopObjectType
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.ShopObjectType

Methods:
- Shopkeeper getShopkeeper(Block)
- Shopkeeper getShopkeeper(String, int, int, int)
- boolean isShopkeeper(Block)
- boolean isShopkeeper(String, int, int, int)

## Package: com.nisovin.shopkeepers.api.shopobjects.citizens

### Class: com.nisovin.shopkeepers.api.shopobjects.citizens.CitizensShopObject
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.entity.EntityShopObject

No public methods found

### Class: com.nisovin.shopkeepers.api.shopobjects.citizens.CitizensShopObjectType
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.entity.EntityShopObjectType

No public methods found

## Package: com.nisovin.shopkeepers.api.shopobjects.entity

### Class: com.nisovin.shopkeepers.api.shopobjects.entity.EntityShopObject
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.ShopObject

Methods:
- Entity getEntity()

### Class: com.nisovin.shopkeepers.api.shopobjects.entity.EntityShopObjectType
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.ShopObjectType

Methods:
- Shopkeeper getShopkeeper(Entity)
- boolean isShopkeeper(Entity)

## Package: com.nisovin.shopkeepers.api.shopobjects.living

### Class: com.nisovin.shopkeepers.api.shopobjects.living.LivingShopEquipment
Type: Interface

Methods:
- Map getItems()
- void clear()
- UnmodifiableItemStack getItem(EquipmentSlot)
- void setItem(EquipmentSlot, UnmodifiableItemStack)

### Class: com.nisovin.shopkeepers.api.shopobjects.living.LivingShopObject
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.entity.EntityShopObject

Methods:
- boolean openEquipmentEditor(Player, boolean)
- EntityType getEntityType()
- LivingShopEquipment getEquipment()

### Class: com.nisovin.shopkeepers.api.shopobjects.living.LivingShopObjectType
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.entity.EntityShopObjectType

Methods:
- EntityType getEntityType()

### Class: com.nisovin.shopkeepers.api.shopobjects.living.LivingShopObjectTypes
Type: Interface

Methods:
- Collection getAll()
- LivingShopObjectType get(EntityType)

## Package: com.nisovin.shopkeepers.api.shopobjects.sign

### Class: com.nisovin.shopkeepers.api.shopobjects.sign.HangingSignShopObject
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.block.BlockShopObject

No public methods found

### Class: com.nisovin.shopkeepers.api.shopobjects.sign.HangingSignShopObjectType
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.block.BlockShopObjectType

No public methods found

### Class: com.nisovin.shopkeepers.api.shopobjects.sign.SignShopObject
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.block.BlockShopObject

No public methods found

### Class: com.nisovin.shopkeepers.api.shopobjects.sign.SignShopObjectType
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.block.BlockShopObjectType

No public methods found

## Package: com.nisovin.shopkeepers.api.shopobjects.virtual

### Class: com.nisovin.shopkeepers.api.shopobjects.virtual.VirtualShopObject
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.ShopObject

No public methods found

### Class: com.nisovin.shopkeepers.api.shopobjects.virtual.VirtualShopObjectType
Type: Interface
Implements: com.nisovin.shopkeepers.api.shopobjects.ShopObjectType

No public methods found

## Package: com.nisovin.shopkeepers.api.storage

### Class: com.nisovin.shopkeepers.api.storage.ShopkeeperStorage
Type: Interface

Methods:
- void saveImmediate()
- boolean isDirty()
- void saveDelayed()
- void save()
- void saveNow()
- void saveIfDirty()
- void saveIfDirtyAndAwaitCompletion()

## Package: com.nisovin.shopkeepers.api.trading

### Class: com.nisovin.shopkeepers.api.trading.TradeEffect
Type: Interface

Methods:
- void onTradeApplied(ShopkeeperTradeEvent)
- void onTradeAborted(ShopkeeperTradeEvent)

## Package: com.nisovin.shopkeepers.api.types

### Class: com.nisovin.shopkeepers.api.types.SelectableType
Type: Interface
Implements: com.nisovin.shopkeepers.api.types.Type

No public methods found

### Class: com.nisovin.shopkeepers.api.types.SelectableTypeRegistry
Type: Interface
Implements: com.nisovin.shopkeepers.api.types.TypeRegistry

Methods:
- SelectableType getSelection(Player)
- SelectableType getDefaultSelection(Player)
- SelectableType selectPrevious(Player)
- SelectableType selectNext(Player)
- void clearSelection(Player)
- void clearAllSelections()

### Class: com.nisovin.shopkeepers.api.types.Type
Type: Interface

Methods:
- Collection getAliases()
- String getPermission()
- String getDisplayName()
- String getIdentifier()
- boolean isEnabled()
- boolean hasPermission(Player)
- boolean matches(String)

### Class: com.nisovin.shopkeepers.api.types.TypeRegistry
Type: Interface

Methods:
- Collection getRegisteredTypes()
- void registerAll(Collection)
- Type get(String)
- Type match(String)
- void clearAll()
- void register(Type)

## Package: com.nisovin.shopkeepers.api.ui

### Class: com.nisovin.shopkeepers.api.ui.DefaultUITypes
Type: Interface

Methods:
- UIType getEditorUIType()
- UIType EDITOR()
- List getAllUITypes()
- UIType getTradingUIType()
- UIType HIRING()
- UIType getHiringUIType()
- DefaultUITypes getInstance()
- UIType EQUIPMENT_EDITOR()
- UIType TRADING()
- UIType getEquipmentEditorUIType()

### Class: com.nisovin.shopkeepers.api.ui.UIRegistry
Type: Interface
Implements: com.nisovin.shopkeepers.api.types.TypeRegistry

Methods:
- void abortUISessionsDelayed(Shopkeeper)
- void abortUISessions()
- void abortUISessions(Shopkeeper)
- Collection getUISessions()
- Collection getUISessions(Shopkeeper)
- Collection getUISessions(Shopkeeper, UIType)
- Collection getUISessions(UIType)
- UISession getUISession(Player)

### Class: com.nisovin.shopkeepers.api.ui.UISession
Type: Interface

Methods:
- void deactivateUI()
- void closeDelayedAndRunTask(Runnable)
- Player getPlayer()
- Shopkeeper getShopkeeper()
- void abortDelayed()
- void abortDelayedAndRunTask(Runnable)
- void abort()
- void closeDelayed()
- boolean isValid()
- boolean isUIActive()
- void close()
- void activateUI()
- UIType getUIType()

### Class: com.nisovin.shopkeepers.api.ui.UIType
Type: Interface
Implements: com.nisovin.shopkeepers.api.types.Type

No public methods found

## Package: com.nisovin.shopkeepers.api.user

### Class: com.nisovin.shopkeepers.api.user.User
Type: Interface

Methods:
- OfflinePlayer getOfflinePlayer()
- Player getPlayer()
- String getName()
- String getDisplayName()
- boolean isOnline()
- String getLastKnownName()
- UUID getUniqueId()

## Package: com.nisovin.shopkeepers.api.util

### Class: com.nisovin.shopkeepers.api.util.UnmodifiableItemStack
Type: Interface
Implements: org.bukkit.configuration.serialization.ConfigurationSerializable

Methods:
- int getMaxStackSize()
- int getEnchantmentLevel(Enchantment)
- boolean containsEnchantment(Enchantment)
- ItemMeta getItemMeta()
- Map getEnchantments()
- Map serialize()
- boolean hasItemMeta()
- Material getType()
- boolean equals(ItemStack)
- boolean equals(Object)
- UnmodifiableItemStack of(ItemStack)
- UnmodifiableItemStack ofNonNull(ItemStack)
- ItemStack copy()
- boolean isSimilar(ItemStack)
- boolean isSimilar(UnmodifiableItemStack)
- UnmodifiableItemStack shallowCopy()
- int getAmount()

### Class: com.nisovin.shopkeepers.api.util.ChunkCoords
Type: Class

Methods:
- String getWorldName()
- boolean isChunkLoaded(Location)
- boolean isChunkLoaded()
- int fromBlock(int)
- ChunkCoords fromBlock(String, int, int)
- World getWorld()
- boolean isSameChunk(Location, Location)
- int getChunkZ()
- int hashCode()
- Chunk getChunk()
- int getChunkX()
- boolean equals(Object)
- String toString()
- boolean matches(String, int, int)
- boolean matches(Chunk)

