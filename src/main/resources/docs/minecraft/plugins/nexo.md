# nexo-1.10.0-com-nexomc-nexo-api API Reference

**Package Filter:** `com.nexomc.nexo.api`

## Package: com.nexomc.nexo.api

### Class: com.nexomc.nexo.api.NexoBlocks
Type: Class

Methods:
- **static** boolean isNexoChorusBlock(Block)
- **static** boolean isNexoChorusBlock(String)
- **static** boolean isNexoStringBlock(Block)
- **static** boolean isNexoStringBlock(String)
- **static** String[] stringBlockIDs()
- **static** boolean isNexoNoteBlock(Block)
- **static** boolean isNexoNoteBlock(String)
- **static** boolean isNexoNoteBlock(ItemStack)
- **static** String[] blockIDs()
- **static** NoteBlockMechanic noteBlockMechanic(BlockData)
- **static** NoteBlockMechanic noteBlockMechanic(Block)
- **static** NoteBlockMechanic noteBlockMechanic(String)
- **static** boolean remove(Location, Player, boolean)
- **static** boolean remove(Location, Player, Drop)
- **static** boolean remove(Location, Player)
- **static** boolean remove(Location)
- **static** BlockData blockData(String)
- **static** StringBlockMechanic stringMechanic(BlockData)
- **static** StringBlockMechanic stringMechanic(Block)
- **static** StringBlockMechanic stringMechanic(String)
- **static** CustomBlockMechanic customBlockMechanic(Location)
- **static** CustomBlockMechanic customBlockMechanic(Block)
- **static** CustomBlockMechanic customBlockMechanic(BlockData)
- **static** CustomBlockMechanic customBlockMechanic(String)
- **static** boolean isCustomBlock(Block)
- **static** boolean isCustomBlock(ItemStack)
- **static** boolean isCustomBlock(String)
- **static** String[] chorusBlockIDs()
- **static** boolean remove$default(Location, Player, boolean, int, Object)
- **static** boolean remove$default(Location, Player, Drop, int, Object)
- **static** void place(String, Location)
- **static** ChorusBlockMechanic chorusBlockMechanic(BlockData)
- **static** ChorusBlockMechanic chorusBlockMechanic(Block)
- **static** ChorusBlockMechanic chorusBlockMechanic(String)
- **static** String[] noteBlockIDs()

### Class: com.nexomc.nexo.api.NexoBlocks$WhenMappings
Type: Class

No public methods found

### Class: com.nexomc.nexo.api.NexoFurniture
Type: Class

Methods:
- **static** String[] furnitureIDs()
- **static** void convertFurniture(ItemDisplay)
- **static** void updateFurniture(ItemDisplay)
- **static** boolean remove$default(Location, Player, Drop, int, Object)
- **static** boolean remove$default(Entity, Player, Drop, int, Object)
- **static** ItemDisplay place(String, Location, Rotation, BlockFace)
- **static** ItemDisplay place(String, Location, float, BlockFace)
- **static** boolean isFurniture(Location)
- **static** boolean isFurniture(String)
- **static** boolean isFurniture(ItemStack)
- **static** boolean isFurniture(Entity)
- **static** ItemDisplay findTargetFurniture(Player)
- **static** FurnitureMechanic furnitureMechanic(Block)
- **static** FurnitureMechanic furnitureMechanic(Location)
- **static** FurnitureMechanic furnitureMechanic(Entity)
- **static** FurnitureMechanic furnitureMechanic(String)
- **static** boolean remove(Location, Player, Drop)
- **static** boolean remove(Entity, Player, Drop)
- **static** boolean remove(Location, Player)
- **static** boolean remove(Location)
- **static** boolean remove(Entity, Player)
- **static** boolean remove(Entity)
- **static** ItemDisplay baseEntity(Block)
- **static** ItemDisplay baseEntity(Location)
- **static** ItemDisplay baseEntity(int)

### Class: com.nexomc.nexo.api.NexoFurniture$furnitureMechanic$lambda$5$$inlined$sortedBy$1
Type: Class
Implements: java.util.Comparator

Methods:
- int compare(Object, Object)

### Class: com.nexomc.nexo.api.NexoItems
Type: Class

Methods:
- **static** ItemBuilder builderFromItem(ItemStack)
- Map getItemConfigCache()
- **static** void loadItems()
- **static** Map itemMap()
- **static** Map entries()
- **static** Optional optionalItemFromId(String)
- NamespacedKey getITEM_ID()
- **static** List unexcludedItems(File)
- **static** ItemBuilder itemFromId(String)
- **static** String idFromItem(ItemBuilder)
- **static** String idFromItem(ItemStack)
- **static** boolean exists(String)
- **static** boolean exists(ItemStack)
- **static** String[] unexcludedItemNames()
- void reloadItem(String)
- **static** Set itemNames()
- **static** Set items()
- **static** boolean hasMechanic(String, String)

### Class: com.nexomc.nexo.api.NexoPack
Type: Class

Methods:
- **static** ResourcePack resourcePack()
- **static** BuiltResourcePack builtResourcePack()
- **static** void overwritePack(ResourcePack, ResourcePack)
- **static** void mergePack(ResourcePack, ResourcePack)
- **static** void sendPack(Player)
- **static** void clearPack(ResourcePack)
- **static** void mergePackFromDirectory(File)
- **static** void mergePackFromZip(File)

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

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

## Package: com.nexomc.nexo.api.events.custom_block

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockBreakEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- Block getBlock()
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- void setDrop(Drop)
- Drop getDrop()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockBreakEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockDamageEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- Block getBlock()
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockDamageEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockInteractEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Block getBlock()
- Player getPlayer()
- BlockFace getBlockFace()
- **static** HandlerList access$getHandlerList$cp()
- EquipmentSlot getHand()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- Action getAction()
- CustomBlockMechanic getMechanic()
- ItemStack getItemInHand()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockInteractEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockPlaceEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- Block getBlock()
- **static** HandlerList access$getHandlerList$cp()
- EquipmentSlot getHand()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- CustomBlockMechanic getMechanic()
- ItemStack getItemInHand()

### Class: com.nexomc.nexo.api.events.custom_block.NexoBlockPlaceEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.NexoCustomBlockDropLootEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- Block getBlock()
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- List getLoots()
- **static** HandlerList getHandlerList()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.NexoCustomBlockDropLootEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

## Package: com.nexomc.nexo.api.events.custom_block.chorusblock

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockBreakEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockBreakEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ChorusBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockBreakEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockDamageEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockDamageEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ChorusBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockDamageEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockDropLootEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoCustomBlockDropLootEvent

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ChorusBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockDropLootEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockInteractEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockInteractEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ChorusBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockInteractEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockPlaceEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockPlaceEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ChorusBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.chorusblock.NexoChorusBlockPlaceEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

## Package: com.nexomc.nexo.api.events.custom_block.noteblock

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockBreakEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockBreakEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- NoteBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockBreakEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockDamageEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockDamageEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- NoteBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockDamageEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockDropLootEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoCustomBlockDropLootEvent

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- NoteBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockDropLootEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockInteractEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockInteractEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- NoteBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockInteractEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockPlaceEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockPlaceEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- NoteBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.noteblock.NexoNoteBlockPlaceEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

## Package: com.nexomc.nexo.api.events.custom_block.stringblock

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockBreakEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockBreakEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- StringBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockBreakEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockDamageEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockDamageEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- StringBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockDamageEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockDropLootEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoCustomBlockDropLootEvent

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- StringBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockDropLootEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockInteractEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockInteractEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- StringBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockInteractEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockPlaceEvent
Type: Class
Extends: com.nexomc.nexo.api.events.custom_block.NexoBlockPlaceEvent
Implements: org.bukkit.event.Cancellable

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- StringBlockMechanic getMechanic()
- CustomBlockMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.custom_block.stringblock.NexoStringBlockPlaceEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

## Package: com.nexomc.nexo.api.events.furniture

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureBreakEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- ItemDisplay getBaseEntity()
- boolean isCancelled()
- Player getPlayer()
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- void setDrop(Drop)
- Drop getDrop()
- FurnitureMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureBreakEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureDamageEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- ItemDisplay getBaseEntity()
- boolean isCancelled()
- Player getPlayer()
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- FurnitureMechanic getMechanic()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureDamageEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureInteractEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- ItemDisplay getBaseEntity()
- Player getPlayer()
- Location getInteractionPoint()
- Event$Result getUseItemInHand()
- **static** HandlerList getHandlerList()
- void setCanRunAction(Event$Result)
- void setCanOpenStorage(Event$Result)
- Event$Result getUseFurniture()
- **static** HandlerList access$getHandlerList$cp()
- Event$Result getCanRunAction()
- void setUseFurniture(Event$Result)
- void setCanToggleLight(Event$Result)
- FurnitureMechanic getMechanic()
- Event$Result getCanToggleLight()
- ItemStack getItemInHand()
- boolean isCancelled()
- Event$Result getCanOpenStorage()
- EquipmentSlot getHand()
- HandlerList getHandlers()
- void setCancelled(boolean)
- BlockFace getBlockFace()
- void setCanSleep(Event$Result)
- Event$Result getCanSit()
- void setCanSit(Event$Result)
- Event$Result getCanRotate()
- Event$Result getCanSleep()
- void setCanRotate(Event$Result)
- void setUseItemInHand(Event$Result)

### Class: com.nexomc.nexo.api.events.furniture.NexoFurnitureInteractEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurniturePlaceEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- ItemDisplay getBaseEntity()
- boolean isCancelled()
- Player getPlayer()
- Block getBlock()
- **static** HandlerList access$getHandlerList$cp()
- EquipmentSlot getHand()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- FurnitureMechanic getMechanic()
- ItemStack getItemInHand()

### Class: com.nexomc.nexo.api.events.furniture.NexoFurniturePlaceEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

## Package: com.nexomc.nexo.api.events.resourcepack

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPackUploadEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- String getUrl()
- String getHash()
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPackUploadEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPostPackGenerateEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ResourcePack getResourcePack()
- boolean addResourcePack(ResourcePack)
- boolean addResourcePack(File)
- boolean addUnknownFile(String, byte[])

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPostPackGenerateEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPrePackGenerateEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ResourcePack getResourcePack()
- boolean addResourcePack(ResourcePack)
- boolean addResourcePack(File)
- boolean addUnknownFile(String, byte[])

### Class: com.nexomc.nexo.api.events.resourcepack.NexoPrePackGenerateEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

