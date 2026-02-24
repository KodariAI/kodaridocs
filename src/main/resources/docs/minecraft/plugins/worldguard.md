# WorldGuard API Reference (worldguard-core 7.0.14+)

WorldGuard is a region protection and flag management plugin. The API lets you query regions, check build permissions, test and set flags, create regions programmatically, and register custom flags.

**Important:** WorldGuard 7+ uses WorldEdit vectors (`BlockVector3`, `BlockVector2`) and its own `Location` type. Bukkit objects must be converted using `BukkitAdapter` from WorldEdit.

---

## Code Examples

### Getting the WorldGuard Instance and RegionContainer

```java
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.regions.RegionContainer;

WorldGuard worldGuard = WorldGuard.getInstance();
RegionContainer container = worldGuard.getPlatform().getRegionContainer();
```

### Getting RegionManager for a World

```java
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.managers.RegionManager;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import org.bukkit.World;

World world = /* bukkit world */;
RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();
RegionManager regions = container.get(BukkitAdapter.adapt(world));
// regions may be null if region support is disabled or data failed to load
if (regions != null) {
    // use regions
}
```

### Getting Regions at a Location (Spatial Query)

```java
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.managers.RegionManager;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import org.bukkit.Location;

Location bukkitLoc = player.getLocation();
RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();
RegionManager regions = container.get(BukkitAdapter.adapt(bukkitLoc.getWorld()));
if (regions != null) {
    BlockVector3 position = BukkitAdapter.asBlockVector(bukkitLoc);
    ApplicableRegionSet set = regions.getApplicableRegions(position);

    for (ProtectedRegion region : set) {
        String id = region.getId();
        // process region
    }
}
```

### Using RegionQuery (Recommended for Flag/Protection Checks)

RegionQuery provides a cached, convenient way to query flags at a location without manually obtaining the RegionManager.

```java
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.util.Location;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import com.sk89q.worldguard.protection.regions.RegionQuery;

Location loc = BukkitAdapter.adapt(bukkitLocation);
RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();
RegionQuery query = container.createQuery();
ApplicableRegionSet set = query.getApplicableRegions(loc);
```

### Checking if a Player Can Build at a Location

```java
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.util.Location;
import com.sk89q.worldguard.LocalPlayer;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.flags.Flags;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import com.sk89q.worldguard.protection.regions.RegionQuery;
import org.bukkit.entity.Player;

Player bukkitPlayer = /* bukkit player */;
LocalPlayer localPlayer = WorldGuardPlugin.inst().wrapPlayer(bukkitPlayer);
Location loc = BukkitAdapter.adapt(bukkitPlayer.getLocation());

RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();
RegionQuery query = container.createQuery();

// Check if the player can build (tests the BUILD flag)
if (!query.testState(loc, localPlayer, Flags.BUILD)) {
    // Player cannot build here
}

// Note: testState does NOT check bypass permissions. Check separately:
boolean canBypass = WorldGuard.getInstance().getPlatform()
        .getSessionManager().hasBypass(localPlayer, localPlayer.getWorld());
```

### Checking Region Flags

```java
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.util.Location;
import com.sk89q.worldguard.LocalPlayer;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.flags.Flags;
import com.sk89q.worldguard.protection.flags.StateFlag;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import com.sk89q.worldguard.protection.regions.RegionQuery;
import org.bukkit.entity.Player;

Player bukkitPlayer = /* bukkit player */;
LocalPlayer localPlayer = WorldGuardPlugin.inst().wrapPlayer(bukkitPlayer);
Location loc = BukkitAdapter.adapt(bukkitPlayer.getLocation());
RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();
RegionQuery query = container.createQuery();
ApplicableRegionSet set = query.getApplicableRegions(loc);

// testState: returns true if ALLOWED, false if DENIED (for StateFlags)
boolean pvpAllowed = set.testState(localPlayer, Flags.PVP);
boolean canEntry = set.testState(localPlayer, Flags.ENTRY);

// queryValue: returns a single resolved value (may be null if unset)
StateFlag.State creeperState = set.queryValue(localPlayer, Flags.CREEPER_EXPLOSION);
String greeting = set.queryValue(localPlayer, Flags.GREET_MESSAGE);

// queryAllValues: returns all values from all overlapping regions
Collection<String> allGreetings = set.queryAllValues(localPlayer, Flags.GREET_MESSAGE);

// For flags not tied to a player, pass null (region-group checks won't work)
if (!set.testState(null, Flags.CREEPER_EXPLOSION)) {
    // Creeper explosions are denied here
}
```

### Getting a Specific Region by Name

```java
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.managers.RegionManager;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import org.bukkit.World;

World world = /* bukkit world */;
RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();
RegionManager regions = container.get(BukkitAdapter.adapt(world));
if (regions != null) {
    ProtectedRegion region = regions.getRegion("spawn");
    if (region != null) {
        // region exists
    }

    boolean exists = regions.hasRegion("spawn");
    Map<String, ProtectedRegion> allRegions = regions.getRegions(); // immutable map
}
```

### Creating Regions Programmatically

```java
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.math.BlockVector2;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.domains.DefaultDomain;
import com.sk89q.worldguard.protection.flags.Flags;
import com.sk89q.worldguard.protection.flags.StateFlag;
import com.sk89q.worldguard.protection.managers.RegionManager;
import com.sk89q.worldguard.protection.regions.GlobalProtectedRegion;
import com.sk89q.worldguard.protection.regions.ProtectedCuboidRegion;
import com.sk89q.worldguard.protection.regions.ProtectedPolygonalRegion;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import org.bukkit.World;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

World world = /* bukkit world */;
RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();
RegionManager regions = container.get(BukkitAdapter.adapt(world));
if (regions == null) return;

// --- Cuboid Region ---
BlockVector3 min = BlockVector3.at(-10, 0, -10);
BlockVector3 max = BlockVector3.at(10, 256, 10);
ProtectedCuboidRegion cuboid = new ProtectedCuboidRegion("my-region", min, max);

// Set priority (higher = takes precedence)
cuboid.setPriority(10);

// Set owners and members
DefaultDomain owners = cuboid.getOwners();
owners.addPlayer(UUID.fromString("player-uuid-here"));
owners.addGroup("admins");

DefaultDomain members = cuboid.getMembers();
members.addPlayer(UUID.fromString("another-uuid-here"));

// Set flags on the region
cuboid.setFlag(Flags.PVP, StateFlag.State.DENY);
cuboid.setFlag(Flags.GREET_MESSAGE, "Welcome to my region!");
cuboid.setFlag(Flags.ENTRY, StateFlag.State.DENY);

// Set parent region (child inherits parent flags/owners unless overridden)
ProtectedRegion parentRegion = regions.getRegion("parent-region");
if (parentRegion != null) {
    try {
        cuboid.setParent(parentRegion);
    } catch (ProtectedRegion.CircularInheritanceException e) {
        // handle circular parent chain
    }
}

// Add to manager (parent regions are automatically added too)
regions.addRegion(cuboid);
// Changes auto-save after a brief delay; to force: regions.saveChanges();

// --- Polygonal Region (2D polygon extruded vertically) ---
List<BlockVector2> points = new ArrayList<>();
points.add(BlockVector2.at(0, 0));
points.add(BlockVector2.at(10, 0));
points.add(BlockVector2.at(10, 10));
points.add(BlockVector2.at(0, 10));
int minY = 0;
int maxY = 256;
ProtectedPolygonalRegion polygon = new ProtectedPolygonalRegion("my-polygon", points, minY, maxY);
regions.addRegion(polygon);

// --- Global Region (applies to entire world, no boundaries) ---
GlobalProtectedRegion global = new GlobalProtectedRegion("__global__");
regions.addRegion(global);

// --- Remove a region ---
// RemovalStrategy.UNSET_PARENT_IN_CHILDREN or RemovalStrategy.REMOVE_CHILDREN
regions.removeRegion("my-region", RemovalStrategy.UNSET_PARENT_IN_CHILDREN);
```

### Region Containment and Intersection

```java
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;

// Check if a point is inside a region
boolean inside = region.contains(BlockVector3.at(20, 64, 30));

// Check if a region ID is valid
boolean valid = ProtectedRegion.isValidId("my-region"); // regex: ^[A-Za-z0-9_,'\-\+/]{1,}

// Find overlapping regions
List<ProtectedRegion> candidates = new ArrayList<>(regions.getRegions().values());
List<ProtectedRegion> overlapping = region.getIntersectingRegions(candidates);
```

### Registering Custom Flags

Custom flags MUST be registered in your plugin's `onLoad()` method (before WorldGuard enables and locks the FlagRegistry).

```java
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.flags.Flag;
import com.sk89q.worldguard.protection.flags.StateFlag;
import com.sk89q.worldguard.protection.flags.StringFlag;
import com.sk89q.worldguard.protection.flags.BooleanFlag;
import com.sk89q.worldguard.protection.flags.IntegerFlag;
import com.sk89q.worldguard.protection.flags.DoubleFlag;
import com.sk89q.worldguard.protection.flags.SetFlag;
import com.sk89q.worldguard.protection.flags.registry.FlagConflictException;
import com.sk89q.worldguard.protection.flags.registry.FlagRegistry;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

    // Declare as static so other classes can reference them
    public static StateFlag MY_STATE_FLAG;
    public static StringFlag MY_STRING_FLAG;

    @Override
    public void onLoad() {
        // onLoad(), NOT onEnable() -- FlagRegistry locks after WorldGuard enables
        FlagRegistry registry = WorldGuard.getInstance().getFlagRegistry();
        try {
            // StateFlag(name, defaultValue) -- default true means ALLOW by default
            StateFlag stateFlag = new StateFlag("my-custom-flag", false);
            registry.register(stateFlag);
            MY_STATE_FLAG = stateFlag;

            StringFlag stringFlag = new StringFlag("my-string-flag", "default-value");
            registry.register(stringFlag);
            MY_STRING_FLAG = stringFlag;

        } catch (FlagConflictException e) {
            // Another plugin registered a flag with the same name
            Flag<?> existing = registry.get("my-custom-flag");
            if (existing instanceof StateFlag) {
                MY_STATE_FLAG = (StateFlag) existing;
            }
        }
    }
}
```

Once registered, players can set the flag via `/rg flag <region> my-custom-flag allow/deny` and the value is persisted automatically.

### Session Handlers (React to Flag Changes When Players Move Between Regions)

```java
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.flags.StateFlag.State;
import com.sk89q.worldguard.session.Session;
import com.sk89q.worldguard.session.SessionManager;
import com.sk89q.worldguard.session.handler.FlagValueChangeHandler;
import com.sk89q.worldguard.session.handler.Handler;

public class MyFlagHandler extends FlagValueChangeHandler<State> {

    public static final Factory FACTORY = new Factory();

    public static class Factory extends Handler.Factory<MyFlagHandler> {
        @Override
        public MyFlagHandler create(Session session) {
            return new MyFlagHandler(session);
        }
    }

    public MyFlagHandler(Session session) {
        super(session, MyPlugin.MY_STATE_FLAG);
    }

    @Override
    protected void onInitialValue(LocalPlayer player, ApplicableRegionSet set, State value) {
        // Called when session is initialized
    }

    @Override
    protected boolean onSetValue(LocalPlayer player, Location from, Location to,
                                 ApplicableRegionSet toSet, State currentValue,
                                 State lastValue, MoveType moveType) {
        // Called when the flag value changes (e.g., entering a region with this flag set)
        // Return true to allow movement, false to block
        return true;
    }

    @Override
    protected boolean onAbsentValue(LocalPlayer player, Location from, Location to,
                                    ApplicableRegionSet toSet, State lastValue,
                                    MoveType moveType) {
        // Called when moving to a location where this flag is not set
        return true;
    }
}

// Register the handler (do this in onEnable or after WorldGuard loads):
SessionManager sessionManager = WorldGuard.getInstance().getPlatform().getSessionManager();
sessionManager.registerHandler(MyFlagHandler.FACTORY, null);
```

### WorldGuard Events

WorldGuard currently fires only one custom event:

```java
import com.sk89q.worldguard.bukkit.event.entity.DisallowedPVPEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MyListener implements Listener {

    @EventHandler
    public void onPvPBlocked(DisallowedPVPEvent event) {
        // Fired when WorldGuard blocks PvP
        // Cancel this event to UN-BLOCK the PvP (override WorldGuard's denial)
        event.setCancelled(true);
    }
}
```

### Converting Bukkit Objects

```java
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.world.World;
import com.sk89q.worldguard.LocalPlayer;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;

// Bukkit Player -> WorldGuard LocalPlayer
LocalPlayer localPlayer = WorldGuardPlugin.inst().wrapPlayer(bukkitPlayer);

// Bukkit World -> WorldEdit World
World weWorld = BukkitAdapter.adapt(bukkitWorld);

// Bukkit Location -> WorldEdit Location
com.sk89q.worldedit.util.Location weLoc = BukkitAdapter.adapt(bukkitLocation);

// Bukkit Location -> BlockVector3
BlockVector3 bv3 = BukkitAdapter.asBlockVector(bukkitLocation);
```

---

## API Reference

### Core Access

| Class | Key Members |
|---|---|
| `com.sk89q.worldguard.WorldGuard` | `static getInstance()`, `getPlatform()` returns `WorldGuardPlatform`, `getFlagRegistry()` returns `FlagRegistry` |
| `com.sk89q.worldguard.platform.WorldGuardPlatform` | `getRegionContainer()`, `getSessionManager()`, `getGlobalStateManager()` |
| `com.sk89q.worldguard.bukkit.WorldGuardPlugin` | `static inst()`, `wrapPlayer(Player)` returns `LocalPlayer` |
| `com.sk89q.worldedit.bukkit.BukkitAdapter` | `adapt(org.bukkit.World)`, `adapt(org.bukkit.Location)`, `asBlockVector(org.bukkit.Location)` |

### Region Management

| Class | Key Members |
|---|---|
| `com.sk89q.worldguard.protection.regions.RegionContainer` | `get(World)` returns `RegionManager` (nullable), `createQuery()` returns `RegionQuery` |
| `com.sk89q.worldguard.protection.managers.RegionManager` | `getRegion(String)` returns `ProtectedRegion` (nullable), `getRegions()` returns `Map<String, ProtectedRegion>`, `hasRegion(String)`, `addRegion(ProtectedRegion)`, `removeRegion(String, RemovalStrategy)`, `getApplicableRegions(BlockVector3)` returns `ApplicableRegionSet`, `getApplicableRegions(ProtectedRegion)` returns `ApplicableRegionSet`, `save()`, `saveChanges()`, `load()`, `size()` |
| `com.sk89q.worldguard.protection.regions.RegionQuery` | `getApplicableRegions(Location)` returns `ApplicableRegionSet`, `testState(Location, RegionAssociable, StateFlag...)` returns `boolean`, `queryState(Location, RegionAssociable, StateFlag...)` returns `StateFlag.State`, `queryValue(Location, RegionAssociable, Flag<V>)` returns `V` |
| `com.sk89q.worldguard.protection.regions.RemovalStrategy` | `UNSET_PARENT_IN_CHILDREN`, `REMOVE_CHILDREN` |

### Region Types

| Class | Description |
|---|---|
| `com.sk89q.worldguard.protection.regions.ProtectedRegion` (abstract) | `getId()`, `getPriority()`, `setPriority(int)`, `getParent()`, `setParent(ProtectedRegion)` throws `CircularInheritanceException`, `getOwners()` returns `DefaultDomain`, `getMembers()` returns `DefaultDomain`, `getFlag(Flag<T>)` returns `T`, `setFlag(Flag<T>, T)`, `contains(BlockVector3)`, `getIntersectingRegions(Collection)`, `getMinimumPoint()`, `getMaximumPoint()`, `static isValidId(String)`, `isDirty()` |
| `com.sk89q.worldguard.protection.regions.ProtectedCuboidRegion` | Constructor: `(String id, BlockVector3 min, BlockVector3 max)` |
| `com.sk89q.worldguard.protection.regions.ProtectedPolygonalRegion` | Constructor: `(String id, List<BlockVector2> points, int minY, int maxY)` |
| `com.sk89q.worldguard.protection.regions.GlobalProtectedRegion` | Constructor: `(String id)` -- no boundaries, applies to entire world |

### ApplicableRegionSet

| Class | Key Members |
|---|---|
| `com.sk89q.worldguard.protection.ApplicableRegionSet` | `testState(RegionAssociable, StateFlag...)` returns `boolean`, `queryState(RegionAssociable, StateFlag...)` returns `StateFlag.State`, `queryValue(RegionAssociable, Flag<V>)` returns `V`, `queryAllValues(RegionAssociable, Flag<V>)` returns `Collection<V>`, `size()`, `getRegions()`, iterable over `ProtectedRegion` |
| `com.sk89q.worldguard.protection.RegionResultSet` | Constructor: `(List<ProtectedRegion>, ProtectedRegion global)` -- manual construction of an `ApplicableRegionSet` |

### Domains

| Class | Key Members |
|---|---|
| `com.sk89q.worldguard.domains.DefaultDomain` | `addPlayer(UUID)`, `removePlayer(UUID)`, `addGroup(String)`, `removeGroup(String)`, `contains(UUID)`, `contains(LocalPlayer)`, `getPlayers()`, `getGroups()`, `size()` |

### Flags

| Class | Key Members |
|---|---|
| `com.sk89q.worldguard.protection.flags.Flags` | Static constants for all built-in flags (see list below) |
| `com.sk89q.worldguard.protection.flags.StateFlag` | Constructor: `(String name, boolean default)`. Inner enum: `StateFlag.State` with values `ALLOW`, `DENY` |
| `com.sk89q.worldguard.protection.flags.BooleanFlag` | Constructor: `(String name)` |
| `com.sk89q.worldguard.protection.flags.StringFlag` | Constructor: `(String name, String default)` |
| `com.sk89q.worldguard.protection.flags.IntegerFlag` | Constructor: `(String name)` |
| `com.sk89q.worldguard.protection.flags.DoubleFlag` | Constructor: `(String name)` |
| `com.sk89q.worldguard.protection.flags.SetFlag<T>` | Constructor: `(String name, Flag<T> subFlag)` |
| `com.sk89q.worldguard.protection.flags.MapFlag<K,V>` | Constructor: `(String name, Flag<K> keyFlag, Flag<V> valueFlag)` |
| `com.sk89q.worldguard.protection.flags.EnumFlag<T>` | Constructor: `(String name, Class<T> enumClass)` |
| `com.sk89q.worldguard.protection.flags.LocationFlag` | Constructor: `(String name)` |
| `com.sk89q.worldguard.protection.flags.registry.FlagRegistry` | `register(Flag<?>)` throws `FlagConflictException`, `get(String)` returns `Flag<?>`, `getAll()` returns `Collection<Flag<?>>` |
| `com.sk89q.worldguard.protection.flags.registry.FlagConflictException` | Thrown when registering a flag name that already exists |

### Built-in Flag Constants (com.sk89q.worldguard.protection.flags.Flags)

**StateFlags:** `PASSTHROUGH`, `BUILD`, `BLOCK_BREAK`, `BLOCK_PLACE`, `USE`, `INTERACT`, `DAMAGE_ANIMALS`, `PVP`, `SLEEP`, `RESPAWN_ANCHORS`, `TNT`, `CHEST_ACCESS`, `PLACE_VEHICLE`, `DESTROY_VEHICLE`, `LIGHTER`, `RIDE`, `POTION_SPLASH`, `ITEM_FRAME_ROTATE`, `TRAMPLE_BLOCKS`, `FIREWORK_DAMAGE`, `USE_ANVIL`, `USE_DRIPLEAF`, `ITEM_PICKUP`, `ITEM_DROP`, `EXP_DROPS`, `MOB_DAMAGE`, `CREEPER_EXPLOSION`, `ENDERDRAGON_BLOCK_DAMAGE`, `GHAST_FIREBALL`, `OTHER_EXPLOSION`, `WITHER_DAMAGE`, `ENDER_BUILD`, `SNOWMAN_TRAILS`, `RAVAGER_RAVAGE`, `ENTITY_PAINTING_DESTROY`, `ENTITY_ITEM_FRAME_DESTROY`, `MOB_SPAWNING`, `PISTONS`, `FIRE_SPREAD`, `LAVA_FIRE`, `LIGHTNING`, `SNOW_FALL`, `SNOW_MELT`, `ICE_FORM`, `ICE_MELT`, `FROSTED_ICE_MELT`, `FROSTED_ICE_FORM`, `MUSHROOMS`, `LEAF_DECAY`, `GRASS_SPREAD`, `MYCELIUM_SPREAD`, `VINE_GROWTH`, `ROCK_GROWTH`, `SCULK_GROWTH`, `CROP_GROWTH`, `SOIL_DRY`, `CORAL_FADE`, `COPPER_FADE`, `WATER_FLOW`, `LAVA_FLOW`, `SEND_CHAT`, `RECEIVE_CHAT`, `ENTRY`, `EXIT`, `EXIT_VIA_TELEPORT`, `ENDERPEARL`, `CHORUS_TELEPORT`, `INVINCIBILITY`, `FALL_DAMAGE`, `HEALTH_REGEN`, `HUNGER_DRAIN`

**IntegerFlags:** `HEAL_DELAY`, `HEAL_AMOUNT`, `FEED_DELAY`, `FEED_AMOUNT`, `MIN_FOOD`, `MAX_FOOD`

**DoubleFlags:** `MIN_HEAL`, `MAX_HEAL`

**StringFlags:** `TIME_LOCK`, `GREET_MESSAGE`, `FAREWELL_MESSAGE`, `GREET_TITLE`, `FAREWELL_TITLE`, `DENY_MESSAGE`, `ENTRY_DENY_MESSAGE`, `EXIT_DENY_MESSAGE`

**LocationFlags:** `TELE_LOC`, `SPAWN_LOC`

**SetFlags:** `ALLOWED_CMDS` (SetFlag\<String\>), `BLOCKED_CMDS` (SetFlag\<String\>), `DENY_SPAWN` (SetFlag\<EntityType\>), `NONPLAYER_PROTECTION_DOMAINS` (SetFlag\<String\>)

**BooleanFlags:** `EXIT_OVERRIDE`, `NOTIFY_ENTER`, `NOTIFY_LEAVE`

**RegistryFlags:** `WEATHER_LOCK` (WeatherType), `GAME_MODE` (GameMode)

### Session Handling

| Class | Key Members |
|---|---|
| `com.sk89q.worldguard.session.SessionManager` | `registerHandler(Handler.Factory, Handler.Factory)`, `hasBypass(LocalPlayer, World)` returns `boolean` |
| `com.sk89q.worldguard.session.Session` | Represents a player's session with WorldGuard |
| `com.sk89q.worldguard.session.handler.Handler` | Base class. Inner class: `Handler.Factory<T>` with abstract `create(Session)` |
| `com.sk89q.worldguard.session.handler.FlagValueChangeHandler<T>` | Extend this for reacting to flag value changes. Methods: `onInitialValue(LocalPlayer, ApplicableRegionSet, T)`, `onSetValue(LocalPlayer, Location, Location, ApplicableRegionSet, T, T, MoveType)` returns `boolean`, `onAbsentValue(LocalPlayer, Location, Location, ApplicableRegionSet, T, MoveType)` returns `boolean` |

### Events

| Class | Description |
|---|---|
| `com.sk89q.worldguard.bukkit.event.entity.DisallowedPVPEvent` | Fired when WorldGuard blocks PvP. Cancel the event to override and allow the PvP. |

### Other

| Class | Key Members |
|---|---|
| `com.sk89q.worldguard.LocalPlayer` | Interface extending `com.sk89q.worldedit.entity.Player` and `RegionAssociable`. Methods: `hasGroup(String)`, `getHealth()`, `getAssociation(List<ProtectedRegion>)` |
| `com.sk89q.worldguard.protection.association.RegionAssociable` | Interface. `getAssociation(List<ProtectedRegion>)` returns `Association` |
| `com.sk89q.worldguard.protection.association.DelayedRegionOverlapAssociation` | Constructor: `(RegionQuery, Location, boolean)` -- use for non-player entities |
