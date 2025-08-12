# Multiverse-Core 5.2.0 API Reference

## 🚨 CRITICAL: MULTIVERSE USES INTERNAL VAVR SHADING! 🚨

**MULTIVERSE-CORE USES org.mvplugins.multiverse.external.vavr NOT io.vavr!**
**DO NOT IMPORT io.vavr - USE MULTIVERSE'S SHADED VERSION!**

### CORRECT Import Statements (USE THESE!):
import org.mvplugins.multiverse.external.vavr.control.Option;
import org.mvplugins.multiverse.external.vavr.control.Try;
import org.mvplugins.multiverse.external.vavr.control.Either;
// NO VAVR List - use java.util.List instead!

### Main Multiverse Imports:
import org.mvplugins.multiverse.core.MultiverseCoreApi;
import org.mvplugins.multiverse.core.world.WorldManager;
import org.mvplugins.multiverse.core.world.MultiverseWorld;
import org.mvplugins.multiverse.core.world.LoadedMultiverseWorld;
import org.mvplugins.multiverse.core.world.AllowedPortalType;
import org.mvplugins.multiverse.core.world.entity.EntitySpawnConfig;
import org.mvplugins.multiverse.core.world.entity.SpawnCategoryConfig;
import org.mvplugins.multiverse.core.world.entity.EntityPurger;
import org.mvplugins.multiverse.core.world.location.SpawnLocation;
import org.mvplugins.multiverse.core.world.location.NullSpawnLocation;
import org.mvplugins.multiverse.core.world.location.UnloadedWorldLocation;
import org.mvplugins.multiverse.core.world.options.*;
import org.mvplugins.multiverse.core.world.reasons.*;
import org.mvplugins.multiverse.core.world.helpers.*;
import org.mvplugins.multiverse.core.world.entrycheck.*;
import org.mvplugins.multiverse.core.world.generators.*;
import org.mvplugins.multiverse.core.world.biomeprovider.*;
import org.mvplugins.multiverse.core.anchor.AnchorManager;
import org.mvplugins.multiverse.core.anchor.MultiverseAnchor;
import org.mvplugins.multiverse.core.config.CoreConfig;
import org.mvplugins.multiverse.core.config.handle.StringPropertyHandle;
import org.mvplugins.multiverse.core.config.handle.PropertyModifyAction;
import org.mvplugins.multiverse.core.destination.DestinationsProvider;
import org.mvplugins.multiverse.core.destination.Destination;
import org.mvplugins.multiverse.core.destination.DestinationInstance;
import org.mvplugins.multiverse.core.destination.DestinationSuggestionPacket;
import org.mvplugins.multiverse.core.destination.core.*;
import org.mvplugins.multiverse.core.economy.MVEconomist;
import org.mvplugins.multiverse.core.event.*;
import org.mvplugins.multiverse.core.event.world.*;
import org.mvplugins.multiverse.core.inject.PluginServiceLocator;
import org.mvplugins.multiverse.core.locale.message.Message;
import org.mvplugins.multiverse.core.locale.message.MessageReplacement;
import org.mvplugins.multiverse.core.locale.message.LocalizedMessage;
import org.mvplugins.multiverse.core.permissions.CorePermissions;
import org.mvplugins.multiverse.core.permissions.CorePermissionsChecker;
import org.mvplugins.multiverse.core.teleportation.AsyncSafetyTeleporter;
import org.mvplugins.multiverse.core.teleportation.AsyncSafetyTeleporterAction;
import org.mvplugins.multiverse.core.teleportation.BlockSafety;
import org.mvplugins.multiverse.core.teleportation.LocationManipulation;
import org.mvplugins.multiverse.core.teleportation.PassengerMode;
import org.mvplugins.multiverse.core.teleportation.PassengerModes;
import org.mvplugins.multiverse.core.teleportation.TeleportFailureReason;
import org.mvplugins.multiverse.core.teleportation.TeleportQueue;
import org.mvplugins.multiverse.core.utils.result.Attempt;
import org.mvplugins.multiverse.core.utils.result.AsyncAttempt;
import org.mvplugins.multiverse.core.utils.result.AsyncAttemptsAggregate;
import org.mvplugins.multiverse.core.utils.result.AttemptsAggregate;
import org.mvplugins.multiverse.core.utils.result.Result;
import org.mvplugins.multiverse.core.utils.result.ResultChain;
import org.mvplugins.multiverse.core.utils.result.FailureReason;
import org.mvplugins.multiverse.core.utils.result.SuccessReason;

## PACKAGE STRUCTURE

org.mvplugins.multiverse.core - Main API classes
org.mvplugins.multiverse.core.anchor - Anchor system
org.mvplugins.multiverse.core.command - Command handling (internal use)
org.mvplugins.multiverse.core.config - Configuration classes
org.mvplugins.multiverse.core.config.handle - Config property handling
org.mvplugins.multiverse.core.destination - Destination system
org.mvplugins.multiverse.core.destination.core - Built-in destinations
org.mvplugins.multiverse.core.economy - Economy integration
org.mvplugins.multiverse.core.event - Multiverse events
org.mvplugins.multiverse.core.event.world - World-specific events
org.mvplugins.multiverse.core.inject - Dependency injection
org.mvplugins.multiverse.core.locale.message - Message formatting
org.mvplugins.multiverse.core.permissions - Permission handling
org.mvplugins.multiverse.core.teleportation - Teleportation system
org.mvplugins.multiverse.core.utils.result - Result types
org.mvplugins.multiverse.core.world - World management
org.mvplugins.multiverse.core.world.biomeprovider - Biome providers
org.mvplugins.multiverse.core.world.entity - Entity management
org.mvplugins.multiverse.core.world.entrycheck - World entry checks
org.mvplugins.multiverse.core.world.generators - World generators
org.mvplugins.multiverse.core.world.helpers - Helper classes
org.mvplugins.multiverse.core.world.location - Location classes
org.mvplugins.multiverse.core.world.options - World operation options
org.mvplugins.multiverse.core.world.reasons - Failure/success reasons

## COMPLETE CLASS REFERENCE

### Class: MultiverseCoreApi
Package: org.mvplugins.multiverse.core
Type: Class

Static Methods:
- public static MultiverseCoreApi get() // Throws IllegalStateException if not loaded
- public static boolean isLoaded()
- public static void whenLoaded(Consumer<MultiverseCoreApi> consumer)

Instance Methods:
- public WorldManager getWorldManager()
- public AnchorManager getAnchorManager()
- public DestinationsProvider getDestinationsProvider()
- public AsyncSafetyTeleporter getSafetyTeleporter()
- public BlockSafety getBlockSafety()
- public LocationManipulation getLocationManipulation()
- public MVEconomist getMVEconomist()
- public CoreConfig getCoreConfig()
- public BiomeProviderFactory getBiomeProviderFactory()
- public GeneratorProvider getGeneratorProvider()
- public PluginServiceLocator getServiceLocator()

### Class: WorldManager
Package: org.mvplugins.multiverse.core.world
Type: Class

World Operations (return Attempt<T, F>):
- public Attempt<LoadedMultiverseWorld, CreateFailureReason> createWorld(CreateWorldOptions options)
- public Attempt<LoadedMultiverseWorld, ImportFailureReason> importWorld(ImportWorldOptions options)
- public Attempt<LoadedMultiverseWorld, LoadFailureReason> loadWorld(LoadWorldOptions options)
- public Attempt<MultiverseWorld, UnloadFailureReason> unloadWorld(UnloadWorldOptions options)
- public Attempt<MultiverseWorld, RemoveFailureReason> removeWorld(RemoveWorldOptions options)
- public Attempt<LoadedMultiverseWorld, RegenFailureReason> regenWorld(RegenWorldOptions options)
- public Attempt<LoadedMultiverseWorld, CloneFailureReason> cloneWorld(CloneWorldOptions options)
- public Attempt<MultiverseWorld, DeleteFailureReason> deleteWorld(DeleteWorldOptions options)

World Getters (return org.mvplugins.multiverse.external.vavr.control.Option<T>):
- public Option<MultiverseWorld> getWorld(String worldName)
- public Option<MultiverseWorld> getWorld(World bukkitWorld)
- public Option<MultiverseWorld> getWorldByNameOrAlias(String nameOrAlias)
- public Option<LoadedMultiverseWorld> getLoadedWorld(String worldName)
- public Option<LoadedMultiverseWorld> getLoadedWorld(World bukkitWorld)
- public Option<LoadedMultiverseWorld> getLoadedWorld(MultiverseWorld world)
- public Option<LoadedMultiverseWorld> getLoadedWorldByNameOrAlias(String nameOrAlias)
- public Option<MultiverseWorld> getUnloadedWorld(String worldName)
- public Option<MultiverseWorld> getUnloadedWorldByNameOrAlias(String nameOrAlias)
- public Option<LoadedMultiverseWorld> getDefaultWorld()

Collection Methods (return java.util.Collection):
- public Collection<MultiverseWorld> getWorlds()
- public Collection<LoadedMultiverseWorld> getLoadedWorlds()
- public Collection<MultiverseWorld> getUnloadedWorlds()
- public List<String> getPotentialWorlds()

Check Methods:
- public boolean isWorld(String worldName)
- public boolean isLoadedWorld(String worldName)
- public boolean isLoadedWorld(World bukkitWorld)
- public boolean isLoadedWorld(MultiverseWorld world)
- public boolean isUnloadedWorld(String worldName)

Config Methods:
- public Try<Void> initAllWorlds()
- public Try<Void> saveWorldsConfig()

### Class: MultiverseWorld
Package: org.mvplugins.multiverse.core.world
Type: Class
Fields:
- protected String worldName
- protected MultiverseWorldConfig config

Basic Properties:
- public String getName()
- public String getAlias()
- public Try<Void> setAlias(String alias)
- public String getAliasOrName()
- public String getColourlessAlias()
- public String getTabCompleteName()
- public World.Environment getEnvironment()
- public String getGenerator()
- public long getSeed()
- public String getBiome()
- public boolean isLoaded()
- public String toString()

Game Settings:
- public GameMode getGameMode()
- public Try<Void> setGameMode(GameMode mode)
- public Difficulty getDifficulty()
- public Try<Void> setDifficulty(Difficulty difficulty)
- public boolean getPvp()
- public Try<Void> setPvp(boolean pvp)

World Behavior:
- public boolean isAutoLoad()
- public Try<Void> setAutoLoad(boolean autoLoad)
- public boolean getAdjustSpawn()
- public Try<Void> setAdjustSpawn(boolean adjustSpawn)
- public boolean isKeepSpawnInMemory()
- public Try<Void> setKeepSpawnInMemory(boolean keepInMemory)
- public boolean isHidden()
- public Try<Void> setHidden(boolean hidden)

Weather/Environment:
- public boolean isAllowWeather()
- public Try<Void> setAllowWeather(boolean allowWeather)
- public boolean isAllowFlight()
- public Try<Void> setAllowFlight(boolean allowFlight)
- public boolean isAllowAdvancementGrant()
- public Try<Void> setAllowAdvancementGrant(boolean allowAdvancement)

Spawn/Respawn:
- public Location getSpawnLocation()
- public Try<Void> setSpawnLocation(Location location)
- public String getRespawnWorldName()
- public World getRespawnWorld()
- public Try<Void> setRespawnWorld(String worldName)
- public Try<Void> setRespawnWorld(World world)
- public Try<Void> setRespawnWorld(MultiverseWorld world)
- public boolean getBedRespawn()
- public Try<Void> setBedRespawn(boolean bedRespawn)
- public boolean getAnchorRespawn()
- public Try<Void> setAnchorSpawn(boolean anchorSpawn)

Player Settings:
- public boolean getAutoHeal()
- public Try<Void> setAutoHeal(boolean autoHeal)
- public boolean isHunger()
- public Try<Void> setHunger(boolean hunger)
- public int getPlayerLimit()
- public Try<Void> setPlayerLimit(int limit)

Economy:
- public double getPrice()
- public Try<Void> setPrice(double price)
- public Material getCurrency()
- public Try<Void> setCurrency(Material currency)
- public boolean isEntryFeeEnabled()
- public Try<Void> setEntryFeeEnabled(boolean enabled)

Portal/Scale:
- public AllowedPortalType getPortalForm()
- public Try<Void> setPortalForm(AllowedPortalType type)
- public double getScale()
- public Try<Void> setScale(double scale)

Blacklist/Entity:
- public List<String> getWorldBlacklist()
- public Try<Void> setWorldBlacklist(List<String> blacklist)
- public EntitySpawnConfig getEntitySpawnConfig()
- public Try<Void> setEntitySpawnConfig(EntitySpawnConfig config)

Property Handle:
- public StringPropertyHandle getStringPropertyHandle()

### Class: LoadedMultiverseWorld
Package: org.mvplugins.multiverse.core.world
Type: Class
Extends: MultiverseWorld

Additional Methods:
- public Option<World> getBukkitWorld()
- public UUID getUID()
- public Option<List<Player>> getPlayers()
- public Option<WorldBorder> getWorldBorder()
- public Option<WorldType> getWorldType()
- public Option<Boolean> canGenerateStructures()
- public String toString()

### Enum: AllowedPortalType
Package: org.mvplugins.multiverse.core.world
Type: Enum

Constants:
- ALL
- NETHER
- END
- NONE

Methods:
- public PortalType getActualPortalType()
- public boolean isPortalAllowed(PortalType type)

### Class: AnchorManager
Package: org.mvplugins.multiverse.core.anchor
Type: Class

Methods:
- public Try<Void> setAnchor(String name, Location location)
- public Try<Void> setAnchor(String name, String locationString)
- public Option<MultiverseAnchor> getAnchor(String name)
- public List<MultiverseAnchor> getAllAnchors()
- public List<MultiverseAnchor> getAnchors(Player player)
- public Try<Void> deleteAnchor(MultiverseAnchor anchor)
- public Try<Void> loadAnchors()
- public Try<Void> saveAllAnchors()

### Class: MultiverseAnchor
Package: org.mvplugins.multiverse.core.anchor
Type: Class

Methods:
- public String getName()
- public Location getLocation()

### Class: AsyncSafetyTeleporter
Package: org.mvplugins.multiverse.core.teleportation
Type: Class

Methods:
- public AsyncSafetyTeleporterAction to(Location location)
- public AsyncSafetyTeleporterAction to(DestinationInstance<?, ?> destination)

### Class: AsyncSafetyTeleporterAction
Package: org.mvplugins.multiverse.core.teleportation
Type: Class

Methods:
- public AsyncSafetyTeleporterAction by(CommandSender sender)
- public AsyncSafetyTeleporterAction by(BukkitCommandIssuer issuer)
- public AsyncSafetyTeleporterAction checkSafety(boolean check)
- public AsyncSafetyTeleporterAction passengerMode(PassengerMode mode)
- public AsyncAttemptsAggregate<Void, TeleportFailureReason> teleport(List<Entity> entities)
- public AsyncAttemptsAggregate<Void, TeleportFailureReason> teleportSingle(Entity entity)
- @Deprecated public AsyncAttempt<Void, TeleportFailureReason> teleport(Entity entity)

### Enum: TeleportFailureReason
Package: org.mvplugins.multiverse.core.teleportation
Type: Enum
Implements: FailureReason

Constants:
- NULL_DESTINATION
- NULL_LOCATION
- NULL_WORLD
- UNSAFE_LOCATION
- EVENT_CANCELLED
- TELEPORT_FAILED
- TELEPORT_FAILED_EXCEPTION

Methods:
- public MessageKey getMessageKey()

### Enum: PassengerModes
Package: org.mvplugins.multiverse.core.teleportation
Type: Enum
Implements: PassengerMode

Constants:
- DEFAULT
- RETAIN_ALL
- RETAIN_PASSENGERS
- RETAIN_VEHICLE
- DISMOUNT_ALL
- DISMOUNT_PASSENGERS
- DISMOUNT_VEHICLE

Methods:
- public boolean isPassengersFollow()
- public boolean isDismountPassengers()
- public boolean isVehicleFollow()
- public boolean isDismountVehicle()

### Class: BlockSafety
Package: org.mvplugins.multiverse.core.teleportation
Type: Class

Methods:
- public Location findSafeSpawnLocation(Location location)
- public Location findSafeSpawnLocation(Location location, int horizontalRadius, int verticalRadius)
- public Block findSafeSpawnBlock(Block block)
- public Block findSafeSpawnBlock(Block block, int horizontalRadius, int verticalRadius)
- public Location findPortalBlockNextTo(Location location)
- public Location getTopBlock(Location location)
- public Location getBottomBlock(Location location)
- public boolean canSpawnAtLocationSafely(Location location)
- public boolean canSpawnAtBlockSafely(Block block)
- public boolean isBlockAboveAir(Location location)
- public boolean canSpawnVehicleSafely(Vehicle vehicle)
- public boolean canSpawnCartSafely(Minecart minecart)
- public boolean isEntityOnTrack(Location location)

### Class: LocationManipulation
Package: org.mvplugins.multiverse.core.teleportation
Type: Class

Methods:
- public Location getBlockLocation(Location location)
- public String locationToString(Location location)
- public Location stringToLocation(String locationString)
- public String strCoords(Location location)
- public String strCoordsRaw(Location location)
- public String getDirection(Location location)
- public float getYaw(String direction)
- public float getSpeed(Vector vector)
- public Vector getTranslatedVector(Vector vector, String direction)
- public Location getNextBlock(Vehicle vehicle)

### Class: TeleportQueue
Package: org.mvplugins.multiverse.core.teleportation
Type: Class

Methods:
- public void addToQueue(CommandSender sender, Player target)
- public void addToQueue(String playerName, String targetName)
- public Option<String> popFromQueue(String playerName)

### Class: DestinationsProvider
Package: org.mvplugins.multiverse.core.destination
Type: Class

Methods:
- public Attempt<DestinationInstance<?, ?>, ParseFailureReason> parseDestination(String destination)
- public Attempt<DestinationInstance<?, ?>, ParseFailureReason> parseDestination(CommandSender sender, String destination)
- public Collection<DestinationSuggestionPacket> suggestDestinations(CommandSender sender, String partial)
- public Collection<String> suggestDestinationStrings(CommandSender sender, String partial)
- public void registerDestination(Destination<?, ?, ?> destination)
- public Collection<Destination<?, ?, ?>> getDestinations()
- public Destination<?, ?, ?> getDestinationById(String id)

### Enum: ParseFailureReason
Package: org.mvplugins.multiverse.core.destination.DestinationsProvider
Type: Enum

Constants:
- INVALID_DESTINATION_ID

### Class: DestinationInstance
Package: org.mvplugins.multiverse.core.destination
Type: Abstract Class

Fields:
- protected final Destination<?, ?, ?> destination

Methods:
- public Option<Location> getLocation(Entity entity)
- public Option<Vector> getVelocity(Entity entity)
- public Option<String> getFinerPermissionSuffix()
- public Destination<?, ?, ?> getDestination()
- public String getIdentifier()
- public boolean checkTeleportSafety()
- public String toString()
- public String serialise()

### Class: DestinationSuggestionPacket
Package: org.mvplugins.multiverse.core.destination
Type: Record

Components:
- Destination<?, ?, ?> destination
- String destinationString
- String finerPermissionSuffix

Methods:
- public String parsableString()
- public Destination<?, ?, ?> destination()
- public String destinationString()
- public String finerPermissionSuffix()

### Built-in Destination Classes
Package: org.mvplugins.multiverse.core.destination.core

AnchorDestination, BedDestination, CannonDestination, ExactDestination, PlayerDestination, WorldDestination
Each has:
- InstanceFailureReason enum with specific failure constants
- getDestinationInstance(CommandSender sender, String params) method
- suggestDestinations(CommandSender sender, String partial) method
- getIdentifier() method

### Class: CoreConfig
Package: org.mvplugins.multiverse.core.config
Type: Class

Key Methods:
- public boolean isLoaded()
- public Try<Void> load()
- public Try<Void> save()
- public FileConfiguration getConfig()
- public StringPropertyHandle getStringPropertyHandle()
- public int getGlobalDebug()
- public Try<Void> setGlobalDebug(int level)
- public boolean getSilentStart()
- public Try<Void> setSilentStart(boolean silent)
- public boolean getFirstSpawnOverride()
- public Try<Void> setFirstSpawnOverride(boolean override)
- public String getFirstSpawnLocation()
- public Try<Void> setFirstSpawnLocation(String location)
- public boolean getTeleportIntercept()
- public Try<Void> setTeleportIntercept(boolean intercept)
- public boolean getEnforceAccess()
- public Try<Void> setEnforceAccess(boolean enforce)
- public boolean getEnforceGameMode()
- public Try<Void> setEnforceGameMode(boolean enforce)
- public boolean getEnforceFlight()
- public Try<Void> setEnforceFlight(boolean enforce)
- public boolean getAutoImportDefaultWorlds()
- public Try<Void> setAutoImportDefaultWorlds(boolean autoImport)
- public boolean getAutoImport3rdPartyWorlds()
- public Try<Void> setAutoImport3rdPartyWorlds(boolean autoImport)
- public boolean isAutoPurgeEntities()
- public Try<Void> setAutoPurgeEntities(boolean autoPurge)
- public boolean isUsingCustomPortalSearch()
- public Try<Void> setUseCustomPortalSearch(boolean useCustom)
- public int getCustomPortalSearchRadius()
- public Try<Void> setCustomPortalSearchRadius(int radius)
- public PassengerMode getPassengerMode()
- public Try<Void> setPassengerMode(PassengerModes mode)
- public int getConcurrentTeleportLimit()
- public Try<Void> setConcurrentTeleportLimit(int limit)

### Class: StringPropertyHandle
Package: org.mvplugins.multiverse.core.config.handle
Type: Class

Methods:
- public Try<Object> getProperty(String name)
- public Try<Void> setProperty(String name, Object value)
- public Try<Void> setPropertyString(String name, String value)
- public Try<Void> setPropertyString(CommandSender sender, String name, String value)
- public Try<Void> addProperty(String name, Object value)
- public Try<Void> addPropertyString(String name, String value)
- public Try<Void> addPropertyString(CommandSender sender, String name, String value)
- public Try<Void> removeProperty(String name, Object value)
- public Try<Void> removePropertyString(String name, String value)
- public Try<Void> removePropertyString(CommandSender sender, String name, String value)
- public Try<Void> modifyProperty(String name, Object value, PropertyModifyAction action)
- public Try<Void> modifyPropertyString(String name, String value, PropertyModifyAction action)
- public Try<Void> modifyPropertyString(CommandSender sender, String name, String value, PropertyModifyAction action)
- public Try<Void> resetProperty(String name)
- public Try<Class<?>> getPropertyType(String name)
- public Collection<String> getAllPropertyNames()
- public Collection<String> getModifiablePropertyNames(PropertyModifyAction action)
- public Collection<String> getSuggestedPropertyValue(String name, String value, PropertyModifyAction action)
- public Collection<String> getSuggestedPropertyValue(String name, String value, PropertyModifyAction action, CommandSender sender)

### Enum: PropertyModifyAction
Package: org.mvplugins.multiverse.core.config.handle
Type: Enum

Constants:
- SET
- ADD
- REMOVE
- RESET

Methods:
- public boolean isRequireValue()

### Class: MVEconomist
Package: org.mvplugins.multiverse.core.economy
Type: Class

Methods:
- public boolean isUsingEconomyPlugin()
- public String getEconomyName()
- public double getBalance(Player player)
- public double getBalance(Player player, World world)
- public void setBalance(Player player, double amount)
- public void setBalance(Player player, World world, double amount)
- public void deposit(Player player, double amount, Material currency)
- public void withdraw(Player player, double amount, Material currency)
- public void payEntryFee(Player player, MultiverseWorld world)
- public void payEntryFee(Player player, double amount, Material currency)
- public boolean isPlayerWealthyEnough(Player player, double amount, Material currency)
- public String formatPrice(double amount, Material currency)
- public String getNSFMessage(Material currency, String playerName)
- public static boolean isItemCurrency(Material material)

### Class: EntitySpawnConfig
Package: org.mvplugins.multiverse.core.world.entity
Type: Class

Methods:
- public void setWorldRef(MultiverseWorld world)
- public void applyConfigToWorld()
- public SpawnCategoryConfig getSpawnCategoryConfig(SpawnCategory category)
- public boolean shouldAllowSpawn(Entity entity)
- public ConfigurationSection toSection()
- public static EntitySpawnConfig fromSection(ConfigurationSection section)
- public String toString()

### Class: SpawnCategoryConfig
Package: org.mvplugins.multiverse.core.world.entity
Type: Class

Methods:
- public SpawnCategory getSpawnCategory()
- public boolean isSpawn()
- public Try<Void> setSpawn(boolean spawn)
- public int getSpawnLimit()
- public Try<Void> setSpawnLimit(int limit)
- public int getTickRate()
- public Try<Void> setTickRate(int tickRate)
- public List<EntityType> getExceptions()
- public Try<Void> setExceptions(List<EntityType> exceptions)
- public boolean shouldAllowSpawn(Entity entity)
- public boolean shouldAllowSpawn(EntityType entityType)
- public StringPropertyHandle getStringPropertyHandle()
- public String toString()

### Class: EntityPurger
Package: org.mvplugins.multiverse.core.world.entity
Type: Class

Methods:
- public int purgeEntities(LoadedMultiverseWorld world)
- public int purgeEntities(LoadedMultiverseWorld world, SpawnCategory category)
- public int purgeEntities(LoadedMultiverseWorld world, SpawnCategory... categories)
- public int purgeAllEntities(LoadedMultiverseWorld world)

### Class: WorldEntryChecker
Package: org.mvplugins.multiverse.core.world.entrycheck
Type: Class

Methods:
- public Result<WorldAccessResult.Success, WorldAccessResult.Failure> canAccessWorld(MultiverseWorld world)
- public Result<EntryFeeResult.Success, EntryFeeResult.Failure> canPayEntryFee(MultiverseWorld world)
- public Result<BlacklistResult.Success, BlacklistResult.Failure> isNotBlacklisted(MultiverseWorld fromWorld, MultiverseWorld toWorld)
- public Result<PlayerLimitResult.Success, PlayerLimitResult.Failure> isWithinPlayerLimit(LoadedMultiverseWorld world)
- public ResultChain canEnterWorld(MultiverseWorld world, LoadedMultiverseWorld fromWorld)
- public ResultChain canStayInWorld(LoadedMultiverseWorld world)

### Class: WorldEntryCheckerProvider
Package: org.mvplugins.multiverse.core.world.entrycheck
Type: Class

Methods:
- public WorldEntryChecker forSender(CommandSender sender)

### Entry Check Result Enums
Package: org.mvplugins.multiverse.core.world.entrycheck

WorldAccessResult.Success: HAS_WORLD_ACCESS, NO_ENFORCE_WORLD_ACCESS
WorldAccessResult.Failure: NO_WORLD_ACCESS

EntryFeeResult.Success: FREE_ENTRY, ENOUGH_MONEY, EXEMPT_FROM_ENTRY_FEE, CONSOLE_OR_BLOCK_COMMAND_SENDER
EntryFeeResult.Failure: NOT_ENOUGH_MONEY, CANNOT_PAY_ENTRY_FEE

BlacklistResult.Success: NOT_BLACKLISTED, BYPASSED_BLACKLISTED, UNKNOWN_FROM_WORLD
BlacklistResult.Failure: BLACKLISTED

PlayerLimitResult.Success: NO_PLAYERLIMIT, WITHIN_PLAYERLIMIT, BYPASS_PLAYERLIMIT
PlayerLimitResult.Failure: EXCEED_PLAYERLIMIT

### Class: GeneratorProvider
Package: org.mvplugins.multiverse.core.world.generators
Type: Class

Methods:
- public boolean registerGeneratorPlugin(GeneratorPlugin plugin)
- public boolean unregisterGeneratorPlugin(String pluginName)
- public boolean isGeneratorPluginRegistered(String pluginName)
- public GeneratorPlugin getGeneratorPlugin(String pluginName)
- public Collection<GeneratorPlugin> getRegisteredGeneratorPlugins()
- public String getDefaultGeneratorForWorld(String worldName)
- public String parseGeneratorString(String generator, String worldName)
- public Collection<String> suggestGeneratorString(String partial)

### Interface: GeneratorPlugin
Package: org.mvplugins.multiverse.core.world.generators
Type: Interface

Methods:
- public String getPluginName()
- public String getInfoLink()
- public Collection<String> suggestIds(String partial)
- public Collection<String> getExampleUsages()

### Class: BiomeProviderFactory
Package: org.mvplugins.multiverse.core.world.biomeprovider
Type: Class

Methods:
- public void registerBiomeProviderParser(String id, BiomeProviderParser parser)
- public BiomeProvider parseBiomeProvider(String biomeString, String worldName)
- public Collection<String> suggestBiomeString(String partial)

### Interface: BiomeProviderParser
Package: org.mvplugins.multiverse.core.world.biomeprovider
Type: Interface

Methods:
- public BiomeProvider parseBiomeProvider(String biomeString, String worldName)
- public Collection<String> suggestParams(String partial)

### Helper Classes
Package: org.mvplugins.multiverse.core.world.helpers

Class: WorldNameChecker
Methods:
- public NameStatus checkName(String worldName)
- public FolderStatus checkFolder(String worldName)
- public FolderStatus checkFolder(File folder)
- public boolean isValidWorldName(String name)
- public boolean hasWorldFolder(String name)
- public boolean isValidWorldFolder(String name)
- public boolean isValidWorldFolder(File folder)

Enum: NameStatus
Constants: VALID, EMPTY, INVALID_CHARS, BLACKLISTED

Enum: FolderStatus
Constants: VALID, DOES_NOT_EXIST, NOT_A_WORLD

Class: DimensionFinder
Methods:
- public boolean isOverworld(MultiverseWorld world)
- public boolean isNether(MultiverseWorld world)
- public boolean isEnd(MultiverseWorld world)
- public Option<MultiverseWorld> getOverworldWorld(MultiverseWorld world)
- public Option<MultiverseWorld> getNetherWorld(MultiverseWorld world)
- public Option<MultiverseWorld> getEndWorld(MultiverseWorld world)

Class: DimensionFinder.DimensionFormat
Fields:
- public static final String OVERWORLD_PLACEHOLDER
Methods:
- public String getFormat()
- public String replaceOverworld(String overworldName)
- public Option<String> getOverworldFromName(String dimensionName)
- public String toString()

Class: EnforcementHandler
Methods:
- public void handleGameModeEnforcement(Player player)
- public void handleFlightEnforcement(Player player)
- public void handleAllGameModeEnforcement(LoadedMultiverseWorld world)
- public void handleAllFlightEnforcement(LoadedMultiverseWorld world)

Class: PlayerWorldTeleporter
Methods:
- public AsyncAttemptsAggregate<Void, TeleportFailureReason> teleportPlayersToWorld(List<Player> players, MultiverseWorld world)
- public AsyncAttemptsAggregate<Void, TeleportFailureReason> transferFromWorldTo(LoadedMultiverseWorld fromWorld, MultiverseWorld toWorld)
- public AsyncAttemptsAggregate<Void, TeleportFailureReason> transferFromWorldTo(LoadedMultiverseWorld fromWorld, World toWorld)
- public AsyncAttemptsAggregate<Void, TeleportFailureReason> transferAllFromWorldToLocation(LoadedMultiverseWorld fromWorld, Location location)
- public AsyncAttemptsAggregate<Void, TeleportFailureReason> removeFromWorld(LoadedMultiverseWorld world)

Class: DataTransfer<T>
Methods:
- public DataTransfer<T> addDataStore(DataStore<T> dataStore, T source)
- public DataTransfer<T> pasteAllTo(T target)

Interface: DataStore<T>
Methods:
- public DataStore<T> copyFrom(T source)
- public DataStore<T> pasteTo(T target)

Implementations:
- DataStore.GameRulesStore
- DataStore.WorldBorderStore
- DataStore.WorldConfigStore

### Location Classes
Package: org.mvplugins.multiverse.core.world.location

Class: SpawnLocation
Extends: Location
Implements: ConfigurationSerializable
Methods:
- public Location toBukkitLocation()
- public Map<String, Object> serialize()
- public static SpawnLocation deserialize(Map<String, Object> args)
- public SpawnLocation clone()
- public World getWorld()
- public void setWorld(World world)
- public Block getBlock()
- public Chunk getChunk()
- public String toString()

Class: NullSpawnLocation
Extends: SpawnLocation
Methods:
- public static NullSpawnLocation get()
- public Vector toVector()
- public NullSpawnLocation clone()
- public Map<String, Object> serialize()
- public static NullSpawnLocation deserialize(Map<String, Object> args)
- public String toString()
- public int hashCode()
- public boolean equals(Object obj)

Class: UnloadedWorldLocation
Extends: Location
Methods:
- public String getWorldName()
- public void setWorldName(String worldName)
- public World getWorld()
- public void setWorld(World world)
- public Location toBukkitLocation()
- public static UnloadedWorldLocation fromLocation(Location location)
- public Map<String, Object> serialize()
- public static Location deserialize(Map<String, Object> args)
- public String toString()
- public int hashCode()
- public boolean equals(Object obj)

### Permission Classes
Package: org.mvplugins.multiverse.core.permissions

Class: CorePermissions
Methods:
- public Try<Void> addWorldPermissions(MultiverseWorld world)
- public Try<Void> removeWorldPermissions(MultiverseWorld world)
- public Try<Void> addDestinationPermissions(Destination destination)
- public Try<Void> removeDestinationPermissions(Destination destination)

Class: CorePermissionsChecker
Methods:
- public boolean hasWorldAccessPermission(CommandSender sender, MultiverseWorld world)
- public boolean hasWorldExemptPermission(CommandSender sender, MultiverseWorld world)
- public boolean hasGameModeBypassPermission(CommandSender sender, MultiverseWorld world)
- public boolean hasPlayerLimitBypassPermission(CommandSender sender, MultiverseWorld world)
- public boolean hasJoinLocationBypassPermission(CommandSender sender)
- public boolean hasAnyTeleportPermission(CommandSender sender)
- public boolean hasAnyTeleportPermission(CommandSender sender, CorePermissionsChecker.Scope scope)
- public boolean hasAnyTeleportPermission(CommandSender sender, CorePermissionsChecker.Scope... scopes)
- public boolean hasAnySpawnPermission(CommandSender sender)
- public boolean hasAnySpawnPermission(CommandSender sender, CorePermissionsChecker.Scope scope)
- public boolean hasAnySpawnPermission(CommandSender sender, CorePermissionsChecker.Scope... scopes)
- public boolean checkTeleportPermission(CommandSender sender, List<Entity> entities, DestinationInstance<?, ?> destination)
- public boolean checkTeleportPermission(CommandSender sender, Entity entity, DestinationInstance<?, ?> destination)
- public boolean checkTeleportPermission(CommandSender sender, CorePermissionsChecker.Scope scope, DestinationInstance<?, ?> destination)
- public boolean checkSpawnPermission(CommandSender sender, List<Entity> entities, MultiverseWorld world)
- public boolean checkSpawnPermission(CommandSender sender, Entity entity, MultiverseWorld world)
- public boolean checkSpawnPermission(CommandSender sender, CorePermissionsChecker.Scope scope, MultiverseWorld world)
- public boolean checkDestinationPacketPermission(CommandSender sender, List<Entity> entities, DestinationSuggestionPacket packet)
- public boolean checkDestinationPacketPermission(CommandSender sender, Entity entity, DestinationSuggestionPacket packet)
- public boolean checkDestinationPacketPermission(CommandSender sender, CorePermissionsChecker.Scope scope, DestinationSuggestionPacket packet)

Enum: CorePermissionsChecker.Scope
Constants: SELF, OTHER
Methods:
- public String getScope()
- public String toString()
- public static CorePermissionsChecker.Scope getApplicableScope(CommandSender sender, Entity entity)
- public static List<CorePermissionsChecker.Scope> getApplicableScopes(CommandSender sender, List<Entity> entities)

### Event Classes
Package: org.mvplugins.multiverse.core.event

Class: MVConfigReloadEvent
Extends: Event
Methods:
- public List<String> getAllConfigsLoaded()
- public void addConfig(String config)
- public HandlerList getHandlers()
- public static HandlerList getHandlerList()

Class: MVDebugModeEvent
Extends: Event
Methods:
- public int getLevel()
- public HandlerList getHandlers()
- public static HandlerList getHandlerList()

Class: MVDumpsDebugInfoEvent
Extends: Event
Methods:
- public String getDebugInfo()
- public void appendDebugInfo(String info)
- public Map<String, String> getDetailedDebugInfo()
- public void putDetailedDebugInfo(String key, String value)
- public void putDetailedDebugInfo(String key, File file)
- public HandlerList getHandlers()
- public static HandlerList getHandlerList()

Class: MVPlayerTouchedPortalEvent
Extends: Event
Implements: Cancellable
Methods:
- public Player getPlayer()
- public Location getBlockTouched()
- public boolean canUseThisPortal()
- public void setCanUseThisPortal(boolean canUse)
- public boolean isCancelled()
- public void setCancelled(boolean cancelled)
- public HandlerList getHandlers()
- public static HandlerList getHandlerList()

Class: MVRespawnEvent
Extends: PlayerEvent
Implements: Cancellable
Methods:
- public Location getRespawnLocation()
- public void setRespawnLocation(Location location)
- public boolean isCancelled()
- public void setCancelled(boolean cancelled)
- public HandlerList getHandlers()
- public static HandlerList getHandlerList()

Class: MVTeleportDestinationEvent
Extends: Event
Implements: Cancellable
Methods:
- public Entity getTeleportee()
- public CommandSender getTeleporter()
- public DestinationInstance<?, ?> getDestination()
- public Location getFrom()
- public boolean isCancelled()
- public void setCancelled(boolean cancelled)
- public HandlerList getHandlers()
- public static HandlerList getHandlerList()

### World Event Classes
Package: org.mvplugins.multiverse.core.event.world

Class: MVWorldClonedEvent
Extends: MultiverseWorldEvent
Methods:
- public LoadedMultiverseWorld getFromWorld()
- public MultiverseWorld getWorld()

Class: MVWorldCreatedEvent
Extends: MultiverseWorldEvent
Methods:
- public MultiverseWorld getWorld()

Class: MVWorldDeleteEvent
Extends: MultiverseWorldEvent
Implements: Cancellable
Methods:
- public MultiverseWorld getWorld()
- public boolean isCancelled()
- public void setCancelled(boolean cancelled)

Class: MVWorldImportedEvent
Extends: MultiverseWorldEvent
Methods:
- public MultiverseWorld getWorld()

Class: MVWorldLoadedEvent
Extends: MultiverseWorldEvent
Methods:
- public MultiverseWorld getWorld()

Class: MVWorldPropertyChangedEvent<T>
Extends: MultiverseWorldEvent
Methods:
- public MultiverseWorld getWorld()
- public String getName()
- public T getOldValue()
- public T getNewValue()

Class: MVWorldRegeneratedEvent
Extends: MultiverseWorldEvent
Methods:
- public MultiverseWorld getWorld()

Class: MVWorldRemovedEvent
Extends: MultiverseWorldEvent
Methods:
- public MultiverseWorld getWorld()

Class: MVWorldUnloadedEvent
Extends: MultiverseWorldEvent
Methods:
- public MultiverseWorld getWorld()

### Result Classes
Package: org.mvplugins.multiverse.core.utils.result

Interface: Attempt<T, F extends FailureReason>
Methods:
- boolean isSuccess()
- boolean isFailure()
- T get()
- T getOrNull()
- T getOrElse(T defaultValue)
- T getOrThrow(Function<Attempt.Failure<T, F>, X> exceptionMapper) throws X
- F getFailureReason()
- Message getFailureMessage()
- Attempt<T, F> onSuccess(Consumer<T> action)
- Attempt<T, F> onSuccess(Runnable action)
- Attempt<T, F> onFailure(Consumer<Attempt.Failure<T, F>> action)
- Attempt<T, F> onFailure(Runnable action)
- Attempt<T, F> onFailureReason(Consumer<F> action)
- Attempt<T, F> peek(Consumer<T> action)
- Attempt<T, F> thenRun(Runnable action)
- Attempt<T, F> thenAccept(Consumer<Either<T, F>> action)
- <U> Attempt<U, F> map(Function<T, U> mapper)
- <U> Attempt<U, F> map(Supplier<U> supplier)
- <U> Attempt<U, F> mapAttempt(Function<T, Attempt<U, F>> mapper)
- <U> Attempt<U, F> mapAttempt(Supplier<Attempt<U, F>> supplier)
- <UF extends FailureReason> Attempt<T, UF> transform(UF failureReason)
- <U> U transform(Function<T, U> successTransformer, Function<F, U> failureTransformer)
- <N> N fold(Function<Attempt.Failure<T, F>, N> failureMapper, Function<T, N> successMapper)
- Try<T> toTry()
- Try<T> toTry(Function<Attempt.Failure<T, F>, Throwable> exceptionMapper)
Static Methods:
- static <T, F extends FailureReason> Attempt<T, F> success(T value)
- static <T, F extends FailureReason> Attempt<T, F> failure(F reason, MessageReplacement... replacements)
- static <T, F extends FailureReason> Attempt<T, F> failure(F reason, Message message)

Class: AsyncAttempt<T, F extends FailureReason>
Methods:
- AsyncAttempt<T, F> thenRun(Runnable action)
- AsyncAttempt<T, F> thenAccept(Consumer<Either<T, F>> action)
- AsyncAttempt<T, F> onSuccess(Runnable action)
- AsyncAttempt<T, F> onFailure(Runnable action)
- AsyncAttempt<T, F> onFailure(Consumer<Attempt.Failure<T, F>> action)
- AsyncAttempt<T, F> onFailureReason(Consumer<F> action)
- <U> AsyncAttempt<U, F> map(Function<T, U> mapper)
- <U> AsyncAttempt<U, F> mapAttempt(Function<T, Attempt<U, F>> mapper)
- <U> AsyncAttempt<U, F> mapAsyncAttempt(Function<T, AsyncAttempt<U, F>> mapper)
- Attempt<T, F> toAttempt()
Static Methods:
- static <T, F extends FailureReason> AsyncAttempt<T, F> success()
- static <T, F extends FailureReason> AsyncAttempt<T, F> failure(F reason, MessageReplacement... replacements)
- static <T, F extends FailureReason> AsyncAttempt<T, F> fromAttempt(Attempt<T, F> attempt)
- static <T, F extends FailureReason> AsyncAttempt<T, F> of(CompletableFuture<T> future, Function<Throwable, Attempt<T, F>> handler)
- static <T, F extends FailureReason> AsyncAttempt<T, F> of(CompletableFuture<T> future, BiFunction<T, Throwable, Attempt<T, F>> handler)

Class: AsyncAttemptsAggregate<T, F extends FailureReason>
Methods:
- AsyncAttemptsAggregate<T, F> thenRun(Runnable action)
- AsyncAttemptsAggregate<T, F> onSuccess(Runnable action)
- AsyncAttemptsAggregate<T, F> onSuccess(Consumer<List<Attempt<T, F>>> action)
- AsyncAttemptsAggregate<T, F> onSuccessCount(Consumer<Integer> action)
- AsyncAttemptsAggregate<T, F> onFailure(Runnable action)
- AsyncAttemptsAggregate<T, F> onFailure(Consumer<List<Attempt<T, F>>> action)
- AsyncAttemptsAggregate<T, F> onFailureCount(Consumer<Map<F, Long>> action)
- List<Attempt<T, F>> getAttempts()
Static Methods:
- static <T, F extends FailureReason> AsyncAttemptsAggregate<T, F> emptySuccess()
- static <T, F extends FailureReason> AsyncAttemptsAggregate<T, F> allOf(List<AsyncAttempt<T, F>> attempts)
- static <T, F extends FailureReason> AsyncAttemptsAggregate<T, F> allOf(AsyncAttempt<T, F>... attempts)
- static <T, F extends FailureReason> AsyncAttemptsAggregate<T, F> allOfAggregate(List<AsyncAttemptsAggregate<T, F>> aggregates)
- static <T, F extends FailureReason> AsyncAttemptsAggregate<T, F> allOfAggregate(AsyncAttemptsAggregate<T, F>... aggregates)

Class: AttemptsAggregate<T, F extends FailureReason>
Methods:
- boolean hasSuccess()
- boolean hasFailure()
- AttemptsAggregate<T, F> onSuccess(Runnable action)
- AttemptsAggregate<T, F> onSuccess(Consumer<List<Attempt<T, F>>> action)
- AttemptsAggregate<T, F> onSuccessCount(Consumer<Integer> action)
- AttemptsAggregate<T, F> onFailure(Runnable action)
- AttemptsAggregate<T, F> onFailure(Consumer<List<Attempt<T, F>>> action)
- AttemptsAggregate<T, F> onFailureCount(Consumer<Map<F, Long>> action)
Static Methods:
- static <T, F extends FailureReason> AttemptsAggregate<T, F> emptySuccess()
- static <T, F extends FailureReason> AttemptsAggregate<T, F> allOf(List<Attempt<T, F>> attempts)
- static <T, F extends FailureReason> AttemptsAggregate<T, F> allOf(Attempt<T, F>... attempts)

Interface: Result<S extends SuccessReason, F extends FailureReason>
Methods:
- boolean isSuccess()
- boolean isFailure()
- S getSuccessReason()
- F getFailureReason()
- Message getReasonMessage()
- Result<S, F> onSuccess(Consumer<Result.Success<S, F>> action)
- Result<S, F> onSuccessReason(S reason, Consumer<S> action)
- Result<S, F> onSuccessThen(Function<Result.Success<S, F>, Result<S, F>> action)
- Result<S, F> onFailure(Consumer<Result.Failure<S, F>> action)
- Result<S, F> onFailureReason(F reason, Consumer<F> action)
- Result<S, F> onFailureThen(Function<Result.Failure<S, F>, Result<S, F>> action)
- <R> R fold(Function<Result.Failure<S, F>, R> failureMapper, Function<Result.Success<S, F>, R> successMapper)
Static Methods:
- static <S extends SuccessReason, F extends FailureReason> Result<S, F> success(S reason, MessageReplacement... replacements)
- static <S extends SuccessReason, F extends FailureReason> Result<S, F> success(S reason, Message message)
- static <S extends SuccessReason, F extends FailureReason> Result<S, F> failure(F reason, MessageReplacement... replacements)
- static <S extends SuccessReason, F extends FailureReason> Result<S, F> failure(F reason, Message message)

Class: ResultChain
Methods:
- boolean isSuccess()
- boolean isFailure()
- ResultChain onSuccess(Runnable action)
- ResultChain onSuccess(Consumer<ResultChain> action)
- ResultChain onSuccessReason(Class<S> reasonClass, Consumer<S> action)
- ResultChain onSuccessReason(S reason, Runnable action)
- ResultChain onFailure(Runnable action)
- ResultChain onFailure(Consumer<ResultChain> action)
- ResultChain onFailureReason(Class<F> reasonClass, Consumer<F> action)
- Option<S> getSuccessReason(Class<S> reasonClass)
- Option<F> getFailureReason(Class<F> reasonClass)
- Message getLastResultMessage()
- String toString()
Static Methods:
- static ResultChain.Builder builder()
- static ResultChain.Builder builder(boolean abortOnFailure)

Class: ResultChain.Builder
Methods:
- ResultChain.Builder then(Supplier<Result<?, ?>> resultSupplier)
- ResultChain build()

Interface: FailureReason
Extends: MessageKeyProvider
Methods:
- MessageKey getMessageKey()
Static Field:
- static final FailureReason GENERIC

Interface: SuccessReason
Extends: MessageKeyProvider
Methods:
- MessageKey getMessageKey()
Static Field:
- static final SuccessReason GENERIC

### Message Classes
Package: org.mvplugins.multiverse.core.locale.message

Class: Message
Fields:
- protected final String messageKey
- protected final MessageReplacement[] replacements

Methods:
- public String formatted()
- public String formatted(Locales locales)
- public String formatted(CommandIssuer issuer)
- public String formatted(Locales locales, CommandIssuer issuer)
- public String raw()
- public String[] getReplacements()
- public String[] getReplacements(Locales locales, CommandIssuer issuer)
Static Methods:
- public static Message of(String message, MessageReplacement... replacements)
- public static LocalizedMessage of(MessageKeyProvider provider, MessageReplacement... replacements)
- public static LocalizedMessage of(MessageKeyProvider provider, String fallback, MessageReplacement... replacements)

Class: LocalizedMessage
Extends: Message
Implements: MessageKeyProvider
Methods:
- public MessageKey getMessageKey()
- public String formatted(CommandIssuer issuer)
- public String formatted(Locales locales, CommandIssuer issuer)
- public String[] getReplacements(Locales locales, CommandIssuer issuer)

Class: MessageReplacement
Methods:
- public String getKey()
- public Either<Object, Message> getReplacement()
- public static MessageReplacement.Key replace(String key)

Class: MessageReplacement.Key
Methods:
- public MessageReplacement with(Object value)
- public MessageReplacement with(Message message)

Enum: MessageReplacement.Replace
Constants: COUNT, ERROR, GAMERULE, LOCATION, NAME, PLAYER, REASON, VALUE, WORLD, DESTINATION
Methods:
- public MessageReplacement with(Object value)
- public MessageReplacement with(Message message)

## WORLD OPTIONS CLASSES (COMPLETE)

### CreateWorldOptions
Package: org.mvplugins.multiverse.core.world.options
Static Factory: public static CreateWorldOptions worldName(String worldName)
Builder Methods (all return CreateWorldOptions):
- environment(World.Environment environment)
- seed(long seed)
- seed(String seed)
- generateStructures(boolean generateStructures)
- worldType(WorldType worldType)
- generator(String generator)
- generatorSettings(String generatorSettings)
- biome(String biome)
- useSpawnAdjust(boolean useSpawnAdjust)
- doFolderCheck(boolean doFolderCheck)
Getter Methods:
- String worldName()
- World.Environment environment()
- long seed()
- boolean generateStructures()
- WorldType worldType()
- String generator()
- String generatorSettings()
- String biome()
- boolean useSpawnAdjust()
- boolean doFolderCheck()

### ImportWorldOptions
Package: org.mvplugins.multiverse.core.world.options
Static Factory: public static ImportWorldOptions worldName(String worldName)
Builder Methods (all return ImportWorldOptions):
- environment(World.Environment environment)
- generator(String generator)
- biome(String biome)
- useSpawnAdjust(boolean useSpawnAdjust)
- doFolderCheck(boolean doFolderCheck)
Getter Methods:
- String worldName()
- World.Environment environment()
- String generator()
- String biome()
- boolean useSpawnAdjust()
- boolean doFolderCheck()

### LoadWorldOptions
Package: org.mvplugins.multiverse.core.world.options
Static Factory: public static LoadWorldOptions world(MultiverseWorld world)
Builder Methods: doFolderCheck(boolean doFolderCheck)
Getter Methods: MultiverseWorld world(), boolean doFolderCheck()

### UnloadWorldOptions
Package: org.mvplugins.multiverse.core.world.options
Static Factory: public static UnloadWorldOptions world(LoadedMultiverseWorld world)
Builder Methods: saveBukkitWorld(boolean save), unloadBukkitWorld(boolean unload)
Getter Methods: LoadedMultiverseWorld world(), boolean saveBukkitWorld(), boolean unloadBukkitWorld()

### DeleteWorldOptions
Package: org.mvplugins.multiverse.core.world.options
Static Factory: public static DeleteWorldOptions world(MultiverseWorld world)
Builder Methods: keepFiles(List<String> keepFiles)
Getter Methods: MultiverseWorld world(), List<String> keepFiles()

### RemoveWorldOptions
Package: org.mvplugins.multiverse.core.world.options
Static Factory: public static RemoveWorldOptions world(MultiverseWorld world)
Builder Methods: saveBukkitWorld(boolean save), unloadBukkitWorld(boolean unload)
Getter Methods: MultiverseWorld world(), boolean saveBukkitWorld(), boolean unloadBukkitWorld()

### CloneWorldOptions
Package: org.mvplugins.multiverse.core.world.options
Implements: KeepWorldSettingsOptions
Static Factory: public static CloneWorldOptions fromTo(LoadedMultiverseWorld world, String newWorldName)
Builder Methods: keepGameRule(boolean keep), keepWorldBorder(boolean keep), keepWorldConfig(boolean keep), saveBukkitWorld(boolean save)
Getter Methods: LoadedMultiverseWorld world(), String newWorldName(), boolean keepGameRule(), boolean keepWorldBorder(), boolean keepWorldConfig(), boolean saveBukkitWorld()

### RegenWorldOptions
Package: org.mvplugins.multiverse.core.world.options
Implements: KeepWorldSettingsOptions
Static Factory: public static RegenWorldOptions world(LoadedMultiverseWorld world)
Builder Methods: randomSeed(boolean random), seed(long seed), seed(String seed), biome(Biome biome), keepGameRule(boolean keep), keepWorldBorder(boolean keep), keepWorldConfig(boolean keep), keepFiles(List<String> keepFiles)
Getter Methods: LoadedMultiverseWorld world(), boolean randomSeed(), long seed(), Biome biome(), boolean keepGameRule(), boolean keepWorldBorder(), boolean keepWorldConfig(), List<String> keepFiles()

### Interface: KeepWorldSettingsOptions
Package: org.mvplugins.multiverse.core.world.options
Methods:
- boolean keepGameRule()
- KeepWorldSettingsOptions keepGameRule(boolean keep)
- boolean keepWorldBorder()
- KeepWorldSettingsOptions keepWorldBorder(boolean keep)
- boolean keepWorldConfig()
- KeepWorldSettingsOptions keepWorldConfig(boolean keep)

## FAILURE REASON ENUMS (COMPLETE)

### CreateFailureReason
Package: org.mvplugins.multiverse.core.world.reasons
Enum Constants:
- INVALID_WORLDNAME
- WORLD_EXIST_FOLDER
- WORLD_EXIST_LOADED
- WORLD_EXIST_UNLOADED
- WORLD_CREATOR_FAILED

### ImportFailureReason
Package: org.mvplugins.multiverse.core.world.reasons
Enum Constants:
- INVALID_WORLDNAME
- WORLD_EXIST_LOADED
- WORLD_EXIST_UNLOADED
- WORLD_FOLDER_INVALID
- BUKKIT_ENVIRONMENT_MISMATCH
- WORLD_CREATOR_FAILED

### LoadFailureReason
Package: org.mvplugins.multiverse.core.world.reasons
Enum Constants:
- WORLD_NON_EXISTENT
- WORLD_EXIST_FOLDER
- WORLD_EXIST_LOADED
- WORLD_ALREADY_LOADING
- WORLD_FOLDER_INVALID
- BUKKIT_ENVIRONMENT_MISMATCH
- WORLD_CREATOR_FAILED

### UnloadFailureReason
Package: org.mvplugins.multiverse.core.world.reasons
Enum Constants:
- WORLD_NON_EXISTENT
- WORLD_UNLOADED
- WORLD_ALREADY_UNLOADING
- BUKKIT_UNLOAD_FAILED

### DeleteFailureReason
Package: org.mvplugins.multiverse.core.world.reasons
Enum Constants:
- WORLD_NON_EXISTENT
- LOAD_FAILED
- UNLOAD_FAILED
- REMOVE_FAILED
- DELETE_FAILED
- WORLD_FOLDER_NOT_FOUND
- FAILED_TO_DELETE_FOLDER
- EVENT_CANCELLED

### CloneFailureReason
Package: org.mvplugins.multiverse.core.world.reasons
Enum Constants:
- INVALID_WORLDNAME
- WORLD_EXIST_FOLDER
- WORLD_EXIST_LOADED
- WORLD_EXIST_UNLOADED
- COPY_FAILED
- IMPORT_FAILED

### RegenFailureReason
Package: org.mvplugins.multiverse.core.world.reasons
Enum Constants:
- DELETE_FAILED
- CREATE_FAILED

### RemoveFailureReason
Package: org.mvplugins.multiverse.core.world.reasons
Enum Constants:
- WORLD_NON_EXISTENT (deprecated)

### WorldCreatorFailureReason
Package: org.mvplugins.multiverse.core.world.reasons
Enum Constants:
- BUKKIT_CREATION_FAILED
- INVALID_CHUNK_GENERATOR
- INVALID_BIOME_PROVIDER

## KEY RULES TO REMEMBER

1. **TeleportFailureReason is in org.mvplugins.multiverse.core.teleportation package, NOT world.reasons**
2. **ALWAYS use org.mvplugins.multiverse.external.vavr imports, NEVER io.vavr**
3. **ALL WorldManager.get*() methods return Option<T> (Multiverse's shaded vavr)**
4. **Collections returned by getWorlds(), getLoadedWorlds() are java.util.Collection - NO CONVERSION NEEDED**
5. **failure.getFailureMessage() returns Message object, use .formatted() to get String**
6. **AsyncAttemptsAggregate.onFailure() gives you java.util.List<Attempt>, not a single failure**
7. **Weather getter is isAllowWeather(), NOT getAllowWeather()**
8. **Hunger getter is isHunger(), NOT getHunger()**
9. **CloneWorldOptions requires LoadedMultiverseWorld, UnloadWorldOptions requires LoadedMultiverseWorld**
10. **Property setters return Try<Void> (Multiverse's shaded vavr)**
11. **No vavr List - use java.util.List everywhere**
12. **All Option/Try types are from org.mvplugins.multiverse.external.vavr.control**