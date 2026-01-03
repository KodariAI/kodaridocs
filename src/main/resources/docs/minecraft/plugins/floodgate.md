# floodgate-spigot-org-geysermc-floodgate-api API Reference

**Package Filter:** `org.geysermc.floodgate.api`

## Package: org.geysermc.floodgate.api

### Class: org.geysermc.floodgate.api.FloodgateApi
Type: Interface

Methods:
- String getPlayerPrefix()
- FloodgatePlayer getPlayer(UUID uuid)
- boolean transferPlayer(UUID uuid, String address, int port)
- int getPlayerCount()
- boolean isFloodgateId(UUID uuid)
- boolean isFloodgatePlayer(UUID uuid)
- boolean closeForm(UUID uuid)
- Unsafe unsafe()
- CompletableFuture<Long> getXuidFor(String gamertag)
- UUID createJavaPlayerId(long xuid)
- FloodgateEventBus getEventBus()
- PlayerLink getPlayerLink()
- boolean sendForm(UUID uuid, Form form)
- Z sendForm(UUID uuid, FormBuilder<***> formBuilder)
- Z sendForm(UUID uuid, Form<*> form)
- Z sendForm(UUID uuid, FormBuilder<**> formBuilder)
- CompletableFuture<UUID> getUuidFor(String gamertag)
- **static** FloodgateApi getInstance()
- Collection<FloodgatePlayer> getPlayers()
- CompletableFuture<String> getGamertagFor(long xuid)

### Class: org.geysermc.floodgate.api.InstanceHolder
Type: Class

Methods:
- **static** FloodgateEventBus getEventBus()
- **static** PacketHandlers getPacketHandlers()
- **static** boolean set(FloodgateApi floodgateApi, PlayerLink link, FloodgateEventBus floodgateEventBus, PlatformInjector platformInjector, PacketHandlers packetHandlers, HandshakeHandlers handshakeHandlers, UUID key)
- **static** PlayerLink getPlayerLink()
- **static** PlatformInjector getInjector()
- **static** HandshakeHandlers getHandshakeHandlers()
- **static** FloodgateApi getApi()

### Class: org.geysermc.floodgate.api.ProxyFloodgateApi
Type: Class
Extends: org.geysermc.floodgate.api.SimpleFloodgateApi

Methods:
- byte[] createEncryptedData(BedrockData bedrockData)
- String createEncryptedDataString(BedrockData bedrockData)

### Class: org.geysermc.floodgate.api.SimpleFloodgateApi
Type: Class
Implements: org.geysermc.floodgate.api.FloodgateApi

Methods:
- String getPlayerPrefix()
- boolean setPendingRemove(FloodgatePlayer player)
- FloodgatePlayer getPlayer(UUID uuid)
- boolean transferPlayer(UUID uuid, String address, int port)
- int getPlayerCount()
- boolean isFloodgateId(UUID uuid)
- void playerRemoved(UUID correctUuid)
- boolean isFloodgatePlayer(UUID uuid)
- boolean closeForm(UUID uuid)
- Unsafe unsafe()
- CompletableFuture<Long> getXuidFor(String gamertag)
- UUID createJavaPlayerId(long xuid)
- FloodgatePlayer addPlayer(FloodgatePlayer player)
- boolean sendForm(UUID uuid, Form form)
- Z sendForm(UUID uuid, FormBuilder<***> formBuilder)
- Z sendForm(UUID uuid, Form<*> form)
- Z sendForm(UUID uuid, FormBuilder<**> formBuilder)
- Collection<FloodgatePlayer> getPlayers()
- CompletableFuture<String> getGamertagFor(long xuid)

### Class: org.geysermc.floodgate.api.UnsafeFloodgateApi
Type: Class
Implements: org.geysermc.floodgate.api.unsafe.Unsafe

Methods:
- void sendPacket(UUID bedrockPlayer, int packetId, byte[] packetData)

## Package: org.geysermc.floodgate.api.event

### Class: org.geysermc.floodgate.api.event.FloodgateEventBus
Type: Interface
Implements: org.geysermc.event.bus.EventBus

No public methods found

### Class: org.geysermc.floodgate.api.event.FloodgateSubscriber
Type: Interface
Implements: org.geysermc.event.subscribe.Subscriber

No public methods found

## Package: org.geysermc.floodgate.api.event.skin

### Class: org.geysermc.floodgate.api.event.skin.SkinApplyEvent
Type: Interface
Implements: org.geysermc.event.Cancellable

Methods:
- SkinApplyEvent$SkinData currentSkin()
- SkinApplyEvent$SkinData newSkin()
- SkinApplyEvent newSkin(SkinApplyEvent$SkinData skinData)
- FloodgatePlayer player()

### Class: org.geysermc.floodgate.api.event.skin.SkinApplyEvent$SkinData
Type: Interface

Methods:
- String signature()
- String value()

## Package: org.geysermc.floodgate.api.handshake

### Class: org.geysermc.floodgate.api.handshake.HandshakeData
Type: Interface

Methods:
- boolean shouldDisconnect()
- void setDisconnectReason(String reason)
- String getIp()
- void setHostname(String hostname)
- String getCorrectUsername()
- boolean isFloodgatePlayer()
- UUID getCorrectUniqueId()
- void setIp(String address)
- void setLinkedPlayer(LinkedPlayer player)
- String getHostname()
- LinkedPlayer getLinkedPlayer()
- Channel getChannel()
- UUID getJavaUniqueId()
- String getJavaUsername()
- String getDisconnectReason()
- BedrockData getBedrockData()

### Class: org.geysermc.floodgate.api.handshake.HandshakeHandler
Type: Interface

Methods:
- void handle(HandshakeData data)

### Class: org.geysermc.floodgate.api.handshake.HandshakeHandlers
Type: Interface

Methods:
- void removeHandshakeHandler(int handshakeHandlerId)
- V removeHandshakeHandler(Class<HandshakeHandler> handshakeHandler)
- int addHandshakeHandler(HandshakeHandler handshakeHandler)

## Package: org.geysermc.floodgate.api.inject

### Class: org.geysermc.floodgate.api.inject.InjectorAddon
Type: Interface

Methods:
- boolean shouldInject()
- void onInject(Channel channel, boolean toServer)
- void onChannelClosed(Channel channel)
- void onRemoveInject(Channel channel)

### Class: org.geysermc.floodgate.api.inject.PlatformInjector
Type: Interface

Methods:
- void removeInjection() throws Exception
- boolean addAddon(InjectorAddon addon)
- boolean isInjected()
- boolean canRemoveInjection()
- void inject() throws Exception
- TT removeAddon(Class<TT> addon)

## Package: org.geysermc.floodgate.api.link

### Class: org.geysermc.floodgate.api.link.LinkRequest
Type: Interface

Methods:
- boolean isRequestedPlayer(FloodgatePlayer player)
- long getRequestTime()
- UUID getJavaUniqueId()
- String getJavaUsername()
- boolean isExpired(long linkTimeout)
- String getLinkCode()
- String getBedrockUsername()

### Class: org.geysermc.floodgate.api.link.PlayerLink
Type: Interface

Methods:
- String getName()
- void stop()
- CompletableFuture<Boolean> isLinkedPlayer(UUID playerId)
- CompletableFuture<LinkedPlayer> getLinkedPlayer(UUID bedrockId)
- void load()
- CompletableFuture<Void> unlinkPlayer(UUID javaId)
- boolean isEnabled()
- CompletableFuture<Void> linkPlayer(UUID bedrockId, UUID javaId, String username)
- boolean isAllowLinking()
- boolean isEnabledAndAllowed()
- long getVerifyLinkTimeout()
- CompletableFuture<LinkRequestResult> verifyLinkRequest(UUID bedrockId, String javaUsername, String bedrockUsername, String code)
- CompletableFuture<*> createLinkRequest(UUID javaId, String javaUsername, String bedrockUsername)

### Class: org.geysermc.floodgate.api.link.LinkRequestResult
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UNKNOWN_ERROR
- ALREADY_LINKED
- REQUEST_EXPIRED
- NO_LINK_REQUESTED
- INVALID_CODE
- LINK_COMPLETED

Methods:
- **static** LinkRequestResult valueOf(String name)
- **static** LinkRequestResult[] values()

## Package: org.geysermc.floodgate.api.logger

### Class: org.geysermc.floodgate.api.logger.FloodgateLogger
Type: Interface

Methods:
- boolean isDebug()
- void warn(String message, Object[] args)
- void trace(String message, Object[] args)
- void debug(String message, Object[] args)
- void error(String message, Object[] args)
- void error(String message, Throwable throwable, Object[] args)
- void translatedInfo(String message, Object[] args)
- void info(String message, Object[] args)

## Package: org.geysermc.floodgate.api.packet

### Class: org.geysermc.floodgate.api.packet.PacketHandler
Type: Interface

Methods:
- Object handle(ChannelHandlerContext ctx, Object packet, boolean serverbound)

### Class: org.geysermc.floodgate.api.packet.PacketHandlers
Type: Interface

Methods:
- void registerAll(PacketHandler handler)
- void deregister(PacketHandler handler)
- V register(PacketHandler handler, Class<*> packetClass, TriFunction<ChannelHandlerContext, Object, Boolean, Object> consumer)
- V register(PacketHandler handler, Class<*> packetClass)

## Package: org.geysermc.floodgate.api.player

### Class: org.geysermc.floodgate.api.player.FloodgatePlayer
Type: Interface

Methods:
- String getLanguageCode()
- String getVersion()
- boolean isFromProxy()
- TT getProperty(PropertyKey key)
- TT getProperty(String key)
- DeviceOs getDeviceOs()
- String getCorrectUsername()
- UiProfile getUiProfile()
- String getXuid()
- UUID getCorrectUniqueId()
- TT addProperty(PropertyKey key, Object value)
- TT addProperty(String key, Object value)
- boolean hasProperty(PropertyKey key)
- boolean hasProperty(String key)
- String getUsername()
- boolean isLinked()
- TT as(Class<TT> clazz)
- boolean transfer(String address, int port)
- LinkedPlayer getLinkedPlayer()
- boolean sendForm(Form form)
- Z sendForm(FormBuilder<***> formBuilder)
- Z sendForm(Form<*> form)
- Z sendForm(FormBuilder<**> formBuilder)
- UUID getJavaUniqueId()
- String getJavaUsername()
- TT removeProperty(PropertyKey key)
- TT removeProperty(String key)
- InputMode getInputMode()

### Class: org.geysermc.floodgate.api.player.PropertyKey
Type: Class

Constructors:
- PropertyKey(String key, boolean changeable, boolean removable)

Methods:
- String getKey()
- PropertyKey$Result isAddAllowed(Object obj)
- boolean isChangeable()
- boolean isRemovable()

### Class: org.geysermc.floodgate.api.player.PropertyKey$Result
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NOT_EQUALS
- INVALID_TAGS
- NOT_ALLOWED
- ALLOWED

Methods:
- **static** PropertyKey$Result valueOf(String name)
- **static** PropertyKey$Result[] values()

## Package: org.geysermc.floodgate.api.unsafe

### Class: org.geysermc.floodgate.api.unsafe.Unsafe
Type: Interface

Methods:
- void sendPacket(UUID bedrockPlayer, int packetId, byte[] packetData)
- void sendPacket(FloodgatePlayer player, int packetId, byte[] packetData)

## Package: org.geysermc.floodgate.api.util

### Class: org.geysermc.floodgate.api.util.TriFunction
Type: Interface

Methods:
- TR apply(T t, T u, ; v)
- TriFunction<TT, TU, TV, TS> andThen(Function<-TR, +TS> after)

