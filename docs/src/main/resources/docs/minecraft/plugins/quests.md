# Quests API Reference (PikaMug)

Quests is a quest scripting plugin with stages, objectives, requirements, rewards, conditions, and NPC integration. The API lets plugins query quest/player state, listen for quest events, and create custom modules (requirements, rewards, objectives) that are auto-loaded from the `plugins/Quests/modules/` folder. Add `Quests` to `depend` or `softdepend` in plugin.yml.

## Code Examples

### Getting the API and a Quester

```java
import me.pikamug.quests.Quests;
import me.pikamug.quests.player.Quester;
import me.pikamug.quests.quests.Quest;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

Quests quests = (Quests) Bukkit.getPluginManager().getPlugin("Quests");

// Get a quester from an online player
Quester quester = quests.getQuester(player.getUniqueId());

// Player's current active quests (Quest -> current stage index)
java.util.concurrent.ConcurrentHashMap<Quest, Integer> active = quester.getCurrentQuests();

// Completed quests
java.util.concurrent.ConcurrentSkipListSet<Quest> completed = quester.getCompletedQuests();

// All loaded quests on the server
java.util.Collection<Quest> allQuests = quests.getLoadedQuests();
```

### Check if a Player Has Completed a Quest

```java
import me.pikamug.quests.Quests;
import me.pikamug.quests.player.Quester;
import me.pikamug.quests.quests.Quest;
import org.bukkit.Bukkit;

import java.util.UUID;

Quests quests = (Quests) Bukkit.getPluginManager().getPlugin("Quests");
Quester quester = quests.getQuester(playerUuid);

boolean completed = quester.getCompletedQuests().stream()
        .anyMatch(q -> q.getId().equals("my_quest_id"));

// How many times completed
int timesCompleted = quester.getAmountsCompleted().entrySet().stream()
        .filter(e -> e.getKey().getId().equals("my_quest_id"))
        .map(java.util.Map.Entry::getValue)
        .findFirst().orElse(0);

// Remaining cooldown (millis, 0 if ready)
Quest quest = quests.getLoadedQuests().stream()
        .filter(q -> q.getId().equals("my_quest_id"))
        .findFirst().orElse(null);
if (quest != null) {
    long cooldown = quester.getRemainingCooldown(quest);
}
```

### Give a Quest to a Player Programmatically

```java
import me.pikamug.quests.Quests;
import me.pikamug.quests.player.Quester;
import me.pikamug.quests.quests.Quest;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

Quests quests = (Quests) Bukkit.getPluginManager().getPlugin("Quests");
Quester quester = quests.getQuester(player.getUniqueId());

Quest quest = quests.getLoadedQuests().stream()
        .filter(q -> q.getName().equals("Dragon Slayer"))
        .findFirst().orElse(null);

if (quest != null) {
    // true = ignore requirements
    quester.takeQuest(quest, true);
}
```

### Query Current Objectives and Progress

```java
import me.pikamug.quests.Quests;
import me.pikamug.quests.player.Quester;
import me.pikamug.quests.player.QuestProgress;
import me.pikamug.quests.quests.Quest;
import me.pikamug.quests.quests.components.Objective;
import org.bukkit.Bukkit;

import java.util.LinkedList;

Quests quests = (Quests) Bukkit.getPluginManager().getPlugin("Quests");
Quester quester = quests.getQuester(player.getUniqueId());

for (Quest quest : quester.getCurrentQuests().keySet()) {
    // Get formatted objectives (false = no color, true = show progress)
    LinkedList<Objective> objectives = quester.getCurrentObjectives(quest, false, true);
    for (Objective obj : objectives) {
        String message = obj.getMessage();      // e.g. "Break 10 Stone"
        int progress = obj.getProgress();        // e.g. 3
        int goal = obj.getGoal();                // e.g. 10
    }

    // Raw progress data
    QuestProgress data = quester.getQuestProgressOrDefault(quest);
}
```

### Complete or Fail a Quest

```java
import me.pikamug.quests.Quests;
import me.pikamug.quests.player.Quester;
import me.pikamug.quests.quests.Quest;
import org.bukkit.Bukkit;

Quests quests = (Quests) Bukkit.getPluginManager().getPlugin("Quests");
Quester quester = quests.getQuester(player.getUniqueId());

Quest quest = quester.getCurrentQuests().keySet().stream()
        .filter(q -> q.getId().equals("my_quest"))
        .findFirst().orElse(null);

if (quest != null) {
    // Complete (gives rewards)
    quest.completeQuest(quester);

    // Or fail
    quest.failQuest(quester);

    // Or abandon (player-initiated quit)
    quester.quitQuest(quest, "You abandoned the quest.");
}
```

### Listen for Quest Events

```java
import me.pikamug.quests.events.quest.QuestTakeEvent;
import me.pikamug.quests.events.quest.QuestQuitEvent;
import me.pikamug.quests.events.quester.BukkitQuesterPostCompleteQuestEvent;
import me.pikamug.quests.events.quester.BukkitQuesterPreStartQuestEvent;
import me.pikamug.quests.events.quester.BukkitQuesterPostChangeStageEvent;
import me.pikamug.quests.events.quester.BukkitQuesterPostFailQuestEvent;
import me.pikamug.quests.player.Quester;
import me.pikamug.quests.quests.Quest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class QuestListener implements Listener {

    @EventHandler
    public void onQuestTake(QuestTakeEvent event) {
        // Cancellable — prevent a player from taking a quest
        Quest quest = event.getQuest();
        Quester quester = event.getQuester();
        Player player = quester.getPlayer();

        if (quest.getName().equals("Admin Only Quest")) {
            if (!player.hasPermission("quests.admin")) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onQuestComplete(BukkitQuesterPostCompleteQuestEvent event) {
        // Not cancellable — quest already completed
        Quester quester = event.getQuester();
        Quest quest = event.getQuest();
        quester.getPlayer().sendMessage("Congratulations on completing " + quest.getName() + "!");
    }

    @EventHandler
    public void onQuestFail(BukkitQuesterPostFailQuestEvent event) {
        Quester quester = event.getQuester();
        Quest quest = event.getQuest();
        quester.getPlayer().sendMessage("You failed " + quest.getName() + "!");
    }

    @EventHandler
    public void onStageChange(BukkitQuesterPostChangeStageEvent event) {
        // Stage transitions
        event.getCurrentStage(); // stage the player was on
        event.getNextStage();    // stage the player is moving to
    }

    @EventHandler
    public void onPreStart(BukkitQuesterPreStartQuestEvent event) {
        // Cancellable — fires before quest officially starts
        event.setCancelled(true); // block the quest from starting
    }

    @EventHandler
    public void onQuestQuit(QuestQuitEvent event) {
        // Cancellable — player is trying to quit/abandon
        event.setCancelled(true); // prevent quitting
    }
}
```

### Custom Requirement Module

Compile as a JAR and place in `plugins/Quests/modules/`.

```java
import me.pikamug.quests.module.BukkitCustomRequirement;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.UUID;

public class LevelRequirement extends BukkitCustomRequirement {

    public LevelRequirement() {
        setName("Level Requirement");
        setAuthor("YourName");
        setItem("EXPERIENCE_BOTTLE", (short) 0);
        setDisplay("You need at least %level% XP levels");
        addStringPrompt("level", "How many XP levels are required?", "10");
    }

    @Override
    public boolean testRequirement(UUID uuid, Map<String, Object> data) {
        Player player = Bukkit.getPlayer(uuid);
        if (player == null) return false;

        int required = Integer.parseInt((String) data.get("level"));
        return player.getLevel() >= required;
    }
}
```

### Custom Reward Module

Compile as a JAR and place in `plugins/Quests/modules/`.

```java
import me.pikamug.quests.module.BukkitCustomReward;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.UUID;

public class BroadcastReward extends BukkitCustomReward {

    public BroadcastReward() {
        setName("Broadcast Reward");
        setAuthor("YourName");
        setItem("NAME_TAG", (short) 0);
        setDisplay("Broadcasts a message to the server");
        addStringPrompt("message", "What message should be broadcast?", "A quest was completed!");
    }

    @Override
    public void giveReward(UUID uuid, Map<String, Object> data) {
        Player player = Bukkit.getPlayer(uuid);
        String message = (String) data.get("message");
        if (player != null) {
            message = message.replace("%player%", player.getName());
        }
        Bukkit.broadcastMessage(message);
    }
}
```

### Custom Objective Module

Compile as a JAR and place in `plugins/Quests/modules/`. The class acts as a Bukkit `Listener` — register event handlers directly.

```java
import me.pikamug.quests.module.BukkitCustomObjective;
import me.pikamug.quests.player.Quester;
import me.pikamug.quests.quests.Quest;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import java.util.Map;

public class EatGoldenAppleObjective extends BukkitCustomObjective {

    public EatGoldenAppleObjective() {
        setName("Eat Golden Apples");
        setAuthor("YourName");
        setItem("GOLDEN_APPLE", (short) 0);
        setShowCount(true);
        setCountPrompt("How many golden apples must be eaten?");
        setDisplay("Eat golden apples: %count%");
    }

    @EventHandler
    public void onEat(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();
        if (event.getItem().getType().name().contains("GOLDEN_APPLE")) {
            // Increment for all quests that use this objective
            incrementObjective(player.getUniqueId(), this, 1);
        }
    }

    // Overload: increment with quest context for data access
    private void incrementWithData(Player player, Quest quest) {
        Map<String, Object> data = getDataForPlayer(player.getUniqueId(), this, quest);
        // data contains values from addStringPrompt() calls
        incrementObjective(player.getUniqueId(), this, quest, 1);
    }
}
```

### Access Quest Stage Details

```java
import me.pikamug.quests.Quests;
import me.pikamug.quests.quests.Quest;
import me.pikamug.quests.quests.components.Stage;
import me.pikamug.quests.quests.components.Requirements;
import me.pikamug.quests.quests.components.Rewards;
import org.bukkit.Bukkit;

import java.util.LinkedList;

Quests quests = (Quests) Bukkit.getPluginManager().getPlugin("Quests");

for (Quest quest : quests.getLoadedQuests()) {
    String name = quest.getName();
    String description = quest.getDescription();

    // Requirements
    Requirements reqs = quest.getRequirements();
    int requiredMoney = reqs.getMoney();
    int requiredQuestPoints = reqs.getQuestPoints();
    boolean hasReqs = reqs.hasRequirement();

    // Rewards
    Rewards rewards = quest.getRewards();
    int rewardMoney = rewards.getMoney();
    int rewardExp = rewards.getExp();

    // Stages
    LinkedList<Stage> stages = quest.getStages();
    for (Stage stage : stages) {
        // Block objectives
        var blocksToBreak = stage.getBlocksToBreak();
        var blocksToPlace = stage.getBlocksToPlace();

        // Mob objectives
        var mobsToKill = stage.getMobsToKill();
        var mobCounts = stage.getMobNumToKill();

        // NPC objectives
        var npcsToTalkTo = stage.getNpcsToInteract();

        // Custom objectives
        var customObjs = stage.getCustomObjectives();

        // Stage delay
        long delay = stage.getDelay();
    }
}
```

## API Reference (Trimmed)

### `me.pikamug.quests.Quests` (interface)

| Return | Method | Description |
|---|---|---|
| `Collection<Quest>` | `getLoadedQuests()` | All loaded quests |
| `Quester` | `getQuester(UUID id)` | Get quester by UUID |
| `Collection<Quester>` | `getOnlineQuesters()` | All online questers |
| `Collection<Quester>` | `getOfflineQuesters()` | All offline questers |
| `List<CustomObjective>` | `getCustomObjectives()` | Loaded custom objectives |
| `List<CustomReward>` | `getCustomRewards()` | Loaded custom rewards |
| `List<CustomRequirement>` | `getCustomRequirements()` | Loaded custom requirements |
| `Collection<Action>` | `getLoadedActions()` | All loaded actions |
| `Collection<Condition>` | `getLoadedConditions()` | All loaded conditions |
| `Dependencies` | `getDependencies()` | Dependency manager |
| `ConfigSettings` | `getConfigSettings()` | Plugin configuration |
| `boolean` | `isLoading()` | Whether plugin is loading data |

### `me.pikamug.quests.quests.Quest` (interface)

| Return | Method | Description |
|---|---|---|
| `String` | `getId()` | Unique quest ID |
| `String` | `getName()` | Display name |
| `String` | `getDescription()` | Quest description |
| `String` | `getFinished()` | Completion message |
| `LinkedList<Stage>` | `getStages()` | All stages |
| `Stage` | `getStage(int index)` | Stage by index |
| `Requirements` | `getRequirements()` | Quest requirements |
| `Rewards` | `getRewards()` | Quest rewards |
| `Options` | `getOptions()` | Quest options |
| `Planner` | `getPlanner()` | Scheduling config |
| `UUID` | `getNpcStart()` | Start NPC UUID |
| `Action` | `getInitialAction()` | Action on quest start |
| `boolean` | `testRequirements(Quester)` | Check if quester meets requirements |
| `void` | `completeQuest(Quester)` | Complete for quester |
| `void` | `failQuest(Quester)` | Fail for quester |
| `void` | `nextStage(Quester, boolean)` | Advance to next stage |
| `void` | `setStage(Quester, int)` | Set specific stage |

### `me.pikamug.quests.player.Quester` (interface)

| Return | Method | Description |
|---|---|---|
| `UUID` | `getUUID()` | Player UUID |
| `Player` | `getPlayer()` | Online player |
| `OfflinePlayer` | `getOfflinePlayer()` | Offline player |
| `int` | `getQuestPoints()` | Quest points |
| `ConcurrentHashMap<Quest, Integer>` | `getCurrentQuests()` | Active quests (quest -> stage index) |
| `ConcurrentSkipListSet<Quest>` | `getCompletedQuests()` | Completed quests |
| `ConcurrentHashMap<Quest, Integer>` | `getAmountsCompleted()` | Times completed per quest |
| `ConcurrentHashMap<Quest, Long>` | `getCompletedTimes()` | Completion timestamps |
| `Stage` | `getCurrentStage(Quest)` | Current stage for a quest |
| `QuestProgress` | `getQuestProgressOrDefault(Quest)` | Progress data |
| `LinkedList<Objective>` | `getCurrentObjectives(Quest, boolean, boolean)` | Current objectives |
| `boolean` | `offerQuest(Quest, boolean)` | Offer quest to player |
| `void` | `takeQuest(Quest, boolean)` | Accept quest (true = ignore reqs) |
| `void` | `quitQuest(Quest, String)` | Quit with message |
| `void` | `hardQuit(Quest)` | Force quit silently |
| `boolean` | `testComplete(Quest)` | Check if all objectives met |
| `long` | `getRemainingCooldown(Quest)` | Cooldown remaining (millis) |
| `boolean` | `hasJournal()` | Has quest journal |
| `boolean` | `meetsCondition(Quest, boolean)` | Meets stage conditions |
| `boolean` | `hasObjective(Quest, ObjectiveType)` | Has objective type |
| `boolean` | `hasCustomObjective(Quest, String)` | Has named custom objective |
| `void` | `sendMessage(String)` | Send message to player |

### `me.pikamug.quests.quests.components.Objective` (interface)

| Return | Method | Description |
|---|---|---|
| `ObjectiveType` | `getType()` | Objective type enum |
| `String` | `getMessage()` | Display message |
| `int` | `getProgress()` | Current progress |
| `int` | `getGoal()` | Target count |

### `me.pikamug.quests.enums.ObjectiveType` (enum)

`BREAK_BLOCK`, `DAMAGE_BLOCK`, `PLACE_BLOCK`, `USE_BLOCK`, `CUT_BLOCK`, `CRAFT_ITEM`, `SMELT_ITEM`, `ENCHANT_ITEM`, `BREW_ITEM`, `CONSUME_ITEM`, `DELIVER_ITEM`, `MILK_COW`, `CATCH_FISH`, `KILL_MOB`, `KILL_PLAYER`, `TALK_TO_NPC`, `KILL_NPC`, `TAME_MOB`, `SHEAR_SHEEP`, `REACH_LOCATION`, `PASSWORD`, `CUSTOM`

### Custom Module Base Classes

| Class | Package | Extend For |
|---|---|---|
| `BukkitCustomRequirement` | `me.pikamug.quests.module` | Custom requirements |
| `BukkitCustomReward` | `me.pikamug.quests.module` | Custom rewards |
| `BukkitCustomObjective` | `me.pikamug.quests.module` | Custom objectives (also a `Listener`) |

**Shared constructor methods** (all three):
- `setName(String)` — unique module name
- `setAuthor(String)` — developer name
- `setItem(String type, short durability)` — display item
- `setDisplay(String)` — display text (supports `%placeholders%`)
- `addStringPrompt(String title, String description, Object defaultValue)` — editor config prompt

**BukkitCustomObjective additional:**
- `setShowCount(boolean)` — allow count configuration
- `setCountPrompt(String)` — count input description
- `Map<String, Object> getDataForPlayer(UUID, CustomObjective, Quest)` — get quest-specific data
- `void incrementObjective(UUID, CustomObjective, Quest, int)` — advance progress

### Events

| Event | Package | Cancellable | Key Methods |
|---|---|---|---|
| `QuestTakeEvent` | `me.pikamug.quests.events.quest` | Yes | `getQuest()`, `getQuester()` |
| `QuestQuitEvent` | `me.pikamug.quests.events.quest` | Yes | `getQuest()`, `getQuester()` |
| `QuestUpdateCompassEvent` | `me.pikamug.quests.events.quest` | Yes | `getQuest()`, `getQuester()`, `getNewCompassTarget()` |
| `BukkitQuesterPreStartQuestEvent` | `me.pikamug.quests.events.quester` | Yes | `getQuester()`, `getQuest()` |
| `BukkitQuesterPostStartQuestEvent` | `me.pikamug.quests.events.quester` | No | `getQuester()`, `getQuest()` |
| `BukkitQuesterPreCompleteQuestEvent` | `me.pikamug.quests.events.quester` | Yes | `getQuester()`, `getQuest()` |
| `BukkitQuesterPostCompleteQuestEvent` | `me.pikamug.quests.events.quester` | No | `getQuester()`, `getQuest()` |
| `BukkitQuesterPreFailQuestEvent` | `me.pikamug.quests.events.quester` | Yes | `getQuester()`, `getQuest()` |
| `BukkitQuesterPostFailQuestEvent` | `me.pikamug.quests.events.quester` | No | `getQuester()`, `getQuest()` |
| `BukkitQuesterPreChangeStageEvent` | `me.pikamug.quests.events.quester` | Yes | `getQuester()`, `getQuest()`, `getCurrentStage()`, `getNextStage()` |
| `BukkitQuesterPostChangeStageEvent` | `me.pikamug.quests.events.quester` | No | `getQuester()`, `getQuest()`, `getCurrentStage()`, `getNextStage()` |
| `BukkitQuesterPreUpdateObjectiveEvent` | `me.pikamug.quests.events.quester` | Yes | `getQuester()`, `getQuest()`, `getObjective()` |
| `BukkitQuesterPostUpdateObjectiveEvent` | `me.pikamug.quests.events.quester` | No | `getQuester()`, `getQuest()`, `getObjective()` |
| `BukkitQuesterPreOpenGUIEvent` | `me.pikamug.quests.events.quester` | Yes | `getQuester()`, `getNPC()`, `getQuests()` |
