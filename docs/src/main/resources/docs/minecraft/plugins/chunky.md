# Chunky API

Chunk pre-generation plugin for Bukkit/Spigot/Paper. Lets you programmatically start, pause, resume, and cancel chunk generation tasks and listen for progress/completion events.

## Getting the API

```java
import org.popcraft.chunky.api.ChunkyAPI;
import org.bukkit.Bukkit;

ChunkyAPI chunky = Bukkit.getServer().getServicesManager().load(ChunkyAPI.class);
if (chunky == null) {
    getLogger().warning("Chunky not found");
    return;
}
if (chunky.version() != 0) {
    getLogger().warning("Unsupported Chunky API version: " + chunky.version());
    return;
}
```

## Starting and Managing Tasks

```java
import org.popcraft.chunky.api.ChunkyAPI;
import org.bukkit.Bukkit;

ChunkyAPI chunky = Bukkit.getServer().getServicesManager().load(ChunkyAPI.class);

// Start a square generation centered at 0,0 with radius 500 using concentric pattern
boolean started = chunky.startTask("world", "square", 0, 0, 500, 500, "concentric");

// Start a circular generation in the nether
chunky.startTask("world_nether", "circle", 100, 100, 250, 250, "spiral");

// Start an ellipse with different x/z radii
chunky.startTask("world", "ellipse", 0, 0, 300, 200, "region");

// Check if running, then pause/resume/cancel
if (chunky.isRunning("world")) {
    chunky.pauseTask("world");    // pauses the task (can resume later)
}
chunky.continueTask("world");     // resumes a paused task
chunky.cancelTask("world");       // cancels and removes the task
```

## Listening for Events

```java
import org.popcraft.chunky.api.ChunkyAPI;
import org.popcraft.chunky.api.event.task.GenerationProgressEvent;
import org.popcraft.chunky.api.event.task.GenerationCompleteEvent;
import org.bukkit.Bukkit;

ChunkyAPI chunky = Bukkit.getServer().getServicesManager().load(ChunkyAPI.class);

// Progress events fire periodically during generation
chunky.onGenerationProgress(event -> {
    getLogger().info(String.format(
        "%s: %.1f%% | %d chunks | %.1f chunks/s | %dh %dm %ds",
        event.world(), event.progress(), event.chunks(),
        event.rate(), event.hours(), event.minutes(), event.seconds()
    ));
});

// Completion event fires once when a task finishes
chunky.onGenerationComplete(event -> {
    getLogger().info("Generation complete for " + event.world());
});
```

Note: Events fire asynchronously. Use `Bukkit.getScheduler().runTask(plugin, ...)` inside listeners if you need to call Bukkit API methods.

## Full Integration Example

```java
import org.popcraft.chunky.api.ChunkyAPI;
import org.popcraft.chunky.api.event.task.GenerationCompleteEvent;
import org.popcraft.chunky.api.event.task.GenerationProgressEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PregenManager {
    private final ChunkyAPI chunky;
    private final JavaPlugin plugin;

    public PregenManager(JavaPlugin plugin) {
        this.plugin = plugin;
        this.chunky = Bukkit.getServer().getServicesManager().load(ChunkyAPI.class);
        if (chunky == null || chunky.version() != 0) {
            plugin.getLogger().severe("Chunky API unavailable or incompatible");
            return;
        }
        chunky.onGenerationProgress(this::onProgress);
        chunky.onGenerationComplete(this::onComplete);
    }

    public boolean startGeneration(String world, int radius) {
        if (chunky.isRunning(world)) {
            return false;
        }
        return chunky.startTask(world, "square", 0, 0, radius, radius, "concentric");
    }

    public void pauseGeneration(String world) {
        chunky.pauseTask(world);
    }

    public void resumeGeneration(String world) {
        chunky.continueTask(world);
    }

    public void cancelGeneration(String world) {
        chunky.cancelTask(world);
    }

    private void onProgress(GenerationProgressEvent event) {
        if (event.progress() % 10 < 1) {
            plugin.getLogger().info(event.world() + ": " + event.progress() + "%");
        }
    }

    private void onComplete(GenerationCompleteEvent event) {
        Bukkit.getScheduler().runTask(plugin, () ->
            Bukkit.broadcastMessage("Pre-generation complete for " + event.world())
        );
    }
}
```

---

## API Reference

### org.popcraft.chunky.api.ChunkyAPI

| Method | Return | Description |
|---|---|---|
| `version()` | `int` | Current API version (currently `0`). Check this for compatibility. |
| `isRunning(String world)` | `boolean` | Whether a generation task is active for the given world. |
| `startTask(String world, String shape, double centerX, double centerZ, double radiusX, double radiusZ, String pattern)` | `boolean` | Starts generation. Returns `false` if world not found or task already running. |
| `pauseTask(String world)` | `boolean` | Pauses a running task. Returns `false` if no task found. |
| `continueTask(String world)` | `boolean` | Resumes a paused task. Returns `false` if no saved task or already running. |
| `cancelTask(String world)` | `boolean` | Cancels and removes a task. Returns `false` if no task running. |
| `onGenerationProgress(Consumer<GenerationProgressEvent> listener)` | `void` | Registers a progress event listener. |
| `onGenerationComplete(Consumer<GenerationCompleteEvent> listener)` | `void` | Registers a completion event listener. |

### org.popcraft.chunky.api.event.task.GenerationProgressEvent

Java record implementing `org.popcraft.chunky.event.Event`.

| Accessor | Type | Description |
|---|---|---|
| `world()` | `String` | World identifier |
| `chunks()` | `long` | Number of chunks generated |
| `complete()` | `boolean` | Whether the task completed |
| `progress()` | `float` | Percent progress (0-100) |
| `hours()` | `long` | Hours elapsed |
| `minutes()` | `long` | Minutes elapsed |
| `seconds()` | `long` | Seconds elapsed |
| `rate()` | `double` | Generation rate (chunks/second) |
| `x()` | `long` | Current chunk x coordinate |
| `z()` | `long` | Current chunk z coordinate |

### org.popcraft.chunky.api.event.task.GenerationCompleteEvent

Java record implementing `org.popcraft.chunky.event.Event`.

| Accessor | Type | Description |
|---|---|---|
| `world()` | `String` | World identifier of the completed task |

### Valid Shape Strings

`"square"` (default), `"circle"`, `"rectangle"`, `"ellipse"`, `"triangle"`, `"diamond"`, `"pentagon"`, `"hexagon"`, `"star"`

Shapes `"rectangle"` and `"ellipse"` use both `radiusX` and `radiusZ`. All other shapes use `radiusX` only.

### Valid Pattern Strings

`"region"` (default, most efficient -- uses Hilbert curve by region), `"concentric"`, `"spiral"`, `"loop"`, `"csv"`, `"world"`
