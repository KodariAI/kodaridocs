# craft-engine-paper-plugin-0.0.66.2-net-momirealms-craftengine-bukkit-api API Reference

**Package Filter:** `net.momirealms.craftengine.bukkit.api`

## Package: net.momirealms.craftengine.bukkit.api

### Class: net.momirealms.craftengine.bukkit.api.BukkitAdaptors
Type: Class

Methods:
- **static** BukkitServerPlayer adapt(Player player)
- **static** BukkitWorld adapt(World world)
- **static** BukkitEntity adapt(Entity entity)
- **static** BukkitExistingBlock adapt(Block block)
- **static** Item<ItemStack> adapt(ItemStack item)

### Class: net.momirealms.craftengine.bukkit.api.CraftEngineBlocks
Type: Class

Methods:
- **static** boolean isVanillaBlockState(int id)
- **static** BlockData getBukkitBlockData(ImmutableBlockState blockState)
- **static** boolean isCustomBlock(Block block)
- **static** boolean place(Location location, ImmutableBlockState block, boolean playSound)
- **static** boolean place(Location location, Key blockId, boolean playSound)
- **static** boolean place(Location location, Key blockId, CompoundTag properties, boolean playSound)
- **static** boolean place(Location location, Key blockId, CompoundTag properties, UpdateOption option, boolean playSound)
- **static** boolean place(Location location, ImmutableBlockState block, UpdateOption option, boolean playSound)
- **static** ImmutableBlockState getCustomBlockState(Block block)
- **static** ImmutableBlockState getCustomBlockState(BlockData blockData)
- **static** CustomBlock byId(Key id)
- **static** Map<Key, CustomBlock> loadedBlocks()
- **static** boolean remove(Block block)
- **static** boolean remove(Block block, boolean isMoving)
- **static** boolean remove(Block block, Player player, boolean isMoving, boolean dropLoot, boolean sendLevelEvent)
- **static** boolean remove(Block block, Player player, boolean isMoving, boolean dropLoot, boolean playSound, boolean sendParticles)

### Class: net.momirealms.craftengine.bukkit.api.CraftEngineFurniture
Type: Class

Methods:
- **static** BukkitFurniture getLoadedFurnitureByMetaEntity(Entity baseEntity)
- **static** Map<Key, CustomFurniture> loadedFurniture()
- **static** BukkitFurniture getLoadedFurnitureByBaseEntity(Entity baseEntity)
- **static** boolean isSeat(Entity entity)
- **static** BukkitFurniture getLoadedFurnitureBySeat(Entity seat)
- **static** boolean isCollisionEntity(Entity entity)
- **static** BukkitFurniture rayTrace(Player player, double maxDistance)
- **static** BukkitFurniture rayTrace(Player player)
- **static** BukkitFurniture place(Location location, Key furnitureId)
- **static** BukkitFurniture place(Location location, Key furnitureId, AnchorType anchorType)
- **static** BukkitFurniture place(Location location, Key furnitureId, String variant)
- **static** BukkitFurniture place(Location location, CustomFurniture furniture, AnchorType anchorType)
- **static** BukkitFurniture place(Location location, Key furnitureId, AnchorType anchorType, boolean playSound)
- **static** BukkitFurniture place(Location location, Key furnitureId, String variant, boolean playSound)
- **static** BukkitFurniture place(Location location, CustomFurniture furniture, AnchorType anchorType, boolean playSound)
- **static** BukkitFurniture place(Location location, CustomFurniture furniture, String variant, boolean playSound)
- **static** BukkitFurniture place(Location location, CustomFurniture furniture, CompoundTag data, boolean playSound)
- **static** BukkitFurniture place(Location location, CustomFurniture furniture, FurnitureDataAccessor dataAccessor, boolean playSound)
- **static** boolean isFurniture(Entity entity)
- **static** CustomFurniture byId(Key id)
- **static** BukkitFurniture getLoadedFurnitureByCollider(Entity collider)
- **static** boolean remove(Entity entity)
- **static** boolean remove(Entity entity, boolean dropLoot, boolean playSound)
- **static** boolean remove(Entity entity, Player player, boolean dropLoot, boolean playSound)
- **static** void remove(Furniture furniture, boolean dropLoot, boolean playSound)
- **static** void remove(Furniture furniture, Player player, boolean dropLoot, boolean playSound)
- **static** void remove(Furniture furniture, Player player, boolean dropLoot, boolean playSound)

### Class: net.momirealms.craftengine.bukkit.api.CraftEngineImages
Type: Class

Methods:
- **static** Map<Key, BitmapImage> loadedImages()
- **static** BitmapImage byId(Key id)

### Class: net.momirealms.craftengine.bukkit.api.CraftEngineItems
Type: Class

Methods:
- **static** boolean isCustomItem(ItemStack itemStack)
- **static** CustomItem<ItemStack> byItemStack(ItemStack itemStack)
- **static** Map<Key, CustomItem<ItemStack>> loadedItems()
- **static** CustomItem<ItemStack> byId(Key id)
- **static** Key getCustomItemId(ItemStack itemStack)

## Package: net.momirealms.craftengine.bukkit.api.event

### Class: net.momirealms.craftengine.bukkit.api.event.AsyncResourcePackCacheEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- AsyncResourcePackCacheEvent(PackCacheData cacheData)

Methods:
- void registerExternalResourcePack(Path path)
- PackCacheData cacheData()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.momirealms.craftengine.bukkit.api.event.AsyncResourcePackGenerateEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- AsyncResourcePackGenerateEvent(Path generatedPackPath, Path zipFilePath)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Path zipFilePath()
- Path resourcePackFolder()

### Class: net.momirealms.craftengine.bukkit.api.event.CraftEngineReloadEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- CraftEngineReloadEvent(BukkitCraftEngine plugin)

Methods:
- BukkitCraftEngine plugin()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- boolean isFirstReload()

### Class: net.momirealms.craftengine.bukkit.api.event.CustomBlockAttemptPlaceEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- CustomBlockAttemptPlaceEvent(Player player, Location location, ImmutableBlockState customBlock, BlockFace clickedFace, Block clickedBlock, InteractionHand hand)

Methods:
- ImmutableBlockState blockState()
- boolean isCancelled()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Block clickedBlock()
- Location location()
- CustomBlock customBlock()
- BlockFace clickedFace()
- InteractionHand hand()
- Player player()

### Class: net.momirealms.craftengine.bukkit.api.event.CustomBlockBreakEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- CustomBlockBreakEvent(BukkitServerPlayer player, Location location, Block bukkitBlock, ImmutableBlockState customBlock)

Methods:
- void setDropItems(boolean dropItems)
- ImmutableBlockState blockState()
- boolean isCancelled()
- Block bukkitBlock()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Location location()
- CustomBlock customBlock()
- boolean dropItems()
- BukkitServerPlayer player()

### Class: net.momirealms.craftengine.bukkit.api.event.CustomBlockInteractEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- CustomBlockInteractEvent(Player player, Location location, Location interactionPoint, ImmutableBlockState customBlock, Block bukkitBlock, BlockFace clickedFace, InteractionHand hand, CustomBlockInteractEvent$Action action, ItemStack item)

Methods:
- ImmutableBlockState blockState()
- boolean isCancelled()
- ItemStack item()
- Block bukkitBlock()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- Location interactionPoint()
- **static** HandlerList getHandlerList()
- CustomBlock customBlock()
- BlockFace clickedFace()
- CustomBlockInteractEvent$Action action()
- Location location()
- Player player()
- InteractionHand hand()

### Class: net.momirealms.craftengine.bukkit.api.event.CustomBlockInteractEvent$Action
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LEFT_CLICK
- RIGHT_CLICK

Methods:
- **static** CustomBlockInteractEvent$Action valueOf(String name)
- **static** CustomBlockInteractEvent$Action[] values()

### Class: net.momirealms.craftengine.bukkit.api.event.CustomBlockPlaceEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- CustomBlockPlaceEvent(Player player, Location location, ImmutableBlockState customBlock, Block bukkitBlock, InteractionHand hand)

Methods:
- ImmutableBlockState blockState()
- boolean isCancelled()
- Block bukkitBlock()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Location location()
- CustomBlock customBlock()
- Player player()
- InteractionHand hand()

### Class: net.momirealms.craftengine.bukkit.api.event.FurnitureAttemptBreakEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- FurnitureAttemptBreakEvent(Player player, BukkitFurniture furniture)

Methods:
- boolean isCancelled()
- BukkitFurniture furniture()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Location location()
- Player player()

### Class: net.momirealms.craftengine.bukkit.api.event.FurnitureAttemptPlaceEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- FurnitureAttemptPlaceEvent(Player player, CustomFurniture furniture, FurnitureVariant variant, Location location, InteractionHand hand, Block clickedBlock)

Methods:
- boolean isCancelled()
- CustomFurniture furniture()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Block clickedBlock()
- FurnitureVariant variant()
- Location location()
- Player player()
- InteractionHand hand()

### Class: net.momirealms.craftengine.bukkit.api.event.FurnitureBreakEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- FurnitureBreakEvent(Player player, BukkitFurniture furniture)

Methods:
- boolean isCancelled()
- BukkitFurniture furniture()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Location location()
- Player player()

### Class: net.momirealms.craftengine.bukkit.api.event.FurnitureInteractEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- FurnitureInteractEvent(Player player, BukkitFurniture furniture, InteractionHand hand, Location interactionPoint, FurnitureHitBox furnitureHitBox)

Methods:
- boolean isCancelled()
- BukkitFurniture furniture()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- Location interactionPoint()
- **static** HandlerList getHandlerList()
- Location location()
- FurnitureHitBox hitBox()
- InteractionHand hand()
- Player player()

### Class: net.momirealms.craftengine.bukkit.api.event.FurniturePlaceEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- FurniturePlaceEvent(Player player, BukkitFurniture furniture, Location location, InteractionHand hand)

Methods:
- boolean isCancelled()
- BukkitFurniture furniture()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Location location()
- Player player()
- InteractionHand hand()

