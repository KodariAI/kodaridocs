# NuVotifier API Reference

Vote listener that receives votes from Minecraft server listing websites via Votifier protocol. The API lets plugins listen for votes, read vote data, and dispatch test votes. Add `Votifier` to `depend` or `softdepend` in plugin.yml.

> **Note:** The event package differs by platform. On Bukkit it's `com.vexsoftware.votifier.model.VotifierEvent`, on BungeeCord it's `com.vexsoftware.votifier.bungee.events.VotifierEvent`, on Velocity it's `com.vexsoftware.votifier.velocity.event.VotifierEvent`.

## Code Examples

### Listen for Votes (Bukkit)

```java
import com.vexsoftware.votifier.model.Vote;
import com.vexsoftware.votifier.model.VotifierEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class VoteListener implements Listener {

    @EventHandler
    public void onVote(VotifierEvent event) {
        // NOT cancellable on Bukkit
        Vote vote = event.getVote();

        String voter = vote.getUsername();
        String service = vote.getServiceName(); // which site
        String address = vote.getAddress();
        String timestamp = vote.getTimeStamp();

        Player player = Bukkit.getPlayerExact(voter);
        if (player != null) {
            player.sendMessage("Thanks for voting on " + service + "!");
            // give rewards
        } else {
            // queue offline reward
        }
    }
}
```

### Listen for Votes (BungeeCord)

```java
import com.vexsoftware.votifier.bungee.events.VotifierEvent;
import com.vexsoftware.votifier.model.Vote;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class BungeeVoteListener implements Listener {

    @EventHandler
    public void onVote(VotifierEvent event) {
        // IS cancellable on BungeeCord
        Vote vote = event.getVote();

        if (shouldBlock(vote)) {
            event.setCancelled(true);
        }
    }
}
```

### Listen for Votes (Velocity)

```java
import com.velocitypowered.api.event.ResultedEvent.GenericResult;
import com.velocitypowered.api.event.Subscribe;
import com.vexsoftware.votifier.velocity.event.VotifierEvent;
import com.vexsoftware.votifier.model.Vote;

public class VelocityVoteListener {

    @Subscribe
    public void onVote(VotifierEvent event) {
        Vote vote = event.getVote();

        if (shouldBlock(vote)) {
            event.setResult(GenericResult.denied()); // cancel via result
        }
    }
}
```

### Dispatch a Test Vote Programmatically

```java
import com.vexsoftware.votifier.model.Vote;
import com.vexsoftware.votifier.net.VotifierSession;
import com.vexsoftware.votifier.platform.VotifierPlugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

Plugin votifier = Bukkit.getPluginManager().getPlugin("NuVotifier");
if (votifier instanceof VotifierPlugin plugin) {
    Vote vote = new Vote(
        "MyWebsite",           // service name
        "PlayerName",          // voter username
        "127.0.0.1",           // address
        String.valueOf(System.currentTimeMillis())
    );

    try {
        plugin.onVoteReceived(vote, VotifierSession.ProtocolVersion.TEST, "localhost.test");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

## API Reference (Trimmed)

### `com.vexsoftware.votifier.model.Vote`

| Return | Method | Description |
|---|---|---|
| `String` | `getServiceName()` | Vote site name |
| `String` | `getUsername()` | Voter username |
| `String` | `getAddress()` | IP address |
| `String` | `getTimeStamp()` | Timestamp string |
| `byte[]` | `getAdditionalData()` | Extra data (cloned) |
| `JsonObject` | `serialize()` | JSON representation |

**Constructors:**
- `Vote(String serviceName, String username, String address, String timeStamp)`
- `Vote(String serviceName, String username, String address, String timeStamp, byte[] additionalData)`
- `Vote(JsonObject jsonObject)`

### `com.vexsoftware.votifier.platform.VotifierPlugin` (interface)

The core interface that all platform NuVotifier implementations implement.

| Return | Method | Description |
|---|---|---|
| `void` | `onVoteReceived(Vote, VotifierSession.ProtocolVersion, String remoteAddress)` | Dispatch a vote |
| `Map<String, Key>` | `getTokens()` | Configured tokens |
| `boolean` | `isDebug()` | Debug mode |

**Retrieval:** Cast `Bukkit.getPluginManager().getPlugin("NuVotifier")` to `VotifierPlugin`.

### Events

| Platform | Package | Class | Cancellable |
|---|---|---|---|
| Bukkit | `com.vexsoftware.votifier.model` | `VotifierEvent` | No |
| BungeeCord | `com.vexsoftware.votifier.bungee.events` | `VotifierEvent` | Yes (`setCancelled(boolean)`) |
| Velocity | `com.vexsoftware.votifier.velocity.event` | `VotifierEvent` | Yes (via `setResult(GenericResult.denied())`) |
| Sponge | `com.vexsoftware.votifier.sponge.event` | `VotifierEvent` | No |
| Fabric | `com.vexsoftware.votifier.fabric.event` | `VoteListener.EVENT` (callback) | No |

All events expose `getVote()` returning the `Vote` object.
