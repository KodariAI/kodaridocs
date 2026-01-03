# ItemsAdder_4.0.15-dev-lone-itemsadder-api API Reference

**Package Filter:** `dev.lone.itemsadder.api`

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
- **static** boolean remove(Location)
- boolean remove()
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
- CustomEntity$Bone getBone(int)
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
- void internal_changeWrappedCustomEntity(db)
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
- boolean setPassenger(LivingEntity, int)
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
- ov internal()
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
- **static** CustomStack fromInternal(ov)
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
Implements: itemsadder.m.ab

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

### Class: dev.lone.itemsadder.api.ItemsAdder$Advanced$InjectedItemModifier
Type: Class

Constructors:
- ItemsAdder$Advanced$InjectedItemModifier(String owner, String item, ItemsAdder$Advanced$ModifierHandler handler)

Methods:
- void call(String, ItemStack)

## Package: dev.lone.itemsadder.api.Events

### Class: dev.lone.itemsadder.api.Events.CustomBlockBreakEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- CustomBlockBreakEvent(Player, Block block, ou internal)

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

Constructors:
- CustomBlockInteractEvent(Player, Action action, ItemStack item, Block blockClicked, BlockFace blockFace, EquipmentSlot hand, ou internal)

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

Constructors:
- CustomBlockPlaceEvent(Player, Block block, ou internal, boolean canBuild, Block placedAgainst, BlockState replacedBlockState, ItemStack itemInHand)
- CustomBlockPlaceEvent(BlockPlaceEvent canBuild, ou internal)

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

Constructors:
- CustomEntityDeathEvent(LivingEntity entity, db internal)

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

Constructors:
- FurnitureInteractEvent(Player, Entity, ij isCancelled)

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

Constructors:
- FurniturePlaceEvent(Player, ij internal)

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
- **static** HandlerList getHandlerList()
- String getNamespacedID()
- CustomFurniture getFurniture()

### Class: dev.lone.itemsadder.api.Events.FurniturePlacedEvent
Type: Class
Extends: dev.lone.itemsadder.api.Events.FurnitureEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- FurniturePlacedEvent(Player, Entity, ij internal)

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

Constructors:
- FurniturePrePlaceEvent(Player, ij internal, Location location)

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

Constructors:
- ItemsAdderLoadDataEvent(boolean cause)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ItemsAdderLoadDataEvent$Cause getCause()

### Class: dev.lone.itemsadder.api.Events.ItemsAdderLoadDataEvent$Cause
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FIRST_LOAD
- RELOAD

Methods:
- **static** ItemsAdderLoadDataEvent$Cause valueOf(String)
- **static** ItemsAdderLoadDataEvent$Cause[] values()

### Class: dev.lone.itemsadder.api.Events.ItemsAdderPackCompressedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: dev.lone.itemsadder.api.Events.PlayerEmoteEndEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent

Constructors:
- PlayerEmoteEndEvent(Player, String emoteName, PlayerEmoteEndEvent$Cause cause)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getEmoteName()
- PlayerEmoteEndEvent$Cause getCause()

### Class: dev.lone.itemsadder.api.Events.PlayerEmoteEndEvent$Cause
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- STOP
- FINISHED

Methods:
- **static** PlayerEmoteEndEvent$Cause valueOf(String)
- **static** PlayerEmoteEndEvent$Cause[] values()

### Class: dev.lone.itemsadder.api.Events.PlayerEmotePlayEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- PlayerEmotePlayEvent(Player, String emoteName)

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- String getEmoteName()

### Class: dev.lone.itemsadder.api.Events.ResourcePackSendEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent

Constructors:
- ResourcePackSendEvent(Player, String url, String hash, boolean isItemsAdderPack)

Methods:
- boolean isItemsAdderPack()
- String getUrl()
- String getHash()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: dev.lone.itemsadder.api.FontImages

### Class: dev.lone.itemsadder.api.FontImages.FontImageWrapper
Type: Class

Constructors:
- FontImageWrapper(String internal)

Methods:
- **static** Set getNamespacedIdsInRegistry()
- **static** FontImageWrapper instance(String)
- int getOffset()
- String getNamespacedID()
- **static** String applyPixelsOffsetToString(String, int)
- TextColor getColor()
- eo getInternal()
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
- String internalGetUnicode()
- String applyPixelsOffset(int)

### Class: dev.lone.itemsadder.api.FontImages.PlayerCustomHudWrapper
Type: Class
Extends: dev.lone.itemsadder.api.FontImages.PlayerQuantityHudWrapper

Constructors:
- PlayerCustomHudWrapper(PlayerHudsHolderWrapper, String internalCustomHud)

Methods:
- void clearFontImagesAndRefresh()
- int getFontImagesCount()
- void addFontImageToIndex(FontImageWrapper, int)
- void addFontImage(FontImageWrapper)
- void setFontImages(List)
- void removeFontImageByIndex(int)

### Class: dev.lone.itemsadder.api.FontImages.PlayerHudWrapper
Type: Class

Constructors:
- PlayerHudWrapper(PlayerHudsHolderWrapper playerHUDsHolderWrapper, String internal)

Methods:
- void setVisible(boolean)
- void setOffsetX(int)
- int getInitialOffsetX()
- String getNamespacedID()
- boolean exists()
- ha getInternal()
- boolean isVisible()
- int getOffsetX()

### Class: dev.lone.itemsadder.api.FontImages.PlayerHudsHolderWrapper
Type: Class

Constructors:
- PlayerHudsHolderWrapper(Player player)

Methods:
- void sendUpdate()
- Player getPlayer()
- void recalculateOffsets()
- boolean exists()
- hx getInternal()

### Class: dev.lone.itemsadder.api.FontImages.PlayerQuantityHudWrapper
Type: Class
Extends: dev.lone.itemsadder.api.FontImages.PlayerHudWrapper

Constructors:
- PlayerQuantityHudWrapper(PlayerHudsHolderWrapper, String warnedAboutApiPermission)

Methods:
- float getFloatValue()
- void setFloatValue(float)
- hb getInternal()
- ha getInternal()

### Class: dev.lone.itemsadder.api.FontImages.TexturedInventoryWrapper
Type: Class

Constructors:
- TexturedInventoryWrapper(InventoryHolder, InventoryType internal, String, FontImageWrapper, int component, int component)
- TexturedInventoryWrapper(InventoryHolder, int internal, String, FontImageWrapper, int component, int component)

Methods:
- **static** void setPlayerInventoryTexture(Player, FontImageWrapper, String)
- **static** void setPlayerInventoryTexture(Player, FontImageWrapper)
- **static** void setPlayerInventoryTexture(Player, FontImageWrapper, int)
- **static** void setPlayerInventoryTexture(Player, FontImageWrapper, String, int, int)
- void showInventory(Player)
- Inventory getInternal()

## Package: dev.lone.itemsadder.api.Skript

### Class: dev.lone.itemsadder.api.Skript.SkriptManager
Type: Class

Methods:
- void init(JavaPlugin)
- SkriptAddon getAddonInstance()

## Package: dev.lone.itemsadder.api.Skript.implementation.expressions

### Class: dev.lone.itemsadder.api.Skript.implementation.expressions.ExprGetCustomItem
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- boolean init(Expression[], int, Kleenean, SkriptParser$ParseResult)
- Class getReturnType()
- String toString(Event, boolean)

### Class: dev.lone.itemsadder.api.Skript.implementation.expressions.ExprGetFontImage
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- boolean init(Expression[], int, Kleenean, SkriptParser$ParseResult)
- Class getReturnType()
- boolean isSingle()
- String toString(Event, boolean)

### Class: dev.lone.itemsadder.api.Skript.implementation.expressions.ExprIsCustomItem
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- boolean init(Expression[], int, Kleenean, SkriptParser$ParseResult)
- String toString(Event, boolean)
- boolean check(Event)

## Package: dev.lone.itemsadder.api.scriptinginternal

### Class: dev.lone.itemsadder.api.scriptinginternal.EntityScript
Type: Class

Methods:
- void handleEvent(Plugin, Event, Player, CustomEntity)

### Class: dev.lone.itemsadder.api.scriptinginternal.EntityUtils
Type: Class

Methods:
- **static** void setDataInt(Entity, String, String, int)
- **static** void setDataFloat(Entity, String, String, float)
- **static** long getDataLong(Entity, String, String, long)
- **static** boolean hasData(Entity, String, String)
- **static** short getDataShort(Entity, String, String, short)
- **static** String getDataString(Entity, String, String, String)
- **static** double getDataDouble(Entity, String, String, double)
- **static** void setDataDouble(Entity, String, String, double)
- **static** void setDataLong(Entity, String, String, long)
- **static** void setDataByte(Entity, String, String, byte)
- **static** void setDataShort(Entity, String, String, short)
- **static** void setDataBool(Entity, String, String, boolean)
- **static** float getDataFloat(Entity, String, String, float)
- **static** int getDataInt(Entity, String, String, int)
- **static** byte getDataByte(Entity, String, String, byte)
- **static** void removeData(Entity, String, String)
- **static** boolean getDataBool(Entity, String, String, boolean)
- **static** void setDataString(Entity, String, String, String)

### Class: dev.lone.itemsadder.api.scriptinginternal.ItemScript
Type: Class

Methods:
- void handleEvent(Plugin, Event, Player, CustomStack, ItemStack)

### Class: dev.lone.itemsadder.api.scriptinginternal.ItemsUtils
Type: Class

Methods:
- **static** void setDataInt(ItemStack, String, String, int)
- **static** void setDataInt(CustomStack, String, String, int)
- **static** void setDataFloat(ItemStack, String, String, float)
- **static** void setDataFloat(CustomStack, String, String, float)
- **static** long getDataLong(ItemStack, String, String, long)
- **static** long getDataLong(CustomStack, String, String, long)
- **static** boolean hasData(ItemStack, String, String)
- **static** boolean hasData(CustomStack, String, String)
- **static** ItemStack newStack(Material)
- **static** ItemStack newStack(Material, int)
- **static** short getDataShort(ItemStack, String, String, short)
- **static** short getDataShort(CustomStack, String, String, short)
- **static** String getDataString(ItemStack, String, String, String)
- **static** String getDataString(CustomStack, String, String, String)
- **static** double getDataDouble(ItemStack, String, String, double)
- **static** double getDataDouble(CustomStack, String, String, double)
- **static** CustomStack customStack(String)
- **static** CustomStack customStack(String, int)
- **static** boolean isCustom(ItemStack)
- **static** void setDataDouble(ItemStack, String, String, double)
- **static** void setDataDouble(CustomStack, String, String, double)
- **static** void setDataLong(ItemStack, String, String, long)
- **static** void setDataLong(CustomStack, String, String, long)
- **static** void setDataByte(ItemStack, String, String, byte)
- **static** void setDataByte(CustomStack, String, String, byte)
- **static** void setDataShort(ItemStack, String, String, short)
- **static** void setDataShort(CustomStack, String, String, short)
- **static** void setDataBool(ItemStack, String, String, boolean)
- **static** void setDataBool(CustomStack, String, String, boolean)
- **static** float getDataFloat(ItemStack, String, String, float)
- **static** float getDataFloat(CustomStack, String, String, float)
- **static** int getDataInt(ItemStack, String, String, int)
- **static** int getDataInt(CustomStack, String, String, int)
- **static** byte getDataByte(ItemStack, String, String, byte)
- **static** byte getDataByte(CustomStack, String, String, byte)
- **static** void removeData(ItemStack, String, String)
- **static** boolean getDataBool(ItemStack, String, String, boolean)
- **static** boolean getDataBool(CustomStack, String, String, boolean)
- **static** void setDataString(ItemStack, String, String, String)
- **static** void setDataString(CustomStack, String, String, String)

### Class: dev.lone.itemsadder.api.scriptinginternal.PlayerUtils
Type: Class

Methods:
- **static** boolean removeItem(Player, String)
- **static** boolean giveItem(Player, String)
- **static** Entity entityInFront(Player)
- **static** Entity entityInFront(Player, int)
- **static** Block blockInFront(Player)
- **static** Block blockInFront(Player, int)
- **static** boolean isHeld(Player, String)
- **static** boolean isHeld(Player, CustomStack)
- **static** boolean isHeld(Player, Material)
- **static** boolean setHeld(Player, String)

### Class: dev.lone.itemsadder.api.scriptinginternal.ScriptingUtils
Type: Class

Methods:
- **static** void setDataInt(PersistentDataContainer, String, String, int)
- **static** void msg(Player, String, boolean)
- **static** void msg(Player, String)
- **static** void msg(Player, Component)
- **static** void setDataFloat(PersistentDataContainer, String, String, float)
- **static** long getDataLong(PersistentDataContainer, String, String, long)
- **static** void log(String)
- **static** boolean hasData(PersistentDataContainer, String, String)
- **static** short getDataShort(PersistentDataContainer, String, String, short)
- **static** void _runDelayed(long, Runnable)
- **static** String getDataString(PersistentDataContainer, String, String, String)
- **static** double getDataDouble(PersistentDataContainer, String, String, double)
- **static** Object cast(Class, Object)
- **static** void setDataDouble(PersistentDataContainer, String, String, double)
- **static** void setDataLong(PersistentDataContainer, String, String, long)
- **static** void setDataByte(PersistentDataContainer, String, String, byte)
- **static** void setDataShort(PersistentDataContainer, String, String, short)
- **static** void setDataBool(PersistentDataContainer, String, String, boolean)
- **static** float getDataFloat(PersistentDataContainer, String, String, float)
- **static** int getDataInt(PersistentDataContainer, String, String, int)
- **static** byte getDataByte(PersistentDataContainer, String, String, byte)
- **static** void removeData(PersistentDataContainer, String, String)
- **static** boolean getDataBool(PersistentDataContainer, String, String, boolean)
- **static** void setDataString(PersistentDataContainer, String, String, String)

### Class: dev.lone.itemsadder.api.scriptinginternal.WorldUtils
Type: Class

Methods:
- **static** long getDataLong(Block, String, String, long)
- **static** void playParticle(Location, String)
- **static** void playParticle(Location, String, int)
- **static** void playParticle(World, double, double, double, String, int, double, double, double, double)
- **static** void playParticle(Location, String, int, double, double, double, double)
- **static** void removeBlock(Block)
- **static** String getDataString(Block, String, String, String)
- **static** void placeBlock(Block, Material)
- **static** boolean placeBlock(Block, String)
- **static** void placeBlock(Block, CustomBlock)
- **static** double getDataDouble(Block, String, String, double)
- **static** void playSound(Location, String)
- **static** void playSound(Location, String, float, float)
- **static** void setDataShort(Block, String, String, short)
- **static** Block block(String, int, int, int)
- **static** Block block(World, int, int, int)
- **static** Block block(Location)
- **static** void setDataBool(Block, String, String, boolean)
- **static** boolean getDataBool(Block, String, String, boolean)
- **static** void setDataString(Block, String, String, String)
- **static** void setDataInt(Block, String, String, int)
- **static** void setDataFloat(Block, String, String, float)
- **static** boolean hasData(Block, String, String)
- **static** short getDataShort(Block, String, String, short)
- **static** CustomBlock customBlock(Block)
- **static** CustomBlock customBlock(Location)
- **static** void breakBlockNaturally(Player, int, int, int)
- **static** void breakBlockNaturally(Player, Block)
- **static** void breakBlockNaturally(Block)
- **static** boolean isCustom(Block)
- **static** void setDataDouble(Block, String, String, double)
- **static** void setDataLong(Block, String, String, long)
- **static** void setDataByte(Block, String, String, byte)
- **static** Location location(String, int, int, int)
- **static** float getDataFloat(Block, String, String, float)
- **static** int getDataInt(Block, String, String, int)
- **static** byte getDataByte(Block, String, String, byte)
- **static** void removeData(Block, String, String)

