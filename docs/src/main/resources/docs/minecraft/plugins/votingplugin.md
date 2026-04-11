# VotingPlugin API Reference

Vote reward and leaderboard plugin by BenCodez. Integrates with NuVotifier and tracks vote counts, streaks, points, and rewards. The API lets plugins query player vote stats, manipulate points, manage vote streaks, fire votes programmatically, and listen for vote events. Add `VotingPlugin` to `depend` or `softdepend` in plugin.yml.

> **Note:** Events are async and use a `cancelled` field you must check/set manually — they do NOT implement `Cancellable`.

## Code Examples

### Getting the API

```java
import com.bencodez.votingplugin.VotingPluginMain;
import com.bencodez.votingplugin.user.UserManager;
import com.bencodez.votingplugin.user.VotingPluginUser;

VotingPluginMain plugin = VotingPluginMain.plugin;
UserManager userManager = plugin.getVotingPluginUserManager();
```

### Query a Player's Vote Stats

```java
import com.bencodez.votingplugin.VotingPluginMain;
import com.bencodez.votingplugin.user.VotingPluginUser;
import org.bukkit.entity.Player;

VotingPluginUser user = VotingPluginMain.plugin.getVotingPluginUserManager()
    .getVotingPluginUser(player);

int points = user.getPoints();
int allTime = user.getAllTimeTotal();
int daily = user.getDailyTotal();
int weekly = user.getWeeklyTotal();
int monthly = user.getMonthTotal();

int dayStreak = user.getDayVoteStreak();
int bestDayStreak = user.getBestDayVoteStreak();

long lastVote = user.getLastVoteTime();
int sitesVotedToday = user.getSitesVotedOn();
int sitesLeft = user.getSitesNotVotedOn();

boolean canVoteAny = user.canVoteAny();
boolean canVoteAll = user.canVoteAll();
```

### Manage Vote Points

```java
import com.bencodez.votingplugin.user.VotingPluginUser;

VotingPluginUser user = VotingPluginMain.plugin.getVotingPluginUserManager()
    .getVotingPluginUser(player);

// Add points (returns new total)
int newTotal = user.addPoints(100);

// Remove points (returns false if not enough)
boolean removed = user.removePoints(50);

// Set points directly
user.setPoints(500);
```

### Get Vote Sites

```java
import com.bencodez.votingplugin.VotingPluginMain;
import com.bencodez.votingplugin.votesites.VoteSite;
import com.bencodez.votingplugin.votesites.VoteSiteManager;

import java.util.ArrayList;
import java.util.List;

VoteSiteManager siteManager = VotingPluginMain.plugin.getVoteSiteManager();

ArrayList<VoteSite> enabled = siteManager.getVoteSitesEnabled();
VoteSite specific = siteManager.getVoteSite("MinecraftMP", true);

if (specific != null) {
    String url = specific.getVoteURL();
    String displayName = specific.getDisplayName();
    boolean isEnabled = specific.isEnabled();
}
```

### Check Per-Site Vote Status

```java
import com.bencodez.votingplugin.user.VotingPluginUser;
import com.bencodez.votingplugin.votesites.VoteSite;

VotingPluginUser user = VotingPluginMain.plugin.getVotingPluginUserManager()
    .getVotingPluginUser(player);

VoteSite site = VotingPluginMain.plugin.getVoteSiteManager()
    .getVoteSite("MinecraftMP", true);

if (site != null) {
    boolean canVote = user.canVoteSite(site);
    long lastVoteTime = user.getLastVoteTimer(site);
    long nextAvailable = user.voteNextDurationTime(site);
}
```

### Simulate a Vote Programmatically

```java
import com.bencodez.votingplugin.user.VotingPluginUser;
import com.bencodez.votingplugin.votesites.VoteSite;

VotingPluginUser user = VotingPluginMain.plugin.getVotingPluginUserManager()
    .getVotingPluginUser(player);

VoteSite site = VotingPluginMain.plugin.getVoteSiteManager()
    .getVoteSite("MinecraftMP", true);

if (site != null) {
    // Full vote pipeline — gives rewards, updates stats, fires events
    user.playerVote(site, player.isOnline(), false);
}
```

### Give Rewards for a Site Directly

```java
import com.bencodez.votingplugin.user.VotingPluginUser;
import com.bencodez.votingplugin.votesites.VoteSite;

VoteSite site = VotingPluginMain.plugin.getVoteSiteManager()
    .getVoteSite("MinecraftMP", true);

if (site != null && site.hasRewards()) {
    site.giveRewards(user, true, false); // online, notBungee
}
```

### Listen for Vote Events

```java
import com.bencodez.votingplugin.events.PlayerVoteEvent;
import com.bencodez.votingplugin.events.PlayerPostVoteEvent;
import com.bencodez.votingplugin.events.PlayerReceivePointsEvent;
import com.bencodez.votingplugin.events.VotePartyEvent;
import com.bencodez.votingplugin.user.VotingPluginUser;
import com.bencodez.votingplugin.votesites.VoteSite;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class VoteEventListener implements Listener {

    @EventHandler
    public void onVote(PlayerVoteEvent event) {
        // Async event — use cancelled field (NOT Cancellable interface)
        VotingPluginUser user = event.getVotingPluginUser();
        VoteSite site = event.getVoteSite();
        boolean realVote = event.isRealVote();
        boolean online = event.isWasOnline();

        // Cancel manually
        event.setCancelled(true);
    }

    @EventHandler
    public void onPostVote(PlayerPostVoteEvent event) {
        // Async — fires after vote processing completes
        String playerName = event.getPlayerName();
        java.util.UUID uuid = event.getUuid();
        String service = event.getService();
    }

    @EventHandler
    public void onReceivePoints(PlayerReceivePointsEvent event) {
        // Async
        VotingPluginUser player = event.getPlayer();
        int points = event.getPoints();
        String service = event.getServiceSite();
    }

    @EventHandler
    public void onVoteParty(VotePartyEvent event) {
        // Async — vote party triggered
    }
}
```

## API Reference (Trimmed)

### `com.bencodez.votingplugin.VotingPluginMain`

| Return | Method / Field | Description |
|---|---|---|
| `static VotingPluginMain` | `plugin` | Plugin instance (static field) |
| `UserManager` | `getVotingPluginUserManager()` | User manager |
| `VoteSiteManager` | `getVoteSiteManager()` | Vote site manager |
| `RewardHandler` | `getRewardHandler()` | Reward handler |

### `com.bencodez.votingplugin.user.UserManager`

| Return | Method | Description |
|---|---|---|
| `VotingPluginUser` | `getVotingPluginUser(Player)` | By player |
| `VotingPluginUser` | `getVotingPluginUser(OfflinePlayer)` | By offline player |
| `VotingPluginUser` | `getVotingPluginUser(UUID)` | By UUID |
| `VotingPluginUser` | `getVotingPluginUser(String name)` | By name |

### `com.bencodez.votingplugin.user.VotingPluginUser`

| Return | Method | Description |
|---|---|---|
| `int` | `getPoints()` | Vote points |
| `int` | `addPoints(int)` | Add points (returns total) |
| `boolean` | `removePoints(int)` | Remove points |
| `void` | `setPoints(int)` | Set points |
| `int` | `getAllTimeTotal()` | All-time vote count |
| `int` | `getDailyTotal()` | Daily count |
| `int` | `getWeeklyTotal()` | Weekly count |
| `int` | `getMonthTotal()` | Monthly count |
| `int` | `getDayVoteStreak()` | Current day streak |
| `int` | `getWeekVoteStreak()` | Current week streak |
| `int` | `getMonthVoteStreak()` | Current month streak |
| `int` | `getBestDayVoteStreak()` | Best day streak |
| `long` | `getLastVoteTime()` | Last vote epoch ms |
| `long` | `getLastVoteTimer(VoteSite)` | Last vote for site |
| `boolean` | `canVoteAny()` | Can vote on any site |
| `boolean` | `canVoteAll()` | Can vote on all sites |
| `boolean` | `canVoteSite(VoteSite)` | Can vote on specific site |
| `int` | `getSitesVotedOn()` | Sites voted today |
| `int` | `getSitesNotVotedOn()` | Sites not voted today |
| `long` | `voteNextDurationTime(VoteSite)` | Time until next vote |
| `void` | `playerVote(VoteSite, boolean online, boolean bungee)` | Process full vote pipeline |

### `com.bencodez.votingplugin.votesites.VoteSiteManager`

| Return | Method | Description |
|---|---|---|
| `List<VoteSite>` | `getVoteSites()` | All sites |
| `ArrayList<VoteSite>` | `getVoteSitesEnabled()` | Enabled sites |
| `VoteSite` | `getVoteSite(String, boolean checkEnabled)` | By name |
| `boolean` | `hasVoteSite(String)` | Exists |

### `com.bencodez.votingplugin.votesites.VoteSite`

| Return | Method | Description |
|---|---|---|
| `String` | `getKey()` | Site config key |
| `String` | `getDisplayName()` | Display name |
| `String` | `getVoteURL()` | Vote URL |
| `String` | `getServiceSite()` | Service name match |
| `boolean` | `isEnabled()` | Is enabled |
| `void` | `giveRewards(VotingPluginUser, boolean online, boolean bungee)` | Give rewards |
| `boolean` | `hasRewards()` | Has rewards configured |

### Events (`com.bencodez.votingplugin.events`)

All events are **async**. Cancellation uses a manual `cancelled` field — call `setCancelled(boolean)` and check `isCancelled()` yourself.

| Event | Key Methods |
|---|---|
| `PlayerVoteEvent` | `getVotingPluginUser()`, `getVoteSite()`, `isRealVote()`, `isWasOnline()`, `isCancelled()`, `setCancelled(boolean)` |
| `PlayerPostVoteEvent` | `getUuid()`, `getPlayerName()`, `getService()`, `getVoteSite()`, `isCached()` |
| `PlayerReceivePointsEvent` | `getPlayer()`, `getPoints()`, `getServiceSite()` |
| `PlayerSpecialRewardEvent` | `getUser()`, `getType()` (`SpecialRewardType`), `getVoteUUID()` |
| `VoteMilestoneRewardEvent` | `getUser()`, `getMilestone()`, `getValue()`, `getRewardPath()` |
| `VotePartyEvent` | (no data) |
| `VoteShopPurchaseEvent` | `getPlayerUuid()`, `getUser()`, `getIdentifier()`, `getCost()` |
| `PlayerVoteCoolDownEndEvent` | `getPlayer()` |
| `PlayerVoteSiteCoolDownEndEvent` | `getPlayer()`, `getSite()` |

**`SpecialRewardType` enum values:** `VOTESTREAK`, `VOTESTREAKS`, `TOPVOTER`
