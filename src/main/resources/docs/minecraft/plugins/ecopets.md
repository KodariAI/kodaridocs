# EcoPets API

EcoPets is a Minecraft pet companion plugin by Auxilor. Pets float around players and provide passive/active buffs that scale with pet level. The API lets you query pet ownership, manage XP/levels, and listen for pet events.

## Getting the API Instance

```java
import com.willfp.ecopets.api.EcoPetsAPI;

EcoPetsAPI api = EcoPetsAPI.getInstance();
```

## Looking Up Pets

Pets are registered by string ID. Use `com.willfp.ecopets.pets.Pets` to look them up.

```java
import com.willfp.ecopets.pets.Pet;
import com.willfp.ecopets.pets.Pets;

// Get a pet by its config ID (e.g. "wolf", "dragon")
Pet pet = Pets.getByID("wolf"); // returns null if not found

// Get all registered pets
java.util.List<Pet> allPets = Pets.values();
```

## Checking and Managing Pet Ownership

```java
import com.willfp.ecopets.api.EcoPetsAPI;
import com.willfp.ecopets.pets.Pet;
import com.willfp.ecopets.pets.Pets;
import org.bukkit.entity.Player;

EcoPetsAPI api = EcoPetsAPI.getInstance();
Player player = /* your player */;
Pet wolf = Pets.getByID("wolf");

// Check if player has unlocked a pet
boolean hasWolf = api.hasPet(player, wolf);

// Get/set the player's currently active pet (null = no active pet)
Pet activePet = api.getActivePet(player);
api.setActivePet(player, wolf);
api.setActivePet(player, null); // deactivate pet
```

## XP and Levels

```java
import com.willfp.ecopets.api.EcoPetsAPI;
import com.willfp.ecopets.pets.Pet;
import com.willfp.ecopets.pets.Pets;
import org.bukkit.entity.Player;

EcoPetsAPI api = EcoPetsAPI.getInstance();
Player player = /* your player */;
Pet pet = Pets.getByID("wolf");

// Current level of the pet for this player
int level = api.getPetLevel(player, pet);

// XP toward the next level
double currentXP = api.getPetXP(player, pet);

// XP required to reach the next level
double requiredXP = api.getPetXPRequired(player, pet);

// Progress to next level as 0.0 to 1.0
double progress = api.getPetProgress(player, pet);

// Give XP (triggers events, respects multipliers by default)
api.givePetExperience(player, pet, 50.0);

// Give XP with explicit multiplier control (false = raw XP, no multipliers)
api.givePetExperience(player, pet, 50.0, false);
```

## Events

### PlayerPetExpGainEvent

Fired when a player gains pet XP. Cancellable. You can modify the amount.

```java
import com.willfp.ecopets.api.event.PlayerPetExpGainEvent;
import com.willfp.ecopets.pets.Pet;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PetXPListener implements Listener {
    @EventHandler
    public void onPetXP(PlayerPetExpGainEvent event) {
        Pet pet = event.getPet();
        double amount = event.getAmount();
        boolean isMultiplied = event.isMultiply();

        // Double all XP gains
        event.setAmount(amount * 2);

        // Or cancel XP gain entirely
        // event.setCancelled(true);
    }
}
```

### PlayerPetLevelUpEvent

Fired when a player's pet levels up. Not cancellable.

```java
import com.willfp.ecopets.api.event.PlayerPetLevelUpEvent;
import com.willfp.ecopets.pets.Pet;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PetLevelListener implements Listener {
    @EventHandler
    public void onPetLevelUp(PlayerPetLevelUpEvent event) {
        Player player = event.getPlayer();
        Pet pet = event.getPet();
        int newLevel = event.getLevel();

        player.sendMessage("Your " + pet.getId() + " reached level " + newLevel + "!");
    }
}
```

## API Reference

### com.willfp.ecopets.api.EcoPetsAPI (interface)
| Method | Returns | Description |
|---|---|---|
| `getInstance()` | `EcoPetsAPI` | Static. Get the singleton API instance |
| `hasPet(OfflinePlayer, Pet)` | `boolean` | Whether the player has unlocked the pet |
| `getActivePet(OfflinePlayer)` | `Pet` | The player's active pet, or null |
| `setActivePet(OfflinePlayer, Pet)` | `void` | Set or clear (null) the active pet |
| `getPetLevel(OfflinePlayer, Pet)` | `int` | The player's level for the given pet |
| `getPetXP(OfflinePlayer, Pet)` | `double` | XP earned toward the next level |
| `getPetXPRequired(OfflinePlayer, Pet)` | `double` | XP needed to reach the next level |
| `getPetProgress(OfflinePlayer, Pet)` | `double` | Progress to next level (0.0 to 1.0) |
| `givePetExperience(Player, Pet, double)` | `void` | Give XP with default multipliers |
| `givePetExperience(Player, Pet, double, boolean)` | `void` | Give XP; boolean controls multiplier application |

### com.willfp.ecopets.pets.Pets (object/registry)
| Method | Returns | Description |
|---|---|---|
| `getByID(String)` | `Pet` | Get a pet by config ID, or null if not found |
| `values()` | `List<Pet>` | All registered pets (immutable) |

### com.willfp.ecopets.pets.Pet
| Field/Method | Type | Description |
|---|---|---|
| `getId()` | `String` | The pet's config identifier |

### com.willfp.ecopets.api.event.PlayerPetExpGainEvent
Extends `org.bukkit.event.player.PlayerEvent`, implements `Cancellable`, `PetEvent`

| Method | Returns | Description |
|---|---|---|
| `getPet()` | `Pet` | The pet gaining XP |
| `getAmount()` | `double` | The XP amount |
| `setAmount(double)` | `void` | Modify the XP amount |
| `isMultiply()` | `boolean` | Whether this is a multiplier-based gain |
| `isCancelled()` | `boolean` | Check cancellation |
| `setCancelled(boolean)` | `void` | Cancel the XP gain |

### com.willfp.ecopets.api.event.PlayerPetLevelUpEvent
Extends `org.bukkit.event.player.PlayerEvent`, implements `PetEvent`

| Method | Returns | Description |
|---|---|---|
| `getPet()` | `Pet` | The pet that leveled up |
| `getLevel()` | `int` | The new level reached |

### com.willfp.ecopets.api.event.PetEvent (interface)
| Method | Returns | Description |
|---|---|---|
| `getPet()` | `Pet` | The pet involved in the event |
