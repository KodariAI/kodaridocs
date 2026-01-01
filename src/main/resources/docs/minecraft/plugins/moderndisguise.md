# ModernDisguise API Documentation

**Library:** ModernDisguise  
**Author:** iiAhmedYT  
**Package:** `dev.iiahmed.disguise`  
**Latest Version:** 4.6  
**Repository:** https://github.com/iiAhmedYT/ModernDisguise

---

## Features

- Change player name (Server-side)
- Change player skin (Server-side)
- Change entity type - up to 82 entities (Client-side, other players only)

---

## Supported Versions

1.8.8 - 1.21.x

---

## Getting Started

### Manifest Configuration

Add ModernDisguise to your `manifest.kod` to include it in your plugin:
```yaml
include:
    - moderndisguise
```

> ⚠️ **Important:** Do NOT add ModernDisguise to your `plugin.yml` dependencies. Use `manifest.kod` instead.

---

### Initialization
```java
import dev.iiahmed.disguise.DisguiseManager;
import dev.iiahmed.disguise.DisguiseProvider;

public class MyPlugin extends JavaPlugin {

    private DisguiseProvider disguiseProvider;

    @Override
    public void onEnable() {
        // Initialize BEFORE using any other methods
        boolean allowEntities = true; // set false to disable entity disguises
        DisguiseManager.initialize(this, allowEntities);
        
        // Get the provider instance
        this.disguiseProvider = DisguiseManager.getProvider();
        
        // Optional configuration
        disguiseProvider.allowOverrideChat(false);
        disguiseProvider.setNameLength(16);
        disguiseProvider.setNamePattern(Pattern.compile("^[a-zA-Z0-9_]{1,16}$"));
    }
}
```

---

## API Components

### DisguiseManager

| Method | Return Type | Description |
|--------|-------------|-------------|
| `initialize(Plugin plugin, boolean allowEntities)` | `void` | Initialize the disguise system. Call once on startup. |
| `getProvider()` | `DisguiseProvider` | Get the disguise provider instance. |

---

### DisguiseProvider

#### Disguise Methods

| Method | Return Type | Description |
|--------|-------------|-------------|
| `disguise(Player player, Disguise disguise)` | `DisguiseResponse` | Apply a disguise to a player. |
| `undisguise(Player player)` | `UndisguiseResponse` | Remove a player's disguise. |

#### Query Methods

| Method | Return Type | Description |
|--------|-------------|-------------|
| `isDisguised(Player player)` | `boolean` | Check if player is disguised. |
| `isDisguisedAsEntity(Player player)` | `boolean` | Check if player is disguised as an entity/mob. |
| `getInfo(Player player)` | `DisguiseInfo` | Get disguise info for a player. Never null. |
| `isVersionSupported()` | `boolean` | Check if current server version is supported. |

#### Configuration Methods

| Method | Return Type | Description |
|--------|-------------|-------------|
| `allowOverrideChat(boolean allow)` | `void` | Control chat override for Mojang Chat-Reports. |
| `setNameLength(int length)` | `void` | Set maximum allowed name length. |
| `setNamePattern(Pattern pattern)` | `void` | Set regex pattern for name validation. |

---

### Disguise.Builder

| Method | Return Type | Description |
|--------|-------------|-------------|
| `Disguise.builder()` | `Builder` | Create a new disguise builder. |
| `setName(String name)` | `Builder` | Set the disguise name. |
| `setSkin(SkinAPI api, UUID uuid)` | `Builder` | Fetch skin from API. **Blocks if sync!** |
| `setSkin(Skin skin)` | `Builder` | Set skin from Skin object. |
| `setSkin(UUID uuid)` | `Builder` | Set skin from UUID. |
| `setEntityType(EntityType type)` | `Builder` | Set entity type for mob disguise. |
| `setEntity(Consumer<EntityBuilder> builder)` | `Builder` | Advanced entity config (scaling, etc). |
| `build()` | `Disguise` | Build the final Disguise object. |

---

### DisguiseResponse (Enum)

| Value | Description |
|-------|-------------|
| `SUCCESS` | Disguise applied successfully. |
| `FAIL_NAME_ALREADY_ONLINE` | Name is already used by an online player. |
| `FAIL_NAME_INVALID` | Name doesn't match validation pattern. |
| `FAIL_ENTITY_NOT_SUPPORTED` | Entity type is not supported. |
| `FAIL_VERSION_NOT_SUPPORTED` | Server version not supported. |
| *(+ other failure types)* | Various other failure conditions. |

---

### UndisguiseResponse (Enum)

| Value | Description |
|-------|-------------|
| `SUCCESS` | Undisguise successful. |
| `FAIL_NOT_DISGUISED` | Player was not disguised. |
| *(+ other failure types)* | Various other failure conditions. |

---

### SkinAPI (Enum)

| Value | Description |
|-------|-------------|
| `MOJANG` | Official Mojang skin API. |

---

### Utility Methods

| Method | Return Type | Description |
|--------|-------------|-------------|
| `DisguiseUtil.getSkin(Player player)` | `Skin` | Get the current skin of an online player. |

---

## Usage Examples

### Disguise with Name Only
```java
Disguise disguise = Disguise.builder()
        .setName("Notch")
        .build();

DisguiseResponse response = provider.disguise(player, disguise);
```

### Disguise with Name + Skin (Async Recommended)
```java
Bukkit.getScheduler().runTaskAsynchronously(plugin, () -> {
    Disguise disguise = Disguise.builder()
            .setName("Notch")
            .setSkin(SkinAPI.MOJANG, UUID.fromString("069a79f4-44e9-4726-a5be-fca90e38aaf5"))
            .build();
    
    Bukkit.getScheduler().runTask(plugin, () -> {
        DisguiseResponse response = provider.disguise(player, disguise);
        
        if (response == DisguiseResponse.SUCCESS) {
            player.sendMessage("Disguised!");
        } else {
            player.sendMessage("Failed: " + response.name());
        }
    });
});
```

### Disguise as Entity (Mob)
```java
Disguise disguise = Disguise.builder()
        .setName("ZombiePlayer")
        .setEntityType(EntityType.ZOMBIE)
        .build();

provider.disguise(player, disguise);
```

### Disguise as Scaled Entity
```java
Disguise disguise = Disguise.builder()
        .setName("GiantCreeper")
        .setEntity(builder -> builder
                .setType(EntityType.CREEPER)
                .setAttribute(RangedAttribute.SCALE, 3.0D))
        .build();

provider.disguise(player, disguise);
```

### Copy Another Player's Appearance
```java
Player target = Bukkit.getPlayer("SomePlayer");
Skin targetSkin = DisguiseUtil.getSkin(target);

Disguise disguise = Disguise.builder()
        .setName(target.getName())
        .setSkin(targetSkin)
        .build();

provider.disguise(player, disguise);
```

### Undisguise a Player
```java
if (provider.isDisguised(player)) {
    UndisguiseResponse response = provider.undisguise(player);
    
    if (response == UndisguiseResponse.SUCCESS) {
        player.sendMessage("Undisguised!");
    }
}
```

### Check Disguise Status
```java
if (provider.isDisguised(player)) {
    DisguiseInfo info = provider.getInfo(player);
    player.sendMessage("Disguised as: " + info.getName());
    
    if (provider.isDisguisedAsEntity(player)) {
        player.sendMessage("Entity type: " + info.getEntityType().name());
    }
}
```

---

## Common Mistakes

### ❌ WRONG: Using empty disguise to undisguise
```java
// THIS DOES NOT WORK!
Disguise emptyDisguise = Disguise.builder().build();
provider.disguise(player, emptyDisguise);
```

### ✅ CORRECT: Use the undisguise method
```java
provider.undisguise(player);
```

---

### ❌ WRONG: Fetching skin on main thread
```java
// This blocks the main thread and causes lag!
Disguise disguise = Disguise.builder()
        .setName("Notch")
        .setSkin(SkinAPI.MOJANG, uuid) // BLOCKS HERE
        .build();
provider.disguise(player, disguise);
```

### ✅ CORRECT: Fetch skin asynchronously
```java
Bukkit.getScheduler().runTaskAsynchronously(plugin, () -> {
    Disguise disguise = Disguise.builder()
            .setName("Notch")
            .setSkin(SkinAPI.MOJANG, uuid)
            .build();
    
    Bukkit.getScheduler().runTask(plugin, () -> {
        provider.disguise(player, disguise);
    });
});
```

---

### ❌ WRONG: Getting provider before initialization
```java
// Provider will be null or broken!
DisguiseProvider provider = DisguiseManager.getProvider();
DisguiseManager.initialize(plugin, true); // Too late!
```

### ✅ CORRECT: Initialize first
```java
DisguiseManager.initialize(plugin, true);
DisguiseProvider provider = DisguiseManager.getProvider();
```

---

### ❌ WRONG: Not checking response
```java
provider.disguise(player, disguise);
player.sendMessage("Disguised!"); // Might not be true!
```

### ✅ CORRECT: Always check response
```java
DisguiseResponse response = provider.disguise(player, disguise);
if (response == DisguiseResponse.SUCCESS) {
    player.sendMessage("Disguised!");
} else {
    player.sendMessage("Failed: " + response.name());
}
```

---

## Important Notes

### Chat Reports
On Minecraft versions with Mojang Chat-Reports, this library disables that feature for disguised players. To disable this behavior:
```java
provider.allowOverrideChat(false);
```

### Entity Disguises
- Entity disguises are **client-side only**
- The disguised player sees themselves normally
- Only other players see the entity
- Up to 82 entity types supported

### Re-disguising
Players can be re-disguised without undisguising first. The library handles this automatically.

### Bukkit.getPlayer() Support
When a player is disguised, `Bukkit.getPlayer(disguisedName)` and `Bukkit.getPlayerExact(disguisedName)` will return the disguised player.

---

## Troubleshooting

| Issue | Cause | Solution |
|-------|-------|----------|
| Undisguise doesn't work | Using empty Disguise instead of `undisguise()` | Use `provider.undisguise(player)` |
| Skin shows as Steve | Skin fetch failed or sync blocking | Fetch skin async, check UUID is valid |
| Server lag on disguise | Skin fetching on main thread | Run `setSkin()` in async task |
| `NullPointerException` | Provider accessed before `initialize()` | Call `DisguiseManager.initialize()` first |
| Name already online error | Another player has that name | Check with `Bukkit.getPlayer(name)` first |
| Entity disguise not showing | `allowEntities` set to false | Set `true` in `initialize()` |
| Player invisible after disguise | Version-specific bug | Update to latest ModernDisguise version |