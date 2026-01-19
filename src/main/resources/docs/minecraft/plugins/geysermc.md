# Geyser-Spigot-org-geysermc-geyser-api API Reference

**Package Filter:** `org.geysermc.geyser.api`

## Package: org.geysermc.geyser.api

### Class: org.geysermc.geyser.api.GeyserApi
Type: Interface
Implements: org.geysermc.api.GeyserApiBase

Methods:
- CommandSource consoleCommandSource()
- GeyserConnection connectionByXuid(String xuid)
- Connection connectionByXuid(String xuid)
- PlatformType platformType()
- Path packDirectory()
- Path configDirectory()
- BedrockListener bedrockListener()
- MinecraftVersion supportedJavaVersion()
- List<MinecraftVersion> supportedBedrockVersions()
- RemoteServer defaultRemoteServer()
- EventBus<EventRegistrar> eventBus()
- TR provider(Class<TT> apiClass, Object args)
- GeyserConnection connectionByUuid(UUID uuid)
- Connection connectionByUuid(UUID uuid)
- List<GeyserConnection> onlineConnections()
- ExtensionManager extensionManager()
- **static** GeyserApi api()
- ApiVersion geyserApiVersion()

## Package: org.geysermc.geyser.api.bedrock.camera

### Class: org.geysermc.geyser.api.bedrock.camera.CameraData
Type: Interface

Methods:
- void clearCameraInstructions()
- boolean isCameraLocked()
- boolean lockCamera(boolean lock, UUID owner)
- boolean isHudElementHidden(GuiElement element)
- Set<GuiElement> hiddenElements()
- void hideElement(GuiElement[] element)
- void stopCameraShake()
- void forceCameraPerspective(CameraPerspective perspective)
- void sendCameraFade(CameraFade fade)
- void sendFog(String[] fogNameSpaces)
- Set<String> fogEffects()
- void removeFog(String[] fogNameSpaces)
- void sendCameraPosition(CameraPosition position)
- void shakeCamera(float intensity, float duration, CameraShake type)
- void resetElement(GuiElement[] element)
- CameraPerspective forcedCameraPerspective()

### Class: org.geysermc.geyser.api.bedrock.camera.CameraFade
Type: Interface

Methods:
- float fadeInSeconds()
- Color color()
- **static** CameraFade$Builder builder()
- float fadeHoldSeconds()
- float fadeOutSeconds()

### Class: org.geysermc.geyser.api.bedrock.camera.CameraFade$Builder
Type: Interface

Methods:
- CameraFade$Builder fadeInSeconds(float fadeInSeconds)
- CameraFade$Builder color(Color color)
- CameraFade build()
- CameraFade$Builder fadeHoldSeconds(float fadeHoldSeconds)
- CameraFade$Builder fadeOutSeconds(float fadeOutSeconds)

### Class: org.geysermc.geyser.api.bedrock.camera.CameraPosition
Type: Interface

Methods:
- boolean renderPlayerEffects()
- int rotationX()
- int rotationY()
- boolean playerPositionForAudio()
- **static** CameraPosition$Builder builder()
- float easeSeconds()
- Vector3f facingPosition()
- CameraFade cameraFade()
- Vector3f position()
- CameraEaseType easeType()

### Class: org.geysermc.geyser.api.bedrock.camera.CameraPosition$Builder
Type: Interface

Methods:
- CameraPosition$Builder renderPlayerEffects(boolean renderPlayerEffects)
- CameraPosition$Builder rotationX(int rotationX)
- CameraPosition$Builder rotationY(int rotationY)
- CameraPosition$Builder playerPositionForAudio(boolean playerPositionForAudio)
- CameraPosition build()
- CameraPosition$Builder easeSeconds(float easeSeconds)
- CameraPosition$Builder facingPosition(Vector3f facingPosition)
- CameraPosition$Builder position(Vector3f position)
- CameraPosition$Builder cameraFade(CameraFade cameraFade)
- CameraPosition$Builder easeType(CameraEaseType easeType)

### Class: org.geysermc.geyser.api.bedrock.camera.CameraEaseType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LINEAR
- SPRING
- EASE_IN_SINE
- EASE_OUT_SINE
- EASE_IN_OUT_SINE
- EASE_IN_QUAD
- EASE_OUT_QUAD
- EASE_IN_OUT_QUAD
- EASE_IN_CUBIC
- EASE_OUT_CUBIC
- EASE_IN_OUT_CUBIC
- EASE_IN_QUART
- EASE_OUT_QUART
- EASE_IN_OUT_QUART
- EASE_IN_QUINT
- EASE_OUT_QUINT
- EASE_IN_OUT_QUINT
- EASE_IN_EXPO
- EASE_OUT_EXPO
- EASE_IN_OUT_EXPO
- EASE_IN_CIRC
- EASE_OUT_CIRC
- EASE_IN_OUT_CIRC
- EASE_IN_BACK
- EASE_OUT_BACK
- EASE_IN_OUT_BACK
- EASE_IN_ELASTIC
- EASE_OUT_ELASTIC
- EASE_IN_OUT_ELASTIC
- EASE_IN_BOUNCE
- EASE_OUT_BOUNCE
- EASE_IN_OUT_BOUNCE

Methods:
- **static** CameraEaseType valueOf(String name)
- **static** CameraEaseType[] values()
- String id()

### Class: org.geysermc.geyser.api.bedrock.camera.CameraPerspective
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FIRST_PERSON
- FREE
- THIRD_PERSON
- THIRD_PERSON_FRONT

Methods:
- **static** CameraPerspective valueOf(String name)
- **static** CameraPerspective[] values()
- String id()

### Class: org.geysermc.geyser.api.bedrock.camera.CameraShake
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- POSITIONAL
- ROTATIONAL

Methods:
- **static** CameraShake valueOf(String name)
- **static** CameraShake[] values()

### Class: org.geysermc.geyser.api.bedrock.camera.GuiElement
Type: Class

Methods:
- int id()

## Package: org.geysermc.geyser.api.block.custom

### Class: org.geysermc.geyser.api.block.custom.CustomBlockData
Type: Interface

Methods:
- String identifier()
- CustomBlockComponents components()
- boolean includedInCreativeInventory()
- **static** CustomBlockData$Builder builder()
- CustomBlockState$Builder blockStateBuilder()
- String name()
- String creativeGroup()
- CreativeCategory creativeCategory()
- CustomBlockState defaultBlockState()
- List<CustomBlockPermutation> permutations()
- Map<String, CustomBlockProperty<*>> properties()

### Class: org.geysermc.geyser.api.block.custom.CustomBlockData$Builder
Type: Interface

Methods:
- CustomBlockData$Builder intProperty(String propertyName, List<Integer> values)
- CustomBlockData$Builder components(CustomBlockComponents components)
- CustomBlockData$Builder booleanProperty(String propertyName)
- CustomBlockData build()
- CustomBlockData$Builder includedInCreativeInventory(boolean includedInCreativeInventory)
- CustomBlockData$Builder name(String name)
- CustomBlockData$Builder creativeGroup(String creativeGroup)
- CustomBlockData$Builder creativeCategory(CreativeCategory creativeCategory)
- CustomBlockData$Builder permutations(List<CustomBlockPermutation> permutations)
- CustomBlockData$Builder stringProperty(String propertyName, List<String> values)

### Class: org.geysermc.geyser.api.block.custom.CustomBlockState
Type: Interface

Methods:
- TT property(String propertyName)
- String name()
- CustomBlockData block()
- Map<String, Object> properties()

### Class: org.geysermc.geyser.api.block.custom.CustomBlockState$Builder
Type: Interface

Methods:
- CustomBlockState$Builder intProperty(String propertyName, int value)
- CustomBlockState$Builder booleanProperty(String propertyName, boolean value)
- CustomBlockState build()
- CustomBlockState$Builder stringProperty(String propertyName, String value)

### Class: org.geysermc.geyser.api.block.custom.NonVanillaCustomBlockData
Type: Interface
Implements: org.geysermc.geyser.api.block.custom.CustomBlockData

Methods:
- **static** NonVanillaCustomBlockData$Builder builder()
- String namespace()

### Class: org.geysermc.geyser.api.block.custom.NonVanillaCustomBlockData$Builder
Type: Interface
Implements: org.geysermc.geyser.api.block.custom.CustomBlockData$Builder

Methods:
- NonVanillaCustomBlockData$Builder intProperty(String propertyName, List<Integer> values)
- CustomBlockData$Builder intProperty(String propertyName, List values)
- NonVanillaCustomBlockData$Builder components(CustomBlockComponents components)
- CustomBlockData$Builder components(CustomBlockComponents components)
- NonVanillaCustomBlockData$Builder booleanProperty(String propertyName)
- CustomBlockData$Builder booleanProperty(String propertyName)
- NonVanillaCustomBlockData build()
- CustomBlockData build()
- NonVanillaCustomBlockData$Builder includedInCreativeInventory(boolean includedInCreativeInventory)
- CustomBlockData$Builder includedInCreativeInventory(boolean includedInCreativeInventory)
- NonVanillaCustomBlockData$Builder name(String name)
- CustomBlockData$Builder name(String name)
- NonVanillaCustomBlockData$Builder namespace(String namespace)
- NonVanillaCustomBlockData$Builder creativeGroup(String creativeGroup)
- CustomBlockData$Builder creativeGroup(String creativeGroup)
- NonVanillaCustomBlockData$Builder creativeCategory(CreativeCategory creativeCategory)
- CustomBlockData$Builder creativeCategory(CreativeCategory creativeCategory)
- NonVanillaCustomBlockData$Builder permutations(List<CustomBlockPermutation> permutations)
- CustomBlockData$Builder permutations(List permutations)
- NonVanillaCustomBlockData$Builder stringProperty(String propertyName, List<String> values)
- CustomBlockData$Builder stringProperty(String propertyName, List values)

### Class: org.geysermc.geyser.api.block.custom.CustomBlockPermutation
Type: Class
Extends: java.lang.Record

Constructors:
- CustomBlockPermutation(CustomBlockComponents components, String condition)

Methods:
- String condition()
- CustomBlockComponents components()
- int hashCode()
- boolean equals(Object o)
- String toString()

## Package: org.geysermc.geyser.api.block.custom.component

### Class: org.geysermc.geyser.api.block.custom.component.CustomBlockComponents
Type: Interface

Methods:
- BoxComponent collisionBox()
- Integer lightDampening()
- String displayName()
- TransformationComponent transformation()
- Float friction()
- Set<String> tags()
- boolean placeAir()
- Integer lightEmission()
- List<PlacementConditions> placementFilter()
- **static** CustomBlockComponents$Builder builder()
- Float destructibleByMining()
- BoxComponent selectionBox()
- GeometryComponent geometry()
- Map<String, MaterialInstance> materialInstances()
- boolean unitCube()

### Class: org.geysermc.geyser.api.block.custom.component.CustomBlockComponents$Builder
Type: Interface

Methods:
- CustomBlockComponents$Builder materialInstance(String name, MaterialInstance materialInstance)
- CustomBlockComponents$Builder collisionBox(BoxComponent collisionBox)
- CustomBlockComponents$Builder lightDampening(Integer lightDampening)
- CustomBlockComponents$Builder displayName(String displayName)
- CustomBlockComponents$Builder transformation(TransformationComponent transformation)
- CustomBlockComponents$Builder friction(Float friction)
- CustomBlockComponents$Builder tags(Set<String> tags)
- CustomBlockComponents$Builder placeAir(boolean placeAir)
- CustomBlockComponents$Builder lightEmission(Integer lightEmission)
- CustomBlockComponents$Builder placementFilter(List<PlacementConditions> placementConditions)
- CustomBlockComponents build()
- CustomBlockComponents$Builder destructibleByMining(Float destructibleByMining)
- CustomBlockComponents$Builder selectionBox(BoxComponent selectionBox)
- CustomBlockComponents$Builder geometry(GeometryComponent geometry)
- CustomBlockComponents$Builder unitCube(boolean unitCube)

### Class: org.geysermc.geyser.api.block.custom.component.GeometryComponent
Type: Interface

Methods:
- String identifier()
- **static** GeometryComponent$Builder builder()
- Map<String, String> boneVisibility()

### Class: org.geysermc.geyser.api.block.custom.component.GeometryComponent$Builder
Type: Interface

Methods:
- GeometryComponent$Builder identifier(String identifier)
- GeometryComponent build()
- GeometryComponent$Builder boneVisibility(Map<String, String> boneVisibility)

### Class: org.geysermc.geyser.api.block.custom.component.MaterialInstance
Type: Interface

Methods:
- boolean ambientOcclusion()
- String renderMethod()
- String texture()
- boolean isotropic()
- **static** MaterialInstance$Builder builder()
- boolean faceDimming()
- String tintMethod()

### Class: org.geysermc.geyser.api.block.custom.component.MaterialInstance$Builder
Type: Interface

Methods:
- MaterialInstance$Builder ambientOcclusion(boolean ambientOcclusion)
- MaterialInstance$Builder renderMethod(String renderMethod)
- MaterialInstance build()
- MaterialInstance$Builder texture(String texture)
- MaterialInstance$Builder isotropic(boolean isotropic)
- MaterialInstance$Builder faceDimming(boolean faceDimming)
- MaterialInstance$Builder tintMethod(String tintMethod)

### Class: org.geysermc.geyser.api.block.custom.component.BoxComponent
Type: Class
Extends: java.lang.Record

Constructors:
- BoxComponent(float originX, float originY, float originZ, float sizeX, float sizeY, float sizeZ)

Methods:
- float originZ()
- float sizeX()
- float originX()
- int hashCode()
- float originY()
- boolean equals(Object o)
- boolean isEmpty()
- **static** BoxComponent emptyBox()
- String toString()
- **static** BoxComponent fullBox()
- float sizeY()
- float sizeZ()

### Class: org.geysermc.geyser.api.block.custom.component.PlacementConditions
Type: Class
Extends: java.lang.Record

Constructors:
- PlacementConditions(Set<PlacementConditions$Face> allowedFaces, LinkedHashMap<String, PlacementConditions$BlockFilterType> blockFilters)

Methods:
- int hashCode()
- boolean equals(Object o)
- String toString()
- LinkedHashMap<String, PlacementConditions$BlockFilterType> blockFilters()
- Set<PlacementConditions$Face> allowedFaces()

### Class: org.geysermc.geyser.api.block.custom.component.PlacementConditions$BlockFilterType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BLOCK
- TAG

Methods:
- **static** PlacementConditions$BlockFilterType valueOf(String name)
- **static** PlacementConditions$BlockFilterType[] values()

### Class: org.geysermc.geyser.api.block.custom.component.PlacementConditions$Face
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DOWN
- UP
- NORTH
- SOUTH
- WEST
- EAST

Methods:
- **static** PlacementConditions$Face valueOf(String name)
- **static** PlacementConditions$Face[] values()

### Class: org.geysermc.geyser.api.block.custom.component.TransformationComponent
Type: Class
Extends: java.lang.Record

Constructors:
- TransformationComponent(int rx, int ry, int rz)
- TransformationComponent(int rx, int ry, int rz, float sx, float sy, float sz)
- TransformationComponent(int rx, int ry, int rz, float sx, float sy, float sz, float tx, float ty, float tz)

Methods:
- float tx()
- float ty()
- float sx()
- float tz()
- float sy()
- int rx()
- int hashCode()
- float sz()
- int ry()
- boolean equals(Object o)
- int rz()
- String toString()

## Package: org.geysermc.geyser.api.block.custom.nonvanilla

### Class: org.geysermc.geyser.api.block.custom.nonvanilla.JavaBlockState
Type: Interface

Methods:
- JavaBoundingBox[] collision()
- String identifier()
- int javaId()
- boolean canBreakWithHand()
- boolean waterlogged()
- String pistonBehavior()
- **static** JavaBlockState$Builder builder()
- int stateGroupId()
- boolean hasBlockEntity()
- String pickItem()
- float blockHardness()

### Class: org.geysermc.geyser.api.block.custom.nonvanilla.JavaBlockState$Builder
Type: Interface

Methods:
- JavaBlockState$Builder collision(JavaBoundingBox[] collision)
- JavaBlockState$Builder identifier(String identifier)
- JavaBlockState$Builder javaId(int javaId)
- JavaBlockState$Builder canBreakWithHand(boolean canBreakWithHand)
- JavaBlockState$Builder waterlogged(boolean waterlogged)
- JavaBlockState build()
- JavaBlockState$Builder pistonBehavior(String pistonBehavior)
- JavaBlockState$Builder stateGroupId(int stateGroupId)
- JavaBlockState$Builder hasBlockEntity(boolean hasBlockEntity)
- JavaBlockState$Builder pickItem(String pickItem)
- JavaBlockState$Builder blockHardness(float blockHardness)

### Class: org.geysermc.geyser.api.block.custom.nonvanilla.JavaBoundingBox
Type: Class
Extends: java.lang.Record

Constructors:
- JavaBoundingBox(double middleX, double middleY, double middleZ, double sizeX, double sizeY, double sizeZ)

Methods:
- double middleY()
- double sizeX()
- double middleZ()
- int hashCode()
- double middleX()
- boolean equals(Object o)
- String toString()
- double sizeY()
- double sizeZ()

## Package: org.geysermc.geyser.api.block.custom.property

### Class: org.geysermc.geyser.api.block.custom.property.CustomBlockProperty
Type: Interface

Methods:
- List<TT> values()
- String name()
- PropertyType type()

### Class: org.geysermc.geyser.api.block.custom.property.PropertyType
Type: Class

Methods:
- **static** PropertyType booleanProp()
- Class<*> typeClass()
- **static** PropertyType integerProp()
- **static** PropertyType stringProp()

## Package: org.geysermc.geyser.api.command

### Class: org.geysermc.geyser.api.command.Command
Type: Interface

Methods:
- boolean isBedrockOnly()
- boolean isPlayerOnly()
- List<String> aliases()
- boolean isSuggestedOpOnly()
- List<String> subCommands()
- **static** Command$Builder<TT> builder(Extension extension)
- String name()
- boolean isExecutableOnConsole()
- String description()
- String permission()

### Class: org.geysermc.geyser.api.command.Command$Builder
Type: Interface

Methods:
- Command$Builder<TT> aliases(List<String> aliases)
- Command$Builder<TT> playerOnly(boolean playerOnly)
- Command build()
- Command$Builder<TT> executor(CommandExecutor<TT> executor)
- Command$Builder<TT> bedrockOnly(boolean bedrockOnly)
- Command$Builder<TT> subCommands(List<String> subCommands)
- Command$Builder<TT> executableOnConsole(boolean executableOnConsole)
- Command$Builder<TT> name(String name)
- Command$Builder<TT> description(String description)
- Command$Builder<TT> permission(String permission)
- Command$Builder<TT> permission(String permission, TriState defaultValue)
- Command$Builder<TT> source(Class<+TT> sourceType)
- Command$Builder<TT> suggestedOpOnly(boolean suggestedOpOnly)

### Class: org.geysermc.geyser.api.command.CommandExecutor
Type: Interface

Methods:
- V execute(T source, T command, ; args)

### Class: org.geysermc.geyser.api.command.CommandSource
Type: Interface

Methods:
- UUID playerUuid()
- boolean isConsole()
- boolean hasPermission(String permission)
- String name()
- void sendMessage(String message)
- void sendMessage(String[] messages)
- GeyserConnection connection()
- String locale()

## Package: org.geysermc.geyser.api.connection

### Class: org.geysermc.geyser.api.connection.GeyserConnection
Type: Interface
Implements: org.geysermc.api.connection.Connection, org.geysermc.geyser.api.command.CommandSource

Methods:
- boolean hasFormOpen()
- int ping()
- void showEmote(GeyserPlayerEntity emoter, String emoteId)
- String joinAddress()
- void openQuickActions()
- void closeForm()
- void stopCameraShake()
- void sendCommand(String command)
- void openPauseScreenAdditions()
- void sendFog(String[] fogNameSpaces)
- Set<String> fogEffects()
- void removeFog(String[] fogNameSpaces)
- EntityData entities()
- void shakeCamera(float intensity, float duration, CameraShake type)
- CompletableFuture<GeyserEntity> entityByJavaId(int javaId)
- int joinPort()
- int protocolVersion()
- CameraData camera()
- void sendSkin(UUID player, SkinData skinData)

## Package: org.geysermc.geyser.api.entity

### Class: org.geysermc.geyser.api.entity.EntityData
Type: Interface

Methods:
- boolean lockMovement(boolean lock, UUID owner)
- void showEmote(GeyserPlayerEntity emoter, String emoteId)
- boolean isMovementLocked()
- CompletableFuture<GeyserEntity> entityByJavaId(int javaId)
- GeyserPlayerEntity playerEntity()
- void switchHands()

## Package: org.geysermc.geyser.api.entity.property

### Class: org.geysermc.geyser.api.entity.property.BatchPropertyUpdater
Type: Interface

Methods:
- V update(GeyserEntityProperty<TT> property, T value)

### Class: org.geysermc.geyser.api.entity.property.GeyserEntityProperty
Type: Interface

Methods:
- Identifier identifier()
- TT defaultValue()

## Package: org.geysermc.geyser.api.entity.property.type

### Class: org.geysermc.geyser.api.entity.property.type.GeyserBooleanEntityProperty
Type: Interface
Implements: org.geysermc.geyser.api.entity.property.GeyserEntityProperty

No public methods found

### Class: org.geysermc.geyser.api.entity.property.type.GeyserEnumEntityProperty
Type: Interface
Implements: org.geysermc.geyser.api.entity.property.GeyserEntityProperty

No public methods found

### Class: org.geysermc.geyser.api.entity.property.type.GeyserFloatEntityProperty
Type: Interface
Implements: org.geysermc.geyser.api.entity.property.GeyserEntityProperty

Methods:
- float min()
- float max()

### Class: org.geysermc.geyser.api.entity.property.type.GeyserIntEntityProperty
Type: Interface
Implements: org.geysermc.geyser.api.entity.property.GeyserEntityProperty

Methods:
- int min()
- int max()

### Class: org.geysermc.geyser.api.entity.property.type.GeyserStringEnumProperty
Type: Interface
Implements: org.geysermc.geyser.api.entity.property.GeyserEntityProperty

Methods:
- List<String> values()

## Package: org.geysermc.geyser.api.entity.type

### Class: org.geysermc.geyser.api.entity.type.GeyserEntity
Type: Interface

Methods:
- V updatePropertiesBatched(Consumer<BatchPropertyUpdater> consumer)
- V updatePropertiesBatched(Consumer<BatchPropertyUpdater> consumer, boolean immediate)
- int javaId()
- V updateProperty(GeyserEntityProperty<TT> property, T value)

## Package: org.geysermc.geyser.api.entity.type.player

### Class: org.geysermc.geyser.api.entity.type.player.GeyserPlayerEntity
Type: Interface
Implements: org.geysermc.geyser.api.entity.type.GeyserEntity

Methods:
- Vector3f position()

## Package: org.geysermc.geyser.api.event

### Class: org.geysermc.geyser.api.event.EventBus
Type: Interface
Implements: org.geysermc.event.bus.OwnedEventBus

Methods:
- Set<EventSubscriber<TR, TT>> subscribers(Class<TT> eventClass)

### Class: org.geysermc.geyser.api.event.EventRegistrar
Type: Interface

Methods:
- **static** EventRegistrar of(Object object)

### Class: org.geysermc.geyser.api.event.EventSubscriber
Type: Interface
Implements: org.geysermc.event.subscribe.OwnedSubscriber

No public methods found

### Class: org.geysermc.geyser.api.event.ExtensionEventBus
Type: Interface
Implements: org.geysermc.event.bus.EventBus

Methods:
- Set<EventSubscriber<EventRegistrar, TT>> subscribers(Class<TT> eventClass)

### Class: org.geysermc.geyser.api.event.ExtensionEventSubscriber
Type: Interface
Implements: org.geysermc.event.subscribe.Subscriber

No public methods found

## Package: org.geysermc.geyser.api.event.bedrock

### Class: org.geysermc.geyser.api.event.bedrock.ClientEmoteEvent
Type: Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent
Implements: org.geysermc.event.Cancellable

Constructors:
- ClientEmoteEvent(GeyserConnection connection, String emoteId)

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- String emoteId()

### Class: org.geysermc.geyser.api.event.bedrock.SessionAcceptCodeOfConductEvent
Type: Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent

Constructors:
- SessionAcceptCodeOfConductEvent(GeyserConnection connection, String codeOfConduct)

Methods:
- String codeOfConduct()
- boolean shouldSkipSaving()
- void skipSaving()

### Class: org.geysermc.geyser.api.event.bedrock.SessionDisconnectEvent
Type: Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent

Constructors:
- SessionDisconnectEvent(GeyserConnection connection, String reason)

Methods:
- String disconnectReason()
- void disconnectReason(String disconnectReason)

### Class: org.geysermc.geyser.api.event.bedrock.SessionInitializeEvent
Type: Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent

Constructors:
- SessionInitializeEvent(GeyserConnection connection)

No public methods found

### Class: org.geysermc.geyser.api.event.bedrock.SessionJoinEvent
Type: Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent

Constructors:
- SessionJoinEvent(GeyserConnection connection)

No public methods found

### Class: org.geysermc.geyser.api.event.bedrock.SessionLoadResourcePacksEvent
Type: Abstract Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent

Constructors:
- SessionLoadResourcePacksEvent(GeyserConnection connection)

Methods:
- void allowVibrantVisuals(boolean enabled)
- boolean unregister(UUID uuid)
- Collection<ResourcePackOption<*>> options(UUID uuid)
- V registerOptions(UUID uuid, ResourcePackOption<*> options)
- List<ResourcePack> resourcePacks()
- ResourcePackOption<*> option(UUID uuid, ResourcePackOption$Type type)
- boolean register(ResourcePack pack)
- V register(ResourcePack pack, ResourcePackOption<*> options)

### Class: org.geysermc.geyser.api.event.bedrock.SessionLoginEvent
Type: Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent
Implements: org.geysermc.event.Cancellable

Constructors:
- SessionLoginEvent(GeyserConnection connection, RemoteServer remoteServer, Map<String, [B> cookies)

Methods:
- void transferring(boolean transferring)
- boolean transferring()
- String disconnectReason()
- boolean isCancelled()
- RemoteServer remoteServer()
- void remoteServer(RemoteServer remoteServer)
- void setCancelled(boolean cancelled)
- void setCancelled(boolean cancelled, String disconnectReason)
- V cookies(Map<String, [B> cookies)
- Map<String, [B> cookies()

### Class: org.geysermc.geyser.api.event.bedrock.SessionSkinApplyEvent
Type: Abstract Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent

Constructors:
- SessionSkinApplyEvent(GeyserConnection connection, String username, UUID uuid, boolean slim, boolean bedrock, SkinData skinData)

Methods:
- SkinData originalSkin()
- boolean bedrock()
- void skin(Skin newSkin)
- boolean slim()
- void geometry(SkinGeometry newGeometry)
- void geometry(String geometryName, String geometryData)
- SkinData skinData()
- void cape(Cape newCape)
- UUID uuid()
- String username()

## Package: org.geysermc.geyser.api.event.connection

### Class: org.geysermc.geyser.api.event.connection.GeyserBedrockPingEvent
Type: Interface
Implements: org.geysermc.event.Event

Methods:
- void maxPlayerCount(int max)
- int maxPlayerCount()
- void primaryMotd(String primary)
- String primaryMotd()
- InetSocketAddress address()
- void playerCount(int count)
- int playerCount()
- void secondaryMotd(String secondary)
- String secondaryMotd()

### Class: org.geysermc.geyser.api.event.connection.ConnectionEvent
Type: Abstract Class
Implements: org.geysermc.event.Event

Constructors:
- ConnectionEvent(GeyserConnection connection)

Methods:
- GeyserConnection connection()

### Class: org.geysermc.geyser.api.event.connection.ConnectionRequestEvent
Type: Class
Implements: org.geysermc.event.Event, org.geysermc.event.Cancellable

Constructors:
- ConnectionRequestEvent(InetSocketAddress ip, InetSocketAddress proxyIp)

Methods:
- boolean isCancelled()
- InetSocketAddress proxyIp()
- void setCancelled(boolean cancelled)
- InetSocketAddress inetSocketAddress()
- InetSocketAddress getProxyIp()
- InetSocketAddress getInetSocketAddress()

## Package: org.geysermc.geyser.api.event.downstream

### Class: org.geysermc.geyser.api.event.downstream.ServerDefineCommandsEvent$CommandInfo
Type: Interface

Methods:
- String name()
- String description()

### Class: org.geysermc.geyser.api.event.downstream.ServerDefineCommandsEvent
Type: Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent
Implements: org.geysermc.event.Cancellable

Constructors:
- ServerDefineCommandsEvent(GeyserConnection connection, Set<ServerDefineCommandsEvent$CommandInfo> commands)

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- Set<ServerDefineCommandsEvent$CommandInfo> commands()

## Package: org.geysermc.geyser.api.event.java

### Class: org.geysermc.geyser.api.event.java.ServerDefineCommandsEvent$CommandInfo
Type: Interface

Methods:
- String name()
- String description()

### Class: org.geysermc.geyser.api.event.java.ServerCodeOfConductEvent
Type: Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent

Constructors:
- ServerCodeOfConductEvent(GeyserConnection connection, String codeOfConduct)

Methods:
- String codeOfConduct()
- boolean accepted()
- void accept()

### Class: org.geysermc.geyser.api.event.java.ServerDefineCommandsEvent
Type: Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent
Implements: org.geysermc.event.Cancellable

Constructors:
- ServerDefineCommandsEvent(GeyserConnection connection, Set<ServerDefineCommandsEvent$CommandInfo> commands)

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- Set<ServerDefineCommandsEvent$CommandInfo> commands()

### Class: org.geysermc.geyser.api.event.java.ServerTransferEvent
Type: Class
Extends: org.geysermc.geyser.api.event.connection.ConnectionEvent

Constructors:
- ServerTransferEvent(GeyserConnection connection, String host, int port, Map<String, [B> cookies)

Methods:
- int bedrockPort()
- void bedrockPort(int port)
- int port()
- String host()
- Map<String, [B> cookies()
- String bedrockHost()
- void bedrockHost(String host)

## Package: org.geysermc.geyser.api.event.lifecycle

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserDefineCommandsEvent
Type: Interface
Implements: org.geysermc.event.Event

Methods:
- Map<String, Command> commands()
- void register(Command command)

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserDefineCustomItemsEvent
Type: Interface
Implements: org.geysermc.event.Event

Methods:
- List<NonVanillaCustomItemData> getExistingNonVanillaCustomItems()
- Map<String, Collection<CustomItemData>> getExistingCustomItems()
- boolean register(String identifier, CustomItemData customItemData)
- boolean register(NonVanillaCustomItemData customItemData)

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserDefineEntityPropertiesEvent
Type: Interface
Implements: org.geysermc.event.Event

Methods:
- GeyserBooleanEntityProperty registerBooleanProperty(Identifier entityType, Identifier propertyIdentifier, boolean defaultValue)
- GeyserBooleanEntityProperty registerBooleanProperty(Identifier entityType, Identifier propertyIdentifier)
- GeyserIntEntityProperty registerIntegerProperty(Identifier entityType, Identifier propertyIdentifier, int min, int max, Integer defaultValue)
- GeyserIntEntityProperty registerIntegerProperty(Identifier entityType, Identifier propertyIdentifier, int min, int max)
- GeyserFloatEntityProperty registerFloatProperty(Identifier entityType, Identifier propertyIdentifier, float min, float max, Float defaultValue)
- GeyserFloatEntityProperty registerFloatProperty(Identifier entityType, Identifier propertyIdentifier, float min, float max)
- Collection<GeyserEntityProperty<*>> properties(Identifier entityType)
- GeyserEnumEntityProperty<TE> registerEnumProperty(Identifier entityType, Identifier propertyIdentifier, Class<TE> enumClass, T defaultValue)
- GeyserEnumEntityProperty<TE> registerEnumProperty(Identifier entityType, Identifier propertyIdentifier, Class<TE> enumClass)
- GeyserStringEnumProperty registerEnumProperty(Identifier entityType, Identifier propertyIdentifier, List<String> values, String defaultValue)
- GeyserStringEnumProperty registerEnumProperty(Identifier entityType, Identifier propertyIdentifier, List<String> values)

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserRegisterPermissionCheckersEvent
Type: Interface
Implements: org.geysermc.event.Event

Methods:
- void register(PermissionChecker checker)

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserRegisterPermissionsEvent
Type: Interface
Implements: org.geysermc.event.Event

Methods:
- void register(String permission, TriState defaultValue)

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserDefineCustomBlocksEvent
Type: Abstract Class
Implements: org.geysermc.event.Event

Methods:
- void registerItemOverride(String javaIdentifier, CustomBlockData customBlockData)
- void registerOverride(String javaIdentifier, CustomBlockState customBlockState)
- void registerOverride(JavaBlockState javaBlockState, CustomBlockState customBlockState)
- void register(CustomBlockData customBlockData)

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserDefineCustomSkullsEvent
Type: Abstract Class
Implements: org.geysermc.event.Event

Methods:
- void register(String texture, GeyserDefineCustomSkullsEvent$SkullTextureType type)

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserDefineCustomSkullsEvent$SkullTextureType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- USERNAME
- UUID
- PROFILE
- SKIN_HASH

Methods:
- **static** GeyserDefineCustomSkullsEvent$SkullTextureType valueOf(String name)
- **static** GeyserDefineCustomSkullsEvent$SkullTextureType[] values()

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserDefineResourcePacksEvent
Type: Abstract Class
Implements: org.geysermc.event.Event

Methods:
- void unregister(UUID uuid)
- Collection<ResourcePackOption<*>> options(UUID uuid)
- V registerOptions(UUID uuid, ResourcePackOption<*> options)
- List<ResourcePack> resourcePacks()
- ResourcePackOption<*> option(UUID uuid, ResourcePackOption$Type type)
- V register(ResourcePack pack, ResourcePackOption<*> options)

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserLoadResourcePacksEvent
Type: Class
Extends: java.lang.Record
Implements: org.geysermc.event.Event

Constructors:
- GeyserLoadResourcePacksEvent(List<Path> resourcePacks)

Methods:
- int hashCode()
- boolean equals(Object o)
- String toString()
- List<Path> resourcePacks()

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserPostInitializeEvent
Type: Class
Extends: java.lang.Record
Implements: org.geysermc.event.Event

Constructors:
- GeyserPostInitializeEvent(ExtensionManager extensionManager, EventBus<EventRegistrar> eventBus)

Methods:
- EventBus<EventRegistrar> eventBus()
- int hashCode()
- boolean equals(Object o)
- ExtensionManager extensionManager()
- String toString()

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserPostReloadEvent
Type: Class
Extends: java.lang.Record
Implements: org.geysermc.event.Event

Constructors:
- GeyserPostReloadEvent(ExtensionManager extensionManager, EventBus<EventRegistrar> eventBus)

Methods:
- EventBus<EventRegistrar> eventBus()
- int hashCode()
- boolean equals(Object o)
- ExtensionManager extensionManager()
- String toString()

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserPreInitializeEvent
Type: Class
Extends: java.lang.Record
Implements: org.geysermc.event.Event

Constructors:
- GeyserPreInitializeEvent(ExtensionManager extensionManager, EventBus<EventRegistrar> eventBus)

Methods:
- EventBus<EventRegistrar> eventBus()
- int hashCode()
- boolean equals(Object o)
- ExtensionManager extensionManager()
- String toString()

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserPreReloadEvent
Type: Class
Extends: java.lang.Record
Implements: org.geysermc.event.Event

Constructors:
- GeyserPreReloadEvent(ExtensionManager extensionManager, EventBus<EventRegistrar> eventBus)

Methods:
- EventBus<EventRegistrar> eventBus()
- int hashCode()
- boolean equals(Object o)
- ExtensionManager extensionManager()
- String toString()

### Class: org.geysermc.geyser.api.event.lifecycle.GeyserShutdownEvent
Type: Class
Extends: java.lang.Record
Implements: org.geysermc.event.Event

Constructors:
- GeyserShutdownEvent(ExtensionManager extensionManager, EventBus<EventRegistrar> eventBus)

Methods:
- EventBus<EventRegistrar> eventBus()
- int hashCode()
- boolean equals(Object o)
- ExtensionManager extensionManager()
- String toString()

## Package: org.geysermc.geyser.api.extension

### Class: org.geysermc.geyser.api.extension.Extension
Type: Interface
Implements: org.geysermc.geyser.api.event.EventRegistrar

Methods:
- void setEnabled(boolean enabled)
- ExtensionEventBus eventBus()
- void disable()
- GeyserApi geyserApi()
- ExtensionLogger logger()
- boolean isEnabled()
- ExtensionLoader extensionLoader()
- String name()
- ExtensionDescription description()
- ExtensionManager extensionManager()
- String rootCommand()
- Path dataFolder()

### Class: org.geysermc.geyser.api.extension.ExtensionDescription
Type: Interface

Methods:
- String apiVersion()
- int majorApiVersion()
- int humanApiVersion()
- int patchApiVersion()
- String name()
- String main()
- String id()
- String version()
- int minorApiVersion()
- List<String> authors()

### Class: org.geysermc.geyser.api.extension.ExtensionLogger
Type: Interface

Methods:
- boolean isDebug()
- void debug(String message)
- String prefix()
- void severe(String message)
- void severe(String message, Throwable error)
- void warning(String message)
- void error(String message)
- void error(String message, Throwable error)
- void info(String message)

### Class: org.geysermc.geyser.api.extension.ExtensionLoader
Type: Abstract Class

No public methods found

### Class: org.geysermc.geyser.api.extension.ExtensionManager
Type: Abstract Class

Methods:
- Collection<Extension> extensions()
- Extension extension(String id)
- void disable(Extension extension)
- void enable(Extension extension)
- ExtensionLoader extensionLoader()
- void register(Extension extension)

## Package: org.geysermc.geyser.api.extension.exception

### Class: org.geysermc.geyser.api.extension.exception.InvalidDescriptionException
Type: Class
Extends: java.lang.Exception

Constructors:
- InvalidDescriptionException(Throwable cause)
- InvalidDescriptionException(String message)
- InvalidDescriptionException(String message, Throwable cause)

No public methods found

### Class: org.geysermc.geyser.api.extension.exception.InvalidExtensionException
Type: Class
Extends: java.lang.Exception

Constructors:
- InvalidExtensionException(Throwable cause)
- InvalidExtensionException(String message)
- InvalidExtensionException(String message, Throwable cause)

No public methods found

## Package: org.geysermc.geyser.api.item.custom

### Class: org.geysermc.geyser.api.item.custom.CustomItemData
Type: Interface

Methods:
- CustomItemOptions customItemOptions()
- boolean allowOffhand()
- int textureSize()
- String displayName()
- boolean displayHandheld()
- **static** CustomItemData$Builder builder()
- String icon()
- String name()
- String creativeGroup()
- OptionalInt creativeCategory()
- CustomRenderOffsets renderOffsets()
- Set<String> tags()

### Class: org.geysermc.geyser.api.item.custom.CustomItemData$Builder
Type: Interface

Methods:
- CustomItemData$Builder customItemOptions(CustomItemOptions customItemOptions)
- CustomItemData$Builder allowOffhand(boolean allowOffhand)
- CustomItemData$Builder textureSize(int textureSize)
- CustomItemData build()
- CustomItemData$Builder displayName(String displayName)
- CustomItemData$Builder displayHandheld(boolean displayHandheld)
- CustomItemData$Builder icon(String icon)
- CustomItemData$Builder name(String name)
- CustomItemData$Builder creativeGroup(String creativeGroup)
- CustomItemData$Builder creativeCategory(int creativeCategory)
- CustomItemData$Builder renderOffsets(CustomRenderOffsets renderOffsets)
- CustomItemData$Builder tags(Set<String> tags)

### Class: org.geysermc.geyser.api.item.custom.CustomItemOptions
Type: Interface

Methods:
- OptionalInt customModelData()
- boolean hasCustomItemOptions()
- OptionalInt damagePredicate()
- **static** CustomItemOptions$Builder builder()
- TriState unbreakable()
- boolean defaultItem()

### Class: org.geysermc.geyser.api.item.custom.CustomItemOptions$Builder
Type: Interface

Methods:
- CustomItemOptions$Builder customModelData(int customModelData)
- CustomItemOptions build()
- CustomItemOptions$Builder damagePredicate(int damagePredicate)
- CustomItemOptions$Builder unbreakable(boolean unbreakable)
- CustomItemOptions$Builder defaultItem(boolean defaultItem)

### Class: org.geysermc.geyser.api.item.custom.NonVanillaCustomItemData
Type: Interface
Implements: org.geysermc.geyser.api.item.custom.CustomItemData

Methods:
- String identifier()
- boolean isEdible()
- String toolTier()
- int maxDamage()
- String armorType()
- boolean isTool()
- boolean canAlwaysEat()
- boolean isHat()
- String toolType()
- boolean isChargeable()
- int javaId()
- boolean isFoil()
- int stackSize()
- String translationString()
- **static** NonVanillaCustomItemData$Builder builder()
- String block()
- Set<String> repairMaterials()
- int protectionValue()
- int attackDamage()

### Class: org.geysermc.geyser.api.item.custom.NonVanillaCustomItemData$Builder
Type: Interface
Implements: org.geysermc.geyser.api.item.custom.CustomItemData$Builder

Methods:
- NonVanillaCustomItemData$Builder chargeable(boolean isChargeable)
- NonVanillaCustomItemData$Builder toolTier(String toolTier)
- NonVanillaCustomItemData$Builder displayName(String displayName)
- CustomItemData$Builder displayName(String displayName)
- NonVanillaCustomItemData$Builder maxDamage(int maxDamage)
- NonVanillaCustomItemData$Builder icon(String icon)
- CustomItemData$Builder icon(String icon)
- NonVanillaCustomItemData$Builder creativeCategory(int creativeCategory)
- CustomItemData$Builder creativeCategory(int creativeCategory)
- NonVanillaCustomItemData$Builder armorType(String armorType)
- NonVanillaCustomItemData$Builder allowOffhand(boolean allowOffhand)
- CustomItemData$Builder allowOffhand(boolean allowOffhand)
- NonVanillaCustomItemData$Builder textureSize(int textureSize)
- CustomItemData$Builder textureSize(int textureSize)
- NonVanillaCustomItemData$Builder stackSize(int stackSize)
- NonVanillaCustomItemData$Builder translationString(String translationString)
- NonVanillaCustomItemData$Builder creativeGroup(String creativeGroup)
- CustomItemData$Builder creativeGroup(String creativeGroup)
- NonVanillaCustomItemData$Builder block(String block)
- NonVanillaCustomItemData$Builder hat(boolean isHat)
- NonVanillaCustomItemData$Builder protectionValue(int protectionValue)
- NonVanillaCustomItemData$Builder foil(boolean isFoil)
- NonVanillaCustomItemData$Builder renderOffsets(CustomRenderOffsets renderOffsets)
- CustomItemData$Builder renderOffsets(CustomRenderOffsets renderOffsets)
- NonVanillaCustomItemData$Builder attackDamage(int attackDamage)
- NonVanillaCustomItemData$Builder customItemOptions(CustomItemOptions customItemOptions)
- CustomItemData$Builder customItemOptions(CustomItemOptions customItemOptions)
- NonVanillaCustomItemData$Builder identifier(String identifier)
- NonVanillaCustomItemData$Builder displayHandheld(boolean displayHandheld)
- CustomItemData$Builder displayHandheld(boolean displayHandheld)
- NonVanillaCustomItemData$Builder canAlwaysEat(boolean canAlwaysEat)
- NonVanillaCustomItemData$Builder toolType(String toolType)
- NonVanillaCustomItemData$Builder tool(boolean isTool)
- NonVanillaCustomItemData$Builder tags(Set<String> tags)
- CustomItemData$Builder tags(Set tags)
- NonVanillaCustomItemData$Builder javaId(int javaId)
- NonVanillaCustomItemData build()
- CustomItemData build()
- NonVanillaCustomItemData$Builder name(String name)
- CustomItemData$Builder name(String name)
- NonVanillaCustomItemData$Builder edible(boolean isEdible)
- NonVanillaCustomItemData$Builder repairMaterials(Set<String> repairMaterials)

### Class: org.geysermc.geyser.api.item.custom.CustomRenderOffsets
Type: Class
Extends: java.lang.Record

Constructors:
- CustomRenderOffsets(CustomRenderOffsets$Hand mainHand, CustomRenderOffsets$Hand offhand)

Methods:
- CustomRenderOffsets$Hand mainHand()
- int hashCode()
- boolean equals(Object o)
- String toString()
- CustomRenderOffsets$Hand offhand()

### Class: org.geysermc.geyser.api.item.custom.CustomRenderOffsets$Hand
Type: Class
Extends: java.lang.Record

Constructors:
- CustomRenderOffsets$Hand(CustomRenderOffsets$Offset firstPerson, CustomRenderOffsets$Offset thirdPerson)

Methods:
- int hashCode()
- boolean equals(Object o)
- CustomRenderOffsets$Offset thirdPerson()
- String toString()
- CustomRenderOffsets$Offset firstPerson()

### Class: org.geysermc.geyser.api.item.custom.CustomRenderOffsets$Offset
Type: Class
Extends: java.lang.Record

Constructors:
- CustomRenderOffsets$Offset(CustomRenderOffsets$OffsetXYZ position, CustomRenderOffsets$OffsetXYZ rotation, CustomRenderOffsets$OffsetXYZ scale)

Methods:
- int hashCode()
- CustomRenderOffsets$OffsetXYZ rotation()
- boolean equals(Object o)
- CustomRenderOffsets$OffsetXYZ scale()
- String toString()
- CustomRenderOffsets$OffsetXYZ position()

### Class: org.geysermc.geyser.api.item.custom.CustomRenderOffsets$OffsetXYZ
Type: Class
Extends: java.lang.Record

Constructors:
- CustomRenderOffsets$OffsetXYZ(float x, float y, float z)

Methods:
- int hashCode()
- boolean equals(Object o)
- float x()
- float y()
- float z()
- String toString()

## Package: org.geysermc.geyser.api.network

### Class: org.geysermc.geyser.api.network.BedrockListener
Type: Interface

Methods:
- int broadcastPort()
- String primaryMotd()
- String address()
- int port()
- String serverName()
- String secondaryMotd()

### Class: org.geysermc.geyser.api.network.RemoteServer
Type: Interface

Methods:
- boolean resolveSrv()
- String address()
- int port()
- int protocolVersion()
- String minecraftVersion()
- AuthType authType()

### Class: org.geysermc.geyser.api.network.AuthType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- OFFLINE
- ONLINE
- FLOODGATE

Methods:
- **static** AuthType valueOf(String name)
- **static** AuthType[] values()
- **static** AuthType getByName(String name)

## Package: org.geysermc.geyser.api.pack

### Class: org.geysermc.geyser.api.pack.ResourcePack
Type: Interface

Methods:
- PackCodec codec()
- String contentKey()
- ResourcePackManifest manifest()
- **static** ResourcePack$Builder builder(PackCodec codec)
- **static** ResourcePack create(PackCodec codec)
- UUID uuid()

### Class: org.geysermc.geyser.api.pack.ResourcePack$Builder
Type: Interface

Methods:
- PackCodec codec()
- String contentKey()
- ResourcePack$Builder contentKey(String contentKey)
- ResourcePack build()
- ResourcePackManifest manifest()

### Class: org.geysermc.geyser.api.pack.ResourcePackManifest
Type: Interface

Methods:
- Collection<ResourcePackManifest$Setting> settings()
- Collection<ResourcePackManifest$Subpack> subpacks()
- ResourcePackManifest$Header header()
- int formatVersion()
- Collection<ResourcePackManifest$Module> modules()
- Collection<ResourcePackManifest$Dependency> dependencies()

### Class: org.geysermc.geyser.api.pack.ResourcePackManifest$Dependency
Type: Interface

Methods:
- ResourcePackManifest$Version version()
- UUID uuid()

### Class: org.geysermc.geyser.api.pack.ResourcePackManifest$Header
Type: Interface

Methods:
- ResourcePackManifest$Version minimumSupportedMinecraftVersion()
- String name()
- String description()
- ResourcePackManifest$Version version()
- UUID uuid()

### Class: org.geysermc.geyser.api.pack.ResourcePackManifest$Module
Type: Interface

Methods:
- String description()
- String type()
- ResourcePackManifest$Version version()
- UUID uuid()

### Class: org.geysermc.geyser.api.pack.ResourcePackManifest$Setting
Type: Interface

Methods:
- String text()
- String type()

### Class: org.geysermc.geyser.api.pack.ResourcePackManifest$Subpack
Type: Interface

Methods:
- Float memoryTier()
- String name()
- String folderName()

### Class: org.geysermc.geyser.api.pack.ResourcePackManifest$Version
Type: Interface

Methods:
- int patch()
- int minor()
- int major()
- String toString()

### Class: org.geysermc.geyser.api.pack.PackCodec
Type: Abstract Class

Methods:
- **static** PackCodec path(Path path)
- SeekableByteChannel serialize(ResourcePack resourcePack) throws IOException
- SeekableByteChannel serialize() throws IOException
- long size()
- byte[] sha256()
- **static** PackCodec url(String url)

### Class: org.geysermc.geyser.api.pack.PathPackCodec
Type: Abstract Class
Extends: org.geysermc.geyser.api.pack.PackCodec

Methods:
- Path path()

### Class: org.geysermc.geyser.api.pack.UrlPackCodec
Type: Abstract Class
Extends: org.geysermc.geyser.api.pack.PackCodec

Methods:
- String url()

## Package: org.geysermc.geyser.api.pack.exception

### Class: org.geysermc.geyser.api.pack.exception.ResourcePackException
Type: Class
Extends: java.lang.IllegalArgumentException

Constructors:
- ResourcePackException(ResourcePackException$Cause cause)
- ResourcePackException(ResourcePackException$Cause cause, String message)

Methods:
- ResourcePackException$Cause cause()

### Class: org.geysermc.geyser.api.pack.exception.ResourcePackException$Cause
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DUPLICATE
- INVALID_PACK
- INVALID_PACK_OPTION
- PACK_NOT_FOUND
- UNKNOWN_IMPLEMENTATION

Methods:
- **static** ResourcePackException$Cause valueOf(String name)
- **static** ResourcePackException$Cause[] values()
- String message()

## Package: org.geysermc.geyser.api.pack.option

### Class: org.geysermc.geyser.api.pack.option.PriorityOption
Type: Interface
Implements: org.geysermc.geyser.api.pack.option.ResourcePackOption

Methods:
- **static** PriorityOption priority(int priority)

### Class: org.geysermc.geyser.api.pack.option.ResourcePackOption
Type: Interface

Methods:
- ResourcePackOption$Type type()
- TT value()
- void validate(ResourcePack pack)

### Class: org.geysermc.geyser.api.pack.option.SubpackOption
Type: Interface
Implements: org.geysermc.geyser.api.pack.option.ResourcePackOption

Methods:
- **static** SubpackOption named(String subpackName)
- **static** SubpackOption subpack(ResourcePackManifest$Subpack subpack)
- **static** SubpackOption empty()

### Class: org.geysermc.geyser.api.pack.option.UrlFallbackOption
Type: Interface
Implements: org.geysermc.geyser.api.pack.option.ResourcePackOption

Methods:
- **static** UrlFallbackOption fallback(boolean fallback)

### Class: org.geysermc.geyser.api.pack.option.ResourcePackOption$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SUBPACK
- PRIORITY
- FALLBACK

Methods:
- **static** ResourcePackOption$Type valueOf(String name)
- **static** ResourcePackOption$Type[] values()

## Package: org.geysermc.geyser.api.permission

### Class: org.geysermc.geyser.api.permission.PermissionChecker
Type: Interface

Methods:
- TriState hasPermission(CommandSource source, String permission)

## Package: org.geysermc.geyser.api.skin

### Class: org.geysermc.geyser.api.skin.Cape
Type: Class
Extends: java.lang.Record

Constructors:
- Cape(String textureUrl, String capeId, byte[] capeData)
- Cape(String textureUrl, String capeId, byte[] capeData, boolean failed)

Methods:
- byte[] capeData()
- String capeId()
- int hashCode()
- String textureUrl()
- boolean equals(Object o)
- String toString()
- boolean failed()

### Class: org.geysermc.geyser.api.skin.Skin
Type: Class
Extends: java.lang.Record

Constructors:
- Skin(String textureUrl, byte[] skinData)
- Skin(String textureUrl, byte[] skinData, boolean failed)

Methods:
- int hashCode()
- String textureUrl()
- boolean equals(Object o)
- byte[] skinData()
- String toString()
- boolean failed()

### Class: org.geysermc.geyser.api.skin.SkinData
Type: Class
Extends: java.lang.Record

Constructors:
- SkinData(Skin skin, Cape cape, SkinGeometry geometry)

Methods:
- int hashCode()
- boolean equals(Object o)
- Skin skin()
- SkinGeometry geometry()
- String toString()
- Cape cape()

### Class: org.geysermc.geyser.api.skin.SkinGeometry
Type: Class
Extends: java.lang.Record

Constructors:
- SkinGeometry(String geometryName, String geometryData)

Methods:
- String geometryName()
- String geometryData()
- int hashCode()
- boolean equals(Object o)
- String toString()

## Package: org.geysermc.geyser.api.util

### Class: org.geysermc.geyser.api.util.Identifier
Type: Interface

Methods:
- String path()
- **static** Identifier of(String namespace, String path)
- **static** Identifier of(String identifier)
- String namespace()
- boolean vanilla()

### Class: org.geysermc.geyser.api.util.MinecraftVersion
Type: Interface

Methods:
- String versionString()
- int protocolVersion()

### Class: org.geysermc.geyser.api.util.CreativeCategory
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CONSTRUCTION
- NATURE
- EQUIPMENT
- ITEMS
- NONE

Methods:
- String internalName()
- **static** CreativeCategory valueOf(String name)
- **static** CreativeCategory[] values()
- int id()

### Class: org.geysermc.geyser.api.util.PlatformType
Type: Class
Extends: java.lang.Record

Constructors:
- PlatformType(String platformName)

Methods:
- int hashCode()
- boolean equals(Object o)
- String toString()
- String platformName()

### Class: org.geysermc.geyser.api.util.TriState
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NOT_SET
- TRUE
- FALSE

Methods:
- Boolean toBoolean()
- **static** TriState valueOf(String name)
- **static** TriState[] values()
- **static** TriState fromBoolean(Boolean value)
- **static** TriState fromBoolean(boolean value)

