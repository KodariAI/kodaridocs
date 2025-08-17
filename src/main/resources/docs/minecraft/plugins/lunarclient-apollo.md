# apollo-com-lunarclient-apollo API Reference

**Package Filter:** `com.lunarclient.apollo`

## Package: com.lunarclient.apollo

### Class: com.lunarclient.apollo.ApolloPlatform
Type: Interface

Methods:
- ApolloStats getStats()
- String getApolloVersion()
- Object getPlugin()
- Logger getPlatformLogger()
- Options getOptions()
- ApolloPlatform$Kind getKind()

### Class: com.lunarclient.apollo.Apollo
Type: Class

Methods:
- **static** ApolloModuleManager getModuleManager()
- **static** ApolloWorldManager getWorldManager()
- **static** ApolloPlatform getPlatform()
- **static** ApolloPlayerManager getPlayerManager()

### Class: com.lunarclient.apollo.ApolloPlatform$Kind
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ApolloPlatform$Kind valueOf(String)
- **static** ApolloPlatform$Kind[] values()

### Class: com.lunarclient.apollo.BukkitApollo
Type: Class

Methods:
- **static** Location toBukkitLocation(ApolloLocation)
- **static** Location toBukkitLocation(ApolloBlockLocation)
- **static** Location toBukkitLocation(ApolloPlayerLocation)
- **static** ApolloBlockLocation toApolloBlockLocation(Location)
- **static** Recipients getRecipientsFrom(Collection)
- **static** ApolloEntity toApolloEntity(Entity)
- **static** ApolloLocation toApolloLocation(Location)
- **static** void runForPlayer(Player, Consumer)
- **static** void runForPlayer(UUID, Consumer)
- **static** ApolloPlayerLocation toApolloPlayerLocation(Location)

### Class: com.lunarclient.apollo.BungeeApollo
Type: Class

Methods:
- **static** Recipients getRecipientsFrom(Collection)
- **static** void runForPlayer(ProxiedPlayer, Consumer)
- **static** void runForPlayer(UUID, Consumer)

### Class: com.lunarclient.apollo.FoliaApollo
Type: Class

Methods:
- **static** Location toBukkitLocation(ApolloLocation)
- **static** Location toBukkitLocation(ApolloBlockLocation)
- **static** Location toBukkitLocation(ApolloPlayerLocation)
- **static** ApolloBlockLocation toApolloBlockLocation(Location)
- **static** Recipients getRecipientsFrom(Collection)
- **static** ApolloEntity toApolloEntity(Entity)
- **static** ApolloLocation toApolloLocation(Location)
- **static** void runForPlayer(Player, Consumer)
- **static** void runForPlayer(UUID, Consumer)
- **static** ApolloPlayerLocation toApolloPlayerLocation(Location)

### Class: com.lunarclient.apollo.VelocityApollo
Type: Class

Methods:
- **static** Recipients getRecipientsFrom(Collection)
- **static** void runForPlayer(Player, Consumer)
- **static** void runForPlayer(UUID, Consumer)

## Package: com.lunarclient.apollo.api

### Class: com.lunarclient.apollo.api.ApiRequest
Type: Interface

Methods:
- ApiRequestType getType()
- Type getResponseType()
- String getRoute()
- ApiServiceType getService()

### Class: com.lunarclient.apollo.api.ApiResponse
Type: Interface

No public methods found

### Class: com.lunarclient.apollo.api.ApiRequestType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ApiRequestType valueOf(String)
- **static** ApiRequestType[] values()

### Class: com.lunarclient.apollo.api.ApiServiceType
Type: Enum
Extends: java.lang.Enum

Methods:
- String getUrl()
- **static** ApiServiceType valueOf(String)
- **static** ApiServiceType[] values()

## Package: com.lunarclient.apollo.async

### Class: com.lunarclient.apollo.async.Future
Type: Interface

Methods:
- void handleSuccess(ApiResponse)
- Future onFailure(Handler)
- void handleFailure(Throwable)
- Future onSuccess(Handler)

### Class: com.lunarclient.apollo.async.Handler
Type: Interface

Methods:
- void handle(Object)

## Package: com.lunarclient.apollo.async.future

### Class: com.lunarclient.apollo.async.future.UncertainFuture
Type: Class
Implements: com.lunarclient.apollo.async.Future

Methods:
- void handleSuccess(ApiResponse)
- UncertainFuture onFailure(Handler)
- Future onFailure(Handler)
- void handleFailure(Throwable)
- UncertainFuture onSuccess(Handler)
- Future onSuccess(Handler)

## Package: com.lunarclient.apollo.client.mod

### Class: com.lunarclient.apollo.client.mod.LunarClientMod
Type: Class

Methods:
- String getVersion()
- LunarClientModType getType()
- String getDisplayName()
- **static** LunarClientMod$LunarClientModBuilder builder()
- String getId()

### Class: com.lunarclient.apollo.client.mod.LunarClientMod$LunarClientModBuilder
Type: Class

Methods:
- LunarClientMod build()
- LunarClientMod$LunarClientModBuilder displayName(String)
- String toString()
- LunarClientMod$LunarClientModBuilder id(String)
- LunarClientMod$LunarClientModBuilder type(LunarClientModType)
- LunarClientMod$LunarClientModBuilder version(String)

### Class: com.lunarclient.apollo.client.mod.LunarClientModType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** LunarClientModType valueOf(String)
- **static** LunarClientModType[] values()

## Package: com.lunarclient.apollo.client.version

### Class: com.lunarclient.apollo.client.version.LunarClientVersion
Type: Class

Methods:
- String getGitBranch()
- String getSemVer()
- **static** LunarClientVersion$LunarClientVersionBuilder builder()
- String getGitCommit()

### Class: com.lunarclient.apollo.client.version.LunarClientVersion$LunarClientVersionBuilder
Type: Class

Methods:
- LunarClientVersion$LunarClientVersionBuilder gitCommit(String)
- LunarClientVersion build()
- LunarClientVersion$LunarClientVersionBuilder semVer(String)
- String toString()
- LunarClientVersion$LunarClientVersionBuilder gitBranch(String)

### Class: com.lunarclient.apollo.client.version.MinecraftVersion
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean isBeforeInclusive(MinecraftVersion)
- **static** MinecraftVersion valueOf(String)
- **static** MinecraftVersion[] values()
- boolean isAfterInclusive(MinecraftVersion)
- boolean isAfter(MinecraftVersion)
- boolean isBefore(MinecraftVersion)

## Package: com.lunarclient.apollo.common

### Class: com.lunarclient.apollo.common.ApolloColors
Type: Class

No public methods found

### Class: com.lunarclient.apollo.common.ApolloEntity
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)
- UUID getEntityUuid()
- String toString()
- int getEntityId()

## Package: com.lunarclient.apollo.common.cuboid

### Class: com.lunarclient.apollo.common.cuboid.Cuboid2D
Type: Class

Methods:
- double getMaxX()
- **static** Cuboid2D$Cuboid2DBuilder builder()
- double getMinZ()
- double getMaxZ()
- double getMinX()

### Class: com.lunarclient.apollo.common.cuboid.Cuboid2D$Cuboid2DBuilder
Type: Class

Methods:
- Cuboid2D build()
- Cuboid2D$Cuboid2DBuilder maxZ(double)
- Cuboid2D$Cuboid2DBuilder minX(double)
- Cuboid2D$Cuboid2DBuilder maxX(double)
- String toString()
- Cuboid2D$Cuboid2DBuilder minZ(double)

### Class: com.lunarclient.apollo.common.cuboid.Cuboid3D
Type: Class

Methods:
- double getMaxX()
- **static** Cuboid3D$Cuboid3DBuilder builder()
- double getMaxY()
- double getMinZ()
- double getMaxZ()
- double getMinX()
- double getMinY()

### Class: com.lunarclient.apollo.common.cuboid.Cuboid3D$Cuboid3DBuilder
Type: Class

Methods:
- Cuboid3D$Cuboid3DBuilder minY(double)
- Cuboid3D build()
- Cuboid3D$Cuboid3DBuilder maxZ(double)
- Cuboid3D$Cuboid3DBuilder minX(double)
- Cuboid3D$Cuboid3DBuilder maxY(double)
- Cuboid3D$Cuboid3DBuilder maxX(double)
- String toString()
- Cuboid3D$Cuboid3DBuilder minZ(double)

## Package: com.lunarclient.apollo.common.icon

### Class: com.lunarclient.apollo.common.icon.AdvancedResourceLocationIcon
Type: Class
Extends: com.lunarclient.apollo.common.icon.Icon

Methods:
- String getResourceLocation()
- float getHeight()
- float getMaxU()
- float getMinV()
- **static** AdvancedResourceLocationIcon$AdvancedResourceLocationIconBuilder builder()
- float getMaxV()
- float getMinU()
- float getWidth()

### Class: com.lunarclient.apollo.common.icon.AdvancedResourceLocationIcon$AdvancedResourceLocationIconBuilder
Type: Class

Methods:
- AdvancedResourceLocationIcon$AdvancedResourceLocationIconBuilder minU(float)
- AdvancedResourceLocationIcon$AdvancedResourceLocationIconBuilder maxV(float)
- AdvancedResourceLocationIcon$AdvancedResourceLocationIconBuilder maxU(float)
- AdvancedResourceLocationIcon build()
- AdvancedResourceLocationIcon$AdvancedResourceLocationIconBuilder minV(float)
- AdvancedResourceLocationIcon$AdvancedResourceLocationIconBuilder width(float)
- String toString()
- AdvancedResourceLocationIcon$AdvancedResourceLocationIconBuilder resourceLocation(String)
- AdvancedResourceLocationIcon$AdvancedResourceLocationIconBuilder height(float)

### Class: com.lunarclient.apollo.common.icon.Icon
Type: Abstract Class

No public methods found

### Class: com.lunarclient.apollo.common.icon.ItemStackIcon
Type: Class
Extends: com.lunarclient.apollo.common.icon.Icon

Methods:
- int getItemId()
- String getItemName()
- **static** ItemStackIcon$ItemStackIconBuilder builder()
- int getCustomModelData()

### Class: com.lunarclient.apollo.common.icon.ItemStackIcon$ItemStackIconBuilder
Type: Class

Methods:
- ItemStackIcon$ItemStackIconBuilder customModelData(int)
- ItemStackIcon$ItemStackIconBuilder itemId(int)
- ItemStackIcon$ItemStackIconBuilder itemName(String)
- ItemStackIcon build()
- String toString()

### Class: com.lunarclient.apollo.common.icon.SimpleResourceLocationIcon
Type: Class
Extends: com.lunarclient.apollo.common.icon.Icon

Methods:
- String getResourceLocation()
- int getSize()
- **static** SimpleResourceLocationIcon$SimpleResourceLocationIconBuilder builder()

### Class: com.lunarclient.apollo.common.icon.SimpleResourceLocationIcon$SimpleResourceLocationIconBuilder
Type: Class

Methods:
- SimpleResourceLocationIcon$SimpleResourceLocationIconBuilder size(int)
- SimpleResourceLocationIcon build()
- String toString()
- SimpleResourceLocationIcon$SimpleResourceLocationIconBuilder resourceLocation(String)

## Package: com.lunarclient.apollo.common.location

### Class: com.lunarclient.apollo.common.location.ApolloBlockLocation
Type: Class

Methods:
- int getX()
- String getWorld()
- int getY()
- int getZ()
- **static** ApolloBlockLocation$ApolloBlockLocationBuilder builder()

### Class: com.lunarclient.apollo.common.location.ApolloBlockLocation$ApolloBlockLocationBuilder
Type: Class

Methods:
- ApolloBlockLocation$ApolloBlockLocationBuilder world(String)
- ApolloBlockLocation build()
- ApolloBlockLocation$ApolloBlockLocationBuilder x(int)
- ApolloBlockLocation$ApolloBlockLocationBuilder y(int)
- String toString()
- ApolloBlockLocation$ApolloBlockLocationBuilder z(int)

### Class: com.lunarclient.apollo.common.location.ApolloLocation
Type: Class

Methods:
- double getX()
- String getWorld()
- double getY()
- double getZ()
- **static** ApolloLocation$ApolloLocationBuilder builder()

### Class: com.lunarclient.apollo.common.location.ApolloLocation$ApolloLocationBuilder
Type: Class

Methods:
- ApolloLocation$ApolloLocationBuilder world(String)
- ApolloLocation build()
- ApolloLocation$ApolloLocationBuilder x(double)
- ApolloLocation$ApolloLocationBuilder y(double)
- String toString()
- ApolloLocation$ApolloLocationBuilder z(double)

### Class: com.lunarclient.apollo.common.location.ApolloPlayerLocation
Type: Class

Methods:
- float getYaw()
- ApolloLocation getLocation()
- float getPitch()
- **static** ApolloPlayerLocation$ApolloPlayerLocationBuilder builder()

### Class: com.lunarclient.apollo.common.location.ApolloPlayerLocation$ApolloPlayerLocationBuilder
Type: Class

Methods:
- ApolloPlayerLocation build()
- String toString()
- ApolloPlayerLocation$ApolloPlayerLocationBuilder location(ApolloLocation)
- ApolloPlayerLocation$ApolloPlayerLocationBuilder pitch(float)
- ApolloPlayerLocation$ApolloPlayerLocationBuilder yaw(float)

## Package: com.lunarclient.apollo.event

### Class: com.lunarclient.apollo.event.ApolloListener
Type: Interface

Methods:
- void handle(Class, Consumer)

### Class: com.lunarclient.apollo.event.Event
Type: Interface

No public methods found

### Class: com.lunarclient.apollo.event.EventCancellable
Type: Interface
Implements: com.lunarclient.apollo.event.Event

Methods:
- boolean isCancelled()
- void setCancelled(boolean)

### Class: com.lunarclient.apollo.event.Listen
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.lunarclient.apollo.event.EventBus
Type: Class

Methods:
- **static** EventBus getBus()
- EventBus$EventResult post(Event)
- void unregister(Object)
- boolean unregister(Class, Consumer)
- void register(Object)
- boolean register(Class, Consumer)

### Class: com.lunarclient.apollo.event.EventBus$EventResult
Type: Class

Methods:
- Event getEvent()
- List getThrowing()
- int hashCode()
- boolean equals(Object)
- String toString()

## Package: com.lunarclient.apollo.event.option

### Class: com.lunarclient.apollo.event.option.ApolloUpdateOptionEvent
Type: Class
Implements: com.lunarclient.apollo.event.EventCancellable

Methods:
- Object getValue()
- boolean isCancelled()
- ApolloPlayer getPlayer()
- Options getContainer()
- void setCancelled(boolean)
- Option getOption()

## Package: com.lunarclient.apollo.event.packetenrichment.chat

### Class: com.lunarclient.apollo.event.packetenrichment.chat.ApolloPlayerChatCloseEvent
Type: Class
Implements: com.lunarclient.apollo.event.Event

Methods:
- PlayerInfo getPlayerInfo()
- int hashCode()
- boolean equals(Object)
- String toString()
- long getInstantiationTimeMs()

### Class: com.lunarclient.apollo.event.packetenrichment.chat.ApolloPlayerChatOpenEvent
Type: Class
Implements: com.lunarclient.apollo.event.Event

Methods:
- PlayerInfo getPlayerInfo()
- int hashCode()
- boolean equals(Object)
- String toString()
- long getInstantiationTimeMs()

## Package: com.lunarclient.apollo.event.packetenrichment.melee

### Class: com.lunarclient.apollo.event.packetenrichment.melee.ApolloPlayerAttackEvent
Type: Class
Implements: com.lunarclient.apollo.event.Event

Methods:
- double getDistance()
- PlayerInfo getAttackerInfo()
- int hashCode()
- boolean equals(Object)
- PlayerInfo getTargetInfo()
- String toString()
- long getInstantiationTimeMs()

## Package: com.lunarclient.apollo.event.packetenrichment.world

### Class: com.lunarclient.apollo.event.packetenrichment.world.ApolloPlayerUseItemEvent
Type: Class
Implements: com.lunarclient.apollo.event.Event

Methods:
- PlayerInfo getPlayerInfo()
- boolean isMainHand()
- int hashCode()
- boolean equals(Object)
- String toString()
- long getInstantiationTimeMs()

## Package: com.lunarclient.apollo.event.player

### Class: com.lunarclient.apollo.event.player.ApolloPlayerHandshakeEvent
Type: Class
Implements: com.lunarclient.apollo.event.Event

Methods:
- LunarClientVersion getLunarClientVersion()
- ApolloPlayer getPlayer()
- int hashCode()
- List getInstalledMods()
- boolean equals(Object)
- MinecraftVersion getMinecraftVersion()
- String toString()
- TebexEmbeddedCheckoutSupport getTebexEmbeddedCheckoutSupport()

### Class: com.lunarclient.apollo.event.player.ApolloRegisterPlayerEvent
Type: Class
Implements: com.lunarclient.apollo.event.Event

Methods:
- ApolloPlayer getPlayer()
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: com.lunarclient.apollo.event.player.ApolloUnregisterPlayerEvent
Type: Class
Implements: com.lunarclient.apollo.event.Event

Methods:
- ApolloPlayer getPlayer()
- int hashCode()
- boolean equals(Object)
- String toString()

## Package: com.lunarclient.apollo.mods

### Class: com.lunarclient.apollo.mods.Mods
Type: Class

No public methods found

## Package: com.lunarclient.apollo.mods.impl

### Class: com.lunarclient.apollo.mods.impl.Mod2dItems
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.Mod3dSkins
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModArmorstatus
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModAutoTextActions
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModAutoTextHotkey
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModBlockOutline
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModBossbar
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModChat
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModChunkBorders
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModClock
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModColorSaturation
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModCombo
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModCooldowns
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModCoordinates
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModCps
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModCrosshair
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModDamageTint
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModDayCounter
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModDirectionHud
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModFog
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModFov
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModFps
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModFreelook
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModGlintColorizer
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModHitColor
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModHitbox
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModHorseStats
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModHurtCam
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModHypixelBedwars
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModHypixelMod
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModItemCounter
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModItemPhysics
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModItemTracker
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModKeystrokes
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModLighting
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModMemory
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModMenuBlur
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModMinimap
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModMomentum
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModMotionBlur
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModMumbleLink
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModNametag
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModNeu
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModNickHider
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModOneSevenVisuals
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModPackDisplay
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModPackOrganizer
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModParticleChanger
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModPing
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModPlaytime
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModPotionEffects
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModPvpInfo
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModQuickplay
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModRadio
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModReachDisplay
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModReplaymod
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModSaturation
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModSba
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModScoreboard
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModScreenshot
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModScrollableTooltips
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModServerAddress
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModShinyPots
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModShulkerPreview
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModSkyblock
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModSnaplook
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModSoundChanger
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModStopwatch
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModTab
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModTeamView
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModTimeChanger
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModTitles
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModTntCountdown
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModToggleSneak
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModUhcOverlay
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModWaila
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModWaypoints
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModWeatherChanger
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModWorldeditCui
Type: Class

No public methods found

### Class: com.lunarclient.apollo.mods.impl.ModZoom
Type: Class

No public methods found

## Package: com.lunarclient.apollo.module

### Class: com.lunarclient.apollo.module.ApolloModuleManager
Type: Interface

Methods:
- ApolloModule getModule(Class)
- Collection getModules()
- boolean isEnabled(Class)

### Class: com.lunarclient.apollo.module.ModuleDefinition
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String name()
- String id()
- ConfigTarget configTarget()

### Class: com.lunarclient.apollo.module.ApolloModule
Type: Abstract Class
Implements: com.lunarclient.apollo.event.ApolloListener

Methods:
- boolean isClientNotify()
- String getName()
- void disable()
- void enable()
- boolean isEnabled()
- String getId()
- Options getOptions()
- ConfigTarget getConfigTarget()
- Collection getSupportedPlatforms()

## Package: com.lunarclient.apollo.module.autotexthotkey

### Class: com.lunarclient.apollo.module.autotexthotkey.AutoTextHotkeyModule
Type: Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- boolean isClientNotify()

## Package: com.lunarclient.apollo.module.beam

### Class: com.lunarclient.apollo.module.beam.Beam
Type: Class

Methods:
- ApolloBlockLocation getLocation()
- **static** Beam$BeamBuilder builder()
- Color getColor()
- String getId()

### Class: com.lunarclient.apollo.module.beam.Beam$BeamBuilder
Type: Class

Methods:
- Beam$BeamBuilder color(Color)
- Beam build()
- String toString()
- Beam$BeamBuilder location(ApolloBlockLocation)
- Beam$BeamBuilder id(String)

### Class: com.lunarclient.apollo.module.beam.BeamModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void resetBeams(Recipients)
- void removeBeam(Recipients, String)
- void removeBeam(Recipients, Beam)
- void displayBeam(Recipients, Beam)

## Package: com.lunarclient.apollo.module.border

### Class: com.lunarclient.apollo.module.border.Border
Type: Class

Methods:
- String getWorld()
- boolean isCancelExit()
- boolean isCancelEntry()
- **static** Border$BorderBuilder builder()
- Color getColor()
- String getId()
- int getDurationTicks()
- Cuboid2D getBounds()
- boolean isCanShrinkOrExpand()

### Class: com.lunarclient.apollo.module.border.Border$BorderBuilder
Type: Class

Methods:
- Border$BorderBuilder durationTicks(int)
- Border$BorderBuilder cancelExit(boolean)
- Border$BorderBuilder world(String)
- Border$BorderBuilder color(Color)
- Border build()
- Border$BorderBuilder canShrinkOrExpand(boolean)
- Border$BorderBuilder bounds(Cuboid2D)
- Border$BorderBuilder cancelEntry(boolean)
- String toString()
- Border$BorderBuilder id(String)

### Class: com.lunarclient.apollo.module.border.BorderModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void displayBorder(Recipients, Border)
- void removeBorder(Recipients, String)
- void removeBorder(Recipients, Border)
- void resetBorders(Recipients)

## Package: com.lunarclient.apollo.module.chat

### Class: com.lunarclient.apollo.module.chat.ChatModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void removeLiveChatMessage(Recipients, int)
- void displayLiveChatMessage(Recipients, Component, int)

## Package: com.lunarclient.apollo.module.coloredfire

### Class: com.lunarclient.apollo.module.coloredfire.ColoredFireModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- boolean isClientNotify()
- void resetColoredFires(Recipients)
- void resetColoredFire(Recipients, UUID)
- void overrideColoredFire(Recipients, UUID, Color)

## Package: com.lunarclient.apollo.module.combat

### Class: com.lunarclient.apollo.module.combat.CombatModule
Type: Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- boolean isClientNotify()

## Package: com.lunarclient.apollo.module.cooldown

### Class: com.lunarclient.apollo.module.cooldown.Cooldown
Type: Class

Methods:
- String getName()
- Duration getDuration()
- **static** Cooldown$CooldownBuilder builder()
- Icon getIcon()

### Class: com.lunarclient.apollo.module.cooldown.Cooldown$CooldownBuilder
Type: Class

Methods:
- Cooldown$CooldownBuilder duration(Duration)
- Cooldown build()
- Cooldown$CooldownBuilder icon(Icon)
- Cooldown$CooldownBuilder name(String)
- String toString()

### Class: com.lunarclient.apollo.module.cooldown.CooldownModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void removeCooldown(Recipients, String)
- void removeCooldown(Recipients, Cooldown)
- void displayCooldown(Recipients, Cooldown)
- void resetCooldowns(Recipients)

## Package: com.lunarclient.apollo.module.entity

### Class: com.lunarclient.apollo.module.entity.EntityModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void resetRainbowSheep(Recipients, List)
- void resetFlippedEntity(Recipients, List)
- void flipEntity(Recipients, List)
- void overrideRainbowSheep(Recipients, List)

## Package: com.lunarclient.apollo.module.glint

### Class: com.lunarclient.apollo.module.glint.GlintModule
Type: Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- boolean isClientNotify()

## Package: com.lunarclient.apollo.module.glow

### Class: com.lunarclient.apollo.module.glow.GlowModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- boolean isClientNotify()
- void resetGlow(Recipients, UUID)
- void resetGlow(Recipients)
- void overrideGlow(Recipients, UUID, Color)

## Package: com.lunarclient.apollo.module.hologram

### Class: com.lunarclient.apollo.module.hologram.Hologram
Type: Class

Methods:
- boolean isShowShadow()
- boolean isShowBackground()
- ApolloLocation getLocation()
- boolean isShowThroughWalls()
- **static** Hologram$HologramBuilder builder()
- List getLines()
- String getId()

### Class: com.lunarclient.apollo.module.hologram.Hologram$HologramBuilder
Type: Class

Methods:
- Hologram$HologramBuilder showShadow(boolean)
- Hologram build()
- Hologram$HologramBuilder showBackground(boolean)
- String toString()
- Hologram$HologramBuilder location(ApolloLocation)
- Hologram$HologramBuilder showThroughWalls(boolean)
- Hologram$HologramBuilder id(String)
- Hologram$HologramBuilder lines(List)

### Class: com.lunarclient.apollo.module.hologram.HologramModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void resetHolograms(Recipients)
- void removeHologram(Recipients, String)
- void removeHologram(Recipients, Hologram)
- void displayHologram(Recipients, Hologram)

## Package: com.lunarclient.apollo.module.inventory

### Class: com.lunarclient.apollo.module.inventory.InventoryModule
Type: Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- boolean isClientNotify()

## Package: com.lunarclient.apollo.module.limb

### Class: com.lunarclient.apollo.module.limb.ArmorPiece
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ArmorPiece valueOf(String)
- **static** ArmorPiece[] values()

### Class: com.lunarclient.apollo.module.limb.BodyPart
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BodyPart valueOf(String)
- **static** BodyPart[] values()

### Class: com.lunarclient.apollo.module.limb.LimbModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void hideBodyParts(Recipients, UUID, Collection)
- void resetArmorPieces(Recipients, UUID, Collection)
- void resetBodyParts(Recipients, UUID, Collection)
- void hideArmorPieces(Recipients, UUID, Collection)

## Package: com.lunarclient.apollo.module.modsetting

### Class: com.lunarclient.apollo.module.modsetting.ModSettingModule
Type: Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- boolean isClientNotify()
- Collection getSupportedPlatforms()

## Package: com.lunarclient.apollo.module.nametag

### Class: com.lunarclient.apollo.module.nametag.Nametag
Type: Class

Methods:
- **static** Nametag$NametagBuilder builder()
- List getLines()

### Class: com.lunarclient.apollo.module.nametag.Nametag$NametagBuilder
Type: Class

Methods:
- Nametag build()
- String toString()
- Nametag$NametagBuilder lines(List)

### Class: com.lunarclient.apollo.module.nametag.NametagModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void overrideNametag(Recipients, UUID, Nametag)
- void resetNametags(Recipients)
- void resetNametag(Recipients, UUID)

## Package: com.lunarclient.apollo.module.nickhider

### Class: com.lunarclient.apollo.module.nickhider.NickHiderModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void overrideNick(Recipients, String)
- void resetNick(Recipients)

## Package: com.lunarclient.apollo.module.notification

### Class: com.lunarclient.apollo.module.notification.Notification
Type: Class

Methods:
- String getResourceLocation()
- Component getDescriptionComponent()
- Component getTitleComponent()
- String getTitle()
- **static** Notification$NotificationBuilder builder()
- Duration getDisplayTime()
- String getDescription()

### Class: com.lunarclient.apollo.module.notification.Notification$NotificationBuilder
Type: Class

Methods:
- Notification$NotificationBuilder displayTime(Duration)
- Notification build()
- Notification$NotificationBuilder titleComponent(Component)
- Notification$NotificationBuilder description(String)
- String toString()
- Notification$NotificationBuilder descriptionComponent(Component)
- Notification$NotificationBuilder resourceLocation(String)
- Notification$NotificationBuilder title(String)

### Class: com.lunarclient.apollo.module.notification.NotificationModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void displayNotification(Recipients, Notification)
- Collection getSupportedPlatforms()
- void resetNotifications(Recipients)

## Package: com.lunarclient.apollo.module.packetenrichment

### Class: com.lunarclient.apollo.module.packetenrichment.PacketEnrichmentModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

No public methods found

### Class: com.lunarclient.apollo.module.packetenrichment.PlayerInfo
Type: Class

Methods:
- float getStrafeSpeed()
- ApolloPlayerLocation getLocation()
- float getForwardSpeed()
- boolean isSneaking()
- boolean isSprinting()
- **static** PlayerInfo$PlayerInfoBuilder builder()
- boolean isJumping()
- UUID getPlayerUuid()

### Class: com.lunarclient.apollo.module.packetenrichment.PlayerInfo$PlayerInfoBuilder
Type: Class

Methods:
- PlayerInfo$PlayerInfoBuilder playerUuid(UUID)
- PlayerInfo$PlayerInfoBuilder sprinting(boolean)
- PlayerInfo$PlayerInfoBuilder strafeSpeed(float)
- PlayerInfo$PlayerInfoBuilder jumping(boolean)
- PlayerInfo build()
- PlayerInfo$PlayerInfoBuilder sneaking(boolean)
- String toString()
- PlayerInfo$PlayerInfoBuilder forwardSpeed(float)
- PlayerInfo$PlayerInfoBuilder location(ApolloPlayerLocation)

## Package: com.lunarclient.apollo.module.richpresence

### Class: com.lunarclient.apollo.module.richpresence.RichPresenceModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void resetServerRichPresence(Recipients)
- void overrideServerRichPresence(Recipients, ServerRichPresence)

### Class: com.lunarclient.apollo.module.richpresence.ServerRichPresence
Type: Class

Methods:
- String getGameVariantName()
- int getTeamCurrentSize()
- int getTeamMaxSize()
- String getGameName()
- String getMapName()
- String getPlayerState()
- **static** ServerRichPresence$ServerRichPresenceBuilder builder()
- String getGameState()
- String getSubServerName()

### Class: com.lunarclient.apollo.module.richpresence.ServerRichPresence$ServerRichPresenceBuilder
Type: Class

Methods:
- ServerRichPresence$ServerRichPresenceBuilder gameName(String)
- ServerRichPresence build()
- ServerRichPresence$ServerRichPresenceBuilder teamMaxSize(int)
- ServerRichPresence$ServerRichPresenceBuilder teamCurrentSize(int)
- ServerRichPresence$ServerRichPresenceBuilder gameVariantName(String)
- String toString()
- ServerRichPresence$ServerRichPresenceBuilder mapName(String)
- ServerRichPresence$ServerRichPresenceBuilder playerState(String)
- ServerRichPresence$ServerRichPresenceBuilder subServerName(String)
- ServerRichPresence$ServerRichPresenceBuilder gameState(String)

## Package: com.lunarclient.apollo.module.saturation

### Class: com.lunarclient.apollo.module.saturation.SaturationModule
Type: Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- boolean isClientNotify()

## Package: com.lunarclient.apollo.module.serverrule

### Class: com.lunarclient.apollo.module.serverrule.ServerRuleModule
Type: Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- boolean isClientNotify()

## Package: com.lunarclient.apollo.module.staffmod

### Class: com.lunarclient.apollo.module.staffmod.StaffMod
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** StaffMod valueOf(String)
- **static** StaffMod[] values()

### Class: com.lunarclient.apollo.module.staffmod.StaffModModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void enableStaffMods(Recipients, List)
- void disableStaffMods(Recipients, List)
- void disableAllStaffMods(Recipients)
- void enableAllStaffMods(Recipients)

## Package: com.lunarclient.apollo.module.stopwatch

### Class: com.lunarclient.apollo.module.stopwatch.StopwatchModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void stopStopwatch(Recipients)
- void resetStopwatch(Recipients)
- Collection getSupportedPlatforms()
- void startStopwatch(Recipients)

## Package: com.lunarclient.apollo.module.team

### Class: com.lunarclient.apollo.module.team.TeamMember
Type: Class

Methods:
- Color getMarkerColor()
- ApolloLocation getLocation()
- Component getDisplayName()
- **static** TeamMember$TeamMemberBuilder builder()
- UUID getPlayerUuid()

### Class: com.lunarclient.apollo.module.team.TeamMember$TeamMemberBuilder
Type: Class

Methods:
- TeamMember$TeamMemberBuilder playerUuid(UUID)
- TeamMember$TeamMemberBuilder markerColor(Color)
- TeamMember build()
- TeamMember$TeamMemberBuilder displayName(Component)
- String toString()
- TeamMember$TeamMemberBuilder location(ApolloLocation)

### Class: com.lunarclient.apollo.module.team.TeamModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void updateTeamMembers(Recipients, List)
- void resetTeamMembers(Recipients)

## Package: com.lunarclient.apollo.module.tebex

### Class: com.lunarclient.apollo.module.tebex.TebexEmbeddedCheckoutSupport
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TebexEmbeddedCheckoutSupport valueOf(String)
- **static** TebexEmbeddedCheckoutSupport[] values()

### Class: com.lunarclient.apollo.module.tebex.TebexModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void displayTebexEmbeddedCheckout(Recipients, String)
- void displayTebexEmbeddedCheckout(Recipients, String, String)

## Package: com.lunarclient.apollo.module.title

### Class: com.lunarclient.apollo.module.title.Title
Type: Class

Methods:
- float getInterpolationScale()
- Duration getFadeOutTime()
- Duration getFadeInTime()
- float getScale()
- TitleType getType()
- **static** Title$TitleBuilder builder()
- Component getMessage()
- float getInterpolationRate()
- Duration getDisplayTime()

### Class: com.lunarclient.apollo.module.title.Title$TitleBuilder
Type: Class

Methods:
- Title$TitleBuilder displayTime(Duration)
- Title$TitleBuilder interpolationRate(float)
- Title build()
- Title$TitleBuilder interpolationScale(float)
- Title$TitleBuilder scale(float)
- String toString()
- Title$TitleBuilder message(Component)
- Title$TitleBuilder type(TitleType)
- Title$TitleBuilder fadeOutTime(Duration)
- Title$TitleBuilder fadeInTime(Duration)

### Class: com.lunarclient.apollo.module.title.TitleModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void displayTitle(Recipients, Title)
- void resetTitles(Recipients)

### Class: com.lunarclient.apollo.module.title.TitleType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TitleType valueOf(String)
- **static** TitleType[] values()

## Package: com.lunarclient.apollo.module.tntcountdown

### Class: com.lunarclient.apollo.module.tntcountdown.TntCountdownModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- boolean isClientNotify()
- void setTntCountdown(ApolloEntity, int)
- void setTntCountdown(Recipients, ApolloEntity, int)

## Package: com.lunarclient.apollo.module.transfer

### Class: com.lunarclient.apollo.module.transfer.PingRequest
Type: Class
Extends: com.lunarclient.apollo.roundtrip.ApolloRequest

Methods:
- **static** PingRequest$PingRequestBuilder builder()
- List getServerIps()

### Class: com.lunarclient.apollo.module.transfer.PingRequest$PingRequestBuilder
Type: Class

Methods:
- PingRequest$PingRequestBuilder serverIps(List)
- PingRequest build()
- String toString()

### Class: com.lunarclient.apollo.module.transfer.PingResponse
Type: Class
Extends: com.lunarclient.apollo.roundtrip.ApolloResponse

Methods:
- **static** PingResponse$PingResponseBuilder builder()
- List getData()

### Class: com.lunarclient.apollo.module.transfer.PingResponse$PingData
Type: Class

Methods:
- int getPingMillis()
- **static** PingResponse$PingData$PingDataBuilder builder()
- PingResponse$PingData$Status getStatus()
- String getServerIp()

### Class: com.lunarclient.apollo.module.transfer.PingResponse$PingData$PingDataBuilder
Type: Class

Methods:
- PingResponse$PingData build()
- PingResponse$PingData$PingDataBuilder serverIp(String)
- String toString()
- PingResponse$PingData$PingDataBuilder pingMillis(int)
- PingResponse$PingData$PingDataBuilder status(PingResponse$PingData$Status)

### Class: com.lunarclient.apollo.module.transfer.PingResponse$PingData$Status
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PingResponse$PingData$Status valueOf(String)
- **static** PingResponse$PingData$Status[] values()

### Class: com.lunarclient.apollo.module.transfer.PingResponse$PingResponseBuilder
Type: Abstract Class
Extends: com.lunarclient.apollo.roundtrip.ApolloResponse$ApolloResponseBuilder

Methods:
- PingResponse$PingResponseBuilder data(List)
- PingResponse build()
- ApolloResponse build()
- String toString()

### Class: com.lunarclient.apollo.module.transfer.TransferModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- Future transfer(ApolloPlayer, String)
- Future transfer(ApolloPlayer, TransferRequest)
- Future ping(ApolloPlayer, List)
- Future ping(ApolloPlayer, PingRequest)
- Collection getSupportedPlatforms()

### Class: com.lunarclient.apollo.module.transfer.TransferRequest
Type: Class
Extends: com.lunarclient.apollo.roundtrip.ApolloRequest

Methods:
- **static** TransferRequest$TransferRequestBuilder builder()
- String getServerIp()

### Class: com.lunarclient.apollo.module.transfer.TransferRequest$TransferRequestBuilder
Type: Class

Methods:
- TransferRequest build()
- TransferRequest$TransferRequestBuilder serverIp(String)
- String toString()

### Class: com.lunarclient.apollo.module.transfer.TransferResponse
Type: Class
Extends: com.lunarclient.apollo.roundtrip.ApolloResponse

Methods:
- **static** TransferResponse$TransferResponseBuilder builder()
- TransferResponse$Status getStatus()

### Class: com.lunarclient.apollo.module.transfer.TransferResponse$Status
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TransferResponse$Status valueOf(String)
- **static** TransferResponse$Status[] values()

### Class: com.lunarclient.apollo.module.transfer.TransferResponse$TransferResponseBuilder
Type: Abstract Class
Extends: com.lunarclient.apollo.roundtrip.ApolloResponse$ApolloResponseBuilder

Methods:
- TransferResponse build()
- ApolloResponse build()
- String toString()
- TransferResponse$TransferResponseBuilder status(TransferResponse$Status)

## Package: com.lunarclient.apollo.module.vignette

### Class: com.lunarclient.apollo.module.vignette.Vignette
Type: Class

Methods:
- float getOpacity()
- String getResourceLocation()
- **static** Vignette$VignetteBuilder builder()

### Class: com.lunarclient.apollo.module.vignette.Vignette$VignetteBuilder
Type: Class

Methods:
- Vignette build()
- String toString()
- Vignette$VignetteBuilder opacity(float)
- Vignette$VignetteBuilder resourceLocation(String)

### Class: com.lunarclient.apollo.module.vignette.VignetteModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void displayVignette(Recipients, Vignette)
- void resetVignette(Recipients)

## Package: com.lunarclient.apollo.module.waypoint

### Class: com.lunarclient.apollo.module.waypoint.Waypoint
Type: Class

Methods:
- ApolloBlockLocation getLocation()
- String getName()
- **static** Waypoint$WaypointBuilder builder()
- Color getColor()
- boolean isPreventRemoval()
- boolean isHidden()

### Class: com.lunarclient.apollo.module.waypoint.Waypoint$WaypointBuilder
Type: Class

Methods:
- Waypoint$WaypointBuilder hidden(boolean)
- Waypoint$WaypointBuilder color(Color)
- Waypoint build()
- Waypoint$WaypointBuilder name(String)
- String toString()
- Waypoint$WaypointBuilder location(ApolloBlockLocation)
- Waypoint$WaypointBuilder preventRemoval(boolean)

### Class: com.lunarclient.apollo.module.waypoint.WaypointModule
Type: Abstract Class
Extends: com.lunarclient.apollo.module.ApolloModule

Methods:
- void removeWaypoint(Recipients, String)
- void removeWaypoint(Recipients, Waypoint)
- boolean isClientNotify()
- void resetWaypoints(Recipients)
- void displayWaypoint(Recipients, Waypoint)

## Package: com.lunarclient.apollo.option

### Class: com.lunarclient.apollo.option.Options
Type: Interface
Implements: java.lang.Iterable

Methods:
- void add(Option, Object)
- void add(ApolloPlayer, Option, Object)
- void set(Option, Object)
- void set(ApolloPlayer, Option, Object)
- Optional getDirect(Option)
- Optional getDirect(ApolloPlayer, Option)
- Object get(Option)
- Object get(ApolloPlayer, Option)
- void replace(Option, BiFunction)
- void replace(ApolloPlayer, Option, BiFunction)
- void remove(Option, Object)
- void remove(ApolloPlayer, Option, Object)
- **static** Options empty()

### Class: com.lunarclient.apollo.option.EnumOption
Type: Class
Extends: com.lunarclient.apollo.option.Option

No public methods found

### Class: com.lunarclient.apollo.option.EnumOption$EnumOptionBuilder
Type: Class
Extends: com.lunarclient.apollo.option.OptionBuilder

Methods:
- EnumOption build()
- Option build()

### Class: com.lunarclient.apollo.option.ListOption
Type: Class
Extends: com.lunarclient.apollo.option.Option

No public methods found

### Class: com.lunarclient.apollo.option.ListOption$ListOptionBuilder
Type: Class
Extends: com.lunarclient.apollo.option.OptionBuilder

Methods:
- ListOption build()
- Option build()

### Class: com.lunarclient.apollo.option.NumberOption
Type: Class
Extends: com.lunarclient.apollo.option.Option

Methods:
- Number getMin()
- Number getMax()

### Class: com.lunarclient.apollo.option.NumberOption$NumberOptionBuilder
Type: Class
Extends: com.lunarclient.apollo.option.OptionBuilder

Methods:
- NumberOption$NumberOptionBuilder min(Number)
- NumberOption build()
- Option build()
- NumberOption$NumberOptionBuilder max(Number)

### Class: com.lunarclient.apollo.option.Option
Type: Abstract Class

Methods:
- String getKey()
- **static** NumberOption$NumberOptionBuilder number()
- int hashCode()
- boolean equals(Object)
- boolean isNotify()
- String[] getPath()
- **static** SimpleOption$SimpleOptionBuilder builder()
- String getComment()
- TypeToken getTypeToken()
- **static** ListOption$ListOptionBuilder list()
- Object getDefaultValue()

### Class: com.lunarclient.apollo.option.OptionBuilder
Type: Abstract Class

Methods:
- OptionBuilder node(String[])
- Option build()
- OptionBuilder defaultValue(Object)
- OptionBuilder comment(String)
- OptionBuilder type(TypeToken)
- OptionBuilder notifyClient()

### Class: com.lunarclient.apollo.option.SimpleOption
Type: Class
Extends: com.lunarclient.apollo.option.Option

No public methods found

### Class: com.lunarclient.apollo.option.SimpleOption$SimpleOptionBuilder
Type: Class
Extends: com.lunarclient.apollo.option.OptionBuilder

Methods:
- SimpleOption build()
- Option build()

## Package: com.lunarclient.apollo.player

### Class: com.lunarclient.apollo.player.ApolloPlayer
Type: Interface
Implements: com.lunarclient.apollo.recipients.Recipients, net.kyori.adventure.audience.ForwardingAudience$Single

Methods:
- LunarClientVersion getLunarClientVersion()
- Object getPlayer()
- Optional getLocation()
- Optional getWorld()
- String getName()
- List getInstalledMods()
- boolean hasPermission(Options, Option)
- boolean hasPermission(String)
- MinecraftVersion getMinecraftVersion()
- TebexEmbeddedCheckoutSupport getTebexEmbeddedCheckoutSupport()
- UUID getUniqueId()

### Class: com.lunarclient.apollo.player.ApolloPlayerManager
Type: Interface

Methods:
- Optional getPlayer(UUID)
- boolean hasSupport(UUID)
- Collection getPlayers()

## Package: com.lunarclient.apollo.recipients

### Class: com.lunarclient.apollo.recipients.ForwardingRecipients
Type: Interface
Implements: com.lunarclient.apollo.recipients.Recipients

Methods:
- void forEach(Consumer)
- Iterable recipients()

### Class: com.lunarclient.apollo.recipients.Recipients
Type: Interface

Methods:
- void forEach(Consumer)
- **static** ForwardingRecipients ofEveryone()
- **static** ForwardingRecipients of(Iterable)

## Package: com.lunarclient.apollo.roundtrip

### Class: com.lunarclient.apollo.roundtrip.ApolloRequest
Type: Class

Methods:
- long getSentTime()
- UUID getRequestId()

### Class: com.lunarclient.apollo.roundtrip.ApolloResponse
Type: Class
Implements: com.lunarclient.apollo.api.ApiResponse

Methods:
- UUID getPacketId()
- **static** ApolloResponse$ApolloResponseBuilder builder()

### Class: com.lunarclient.apollo.roundtrip.ApolloResponse$ApolloResponseBuilder
Type: Abstract Class

Methods:
- ApolloResponse$ApolloResponseBuilder packetId(UUID)
- ApolloResponse build()
- String toString()

### Class: com.lunarclient.apollo.roundtrip.ApolloRoundtripManager
Type: Class

Methods:
- void handleResponse(ApolloResponse)
- void registerListener(ApolloRequest, UncertainFuture)

## Package: com.lunarclient.apollo.stats

### Class: com.lunarclient.apollo.stats.ApolloStats
Type: Interface

Methods:
- String getVersion()
- boolean isOnlineMode()
- int getTotalPlayers()
- List getPlugins()
- String getPlatformVersion()
- String getPlatformSubtype()
- String getIcon()

### Class: com.lunarclient.apollo.stats.ApolloPluginDescription
Type: Class

Methods:
- String getVersion()
- String getName()
- List getAuthors()
- **static** ApolloPluginDescription$ApolloPluginDescriptionBuilder builder()
- String getDescription()

### Class: com.lunarclient.apollo.stats.ApolloPluginDescription$ApolloPluginDescriptionBuilder
Type: Class

Methods:
- ApolloPluginDescription build()
- ApolloPluginDescription$ApolloPluginDescriptionBuilder name(String)
- ApolloPluginDescription$ApolloPluginDescriptionBuilder description(String)
- String toString()
- ApolloPluginDescription$ApolloPluginDescriptionBuilder version(String)
- ApolloPluginDescription$ApolloPluginDescriptionBuilder authors(List)

## Package: com.lunarclient.apollo.util

### Class: com.lunarclient.apollo.util.ConfigTarget
Type: Enum
Extends: java.lang.Enum

Methods:
- String getHeaderComment()
- String[] getModulesNode()
- **static** ConfigTarget valueOf(String)
- **static** ConfigTarget[] values()
- String getFileName()

## Package: com.lunarclient.apollo.world

### Class: com.lunarclient.apollo.world.ApolloWorld
Type: Interface
Implements: com.lunarclient.apollo.recipients.Recipients

Methods:
- String getName()
- Collection getPlayers()

### Class: com.lunarclient.apollo.world.ApolloWorldManager
Type: Interface

Methods:
- Optional getWorld(String)
- Collection getWorlds()

