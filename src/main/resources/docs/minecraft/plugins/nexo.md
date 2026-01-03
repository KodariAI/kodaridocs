# nexo-1.17-dev-68927108-com-nexomc-nexo-api API Reference

**Package Filter:** `com.nexomc.nexo.api`

## Package: com.nexomc.nexo.api

### Class: com.nexomc.nexo.api.NexoBlocks
Type: Class

Methods:
- **static** boolean isNexoChorusBlock(Block block)
- **static** boolean isNexoChorusBlock(String itemID)
- **static** boolean isNexoStringBlock(Block block)
- **static** boolean isNexoStringBlock(String itemID)
- **static** String[] stringBlockIDs()
- **static** boolean isNexoNoteBlock(Block block)
- **static** boolean isNexoNoteBlock(String itemID)
- **static** boolean isNexoNoteBlock(ItemStack item)
- **static** String[] blockIDs()
- **static** NoteBlockMechanic noteBlockMechanic(BlockData data)
- **static** NoteBlockMechanic noteBlockMechanic(Block block)
- **static** NoteBlockMechanic noteBlockMechanic(String itemID)
- **static** boolean remove(Location location, Player player, boolean forceDrop)
- **static** boolean remove(Location location, Player player, Drop overrideDrop)
- **static** boolean remove(Location location, Player player)
- **static** boolean remove(Location location)
- **static** BlockData blockData(String itemID)
- **static** StringBlockMechanic stringMechanic(BlockData blockData)
- **static** StringBlockMechanic stringMechanic(Block block)
- **static** StringBlockMechanic stringMechanic(String itemID)
- **static** CustomBlockMechanic customBlockMechanic(Location location)
- **static** CustomBlockMechanic customBlockMechanic(Block block)
- **static** CustomBlockMechanic customBlockMechanic(BlockData blockData)
- **static** CustomBlockMechanic customBlockMechanic(String itemID)
- **static** boolean isCustomBlock(Block block)
- **static** boolean isCustomBlock(ItemStack itemStack)
- **static** boolean isCustomBlock(String itemId)
- **static** String[] chorusBlockIDs()
- **static** boolean remove$default(Location, Player, boolean, int, Object)
- **static** boolean remove$default(Location, Player, Drop, int, Object)
- **static** void place(String itemID, Location location)
- **static** ChorusBlockMechanic chorusBlockMechanic(BlockData blockData)
- **static** ChorusBlockMechanic chorusBlockMechanic(Block block)
- **static** ChorusBlockMechanic chorusBlockMechanic(String itemID)
- **static** String[] noteBlockIDs()

### Class: com.nexomc.nexo.api.NexoBlocks$WhenMappings
Type: Class

No public methods found

### Class: com.nexomc.nexo.api.NexoFurniture
Type: Class

Methods:
- **static** Color furnitureDye(ItemDisplay baseEntity)
- **static** void furnitureDye(ItemDisplay baseEntity, Color dyeColor)
- **static** void updateFurniture(ItemDisplay baseEntity)
- **static** boolean isFurniture(Location location)
- **static** boolean isFurniture(String itemID)
- **static** boolean isFurniture(ItemStack itemStack)
- **static** boolean isFurniture(Entity entity)
- **static** ItemDisplay findTargetFurniture(Player player)
- **static** FurnitureMechanic furnitureMechanic(Block block)
- **static** FurnitureMechanic furnitureMechanic(Location location)
- **static** FurnitureMechanic furnitureMechanic(Entity baseEntity)
- **static** FurnitureMechanic furnitureMechanic(String itemID)
- **static** FurnitureMechanic furnitureMechanic(ItemStack itemStack)
- **static** boolean remove(Location location, Player player, Drop drop)
- **static** boolean remove(Entity baseEntity, Player player, Drop drop)
- **static** boolean remove(Location location, Player player)
- **static** boolean remove(Location location)
- **static** boolean remove(Entity baseEntity, Player player)
- **static** boolean remove(Entity baseEntity)
- **static** String[] furnitureIDs()
- **static** void convertFurniture(ItemDisplay baseEntity)
- **static** boolean toggleLight$default(ItemDisplay, Boolean, FurnitureMechanic, int, Object)
- **static** boolean lightState(ItemDisplay baseEntity)
- **static** boolean toggleLight(ItemDisplay baseEntity, Boolean state, FurnitureMechanic mechanic)
- **static** boolean toggleLight(ItemDisplay baseEntity, Boolean state)
- **static** boolean toggleLight(ItemDisplay baseEntity)
- **static** boolean remove$default(Location, Player, Drop, int, Object)
- **static** boolean remove$default(Entity, Player, Drop, int, Object)
- **static** ItemDisplay place(String itemID, Location location, Rotation rotation, BlockFace blockFace)
- **static** ItemDisplay place(String itemID, Location location, float yaw, BlockFace blockFace)
- **static** ItemStack furnitureItem(ItemDisplay baseEntity)
- **static** void furnitureItem(ItemDisplay baseEntity, ItemStack itemStack)
- **static** ItemDisplay baseEntity(Block block)
- **static** ItemDisplay baseEntity(Location location)
- **static** ItemDisplay baseEntity(int interactionId)

### Class: com.nexomc.nexo.api.NexoFurniture$furnitureMechanic$lambda$7$$inlined$sortedBy$1
Type: Class
Implements: java.util.Comparator

Constructors:
- NexoFurniture$furnitureMechanic$lambda$7$$inlined$sortedBy$1(Location $centerLoc$inlined)

Methods:
- I compare(T a, T b)

### Class: com.nexomc.nexo.api.NexoItems
Type: Class

Methods:
- Map<String, Pair<File, ConfigurationSection>> getItemConfigCache()
- **static** void unregisterUpdateCallback(Key key)
- V setItemMap$core(Object2ObjectLinkedOpenHashMap<File, Object2ObjectLinkedOpenHashMap<String, ItemBuilder>> <set-?>)
- V setItems$core(ObjectLinkedOpenHashSet<ItemBuilder> <set-?>)
- Object2ObjectLinkedOpenHashMap<String, ItemBuilder> getEntries$core()
- **static** String idFromItem(ItemBuilder item)
- **static** String idFromItem(ItemStack item)
- V setEntries$core(Object2ObjectLinkedOpenHashMap<String, ItemBuilder> <set-?>)
- **static** Set<String> itemNames()
- Object2ObjectLinkedOpenHashMap<File, Object2ObjectLinkedOpenHashMap<String, ItemBuilder>> getItemMap$core()
- ObjectLinkedOpenHashSet<ItemBuilder> getItems$core()
- **static** boolean hasMechanic(String itemID, String mechanicID)
- **static** boolean isSameId(ItemStack firstStack, ItemStack secondStack)
- **static** ItemBuilder builderFromItem(ItemStack item)
- Map<Key, UpdateCallback> getUpdateCallbacks$core()
- **static** void loadItems()
- **static** Map<File, Map<String, ItemBuilder>> itemMap()
- **static** ItemStack updateItem(ItemStack item)
- Object2ObjectLinkedOpenHashMap<File, ObjectArrayList<ItemBuilder>> getUnexcludedItems$core()
- **static** Map<String, ItemBuilder> entries()
- **static** Optional<ItemBuilder> optionalItemFromId(String id)
- NamespacedKey getITEM_ID()
- **static** List<ItemBuilder> unexcludedItems(File file)
- ObjectLinkedOpenHashSet<String> getItemNames$core()
- **static** ItemBuilder itemFromId(String id)
- V setItemNames$core(ObjectLinkedOpenHashSet<String> <set-?>)
- **static** void registerUpdateCallback(Key key, UpdateCallback callback)
- **static** V registerUpdateCallback(Key key, Function1<ItemStack, ItemStack> preUpdate, Function1<ItemStack, ItemStack> postUpdate)
- **static** boolean exists(String itemId)
- **static** boolean exists(ItemStack itemStack)
- **static** String[] unexcludedItemNames()
- void reloadItem(String itemId)
- **static** Set<ItemBuilder> items()

### Class: com.nexomc.nexo.api.NexoItems$registerUpdateCallback$1
Type: Class
Implements: com.nexomc.nexo.items.UpdateCallback

Methods:
- ItemStack postUpdate(ItemStack itemStack)
- ItemStack preUpdate(ItemStack itemStack)

### Class: com.nexomc.nexo.api.NexoPack
Type: Class

Methods:
- **static** ResourcePack resourcePack()
- **static** BuiltResourcePack builtResourcePack()
- **static** boolean isEmpty(ResourceContainer resourcePack)
- **static** void overwritePack(ResourcePack resourcePack, ResourcePack overwritePack)
- **static** void mergePack(ResourcePack resourcePack, ResourcePack importedPack)
- **static** void sendPack(Player player)
- **static** void clearPack(ResourcePack resourcePack)
- **static** void mergePackFromDirectory(File directory)
- **static** void mergePackFromZip(File zipFile)

## Package: com.nexomc.nexo.api.events

### Class: com.nexomc.nexo.api.events.NexoItemsLoadedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: com.nexomc.nexo.api.events.NexoItemsLoadedEvent$Companion
Type: Class

Constructors:
- NexoItemsLoadedEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.NexoMechanicsRegisteredEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: com.nexomc.nexo.api.events.NexoMechanicsRegisteredEvent$Companion
Type: Class

Constructors:
- NexoMechanicsRegisteredEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

## Package: com.nexomc.nexo.api.events.custom_block

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockBreakEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NexoBlockBreakEvent(CustomBlockMechanic mechanic, Block block, Player player)
- NexoBlockBreakEvent(NoteBlockMechanic mechanic, Block block, Player player, Drop drop)

Methods:
- boolean isCancelled()
- Player getPlayer()
- Block getBlock()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- void setDrop(Drop <set-?>)
- Drop getDrop()
- CustomBlockMechanic getMechanic()
- **static** HandlerList access$getHANDLERS$cp()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockBreakEvent$Companion
Type: Class

Constructors:
- NexoBlockBreakEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockDamageEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NexoBlockDamageEvent(CustomBlockMechanic mechanic, Block block, Player player)

Methods:
- boolean isCancelled()
- Player getPlayer()
- Block getBlock()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- CustomBlockMechanic getMechanic()
- **static** HandlerList access$getHANDLERS$cp()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockDamageEvent$Companion
Type: Class

Constructors:
- NexoBlockDamageEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockInteractEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NexoBlockInteractEvent(CustomBlockMechanic mechanic, Player player, ItemStack itemInHand, EquipmentSlot hand, Block block, BlockFace blockFace, Action action)

Methods:
- boolean isCancelled()
- Block getBlock()
- Player getPlayer()
- BlockFace getBlockFace()
- EquipmentSlot getHand()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- Action getAction()
- CustomBlockMechanic getMechanic()
- **static** HandlerList access$getHANDLERS$cp()
- ItemStack getItemInHand()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockInteractEvent$Companion
Type: Class

Constructors:
- NexoBlockInteractEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockPlaceEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NexoBlockPlaceEvent(CustomBlockMechanic mechanic, Block block, Player player, ItemStack itemInHand, EquipmentSlot hand)

Methods:
- boolean isCancelled()
- Player getPlayer()
- Block getBlock()
- EquipmentSlot getHand()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- CustomBlockMechanic getMechanic()
- **static** HandlerList access$getHANDLERS$cp()
- ItemStack getItemInHand()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockPlaceEvent$Companion
Type: Class

Constructors:
- NexoBlockPlaceEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()

### Class: com.nexomc.nexo.api.events.custom_block.NexoCustomBlockDropLootEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- NexoCustomBlockDropLootEvent(CustomBlockMechanic mechanic, Block block, Player player, List<DroppedLoot> loots)

Methods:
- Player getPlayer()
- Block getBlock()
- HandlerList getHandlers()
- List<DroppedLoot> getLoots()
- **static** HandlerList getHandlerList()
- CustomBlockMechanic getMechanic()
- **static** HandlerList access$getHANDLERS$cp()

### Class: com.nexomc.nexo.api.events.custom_block.NexoCustomBlockDropLootEvent$Companion
Type: Class

Constructors:
- NexoCustomBlockDropLootEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()

## Package: com.nexomc.nexo.api.events.custom_block.chorusblock

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockBreakEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockBreakEvent

Constructors:
- NexoChorusBlockBreakEvent(ChorusBlockMechanic mechanic, Block block, Player player)
- NexoChorusBlockBreakEvent(ChorusBlockMechanic mechanic, Block block, Player player, Drop drop)

Methods:
- ChorusBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockDamageEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockDamageEvent

Constructors:
- NexoChorusBlockDamageEvent(ChorusBlockMechanic mechanic, Block block, Player player)

Methods:
- ChorusBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockDropLootEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoCustomBlockDropLootEvent

Constructors:
- NexoChorusBlockDropLootEvent(ChorusBlockMechanic mechanic, Block block, Player player, List<DroppedLoot> loots)

Methods:
- ChorusBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockInteractEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockInteractEvent

Constructors:
- NexoChorusBlockInteractEvent(ChorusBlockMechanic mechanic, Player player, ItemStack itemInHand, EquipmentSlot hand, Block block, BlockFace blockFace, Action action)

Methods:
- ChorusBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockPlaceEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockPlaceEvent

Constructors:
- NexoChorusBlockPlaceEvent(ChorusBlockMechanic mechanic, Block block, Player player, ItemStack itemInHand, EquipmentSlot hand)

Methods:
- ChorusBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

## Package: com.nexomc.nexo.api.events.custom_block.noteblock

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockBreakEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockBreakEvent

Constructors:
- NexoNoteBlockBreakEvent(NoteBlockMechanic mechanic, Block block, Player player)
- NexoNoteBlockBreakEvent(NoteBlockMechanic mechanic, Block block, Player player, Drop drop)

Methods:
- NoteBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockDamageEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockDamageEvent

Constructors:
- NexoNoteBlockDamageEvent(NoteBlockMechanic mechanic, Block block, Player player)

Methods:
- NoteBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockDropLootEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoCustomBlockDropLootEvent

Constructors:
- NexoNoteBlockDropLootEvent(NoteBlockMechanic mechanic, Block block, Player player, List<DroppedLoot> loots)

Methods:
- NoteBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockInteractEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockInteractEvent

Constructors:
- NexoNoteBlockInteractEvent(NoteBlockMechanic mechanic, Player player, ItemStack itemInHand, EquipmentSlot hand, Block block, BlockFace blockFace, Action action)

Methods:
- NoteBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockPlaceEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockPlaceEvent

Constructors:
- NexoNoteBlockPlaceEvent(NoteBlockMechanic mechanic, Block block, Player player, ItemStack itemInHand, EquipmentSlot hand)

Methods:
- NoteBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

## Package: com.nexomc.nexo.api.events.custom_block.stringblock

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockBreakEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockBreakEvent

Constructors:
- NexoStringBlockBreakEvent(StringBlockMechanic mechanic, Block block, Player player)
- NexoStringBlockBreakEvent(StringBlockMechanic mechanic, Block block, Player player, Drop drop)

Methods:
- StringBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockDamageEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockDamageEvent

Constructors:
- NexoStringBlockDamageEvent(StringBlockMechanic mechanic, Block block, Player player)

Methods:
- StringBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockDropLootEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoCustomBlockDropLootEvent

Constructors:
- NexoStringBlockDropLootEvent(StringBlockMechanic mechanic, Block block, Player player, List<DroppedLoot> loots)

Methods:
- StringBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockInteractEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockInteractEvent

Constructors:
- NexoStringBlockInteractEvent(StringBlockMechanic mechanic, Player player, ItemStack itemInHand, EquipmentSlot hand, Block block, BlockFace blockFace, Action action)

Methods:
- StringBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockPlaceEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockPlaceEvent

Constructors:
- NexoStringBlockPlaceEvent(StringBlockMechanic mechanic, Block block, Player player, ItemStack itemInHand, EquipmentSlot hand)

Methods:
- StringBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

## Package: com.nexomc.nexo.api.events.furniture

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureBreakEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NexoFurnitureBreakEvent(FurnitureMechanic mechanic, ItemDisplay baseEntity, Player player)

Methods:
- ItemDisplay getBaseEntity()
- boolean isCancelled()
- Player getPlayer()
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- void setDrop(Drop <set-?>)
- Drop getDrop()
- FurnitureMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureBreakEvent$Companion
Type: Class

Constructors:
- NexoFurnitureBreakEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureDamageEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NexoFurnitureDamageEvent(FurnitureMechanic mechanic, ItemDisplay baseEntity, Player player)

Methods:
- ItemDisplay getBaseEntity()
- boolean isCancelled()
- Player getPlayer()
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- FurnitureMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureDamageEvent$Companion
Type: Class

Constructors:
- NexoFurnitureDamageEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureInteractEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NexoFurnitureInteractEvent(FurnitureMechanic mechanic, ItemDisplay baseEntity, Player player, ItemStack itemInHand, EquipmentSlot hand, Location interactionPoint, Event$Result useFurniture, Event$Result useItemInHand, BlockFace blockFace)
- NexoFurnitureInteractEvent(FurnitureMechanic mechanic, ItemDisplay baseEntity, Player player, ItemStack itemInHand, EquipmentSlot hand, Location interactionPoint, Event$Result useFurniture, Event$Result useItemInHand)
- NexoFurnitureInteractEvent(FurnitureMechanic mechanic, ItemDisplay baseEntity, Player player, ItemStack itemInHand, EquipmentSlot hand, Location interactionPoint, Event$Result useFurniture)
- NexoFurnitureInteractEvent(FurnitureMechanic mechanic, ItemDisplay baseEntity, Player player, ItemStack itemInHand, EquipmentSlot hand, Location interactionPoint)
- NexoFurnitureInteractEvent(FurnitureMechanic mechanic, ItemDisplay baseEntity, Player player, ItemStack itemInHand, EquipmentSlot hand)

Methods:
- ItemDisplay getBaseEntity()
- Player getPlayer()
- Location getInteractionPoint()
- Event$Result getUseItemInHand()
- **static** HandlerList getHandlerList()
- void setCanRunAction(Event$Result <set-?>)
- void setCanOpenStorage(Event$Result <set-?>)
- Event$Result getUseFurniture()
- **static** HandlerList access$getHandlerList$cp()
- Event$Result getCanRunAction()
- void setUseFurniture(Event$Result <set-?>)
- void setCanToggleLight(Event$Result <set-?>)
- FurnitureMechanic getMechanic()
- Event$Result getCanToggleLight()
- ItemStack getItemInHand()
- boolean isCancelled()
- Event$Result getCanOpenStorage()
- EquipmentSlot getHand()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- BlockFace getBlockFace()
- void setCanSleep(Event$Result <set-?>)
- Event$Result getCanSit()
- void setCanSit(Event$Result <set-?>)
- Event$Result getCanRotate()
- Event$Result getCanSleep()
- void setCanRotate(Event$Result <set-?>)
- void setUseItemInHand(Event$Result <set-?>)

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureInteractEvent$Companion
Type: Class

Constructors:
- NexoFurnitureInteractEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurniturePlaceEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NexoFurniturePlaceEvent(FurnitureMechanic mechanic, Block block, ItemDisplay baseEntity, Player player, ItemStack itemInHand, EquipmentSlot hand)

Methods:
- ItemDisplay getBaseEntity()
- boolean isCancelled()
- Player getPlayer()
- Block getBlock()
- **static** HandlerList access$getHandlerList$cp()
- EquipmentSlot getHand()
- HandlerList getHandlers()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- FurnitureMechanic getMechanic()
- ItemStack getItemInHand()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurniturePlaceEvent$Companion
Type: Class

Constructors:
- NexoFurniturePlaceEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

## Package: com.nexomc.nexo.api.events.resourcepack

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPackUploadEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- NexoPackUploadEvent(String hash, String url)

Methods:
- String getUrl()
- String getHash()
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPackUploadEvent$Companion
Type: Class

Constructors:
- NexoPackUploadEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPostPackGenerateEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- NexoPostPackGenerateEvent(ResourcePack resourcePack)

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ResourcePack getResourcePack()
- boolean addResourcePack(ResourcePack resourcePack)
- boolean addResourcePack(File resourcePack)
- boolean addUnknownFile(String path, byte[] data)

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPostPackGenerateEvent$Companion
Type: Class

Constructors:
- NexoPostPackGenerateEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPrePackGenerateEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- NexoPrePackGenerateEvent(ResourcePack resourcePack)

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ResourcePack getResourcePack()
- boolean addResourcePack(ResourcePack resourcePack)
- boolean addResourcePack(File resourcePack)
- boolean addUnknownFile(String path, byte[] data)

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPrePackGenerateEvent$Companion
Type: Class

Constructors:
- NexoPrePackGenerateEvent$Companion(DefaultConstructorMarker $constructor_marker)

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

