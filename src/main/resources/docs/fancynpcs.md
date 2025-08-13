# FancyNpcs-2.7.0-de-oliver-fancynpcs-api API Reference

**Package Filter:** `de.oliver.fancynpcs.api`

## Package: de.oliver.fancynpcs.api

### Class: de.oliver.fancynpcs.api.AttributeManager
Type: Interface

Methods:
- List getAllAttributesForEntityType(EntityType)
- List getAllAttributes()
- NpcAttribute getAttributeByName(EntityType, String)
- void registerAttribute(NpcAttribute)

### Class: de.oliver.fancynpcs.api.FancyNpcsConfig
Type: Interface

Methods:
- int getRemoveNpcsFromPlayerlistDelay()
- boolean isSkipInvisibleNpcs()
- Map getMaxNpcsPerPermission()
- int getVisibilityDistance()
- String getMineSkinApiKey()
- boolean isMuteVersionNotification()
- boolean isInteractionCooldownMessageDisabled()
- List getBlockedCommands()
- int getAutoSaveInterval()
- boolean isEnableAutoSave()
- boolean setTurnToPlayerDistance(int)
- int getTurnToPlayerDistance()
- int getNpcUpdateVisibilityInterval()
- int getNpcUpdateInterval()
- boolean isTurnToPlayerResetToInitialDirection()

### Class: de.oliver.fancynpcs.api.FancyNpcsPlugin
Type: Interface

Methods:
- AttributeManager getAttributeManager()
- ScheduledExecutorService getNpcThread()
- SkinManager getSkinManager()
- FancyNpcsConfig getFancyNpcConfig()
- Thread newThread(String, Runnable)
- ActionManager getActionManager()
- NpcManager getNpcManager()
- ExtendedFancyLogger getFancyLogger()
- JavaPlugin getPlugin()
- **static** FancyNpcsPlugin get()
- FancyScheduler getScheduler()
- Translator getTranslator()
- Function getNpcAdapter()

### Class: de.oliver.fancynpcs.api.NpcManager
Type: Interface

Methods:
- Collection getAllNpcs()
- Npc getNpcById(String)
- void removeNpc(Npc)
- Npc getNpc(int)
- Npc getNpc(String)
- Npc getNpc(String, UUID)
- void registerNpc(Npc)
- void loadNpcs()
- void reloadNpcs()
- void saveNpcs(boolean)

### Class: de.oliver.fancynpcs.api.Npc
Type: Abstract Class

Methods:
- Map getIsVisibleForPlayer()
- void move(Player, boolean)
- void move(Player)
- Map getLastPlayerInteraction()
- void interact(Player)
- void interact(Player, ActionTrigger)
- void update(Player)
- void lookAt(Player, Location)
- float getEyeHeight()
- void setDirty(boolean)
- void remove(Player)
- Map getIsTeamCreated()
- void setSaveToFile(boolean)
- boolean isDirty()
- void spawn(Player)
- boolean isSaveToFile()
- void removeForAll()
- void checkAndUpdateVisibility(Player)
- void create()
- int getEntityId()
- void spawnForAll()
- Map getIsLookingAtPlayer()
- void moveForAll(boolean)
- void moveForAll()
- NpcData getData()
- void updateForAll()

### Class: de.oliver.fancynpcs.api.NpcAttribute
Type: Class

Methods:
- boolean isValidValue(String)
- List getPossibleValues()
- String getName()
- void apply(Npc, String)
- List getTypes()

### Class: de.oliver.fancynpcs.api.NpcData
Type: Class

Methods:
- NpcData setMirrorSkin(boolean)
- NpcData addEquipment(NpcEquipmentSlot, ItemStack)
- Location getLocation()
- boolean isMirrorSkin()
- String getName()
- NpcData setActions(Map)
- NpcData setActions(ActionTrigger, List)
- int getVisibilityDistance()
- NpcData setSkinData(SkinData)
- Map getActions()
- List getActions(ActionTrigger)
- String getId()
- Consumer getOnClick()
- NpcData setGlowing(boolean)
- NpcData setDisplayName(String)
- NpcData setOnClick(Consumer)
- Map getEquipment()
- void setDirty(boolean)
- NpcData addAction(ActionTrigger, int, NpcAction, String)
- NpcData setCollidable(boolean)
- boolean isCollidable()
- boolean isDirty()
- int getTurnToPlayerDistance()
- NpcData setInteractionCooldown(float)
- NpcData setLocation(Location)
- boolean isGlowing()
- NamedTextColor getGlowingColor()
- NpcData setSpawnEntity(boolean)
- NpcData removeAction(ActionTrigger, NpcAction)
- Map getAttributes()
- NpcData setShowInTab(boolean)
- NpcData setEquipment(Map)
- NpcData setScale(float)
- boolean isSpawnEntity()
- SkinData getSkinData()
- NpcData setType(EntityType)
- NpcData setTurnToPlayer(boolean)
- UUID getCreator()
- NpcData setVisibilityDistance(int)
- float getInteractionCooldown()
- NpcData setSkin(String, SkinData$SkinVariant)
- NpcData setSkin(String)
- NpcData setTurnToPlayerDistance(int)
- void addAttribute(NpcAttribute, String)
- float getScale()
- void applyAllAttributes(Npc)
- EntityType getType()
- String getDisplayName()
- NpcData setGlowingColor(NamedTextColor)
- boolean isShowInTab()
- boolean isTurnToPlayer()

## Package: de.oliver.fancynpcs.api.actions

### Class: de.oliver.fancynpcs.api.actions.ActionManager
Type: Interface

Methods:
- void registerAction(NpcAction)
- NpcAction getActionByName(String)
- List getAllActions()
- void unregisterAction(NpcAction)

### Class: de.oliver.fancynpcs.api.actions.ActionTrigger
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ActionTrigger valueOf(String)
- **static** ActionTrigger[] values()
- **static** ActionTrigger getByName(String)

### Class: de.oliver.fancynpcs.api.actions.NpcAction
Type: Abstract Class

Methods:
- String getName()
- boolean requiresValue()
- void execute(ActionExecutionContext, String)

### Class: de.oliver.fancynpcs.api.actions.NpcAction$NpcActionData
Type: Class
Extends: java.lang.Record

Methods:
- int hashCode()
- boolean equals(Object)
- NpcAction action()
- String toString()
- String value()
- int order()

## Package: de.oliver.fancynpcs.api.actions.executor

### Class: de.oliver.fancynpcs.api.actions.executor.ActionExecutionContext
Type: Class

Methods:
- Player getPlayer()
- ActionTrigger getTrigger()
- Npc getNpc()
- int getActionIndex()
- boolean isTerminated()
- void reset()
- List getActions()
- boolean hasNext()
- void run(int)
- void terminate()
- UUID getPlayerUUID()
- boolean shouldBlockUntilDone()
- void runNext()

### Class: de.oliver.fancynpcs.api.actions.executor.ActionExecutor
Type: Class

Methods:
- **static** void execute(ActionTrigger, Npc, Player)

## Package: de.oliver.fancynpcs.api.actions.types

### Class: de.oliver.fancynpcs.api.actions.types.BlockUntilDoneAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext, String)

### Class: de.oliver.fancynpcs.api.actions.types.ConsoleCommandAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext, String)

### Class: de.oliver.fancynpcs.api.actions.types.ExecuteRandomActionAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext, String)

### Class: de.oliver.fancynpcs.api.actions.types.MessageAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext, String)

### Class: de.oliver.fancynpcs.api.actions.types.NeedPermissionAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext, String)

### Class: de.oliver.fancynpcs.api.actions.types.PlaySoundAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext, String)

### Class: de.oliver.fancynpcs.api.actions.types.PlayerCommandAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext, String)

### Class: de.oliver.fancynpcs.api.actions.types.PlayerCommandAsOpAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext, String)

### Class: de.oliver.fancynpcs.api.actions.types.SendToServerAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext, String)

### Class: de.oliver.fancynpcs.api.actions.types.WaitAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext, String)

## Package: de.oliver.fancynpcs.api.events

### Class: de.oliver.fancynpcs.api.events.NpcCreateEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Npc getNpc()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- CommandSender getCreator()

### Class: de.oliver.fancynpcs.api.events.NpcInteractEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- Npc getNpc()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- List getActions()
- Consumer getOnClick()
- ActionTrigger getInteractionType()

### Class: de.oliver.fancynpcs.api.events.NpcModifyEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Npc getNpc()
- HandlerList getHandlers()
- void setCancelled(boolean)
- NpcModifyEvent$NpcModification getModification()
- CommandSender getModifier()
- **static** HandlerList getHandlerList()
- Object getNewValue()

### Class: de.oliver.fancynpcs.api.events.NpcModifyEvent$NpcModification
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** NpcModifyEvent$NpcModification valueOf(String)
- **static** NpcModifyEvent$NpcModification[] values()

### Class: de.oliver.fancynpcs.api.events.NpcRemoveEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Npc getNpc()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- CommandSender getSender()

### Class: de.oliver.fancynpcs.api.events.NpcSpawnEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- Npc getNpc()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancynpcs.api.events.NpcStartLookingEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- Npc getNpc()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancynpcs.api.events.NpcStopLookingEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- Npc getNpc()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancynpcs.api.events.NpcsLoadedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancynpcs.api.events.PacketReceivedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- Object getPacket()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: de.oliver.fancynpcs.api.skins

### Class: de.oliver.fancynpcs.api.skins.SkinManager
Type: Interface

Methods:
- SkinData getByIdentifier(String, SkinData$SkinVariant)
- SkinData getByFile(String, SkinData$SkinVariant)
- SkinData getByURL(String, SkinData$SkinVariant)
- SkinData getByUsername(String, SkinData$SkinVariant)
- SkinData getByUUID(UUID, SkinData$SkinVariant)

### Class: de.oliver.fancynpcs.api.skins.SkinData
Type: Class

Methods:
- boolean hasTexture()
- String getTextureValue()
- String getParsedIdentifier()
- SkinData$SkinVariant getVariant()
- int hashCode()
- void setIdentifier(String)
- String getIdentifier()
- boolean equals(Object)
- void setVariant(SkinData$SkinVariant)
- String toString()
- void setTextureSignature(String)
- String getTextureSignature()
- void setTextureValue(String)

### Class: de.oliver.fancynpcs.api.skins.SkinData$SkinVariant
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** SkinData$SkinVariant valueOf(String)
- **static** SkinData$SkinVariant[] values()

### Class: de.oliver.fancynpcs.api.skins.SkinGeneratedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- SkinData getSkin()
- **static** HandlerList getHandlerList()
- String getId()

### Class: de.oliver.fancynpcs.api.skins.SkinLoadException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- SkinLoadException$Reason getReason()

### Class: de.oliver.fancynpcs.api.skins.SkinLoadException$Reason
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** SkinLoadException$Reason valueOf(String)
- **static** SkinLoadException$Reason[] values()

## Package: de.oliver.fancynpcs.api.utils

### Class: de.oliver.fancynpcs.api.utils.Interval
Type: Class

Methods:
- Interval add(Interval)
- Interval add(long, Interval$Unit)
- double as(Interval$Unit)
- Date toDate()
- **static** Interval of(long, Interval$Unit)
- **static** Interval of(double, Interval$Unit)
- **static** Interval now()
- String toString()
- Instant toInstant()
- Interval remove(Interval)
- Interval remove(long, Interval$Unit)
- **static** Interval between(long, long, Interval$Unit)
- **static** Interval between(double, double, Interval$Unit)

### Class: de.oliver.fancynpcs.api.utils.Interval$Unit
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Interval$Unit valueOf(String)
- String getShortCode()
- **static** Interval$Unit fromShortCode(String)
- **static** Interval$Unit[] values()
- long getFactor()

### Class: de.oliver.fancynpcs.api.utils.NpcEquipmentSlot
Type: Enum
Extends: java.lang.Enum

Methods:
- String toNmsName()
- **static** NpcEquipmentSlot valueOf(String)
- **static** NpcEquipmentSlot[] values()
- **static** NpcEquipmentSlot parse(String)

