# mcMMO API Reference

mcMMO is the most popular RPG skills plugin for Bukkit/Spigot/Paper. It adds skill leveling, abilities, parties, and experience systems. The API allows plugins to read/write player skill data, listen for mcMMO events, check ability states, manage parties, and interact with the chat and database systems. Add `mcMMO` to `depend` or `softdepend` in plugin.yml.

## Data Hierarchy / Class Overview

```
mcMMO.p (static plugin instance)
  |
  +-- ExperienceAPI (static: XP/level get/set for online & offline players)
  +-- PartyAPI (static: party membership, leaders, members)
  +-- AbilityAPI (static: super ability state checks & cooldowns)
  +-- ChatAPI (static: party/admin chat toggle & checks)
  +-- SkillAPI (static: skill name lists by category)
  +-- DatabaseAPI (static: player existence checks)
  |
  +-- SkillTools (via mcMMO.p.getSkillTools())
  |     +-- skill lookups, child/parent skill relations, level caps
  +-- PartyManager (via mcMMO.p.getPartyManager())
  +-- ChatManager (via mcMMO.p.getChatManager())
  +-- DatabaseManager (via mcMMO.getDatabaseManager())
  +-- FormulaManager (via mcMMO.getFormulaManager())
  |
  +-- PrimarySkillType (enum: 19 skills)
  +-- SubSkillType (enum: ~70 sub-skills)
  +-- SuperAbilityType (enum: 12 super abilities)
  +-- XPGainReason (enum: PVP, PVE, VAMPIRISM, etc.)
  +-- XPGainSource (enum: SELF, PASSIVE, PARTY_MEMBERS, etc.)
```

**Key rule:** All API classes use static methods. Do not instantiate `ExperienceAPI`, `PartyAPI`, etc.

**Key rule:** Always check if a player's mcMMO profile is loaded before API calls. Use `UserManager.getPlayer(player) != null` or wrap calls in try-catch for `McMMOPlayerNotFoundException`.

**Key rule:** Child skills (Salvage, Smelting) do NOT have their own XP. Their levels derive from parent skills. Many XP methods throw `UnsupportedOperationException` for child skills.

## Enums

### PrimarySkillType
`com.gmail.nossr50.datatypes.skills.PrimarySkillType`

```
ACROBATICS, ALCHEMY, ARCHERY, AXES, CROSSBOWS, EXCAVATION, FISHING,
HERBALISM, MACES, MINING, REPAIR, SALVAGE, SMELTING, SPEARS, SWORDS,
TAMING, TRIDENTS, UNARMED, WOODCUTTING
```

Child skills (no own XP): `SALVAGE`, `SMELTING`

### SuperAbilityType
`com.gmail.nossr50.datatypes.skills.SuperAbilityType`

```
EXPLOSIVE_SHOT (Archery), BERSERK (Unarmed), SUPER_BREAKER (Mining),
GIGA_DRILL_BREAKER (Excavation), GREEN_TERRA (Herbalism),
SKULL_SPLITTER (Axes), TREE_FELLER (Woodcutting),
SERRATED_STRIKES (Swords), SUPER_SHOTGUN (Crossbows),
TRIDENTS_SUPER_ABILITY, MACES_SUPER_ABILITY, SPEARS_SUPER_ABILITY,
BLAST_MINING (Mining, special cooldown-only ability)
```

### SubSkillType
`com.gmail.nossr50.datatypes.skills.SubSkillType`

Each sub-skill belongs to a parent primary skill. Format: `PARENTSKILL_SUBSKILLNAME(numRanks)`.

**Acrobatics:** ACROBATICS_DODGE(1), ACROBATICS_ROLL
**Alchemy:** ALCHEMY_CATALYSIS(1), ALCHEMY_CONCOCTIONS(8)
**Archery:** ARCHERY_ARROW_RETRIEVAL(1), ARCHERY_DAZE, ARCHERY_SKILL_SHOT(20), ARCHERY_ARCHERY_LIMIT_BREAK(10)
**Axes:** AXES_ARMOR_IMPACT(20), AXES_AXE_MASTERY(4), AXES_AXES_LIMIT_BREAK(10), AXES_CRITICAL_STRIKES(1), AXES_GREATER_IMPACT(1), AXES_SKULL_SPLITTER(1)
**Crossbows:** CROSSBOWS_CROSSBOWS_LIMIT_BREAK(10), CROSSBOWS_TRICK_SHOT(3), CROSSBOWS_POWERED_SHOT(20)
**Excavation:** EXCAVATION_ARCHAEOLOGY(8), EXCAVATION_GIGA_DRILL_BREAKER(1)
**Fishing:** FISHING_FISHERMANS_DIET(5), FISHING_ICE_FISHING(1), FISHING_MAGIC_HUNTER(1), FISHING_MASTER_ANGLER(8), FISHING_TREASURE_HUNTER(8), FISHING_SHAKE(8)
**Herbalism:** HERBALISM_DOUBLE_DROPS(1), HERBALISM_VERDANT_BOUNTY(1), HERBALISM_FARMERS_DIET(5), HERBALISM_GREEN_TERRA(1), HERBALISM_GREEN_THUMB(4), HERBALISM_HYLIAN_LUCK, HERBALISM_SHROOM_THUMB
**Maces:** MACES_MACES_LIMIT_BREAK(10), MACES_CRUSH(4), MACES_CRIPPLE(4)
**Mining:** MINING_BIGGER_BOMBS(1), MINING_BLAST_MINING(8), MINING_DEMOLITIONS_EXPERTISE(1), MINING_DOUBLE_DROPS(1), MINING_SUPER_BREAKER(1), MINING_MOTHER_LODE(1)
**Repair:** REPAIR_ARCANE_FORGING(8), REPAIR_REPAIR_MASTERY(1), REPAIR_SUPER_REPAIR(1)
**Salvage:** SALVAGE_SCRAP_COLLECTOR(8), SALVAGE_ARCANE_SALVAGE(8)
**Smelting:** SMELTING_FUEL_EFFICIENCY(3), SMELTING_SECOND_SMELT, SMELTING_UNDERSTANDING_THE_ART(8)
**Spears:** SPEARS_SPEARS_LIMIT_BREAK(10), SPEARS_MOMENTUM(10), SPEARS_SPEAR_MASTERY(8)
**Swords:** SWORDS_COUNTER_ATTACK(1), SWORDS_RUPTURE(4), SWORDS_SERRATED_STRIKES(1), SWORDS_STAB(2), SWORDS_SWORDS_LIMIT_BREAK(10)
**Taming:** TAMING_BEAST_LORE(1), TAMING_CALL_OF_THE_WILD(1), TAMING_ENVIRONMENTALLY_AWARE(1), TAMING_FAST_FOOD_SERVICE(1), TAMING_GORE(1), TAMING_HOLY_HOUND(1), TAMING_PUMMEL(1), TAMING_SHARPENED_CLAWS(1), TAMING_SHOCK_PROOF(1), TAMING_THICK_FUR(1)
**Tridents:** TRIDENTS_IMPALE(10), TRIDENTS_TRIDENTS_LIMIT_BREAK(10)
**Unarmed:** UNARMED_ARROW_DEFLECT(1), UNARMED_BERSERK(1), UNARMED_BLOCK_CRACKER, UNARMED_DISARM(1), UNARMED_STEEL_ARM_STYLE(20), UNARMED_IRON_GRIP(1), UNARMED_UNARMED_LIMIT_BREAK(10)
**Woodcutting:** WOODCUTTING_KNOCK_ON_WOOD(2), WOODCUTTING_HARVEST_LUMBER(1), WOODCUTTING_LEAF_BLOWER(1), WOODCUTTING_TREE_FELLER(1), WOODCUTTING_CLEAN_CUTS(1)

### XPGainReason
`com.gmail.nossr50.datatypes.experience.XPGainReason`

```
PVP, PVE, VAMPIRISM, SHARED_PVP, SHARED_PVE, COMMAND, UNKNOWN
```

### XPGainSource
`com.gmail.nossr50.datatypes.experience.XPGainSource`

```
SELF, VAMPIRISM, PASSIVE, PARTY_MEMBERS, COMMAND, CUSTOM
```

### FormulaType
`com.gmail.nossr50.datatypes.experience.FormulaType`

```
LINEAR, EXPONENTIAL, UNKNOWN
```

### ItemSpawnReason
`com.gmail.nossr50.api.ItemSpawnReason`

```
ARROW_RETRIEVAL_ACTIVATED, EXCAVATION_TREASURE, FISHING_EXTRA_FISH,
FISHING_SHAKE_TREASURE, HYLIAN_LUCK_TREASURE, BLAST_MINING_DEBRIS_NON_ORES,
BLAST_MINING_ORES, BLAST_MINING_ORES_BONUS_DROP, UNARMED_DISARMED_ITEM,
SALVAGE_ENCHANTMENT_BOOK, SALVAGE_MATERIALS, TREE_FELLER_DISPLACED_BLOCK,
BONUS_DROPS
```

## Code Examples

### Check a Player's Skill Level

```java
import com.gmail.nossr50.api.ExperienceAPI;
import com.gmail.nossr50.datatypes.skills.PrimarySkillType;

// Using string-based API
int miningLevel = ExperienceAPI.getLevel(player, "MINING");

// Using enum-based API (preferred)
int swordsLevel = ExperienceAPI.getLevel(player, PrimarySkillType.SWORDS);
```

### Get Power Level (Sum of All Skills)

```java
int powerLevel = ExperienceAPI.getPowerLevel(player);
// For offline players:
int offlinePower = ExperienceAPI.getPowerLevelOffline(playerUUID);
```

### Add XP to a Player

```java
// Raw XP (no multipliers applied)
ExperienceAPI.addRawXP(player, "MINING", 500.0f, "PVE");

// XP with global multiplier applied
ExperienceAPI.addMultipliedXP(player, "MINING", 500, "PVE");

// XP with global multiplier + skill modifier
ExperienceAPI.addModifiedXP(player, "MINING", 500, "PVE");

// Full XP processing (rate, modifiers, perks, child skills, party sharing)
ExperienceAPI.addXP(player, "MINING", 500, "PVE");

// Unshared XP (won't be shared with party members)
ExperienceAPI.addRawXP(player, "MINING", 500.0f, "PVE", true);

// Add XP to offline player
ExperienceAPI.addRawXPOffline(playerUUID, "MINING", 500.0f);
```

### Set/Get XP and Levels

```java
// Set level directly
ExperienceAPI.setLevel(player, "MINING", 50);
ExperienceAPI.setLevelOffline(playerUUID, "MINING", 50);

// Add levels
ExperienceAPI.addLevel(player, "MINING", 10);
ExperienceAPI.addLevelOffline(playerUUID, "MINING", 10);

// Set XP within current level
ExperienceAPI.setXP(player, "MINING", 200);

// Remove XP
ExperienceAPI.removeXP(player, "MINING", 100);

// Get current XP in level
int xp = ExperienceAPI.getXP(player, "MINING");
float rawXp = ExperienceAPI.getXPRaw(player, "MINING");

// Get XP needed for next level
int xpToNext = ExperienceAPI.getXPToNextLevel(player, "MINING");
int xpRemaining = ExperienceAPI.getXPRemaining(player, "MINING");

// Get level cap
int cap = ExperienceAPI.getLevelCap("MINING");
int powerCap = ExperienceAPI.getPowerLevelCap();
```

### Leaderboard Rank

```java
// Get rank for a specific skill
int rank = ExperienceAPI.getPlayerRankSkill(playerUUID, "MINING");

// Get overall power level rank
int overallRank = ExperienceAPI.getPlayerRankOverall(playerUUID);
```

### XP Formula Calculations

```java
// How much XP is needed for a specific level
int xpNeeded = ExperienceAPI.getXpNeededToLevel(50);
int xpNeededExp = ExperienceAPI.getXpNeededToLevel(50, "EXPONENTIAL");
```

### Block-Based XP

```java
import com.gmail.nossr50.api.ExperienceAPI;
import com.gmail.nossr50.datatypes.player.McMMOPlayer;
import com.gmail.nossr50.util.player.UserManager;

McMMOPlayer mmoPlayer = UserManager.getPlayer(player);

// Add XP from block states (auto-detects skill type)
ExperienceAPI.addXpFromBlocks(blockStates, mmoPlayer);

// Add XP from blocks for a specific skill only
ExperienceAPI.addXpFromBlocksBySkill(blockStates, mmoPlayer, PrimarySkillType.MINING);

// Single block
ExperienceAPI.addXpFromBlock(blockState, mmoPlayer);
ExperienceAPI.addXpFromBlockBySkill(blockState, mmoPlayer, PrimarySkillType.MINING);
```

### Combat XP

```java
McMMOPlayer mmoPlayer = UserManager.getPlayer(player);
// Process combat XP with multiplier
ExperienceAPI.addCombatXP(mmoPlayer, targetEntity, PrimarySkillType.SWORDS, 1.5);
// Process combat XP with default multiplier
ExperienceAPI.addCombatXP(mmoPlayer, targetEntity, PrimarySkillType.SWORDS);
```

### Check Super Ability Status

```java
import com.gmail.nossr50.api.AbilityAPI;

boolean isBerserk = AbilityAPI.berserkEnabled(player);
boolean isSuperBreaker = AbilityAPI.superBreakerEnabled(player);
boolean isGigaDrill = AbilityAPI.gigaDrillBreakerEnabled(player);
boolean isGreenTerra = AbilityAPI.greenTerraEnabled(player);
boolean isSerratedStrikes = AbilityAPI.serratedStrikesEnabled(player);
boolean isSkullSplitter = AbilityAPI.skullSplitterEnabled(player);
boolean isTreeFeller = AbilityAPI.treeFellerEnabled(player);
boolean anyActive = AbilityAPI.isAnyAbilityEnabled(player);
```

### Reset/Set Ability Cooldowns

```java
// Reset all cooldowns
AbilityAPI.resetCooldowns(player);

// Set specific cooldowns (epoch timestamp in seconds)
AbilityAPI.setBerserkCooldown(player, cooldownTimestamp);
AbilityAPI.setSuperBreakerCooldown(player, cooldownTimestamp);
AbilityAPI.setGigaDrillBreakerCooldown(player, cooldownTimestamp);
AbilityAPI.setGreenTerraCooldown(player, cooldownTimestamp);
AbilityAPI.setSerratedStrikesCooldown(player, cooldownTimestamp);
AbilityAPI.setSkullSplitterCooldown(player, cooldownTimestamp);
AbilityAPI.setTreeFellerCooldown(player, cooldownTimestamp);
```

### Check Bleeding (Rupture)

```java
boolean isBleeding = AbilityAPI.isBleeding(livingEntity);
```

### Party Management

```java
import com.gmail.nossr50.api.PartyAPI;

// Check party system
boolean enabled = PartyAPI.isPartySystemEnabled();
boolean inParty = PartyAPI.inParty(player);
boolean sameParty = PartyAPI.inSameParty(playerA, playerB);

// Get party info
String partyName = PartyAPI.getPartyName(player);
String leader = PartyAPI.getPartyLeader("MyParty");
int maxSize = PartyAPI.getMaxPartySize();

// Get members
List<Player> online = PartyAPI.getOnlineMembers("MyParty");
List<Player> onlineByPlayer = PartyAPI.getOnlineMembers(player);
LinkedHashMap<UUID, String> members = PartyAPI.getMembersMap(player);

// Manage membership
PartyAPI.addToParty(player, "MyParty", true); // bypass size limit
PartyAPI.removeFromParty(player);

// Alliance
boolean hasAlly = PartyAPI.hasAlly("MyParty");
String allyName = PartyAPI.getAllyName("MyParty");

// Get all parties
List<Party> allParties = PartyAPI.getParties();
```

### Chat API

```java
import com.gmail.nossr50.api.ChatAPI;

// Check chat mode
boolean usingParty = ChatAPI.isUsingPartyChat(player);
boolean usingAdmin = ChatAPI.isUsingAdminChat(player);

// Toggle chat modes
ChatAPI.togglePartyChat(player);
ChatAPI.toggleAdminChat(player);

// String-based variants also available
ChatAPI.isUsingPartyChat("playerName");
ChatAPI.togglePartyChat("playerName");
```

### Skill Queries

```java
import com.gmail.nossr50.api.SkillAPI;

List<String> allSkills = SkillAPI.getSkills();           // All skills including children
List<String> parentSkills = SkillAPI.getNonChildSkills(); // Parent skills only
List<String> childSkills = SkillAPI.getChildSkills();     // Child skills only
List<String> combatSkills = SkillAPI.getCombatSkills();
List<String> gatheringSkills = SkillAPI.getGatheringSkills();
List<String> miscSkills = SkillAPI.getMiscSkills();
```

### Database Checks

```java
import com.gmail.nossr50.api.DatabaseAPI;

boolean exists = DatabaseAPI.doesPlayerExistInDB(offlinePlayer);
boolean existsUUID = DatabaseAPI.doesPlayerExistInDB(playerUUID);
boolean existsName = DatabaseAPI.doesPlayerExistInDB("playerName");
```

### Validate Skill Types

```java
boolean valid = ExperienceAPI.isValidSkillType("MINING");     // true
boolean nonChild = ExperienceAPI.isNonChildSkill("MINING");   // true
boolean nonChild2 = ExperienceAPI.isNonChildSkill("SALVAGE"); // false (child skill)
```

### Listen for XP Gain Event

```java
import com.gmail.nossr50.events.experience.McMMOPlayerXpGainEvent;

@EventHandler
public void onXpGain(McMMOPlayerXpGainEvent event) {
    Player player = event.getPlayer();
    PrimarySkillType skill = event.getSkill();
    float xpGained = event.getRawXpGained();
    XPGainReason reason = event.getXpGainReason();

    // Modify XP
    event.setRawXpGained(xpGained * 2.0f);

    // Or cancel it
    event.setCancelled(true);
}
```

### Listen for Level Up Event

```java
import com.gmail.nossr50.events.experience.McMMOPlayerLevelUpEvent;

@EventHandler
public void onLevelUp(McMMOPlayerLevelUpEvent event) {
    Player player = event.getPlayer();
    PrimarySkillType skill = event.getSkill();
    int levelsGained = event.getLevelsGained();
    int currentLevel = event.getSkillLevel();

    player.sendMessage("You gained " + levelsGained + " level(s) in " + skill.name());
}
```

### Listen for Ability Activation

```java
import com.gmail.nossr50.events.skills.abilities.McMMOPlayerAbilityActivateEvent;

@EventHandler
public void onAbilityActivate(McMMOPlayerAbilityActivateEvent event) {
    Player player = event.getPlayer();
    PrimarySkillType skill = event.getSkill();
    SuperAbilityType ability = event.getAbility();

    // Cancel ability activation
    event.setCancelled(true);
}
```

### Listen for Party Changes

```java
import com.gmail.nossr50.events.party.McMMOPartyChangeEvent;

@EventHandler
public void onPartyChange(McMMOPartyChangeEvent event) {
    Player player = event.getPlayer();
    String oldParty = event.getOldParty();   // null if not previously in party
    String newParty = event.getNewParty();   // null if leaving
    McMMOPartyChangeEvent.EventReason reason = event.getReason();
    // Reasons: CREATED_PARTY, DISBANDED_PARTY, JOINED_PARTY,
    //          LEFT_PARTY, KICKED_FROM_PARTY, CHANGED_PARTIES, CUSTOM

    event.setCancelled(true); // prevent the party change
}
```

### Listen for mcMMO Item Drops

```java
import com.gmail.nossr50.events.items.McMMOItemSpawnEvent;

@EventHandler
public void onItemSpawn(McMMOItemSpawnEvent event) {
    ItemStack item = event.getItemStack();
    Location loc = event.getLocation();
    ItemSpawnReason reason = event.getItemSpawnReason();
    Player player = event.getPlayer(); // may be null

    // Modify the drop
    event.setItemStack(newItem);
    event.setLocation(newLocation);

    // Cancel the drop
    event.setCancelled(true);
}
```

### Modify Bonus Block Drops

```java
import com.gmail.nossr50.events.items.McMMOModifyBlockDropItemEvent;

@EventHandler
public void onBonusDrop(McMMOModifyBlockDropItemEvent event) {
    int originalBonus = event.getOriginalBonusAmountToAdd();
    int currentQuantity = event.getModifiedItemStackQuantity();
    Item item = event.getItem();

    // Double the bonus
    event.setBonusAmountToAdd(originalBonus * 2);
    // Or set exact quantity
    event.setModifiedItemStackQuantity(10);
    // Or cancel the bonus entirely
    event.setCancelled(true);
}
```

### Detect Fake Events from mcMMO

```java
import com.gmail.nossr50.events.fake.FakeEvent;
import com.gmail.nossr50.api.TreeFellerBlockBreakEvent;

@EventHandler
public void onBlockBreak(BlockBreakEvent event) {
    if (event instanceof FakeEvent) {
        // This block break was caused by mcMMO (e.g., Tree Feller)
        return;
    }
    if (event instanceof TreeFellerBlockBreakEvent) {
        // Specifically from Tree Feller
        return;
    }
}
```

## API Classes -- Full Method Reference

### ExperienceAPI
`com.gmail.nossr50.api.ExperienceAPI`

All methods are `public static`. Skills are specified as `String skillType` (e.g. `"MINING"`) unless noted.

| Method | Returns | Description |
|--------|---------|-------------|
| `isValidSkillType(String skillType)` | `boolean` | Check if a string is a valid mcMMO skill name |
| `isNonChildSkill(String skillType)` | `boolean` | Check if valid and not a child skill |
| `addCombatXP(McMMOPlayer, LivingEntity, PrimarySkillType, double)` | `void` | Process combat XP with multiplier (deprecated draft API) |
| `addCombatXP(McMMOPlayer, LivingEntity, PrimarySkillType)` | `void` | Process combat XP normally (deprecated draft API) |
| `addRawXP(Player, String, float, String)` | `void` | Add raw XP with gain reason |
| `addRawXP(Player, String, float, String, boolean)` | `void` | Add raw XP; if isUnshared=true, won't share with party |
| `addRawXPOffline(UUID, String, float)` | `void` | Add raw XP to offline player |
| `addMultipliedXP(Player, String, int, String)` | `void` | Add XP with global XP rate multiplier |
| `addModifiedXP(Player, String, int, String)` | `void` | Add XP with global rate + skill modifier |
| `addModifiedXP(Player, String, int, String, boolean)` | `void` | Same with unshared option |
| `addXP(Player, String, int, String)` | `void` | Full XP processing (rate, modifiers, perks, party) |
| `addXP(Player, String, int, String, boolean)` | `void` | Same with unshared option |
| `getXP(Player, String)` | `int` | Get current XP in a skill (non-child only) |
| `getXPRaw(Player, String)` | `float` | Get raw float XP in a skill |
| `getOfflineXP(UUID, String)` | `int` | Get offline player's XP |
| `getOfflineXPRaw(UUID, String)` | `float` | Get offline player's raw float XP |
| `getOfflineXPRaw(OfflinePlayer, String)` | `float` | Get offline player's raw float XP |
| `getOfflineXPRaw(OfflinePlayer, PrimarySkillType)` | `float` | Get offline player's raw float XP by enum |
| `getXPToNextLevel(Player, String)` | `int` | Total XP needed for next level |
| `getOfflineXPToNextLevel(UUID, String)` | `int` | Offline: total XP for next level |
| `getXPRemaining(Player, String)` | `int` | XP remaining until next level |
| `getOfflineXPRemaining(UUID, String)` | `float` | Offline: XP remaining until next level |
| `getOfflineXPRemaining(OfflinePlayer, String)` | `float` | Offline: XP remaining until next level |
| `addLevel(Player, String, int)` | `void` | Add levels to a skill |
| `addLevelOffline(UUID, String, int)` | `void` | Add levels for offline player |
| `getLevel(Player, String)` | `int` | Get skill level (deprecated, use PrimarySkillType overload) |
| `getLevel(Player, PrimarySkillType)` | `int` | Get skill level by enum |
| `getLevelOffline(String, String)` | `int` | Get offline player's level by name |
| `getLevelOffline(UUID, String)` | `int` | Get offline player's level by UUID |
| `getPowerLevel(Player)` | `int` | Get sum of all skill levels |
| `getPowerLevelOffline(UUID)` | `int` | Get offline player's power level |
| `getLevelCap(String)` | `int` | Get level cap for a skill |
| `getPowerLevelCap()` | `int` | Get overall power level cap |
| `getPlayerRankSkill(UUID, String)` | `int` | Get leaderboard position for a skill |
| `getPlayerRankOverall(UUID)` | `int` | Get overall leaderboard position |
| `setLevel(Player, String, int)` | `void` | Set a player's skill level |
| `setLevelOffline(UUID, String, int)` | `void` | Set offline player's skill level |
| `setXP(Player, String, int)` | `void` | Set XP within current level |
| `setXPOffline(UUID, String, int)` | `void` | Set offline player's XP |
| `removeXP(Player, String, int)` | `void` | Remove XP from a player |
| `removeXPOffline(UUID, String, int)` | `void` | Remove XP from offline player |
| `getXpNeededToLevel(int)` | `int` | XP needed for a specific level (current formula) |
| `getXpNeededToLevel(int, String)` | `int` | XP needed for a level with specified formula type |
| `addXpFromBlocks(ArrayList<BlockState>, McMMOPlayer)` | `void` | Add XP from blocks (auto-detects skill) |
| `addXpFromBlocksBySkill(ArrayList<BlockState>, McMMOPlayer, PrimarySkillType)` | `void` | Add XP from blocks for specific skill |
| `addXpFromBlock(BlockState, McMMOPlayer)` | `void` | Add XP from single block |
| `addXpFromBlockBySkill(BlockState, McMMOPlayer, PrimarySkillType)` | `void` | Add XP from single block for specific skill |

**Throws:** `InvalidSkillException`, `InvalidPlayerException`, `InvalidXPGainReasonException`, `InvalidFormulaTypeException`, `McMMOPlayerNotFoundException`, `UnsupportedOperationException` (child skills)

### AbilityAPI
`com.gmail.nossr50.api.AbilityAPI`

All methods are `public static`.

| Method | Returns | Description |
|--------|---------|-------------|
| `berserkEnabled(Player)` | `boolean` | Check if Berserk (Unarmed) is active |
| `gigaDrillBreakerEnabled(Player)` | `boolean` | Check if Giga Drill Breaker (Excavation) is active |
| `greenTerraEnabled(Player)` | `boolean` | Check if Green Terra (Herbalism) is active |
| `serratedStrikesEnabled(Player)` | `boolean` | Check if Serrated Strikes (Swords) is active |
| `skullSplitterEnabled(Player)` | `boolean` | Check if Skull Splitter (Axes) is active |
| `superBreakerEnabled(Player)` | `boolean` | Check if Super Breaker (Mining) is active |
| `treeFellerEnabled(Player)` | `boolean` | Check if Tree Feller (Woodcutting) is active |
| `isAnyAbilityEnabled(Player)` | `boolean` | Check if player has any super ability active |
| `resetCooldowns(Player)` | `void` | Reset all ability cooldowns |
| `setBerserkCooldown(Player, long)` | `void` | Set Berserk cooldown timestamp |
| `setGigaDrillBreakerCooldown(Player, long)` | `void` | Set Giga Drill Breaker cooldown |
| `setGreenTerraCooldown(Player, long)` | `void` | Set Green Terra cooldown |
| `setSerratedStrikesCooldown(Player, long)` | `void` | Set Serrated Strikes cooldown |
| `setSkullSplitterCooldown(Player, long)` | `void` | Set Skull Splitter cooldown |
| `setSuperBreakerCooldown(Player, long)` | `void` | Set Super Breaker cooldown |
| `setTreeFellerCooldown(Player, long)` | `void` | Set Tree Feller cooldown |
| `isBleeding(LivingEntity)` | `boolean` | Check if entity has Rupture (bleed) effect |

### PartyAPI
`com.gmail.nossr50.api.PartyAPI`

All methods are `public static`.

| Method | Returns | Description |
|--------|---------|-------------|
| `isPartySystemEnabled()` | `boolean` | Check if party system is enabled |
| `getPartyName(Player)` | `String` | Get player's party name, or null |
| `inParty(Player)` | `boolean` | Check if player is in a party |
| `inSameParty(Player, Player)` | `boolean` | Check if two players share a party |
| `getParties()` | `List<Party>` | Get all current parties |
| `addToParty(Player, String)` | `void` | Add player to party (deprecated, respects limits) |
| `addToParty(Player, String, boolean)` | `void` | Add player to party, optionally bypass size limit |
| `getMaxPartySize()` | `int` | Get max party size (0 or less = no limit) |
| `removeFromParty(Player)` | `void` | Remove player from their party |
| `getPartyLeader(String)` | `@Nullable String` | Get party leader name by party name |
| `setPartyLeader(String, String)` | `void` | Set party leader (deprecated, uses player name) |
| `getOnlineAndOfflineMembers(Player)` | `List<OfflinePlayer>` | Get all party members (deprecated) |
| `getMembers(Player)` | `LinkedHashSet<String>` | Get member names (deprecated) |
| `getMembersMap(Player)` | `LinkedHashMap<UUID, String>` | Get member UUID-to-name map |
| `getOnlineMembers(String)` | `List<Player>` | Get online members by party name |
| `getOnlineMembers(Player)` | `List<Player>` | Get online members of player's party |
| `hasAlly(String)` | `boolean` | Check if party has an alliance |
| `getAllyName(String)` | `String` | Get allied party name, or null |

### ChatAPI
`com.gmail.nossr50.api.ChatAPI`

All methods are `public static`.

| Method | Returns | Description |
|--------|---------|-------------|
| `isUsingPartyChat(Player)` | `boolean` | Check if player is in party chat mode |
| `isUsingPartyChat(String)` | `boolean` | Check by player name |
| `isUsingAdminChat(Player)` | `boolean` | Check if player is in admin chat mode |
| `isUsingAdminChat(String)` | `boolean` | Check by player name |
| `togglePartyChat(Player)` | `void` | Toggle party chat mode |
| `togglePartyChat(String)` | `void` | Toggle by player name |
| `toggleAdminChat(Player)` | `void` | Toggle admin chat mode |
| `toggleAdminChat(String)` | `void` | Toggle by player name |

### SkillAPI
`com.gmail.nossr50.api.SkillAPI`

All methods are `public static`. Return `List<String>` of skill names.

| Method | Description |
|--------|-------------|
| `getSkills()` | All skills including child skills |
| `getNonChildSkills()` | Parent skills only |
| `getChildSkills()` | Child skills only (Salvage, Smelting) |
| `getCombatSkills()` | Combat skills only |
| `getGatheringSkills()` | Gathering skills only |
| `getMiscSkills()` | Miscellaneous skills only |

### DatabaseAPI
`com.gmail.nossr50.api.DatabaseAPI`

All methods are `public static`.

| Method | Returns | Description |
|--------|---------|-------------|
| `doesPlayerExistInDB(OfflinePlayer)` | `boolean` | Check if player exists in mcMMO database |
| `doesPlayerExistInDB(UUID)` | `boolean` | Check by UUID |
| `doesPlayerExistInDB(String)` | `boolean` | Check by player name |

## Events -- Full Reference

All events are in the `com.gmail.nossr50.events` package tree.

### Experience Events

#### McMMOPlayerExperienceEvent (abstract base)
`com.gmail.nossr50.events.experience.McMMOPlayerExperienceEvent`
Extends `PlayerEvent`, implements `Cancellable`.

| Method | Returns | Description |
|--------|---------|-------------|
| `getSkill()` | `PrimarySkillType` | The skill involved |
| `getSkillLevel()` | `int` | Current level of the skill |
| `getXpGainReason()` | `XPGainReason` | Why XP is being gained |
| `isCancelled()` | `boolean` | Whether event is cancelled |
| `setCancelled(boolean)` | `void` | Cancel the event |

#### McMMOPlayerPreXpGainEvent
`com.gmail.nossr50.events.experience.McMMOPlayerPreXpGainEvent`
Extends `McMMOPlayerExperienceEvent`. **Cancellable.** Called BEFORE XP is processed.

| Method | Returns | Description |
|--------|---------|-------------|
| `getXpGained()` | `int` | Amount of XP to be gained |
| `setXpGained(int)` | `void` | Modify XP amount |

#### McMMOPlayerXpGainEvent
`com.gmail.nossr50.events.experience.McMMOPlayerXpGainEvent`
Extends `McMMOPlayerExperienceEvent`. **Cancellable.** Called when XP is gained.

| Method | Returns | Description |
|--------|---------|-------------|
| `getRawXpGained()` | `float` | Raw float XP gained |
| `getXpGained()` | `int` | Integer XP gained (deprecated) |
| `setRawXpGained(float)` | `void` | Modify raw XP amount |
| `setXpGained(int)` | `void` | Modify XP amount (deprecated) |

#### McMMOPlayerLevelChangeEvent (abstract)
`com.gmail.nossr50.events.experience.McMMOPlayerLevelChangeEvent`
Extends `McMMOPlayerExperienceEvent`. **Cancellable.** Base for level up/down events.

#### McMMOPlayerLevelUpEvent
`com.gmail.nossr50.events.experience.McMMOPlayerLevelUpEvent`
Extends `McMMOPlayerLevelChangeEvent`. **Cancellable.** Called when player levels up.

| Method | Returns | Description |
|--------|---------|-------------|
| `getLevelsGained()` | `int` | Number of levels gained |
| `setLevelsGained(int)` | `void` | Modify levels gained |

#### McMMOPlayerLevelDownEvent
`com.gmail.nossr50.events.experience.McMMOPlayerLevelDownEvent`
Extends `McMMOPlayerLevelChangeEvent`. **Cancellable.** Called when player loses levels.

| Method | Returns | Description |
|--------|---------|-------------|
| `getLevelsLost()` | `int` | Number of levels lost |
| `setLevelsLost(int)` | `void` | Modify levels lost |

### Chat Events

#### McMMOChatEvent (abstract base)
`com.gmail.nossr50.events.chat.McMMOChatEvent`
Extends `Event`, implements `Cancellable`. **Cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getAuthor()` | `Author` | Message author |
| `getAudience()` | `Audience` | Message audience (Adventure API) |
| `setAudience(Audience)` | `void` | Change audience |
| `getPlugin()` | `Plugin` | Responsible plugin |
| `getDisplayName(ChatChannel)` | `String` | Author's display name |
| `getMessage()` | `String` | Raw message (deprecated) |
| `getRawMessage()` | `String` | Original message typed by player |
| `getComponentMessage()` | `TextComponent` | Formatted Adventure component |
| `setMessagePayload(TextComponent)` | `void` | Set formatted message |
| `setMessage(String)` | `void` | Set message string (deprecated) |
| `getChatMessage()` | `ChatMessage` | The chat message object |

#### McMMOPartyChatEvent
`com.gmail.nossr50.events.chat.McMMOPartyChatEvent`
Extends `McMMOChatEvent`. **Cancellable.** Fired for party chat messages.

| Method | Returns | Description |
|--------|---------|-------------|
| `getParty()` | `String` | Party name (deprecated) |
| `getPartyChatMessage()` | `PartyChatMessage` | The party chat message |
| `getAuthorParty()` | `Party` | The author's party object |

#### McMMOAdminChatEvent
`com.gmail.nossr50.events.chat.McMMOAdminChatEvent`
Extends `McMMOChatEvent`. **Cancellable.** Fired for admin chat messages. No additional methods.

### Party Events

#### McMMOPartyChangeEvent
`com.gmail.nossr50.events.party.McMMOPartyChangeEvent`
Extends `PlayerEvent`, implements `Cancellable`. **Cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getOldParty()` | `String` | Previous party name, or null |
| `getNewParty()` | `String` | New party name, or null |
| `getReason()` | `EventReason` | Why the change happened |

**EventReason enum:** `CREATED_PARTY`, `DISBANDED_PARTY`, `JOINED_PARTY`, `LEFT_PARTY`, `KICKED_FROM_PARTY`, `CHANGED_PARTIES`, `CUSTOM`

#### McMMOPartyAllianceChangeEvent
`com.gmail.nossr50.events.party.McMMOPartyAllianceChangeEvent`
Extends `PlayerEvent`, implements `Cancellable`. **Cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getOldAlly()` | `String` | Previous ally party name, or null |
| `getNewAlly()` | `String` | New ally party name, or null |
| `getReason()` | `EventReason` | Why the alliance changed |

**EventReason enum:** `FORMED_ALLIANCE`, `DISBAND_ALLIANCE`, `CUSTOM`

#### McMMOPartyLevelUpEvent
`com.gmail.nossr50.events.party.McMMOPartyLevelUpEvent`
Extends `Event`, implements `Cancellable`. **Cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getParty()` | `Party` | The party that leveled up |
| `getLevelsChanged()` | `int` | Number of levels gained |
| `setLevelsChanged(int)` | `void` | Modify levels gained |

#### McMMOPartyXpGainEvent
`com.gmail.nossr50.events.party.McMMOPartyXpGainEvent`
Extends `Event`, implements `Cancellable`. **Cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getParty()` | `Party` | The party gaining XP |
| `getRawXpGained()` | `float` | Raw float XP gained |
| `getXpGained()` | `int` | Integer XP (deprecated) |
| `setRawXpGained(float)` | `void` | Modify raw XP |
| `setXpGained(int)` | `void` | Modify XP (deprecated) |

#### McMMOPartyTeleportEvent
`com.gmail.nossr50.events.party.McMMOPartyTeleportEvent`
Extends `PlayerTeleportEvent`. **Cancellable** (inherits from Bukkit).

| Method | Returns | Description |
|--------|---------|-------------|
| `getParty()` | `String` | Party name |
| `getTarget()` | `Player` | Player being teleported to |

### Skill Events

#### McMMOPlayerSkillEvent (abstract base)
`com.gmail.nossr50.events.skills.McMMOPlayerSkillEvent`
Extends `PlayerEvent`.

| Method | Returns | Description |
|--------|---------|-------------|
| `getSkill()` | `PrimarySkillType` | The skill involved |
| `getSkillLevel()` | `int` | Current skill level |
| `getMcMMOPlayer()` | `McMMOPlayer` | The McMMOPlayer instance |

#### McMMOPlayerNotificationEvent
`com.gmail.nossr50.events.skills.McMMOPlayerNotificationEvent`
Extends `Event`, implements `Cancellable`. **Cancellable.** Fired when mcMMO sends notifications to players.

| Method | Returns | Description |
|--------|---------|-------------|
| `getPlayer()` | `Player` | Target player |
| `getNotificationTextComponent()` | `Component` | Adventure text component |
| `setNotificationTextComponent(Component)` | `void` | Modify notification text |
| `getChatMessageType()` | `McMMOMessageType` | Message delivery type |
| `setChatMessageType(McMMOMessageType)` | `void` | Change delivery type |
| `getEventNotificationType()` | `NotificationType` | Notification category |
| `isMessageAlsoBeingSentToChat()` | `boolean` | Whether also sent to chat |
| `setMessageAlsoBeingSentToChat(boolean)` | `void` | Toggle chat copy |

#### SkillActivationPerkEvent
`com.gmail.nossr50.events.skills.SkillActivationPerkEvent`
Extends `Event`. **Not cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getPlayer()` | `Player` | The player |
| `getTicks()` | `int` | Activation ticks |
| `setTicks(int)` | `void` | Modify ticks |
| `getMaxTicks()` | `int` | Maximum allowed ticks |

### Ability Events

#### McMMOPlayerAbilityEvent (abstract)
`com.gmail.nossr50.events.skills.abilities.McMMOPlayerAbilityEvent`
Extends `McMMOPlayerSkillEvent`.

| Method | Returns | Description |
|--------|---------|-------------|
| `getAbility()` | `SuperAbilityType` | The super ability type |

#### McMMOPlayerAbilityActivateEvent
`com.gmail.nossr50.events.skills.abilities.McMMOPlayerAbilityActivateEvent`
Extends `McMMOPlayerAbilityEvent`, implements `Cancellable`. **Cancellable.**

#### McMMOPlayerAbilityDeactivateEvent
`com.gmail.nossr50.events.skills.abilities.McMMOPlayerAbilityDeactivateEvent`
Extends `McMMOPlayerAbilityEvent`. **Not cancellable.**

### SubSkill Events

#### SubSkillEvent
`com.gmail.nossr50.events.skills.secondaryabilities.SubSkillEvent`
Extends `McMMOPlayerSkillEvent`, implements `Cancellable`. **Cancellable.** Fired when sub-skills activate.

| Method | Returns | Description |
|--------|---------|-------------|
| `getSubSkillType()` | `SubSkillType` | The sub-skill type |
| `getResultModifier()` | `double` | Multiplier on dice roll result |
| `setResultModifier(double)` | `void` | Modify the result multiplier |

#### SubSkillBlockEvent
`com.gmail.nossr50.events.skills.secondaryabilities.SubSkillBlockEvent`
Extends `SubSkillEvent`. **Cancellable.** Fired for block-related sub-skill activations.

| Method | Returns | Description |
|--------|---------|-------------|
| `getBlock()` | `Block` | The block involved |

### Fishing Events

#### McMMOPlayerFishingEvent (abstract base)
`com.gmail.nossr50.events.skills.fishing.McMMOPlayerFishingEvent`
Extends `McMMOPlayerSkillEvent`, implements `Cancellable`. **Cancellable.**

#### McMMOPlayerFishingTreasureEvent
`com.gmail.nossr50.events.skills.fishing.McMMOPlayerFishingTreasureEvent`
Extends `McMMOPlayerFishingEvent`. **Cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getTreasure()` | `@Nullable ItemStack` | The treasure item |
| `setTreasure(ItemStack)` | `void` | Change the treasure |
| `getXp()` | `int` | XP awarded for the treasure |
| `setXp(int)` | `void` | Modify XP amount |

#### McMMOPlayerMagicHunterEvent
`com.gmail.nossr50.events.skills.fishing.McMMOPlayerMagicHunterEvent`
Extends `McMMOPlayerFishingTreasureEvent`. **Cancellable.** Fired when Magic Hunter finds enchanted treasure.

| Method | Returns | Description |
|--------|---------|-------------|
| `getEnchantments()` | `Map<Enchantment, Integer>` | Enchantments being applied |

#### McMMOPlayerShakeEvent
`com.gmail.nossr50.events.skills.fishing.McMMOPlayerShakeEvent`
Extends `McMMOPlayerFishingEvent`. **Cancellable.** Fired when using fishing rod on a mob (Shake).

| Method | Returns | Description |
|--------|---------|-------------|
| `getDrop()` | `ItemStack` | The drop from shaking |
| `setDrop(ItemStack)` | `void` | Change the drop |

#### McMMOPlayerMasterAnglerEvent
`com.gmail.nossr50.events.skills.fishing.McMMOPlayerMasterAnglerEvent`
Extends `McMMOPlayerFishingEvent`. **Cancellable.** Fired when Master Angler reduces fishing wait time.

| Method | Returns | Description |
|--------|---------|-------------|
| `getReducedMinWaitTime()` | `int` | Reduced minimum wait ticks |
| `setReducedMinWaitTime(int)` | `void` | Change min wait (must be >= 0 and < max) |
| `getReducedMaxWaitTime()` | `int` | Reduced maximum wait ticks |
| `setReducedMaxWaitTime(int)` | `void` | Change max wait (must be >= 0 and > min) |
| `getReducedMinWaitTimeLowerBound()` | `int` | Absolute minimum allowed |
| `getReducedMaxWaitTimeLowerBound()` | `int` | Absolute maximum lower bound |

### Alchemy Events

#### McMMOPlayerBrewEvent
`com.gmail.nossr50.events.skills.alchemy.McMMOPlayerBrewEvent`
Extends `McMMOPlayerSkillEvent`, implements `Cancellable`. **Cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getBrewingStandBlock()` | `Block` | The brewing stand block |
| `getBrewingStand()` | `BrewingStand` | The brewing stand state |

#### McMMOPlayerCatalysisEvent
`com.gmail.nossr50.events.skills.alchemy.McMMOPlayerCatalysisEvent`
Extends `McMMOPlayerSkillEvent`, implements `Cancellable`. **Cancellable.** Fired when Catalysis speeds up brewing.

| Method | Returns | Description |
|--------|---------|-------------|
| `getSpeed()` | `double` | Brewing speed multiplier |
| `setSpeed(double)` | `void` | Change the speed |

### Repair/Salvage Events

#### McMMOPlayerRepairCheckEvent
`com.gmail.nossr50.events.skills.repair.McMMOPlayerRepairCheckEvent`
Extends `McMMOPlayerSkillEvent`, implements `Cancellable`. **Cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getRepairAmount()` | `short` | Amount of durability to repair |
| `getRepairMaterial()` | `ItemStack` | Material used for repair |
| `getRepairedObject()` | `ItemStack` | The item being repaired |

#### McMMOPlayerSalvageCheckEvent
`com.gmail.nossr50.events.skills.salvage.McMMOPlayerSalvageCheckEvent`
Extends `McMMOPlayerSkillEvent`, implements `Cancellable`. **Cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getSalvageItem()` | `ItemStack` | Item being salvaged |
| `getSalvageResults()` | `ItemStack` | Materials returned |
| `getEnchantedBook()` | `ItemStack` | Enchanted book returned (or null) |

### Combat Events

#### McMMOEntityDamageByRuptureEvent
`com.gmail.nossr50.events.skills.rupture.McMMOEntityDamageByRuptureEvent`
Extends `EntityEvent`, implements `Cancellable`. **Cancellable.** Fired on each Rupture (bleed) tick.

| Method | Returns | Description |
|--------|---------|-------------|
| `getDamager()` | `McMMOPlayer` | The player who caused Rupture |
| `getDamage()` | `double` | Damage for this tick |
| `setDamage(double)` | `void` | Modify damage (clamped to >= 0) |

### Taming Events

#### McMMOPlayerTameEntityEvent
`com.gmail.nossr50.events.skills.taming.McMMOPlayerTameEntityEvent`
Extends `McMMOPlayerExperienceEvent`. **Cancellable.** Cancelling prevents XP but entity stays tamed.

| Method | Returns | Description |
|--------|---------|-------------|
| `getMcMMOPlayer()` | `McMMOPlayer` | The taming player |
| `getXpGained()` | `float` | XP to be awarded |
| `setXpGained(float)` | `void` | Modify XP (must be finite and positive) |
| `getTamedEntity()` | `Entity` | The entity that was tamed |

### Unarmed Events

#### McMMOPlayerDisarmEvent
`com.gmail.nossr50.events.skills.unarmed.McMMOPlayerDisarmEvent`
Extends `McMMOPlayerSkillEvent`, implements `Cancellable`. **Cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getDefender()` | `Player` | The player being disarmed |

### Hardcore Events

#### McMMOPlayerPreDeathPenaltyEvent
`com.gmail.nossr50.events.hardcore.McMMOPlayerPreDeathPenaltyEvent`
Extends `PlayerEvent`, implements `Cancellable`. **Cancellable.** Fired before any penalty is calculated.

#### McMMOPlayerDeathPenaltyEvent
`com.gmail.nossr50.events.hardcore.McMMOPlayerDeathPenaltyEvent`
Extends `PlayerEvent`, implements `Cancellable`. **Cancellable.** Fired with calculated penalties.

| Method | Returns | Description |
|--------|---------|-------------|
| `getLevelChanged()` | `HashMap<String, Integer>` | Map of skill name to levels lost |
| `setLevelChanged(HashMap)` | `void` | Modify level penalties |
| `getExperienceChanged()` | `HashMap<String, Float>` | Map of skill name to XP lost |
| `setExperienceChanged(HashMap)` | `void` | Modify XP penalties |

#### McMMOPlayerStatLossEvent
`com.gmail.nossr50.events.hardcore.McMMOPlayerStatLossEvent`
Extends `McMMOPlayerDeathPenaltyEvent`. **Cancellable.** Fired specifically for stat loss on death.

#### McMMOPlayerVampirismEvent
`com.gmail.nossr50.events.hardcore.McMMOPlayerVampirismEvent`
Extends `McMMOPlayerDeathPenaltyEvent`. **Cancellable.** Fired for vampirism (skill theft on kill).

| Method | Returns | Description |
|--------|---------|-------------|
| `isVictim()` | `boolean` | True if this player is the victim losing stats |

### Item Events

#### McMMOItemSpawnEvent
`com.gmail.nossr50.events.items.McMMOItemSpawnEvent`
Extends `Event`, implements `Cancellable`. **Cancellable.** Fired when mcMMO is about to drop an item.

| Method | Returns | Description |
|--------|---------|-------------|
| `getPlayer()` | `@Nullable Player` | Associated player (may be null) |
| `getItemSpawnReason()` | `ItemSpawnReason` | Why the item is dropping |
| `getLocation()` | `Location` | Where the item will drop |
| `setLocation(Location)` | `void` | Change drop location |
| `getItemStack()` | `ItemStack` | The item to drop |
| `setItemStack(ItemStack)` | `void` | Change the dropped item |

#### McMMOModifyBlockDropItemEvent
`com.gmail.nossr50.events.items.McMMOModifyBlockDropItemEvent`
Extends `Event`, implements `Cancellable`. **Cancellable.** Fired when mcMMO adds bonus drops to a BlockDropItemEvent.

| Method | Returns | Description |
|--------|---------|-------------|
| `getBlockDropItemEvent()` | `BlockDropItemEvent` | Original Bukkit event |
| `getOriginalBonusAmountToAdd()` | `int` | mcMMO's calculated bonus before modifications |
| `getItem()` | `Item` | The Item entity getting bonus drops |
| `getModifiedItemStackQuantity()` | `int` | Final quantity to set |
| `setModifiedItemStackQuantity(int)` | `void` | Set final quantity (>= original) |
| `getOriginalItemStackQuantity()` | `int` | Quantity before mcMMO bonus |
| `getBonusAmountToAdd()` | `int` | Effective bonus being added |
| `setBonusAmountToAdd(int)` | `void` | Set bonus (>= 0) |
| `isEffectivelyNoBonus()` | `boolean` | True if modified == original |
| `getPlayer()` | `Player` | Player breaking the block |
| `getBlock()` | `Block` | The block being broken |
| `getBlockState()` | `BlockState` | Block state of broken block |

### Player Events

#### McMMOPlayerProfileLoadEvent
`com.gmail.nossr50.events.players.McMMOPlayerProfileLoadEvent`
Extends `Event`, implements `Cancellable`. **Cancellable.** Fired when a player's mcMMO profile finishes loading.

| Method | Returns | Description |
|--------|---------|-------------|
| `getPlayer()` | `Player` | The player |
| `getProfile()` | `PlayerProfile` | The loaded profile |

### Scoreboard Events

#### McMMOScoreboardEvent (abstract base)
`com.gmail.nossr50.events.scoreboard.McMMOScoreboardEvent`
Extends `Event`.

| Method | Returns | Description |
|--------|---------|-------------|
| `getTargetBoard()` | `Scoreboard` | Board to assign after event |
| `setTargetBoard(Scoreboard)` | `void` | Change target board |
| `getTargetPlayer()` | `Player` | Player involved |
| `setTargetPlayer(Player)` | `void` | Change target player |
| `getCurrentBoard()` | `Scoreboard` | Player's current board |
| `getScoreboardEventReason()` | `ScoreboardEventReason` | Reason enum |

**ScoreboardEventReason enum:** `CREATING_NEW_SCOREBOARD`, `OBJECTIVE`, `REVERTING_BOARD`

#### McMMOScoreboardMakeboardEvent
`com.gmail.nossr50.events.scoreboard.McMMOScoreboardMakeboardEvent`
Extends `McMMOScoreboardEvent`. **Not cancellable.** Fired when mcMMO creates a custom scoreboard.

#### McMMOScoreboardRevertEvent
`com.gmail.nossr50.events.scoreboard.McMMOScoreboardRevertEvent`
Extends `McMMOScoreboardEvent`. **Not cancellable.** Fired when reverting to the player's previous board.

#### McMMOScoreboardObjectiveEvent
`com.gmail.nossr50.events.scoreboard.McMMOScoreboardObjectiveEvent`
Extends `McMMOScoreboardEvent`, implements `Cancellable`. **Cancellable.**

| Method | Returns | Description |
|--------|---------|-------------|
| `getTargetObjective()` | `Objective` | The objective being modified |
| `setTargetObjective(Objective)` | `void` | Change target objective |
| `getObjectiveEventReason()` | `ScoreboardObjectiveEventReason` | Why objective is being modified |

**ScoreboardObjectiveEventReason enum:** `UNREGISTER_THIS_OBJECTIVE`, `REGISTER_NEW_OBJECTIVE`

### Miscellaneous Events

#### McMMOReplaceVanillaTreasureEvent
`com.gmail.nossr50.events.McMMOReplaceVanillaTreasureEvent`
Extends `Event`. **Not cancellable.** Fired when mcMMO replaces a vanilla treasure drop.

| Method | Returns | Description |
|--------|---------|-------------|
| `getOriginalItem()` | `Item` | The original item entity |
| `getReplacementItemStack()` | `ItemStack` | mcMMO's replacement item |
| `setReplacementItemStack(ItemStack)` | `void` | Change the replacement |
| `getCausingPlayer()` | `@Nullable Player` | Player who caused it |

### Fake Events (Internal)

mcMMO fires "fake" Bukkit events when abilities break blocks (Tree Feller, etc). These implement the `FakeEvent` marker interface.

- `FakeBlockBreakEvent` -- extends `BlockBreakEvent`, implements `FakeEvent`
- `FakeBlockDamageEvent` -- extends `BlockDamageEvent`, implements `FakeEvent`
- `FakeBrewEvent` -- extends `BrewEvent`, implements `FakeEvent`
- `FakeEntityTameEvent` -- extends `EntityTameEvent`, implements `FakeEvent`
- `FakePlayerAnimationEvent` -- extends `PlayerAnimationEvent`, implements `FakeEvent`
- `FakePlayerFishEvent` -- extends `PlayerFishEvent`, implements `FakeEvent`
- `TreeFellerBlockBreakEvent` -- extends `FakeBlockBreakEvent`, specifically for Tree Feller

Check for fake events in your listeners:
```java
if (event instanceof FakeEvent) return; // mcMMO caused this, skip
```

## API Exceptions

All in `com.gmail.nossr50.api.exceptions`:

| Exception | When Thrown |
|-----------|------------|
| `InvalidSkillException` | Invalid skill type string passed |
| `InvalidPlayerException` | Player not found in database |
| `InvalidXPGainReasonException` | Invalid XP gain reason string |
| `InvalidFormulaTypeException` | Invalid formula type string |
| `McMMOPlayerNotFoundException` | Player's mcMMO profile not loaded |
| `IncompleteNamespacedKeyRegister` | Incomplete namespaced key registration |

## Static Plugin Access

```java
import com.gmail.nossr50.mcMMO;

// Main plugin instance
mcMMO plugin = mcMMO.p;

// Key managers accessible via the instance
SkillTools skillTools = mcMMO.p.getSkillTools();
PartyManager partyManager = mcMMO.p.getPartyManager();
ChatManager chatManager = mcMMO.p.getChatManager();
GeneralConfig config = mcMMO.p.getGeneralConfig();
PartyConfig partyConfig = mcMMO.p.getPartyConfig();

// Key static accessors
DatabaseManager dbManager = mcMMO.getDatabaseManager();
FormulaManager formulaManager = mcMMO.getFormulaManager();
MaterialMapStore materialMap = mcMMO.getMaterialMapStore();
boolean retroMode = mcMMO.isRetroModeEnabled();

// Player data
McMMOPlayer mmoPlayer = UserManager.getPlayer(player); // may return null
boolean hasData = UserManager.hasPlayerDataKey(player);
```

## plugin.yml Setup

```yaml
depend: [mcMMO]   # hard dependency
# or
softdepend: [mcMMO]   # optional dependency
```

When soft-depending, always null-check before using the API and listen for `McMMOPlayerProfileLoadEvent` to know when a player's data is ready.
