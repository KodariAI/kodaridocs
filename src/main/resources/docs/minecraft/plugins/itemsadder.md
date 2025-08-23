# api-itemsadder-4.0.10 API Reference

## Package: dev.lone.itemsadder.api

### Class: dev.lone.itemsadder.api.ItemsAdder$Advanced$ModifierHandler
Type: Interface

Methods:
- ItemStack call(String, ItemStack)

### Class: dev.lone.itemsadder.api.CustomBlock
Type: Class
Extends: dev.lone.itemsadder.api.CustomStack

Methods:
- Block getBlock()
- **static** Set getNamespacedIdsInRegistry()
- **static** boolean isInRegistry(String)
- BlockData getBaseBlockData()
- **static** BlockData getBaseBlockData(String)
- int getOriginalLightLevel()
- boolean playBreakSound()
- **static** boolean playBreakSound(Block)
- boolean isPlaced()
- **static** CustomBlock byAlreadyPlaced(Block)
- boolean remove()
- **static** boolean remove(Location)
- void setCurrentLightLevel(int)
- boolean playBreakEffect()
- **static** boolean playBreakEffect(Block)
- **static** CustomBlock byItemStack(ItemStack)
- boolean playBreakParticles()
- **static** boolean playBreakParticles(Block)
- BlockData generateBlockData()
- **static** CustomBlock place(String, Location)
- CustomBlock place(Location)
- **static** CustomBlock getInstance(String)
- List getLoot(boolean)
- List getLoot()
- List getLoot(ItemStack, boolean)
- **static** List getLoot(Block, ItemStack, boolean)
- boolean playPlaceSound()
- **static** boolean playPlaceSound(Block)

### Class: dev.lone.itemsadder.api.CustomBlock$Advanced
Type: Class

Methods:
- **static** void placeInCustomRegion(CustomBlock, Location)
- **static** boolean placeInCustomRegion(String, Location)
- **static** List getAllBlocksLocationsList(Chunk)
- **static** void deleteAllCustomBlocksInChunk(Chunk)
- **static** void deleteAllCustomBlocksInChunk(Chunk, boolean, boolean)
- **static** String getInCustomRegion(Location)
- **static** void runActionOnBlocks(Chunk, BiConsumer)
- **static** Map getAllBlocksLocations(Chunk)
- **static** boolean removeFromCustomRegion(Location)

### Class: dev.lone.itemsadder.api.CustomCrop
Type: Class

Methods:
- int getAge()
- CustomStack getSeed()
- **static** boolean isSeed(ItemStack)
- void setFullyGrown()
- int getMaxAge()
- boolean isFullyGrown()
- **static** CustomCrop place(String, Location)
- **static** List getLoot(Block, ItemStack)
- **static** List getLoot(Block)
- List getLoot(ItemStack)
- List getLoot()
- void incrementAge()
- **static** CustomCrop byAlreadyPlaced(Block)
- void setAge(int)

### Class: dev.lone.itemsadder.api.CustomEntity
Type: Class

Methods:
- void respawn(Player)
- Location getLocation()
- CustomEntity$Bone getBone(int) throws IndexOutOfBoundsException
- CustomEntity$Bone getBone(String)
- String getNamespacedID()
- void teleport(Location)
- String getId()
- void setEnchantedAllBones(boolean)
- **static** CustomEntity convert(String, LivingEntity)
- **static** CustomEntity convert(String, LivingEntity, boolean)
- **static** CustomEntity convert(String, LivingEntity, boolean, boolean, boolean, boolean)
- **static** CustomEntity convert(String, LivingEntity, List, boolean)
- boolean isPlayingAnimation(String)
- boolean addPassenger(LivingEntity)
- Set getBones()
- **static** CustomEntity byAlreadySpawned(Entity)
- boolean hasPassenger(LivingEntity)
- boolean hasPassenger()
- boolean getFrustumCulling()
- void addViewer(Player)
- **static** List getAnimationsNames(String)
- List getAnimationsNames()
- List getLoot()
- List getLoot(ItemStack)
- **static** List getLoot(LivingEntity, ItemStack)
- Set getMountBones()
- void setFrustumCulling(boolean)
- void stopAnimation()
- **static** Set getNamespacedIdsInRegistry()
- **static** boolean isInRegistry(String)
- **static** boolean hasAnimation(String, String)
- boolean hasAnimation(String)
- boolean setPassenger(LivingEntity, int) throws IllegalArgumentException, IndexOutOfBoundsException
- void destroy()
- void removeViewer(Player)
- void playDamageEffect(boolean)
- void setColorAllBones(int)
- Entity getEntity()
- boolean playAnimation(String, Runnable)
- boolean playAnimation(String)
- **static** CustomEntity spawn(String, Location)
- **static** CustomEntity spawn(String, Location, boolean)
- **static** CustomEntity spawn(String, Location, List, boolean, Consumer)
- **static** CustomEntity spawn(String, Location, boolean, boolean, boolean)
- **static** CustomEntity spawn(String, Location, List, boolean, boolean, boolean, Consumer)
- Set getPassengers()
- String getNamespace()
- EntityType getType()
- boolean hasMountBones()
- **static** boolean isCustomEntity(Entity)
- **static** boolean isCustomEntity(UUID)
- **static** void removePassenger(LivingEntity)
- CustomEntity$MountBone getMountBoneByPassenger(LivingEntity)

### Class: dev.lone.itemsadder.api.CustomEntity$Bone
Type: Class

Methods:
- int getOrdinal()
- Location getLocation()
- void setColor(int)
- String getName()
- boolean getEnchanted()
- int getColor()
- int getId()
- void setEnchanted(boolean)

### Class: dev.lone.itemsadder.api.CustomEntity$MountBone
Type: Class
Extends: dev.lone.itemsadder.api.CustomEntity$Bone

Methods:
- void setCanControl(boolean)
- boolean isLocked()
- boolean setPassenger(LivingEntity)
- LivingEntity getPassenger()
- boolean canControl()
- void removePassenger()
- void setLocked(boolean)

### Class: dev.lone.itemsadder.api.CustomFire
Type: Class
Extends: dev.lone.itemsadder.api.CustomStack

Methods:
- **static** int getAge(Block)
- int getAge()
- Location getLocation()
- **static** CustomFire byItemStack(ItemStack)
- **static** CustomFire place(String, Location)
- CustomFire place(Location)
- **static** CustomFire getInstance(String)
- boolean isPlaced()
- **static** CustomFire byAlreadyPlaced(Block)
- **static** boolean remove(Location)
- boolean remove()
- **static** void setAge(Block, int)
- void setAge(int)

### Class: dev.lone.itemsadder.api.CustomFurniture
Type: Class
Extends: dev.lone.itemsadder.api.CustomStack

Methods:
- **static** CustomFurniture byAlreadySpawned(Entity)
- **static** CustomFurniture byAlreadySpawned(Block)
- void setCurrentLightLevel(int)
- **static** Set getNamespacedIdsInRegistry()
- void setColor(Color)
- **static** CustomFurniture spawn(String, Block)
- void replaceFurniture(String)
- void replaceFurniture(String, Color)
- void teleport(Entity)
- void teleport(Location)
- Entity getArmorstand()
- **static** CustomFurniture spawnPreciseNonSolid(String, Location)
- int getOriginalLightLevel()
- Entity getEntity()
- void remove(boolean)
- **static** void remove(Entity, boolean)

### Class: dev.lone.itemsadder.api.CustomMob
Type: Class

Methods:
- **static** CustomMob byAlreadySpawned(Entity)
- String getName()
- **static** CustomMob spawn(String, Location)
- String getNamespace()
- EntityType getType()
- String getNamespacedID()
- String getId()
- Entity getEntity()

### Class: dev.lone.itemsadder.api.CustomPlayer
Type: Class
Extends: dev.lone.itemsadder.api.CustomEntity

Methods:
- **static** CustomPlayer byAlreadySpawned(Entity)
- boolean playAnimation(String)
- **static** void playEmote(Player, String)
- void stopAnimation()
- **static** CustomPlayer spawn(String, Location)
- String getPlayerName()
- **static** void stopEmote(Player)

### Class: dev.lone.itemsadder.api.CustomStack
Type: Class

Methods:
- boolean drop(Location)
- void updateAttackDamageLore(String)
- void setUsages(int)
- boolean isBlock()
- String getNamespacedID()
- void setMaxDurability(int)
- String getId()
- void setDisplayName(String)
- int getDurability()
- Component itemName()
- void setDurability(int)
- ItemStack getItemStack()
- boolean hasAutoGeneratedModel()
- **static** Set getNamespacedIdsInRegistry()
- String getPermission()
- boolean hasUsagesAttribute()
- **static** boolean isInRegistry(String)
- int getUsages()
- String getModelPath()
- FileConfiguration getConfig()
- boolean isBlockAllEnchants()
- boolean matchNamespacedID(CustomStack)
- **static** CustomStack byItemStack(ItemStack)
- void updateAttackSpeedLore(String)
- String getConfigPath()
- String getDisplayName()
- String getNamespace()
- double getDamageMainhand()
- void setAttributeModifier(String, String, double)
- boolean hasPermission()
- List getTextures()
- int getMaxDurability()
- **static** CustomStack getInstance(String)
- void reduceUsages(int)
- boolean hasCustomDurability()

### Class: dev.lone.itemsadder.api.Examples
Type: Class
Implements: org.bukkit.event.Listener

No public methods found

### Class: dev.lone.itemsadder.api.ItemsAdder
Type: Class

Methods:
- **static** boolean matchCustomItemName(ItemStack, String)
- **static** int getCustomItemDurability(ItemStack)
- **static** boolean isCustomRecipe(NamespacedKey)
- **static** boolean isCustomRecipe(String)
- **static** List getAllItems()
- **static** List getAllItems(String)
- **static** List getAllItems(Material)
- **static** boolean isFurniture(Entity)
- **static** boolean areItemsLoaded()
- **static** List getNamespacedBlocksNamesInConfig(String)
- **static** List getNamespacedBlocksNamesInConfig()
- **static** String getPackUrl(boolean)
- **static** void placeCustomBlock(Location, ItemStack)
- **static** int getCustomItemMaxDurability(ItemStack)
- **static** ItemStack setCustomItemDurability(ItemStack, int)
- **static** ItemStack getCustomBlock(Block)
- **static** String getLiquidName(Location)
- **static** int getCustomItemUsages(ItemStack)
- **static** void removeCustomBlock(Location)
- **static** BlockData getCustomBlockBlockData(ItemStack, boolean)
- **static** void setLiquid(String, Location)
- **static** String getCustomItemName(ItemStack)
- **static** void placeCustomCrop(Location, ItemStack)
- **static** void applyResourcepack(Player)
- **static** boolean hasKeepOnDeath(ItemStack)
- **static** boolean hasKeepOnDeath(String)
- **static** ItemStack getCustomItem(String)
- **static** boolean isCustomItem(ItemStack)
- **static** boolean isCustomItem(String)
- **static** boolean isCustomCrop(Block)
- **static** boolean isCustomBlock(Block)
- **static** String getCustomSeedNameFromCrop(Block)
- **static** ItemStack getCustomBlockByFaces(Material, HashMap)
- **static** ItemStack setCustomItemMaxDurability(ItemStack, int)
- **static** boolean playTotemAnimation(Player, String)
- **static** List getCustomBlockLoot(Block, boolean)
- **static** List getCustomBlockLoot(Block)
- **static** List getCustomBlockLoot(Block, ItemStack, boolean)

### Class: dev.lone.itemsadder.api.ItemsAdder$Advanced
Type: Class

Methods:
- **static** String getItemModelResourceLocation(String)
- **static** BlockData getBlockDataByInternalId(int)
- **static** void injectItemModifier(Plugin, String, ItemsAdder$Advanced$ModifierHandler)
- **static** void injectItemModifier(Plugin, ItemsAdder$Advanced$ModifierHandler)

### Class: dev.lone.itemsadder.api.NotActuallyItemsAdderException
Type: Class
Extends: java.lang.UnsupportedOperationException

No public methods found

## Package: dev.lone.itemsadder.api.Events

### Class: dev.lone.itemsadder.api.Events.CustomBlockBreakEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- Block getBlock()
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- String getNamespacedID()
- **static** HandlerList getHandlerList()
- ItemStack getCustomBlockItem()

### Class: dev.lone.itemsadder.api.Events.CustomBlockInteractEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- BlockFace getBlockFace()
- EquipmentSlot getHand()
- HandlerList getHandlers()
- void setCancelled(boolean)
- String getNamespacedID()
- **static** HandlerList getHandlerList()
- ItemStack getItem()
- ItemStack getCustomBlockItem()
- Action getAction()
- Block getBlockClicked()

### Class: dev.lone.itemsadder.api.Events.CustomBlockPlaceEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- Block getBlock()
- boolean isCancelled()
- Block getPlacedAgainst()
- HandlerList getHandlers()
- void setCancelled(boolean)
- String getNamespacedID()
- **static** HandlerList getHandlerList()
- BlockState getReplacedBlockState()
- ItemStack getCustomBlockItem()
- boolean isCanBuild()
- ItemStack getItemInHand()

### Class: dev.lone.itemsadder.api.Events.CustomEntityDeathEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- String getNamespacedID()
- **static** HandlerList getHandlerList()
- Player getKiller()
- LivingEntity getEntity()

### Class: dev.lone.itemsadder.api.Events.FurnitureBreakEvent
Type: Class
Extends: dev.lone.itemsadder.api.Events.FurnitureEvent
Implements: org.bukkit.event.Cancellable

Methods:
- Entity getBukkitEntity()
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- String getNamespacedID()
- **static** HandlerList getHandlerList()
- CustomFurniture getFurniture()

### Class: dev.lone.itemsadder.api.Events.FurnitureInteractEvent
Type: Class
Extends: dev.lone.itemsadder.api.Events.FurnitureEvent
Implements: org.bukkit.event.Cancellable

Methods:
- Entity getBukkitEntity()
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- String getNamespacedID()
- **static** HandlerList getHandlerList()
- CustomFurniture getFurniture()

### Class: dev.lone.itemsadder.api.Events.FurniturePlaceEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- String getNamespacedID()

### Class: dev.lone.itemsadder.api.Events.FurniturePlaceSuccessEvent
Type: Class
Extends: dev.lone.itemsadder.api.Events.FurnitureEvent

Methods:
- Entity getBukkitEntity()
- HandlerList getHandlers()
- String getNamespacedID()
- **static** HandlerList getHandlerList()
- CustomFurniture getFurniture()

### Class: dev.lone.itemsadder.api.Events.FurniturePlacedEvent
Type: Class
Extends: dev.lone.itemsadder.api.Events.FurnitureEvent
Implements: org.bukkit.event.Cancellable

Methods:
- Entity getBukkitEntity()
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- String getNamespacedID()
- **static** HandlerList getHandlerList()
- CustomFurniture getFurniture()

### Class: dev.lone.itemsadder.api.Events.FurniturePrePlaceEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- Location getLocation()
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- String getNamespacedID()

### Class: dev.lone.itemsadder.api.Events.ItemsAdderFirstLoadEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getMessage()
- void setMessage(String)

### Class: dev.lone.itemsadder.api.Events.ItemsAdderLoadDataEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ItemsAdderLoadDataEvent$Cause getCause()

### Class: dev.lone.itemsadder.api.Events.ItemsAdderLoadDataEvent$Cause
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ItemsAdderLoadDataEvent$Cause valueOf(String)
- **static** ItemsAdderLoadDataEvent$Cause[] values()

### Class: dev.lone.itemsadder.api.Events.ItemsAdderPackCompressedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()

### Class: dev.lone.itemsadder.api.Events.PlayerEmoteEndEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent

Methods:
- HandlerList getHandlers()
- String getEmoteName()
- PlayerEmoteEndEvent$Cause getCause()

### Class: dev.lone.itemsadder.api.Events.PlayerEmoteEndEvent$Cause
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PlayerEmoteEndEvent$Cause valueOf(String)
- **static** PlayerEmoteEndEvent$Cause[] values()

### Class: dev.lone.itemsadder.api.Events.PlayerEmotePlayEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- String getEmoteName()

### Class: dev.lone.itemsadder.api.Events.ResourcePackSendEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent

Methods:
- boolean isItemsAdderPack()
- String getUrl()
- String getHash()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: dev.lone.itemsadder.api.Events.campfire

### Class: dev.lone.itemsadder.api.Events.campfire.CampfireLitEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- Campfire getCampfire()

### Class: dev.lone.itemsadder.api.Events.campfire.CampfirePutItemEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Campfire getCampfire()
- ItemStack getItem()
- void setItem(ItemStack)

### Class: dev.lone.itemsadder.api.Events.campfire.CampfireRemoveItemEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Campfire getCampfire()
- ItemStack getItem()

### Class: dev.lone.itemsadder.api.Events.campfire.CampfireUnlitEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- Campfire getCampfire()

## Package: dev.lone.itemsadder.api.FontImages

### Class: dev.lone.itemsadder.api.FontImages.FontImageWrapper
Type: Class

Methods:
- **static** Set getNamespacedIdsInRegistry()
- **static** FontImageWrapper instance(String)
- int getOffset()
- String getNamespacedID()
- **static** String applyPixelsOffsetToString(String, int)
- TextColor getColor()
- Object getInternal()
- int getWidth()
- String getString()
- int getHeight()
- FontImageWrapper setColor(TextColor)
- FontImageWrapper setColor(ChatColor)
- **static** String replaceFontImages(String)
- **static** Component replaceFontImages(Component)
- **static** String replaceFontImages(Permissible, String)
- **static** Component replaceFontImages(Permissible, Component)
- FontImageWrapper setOffset(int)
- boolean exists()
- **static** Map getNamespacedIdsAndValueInRegistry()
- String applyPixelsOffset(int)

### Class: dev.lone.itemsadder.api.FontImages.PlayerCustomHudWrapper
Type: Class
Extends: dev.lone.itemsadder.api.FontImages.PlayerQuantityHudWrapper

Methods:
- void clearFontImagesAndRefresh()
- int getFontImagesCount()
- void addFontImageToIndex(FontImageWrapper, int)
- void addFontImage(FontImageWrapper)
- void setFontImages(List)
- void removeFontImageByIndex(int)

### Class: dev.lone.itemsadder.api.FontImages.PlayerHudWrapper
Type: Class

Methods:
- void setVisible(boolean)
- void setOffsetX(int)
- int getInitialOffsetX()
- String getNamespacedID()
- boolean exists()
- Object getInternal()
- boolean isVisible()
- int getOffsetX()

### Class: dev.lone.itemsadder.api.FontImages.PlayerHudsHolderWrapper
Type: Class

Methods:
- void sendUpdate()
- Player getPlayer()
- void recalculateOffsets()
- boolean exists()
- Object getInternal()

### Class: dev.lone.itemsadder.api.FontImages.PlayerQuantityHudWrapper
Type: Class
Extends: dev.lone.itemsadder.api.FontImages.PlayerHudWrapper

Methods:
- float getFloatValue()
- void setFloatValue(float)
- Object getInternal()

### Class: dev.lone.itemsadder.api.FontImages.TexturedInventoryWrapper
Type: Class

Methods:
- **static** void setPlayerInventoryTexture(Player, FontImageWrapper, String)
- **static** void setPlayerInventoryTexture(Player, FontImageWrapper)
- **static** void setPlayerInventoryTexture(Player, FontImageWrapper, int)
- **static** void setPlayerInventoryTexture(Player, FontImageWrapper, String, int, int)
- void showInventory(Player)
- Inventory getInternal()

