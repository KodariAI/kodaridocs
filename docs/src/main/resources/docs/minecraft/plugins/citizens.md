# Citizens API Reference

Citizens is the premier NPC plugin for Bukkit/Spigot/Paper servers. The API lets plugins create, configure, and control server-side NPCs with custom skins, equipment, AI, pathfinding, and traits.

## Data Hierarchy / Class Overview

```
CitizensAPI (static entry point)
  |
  +-- NPCRegistry (stores and manages NPC instances)
  |     +-- NPC (single NPC instance)
  |           +-- Navigator (pathfinding and movement)
  |           |     +-- NavigatorParameters (speed, range, stuck action)
  |           +-- GoalController (AI goals with priorities)
  |           +-- Trait (attachable persistent behavior modules)
  |           |     +-- SkinTrait (player skin management)
  |           |     +-- Equipment (armor/hand items)
  |           |     +-- LookClose (look at nearby players)
  |           |     +-- Custom traits you create
  |           +-- MetadataStore via data() (key-value metadata)
  |           +-- Entity via getEntity() (Bukkit entity when spawned)
  |
  +-- TraitFactory (registers custom trait classes)
  +-- LocationLookup (spatial queries for nearby NPCs/players)
```

**Key rule:** Always access Citizens through `CitizensAPI` static methods. Never instantiate internal classes directly.

**Key rule:** Do NOT call `npc.getEntity()` before the NPC is spawned. Check `npc.isSpawned()` first or use it inside `onSpawn()`.

**Key rule:** Wait for `CitizensEnableEvent` before accessing `CitizensAPI` if you soft-depend on Citizens.

## Code Examples

### Get the NPC Registry

```java
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.api.npc.NPCRegistry;

NPCRegistry registry = CitizensAPI.getNPCRegistry();
```

### Create and Spawn an NPC

```java
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.api.npc.NPCRegistry;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;

NPCRegistry registry = CitizensAPI.getNPCRegistry();
NPC npc = registry.createNPC(EntityType.PLAYER, "MyNPC");
npc.spawn(player.getLocation());
```

### Create NPC Spawned at a Location (one-liner)

```java
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;

NPC npc = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, "Guard", new Location(world, 100, 64, 200));
```

### Set NPC Skin (by player name)

```java
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.trait.SkinTrait;
import org.bukkit.entity.EntityType;

NPC npc = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, "SkinNPC");

// Set skin BEFORE spawning to avoid double skin load
SkinTrait skinTrait = npc.getOrAddTrait(SkinTrait.class);
skinTrait.setSkinName("Notch");

npc.spawn(location);
```

### Set NPC Skin (by texture + signature)

```java
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.trait.SkinTrait;
import org.bukkit.entity.EntityType;

NPC npc = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, "CustomSkin");

// Use texture data from mineskin.org or Mojang API
SkinTrait skinTrait = npc.getOrAddTrait(SkinTrait.class);
skinTrait.setSkinPersistent("uniqueSkinId", signature, textureData);

npc.spawn(location);
```

### Copy Skin from Online Player

```java
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.trait.SkinTrait;
import org.bukkit.entity.Player;

SkinTrait skinTrait = npc.getOrAddTrait(SkinTrait.class);
skinTrait.setSkinPersistent(player); // copies skin from the Player object
```

### Set NPC Name

```java
import net.citizensnpcs.api.npc.NPC;

npc.setName("&aGuard NPC"); // supports color codes
```

### Equip an NPC with Armor and Items

```java
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.api.trait.trait.Equipment;
import net.citizensnpcs.api.trait.trait.Equipment.EquipmentSlot;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

Equipment equipment = npc.getOrAddTrait(Equipment.class);
equipment.set(EquipmentSlot.HELMET, new ItemStack(Material.DIAMOND_HELMET));
equipment.set(EquipmentSlot.CHESTPLATE, new ItemStack(Material.DIAMOND_CHESTPLATE));
equipment.set(EquipmentSlot.LEGGINGS, new ItemStack(Material.DIAMOND_LEGGINGS));
equipment.set(EquipmentSlot.BOOTS, new ItemStack(Material.DIAMOND_BOOTS));
equipment.set(EquipmentSlot.HAND, new ItemStack(Material.DIAMOND_SWORD));
equipment.set(EquipmentSlot.OFF_HAND, new ItemStack(Material.SHIELD));
```

### Make NPC Look at Nearby Players

```java
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.trait.LookClose;

LookClose lookClose = npc.getOrAddTrait(LookClose.class);
lookClose.lookClose(true);
lookClose.setRange(10);
lookClose.setRealisticLooking(true);
```

### Navigate NPC to a Location

```java
import net.citizensnpcs.api.ai.Navigator;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Location;

Navigator navigator = npc.getNavigator();
navigator.setTarget(targetLocation);

// Customize speed
navigator.getDefaultParameters().speedModifier(1.5f);

// Check if currently navigating
if (navigator.isNavigating()) {
    navigator.cancelNavigation();
}
```

### Navigate NPC to an Entity (follow/attack)

```java
import net.citizensnpcs.api.ai.Navigator;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.entity.Entity;

Navigator navigator = npc.getNavigator();
navigator.setTarget(targetEntity, false); // false = follow, true = attack
```

### Teleport an NPC

```java
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;

npc.teleport(new Location(world, 100, 64, 200), TeleportCause.PLUGIN);
```

### Despawn and Destroy NPCs

```java
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.api.event.DespawnReason;

// Temporarily remove from world (can re-spawn later)
npc.despawn();
npc.despawn(DespawnReason.PLUGIN);

// Permanently delete the NPC
npc.destroy();
```

### Check if an Entity is a Citizens NPC

```java
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.entity.Entity;

// Method 1: Registry lookup
boolean isNPC = CitizensAPI.getNPCRegistry().isNPC(entity);

// Method 2: Metadata check (works without importing Citizens API)
boolean isNPC2 = entity.hasMetadata("NPC");

// Get the NPC object from entity
NPC npc = CitizensAPI.getNPCRegistry().getNPC(entity);
```

### Look Up NPCs by ID or UUID

```java
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import java.util.UUID;

NPC npc = CitizensAPI.getNPCRegistry().getById(42);
NPC npc2 = CitizensAPI.getNPCRegistry().getByUniqueId(someUUID);
```

### Iterate All NPCs

```java
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;

for (NPC npc : CitizensAPI.getNPCRegistry()) {
    // registry is Iterable<NPC>
}

// Sorted by ID
for (NPC npc : CitizensAPI.getNPCRegistry().sorted()) {
    // ...
}
```

### Listen for NPC Click Events

```java
import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.event.NPCLeftClickEvent;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class NPCClickListener implements Listener {

    @EventHandler
    public void onNPCRightClick(NPCRightClickEvent event) {
        NPC npc = event.getNPC();
        Player player = event.getClicker();
        player.sendMessage("You right-clicked NPC: " + npc.getName() + " (ID: " + npc.getId() + ")");
    }

    @EventHandler
    public void onNPCLeftClick(NPCLeftClickEvent event) {
        NPC npc = event.getNPC();
        Player player = event.getClicker();
        // handle left click
    }
}
```

### Listen for NPC Spawn/Despawn Events

```java
import net.citizensnpcs.api.event.NPCSpawnEvent;
import net.citizensnpcs.api.event.NPCDespawnEvent;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class NPCLifecycleListener implements Listener {

    @EventHandler
    public void onNPCSpawn(NPCSpawnEvent event) {
        NPC npc = event.getNPC();
        // event.getLocation() returns spawn location
    }

    @EventHandler
    public void onNPCDespawn(NPCDespawnEvent event) {
        NPC npc = event.getNPC();
        // event.getReason() returns DespawnReason
    }
}
```

### Listen for Navigation Events

```java
import net.citizensnpcs.api.ai.event.NavigationBeginEvent;
import net.citizensnpcs.api.ai.event.NavigationCompleteEvent;
import net.citizensnpcs.api.ai.event.NavigationCancelEvent;
import net.citizensnpcs.api.ai.event.CancelReason;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class NavListener implements Listener {

    @EventHandler
    public void onNavComplete(NavigationCompleteEvent event) {
        NPC npc = event.getNPC();
        // NPC reached its target
    }

    @EventHandler
    public void onNavCancel(NavigationCancelEvent event) {
        CancelReason reason = event.getCancelReason();
        // CancelReason values: PLUGIN, REPLACE, STUCK, NPC_DESPAWNED, TARGET_DIED, TARGET_MOVED_WORLD
    }
}
```

### Create a Custom Trait

```java
import net.citizensnpcs.api.persistence.Persist;
import net.citizensnpcs.api.trait.Trait;
import net.citizensnpcs.api.trait.TraitName;
import net.citizensnpcs.api.event.NPCRightClickEvent;
import org.bukkit.event.EventHandler;

@TraitName("greeting")
public class GreetingTrait extends Trait {

    @Persist("message")
    private String greetingMessage = "Hello!";

    public GreetingTrait() {
        super("greeting");
    }

    public void setGreeting(String message) {
        this.greetingMessage = message;
    }

    @Override
    public void onAttach() {
        // Called when trait is attached to NPC. getNPC() is available here.
    }

    @Override
    public void onSpawn() {
        // Called when NPC spawns. getEntity() is safe to use here.
    }

    @Override
    public void onDespawn() {
        // Called before NPC is removed from world.
    }

    @Override
    public void run() {
        // Called every tick. Only override if needed.
    }

    // Trait classes can directly listen for NPC events
    @EventHandler
    public void onClick(NPCRightClickEvent event) {
        if (event.getNPC() == this.getNPC()) {
            event.getClicker().sendMessage(greetingMessage);
        }
    }
}
```

### Register a Custom Trait

```java
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.trait.TraitInfo;

// Call this during onEnable() or in response to CitizensEnableEvent
CitizensAPI.getTraitFactory().registerTrait(TraitInfo.create(GreetingTrait.class));
```

### Attach a Trait to an NPC

```java
import net.citizensnpcs.api.npc.NPC;

// getOrAddTrait returns existing instance or creates and attaches a new one
GreetingTrait greeting = npc.getOrAddTrait(GreetingTrait.class);
greeting.setGreeting("Welcome!");

// Check if NPC has a trait
boolean has = npc.hasTrait(GreetingTrait.class);

// Remove a trait
npc.removeTrait(GreetingTrait.class);
```

### Wait for Citizens to Load (soft-depend pattern)

```java
import net.citizensnpcs.api.event.CitizensEnableEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onCitizensEnable(CitizensEnableEvent event) {
        // Safe to use CitizensAPI here
        // Register traits, access registry, etc.
    }
}
```

### NPC Configuration Flags

```java
import net.citizensnpcs.api.npc.NPC;

npc.setProtected(true);       // invulnerable to damage
npc.setFlyable(true);         // can fly during pathfinding
npc.setUseMinecraftAI(false); // disable vanilla AI (default)
npc.setSneaking(true);        // visual sneaking pose
npc.setAlwaysUseNameHologram(true); // force hologram name display
```

### Add AI Goals

```java
import net.citizensnpcs.api.ai.Goal;
import net.citizensnpcs.api.ai.GoalController;
import net.citizensnpcs.api.ai.GoalSelector;
import net.citizensnpcs.api.npc.NPC;

GoalController goals = npc.getDefaultGoalController();
goals.addGoal(new Goal() {
    @Override
    public boolean shouldExecute(GoalSelector selector) {
        return true; // return true to start executing
    }

    @Override
    public void run(GoalSelector selector) {
        // do work each tick
        selector.finish(); // call when done
    }

    @Override
    public void reset() {
        // cleanup
    }
}, 1); // priority (lower = higher priority)
```

### Clone an NPC

```java
import net.citizensnpcs.api.npc.NPC;

NPC clone = npc.clone();     // creates a copy with new ID
NPC copy = npc.copy();       // alternative copy method
clone.spawn(newLocation);
```

## API Reference (Trimmed)

### Core Entry Points

**`net.citizensnpcs.api.CitizensAPI`** -- Static entry point for the entire API.
- `static NPCRegistry getNPCRegistry()` -- main registry
- `static NPCRegistry getTemporaryNPCRegistry()` -- NPCs not saved to disk
- `static NPCRegistry createNamedNPCRegistry(String name, NPCDataStore store)` -- custom registry
- `static NPCRegistry createInMemoryNPCRegistry(String name)` -- in-memory only registry
- `static NPCRegistry getNamedNPCRegistry(String name)` -- retrieve named registry
- `static void removeNamedNPCRegistry(String name)` -- remove named registry
- `static TraitFactory getTraitFactory()` -- for registering custom traits
- `static LocationLookup getLocationLookup()` -- spatial NPC/player queries
- `static Plugin getPlugin()` -- Citizens plugin instance
- `static boolean hasImplementation()` -- check if Citizens is loaded
- `static void registerEvents(Listener listener)` -- register event listener

### NPC Interface

**`net.citizensnpcs.api.npc.NPC`** -- Represents a single NPC.

Identity:
- `int getId()`
- `UUID getUniqueId()`
- `String getName()`
- `String getFullName()`
- `void setName(String name)`

Spawning:
- `boolean spawn(Location location)`
- `boolean spawn(Location at, SpawnReason reason)`
- `boolean spawn(Location at, SpawnReason reason, Consumer<Entity> callback)`
- `boolean despawn()`
- `boolean despawn(DespawnReason reason)`
- `boolean isSpawned()`
- `void destroy()` -- permanent removal
- `void destroy(CommandSender source)`

Entity access:
- `Entity getEntity()` -- only valid when `isSpawned()` is true
- `Location getStoredLocation()` -- last known location even when despawned
- `void teleport(Location location, TeleportCause cause)`
- `void faceLocation(Location location)`
- `void setMoveDestination(Location destination)`

Traits:
- `<T extends Trait> T getOrAddTrait(Class<T> trait)` -- preferred method
- `<T extends Trait> T getTraitNullable(Class<T> trait)` -- returns null if absent
- `boolean hasTrait(Class<? extends Trait> trait)`
- `void addTrait(Trait trait)`
- `void removeTrait(Class<? extends Trait> trait)`
- `Iterable<Trait> getTraits()`

Configuration:
- `void setProtected(boolean isProtected)` / `boolean isProtected()`
- `void setFlyable(boolean flyable)` / `boolean isFlyable()`
- `void setUseMinecraftAI(boolean use)` / `boolean useMinecraftAI()`
- `void setSneaking(boolean sneaking)`
- `void setBukkitEntityType(EntityType type)`
- `void setAlwaysUseNameHologram(boolean use)`

AI:
- `Navigator getNavigator()`
- `GoalController getDefaultGoalController()`
- `MetadataStore data()`
- `NPC clone()` / `NPC copy()`

### NPCRegistry Interface

**`net.citizensnpcs.api.npc.NPCRegistry`** -- Manages NPC creation and lookup. Implements `Iterable<NPC>`.

- `NPC createNPC(EntityType type, String name)` -- create despawned
- `NPC createNPC(EntityType type, String name, Location loc)` -- create and spawn
- `NPC createNPCUsingItem(EntityType type, String name, ItemStack item)` -- item-type NPC
- `NPC getById(int id)`
- `NPC getByUniqueId(UUID uuid)`
- `NPC getByUniqueIdGlobal(UUID uuid)`
- `NPC getNPC(Entity entity)` -- entity to NPC
- `boolean isNPC(Entity entity)`
- `void deregister(NPC npc)` -- remove NPC and its data
- `void deregisterAll()`
- `void despawnNPCs(DespawnReason reason)`
- `Iterable<NPC> sorted()` -- sorted by ID
- `void saveToStore()`

### Navigator Interface

**`net.citizensnpcs.api.ai.Navigator`** -- Controls NPC pathfinding.

- `void setTarget(Location location)` -- walk to location
- `void setTarget(Entity entity, boolean aggressive)` -- follow or attack entity
- `void setStraightLineTarget(Location location)` -- direct line movement
- `void setStraightLineTarget(Entity entity, boolean aggressive)`
- `void cancelNavigation()`
- `void cancelNavigation(CancelReason reason)`
- `boolean isNavigating()`
- `boolean isPaused()` / `void setPaused(boolean paused)`
- `boolean canNavigateTo(Location location)`
- `NavigatorParameters getDefaultParameters()` -- persistent settings
- `NavigatorParameters getLocalParameters()` -- current-navigation-only settings
- `Location getTargetAsLocation()`
- `EntityTarget getEntityTarget()`
- `NPC getNPC()`

### NavigatorParameters

**`net.citizensnpcs.api.ai.NavigatorParameters`** -- Fluent builder for pathfinding settings.

- `float speed()` / `NavigatorParameters speed(float speed)`
- `float speedModifier()` / `NavigatorParameters speedModifier(float percent)`
- `float range()` / `NavigatorParameters range(float range)`
- `double distanceMargin()` / `NavigatorParameters distanceMargin(double margin)`
- `double attackRange()` / `NavigatorParameters attackRange(double range)`
- `int attackDelayTicks()` / `NavigatorParameters attackDelayTicks(int ticks)`
- `boolean avoidWater()` / `NavigatorParameters avoidWater(boolean avoid)`
- `int stationaryTicks()` / `NavigatorParameters stationaryTicks(int ticks)`
- `StuckAction stuckAction()` / `NavigatorParameters stuckAction(StuckAction action)`
- `AttackStrategy defaultAttackStrategy()` / `NavigatorParameters defaultAttackStrategy(AttackStrategy strategy)`
- `NavigatorParameters addRunCallback(Runnable callback)`
- `NavigatorParameters addSingleUseCallback(NavigatorCallback callback)`
- `boolean useNewPathfinder()` / `NavigatorParameters useNewPathfinder(boolean use)`
- `int updatePathRate()` / `NavigatorParameters updatePathRate(int rate)`

### GoalController Interface

**`net.citizensnpcs.api.ai.GoalController`** -- AI goal management.

- `void addGoal(Goal goal, int priority)`
- `void removeGoal(Goal goal)`
- `void addBehavior(Behavior behavior, int priority)`
- `void removeBehavior(Behavior behavior)`
- `void cancelCurrentExecution()`
- `boolean isExecutingGoal()`
- `boolean isPaused()` / `void setPaused(boolean paused)`
- `void clear()`

### Goal Interface

**`net.citizensnpcs.api.ai.Goal`**
- `boolean shouldExecute(GoalSelector selector)`
- `void run(GoalSelector selector)`
- `void reset()`

### GoalSelector Interface

**`net.citizensnpcs.api.ai.GoalSelector`**
- `void finish()` -- mark goal as complete
- `void finishAndRemove()` -- complete and remove goal
- `void select(Goal goal)` -- switch to another goal
- `void selectAdditional(Goal[] goals)`

### Trait Base Class

**`net.citizensnpcs.api.trait.Trait`** -- Base class for all traits.

- `String getName()`
- `NPC getNPC()`
- `void onAttach()` -- NPC reference available
- `void onSpawn()` -- entity available, safe to call `getNPC().getEntity()`
- `void onDespawn()` / `void onDespawn(DespawnReason reason)`
- `void onRemove()` / `void onRemove(RemoveReason reason)`
- `void onCopy()`
- `void onPreSpawn()`
- `void run()` -- called every tick if overridden
- `void load(DataKey key)` / `void save(DataKey key)`

### TraitInfo

**`net.citizensnpcs.api.trait.TraitInfo`** -- Used to register traits.
- `static TraitInfo create(Class<? extends Trait> clazz)` -- create from annotated class

### TraitName Annotation

**`net.citizensnpcs.api.trait.TraitName`** -- Annotate trait classes with `@TraitName("name")`.

### TraitFactory

**`net.citizensnpcs.api.trait.TraitFactory`** -- Register custom traits.
- `void registerTrait(TraitInfo info)`

### Persist Annotation

**`net.citizensnpcs.api.persistence.Persist`** -- Auto-save/load trait fields.
- `@Persist` -- uses field name as key
- `@Persist("customKey")` -- custom storage key
- `@Persist(value="key", required=true)` -- required field

### Built-in Traits

**`net.citizensnpcs.trait.SkinTrait`** -- Player skin management.
- `void setSkinName(String name)` -- set by player name, respawns if spawned
- `void setSkinName(String name, boolean forceUpdate)`
- `void setSkinPersistent(String skinName, String signature, String textureData)` -- raw texture data
- `void setSkinPersistent(Player player)` -- copy from online player
- `String getSkinName()`
- `String getTexture()` / `String getSignature()`
- `void clearTexture()`
- `boolean fetchDefaultSkin()` / `void setFetchDefaultSkin(boolean fetch)`
- `boolean shouldUpdateSkins()` / `void setShouldUpdateSkins(boolean update)`

**`net.citizensnpcs.api.trait.trait.Equipment`** -- NPC equipment/armor.
- `void set(EquipmentSlot slot, ItemStack item)`
- `ItemStack get(EquipmentSlot slot)`
- `ItemStack[] getEquipment()`
- `Map<EquipmentSlot, ItemStack> getEquipmentBySlot()`

**`net.citizensnpcs.api.trait.trait.Equipment.EquipmentSlot`** -- Enum: `HAND`, `HELMET`, `CHESTPLATE`, `LEGGINGS`, `BOOTS`, `OFF_HAND`, `BODY`, `SADDLE`

**`net.citizensnpcs.trait.LookClose`** -- Look at nearby players.
- `void lookClose(boolean enable)`
- `boolean isEnabled()` / `boolean toggle()`
- `void setRange(double range)` / `double getRange()`
- `void setRealisticLooking(boolean realistic)`
- `void setHeadOnly(boolean headOnly)`
- `void setRandomLook(boolean enable)`
- `void setRandomLookDelay(int delay)`
- `void setDisableWhileNavigating(boolean set)`
- `void setPerPlayer(boolean perPlayer)`
- `void setTargetNPCs(boolean target)`

### Events

**NPC interaction events** (all in `net.citizensnpcs.api.event`):

| Event | Key Methods |
|---|---|
| `NPCRightClickEvent` | `getNPC()`, `getClicker()` |
| `NPCLeftClickEvent` | `getNPC()`, `getClicker()` |
| `NPCClickEvent` | base class for click events |
| `NPCSpawnEvent` | `getNPC()`, `getLocation()` |
| `NPCDespawnEvent` | `getNPC()`, `getReason()` |
| `NPCCreateEvent` | `getNPC()` |
| `NPCRemoveEvent` | `getNPC()` |
| `NPCDeathEvent` | `getNPC()` |
| `NPCDamageEvent` | `getNPC()` |
| `NPCDamageByEntityEvent` | `getNPC()`, `getDamager()` |
| `NPCDamageByBlockEvent` | `getNPC()` |
| `NPCDamageEntityEvent` | `getNPC()`, `getDamaged()` |
| `NPCCollisionEvent` | `getNPC()` |
| `NPCPushEvent` | `getNPC()` |
| `NPCTeleportEvent` | `getNPC()` |
| `NPCSelectEvent` | `getNPC()` |
| `NPCCloneEvent` | `getNPC()` |
| `NPCAddTraitEvent` | `getNPC()`, `getTrait()` |
| `NPCRemoveTraitEvent` | `getNPC()` |
| `EntityTargetNPCEvent` | `getNPC()` |
| `CitizensEnableEvent` | fired when Citizens is ready |
| `CitizensReloadEvent` | fired on `/citizens reload` |
| `CommandSenderCreateNPCEvent` | `getNPC()`, `getCreator()` -- cancellable |
| `PlayerCreateNPCEvent` | `getNPC()`, `getCreator()` -- cancellable |

**Navigation events** (in `net.citizensnpcs.api.ai.event`):

| Event | Key Methods |
|---|---|
| `NavigationBeginEvent` | `getNPC()`, `getNavigator()` |
| `NavigationCompleteEvent` | `getNPC()`, `getNavigator()` |
| `NavigationCancelEvent` | `getNPC()`, `getNavigator()`, `getCancelReason()` |
| `NavigationReplaceEvent` | extends `NavigationCancelEvent` |
| `NavigationStuckEvent` | `getNPC()`, `getAction()`, `setAction(StuckAction)` |

### Enums

**`net.citizensnpcs.api.event.SpawnReason`** -- `CHUNK_LOAD`, `COMMAND`, `CREATE`, `PLUGIN`, `RESPAWN`, `TIMED_RESPAWN`

**`net.citizensnpcs.api.event.DespawnReason`** -- `CHUNK_UNLOAD`, `DEATH`, `PENDING_RESPAWN`, `PLUGIN`, `RELOAD`, `REMOVAL`, `WORLD_UNLOAD`

**`net.citizensnpcs.api.ai.event.CancelReason`** -- `NPC_DESPAWNED`, `PLUGIN`, `REPLACE`, `STUCK`, `TARGET_DIED`, `TARGET_MOVED_WORLD`

### LocationLookup

**`net.citizensnpcs.api.LocationLookup`** -- Spatial queries.
- `Iterable<NPC> getNearbyNPCs(Location base, double dist)`
- `Iterable<NPC> getNearbyNPCs(NPC npc)`
- `Iterable<Player> getNearbyPlayers(Location base, double dist)`
- `Iterable<Player> getNearbyPlayers(NPC npc)`
- `Iterable<Player> getNearbyVisiblePlayers(Entity entity, double range)`
