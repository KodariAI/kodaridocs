# Citizens-2.0.41-b4026-net-citizensnpcs-api API Reference

**Package Filter:** `net.citizensnpcs.api`

## Package: net.citizensnpcs.api

### Class: net.citizensnpcs.api.CitizensPlugin
Type: Interface
Implements: org.bukkit.plugin.Plugin

Methods:
- NPCRegistry createAnonymousNPCRegistry(NPCDataStore)
- void removeNamedNPCRegistry(String)
- NPCRegistry getNPCRegistry()
- TraitFactory getTraitFactory()
- Iterable<NPCRegistry> getNPCRegistries()
- AsyncChunkCache getAsyncChunkCache()
- void onImplementationChanged()
- BehaviorRegistry getBehaviorRegistry()
- NPCRegistry getTemporaryNPCRegistry()
- NPCRegistry getNamedNPCRegistry(String)
- ExpressionRegistry getExpressionRegistry()
- NPCRegistry createNamedNPCRegistry(String, NPCDataStore)
- TemplateRegistry getTemplateRegistry()
- void setDefaultNPCDataStore(NPCDataStore)
- LocationLookup getLocationLookup()
- NPCSelector getDefaultNPCSelector()
- void talk(SpeechContext)
- CommandManager getCommandManager()
- ClassLoader getOwningClassLoader()
- NMSHelper getNMSHelper()

### Class: net.citizensnpcs.api.NMSHelper
Type: Interface

Methods:
- OfflinePlayer getPlayer(BlockCommandSender)
- void setTexture(String, SkullMeta)
- void updateInventoryTitle(Player, SpigotUtil$InventoryViewAPI, String)
- SpigotUtil$InventoryViewAPI openAnvilInventory(Player, Inventory, String)
- String getTexture(SkullMeta)

### Class: net.citizensnpcs.api.CitizensAPI
Type: Class

Methods:
- **static** NPCRegistry createAnonymousNPCRegistry(NPCDataStore store)
- **static** void removeNamedNPCRegistry(String name)
- **static** NPCRegistry getNPCRegistry()
- **static** TraitFactory getTraitFactory()
- **static** NPCRegistry createInMemoryNPCRegistry(String name)
- **static** Iterable<NPCRegistry> getNPCRegistries()
- **static** File getDataFolder()
- **static** AsyncChunkCache getAsyncChunkCache()
- **static** BehaviorRegistry getBehaviorRegistry()
- **static** NPCRegistry getTemporaryNPCRegistry()
- **static** NPCRegistry getNamedNPCRegistry(String name)
- **static** ExpressionRegistry getExpressionRegistry()
- **static** NPCRegistry createNamedNPCRegistry(String name, NPCDataStore store)
- **static** void setImplementation(CitizensPlugin implementation)
- **static** TemplateRegistry getTemplateRegistry()
- **static** Plugin getPlugin()
- **static** boolean hasImplementation()
- **static** LocationLookup getLocationLookup()
- **static** NPCSelector getDefaultNPCSelector()
- **static** void talk(SpeechContext context)
- **static** void registerEvents(Listener listener)
- **static** CommandManager getCommandManager()
- **static** SchedulerAdapter getScheduler()
- **static** void shutdown()
- **static** NMSHelper getNMSHelper()

### Class: net.citizensnpcs.api.LocationLookup
Type: Class
Extends: net.citizensnpcs.api.util.schedulers.SchedulerRunnable

Constructors:
- LocationLookup(NPCRegistry sourceRegistry)

Methods:
- void onQuit(PlayerQuitEvent event)
- Iterable<Player> getNearbyPlayers(Location base, double dist)
- Iterable<Player> getNearbyPlayers(NPC npc)
- Iterable<Player> getNearbyPlayers(World base, [D min, [D max)
- void onJoin(PlayerJoinEvent event)
- LocationLookup$PerPlayerMetadata<*> getMetadata(String key)
- Iterable<Player> getNearbyVisiblePlayers(Entity entity, double range)
- Iterable<Player> getNearbyVisiblePlayers(Entity base, [D min, [D max)
- Iterable<Player> getNearbyVisiblePlayers(Entity base, Location location, double range)
- Iterable<NPC> getNearbyNPCs(Location base, double dist)
- Iterable<NPC> getNearbyNPCs(NPC npc)
- Iterable<NPC> getNearbyNPCs(World world, [D min, [D max)
- void run()
- LocationLookup$PerPlayerMetadata<TT> registerMetadata(String key, BiConsumer<LocationLookup$PerPlayerMetadata<TT>, PlayerJoinEvent> onJoin)
- void onWorldUnload(WorldUnloadEvent event)

### Class: net.citizensnpcs.api.LocationLookup$AsyncPhTreeLoader
Type: Abstract Class
Implements: java.lang.Runnable

Methods:
- void run()
- Iterable<TV> getNearby(T lookup, K dist, ;)
- Iterable<TV> getNearby(T lookup, K min, ; max)

### Class: net.citizensnpcs.api.LocationLookup$PerPlayerMetadata
Type: Class

Constructors:
- LocationLookup$PerPlayerMetadata(BiConsumer<LocationLookup$PerPlayerMetadata<TT>, PlayerJoinEvent> onJoin)

Methods:
- V set(UUID key, String value, T marker)
- TT getMarker(UUID key, String value)
- void removeAllValues(String value)
- boolean has(UUID key, String value)
- boolean remove(UUID key, String value)

### Class: net.citizensnpcs.api.LocationLookup$TreeFactory$Node
Type: Class

Constructors:
- LocationLookup$TreeFactory$Node([D loc, T t)

No public methods found

## Package: net.citizensnpcs.api.ai

### Class: net.citizensnpcs.api.ai.AttackStrategy
Type: Interface

Methods:
- boolean handle(LivingEntity, LivingEntity)

### Class: net.citizensnpcs.api.ai.EntityTarget
Type: Interface

Methods:
- Entity getTarget()
- boolean isAggressive()

### Class: net.citizensnpcs.api.ai.Goal
Type: Interface

Methods:
- boolean shouldExecute(GoalSelector)
- void reset()
- void run(GoalSelector)

### Class: net.citizensnpcs.api.ai.GoalController
Type: Interface
Implements: java.lang.Runnable, java.lang.Iterable

Methods:
- void addGoal(Goal, int)
- boolean isPaused()
- void removeGoal(Goal)
- void removeBehavior(Behavior)
- void setPaused(boolean)
- void clear()
- void cancelCurrentExecution()
- boolean isExecutingGoal()
- void addPrioritisableGoal(PrioritisableGoal)
- void addBehavior(Behavior, int)

### Class: net.citizensnpcs.api.ai.GoalController$GoalEntry
Type: Interface
Implements: java.lang.Comparable

Methods:
- Behavior getBehavior()
- Goal getGoal()
- int getPriority()

### Class: net.citizensnpcs.api.ai.GoalSelector
Type: Interface

Methods:
- void selectAdditional(Goal[])
- void select(Goal)
- void finishAndRemove()
- void finish()

### Class: net.citizensnpcs.api.ai.Navigator
Type: Interface

Methods:
- TargetType getTargetType()
- boolean isPaused()
- NavigatorParameters getLocalParameters()
- NPC getNPC()
- void cancelNavigation()
- void cancelNavigation(CancelReason)
- void setPaused(boolean)
- boolean isNavigating()
- boolean canNavigateTo(Location)
- boolean canNavigateTo(Location, NavigatorParameters)
- EntityTarget getEntityTarget()
- void setStraightLineTarget(Entity, boolean)
- void setStraightLineTarget(Location)
- void setTarget(Entity, boolean)
- V setTarget(Function<NavigatorParameters, PathStrategy>)
- V setTarget(Iterable<Vector>)
- void setTarget(Location)
- Location getTargetAsLocation()
- NavigatorParameters getDefaultParameters()
- PathStrategy getPathStrategy()

### Class: net.citizensnpcs.api.ai.PathStrategy
Type: Interface

Methods:
- TargetType getTargetType()
- CancelReason getCancelReason()
- void clearCancelReason()
- void stop()
- Location getCurrentDestination()
- Iterable<Vector> getPath()
- boolean update()
- Location getTargetAsLocation()

### Class: net.citizensnpcs.api.ai.PrioritisableGoal
Type: Interface
Implements: net.citizensnpcs.api.ai.Goal

Methods:
- int getPriority()

### Class: net.citizensnpcs.api.ai.StuckAction
Type: Interface

Methods:
- boolean run(NPC, Navigator)

### Class: net.citizensnpcs.api.ai.AbstractPathStrategy
Type: Abstract Class
Implements: net.citizensnpcs.api.ai.PathStrategy

Methods:
- TargetType getTargetType()
- CancelReason getCancelReason()
- void clearCancelReason()

### Class: net.citizensnpcs.api.ai.NavigatorParameters
Type: Class
Implements: java.lang.Cloneable

Methods:
- double attackRange()
- NavigatorParameters attackRange(double range)
- NavigatorParameters addSingleUseCallback(NavigatorCallback callback)
- float straightLineTargetingDistance()
- NavigatorParameters straightLineTargetingDistance(float distance)
- int fallDistance()
- NavigatorParameters fallDistance(int distance)
- int stationaryTicks()
- NavigatorParameters stationaryTicks(int ticks)
- PathfinderType pathfinderType()
- NavigatorParameters pathfinderType(PathfinderType type)
- NavigatorParameters examiner(BlockExaminer examiner)
- float range()
- NavigatorParameters range(float range)
- Iterable<NavigatorCallback> callbacks()
- void run()
- boolean useNewPathfinder()
- NavigatorParameters useNewPathfinder(boolean use)
- float speed()
- NavigatorParameters speed(float speed)
- float speedModifier()
- NavigatorParameters speedModifier(float percent)
- float modifiedSpeed(float toModify)
- double destinationTeleportMargin()
- NavigatorParameters destinationTeleportMargin(double margin)
- StuckAction stuckAction()
- NavigatorParameters stuckAction(StuckAction action)
- NavigatorParameters removeRunCallback(Runnable runnable)
- double pathDistanceMargin()
- NavigatorParameters pathDistanceMargin(double distance)
- AttackStrategy defaultAttackStrategy()
- NavigatorParameters defaultAttackStrategy(AttackStrategy defaultStrategy)
- NavigatorParameters clearExaminers()
- AttackStrategy attackStrategy()
- void attackStrategy(AttackStrategy strategy)
- boolean debug()
- NavigatorParameters debug(boolean debug)
- NavigatorParameters addRunCallback(Runnable callback)
- Z hasExaminer(Class<BlockExaminer> clazz)
- BlockExaminer[] examiners()
- double distanceMargin()
- NavigatorParameters distanceMargin(double newMargin)
- float baseSpeed()
- NavigatorParameters baseSpeed(float speed)
- boolean avoidWater()
- NavigatorParameters avoidWater(boolean avoidWater)
- int attackDelayTicks()
- NavigatorParameters attackDelayTicks(int ticks)
- Function<Entity, Location> entityTargetLocationMapper()
- NavigatorParameters entityTargetLocationMapper(Function<Entity, Location> mapper)
- NavigatorParameters clone()
- Object clone() throws CloneNotSupportedException
- Function<Navigator, Location> lookAtFunction()
- NavigatorParameters lookAtFunction(Function<Navigator, Location> lookAt)
- int updatePathRate()
- NavigatorParameters updatePathRate(int rate)

### Class: net.citizensnpcs.api.ai.PathfinderType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CITIZENS
- CITIZENS_ASYNC
- MINECRAFT
- PLUGIN

Methods:
- **static** PathfinderType valueOf(String name)
- **static** PathfinderType[] values()
- boolean isCitizens()

### Class: net.citizensnpcs.api.ai.SimpleGoalController
Type: Class
Implements: net.citizensnpcs.api.ai.GoalController

Methods:
- void addGoal(Goal goal, int priority)
- boolean isPaused()
- void removeGoal(Goal goal)
- Iterator<GoalController$GoalEntry> iterator()
- void removeBehavior(Behavior behavior)
- void setPaused(boolean paused)
- void clear()
- void cancelCurrentExecution()
- void run()
- boolean isExecutingGoal()
- void addPrioritisableGoal(PrioritisableGoal goal)
- void addBehavior(Behavior behavior, int priority)

### Class: net.citizensnpcs.api.ai.SimpleGoalController$SimpleGoalSelector
Type: Class
Implements: net.citizensnpcs.api.ai.GoalSelector

Constructors:
- SimpleGoalController$SimpleGoalSelector(SimpleGoalController this$0)

Methods:
- void selectAdditional(Goal[] goals)
- void select(Goal goal)
- void finishAndRemove()
- void finish()

### Class: net.citizensnpcs.api.ai.SimpleGoalEntry
Type: Class
Implements: net.citizensnpcs.api.ai.GoalController$GoalEntry

Constructors:
- SimpleGoalEntry(Goal goal, int priority)
- SimpleGoalEntry(Goal goal, Supplier<Integer> priority)

Methods:
- Behavior getBehavior()
- int hashCode()
- Goal getGoal()
- boolean equals(Object obj)
- int getPriority()
- int compareTo(GoalController$GoalEntry o)
- int compareTo(Object)

### Class: net.citizensnpcs.api.ai.TargetType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ENTITY
- LOCATION
- NONE

Methods:
- **static** TargetType valueOf(String name)
- **static** TargetType[] values()

### Class: net.citizensnpcs.api.ai.TeleportStuckAction
Type: Class
Implements: net.citizensnpcs.api.ai.StuckAction

Methods:
- String toString()
- boolean run(NPC npc, Navigator navigator)

## Package: net.citizensnpcs.api.ai.event

### Class: net.citizensnpcs.api.ai.event.NavigatorCallback
Type: Interface

Methods:
- void onCompletion(CancelReason)

### Class: net.citizensnpcs.api.ai.event.CancelReason
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NPC_DESPAWNED
- PLUGIN
- REPLACE
- STUCK
- TARGET_DIED
- TARGET_MOVED_WORLD

Methods:
- **static** CancelReason valueOf(String name)
- **static** CancelReason[] values()

### Class: net.citizensnpcs.api.ai.event.NavigationBeginEvent
Type: Class
Extends: net.citizensnpcs.api.ai.event.NavigationEvent

Constructors:
- NavigationBeginEvent(Navigator navigator)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.ai.event.NavigationCancelEvent
Type: Class
Extends: net.citizensnpcs.api.ai.event.NavigationCompleteEvent

Constructors:
- NavigationCancelEvent(Navigator navigator, CancelReason reason)

Methods:
- CancelReason getCancelReason()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.ai.event.NavigationCompleteEvent
Type: Class
Extends: net.citizensnpcs.api.ai.event.NavigationEvent

Constructors:
- NavigationCompleteEvent(Navigator navigator)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.ai.event.NavigationEvent
Type: Abstract Class
Extends: org.bukkit.event.Event

Methods:
- NPC getNPC()
- Navigator getNavigator()

### Class: net.citizensnpcs.api.ai.event.NavigationReplaceEvent
Type: Class
Extends: net.citizensnpcs.api.ai.event.NavigationCancelEvent

Constructors:
- NavigationReplaceEvent(Navigator navigator)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.ai.event.NavigationStuckEvent
Type: Class
Extends: net.citizensnpcs.api.ai.event.NavigationEvent

Constructors:
- NavigationStuckEvent(Navigator navigator, StuckAction action)

Methods:
- void setAction(StuckAction action)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- StuckAction getAction()

## Package: net.citizensnpcs.api.ai.flocking

### Class: net.citizensnpcs.api.ai.flocking.FlockBehavior
Type: Interface

Methods:
- Vector getVector(NPC, Collection<NPC>)

### Class: net.citizensnpcs.api.ai.flocking.NPCFlock
Type: Interface

Methods:
- Collection<NPC> getNearby(NPC)

### Class: net.citizensnpcs.api.ai.flocking.AlignmentBehavior
Type: Class
Implements: net.citizensnpcs.api.ai.flocking.FlockBehavior

Constructors:
- AlignmentBehavior(double weight)

Methods:
- Vector getVector(NPC npc, Collection<NPC> nearby)

### Class: net.citizensnpcs.api.ai.flocking.CohesionBehavior
Type: Class
Implements: net.citizensnpcs.api.ai.flocking.FlockBehavior

Constructors:
- CohesionBehavior(double weight)

Methods:
- Vector getVector(NPC npc, Collection<NPC> nearby)

### Class: net.citizensnpcs.api.ai.flocking.Flocker
Type: Class
Implements: java.lang.Runnable

Constructors:
- Flocker(NPC npc, NPCFlock flock, FlockBehavior[] behaviors)

Methods:
- void setMaxForce(double maxForce)
- void run()

### Class: net.citizensnpcs.api.ai.flocking.GroupNPCFlock
Type: Class
Implements: net.citizensnpcs.api.ai.flocking.NPCFlock

Constructors:
- GroupNPCFlock(Iterable<NPC> npcs, double radius)

Methods:
- **static** GroupNPCFlock create(Iterable<NPC> npcs)
- List<NPC> getNPCs()
- **static** GroupNPCFlock createWithRadius(Iterable<NPC> npcs, double radius)
- Collection<NPC> getNearby(NPC npc)

### Class: net.citizensnpcs.api.ai.flocking.RadiusNPCFlock
Type: Class
Implements: net.citizensnpcs.api.ai.flocking.NPCFlock

Constructors:
- RadiusNPCFlock(double radius)
- RadiusNPCFlock(double radius, int maxCacheTicks)

Methods:
- Collection<NPC> getNearby(NPC npc)

### Class: net.citizensnpcs.api.ai.flocking.SeparationBehavior
Type: Class
Implements: net.citizensnpcs.api.ai.flocking.FlockBehavior

Constructors:
- SeparationBehavior(double weight)
- SeparationBehavior(double weight, double separation)

Methods:
- Vector getVector(NPC npc, Collection<NPC> nearby)

## Package: net.citizensnpcs.api.ai.goals

### Class: net.citizensnpcs.api.ai.goals.FollowPathGoal
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Constructors:
- FollowPathGoal(NPC npc, List<MoveToGoal> path)

Methods:
- boolean shouldExecute()
- **static** FollowPathGoal create(NPC npc, List<MoveToGoal> path)
- void reset()
- BehaviorStatus run()
- **static** FollowPathGoal createFromLocations(NPC npc, List<Location> path)

### Class: net.citizensnpcs.api.ai.goals.MoveToGoal
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Constructors:
- MoveToGoal(NPC npc, Location target)

Methods:
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.goals.TargetNearbyEntityGoal
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- **static** TargetNearbyEntityGoal$Builder builder(NPC npc)
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.goals.TargetNearbyEntityGoal$Builder
Type: Class

Constructors:
- TargetNearbyEntityGoal$Builder(NPC npc)

Methods:
- TargetNearbyEntityGoal$Builder targetFilter(Function<Entity, Boolean> filter)
- TargetNearbyEntityGoal build()
- TargetNearbyEntityGoal$Builder aggressive(boolean aggressive)
- TargetNearbyEntityGoal$Builder radius(double radius)
- TargetNearbyEntityGoal$Builder targets(Set<EntityType> targetTypes)

### Class: net.citizensnpcs.api.ai.goals.WanderGoal
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter
Implements: org.bukkit.event.Listener

Methods:
- void setXYRange(int xrange, int yrange)
- boolean shouldExecute()
- **static** WanderGoal$Builder builder(NPC npc)
- void reset()
- BehaviorStatus run()
- void unpause()
- void setDelay(int delayTicks)
- void setPathfind(boolean pathfind)
- void pause()

### Class: net.citizensnpcs.api.ai.goals.WanderGoal$Builder
Type: Class

Methods:
- WanderGoal$Builder filter(Function<Block, Boolean> filter)
- WanderGoal$Builder worldguardRegion(Supplier<Object> worldguardRegion)
- WanderGoal$Builder delay(int delay)
- WanderGoal$Builder pathfind(boolean pathfind)
- WanderGoal build()
- WanderGoal$Builder tree(Supplier<PhTreeSolid<Boolean>> supplier)
- WanderGoal$Builder destinationPicker(Function<NPC, Location> picker)
- WanderGoal$Builder yrange(int yrange)
- WanderGoal$Builder regionCentres(Supplier<Iterable<Location>> supplier)
- WanderGoal$Builder xrange(int xrange)

## Package: net.citizensnpcs.api.ai.speech

### Class: net.citizensnpcs.api.ai.speech.SpeechController
Type: Interface

Methods:
- void speak(SpeechContext)

### Class: net.citizensnpcs.api.ai.speech.Talkable
Type: Interface
Implements: java.lang.Comparable

Methods:
- String getName()
- void talkTo(SpeechContext, String)
- void talkNear(SpeechContext, String)
- Entity getEntity()

### Class: net.citizensnpcs.api.ai.speech.SpeechContext
Type: Class
Implements: java.lang.Iterable

Constructors:
- SpeechContext(NPC talker, String message)
- SpeechContext(NPC talker, String message, Entity recipient)
- SpeechContext(String message)
- SpeechContext(String message, Entity recipient)

Methods:
- boolean hasRecipients()
- SpeechContext addRecipient(Entity entity)
- Iterator<Talkable> iterator()
- void setTalker(Entity entity)
- int size()
- SpeechContext addRecipients(List<Talkable> talkables)
- String getMessage()
- void setMessage(String message)
- Talkable getTalker()

### Class: net.citizensnpcs.api.ai.speech.TalkableEntity
Type: Class
Implements: net.citizensnpcs.api.ai.speech.Talkable

Constructors:
- TalkableEntity(Entity entity)
- TalkableEntity(NPC entity)

Methods:
- String getName()
- int compareTo(Object o)
- void talkTo(SpeechContext context, String text)
- void talkNear(SpeechContext context, String text)
- Entity getEntity()

## Package: net.citizensnpcs.api.ai.speech.event

### Class: net.citizensnpcs.api.ai.speech.event.NPCSpeechEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCSpeechEvent(SpeechContext cancelled)

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- SpeechContext getContext()

### Class: net.citizensnpcs.api.ai.speech.event.SpeechBystanderEvent
Type: Class
Extends: net.citizensnpcs.api.ai.speech.event.SpeechEvent

Constructors:
- SpeechBystanderEvent(Talkable target, SpeechContext context, String message)

No public methods found

### Class: net.citizensnpcs.api.ai.speech.event.SpeechEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- SpeechEvent(Talkable target, SpeechContext context, String message)

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getMessage()
- void setMessage(String formattedMessage)
- SpeechContext getContext()

### Class: net.citizensnpcs.api.ai.speech.event.SpeechTargetedEvent
Type: Class
Extends: net.citizensnpcs.api.ai.speech.event.SpeechEvent

Constructors:
- SpeechTargetedEvent(Talkable target, SpeechContext context, String message)

No public methods found

## Package: net.citizensnpcs.api.ai.tree

### Class: net.citizensnpcs.api.ai.tree.Behavior
Type: Interface

Methods:
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.BehaviorRegistry$BehaviorFactory
Type: Interface

Methods:
- Behavior create(DataKey, BehaviorRegistry$BehaviorContext)

### Class: net.citizensnpcs.api.ai.tree.BehaviorSignals$SignalListener
Type: Interface

Methods:
- void signal()

### Class: net.citizensnpcs.api.ai.tree.InstantBehavior
Type: Interface
Implements: net.citizensnpcs.api.ai.tree.Behavior

Methods:
- boolean shouldExecute()
- void reset()

### Class: net.citizensnpcs.api.ai.tree.ParallelBehavior
Type: Interface

No public methods found

### Class: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter
Type: Abstract Class
Implements: net.citizensnpcs.api.ai.Goal, net.citizensnpcs.api.ai.tree.Behavior

Methods:
- boolean shouldExecute(GoalSelector selector)
- **static** Goal create(Behavior behavior)
- void run(GoalSelector selector)

### Class: net.citizensnpcs.api.ai.tree.BehaviorRegistry
Type: Class

Constructors:
- BehaviorRegistry(ExpressionRegistry expressions)
- BehaviorRegistry(ExpressionRegistry expressions, BehaviorSignals signals)

Methods:
- ExpressionRegistry getExpressionRegistry()
- Behavior createBehavior(String name, DataKey params, BehaviorRegistry$BehaviorContext context)
- BehaviorSignals getSignalManager()
- void registerBehavior(String name, BehaviorRegistry$BehaviorFactory factory)
- boolean hasBehavior(String name)

### Class: net.citizensnpcs.api.ai.tree.BehaviorRegistry$BehaviorContext
Type: Class

Constructors:
- BehaviorRegistry$BehaviorContext(NPC npc, ExpressionScope scope, ExpressionRegistry expressionRegistry, Memory memory)

Methods:
- NPC getNPC()
- Map<String, String> parseArgs(int positionalCount, DataKey params)
- ExpressionRegistry getExpressionRegistry()
- void setArgs(String[] args)
- String getArgOrParam(int index, String name, DataKey params, String defaultValue)
- String getFromParsedArgs(Map<String, String> parsedArgs, String keys)
- ExpressionScope getScope()
- Memory getMemory()
- String[] getArgs()

### Class: net.citizensnpcs.api.ai.tree.BehaviorSignals
Type: Class

Methods:
- void unlisten(NPC npc, String signal, BehaviorSignals$SignalListener listener)
- void emitToNPC(UUID npcId, String signal)
- void emit(NPC npc, String signal)
- void listen(NPC npc, String signal, BehaviorSignals$SignalListener listener)
- void clearListeners(NPC npc)
- void emitGlobal(String signal)

### Class: net.citizensnpcs.api.ai.tree.BehaviorStatus
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FAILURE
- RESET_AND_REMOVE
- RUNNING
- SUCCESS

Methods:
- **static** BehaviorStatus valueOf(String name)
- **static** BehaviorStatus[] values()

### Class: net.citizensnpcs.api.ai.tree.Callback
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- **static** Callback callback(Behavior wrapping, Consumer<BehaviorStatus> cb)
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.CoalescedBehavior
Type: Class
Implements: net.citizensnpcs.api.ai.tree.Behavior

Constructors:
- CoalescedBehavior(List<Behavior> behaviors)

Methods:
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.Composite
Type: Abstract Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Constructors:
- Composite(Behavior[] behaviors)
- Composite(Collection<Behavior> behaviors)

Methods:
- void removeBehavior(Behavior behavior)
- boolean shouldExecute()
- void reset()
- List<Behavior> getBehaviors()
- void addBehavior(Behavior behavior)

### Class: net.citizensnpcs.api.ai.tree.Decorator
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()
- **static** Decorator$Builder wrapping(Behavior toWrap)

### Class: net.citizensnpcs.api.ai.tree.Decorator$Builder
Type: Class

Methods:
- Decorator$Builder withShouldExecutePredicate(Predicate<Boolean> predicate)
- Decorator$Builder withResetCallback(Runnable callback)
- Decorator$Builder withPreRunCallback(Runnable callback)
- Decorator build()
- Decorator$Builder withStatusTransformer(Function<BehaviorStatus, BehaviorStatus> transformer)

### Class: net.citizensnpcs.api.ai.tree.ForwardingBehaviorGoalAdapter
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Constructors:
- ForwardingBehaviorGoalAdapter(Behavior behavior)

Methods:
- boolean shouldExecute()
- int hashCode()
- boolean equals(Object obj)
- void reset()
- Behavior getWrapped()
- String toString()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.IfElse
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Constructors:
- IfElse(Supplier<Boolean> condition, Behavior ifBehavior, Behavior elseBehavior)

Methods:
- boolean shouldExecute()
- **static** IfElse create(Supplier<Boolean> condition, Behavior ifBehavior, Behavior elseBehavior)
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.InverterDecorator
Type: Class
Implements: net.citizensnpcs.api.ai.tree.Behavior

Constructors:
- InverterDecorator(Behavior child)

Methods:
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.Loop
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Constructors:
- Loop(Behavior wrapping, Supplier<Boolean> condition)

Methods:
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()
- **static** Loop createWithCondition(Behavior wrapping, Supplier<Boolean> condition)

### Class: net.citizensnpcs.api.ai.tree.ParallelBehaviorWrapper
Type: Class
Implements: net.citizensnpcs.api.ai.tree.Behavior, net.citizensnpcs.api.ai.tree.ParallelBehavior

Constructors:
- ParallelBehaviorWrapper(Behavior wrapped)

Methods:
- boolean shouldExecute()
- Behavior getWrapped()
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.ParallelComposite
Type: Class
Extends: net.citizensnpcs.api.ai.tree.Composite

Constructors:
- ParallelComposite(Collection<Behavior> behaviors)

Methods:
- boolean shouldExecute()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.Precondition
Type: Abstract Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- **static** Precondition wrappingPrecondition(Behavior wrapping, Supplier<Boolean> condition)
- **static** Precondition runPrecondition(Supplier<Boolean> condition)

### Class: net.citizensnpcs.api.ai.tree.RetryDecorator
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- **static** RetryDecorator unlimited(Behavior wrapping)
- void reset()
- BehaviorStatus run()
- **static** RetryDecorator retry(Behavior wrapping, int n)

### Class: net.citizensnpcs.api.ai.tree.Selector
Type: Class
Extends: net.citizensnpcs.api.ai.tree.Composite

Methods:
- Behavior getNextBehavior()
- boolean retryChildren()
- void reset()
- String toString()
- BehaviorStatus run()
- Function<List<Behavior>, Behavior> getSelectionFunction()
- **static** Selector$Builder selecting(Behavior[] behaviors)
- **static** Selector$Builder selecting(Collection<Behavior> behaviors)

### Class: net.citizensnpcs.api.ai.tree.Selector$Builder
Type: Class

Methods:
- Selector build()
- Selector$Builder retryChildren()
- Selector$Builder retryChildren(boolean b)
- Selector$Builder selectionFunction(Function<List<Behavior>, Behavior> function)

### Class: net.citizensnpcs.api.ai.tree.Selectors
Type: Class

Methods:
- **static** Selector$Builder prioritySelector(Comparator<Behavior> comparator, Behavior behaviors)
- **static** Selector$Builder prioritySelector(Comparator<Behavior> comparator, Collection<Behavior> behaviors)
- **static** Function<List<Behavior>, Behavior> prioritySelectionFunction()

### Class: net.citizensnpcs.api.ai.tree.Selectors$PrioritySelection
Type: Class
Implements: java.util.function.Function

Methods:
- Behavior apply(List<Behavior> input)
- Object apply(Object)

### Class: net.citizensnpcs.api.ai.tree.Sequence
Type: Class
Extends: net.citizensnpcs.api.ai.tree.Composite

Methods:
- **static** Sequence createSequence(Behavior[] behaviors)
- **static** Sequence createSequence(Collection<Behavior> behaviors)
- **static** Sequence createRetryingSequence(Behavior[] behaviors)
- **static** Sequence createRetryingSequence(Collection<Behavior> behaviors)
- boolean retryChildren()
- void reset()
- String toString()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.StatusMapper
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- **static** StatusMapper mapping(Behavior wrapping, Supplier<BehaviorStatus> to)
- **static** Behavior singleUse(Behavior base)
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.TimeoutDecorator
Type: Class
Implements: net.citizensnpcs.api.ai.tree.Behavior

Constructors:
- TimeoutDecorator(Behavior child, int maxTicks)

Methods:
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.TimerDecorator
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- **static** TimerDecorator tickLimiter(Behavior wrapping, int tickLimit)
- void reset()
- BehaviorStatus run()

## Package: net.citizensnpcs.api.astar

### Class: net.citizensnpcs.api.astar.AStarGoal
Type: Interface

Methods:
- F g(T, T)
- F h(T)
- F getInitialCost(T)
- Z isFinished(T)

### Class: net.citizensnpcs.api.astar.AStarStorage
Type: Interface

Methods:
- AStarNode getBestNode()
- boolean shouldExamine(AStarNode)
- void close(AStarNode)
- AStarNode removeBestNode()
- void open(AStarNode)

### Class: net.citizensnpcs.api.astar.Agent
Type: Interface

No public methods found

### Class: net.citizensnpcs.api.astar.Plan
Type: Interface

Methods:
- void update(Agent)
- boolean isComplete()

### Class: net.citizensnpcs.api.astar.AStarMachine
Type: Class

Methods:
- **static** AStarMachine<TN, TP> createWithDefaultStorage()
- AStarMachine$AStarState<TN> getStateFor(AStarGoal<TN> goal, T start)
- TP runFully(AStarGoal<TN> goal, T start)
- TP runFully(AStarGoal<TN> goal, T start, N iterations)
- TP run(AStarMachine$AStarState<TN> state)
- TP run(AStarMachine$AStarState<TN> state, int maxIterations)
- **static** AStarMachine<TN, TP> createWithStorage(Supplier<AStarStorage> storageSupplier)
- V setStorageSupplier(Supplier<AStarStorage> newSupplier)

### Class: net.citizensnpcs.api.astar.AStarMachine$AStarState
Type: Class

Methods:
- boolean isEmpty()
- TT getBestNode()

### Class: net.citizensnpcs.api.astar.AStarNode
Type: Abstract Class
Implements: java.lang.Comparable

Methods:
- Iterable<AStarNode> getNeighbours()
- int hashCode()
- boolean equals(Object)
- int compareTo(AStarNode other)
- int compareTo(Object)
- Plan buildPlan()

### Class: net.citizensnpcs.api.astar.SimpleAStarStorage
Type: Class
Implements: net.citizensnpcs.api.astar.AStarStorage

Methods:
- String toString()
- AStarNode getBestNode()
- boolean shouldExamine(AStarNode neighbour)
- void close(AStarNode node)
- AStarNode removeBestNode()
- void open(AStarNode node)

## Package: net.citizensnpcs.api.astar.pathfinder

### Class: net.citizensnpcs.api.astar.pathfinder.BlockExaminer
Type: Interface

Methods:
- BlockExaminer$PassableState isPassable(BlockSource, PathPoint)
- float getCost(BlockSource, PathPoint)
- BlockExaminer$StandableState canStandAt(BlockSource source, PathPoint point)

### Class: net.citizensnpcs.api.astar.pathfinder.BlockExaminer$NeighbourGeneratorBlockExaminer
Type: Interface
Implements: net.citizensnpcs.api.astar.pathfinder.BlockExaminer

Methods:
- List<PathPoint> getNeighbours(BlockSource, PathPoint)

### Class: net.citizensnpcs.api.astar.pathfinder.PathPoint
Type: Interface

Methods:
- void setVector(Vector)
- PathPoint getParentPoint()
- Vector getGoal()
- Vector getVector()
- List<Vector> getPathVectors()
- V setPathVectors(List<Vector>)
- PathPoint createAtOffset(Vector)
- void addCallback(PathPoint$PathCallback)

### Class: net.citizensnpcs.api.astar.pathfinder.PathPoint$PathCallback
Type: Interface

Methods:
- void onReached(NPC npc, Block point)
- V run(NPC, Block, List<Block>, int)

### Class: net.citizensnpcs.api.astar.pathfinder.AsyncChunkCache
Type: Class

Constructors:
- AsyncChunkCache(Plugin plugin, int workerPool, long ttlMillis)

Methods:
- void shutdown()
- CompletableFuture<Path> findPathAsync(AsyncChunkCache$PathRequest req)

### Class: net.citizensnpcs.api.astar.pathfinder.AsyncChunkCache$PathRequest
Type: Class

Constructors:
- AsyncChunkCache$PathRequest(Location from, Location to, int prefetchRadius, NavigatorParameters parameters)

No public methods found

### Class: net.citizensnpcs.api.astar.pathfinder.BlockExaminer$PassableState
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- IGNORE
- IMPASSABLE
- PASSABLE

Methods:
- **static** BlockExaminer$PassableState valueOf(String name)
- **static** BlockExaminer$PassableState[] values()

### Class: net.citizensnpcs.api.astar.pathfinder.BlockExaminer$StandableState
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- IGNORE
- NOT_STANDABLE
- STANDABLE

Methods:
- **static** BlockExaminer$StandableState valueOf(String name)
- **static** BlockExaminer$StandableState[] values()

### Class: net.citizensnpcs.api.astar.pathfinder.BlockSource
Type: Abstract Class

Methods:
- BoundingBox getCollisionBox(int, int, int)
- BoundingBox getCollisionBox(Vector pos)
- BlockData getBlockDataAt(int, int, int)
- BlockData getBlockDataAt(Vector position)
- boolean isYWithinBounds(int)
- Material getMaterialAt(int, int, int)
- Material getMaterialAt(Vector pos)

### Class: net.citizensnpcs.api.astar.pathfinder.CachingChunkBlockSource
Type: Abstract Class
Extends: net.citizensnpcs.api.astar.pathfinder.BlockSource

Methods:
- BoundingBox getCollisionBox(int x, int y, int z)
- BlockData getBlockDataAt(int x, int y, int z)
- boolean isYWithinBounds(int y)
- Material getMaterialAt(int x, int y, int z)

### Class: net.citizensnpcs.api.astar.pathfinder.ChunkBlockSource
Type: Class
Extends: net.citizensnpcs.api.astar.pathfinder.CachingChunkBlockSource

Constructors:
- ChunkBlockSource(Location location, float radius)
- ChunkBlockSource(World world, int x, int z, float radius)

No public methods found

### Class: net.citizensnpcs.api.astar.pathfinder.ChunkSnapshotBlockSource
Type: Class
Extends: net.citizensnpcs.api.astar.pathfinder.CachingChunkBlockSource

Constructors:
- ChunkSnapshotBlockSource(Location location, float radius)
- ChunkSnapshotBlockSource(World world, int x, int z, float radius)

No public methods found

### Class: net.citizensnpcs.api.astar.pathfinder.DoorExaminer
Type: Class
Implements: net.citizensnpcs.api.astar.pathfinder.BlockExaminer

Methods:
- BlockExaminer$PassableState isPassable(BlockSource source, PathPoint point)
- float getCost(BlockSource source, PathPoint point)

### Class: net.citizensnpcs.api.astar.pathfinder.FlyingBlockExaminer
Type: Class
Implements: net.citizensnpcs.api.astar.pathfinder.BlockExaminer$NeighbourGeneratorBlockExaminer

Methods:
- List<PathPoint> getNeighbours(BlockSource source, PathPoint point)
- BlockExaminer$PassableState isPassable(BlockSource source, PathPoint point)
- float getCost(BlockSource source, PathPoint point)
- BlockExaminer$StandableState canStandAt(BlockSource source, PathPoint point)

### Class: net.citizensnpcs.api.astar.pathfinder.MinecraftBlockExaminer
Type: Class
Implements: net.citizensnpcs.api.astar.pathfinder.BlockExaminer

Methods:
- **static** boolean isLiquidOrWaterlogged(Block block)
- **static** boolean isLiquidOrWaterlogged(Material type, BlockData data)
- **static** Location findRandomValidLocation(Location base, int xrange, int yrange)
- **static** Location findRandomValidLocation(Location base, int xrange, int yrange, Function<Block, Boolean> filter)
- **static** Location findRandomValidLocation(Location base, int xrange, int yrange, Function<Block, Boolean> filter, Random random)
- **static** boolean canStandOn(Block block)
- **static** boolean canStandOn(Material mat)
- **static** boolean canStandOn(Material mat, BlockData data)
- BlockExaminer$PassableState isPassable(BlockSource source, PathPoint point)
- **static** boolean isLiquid(Material[] materials)
- **static** Location findValidLocationAbove(Location location, int radius)
- **static** boolean isGate(Material in)
- **static** Location findValidLocation(Location location, int radius)
- **static** Location findValidLocation(Location location, int xradius, int yradius)
- **static** Location findValidLocation(Location location, int xradius, int yradius, Function<Block, Boolean> filter)
- **static** boolean isDoor(Material in)
- **static** boolean canStandIn(Block[] blocks)
- **static** boolean canStandIn(Material[] mat)
- **static** boolean canStandIn(Material mat, BlockData data)
- float getCost(BlockSource source, PathPoint point)
- BlockExaminer$StandableState canStandAt(BlockSource source, PathPoint point)

### Class: net.citizensnpcs.api.astar.pathfinder.Path
Type: Class
Implements: net.citizensnpcs.api.astar.Plan

Constructors:
- Path(Collection<Vector> path)

Methods:
- Iterable<Vector> getPath()
- void update(Agent agent)
- String toString()
- void run(NPC npc)
- List<Block> getBlocks(World world)
- Vector getCurrentVector()
- boolean isFinalEntry()
- boolean isComplete()

### Class: net.citizensnpcs.api.astar.pathfinder.SwimmingExaminer
Type: Class
Implements: net.citizensnpcs.api.astar.pathfinder.BlockExaminer

Constructors:
- SwimmingExaminer(NPC npc)

Methods:
- void setCanSwimInLava(boolean canSwimInLava)
- BlockExaminer$PassableState isPassable(BlockSource source, PathPoint point)
- **static** boolean isWaterMob(Entity entity)
- boolean canSwimInLava()
- float getCost(BlockSource source, PathPoint point)
- BlockExaminer$StandableState canStandAt(BlockSource source, PathPoint point)

### Class: net.citizensnpcs.api.astar.pathfinder.VectorGoal
Type: Class
Implements: net.citizensnpcs.api.astar.AStarGoal

Constructors:
- VectorGoal(Location goal, float leeway)

Methods:
- Vector getGoalVector()
- float g(VectorNode from, VectorNode to)
- float g(AStarNode, AStarNode)
- float h(VectorNode from)
- float h(AStarNode)
- float getInitialCost(VectorNode node)
- float getInitialCost(AStarNode)
- boolean isFinished(VectorNode node)
- boolean isFinished(AStarNode)

### Class: net.citizensnpcs.api.astar.pathfinder.VectorNode
Type: Class
Extends: net.citizensnpcs.api.astar.AStarNode
Implements: net.citizensnpcs.api.astar.pathfinder.PathPoint

Constructors:
- VectorNode(VectorGoal goal, Location location, BlockSource source, NavigatorParameters params)
- VectorNode(VectorNode blockCost, Vector location, VectorNode$PathInfo info)
- VectorNode(VectorNode parent, VectorGoal goal, Vector location, BlockSource source, NavigatorParameters params)

Methods:
- void setVector(Vector vector)
- float distance(VectorNode to)
- Vector getVector()
- Plan buildPlan()
- void addCallback(PathPoint$PathCallback callback)
- Iterable<AStarNode> getNeighbours()
- List<PathPoint> getNeighbours(BlockSource source, PathPoint point)
- List<PathPoint> getNeighbours(BlockSource source, PathPoint point, boolean checkPassable)
- PathPoint getParentPoint()
- int hashCode()
- Vector getGoal()
- float heuristicDistance(Vector goal)
- boolean equals(Object obj)
- List<Vector> getPathVectors()
- V setPathVectors(List<Vector> vectors)
- VectorNode createAtOffset(Vector mod)
- PathPoint createAtOffset(Vector)

## Package: net.citizensnpcs.api.command

### Class: net.citizensnpcs.api.command.Arg
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class<Arg$CompletionsProvider> completionsProvider()
- Class<Arg$FlagValidator<*>> validator()
- String[] completions()
- int value()
- String defValue()

### Class: net.citizensnpcs.api.command.Arg$CompletionsProvider
Type: Interface

Methods:
- Collection<String> getCompletions(CommandContext, CommandSender, NPC)

### Class: net.citizensnpcs.api.command.Arg$FlagValidator
Type: Interface

Methods:
- TT validate(CommandContext, CommandSender, NPC, String) throws CommandException

### Class: net.citizensnpcs.api.command.Command
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] valueFlags()
- boolean requiresFlags()
- boolean parsePlaceholders()
- String help()
- int min()
- String[] aliases()
- int max()
- String usage()
- String flags()
- String permission()
- String[] modifiers()
- String desc()

### Class: net.citizensnpcs.api.command.CommandAnnotationProcessor
Type: Interface

Methods:
- Class<Annotation> getAnnotationClass()
- void process(CommandSender, CommandContext, Annotation, Object[]) throws CommandException

### Class: net.citizensnpcs.api.command.Flag
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class<Arg$CompletionsProvider> completionsProvider()
- Class<Arg$FlagValidator<*>> validator()
- String[] completions()
- String permission()
- String[] value()
- String defValue()

### Class: net.citizensnpcs.api.command.Requirements
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- EntityType[] types()
- Class<Trait> traits()
- boolean ownership()
- boolean livingEntity()
- EntityType[] excludedTypes()
- boolean selected()

### Class: net.citizensnpcs.api.command.Arg$CompletionsProvider$Identity
Type: Class
Implements: net.citizensnpcs.api.command.Arg$CompletionsProvider

Methods:
- Collection<String> getCompletions(CommandContext args, CommandSender sender, NPC npc)

### Class: net.citizensnpcs.api.command.Arg$CompletionsProvider$OptionalKeyedCompletions
Type: Class
Implements: net.citizensnpcs.api.command.Arg$CompletionsProvider

Constructors:
- Arg$CompletionsProvider$OptionalKeyedCompletions(String completions)

Methods:
- Collection<String> getCompletions(CommandContext args, CommandSender sender, NPC npc)

### Class: net.citizensnpcs.api.command.Arg$FlagValidator$Identity
Type: Class
Implements: net.citizensnpcs.api.command.Arg$FlagValidator

Methods:
- String validate(CommandContext args, CommandSender sender, NPC npc, String input) throws CommandException
- Object validate(CommandContext, CommandSender, NPC, String) throws CommandException

### Class: net.citizensnpcs.api.command.Arg$FloatArrayFlagValidator
Type: Class
Implements: net.citizensnpcs.api.command.Arg$FlagValidator

Methods:
- float[] validate(CommandContext args, CommandSender sender, NPC npc, String input) throws CommandException
- Object validate(CommandContext, CommandSender, NPC, String) throws CommandException

### Class: net.citizensnpcs.api.command.CommandContext
Type: Class

Constructors:
- CommandContext(boolean clearFlags, CommandSender sender, String[] rawArgs)
- CommandContext(CommandSender sender, String[] args)
- CommandContext(String[] args)

Methods:
- **static** Vector parseVector(String string)
- String getJoinedStrings(int initialIndex)
- String getJoinedStrings(int initialIndex, char delimiter)
- Location getSenderTargetBlockLocation() throws CommandException
- double getDouble(int index) throws NumberFormatException
- double getDouble(int index, double def) throws NumberFormatException
- int getInteger(int index) throws NumberFormatException
- int getInteger(int index, int def) throws NumberFormatException
- String[] getPaddedSlice(int index, int padding)
- boolean hasAnyValueFlag(String[] strings)
- **static** Vector3f parseVector3f(String string)
- String getRawCommand()
- **static** Quaternionf parseQuaternion(String string)
- int getFlagInteger(String ch) throws NumberFormatException
- int getFlagInteger(String ch, int def) throws NumberFormatException
- boolean hasValueFlag(String ch)
- String getFlag(String ch)
- String getFlag(String ch, String def)
- double getFlagDouble(String ch) throws NumberFormatException
- double getFlagDouble(String ch, double def) throws NumberFormatException
- EulerAngle parseEulerAngle(String input)
- boolean hasFlag(char ch)
- int argsLength()
- String getCommand()
- int length()
- **static** Location parseLocation(Location currentLocation, String flag) throws CommandException
- Map<String, String> getValueFlags()
- String getString(int index)
- String getString(int index, String def)
- boolean matches(String command)
- boolean hasAnyFlags()
- int parseTicks(String dur)
- int getTicks(int index) throws NumberFormatException
- Location getSenderLocation() throws CommandException
- int getFlagTicks(String ch) throws NumberFormatException
- int getFlagTicks(String ch, int def) throws NumberFormatException
- String[] getSlice(int index)
- Set<Character> getFlags()

### Class: net.citizensnpcs.api.command.CommandManager
Type: Class
Implements: org.bukkit.command.TabCompleter

Methods:
- void registerTabCompletion(JavaPlugin plugin)
- V setTranslationPrefixProvider(Function<Command, String> provider)
- void setDefaultDurationUnits(TimeUnit unit)
- CommandManager$CommandInfo getCommand(String[] commandParts)
- String getClosestCommandModifier(String command, String modifier)
- boolean hasCommand(Command cmd, String[] modifier)
- boolean hasCommand(String[] parts)
- List<String> onTabComplete(CommandSender sender, Command command, String alias, String args)
- void setInjector(Injector injector)
- void registerAnnotationProcessor(CommandAnnotationProcessor processor)
- void execute(Command command, String[] args, CommandSender sender, Object[] methodArgs) throws CommandException
- List<CommandManager$CommandInfo> getCommands(String topLevelCommand)
- V register(Class<*> clazz)
- boolean executeSafe(Command command, String[] args, CommandSender sender, Object[] methodArgs)

### Class: net.citizensnpcs.api.command.CommandManager$CommandInfo
Type: Class

Constructors:
- CommandManager$CommandInfo(CommandManager this$0, Command commandAnnotation, Method method)

Methods:
- Collection<String> valueFlags()
- Collection<String> getArgTabCompletions(CommandContext args, CommandSender sender, int index)
- V addFlagAnnotation(int idx, Class<*>, Flag flag)
- Command getCommandAnnotation()
- int hashCode()
- boolean equals(Object obj)
- V addArgAnnotation(int idx, Class<*>, Arg arg)
- Collection<String> getFlagTabCompletions(CommandContext args, CommandSender sender, String flag)

### Class: net.citizensnpcs.api.command.CommandMessages
Type: Class

No public methods found

### Class: net.citizensnpcs.api.command.Injector
Type: Class

Constructors:
- Injector(Object[] args)

Methods:
- Object getInstance(Class<*> clazz)

### Class: net.citizensnpcs.api.command.RequirementsProcessor
Type: Class
Implements: net.citizensnpcs.api.command.CommandAnnotationProcessor

Methods:
- Class<Annotation> getAnnotationClass()
- void process(CommandSender sender, CommandContext context, Annotation instance, Object[] methodArgs) throws CommandException

## Package: net.citizensnpcs.api.command.exception

### Class: net.citizensnpcs.api.command.exception.CommandException
Type: Class
Extends: java.lang.Exception

Constructors:
- CommandException(String message)
- CommandException(String key, Object[] replacements)
- CommandException(Throwable t)

Methods:
- Throwable fillInStackTrace()

### Class: net.citizensnpcs.api.command.exception.CommandUsageException
Type: Class
Extends: net.citizensnpcs.api.command.exception.CommandException

Constructors:
- CommandUsageException(String message, String usage)

Methods:
- void setUsage(String usage)
- String getUsage()

### Class: net.citizensnpcs.api.command.exception.NoPermissionsException
Type: Class
Extends: net.citizensnpcs.api.command.exception.CommandException

No public methods found

### Class: net.citizensnpcs.api.command.exception.RequirementMissingException
Type: Class
Extends: net.citizensnpcs.api.command.exception.CommandException

Constructors:
- RequirementMissingException(String message)

No public methods found

### Class: net.citizensnpcs.api.command.exception.ServerCommandException
Type: Class
Extends: net.citizensnpcs.api.command.exception.CommandException

No public methods found

### Class: net.citizensnpcs.api.command.exception.UnhandledCommandException
Type: Class
Extends: net.citizensnpcs.api.command.exception.CommandException

No public methods found

### Class: net.citizensnpcs.api.command.exception.WrappedCommandException
Type: Class
Extends: net.citizensnpcs.api.command.exception.CommandException

Constructors:
- WrappedCommandException(Throwable t)

No public methods found

## Package: net.citizensnpcs.api.event

### Class: net.citizensnpcs.api.event.CitizensDeserialiseMetaEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- CitizensDeserialiseMetaEvent(DataKey key, ItemStack itemstack)

Methods:
- DataKey getKey()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ItemStack getItemStack()

### Class: net.citizensnpcs.api.event.CitizensEnableEvent
Type: Class
Extends: net.citizensnpcs.api.event.CitizensEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.CitizensEvent
Type: Abstract Class
Extends: org.bukkit.event.Event

No public methods found

### Class: net.citizensnpcs.api.event.CitizensGetSelectedNPCEvent
Type: Class
Extends: net.citizensnpcs.api.event.CitizensEvent

Constructors:
- CitizensGetSelectedNPCEvent(CommandSender sender)

Methods:
- NPC getSelected()
- void setSelected(NPC npc)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- CommandSender getSender()

### Class: net.citizensnpcs.api.event.CitizensPreReloadEvent
Type: Class
Extends: net.citizensnpcs.api.event.CitizensEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.CitizensReloadEvent
Type: Class
Extends: net.citizensnpcs.api.event.CitizensEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.CitizensSerialiseMetaEvent
Type: Class
Extends: net.citizensnpcs.api.event.CitizensEvent

Constructors:
- CitizensSerialiseMetaEvent(DataKey key, ItemMeta meta)

Methods:
- DataKey getKey()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ItemMeta getMeta()

### Class: net.citizensnpcs.api.event.CommandSenderCloneNPCEvent
Type: Class
Extends: net.citizensnpcs.api.event.CommandSenderCreateNPCEvent

Constructors:
- CommandSenderCloneNPCEvent(CommandSender sender, NPC npc, NPC copy)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- NPC getOriginal()

### Class: net.citizensnpcs.api.event.CommandSenderCreateNPCEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCCreateEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- CommandSenderCreateNPCEvent(CommandSender creator, NPC npc)

Methods:
- String getCancelReason()
- boolean isCancelled()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setCancelReason(String reason)
- CommandSender getCreator()

### Class: net.citizensnpcs.api.event.DespawnReason
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CHUNK_UNLOAD
- DEATH
- PENDING_RESPAWN
- PLUGIN
- RELOAD
- REMOVAL
- WORLD_UNLOAD

Methods:
- **static** DespawnReason valueOf(String name)
- **static** DespawnReason[] values()

### Class: net.citizensnpcs.api.event.EntityTargetNPCEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- EntityTargetNPCEvent(EntityTargetEvent event, NPC npc)

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancel)
- EntityTargetEvent$TargetReason getReason()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getEntity()

### Class: net.citizensnpcs.api.event.NPCAddTraitEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCTraitEvent

Constructors:
- NPCAddTraitEvent(NPC npc, Trait trait)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCClickEvent
Type: Abstract Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Player getClicker()

### Class: net.citizensnpcs.api.event.NPCCloneEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCCloneEvent(NPC npc, NPC clone)

Methods:
- NPC getClone()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCCollisionEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCCollisionEvent(NPC npc, Entity entity)

Methods:
- Entity getCollidedWith()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCCombustByBlockEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCCombustEvent

Constructors:
- NPCCombustByBlockEvent(EntityCombustByBlockEvent event, NPC npc)

Methods:
- Block getCombuster()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCCombustByEntityEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCCombustEvent

Constructors:
- NPCCombustByEntityEvent(EntityCombustByEntityEvent event, NPC npc)

Methods:
- Entity getCombuster()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCCombustEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCCombustEvent(EntityCombustEvent event, NPC npc)

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- EntityCombustEvent getHandle()

### Class: net.citizensnpcs.api.event.NPCCommandDispatchEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCCommandDispatchEvent(NPC npc, Player player)

Methods:
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCCreateEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCCreateEvent(NPC npc)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCDamageByBlockEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCDamageEvent

Constructors:
- NPCDamageByBlockEvent(NPC npc, EntityDamageByBlockEvent damager)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Block getDamager()

### Class: net.citizensnpcs.api.event.NPCDamageByEntityEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCDamageEvent

Constructors:
- NPCDamageByEntityEvent(NPC npc, EntityDamageByEntityEvent damager)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getDamager()

### Class: net.citizensnpcs.api.event.NPCDamageEntityEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCDamageEvent

Constructors:
- NPCDamageEntityEvent(NPC npc, EntityDamageByEntityEvent damaged)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getDamaged()

### Class: net.citizensnpcs.api.event.NPCDamageEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCDamageEvent(NPC npc, EntityDamageEvent event)

Methods:
- EntityDamageEvent getEvent()
- double getDamage()
- boolean isCancelled()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setDamage(double damage)
- void setDamage(int damage)
- EntityDamageEvent$DamageCause getCause()

### Class: net.citizensnpcs.api.event.NPCDeathEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCDeathEvent(NPC npc, EntityDeathEvent event)

Methods:
- EntityDeathEvent getEvent()
- int getDroppedExp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setDroppedExp(int exp)
- List<ItemStack> getDrops()

### Class: net.citizensnpcs.api.event.NPCDespawnEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCDespawnEvent(NPC npc, DespawnReason reason)

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancel)
- DespawnReason getReason()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCEvent
Type: Abstract Class
Extends: net.citizensnpcs.api.event.CitizensEvent

Methods:
- NPC getNPC()

### Class: net.citizensnpcs.api.event.NPCKnockbackEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCKnockbackEvent(NPC npc, double strength, Vector vector, Entity entity)

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getStrength()
- Entity getKnockingBackEntity()
- Vector getKnockbackVector()

### Class: net.citizensnpcs.api.event.NPCLeftClickEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCClickEvent

Constructors:
- NPCLeftClickEvent(NPC npc, Player clicker)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCLinkToPlayerEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCLinkToPlayerEvent(NPC npc, Player player, boolean async)

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCLookCloseChangeTargetEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCLookCloseChangeTargetEvent(NPC npc, Player old, Player next)

Methods:
- Player getPreviousTarget()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setNewTarget(Player target)
- Player getNewTarget()

### Class: net.citizensnpcs.api.event.NPCMoveEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCMoveEvent(NPC npc, Location from, Location to)

Methods:
- boolean isCancelled()
- NPC getNPC()
- void setFrom(Location from)
- void setCancelled(boolean b)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setTo(Location to)
- String toString()
- Location getTo()
- Location getFrom()

### Class: net.citizensnpcs.api.event.NPCOpenDoorEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCOpenDoorEvent(NPC npc, Block block)

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Block getDoor()

### Class: net.citizensnpcs.api.event.NPCOpenGateEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCOpenGateEvent(NPC npc, Block block)

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Block getGate()

### Class: net.citizensnpcs.api.event.NPCPistonPushEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCPistonPushEvent(NPC npc)

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCPushEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCPushEvent(NPC npc, Vector collisionVector, Entity pushedBy)

Methods:
- boolean isCancelled()
- Vector getCollisionVector()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getPushedBy()

### Class: net.citizensnpcs.api.event.NPCRemoveByCommandSenderEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCRemoveEvent

Constructors:
- NPCRemoveByCommandSenderEvent(NPC npc, CommandSender source)

Methods:
- CommandSender getSource()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCRemoveEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCRemoveEvent(NPC npc)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCRemoveTraitEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCTraitEvent

Constructors:
- NPCRemoveTraitEvent(NPC npc, Trait trait)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCRenameEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCRenameEvent(NPC npc, String oldName, String newName)

Methods:
- String getNewName()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setNewName(String newName)
- String getOldName()

### Class: net.citizensnpcs.api.event.NPCRightClickEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCClickEvent

Constructors:
- NPCRightClickEvent(NPC npc, Player click)

Methods:
- boolean isDelayedCancellation()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setDelayedCancellation(boolean toCancel)

### Class: net.citizensnpcs.api.event.NPCSeenByPlayerEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCSeenByPlayerEvent(NPC npc, Player player)

Methods:
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCSelectEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCSelectEvent(NPC npc, CommandSender sender)

Methods:
- CommandSender getSelector()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCSpawnEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCSpawnEvent(NPC cancelled, Location location, SpawnReason reason)

Methods:
- boolean isCancelled()
- Location getLocation()
- void setCancelled(boolean cancelled)
- SpawnReason getReason()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCTeleportEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCTeleportEvent(NPC npc, Location to)

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Location getTo()
- Location getFrom()

### Class: net.citizensnpcs.api.event.NPCTraitCommandAttachEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCTraitCommandAttachEvent(NPC npc, Class<Trait> traitClass, CommandSender sender)

Methods:
- CommandSender getCommandSender()
- Class<Trait> getTraitClass()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCTraitCommandDetachEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCTraitCommandDetachEvent(NPC npc, Class<Trait> traitClass, CommandSender sender)

Methods:
- CommandSender getCommandSender()
- Class<Trait> getTraitClass()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCTraitEvent
Type: Abstract Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- Trait getTrait()

### Class: net.citizensnpcs.api.event.NPCUnlinkFromPlayerEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- NPCUnlinkFromPlayerEvent(NPC npc, Player player)

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCVehicleDamageEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- NPCVehicleDamageEvent(NPC npc, VehicleDamageEvent event)

Methods:
- VehicleDamageEvent getEvent()
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getDamager()

### Class: net.citizensnpcs.api.event.PlayerCloneNPCEvent
Type: Class
Extends: net.citizensnpcs.api.event.PlayerCreateNPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- PlayerCloneNPCEvent(Player player, NPC npc, NPC copy)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- NPC getOriginal()
- Player getCreator()
- CommandSender getCreator()

### Class: net.citizensnpcs.api.event.PlayerCreateNPCEvent
Type: Class
Extends: net.citizensnpcs.api.event.CommandSenderCreateNPCEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- PlayerCreateNPCEvent(Player player, NPC npc)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Player getCreator()
- CommandSender getCreator()

### Class: net.citizensnpcs.api.event.SpawnReason
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CHUNK_LOAD
- COMMAND
- CREATE
- PLUGIN
- RESPAWN
- TIMED_RESPAWN

Methods:
- **static** SpawnReason valueOf(String name)
- **static** SpawnReason[] values()

## Package: net.citizensnpcs.api.exception

### Class: net.citizensnpcs.api.exception.NPCLoadException
Type: Class
Extends: java.lang.Exception

Constructors:
- NPCLoadException(String msg)

No public methods found

## Package: net.citizensnpcs.api.expr

### Class: net.citizensnpcs.api.expr.CompiledExpression
Type: Interface

Methods:
- double evaluateAsNumber(ExpressionScope scope)
- boolean evaluateAsBoolean(ExpressionScope scope)
- Object evaluate(ExpressionScope)
- String evaluateAsString(ExpressionScope scope)

### Class: net.citizensnpcs.api.expr.ExpressionEngine
Type: Interface

Methods:
- String getName()
- CompiledExpression compile(String) throws ExpressionEngine$ExpressionCompileException

### Class: net.citizensnpcs.api.expr.ExpressionEngine$ExpressionCompileException
Type: Class
Extends: java.lang.Exception

Constructors:
- ExpressionEngine$ExpressionCompileException(String message)
- ExpressionEngine$ExpressionCompileException(String message, Throwable cause)

No public methods found

### Class: net.citizensnpcs.api.expr.ExpressionRegistry
Type: Class

Methods:
- void setDefaultEngine(String language)
- String getDefaultEngineName()
- String applyDefaultExpressionMarkup(String expression)
- void registerEngine(ExpressionEngine engine)
- CompiledExpression compile(String expr) throws ExpressionEngine$ExpressionCompileException
- ExpressionEngine getEngine(String name)
- ExpressionRegistry$ExpressionValue parseValue(String expr)
- boolean isPossiblyExpression(String value)

### Class: net.citizensnpcs.api.expr.ExpressionRegistry$ExpressionValue
Type: Class

Methods:
- double evaluateAsNumber(ExpressionScope scope)
- boolean evaluateAsBoolean(ExpressionScope scope)
- boolean isExpression()
- Object evaluate(ExpressionScope scope)
- String evaluateAsString(ExpressionScope scope)

### Class: net.citizensnpcs.api.expr.ExpressionScope
Type: Class

Constructors:
- ExpressionScope(ExpressionScope parent)

Methods:
- Player getPlayer()
- void set(String name, Object value)
- NPC getNPC()
- ExpressionScope createChild()
- void setPlayer(Player player)
- Iterable<String> getVariableNames()
- void setMemory(Memory memory)
- void remove(String name)
- Memory getMemory()
- boolean isConstant(String name)
- void resetCache()
- V bind(String name, Supplier<*> supplier)
- Supplier<*> getSupplier(String name)
- Object get(String name)
- boolean has(String name)
- void setNPC(NPC npc)

### Class: net.citizensnpcs.api.expr.JSR223Engine
Type: Class
Implements: net.citizensnpcs.api.expr.ExpressionEngine

Constructors:
- JSR223Engine(ScriptEngine engine)

Methods:
- String getName()
- CompiledExpression compile(String expression) throws ExpressionEngine$ExpressionCompileException
- **static** JSR223Engine javascript()

### Class: net.citizensnpcs.api.expr.Memory
Type: Class

Constructors:
- Memory(MetadataStore store)

Methods:
- Object listGet(String key, int index)
- void set(String key, Object value)
- MetadataStore getStore()
- void clear()
- void loadFrom(DataKey key)
- int listSize(String key)
- String getString(String key)
- String getString(String key, String defaultValue)
- Iterable<String> getKeys()
- void remove(String key)
- double getNumber(String key)
- double getNumber(String key, double defaultValue)
- void saveTo(DataKey key)
- int size()
- void listClear(String key)
- boolean listRemove(String key, Object item)
- List<Object> getList(String key)
- Object get(String key)
- Object get(String key, Object defaultValue)
- boolean listContains(String key, Object item)
- boolean getBoolean(String key)
- boolean getBoolean(String key, boolean defaultValue)
- void listAdd(String key, Object item)
- boolean has(String key)
- void listSet(String key, int index, Object item)
- Object listRemoveAt(String key, int index)

## Package: net.citizensnpcs.api.gui

### Class: net.citizensnpcs.api.gui.ClickHandler
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- InventoryAction[] filter()
- int[] slot()

### Class: net.citizensnpcs.api.gui.ClickHandlers
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- ClickHandler[] value()

### Class: net.citizensnpcs.api.gui.ForwardingInventory
Type: Interface

Methods:
- Inventory getWrapped()

### Class: net.citizensnpcs.api.gui.InjectContext
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.citizensnpcs.api.gui.Menu
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- ClickType[] filter()
- InventoryType type()
- String title()
- int[] dimensions()

### Class: net.citizensnpcs.api.gui.MenuPattern
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- MenuSlot[] slots()
- int[] offset()
- MenuTransition[] transitions()
- String value()

### Class: net.citizensnpcs.api.gui.MenuPatterns
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- MenuPattern[] value()

### Class: net.citizensnpcs.api.gui.MenuSlot
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- char pat()
- int amount()
- String[] compatMaterial()
- Material material()
- String lore()
- int[] slot()
- String title()

### Class: net.citizensnpcs.api.gui.MenuSlots
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- MenuSlot[] value()

### Class: net.citizensnpcs.api.gui.MenuTransition
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- ClickType[] filter()
- char pat()
- int[] pos()
- Class<InventoryMenuPage> value()

### Class: net.citizensnpcs.api.gui.MenuTransitions
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- MenuTransition[] value()

### Class: net.citizensnpcs.api.gui.CitizensInventoryClickEvent
Type: Class
Extends: org.bukkit.event.inventory.InventoryClickEvent

Constructors:
- CitizensInventoryClickEvent(InventoryClickEvent event, int result)

Methods:
- ItemStack getResultItem()
- ItemStack getCursor()
- ItemStack getCurrentItem()
- boolean isCancelled()
- ItemStack getResultItemNonNull()
- void setResult(Event$Result result)
- void setCancelled(boolean cancel)
- void setCurrentItem(ItemStack item)
- Event$Result getResult()
- void setCurrentItemDescription(String description)
- void setCursor(ItemStack cursor)
- ItemStack getCursorNonNull()
- ItemStack getCurrentItemNonNull()

### Class: net.citizensnpcs.api.gui.InputMenus
Type: Class

Methods:
- **static** InputMenus$BooleanSlotHandler toggler(Consumer<Boolean> consumer, boolean initialValue)
- **static** InventoryMenuPage toggle(String title, Consumer<List<InputMenus$Choice<TT>>> callback, InputMenus$Choice<TT> choices)
- **static** InventoryMenuPage filteredStringSetter(String title, Supplier<String> initialValue, Function<String, Boolean> callback)
- **static** InventoryMenuPage filteredStringSetter(Supplier<String> initialValue, Function<String, Boolean> callback)
- **static** InventoryMenuPage picker(String title, Consumer<InputMenus$Choice<TT>> callback, InputMenus$Choice<TT> choices)
- **static** InputMenus$BooleanSlotHandler clickToggle(Function<Boolean, String> transformer, boolean initialValue)
- **static** InventoryMenuPage stringSetter(String title, Supplier<String> initialValue, Consumer<String> callback)
- **static** InventoryMenuPage stringSetter(Supplier<String> initialValue, Consumer<String> callback)
- **static** V runChatStringSetter(InventoryMenu menu, InventoryClickEvent event, String description, Consumer<String> callback)

### Class: net.citizensnpcs.api.gui.InputMenus$BooleanSlotHandler
Type: Class
Implements: java.util.function.Consumer

Constructors:
- InputMenus$BooleanSlotHandler(Function<Boolean, String> transformer)
- InputMenus$BooleanSlotHandler(Function<Boolean, String> transformer, boolean value)

Methods:
- void accept(CitizensInventoryClickEvent event)
- void accept(Object)

### Class: net.citizensnpcs.api.gui.InputMenus$Choice
Type: Class

Methods:
- TT getValue()
- ItemStack createDisplayItem()
- void setActive(boolean active)
- **static** InputMenus$Choice<TT> of(T value, T display, ; description, Material active)
- Material getDisplayMaterial()
- boolean isActive()
- String getDescription()

### Class: net.citizensnpcs.api.gui.InputMenus$Choice$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PICKER
- TOGGLE

Methods:
- **static** InputMenus$Choice$Type valueOf(String name)
- **static** InputMenus$Choice$Type[] values()

### Class: net.citizensnpcs.api.gui.InventoryMenu
Type: Class
Implements: org.bukkit.event.Listener, java.lang.Runnable

Constructors:
- InventoryMenu(InventoryMenu$InventoryMenuInfo info, InventoryMenuPage instance)

Methods:
- **static** InventoryMenu createWithContext(Class<InventoryMenuPage> clazz, Map<String, Object> context)
- void transitionBack()
- **static** InventoryMenu createSelfRegistered(Class<InventoryMenuPage> clazz)
- **static** InventoryMenu createSelfRegistered(InventoryMenuPage instance)
- **static** InventoryMenu create(Class<InventoryMenuPage> clazz)
- **static** InventoryMenu create(InventoryMenuPage instance)
- void run()
- void onInventoryDrag(InventoryDragEvent event)
- void present(HumanEntity player)
- void close()
- void close(HumanEntity entity)
- V transition(Class<InventoryMenuPage> clazz)
- V transition(Class<InventoryMenuPage> clazz, Map<String, Object> context)
- void transition(InventoryMenuPage instance)
- V transition(InventoryMenuPage instance, Map<String, Object> context)
- void onInventoryClose(InventoryCloseEvent event)
- void onInventoryClick(InventoryClickEvent event)

### Class: net.citizensnpcs.api.gui.InventoryMenuPage
Type: Abstract Class
Implements: java.lang.Runnable

Methods:
- void onClose(HumanEntity player)
- void onClick(InventoryMenuSlot slot, InventoryClickEvent event)
- void run()
- Inventory createInventory(String title)
- void initialise(MenuContext)

### Class: net.citizensnpcs.api.gui.InventoryMenuPattern
Type: Class

Constructors:
- InventoryMenuPattern(MenuPattern info, List<InventoryMenuSlot> slots, List<InventoryMenuTransition> transitions)

Methods:
- List<InventoryMenuTransition> getTransitions()
- List<InventoryMenuSlot> getSlots()
- String getPattern()

### Class: net.citizensnpcs.api.gui.InventoryMenuSlot
Type: Class

Methods:
- Collection<InventoryAction> getFilter()
- ItemStack getCurrentItem()
- V setClickHandler(Consumer<CitizensInventoryClickEvent> handler)
- V addClickHandler(Consumer<CitizensInventoryClickEvent> func)
- int hashCode()
- boolean equals(Object obj)
- void clear()
- void setItemStack(ItemStack stack)
- void setItemStack(ItemStack stack, String name)
- void setItemStack(ItemStack stack, String name, String description)
- void setDescription(String description)
- List<Consumer<CitizensInventoryClickEvent>> getClickHandlers()
- V setFilter(Collection<InventoryAction> filter)

### Class: net.citizensnpcs.api.gui.InventoryMenuTransition
Type: Class

Constructors:
- InventoryMenuTransition(InventoryMenuSlot slot, Class<InventoryMenuPage> transition)

Methods:
- InventoryMenuSlot getSlot()

### Class: net.citizensnpcs.api.gui.MenuContext
Type: Class

Constructors:
- MenuContext(InventoryMenu menu, InventoryMenuSlot[] slots, Inventory inventory, String title)
- MenuContext(InventoryMenu menu, InventoryMenuSlot slots, Inventory inventory, String title, Map<String, Object> data)

Methods:
- InventoryMenuSlot getSlot(int i)
- String getTitle()
- Map<String, Object> data()
- InventoryMenu getMenu()
- void setTitle(String title)
- Inventory getInventory()
- void clearSlots()

### Class: net.citizensnpcs.api.gui.PercentageSlotHandler
Type: Class
Implements: java.util.function.Consumer

Constructors:
- PercentageSlotHandler(Function<Integer, String> transformer)
- PercentageSlotHandler(Function<Integer, String> transformer, int percentage)

Methods:
- void accept(CitizensInventoryClickEvent event)
- void accept(Object)

## Package: net.citizensnpcs.api.hpastar

### Class: net.citizensnpcs.api.hpastar.AStarSolution
Type: Class

Constructors:
- AStarSolution(List<ReversableAStarNode> path, float cost)

Methods:
- Collection<Vector> convertToVectors()

### Class: net.citizensnpcs.api.hpastar.ClusterNode
Type: Class
Extends: net.citizensnpcs.api.hpastar.ReversableAStarNode

Constructors:
- ClusterNode(int x, int z)

Methods:
- int hashCode()
- boolean equals(Object obj)

### Class: net.citizensnpcs.api.hpastar.Direction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- EAST
- NORTH
- SOUTH
- WEST

Methods:
- **static** Direction valueOf(String name)
- **static** Direction[] values()

### Class: net.citizensnpcs.api.hpastar.HPACluster
Type: Class

Constructors:
- HPACluster(HPAGraph graph, int level, int clusterSize, int clusterX, int clusterY, int clusterZ)

Methods:
- V buildFrom(List<HPACluster> clusters)
- boolean hasWalkableNodes()
- boolean contains(HPACluster other)
- void connectIntra()
- void insert(HPAGraphNode node)
- String toString()
- void remove(HPAGraphNode[] nodes)
- void connect(HPACluster other, Direction direction)

### Class: net.citizensnpcs.api.hpastar.HPAEntrance
Type: Class

No public methods found

### Class: net.citizensnpcs.api.hpastar.HPAGraph
Type: Class

Constructors:
- HPAGraph(BlockSource blockSource, int cx, int cy, int cz)

Methods:
- boolean walkable(int x, int y, int z)
- Plan findPath(Location start, Location goal)
- void addClusters(int x, int z)
- V addClustersAtDepth(int depth, List<HPACluster> other)

### Class: net.citizensnpcs.api.hpastar.HPAGraphAStarNode
Type: Class
Extends: net.citizensnpcs.api.hpastar.ReversableAStarNode

Constructors:
- HPAGraphAStarNode(HPAGraphNode node, HPAGraphEdge edge)

Methods:
- int hashCode()
- boolean equals(Object obj)
- String toString()

### Class: net.citizensnpcs.api.hpastar.HPAGraphEdge
Type: Class

Constructors:
- HPAGraphEdge(HPAGraphNode from, HPAGraphNode to, HPAGraphEdge$EdgeType type, float weight)

No public methods found

### Class: net.citizensnpcs.api.hpastar.HPAGraphEdge$EdgeType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- INTER
- INTRA

Methods:
- **static** HPAGraphEdge$EdgeType valueOf(String name)
- **static** HPAGraphEdge$EdgeType[] values()

### Class: net.citizensnpcs.api.hpastar.HPAGraphNode
Type: Class

Constructors:
- HPAGraphNode(int x, int y, int z)

Methods:
- double distance(HPAGraphNode dest)
- int hashCode()
- boolean equals(Object obj)
- String toString()
- List<HPAGraphEdge> getEdges(int level)
- void connect(int level, HPAGraphNode to, HPAGraphEdge$EdgeType type, float weight)

### Class: net.citizensnpcs.api.hpastar.ReversableAStarNode
Type: Class
Implements: java.lang.Comparable

Methods:
- List<ReversableAStarNode> reconstructSolution()
- int compareTo(ReversableAStarNode o)
- int compareTo(Object)

## Package: net.citizensnpcs.api.npc

### Class: net.citizensnpcs.api.npc.MetadataStore
Type: Interface

Methods:
- void set(NPC$Metadata key, Object data)
- void set(String, Object)
- void saveTo(DataKey)
- int size()
- TT get(NPC$Metadata key)
- TT get(NPC$Metadata key, T def)
- TT get(String)
- TT get(String, T)
- MetadataStore clone()
- void setPersistent(NPC$Metadata key, Object data)
- void setPersistent(String, Object)
- void loadFrom(DataKey)
- boolean has(NPC$Metadata key)
- boolean has(String)
- void remove(NPC$Metadata key)
- void remove(String)

### Class: net.citizensnpcs.api.npc.NPC
Type: Interface
Implements: net.citizensnpcs.api.astar.Agent, java.lang.Cloneable

Methods:
- boolean useMinecraftAI()
- String getName()
- void addRunnable(Runnable)
- MetadataStore data()
- void setUseMinecraftAI(boolean use)
- boolean isFlyable()
- V removeTrait(Class<Trait>)
- UUID getUniqueId()
- GoalController getDefaultGoalController()
- Optional<TT> getTraitOptional(Class<TT> trait)
- Supplier<ItemStack> getItemProvider()
- String getRawName()
- void setProtected(boolean isProtected)
- void setFlyable(boolean flyable)
- boolean shouldRemoveFromTabList()
- boolean isUpdating(NPC$NPCUpdate)
- void setAlwaysUseNameHologram(boolean use)
- String getFullName()
- boolean requiresNameHologram()
- void scheduleUpdate(NPC$NPCUpdate)
- void destroy()
- void destroy(CommandSender source)
- void faceLocation(Location)
- TT getTraitNullable(Class<TT>)
- Location getStoredLocation()
- void setName(String)
- void setMoveDestination(Location)
- TT getOrAddTrait(Class<TT>)
- UUID getMinecraftUniqueId()
- void teleport(Location, PlayerTeleportEvent$TeleportCause)
- void save(DataKey)
- int getId()
- boolean despawn()
- boolean despawn(DespawnReason)
- boolean isPushableByFluids()
- boolean isProtected()
- void load(DataKey)
- V addTrait(Class<Trait>)
- void addTrait(Trait)
- void setSneaking(boolean)
- boolean isSpawned()
- NPC copy()
- Z hasTrait(Class<Trait>)
- boolean shouldRemoveFromPlayerList()
- Iterable<Trait> getTraits()
- void setBukkitEntityType(EntityType)
- BlockBreaker getBlockBreaker(Block, BlockBreaker$BlockBreakerConfiguration)
- Entity getEntity()
- TT getTrait(Class<TT>)
- Navigator getNavigator()
- V setItemProvider(Supplier<ItemStack>)
- boolean spawn(Location location)
- Z spawn(Location at, Consumer<Entity> callback)
- boolean spawn(Location location, SpawnReason reason)
- Z spawn(Location, SpawnReason, Consumer<Entity>)
- NPCRegistry getOwningRegistry()
- NPC clone()
- SpeechController getDefaultSpeechController()
- boolean isHiddenFrom(Player player)

### Class: net.citizensnpcs.api.npc.NPCDataStore
Type: Interface

Methods:
- int createUniqueNPCId(NPCRegistry)
- void reloadFromSource()
- void storeAll(NPCRegistry)
- void saveToDisk()
- void loadInto(NPCRegistry)
- void store(NPC)
- void saveToDiskImmediate()
- V clearTraitData(Iterable<String>)
- void clearData(NPC)

### Class: net.citizensnpcs.api.npc.NPCRegistry
Type: Interface
Implements: java.lang.Iterable

Methods:
- NPC createNPCUsingItem(EntityType, String, ItemStack)
- void deregisterAll()
- Iterable<NPC> sorted()
- NPC getNPC(Entity)
- String getName()
- NPC getByUniqueIdGlobal(UUID)
- NPC getById(int)
- void saveToStore()
- void deregister(NPC)
- boolean isNPC(Entity)
- NPC getByUniqueId(UUID)
- void despawnNPCs(DespawnReason)
- NPC createNPC(EntityType, String)
- NPC createNPC(EntityType, String, Location)
- NPC createNPC(EntityType, UUID, int, String)

### Class: net.citizensnpcs.api.npc.NPCSelector
Type: Interface

Methods:
- NPC getSelected(CommandSender)
- void select(CommandSender, NPC)
- void deselect(CommandSender)

### Class: net.citizensnpcs.api.npc.AbstractNPC
Type: Abstract Class
Implements: net.citizensnpcs.api.npc.NPC

Methods:
- void setName(String name)
- TT getOrAddTrait(Class<TT> clazz)
- String getName()
- void addRunnable(Runnable runnable)
- MetadataStore data()
- UUID getMinecraftUniqueId()
- void teleport(Location location, PlayerTeleportEvent$TeleportCause cause)
- void save(DataKey root)
- void update()
- int getId()
- V removeTrait(Class<Trait> traitClass)
- UUID getUniqueId()
- GoalController getDefaultGoalController()
- Supplier<ItemStack> getItemProvider()
- void load(DataKey root)
- int hashCode()
- String getRawName()
- V addTrait(Class<Trait> clazz)
- void addTrait(Trait trait)
- NPC copy()
- Z hasTrait(Class<Trait> trait)
- String getFullName()
- boolean requiresNameHologram()
- Iterable<Trait> getTraits()
- void destroy()
- TT getTrait(Class<TT> trait)
- V setItemProvider(Supplier<ItemStack> provider)
- NPCRegistry getOwningRegistry()
- boolean equals(Object obj)
- NPC clone()
- Object clone() throws CloneNotSupportedException
- SpeechController getDefaultSpeechController()
- TT getTraitNullable(Class<TT> clazz)

### Class: net.citizensnpcs.api.npc.BlockBreaker
Type: Abstract Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

No public methods found

### Class: net.citizensnpcs.api.npc.BlockBreaker$BlockBreakerConfiguration
Type: Class

Methods:
- ItemStack item()
- BlockBreaker$BlockBreakerConfiguration item(ItemStack stack)
- BiConsumer<Block, ItemStack> blockBreaker()
- V blockBreaker(BiConsumer<Block, ItemStack> breaker)
- float blockStrengthModifier()
- BlockBreaker$BlockBreakerConfiguration blockStrengthModifier(float modifier)
- Runnable callback()
- BlockBreaker$BlockBreakerConfiguration callback(Runnable callback)
- double radius()
- BlockBreaker$BlockBreakerConfiguration radius(double radius)

### Class: net.citizensnpcs.api.npc.MemoryNPCDataStore
Type: Class
Implements: net.citizensnpcs.api.npc.NPCDataStore

Methods:
- int createUniqueNPCId(NPCRegistry registry)
- void reloadFromSource()
- void storeAll(NPCRegistry registry)
- void saveToDisk()
- void loadInto(NPCRegistry registry)
- void store(NPC npc)
- void saveToDiskImmediate()
- V clearTraitData(Iterable<String> traitNames)
- void clearData(NPC npc)

### Class: net.citizensnpcs.api.npc.NPC$Metadata
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ACTIVATION_RANGE
- AGGRESSIVE
- ALWAYS_USE_NAME_HOLOGRAM
- AMBIENT_SOUND
- BOUNDING_BOX_FUNCTION
- COLLIDABLE
- DAMAGE_OTHERS
- DEATH_SOUND
- DEFAULT_PROTECTED
- DISABLE_DEFAULT_STUCK_ACTION
- DROPS_ITEMS
- FLUID_PUSHABLE
- FLYABLE
- FORCE_PACKET_UPDATE
- GLOWING
- HOLOGRAM_RENDERER
- HURT_SOUND
- ITEM_AMOUNT
- ITEM_DATA
- ITEM_ID
- JUMP_POWER_SUPPLIER
- KEEP_CHUNK_LOADED
- KNOCKBACK
- LEASH_PROTECTED
- MINECART_OFFSET
- NAMEPLATE_VISIBLE
- NPC_SPAWNING_IN_PROGRESS
- PACKET_UPDATE_DELAY
- PATHFINDER_OPEN_DOORS
- PICKUP_ITEMS
- REMOVE_FROM_PLAYERLIST
- REMOVE_FROM_TABLIST
- RESET_PITCH_ON_TICK
- RESET_YAW_ON_SPAWN
- RESPAWN_DELAY
- SCOREBOARD_FAKE_TEAM_NAME
- SHOULD_SAVE
- SILENT
- SPAWN_NODAMAGE_TICKS
- SWIM
- TEXT_DISPLAY_COMPONENT
- TRACKING_RANGE
- USE_MINECRAFT_AI
- USING_HELD_ITEM
- USING_OFFHAND_ITEM
- VILLAGER_BLOCK_TRADES
- WATER_SPEED_MODIFIER

Methods:
- String getKey()
- **static** NPC$Metadata byKey(String name)
- TypeToken<*> getType()
- Z accepts(Class<Object> clazz)
- **static** NPC$Metadata valueOf(String name)
- **static** NPC$Metadata[] values()
- **static** NPC$Metadata byName(String name)

### Class: net.citizensnpcs.api.npc.NPC$NPCUpdate
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PACKET

Methods:
- **static** NPC$NPCUpdate valueOf(String name)
- **static** NPC$NPCUpdate[] values()

### Class: net.citizensnpcs.api.npc.RemoveReason
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DESTROYED
- REMOVAL

Methods:
- **static** RemoveReason valueOf(String name)
- **static** RemoveReason[] values()

### Class: net.citizensnpcs.api.npc.SimpleMetadataStore
Type: Class
Implements: net.citizensnpcs.api.npc.MetadataStore

Methods:
- void set(NPC$Metadata key, Object data)
- void set(String key, Object data)
- void saveTo(DataKey key)
- int size()
- TT get(NPC$Metadata key)
- TT get(NPC$Metadata key, T def)
- TT get(String key)
- TT get(String key, T def)
- MetadataStore clone()
- Object clone() throws CloneNotSupportedException
- void setPersistent(NPC$Metadata key, Object data)
- void setPersistent(String key, Object data)
- void loadFrom(DataKey key)
- boolean has(NPC$Metadata key)
- boolean has(String key)
- void remove(NPC$Metadata key)
- void remove(String key)

### Class: net.citizensnpcs.api.npc.SimpleNPCDataStore
Type: Class
Implements: net.citizensnpcs.api.npc.NPCDataStore

Constructors:
- SimpleNPCDataStore(Storage root)

Methods:
- int createUniqueNPCId(NPCRegistry registry)
- void reloadFromSource()
- **static** NPCDataStore create(Storage storage)
- void storeAll(NPCRegistry registry)
- void saveToDisk()
- void loadInto(NPCRegistry registry)
- void store(NPC npc)
- void saveToDiskImmediate()
- V clearTraitData(Iterable<String> traitNames)
- void clearData(NPC npc)

## Package: net.citizensnpcs.api.npc.templates

### Class: net.citizensnpcs.api.npc.templates.CommandEventAction
Type: Class
Implements: java.util.function.Consumer

Constructors:
- CommandEventAction(Class<NPCEvent> clazz, Consumer<NPC> commands)

Methods:
- void accept(NPC npc)
- void accept(Object)

### Class: net.citizensnpcs.api.npc.templates.CommandListExecutor
Type: Class
Implements: java.util.function.Consumer

Constructors:
- CommandListExecutor(List<String> commands)

Methods:
- void accept(NPC npc)
- void accept(Object)

### Class: net.citizensnpcs.api.npc.templates.Template
Type: Class

Methods:
- NamespacedKey getKey()
- **static** Template load(TemplateRegistry$TemplateErrorReporter errors, TemplateWorkspace workspace, NamespacedKey identifier, DataKey key)
- void apply(NPC npc)

### Class: net.citizensnpcs.api.npc.templates.TemplateRegistry
Type: Class

Constructors:
- TemplateRegistry(Path baseFolder)

Methods:
- void generateTemplateFromNPC(NamespacedKey key, NPC npc)
- Collection<Template> getAllTemplates()
- Template getTemplateByKey(NamespacedKey key)
- boolean hasNamespace(String namespace)
- Collection<Template> getTemplates(String name)

### Class: net.citizensnpcs.api.npc.templates.TemplateRegistry$TemplateErrorReporter
Type: Class

Methods:
- void addError(String message)

### Class: net.citizensnpcs.api.npc.templates.TemplateWorkspace
Type: Class

Constructors:
- TemplateWorkspace(File namespaceFolder)

Methods:
- File getFile(String fileName)

### Class: net.citizensnpcs.api.npc.templates.TraitLoaderAction
Type: Class
Implements: java.util.function.Consumer

Constructors:
- TraitLoaderAction(TemplateRegistry$TemplateErrorReporter errors, TemplateWorkspace workspace, DataKey traits)

Methods:
- void accept(NPC npc)
- void accept(Object)

### Class: net.citizensnpcs.api.npc.templates.YamlReplacementAction
Type: Class
Implements: java.util.function.Consumer

Methods:
- void accept(NPC npc)
- void accept(Object)

## Package: net.citizensnpcs.api.persistence

### Class: net.citizensnpcs.api.persistence.DelegatePersistence
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class<Persister<*>> value()

### Class: net.citizensnpcs.api.persistence.Persist
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class<*> collectionType()
- Class<*> valueType()
- String namespace()
- boolean reify()
- Class<*> keyType()
- String value()
- boolean required()

### Class: net.citizensnpcs.api.persistence.Persistable
Type: Interface

Methods:
- void load(DataKey)
- void save(DataKey)

### Class: net.citizensnpcs.api.persistence.Persister
Type: Interface

Methods:
- V save(T, T)
- TT create(DataKey)

### Class: net.citizensnpcs.api.persistence.ComponentPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(Component text, DataKey root)
- void save(Object, DataKey)
- Component create(DataKey root)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.EulerAnglePersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(EulerAngle angle, DataKey root)
- void save(Object, DataKey)
- EulerAngle create(DataKey root)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.ItemStackPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(ItemStack instance, DataKey root)
- void save(Object, DataKey)
- ItemStack create(DataKey root)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.LocationPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(Location location, DataKey root)
- void save(Object, DataKey)
- Location create(DataKey root)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.LocationPersister$LazilyLoadedLocation
Type: Class
Extends: org.bukkit.Location

Constructors:
- LocationPersister$LazilyLoadedLocation(UUID worldID, String worldName, double x, double y, double z, float yaw, float pitch)

Methods:
- World getWorld()
- UUID getWorldUUID()

### Class: net.citizensnpcs.api.persistence.NamespacedKeyPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(NamespacedKey instance, DataKey root)
- void save(Object, DataKey)
- NamespacedKey create(DataKey root)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.PersistenceLoader
Type: Class

Methods:
- **static** PersisterRegistry<TT> createRegistry(Class<*> base)
- **static** V registerPersistDelegate(Class<*> clazz, Class<Persister<*>> delegateClass)
- **static** TT load(Class<+TT> clazz, DataKey root)
- **static** TT load(T instance, T root)
- **static** void save(Object instance, DataKey root)

### Class: net.citizensnpcs.api.persistence.PersisterRegistry
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- Iterable<Class<+TT>> registeredTypes()
- V save(T instance, T root)
- TT create(DataKey root)
- V register(String type, Class<+TT> clazz)

### Class: net.citizensnpcs.api.persistence.PotionEffectPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(PotionEffect effect, DataKey root)
- void save(Object, DataKey)
- PotionEffect create(DataKey root)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.QuaternionfPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(Quaternionfc instance, DataKey root)
- void save(Object, DataKey)
- Quaternionfc create(DataKey root)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.UUIDPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(UUID instance, DataKey root)
- void save(Object, DataKey)
- UUID create(DataKey root)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.Vector3fPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(Vector3fc instance, DataKey root)
- void save(Object, DataKey)
- Vector3fc create(DataKey root)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.VectorPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(Vector instance, DataKey root)
- void save(Object, DataKey)
- Vector create(DataKey root)
- Object create(DataKey)

## Package: net.citizensnpcs.api.trait

### Class: net.citizensnpcs.api.trait.TraitEventHandler
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- EventHandler value()
- Class<TraitEventHandler$NPCEventExtractor> processor()

### Class: net.citizensnpcs.api.trait.TraitEventHandler$NPCEventExtractor
Type: Interface
Implements: java.util.function.Function

No public methods found

### Class: net.citizensnpcs.api.trait.TraitFactory
Type: Interface

Methods:
- void registerTrait(TraitInfo)
- Class<Trait> getTraitClass(String)
- Collection<TraitInfo> getRegisteredTraits()
- void deregisterTrait(TraitInfo)
- TT getTrait(Class<TT>)
- TT getTrait(String)
- void addDefaultTraits(NPC)
- TraitTemplateParser getTemplateParser(String)

### Class: net.citizensnpcs.api.trait.TraitName
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: net.citizensnpcs.api.trait.TraitTemplateParser
Type: Interface

Methods:
- TraitTemplateParser$ShortTemplateParser getShortTemplateParser()
- TraitTemplateParser$TemplateParser getTemplateParser()
- **static** TraitTemplateParser createDefault(Class<Trait> traitClass)

### Class: net.citizensnpcs.api.trait.TraitTemplateParser$ShortTemplateParser
Type: Interface
Implements: java.util.function.BiFunction

No public methods found

### Class: net.citizensnpcs.api.trait.TraitTemplateParser$TemplateParser
Type: Interface
Implements: java.util.function.BiFunction

No public methods found

### Class: net.citizensnpcs.api.trait.Trait
Type: Abstract Class
Implements: org.bukkit.event.Listener, java.lang.Runnable

Methods:
- void onSpawn()
- NPC getNPC()
- String getName()
- void onPreSpawn()
- void load(DataKey key) throws NPCLoadException
- void onAttach()
- void save(DataKey key)
- void run()
- boolean isRunImplemented()
- void onRemove()
- void onRemove(RemoveReason reason)
- void onDespawn()
- void onDespawn(DespawnReason reason)
- void onCopy()
- void linkToNPC(NPC npc)

### Class: net.citizensnpcs.api.trait.TraitInfo
Type: Class

Methods:
- String getTraitName()
- TraitInfo withTemplateParser(TraitTemplateParser parser)
- void checkValid()
- TraitInfo asDefaultTrait()
- boolean shouldTrackStats()
- void registerListener(Plugin plugin)
- TT tryCreateInstance()
- TraitInfo optInToStats()
- Class<Trait> getTraitClass()
- boolean isDefaultTrait()
- TraitTemplateParser getParser()
- **static** TraitInfo create(Class<Trait> trait)
- TraitInfo withSupplier(Supplier<Trait> supplier)
- TraitInfo withName(String name)

### Class: net.citizensnpcs.api.trait.TraitTemplateParser$TraitParserContext
Type: Class

Constructors:
- TraitTemplateParser$TraitParserContext(NPC npc, TemplateWorkspace workspace)

No public methods found

## Package: net.citizensnpcs.api.trait.trait

### Class: net.citizensnpcs.api.trait.trait.Equipment
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- void onSpawn()
- Map<Equipment$EquipmentSlot, ItemStack> getEquipmentBySlot()
- void set(Equipment$EquipmentSlot eslot, ItemStack item)
- void load(DataKey key) throws NPCLoadException
- void setCosmetic(Equipment$EquipmentSlot slot, ItemStack stack)
- void onAttach()
- ItemStack get(Equipment$EquipmentSlot eslot)
- void save(DataKey key)
- void run()
- ItemStack getCosmetic(Equipment$EquipmentSlot slot)
- ItemStack[] getCosmeticEquipment()
- ItemStack[] getEquipment()

### Class: net.citizensnpcs.api.trait.trait.Equipment$EquipmentSlot
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BODY
- BOOTS
- CHESTPLATE
- HAND
- HELMET
- LEGGINGS
- OFF_HAND
- SADDLE

Methods:
- **static** Equipment$EquipmentSlot valueOf(String name)
- EquipmentSlot toBukkit()
- **static** Equipment$EquipmentSlot[] values()

### Class: net.citizensnpcs.api.trait.trait.Equipment$NPCChangeEquipmentEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Constructors:
- Equipment$NPCChangeEquipmentEvent(NPC npc, Equipment$EquipmentSlot slot, ItemStack stack)

Methods:
- Equipment$EquipmentSlot getSlot()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ItemStack getStack()

### Class: net.citizensnpcs.api.trait.trait.Inventory
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- void openInventory(Player sender)
- void onSpawn()
- void load(DataKey key) throws NPCLoadException
- void save(DataKey key)
- ItemStack[] getContents()
- String toString()
- void run()
- void onDespawn()
- void setContents(ItemStack[] contents)
- void setItem(int slot, ItemStack item)
- Inventory getInventoryView()

### Class: net.citizensnpcs.api.trait.trait.MobType
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- void onSpawn()
- void load(DataKey key)
- EntityType getType()
- void save(DataKey key)
- String toString()
- void setType(EntityType type)

### Class: net.citizensnpcs.api.trait.trait.Owner
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- boolean isOwnedBy(CommandSender sender)
- boolean isOwnedBy(String name)
- boolean isOwnedBy(UUID other)
- UUID getOwnerId()
- String toString()
- String getOwner()
- void setOwner(CommandSender sender)
- void setOwner(String owner)
- void setOwner(String owner, UUID uuid)
- void setOwner(UUID uuid)

### Class: net.citizensnpcs.api.trait.trait.PlayerFilter
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Constructors:
- PlayerFilter(BiConsumer<Player, Entity> hideFunction, BiConsumer<Player, Entity> viewFunction)

Methods:
- void setDenylist()
- void addPermission(String permission)
- void setApplyRange(double range)
- void run()
- void onDespawn()
- void removePlayer(UUID uuid)
- Set<UUID> getPlayerUUIDs()
- void addPlayer(UUID uuid)
- boolean affectsGroup(String group)
- boolean onSeenByPlayer(Player player)
- V setPlayerFilter(Function<Player, Boolean> filter)
- void setAllowlist()
- void recalculate()
- void addGroup(String group)
- Set<String> getGroups()
- V setPlayers(Set<UUID> players)
- boolean isDenylist()
- Set<String> getPermissions()
- void clear()
- boolean isAllowlist()
- boolean affectsPlayer(UUID uuid)
- void removePermission(String permission)
- boolean isHidden(Player player)
- double getApplyRange()
- void addChildNPC(NPC npc)
- void removeGroup(String group)

### Class: net.citizensnpcs.api.trait.trait.PlayerFilter$Mode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ALLOWLIST
- DENYLIST

Methods:
- **static** PlayerFilter$Mode valueOf(String name)
- **static** PlayerFilter$Mode[] values()

### Class: net.citizensnpcs.api.trait.trait.Spawned
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- void setSpawned(boolean shouldSpawn)
- String toString()
- boolean shouldSpawn()

## Package: net.citizensnpcs.api.util

### Class: net.citizensnpcs.api.util.FileStorage
Type: Interface
Implements: net.citizensnpcs.api.util.Storage

Methods:
- File getFile()

### Class: net.citizensnpcs.api.util.Placeholders$PlaceholderFunction
Type: Interface

Methods:
- String apply(NPC, CommandSender, String)

### Class: net.citizensnpcs.api.util.Storage
Type: Interface

Methods:
- DataKey getKey(String)
- boolean load()
- void save()
- void saveAsync()

### Class: net.citizensnpcs.api.util.BoundingBox
Type: Class

Constructors:
- BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ)

Methods:
- BoundingBox add(int x, int y, int z)
- BoundingBox add(Location location)
- EntityDim toDimensions()
- BoundingBox mul(double scale)
- BoundingBox mul(double x, double, double y)
- int hashCode()
- BoundingBox toBukkit()
- boolean equals(Object obj)
- BoundingBox clone()
- Object clone() throws CloneNotSupportedException
- String toString()
- **static** BoundingBox convert(BoundingBox bukkit)

### Class: net.citizensnpcs.api.util.DataKey
Type: Abstract Class

Methods:
- double getDouble(String)
- double getDouble(String key, double value)
- DataKey getFromRoot(String)
- DataKey getRelative(int key)
- DataKey getRelative(String)
- TT getRawUnchecked(String key)
- void setDouble(String, double)
- Iterable<DataKey> getIntegerSubKeys()
- void removeKey(String)
- boolean keyExists()
- boolean keyExists(String)
- int hashCode()
- V setMap(String, Map<String, Object>)
- String getPath()
- boolean hasSubKeys()
- boolean getBoolean(String)
- boolean getBoolean(String key, boolean value)
- DataKey copy()
- void setRaw(String, Object)
- Map<String, Object> getValuesDeep()
- String getString(String)
- String getString(String key, String value)
- void setInt(String, int)
- long getLong(String)
- long getLong(String key, long value)
- int getInt(String)
- int getInt(String key, int value)
- void setString(String, String)
- void setLong(String, long)
- Iterable<DataKey> getSubKeys()
- boolean equals(Object obj)
- String name()
- Object getRaw(String)
- void setBoolean(String, boolean)

### Class: net.citizensnpcs.api.util.EntityDim
Type: Class

Constructors:
- EntityDim(double width, double height)
- EntityDim(float width, float height)

Methods:
- EntityDim mul(float scale)
- int hashCode()
- boolean equals(Object obj)
- EntityDim clone()
- Object clone() throws CloneNotSupportedException
- **static** EntityDim from(BoundingBox bb)
- **static** EntityDim from(Entity entity)
- String toString()

### Class: net.citizensnpcs.api.util.ItemStorage
Type: Class

Methods:
- **static** void saveItem(DataKey key, ItemStack item)
- **static** ItemStack loadItemStack(DataKey root)

### Class: net.citizensnpcs.api.util.MemoryDataKey
Type: Class
Extends: net.citizensnpcs.api.util.DataKey

Constructors:
- MemoryDataKey(Map<String, Object> root)

Methods:
- double getDouble(String key)
- double getDouble(String key, double def)
- DataKey getFromRoot(String path)
- MemoryDataKey getRelative(String relative)
- DataKey getRelative(String)
- void setDouble(String key, double value)
- void removeKey(String key)
- boolean keyExists(String key)
- int hashCode()
- V setMap(String key, Map<String, Object> value)
- String getPath()
- boolean hasSubKeys()
- boolean getBoolean(String key)
- MemoryDataKey copy()
- DataKey copy()
- void setRaw(String key, Object value)
- Map<String, Object> getValuesDeep()
- String getString(String key)
- void setInt(String key, int value)
- long getLong(String key)
- long getLong(String key, long def)
- int getInt(String key)
- int getInt(String key, int def)
- void setString(String key, String value)
- void setLong(String key, long value)
- Iterable<DataKey> getSubKeys()
- boolean equals(Object obj)
- String name()
- String toString()
- Object getRaw(String key)
- void setBoolean(String key, boolean value)

### Class: net.citizensnpcs.api.util.Messaging
Type: Class

Methods:
- **static** void sendWithNPC(CommandSender sender, Object msg, NPC npc)
- **static** void sendColorless(CommandSender sender, Object[] msg)
- **static** void debug(Object[] msg)
- **static** Object test(String raw)
- **static** void log(Object[] msg)
- **static** void sendTr(CommandSender sender, String key, Object[] msg)
- **static** void sendTrColorless(CommandSender sender, String key, Object[] msg)
- **static** String parseComponents(String raw)
- **static** void logTr(String key, Object[] msg)
- **static** void sendWithNPCColorless(CommandSender sender, Object msg, NPC npc)
- **static** void sendError(CommandSender sender, Object[] msg)
- **static** Object minecraftComponentFromRawMessage(String raw)
- **static** V configure(File debugFile, boolean debug, boolean resetFormattingOnColorChange, String messageColour, String highlightColour, String errorColour, BiConsumer<Player, Object> messageSender)
- **static** List<String> parseComponentsList(String raw)
- **static** void severeTr(String key, Object[] messages)
- **static** boolean isDebugging()
- **static** void warn(Object[] string)
- **static** String convertLegacyCodes(String message)
- **static** String tryTranslate(Object possible)
- **static** void severe(Object[] messages)
- **static** V idebug(Supplier<String> msg)
- **static** void sendErrorTr(CommandSender sender, String key, Object[] msg)
- **static** String stripColor(String raw)
- **static** void send(CommandSender sender, Object[] msg)
- **static** String tr(String key, Object[] messages)

### Class: net.citizensnpcs.api.util.OldEnumCompat
Type: Class

No public methods found

### Class: net.citizensnpcs.api.util.OldEnumCompat$CatTypeEnum
Type: Class
Extends: net.citizensnpcs.api.util.OldEnumCompat$ReflectiveOldEnum

Constructors:
- OldEnumCompat$CatTypeEnum(Cat$Type instance)

Methods:
- int hashCode()
- **static** OldEnumCompat$CatTypeEnum valueOf(String name)
- boolean equals(Object)
- **static** OldEnumCompat$CatTypeEnum[] values()
- String name()
- String toString()
- Object getInstance()

### Class: net.citizensnpcs.api.util.OldEnumCompat$FrogVariantEnum
Type: Class
Extends: net.citizensnpcs.api.util.OldEnumCompat$ReflectiveOldEnum

Constructors:
- OldEnumCompat$FrogVariantEnum(Frog$Variant instance)

Methods:
- int hashCode()
- **static** OldEnumCompat$FrogVariantEnum valueOf(String name)
- boolean equals(Object)
- **static** OldEnumCompat$FrogVariantEnum[] values()
- String name()
- String toString()
- Object getInstance()

### Class: net.citizensnpcs.api.util.OldEnumCompat$VillagerProfessionEnum
Type: Class
Extends: net.citizensnpcs.api.util.OldEnumCompat$ReflectiveOldEnum

Constructors:
- OldEnumCompat$VillagerProfessionEnum(Villager$Profession instance)

Methods:
- int hashCode()
- **static** OldEnumCompat$VillagerProfessionEnum valueOf(String name)
- boolean equals(Object)
- **static** OldEnumCompat$VillagerProfessionEnum[] values()
- String name()
- String toString()
- Object getInstance()

### Class: net.citizensnpcs.api.util.OldEnumCompat$VillagerTypeEnum
Type: Class
Extends: net.citizensnpcs.api.util.OldEnumCompat$ReflectiveOldEnum

Constructors:
- OldEnumCompat$VillagerTypeEnum(Villager$Type instance)

Methods:
- int hashCode()
- **static** OldEnumCompat$VillagerTypeEnum valueOf(String name)
- boolean equals(Object)
- **static** OldEnumCompat$VillagerTypeEnum[] values()
- String name()
- String toString()
- Object getInstance()

### Class: net.citizensnpcs.api.util.Paginator
Type: Class

Constructors:
- Paginator(Collection<String> lines)
- Paginator(int initialLinesOfText)

Methods:
- boolean hasPage(int page)
- Paginator console(boolean console)
- void addLine(String line)
- **static** String wrapHeader(Object string)
- String getPageText(int page)
- Paginator header(String header)
- Paginator enablePageSwitcher()
- Paginator enablePageSwitcher(String command)
- boolean sendPage(CommandSender sender, int page)

### Class: net.citizensnpcs.api.util.PermissionUtil
Type: Class

Methods:
- **static** Z hasPermission(Set<String> permissions, Player player)
- **static** Boolean inGroup(Collection<String> groups, Player player)

### Class: net.citizensnpcs.api.util.Placeholders
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- **static** boolean containsPlaceholders(String text)
- **static** String replace(String text, CommandSender sender, NPC npc)
- **static** String replace(String text, OfflinePlayer player)
- **static** void registerNPCPlaceholder(Pattern regex, Placeholders$PlaceholderFunction func)
- **static** String replaceName(String text, CommandSender sender, NPC npc)

### Class: net.citizensnpcs.api.util.SpigotUtil
Type: Class

Methods:
- **static** int[] getVersion()
- **static** Duration parseDuration(String raw, TimeUnit defaultUnits)
- **static** NamespacedKey getKey(String raw)
- **static** NamespacedKey getKey(String raw, String defaultNamespace)
- **static** boolean isUsing1_13API()
- **static** int toTicks(Duration duration)
- **static** boolean checkYSafe(double y, World)
- **static** ItemStack parseItemStack(ItemStack base, String item)
- **static** int getMaxNameLength(EntityType type)
- **static** boolean isFoliaServer()
- **static** CompletableFuture<Boolean> teleportAsync(Entity entity, Location location)
- **static** CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent$TeleportCause cause)
- **static** Z isRegistryKeyed(Class<*> clazz)
- **static** int parseTicks(String raw)

### Class: net.citizensnpcs.api.util.SpigotUtil$InventoryViewAPI
Type: Class

Constructors:
- SpigotUtil$InventoryViewAPI(InventoryView view)

Methods:
- Player getPlayer()
- Inventory getTopInventory()
- int hashCode()
- boolean equals(Object obj)
- InventoryView getView()
- void close()

### Class: net.citizensnpcs.api.util.Translator
Type: Class

Methods:
- **static** String format(String msg, Object[] objects)
- **static** String translate(String key, Object[] msg)
- **static** void setInstance(File dataFolder, Locale preferredLocale)

### Class: net.citizensnpcs.api.util.YamlStorage
Type: Class
Implements: net.citizensnpcs.api.util.Storage

Constructors:
- YamlStorage(File file)
- YamlStorage(File file, String header)
- YamlStorage(File file, String header, boolean transformLists)

Methods:
- DataKey getKey(String root)
- boolean load()
- int hashCode()
- boolean equals(Object obj)
- void save()
- String toString()
- void saveAsync()

## Package: net.citizensnpcs.api.util.schedulers

### Class: net.citizensnpcs.api.util.schedulers.SchedulerAdapter
Type: Interface

Methods:
- SchedulerTask runEntityTask(Entity, Runnable)
- SchedulerTask runTaskTimerAsynchronously(Runnable, long, long)
- SchedulerTask runEntityTaskLater(Entity, Runnable, long)
- SchedulerTask runTaskLater(Runnable, long)
- SchedulerTask runRegionTaskLater(Location, Runnable, long)
- SchedulerTask runRegionTaskLater(World, int, int, Runnable, long)
- boolean isOnOwnerThread(Entity)
- boolean isOnOwnerThread(Location)
- boolean isOnOwnerThread(World, int, int)
- boolean isOnOwnerThread(Block)
- SchedulerTask runTask(Runnable)
- SchedulerTask runEntityTaskTimer(Entity, Runnable, long, long)
- SchedulerTask runTaskLaterAsynchronously(Runnable, long)
- SchedulerTask runRegionTaskTimer(Location, Runnable, long, long)
- SchedulerTask runRegionTaskTimer(World, int, int, Runnable, long, long)
- SchedulerTask runTaskAsynchronously(Runnable)
- SchedulerTask runTaskTimer(Runnable, long, long)
- SchedulerTask runRegionTask(Location, Runnable)
- SchedulerTask runRegionTask(World, int, int, Runnable)

### Class: net.citizensnpcs.api.util.schedulers.SchedulerTask
Type: Interface

Methods:
- void cancel()
- boolean isCancelled()
- boolean isRepeating()
- Plugin getPlugin()
- Object getOriginalTask()

### Class: net.citizensnpcs.api.util.schedulers.SchedulerRunnable
Type: Abstract Class
Implements: java.lang.Runnable

Methods:
- int getTaskId()
- void cancel()
- boolean isCancelled()
- SchedulerTask runEntityTask(Plugin plugin, Entity entity, Runnable retired)
- SchedulerTask runTaskTimerAsynchronously(Plugin plugin, long delayTicks, long)
- SchedulerTask runEntityTaskLater(Plugin plugin, Entity entity, Runnable retired, long delayTicks)
- SchedulerTask runTaskLater(Plugin plugin, long delayTicks)
- SchedulerTask runRegionTaskLater(Plugin plugin, Location location, long delayTicks)
- SchedulerTask runRegionTaskLater(Plugin plugin, World world, int chunkX, int chunkZ, long delayTicks)
- void run()
- SchedulerTask runTask(Plugin plugin)
- SchedulerTask runEntityTaskTimer(Plugin plugin, Entity entity, Runnable retired, long delayTicks, long)
- SchedulerTask runTaskLaterAsynchronously(Plugin plugin, long delayTicks)
- SchedulerTask runRegionTaskTimer(Plugin plugin, Location location, long delayTicks, long)
- SchedulerTask runRegionTaskTimer(Plugin plugin, World world, int chunkX, int chunkZ, long delayTicks, long)
- SchedulerTask runTaskAsynchronously(Plugin plugin)
- SchedulerTask getTask()
- SchedulerTask runTaskTimer(Plugin plugin, long delayTicks, long)
- SchedulerTask runRegionTask(Plugin plugin, Location location)
- SchedulerTask runRegionTask(Plugin plugin, World world, int chunkX, int chunkZ)

## Package: net.citizensnpcs.api.util.schedulers.adapter

### Class: net.citizensnpcs.api.util.schedulers.adapter.FoliaScheduler
Type: Class
Implements: net.citizensnpcs.api.util.schedulers.SchedulerAdapter

Constructors:
- FoliaScheduler(Plugin plugin)

Methods:
- SchedulerTask runEntityTask(Entity entity, Runnable runnable)
- SchedulerTask runTaskTimerAsynchronously(Runnable runnable, long delayTicks, long)
- SchedulerTask runEntityTaskLater(Entity entity, Runnable runnable, long delayTicks)
- SchedulerTask runTaskLater(Runnable runnable, long delayTicks)
- SchedulerTask runRegionTaskLater(Location location, Runnable runnable, long delayTicks)
- SchedulerTask runRegionTaskLater(World world, int chunkX, int chunkZ, Runnable runnable, long delayTicks)
- boolean isOnOwnerThread(Entity entity)
- boolean isOnOwnerThread(Location location)
- boolean isOnOwnerThread(World world, int chunkX, int chunkZ)
- boolean isOnOwnerThread(Block block)
- SchedulerTask runTask(Runnable runnable)
- SchedulerTask runEntityTaskTimer(Entity entity, Runnable runnable, long delayTicks, long)
- SchedulerTask runTaskLaterAsynchronously(Runnable runnable, long delayTicks)
- SchedulerTask runRegionTaskTimer(Location location, Runnable runnable, long delayTicks, long)
- SchedulerTask runRegionTaskTimer(World world, int chunkX, int chunkZ, Runnable runnable, long delayTicks, long)
- SchedulerTask runTaskAsynchronously(Runnable runnable)
- SchedulerTask runTaskTimer(Runnable runnable, long delayTicks, long)
- SchedulerTask runRegionTask(Location location, Runnable runnable)
- SchedulerTask runRegionTask(World world, int chunkX, int chunkZ, Runnable runnable)

### Class: net.citizensnpcs.api.util.schedulers.adapter.FoliaSchedulerTask
Type: Class
Implements: net.citizensnpcs.api.util.schedulers.SchedulerTask

Constructors:
- FoliaSchedulerTask(ScheduledTask task)

Methods:
- void cancel()
- boolean isCancelled()
- boolean isRepeating()
- Plugin getPlugin()
- ScheduledTask getOriginalTask()
- Object getOriginalTask()

### Class: net.citizensnpcs.api.util.schedulers.adapter.SpigotScheduler
Type: Class
Implements: net.citizensnpcs.api.util.schedulers.SchedulerAdapter

Constructors:
- SpigotScheduler(Plugin plugin)

Methods:
- SchedulerTask runEntityTask(Entity entity, Runnable runnable)
- SchedulerTask runTaskTimerAsynchronously(Runnable runnable, long delayTicks, long)
- SchedulerTask runEntityTaskLater(Entity entity, Runnable runnable, long delayTicks)
- SchedulerTask runTaskLater(Runnable runnable, long delayTicks)
- SchedulerTask runRegionTaskLater(Location location, Runnable runnable, long delayTicks)
- SchedulerTask runRegionTaskLater(World world, int chunkX, int chunkZ, Runnable runnable, long delayTicks)
- boolean isOnOwnerThread(Entity entity)
- boolean isOnOwnerThread(Location location)
- boolean isOnOwnerThread(World world, int chunkX, int chunkZ)
- boolean isOnOwnerThread(Block block)
- SchedulerTask runTask(Runnable runnable)
- SchedulerTask runEntityTaskTimer(Entity entity, Runnable runnable, long delayTicks, long)
- SchedulerTask runTaskLaterAsynchronously(Runnable runnable, long delayTicks)
- SchedulerTask runRegionTaskTimer(Location location, Runnable runnable, long delayTicks, long)
- SchedulerTask runRegionTaskTimer(World world, int chunkX, int chunkZ, Runnable runnable, long delayTicks, long)
- SchedulerTask runTaskAsynchronously(Runnable runnable)
- SchedulerTask runTaskTimer(Runnable runnable, long delayTicks, long)
- SchedulerTask runRegionTask(Location location, Runnable runnable)
- SchedulerTask runRegionTask(World world, int chunkX, int chunkZ, Runnable runnable)

### Class: net.citizensnpcs.api.util.schedulers.adapter.SpigotSchedulerTask
Type: Class
Implements: net.citizensnpcs.api.util.schedulers.SchedulerTask

Constructors:
- SpigotSchedulerTask(BukkitTask task)

Methods:
- void cancel()
- boolean isCancelled()
- boolean isRepeating()
- Plugin getPlugin()
- BukkitTask getOriginalTask()
- Object getOriginalTask()

## Package: net.citizensnpcs.api.util.schedulers.runnables

### Class: net.citizensnpcs.api.util.schedulers.runnables.FoliaSchedulerRunnable
Type: Abstract Class
Extends: net.citizensnpcs.api.util.schedulers.SchedulerRunnable

Methods:
- SchedulerTask runTask(Plugin plugin)
- SchedulerTask runEntityTaskTimer(Plugin plugin, Entity entity, Runnable retired, long delayTicks, long)
- SchedulerTask runTaskLaterAsynchronously(Plugin plugin, long delayTicks)
- SchedulerTask runRegionTaskTimer(Plugin plugin, Location location, long delayTicks, long)
- SchedulerTask runRegionTaskTimer(Plugin plugin, World world, int chunkX, int chunkZ, long delayTicks, long)
- SchedulerTask runEntityTask(Plugin plugin, Entity entity, Runnable retired)
- SchedulerTask runTaskTimerAsynchronously(Plugin plugin, long delayTicks, long)
- SchedulerTask runEntityTaskLater(Plugin plugin, Entity entity, Runnable retired, long delayTicks)
- SchedulerTask runTaskLater(Plugin plugin, long delayTicks)
- SchedulerTask runTaskAsynchronously(Plugin plugin)
- SchedulerTask runRegionTaskLater(Plugin plugin, Location location, long delayTicks)
- SchedulerTask runRegionTaskLater(Plugin plugin, World world, int chunkX, int chunkZ, long delayTicks)
- SchedulerTask runTaskTimer(Plugin plugin, long delayTicks, long)
- SchedulerTask runRegionTask(Plugin plugin, Location location)
- SchedulerTask runRegionTask(Plugin plugin, World world, int chunkX, int chunkZ)

### Class: net.citizensnpcs.api.util.schedulers.runnables.SpigotSchedulerRunnable
Type: Abstract Class
Extends: net.citizensnpcs.api.util.schedulers.SchedulerRunnable

Methods:
- SchedulerTask runTask(Plugin plugin)
- SchedulerTask runEntityTaskTimer(Plugin plugin, Entity entity, Runnable retired, long delayTicks, long)
- SchedulerTask runTaskLaterAsynchronously(Plugin plugin, long delayTicks)
- SchedulerTask runRegionTaskTimer(Plugin plugin, Location location, long delayTicks, long)
- SchedulerTask runRegionTaskTimer(Plugin plugin, World world, int chunkX, int chunkZ, long delayTicks, long)
- SchedulerTask runEntityTask(Plugin plugin, Entity entity, Runnable retired)
- SchedulerTask runTaskTimerAsynchronously(Plugin plugin, long delayTicks, long)
- SchedulerTask runEntityTaskLater(Plugin plugin, Entity entity, Runnable retired, long delayTicks)
- SchedulerTask runTaskLater(Plugin plugin, long delayTicks)
- SchedulerTask runTaskAsynchronously(Plugin plugin)
- SchedulerTask runRegionTaskLater(Plugin plugin, Location location, long delayTicks)
- SchedulerTask runRegionTaskLater(Plugin plugin, World world, int chunkX, int chunkZ, long delayTicks)
- SchedulerTask runTaskTimer(Plugin plugin, long delayTicks, long)
- SchedulerTask runRegionTask(Plugin plugin, Location location)
- SchedulerTask runRegionTask(Plugin plugin, World world, int chunkX, int chunkZ)

