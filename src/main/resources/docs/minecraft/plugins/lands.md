# Lands API Reference

Lands is a land claim and grief prevention plugin. The LandsAPI lets plugins check claim ownership, test player permissions (flags), manage land members, and listen to land-related events.

API version: 7.x+ | Package root: `me.angeschossen.lands.api`

---

## Class Overview

| Class | Package | Purpose |
|---|---|---|
| `LandsIntegration` | `me.angeschossen.lands.api` | Main API entry point. Singleton per plugin. |
| `Land` | `me.angeschossen.lands.api.land` | Represents a claimed land (members, chunks, balance, spawn). |
| `Area` | `me.angeschossen.lands.api.land` | A sub-region within a Land (has its own roles/flags). |
| `LandWorld` | `me.angeschossen.lands.api.land` | World wrapper -- check flags including wilderness. |
| `LandPlayer` | `me.angeschossen.lands.api.player` | Online player wrapper with land context. |
| `MemberHolder` | `me.angeschossen.lands.api.memberholder` | Base for Land and Nation (shared member/relation methods). |
| `Nation` | `me.angeschossen.lands.api.nation` | A group of allied lands. |
| `Role` | `me.angeschossen.lands.api.role` | A permission role within a land/area. |
| `Flags` | `me.angeschossen.lands.api.flags.type` | Static access to all built-in RoleFlag, NaturalFlag, and PlayerFlag constants. |
| `RoleFlag` | `me.angeschossen.lands.api.flags.type` | Flag type for player-action permissions (break, place, interact, etc.). |
| `NaturalFlag` | `me.angeschossen.lands.api.flags.type` | Flag type for environment events (mob spawn, TNT, fire spread, etc.). |
| `FlagRegistry` | `me.angeschossen.lands.api.flags` | Registry for looking up and registering custom flags. |

---

## Code Examples

### 1. Getting the API Instance

```java
import me.angeschossen.lands.api.LandsIntegration;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

    private LandsIntegration landsApi;

    @Override
    public void onEnable() {
        this.landsApi = LandsIntegration.of(this);
    }
}
```

### 2. Check if a Location is Claimed

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.land.Area;
import org.bukkit.Location;

public boolean isClaimed(LandsIntegration api, Location location) {
    Area area = api.getArea(location);
    return area != null;
}
```

### 3. Get the Land at a Location

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.land.Land;
import org.bukkit.World;

public Land getLandAt(LandsIntegration api, World world, int chunkX, int chunkZ) {
    // Returns null if chunk is not claimed
    return api.getLandByChunk(world, chunkX, chunkZ);
}
```

### 4. Check if a Player Can Build at a Location (Includes Wilderness)

Use `LandWorld.hasRoleFlag` to check permissions in both claimed land AND wilderness.

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.land.LandWorld;
import me.angeschossen.lands.api.flags.type.Flags;
import me.angeschossen.lands.api.player.LandPlayer;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public boolean canBreakBlock(LandsIntegration api, Player player, Location location) {
    LandWorld world = api.getWorld(location.getWorld());
    if (world == null) {
        return true; // world not managed by Lands
    }
    LandPlayer landPlayer = api.getLandPlayer(player.getUniqueId());
    // last param: true = send denial message to player, false = silent check
    return world.hasRoleFlag(landPlayer, location, Flags.BLOCK_BREAK, null, false);
}

public boolean canPlaceBlock(LandsIntegration api, Player player, Location location, Material material) {
    LandWorld world = api.getWorld(location.getWorld());
    if (world == null) {
        return true;
    }
    LandPlayer landPlayer = api.getLandPlayer(player.getUniqueId());
    return world.hasRoleFlag(landPlayer, location, Flags.BLOCK_PLACE, material, false);
}
```

### 5. Check if a Player Can Interact at a Location

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.land.LandWorld;
import me.angeschossen.lands.api.flags.type.Flags;
import me.angeschossen.lands.api.player.LandPlayer;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public boolean canInteract(LandsIntegration api, Player player, Location location) {
    LandWorld world = api.getWorld(location.getWorld());
    if (world == null) {
        return true;
    }
    LandPlayer landPlayer = api.getLandPlayer(player.getUniqueId());
    return world.hasRoleFlag(landPlayer, location, Flags.INTERACT_GENERAL, null, false);
}
```

### 6. Check a Natural Flag (e.g., Monster Spawning)

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.land.LandWorld;
import me.angeschossen.lands.api.flags.type.Flags;
import org.bukkit.Location;

public boolean canMonstersSpawn(LandsIntegration api, Location location) {
    LandWorld world = api.getWorld(location.getWorld());
    if (world == null) {
        return true;
    }
    return world.hasNaturalFlag(location, Flags.MONSTER_SPAWN);
}
```

### 7. Check PvP Between Two Players

```java
import me.angeschossen.lands.api.LandsIntegration;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public boolean canPvP(LandsIntegration api, Player attacker, Player target) {
    // setCombatTag: whether to apply combat tag
    // sendMessage: whether to send denial message
    return api.canPvP(attacker, target, target.getLocation(), false, false);
}
```

### 8. Get Land Members and Trusted Players

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.land.Area;
import me.angeschossen.lands.api.land.Land;
import org.bukkit.Location;

import java.util.Collection;
import java.util.UUID;

public Collection<UUID> getTrustedPlayers(LandsIntegration api, Location location) {
    Area area = api.getArea(location);
    if (area == null) {
        return java.util.Collections.emptyList();
    }
    return area.getTrustedPlayers();
}

public boolean isPlayerTrusted(LandsIntegration api, Location location, UUID playerUUID) {
    Area area = api.getArea(location);
    if (area == null) {
        return false;
    }
    return area.isTrusted(playerUUID);
}

public UUID getLandOwner(LandsIntegration api, String landName) {
    Land land = api.getLandByName(landName);
    if (land == null) {
        return null;
    }
    return land.getOwnerUID();
}
```

### 9. Get a Player's Role in an Area

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.land.Area;
import me.angeschossen.lands.api.role.Role;
import org.bukkit.Location;

import java.util.UUID;

public Role getPlayerRole(LandsIntegration api, Location location, UUID playerUUID) {
    Area area = api.getArea(location);
    if (area == null) {
        return null;
    }
    return area.getRole(playerUUID);
}
```

### 10. Trust and Untrust Players in a Land

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.land.Land;

import java.util.UUID;

public boolean trustPlayer(LandsIntegration api, String landName, UUID playerUUID) {
    Land land = api.getLandByName(landName);
    if (land == null) {
        return false;
    }
    return land.trustPlayer(playerUUID);
}

public boolean untrustPlayer(LandsIntegration api, String landName, UUID playerUUID) {
    Land land = api.getLandByName(landName);
    if (land == null) {
        return false;
    }
    return land.untrustPlayer(playerUUID);
}
```

### 11. Listening to Land Events

```java
import me.angeschossen.lands.api.events.LandCreateEvent;
import me.angeschossen.lands.api.events.LandDeleteEvent;
import me.angeschossen.lands.api.events.LandTrustPlayerEvent;
import me.angeschossen.lands.api.events.LandUntrustPlayerEvent;
import me.angeschossen.lands.api.events.ChunkPostClaimEvent;
import me.angeschossen.lands.api.events.ChunkPreClaimEvent;
import me.angeschossen.lands.api.events.PlayerLeaveLandEvent;
import me.angeschossen.lands.api.events.land.block.LandBlockPlaceEvent;
import me.angeschossen.lands.api.land.Land;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class LandsListener implements Listener {

    @EventHandler
    public void onLandCreate(LandCreateEvent event) {
        Land land = event.getLand();
        // event.getLandPlayer() may be null if created by console/plugin
        getLogger().info("Land created: " + land.getName());
    }

    @EventHandler
    public void onLandDelete(LandDeleteEvent event) {
        Land land = event.getLand();
        // event.getReason() returns DeleteReason enum
        getLogger().info("Land deleted: " + land.getName() + " reason: " + event.getReason());
        // event.setCancelled(true) to prevent deletion
    }

    @EventHandler
    public void onChunkClaim(ChunkPostClaimEvent event) {
        Land land = event.getLand();
        int chunkX = event.getX();
        int chunkZ = event.getZ();
    }

    @EventHandler
    public void onChunkPreClaim(ChunkPreClaimEvent event) {
        // Cancel to prevent claiming
        // event.setCancelled(true);
    }

    @EventHandler
    public void onPlayerTrusted(LandTrustPlayerEvent event) {
        // event.getLand(), event.getTarget() (UUID of trusted player)
    }

    @EventHandler
    public void onPlayerUntrusted(LandUntrustPlayerEvent event) {
        // event.getReason() returns UntrustReason: DEFAULT, BAN, TAXES, RENTAL_EXPIRED
    }

    @EventHandler
    public void onPlayerLeaveLand(PlayerLeaveLandEvent event) {
        // Fired when a player walks out of a land
    }

    private java.util.logging.Logger getLogger() {
        return java.util.logging.Logger.getLogger("LandsListener");
    }
}
```

### 12. Registering a Custom Role Flag

Register custom flags during `onLoad` (not `onEnable`).

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.flags.type.RoleFlag;
import me.angeschossen.lands.api.flags.enums.FlagTarget;
import me.angeschossen.lands.api.flags.enums.RoleFlagCategory;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class MyPlugin extends JavaPlugin {

    private LandsIntegration landsApi;
    private RoleFlag myCustomFlag;

    @Override
    public void onEnable() {
        this.landsApi = LandsIntegration.of(this);

        // Register flags inside onLoad callback -- Lands may not be loaded yet at plugin enable
        landsApi.onLoad(() -> {
            myCustomFlag = RoleFlag.of(landsApi, FlagTarget.PLAYER, RoleFlagCategory.ACTION, "my_custom_flag");
            myCustomFlag.setDisplayName("My Custom Action")
                .setIcon(new ItemStack(Material.DIAMOND))
                .setDescription(Arrays.asList("Line 1", "Line 2"));
        });
    }
}
```

### 13. Registering a Custom Natural Flag

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.flags.type.NaturalFlag;
import me.angeschossen.lands.api.flags.enums.FlagTarget;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

    private LandsIntegration landsApi;
    private NaturalFlag myNaturalFlag;

    @Override
    public void onEnable() {
        this.landsApi = LandsIntegration.of(this);

        landsApi.onLoad(() -> {
            myNaturalFlag = NaturalFlag.of(landsApi, FlagTarget.NATURAL, "my_natural_flag");
            myNaturalFlag.setDisplayName("Custom Environment Flag")
                .setIcon(new ItemStack(Material.CAMPFIRE));
        });
    }
}
```

### 14. Iterate All Lands and Nations

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.land.Land;
import me.angeschossen.lands.api.nation.Nation;

import java.util.Collection;

public void listAll(LandsIntegration api) {
    Collection<Land> lands = api.getLands();
    for (Land land : lands) {
        System.out.println("Land: " + land.getName() + " owner: " + land.getOwnerUID()
            + " chunks: " + land.getChunksAmount());
    }

    Collection<Nation> nations = api.getNations();
    for (Nation nation : nations) {
        System.out.println("Nation: " + nation.getName() + " members: " + nation.getMembersAmount());
    }
}
```

### 15. Land Balance / Economy

```java
import me.angeschossen.lands.api.LandsIntegration;
import me.angeschossen.lands.api.land.Land;

public void economyExample(LandsIntegration api) {
    Land land = api.getLandByName("MyLand");
    if (land == null) return;

    double balance = land.getBalance();
    land.modifyBalance(500.0);   // deposit 500
    land.modifyBalance(-200.0);  // withdraw 200
    double upkeep = land.getUpkeepCosts();
}
```

---

## API Reference (Trimmed)

### me.angeschossen.lands.api.LandsIntegration (Interface)

Main entry point. Obtain via `LandsIntegration.of(Plugin)`.

| Method | Returns | Description |
|---|---|---|
| `of(Plugin)` | `LandsIntegration` | Static factory. One instance per plugin. |
| `getArea(Location)` | `Area` or null | Get the claimed area at a loaded location. |
| `getUnloadedArea(Location)` | `Area` or null | Get area even if chunk is unloaded. |
| `getWorld(World)` | `LandWorld` or null | Get world wrapper (null if world not managed by Lands). |
| `getLandByChunk(World, int, int)` | `Land` or null | Get land by chunk coords. |
| `getLandByUnloadedChunk(World, int, int)` | `Land` or null | Same, for unloaded chunks. |
| `getLandByName(String)` | `Land` or null | Lookup land by name. |
| `getLandByULID(ULID)` | `Land` or null | Lookup land by ULID. |
| `getLands()` | `Collection<Land>` | All lands on the server. |
| `getLandPlayer(UUID)` | `LandPlayer` | Get online LandPlayer wrapper. |
| `getOfflineLandPlayer(UUID)` | `CompletableFuture<OfflinePlayer>` | Async lookup for offline player. |
| `canPvP(Player, Player, Location, boolean, boolean)` | `boolean` | Check if PvP is allowed between two players. |
| `getNationByName(String)` | `Nation` or null | Lookup nation by name. |
| `getNationByULID(ULID)` | `Nation` or null | Lookup nation by ULID. |
| `getNations()` | `Collection<Nation>` | All nations on the server. |
| `getFlagRegistry()` | `FlagRegistry` | Access the flag registry for custom flags. |
| `getConfiguration()` | `Configuration` | Access Lands configuration. |
| `onLoad(Runnable)` | `void` | Register a callback to run when Lands is fully loaded. Use for flag registration. |

### me.angeschossen.lands.api.land.Land (Interface)

Represents a claimed land.

| Method | Returns | Description |
|---|---|---|
| `getName()` | `String` | Land name. |
| `getColorName()` | `String` | Name with color codes. |
| `getOwnerUID()` | `UUID` | Owner's UUID. |
| `setOwner(UUID)` | `void` | Transfer ownership. |
| `getLandType()` | `LandType` | LAND or CAMP. |
| `getNation()` | `Nation` or null | Nation this land belongs to. |
| `getDefaultArea()` | `Area` | The default (main) area of the land. |
| `getAllAreas()` | `Collection<Area>` | All areas including sub-areas. |
| `getArea(Location)` | `Area` or null | Get area at location within this land. |
| `getArea(String)` | `Area` or null | Get area by name. |
| `hasChunk(World, int, int)` | `boolean` | Check if land owns a chunk. |
| `claimChunk(LandPlayer, World, int, int)` | `CompletableFuture<Boolean>` | Claim a chunk. |
| `unclaimChunk(World, int, int, LandPlayer)` | `CompletableFuture<ChunkCoordinate>` | Unclaim a chunk. |
| `trustPlayer(UUID)` | `boolean` | Trust a player to the land. |
| `untrustPlayer(UUID)` | `boolean` | Remove trust. |
| `banPlayer(UUID)` | `boolean` | Ban a player from the land. |
| `unbanPlayer(UUID)` | `void` | Remove ban. |
| `getTrustedPlayer(UUID)` | `TrustedPlayer` or null | Get trusted player info. |
| `getOnlinePlayers()` | `Collection<Player>` | Online players in this land. |
| `getSpawn()` | `Location` or null | Land spawn location. |
| `setSpawn(Location)` | `void` | Set spawn. |
| `getBalance()` | `double` | Bank balance. |
| `setBalance(double)` | `boolean` | Set bank balance. |
| `modifyBalance(double)` | `boolean` | Add/subtract from balance (negative to withdraw). |
| `getUpkeepCosts()` | `double` | Current upkeep cost. |
| `getWar()` | `War` or null | Active war. |
| `exists()` | `boolean` | Whether land still exists. |
| `delete(LandPlayer)` | `CompletableFuture<Boolean>` | Delete the land. |

### me.angeschossen.lands.api.land.Area (Interface)

A sub-region inside a Land. Every land has at least one default area.

| Method | Returns | Description |
|---|---|---|
| `getLand()` | `Land` | Parent land. |
| `getName()` | `String` | Area name. |
| `isDefault()` | `boolean` | True if this is the default area. |
| `getOwnerUID()` | `UUID` | Area owner UUID. |
| `getTrustedPlayers()` | `Collection<UUID>` | All trusted player UUIDs. |
| `isTrusted(UUID)` | `boolean` | Check if player is trusted. |
| `isBanned(UUID)` | `boolean` | Check if player is banned. |
| `trustPlayer(UUID)` | `boolean` | Trust a player. |
| `untrustPlayer(UUID)` | `boolean` | Untrust a player. |
| `banPlayer(UUID)` | `boolean` | Ban a player. |
| `unbanPlayer(UUID)` | `void` | Unban a player. |
| `getRole(UUID)` | `Role` | Get player's role in this area. |
| `getRole(String)` | `Role` | Get role by name. |
| `getRoles()` | `Collection<Role>` | All roles in this area. |
| `getVisitorRole()` | `Role` | The visitor (untrusted) role. |
| `getEntryRole()` | `Role` | Default role for new trusted players. |
| `setRole(UUID, Role)` | `void` | Set a player's role. |
| `hasRoleFlag(LandPlayer, RoleFlag, Material, boolean)` | `boolean` | Check if player has a role flag. Material can be null. Last param = send denial msg. |
| `hasRoleFlag(UUID, RoleFlag)` | `boolean` | Silent role flag check by UUID. |
| `hasNaturalFlag(NaturalFlag)` | `boolean` | Check a natural flag on this area. |
| `toggleNaturalFlag(NaturalFlag)` | `boolean` | Toggle a natural flag. |
| `getNaturalFlags()` | `Set<NaturalFlag>` | Currently active natural flags. |
| `canPvP(LandPlayer, LandPlayer, boolean)` | `boolean` | PvP check between two players in this area. |
| `canEnter(LandPlayer, boolean)` | `boolean` | Check if player can enter this area. |
| `getSpawn()` | `Position` or null | Area spawn. |
| `setSpawn(Position)` | `void` | Set area spawn. |
| `getULID()` | `ULID` | Unique identifier. |

### me.angeschossen.lands.api.land.LandWorld (Interface)

World-level checks. Includes wilderness flag evaluation.

| Method | Returns | Description |
|---|---|---|
| `getWorld()` | `World` | Bukkit world. |
| `getName()` | `String` | World name. |
| `hasRoleFlag(LandPlayer, Location, RoleFlag, Material, boolean)` | `boolean` | Check role flag at location (claimed + wilderness). Material can be null. Last param = send denial msg. |
| `hasRoleFlag(UUID, Location, RoleFlag)` | `boolean` | Silent role flag check by UUID. |
| `hasNaturalFlag(Location, NaturalFlag)` | `boolean` | Check natural flag at location. |
| `hasWildernessRoleFlag(LandPlayer, Location, RoleFlag, boolean)` | `boolean` | Check role flag specifically in wilderness. |
| `getLandByChunk(int, int)` | `Land` or null | Get land at chunk. |
| `getLandByUnloadedChunk(int, int)` | `Land` or null | Get land at unloaded chunk. |
| `getArea(int, int, int)` | `Area` or null | Get area at block coordinates. |
| `getContainer(int, int)` | `Container` or null | Get container at chunk. |

### me.angeschossen.lands.api.player.LandPlayer (Interface)

Wraps an online player with Lands context.

| Method | Returns | Description |
|---|---|---|
| `getPlayer()` | `Player` | Bukkit player. |
| `getOwningLand()` | `Land` or null | The land this player owns. |
| `getEditLand(boolean)` | `Land` or null | Land the player is currently editing. |
| `setEditLand(Land)` | `void` | Set current edit land. |
| `getInvites()` | `Collection<Invite>` | Pending land invites. |
| `getInvite(Land)` | `Invite` or null | Invite for a specific land. |
| `ownsLand()` | `boolean` | True if player owns at least one land. |
| `isInWar()` | `boolean` | True if player is in a war. |
| `getWars()` | `Set<War>` | Active wars. |
| `getCombatTag()` | `CombatTag` or null | Current combat tag. |
| `hasFlag(PlayerFlag)` | `boolean` | Check a player-level flag. |
| `toggleFlag(PlayerFlag)` | `boolean` | Toggle a player-level flag. |
| `getChatMode()` | `ChatMode` or null | Current chat mode. |
| `setChatMode(ChatMode)` | `void` | Set chat mode. |

### me.angeschossen.lands.api.memberholder.MemberHolder (Interface)

Base interface for Land and Nation.

| Method | Returns | Description |
|---|---|---|
| `getName()` | `String` | Name. |
| `getColorName()` | `String` | Name with color. |
| `getOwnerUID()` | `UUID` | Owner UUID. |
| `getULID()` | `ULID` | Unique identifier. |
| `exists()` | `boolean` | Still exists? |
| `isTrusted(UUID)` | `boolean` | Is player trusted? |
| `getTrustedPlayers()` | `Collection<UUID>` | Trusted player UUIDs. |
| `getMembersAmount()` | `int` | Total member count. |
| `getChunksAmount()` | `int` | Total claimed chunks. |
| `getOnlinePlayers()` | `Collection<Player>` | Online players. |
| `getOnlineLandPlayers()` | `Collection<LandPlayer>` | Online LandPlayer wrappers. |
| `getAllies()` | `Collection<MemberHolder>` | Allied lands/nations. |
| `getEnemies()` | `Collection<MemberHolder>` | Enemy lands/nations. |
| `isAlly(MemberHolder)` | `boolean` | Alliance check. |
| `isEnemy(MemberHolder)` | `boolean` | Enemy check. |
| `getRelation(MemberHolder)` | `Relation` | Get relation type. |
| `getWar()` | `War` or null | Active war. |
| `isInWar()` | `boolean` | In a war? |
| `getLevel()` | `Level` | Current level. |
| `getStats()` | `WarStats` | War statistics. |

### me.angeschossen.lands.api.role.Role (Interface)

A permission role within a land/area.

| Method | Returns | Description |
|---|---|---|
| `of(RoleHolder, String)` | `Role` | Static factory to create a new role. |
| `getName()` | `String` | Role name. |
| `getColorName()` | `String` | Name with color. |
| `getType()` | `RoleType` | Role type. |
| `getULID()` | `ULID` | Unique ID. |
| `hasFlag(RoleFlag)` | `boolean` | Check if role has a flag. |
| `toggleFlag(RoleFlag)` | `boolean` | Toggle a flag. |
| `getActionFlags()` | `Set<RoleFlag>` | Action flags granted. |
| `getManagementFlags()` | `Set<RoleFlag>` | Management flags granted. |
| `getPriority()` | `int` | Role priority. |
| `getHolder()` | `RoleHolder` | Parent area/land. |
| `getIcon()` | `ItemStack` | Display icon. |
| `setIcon(ItemStack)` | `void` | Set display icon. |
| `setName(String)` | `void` | Rename role. |
| `delete()` | `CompletableFuture<Void>` | Delete the role. |

### me.angeschossen.lands.api.flags.type.Flags

Static access to all built-in flags. Access via field name, e.g. `Flags.BLOCK_BREAK`.

**RoleFlag constants (player actions):**
`BLOCK_BREAK`, `BLOCK_PLACE`, `ATTACK_PLAYER`, `ATTACK_ANIMAL`, `ATTACK_MONSTER`, `BLOCK_IGNITE`, `INTERACT_GENERAL`, `INTERACT_MECHANISM`, `INTERACT_CONTAINER`, `INTERACT_DOOR`, `INTERACT_TRAPDOOR`, `INTERACT_VILLAGER`, `FLY`, `ELYTRA`, `SPAWN_TELEPORT`, `LAND_ENTER`, `VEHICLE_USE`, `ITEM_PICKUP`, `ENDER_PEARL`, `TRAMPLE_FARMLAND`, `HARVEST`, `PLANT`, `SHEAR`, `NO_DAMAGE`

**RoleFlag constants (management):**
`PLAYER_TRUST`, `PLAYER_UNTRUST`, `PLAYER_SETROLE`, `PLAYER_BAN`, `LAND_CLAIM`, `LAND_CLAIM_BORDER`, `SPAWN_SET`, `SETTING_EDIT_LAND`, `SETTING_EDIT_ROLE`, `SETTING_EDIT_TAXES`, `SETTING_EDIT_VARIOUS`, `BALANCE_WITHDRAW`, `AREA_ASSIGN`, `WAR_MANAGE`, `NATION_EDIT`

**NaturalFlag constants:**
`ENTITY_GRIEFING`, `TNT_GRIEFING`, `PISTON_GRIEFING`, `MONSTER_SPAWN`, `PHANTOM_SPAWN`, `ANIMAL_SPAWN`, `WATERFLOW_ALLOW`, `FIRE_SPREAD`, `LEAF_DECAY`, `PLANT_GROWTH`, `SNOW_MELT`, `TITLE_HIDE`, `REQUEST_ACCEPT`, `WITHER_ATTACK_ANIMAL`, `BLOCK_SPREADING`, `EXPIRATION_SHIELD`, `PEACEFUL`

**PlayerFlag constants:**
`ENTER_MESSAGES`, `RECEIVE_INVITES`, `SHOW_INBOX`

**Utility methods:**
- `Flags.get(String name)` - Lookup any flag by name (case-insensitive).
- `Flags.getInteract(Block)` - Get the appropriate interact RoleFlag for a block type.
- `Flags.getInteract(Block, ItemStack)` - Get interact flag considering held item.

### me.angeschossen.lands.api.flags.type.RoleFlag (Interface)

| Method | Returns | Description |
|---|---|---|
| `of(LandsIntegration, FlagTarget, RoleFlagCategory, String)` | `RoleFlag` | Static factory for custom role flags. |
| `getCategory()` | `RoleFlagCategory` | ACTION or MANAGEMENT. |
| `getBypassPermission()` | `String` | Permission node to bypass this flag. |
| `getBypassPermissionWilderness()` | `String` | Wilderness bypass permission. |
| `isToggleableByNation()` | `boolean` | Can nations toggle this flag? |
| `setToggleableByNation(boolean)` | `RoleFlag` | Set nation toggleability. |
| `setUpdatePredicate(Predicate<Role>)` | `RoleFlag` | Set which roles this flag applies to. |
| `sendDenied(LandPlayer, Area)` | `void` | Send denial message. |

### me.angeschossen.lands.api.flags.type.NaturalFlag (Interface)

| Method | Returns | Description |
|---|---|---|
| `of(LandsIntegration, FlagTarget, String)` | `NaturalFlag` | Static factory for custom natural flags. |

Both RoleFlag and NaturalFlag inherit from `Flag<T>`:
- `setDisplayName(String)` / `getDisplayName()` - Display name (supports color codes).
- `setIcon(ItemStack)` / `getIcon()` - Menu icon.
- `setDescription(List<String>)` / `setDescription(String)` / `getDescription()` - Description lines.
- `setDisplay(boolean)` / `isDisplay()` - Whether flag shows in toggle menus.
- `getName()` - Unique flag identifier.
- `getPlugin()` - Owning plugin.
- `getTarget()` - FlagTarget enum value.

### Events Reference

All events are in `me.angeschossen.lands.api.events` and sub-packages. Most extend Bukkit `Event` and many implement `Cancellable`.

**Land lifecycle:**

| Event | Cancellable | Key Methods |
|---|---|---|
| `LandCreateEvent` | Yes | `getLand()`, `getLandPlayer()` |
| `LandDeleteEvent` | Yes | `getLand()`, `getReason()` (DeleteReason enum) |
| `LandRenameEvent` | Yes | `getLand()`, `getCurrentName()`, `getNewName()` |
| `LandConvertEvent` | Yes | `getLand()`, `getLandType()` |

**Chunk claiming:**

| Event | Cancellable | Key Methods |
|---|---|---|
| `ChunkPreClaimEvent` | Yes | `getLand()`, `getWorld()`, `getX()`, `getZ()` |
| `ChunkPostClaimEvent` | No | `getLand()`, `getWorld()`, `getX()`, `getZ()` |
| `ChunkDeleteEvent` | Yes | `getLand()`, `getWorld()`, `getX()`, `getZ()`, `getReason()`, `getUnclaimType()` |

**Player membership:**

| Event | Cancellable | Key Methods |
|---|---|---|
| `LandTrustPlayerEvent` | Yes | `getLand()`, inherits target UUID from parent |
| `LandUntrustPlayerEvent` | Yes | `getLand()`, `getReason()` (UntrustReason) |
| `LandInvitePlayerEvent` | Yes | `getLand()` |
| `LandBanPlayerEvent` | Yes | `getLand()` |
| `LandUnbanPlayerEvent` | Yes | `getLand()` |
| `LandOwnerChangeEvent` | Yes | `getLand()`, `getReason()` (RENT, BOUGHT, DEFAULT, etc.) |

**Player movement:**

| Event | Cancellable | Key Methods |
|---|---|---|
| `PlayerLeaveLandEvent` | No | inherits from PlayerLandEvent |

**Chat:**

| Event | Cancellable | Key Methods |
|---|---|---|
| `LandChatEvent` | Yes | `getMemberHolder()`, `getMessage()`, `getReceivers()`, `getSource()` |

**Economy (me.angeschossen.lands.api.events.land.bank):**

| Event | Cancellable | Key Methods |
|---|---|---|
| `LandBankDepositEvent` | Yes | `getLand()`, `getValue()` |
| `LandBankWithdrawEvent` | Yes | `getLand()`, `getValue()` |
| `LandBankBalanceChangedEvent` | No | `getLand()`, `getPrevious()`, `getNow()` |

**Block events (me.angeschossen.lands.api.events.land.block):**

| Event | Cancellable | Key Methods |
|---|---|---|
| `LandBlockPlaceEvent` | Yes | `getLand()`, `getLandBlock()` |
| `LandBlockRemoveEvent` | Yes | `getLand()`, `getLandBlock()` |
| `LandBlockInteractEvent` | Yes | `getLand()`, `getLandBlock()` |

**DeleteReason enum values:** `DEFAULT`, `PLUGIN`, `UPKEEP`, `ADMIN`, `INACTIVITY`, `WAR_CAPTURED`, `CAMP_EXPIRED`, `NO_CLAIMS`

**UntrustReason enum values:** `DEFAULT`, `BAN`, `TAXES`, `RENTAL_EXPIRED`
