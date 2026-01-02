# virtualspawner-api API Reference

## Package: net.codava.virtualspawner.api

### Class: net.codava.virtualspawner.api.VirtualSpawnerAPI
Type: Class

Methods:
- **static** VirtualSpawner getByLocation(Location location)
- **static** IChunkTicker getChunkTicker(Chunk chunk)
- **static** Optional<IVirtualSpawner> getSpawner(Location location)
- **static** Collection<IStorage> getSpawnerStorage(IVirtualSpawner virtualSpawner)
- **static** Optional<IDropType> getDropTypeFromMaterial(Material material, SpawnerConfigData configData)
- **static** boolean createSpawner(Location location, EntityType entityType, int stack)

## Package: net.codava.virtualspawner.api.currency

### Class: net.codava.virtualspawner.api.currency.CurrencyHook
Type: Interface
Description: Interface for currency plugin integrations

Methods:
- String getName() - Get the name of the currency plugin
- void init() - Initialize the currency hook
- double getBalance(Player player) - Get player's balance
- void withdraw(Player player, double amount) - Remove amount from player's balance
- void deposit(Player player, double amount) - Add amount to player's balance

### Class: net.codava.virtualspawner.api.currency.CurrencyManager
Type: Class
Description: Singleton manager for currency integrations

Methods:
- **static** CurrencyManager getInstance()
- Map<String, CurrencyHook> getRegisteredCurrencies()
- void registerCurrency(CurrencyHook currencyHook) - Register a new currency integration
- boolean setActiveCurrency(String currencyName) - Set active currency from config. Returns true if currency was set successfully
- double getBalance(Player player) - Get player's balance. Returns 0 if no currency active
- void withdraw(Player player, double amount) - Remove amount from player's balance
- void deposit(Player player, double amount) - Add amount to player's balance
- CurrencyHook getActiveCurrency() - Get currently active currency or null if none

## Package: net.codava.virtualspawner.api.enums

### Class: net.codava.virtualspawner.api.enums.SellWandMode
Type: Enum

Constants:
- SINGULAR
- RADIUS

## Package: net.codava.virtualspawner.api.event

### Class: net.codava.virtualspawner.api.event.AsyncSpawnerGenerateEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable
Description: This event triggers before a spawner generates content

Methods:
- IVirtualSpawner getVirtualSpawner()
- long getXp()
- void setXp(long xp)
- int getDropCount()
- IDropType getDropType(int index)
- long getAmount(int index)
- void setAmount(int index, long amount)
- Collection<IStorage> getContent() - READ ONLY PURPOSE
- Map<IDropType, Long> getDrops() - Deprecated
- void setDrops(Map<IDropType, Long> drops) - Deprecated
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.CurrencyRegistrationCompleteEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Map<String, CurrencyHook> getRegisteredCurrencies()
- CurrencyHook getActiveCurrency()
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.PostSpawnerSellEvent
Type: Class
Extends: org.bukkit.event.Event
Description: This event triggers when a player has sold the content of his spawner

Methods:
- Player getPlayer()
- IVirtualSpawner getVirtualSpawner()
- double getMoney()
- void setMoney(double money)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.PreSpawnerSellEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable
Description: This event triggers before a player sell the content of his spawner

Methods:
- Player getPlayer()
- IVirtualSpawner getVirtualSpawner()
- double getAmount()
- void setAmount(double amount)
- Collection<IStorage> getContent() - READ ONLY PURPOSE
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.SellWandEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- SellWandMode getMode()
- List<IVirtualSpawner> getSpawners()
- void setSpawners(List<IVirtualSpawner> spawners)
- double getPrice()
- void setPrice(double price)
- double getMultiplier()
- void setMultiplier(double multiplier)
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.ShopRegistrationCompleteEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Map<String, ShopHook> getRegisteredShops()
- ShopHook getActiveShop()
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.SpawnerAfterPlaceEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- UUID getVirtualSpawnerUuid()
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.SpawnerBreakEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable
Description: This event triggers when a player try to break a spawner and the BlockBreakEvent is successful

Methods:
- Player getPlayer()
- IVirtualSpawner getVirtualSpawner()
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.SpawnerExplodeEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- IVirtualSpawner getVirtualSpawner()
- Entity getSource()
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.SpawnerMenuOpenEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable
Description: This event triggers when a player right-click on a spawner

Methods:
- Player getPlayer()
- IVirtualSpawner getVirtualSpawner()
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.SpawnerPlaceEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable
Description: This event triggers when a player try to place a spawner and the BlockPlaceEvent is successful

Methods:
- Player getPlayer()
- EntityType getEntityType()
- Location getLocation()
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- void setBlockCancelled(boolean blockCancelled) - This cancel the event and the BlockPlaceEvent too
- boolean isBlockCancelled()
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.SpawnerStackEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- IVirtualSpawner getVirtualSpawner()
- EntityType getEntityType()
- int getStack()
- StackType getStackType()
- Location getLocation() - Deprecated: Don't use this function please
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: net.codava.virtualspawner.api.event.SpawnerStackEvent.StackType
Type: Enum

Constants:
- BREAK
- ADD

## Package: net.codava.virtualspawner.api.interfaces

### Class: net.codava.virtualspawner.api.interfaces.IChunkTicker
Type: Interface

Methods:
- VirtualSpawner getElement(UUID uuid)
- void addElement(VirtualSpawner virtualSpawner)
- void removeElement(UUID uuid)
- void removeAllHolo()
- int size()
- Map<UUID, VirtualSpawner> getElements()

### Class: net.codava.virtualspawner.api.interfaces.IDropType
Type: Interface

Methods:
- Material getMaterial()
- int getMinAmount()
- int getMaxAmount()
- double getChance()
- double getPrice()
- int getCustomModelData()
- String getItemsAdderName()
- void setPrice(double price)
- int rollAmount()
- boolean roll()

### Class: net.codava.virtualspawner.api.interfaces.ISpawnerConfigData
Type: Interface

Methods:
- ClassicItem getHead()
- EntityType getEntityType()
- Map<Material, DropType> getDrops()
- ItemBuilder getItem(int amount)
- Material getItemSpawnerMaterial()
- ItemBuilder getHead(ItemBuilder itemBuilder)
- String getDisplayName()
- long getMinUpdateTick()
- long getMaxUpdateTick()
- int getMinXp()
- int getMaxXp()
- String getColor()
- long getStorage()
- long getStorageXp()
- boolean isFullToCollect()
- boolean isItemSpawner()
- int getStackLimit()

### Class: net.codava.virtualspawner.api.interfaces.ISpawnerManager
Type: Interface

Methods:
- ChunkTicker getChunkTicker(Chunk chunk)
- ChunkTicker getChunkTicker(Location location)
- void init(UUID uuid, CreatureSpawner creatureSpawner, Material itemspawnerMaterial, int stack)
- void init(UUID uuid, CreatureSpawner creatureSpawner, Material itemspawnerMaterial)

### Class: net.codava.virtualspawner.api.interfaces.ISpawnerPlugin
Type: Interface

Methods:
- EntityConfig getEntityConfig()
- Map<EntityType, SpawnerConfigData> getSpawnerConfigDatas()
- SpawnerConfigData getSpawnerConfig(EntityType entityType)
- <T extends AbstractManager> T getManager(Class<T> clazz)
- <T extends AbstractGui> T getGui(Class<T> clazz)

### Class: net.codava.virtualspawner.api.interfaces.ISpawnerTicker
Type: Interface

Methods:
- VirtualSpawner getSpawner(Location location, UUID uuid)
- void removeSpawner(UUID uuid)
- Map<WorldWrapper, Map<ChunkWrapper, ChunkTicker>> getChunkMap()

### Class: net.codava.virtualspawner.api.interfaces.IStorage
Type: Interface

Methods:
- Material getMaterial()
- long getAmount()
- void setMaterial(Material material)
- void setAmount(long amount)

### Class: net.codava.virtualspawner.api.interfaces.IVirtualSpawner
Type: Interface

Methods:
- UUID getUuid()
- boolean isCorrupted()
- long getContentAmount()
- SpawnerConfigData getSpawnerConfigData()
- void remove()
- void remove(boolean removeBlock)
- Collection<IStorage> getContent()
- IStorage getContent(Material material)
- Location getLocation()
- void addStack()
- void addStack(int amount)
- void setStack(int amount)
- void removeStack()
- void removeStack(int amount)
- long getStack()
- EntityType getEntityType()
- void clearStock()
- int getXp()
- void setXp(int xp)
- void takeOne(Player player, Material material)
- int takeStack(Player player, Material material)
- void takeAll(Player player)
- void sellStock(Player player, int delay, double multiplier)
- void sellStock(Player player, int delay)
- void sellXP(Player player, int delay)
- ItemStack getItemFromStock(Material material, int amount)

## Package: net.codava.virtualspawner.api.shop

### Class: net.codava.virtualspawner.api.shop.ShopHook
Type: Interface
Description: Interface for shop plugin integrations

Methods:
- String getName() - Get the name of the shop plugin
- void init() - Initialize the shop hook
- double getSellPrice(Material material) - Get sell price for a specific material. Returns -1 if not found
- double getSellPrice(Player player, Material material) - Get sell price for a specific material and player (for player-specific prices). Returns -1 if not found

### Class: net.codava.virtualspawner.api.shop.ShopManager
Type: Class
Description: Singleton manager for shop integrations

Methods:
- **static** ShopManager getInstance()
- Map<String, ShopHook> getRegisteredShops()
- void registerShop(ShopHook shopHook) - Register a new shop integration
- boolean setActiveShop(String shopName) - Set active shop from config. Returns true if shop was set successfully
- double getPrice(Material material) - Get price for a material. Returns -1 if no shop active
- double getPrice(Player player, Material material) - Get price for a player and material. Returns -1 if no shop active
- ShopHook getActiveShop() - Get currently active shop or null if none
- boolean hasAnActiveShop()
- void syncPrices() - Sync prices from active shop to all spawner configurations

## Package: net.codava.virtualspawner.api.utils

### Class: net.codava.virtualspawner.api.utils.ChunkWrapper
Type: Class

Methods:
- ChunkWrapper(Location location)
- ChunkWrapper(Chunk chunk)
- int getX()
- int getZ()
- Chunk getBukkit(World world)
- boolean equals(Object o)
- int hashCode()

### Class: net.codava.virtualspawner.api.utils.EasyLocation
Type: Class

Methods:
- EasyLocation(String string, int x, int y, int z)
- String getString()
- void setString(String string)
- int getX()
- void setX(int x)
- int getY()
- void setY(int y)
- int getZ()
- void setZ(int z)
- boolean equals(Object o)
- int hashCode()

### Class: net.codava.virtualspawner.api.utils.WorldWrapper
Type: Class

Methods:
- WorldWrapper(String name)
- WorldWrapper(World world)
- String getName()
- World getBukkit()
- boolean equals(Object o)
- int hashCode()
- String toString()