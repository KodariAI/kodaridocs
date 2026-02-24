# GeyserMC API Reference

GeyserMC is a bridge/proxy that allows Minecraft: Bedrock Edition clients to join Minecraft: Java Edition servers. The Geyser API lets plugins detect Bedrock players, access their connection data, send Bedrock-native forms, manipulate the Bedrock camera, and listen to Geyser-specific events.

## Code Examples

### Check if a player is from Bedrock

```java
import org.geysermc.geyser.api.GeyserApi;

public boolean isBedrock(UUID playerUuid) {
    return GeyserApi.api().isBedrockPlayer(playerUuid);
}
```

### Get Bedrock connection info

```java
import org.geysermc.geyser.api.GeyserApi;
import org.geysermc.geyser.api.connection.GeyserConnection;
import org.geysermc.api.util.BedrockPlatform;
import org.geysermc.api.util.InputMode;

public void printBedrockInfo(UUID playerUuid) {
    GeyserConnection connection = GeyserApi.api().connectionByUuid(playerUuid);
    if (connection == null) return; // not a Bedrock player

    String bedrockName = connection.bedrockUsername();
    String xuid = connection.xuid();
    BedrockPlatform platform = connection.platform(); // e.g. UWP, IOS, XBOX, NX
    InputMode input = connection.inputMode();          // KEYBOARD_MOUSE, TOUCH, CONTROLLER, VR
    String clientVersion = connection.version();
    int ping = connection.ping();
    int protocolVersion = connection.protocolVersion();
    boolean linked = connection.isLinked();
}
```

### Iterate all online Bedrock connections

```java
import org.geysermc.geyser.api.GeyserApi;
import org.geysermc.geyser.api.connection.GeyserConnection;
import java.util.List;

List<? extends GeyserConnection> connections = GeyserApi.api().onlineConnections();
int bedrockCount = GeyserApi.api().onlineConnectionsCount();
```

### Send a Bedrock form via Geyser API

```java
import org.geysermc.geyser.api.GeyserApi;
import org.geysermc.cumulus.form.SimpleForm;
import org.geysermc.cumulus.form.CustomForm;
import org.geysermc.cumulus.form.ModalForm;

// Simple form with buttons
SimpleForm simple = SimpleForm.builder()
    .title("Server Menu")
    .content("Pick an option:")
    .button("Teleport Home")
    .button("Open Shop")
    .validResultHandler(response -> {
        int clickedIndex = response.clickedButtonId();
        // handle choice
    })
    .closedResultHandler(() -> {
        // player closed the form
    })
    .build();
GeyserApi.api().sendForm(playerUuid, simple);

// Custom form with inputs
CustomForm custom = CustomForm.builder()
    .title("Settings")
    .dropdown("Language", "English", "Spanish", "French")
    .input("Nickname", "Enter name...")
    .toggle("Enable notifications")
    .slider("Volume", 0, 100, 5, 50)
    .validResultHandler(response -> {
        String lang = response.next();
        String nickname = response.next();
        boolean notifs = response.next();
        float volume = response.next();
    })
    .build();
GeyserApi.api().sendForm(playerUuid, custom);

// Modal form (two-button yes/no dialog)
ModalForm modal = ModalForm.builder()
    .title("Confirm")
    .content("Are you sure you want to reset?")
    .button1("Yes")
    .button2("No")
    .validResultHandler(response -> {
        if (response.clickedButtonId() == 0) {
            // Yes clicked
        }
    })
    .build();
GeyserApi.api().sendForm(playerUuid, modal);
```

### Transfer a Bedrock player to another server

```java
import org.geysermc.geyser.api.GeyserApi;

GeyserApi.api().transfer(playerUuid, "play.example.com", 19132);
```

### Listen to Geyser events (from a Spigot/Paper plugin)

```java
import org.geysermc.geyser.api.GeyserApi;
import org.geysermc.geyser.api.event.EventRegistrar;
import org.geysermc.geyser.api.event.bedrock.SessionJoinEvent;
import org.geysermc.geyser.api.event.bedrock.SessionDisconnectEvent;
import org.geysermc.geyser.api.event.bedrock.SessionLoginEvent;
import org.geysermc.geyser.api.event.connection.GeyserBedrockPingEvent;
import org.geysermc.geyser.api.connection.GeyserConnection;
import org.geysermc.event.subscribe.Subscribe;

public class MyPlugin extends JavaPlugin implements EventRegistrar {

    @Override
    public void onEnable() {
        GeyserApi.api().eventBus().register(this, this);
    }

    @Subscribe
    public void onBedrockJoin(SessionJoinEvent event) {
        GeyserConnection conn = event.connection();
        getLogger().info(conn.bedrockUsername() + " joined from " + conn.platform());
    }

    @Subscribe
    public void onBedrockDisconnect(SessionDisconnectEvent event) {
        String reason = event.disconnectReason();
    }

    @Subscribe
    public void onBedrockLogin(SessionLoginEvent event) {
        // Cancel login if needed
        // event.setCancelled(true, "Reason");
        // Redirect to a different backend server
        // event.remoteServer(newRemoteServer);
    }

    @Subscribe
    public void onPing(GeyserBedrockPingEvent event) {
        event.primaryMotd("My Server");
        event.secondaryMotd("Subtitle");
        event.playerCount(42);
        event.maxPlayerCount(100);
    }
}
```

### Camera control for a Bedrock player

```java
import org.geysermc.geyser.api.GeyserApi;
import org.geysermc.geyser.api.connection.GeyserConnection;
import org.geysermc.geyser.api.bedrock.camera.CameraData;
import org.geysermc.geyser.api.bedrock.camera.CameraFade;
import org.geysermc.geyser.api.bedrock.camera.CameraPosition;
import org.geysermc.geyser.api.bedrock.camera.CameraShake;
import org.geysermc.geyser.api.bedrock.camera.CameraPerspective;
import org.geysermc.geyser.api.bedrock.camera.CameraEaseType;
import java.awt.Color;

GeyserConnection conn = GeyserApi.api().connectionByUuid(playerUuid);
if (conn != null) {
    CameraData camera = conn.camera();

    // Force perspective
    camera.forceCameraPerspective(CameraPerspective.THIRD_PERSON);

    // Shake camera
    camera.shakeCamera(0.5f, 2.0f, CameraShake.ROTATIONAL);
    camera.stopCameraShake();

    // Screen fade
    CameraFade fade = CameraFade.builder()
        .fadeInSeconds(0.5f)
        .fadeHoldSeconds(1.0f)
        .fadeOutSeconds(0.5f)
        .color(Color.BLACK)
        .build();
    camera.sendCameraFade(fade);

    // Move camera to position
    CameraPosition pos = CameraPosition.builder()
        .position(new org.cloudburstmc.math.vector.Vector3f(100, 70, 100))
        .easeType(CameraEaseType.EASE_IN_OUT_SINE)
        .easeSeconds(2.0f)
        .build();
    camera.sendCameraPosition(pos);

    // Fog effects
    camera.sendFog("minecraft:fog_hell");
    camera.removeFog("minecraft:fog_hell");

    // Lock camera
    camera.lockCamera(true, someOwnerUuid);

    // Hide HUD elements
    camera.hideElement(someGuiElement);
    camera.resetElement(someGuiElement);
}
```

## API Reference

### org.geysermc.geyser.api.GeyserApi (interface, extends GeyserApiBase)

Static access: `GeyserApi.api()`

| Method | Returns | Description |
|--------|---------|-------------|
| `api()` | `GeyserApi` | Static singleton accessor |
| `connectionByUuid(UUID)` | `GeyserConnection` | Get connection by UUID, null if not Bedrock |
| `connectionByXuid(String)` | `GeyserConnection` | Get connection by Xbox Live XUID |
| `onlineConnections()` | `List<? extends GeyserConnection>` | All online Bedrock connections |
| `eventBus()` | `EventBus<EventRegistrar>` | Event bus for registering listeners |
| `extensionManager()` | `ExtensionManager` | Manage Geyser extensions |
| `platformType()` | `PlatformType` | Platform Geyser runs on |
| `bedrockListener()` | `BedrockListener` | Bedrock listener info |
| `defaultRemoteServer()` | `RemoteServer` | Configured Java backend server |
| `supportedJavaVersion()` | `MinecraftVersion` | Supported Java MC version |
| `supportedBedrockVersions()` | `List<MinecraftVersion>` | Supported Bedrock MC versions |
| `consoleCommandSource()` | `CommandSource` | Console command source |
| `configDirectory()` | `Path` | Geyser config directory |
| `packDirectory()` | `Path` | Resource pack directory |
| `provider(Class, Object...)` | `<R>` | Get API provider implementation |
| `geyserApiVersion()` | `ApiVersion` | Geyser API version |

### org.geysermc.api.GeyserApiBase (interface, parent of GeyserApi)

| Method | Returns | Description |
|--------|---------|-------------|
| `isBedrockPlayer(UUID)` | `boolean` | Check if online player is Bedrock |
| `connectionByUuid(UUID)` | `Connection` | Get connection by UUID |
| `connectionByXuid(String)` | `Connection` | Get connection by XUID |
| `onlineConnections()` | `List<? extends Connection>` | All online connections |
| `onlineConnectionsCount()` | `int` | Count of online Bedrock players |
| `sendForm(UUID, Form)` | `boolean` | Send a Cumulus form to player |
| `sendForm(UUID, FormBuilder)` | `boolean` | Send a form from builder |
| `transfer(UUID, String, int)` | `boolean` | Transfer player to another server |
| `usernamePrefix()` | `String` | Floodgate username prefix |

### org.geysermc.api.connection.Connection (interface)

| Method | Returns | Description |
|--------|---------|-------------|
| `bedrockUsername()` | `String` | Bedrock gamertag |
| `javaUsername()` | `String` | Java username |
| `javaUuid()` | `UUID` | Java UUID |
| `xuid()` | `String` | Xbox Live XUID |
| `version()` | `String` | Bedrock client version string |
| `platform()` | `BedrockPlatform` | Device platform |
| `languageCode()` | `String` | Client language code |
| `uiProfile()` | `UiProfile` | UI profile (CLASSIC or POCKET) |
| `inputMode()` | `InputMode` | Current input mode |
| `isLinked()` | `boolean` | Whether account is linked via Floodgate |
| `sendForm(Form)` | `boolean` | Send form to this connection |
| `sendForm(FormBuilder)` | `boolean` | Send form builder to this connection |
| `transfer(String, int)` | `boolean` | Transfer this connection to a server |

### org.geysermc.geyser.api.connection.GeyserConnection (interface, extends Connection)

| Method | Returns | Description |
|--------|---------|-------------|
| `camera()` | `CameraData` | Camera control for this connection |
| `entities()` | `EntityData` | Entity data for this connection |
| `ping()` | `int` | Current connection ping in ms |
| `protocolVersion()` | `int` | Bedrock protocol version |
| `hasFormOpen()` | `boolean` | Whether client has a form open |
| `closeForm()` | `void` | Close the currently open form |
| `sendCommand(String)` | `void` | Execute command as this player |
| `playerEntity()` | `GeyserPlayerEntity` | Player entity for this connection |
| `joinAddress()` | `String` | Hostname/IP used to connect |
| `joinPort()` | `int` | Port used to connect |
| `sendSkin(UUID, SkinData)` | `void` | Apply a skin visible to this connection |
| `openPauseScreenAdditions()` | `void` | Open pause screen additions dialog |
| `requestOffhandSwap()` | `void` | Request offhand swap from Java server |
| `playFabId()` | `String` | PlayFab ID of this player |

### org.geysermc.api.util.BedrockPlatform (enum)

`UNKNOWN`, `GOOGLE` (Android), `IOS`, `OSX` (macOS), `AMAZON`, `GEARVR`, `UWP` (Windows), `WIN32` (Windows x86), `DEDICATED`, `PS4` (PlayStation), `NX` (Switch), `XBOX`, `LINUX`

### org.geysermc.api.util.InputMode (enum)

`UNKNOWN`, `KEYBOARD_MOUSE`, `TOUCH`, `CONTROLLER`, `VR`

### org.geysermc.geyser.api.bedrock.camera.CameraData (interface)

| Method | Returns | Description |
|--------|---------|-------------|
| `forceCameraPerspective(CameraPerspective)` | `void` | Force camera perspective |
| `forcedCameraPerspective()` | `CameraPerspective` | Get current forced perspective |
| `shakeCamera(float, float, CameraShake)` | `void` | Shake camera (intensity, duration, type) |
| `stopCameraShake()` | `void` | Stop all camera shaking |
| `sendCameraFade(CameraFade)` | `void` | Send screen fade effect |
| `sendCameraPosition(CameraPosition)` | `void` | Move camera to position |
| `sendFog(String...)` | `void` | Add fog effects |
| `removeFog(String...)` | `void` | Remove fog effects |
| `fogEffects()` | `Set<String>` | Current fog effects |
| `lockCamera(boolean, UUID)` | `boolean` | Lock/unlock camera |
| `isCameraLocked()` | `boolean` | Check if camera is locked |
| `hideElement(GuiElement...)` | `void` | Hide HUD elements |
| `resetElement(GuiElement...)` | `void` | Show hidden HUD elements |
| `hiddenElements()` | `Set<GuiElement>` | Currently hidden elements |
| `clearCameraInstructions()` | `void` | Clear all camera instructions |

### org.geysermc.geyser.api.bedrock.camera.CameraPerspective (enum)

`FIRST_PERSON`, `FREE`, `THIRD_PERSON`, `THIRD_PERSON_FRONT`

### Cumulus Forms (org.geysermc.cumulus.form)

**SimpleForm.builder()** - Button-list form. Methods: `title(String)`, `content(String)`, `button(String)`, `button(String, FormImage.Type, String)`, `validResultHandler(Consumer)`, `closedResultHandler(Runnable)`, `build()`.

**CustomForm.builder()** - Input form. Methods: `title(String)`, `label(String)`, `dropdown(String, String...)`, `input(String, String)`, `toggle(String)`, `slider(String, float min, float max, float step, float defaultVal)`, `validResultHandler(Consumer)`, `closedOrInvalidResultHandler(Runnable)`, `build()`.

**ModalForm.builder()** - Two-button dialog. Methods: `title(String)`, `content(String)`, `button1(String)`, `button2(String)`, `validResultHandler(Consumer)`, `build()`.

### Event Classes

#### Bedrock Session Events (org.geysermc.geyser.api.event.bedrock)

All extend `ConnectionEvent` and provide `connection()` returning `GeyserConnection`.

| Event | Key Methods | Description |
|-------|-------------|-------------|
| `SessionInitializeEvent` | -- | Geyser initializes a new Bedrock session |
| `SessionLoginEvent` | `remoteServer()`, `remoteServer(RemoteServer)`, `setCancelled(boolean, String)`, `cookies()`, `transferring()` | Player logged in, about to connect to Java server. Cancellable. |
| `SessionJoinEvent` | -- | Session connected to Java server, play-ready |
| `SessionDisconnectEvent` | `disconnectReason()`, `disconnectReason(String)` | Player disconnected |
| `SessionLoadResourcePacksEvent` | `resourcePacks()`, `register(ResourcePack)`, `unregister(UUID)` | Resource packs being sent to client |
| `SessionSkinApplyEvent` | `username()`, `uuid()`, `slim()`, `bedrock()`, `skinData()`, `skin(Skin)`, `cape(Cape)`, `geometry(SkinGeometry)` | Skin being applied |
| `ClientEmoteEvent` | `emoteId()`, `setCancelled(boolean)` | Player uses emote. Cancellable. |

#### Connection Events (org.geysermc.geyser.api.event.connection)

| Event | Key Methods | Description |
|-------|-------------|-------------|
| `ConnectionRequestEvent` | `inetSocketAddress()`, `proxyIp()`, `setCancelled(boolean)` | New connection request. Cancellable. |
| `GeyserBedrockPingEvent` | `primaryMotd()`, `secondaryMotd()`, `playerCount()`, `maxPlayerCount()` + setters, `address()` | Bedrock ping/MOTD response |

#### Lifecycle Events (org.geysermc.geyser.api.event.lifecycle)

| Event | Description |
|-------|-------------|
| `GeyserPreInitializeEvent` | Before Geyser initializes |
| `GeyserPostInitializeEvent` | After Geyser initializes |
| `GeyserPreReloadEvent` | Before Geyser reloads |
| `GeyserPostReloadEvent` | After Geyser reloads |
| `GeyserShutdownEvent` | Geyser is shutting down |
| `GeyserLoadResourcePacksEvent` | Global resource packs loaded |
| `GeyserDefineCustomBlocksEvent` | Register custom blocks |
| `GeyserDefineCustomItemsEvent` | Register custom items |
| `GeyserRegisterPermissionsEvent` | Register permissions |

#### Java Server Events (org.geysermc.geyser.api.event.java)

| Event | Description |
|-------|-------------|
| `ServerDefineCommandsEvent` | Java server defines commands. Cancellable. Has `commands()`. |
| `ServerTransferEvent` | Java server requests player transfer. Has `host()`, `port()`, setters. |
