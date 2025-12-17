# FancyNpcs-2.9.0-de-oliver-fancynpcs-api API Reference

**Package Filter:** `de.oliver.fancynpcs.api`

## Package: de.oliver.fancynpcs.api

### Class: de.oliver.fancynpcs.api.AttributeManager
Type: Interface

Methods:
- List<NpcAttribute> getAllAttributesForEntityType(EntityType)
- List<NpcAttribute> getAllAttributes()
- NpcAttribute getAttributeByName(EntityType, String)
- void registerAttribute(NpcAttribute)

### Class: de.oliver.fancynpcs.api.FancyNpcsConfig
Type: Interface

Methods:
- int getRemoveNpcsFromPlayerlistDelay()
- boolean isSkipInvisibleNpcs()
- Map<String, Integer> getMaxNpcsPerPermission()
- int getVisibilityDistance()
- String getMineSkinApiKey()
- boolean isMuteVersionNotification()
- boolean isInteractionCooldownMessageDisabled()
- List<String> getBlockedCommands()
- int getAutoSaveInterval()
- boolean isEnableAutoSave()
- boolean setTurnToPlayerDistance(int)
- boolean isSwingArmOnUpdate()
- int getTurnToPlayerDistance()
- int getNpcUpdateVisibilityInterval()
- int getNpcUpdateInterval()
- boolean isTurnToPlayerResetToInitialDirection()

### Class: de.oliver.fancynpcs.api.FancyNpcsPlugin
Type: Interface

Methods:
- SkinManager getSkinManager()
- Thread newThread(String, Runnable)
- ActionManager getActionManager()
- Translator getTranslator()
- AttributeManager getAttributeManager()
- ScheduledExecutorService getNpcThread()
- FancyNpcsConfig getFancyNpcConfig()
- NpcManager getNpcManager()
- ExtendedFancyLogger getFancyLogger()
- JavaPlugin getPlugin()
- **static** FancyNpcsPlugin get()
- FeatureFlagConfig getFeatureFlagConfig()
- FancyScheduler getScheduler()
- Function<NpcData, Npc> getNpcAdapter()

### Class: de.oliver.fancynpcs.api.NpcManager
Type: Interface

Methods:
- Collection<Npc> getAllNpcs()
- Npc getNpcById(String)
- void removeNpc(Npc)
- Npc getNpc(int)
- Npc getNpc(String)
- Npc getNpc(String, UUID)
- void registerNpc(Npc)
- void loadNpcs()
- void reloadNpcs()
- void saveNpcs(boolean)
- boolean isLoaded()

### Class: de.oliver.fancynpcs.api.Npc
Type: Abstract Class

Constructors:
- Npc(NpcData data)

Methods:
- Map<UUID, Boolean> getIsVisibleForPlayer()
- void move(Player, boolean)
- void move(Player player)
- Map<UUID, Long> getLastPlayerInteraction()
- void interact(Player player)
- void interact(Player player, ActionTrigger actionTrigger)
- void update(Player, boolean)
- void update(Player player)
- void lookAt(Player, Location)
- float getEyeHeight()
- void setDirty(boolean dirty)
- void remove(Player)
- Map<UUID, Boolean> getIsTeamCreated()
- void setSaveToFile(boolean saveToFile)
- boolean isDirty()
- void spawn(Player)
- boolean isSaveToFile()
- void removeForAll()
- void checkAndUpdateVisibility(Player player)
- void create()
- int getEntityId()
- void spawnForAll()
- Map<UUID, Boolean> getIsLookingAtPlayer()
- void moveForAll(boolean swingArm)
- void moveForAll()
- NpcData getData()
- void updateForAll(boolean swingArm)
- void updateForAll()

### Class: de.oliver.fancynpcs.api.NpcAttribute
Type: Class

Constructors:
- NpcAttribute(String name, List<String> possibleValues, List<EntityType> types, BiConsumer<Npc, String> applyFunc)

Methods:
- boolean isValidValue(String value)
- List<String> getPossibleValues()
- String getName()
- void apply(Npc npc, String value)
- List<EntityType> getTypes()

### Class: de.oliver.fancynpcs.api.NpcData
Type: Class

Constructors:
- NpcData(String id, String name, UUID creator, String displayName, SkinData skin, Location location, boolean showInTab, boolean spawnEntity, boolean collidable, boolean glowing, NamedTextColor glowingColor, EntityType type, Map<NpcEquipmentSlot, ItemStack> equipment, boolean turnToPlayer, int turnToPlayerDistance, Consumer<Player> onClick, Map<ActionTrigger, List<NpcAction$NpcActionData>> actions, float interactionCooldown, float scale, int visibilityDistance, Map<NpcAttribute, String> attributes, boolean mirrorSkin)
- NpcData(String name, UUID creator, Location location)

Methods:
- NpcData setMirrorSkin(boolean mirrorSkin)
- NpcData addEquipment(NpcEquipmentSlot slot, ItemStack item)
- Location getLocation()
- boolean isMirrorSkin()
- String getName()
- NpcData setActions(Map<ActionTrigger, List<NpcAction$NpcActionData>> actions)
- NpcData setActions(ActionTrigger trigger, List<NpcAction$NpcActionData> actions)
- int getVisibilityDistance()
- NpcData setSkinData(SkinData skinData)
- Map<ActionTrigger, List<NpcAction$NpcActionData>> getActions()
- List<NpcAction$NpcActionData> getActions(ActionTrigger trigger)
- String getId()
- Consumer<Player> getOnClick()
- NpcData setGlowing(boolean glowing)
- NpcData setDisplayName(String displayName)
- NpcData setOnClick(Consumer<Player> onClick)
- Map<NpcEquipmentSlot, ItemStack> getEquipment()
- void setDirty(boolean dirty)
- NpcData addAction(ActionTrigger trigger, int order, NpcAction action, String value)
- NpcData setCollidable(boolean collidable)
- boolean isCollidable()
- boolean isDirty()
- int getTurnToPlayerDistance()
- NpcData setInteractionCooldown(float interactionCooldown)
- NpcData setLocation(Location location)
- boolean isGlowing()
- NamedTextColor getGlowingColor()
- NpcData setSpawnEntity(boolean spawnEntity)
- NpcData removeAction(ActionTrigger trigger, NpcAction action)
- Map<NpcAttribute, String> getAttributes()
- NpcData setShowInTab(boolean showInTab)
- NpcData setEquipment(Map<NpcEquipmentSlot, ItemStack> equipment)
- NpcData setScale(float scale)
- boolean isSpawnEntity()
- SkinData getSkinData()
- NpcData setType(EntityType type)
- NpcData setTurnToPlayer(boolean turnToPlayer)
- UUID getCreator()
- NpcData setVisibilityDistance(int visibilityDistance)
- float getInteractionCooldown()
- NpcData setSkin(String skin, SkinData$SkinVariant variant)
- NpcData setSkin(String skin)
- NpcData setTurnToPlayerDistance(int distance)
- void addAttribute(NpcAttribute attribute, String value)
- float getScale()
- void applyAllAttributes(Npc npc)
- EntityType getType()
- String getDisplayName()
- NpcData setGlowingColor(NamedTextColor glowingColor)
- boolean isShowInTab()
- boolean isTurnToPlayer()

## Package: de.oliver.fancynpcs.api.actions

### Class: de.oliver.fancynpcs.api.actions.ActionManager
Type: Interface

Methods:
- void registerAction(NpcAction)
- NpcAction getActionByName(String)
- List<NpcAction> getAllActions()
- void unregisterAction(NpcAction)

### Class: de.oliver.fancynpcs.api.actions.ActionTrigger
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ANY_CLICK
- LEFT_CLICK
- RIGHT_CLICK
- CUSTOM

Methods:
- **static** ActionTrigger valueOf(String name)
- **static** ActionTrigger[] values()
- **static** ActionTrigger getByName(String name)

### Class: de.oliver.fancynpcs.api.actions.NpcAction
Type: Abstract Class

Constructors:
- NpcAction(String name, boolean requiresValue)

Methods:
- String getName()
- boolean requiresValue()
- void execute(ActionExecutionContext, String)

### Class: de.oliver.fancynpcs.api.actions.NpcAction$NpcActionData
Type: Class
Extends: java.lang.Record

Constructors:
- NpcAction$NpcActionData(int order, NpcAction action, String value)

Methods:
- int hashCode()
- boolean equals(Object o)
- NpcAction action()
- String toString()
- String value()
- int order()

## Package: de.oliver.fancynpcs.api.actions.executor

### Class: de.oliver.fancynpcs.api.actions.executor.ActionExecutionContext
Type: Class

Constructors:
- ActionExecutionContext(ActionTrigger trigger, Npc npc, UUID player)
- ActionExecutionContext(ActionTrigger trigger, Npc npc)

Methods:
- Player getPlayer()
- ActionTrigger getTrigger()
- Npc getNpc()
- int getActionIndex()
- boolean isTerminated()
- void reset()
- List<NpcAction$NpcActionData> getActions()
- boolean hasNext()
- void run(int index)
- void terminate()
- UUID getPlayerUUID()
- boolean shouldBlockUntilDone()
- void runNext()

### Class: de.oliver.fancynpcs.api.actions.executor.ActionExecutor
Type: Class

Methods:
- **static** void execute(ActionTrigger trigger, Npc npc, Player player)

## Package: de.oliver.fancynpcs.api.actions.types

### Class: de.oliver.fancynpcs.api.actions.types.BlockUntilDoneAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext context, String value)

### Class: de.oliver.fancynpcs.api.actions.types.ConsoleCommandAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext context, String value)

### Class: de.oliver.fancynpcs.api.actions.types.ExecuteRandomActionAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext context, String value)

### Class: de.oliver.fancynpcs.api.actions.types.MessageAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext context, String value)

### Class: de.oliver.fancynpcs.api.actions.types.NeedPermissionAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext context, String value)

### Class: de.oliver.fancynpcs.api.actions.types.PlaySoundAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext context, String value)

### Class: de.oliver.fancynpcs.api.actions.types.PlayerCommandAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext context, String value)

### Class: de.oliver.fancynpcs.api.actions.types.PlayerCommandAsOpAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext context, String value)

### Class: de.oliver.fancynpcs.api.actions.types.SendToServerAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext context, String value)

### Class: de.oliver.fancynpcs.api.actions.types.WaitAction
Type: Class
Extends: de.oliver.fancynpcs.api.actions.NpcAction

Methods:
- void execute(ActionExecutionContext context, String value)

## Package: de.oliver.fancynpcs.api.events

### Class: de.oliver.fancynpcs.api.events.NpcCreateEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NpcCreateEvent(Npc npc, CommandSender creator)

Methods:
- boolean isCancelled()
- Npc getNpc()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- CommandSender getCreator()

### Class: de.oliver.fancynpcs.api.events.NpcInteractEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NpcInteractEvent(Npc npc, Consumer<Player> onClick, List<NpcAction$NpcActionData> actions, Player player, ActionTrigger actionTrigger)

Methods:
- boolean isCancelled()
- Player getPlayer()
- Npc getNpc()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- List<NpcAction$NpcActionData> getActions()
- Consumer<Player> getOnClick()
- ActionTrigger getInteractionType()

### Class: de.oliver.fancynpcs.api.events.NpcModifyEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NpcModifyEvent(Npc npc, NpcModifyEvent$NpcModification modification, Object newValue, CommandSender modifier)

Methods:
- boolean isCancelled()
- Npc getNpc()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- NpcModifyEvent$NpcModification getModification()
- CommandSender getModifier()
- **static** HandlerList getHandlerList()
- Object getNewValue()

### Class: de.oliver.fancynpcs.api.events.NpcModifyEvent$NpcModification
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ATTRIBUTE
- COLLIDABLE
- DISPLAY_NAME
- EQUIPMENT
- GLOWING
- GLOWING_COLOR
- INTERACTION_COOLDOWN
- SCALE
- VISIBILITY_DISTANCE
- LOCATION
- MIRROR_SKIN
- PLAYER_COMMAND
- ROTATION
- SERVER_COMMAND
- SHOW_IN_TAB
- SKIN
- TURN_TO_PLAYER
- TURN_TO_PLAYER_DISTANCE
- TYPE
- MESSAGE_ADD
- MESSAGE_SET
- MESSAGE_REMOVE
- MESSAGE_CLEAR
- MESSAGE_SEND_RANDOMLY
- PLAYER_COMMAND_ADD
- PLAYER_COMMAND_SET
- PLAYER_COMMAND_REMOVE
- PLAYER_COMMAND_CLEAR
- PLAYER_COMMAND_SEND_RANDOMLY
- SERVER_COMMAND_ADD
- SERVER_COMMAND_SET
- SERVER_COMMAND_REMOVE
- SERVER_COMMAND_CLEAR
- SERVER_COMMAND_SEND_RANDOMLY

Methods:
- **static** NpcModifyEvent$NpcModification valueOf(String name)
- **static** NpcModifyEvent$NpcModification[] values()

### Class: de.oliver.fancynpcs.api.events.NpcRemoveEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NpcRemoveEvent(Npc npc, CommandSender receiver)

Methods:
- boolean isCancelled()
- Npc getNpc()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- CommandSender getSender()

### Class: de.oliver.fancynpcs.api.events.NpcSpawnEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NpcSpawnEvent(Npc npc, Player player)

Methods:
- boolean isCancelled()
- Player getPlayer()
- Npc getNpc()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancynpcs.api.events.NpcStartLookingEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- NpcStartLookingEvent(Npc npc, Player player)

Methods:
- Player getPlayer()
- Npc getNpc()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancynpcs.api.events.NpcStopLookingEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- NpcStopLookingEvent(Npc npc, Player player)

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

Constructors:
- PacketReceivedEvent(Object packet, Player player)

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

Constructors:
- SkinData(String identifier, SkinData$SkinVariant variant, String textureValue, String textureSignature)
- SkinData(String identifier, SkinData$SkinVariant variant)

Methods:
- boolean hasTexture()
- String getTextureValue()
- String getParsedIdentifier()
- SkinData$SkinVariant getVariant()
- int hashCode()
- void setIdentifier(String identifier)
- String getIdentifier()
- boolean equals(Object o)
- void setVariant(SkinData$SkinVariant variant)
- String toString()
- void setTextureSignature(String textureSignature)
- String getTextureSignature()
- void setTextureValue(String textureValue)

### Class: de.oliver.fancynpcs.api.skins.SkinData$SkinVariant
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- AUTO
- SLIM

Methods:
- **static** SkinData$SkinVariant valueOf(String name)
- **static** SkinData$SkinVariant[] values()

### Class: de.oliver.fancynpcs.api.skins.SkinGeneratedEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- SkinGeneratedEvent(String id, SkinData skin)

Methods:
- HandlerList getHandlers()
- SkinData getSkin()
- **static** HandlerList getHandlerList()
- String getId()

### Class: de.oliver.fancynpcs.api.skins.SkinLoadException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- SkinLoadException(SkinLoadException$Reason reason, String message)

Methods:
- SkinLoadException$Reason getReason()

### Class: de.oliver.fancynpcs.api.skins.SkinLoadException$Reason
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- INVALID_URL
- INVALID_FILE
- INVALID_PLACEHOLDER
- INVALID_USERNAME

Methods:
- **static** SkinLoadException$Reason valueOf(String name)
- **static** SkinLoadException$Reason[] values()

## Package: de.oliver.fancynpcs.api.utils

### Class: de.oliver.fancynpcs.api.utils.Interval
Type: Class

Constructors:
- Interval(long value)

Methods:
- Interval add(Interval other)
- Interval add(long n, Interval$Unit)
- double as(Interval$Unit unit)
- Date toDate()
- **static** Interval of(long interval, Interval$Unit)
- **static** Interval of(double interval, Interval$Unit)
- **static** Interval now()
- String toString()
- Instant toInstant()
- Interval remove(Interval other)
- Interval remove(long n, Interval$Unit)
- **static** Interval between(long n, long, Interval$Unit m)
- **static** Interval between(double n, double, Interval$Unit m)

### Class: de.oliver.fancynpcs.api.utils.Interval$Unit
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- MILLISECONDS
- TICKS
- SECONDS
- MINUTES
- HOURS
- DAYS
- MONTHS
- YEARS

Methods:
- **static** Interval$Unit valueOf(String name)
- String getShortCode()
- **static** Interval$Unit fromShortCode(String shortCode)
- **static** Interval$Unit[] values()
- long getFactor()

### Class: de.oliver.fancynpcs.api.utils.NpcEquipmentSlot
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- MAINHAND
- OFFHAND
- FEET
- LEGS
- CHEST
- HEAD

Methods:
- String toNmsName()
- **static** NpcEquipmentSlot valueOf(String name)
- **static** NpcEquipmentSlot[] values()
- **static** NpcEquipmentSlot parse(String s)

