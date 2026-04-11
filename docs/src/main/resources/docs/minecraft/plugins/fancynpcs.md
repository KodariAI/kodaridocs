# FancyNpcs API Reference

Lightweight packet-based NPC plugin for Paper and Folia servers. Supports player and entity-type NPCs with skins, actions, equipment, glowing, and click interactions. By FancyInnovations (formerly FancyMcPlugins).

## Code Examples

### Get the NPC Manager

```java
import de.oliver.fancynpcs.api.FancyNpcsPlugin;
import de.oliver.fancynpcs.api.NpcManager;

NpcManager npcManager = FancyNpcsPlugin.get().getNpcManager();
```

### Create and Spawn an NPC

```java
import de.oliver.fancynpcs.api.FancyNpcsPlugin;
import de.oliver.fancynpcs.api.Npc;
import de.oliver.fancynpcs.api.NpcData;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.UUID;

// Step 1: Build NpcData (name must be unique)
Location spawnLoc = player.getLocation();
NpcData data = new NpcData("shop_keeper", player.getUniqueId(), spawnLoc);
data.setDisplayName("<green>Shop Keeper</green>");  // MiniMessage format
data.setTurnToPlayer(true);
data.setScale(1.0f);

// Step 2: Create Npc instance via adapter (version-specific factory)
Npc npc = FancyNpcsPlugin.get().getNpcAdapter().apply(data);

// Step 3: Register, create, and spawn
FancyNpcsPlugin.get().getNpcManager().registerNpc(npc);
npc.create();
npc.spawnForAll();
```

**Important:** Do not register NPCs until at least 10 seconds after server startup, or wait for `NpcsLoadedEvent`.

### Set NPC Skin

```java
import de.oliver.fancynpcs.api.FancyNpcsPlugin;
import de.oliver.fancynpcs.api.Npc;
import de.oliver.fancynpcs.api.NpcData;
import de.oliver.fancynpcs.api.skins.SkinData;

Npc npc = FancyNpcsPlugin.get().getNpcManager().getNpc("shop_keeper");
NpcData data = npc.getData();

// By username
data.setSkin("Notch");

// By username with slim variant
data.setSkin("Notch", SkinData.SkinVariant.SLIM);

// By URL
data.setSkin("https://example.com/skin.png");

// Mirror the interacting player's skin
data.setMirrorSkin(true);

// Skin changes require respawn
npc.removeForAll();
npc.spawnForAll();
```

The `setSkin(String)` method accepts a player username, UUID, URL, or filename. It resolves via `SkinManager.getByIdentifier()` internally.

### Add Click Actions to an NPC

```java
import de.oliver.fancynpcs.api.FancyNpcsPlugin;
import de.oliver.fancynpcs.api.Npc;
import de.oliver.fancynpcs.api.NpcData;
import de.oliver.fancynpcs.api.actions.ActionManager;
import de.oliver.fancynpcs.api.actions.ActionTrigger;
import de.oliver.fancynpcs.api.actions.NpcAction;

Npc npc = FancyNpcsPlugin.get().getNpcManager().getNpc("shop_keeper");
NpcData data = npc.getData();
ActionManager actionManager = FancyNpcsPlugin.get().getActionManager();

// Look up built-in action types by name
NpcAction messageAction = actionManager.getActionByName("message");
NpcAction consoleCmd = actionManager.getActionByName("console_command");
NpcAction playerCmd = actionManager.getActionByName("player_command");

// addAction(trigger, order, action, value)
// order determines execution sequence (lower = first)
data.addAction(ActionTrigger.RIGHT_CLICK, 0, messageAction, "<gold>Welcome to the shop!</gold>");
data.addAction(ActionTrigger.RIGHT_CLICK, 1, consoleCmd, "give {player} diamond 1");
data.addAction(ActionTrigger.LEFT_CLICK, 0, playerCmd, "warp spawn");

npc.updateForAll();
```

**Built-in action names:** `message`, `console_command`, `player_command`, `player_command_as_op`, `send_to_server`, `execute_random_action`, `wait`, `block_until_done`, `need_permission`, `play_sound`

- `console_command` and `player_command` support `{player}` placeholder
- `wait` value is in seconds (e.g. `"5"`)
- `need_permission` value is a permission node; prefix with `!` to invert

### Set onClick Callback (Alternative to Actions)

```java
import de.oliver.fancynpcs.api.FancyNpcsPlugin;
import de.oliver.fancynpcs.api.Npc;

Npc npc = FancyNpcsPlugin.get().getNpcManager().getNpc("shop_keeper");

// Simple callback -- runs on any click
npc.getData().setOnClick(player -> {
    player.sendMessage("You clicked the NPC!");
    player.performCommand("menu open shop");
});

npc.updateForAll();
```

### Set NPC Equipment

```java
import de.oliver.fancynpcs.api.FancyNpcsPlugin;
import de.oliver.fancynpcs.api.Npc;
import de.oliver.fancynpcs.api.utils.NpcEquipmentSlot;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

Npc npc = FancyNpcsPlugin.get().getNpcManager().getNpc("shop_keeper");

npc.getData().addEquipment(NpcEquipmentSlot.MAINHAND, new ItemStack(Material.DIAMOND_SWORD));
npc.getData().addEquipment(NpcEquipmentSlot.HEAD, new ItemStack(Material.DIAMOND_HELMET));
npc.getData().addEquipment(NpcEquipmentSlot.OFFHAND, new ItemStack(Material.SHIELD));

npc.updateForAll();
```

### Set NPC Entity Type and Glowing

```java
import de.oliver.fancynpcs.api.FancyNpcsPlugin;
import de.oliver.fancynpcs.api.Npc;
import de.oliver.fancynpcs.api.NpcData;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.EntityType;

NpcData data = new NpcData("pet_wolf", creatorUUID, location);
data.setType(EntityType.WOLF);
data.setGlowing(true);
data.setGlowingColor(NamedTextColor.GREEN);
data.setDisplayName("<white>Pet Wolf</white>");

Npc npc = FancyNpcsPlugin.get().getNpcAdapter().apply(data);
FancyNpcsPlugin.get().getNpcManager().registerNpc(npc);
npc.create();
npc.spawnForAll();
```

### Modify an Existing NPC

```java
import de.oliver.fancynpcs.api.FancyNpcsPlugin;
import de.oliver.fancynpcs.api.Npc;
import de.oliver.fancynpcs.api.NpcData;
import org.bukkit.Location;

Npc npc = FancyNpcsPlugin.get().getNpcManager().getNpc("shop_keeper");
NpcData data = npc.getData();

data.setDisplayName("<red>Closed</red>");
data.setLocation(new Location(world, 100, 65, 200, 90f, 0f));
data.setCollidable(false);
data.setShowInTab(false);
data.setInteractionCooldown(3.0f);       // seconds between interactions
data.setVisibilityDistance(50);            // blocks
data.setSpawnEntity(true);

// For most changes, updateForAll is enough
npc.updateForAll();

// For skin/type changes, respawn is required
npc.removeForAll();
npc.spawnForAll();
```

### Remove an NPC

```java
import de.oliver.fancynpcs.api.FancyNpcsPlugin;
import de.oliver.fancynpcs.api.Npc;

Npc npc = FancyNpcsPlugin.get().getNpcManager().getNpc("shop_keeper");
npc.removeForAll();
FancyNpcsPlugin.get().getNpcManager().removeNpc(npc);
```

### Listen for NPC Events

```java
import de.oliver.fancynpcs.api.Npc;
import de.oliver.fancynpcs.api.actions.ActionTrigger;
import de.oliver.fancynpcs.api.events.NpcInteractEvent;
import de.oliver.fancynpcs.api.events.NpcCreateEvent;
import de.oliver.fancynpcs.api.events.NpcRemoveEvent;
import de.oliver.fancynpcs.api.events.NpcSpawnEvent;
import de.oliver.fancynpcs.api.events.NpcsLoadedEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class NpcListener implements Listener {

    @EventHandler
    public void onNpcInteract(NpcInteractEvent event) {
        Player player = event.getPlayer();
        Npc npc = event.getNpc();
        ActionTrigger trigger = event.getInteractionType();

        if (npc.getData().getName().equals("shop_keeper") && trigger == ActionTrigger.RIGHT_CLICK) {
            // Custom logic
            player.sendMessage("Opening shop...");
            event.setCancelled(true); // prevents built-in actions from running
        }
    }

    @EventHandler
    public void onNpcsLoaded(NpcsLoadedEvent event) {
        // Safe to register/modify NPCs after this event fires
    }

    @EventHandler
    public void onNpcSpawn(NpcSpawnEvent event) {
        // Fired when an NPC is spawned for a specific player
        // event.getPlayer() - the player who sees the spawn
        // event.setCancelled(true) - prevent spawn for that player
    }

    @EventHandler
    public void onNpcCreate(NpcCreateEvent event) {
        // Fired when an NPC is created (e.g. via command)
        // event.getCreator() - CommandSender who created it
        // event.setCancelled(true) - prevent creation
    }

    @EventHandler
    public void onNpcRemove(NpcRemoveEvent event) {
        // event.getSender() - CommandSender who removed it
        // event.setCancelled(true) - prevent removal
    }
}
```

### Prevent NPC Registration Before Load

```java
import de.oliver.fancynpcs.api.FancyNpcsPlugin;
import de.oliver.fancynpcs.api.Npc;
import de.oliver.fancynpcs.api.NpcData;
import de.oliver.fancynpcs.api.events.NpcsLoadedEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onNpcsLoaded(NpcsLoadedEvent event) {
        // Now it is safe to create NPCs
        NpcData data = new NpcData("my_npc", getServer().getConsoleSender().getServer()
                .getOfflinePlayer("Console").getUniqueId(), /* location */);
        Npc npc = FancyNpcsPlugin.get().getNpcAdapter().apply(data);
        npc.setSaveToFile(false); // transient NPC, not saved to disk
        FancyNpcsPlugin.get().getNpcManager().registerNpc(npc);
        npc.create();
        npc.spawnForAll();
    }
}
```

### Iterate All NPCs

```java
import de.oliver.fancynpcs.api.FancyNpcsPlugin;
import de.oliver.fancynpcs.api.Npc;

for (Npc npc : FancyNpcsPlugin.get().getNpcManager().getAllNpcs()) {
    String name = npc.getData().getName();
    String display = npc.getData().getDisplayName();
    // ...
}
```

## API Reference

### de.oliver.fancynpcs.api.FancyNpcsPlugin (Interface)
- `static FancyNpcsPlugin get()` -- singleton entry point
- `NpcManager getNpcManager()`
- `ActionManager getActionManager()`
- `SkinManager getSkinManager()`
- `AttributeManager getAttributeManager()`
- `FancyNpcsConfig getFancyNpcConfig()`
- `Function<NpcData, Npc> getNpcAdapter()` -- version-specific Npc factory
- `JavaPlugin getPlugin()`
- `FancyScheduler getScheduler()`

### de.oliver.fancynpcs.api.NpcManager (Interface)
- `Npc getNpc(String name)` -- by display/config name
- `Npc getNpc(String name, UUID creator)` -- scoped to creator (player-npcs feature flag)
- `Npc getNpcById(String id)` -- by internal ID
- `Npc getNpc(int entityId)` -- by entity ID
- `Collection<Npc> getAllNpcs()`
- `void registerNpc(Npc npc)`
- `void removeNpc(Npc npc)`
- `void saveNpcs(boolean force)`
- `void reloadNpcs()`
- `boolean isLoaded()`

### de.oliver.fancynpcs.api.Npc (Abstract Class)
- `NpcData getData()`
- `void create()` -- initializes internal entity
- `void spawn(Player player)` / `void spawnForAll()`
- `void remove(Player player)` / `void removeForAll()`
- `void update(Player player)` / `void updateForAll()`
- `void move(Player player)` / `void moveForAll()`
- `void lookAt(Player player, Location location)`
- `void interact(Player player, ActionTrigger trigger)`
- `void checkAndUpdateVisibility(Player player)`
- `int getEntityId()`
- `float getEyeHeight()`
- `void setSaveToFile(boolean)` / `boolean isSaveToFile()`
- `void setDirty(boolean)` / `boolean isDirty()`

### de.oliver.fancynpcs.api.NpcData (Class)
Constructor: `NpcData(String name, UUID creator, Location location)`

Setters (all return `NpcData` for chaining):
- `setDisplayName(String)` -- MiniMessage format
- `setSkin(String identifier)` -- username, UUID, URL, or filename
- `setSkin(String identifier, SkinData.SkinVariant variant)`
- `setSkinData(SkinData skinData)`
- `setMirrorSkin(boolean)`
- `setLocation(Location)`
- `setType(EntityType)` -- default PLAYER
- `setScale(float)`
- `setTurnToPlayer(boolean)` / `setTurnToPlayerDistance(int)`
- `setGlowing(boolean)` / `setGlowingColor(NamedTextColor)`
- `setCollidable(boolean)`
- `setShowInTab(boolean)`
- `setSpawnEntity(boolean)`
- `setInteractionCooldown(float)` -- seconds
- `setVisibilityDistance(int)` -- blocks
- `setOnClick(Consumer<Player>)`
- `addEquipment(NpcEquipmentSlot slot, ItemStack item)`
- `setEquipment(Map<NpcEquipmentSlot, ItemStack>)`
- `addAction(ActionTrigger trigger, int order, NpcAction action, String value)`
- `setActions(ActionTrigger trigger, List<NpcAction.NpcActionData> actions)`
- `removeAction(ActionTrigger trigger, NpcAction action)`
- `addAttribute(NpcAttribute attribute, String value)`

Getters: `getName()`, `getId()`, `getCreator()`, `getDisplayName()`, `getSkinData()`, `getLocation()`, `getType()`, `getScale()`, `getEquipment()`, `getActions()`, `getActions(ActionTrigger)`, `getOnClick()`, `getAttributes()`, `isTurnToPlayer()`, `isGlowing()`, `getGlowingColor()`, `isCollidable()`, `isShowInTab()`, `isMirrorSkin()`, `getInteractionCooldown()`, `getVisibilityDistance()`

### de.oliver.fancynpcs.api.actions.ActionTrigger (Enum)
- `ANY_CLICK`, `LEFT_CLICK`, `RIGHT_CLICK`, `CUSTOM`
- `static ActionTrigger getByName(String name)`

### de.oliver.fancynpcs.api.actions.ActionManager (Interface)
- `NpcAction getActionByName(String name)` -- look up built-in action type
- `List<NpcAction> getAllActions()`
- `void registerAction(NpcAction action)` -- register custom action
- `void unregisterAction(NpcAction action)`

### de.oliver.fancynpcs.api.actions.NpcAction (Abstract Class)
Constructor: `NpcAction(String name, boolean requiresValue)`
- `String getName()`
- `boolean requiresValue()`
- `void execute(ActionExecutionContext context, String value)`

### de.oliver.fancynpcs.api.actions.NpcAction.NpcActionData (Record)
Constructor: `NpcActionData(int order, NpcAction action, String value)`
- `int order()`, `NpcAction action()`, `String value()`

### Built-in Action Types (de.oliver.fancynpcs.api.actions.types)
| Class | Name String | Value |
|---|---|---|
| `MessageAction` | `"message"` | MiniMessage text, supports PlaceholderAPI |
| `ConsoleCommandAction` | `"console_command"` | Command string, `{player}` placeholder |
| `PlayerCommandAction` | `"player_command"` | Command without `/`, `{player}` placeholder |
| `PlayerCommandAsOpAction` | `"player_command_as_op"` | Same as player_command but with temp OP |
| `SendToServerAction` | `"send_to_server"` | Server name (Velocity/BungeeCord) |
| `PlaySoundAction` | `"play_sound"` | Sound key (e.g. `"entity.experience_orb.pickup"`) |
| `WaitAction` | `"wait"` | Seconds as string (e.g. `"5"`) |
| `BlockUntilDoneAction` | `"block_until_done"` | No value needed |
| `NeedPermissionAction` | `"need_permission"` | Permission node, prefix `!` to invert |
| `ExecuteRandomActionAction` | `"execute_random_action"` | No value needed |

### de.oliver.fancynpcs.api.skins.SkinData (Class)
Constructor: `SkinData(String identifier, SkinData.SkinVariant variant)`
- `String getIdentifier()` / `setIdentifier(String)`
- `SkinData.SkinVariant getVariant()` / `setVariant(SkinData.SkinVariant)`
- `String getTextureValue()` / `setTextureValue(String)`
- `String getTextureSignature()` / `setTextureSignature(String)`
- `boolean hasTexture()`

### de.oliver.fancynpcs.api.skins.SkinData.SkinVariant (Enum)
- `AUTO`, `SLIM`

### de.oliver.fancynpcs.api.skins.SkinManager (Interface)
- `SkinData getByIdentifier(String identifier, SkinData.SkinVariant variant)` -- auto-detects type
- `SkinData getByUsername(String username, SkinData.SkinVariant variant)`
- `SkinData getByUUID(UUID uuid, SkinData.SkinVariant variant)`
- `SkinData getByURL(String url, SkinData.SkinVariant variant)`
- `SkinData getByFile(String filePath, SkinData.SkinVariant variant)`

### de.oliver.fancynpcs.api.utils.NpcEquipmentSlot (Enum)
- `MAINHAND`, `OFFHAND`, `HEAD`, `CHEST`, `LEGS`, `FEET`
- `static NpcEquipmentSlot parse(String s)`

### Events (de.oliver.fancynpcs.api.events)
All events extend `org.bukkit.event.Event`. Cancellable events implement `Cancellable`.

| Event | Cancellable | Key Methods |
|---|---|---|
| `NpcInteractEvent` | Yes | `getPlayer()`, `getNpc()`, `getInteractionType()` -> ActionTrigger, `getActions()`, `getOnClick()` |
| `NpcCreateEvent` | Yes | `getNpc()`, `getCreator()` -> CommandSender |
| `NpcRemoveEvent` | Yes | `getNpc()`, `getSender()` -> CommandSender |
| `NpcSpawnEvent` | Yes | `getNpc()`, `getPlayer()` |
| `NpcModifyEvent` | Yes | `getNpc()`, `getModification()` -> NpcModification enum, `getNewValue()`, `getModifier()` |
| `NpcStartLookingEvent` | No | `getNpc()`, `getPlayer()` |
| `NpcStopLookingEvent` | No | `getNpc()`, `getPlayer()` |
| `NpcsLoadedEvent` | No | (no extra methods -- signals NPCs are ready) |
| `SkinGeneratedEvent` | No | `getId()`, `getSkin()` -> SkinData |

### de.oliver.fancynpcs.api.events.NpcModifyEvent.NpcModification (Enum)
`ATTRIBUTE`, `COLLIDABLE`, `DISPLAY_NAME`, `EQUIPMENT`, `GLOWING`, `GLOWING_COLOR`, `INTERACTION_COOLDOWN`, `SCALE`, `VISIBILITY_DISTANCE`, `LOCATION`, `MIRROR_SKIN`, `ROTATION`, `SHOW_IN_TAB`, `SKIN`, `TURN_TO_PLAYER`, `TURN_TO_PLAYER_DISTANCE`, `TYPE`
