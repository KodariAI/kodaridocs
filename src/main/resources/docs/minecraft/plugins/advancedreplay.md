# AdvancedReplay API Reference

AdvancedReplay records and replays player sessions using packet-based NPCs. The API lets plugins start/stop recordings, play replays, inject custom data via hooks, implement custom storage backends, and listen for replay events. Add `AdvancedReplay` to `depend` or `softdepend` in plugin.yml.

## Code Examples

### Getting the API

```java
import me.jumper251.replay.api.ReplayAPI;

ReplayAPI api = ReplayAPI.getInstance();
```

### Record a Replay

```java
import me.jumper251.replay.api.ReplayAPI;
import me.jumper251.replay.replaysystem.Replay;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

ReplayAPI api = ReplayAPI.getInstance();

// Record specific players
Replay replay = api.recordReplay("my_replay", sender, player1, player2);

// Record all online players (omit player args)
Replay replay = api.recordReplay("my_replay", sender);

// Without a sender (recorded as CONSOLE)
Replay replay = api.recordReplay("my_replay", player1, player2);
```

### Stop a Recording

```java
import me.jumper251.replay.api.ReplayAPI;

ReplayAPI api = ReplayAPI.getInstance();

// Stop and save
api.stopReplay("my_replay", true);

// Stop and discard
api.stopReplay("my_replay", false);

// Stop, save, but skip saving if no actions were recorded
api.stopReplay("my_replay", true, true);
```

### Play a Replay

```java
import me.jumper251.replay.api.ReplayAPI;
import org.bukkit.entity.Player;

ReplayAPI api = ReplayAPI.getInstance();
api.playReplay("my_replay", watcherPlayer);
```

### Jump to a Specific Time

```java
import me.jumper251.replay.api.ReplayAPI;
import org.bukkit.entity.Player;

ReplayAPI api = ReplayAPI.getInstance();

// Jump to 30 seconds into the replay
api.jumpToReplayTime(watcherPlayer, 30);
```

### Check Active Recordings and Sessions

```java
import me.jumper251.replay.replaysystem.Replay;
import me.jumper251.replay.replaysystem.replaying.Replayer;
import me.jumper251.replay.replaysystem.replaying.ReplayHelper;
import me.jumper251.replay.utils.ReplayManager;

import java.util.HashMap;

// All currently recording replays (ID -> Replay)
HashMap<String, Replay> activeRecordings = ReplayManager.activeReplays;

// All players currently watching a replay (player name -> Replayer)
HashMap<String, Replayer> activeSessions = ReplayHelper.replaySessions;

// Check if a specific player is watching a replay
boolean isWatching = ReplayHelper.replaySessions.containsKey(player.getName());

// Get the Replayer for a watching player
Replayer replayer = ReplayHelper.replaySessions.get(player.getName());
if (replayer != null) {
    int currentTick = replayer.getCurrentTicks();
    int durationTicks = replayer.getReplay().getData().getDuration();
    double speed = replayer.getSpeed();
    boolean paused = replayer.isPaused();
}
```

### Control Playback (Pause, Speed, Skip)

```java
import me.jumper251.replay.replaysystem.replaying.Replayer;
import me.jumper251.replay.replaysystem.replaying.ReplayHelper;

Replayer replayer = ReplayHelper.replaySessions.get(player.getName());
if (replayer != null) {
    // Pause/unpause
    replayer.setPaused(true);
    replayer.setPaused(false);

    // Set playback speed (0.5 = half, 2.0 = double)
    replayer.setSpeed(2.0);

    // Skip forward 10 seconds
    replayer.getUtils().forward();

    // Rewind 10 seconds
    replayer.getUtils().backward();

    // Jump to specific second
    replayer.getUtils().jumpTo(45);

    // Stop playback entirely
    replayer.stop();
}
```

### Listen for Replay Session Finish

```java
import me.jumper251.replay.api.ReplaySessionFinishEvent;
import me.jumper251.replay.replaysystem.Replay;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ReplayListener implements Listener {

    @EventHandler
    public void onReplayFinish(ReplaySessionFinishEvent event) {
        Player player = event.getPlayer();
        Replay replay = event.getReplay();

        player.sendMessage("Finished watching replay: " + replay.getId());
        int durationSeconds = replay.getData().getDuration() / 20;
        player.sendMessage("Replay duration: " + durationSeconds + "s");
    }
}
```

### Register a Custom Hook (Inject Data into Recording/Playback)

Hooks are called every tick during recording and for `CUSTOM` actions during playback.

```java
import me.jumper251.replay.api.IReplayHook;
import me.jumper251.replay.api.ReplayAPI;
import me.jumper251.replay.replaysystem.data.ActionData;
import me.jumper251.replay.replaysystem.data.types.PacketData;
import me.jumper251.replay.replaysystem.replaying.Replayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class HealthHook implements IReplayHook {

    @Override
    public List<PacketData> onRecord(String playerName) {
        // Called every tick for each recorded player
        List<PacketData> data = new ArrayList<>();
        Player player = Bukkit.getPlayer(playerName);
        if (player != null) {
            // Store custom data (must extend PacketData and be Serializable)
            data.add(new HealthData(player.getHealth()));
        }
        return data; // return empty list to skip this tick
    }

    @Override
    public void onPlay(ActionData data, Replayer replayer) {
        // Called during playback for CUSTOM actions
        PacketData packetData = data.getPacketData();
        String playerName = data.getName();
        Player watcher = replayer.getWatchingPlayer();

        if (packetData instanceof HealthData healthData) {
            watcher.sendMessage(playerName + " had " + healthData.getHealth() + " HP");
        }
    }
}

// Register the hook
ReplayAPI.getInstance().registerHook(new HealthHook());

// Unregister later
// ReplayAPI.getInstance().unregisterHook(hook);
```

### Register a Custom Storage Backend

Replace the default file/database storage with your own implementation.

```java
import me.jumper251.replay.api.ReplayAPI;
import me.jumper251.replay.filesystem.saving.IReplaySaver;
import me.jumper251.replay.replaysystem.Replay;
import me.jumper251.replay.utils.fetcher.Consumer;

import java.util.List;

public class MyReplaySaver implements IReplaySaver {

    @Override
    public void saveReplay(Replay replay) {
        String id = replay.getId();
        // replay.getData() contains all recorded actions
        // replay.getReplayInfo() contains metadata (creator, time, duration)
        // Persist however you want (Redis, S3, custom DB, etc.)
    }

    @Override
    public void loadReplay(String replayName, Consumer<Replay> consumer) {
        // Load asynchronously, then call consumer.accept() with the result
        // NOTE: This is me.jumper251.replay.utils.fetcher.Consumer, NOT java.util.function.Consumer
        Replay replay = /* load from your storage */;
        consumer.accept(replay);
    }

    @Override
    public boolean replayExists(String replayName) {
        return /* check your storage */;
    }

    @Override
    public void deleteReplay(String replayName) {
        // Remove from your storage
    }

    @Override
    public List<String> getReplays() {
        return /* list all replay names from your storage */;
    }
}

// Register it
ReplayAPI.getInstance().registerReplaySaver(new MyReplaySaver());
```

### Access Replay Metadata

```java
import me.jumper251.replay.replaysystem.Replay;
import me.jumper251.replay.replaysystem.data.ReplayData;
import me.jumper251.replay.replaysystem.data.ReplayInfo;

Replay replay = /* from recordReplay() or event */;

// Metadata (available after saving)
ReplayInfo info = replay.getReplayInfo();
String id = info.getID();
String creator = info.getCreator();
Long timestamp = info.getTime(); // epoch millis
int durationTicks = info.getDuration();

// Recorded data
ReplayData data = replay.getData();
int totalTicks = data.getDuration();
String recordedBy = data.getCreator();
// Actions map: tick index -> list of actions at that tick
var actions = data.getActions(); // HashMap<Integer, List<ActionData>>
```

## API Reference (Trimmed)

### `me.jumper251.replay.api.ReplayAPI`

| Return | Method | Description |
|---|---|---|
| `static ReplayAPI` | `getInstance()` | Singleton instance |
| `Replay` | `recordReplay(String name, CommandSender sender, Player... players)` | Start recording (null/empty players = all online) |
| `Replay` | `recordReplay(String name, CommandSender sender, List<Player> players)` | Start recording with player list |
| `Replay` | `recordReplay(String name, Player... players)` | Start recording (no sender) |
| `Replay` | `recordReplay(String name, List<Player> players)` | Start recording (no sender, list) |
| `void` | `stopReplay(String name, boolean save)` | Stop recording |
| `void` | `stopReplay(String name, boolean save, boolean ignoreEmpty)` | Stop recording, optionally skip empty |
| `void` | `playReplay(String name, Player watcher)` | Play a saved replay for a player |
| `void` | `jumpToReplayTime(Player watcher, Integer second)` | Jump to specific second |
| `void` | `registerHook(IReplayHook hook)` | Register a recording/playback hook |
| `void` | `unregisterHook(IReplayHook hook)` | Unregister a hook |
| `void` | `registerReplaySaver(IReplaySaver saver)` | Set custom storage backend |
| `IReplaySaver` | `getReplaySaver()` | Get current storage backend |
| `HookManager` | `getHookManager()` | Get hook manager |

### `me.jumper251.replay.api.IReplayHook`

| Return | Method | Description |
|---|---|---|
| `List<PacketData>` | `onRecord(String playerName)` | Called every tick per recorded player. Return custom data or empty list. |
| `void` | `onPlay(ActionData data, Replayer replayer)` | Called during playback for `CUSTOM` actions |

### `me.jumper251.replay.api.HookManager`

| Return | Method | Description |
|---|---|---|
| `void` | `registerHook(IReplayHook hook)` | Add hook (skips duplicates) |
| `void` | `unregisterHook(IReplayHook hook)` | Remove hook |
| `boolean` | `isRegistered()` | True if any hooks registered |
| `List<IReplayHook>` | `getHooks()` | All registered hooks |

### `me.jumper251.replay.replaysystem.Replay`

| Return | Method | Description |
|---|---|---|
| `String` | `getId()` | Replay ID/name |
| `void` | `setId(String id)` | Set replay ID |
| `ReplayData` | `getData()` | Recorded action data |
| `ReplayInfo` | `getReplayInfo()` | Metadata (after saving) |
| `Recorder` | `getRecorder()` | Recorder (during recording) |
| `Replayer` | `getReplayer()` | Replayer (during playback) |
| `boolean` | `isRecording()` | Currently recording |
| `boolean` | `isPlaying()` | Currently playing |
| `void` | `play(Player watcher)` | Start playback directly |

### `me.jumper251.replay.replaysystem.replaying.Replayer`

| Return | Method | Description |
|---|---|---|
| `boolean` | `start()` | Start playback (returns false if world missing) |
| `void` | `stop()` | Stop playback, clean up NPCs, fire finish event |
| `Player` | `getWatchingPlayer()` | Player watching the replay |
| `Replay` | `getReplay()` | Replay being played |
| `boolean` | `isPaused()` | Playback paused |
| `void` | `setPaused(boolean paused)` | Pause/unpause |
| `void` | `setPaused(boolean paused, boolean updateClient)` | Pause with optional client tick-freeze (1.21+) |
| `void` | `setSpeed(double speed)` | Set playback speed |
| `double` | `getSpeed()` | Current speed |
| `int` | `getCurrentTicks()` | Current tick position |
| `ReplayingUtils` | `getUtils()` | Utility methods (forward/backward/jumpTo) |
| `HashMap<String, INPC>` | `getNPCList()` | Displayed NPCs (name -> NPC) |
| `HashMap<Integer, IEntity>` | `getEntityList()` | Displayed entities (ID -> entity) |

### `me.jumper251.replay.replaysystem.replaying.ReplayingUtils`

| Return | Method | Description |
|---|---|---|
| `void` | `forward()` | Skip forward 10 seconds (200 ticks) |
| `void` | `backward()` | Rewind 10 seconds (200 ticks) |
| `void` | `jumpTo(Integer seconds)` | Jump to specific second |

### `me.jumper251.replay.replaysystem.data.ReplayData`

| Return | Method | Description |
|---|---|---|
| `int` | `getDuration()` | Total duration in ticks |
| `String` | `getCreator()` | Who started the recording |
| `HashMap<Integer, List<ActionData>>` | `getActions()` | Tick index -> actions at that tick |

### `me.jumper251.replay.replaysystem.data.ReplayInfo`

| Return | Method | Description |
|---|---|---|
| `String` | `getID()` | Replay ID |
| `String` | `getCreator()` | Creator name |
| `Long` | `getTime()` | Save timestamp (epoch millis) |
| `int` | `getDuration()` | Duration in ticks |

### `me.jumper251.replay.replaysystem.data.ActionData`

| Return | Method | Description |
|---|---|---|
| `int` | `getTickIndex()` | Tick this action was recorded at |
| `ActionType` | `getType()` | `PACKET`, `SPAWN`, `DESPAWN`, `DEATH`, `WORLD`, `MESSAGE`, `CUSTOM` |
| `PacketData` | `getPacketData()` | Associated data (concrete subclass varies by type) |
| `String` | `getName()` | Player name this action belongs to |

### `me.jumper251.replay.filesystem.saving.IReplaySaver`

| Return | Method | Description |
|---|---|---|
| `void` | `saveReplay(Replay replay)` | Persist a replay |
| `void` | `loadReplay(String name, Consumer<Replay> consumer)` | Load async, call `consumer.accept()` with result |
| `boolean` | `replayExists(String name)` | Check if replay exists |
| `void` | `deleteReplay(String name)` | Delete a replay |
| `List<String>` | `getReplays()` | List all replay names |

> **Warning:** `Consumer` in `loadReplay` is `me.jumper251.replay.utils.fetcher.Consumer<T>`, NOT `java.util.function.Consumer`.

### Events

| Event | Package | Cancellable | Key Methods |
|---|---|---|---|
| `ReplaySessionFinishEvent` | `me.jumper251.replay.api` | No | `getPlayer()`, `getReplay()` |

### Static Registries

| Class | Field | Type | Description |
|---|---|---|---|
| `me.jumper251.replay.utils.ReplayManager` | `activeReplays` | `HashMap<String, Replay>` | Currently recording replays |
| `me.jumper251.replay.replaysystem.replaying.ReplayHelper` | `replaySessions` | `HashMap<String, Replayer>` | Players watching replays |
