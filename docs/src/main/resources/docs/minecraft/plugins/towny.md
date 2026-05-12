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

> All signatures below are verified against the actual GitHub source. Many Towny events have non-obvious method names (e.g. `getKickedResident()` not `getResident()`) and exist in non-obvious packages. Don't guess — use exactly what's listed here.

> **Important:** Many Towny events run async (`super(!isPrimaryThread())`). If you need to call Bukkit APIs that require the main thread, schedule sync from the handler.

### Base Classes

**`com.palmergames.bukkit.towny.event.CancellableTownyEvent`** — abstract, extends `Event`, implements `Cancellable`.

| Return | Method |
|---|---|
| `boolean` | `isCancelled()` |
| `void` | `setCancelled(boolean)` |
| `String` | `getCancelMessage()` |
| `void` | `setCancelMessage(String)` |

**`com.palmergames.bukkit.towny.event.actions.TownyActionEvent`** — abstract, extends `CancellableTownyEvent`. Inherited by all build/destroy/switch/itemuse events.

| Return | Method |
|---|---|
| `Player` | `getPlayer()` |
| `Location` | `getLocation()` |
| `Material` | `getMaterial()` |
| `TownBlock` | `getTownBlock()` (nullable) |
| `boolean` | `isInWilderness()` |
| `boolean` | `hasTownBlock()` |
| `boolean` | `isMessageSuppressed()` |
| `void` | `suppressMessage()` |

### Claim Events

**`TownPreClaimEvent`** — package `com.palmergames.bukkit.towny.event` (NOT `event.town`). Cancellable.
- Constructor: `(Town, TownBlock, Player, boolean isOutpost, boolean isHomeblock, boolean isOverClaim)`
- `boolean isOverClaim()`, `boolean isOutpost()`, `boolean isHomeBlock()` (capital B)
- `TownBlock getTownBlock()`, `Town getTown()`, `Player getPlayer()`

**`TownClaimEvent`** — package `event`. NOT cancellable (post-event, async).
- Constructor: `(TownBlock townBlock, Player player, boolean isOverClaim)`
- `boolean isOverClaim()`, `TownBlock getTownBlock()`, `Resident getResident()`, `Town getTown()`
- **Does NOT have `isOutpost()` or `isHomeBlock()`** — those are only on `TownPreClaimEvent`.

**`TownPreUnclaimEvent`** — package `event.town`. Cancellable.
- Constructor: `(Town, TownBlock, Cause)`
- `Town getTown()` (nullable), `TownBlock getTownBlock()`, `Cause getCause()`
- Nested enum `Cause`: `UNKNOWN`, `COMMAND`, `ADMIN_COMMAND`, `DELETE`

**`TownUnclaimEvent`** — package `event.town` (NOT `event`). NOT cancellable (post-event).
- Constructor: `(Town, WorldCoord, boolean isOverClaim)`
- `Town getTown()` (nullable), `WorldCoord getWorldCoord()`, `boolean isOverClaim()`
- **Uses `WorldCoord`, NOT `TownBlock`** (block is already gone) — and there is **NO `getTownBlock()`**.

### Resident Membership Events

**`TownAddResidentEvent`** — package `event`. NOT cancellable.
- Constructor: `(Resident, Town)`
- `Resident getResident()`, `Town getTown()`, `Resident getMayor()` (nullable)

**`TownRemoveResidentEvent`** — package `event`. NOT cancellable.
- Constructor: `(Resident, Town)`
- `Resident getResident()`, `Town getTown()`

**`TownKickEvent`** — package `event.town`. **Cancellable**.
- Constructor: `(Resident kickedResident, Object kicker)`
- `Resident getKickedResident()` — **NOT `getResident()`**
- `Object getKicker()` — **returns `Object`, NOT `Resident`** (must instanceof-check for `Player` / `CommandSender`)
- `Town getTown()`

### Town/Nation Lifecycle

**`NewTownEvent`** — package `event`. NOT cancellable.
- Constructor: `(Town)`
- `Town getTown()`

**`DeleteTownEvent`** — package `event`. NOT cancellable.
- Constructor: `(Town town, Resident mayor, int numTownBlocks, Cause cause, CommandSender sender)`
- `String getTownName()`, `UUID getTownUUID()`, `long getTownCreated()`
- `UUID getMayorUUID()` (nullable), `Resident getMayor()` (nullable)
- `Cause getCause()`, `int getNumTownBlocks()`
- `CommandSender getSender()` (nullable), `Resident getSenderResident()` (nullable)
- Nested enum `Cause`

**`NewNationEvent`** — package `event`. NOT cancellable.
- Constructor: `(Nation)`
- `Nation getNation()`

**`DeleteNationEvent`** — package `event`. NOT cancellable.
- Constructor: `(Nation, Resident king, Cause cause, CommandSender sender)`
- `String getNationName()`, `UUID getNationUUID()`, `long getNationCreated()`
- `UUID getLeaderUUID()` — **NOT `getKingUUID()`**
- `Resident getLeader()` — **NOT `getKing()`** (despite the field being named `king`)
- `Cause getCause()`, `CommandSender getSender()`, `Resident getSenderResident()`

**`NationAddTownEvent`** — package `event`. NOT cancellable.
- Constructor: `(Town, Nation)`
- `Town getTown()`, `Nation getNation()`

**`NationRemoveTownEvent`** — package `event`. NOT cancellable.
- Constructor: `(Town, Nation)`
- `Town getTown()`, `Nation getNation()`

### Action Events (Build / Destroy / Switch / Itemuse)

All in package `event.actions`, all extend `TownyActionEvent` (cancellable + inherited methods).

**`TownyBuildEvent`** — Constructor: `(Player, Location, Material, Block, TownBlock, boolean cancelled)` — adds `Block getBlock()`

**`TownyDestroyEvent`** — Constructor: `(Player, Location, Material, Block, TownBlock, boolean cancelled)` — adds `Block getBlock()`

**`TownySwitchEvent`** — Constructor: `(Player, Location, Material, Block, TownBlock, boolean cancelled)` — adds `Block getBlock()`

**`TownyItemuseEvent`** — Constructor: `(Player, Location, Material, TownBlock, boolean cancelled)` — **NO `getBlock()`** (constructor takes no Block)

### Day Cycle

**`NewDayEvent`** — package `event`. NOT cancellable, async.
- Constructor: `(List<String> bankruptTowns, List<String> removedTowns, List<String> fallenNations, double townUpkeepCollected, double nationUpkeepCollected, long time)`
- `List<String> getBankruptedTowns()` — **NOT `getBankruptTowns()`** (past tense with -ed)
- `List<String> getFallenTowns()`, `List<String> getFallenNations()`
- `double getTownUpkeepCollected()`, `double getNationUpkeepCollected()`
- `long getTime()`

**`NewHourEvent`** — package `com.palmergames.bukkit.towny.event.time` (**NOT `event`**). NOT cancellable.
- Constructor: `(long time)`
- `long getTime()`

### Common Mistakes Cheat Sheet

| Mistake | Fix |
|---|---|
| `event.getResident()` on `TownKickEvent` | `event.getKickedResident()` |
| `event.getKicker()` returns `Resident` | Returns `Object` — instanceof-check |
| `event.isOutpost()` on `TownClaimEvent` | Only on `TownPreClaimEvent` |
| `event.getTownBlock()` on `TownUnclaimEvent` | Use `event.getWorldCoord()` instead |
| `TownPreClaimEvent` in `event.town` package | It's in `event` (root) |
| `TownUnclaimEvent` in `event` package | It's in `event.town` |
| `NewHourEvent` in `event` | It's in `event.time` |
| `event.getKing()` on `DeleteNationEvent` | `event.getLeader()` |
| `event.getBankruptTowns()` on `NewDayEvent` | `event.getBankruptedTowns()` (past tense) |

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
