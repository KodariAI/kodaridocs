# FoliaLib Complete Quick Reference

## Project Setup

### Adding FoliaLib to Your Project

In your manifest.kod file, add folialib to the include section:

manifest.kod:
include:
 - folialib

This will automatically include FoliaLib in your project compilation.

### Imports
import com.tcoded.folialib.FoliaLib;
import com.tcoded.folialib.wrapper.task.WrappedTask;
import com.tcoded.folialib.enums.EntityTaskResult;

## Initialization

In your main plugin class:
public class MyPlugin extends JavaPlugin {
   private FoliaLib foliaLib;
   
   @Override
   public void onEnable() {
       foliaLib = new FoliaLib(this);
   }
   
   @Override
   public void onDisable() {
       foliaLib.getScheduler().cancelAllTasks();
   }
}

## Complete Method Reference

### Global Tasks (World operations only)
foliaLib.getScheduler().runNextTick(Consumer<WrappedTask> task);
foliaLib.getScheduler().runLater(Runnable task, long delayTicks);
foliaLib.getScheduler().runLater(Consumer<WrappedTask> task, long delayTicks);
foliaLib.getScheduler().runLater(Runnable task, long delay, TimeUnit unit);
foliaLib.getScheduler().runTimer(Runnable task, long delayTicks, long periodTicks);
foliaLib.getScheduler().runTimer(Consumer<WrappedTask> task, long delayTicks, long periodTicks);
foliaLib.getScheduler().runTimer(Runnable task, long delay, long period, TimeUnit unit);

### Async Tasks (Thread-safe operations)
foliaLib.getScheduler().runAsync(Consumer<WrappedTask> task);
foliaLib.getScheduler().runLaterAsync(Runnable task, long delayTicks);
foliaLib.getScheduler().runLaterAsync(Consumer<WrappedTask> task, long delayTicks);
foliaLib.getScheduler().runLaterAsync(Runnable task, long delay, TimeUnit unit);
foliaLib.getScheduler().runTimerAsync(Runnable task, long delayTicks, long periodTicks);
foliaLib.getScheduler().runTimerAsync(Consumer<WrappedTask> task, long delayTicks, long periodTicks);
foliaLib.getScheduler().runTimerAsync(Runnable task, long delay, long period, TimeUnit unit);

### Location Tasks (Block/chunk operations)
CompletableFuture<Void> runAtLocation(Location location, Consumer<WrappedTask> task);
WrappedTask runAtLocationLater(Location location, Runnable task, long delayTicks);
CompletableFuture<Void> runAtLocationLater(Location location, Consumer<WrappedTask> task, long delayTicks);
WrappedTask runAtLocationLater(Location location, Runnable task, long delay, TimeUnit unit);
WrappedTask runAtLocationTimer(Location location, Runnable task, long delayTicks, long periodTicks);
void runAtLocationTimer(Location location, Consumer<WrappedTask> task, long delayTicks, long periodTicks);
WrappedTask runAtLocationTimer(Location location, Runnable task, long delay, long period, TimeUnit unit);

### Entity Tasks (Entity/player operations)
CompletableFuture<EntityTaskResult> runAtEntity(Entity entity, Consumer<WrappedTask> task);
CompletableFuture<EntityTaskResult> runAtEntityWithFallback(Entity entity, Consumer<WrappedTask> task, Runnable fallback);
WrappedTask runAtEntityLater(Entity entity, Runnable task, long delayTicks);
WrappedTask runAtEntityLater(Entity entity, Runnable task, Runnable fallback, long delayTicks);
CompletableFuture<Void> runAtEntityLater(Entity entity, Consumer<WrappedTask> task, long delayTicks);
WrappedTask runAtEntityTimer(Entity entity, Runnable task, long delayTicks, long periodTicks);
WrappedTask runAtEntityTimer(Entity entity, Runnable task, Runnable fallback, long delayTicks, long periodTicks);
void runAtEntityTimer(Entity entity, Consumer<WrappedTask> task, long delayTicks, long periodTicks);

### Teleportation
CompletableFuture<Boolean> teleportAsync(Entity entity, Location location);
CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent.TeleportCause cause);

### Thread Safety Checks
boolean isOwnedByCurrentRegion(Location location);
boolean isOwnedByCurrentRegion(Location location, int squareRadiusChunks);
boolean isOwnedByCurrentRegion(Entity entity);
boolean isOwnedByCurrentRegion(Block block);
boolean isOwnedByCurrentRegion(World world, int chunkX, int chunkZ);
boolean isOwnedByCurrentRegion(World world, int chunkX, int chunkZ, int squareRadiusChunks);
boolean isGlobalTickThread();

### Task Management
void cancelTask(WrappedTask task);
void cancelAllTasks();
List<WrappedTask> getAllTasks();
List<WrappedTask> getAllServerTasks();

### Platform Detection
boolean isFolia();
boolean isPaper();
boolean isSpigot();

### Player Retrieval (safe async)
Player getPlayer(String name);
Player getPlayerExact(String name);
Player getPlayer(UUID uuid);

## Key Classes

### WrappedTask Interface
void cancel();
boolean isCancelled();
Plugin getOwningPlugin();
boolean isAsync();

### EntityTaskResult Enum
EntityTaskResult.SUCCESS - Task executed successfully
EntityTaskResult.ENTITY_RETIRED - Entity was removed/unloaded
EntityTaskResult.SCHEDULER_RETIRED - Scheduler was shut down

## Folia Threading Rules

1. **Global Thread**: Only for world time, weather, console commands
2. **Region Thread**: Required for blocks, chunks, world modifications
3. **Entity Thread**: Required for entity/player modifications
4. **Never** access entities from global or wrong region thread
5. **Never** modify blocks from global or entity thread
6. **Always** use teleportAsync() for teleportation

## Complete Examples

### Event Listener with FoliaLib
public class MyListener implements Listener {
   private final FoliaLib foliaLib;
   
   public MyListener(FoliaLib foliaLib) {
       this.foliaLib = foliaLib;
   }
   
   @EventHandler
   public void onPlayerJoin(PlayerJoinEvent event) {
       Player player = event.getPlayer();
       
       // Safe delayed message
       foliaLib.getScheduler().runAtEntityLater(player, task -> {
           player.sendMessage("Welcome after 5 seconds!");
       }, 100L);
       
       // Safe repeating effect
       foliaLib.getScheduler().runAtEntityTimer(player, task -> {
           player.setFoodLevel(20);
           if (player.getHealth() < 10) {
               task.cancel();
           }
       }, 0L, 40L);
   }
   
   @EventHandler
   public void onBlockBreak(BlockBreakEvent event) {
       Block block = event.getBlock();
       Location loc = block.getLocation();
       
       // Safe block restoration
       foliaLib.getScheduler().runAtLocationLater(loc, task -> {
           block.setType(Material.STONE);
       }, 200L); // 10 seconds
   }
}

### Command Executor with FoliaLib
public class TeleportCommand implements CommandExecutor {
   private final FoliaLib foliaLib;
   
   public TeleportCommand(FoliaLib foliaLib) {
       this.foliaLib = foliaLib;
   }
   
   @Override
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
       if (!(sender instanceof Player player)) return false;
       
       Location target = new Location(player.getWorld(), 0, 100, 0);
       
       foliaLib.getScheduler().teleportAsync(player, target)
           .thenAccept(success -> {
               if (success) {
                   foliaLib.getScheduler().runAtEntity(player, task -> {
                       player.sendMessage("Teleported successfully!");
                       player.addPotionEffect(new PotionEffect(
                           PotionEffectType.SLOW_FALLING, 200, 1
                       ));
                   });
               }
           });
       
       return true;
   }
}

### Complex Multi-Region Operation
public void createTrail(Player player, Location destination) {
   Location start = player.getLocation();
   Vector direction = destination.toVector().subtract(start.toVector()).normalize();
   
   for (int i = 0; i < 20; i++) {
       Location particleLoc = start.clone().add(direction.clone().multiply(i));
       int delay = i * 2;
       
       // Each location might be in different region
       foliaLib.getScheduler().runAtLocationLater(particleLoc, task -> {
           particleLoc.getWorld().spawnParticle(Particle.FLAME, particleLoc, 5);
           
           // Check for nearby players at this location
           particleLoc.getWorld().getNearbyEntities(particleLoc, 2, 2, 2).forEach(entity -> {
               if (entity instanceof Player nearbyPlayer) {
                   // Must switch to entity's thread to modify
                   foliaLib.getScheduler().runAtEntity(nearbyPlayer, entityTask -> {
                       nearbyPlayer.sendMessage("Trail passed by!");
                   });
               }
           });
       }, delay);
   }
}

### Safe Inventory Management
public void giveItemsSafely(Player player, List<ItemStack> items) {
   foliaLib.getScheduler().runAtEntity(player, task -> {
       Inventory inv = player.getInventory();
       for (ItemStack item : items) {
           HashMap<Integer, ItemStack> overflow = inv.addItem(item);
           if (!overflow.isEmpty()) {
               // Drop items at player location safely
               Location dropLoc = player.getLocation();
               foliaLib.getScheduler().runAtLocation(dropLoc, locTask -> {
                   overflow.values().forEach(overflowItem -> 
                       dropLoc.getWorld().dropItem(dropLoc, overflowItem)
                   );
               });
           }
       }
       player.sendMessage("Items delivered!");
   });
}

## Common Migration Patterns

### From Bukkit Scheduler
// OLD - Bukkit way
Bukkit.getScheduler().runTaskLater(plugin, () -> {
   player.sendMessage("Hello");
   block.setType(Material.AIR);
}, 20L);

// NEW - FoliaLib way (must separate concerns)
foliaLib.getScheduler().runAtEntityLater(player, task -> {
   player.sendMessage("Hello");
}, 20L);

foliaLib.getScheduler().runAtLocationLater(block.getLocation(), task -> {
   block.setType(Material.AIR);
}, 20L);

### From Direct Teleportation
// OLD - Direct teleport
player.teleport(location);

// NEW - Async teleport with callback
foliaLib.getScheduler().teleportAsync(player, location)
   .thenAccept(success -> {
       if (success) {
           foliaLib.getScheduler().runAtEntity(player, task -> {
               player.sendMessage("Arrived!");
           });
       }
   });

## Debugging Tips

Check thread ownership before operations:
if (foliaLib.getScheduler().isOwnedByCurrentRegion(location)) {
   // Safe to modify blocks at location
}

if (foliaLib.getScheduler().isOwnedByCurrentRegion(entity)) {
   // Safe to modify entity
}

if (foliaLib.getScheduler().isGlobalTickThread()) {
   // Can modify world time/weather
}

## Performance Notes

- Region tasks have ~1 tick precision
- Entity tasks follow entities across regions efficiently  
- Async tasks run on separate thread pool
- Use Consumer<WrappedTask> for self-cancelling tasks
- Chain CompletableFutures for sequential operations
- 20 ticks = 1 second = 1000 milliseconds