# Shopkeepers-2.23.10 API Reference

## Package: com.nisovin.shopkeepers

### Class: com.nisovin.shopkeepers.SKShopkeepersPlugin
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin
Implements: com.nisovin.shopkeepers.api.internal.InternalShopkeepersPlugin

Methods:
- SKDefaultShopTypes getDefaultShopTypes()
- DefaultShopTypes getDefaultShopTypes()
- ApiInternals getApiInternals()
- SKDefaultShopObjectTypes getDefaultShopObjectTypes()
- DefaultShopObjectTypes getDefaultShopObjectTypes()
- RemoveShopOnContainerBreak getRemoveShopOnContainerBreak()
- ForcingEntityTeleporter getForcingEntityTeleporter()
- void onEnable()
- SKUIRegistry getUIRegistry()
- UIRegistry getUIRegistry()
- void onDisable()
- Commands getCommands()
- void reload()
- LivingShops getLivingShops()
- TradeNotifications getTradeNotifications()
- SKShopTypesRegistry getShopTypeRegistry()
- ShopTypesRegistry getShopTypeRegistry()
- ChatInput getChatInput()
- SKShopObjectTypesRegistry getShopObjectTypeRegistry()
- ShopObjectTypesRegistry getShopObjectTypeRegistry()
- ShopkeeperCreation getShopkeeperCreation()
- boolean hasCreatePermission(Player)
- ShopkeeperNaming getShopkeeperNaming()
- InteractionInput getInteractionInput()
- ProtectedContainers getProtectedContainers()
- BaseBlockShops getBlockShops()
- SKShopkeeperStorage getShopkeeperStorage()
- ShopkeeperStorage getShopkeeperStorage()
- AbstractShopkeeper handleShopkeeperCreation(ShopCreationData)
- Shopkeeper handleShopkeeperCreation(ShopCreationData)
- int updateItems()
- SKShopkeeperRegistry getShopkeeperRegistry()
- ShopkeeperRegistry getShopkeeperRegistry()
- RegularVillagers getRegularVillagers()
- CitizensShops getCitizensShops()
- SKDefaultUITypes getDefaultUITypes()
- DefaultUITypes getDefaultUITypes()
- boolean isPluginEnabled()
- ShopkeeperMoving getShopkeeperMoving()
- void onLoad()
- PlayerShops getPlayerShops()
- SKShopkeepersPlugin getInstance()
- ForcingCreatureSpawner getForcingCreatureSpawner()

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

## Package: com.nisovin.shopkeepers.commands

### Class: com.nisovin.shopkeepers.commands.Commands
Type: Class

Methods:
- ShopkeepersCommand getShopkeepersCommand()
- void onPlayerQuit(Player)
- void onEnable()
- void onDisable()

### Class: com.nisovin.shopkeepers.commands.Confirmations
Type: Class

Methods:
- void awaitConfirmation(CommandSender, Runnable)
- void awaitConfirmation(CommandSender, Runnable, int)
- Runnable endConfirmation(CommandSender)
- void onPlayerQuit(Player)
- void onEnable()
- void handleConfirmation(CommandSender)
- void onDisable()

## Package: com.nisovin.shopkeepers.commands.arguments

### Class: com.nisovin.shopkeepers.commands.arguments.AmbiguousShopkeeperNameHandler
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.ambiguity.AmbiguousInputHandler

No public methods found

### Class: com.nisovin.shopkeepers.commands.arguments.AmbiguousTargetShopkeeperHandler
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.ambiguity.AmbiguousInputHandler

No public methods found

### Class: com.nisovin.shopkeepers.commands.arguments.AmbiguousUserNameHandler
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.AbstractAmbiguousPlayerNameHandler

No public methods found

### Class: com.nisovin.shopkeepers.commands.arguments.EntityFilter
Type: Class

Methods:
- boolean isRegularVillager(Entity)

### Class: com.nisovin.shopkeepers.commands.arguments.ShopObjectTypeArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- ShopObjectType parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.arguments.ShopTypeArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- ShopType parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.arguments.ShopkeeperArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Shopkeeper getShopkeeper(String) throws ArgumentRejectedException
- Shopkeeper parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.arguments.ShopkeeperByIdArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectByIdArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.arguments.ShopkeeperByNameArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectByIdArgument

Methods:
- Shopkeeper getDefaultShopkeeperByName(String) throws ArgumentRejectedException

### Class: com.nisovin.shopkeepers.commands.arguments.ShopkeeperByUUIDArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectByIdArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.arguments.ShopkeeperFilter
Type: Class

Methods:
- ArgumentFilter withAccess(UIType)

### Class: com.nisovin.shopkeepers.commands.arguments.ShopkeeperIdArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectIdArgument

Methods:
- Iterable getDefaultCompletionSuggestions(CommandInput, CommandContextView, int, String, ArgumentFilter)

### Class: com.nisovin.shopkeepers.commands.arguments.ShopkeeperNameArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectNameArgument

Methods:
- Iterable getDefaultCompletionSuggestions(CommandInput, CommandContextView, int, String, ArgumentFilter)

### Class: com.nisovin.shopkeepers.commands.arguments.ShopkeeperUUIDArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectUUIDArgument

Methods:
- Iterable getDefaultCompletionSuggestions(CommandInput, CommandContextView, int, String, ArgumentFilter)

### Class: com.nisovin.shopkeepers.commands.arguments.TargetShopkeeperArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Shopkeeper parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- boolean isOptional()
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.arguments.TargetShopkeeperFallback
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.TypedFallbackArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.arguments.UserArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- User getUserByName(String) throws ArgumentRejectedException
- User parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.arguments.UserByNameArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectByIdArgument

Methods:
- User getDefaultUserByName(String) throws ArgumentRejectedException

### Class: com.nisovin.shopkeepers.commands.arguments.UserByUUIDArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectByIdArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.arguments.UserNameArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectNameArgument

Methods:
- Iterable getDefaultCompletionSuggestions(CommandInput, CommandContextView, int, String, ArgumentFilter, boolean)
- Text getMissingArgumentErrorMsg()

### Class: com.nisovin.shopkeepers.commands.arguments.UserUUIDArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectUUIDArgument

Methods:
- Iterable getDefaultCompletionSuggestions(CommandInput, CommandContextView, int, String, ArgumentFilter)
- Text getMissingArgumentErrorMsg()

## Package: com.nisovin.shopkeepers.commands.arguments.snapshot

### Class: com.nisovin.shopkeepers.commands.arguments.snapshot.ShopkeeperSnapshotIndexArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- String getReducedFormat()
- Integer parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.arguments.snapshot.ShopkeeperSnapshotIndexByIdArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectByIdArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.arguments.snapshot.ShopkeeperSnapshotIndexByNameArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectByIdArgument

No public methods found

## Package: com.nisovin.shopkeepers.commands.lib

### Class: com.nisovin.shopkeepers.commands.lib.BaseCommand
Type: Abstract Class
Extends: com.nisovin.shopkeepers.commands.lib.Command
Implements: org.bukkit.command.CommandExecutor, org.bukkit.command.TabCompleter

Methods:
- boolean onCommand(CommandSender, Command, String, String[])
- List onTabComplete(CommandSender, Command, String, String[])

### Class: com.nisovin.shopkeepers.commands.lib.Command
Type: Abstract Class

Methods:
- boolean isHiddenInOwnHelp()
- Command getParent()
- List getAliases()
- String getPermission()
- String getName()
- CommandRegistry getChildCommands()
- void processCommand(CommandInput) throws CommandException
- CommandArgument getArgument(String)
- Command getRootCommand()
- Text getDescription()
- void checkCommandSource(CommandSender) throws CommandSourceRejectedException
- void handleCommand(CommandInput)
- void checkPermission(CommandSender) throws NoPermissionException
- void checkPermission(CommandSender, String) throws NoPermissionException
- String getCommandFormat()
- boolean isAccepted(CommandSender)
- boolean testPermission(CommandSender)
- List handleTabCompletion(CommandInput)
- MessageArguments getCommonMessageArgs()
- String getUsageFormat()
- List getArguments()
- boolean isHiddenInParentHelp()
- String getArgumentsFormat()
- void sendHelp(CommandSender) throws NoPermissionException
- boolean isIncludeChildsInParentHelp()

### Class: com.nisovin.shopkeepers.commands.lib.CommandException
Type: Class
Extends: java.lang.Exception

Methods:
- Text getMessageText()

### Class: com.nisovin.shopkeepers.commands.lib.CommandInput
Type: Class

Methods:
- Command getCommand()
- List getArguments()
- String getCommandAlias()
- String toString()
- CommandSender getSender()

### Class: com.nisovin.shopkeepers.commands.lib.CommandRegistry
Type: Class

Methods:
- Set getAliases()
- List getAliases(Command)
- Command getParent()
- Command getCommand(String)
- void unregister(Command)
- Map getAliasesMap()
- boolean isRegistered(Command)
- Collection getCommands()
- void register(Command)

### Class: com.nisovin.shopkeepers.commands.lib.CommandSourceRejectedException
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.CommandException

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.CommandUtils
Type: Class

Methods:
- String normalize(String)

### Class: com.nisovin.shopkeepers.commands.lib.NoPermissionException
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.CommandException

No public methods found

## Package: com.nisovin.shopkeepers.commands.lib.argument

### Class: com.nisovin.shopkeepers.commands.lib.argument.ArgumentParseException
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.CommandException

Methods:
- CommandArgument getArgument()

### Class: com.nisovin.shopkeepers.commands.lib.argument.ArgumentsReader
Type: Class

Methods:
- String next() throws NoSuchElementException
- int getCursor()
- boolean hasNext()
- int getRemainingSize()
- List getArgs()
- String peek() throws NoSuchElementException
- String currentIfPresent()
- boolean hasCurrent()
- String peekIfPresent()
- String nextIfPresent()
- String current() throws NoSuchElementException
- int getSize()
- int hashCode()
- boolean equals(Object)
- ArgumentsReader createSnapshot()
- void setState(ArgumentsReader)
- String toString()
- void setCursor(int)
- ArgumentsReaderView getView()

### Class: com.nisovin.shopkeepers.commands.lib.argument.ArgumentsReaderView
Type: Class

Methods:
- boolean hasCurrent()
- int getCursor()
- String peekIfPresent()
- String current() throws NoSuchElementException
- int getSize()
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean hasNext()
- int getRemainingSize()
- List getArgs()
- String peek() throws NoSuchElementException
- String currentIfPresent()

### Class: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument
Type: Abstract Class

Methods:
- Text getRequiresPlayerErrorMsg()
- CommandArgument getParent()
- String getName()
- Text getInvalidArgumentErrorMsg(String)
- String getReducedFormat()
- CommandArgument optional()
- Object parse(CommandInput, CommandContext, ArgumentsReader) throws ArgumentParseException
- boolean isOptional()
- MissingArgumentException missingArgumentError()
- CommandArgument setDisplayName(String)
- Text getMissingArgumentErrorMsg()
- String getDisplayName()
- CommandArgument orDefaultValue(Object)
- InvalidArgumentException invalidArgumentError(String)
- String toString()
- String getFormat()
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- void setParent(CommandArgument)
- List complete(CommandInput, CommandContextView, ArgumentsReader)
- CommandArgument getRootArgument()
- MessageArguments getDefaultErrorMsgArgs()

### Class: com.nisovin.shopkeepers.commands.lib.argument.InvalidArgumentException
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.ArgumentParseException

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.argument.MissingArgumentException
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.ArgumentParseException

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.argument.RequiresPlayerArgumentException
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.ArgumentParseException

No public methods found

## Package: com.nisovin.shopkeepers.commands.lib.argument.ambiguity

### Class: com.nisovin.shopkeepers.commands.lib.argument.ambiguity.AmbiguousInputHandler
Type: Abstract Class

Methods:
- boolean isInputAmbiguous()
- Text getErrorMsg()
- Object getFirstMatch()

## Package: com.nisovin.shopkeepers.commands.lib.argument.fallback

### Class: com.nisovin.shopkeepers.commands.lib.argument.fallback.FallbackArgument
Type: Abstract Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Object parseFallback(CommandInput, CommandContext, ArgumentsReader, FallbackArgumentException, boolean) throws ArgumentParseException

### Class: com.nisovin.shopkeepers.commands.lib.argument.fallback.FallbackArgumentException
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.ArgumentParseException

Methods:
- ArgumentParseException getRootException()
- FallbackArgument getArgument()
- CommandArgument getArgument()
- ArgumentParseException getOriginalException()

## Package: com.nisovin.shopkeepers.commands.lib.argument.filter

### Class: com.nisovin.shopkeepers.commands.lib.argument.filter.ArgumentFilter
Type: Abstract Class

Methods:
- ArgumentFilter acceptAny()
- ArgumentRejectedException rejectedArgumentException(CommandArgument, String, Object)
- boolean test(CommandInput, CommandContextView, Object)
- ArgumentFilter and(ArgumentFilter)
- Text getInvalidArgumentErrorMsg(CommandArgument, String, Object)

### Class: com.nisovin.shopkeepers.commands.lib.argument.filter.ArgumentRejectedException
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.InvalidArgumentException

No public methods found

## Package: com.nisovin.shopkeepers.commands.lib.arguments

### Class: com.nisovin.shopkeepers.commands.lib.arguments.AbstractAmbiguousPlayerNameHandler
Type: Abstract Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.ambiguity.AmbiguousInputHandler

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.AmbiguousPlayerEntryNameHandler
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.AbstractAmbiguousPlayerNameHandler

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.AmbiguousPlayerNameHandler
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.AbstractAmbiguousPlayerNameHandler

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.AnyFallbackArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.fallback.FallbackArgument

Methods:
- CommandArgument getFallbackArgument()
- Object parseFallback(CommandInput, CommandContext, ArgumentsReader, FallbackArgumentException, boolean) throws ArgumentParseException
- Text getInvalidArgumentErrorMsg(String)
- String getReducedFormat()
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parse(CommandInput, CommandContext, ArgumentsReader) throws ArgumentParseException
- boolean isOptional()
- List complete(CommandInput, CommandContextView, ArgumentsReader)
- Text getMissingArgumentErrorMsg()
- CommandArgument getOriginalArgument()

### Class: com.nisovin.shopkeepers.commands.lib.arguments.AnyStringFallback
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.TypedFallbackArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.BooleanArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Boolean parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.BoundedDoubleArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.DoubleArgument

Methods:
- Double parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException

### Class: com.nisovin.shopkeepers.commands.lib.arguments.BoundedIntegerArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.IntegerArgument

Methods:
- Integer parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException

### Class: com.nisovin.shopkeepers.commands.lib.arguments.CompoundArgument
Type: Abstract Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- String getReducedFormat()
- List getArguments()
- String getFormat()
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- boolean isOptional()
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.DefaultValueFallback
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.TypedFallbackArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.DoubleArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Double parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.EntityArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Entity parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.EntityByUUIDArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectByIdArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.EntityUUIDArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectUUIDArgument

Methods:
- Iterable getDefaultCompletionSuggestions(CommandInput, CommandContextView, int, String, ArgumentFilter)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.EnumArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Enum parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.FirstOfArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.fallback.FallbackArgument

Methods:
- Pair parseFallback(CommandInput, CommandContext, ArgumentsReader, FallbackArgumentException, boolean) throws ArgumentParseException
- Object parseFallback(CommandInput, CommandContext, ArgumentsReader, FallbackArgumentException, boolean) throws ArgumentParseException
- String getReducedFormat()
- Pair parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Pair parse(CommandInput, CommandContext, ArgumentsReader) throws ArgumentParseException
- Object parse(CommandInput, CommandContext, ArgumentsReader) throws ArgumentParseException
- boolean isOptional()
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.FixedValueArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- boolean isOptional()
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.FixedValuesArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.IntegerArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Integer parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.LiteralArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- String getReducedFormat()
- String parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)
- CommandArgument setDisplayName(String)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.NamedArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.fallback.FallbackArgument

Methods:
- Text getRequiresPlayerErrorMsg()
- Object parseFallback(CommandInput, CommandContext, ArgumentsReader, FallbackArgumentException, boolean) throws ArgumentParseException
- Text getInvalidArgumentErrorMsg(String)
- String getReducedFormat()
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parse(CommandInput, CommandContext, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)
- Text getMissingArgumentErrorMsg()

### Class: com.nisovin.shopkeepers.commands.lib.arguments.ObjectByIdArgument
Type: Abstract Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)
- Text getMissingArgumentErrorMsg()

### Class: com.nisovin.shopkeepers.commands.lib.arguments.ObjectIdArgument
Type: Abstract Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.ObjectNameArgument
Type: Abstract Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectIdArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.ObjectUUIDArgument
Type: Abstract Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectIdArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.OptionalArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.fallback.FallbackArgument

Methods:
- Text getRequiresPlayerErrorMsg()
- Object parseFallback(CommandInput, CommandContext, ArgumentsReader, FallbackArgumentException, boolean) throws ArgumentParseException
- Text getInvalidArgumentErrorMsg(String)
- String getReducedFormat()
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parse(CommandInput, CommandContext, ArgumentsReader) throws ArgumentParseException
- boolean isOptional()
- List complete(CommandInput, CommandContextView, ArgumentsReader)
- Text getMissingArgumentErrorMsg()

### Class: com.nisovin.shopkeepers.commands.lib.arguments.PlayerArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Player getPlayerByName(String) throws ArgumentRejectedException
- Player parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.PlayerByNameArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectByIdArgument

Methods:
- Player getDefaultPlayerByName(String) throws ArgumentRejectedException

### Class: com.nisovin.shopkeepers.commands.lib.arguments.PlayerByUUIDArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectByIdArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.PlayerNameArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectNameArgument

Methods:
- Iterable getDefaultCompletionSuggestions(CommandInput, CommandContextView, int, String, ArgumentFilter, boolean)
- Text getMissingArgumentErrorMsg()

### Class: com.nisovin.shopkeepers.commands.lib.arguments.PlayerUUIDArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.ObjectUUIDArgument

Methods:
- Iterable getDefaultCompletionSuggestions(CommandInput, CommandContextView, int, String, ArgumentFilter)
- Text getMissingArgumentErrorMsg()

### Class: com.nisovin.shopkeepers.commands.lib.arguments.PositiveIntegerArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.BoundedIntegerArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.SenderPlayerFallback
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.TypedFallbackArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.SenderPlayerNameFallback
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.TypedFallbackArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.StringArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- boolean isJoiningRemainingArgs()
- String getJoinedRemainingArgs(ArgumentsReader)
- String parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.TargetEntityArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Entity parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- boolean isOptional()
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.TargetEntityFallback
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.arguments.TypedFallbackArgument

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.arguments.TransformedArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.fallback.FallbackArgument

Methods:
- Object parseFallback(CommandInput, CommandContext, ArgumentsReader, FallbackArgumentException, boolean) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.TrileanArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- Trilean parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.TypedFallbackArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.fallback.FallbackArgument

Methods:
- CommandArgument getFallbackArgument()
- Object parseFallback(CommandInput, CommandContext, ArgumentsReader, FallbackArgumentException, boolean) throws ArgumentParseException
- Text getInvalidArgumentErrorMsg(String)
- String getReducedFormat()
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parse(CommandInput, CommandContext, ArgumentsReader) throws ArgumentParseException
- boolean isOptional()
- List complete(CommandInput, CommandContextView, ArgumentsReader)
- Text getMissingArgumentErrorMsg()
- CommandArgument getOriginalArgument()

### Class: com.nisovin.shopkeepers.commands.lib.arguments.TypedFirstOfArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.fallback.FallbackArgument

Methods:
- Object parseFallback(CommandInput, CommandContext, ArgumentsReader, FallbackArgumentException, boolean) throws ArgumentParseException
- String getReducedFormat()
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parse(CommandInput, CommandContext, ArgumentsReader) throws ArgumentParseException
- boolean isOptional()
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.UUIDArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- UUID parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

### Class: com.nisovin.shopkeepers.commands.lib.arguments.WorldArgument
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.argument.CommandArgument

Methods:
- World parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- Object parseValue(CommandInput, CommandContextView, ArgumentsReader) throws ArgumentParseException
- List complete(CommandInput, CommandContextView, ArgumentsReader)

## Package: com.nisovin.shopkeepers.commands.lib.commands

### Class: com.nisovin.shopkeepers.commands.lib.commands.HelpCommand
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.Command

No public methods found

### Class: com.nisovin.shopkeepers.commands.lib.commands.PlayerCommand
Type: Abstract Class
Extends: com.nisovin.shopkeepers.commands.lib.Command

Methods:
- CommandSourceRejectedException createCommandSourceRejectedException(CommandSender)
- boolean isAccepted(CommandSender)
- void checkCommandSource(CommandSender) throws CommandSourceRejectedException

## Package: com.nisovin.shopkeepers.commands.lib.context

### Class: com.nisovin.shopkeepers.commands.lib.context.CommandContext
Type: Interface

Methods:
- Object getOrDefault(String, Object)
- Object getOrDefault(String, Supplier)
- Map getMapView()
- Object get(String)
- CommandContext copy()
- boolean has(String)
- Object getOrNull(String)
- CommandContextView getView()
- void put(String, Object)

### Class: com.nisovin.shopkeepers.commands.lib.context.BufferedCommandContext
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.context.SimpleCommandContext

Methods:
- void applyBuffer()
- void applyBuffer(CommandContext)
- Map getMapView()
- void clearBuffer()
- String toString()
- CommandContext copy()
- boolean has(String)
- Object getOrNull(String)
- CommandContext getParentContext()
- CommandContextView getView()

### Class: com.nisovin.shopkeepers.commands.lib.context.CommandContextView
Type: Class
Implements: com.nisovin.shopkeepers.commands.lib.context.CommandContext

Methods:
- Object getOrDefault(String, Object)
- Object getOrDefault(String, Supplier)
- Map getMapView()
- Object get(String)
- String toString()
- CommandContext copy()
- boolean has(String)
- Object getOrNull(String)
- CommandContextView getView()
- void put(String, Object)

### Class: com.nisovin.shopkeepers.commands.lib.context.SimpleCommandContext
Type: Class
Implements: com.nisovin.shopkeepers.commands.lib.context.CommandContext

Methods:
- Object getOrDefault(String, Object)
- Object getOrDefault(String, Supplier)
- Map getMapView()
- Object get(String)
- String toString()
- CommandContext copy()
- boolean has(String)
- Object getOrNull(String)
- CommandContextView getView()
- void put(String, Object)

## Package: com.nisovin.shopkeepers.commands.lib.util

### Class: com.nisovin.shopkeepers.commands.lib.util.ObjectMatcher
Type: Interface

Methods:
- Stream match(String)

### Class: com.nisovin.shopkeepers.commands.lib.util.PlayerArgumentUtils
Type: Class

Methods:
- boolean handleAmbiguousPlayerName(CommandSender, String, Iterable)
- boolean handleAmbiguousPlayerName(CommandSender, String, Iterable, int)

## Package: com.nisovin.shopkeepers.commands.shopkeepers

### Class: com.nisovin.shopkeepers.commands.shopkeepers.ShopkeepersCommand
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.BaseCommand

Methods:
- boolean testPermission(CommandSender)

## Package: com.nisovin.shopkeepers.commands.shopkeepers.snapshot

### Class: com.nisovin.shopkeepers.commands.shopkeepers.snapshot.CommandSnapshot
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.Command

No public methods found

### Class: com.nisovin.shopkeepers.commands.shopkeepers.snapshot.CommandSnapshotHelp
Type: Class
Extends: com.nisovin.shopkeepers.commands.lib.commands.HelpCommand

No public methods found

## Package: com.nisovin.shopkeepers.commands.util

### Class: com.nisovin.shopkeepers.commands.util.ShopkeeperArgumentUtils
Type: Class

Methods:
- ShopkeeperArgumentUtils$OwnedPlayerShopsResult getOwnedPlayerShops(UUID, String)
- ShopkeeperArgumentUtils$TargetShopkeepersResult findTargetedShopkeepers(Player, ShopkeeperArgumentUtils$TargetShopkeeperFilter)
- List getTargetedShopkeepers(Player, ShopkeeperArgumentUtils$TargetShopkeeperFilter)
- List getTargetedShopkeepers(CommandSender, ShopkeeperArgumentUtils$TargetShopkeeperFilter)

### Class: com.nisovin.shopkeepers.commands.util.UserArgumentUtils
Type: Class

Methods:
- User findUser(UUID)
- Stream getKnownUsers()
- boolean handleAmbiguousUserName(CommandSender, String, Iterable)
- boolean handleAmbiguousUserName(CommandSender, String, Iterable, int)

## Package: com.nisovin.shopkeepers.compat

### Class: com.nisovin.shopkeepers.compat.CompatProvider
Type: Interface

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- void setupSpawnedEntity(Entity)
- void setCowVariant(Cow, NamespacedKey)
- void overwriteLivingEntityAI(LivingEntity)
- boolean supportsItemSNBTHoverEvents()
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- void onEnable()
- void setOnGround(Entity, boolean)
- void onDisable()
- void setSalmonVariant(Salmon, String)
- String getVersionId()
- NamespacedKey cycleChickenVariant(NamespacedKey, boolean)
- void prepareEntity(Entity)
- void setPigVariant(Pig, NamespacedKey)
- void setNoclip(Entity)
- NamespacedKey cyclePigVariant(NamespacedKey, boolean)
- NamespacedKey cycleCowVariant(NamespacedKey, boolean)
- boolean matches(ItemStack, UnmodifiableItemStack)
- boolean matches(ItemStack, ItemStack)
- void tickAI(LivingEntity, int)
- boolean isNoAIDisablingGravity()
- boolean supportsCustomMobAI()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- void setChickenVariant(Chicken, NamespacedKey)
- CompatVersion getCompatVersion()
- void updateTrades(Player)
- String getItemSNBT(ItemStack)

### Class: com.nisovin.shopkeepers.compat.Compat
Type: Class

Methods:
- boolean hasProvider()
- boolean load(Plugin)
- CompatVersion getCompatVersion(String)
- CompatProvider getProvider()

### Class: com.nisovin.shopkeepers.compat.CompatVersion
Type: Class

Methods:
- String getFirstMinecraftVersion()
- String getVariant()
- int hashCode()
- boolean equals(Object)
- String getCompatVersion()
- String toString()
- List getSupportedServerVersions()
- boolean hasVariant()
- String getFirstMappingsVersion()

### Class: com.nisovin.shopkeepers.compat.FallbackCompatProvider
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- boolean supportsCustomMobAI()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- String getVersionId()
- void overwriteLivingEntityAI(LivingEntity)
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- void updateTrades(Player)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- String getItemSNBT(ItemStack)
- void setNoclip(Entity)

### Class: com.nisovin.shopkeepers.compat.MC_1_21_3
Type: Class

Methods:
- boolean isAvailable()
- void init()

### Class: com.nisovin.shopkeepers.compat.MC_1_21_4
Type: Class

Methods:
- boolean isAvailable()
- void init()

### Class: com.nisovin.shopkeepers.compat.ServerAssumptionsTest
Type: Class

Methods:
- boolean run()

### Class: com.nisovin.shopkeepers.compat.ServerVersion
Type: Class

Methods:
- String getMappingsVersion()
- int hashCode()
- boolean equals(Object)
- String getMinecraftVersion()
- String toString()

## Package: com.nisovin.shopkeepers.compat.v1_20_R5

### Class: com.nisovin.shopkeepers.compat.v1_20_R5.CompatProviderImpl
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- Class getCraftMagicNumbersClass()
- void overwriteLivingEntityAI(LivingEntity)
- boolean supportsItemSNBTHoverEvents()
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- boolean isNoAIDisablingGravity()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- String getVersionId()
- void updateTrades(Player)
- String getItemSNBT(ItemStack)
- void setNoclip(Entity)

## Package: com.nisovin.shopkeepers.compat.v1_21_R1

### Class: com.nisovin.shopkeepers.compat.v1_21_R1.CompatProviderImpl
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- Class getCraftMagicNumbersClass()
- void overwriteLivingEntityAI(LivingEntity)
- boolean supportsItemSNBTHoverEvents()
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- boolean isNoAIDisablingGravity()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- String getVersionId()
- void updateTrades(Player)
- String getItemSNBT(ItemStack)
- void setNoclip(Entity)

## Package: com.nisovin.shopkeepers.compat.v1_21_R2

### Class: com.nisovin.shopkeepers.compat.v1_21_R2.CompatProviderImpl
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- Class getCraftMagicNumbersClass()
- void overwriteLivingEntityAI(LivingEntity)
- boolean supportsItemSNBTHoverEvents()
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- boolean isNoAIDisablingGravity()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- String getVersionId()
- void updateTrades(Player)
- String getItemSNBT(ItemStack)
- void setNoclip(Entity)

## Package: com.nisovin.shopkeepers.compat.v1_21_R3

### Class: com.nisovin.shopkeepers.compat.v1_21_R3.CompatProviderImpl
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- Class getCraftMagicNumbersClass()
- void overwriteLivingEntityAI(LivingEntity)
- boolean supportsItemSNBTHoverEvents()
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- void setSalmonVariant(Salmon, String)
- boolean isNoAIDisablingGravity()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- String getVersionId()
- void updateTrades(Player)
- String getItemSNBT(ItemStack)
- void setNoclip(Entity)

## Package: com.nisovin.shopkeepers.compat.v1_21_R4

### Class: com.nisovin.shopkeepers.compat.v1_21_R4.CompatProviderImpl
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- Class getCraftMagicNumbersClass()
- void overwriteLivingEntityAI(LivingEntity)
- boolean supportsItemSNBTHoverEvents()
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- void setSalmonVariant(Salmon, String)
- boolean isNoAIDisablingGravity()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- String getVersionId()
- void updateTrades(Player)
- String getItemSNBT(ItemStack)
- void setNoclip(Entity)

## Package: com.nisovin.shopkeepers.compat.v1_21_R5

### Class: com.nisovin.shopkeepers.compat.v1_21_R5.CompatProviderImpl
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- NamespacedKey cyclePigVariant(NamespacedKey, boolean)
- Class getCraftMagicNumbersClass()
- void setCowVariant(Cow, NamespacedKey)
- void overwriteLivingEntityAI(LivingEntity)
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- NamespacedKey cycleCowVariant(NamespacedKey, boolean)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- void setSalmonVariant(Salmon, String)
- boolean isNoAIDisablingGravity()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- String getVersionId()
- NamespacedKey cycleChickenVariant(NamespacedKey, boolean)
- void setChickenVariant(Chicken, NamespacedKey)
- void updateTrades(Player)
- String getItemSNBT(ItemStack)
- void setPigVariant(Pig, NamespacedKey)
- void setNoclip(Entity)

## Package: com.nisovin.shopkeepers.compat.v1_21_R5_paper

### Class: com.nisovin.shopkeepers.compat.v1_21_R5_paper.CompatProviderImpl
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- NamespacedKey cyclePigVariant(NamespacedKey, boolean)
- Class getCraftMagicNumbersClass()
- void setCowVariant(Cow, NamespacedKey)
- void overwriteLivingEntityAI(LivingEntity)
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- NamespacedKey cycleCowVariant(NamespacedKey, boolean)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- void setSalmonVariant(Salmon, String)
- boolean isNoAIDisablingGravity()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- String getVersionId()
- NamespacedKey cycleChickenVariant(NamespacedKey, boolean)
- void setChickenVariant(Chicken, NamespacedKey)
- void updateTrades(Player)
- String getItemSNBT(ItemStack)
- void setPigVariant(Pig, NamespacedKey)
- void setNoclip(Entity)

## Package: com.nisovin.shopkeepers.compat.v1_21_R6

### Class: com.nisovin.shopkeepers.compat.v1_21_R6.CompatProviderImpl
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- NamespacedKey cyclePigVariant(NamespacedKey, boolean)
- Class getCraftMagicNumbersClass()
- void setCowVariant(Cow, NamespacedKey)
- void overwriteLivingEntityAI(LivingEntity)
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- NamespacedKey cycleCowVariant(NamespacedKey, boolean)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- void setSalmonVariant(Salmon, String)
- boolean isNoAIDisablingGravity()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- String getVersionId()
- NamespacedKey cycleChickenVariant(NamespacedKey, boolean)
- void setChickenVariant(Chicken, NamespacedKey)
- void updateTrades(Player)
- String getItemSNBT(ItemStack)
- void setPigVariant(Pig, NamespacedKey)
- void setNoclip(Entity)

## Package: com.nisovin.shopkeepers.compat.v1_21_R6_paper

### Class: com.nisovin.shopkeepers.compat.v1_21_R6_paper.CompatProviderImpl
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- NamespacedKey cyclePigVariant(NamespacedKey, boolean)
- Class getCraftMagicNumbersClass()
- void setCowVariant(Cow, NamespacedKey)
- void overwriteLivingEntityAI(LivingEntity)
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- NamespacedKey cycleCowVariant(NamespacedKey, boolean)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- void setSalmonVariant(Salmon, String)
- boolean isNoAIDisablingGravity()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- String getVersionId()
- NamespacedKey cycleChickenVariant(NamespacedKey, boolean)
- void setChickenVariant(Chicken, NamespacedKey)
- void updateTrades(Player)
- String getItemSNBT(ItemStack)
- void setPigVariant(Pig, NamespacedKey)
- void setNoclip(Entity)

## Package: com.nisovin.shopkeepers.compat.v1_21_R7

### Class: com.nisovin.shopkeepers.compat.v1_21_R7.CompatProviderImpl
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- NamespacedKey cyclePigVariant(NamespacedKey, boolean)
- Class getCraftMagicNumbersClass()
- void setCowVariant(Cow, NamespacedKey)
- void overwriteLivingEntityAI(LivingEntity)
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- NamespacedKey cycleCowVariant(NamespacedKey, boolean)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- void setSalmonVariant(Salmon, String)
- boolean isNoAIDisablingGravity()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- String getVersionId()
- NamespacedKey cycleChickenVariant(NamespacedKey, boolean)
- void setChickenVariant(Chicken, NamespacedKey)
- void updateTrades(Player)
- String getItemSNBT(ItemStack)
- void setPigVariant(Pig, NamespacedKey)
- void setNoclip(Entity)

## Package: com.nisovin.shopkeepers.compat.v1_21_R7_paper

### Class: com.nisovin.shopkeepers.compat.v1_21_R7_paper.CompatProviderImpl
Type: Class
Implements: com.nisovin.shopkeepers.compat.CompatProvider

Methods:
- ItemStackComponentsData getItemStackComponentsData(ItemStack)
- NamespacedKey cyclePigVariant(NamespacedKey, boolean)
- Class getCraftMagicNumbersClass()
- void setCowVariant(Cow, NamespacedKey)
- void overwriteLivingEntityAI(LivingEntity)
- ItemStack deserializeItemStack(int, NamespacedKey, int, ItemStackComponentsData)
- NamespacedKey cycleCowVariant(NamespacedKey, boolean)
- boolean matches(ItemStack, ItemStack)
- void setOnGround(Entity, boolean)
- void tickAI(LivingEntity, int)
- void setSalmonVariant(Salmon, String)
- boolean isNoAIDisablingGravity()
- boolean isDestroyingBlocks(EntityExplodeEvent)
- boolean isDestroyingBlocks(BlockExplodeEvent)
- String getVersionId()
- NamespacedKey cycleChickenVariant(NamespacedKey, boolean)
- void setChickenVariant(Chicken, NamespacedKey)
- void updateTrades(Player)
- String getItemSNBT(ItemStack)
- void setPigVariant(Pig, NamespacedKey)
- void setNoclip(Entity)

## Package: com.nisovin.shopkeepers.component

### Class: com.nisovin.shopkeepers.component.Component
Type: Abstract Class

Methods:
- Set getProvidedServices()
- int hashCode()
- boolean equals(Object)
- ComponentHolder getHolder()

### Class: com.nisovin.shopkeepers.component.ComponentHolder
Type: Class

Methods:
- void add(Component)
- int hashCode()
- Component getOrAdd(Class)
- boolean equals(Object)
- Component get(Class)
- Collection getComponents()
- String toString()
- Object getService(Class)
- Component remove(Class)
- Component remove(Component)

## Package: com.nisovin.shopkeepers.config

### Class: com.nisovin.shopkeepers.config.Settings
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.Config

Methods:
- Settings$AsyncSettings async()
- void onSettingsChanged()
- ConfigLoadException loadConfig()
- Settings getInstance()
- int updateItems()
- void saveConfig()

## Package: com.nisovin.shopkeepers.config.lib

### Class: com.nisovin.shopkeepers.config.lib.ConfigData
Type: Interface
Implements: com.nisovin.shopkeepers.util.data.container.DataContainer

Methods:
- ConfigData of(DataContainer)
- ConfigData of(Object)
- DataContainer getDefaults()
- ConfigData create()
- void setDefaults(DataContainer)

### Class: com.nisovin.shopkeepers.config.lib.Config
Type: Abstract Class

Methods:
- void load(ConfigData) throws ConfigLoadException
- Collection getSettings()
- void save(DataContainer)
- String getLogPrefix()

### Class: com.nisovin.shopkeepers.config.lib.ConfigHelper
Type: Class

Methods:
- String toConfigKey(String)

### Class: com.nisovin.shopkeepers.config.lib.ConfigLoadException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.nisovin.shopkeepers.config.lib.SimpleConfigData
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.DelegateDataContainer
Implements: com.nisovin.shopkeepers.config.lib.ConfigData

Methods:
- DataContainer getDefaults()
- void setDefaults(DataContainer)

## Package: com.nisovin.shopkeepers.config.lib.annotation

### Class: com.nisovin.shopkeepers.config.lib.annotation.Colored
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.nisovin.shopkeepers.config.lib.annotation.Uncolored
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.nisovin.shopkeepers.config.lib.annotation.WithDefaultValueType
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class valueType()
- Class fieldType()

### Class: com.nisovin.shopkeepers.config.lib.annotation.WithValueType
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class value()

### Class: com.nisovin.shopkeepers.config.lib.annotation.WithValueTypeProvider
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class value()

## Package: com.nisovin.shopkeepers.config.lib.bukkit

### Class: com.nisovin.shopkeepers.config.lib.bukkit.BukkitConfigData
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.SimpleConfigData

Methods:
- DataContainer getDefaults()
- void setDefaults(DataContainer)

## Package: com.nisovin.shopkeepers.config.lib.setting

### Class: com.nisovin.shopkeepers.config.lib.setting.Setting
Type: Interface

Methods:
- Object getValue()
- void setValue(Object) throws ValueLoadException
- ValueType getValueType()
- String getConfigKey()
- Config getConfig()

### Class: com.nisovin.shopkeepers.config.lib.setting.FieldSetting
Type: Class
Implements: com.nisovin.shopkeepers.config.lib.setting.Setting

Methods:
- Object getValue()
- void setValue(Object) throws ValueLoadException
- Field getField()
- ValueType getValueType()
- String getConfigKey()
- Config getConfig()

## Package: com.nisovin.shopkeepers.config.lib.value

### Class: com.nisovin.shopkeepers.config.lib.value.TypePattern
Type: Interface

Methods:
- boolean matches(Type)

### Class: com.nisovin.shopkeepers.config.lib.value.ValueTypeProvider
Type: Interface

Methods:
- ValueType get(Type)

### Class: com.nisovin.shopkeepers.config.lib.value.DefaultValueTypes
Type: Class

Methods:
- ValueType get(Type)

### Class: com.nisovin.shopkeepers.config.lib.value.InvalidEntityTypeException
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueLoadException

No public methods found

### Class: com.nisovin.shopkeepers.config.lib.value.InvalidMaterialException
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueLoadException

No public methods found

### Class: com.nisovin.shopkeepers.config.lib.value.TypePatterns
Type: Class

Methods:
- TypePattern parameterized(Class, TypePattern[])
- TypePattern parameterized(Class, Class[])
- TypePattern forClass(Class)
- TypePattern forBaseType(Class)
- TypePattern any()

### Class: com.nisovin.shopkeepers.config.lib.value.ValueLoadException
Type: Class
Extends: java.lang.Exception

Methods:
- List getExtraMessages()

### Class: com.nisovin.shopkeepers.config.lib.value.ValueParseException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.nisovin.shopkeepers.config.lib.value.ValueType
Type: Abstract Class

Methods:
- Object load(DataContainer, String) throws ValueLoadException
- Object load(DataContainer, String, Object)
- Object load(Object) throws ValueLoadException
- String format(Object)
- void save(DataContainer, String, Object)
- Object save(Object)
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.ValueTypeProviders
Type: Class

Methods:
- ValueTypeProvider forTypePattern(TypePattern, Function)

### Class: com.nisovin.shopkeepers.config.lib.value.ValueTypeRegistry
Type: Class

Methods:
- boolean hasCachedValueType(Type)
- ValueType getValueType(Type)
- void register(Type, ValueType)
- void register(TypePattern, ValueType)
- void register(ValueTypeProvider)

## Package: com.nisovin.shopkeepers.config.lib.value.types

### Class: com.nisovin.shopkeepers.config.lib.value.types.BooleanValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- Boolean load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- Object save(Boolean)
- Object save(Object)
- Boolean parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.ColoredStringListValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.types.ListValue

No public methods found

### Class: com.nisovin.shopkeepers.config.lib.value.types.ColoredStringValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.types.StringValue

Methods:
- String load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- String format(String)
- String format(Object)
- Object save(String)
- Object save(Object)
- String parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.DoubleValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- Double load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- Object save(Double)
- Object save(Object)
- Double parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.EntityTypeValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.types.MinecraftEnumValue

No public methods found

### Class: com.nisovin.shopkeepers.config.lib.value.types.EnumValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- Enum load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- String format(Enum)
- String format(Object)
- Object save(Enum)
- Object save(Object)
- Enum parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.FloatValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- Float load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- Object save(Float)
- Object save(Object)
- Float parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.IntegerValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- Integer load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- Object save(Integer)
- Object save(Object)
- Integer parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.ItemDataValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- ItemData load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- String format(ItemData)
- String format(Object)
- Object save(ItemData)
- Object save(Object)
- ItemData parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.ListValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- List load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- ValueType getElementValueType()
- String format(List)
- String format(List, String)
- String format(Object)
- Object save(List)
- Object save(Object)
- List parseValue(String, String) throws ValueParseException
- List parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException
- boolean isNullElementsAllowed()

### Class: com.nisovin.shopkeepers.config.lib.value.types.LongValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- Long load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- Object save(Long)
- Object save(Object)
- Long parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.MaterialValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.types.MinecraftEnumValue

Methods:
- Material parse(String) throws ValueParseException
- Enum parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.MinecraftEnumValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.types.EnumValue

No public methods found

### Class: com.nisovin.shopkeepers.config.lib.value.types.SoundEffectValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- SoundEffect load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- Object save(SoundEffect)
- Object save(Object)
- SoundEffect parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.StringListValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.types.ListValue

No public methods found

### Class: com.nisovin.shopkeepers.config.lib.value.types.StringValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- String load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- Object save(String)
- Object save(Object)
- String parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.TextValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- Text load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- String format(Text)
- String format(Object)
- Object save(Text)
- Object save(Object)
- Text parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

### Class: com.nisovin.shopkeepers.config.lib.value.types.TrileanValue
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.value.ValueType

Methods:
- Trilean load(Object) throws ValueLoadException
- Object load(Object) throws ValueLoadException
- Object save(Trilean)
- Object save(Object)
- Trilean parse(String) throws ValueParseException
- Object parse(String) throws ValueParseException

## Package: com.nisovin.shopkeepers.config.migration

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigration
Type: Interface

Methods:
- void apply(DataContainer)

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigration1
Type: Class
Implements: com.nisovin.shopkeepers.config.migration.ConfigMigration

Methods:
- void apply(DataContainer)

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigration2
Type: Class
Implements: com.nisovin.shopkeepers.config.migration.ConfigMigration

Methods:
- void apply(DataContainer)

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigration3
Type: Class
Implements: com.nisovin.shopkeepers.config.migration.ConfigMigration

Methods:
- void apply(DataContainer)

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigration4
Type: Class
Implements: com.nisovin.shopkeepers.config.migration.ConfigMigration

Methods:
- void apply(DataContainer)

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigration5
Type: Class
Implements: com.nisovin.shopkeepers.config.migration.ConfigMigration

Methods:
- void apply(DataContainer)

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigration6
Type: Class
Implements: com.nisovin.shopkeepers.config.migration.ConfigMigration

Methods:
- void apply(DataContainer)

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigration7
Type: Class
Implements: com.nisovin.shopkeepers.config.migration.ConfigMigration

Methods:
- void apply(DataContainer)

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigration8
Type: Class
Implements: com.nisovin.shopkeepers.config.migration.ConfigMigration

Methods:
- void apply(DataContainer)

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigration9
Type: Class
Implements: com.nisovin.shopkeepers.config.migration.ConfigMigration

Methods:
- void apply(DataContainer)

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigrationHelper
Type: Class

Methods:
- boolean addSetting(DataContainer, String, Object)
- boolean migrateSetting(DataContainer, String, String)
- boolean migrateValue(DataContainer, String, Object, Object)
- boolean removeSetting(DataContainer, String)

### Class: com.nisovin.shopkeepers.config.migration.ConfigMigrations
Type: Class

Methods:
- boolean applyMigrations(DataContainer) throws ConfigLoadException
- int getLatestVersion()

## Package: com.nisovin.shopkeepers.container

### Class: com.nisovin.shopkeepers.container.ShopContainers
Type: Class

Methods:
- boolean isSupportedContainer(Material)
- Inventory getInventory(Block)

## Package: com.nisovin.shopkeepers.container.protection

### Class: com.nisovin.shopkeepers.container.protection.ProtectedContainers
Type: Class

Methods:
- boolean isContainerDirectlyProtected(String, int, int, int, Player)
- boolean isContainerDirectlyProtected(Block, Player)
- void removeContainer(BlockLocation, AbstractPlayerShopkeeper)
- List getShopkeepers(String, int, int, int)
- List getShopkeepers(Block)
- boolean isContainerProtected(Block, Player)
- void disable()
- void enable()
- boolean isProtectedContainer(Block)
- boolean isProtectedContainer(Block, Player)
- void addContainer(BlockLocation, AbstractPlayerShopkeeper)
- List getShopkeepersUsingContainer(Block)

### Class: com.nisovin.shopkeepers.container.protection.RemoveShopOnContainerBreak
Type: Class

Methods:
- boolean handleBlockBreakage(Block)
- void handleBlocksBreakage(List)
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.currency

### Class: com.nisovin.shopkeepers.currency.Currencies
Type: Class

Methods:
- Currency getHighOrNull()
- List getAll()
- boolean isHighCurrencyEnabled()
- void load()
- Currency getById(String)
- Currency getHigh()
- Currency match(ItemStack)
- Currency match(UnmodifiableItemStack)
- Predicate matchesAny()
- boolean matchesAny(ItemStack)
- boolean matchesAny(UnmodifiableItemStack)
- Currency getBase()

### Class: com.nisovin.shopkeepers.currency.Currency
Type: Class

Methods:
- int getMaxStackSize()
- int getValue()
- ItemData getItemData()
- int getStackValue()
- String getDisplayName()
- int hashCode()
- boolean equals(Object)
- String toString()
- String getId()

## Package: com.nisovin.shopkeepers.debug

### Class: com.nisovin.shopkeepers.debug.Debug
Type: Class

Methods:
- boolean isDebugging()
- boolean isDebugging(String)

### Class: com.nisovin.shopkeepers.debug.DebugOptions
Type: Class

Methods:
- Set getAll()

## Package: com.nisovin.shopkeepers.debug.events

### Class: com.nisovin.shopkeepers.debug.events.DebugListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void unregister()
- DebugListener register(boolean, boolean)

### Class: com.nisovin.shopkeepers.debug.events.EventDebugListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void unregister()
- void register()

### Class: com.nisovin.shopkeepers.debug.events.EventDebugger
Type: Class

Methods:
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.debug.trades

### Class: com.nisovin.shopkeepers.debug.trades.TradingCountListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onEnable()

## Package: com.nisovin.shopkeepers.dependencies.citizens

### Class: com.nisovin.shopkeepers.dependencies.citizens.CitizensDependency
Type: Class

Methods:
- boolean isPluginEnabled()
- Plugin getPlugin()

### Class: com.nisovin.shopkeepers.dependencies.citizens.CitizensUtils
Type: Class

Methods:
- boolean isNPC(Entity)

## Package: com.nisovin.shopkeepers.dependencies.towny

### Class: com.nisovin.shopkeepers.dependencies.towny.TownyDependency
Type: Class

Methods:
- boolean isCommercialArea(Location)
- boolean isPluginEnabled()
- Plugin getPlugin()

## Package: com.nisovin.shopkeepers.dependencies.worldguard

### Class: com.nisovin.shopkeepers.dependencies.worldguard.WorldGuardDependency
Type: Class

Methods:
- boolean isShopAllowed(Player, Location)
- boolean isPluginEnabled()
- void registerAllowShopFlag()
- Plugin getPlugin()

## Package: com.nisovin.shopkeepers.event

### Class: com.nisovin.shopkeepers.event.ShopkeeperEventHelper
Type: Class

Methods:
- PlayerDeleteShopkeeperEvent callPlayerDeleteShopkeeperEvent(Shopkeeper, Player)

## Package: com.nisovin.shopkeepers.input

### Class: com.nisovin.shopkeepers.input.InputRequest
Type: Interface

Methods:
- void onInput(Object)
- void onAborted()

### Class: com.nisovin.shopkeepers.input.InputManager
Type: Abstract Class

Methods:
- void request(Player, InputRequest)
- InputRequest abortRequest(Player)
- void abortRequest(Player, InputRequest)
- InputRequest getRequest(Player)
- boolean hasPendingRequest(Player)
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.input.chat

### Class: com.nisovin.shopkeepers.input.chat.ChatInput
Type: Class
Extends: com.nisovin.shopkeepers.input.InputManager
Implements: org.bukkit.event.Listener

Methods:
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.input.interaction

### Class: com.nisovin.shopkeepers.input.interaction.InteractionInput
Type: Class
Extends: com.nisovin.shopkeepers.input.InputManager
Implements: org.bukkit.event.Listener

Methods:
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.internals

### Class: com.nisovin.shopkeepers.internals.SKApiInternals
Type: Class
Implements: com.nisovin.shopkeepers.api.internal.ApiInternals

Methods:
- boolean isShopkeeperSnapshotNameValid(String)
- BookOffer createBookOffer(String, int)
- UnmodifiableItemStack createUnmodifiableItemStack(ItemStack)
- TradeOffer createTradeOffer(ItemStack, ItemStack, ItemStack)
- TradeOffer createTradeOffer(UnmodifiableItemStack, UnmodifiableItemStack, UnmodifiableItemStack)
- boolean isEmpty(UnmodifiableItemStack)
- int getShopkeeperSnapshotMaxNameLength()
- PriceOffer createPriceOffer(ItemStack, int)
- PriceOffer createPriceOffer(UnmodifiableItemStack, int)

## Package: com.nisovin.shopkeepers.itemconversion

### Class: com.nisovin.shopkeepers.itemconversion.ItemConversion
Type: Class

Methods:
- ItemStack convertItem(ItemStack)
- int convertItems(ItemStack[], Predicate)
- int convertItems(Inventory, Predicate, boolean)

### Class: com.nisovin.shopkeepers.itemconversion.ItemConversionListener
Type: Class
Implements: org.bukkit.event.Listener

No public methods found

### Class: com.nisovin.shopkeepers.itemconversion.ItemConversions
Type: Class

Methods:
- int convertAffectedItems(Player, Shopkeeper, boolean)
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.items

### Class: com.nisovin.shopkeepers.items.ItemUpdates
Type: Class

Methods:
- ItemData updateItemData(ItemData)
- UnmodifiableItemStack updateItem(UnmodifiableItemStack)
- UpdateItemEvent callUpdateItemEvent(UnmodifiableItemStack)

## Package: com.nisovin.shopkeepers.lang

### Class: com.nisovin.shopkeepers.lang.Messages
Type: Class
Extends: com.nisovin.shopkeepers.config.lib.Config

Methods:
- void loadLanguageFile()
- String getDefaultLanguageFilePath()
- String getLanguageFilePath(String)
- void load(ConfigData) throws ConfigLoadException
- String getLogPrefix()
- Messages getInstance()
- File getLangFolder()

## Package: com.nisovin.shopkeepers.libs.bstats

### Class: com.nisovin.shopkeepers.libs.bstats.Metrics
Type: Class

Methods:
- JsonObject getPluginData()
- boolean isEnabled()
- void addCustomChart(Metrics$CustomChart)

## Package: com.nisovin.shopkeepers.metrics

### Class: com.nisovin.shopkeepers.metrics.CitizensChart
Type: Class
Extends: com.nisovin.shopkeepers.libs.bstats.Metrics$SimplePie

No public methods found

### Class: com.nisovin.shopkeepers.metrics.FeaturesChart
Type: Class
Extends: com.nisovin.shopkeepers.libs.bstats.Metrics$DrilldownPie

No public methods found

### Class: com.nisovin.shopkeepers.metrics.GringottsChart
Type: Class
Extends: com.nisovin.shopkeepers.libs.bstats.Metrics$SimplePie

No public methods found

### Class: com.nisovin.shopkeepers.metrics.PlayerShopsChart
Type: Class
Extends: com.nisovin.shopkeepers.libs.bstats.Metrics$SimplePie

No public methods found

### Class: com.nisovin.shopkeepers.metrics.PluginMetrics
Type: Class

Methods:
- void onEnable()
- void onDisable()

### Class: com.nisovin.shopkeepers.metrics.ShopkeepersCountChart
Type: Class
Extends: com.nisovin.shopkeepers.libs.bstats.Metrics$SimplePie

No public methods found

### Class: com.nisovin.shopkeepers.metrics.TownyChart
Type: Class
Extends: com.nisovin.shopkeepers.libs.bstats.Metrics$SimplePie

No public methods found

### Class: com.nisovin.shopkeepers.metrics.VaultEconomyChart
Type: Class
Extends: com.nisovin.shopkeepers.libs.bstats.Metrics$SimplePie

No public methods found

### Class: com.nisovin.shopkeepers.metrics.WorldGuardChart
Type: Class
Extends: com.nisovin.shopkeepers.libs.bstats.Metrics$SimplePie

No public methods found

### Class: com.nisovin.shopkeepers.metrics.WorldsChart
Type: Class
Extends: com.nisovin.shopkeepers.libs.bstats.Metrics$SimplePie

No public methods found

## Package: com.nisovin.shopkeepers.moving

### Class: com.nisovin.shopkeepers.moving.ShopkeeperMoving
Type: Class

Methods:
- void startMoving(Player, Shopkeeper)
- boolean requestMove(Player, Shopkeeper, Location, BlockFace)
- void onEnable()
- void abortMoving(Player)
- void onDisable()

## Package: com.nisovin.shopkeepers.naming

### Class: com.nisovin.shopkeepers.naming.ShopkeeperNaming
Type: Class

Methods:
- boolean requestNameChange(Player, Shopkeeper, String)
- void startNaming(Player, Shopkeeper)
- void abortNaming(Player)
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.playershops

### Class: com.nisovin.shopkeepers.playershops.MaxShopsPermission
Type: Class
Implements: java.lang.Comparable

Methods:
- int getMaxShops()
- void registerPermission()
- String getPermission()
- boolean isUnlimited()
- int hashCode()
- boolean equals(Object)
- boolean hasPermission(Permissible)
- List parseList(String, Consumer)
- String toString()
- int compareTo(MaxShopsPermission)
- int compareTo(Object)
- MaxShopsPermission parse(String)

### Class: com.nisovin.shopkeepers.playershops.PlayerShops
Type: Class

Methods:
- PlayerShopsLimit getPlayerShopsLimit()
- ShopOwnerNameUpdates getShopOwnerNameUpdates()
- void onEnable()
- void onDisable()
- PlayerInactivity getPlayerInactivity()

### Class: com.nisovin.shopkeepers.playershops.PlayerShopsLimit
Type: Class

Methods:
- void updateMaxShopsPermissions(Consumer)
- void onEnable()
- void onDisable()
- int getMaxShopsLimit(Player)

### Class: com.nisovin.shopkeepers.playershops.ShopOwnerNameUpdates
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.playershops.inactivity

### Class: com.nisovin.shopkeepers.playershops.inactivity.PlayerInactivity
Type: Class

Methods:
- void deleteShopsOfInactivePlayers()
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.shopcreation

### Class: com.nisovin.shopkeepers.shopcreation.ContainerSelection
Type: Class

Methods:
- void addRecentlyPlacedContainer(Player, Block)
- void onPlayerQuit(Player)
- Block getSelectedContainer(Player)
- void onEnable()
- boolean validateContainer(Player, Block)
- void onDisable()
- void selectContainer(Player, Block)
- boolean isRecentlyPlacedContainer(Player, Block)

### Class: com.nisovin.shopkeepers.shopcreation.ShopCreationItem
Type: Class

Methods:
- boolean hasTag(ItemStack)
- ItemStack create()
- ItemStack create(int)
- boolean addTag(ItemStack)
- boolean isShopCreationItem(UnmodifiableItemStack)
- boolean isShopCreationItem(ItemStack)

### Class: com.nisovin.shopkeepers.shopcreation.ShopkeeperCreation
Type: Class

Methods:
- ShopkeeperPlacement getShopkeeperPlacement()
- void onPlayerQuit(Player)
- void onEnable()
- ContainerSelection getContainerSelection()
- void onDisable()

### Class: com.nisovin.shopkeepers.shopcreation.ShopkeeperPlacement
Type: Class

Methods:
- Location determineSpawnLocation(Player, Block, BlockFace)
- boolean validateSpawnLocation(Player, AbstractShopType, AbstractShopObjectType, Location, BlockFace, ShopCreationData, AbstractShopkeeper)

## Package: com.nisovin.shopkeepers.shopkeeper

### Class: com.nisovin.shopkeepers.shopkeeper.AbstractShopType
Type: Abstract Class
Extends: com.nisovin.shopkeepers.types.AbstractSelectableType
Implements: com.nisovin.shopkeepers.api.shopkeeper.ShopType

Methods:
- Class getShopkeeperClass()
- AbstractShopkeeper createShopkeeper(int, ShopCreationData) throws ShopkeeperCreateException
- AbstractShopkeeper handleShopkeeperCreation(ShopCreationData)
- AbstractShopkeeper loadShopkeeper(ShopkeeperData) throws InvalidDataException
- boolean validateSpawnLocation(Player, Location, BlockFace, ShopCreationData, AbstractShopkeeper)

### Class: com.nisovin.shopkeepers.shopkeeper.AbstractShopkeeper
Type: Abstract Class
Implements: com.nisovin.shopkeepers.api.shopkeeper.Shopkeeper

Methods:
- Location getLocation()
- String getName()
- String getUniqueIdLogPrefix()
- void markDirty()
- AbstractShopObject getShopObject()
- ShopObject getShopObject()
- boolean hasTradingRecipes(Player)
- boolean isActive()
- boolean isTicking()
- UUID getUniqueId()
- boolean isValidName(String)
- void onPlayerInteraction(Player)
- boolean canAccess(CommandSender, UIType, boolean)
- SKShopkeeperSnapshot createSnapshot(String)
- ShopkeeperSnapshot createSnapshot(String)
- SKShopkeeperSnapshot removeSnapshot(int)
- ShopkeeperSnapshot removeSnapshot(int)
- ShopkeeperComponentHolder getComponents()
- void informAdded(ShopkeeperAddedEvent$Cause)
- void abortUISessionsDelayed()
- boolean openWindow(UIType, Player)
- boolean openWindow(UIType, Player, UIState)
- int getSnapshotIndex(String)
- void tick()
- void setYaw(float)
- ChunkCoords getChunkCoords()
- float getYaw()
- List getSnapshots()
- String getDisplayName()
- AbstractShopType getType()
- ShopType getType()
- void saveDelayed()
- void loadDynamicState(ShopkeeperData) throws InvalidDataException
- void removeAllSnapshots()
- int getTickingGroup()
- boolean isVirtual()
- String getPositionString()
- void setName(String)
- ViewProvider getViewProvider(UIType)
- boolean canEdit(CommandSender, boolean)
- void applySnapshot(ShopkeeperSnapshot) throws ShopkeeperLoadException
- void teleport(Location, BlockFace)
- Collection getUISessions()
- Collection getUISessions(UIType)
- List getTradingRecipes(Player)
- void save(ShopkeeperData, boolean)
- void save()
- int getId()
- String getLogPrefix(int)
- String getLogPrefix()
- String getLogPrefix(String, int, ShopkeeperSnapshot)
- String getLogPrefix(int, ShopkeeperSnapshot)
- void delete()
- void delete(Player)
- void saveDynamicState(ShopkeeperData, boolean)
- void registerViewProvider(ViewProvider)
- ChunkCoords getLastChunkCoords()
- String getWorldName()
- String getLocatedLogPrefix()
- boolean isDirty()
- void setLocation(Location)
- void setLocation(Location, BlockFace)
- void setLocation(BlockLocation)
- int hashCode()
- boolean openEditorWindow(Player)
- void registerViewProviderIfMissing(UIType, Supplier)
- String getIdString()
- BlockLocation getBlockLocation()
- void informStartTicking()
- void onSave()
- boolean isValid()
- boolean openTradingWindow(Player)
- MessageArguments getMessageArguments(String)
- int updateItems()
- void addSnapshot(ShopkeeperSnapshot)
- SKShopkeeperSnapshot getSnapshot(int)
- SKShopkeeperSnapshot getSnapshot(String)
- ShopkeeperSnapshot getSnapshot(String)
- ShopkeeperSnapshot getSnapshot(int)
- int getX()
- int getY()
- void setActive(boolean)
- void informRemoval(ShopkeeperRemoveEvent$Cause)
- int getZ()
- void setLastChunkCoords(ChunkCoords)
- boolean equals(Object)
- String toString()
- void informStopTicking()

### Class: com.nisovin.shopkeepers.shopkeeper.SKDefaultShopTypes
Type: Class
Implements: com.nisovin.shopkeepers.api.shopkeeper.DefaultShopTypes

Methods:
- List getAll()
- BookPlayerShopType PLAYER_BOOK()
- TradingPlayerShopType PLAYER_TRADING()
- RegularAdminShopType getRegularAdminShopType()
- AdminShopType getRegularAdminShopType()
- BuyingPlayerShopType getBuyingPlayerShopType()
- PlayerShopType getBuyingPlayerShopType()
- RegularAdminShopType ADMIN_REGULAR()
- SellingPlayerShopType getSellingPlayerShopType()
- PlayerShopType getSellingPlayerShopType()
- TradingPlayerShopType getTradingPlayerShopType()
- PlayerShopType getTradingPlayerShopType()
- BookPlayerShopType getBookPlayerShopType()
- PlayerShopType getBookPlayerShopType()
- BuyingPlayerShopType PLAYER_BUYING()
- SKDefaultShopTypes getInstance()
- SellingPlayerShopType PLAYER_SELLING()
- RegularAdminShopType getAdminShopType()
- ShopType getAdminShopType()

### Class: com.nisovin.shopkeepers.shopkeeper.SKShopTypesRegistry
Type: Class
Extends: com.nisovin.shopkeepers.types.AbstractSelectableTypeRegistry
Implements: com.nisovin.shopkeepers.api.shopkeeper.ShopTypesRegistry

Methods:
- boolean canBeSelected(Player, AbstractShopType)
- boolean canBeSelected(Player, AbstractSelectableType)

### Class: com.nisovin.shopkeepers.shopkeeper.SKShopkeeperSnapshot
Type: Class
Implements: com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperSnapshot

Methods:
- ShopkeeperData getShopkeeperData()
- String getName()
- int hashCode()
- Instant getTimestamp()
- boolean isNameValid(String)
- boolean equals(Object)
- String toString()
- void validateName(String)

### Class: com.nisovin.shopkeepers.shopkeeper.SKTradingRecipe
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.TradingRecipeDraft
Implements: com.nisovin.shopkeepers.api.shopkeeper.TradingRecipe

Methods:
- UnmodifiableItemStack getResultItem()
- UnmodifiableItemStack getItem1()
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean hasItem2()
- boolean isOutOfStock()

### Class: com.nisovin.shopkeepers.shopkeeper.ShopkeeperComponentHolder
Type: Class
Extends: com.nisovin.shopkeepers.component.ComponentHolder

Methods:
- AbstractShopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.shopkeeper.ShopkeeperData
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.DelegateDataContainer

Methods:
- ShopkeeperData of(DataContainer)
- ShopkeeperData ofNonNull(DataContainer)
- boolean migrate(String) throws InvalidDataException

### Class: com.nisovin.shopkeepers.shopkeeper.ShopkeeperPropertyValuesHolder
Type: Class
Extends: com.nisovin.shopkeepers.util.data.property.value.AbstractPropertyValuesHolder

Methods:
- AbstractShopkeeper getShopkeeper()
- void markDirty()
- String getLogPrefix()

### Class: com.nisovin.shopkeepers.shopkeeper.TradingRecipeDraft
Type: Class

Methods:
- UnmodifiableItemStack getResultItem()
- UnmodifiableItemStack getRecipeItem1()
- UnmodifiableItemStack getItem2()
- boolean areItemsEqual(ItemStack, ItemStack, ItemStack)
- boolean areItemsEqual(UnmodifiableItemStack, UnmodifiableItemStack, UnmodifiableItemStack)
- boolean areItemsEqual(TradingRecipeDraft)
- boolean areItemsEqual(TradingRecipe)
- UnmodifiableItemStack getRecipeItem2()
- UnmodifiableItemStack getItem1()
- int hashCode()
- boolean equals(Object)
- boolean isValid()
- boolean isEmpty()
- String toString()

## Package: com.nisovin.shopkeepers.shopkeeper.activation

### Class: com.nisovin.shopkeepers.shopkeeper.activation.ShopkeeperChunkActivator
Type: Class

Methods:
- void onShopkeeperMoved(AbstractShopkeeper, ChunkCoords)
- void onShopkeeperChunkRemoved(ChunkCoords)
- Timings getChunkActivationTimings()
- void activateShopkeepersInAllWorlds()
- void checkShopkeeperActivation(AbstractShopkeeper)
- void deactivateShopkeepersInAllWorlds()
- boolean isChunkActive(ChunkCoords)
- void deactivateShopkeeper(AbstractShopkeeper)
- void onEnable()
- void onShopkeeperChunkAdded(ChunkCoords)
- void onDisable()

## Package: com.nisovin.shopkeepers.shopkeeper.admin

### Class: com.nisovin.shopkeepers.shopkeeper.admin.AbstractAdminShopType
Type: Abstract Class
Extends: com.nisovin.shopkeepers.shopkeeper.AbstractShopType
Implements: com.nisovin.shopkeepers.api.shopkeeper.admin.AdminShopType

No public methods found

### Class: com.nisovin.shopkeepers.shopkeeper.admin.AbstractAdminShopkeeper
Type: Abstract Class
Extends: com.nisovin.shopkeepers.shopkeeper.AbstractShopkeeper
Implements: com.nisovin.shopkeepers.api.shopkeeper.admin.AdminShopkeeper

Methods:
- String getTradePermission()
- void setTradePermission(String)
- void loadDynamicState(ShopkeeperData) throws InvalidDataException
- void saveDynamicState(ShopkeeperData, boolean)

## Package: com.nisovin.shopkeepers.shopkeeper.admin.regular

### Class: com.nisovin.shopkeepers.shopkeeper.admin.regular.RegularAdminShopEditorView
Type: Class
Extends: com.nisovin.shopkeepers.ui.editor.ShopkeeperEditorView

No public methods found

### Class: com.nisovin.shopkeepers.shopkeeper.admin.regular.RegularAdminShopEditorViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.ui.editor.ShopkeeperEditorViewProvider

Methods:
- SKRegularAdminShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()
- boolean canAccess(Player, boolean)

### Class: com.nisovin.shopkeepers.shopkeeper.admin.regular.RegularAdminShopType
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.admin.AbstractAdminShopType

Methods:
- String getDisplayName()
- List getTradeSetupDescription()
- String getSetupDescription()
- String getDescription()

### Class: com.nisovin.shopkeepers.shopkeeper.admin.regular.SKRegularAdminShopkeeper
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.admin.AbstractAdminShopkeeper
Implements: com.nisovin.shopkeepers.api.shopkeeper.admin.regular.RegularAdminShopkeeper

Methods:
- List getOffers()
- void addOffer(TradeOffer)
- void clearOffers()
- RegularAdminShopType getType()
- ShopType getType()
- AbstractShopType getType()
- void addOffers(List)
- boolean hasTradingRecipes(Player)
- void loadDynamicState(ShopkeeperData) throws InvalidDataException
- List getTradingRecipes(Player)
- void setOffers(List)
- void saveDynamicState(ShopkeeperData, boolean)

## Package: com.nisovin.shopkeepers.shopkeeper.migration

### Class: com.nisovin.shopkeepers.shopkeeper.migration.Migration
Type: Abstract Class

Methods:
- String getName()
- int hashCode()
- boolean equals(Object)
- MigrationPhase getTargetPhase()
- String toString()
- boolean migrate(ShopkeeperData, String) throws InvalidDataException

### Class: com.nisovin.shopkeepers.shopkeeper.migration.MigrationPhase
Type: Class

Methods:
- String getName()
- MigrationPhase ofShopkeeperClass(Class)
- boolean isApplicable(MigrationPhase)
- String toString()
- MigrationPhase ofShopObjectClass(Class)

### Class: com.nisovin.shopkeepers.shopkeeper.migration.ShopkeeperDataMigrator
Type: Class

Methods:
- void logRegisteredMigrations()
- void registerMigration(Migration)
- boolean migrate(ShopkeeperData, String) throws InvalidDataException

## Package: com.nisovin.shopkeepers.shopkeeper.offers

### Class: com.nisovin.shopkeepers.shopkeeper.offers.SKBookOffer
Type: Class
Implements: com.nisovin.shopkeepers.api.shopkeeper.offers.BookOffer

Methods:
- boolean migrateOffers(DataValue, String) throws InvalidDataException
- String getBookTitle()
- int hashCode()
- boolean equals(Object)
- List loadOffers(DataValue) throws InvalidDataException
- String toString()
- void saveOffers(DataValue, List)
- int getPrice()

### Class: com.nisovin.shopkeepers.shopkeeper.offers.SKPriceOffer
Type: Class
Implements: com.nisovin.shopkeepers.api.shopkeeper.offers.PriceOffer

Methods:
- boolean migrateOffers(DataValue, String) throws InvalidDataException
- int hashCode()
- boolean equals(Object)
- List loadOffers(DataValue) throws InvalidDataException
- UnmodifiableItemStack getItem()
- String toString()
- int updateItems(List, String)
- void saveOffers(DataValue, List)
- int getPrice()

### Class: com.nisovin.shopkeepers.shopkeeper.offers.SKTradeOffer
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.SKTradingRecipe
Implements: com.nisovin.shopkeepers.api.shopkeeper.offers.TradeOffer

Methods:
- boolean migrateOffers(DataValue, String) throws InvalidDataException
- int hashCode()
- boolean equals(Object)
- List loadOffers(DataValue) throws InvalidDataException
- String toString()
- int updateItems(List, String)
- void saveOffers(DataValue, List)
- TradingRecipe toTradingRecipe(TradeOffer, boolean)

## Package: com.nisovin.shopkeepers.shopkeeper.player

### Class: com.nisovin.shopkeepers.shopkeeper.player.AbstractPlayerShopType
Type: Abstract Class
Extends: com.nisovin.shopkeepers.shopkeeper.AbstractShopType
Implements: com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopType

Methods:
- boolean validateSpawnLocation(Player, Location, BlockFace, ShopCreationData, AbstractShopkeeper)

### Class: com.nisovin.shopkeepers.shopkeeper.player.AbstractPlayerShopkeeper
Type: Abstract Class
Extends: com.nisovin.shopkeepers.shopkeeper.AbstractShopkeeper
Implements: com.nisovin.shopkeepers.api.shopkeeper.player.PlayerShopkeeper

Methods:
- UUID getOwnerUUID()
- Inventory getContainerInventory()
- int getContainerX()
- int getContainerY()
- int getCurrencyInContainer()
- int getContainerZ()
- Player getOwner()
- String getOwnerString()
- void delete(Player)
- void setOwner(Player)
- void setOwner(User)
- void setOwner(UUID, String)
- void saveDynamicState(ShopkeeperData, boolean)
- User getOwnerUser()
- boolean isOwner(Player)
- void onPlayerInteraction(Player)
- void setForHire(ItemStack)
- void setForHire(UnmodifiableItemStack)
- String getOwnerName()
- boolean openContainerWindow(Player)
- boolean isNotifyOnTrades()
- Block getContainer()
- ItemStack[] getContainerContents()
- boolean isForHire()
- UnmodifiableItemStack getHireCost()
- BlockLocation getContainerLocation()
- boolean openHireWindow(Player)
- void loadDynamicState(ShopkeeperData) throws InvalidDataException
- void setContainer(int, int, int)
- void setNotifyOnTrades(boolean)

### Class: com.nisovin.shopkeepers.shopkeeper.player.PlaceholderItems
Type: Class

Methods:
- Material getSubstitutedMaterial(ItemStack)
- boolean isValidPlaceholderItem(ItemStack)
- ItemStack getSubstitutedItem(ItemStack)
- boolean isPlaceholderItem(ItemStack)
- ItemStack replace(ItemStack)
- UnmodifiableItemStack replace(UnmodifiableItemStack)
- ItemStack replaceNonNull(ItemStack)
- UnmodifiableItemStack replaceNonNull(UnmodifiableItemStack)
- ItemStack createPlaceholderItem(String)

### Class: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopEditorLayout
Type: Class
Extends: com.nisovin.shopkeepers.ui.editor.ShopkeeperEditorLayout

No public methods found

### Class: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopEditorView
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.editor.ShopkeeperEditorView

No public methods found

### Class: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopEditorViewProvider
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.editor.ShopkeeperEditorViewProvider

Methods:
- AbstractPlayerShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()
- boolean canAccess(Player, boolean)

### Class: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopHiringView
Type: Class
Extends: com.nisovin.shopkeepers.ui.hiring.HiringView

Methods:
- void updateInventory()
- AbstractPlayerShopkeeper getShopkeeperNonNull()
- AbstractShopkeeper getShopkeeperNonNull()

### Class: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopHiringViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.ui.hiring.HiringViewProvider

Methods:
- AbstractPlayerShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()
- boolean canOpen(Player, boolean)

### Class: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopTradingView
Type: Class
Extends: com.nisovin.shopkeepers.ui.trading.TradingView

Methods:
- AbstractPlayerShopkeeper getShopkeeperNonNull()
- AbstractShopkeeper getShopkeeperNonNull()

### Class: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopTradingViewProvider
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.trading.TradingViewProvider

Methods:
- AbstractPlayerShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()
- boolean canOpen(Player, boolean)

## Package: com.nisovin.shopkeepers.shopkeeper.player.book

### Class: com.nisovin.shopkeepers.shopkeeper.player.book.BookPlayerShopEditorView
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopEditorView

No public methods found

### Class: com.nisovin.shopkeepers.shopkeeper.player.book.BookPlayerShopEditorViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopEditorViewProvider

Methods:
- SKBookPlayerShopkeeper getShopkeeper()
- AbstractPlayerShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.shopkeeper.player.book.BookPlayerShopTradingView
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopTradingView

Methods:
- SKBookPlayerShopkeeper getShopkeeperNonNull()
- AbstractPlayerShopkeeper getShopkeeperNonNull()
- AbstractShopkeeper getShopkeeperNonNull()

### Class: com.nisovin.shopkeepers.shopkeeper.player.book.BookPlayerShopTradingViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopTradingViewProvider

Methods:
- SKBookPlayerShopkeeper getShopkeeper()
- AbstractPlayerShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.shopkeeper.player.book.BookPlayerShopType
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.AbstractPlayerShopType

Methods:
- String getDisplayName()
- List getTradeSetupDescription()
- String getSetupDescription()
- String getDescription()

### Class: com.nisovin.shopkeepers.shopkeeper.player.book.SKBookPlayerShopkeeper
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.AbstractPlayerShopkeeper
Implements: com.nisovin.shopkeepers.api.shopkeeper.player.book.BookPlayerShopkeeper

Methods:
- void removeOffer(String)
- List getOffers()
- void addOffer(BookOffer)
- void clearOffers()
- BookPlayerShopType getType()
- ShopType getType()
- AbstractShopType getType()
- void addOffers(List)
- boolean hasTradingRecipes(Player)
- void loadDynamicState(ShopkeeperData) throws InvalidDataException
- List getTradingRecipes(Player)
- void setOffers(List)
- void saveDynamicState(ShopkeeperData, boolean)
- BookOffer getOffer(ItemStack)
- BookOffer getOffer(UnmodifiableItemStack)
- BookOffer getOffer(String)

## Package: com.nisovin.shopkeepers.shopkeeper.player.buy

### Class: com.nisovin.shopkeepers.shopkeeper.player.buy.BuyingPlayerShopEditorView
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopEditorView

No public methods found

### Class: com.nisovin.shopkeepers.shopkeeper.player.buy.BuyingPlayerShopEditorViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopEditorViewProvider

Methods:
- SKBuyingPlayerShopkeeper getShopkeeper()
- AbstractPlayerShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.shopkeeper.player.buy.BuyingPlayerShopTradingView
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopTradingView

Methods:
- SKBuyingPlayerShopkeeper getShopkeeperNonNull()
- AbstractPlayerShopkeeper getShopkeeperNonNull()
- AbstractShopkeeper getShopkeeperNonNull()

### Class: com.nisovin.shopkeepers.shopkeeper.player.buy.BuyingPlayerShopTradingViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopTradingViewProvider

Methods:
- SKBuyingPlayerShopkeeper getShopkeeper()
- AbstractPlayerShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.shopkeeper.player.buy.BuyingPlayerShopType
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.AbstractPlayerShopType

Methods:
- String getDisplayName()
- List getTradeSetupDescription()
- String getSetupDescription()
- String getDescription()

### Class: com.nisovin.shopkeepers.shopkeeper.player.buy.SKBuyingPlayerShopkeeper
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.AbstractPlayerShopkeeper
Implements: com.nisovin.shopkeepers.api.shopkeeper.player.buy.BuyingPlayerShopkeeper

Methods:
- void removeOffer(ItemStack)
- void removeOffer(UnmodifiableItemStack)
- List getOffers()
- void addOffer(PriceOffer)
- void clearOffers()
- BuyingPlayerShopType getType()
- ShopType getType()
- AbstractShopType getType()
- void addOffers(List)
- boolean hasTradingRecipes(Player)
- void loadDynamicState(ShopkeeperData) throws InvalidDataException
- List getTradingRecipes(Player)
- void setOffers(List)
- void saveDynamicState(ShopkeeperData, boolean)
- PriceOffer getOffer(ItemStack)
- PriceOffer getOffer(UnmodifiableItemStack)

## Package: com.nisovin.shopkeepers.shopkeeper.player.sell

### Class: com.nisovin.shopkeepers.shopkeeper.player.sell.SKSellingPlayerShopkeeper
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.AbstractPlayerShopkeeper
Implements: com.nisovin.shopkeepers.api.shopkeeper.player.sell.SellingPlayerShopkeeper

Methods:
- void removeOffer(ItemStack)
- void removeOffer(UnmodifiableItemStack)
- List getOffers()
- void addOffer(PriceOffer)
- void clearOffers()
- SellingPlayerShopType getType()
- ShopType getType()
- AbstractShopType getType()
- void addOffers(List)
- boolean hasTradingRecipes(Player)
- void loadDynamicState(ShopkeeperData) throws InvalidDataException
- List getTradingRecipes(Player)
- void setOffers(List)
- void saveDynamicState(ShopkeeperData, boolean)
- PriceOffer getOffer(ItemStack)
- PriceOffer getOffer(UnmodifiableItemStack)

### Class: com.nisovin.shopkeepers.shopkeeper.player.sell.SellingPlayerShopEditorView
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopEditorView

No public methods found

### Class: com.nisovin.shopkeepers.shopkeeper.player.sell.SellingPlayerShopEditorViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopEditorViewProvider

Methods:
- SKSellingPlayerShopkeeper getShopkeeper()
- AbstractPlayerShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.shopkeeper.player.sell.SellingPlayerShopTradingView
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopTradingView

Methods:
- SKSellingPlayerShopkeeper getShopkeeperNonNull()
- AbstractPlayerShopkeeper getShopkeeperNonNull()
- AbstractShopkeeper getShopkeeperNonNull()

### Class: com.nisovin.shopkeepers.shopkeeper.player.sell.SellingPlayerShopTradingViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopTradingViewProvider

Methods:
- SKSellingPlayerShopkeeper getShopkeeper()
- AbstractPlayerShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.shopkeeper.player.sell.SellingPlayerShopType
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.AbstractPlayerShopType

Methods:
- String getDisplayName()
- List getTradeSetupDescription()
- String getSetupDescription()
- String getDescription()

## Package: com.nisovin.shopkeepers.shopkeeper.player.trade

### Class: com.nisovin.shopkeepers.shopkeeper.player.trade.SKTradingPlayerShopkeeper
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.AbstractPlayerShopkeeper
Implements: com.nisovin.shopkeepers.api.shopkeeper.player.trade.TradingPlayerShopkeeper

Methods:
- List getOffers()
- void addOffer(TradeOffer)
- void clearOffers()
- TradingPlayerShopType getType()
- ShopType getType()
- AbstractShopType getType()
- void addOffers(List)
- boolean hasTradingRecipes(Player)
- void loadDynamicState(ShopkeeperData) throws InvalidDataException
- List getTradingRecipes(Player)
- void setOffers(List)
- void saveDynamicState(ShopkeeperData, boolean)
- TradeOffer getOffer(TradingRecipe)
- boolean hasOffer(ItemStack)

### Class: com.nisovin.shopkeepers.shopkeeper.player.trade.TradingPlayerShopEditorView
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopEditorView

No public methods found

### Class: com.nisovin.shopkeepers.shopkeeper.player.trade.TradingPlayerShopEditorViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopEditorViewProvider

Methods:
- SKTradingPlayerShopkeeper getShopkeeper()
- AbstractPlayerShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.shopkeeper.player.trade.TradingPlayerShopTradingView
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopTradingView

Methods:
- SKTradingPlayerShopkeeper getShopkeeperNonNull()
- AbstractPlayerShopkeeper getShopkeeperNonNull()
- AbstractShopkeeper getShopkeeperNonNull()

### Class: com.nisovin.shopkeepers.shopkeeper.player.trade.TradingPlayerShopTradingViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.PlayerShopTradingViewProvider

Methods:
- SKTradingPlayerShopkeeper getShopkeeper()
- AbstractPlayerShopkeeper getShopkeeper()
- AbstractShopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.shopkeeper.player.trade.TradingPlayerShopType
Type: Class
Extends: com.nisovin.shopkeepers.shopkeeper.player.AbstractPlayerShopType

Methods:
- String getDisplayName()
- List getTradeSetupDescription()
- String getSetupDescription()
- String getDescription()

## Package: com.nisovin.shopkeepers.shopkeeper.registry

### Class: com.nisovin.shopkeepers.shopkeeper.registry.ActiveChunkQueries
Type: Class

Methods:
- Set getActiveChunks(String)
- Set getShopkeepersInActiveChunks()
- Set getShopkeepersInActiveChunks(String)

### Class: com.nisovin.shopkeepers.shopkeeper.registry.SKShopkeeperRegistry
Type: Class
Implements: com.nisovin.shopkeepers.api.shopkeeper.ShopkeeperRegistry

Methods:
- Stream getShopkeepersByNamePrefix(String)
- void deleteAllShopkeepers()
- AbstractShopkeeper createShopkeeper(ShopCreationData) throws ShopkeeperCreateException
- Shopkeeper createShopkeeper(ShopCreationData) throws ShopkeeperCreateException
- void onEnable()
- void onDisable()
- Collection getAllPlayerShopkeepers()
- ShopObjectRegistry getShopObjectRegistry()
- boolean isShopkeeper(Entity)
- boolean isShopkeeper(Block)
- ShopkeeperSpawner getShopkeeperSpawner()
- Collection getShopkeepersInChunkSnapshot(ChunkCoords)
- Collection getWorldsWithShopkeepers()
- AbstractShopkeeper getShopkeeperByEntity(Entity)
- Shopkeeper getShopkeeperByEntity(Entity)
- boolean isChunkActive(ChunkCoords)
- AbstractShopkeeper getShopkeeperById(int)
- Shopkeeper getShopkeeperById(int)
- void deleteShopkeeper(AbstractShopkeeper)
- Collection getPlayerShopkeepersByOwner(UUID)
- AbstractShopkeeper getShopkeeperByUniqueId(UUID)
- Shopkeeper getShopkeeperByUniqueId(UUID)
- Collection getShopkeepersAtLocation(Location)
- Collection getVirtualShopkeepers()
- AbstractShopkeeper getShopkeeperByBlock(Block)
- AbstractShopkeeper getShopkeeperByBlock(String, int, int, int)
- Shopkeeper getShopkeeperByBlock(String, int, int, int)
- Shopkeeper getShopkeeperByBlock(Block)
- void unloadAllShopkeepers()
- Stream getShopkeepersByName(String)
- void onShopkeeperMoved(AbstractShopkeeper)
- Collection getActiveShopkeepers()
- Collection getActiveShopkeepers(String)
- Collection getActiveChunks(String)
- Map getShopkeepersByChunks(String)
- Collection getShopkeepersInChunk(ChunkCoords)
- Collection getShopkeepersInWorld(String)
- AbstractShopkeeper loadShopkeeper(ShopkeeperData) throws InvalidDataException
- Collection getAllShopkeepers()
- ShopkeeperChunkActivator getChunkActivator()

### Class: com.nisovin.shopkeepers.shopkeeper.registry.ShopObjectRegistry
Type: Class

Methods:
- void updateShopObjectRegistration(AbstractShopkeeper)
- AbstractShopkeeper getShopkeeperByObjectId(Object)
- boolean isRegistered(AbstractShopkeeper)
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.shopkeeper.spawning

### Class: com.nisovin.shopkeepers.shopkeeper.spawning.ShopkeeperSpawnQueue
Type: Class
Extends: com.nisovin.shopkeepers.util.taskqueue.TaskQueue

No public methods found

### Class: com.nisovin.shopkeepers.shopkeeper.spawning.ShopkeeperSpawnState
Type: Class
Extends: com.nisovin.shopkeepers.component.Component

Methods:
- boolean isSpawningScheduled()

### Class: com.nisovin.shopkeepers.shopkeeper.spawning.ShopkeeperSpawner
Type: Class

Methods:
- void onShopkeeperMoved(AbstractShopkeeper, ChunkCoords, boolean)
- void spawnShopkeeperImmediately(AbstractShopkeeper)
- TaskQueueStatistics getSpawnQueueStatistics()
- void onShopkeeperWorldRemoved(String)
- void spawnChunkShopkeepers(ChunkCoords, String, Predicate, boolean)
- void spawnChunkShopkeepers(ChunkCoords, String, Collection, Predicate, boolean)
- void despawnChunkShopkeepers(ChunkCoords, String, Predicate, Consumer)
- void despawnChunkShopkeepers(ChunkCoords, String, Collection, Predicate, Consumer)
- void onEnable()
- void onDisable()
- void despawnShopkeeper(AbstractShopkeeper)

## Package: com.nisovin.shopkeepers.shopkeeper.teleporting

### Class: com.nisovin.shopkeepers.shopkeeper.teleporting.ShopkeeperTeleporter
Type: Class

Methods:
- boolean teleport(Player, Shopkeeper, boolean, CommandSender)

## Package: com.nisovin.shopkeepers.shopkeeper.ticking

### Class: com.nisovin.shopkeepers.shopkeeper.ticking.ShopkeeperTicker
Type: Class

Methods:
- void startTicking(AbstractShopkeeper)
- void stopTicking(AbstractShopkeeper)
- void onEnable()
- int nextTickingGroup()
- void onDisable()

## Package: com.nisovin.shopkeepers.shopobjects

### Class: com.nisovin.shopkeepers.shopobjects.AbstractShopObject
Type: Abstract Class
Implements: com.nisovin.shopkeepers.api.shopobjects.ShopObject

Methods:
- void setName(String)
- boolean respawn()
- Location getLocation()
- String getName()
- void onTick()
- void onStartTicking()
- void visualizeLastTick()
- void save(ShopObjectData, boolean)
- void onTickStart()
- Object getId()
- void despawn()
- boolean isActive()
- String prepareName(String)
- void delete()
- void remove()
- List createEditorButtons()
- void load(ShopObjectData) throws InvalidDataException
- void onTickEnd()
- void onShopkeeperAdded(ShopkeeperAddedEvent$Cause)
- boolean move()
- Location getTickVisualizationParticleLocation()
- AbstractShopkeeper getShopkeeper()
- void setAttachedBlockFace(BlockFace)
- Object getLastId()
- int getNameLengthLimit()
- int updateItems(String, ShopObjectData)
- boolean spawn()
- void onShopOwnerChanged()
- AbstractShopObjectType getType()
- ShopObjectType getType()
- void setLastId(Object)
- void setup()
- void onStopTicking()

### Class: com.nisovin.shopkeepers.shopobjects.AbstractShopObjectType
Type: Abstract Class
Extends: com.nisovin.shopkeepers.types.AbstractSelectableType
Implements: com.nisovin.shopkeepers.api.shopobjects.ShopObjectType

Methods:
- Class getShopObjectClass()
- boolean mustDespawnDuringWorldSave()
- boolean mustBeSpawned()
- boolean isValidSpawnLocation(Location, BlockFace)
- boolean validateSpawnLocation(Player, Location, BlockFace)
- AbstractShopObject createObject(AbstractShopkeeper, ShopCreationData)

### Class: com.nisovin.shopkeepers.shopobjects.SKDefaultShopObjectTypes
Type: Class
Implements: com.nisovin.shopkeepers.api.shopobjects.DefaultShopObjectTypes

Methods:
- SKCitizensShopObjectType getCitizensShopObjectType()
- CitizensShopObjectType getCitizensShopObjectType()
- SKLivingShopObjectTypes getLivingShopObjectTypes()
- LivingShopObjectTypes getLivingShopObjectTypes()
- List getAll()
- SKHangingSignShopObjectType HANGING_SIGN()
- SKLivingShopObjectTypes LIVING()
- SKHangingSignShopObjectType getHangingSignShopObjectType()
- HangingSignShopObjectType getHangingSignShopObjectType()
- SKSignShopObjectType SIGN()
- SKDefaultShopObjectTypes getInstance()
- SKSignShopObjectType getSignShopObjectType()
- SignShopObjectType getSignShopObjectType()
- SKCitizensShopObjectType CITIZEN()

### Class: com.nisovin.shopkeepers.shopobjects.SKShopObjectTypesRegistry
Type: Class
Extends: com.nisovin.shopkeepers.types.AbstractSelectableTypeRegistry
Implements: com.nisovin.shopkeepers.api.shopobjects.ShopObjectTypesRegistry

No public methods found

### Class: com.nisovin.shopkeepers.shopobjects.ShopObjectData
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.DelegateDataContainer

Methods:
- ShopObjectData of(DataContainer)
- ShopObjectData ofNonNull(DataContainer)

### Class: com.nisovin.shopkeepers.shopobjects.ShopkeeperMetadata
Type: Class

Methods:
- boolean isTagged(Entity)
- boolean isTagged(Block)
- void apply(Entity)
- void apply(Block)
- void remove(Entity)
- void remove(Block)

## Package: com.nisovin.shopkeepers.shopobjects.block

### Class: com.nisovin.shopkeepers.shopobjects.block.AbstractBlockShopObject
Type: Abstract Class
Extends: com.nisovin.shopkeepers.shopobjects.AbstractShopObject
Implements: com.nisovin.shopkeepers.api.shopobjects.block.BlockShopObject

Methods:
- Location getLocation()
- AbstractBlockShopObjectType getType()
- AbstractShopObjectType getType()
- ShopObjectType getType()
- Object getId()
- boolean isSpawned()
- boolean isActive()

### Class: com.nisovin.shopkeepers.shopobjects.block.AbstractBlockShopObjectType
Type: Abstract Class
Extends: com.nisovin.shopkeepers.shopobjects.AbstractShopObjectType
Implements: com.nisovin.shopkeepers.api.shopobjects.block.BlockShopObjectType

Methods:
- AbstractShopkeeper getShopkeeper(Block)
- AbstractShopkeeper getShopkeeper(String, int, int, int)
- Shopkeeper getShopkeeper(String, int, int, int)
- Shopkeeper getShopkeeper(Block)
- boolean isShopkeeper(Block)
- boolean isShopkeeper(String, int, int, int)

### Class: com.nisovin.shopkeepers.shopobjects.block.BlockShopObjectIds
Type: Class

Methods:
- Object getSharedObjectId(Block)
- Object getSharedObjectId(String, int, int, int)
- Object getObjectId(Block)
- Object getObjectId(String, int, int, int)

## Package: com.nisovin.shopkeepers.shopobjects.block.base

### Class: com.nisovin.shopkeepers.shopobjects.block.base.BaseBlockShopObject
Type: Abstract Class
Extends: com.nisovin.shopkeepers.shopobjects.block.AbstractBlockShopObject

Methods:
- void setName(String)
- boolean move()
- Block getBlock()
- String getName()
- void onTick()
- boolean spawn()
- void onShopOwnerChanged()
- BaseBlockShops getBlockShops()
- void despawn()
- boolean isActive()
- BlockFace getAttachedBlockFace()

### Class: com.nisovin.shopkeepers.shopobjects.block.base.BaseBlockShopObjectType
Type: Abstract Class
Extends: com.nisovin.shopkeepers.shopobjects.block.AbstractBlockShopObjectType

No public methods found

### Class: com.nisovin.shopkeepers.shopobjects.block.base.BaseBlockShops
Type: Class

Methods:
- void removeBlockPhysicsCancellation(Block)
- void removeBlockPhysicsCancellation(BlockLocation)
- boolean isBaseBlockShop(Shopkeeper)
- boolean isBaseBlockShop(Block)
- boolean isBaseBlockShop(String, int, int, int)
- void onEnable()
- void addBlockPhysicsCancellation(Block)
- void addBlockPhysicsCancellation(BlockLocation)
- void onDisable()

## Package: com.nisovin.shopkeepers.shopobjects.citizens

### Class: com.nisovin.shopkeepers.shopobjects.citizens.CitizensShopkeeperTrait
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- void onTraitDeleted(Player)
- AbstractShopkeeper getShopkeeper()
- void load(DataKey)
- void onAttach()
- void save(DataKey)
- void onRemove()

### Class: com.nisovin.shopkeepers.shopobjects.citizens.CitizensShops
Type: Class

Methods:
- String getNPCIdString(NPC)
- SKCitizensShopObjectType getCitizensShopObjectType()
- UUID getNPCUniqueId(Entity)
- AbstractShopkeeper getShopkeeper(NPC)
- List getShopkeepers(NPC)
- boolean isShopkeeper(NPC)
- boolean isEnabled()
- void onEnable()
- void saveNPCs()
- void onDisable()
- int validateCitizenShopkeepers(boolean, boolean)
- NPC createNPC(Location, EntityType, String)

### Class: com.nisovin.shopkeepers.shopobjects.citizens.SKCitizensShopObject
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.entity.AbstractEntityShopObject
Implements: com.nisovin.shopkeepers.api.shopobjects.citizens.CitizensShopObject

Methods:
- void setName(String)
- boolean move()
- String getName()
- void onTick()
- NPC getNPC()
- void save(ShopObjectData, boolean)
- int getNameLengthLimit()
- void despawn()
- boolean isActive()
- Entity getEntity()
- void delete()
- void remove()
- boolean spawn()
- UUID getNPCUniqueId()
- void load(ShopObjectData) throws InvalidDataException
- void onShopOwnerChanged()
- SKCitizensShopObjectType getType()
- AbstractEntityShopObjectType getType()
- ShopObjectType getType()
- AbstractShopObjectType getType()
- void onShopkeeperAdded(ShopkeeperAddedEvent$Cause)
- void onStopTicking()

### Class: com.nisovin.shopkeepers.shopobjects.citizens.SKCitizensShopObjectType
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.entity.AbstractEntityShopObjectType
Implements: com.nisovin.shopkeepers.api.shopobjects.citizens.CitizensShopObjectType

Methods:
- boolean mustBeSpawned()
- String getDisplayName()
- boolean isEnabled()
- boolean validateSpawnLocation(Player, Location, BlockFace)
- SKCitizensShopObject createObject(AbstractShopkeeper, ShopCreationData)
- AbstractShopObject createObject(AbstractShopkeeper, ShopCreationData)

## Package: com.nisovin.shopkeepers.shopobjects.entity

### Class: com.nisovin.shopkeepers.shopobjects.entity.AbstractEntityShopObject
Type: Abstract Class
Extends: com.nisovin.shopkeepers.shopobjects.AbstractShopObject
Implements: com.nisovin.shopkeepers.api.shopobjects.entity.EntityShopObject

Methods:
- Location getLocation()
- Location getTickVisualizationParticleLocation()
- AbstractEntityShopObjectType getType()
- AbstractShopObjectType getType()
- ShopObjectType getType()
- Object getId()
- boolean isSpawned()
- boolean isActive()

### Class: com.nisovin.shopkeepers.shopobjects.entity.AbstractEntityShopObjectType
Type: Abstract Class
Extends: com.nisovin.shopkeepers.shopobjects.AbstractShopObjectType
Implements: com.nisovin.shopkeepers.api.shopobjects.entity.EntityShopObjectType

Methods:
- AbstractShopkeeper getShopkeeper(Entity)
- Shopkeeper getShopkeeper(Entity)
- boolean isShopkeeper(Entity)

### Class: com.nisovin.shopkeepers.shopobjects.entity.EntityShopObjectIds
Type: Class

Methods:
- Object getObjectId(Entity)

## Package: com.nisovin.shopkeepers.shopobjects.living

### Class: com.nisovin.shopkeepers.shopobjects.living.LivingEntityAI
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- int getActiveAIEntityCount()
- Timings getTotalTimings()
- void removeShopObject(SKLivingShopObject)
- void addShopObject(SKLivingShopObject)
- int getActiveGravityChunksCount()
- void onEnable()
- void onDisable()
- Timings getAITimings()
- Timings getGravityTimings()
- int getActiveGravityEntityCount()
- void updateLocation(SKLivingShopObject)
- Timings getActivationTimings()
- int getEntityCount()
- int getActiveAIChunksCount()

### Class: com.nisovin.shopkeepers.shopobjects.living.LivingShops
Type: Class

Methods:
- void onRegisterDefaults()
- SKLivingShopObjectTypes getLivingShopObjectTypes()
- LivingEntityAI getLivingEntityAI()
- void onEnable()
- void onDisable()

### Class: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopEquipment
Type: Class
Implements: com.nisovin.shopkeepers.api.shopobjects.living.LivingShopEquipment

Methods:
- Map getItems()
- int hashCode()
- boolean equals(Object)
- void clear()
- UnmodifiableItemStack getItem(EquipmentSlot)
- void setItem(EquipmentSlot, UnmodifiableItemStack)

### Class: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.entity.AbstractEntityShopObject
Implements: com.nisovin.shopkeepers.api.shopobjects.living.LivingShopObject

Methods:
- void setName(String)
- boolean move()
- String getName()
- void onTick()
- void teleportBack()
- void save(ShopObjectData, boolean)
- EntityType getEntityType()
- void despawn()
- LivingEntity getEntity()
- Entity getEntity()
- int updateItems(String, ShopObjectData)
- LivingShopEquipment getEquipment()
- void tickAI()
- List createEditorButtons()
- boolean spawn()
- void load(ShopObjectData) throws InvalidDataException
- SKLivingShopObjectType getType()
- AbstractEntityShopObjectType getType()
- ShopObjectType getType()
- AbstractShopObjectType getType()
- boolean openEquipmentEditor(Player, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObjectType
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.entity.AbstractEntityShopObjectType
Implements: com.nisovin.shopkeepers.api.shopobjects.living.LivingShopObjectType

Methods:
- boolean mustDespawnDuringWorldSave()
- boolean mustBeSpawned()
- String getDisplayName()
- boolean hasPermission(Player)
- boolean isEnabled()
- EntityType getEntityType()
- boolean validateSpawnLocation(Player, Location, BlockFace)
- SKLivingShopObject createObject(AbstractShopkeeper, ShopCreationData)
- AbstractShopObject createObject(AbstractShopkeeper, ShopCreationData)

### Class: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObjectTypes
Type: Class
Implements: com.nisovin.shopkeepers.api.shopobjects.living.LivingShopObjectTypes

Methods:
- void onRegisterDefaults()
- Collection getAll()
- SKLivingShopObjectType get(EntityType)
- LivingShopObjectType get(EntityType)

## Package: com.nisovin.shopkeepers.shopobjects.living.types

### Class: com.nisovin.shopkeepers.shopobjects.living.types.AbstractHorseShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- boolean hasSaddle()
- void load(ShopObjectData) throws InvalidDataException
- void setSaddle(boolean)
- void cycleSaddle()
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.AxolotlShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- void cycleVariant(boolean)
- void load(ShopObjectData) throws InvalidDataException
- Axolotl$Variant getVariant()
- void setVariant(Axolotl$Variant)
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- void setBaby(boolean)
- boolean isBaby()
- List createEditorButtons()
- void cycleBaby()
- void load(ShopObjectData) throws InvalidDataException
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.CatShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.SittableShop

Methods:
- List createEditorButtons()
- void cycleCatType(boolean)
- void load(ShopObjectData) throws InvalidDataException
- DyeColor getCollarColor()
- void setCatType(Cat$Type)
- void save(ShopObjectData, boolean)
- void cycleCollarColor(boolean)
- Cat$Type getCatType()
- void setCollarColor(DyeColor)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.ChestedHorseShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.AbstractHorseShop

Methods:
- List createEditorButtons()
- void load(ShopObjectData) throws InvalidDataException
- void save(ShopObjectData, boolean)
- void setCarryingChest(boolean)
- boolean isCarryingChest()
- void cycleCarryingChest()

### Class: com.nisovin.shopkeepers.shopobjects.living.types.ChickenShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- void cycleVariant(boolean)
- void load(ShopObjectData) throws InvalidDataException
- NamespacedKey getVariant()
- void setVariant(NamespacedKey)
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.CowShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- void cycleVariant(boolean)
- void load(ShopObjectData) throws InvalidDataException
- NamespacedKey getVariant()
- void setVariant(NamespacedKey)
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.CreeperShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- List createEditorButtons()
- void load(ShopObjectData) throws InvalidDataException
- void save(ShopObjectData, boolean)
- boolean isPowered()
- void setPowered(boolean)
- void cyclePowered()

### Class: com.nisovin.shopkeepers.shopobjects.living.types.EndermanShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- List createEditorButtons()
- void load(ShopObjectData) throws InvalidDataException
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.FoxShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.SittableShop

Methods:
- void setFoxType(Fox$Type)
- List createEditorButtons()
- void load(ShopObjectData) throws InvalidDataException
- void setSleeping(boolean)
- boolean isCrouching()
- Fox$Type getFoxType()
- boolean isSleeping()
- void save(ShopObjectData, boolean)
- void cycleCrouching()
- void setCrouching(boolean)
- void cycleFoxType(boolean)
- void cycleSleeping()

### Class: com.nisovin.shopkeepers.shopobjects.living.types.FrogShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- void cycleVariant(boolean)
- void load(ShopObjectData) throws InvalidDataException
- Frog$Variant getVariant()
- void setVariant(Frog$Variant)
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.GlowSquidShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- List createEditorButtons()
- void setDark(boolean)
- boolean isDark()
- void load(ShopObjectData) throws InvalidDataException
- void cycleDark(boolean)
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.GoatShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- boolean isScreaming()
- List createEditorButtons()
- void cycleLeftHorn(boolean)
- boolean hasRightHorn()
- void cycleScreaming(boolean)
- void load(ShopObjectData) throws InvalidDataException
- void setLeftHorn(boolean)
- boolean hasLeftHorn()
- void save(ShopObjectData, boolean)
- void cycleRightHorn(boolean)
- void setRightHorn(boolean)
- void setScreaming(boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.HorseShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.AbstractHorseShop

Methods:
- List createEditorButtons()
- HorseShop$HorseArmor getArmor()
- Horse$Style getStyle()
- void setColor(Horse$Color)
- void load(ShopObjectData) throws InvalidDataException
- void setArmor(HorseShop$HorseArmor)
- void save(ShopObjectData, boolean)
- void setStyle(Horse$Style)
- Horse$Color getColor()
- void cycleStyle(boolean)
- void cycleArmor(boolean)
- void cycleColor(boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.LlamaShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.ChestedHorseShop

Methods:
- List createEditorButtons()
- void setColor(Llama$Color)
- void load(ShopObjectData) throws InvalidDataException
- void cycleCarpetColor(boolean)
- DyeColor getCarpetColor()
- void save(ShopObjectData, boolean)
- Llama$Color getColor()
- void setCarpetColor(DyeColor)
- void cycleColor(boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.MagmaCubeShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- List createEditorButtons()
- int getSize()
- void setSize(int)
- void load(ShopObjectData) throws InvalidDataException
- void cycleSize(boolean)
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.MooshroomShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- void cycleVariant(boolean)
- void load(ShopObjectData) throws InvalidDataException
- MushroomCow$Variant getVariant()
- void setVariant(MushroomCow$Variant)
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.PandaShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- void cycleGene(boolean)
- Panda$Gene getGene()
- void load(ShopObjectData) throws InvalidDataException
- void save(ShopObjectData, boolean)
- void setGene(Panda$Gene)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.ParrotShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.SittableShop

Methods:
- List createEditorButtons()
- void cycleVariant(boolean)
- void load(ShopObjectData) throws InvalidDataException
- Parrot$Variant getVariant()
- void setVariant(Parrot$Variant)
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.PigShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- void cycleVariant(boolean)
- boolean hasSaddle()
- void load(ShopObjectData) throws InvalidDataException
- NamespacedKey getVariant()
- void setSaddle(boolean)
- void cycleSaddle()
- void setVariant(NamespacedKey)
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.PufferFishShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- List createEditorButtons()
- void load(ShopObjectData) throws InvalidDataException
- void setPuffState(int)
- void save(ShopObjectData, boolean)
- void cyclePuffState(boolean)
- int getPuffState()

### Class: com.nisovin.shopkeepers.shopobjects.living.types.RabbitShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- void setRabbitType(Rabbit$Type)
- void load(ShopObjectData) throws InvalidDataException
- void save(ShopObjectData, boolean)
- Rabbit$Type getRabbitType()
- void cycleRabbitType(boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.SalmonShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- List createEditorButtons()
- void cycleVariant(boolean)
- void load(ShopObjectData) throws InvalidDataException
- String getVariant()
- void setVariant(String)
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.SheepShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- void setColor(DyeColor)
- boolean isSheared()
- void load(ShopObjectData) throws InvalidDataException
- void cycleSheared()
- void save(ShopObjectData, boolean)
- DyeColor getColor()
- void setSheared(boolean)
- void cycleColor(boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.ShulkerShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- List createEditorButtons()
- void setColor(DyeColor)
- void load(ShopObjectData) throws InvalidDataException
- BlockFace getAttachedFace()
- void setAttachedBlockFace(BlockFace)
- void save(ShopObjectData, boolean)
- DyeColor getColor()
- void setAttachedFace(BlockFace)
- void tickAI()
- void cycleColor(boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.SittableShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- boolean isSitting()
- void cycleSitting()
- void load(ShopObjectData) throws InvalidDataException
- void save(ShopObjectData, boolean)
- void setSitting(boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.SlimeShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- List createEditorButtons()
- int getSize()
- void setSize(int)
- void load(ShopObjectData) throws InvalidDataException
- void cycleSize(boolean)
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.SnowmanShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- List createEditorButtons()
- void load(ShopObjectData) throws InvalidDataException
- void cyclePumpkinHead()
- void save(ShopObjectData, boolean)
- boolean hasPumpkinHead()
- void setPumpkinHead(boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.StriderShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- boolean hasSaddle()
- void load(ShopObjectData) throws InvalidDataException
- void setSaddle(boolean)
- void cycleSaddle()
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.TropicalFishShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- List createEditorButtons()
- void cyclePatternColor(boolean)
- void cyclePattern(boolean)
- void cycleBodyColor(boolean)
- void load(ShopObjectData) throws InvalidDataException
- void save(ShopObjectData, boolean)
- void setPattern(TropicalFish$Pattern)
- DyeColor getPatternColor()
- DyeColor getBodyColor()
- void setBodyColor(DyeColor)
- TropicalFish$Pattern getPattern()
- void setPatternColor(DyeColor)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.VillagerShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- void setVillagerType(Villager$Type)
- void onTick()
- void save(ShopObjectData, boolean)
- void setVillagerLevel(int)
- Villager$Type getVillagerType()
- Villager$Profession getProfession()
- List createEditorButtons()
- void cycleVillagerLevel(boolean)
- int getVillagerLevel()
- void load(ShopObjectData) throws InvalidDataException
- void cycleVillagerType(boolean)
- void cycleProfession(boolean)
- void setup()
- void setProfession(Villager$Profession)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.WanderingTraderShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.BabyableShop

Methods:
- List createEditorButtons()
- void onTick()
- void load(ShopObjectData) throws InvalidDataException
- void save(ShopObjectData, boolean)
- void setup()

### Class: com.nisovin.shopkeepers.shopobjects.living.types.WolfShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.SittableShop

Methods:
- List createEditorButtons()
- void cycleVariant(boolean)
- void onTick()
- boolean isAngry()
- void load(ShopObjectData) throws InvalidDataException
- Wolf$Variant getVariant()
- DyeColor getCollarColor()
- void setVariant(Wolf$Variant)
- void save(ShopObjectData, boolean)
- void cycleCollarColor(boolean)
- void setAngry(boolean)
- void cycleAngry()
- void setCollarColor(DyeColor)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.ZombieShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.SKLivingShopObject

Methods:
- void setBaby(boolean)
- boolean isBaby()
- List createEditorButtons()
- void cycleBaby()
- void load(ShopObjectData) throws InvalidDataException
- void save(ShopObjectData, boolean)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.ZombieVillagerShop
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.ZombieShop

Methods:
- List createEditorButtons()
- void load(ShopObjectData) throws InvalidDataException
- void cycleProfession(boolean)
- void save(ShopObjectData, boolean)
- void setProfession(Villager$Profession)
- Villager$Profession getProfession()

## Package: com.nisovin.shopkeepers.shopobjects.living.types.villager

### Class: com.nisovin.shopkeepers.shopobjects.living.types.villager.VillagerSounds
Type: Class
Extends: com.nisovin.shopkeepers.ui.trading.TradingListener

Methods:
- void onTradeSelect(UISession, TradeSelectEvent)
- void onTradeAborted(TradingContext, boolean)
- void tick()
- void onTradeCompleted(Trade, boolean)
- void onInventoryClick(UISession, InventoryClickEvent)

### Class: com.nisovin.shopkeepers.shopobjects.living.types.villager.WanderingTraderSounds
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.living.types.villager.VillagerSounds

No public methods found

## Package: com.nisovin.shopkeepers.shopobjects.sign

### Class: com.nisovin.shopkeepers.shopobjects.sign.SKHangingSignShopObject
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.block.base.BaseBlockShopObject
Implements: com.nisovin.shopkeepers.api.shopobjects.sign.HangingSignShopObject

Methods:
- BlockFace getSignFacing()
- Location getTickVisualizationParticleLocation()
- void cycleSignType(boolean)
- SignType getSignType()
- void setAttachedBlockFace(BlockFace)
- void save(ShopObjectData, boolean)
- void setGlowingText(boolean)
- void cycleGlowingText(boolean)
- List createEditorButtons()
- void load(ShopObjectData) throws InvalidDataException
- boolean isWallSign()
- SKHangingSignShopObjectType getType()
- AbstractBlockShopObjectType getType()
- ShopObjectType getType()
- AbstractShopObjectType getType()
- Sign getSign()
- void setSignType(SignType)
- boolean isGlowingText()
- BlockFace getAttachedBlockFace()

### Class: com.nisovin.shopkeepers.shopobjects.sign.SKHangingSignShopObjectType
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.block.base.BaseBlockShopObjectType
Implements: com.nisovin.shopkeepers.api.shopobjects.sign.HangingSignShopObjectType

Methods:
- boolean mustBeSpawned()
- String getDisplayName()
- boolean isEnabled()
- boolean validateSpawnLocation(Player, Location, BlockFace)
- SKHangingSignShopObject createObject(AbstractShopkeeper, ShopCreationData)
- AbstractShopObject createObject(AbstractShopkeeper, ShopCreationData)

### Class: com.nisovin.shopkeepers.shopobjects.sign.SKSignShopObject
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.block.base.BaseBlockShopObject
Implements: com.nisovin.shopkeepers.api.shopobjects.sign.SignShopObject

Methods:
- BlockFace getSignFacing()
- Location getTickVisualizationParticleLocation()
- void cycleSignType(boolean)
- SignType getSignType()
- void setAttachedBlockFace(BlockFace)
- void save(ShopObjectData, boolean)
- void setGlowingText(boolean)
- void cycleGlowingText(boolean)
- List createEditorButtons()
- void load(ShopObjectData) throws InvalidDataException
- boolean isWallSign()
- SKSignShopObjectType getType()
- AbstractBlockShopObjectType getType()
- ShopObjectType getType()
- AbstractShopObjectType getType()
- Sign getSign()
- void setSignType(SignType)
- boolean isGlowingText()
- BlockFace getAttachedBlockFace()

### Class: com.nisovin.shopkeepers.shopobjects.sign.SKSignShopObjectType
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.block.base.BaseBlockShopObjectType
Implements: com.nisovin.shopkeepers.api.shopobjects.sign.SignShopObjectType

Methods:
- boolean mustBeSpawned()
- String getDisplayName()
- boolean isEnabled()
- boolean validateSpawnLocation(Player, Location, BlockFace)
- SKSignShopObject createObject(AbstractShopkeeper, ShopCreationData)
- AbstractShopObject createObject(AbstractShopkeeper, ShopCreationData)

### Class: com.nisovin.shopkeepers.shopobjects.sign.SignType
Type: Enum
Extends: java.lang.Enum

Methods:
- Material getSignMaterial()
- Material getSignMaterial(boolean)
- Material getWallHangingSignMaterial()
- SignType valueOf(String)
- SignType[] values()
- Material getHangingSignMaterial()
- Material getHangingSignMaterial(boolean)
- boolean isSupported()
- boolean isHangingSupported()
- Material getWallSignMaterial()

## Package: com.nisovin.shopkeepers.shopobjects.virtual

### Class: com.nisovin.shopkeepers.shopobjects.virtual.SKVirtualShopObject
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.AbstractShopObject
Implements: com.nisovin.shopkeepers.api.shopobjects.virtual.VirtualShopObject

Methods:
- void setName(String)
- boolean move()
- Location getLocation()
- String getName()
- Location getTickVisualizationParticleLocation()
- void onTick()
- void save(ShopObjectData, boolean)
- String getId()
- Object getId()
- void despawn()
- boolean isActive()
- List createEditorButtons()
- boolean spawn()
- void load(ShopObjectData) throws InvalidDataException
- SKVirtualShopObjectType getType()
- AbstractShopObjectType getType()
- ShopObjectType getType()
- boolean isSpawned()

### Class: com.nisovin.shopkeepers.shopobjects.virtual.SKVirtualShopObjectType
Type: Class
Extends: com.nisovin.shopkeepers.shopobjects.AbstractShopObjectType
Implements: com.nisovin.shopkeepers.api.shopobjects.virtual.VirtualShopObjectType

Methods:
- boolean mustBeSpawned()
- String getDisplayName()
- boolean isEnabled()
- boolean validateSpawnLocation(Player, Location, BlockFace)
- SKVirtualShopObject createObject(AbstractShopkeeper, ShopCreationData)
- AbstractShopObject createObject(AbstractShopkeeper, ShopCreationData)

### Class: com.nisovin.shopkeepers.shopobjects.virtual.VirtualShops
Type: Class

Methods:
- SKVirtualShopObjectType getSignShopObjectType()
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.spigot

### Class: com.nisovin.shopkeepers.spigot.SpigotFeatures
Type: Class

Methods:
- boolean isSpigotAvailable()

## Package: com.nisovin.shopkeepers.spigot.text

### Class: com.nisovin.shopkeepers.spigot.text.SpigotText
Type: Class

Methods:
- void sendMessage(CommandSender, Text)

## Package: com.nisovin.shopkeepers.storage

### Class: com.nisovin.shopkeepers.storage.DataVersion
Type: Class

Methods:
- boolean isShopkeeperDataUpgrade(DataVersion)
- boolean isShopkeeperDataDowngrade(DataVersion)
- void init()
- String getName()
- boolean isMinecraftUpgrade(DataVersion)
- boolean isMinecraftDowngrade(DataVersion)
- boolean isEmpty()
- int getShopkeeperStorageVersion()
- DataVersion parse(String)
- int getShopkeeperDataVersion()
- int getMinecraftDataVersion()
- boolean isShopkeeperStorageDowngrade(DataVersion)
- DataVersion current()
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean isShopkeeperStorageUpgrade(DataVersion)

### Class: com.nisovin.shopkeepers.storage.SKShopkeeperStorage
Type: Class
Implements: com.nisovin.shopkeepers.api.storage.ShopkeeperStorage

Methods:
- void markDirty(AbstractShopkeeper)
- void deleteShopkeeper(AbstractShopkeeper)
- void save()
- void onEnable()
- void onDisable()
- void saveIfDirtyAndAwaitCompletion()
- int getUnsavedDeletedShopkeepersCount()
- void disableSaving()
- int getNextShopkeeperId()
- void saveImmediate()
- boolean isDirty()
- boolean reload()
- void saveDelayed()
- void onShopkeeperIdUsed(int)
- void saveNow()
- void enableSaving()
- int getUnsavedDirtyShopkeepersCount()

### Class: com.nisovin.shopkeepers.storage.ShopkeeperStorageSaveException
Type: Class
Extends: java.lang.Exception

No public methods found

## Package: com.nisovin.shopkeepers.storage.migration

### Class: com.nisovin.shopkeepers.storage.migration.RawDataMigration
Type: Interface

Methods:
- String getName()
- String apply(String) throws RawDataMigrationException

### Class: com.nisovin.shopkeepers.storage.migration.RawDataMigrationException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.nisovin.shopkeepers.storage.migration.RawDataMigration_1_20_5_PlayerProfiles
Type: Class
Implements: com.nisovin.shopkeepers.storage.migration.RawDataMigration

Methods:
- String getName()
- String apply(String) throws RawDataMigrationException

### Class: com.nisovin.shopkeepers.storage.migration.RawDataMigrations
Type: Class

Methods:
- String applyMigrations(String) throws RawDataMigrationException

## Package: com.nisovin.shopkeepers.text

### Class: com.nisovin.shopkeepers.text.Text
Type: Interface

Methods:
- TextBuilder translatable(String)
- Text getParent()
- TextBuilder color(ChatColor)
- TextBuilder color(Color)
- String toPlainText()
- boolean isPlainText()
- Text getChild()
- Text getNext()
- Text parse(String)
- List parse(Collection)
- boolean isPlainTextEmpty()
- TextBuilder hoverEvent(HoverEventText$Content)
- TextBuilder hoverEvent(Text)
- TextBuilder clickEvent(ClickEventText$Action, String)
- String toFormat()
- TextBuilder newline()
- String toUnformattedText()
- Text of(String)
- Text of(Object)
- TextBuilder reset()
- String toString()
- TextBuilder insertion(String)
- Text copy()
- TextBuilder placeholder(String)
- TextBuilder text(String)
- TextBuilder text(Object)
- Text getRoot()
- Text setPlaceholderArguments(MessageArguments)
- Text setPlaceholderArguments(Map)
- Text setPlaceholderArguments(Object[])
- TextBuilder formatting(String)
- TextBuilder formatting(ChatColor)
- Text clearPlaceholderArguments()

### Class: com.nisovin.shopkeepers.text.AbstractText
Type: Abstract Class
Implements: com.nisovin.shopkeepers.text.Text

Methods:
- String toFormat()
- Text getParent()
- String toPlainText()
- boolean isPlainText()
- String toUnformattedText()
- Text getChild()
- Text getNext()
- Text getRoot()
- Text setPlaceholderArguments(MessageArguments)
- Text setPlaceholderArguments(Map)
- Text setPlaceholderArguments(Object[])
- boolean isPlainTextEmpty()
- Text clearPlaceholderArguments()

### Class: com.nisovin.shopkeepers.text.ClickEventText
Type: Class
Extends: com.nisovin.shopkeepers.text.TextBuilder

Methods:
- String getValue()
- boolean isPlainText()
- ClickEventText$Action getAction()
- Text copy()

### Class: com.nisovin.shopkeepers.text.FormattingText
Type: Class
Extends: com.nisovin.shopkeepers.text.TextBuilder

Methods:
- String getFormattingCode()
- Text copy()
- boolean isPlainTextEmpty()

### Class: com.nisovin.shopkeepers.text.HoverEventText
Type: Class
Extends: com.nisovin.shopkeepers.text.TextBuilder

Methods:
- Text build()
- boolean isPlainText()
- HoverEventText$Content getContent()
- Text copy()
- Text setPlaceholderArguments(MessageArguments)
- Text clearPlaceholderArguments()

### Class: com.nisovin.shopkeepers.text.InsertionText
Type: Class
Extends: com.nisovin.shopkeepers.text.TextBuilder

Methods:
- boolean isPlainText()
- String getInsertion()
- Text copy()

### Class: com.nisovin.shopkeepers.text.PlaceholderText
Type: Class
Extends: com.nisovin.shopkeepers.text.TextBuilder

Methods:
- String getFormattedPlaceholderKey()
- void setPlaceholderArgument(Object)
- Text getPlaceholderArgument()
- Text getChild()
- String getPlaceholderKey()
- Text copy()
- PlaceholderText copy(Text, boolean)
- TextBuilder copy(Text, boolean)
- Text setPlaceholderArguments(MessageArguments)
- boolean hasPlaceholderArgument()
- Text child(Text)
- Text clearPlaceholderArguments()

### Class: com.nisovin.shopkeepers.text.PlainText
Type: Class
Extends: com.nisovin.shopkeepers.text.TextBuilder

Methods:
- String getText()
- Text copy()
- boolean isPlainTextEmpty()

### Class: com.nisovin.shopkeepers.text.TextBuilder
Type: Abstract Class
Extends: com.nisovin.shopkeepers.text.AbstractText

Methods:
- Text next(Text)
- TextBuilder childHoverEvent(HoverEventText$Content)
- TextBuilder childHoverEvent(Text)
- TextBuilder color(ChatColor)
- TextBuilder childFormatting(ChatColor)
- Text buildRoot()
- TextBuilder hoverEvent(HoverEventText$Content)
- TextBuilder hoverEvent(Text)
- TextBuilder newline()
- TextBuilder childNewline()
- Text copy()
- TextBuilder copy(Text, boolean)
- TextBuilder placeholder(String)
- TextBuilder text(String)
- TextBuilder text(Object)
- TextBuilder childReset()
- TextBuilder childColor(ChatColor)
- TextBuilder childTranslatable(String)
- TextBuilder translatable(String)
- TextBuilder childClickEvent(ClickEventText$Action, String)
- boolean isBuilt()
- TextBuilder clickEvent(ClickEventText$Action, String)
- TextBuilder childAndNext(Text, Text)
- Text build()
- TextBuilder childPlaceholder(String)
- TextBuilder reset()
- String toString()
- TextBuilder insertion(String)
- TextBuilder childText(String)
- TextBuilder childText(Object)
- TextBuilder childInsertion(String)
- Text setPlaceholderArguments(MessageArguments)
- TextBuilder formatting(ChatColor)
- Text child(Text)

### Class: com.nisovin.shopkeepers.text.TranslatableText
Type: Class
Extends: com.nisovin.shopkeepers.text.TextBuilder

Methods:
- boolean isPlainText()
- String getTranslationKey()
- Text copy()
- TranslatableText copy(Text, boolean)
- TextBuilder copy(Text, boolean)
- TranslatableText setTranslationArguments(List)
- List getTranslationArguments()

## Package: com.nisovin.shopkeepers.tradelog

### Class: com.nisovin.shopkeepers.tradelog.TradeLogger
Type: Interface

Methods:
- void flush()
- void setup()
- void logTrade(TradeRecord)

### Class: com.nisovin.shopkeepers.tradelog.TradeLogStorageType
Type: Enum
Extends: java.lang.Enum

Methods:
- TradeLogStorageType valueOf(String)
- TradeLogStorageType[] values()

### Class: com.nisovin.shopkeepers.tradelog.TradeLogUtils
Type: Class

Methods:
- String getItemMetadata(UnmodifiableItemStack)

### Class: com.nisovin.shopkeepers.tradelog.TradeLoggers
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.tradelog.base

### Class: com.nisovin.shopkeepers.tradelog.base.AbstractFileTradeLogger
Type: Abstract Class
Extends: com.nisovin.shopkeepers.tradelog.base.AbstractSingleWriterTradeLogger

No public methods found

### Class: com.nisovin.shopkeepers.tradelog.base.AbstractSingleWriterTradeLogger
Type: Abstract Class
Implements: com.nisovin.shopkeepers.tradelog.TradeLogger

Methods:
- void flush()
- void setup()
- void logTrade(TradeRecord)

## Package: com.nisovin.shopkeepers.tradelog.csv

### Class: com.nisovin.shopkeepers.tradelog.csv.CsvTradeLogger
Type: Class
Extends: com.nisovin.shopkeepers.tradelog.base.AbstractFileTradeLogger

No public methods found

## Package: com.nisovin.shopkeepers.tradelog.data

### Class: com.nisovin.shopkeepers.tradelog.data.PlayerRecord
Type: Class

Methods:
- String getName()
- int hashCode()
- boolean equals(Object)
- PlayerRecord of(Player)
- PlayerRecord of(UUID, String)
- String toString()
- UUID getUniqueId()

### Class: com.nisovin.shopkeepers.tradelog.data.ShopRecord
Type: Class

Methods:
- String getWorldName()
- int getX()
- int getY()
- String getName()
- int getZ()
- int hashCode()
- boolean equals(Object)
- ShopRecord of(Shopkeeper)
- String toString()
- PlayerRecord getOwner()
- String getTypeId()
- UUID getUniqueId()

### Class: com.nisovin.shopkeepers.tradelog.data.TradeRecord
Type: Class

Methods:
- UnmodifiableItemStack getResultItem()
- int getTradeCount()
- UnmodifiableItemStack getItem2()
- PlayerRecord getPlayer()
- UnmodifiableItemStack getItem1()
- int hashCode()
- Instant getTimestamp()
- boolean equals(Object)
- ShopRecord getShop()
- TradeRecord create(MergedTrades)
- TradeRecord create(ShopkeeperTradeEvent)
- String toString()

## Package: com.nisovin.shopkeepers.tradelog.sqlite

### Class: com.nisovin.shopkeepers.tradelog.sqlite.SQLiteTradeLogger
Type: Class
Extends: com.nisovin.shopkeepers.tradelog.base.AbstractFileTradeLogger

No public methods found

## Package: com.nisovin.shopkeepers.tradenotifications

### Class: com.nisovin.shopkeepers.tradenotifications.NotificationUserPreferences
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- boolean hasReceivedDisableTradeNotificationsHint(Player)
- boolean isNotifyOnTrades(Player)
- void setReceivedDisableTradeNotificationsHint(Player, boolean)
- void onEnable()
- void onDisable()
- void setNotifyOnTrades(Player, boolean)

### Class: com.nisovin.shopkeepers.tradenotifications.TradeNotifications
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- NotificationUserPreferences getUserPreferences()
- void onEnable()
- void onDisable()

## Package: com.nisovin.shopkeepers.trading.commandtrading

### Class: com.nisovin.shopkeepers.trading.commandtrading.CommandTrading
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onEnable()
- void onDisable()

### Class: com.nisovin.shopkeepers.trading.commandtrading.CommandTradingUtils
Type: Class

Methods:
- String getTradedCommand(ItemStack)
- String getTradedCommand(UnmodifiableItemStack)
- void setTradedCommand(ItemStack, String)

### Class: com.nisovin.shopkeepers.trading.commandtrading.TradedCommandsTradeEffect
Type: Class
Implements: com.nisovin.shopkeepers.api.trading.TradeEffect

Methods:
- void onTradeApplied(ShopkeeperTradeEvent)
- void onTradeAborted(ShopkeeperTradeEvent)

## Package: com.nisovin.shopkeepers.types

### Class: com.nisovin.shopkeepers.types.AbstractSelectableType
Type: Abstract Class
Extends: com.nisovin.shopkeepers.types.AbstractType
Implements: com.nisovin.shopkeepers.api.types.SelectableType

No public methods found

### Class: com.nisovin.shopkeepers.types.AbstractSelectableTypeRegistry
Type: Abstract Class
Extends: com.nisovin.shopkeepers.types.AbstractTypeRegistry
Implements: com.nisovin.shopkeepers.api.types.SelectableTypeRegistry

Methods:
- AbstractSelectableType getSelection(Player)
- SelectableType getSelection(Player)
- AbstractSelectableType getDefaultSelection(Player)
- SelectableType getDefaultSelection(Player)
- AbstractSelectableType selectPrevious(Player)
- SelectableType selectPrevious(Player)
- AbstractSelectableType selectNext(Player)
- SelectableType selectNext(Player)
- void clearSelection(Player)
- void clearAllSelections()
- void register(AbstractSelectableType)
- void register(AbstractType)
- void register(Type)

### Class: com.nisovin.shopkeepers.types.AbstractType
Type: Abstract Class
Implements: com.nisovin.shopkeepers.api.types.Type

Methods:
- Collection getAliases()
- String getPermission()
- int hashCode()
- String getIdentifier()
- boolean equals(Object)
- boolean isEnabled()
- boolean hasPermission(Player)
- String toString()
- boolean matches(String)

### Class: com.nisovin.shopkeepers.types.AbstractTypeRegistry
Type: Abstract Class
Implements: com.nisovin.shopkeepers.api.types.TypeRegistry

Methods:
- Collection getRegisteredTypes()
- void registerAll(Collection)
- AbstractType get(String)
- Type get(String)
- AbstractType match(String)
- Type match(String)
- void clearAll()
- void register(AbstractType)
- void register(Type)

## Package: com.nisovin.shopkeepers.ui

### Class: com.nisovin.shopkeepers.ui.ShopkeeperViewProvider
Type: Interface

Methods:
- AbstractShopkeeper getShopkeeper()

### Class: com.nisovin.shopkeepers.ui.AbstractShopkeeperViewProvider
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.lib.ViewProvider
Implements: com.nisovin.shopkeepers.ui.ShopkeeperViewProvider

Methods:
- AbstractShopkeeper getShopkeeper()
- ShopkeeperViewContext getContext()
- ViewContext getContext()

### Class: com.nisovin.shopkeepers.ui.SKDefaultUITypes
Type: Class
Implements: com.nisovin.shopkeepers.api.ui.DefaultUITypes

Methods:
- TradingUIType getTradingUIType()
- UIType getTradingUIType()
- ConfirmationUIType CONFIRMATION()
- VillagerEditorUIType getVillagerEditorUIType()
- VillagerEquipmentEditorUIType getVillagerEquipmentEditorUIType()
- TradingUIType TRADING()
- VillagerEditorUIType VILLAGER_EDITOR()
- EditorUIType getEditorUIType()
- UIType getEditorUIType()
- EditorUIType EDITOR()
- VillagerEquipmentEditorUIType VILLAGER_EQUIPMENT_EDITOR()
- List getAllUITypes()
- HiringUIType HIRING()
- HiringUIType getHiringUIType()
- UIType getHiringUIType()
- SKDefaultUITypes getInstance()
- EquipmentEditorUIType EQUIPMENT_EDITOR()
- ConfirmationUIType getConfirmationUIType()
- EquipmentEditorUIType getEquipmentEditorUIType()
- UIType getEquipmentEditorUIType()

### Class: com.nisovin.shopkeepers.ui.SKUIRegistry
Type: Class
Extends: com.nisovin.shopkeepers.types.AbstractTypeRegistry
Implements: com.nisovin.shopkeepers.api.ui.UIRegistry

Methods:
- void abortUISessionsDelayed(Shopkeeper)
- void abortUISessions()
- void abortUISessions(Shopkeeper)
- Collection getUISessions()
- Collection getUISessions(Shopkeeper)
- Collection getUISessions(Shopkeeper, UIType)
- Collection getUISessions(UIType)
- View getUISession(Player)
- UISession getUISession(Player)

### Class: com.nisovin.shopkeepers.ui.SKUISystem
Type: Class

Methods:
- void onEnable()
- void onDisable()

### Class: com.nisovin.shopkeepers.ui.ShopkeeperViewContext
Type: Class
Implements: com.nisovin.shopkeepers.ui.lib.ViewContext

Methods:
- AbstractShopkeeper getObject()
- Object getObject()
- String getName()
- boolean isValid()
- String getLogPrefix()
- Text getNoLongerValidMessage()

### Class: com.nisovin.shopkeepers.ui.UIHelpers
Type: Class

Methods:
- void swapCursorDelayed(InventoryView, int)
- void swapCursor(InventoryView, int)

## Package: com.nisovin.shopkeepers.ui.confirmations

### Class: com.nisovin.shopkeepers.ui.confirmations.ConfirmationUI
Type: Class

Methods:
- void requestConfirmation(Player, ConfirmationUIState)

### Class: com.nisovin.shopkeepers.ui.confirmations.ConfirmationUIState
Type: Class
Implements: com.nisovin.shopkeepers.ui.lib.UIState

Methods:
- List getConfirmationLore()
- String getTitle()
- Runnable getOnCancelled()
- Runnable getAction()

### Class: com.nisovin.shopkeepers.ui.confirmations.ConfirmationUIType
Type: Class
Extends: com.nisovin.shopkeepers.ui.lib.AbstractUIType

No public methods found

### Class: com.nisovin.shopkeepers.ui.confirmations.ConfirmationView
Type: Class
Extends: com.nisovin.shopkeepers.ui.lib.View

Methods:
- void updateInventory()
- boolean isAcceptedState(UIState)

### Class: com.nisovin.shopkeepers.ui.confirmations.ConfirmationViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.ui.lib.ViewProvider

Methods:
- boolean canAccess(Player, boolean)

## Package: com.nisovin.shopkeepers.ui.editor

### Class: com.nisovin.shopkeepers.ui.editor.TradingRecipesAdapter
Type: Interface

Methods:
- List getTradingRecipes()
- int updateTradingRecipes(Player, List)

### Class: com.nisovin.shopkeepers.ui.editor.AbstractEditorViewProvider
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.lib.ViewProvider

Methods:
- boolean canAccess(Player, boolean)

### Class: com.nisovin.shopkeepers.ui.editor.ActionButton
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.editor.Button

No public methods found

### Class: com.nisovin.shopkeepers.ui.editor.Button
Type: Abstract Class

Methods:
- ItemStack getIcon(EditorView)

### Class: com.nisovin.shopkeepers.ui.editor.DefaultTradingRecipesAdapter
Type: Abstract Class
Implements: com.nisovin.shopkeepers.ui.editor.TradingRecipesAdapter

Methods:
- List getTradingRecipes()
- int updateTradingRecipes(Player, List)

### Class: com.nisovin.shopkeepers.ui.editor.EditorLayout
Type: Abstract Class

Methods:
- void addButtons(Iterable)
- boolean isTradesPageBar(int)
- int getItem2Slot(int)
- int getResultItemSlot(int)
- void addButtonsOrIgnore(Iterable)
- boolean isButtonArea(int)
- void addButton(Button)
- int getTradeColumn(int)
- int getItem1Slot(int)
- boolean isItem1Row(int)
- boolean isItem2Row(int)
- int getInventorySize()
- boolean isTradeColumn(int)
- void addButtonOrIgnore(Button)
- void setupTradesPageBarButtons()
- boolean isResultRow(int)
- int getMaxTradesPages()
- boolean isTradesArea(int)
- int getButtonsEnd()

### Class: com.nisovin.shopkeepers.ui.editor.EditorUIState
Type: Class
Implements: com.nisovin.shopkeepers.ui.lib.UIState

Methods:
- int getCurrentPage()

### Class: com.nisovin.shopkeepers.ui.editor.EditorUIType
Type: Class
Extends: com.nisovin.shopkeepers.ui.lib.AbstractUIType

No public methods found

### Class: com.nisovin.shopkeepers.ui.editor.EditorView
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.lib.View

Methods:
- void restoreState(UIState)
- UIState captureState()
- void updateArea(String)
- int getCurrentPage()
- void updateInventory()
- void updateSlot(int)
- Inventory getInventory()
- boolean isAcceptedState(UIState)
- List getRecipes()

### Class: com.nisovin.shopkeepers.ui.editor.ShopkeeperActionButton
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.editor.ActionButton

No public methods found

### Class: com.nisovin.shopkeepers.ui.editor.ShopkeeperEditorLayout
Type: Class
Extends: com.nisovin.shopkeepers.ui.editor.EditorLayout

No public methods found

### Class: com.nisovin.shopkeepers.ui.editor.ShopkeeperEditorView
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.editor.EditorView

No public methods found

### Class: com.nisovin.shopkeepers.ui.editor.ShopkeeperEditorViewProvider
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.editor.AbstractEditorViewProvider
Implements: com.nisovin.shopkeepers.ui.ShopkeeperViewProvider

Methods:
- AbstractShopkeeper getShopkeeper()
- ShopkeeperViewContext getContext()
- ViewContext getContext()

## Package: com.nisovin.shopkeepers.ui.equipmentEditor

### Class: com.nisovin.shopkeepers.ui.equipmentEditor.EquipmentEditorUI
Type: Class

Methods:
- boolean request(AbstractShopkeeper, Player, EquipmentEditorUIState)

### Class: com.nisovin.shopkeepers.ui.equipmentEditor.EquipmentEditorUIState
Type: Class
Implements: com.nisovin.shopkeepers.ui.lib.UIState

Methods:
- List getSupportedSlots()
- Map getCurrentEquipment()
- BiConsumer getOnEquipmentChanged()

### Class: com.nisovin.shopkeepers.ui.equipmentEditor.EquipmentEditorUIType
Type: Class
Extends: com.nisovin.shopkeepers.ui.lib.AbstractUIType

No public methods found

### Class: com.nisovin.shopkeepers.ui.equipmentEditor.EquipmentEditorView
Type: Class
Extends: com.nisovin.shopkeepers.ui.lib.View

Methods:
- void updateInventory()
- boolean isAcceptedState(UIState)

### Class: com.nisovin.shopkeepers.ui.equipmentEditor.ShopkeeperEquipmentEditorViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.ui.AbstractShopkeeperViewProvider

Methods:
- boolean canAccess(Player, boolean)

## Package: com.nisovin.shopkeepers.ui.hiring

### Class: com.nisovin.shopkeepers.ui.hiring.HiringUIType
Type: Class
Extends: com.nisovin.shopkeepers.ui.lib.AbstractUIType

No public methods found

### Class: com.nisovin.shopkeepers.ui.hiring.HiringView
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.lib.View

No public methods found

### Class: com.nisovin.shopkeepers.ui.hiring.HiringViewProvider
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.AbstractShopkeeperViewProvider

Methods:
- boolean canAccess(Player, boolean)

## Package: com.nisovin.shopkeepers.ui.lib

### Class: com.nisovin.shopkeepers.ui.lib.UIState
Type: Interface

No public methods found

### Class: com.nisovin.shopkeepers.ui.lib.ViewContext
Type: Interface

Methods:
- Object getObject()
- String getName()
- boolean isValid()
- String getLogPrefix()
- Text getNoLongerValidMessage()

### Class: com.nisovin.shopkeepers.ui.lib.AbstractUIType
Type: Abstract Class
Extends: com.nisovin.shopkeepers.types.AbstractType
Implements: com.nisovin.shopkeepers.api.ui.UIType

No public methods found

### Class: com.nisovin.shopkeepers.ui.lib.EmptyUIState
Type: Class
Implements: com.nisovin.shopkeepers.ui.lib.UIState

No public methods found

### Class: com.nisovin.shopkeepers.ui.lib.SimpleViewContext
Type: Class
Implements: com.nisovin.shopkeepers.ui.lib.ViewContext

Methods:
- Object getObject()
- String getName()
- boolean isValid()
- Text getNoLongerValidMessage()

### Class: com.nisovin.shopkeepers.ui.lib.UISessionManager
Type: Class

Methods:
- void abortUISessionsForContextDelayed(Object)
- void abortUISessions()
- Collection getUISessions()
- Collection getUISessions(UIType)
- void abortUISessionsForContext(Object)
- void onEnable()
- void initialize(Plugin, UISessionManager$SessionHandler)
- UISessionManager getInstance()
- Collection getUISessionsForContext(Object)
- Collection getUISessionsForContext(Object, UIType)
- void onDisable()
- View getUISession(Player)
- boolean requestUI(ViewProvider, Player)
- boolean requestUI(ViewProvider, Player, UIState)
- boolean requestUI(ViewProvider, Player, boolean)
- boolean requestUI(ViewProvider, Player, boolean, UIState)

### Class: com.nisovin.shopkeepers.ui.lib.View
Type: Abstract Class
Implements: com.nisovin.shopkeepers.api.ui.UISession

Methods:
- void syncInventory()
- void deactivateUI()
- void closeDelayedAndRunTask(Runnable)
- Player getPlayer()
- void restoreState(UIState)
- void abortDelayed()
- void validateState(UIState)
- void abortDelayedAndRunTask(Runnable)
- AbstractShopkeeper getShopkeeperNonNull()
- ViewProvider getProvider()
- boolean isAcceptedState(UIState)
- boolean hasInventoryView()
- void close()
- InventoryView getInventoryView()
- void updateAreaInAllViews(String)
- void updateSlotInAllViews(int)
- AbstractShopkeeper getShopkeeper()
- Shopkeeper getShopkeeper()
- UIState captureState()
- void updateArea(String)
- boolean isValid()
- void activateUI()
- AbstractUIType getUIType()
- UIType getUIType()
- boolean isOpen()
- boolean isOpenFor(Player)
- void abort()
- void closeDelayed()
- boolean abortIfContextInvalid()
- boolean isHandling(InventoryView)
- boolean isUIActive()
- void updateInventory()
- void updateSlot(int)
- ViewContext getContext()
- boolean open()
- void updateAllViews()

### Class: com.nisovin.shopkeepers.ui.lib.ViewProvider
Type: Abstract Class

Methods:
- boolean canAccess(Player, boolean)
- boolean canOpen(Player, boolean)
- ViewContext getContext()
- AbstractUIType getUIType()

## Package: com.nisovin.shopkeepers.ui.trading

### Class: com.nisovin.shopkeepers.ui.trading.Trade
Type: Class

Methods:
- TradingContext getTradingContext()
- KeyValueStore getMetadata()
- InventoryClickEvent getInventoryClickEvent()
- Shopkeeper getShopkeeper()
- Player getTradingPlayer()
- boolean isTradeEventCalled()
- TradingRecipe getTradingRecipe()
- ItemStack getOfferedItem2()
- ItemStack getOfferedItem1()
- ShopkeeperTradeEvent getTradeEvent()
- int getTradeNumber()
- MerchantInventory getMerchantInventory()
- PlayerInventory getPlayerInventory()
- ShopkeeperTradeEvent callTradeEvent()
- boolean isItemOrderSwapped()

### Class: com.nisovin.shopkeepers.ui.trading.TradingContext
Type: Class

Methods:
- int getTradeCount()
- KeyValueStore getMetadata()
- InventoryClickEvent getInventoryClickEvent()
- Shopkeeper getShopkeeper()
- Trade getCurrentTrade()
- Player getTradingPlayer()
- MerchantInventory getMerchantInventory()
- PlayerInventory getPlayerInventory()

### Class: com.nisovin.shopkeepers.ui.trading.TradingListener
Type: Abstract Class

Methods:
- void onTradeSelect(UISession, TradeSelectEvent)
- void onTradeAborted(TradingContext, boolean)
- void onTradeCompleted(Trade, boolean)
- void onInventoryClick(UISession, InventoryClickEvent)

### Class: com.nisovin.shopkeepers.ui.trading.TradingUIType
Type: Class
Extends: com.nisovin.shopkeepers.ui.lib.AbstractUIType

No public methods found

### Class: com.nisovin.shopkeepers.ui.trading.TradingView
Type: Class
Extends: com.nisovin.shopkeepers.ui.lib.View

Methods:
- void updateInventory()

### Class: com.nisovin.shopkeepers.ui.trading.TradingViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.ui.AbstractShopkeeperViewProvider

Methods:
- boolean canAccess(Player, boolean)
- boolean canOpen(Player, boolean)
- void addListener(TradingListener)

## Package: com.nisovin.shopkeepers.ui.villager

### Class: com.nisovin.shopkeepers.ui.villager.AbstractVillagerViewProvider
Type: Abstract Class
Extends: com.nisovin.shopkeepers.ui.lib.ViewProvider

Methods:
- AbstractVillager getVillager()
- VillagerViewContext getContext()
- ViewContext getContext()

### Class: com.nisovin.shopkeepers.ui.villager.VillagerViewContext
Type: Class
Implements: com.nisovin.shopkeepers.ui.lib.ViewContext

Methods:
- AbstractVillager getObject()
- Object getObject()
- String getName()
- boolean isValid()
- Text getNoLongerValidMessage()

## Package: com.nisovin.shopkeepers.ui.villager.editor

### Class: com.nisovin.shopkeepers.ui.villager.editor.VillagerEditorLayout
Type: Class
Extends: com.nisovin.shopkeepers.ui.editor.EditorLayout

No public methods found

### Class: com.nisovin.shopkeepers.ui.villager.editor.VillagerEditorUIType
Type: Class
Extends: com.nisovin.shopkeepers.ui.lib.AbstractUIType

No public methods found

### Class: com.nisovin.shopkeepers.ui.villager.editor.VillagerEditorView
Type: Class
Extends: com.nisovin.shopkeepers.ui.editor.EditorView

Methods:
- AbstractVillager getVillager()

### Class: com.nisovin.shopkeepers.ui.villager.editor.VillagerEditorViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.ui.editor.AbstractEditorViewProvider

Methods:
- AbstractVillager getVillager()
- boolean canAccess(Player, boolean)
- VillagerViewContext getContext()
- ViewContext getContext()

## Package: com.nisovin.shopkeepers.ui.villager.equipmentEditor

### Class: com.nisovin.shopkeepers.ui.villager.equipmentEditor.VillagerEquipmentEditorUI
Type: Class

Methods:
- boolean request(AbstractVillager, Player)

### Class: com.nisovin.shopkeepers.ui.villager.equipmentEditor.VillagerEquipmentEditorUIState
Type: Class
Extends: com.nisovin.shopkeepers.ui.equipmentEditor.EquipmentEditorUIState

No public methods found

### Class: com.nisovin.shopkeepers.ui.villager.equipmentEditor.VillagerEquipmentEditorUIType
Type: Class
Extends: com.nisovin.shopkeepers.ui.lib.AbstractUIType

No public methods found

### Class: com.nisovin.shopkeepers.ui.villager.equipmentEditor.VillagerEquipmentEditorView
Type: Class
Extends: com.nisovin.shopkeepers.ui.equipmentEditor.EquipmentEditorView

No public methods found

### Class: com.nisovin.shopkeepers.ui.villager.equipmentEditor.VillagerEquipmentEditorViewProvider
Type: Class
Extends: com.nisovin.shopkeepers.ui.villager.AbstractVillagerViewProvider

Methods:
- boolean canAccess(Player, boolean)

## Package: com.nisovin.shopkeepers.user

### Class: com.nisovin.shopkeepers.user.SKUser
Type: Class
Implements: com.nisovin.shopkeepers.api.user.User

Methods:
- OfflinePlayer getOfflinePlayer()
- Player getPlayer()
- String getName()
- String getDisplayName()
- int hashCode()
- boolean equals(Object)
- User of(UUID, String)
- User of(Player)
- String toString()
- boolean isOnline()
- String getLastKnownName()
- UUID getUniqueId()

## Package: com.nisovin.shopkeepers.util.annotations

### Class: com.nisovin.shopkeepers.util.annotations.ReadOnly
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.nisovin.shopkeepers.util.annotations.ReadWrite
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

## Package: com.nisovin.shopkeepers.util.bukkit

### Class: com.nisovin.shopkeepers.util.bukkit.BlockFaceUtils
Type: Class

Methods:
- float getYaw(BlockFace)
- BlockFace toWallSignFacing(Vector)
- List getBlockSides()
- boolean isBlockSide(BlockFace)
- BlockFace getAxisAlignedBlockFace(double, double, double)
- boolean isSignPostFacing(BlockFace)
- boolean isWallSignFacing(BlockFace)
- BlockFaceUtils$BlockFaceDirections getWallSignFacings()
- BlockFaceUtils$BlockFaceDirections getSignPostFacings()

### Class: com.nisovin.shopkeepers.util.bukkit.BlockLocation
Type: Class

Methods:
- Block getBlock()
- Block getBlock(World)
- World getWorld()
- int toBlock(double)
- double getBlockCenterDistanceSquared(Location)
- boolean isEmpty()
- boolean isSameWorld(Location)
- boolean matches(String, int, int, int)
- boolean matches(Block)
- boolean hasWorldName()
- ChunkCoords getChunkCoords()
- String getWorldName()
- BlockLocation immutable()
- int getX()
- int getY()
- int getZ()
- int hashCode()
- boolean equals(Object)
- BlockLocation of(Block)
- BlockLocation of(Location)
- MutableBlockLocation mutableCopy()
- double getDistanceSquared(Location)
- double getDistanceSquared(Vector, Location)
- String toString()
- Block getBlockAtOffset(World, int, int, int)

### Class: com.nisovin.shopkeepers.util.bukkit.ColorUtils
Type: Class

Methods:
- int HSBtoRGB(float, float, float)

### Class: com.nisovin.shopkeepers.util.bukkit.ConfigUtils
Type: Class

Methods:
- String toFlatConfigYaml(Map)
- void disablePathSeparator(Configuration)
- Map getValues(ConfigurationSection)
- void clearConfigSection(ConfigurationSection)
- void loadConfigSafely(FileConfiguration, String) throws InvalidConfigurationException
- YamlConfiguration newYamlConfig()
- String toConfigYaml(String, Object)
- void convertSubSectionsToMaps(ConfigurationSection)
- Map serializeDeeply(ConfigurationSerializable)
- void serializeDeeply(Map)
- Map serialize(ConfigurationSerializable)
- Object fromConfigYaml(String, String)
- Map convertSectionsToMaps(ConfigurationSection)
- void convertSectionsToMaps(Map)
- String toConfigYamlWithoutTrailingNewline(String, Object)
- void setAll(ConfigurationSection, Map)
- ConfigurationSerializable deserialize(Map)

### Class: com.nisovin.shopkeepers.util.bukkit.DataUtils
Type: Class

Methods:
- Material loadMaterial(DataContainer, String)
- ItemStack processNonNullLoadedItemStack(ItemStack)
- ItemStack processLoadedItemStack(ItemStack)

### Class: com.nisovin.shopkeepers.util.bukkit.EntityUtils
Type: Class

Methods:
- List getNearbyPlayers(Location, double)
- List getNearbyPlayers(Location, double, Predicate)
- boolean isRemovedOnPeacefulDifficulty(EntityType)
- boolean burnsInSunlight(EntityType)
- List getNearbyChunkEntities(Chunk, int, boolean, Set)
- List getNearbyChunkEntities(Chunk, int, boolean, Predicate)
- List getNearbyChunkEntities(World, int, int, int, boolean, Predicate)
- Player getNearestPlayer(Location, double)
- Player getNearestPlayer(Location, double, Predicate)
- void printEntityCounts(Chunk)
- EntityType parseEntityType(String)
- Set getCollidableFluids(EntityType)
- List getNearbyEntities(Location, double, boolean, Set)
- List getNearbyEntities(Location, double, boolean, Predicate)
- Predicate filterByType(Set)
- Entity getTargetedEntity(Player)
- Entity getTargetedEntity(Player, Predicate)
- Entity resolveComplexEntity(Entity)
- Stream getOnlinePlayersStream()

### Class: com.nisovin.shopkeepers.util.bukkit.EquipmentUtils
Type: Class

Methods:
- boolean supportsSaddle(EntityType)
- List getSupportedEquipmentSlots(EntityType)
- boolean supportsEquipment(EntityType)

### Class: com.nisovin.shopkeepers.util.bukkit.EventUtils
Type: Class

Methods:
- void printRegisteredListeners(Event)
- EventExecutor eventExecutor(Class, Consumer)
- void enforceExecuteFirst(Class, EventPriority, Listener)
- void enforceExecuteFirst(Class, EventPriority, Plugin)
- void enforceExecuteFirst(Class, EventPriority, Predicate)
- void enforceExecuteFirst(HandlerList, Class, EventPriority, Predicate, boolean)
- boolean setCancelled(Event, boolean)
- HandlerList getHandlerList(Class)
- Class getEventRegistrationClass(Class)

### Class: com.nisovin.shopkeepers.util.bukkit.LocationUtils
Type: Class

Methods:
- World getWorld(Location)
- double getDistanceSquared(Location, Location)
- Location getBlockCenterLocation(Block)
- double getSafeDistanceSquared(Location, Location)

### Class: com.nisovin.shopkeepers.util.bukkit.MerchantUtils
Type: Class

Methods:
- List createMerchantRecipes(List)
- TradingRecipe createTradingRecipe(MerchantRecipe)
- MerchantRecipe createMerchantRecipe(TradingRecipe)
- MerchantRecipe createMerchantRecipe(TradingRecipeDraft)
- MerchantRecipe createMerchantRecipe(UnmodifiableItemStack, UnmodifiableItemStack, UnmodifiableItemStack)
- TradingRecipe getSelectedTradingRecipe(MerchantInventory)
- TradingRecipe getActiveTradingRecipe(MerchantInventory)
- List createTradingRecipeDrafts(List)
- TradingRecipeDraft createTradingRecipeDraft(MerchantRecipe)

### Class: com.nisovin.shopkeepers.util.bukkit.MinecraftEnumUtils
Type: Class

Methods:
- Enum parseEnum(Class, String)
- String normalizeEnumName(String)

### Class: com.nisovin.shopkeepers.util.bukkit.MutableBlockLocation
Type: Class
Extends: com.nisovin.shopkeepers.util.bukkit.BlockLocation

Methods:
- void setWorldName(String)
- BlockLocation immutable()
- void setY(int)
- void setX(int)
- void set(Block)
- void set(BlockLocation)
- void set(Location)
- void set(String, int, int, int)
- MutableBlockLocation of(Block)
- MutableBlockLocation of(Location)
- void setZ(int)

### Class: com.nisovin.shopkeepers.util.bukkit.MutableChunkCoords
Type: Class
Extends: com.nisovin.shopkeepers.api.util.ChunkCoords

Methods:
- void setWorldName(String)
- void setChunkX(int)
- void unsetWorldName()
- void setChunkZ(int)
- void set(Chunk)
- void set(Block)
- void set(Location)
- void set(ChunkCoords)
- void set(String, int, int)
- boolean hasWorldName()

### Class: com.nisovin.shopkeepers.util.bukkit.NamespacedKeyUtils
Type: Class

Methods:
- String normalizeMinecraftNamespacedKey(String)
- String normalizeNamespacedKey(String)
- NamespacedKey create(String, String)
- NamespacedKey parse(String)

### Class: com.nisovin.shopkeepers.util.bukkit.PermissionUtils
Type: Class

Methods:
- boolean registerPermission(String, Function)
- boolean registerPermission(String)
- Object runWithoutPermissionCheckLogging(Supplier)
- boolean hasPermission(Permissible, String)

### Class: com.nisovin.shopkeepers.util.bukkit.PluginUtils
Type: Class

Methods:
- Path relativize(Plugin, Path)

### Class: com.nisovin.shopkeepers.util.bukkit.RegistryUtils
Type: Class

Methods:
- List getValues(Registry)
- Keyed cycleKeyed(Registry, Keyed, boolean)
- Keyed cycleKeyed(Registry, Keyed, boolean, Predicate)
- List getKeys(Registry)

### Class: com.nisovin.shopkeepers.util.bukkit.SchedulerUtils
Type: Class

Methods:
- boolean isMainThread()
- int awaitAsyncTasksCompletion(Plugin, int, Logger)
- BukkitTask runAsyncTaskLaterOrOmit(Plugin, Runnable, long)
- int getActiveAsyncTasks(Plugin)
- BukkitTask runAsyncTaskOrOmit(Plugin, Runnable)
- BukkitTask runTaskLaterOrOmit(Plugin, Runnable, long)
- BukkitTask runTaskOrOmit(Plugin, Runnable)
- boolean runOnMainThreadOrOmit(Plugin, Runnable)

### Class: com.nisovin.shopkeepers.util.bukkit.ServerUtils
Type: Class

Methods:
- String getMappingsVersion()
- boolean isPaper()
- String getCraftBukkitPackage()

### Class: com.nisovin.shopkeepers.util.bukkit.SignUtils
Type: Class

Methods:
- void setLines(SignSide, String[])
- void setBothSidesText(Sign, String[])
- void setBothSidesGlowingText(Sign, boolean)

### Class: com.nisovin.shopkeepers.util.bukkit.SingletonTask
Type: Abstract Class

Methods:
- void awaitExecutions()
- void runImmediately()
- void run()
- long getPreparationDuration()
- boolean isExecutionPending()
- long getExecutionDuration()
- long getExecutionDelay()
- boolean isPostProcessing()
- long getTotalDuration()
- long getLockAcquireDuration()
- boolean isRunning()
- boolean isAsyncExecution()
- String getExecutionTimingString()
- void shutdown()

### Class: com.nisovin.shopkeepers.util.bukkit.SoundEffect
Type: Class

Methods:
- void play(Location)
- void play(Player)
- void play(Player, Location)
- String getSoundName()
- SoundCategory getCategory()
- float getEffectivePitch()
- Object serialize()
- Float getVolume()
- Float getPitch()
- SoundEffect withPitch(Float)
- SoundEffect withVolume(Float)
- int hashCode()
- SoundEffect withCategory(SoundCategory)
- boolean equals(Object)
- String toString()
- boolean isDisabled()
- SoundCategory getEffectiveCategory()
- float getEffectiveVolume()
- Sound getSound()

### Class: com.nisovin.shopkeepers.util.bukkit.TeleportHelper
Type: Class

Methods:
- Location findSafeDestination(Location, Entity, ToIntFunction)

### Class: com.nisovin.shopkeepers.util.bukkit.TextUtils
Type: Class

Methods:
- boolean containsColorChar(String)
- List colorizeUnknown(List)
- String fromBukkitHexCode(String)
- Text getPlayerText(Player)
- Text getPlayerText(User)
- Text getPlayerText(String, UUID)
- Text getItemNameForDisplay(ItemStack)
- boolean isHexCode(String)
- Text getMaterialNameForDisplay(Material)
- Text getMaterialNameForDisplay(ItemStack)
- String colorize(String)
- List colorize(List)
- String stripColor(String)
- Text getItemText(UnmodifiableItemStack)
- Text getItemText(ItemStack)
- String getPlayerNameOrUUID(String, UUID)
- String getPlayerString(Player)
- String getPlayerString(User)
- String getPlayerString(String, UUID)
- String formatPrecise(double)
- String convertHexColorsToBukkit(String)
- String getPlayerNameOrUnknown(String)
- String decolorize(String)
- List decolorize(List)
- String format(double)
- void sendMessage(CommandSender, String)
- void sendMessage(CommandSender, String, Map)
- void sendMessage(CommandSender, String, Object[])
- void sendMessage(CommandSender, Text)
- void sendMessage(CommandSender, Text, MessageArguments)
- void sendMessage(CommandSender, Text, Map)
- void sendMessage(CommandSender, Text, Object[])
- String toBukkitHexCode(String, char)
- String getLocationString(Location)
- String getLocationString(Block)
- String getLocationString(BlockLocation)
- String getLocationString(BlockLocation, double)
- String getLocationString(String, int, int, int)
- String getLocationString(String, int, int, int, double)
- String getLocationString(String, double, double, double)
- boolean isBukkitHexCode(String)
- boolean isAnyColorChar(char)
- String getChunkString(ChunkCoords)
- String getChunkString(Chunk)
- String getChunkString(String, int, int)
- TextBuilder getItemHover(ItemStack)
- String translateColorCodesToAlternative(char, String)
- List decolorizeUnknown(List)

### Class: com.nisovin.shopkeepers.util.bukkit.Ticks
Type: Class

Methods:
- long fromSeconds(double)
- long toNanos(long)
- long fromNanos(long)
- long fromMillis(long)
- long toMillis(long)
- double toSeconds(long)

### Class: com.nisovin.shopkeepers.util.bukkit.WorldUtils
Type: Class

Methods:
- boolean isBlockInsideWorldBorder(Block)
- boolean isBlockInsideWorldBorder(World, int, int)
- double getCollisionDistanceToGround(Location, double, Set)
- boolean isBlockInsideWorldHeightBounds(Block)
- boolean isBlockInsideWorldHeightBounds(World, int)

## Package: com.nisovin.shopkeepers.util.csv

### Class: com.nisovin.shopkeepers.util.csv.CsvFormatter
Type: Class

Methods:
- String formatRecord(Object[])
- String formatRecord(Iterable)
- CsvFormatter warnOnNewlines()
- CsvFormatter warnOnNewlines(boolean)
- CsvFormatter quote(String)
- CsvFormatter fieldSeparator(String)
- String formatFields(Object[])
- String formatFields(Iterable)
- CsvFormatter escapedQuote(String)
- String escapeField(String)
- CsvFormatter nullField(String)
- CsvFormatter escapeNewlines()
- CsvFormatter escapeNewlines(boolean)
- CsvFormatter quoteAllFields()
- CsvFormatter quoteAllFields(boolean)
- CsvFormatter recordSeparator(String)

## Package: com.nisovin.shopkeepers.util.data.container

### Class: com.nisovin.shopkeepers.util.data.container.DataContainer
Type: Interface

Methods:
- Object getOrDefault(String, Object)
- DataContainer createContainer(String)
- boolean isDataContainer(Object)
- boolean isContainer(String)
- double getDouble(String)
- float getFloat(String)
- boolean getBooleanOrDefault(String, boolean)
- DataValue getDataValue(String)
- boolean isList(String)
- void remove(String)
- boolean isBoolean(String)
- List getList(String)
- boolean isNumber(String)
- Object get(String)
- Object get(DataLoader) throws InvalidDataException
- DataContainer of(Object)
- boolean isString(String)
- DataContainer create()
- boolean getBoolean(String)
- void setAll(Map)
- List getListOrDefault(String, List)
- double getDoubleOrDefault(String, double)
- Object getOfType(String, Class)
- Map getValuesCopy()
- void set(String, Object)
- void set(DataSaver, Object)
- long getLongOrDefault(String, long)
- Map getValues()
- DataContainer getContainer(String)
- Object getOrNullIfMissing(DataLoader) throws InvalidDataException
- Object getOfTypeOrDefault(String, Class, Object)
- boolean isOfType(String, Class)
- boolean isEmpty()
- void clear()
- int getIntOrDefault(String, int)
- Set getKeys()
- String getString(String)
- Object getOrNull(DataLoader)
- DataContainer getDataValueContainer(String)
- long getLong(String)
- Object serialize()
- int getInt(String)
- boolean contains(String)
- DataContainer asView()
- int size()
- DataContainer ofNonNull(Object)
- float getFloatOrDefault(String, float)
- String getStringOrDefault(String, String)

### Class: com.nisovin.shopkeepers.util.data.container.AbstractDataContainer
Type: Abstract Class
Implements: com.nisovin.shopkeepers.util.data.container.DataContainer

Methods:
- void set(String, Object)
- void set(DataSaver, Object)
- long getLongOrDefault(String, long)
- Object getOrNullIfMissing(DataLoader) throws InvalidDataException
- Object getOfTypeOrDefault(String, Class, Object)
- boolean isOfType(String, Class)
- int getIntOrDefault(String, int)
- Object getOrNull(DataLoader)
- boolean getBooleanOrDefault(String, boolean)
- DataValue getDataValue(String)
- DataContainer asView()
- Object get(DataLoader) throws InvalidDataException
- float getFloatOrDefault(String, float)
- void setAll(Map)
- double getDoubleOrDefault(String, double)
- String getStringOrDefault(String, String)

### Class: com.nisovin.shopkeepers.util.data.container.ConfigBasedDataContainer
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.AbstractDataContainer

Methods:
- Object serialize()
- Map getValuesCopy()
- Object getOrDefault(String, Object)
- Map getValues()
- int size()
- int hashCode()
- boolean equals(Object)
- void clear()
- String toString()
- Set getKeys()
- void remove(String)
- ConfigurationSection getConfig()

### Class: com.nisovin.shopkeepers.util.data.container.DataValueContainer
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.AbstractDataContainer

Methods:
- Map getValuesCopy()
- void set(String, Object)
- Object getOrDefault(String, Object)
- Map getValues()
- void clear()
- Set getKeys()
- void remove(String)
- Object serialize()
- int size()
- int hashCode()
- boolean equals(Object)
- DataContainer of(DataValue)
- String toString()
- DataContainer ofNonNull(DataValue)

### Class: com.nisovin.shopkeepers.util.data.container.DelegateDataContainer
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.AbstractDataContainer

Methods:
- Object serialize()
- Map getValuesCopy()
- void set(String, Object)
- Object getOrDefault(String, Object)
- Map getValues()
- int size()
- int hashCode()
- boolean equals(Object)
- void clear()
- String toString()
- Set getKeys()
- void remove(String)

### Class: com.nisovin.shopkeepers.util.data.container.MapBasedDataContainer
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.AbstractDataContainer

Methods:
- Object serialize()
- Map getValuesCopy()
- Object getOrDefault(String, Object)
- Map getValues()
- int size()
- int hashCode()
- boolean equals(Object)
- boolean isEmpty()
- void clear()
- String toString()
- Set getKeys()
- void internalSet(String, Object)
- void remove(String)

### Class: com.nisovin.shopkeepers.util.data.container.UnmodifiableDataContainer
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.DelegateDataContainer

Methods:
- void set(String, Object)
- DataContainer asView()
- void clear()

## Package: com.nisovin.shopkeepers.util.data.container.value

### Class: com.nisovin.shopkeepers.util.data.container.value.DataValue
Type: Interface

Methods:
- Object getOrDefault(Object)
- DataContainer createContainer()
- boolean isContainer()
- double getDouble()
- boolean isPresent()
- float getFloat()
- boolean getBooleanOrDefault(boolean)
- boolean isList()
- boolean isBoolean()
- List getList()
- boolean isNumber()
- Object get()
- DataValue of(Object)
- boolean isString()
- DataValue create()
- boolean getBoolean()
- List getListOrDefault(List)
- double getDoubleOrDefault(double)
- Object getOfType(Class)
- void set(Object)
- long getLongOrDefault(long)
- DataContainer getContainer()
- Object getOfTypeOrDefault(Class, Object)
- boolean isOfType(Class)
- void clear()
- int getIntOrDefault(int)
- String getString()
- long getLong()
- int getInt()
- DataValue asView()
- float getFloatOrDefault(float)
- String getStringOrDefault(String)

### Class: com.nisovin.shopkeepers.util.data.container.value.AbstractDataValue
Type: Abstract Class
Implements: com.nisovin.shopkeepers.util.data.container.value.DataValue

Methods:
- void set(Object)
- long getLongOrDefault(long)
- DataValue asView()
- int hashCode()
- Object getOfTypeOrDefault(Class, Object)
- boolean equals(Object)
- boolean isOfType(Class)
- int getIntOrDefault(int)
- String toString()
- float getFloatOrDefault(float)
- boolean getBooleanOrDefault(boolean)
- double getDoubleOrDefault(double)
- String getStringOrDefault(String)

### Class: com.nisovin.shopkeepers.util.data.container.value.DataContainerValue
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.value.AbstractDataValue

Methods:
- Object getOrDefault(Object)
- void clear()
- String toString()

### Class: com.nisovin.shopkeepers.util.data.container.value.DelegateDataValue
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.value.AbstractDataValue

Methods:
- void set(Object)
- Object getOrDefault(Object)
- void clear()
- String toString()

### Class: com.nisovin.shopkeepers.util.data.container.value.SimpleDataValue
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.value.AbstractDataValue

Methods:
- Object getOrDefault(Object)
- void clear()

### Class: com.nisovin.shopkeepers.util.data.container.value.UnmodifiableDataValue
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.value.DelegateDataValue

Methods:
- void set(Object)
- DataValue asView()
- void clear()

## Package: com.nisovin.shopkeepers.util.data.matcher

### Class: com.nisovin.shopkeepers.util.data.matcher.DataMatcher
Type: Class

Methods:
- DataMatcher$Result match(Object, Object)
- boolean matches(Object, Object)

## Package: com.nisovin.shopkeepers.util.data.path

### Class: com.nisovin.shopkeepers.util.data.path.DataPath
Type: Class

Methods:
- Object resolve(Object)
- DataPath getSubPath(int, int)
- DataPath getChildPath()
- int hashCode()
- String getFirstSegment()
- boolean equals(Object)
- boolean isEmpty()
- int getLength()
- String toString()
- DataPath getParentPath()
- DataPath append(String)
- DataPath append(DataPath)
- String getLastSegment()
- List getSegments()

## Package: com.nisovin.shopkeepers.util.data.persistence

### Class: com.nisovin.shopkeepers.util.data.persistence.DataStore
Type: Interface
Implements: com.nisovin.shopkeepers.util.data.container.DataContainer

Methods:
- void load(File) throws IOException, InvalidDataFormatException
- void load(Path) throws IOException, InvalidDataFormatException
- void load(Reader) throws IOException, InvalidDataFormatException
- String saveToString()
- void save(File) throws IOException
- void save(Path) throws IOException
- void save(Writer) throws IOException
- void loadFromString(String) throws InvalidDataFormatException

### Class: com.nisovin.shopkeepers.util.data.persistence.DataStoreBase
Type: Interface
Implements: com.nisovin.shopkeepers.util.data.persistence.DataStore

Methods:
- void load(File) throws IOException, InvalidDataFormatException
- void load(Path) throws IOException, InvalidDataFormatException
- void load(Reader) throws IOException, InvalidDataFormatException
- void save(File) throws IOException
- void save(Path) throws IOException
- void save(Writer) throws IOException

### Class: com.nisovin.shopkeepers.util.data.persistence.InvalidDataFormatException
Type: Class
Extends: java.lang.Exception

No public methods found

## Package: com.nisovin.shopkeepers.util.data.persistence.bukkit

### Class: com.nisovin.shopkeepers.util.data.persistence.bukkit.BukkitConfigDataStore
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.ConfigBasedDataContainer
Implements: com.nisovin.shopkeepers.util.data.persistence.DataStoreBase

Methods:
- String saveToString()
- BukkitConfigDataStore of(FileConfiguration)
- void loadFromString(String) throws InvalidDataFormatException
- BukkitConfigDataStore ofNewYamlConfig()
- FileConfiguration getConfig()
- ConfigurationSection getConfig()

## Package: com.nisovin.shopkeepers.util.data.property

### Class: com.nisovin.shopkeepers.util.data.property.Property
Type: Interface
Implements: com.nisovin.shopkeepers.util.data.serialization.DataAccessor

Methods:
- boolean hasDefaultValue()
- DataLoader getUnvalidatedLoader()
- String getName()
- Object load(DataContainer) throws InvalidDataException
- DataLoader getLoader()
- boolean isNullable()
- void save(DataContainer, Object)
- void validateValue(Object)
- String toString(Object)
- DataSaver getUnvalidatedSaver()
- Object loadOrDefault(DataContainer) throws InvalidDataException
- DataSaver getSaver()
- Object getDefaultValue()

### Class: com.nisovin.shopkeepers.util.data.property.StringConverter
Type: Interface

Methods:
- String toString(Object)

### Class: com.nisovin.shopkeepers.util.data.property.BasicProperty
Type: Class
Implements: com.nisovin.shopkeepers.util.data.property.Property

Methods:
- boolean hasDefaultValue()
- BasicProperty defaultValueSupplier(Supplier)
- String getName()
- BasicProperty nullable()
- DataLoader getLoader()
- BasicProperty defaultValue(Object)
- void save(DataContainer, Object)
- BasicProperty validator(PropertyValidator)
- void validateValue(Object)
- BasicProperty useDefaultIfMissing()
- Object loadOrDefault(DataContainer) throws InvalidDataException
- Object getDefaultValue()
- DataLoader getUnvalidatedLoader()
- Object load(DataContainer) throws MissingDataException, InvalidDataException
- BasicProperty omitIfDefault()
- BasicProperty build()
- BasicProperty dataKeyAccessor(String, DataSerializer)
- boolean isNullable()
- BasicProperty name(String)
- String toString(Object)
- DataSaver getUnvalidatedSaver()
- BasicProperty dataAccessor(DataLoader)
- DataSaver getSaver()
- BasicProperty stringConverter(StringConverter)

### Class: com.nisovin.shopkeepers.util.data.property.DataKeyAccessor
Type: Class
Implements: com.nisovin.shopkeepers.util.data.serialization.DataAccessor

Methods:
- Object load(DataContainer) throws InvalidDataException
- DataSerializer getSerializer()
- void save(DataContainer, Object)
- String getDataKey()
- DataKeyAccessor emptyDataPredicate(Predicate)

### Class: com.nisovin.shopkeepers.util.data.property.EmptyDataPredicates
Type: Class

No public methods found

## Package: com.nisovin.shopkeepers.util.data.property.validation

### Class: com.nisovin.shopkeepers.util.data.property.validation.PropertyValidator
Type: Interface

Methods:
- void validate(Object)

### Class: com.nisovin.shopkeepers.util.data.property.validation.ChainedPropertyValidator
Type: Class
Implements: com.nisovin.shopkeepers.util.data.property.validation.PropertyValidator

Methods:
- void validate(Object)

## Package: com.nisovin.shopkeepers.util.data.property.validation.bukkit

### Class: com.nisovin.shopkeepers.util.data.property.validation.bukkit.ItemStackValidators
Type: Class

No public methods found

### Class: com.nisovin.shopkeepers.util.data.property.validation.bukkit.MaterialValidators
Type: Class

No public methods found

## Package: com.nisovin.shopkeepers.util.data.property.validation.java

### Class: com.nisovin.shopkeepers.util.data.property.validation.java.IntegerValidators
Type: Class

Methods:
- PropertyValidator bounded(int, int)

### Class: com.nisovin.shopkeepers.util.data.property.validation.java.StringValidators
Type: Class

No public methods found

## Package: com.nisovin.shopkeepers.util.data.property.value

### Class: com.nisovin.shopkeepers.util.data.property.value.PropertyValuesHolder
Type: Interface

Methods:
- List getPropertyValues()

### Class: com.nisovin.shopkeepers.util.data.property.value.ValueChangeListener
Type: Interface

Methods:
- void onValueChanged(PropertyValue, Object, Object, Set)

### Class: com.nisovin.shopkeepers.util.data.property.value.AbstractPropertyValuesHolder
Type: Abstract Class
Implements: com.nisovin.shopkeepers.util.data.property.value.PropertyValuesHolder

Methods:
- void markDirty()
- List getPropertyValues()
- String getLogPrefix()

### Class: com.nisovin.shopkeepers.util.data.property.value.PropertyValue
Type: Class

Methods:
- Object getValue()
- Property getProperty()
- void load(DataContainer) throws InvalidDataException
- PropertyValue build(PropertyValuesHolder)
- void setValue(Object)
- void setValue(Object, Set)
- void save(DataContainer)
- PropertyValue onValueChanged(ValueChangeListener)
- PropertyValue onValueChanged(Runnable)
- PropertyValuesHolder getHolder()

## Package: com.nisovin.shopkeepers.util.data.serialization

### Class: com.nisovin.shopkeepers.util.data.serialization.DataAccessor
Type: Interface
Implements: com.nisovin.shopkeepers.util.data.serialization.DataSaver, com.nisovin.shopkeepers.util.data.serialization.DataLoader

No public methods found

### Class: com.nisovin.shopkeepers.util.data.serialization.DataLoader
Type: Interface

Methods:
- Object load(DataContainer) throws InvalidDataException

### Class: com.nisovin.shopkeepers.util.data.serialization.DataSaver
Type: Interface

Methods:
- void save(DataContainer, Object)

### Class: com.nisovin.shopkeepers.util.data.serialization.DataSerializer
Type: Interface

Methods:
- Object serialize(Object)
- Object deserialize(Object) throws InvalidDataException

### Class: com.nisovin.shopkeepers.util.data.serialization.InvalidDataException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.nisovin.shopkeepers.util.data.serialization.MissingDataException
Type: Class
Extends: com.nisovin.shopkeepers.util.data.serialization.InvalidDataException

No public methods found

## Package: com.nisovin.shopkeepers.util.data.serialization.bukkit

### Class: com.nisovin.shopkeepers.util.data.serialization.bukkit.ColoredStringSerializers
Type: Class

No public methods found

### Class: com.nisovin.shopkeepers.util.data.serialization.bukkit.ItemStackSerializers
Type: Class

No public methods found

### Class: com.nisovin.shopkeepers.util.data.serialization.bukkit.KeyedSerializers
Type: Class

Methods:
- DataSerializer forRegistry(Class, Registry)
- DataSerializer forResolver(Class, KeyedSerializers$KeyedResolver)

### Class: com.nisovin.shopkeepers.util.data.serialization.bukkit.MinecraftEnumSerializers
Type: Class

Methods:
- DataSerializer strict(Class)
- DataSerializer lenient(Class)

### Class: com.nisovin.shopkeepers.util.data.serialization.bukkit.NamespacedKeySerializers
Type: Class

No public methods found

### Class: com.nisovin.shopkeepers.util.data.serialization.bukkit.UnknownMaterialException
Type: Class
Extends: com.nisovin.shopkeepers.util.data.serialization.InvalidDataException

No public methods found

## Package: com.nisovin.shopkeepers.util.data.serialization.java

### Class: com.nisovin.shopkeepers.util.data.serialization.java.BooleanSerializers
Type: Class

No public methods found

### Class: com.nisovin.shopkeepers.util.data.serialization.java.DataContainerSerializers
Type: Class

No public methods found

### Class: com.nisovin.shopkeepers.util.data.serialization.java.EnumSerializers
Type: Class

Methods:
- DataSerializer strict(Class)
- DataSerializer lenient(Class)

### Class: com.nisovin.shopkeepers.util.data.serialization.java.InstantSerializers
Type: Class

No public methods found

### Class: com.nisovin.shopkeepers.util.data.serialization.java.NumberSerializers
Type: Class

No public methods found

### Class: com.nisovin.shopkeepers.util.data.serialization.java.StringSerializers
Type: Class

No public methods found

### Class: com.nisovin.shopkeepers.util.data.serialization.java.UUIDSerializers
Type: Class

No public methods found

## Package: com.nisovin.shopkeepers.util.interaction

### Class: com.nisovin.shopkeepers.util.interaction.InteractionUtils
Type: Class

Methods:
- boolean checkEntityInteract(Player, Entity)
- boolean checkBlockInteract(Player, Block, boolean)

### Class: com.nisovin.shopkeepers.util.interaction.TestPlayerInteractEntityEvent
Type: Class
Extends: org.bukkit.event.player.PlayerInteractEntityEvent

No public methods found

### Class: com.nisovin.shopkeepers.util.interaction.TestPlayerInteractEvent
Type: Class
Extends: org.bukkit.event.player.PlayerInteractEvent

No public methods found

## Package: com.nisovin.shopkeepers.util.inventory

### Class: com.nisovin.shopkeepers.util.inventory.BookItems
Type: Class

Methods:
- ItemStack copyBook(ItemStack)
- String getTitle(BookMeta)
- boolean isBookCopy(ItemStack)
- BookMeta$Generation getCopyGeneration(BookMeta$Generation)
- String getBookTitle(ItemStack)
- boolean isCopyableBook(ItemStack)
- BookMeta$Generation getGeneration(BookMeta)
- BookMeta getBookMeta(ItemStack)
- BookMeta getBookMeta(UnmodifiableItemStack)
- boolean isWrittenBook(ItemStack)
- boolean isCopyable(BookMeta$Generation)
- boolean isCopyable(BookMeta)
- boolean isCopy(BookMeta$Generation)
- boolean isCopy(BookMeta)

### Class: com.nisovin.shopkeepers.util.inventory.ChestLayout
Type: Class

Methods:
- void validateSlotRange(int, int)
- int toRows(int)
- int getRequiredSlots(int)
- boolean isChestLike(InventoryType)
- int getCenterSlot(int, int)
- int toSlot(int, int)
- int toX(int)
- int toY(int)

### Class: com.nisovin.shopkeepers.util.inventory.EnchantmentUtils
Type: Class

Methods:
- EnchantmentUtils$EnchantmentWithLevel parseEnchantmentWithLevel(String)
- boolean isValidLevel(Enchantment, int)
- Enchantment parseEnchantment(String)
- ItemStack createEnchantedBook(Enchantment, int)

### Class: com.nisovin.shopkeepers.util.inventory.InventoryUtils
Type: Class

Methods:
- void closeInventoryDelayed(InventoryView)
- void closeInventoryDelayed(Player)
- void setStorageContents(Inventory, ItemStack[])
- boolean contains(ItemStack[], ItemData)
- boolean contains(ItemStack[], ItemStack)
- boolean contains(Iterable, ItemData)
- boolean contains(Iterable, ItemStack)
- void updateInventoryLater(Inventory)
- void updateInventoryLater(Player)
- ItemStack[] emptyItemStackArray()
- int removeItems(ItemStack[], ItemData, int)
- int removeItems(ItemStack[], ItemStack)
- int removeItems(ItemStack[], UnmodifiableItemStack)
- int removeItems(ItemStack[], Predicate, int)
- boolean hasInventoryOpen(Player)
- void setItemDelayed(Inventory, int, ItemStack)
- boolean containsAtLeast(ItemStack[], Predicate, int)
- boolean containsAtLeast(ItemStack[], ItemData, int)
- boolean containsAtLeast(ItemStack[], ItemStack, int)
- boolean containsAtLeast(ItemStack[], UnmodifiableItemStack, int)
- boolean containsAtLeast(Iterable, Predicate, int)
- boolean containsAtLeast(Iterable, ItemData, int)
- boolean containsAtLeast(Iterable, ItemStack, int)
- void setContents(Inventory, ItemStack[])
- void setContents(Inventory, int, ItemStack[])
- int addItems(ItemStack[], ItemStack)
- int addItems(ItemStack[], ItemStack, int)
- int addItems(ItemStack[], UnmodifiableItemStack)
- int addItems(ItemStack[], UnmodifiableItemStack, int)

### Class: com.nisovin.shopkeepers.util.inventory.InventoryViewUtils
Type: Class

Methods:
- boolean isPlayerInventory(InventoryView, int)
- boolean isTopInventory(InventoryView, int)

### Class: com.nisovin.shopkeepers.util.inventory.ItemData
Type: Class

Methods:
- int getMaxStackSize()
- UnmodifiableItemStack createUnmodifiableItemStack(int)
- ItemMeta getItemMeta()
- void serializerPrefersPlainTextFormat(boolean)
- boolean matches(ItemStack)
- boolean matches(UnmodifiableItemStack)
- boolean matches(ItemStack, boolean)
- boolean matches(UnmodifiableItemStack, boolean)
- boolean matches(ItemData)
- boolean matches(ItemData, boolean)
- ItemData withType(Material)
- void resetSerializerPrefersPlainTextFormat()
- UnmodifiableItemStack asUnmodifiableItemStack()
- Object serialize()
- boolean hasItemMeta()
- Material getType()
- int hashCode()
- boolean equals(Object)
- String toString()
- ItemStack createItemStack()
- ItemStack createItemStack(int)
- boolean isSimilar(ItemStack)
- boolean isSimilar(UnmodifiableItemStack)

### Class: com.nisovin.shopkeepers.util.inventory.ItemMigration
Type: Class

Methods:
- ItemStack migrateItemStack(ItemStack)
- UnmodifiableItemStack migrateItemStack(UnmodifiableItemStack)
- ItemStack migrateNonNullItemStack(ItemStack)

### Class: com.nisovin.shopkeepers.util.inventory.ItemSerialization
Type: Class

Methods:
- ItemMeta deserializeItemMeta(Map)
- Map serializeItemMetaOrEmpty(ItemMeta)
- Map serializeItemMeta(ItemMeta)

### Class: com.nisovin.shopkeepers.util.inventory.ItemStackComponentsData
Type: Class
Extends: com.nisovin.shopkeepers.util.data.container.DelegateDataContainer

Methods:
- ItemStackComponentsData of(ItemStack)
- ItemStackComponentsData of(DataContainer)
- ItemStackComponentsData ofNonNull(DataContainer)

### Class: com.nisovin.shopkeepers.util.inventory.ItemUtils
Type: Class

Methods:
- String getSimpleItemInfo(UnmodifiableItemStack)
- String getSimpleRecipeInfo(TradingRecipe)
- ItemStack setItemMeta(ItemStack, String, List, Integer)
- ItemStack setItemMetaLegacy(ItemStack, String, List, Integer)
- UnmodifiableItemStack getFallbackIfNull(UnmodifiableItemStack, UnmodifiableItemStack)
- ItemStack copyWithAmount(ItemStack, int)
- ItemStack copyWithAmount(UnmodifiableItemStack, int)
- int getDurability(ItemStack)
- UnmodifiableItemStack shallowCopy(UnmodifiableItemStack)
- ItemStack cloneOrNullIfEmpty(ItemStack)
- ItemStack increaseItemAmount(ItemStack, int)
- ItemStack ensureBukkitItemStack(ItemStack)
- ItemStack asItemStackOrNull(UnmodifiableItemStack)
- ItemStack setUnbreakable(ItemStack)
- boolean isHangingSign(Material)
- UnmodifiableItemStack unmodifiableClone(ItemStack)
- boolean isSign(Material)
- UnmodifiableItemStack unmodifiableCopyWithAmount(ItemStack, int)
- UnmodifiableItemStack unmodifiableCopyWithAmount(UnmodifiableItemStack, int)
- Predicate nonEmptyItems()
- ItemStack decreaseItemAmount(ItemStack, int)
- boolean isDamageable(ItemStack)
- boolean isDamageable(Material)
- String getDisplayNameOrEmpty(ItemStack)
- String getDisplayNameOrEmpty(ItemMeta)
- UnmodifiableItemStack unmodifiableOrNullIfEmpty(ItemStack)
- boolean isClickableDoor(Material)
- ItemStack setLeatherColor(ItemStack, Color)
- int getItemStackAmount(ItemStack)
- int getItemStackAmount(UnmodifiableItemStack)
- boolean isContainer(Material)
- ItemStack setDisplayName(ItemStack, String)
- ItemStack getNullIfEmpty(ItemStack)
- UnmodifiableItemStack getNullIfEmpty(UnmodifiableItemStack)
- ItemStack copyOrNullIfEmpty(UnmodifiableItemStack)
- boolean hasDisplayName(ItemStack)
- boolean isShulkerBox(Material)
- String formatMaterialName(Material)
- String formatMaterialName(ItemStack)
- Material getWoolType(DyeColor)
- Predicate emptyItems()
- boolean matchesData(ItemStack, ItemStack)
- boolean matchesData(UnmodifiableItemStack, UnmodifiableItemStack)
- boolean matchesData(UnmodifiableItemStack, UnmodifiableItemStack, boolean)
- boolean matchesData(ItemStack, ItemStack, boolean)
- boolean matchesData(ItemStack, Material, Map, boolean)
- boolean matchesData(UnmodifiableItemStack, Material, Map, boolean)
- boolean matchesData(ItemMeta, ItemMeta)
- boolean matchesData(ItemMeta, ItemMeta, boolean)
- boolean matchesData(ItemMeta, Map, boolean)
- boolean matchesData(Map, Map, boolean)
- ItemStack getOrEmpty(ItemStack)
- boolean isSimilar(ItemStack, ItemStack)
- boolean isSimilar(UnmodifiableItemStack, UnmodifiableItemStack)
- boolean isSimilar(UnmodifiableItemStack, ItemStack)
- boolean isSimilar(ItemStack, Material, String, List)
- boolean isClickableSwitch(Material)
- Material parseMaterial(String)
- Material getCarpetType(DyeColor)
- ItemStack clearDisplayNameAndLore(ItemStack)
- Predicate itemsOfType(Material)
- Predicate similarItems(ItemStack)
- Predicate similarItems(UnmodifiableItemStack)
- int clampAmount(ItemStack, int)
- int clampAmount(Material, int)
- boolean isEmpty(ItemStack)
- boolean isEmpty(UnmodifiableItemStack)
- ItemStack setDisplayNameAndLore(ItemStack, String, List)
- ItemStack asItemStack(UnmodifiableItemStack)
- boolean isRail(Material)
- Predicate matchingItems(ItemData)
- Predicate matchingItems(List)
- boolean equals(UnmodifiableItemStack, ItemStack)
- ItemStack copySingleItem(ItemStack)
- UnmodifiableItemStack nonNullUnmodifiableClone(ItemStack)
- ItemStack createItemStack(Material, int, String, List)
- ItemStack createItemStack(ItemData, int, String, List)
- boolean isChest(Material)
- ItemStack copyOrNull(UnmodifiableItemStack)
- ItemStack setItemName(ItemStack, String)

### Class: com.nisovin.shopkeepers.util.inventory.PotionUtils
Type: Class

Methods:
- ItemStack parsePotionItem(String)
- ItemStack setPotionType(ItemStack, PotionType)
- PotionType getStrongPotionType(PotionType)
- PotionType getLongPotionType(PotionType)
- PotionEffect findIgnoreDuration(Collection, PotionEffect)
- PotionType parsePotionType(String)
- boolean equalsIgnoreDuration(PotionEffect, PotionEffect)

### Class: com.nisovin.shopkeepers.util.inventory.SKUnmodifiableItemStack
Type: Class
Implements: com.nisovin.shopkeepers.api.util.UnmodifiableItemStack

Methods:
- int getMaxStackSize()
- int getEnchantmentLevel(Enchantment)
- boolean containsEnchantment(Enchantment)
- ItemMeta getItemMeta()
- Map getEnchantments()
- Map serialize()
- boolean hasItemMeta()
- Material getType()
- int hashCode()
- boolean equals(ItemStack)
- boolean equals(Object)
- ItemStack getInternalItemStack()
- UnmodifiableItemStack of(ItemStack)
- String toString()
- ItemStack copy()
- boolean isSimilar(ItemStack)
- boolean isSimilar(UnmodifiableItemStack)
- UnmodifiableItemStack shallowCopy()
- int getAmount()

## Package: com.nisovin.shopkeepers.util.java

### Class: com.nisovin.shopkeepers.util.java.KeyValueStore
Type: Interface

Methods:
- void set(String, Object)
- Object get(String)

### Class: com.nisovin.shopkeepers.util.java.VoidCallable
Type: Interface
Implements: java.util.concurrent.Callable

Methods:
- Void call() throws Exception
- Object call() throws Exception
- void voidCall() throws Exception

### Class: com.nisovin.shopkeepers.util.java.Box
Type: Class

Methods:
- Object getValue()
- int hashCode()
- boolean equals(Object)
- void setValue(Object)
- String toString()

### Class: com.nisovin.shopkeepers.util.java.ClassUtils
Type: Class

Methods:
- InputStream getResource(Class, String)
- Class getClassOrNull(String)
- Class parameterized(Class)
- String getSimpleTypeName(Class)
- boolean isPrimitiveWrapperOf(Class, Class)
- ClassLoader getClassLoader(Class)
- boolean isAssignableFrom(Class, Class)
- boolean isAssignableFrom(Class, Object)
- boolean loadAllClassesFromJar(File, Predicate, Logger)

### Class: com.nisovin.shopkeepers.util.java.CollectionUtils
Type: Class

Methods:
- List copyAndAddAll(Collection, Collection)
- Object cycleValueNullable(List, Object, boolean)
- Object cycleValueNullable(List, Object, boolean, Predicate)
- Iterable toIterable(Stream)
- Object getFirstOrNull(Stream)
- boolean replace(List, Object, Object)
- Object findFirst(Iterable, Predicate)
- Object[] concat(Object[], Object[])
- Object[] concat(Object[][])
- List sort(List, Comparator)
- List asList(Object[])
- List copyAndAdd(Collection, Object)
- boolean contains(Iterable, Predicate)
- Stream stream(Iterable)
- Collection addAll(Collection, Collection)
- List unmodifiableCopyAndAdd(Collection, Object)
- boolean containsNull(Collection)
- Object cycleValue(List, Object, boolean)
- Object cycleValue(List, Object, boolean, Predicate)
- Object cycleValue(List, boolean, Object, boolean, Predicate)
- List unmodifiableCopyAndAddAll(Collection, Collection)

### Class: com.nisovin.shopkeepers.util.java.ConversionUtils
Type: Class

Methods:
- Float parseFloat(String)
- List parseDoubleList(Collection)
- List toEnumList(Class, List)
- List toBooleanList(List)
- Boolean parseBoolean(String)
- List toDoubleList(List)
- Double parseDouble(String)
- List toFloatList(List)
- Integer toInteger(Object)
- UUID parseUUID(String)
- Double toDouble(Object)
- Boolean toBoolean(Object)
- List toTrileanList(List)
- List toStringList(List)
- Enum parseEnum(Class, String)
- Trilean toTrilean(Object)
- List parseLongList(Collection)
- Long toLong(Object)
- Float toFloat(Object)
- Trilean parseTrilean(String)
- List toIntegerList(List)
- List toLongList(List)
- Integer parseInt(String)
- List parseIntList(Collection)
- List parseFloatList(Collection)
- Enum toEnum(Class, Object)
- List parseEnumList(Class, Collection)
- Long parseLong(String)
- String toString(Object)

### Class: com.nisovin.shopkeepers.util.java.CyclicCounter
Type: Class

Methods:
- int getAndIncrement()
- int getValue()
- int incrementAndGet()
- void setValue(int)
- void reset()
- String toString()
- int getUpperBound()
- int getLowerBound()

### Class: com.nisovin.shopkeepers.util.java.EnumUtils
Type: Class

Methods:
- String normalizeEnumName(String)
- Enum valueOf(Class, String)
- Enum cycleEnumConstant(Class, Enum, boolean)
- Enum cycleEnumConstant(Class, Enum, boolean, Predicate)
- String formatEnumName(String)
- Enum cycleEnumConstantNullable(Class, Enum, boolean)
- Enum cycleEnumConstantNullable(Class, Enum, boolean, Predicate)

### Class: com.nisovin.shopkeepers.util.java.FileUtils
Type: Class

Methods:
- void writeSafely(Path, String, Charset, Logger, Path) throws IOException
- String read(Reader) throws IOException
- void checkIsFileWritable(Path) throws IOException
- void createParentDirectories(Path) throws IOException
- void fsyncParentDirectory(Path) throws IOException
- boolean deleteIfExists(Path) throws IOException
- Writer newUnbufferedWriter(Path, Charset, OpenOption[]) throws IOException
- void moveFile(Path, Path, Logger) throws IOException
- void delete(Path) throws IOException
- void fsync(Path) throws IOException
- Path getTempSibling(Path)
- Path relativize(Path, Path)
- void copy(Path, Path, CopyOption[]) throws IOException
- void checkIsDirectoryWritable(Path) throws IOException
- void createDirectories(Path) throws IOException

### Class: com.nisovin.shopkeepers.util.java.LRUCache
Type: Class
Extends: java.util.LinkedHashMap

No public methods found

### Class: com.nisovin.shopkeepers.util.java.Lazy
Type: Class

Methods:
- Object get()
- String toString()

### Class: com.nisovin.shopkeepers.util.java.MapBasedKeyValueStore
Type: Class
Implements: com.nisovin.shopkeepers.util.java.KeyValueStore

Methods:
- void set(String, Object)
- int hashCode()
- boolean equals(Object)
- Object get(String)
- String toString()

### Class: com.nisovin.shopkeepers.util.java.MapUtils
Type: Class

Methods:
- Map$Entry entry(Object, Object)
- Map toStringMap(Map)
- Map createMap(Object, Object)
- Map createMap(Object, Object, Object, Object)
- Map createMap(Object, Object, Object, Object, Object, Object)
- Map createMap(Object, Object, Object, Object, Object, Object, Object, Object)
- Map createMap(Object, Object, Object, Object, Object, Object, Object, Object, Object, Object)
- Map createMap(Object[])
- int getIdealHashMapCapacity(int)
- Map getOrEmpty(Map)

### Class: com.nisovin.shopkeepers.util.java.MathUtils
Type: Class

Methods:
- int rangeModulo(int, int, int)
- double average(long[])
- double average(long[], long)
- int addSaturated(int, int)
- boolean fuzzyEquals(double, double)
- boolean fuzzyEquals(double, double, double)
- boolean fuzzyEquals(float, float)
- boolean fuzzyEquals(float, float, float)
- int middle(int, int)
- int randomIntInRange(int, int)
- long max(long[])
- long max(long[], long)
- float randomFloatInRange(float, float)
- int clamp(int, int, int)

### Class: com.nisovin.shopkeepers.util.java.MutableLong
Type: Class
Implements: java.lang.Comparable

Methods:
- long getValue()
- int hashCode()
- void decrement(long)
- boolean equals(Object)
- void setValue(long)
- void increment(long)
- String toString()
- int compareTo(Number)
- int compareTo(Object)

### Class: com.nisovin.shopkeepers.util.java.ObjectUtils
Type: Class

Methods:
- Object castOrNull(Object, Class)

### Class: com.nisovin.shopkeepers.util.java.Pair
Type: Class

Methods:
- int hashCode()
- Object getFirst()
- boolean equals(Object)
- Map toMap(Pair[])
- Pair of(Object, Object)
- Object getSecond()
- String toString()

### Class: com.nisovin.shopkeepers.util.java.PredicateUtils
Type: Class

Methods:
- Predicate orAlwaysFalse(Predicate)
- Predicate orAlwaysTrue(Predicate)
- Predicate alwaysFalse()
- Predicate alwaysTrue()

### Class: com.nisovin.shopkeepers.util.java.RateLimiter
Type: Class

Methods:
- boolean request()
- boolean request(int)
- RateLimiter withRandomInitialThreshold(int)
- int getRemainingThreshold()
- RateLimiter withInitialOffset(int, int)
- String toString()
- void setThreshold(int)
- int getThreshold()
- void setRemainingThreshold(int)
- RateLimiter withRandomInitialOffset(int)

### Class: com.nisovin.shopkeepers.util.java.Rectangle
Type: Class

Methods:
- boolean containsSlots(int, int, int)
- boolean containsSlot(int)
- boolean isEmpty()
- int slotToY(int)
- int getWidth()
- int toSlot(int, int)
- int convertSlotFrom(Rectangle, int)
- int getMaxSlot()
- boolean contains(int, int)
- boolean contains(int, int, int, int)
- boolean contains(Rectangle)
- int getHeight()
- int getX()
- int getY()
- int slotToX(int)
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: com.nisovin.shopkeepers.util.java.Retry
Type: Class

Methods:
- Object retry(Callable, int) throws Exception
- Object retry(Callable, int, Retry$Callback) throws Exception

### Class: com.nisovin.shopkeepers.util.java.StringUtils
Type: Class

Methods:
- String toStringOrEmpty(Object)
- String capitalizeAll(String)
- String escapeNewlinesAndBackslash(String)
- boolean isEmpty(String)
- String replaceFirst(String, String, CharSequence)
- boolean containsWhitespace(String)
- String[] splitLines(String)
- String[] splitLines(String, boolean)
- String replaceArguments(String, Object[])
- String replaceArguments(String, Map)
- String replaceArguments(String, MessageArguments)
- List replaceArguments(Collection, Object[])
- List replaceArguments(Collection, Map)
- List replaceArguments(Collection, MessageArguments)
- boolean containsNewline(String)
- String getNotEmpty(String)
- boolean contains(String, int)
- void addArgumentsToMap(Map, Object[])
- String normalizeKeepCase(String)
- String stripTrailingNewlines(String)
- String removeWhitespace(String)
- String replaceWhitespace(String, String)
- String normalize(String)
- List normalize(List)
- String toStringOrNull(Object)
- String getOrEmpty(String)

### Class: com.nisovin.shopkeepers.util.java.ThrowableUtils
Type: Class

Methods:
- Error rethrow(Throwable) throws Throwable
- String getMessageRecursively(Throwable)
- Object callUnchecked(Callable)
- Throwable getRootCause(Throwable)
- String getDescription(Throwable)

### Class: com.nisovin.shopkeepers.util.java.TimeUtils
Type: Class

Methods:
- double convert(double, TimeUnit, TimeUnit)

### Class: com.nisovin.shopkeepers.util.java.Trilean
Type: Enum
Extends: java.lang.Enum

Methods:
- Trilean not()
- Trilean or(Trilean)
- boolean toBoolean()
- Trilean and(Trilean)
- Trilean valueOf(String)
- Trilean fromNullableBoolean(Boolean)
- Trilean[] values()
- Boolean toNullableBoolean()
- Trilean fromBoolean(boolean)

### Class: com.nisovin.shopkeepers.util.java.Validate
Type: Class

Methods:
- boolean isTrue(boolean)
- boolean isTrue(boolean, String)
- boolean isTrue(boolean, Supplier)
- Object isTrue(Object, Predicate)
- Object isTrue(Object, Predicate, String)
- Object isTrue(Object, Predicate, Supplier)
- Object notNull(Object)
- Object notNull(Object, String)
- Object notNull(Object, Supplier)
- Iterable noNullElements(Iterable, String)
- Iterable noNullElements(Iterable, Supplier)
- String notEmpty(String)
- String notEmpty(String, String)
- String notEmpty(String, Supplier)
- void error(String)
- void error(Supplier)
- double notNaN(double)
- double notNaN(double, String)
- double notNaN(double, Supplier)
- float notNaN(float)
- float notNaN(float, String)
- float notNaN(float, Supplier)
- double isFinite(double)
- double isFinite(double, String)
- double isFinite(double, Supplier)
- float isFinite(float)
- float isFinite(float, String)
- float isFinite(float, Supplier)

## Package: com.nisovin.shopkeepers.util.json

### Class: com.nisovin.shopkeepers.util.json.BukkitAwareObjectTypeAdapter
Type: Class
Extends: com.nisovin.shopkeepers.util.json.YamlLikeObjectTypeAdapter

Methods:
- Object read(JsonReader) throws IOException
- Object fromJson(Gson, String) throws IllegalArgumentException
- TypeAdapter create(Gson)
- void write(JsonWriter, Object) throws IOException

### Class: com.nisovin.shopkeepers.util.json.JsonUtils
Type: Class

Methods:
- String toJson(Object)
- Object fromPlainJson(String) throws IllegalArgumentException
- String toPrettyJson(Object)
- Object fromJson(String) throws IllegalArgumentException

### Class: com.nisovin.shopkeepers.util.json.YamlLikeObjectTypeAdapter
Type: Class
Extends: com.google.gson.TypeAdapter

Methods:
- Object read(JsonReader) throws IOException
- TypeAdapter create(Gson)
- void write(JsonWriter, Object) throws IOException

## Package: com.nisovin.shopkeepers.util.logging

### Class: com.nisovin.shopkeepers.util.logging.Log
Type: Class

Methods:
- void debug(String)
- void debug(Supplier)
- void debug(String, Throwable)
- void debug(Throwable, Supplier)
- void debug(String, String)
- void debug(String, Supplier)
- void debug(String, String, Throwable)
- void debug(String, Throwable, Supplier)
- void setLogger(Logger)
- void severe(String)
- void severe(Supplier)
- void severe(String, Throwable)
- void severe(Throwable, Supplier)
- void warning(String)
- void warning(Supplier)
- void warning(String, Throwable)
- void warning(Throwable, Supplier)
- Logger getLogger()
- void info(String)
- void info(Supplier)
- void info(String, Throwable)
- void info(Throwable, Supplier)

### Class: com.nisovin.shopkeepers.util.logging.LogDetectionHandler
Type: Class
Extends: java.util.logging.Handler

Methods:
- LogRecord getLastLogRecord()
- void flush()
- void publish(LogRecord)
- void reset()
- boolean hasLogRecord()
- void close() throws SecurityException

### Class: com.nisovin.shopkeepers.util.logging.NullLogger
Type: Class
Extends: java.util.logging.Logger

Methods:
- void log(LogRecord)
- Logger getInstance()
- void setLevel(Level)

## Package: com.nisovin.shopkeepers.util.taskqueue

### Class: com.nisovin.shopkeepers.util.taskqueue.TaskQueueStatistics
Type: Interface

Methods:
- int getPendingCount()
- int getMaxPendingCount()

### Class: com.nisovin.shopkeepers.util.taskqueue.TaskQueue
Type: Abstract Class
Implements: com.nisovin.shopkeepers.util.taskqueue.TaskQueueStatistics

Methods:
- void add(Object)
- int getPendingCount()
- void start()
- int getMaxPendingCount()
- void remove(Object)
- void shutdown()

## Package: com.nisovin.shopkeepers.util.text

### Class: com.nisovin.shopkeepers.util.text.MessageArguments
Type: Interface

Methods:
- MessageArguments prefixed(String)
- Object get(String)
- MessageArguments combinedWith(MessageArguments)
- MessageArguments ofMap(Map)

## Package: com.nisovin.shopkeepers.util.timer

### Class: com.nisovin.shopkeepers.util.timer.Timings
Type: Interface

Methods:
- double getAverageTimeMillis()
- long getCounter()
- void reset()
- double getMaxTimeMillis()

### Class: com.nisovin.shopkeepers.util.timer.Timer
Type: Class
Implements: com.nisovin.shopkeepers.util.timer.Timings

Methods:
- void resume()
- double getAverageTimeMillis()
- long getCounter()
- void stop()
- void start()
- void reset()
- void startPaused()
- double getMaxTimeMillis()
- void pause()

## Package: com.nisovin.shopkeepers.util.trading

### Class: com.nisovin.shopkeepers.util.trading.MergedTrades
Type: Class

Methods:
- UnmodifiableItemStack getResultItem()
- int getTradeCount()
- Instant getTimestamp()
- ShopkeeperTradeEvent getInitialTrade()
- boolean canMerge(ShopkeeperTradeEvent, boolean)
- UnmodifiableItemStack getOfferedItem2()
- void addTrades(int)
- UnmodifiableItemStack getOfferedItem1()

### Class: com.nisovin.shopkeepers.util.trading.TradeMerger
Type: Class

Methods:
- TradeMerger withMergeDurations(long, long)
- void mergeTrade(ShopkeeperTradeEvent)
- void onEnable()
- void processPreviousTrades()
- void onDisable()

## Package: com.nisovin.shopkeepers.util.yaml

### Class: com.nisovin.shopkeepers.util.yaml.CompactYamlRepresenter
Type: Class
Extends: com.nisovin.shopkeepers.util.yaml.OldBukkitYamlRepresenter

No public methods found

### Class: com.nisovin.shopkeepers.util.yaml.YamlUtils
Type: Class

Methods:
- String yamlNewline()
- Object fromYaml(String)
- String toCompactYaml(Object)

## Package: com.nisovin.shopkeepers.villagers

### Class: com.nisovin.shopkeepers.villagers.BlockVillagerSpawnListener
Type: Class
Implements: org.bukkit.event.Listener

No public methods found

### Class: com.nisovin.shopkeepers.villagers.BlockZombieVillagerCuringListener
Type: Class
Implements: org.bukkit.event.Listener

No public methods found

### Class: com.nisovin.shopkeepers.villagers.RegularVillagers
Type: Class

Methods:
- void onEnable()
- void onDisable()

### Class: com.nisovin.shopkeepers.villagers.TestEntityDamageByEntityEvent
Type: Class
Extends: org.bukkit.event.entity.EntityDamageByEntityEvent

No public methods found

### Class: com.nisovin.shopkeepers.villagers.VillagerInteractionListener
Type: Class
Implements: org.bukkit.event.Listener

No public methods found

## Package: com.nisovin.shopkeepers.world

### Class: com.nisovin.shopkeepers.world.ForcingCreatureSpawner
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void resetForcedCreatureSpawn()
- void onEnable()
- void forceCreatureSpawn(Location, EntityType)
- void onDisable()

### Class: com.nisovin.shopkeepers.world.ForcingEntityTeleporter
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- boolean teleport(Entity, Location)
- void onEnable()
- void resetForcedEntityTeleport()
- void onDisable()

