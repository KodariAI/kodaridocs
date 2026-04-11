# Floodgate API

Floodgate allows Bedrock Edition players to join Java Edition servers through Geyser. The API lets you detect Bedrock players, query their device/platform info, send Bedrock-native forms, and manage account linking.

## Checking if a Player is from Bedrock

```java
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.geysermc.floodgate.api.FloodgateApi;

public class BedrockDetector implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        FloodgateApi api = FloodgateApi.getInstance();

        if (api.isFloodgatePlayer(player.getUniqueId())) {
            player.sendMessage("Welcome, Bedrock player!");
        }
    }
}
```

## Getting FloodgatePlayer Info

```java
import java.util.UUID;
import org.bukkit.entity.Player;
import org.geysermc.floodgate.api.FloodgateApi;
import org.geysermc.floodgate.api.player.FloodgatePlayer;
import org.geysermc.floodgate.util.DeviceOs;
import org.geysermc.floodgate.util.InputMode;

public void showPlayerInfo(Player player) {
    FloodgateApi api = FloodgateApi.getInstance();
    UUID uuid = player.getUniqueId();

    if (!api.isFloodgatePlayer(uuid)) return;

    FloodgatePlayer fp = api.getPlayer(uuid);

    String bedrockUsername = fp.getUsername();        // raw Bedrock gamertag
    String javaUsername = fp.getJavaUsername();       // processed name used on server (prefix, trimmed)
    String xuid = fp.getXuid();                      // Xbox User ID
    String version = fp.getVersion();                // Bedrock client version
    String langCode = fp.getLanguageCode();          // e.g. "en_US"
    DeviceOs deviceOs = fp.getDeviceOs();            // GOOGLE, IOS, UWP, XBOX, PS4, NX, etc.
    InputMode inputMode = fp.getInputMode();         // KEYBOARD_MOUSE, TOUCH, CONTROLLER, VR
    boolean fromProxy = fp.isFromProxy();            // connected through a proxy
    boolean linked = fp.isLinked();                  // has a linked Java account
}
```

## Sending Bedrock Forms

Bedrock supports three form types via the Cumulus library. Forms can be sent through `FloodgateApi.sendForm(uuid, form)` or `FloodgatePlayer.sendForm(form)`.

### SimpleForm (Buttons with Optional Images)

```java
import java.util.UUID;
import org.geysermc.cumulus.form.SimpleForm;
import org.geysermc.cumulus.util.FormImage;
import org.geysermc.floodgate.api.FloodgateApi;

public void sendSimpleForm(UUID uuid) {
    SimpleForm form = SimpleForm.builder()
        .title("Server Menu")
        .content("Choose an option:")
        .button("Survival")
        .button("Creative")
        .button("Store", FormImage.Type.URL, "https://example.com/store.png")
        .button("Settings", FormImage.Type.PATH, "textures/ui/settings_glyph_color_2x.png")
        .validResultHandler(response -> {
            int buttonId = response.clickedButtonId();
            // 0 = Survival, 1 = Creative, 2 = Store, 3 = Settings
        })
        .closedOrInvalidResultHandler(() -> {
            // player closed the form or sent invalid data
        })
        .build();

    FloodgateApi.getInstance().sendForm(uuid, form);
}
```

### ModalForm (Two-Button Yes/No Dialog)

```java
import java.util.UUID;
import org.geysermc.cumulus.form.ModalForm;
import org.geysermc.floodgate.api.FloodgateApi;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public void sendModalForm(UUID uuid) {
    ModalForm form = ModalForm.builder()
        .title("Confirm Teleport")
        .content("Teleport to spawn?")
        .button1("Yes")
        .button2("No")
        .validResultHandler(response -> {
            if (response.clickedFirst()) {
                // player clicked "Yes" (button1)
            } else {
                // player clicked "No" (button2)
            }
        })
        .build();

    FloodgatePlayer fp = FloodgateApi.getInstance().getPlayer(uuid);
    fp.sendForm(form);
}
```

### CustomForm (Inputs, Dropdowns, Toggles, Sliders)

```java
import java.util.UUID;
import org.geysermc.cumulus.form.CustomForm;
import org.geysermc.floodgate.api.FloodgateApi;

public void sendCustomForm(UUID uuid) {
    CustomForm form = CustomForm.builder()
        .title("Player Settings")
        .dropdown("Game Mode", "Survival", "Creative", "Adventure")
        .input("Nickname", "Enter nickname", "")
        .toggle("Enable PvP", true)
        .slider("Render Distance", 2, 32, 1, 12)
        .label("This is informational text")
        .validResultHandler(response -> {
            int gameModeIndex = response.asDropdown();  // index of selected dropdown option
            String nickname = response.asInput();       // text entered
            boolean pvpEnabled = response.asToggle();   // toggle state
            float renderDist = response.asSlider();     // slider value
            response.next();                            // skip label
        })
        .closedOrInvalidResultHandler(() -> {
            // form was closed or invalid
        })
        .build();

    FloodgateApi.getInstance().sendForm(uuid, form);
}
```

## Xbox Gamertag / XUID Lookups

```java
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.geysermc.floodgate.api.FloodgateApi;

public void lookupXuid(String gamertag) {
    FloodgateApi api = FloodgateApi.getInstance();

    CompletableFuture<Long> xuidFuture = api.getXuidFor(gamertag);
    xuidFuture.thenAccept(xuid -> {
        // xuid is the numeric Xbox User ID
    });

    CompletableFuture<String> gamertagFuture = api.getGamertagFor(12345L);
    gamertagFuture.thenAccept(tag -> {
        // tag is the gamertag string
    });

    CompletableFuture<UUID> uuidFuture = api.getUuidFor(gamertag);
    uuidFuture.thenAccept(uuid -> {
        // uuid is the Floodgate UUID for that gamertag
    });
}
```

## Transfer a Bedrock Player to Another Server

```java
import java.util.UUID;
import org.geysermc.floodgate.api.FloodgateApi;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public void transferPlayer(UUID uuid) {
    // Via API
    FloodgateApi.getInstance().transferPlayer(uuid, "play.example.com", 19132);

    // Via FloodgatePlayer
    FloodgatePlayer fp = FloodgateApi.getInstance().getPlayer(uuid);
    fp.transfer("play.example.com", 19132);
}
```

## Listening to Skin Apply Events

```java
import org.geysermc.event.subscribe.Subscribe;
import org.geysermc.floodgate.api.FloodgateApi;
import org.geysermc.floodgate.api.event.skin.SkinApplyEvent;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public class SkinListener {
    public void register() {
        FloodgateApi.getInstance().getEventBus().subscribe(SkinApplyEvent.class, this::onSkinApply);
    }

    public void onSkinApply(SkinApplyEvent event) {
        FloodgatePlayer player = event.player();
        SkinApplyEvent.SkinData currentSkin = event.currentSkin();
        SkinApplyEvent.SkinData newSkin = event.newSkin();

        String skinValue = newSkin.value();
        String skinSignature = newSkin.signature();

        // Cancel to prevent the skin from being applied
        // event.setCancelled(true);
    }
}
```

## Account Linking

```java
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.geysermc.floodgate.api.FloodgateApi;
import org.geysermc.floodgate.api.link.PlayerLink;
import org.geysermc.floodgate.api.player.FloodgatePlayer;
import org.geysermc.floodgate.util.LinkedPlayer;

public void checkLinked(UUID uuid) {
    FloodgateApi api = FloodgateApi.getInstance();
    PlayerLink playerLink = api.getPlayerLink();

    if (!playerLink.isEnabledAndAllowed()) return;

    CompletableFuture<Boolean> linked = playerLink.isLinkedPlayer(uuid);
    linked.thenAccept(isLinked -> {
        if (isLinked) {
            playerLink.getLinkedPlayer(uuid).thenAccept(linkedPlayer -> {
                // linkedPlayer contains the linked Java account info
            });
        }
    });

    // Or via FloodgatePlayer directly
    FloodgatePlayer fp = api.getPlayer(uuid);
    if (fp != null && fp.isLinked()) {
        LinkedPlayer lp = fp.getLinkedPlayer();
        // lp has linked account info
    }
}
```

---

## API Reference

### org.geysermc.floodgate.api.FloodgateApi (Interface)
- `static FloodgateApi getInstance()`
- `boolean isFloodgatePlayer(UUID uuid)`
- `boolean isFloodgateId(UUID uuid)`
- `FloodgatePlayer getPlayer(UUID uuid)`
- `Collection<FloodgatePlayer> getPlayers()`
- `int getPlayerCount()`
- `boolean sendForm(UUID uuid, org.geysermc.cumulus.form.Form form)`
- `boolean sendForm(UUID uuid, org.geysermc.cumulus.form.util.FormBuilder<?,?,?> formBuilder)`
- `boolean closeForm(UUID uuid)`
- `boolean transferPlayer(UUID uuid, String address, int port)`
- `CompletableFuture<Long> getXuidFor(String gamertag)`
- `CompletableFuture<String> getGamertagFor(long xuid)`
- `CompletableFuture<UUID> getUuidFor(String gamertag)`
- `UUID createJavaPlayerId(long xuid)`
- `String getPlayerPrefix()`
- `FloodgateEventBus getEventBus()`
- `PlayerLink getPlayerLink()`

### org.geysermc.floodgate.api.player.FloodgatePlayer (Interface)
- `String getUsername()` - raw Bedrock gamertag
- `String getJavaUsername()` - processed server username (prefix, trimmed)
- `UUID getJavaUniqueId()` - Floodgate-assigned UUID
- `UUID getCorrectUniqueId()` - linked Java UUID if linked, otherwise Floodgate UUID
- `String getCorrectUsername()` - linked Java name if linked, otherwise Java username
- `String getXuid()` - Xbox User ID
- `String getVersion()` - Bedrock client version
- `DeviceOs getDeviceOs()`
- `String getLanguageCode()`
- `UiProfile getUiProfile()`
- `InputMode getInputMode()`
- `boolean isFromProxy()`
- `boolean isLinked()`
- `LinkedPlayer getLinkedPlayer()`
- `boolean sendForm(org.geysermc.cumulus.form.Form form)`
- `boolean sendForm(org.geysermc.cumulus.form.util.FormBuilder<?,?,?> formBuilder)`
- `boolean transfer(String address, int port)`
- `<T extends FloodgatePlayer> T as(Class<T> clazz)`

### org.geysermc.floodgate.util.DeviceOs (Enum)
`UNKNOWN`, `GOOGLE`, `IOS`, `OSX`, `AMAZON`, `GEARVR`, `HOLOLENS`, `UWP`, `WIN32`, `DEDICATED`, `TVOS`, `PS4`, `NX`, `XBOX`, `WINDOWS_PHONE`

### org.geysermc.floodgate.util.InputMode (Enum)
`UNKNOWN`, `KEYBOARD_MOUSE`, `TOUCH`, `CONTROLLER`, `VR`

### org.geysermc.floodgate.util.UiProfile (Enum)
`CLASSIC`, `POCKET`

### org.geysermc.cumulus.form.SimpleForm
- `static SimpleForm.Builder builder()`
- Builder: `title(String)`, `content(String)`, `button(String)`, `button(String, FormImage.Type, String)`, `validResultHandler(Consumer<SimpleFormResponse>)`, `closedResultHandler(Runnable)`, `closedOrInvalidResultHandler(Runnable)`

### org.geysermc.cumulus.form.ModalForm
- `static ModalForm.Builder builder()`
- Builder: `title(String)`, `content(String)`, `button1(String)`, `button2(String)`, `validResultHandler(Consumer<ModalFormResponse>)`, `closedResultHandler(Runnable)`, `closedOrInvalidResultHandler(Runnable)`

### org.geysermc.cumulus.form.CustomForm
- `static CustomForm.Builder builder()`
- Builder: `title(String)`, `dropdown(String, String...)`, `input(String, String, String)`, `toggle(String, boolean)`, `slider(String, float, float, float, float)`, `label(String)`, `stepSlider(String, String...)`, `validResultHandler(Consumer<CustomFormResponse>)`, `closedResultHandler(Runnable)`, `closedOrInvalidResultHandler(Runnable)`

### org.geysermc.cumulus.response.SimpleFormResponse
- `int clickedButtonId()`
- `ButtonComponent clickedButton()`

### org.geysermc.cumulus.response.ModalFormResponse
- `int clickedButtonId()`
- `String clickedButtonText()`
- `boolean clickedFirst()` - true if button1 was clicked

### org.geysermc.cumulus.response.CustomFormResponse
- `<T> T next()` - returns next component value (in order added to builder)
- `int asDropdown()` - index of selected dropdown option
- `String asInput()` - text entered
- `boolean asToggle()` - toggle state
- `float asSlider()` - slider value
- `int asStepSlider()` - index of selected step

### org.geysermc.cumulus.util.FormImage.Type (Enum)
`URL`, `PATH`

### org.geysermc.floodgate.api.event.skin.SkinApplyEvent (Interface)
- `FloodgatePlayer player()`
- `SkinApplyEvent.SkinData currentSkin()`
- `SkinApplyEvent.SkinData newSkin()`
- `SkinApplyEvent newSkin(SkinApplyEvent.SkinData skinData)`
- Extends `org.geysermc.event.Cancellable`: `boolean isCancelled()`, `void setCancelled(boolean cancelled)`

### org.geysermc.floodgate.api.event.skin.SkinApplyEvent.SkinData (Interface)
- `String value()`
- `String signature()`

### org.geysermc.floodgate.api.link.PlayerLink (Interface)
- `boolean isEnabled()`
- `boolean isAllowLinking()`
- `boolean isEnabledAndAllowed()`
- `CompletableFuture<Boolean> isLinkedPlayer(UUID playerId)`
- `CompletableFuture<LinkedPlayer> getLinkedPlayer(UUID bedrockId)`
- `CompletableFuture<Void> linkPlayer(UUID bedrockId, UUID javaId, String username)`
- `CompletableFuture<Void> unlinkPlayer(UUID javaId)`
- `long getVerifyLinkTimeout()`

### org.geysermc.floodgate.api.handshake.HandshakeHandlers (Interface)
- `int addHandshakeHandler(HandshakeHandler handler)`
- `void removeHandshakeHandler(int handlerId)`

### org.geysermc.floodgate.api.handshake.HandshakeData (Interface)
- `boolean isFloodgatePlayer()`
- `BedrockData getBedrockData()`
- `String getIp()`, `void setIp(String)`
- `String getHostname()`, `void setHostname(String)`
- `UUID getCorrectUniqueId()`, `UUID getJavaUniqueId()`
- `String getCorrectUsername()`, `String getJavaUsername()`
- `LinkedPlayer getLinkedPlayer()`, `void setLinkedPlayer(LinkedPlayer)`
- `boolean shouldDisconnect()`, `void setDisconnectReason(String)`
