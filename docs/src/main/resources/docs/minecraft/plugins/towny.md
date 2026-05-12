# Towny Advanced API Reference

Town/nation territory-claiming plugin. The API exposes residents, towns, nations, town blocks (claimed chunks), permissions, and a comprehensive event system. Add `Towny` to `depend` or `softdepend` in plugin.yml.

## Package Structure

| Package | Contents |
|---|---|
| `com.palmergames.bukkit.towny` | `TownyAPI`, `Towny` (main plugin class) |
| `com.palmergames.bukkit.towny.object` | `Resident`, `Town`, `Nation`, `TownBlock`, `TownyWorld`, `TownyPermission` |
| `com.palmergames.bukkit.towny.event` | Core events (`TownClaimEvent`, `NewTownEvent`, etc.) |
| `com.palmergames.bukkit.towny.event.town` | Extended town-specific events |
| `com.palmergames.bukkit.towny.event.actions` | Build/destroy/switch/item-use action events |
| `com.palmergames.bukkit.towny.utils` | `PlayerCacheUtil`, `CombatUtil`, `ShopPlotUtil` |
| `com.palmergames.bukkit.towny.command.commandutils` | `TownyCommandAddonAPI` |

---

## TownyAPI — Main Entry Point

`com.palmergames.bukkit.towny.TownyAPI`

```java
TownyAPI api = TownyAPI.getInstance();
```

### Resident Retrieval

```java
Resident getResident(Player player)
Resident getResident(UUID uuid)
Resident getResident(String name)
Resident getResidentOrThrow(Player player)          // throws TownyException
List<Resident> getResidents()
List<Resident> getResidentsWithoutTown()
Resident getResidentOrNull(TownBlock townBlock)      // resident that owns the plot, or null
```

### Town Retrieval

```java
Town getTown(String name)
Town getTown(UUID uuid)
Town getTown(Player player)                         // town at player's current location
Town getTown(Location location)                     // town that owns this location
Town getTownOrNull(TownBlock townBlock)
List<Town> getTowns()
List<Town> getTownsWithoutNation()
```

### Nation Retrieval

```java
Nation getNation(String name)
Nation getNation(UUID uuid)
Nation getNation(Player player)                     // nation of the town at player's location
List<Nation> getNations()
```

### Relationship Helpers

```java
Town   getResidentTownOrNull(Resident resident)
Nation getResidentNationOrNull(Resident resident)
Nation getTownNationOrNull(Town town)
```

### TownBlock Retrieval

```java
TownBlock getTownBlock(Location location)
TownBlock getTownBlock(Player player)               // block at player's feet
TownBlock getTownBlock(WorldCoord wc)
Collection<TownBlock> getTownBlocks()
```

### Location / Wilderness Checks

```java
boolean isWilderness(Location location)
boolean isWilderness(Block block)
boolean isWilderness(WorldCoord worldCoord)
boolean isPVP(Location location)
boolean areMobsEnabled(Location location)
boolean isNationZone(Location location)             // buffer zone between towns of different nations
```

### Player / Online Queries

```java
Player          getPlayer(Resident resident)
UUID            getPlayerUUID(Resident resident)
List<Player>    getOnlinePlayersInTown(Town town)
List<Player>    getOnlinePlayersInNation(Nation nation)
List<Player>    getOnlinePlayersAlliance(Nation nation)   // town + allied nations
List<Resident>  getOnlineResidents(ResidentList owner)    // ResidentList = Town or Nation
```

### World Helpers

```java
boolean     isTownyWorld(World world)
TownyWorld  getTownyWorld(World world)
TownyWorld  getTownyWorld(String worldName)
TownyWorld  getTownyWorld(UUID worldUUID)
```

### Name / UUID at Location

```java
String getTownName(Location location)
String getTownName(Player player)
UUID   getTownUUID(Location location)
```

### Teleport Helpers

```java
void requestTeleport(Player player, Location spawnLoc)
void requestTeleport(Player player, Location spawnLoc, int cooldownSeconds)
void abortTeleportRequest(Resident resident)
```

### Spawn Locations

```java
Location getTownSpawnLocation(Player player)
Location getNationSpawnLocation(Player player)
```

### Addon / Extension Methods

```java
void registerCustomDataField(CustomDataField<?> field)
void addTranslations(Plugin plugin, Map<String, Map<String, String>> translations)
TownyDataSource getDataSource()                     // direct DB access — use carefully
```

---

## Resident — `com.palmergames.bukkit.towny.object.Resident`

Represents a player tracked by Towny (online or offline).

### Identity

```java
UUID    getUUID()
String  getName()
String  getFormattedName()
boolean isNPC()
boolean isOnline()
Player  getPlayer()                 // null if offline
long    getLastOnline()
long    getRegistered()
long    getJoinedTownAt()
```

### Town / Nation Membership

```java
boolean hasTown()
Town    getTown()                   // throws NotRegisteredException if none
Town    getTownOrNull()             // safe — returns null
boolean hasNation()
Nation  getNation()                 // throws NotRegisteredException if none
Nation  getNationOrNull()           // safe — returns null
boolean isMayor()
boolean isKing()
```

### Ranks & Permissions

```java
List<String> getTownRanks()
boolean      hasTownRank(String rank)
void         addTownRank(String rank)
void         removeTownRank(String rank)
String       getHighestPriorityTownRank()

List<String> getNationRanks()
boolean      hasNationRank(String rank)
void         addNationRank(String rank)
void         removeNationRank(String rank)

boolean      hasPermissionNode(String node)
boolean      isAdmin()
TownyPermission getPermissions()
```

### Social

```java
List<Resident> getFriends()
boolean        hasFriend(Resident r)
void           addFriend(Resident r)
void           removeFriend(Resident r)
boolean        isAlliedWith(Resident r)
```

### Town Block Ownership

```java
Collection<TownBlock> getTownBlocks()               // plots owned by this resident
boolean               hasTownBlock(TownBlock tb)
```

### Jail

```java
boolean isJailed()
int     getJailHours()
double  getJailBailCost()
Town    getJailTown()
```

### Economy

```java
Account  getAccount()
Account  getAccountOrNull()
double   getCachedTaxOwing(boolean refresh)
```

### Persistence

```java
void    save()
boolean exists()
```

---

## Town — `com.palmergames.bukkit.towny.object.Town`

### Residents & Mayor

```java
List<Resident> getResidents()
int            getNumResidents()
boolean        hasResident(Resident r)
boolean        hasResident(Player p)
boolean        hasResident(String name)
boolean        hasResident(UUID uuid)
Resident       getMayor()
boolean        isMayor(Resident r)
boolean        hasMayor()
```

### Nation

```java
boolean hasNation()
Nation  getNation()                 // throws NotRegisteredException
Nation  getNationOrNull()
boolean isCapital()
```

### Claims & Town Blocks

```java
Collection<TownBlock> getTownBlocks()
int                   getNumTownBlocks()
int                   getMaxTownBlocks()
int                   availableTownBlocks()
boolean               hasTownBlock(WorldCoord wc)
boolean               hasTownBlock(TownBlock tb)
boolean               isOverClaimed()
boolean               hasUnlimitedClaims()
int                   getBonusBlocks()
int                   getPurchasedBlocks()
```

### Location Checks

```java
boolean   isInsideTown(Location location)
boolean   hasHomeBlock()
TownBlock getHomeBlock()            // throws NotRegisteredException
TownBlock getHomeBlockOrNull()
```

### Spawn

```java
Location getSpawn()                 // throws TownyException if not set
Location getSpawnOrNull()
void     setSpawn(Location loc)
```

### Settings / Flags

```java
boolean isPVP()
boolean hasMobs()
boolean isExplosion()
boolean isFire()
boolean isNeutral()
boolean isRuined()
boolean isBankrupt()
boolean isForSale()
double  getForSalePrice()
boolean isAllowedToWar()
```

### Relations

```java
List<Town> getAllies()
boolean    hasAlly(Town t)
boolean    hasMutualAlly(Town t)
List<Town> getMutualAllies()
boolean    hasEnemy(Town t)

Set<Resident>  getTrustedResidents()
boolean        hasTrustedResident(Resident r)
List<Town>     getTrustedTowns()
boolean        hasTrustedTown(Town t)

Collection<Resident> getOutlaws()
boolean              hasOutlaw(Resident r)
```

### Economy / Taxes

```java
Account getAccount()
void    collect(double amount)
double  getPlotPrice()
double  getCommercialPlotPrice()
double  getEmbassyPlotPrice()
boolean isTaxPercentage()
boolean hasUpkeep()
double  getBankCap()
double  getDebtBalance()
```

### Outposts

```java
boolean      hasOutpostSpawn()
Location     getOutpostSpawn(Integer index)
List<Location> getAllOutpostSpawns()
int          getMaxOutpostSpawn()
```

### Jails

```java
boolean      hasJails()
List<Jail>   getJails()
Jail         getPrimaryJail()
List<Resident> getJailedResidents()
```

### Messaging

```java
void playerBroadCastMessageToTown(Player player, String message)
```

### Persistence

```java
void    save()
boolean exists()
```

---

## Nation — `com.palmergames.bukkit.towny.object.Nation`

### Towns

```java
List<Town> getTowns()
int        getNumTowns()
int        getNumTownblocks()
boolean    hasTown(Town t)
boolean    hasTown(String name)
Town       getCapital()
boolean    isCapital(Town t)
```

### Residents & King

```java
List<Resident> getResidents()
int            getNumResidents()
boolean        hasResident(Resident r)
boolean        hasResident(String name)
Resident       getKing()
boolean        isKing(Resident r)
boolean        hasKing()
List<Resident> getAssistants()
boolean        hasAssistant(Resident r)
Collection<Resident> getOutlaws()
```

### Relations

```java
List<Nation> getAllies()
List<Nation> getMutualAllies()
boolean      hasAlly(Nation n)
boolean      hasMutualAlly(Nation n)
boolean      isAlliedWith(Nation n)
List<Nation> getEnemies()
boolean      hasEnemy(Nation n)

List<Town>   getSanctionedTowns()
boolean      hasSanctionedTown(Town t)
```

### Spawn

```java
Location getSpawn()
void     setSpawn(Location loc)
```

### Economy / Level

```java
Account  getAccount()
void     collect(double amount)
int      getLevelNumber()
int      getNationZoneSize()
boolean  isTaxPercentage()
double   getConqueredTax()
double   getBankCap()
```

### Messaging

```java
void playerBroadCastMessageToNation(Player player, String message)
```

### Persistence

```java
void    save()
boolean exists()
```

---

## TownBlock — `com.palmergames.bukkit.towny.object.TownBlock`

Represents a single claimed chunk (16×16 column).

### Ownership

```java
Town       getTownOrNull()
boolean    hasTown()
Resident   getResidentOrNull()          // plot owner (if personally owned)
boolean    hasResident()
boolean    hasResident(Resident r)
boolean    isOwner(TownBlockOwner o)    // TownBlockOwner = Town or Resident
```

### Type

```java
TownBlockType getType()
String        getTypeName()             // "default", "shop", "arena", "embassy", "farm", "inn", "wilds"
boolean       isHomeBlock()
boolean       isJail()
boolean       isOutpost()
```

### Permissions

```java
TownyPermission getPermissions()
boolean         isChanged()             // true if permissions differ from town defaults
boolean         hasPermissionOverrides()
Map<Resident, PermissionData> getPermissionOverrides()
```

### Trusted

```java
Set<Resident> getTrustedResidents()
boolean       hasTrustedResident(Resident r)
void          addTrustedResident(Resident r)
void          removeTrustedResident(Resident r)
```

---

## TownyPermission — `com.palmergames.bukkit.towny.object.TownyPermission`

Controls build/destroy/switch/item-use at each permission level.

### Enums

```java
// ActionType
TownyPermission.ActionType.BUILD
TownyPermission.ActionType.DESTROY
TownyPermission.ActionType.SWITCH
TownyPermission.ActionType.ITEM_USE

// PermLevel
TownyPermission.PermLevel.RESIDENT   // town members
TownyPermission.PermLevel.NATION     // same-nation members
TownyPermission.PermLevel.ALLY       // allied nations
TownyPermission.PermLevel.OUTSIDER   // everyone else
```

### Methods

```java
boolean getPerm(PermLevel level, ActionType action)
boolean getResidentPerm(ActionType action)
boolean getNationPerm(ActionType action)
boolean getAllyPerm(ActionType action)
boolean getOutsiderPerm(ActionType action)
void    set(PermLevel level, ActionType action, boolean value)
void    setAll(boolean value)
```

### Public Fields

```java
boolean pvp
boolean fire
boolean explosion
boolean mobs
```

---

## Permission Checking — PlayerCacheUtil

`com.palmergames.bukkit.towny.utils.PlayerCacheUtil`

The primary way to test whether a player can perform an action at a block's location, respecting all Towny rules (plot type, permissions, trust, etc.):

```java
import com.palmergames.bukkit.towny.utils.PlayerCacheUtil;
import com.palmergames.bukkit.towny.object.TownyPermission.ActionType;

boolean canBuild   = PlayerCacheUtil.getCachePermission(player, block.getLocation(), block.getType(), ActionType.BUILD);
boolean canDestroy = PlayerCacheUtil.getCachePermission(player, block.getLocation(), block.getType(), ActionType.DESTROY);
boolean canSwitch  = PlayerCacheUtil.getCachePermission(player, block.getLocation(), block.getType(), ActionType.SWITCH);
boolean canUse     = PlayerCacheUtil.getCachePermission(player, block.getLocation(), block.getType(), ActionType.ITEM_USE);
```

Other useful methods:

```java
PlayerCache cache       = PlayerCacheUtil.getCache(player);
boolean     isOwner     = PlayerCacheUtil.isOwnerCache(cache);        // admin / plot_owner / town_owner
TownBlockStatus status  = PlayerCacheUtil.getTownBlockStatus(player, WorldCoord.parseWorldCoord(location));
```

---

## Events

All events are in `com.palmergames.bukkit.towny.event` or sub-packages. Import with:

```java
import com.palmergames.bukkit.towny.event.*;
import com.palmergames.bukkit.towny.event.town.*;
import com.palmergames.bukkit.towny.event.actions.*;
```

### Town Lifecycle

| Event | Package | Cancellable | Key Methods |
|---|---|---|---|
| `PreNewTownEvent` | `event` | Yes | `getTownName()`, `getPlayer()` |
| `NewTownEvent` | `event` | No | `getTown()` |
| `PreDeleteTownEvent` | `event` | Yes | `getTown()` |
| `DeleteTownEvent` | `event` | No | `getTownName()` |
| `RenameTownEvent` | `event` | No | `getTown()`, `getOldName()` |
| `TownPreRenameEvent` | `event` | Yes | `getTown()`, `getNewName()` |
| `TownMergeEvent` | `event.town` | No | `getMergingTown()`, `getSurvivingTown()` |
| `TownPreMergeEvent` | `event.town` | Yes | `getMergingTown()`, `getSurvivingTown()` |

### Residents Joining / Leaving

| Event | Cancellable | Key Methods |
|---|---|---|
| `TownPreAddResidentEvent` | Yes | `getTown()`, `getResident()` |
| `TownAddResidentEvent` | No | `getTown()`, `getResident()` |
| `TownPreRemoveResidentEvent` | Yes | `getTown()`, `getResident()` |
| `TownRemoveResidentEvent` | No | `getTown()`, `getResident()` |
| `TownLeaveEvent` (event.town) | No | `getTown()`, `getResident()` |
| `TownKickEvent` (event.town) | No | `getTown()`, `getResident()`, `getKicker()` |

### Claims & Unclaims

| Event | Package | Cancellable | Key Methods |
|---|---|---|---|
| `TownPreClaimEvent` | `event` | Yes | `getTown()`, `getPlayer()`, `getTownBlock()`, `isOverClaim()`, `isOutpost()`, `isHomeBlock()` |
| `TownClaimEvent` | `event` | No | `getTown()`, `getResident()`, `getTownBlock()`, `isOverClaim()` |
| `TownPreUnclaimEvent` | `event.town` | Yes | `getTown()`, `getTownBlock()`, `getCause()` |
| `TownUnclaimEvent` | `event.town` | No | `getTown()`, `getWorldCoord()`, `isOverClaim()` |
| `TownPreUnclaimCmdEvent` | `event.town` | Yes | `getTown()`, `getPlayer()` |

### Mayor & Nation

| Event | Cancellable | Key Methods |
|---|---|---|
| `TownMayorChangedEvent` | No | `getTown()`, `getOldMayor()`, `getNewMayor()` |
| `NationAddTownEvent` | No | `getNation()`, `getTown()` |
| `NationPreAddTownEvent` | Yes | `getNation()`, `getTown()` |
| `NationRemoveTownEvent` | No | `getNation()`, `getTown()` |
| `NewNationEvent` | No | `getNation()` |
| `PreDeleteNationEvent` | Yes | `getNation()` |
| `DeleteNationEvent` | No | `getNationName()` |
| `NationPreRenameEvent` | Yes | `getNation()`, `getNewName()` |
| `RenameNationEvent` | No | `getNation()`, `getOldName()` |

### Ruin & Conquest

| Event | Cancellable | Key Methods |
|---|---|---|
| `TownPreRuinedEvent` (event.town) | Yes | `getTown()` |
| `TownRuinedEvent` (event.town) | No | `getTown()` |
| `TownConqueredEvent` (event.town) | No | `getTown()` |
| `TownUnconquerEvent` (event.town) | No | `getTown()` |

### Plot / Land Type

| Event | Cancellable | Key Methods |
|---|---|---|
| `PlotPreChangeTypeEvent` | Yes | `getTownBlock()`, `getNewType()`, `getPlayer()` |
| `PlotChangeTypeEvent` | No | `getTownBlock()`, `getNewType()`, `getPlayer()` |

### Action Events (Build / Destroy / Switch / Use)

These fire after Towny evaluates plot permissions and let you override the result. All extend `TownyActionEvent` and are cancellable.

| Event | Trigger |
|---|---|
| `TownyBuildEvent` | Player places a block |
| `TownyDestroyEvent` | Player breaks a block |
| `TownySwitchEvent` | Player interacts with a switch/button/door |
| `TownyItemuseEvent` | Player uses an item (bucket, bonemeal, etc.) |
| `TownyBurnEvent` | Block is burned by fire |
| `TownyExplodingBlocksEvent` | Explosion damages blocks |

Common shared methods (via `TownyActionEvent`):

```java
Player   getPlayer()
Location getLocation()
Material getMaterial()
TownBlock getTownBlock()
boolean  isInWilderness()
boolean  isCancelled()
void     setCancelled(boolean)
String   getMessage()            // message sent to player on cancel
void     setMessage(String)
```

`TownyBuildEvent` also adds: `Block getBlock()`

### Day Cycle

| Event | Cancellable | Notes |
|---|---|---|
| `PreNewDayEvent` | Yes | Fires before taxes / upkeep |
| `NewDayEvent` | No | Fires after new-day processing |
| `TownUpkeepCalculationEvent` | No | Override upkeep cost |

### Database / Reload

| Event | Notes |
|---|---|
| `TownyLoadedDatabaseEvent` | Fires after full data load — safe to query API |
| `TownBlockTypeRegisterEvent` | Re-register custom plot types here |
| `TranslationLoadEvent` | Re-inject custom language strings here |

---

## Common Usage Patterns

### 1. Check if a player has a town

```java
Resident res = TownyAPI.getInstance().getResident(player);
if (res != null && res.hasTown()) {
    Town town = res.getTownOrNull();
}
```

### 2. Get a player's nation

```java
Resident res = TownyAPI.getInstance().getResident(player);
if (res != null && res.hasNation()) {
    Nation nation = res.getNationOrNull();
}
```

### 3. Check if a player is standing in a town's territory

```java
boolean inWild = TownyAPI.getInstance().isWilderness(player.getLocation());
if (!inWild) {
    Town town = TownyAPI.getInstance().getTown(player.getLocation());
    // town != null here — if not wilderness there is a town
}
```

### 4. Check claim ownership of a location

```java
TownBlock tb = TownyAPI.getInstance().getTownBlock(location);
if (tb != null) {
    Town   owner   = tb.getTownOrNull();
    Resident plotOwner = tb.getResidentOrNull(); // personally-owned plot, or null
}
```

### 5. Check if player is a resident of the town at their location

```java
Town locationTown = TownyAPI.getInstance().getTown(player.getLocation());
Resident res      = TownyAPI.getInstance().getResident(player);
if (locationTown != null && res != null && locationTown.hasResident(res)) {
    // player is inside their own town
}
```

### 6. Check build permission at a location

```java
boolean canBuild = PlayerCacheUtil.getCachePermission(
    player,
    block.getLocation(),
    block.getType(),
    TownyPermission.ActionType.BUILD
);
```

### 7. Listen for town claim events

```java
@EventHandler
public void onTownClaim(TownPreClaimEvent event) {
    Town town = event.getTown();
    Player player = event.getPlayer();
    TownBlock tb = event.getTownBlock();

    if (/* your condition */) {
        event.setCancelled(true);
        event.setCancelMessage("You cannot claim here.");
    }
}

// Post-claim (read-only)
@EventHandler
public void onTownClaimed(TownClaimEvent event) {
    Town town = event.getTown();
    TownBlock tb = event.getTownBlock();
}
```

### 8. Listen for unclaim events

```java
@EventHandler
public void onTownUnclaim(TownPreUnclaimEvent event) {
    TownBlock tb = event.getTownBlock();
    Town town = event.getTown();   // may be null during ruin

    if (/* prevent unclaim */) {
        event.setCancelled(true);
    }
}
```

### 9. Block a build action in a specific plot type

```java
@EventHandler
public void onBuild(TownyBuildEvent event) {
    if (event.isCancelled()) return;
    TownBlock tb = event.getTownBlock();
    if (tb != null && "shop".equals(tb.getTypeName())) {
        event.setCancelled(true);
        event.setMessage("You cannot build in shop plots.");
    }
}
```

### 10. Check PvP at a location

```java
if (TownyAPI.getInstance().isPVP(player.getLocation())) {
    // PvP is enabled here
}
```

### 11. Register a custom subcommand (/town mycommand)

```java
TownyCommandAddonAPI.addSubCommand(
    TownyCommandAddonAPI.CommandType.TOWN,
    "mycommand",
    new MyCommandExecutor()
);
```

---

## Notes

- Methods named `getXOrNull()` are the safe variants — prefer them over `getX()` which can throw `NotRegisteredException`.
- `TownBlock` = one chunk column. `WorldCoord` is the coordinate wrapper (world + chunk X/Z).
- `PlayerCacheUtil.getCachePermission` is the canonical way to test player permissions; it evaluates plot-owner, town-member, ally, and outsider rules in one call.
- Query the API only after `TownyLoadedDatabaseEvent` fires; calling it during early startup may return null objects.
- Towny objects have a `save()` method — call it after mutating fields, or changes will not persist to disk/database.
- The `Pre-` prefix on events means they fire before the action and are cancellable. Events without the prefix fire after and are not.
