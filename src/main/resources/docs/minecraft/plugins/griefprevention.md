# GriefPrevention API Reference

Land claim and grief prevention plugin. The API lets plugins query claims at locations, check/override player permissions in claims, manage claim blocks, create/delete/resize claims programmatically, grant trust, and listen to 15+ claim events. Add `GriefPrevention` to `depend` or `softdepend` in plugin.yml.

## Code Examples

### Getting the API

```java
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import me.ryanhamshire.GriefPrevention.DataStore;

GriefPrevention gp = GriefPrevention.instance;
DataStore dataStore = gp.dataStore;
```

### Check if a Location is Claimed

```java
import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import org.bukkit.Location;

Claim claim = GriefPrevention.instance.dataStore.getClaimAt(location, false, null);
if (claim != null) {
    String owner = claim.getOwnerName();       // "PlayerName" or "administrator"
    UUID ownerUUID = claim.getOwnerID();        // null for admin claims
    boolean isAdmin = claim.isAdminClaim();
    int area = claim.getArea();                 // total blocks
    Location min = claim.getLesserBoundaryCorner();
    Location max = claim.getGreaterBoundaryCorner();
}
```

### Check if a Player Can Build in a Claim

```java
import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.ClaimPermission;
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import org.bukkit.entity.Player;

import java.util.function.Supplier;

Claim claim = GriefPrevention.instance.dataStore.getClaimAt(location, false, null);
if (claim != null) {
    // Returns null if allowed, or a Supplier<String> with the denial reason
    Supplier<String> denial = claim.checkPermission(player, ClaimPermission.Build, null);
    if (denial != null) {
        player.sendMessage("Denied: " + denial.get());
    } else {
        // player can build here
    }
}
```

### Check All Permission Levels

```java
import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.ClaimPermission;
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import org.bukkit.entity.Player;

import java.util.function.Supplier;

Claim claim = GriefPrevention.instance.dataStore.getClaimAt(location, false, null);
if (claim != null) {
    // Permission hierarchy: Edit > Manage > Build > Container > Access
    Supplier<String> canAccess = claim.checkPermission(player, ClaimPermission.Access, null);
    Supplier<String> canContainer = claim.checkPermission(player, ClaimPermission.Container, null);
    Supplier<String> canBuild = claim.checkPermission(player, ClaimPermission.Build, null);
    Supplier<String> canManage = claim.checkPermission(player, ClaimPermission.Manage, null);

    // Check explicit trust (ignores owner/admin bypass)
    boolean hasBuildTrust = claim.hasExplicitPermission(player, ClaimPermission.Build);
}
```

### Get Player Claim Blocks and Claims

```java
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import me.ryanhamshire.GriefPrevention.PlayerData;
import me.ryanhamshire.GriefPrevention.Claim;

import java.util.UUID;
import java.util.Vector;

PlayerData data = GriefPrevention.instance.dataStore.getPlayerData(player.getUniqueId());

int remaining = data.getRemainingClaimBlocks();  // available to use
int accrued = data.getAccruedClaimBlocks();       // earned over time
int bonus = data.getBonusClaimBlocks();            // admin-granted

// Modify claim blocks
data.setAccruedClaimBlocks(accrued + 500);
data.setBonusClaimBlocks(bonus + 100);

// Save changes
GriefPrevention.instance.dataStore.savePlayerData(player.getUniqueId(), data);

// All claims owned by this player
Vector<Claim> playerClaims = data.getClaims();
```

### Create a Claim Programmatically

```java
import me.ryanhamshire.GriefPrevention.CreateClaimResult;
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import me.ryanhamshire.GriefPrevention.Claim;
import org.bukkit.World;

import java.util.UUID;

CreateClaimResult result = GriefPrevention.instance.dataStore.createClaim(
        world,
        x1, x2,     // X bounds
        y1, y2,     // Y bounds (use 0 and world max for full height)
        z1, z2,     // Z bounds
        ownerUUID,  // null for admin claim
        null,       // parent claim (null for top-level)
        null,       // claim ID (null for auto-generated)
        null        // creating player (null for API-created)
);

if (result.succeeded) {
    Claim newClaim = result.claim;
} else {
    // result.claim is the overlapping claim that prevented creation
    Claim conflicting = result.claim;
}
```

### Delete a Claim

```java
import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.GriefPrevention;

Claim claim = GriefPrevention.instance.dataStore.getClaimAt(location, false, null);
if (claim != null) {
    GriefPrevention.instance.dataStore.deleteClaim(claim); // also deletes subclaims
}

// Delete all claims for a player
GriefPrevention.instance.dataStore.deleteClaimsForPlayer(playerUUID, true); // true = release pets
```

### Resize a Claim

```java
import me.ryanhamshire.GriefPrevention.CreateClaimResult;
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import me.ryanhamshire.GriefPrevention.Claim;

Claim claim = GriefPrevention.instance.dataStore.getClaimAt(location, false, null);
if (claim != null) {
    CreateClaimResult result = GriefPrevention.instance.dataStore.resizeClaim(
            claim,
            newX1, newX2,
            newY1, newY2,
            newZ1, newZ2,
            player  // null for API resize
    );
    if (result.succeeded) {
        // claim was resized
    }
}
```

### Grant and Revoke Trust

```java
import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.ClaimPermission;
import me.ryanhamshire.GriefPrevention.GriefPrevention;

import java.util.ArrayList;
import java.util.UUID;

Claim claim = GriefPrevention.instance.dataStore.getClaimAt(location, false, null);
if (claim != null) {
    // Grant build trust
    claim.setPermission(targetUUID.toString(), ClaimPermission.Build);

    // Grant container trust
    claim.setPermission(targetUUID.toString(), ClaimPermission.Container);

    // Grant access trust
    claim.setPermission(targetUUID.toString(), ClaimPermission.Access);

    // Grant manage trust (can trust others)
    claim.setPermission(targetUUID.toString(), ClaimPermission.Manage);

    // Revoke trust
    claim.dropPermission(targetUUID.toString());

    // Clear all non-owner permissions
    claim.clearPermissions();

    // Read current permissions
    ArrayList<String> builders = new ArrayList<>();
    ArrayList<String> containers = new ArrayList<>();
    ArrayList<String> accessors = new ArrayList<>();
    ArrayList<String> managers = new ArrayList<>();
    claim.getPermissions(builders, containers, accessors, managers);

    // Save changes
    GriefPrevention.instance.dataStore.saveClaim(claim);
}
```

### Transfer Claim Ownership

```java
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import me.ryanhamshire.GriefPrevention.Claim;

import java.util.UUID;

Claim claim = GriefPrevention.instance.dataStore.getClaimAt(location, false, null);
if (claim != null) {
    GriefPrevention.instance.dataStore.changeClaimOwner(claim, newOwnerUUID);
    // Pass null to convert to admin claim
}
```

### Query Nearby Claims

```java
import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import org.bukkit.Location;

import java.util.Collection;
import java.util.Set;

// All claims within 150 blocks
Set<Claim> nearby = GriefPrevention.instance.dataStore.getNearbyClaims(location);

// All claims on the server
Collection<Claim> allClaims = GriefPrevention.instance.dataStore.getClaims();

// Claims in a specific chunk
Collection<Claim> chunkClaims = GriefPrevention.instance.dataStore.getClaims(chunkX, chunkZ);
```

### Listen for Claim Events

```java
import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.ClaimPermission;
import me.ryanhamshire.GriefPrevention.events.ClaimCreatedEvent;
import me.ryanhamshire.GriefPrevention.events.ClaimDeletedEvent;
import me.ryanhamshire.GriefPrevention.events.ClaimPermissionCheckEvent;
import me.ryanhamshire.GriefPrevention.events.ClaimResizeEvent;
import me.ryanhamshire.GriefPrevention.events.ClaimTransferEvent;
import me.ryanhamshire.GriefPrevention.events.TrustChangedEvent;
import me.ryanhamshire.GriefPrevention.events.PreventPvPEvent;
import me.ryanhamshire.GriefPrevention.events.AccrueClaimBlocksEvent;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.function.Supplier;

public class ClaimListener implements Listener {

    @EventHandler
    public void onClaimCreated(ClaimCreatedEvent event) {
        // Cancellable
        Claim claim = event.getClaim();
        CommandSender creator = event.getCreator();
    }

    @EventHandler
    public void onClaimDeleted(ClaimDeletedEvent event) {
        // NOT cancellable
        Claim claim = event.getClaim();
    }

    @EventHandler
    public void onClaimResize(ClaimResizeEvent event) {
        // Cancellable
        Claim original = event.getFrom();
        Claim resized = event.getTo();
        CommandSender modifier = event.getModifier();
    }

    @EventHandler
    public void onClaimTransfer(ClaimTransferEvent event) {
        // Cancellable
        Claim claim = event.getClaim();
        java.util.UUID newOwner = event.getNewOwner(); // null = admin claim
        // event.setNewOwner(otherUUID); // redirect transfer
    }

    @EventHandler
    public void onTrustChanged(TrustChangedEvent event) {
        // Cancellable
        Player changer = event.getChanger();
        ClaimPermission perm = event.getClaimPermission();
        boolean granting = event.isGiven();
        String target = event.getIdentifier();
    }

    @EventHandler
    public void onPermissionCheck(ClaimPermissionCheckEvent event) {
        // Override GP's permission decisions
        Player checked = event.getCheckedPlayer();
        ClaimPermission required = event.getRequiredPermission();

        // Allow a player who would normally be denied
        if (checked != null && checked.hasPermission("myplugin.bypass")) {
            event.setDenialReason(null); // null = allow
        }

        // Or deny a player who would normally be allowed
        // event.setDenialReason(() -> "Custom denial reason");
    }

    @EventHandler
    public void onPvPPrevented(PreventPvPEvent event) {
        // Cancel to ALLOW the PvP that GP is blocking
        Player attacker = event.getAttacker(); // nullable for AoE
        org.bukkit.entity.Entity defender = event.getDefender();
        Claim claim = event.getClaim();

        if (attacker != null && attacker.hasPermission("myplugin.pvp.bypass")) {
            event.setCancelled(true); // allow the PvP
        }
    }

    @EventHandler
    public void onClaimBlocksAccrue(AccrueClaimBlocksEvent event) {
        // Cancellable — fires every 10 minutes
        Player player = event.getPlayer();
        int blocks = event.getBlocksToAccrue();
        boolean idle = event.isIdle();

        // Double accrual rate
        event.setBlocksToAccrue(blocks * 2);
    }
}
```

### Subclaims (Subdivisions)

```java
import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.GriefPrevention;

import java.util.ArrayList;

Claim claim = GriefPrevention.instance.dataStore.getClaimAt(location, false, null);
if (claim != null) {
    // Check if this IS a subclaim
    if (claim.parent != null) {
        Claim parentClaim = claim.parent;
    }

    // Get subclaims of a top-level claim
    ArrayList<Claim> subclaims = claim.children;

    // Create a subclaim
    me.ryanhamshire.GriefPrevention.CreateClaimResult result =
            GriefPrevention.instance.dataStore.createClaim(
                    world, x1, x2, y1, y2, z1, z2,
                    ownerUUID,
                    claim,  // parent = the top-level claim
                    null, null
            );
}
```

## API Reference (Trimmed)

### `me.ryanhamshire.GriefPrevention.GriefPrevention`

| Return | Method / Field | Description |
|---|---|---|
| `static GriefPrevention` | `instance` | Singleton plugin instance |
| `DataStore` | `dataStore` | Claim and player data access |
| `boolean` | `claimsEnabledForWorld(World)` | Claims enabled in world |
| `boolean` | `pvpRulesApply(World)` | GP PvP rules apply in world |
| `Material` | `config_claims_investigationTool` | Inspection tool (default: stick) |
| `Material` | `config_claims_modificationTool` | Claim tool (default: golden shovel) |

### `me.ryanhamshire.GriefPrevention.DataStore`

| Return | Method | Description |
|---|---|---|
| `Claim` | `getClaimAt(Location, boolean ignoreHeight, Claim cached)` | Get claim at location |
| `Claim` | `getClaim(long id)` | Get claim by ID |
| `Collection<Claim>` | `getClaims()` | All claims |
| `Set<Claim>` | `getNearbyClaims(Location)` | Claims within 150 blocks |
| `CreateClaimResult` | `createClaim(World, int x1, int x2, int y1, int y2, int z1, int z2, UUID owner, Claim parent, Long id, Player creator)` | Create a claim |
| `CreateClaimResult` | `resizeClaim(Claim, int x1, int x2, int y1, int y2, int z1, int z2, Player)` | Resize a claim |
| `void` | `extendClaim(Claim, int newDepth)` | Extend vertically |
| `void` | `changeClaimOwner(Claim, UUID)` | Transfer ownership |
| `void` | `deleteClaim(Claim)` | Delete claim + subclaims |
| `void` | `deleteClaimsForPlayer(UUID, boolean releasePets)` | Delete all player claims |
| `void` | `saveClaim(Claim)` | Persist changes |
| `PlayerData` | `getPlayerData(UUID)` | Get player data |
| `void` | `savePlayerData(UUID, PlayerData)` | Save player data (async) |

### `me.ryanhamshire.GriefPrevention.Claim`

| Return | Method | Description |
|---|---|---|
| `Long` | `getID()` | Claim ID |
| `boolean` | `isAdminClaim()` | True if ownerID is null |
| `UUID` | `getOwnerID()` | Owner UUID |
| `String` | `getOwnerName()` | Owner name or "administrator" |
| `int` | `getArea()` | Total area in blocks |
| `int` | `getWidth()` | X-axis span |
| `int` | `getHeight()` | Z-axis span |
| `Location` | `getLesserBoundaryCorner()` | Min corner (cloned) |
| `Location` | `getGreaterBoundaryCorner()` | Max corner (cloned) |
| `boolean` | `contains(Location, boolean ignoreHeight, boolean subClaims)` | Location inside claim |
| `Supplier<String>` | `checkPermission(Player, ClaimPermission, Event)` | Check permission (null = allowed) |
| `boolean` | `hasExplicitPermission(Player, ClaimPermission)` | Has explicit trust |
| `ClaimPermission` | `getPermission(String playerID)` | Get trust level |
| `void` | `setPermission(String playerID, ClaimPermission)` | Grant trust |
| `void` | `dropPermission(String playerID)` | Revoke trust |
| `void` | `clearPermissions()` | Remove all non-owner trust |
| `void` | `getPermissions(ArrayList builders, ArrayList containers, ArrayList accessors, ArrayList managers)` | Read all trust lists |
| `ArrayList<Claim>` | `children` | Subclaims |
| `Claim` | `parent` | Parent claim (null if top-level) |

### `me.ryanhamshire.GriefPrevention.PlayerData`

| Return | Method | Description |
|---|---|---|
| `int` | `getRemainingClaimBlocks()` | Available claim blocks |
| `int` | `getAccruedClaimBlocks()` | Earned claim blocks |
| `void` | `setAccruedClaimBlocks(Integer)` | Set accrued blocks |
| `int` | `getBonusClaimBlocks()` | Admin-granted blocks |
| `void` | `setBonusClaimBlocks(Integer)` | Set bonus blocks |
| `Vector<Claim>` | `getClaims()` | Player's claims |
| `boolean` | `inPvpCombat()` | In PvP combat |

### `me.ryanhamshire.GriefPrevention.ClaimPermission` (enum)

| Value | Description | Grants |
|---|---|---|
| `Edit` | Owner-level (cannot be granted via trust) | All below |
| `Manage` | Can grant trust to others | Build, Container, Access |
| `Build` | Place and break blocks | Container, Access |
| `Container` | Use containers, animals, farming | Access |
| `Access` | Buttons, doors, levers | -- |

### `me.ryanhamshire.GriefPrevention.CreateClaimResult`

| Field | Type | Description |
|---|---|---|
| `succeeded` | `boolean` | Whether creation succeeded |
| `claim` | `Claim` | New claim if succeeded, conflicting claim if failed |

### Events (`me.ryanhamshire.GriefPrevention.events`)

| Event | Cancellable | Key Methods |
|---|---|---|
| `ClaimCreatedEvent` | Yes | `getClaim()`, `getCreator()` |
| `ClaimDeletedEvent` | No | `getClaim()` |
| `ClaimResizeEvent` | Yes | `getFrom()`, `getTo()`, `getModifier()` |
| `ClaimExtendEvent` | Yes | `getFrom()`, `getTo()`, `getNewDepth()`, `setNewDepth(int)` |
| `ClaimExpirationEvent` | Yes | `getClaim()` |
| `ClaimTransferEvent` | Yes | `getClaim()`, `getNewOwner()`, `setNewOwner(UUID)` |
| `ClaimChangeEvent` | Yes | `getFrom()`, `getTo()` |
| `ClaimPermissionCheckEvent` | Yes | `getClaim()`, `getCheckedPlayer()`, `getRequiredPermission()`, `setDenialReason(Supplier)` |
| `TrustChangedEvent` | Yes | `getClaims()`, `getChanger()`, `getClaimPermission()`, `isGiven()`, `getIdentifier()` |
| `ClaimInspectionEvent` | Yes | `getPlayer()`, `getClaims()`, `getInspectedBlock()` |
| `AccrueClaimBlocksEvent` | Yes | `getPlayer()`, `getBlocksToAccrue()`, `setBlocksToAccrue(int)`, `isIdle()` |
| `PreventPvPEvent` | Yes | `getClaim()`, `getAttacker()`, `getDefender()` |
| `ProtectDeathDropsEvent` | Yes | `getClaim()` |
| `SaveTrappedPlayerEvent` | Yes | `getClaim()`, `getDestination()`, `setDestination(Location)` |
| `PlayerKickBanEvent` | Yes | `getPlayer()`, `getReason()`, `isBan()` |

> **Note:** Cancelling `PreventPvPEvent` **allows** the PvP. Cancelling `ClaimPermissionCheckEvent` is deprecated — use `setDenialReason(null)` to allow, or `setDenialReason(() -> "reason")` to deny.
