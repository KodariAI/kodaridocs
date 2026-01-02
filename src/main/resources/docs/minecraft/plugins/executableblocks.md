# score-com-ssomar-score-api-executableblocks API Reference

**Package Filter:** `com.ssomar.score.api.executableblocks`

## Package: com.ssomar.score.api.executableblocks

### Class: com.ssomar.score.api.executableblocks.ExecutableBlocksAPI
Type: Class

Methods:
- **static** ExecutableBlockObjectInterface getExecutableBlockObject(ItemStack)
- **static** ExecutableBlocksManagerInterface getExecutableBlocksManager()
- **static** ExecutableBlocksPlacedManager getExecutableBlocksPlacedManager()

## Package: com.ssomar.score.api.executableblocks.config

### Class: com.ssomar.score.api.executableblocks.config.ExecutableBlockInterface
Type: Interface
Implements: com.ssomar.score.sobject.SObjectInterface, com.ssomar.score.sobject.SObjectWithActivators, com.ssomar.score.sobject.SObjectBuildable, com.ssomar.score.sobject.SObjectWithVariables

Methods:
- Item dropItem(Location, int)
- boolean hasBlockPerm(Player, boolean)
- Optional place(Location, boolean, OverrideMode, Entity, InternalData)
- void addCooldown(Player, int, boolean)
- void addCooldown(Player, int, boolean, String)

### Class: com.ssomar.score.api.executableblocks.config.ExecutableBlockObjectInterface
Type: Interface

Methods:
- String updateVariable(String, String, VariableUpdateType)
- boolean isValid()
- InternalData getInternalData()

### Class: com.ssomar.score.api.executableblocks.config.ExecutableBlocksManagerInterface
Type: Interface

Methods:
- boolean isValidID(String)
- Optional getExecutableBlock(String)
- Optional getExecutableBlock(ItemStack)
- List getAllExecutableBlocks()
- List getExecutableBlockIdsList()

## Package: com.ssomar.score.api.executableblocks.config.placed

### Class: com.ssomar.score.api.executableblocks.config.placed.ExecutableBlockPlacedInterface
Type: Interface

Methods:
- Location getLocation()
- String updateVariable(String, String, VariableUpdateType)
- ExecutableBlockInterface getExecutableBlockConfig()
- InternalData getInternalData()
- String getEB_ID()
- void breakBlock(Player, boolean)
- void updateUsage(int)
- void remove()

### Class: com.ssomar.score.api.executableblocks.config.placed.ExecutableBlocksPlacedManagerInterface
Type: Interface

Methods:
- Optional getExecutableBlockPlaced(Location)
- Optional getExecutableBlockPlaced(Block)
- void removeExecutableBlockPlaced(ExecutableBlockPlacedInterface)

## Package: com.ssomar.score.api.executableblocks.events

### Class: com.ssomar.score.api.executableblocks.events.ExecutableBlockBreakEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Block getBlock()
- Player getPlayer()
- boolean isCancelled()
- Event getSourceEvent()
- ExecutableBlockPlaced$BreakMethod getBreakMethod()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: com.ssomar.score.api.executableblocks.events.ExecutableBlockPlaceEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Entity getPlacer()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ExecutableBlockPlacedInterface getExecutableBlockPlaced()

## Package: com.ssomar.score.api.executableblocks.load

### Class: com.ssomar.score.api.executableblocks.load.ExecutableBlocksPostLoadEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

