# Multiverse-Core 5.x API Reference

Multiverse-Core is the standard multi-world management plugin for Bukkit/Spigot/Paper servers. The 5.x API uses the `org.mvplugins.multiverse.core` package and returns functional types (`Attempt`, `Option`, `Try`) instead of nulls.

## CRITICAL: Shaded Vavr Imports

Multiverse-Core shades the Vavr library under its own package. Never import `io.vavr`. Always use:

```java
import org.mvplugins.multiverse.external.vavr.control.Option;
import org.mvplugins.multiverse.external.vavr.control.Try;
// Do NOT use io.vavr - it will cause ClassNotFoundException at runtime
```

## Getting the API

```java
import org.mvplugins.multiverse.core.MultiverseCoreApi;
import org.mvplugins.multiverse.core.world.WorldManager;
import org.mvplugins.multiverse.core.teleportation.AsyncSafetyTeleporter;

// Option 1: Static getter (throws IllegalStateException if not loaded)
MultiverseCoreApi api = MultiverseCoreApi.get();

// Option 2: Deferred - runs callback once API is ready
MultiverseCoreApi.whenLoaded(api -> {
    // safe to use api here
});

// Option 3: Bukkit ServicesManager
RegisteredServiceProvider<MultiverseCoreApi> provider =
    Bukkit.getServicesManager().getRegistration(MultiverseCoreApi.class);
if (provider != null) {
    MultiverseCoreApi api = provider.getProvider();
}

// From the API, get managers:
WorldManager worldManager = api.getWorldManager();
AsyncSafetyTeleporter teleporter = api.getSafetyTeleporter();
```

Add `Multiverse-Core` to `depend` or `softdepend` in your `plugin.yml`.

## Creating a World

```java
import org.mvplugins.multiverse.core.MultiverseCoreApi;
import org.mvplugins.multiverse.core.world.WorldManager;
import org.mvplugins.multiverse.core.world.LoadedMultiverseWorld;
import org.mvplugins.multiverse.core.world.options.CreateWorldOptions;
import org.mvplugins.multiverse.core.world.reasons.CreateFailureReason;
import org.mvplugins.multiverse.core.utils.result.Attempt;
import org.bukkit.World;
import org.bukkit.WorldType;

WorldManager worldManager = MultiverseCoreApi.get().getWorldManager();

CreateWorldOptions options = CreateWorldOptions.worldName("skyblock")
    .environment(World.Environment.NORMAL)
    .worldType(WorldType.NORMAL)
    .seed(12345L)
    .generateStructures(true)
    .useSpawnAdjust(true);

Attempt<LoadedMultiverseWorld, CreateFailureReason> result = worldManager.createWorld(options);

if (result.isSuccess()) {
    LoadedMultiverseWorld world = result.get();
    player.sendMessage("Created world: " + world.getName());
} else {
    player.sendMessage("Failed: " + result.getFailureMessage());
}

// Or use callbacks:
worldManager.createWorld(options)
    .onSuccess(world -> player.sendMessage("Created: " + world.getName()))
    .onFailure(failure -> player.sendMessage("Failed: " + failure.getFailureMessage()));
```

## Importing an Existing World

```java
import org.mvplugins.multiverse.core.world.options.ImportWorldOptions;
import org.mvplugins.multiverse.core.world.reasons.ImportFailureReason;

ImportWorldOptions importOpts = ImportWorldOptions.worldName("existing_world")
    .environment(World.Environment.NORMAL);

worldManager.importWorld(importOpts)
    .onSuccess(world -> logger.info("Imported: " + world.getName()))
    .onFailure(f -> logger.warning("Import failed: " + f.getFailureMessage()));
```

## Getting a World

```java
import org.mvplugins.multiverse.core.world.MultiverseWorld;
import org.mvplugins.multiverse.core.world.LoadedMultiverseWorld;
import org.mvplugins.multiverse.external.vavr.control.Option;

// Get any managed world (loaded or unloaded) by name
Option<MultiverseWorld> optWorld = worldManager.getWorld("skyblock");

// Use peek for actions (no null checks needed)
worldManager.getWorld("skyblock").peek(world -> {
    player.sendMessage("World exists: " + world.getName());
});

// Get only if currently loaded
Option<LoadedMultiverseWorld> optLoaded = worldManager.getLoadedWorld("skyblock");

optLoaded.peek(loaded -> {
    // Access the Bukkit World object
    loaded.getBukkitWorld().peek(bukkitWorld -> {
        player.sendMessage("Players online: " + bukkitWorld.getPlayers().size());
    });
});

// Check and extract
if (optWorld.isDefined()) {
    MultiverseWorld mvWorld = optWorld.get();
}

// Or get nullable (not recommended)
MultiverseWorld mvWorld = worldManager.getWorld("skyblock").getOrNull();

// Get by name or alias
Option<MultiverseWorld> byAlias = worldManager.getWorldByNameOrAlias("Sky World");

// Get all worlds
Collection<MultiverseWorld> allWorlds = worldManager.getWorlds();
Collection<LoadedMultiverseWorld> loadedWorlds = worldManager.getLoadedWorlds();
```

## Teleporting Players Between Worlds

```java
import org.mvplugins.multiverse.core.teleportation.AsyncSafetyTeleporter;
import org.mvplugins.multiverse.core.utils.result.AsyncAttempt;
import org.mvplugins.multiverse.core.utils.result.AsyncAttemptsAggregate;
import org.mvplugins.multiverse.core.teleportation.TeleportFailureReason;
import org.bukkit.Location;
import org.bukkit.entity.Player;

AsyncSafetyTeleporter teleporter = MultiverseCoreApi.get().getSafetyTeleporter();

// Teleport to a location with safety checks
Location destination = new Location(targetBukkitWorld, 100, 65, 200);
teleporter.to(destination)
    .teleportSingle(player);

// Teleport without safety checks (exact location)
teleporter.to(destination)
    .checkSafety(false)
    .teleportSingle(player);

// Teleport to a world's spawn
worldManager.getLoadedWorld("skyblock").peek(mvWorld -> {
    Location spawn = mvWorld.getSpawnLocation();
    teleporter.to(spawn).teleportSingle(player);
});

// Teleport multiple players
List<Player> players = new ArrayList<>(Bukkit.getOnlinePlayers());
teleporter.to(destination)
    .teleport(players);

// Specify who initiated the teleport
teleporter.to(destination)
    .by(commandSender)
    .teleportSingle(player);
```

## World Properties

```java
import org.mvplugins.multiverse.core.world.MultiverseWorld;
import org.mvplugins.multiverse.external.vavr.control.Try;
import org.bukkit.GameMode;
import org.bukkit.Difficulty;

// All setters return Try<Void> - check success
worldManager.getWorld("skyblock").peek(world -> {

    // Display & identity
    world.setAlias("&aSky &bWorld");       // supports color codes
    world.setHidden(false);
    String displayName = world.getAliasOrName();

    // Gameplay
    world.setGameMode(GameMode.SURVIVAL);
    world.setDifficulty(Difficulty.HARD);
    world.setPvp(false);
    world.setHunger(true);
    world.setAutoHeal(true);
    world.setAllowFlight(true);
    world.setPlayerLimit(50);

    // Environment
    world.setAllowWeather(true);
    world.setKeepSpawnInMemory(true);
    world.setAutoLoad(true);

    // Spawn
    world.setSpawnLocation(new Location(bukkitWorld, 0, 100, 0));
    world.setAdjustSpawn(true);
    world.setBedRespawn(true);
    world.setRespawnWorld("lobby");

    // Portal
    world.setPortalForm(AllowedPortalType.NONE);

    // Economy
    world.setEntryFeeEnabled(true);
    world.setPrice(100.0);

    // Scale (nether ratio)
    world.setScale(8.0);

    // Read properties
    GameMode gm = world.getGameMode();
    Location spawn = world.getSpawnLocation();
    double scale = world.getScale();
    boolean pvp = world.getPvp();
    World.Environment env = world.getEnvironment();
    long seed = world.getSeed();

    // Setter error handling
    Try<Void> result = world.setGameMode(GameMode.CREATIVE);
    if (result.isFailure()) {
        logger.warning("Could not set gamemode: " + result.getCause().getMessage());
    }
});
```

## Loading, Unloading, Cloning, Deleting Worlds

```java
import org.mvplugins.multiverse.core.world.options.UnloadWorldOptions;
import org.mvplugins.multiverse.core.world.options.DeleteWorldOptions;
import org.mvplugins.multiverse.core.world.options.CloneWorldOptions;
import org.mvplugins.multiverse.core.world.options.RegenWorldOptions;

// Load a previously unloaded world
worldManager.loadWorld("skyblock")
    .onSuccess(loaded -> logger.info("Loaded: " + loaded.getName()))
    .onFailure(f -> logger.warning("Load failed"));

// Unload a world
worldManager.getLoadedWorld("skyblock").peek(loaded -> {
    worldManager.unloadWorld(
        UnloadWorldOptions.world(loaded)
            .saveBukkitWorld(true)
            .unloadBukkitWorld(true)
    );
});

// Clone a world
worldManager.getLoadedWorld("skyblock").peek(loaded -> {
    worldManager.cloneWorld(
        CloneWorldOptions.fromTo(loaded, "skyblock_backup")
            .keepWorldConfig(true)
            .keepGameRule(true)
            .keepWorldBorder(true)
    ).onSuccess(clone -> logger.info("Cloned to: " + clone.getName()));
});

// Delete a world permanently
worldManager.getWorld("old_world").peek(world -> {
    worldManager.deleteWorld(DeleteWorldOptions.world(world))
        .onSuccess(name -> logger.info("Deleted: " + name));
});

// Remove from Multiverse management without deleting files
worldManager.removeWorld("unmanaged_world");
```

## Listening to Multiverse Events

```java
import org.mvplugins.multiverse.core.event.world.MVWorldCreatedEvent;
import org.mvplugins.multiverse.core.event.world.MVWorldDeleteEvent;
import org.mvplugins.multiverse.core.event.world.MVWorldLoadedEvent;
import org.mvplugins.multiverse.core.event.world.MVWorldUnloadedEvent;
import org.mvplugins.multiverse.core.event.world.MVWorldClonedEvent;
import org.mvplugins.multiverse.core.event.world.MVWorldRegeneratedEvent;
import org.mvplugins.multiverse.core.event.world.MVWorldPropertyChangedEvent;
import org.mvplugins.multiverse.core.event.MVTeleportDestinationEvent;
import org.mvplugins.multiverse.core.event.MVRespawnEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MultiverseListener implements Listener {

    @EventHandler
    public void onWorldCreated(MVWorldCreatedEvent event) {
        LoadedMultiverseWorld world = event.getWorld();
        Bukkit.getLogger().info("New MV world created: " + world.getName());
    }

    @EventHandler
    public void onWorldLoaded(MVWorldLoadedEvent event) {
        LoadedMultiverseWorld world = event.getWorld();
        // world is now available
    }

    @EventHandler
    public void onWorldUnloaded(MVWorldUnloadedEvent event) {
        MultiverseWorld world = event.getWorld();
        // world has been unloaded
    }

    @EventHandler
    public void onWorldDelete(MVWorldDeleteEvent event) {
        MultiverseWorld world = event.getWorld();
        // world is about to be deleted - this is cancellable
    }

    @EventHandler
    public void onWorldPropertyChanged(MVWorldPropertyChangedEvent event) {
        // a world config property was changed
    }

    @EventHandler
    public void onTeleportDestination(MVTeleportDestinationEvent event) {
        // fired when /mvtp resolves a destination
    }

    @EventHandler
    public void onRespawn(MVRespawnEvent event) {
        // fired when a player respawns and Multiverse handles it
    }
}
```

## Utility: Check If World Exists

```java
// Check if Multiverse manages a world
boolean exists = worldManager.isWorld("skyblock");

// Check if a world is currently loaded
boolean loaded = worldManager.isLoadedWorld(Bukkit.getWorld("skyblock"));

// List world folders that could be imported
List<String> potentialWorlds = worldManager.getPotentialWorlds();

// Get the default/main world
Option<LoadedMultiverseWorld> defaultWorld = worldManager.getDefaultWorld();
```

---

## API Reference

### org.mvplugins.multiverse.core.MultiverseCoreApi
| Method | Returns |
|---|---|
| `static get()` | `MultiverseCoreApi` |
| `static isLoaded()` | `boolean` |
| `static whenLoaded(Consumer<MultiverseCoreApi>)` | `void` |
| `getWorldManager()` | `WorldManager` |
| `getSafetyTeleporter()` | `AsyncSafetyTeleporter` |
| `getAnchorManager()` | `AnchorManager` |
| `getBlockSafety()` | `BlockSafety` |
| `getCoreConfig()` | `CoreConfig` |
| `getDestinationsProvider()` | `DestinationsProvider` |
| `getMVEconomist()` | `MVEconomist` |
| `getLocationManipulation()` | `LocationManipulation` |
| `getBiomeProviderFactory()` | `BiomeProviderFactory` |
| `getGeneratorProvider()` | `GeneratorProvider` |
| `getServiceLocator()` | `PluginServiceLocator` |

### org.mvplugins.multiverse.core.world.WorldManager
| Method | Returns |
|---|---|
| `createWorld(CreateWorldOptions)` | `Attempt<LoadedMultiverseWorld, CreateFailureReason>` |
| `importWorld(ImportWorldOptions)` | `Attempt<LoadedMultiverseWorld, ImportFailureReason>` |
| `loadWorld(String)` | `Attempt<LoadedMultiverseWorld, LoadFailureReason>` |
| `loadWorld(LoadWorldOptions)` | `Attempt<LoadedMultiverseWorld, LoadFailureReason>` |
| `unloadWorld(UnloadWorldOptions)` | `Attempt<MultiverseWorld, UnloadFailureReason>` |
| `deleteWorld(DeleteWorldOptions)` | `Attempt<String, DeleteFailureReason>` |
| `removeWorld(RemoveWorldOptions)` | `Attempt<String, RemoveFailureReason>` |
| `cloneWorld(CloneWorldOptions)` | `Attempt<LoadedMultiverseWorld, CloneFailureReason>` |
| `regenWorld(RegenWorldOptions)` | `Attempt<LoadedMultiverseWorld, RegenFailureReason>` |
| `getWorld(String)` | `Option<MultiverseWorld>` |
| `getWorld(World)` | `Option<MultiverseWorld>` |
| `getWorldByNameOrAlias(String)` | `Option<MultiverseWorld>` |
| `getLoadedWorld(String)` | `Option<LoadedMultiverseWorld>` |
| `getLoadedWorld(World)` | `Option<LoadedMultiverseWorld>` |
| `getLoadedWorldByNameOrAlias(String)` | `Option<LoadedMultiverseWorld>` |
| `getWorlds()` | `Collection<MultiverseWorld>` |
| `getLoadedWorlds()` | `Collection<LoadedMultiverseWorld>` |
| `getDefaultWorld()` | `Option<LoadedMultiverseWorld>` |
| `getPotentialWorlds()` | `List<String>` |
| `isWorld(String)` | `boolean` |
| `isLoadedWorld(World)` | `boolean` |
| `saveWorldsConfig()` | `Try<Void>` |

### org.mvplugins.multiverse.core.world.MultiverseWorld
| Method | Returns |
|---|---|
| `getName()` | `String` |
| `getAliasOrName()` | `String` |
| `setAlias(String)` | `Try<Void>` |
| `isLoaded()` | `boolean` |
| `asLoadedWorld()` | `Option<LoadedMultiverseWorld>` |
| `getSpawnLocation()` | `Location` |
| `setSpawnLocation(Location)` | `Try<Void>` |
| `getEnvironment()` | `World.Environment` |
| `getGenerator()` | `String` |
| `getSeed()` | `long` |
| `getGameMode()` / `setGameMode(GameMode)` | `GameMode` / `Try<Void>` |
| `getDifficulty()` / `setDifficulty(Difficulty)` | `Difficulty` / `Try<Void>` |
| `getPvp()` / `setPvp(boolean)` | `boolean` / `Try<Void>` |
| `isHunger()` / `setHunger(boolean)` | `boolean` / `Try<Void>` |
| `getAutoHeal()` / `setAutoHeal(boolean)` | `boolean` / `Try<Void>` |
| `isAllowFlight()` / `setAllowFlight(boolean)` | `boolean` / `Try<Void>` |
| `isAllowWeather()` / `setAllowWeather(boolean)` | `boolean` / `Try<Void>` |
| `isHidden()` / `setHidden(boolean)` | `boolean` / `Try<Void>` |
| `isAutoLoad()` / `setAutoLoad(boolean)` | `boolean` / `Try<Void>` |
| `getScale()` / `setScale(double)` | `double` / `Try<Void>` |
| `getPlayerLimit()` / `setPlayerLimit(int)` | `int` / `Try<Void>` |
| `getPrice()` / `setPrice(double)` | `double` / `Try<Void>` |
| `isEntryFeeEnabled()` / `setEntryFeeEnabled(boolean)` | `boolean` / `Try<Void>` |
| `getCurrency()` / `setCurrency(Material)` | `Material` / `Try<Void>` |
| `getPortalForm()` / `setPortalForm(AllowedPortalType)` | `AllowedPortalType` / `Try<Void>` |
| `getRespawnWorldName()` / `setRespawnWorld(String)` | `String` / `Try<Void>` |
| `getBedRespawn()` / `setBedRespawn(boolean)` | `boolean` / `Try<Void>` |
| `getAnchorRespawn()` / `setAnchorSpawn(boolean)` | `boolean` / `Try<Void>` |
| `isKeepSpawnInMemory()` / `setKeepSpawnInMemory(boolean)` | `boolean` / `Try<Void>` |
| `getAdjustSpawn()` / `setAdjustSpawn(boolean)` | `boolean` / `Try<Void>` |
| `getWorldBlacklist()` / `setWorldBlacklist(List<String>)` | `List<String>` / `Try<Void>` |
| `getEntitySpawnConfig()` / `setEntitySpawnConfig(EntitySpawnConfig)` | `EntitySpawnConfig` / `Try<Void>` |

### org.mvplugins.multiverse.core.world.LoadedMultiverseWorld extends MultiverseWorld
| Method | Returns |
|---|---|
| `getBukkitWorld()` | `Option<World>` |
| `getPlayers()` | `Option<List<Player>>` |
| `getUID()` | `UUID` |
| `getWorldType()` | `Option<WorldType>` |
| `canGenerateStructures()` | `Option<Boolean>` |
| `getWorldBorder()` | `Option<WorldBorder>` |

### org.mvplugins.multiverse.core.teleportation.AsyncSafetyTeleporter
| Method | Returns |
|---|---|
| `to(Location)` | `AsyncSafetyTeleporterAction` |
| `to(DestinationInstance<?,?>)` | `AsyncSafetyTeleporterAction` |

### org.mvplugins.multiverse.core.teleportation.AsyncSafetyTeleporterAction
| Method | Returns |
|---|---|
| `checkSafety(boolean)` | `AsyncSafetyTeleporterAction` |
| `passengerMode(PassengerMode)` | `AsyncSafetyTeleporterAction` |
| `by(CommandSender)` | `AsyncSafetyTeleporterAction` |
| `teleportSingle(Entity)` | `AsyncAttemptsAggregate<Void, TeleportFailureReason>` |
| `teleport(List<T extends Entity>)` | `AsyncAttemptsAggregate<Void, TeleportFailureReason>` |

### org.mvplugins.multiverse.core.utils.result.Attempt<T, F>
| Method | Returns |
|---|---|
| `isSuccess()` | `boolean` |
| `isFailure()` | `boolean` |
| `get()` | `T` (throws on failure) |
| `getOrNull()` | `T` or null |
| `getOrElse(T)` | `T` |
| `getFailureReason()` | `F` |
| `getFailureMessage()` | `Message` |
| `onSuccess(Consumer<T>)` | `Attempt<T,F>` |
| `onFailure(Consumer<Failure<T,F>>)` | `Attempt<T,F>` |
| `map(Function<T,U>)` | `Attempt<U,F>` |
| `mapAttempt(Function<T, Attempt<U,F>>)` | `Attempt<U,F>` |
| `toTry()` | `Try<T>` |

### World Options (org.mvplugins.multiverse.core.world.options)

**CreateWorldOptions** - entry: `CreateWorldOptions.worldName(String)`
Chainable: `.environment(World.Environment)`, `.worldType(WorldType)`, `.seed(long)`, `.seed(String)`, `.generator(String)`, `.generatorSettings(String)`, `.generateStructures(boolean)`, `.useSpawnAdjust(boolean)`, `.biome(String)`

**ImportWorldOptions** - entry: `ImportWorldOptions.worldName(String)`
Chainable: `.environment(World.Environment)`, `.generator(String)`, `.useSpawnAdjust(boolean)`, `.biome(String)`

**UnloadWorldOptions** - entry: `UnloadWorldOptions.world(LoadedMultiverseWorld)`
Chainable: `.saveBukkitWorld(boolean)`, `.unloadBukkitWorld(boolean)`

**DeleteWorldOptions** - entry: `DeleteWorldOptions.world(MultiverseWorld)`
Chainable: `.keepFiles(List<String>)`

**CloneWorldOptions** - entry: `CloneWorldOptions.fromTo(LoadedMultiverseWorld, String)`
Chainable: `.keepGameRule(boolean)`, `.keepWorldConfig(boolean)`, `.keepWorldBorder(boolean)`, `.saveBukkitWorld(boolean)`

### Failure Reason Enums (org.mvplugins.multiverse.core.world.reasons)
`CreateFailureReason`, `ImportFailureReason`, `LoadFailureReason`, `UnloadFailureReason`, `DeleteFailureReason`, `RemoveFailureReason`, `CloneFailureReason`, `RegenFailureReason`

### Events (org.mvplugins.multiverse.core.event / event.world)
`MVWorldCreatedEvent`, `MVWorldImportedEvent`, `MVWorldLoadedEvent`, `MVWorldUnloadedEvent`, `MVWorldDeleteEvent`, `MVWorldClonedEvent`, `MVWorldRegeneratedEvent`, `MVWorldRemovedEvent`, `MVWorldPropertyChangedEvent`, `MVTeleportDestinationEvent`, `MVRespawnEvent`, `MVPlayerTouchedPortalEvent`, `MVConfigReloadEvent`, `MVDebugModeEvent`, `MVDumpsDebugInfoEvent`

### Other Key Classes
- `org.mvplugins.multiverse.core.anchor.AnchorManager` - named location anchors
- `org.mvplugins.multiverse.core.teleportation.BlockSafety` - safe location checking
- `org.mvplugins.multiverse.core.teleportation.LocationManipulation` - location utilities
- `org.mvplugins.multiverse.core.economy.MVEconomist` - Vault economy integration
- `org.mvplugins.multiverse.core.config.CoreConfig` - global Multiverse config
- `org.mvplugins.multiverse.core.world.AllowedPortalType` - enum: `ALL`, `NONE`, `NETHER`, `END`
- `org.mvplugins.multiverse.core.world.entity.EntitySpawnConfig` - per-world entity spawn rules
- `org.mvplugins.multiverse.external.vavr.control.Option<T>` - Vavr optional (use `.peek()`, `.isDefined()`, `.get()`, `.getOrNull()`)
- `org.mvplugins.multiverse.external.vavr.control.Try<T>` - Vavr try (use `.isSuccess()`, `.isFailure()`, `.getCause()`)

### Important Notes
- All world operations MUST run on the main server thread.
- `Option` and `Try` are from Multiverse's shaded Vavr -- never add `io.vavr` as a dependency.
- World names follow Bukkit NamespacedKey rules: no spaces or special characters.
- The default world (from `server.properties` `level-name`) cannot be unloaded.
