# Citizens-2.0.39-b3875-net-citizensnpcs-api API Reference

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
- Iterable getNPCRegistries()
- void onImplementationChanged()
- NPCRegistry getTemporaryNPCRegistry()
- NPCRegistry getNamedNPCRegistry(String)
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
- **static** NPCRegistry createAnonymousNPCRegistry(NPCDataStore)
- **static** void removeNamedNPCRegistry(String)
- **static** NPCRegistry getNPCRegistry()
- **static** TraitFactory getTraitFactory()
- **static** NPCRegistry createInMemoryNPCRegistry(String)
- **static** Iterable getNPCRegistries()
- **static** File getDataFolder()
- **static** NPCRegistry getTemporaryNPCRegistry()
- **static** NPCRegistry getNamedNPCRegistry(String)
- **static** NPCRegistry createNamedNPCRegistry(String, NPCDataStore)
- **static** void setImplementation(CitizensPlugin)
- **static** TemplateRegistry getTemplateRegistry()
- **static** Plugin getPlugin()
- **static** boolean hasImplementation()
- **static** LocationLookup getLocationLookup()
- **static** NPCSelector getDefaultNPCSelector()
- **static** void talk(SpeechContext)
- **static** void registerEvents(Listener)
- **static** CommandManager getCommandManager()
- **static** void shutdown()
- **static** NMSHelper getNMSHelper()

### Class: net.citizensnpcs.api.LocationLookup
Type: Class
Extends: org.bukkit.scheduler.BukkitRunnable

Methods:
- void onQuit(PlayerQuitEvent)
- Iterable getNearbyPlayers(Location, double)
- Iterable getNearbyPlayers(NPC)
- Iterable getNearbyPlayers(World, double[], double[])
- void onJoin(PlayerJoinEvent)
- LocationLookup$PerPlayerMetadata getMetadata(String)
- Iterable getNearbyVisiblePlayers(Entity, double)
- Iterable getNearbyVisiblePlayers(Entity, double[], double[])
- Iterable getNearbyVisiblePlayers(Entity, Location, double)
- Iterable getNearbyNPCs(Location, double)
- Iterable getNearbyNPCs(NPC)
- Iterable getNearbyNPCs(World, double[], double[])
- void run()
- LocationLookup$PerPlayerMetadata registerMetadata(String, BiConsumer)
- void onWorldUnload(WorldUnloadEvent)

### Class: net.citizensnpcs.api.LocationLookup$AsyncPhTreeLoader
Type: Abstract Class
Implements: java.lang.Runnable

Methods:
- void run()
- Iterable getNearby(Object, double, double[])
- Iterable getNearby(Object, double[], double[])

### Class: net.citizensnpcs.api.LocationLookup$PerPlayerMetadata
Type: Class

Methods:
- void set(UUID, String, Object)
- Object getMarker(UUID, String)
- void removeAllValues(String)
- boolean has(UUID, String)
- boolean remove(UUID, String)

### Class: net.citizensnpcs.api.LocationLookup$TreeFactory$Node
Type: Class

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
- void setTarget(Function)
- void setTarget(Iterable)
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
- Iterable getPath()
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
- NavigatorParameters attackRange(double)
- NavigatorParameters addSingleUseCallback(NavigatorCallback)
- float straightLineTargetingDistance()
- NavigatorParameters straightLineTargetingDistance(float)
- int fallDistance()
- NavigatorParameters fallDistance(int)
- int stationaryTicks()
- NavigatorParameters stationaryTicks(int)
- PathfinderType pathfinderType()
- NavigatorParameters pathfinderType(PathfinderType)
- NavigatorParameters examiner(BlockExaminer)
- float range()
- NavigatorParameters range(float)
- Iterable callbacks()
- void run()
- boolean useNewPathfinder()
- NavigatorParameters useNewPathfinder(boolean)
- float speed()
- NavigatorParameters speed(float)
- float speedModifier()
- NavigatorParameters speedModifier(float)
- float modifiedSpeed(float)
- double destinationTeleportMargin()
- NavigatorParameters destinationTeleportMargin(double)
- StuckAction stuckAction()
- NavigatorParameters stuckAction(StuckAction)
- NavigatorParameters removeRunCallback(Runnable)
- double pathDistanceMargin()
- NavigatorParameters pathDistanceMargin(double)
- AttackStrategy defaultAttackStrategy()
- NavigatorParameters defaultAttackStrategy(AttackStrategy)
- NavigatorParameters clearExaminers()
- AttackStrategy attackStrategy()
- void attackStrategy(AttackStrategy)
- boolean debug()
- NavigatorParameters debug(boolean)
- NavigatorParameters addRunCallback(Runnable)
- boolean hasExaminer(Class)
- BlockExaminer[] examiners()
- double distanceMargin()
- NavigatorParameters distanceMargin(double)
- float baseSpeed()
- NavigatorParameters baseSpeed(float)
- boolean avoidWater()
- NavigatorParameters avoidWater(boolean)
- int attackDelayTicks()
- NavigatorParameters attackDelayTicks(int)
- Function entityTargetLocationMapper()
- NavigatorParameters entityTargetLocationMapper(Function)
- NavigatorParameters clone()
- Object clone() throws CloneNotSupportedException
- Function lookAtFunction()
- NavigatorParameters lookAtFunction(Function)
- int updatePathRate()
- NavigatorParameters updatePathRate(int)

### Class: net.citizensnpcs.api.ai.PathfinderType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PathfinderType valueOf(String)
- **static** PathfinderType[] values()

### Class: net.citizensnpcs.api.ai.SimpleGoalController
Type: Class
Implements: net.citizensnpcs.api.ai.GoalController

Methods:
- void addGoal(Goal, int)
- boolean isPaused()
- void removeGoal(Goal)
- Iterator iterator()
- void removeBehavior(Behavior)
- void setPaused(boolean)
- void clear()
- void cancelCurrentExecution()
- void run()
- boolean isExecutingGoal()
- void addPrioritisableGoal(PrioritisableGoal)
- void addBehavior(Behavior, int)

### Class: net.citizensnpcs.api.ai.SimpleGoalController$SimpleGoalSelector
Type: Class
Implements: net.citizensnpcs.api.ai.GoalSelector

Methods:
- void selectAdditional(Goal[])
- void select(Goal)
- void finishAndRemove()
- void finish()

### Class: net.citizensnpcs.api.ai.SimpleGoalEntry
Type: Class
Implements: net.citizensnpcs.api.ai.GoalController$GoalEntry

Methods:
- Behavior getBehavior()
- int hashCode()
- Goal getGoal()
- boolean equals(Object)
- int getPriority()
- int compareTo(GoalController$GoalEntry)
- int compareTo(Object)

### Class: net.citizensnpcs.api.ai.TargetType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TargetType valueOf(String)
- **static** TargetType[] values()

### Class: net.citizensnpcs.api.ai.TeleportStuckAction
Type: Class
Implements: net.citizensnpcs.api.ai.StuckAction

Methods:
- String toString()
- boolean run(NPC, Navigator)

## Package: net.citizensnpcs.api.ai.event

### Class: net.citizensnpcs.api.ai.event.NavigatorCallback
Type: Interface

Methods:
- void onCompletion(CancelReason)

### Class: net.citizensnpcs.api.ai.event.CancelReason
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** CancelReason valueOf(String)
- **static** CancelReason[] values()

### Class: net.citizensnpcs.api.ai.event.NavigationBeginEvent
Type: Class
Extends: net.citizensnpcs.api.ai.event.NavigationEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.ai.event.NavigationCancelEvent
Type: Class
Extends: net.citizensnpcs.api.ai.event.NavigationCompleteEvent

Methods:
- CancelReason getCancelReason()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.ai.event.NavigationCompleteEvent
Type: Class
Extends: net.citizensnpcs.api.ai.event.NavigationEvent

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

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.ai.event.NavigationStuckEvent
Type: Class
Extends: net.citizensnpcs.api.ai.event.NavigationEvent

Methods:
- void setAction(StuckAction)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- StuckAction getAction()

## Package: net.citizensnpcs.api.ai.flocking

### Class: net.citizensnpcs.api.ai.flocking.FlockBehavior
Type: Interface

Methods:
- Vector getVector(NPC, Collection)

### Class: net.citizensnpcs.api.ai.flocking.NPCFlock
Type: Interface

Methods:
- Collection getNearby(NPC)

### Class: net.citizensnpcs.api.ai.flocking.AlignmentBehavior
Type: Class
Implements: net.citizensnpcs.api.ai.flocking.FlockBehavior

Methods:
- Vector getVector(NPC, Collection)

### Class: net.citizensnpcs.api.ai.flocking.CohesionBehavior
Type: Class
Implements: net.citizensnpcs.api.ai.flocking.FlockBehavior

Methods:
- Vector getVector(NPC, Collection)

### Class: net.citizensnpcs.api.ai.flocking.Flocker
Type: Class
Implements: java.lang.Runnable

Methods:
- void setMaxForce(double)
- void run()

### Class: net.citizensnpcs.api.ai.flocking.GroupNPCFlock
Type: Class
Implements: net.citizensnpcs.api.ai.flocking.NPCFlock

Methods:
- **static** GroupNPCFlock create(Iterable)
- List getNPCs()
- **static** GroupNPCFlock createWithRadius(Iterable, double)
- Collection getNearby(NPC)

### Class: net.citizensnpcs.api.ai.flocking.RadiusNPCFlock
Type: Class
Implements: net.citizensnpcs.api.ai.flocking.NPCFlock

Methods:
- Collection getNearby(NPC)

### Class: net.citizensnpcs.api.ai.flocking.SeparationBehavior
Type: Class
Implements: net.citizensnpcs.api.ai.flocking.FlockBehavior

Methods:
- Vector getVector(NPC, Collection)

## Package: net.citizensnpcs.api.ai.goals

### Class: net.citizensnpcs.api.ai.goals.FollowPathGoal
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- **static** FollowPathGoal create(NPC, List)
- void reset()
- BehaviorStatus run()
- **static** FollowPathGoal createFromLocations(NPC, List)

### Class: net.citizensnpcs.api.ai.goals.MoveToGoal
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.goals.TargetNearbyEntityGoal
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- **static** TargetNearbyEntityGoal$Builder builder(NPC)
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.goals.TargetNearbyEntityGoal$Builder
Type: Class

Methods:
- TargetNearbyEntityGoal$Builder targetFilter(Function)
- TargetNearbyEntityGoal build()
- TargetNearbyEntityGoal$Builder aggressive(boolean)
- TargetNearbyEntityGoal$Builder radius(double)
- TargetNearbyEntityGoal$Builder targets(Set)

### Class: net.citizensnpcs.api.ai.goals.WanderGoal
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter
Implements: org.bukkit.event.Listener

Methods:
- void setXYRange(int, int)
- boolean shouldExecute()
- **static** WanderGoal$Builder builder(NPC)
- void reset()
- BehaviorStatus run()
- void unpause()
- void setDelay(int)
- void setPathfind(boolean)
- void pause()

### Class: net.citizensnpcs.api.ai.goals.WanderGoal$Builder
Type: Class

Methods:
- WanderGoal$Builder filter(Function)
- WanderGoal$Builder worldguardRegion(Supplier)
- WanderGoal$Builder delay(int)
- WanderGoal$Builder pathfind(boolean)
- WanderGoal build()
- WanderGoal$Builder tree(Supplier)
- WanderGoal$Builder destinationPicker(Function)
- WanderGoal$Builder yrange(int)
- WanderGoal$Builder regionCentres(Supplier)
- WanderGoal$Builder xrange(int)

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

Methods:
- boolean hasRecipients()
- SpeechContext addRecipient(Entity)
- Iterator iterator()
- void setTalker(Entity)
- int size()
- SpeechContext addRecipients(List)
- String getMessage()
- void setMessage(String)
- Talkable getTalker()

### Class: net.citizensnpcs.api.ai.speech.TalkableEntity
Type: Class
Implements: net.citizensnpcs.api.ai.speech.Talkable

Methods:
- String getName()
- int compareTo(Object)
- void talkTo(SpeechContext, String)
- void talkNear(SpeechContext, String)
- Entity getEntity()

## Package: net.citizensnpcs.api.ai.speech.event

### Class: net.citizensnpcs.api.ai.speech.event.NPCSpeechEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- SpeechContext getContext()

### Class: net.citizensnpcs.api.ai.speech.event.SpeechBystanderEvent
Type: Class
Extends: net.citizensnpcs.api.ai.speech.event.SpeechEvent

No public methods found

### Class: net.citizensnpcs.api.ai.speech.event.SpeechEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getMessage()
- void setMessage(String)
- SpeechContext getContext()

### Class: net.citizensnpcs.api.ai.speech.event.SpeechTargetedEvent
Type: Class
Extends: net.citizensnpcs.api.ai.speech.event.SpeechEvent

No public methods found

## Package: net.citizensnpcs.api.ai.tree

### Class: net.citizensnpcs.api.ai.tree.Behavior
Type: Interface

Methods:
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.Condition
Type: Interface

Methods:
- boolean get()

### Class: net.citizensnpcs.api.ai.tree.ParallelBehavior
Type: Interface

No public methods found

### Class: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter
Type: Abstract Class
Implements: net.citizensnpcs.api.ai.Goal, net.citizensnpcs.api.ai.tree.Behavior

Methods:
- boolean shouldExecute(GoalSelector)
- **static** Goal create(Behavior)
- void run(GoalSelector)

### Class: net.citizensnpcs.api.ai.tree.BehaviorStatus
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BehaviorStatus valueOf(String)
- **static** BehaviorStatus[] values()

### Class: net.citizensnpcs.api.ai.tree.Callback
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- **static** Callback callback(Behavior, Consumer)
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.Composite
Type: Abstract Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- void removeBehavior(Behavior)
- boolean shouldExecute()
- void reset()
- List getBehaviors()
- void addBehavior(Behavior)

### Class: net.citizensnpcs.api.ai.tree.Decorator
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- **static** Decorator invert(Behavior)
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()
- **static** Decorator$Builder wrapping(Behavior)

### Class: net.citizensnpcs.api.ai.tree.Decorator$Builder
Type: Class

Methods:
- Decorator$Builder withShouldExecutePredicate(Predicate)
- Decorator$Builder withResetCallback(Runnable)
- Decorator$Builder withPreRunCallback(Runnable)
- Decorator build()
- Decorator$Builder withStatusTransformer(Function)

### Class: net.citizensnpcs.api.ai.tree.Empty
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.ForwardingBehaviorGoalAdapter
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- int hashCode()
- boolean equals(Object)
- void reset()
- Behavior getWrapped()
- String toString()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.IfElse
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- **static** IfElse create(Condition, Behavior, Behavior)
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.Loop
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()
- **static** Loop createWithCondition(Behavior, Condition)

### Class: net.citizensnpcs.api.ai.tree.Precondition
Type: Abstract Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- **static** Precondition wrappingPrecondition(Behavior, Condition)
- **static** Precondition runPrecondition(Condition)

### Class: net.citizensnpcs.api.ai.tree.RetryDecorator
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- **static** RetryDecorator unlimited(Behavior)
- void reset()
- BehaviorStatus run()
- **static** RetryDecorator retry(Behavior, int)

### Class: net.citizensnpcs.api.ai.tree.Selector
Type: Class
Extends: net.citizensnpcs.api.ai.tree.Composite

Methods:
- Behavior getNextBehavior()
- boolean retryChildren()
- void reset()
- String toString()
- BehaviorStatus run()
- Function getSelectionFunction()
- **static** Selector$Builder selecting(Behavior[])
- **static** Selector$Builder selecting(Collection)

### Class: net.citizensnpcs.api.ai.tree.Selector$Builder
Type: Class

Methods:
- Selector build()
- Selector$Builder retryChildren()
- Selector$Builder retryChildren(boolean)
- Selector$Builder selectionFunction(Function)

### Class: net.citizensnpcs.api.ai.tree.Selectors
Type: Class

Methods:
- **static** Selector$Builder prioritySelector(Comparator, Behavior[])
- **static** Selector$Builder prioritySelector(Comparator, Collection)
- **static** Function prioritySelectionFunction()

### Class: net.citizensnpcs.api.ai.tree.Selectors$PrioritySelection
Type: Class
Implements: java.util.function.Function

Methods:
- Behavior apply(List)
- Object apply(Object)

### Class: net.citizensnpcs.api.ai.tree.Sequence
Type: Class
Extends: net.citizensnpcs.api.ai.tree.Composite

Methods:
- **static** Sequence createSequence(Behavior[])
- **static** Sequence createSequence(Collection)
- **static** Sequence createRetryingSequence(Behavior[])
- **static** Sequence createRetryingSequence(Collection)
- boolean retryChildren()
- void reset()
- String toString()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.StatusMapper
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- **static** StatusMapper mapping(Behavior, Supplier)
- **static** Behavior singleUse(Behavior)
- boolean shouldExecute()
- void reset()
- BehaviorStatus run()

### Class: net.citizensnpcs.api.ai.tree.TimerDecorator
Type: Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

Methods:
- boolean shouldExecute()
- **static** TimerDecorator tickLimiter(Behavior, int)
- void reset()
- BehaviorStatus run()

## Package: net.citizensnpcs.api.astar

### Class: net.citizensnpcs.api.astar.AStarGoal
Type: Interface

Methods:
- float g(AStarNode, AStarNode)
- float h(AStarNode)
- float getInitialCost(AStarNode)
- boolean isFinished(AStarNode)

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
- **static** AStarMachine createWithDefaultStorage()
- AStarMachine$AStarState getStateFor(AStarGoal, AStarNode)
- Plan runFully(AStarGoal, AStarNode)
- Plan runFully(AStarGoal, AStarNode, int)
- Plan run(AStarMachine$AStarState)
- Plan run(AStarMachine$AStarState, int)
- **static** AStarMachine createWithStorage(Supplier)
- void setStorageSupplier(Supplier)

### Class: net.citizensnpcs.api.astar.AStarMachine$AStarState
Type: Class

Methods:
- boolean isEmpty()
- AStarNode getBestNode()

### Class: net.citizensnpcs.api.astar.AStarNode
Type: Abstract Class
Implements: java.lang.Comparable

Methods:
- Iterable getNeighbours()
- int hashCode()
- boolean equals(Object)
- int compareTo(AStarNode)
- int compareTo(Object)
- Plan buildPlan()

### Class: net.citizensnpcs.api.astar.SimpleAStarStorage
Type: Class
Implements: net.citizensnpcs.api.astar.AStarStorage

Methods:
- String toString()
- AStarNode getBestNode()
- boolean shouldExamine(AStarNode)
- void close(AStarNode)
- AStarNode removeBestNode()
- void open(AStarNode)

## Package: net.citizensnpcs.api.astar.pathfinder

### Class: net.citizensnpcs.api.astar.pathfinder.BlockExaminer
Type: Interface

Methods:
- BlockExaminer$PassableState isPassable(BlockSource, PathPoint)
- float getCost(BlockSource, PathPoint)

### Class: net.citizensnpcs.api.astar.pathfinder.NeighbourGeneratorBlockExaminer
Type: Interface
Implements: net.citizensnpcs.api.astar.pathfinder.BlockExaminer

Methods:
- List getNeighbours(BlockSource, PathPoint)

### Class: net.citizensnpcs.api.astar.pathfinder.PathPoint
Type: Interface

Methods:
- void setVector(Vector)
- PathPoint getParentPoint()
- Vector getGoal()
- Vector getVector()
- List getPathVectors()
- void setPathVectors(List)
- PathPoint createAtOffset(Vector)
- void addCallback(PathPoint$PathCallback)

### Class: net.citizensnpcs.api.astar.pathfinder.PathPoint$PathCallback
Type: Interface

Methods:
- void onReached(NPC, Block)
- void run(NPC, Block, List, int)

### Class: net.citizensnpcs.api.astar.pathfinder.AsyncChunkSnapshotBlockSource
Type: Class
Extends: net.citizensnpcs.api.astar.pathfinder.CachingChunkBlockSource

No public methods found

### Class: net.citizensnpcs.api.astar.pathfinder.BlockExaminer$PassableState
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BlockExaminer$PassableState valueOf(String)
- **static** BlockExaminer$PassableState[] values()

### Class: net.citizensnpcs.api.astar.pathfinder.BlockSource
Type: Abstract Class

Methods:
- World getWorld()
- BoundingBox getCollisionBox(int, int, int)
- BoundingBox getCollisionBox(Vector)
- Block getBlockAt(int, int, int)
- Block getBlockAt(Vector)
- Material getMaterialAt(int, int, int)
- Material getMaterialAt(Vector)

### Class: net.citizensnpcs.api.astar.pathfinder.CachingChunkBlockSource
Type: Abstract Class
Extends: net.citizensnpcs.api.astar.pathfinder.BlockSource

Methods:
- World getWorld()
- BoundingBox getCollisionBox(int, int, int)
- Material getMaterialAt(int, int, int)

### Class: net.citizensnpcs.api.astar.pathfinder.ChunkBlockSource
Type: Class
Extends: net.citizensnpcs.api.astar.pathfinder.CachingChunkBlockSource

No public methods found

### Class: net.citizensnpcs.api.astar.pathfinder.ChunkSnapshotBlockSource
Type: Class
Extends: net.citizensnpcs.api.astar.pathfinder.CachingChunkBlockSource

No public methods found

### Class: net.citizensnpcs.api.astar.pathfinder.DoorExaminer
Type: Class
Implements: net.citizensnpcs.api.astar.pathfinder.BlockExaminer

Methods:
- BlockExaminer$PassableState isPassable(BlockSource, PathPoint)
- float getCost(BlockSource, PathPoint)

### Class: net.citizensnpcs.api.astar.pathfinder.FlyingBlockExaminer
Type: Class
Implements: net.citizensnpcs.api.astar.pathfinder.NeighbourGeneratorBlockExaminer

Methods:
- List getNeighbours(BlockSource, PathPoint)
- BlockExaminer$PassableState isPassable(BlockSource, PathPoint)
- float getCost(BlockSource, PathPoint)

### Class: net.citizensnpcs.api.astar.pathfinder.MinecraftBlockExaminer
Type: Class
Implements: net.citizensnpcs.api.astar.pathfinder.BlockExaminer

Methods:
- **static** Location findRandomValidLocation(Location, int, int)
- **static** Location findRandomValidLocation(Location, int, int, Function)
- **static** Location findRandomValidLocation(Location, int, int, Function, Random)
- **static** boolean canStandOn(Block)
- **static** boolean canStandOn(Material)
- BlockExaminer$PassableState isPassable(BlockSource, PathPoint)
- **static** boolean isLiquid(Material[])
- **static** Location findValidLocationAbove(Location, int)
- **static** boolean isLiquidOrInLiquid(Block)
- **static** boolean isGate(Material)
- **static** Location findValidLocation(Location, int)
- **static** Location findValidLocation(Location, int, int)
- **static** Location findValidLocation(Location, int, int, Function)
- **static** boolean isDoor(Material)
- **static** boolean canStandIn(Block[])
- **static** boolean canStandIn(Material[])
- float getCost(BlockSource, PathPoint)

### Class: net.citizensnpcs.api.astar.pathfinder.Path
Type: Class
Implements: net.citizensnpcs.api.astar.Plan

Methods:
- Iterable getPath()
- void update(Agent)
- String toString()
- void run(NPC)
- List getBlocks(World)
- Vector getCurrentVector()
- boolean isFinalEntry()
- boolean isComplete()

### Class: net.citizensnpcs.api.astar.pathfinder.SwimmingExaminer
Type: Class
Implements: net.citizensnpcs.api.astar.pathfinder.BlockExaminer

Methods:
- void setCanSwimInLava(boolean)
- BlockExaminer$PassableState isPassable(BlockSource, PathPoint)
- **static** boolean isWaterMob(Entity)
- boolean canSwimInLava()
- float getCost(BlockSource, PathPoint)

### Class: net.citizensnpcs.api.astar.pathfinder.VectorGoal
Type: Class
Implements: net.citizensnpcs.api.astar.AStarGoal

Methods:
- Vector getGoalVector()
- float g(VectorNode, VectorNode)
- float g(AStarNode, AStarNode)
- float h(VectorNode)
- float h(AStarNode)
- float getInitialCost(VectorNode)
- float getInitialCost(AStarNode)
- boolean isFinished(VectorNode)
- boolean isFinished(AStarNode)

### Class: net.citizensnpcs.api.astar.pathfinder.VectorNode
Type: Class
Extends: net.citizensnpcs.api.astar.AStarNode
Implements: net.citizensnpcs.api.astar.pathfinder.PathPoint

Methods:
- void setVector(Vector)
- float distance(VectorNode)
- Vector getVector()
- Plan buildPlan()
- void addCallback(PathPoint$PathCallback)
- Iterable getNeighbours()
- List getNeighbours(BlockSource, PathPoint)
- List getNeighbours(BlockSource, PathPoint, boolean)
- PathPoint getParentPoint()
- int hashCode()
- Vector getGoal()
- float heuristicDistance(Vector)
- boolean equals(Object)
- List getPathVectors()
- void setPathVectors(List)
- VectorNode createAtOffset(Vector)
- PathPoint createAtOffset(Vector)

## Package: net.citizensnpcs.api.command

### Class: net.citizensnpcs.api.command.Arg
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class completionsProvider()
- Class validator()
- String[] completions()
- int value()
- String defValue()

### Class: net.citizensnpcs.api.command.Arg$CompletionsProvider
Type: Interface

Methods:
- Collection getCompletions(CommandContext, CommandSender, NPC)

### Class: net.citizensnpcs.api.command.Arg$FlagValidator
Type: Interface

Methods:
- Object validate(CommandContext, CommandSender, NPC, String) throws CommandException

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
- Class getAnnotationClass()
- void process(CommandSender, CommandContext, Annotation, Object[]) throws CommandException

### Class: net.citizensnpcs.api.command.Flag
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class completionsProvider()
- Class validator()
- String[] completions()
- String permission()
- String[] value()
- String defValue()

### Class: net.citizensnpcs.api.command.Requirements
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- EntityType[] types()
- Class[] traits()
- boolean ownership()
- boolean livingEntity()
- EntityType[] excludedTypes()
- boolean selected()

### Class: net.citizensnpcs.api.command.Arg$CompletionsProvider$Identity
Type: Class
Implements: net.citizensnpcs.api.command.Arg$CompletionsProvider

Methods:
- Collection getCompletions(CommandContext, CommandSender, NPC)

### Class: net.citizensnpcs.api.command.Arg$CompletionsProvider$OptionalKeyedCompletions
Type: Class
Implements: net.citizensnpcs.api.command.Arg$CompletionsProvider

Methods:
- Collection getCompletions(CommandContext, CommandSender, NPC)

### Class: net.citizensnpcs.api.command.Arg$FlagValidator$Identity
Type: Class
Implements: net.citizensnpcs.api.command.Arg$FlagValidator

Methods:
- String validate(CommandContext, CommandSender, NPC, String) throws CommandException
- Object validate(CommandContext, CommandSender, NPC, String) throws CommandException

### Class: net.citizensnpcs.api.command.Arg$FloatArrayFlagValidator
Type: Class
Implements: net.citizensnpcs.api.command.Arg$FlagValidator

Methods:
- float[] validate(CommandContext, CommandSender, NPC, String) throws CommandException
- Object validate(CommandContext, CommandSender, NPC, String) throws CommandException

### Class: net.citizensnpcs.api.command.CommandContext
Type: Class

Methods:
- **static** Vector parseVector(String)
- String getJoinedStrings(int)
- String getJoinedStrings(int, char)
- Location getSenderTargetBlockLocation() throws CommandException
- double getDouble(int) throws NumberFormatException
- double getDouble(int, double) throws NumberFormatException
- int getInteger(int) throws NumberFormatException
- int getInteger(int, int) throws NumberFormatException
- String[] getPaddedSlice(int, int)
- boolean hasAnyValueFlag(String[])
- String getRawCommand()
- **static** Quaternionf parseQuaternion(String)
- int getFlagInteger(String) throws NumberFormatException
- int getFlagInteger(String, int) throws NumberFormatException
- boolean hasValueFlag(String)
- String getFlag(String)
- String getFlag(String, String)
- double getFlagDouble(String) throws NumberFormatException
- double getFlagDouble(String, double) throws NumberFormatException
- EulerAngle parseEulerAngle(String)
- boolean hasFlag(char)
- int argsLength()
- String getCommand()
- int length()
- **static** Location parseLocation(Location, String) throws CommandException
- Map getValueFlags()
- String getString(int)
- String getString(int, String)
- boolean matches(String)
- boolean hasAnyFlags()
- int parseTicks(String)
- int getTicks(int) throws NumberFormatException
- Location getSenderLocation() throws CommandException
- int getFlagTicks(String) throws NumberFormatException
- int getFlagTicks(String, int) throws NumberFormatException
- String[] getSlice(int)
- Set getFlags()

### Class: net.citizensnpcs.api.command.CommandManager
Type: Class
Implements: org.bukkit.command.TabCompleter

Methods:
- void registerTabCompletion(JavaPlugin)
- void setTranslationPrefixProvider(Function)
- void setDefaultDurationUnits(TimeUnit)
- CommandManager$CommandInfo getCommand(String[])
- String getClosestCommandModifier(String, String)
- boolean hasCommand(Command, String[])
- boolean hasCommand(String[])
- List onTabComplete(CommandSender, Command, String, String[])
- void setInjector(Injector)
- void registerAnnotationProcessor(CommandAnnotationProcessor)
- void execute(Command, String[], CommandSender, Object[]) throws CommandException
- List getCommands(String)
- void register(Class)
- boolean executeSafe(Command, String[], CommandSender, Object[])

### Class: net.citizensnpcs.api.command.CommandManager$CommandInfo
Type: Class

Methods:
- Collection valueFlags()
- Collection getArgTabCompletions(CommandContext, CommandSender, int)
- void addFlagAnnotation(int, Class, Flag)
- Command getCommandAnnotation()
- int hashCode()
- boolean equals(Object)
- void addArgAnnotation(int, Class, Arg)
- Collection getFlagTabCompletions(CommandContext, CommandSender, String)

### Class: net.citizensnpcs.api.command.CommandMessages
Type: Class

No public methods found

### Class: net.citizensnpcs.api.command.Injector
Type: Class

Methods:
- Object getInstance(Class)

### Class: net.citizensnpcs.api.command.RequirementsProcessor
Type: Class
Implements: net.citizensnpcs.api.command.CommandAnnotationProcessor

Methods:
- Class getAnnotationClass()
- void process(CommandSender, CommandContext, Annotation, Object[]) throws CommandException

## Package: net.citizensnpcs.api.command.exception

### Class: net.citizensnpcs.api.command.exception.CommandException
Type: Class
Extends: java.lang.Exception

Methods:
- Throwable fillInStackTrace()

### Class: net.citizensnpcs.api.command.exception.CommandUsageException
Type: Class
Extends: net.citizensnpcs.api.command.exception.CommandException

Methods:
- void setUsage(String)
- String getUsage()

### Class: net.citizensnpcs.api.command.exception.NoPermissionsException
Type: Class
Extends: net.citizensnpcs.api.command.exception.CommandException

No public methods found

### Class: net.citizensnpcs.api.command.exception.RequirementMissingException
Type: Class
Extends: net.citizensnpcs.api.command.exception.CommandException

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

No public methods found

## Package: net.citizensnpcs.api.event

### Class: net.citizensnpcs.api.event.CitizensDeserialiseMetaEvent
Type: Class
Extends: org.bukkit.event.Event

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

Methods:
- NPC getSelected()
- void setSelected(NPC)
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

Methods:
- DataKey getKey()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ItemMeta getMeta()

### Class: net.citizensnpcs.api.event.CommandSenderCloneNPCEvent
Type: Class
Extends: net.citizensnpcs.api.event.CommandSenderCreateNPCEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- NPC getOriginal()

### Class: net.citizensnpcs.api.event.CommandSenderCreateNPCEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCCreateEvent
Implements: org.bukkit.event.Cancellable

Methods:
- String getCancelReason()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setCancelReason(String)
- CommandSender getCreator()

### Class: net.citizensnpcs.api.event.DespawnReason
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DespawnReason valueOf(String)
- **static** DespawnReason[] values()

### Class: net.citizensnpcs.api.event.EntityTargetNPCEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- EntityTargetEvent$TargetReason getReason()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getEntity()

### Class: net.citizensnpcs.api.event.NPCAddTraitEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCTraitEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCClickEvent
Type: Abstract Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Player getClicker()

### Class: net.citizensnpcs.api.event.NPCCloneEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- NPC getClone()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCCollisionEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- Entity getCollidedWith()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCCombustByBlockEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCCombustEvent

Methods:
- Block getCombuster()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCCombustByEntityEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCCombustEvent

Methods:
- Entity getCombuster()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCCombustEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- EntityCombustEvent getHandle()

### Class: net.citizensnpcs.api.event.NPCCommandDispatchEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCCreateEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCDamageByBlockEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCDamageEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Block getDamager()

### Class: net.citizensnpcs.api.event.NPCDamageByEntityEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCDamageEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getDamager()

### Class: net.citizensnpcs.api.event.NPCDamageEntityEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCDamageEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getDamaged()

### Class: net.citizensnpcs.api.event.NPCDamageEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- EntityDamageEvent getEvent()
- double getDamage()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setDamage(double)
- void setDamage(int)
- EntityDamageEvent$DamageCause getCause()

### Class: net.citizensnpcs.api.event.NPCDeathEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- EntityDeathEvent getEvent()
- int getDroppedExp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setDroppedExp(int)
- List getDrops()

### Class: net.citizensnpcs.api.event.NPCDespawnEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
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

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getStrength()
- Entity getKnockingBackEntity()
- Vector getKnockbackVector()

### Class: net.citizensnpcs.api.event.NPCLeftClickEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCClickEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCLinkToPlayerEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCLookCloseChangeTargetEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- Player getPreviousTarget()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setNewTarget(Player)
- Player getNewTarget()

### Class: net.citizensnpcs.api.event.NPCMoveEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean hasChangedBlock()
- boolean isCancelled()
- NPC getNPC()
- void setCancelled(boolean)
- HandlerList getHandlers()
- void setFrom(Location)
- **static** HandlerList getHandlerList()
- Location getTo()
- boolean hasChangedRotation()
- boolean hasChangedPosition()
- boolean hasExplicitlyChangedBlock()
- boolean hasExplicitlyChangedPosition()
- void setTo(Location)
- String toString()
- Location getFrom()

### Class: net.citizensnpcs.api.event.NPCOpenDoorEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

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

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCPushEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Vector getCollisionVector()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getPushedBy()

### Class: net.citizensnpcs.api.event.NPCRemoveByCommandSenderEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCRemoveEvent

Methods:
- CommandSender getSource()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCRemoveEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCRemoveTraitEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCTraitEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCRenameEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- String getNewName()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setNewName(String)
- String getOldName()

### Class: net.citizensnpcs.api.event.NPCRightClickEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCClickEvent

Methods:
- boolean isDelayedCancellation()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setDelayedCancellation(boolean)

### Class: net.citizensnpcs.api.event.NPCSeenByPlayerEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCSelectEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- CommandSender getSelector()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCSpawnEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Location getLocation()
- void setCancelled(boolean)
- SpawnReason getReason()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCTeleportEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Location getTo()
- Location getFrom()

### Class: net.citizensnpcs.api.event.NPCTraitCommandAttachEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- CommandSender getCommandSender()
- Class getTraitClass()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCTraitCommandDetachEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- CommandSender getCommandSender()
- Class getTraitClass()
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

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.citizensnpcs.api.event.NPCVehicleDamageEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent
Implements: org.bukkit.event.Cancellable

Methods:
- VehicleDamageEvent getEvent()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Entity getDamager()

### Class: net.citizensnpcs.api.event.PlayerCloneNPCEvent
Type: Class
Extends: net.citizensnpcs.api.event.PlayerCreateNPCEvent
Implements: org.bukkit.event.Cancellable

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

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Player getCreator()
- CommandSender getCreator()

### Class: net.citizensnpcs.api.event.SpawnReason
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** SpawnReason valueOf(String)
- **static** SpawnReason[] values()

## Package: net.citizensnpcs.api.exception

### Class: net.citizensnpcs.api.exception.NPCLoadException
Type: Class
Extends: java.lang.Exception

No public methods found

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
- Class value()

### Class: net.citizensnpcs.api.gui.MenuTransitions
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- MenuTransition[] value()

### Class: net.citizensnpcs.api.gui.CitizensInventoryClickEvent
Type: Class
Extends: org.bukkit.event.inventory.InventoryClickEvent

Methods:
- ItemStack getResultItem()
- ItemStack getCursor()
- ItemStack getCurrentItem()
- boolean isCancelled()
- ItemStack getResultItemNonNull()
- void setResult(Event$Result)
- void setCancelled(boolean)
- void setCurrentItem(ItemStack)
- Event$Result getResult()
- void setCurrentItemDescription(String)
- void setCursor(ItemStack)
- ItemStack getCursorNonNull()
- ItemStack getCurrentItemNonNull()

### Class: net.citizensnpcs.api.gui.InputMenus
Type: Class

Methods:
- **static** InputMenus$BooleanSlotHandler toggler(Consumer, boolean)
- **static** InventoryMenuPage toggle(String, Consumer, InputMenus$Choice[])
- **static** InventoryMenuPage filteredStringSetter(String, Supplier, Function)
- **static** InventoryMenuPage filteredStringSetter(Supplier, Function)
- **static** InventoryMenuPage picker(String, Consumer, InputMenus$Choice[])
- **static** InputMenus$BooleanSlotHandler clickToggle(Function, boolean)
- **static** InventoryMenuPage stringSetter(String, Supplier, Consumer)
- **static** InventoryMenuPage stringSetter(Supplier, Consumer)
- **static** void runChatStringSetter(InventoryMenu, InventoryClickEvent, String, Consumer)

### Class: net.citizensnpcs.api.gui.InputMenus$BooleanSlotHandler
Type: Class
Implements: java.util.function.Consumer

Methods:
- void accept(CitizensInventoryClickEvent)
- void accept(Object)

### Class: net.citizensnpcs.api.gui.InputMenus$Choice
Type: Class

Methods:
- Object getValue()
- ItemStack createDisplayItem()
- void setActive(boolean)
- **static** InputMenus$Choice of(Object, Material, String, boolean)
- Material getDisplayMaterial()
- boolean isActive()
- String getDescription()

### Class: net.citizensnpcs.api.gui.InputMenus$Choice$Type
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** InputMenus$Choice$Type valueOf(String)
- **static** InputMenus$Choice$Type[] values()

### Class: net.citizensnpcs.api.gui.InventoryMenu
Type: Class
Implements: org.bukkit.event.Listener, java.lang.Runnable

Methods:
- **static** InventoryMenu createWithContext(Class, Map)
- void transitionBack()
- **static** InventoryMenu createSelfRegistered(Class)
- **static** InventoryMenu createSelfRegistered(InventoryMenuPage)
- **static** InventoryMenu create(Class)
- **static** InventoryMenu create(InventoryMenuPage)
- void run()
- void onInventoryDrag(InventoryDragEvent)
- void present(HumanEntity)
- void close()
- void close(HumanEntity)
- void transition(Class)
- void transition(Class, Map)
- void transition(InventoryMenuPage)
- void transition(InventoryMenuPage, Map)
- void onInventoryClose(InventoryCloseEvent)
- void onInventoryClick(InventoryClickEvent)

### Class: net.citizensnpcs.api.gui.InventoryMenuPage
Type: Abstract Class
Implements: java.lang.Runnable

Methods:
- void onClose(HumanEntity)
- void onClick(InventoryMenuSlot, InventoryClickEvent)
- void run()
- Inventory createInventory(String)
- void initialise(MenuContext)

### Class: net.citizensnpcs.api.gui.InventoryMenuPattern
Type: Class

Methods:
- List getTransitions()
- List getSlots()
- String getPattern()

### Class: net.citizensnpcs.api.gui.InventoryMenuSlot
Type: Class

Methods:
- Collection getFilter()
- ItemStack getCurrentItem()
- void setClickHandler(Consumer)
- void addClickHandler(Consumer)
- int hashCode()
- boolean equals(Object)
- void clear()
- void setItemStack(ItemStack)
- void setItemStack(ItemStack, String)
- void setItemStack(ItemStack, String, String)
- void setDescription(String)
- List getClickHandlers()
- void setFilter(Collection)

### Class: net.citizensnpcs.api.gui.InventoryMenuTransition
Type: Class

Methods:
- InventoryMenuSlot getSlot()

### Class: net.citizensnpcs.api.gui.MenuContext
Type: Class

Methods:
- InventoryMenuSlot getSlot(int)
- String getTitle()
- Map data()
- InventoryMenu getMenu()
- void setTitle(String)
- Inventory getInventory()
- void clearSlots()

### Class: net.citizensnpcs.api.gui.PercentageSlotHandler
Type: Class
Implements: java.util.function.Consumer

Methods:
- void accept(CitizensInventoryClickEvent)
- void accept(Object)

## Package: net.citizensnpcs.api.hpastar

### Class: net.citizensnpcs.api.hpastar.AStarSolution
Type: Class

Methods:
- Collection convertToVectors()

### Class: net.citizensnpcs.api.hpastar.ClusterNode
Type: Class
Extends: net.citizensnpcs.api.hpastar.ReversableAStarNode

Methods:
- int hashCode()
- boolean equals(Object)

### Class: net.citizensnpcs.api.hpastar.Direction
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Direction valueOf(String)
- **static** Direction[] values()

### Class: net.citizensnpcs.api.hpastar.HPACluster
Type: Class

Methods:
- void buildFrom(List)
- boolean hasWalkableNodes()
- boolean contains(HPACluster)
- void connectIntra()
- void insert(HPAGraphNode)
- String toString()
- void remove(HPAGraphNode[])
- void connect(HPACluster, Direction)

### Class: net.citizensnpcs.api.hpastar.HPAEntrance
Type: Class

No public methods found

### Class: net.citizensnpcs.api.hpastar.HPAGraph
Type: Class

Methods:
- boolean walkable(int, int, int)
- Plan findPath(Location, Location)
- void addClusters(int, int)
- void addClustersAtDepth(int, List)

### Class: net.citizensnpcs.api.hpastar.HPAGraphAStarNode
Type: Class
Extends: net.citizensnpcs.api.hpastar.ReversableAStarNode

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: net.citizensnpcs.api.hpastar.HPAGraphEdge
Type: Class

No public methods found

### Class: net.citizensnpcs.api.hpastar.HPAGraphEdge$EdgeType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** HPAGraphEdge$EdgeType valueOf(String)
- **static** HPAGraphEdge$EdgeType[] values()

### Class: net.citizensnpcs.api.hpastar.HPAGraphNode
Type: Class

Methods:
- double distance(HPAGraphNode)
- int hashCode()
- boolean equals(Object)
- String toString()
- List getEdges(int)
- void connect(int, HPAGraphNode, HPAGraphEdge$EdgeType, float)

### Class: net.citizensnpcs.api.hpastar.ReversableAStarNode
Type: Class
Implements: java.lang.Comparable

Methods:
- List reconstructSolution()
- int compareTo(ReversableAStarNode)
- int compareTo(Object)

## Package: net.citizensnpcs.api.npc

### Class: net.citizensnpcs.api.npc.MetadataStore
Type: Interface

Methods:
- void set(NPC$Metadata, Object)
- void set(String, Object)
- void saveTo(DataKey)
- int size()
- Object get(NPC$Metadata)
- Object get(NPC$Metadata, Object)
- Object get(String)
- Object get(String, Object)
- MetadataStore clone()
- void setPersistent(NPC$Metadata, Object)
- void setPersistent(String, Object)
- void loadFrom(DataKey)
- boolean has(NPC$Metadata)
- boolean has(String)
- void remove(NPC$Metadata)
- void remove(String)

### Class: net.citizensnpcs.api.npc.NPC
Type: Interface
Implements: net.citizensnpcs.api.astar.Agent, java.lang.Cloneable

Methods:
- boolean useMinecraftAI()
- String getName()
- void addRunnable(Runnable)
- MetadataStore data()
- void setUseMinecraftAI(boolean)
- boolean isFlyable()
- void removeTrait(Class)
- UUID getUniqueId()
- GoalController getDefaultGoalController()
- Optional getTraitOptional(Class)
- Supplier getItemProvider()
- String getRawName()
- void setProtected(boolean)
- void setFlyable(boolean)
- boolean shouldRemoveFromTabList()
- boolean isUpdating(NPC$NPCUpdate)
- void setAlwaysUseNameHologram(boolean)
- String getFullName()
- boolean requiresNameHologram()
- void scheduleUpdate(NPC$NPCUpdate)
- void destroy()
- void destroy(CommandSender)
- void faceLocation(Location)
- Trait getTraitNullable(Class)
- Location getStoredLocation()
- void setName(String)
- void setMoveDestination(Location)
- Trait getOrAddTrait(Class)
- UUID getMinecraftUniqueId()
- void teleport(Location, PlayerTeleportEvent$TeleportCause)
- void save(DataKey)
- int getId()
- boolean despawn()
- boolean despawn(DespawnReason)
- boolean isPushableByFluids()
- boolean isProtected()
- void load(DataKey)
- void addTrait(Class)
- void addTrait(Trait)
- void setSneaking(boolean)
- boolean isSpawned()
- NPC copy()
- boolean hasTrait(Class)
- boolean shouldRemoveFromPlayerList()
- Iterable getTraits()
- void setBukkitEntityType(EntityType)
- BlockBreaker getBlockBreaker(Block, BlockBreaker$BlockBreakerConfiguration)
- Entity getEntity()
- Trait getTrait(Class)
- Navigator getNavigator()
- void setItemProvider(Supplier)
- boolean spawn(Location)
- boolean spawn(Location, SpawnReason)
- boolean spawn(Location, SpawnReason, Consumer)
- NPCRegistry getOwningRegistry()
- NPC clone()
- SpeechController getDefaultSpeechController()
- boolean isHiddenFrom(Player)

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
- void clearTraitData(Iterable)
- void clearData(NPC)

### Class: net.citizensnpcs.api.npc.NPCRegistry
Type: Interface
Implements: java.lang.Iterable

Methods:
- NPC createNPCUsingItem(EntityType, String, ItemStack)
- void deregisterAll()
- Iterable sorted()
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
- void setName(String)
- Trait getOrAddTrait(Class)
- String getName()
- void addRunnable(Runnable)
- MetadataStore data()
- UUID getMinecraftUniqueId()
- void teleport(Location, PlayerTeleportEvent$TeleportCause)
- void save(DataKey)
- void update()
- int getId()
- void removeTrait(Class)
- UUID getUniqueId()
- GoalController getDefaultGoalController()
- Supplier getItemProvider()
- void load(DataKey)
- int hashCode()
- String getRawName()
- void addTrait(Class)
- void addTrait(Trait)
- NPC copy()
- boolean hasTrait(Class)
- String getFullName()
- boolean requiresNameHologram()
- Iterable getTraits()
- void destroy()
- Trait getTrait(Class)
- void setItemProvider(Supplier)
- NPCRegistry getOwningRegistry()
- boolean equals(Object)
- NPC clone()
- Object clone() throws CloneNotSupportedException
- SpeechController getDefaultSpeechController()
- Trait getTraitNullable(Class)

### Class: net.citizensnpcs.api.npc.BlockBreaker
Type: Abstract Class
Extends: net.citizensnpcs.api.ai.tree.BehaviorGoalAdapter

No public methods found

### Class: net.citizensnpcs.api.npc.BlockBreaker$BlockBreakerConfiguration
Type: Class

Methods:
- ItemStack item()
- BlockBreaker$BlockBreakerConfiguration item(ItemStack)
- BiConsumer blockBreaker()
- void blockBreaker(BiConsumer)
- float blockStrengthModifier()
- BlockBreaker$BlockBreakerConfiguration blockStrengthModifier(float)
- Runnable callback()
- BlockBreaker$BlockBreakerConfiguration callback(Runnable)
- double radius()
- BlockBreaker$BlockBreakerConfiguration radius(double)

### Class: net.citizensnpcs.api.npc.MemoryNPCDataStore
Type: Class
Implements: net.citizensnpcs.api.npc.NPCDataStore

Methods:
- int createUniqueNPCId(NPCRegistry)
- void reloadFromSource()
- void storeAll(NPCRegistry)
- void saveToDisk()
- void loadInto(NPCRegistry)
- void store(NPC)
- void saveToDiskImmediate()
- void clearTraitData(Iterable)
- void clearData(NPC)

### Class: net.citizensnpcs.api.npc.NPC$Metadata
Type: Enum
Extends: java.lang.Enum

Methods:
- String getKey()
- **static** NPC$Metadata byKey(String)
- TypeToken getType()
- boolean accepts(Class)
- **static** NPC$Metadata valueOf(String)
- **static** NPC$Metadata[] values()
- **static** NPC$Metadata byName(String)

### Class: net.citizensnpcs.api.npc.NPC$NPCUpdate
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** NPC$NPCUpdate valueOf(String)
- **static** NPC$NPCUpdate[] values()

### Class: net.citizensnpcs.api.npc.SimpleMetadataStore
Type: Class
Implements: net.citizensnpcs.api.npc.MetadataStore

Methods:
- void set(NPC$Metadata, Object)
- void set(String, Object)
- void saveTo(DataKey)
- int size()
- Object get(NPC$Metadata)
- Object get(NPC$Metadata, Object)
- Object get(String)
- Object get(String, Object)
- MetadataStore clone()
- Object clone() throws CloneNotSupportedException
- void setPersistent(NPC$Metadata, Object)
- void setPersistent(String, Object)
- void loadFrom(DataKey)
- boolean has(NPC$Metadata)
- boolean has(String)
- void remove(NPC$Metadata)
- void remove(String)

### Class: net.citizensnpcs.api.npc.SimpleNPCDataStore
Type: Class
Implements: net.citizensnpcs.api.npc.NPCDataStore

Methods:
- int createUniqueNPCId(NPCRegistry)
- void reloadFromSource()
- **static** NPCDataStore create(Storage)
- void storeAll(NPCRegistry)
- void saveToDisk()
- void loadInto(NPCRegistry)
- void store(NPC)
- void saveToDiskImmediate()
- void clearTraitData(Iterable)
- void clearData(NPC)

## Package: net.citizensnpcs.api.npc.templates

### Class: net.citizensnpcs.api.npc.templates.CommandEventAction
Type: Class
Implements: java.util.function.Consumer

Methods:
- void accept(NPC)
- void accept(Object)

### Class: net.citizensnpcs.api.npc.templates.CommandListExecutor
Type: Class
Implements: java.util.function.Consumer

Methods:
- void accept(NPC)
- void accept(Object)

### Class: net.citizensnpcs.api.npc.templates.Template
Type: Class

Methods:
- NamespacedKey getKey()
- **static** Template load(TemplateWorkspace, NamespacedKey, DataKey)
- void apply(NPC)

### Class: net.citizensnpcs.api.npc.templates.TemplateRegistry
Type: Class

Methods:
- void generateTemplateFromNPC(NamespacedKey, NPC)
- Collection getAllTemplates()
- Template getTemplateByKey(NamespacedKey)
- boolean hasNamespace(String)
- Collection getTemplates(String)

### Class: net.citizensnpcs.api.npc.templates.TemplateWorkspace
Type: Class

Methods:
- File getFile(String)

### Class: net.citizensnpcs.api.npc.templates.YamlReplacementAction
Type: Class
Implements: java.util.function.Consumer

Methods:
- void accept(NPC)
- void accept(Object)

## Package: net.citizensnpcs.api.persistence

### Class: net.citizensnpcs.api.persistence.DelegatePersistence
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class value()

### Class: net.citizensnpcs.api.persistence.Persist
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class collectionType()
- Class valueType()
- String namespace()
- boolean reify()
- Class keyType()
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
- void save(Object, DataKey)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.ComponentPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(Component, DataKey)
- void save(Object, DataKey)
- Component create(DataKey)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.EulerAnglePersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(EulerAngle, DataKey)
- void save(Object, DataKey)
- EulerAngle create(DataKey)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.ItemStackPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(ItemStack, DataKey)
- void save(Object, DataKey)
- ItemStack create(DataKey)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.LocationPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(Location, DataKey)
- void save(Object, DataKey)
- Location create(DataKey)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.LocationPersister$LazilyLoadedLocation
Type: Class
Extends: org.bukkit.Location

Methods:
- World getWorld()
- UUID getWorldUUID()

### Class: net.citizensnpcs.api.persistence.NamespacedKeyPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(NamespacedKey, DataKey)
- void save(Object, DataKey)
- NamespacedKey create(DataKey)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.PersistenceLoader
Type: Class

Methods:
- **static** PersisterRegistry createRegistry(Class)
- **static** void registerPersistDelegate(Class, Class)
- **static** Object load(Class, DataKey)
- **static** Object load(Object, DataKey)
- **static** void save(Object, DataKey)

### Class: net.citizensnpcs.api.persistence.PersisterRegistry
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- Iterable registeredTypes()
- void save(Object, DataKey)
- Object create(DataKey)
- void register(String, Class)

### Class: net.citizensnpcs.api.persistence.PotionEffectPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(PotionEffect, DataKey)
- void save(Object, DataKey)
- PotionEffect create(DataKey)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.QuaternionfPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(Quaternionfc, DataKey)
- void save(Object, DataKey)
- Quaternionfc create(DataKey)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.UUIDPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(UUID, DataKey)
- void save(Object, DataKey)
- UUID create(DataKey)
- Object create(DataKey)

### Class: net.citizensnpcs.api.persistence.VectorPersister
Type: Class
Implements: net.citizensnpcs.api.persistence.Persister

Methods:
- void save(Vector, DataKey)
- void save(Object, DataKey)
- Vector create(DataKey)
- Object create(DataKey)

## Package: net.citizensnpcs.api.trait

### Class: net.citizensnpcs.api.trait.TraitEventHandler
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- EventHandler value()
- Class processor()

### Class: net.citizensnpcs.api.trait.TraitEventHandler$NPCEventExtractor
Type: Interface
Implements: java.util.function.Function

No public methods found

### Class: net.citizensnpcs.api.trait.TraitFactory
Type: Interface

Methods:
- void registerTrait(TraitInfo)
- Class getTraitClass(String)
- Collection getRegisteredTraits()
- void deregisterTrait(TraitInfo)
- Trait getTrait(Class)
- Trait getTrait(String)
- void addDefaultTraits(NPC)

### Class: net.citizensnpcs.api.trait.TraitName
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: net.citizensnpcs.api.trait.Trait
Type: Abstract Class
Implements: org.bukkit.event.Listener, java.lang.Runnable

Methods:
- void onSpawn()
- NPC getNPC()
- String getName()
- void onPreSpawn()
- void load(DataKey) throws NPCLoadException
- void onAttach()
- void save(DataKey)
- void run()
- boolean isRunImplemented()
- void onRemove()
- void onRemove(RemoveReason)
- void onDespawn()
- void onDespawn(DespawnReason)
- void onCopy()
- void linkToNPC(NPC)

### Class: net.citizensnpcs.api.trait.TraitInfo
Type: Class

Methods:
- Trait tryCreateInstance()
- TraitInfo optInToStats()
- String getTraitName()
- Class getTraitClass()
- boolean isDefaultTrait()
- void checkValid()
- **static** TraitInfo create(Class)
- TraitInfo withSupplier(Supplier)
- TraitInfo withName(String)
- TraitInfo asDefaultTrait()
- boolean shouldTrackStats()
- void registerListener(Plugin)

## Package: net.citizensnpcs.api.trait.trait

### Class: net.citizensnpcs.api.trait.trait.Equipment
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- void onSpawn()
- Map getEquipmentBySlot()
- void set(Equipment$EquipmentSlot, ItemStack)
- void load(DataKey) throws NPCLoadException
- void setCosmetic(Equipment$EquipmentSlot, ItemStack)
- void onAttach()
- ItemStack get(Equipment$EquipmentSlot)
- void save(DataKey)
- void run()
- ItemStack getCosmetic(Equipment$EquipmentSlot)
- ItemStack[] getCosmeticEquipment()
- ItemStack[] getEquipment()

### Class: net.citizensnpcs.api.trait.trait.Equipment$EquipmentSlot
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Equipment$EquipmentSlot valueOf(String)
- EquipmentSlot toBukkit()
- **static** Equipment$EquipmentSlot[] values()

### Class: net.citizensnpcs.api.trait.trait.Equipment$NPCChangeEquipmentEvent
Type: Class
Extends: net.citizensnpcs.api.event.NPCEvent

Methods:
- Equipment$EquipmentSlot getSlot()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ItemStack getStack()

### Class: net.citizensnpcs.api.trait.trait.Inventory
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- void openInventory(Player)
- void onSpawn()
- void load(DataKey) throws NPCLoadException
- void save(DataKey)
- ItemStack[] getContents()
- String toString()
- void run()
- void onDespawn()
- void setContents(ItemStack[])
- void setItem(int, ItemStack)
- Inventory getInventoryView()

### Class: net.citizensnpcs.api.trait.trait.MobType
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- void onSpawn()
- void load(DataKey)
- EntityType getType()
- void save(DataKey)
- String toString()
- void setType(EntityType)

### Class: net.citizensnpcs.api.trait.trait.Owner
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- boolean isOwnedBy(CommandSender)
- boolean isOwnedBy(String)
- boolean isOwnedBy(UUID)
- UUID getOwnerId()
- String toString()
- String getOwner()
- void setOwner(CommandSender)
- void setOwner(String)
- void setOwner(String, UUID)
- void setOwner(UUID)

### Class: net.citizensnpcs.api.trait.trait.PlayerFilter
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- void setDenylist()
- void addPermission(String)
- void setApplyRange(double)
- void run()
- void onDespawn()
- void removePlayer(UUID)
- Set getPlayerUUIDs()
- void addPlayer(UUID)
- boolean affectsGroup(String)
- boolean onSeenByPlayer(Player)
- void setPlayerFilter(Function)
- void setAllowlist()
- void recalculate()
- void addGroup(String)
- Set getGroups()
- void setPlayers(Set)
- boolean isDenylist()
- Set getPermissions()
- void clear()
- boolean isAllowlist()
- boolean affectsPlayer(UUID)
- void removePermission(String)
- boolean isHidden(Player)
- double getApplyRange()
- void addChildNPC(NPC)
- void removeGroup(String)

### Class: net.citizensnpcs.api.trait.trait.PlayerFilter$Mode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PlayerFilter$Mode valueOf(String)
- **static** PlayerFilter$Mode[] values()

### Class: net.citizensnpcs.api.trait.trait.Spawned
Type: Class
Extends: net.citizensnpcs.api.trait.Trait

Methods:
- void setSpawned(boolean)
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

### Class: net.citizensnpcs.api.util.BoundingBox
Type: Class

Methods:
- BoundingBox add(int, int, int)
- BoundingBox add(Location)
- EntityDim toDimensions()
- BoundingBox mul(double)
- BoundingBox mul(double, double, double)
- int hashCode()
- BoundingBox toBukkit()
- boolean equals(Object)
- BoundingBox clone()
- Object clone() throws CloneNotSupportedException
- String toString()
- **static** BoundingBox convert(BoundingBox)

### Class: net.citizensnpcs.api.util.DataKey
Type: Abstract Class

Methods:
- void setRaw(String, Object)
- double getDouble(String)
- double getDouble(String, double)
- Map getValuesDeep()
- String getString(String)
- String getString(String, String)
- DataKey getFromRoot(String)
- DataKey getRelative(int)
- DataKey getRelative(String)
- Object getRawUnchecked(String)
- void setInt(String, int)
- void setDouble(String, double)
- long getLong(String)
- long getLong(String, long)
- Iterable getIntegerSubKeys()
- int getInt(String)
- int getInt(String, int)
- void setString(String, String)
- void setLong(String, long)
- void removeKey(String)
- boolean keyExists()
- boolean keyExists(String)
- int hashCode()
- Iterable getSubKeys()
- boolean equals(Object)
- String name()
- String getPath()
- Object getRaw(String)
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- void setBoolean(String, boolean)

### Class: net.citizensnpcs.api.util.EntityDim
Type: Class

Methods:
- EntityDim mul(float)
- int hashCode()
- boolean equals(Object)
- EntityDim clone()
- Object clone() throws CloneNotSupportedException
- **static** EntityDim from(BoundingBox)
- **static** EntityDim from(Entity)
- String toString()

### Class: net.citizensnpcs.api.util.EyeHeightBoundingBox
Type: Class
Extends: net.citizensnpcs.api.util.BoundingBox

Methods:
- Vector3f getCenter()

### Class: net.citizensnpcs.api.util.ItemStorage
Type: Class

Methods:
- **static** void saveItem(DataKey, ItemStack)
- **static** ItemStack loadItemStack(DataKey)

### Class: net.citizensnpcs.api.util.MemoryDataKey
Type: Class
Extends: net.citizensnpcs.api.util.DataKey

Methods:
- void setRaw(String, Object)
- double getDouble(String)
- double getDouble(String, double)
- Map getValuesDeep()
- String getString(String)
- DataKey getFromRoot(String)
- MemoryDataKey getRelative(String)
- DataKey getRelative(String)
- void setInt(String, int)
- void setDouble(String, double)
- long getLong(String)
- long getLong(String, long)
- int getInt(String)
- int getInt(String, int)
- void setString(String, String)
- void setLong(String, long)
- ConfigurationSection getSection(String)
- void removeKey(String)
- boolean keyExists(String)
- int hashCode()
- Iterable getSubKeys()
- boolean equals(Object)
- String name()
- String toString()
- Object getRaw(String)
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- void setBoolean(String, boolean)

### Class: net.citizensnpcs.api.util.Messaging
Type: Class

Methods:
- **static** void sendWithNPC(CommandSender, Object, NPC)
- **static** void sendColorless(CommandSender, Object[])
- **static** void debug(Object[])
- **static** void log(Object[])
- **static** void sendTr(CommandSender, String, Object[])
- **static** void sendTrColorless(CommandSender, String, Object[])
- **static** String parseComponents(String)
- **static** void logTr(String, Object[])
- **static** void sendWithNPCColorless(CommandSender, Object, NPC)
- **static** void sendError(CommandSender, Object[])
- **static** Object minecraftComponentFromRawMessage(String)
- **static** void configure(File, boolean, boolean, String, String, String, BiConsumer)
- **static** List parseComponentsList(String)
- **static** void severeTr(String, Object[])
- **static** boolean isDebugging()
- **static** void warn(Object[])
- **static** String tryTranslate(Object)
- **static** void severe(Object[])
- **static** void idebug(Supplier)
- **static** void sendErrorTr(CommandSender, String, Object[])
- **static** String stripColor(String)
- **static** void send(CommandSender, Object[])
- **static** String tr(String, Object[])

### Class: net.citizensnpcs.api.util.OldEnumCompat
Type: Class

No public methods found

### Class: net.citizensnpcs.api.util.OldEnumCompat$CatTypeEnum
Type: Class
Extends: net.citizensnpcs.api.util.OldEnumCompat$ReflectiveOldEnum

Methods:
- int hashCode()
- **static** OldEnumCompat$CatTypeEnum valueOf(String)
- boolean equals(Object)
- **static** OldEnumCompat$CatTypeEnum[] values()
- String name()
- String toString()
- Object getInstance()

### Class: net.citizensnpcs.api.util.OldEnumCompat$FrogVariantEnum
Type: Class
Extends: net.citizensnpcs.api.util.OldEnumCompat$ReflectiveOldEnum

Methods:
- int hashCode()
- **static** OldEnumCompat$FrogVariantEnum valueOf(String)
- boolean equals(Object)
- **static** OldEnumCompat$FrogVariantEnum[] values()
- String name()
- String toString()
- Object getInstance()

### Class: net.citizensnpcs.api.util.OldEnumCompat$VillagerProfessionEnum
Type: Class
Extends: net.citizensnpcs.api.util.OldEnumCompat$ReflectiveOldEnum

Methods:
- int hashCode()
- **static** OldEnumCompat$VillagerProfessionEnum valueOf(String)
- boolean equals(Object)
- **static** OldEnumCompat$VillagerProfessionEnum[] values()
- String name()
- String toString()
- Object getInstance()

### Class: net.citizensnpcs.api.util.OldEnumCompat$VillagerTypeEnum
Type: Class
Extends: net.citizensnpcs.api.util.OldEnumCompat$ReflectiveOldEnum

Methods:
- int hashCode()
- **static** OldEnumCompat$VillagerTypeEnum valueOf(String)
- boolean equals(Object)
- **static** OldEnumCompat$VillagerTypeEnum[] values()
- String name()
- String toString()
- Object getInstance()

### Class: net.citizensnpcs.api.util.Paginator
Type: Class

Methods:
- boolean hasPage(int)
- Paginator console(boolean)
- void addLine(String)
- **static** String wrapHeader(Object)
- String getPageText(int)
- Paginator header(String)
- Paginator enablePageSwitcher()
- Paginator enablePageSwitcher(String)
- boolean sendPage(CommandSender, int)

### Class: net.citizensnpcs.api.util.PermissionUtil
Type: Class

Methods:
- **static** boolean hasPermission(Set, Player)
- **static** Boolean inGroup(Collection, Player)

### Class: net.citizensnpcs.api.util.Placeholders
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- **static** boolean containsPlaceholders(String)
- **static** String replace(String, CommandSender, NPC)
- **static** String replace(String, OfflinePlayer)
- **static** void registerNPCPlaceholder(Pattern, Placeholders$PlaceholderFunction)
- **static** String replaceName(String, CommandSender, NPC)

### Class: net.citizensnpcs.api.util.RemoveReason
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** RemoveReason valueOf(String)
- **static** RemoveReason[] values()

### Class: net.citizensnpcs.api.util.SpigotUtil
Type: Class

Methods:
- **static** int[] getVersion()
- **static** Duration parseDuration(String, TimeUnit)
- **static** NamespacedKey getKey(String)
- **static** NamespacedKey getKey(String, String)
- **static** boolean isUsing1_13API()
- **static** String getMinecraftPackage()
- **static** boolean checkYSafe(double, World)
- **static** ItemStack parseItemStack(ItemStack, String)
- **static** int getMaxNameLength(EntityType)
- **static** boolean isRegistryKeyed(Class)

### Class: net.citizensnpcs.api.util.SpigotUtil$InventoryViewAPI
Type: Class

Methods:
- Player getPlayer()
- Inventory getTopInventory()
- int hashCode()
- boolean equals(Object)
- InventoryView getView()
- void close()

### Class: net.citizensnpcs.api.util.Translator
Type: Class

Methods:
- **static** String format(String, Object[])
- **static** String translate(String, Object[])
- **static** void setInstance(File, Locale)

### Class: net.citizensnpcs.api.util.YamlStorage
Type: Class
Implements: net.citizensnpcs.api.util.Storage

Methods:
- DataKey getKey(String)
- boolean load()
- int hashCode()
- boolean equals(Object)
- void save()
- String toString()

