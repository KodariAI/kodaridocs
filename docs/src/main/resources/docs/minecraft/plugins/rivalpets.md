# RivalPetsAPI

Custom pet companion plugin by Rival Development. Pets follow players, provide buff boosts (e.g. money, XP, proc chance), level up through experience, have prestige/grades, and support enhancements. The API lets you check pet status, query buff boosts, manage pet items, register custom buffs/upgrades, and listen to pet lifecycle events.

> Note: These are premium plugins with limited public API docs. Examples below are derived from known method signatures and the official docs at docs.rivaldev.xyz.

## Core API — Pet Queries and Buffs

Access the API via the static `getApi()` method. Add `RivalPets` to `soft-depend` or `depend` in your plugin.yml.

```java
import me.rivaldev.rivalpets.api.RivalPetsAPI;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

RivalPetsAPI api = RivalPetsAPI.getApi();

// Check if a player has a specific buff active (buff name from config)
boolean hasSpeed = api.hasBuff(player, "speed");

// Get the total boost multiplier for a buff
double boost = api.getBuffBoost(player, "money");

// Get the formatted percentage string for a buff
String pct = api.getBuffPercentage(player, "money");

// Get a player's upgrade level for a named upgrade
long upgradeLevel = api.getUpgradeLevel(player, "storage");

// Add experience to a player's active pet for a specific buff
api.addExperience(player, "money");

// Get total pet slots a player has (including bonus)
int slots = api.getPetSlots(player);

// Get only base pet slots (excluding active pet slots)
int baseSlots = api.getOnlyPetSlots(player);

// Get pet storage capacity
int storage = api.getPetStorage(player);

// Get which slot number a specific pet UUID occupies
int slot = api.getPetSlot(player, petUUID);
```

## Pet Item Utilities

```java
import me.rivaldev.rivalpets.api.RivalPetsAPI;
import me.rivaldev.rivalpets.objects.StoredPet;
import org.bukkit.inventory.ItemStack;
import java.util.UUID;

RivalPetsAPI api = RivalPetsAPI.getApi();

// Check if an ItemStack is a pet item
boolean isPet = api.isPetItem(itemStack);

// Get the RPet object from a pet item
RPet pet = api.getRPetByItem(itemStack);

// Get a pet by its config name
RPet pet = api.getRPetByString("dragon");

// Get the stored pet data from an item
StoredPet storedPet = api.getStoredPetByItem(itemStack);

// Get the UUID embedded in a pet item
UUID uuid = api.getPetUUID(itemStack);

// Check special item types
boolean isCandy = api.isCandyItem(itemStack);
boolean isLevelItem = api.isLevelItem(itemStack);
boolean isRarity = api.isRarityItem(itemStack);
boolean isPetBox = api.isPetBox(itemStack);
boolean isScroll = api.isOwnerScroll(itemStack);

// Get names from special items
String candyName = api.getCandyName(itemStack);
String boxName = api.getPetBoxName(itemStack);

// Get XP amount from a leveling item
long xpAmount = api.LevelItemAmount(itemStack);
```

## Activating a Pet Programmatically

```java
import me.rivaldev.rivalpets.api.RivalPetsAPI;
import me.rivaldev.rivalpets.handlers.ActivatedPet;
import java.util.UUID;

RivalPetsAPI api = RivalPetsAPI.getApi();

// Activate a pet for a player — returns the ActivatedPet handle
// Parameters: player UUID, RPet object, pet unique UUID
ActivatedPet activePet = api.activatePet(playerUUID, rPet, petUUID);
```

## Querying Active Pets

```java
import me.rivaldev.rivalpets.RivalPets;
import me.rivaldev.rivalpets.user.ActivePetsChest;
import me.rivaldev.rivalpets.handlers.ActivatedPet;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import java.util.UUID;

ActivePetsChest chest = RivalPets.getInstance().getActivePetsChest();

// Get all active pets for a player
ArrayList<ActivatedPet> pets = chest.getPetsByUUID(player.getUniqueId());

// Get a single active pet by its UUID
ActivatedPet pet = chest.getActivePetID(petUUID);

// Read pet stats
long level = pet.getLevel();
double xp = pet.getExperience();
double needed = pet.getNeededExperience();
long prestige = pet.getPrestige();
String enhancement = pet.getEnhancement();
boolean active = pet.isActive();
RPet petType = pet.getPet();
```

## Registering a Custom Buff

Create a class extending `PetBuffRegister` and register it. This lets your plugin define a new pet boost type.

```java
import me.rivaldev.rivalpets.api.RivalPetsAPI;
import me.rivaldev.rivalpets.buffs.PetBuffRegister;
import me.rivaldev.rivalpets.handlers.ActivatedPet;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MoneyBuff extends PetBuffRegister {

    @Override
    public String getBuffName() {
        return "money_boost";
    }

    @Override
    public void onActivatePet(Player player) {
        // Called when a pet with this buff is activated
    }

    @Override
    public void onDeactivatePet(Player player) {
        // Called when a pet with this buff is deactivated
    }

    // Example: hook into your economy event to apply the buff
    @EventHandler
    public void onMoneyEarn(SomeMoneyEvent event) {
        Player player = event.getPlayer();
        if (RivalPetsAPI.getApi().hasBuff(player, getBuffName())) {
            RivalPetsAPI.getApi().addExperience(player, getBuffName());
            double boost = RivalPetsAPI.getApi().getBuffBoost(player, getBuffName());
            event.setAmount(event.getAmount() * (1.0 + boost));
        }
    }
}

// Register in your onEnable():
if (Bukkit.getPluginManager().getPlugin("RivalPets") != null) {
    RivalPetsAPI.getApi().registerBuff(new MoneyBuff(), "YourPluginName");
}
```

## Registering a Custom Upgrade

```java
import me.rivaldev.rivalpets.api.RivalPetsAPI;
import me.rivaldev.rivalpets.buffs.PetUpgradeRegister;
import org.bukkit.entity.Player;

public class StorageUpgrade extends PetUpgradeRegister {

    @Override
    public void init() {
        // Setup logic
    }

    @Override
    public long getLevel(Player player) {
        // Return the player's current upgrade level
        return 0;
    }

    @Override
    public void onUpgradeProc() {
        // Called when upgrade is purchased
    }
}

// Register:
RivalPetsAPI.getApi().registerUpgrade(new StorageUpgrade(), "YourPluginName", "storage");
```

## Events

All events are in `me.rivaldev.rivalpets.api.events`.

### RivalPetsXPGainEvent — Modify XP gain (cancellable)

```java
import me.rivaldev.rivalpets.api.events.RivalPetsXPGainEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PetXPListener implements Listener {

    @EventHandler
    public void onPetXP(RivalPetsXPGainEvent event) {
        // Double all pet XP
        event.setBoost(event.getBoost() * 2.0);
        // Or cancel XP gain entirely
        // event.setCancelled(true);
    }
}
```

### RivalPetsLevelUpEvent — Pet levels up

```java
import me.rivaldev.rivalpets.api.events.RivalPetsLevelUpEvent;

@EventHandler
public void onPetLevelUp(RivalPetsLevelUpEvent event) {
    long newLevel = event.getLevel();
    event.getPlayer().sendMessage("Your pet reached level " + newLevel + "!");
}
```

### RivalPetsPetActivatedEvent / RivalPetsPetDeactivatedEvent

```java
import me.rivaldev.rivalpets.api.events.RivalPetsPetActivatedEvent;
import me.rivaldev.rivalpets.api.events.RivalPetsPetDeactivatedEvent;

@EventHandler
public void onPetActivated(RivalPetsPetActivatedEvent event) {
    String petName = event.getPet();
    event.getPlayer().sendMessage("Activated pet: " + petName);
}

@EventHandler
public void onPetDeactivated(RivalPetsPetDeactivatedEvent event) {
    String petName = event.getPet();
    event.getPlayer().sendMessage("Deactivated pet: " + petName);
}
```

### RivalPetsCandyApplyEvent / RivalPetsCandyReceiveEvent

```java
import me.rivaldev.rivalpets.api.events.RivalPetsCandyApplyEvent;
import me.rivaldev.rivalpets.api.events.RivalPetsCandyReceiveEvent;

@EventHandler
public void onCandyApply(RivalPetsCandyApplyEvent event) {
    String candy = event.getCandy();
    double xp = event.getXp();
    event.setXp(xp * 1.5); // 50% more XP from candy
    // event.setAmount(event.getAmount() + 1); // bonus candy amount
}

@EventHandler
public void onCandyReceive(RivalPetsCandyReceiveEvent event) {
    event.setAmount(event.getAmount() * 2); // Double candy drops
}
```

### RivalPetsPetBoxOpenEvent — Pet box opened

```java
import me.rivaldev.rivalpets.api.events.RivalPetsPetBoxOpenEvent;

@EventHandler
public void onPetBoxOpen(RivalPetsPetBoxOpenEvent event) {
    String boxType = event.getType();
    long amount = event.getAmount();
    event.getPlayer().sendMessage("Opened " + amount + "x " + boxType + " pet box!");
}
```

### RivalPetsUpgradeEvent — Modify upgrade cost/behavior

```java
import me.rivaldev.rivalpets.api.events.RivalPetsUpgradeEvent;

@EventHandler
public void onUpgrade(RivalPetsUpgradeEvent event) {
    String upgrade = event.getUpgrade();
    long levels = event.getLevels();
    // 50% discount
    event.setCost(event.getCost() * 0.5);
    // Suppress the default message
    event.setSendMessage(false);
    event.getPlayer().sendMessage("Upgraded " + upgrade + " to level " + levels + " at half price!");
}
```

## Event Reference Table

| Event | Key Methods | Cancellable |
|---|---|---|
| `RivalPetsXPGainEvent` | `getBoost()`, `setBoost(double)`, `getPlayer()` | Yes |
| `RivalPetsLevelUpEvent` | `getLevel()`, `getPlayer()` | No |
| `RivalPetsPetActivatedEvent` | `getPet()`, `getPlayer()` | No |
| `RivalPetsPetDeactivatedEvent` | `getPet()`, `getPlayer()` | No |
| `RivalPetsCandyApplyEvent` | `getCandy()`, `getXp()`, `setXp(double)`, `getAmount()`, `setAmount(int)`, `getPlayer()` | No |
| `RivalPetsCandyReceiveEvent` | `getCandy()`, `getAmount()`, `setAmount(long)`, `getPlayer()` | No |
| `RivalPetsPetBoxOpenEvent` | `getType()`, `getAmount()`, `getPlayer()` | No |
| `RivalPetsUpgradeEvent` | `getUpgrade()`, `getLevels()`, `getCost()`, `setCost(double)`, `isSendMessage()`, `setSendMessage(boolean)`, `getPlayer()` | No |

## API Reference

### `me.rivaldev.rivalpets.api.RivalPetsAPI`

| Method | Returns |
|---|---|
| `getApi()` | `RivalPetsAPI` |
| `hasBuff(Player, String)` | `boolean` |
| `getBuffBoost(Player, String)` | `double` |
| `getBuffPercentage(Player, String)` | `String` |
| `addExperience(Player, String)` | `void` |
| `getUpgradeLevel(Player, String)` | `long` |
| `isPetItem(ItemStack)` | `boolean` |
| `getRPetByItem(ItemStack)` | `RPet` |
| `getRPetByString(String)` | `RPet` |
| `getStoredPetByItem(ItemStack)` | `StoredPet` |
| `getPetUUID(ItemStack)` | `UUID` |
| `activatePet(UUID, RPet, UUID)` | `ActivatedPet` |
| `getPetSlots(Player)` | `int` |
| `getOnlyPetSlots(Player)` | `int` |
| `getPetStorage(Player)` | `int` |
| `getPetSlot(Player, UUID)` | `int` |
| `isCandyItem(ItemStack)` | `boolean` |
| `getCandyName(ItemStack)` | `String` |
| `isLevelItem(ItemStack)` | `boolean` |
| `LevelItemAmount(ItemStack)` | `long` |
| `isRarityItem(ItemStack)` | `boolean` |
| `isPetBox(ItemStack)` | `boolean` |
| `getPetBoxName(ItemStack)` | `String` |
| `isOwnerScroll(ItemStack)` | `boolean` |
| `isVanished(Player)` | `boolean` |
| `registerBuff(PetBuffRegister)` | `void` |
| `registerBuff(PetBuffRegister, String)` | `void` |
| `registerUpgrade(PetUpgradeRegister, String, String)` | `void` |

### `me.rivaldev.rivalpets.handlers.ActivatedPet`

| Method | Returns |
|---|---|
| `getPlayer()` | `Player` |
| `getOwner()` | `UUID` |
| `getPet()` | `RPet` |
| `getPetUUID()` | `UUID` |
| `getLevel()` | `long` |
| `getExperience()` | `double` |
| `getNeededExperience()` | `double` |
| `getPrestige()` | `long` |
| `getEnhancement()` | `String` |
| `isActive()` | `boolean` |
| `getGradeLevel()` | `double` |
| `getGradeBuff()` | `double` |
| `getGradeExperience()` | `double` |
| `isOnCooldown()` | `boolean` |
| `getCooldown()` | `long` |
| `activate()` | `void` |
| `deactivate()` | `void` |
| `addEXP(double)` | `void` |
| `setLevel(long)` | `void` |
| `setExperience(double)` | `void` |
| `setPrestige(long)` | `void` |
| `setEnhancement(String)` | `void` |
| `toggle()` | `void` |

### `me.rivaldev.rivalpets.buffs.PetBuffRegister`

| Method | Returns |
|---|---|
| `getBuffName()` | `String` |
| `hasBuff(ActivatedPet)` | `boolean` |
| `hasBuffWithName(ActivatedPet, String)` | `boolean` |
| `getBuff(ActivatedPet)` | `Buff` |
| `getBuff(ActivatedPet, String)` | `Buff` |
| `getMulti(ActivatedPet)` | `double` |
| `getMultiplier(ActivatedPet, String)` | `double` |
| `addExperience(ActivatedPet)` | `void` |
| `addExperience(ActivatedPet, String)` | `void` |
| `onActivatePet(Player)` | `void` |
| `onDeactivatePet(Player)` | `void` |
| `register()` | `void` |
| `pluginName()` | `String` |

### `me.rivaldev.rivalpets.user.ActivePetsChest`

| Method | Returns |
|---|---|
| `getAllActivePets()` | `List` |
| `getPetsByUUID(UUID)` | `ArrayList` |
| `getActivePetID(UUID)` | `ActivatedPet` |
| `addPet(UUID, ActivatedPet)` | `void` |
| `removePet(UUID, ActivatedPet)` | `void` |
| `clearPets(UUID)` | `void` |
