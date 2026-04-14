# AxBoosters API Reference

Booster plugin by Artillex Studios. The API lets plugins register custom booster hooks (to apply multipliers to any game mechanic), create API boosters programmatically, check active boost values for players, and listen for the plugin load event. Add `AxBoosters` to `depend` or `softdepend` in plugin.yml.

> **Important:** All `registerBoosterHook()` calls MUST happen inside an `AxBoostersLoadEvent` listener. Hooks registered outside of it will not work.

## Code Examples

### Register a Custom Booster Hook

```java
import com.artillexstudios.axboosters.api.AxBoostersAPI;
import com.artillexstudios.axboosters.api.events.AxBoostersLoadEvent;
import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import com.artillexstudios.axboosters.libs.kyori.adventure.key.Key;
import com.artillexstudios.axboosters.users.User;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class MyBoosterHook implements BoosterHook {

    @Override
    public Key getKey() {
        return Key.key("myplugin", "examplehook");
    }

    @Override
    public Material getIcon() {
        return Material.EXPERIENCE_BOTTLE;
    }

    @Override
    public boolean isPersistent() {
        return true;
    }

    @Override
    public void apply(User user) {
        // booster activated for this user
    }

    @Override
    public void unapply(User user) {
        // booster deactivated for this user
    }
}

public class MyListener implements Listener {

    private final JavaPlugin plugin;

    public MyListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onLoad(AxBoostersLoadEvent event) {
        AxBoostersAPI.registerBoosterHook(plugin, new MyBoosterHook());
    }
}
```

### Apply a Boost Multiplier in Your Plugin

```java
import com.artillexstudios.axboosters.boosters.BoosterManager;
import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import com.artillexstudios.axboosters.users.User;
import com.artillexstudios.axboosters.users.UserList;
import org.bukkit.entity.Player;

public int applyBoost(Player player, int originalValue, BoosterHook myHook) {
    User user = UserList.getUser(player);
    if (user == null) return originalValue;

    float boost = user.getBoost(myHook);
    if (boost == 1.0f) return originalValue;

    return BoosterManager.multiply(boost, originalValue);
}
```

### Create an API Booster Programmatically

```java
import com.artillexstudios.axboosters.api.AxBoostersAPI;
import com.artillexstudios.axboosters.api.boosters.APIBooster;
import com.artillexstudios.axboosters.api.boosters.APIBoosterManager;
import com.artillexstudios.axboosters.boosters.BoosterType;
import org.bukkit.plugin.java.JavaPlugin;

JavaPlugin plugin = /* your plugin */;
BoosterType type = AxBoostersAPI.getBoosterType("mybooster"); // name from config filename

if (type != null) {
    // null owner UUID = server-wide booster
    APIBooster booster = new APIBooster(null, type, Audience.PERSONAL, 2); // 2x multiplier
    APIBoosterManager.register(plugin, booster);
}

// Deactivate
APIBoosterManager.unregister(plugin);
```

## API Reference (Trimmed)

### `com.artillexstudios.axboosters.api.AxBoostersAPI`

| Return | Method | Description |
|---|---|---|
| `static void` | `registerBoosterHook(JavaPlugin, BoosterHook)` | Register hook (inside load event) |
| `static BoosterType` | `getBoosterType(String name)` | Get booster type by name (null if missing) |

### `com.artillexstudios.axboosters.hooks.booster.BoosterHook` (interface)

| Return | Method | Description |
|---|---|---|
| `Key` | `getKey()` | Namespaced key (`Key.key("plugin", "id")`) |
| `Material` | `getIcon()` | Icon for GUIs |
| `boolean` | `isPersistent()` | Survive reloads |
| `void` | `apply(User)` | Called on activate |
| `void` | `unapply(User)` | Called on deactivate |

### `com.artillexstudios.axboosters.users.User`

| Return | Method | Description |
|---|---|---|
| `float` | `getBoost(BoosterHook)` | Current multiplier (1.0f = no boost) |

### `com.artillexstudios.axboosters.users.UserList`

| Return | Method | Description |
|---|---|---|
| `static User` | `getUser(Player)` | Get user (may be null) |

### `com.artillexstudios.axboosters.boosters.BoosterManager`

| Return | Method | Description |
|---|---|---|
| `static int` | `multiply(float boost, int original)` | Apply multiplier |

### `com.artillexstudios.axboosters.api.boosters.APIBooster`

Constructor: `APIBooster(UUID ownerUuid, BoosterType type, Audience audience, int multiplier)`
- `ownerUuid` = null for server-wide
- API Boosters persist until server restart

### `com.artillexstudios.axboosters.api.boosters.APIBoosterManager`

| Return | Method | Description |
|---|---|---|
| `void` | `register(Plugin, APIBooster)` | Activate API booster |
| `void` | `unregister(Plugin)` | Deactivate API booster |

### Events (`com.artillexstudios.axboosters.api.events`)

| Event | Cancellable | Description |
|---|---|---|
| `AxBoostersLoadEvent` | No | Fired ~20 ticks after AxBoosters enables. Register hooks here. |

> **Note:** `Key` is `com.artillexstudios.axboosters.libs.kyori.adventure.key.Key` (shaded Adventure). Do NOT import `net.kyori.adventure.key.Key` directly.
