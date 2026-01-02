# BetonQuest-org-betonquest-betonquest-api API Reference

**Package Filter:** `org.betonquest.betonquest.api`

## Package: org.betonquest.betonquest.api

### Class: org.betonquest.betonquest.api.Objective$QREThrowing
Type: Interface

Methods:
- void run() throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.Condition
Type: Abstract Class
Extends: org.betonquest.betonquest.api.ForceSyncHandler

Methods:
- boolean isStatic()
- boolean isPersistent()

### Class: org.betonquest.betonquest.api.ConversationOptionEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- ResolvedOption getSelectedOption()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Conversation getConversation()
- ResolvedOption getNextNPCOption()

### Class: org.betonquest.betonquest.api.CountingObjective
Type: Abstract Class
Extends: org.betonquest.betonquest.api.Objective

Methods:
- String getProperty(String, Profile)
- String getDefaultDataInstruction()
- String getDefaultDataInstruction(Profile)
- CountingObjective$CountingData getCountingData(Profile)

### Class: org.betonquest.betonquest.api.CountingObjective$CountingData
Type: Class
Extends: org.betonquest.betonquest.api.Objective$ObjectiveData

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

### Class: org.betonquest.betonquest.api.ForceSyncHandler
Type: Abstract Class

Methods:
- Object handle(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.LoadDataEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.MobKillNotifier
Type: Class

Methods:
- **static** void addKill(Profile, Entity)

### Class: org.betonquest.betonquest.api.MobKillNotifier$MobKilledEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getEntity()

### Class: org.betonquest.betonquest.api.Objective
Type: Abstract Class

Methods:
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

### Class: org.betonquest.betonquest.api.Objective$ObjectiveData
Type: Class

Methods:
- String toString()

### Class: org.betonquest.betonquest.api.Objective$ObjectiveState
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Objective$ObjectiveState valueOf(String)
- **static** Objective$ObjectiveState[] values()

### Class: org.betonquest.betonquest.api.Objective$QREHandler
Type: Class

Methods:
- void handle(Objective$QREThrowing)

### Class: org.betonquest.betonquest.api.PlayerConversationEndEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Conversation getConversation()

### Class: org.betonquest.betonquest.api.PlayerConversationStartEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Conversation getConversation()

### Class: org.betonquest.betonquest.api.PlayerJournalAddEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- Journal getJournal()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Pointer getPointer()

### Class: org.betonquest.betonquest.api.PlayerJournalDeleteEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- Journal getJournal()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Pointer getPointer()

### Class: org.betonquest.betonquest.api.PlayerObjectiveChangeEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- Objective$ObjectiveState getPreviousState()
- Objective$ObjectiveState getState()
- HandlerList getHandlers()
- Objective getObjective()
- **static** HandlerList getHandlerList()
- ObjectiveID getObjectiveID()

### Class: org.betonquest.betonquest.api.PlayerTagAddEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getTag()

### Class: org.betonquest.betonquest.api.PlayerTagRemoveEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getTag()

### Class: org.betonquest.betonquest.api.PlayerUpdatePointEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- int getNewCount()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getCategory()

### Class: org.betonquest.betonquest.api.QuestCompassTargetChangeEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Location getLocation()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.QuestDataUpdateEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getObjID()
- String getData()

### Class: org.betonquest.betonquest.api.QuestEvent
Type: Abstract Class
Extends: org.betonquest.betonquest.api.ForceSyncHandler

Methods:
- boolean fire(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.Variable
Type: Abstract Class

Methods:
- String getValue(Profile)
- Instruction getInstruction()
- String toString()
- boolean isStaticness()

## Package: org.betonquest.betonquest.api.bukkit.command

### Class: org.betonquest.betonquest.api.bukkit.command.SilentCommandSender
Type: Class
Implements: org.bukkit.command.CommandSender

Methods:
- Server getServer()
- Set getEffectivePermissions()
- String getName()
- void setOp(boolean)
- boolean hasPermission(String)
- boolean hasPermission(Permission)
- Component name()
- CommandSender$Spigot spigot()
- void sendMessage(String)
- void sendMessage(String[])
- void sendMessage(UUID, String)
- void sendMessage(UUID, String[])
- boolean isOp()
- void recalculatePermissions()
- void removeAttachment(PermissionAttachment)
- PermissionAttachment addAttachment(Plugin, String, boolean)
- PermissionAttachment addAttachment(Plugin)
- PermissionAttachment addAttachment(Plugin, String, boolean, int)
- PermissionAttachment addAttachment(Plugin, int)
- boolean isPermissionSet(String)
- boolean isPermissionSet(Permission)

### Class: org.betonquest.betonquest.api.bukkit.command.SilentConsoleCommandSender
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.command.SilentCommandSender
Implements: org.bukkit.command.ConsoleCommandSender

Methods:
- boolean beginConversation(Conversation)
- void acceptConversationInput(String)
- void sendRawMessage(String)
- void sendRawMessage(UUID, String)
- boolean isConversing()
- void abandonConversation(Conversation)
- void abandonConversation(Conversation, ConversationAbandonedEvent)

## Package: org.betonquest.betonquest.api.bukkit.config.custom

### Class: org.betonquest.betonquest.api.bukkit.config.custom.ConfigurationSectionDecorator
Type: Class
Implements: org.bukkit.configuration.ConfigurationSection

Methods:
- List getLongList(String)
- Location getLocation(String)
- Location getLocation(String, Location)
- String getName()
- Vector getVector(String)
- Vector getVector(String, Vector)
- List getShortList(String)
- ConfigurationSection getConfigurationSection(String)
- List getList(String)
- List getList(String, List)
- List getComments(String)
- boolean isInt(String)
- List getCharacterList(String)
- ConfigurationSection createSection(String)
- ConfigurationSection createSection(String, Map)
- ConfigurationSection getDefaultSection()
- Object getObject(String, Class)
- Object getObject(String, Class, Object)
- String getCurrentPath()
- boolean isSet(String)
- boolean isOfflinePlayer(String)
- List getDoubleList(String)
- OfflinePlayer getOfflinePlayer(String)
- OfflinePlayer getOfflinePlayer(String, OfflinePlayer)
- void addDefault(String, Object)
- ConfigurationSerializable getSerializable(String, Class)
- ConfigurationSerializable getSerializable(String, Class, ConfigurationSerializable)
- int getInt(String)
- int getInt(String, int)
- boolean contains(String)
- boolean contains(String, boolean)
- List getIntegerList(String)
- List getByteList(String)
- List getStringList(String)
- void setInlineComments(String, List)
- List getInlineComments(String)
- boolean isDouble(String)
- List getBooleanList(String)
- double getDouble(String)
- double getDouble(String, double)
- boolean isVector(String)
- List getMapList(String)
- boolean isList(String)
- boolean isBoolean(String)
- boolean isColor(String)
- Object get(String)
- Object get(String, Object)
- boolean isString(String)
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- ItemStack getItemStack(String)
- ItemStack getItemStack(String, ItemStack)
- void setComments(String, List)
- Configuration getRoot()
- boolean isItemStack(String)
- ConfigurationSection getParent()
- boolean isLong(String)
- void set(String, Object)
- Map getValues(boolean)
- Color getColor(String)
- Color getColor(String, Color)
- String getString(String)
- String getString(String, String)
- Set getKeys(boolean)
- long getLong(String)
- long getLong(String, long)
- List getFloatList(String)
- boolean isLocation(String)
- boolean isConfigurationSection(String)
- String toString()

## Package: org.betonquest.betonquest.api.bukkit.config.custom.fallback

### Class: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfiguration
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfigurationSection
Implements: org.bukkit.configuration.Configuration

Methods:
- void addDefaults(Map)
- void addDefaults(Configuration)
- ConfigurationOptions options()
- Configuration getDefaults()
- void setDefaults(Configuration)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfigurationOptions
Type: Class
Extends: org.bukkit.configuration.ConfigurationOptions

Methods:
- boolean copyDefaults()
- ConfigurationOptions copyDefaults(boolean)
- char pathSeparator()
- ConfigurationOptions pathSeparator(char)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfigurationSection
Type: Class
Implements: org.bukkit.configuration.ConfigurationSection

Methods:
- List getLongList(String)
- Location getLocation(String)
- Location getLocation(String, Location)
- String getName()
- Vector getVector(String)
- Vector getVector(String, Vector)
- List getShortList(String)
- ConfigurationSection getConfigurationSection(String)
- List getList(String)
- List getList(String, List)
- List getComments(String)
- boolean isInt(String)
- List getCharacterList(String)
- ConfigurationSection createSection(String)
- ConfigurationSection createSection(String, Map)
- ConfigurationSection getDefaultSection()
- Object getObject(String, Class)
- Object getObject(String, Class, Object)
- String getCurrentPath()
- boolean isSet(String)
- boolean isOfflinePlayer(String)
- List getDoubleList(String)
- OfflinePlayer getOfflinePlayer(String)
- OfflinePlayer getOfflinePlayer(String, OfflinePlayer)
- void addDefault(String, Object)
- ConfigurationSerializable getSerializable(String, Class)
- ConfigurationSerializable getSerializable(String, Class, ConfigurationSerializable)
- int getInt(String)
- int getInt(String, int)
- boolean contains(String)
- boolean contains(String, boolean)
- List getIntegerList(String)
- List getByteList(String)
- List getStringList(String)
- void setInlineComments(String, List)
- List getInlineComments(String)
- boolean isDouble(String)
- List getBooleanList(String)
- double getDouble(String)
- double getDouble(String, double)
- boolean isVector(String)
- List getMapList(String)
- boolean isList(String)
- boolean isBoolean(String)
- boolean isColor(String)
- Object get(String)
- Object get(String, Object)
- boolean isString(String)
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- ItemStack getItemStack(String)
- ItemStack getItemStack(String, ItemStack)
- void setComments(String, List)
- Configuration getRoot()
- boolean isItemStack(String)
- ConfigurationSection getParent()
- boolean isLong(String)
- void set(String, Object)
- Map getValues(boolean)
- Color getColor(String)
- Color getColor(String, Color)
- String getString(String)
- String getString(String, String)
- Set getKeys(boolean)
- long getLong(String)
- long getLong(String, long)
- List getFloatList(String)
- boolean isLocation(String)
- boolean isConfigurationSection(String)
- String toString()

### Class: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfigurationSection$ConfigManager
Type: Class

No public methods found

## Package: org.betonquest.betonquest.api.bukkit.config.custom.handle

### Class: org.betonquest.betonquest.api.bukkit.config.custom.handle.ConfigurationModificationHandler
Type: Interface
Implements: org.betonquest.betonquest.api.bukkit.config.custom.handle.ConfigurationSectionModificationHandler

Methods:
- void addDefault(ConfigurationSection, String, Object)
- void addDefaults(Configuration, Map)
- void addDefaults(Configuration, Configuration)
- void setDefaults(Configuration, Configuration)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.handle.ConfigurationSectionModificationHandler
Type: Interface

Methods:
- void addDefault(ConfigurationSection, String, Object)
- void set(ConfigurationSection, String, Object)
- **static** String getAbsolutePath(ConfigurationSection, String)
- void setComments(ConfigurationSection, String, List)
- void setInlineComments(ConfigurationSection, String, List)
- ConfigurationSection createSection(ConfigurationSection, String)
- ConfigurationSection createSection(ConfigurationSection, String, Map)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleConfigurationOptions
Type: Class
Extends: org.bukkit.configuration.ConfigurationOptions

Methods:
- boolean copyDefaults()
- ConfigurationOptions copyDefaults(boolean)
- char pathSeparator()
- ConfigurationOptions pathSeparator(char)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfiguration
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfigurationSection
Implements: org.bukkit.configuration.Configuration

Methods:
- void addDefault(String, Object)
- void addDefaults(Map)
- void addDefaults(Configuration)
- ConfigurationOptions options()
- Configuration getDefaults()
- void setDefaults(Configuration)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfigurationSection
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.ConfigurationSectionDecorator

Methods:
- void addDefault(String, Object)
- ConfigurationSection getDefaultSection()
- Object getObject(String, Class)
- Object getObject(String, Class, Object)
- ConfigurationSection getParent()
- ConfigurationSection getConfigurationSection(String)
- void set(String, Object)
- Map getValues(boolean)
- Object get(String)
- Object get(String, Object)
- void setComments(String, List)
- Configuration getRoot()
- void setInlineComments(String, List)
- ConfigurationSection createSection(String)
- ConfigurationSection createSection(String, Map)

## Package: org.betonquest.betonquest.api.bukkit.config.custom.lazy

### Class: org.betonquest.betonquest.api.bukkit.config.custom.lazy.LazyConfigurationSection
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfigurationSection

No public methods found

### Class: org.betonquest.betonquest.api.bukkit.config.custom.lazy.LazyConfigurationSection$LazyMemoryConfigurationSection
Type: Class
Extends: org.bukkit.configuration.MemorySection

No public methods found

## Package: org.betonquest.betonquest.api.bukkit.config.custom.multi

### Class: org.betonquest.betonquest.api.bukkit.config.custom.multi.MultiConfiguration
Type: Interface
Implements: org.bukkit.configuration.Configuration

Methods:
- void associateWith(ConfigurationSection)
- void associateWith(String, ConfigurationSection)
- boolean markAsSaved(ConfigurationSection)
- Set getUnsavedConfigs()
- List getUnassociatedKeys()
- boolean needSave()
- ConfigurationSection getSourceConfigurationSection(String) throws InvalidConfigurationException

### Class: org.betonquest.betonquest.api.bukkit.config.custom.multi.InvalidSubConfigurationException
Type: Class
Extends: org.bukkit.configuration.InvalidConfigurationException

Methods:
- ConfigurationSection getSubConfiguration()

### Class: org.betonquest.betonquest.api.bukkit.config.custom.multi.KeyConflictException
Type: Class
Extends: org.bukkit.configuration.InvalidConfigurationException

Methods:
- String resolvedMessage(Map)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.multi.MultiSectionConfiguration
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfiguration
Implements: org.betonquest.betonquest.api.bukkit.config.custom.multi.MultiConfiguration

Methods:
- void associateWith(ConfigurationSection)
- void associateWith(String, ConfigurationSection)
- boolean markAsSaved(ConfigurationSection)
- Set getUnsavedConfigs()
- ConfigurationOptions options()
- List getUnassociatedKeys()
- boolean needSave()
- ConfigurationSection getSourceConfigurationSection(String) throws InvalidConfigurationException

## Package: org.betonquest.betonquest.api.bukkit.config.custom.multi.fallback

### Class: org.betonquest.betonquest.api.bukkit.config.custom.multi.fallback.MultiFallbackConfiguration
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfiguration
Implements: org.betonquest.betonquest.api.bukkit.config.custom.multi.MultiConfiguration

Methods:
- void associateWith(ConfigurationSection)
- void associateWith(String, ConfigurationSection)
- boolean markAsSaved(ConfigurationSection)
- Set getUnsavedConfigs()
- List getUnassociatedKeys()
- boolean needSave()
- ConfigurationSection getSourceConfigurationSection(String) throws InvalidConfigurationException

## Package: org.betonquest.betonquest.api.bukkit.config.custom.unmodifiable

### Class: org.betonquest.betonquest.api.bukkit.config.custom.unmodifiable.UnmodifiableConfiguration
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfiguration

No public methods found

### Class: org.betonquest.betonquest.api.bukkit.config.custom.unmodifiable.UnmodifiableConfigurationSection
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfigurationSection

No public methods found

## Package: org.betonquest.betonquest.api.common.function

### Class: org.betonquest.betonquest.api.common.function.Selector
Type: Interface

Methods:
- Object selectFor(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.common.function.ConstantSelector
Type: Class
Implements: org.betonquest.betonquest.api.common.function.Selector

Methods:
- Object selectFor(Profile)

### Class: org.betonquest.betonquest.api.common.function.Selectors
Type: Class

Methods:
- **static** Selector fromPlayer(Function)
- **static** Selector fromOnlineProfile(Function)
- **static** Selector fromOfflinePlayer(Function)

## Package: org.betonquest.betonquest.api.config

### Class: org.betonquest.betonquest.api.config.ConfigAccessor
Type: Interface

Methods:
- boolean reload() throws IOException
- File getConfigurationFile()
- boolean save() throws IOException
- boolean delete() throws IOException
- YamlConfiguration getConfig()

### Class: org.betonquest.betonquest.api.config.ConfigAccessorFactory
Type: Interface

Methods:
- ConfigAccessor create(File) throws InvalidConfigurationException, FileNotFoundException
- ConfigAccessor create(Plugin, String) throws InvalidConfigurationException, FileNotFoundException
- ConfigAccessor create(File, Plugin, String) throws InvalidConfigurationException, FileNotFoundException

### Class: org.betonquest.betonquest.api.config.ConfigurationFile
Type: Interface
Implements: org.bukkit.configuration.ConfigurationSection

Methods:
- boolean reload() throws IOException
- boolean save() throws IOException
- boolean delete() throws IOException

### Class: org.betonquest.betonquest.api.config.ConfigurationFileFactory
Type: Interface

Methods:
- ConfigurationFile create(File, Plugin, String) throws InvalidConfigurationException, FileNotFoundException
- ConfigurationFile create(File, Plugin, String, PatchTransformerRegisterer) throws InvalidConfigurationException, FileNotFoundException

## Package: org.betonquest.betonquest.api.config.patcher

### Class: org.betonquest.betonquest.api.config.patcher.PatchTransformer
Type: Interface

Methods:
- void transform(Map, ConfigurationSection) throws PatchException

### Class: org.betonquest.betonquest.api.config.patcher.PatchTransformerRegisterer
Type: Interface

Methods:
- void registerTransformers(Patcher)

### Class: org.betonquest.betonquest.api.config.patcher.PatchException
Type: Class
Extends: java.lang.Exception

No public methods found

## Package: org.betonquest.betonquest.api.config.quest

### Class: org.betonquest.betonquest.api.config.quest.QuestPackage
Type: Interface

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

## Package: org.betonquest.betonquest.api.logger

### Class: org.betonquest.betonquest.api.logger.BetonQuestLogger
Type: Interface

Methods:
- void warn(String)
- void warn(String, Throwable)
- void warn(QuestPackage, String)
- void warn(QuestPackage, String, Throwable)
- void debug(String)
- void debug(String, Throwable)
- void debug(QuestPackage, String)
- void debug(QuestPackage, String, Throwable)
- void reportException(Throwable)
- void reportException(QuestPackage, Throwable)
- void error(String)
- void error(String, Throwable)
- void error(QuestPackage, String)
- void error(QuestPackage, String, Throwable)
- void info(String)
- void info(QuestPackage, String)

### Class: org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory
Type: Interface

Methods:
- BetonQuestLogger create(Class)
- BetonQuestLogger create(Class, String)
- BetonQuestLogger create(Plugin)
- BetonQuestLogger create(Plugin, String)

### Class: org.betonquest.betonquest.api.logger.CachingBetonQuestLoggerFactory
Type: Class
Implements: org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory

Methods:
- BetonQuestLogger create(Class, String)
- BetonQuestLogger create(Plugin, String)

### Class: org.betonquest.betonquest.api.logger.SingletonLoggerFactory
Type: Class
Implements: org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory

Methods:
- BetonQuestLogger create(Class, String)
- BetonQuestLogger create(Plugin, String)

## Package: org.betonquest.betonquest.api.profiles

### Class: org.betonquest.betonquest.api.profiles.OnlineProfile
Type: Interface
Implements: org.betonquest.betonquest.api.profiles.Profile

Methods:
- Player getPlayer()
- OfflinePlayer getPlayer()

### Class: org.betonquest.betonquest.api.profiles.Profile
Type: Interface

Methods:
- OfflinePlayer getPlayer()
- UUID getProfileUUID()
- Optional getOnlineProfile()
- String getProfileName()
- String toString()
- UUID getPlayerUUID()

### Class: org.betonquest.betonquest.api.profiles.ProfileEvent
Type: Abstract Class
Extends: org.bukkit.event.Event

Methods:
- Profile getProfile()

## Package: org.betonquest.betonquest.api.quest

### Class: org.betonquest.betonquest.api.quest.PlayerQuestFactory
Type: Interface

Methods:
- Object parsePlayer(Instruction) throws InstructionParseException

### Class: org.betonquest.betonquest.api.quest.PlayerlessQuestFactory
Type: Interface

Methods:
- Object parsePlayerless(Instruction) throws InstructionParseException

## Package: org.betonquest.betonquest.api.quest.condition

### Class: org.betonquest.betonquest.api.quest.condition.PlayerCondition
Type: Interface

Methods:
- boolean check(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.condition.PlayerConditionFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerQuestFactory

Methods:
- PlayerCondition parsePlayer(Instruction) throws InstructionParseException
- Object parsePlayer(Instruction) throws InstructionParseException

### Class: org.betonquest.betonquest.api.quest.condition.PlayerlessCondition
Type: Interface

Methods:
- boolean check() throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.condition.PlayerlessConditionFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerlessQuestFactory

Methods:
- PlayerlessCondition parsePlayerless(Instruction) throws InstructionParseException
- Object parsePlayerless(Instruction) throws InstructionParseException

## Package: org.betonquest.betonquest.api.quest.condition.nullable

### Class: org.betonquest.betonquest.api.quest.condition.nullable.NullableCondition
Type: Interface

Methods:
- boolean check(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.condition.nullable.NullableConditionAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.condition.PlayerCondition, org.betonquest.betonquest.api.quest.condition.PlayerlessCondition

Methods:
- boolean check(Profile) throws QuestRuntimeException
- boolean check() throws QuestRuntimeException

## Package: org.betonquest.betonquest.api.quest.condition.online

### Class: org.betonquest.betonquest.api.quest.condition.online.OnlineCondition
Type: Interface

Methods:
- boolean check(OnlineProfile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.condition.online.OnlineConditionAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.condition.PlayerCondition

Methods:
- boolean check(Profile) throws QuestRuntimeException

## Package: org.betonquest.betonquest.api.quest.event

### Class: org.betonquest.betonquest.api.quest.event.Event
Type: Interface

Methods:
- void execute(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.event.EventFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerQuestFactory

Methods:
- Event parseEvent(Instruction) throws InstructionParseException
- Event parsePlayer(Instruction) throws InstructionParseException
- Object parsePlayer(Instruction) throws InstructionParseException

### Class: org.betonquest.betonquest.api.quest.event.StaticEvent
Type: Interface

Methods:
- void execute() throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.event.StaticEventFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerlessQuestFactory

Methods:
- StaticEvent parseStaticEvent(Instruction) throws InstructionParseException
- StaticEvent parsePlayerless(Instruction) throws InstructionParseException
- Object parsePlayerless(Instruction) throws InstructionParseException

## Package: org.betonquest.betonquest.api.quest.event.nullable

### Class: org.betonquest.betonquest.api.quest.event.nullable.NullableEvent
Type: Interface

Methods:
- void execute(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.event.nullable.NullableEventAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.event.Event, org.betonquest.betonquest.api.quest.event.StaticEvent

Methods:
- void execute(Profile) throws QuestRuntimeException
- void execute() throws QuestRuntimeException

## Package: org.betonquest.betonquest.api.quest.event.online

### Class: org.betonquest.betonquest.api.quest.event.online.OnlineEvent
Type: Interface

Methods:
- void execute(OnlineProfile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.event.online.OnlineEventAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.event.Event

Methods:
- void execute(Profile) throws QuestRuntimeException

## Package: org.betonquest.betonquest.api.quest.variable

### Class: org.betonquest.betonquest.api.quest.variable.PlayerVariable
Type: Interface

Methods:
- String getValue(Profile)

### Class: org.betonquest.betonquest.api.quest.variable.PlayerVariableFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerQuestFactory

Methods:
- PlayerVariable parsePlayer(Instruction) throws InstructionParseException
- Object parsePlayer(Instruction) throws InstructionParseException

### Class: org.betonquest.betonquest.api.quest.variable.PlayerlessVariable
Type: Interface

Methods:
- String getValue()

### Class: org.betonquest.betonquest.api.quest.variable.PlayerlessVariableFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerlessQuestFactory

Methods:
- PlayerlessVariable parsePlayerless(Instruction) throws InstructionParseException
- Object parsePlayerless(Instruction) throws InstructionParseException

## Package: org.betonquest.betonquest.api.quest.variable.nullable

### Class: org.betonquest.betonquest.api.quest.variable.nullable.NullableVariable
Type: Interface

Methods:
- String getValue(Profile)

### Class: org.betonquest.betonquest.api.quest.variable.nullable.NullableVariableAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.variable.PlayerVariable, org.betonquest.betonquest.api.quest.variable.PlayerlessVariable

Methods:
- String getValue(Profile)
- String getValue()

## Package: org.betonquest.betonquest.api.quest.variable.online

### Class: org.betonquest.betonquest.api.quest.variable.online.OnlineVariable
Type: Interface

Methods:
- String getValue(OnlineProfile)

### Class: org.betonquest.betonquest.api.quest.variable.online.OnlineVariableAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.variable.PlayerVariable

Methods:
- String getValue(Profile)

## Package: org.betonquest.betonquest.api.schedule

### Class: org.betonquest.betonquest.api.schedule.CatchupStrategy
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** CatchupStrategy valueOf(String)
- **static** CatchupStrategy[] values()

### Class: org.betonquest.betonquest.api.schedule.CronSchedule
Type: Abstract Class
Extends: org.betonquest.betonquest.api.schedule.Schedule

Methods:
- Cron getTimeCron()
- boolean shouldRunOnReboot()
- ExecutionTime getExecutionTime()

### Class: org.betonquest.betonquest.api.schedule.Schedule
Type: Abstract Class

Methods:
- List getEvents()
- String getTime()
- ScheduleID getId()
- CatchupStrategy getCatchup()

### Class: org.betonquest.betonquest.api.schedule.Scheduler
Type: Abstract Class

Methods:
- void stop()
- boolean isRunning()
- void start()
- void start(Object)
- void addSchedule(Schedule)

# BetonQuest-org-betonquest-betonquest-api API Reference

**Package Filter:** `org.betonquest.betonquest.api`

## Main BetonQuest Class Methods

### Class: org.betonquest.betonquest.BetonQuest
Type: Main Plugin Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- **static** BetonQuest getInstance()
- PlayerData getPlayerData(Profile profile)
- PlayerData getPlayerData(OnlineProfile profile)
- PlayerData getOfflinePlayerData(Profile profile)
- void putPlayerData(Profile profile, PlayerData playerData)
- void removePlayerData(Profile profile)
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
- List<Objective> getPlayerObjectives(Profile profile)
- @Nullable ConversationData getConversation(ConversationID conversationID)
- @Nullable Objective getObjective(ObjectiveID objectiveID)
- void loadData()
- void reload()
- void callSyncBukkitEvent(Event event)
- void renameObjective(ObjectiveID name, ObjectiveID rename)
- @Nullable Class<? extends ConversationIO> getConvIO(String name)
- @Nullable Class<? extends Interceptor> getInterceptor(String name)
- void registerObjectives(String name, Class<? extends Objective> objectiveClass)
- void registerConversationIO(String name, Class<? extends ConversationIO> convIOClass)
- void registerInterceptor(String name, Class<? extends Interceptor> interceptorClass)
- void registerNotifyIO(String name, Class<? extends NotifyIO> ioClass)
- <S extends Schedule> void registerScheduleType(String name, Class<S> schedule, Scheduler<S, ?> scheduler)
- @Deprecated void registerConditions(String name, Class<? extends Condition> conditionClass)
- @Deprecated void registerEvents(String name, Class<? extends QuestEvent> eventClass)
- @Deprecated void registerVariable(String name, Class<? extends Variable> variable)
- @Deprecated void registerNonStaticEvent(String name, EventFactory eventFactory)
- @Deprecated <T extends EventFactory & StaticEventFactory> void registerEvent(String name, T eventFactory)
- @Deprecated void registerEvent(String name, EventFactory eventFactory, StaticEventFactory staticEventFactory)
- @Deprecated String getVariableValue(String packName, String name, @Nullable Profile profile)
- @Deprecated @Nullable LegacyTypeFactory<QuestEvent> getEventFactory(String name)

## Package: org.betonquest.betonquest.api

### Class: org.betonquest.betonquest.api.Objective$QREThrowing
Type: Interface

Methods:
- void run() throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.Condition
Type: Abstract Class
Extends: org.betonquest.betonquest.api.ForceSyncHandler

Methods:
- boolean isStatic()
- boolean isPersistent()

### Class: org.betonquest.betonquest.api.ConversationOptionEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- ResolvedOption getSelectedOption()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Conversation getConversation()
- ResolvedOption getNextNPCOption()

### Class: org.betonquest.betonquest.api.CountingObjective
Type: Abstract Class
Extends: org.betonquest.betonquest.api.Objective

Methods:
- String getProperty(String, Profile)
- String getDefaultDataInstruction()
- String getDefaultDataInstruction(Profile)
- CountingObjective$CountingData getCountingData(Profile)

### Class: org.betonquest.betonquest.api.CountingObjective$CountingData
Type: Class
Extends: org.betonquest.betonquest.api.Objective$ObjectiveData

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

### Class: org.betonquest.betonquest.api.ForceSyncHandler
Type: Abstract Class

Methods:
- Object handle(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.LoadDataEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.MobKillNotifier
Type: Class

Methods:
- **static** void addKill(Profile, Entity)

### Class: org.betonquest.betonquest.api.MobKillNotifier$MobKilledEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getEntity()

### Class: org.betonquest.betonquest.api.Objective
Type: Abstract Class

Methods:
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

### Class: org.betonquest.betonquest.api.Objective$ObjectiveData
Type: Class

Methods:
- String toString()

### Class: org.betonquest.betonquest.api.Objective$ObjectiveState
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Objective$ObjectiveState valueOf(String)
- **static** Objective$ObjectiveState[] values()

### Class: org.betonquest.betonquest.api.Objective$QREHandler
Type: Class

Methods:
- void handle(Objective$QREThrowing)

### Class: org.betonquest.betonquest.api.PlayerConversationEndEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Conversation getConversation()

### Class: org.betonquest.betonquest.api.PlayerConversationStartEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Conversation getConversation()

### Class: org.betonquest.betonquest.api.PlayerJournalAddEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- Journal getJournal()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Pointer getPointer()

### Class: org.betonquest.betonquest.api.PlayerJournalDeleteEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- Journal getJournal()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Pointer getPointer()

### Class: org.betonquest.betonquest.api.PlayerObjectiveChangeEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- Objective$ObjectiveState getPreviousState()
- Objective$ObjectiveState getState()
- HandlerList getHandlers()
- Objective getObjective()
- **static** HandlerList getHandlerList()
- ObjectiveID getObjectiveID()

### Class: org.betonquest.betonquest.api.PlayerTagAddEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getTag()

### Class: org.betonquest.betonquest.api.PlayerTagRemoveEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getTag()

### Class: org.betonquest.betonquest.api.PlayerUpdatePointEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- int getNewCount()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getCategory()

### Class: org.betonquest.betonquest.api.QuestCompassTargetChangeEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Location getLocation()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: org.betonquest.betonquest.api.QuestDataUpdateEvent
Type: Class
Extends: org.betonquest.betonquest.api.profiles.ProfileEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getObjID()
- String getData()

### Class: org.betonquest.betonquest.api.QuestEvent
Type: Abstract Class
Extends: org.betonquest.betonquest.api.ForceSyncHandler

Methods:
- boolean fire(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.Variable
Type: Abstract Class

Methods:
- String getValue(Profile)
- Instruction getInstruction()
- String toString()
- boolean isStaticness()

## Package: org.betonquest.betonquest.api.bukkit.command

### Class: org.betonquest.betonquest.api.bukkit.command.SilentCommandSender
Type: Class
Implements: org.bukkit.command.CommandSender

Methods:
- Server getServer()
- Set getEffectivePermissions()
- String getName()
- void setOp(boolean)
- boolean hasPermission(String)
- boolean hasPermission(Permission)
- Component name()
- CommandSender$Spigot spigot()
- void sendMessage(String)
- void sendMessage(String[])
- void sendMessage(UUID, String)
- void sendMessage(UUID, String[])
- boolean isOp()
- void recalculatePermissions()
- void removeAttachment(PermissionAttachment)
- PermissionAttachment addAttachment(Plugin, String, boolean)
- PermissionAttachment addAttachment(Plugin)
- PermissionAttachment addAttachment(Plugin, String, boolean, int)
- PermissionAttachment addAttachment(Plugin, int)
- boolean isPermissionSet(String)
- boolean isPermissionSet(Permission)

### Class: org.betonquest.betonquest.api.bukkit.command.SilentConsoleCommandSender
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.command.SilentCommandSender
Implements: org.bukkit.command.ConsoleCommandSender

Methods:
- boolean beginConversation(Conversation)
- void acceptConversationInput(String)
- void sendRawMessage(String)
- void sendRawMessage(UUID, String)
- boolean isConversing()
- void abandonConversation(Conversation)
- void abandonConversation(Conversation, ConversationAbandonedEvent)

## Package: org.betonquest.betonquest.api.bukkit.config.custom

### Class: org.betonquest.betonquest.api.bukkit.config.custom.ConfigurationSectionDecorator
Type: Class
Implements: org.bukkit.configuration.ConfigurationSection

Methods:
- List getLongList(String)
- Location getLocation(String)
- Location getLocation(String, Location)
- String getName()
- Vector getVector(String)
- Vector getVector(String, Vector)
- List getShortList(String)
- ConfigurationSection getConfigurationSection(String)
- List getList(String)
- List getList(String, List)
- List getComments(String)
- boolean isInt(String)
- List getCharacterList(String)
- ConfigurationSection createSection(String)
- ConfigurationSection createSection(String, Map)
- ConfigurationSection getDefaultSection()
- Object getObject(String, Class)
- Object getObject(String, Class, Object)
- String getCurrentPath()
- boolean isSet(String)
- boolean isOfflinePlayer(String)
- List getDoubleList(String)
- OfflinePlayer getOfflinePlayer(String)
- OfflinePlayer getOfflinePlayer(String, OfflinePlayer)
- void addDefault(String, Object)
- ConfigurationSerializable getSerializable(String, Class)
- ConfigurationSerializable getSerializable(String, Class, ConfigurationSerializable)
- int getInt(String)
- int getInt(String, int)
- boolean contains(String)
- boolean contains(String, boolean)
- List getIntegerList(String)
- List getByteList(String)
- List getStringList(String)
- void setInlineComments(String, List)
- List getInlineComments(String)
- boolean isDouble(String)
- List getBooleanList(String)
- double getDouble(String)
- double getDouble(String, double)
- boolean isVector(String)
- List getMapList(String)
- boolean isList(String)
- boolean isBoolean(String)
- boolean isColor(String)
- Object get(String)
- Object get(String, Object)
- boolean isString(String)
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- ItemStack getItemStack(String)
- ItemStack getItemStack(String, ItemStack)
- void setComments(String, List)
- Configuration getRoot()
- boolean isItemStack(String)
- ConfigurationSection getParent()
- boolean isLong(String)
- void set(String, Object)
- Map getValues(boolean)
- Color getColor(String)
- Color getColor(String, Color)
- String getString(String)
- String getString(String, String)
- Set getKeys(boolean)
- long getLong(String)
- long getLong(String, long)
- List getFloatList(String)
- boolean isLocation(String)
- boolean isConfigurationSection(String)
- String toString()

## Package: org.betonquest.betonquest.api.bukkit.config.custom.fallback

### Class: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfiguration
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfigurationSection
Implements: org.bukkit.configuration.Configuration

Methods:
- void addDefaults(Map)
- void addDefaults(Configuration)
- ConfigurationOptions options()
- Configuration getDefaults()
- void setDefaults(Configuration)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfigurationOptions
Type: Class
Extends: org.bukkit.configuration.ConfigurationOptions

Methods:
- boolean copyDefaults()
- ConfigurationOptions copyDefaults(boolean)
- char pathSeparator()
- ConfigurationOptions pathSeparator(char)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfigurationSection
Type: Class
Implements: org.bukkit.configuration.ConfigurationSection

Methods:
- List getLongList(String)
- Location getLocation(String)
- Location getLocation(String, Location)
- String getName()
- Vector getVector(String)
- Vector getVector(String, Vector)
- List getShortList(String)
- ConfigurationSection getConfigurationSection(String)
- List getList(String)
- List getList(String, List)
- List getComments(String)
- boolean isInt(String)
- List getCharacterList(String)
- ConfigurationSection createSection(String)
- ConfigurationSection createSection(String, Map)
- ConfigurationSection getDefaultSection()
- Object getObject(String, Class)
- Object getObject(String, Class, Object)
- String getCurrentPath()
- boolean isSet(String)
- boolean isOfflinePlayer(String)
- List getDoubleList(String)
- OfflinePlayer getOfflinePlayer(String)
- OfflinePlayer getOfflinePlayer(String, OfflinePlayer)
- void addDefault(String, Object)
- ConfigurationSerializable getSerializable(String, Class)
- ConfigurationSerializable getSerializable(String, Class, ConfigurationSerializable)
- int getInt(String)
- int getInt(String, int)
- boolean contains(String)
- boolean contains(String, boolean)
- List getIntegerList(String)
- List getByteList(String)
- List getStringList(String)
- void setInlineComments(String, List)
- List getInlineComments(String)
- boolean isDouble(String)
- List getBooleanList(String)
- double getDouble(String)
- double getDouble(String, double)
- boolean isVector(String)
- List getMapList(String)
- boolean isList(String)
- boolean isBoolean(String)
- boolean isColor(String)
- Object get(String)
- Object get(String, Object)
- boolean isString(String)
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- ItemStack getItemStack(String)
- ItemStack getItemStack(String, ItemStack)
- void setComments(String, List)
- Configuration getRoot()
- boolean isItemStack(String)
- ConfigurationSection getParent()
- boolean isLong(String)
- void set(String, Object)
- Map getValues(boolean)
- Color getColor(String)
- Color getColor(String, Color)
- String getString(String)
- String getString(String, String)
- Set getKeys(boolean)
- long getLong(String)
- long getLong(String, long)
- List getFloatList(String)
- boolean isLocation(String)
- boolean isConfigurationSection(String)
- String toString()

### Class: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfigurationSection$ConfigManager
Type: Class

No public methods found

## Package: org.betonquest.betonquest.api.bukkit.config.custom.handle

### Class: org.betonquest.betonquest.api.bukkit.config.custom.handle.ConfigurationModificationHandler
Type: Interface
Implements: org.betonquest.betonquest.api.bukkit.config.custom.handle.ConfigurationSectionModificationHandler

Methods:
- void addDefault(ConfigurationSection, String, Object)
- void addDefaults(Configuration, Map)
- void addDefaults(Configuration, Configuration)
- void setDefaults(Configuration, Configuration)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.handle.ConfigurationSectionModificationHandler
Type: Interface

Methods:
- void addDefault(ConfigurationSection, String, Object)
- void set(ConfigurationSection, String, Object)
- **static** String getAbsolutePath(ConfigurationSection, String)
- void setComments(ConfigurationSection, String, List)
- void setInlineComments(ConfigurationSection, String, List)
- ConfigurationSection createSection(ConfigurationSection, String)
- ConfigurationSection createSection(ConfigurationSection, String, Map)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleConfigurationOptions
Type: Class
Extends: org.bukkit.configuration.ConfigurationOptions

Methods:
- boolean copyDefaults()
- ConfigurationOptions copyDefaults(boolean)
- char pathSeparator()
- ConfigurationOptions pathSeparator(char)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfiguration
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfigurationSection
Implements: org.bukkit.configuration.Configuration

Methods:
- void addDefault(String, Object)
- void addDefaults(Map)
- void addDefaults(Configuration)
- ConfigurationOptions options()
- Configuration getDefaults()
- void setDefaults(Configuration)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfigurationSection
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.ConfigurationSectionDecorator

Methods:
- void addDefault(String, Object)
- ConfigurationSection getDefaultSection()
- Object getObject(String, Class)
- Object getObject(String, Class, Object)
- ConfigurationSection getParent()
- ConfigurationSection getConfigurationSection(String)
- void set(String, Object)
- Map getValues(boolean)
- Object get(String)
- Object get(String, Object)
- void setComments(String, List)
- Configuration getRoot()
- void setInlineComments(String, List)
- ConfigurationSection createSection(String)
- ConfigurationSection createSection(String, Map)

## Package: org.betonquest.betonquest.api.bukkit.config.custom.lazy

### Class: org.betonquest.betonquest.api.bukkit.config.custom.lazy.LazyConfigurationSection
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfigurationSection

No public methods found

### Class: org.betonquest.betonquest.api.bukkit.config.custom.lazy.LazyConfigurationSection$LazyMemoryConfigurationSection
Type: Class
Extends: org.bukkit.configuration.MemorySection

No public methods found

## Package: org.betonquest.betonquest.api.bukkit.config.custom.multi

### Class: org.betonquest.betonquest.api.bukkit.config.custom.multi.MultiConfiguration
Type: Interface
Implements: org.bukkit.configuration.Configuration

Methods:
- void associateWith(ConfigurationSection)
- void associateWith(String, ConfigurationSection)
- boolean markAsSaved(ConfigurationSection)
- Set getUnsavedConfigs()
- List getUnassociatedKeys()
- boolean needSave()
- ConfigurationSection getSourceConfigurationSection(String) throws InvalidConfigurationException

### Class: org.betonquest.betonquest.api.bukkit.config.custom.multi.InvalidSubConfigurationException
Type: Class
Extends: org.bukkit.configuration.InvalidConfigurationException

Methods:
- ConfigurationSection getSubConfiguration()

### Class: org.betonquest.betonquest.api.bukkit.config.custom.multi.KeyConflictException
Type: Class
Extends: org.bukkit.configuration.InvalidConfigurationException

Methods:
- String resolvedMessage(Map)

### Class: org.betonquest.betonquest.api.bukkit.config.custom.multi.MultiSectionConfiguration
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfiguration
Implements: org.betonquest.betonquest.api.bukkit.config.custom.multi.MultiConfiguration

Methods:
- void associateWith(ConfigurationSection)
- void associateWith(String, ConfigurationSection)
- boolean markAsSaved(ConfigurationSection)
- Set getUnsavedConfigs()
- ConfigurationOptions options()
- List getUnassociatedKeys()
- boolean needSave()
- ConfigurationSection getSourceConfigurationSection(String) throws InvalidConfigurationException

## Package: org.betonquest.betonquest.api.bukkit.config.custom.multi.fallback

### Class: org.betonquest.betonquest.api.bukkit.config.custom.multi.fallback.MultiFallbackConfiguration
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.fallback.FallbackConfiguration
Implements: org.betonquest.betonquest.api.bukkit.config.custom.multi.MultiConfiguration

Methods:
- void associateWith(ConfigurationSection)
- void associateWith(String, ConfigurationSection)
- boolean markAsSaved(ConfigurationSection)
- Set getUnsavedConfigs()
- List getUnassociatedKeys()
- boolean needSave()
- ConfigurationSection getSourceConfigurationSection(String) throws InvalidConfigurationException

## Package: org.betonquest.betonquest.api.bukkit.config.custom.unmodifiable

### Class: org.betonquest.betonquest.api.bukkit.config.custom.unmodifiable.UnmodifiableConfiguration
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfiguration

No public methods found

### Class: org.betonquest.betonquest.api.bukkit.config.custom.unmodifiable.UnmodifiableConfigurationSection
Type: Class
Extends: org.betonquest.betonquest.api.bukkit.config.custom.handle.HandleModificationConfigurationSection

No public methods found

## Package: org.betonquest.betonquest.api.common.function

### Class: org.betonquest.betonquest.api.common.function.Selector
Type: Interface

Methods:
- Object selectFor(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.common.function.ConstantSelector
Type: Class
Implements: org.betonquest.betonquest.api.common.function.Selector

Methods:
- Object selectFor(Profile)

### Class: org.betonquest.betonquest.api.common.function.Selectors
Type: Class

Methods:
- **static** Selector fromPlayer(Function)
- **static** Selector fromOnlineProfile(Function)
- **static** Selector fromOfflinePlayer(Function)

## Package: org.betonquest.betonquest.api.config

### Class: org.betonquest.betonquest.api.config.ConfigAccessor
Type: Interface

Methods:
- boolean reload() throws IOException
- File getConfigurationFile()
- boolean save() throws IOException
- boolean delete() throws IOException
- YamlConfiguration getConfig()

### Class: org.betonquest.betonquest.api.config.ConfigAccessorFactory
Type: Interface

Methods:
- ConfigAccessor create(File) throws InvalidConfigurationException, FileNotFoundException
- ConfigAccessor create(Plugin, String) throws InvalidConfigurationException, FileNotFoundException
- ConfigAccessor create(File, Plugin, String) throws InvalidConfigurationException, FileNotFoundException

### Class: org.betonquest.betonquest.api.config.ConfigurationFile
Type: Interface
Implements: org.bukkit.configuration.ConfigurationSection

Methods:
- boolean reload() throws IOException
- boolean save() throws IOException
- boolean delete() throws IOException

### Class: org.betonquest.betonquest.api.config.ConfigurationFileFactory
Type: Interface

Methods:
- ConfigurationFile create(File, Plugin, String) throws InvalidConfigurationException, FileNotFoundException
- ConfigurationFile create(File, Plugin, String, PatchTransformerRegisterer) throws InvalidConfigurationException, FileNotFoundException

## Package: org.betonquest.betonquest.api.config.patcher

### Class: org.betonquest.betonquest.api.config.patcher.PatchTransformer
Type: Interface

Methods:
- void transform(Map, ConfigurationSection) throws PatchException

### Class: org.betonquest.betonquest.api.config.patcher.PatchTransformerRegisterer
Type: Interface

Methods:
- void registerTransformers(Patcher)

### Class: org.betonquest.betonquest.api.config.patcher.PatchException
Type: Class
Extends: java.lang.Exception

No public methods found

## Package: org.betonquest.betonquest.api.config.quest

### Class: org.betonquest.betonquest.api.config.quest.QuestPackage
Type: Interface

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

## Package: org.betonquest.betonquest.api.logger

### Class: org.betonquest.betonquest.api.logger.BetonQuestLogger
Type: Interface

Methods:
- void warn(String)
- void warn(String, Throwable)
- void warn(QuestPackage, String)
- void warn(QuestPackage, String, Throwable)
- void debug(String)
- void debug(String, Throwable)
- void debug(QuestPackage, String)
- void debug(QuestPackage, String, Throwable)
- void reportException(Throwable)
- void reportException(QuestPackage, Throwable)
- void error(String)
- void error(String, Throwable)
- void error(QuestPackage, String)
- void error(QuestPackage, String, Throwable)
- void info(String)
- void info(QuestPackage, String)

### Class: org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory
Type: Interface

Methods:
- BetonQuestLogger create(Class)
- BetonQuestLogger create(Class, String)
- BetonQuestLogger create(Plugin)
- BetonQuestLogger create(Plugin, String)

### Class: org.betonquest.betonquest.api.logger.CachingBetonQuestLoggerFactory
Type: Class
Implements: org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory

Methods:
- BetonQuestLogger create(Class, String)
- BetonQuestLogger create(Plugin, String)

### Class: org.betonquest.betonquest.api.logger.SingletonLoggerFactory
Type: Class
Implements: org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory

Methods:
- BetonQuestLogger create(Class, String)
- BetonQuestLogger create(Plugin, String)

## Package: org.betonquest.betonquest.api.profiles

### Class: org.betonquest.betonquest.api.profiles.OnlineProfile
Type: Interface
Implements: org.betonquest.betonquest.api.profiles.Profile

Methods:
- Player getPlayer()
- OfflinePlayer getPlayer()

### Class: org.betonquest.betonquest.api.profiles.Profile
Type: Interface

Methods:
- OfflinePlayer getPlayer()
- UUID getProfileUUID()
- Optional getOnlineProfile()
- String getProfileName()
- String toString()
- UUID getPlayerUUID()

### Class: org.betonquest.betonquest.api.profiles.ProfileEvent
Type: Abstract Class
Extends: org.bukkit.event.Event

Methods:
- Profile getProfile()

## Package: org.betonquest.betonquest.api.quest

### Class: org.betonquest.betonquest.api.quest.PlayerQuestFactory
Type: Interface

Methods:
- Object parsePlayer(Instruction) throws InstructionParseException

### Class: org.betonquest.betonquest.api.quest.PlayerlessQuestFactory
Type: Interface

Methods:
- Object parsePlayerless(Instruction) throws InstructionParseException

## Package: org.betonquest.betonquest.api.quest.condition

### Class: org.betonquest.betonquest.api.quest.condition.PlayerCondition
Type: Interface

Methods:
- boolean check(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.condition.PlayerConditionFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerQuestFactory

Methods:
- PlayerCondition parsePlayer(Instruction) throws InstructionParseException
- Object parsePlayer(Instruction) throws InstructionParseException

### Class: org.betonquest.betonquest.api.quest.condition.PlayerlessCondition
Type: Interface

Methods:
- boolean check() throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.condition.PlayerlessConditionFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerlessQuestFactory

Methods:
- PlayerlessCondition parsePlayerless(Instruction) throws InstructionParseException
- Object parsePlayerless(Instruction) throws InstructionParseException

## Package: org.betonquest.betonquest.api.quest.condition.nullable

### Class: org.betonquest.betonquest.api.quest.condition.nullable.NullableCondition
Type: Interface

Methods:
- boolean check(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.condition.nullable.NullableConditionAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.condition.PlayerCondition, org.betonquest.betonquest.api.quest.condition.PlayerlessCondition

Methods:
- boolean check(Profile) throws QuestRuntimeException
- boolean check() throws QuestRuntimeException

## Package: org.betonquest.betonquest.api.quest.condition.online

### Class: org.betonquest.betonquest.api.quest.condition.online.OnlineCondition
Type: Interface

Methods:
- boolean check(OnlineProfile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.condition.online.OnlineConditionAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.condition.PlayerCondition

Methods:
- boolean check(Profile) throws QuestRuntimeException

## Package: org.betonquest.betonquest.api.quest.event

### Class: org.betonquest.betonquest.api.quest.event.Event
Type: Interface

Methods:
- void execute(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.event.EventFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerQuestFactory

Methods:
- Event parseEvent(Instruction) throws InstructionParseException
- Event parsePlayer(Instruction) throws InstructionParseException
- Object parsePlayer(Instruction) throws InstructionParseException

### Class: org.betonquest.betonquest.api.quest.event.StaticEvent
Type: Interface

Methods:
- void execute() throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.event.StaticEventFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerlessQuestFactory

Methods:
- StaticEvent parseStaticEvent(Instruction) throws InstructionParseException
- StaticEvent parsePlayerless(Instruction) throws InstructionParseException
- Object parsePlayerless(Instruction) throws InstructionParseException

## Package: org.betonquest.betonquest.api.quest.event.nullable

### Class: org.betonquest.betonquest.api.quest.event.nullable.NullableEvent
Type: Interface

Methods:
- void execute(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.event.nullable.NullableEventAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.event.Event, org.betonquest.betonquest.api.quest.event.StaticEvent

Methods:
- void execute(Profile) throws QuestRuntimeException
- void execute() throws QuestRuntimeException

## Package: org.betonquest.betonquest.api.quest.event.online

### Class: org.betonquest.betonquest.api.quest.event.online.OnlineEvent
Type: Interface

Methods:
- void execute(OnlineProfile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.event.online.OnlineEventAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.event.Event

Methods:
- void execute(Profile) throws QuestRuntimeException

## Package: org.betonquest.betonquest.api.quest.variable

### Class: org.betonquest.betonquest.api.quest.variable.PlayerVariable
Type: Interface

Methods:
- String getValue(Profile)

### Class: org.betonquest.betonquest.api.quest.variable.PlayerVariableFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerQuestFactory

Methods:
- PlayerVariable parsePlayer(Instruction) throws InstructionParseException
- Object parsePlayer(Instruction) throws InstructionParseException

### Class: org.betonquest.betonquest.api.quest.variable.PlayerlessVariable
Type: Interface

Methods:
- String getValue()

### Class: org.betonquest.betonquest.api.quest.variable.PlayerlessVariableFactory
Type: Interface
Implements: org.betonquest.betonquest.api.quest.PlayerlessQuestFactory

Methods:
- PlayerlessVariable parsePlayerless(Instruction) throws InstructionParseException
- Object parsePlayerless(Instruction) throws InstructionParseException

## Package: org.betonquest.betonquest.api.quest.variable.nullable

### Class: org.betonquest.betonquest.api.quest.variable.nullable.NullableVariable
Type: Interface

Methods:
- String getValue(Profile)

### Class: org.betonquest.betonquest.api.quest.variable.nullable.NullableVariableAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.variable.PlayerVariable, org.betonquest.betonquest.api.quest.variable.PlayerlessVariable

Methods:
- String getValue(Profile)
- String getValue()

## Package: org.betonquest.betonquest.api.quest.variable.online

### Class: org.betonquest.betonquest.api.quest.variable.online.OnlineVariable
Type: Interface

Methods:
- String getValue(OnlineProfile)

### Class: org.betonquest.betonquest.api.quest.variable.online.OnlineVariableAdapter
Type: Class
Implements: org.betonquest.betonquest.api.quest.variable.PlayerVariable

Methods:
- String getValue(Profile)

## Package: org.betonquest.betonquest.api.schedule

### Class: org.betonquest.betonquest.api.schedule.CatchupStrategy
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** CatchupStrategy valueOf(String)
- **static** CatchupStrategy[] values()

### Class: org.betonquest.betonquest.api.schedule.CronSchedule
Type: Abstract Class
Extends: org.betonquest.betonquest.api.schedule.Schedule

Methods:
- Cron getTimeCron()
- boolean shouldRunOnReboot()
- ExecutionTime getExecutionTime()

### Class: org.betonquest.betonquest.api.schedule.Schedule
Type: Abstract Class

Methods:
- List getEvents()
- String getTime()
- ScheduleID getId()
- CatchupStrategy getCatchup()

### Class: org.betonquest.betonquest.api.schedule.Scheduler
Type: Abstract Class

Methods:
- void stop()
- boolean isRunning()
- void start()
- void start(Object)
- void addSchedule(Schedule)

## PlayerConverter Utility Class

### Class: org.betonquest.betonquest.utils.PlayerConverter
Type: Utility Class

Methods:
- **static** OnlineProfile getOnlineProfile(Player player)
- **static** Collection<OnlineProfile> getOnlineProfiles()
- **static** Profile getProfile(String playerName)
- **static** Profile getProfile(UUID uuid)