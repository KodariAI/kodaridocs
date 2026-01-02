# simple-voice-chat-api API Reference

**Version:** 2.5.31

## Package: de.maxhenkel.voicechat.api
The main Simple Voice Chat API package.

### Class: de.maxhenkel.voicechat.api.VoicechatApi
Type: Interface

Methods:
- AudioConverter getAudioConverter()
- OpusDecoder createDecoder() - Creates a new opus decoder
- OpusEncoder createEncoder() - Creates a new opus encoder
- OpusEncoder createEncoder(OpusEncoderMode mode) - Creates a new opus encoder
- Mp3Decoder createMp3Decoder(InputStream inputStream) - NOTE: This is not available for Bukkit! It will always return null
- Mp3Encoder createMp3Encoder(AudioFormat format, int bitrate, int quality, OutputStream outputStream) - NOTE: This is not available for Bukkit! It will always return null
- Position createPosition(double x, double y, double z) - Creates a new position object
- Entity fromEntity(Object entity) - Creates an entity object from an actual entity
- ServerLevel fromServerLevel(Object level) - Creates a level object from an actual level
- ServerPlayer fromServerPlayer(Object player) - Creates a player object from an actual player
- double getVoiceChatDistance() - NOTE: Voice chat plugins can change this
- VolumeCategory.Builder volumeCategoryBuilder() - Don't forget to register your category with registerVolumeCategory or registerClientVolumeCategory

### Class: de.maxhenkel.voicechat.api.VoicechatClientApi
Type: Interface

Methods:
- EntityAudioChannel createEntityAudioChannel(UUID uuid) - Deprecated: use createEntityAudioChannel(UUID, Entity)
- EntityAudioChannel createEntityAudioChannel(UUID uuid, Entity entity) - Creates a client side entity audio channel
- StaticAudioChannel createStaticAudioChannel(UUID uuid) - Creates a client side static audio channel
- LocationalAudioChannel createLocationalAudioChannel(UUID uuid, Position position) - Creates a client side locational audio channel
- boolean isMuted()
- boolean isDisabled()
- boolean isDisconnected()
- boolean isInGroup()
- Group getGroup()
- ConfigAccessor getClientConfig()
- void registerClientVolumeCategory(VolumeCategory category) - Registers a volume category just for this client
- void unregisterClientVolumeCategory(VolumeCategory category) - Unregisters a category on this client
- void unregisterClientVolumeCategory(String categoryId) - Unregisters a category on this client

### Class: de.maxhenkel.voicechat.api.VoicechatServerApi
Type: Interface

Methods:
- EntityAudioChannel createEntityAudioChannel(UUID uuid, Entity entity) - Creates a sound channel for the specified entity
- StaticAudioChannel createStaticAudioChannel(UUID uuid, ServerLevel level, VoicechatConnection connection) - Creates a static audio channel
- LocationalAudioChannel createLocationalAudioChannel(UUID uuid, ServerLevel level, Position position) - Creates a sound channel at the provided location
- Group createGroup(String name, String password) - Deprecated: use groupBuilder() instead
- Group createGroup(String name, String password, boolean persistent) - Deprecated: use groupBuilder() instead
- Group.Builder groupBuilder()
- void removeGroup(UUID groupId) - Removes a persistent group
- Group getGroup(UUID groupId) - Gets a group by its ID
- List<Group> getGroups()
- VoicechatConnection getConnectionOf(UUID playerUuid) - Gets the connection of the player with this UUID
- VoicechatConnection getConnectionOf(ServerPlayer player) - Gets the connection of the player
- AudioPlayer createAudioPlayer(AudioChannel channel, OpusEncoder encoder, short[] audio) - Creates a new audio player
- AudioPlayer createAudioPlayer(AudioChannel channel, OpusEncoder encoder, Supplier<short[]> audioSupplier) - Creates a new audio player
- AudioSender createAudioSender(VoicechatConnection connection) - Creates a new audio sender
- ConfigAccessor getServerConfig()
- double getBroadcastRange() - The distance at which audio packets are broadcast
- Collection<ServerPlayer> getPlayersInRange(ServerLevel level, Position position, double range) - A convenience method to get all players in the range of a specific location
- Collection<ServerPlayer> getPlayersInRange(ServerLevel level, Position position, double range, Predicate<ServerPlayer> filter) - A convenience method to get all players in the range of a specific location
- void sendEntitySoundPacketTo(VoicechatConnection connection, EntitySoundPacket packet) - Sends the sound packet to the provided connection
- void sendLocationalSoundPacketTo(VoicechatConnection connection, LocationalSoundPacket packet) - Sends the sound packet to the provided connection
- void sendStaticSoundPacketTo(VoicechatConnection connection, StaticSoundPacket packet) - Sends the sound packet to the provided connection
- void registerVolumeCategory(VolumeCategory category) - Registers a volume category
- void unregisterVolumeCategory(VolumeCategory category) - Unregisters a category for all connected players
- void unregisterVolumeCategory(String categoryId) - Unregisters a category for all connected players
- Collection<VolumeCategory> getVolumeCategories()
- void registerAudioListener(AudioListener listener) - Registers a new AudioListener
- void unregisterAudioListener(AudioListener listener) - Unregisters an AudioListener
- void unregisterAudioListener(UUID listenerId) - Unregisters an AudioListener
- void registerAudioSender(AudioSender sender) - NOTE: Only one instance of this can exist per player
- void unregisterAudioSender(AudioSender sender) - Unregisters an audio sender
- PlayerAudioListener.Builder playerAudioListenerBuilder()
- UUID getSecret(UUID groupId) - Deprecated

### Class: de.maxhenkel.voicechat.api.VoicechatConnection
Type: Interface
Description: Note: It is not guaranteed that the state of this connection object is up to date

Methods:
- Group getGroup() - Note: This only returns the group the player was in when fetching this connection object
- boolean isInGroup() - Note: This only returns if the player was in a group when fetching this connection object
- void setGroup(Group group) - Joins this player to the provided group
- boolean isDisabled() - Note: This only returns if the player has the voice chat disabled when fetching this connection object
- void setDisabled(boolean disabled) - Sets the players disabled state
- ServerPlayer getPlayer()
- boolean isConnected() - This might not represent the actual state of the voice chat connection, since other voice chat plugins can fake having a player connected
- void setConnected(boolean connected) - The players disconnected state will reset if its actual disconnected state changes or if the player reconnects
- boolean isInstalled()

### Class: de.maxhenkel.voicechat.api.VoicechatPlugin
Type: Interface

Methods:
- String getPluginId()
- void initialize(VoicechatApi api) - Called after loading the plugin
- void registerEvents(EventRegistration registration) - Register your events here - Only here!

### Class: de.maxhenkel.voicechat.api.VoicechatSocket
Type: Interface
Description: A socket used for server side voice chat traffic

Methods:
- void open(int port, String bindAddress) throws Exception
- RawUdpPacket read() throws Exception
- void send(byte[] data, SocketAddress address) throws Exception
- int getLocalPort()
- void close()
- boolean isClosed()

### Class: de.maxhenkel.voicechat.api.ClientVoicechatSocket
Type: Interface
Description: A socket used for client side voice chat traffic

Methods:
- void open() throws Exception
- RawUdpPacket read() throws Exception
- void send(byte[] data, SocketAddress address) throws Exception
- void close()
- boolean isClosed()

### Class: de.maxhenkel.voicechat.api.Group
Type: Interface
Description: Groups can be created using VoicechatServerApi.groupBuilder()

Methods:
- String getName()
- boolean hasPassword()
- UUID getId()
- boolean isPersistent()
- Group.Type getType()
- boolean isHidden()

### Class: de.maxhenkel.voicechat.api.Group.Builder
Type: Interface

Methods:
- Group.Builder setName(String name) - NOTE: The name might be stripped of special characters and whitespace
- Group.Builder setPassword(String password)
- Group.Builder setPersistent(boolean persistent)
- Group.Builder setType(Group.Type type)
- Group.Builder setHidden(boolean hidden)
- Group.Builder setId(UUID id) - Sets the ID of the group
- Group build()

### Class: de.maxhenkel.voicechat.api.Group.Type
Type: Interface

Methods:
- **static** Group.Type NORMAL - Players in a group can hear nearby players that are not in a group
- **static** Group.Type OPEN - Players in a group can hear nearby players and nearby players can hear players in the group
- **static** Group.Type ISOLATED - Players in a group can only hear other players in the group

### Class: de.maxhenkel.voicechat.api.RawUdpPacket
Type: Interface

Methods:
- byte[] getData()
- SocketAddress getSocketAddress()
- long getTimestamp()

### Class: de.maxhenkel.voicechat.api.VolumeCategory
Type: Interface
Description: A custom volume category for the "adjust volumes screen"

Methods:
- String getId()
- String getName()
- String getDescription()
- int[][] getIcon()

### Class: de.maxhenkel.voicechat.api.VolumeCategory.Builder
Type: Interface

Methods:
- VolumeCategory.Builder setId(String id) - This ID has to be between 1 and 16 characters and can only contain lowercase a-z and _
- VolumeCategory.Builder setName(String name)
- VolumeCategory.Builder setDescription(String description)
- VolumeCategory.Builder setIcon(int[][] icon) - The array has to be 16x16
- VolumeCategory build()

### Class: de.maxhenkel.voicechat.api.Position
Type: Interface

Methods:
- double getX()
- double getY()
- double getZ()

### Class: de.maxhenkel.voicechat.api.Entity
Type: Interface

Methods:
- Object getEntity()
- UUID getUuid()
- Position getPosition()

### Class: de.maxhenkel.voicechat.api.ServerLevel
Type: Interface

Methods:
- Object getServerLevel()

### Class: de.maxhenkel.voicechat.api.ServerPlayer
Type: Interface

Methods:
- Object getPlayer()
- ServerLevel getServerLevel()

### Class: de.maxhenkel.voicechat.api.Player
Type: Interface

Methods:
- Object getPlayer()

### Class: de.maxhenkel.voicechat.api.BukkitVoicechatService
Type: Interface

Methods:
- void registerPlugin(VoicechatPlugin plugin) - Registers the voice chat plugin on bukkit based servers

### Class: de.maxhenkel.voicechat.api.ForgeVoicechatPlugin
Type: Annotation Interface

## Package: de.maxhenkel.voicechat.api.audio
Everything related to audio conversion and manipulation.

### Class: de.maxhenkel.voicechat.api.audio.AudioConverter
Type: Interface
Description: A utility class to convert audio between different representations

Methods:
- short[] bytesToShorts(byte[] bytes)
- byte[] shortsToBytes(short[] shorts)
- float[] bytesToFloats(byte[] bytes)
- byte[] floatsToBytes(float[] floats)
- float[] shortsToFloats(short[] shorts)
- short[] floatsToShorts(float[] floats)

## Package: de.maxhenkel.voicechat.api.audiochannel
Everything related to audio channels and serverside audio.

### Class: de.maxhenkel.voicechat.api.audiochannel.AudioChannel
Type: Interface

Methods:
- UUID getId()
- void send(byte[] opusData) - Sends the audio data to this audio channel
- void send(MicrophonePacket packet) - Forwards the provided microphone packet to this audio channel
- void flush() - Call this if you are finished sending data
- void setFilter(Predicate<ServerPlayer> filter) - Applies a filter to the audio channel
- void setCategory(String category) - Make sure you registered your category before using it
- String getCategory()
- boolean isClosed()

### Class: de.maxhenkel.voicechat.api.audiochannel.EntityAudioChannel
Type: Interface
Extends: de.maxhenkel.voicechat.api.audiochannel.AudioChannel
Description: An audio channel that is bound to an entity

Methods:
- void updateEntity(Entity entity) - Sets a new entity where this channel is attached to
- boolean isWhispering()
- void setWhispering(boolean whispering)
- float getDistance()
- void setDistance(float distance)
- Entity getEntity()

### Class: de.maxhenkel.voicechat.api.audiochannel.StaticAudioChannel
Type: Interface
Extends: de.maxhenkel.voicechat.api.audiochannel.AudioChannel

### Class: de.maxhenkel.voicechat.api.audiochannel.LocationalAudioChannel
Type: Interface
Extends: de.maxhenkel.voicechat.api.audiochannel.AudioChannel

Methods:
- Position getLocation()
- void updateLocation(Position location) - Updates the location of the audio
- float getDistance()
- void setDistance(float distance)

### Class: de.maxhenkel.voicechat.api.audiochannel.AudioPlayer
Type: Interface
Description: Streams audio data from the server to clients

Methods:
- void startPlaying() - Starts playing/streaming the audio
- void stopPlaying() - Stops playing/streaming the audio
- boolean isStarted()
- boolean isStopped()
- boolean isPlaying()
- void setOnStopped(Runnable onStopped)

### Class: de.maxhenkel.voicechat.api.audiochannel.ClientAudioChannel
Type: Interface

Methods:
- UUID getId()
- void play(short[] rawAudio) - Plays this audio data on this audio channel
- void setCategory(String category) - Make sure you registered your category before using it
- String getCategory()

### Class: de.maxhenkel.voicechat.api.audiochannel.ClientEntityAudioChannel
Type: Interface
Extends: de.maxhenkel.voicechat.api.audiochannel.ClientAudioChannel

Methods:
- void setWhispering(boolean whispering)
- boolean isWhispering()
- void setDistance(float distance)
- float getDistance()
- UUID getEntityId()

### Class: de.maxhenkel.voicechat.api.audiochannel.ClientStaticAudioChannel
Type: Interface
Extends: de.maxhenkel.voicechat.api.audiochannel.ClientAudioChannel

### Class: de.maxhenkel.voicechat.api.audiochannel.ClientLocationalAudioChannel
Type: Interface
Extends: de.maxhenkel.voicechat.api.audiochannel.ClientAudioChannel

Methods:
- void setLocation(Position location) - Updates the location of the audio channel
- Position getLocation()
- void setDistance(float distance)
- float getDistance()

## Package: de.maxhenkel.voicechat.api.audiolistener
Utilities for listening to all audio a player would theoretically receive.

### Class: de.maxhenkel.voicechat.api.audiolistener.AudioListener
Type: Interface

Methods:
- UUID getListenerId()

### Class: de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener
Type: Interface
Extends: de.maxhenkel.voicechat.api.audiolistener.AudioListener

Methods:
- UUID getPlayerUuid()

### Class: de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener.Builder
Type: Interface

Methods:
- PlayerAudioListener.Builder setPlayer(ServerPlayer player) - Note: It is required to either set a player with this method or with setPlayer(UUID)
- PlayerAudioListener.Builder setPlayer(UUID playerUuid) - Note: It is required to either set a player with this method or with setPlayer(ServerPlayer)
- PlayerAudioListener.Builder setPacketListener(Consumer<SoundPacket> listener) - Note: It is required to set a listener
- PlayerAudioListener build()

## Package: de.maxhenkel.voicechat.api.audiosender
Utilities for simulating players sending audio without the mod.

### Class: de.maxhenkel.voicechat.api.audiosender.AudioSender
Type: Interface

Methods:
- boolean canSend()
- void send(byte[] opusData) - Acts as if the player has sent a microphone packet
- AudioSender sequenceNumber(long sequenceNumber) - Sets the sequence number of the packet
- void reset() - Resets the sequence number and indicates to clients that the current audio stream is paused/stopped
- AudioSender whispering(boolean whispering)
- boolean isWhispering()

## Package: de.maxhenkel.voicechat.api.config
Everything configuration related.

### Class: de.maxhenkel.voicechat.api.config.ConfigAccessor
Type: Interface
Description: An interface to access a config

Methods:
- Object getValue(String key) - Gets the raw value of the given key
- boolean hasKey(String key) - Checks if the config has the given key
- String getString(String key, String defaultValue) - Gets the string value of the given key
- int getInt(String key, int defaultValue) - Gets the integer value of the given key
- double getDouble(String key, double defaultValue) - Gets the double value of the given key
- boolean getBoolean(String key, boolean defaultValue) - Gets the boolean value of the given key

## Package: de.maxhenkel.voicechat.api.events
All registerable events.

### Class: de.maxhenkel.voicechat.api.events.EventRegistration
Type: Interface

Methods:
- <T extends Event> void registerEvent(Class<T> eventClass, Consumer<T> listener) - Registers an event
- <T extends Event> void registerEvent(Class<T> eventClass, Consumer<T> listener, int priority) - Registers an event

### Class: de.maxhenkel.voicechat.api.events.Event
Type: Interface

Methods:
- boolean isCancellable()
- boolean isCancelled()
- void cancel() - Cancels this event

### Class: de.maxhenkel.voicechat.api.events.ServerEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.Event

Methods:
- VoicechatServerApi getVoicechat()

### Class: de.maxhenkel.voicechat.api.events.ClientEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.Event

Methods:
- VoicechatClientApi getVoicechat()

### Class: de.maxhenkel.voicechat.api.events.VoicechatServerStartingEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent

Methods:
- VoicechatSocket getSocketImplementation()
- void setSocketImplementation(VoicechatSocket socket) - Sets a custom implementation of the socket used for voice chat traffic

### Class: de.maxhenkel.voicechat.api.events.VoicechatServerStartedEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent

### Class: de.maxhenkel.voicechat.api.events.VoicechatServerStoppedEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent

### Class: de.maxhenkel.voicechat.api.events.PlayerConnectedEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent

Methods:
- VoicechatConnection getConnection()

### Class: de.maxhenkel.voicechat.api.events.PlayerDisconnectedEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent

Methods:
- UUID getPlayerUuid()

### Class: de.maxhenkel.voicechat.api.events.PlayerStateChangedEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent
Description: Called when a player changes its state

Methods:
- VoicechatConnection getConnection()
- UUID getPlayerUuid()
- boolean isDisabled()
- boolean isDisconnected()

### Class: de.maxhenkel.voicechat.api.events.MicrophonePacketEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent
Description: This event is emitted when a microphone packet arrives at the server

Methods:
- VoicechatConnection getSenderConnection()
- MicrophonePacket getPacket()

### Class: de.maxhenkel.voicechat.api.events.PacketEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent

Methods:
- T getPacket()
- VoicechatConnection getSenderConnection()
- VoicechatConnection getReceiverConnection()

### Class: de.maxhenkel.voicechat.api.events.SoundPacketEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.PacketEvent

Methods:
- String getSource() - Where the packet originated from
- **static** String SOURCE_PROXIMITY
- **static** String SOURCE_GROUP
- **static** String SOURCE_SPECTATOR
- **static** String SOURCE_PLUGIN

### Class: de.maxhenkel.voicechat.api.events.EntitySoundPacketEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.SoundPacketEvent
Description: This event is emitted when an entity sound packet is about to get sent to a client

### Class: de.maxhenkel.voicechat.api.events.LocationalSoundPacketEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.SoundPacketEvent
Description: This event is emitted when a locational sound packet is about to get sent to a client

### Class: de.maxhenkel.voicechat.api.events.StaticSoundPacketEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.SoundPacketEvent
Description: This event is emitted when a static sound packet is about to get sent to a client

### Class: de.maxhenkel.voicechat.api.events.GroupEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent

Methods:
- Group getGroup()
- VoicechatConnection getConnection()

### Class: de.maxhenkel.voicechat.api.events.CreateGroupEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent

Methods:
- Group getGroup()
- VoicechatConnection getConnection()

### Class: de.maxhenkel.voicechat.api.events.RemoveGroupEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent
Description: This event is only cancellable if the group is persistent

Methods:
- Group getGroup()
- VoicechatConnection getConnection() - Deprecated

### Class: de.maxhenkel.voicechat.api.events.JoinGroupEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.GroupEvent

Methods:
- Group getGroup()
- VoicechatConnection getConnection()

### Class: de.maxhenkel.voicechat.api.events.LeaveGroupEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.GroupEvent

Methods:
- Group getGroup()
- VoicechatConnection getConnection()

### Class: de.maxhenkel.voicechat.api.events.VoiceHostEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent

Methods:
- String getVoiceHost()
- void setVoiceHost(String host) - Overwrites voice chats voice host - This is sent to the client and used by it to connect to the server

### Class: de.maxhenkel.voicechat.api.events.ClientVoicechatInitializationEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ClientEvent

Methods:
- ClientVoicechatSocket getSocketImplementation()
- void setSocketImplementation(ClientVoicechatSocket socket) - Sets a custom implementation of the socket used for client side voice chat traffic

### Class: de.maxhenkel.voicechat.api.events.ClientVoicechatConnectionEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ClientEvent
Description: This event is emitted on the client when the voice chat connects/disconnects

Methods:
- boolean isConnected()

### Class: de.maxhenkel.voicechat.api.events.VoicechatDisableEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ClientEvent
Description: This event is emitted on the client when the voice chat is getting enabled/disabled

Methods:
- boolean isDisabled()

### Class: de.maxhenkel.voicechat.api.events.MicrophoneMuteEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ClientEvent
Description: This event is emitted on the client when the state of the microphone changes

Methods:
- boolean isDisabled()

### Class: de.maxhenkel.voicechat.api.events.ClientSoundEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ClientEvent
Description: This event is emitted before the client encodes the audio and sends it to the server

Methods:
- short[] getRawAudio() - The unencoded audio data
- void setRawAudio(short[] rawAudio) - Overrides the actual audio data that's sent to the server
- boolean isWhispering()

### Class: de.maxhenkel.voicechat.api.events.MergeClientSoundEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ClientEvent
Description: This event is emitted before the ClientSoundEvent is getting called

Methods:
- void mergeAudio(short[] audio) - Merges the audio into the audio that is captured from the microphone

### Class: de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ClientEvent
Description: This event is emitted before the sound is played on the client

Methods:
- UUID getId()
- short[] getRawAudio() - The unencoded audio data
- void setRawAudio(short[] rawAudio) - Overrides the actual audio data that is played

### Class: de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent.EntitySound
Type: Interface

Methods:
- UUID getEntityId()
- boolean isWhispering()
- float getDistance()

### Class: de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent.LocationalSound
Type: Interface

Methods:
- Position getPosition()
- float getDistance()

### Class: de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent.StaticSound
Type: Interface

### Class: de.maxhenkel.voicechat.api.events.OpenALSoundEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ClientEvent
Description: This event is emitted for every audio chunk for every audio channel

Methods:
- Position getPosition() - Returns the position of the sound
- UUID getChannelId() - This returns null for non audio channel sounds, like microphone testing
- int getSource()
- String getCategory()

### Class: de.maxhenkel.voicechat.api.events.OpenALSoundEvent.Pre
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.OpenALSoundEvent
Description: This event is emitted before any OpenAL calls were made by the voice chat

### Class: de.maxhenkel.voicechat.api.events.OpenALSoundEvent.Post
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.OpenALSoundEvent
Description: This event is emitted after all OpenAL calls by the voice chat and the audio is added to the buffer queue

### Class: de.maxhenkel.voicechat.api.events.CreateOpenALContextEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ClientEvent
Description: This event is emitted when the voice chats OpenAL context is created

Methods:
- long getContext()
- long getDevice()

### Class: de.maxhenkel.voicechat.api.events.DestroyOpenALContextEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ClientEvent
Description: This event is emitted when the voice chats OpenAL context is destroyed

Methods:
- long getContext()
- long getDevice()

### Class: de.maxhenkel.voicechat.api.events.RegisterVolumeCategoryEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.VolumeCategoryEvent

### Class: de.maxhenkel.voicechat.api.events.UnregisterVolumeCategoryEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.VolumeCategoryEvent

### Class: de.maxhenkel.voicechat.api.events.VolumeCategoryEvent
Type: Interface
Extends: de.maxhenkel.voicechat.api.events.ServerEvent

Methods:
- VolumeCategory getVolumeCategory()

## Package: de.maxhenkel.voicechat.api.mp3
Wrappers for mp3 encoding and decoding.

### Class: de.maxhenkel.voicechat.api.mp3.Mp3Decoder
Type: Interface
Description: You can obtain an instance of this class by calling VoicechatApi.createMp3Decoder(java.io.InputStream)

Methods:
- short[] decode() throws IOException - Decodes the MP3 file and returns the decoded audio data as PCM samples
- AudioFormat getAudioFormat() throws IOException - Decodes the MP3 file if decode() has not been called before
- int getBitrate() throws IOException - Decodes the MP3 file if decode() has not been called before
- void close() throws IOException

### Class: de.maxhenkel.voicechat.api.mp3.Mp3Encoder
Type: Interface
Description: You can obtain an instance of this class by calling VoicechatApi.createMp3Encoder(javax.sound.sampled.AudioFormat, int, int, java.io.OutputStream)

Methods:
- void encode(short[] samples) throws IOException - Encodes the given PCM samples and writes it to the provided output stream
- void close() throws IOException - Closes the encoder and flushes the output stream

## Package: de.maxhenkel.voicechat.api.opus
Wrappers for the Opus codec.

### Class: de.maxhenkel.voicechat.api.opus.OpusDecoder
Type: Interface
Description: Instances can be obtained by calling VoicechatApi.createDecoder()

Methods:
- short[] decode(byte[] opus) - Decodes opus encoded audio data to 16 bit PCM audio
- void resetState() - Resets the decoders state
- void close() - Closes the decoder. Not doing this would result in a memory leak
- boolean isClosed()

### Class: de.maxhenkel.voicechat.api.opus.OpusEncoder
Type: Interface
Description: Instances can be obtained by calling VoicechatApi.createEncoder()

Methods:
- byte[] encode(short[] rawAudio) - Encodes 16 bit PCM audio with opus
- void resetState() - Resets the encoders state
- void close() - Closes the encoder
- boolean isClosed()

### Class: de.maxhenkel.voicechat.api.opus.OpusEncoderMode
Type: Enum Class
Description: The different Opus encoder modes

Methods:
- **static** OpusEncoderMode[] values() - Returns an array containing the constants of this enum class, in the order they are declared
- **static** OpusEncoderMode valueOf(String name) - Returns the enum constant of this class with the specified name

Constants:
- AUDIO
- VOIP
- RESTRICTED_LOWDELAY

## Package: de.maxhenkel.voicechat.api.packets
All voice chat UDP packets.

### Class: de.maxhenkel.voicechat.api.packets.Packet
Type: Interface

### Class: de.maxhenkel.voicechat.api.packets.ConvertablePacket
Type: Interface
Extends: de.maxhenkel.voicechat.api.packets.Packet

Methods:
- EntitySoundPacket toEntitySoundPacket(UUID entityUuid, boolean whispering) - Deprecated: use entitySoundPacketBuilder()
- LocationalSoundPacket toLocationalSoundPacket(Position position) - Deprecated: use locationalSoundPacketBuilder()
- StaticSoundPacket toStaticSoundPacket() - Deprecated: use staticSoundPacketBuilder()
- EntitySoundPacket.Builder entitySoundPacketBuilder() - NOTE: Make sure to set channelId(UUID) to avoid conflicts with other channels
- LocationalSoundPacket.Builder locationalSoundPacketBuilder() - NOTE: Make sure to set channelId(UUID) to avoid conflicts with other channels
- StaticSoundPacket.Builder staticSoundPacketBuilder() - NOTE: Make sure to set channelId(UUID) to avoid conflicts with other channels

### Class: de.maxhenkel.voicechat.api.packets.MicrophonePacket
Type: Interface
Extends: de.maxhenkel.voicechat.api.packets.ConvertablePacket

Methods:
- byte[] getOpusEncodedData()
- void setOpusEncodedData(byte[] data) - Allows you to modify or replace the opus encoded audio data
- boolean isWhispering()

### Class: de.maxhenkel.voicechat.api.packets.SoundPacket
Type: Interface
Extends: de.maxhenkel.voicechat.api.packets.Packet

Methods:
- UUID getChannelId()
- UUID getSender()
- byte[] getOpusEncodedData()
- long getSequenceNumber()
- String getCategory()

### Class: de.maxhenkel.voicechat.api.packets.SoundPacket.Builder
Type: Interface
Description: A builder to build a sound packet

Methods:
- T channelId(UUID channelId) - NOTE: Make sure to set this to a unique value to avoid conflicts with other channels
- T opusEncodedData(byte[] data)
- T category(String category) - Make sure you registered your category before using it
- P build() - Builds the packet

### Class: de.maxhenkel.voicechat.api.packets.EntitySoundPacket
Type: Interface
Extends: de.maxhenkel.voicechat.api.packets.SoundPacket
Description: The receiver of this event will hear the sound from the specified entity

Methods:
- UUID getEntityUuid()
- boolean isWhispering()
- float getDistance()

### Class: de.maxhenkel.voicechat.api.packets.EntitySoundPacket.Builder
Type: Interface
Extends: de.maxhenkel.voicechat.api.packets.SoundPacket.Builder
Description: A builder to build an entity sound packet

Methods:
- EntitySoundPacket.Builder entityUuid(UUID entityUuid) - This is required to be set!
- EntitySoundPacket.Builder whispering(boolean whispering)
- EntitySoundPacket.Builder distance(float distance)

### Class: de.maxhenkel.voicechat.api.packets.LocationalSoundPacket
Type: Interface
Extends: de.maxhenkel.voicechat.api.packets.SoundPacket
Description: The receiver of this event will hear the sound from the specified location

Methods:
- Position getPosition()
- float getDistance()

### Class: de.maxhenkel.voicechat.api.packets.LocationalSoundPacket.Builder
Type: Interface
Extends: de.maxhenkel.voicechat.api.packets.SoundPacket.Builder
Description: A builder to build a locational sound packet

Methods:
- LocationalSoundPacket.Builder position(Position position) - This is required to be set!
- LocationalSoundPacket.Builder distance(float distance)

### Class: de.maxhenkel.voicechat.api.packets.StaticSoundPacket
Type: Interface
Extends: de.maxhenkel.voicechat.api.packets.SoundPacket
Description: The receiver of this event will hear the sound non-directional

### Class: de.maxhenkel.voicechat.api.packets.StaticSoundPacket.Builder
Type: Interface
Extends: de.maxhenkel.voicechat.api.packets.SoundPacket.Builder
Description: A builder to build a static sound packet