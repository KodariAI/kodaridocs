# worldguard-core-7.0.14 API Reference

## Package: com.sk89q.worldguard

### Class: com.sk89q.worldguard.LocalPlayer
Type: Interface
Implements: com.sk89q.worldedit.entity.Player, com.sk89q.worldguard.protection.association.RegionAssociable

Methods:
- void setPlayerTime(long, boolean)
- double getMaxHealth()
- void teleport(Location, String, String)
- void sendTitle(String, String)
- double getSaturation()
- void setCompassTarget(Location)
- void ban(String)
- void setFireTicks(int)
- void setPlayerWeather(WeatherType)
- Association getAssociation(List)
- int getFireTicks()
- boolean hasGroup(String)
- double getHealth()
- void setHealth(double)
- float getExhaustion()
- long getPlayerTimeOffset()
- boolean isPlayerTimeRelative()
- WeatherType getPlayerWeather()
- void kick(String)
- void resetPlayerWeather()
- void setFoodLevel(double)
- void resetPlayerTime()
- void setExhaustion(float)
- double getFoodLevel()
- void resetFallDistance()
- void setSaturation(double)

### Class: com.sk89q.worldguard.WorldGuard
Type: Class

Methods:
- **static** String getVersion()
- LocalPlayer checkPlayer(Actor) throws CommandException
- ProfileService getProfileService()
- ListeningExecutorService getExecutorService()
- void setPlatform(WorldGuardPlatform)
- void disable()
- FlagRegistry getFlagRegistry()
- Supervisor getSupervisor()
- void setup()
- **static** WorldGuard getInstance()
- WorldGuardExceptionConverter getExceptionConverter()
- ProfileCache getProfileCache()
- WorldGuardPlatform getPlatform()

## Package: com.sk89q.worldguard.blacklist

### Class: com.sk89q.worldguard.blacklist.Blacklist
Type: Class

Methods:
- void load(File) throws IOException
- boolean isWhitelist()
- LoadingCache getRepeatingEventCache()
- int getItemCount()
- boolean isEmpty()
- BlacklistLoggerHandler getLogger()
- boolean check(BlacklistEvent, boolean, boolean)
- void notify(BlacklistEvent, String)
- BlacklistEvent getLastEvent()

### Class: com.sk89q.worldguard.blacklist.BlacklistEntry
Type: Class

Methods:
- String[] getIgnoreGroups()
- String[] getIgnorePermissions()
- void setIgnorePermissions(String[])
- boolean shouldIgnore(LocalPlayer)
- void setComment(String)
- String getMessage()
- List getActions(Class)
- String getComment()
- boolean check(boolean, BlacklistEvent, boolean, boolean)
- void setMessage(String)
- void setIgnoreGroups(String[])

### Class: com.sk89q.worldguard.blacklist.BlacklistLoggerHandler
Type: Class
Implements: com.sk89q.worldguard.blacklist.logger.LoggerHandler

Methods:
- void addHandler(LoggerHandler)
- void clearHandlers()
- void removeHandler(LoggerHandler)
- void close()
- void logEvent(BlacklistEvent, String)

### Class: com.sk89q.worldguard.blacklist.MatcherIndex$Builder
Type: Class

Methods:
- MatcherIndex$Builder add(TargetMatcher, BlacklistEntry)
- MatcherIndex build()

## Package: com.sk89q.worldguard.blacklist.action

### Class: com.sk89q.worldguard.blacklist.action.Action
Type: Interface

Methods:
- ActionResult apply(BlacklistEvent, boolean, boolean, boolean)

### Class: com.sk89q.worldguard.blacklist.action.ActionResult
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ActionResult valueOf(String)
- **static** ActionResult[] values()

### Class: com.sk89q.worldguard.blacklist.action.ActionType
Type: Enum
Extends: java.lang.Enum

Methods:
- Action parseInput(Blacklist, BlacklistEntry)
- **static** ActionType valueOf(String)
- **static** ActionType[] values()
- String getActionName()

### Class: com.sk89q.worldguard.blacklist.action.AllowAction
Type: Class
Implements: com.sk89q.worldguard.blacklist.action.Action

Methods:
- ActionResult apply(BlacklistEvent, boolean, boolean, boolean)
- **static** AllowAction getInstance()

### Class: com.sk89q.worldguard.blacklist.action.BanAction
Type: Class
Implements: com.sk89q.worldguard.blacklist.action.Action

Methods:
- ActionResult apply(BlacklistEvent, boolean, boolean, boolean)

### Class: com.sk89q.worldguard.blacklist.action.DenyAction
Type: Class
Implements: com.sk89q.worldguard.blacklist.action.Action

Methods:
- ActionResult apply(BlacklistEvent, boolean, boolean, boolean)
- **static** DenyAction getInstance()

### Class: com.sk89q.worldguard.blacklist.action.KickAction
Type: Class
Implements: com.sk89q.worldguard.blacklist.action.Action

Methods:
- ActionResult apply(BlacklistEvent, boolean, boolean, boolean)

### Class: com.sk89q.worldguard.blacklist.action.LogAction
Type: Class
Extends: com.sk89q.worldguard.blacklist.action.RepeatGuardedAction

No public methods found

### Class: com.sk89q.worldguard.blacklist.action.NotifyAction
Type: Class
Extends: com.sk89q.worldguard.blacklist.action.RepeatGuardedAction

No public methods found

### Class: com.sk89q.worldguard.blacklist.action.RepeatGuardedAction
Type: Abstract Class
Implements: com.sk89q.worldguard.blacklist.action.Action

Methods:
- ActionResult apply(BlacklistEvent, boolean, boolean, boolean)

### Class: com.sk89q.worldguard.blacklist.action.TellAction
Type: Class
Extends: com.sk89q.worldguard.blacklist.action.RepeatGuardedAction

No public methods found

## Package: com.sk89q.worldguard.blacklist.event

### Class: com.sk89q.worldguard.blacklist.event.BlacklistEvent
Type: Interface

Methods:
- Target getTarget()
- LocalPlayer getPlayer()
- EventType getEventType()
- BlockVector3 getPosition()
- String getLoggerMessage()
- BlockVector3 getLoggedPosition()
- String getDescription()
- String getCauseName()

### Class: com.sk89q.worldguard.blacklist.event.BlockBreakBlacklistEvent
Type: Class
Extends: com.sk89q.worldguard.blacklist.event.BlockBlacklistEvent

Methods:
- LocalPlayer getPlayer()
- Target getTarget()
- BlockVector3 getPosition()
- EventType getEventType()
- String getLoggerMessage()
- BlockVector3 getLoggedPosition()
- String getDescription()
- String getCauseName()

### Class: com.sk89q.worldguard.blacklist.event.BlockDispenseBlacklistEvent
Type: Class
Extends: com.sk89q.worldguard.blacklist.event.BlockBlacklistEvent

Methods:
- LocalPlayer getPlayer()
- Target getTarget()
- BlockVector3 getPosition()
- EventType getEventType()
- String getLoggerMessage()
- BlockVector3 getLoggedPosition()
- String getDescription()
- String getCauseName()

### Class: com.sk89q.worldguard.blacklist.event.BlockInteractBlacklistEvent
Type: Class
Extends: com.sk89q.worldguard.blacklist.event.BlockBlacklistEvent

Methods:
- LocalPlayer getPlayer()
- Target getTarget()
- BlockVector3 getPosition()
- EventType getEventType()
- String getLoggerMessage()
- BlockVector3 getLoggedPosition()
- String getDescription()
- String getCauseName()

### Class: com.sk89q.worldguard.blacklist.event.BlockPlaceBlacklistEvent
Type: Class
Extends: com.sk89q.worldguard.blacklist.event.BlockBlacklistEvent

Methods:
- LocalPlayer getPlayer()
- Target getTarget()
- BlockVector3 getPosition()
- EventType getEventType()
- String getLoggerMessage()
- BlockVector3 getLoggedPosition()
- String getDescription()
- String getCauseName()

### Class: com.sk89q.worldguard.blacklist.event.EventType
Type: Enum
Extends: java.lang.Enum

Methods:
- String getRuleName()
- **static** EventType valueOf(String)
- **static** EventType[] values()
- Class getEventClass()

### Class: com.sk89q.worldguard.blacklist.event.ItemAcquireBlacklistEvent
Type: Class
Extends: com.sk89q.worldguard.blacklist.event.ItemBlacklistEvent

Methods:
- LocalPlayer getPlayer()
- Target getTarget()
- BlockVector3 getPosition()
- EventType getEventType()
- String getLoggerMessage()
- BlockVector3 getLoggedPosition()
- String getDescription()
- String getCauseName()

### Class: com.sk89q.worldguard.blacklist.event.ItemDestroyWithBlacklistEvent
Type: Class
Extends: com.sk89q.worldguard.blacklist.event.ItemBlacklistEvent

Methods:
- LocalPlayer getPlayer()
- Target getTarget()
- BlockVector3 getPosition()
- EventType getEventType()
- String getLoggerMessage()
- BlockVector3 getLoggedPosition()
- String getDescription()
- String getCauseName()

### Class: com.sk89q.worldguard.blacklist.event.ItemDropBlacklistEvent
Type: Class
Extends: com.sk89q.worldguard.blacklist.event.ItemBlacklistEvent

Methods:
- LocalPlayer getPlayer()
- Target getTarget()
- BlockVector3 getPosition()
- EventType getEventType()
- String getLoggerMessage()
- BlockVector3 getLoggedPosition()
- String getDescription()
- String getCauseName()

### Class: com.sk89q.worldguard.blacklist.event.ItemEquipBlacklistEvent
Type: Class
Extends: com.sk89q.worldguard.blacklist.event.ItemBlacklistEvent

Methods:
- LocalPlayer getPlayer()
- Target getTarget()
- BlockVector3 getPosition()
- EventType getEventType()
- String getLoggerMessage()
- BlockVector3 getLoggedPosition()
- String getDescription()
- String getCauseName()

### Class: com.sk89q.worldguard.blacklist.event.ItemUseBlacklistEvent
Type: Class
Extends: com.sk89q.worldguard.blacklist.event.ItemBlacklistEvent

Methods:
- LocalPlayer getPlayer()
- Target getTarget()
- BlockVector3 getPosition()
- EventType getEventType()
- String getLoggerMessage()
- BlockVector3 getLoggedPosition()
- String getDescription()
- String getCauseName()

## Package: com.sk89q.worldguard.blacklist.logger

### Class: com.sk89q.worldguard.blacklist.logger.LoggerHandler
Type: Interface

Methods:
- void close()
- void logEvent(BlacklistEvent, String)

### Class: com.sk89q.worldguard.blacklist.logger.ConsoleHandler
Type: Class
Implements: com.sk89q.worldguard.blacklist.logger.LoggerHandler

Methods:
- void close()
- void logEvent(BlacklistEvent, String)

### Class: com.sk89q.worldguard.blacklist.logger.DatabaseHandler
Type: Class
Implements: com.sk89q.worldguard.blacklist.logger.LoggerHandler

Methods:
- void close()
- void logEvent(BlacklistEvent, String)

### Class: com.sk89q.worldguard.blacklist.logger.FileHandler
Type: Class
Implements: com.sk89q.worldguard.blacklist.logger.LoggerHandler

Methods:
- void close()
- void logEvent(BlacklistEvent, String)

### Class: com.sk89q.worldguard.blacklist.logger.LogFileWriter
Type: Class
Implements: java.lang.Comparable

Methods:
- long getLastUse()
- BufferedWriter getWriter()
- String getPath()
- int compareTo(LogFileWriter)
- int compareTo(Object)
- void updateLastUse()

## Package: com.sk89q.worldguard.blacklist.target

### Class: com.sk89q.worldguard.blacklist.target.Target
Type: Interface

Methods:
- String getFriendlyName()
- String getTypeId()

### Class: com.sk89q.worldguard.blacklist.target.TargetMatcher
Type: Interface

Methods:
- boolean test(Target)
- String getMatchedTypeId()

### Class: com.sk89q.worldguard.blacklist.target.BlockMatcher
Type: Class
Implements: com.sk89q.worldguard.blacklist.target.TargetMatcher

Methods:
- boolean test(Target)
- String getMatchedTypeId()

### Class: com.sk89q.worldguard.blacklist.target.BlockTarget
Type: Class
Implements: com.sk89q.worldguard.blacklist.target.Target

Methods:
- String getFriendlyName()
- String getTypeId()

### Class: com.sk89q.worldguard.blacklist.target.ItemBlockMatcher
Type: Class
Implements: com.sk89q.worldguard.blacklist.target.TargetMatcher

Methods:
- boolean test(Target)
- String getMatchedTypeId()

### Class: com.sk89q.worldguard.blacklist.target.ItemMatcher
Type: Class
Implements: com.sk89q.worldguard.blacklist.target.TargetMatcher

Methods:
- boolean test(Target)
- String getMatchedTypeId()

### Class: com.sk89q.worldguard.blacklist.target.ItemTarget
Type: Class
Implements: com.sk89q.worldguard.blacklist.target.Target

Methods:
- String getFriendlyName()
- String getTypeId()

### Class: com.sk89q.worldguard.blacklist.target.TargetMatcherParseException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.sk89q.worldguard.blacklist.target.TargetMatcherParser
Type: Class

Methods:
- TargetMatcher fromInput(String) throws TargetMatcherParseException

## Package: com.sk89q.worldguard.chest

### Class: com.sk89q.worldguard.chest.ChestProtection
Type: Interface

Methods:
- boolean isProtected(Location, LocalPlayer)
- boolean isProtectedPlacement(Location, LocalPlayer)
- boolean isChest(BlockType)
- boolean isAdjacentChestProtected(Location, LocalPlayer)

### Class: com.sk89q.worldguard.chest.SignChestProtection
Type: Abstract Class
Implements: com.sk89q.worldguard.chest.ChestProtection

Methods:
- boolean isProtected(Location, LocalPlayer)
- boolean isProtectedPlacement(Location, LocalPlayer)
- Boolean isProtectedSign(Location, LocalPlayer)
- boolean isAdjacentChestProtected(Location, LocalPlayer)

## Package: com.sk89q.worldguard.commands

### Class: com.sk89q.worldguard.commands.CommandUtils
Type: Class

Methods:
- **static** Function messageComponentFunction(Actor)
- **static** String replaceColorMacros(String)
- **static** Function messageFunction(Actor)
- **static** String getOwnerName(Object)

### Class: com.sk89q.worldguard.commands.DebuggingCommands
Type: Class

Methods:
- void fireInteractEvent(CommandContext, Actor) throws CommandException
- void firePlaceEvent(CommandContext, Actor) throws CommandException
- void fireBreakEvent(CommandContext, Actor) throws CommandException
- void fireDamageEvent(CommandContext, Actor) throws CommandException

### Class: com.sk89q.worldguard.commands.GeneralCommands
Type: Class

Methods:
- void stack(CommandContext, Actor) throws CommandException
- void locate(CommandContext, Actor) throws CommandException
- void slay(CommandContext, Actor) throws CommandException, AuthorizationException
- void ungod(CommandContext, Actor) throws CommandException, AuthorizationException
- void heal(CommandContext, Actor) throws CommandException, AuthorizationException
- void god(CommandContext, Actor) throws CommandException, AuthorizationException

### Class: com.sk89q.worldguard.commands.ProtectionCommands
Type: Class

Methods:
- void worldGuard(CommandContext, Actor)
- void region(CommandContext, Actor)

### Class: com.sk89q.worldguard.commands.ToggleCommands
Type: Class

Methods:
- void stopFire(CommandContext, Actor) throws CommandException
- void allowFire(CommandContext, Actor) throws CommandException
- void stopLag(CommandContext, Actor) throws CommandException

### Class: com.sk89q.worldguard.commands.WorldGuardCommands
Type: Class

Methods:
- void debug(CommandContext, Actor)
- void reload(CommandContext, Actor) throws CommandException
- void flushStates(CommandContext, Actor) throws CommandException
- void profile(CommandContext, Actor) throws CommandException, AuthorizationException
- void listRunningTasks(CommandContext, Actor) throws CommandException
- void report(CommandContext, Actor) throws CommandException, AuthorizationException
- void stopProfile(CommandContext, Actor) throws CommandException
- void version(CommandContext, Actor) throws CommandException

## Package: com.sk89q.worldguard.commands.region

### Class: com.sk89q.worldguard.commands.region.MemberCommands
Type: Class
Extends: com.sk89q.worldguard.commands.region.RegionCommandsBase

Methods:
- void removeMember(CommandContext, Actor) throws CommandException
- void addMember(CommandContext, Actor) throws CommandException
- void addOwner(CommandContext, Actor) throws CommandException
- void removeOwner(CommandContext, Actor) throws CommandException

### Class: com.sk89q.worldguard.commands.region.RegionCommands
Type: Class
Extends: com.sk89q.worldguard.commands.region.RegionCommandsBase

Methods:
- void flag(CommandContext, Actor) throws CommandException
- void select(CommandContext, Actor) throws CommandException
- void teleport(CommandContext, Actor) throws CommandException
- void save(CommandContext, Actor) throws CommandException
- void list(CommandContext, Actor) throws CommandException
- void remove(CommandContext, Actor) throws CommandException
- void flagHelper(CommandContext, Actor) throws CommandException
- void redefine(CommandContext, Actor) throws CommandException
- void migrateUuid(CommandContext, Actor) throws CommandException
- void toggleBypass(CommandContext, Actor) throws CommandException
- void load(CommandContext, Actor) throws CommandException
- void define(CommandContext, Actor) throws CommandException
- void claim(CommandContext, Actor) throws CommandException
- void setParent(CommandContext, Actor) throws CommandException
- void migrateHeights(CommandContext, Actor) throws CommandException
- void setPriority(CommandContext, Actor) throws CommandException
- void migrateDB(CommandContext, Actor) throws CommandException
- void info(CommandContext, Actor) throws CommandException

### Class: com.sk89q.worldguard.commands.region.RegionPrintoutBuilder
Type: Class
Implements: java.util.concurrent.Callable

Methods:
- void appendFlags()
- void appendBasics()
- void appendParentTree(boolean)
- void appendBounds()
- TextComponent call()
- Object call() throws Exception
- void newline()
- void appendDomain()
- TextComponent toComponent()
- String toString()
- void appendFlagsList(boolean)
- void send(Actor)
- TextComponentProducer append(String)
- TextComponentProducer append(TextComponent)
- void appendParents()

## Package: com.sk89q.worldguard.commands.task

### Class: com.sk89q.worldguard.commands.task.RegionAdder
Type: Class
Implements: java.util.concurrent.Callable

Methods:
- void setLocatorPolicy(DomainInputResolver$UserLocatorPolicy)
- ProtectedRegion call() throws Exception
- Object call() throws Exception
- String[] getOwnersInput()
- void setOwnersInput(String[])
- void addOwnersFromCommand(CommandContext, int)
- DomainInputResolver$UserLocatorPolicy getLocatorPolicy()

### Class: com.sk89q.worldguard.commands.task.RegionLister
Type: Class
Implements: java.util.concurrent.Callable

Methods:
- Integer call() throws Exception
- Object call() throws Exception
- int getPage()
- void filterIdByMatch(String)
- void filterByIntersecting(ProtectedRegion)
- void filterOwnedByName(String, boolean)
- void setPage(int)

### Class: com.sk89q.worldguard.commands.task.RegionManagerLoader
Type: Class
Implements: java.util.concurrent.Callable

Methods:
- Collection call() throws StorageException
- Object call() throws Exception

### Class: com.sk89q.worldguard.commands.task.RegionManagerSaver
Type: Class
Implements: java.util.concurrent.Callable

Methods:
- Collection call() throws StorageException
- Object call() throws Exception

### Class: com.sk89q.worldguard.commands.task.RegionRemover
Type: Class
Implements: java.util.concurrent.Callable

Methods:
- Set call() throws Exception
- Object call() throws Exception
- RemovalStrategy getRemovalStrategy()
- void setRemovalStrategy(RemovalStrategy)

## Package: com.sk89q.worldguard.config

### Class: com.sk89q.worldguard.config.ConfigurationManager
Type: Abstract Class

Methods:
- boolean hasGodMode(LocalPlayer)
- void disableAmphibiousMode(LocalPlayer)
- void enableAmphibiousMode(LocalPlayer)
- void disableUuidMigration()
- void load()
- File getWorldsDataFolder()
- WorldConfiguration get(World)
- void unload()
- boolean hasAmphibiousMode(LocalPlayer)
- File getDataFolder()

### Class: com.sk89q.worldguard.config.WorldConfiguration
Type: Abstract Class

Methods:
- int getMaxRegionCount(LocalPlayer)
- String convertLegacyItem(String)
- void loadConfiguration()
- List convertLegacyBlocks(List)
- List convertLegacyItems(List)
- Blacklist getBlacklist()
- String convertLegacyBlock(String)

### Class: com.sk89q.worldguard.config.YamlConfigurationManager
Type: Abstract Class
Extends: com.sk89q.worldguard.config.ConfigurationManager

Methods:
- void copyDefaults()
- void disableUuidMigration()
- void load()
- void postLoad()
- YAMLProcessor getConfig()

### Class: com.sk89q.worldguard.config.YamlWorldConfiguration
Type: Abstract Class
Extends: com.sk89q.worldguard.config.WorldConfiguration

Methods:
- List getIntList(String, List)
- int getInt(String, int)
- Object getProperty(String)
- boolean getBoolean(String, boolean)
- List getKeys(String)
- String getString(String, String)
- List getStringList(String, List)

## Package: com.sk89q.worldguard.domains

### Class: com.sk89q.worldguard.domains.Domain
Type: Interface

Methods:
- boolean contains(LocalPlayer)
- boolean contains(UUID)
- boolean contains(String)
- int size()
- void clear()

### Class: com.sk89q.worldguard.domains.Association
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Association valueOf(String)
- **static** Association[] values()

### Class: com.sk89q.worldguard.domains.DefaultDomain
Type: Class
Implements: com.sk89q.worldguard.domains.Domain, com.sk89q.worldguard.util.ChangeTracked

Methods:
- Component toUserFriendlyComponent(ProfileCache)
- String toUserFriendlyString()
- String toUserFriendlyString(ProfileCache)
- Set getUniqueIds()
- void clear()
- String toPlayersString()
- String toPlayersString(ProfileCache)
- void setDirty(boolean)
- void removePlayer(String)
- void removePlayer(UUID)
- void removePlayer(LocalPlayer)
- boolean contains(LocalPlayer)
- boolean contains(UUID)
- boolean contains(String)
- void removeAll(DefaultDomain)
- void removeAll()
- boolean isDirty()
- PlayerDomain getPlayerDomain()
- String toGroupsString()
- int size()
- void addPlayer(String)
- void addPlayer(UUID)
- void addPlayer(LocalPlayer)
- void addAll(DefaultDomain)
- void removeGroup(String)
- void setPlayerDomain(PlayerDomain)
- String toString()
- GroupDomain getGroupDomain()
- void addGroup(String)
- Set getPlayers()
- void setGroupDomain(GroupDomain)
- Set getGroups()

### Class: com.sk89q.worldguard.domains.GroupDomain
Type: Class
Implements: com.sk89q.worldguard.domains.Domain, com.sk89q.worldguard.util.ChangeTracked

Methods:
- boolean contains(LocalPlayer)
- boolean contains(UUID)
- boolean contains(String)
- boolean isDirty()
- int size()
- void removeGroup(String)
- void clear()
- String toString()
- void addGroup(String)
- void setDirty(boolean)
- Set getGroups()

### Class: com.sk89q.worldguard.domains.PlayerDomain
Type: Class
Implements: com.sk89q.worldguard.domains.Domain, com.sk89q.worldguard.util.ChangeTracked

Methods:
- boolean contains(LocalPlayer)
- boolean contains(UUID)
- boolean contains(String)
- boolean isDirty()
- int size()
- void addPlayer(String)
- void addPlayer(UUID)
- void addPlayer(LocalPlayer)
- Set getUniqueIds()
- void clear()
- String toString()
- Set getPlayers()
- void setDirty(boolean)
- void removePlayer(String)
- void removePlayer(UUID)
- void removePlayer(LocalPlayer)

## Package: com.sk89q.worldguard.internal

### Class: com.sk89q.worldguard.internal.PermissionModel
Type: Interface

No public methods found

## Package: com.sk89q.worldguard.internal.permission

### Class: com.sk89q.worldguard.internal.permission.AbstractPermissionModel
Type: Abstract Class
Implements: com.sk89q.worldguard.internal.PermissionModel

Methods:
- Actor getSender()

### Class: com.sk89q.worldguard.internal.permission.RegionPermissionModel
Type: Class
Extends: com.sk89q.worldguard.internal.permission.AbstractPermissionModel

Methods:
- boolean mayDelete(ProtectedRegion)
- boolean mayMigrateRegionNames()
- boolean mayTeleportTo(ProtectedRegion)
- boolean mayForceSaveRegions()
- boolean mayIgnoreRegionProtection(World)
- boolean mayAddOwners(ProtectedRegion)
- boolean maySelect(ProtectedRegion)
- boolean mayRemoveOwners(ProtectedRegion)
- boolean maySetParent(ProtectedRegion, ProtectedRegion)
- boolean maySetFlag(ProtectedRegion)
- boolean maySetFlag(ProtectedRegion, Flag)
- boolean maySetFlag(ProtectedRegion, Flag, String)
- boolean mayMigrateRegionHeights()
- boolean mayClaim()
- boolean mayForceLoadRegions()
- boolean mayDefine()
- boolean maySetPriority(ProtectedRegion)
- boolean mayRemoveMembers(ProtectedRegion)
- boolean mayAddMembers(ProtectedRegion)
- boolean mayTeleportToCenter(ProtectedRegion)
- boolean mayClaimRegionsUnbounded()
- boolean mayRedefine(ProtectedRegion)
- boolean mayOverrideLocationFlagBounds(ProtectedRegion)
- boolean mayLookup(ProtectedRegion)
- boolean mayList()
- boolean mayList(String)
- boolean mayMigrateRegionStore()

## Package: com.sk89q.worldguard.internal.platform

### Class: com.sk89q.worldguard.internal.platform.DebugHandler
Type: Interface

Methods:
- void testBreak(Actor, LocalPlayer, boolean, boolean) throws CommandException
- void testPlace(Actor, LocalPlayer, boolean, boolean) throws CommandException
- void testDamage(Actor, LocalPlayer, boolean, boolean) throws CommandException
- void testInteract(Actor, LocalPlayer, boolean, boolean) throws CommandException

### Class: com.sk89q.worldguard.internal.platform.StringMatcher
Type: Interface

Methods:
- String replaceMacros(Actor, String)
- LocalPlayer matchSinglePlayer(Actor, String) throws CommandException
- World matchWorld(Actor, String) throws CommandException
- Actor matchPlayerOrConsole(Actor, String) throws CommandException
- List matchPlayerNames(String)
- World getWorldByName(String)
- Iterable checkPlayerMatch(List) throws CommandException
- Iterable matchPlayers(Actor, String) throws CommandException
- Iterable matchPlayers(LocalPlayer)

### Class: com.sk89q.worldguard.internal.platform.WorldGuardPlatform
Type: Interface

Methods:
- RegionContainer getRegionContainer()
- void notifyFlagContextCreate(FlagContext$FlagContextBuilder)
- ProfileService createProfileService(ProfileCache)
- void addPlatformReports(ReportList)
- String getPlatformName()
- ProtectedRegion getSpawnProtection(World)
- GameMode getDefaultGameMode()
- Path getConfigDir()
- SessionManager getSessionManager()
- void load()
- void stackPlayerInventory(LocalPlayer)
- StringMatcher getMatcher()
- void unload()
- ConfigurationManager getGlobalStateManager()
- String getPlatformVersion()
- DebugHandler getDebugHandler()
- void broadcastNotification(String)
- void broadcastNotification(TextComponent)

## Package: com.sk89q.worldguard.internal.util.sql

### Class: com.sk89q.worldguard.internal.util.sql.StatementUtils
Type: Class

Methods:
- **static** void setValues(PreparedStatement, String[]) throws SQLException
- **static** String preparePlaceHolders(int)

## Package: com.sk89q.worldguard.protection

### Class: com.sk89q.worldguard.protection.ApplicableRegionSet
Type: Interface
Implements: java.lang.Iterable

Methods:
- Set getRegions()
- Object queryMapValue(RegionAssociable, MapFlag, Object)
- Object queryMapValue(RegionAssociable, MapFlag, Object, Flag)
- boolean testState(RegionAssociable, StateFlag[])
- int size()
- StateFlag$State queryState(RegionAssociable, StateFlag[])
- boolean isOwnerOfAll(LocalPlayer)
- Object queryValue(RegionAssociable, Flag)
- boolean isVirtual()
- boolean isMemberOfAll(LocalPlayer)
- Collection queryAllValues(RegionAssociable, Flag)

### Class: com.sk89q.worldguard.protection.AbstractRegionSet
Type: Abstract Class
Implements: com.sk89q.worldguard.protection.ApplicableRegionSet

Methods:
- boolean testState(RegionAssociable, StateFlag[])
- StateFlag$State queryState(RegionAssociable, StateFlag[])

### Class: com.sk89q.worldguard.protection.DelayedRegionOverlapAssociation
Type: Class
Extends: com.sk89q.worldguard.protection.association.DelayedRegionOverlapAssociation

No public methods found

### Class: com.sk89q.worldguard.protection.FailedLoadRegionSet
Type: Class
Extends: com.sk89q.worldguard.protection.AbstractRegionSet

Methods:
- Set getRegions()
- Object queryMapValue(RegionAssociable, MapFlag, Object)
- Object queryMapValue(RegionAssociable, MapFlag, Object, Flag)
- Iterator iterator()
- int size()
- **static** FailedLoadRegionSet getInstance()
- boolean isOwnerOfAll(LocalPlayer)
- Object queryValue(RegionAssociable, Flag)
- boolean isVirtual()
- boolean isMemberOfAll(LocalPlayer)
- Collection queryAllValues(RegionAssociable, Flag)

### Class: com.sk89q.worldguard.protection.FlagValueCalculator
Type: Class

Methods:
- **static** int getPriorityOf(ProtectedRegion)
- Object queryMapValue(RegionAssociable, MapFlag, Object, Flag)
- Object getEffectiveFlag(ProtectedRegion, Flag, RegionAssociable)
- FlagValueCalculator$Result getMembership(RegionAssociable)
- Object getEffectiveMapValue(ProtectedRegion, MapFlag, Object, RegionAssociable)
- int getPriority(ProtectedRegion)
- StateFlag$State queryState(RegionAssociable, StateFlag[])
- StateFlag$State queryState(RegionAssociable, StateFlag)
- **static** Object getEffectiveMapValueOf(ProtectedRegion, MapFlag, Object, RegionAssociable)
- Object queryValue(RegionAssociable, Flag)
- **static** Object getEffectiveFlagOf(ProtectedRegion, Flag, RegionAssociable)
- Collection queryAllValues(RegionAssociable, Flag)

### Class: com.sk89q.worldguard.protection.FlagValueCalculator$Result
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** FlagValueCalculator$Result valueOf(String)
- **static** FlagValueCalculator$Result[] values()

### Class: com.sk89q.worldguard.protection.PermissiveRegionSet
Type: Class
Extends: com.sk89q.worldguard.protection.AbstractRegionSet

Methods:
- Set getRegions()
- Object queryMapValue(RegionAssociable, MapFlag, Object)
- Object queryMapValue(RegionAssociable, MapFlag, Object, Flag)
- Iterator iterator()
- int size()
- **static** PermissiveRegionSet getInstance()
- boolean isOwnerOfAll(LocalPlayer)
- Object queryValue(RegionAssociable, Flag)
- boolean isVirtual()
- boolean isMemberOfAll(LocalPlayer)
- Collection queryAllValues(RegionAssociable, Flag)

### Class: com.sk89q.worldguard.protection.RegionResultSet
Type: Class
Extends: com.sk89q.worldguard.protection.AbstractRegionSet

Methods:
- Set getRegions()
- Object queryMapValue(RegionAssociable, MapFlag, Object)
- Object queryMapValue(RegionAssociable, MapFlag, Object, Flag)
- Iterator iterator()
- **static** RegionResultSet fromSortedList(List, ProtectedRegion)
- int size()
- StateFlag$State queryState(RegionAssociable, StateFlag[])
- boolean isOwnerOfAll(LocalPlayer)
- Object queryValue(RegionAssociable, Flag)
- boolean isVirtual()
- boolean isMemberOfAll(LocalPlayer)
- Collection queryAllValues(RegionAssociable, Flag)

## Package: com.sk89q.worldguard.protection.association

### Class: com.sk89q.worldguard.protection.association.RegionAssociable
Type: Interface

Methods:
- Association getAssociation(List)

### Class: com.sk89q.worldguard.protection.association.AbstractRegionOverlapAssociation
Type: Abstract Class
Implements: com.sk89q.worldguard.protection.association.RegionAssociable

Methods:
- Association getAssociation(List)

### Class: com.sk89q.worldguard.protection.association.Associables
Type: Class

Methods:
- **static** RegionAssociable constant(Association)

### Class: com.sk89q.worldguard.protection.association.DelayedRegionOverlapAssociation
Type: Class
Extends: com.sk89q.worldguard.protection.association.AbstractRegionOverlapAssociation

Methods:
- Association getAssociation(List)

### Class: com.sk89q.worldguard.protection.association.RegionOverlapAssociation
Type: Class
Extends: com.sk89q.worldguard.protection.association.AbstractRegionOverlapAssociation

No public methods found

## Package: com.sk89q.worldguard.protection.flags

### Class: com.sk89q.worldguard.protection.flags.BooleanFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- Boolean parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- Boolean unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(Boolean)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.CommandStringFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- String parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- String unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(String)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.DoubleFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.NumberFlag

Methods:
- Double parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- Double unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(Double)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.EntityTypeFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- EntityType parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- EntityType unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(EntityType)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.EnumFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- Enum parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- Enum detectValue(String)
- Enum unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(Enum)
- Object marshal(Object)
- Class getEnumClass()

### Class: com.sk89q.worldguard.protection.flags.Flag
Type: Abstract Class

Methods:
- **static** boolean isValidName(String)
- Object parseInput(FlagContext) throws InvalidFlagFormat
- String getName()
- Object unmarshal(Object)
- Object marshal(Object)
- boolean requiresSubject()
- String toString()
- RegionGroupFlag getRegionGroupFlag()
- Object getDefault()
- boolean implicitlySetWithMembership()
- boolean usesMembershipAsDefault()
- boolean hasConflictStrategy()
- Object chooseValue(Collection)

### Class: com.sk89q.worldguard.protection.flags.FlagContext
Type: Class

Methods:
- FlagContext copyWith(Actor, String, Map)
- Double getUserInputAsDouble() throws InvalidFlagFormat
- Object get(String)
- Object get(String, Object)
- LocalPlayer getPlayerSender() throws InvalidFlagFormat
- String getUserInput()
- **static** FlagContext$FlagContextBuilder create()
- Integer getUserInputAsInt() throws InvalidFlagFormat
- Actor getSender()
- void put(String, Object)

### Class: com.sk89q.worldguard.protection.flags.FlagContext$FlagContextBuilder
Type: Class

Methods:
- FlagContext build()
- boolean tryAddToMap(String, Object)
- FlagContext$FlagContextBuilder setSender(Actor)
- FlagContext$FlagContextBuilder setObject(String, Object)
- FlagContext$FlagContextBuilder setInput(String)

### Class: com.sk89q.worldguard.protection.flags.FlagUtil
Type: Class

Methods:
- **static** Map marshal(Map)

### Class: com.sk89q.worldguard.protection.flags.Flags
Type: Class

Methods:
- **static** void registerAll()
- **static** Flag fuzzyMatchFlag(FlagRegistry, String)

### Class: com.sk89q.worldguard.protection.flags.GameModeTypeFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- GameMode parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- GameMode unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(GameMode)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.IntegerFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.NumberFlag

Methods:
- Integer parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- Integer unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(Integer)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.InvalidFlagFormat
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.sk89q.worldguard.protection.flags.LocationFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- Location parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- Location unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(Location)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.MapFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- Map parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- Map unmarshal(Object)
- Object unmarshal(Object)
- Flag getValueFlag()
- Object marshal(Map)
- Object marshal(Object)
- Flag getKeyFlag()

### Class: com.sk89q.worldguard.protection.flags.NumberFlag
Type: Abstract Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- void setSuggestedValues(Number[])
- Number[] getSuggestedValues()

### Class: com.sk89q.worldguard.protection.flags.RegionGroup
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean contains(Association)
- **static** RegionGroup valueOf(String)
- **static** RegionGroup[] values()

### Class: com.sk89q.worldguard.protection.flags.RegionGroupFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.EnumFlag

Methods:
- RegionGroup detectValue(String)
- Enum detectValue(String)
- RegionGroup getDefault()
- Object getDefault()
- **static** boolean isMember(ProtectedRegion, RegionGroup, LocalPlayer)
- **static** boolean isMember(ApplicableRegionSet, RegionGroup, LocalPlayer)

### Class: com.sk89q.worldguard.protection.flags.RegistryFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- Keyed parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- Keyed unmarshal(Object)
- Object unmarshal(Object)
- Registry getRegistry()
- Object marshal(Keyed)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.SetFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- Set parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- Set unmarshal(Object)
- Object unmarshal(Object)
- Flag getType()
- Object marshal(Set)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.StateFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- **static** StateFlag$State allowOrNone(boolean)
- StateFlag$State parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- **static** StateFlag$State denyToNone(StateFlag$State)
- **static** boolean test(StateFlag$State[])
- StateFlag$State unmarshal(Object)
- Object unmarshal(Object)
- boolean preventsAllowOnGlobal()
- Object marshal(StateFlag$State)
- Object marshal(Object)
- StateFlag$State getDefault()
- Object getDefault()
- **static** StateFlag$State combine(StateFlag$State[])
- **static** StateFlag$State combine(Collection)
- StateFlag$State chooseValue(Collection)
- Object chooseValue(Collection)
- boolean hasConflictStrategy()

### Class: com.sk89q.worldguard.protection.flags.StateFlag$State
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** StateFlag$State valueOf(String)
- **static** StateFlag$State[] values()

### Class: com.sk89q.worldguard.protection.flags.StringFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- String parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- String unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(String)
- Object marshal(Object)
- String getDefault()
- Object getDefault()

### Class: com.sk89q.worldguard.protection.flags.TimestampFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- Instant parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- Instant unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(Instant)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.UUIDFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- UUID parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- UUID unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(UUID)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.VectorFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- Vector3 parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- Vector3 unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(Vector3)
- Object marshal(Object)

### Class: com.sk89q.worldguard.protection.flags.WeatherTypeFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- WeatherType parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- WeatherType unmarshal(Object)
- Object unmarshal(Object)
- Object marshal(WeatherType)
- Object marshal(Object)

## Package: com.sk89q.worldguard.protection.flags.registry

### Class: com.sk89q.worldguard.protection.flags.registry.FlagRegistry
Type: Interface
Implements: java.lang.Iterable

Methods:
- List getAll()
- int size()
- Map unmarshal(Map, boolean)
- void registerAll(Collection)
- Flag get(String)
- void register(Flag) throws FlagConflictException

### Class: com.sk89q.worldguard.protection.flags.registry.FlagConflictException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: com.sk89q.worldguard.protection.flags.registry.SimpleFlagRegistry
Type: Class
Implements: com.sk89q.worldguard.protection.flags.registry.FlagRegistry

Methods:
- Iterator iterator()
- List getAll()
- int size()
- Map unmarshal(Map, boolean)
- void registerAll(Collection)
- Flag get(String)
- boolean isInitialized()
- void setInitialized(boolean)
- void register(Flag) throws FlagConflictException

### Class: com.sk89q.worldguard.protection.flags.registry.UnknownFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.Flag

Methods:
- Object parseInput(FlagContext) throws InvalidFlagFormat
- Object unmarshal(Object)
- Object marshal(Object)

## Package: com.sk89q.worldguard.protection.managers

### Class: com.sk89q.worldguard.protection.managers.RegionContainerImpl
Type: Class

Methods:
- RegionManager load(String)
- List getLoaded()
- RegionManager get(String)
- void unload(String)
- Set getSaveFailures()
- void unloadAll()
- RegionDriver getDriver()
- void shutdown()

### Class: com.sk89q.worldguard.protection.managers.RegionDifference
Type: Class

Methods:
- void addAll(RegionDifference)
- Set getChanged()
- Set getRemoved()
- boolean containsChanges()

### Class: com.sk89q.worldguard.protection.managers.RegionManager
Type: Class

Methods:
- int getRegionCountOfPlayer(LocalPlayer)
- Map getRegions()
- List getApplicableRegionsIDs(BlockVector3)
- void loadChunks(Collection)
- String getName()
- void loadChunk(BlockVector2)
- ProtectedRegion matchRegion(String)
- void setRegions(Map)
- void setRegions(Collection)
- void save() throws StorageException
- void addRegion(ProtectedRegion)
- Set removeRegion(String)
- Set removeRegion(String, RemovalStrategy)
- boolean saveChanges() throws StorageException
- boolean overlapsUnownedRegion(ProtectedRegion, LocalPlayer)
- int size()
- void load() throws StorageException
- ProtectedRegion getRegion(String)
- boolean hasRegion(String)
- ApplicableRegionSet getApplicableRegions(BlockVector3)
- ApplicableRegionSet getApplicableRegions(BlockVector3, RegionQuery$QueryOption)
- ApplicableRegionSet getApplicableRegions(ProtectedRegion)
- ApplicableRegionSet getApplicableRegions(ProtectedRegion, RegionQuery$QueryOption)
- void unloadChunk(BlockVector2)

### Class: com.sk89q.worldguard.protection.managers.RemovalStrategy
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** RemovalStrategy valueOf(String)
- **static** RemovalStrategy[] values()

## Package: com.sk89q.worldguard.protection.managers.index

### Class: com.sk89q.worldguard.protection.managers.index.ConcurrentRegionIndex
Type: Interface
Implements: com.sk89q.worldguard.protection.managers.index.RegionIndex

No public methods found

### Class: com.sk89q.worldguard.protection.managers.index.RegionIndex
Type: Interface
Implements: com.sk89q.worldguard.util.ChangeTracked

Methods:
- void add(ProtectedRegion)
- RegionDifference getAndClearDifference()
- void forgetAll()
- void applyIntersecting(ProtectedRegion, Predicate)
- void apply(Predicate)
- Collection values()
- void setDirty(RegionDifference)
- Set remove(String, RemovalStrategy)
- boolean contains(String)
- void forget(BlockVector2)
- void biasAll(Collection)
- int size()
- void addAll(Collection)
- ProtectedRegion get(String)
- void bias(BlockVector2)
- void applyContaining(BlockVector3, Predicate)

### Class: com.sk89q.worldguard.protection.managers.index.ChunkHashTable
Type: Class
Implements: com.sk89q.worldguard.protection.managers.index.ConcurrentRegionIndex

Methods:
- void add(ProtectedRegion)
- RegionDifference getAndClearDifference()
- void forgetAll()
- void applyIntersecting(ProtectedRegion, Predicate)
- void apply(Predicate)
- Collection values()
- void setDirty(RegionDifference)
- void setDirty(boolean)
- Set remove(String, RemovalStrategy)
- boolean contains(String)
- void forget(BlockVector2)
- boolean isDirty()
- void biasAll(Collection)
- int size()
- void addAll(Collection)
- ProtectedRegion get(String)
- void bias(BlockVector2)
- boolean awaitCompletion(long, TimeUnit) throws InterruptedException
- void applyContaining(BlockVector3, Predicate)

### Class: com.sk89q.worldguard.protection.managers.index.ChunkHashTable$Factory
Type: Class
Implements: java.util.function.Function

Methods:
- ChunkHashTable apply(String)
- Object apply(Object)

### Class: com.sk89q.worldguard.protection.managers.index.HashMapIndex
Type: Class
Extends: com.sk89q.worldguard.protection.managers.index.AbstractRegionIndex
Implements: com.sk89q.worldguard.protection.managers.index.ConcurrentRegionIndex

Methods:
- void add(ProtectedRegion)
- RegionDifference getAndClearDifference()
- void forgetAll()
- void applyIntersecting(ProtectedRegion, Predicate)
- void apply(Predicate)
- Collection values()
- void setDirty(RegionDifference)
- void setDirty(boolean)
- Set remove(String, RemovalStrategy)
- boolean contains(String)
- void forget(BlockVector2)
- boolean isDirty()
- void biasAll(Collection)
- int size()
- void addAll(Collection)
- ProtectedRegion get(String)
- void bias(BlockVector2)
- void applyContaining(BlockVector3, Predicate)

### Class: com.sk89q.worldguard.protection.managers.index.HashMapIndex$Factory
Type: Class
Implements: java.util.function.Function

Methods:
- HashMapIndex apply(String)
- Object apply(Object)

### Class: com.sk89q.worldguard.protection.managers.index.PriorityRTreeIndex
Type: Class
Extends: com.sk89q.worldguard.protection.managers.index.HashMapIndex

Methods:
- void applyIntersecting(ProtectedRegion, Predicate)
- void applyContaining(BlockVector3, Predicate)

### Class: com.sk89q.worldguard.protection.managers.index.PriorityRTreeIndex$Factory
Type: Class
Implements: java.util.function.Function

Methods:
- PriorityRTreeIndex apply(String)
- Object apply(Object)

## Package: com.sk89q.worldguard.protection.managers.migration

### Class: com.sk89q.worldguard.protection.managers.migration.Migration
Type: Interface

Methods:
- void migrate() throws MigrationException

### Class: com.sk89q.worldguard.protection.managers.migration.DriverMigration
Type: Class
Extends: com.sk89q.worldguard.protection.managers.migration.AbstractMigration

No public methods found

### Class: com.sk89q.worldguard.protection.managers.migration.MigrationException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.sk89q.worldguard.protection.managers.migration.UUIDMigration
Type: Class
Extends: com.sk89q.worldguard.protection.managers.migration.AbstractMigration

Methods:
- void setKeepUnresolvedNames(boolean)
- boolean getKeepUnresolvedNames()

### Class: com.sk89q.worldguard.protection.managers.migration.WorldHeightMigration
Type: Class
Extends: com.sk89q.worldguard.protection.managers.migration.AbstractMigration

No public methods found

## Package: com.sk89q.worldguard.protection.managers.storage

### Class: com.sk89q.worldguard.protection.managers.storage.RegionDatabase
Type: Interface

Methods:
- void saveChanges(RegionDifference) throws DifferenceSaveException, StorageException
- String getName()
- void saveAll(Set) throws StorageException
- Set loadAll(FlagRegistry) throws StorageException

### Class: com.sk89q.worldguard.protection.managers.storage.RegionDriver
Type: Interface

Methods:
- List getAll() throws StorageException
- RegionDatabase get(String)

### Class: com.sk89q.worldguard.protection.managers.storage.DifferenceSaveException
Type: Class
Extends: com.sk89q.worldguard.protection.managers.storage.StorageException

No public methods found

### Class: com.sk89q.worldguard.protection.managers.storage.DriverType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DriverType valueOf(String)
- **static** DriverType[] values()

### Class: com.sk89q.worldguard.protection.managers.storage.MemoryRegionDatabase
Type: Class
Implements: com.sk89q.worldguard.protection.managers.storage.RegionDatabase

Methods:
- void saveChanges(RegionDifference) throws DifferenceSaveException
- String getName()
- void saveAll(Set)
- Set loadAll(FlagRegistry)

### Class: com.sk89q.worldguard.protection.managers.storage.RegionDatabaseUtils
Type: Class

Methods:
- **static** void relinkParents(Map, Map)

### Class: com.sk89q.worldguard.protection.managers.storage.StorageException
Type: Class
Extends: java.lang.Exception

No public methods found

## Package: com.sk89q.worldguard.protection.managers.storage.file

### Class: com.sk89q.worldguard.protection.managers.storage.file.DirectoryYamlDriver
Type: Class
Implements: com.sk89q.worldguard.protection.managers.storage.RegionDriver

Methods:
- List getAll() throws StorageException
- RegionDatabase get(String)

### Class: com.sk89q.worldguard.protection.managers.storage.file.YamlRegionFile
Type: Class
Implements: com.sk89q.worldguard.protection.managers.storage.RegionDatabase

Methods:
- void saveChanges(RegionDifference) throws DifferenceSaveException
- String getName()
- void saveAll(Set) throws StorageException
- Set loadAll(FlagRegistry) throws StorageException

## Package: com.sk89q.worldguard.protection.managers.storage.sql

### Class: com.sk89q.worldguard.protection.managers.storage.sql.SQLDriver
Type: Class
Implements: com.sk89q.worldguard.protection.managers.storage.RegionDriver

Methods:
- List getAll() throws StorageException
- RegionDatabase get(String)
- String getMigrationFolderName()

## Package: com.sk89q.worldguard.protection.regions

### Class: com.sk89q.worldguard.protection.regions.GlobalProtectedRegion
Type: Class
Extends: com.sk89q.worldguard.protection.regions.ProtectedRegion

Methods:
- int volume()
- boolean isPhysicalArea()
- boolean contains(BlockVector3)
- RegionType getType()
- List getPoints()
- List getIntersectingRegions(Collection)

### Class: com.sk89q.worldguard.protection.regions.ProtectedCuboidRegion
Type: Class
Extends: com.sk89q.worldguard.protection.regions.ProtectedRegion

Methods:
- int volume()
- boolean isPhysicalArea()
- boolean contains(BlockVector3)
- RegionType getType()
- void setMinimumPoint(BlockVector3)
- void setMaximumPoint(BlockVector3)
- List getPoints()

### Class: com.sk89q.worldguard.protection.regions.ProtectedPolygonalRegion
Type: Class
Extends: com.sk89q.worldguard.protection.regions.ProtectedRegion

Methods:
- int volume()
- boolean isPhysicalArea()
- boolean contains(BlockVector3)
- RegionType getType()
- List getPoints()

### Class: com.sk89q.worldguard.protection.regions.ProtectedRegion
Type: Abstract Class
Implements: com.sk89q.worldguard.util.ChangeTracked, java.lang.Comparable

Methods:
- void clearParent()
- boolean isMemberOnly(LocalPlayer)
- String getId()
- int compareTo(ProtectedRegion)
- int compareTo(Object)
- boolean isMember(LocalPlayer)
- boolean isMember(String)
- void setDirty(boolean)
- boolean isDirty()
- boolean hasMembersOrOwners()
- **static** boolean isValidId(String)
- void setOwners(DefaultDomain)
- boolean isOwner(LocalPlayer)
- boolean isOwner(String)
- int hashCode()
- DefaultDomain getOwners()
- List getPoints()
- void setMembers(DefaultDomain)
- void setParent(ProtectedRegion) throws ProtectedRegion$CircularInheritanceException
- Object getFlag(Flag)
- List getIntersectingRegions(Collection)
- BlockVector3 getMinimumPoint()
- boolean isPhysicalArea()
- ProtectedRegion getParent()
- void setFlag(Flag, Object)
- boolean containsAny(List)
- void copyFrom(ProtectedRegion)
- int volume()
- boolean contains(BlockVector3)
- boolean contains(BlockVector2)
- boolean contains(int, int, int)
- RegionType getType()
- BlockVector3 getMaximumPoint()
- int getPriority()
- String toString()
- boolean isTransient()
- Map getFlags()
- void setPriority(int)
- void setFlags(Map)
- DefaultDomain getMembers()

### Class: com.sk89q.worldguard.protection.regions.ProtectedRegion$CircularInheritanceException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.sk89q.worldguard.protection.regions.ProtectedRegionMBRConverter
Type: Class
Implements: org.khelekore.prtree.MBRConverter

Methods:
- int getDimensions()
- double getMin(int, ProtectedRegion)
- double getMin(int, Object)
- double getMax(int, ProtectedRegion)
- double getMax(int, Object)

### Class: com.sk89q.worldguard.protection.regions.QueryCache
Type: Class

Methods:
- ApplicableRegionSet queryContains(RegionManager, Location, RegionQuery$QueryOption)
- void invalidateAll()

### Class: com.sk89q.worldguard.protection.regions.RegionContainer
Type: Abstract Class

Methods:
- RegionQuery createQuery()
- void reload()
- List getLoaded()
- RegionManager get(World)
- void unload()
- void unload(World)
- Set getSaveFailures()
- void initialize()
- RegionDriver getDriver()
- void migrate(Migration) throws MigrationException

### Class: com.sk89q.worldguard.protection.regions.RegionQuery
Type: Class

Methods:
- Object queryMapValue(Location, RegionAssociable, MapFlag, Object)
- Object queryMapValue(Location, RegionAssociable, MapFlag, Object, Flag)
- boolean testState(Location, LocalPlayer, StateFlag[])
- boolean testState(Location, RegionAssociable, StateFlag[])
- ApplicableRegionSet getApplicableRegions(Location)
- ApplicableRegionSet getApplicableRegions(Location, RegionQuery$QueryOption)
- StateFlag$State queryState(Location, LocalPlayer, StateFlag[])
- StateFlag$State queryState(Location, RegionAssociable, StateFlag[])
- Object queryValue(Location, LocalPlayer, Flag)
- Object queryValue(Location, RegionAssociable, Flag)
- boolean testBuild(Location, LocalPlayer, StateFlag[])
- boolean testBuild(Location, RegionAssociable, StateFlag[])
- boolean testBuild(Location, RegionAssociable, MapFlag, Object, StateFlag, StateFlag[])
- Collection queryAllValues(Location, LocalPlayer, Flag)
- Collection queryAllValues(Location, RegionAssociable, Flag)

### Class: com.sk89q.worldguard.protection.regions.RegionQuery$QueryOption
Type: Enum
Extends: java.lang.Enum

Methods:
- List constructResult(Set)
- RegionCollectionConsumer createIndexConsumer(Collection)
- **static** RegionQuery$QueryOption valueOf(String)
- **static** RegionQuery$QueryOption[] values()

### Class: com.sk89q.worldguard.protection.regions.RegionType
Type: Enum
Extends: java.lang.Enum

Methods:
- String getName()
- **static** RegionType valueOf(String)
- **static** RegionType[] values()

## Package: com.sk89q.worldguard.protection.util

### Class: com.sk89q.worldguard.protection.util.DomainInputResolver
Type: Class
Implements: java.util.concurrent.Callable

Methods:
- DefaultDomain call() throws UnresolvedNamesException
- Object call() throws Exception
- void setLocatorPolicy(DomainInputResolver$UserLocatorPolicy)
- **static** UUID parseUUID(String)
- Function createAddAllFunction(DefaultDomain)
- DomainInputResolver$UserLocatorPolicy getLocatorPolicy()
- Function createRemoveAllFunction(DefaultDomain)

### Class: com.sk89q.worldguard.protection.util.DomainInputResolver$UserLocatorPolicy
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DomainInputResolver$UserLocatorPolicy valueOf(String)
- **static** DomainInputResolver$UserLocatorPolicy[] values()

### Class: com.sk89q.worldguard.protection.util.NormativeOrders
Type: Class

Methods:
- **static** List fromSet(Set)
- **static** void sort(List)

### Class: com.sk89q.worldguard.protection.util.RegionCollectionConsumer
Type: Class
Implements: com.google.common.base.Predicate

Methods:
- boolean apply(ProtectedRegion)
- boolean apply(Object)

### Class: com.sk89q.worldguard.protection.util.UnresolvedNamesException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.sk89q.worldguard.protection.util.WorldEditRegionConverter
Type: Class

Methods:
- **static** Region convertToRegion(ProtectedRegion)
- **static** RegionSelector convertToSelector(ProtectedRegion)

## Package: com.sk89q.worldguard.session

### Class: com.sk89q.worldguard.session.SessionManager
Type: Interface

Methods:
- boolean registerHandler(Handler$Factory, Handler$Factory)
- boolean customHandlersRegistered()
- void resetAllStates()
- Session get(LocalPlayer)
- void resetState(LocalPlayer)
- boolean unregisterHandler(Handler$Factory)
- boolean hasBypass(LocalPlayer, World)
- Session createSession(LocalPlayer)
- Session getIfPresent(LocalPlayer)

### Class: com.sk89q.worldguard.session.AbstractSessionManager
Type: Abstract Class
Implements: com.sk89q.worldguard.session.SessionManager

Methods:
- boolean registerHandler(Handler$Factory, Handler$Factory)
- boolean customHandlersRegistered()
- Session get(LocalPlayer)
- void resetState(LocalPlayer)
- boolean unregisterHandler(Handler$Factory)
- boolean hasBypass(LocalPlayer, World)
- Session createSession(LocalPlayer)
- Session getIfPresent(LocalPlayer)

### Class: com.sk89q.worldguard.session.AbstractSessionManager$CacheKey
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)

### Class: com.sk89q.worldguard.session.MoveType
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean isTeleport()
- **static** MoveType valueOf(String)
- boolean isCancellable()
- **static** MoveType[] values()

### Class: com.sk89q.worldguard.session.Session
Type: Class

Methods:
- SessionManager getManager()
- Location testMoveTo(LocalPlayer, Location, MoveType)
- Location testMoveTo(LocalPlayer, Location, MoveType, boolean)
- void resetState(LocalPlayer)
- void uninitialize(LocalPlayer)
- void setBypassDisabled(boolean)
- void tick(LocalPlayer)
- void initialize(LocalPlayer)
- Handler getHandler(Class)
- boolean isInvincible(LocalPlayer)
- boolean hasBypassDisabled()
- void register(Handler)

### Class: com.sk89q.worldguard.session.WorldPlayerTuple
Type: Class

Methods:
- World getWorld()
- LocalPlayer getPlayer()
- int hashCode()
- boolean equals(Object)

## Package: com.sk89q.worldguard.session.handler

### Class: com.sk89q.worldguard.session.handler.EntryFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- boolean onCrossBoundary(LocalPlayer, Location, Location, ApplicableRegionSet, Set, Set, MoveType)

### Class: com.sk89q.worldguard.session.handler.EntryFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- EntryFlag create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.ExitFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

No public methods found

### Class: com.sk89q.worldguard.session.handler.ExitFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- ExitFlag create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.FarewellFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- boolean onCrossBoundary(LocalPlayer, Location, Location, ApplicableRegionSet, Set, Set, MoveType)
- void initialize(LocalPlayer, Location, ApplicableRegionSet)

### Class: com.sk89q.worldguard.session.handler.FarewellFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- FarewellFlag create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.FeedFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- void tick(LocalPlayer, ApplicableRegionSet)

### Class: com.sk89q.worldguard.session.handler.FeedFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- FeedFlag create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.FlagValueChangeHandler
Type: Abstract Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- void uninitialize(LocalPlayer, Location, ApplicableRegionSet)
- boolean onCrossBoundary(LocalPlayer, Location, Location, ApplicableRegionSet, Set, Set, MoveType)
- void initialize(LocalPlayer, Location, ApplicableRegionSet)

### Class: com.sk89q.worldguard.session.handler.GameModeFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

Methods:
- GameMode getSetGameMode()
- GameMode getOriginalGameMode()

### Class: com.sk89q.worldguard.session.handler.GameModeFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- GameModeFlag create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.GodMode
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- boolean hasGodMode(LocalPlayer)
- **static** boolean set(LocalPlayer, Session, boolean)
- StateFlag$State getInvincibility(LocalPlayer)
- void setGodMode(LocalPlayer, boolean)

### Class: com.sk89q.worldguard.session.handler.GodMode$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- GodMode create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.GreetingFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- boolean onCrossBoundary(LocalPlayer, Location, Location, ApplicableRegionSet, Set, Set, MoveType)

### Class: com.sk89q.worldguard.session.handler.GreetingFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- GreetingFlag create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.Handler
Type: Abstract Class

Methods:
- StateFlag$State getInvincibility(LocalPlayer)
- boolean testMoveTo(LocalPlayer, Location, Location, ApplicableRegionSet, MoveType)
- void uninitialize(LocalPlayer, Location, ApplicableRegionSet)
- void tick(LocalPlayer, ApplicableRegionSet)
- boolean onCrossBoundary(LocalPlayer, Location, Location, ApplicableRegionSet, Set, Set, MoveType)
- void initialize(LocalPlayer, Location, ApplicableRegionSet)
- Session getSession()

### Class: com.sk89q.worldguard.session.handler.Handler$Factory
Type: Abstract Class

Methods:
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.HealFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- void tick(LocalPlayer, ApplicableRegionSet)

### Class: com.sk89q.worldguard.session.handler.HealFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- HealFlag create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.InvincibilityFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

Methods:
- StateFlag$State getInvincibility(LocalPlayer)

### Class: com.sk89q.worldguard.session.handler.InvincibilityFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- InvincibilityFlag create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.NotifyEntryFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

No public methods found

### Class: com.sk89q.worldguard.session.handler.NotifyEntryFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- NotifyEntryFlag create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.NotifyExitFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

No public methods found

### Class: com.sk89q.worldguard.session.handler.NotifyExitFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- NotifyExitFlag create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.TimeLockFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

No public methods found

### Class: com.sk89q.worldguard.session.handler.TimeLockFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- TimeLockFlag create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.WaterBreathing
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- boolean hasWaterBreathing()
- **static** boolean set(LocalPlayer, Session, boolean)
- void setWaterBreathing(boolean)

### Class: com.sk89q.worldguard.session.handler.WaterBreathing$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- WaterBreathing create(Session)
- Handler create(Session)

### Class: com.sk89q.worldguard.session.handler.WeatherLockFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

No public methods found

### Class: com.sk89q.worldguard.session.handler.WeatherLockFlag$Factory
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler$Factory

Methods:
- WeatherLockFlag create(Session)
- Handler create(Session)

## Package: com.sk89q.worldguard.util

### Class: com.sk89q.worldguard.util.ChangeTracked
Type: Interface

Methods:
- boolean isDirty()
- void setDirty(boolean)

### Class: com.sk89q.worldguard.util.Entities
Type: Class

Methods:
- **static** boolean isIntensiveEntity(Entity)

### Class: com.sk89q.worldguard.util.Enums
Type: Class

Methods:
- **static** Enum findFuzzyByValue(Class, String[])
- **static** Enum findByValue(Class, String[])

### Class: com.sk89q.worldguard.util.Locations
Type: Class

Methods:
- **static** boolean isDifferentBlock(Location, Location)

### Class: com.sk89q.worldguard.util.MathUtils
Type: Class

Methods:
- **static** long checkedMultiply(long, long)

### Class: com.sk89q.worldguard.util.MessagingUtil
Type: Class

Methods:
- **static** void sendStringToChat(LocalPlayer, String)
- **static** void sendStringToTitle(LocalPlayer, String)

### Class: com.sk89q.worldguard.util.Normal
Type: Class

Methods:
- String getNormal()
- **static** Normal normal(String)
- String getName()
- int hashCode()
- boolean equals(Object)
- **static** String normalize(String)
- String toString()

### Class: com.sk89q.worldguard.util.SpongeUtil
Type: Class

Methods:
- **static** void clearSpongeWater(World, int, int, int)
- **static** void addSpongeWater(World, int, int, int)

### Class: com.sk89q.worldguard.util.WorldGuardExceptionConverter
Type: Class
Extends: com.sk89q.worldedit.internal.command.exception.ExceptionConverterHelper

Methods:
- void convert(NumberFormatException) throws CommandException
- void convert(InvalidComponentException) throws CommandException
- void convert(StorageException) throws CommandException
- void convert(RejectedExecutionException) throws CommandException
- void convert(CancellationException) throws CommandException
- void convert(InterruptedException) throws CommandException
- void convert(WorldEditException) throws CommandException
- void convert(UnresolvedNamesException) throws CommandException
- void convert(AuthorizationException) throws CommandException

## Package: com.sk89q.worldguard.util.collect

### Class: com.sk89q.worldguard.util.collect.EntryBase
Type: Class

No public methods found

### Class: com.sk89q.worldguard.util.collect.LongBaseHashTable
Type: Class
Extends: com.sk89q.worldguard.util.collect.LongHash

Methods:
- ArrayList entries()
- boolean containsKey(long)
- EntryBase getEntry(int, int)
- EntryBase getEntry(long)
- void remove(long)
- void put(int, int, EntryBase)
- void put(EntryBase)

### Class: com.sk89q.worldguard.util.collect.LongHash
Type: Abstract Class

Methods:
- **static** int msw(long)
- **static** int lsw(long)
- **static** long toLong(int, int)
- boolean containsKey(int, int)
- boolean containsKey(long)
- void remove(int, int)
- void remove(long)

### Class: com.sk89q.worldguard.util.collect.LongHashSet
Type: Class
Extends: com.sk89q.worldguard.util.collect.LongHash

Methods:
- void add(int, int)
- void add(long)
- int size()
- long[] keys()
- boolean containsKey(long)
- boolean isEmpty()
- long[] popAll()
- long popFirst()
- void remove(long)

### Class: com.sk89q.worldguard.util.collect.LongHashTable
Type: Class
Extends: com.sk89q.worldguard.util.collect.LongBaseHashTable

Methods:
- ArrayList values()
- Object get(int, int)
- Object get(long)
- void put(int, int, Object)
- void put(long, Object)

## Package: com.sk89q.worldguard.util.command

### Class: com.sk89q.worldguard.util.command.CommandFilter
Type: Class
Implements: com.google.common.base.Predicate

Methods:
- boolean apply(String)
- boolean apply(Object)

### Class: com.sk89q.worldguard.util.command.CommandFilter$Builder
Type: Class

Methods:
- CommandFilter$Builder deny(String[])
- CommandFilter build()
- CommandFilter$Builder permit(String[])

## Package: com.sk89q.worldguard.util.concurrent

### Class: com.sk89q.worldguard.util.concurrent.EvenMoreExecutors
Type: Class

Methods:
- **static** ExecutorService newBoundedCachedThreadPool(int, int, int)
- **static** ExecutorService newBoundedCachedThreadPool(int, int, int, String)

## Package: com.sk89q.worldguard.util.formatting.component

### Class: com.sk89q.worldguard.util.formatting.component.BlacklistNotify
Type: Class
Extends: com.sk89q.worldguard.util.formatting.component.Notify

No public methods found

### Class: com.sk89q.worldguard.util.formatting.component.Notify
Type: Class
Extends: com.sk89q.worldedit.util.formatting.component.TextComponentProducer

No public methods found

## Package: com.sk89q.worldguard.util.io

### Class: com.sk89q.worldguard.util.io.Closer
Type: Class
Implements: java.io.Closeable

Methods:
- RuntimeException rethrow(Throwable) throws IOException
- RuntimeException rethrow(Throwable, Class) throws IOException, Exception
- RuntimeException rethrow(Throwable, Class, Class) throws IOException, Exception, Exception
- **static** Closer create()
- void closeQuietly()
- void close() throws IOException
- Closeable register(Closeable)
- Connection register(Connection)
- Statement register(Statement)
- ResultSet register(ResultSet)

## Package: com.sk89q.worldguard.util.logging

### Class: com.sk89q.worldguard.util.logging.LoggerToChatHandler
Type: Class
Extends: java.util.logging.Handler

Methods:
- void flush()
- void publish(LogRecord)
- void close()

### Class: com.sk89q.worldguard.util.logging.RecordMessagePrefixer
Type: Class
Extends: java.util.logging.Handler

Methods:
- void flush()
- void publish(LogRecord)
- void close() throws SecurityException
- **static** void register(Logger, String)

## Package: com.sk89q.worldguard.util.profiler

### Class: com.sk89q.worldguard.util.profiler.SamplerBuilder
Type: Class

Methods:
- int getInterval()
- long getRunTime(TimeUnit)
- void setThreadFilter(Predicate)
- Predicate getThreadFilter()
- void setInterval(int)
- void setRunTime(long, TimeUnit)
- SamplerBuilder$Sampler start()

### Class: com.sk89q.worldguard.util.profiler.SamplerBuilder$Sampler
Type: Class
Extends: java.util.TimerTask

Methods:
- boolean cancel()
- ListenableFuture getFuture()
- String toString()
- void run()

### Class: com.sk89q.worldguard.util.profiler.StackNode
Type: Class
Implements: java.lang.Comparable

Methods:
- Collection getChildren()
- String getName()
- void log(long)
- void log(StackTraceElement[], long)
- StackNode getChild(String)
- StackNode getChild(String, String)
- String toString()
- int compareTo(StackNode)
- int compareTo(Object)
- long getTotalTime()

### Class: com.sk89q.worldguard.util.profiler.StackTraceNode
Type: Class
Extends: com.sk89q.worldguard.util.profiler.StackNode

Methods:
- String getMethodName()
- int compareTo(StackNode)
- int compareTo(Object)
- String getClassName()

### Class: com.sk89q.worldguard.util.profiler.ThreadIdFilter
Type: Class
Implements: java.util.function.Predicate

Methods:
- boolean test(ThreadInfo)
- boolean test(Object)

### Class: com.sk89q.worldguard.util.profiler.ThreadNameFilter
Type: Class
Implements: java.util.function.Predicate

Methods:
- boolean test(ThreadInfo)
- boolean test(Object)

## Package: com.sk89q.worldguard.util.report

### Class: com.sk89q.worldguard.util.report.ApplicableRegionsReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

### Class: com.sk89q.worldguard.util.report.ConfigReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

### Class: com.sk89q.worldguard.util.report.RegionReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

## Package: com.sk89q.worldguard.util.sql

### Class: com.sk89q.worldguard.util.sql.DataSourceConfig
Type: Class

Methods:
- Connection getConnection() throws SQLException
- DataSourceConfig setPassword(String)
- String getTablePrefix()
- String getDsn()
- String getPassword()
- DataSourceConfig setUsername(String)
- DataSourceConfig setTablePrefix(String)
- DataSourceConfig setDsn(String)
- String getUsername()

