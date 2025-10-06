# Chunky-API-Complete-Documentation

**Plugin:** Chunky - Chunk Pre-generator
**API Version:** 1.3.41
**Package:** org.popcraft.chunky.api

## Developer API Setup

### Maven Repository Configuration

#### Gradle (Kotlin DSL)
repositories {
    maven("https://repo.codemc.io/repository/maven-public/")
}

dependencies {
    compileOnly(group = "org.popcraft", name = "chunky-common", version = "1.3.38")
}

#### Maven
<repositories>
    <repository>
        <id>codemc</id>
        <url>https://repo.codemc.io/repository/maven-public/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>org.popcraft</groupId>
        <artifactId>chunky-common</artifactId>
        <version>1.3.38</version>
        <scope>provided</scope>
    </dependency>
</dependencies>

## Getting Started

### Obtaining API Instance

#### Bukkit/Spigot/Paper
ChunkyAPI chunky = Bukkit.getServer().getServicesManager().load(ChunkyAPI.class);

### Basic Usage Example
if (chunky.version() == 0) {
    chunky.startTask("world", "square", 0, 0, 500, 500, "concentric");
    chunky.onGenerationComplete(event -> getLogger().info("Generation completed for " + event.world()));
}

## API Interface: ChunkyAPI

Package: org.popcraft.chunky.api

### Method: version()
Return Type: int
Description: Gets the current API version
Implementation: Returns 0 for current version
Usage: Check this to ensure compatibility with expected API version
Example:
int apiVersion = chunky.version();
if (apiVersion != 0) {
    // Disable integration for unexpected version
    return;
}

### Method: isRunning(String world)
Parameters:
- world: String - The world identifier
Return Type: boolean
Description: Checks if a generation task is currently running for a world
Implementation: Checks chunky.getGenerationTasks().containsKey(world)
Example:
if (chunky.isRunning("world")) {
    player.sendMessage("Generation already in progress!");
}

### Method: startTask(String world, String shape, double centerX, double centerZ, double radiusX, double radiusZ, String pattern)
Parameters:
- world: String - The world identifier
- shape: String - The selection shape (e.g., "square", "circle", "ellipse", "pentagon", "triangle")
- centerX: double - The center x coordinate
- centerZ: double - The center z coordinate  
- radiusX: double - The primary radius (x-axis)
- radiusZ: double - The secondary radius (z-axis) (only used for certain shapes like ellipse)
- pattern: String - The generation pattern (e.g., "concentric", "spiral", "loop", "random")
Return Type: boolean
Description: Starts a generation task with given selection in a world
Returns: true if task was created and started successfully, false if world doesn't exist or task already running
Implementation: Creates Selection and GenerationTask, adds to tasks map, runs on scheduler
Example:
// Start a square generation from center 0,0 with radius 500
boolean started = chunky.startTask("world", "square", 0, 0, 500, 500, "concentric");

// Start a circular generation 
chunky.startTask("world_nether", "circle", 100, 100, 250, 250, "spiral");

// Start an ellipse generation with different x/z radii
chunky.startTask("world", "ellipse", 0, 0, 300, 200, "loop");

### Method: pauseTask(String world)
Parameters:
- world: String - The world identifier
Return Type: boolean
Description: Pauses a generation task in a world
Returns: true if task was paused, false if no task found
Implementation: Calls task.stop(false) on the GenerationTask
Example:
if (chunky.pauseTask("world")) {
    player.sendMessage("Generation paused!");
}

### Method: continueTask(String world)
Parameters:
- world: String - The world identifier
Return Type: boolean  
Description: Continues a paused generation task in a world
Returns: true if task was continued, false if world not found, no saved task, or already running
Implementation: Loads saved task from TaskLoader, adds to tasks map, runs on scheduler
Example:
if (chunky.continueTask("world")) {
    player.sendMessage("Generation resumed!");
}

### Method: cancelTask(String world)
Parameters:
- world: String - The world identifier
Return Type: boolean
Description: Cancels a generation task in a world
Returns: true if task was cancelled, false if world not found or no task running
Implementation: Removes from tasks map, calls task.stop(true), and cancels in TaskLoader
Example:
if (chunky.cancelTask("world")) {
    player.sendMessage("Generation cancelled!");
}

### Method: onGenerationProgress(Consumer<GenerationProgressEvent> listener)
Parameters:
- listener: Consumer<GenerationProgressEvent> - The listener to register
Description: Register a listener for generation progress events
Implementation: Subscribes to EventBus for GenerationProgressEvent class
Example:
chunky.onGenerationProgress(event -> {
    if (event.world().equals("world")) {
        Bukkit.broadcastMessage(String.format("Progress: %.2f%% - %d chunks at %.2f chunks/s", 
            event.progress(), event.chunks(), event.rate()));
    }
});

### Method: onGenerationComplete(Consumer<GenerationCompleteEvent> listener)
Parameters:
- listener: Consumer<GenerationCompleteEvent> - The listener to register
Description: Register a listener for generation complete events
Implementation: Subscribes to EventBus for GenerationCompleteEvent class
Example:
chunky.onGenerationComplete(event -> {
    getLogger().info("Generation completed for " + event.world());
    Bukkit.broadcastMessage("World generation finished!");
});

## Implementation Class: ChunkyAPIImpl

Package: org.popcraft.chunky.api
Implements: ChunkyAPI

### Full Implementation Source
package org.popcraft.chunky.api;

import java.util.function.Consumer;
import org.popcraft.chunky.Chunky;
import org.popcraft.chunky.GenerationTask;
import org.popcraft.chunky.Selection;
import org.popcraft.chunky.api.event.task.GenerationCompleteEvent;
import org.popcraft.chunky.api.event.task.GenerationProgressEvent;
import org.popcraft.chunky.platform.World;
import org.popcraft.chunky.util.Input;
import org.popcraft.chunky.util.Parameter;

public class ChunkyAPIImpl implements ChunkyAPI {
  private final Chunky chunky;
  
  public ChunkyAPIImpl(Chunky chunky) {
    this.chunky = chunky;
  }
  
  public int version() {
    return 0;
  }
  
  public boolean isRunning(String world) {
    return this.chunky.getGenerationTasks().containsKey(world);
  }
  
  public boolean startTask(String world, String shape, double centerX, double centerZ, double radiusX, double radiusZ, String pattern) {
    World implWorld = Input.tryWorld(this.chunky, world).orElse(null);
    if (implWorld == null)
      return false; 
    if (this.chunky.getGenerationTasks().containsKey(world))
      return false; 
    Selection selection = Selection.builder(this.chunky, implWorld).shape(shape).center(centerX, centerZ).radiusX(radiusX).radiusZ(radiusZ).pattern(Parameter.of(pattern)).build();
    GenerationTask task = new GenerationTask(this.chunky, selection);
    this.chunky.getGenerationTasks().put(world, task);
    this.chunky.getScheduler().runTask((Runnable)task);
    return true;
  }
  
  public boolean pauseTask(String world) {
    GenerationTask task = (GenerationTask)this.chunky.getGenerationTasks().get(world);
    if (task == null)
      return false; 
    task.stop(false);
    return true;
  }
  
  public boolean continueTask(String world) {
    World implWorld = Input.tryWorld(this.chunky, world).orElse(null);
    if (implWorld == null)
      return false; 
    GenerationTask task = this.chunky.getTaskLoader().loadTask(implWorld).orElse(null);
    if (task == null || task.isCancelled())
      return false; 
    if (this.chunky.getGenerationTasks().containsKey(world))
      return false; 
    this.chunky.getGenerationTasks().put(world, task);
    this.chunky.getScheduler().runTask((Runnable)task);
    return true;
  }
  
  public boolean cancelTask(String world) {
    World implWorld = Input.tryWorld(this.chunky, world).orElse(null);
    if (implWorld == null)
      return false; 
    if (!this.chunky.getGenerationTasks().containsKey(world))
      return false; 
    ((GenerationTask)this.chunky.getGenerationTasks().remove(world)).stop(true);
    this.chunky.getTaskLoader().cancelTask(implWorld);
    return true;
  }
  
  public void onGenerationProgress(Consumer<GenerationProgressEvent> event) {
    this.chunky.getEventBus().subscribe(GenerationProgressEvent.class, event);
  }
  
  public void onGenerationComplete(Consumer<GenerationCompleteEvent> event) {
    this.chunky.getEventBus().subscribe(GenerationCompleteEvent.class, event);
  }
}

## Event Classes

### GenerationCompleteEvent

Package: org.popcraft.chunky.api.event.task
Type: Record Class
Implements: org.popcraft.chunky.event.Event

#### Record Components
- world: String - The world identifier associated with the completed task

#### Constructor
GenerationCompleteEvent(String world)
Creates instance of GenerationCompleteEvent record class

#### Methods
- world(): String - Returns the value of the world record component
- toString(): String - Returns string representation of this record class
- hashCode(): int - Returns hash code value for this object
- equals(Object o): boolean - Indicates whether some other object is "equal to" this one

#### Usage Example
chunky.onGenerationComplete(event -> {
    String worldName = event.world();
    // Notify admins
    Bukkit.getOnlinePlayers().stream()
        .filter(p -> p.hasPermission("chunky.admin"))
        .forEach(p -> p.sendMessage("Generation complete for: " + worldName));
});

### GenerationProgressEvent

Package: org.popcraft.chunky.api.event.task
Type: Record Class
Implements: org.popcraft.chunky.event.Event

#### Record Components
- world: String - The world identifier
- chunks: long - The number of chunks generated
- complete: boolean - If the generation task completed
- progress: float - The percent progress (0-100)
- hours: long - The number of hours elapsed for this task
- minutes: long - The number of minutes elapsed for this task
- seconds: long - The number of seconds elapsed for this task
- rate: double - The current average generation rate (chunks/second)
- x: long - The current chunk's x coordinate
- z: long - The current chunk's z coordinate

#### Constructor
GenerationProgressEvent(String world, long chunks, boolean complete, float progress, 
                       long hours, long minutes, long seconds, double rate, long x, long z)
Creates instance of GenerationProgressEvent record class

#### Methods
- world(): String - Returns the value of the world record component
- chunks(): long - Returns the value of the chunks record component
- complete(): boolean - Returns the value of the complete record component
- progress(): float - Returns the value of the progress record component
- hours(): long - Returns the value of the hours record component
- minutes(): long - Returns the value of the minutes record component  
- seconds(): long - Returns the value of the seconds record component
- rate(): double - Returns the value of the rate record component
- x(): long - Returns the value of the x record component
- z(): long - Returns the value of the z record component
- toString(): String - Returns string representation of this record class
- hashCode(): int - Returns hash code value for this object
- equals(Object o): boolean - Indicates whether some other object is "equal to" this one

#### Usage Example
chunky.onGenerationProgress(event -> {
    // Log detailed progress every 5%
    if (event.progress() % 5 == 0) {
        getLogger().info(String.format(
            "World: %s | Progress: %.2f%% | Chunks: %d | Rate: %.2f chunks/s | Time: %dh %dm %ds | Position: [%d, %d]",
            event.world(),
            event.progress(),
            event.chunks(),
            event.rate(),
            event.hours(),
            event.minutes(),
            event.seconds(),
            event.x(),
            event.z()
        ));
    }
    
    // Check if complete
    if (event.complete()) {
        Bukkit.broadcastMessage("Generation finished for " + event.world());
    }
});

## Complete Integration Examples

### Example 1: Basic Generation Manager
public class ChunkGenerationManager {
    private final ChunkyAPI chunky;
    private final Plugin plugin;
    
    public ChunkGenerationManager(Plugin plugin) {
        this.plugin = plugin;
        this.chunky = Bukkit.getServer().getServicesManager().load(ChunkyAPI.class);
        
        if (chunky == null) {
            plugin.getLogger().severe("Chunky API not found!");
            return;
        }
        
        if (chunky.version() != 0) {
            plugin.getLogger().warning("Unexpected Chunky API version: " + chunky.version());
            return;
        }
        
        setupListeners();
    }
    
    private void setupListeners() {
        chunky.onGenerationProgress(this::handleProgress);
        chunky.onGenerationComplete(this::handleComplete);
    }
    
    private void handleProgress(GenerationProgressEvent event) {
        // Update scoreboard or boss bar
        if (event.progress() % 10 == 0) {
            plugin.getLogger().info("Generation progress for " + event.world() + ": " + event.progress() + "%");
        }
    }
    
    private void handleComplete(GenerationCompleteEvent event) {
        plugin.getLogger().info("Generation complete for world: " + event.world());
        // Trigger post-generation tasks
    }
    
    public boolean startGeneration(String world, int radius) {
        if (chunky.isRunning(world)) {
            return false;
        }
        return chunky.startTask(world, "square", 0, 0, radius, radius, "concentric");
    }
    
    public void pauseGeneration(String world) {
        if (chunky.pauseTask(world)) {
            plugin.getLogger().info("Paused generation for: " + world);
        }
    }
    
    public void resumeGeneration(String world) {
        if (chunky.continueTask(world)) {
            plugin.getLogger().info("Resumed generation for: " + world);
        }
    }
    
    public void cancelGeneration(String world) {
        if (chunky.cancelTask(world)) {
            plugin.getLogger().info("Cancelled generation for: " + world);
        }
    }
}

### Example 2: Command Integration
public class GenerateCommand implements CommandExecutor {
    private final ChunkyAPI chunky;
    
    public GenerateCommand() {
        this.chunky = Bukkit.getServer().getServicesManager().load(ChunkyAPI.class);
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 2) {
            sender.sendMessage("Usage: /generate <world> <radius> [shape] [pattern]");
            return true;
        }
        
        String world = args[0];
        int radius = Integer.parseInt(args[1]);
        String shape = args.length > 2 ? args[2] : "square";
        String pattern = args.length > 3 ? args[3] : "concentric";
        
        if (chunky.isRunning(world)) {
            sender.sendMessage("Generation already running for " + world);
            return true;
        }
        
        if (chunky.startTask(world, shape, 0, 0, radius, radius, pattern)) {
            sender.sendMessage(String.format("Started %s generation for %s with radius %d using %s pattern", 
                shape, world, radius, pattern));
            
            // Register progress updates
            chunky.onGenerationProgress(event -> {
                if (event.world().equals(world) && event.progress() % 25 == 0) {
                    sender.sendMessage(String.format("Progress: %.0f%% - Rate: %.2f chunks/s", 
                        event.progress(), event.rate()));
                }
            });
            
            chunky.onGenerationComplete(event -> {
                if (event.world().equals(world)) {
                    sender.sendMessage("Generation complete for " + world + "!");
                }
            });
        } else {
            sender.sendMessage("Failed to start generation! Check world name and try again.");
        }
        
        return true;
    }
}

### Example 3: Multi-World Generation Queue
import java.util.*;
import java.util.concurrent.CompletableFuture;

public class GenerationQueue {
    private final ChunkyAPI chunky;
    private final Queue<GenerationTask> queue = new LinkedList<>();
    private final Plugin plugin;
    private boolean isProcessing = false;
    private String currentWorld = null;
    
    private static class GenerationTask {
        String world;
        String shape;
        double centerX, centerZ, radiusX, radiusZ;
        String pattern;
        CompletableFuture<Void> future;
        
        GenerationTask(String world, String shape, double centerX, double centerZ, 
                      double radiusX, double radiusZ, String pattern) {
            this.world = world;
            this.shape = shape;
            this.centerX = centerX;
            this.centerZ = centerZ;
            this.radiusX = radiusX;
            this.radiusZ = radiusZ;
            this.pattern = pattern;
            this.future = new CompletableFuture<>();
        }
    }
    
    public GenerationQueue(Plugin plugin) {
        this.plugin = plugin;
        this.chunky = Bukkit.getServer().getServicesManager().load(ChunkyAPI.class);
        
        chunky.onGenerationComplete(event -> {
            if (event.world().equals(currentWorld)) {
                plugin.getLogger().info("Completed: " + event.world());
                
                // Complete the future for this task
                queue.stream()
                    .filter(t -> t.world.equals(event.world()))
                    .findFirst()
                    .ifPresent(t -> t.future.complete(null));
                
                currentWorld = null;
                processNext();
            }
        });
    }
    
    public CompletableFuture<Void> queueGeneration(String world, String shape, double centerX, 
                                                   double centerZ, double radiusX, double radiusZ, 
                                                   String pattern) {
        GenerationTask task = new GenerationTask(world, shape, centerX, centerZ, radiusX, radiusZ, pattern);
        queue.add(task);
        
        if (!isProcessing) {
            processNext();
        }
        
        return task.future;
    }
    
    private void processNext() {
        if (queue.isEmpty()) {
            isProcessing = false;
            currentWorld = null;
            return;
        }
        
        isProcessing = true;
        GenerationTask task = queue.poll();
        currentWorld = task.world;
        
        boolean started = chunky.startTask(task.world, task.shape, task.centerX, task.centerZ, 
                                          task.radiusX, task.radiusZ, task.pattern);
        
        if (!started) {
            plugin.getLogger().warning("Failed to start generation for " + task.world);
            task.future.completeExceptionally(new RuntimeException("Failed to start generation"));
            currentWorld = null;
            processNext();
        }
    }
    
    public int getQueueSize() {
        return queue.size();
    }
    
    public boolean isGenerating() {
        return isProcessing;
    }
    
    public String getCurrentWorld() {
        return currentWorld;
    }
}

### Example 4: Progress Tracking with Boss Bar
import org.bukkit.boss.*;
import java.util.*;

public class GenerationProgressTracker {
    private final Map<String, BossBar> bossBars = new HashMap<>();
    private final Map<String, Long> startTimes = new HashMap<>();
    private final ChunkyAPI chunky;
    private final Plugin plugin;
    
    public GenerationProgressTracker(Plugin plugin) {
        this.plugin = plugin;
        this.chunky = Bukkit.getServer().getServicesManager().load(ChunkyAPI.class);
        
        chunky.onGenerationProgress(event -> updateBossBar(event));
        chunky.onGenerationComplete(event -> {
            removeBossBar(event.world());
            
            // Log final statistics
            long startTime = startTimes.remove(event.world());
            if (startTime != null) {
                long totalTime = System.currentTimeMillis() - startTime;
                plugin.getLogger().info(String.format(
                    "Generation complete for %s - Total time: %d minutes",
                    event.world(), totalTime / 60000
                ));
            }
        });
    }
    
    public void trackGeneration(String world) {
        startTimes.put(world, System.currentTimeMillis());
    }
    
    private void updateBossBar(GenerationProgressEvent event) {
        BossBar bar = bossBars.computeIfAbsent(event.world(), k -> {
            BossBar newBar = Bukkit.createBossBar(
                "Generating " + k,
                BarColor.GREEN,
                BarStyle.SOLID
            );
            return newBar;
        });
        
        // Update progress
        bar.setProgress(Math.min(event.progress() / 100.0, 1.0));
        
        // Update color based on rate
        if (event.rate() < 10) {
            bar.setColor(BarColor.RED);
        } else if (event.rate() < 50) {
            bar.setColor(BarColor.YELLOW);
        } else {
            bar.setColor(BarColor.GREEN);
        }
        
        // Update title with detailed info
        bar.setTitle(String.format("Generating %s: %.1f%% | %d chunks | %.1f/s | %dh %dm %ds | [%d, %d]",
            event.world(), 
            event.progress(), 
            event.chunks(), 
            event.rate(),
            event.hours(),
            event.minutes(),
            event.seconds(),
            event.x(),
            event.z()
        ));
        
        // Add all online players to see progress
        Bukkit.getOnlinePlayers().forEach(player -> {
            if (!bar.getPlayers().contains(player)) {
                bar.addPlayer(player);
            }
        });
    }
    
    private void removeBossBar(String world) {
        BossBar bar = bossBars.remove(world);
        if (bar != null) {
            bar.removeAll();
        }
    }
}

### Example 5: Automated Server Pre-generation
import java.util.*;

public class AutoPregeneration implements Listener {
    private final ChunkyAPI chunky;
    private final Plugin plugin;
    private final Map<String, Integer> worldRadii = new HashMap<>();
    
    public AutoPregeneration(Plugin plugin) {
        this.plugin = plugin;
        this.chunky = Bukkit.getServer().getServicesManager().load(ChunkyAPI.class);
        
        // Configure world radii
        worldRadii.put("world", 5000);
        worldRadii.put("world_nether", 2500);
        worldRadii.put("world_the_end", 1000);
        
        // Register listener
        Bukkit.getPluginManager().registerEvents(this, plugin);
        
        // Start initial generations
        startAllGenerations();
    }
    
    @EventHandler
    public void onWorldLoad(WorldLoadEvent event) {
        String worldName = event.getWorld().getName();
        
        if (worldRadii.containsKey(worldName) && !chunky.isRunning(worldName)) {
            Bukkit.getScheduler().runTaskLater(plugin, () -> {
                startGeneration(worldName);
            }, 100L); // Delay 5 seconds
        }
    }
    
    private void startAllGenerations() {
        worldRadii.forEach((world, radius) -> {
            if (Bukkit.getWorld(world) != null && !chunky.isRunning(world)) {
                startGeneration(world);
            }
        });
    }
    
    private void startGeneration(String world) {
        Integer radius = worldRadii.get(world);
        if (radius == null) return;
        
        if (chunky.startTask(world, "square", 0, 0, radius, radius, "concentric")) {
            plugin.getLogger().info("Started pre-generation for " + world + " with radius " + radius);
            
            // Monitor progress
            chunky.onGenerationProgress(event -> {
                if (event.world().equals(world) && event.progress() % 10 == 0) {
                    plugin.getLogger().info(String.format("%s: %.1f%% complete", 
                        event.world(), event.progress()));
                }
            });
            
            // Handle completion
            chunky.onGenerationComplete(event -> {
                if (event.world().equals(world)) {
                    plugin.getLogger().info("Pre-generation complete for " + world);
                    Bukkit.broadcastMessage("§aWorld §f" + world + "§a has been fully pre-generated!");
                }
            });
        }
    }
    
    public void pauseAll() {
        worldRadii.keySet().forEach(world -> chunky.pauseTask(world));
    }
    
    public void resumeAll() {
        worldRadii.keySet().forEach(world -> chunky.continueTask(world));
    }
}

## Important Notes

### API Versioning
- Current API version is 0
- API version will be bumped for any breaking changes
- Always check version() in your integration and disable if unexpected
- Deprecated methods will be annotated for at least one release before removal

### Available Shapes
- "square" - Square selection (uses radiusX for all sides)
- "circle" - Circular selection (uses radiusX as radius)
- "ellipse" - Elliptical selection (uses both radiusX and radiusZ)
- "pentagon" - Pentagon selection
- "triangle" - Triangle selection

### Available Patterns
- "concentric" - Generates from center outward in rings
- "spiral" - Generates in a spiral pattern from center
- "loop" - Generates in a loop pattern
- "random" - Generates chunks randomly within selection

### Internal Architecture
- Uses Chunky instance to manage tasks
- GenerationTasks stored in map by world name
- Selection built using Selection.builder()
- Tasks run on Chunky's scheduler
- Events distributed through EventBus
- TaskLoader handles persistence of paused tasks

### Thread Safety
- All API methods are thread-safe
- Events are fired asynchronously
- Use Bukkit scheduler for any Bukkit API calls from event listeners
- Don't modify generation tasks directly

### Error Handling
- Methods return false on failure rather than throwing exceptions
- World validation happens before task creation
- Tasks cannot be started if already running
- Continue only works with previously paused tasks

### Best Practices
1. Always check API version before using
2. Handle null API instance gracefully (plugin might not be installed)
3. Check isRunning() before starting new tasks
4. Register event listeners once to avoid duplicates
5. Consider server performance when starting large generations
6. Use appropriate shapes and patterns for your use case
7. Monitor progress events to provide feedback to users
8. Clean up boss bars and other resources on completion
9. Save/persist queue state for server restarts
10. Implement rate limiting for player-initiated generations