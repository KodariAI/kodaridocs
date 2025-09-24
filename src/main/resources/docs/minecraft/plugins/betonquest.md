# BetonQuest API Reference

## Main BetonQuest Class

### Class: org.betonquest.betonquest.BetonQuest
Type: Main Plugin Class
Extends: org.bukkit.plugin.java.JavaPlugin

#### Getting the Instance
- **static** BetonQuest getInstance()

#### Player Data Methods (IMPORTANT: These require Profile objects, NOT UUIDs)
- PlayerData getPlayerData(Profile profile)
- PlayerData getPlayerData(OnlineProfile profile)
- PlayerData getOfflinePlayerData(Profile profile)
- void putPlayerData(Profile profile, PlayerData playerData)
- void removePlayerData(Profile profile)

#### Static Quest Methods
- **static** boolean condition(@Nullable Profile profile, ConditionID conditionID)
- **static** boolean conditions(@Nullable Profile profile, ConditionID... conditionIDs)
- **static** boolean conditions(@Nullable Profile profile, Collection<ConditionID> conditionIDs)
- **static** boolean event(@Nullable Profile profile, EventID eventID)
- **static** void newObjective(Profile profile, ObjectiveID objectiveID)
- **static** void resumeObjective(Profile profile, ObjectiveID objectiveID, String instruction)
- **static** Variable createVariable(@Nullable QuestPackage pack, String instruction) throws InstructionParseException
- **static** boolean isVariableType(String type)
- **static** Map<QuestCancelerID, QuestCanceler> getCanceler()
- **static** Class<? extends NotifyIO> getNotifyIO(String name)

#### Service Accessors
- BetonQuestLoggerFactory getLoggerFactory()
- ConfigAccessorFactory getConfigAccessorFactory()
- ConfigurationFileFactory getConfigurationFileFactory()
- BukkitAudiences getAdventure()
- RPGMenu getRpgMenu()
- ConfigurationFile getPluginConfig()
- String getPluginTag()
- Database getDB()
- GlobalData getGlobalData()
- boolean isMySQLUsed()
- Saver getSaver()
- QuestTypeRegistries getQuestRegistries()
- VariableProcessor getVariableProcessor()
- Map<String, Class<? extends Objective>> getObjectiveTypes()
- Updater getUpdater()
- LastExecutionCache getLastExecutionCache()

#### Quest Management
- List<Objective> getPlayerObjectives(Profile profile)
- @Nullable ConversationData getConversation(ConversationID conversationID)
- @Nullable Objective getObjective(ObjectiveID objectiveID)
- void loadData()
- void reload()
- void callSyncBukkitEvent(Event event)
- void renameObjective(ObjectiveID name, ObjectiveID rename)

#### Registration Methods
- @Nullable Class<? extends ConversationIO> getConvIO(String name)
- @Nullable Class<? extends Interceptor> getInterceptor(String name)
- void registerObjectives(String name, Class<? extends Objective> objectiveClass)
- void registerConversationIO(String name, Class<? extends ConversationIO> convIOClass)
- void registerInterceptor(String name, Class<? extends Interceptor> interceptorClass)
- void registerNotifyIO(String name, Class<? extends NotifyIO> ioClass)
- <S extends Schedule> void registerScheduleType(String name, Class<S> schedule, Scheduler<S, ?> scheduler)

## PlayerConverter Utility (CRITICAL FOR PROFILE CONVERSION)

### Class: org.betonquest.betonquest.utils.PlayerConverter
Type: Utility Class for converting between Player/UUID and Profile objects

Methods:
- **static** OnlineProfile getOnlineProfile(Player player) - Converts Player to OnlineProfile
- **static** Collection<OnlineProfile> getOnlineProfiles() - Gets all online profiles
- **static** Profile getProfile(String playerName) - Converts player name to Profile
- **static** Profile getProfile(UUID uuid) - Converts UUID to Profile

### CORRECT USAGE EXAMPLES:

#### Getting PlayerData from a Player:
Player player = event.getPlayer();
OnlineProfile profile = PlayerConverter.getOnlineProfile(player);
PlayerData playerData = BetonQuest.getInstance().getPlayerData(profile);

#### Getting PlayerData from a UUID:
UUID uuid = player.getUniqueId();
Profile profile = PlayerConverter.getProfile(uuid);
PlayerData playerData = BetonQuest.getInstance().getPlayerData(profile);

#### Getting PlayerData from a player name:
String playerName = "Steve";
Profile profile = PlayerConverter.getProfile(playerName);
PlayerData playerData = BetonQuest.getInstance().getPlayerData(profile);

## Profile System

### Interface: org.betonquest.betonquest.api.profiles.Profile
Base interface for all player profiles

Methods:
- OfflinePlayer getPlayer()
- UUID getProfileUUID()
- Optional<OnlineProfile> getOnlineProfile()
- String getProfileName()
- String toString()
- UUID getPlayerUUID()

### Interface: org.betonquest.betonquest.api.profiles.OnlineProfile
Extends: Profile
For online players only

Methods:
- Player getPlayer() - Returns the online Player object
- OfflinePlayer getPlayer() - Inherited from Profile

## Common API Classes

### Class: org.betonquest.betonquest.api.Objective
Abstract base class for all objectives

Key Methods:
- void startObjective(Profile, String, Objective$ObjectiveState)
- boolean containsPlayer(Profile)
- String getLabel()
- String getProperty(String, Profile)
- void completeObjective(Profile)
- boolean checkConditions(Profile)
- void newPlayer(Profile)
- void start()
- void start(Profile)
- void cancelObjectiveForPlayer(Profile)
- void createObjectiveForPlayer(Profile, String)
- void stop()
- void stop(Profile)
- void resumeObjectiveForPlayer(Profile, String)
- boolean isGlobal()
- void setLabel(ObjectiveID)
- void stopObjective(Profile, Objective$ObjectiveState)
- String getDefaultDataInstruction()
- String getDefaultDataInstruction(Profile)
- void pauseObjectiveForPlayer(Profile)
- void close()
- String getData(Profile)
- void completeObjectiveForPlayer(Profile)

### Class: org.betonquest.betonquest.api.CountingObjective
Extends: Objective
For objectives that track progress counts

Methods:
- String getProperty(String, Profile)
- String getDefaultDataInstruction()
- String getDefaultDataInstruction(Profile)
- CountingObjective$CountingData getCountingData(Profile)

### Class: org.betonquest.betonquest.api.CountingObjective$CountingData
Extends: Objective$ObjectiveData

Methods:
- CountingObjective$CountingData add()
- CountingObjective$CountingData add(int)
- int getTargetAmount()
- int getPreviousAmountLeft()
- CountingObjective$CountingData subtract()
- CountingObjective$CountingData subtract(int)
- CountingObjective$CountingData regress()
- CountingObjective$CountingData regress(int)
- int getDirectionFactor()
- CountingObjective$CountingData progress()
- CountingObjective$CountingData progress(int)
- int getCompletedAmount()
- String toString()
- int getAmountLeft()
- int getLastChange()
- boolean isComplete()

### Class: org.betonquest.betonquest.api.Condition
Abstract base class for conditions

Methods:
- boolean isStatic()
- boolean isPersistent()

### Class: org.betonquest.betonquest.api.QuestEvent
Abstract base class for events

Methods:
- boolean fire(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.Variable
Abstract base class for variables

Methods:
- String getValue(Profile)
- Instruction getInstruction()
- String toString()
- boolean isStaticness()

## Event Classes

### Class: org.betonquest.betonquest.api.profiles.ProfileEvent
Base class for all profile-related events

Methods:
- Profile getProfile()

### Class: org.betonquest.betonquest.api.PlayerConversationStartEvent
Extends: ProfileEvent
Implements: Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- Conversation getConversation()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.PlayerConversationEndEvent
Extends: ProfileEvent

Methods:
- Conversation getConversation()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.PlayerObjectiveChangeEvent
Extends: ProfileEvent

Methods:
- Objective$ObjectiveState getPreviousState()
- Objective$ObjectiveState getState()
- Objective getObjective()
- ObjectiveID getObjectiveID()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.PlayerTagAddEvent
Extends: ProfileEvent

Methods:
- String getTag()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.PlayerTagRemoveEvent
Extends: ProfileEvent

Methods:
- String getTag()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.PlayerUpdatePointEvent
Extends: ProfileEvent

Methods:
- int getNewCount()
- String getCategory()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.PlayerJournalAddEvent
Extends: ProfileEvent

Methods:
- Journal getJournal()
- Pointer getPointer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.PlayerJournalDeleteEvent
Extends: ProfileEvent

Methods:
- Journal getJournal()
- Pointer getPointer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.QuestCompassTargetChangeEvent
Extends: ProfileEvent
Implements: Cancellable

Methods:
- boolean isCancelled()
- Location getLocation()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.QuestDataUpdateEvent
Extends: ProfileEvent

Methods:
- String getObjID()
- String getData()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.ConversationOptionEvent
Extends: ProfileEvent

Methods:
- ResolvedOption getSelectedOption()
- Conversation getConversation()
- ResolvedOption getNextNPCOption()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.LoadDataEvent
Extends: Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.MobKillNotifier$MobKilledEvent
Extends: ProfileEvent

Methods:
- Entity getEntity()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Factory Interfaces

### Interface: org.betonquest.betonquest.api.quest.condition.PlayerConditionFactory
For creating player-specific conditions

Methods:
- PlayerCondition parsePlayer(Instruction) throws InstructionParseException

### Interface: org.betonquest.betonquest.api.quest.condition.PlayerlessConditionFactory
For creating static conditions

Methods:
- PlayerlessCondition parsePlayerless(Instruction) throws InstructionParseException

### Interface: org.betonquest.betonquest.api.quest.event.EventFactory
For creating player events

Methods:
- Event parseEvent(Instruction) throws InstructionParseException
- Event parsePlayer(Instruction) throws InstructionParseException

### Interface: org.betonquest.betonquest.api.quest.event.StaticEventFactory
For creating static events

Methods:
- StaticEvent parseStaticEvent(Instruction) throws InstructionParseException
- StaticEvent parsePlayerless(Instruction) throws InstructionParseException

### Interface: org.betonquest.betonquest.api.quest.variable.PlayerVariableFactory
For creating player variables

Methods:
- PlayerVariable parsePlayer(Instruction) throws InstructionParseException

### Interface: org.betonquest.betonquest.api.quest.variable.PlayerlessVariableFactory
For creating static variables

Methods:
- PlayerlessVariable parsePlayerless(Instruction) throws InstructionParseException

## Quest Type Interfaces

### Interface: org.betonquest.betonquest.api.quest.condition.PlayerCondition
Methods:
- boolean check(Profile) throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.condition.PlayerlessCondition
Methods:
- boolean check() throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.condition.nullable.NullableCondition
Methods:
- boolean check(Profile) throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.condition.online.OnlineCondition
Methods:
- boolean check(OnlineProfile) throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.event.Event
Methods:
- void execute(Profile) throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.event.StaticEvent
Methods:
- void execute() throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.event.nullable.NullableEvent
Methods:
- void execute(Profile) throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.event.online.OnlineEvent
Methods:
- void execute(OnlineProfile) throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.variable.PlayerVariable
Methods:
- String getValue(Profile)

### Interface: org.betonquest.betonquest.api.quest.variable.PlayerlessVariable
Methods:
- String getValue()

### Interface: org.betonquest.betonquest.api.quest.variable.nullable.NullableVariable
Methods:
- String getValue(Profile)

### Interface: org.betonquest.betonquest.api.quest.variable.online.OnlineVariable
Methods:
- String getValue(OnlineProfile)

## Adapter Classes

### Class: org.betonquest.betonquest.api.quest.condition.nullable.NullableConditionAdapter
Implements: PlayerCondition, PlayerlessCondition
Methods:
- boolean check(Profile) throws QuestRuntimeException
- boolean check() throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.condition.online.OnlineConditionAdapter
Implements: PlayerCondition
Methods:
- boolean check(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.event.nullable.NullableEventAdapter
Implements: Event, StaticEvent
Methods:
- void execute(Profile) throws QuestRuntimeException
- void execute() throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.event.online.OnlineEventAdapter
Implements: Event
Methods:
- void execute(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.variable.nullable.NullableVariableAdapter
Implements: PlayerVariable, PlayerlessVariable
Methods:
- String getValue(Profile)
- String getValue()

### Class: org.betonquest.betonquest.api.quest.variable.online.OnlineVariableAdapter
Implements: PlayerVariable
Methods:
- String getValue(Profile)

## Logger System

### Interface: org.betonquest.betonquest.api.logger.BetonQuestLogger
Methods:
- void warn(String)
- void warn(String, Throwable)
- void warn(QuestPackage, String)
- void warn(QuestPackage, String, Throwable)
- void debug(String)
- void debug(String, Throwable)
- void debug(QuestPackage, String)
- void debug(QuestPackage, String, Throwable)
- void error(String)
- void error(String, Throwable)
- void error(QuestPackage, String)
- void error(QuestPackage, String, Throwable)
- void info(String)
- void info(QuestPackage, String)
- void reportException(Throwable)
- void reportException(QuestPackage, Throwable)

### Interface: org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory
Methods:
- BetonQuestLogger create(Class)
- BetonQuestLogger create(Class, String)
- BetonQuestLogger create(Plugin)
- BetonQuestLogger create(Plugin, String)

### Class: org.betonquest.betonquest.api.logger.CachingBetonQuestLoggerFactory
Implements: BetonQuestLoggerFactory
Methods:
- BetonQuestLogger create(Class, String)
- BetonQuestLogger create(Plugin, String)

### Class: org.betonquest.betonquest.api.logger.SingletonLoggerFactory
Implements: BetonQuestLoggerFactory
Methods:
- BetonQuestLogger create(Class, String)
- BetonQuestLogger create(Plugin, String)

## Configuration System

### Interface: org.betonquest.betonquest.api.config.quest.QuestPackage
Methods:
- String getFormattedString(String)
- boolean saveAll() throws IOException
- String getQuestPath()
- ConfigAccessor getOrCreateConfigAccessor(String) throws InvalidConfigurationException, FileNotFoundException
- String subst(String)
- String getString(String)
- String getString(String, String)
- String getRawString(String)
- boolean hasTemplate(String)
- MultiConfiguration getConfig()
- List getTemplates()

### Interface: org.betonquest.betonquest.api.config.ConfigAccessor
Methods:
- boolean reload() throws IOException
- File getConfigurationFile()
- boolean save() throws IOException
- boolean delete() throws IOException
- YamlConfiguration getConfig()

### Interface: org.betonquest.betonquest.api.config.ConfigAccessorFactory
Methods:
- ConfigAccessor create(File) throws InvalidConfigurationException, FileNotFoundException
- ConfigAccessor create(Plugin, String) throws InvalidConfigurationException, FileNotFoundException
- ConfigAccessor create(File, Plugin, String) throws InvalidConfigurationException, FileNotFoundException

### Interface: org.betonquest.betonquest.api.config.ConfigurationFile
Implements: ConfigurationSection
Methods:
- boolean reload() throws IOException
- boolean save() throws IOException
- boolean delete() throws IOException

### Interface: org.betonquest.betonquest.api.config.ConfigurationFileFactory
Methods:
- ConfigurationFile create(File, Plugin, String) throws InvalidConfigurationException, FileNotFoundException
- ConfigurationFile create(File, Plugin, String, PatchTransformerRegisterer) throws InvalidConfigurationException, FileNotFoundException

## Schedule System

### Class: org.betonquest.betonquest.api.schedule.Schedule
Abstract Class
Methods:
- List getEvents()
- String getTime()
- ScheduleID getId()
- CatchupStrategy getCatchup()

### Class: org.betonquest.betonquest.api.schedule.CronSchedule
Extends: Schedule
Methods:
- Cron getTimeCron()
- boolean shouldRunOnReboot()
- ExecutionTime getExecutionTime()

### Class: org.betonquest.betonquest.api.schedule.Scheduler
Abstract Class
Methods:
- void stop()
- boolean isRunning()
- void start()
- void start(Object)
- void addSchedule(Schedule)

### Enum: org.betonquest.betonquest.api.schedule.CatchupStrategy
Methods:
- **static** CatchupStrategy valueOf(String)
- **static** CatchupStrategy[] values()

## Objective States

### Enum: org.betonquest.betonquest.api.Objective$ObjectiveState
Values: ACTIVE, INACTIVE, COMPLETED
Methods:
- **static** Objective$ObjectiveState valueOf(String)
- **static** Objective$ObjectiveState[] values()

## Utility Classes

### Class: org.betonquest.betonquest.api.MobKillNotifier
Static utility for mob kill notifications
Methods:
- **static** void addKill(Profile, Entity)

### Class: org.betonquest.betonquest.api.common.function.Selectors
Factory for creating Selector instances
Methods:
- **static** Selector fromPlayer(Function)
- **static** Selector fromOnlineProfile(Function)
- **static** Selector fromOfflinePlayer(Function)

### Interface: org.betonquest.betonquest.api.common.function.Selector
Methods:
- Object selectFor(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.common.function.ConstantSelector
Implements: Selector
Methods:
- Object selectFor(Profile)

## IMPORTANT NOTES FOR PLUGIN DEVELOPMENT:

1. **NEVER pass UUID directly to BetonQuest methods** - Always convert to Profile first using PlayerConverter
2. **There is NO getPlayerProfile method** - Use PlayerConverter.getProfile(uuid) then getPlayerData(profile)
3. **Profile vs OnlineProfile**: Use OnlineProfile when you need the Player object, use Profile for offline operations
4. **PlayerConverter is essential** - This is the bridge between Bukkit's Player/UUID system and BetonQuest's Profile system
5. **Common pattern for events/listeners**:
   @EventHandler
   public void onPlayerJoin(PlayerJoinEvent event) {
       Player player = event.getPlayer();
       OnlineProfile profile = PlayerConverter.getOnlineProfile(player);
       PlayerData data = BetonQuest.getInstance().getPlayerData(profile);
       // Now work with data
   }
6. **For UUID operations**:
   UUID uuid = // get UUID somehow
   Profile profile = PlayerConverter.getProfile(uuid);
   PlayerData data = BetonQuest.getInstance().getPlayerData(profile);
7. **All BetonQuest events extend ProfileEvent** which provides getProfile() method
8. **Use BetonQuestLogger** for logging instead of standard Java logging