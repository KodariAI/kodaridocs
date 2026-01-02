# Lands-7.16.10-me-angeschossen-lands-api API Reference

**Package Filter:** `me.angeschossen.lands.api`

## Package: me.angeschossen.lands.api

### Class: me.angeschossen.lands.api.LandsIntegration
Type: Interface

Methods:
- Land getLandByULID(ULID)
- Collection getNations()
- LandWorld getWorld(World)
- String getName()
- void setInboxMessageProvider(InboxMessageProvider)
- void setWarHandler(WarHandler)
- Land getLandByName(String)
- Area getUnloadedArea(Location)
- Land getLandByChunk(World, int, int)
- LevelsHandler getLevelsHandler()
- Collection getLands()
- Configuration getConfiguration()
- SortingContext getSortingContext(String)
- **static** LandsIntegration of(Plugin)
- CompletableFuture randomTeleport(LandPlayer, World)
- Nation getNationByName(String)
- LandPlayer getLandPlayer(UUID)
- boolean canPvP(Player, Player, Location, boolean, boolean)
- Nation getNationById(int)
- Land getLandByUnloadedChunk(World, int, int)
- CompletableFuture getOfflineLandPlayer(UUID)
- Long getPlayerCooldown(UUID, PlayerCooldown)
- Nation getNationByULID(ULID)
- MemberHolder getMemberholderByULID(ULID)
- InboxMessageProvider getInboxMessageProvider()
- Plugin getPlugin()
- FlagRegistry getFlagRegistry()
- Land getLandById(int)
- void onLoad(Runnable)
- Area getArea(Location)

## Package: me.angeschossen.lands.api.applicationframework.cache

### Class: me.angeschossen.lands.api.applicationframework.cache.NodeType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** NodeType valueOf(String)
- **static** NodeType[] values()

## Package: me.angeschossen.lands.api.applicationframework.handler

### Class: me.angeschossen.lands.api.applicationframework.handler.ULIDFactory
Type: Interface

Methods:
- ULID randomULID()
- ULID fromString(String)

### Class: me.angeschossen.lands.api.applicationframework.handler.APIHandler
Type: Class

Methods:
- **static** APIHandler getInstance()
- ULIDFactory getFactory()

## Package: me.angeschossen.lands.api.applicationframework.util

### Class: me.angeschossen.lands.api.applicationframework.util.ULID
Type: Interface

Methods:
- **static** ULID randomULID()
- **static** ULID fromString(String)

## Package: me.angeschossen.lands.api.blockworks

### Class: me.angeschossen.lands.api.blockworks.BlockCoordinate
Type: Interface

Methods:
- double getDistance(Player)
- int getX()
- World getWorld()
- int getY()
- int getChunkZ()
- int getZ()
- int getChunkX()
- Location toLocation()

### Class: me.angeschossen.lands.api.blockworks.BoundingBox
Type: Interface

Methods:
- World getWorld()
- boolean contains(int, int, int)
- boolean contains(int, int)
- BlockCoordinate getMin()
- BlockCoordinate getMiddle()
- BlockCoordinate getMax()

### Class: me.angeschossen.lands.api.blockworks.ChunkCoordinate
Type: Class
Implements: me.angeschossen.lands.api.land.ChunkCoordinate

Methods:
- int getX()
- int getZ()
- int getBlockZ()
- int hashCode()
- int getBlockX()
- boolean equals(Object)
- String toString()

## Package: me.angeschossen.lands.api.configuration

### Class: me.angeschossen.lands.api.configuration.Configuration
Type: Interface

Methods:
- MainConfig getMainConfig()
- NationsConfig getNationsModuleConfig()
- WarsConfig getWarsModuleConfig()

### Class: me.angeschossen.lands.api.configuration.MainConfig
Type: Interface
Implements: me.angeschossen.lands.api.framework.configuration.Configuration

No public methods found

## Package: me.angeschossen.lands.api.configuration.modules

### Class: me.angeschossen.lands.api.configuration.modules.ModuleConfig
Type: Interface
Implements: me.angeschossen.lands.api.framework.configuration.Configuration

Methods:
- boolean isEnabled()

### Class: me.angeschossen.lands.api.configuration.modules.NationsConfig
Type: Interface
Implements: me.angeschossen.lands.api.configuration.modules.ModuleConfig

No public methods found

### Class: me.angeschossen.lands.api.configuration.modules.WarsConfig
Type: Interface
Implements: me.angeschossen.lands.api.configuration.modules.ModuleConfig

Methods:
- Set getBlockBreakList()
- Set getBlockPlaceList()

## Package: me.angeschossen.lands.api.events

### Class: me.angeschossen.lands.api.events.BroadcastEvent
Type: Class
Extends: me.angeschossen.lands.api.events.plugin.LandsEvent

Methods:
- void setAffectedPlayers(ImmutableMap$Builder)
- String getMessageKey()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String parseMessage(BroadcastEvent$MessageParseRequest)
- BroadcastEvent$Category getCategory()
- String getMessage()
- void setExpressionVariables(ImmutableMap$Builder)
- Collection getRecipients()

### Class: me.angeschossen.lands.api.events.BroadcastEvent$Category
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BroadcastEvent$Category valueOf(String)
- **static** BroadcastEvent$Category[] values()

### Class: me.angeschossen.lands.api.events.BroadcastEvent$MessageParseRequest
Type: Class

Methods:
- Environment getEnvironment()
- PlayerData getRecipient()

### Class: me.angeschossen.lands.api.events.ChunkDeleteEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- int getX()
- World getWorld()
- int getZ()
- void setCancelled(boolean)
- ChunkDeleteEvent$UnclaimType getUnclaimType()
- DeleteReason getReason()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.ChunkDeleteEvent$UnclaimType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ChunkDeleteEvent$UnclaimType valueOf(String)
- **static** ChunkDeleteEvent$UnclaimType[] values()

### Class: me.angeschossen.lands.api.events.ChunkPostClaimEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent

Methods:
- int getX()
- LandWorld getWorld()
- int getZ()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.ChunkPreClaimEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- String getWorldName()
- boolean isCancelled()
- LandWorld getWorld()
- int getX()
- int getZ()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.LandBanPlayerEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.member.LandEditMemberCancellableEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.LandChatEvent
Type: Class
Extends: me.angeschossen.lands.api.events.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- Collection getReceivers()
- boolean isCancelled()
- void setAffectedPlayers(ImmutableMap$Builder)
- void setCancelled(boolean)
- LandChatEvent$MessageSource getSource()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getMessage()
- String toString()
- MemberHolder getMemberHolder()

### Class: me.angeschossen.lands.api.events.LandChatEvent$MessageSource
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** LandChatEvent$MessageSource valueOf(String)
- **static** LandChatEvent$MessageSource[] values()

### Class: me.angeschossen.lands.api.events.LandCreateEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- String toString()

### Class: me.angeschossen.lands.api.events.LandDeleteEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- DeleteReason getReason()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String toString()
- String getLogInfo()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.LandInvitePlayerEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.member.LandEditMemberCancellableEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.LandOwnerChangeEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.member.LandEditMemberCancellableEvent

Methods:
- void setAffectedPlayers(ImmutableMap$Builder)
- void setCancelled(boolean)
- LandOwnerChangeEvent$Reason getReason()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.LandOwnerChangeEvent$Reason
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** LandOwnerChangeEvent$Reason valueOf(String)
- **static** LandOwnerChangeEvent$Reason[] values()

### Class: me.angeschossen.lands.api.events.LandRenameEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- String getNewName()
- void setCancelled(boolean)
- HandlerList getHandlers()
- String getCurrentName()
- **static** HandlerList getHandlerList()
- String toString()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.LandTrustPlayerEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.member.LandEditMemberCancellableEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.LandUnbanPlayerEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.member.LandEditMemberCancellableEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.LandUntrustPlayerEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.member.LandEditMemberCancellableEvent

Methods:
- HandlerList getHandlers()
- void setCancelled(boolean)
- LandUntrustPlayerEvent$UntrustReason getReason()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.LandUntrustPlayerEvent$UntrustReason
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** LandUntrustPlayerEvent$UntrustReason valueOf(String)
- **static** LandUntrustPlayerEvent$UntrustReason[] values()

### Class: me.angeschossen.lands.api.events.PlayerLanguageChangeEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- String getLanguage()
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()

### Class: me.angeschossen.lands.api.events.PlayerLeaveLandEvent
Type: Class
Extends: me.angeschossen.lands.api.events.player.PlayerLandEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: me.angeschossen.lands.api.events.land

### Class: me.angeschossen.lands.api.events.land.DeleteReason
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DeleteReason valueOf(String)
- **static** DeleteReason[] values()

### Class: me.angeschossen.lands.api.events.land.LandCancellableEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)

### Class: me.angeschossen.lands.api.events.land.LandConvertEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- LandType getLandType()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.land.LandEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.player.PlayerNullableEvent

Methods:
- Land getLand()
- void setAffectedPlayers(ImmutableMap$Builder)
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.land.LandPostCreateEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getLogInfo()
- String toString()

## Package: me.angeschossen.lands.api.events.land.bank

### Class: me.angeschossen.lands.api.events.land.bank.BankEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- double getValue()
- boolean isCancelled()
- void setCancelled(boolean)
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.land.bank.LandBankBalanceChangedEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent

Methods:
- double getPrevious()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getNow()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.land.bank.LandBankDepositEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.bank.BankEvent
Implements: org.bukkit.event.Cancellable

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getLogInfo()
- String toString()

### Class: me.angeschossen.lands.api.events.land.bank.LandBankWithdrawEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.bank.BankEvent
Implements: org.bukkit.event.Cancellable

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getLogInfo()
- String toString()

## Package: me.angeschossen.lands.api.events.land.block

### Class: me.angeschossen.lands.api.events.land.block.LandBlockEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- LandBlock getLandBlock()

### Class: me.angeschossen.lands.api.events.land.block.LandBlockInteractEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.block.LandBlockEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.land.block.LandBlockPlaceEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.block.LandBlockEvent

Methods:
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getLogInfo()
- String toString()

### Class: me.angeschossen.lands.api.events.land.block.LandBlockRemoveEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.block.LandBlockEvent

Methods:
- void setCancelled(boolean)
- HandlerList getHandlers()
- LandBlockRemovalReason getReason()
- **static** HandlerList getHandlerList()
- String getLogInfo()
- String toString()

## Package: me.angeschossen.lands.api.events.land.claiming

### Class: me.angeschossen.lands.api.events.land.claiming.LandMergeEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandCancellableEvent

Methods:
- Land getToMerge()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.land.claiming.LandUnclaimAllEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.land.claiming.LandUnclaimSelectionEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.claiming.selection.SelectionEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: me.angeschossen.lands.api.events.land.claiming.selection

### Class: me.angeschossen.lands.api.events.land.claiming.selection.LandClaimSelectionEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.claiming.selection.SelectionEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.land.claiming.selection.LandUnclaimSelectionEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.claiming.selection.SelectionEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.land.claiming.selection.SelectionEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Selection getSelection()
- void setCancelled(boolean)
- Set getAffectedChunks()
- boolean isChunkAffected(World, int, int)

## Package: me.angeschossen.lands.api.events.land.member

### Class: me.angeschossen.lands.api.events.land.member.LandEditMemberCancellableEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.land.member.LandEditMemberEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)

### Class: me.angeschossen.lands.api.events.land.member.LandEditMemberEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.player.PlayerNullableEvent
Implements: me.angeschossen.lands.api.events.plugin.TargetableEvent

Methods:
- Land getLand()
- void setAffectedPlayers(ImmutableMap$Builder)
- UUID getTargetUUID()
- UUID getTargetUID()
- void setExpressionVariables(ImmutableMap$Builder)
- Area getArea()

## Package: me.angeschossen.lands.api.events.land.spawn

### Class: me.angeschossen.lands.api.events.land.spawn.LandSpawnRemoveEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- UnloadedPosition getCurrent()

### Class: me.angeschossen.lands.api.events.land.spawn.LandSpawnSetEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandCancellableEvent

Methods:
- UnloadedPosition getNew()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- UnloadedPosition getCurrent()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.land.spawn.LandSpawnTeleportEvent
Type: Class
Extends: me.angeschossen.lands.api.events.land.LandEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- LandPlayer getLandPlayer()

## Package: me.angeschossen.lands.api.events.memberholder

### Class: me.angeschossen.lands.api.events.memberholder.InboxMessageReceivedEvent
Type: Class
Extends: me.angeschossen.lands.api.events.memberholder.MemberHolderEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- InboxMessage getMessage()

### Class: me.angeschossen.lands.api.events.memberholder.MemberHolderEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.plugin.LandsEvent

Methods:
- void setAffectedPlayers(ImmutableMap$Builder)
- MemberHolder getMemberHolder()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.memberholder.MemberHolderLevelChangedEvent
Type: Class
Extends: me.angeschossen.lands.api.events.memberholder.MemberHolderEvent

Methods:
- Level getPrevious()
- Level getNew()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.memberholder.MemberHolderRelationChangeEvent
Type: Class
Extends: me.angeschossen.lands.api.events.memberholder.MemberHolderEvent
Implements: org.bukkit.event.Cancellable

Methods:
- MemberHolder getTarget()
- boolean isCancelled()
- void setAffectedPlayers(ImmutableMap$Builder)
- Relation getNewRelation()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- Relation getCurrentRelation()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.memberholder.MemberHolderUpkeepEvent
Type: Class
Extends: me.angeschossen.lands.api.events.memberholder.MemberHolderEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- double getBalance()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getUpkeep()
- void setExpressionVariables(ImmutableMap$Builder)
- boolean IsInsufficient()

## Package: me.angeschossen.lands.api.events.nation.edit

### Class: me.angeschossen.lands.api.events.nation.edit.NationCreateEvent
Type: Class
Extends: me.angeschossen.lands.api.events.nation.edit.NationEditEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String toString()
- String getLogInfo()

### Class: me.angeschossen.lands.api.events.nation.edit.NationDeleteEvent
Type: Class
Extends: me.angeschossen.lands.api.events.nation.edit.NationEditEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Nation getNation()
- HandlerList getHandlers()
- void setCancelled(boolean)
- DeleteReason getReason()
- **static** HandlerList getHandlerList()
- String toString()
- String getLogInfo()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.nation.edit.NationEditEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.player.PlayerNullableEvent

Methods:
- void setAffectedPlayers(ImmutableMap$Builder)
- Nation getNation()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.nation.edit.NationRenameEvent
Type: Class
Extends: me.angeschossen.lands.api.events.nation.edit.NationEditEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- String getNewName()
- void setCancelled(boolean)
- HandlerList getHandlers()
- String getCurrentName()
- **static** HandlerList getHandlerList()
- void setExpressionVariables(ImmutableMap$Builder)

## Package: me.angeschossen.lands.api.events.nation.member

### Class: me.angeschossen.lands.api.events.nation.member.NationEditMemberCancellableEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.nation.member.NationEditMemberEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)

### Class: me.angeschossen.lands.api.events.nation.member.NationEditMemberEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.land.LandEvent

Methods:
- void setAffectedPlayers(ImmutableMap$Builder)
- Nation getNation()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.nation.member.NationTrustLandEvent
Type: Class
Extends: me.angeschossen.lands.api.events.nation.member.NationEditMemberCancellableEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.nation.member.NationUntrustLandEvent
Type: Class
Extends: me.angeschossen.lands.api.events.nation.member.NationEditMemberCancellableEvent

Methods:
- HandlerList getHandlers()
- NationUntrustLandEvent$UntrustReason getReason()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.nation.member.NationUntrustLandEvent$UntrustReason
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** NationUntrustLandEvent$UntrustReason valueOf(String)
- **static** NationUntrustLandEvent$UntrustReason[] values()

## Package: me.angeschossen.lands.api.events.player

### Class: me.angeschossen.lands.api.events.player.PlayerEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.player.PlayerNullableEvent

Methods:
- UUID getPlayerUID()
- LandPlayer getLandPlayer()
- UUID getPlayerUUID()

### Class: me.angeschossen.lands.api.events.player.PlayerLandEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- Land getLand()
- boolean isCancelled()
- void setAffectedPlayers(ImmutableMap$Builder)
- void setCancelled(boolean)
- void setExpressionVariables(ImmutableMap$Builder)
- Area getArea()

### Class: me.angeschossen.lands.api.events.player.PlayerNullableEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.plugin.LandsEvent
Implements: me.angeschossen.lands.api.framework.events.PlayerEvent

Methods:
- UUID getPlayerUID()
- void setAffectedPlayers(ImmutableMap$Builder)
- LandPlayer getLandPlayer()
- void setExpressionVariables(ImmutableMap$Builder)
- UUID getPlayerUUID()

## Package: me.angeschossen.lands.api.events.player.area

### Class: me.angeschossen.lands.api.events.player.area.PlayerAreaEnterEvent
Type: Class
Extends: me.angeschossen.lands.api.events.player.area.PlayerAreaEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- String toString()
- Area getFrom()

### Class: me.angeschossen.lands.api.events.player.area.PlayerAreaEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.player.PlayerEvent

Methods:
- void setAffectedPlayers(ImmutableMap$Builder)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setExpressionVariables(ImmutableMap$Builder)
- Area getArea()

### Class: me.angeschossen.lands.api.events.player.area.PlayerAreaLeaveEvent
Type: Class
Extends: me.angeschossen.lands.api.events.player.area.PlayerAreaEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- String toString()

## Package: me.angeschossen.lands.api.events.player.database

### Class: me.angeschossen.lands.api.events.player.database.PlayerDataLoadedEvent
Type: Class
Extends: me.angeschossen.lands.api.events.player.PlayerEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- LandPlayer getLandPlayer()

## Package: me.angeschossen.lands.api.events.player.economy

### Class: me.angeschossen.lands.api.events.player.economy.PlayerTaxEvent
Type: Class
Extends: me.angeschossen.lands.api.events.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setAffectedPlayers(ImmutableMap$Builder)
- boolean isInsufficient()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getPlayerBalance()
- void setExpressionVariables(ImmutableMap$Builder)
- double getTax()
- Area getArea()

## Package: me.angeschossen.lands.api.events.player.role

### Class: me.angeschossen.lands.api.events.player.role.PlayerToggleRoleFlagEvent
Type: Class
Extends: me.angeschossen.lands.api.events.role.RoleEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setAffectedPlayers(ImmutableMap$Builder)
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- LandPlayer getLandPlayer()
- RoleFlag getFlag()

## Package: me.angeschossen.lands.api.events.player.teleportation

### Class: me.angeschossen.lands.api.events.player.teleportation.PlayerRandomTeleportEvent
Type: Class
Extends: me.angeschossen.lands.api.events.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Location getDestination()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.player.teleportation.PlayerSpawnLandEvent
Type: Class
Extends: me.angeschossen.lands.api.events.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- Land getLand()
- boolean isCancelled()
- void setAffectedPlayers(ImmutableMap$Builder)
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setExpressionVariables(ImmutableMap$Builder)

## Package: me.angeschossen.lands.api.events.plugin

### Class: me.angeschossen.lands.api.events.plugin.TargetableEvent
Type: Interface

Methods:
- UUID getTargetUUID()
- UUID getTargetUID()

### Class: me.angeschossen.lands.api.events.plugin.LandsEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.framework.events.PluginEvent

No public methods found

## Package: me.angeschossen.lands.api.events.rent

### Class: me.angeschossen.lands.api.events.rent.PlayerRentalEvent
Type: Class
Extends: me.angeschossen.lands.api.events.rent.RentalEvent

No public methods found

### Class: me.angeschossen.lands.api.events.rent.RentalEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.player.area.PlayerAreaEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- Area getArea()
- RentalOfferBase getOffer()

### Class: me.angeschossen.lands.api.events.rent.RentalExpireEvent
Type: Class
Extends: me.angeschossen.lands.api.events.rent.RentalEvent

No public methods found

### Class: me.angeschossen.lands.api.events.rent.RentalOfferCreateEvent
Type: Class
Extends: me.angeschossen.lands.api.events.rent.RentalEvent

Methods:
- RentalOfferBase getOffer()

## Package: me.angeschossen.lands.api.events.role

### Class: me.angeschossen.lands.api.events.role.RoleEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.plugin.LandsEvent

Methods:
- Role getRole()
- void setExpressionVariables(ImmutableMap$Builder)

## Package: me.angeschossen.lands.api.events.war

### Class: me.angeschossen.lands.api.events.war.WarDeclareEvent
Type: Class
Extends: me.angeschossen.lands.api.events.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setAffectedPlayers(ImmutableMap$Builder)
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String toString()
- LandPlayer getLandPlayer()
- void setExpressionVariables(ImmutableMap$Builder)
- MemberHolder getAttacker()
- MemberHolder getDefender()

### Class: me.angeschossen.lands.api.events.war.WarEndEvent
Type: Class
Extends: me.angeschossen.lands.api.events.war.WarEvent

Methods:
- MemberHolder getLoser()
- MemberHolder getWinner()
- HandlerList getHandlers()
- WarResult getResult()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.war.WarEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.plugin.LandsEvent

Methods:
- void setAffectedPlayers(ImmutableMap$Builder)
- War getWar()
- void setExpressionVariables(ImmutableMap$Builder)

### Class: me.angeschossen.lands.api.events.war.WarStartEvent
Type: Class
Extends: me.angeschossen.lands.api.events.war.WarEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: me.angeschossen.lands.api.events.war.captureflag

### Class: me.angeschossen.lands.api.events.war.captureflag.CaptureFlagBreakEvent
Type: Class
Extends: me.angeschossen.lands.api.events.war.captureflag.base.CaptureFlagEvent

Methods:
- HandlerList getHandlers()
- CaptureFlagBreakEvent$BreakReason getReason()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.war.captureflag.CaptureFlagBreakEvent$BreakReason
Type: Enum
Extends: java.lang.Enum
Implements: me.angeschossen.lands.api.land.block.removalreason.LandBlockRemovalReason

Methods:
- **static** CaptureFlagBreakEvent$BreakReason valueOf(String)
- **static** CaptureFlagBreakEvent$BreakReason[] values()

### Class: me.angeschossen.lands.api.events.war.captureflag.CaptureFlagCapturedEvent
Type: Class
Extends: me.angeschossen.lands.api.events.war.captureflag.base.CaptureFlagEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.angeschossen.lands.api.events.war.captureflag.CaptureFlagProgressEvent
Type: Class
Extends: me.angeschossen.lands.api.events.war.captureflag.base.CaptureFlagCancellableEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- WarTeam getProgressor()

## Package: me.angeschossen.lands.api.events.war.captureflag.base

### Class: me.angeschossen.lands.api.events.war.captureflag.base.CaptureFlagCancellableEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.war.captureflag.base.CaptureFlagEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)

### Class: me.angeschossen.lands.api.events.war.captureflag.base.CaptureFlagEvent
Type: Abstract Class
Extends: me.angeschossen.lands.api.events.war.WarEvent

Methods:
- void setAffectedPlayers(ImmutableMap$Builder)
- CaptureFlag getCaptureFlag()
- LandPlayer getLandPlayer()
- void setExpressionVariables(ImmutableMap$Builder)

## Package: me.angeschossen.lands.api.exceptions

### Class: me.angeschossen.lands.api.exceptions.FlagConflictException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- Flag getExisting()

### Class: me.angeschossen.lands.api.exceptions.LandAlreadyInNationException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: me.angeschossen.lands.api.exceptions.ManagedByDifferentHolderException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: me.angeschossen.lands.api.flags

### Class: me.angeschossen.lands.api.flags.FlagRegistry
Type: Interface

Methods:
- PlayerFlag getPlayer(String)
- boolean isValidName(String)
- RoleFlag getInteract(Block, ItemStack)
- Collection getPlayerFlags()
- Flag get(String)
- RoleFlag getRole(String)
- NaturalFlag getNatural(String)
- Collection getRoleFlags()
- List getRoleFlags(RoleFlagCategory)
- List getRoleFlags(RoleFlagCategory, FlagModule)
- Collection getNaturalFlags()
- Flag register(Flag)

### Class: me.angeschossen.lands.api.flags.DefaultStateFlag
Type: Abstract Class
Extends: me.angeschossen.lands.api.flags.Flag
Implements: me.angeschossen.lands.api.flags.type.parent.DefaultStateFlag

Methods:
- boolean getDefaultState()
- DefaultStateFlag setDefaultState(boolean)
- DefaultStateFlag setDefaultState(boolean)

### Class: me.angeschossen.lands.api.flags.Flag
Type: Abstract Class
Implements: me.angeschossen.lands.api.flags.type.parent.Flag

Methods:
- FlagModule getModule()
- Object setWarState(boolean)
- boolean isActiveInWar()
- Object setActiveInWar(boolean)
- String getName()
- Object setDescription(List)
- Object setDescription(String)
- Object setDisplayName(String)
- Object setApplyInSubareas(boolean)
- List getDescription()
- Object setAlwaysAllowInWilderness(boolean)
- boolean isDisplayInWilderness()
- FlagTarget getTarget()
- String getTogglePermission()
- boolean isDisplayInWild()
- int hashCode()
- Object setDisplay(boolean)
- boolean isAlwaysAllowInWilderness()
- boolean isApplyInSubareas()
- boolean isAlwaysAllowInWild()
- boolean getWarState()
- boolean isDisplay()
- ItemStack getIcon()
- Object setIcon(ItemStack)
- String getDisplayName()
- String getTogglePerm()
- Plugin getPlugin()
- boolean equals(Object)

### Class: me.angeschossen.lands.api.flags.Flag$Module
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Flag$Module valueOf(String)
- **static** Flag$Module[] values()

### Class: me.angeschossen.lands.api.flags.Flag$Target
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Flag$Target valueOf(String)
- **static** Flag$Target[] values()

### Class: me.angeschossen.lands.api.flags.Flags
Type: Class

Methods:
- **static** RoleFlag getInteract(Block)
- **static** RoleFlag getInteract(Block, ItemStack)
- **static** Flag get(String)
- **static** void initializeLegacySupport()

## Package: me.angeschossen.lands.api.flags.enums

### Class: me.angeschossen.lands.api.flags.enums.FlagModule
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** FlagModule valueOf(String)
- **static** FlagModule[] values()

### Class: me.angeschossen.lands.api.flags.enums.FlagTarget
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** FlagTarget valueOf(String)
- **static** FlagTarget[] values()

### Class: me.angeschossen.lands.api.flags.enums.RoleFlagCategory
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** RoleFlagCategory valueOf(String)
- **static** RoleFlagCategory[] values()

## Package: me.angeschossen.lands.api.flags.type

### Class: me.angeschossen.lands.api.flags.type.NaturalFlag
Type: Interface
Implements: me.angeschossen.lands.api.flags.type.parent.DefaultStateFlag, me.angeschossen.lands.api.flags.type.parent.Flag

Methods:
- **static** NaturalFlag of(LandsIntegration, FlagTarget, String)

### Class: me.angeschossen.lands.api.flags.type.PlayerFlag
Type: Interface
Implements: me.angeschossen.lands.api.flags.type.parent.DefaultStateFlag

No public methods found

### Class: me.angeschossen.lands.api.flags.type.RoleFlag
Type: Interface
Implements: me.angeschossen.lands.api.flags.type.parent.DefaultStateFlag, me.angeschossen.lands.api.flags.type.parent.Flag

Methods:
- void sendDeniedInWar(LandPlayer, Land)
- RoleFlag setUpdatePredicate(Predicate)
- **static** RoleFlag of(LandsIntegration, FlagTarget, RoleFlagCategory, String)
- RoleFlagCategory getCategory()
- void sendDenied(LandPlayer, Area)
- Predicate getUpdatePredicate()
- RoleFlag setToggleableByNation(boolean)
- String getBypassPermission()
- String getBypassPermissionWilderness()
- boolean isToggleableByNation()

### Class: me.angeschossen.lands.api.flags.type.Flags
Type: Class

Methods:
- **static** RoleFlag getInteract(Block)
- **static** RoleFlag getInteract(Block, ItemStack)
- **static** Flag get(String)

## Package: me.angeschossen.lands.api.flags.type.parent

### Class: me.angeschossen.lands.api.flags.type.parent.DefaultStateFlag
Type: Interface
Implements: me.angeschossen.lands.api.flags.type.parent.Flag

Methods:
- boolean getDefaultState()
- DefaultStateFlag setDefaultState(boolean)

### Class: me.angeschossen.lands.api.flags.type.parent.Flag
Type: Interface

Methods:
- FlagModule getModule()
- boolean isActiveInWar()
- Object setActiveInWar(boolean)
- String getName()
- Object setDisplay(boolean)
- boolean isAlwaysAllowInWilderness()
- boolean isApplyInSubareas()
- Object setDescription(List)
- Object setDescription(String)
- Object setDisplayName(String)
- Object setApplyInSubareas(boolean)
- List getDescription()
- Object setAlwaysAllowInWilderness(boolean)
- boolean isDisplay()
- boolean isDisplayInWilderness()
- ItemStack getIcon()
- Object setIcon(ItemStack)
- FlagTarget getTarget()
- String getTogglePermission()
- String getDisplayName()
- Plugin getPlugin()
- boolean shouldDisplay(Area, LandPlayer)

## Package: me.angeschossen.lands.api.flags.types

### Class: me.angeschossen.lands.api.flags.types.LandFlag
Type: Class
Extends: me.angeschossen.lands.api.flags.DefaultStateFlag
Implements: me.angeschossen.lands.api.flags.type.NaturalFlag

Methods:
- FlagModule getModule()
- String getTogglePermission()
- String getTogglePerm()
- **static** LandFlag of(String)
- boolean shouldDisplay(Area, LandPlayer)

### Class: me.angeschossen.lands.api.flags.types.NationRoleFlag
Type: Class
Extends: me.angeschossen.lands.api.flags.types.RoleFlag

Methods:
- FlagModule getModule()
- String getBypassPerm()
- String getBypassPermWild()
- String getTogglePerm()

### Class: me.angeschossen.lands.api.flags.types.PlayerFlag
Type: Class
Extends: me.angeschossen.lands.api.flags.DefaultStateFlag
Implements: me.angeschossen.lands.api.flags.type.PlayerFlag

Methods:
- FlagModule getModule()
- String getTogglePermission()
- String getTogglePerm()
- **static** PlayerFlag of(String)
- boolean shouldDisplay(Area, LandPlayer)

### Class: me.angeschossen.lands.api.flags.types.RoleFlag
Type: Class
Extends: me.angeschossen.lands.api.flags.DefaultStateFlag
Implements: me.angeschossen.lands.api.flags.type.RoleFlag

Methods:
- FlagModule getModule()
- String getBypassPerm()
- RoleFlagCategory getCategory()
- RoleFlag setToggleableByNation(boolean)
- RoleFlag setToggleableByNation(boolean)
- void sendDeniedInWar(LandPlayer, Land)
- String getTogglePermission()
- String getBypassPermWild()
- String getTogglePerm()
- Predicate getPredicate()
- RoleFlag setUpdatePredicate(Predicate)
- **static** RoleFlag of(String)
- void sendDenied(LandPlayer, Area)
- Predicate getUpdatePredicate()
- boolean shouldDisplay(Area, LandPlayer)
- String getBypassPermission()
- String getBypassPermissionWilderness()
- boolean isToggleableByNation()

### Class: me.angeschossen.lands.api.flags.types.RoleFlag$Category
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** RoleFlag$Category valueOf(String)
- **static** RoleFlag$Category[] values()

## Package: me.angeschossen.lands.api.framework.blockutil

### Class: me.angeschossen.lands.api.framework.blockutil.BlockKey
Type: Interface

Methods:
- int getX()
- int getY()
- int getZ()
- int getChunkZ()
- int getChunkX()

### Class: me.angeschossen.lands.api.framework.blockutil.BlockPosition
Type: Interface

Methods:
- boolean isChunkLoaded()
- int getX()
- World getWorld()
- int getY()
- int getZ()
- int getChunkZ()
- int getChunkX()
- **static** BlockPosition of(World, int, int, int)
- **static** BlockPosition of(Location)
- Location toLocation()

### Class: me.angeschossen.lands.api.framework.blockutil.ChunkCoordinate
Type: Interface

Methods:
- int getX()
- int getZ()
- **static** ChunkCoordinate of(int, int)

### Class: me.angeschossen.lands.api.framework.blockutil.Coordinate
Type: Interface

Methods:
- Location getLocation()
- World getWorld()
- int getX()
- int getY()
- int getChunkZ()
- int getZ()
- int getChunkX()

### Class: me.angeschossen.lands.api.framework.blockutil.UnloadedPosition
Type: Interface

Methods:
- World getWorld()
- boolean isSameWorld(String)
- String getServerName()
- Location toLocation()
- boolean isTargetServer()
- boolean isWorldLoaded()
- boolean isChunkLoaded()
- String getWorldName()
- float getYaw()
- double getX()
- float getPitch()
- double getY()
- double getZ()
- int getChunkZ()
- int getBlockZ()
- int getBlockY()
- int getChunkX()
- int getBlockX()

## Package: me.angeschossen.lands.api.framework.blockutil.impl

### Class: me.angeschossen.lands.api.framework.blockutil.impl.BlockCoordinate
Type: Class

Methods:
- int hashCode()
- boolean equals(int, int, int)
- boolean equals(Object)
- String toString()

### Class: me.angeschossen.lands.api.framework.blockutil.impl.BlockKey
Type: Class
Implements: me.angeschossen.lands.api.framework.blockutil.BlockKey

Methods:
- int getX()
- World getWorld()
- int getY()
- int getZ()
- int getChunkZ()
- int hashCode()
- int getChunkX()
- boolean equals(Object)
- Location toLocation()

### Class: me.angeschossen.lands.api.framework.blockutil.impl.BlockPosition
Type: Class
Implements: me.angeschossen.lands.api.framework.blockutil.BlockPosition

Methods:
- World getWorld()
- Block getBlock()
- Location toLocation()
- boolean isChunkLoaded()
- JsonObject toJson()
- int getX()
- int getY()
- int getZ()
- int getChunkZ()
- int hashCode()
- int getChunkX()
- boolean equals(World, int, int, int)
- boolean equals(Object)
- boolean equals(int, int, int)
- **static** BlockPosition fromJson(JsonObject)
- String toString()

### Class: me.angeschossen.lands.api.framework.blockutil.impl.ChunkCoordinate
Type: Class
Implements: me.angeschossen.lands.api.framework.blockutil.ChunkCoordinate

Methods:
- int getX()
- int getZ()
- int hashCode()
- boolean equals(Object)

### Class: me.angeschossen.lands.api.framework.blockutil.impl.OfflineBlockCoordinate
Type: Class
Implements: me.angeschossen.lands.api.framework.blockutil.UnloadedPosition

Methods:
- World getWorld()
- boolean isSameWorld(String)
- String getServerName()
- Location toLocation()
- boolean isTargetServer()
- World getWorldNotNull()
- boolean isWorldLoaded()
- boolean isChunkLoaded()
- String getWorldName()
- float getYaw()
- double getX()
- float getPitch()
- double getY()
- JsonObject toJsonObject()
- double getZ()
- int getChunkZ()
- int getBlockZ()
- int getBlockY()
- int getChunkX()
- int getBlockX()
- boolean equals(String, World, int, int, int)
- **static** OfflineBlockCoordinate fromJson(JsonObject)

### Class: me.angeschossen.lands.api.framework.blockutil.impl.Position
Type: Class
Extends: me.angeschossen.lands.api.framework.blockutil.impl.BlockPosition

Methods:
- JsonObject toJson()
- int hashCode()
- boolean equals(Object)
- **static** Position fromJson(JsonObject)
- String toString()
- Location toLocation()

## Package: me.angeschossen.lands.api.framework.configuration

### Class: me.angeschossen.lands.api.framework.configuration.CommonConfiguration
Type: Interface

Methods:
- String getString(String)

### Class: me.angeschossen.lands.api.framework.configuration.Configuration
Type: Interface

Methods:
- long getLong(String)
- int getInt(String)
- Color getColor(String)
- double getDouble(String)
- boolean hasValue(String)
- boolean getBoolean(String)
- String getString(String)

## Package: me.angeschossen.lands.api.framework.configuration.gui

### Class: me.angeschossen.lands.api.framework.configuration.gui.GUIConfiguration
Type: Interface
Implements: me.angeschossen.lands.api.framework.configuration.CommonConfiguration

No public methods found

## Package: me.angeschossen.lands.api.framework.configuration.messages

### Class: me.angeschossen.lands.api.framework.configuration.messages.Messages
Type: Interface
Implements: me.angeschossen.lands.api.framework.configuration.CommonConfiguration

No public methods found

## Package: me.angeschossen.lands.api.framework.economy

### Class: me.angeschossen.lands.api.framework.economy.EconomyIntegration
Type: Interface

Methods:
- boolean take(UUID, double)
- boolean take(OfflinePlayer, double)
- boolean give(UUID, double)
- boolean give(OfflinePlayer, double)
- String getServerBankId()
- String getName()
- double getBalance(UUID)
- double getBalance(OfflinePlayer)
- Plugin getPlugin()
- boolean bankDeposit(String, double)
- boolean pay(OfflinePlayer, double, OfflinePlayer)
- boolean bankCreate(String, OfflinePlayer)
- boolean has(UUID, double)
- boolean has(OfflinePlayer, double)

## Package: me.angeschossen.lands.api.framework.events

### Class: me.angeschossen.lands.api.framework.events.ExpressionEntity
Type: Interface

Methods:
- void setAffectedPlayers(String, ImmutableMap$Builder)
- void setExpressionVariables(String, ImmutableMap$Builder, UUID)

### Class: me.angeschossen.lands.api.framework.events.PlayerEvent
Type: Interface

Methods:
- UUID getPlayerUID()

### Class: me.angeschossen.lands.api.framework.events.PluginEvent
Type: Abstract Class
Extends: org.bukkit.event.Event

Methods:
- void setAffectedPlayers(ImmutableMap$Builder)
- String getLogInfo()
- void setExpressionVariables(ImmutableMap$Builder)

## Package: me.angeschossen.lands.api.framework.exceptions

### Class: me.angeschossen.lands.api.framework.exceptions.IllegalUntrustException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: me.angeschossen.lands.api.framework.exceptions.NameAlreadyTakenException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: me.angeschossen.lands.api.framework.exceptions.NoAccessException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: me.angeschossen.lands.api.framework.exceptions.OwnerUntrustException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: me.angeschossen.lands.api.framework.exceptions.PlayerTrustedException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: me.angeschossen.lands.api.framework.exceptions.PlayerUntrustedException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: me.angeschossen.lands.api.framework.exceptions.RolePriorityException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: me.angeschossen.lands.api.framework.exceptions.command

### Class: me.angeschossen.lands.api.framework.exceptions.command.InvalidInputException
Type: Class
Extends: java.lang.Exception

No public methods found

## Package: me.angeschossen.lands.api.framework.exceptions.menu

### Class: me.angeschossen.lands.api.framework.exceptions.menu.UnhandledItemResponseException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: me.angeschossen.lands.api.framework.exceptions.menu.UnhandledMenuTypeException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: me.angeschossen.lands.api.framework.flags

### Class: me.angeschossen.lands.api.framework.flags.FlagRegistry
Type: Interface

Methods:
- RoleFlag registerFlag(RoleFlag)
- RoleFlag getFlagByName(String)
- Collection getActionFlags()
- Collection getManagementFlags()

## Package: me.angeschossen.lands.api.framework.flags.roles

### Class: me.angeschossen.lands.api.framework.flags.roles.ActionFlag
Type: Abstract Class
Extends: me.angeschossen.lands.api.framework.flags.roles.RoleFlag

Methods:
- FlagType getType()

### Class: me.angeschossen.lands.api.framework.flags.roles.FlagType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** FlagType valueOf(String)
- **static** FlagType[] values()

### Class: me.angeschossen.lands.api.framework.flags.roles.ManagementFlag
Type: Abstract Class
Extends: me.angeschossen.lands.api.framework.flags.roles.RoleFlag

Methods:
- FlagType getType()

### Class: me.angeschossen.lands.api.framework.flags.roles.RoleFlag
Type: Abstract Class

Methods:
- String getTogglePermission()
- void sendDeniedMessage(PlayerData, String[], String[])
- String getName()
- FlagType getType()
- Plugin getPlugin()
- String getBypassPermission()

## Package: me.angeschossen.lands.api.framework.handler

### Class: me.angeschossen.lands.api.framework.handler.MultiPaperHandler
Type: Interface

Methods:
- boolean isTargetServer(String)

### Class: me.angeschossen.lands.api.framework.handler.APIHandler
Type: Class

Methods:
- MultiPaperHandler getMultiPaperHandler()
- **static** APIHandler getInstance()
- String getServerName()

## Package: me.angeschossen.lands.api.framework.holder

### Class: me.angeschossen.lands.api.framework.holder.ChangeSaveable
Type: Interface
Implements: me.angeschossen.lands.api.framework.holder.Changeable

Methods:
- long getLastChangeSave()
- void setChangeSaveTime()
- void setSaveChange()
- boolean hasSaveChange()
- CompletableFuture save()
- boolean exists()
- int compareToSave(ChangeSaveable)
- boolean forceSaveOnShutdown()
- CompletableFuture delete()

### Class: me.angeschossen.lands.api.framework.holder.Changeable
Type: Interface

Methods:
- CompletableFuture save()
- CompletableFuture saveAndPublishToRedis()

### Class: me.angeschossen.lands.api.framework.holder.CoordinatesHolder
Type: Interface

Methods:
- Map getCoordinates()
- CompletableFuture retrieveCoordinates()
- boolean isRetrievedCoords()

### Class: me.angeschossen.lands.api.framework.holder.SQLNameable
Type: Interface

Methods:
- String getName()
- String getTableName()

## Package: me.angeschossen.lands.api.framework.hopper

### Class: me.angeschossen.lands.api.framework.hopper.HopperConnection
Type: Interface

Methods:
- HopperWrapper getHopper()

### Class: me.angeschossen.lands.api.framework.hopper.HopperProvider
Type: Interface

Methods:
- String getName()
- HopperWrapper getHopper(World, int, int, int)
- boolean isEnabled()

### Class: me.angeschossen.lands.api.framework.hopper.HopperWrapper
Type: Interface

Methods:
- ItemStack addItem(ItemStack, boolean)
- boolean isFull()

### Class: me.angeschossen.lands.api.framework.hopper.PluginHopperProvider
Type: Interface
Implements: me.angeschossen.lands.api.framework.hopper.HopperProvider

Methods:
- Plugin getPlugin()

## Package: me.angeschossen.lands.api.framework.locale

### Class: me.angeschossen.lands.api.framework.locale.Environment
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Environment valueOf(String)
- **static** Environment[] values()

## Package: me.angeschossen.lands.api.framework.player

### Class: me.angeschossen.lands.api.framework.player.PlayerData
Type: Interface
Implements: me.angeschossen.lands.api.framework.player.PlayerDataBase

Methods:
- CommandSender getCommandSender()
- Player getPlayer()

### Class: me.angeschossen.lands.api.framework.player.PlayerDataBase
Type: Interface

Methods:
- ServerData getServer()
- GUIConfiguration getBedrockGUILocale()
- String getName()
- GUIConfiguration getGUILocale()
- UUID getUUID()
- Object sendMessage(String, String[], String[])
- Locale getLocale()
- Messages getMessages()

## Package: me.angeschossen.lands.api.framework.scheduling

### Class: me.angeschossen.lands.api.framework.scheduling.Scheduler
Type: Interface

Methods:
- CompletableFuture runTaskAtLocation(Location, Runnable)
- Task runTask(Runnable)
- Task runTaskAtEntityLater(Entity, Runnable, Runnable, long, TimeUnit)
- Task runTaskLaterAsynchronously(Runnable, long, TimeUnit)
- Task runTaskTimerAtLocation(Location, Runnable, long, long, TimeUnit)
- Task runTaskTimerAsynchronously(Runnable, long, long, TimeUnit)
- FutureTask runTaskAtLocationLater(Location, Runnable, long, TimeUnit)
- Task runTaskLater(Runnable, long, TimeUnit)
- Task runTaskAsynchronously(Runnable)
- CompletableFuture runTaskAtEntity(Entity, Runnable, Runnable)
- Task runTaskTimerAtEntity(Entity, Runnable, Runnable, long, long, TimeUnit)
- Task runTaskTimer(Runnable, long, long, TimeUnit)

## Package: me.angeschossen.lands.api.framework.scheduling.task

### Class: me.angeschossen.lands.api.framework.scheduling.task.FutureTask
Type: Interface
Implements: me.angeschossen.lands.api.framework.scheduling.task.Task

Methods:
- CompletableFuture getCompletableFuture()

### Class: me.angeschossen.lands.api.framework.scheduling.task.Task
Type: Interface

Methods:
- void cancel()
- boolean isCancelled()
- boolean isSync()

### Class: me.angeschossen.lands.api.framework.scheduling.task.EntityTaskResult
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** EntityTaskResult valueOf(String)
- **static** EntityTaskResult[] values()

## Package: me.angeschossen.lands.api.framework.server

### Class: me.angeschossen.lands.api.framework.server.ServerData
Type: Interface

Methods:
- long getLastSeenMillis()
- String getName()

## Package: me.angeschossen.lands.api.framework.trusted

### Class: me.angeschossen.lands.api.framework.trusted.RoleHolder
Type: Interface

Methods:
- boolean trustPlayer(UUID)
- void setName(String)
- void openMenu(PlayerData)
- String getName()
- SimpleRole getRole(UUID)
- UUID getOwner()
- boolean isAllowRegionMembers()
- Collection getTrusted()
- void setOwner(UUID)
- boolean untrustPlayer(UUID)
- String getDisplayName()
- void setRole(UUID, SimpleRole)
- void setAllowRegionMembers(boolean)
- boolean isTrusted(UUID)
- String getOwnerName()

### Class: me.angeschossen.lands.api.framework.trusted.SimpleRole
Type: Enum
Extends: java.lang.Enum

Methods:
- void setName(String)
- SimpleRole allow(ManagementFlag)
- SimpleRole allow(ActionFlag)
- void setRoleSettings(Set)
- String getName()
- void setManagementSettings(Set)
- **static** SimpleRole valueOf(String)
- **static** SimpleRole[] values()
- String getNamePlain()
- int getId()
- boolean canRoleSetting(Player, ActionFlag)
- boolean hasRoleSetting(ActionFlag)
- boolean hasManagement(ManagementFlag)
- SimpleRole getDemote()
- SimpleRole getPromote()
- **static** SimpleRole getById(int)
- int getPriority()
- boolean canManagement(Player, ManagementFlag)

## Package: me.angeschossen.lands.api.framework.trusted.group

### Class: me.angeschossen.lands.api.framework.trusted.group.Group
Type: Interface
Implements: me.angeschossen.lands.api.framework.trusted.RoleHolder

Methods:
- boolean isDefault()
- String getName()
- String getColorName()

### Class: me.angeschossen.lands.api.framework.trusted.group.GroupObject
Type: Interface

Methods:
- Enum getKey()
- String getName()
- ItemStack getIcon()

## Package: me.angeschossen.lands.api.framework.utils

### Class: me.angeschossen.lands.api.framework.utils.StringUtils
Type: Interface

Methods:
- String colorize(String)
- **static** String toLowerCase(String)
- **static** String toUpperCase(String)

### Class: me.angeschossen.lands.api.framework.utils.Checks
Type: Class

Methods:
- **static** Object requireNonNull(Object, String)
- **static** void isSync()

## Package: me.angeschossen.lands.api.handler

### Class: me.angeschossen.lands.api.handler.FlagFactory
Type: Interface

Methods:
- NaturalFlag naturalFlagOf(LandsIntegration, FlagTarget, String)
- RoleFlag roleFlagOf(LandsIntegration, FlagTarget, RoleFlagCategory, String)

### Class: me.angeschossen.lands.api.handler.LandsIntegrationFactory
Type: Interface

Methods:
- Selection selectionOf(LandPlayer, boolean, boolean, boolean)
- InboxMessage inboxMessageOf(LandsIntegration, MemberHolder, InboxCategory, String, String[], String[], boolean, boolean, LandPlayer)
- ItemStack buildCampItem(LandPlayer, int)
- CombatTag combatTagOf(LandsIntegration, LandPlayer, LandPlayer, long, boolean)
- CompletableFuture landOf(String, LandType, Location, LandPlayer, boolean, boolean)
- LandsIntegration of(Plugin)
- Role roleOf(RoleHolder, String)
- ItemStack buildItemStack(ItemType, LandPlayer)
- LandMainBlock landMainBlockOf(LandPlayer, BlockPosition)

### Class: me.angeschossen.lands.api.handler.MessageHandler
Type: Interface

Methods:
- Messages getMessagesLocale(LandPlayer)
- GUIConfiguration getGUILocale(LandPlayer)

### Class: me.angeschossen.lands.api.handler.APIHandler
Type: Class

Methods:
- **static** void init(Plugin, Configuration, ModuleConfig, ModuleConfig, MessageHandler, LevelsHandler, LandsIntegration, FlagRegistry, StringUtils, PlayerUtils)
- **static** LandsIntegrationFactory getLandsIntegrationFactory()
- ModuleConfig getNationsConfig()
- PlayerUtils getPlayerUtils()
- StringUtils getStringUtils()
- ModuleConfig getWarsConfig()
- Configuration getConfig()
- LevelsHandler getLevelsHandler()
- MessageHandler getLocaleHandler()
- LandsIntegration getLegacySupport()
- **static** FlagFactory getFlagFactory()
- **static** FlagRegistry getFlagRegistry()
- Plugin getPlugin()
- **static** APIHandler getInstance()
- **static** void setBase(LandsIntegrationFactory, FlagFactory, FlagRegistry)

## Package: me.angeschossen.lands.api.holders

### Class: me.angeschossen.lands.api.holders.BalanceHolder
Type: Interface

Methods:
- double getBalance()
- String getBalanceDisplay()
- boolean modifyBalance(double)
- boolean modifyBalance(double, boolean)
- boolean setBalance(double)

## Package: me.angeschossen.lands.api.inbox

### Class: me.angeschossen.lands.api.inbox.InboxMessage
Type: Interface
Implements: me.angeschossen.lands.api.framework.events.ExpressionEntity

Methods:
- String getDateString(PlayerData)
- boolean appliesToFilter(InboxCategory)
- String getText()
- String getText(PlayerData)
- long getTime()
- **static** InboxMessage of(LandsIntegration, MemberHolder, InboxCategory, String, String[], String[], boolean, boolean, LandPlayer)
- InboxCategory getCategory()
- boolean shouldAlertMembers()
- String getTextWithDate(PlayerData)
- String getTextWithDate()

### Class: me.angeschossen.lands.api.inbox.InboxMessageProvider
Type: Interface

Methods:
- String getRawMessage(String, PlayerData)

### Class: me.angeschossen.lands.api.inbox.InboxCategory
Type: Enum
Extends: java.lang.Enum

Methods:
- void setEnabled(boolean)
- String getName()
- String getName(LandPlayer)
- **static** InboxCategory getById(int)
- **static** InboxCategory valueOf(String)
- boolean isEnabled()
- **static** InboxCategory[] values()
- **static** InboxCategory getByPriority(int)
- int getId()
- InboxCategory getNext()

## Package: me.angeschossen.lands.api.integration

### Class: me.angeschossen.lands.api.integration.LandsIntegration
Type: Class
Implements: me.angeschossen.lands.api.LandsIntegration, me.angeschossen.lands.api.legacy.LandsIntegrator

Methods:
- void registerFlag(Flag)
- boolean isClaimedUnloaded(World, int, int)
- Land getLandByULID(ULID)
- Collection getNations()
- LandWorld getWorld(World)
- String getName()
- Land getLandUnloaded(World, int, int)
- void setInboxMessageProvider(InboxMessageProvider)
- void setWarHandler(WarHandler)
- Land getLandByName(String)
- Area getUnloadedArea(Location)
- Land getLandByChunk(World, int, int)
- LevelsHandler getLevelsHandler()
- Collection getLands()
- Configuration getConfiguration()
- SortingContext getSortingContext(String)
- int hashCode()
- CompletableFuture randomTeleport(LandPlayer, World)
- boolean isPublic()
- Nation getNationByName(String)
- boolean isClaimed(Location)
- CompletableFuture isClaimed(String, int, int)
- boolean isClaimed(World, int, int)
- LandPlayer getLandPlayer(UUID)
- boolean isChunkClaimed(World, int, int)
- LandWorld getLandWorld(World)
- LandWorld getLandWorld(String)
- Land getLand(String, String)
- Land getLand(int)
- Land getLand(String)
- Land getLand(Location)
- Land getLand(World, int, int)
- boolean canPvP(Player, Player, Location, boolean, boolean)
- Nation getNationById(int)
- Nation getNation(int)
- Nation getNation(String)
- boolean getAccess(String)
- boolean isChunkClaimedUnloaded(World, int, int)
- Land getLandByUnloadedChunk(World, int, int)
- CompletableFuture getOfflineLandPlayer(UUID)
- Long getPlayerCooldown(UUID, PlayerCooldown)
- Nation getNationByULID(ULID)
- MemberHolder getMemberholderByULID(ULID)
- Area getAreaByLoc(Location)
- InboxMessageProvider getInboxMessageProvider()
- void disable()
- void disable(String)
- boolean isEnabled()
- Plugin getPlugin()
- FlagRegistry getFlagRegistry()
- boolean equals(Object)
- Land getLandById(int)
- void onLoad(Runnable)
- String initialize()
- void wild(LandPlayer, World)
- LandArea getArea(Location)
- Area getArea(World, int, int, int)
- Area getArea(Location)

## Package: me.angeschossen.lands.api.items

### Class: me.angeschossen.lands.api.items.ItemType
Type: Enum
Extends: java.lang.Enum

Methods:
- ItemStack build(LandPlayer)
- **static** ItemType valueOf(String)
- **static** ItemType[] values()

## Package: me.angeschossen.lands.api.land

### Class: me.angeschossen.lands.api.land.Area
Type: Interface
Implements: me.angeschossen.lands.api.framework.events.ExpressionEntity, me.angeschossen.lands.api.land.SystemFlagStatesHolder, me.angeschossen.lands.api.land.TaxHolder, me.angeschossen.lands.api.role.RoleHolder

Methods:
- String getName()
- boolean banPlayer(UUID)
- RentalOfferBase getRentalOffer()
- int getId()
- Role getEntryRole()
- Set getNaturalFlags()
- ULID getULID()
- void setSpawn(Position)
- boolean untrustPlayer(UUID)
- boolean hasRoleFlag(UUID, RoleFlag)
- boolean hasRoleFlag(Player, RoleFlag, Material, boolean)
- boolean hasRoleFlag(LandPlayer, RoleFlag, Material, boolean)
- Collection getTrustedPlayers()
- boolean isBanned(UUID)
- boolean isTrusted(UUID)
- Collection getRoles()
- boolean trustPlayer(UUID)
- Land getLand()
- boolean hasNaturalFlag(NaturalFlag)
- boolean hasFlag(UUID, RoleFlag)
- boolean hasFlag(Player, RoleFlag, Material, boolean)
- boolean hasFlag(Player, RoleFlag, boolean)
- Position getSpawn()
- boolean canPvP(LandPlayer, LandPlayer, boolean)
- boolean toggleNaturalFlag(NaturalFlag)
- Role getRole(UUID)
- Role getRole(String)
- UUID getOwnerUID()
- UUID getTenant()
- Role getVisitorRole()
- boolean canEnter(LandPlayer, boolean)
- boolean isDefault()
- Invite getInvite(UUID)
- SystemFlagStates getSystemFlagStates(Player)
- void setRole(UUID, Role)
- void unbanPlayer(UUID)

### Class: me.angeschossen.lands.api.land.ChunkCoordinate
Type: Interface

Methods:
- int getX()
- int getZ()
- int getBlockZ()
- int getBlockX()

### Class: me.angeschossen.lands.api.land.Container
Type: Interface

Methods:
- Land getLand()
- LandWorld getWorld()
- boolean isInYLevel(int)
- boolean hasChunk(int, int)
- Collection getLandBlocks()
- Collection getAreas()
- LandBlock getLandBlock(Material, int, int, int)
- int getMaxY()
- Collection getChunks()
- int getMinY()

### Class: me.angeschossen.lands.api.land.Land
Type: Interface
Implements: me.angeschossen.lands.api.land.SystemFlagStatesHolder, me.angeschossen.lands.api.memberholder.MemberHolder

Methods:
- Inventory getItemStorage()
- Collection getOnlinePlayers()
- int getMaxMembers()
- String getName()
- boolean banPlayer(UUID)
- boolean hasArea(String)
- LandType getLandType()
- TrustedPlayer getTrustedPlayer(UUID)
- void setSpawn(Location)
- CompletableFuture delete(LandPlayer)
- CompletableFuture delete(LandPlayer, DeleteReason)
- void delete(Player)
- void setOwner(UUID)
- boolean untrustPlayer(UUID)
- double getUpkeepCosts()
- **static** CompletableFuture of(String, LandType, Location, LandPlayer, boolean, boolean)
- UnloadedPosition getSpawnPosition()
- String getTitleMessage(LandPlayer)
- boolean setBalance(double)
- boolean trustPlayer(UUID)
- Collection getContainers()
- Collection getSubAreas(World)
- Location getSpawn()
- Nation getNation()
- String getColorName()
- Container getContainer(World)
- boolean hasChunk(World, int, int)
- int getMaxChunks()
- int getMaxChunks(boolean)
- LandCategory getCategory()
- UUID getOwnerUID()
- boolean setLandType(LandType, LandPlayer)
- Collection getChunks(World)
- int getSize()
- double getBalance()
- CompletableFuture unclaimChunk(World, int, int, LandPlayer)
- CompletableFuture claimChunk(LandPlayer, World, int, int)
- boolean exists()
- void setTitleMessage(String)
- War getWar()
- Area getDefaultArea()
- boolean modifyBalance(double)
- void unbanPlayer(UUID)
- Area getArea(String)
- Area getArea(Location)

### Class: me.angeschossen.lands.api.land.LandArea
Type: Interface
Implements: me.angeschossen.lands.api.land.Area

Methods:
- boolean setName(String)
- boolean contains(int, int, int)
- World getWorld()
- Container getContainer()
- BoundingBox getBoundingBox()
- boolean isSetup()

### Class: me.angeschossen.lands.api.land.LandCategory
Type: Interface

Methods:
- String getName()
- List getDescription()

### Class: me.angeschossen.lands.api.land.LandWorld
Type: Interface

Methods:
- boolean isChunkLoaded(int, int)
- boolean hasNaturalFlag(Location, NaturalFlag)
- World getWorld()
- boolean hasFlag(Player, Location, Material, RoleFlag, boolean)
- String getName()
- boolean hasRoleFlag(LandPlayer, Location, RoleFlag, Material, boolean)
- boolean hasRoleFlag(Player, Location, RoleFlag, Material, boolean)
- boolean hasRoleFlag(UUID, Location, RoleFlag)
- boolean hasWildernessRoleFlag(LandPlayer, Location, RoleFlag, boolean)
- Land getLandByUnloadedChunk(int, int)
- Land getLandByChunk(int, int)
- ULID getULID()
- Area getAreaByUnloaded(int, int, int)
- Area getArea(Location)
- Area getArea(int, int, int)

### Class: me.angeschossen.lands.api.land.SystemFlagStatesHolder
Type: Interface

Methods:
- void removeSystemFlagStates(UUID)
- void setSystemFlagStates(LandPlayer, SystemFlagStates)

### Class: me.angeschossen.lands.api.land.TaxHolder
Type: Interface
Implements: me.angeschossen.lands.api.framework.holder.ChangeSaveable

Methods:
- String getName()
- String getColorName()
- String getColorName(CommandSender)
- void setTax(double)
- double getTax()
- double getEstimatedTaxRevenue(Object, boolean, boolean)
- double addTax(double)

## Package: me.angeschossen.lands.api.land.block

### Class: me.angeschossen.lands.api.land.block.LandBlock
Type: Interface

Methods:
- BlockPosition getCenter()
- LandBlockType getType()
- Container getContainer()
- boolean containsBlock(int, int, int)
- String getId()
- boolean remove(Runnable, int)

### Class: me.angeschossen.lands.api.land.block.LandMainBlock
Type: Interface
Implements: me.angeschossen.lands.api.land.block.LandBlock

Methods:
- **static** LandMainBlock of(LandPlayer, BlockPosition)

### Class: me.angeschossen.lands.api.land.block.LandBlockType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** LandBlockType valueOf(String)
- **static** LandBlockType[] values()

## Package: me.angeschossen.lands.api.land.block.removalreason

### Class: me.angeschossen.lands.api.land.block.removalreason.LandBlockRemovalReason
Type: Interface

No public methods found

### Class: me.angeschossen.lands.api.land.block.removalreason.BlockRemovalReason
Type: Enum
Extends: java.lang.Enum
Implements: me.angeschossen.lands.api.land.block.removalreason.LandBlockRemovalReason

Methods:
- **static** BlockRemovalReason valueOf(String)
- **static** BlockRemovalReason[] values()

## Package: me.angeschossen.lands.api.land.enums

### Class: me.angeschossen.lands.api.land.enums.LandGetMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** LandGetMode valueOf(String)
- **static** LandGetMode[] values()

### Class: me.angeschossen.lands.api.land.enums.LandSetting
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** void init()
- **static** LandSetting getById(int)
- **static** LandSetting valueOf(String)
- **static** LandSetting[] values()
- boolean isWilderness()
- int getId()
- boolean isDisplayable()
- boolean getStatus(boolean)
- **static** LandSetting getByCfgName(String)
- boolean isForceEnable()
- boolean isAllowInWar()
- String getCfgName()
- boolean isInverted()

### Class: me.angeschossen.lands.api.land.enums.LandType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** LandType getById(int)
- **static** LandType valueOf(String)
- **static** LandType[] values()

### Class: me.angeschossen.lands.api.land.enums.SettingMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** SettingMode valueOf(String)
- **static** SettingMode[] values()

### Class: me.angeschossen.lands.api.land.enums.SortMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** SortMode valueOf(String)
- **static** SortMode[] values()

## Package: me.angeschossen.lands.api.land.rental

### Class: me.angeschossen.lands.api.land.rental.InfoType
Type: Enum
Extends: java.lang.Enum

Methods:
- int getMaxTimeLength()
- **static** InfoType valueOf(String)
- **static** InfoType[] values()

## Package: me.angeschossen.lands.api.land.rental.offer.base

### Class: me.angeschossen.lands.api.land.rental.offer.base.AcceptedRentalOfferBase
Type: Interface
Implements: me.angeschossen.lands.api.land.rental.offer.base.RentalBase

Methods:
- double getCompensation()
- boolean expire()

### Class: me.angeschossen.lands.api.land.rental.offer.base.RentalBase
Type: Interface

Methods:
- LandBlock getBlock()
- long getSize()
- void sendInfo(LandPlayer)
- RentalType getType()
- List getInfoLines(InfoType)
- double getCost()
- Area getArea()

### Class: me.angeschossen.lands.api.land.rental.offer.base.RentalOfferBase
Type: Interface
Implements: me.angeschossen.lands.api.land.rental.offer.base.RentalBase

No public methods found

## Package: me.angeschossen.lands.api.land.rental.offer.types

### Class: me.angeschossen.lands.api.land.rental.offer.types.RentOffer
Type: Interface
Implements: me.angeschossen.lands.api.land.rental.offer.base.RentalOfferBase

Methods:
- int getMaxMinutes()
- int getMinutes()

### Class: me.angeschossen.lands.api.land.rental.offer.types.RentedState
Type: Interface
Implements: me.angeschossen.lands.api.land.rental.offer.base.AcceptedRentalOfferBase, me.angeschossen.lands.api.land.rental.offer.types.RentOffer

Methods:
- void modifyRentedMinutes(int)
- int getRentedMinutes()
- void setRemoveAfterExpiration(boolean)
- int getMaxAdditiveMinutes()
- boolean isRemoveAfterExpiration()

### Class: me.angeschossen.lands.api.land.rental.offer.types.SellOffer
Type: Interface
Implements: me.angeschossen.lands.api.land.rental.offer.base.RentalOfferBase

No public methods found

### Class: me.angeschossen.lands.api.land.rental.offer.types.SoldState
Type: Interface
Implements: me.angeschossen.lands.api.land.rental.offer.base.AcceptedRentalOfferBase, me.angeschossen.lands.api.land.rental.offer.types.SellOffer

No public methods found

### Class: me.angeschossen.lands.api.land.rental.offer.types.RentalType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** RentalType valueOf(String)
- **static** RentalType[] values()
- boolean isCompleted()

## Package: me.angeschossen.lands.api.legacy

### Class: me.angeschossen.lands.api.legacy.LandsIntegrator
Type: Interface

Methods:
- void registerFlag(Flag)
- boolean isClaimedUnloaded(World, int, int)
- Collection getNations()
- String getName()
- Land getLandUnloaded(World, int, int)
- LevelsHandler getLevelsHandler()
- Collection getLands()
- SortingContext getSortingContext(String)
- boolean isPublic()
- boolean isClaimed(Location)
- CompletableFuture isClaimed(String, int, int)
- boolean isClaimed(World, int, int)
- LandPlayer getLandPlayer(UUID)
- boolean isChunkClaimed(World, int, int)
- LandWorld getLandWorld(World)
- LandWorld getLandWorld(String)
- Land getLand(String, String)
- Land getLand(int)
- Land getLand(String)
- Land getLand(Location)
- Land getLand(World, int, int)
- boolean canPvP(Player, Player, Location, boolean, boolean)
- Nation getNation(int)
- Nation getNation(String)
- boolean getAccess(String)
- boolean isChunkClaimedUnloaded(World, int, int)
- CompletableFuture getOfflineLandPlayer(UUID)
- Area getAreaByLoc(Location)
- void disable()
- void disable(String)
- boolean isEnabled()
- Plugin getPlugin()
- FlagRegistry getFlagRegistry()
- void onLoad(Runnable)
- String initialize()
- void wild(LandPlayer, World)
- LandArea getArea(Location)
- Area getArea(World, int, int, int)

## Package: me.angeschossen.lands.api.levels

### Class: me.angeschossen.lands.api.levels.Level
Type: Interface
Implements: me.angeschossen.lands.api.framework.events.ExpressionEntity

Methods:
- Level getPrevious()
- Collection getRequirements()
- int getPosition()
- String getName()
- void addAttribute(LevelAttribute)
- Level getNext()
- boolean matches(MemberHolder)
- float getProgress(MemberHolder)
- void addRequirement(Requirement)

### Class: me.angeschossen.lands.api.levels.LevelsHandler
Type: Interface

Methods:
- boolean isCachedLandRequirement(String)
- List getLandLevels()
- List getNationLevels()
- void registerCachedNationRequirement(CachedRequirement)
- boolean isCachedNationRequirement(String)
- void registerCachedLandRequirement(CachedRequirement)
- Map getNationSection()
- Map getLandSection()

### Class: me.angeschossen.lands.api.levels.Requirement
Type: Interface

Methods:
- float getValue(MemberHolder)
- String getTitle()
- String getName()
- Plugin getPlugin()
- boolean matches(MemberHolder)
- List getDescription()
- float getProgress(MemberHolder)
- String getProgressDisplay(MemberHolder)
- float getRequired()

## Package: me.angeschossen.lands.api.levels.attribute

### Class: me.angeschossen.lands.api.levels.attribute.LevelAttribute
Type: Abstract Class

Methods:
- String getAttributeDescription()
- String getName()
- boolean shouldApply(MemberHolder)

## Package: me.angeschossen.lands.api.levels.attribute.impl

### Class: me.angeschossen.lands.api.levels.attribute.impl.ChunksAttribute
Type: Class
Extends: me.angeschossen.lands.api.levels.attribute.LevelAttribute

Methods:
- int getValue()
- boolean shouldApply(MemberHolder)

### Class: me.angeschossen.lands.api.levels.attribute.impl.EffectsAmountAttribute
Type: Class
Extends: me.angeschossen.lands.api.levels.attribute.LevelAttribute

Methods:
- int getValue()
- boolean shouldApply(MemberHolder)

### Class: me.angeschossen.lands.api.levels.attribute.impl.EffectsAttribute
Type: Class
Extends: me.angeschossen.lands.api.levels.attribute.LevelAttribute

Methods:
- List getEffects()
- boolean shouldApply(MemberHolder)

### Class: me.angeschossen.lands.api.levels.attribute.impl.UpkeepAttribute
Type: Class
Extends: me.angeschossen.lands.api.levels.attribute.LevelAttribute

Methods:
- double getValue()
- double modifyUpkeep(double)
- boolean shouldApply(MemberHolder)

## Package: me.angeschossen.lands.api.levels.requirement

### Class: me.angeschossen.lands.api.levels.requirement.CachedRequirement
Type: Abstract Class
Extends: me.angeschossen.lands.api.levels.requirement.Requirement

Methods:
- float getValue(MemberHolder)
- float retrieveValue(MemberHolder)

### Class: me.angeschossen.lands.api.levels.requirement.Requirement
Type: Abstract Class
Implements: me.angeschossen.lands.api.levels.Requirement

Methods:
- String getTitle()
- String getName()
- Plugin getPlugin()
- List getDescription()
- boolean matches(MemberHolder)
- float getProgress(MemberHolder)
- String getProgressDisplay(MemberHolder)
- float getRequired()

## Package: me.angeschossen.lands.api.memberholder

### Class: me.angeschossen.lands.api.memberholder.CMDTarget
Type: Interface

Methods:
- **static** String parseCMDName(String)
- String getCMDName()

### Class: me.angeschossen.lands.api.memberholder.MemberHolder
Type: Interface
Implements: me.angeschossen.lands.api.framework.events.ExpressionEntity, me.angeschossen.lands.api.framework.holder.Changeable, me.angeschossen.lands.api.holders.BalanceHolder, me.angeschossen.lands.api.memberholder.CMDTarget

Methods:
- boolean setName(LandPlayer, String)
- Integer getWebMapFillColor()
- WarStats getStats()
- Collection getOnlinePlayers()
- String getName()
- boolean hasWarshield()
- void removeInboxMessage(InboxMessage)
- boolean isWarField()
- List getInbox()
- List getInbox(InboxCategory)
- int getId()
- String getExpressionPrefix()
- float getCachedRequirement(String)
- String getServerName()
- Collection getAllies()
- ULID getULID()
- void updateRequirementCache(String, float)
- void updateRequirementCache(String, float, boolean)
- Integer getWebMapBorderColor()
- Timestamp getCreatedAt()
- boolean isEnemy(MemberHolder)
- int getMembersAmount()
- Collection getTrustedPlayers()
- void setWarShield(long)
- String getWarName()
- String getWarName(PlayerDataBase)
- boolean isInWar()
- boolean hasWarEntity(MemberHolder)
- boolean isTrusted(LandPlayer)
- boolean isTrusted(UUID)
- long getLastCaptureFlagPlacement()
- boolean isAlly(MemberHolder)
- int getChunksAmount()
- boolean isRequirementCached(String)
- String getColorName()
- long getWarshield()
- Collection getOnlineLandPlayers()
- CompletableFuture modifyRequirementCache(String, float, boolean)
- CompletableFuture calculateLevel(boolean)
- void addWarshield(long)
- WarTeam getWarTeam()
- UUID getOwnerUID()
- void sendMessage(UUID, String, LandChatEvent$MessageSource)
- Collection getEnemies()
- Level getLevel()
- HolderType getType()
- CompletableFuture leaveWar()
- long getCreationTime()
- boolean exists()
- War getWar()
- Relation getRelation(UUID)
- Relation getRelation(MemberHolder)

### Class: me.angeschossen.lands.api.memberholder.HolderType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** HolderType valueOf(String)
- **static** HolderType[] values()

## Package: me.angeschossen.lands.api.membershiprequest

### Class: me.angeschossen.lands.api.membershiprequest.LandMemberShipRequest
Type: Interface

Methods:
- UUID getPlayerUUID()

### Class: me.angeschossen.lands.api.membershiprequest.MemberShipRequest
Type: Interface

Methods:
- Timestamp getTime()

### Class: me.angeschossen.lands.api.membershiprequest.NationMemberShipRequest
Type: Interface

Methods:
- Land getLand()

## Package: me.angeschossen.lands.api.nation

### Class: me.angeschossen.lands.api.nation.Nation
Type: Interface
Implements: me.angeschossen.lands.api.memberholder.MemberHolder

Methods:
- Land getCapital()
- boolean removeLand(Land, LandPlayer)
- boolean addLand(Land, LandPlayer)
- boolean isMember(Land)
- CompletableFuture delete(LandPlayer)
- Collection getLands()
- void setCapital(Land)

## Package: me.angeschossen.lands.api.nation.invite

### Class: me.angeschossen.lands.api.nation.invite.NationInvite
Type: Interface
Implements: me.angeschossen.lands.api.framework.holder.Changeable

Methods:
- void deny()
- Land getReceiver()
- void revoke()
- Nation getSender()
- boolean accept()

## Package: me.angeschossen.lands.api.player

### Class: me.angeschossen.lands.api.player.LandPlayer
Type: Interface
Implements: me.angeschossen.lands.api.framework.events.ExpressionEntity, me.angeschossen.lands.api.framework.player.PlayerData, me.angeschossen.lands.api.player.OfflinePlayer

Methods:
- Land getLand(String)
- boolean hasInvite(String)
- Land getOwningLand()
- void setChatMode(ChatMode)
- int getSupportClaimsPerLand()
- Player getPlayer()
- boolean hasFlag(PlayerFlag)
- CombatTag getCombatTag()
- Set getWars()
- Object sendMessage(String, String[], String[])
- boolean toggleFlag(PlayerFlag)
- boolean ownsLand()
- Selection getSelection()
- Collection getInvites()
- ChatMode getChatMode()
- Invite getInvite(String)
- Invite getInvite(Land)
- Land getEditLand(boolean)
- boolean isInWar()
- boolean isInWar(War)
- void setEditLand(Land)

### Class: me.angeschossen.lands.api.player.OfflinePlayer
Type: Interface

Methods:
- UUID getUID()
- int getSize()
- String getName()
- Land getEditLand()
- Collection getLands()

### Class: me.angeschossen.lands.api.player.Selection
Type: Interface

Methods:
- BlockCoordinate getPos2()
- void setPos1(Location)
- int getSize()
- void disable()
- boolean hasChunk(int, int)
- boolean isValid(boolean)
- BlockCoordinate getPos1()
- **static** Selection of(LandPlayer, boolean, boolean, boolean)
- CompletableFuture claim(Land, boolean, boolean)
- Collection getChunks()
- Collection getChunks(BiPredicate)
- void setPos2(Location)
- boolean isComplete()

### Class: me.angeschossen.lands.api.player.TrustedPlayer
Type: Interface

Methods:
- UUID getUID()
- boolean isTrustedWholeLand()
- int getSupportClaims()
- int getTrustedSize()

### Class: me.angeschossen.lands.api.player.Visualization
Type: Interface

Methods:
- boolean isPermanent()
- boolean hasNext()

### Class: me.angeschossen.lands.api.player.PlayerCooldown
Type: Enum
Extends: java.lang.Enum

Methods:
- String getBypass()
- PlayerCooldown$ConfigType getConfigType()
- long getTime()
- **static** PlayerCooldown valueOf(String)
- **static** PlayerCooldown[] values()
- void setTime(long)

### Class: me.angeschossen.lands.api.player.PlayerCooldown$ConfigType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PlayerCooldown$ConfigType valueOf(String)
- **static** PlayerCooldown$ConfigType[] values()

## Package: me.angeschossen.lands.api.player.chat

### Class: me.angeschossen.lands.api.player.chat.ChatMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ChatMode valueOf(String)
- **static** ChatMode[] values()

## Package: me.angeschossen.lands.api.player.claiming

### Class: me.angeschossen.lands.api.player.claiming.ClaimResult
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClaimResult valueOf(String)
- **static** ClaimResult[] values()

## Package: me.angeschossen.lands.api.player.combat

### Class: me.angeschossen.lands.api.player.combat.CombatTag
Type: Interface

Methods:
- LandPlayer getTarget()
- long getDuration()
- **static** CombatTag of(LandsIntegration, LandPlayer, LandPlayer, long, boolean)
- LandPlayer getAttacker()
- void remove()
- long getTimeLeft()

## Package: me.angeschossen.lands.api.player.invite

### Class: me.angeschossen.lands.api.player.invite.Invite
Type: Interface
Implements: me.angeschossen.lands.api.framework.holder.Changeable

Methods:
- Land getLand()
- void deny()
- UUID getReceiver()
- long getTime()
- InviteIntent getIntent()
- UUID getSender()
- CompletableFuture accept(LandPlayer)

### Class: me.angeschossen.lands.api.player.invite.InviteIntent
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** InviteIntent valueOf(String)
- **static** InviteIntent[] values()

## Package: me.angeschossen.lands.api.player.invite.result

### Class: me.angeschossen.lands.api.player.invite.result.InviteResult
Type: Interface

Methods:
- boolean isSuccess()

### Class: me.angeschossen.lands.api.player.invite.result.MergeRequestResult
Type: Enum
Extends: java.lang.Enum
Implements: me.angeschossen.lands.api.player.invite.result.InviteResult

Methods:
- **static** MergeRequestResult valueOf(String)
- **static** MergeRequestResult[] values()
- boolean isSuccess()

### Class: me.angeschossen.lands.api.player.invite.result.TrustResult
Type: Enum
Extends: java.lang.Enum
Implements: me.angeschossen.lands.api.player.invite.result.InviteResult

Methods:
- **static** TrustResult valueOf(String)
- **static** TrustResult[] values()
- boolean isSuccess()

## Package: me.angeschossen.lands.api.player.invite.type

### Class: me.angeschossen.lands.api.player.invite.type.MergeRequest
Type: Interface
Implements: me.angeschossen.lands.api.player.invite.Invite

No public methods found

### Class: me.angeschossen.lands.api.player.invite.type.OwnerInvite
Type: Interface
Implements: me.angeschossen.lands.api.player.invite.Invite

No public methods found

### Class: me.angeschossen.lands.api.player.invite.type.TrustInvite
Type: Interface
Implements: me.angeschossen.lands.api.player.invite.Invite

Methods:
- boolean isWholeLand()

## Package: me.angeschossen.lands.api.relations

### Class: me.angeschossen.lands.api.relations.RelationRequest
Type: Interface
Implements: me.angeschossen.lands.api.framework.holder.Changeable

Methods:
- Relation getIntent()

### Class: me.angeschossen.lands.api.relations.Relation
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Relation valueOf(String)
- **static** Relation[] values()

## Package: me.angeschossen.lands.api.role

### Class: me.angeschossen.lands.api.role.Role
Type: Interface
Implements: me.angeschossen.lands.api.framework.events.ExpressionEntity

Methods:
- void setName(String)
- boolean hasFlag(RoleFlag)
- String getName()
- Set getActionFlags()
- String getColorName()
- Role getHigherPriorityRole(boolean, boolean)
- boolean toggleFlag(RoleFlag)
- CompletableFuture delete()
- ULID getULID()
- ItemStack getIcon()
- void setIcon(ItemStack)
- boolean isDeleteable()
- void swapPriority(Role)
- RoleType getType()
- Set getManagementFlags()
- Role getLowerPriorityRole(boolean, boolean)
- **static** Role of(RoleHolder, String)
- int getPriority()
- boolean isVisitorRole()
- RoleHolder getHolder()

### Class: me.angeschossen.lands.api.role.RoleHolder
Type: Interface

No public methods found

## Package: me.angeschossen.lands.api.role.enums

### Class: me.angeschossen.lands.api.role.enums.EditPlayerResponse
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** EditPlayerResponse valueOf(String)
- **static** EditPlayerResponse[] values()

### Class: me.angeschossen.lands.api.role.enums.RoleType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** RoleType valueOf(String)
- **static** RoleType[] values()
- int getId()
- boolean canPriorityBeChanged()
- boolean canHaveMembers()
- boolean isSystem()
- boolean canApply()
- boolean isLand()
- boolean paysTaxes()
- boolean isDeleteable()
- **static** RoleType getById(int)
- boolean canBeSet()
- void setDeleteable(boolean)
- boolean canMultiple()

## Package: me.angeschossen.lands.api.role.system

### Class: me.angeschossen.lands.api.role.system.SystemFlagStates
Type: Class

Methods:
- boolean hasFlag(RoleFlag)
- LandsIntegration getIntegration()

## Package: me.angeschossen.lands.api.sorting

### Class: me.angeschossen.lands.api.sorting.SortingContext
Type: Interface

Methods:
- List getTargets()
- void addSorting(Sorting)
- Collection getSortings()
- Sorting getSortingModeById(String)
- String getId()
- Sorting getNext(Sorting)

### Class: me.angeschossen.lands.api.sorting.Sorting
Type: Abstract Class
Implements: java.util.Comparator

Methods:
- String getEmoji()
- String getDisplayName()
- String getDisplayName(LandPlayer)
- String handleParseHologramLine(int)
- Object get(int)
- List get()
- void replace(Object, Object)
- String[][] handleParseMenuItem(int, Object)
- String[][] handleParseMenuItem(int)
- String getId()
- void sort()
- int getPlace(Object)
- String[] handleParseSignLines(int)
- String[] getPlaceholders()
- void remove(Object)

## Package: me.angeschossen.lands.api.utils

### Class: me.angeschossen.lands.api.utils.PlayerUtils
Type: Interface

Methods:
- String getName(UUID)

## Package: me.angeschossen.lands.api.war

### Class: me.angeschossen.lands.api.war.ActiveWarStats
Type: Interface
Implements: me.angeschossen.lands.api.war.WarStats

Methods:
- int getPoints()
- float getProgress(WarState)

### Class: me.angeschossen.lands.api.war.War
Type: Interface
Implements: me.angeschossen.lands.api.framework.events.ExpressionEntity, me.angeschossen.lands.api.war.WarState

Methods:
- Collection getPlacedByTeam(WarTeam)
- WarStats getStats(WarTeam)
- boolean hasFlag(Land, LandPlayer, RoleFlag, Material, boolean)
- double getReward(MemberHolder)
- ActiveWarStats getDefenderStats()
- ActiveWarStats getAttackerStats()
- void addOnlinePlayer(LandPlayer)
- WarPlayer getWarPlayer(LandPlayer)
- Collection getOnlineDefenders()
- Collection getOnlineAttackers()
- Collection getCaptureFlags()
- boolean isParticipating(LandPlayer)
- Timestamp getStarted()
- boolean isEndingSoon()
- MemberHolder getWinner()
- void setStarted(long)
- CompletableFuture end()
- CompletableFuture end(MemberHolder, boolean, double)
- void removeOnlinePlayer(LandPlayer, boolean)
- void updateStats(ActiveWarStats, ActiveWarStats)

### Class: me.angeschossen.lands.api.war.WarState
Type: Interface
Implements: me.angeschossen.lands.api.framework.holder.Changeable

Methods:
- void broadcast(String, String[], Function, boolean)
- void sendCurrentInfo(LandPlayer)
- void setTribute(double)
- boolean hasFlag(WarSetting)
- void removeFromBothParties()
- double getTribute(MemberHolder)
- double getTribute()
- boolean shouldServerTick()
- int getId()
- double getMaxTribute(WarTeam)
- MemberHolder getMemberHolder(WarTeam)
- void onMemberHolderUpdated(MemberHolder, MemberHolder)
- CompletableFuture delete()
- ULID getULID()
- long getTimeLeft()
- String getTimeLeftFormatted(PlayerDataBase)
- MemberHolder getDefender()
- boolean isParticipating(MemberHolder)
- MemberHolder getEnemy(UUID)
- MemberHolder getEnemy(MemberHolder)
- WarStatus getState()
- WarTeam getTeam(MemberHolder)
- WarTeam getTeam(LandPlayer)
- MemberHolder[] getEntities()
- float getPointsToWin()
- MemberHolder getAttacker()
- CompletableFuture surrender(MemberHolder, LandPlayer)

### Class: me.angeschossen.lands.api.war.WarStats
Type: Interface

Methods:
- int getCaptures()
- void setKills(int)
- void setCaptures(int)
- void modifyPoints(int)
- double getWLRatio()
- int getLost()
- int getWon()
- float getPointsTotal()
- int getDeaths()
- int getKills()
- double getKDRatio()
- void setDeaths(int)
- int getPointsAdditional()

## Package: me.angeschossen.lands.api.war.captureflag

### Class: me.angeschossen.lands.api.war.captureflag.CaptureFlag
Type: Interface
Implements: me.angeschossen.lands.api.framework.events.ExpressionEntity

Methods:
- WarTeam getPlacedByTeam()
- void atUnload()
- void setSecondsToHold(long)
- void setFireworkSpawnInterval(long)
- BoundingBox getBoundingBox()
- long getSecondsHeld()
- long getLastFireworkSpawned()
- BlockPosition getPosition()
- void setEvaluateCapturingTeam(Callable)
- long getSecondsToHold()
- WarTeam getCapturingTeam()
- War getWar()
- boolean modifyProgress(long)
- CompletableFuture breakCaptureFlag(LandPlayer, boolean, boolean, boolean, CaptureFlagBreakEvent$BreakReason)
- CompletableFuture breakCaptureFlag(LandPlayer, boolean, boolean, boolean, boolean, CaptureFlagBreakEvent$BreakReason)

## Package: me.angeschossen.lands.api.war.declaration

### Class: me.angeschossen.lands.api.war.declaration.MutualDeclaration
Type: Interface
Implements: me.angeschossen.lands.api.war.declaration.WarDeclaration

No public methods found

### Class: me.angeschossen.lands.api.war.declaration.WarDeclaration
Type: Interface
Implements: me.angeschossen.lands.api.war.WarState

Methods:
- void setTribute(double)
- double getTribute()
- CompletableFuture start()
- boolean startsSoon()
- double getMaxTribute(WarTeam)

## Package: me.angeschossen.lands.api.war.enums

### Class: me.angeschossen.lands.api.war.enums.WarResult
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WarResult valueOf(String)
- **static** WarResult[] values()

### Class: me.angeschossen.lands.api.war.enums.WarSetting
Type: Enum
Extends: java.lang.Enum

Methods:
- void setEnabled()
- **static** WarSetting getById(int)
- **static** WarSetting valueOf(String)
- boolean isEnabled()
- **static** WarSetting[] values()
- int getId()

### Class: me.angeschossen.lands.api.war.enums.WarStatus
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WarStatus valueOf(String)
- **static** WarStatus[] values()

### Class: me.angeschossen.lands.api.war.enums.WarTeam
Type: Enum
Extends: java.lang.Enum

Methods:
- void ensureIsAttackerOrDefender()
- **static** WarTeam valueOf(String)
- **static** WarTeam[] values()
- WarTeam getOpposite()

## Package: me.angeschossen.lands.api.war.player

### Class: me.angeschossen.lands.api.war.player.WarPlayer
Type: Interface

Methods:
- void setScoreboard(Scoreboard)
- Scoreboard getScoreboard()
- LandPlayer getLandPlayer()
- void removeMenuAndScoreboard(Scoreboard)

## Package: me.angeschossen.lands.api.war.storage

### Class: me.angeschossen.lands.api.war.storage.WarHandler
Type: Interface

Methods:
- War createInstance(War)
- CompletableFuture deleteWarFromDatabase(War)
- Collection getAllWarsFromDatabase(Collection)
- LandsIntegration getIntegration()

