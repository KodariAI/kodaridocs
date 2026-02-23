# PlaceholderAPI (Hytale)

Placeholder system for Hytale servers. Allows plugins to register and resolve dynamic placeholders like `%example_name%`.
This is the Hytale port of PlaceholderAPI. Uses `at.helpch` packages instead of `me.clip`, and `PlayerRef` instead of `OfflinePlayer`/`Player`.

## Examples

### Using Placeholders in Your Plugin

```java
import at.helpch.placeholderapi.PlaceholderAPI;
import com.hypixel.hytale.server.core.universe.PlayerRef;

// basic placeholder replacement
String result = PlaceholderAPI.setPlaceholders(player, "Hello %player_name%, you have %economy_balance% coins");

// relational placeholders (comparing two players)
String result = PlaceholderAPI.setRelationalPlaceholders(playerOne, playerTwo, "Are friends: %rel_friends_status%");
```

**Thread safety:** Due to Hytale's API design, certain components can only be accessed by specific threads. Call `setPlaceholders` on the world thread:
```java
player.getWorld().execute(() -> {
    String result = PlaceholderAPI.setPlaceholders(player, "%some_placeholder%");
    // use result here
});
```

### Checking if PlaceholderAPI is Installed

```java
import com.hypixel.hytale.server.core.HytaleServer;
import com.hypixel.hytale.common.plugin.PluginIdentifier;

if (HytaleServer.get().getPluginManager()
        .getPlugin(PluginIdentifier.fromString("HelpChat:PlaceholderAPI")) != null) {
    // safe to use PlaceholderAPI
}
```

### Creating an Internal Expansion (inside your plugin)

```java
import at.helpch.placeholderapi.expansion.PlaceholderExpansion;
import com.hypixel.hytale.server.api.player.PlayerRef;
import org.jetbrains.annotations.NotNull;

public class MyExpansion extends PlaceholderExpansion {

    private final MyPlugin plugin;

    public MyExpansion(MyPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    @NotNull
    public String getIdentifier() {
        return "myplugin"; // %myplugin_<params>%
    }

    @Override
    @NotNull
    public String getAuthor() {
        return "YourName";
    }

    @Override
    @NotNull
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public boolean persist() {
        return true; // keeps expansion registered through PlaceholderAPI reloads
    }

    @Override
    public String onPlaceholderRequest(PlayerRef player, @NotNull String params) {
        if (player == null) return null;

        if (params.equals("level")) {
            return String.valueOf(plugin.getPlayerLevel(player));
        }

        if (params.equals("name")) {
            return player.getName();
        }

        return null; // returning null means the placeholder is not recognized
    }
}
```

Registering it in your plugin:
```java
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.server.core.HytaleServer;
import com.hypixel.hytale.common.plugin.PluginIdentifier;

public class MyPlugin extends JavaPlugin {

    public MyPlugin(JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void start() {
        if (HytaleServer.get().getPluginManager()
                .getPlugin(PluginIdentifier.fromString("HelpChat:PlaceholderAPI")) != null) {
            new MyExpansion(this).register();
        }
    }
}
```

### Creating a Relational Expansion

For placeholders that compare two players (prefixed with `rel_`):

```java
import at.helpch.placeholderapi.expansion.PlaceholderExpansion;
import at.helpch.placeholderapi.expansion.Relational;
import com.hypixel.hytale.server.api.player.PlayerRef;
import org.jetbrains.annotations.NotNull;

public class MyRelationalExpansion extends PlaceholderExpansion implements Relational {

    @Override
    @NotNull
    public String getIdentifier() {
        return "myrel";
    }

    @Override
    @NotNull
    public String getAuthor() {
        return "YourName";
    }

    @Override
    @NotNull
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onPlaceholderRequest(PlayerRef one, PlayerRef two, @NotNull String params) {
        if (one == null || two == null) return null;

        // %rel_myrel_sameteam%
        if (params.equals("sameteam")) {
            return String.valueOf(getTeam(one).equals(getTeam(two)));
        }

        return null;
    }
}
```

### Listening for Chat with Placeholders

```java
import at.helpch.placeholderapi.PlaceholderAPI;
import com.hypixel.hytale.server.core.event.events.player.PlayerChatEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

public class ChatPlugin extends JavaPlugin {

    public ChatPlugin(JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void start() {
        getEventRegistry().registerGlobal(PlayerChatEvent.class, event -> {
            PlayerRef player = event.getPlayer();
            player.getWorld().execute(() -> {
                String formatted = PlaceholderAPI.setPlaceholders(player, event.getMessage());
                // use formatted message
            });
        });
    }
}
```

## Package: at.helpch.placeholderapi

### Class: at.helpch.placeholderapi.PlaceholderAPI
Type: Class

Methods:
- **static** String setPlaceholders(PlayerRef player, String text)
- **static** String setRelationalPlaceholders(PlayerRef one, PlayerRef two, String text)

## Package: at.helpch.placeholderapi.expansion

### Class: at.helpch.placeholderapi.expansion.PlaceholderExpansion
Type: Abstract Class

Methods:
- **abstract** String getIdentifier()
- **abstract** String getAuthor()
- **abstract** String getVersion()
- String onPlaceholderRequest(PlayerRef player, String params)
- boolean persist()
- boolean canRegister()
- String getRequiredPlugin()
- boolean register()

### Interface: at.helpch.placeholderapi.expansion.Relational

Methods:
- String onPlaceholderRequest(PlayerRef one, PlayerRef two, String params)

## Hytale Core Classes Used

### Class: com.hypixel.hytale.server.core.plugin.JavaPlugin
Type: Abstract Class

Constructors:
- JavaPlugin(JavaPluginInit init)

Methods:
- void start()
- EventRegistry getEventRegistry()

### Class: com.hypixel.hytale.server.core.HytaleServer
Type: Class

Methods:
- **static** HytaleServer get()
- PluginManager getPluginManager()

### Class: com.hypixel.hytale.server.api.player.PlayerRef
Type: Interface

Methods:
- String getName()
- World getWorld()

### Class: com.hypixel.hytale.common.plugin.PluginIdentifier
Type: Class

Methods:
- **static** PluginIdentifier fromString(String identifier)

## Key Differences from Minecraft PlaceholderAPI

| Minecraft | Hytale |
|---|---|
| `me.clip.placeholderapi.*` | `at.helpch.placeholderapi.*` |
| `OfflinePlayer` / `Player` | `PlayerRef` |
| `Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")` | `HytaleServer.get().getPluginManager().getPlugin(PluginIdentifier.fromString("HelpChat:PlaceholderAPI")) != null` |
| `JavaPlugin` from `org.bukkit.plugin` | `JavaPlugin` from `com.hypixel.hytale.server.core.plugin` |
| Thread-safe by default | Must run on world thread via `player.getWorld().execute()` |
| `plugin.yml` depend | `OptionalDependencies` in manifest |

## Manifest Declaration

```json
"OptionalDependencies": {
    "HelpChat:PlaceholderAPI": ">= 1.0.2"
}
```
