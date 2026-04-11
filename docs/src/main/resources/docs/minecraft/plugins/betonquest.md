# BetonQuest API Reference

BetonQuest is an advanced quest and dialogue scripting plugin for Minecraft servers. It provides events, conditions, objectives, variables, conversations, and schedules. Third-party plugins can register custom implementations of all these types.

**Note:** BetonQuest 2.x has both a Legacy API (class-based registration) and a newer Factory API (interface-based registration). The Legacy API methods are deprecated but still functional. The examples below show both approaches where applicable.

## Accessing the Plugin

```java
import org.betonquest.betonquest.BetonQuest;

BetonQuest betonQuest = BetonQuest.getInstance();
```

For the newer modular API, use Bukkit's ServicesManager:

```java
import org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory;

BetonQuestLoggerFactory loggerFactory =
    getServer().getServicesManager().load(BetonQuestLoggerFactory.class);
```

## Profiles and Player Data

BetonQuest uses `Profile` instead of raw player UUIDs. Always use Profile-based methods.

```java
import org.betonquest.betonquest.BetonQuest;
import org.betonquest.betonquest.api.profiles.Profile;
import org.betonquest.betonquest.api.profiles.OnlineProfile;
import org.betonquest.betonquest.database.PlayerData;

// Getting player data for a profile
PlayerData data = BetonQuest.getInstance().getPlayerData(profile);
PlayerData offlineData = BetonQuest.getInstance().getOfflinePlayerData(profile);

// Profile interface methods
UUID profileUuid = profile.getProfileUUID();
UUID playerUuid = profile.getPlayerUUID();
String name = profile.getProfileName();
OfflinePlayer offlinePlayer = profile.getPlayer();
Optional<OnlineProfile> online = profile.getOnlineProfile();

// OnlineProfile extends Profile, adds:
Player player = onlineProfile.getPlayer();
```

## Creating a Custom Event (Legacy API)

Extend `QuestEvent`. The constructor receives an `Instruction` object to parse configuration. Override `execute` via the `handle` method.

```java
import org.betonquest.betonquest.api.QuestEvent;
import org.betonquest.betonquest.api.profiles.Profile;
import org.betonquest.betonquest.exceptions.InstructionParseException;
import org.betonquest.betonquest.exceptions.QuestRuntimeException;
import org.betonquest.betonquest.Instruction;
import org.betonquest.betonquest.BetonQuest;

public class MyCustomEvent extends QuestEvent {

    private final String skillName;

    public MyCustomEvent(Instruction instruction) throws InstructionParseException {
        super(instruction, true); // true = run on main thread
        // Parse arguments from the instruction string
        skillName = instruction.next();
        // Set super.persistent = true to allow firing for offline players
        // Set super.staticness = true to allow null profile (static events)
    }

    @Override
    protected Void execute(Profile profile) throws QuestRuntimeException {
        // Your event logic here
        // profile can be null if staticness is true
        return null;
    }
}
```

Register in your plugin's `onEnable()`:

```java
BetonQuest.getInstance().registerEvents("myevent", MyCustomEvent.class);
```

## Creating a Custom Event (New Factory API)

Implement `EventFactory` (and optionally `StaticEventFactory` for playerless events).

```java
import org.betonquest.betonquest.api.quest.event.Event;
import org.betonquest.betonquest.api.quest.event.EventFactory;
import org.betonquest.betonquest.api.quest.event.StaticEvent;
import org.betonquest.betonquest.api.quest.event.StaticEventFactory;
import org.betonquest.betonquest.api.profiles.Profile;
import org.betonquest.betonquest.exceptions.InstructionParseException;
import org.betonquest.betonquest.exceptions.QuestRuntimeException;
import org.betonquest.betonquest.Instruction;
import org.betonquest.betonquest.BetonQuest;

public class MyEventFactory implements EventFactory, StaticEventFactory {

    @Override
    public Event parseEvent(Instruction instruction) throws InstructionParseException {
        String skillName = instruction.next();
        return (Event) profile -> {
            // event logic using profile
        };
    }

    // Alias required by EventFactory (delegates to parseEvent)
    @Override
    public Event parsePlayer(Instruction instruction) throws InstructionParseException {
        return parseEvent(instruction);
    }

    @Override
    public StaticEvent parseStaticEvent(Instruction instruction) throws InstructionParseException {
        String skillName = instruction.next();
        return () -> {
            // static event logic (no player)
        };
    }

    @Override
    public StaticEvent parsePlayerless(Instruction instruction) throws InstructionParseException {
        return parseStaticEvent(instruction);
    }
}
```

Register:

```java
MyEventFactory factory = new MyEventFactory();
BetonQuest.getInstance().registerEvent("myevent", factory, factory);
// Or for non-static events only:
// BetonQuest.getInstance().registerNonStaticEvent("myevent", factory);
```

## Creating a Custom Condition (Legacy API)

Extend `Condition`. Override `execute` via the `handle` method, returning true/false.

```java
import org.betonquest.betonquest.api.Condition;
import org.betonquest.betonquest.api.profiles.Profile;
import org.betonquest.betonquest.exceptions.InstructionParseException;
import org.betonquest.betonquest.exceptions.QuestRuntimeException;
import org.betonquest.betonquest.Instruction;
import org.betonquest.betonquest.BetonQuest;

public class MyCustomCondition extends Condition {

    private final int requiredLevel;

    public MyCustomCondition(Instruction instruction) throws InstructionParseException {
        super(instruction, true);
        requiredLevel = instruction.getInt();
        // Set super.staticness = true for conditions that work without a player
        // Set super.persistent = true for offline player support
    }

    @Override
    protected Boolean execute(Profile profile) throws QuestRuntimeException {
        // Return true if condition is met
        return profile.getOnlineProfile()
            .map(op -> op.getPlayer().getLevel() >= requiredLevel)
            .orElse(false);
    }
}
```

Register:

```java
BetonQuest.getInstance().registerConditions("mylevel", MyCustomCondition.class);
```

## Creating a Custom Condition (New Factory API)

```java
import org.betonquest.betonquest.api.quest.condition.PlayerCondition;
import org.betonquest.betonquest.api.quest.condition.PlayerConditionFactory;
import org.betonquest.betonquest.api.quest.condition.PlayerlessCondition;
import org.betonquest.betonquest.api.quest.condition.PlayerlessConditionFactory;
import org.betonquest.betonquest.api.quest.condition.online.OnlineCondition;
import org.betonquest.betonquest.api.quest.condition.online.OnlineConditionAdapter;
import org.betonquest.betonquest.api.profiles.Profile;
import org.betonquest.betonquest.api.profiles.OnlineProfile;
import org.betonquest.betonquest.exceptions.InstructionParseException;
import org.betonquest.betonquest.exceptions.QuestRuntimeException;
import org.betonquest.betonquest.Instruction;

public class MyConditionFactory implements PlayerConditionFactory {

    @Override
    public PlayerCondition parsePlayer(Instruction instruction) throws InstructionParseException {
        int requiredLevel = instruction.getInt();
        // Use OnlineConditionAdapter to wrap an OnlineCondition as a PlayerCondition
        return new OnlineConditionAdapter(
            (OnlineProfile op) -> op.getPlayer().getLevel() >= requiredLevel
        );
    }
}
```

## Creating a Custom Objective

Extend `Objective`. Objectives track player progress and use `ObjectiveData` for persistence.

```java
import org.betonquest.betonquest.api.Objective;
import org.betonquest.betonquest.api.profiles.OnlineProfile;
import org.betonquest.betonquest.api.profiles.Profile;
import org.betonquest.betonquest.exceptions.InstructionParseException;
import org.betonquest.betonquest.exceptions.QuestRuntimeException;
import org.betonquest.betonquest.Instruction;
import org.betonquest.betonquest.BetonQuest;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class MyObjective extends Objective implements Listener {

    private final String targetBlock;

    public MyObjective(Instruction instruction) throws InstructionParseException {
        super(instruction);
        targetBlock = instruction.next();
        // REQUIRED: set the data class template
        template = ObjectiveData.class;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        OnlineProfile onlineProfile = /* convert from event.getPlayer() */;
        if (!containsPlayer(onlineProfile)) return;
        if (!checkConditions(onlineProfile)) return;
        completeObjective(onlineProfile);
    }

    @Override
    public void start() {
        Bukkit.getPluginManager().registerEvents(this, BetonQuest.getInstance());
    }

    @Override
    public void stop() {
        HandlerList.unregisterAll(this);
    }

    @Override
    public String getDefaultDataInstruction() {
        return "";
    }

    @Override
    public String getDefaultDataInstruction(Profile profile) {
        return getDefaultDataInstruction();
    }

    @Override
    public String getProperty(String name, Profile profile) {
        return "";
    }
}
```

Register:

```java
BetonQuest.getInstance().registerObjectives("myobjective", MyObjective.class);
```

## Using a CountingObjective

For objectives that track numeric progress, extend `CountingObjective`:

```java
import org.betonquest.betonquest.api.CountingObjective;
import org.betonquest.betonquest.api.profiles.OnlineProfile;
import org.betonquest.betonquest.api.profiles.Profile;
import org.betonquest.betonquest.exceptions.InstructionParseException;
import org.betonquest.betonquest.Instruction;

public class MyCountingObjective extends CountingObjective {

    public MyCountingObjective(Instruction instruction) throws InstructionParseException {
        super(instruction, "custom_property_name");
        // targetAmount is parsed automatically from instruction
    }

    // In your event handler:
    // CountingData data = getCountingData(profile);
    // data.progress();              // increment by 1
    // data.progress(5);             // increment by 5
    // if (data.isComplete()) completeObjective(profile);
}
```

## Creating a Custom Variable

```java
import org.betonquest.betonquest.api.Variable;
import org.betonquest.betonquest.api.profiles.Profile;
import org.betonquest.betonquest.exceptions.InstructionParseException;
import org.betonquest.betonquest.Instruction;
import org.betonquest.betonquest.BetonQuest;

public class MyVariable extends Variable {

    private final String key;

    public MyVariable(Instruction instruction) throws InstructionParseException {
        super(instruction);
        key = instruction.next();
    }

    @Override
    public String getValue(Profile profile) {
        // Return the variable value as a string
        return "some_value";
    }
}
```

Register:

```java
BetonQuest.getInstance().registerVariable("myvar", MyVariable.class);
```

## Firing Events and Checking Conditions Programmatically

```java
import org.betonquest.betonquest.BetonQuest;
import org.betonquest.betonquest.api.profiles.Profile;
import org.betonquest.betonquest.id.EventID;
import org.betonquest.betonquest.id.ConditionID;
import org.betonquest.betonquest.id.ObjectiveID;

// Fire an event for a profile (profile can be null for static events)
BetonQuest.event(profile, eventID);

// Check a condition (returns boolean)
boolean result = BetonQuest.condition(profile, conditionID);

// Check multiple conditions (all must pass)
boolean allMet = BetonQuest.conditions(profile, conditionID1, conditionID2);
boolean allMet2 = BetonQuest.conditions(profile, conditionIdCollection);

// Start a new objective for a player
BetonQuest.newObjective(profile, objectiveID);

// Resume an objective with saved data
BetonQuest.resumeObjective(profile, objectiveID, dataInstruction);
```

## Instruction Parsing

The `Instruction` class parses the user-defined configuration string:

```java
import org.betonquest.betonquest.Instruction;
import org.betonquest.betonquest.exceptions.InstructionParseException;

// In your constructor (Instruction instruction):
String arg = instruction.next();                  // next required argument (throws if missing)
instruction.getInt();                             // parse next arg as int
instruction.getLocation();                        // parse as location
instruction.getQuestItem();                       // parse as quest item
String raw = instruction.getInstruction();        // raw instruction string
```

## Listening to BetonQuest Bukkit Events

All profile-based events extend `ProfileEvent` and provide `getProfile()`:

```java
import org.betonquest.betonquest.api.PlayerTagAddEvent;
import org.betonquest.betonquest.api.PlayerTagRemoveEvent;
import org.betonquest.betonquest.api.PlayerConversationStartEvent;
import org.betonquest.betonquest.api.PlayerConversationEndEvent;
import org.betonquest.betonquest.api.ConversationOptionEvent;
import org.betonquest.betonquest.api.PlayerObjectiveChangeEvent;
import org.betonquest.betonquest.api.PlayerJournalAddEvent;
import org.betonquest.betonquest.api.PlayerJournalDeleteEvent;
import org.betonquest.betonquest.api.PlayerUpdatePointEvent;
import org.betonquest.betonquest.api.QuestCompassTargetChangeEvent;
import org.betonquest.betonquest.api.QuestDataUpdateEvent;
import org.betonquest.betonquest.api.MobKillNotifier;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MyListener implements Listener {

    @EventHandler
    public void onConversationStart(PlayerConversationStartEvent event) {
        // Cancellable
        event.getProfile();
        event.getConversation();
        event.setCancelled(true);
    }

    @EventHandler
    public void onTagAdd(PlayerTagAddEvent event) {
        String tag = event.getTag();
        Profile profile = event.getProfile();
    }

    @EventHandler
    public void onObjectiveChange(PlayerObjectiveChangeEvent event) {
        event.getObjective();
        event.getObjectiveID();
        event.getState();           // new state
        event.getPreviousState();   // old state
    }
}
```

## Logging

```java
import org.betonquest.betonquest.api.logger.BetonQuestLogger;
import org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory;

// Obtain via factory (preferred)
BetonQuestLoggerFactory factory = BetonQuest.getInstance().getLoggerFactory();
BetonQuestLogger log = factory.create(MyClass.class);

// Or obtain via ServicesManager
BetonQuestLoggerFactory factory2 =
    getServer().getServicesManager().load(BetonQuestLoggerFactory.class);

// Usage
log.info("Message");
log.warn("Warning message");
log.warn(questPackage, "Warning in package context");
log.error("Error message", throwable);
log.debug("Debug message");
log.reportException(throwable);
```

---

## API Reference

### Class: org.betonquest.betonquest.BetonQuest
Type: Class (extends JavaPlugin)

Key Methods:
- **static** BetonQuest getInstance()
- PlayerData getPlayerData(Profile profile)
- PlayerData getOfflinePlayerData(Profile profile)
- **static** boolean condition(@Nullable Profile, ConditionID)
- **static** boolean conditions(@Nullable Profile, ConditionID...)
- **static** boolean conditions(@Nullable Profile, Collection<ConditionID>)
- **static** boolean event(@Nullable Profile, EventID)
- **static** void newObjective(Profile, ObjectiveID)
- **static** void resumeObjective(Profile, ObjectiveID, String)
- **static** Variable createVariable(@Nullable QuestPackage, String) throws InstructionParseException
- @Nullable Objective getObjective(ObjectiveID)
- List<Objective> getPlayerObjectives(Profile)
- @Nullable ConversationData getConversation(ConversationID)
- BetonQuestLoggerFactory getLoggerFactory()
- QuestTypeRegistries getQuestRegistries()
- VariableProcessor getVariableProcessor()
- GlobalData getGlobalData()
- void registerObjectives(String name, Class<? extends Objective>)
- void registerConversationIO(String name, Class<? extends ConversationIO>)
- void registerInterceptor(String name, Class<? extends Interceptor>)
- void registerNotifyIO(String name, Class<? extends NotifyIO>)
- <S extends Schedule> void registerScheduleType(String, Class<S>, Scheduler<S, ?>)
- @Deprecated void registerConditions(String, Class<? extends Condition>)
- @Deprecated void registerEvents(String, Class<? extends QuestEvent>)
- @Deprecated void registerVariable(String, Class<? extends Variable>)
- @Deprecated void registerNonStaticEvent(String, EventFactory)
- @Deprecated <T extends EventFactory & StaticEventFactory> void registerEvent(String, T)
- @Deprecated void registerEvent(String, EventFactory, StaticEventFactory)

### Interface: org.betonquest.betonquest.api.profiles.Profile

Methods:
- OfflinePlayer getPlayer()
- UUID getProfileUUID()
- UUID getPlayerUUID()
- String getProfileName()
- Optional<OnlineProfile> getOnlineProfile()

### Interface: org.betonquest.betonquest.api.profiles.OnlineProfile
Extends: Profile

Methods:
- Player getPlayer()

### Class: org.betonquest.betonquest.api.QuestEvent (Abstract)
Extends: ForceSyncHandler

Methods:
- boolean fire(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.Condition (Abstract)
Extends: ForceSyncHandler

Methods:
- boolean isStatic()
- boolean isPersistent()

### Class: org.betonquest.betonquest.api.Objective (Abstract)

Methods:
- void start()
- void stop()
- void start(Profile)
- void stop(Profile)
- boolean containsPlayer(Profile)
- boolean checkConditions(Profile)
- void completeObjective(Profile)
- void newPlayer(Profile)
- String getProperty(String, Profile)
- String getDefaultDataInstruction()
- String getDefaultDataInstruction(Profile)
- String getData(Profile)
- String getLabel()
- void setLabel(ObjectiveID)
- boolean isGlobal()
- void close()

### Class: org.betonquest.betonquest.api.Objective$ObjectiveData

Methods:
- String toString()

### Class: org.betonquest.betonquest.api.CountingObjective (Abstract)
Extends: Objective

Methods:
- String getProperty(String, Profile)
- String getDefaultDataInstruction()
- String getDefaultDataInstruction(Profile)
- CountingData getCountingData(Profile)

### Class: org.betonquest.betonquest.api.CountingObjective$CountingData
Extends: ObjectiveData

Methods:
- CountingData add() / add(int)
- CountingData subtract() / subtract(int)
- CountingData progress() / progress(int)
- CountingData regress() / regress(int)
- int getTargetAmount()
- int getCompletedAmount()
- int getAmountLeft()
- int getPreviousAmountLeft()
- int getLastChange()
- int getDirectionFactor()
- boolean isComplete()

### Class: org.betonquest.betonquest.api.Variable (Abstract)

Methods:
- String getValue(Profile)
- Instruction getInstruction()
- boolean isStaticness()

### Interface: org.betonquest.betonquest.api.quest.event.Event

Methods:
- void execute(Profile) throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.event.EventFactory

Methods:
- Event parseEvent(Instruction) throws InstructionParseException
- Event parsePlayer(Instruction) throws InstructionParseException

### Interface: org.betonquest.betonquest.api.quest.event.StaticEvent

Methods:
- void execute() throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.event.StaticEventFactory

Methods:
- StaticEvent parseStaticEvent(Instruction) throws InstructionParseException
- StaticEvent parsePlayerless(Instruction) throws InstructionParseException

### Interface: org.betonquest.betonquest.api.quest.condition.PlayerCondition

Methods:
- boolean check(Profile) throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.condition.PlayerConditionFactory

Methods:
- PlayerCondition parsePlayer(Instruction) throws InstructionParseException

### Interface: org.betonquest.betonquest.api.quest.condition.PlayerlessCondition

Methods:
- boolean check() throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.condition.PlayerlessConditionFactory

Methods:
- PlayerlessCondition parsePlayerless(Instruction) throws InstructionParseException

### Interface: org.betonquest.betonquest.api.quest.condition.online.OnlineCondition

Methods:
- boolean check(OnlineProfile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.condition.online.OnlineConditionAdapter
Implements: PlayerCondition

Methods:
- boolean check(Profile) throws QuestRuntimeException

### Interface: org.betonquest.betonquest.api.quest.variable.PlayerVariable

Methods:
- String getValue(Profile)

### Interface: org.betonquest.betonquest.api.quest.variable.PlayerVariableFactory

Methods:
- PlayerVariable parsePlayer(Instruction) throws InstructionParseException

### Interface: org.betonquest.betonquest.api.quest.variable.PlayerlessVariable

Methods:
- String getValue()

### Class: org.betonquest.betonquest.api.quest.event.nullable.NullableEventAdapter
Implements: Event, StaticEvent

Methods:
- void execute(Profile) throws QuestRuntimeException
- void execute() throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.quest.condition.nullable.NullableConditionAdapter
Implements: PlayerCondition, PlayerlessCondition

Methods:
- boolean check(Profile) throws QuestRuntimeException
- boolean check() throws QuestRuntimeException

### Abstract Class: org.betonquest.betonquest.api.profiles.ProfileEvent
Extends: org.bukkit.event.Event

Methods:
- Profile getProfile()

### Class: org.betonquest.betonquest.api.PlayerConversationStartEvent
Extends: ProfileEvent, implements Cancellable

Methods:
- Conversation getConversation()
- boolean isCancelled()
- void setCancelled(boolean)

### Class: org.betonquest.betonquest.api.PlayerConversationEndEvent
Extends: ProfileEvent

Methods:
- Conversation getConversation()

### Class: org.betonquest.betonquest.api.ConversationOptionEvent
Extends: ProfileEvent

Methods:
- Conversation getConversation()
- ResolvedOption getSelectedOption()
- ResolvedOption getNextNPCOption()

### Class: org.betonquest.betonquest.api.PlayerObjectiveChangeEvent
Extends: ProfileEvent

Methods:
- Objective getObjective()
- ObjectiveID getObjectiveID()
- ObjectiveState getState()
- ObjectiveState getPreviousState()

### Class: org.betonquest.betonquest.api.PlayerTagAddEvent / PlayerTagRemoveEvent
Extends: ProfileEvent

Methods:
- String getTag()

### Class: org.betonquest.betonquest.api.PlayerUpdatePointEvent
Extends: ProfileEvent

Methods:
- String getCategory()
- int getNewCount()

### Class: org.betonquest.betonquest.api.PlayerJournalAddEvent / PlayerJournalDeleteEvent
Extends: ProfileEvent

Methods:
- Journal getJournal()
- Pointer getPointer()

### Class: org.betonquest.betonquest.api.QuestCompassTargetChangeEvent
Extends: ProfileEvent, implements Cancellable

Methods:
- Location getLocation()
- boolean isCancelled()
- void setCancelled(boolean)

### Class: org.betonquest.betonquest.api.MobKillNotifier

Methods:
- **static** void addKill(Profile, Entity)

### Interface: org.betonquest.betonquest.api.logger.BetonQuestLogger

Methods:
- void info(String)
- void info(QuestPackage, String)
- void warn(String) / warn(String, Throwable)
- void warn(QuestPackage, String) / warn(QuestPackage, String, Throwable)
- void error(String) / error(String, Throwable)
- void error(QuestPackage, String) / error(QuestPackage, String, Throwable)
- void debug(String) / debug(String, Throwable)
- void debug(QuestPackage, String) / debug(QuestPackage, String, Throwable)
- void reportException(Throwable)
- void reportException(QuestPackage, Throwable)

### Interface: org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory

Methods:
- BetonQuestLogger create(Class)
- BetonQuestLogger create(Class, String)
- BetonQuestLogger create(Plugin)
- BetonQuestLogger create(Plugin, String)

### Interface: org.betonquest.betonquest.api.config.quest.QuestPackage

Methods:
- String getQuestPath()
- MultiConfiguration getConfig()
- String getString(String) / getString(String, String)
- String getRawString(String)
- String getFormattedString(String)
- String subst(String)
- boolean hasTemplate(String)
- List getTemplates()
- boolean saveAll() throws IOException

### Abstract Class: org.betonquest.betonquest.api.schedule.Schedule

Methods:
- ScheduleID getId()
- String getTime()
- CatchupStrategy getCatchup()
- List getEvents()

### Abstract Class: org.betonquest.betonquest.api.schedule.Scheduler

Methods:
- void start()
- void stop()
- boolean isRunning()
- void addSchedule(Schedule)

### Interface: org.betonquest.betonquest.api.common.function.Selector

Methods:
- Object selectFor(Profile) throws QuestRuntimeException

### Class: org.betonquest.betonquest.api.common.function.Selectors

Methods:
- **static** Selector fromPlayer(Function)
- **static** Selector fromOnlineProfile(Function)
- **static** Selector fromOfflinePlayer(Function)
