# UniversalScheduler-1.0 API Reference

## Package: com.github.Anon8281.universalScheduler

### Class: com.github.Anon8281.universalScheduler.UniversalRunnable
Type: Abstract Class
Implements: java.lang.Runnable

Methods:
- void cancel() throws IllegalStateException
- boolean isCancelled() throws IllegalStateException
- MyScheduledTask runTask(Plugin) throws IllegalArgumentException, IllegalStateException
- MyScheduledTask runTaskLaterAsynchronously(Plugin, long) throws IllegalArgumentException, IllegalStateException
- MyScheduledTask runTaskTimerAsynchronously(Plugin, long, long) throws IllegalArgumentException, IllegalStateException
- MyScheduledTask runTaskLater(Plugin, long) throws IllegalArgumentException, IllegalStateException
- MyScheduledTask runTaskAsynchronously(Plugin) throws IllegalArgumentException, IllegalStateException
- MyScheduledTask runTaskTimer(Plugin, long, long) throws IllegalArgumentException, IllegalStateException

### Class: com.github.Anon8281.universalScheduler.UniversalScheduler
Type: Class

Methods:
- **static** TaskScheduler getScheduler(Plugin)

## Package: com.github.Anon8281.universalScheduler.bukkitScheduler

### Class: com.github.Anon8281.universalScheduler.bukkitScheduler.BukkitScheduledTask
Type: Class
Implements: com.github.Anon8281.universalScheduler.scheduling.tasks.MyScheduledTask

Methods:
- void cancel()
- boolean isRepeatingTask()
- Plugin getOwningPlugin()
- boolean isCancelled()
- boolean isCurrentlyRunning()

### Class: com.github.Anon8281.universalScheduler.bukkitScheduler.BukkitScheduler
Type: Class
Implements: com.github.Anon8281.universalScheduler.scheduling.schedulers.TaskScheduler

Methods:
- boolean isGlobalThread()
- boolean isRegionThread(Location)
- MyScheduledTask runTask(Runnable)
- MyScheduledTask runTask(Plugin, Runnable)
- boolean isEntityThread(Entity)
- MyScheduledTask runTaskLaterAsynchronously(Runnable, long)
- MyScheduledTask runTaskLaterAsynchronously(Plugin, Runnable, long)
- MyScheduledTask runTaskTimerAsynchronously(Runnable, long, long)
- MyScheduledTask runTaskTimerAsynchronously(Plugin, Runnable, long, long)
- MyScheduledTask runTaskAsynchronously(Runnable)
- MyScheduledTask runTaskAsynchronously(Plugin, Runnable)
- MyScheduledTask runTaskLater(Runnable, long)
- MyScheduledTask runTaskLater(Plugin, Runnable, long)
- void cancelTasks()
- void cancelTasks(Plugin)
- void execute(Runnable)
- MyScheduledTask runTaskTimer(Runnable, long, long)
- MyScheduledTask runTaskTimer(Plugin, Runnable, long, long)

## Package: com.github.Anon8281.universalScheduler.foliaScheduler

### Class: com.github.Anon8281.universalScheduler.foliaScheduler.FoliaScheduledTask
Type: Class
Implements: com.github.Anon8281.universalScheduler.scheduling.tasks.MyScheduledTask

Methods:
- void cancel()
- boolean isRepeatingTask()
- Plugin getOwningPlugin()
- boolean isCancelled()
- boolean isCurrentlyRunning()

### Class: com.github.Anon8281.universalScheduler.foliaScheduler.FoliaScheduler
Type: Class
Implements: com.github.Anon8281.universalScheduler.scheduling.schedulers.TaskScheduler

Methods:
- boolean isGlobalThread()
- boolean isRegionThread(Location)
- MyScheduledTask runTask(Runnable)
- MyScheduledTask runTask(Plugin, Runnable)
- MyScheduledTask runTask(Location, Runnable)
- MyScheduledTask runTask(Entity, Runnable)
- boolean isEntityThread(Entity)
- MyScheduledTask runTaskLaterAsynchronously(Runnable, long)
- MyScheduledTask runTaskLaterAsynchronously(Plugin, Runnable, long)
- MyScheduledTask runTaskTimerAsynchronously(Runnable, long, long)
- MyScheduledTask runTaskTimerAsynchronously(Plugin, Runnable, long, long)
- boolean isTickThread()
- MyScheduledTask runTaskAsynchronously(Runnable)
- MyScheduledTask runTaskAsynchronously(Plugin, Runnable)
- MyScheduledTask runTaskLater(Runnable, long)
- MyScheduledTask runTaskLater(Plugin, Runnable, long)
- MyScheduledTask runTaskLater(Location, Runnable, long)
- MyScheduledTask runTaskLater(Entity, Runnable, long)
- void cancelTasks()
- void cancelTasks(Plugin)
- void execute(Runnable)
- void execute(Location, Runnable)
- void execute(Entity, Runnable)
- MyScheduledTask runTaskTimer(Runnable, long, long)
- MyScheduledTask runTaskTimer(Plugin, Runnable, long, long)
- MyScheduledTask runTaskTimer(Location, Runnable, long, long)
- MyScheduledTask runTaskTimer(Entity, Runnable, long, long)

## Package: com.github.Anon8281.universalScheduler.paperScheduler

### Class: com.github.Anon8281.universalScheduler.paperScheduler.PaperScheduler
Type: Class
Extends: com.github.Anon8281.universalScheduler.foliaScheduler.FoliaScheduler

Methods:
- boolean isGlobalThread()

## Package: com.github.Anon8281.universalScheduler.scheduling.schedulers

### Class: com.github.Anon8281.universalScheduler.scheduling.schedulers.TaskScheduler
Type: Interface

Methods:
- boolean isGlobalThread()
- boolean isRegionThread(Location)
- boolean isEntityThread(Entity)
- MyScheduledTask runTaskTimerAsynchronously(Runnable, long, long)
- MyScheduledTask runTaskTimerAsynchronously(Plugin, Runnable, long, long)
- boolean isTickThread()
- MyScheduledTask scheduleSyncRepeatingTask(Runnable, long, long)
- MyScheduledTask runTaskLater(Runnable, long)
- MyScheduledTask runTaskLater(Plugin, Runnable, long)
- MyScheduledTask runTaskLater(Location, Runnable, long)
- MyScheduledTask runTaskLater(Entity, Runnable, long)
- void execute(Runnable)
- void execute(Location, Runnable)
- void execute(Entity, Runnable)
- Future callSyncMethod(Callable)
- MyScheduledTask runTask(Runnable)
- MyScheduledTask runTask(Plugin, Runnable)
- MyScheduledTask runTask(Location, Runnable)
- MyScheduledTask runTask(Entity, Runnable)
- MyScheduledTask runTaskLaterAsynchronously(Runnable, long)
- MyScheduledTask runTaskLaterAsynchronously(Plugin, Runnable, long)
- MyScheduledTask scheduleSyncDelayedTask(Runnable, long)
- MyScheduledTask scheduleSyncDelayedTask(Runnable)
- MyScheduledTask runTaskAsynchronously(Runnable)
- MyScheduledTask runTaskAsynchronously(Plugin, Runnable)
- void cancelTasks()
- void cancelTasks(Plugin)
- MyScheduledTask runTaskTimer(Runnable, long, long)
- MyScheduledTask runTaskTimer(Plugin, Runnable, long, long)
- MyScheduledTask runTaskTimer(Location, Runnable, long, long)
- MyScheduledTask runTaskTimer(Entity, Runnable, long, long)

## Package: com.github.Anon8281.universalScheduler.scheduling.tasks

### Class: com.github.Anon8281.universalScheduler.scheduling.tasks.MyScheduledTask
Type: Interface

Methods:
- void cancel()
- boolean isRepeatingTask()
- Plugin getOwningPlugin()
- boolean isCancelled()
- boolean isCurrentlyRunning()

## Package: com.github.Anon8281.universalScheduler.utils

### Class: com.github.Anon8281.universalScheduler.utils.JavaUtil
Type: Class

Methods:
- **static** boolean classExists(String)

