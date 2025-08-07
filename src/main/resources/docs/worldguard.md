# worldguard-bukkit-7.0.14-dist API Reference

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
- String getVersion()
- LocalPlayer checkPlayer(Actor) throws CommandException
- ProfileService getProfileService()
- ListeningExecutorService getExecutorService()
- void setPlatform(WorldGuardPlatform)
- void disable()
- FlagRegistry getFlagRegistry()
- Supervisor getSupervisor()
- void setup()
- WorldGuard getInstance()
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

## Package: com.sk89q.worldguard.blacklist.action

### Class: com.sk89q.worldguard.blacklist.action.Action
Type: Interface

Methods:
- ActionResult apply(BlacklistEvent, boolean, boolean, boolean)

### Class: com.sk89q.worldguard.blacklist.action.ActionResult
Type: Enum
Extends: java.lang.Enum

Methods:
- ActionResult valueOf(String)
- ActionResult[] values()

### Class: com.sk89q.worldguard.blacklist.action.ActionType
Type: Enum
Extends: java.lang.Enum

Methods:
- Action parseInput(Blacklist, BlacklistEntry)
- ActionType valueOf(String)
- ActionType[] values()
- String getActionName()

### Class: com.sk89q.worldguard.blacklist.action.AllowAction
Type: Class
Implements: com.sk89q.worldguard.blacklist.action.Action

Methods:
- ActionResult apply(BlacklistEvent, boolean, boolean, boolean)
- AllowAction getInstance()

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
- DenyAction getInstance()

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
- EventType valueOf(String)
- EventType[] values()
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

## Package: com.sk89q.worldguard.bukkit

### Class: com.sk89q.worldguard.bukkit.BukkitConfigurationManager
Type: Class
Extends: com.sk89q.worldguard.config.YamlConfigurationManager

Methods:
- void copyDefaults()
- void load()
- void updateCommandBookGodMode()
- BukkitWorldConfiguration get(World)
- BukkitWorldConfiguration get(String)
- WorldConfiguration get(World)
- Collection getWorldConfigs()
- void unload()
- File getDataFolder()
- void postLoad()
- boolean hasCommandBookGodMode()

### Class: com.sk89q.worldguard.bukkit.BukkitDebugHandler
Type: Class
Implements: com.sk89q.worldguard.internal.platform.DebugHandler

Methods:
- void testBreak(Actor, LocalPlayer, boolean, boolean) throws CommandException
- void testPlace(Actor, LocalPlayer, boolean, boolean) throws CommandException
- void testDamage(Actor, LocalPlayer, boolean, boolean) throws CommandException
- void testInteract(Actor, LocalPlayer, boolean, boolean) throws CommandException

### Class: com.sk89q.worldguard.bukkit.BukkitPlayer
Type: Class
Extends: com.sk89q.worldedit.bukkit.BukkitPlayer
Implements: com.sk89q.worldguard.LocalPlayer

Methods:
- void printRaw(String)
- void setPlayerTime(long, boolean)
- double getMaxHealth()
- String getName()
- void teleport(Location, String, String)
- void sendTitle(String, String)
- double getSaturation()
- void setCompassTarget(Location)
- void ban(String)
- void setFireTicks(int)
- void setPlayerWeather(WeatherType)
- int getFireTicks()
- boolean hasGroup(String)
- String[] getGroups()
- double getHealth()
- void setHealth(double)
- float getExhaustion()
- long getPlayerTimeOffset()
- boolean isPlayerTimeRelative()
- WeatherType getPlayerWeather()
- void kick(String)
- boolean hasPermission(String)
- void resetPlayerWeather()
- void setFoodLevel(double)
- void resetPlayerTime()
- void setExhaustion(float)
- double getFoodLevel()
- void resetFallDistance()
- void setSaturation(double)

### Class: com.sk89q.worldguard.bukkit.BukkitRegionContainer
Type: Class
Extends: com.sk89q.worldguard.protection.regions.RegionContainer

Methods:
- void initialize()
- void shutdown()

### Class: com.sk89q.worldguard.bukkit.BukkitStringMatcher
Type: Class
Implements: com.sk89q.worldguard.internal.platform.StringMatcher

Methods:
- String replaceMacros(Actor, String)
- World matchWorld(Actor, String) throws CommandException
- Actor matchPlayerOrConsole(Actor, String) throws CommandException
- List matchPlayerNames(String)
- World getWorldByName(String)
- Iterable matchPlayers(Actor, String) throws CommandException

### Class: com.sk89q.worldguard.bukkit.BukkitUtil
Type: Class

Methods:
- int getPotionEffectBits(ItemStack)
- boolean isWaterPotion(ItemStack)
- Target createTarget(Block)
- Target createTarget(ItemStack)
- Target createTarget(Material)

### Class: com.sk89q.worldguard.bukkit.BukkitWorldConfiguration
Type: Class
Extends: com.sk89q.worldguard.config.YamlWorldConfiguration

Methods:
- boolean isChestProtectedPlacement(Location, LocalPlayer)
- void loadConfiguration()
- boolean isChestProtected(Location, LocalPlayer)
- boolean isChestProtected(Location)
- ChestProtection getChestProtection()
- boolean isAdjacentChestProtected(Location, LocalPlayer)

### Class: com.sk89q.worldguard.bukkit.BukkitWorldGuardPlatform
Type: Class
Implements: com.sk89q.worldguard.internal.platform.WorldGuardPlatform

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
- BukkitConfigurationManager getGlobalStateManager()
- ConfigurationManager getGlobalStateManager()
- String getPlatformVersion()
- DebugHandler getDebugHandler()
- void broadcastNotification(String)
- void broadcastNotification(TextComponent)

### Class: com.sk89q.worldguard.bukkit.ProtectionQuery
Type: Class

Methods:
- boolean testEntityInteract(Object, Entity)
- boolean testEntityDamage(Object, Entity)
- boolean testBlockInteract(Object, Block)
- boolean testBlockBreak(Object, Block)
- boolean testBlockPlace(Object, Location, Material)
- boolean testEntityDestroy(Object, Entity)
- boolean testEntityPlace(Object, Location, EntityType)

### Class: com.sk89q.worldguard.bukkit.WorldGuardPlugin
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- Actor wrapCommandSender(CommandSender)
- ProtectionQuery createProtectionQuery()
- LocalPlayer wrapPlayer(Player)
- LocalPlayer wrapPlayer(Player, boolean)
- boolean onCommand(CommandSender, Command, String, String[])
- PlayerMoveListener getPlayerMoveListener()
- void onEnable()
- void onDisable()
- LocalPlayer wrapOfflinePlayer(OfflinePlayer)
- void checkPermission(CommandSender, String) throws CommandPermissionsException
- BukkitConfigurationManager getConfigManager()
- CommandSender unwrapActor(Actor)
- WorldEditPlugin getWorldEdit() throws CommandException
- void createDefaultConfiguration(File, String)
- boolean hasPermission(CommandSender, String)
- WorldGuardPlugin inst()
- boolean inGroup(OfflinePlayer, String)
- String[] getGroups(OfflinePlayer)

## Package: com.sk89q.worldguard.bukkit.bstats

### Class: com.sk89q.worldguard.bukkit.bstats.MetricsBase
Type: Class

Methods:
- void addCustomChart(CustomChart)

## Package: com.sk89q.worldguard.bukkit.bstats.bukkit

### Class: com.sk89q.worldguard.bukkit.bstats.bukkit.Metrics
Type: Class

Methods:
- void addCustomChart(CustomChart)

## Package: com.sk89q.worldguard.bukkit.bstats.charts

### Class: com.sk89q.worldguard.bukkit.bstats.charts.CustomChart
Type: Abstract Class

Methods:
- JsonObjectBuilder$JsonObject getRequestJsonObject(BiConsumer, boolean)

### Class: com.sk89q.worldguard.bukkit.bstats.charts.DrilldownPie
Type: Class
Extends: com.sk89q.worldguard.bukkit.bstats.charts.CustomChart

Methods:
- JsonObjectBuilder$JsonObject getChartData() throws Exception

### Class: com.sk89q.worldguard.bukkit.bstats.charts.SimplePie
Type: Class
Extends: com.sk89q.worldguard.bukkit.bstats.charts.CustomChart

No public methods found

### Class: com.sk89q.worldguard.bukkit.bstats.charts.SingleLineChart
Type: Class
Extends: com.sk89q.worldguard.bukkit.bstats.charts.CustomChart

No public methods found

## Package: com.sk89q.worldguard.bukkit.bstats.json

### Class: com.sk89q.worldguard.bukkit.bstats.json.JsonObjectBuilder
Type: Class

Methods:
- JsonObjectBuilder$JsonObject build()
- JsonObjectBuilder appendNull(String)
- JsonObjectBuilder appendField(String, String)
- JsonObjectBuilder appendField(String, int)
- JsonObjectBuilder appendField(String, JsonObjectBuilder$JsonObject)
- JsonObjectBuilder appendField(String, String[])
- JsonObjectBuilder appendField(String, int[])
- JsonObjectBuilder appendField(String, JsonObjectBuilder$JsonObject[])

## Package: com.sk89q.worldguard.bukkit.cause

### Class: com.sk89q.worldguard.bukkit.cause.Cause
Type: Class

Methods:
- Player getFirstPlayer()
- Entity getFirstNonPlayerEntity()
- EntityType find(EntityType[])
- Entity getFirstEntity()
- void trackParentCause(Metadatable, Object)
- Cause create(Object[])
- boolean isKnown()
- String toString()
- boolean isIndirect()
- void untrackParentCause(Metadatable)
- Object getRootCause()
- Block getFirstBlock()
- Cause unknown()

## Package: com.sk89q.worldguard.bukkit.chest

### Class: com.sk89q.worldguard.bukkit.chest.BukkitSignChestProtection
Type: Class
Extends: com.sk89q.worldguard.chest.SignChestProtection

Methods:
- Boolean isProtectedSign(Location, LocalPlayer)

## Package: com.sk89q.worldguard.bukkit.event

### Class: com.sk89q.worldguard.bukkit.event.BulkEvent
Type: Interface

Methods:
- Event$Result getExplicitResult()

### Class: com.sk89q.worldguard.bukkit.event.Handleable
Type: Interface

Methods:
- void setResult(Event$Result)
- Event$Result getResult()

### Class: com.sk89q.worldguard.bukkit.event.DelegateEvent
Type: Abstract Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable, com.sk89q.worldguard.bukkit.event.Handleable

Methods:
- Event getOriginalEvent()
- boolean isCancelled()
- DelegateEvent setSilent(boolean)
- void setResult(Event$Result)
- void setCancelled(boolean)
- Event$Result getResult()
- List getRelevantFlags()
- DelegateEvent setAllowed(boolean)
- boolean isSilent()
- Cause getCause()

### Class: com.sk89q.worldguard.bukkit.event.DelegateEvents
Type: Class

Methods:
- DelegateEvent setSilent(DelegateEvent)
- DelegateEvent setSilent(DelegateEvent, boolean)
- Handleable setAllowed(Handleable, boolean)

## Package: com.sk89q.worldguard.bukkit.event.block

### Class: com.sk89q.worldguard.bukkit.event.block.BreakBlockEvent
Type: Class
Extends: com.sk89q.worldguard.bukkit.event.block.AbstractBlockEvent

Methods:
- boolean filter(Predicate)
- boolean filter(Predicate, boolean)
- World getWorld()
- HandlerList getHandlers()
- Event$Result getResult()
- HandlerList getHandlerList()
- Event$Result getExplicitResult()
- List getBlocks()
- Material getEffectiveMaterial()

### Class: com.sk89q.worldguard.bukkit.event.block.PlaceBlockEvent
Type: Class
Extends: com.sk89q.worldguard.bukkit.event.block.AbstractBlockEvent

Methods:
- boolean filter(Predicate)
- boolean filter(Predicate, boolean)
- World getWorld()
- HandlerList getHandlers()
- Event$Result getResult()
- HandlerList getHandlerList()
- Event$Result getExplicitResult()
- List getBlocks()
- Material getEffectiveMaterial()

### Class: com.sk89q.worldguard.bukkit.event.block.UseBlockEvent
Type: Class
Extends: com.sk89q.worldguard.bukkit.event.block.AbstractBlockEvent

Methods:
- boolean filter(Predicate)
- boolean filter(Predicate, boolean)
- World getWorld()
- HandlerList getHandlers()
- Event$Result getResult()
- HandlerList getHandlerList()
- Event$Result getExplicitResult()
- List getBlocks()
- Material getEffectiveMaterial()

## Package: com.sk89q.worldguard.bukkit.event.debug

### Class: com.sk89q.worldguard.bukkit.event.debug.CancelLogging
Type: Interface
Implements: org.bukkit.event.Cancellable

Methods:
- List getCancels()

### Class: com.sk89q.worldguard.bukkit.event.debug.CancelAttempt
Type: Class

Methods:
- boolean getAfter()
- StackTraceElement[] getStackTrace()
- boolean getBefore()

### Class: com.sk89q.worldguard.bukkit.event.debug.CancelLogger
Type: Class

Methods:
- void log(boolean, boolean, StackTraceElement[])
- List getCancels()

### Class: com.sk89q.worldguard.bukkit.event.debug.LoggingBlockBreakEvent
Type: Class
Extends: org.bukkit.event.block.BlockBreakEvent
Implements: com.sk89q.worldguard.bukkit.event.debug.CancelLogging

Methods:
- void setCancelled(boolean)
- List getCancels()

### Class: com.sk89q.worldguard.bukkit.event.debug.LoggingBlockPlaceEvent
Type: Class
Extends: org.bukkit.event.block.BlockPlaceEvent
Implements: com.sk89q.worldguard.bukkit.event.debug.CancelLogging

Methods:
- void setCancelled(boolean)
- List getCancels()

### Class: com.sk89q.worldguard.bukkit.event.debug.LoggingEntityDamageByEntityEvent
Type: Class
Extends: org.bukkit.event.entity.EntityDamageByEntityEvent
Implements: com.sk89q.worldguard.bukkit.event.debug.CancelLogging

Methods:
- void setCancelled(boolean)
- List getCancels()

### Class: com.sk89q.worldguard.bukkit.event.debug.LoggingPlayerInteractEvent
Type: Class
Extends: org.bukkit.event.player.PlayerInteractEvent
Implements: com.sk89q.worldguard.bukkit.event.debug.CancelLogging

Methods:
- void setCancelled(boolean)
- List getCancels()
- void setUseItemInHand(Event$Result)
- void setUseInteractedBlock(Event$Result)

## Package: com.sk89q.worldguard.bukkit.event.entity

### Class: com.sk89q.worldguard.bukkit.event.entity.DamageEntityEvent
Type: Class
Extends: com.sk89q.worldguard.bukkit.event.entity.AbstractEntityEvent

Methods:
- boolean filter(Predicate, boolean)
- World getWorld()
- Location getTarget()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- Entity getEntity()

### Class: com.sk89q.worldguard.bukkit.event.entity.DestroyEntityEvent
Type: Class
Extends: com.sk89q.worldguard.bukkit.event.entity.AbstractEntityEvent

Methods:
- boolean filter(Predicate, boolean)
- World getWorld()
- Location getTarget()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- Entity getEntity()

### Class: com.sk89q.worldguard.bukkit.event.entity.SpawnEntityEvent
Type: Class
Extends: com.sk89q.worldguard.bukkit.event.entity.AbstractEntityEvent

Methods:
- boolean filter(Predicate, boolean)
- World getWorld()
- Location getTarget()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- EntityType getEffectiveType()
- Entity getEntity()

### Class: com.sk89q.worldguard.bukkit.event.entity.UseEntityEvent
Type: Class
Extends: com.sk89q.worldguard.bukkit.event.entity.AbstractEntityEvent

Methods:
- boolean filter(Predicate, boolean)
- World getWorld()
- Location getTarget()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- Entity getEntity()

## Package: com.sk89q.worldguard.bukkit.event.inventory

### Class: com.sk89q.worldguard.bukkit.event.inventory.UseItemEvent
Type: Class
Extends: com.sk89q.worldguard.bukkit.event.DelegateEvent

Methods:
- World getWorld()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- ItemStack getItemStack()

## Package: com.sk89q.worldguard.bukkit.event.player

### Class: com.sk89q.worldguard.bukkit.event.player.ProcessPlayerEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()

## Package: com.sk89q.worldguard.bukkit.internal

### Class: com.sk89q.worldguard.bukkit.internal.TargetMatcherSet
Type: Class

Methods:
- boolean add(TargetMatcher)
- boolean test(Target)
- boolean test(Material)
- boolean test(Block)
- boolean test(BlockState)
- boolean test(ItemStack)
- String toString()

### Class: com.sk89q.worldguard.bukkit.internal.WGMetadata
Type: Class

Methods:
- void remove(Metadatable, String)
- Object getIfPresent(Metadatable, String, Class)
- void put(Metadatable, String, Object)

## Package: com.sk89q.worldguard.bukkit.listener

### Class: com.sk89q.worldguard.bukkit.listener.BlacklistListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onInventoryCreative(InventoryCreativeEvent)
- void onBlockDispense(BlockDispenseEvent)
- void onPlaceBlock(PlaceBlockEvent)
- void onPlayerDropItem(PlayerDropItemEvent)
- void onSpawnEntity(SpawnEntityEvent)
- void onInventoryDrag(InventoryDragEvent)
- void onInventoryClick(InventoryClickEvent)
- void onPlayerItemHeld(PlayerItemHeldEvent)
- void onUseItem(UseItemEvent)
- void onBlockDispenseArmor(BlockDispenseArmorEvent)
- void onDestroyEntity(DestroyEntityEvent)
- void registerEvents()
- void onUseBlock(UseBlockEvent)
- void onBreakBlock(BreakBlockEvent)

### Class: com.sk89q.worldguard.bukkit.listener.BlockedPotionsListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void registerEvents()
- void onProjectile(DamageEntityEvent)
- void onItemInteract(UseItemEvent)

### Class: com.sk89q.worldguard.bukkit.listener.BuildPermissionListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onDamageEntity(DamageEntityEvent)
- void onPlaceBlock(PlaceBlockEvent)
- void onUseItem(UseItemEvent)
- void onDestroyEntity(DestroyEntityEvent)
- void onSpawnEntity(SpawnEntityEvent)
- void registerEvents()
- void onUseEntity(UseEntityEvent)
- void onUseBlock(UseBlockEvent)
- void onBreakBlock(BreakBlockEvent)

### Class: com.sk89q.worldguard.bukkit.listener.ChestProtectionListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onSignChange(SignChangeEvent)
- void onPlaceBlock(PlaceBlockEvent)
- void registerEvents()
- void onUseBlock(UseBlockEvent)
- void onBreakBlock(BreakBlockEvent)

### Class: com.sk89q.worldguard.bukkit.listener.DebuggingListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onDamageEntity(DamageEntityEvent)
- void onPlaceBlock(PlaceBlockEvent)
- void onUseItem(UseItemEvent)
- void onDestroyEntity(DestroyEntityEvent)
- void onSpawnEntity(SpawnEntityEvent)
- void registerEvents()
- void onUseEntity(UseEntityEvent)
- void onUseBlock(UseBlockEvent)
- void onBreakBlock(BreakBlockEvent)

### Class: com.sk89q.worldguard.bukkit.listener.EventAbstractionListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onBlockPistonExtend(BlockPistonExtendEvent)
- void onEntityPickupItem(EntityPickupItemEvent)
- void onEntityDeath(EntityDeathEvent)
- void onBlockBreak(BlockBreakEvent)
- void onInventoryOpen(InventoryOpenEvent)
- void onInventoryMoveItem(InventoryMoveItemEvent)
- void onProjectileHit(ProjectileHitEvent)
- void onCauldronLevelChange(CauldronLevelChangeEvent)
- void onBedEnter(PlayerBedEnterEvent)
- void onPlayerBucketEmpty(PlayerBucketEmptyEvent)
- void onPlayerInteractAtEntity(PlayerInteractAtEntityEvent)
- void onEntityInteract(EntityInteractEvent)
- void onBlockIgnite(BlockIgniteEvent)
- void registerEvents()
- void onPlayerFish(PlayerFishEvent)
- void onBlockPistonRetract(BlockPistonRetractEvent)
- void onPlayerInteract(PlayerInteractEvent)
- void onEntityExplode(EntityExplodeEvent)
- void onCreatureSpawn(CreatureSpawnEvent)
- void onEntityBlockForm(EntityBlockFormEvent)
- void onBlockFromTo(BlockFromToEvent)
- void onPlayerShearEntity(PlayerShearEntityEvent)
- void onBlockExp(BlockExpEvent)
- void onLingeringApply(AreaEffectCloudApplyEvent)
- void onPlayerInteractEntity(PlayerInteractEntityEvent)
- void onVehicleDestroy(VehicleDestroyEvent)
- void onTakeLecternBook(PlayerTakeLecternBookEvent)
- void onEntityLeash(PlayerLeashEntityEvent)
- void onHangingBreak(HangingBreakEvent)
- void onEntityTame(EntityTameEvent)
- void onBlockDispense(BlockDispenseEvent)
- void onExpBottle(ExpBottleEvent)
- void onBlockFertilize(BlockFertilizeEvent)
- void onBlockPlace(BlockPlaceEvent)
- void onBlockExplode(BlockExplodeEvent)
- void onEntityCombust(EntityCombustEvent)
- void onEntityChangeBlock(EntityChangeBlockEvent)
- void onPotionSplash(PotionSplashEvent)
- void onEntityDamage(EntityDamageEvent)
- void onBlockDamage(BlockDamageEvent)
- void onBlockMultiPlace(BlockMultiPlaceEvent)
- void onLingeringSplash(LingeringPotionSplashEvent)
- void onPlayerBucketFill(PlayerBucketFillEvent)
- void onStructureGrowEvent(StructureGrowEvent)
- void onSignChange(SignChangeEvent)
- void onHangingPlace(HangingPlaceEvent)
- void onPlayerDropItem(PlayerDropItemEvent)
- void onPlayerItemConsume(PlayerItemConsumeEvent)
- void onVehicleDamage(VehicleDamageEvent)
- void onEntityUnleash(EntityUnleashEvent)
- void onPlayerPickupItem(PlayerPickupItemEvent)
- void onBlockBurn(BlockBurnEvent)

### Class: com.sk89q.worldguard.bukkit.listener.InvincibilityListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onEntityCombust(EntityCombustEvent)
- void onEntityDamage(EntityDamageEvent)
- void onFoodLevelChange(FoodLevelChangeEvent)
- void registerEvents()

### Class: com.sk89q.worldguard.bukkit.listener.PlayerModesListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onProcessPlayer(ProcessPlayerEvent)
- void registerEvents()

### Class: com.sk89q.worldguard.bukkit.listener.PlayerMoveListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onPlayerRespawn(PlayerRespawnEvent)
- void onEntityMount(EntityMountEvent)
- void onPlayerQuit(PlayerQuitEvent)
- void onPlayerMove(PlayerMoveEvent)
- void registerEvents()
- void onVehicleEnter(VehicleEnterEvent)

### Class: com.sk89q.worldguard.bukkit.listener.RegionFlagsListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onPlaceBlock(PlaceBlockEvent)
- void onEntityDamage(EntityDamageEvent)
- void registerEvents()
- void onBreakBlock(BreakBlockEvent)

### Class: com.sk89q.worldguard.bukkit.listener.RegionProtectionListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onDamageEntity(DamageEntityEvent)
- void onPlaceBlock(PlaceBlockEvent)
- void onVehicleExit(VehicleExitEvent)
- void onEntityMount(EntityMountEvent)
- void onDestroyEntity(DestroyEntityEvent)
- void onSpawnEntity(SpawnEntityEvent)
- void registerEvents()
- void onUseEntity(UseEntityEvent)
- void onUseBlock(UseBlockEvent)
- void onBreakBlock(BreakBlockEvent)

### Class: com.sk89q.worldguard.bukkit.listener.WorldGuardBlockListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onLeavesDecay(LeavesDecayEvent)
- void onBlockBreak(BlockBreakEvent)
- void onMoistureChange(MoistureChangeEvent)
- void onBlockGrow(BlockGrowEvent)
- void onBlockPlace(BlockPlaceEvent)
- void onBlockPhysics(BlockPhysicsEvent)
- void onBlockFromTo(BlockFromToEvent)
- void onBlockFade(BlockFadeEvent)
- void onBlockExplode(BlockExplodeEvent)
- void onBlockRedstoneChange(BlockRedstoneEvent)
- void onBlockSpread(BlockSpreadEvent)
- void onBlockForm(BlockFormEvent)
- void registerEvents()
- void onBlockIgnite(BlockIgniteEvent)
- void onBlockBurn(BlockBurnEvent)

### Class: com.sk89q.worldguard.bukkit.listener.WorldGuardCommandBookListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onPlayerWhois(InfoComponent$PlayerWhoisEvent)

### Class: com.sk89q.worldguard.bukkit.listener.WorldGuardEntityListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onCreatePortal(PortalCreateEvent)
- void onEntityTransform(EntityTransformEvent)
- void onEntityDeath(EntityDeathEvent)
- void onEntityRegainHealth(EntityRegainHealthEvent)
- void onEntityExplode(EntityExplodeEvent)
- void onExplosionPrime(ExplosionPrimeEvent)
- void onCreatureSpawn(CreatureSpawnEvent)
- void onPigZap(PigZapEvent)
- void onEntityChangeBlock(EntityChangeBlockEvent)
- void onCreeperPower(CreeperPowerEvent)
- void onEntityDamage(EntityDamageEvent)
- void onFoodChange(FoodLevelChangeEvent)
- void onEntityInteract(EntityInteractEvent)
- void registerEvents()
- void onVehicleEnter(VehicleEnterEvent)

### Class: com.sk89q.worldguard.bukkit.listener.WorldGuardHangingListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void registerEvents()
- void onHangingBreak(HangingBreakEvent)

### Class: com.sk89q.worldguard.bukkit.listener.WorldGuardPlayerListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onPlayerRespawn(PlayerRespawnEvent)
- void onPlayerTeleport(PlayerTeleportEvent)
- void onPlayerInteract(PlayerInteractEvent)
- void onPlayerChat(AsyncPlayerChatEvent)
- void onPlayerGameModeChange(PlayerGameModeChangeEvent)
- void registerEvents()
- void onItemHeldChange(PlayerItemHeldEvent)
- void onPlayerLogin(PlayerLoginEvent)
- void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent)
- void onPlayerJoin(PlayerJoinEvent)

### Class: com.sk89q.worldguard.bukkit.listener.WorldGuardServerListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onPluginEnable(PluginEnableEvent)
- void onPluginDisable(PluginDisableEvent)
- void registerEvents()

### Class: com.sk89q.worldguard.bukkit.listener.WorldGuardVehicleListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void registerEvents()
- void onVehicleMove(VehicleMoveEvent)

### Class: com.sk89q.worldguard.bukkit.listener.WorldGuardWeatherListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onThunderChange(ThunderChangeEvent)
- void onWeatherChange(WeatherChangeEvent)
- void registerEvents()
- void onLightningStrike(LightningStrikeEvent)

### Class: com.sk89q.worldguard.bukkit.listener.WorldGuardWorldListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void initWorld(World)
- void onChunkLoad(ChunkLoadEvent)
- void registerEvents()
- void onWorldLoad(WorldLoadEvent)

### Class: com.sk89q.worldguard.bukkit.listener.WorldRulesListener
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.AbstractListener

Methods:
- void onSpawnEntity(SpawnEntityEvent)
- void registerEvents()
- void onPotionEffect(EntityPotionEffectEvent)

## Package: com.sk89q.worldguard.bukkit.listener.debounce

### Class: com.sk89q.worldguard.bukkit.listener.debounce.BlockPistonExtendKey
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)

### Class: com.sk89q.worldguard.bukkit.listener.debounce.BlockPistonRetractKey
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)

### Class: com.sk89q.worldguard.bukkit.listener.debounce.EventDebounce
Type: Class

Methods:
- void fireToCancel(Cancellable, Event, Object)
- EventDebounce$Entry getIfNotPresent(Object, Cancellable)
- EventDebounce create(int)

## Package: com.sk89q.worldguard.bukkit.listener.debounce.legacy

### Class: com.sk89q.worldguard.bukkit.listener.debounce.legacy.AbstractEventDebounce
Type: Class

No public methods found

### Class: com.sk89q.worldguard.bukkit.listener.debounce.legacy.BlockEntityEventDebounce
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.debounce.legacy.AbstractEventDebounce

Methods:
- void debounce(Block, Entity, Cancellable, Event)

### Class: com.sk89q.worldguard.bukkit.listener.debounce.legacy.EntityEntityEventDebounce
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.debounce.legacy.AbstractEventDebounce

Methods:
- void debounce(Entity, Entity, Cancellable, Event)

### Class: com.sk89q.worldguard.bukkit.listener.debounce.legacy.InventoryMoveItemEventDebounce
Type: Class
Extends: com.sk89q.worldguard.bukkit.listener.debounce.legacy.AbstractEventDebounce

Methods:
- AbstractEventDebounce$Entry tryDebounce(InventoryMoveItemEvent)

## Package: com.sk89q.worldguard.bukkit.paperlib

### Class: com.sk89q.worldguard.bukkit.paperlib.PaperLib
Type: Class

Methods:
- boolean isPaper()
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)
- CompletableFuture getChunkAtAsync(Location)
- CompletableFuture getChunkAtAsync(Location, boolean)
- CompletableFuture getChunkAtAsync(World, int, int)
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)
- int getMinecraftVersion()
- boolean isVersion(int)
- boolean isVersion(int, int)
- Environment getEnvironment()
- int getMinecraftReleaseCandidateVersion()
- int getMinecraftPatchVersion()
- CompletableFuture teleportAsync(Entity, Location)
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)
- boolean isSpigot()
- CompletableFuture getChunkAtAsyncUrgently(World, int, int, boolean)
- boolean isChunkGenerated(Location)
- boolean isChunkGenerated(World, int, int)
- void setCustomEnvironment(Environment)
- void suggestPaper(Plugin)
- void suggestPaper(Plugin, Level)
- BlockStateSnapshotResult getBlockState(Block, boolean)
- int getMinecraftPreReleaseVersion()
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

## Package: com.sk89q.worldguard.bukkit.paperlib.environments

### Class: com.sk89q.worldguard.bukkit.paperlib.environments.CraftBukkitEnvironment
Type: Class
Extends: com.sk89q.worldguard.bukkit.paperlib.environments.Environment

Methods:
- String getName()

### Class: com.sk89q.worldguard.bukkit.paperlib.environments.Environment
Type: Abstract Class

Methods:
- boolean isPaper()
- String getName()
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)
- CompletableFuture teleport(Entity, Location, PlayerTeleportEvent$TeleportCause)
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)
- int getMinecraftVersion()
- boolean isVersion(int)
- boolean isVersion(int, int)
- int getMinecraftReleaseCandidateVersion()
- int getMinecraftPatchVersion()
- boolean isSpigot()
- CompletableFuture getChunkAtAsyncUrgently(World, int, int, boolean)
- boolean isChunkGenerated(World, int, int)
- BlockStateSnapshotResult getBlockState(Block, boolean)
- int getMinecraftPreReleaseVersion()
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.environments.PaperEnvironment
Type: Class
Extends: com.sk89q.worldguard.bukkit.paperlib.environments.SpigotEnvironment

Methods:
- boolean isPaper()
- String getName()

### Class: com.sk89q.worldguard.bukkit.paperlib.environments.SpigotEnvironment
Type: Class
Extends: com.sk89q.worldguard.bukkit.paperlib.environments.CraftBukkitEnvironment

Methods:
- String getName()
- boolean isSpigot()

## Package: com.sk89q.worldguard.bukkit.paperlib.features.asyncchunks

### Class: com.sk89q.worldguard.bukkit.paperlib.features.asyncchunks.AsyncChunks
Type: Interface

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.asyncchunks.AsyncChunksPaper_13
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.asyncchunks.AsyncChunksPaper_15
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.asyncchunks.AsyncChunksPaper_9_12
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.asyncchunks.AsyncChunksSync
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

## Package: com.sk89q.worldguard.bukkit.paperlib.features.asyncteleport

### Class: com.sk89q.worldguard.bukkit.paperlib.features.asyncteleport.AsyncTeleport
Type: Interface

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.asyncteleport.AsyncTeleportPaper
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.asyncteleport.AsyncTeleportPaper_13
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.asyncteleport.AsyncTeleportSync
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

## Package: com.sk89q.worldguard.bukkit.paperlib.features.bedspawnlocation

### Class: com.sk89q.worldguard.bukkit.paperlib.features.bedspawnlocation.BedSpawnLocation
Type: Interface

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.bedspawnlocation.BedSpawnLocationPaper
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.bedspawnlocation.BedSpawnLocation

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.bedspawnlocation.BedSpawnLocationSync
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.bedspawnlocation.BedSpawnLocation

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

## Package: com.sk89q.worldguard.bukkit.paperlib.features.blockstatesnapshot

### Class: com.sk89q.worldguard.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshot
Type: Interface

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshotBeforeSnapshots
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshotNoOption
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshotOptionalSnapshots
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshotResult
Type: Class

Methods:
- BlockState getState()
- boolean isSnapshot()

## Package: com.sk89q.worldguard.bukkit.paperlib.features.chunkisgenerated

### Class: com.sk89q.worldguard.bukkit.paperlib.features.chunkisgenerated.ChunkIsGenerated
Type: Interface

Methods:
- boolean isChunkGenerated(World, int, int)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.chunkisgenerated.ChunkIsGeneratedApiExists
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.chunkisgenerated.ChunkIsGenerated

Methods:
- boolean isChunkGenerated(World, int, int)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.chunkisgenerated.ChunkIsGeneratedUnknown
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.chunkisgenerated.ChunkIsGenerated

Methods:
- boolean isChunkGenerated(World, int, int)

## Package: com.sk89q.worldguard.bukkit.paperlib.features.inventoryholdersnapshot

### Class: com.sk89q.worldguard.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot
Type: Interface

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotBeforeSnapshots
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotNoOption
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotOptionalSnapshots
Type: Class
Implements: com.sk89q.worldguard.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.sk89q.worldguard.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotResult
Type: Class

Methods:
- boolean isSnapshot()
- InventoryHolder getHolder()

## Package: com.sk89q.worldguard.bukkit.protection.events

### Class: com.sk89q.worldguard.bukkit.protection.events.DisallowedPVPEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- HandlerList getHandlerList()
- Event getCause()
- Player getAttacker()
- Player getDefender()

## Package: com.sk89q.worldguard.bukkit.protection.events.flags

### Class: com.sk89q.worldguard.bukkit.protection.events.flags.FlagContextCreateEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()
- boolean addObject(String, Object)

## Package: com.sk89q.worldguard.bukkit.session

### Class: com.sk89q.worldguard.bukkit.session.BukkitSessionManager
Type: Class
Extends: com.sk89q.worldguard.session.AbstractSessionManager
Implements: java.lang.Runnable, org.bukkit.event.Listener

Methods:
- void onPlayerProcess(ProcessPlayerEvent)
- void resetAllStates()
- void run()
- boolean hasBypass(LocalPlayer, World)
- void shutdown()

## Package: com.sk89q.worldguard.bukkit.util

### Class: com.sk89q.worldguard.bukkit.util.Blocks
Type: Class

Methods:
- List getConnected(Block)

### Class: com.sk89q.worldguard.bukkit.util.ClassSourceValidator
Type: Class

Methods:
- Map findMismatches(List)
- void reportMismatches(List)

### Class: com.sk89q.worldguard.bukkit.util.Entities
Type: Class

Methods:
- boolean isNonPlayerCreature(Entity)
- boolean isConsideredBuildingIfUsed(Entity)
- boolean isMinecart(EntityType)
- boolean isPotionArrow(Entity)
- boolean isNPC(Entity)
- boolean isAmbient(Entity)
- boolean isNonHostile(Entity)
- boolean isBoat(EntityType)
- boolean isTamed(Entity)
- boolean isRiddenOnUse(Entity)
- boolean isTNTBased(Entity)
- StateFlag getExplosionFlag(Entity)
- Entity getShooter(Entity)
- boolean isAoECloud(EntityType)
- boolean isVehicle(EntityType)
- boolean isPluginSpawning(CreatureSpawnEvent$SpawnReason)
- boolean isFireball(EntityType)
- boolean isHostile(Entity)

### Class: com.sk89q.worldguard.bukkit.util.Events
Type: Class

Methods:
- void restoreStatistic(Entity, EntityDamageEvent$DamageCause)
- boolean isFireCause(EntityDamageEvent$DamageCause)
- boolean fireAndTestCancel(Event)
- boolean fireToCancel(Cancellable, Event)
- boolean fireBulkEventToCancel(Cancellable, Event)
- void fire(Event)
- boolean fireItemEventToCancel(PlayerInteractEvent, Event)
- boolean isExplosionCause(EntityDamageEvent$DamageCause)

### Class: com.sk89q.worldguard.bukkit.util.HandlerTracer
Type: Class

Methods:
- Plugin detectPlugin(StackTraceElement[])

### Class: com.sk89q.worldguard.bukkit.util.InteropUtils
Type: Class

Methods:
- boolean isFakePlayer(Player)

### Class: com.sk89q.worldguard.bukkit.util.Materials
Type: Class

Methods:
- boolean isArmor(Material)
- boolean isMinecart(Material)
- boolean isRailBlock(Material)
- boolean isSpawnEgg(Material)
- boolean isBed(Material)
- boolean isPistonBlock(Material)
- boolean isLeaf(Material)
- Material getRelatedMaterial(EntityType)
- boolean isInventoryBlock(Material)
- boolean isLava(Material)
- EntityType getEntitySpawnEgg(Material)
- EntityType getRelatedEntity(Material)
- boolean isShulkerBox(Material)
- boolean hasDamageEffect(Collection)
- boolean isUnwaxedCopper(Material)
- boolean isVine(Material)
- boolean isMushroom(Material)
- boolean isFire(Material)
- boolean isToolApplicable(Material, Material)
- boolean isConsideredBuildingIfUsed(Material)
- boolean isCoral(Material)
- boolean isWaxedCopper(Material)
- boolean isBoat(Material)
- boolean isPortal(Material)
- boolean isWater(Material)
- boolean isAnvil(Material)
- boolean isLiquid(Material)
- Material getBucketBlockMaterial(Material)
- boolean isUseFlagApplicable(Material)
- boolean isItemAppliedToBlock(Material, Material)
- boolean isSculkGrowth(Material)
- boolean isCrop(Material)
- boolean isBlockModifiedOnClick(Material, boolean)
- boolean isAmethystGrowth(Material)

## Package: com.sk89q.worldguard.bukkit.util.report

### Class: com.sk89q.worldguard.bukkit.util.report.CancelReport
Type: Class
Implements: com.sk89q.worldedit.util.report.Report

Methods:
- boolean isDetectingPlugin()
- String getTitle()
- String toString()
- void setDetectingPlugin(boolean)

### Class: com.sk89q.worldguard.bukkit.util.report.DatapackReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

### Class: com.sk89q.worldguard.bukkit.util.report.PerformanceReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

### Class: com.sk89q.worldguard.bukkit.util.report.PluginReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

### Class: com.sk89q.worldguard.bukkit.util.report.SchedulerReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

### Class: com.sk89q.worldguard.bukkit.util.report.ServerReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

### Class: com.sk89q.worldguard.bukkit.util.report.ServicesReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

### Class: com.sk89q.worldguard.bukkit.util.report.WorldReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

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
- Function messageComponentFunction(Actor)
- String replaceColorMacros(String)
- Function messageFunction(Actor)
- String getOwnerName(Object)

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
- Association valueOf(String)
- Association[] values()

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

## Package: com.sk89q.worldguard.internal.flywaydb.core

### Class: com.sk89q.worldguard.internal.flywaydb.core.Flyway
Type: Class

Methods:
- boolean isInitOnMigrate()
- String getSqlMigrationSuffix()
- void setPlaceholderPrefix(String)
- void setCallbacks(FlywayCallback[])
- void setCallbacks(String[])
- void setPlaceholderSuffix(String)
- MigrationVersion getInitVersion()
- Map getPlaceholders()
- String getEncoding()
- MigrationVersion getTarget()
- void setSqlMigrationSeparator(String)
- String getInitDescription()
- MigrationInfoService info()
- void setCleanOnValidationError(boolean)
- void init() throws FlywayException
- void setSqlMigrationSuffix(String)
- String getPlaceholderPrefix()
- boolean isCleanOnValidationError()
- FlywayCallback[] getCallbacks()
- String[] getSchemas()
- String getSqlMigrationSeparator()
- void setSchemas(String[])
- String getTable()
- void setTable(String)
- void setInitVersion(MigrationVersion)
- void setInitVersion(String)
- String[] getLocations()
- String getPlaceholderSuffix()
- void setSqlMigrationPrefix(String)
- void setOutOfOrder(boolean)
- void setValidateOnMigrate(boolean)
- int migrate() throws FlywayException
- void setIgnoreFailedFutureMigration(boolean)
- void repair() throws FlywayException
- void setPlaceholders(Map)
- DataSource getDataSource()
- boolean isValidateOnMigrate()
- void setEncoding(String)
- ClassLoader getClassLoader()
- MigrationResolver[] getResolvers()
- void setClassLoader(ClassLoader)
- void setInitOnMigrate(boolean)
- void setInitDescription(String)
- void setTarget(MigrationVersion)
- void setTarget(String)
- void setDataSource(DataSource)
- void setDataSource(String, String, String, String[])
- void validate() throws FlywayException
- boolean isIgnoreFailedFutureMigration()
- boolean isOutOfOrder()
- void configure(Properties)
- void clean()
- String getSqlMigrationPrefix()
- void setLocations(String[])
- void setResolvers(MigrationResolver[])
- void setResolvers(String[])

## Package: com.sk89q.worldguard.internal.flywaydb.core.api

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.MigrationInfo
Type: Interface
Implements: java.lang.Comparable

Methods:
- MigrationVersion getVersion()
- Date getInstalledOn()
- MigrationState getState()
- MigrationType getType()
- Integer getExecutionTime()
- Integer getChecksum()
- String getScript()
- String getDescription()

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.MigrationInfoService
Type: Interface

Methods:
- MigrationInfo[] all()
- MigrationInfo current()
- MigrationInfo[] applied()
- MigrationInfo[] pending()

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.FlywayException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.MigrationState
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean isFailed()
- String getDisplayName()
- MigrationState valueOf(String)
- MigrationState[] values()
- boolean isApplied()
- boolean isResolved()

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.MigrationType
Type: Enum
Extends: java.lang.Enum

Methods:
- MigrationType valueOf(String)
- MigrationType[] values()

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.MigrationVersion
Type: Class
Implements: java.lang.Comparable

Methods:
- String getVersion()
- MigrationVersion fromVersion(String)
- int hashCode()
- boolean equals(Object)
- String toString()
- int compareTo(MigrationVersion)
- int compareTo(Object)

## Package: com.sk89q.worldguard.internal.flywaydb.core.api.android

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.android.ContextHolder
Type: Class

Methods:
- void setContext(Context)
- Context getContext()

## Package: com.sk89q.worldguard.internal.flywaydb.core.api.callback

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.callback.FlywayCallback
Type: Interface

Methods:
- void beforeClean(Connection)
- void afterMigrate(Connection)
- void beforeInit(Connection)
- void afterClean(Connection)
- void beforeInfo(Connection)
- void afterInfo(Connection)
- void afterRepair(Connection)
- void beforeValidate(Connection)
- void afterValidate(Connection)
- void afterInit(Connection)
- void afterEachMigrate(Connection, MigrationInfo)
- void beforeRepair(Connection)
- void beforeEachMigrate(Connection, MigrationInfo)
- void beforeMigrate(Connection)

## Package: com.sk89q.worldguard.internal.flywaydb.core.api.migration

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.migration.MigrationChecksumProvider
Type: Interface

Methods:
- Integer getChecksum()

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.migration.MigrationInfoProvider
Type: Interface

Methods:
- MigrationVersion getVersion()
- String getDescription()

## Package: com.sk89q.worldguard.internal.flywaydb.core.api.migration.jdbc

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.migration.jdbc.JdbcMigration
Type: Interface

Methods:
- void migrate(Connection) throws Exception

## Package: com.sk89q.worldguard.internal.flywaydb.core.api.migration.spring

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.migration.spring.SpringJdbcMigration
Type: Interface

Methods:
- void migrate(JdbcTemplate) throws Exception

## Package: com.sk89q.worldguard.internal.flywaydb.core.api.resolver

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.resolver.MigrationExecutor
Type: Interface

Methods:
- boolean executeInTransaction()
- void execute(Connection) throws SQLException

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.resolver.MigrationResolver
Type: Interface

Methods:
- Collection resolveMigrations()

### Class: com.sk89q.worldguard.internal.flywaydb.core.api.resolver.ResolvedMigration
Type: Interface

Methods:
- MigrationVersion getVersion()
- String getPhysicalLocation()
- MigrationType getType()
- MigrationExecutor getExecutor()
- Integer getChecksum()
- String getScript()
- String getDescription()

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.command

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.command.DbClean
Type: Class

Methods:
- void clean() throws FlywayException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.command.DbInit
Type: Class

Methods:
- void init()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.command.DbMigrate
Type: Class

Methods:
- int migrate() throws FlywayException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.command.DbRepair
Type: Class

Methods:
- void repair()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.command.DbSchemas
Type: Class

Methods:
- void create()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.command.DbValidate
Type: Class

Methods:
- String validate()

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.DbSupport
Type: Abstract Class

Methods:
- void setCurrentSchema(Schema)
- boolean supportsDdlTransactions()
- boolean catalogIsSchema()
- String quote(String[])
- SqlStatementBuilder createSqlStatementBuilder()
- String getBooleanFalse()
- Schema getCurrentSchema()
- String getBooleanTrue()
- String getDbName()
- JdbcTemplate getJdbcTemplate()
- String getCurrentUserFunction()
- Schema getSchema(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.DbSupportFactory
Type: Class

Methods:
- DbSupport createDbSupport(Connection, boolean)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Delimiter
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)
- boolean isAloneOnLine()
- String getDelimiter()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.FlywaySqlScriptException
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.api.FlywayException

Methods:
- int getLineNumber()
- String getStatement()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Function
Type: Abstract Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SchemaObject

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.JdbcTemplate
Type: Class

Methods:
- int queryForInt(String, String[]) throws SQLException
- Connection getConnection()
- List queryForList(String, String[]) throws SQLException
- List query(String, RowMapper) throws SQLException
- String queryForString(String, String[]) throws SQLException
- void update(String, Object[]) throws SQLException
- List queryForStringList(String, String[]) throws SQLException
- void executeStatement(String) throws SQLException
- DatabaseMetaData getMetaData() throws SQLException
- void execute(String, Object[]) throws SQLException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Schema
Type: Abstract Class

Methods:
- void drop()
- String getName()
- Function getFunction(String, String[])
- Table[] allTables()
- void clean()
- Function[] allFunctions()
- Type[] allTypes()
- boolean empty()
- Table getTable(String)
- int hashCode()
- boolean equals(Object)
- void create()
- boolean exists()
- String toString()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SchemaObject
Type: Abstract Class

Methods:
- void drop()
- String getName()
- String toString()
- Schema getSchema()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlScript
Type: Class

Methods:
- List getSqlStatements()
- void execute(JdbcTemplate)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlStatement
Type: Class

Methods:
- String getSql()
- int getLineNumber()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlStatementBuilder
Type: Class

Methods:
- SqlStatement getSqlStatement()
- void addLine(String)
- boolean isTerminated()
- void setDelimiter(Delimiter)
- boolean isEmpty()
- void setLineNumber(int)
- boolean isSingleLineComment(String)
- boolean isCommentDirective(String)
- Delimiter extractNewDelimiterFromLine(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Table
Type: Abstract Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SchemaObject

Methods:
- void lock()
- boolean exists()
- int getColumnSize(String)
- boolean hasPrimaryKey()
- boolean hasColumn(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Type
Type: Abstract Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SchemaObject

No public methods found

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.db2

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.db2.DB2DbSupport
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.DbSupport

Methods:
- boolean supportsDdlTransactions()
- boolean catalogIsSchema()
- SqlStatementBuilder createSqlStatementBuilder()
- String doQuote(String)
- String getBooleanFalse()
- String getBooleanTrue()
- String getDbName()
- String getCurrentUserFunction()
- Schema getSchema(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.db2.DB2Function
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Function

Methods:
- String toString()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.db2.DB2Schema
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Schema

Methods:
- Table getTable(String)
- Function getFunction(String, String[])

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.db2.DB2SqlStatementBuilder
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlStatementBuilder

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.db2.DB2Table
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Table

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.db2.DB2Type
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Type

No public methods found

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.derby

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.derby.DerbyDbSupport
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.DbSupport

Methods:
- boolean supportsDdlTransactions()
- boolean catalogIsSchema()
- SqlStatementBuilder createSqlStatementBuilder()
- String doQuote(String)
- String getBooleanFalse()
- String getBooleanTrue()
- String getDbName()
- String getCurrentUserFunction()
- Schema getSchema(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.derby.DerbySchema
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Schema

Methods:
- Table getTable(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.derby.DerbySqlStatementBuilder
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlStatementBuilder

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.derby.DerbyTable
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Table

No public methods found

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.h2

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.h2.H2DbSupport
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.DbSupport

Methods:
- boolean supportsDdlTransactions()
- boolean catalogIsSchema()
- SqlStatementBuilder createSqlStatementBuilder()
- String doQuote(String)
- String getBooleanFalse()
- String getBooleanTrue()
- String getDbName()
- String getCurrentUserFunction()
- Schema getSchema(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.h2.H2Schema
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Schema

Methods:
- Table getTable(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.h2.H2SqlStatementBuilder
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlStatementBuilder

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.h2.H2Table
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Table

No public methods found

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.hsql

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.hsql.HsqlDbSupport
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.DbSupport

Methods:
- boolean supportsDdlTransactions()
- boolean catalogIsSchema()
- SqlStatementBuilder createSqlStatementBuilder()
- String doQuote(String)
- String getBooleanFalse()
- String getBooleanTrue()
- String getDbName()
- String getCurrentUserFunction()
- Schema getSchema(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.hsql.HsqlSchema
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Schema

Methods:
- Table getTable(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.hsql.HsqlSqlStatementBuilder
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlStatementBuilder

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.hsql.HsqlTable
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Table

No public methods found

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.mysql

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.mysql.MySQLDbSupport
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.DbSupport

Methods:
- boolean supportsDdlTransactions()
- boolean catalogIsSchema()
- SqlStatementBuilder createSqlStatementBuilder()
- String doQuote(String)
- String getBooleanFalse()
- String getBooleanTrue()
- String getDbName()
- String getCurrentUserFunction()
- Schema getSchema(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.mysql.MySQLSchema
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Schema

Methods:
- Table getTable(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.mysql.MySQLSqlStatementBuilder
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlStatementBuilder

Methods:
- boolean isSingleLineComment(String)
- boolean isCommentDirective(String)
- Delimiter extractNewDelimiterFromLine(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.mysql.MySQLTable
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Table

No public methods found

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.oracle

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.oracle.OracleDbSupport
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.DbSupport

Methods:
- boolean supportsDdlTransactions()
- boolean catalogIsSchema()
- SqlStatementBuilder createSqlStatementBuilder()
- String doQuote(String)
- String getBooleanFalse()
- String getBooleanTrue()
- String getDbName()
- String getCurrentUserFunction()
- Schema getSchema(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.oracle.OracleSchema
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Schema

Methods:
- Table getTable(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.oracle.OracleSqlStatementBuilder
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlStatementBuilder

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.oracle.OracleTable
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Table

No public methods found

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.postgresql

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLDbSupport
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.DbSupport

Methods:
- boolean supportsDdlTransactions()
- boolean catalogIsSchema()
- SqlStatementBuilder createSqlStatementBuilder()
- String doQuote(String)
- String getBooleanFalse()
- String getBooleanTrue()
- String getDbName()
- String getCurrentUserFunction()
- Schema getSchema(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLSchema
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Schema

Methods:
- Table getTable(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLSqlStatementBuilder
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlStatementBuilder

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLTable
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Table

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLType
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Type

No public methods found

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.sqlite

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.sqlite.SQLiteDbSupport
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.DbSupport

Methods:
- boolean supportsDdlTransactions()
- boolean catalogIsSchema()
- SqlStatementBuilder createSqlStatementBuilder()
- String doQuote(String)
- String getBooleanFalse()
- String getBooleanTrue()
- String getDbName()
- String getCurrentUserFunction()
- Schema getSchema(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.sqlite.SQLiteSchema
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Schema

Methods:
- Table getTable(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.sqlite.SQLiteSqlStatementBuilder
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlStatementBuilder

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.sqlite.SQLiteTable
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Table

No public methods found

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.sqlserver

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.sqlserver.SQLServerDbSupport
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.DbSupport

Methods:
- boolean supportsDdlTransactions()
- boolean catalogIsSchema()
- SqlStatementBuilder createSqlStatementBuilder()
- String doQuote(String)
- String getBooleanFalse()
- String getBooleanTrue()
- String getDbName()
- String getCurrentUserFunction()
- Schema getSchema(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.sqlserver.SQLServerSchema
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Schema

Methods:
- Table getTable(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.sqlserver.SQLServerSqlStatementBuilder
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.SqlStatementBuilder

No public methods found

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.sqlserver.SQLServerTable
Type: Class
Extends: com.sk89q.worldguard.internal.flywaydb.core.internal.dbsupport.Table

No public methods found

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.info

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.info.MigrationInfoContext
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.info.MigrationInfoImpl
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.api.MigrationInfo

Methods:
- MigrationVersion getVersion()
- Date getInstalledOn()
- int compareTo(MigrationInfo)
- int compareTo(Object)
- Integer getChecksum()
- String getDescription()
- MigrationState getState()
- MigrationType getType()
- int hashCode()
- boolean equals(Object)
- Integer getExecutionTime()
- String getScript()
- AppliedMigration getAppliedMigration()
- ResolvedMigration getResolvedMigration()
- String validate()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.info.MigrationInfoServiceImpl
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.api.MigrationInfoService

Methods:
- MigrationInfo[] all()
- MigrationInfo current()
- MigrationInfo[] applied()
- MigrationInfo[] future()
- MigrationInfoImpl[] pending()
- MigrationInfo[] pending()
- MigrationInfo[] outOfOrder()
- void refresh()
- MigrationInfo[] failed()
- String validate()
- MigrationInfo[] resolved()

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.metadatatable

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.metadatatable.MetaDataTable
Type: Interface

Methods:
- void removeFailedMigrations()
- void addInitMarker(MigrationVersion, String)
- void updateChecksum(MigrationVersion, Integer)
- AppliedMigration getInitMarker()
- boolean hasSchemasMarker()
- void lock()
- void addSchemasMarker(Schema[])
- boolean hasInitMarker()
- boolean hasAppliedMigrations()
- List allAppliedMigrations()
- void addAppliedMigration(AppliedMigration)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.metadatatable.AppliedMigration
Type: Class
Implements: java.lang.Comparable

Methods:
- MigrationVersion getVersion()
- Date getInstalledOn()
- int getVersionRank()
- int compareTo(AppliedMigration)
- int compareTo(Object)
- Integer getChecksum()
- String getDescription()
- MigrationType getType()
- int getInstalledRank()
- int hashCode()
- boolean equals(Object)
- int getExecutionTime()
- String getInstalledBy()
- String getScript()
- boolean isSuccess()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.metadatatable.MetaDataTableImpl
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.metadatatable.MetaDataTable

Methods:
- void removeFailedMigrations()
- void addInitMarker(MigrationVersion, String)
- void updateChecksum(MigrationVersion, Integer)
- AppliedMigration getInitMarker()
- boolean hasSchemasMarker()
- void lock()
- String toString()
- void addSchemasMarker(Schema[])
- boolean hasInitMarker()
- boolean hasAppliedMigrations()
- List allAppliedMigrations()
- void addAppliedMigration(AppliedMigration)

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.CompositeMigrationResolver
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.api.resolver.MigrationResolver

Methods:
- List resolveMigrations()
- Collection resolveMigrations()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.MigrationInfoHelper
Type: Class

Methods:
- Pair extractVersionAndDescription(String, String, String, String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.ResolvedMigrationComparator
Type: Class
Implements: java.util.Comparator

Methods:
- int compare(ResolvedMigration, ResolvedMigration)
- int compare(Object, Object)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.ResolvedMigrationImpl
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.api.resolver.ResolvedMigration

Methods:
- MigrationVersion getVersion()
- String getPhysicalLocation()
- void setVersion(MigrationVersion)
- void setChecksum(Integer)
- MigrationExecutor getExecutor()
- void setPhysicalLocation(String)
- int compareTo(ResolvedMigrationImpl)
- void setDescription(String)
- void setType(MigrationType)
- Integer getChecksum()
- void setExecutor(MigrationExecutor)
- String getDescription()
- MigrationType getType()
- int hashCode()
- boolean equals(Object)
- String getScript()
- void setScript(String)

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.jdbc

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.jdbc.JdbcMigrationExecutor
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.api.resolver.MigrationExecutor

Methods:
- boolean executeInTransaction()
- void execute(Connection)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.jdbc.JdbcMigrationResolver
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.api.resolver.MigrationResolver

Methods:
- List resolveMigrations()
- Collection resolveMigrations()

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.spring

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.spring.SpringJdbcMigrationExecutor
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.api.resolver.MigrationExecutor

Methods:
- boolean executeInTransaction()
- void execute(Connection)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.spring.SpringJdbcMigrationResolver
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.api.resolver.MigrationResolver

Methods:
- Collection resolveMigrations()

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.sql

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.sql.SqlMigrationExecutor
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.api.resolver.MigrationExecutor

Methods:
- boolean executeInTransaction()
- void execute(Connection)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.resolver.sql.SqlMigrationResolver
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.api.resolver.MigrationResolver

Methods:
- List resolveMigrations()
- Collection resolveMigrations()

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.util

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.ClassUtils
Type: Class

Methods:
- String getShortName(Class)
- boolean isPresent(String, ClassLoader)
- List instantiateAll(String[], ClassLoader)
- Object instantiate(String, ClassLoader) throws Exception
- String getLocationOnDisk(Class)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.FeatureDetector
Type: Class

Methods:
- boolean isApacheCommonsLoggingAvailable()
- boolean isOsgiFrameworkAvailable()
- boolean isJBossVFSv2Available()
- boolean isAndroidAvailable()
- boolean isJBossVFSv3Available()
- boolean isSpringJdbcAvailable()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.FileCopyUtils
Type: Class

Methods:
- String copyToString(Reader) throws IOException
- byte[] copyToByteArray(InputStream) throws IOException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.Location
Type: Class
Implements: java.lang.Comparable

Methods:
- String getDescriptor()
- boolean isFileSystem()
- String getPrefix()
- boolean isClassPath()
- int hashCode()
- boolean equals(Object)
- String getPath()
- boolean isParentOf(Location)
- String toString()
- int compareTo(Location)
- int compareTo(Object)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.Locations
Type: Class

Methods:
- List getLocations()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.ObjectUtils
Type: Class

Methods:
- boolean nullSafeEquals(Object, Object)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.Pair
Type: Class

Methods:
- Object getRight()
- Pair of(Object, Object)
- Object getLeft()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.PlaceholderReplacer
Type: Class

Methods:
- String replacePlaceholders(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.StopWatch
Type: Class

Methods:
- long getTotalTimeMillis()
- void stop()
- void start()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.StringUtils
Type: Class

Methods:
- String collectionToCommaDelimitedString(Collection)
- String replace(String, String, String)
- String collapseWhitespace(String)
- String trimLeadingWhitespace(String)
- String trimOrPad(String, int)
- String trimOrPad(String, int, char)
- boolean hasText(String)
- String replaceAll(String, String, String)
- String[] tokenizeToStringArray(String, String)
- String arrayToCommaDelimitedString(Object[])
- String left(String, int)
- boolean isNumeric(String)
- int countOccurrencesOf(String, String)
- String collectionToDelimitedString(Collection, String)
- boolean hasLength(String)
- String trimTrailingWhitespace(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.TimeFormat
Type: Class

Methods:
- String format(long)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.UrlUtils
Type: Class

Methods:
- String toFilePath(URL)

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.util.jdbc

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.jdbc.RowMapper
Type: Interface

Methods:
- Object mapRow(ResultSet) throws SQLException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.jdbc.TransactionCallback
Type: Interface

Methods:
- Object doInTransaction() throws SQLException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.jdbc.DriverDataSource
Type: Class
Implements: javax.sql.DataSource

Methods:
- void setLogWriter(PrintWriter) throws SQLException
- void setLoginTimeout(int) throws SQLException
- Logger getParentLogger()
- String getUser()
- Driver getDriver()
- Object unwrap(Class) throws SQLException
- Connection getConnection() throws SQLException
- Connection getConnection(String, String) throws SQLException
- String[] getInitSqls()
- String getUrl()
- String getPassword()
- boolean isWrapperFor(Class) throws SQLException
- int getLoginTimeout() throws SQLException
- void close()
- PrintWriter getLogWriter()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.jdbc.JdbcUtils
Type: Class

Methods:
- void closeStatement(Statement)
- Connection openConnection(DataSource) throws FlywayException
- void closeResultSet(ResultSet)
- void closeConnection(Connection)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.jdbc.TransactionTemplate
Type: Class

Methods:
- Object execute(TransactionCallback)

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.Log
Type: Interface

Methods:
- void warn(String)
- void debug(String)
- void error(String)
- void error(String, Exception)
- void info(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.LogCreator
Type: Interface

Methods:
- Log createLogger(Class)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.LogFactory
Type: Class

Methods:
- Log getLog(Class)
- void setLogCreator(LogCreator)

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.android

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.android.AndroidLog
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.Log

Methods:
- void warn(String)
- void debug(String)
- void error(String)
- void error(String, Exception)
- void info(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.android.AndroidLogCreator
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.LogCreator

Methods:
- Log createLogger(Class)

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.apachecommons

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.apachecommons.ApacheCommonsLog
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.Log

Methods:
- void warn(String)
- void debug(String)
- void error(String)
- void error(String, Exception)
- void info(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.apachecommons.ApacheCommonsLogCreator
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.LogCreator

Methods:
- Log createLogger(Class)

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.javautil

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.javautil.JavaUtilLog
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.Log

Methods:
- void warn(String)
- void debug(String)
- void error(String)
- void error(String, Exception)
- void info(String)

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.javautil.JavaUtilLogCreator
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.logging.LogCreator

Methods:
- Log createLogger(Class)

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.Resource
Type: Interface

Methods:
- String getLocation()
- String getFilename()
- String loadAsString(String)
- byte[] loadAsBytes()
- String getLocationOnDisk()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.Scanner
Type: Class

Methods:
- Class[] scanForClasses(Location, Class) throws Exception
- Resource[] scanForResources(Location, String, String) throws Exception

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.android

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.android.AndroidResource
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.Resource

Methods:
- String getLocation()
- String getFilename()
- String loadAsString(String)
- byte[] loadAsBytes()
- String getLocationOnDisk()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.android.AndroidScanner
Type: Class

Methods:
- Class[] scanForClasses(String, Class) throws Exception
- Resource[] scanForResources(String, String, String) throws Exception

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.ClassPathLocationScanner
Type: Interface

Methods:
- Set findResourceNames(String, URL) throws IOException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.UrlResolver
Type: Interface

Methods:
- URL toStandardJavaUrl(URL) throws IOException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.ClassPathResource
Type: Class
Implements: java.lang.Comparable, com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.Resource

Methods:
- String getLocation()
- String getFilename()
- String loadAsString(String)
- int hashCode()
- boolean equals(Object)
- byte[] loadAsBytes()
- boolean exists()
- int compareTo(ClassPathResource)
- int compareTo(Object)
- String getLocationOnDisk()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.ClassPathScanner
Type: Class

Methods:
- Class[] scanForClasses(String, Class) throws Exception
- Resource[] scanForResources(String, String, String) throws IOException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.DefaultUrlResolver
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.UrlResolver

Methods:
- URL toStandardJavaUrl(URL) throws IOException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.FileSystemClassPathLocationScanner
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.ClassPathLocationScanner

Methods:
- Set findResourceNames(String, URL) throws IOException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.JarFileClassPathLocationScanner
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.ClassPathLocationScanner

Methods:
- Set findResourceNames(String, URL) throws IOException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.OsgiClassPathLocationScanner
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.ClassPathLocationScanner

Methods:
- Set findResourceNames(String, URL) throws IOException

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.jboss

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.jboss.JBossVFSv2UrlResolver
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.UrlResolver

Methods:
- URL toStandardJavaUrl(URL) throws IOException

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.jboss.JBossVFSv3ClassPathLocationScanner
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.classpath.ClassPathLocationScanner

Methods:
- Set findResourceNames(String, URL) throws IOException

## Package: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.filesystem

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.filesystem.FileSystemResource
Type: Class
Implements: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.Resource, java.lang.Comparable

Methods:
- String getLocation()
- String getFilename()
- String loadAsString(String)
- byte[] loadAsBytes()
- int compareTo(FileSystemResource)
- int compareTo(Object)
- String getLocationOnDisk()

### Class: com.sk89q.worldguard.internal.flywaydb.core.internal.util.scanner.filesystem.FileSystemScanner
Type: Class

Methods:
- Resource[] scanForResources(String, String, String) throws IOException

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
- void setValues(PreparedStatement, String[]) throws SQLException
- String preparePlaceHolders(int)

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
- FailedLoadRegionSet getInstance()
- boolean isOwnerOfAll(LocalPlayer)
- Object queryValue(RegionAssociable, Flag)
- boolean isVirtual()
- boolean isMemberOfAll(LocalPlayer)
- Collection queryAllValues(RegionAssociable, Flag)

### Class: com.sk89q.worldguard.protection.FlagValueCalculator
Type: Class

Methods:
- int getPriorityOf(ProtectedRegion)
- Object queryMapValue(RegionAssociable, MapFlag, Object, Flag)
- Object getEffectiveFlag(ProtectedRegion, Flag, RegionAssociable)
- FlagValueCalculator$Result getMembership(RegionAssociable)
- Object getEffectiveMapValue(ProtectedRegion, MapFlag, Object, RegionAssociable)
- int getPriority(ProtectedRegion)
- StateFlag$State queryState(RegionAssociable, StateFlag[])
- StateFlag$State queryState(RegionAssociable, StateFlag)
- Object getEffectiveMapValueOf(ProtectedRegion, MapFlag, Object, RegionAssociable)
- Object queryValue(RegionAssociable, Flag)
- Object getEffectiveFlagOf(ProtectedRegion, Flag, RegionAssociable)
- Collection queryAllValues(RegionAssociable, Flag)

### Class: com.sk89q.worldguard.protection.PermissiveRegionSet
Type: Class
Extends: com.sk89q.worldguard.protection.AbstractRegionSet

Methods:
- Set getRegions()
- Object queryMapValue(RegionAssociable, MapFlag, Object)
- Object queryMapValue(RegionAssociable, MapFlag, Object, Flag)
- Iterator iterator()
- int size()
- PermissiveRegionSet getInstance()
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
- RegionResultSet fromSortedList(List, ProtectedRegion)
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
- RegionAssociable constant(Association)

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
- boolean isValidName(String)
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
- FlagContext$FlagContextBuilder create()
- Integer getUserInputAsInt() throws InvalidFlagFormat
- Actor getSender()
- void put(String, Object)

### Class: com.sk89q.worldguard.protection.flags.FlagUtil
Type: Class

Methods:
- Map marshal(Map)

### Class: com.sk89q.worldguard.protection.flags.Flags
Type: Class

Methods:
- void registerAll()
- Flag fuzzyMatchFlag(FlagRegistry, String)

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
- RegionGroup valueOf(String)
- RegionGroup[] values()

### Class: com.sk89q.worldguard.protection.flags.RegionGroupFlag
Type: Class
Extends: com.sk89q.worldguard.protection.flags.EnumFlag

Methods:
- RegionGroup detectValue(String)
- Enum detectValue(String)
- RegionGroup getDefault()
- Object getDefault()
- boolean isMember(ProtectedRegion, RegionGroup, LocalPlayer)
- boolean isMember(ApplicableRegionSet, RegionGroup, LocalPlayer)

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
- StateFlag$State allowOrNone(boolean)
- StateFlag$State parseInput(FlagContext) throws InvalidFlagFormat
- Object parseInput(FlagContext) throws InvalidFlagFormat
- StateFlag$State denyToNone(StateFlag$State)
- boolean test(StateFlag$State[])
- StateFlag$State unmarshal(Object)
- Object unmarshal(Object)
- boolean preventsAllowOnGlobal()
- Object marshal(StateFlag$State)
- Object marshal(Object)
- StateFlag$State getDefault()
- Object getDefault()
- StateFlag$State combine(StateFlag$State[])
- StateFlag$State combine(Collection)
- StateFlag$State chooseValue(Collection)
- Object chooseValue(Collection)
- boolean hasConflictStrategy()

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
- RemovalStrategy valueOf(String)
- RemovalStrategy[] values()

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

### Class: com.sk89q.worldguard.protection.managers.index.PriorityRTreeIndex
Type: Class
Extends: com.sk89q.worldguard.protection.managers.index.HashMapIndex

Methods:
- void applyIntersecting(ProtectedRegion, Predicate)
- void applyContaining(BlockVector3, Predicate)

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
- DriverType valueOf(String)
- DriverType[] values()

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
- void relinkParents(Map, Map)

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
- boolean isValidId(String)
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

### Class: com.sk89q.worldguard.protection.regions.RegionType
Type: Enum
Extends: java.lang.Enum

Methods:
- String getName()
- RegionType valueOf(String)
- RegionType[] values()

## Package: com.sk89q.worldguard.protection.util

### Class: com.sk89q.worldguard.protection.util.DomainInputResolver
Type: Class
Implements: java.util.concurrent.Callable

Methods:
- DefaultDomain call() throws UnresolvedNamesException
- Object call() throws Exception
- void setLocatorPolicy(DomainInputResolver$UserLocatorPolicy)
- UUID parseUUID(String)
- Function createAddAllFunction(DefaultDomain)
- DomainInputResolver$UserLocatorPolicy getLocatorPolicy()
- Function createRemoveAllFunction(DefaultDomain)

### Class: com.sk89q.worldguard.protection.util.NormativeOrders
Type: Class

Methods:
- List fromSet(Set)
- void sort(List)

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
- Region convertToRegion(ProtectedRegion)
- RegionSelector convertToSelector(ProtectedRegion)

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

### Class: com.sk89q.worldguard.session.MoveType
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean isTeleport()
- MoveType valueOf(String)
- boolean isCancellable()
- MoveType[] values()

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

### Class: com.sk89q.worldguard.session.handler.ExitFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

No public methods found

### Class: com.sk89q.worldguard.session.handler.FarewellFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- boolean onCrossBoundary(LocalPlayer, Location, Location, ApplicableRegionSet, Set, Set, MoveType)
- void initialize(LocalPlayer, Location, ApplicableRegionSet)

### Class: com.sk89q.worldguard.session.handler.FeedFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- void tick(LocalPlayer, ApplicableRegionSet)

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

### Class: com.sk89q.worldguard.session.handler.GodMode
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- boolean hasGodMode(LocalPlayer)
- boolean set(LocalPlayer, Session, boolean)
- StateFlag$State getInvincibility(LocalPlayer)
- void setGodMode(LocalPlayer, boolean)

### Class: com.sk89q.worldguard.session.handler.GreetingFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- boolean onCrossBoundary(LocalPlayer, Location, Location, ApplicableRegionSet, Set, Set, MoveType)

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

### Class: com.sk89q.worldguard.session.handler.HealFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- void tick(LocalPlayer, ApplicableRegionSet)

### Class: com.sk89q.worldguard.session.handler.InvincibilityFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

Methods:
- StateFlag$State getInvincibility(LocalPlayer)

### Class: com.sk89q.worldguard.session.handler.NotifyEntryFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

No public methods found

### Class: com.sk89q.worldguard.session.handler.NotifyExitFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

No public methods found

### Class: com.sk89q.worldguard.session.handler.TimeLockFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

No public methods found

### Class: com.sk89q.worldguard.session.handler.WaterBreathing
Type: Class
Extends: com.sk89q.worldguard.session.handler.Handler

Methods:
- boolean hasWaterBreathing()
- boolean set(LocalPlayer, Session, boolean)
- void setWaterBreathing(boolean)

### Class: com.sk89q.worldguard.session.handler.WeatherLockFlag
Type: Class
Extends: com.sk89q.worldguard.session.handler.FlagValueChangeHandler

No public methods found

## Package: com.sk89q.worldguard.util

### Class: com.sk89q.worldguard.util.ChangeTracked
Type: Interface

Methods:
- boolean isDirty()
- void setDirty(boolean)

### Class: com.sk89q.worldguard.util.Entities
Type: Class

Methods:
- boolean isIntensiveEntity(Entity)

### Class: com.sk89q.worldguard.util.Enums
Type: Class

Methods:
- Enum findFuzzyByValue(Class, String[])
- Enum findByValue(Class, String[])

### Class: com.sk89q.worldguard.util.Locations
Type: Class

Methods:
- boolean isDifferentBlock(Location, Location)

### Class: com.sk89q.worldguard.util.MathUtils
Type: Class

Methods:
- long checkedMultiply(long, long)

### Class: com.sk89q.worldguard.util.MessagingUtil
Type: Class

Methods:
- void sendStringToChat(LocalPlayer, String)
- void sendStringToTitle(LocalPlayer, String)

### Class: com.sk89q.worldguard.util.Normal
Type: Class

Methods:
- String getNormal()
- Normal normal(String)
- String getName()
- int hashCode()
- boolean equals(Object)
- String normalize(String)
- String toString()

### Class: com.sk89q.worldguard.util.SpongeUtil
Type: Class

Methods:
- void clearSpongeWater(World, int, int, int)
- void addSpongeWater(World, int, int, int)

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
- int msw(long)
- int lsw(long)
- long toLong(int, int)
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

## Package: com.sk89q.worldguard.util.concurrent

### Class: com.sk89q.worldguard.util.concurrent.EvenMoreExecutors
Type: Class

Methods:
- ExecutorService newBoundedCachedThreadPool(int, int, int)
- ExecutorService newBoundedCachedThreadPool(int, int, int, String)

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
- Closer create()
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
- void register(Logger, String)

## Package: com.sk89q.worldguard.util.profile

### Class: com.sk89q.worldguard.util.profile.Profile
Type: Class

Methods:
- Profile setName(String)
- String getName()
- int hashCode()
- boolean equals(Object)
- String toString()
- Profile setUniqueId(UUID)
- UUID getUniqueId()

## Package: com.sk89q.worldguard.util.profile.cache

### Class: com.sk89q.worldguard.util.profile.cache.ProfileCache
Type: Interface

Methods:
- ImmutableMap getAllPresent(Iterable)
- void putAll(Iterable)
- Profile getIfPresent(UUID)
- void put(Profile)

### Class: com.sk89q.worldguard.util.profile.cache.HashMapCache
Type: Class
Extends: com.sk89q.worldguard.util.profile.cache.AbstractProfileCache

Methods:
- ImmutableMap getAllPresent(Iterable)
- void putAll(Iterable)
- void put(Profile)
- Profile getIfPresent(UUID)

### Class: com.sk89q.worldguard.util.profile.cache.MySQLCache
Type: Class
Extends: com.sk89q.worldguard.util.profile.cache.AbstractProfileCache

Methods:
- void createTable() throws SQLException
- ImmutableMap getAllPresent(Iterable)
- String getTableName()
- void putAll(Iterable)
- MySQLCache create(DataSource) throws SQLException
- MySQLCache create(DataSource, String) throws SQLException
- MySQLCache create(Connection) throws SQLException
- MySQLCache create(Connection, String) throws SQLException
- void put(Profile)
- Profile getIfPresent(UUID)

### Class: com.sk89q.worldguard.util.profile.cache.SQLiteCache
Type: Class
Extends: com.sk89q.worldguard.util.profile.cache.AbstractProfileCache

Methods:
- ImmutableMap getAllPresent(Iterable)
- void putAll(Iterable)
- void put(Profile)
- Profile getIfPresent(UUID)

## Package: com.sk89q.worldguard.util.profile.resolver

### Class: com.sk89q.worldguard.util.profile.resolver.ProfileService
Type: Interface

Methods:
- Profile findByName(String) throws IOException, InterruptedException
- ImmutableList findAllByUuid(Iterable) throws IOException, InterruptedException
- void findAllByUuid(Iterable, Predicate) throws IOException, InterruptedException
- Profile findByUuid(UUID) throws IOException, InterruptedException
- ImmutableList findAllByName(Iterable) throws IOException, InterruptedException
- void findAllByName(Iterable, Predicate) throws IOException, InterruptedException
- int getIdealRequestLimit()

### Class: com.sk89q.worldguard.util.profile.resolver.BukkitPlayerService
Type: Class
Extends: com.sk89q.worldguard.util.profile.resolver.SingleRequestService

Methods:
- Profile findByName(String) throws IOException, InterruptedException
- BukkitPlayerService getInstance()
- ImmutableList findAllByUuid(Iterable) throws IOException, InterruptedException
- Profile findByUuid(UUID) throws IOException, InterruptedException
- int getIdealRequestLimit()

### Class: com.sk89q.worldguard.util.profile.resolver.CacheForwardingService
Type: Class
Implements: com.sk89q.worldguard.util.profile.resolver.ProfileService

Methods:
- Profile findByName(String) throws IOException, InterruptedException
- ImmutableList findAllByUuid(Iterable) throws IOException, InterruptedException
- void findAllByUuid(Iterable, Predicate) throws IOException, InterruptedException
- Profile findByUuid(UUID) throws IOException, InterruptedException
- ImmutableList findAllByName(Iterable) throws IOException, InterruptedException
- void findAllByName(Iterable, Predicate) throws IOException, InterruptedException
- int getIdealRequestLimit()

### Class: com.sk89q.worldguard.util.profile.resolver.CombinedProfileService
Type: Class
Implements: com.sk89q.worldguard.util.profile.resolver.ProfileService

Methods:
- Profile findByName(String) throws IOException, InterruptedException
- ImmutableList findAllByUuid(Iterable) throws IOException, InterruptedException
- void findAllByUuid(Iterable, Predicate) throws IOException, InterruptedException
- Profile findByUuid(UUID) throws IOException, InterruptedException
- ImmutableList findAllByName(Iterable) throws IOException, InterruptedException
- void findAllByName(Iterable, Predicate) throws IOException, InterruptedException
- int getIdealRequestLimit()

### Class: com.sk89q.worldguard.util.profile.resolver.HashMapService
Type: Class
Extends: com.sk89q.worldguard.util.profile.resolver.SingleRequestService

Methods:
- void putAll(Collection)
- Profile findByName(String) throws IOException, InterruptedException
- ImmutableList findAllByUuid(Iterable) throws IOException, InterruptedException
- Profile findByUuid(UUID) throws IOException, InterruptedException
- int getIdealRequestLimit()
- void put(Profile)

### Class: com.sk89q.worldguard.util.profile.resolver.HttpRepositoryService
Type: Class
Implements: com.sk89q.worldguard.util.profile.resolver.ProfileService

Methods:
- void setMaxRetries(int)
- ProfileService forMinecraft()
- Profile findByName(String) throws IOException, InterruptedException
- int getMaxRetries()
- long getRetryDelay()
- ImmutableList findAllByUuid(Iterable) throws IOException, InterruptedException
- void findAllByUuid(Iterable, Predicate) throws IOException, InterruptedException
- Profile findByUuid(UUID) throws IOException, InterruptedException
- void setRetryDelay(long)
- ImmutableList findAllByName(Iterable) throws IOException, InterruptedException
- void findAllByName(Iterable, Predicate) throws IOException, InterruptedException
- int getIdealRequestLimit()

### Class: com.sk89q.worldguard.util.profile.resolver.PaperPlayerService
Type: Class
Extends: com.sk89q.worldguard.util.profile.resolver.SingleRequestService

Methods:
- Profile findByName(String) throws IOException, InterruptedException
- PaperPlayerService getInstance()
- ImmutableList findAllByUuid(Iterable) throws IOException, InterruptedException
- Profile findByUuid(UUID) throws IOException, InterruptedException
- int getIdealRequestLimit()

### Class: com.sk89q.worldguard.util.profile.resolver.PaperProfileService
Type: Class
Extends: com.sk89q.worldguard.util.profile.resolver.SingleRequestService

Methods:
- Profile findByName(String) throws IOException, InterruptedException
- PaperProfileService getInstance()
- ImmutableList findAllByUuid(Iterable) throws IOException, InterruptedException
- Profile findByUuid(UUID) throws IOException, InterruptedException
- int getIdealRequestLimit()

### Class: com.sk89q.worldguard.util.profile.resolver.ParallelProfileService
Type: Class
Implements: com.sk89q.worldguard.util.profile.resolver.ProfileService

Methods:
- void setProfilesPerJob(int)
- int getProfilesPerJob()
- Profile findByName(String) throws IOException, InterruptedException
- ImmutableList findAllByUuid(Iterable) throws IOException, InterruptedException
- void findAllByUuid(Iterable, Predicate) throws IOException, InterruptedException
- Profile findByUuid(UUID) throws IOException, InterruptedException
- ImmutableList findAllByName(Iterable) throws IOException, InterruptedException
- void findAllByName(Iterable, Predicate) throws IOException, InterruptedException
- int getIdealRequestLimit()

## Package: com.sk89q.worldguard.util.profile.util

### Class: com.sk89q.worldguard.util.profile.util.HttpRequest
Type: Class
Implements: java.io.Closeable

Methods:
- HttpRequest request(String, URL)
- HttpRequest$BufferedResponse returnContent() throws IOException, InterruptedException
- HttpRequest expectResponseCode(int[]) throws IOException
- InputStream getInputStream()
- HttpRequest execute() throws IOException
- URL url(String)
- HttpRequest bodyForm(HttpRequest$Form)
- HttpRequest post(URL)
- int getResponseCode() throws IOException
- HttpRequest get(URL)
- HttpRequest header(String, String)
- void close() throws IOException
- HttpRequest saveContent(File) throws IOException, InterruptedException
- HttpRequest saveContent(OutputStream) throws IOException, InterruptedException
- HttpRequest bodyJson(Object) throws IOException

### Class: com.sk89q.worldguard.util.profile.util.UUIDs
Type: Class

Methods:
- String stripDashes(String)
- String addDashes(String)

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

## Package: org.khelekore.prtree

### Class: org.khelekore.prtree.DistanceCalculator
Type: Interface

Methods:
- double distanceTo(Object, PointND)

### Class: org.khelekore.prtree.MBR
Type: Interface

Methods:
- int getDimensions()
- double getMin(int)
- boolean intersects(MBR)
- boolean intersects(Object, MBRConverter)
- double getMax(int)
- MBR union(MBR)

### Class: org.khelekore.prtree.MBR2D
Type: Interface

Methods:
- boolean intersects(MBR2D)
- double getMaxX()
- double getMaxY()
- MBR2D union(MBR2D)
- double getMinX()
- double getMinY()

### Class: org.khelekore.prtree.MBRConverter
Type: Interface

Methods:
- int getDimensions()
- double getMin(int, Object)
- double getMax(int, Object)

### Class: org.khelekore.prtree.NodeFilter
Type: Interface

Methods:
- boolean accept(Object)

### Class: org.khelekore.prtree.PointND
Type: Interface

Methods:
- int getDimensions()
- double getOrd(int)

### Class: org.khelekore.prtree.DistanceResult
Type: Class

Methods:
- double getDistance()
- Object get()

### Class: org.khelekore.prtree.MinDist
Type: Class

Methods:
- double get(MBR, PointND)

### Class: org.khelekore.prtree.MinDist2D
Type: Class

Methods:
- double get(double, double, double, double, double, double)

### Class: org.khelekore.prtree.PRTree
Type: Class

Methods:
- int getHeight()
- void load(Collection)
- MBR2D getMBR2D()
- void find(double, double, double, double, List)
- void find(MBR, List)
- Iterable find(double, double, double, double)
- Iterable find(MBR)
- boolean isEmpty()
- List nearestNeighbour(DistanceCalculator, NodeFilter, int, PointND)
- int getNumberOfLeaves()
- MBR getMBR()

### Class: org.khelekore.prtree.SimpleMBR
Type: Class
Implements: org.khelekore.prtree.MBR

Methods:
- int getDimensions()
- double getMin(int)
- boolean intersects(MBR)
- boolean intersects(Object, MBRConverter)
- double getMax(int)
- String toString()
- MBR union(MBR)

### Class: org.khelekore.prtree.SimpleMBR2D
Type: Class
Implements: org.khelekore.prtree.MBR2D

Methods:
- boolean intersects(MBR2D)
- double getMaxX()
- double getMaxY()
- String toString()
- MBR2D union(MBR2D)
- double getMinX()
- double getMinY()

### Class: org.khelekore.prtree.SimplePointND
Type: Class
Implements: org.khelekore.prtree.PointND

Methods:
- int getDimensions()
- double getOrd(int)

