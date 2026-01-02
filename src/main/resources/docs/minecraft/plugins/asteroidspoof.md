# Asteroid-1.1.7-release-20-me-serbob-asteroidapi API Reference

**Package Filter:** `me.serbob.asteroidapi`

## Package: me.serbob.asteroidapi

### Class: me.serbob.asteroidapi.AsteroidAPI
Type: Class

Methods:
- SpoofHandlerAPI getSpoofHandlerAPI()
- void setDisableSpoofHandlerTick(boolean disableSpoofHandlerTick)
- void setSpoofHandlerAPI(SpoofHandlerAPI spoofHandlerAPI)
- **static** AsteroidAPI getInstance()
- boolean isDisableSpoofHandlerTick()

## Package: me.serbob.asteroidapi.actions.abstracts

### Class: me.serbob.asteroidapi.actions.abstracts.Action
Type: Abstract Class
Implements: java.lang.Comparable

Constructors:
- Action(ActionType type)
- Action(ActionType type, Priority priority)

Methods:
- long getCurrentDuration()
- Action onFinished(Consumer<Result<*>> callback)
- FakePlayerEntity getFakePlayer()
- V setCallbacks(Set<Consumer<Result<*>>> callbacks)
- V setResult(Result<*> result)
- void setPaused(boolean paused)
- void run(Action action)
- int compareTo(Action other)
- int compareTo(Object)
- Action getChildAction()
- void setRunning(boolean running)
- void addValidator(ActionValidator validator)
- void setFatigue(ActionFatigue fatigue)
- void internalStart(Action$StartType startType)
- void onStart(Action$StartType)
- void internalUpdate()
- boolean isRunning()
- Action getParentAction()
- void onStop(Action$StopType)
- TT getData(String key)
- void setFinished(boolean finished)
- boolean isPaused()
- IActionManager getManager()
- void internalStop(Action$StopType stopType)
- void setCurrentDuration(long currentDuration)
- void setData(String key, Object value)
- void setChildAction(Action childAction)
- void updatePriority(Priority priority)
- void setManager(IActionManager manager)
- Map<String, Object> getActionData()
- boolean isFinished()
- V markAsFinished(Result<*> result)
- Set<Consumer<Result<*>>> getCallbacks()
- V setValidators(List<ActionValidator> validators)
- ActionFatigue getFatigue()
- void setFakePlayer(FakePlayerEntity fakePlayer)
- ActionType getType()
- boolean canStop(Action$StopType)
- Result<*> getResult()
- boolean isHigherPriorityThan(Action other)
- DynamicPriority getPriority()
- void setParentAction(Action parentAction)
- V setActionData(Map<String, Object> actionData)
- void onUpdate()
- List<ActionValidator> getValidators()
- boolean canStart(Action$StartType)
- void register(IActionManager manager)

### Class: me.serbob.asteroidapi.actions.abstracts.Action$StartType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- START
- RESUME
- RESTART

Methods:
- **static** Action$StartType valueOf(String name)
- **static** Action$StartType[] values()

### Class: me.serbob.asteroidapi.actions.abstracts.Action$StopType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- STOP
- PAUSE
- SUCCESS
- FAILURE

Methods:
- **static** Action$StopType valueOf(String name)
- **static** Action$StopType[] values()

## Package: me.serbob.asteroidapi.actions.enums

### Class: me.serbob.asteroidapi.actions.enums.ActionState
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- IDLE
- INITIALIZING
- RUNNING
- PAUSED
- FINISHING
- FINISHED

Methods:
- **static** ActionState valueOf(String name)
- **static** ActionState[] values()

### Class: me.serbob.asteroidapi.actions.enums.ActionType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- IDLING
- WANDERING
- FOLLOWING
- LOCATION
- PATHFINDING
- JUMPING
- SWIMMING
- FLYING
- GATHERING
- MINING
- FARMING
- FISHING
- BUILDING
- PLACING
- BREAKING
- FIGHTING
- ATTACKING
- DEFENDING
- FLEEING
- SEARCHING
- INTERACTION
- TRADING
- CRAFTING
- LOOTING
- SORTING
- DROPPING
- EATING
- HEALING
- SLEEPING
- CHATTING
- CUSTOM
- COMPLEX

Methods:
- **static** ActionType valueOf(String name)
- **static** ActionType[] values()

### Class: me.serbob.asteroidapi.actions.enums.Priority
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- HIGHEST
- HIGH
- NORMAL
- LOW
- LOWEST
- CUSTOM

Methods:
- boolean isHigherThan(Priority other)
- float getValue()
- boolean isLowerThan(Priority other)
- **static** Priority valueOf(String name)
- **static** Priority custom(float value)
- boolean equals(Priority other)
- Priority setValue(float value)
- **static** Priority[] values()
- String toString()

## Package: me.serbob.asteroidapi.actions.example

### Class: me.serbob.asteroidapi.actions.example.PathingAction
Type: Class
Extends: me.serbob.asteroidapi.actions.abstracts.Action

Constructors:
- PathingAction(Location destination, PathingAction$MovementType movementType)
- PathingAction(Location destination, Path path, PathingAction$MovementType movementType)

Methods:
- void setPreviousPosition(Location previousPosition)
- Location getDestination()
- Priority getLookingPriority()
- void setStuckThreshold(double stuckThreshold)
- PathingAction setLookAtDestination(boolean shouldLook, Priority priority)
- void setTicksSinceStart(int ticksSinceStart)
- int getTicksSinceStart()
- void onStart(Action$StartType startType)
- Path getPath()
- void setStuckAction(PathingAction$StuckAction stuckAction)
- void onStop(Action$StopType stopType)
- double getStuckThreshold()
- void setMaxStuckTime(int maxStuckTime)
- void setPath(Path path)
- int getMaxStuckTime()
- void setLookingPriority(Priority lookingPriority)
- void setShouldLookAtDestination(boolean shouldLookAtDestination)
- Location getStartPosition()
- Location getPreviousPosition()
- PathingAction$MovementType getMovementType()
- Location getGroundDestination()
- PathingAction setArrivalDistance(double distance)
- void setStartPosition(Location startPosition)
- boolean isShouldLookAtDestination()
- boolean canStop(Action$StopType stopType)
- PathingAction setStuckDetection(int maxTime, double threshold, PathingAction$StuckAction)
- PathingAction$StuckAction getStuckAction()
- int getStuckTime()
- void setStuckTime(int stuckTime)
- void onUpdate()
- double getArrivalDistance()
- boolean canStart(Action$StartType startType)

### Class: me.serbob.asteroidapi.actions.example.PathingAction$MovementType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- WALK
- SNEAK
- SPRINT
- SPRINT_JUMP
- FLY

Methods:
- **static** PathingAction$MovementType valueOf(String name)
- **static** PathingAction$MovementType[] values()

### Class: me.serbob.asteroidapi.actions.example.PathingAction$StuckAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- STOP
- RESTART
- REVERSE
- TELEPORT
- IGNORE

Methods:
- **static** PathingAction$StuckAction valueOf(String name)
- **static** PathingAction$StuckAction[] values()

## Package: me.serbob.asteroidapi.actions.interfaces

### Class: me.serbob.asteroidapi.actions.interfaces.ActionValidator
Type: Interface

Methods:
- boolean validate(Action)

### Class: me.serbob.asteroidapi.actions.interfaces.IActionManager
Type: Interface

Methods:
- Set<Action> getRegisteredactions()
- Action getCurrentaction()
- FakePlayerEntity getFakePlayer()
- void forceUnregister(Action[])
- void unregister(Action[])
- void unregister(boolean, Action[])
- void unregisterAll()
- void tick()
- void register(Action[])

## Package: me.serbob.asteroidapi.actions.normal

### Class: me.serbob.asteroidapi.actions.normal.ActionFatigue
Type: Class

Constructors:
- ActionFatigue(int maxFatigue, int recoveryRate, int fatigueRate)

Methods:
- boolean isFatigued()
- void increaseFatigue()
- void update()

### Class: me.serbob.asteroidapi.actions.normal.ActionMonitor
Type: Class

Constructors:
- ActionMonitor(Action action)

Methods:
- void recordStateChange(ActionState oldState, ActionState newState)
- V recordResult(Result<*> result)

## Package: me.serbob.asteroidapi.actions.util

### Class: me.serbob.asteroidapi.actions.util.DynamicPriority
Type: Class

Constructors:
- DynamicPriority(Priority basePriority)

Methods:
- boolean isHigherThan(DynamicPriority other)
- void setBasePriority(Priority priority)
- void addModifier(String key, float value)
- boolean equals(DynamicPriority other)
- Priority getBasePriority()
- float calculate()
- Map<String, Float> getModifiers()
- boolean removeModifier(String key)
- void clearModifiers()

### Class: me.serbob.asteroidapi.actions.util.Result
Type: Class

Constructors:
- Result(Result$Type type)
- Result(Result$Type type, T value)
- Result(Result$Type type, T value, T message, ; error)

Methods:
- Throwable getError()
- TT getValue()
- Result$Type getType()
- String getMessage()

### Class: me.serbob.asteroidapi.actions.util.Result$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SUCCESS
- FAILURE
- INTERRUPTED
- ERROR

Methods:
- **static** Result$Type valueOf(String name)
- **static** Result$Type[] values()

## Package: me.serbob.asteroidapi.behaviour

### Class: me.serbob.asteroidapi.behaviour.FakePlayerSpawn
Type: Interface

Methods:
- void onSpawnFakePlayerNMSAsync(FakePlayerEntity, JavaPlugin)
- void onSpawnFakePlayerAfterLoadAsync(FakePlayerEntity, JavaPlugin)

### Class: me.serbob.asteroidapi.behaviour.FakePlayerTick
Type: Interface

Methods:
- void individualPlayerTickAsync(FakePlayerEntity, JavaPlugin)

## Package: me.serbob.asteroidapi.blocks

### Class: me.serbob.asteroidapi.blocks.BlockTag
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SOLID
- LIQUID
- CLIMBABLE

Methods:
- **static** BlockTag valueOf(String name)
- **static** BlockTag[] values()
- boolean matches(Position3D position, World world)
- boolean matches(Location location)
- boolean matches(Block block)
- boolean matches(Material material)

## Package: me.serbob.asteroidapi.commands

### Class: me.serbob.asteroidapi.commands.AsteroidCommand
Type: Interface

Methods:
- List<String> tabComplete(CommandSender, String)
- boolean execute(CommandSender, String, String[])

### Class: me.serbob.asteroidapi.commands.AsteroidCommandManager
Type: Class

Methods:
- Map<String, AsteroidCommand> getCommandMap()
- **static** void registerCommand(String commandName, AsteroidCommand command)
- **static** AsteroidCommandManager getInstance()

## Package: me.serbob.asteroidapi.enums

### Class: me.serbob.asteroidapi.enums.HandEnum
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LEFT
- RIGHT
- DOMINANT

Methods:
- **static** HandEnum valueOf(String name)
- **static** HandEnum[] values()

### Class: me.serbob.asteroidapi.enums.MinecraftVersion
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ALL
- v1_8_R3
- v1_16_R3
- v1_18_R2
- v1_19_R3
- v1_20_R1
- v1_20_R2
- v1_20_R3

Methods:
- **static** MinecraftVersion valueOf(String name)
- **static** MinecraftVersion[] values()

### Class: me.serbob.asteroidapi.enums.Pose
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- STANDING
- SNEAKING
- SLEEPING
- SWIMMING
- FLYING
- SPINNING
- DYING

Methods:
- float getSpeedModifier()
- **static** Pose valueOf(String name)
- **static** Pose[] values()

## Package: me.serbob.asteroidapi.events

### Class: me.serbob.asteroidapi.events.FakePlayerEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- FakePlayerEvent(FakePlayerEntity fakePlayer)

Methods:
- FakePlayerEntity getFakePlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: me.serbob.asteroidapi.events.Impl

### Class: me.serbob.asteroidapi.events.Impl.FakePlayerDeathEvent
Type: Class
Extends: me.serbob.asteroidapi.events.FakePlayerEvent

Constructors:
- FakePlayerDeathEvent(FakePlayerEntity fakePlayer)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.serbob.asteroidapi.events.Impl.FakePlayerJoinEvent
Type: Class
Extends: me.serbob.asteroidapi.events.FakePlayerEvent

Constructors:
- FakePlayerJoinEvent(FakePlayerEntity fakePlayer)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.serbob.asteroidapi.events.Impl.FakePlayerQuitEvent
Type: Class
Extends: me.serbob.asteroidapi.events.FakePlayerEvent

Constructors:
- FakePlayerQuitEvent(FakePlayerEntity fakePlayer)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: me.serbob.asteroidapi.extension

### Class: me.serbob.asteroidapi.extension.ExtensionDependency
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: me.serbob.asteroidapi.extension.ExtensionLifecycle
Type: Abstract Class

Methods:
- Plugin getPlugin()
- void reloadConfig()
- Logger getLogger()
- File getDataFolder()
- void onEnable()
- void initialize(Plugin plugin, Logger logger, File jarFile)
- void saveDefaultConfig()
- void onDisable()
- FileConfiguration getConfig()
- void saveConfig()

## Package: me.serbob.asteroidapi.handlers

### Class: me.serbob.asteroidapi.handlers.SpoofHandlerAPI
Type: Interface

Methods:
- String connect()

### Class: me.serbob.asteroidapi.handlers.FBrain
Type: Class

Constructors:
- FBrain(FakePlayerEntity fakePlayer, IActionManager actionManager)

Methods:
- IActionManager getActionManager()
- void tick()

## Package: me.serbob.asteroidapi.injection

### Class: me.serbob.asteroidapi.injection.Hook
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: me.serbob.asteroidapi.injection.Feature
Type: Class

No public methods found

### Class: me.serbob.asteroidapi.injection.Features
Type: Class

Methods:
- List<Feature> getFeatures()
- void removeFeature(Feature feature)
- void addFeature(Feature feature)

## Package: me.serbob.asteroidapi.interfaces

### Class: me.serbob.asteroidapi.interfaces.DestroyBlock
Type: Interface

Methods:
- void destroy(Block)

### Class: me.serbob.asteroidapi.interfaces.FakePlayerInventory
Type: Interface

Methods:
- void drop()
- void drop(int)
- void removeItem(ItemStack)
- void select(int)
- void setMainHand(ItemStack)
- void setHelmet(ItemStack)
- void setLeggings(ItemStack)
- ItemStack getOffhandItem()
- int getSelectedSlot()
- int addItem(ItemStack)
- boolean contains(ItemStack)
- boolean contains(Material)
- void setOffhand(ItemStack)
- ItemStack getFirst(Material)
- ItemStack[] getContents()
- void setBoots(ItemStack)
- ItemStack getMainhand()
- void setChestplate(ItemStack)
- ItemStack[] getHotbar()
- ItemStack getSelectedItem()

### Class: me.serbob.asteroidapi.interfaces.ILookController
Type: Interface

Methods:
- Map<String, Target> getTargets()
- void setLookAhead(boolean)
- Target getTarget(String)
- Vector getDirection()
- boolean addTarget(String, Target)
- boolean hasTarget(String)
- Target getHighestPriorityTarget()
- void lookAt(Position3D)
- void lookAt(Location)
- String getLastTarget()
- void tick()
- void purgeTargets()
- boolean removeTarget(String)

### Class: me.serbob.asteroidapi.interfaces.INavigation
Type: Interface

Methods:
- Path getCurrentPath()
- void stop()
- void moveTo(Location)
- Path moveTo(Location, Path)

### Class: me.serbob.asteroidapi.interfaces.ITargetCore
Type: Interface

Methods:
- void changeTargetHandler(Target)
- Target getTargetHandler()

### Class: me.serbob.asteroidapi.interfaces.Movement
Type: Interface

Methods:
- void stopMovement()
- void applyUpwardForce(double)
- Vector getVelocity()
- void applyKnockback(Location)
- void fullStop()
- void forceJump()
- void setClimbing(boolean)
- void addVelocity(Vector)
- double getTargetX()
- boolean isClimbing()
- double getTargetZ()
- void jump()
- void moveTo(double, double)

### Class: me.serbob.asteroidapi.interfaces.Overrides
Type: Interface

Methods:
- boolean isUsingItem()
- void stopUsingItem()
- Pose getPose()
- void setItemCooldown(Material, int)
- void startUsingItem(HandEnum)
- void swingHand(HandEnum)
- boolean isJumping()
- void setRotation(float, float)
- void setJumping(boolean)
- void setPose(Pose)
- int getItemCooldown(Material)

### Class: me.serbob.asteroidapi.interfaces.Version
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- MinecraftVersion value()

## Package: me.serbob.asteroidapi.logging

### Class: me.serbob.asteroidapi.logging.Logger
Type: Interface

Methods:
- void debug(String)
- void success(String)
- void warning(String)
- void error(String)
- void info(String)

## Package: me.serbob.asteroidapi.looking

### Class: me.serbob.asteroidapi.looking.Target
Type: Class

Constructors:
- Target(Object target, Target$Type type, Priority priority)
- Target(Location target, Priority priority)
- Target(Entity target, Priority priority)
- Target(Block target, Priority priority)
- Target(Location target)
- Target(Entity target)
- Target(Block target)

Methods:
- TT getTarget()
- Location getLocation()
- Target$Type getType()
- **static** Target of(Location location, Priority priority)
- **static** Target of(Entity entity, Priority priority)
- **static** Target of(Block block, Priority priority)
- Priority getPriority()

### Class: me.serbob.asteroidapi.looking.Target$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LOCATION
- ENTITY
- BLOCK

Methods:
- **static** Target$Type valueOf(String name)
- **static** Target$Type[] values()

## Package: me.serbob.asteroidapi.pathfinding

### Class: me.serbob.asteroidapi.pathfinding.Node
Type: Class

Constructors:
- Node(Position3D pos)
- Node(int x, int y, int z)

Methods:
- Position3D getBlockPos()
- int getX()
- int getY()
- int getZ()
- boolean equals(Node node)
- boolean equals(Position3D pos)
- boolean equals(int x, int y, int z)

### Class: me.serbob.asteroidapi.pathfinding.Path
Type: Class

Constructors:
- Path(Node[] nodes)

Methods:
- Deque<Node> getNodes()
- int size()
- void replaceNode(int index, Node node)
- boolean notStarted()
- Vector getNodePos(int index)
- Vector getNextNodePos()
- Node getNode(int index)
- void clean()
- Vector getPosAtNode(FakePlayerEntity fake, int index)
- int getNextNodeIndex()
- boolean isDone()
- Vector getNextPos(FakePlayerEntity fakePlayer)
- void advance()

### Class: me.serbob.asteroidapi.pathfinding.Position3D
Type: Class
Implements: java.lang.Cloneable

Constructors:
- Position3D(int x, int y, int z)

Methods:
- Position3D add(int x, int y, int z)
- Position3D add(Position3D pos)
- double distance(Position3D pos)
- Position3D south()
- Position3D south(int amount)
- Position3D below()
- Position3D below(int amount)
- Position3D north()
- Position3D north(int amount)
- Position3D subtract(Position3D pos)
- Location toLocation(World world)
- int getX()
- Position3D east()
- Position3D east(int amount)
- int getY()
- int getZ()
- Position3D clone()
- Object clone() throws CloneNotSupportedException
- Position3D west()
- Position3D west(int amount)
- Position3D above()
- Position3D above(int amount)
- Position3D divide(Position3D pos)
- **static** Position3D fromLocation(Location location)
- Position3D multiply(Position3D pos)

## Package: me.serbob.asteroidapi.registries

### Class: me.serbob.asteroidapi.registries.FakePlayerEntity
Type: Interface

Methods:
- Object getServerPlayer()
- void move(Vector)
- FakePlayerInventory getFakeInventory()
- Overrides getOverrides()
- void setHeadYaw(float)
- Movement getMovement()
- INavigation getNavigation()
- void setBodyYaw(float)
- Features features()
- DestroyBlock getDestroyBlock()
- Object getCraftPlayer()
- ILookController getLookController()
- void disconnectAsync()
- V spawnFakePlayerNMS(Map<UUID, Object>)
- FBrain getFBrain()
- void setPing(int)
- ITargetCore getTargetCore()
- Player getEntityPlayer()

### Class: me.serbob.asteroidapi.registries.FakePlayerRegistry
Type: Class

Methods:
- void removeFakePlayer(UUID uuid)
- Map<UUID, Object> getFakePlayers()
- boolean isAFakePlayer(UUID uuid)
- void addFakePlayer(UUID uuid, Object playerObject)

## Package: me.serbob.asteroidapi.scheduler

### Class: me.serbob.asteroidapi.scheduler.Schedule
Type: Class

Methods:
- void cancelAndDeleteAllTasks(UUID uuid)
- void removeTaskFromUuid(UUID uuid, Task task)
- void cancelAllTasks(UUID uuid)
- void addTaskToUuid(UUID uuid, Task task)
- Map<UUID, List<Task>> getTaskIdMap()

## Package: me.serbob.asteroidapi.server

### Class: me.serbob.asteroidapi.server.AsteroidLoadedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: me.serbob.asteroidapi.task

### Class: me.serbob.asteroidapi.task.Task
Type: Interface

Methods:
- void cancel()
- boolean isRepeatingTask()
- boolean isCancelled()
- Plugin getOwner()
- Task getTask()
- boolean isCurrentlyRunning()

## Package: me.serbob.asteroidapi.utils

### Class: me.serbob.asteroidapi.utils.LocationUtils
Type: Class

Methods:
- **static** double getDistance(Position3D pos1, Position3D pos2)
- **static** double getDistance(Location loc1, Location loc2)
- **static** double getSquaredDistance(Vector vec1, Vector vec2)
- **static** double getManhattanDistance(Location loc1, Location loc2)
- **static** boolean isStandable(Position3D pos, World world)
- **static** boolean isStandable(Location location)
- **static** String formatLocation(Location location)
- **static** Location parseLocation(String string)
- **static** Block getBlockInFront(Location location, int distance)
- **static** Block findAirBlock(Location location, BlockFace direction)
- **static** Vector getDeltaVector(Position3D pos1, Position3D pos2)
- **static** Vector getDeltaVector(Location loc1, Location loc2)
- **static** String formatLocationPrecise(Location location)
- **static** boolean isSolid(Position3D pos, World world)
- **static** boolean isSolid(Location location)
- **static** Vector toLocalSpace(Vector vector, double yaw)
- **static** Block findSolidBlock(Location location, BlockFace direction)
- **static** boolean isWithinDistance(Vector vec1, Vector vec2, double distance)
- **static** Vector getCenterBottom(Vector vector)
- **static** boolean canReach(Location to, Location from)
- **static** Location findRandomLocation(Location from, Interval interval, float directionBias)

## Package: me.serbob.asteroidapi.utils.math

### Class: me.serbob.asteroidapi.utils.math.Interval
Type: Class

Constructors:
- Interval(int min, int max)

Methods:
- void setMax(int max)
- int getSize()
- void setMin(int min)
- boolean contains(int value)
- int getMin()
- int getMax()
- **static** Interval of(int min, int max)
- boolean overlaps(Interval other)
- int clamp(int value)

### Class: me.serbob.asteroidapi.utils.math.MathUtils
Type: Class

Methods:
- **static** int randomInt(int min, int max)
- **static** double round(double value)
- **static** double round(double value, int)
- **static** double randomDouble(double min, double)
- **static** int floor(double value)
- **static** double remap(double value, double, double maxValue, double)
- **static** boolean isFinite(double value)

