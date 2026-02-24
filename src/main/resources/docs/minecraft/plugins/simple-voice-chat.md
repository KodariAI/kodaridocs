# Simple Voice Chat API

Proximity voice chat mod for Minecraft with a server-side plugin API. Allows plugins to create audio channels, play audio, intercept voice packets, manage groups, and simulate player microphone input. Works on Bukkit/Spigot/Paper. Audio format is 48kHz 16-bit mono PCM (short[]), encoded/decoded with Opus via the API.

## Code Examples

### Register a VoicechatPlugin (Bukkit)

Your plugin.yml must declare `depend: [ voicechat ]`.

```java
import de.maxhenkel.voicechat.api.BukkitVoicechatService;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        BukkitVoicechatService service = getServer().getServicesManager().load(BukkitVoicechatService.class);
        if (service != null) {
            service.registerPlugin(new MyVoicechatPlugin());
        }
    }
}
```

### Implement VoicechatPlugin

Events can ONLY be registered inside `registerEvents`. Calling `EventRegistration.registerEvent` outside this method will not work.

```java
import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.VoicechatPlugin;
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.events.EventRegistration;
import de.maxhenkel.voicechat.api.events.VoicechatServerStartedEvent;
import de.maxhenkel.voicechat.api.events.MicrophonePacketEvent;
import de.maxhenkel.voicechat.api.events.PlayerConnectedEvent;

public class MyVoicechatPlugin implements VoicechatPlugin {

    private VoicechatApi api;

    @Override
    public String getPluginId() {
        return "my_plugin"; // must be unique
    }

    @Override
    public void initialize(VoicechatApi api) {
        this.api = api;
    }

    @Override
    public void registerEvents(EventRegistration registration) {
        registration.registerEvent(VoicechatServerStartedEvent.class, this::onServerStarted);
        registration.registerEvent(MicrophonePacketEvent.class, this::onMicPacket);
        registration.registerEvent(PlayerConnectedEvent.class, this::onPlayerConnected);
        // optional priority (higher = runs first, default 0):
        // registration.registerEvent(SomeEvent.class, this::handler, 100);
    }

    private void onServerStarted(VoicechatServerStartedEvent event) {
        VoicechatServerApi serverApi = event.getVoicechat();
        // serverApi is the main entry point for server-side operations
    }

    private void onMicPacket(MicrophonePacketEvent event) {
        // Intercept/modify microphone packets from players
        byte[] opusData = event.getPacket().getOpusEncodedData();
    }

    private void onPlayerConnected(PlayerConnectedEvent event) {
        VoicechatServerApi serverApi = event.getVoicechat();
        // event.getConnection() gives the VoicechatConnection
    }
}
```

### Check if a Player Has Voice Chat Connected

```java
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import java.util.UUID;

// serverApi obtained from any ServerEvent via event.getVoicechat()
VoicechatConnection connection = serverApi.getConnectionOf(playerUuid);
if (connection != null && connection.isConnected()) {
    // player has voice chat connected
}
// connection.isInstalled() - true if player has the mod installed
// connection.isDisabled() - true if player disabled voice chat
```

### Create a Locational Audio Channel (sound at a position)

```java
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.ServerLevel;
import de.maxhenkel.voicechat.api.audiochannel.LocationalAudioChannel;
import java.util.UUID;

// serverApi from a ServerEvent; world is org.bukkit.World; x,y,z are doubles
ServerLevel level = serverApi.fromServerLevel(world);
Position pos = serverApi.createPosition(x, y, z);
UUID channelId = UUID.randomUUID();

LocationalAudioChannel channel = serverApi.createLocationalAudioChannel(channelId, level, pos);
if (channel != null) {
    channel.setDistance(48F); // audible range in blocks
    // channel.setCategory("my_category"); // optional custom volume category
}
```

### Create an Entity Audio Channel (sound follows an entity)

```java
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.Entity;
import de.maxhenkel.voicechat.api.audiochannel.EntityAudioChannel;
import java.util.UUID;

// bukkitEntity is org.bukkit.entity.Entity
Entity entity = serverApi.fromEntity(bukkitEntity);
UUID channelId = UUID.randomUUID();

EntityAudioChannel channel = serverApi.createEntityAudioChannel(channelId, entity);
if (channel != null) {
    channel.setDistance(64F);
    channel.setWhispering(false);
}
```

### Create a Static Audio Channel (non-positional, sent to a specific player)

```java
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.ServerLevel;
import de.maxhenkel.voicechat.api.audiochannel.StaticAudioChannel;
import java.util.UUID;

ServerLevel level = serverApi.fromServerLevel(world);
VoicechatConnection connection = serverApi.getConnectionOf(playerUuid);
UUID channelId = UUID.randomUUID();

StaticAudioChannel channel = serverApi.createStaticAudioChannel(channelId, level, connection);
// Audio is heard non-directionally by the target player
```

### Play Audio Through a Channel (AudioPlayer)

Audio must be 48kHz 16-bit mono PCM (short[]). The API handles Opus encoding.

```java
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.audiochannel.AudioChannel;
import de.maxhenkel.voicechat.api.audiochannel.AudioPlayer;
import de.maxhenkel.voicechat.api.opus.OpusEncoder;

// channel is any AudioChannel (Locational, Entity, or Static)
// audio is short[] of 48kHz 16-bit mono PCM samples
OpusEncoder encoder = serverApi.createEncoder();
AudioPlayer player = serverApi.createAudioPlayer(channel, encoder, audio);

player.setOnStopped(() -> {
    encoder.close(); // always close encoder when done
});

player.startPlaying();
// player.stopPlaying(); // stop early if needed
// player.isPlaying(); // check state
```

For streaming/dynamic audio, use the Supplier variant:

```java
import java.util.function.Supplier;

Supplier<short[]> audioSupplier = () -> {
    // return next chunk of audio, or null to stop
    return getNextAudioChunk();
};
AudioPlayer player = serverApi.createAudioPlayer(channel, encoder, audioSupplier);
player.startPlaying();
```

### Send Raw Opus Data Directly to a Channel

```java
// For pre-encoded opus data, send directly to the channel
channel.send(opusEncodedBytes);
channel.flush(); // call when finished sending
```

### AudioSender (Simulate Player Microphone Input)

Only one AudioSender can exist per player at a time.

```java
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.audiosender.AudioSender;

VoicechatConnection connection = serverApi.getConnectionOf(playerUuid);
AudioSender sender = serverApi.createAudioSender(connection);
serverApi.registerAudioSender(sender);

// Send opus-encoded audio as if the player spoke
sender.whispering(false);
if (sender.canSend()) {
    sender.send(opusEncodedData);
}

sender.reset(); // signals end of audio stream to clients
serverApi.unregisterAudioSender(sender);
```

### Manage Groups

```java
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.VoicechatConnection;

// Create a group
Group group = serverApi.groupBuilder()
    .setName("Party Chat")
    .setPassword("secret")        // null for no password
    .setPersistent(true)           // survives server restart
    .setType(Group.Type.ISOLATED)  // NORMAL, OPEN, or ISOLATED
    .setHidden(false)
    .build();

// Add a player to the group
VoicechatConnection conn = serverApi.getConnectionOf(playerUuid);
if (conn != null) {
    conn.setGroup(group);
}

// Remove group
serverApi.removeGroup(group.getId());

// Group.Type.NORMAL   - group members hear nearby non-group players too
// Group.Type.OPEN     - nearby players can hear group members and vice versa
// Group.Type.ISOLATED - group members only hear each other
```

### Register a Volume Category

```java
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.VolumeCategory;
import de.maxhenkel.voicechat.api.events.VoicechatServerStartedEvent;

private void onServerStarted(VoicechatServerStartedEvent event) {
    VoicechatServerApi api = event.getVoicechat();
    VolumeCategory category = api.volumeCategoryBuilder()
        .setId("my_sounds")           // 1-16 chars, lowercase a-z and _ only
        .setName("My Custom Sounds")
        .setDescription("Volume for custom plugin sounds")
        // .setIcon(int[][] icon)      // optional 16x16 icon
        .build();
    api.registerVolumeCategory(category);
}
// Then use: channel.setCategory("my_sounds");
```

### Encode and Decode Opus Audio

```java
import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.opus.OpusEncoder;
import de.maxhenkel.voicechat.api.opus.OpusDecoder;
import de.maxhenkel.voicechat.api.opus.OpusEncoderMode;

// api obtained from initialize() or from VoicechatServerApi (which extends VoicechatApi)
OpusEncoder encoder = api.createEncoder();
// or: OpusEncoder encoder = api.createEncoder(OpusEncoderMode.AUDIO);
// modes: VOIP, AUDIO, RESTRICTED_LOWDELAY

byte[] opusData = encoder.encode(pcmShortArray);
encoder.close(); // MUST close to avoid memory leak

OpusDecoder decoder = api.createDecoder();
short[] pcm = decoder.decode(opusData);
decoder.close(); // MUST close to avoid memory leak
```

### Filter Who Hears an Audio Channel

```java
import de.maxhenkel.voicechat.api.ServerPlayer;
import java.util.function.Predicate;

// Only let players within 100 blocks hear the channel
channel.setFilter(serverPlayer -> {
    // serverPlayer.getPlayer() returns the platform player object (org.bukkit.entity.Player on Bukkit)
    return true; // return false to exclude this player
});
```

### Get Players in Range

```java
import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.ServerLevel;
import de.maxhenkel.voicechat.api.Position;
import java.util.Collection;

ServerLevel level = serverApi.fromServerLevel(world);
Position pos = serverApi.createPosition(x, y, z);
Collection<ServerPlayer> nearby = serverApi.getPlayersInRange(level, pos, 50.0);
// Each ServerPlayer.getPlayer() returns the platform-specific player object
```

### Listen to All Audio a Player Receives

```java
import de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener;
import de.maxhenkel.voicechat.api.packets.SoundPacket;

PlayerAudioListener listener = serverApi.playerAudioListenerBuilder()
    .setPlayer(playerUuid)
    .setPacketListener(soundPacket -> {
        byte[] opusData = soundPacket.getOpusEncodedData();
        UUID sender = soundPacket.getSender();
    })
    .build();
serverApi.registerAudioListener(listener);
// serverApi.unregisterAudioListener(listener);
```

## Key Events

All events extend `de.maxhenkel.voicechat.api.events.Event`. Server events provide `getVoicechat()` returning `VoicechatServerApi`.

| Event Class | When Fired |
|---|---|
| `VoicechatServerStartedEvent` | Voice chat server fully started. Best place to initialize channels and categories. |
| `VoicechatServerStartingEvent` | Before voice chat server starts. Can set custom socket implementation. |
| `VoicechatServerStoppedEvent` | Voice chat server stopped. |
| `PlayerConnectedEvent` | Player connects to voice chat. Provides `VoicechatConnection`. |
| `PlayerDisconnectedEvent` | Player disconnects. Provides player UUID only. |
| `PlayerStateChangedEvent` | Player enables/disables voice chat or connects/disconnects. |
| `MicrophonePacketEvent` | Microphone packet arrives at server. Can read/modify opus data. |
| `EntitySoundPacketEvent` | Entity sound packet about to be sent to a client. Cancellable. |
| `LocationalSoundPacketEvent` | Locational sound packet about to be sent. Cancellable. |
| `StaticSoundPacketEvent` | Static sound packet about to be sent. Cancellable. |
| `CreateGroupEvent` | Player creates a group. Cancellable. |
| `JoinGroupEvent` | Player joins a group. Cancellable. |
| `LeaveGroupEvent` | Player leaves a group. |
| `RemoveGroupEvent` | Group is removed. Cancellable only if persistent. |

SoundPacketEvent subtypes provide `getSource()` returning one of: `SOURCE_PROXIMITY`, `SOURCE_GROUP`, `SOURCE_SPECTATOR`, `SOURCE_PLUGIN`.

## API Reference

### de.maxhenkel.voicechat.api.VoicechatPlugin (Interface)
- `String getPluginId()` - unique plugin ID
- `void initialize(VoicechatApi api)` - called after loading
- `void registerEvents(EventRegistration registration)` - register events here ONLY

### de.maxhenkel.voicechat.api.BukkitVoicechatService (Interface)
- `void registerPlugin(VoicechatPlugin plugin)` - register on Bukkit servers

### de.maxhenkel.voicechat.api.VoicechatApi (Interface)
- `OpusEncoder createEncoder()` / `createEncoder(OpusEncoderMode mode)`
- `OpusDecoder createDecoder()`
- `AudioConverter getAudioConverter()`
- `Position createPosition(double x, double y, double z)`
- `Entity fromEntity(Object entity)` - wraps platform entity
- `ServerLevel fromServerLevel(Object level)` - wraps platform world
- `ServerPlayer fromServerPlayer(Object player)` - wraps platform player
- `VolumeCategory.Builder volumeCategoryBuilder()`
- `double getVoiceChatDistance()`

### de.maxhenkel.voicechat.api.VoicechatServerApi (Interface, extends VoicechatApi)
- `EntityAudioChannel createEntityAudioChannel(UUID channelId, Entity entity)`
- `LocationalAudioChannel createLocationalAudioChannel(UUID channelId, ServerLevel level, Position position)`
- `StaticAudioChannel createStaticAudioChannel(UUID channelId, ServerLevel level, VoicechatConnection connection)`
- `AudioPlayer createAudioPlayer(AudioChannel channel, OpusEncoder encoder, short[] audio)`
- `AudioPlayer createAudioPlayer(AudioChannel channel, OpusEncoder encoder, Supplier<short[]> audioSupplier)`
- `AudioSender createAudioSender(VoicechatConnection connection)`
- `void registerAudioSender(AudioSender sender)` - one per player
- `void unregisterAudioSender(AudioSender sender)`
- `VoicechatConnection getConnectionOf(UUID playerUuid)`
- `VoicechatConnection getConnectionOf(ServerPlayer player)`
- `Group.Builder groupBuilder()`
- `void removeGroup(UUID groupId)`
- `Group getGroup(UUID groupId)`
- `List<Group> getGroups()`
- `Collection<ServerPlayer> getPlayersInRange(ServerLevel level, Position position, double range)`
- `Collection<ServerPlayer> getPlayersInRange(ServerLevel level, Position position, double range, Predicate<ServerPlayer> filter)`
- `void registerVolumeCategory(VolumeCategory category)`
- `void unregisterVolumeCategory(String categoryId)`
- `Collection<VolumeCategory> getVolumeCategories()`
- `void registerAudioListener(AudioListener listener)`
- `void unregisterAudioListener(AudioListener listener)` / `unregisterAudioListener(UUID listenerId)`
- `PlayerAudioListener.Builder playerAudioListenerBuilder()`
- `void sendEntitySoundPacketTo(VoicechatConnection connection, EntitySoundPacket packet)`
- `void sendLocationalSoundPacketTo(VoicechatConnection connection, LocationalSoundPacket packet)`
- `void sendStaticSoundPacketTo(VoicechatConnection connection, StaticSoundPacket packet)`
- `double getBroadcastRange()`
- `ConfigAccessor getServerConfig()`

### de.maxhenkel.voicechat.api.VoicechatConnection (Interface)
- `ServerPlayer getPlayer()`
- `boolean isConnected()` - may be faked by other plugins
- `boolean isInstalled()`
- `boolean isDisabled()`
- `boolean isInGroup()`
- `Group getGroup()` - state at time of fetch
- `void setGroup(Group group)` - joins player to group
- `void setConnected(boolean connected)`
- `void setDisabled(boolean disabled)`

### de.maxhenkel.voicechat.api.audiochannel.AudioChannel (Interface)
- `UUID getId()`
- `void send(byte[] opusData)`
- `void send(MicrophonePacket packet)`
- `void flush()` - call when done sending
- `void setFilter(Predicate<ServerPlayer> filter)`
- `void setCategory(String category)`
- `boolean isClosed()`

### de.maxhenkel.voicechat.api.audiochannel.EntityAudioChannel (extends AudioChannel)
- `void setDistance(float distance)`
- `void setWhispering(boolean whispering)`
- `void updateEntity(Entity entity)`

### de.maxhenkel.voicechat.api.audiochannel.LocationalAudioChannel (extends AudioChannel)
- `void setDistance(float distance)`
- `void updateLocation(Position location)`

### de.maxhenkel.voicechat.api.audiochannel.AudioPlayer (Interface)
- `void startPlaying()`
- `void stopPlaying()`
- `boolean isPlaying()`
- `boolean isStarted()`
- `boolean isStopped()`
- `void setOnStopped(Runnable onStopped)`

### de.maxhenkel.voicechat.api.audiosender.AudioSender (Interface)
- `boolean canSend()`
- `void send(byte[] opusData)` - acts as player microphone input
- `AudioSender whispering(boolean whispering)`
- `AudioSender sequenceNumber(long sequenceNumber)`
- `void reset()` - signals end of stream

### de.maxhenkel.voicechat.api.Group (Interface)
- `String getName()`
- `UUID getId()`
- `boolean hasPassword()`
- `boolean isPersistent()`
- `boolean isHidden()`
- `Group.Type getType()` - NORMAL, OPEN, or ISOLATED

### de.maxhenkel.voicechat.api.Group.Builder (Interface)
- `Builder setName(String name)`
- `Builder setPassword(String password)`
- `Builder setPersistent(boolean persistent)`
- `Builder setType(Group.Type type)`
- `Builder setHidden(boolean hidden)`
- `Builder setId(UUID id)`
- `Group build()`

### de.maxhenkel.voicechat.api.opus.OpusEncoder (Interface)
- `byte[] encode(short[] rawAudio)` - encodes 48kHz 16-bit mono PCM to opus
- `void resetState()`
- `void close()` - MUST call to avoid memory leak
- `boolean isClosed()`

### de.maxhenkel.voicechat.api.opus.OpusDecoder (Interface)
- `short[] decode(byte[] opus)` - decodes opus to 48kHz 16-bit mono PCM
- `void resetState()`
- `void close()` - MUST call to avoid memory leak
- `boolean isClosed()`

### de.maxhenkel.voicechat.api.audio.AudioConverter (Interface)
- `short[] bytesToShorts(byte[] bytes)`
- `byte[] shortsToBytes(short[] shorts)`
- `float[] shortsToFloats(short[] shorts)`
- `short[] floatsToShorts(float[] floats)`

### de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener.Builder (Interface)
- `Builder setPlayer(ServerPlayer player)` or `Builder setPlayer(UUID playerUuid)`
- `Builder setPacketListener(Consumer<SoundPacket> listener)` - required
- `PlayerAudioListener build()`

### de.maxhenkel.voicechat.api.VolumeCategory.Builder (Interface)
- `Builder setId(String id)` - 1-16 chars, lowercase a-z and _ only
- `Builder setName(String name)`
- `Builder setDescription(String description)`
- `Builder setIcon(int[][] icon)` - 16x16 array
- `VolumeCategory build()`

### de.maxhenkel.voicechat.api.events.EventRegistration (Interface)
- `<T extends Event> void registerEvent(Class<T> eventClass, Consumer<T> listener)`
- `<T extends Event> void registerEvent(Class<T> eventClass, Consumer<T> listener, int priority)`

### de.maxhenkel.voicechat.api.packets.MicrophonePacket (Interface, extends ConvertablePacket)
- `byte[] getOpusEncodedData()`
- `void setOpusEncodedData(byte[] data)`
- `boolean isWhispering()`
- `EntitySoundPacket.Builder entitySoundPacketBuilder()`
- `LocationalSoundPacket.Builder locationalSoundPacketBuilder()`
- `StaticSoundPacket.Builder staticSoundPacketBuilder()`

### de.maxhenkel.voicechat.api.packets.SoundPacket (Interface)
- `UUID getChannelId()`
- `UUID getSender()`
- `byte[] getOpusEncodedData()`
- `long getSequenceNumber()`
- `String getCategory()`

### de.maxhenkel.voicechat.api.Position (Interface)
- `double getX()` / `double getY()` / `double getZ()`

### de.maxhenkel.voicechat.api.ServerPlayer (Interface)
- `Object getPlayer()` - returns platform player (org.bukkit.entity.Player on Bukkit)
- `ServerLevel getServerLevel()`

### de.maxhenkel.voicechat.api.ServerLevel (Interface)
- `Object getServerLevel()` - returns platform world (org.bukkit.World on Bukkit)

### de.maxhenkel.voicechat.api.Entity (Interface)
- `Object getEntity()` - returns platform entity
- `UUID getUuid()`
- `Position getPosition()`

### de.maxhenkel.voicechat.api.config.ConfigAccessor (Interface)
- `Object getValue(String key)`
- `boolean hasKey(String key)`
- `String getString(String key, String defaultValue)`
- `int getInt(String key, int defaultValue)`
- `double getDouble(String key, double defaultValue)`
- `boolean getBoolean(String key, boolean defaultValue)`
