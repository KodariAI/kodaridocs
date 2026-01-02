# FancyHolograms-2.9.0-de-oliver-fancyholograms-api API Reference

**Package Filter:** `de.oliver.fancyholograms.api`

## Package: de.oliver.fancyholograms.api

### Class: de.oliver.fancyholograms.api.FancyHologramsPlugin
Type: Interface

Methods:
- ScheduledExecutorService getHologramThread()
- HologramConfiguration getHologramConfiguration()
- void setHologramConfiguration(HologramConfiguration, boolean)
- HologramManager getHologramManager()
- ExtendedFancyLogger getFancyLogger()
- JavaPlugin getPlugin()
- **static** boolean isEnabled()
- **static** FancyHologramsPlugin get()
- HologramStorage getHologramStorage()
- void setHologramStorage(HologramStorage, boolean)

### Class: de.oliver.fancyholograms.api.HologramConfiguration
Type: Interface

Methods:
- int getUpdateVisibilityInterval()
- boolean areVersionNotificationsEnabled()
- void reload(FancyHologramsPlugin)
- int getDefaultVisibilityDistance()
- boolean isHologramLoadLogging()
- String getLogLevel()
- boolean isSaveOnChangedEnabled()
- int getAutosaveInterval()
- boolean isAutosaveEnabled()
- boolean isRegisterCommands()

### Class: de.oliver.fancyholograms.api.HologramManager
Type: Interface

Methods:
- void reloadHolograms()
- void addHologram(Hologram)
- Collection<Hologram> getHolograms()
- Collection<Hologram> getPersistentHolograms()
- Optional<Hologram> getHologram(String)
- void saveHolograms()
- Hologram create(HologramData)
- void removeHologram(Hologram)
- boolean isLoaded()
- void loadHolograms()

### Class: de.oliver.fancyholograms.api.HologramStorage
Type: Interface

Methods:
- V saveBatch(Collection<Hologram>, boolean)
- void save(Hologram)
- Collection<Hologram> loadAll()
- Collection<Hologram> loadAll(String)
- void delete(Hologram)

### Class: de.oliver.fancyholograms.api.FancyHologramsPlugin$EnabledChecker
Type: Class

Methods:
- **static** Boolean isFancyHologramsEnabled()
- **static** FancyHologramsPlugin getPlugin()

## Package: de.oliver.fancyholograms.api.data

### Class: de.oliver.fancyholograms.api.data.YamlData
Type: Interface

Methods:
- boolean read(ConfigurationSection, String)
- boolean write(ConfigurationSection, String)

### Class: de.oliver.fancyholograms.api.data.BlockHologramData
Type: Class
Extends: de.oliver.fancyholograms.api.data.DisplayHologramData

Constructors:
- BlockHologramData(String name, Location block)

Methods:
- Material getBlock()
- boolean read(ConfigurationSection section, String name)
- BlockHologramData setBlock(Material block)
- BlockHologramData copy(String name)
- DisplayHologramData copy(String)
- HologramData copy(String)
- boolean write(ConfigurationSection section, String name)

### Class: de.oliver.fancyholograms.api.data.DisplayHologramData
Type: Class
Extends: de.oliver.fancyholograms.api.data.HologramData

Constructors:
- DisplayHologramData(String name, HologramType type, Location billboard)

Methods:
- boolean read(ConfigurationSection section, String name)
- Display$Brightness getBrightness()
- DisplayHologramData setScale(Vector3f scale)
- DisplayHologramData setShadowRadius(float shadowRadius)
- DisplayHologramData setBillboard(Display$Billboard billboard)
- Display$Billboard getBillboard()
- DisplayHologramData setTranslation(Vector3f translation)
- int getInterpolationDuration()
- DisplayHologramData setInterpolationDuration(int interpolationDuration)
- DisplayHologramData setShadowStrength(float shadowStrength)
- DisplayHologramData setBrightness(Display$Brightness brightness)
- Vector3f getScale()
- float getShadowStrength()
- DisplayHologramData copy(String name)
- HologramData copy(String)
- float getShadowRadius()
- Vector3f getTranslation()
- boolean write(ConfigurationSection section, String name)

### Class: de.oliver.fancyholograms.api.data.HologramData
Type: Class
Implements: de.oliver.fancyholograms.api.data.YamlData

Constructors:
- HologramData(String name, HologramType type, Location location)

Methods:
- Location getLocation()
- boolean read(ConfigurationSection section, String name)
- String getName()
- int getVisibilityDistance()
- boolean hasChanges()
- HologramData setPersistent(boolean persistent)
- HologramData setVisibilityDistance(int visibilityDistance)
- HologramData setVisibility(Visibility visibility)
- String getLinkedNpcName()
- HologramData setLinkedNpcName(String linkedNpcName)
- HologramData setLocation(Location location)
- HologramType getType()
- boolean isPersistent()
- HologramData copy(String name)
- boolean write(ConfigurationSection section, String name)
- Visibility getVisibility()
- void setHasChanges(boolean hasChanges)

### Class: de.oliver.fancyholograms.api.data.ItemHologramData
Type: Class
Extends: de.oliver.fancyholograms.api.data.DisplayHologramData

Constructors:
- ItemHologramData(String name, Location item)

Methods:
- boolean read(ConfigurationSection section, String name)
- ItemHologramData copy(String name)
- DisplayHologramData copy(String)
- HologramData copy(String)
- ItemHologramData setItemStack(ItemStack item)
- ItemStack getItemStack()
- boolean write(ConfigurationSection section, String name)

### Class: de.oliver.fancyholograms.api.data.TextHologramData
Type: Class
Extends: de.oliver.fancyholograms.api.data.DisplayHologramData

Constructors:
- TextHologramData(String text, Location textAlignment)

Methods:
- boolean isSeeThrough()
- TextDisplay$TextAlignment getTextAlignment()
- boolean read(ConfigurationSection section, String name)
- TextHologramData setSeeThrough(boolean seeThrough)
- List<String> getText()
- TextHologramData setTextUpdateInterval(int textUpdateInterval)
- TextHologramData setTextAlignment(TextDisplay$TextAlignment textAlignment)
- TextHologramData setBackground(Color background)
- boolean hasTextShadow()
- void removeLine(int index)
- void addLine(String line)
- TextHologramData setTextShadow(boolean textShadow)
- TextHologramData copy(String name)
- DisplayHologramData copy(String)
- HologramData copy(String)
- boolean write(ConfigurationSection section, String name)
- int getTextUpdateInterval()
- Color getBackground()
- TextHologramData setText(List<String> text)

## Package: de.oliver.fancyholograms.api.data.property

### Class: de.oliver.fancyholograms.api.data.property.Visibility$VisibilityPredicate
Type: Interface

Methods:
- boolean canSee(Player, Hologram)

### Class: de.oliver.fancyholograms.api.data.property.Visibility
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ALL
- PERMISSION_REQUIRED
- MANUAL

Methods:
- **static** Visibility valueOf(String name)
- **static** Optional<Visibility> byString(String value)
- **static** Visibility[] values()
- boolean canSee(Player player, Hologram hologram)

### Class: de.oliver.fancyholograms.api.data.property.Visibility$ManualVisibility
Type: Class

Methods:
- **static** void removeDistantViewer(Hologram hologram, UUID uuid)
- **static** void removeDistantViewer(String hologramName, UUID uuid)
- **static** void addDistantViewer(Hologram hologram, UUID uuid)
- **static** void addDistantViewer(String hologramName, UUID uuid)
- **static** void clear()
- **static** boolean canSee(Player player, Hologram hologram)
- **static** void remove(Hologram hologram)
- **static** void remove(String hologramName)

## Package: de.oliver.fancyholograms.api.events

### Class: de.oliver.fancyholograms.api.events.HologramCreateEvent
Type: Class
Extends: de.oliver.fancyholograms.api.events.HologramEvent

Constructors:
- HologramCreateEvent(Hologram hologram, Player player)

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancyholograms.api.events.HologramDeleteEvent
Type: Class
Extends: de.oliver.fancyholograms.api.events.HologramEvent

Constructors:
- HologramDeleteEvent(Hologram hologram, CommandSender player)

Methods:
- CommandSender getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancyholograms.api.events.HologramEvent
Type: Abstract Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancel)
- Hologram getHologram()

### Class: de.oliver.fancyholograms.api.events.HologramHideEvent
Type: Class
Extends: de.oliver.fancyholograms.api.events.HologramEvent

Constructors:
- HologramHideEvent(Hologram hologram, Player player)

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancyholograms.api.events.HologramShowEvent
Type: Class
Extends: de.oliver.fancyholograms.api.events.HologramEvent

Constructors:
- HologramShowEvent(Hologram hologram, Player player)

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancyholograms.api.events.HologramUpdateEvent
Type: Class
Extends: de.oliver.fancyholograms.api.events.HologramEvent

Constructors:
- HologramUpdateEvent(Hologram hologram, CommandSender player, HologramData updatedData, HologramUpdateEvent$HologramModification modification)

Methods:
- CommandSender getPlayer()
- HandlerList getHandlers()
- HologramUpdateEvent$HologramModification getModification()
- HologramData getUpdatedData()
- **static** HandlerList getHandlerList()
- HologramData getCurrentData()

### Class: de.oliver.fancyholograms.api.events.HologramUpdateEvent$HologramModification
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- TEXT
- POSITION
- SCALE
- TRANSLATION
- BILLBOARD
- BACKGROUND
- TEXT_SHADOW
- TEXT_ALIGNMENT
- SEE_THROUGH
- SHADOW_RADIUS
- SHADOW_STRENGTH
- UPDATE_TEXT_INTERVAL
- UPDATE_VISIBILITY_DISTANCE

Methods:
- **static** HologramUpdateEvent$HologramModification valueOf(String name)
- **static** HologramUpdateEvent$HologramModification[] values()

### Class: de.oliver.fancyholograms.api.events.HologramsLoadedEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- HologramsLoadedEvent(ImmutableList<Hologram> holograms)

Methods:
- ImmutableList<Hologram> getManager()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancyholograms.api.events.HologramsUnloadedEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- HologramsUnloadedEvent(ImmutableList<Hologram> holograms)

Methods:
- ImmutableList<Hologram> getManager()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: de.oliver.fancyholograms.api.hologram

### Class: de.oliver.fancyholograms.api.hologram.Hologram
Type: Abstract Class

Methods:
- Display getDisplayEntity()
- boolean meetsVisibilityConditions(Player player)
- void forceHideHologram(Player player)
- V showHologram(Collection<Player> players)
- void showHologram(Player player)
- String getName()
- void deleteHologram()
- void updateShownStateFor(Player player)
- void refreshForViewers()
- void updateHologram()
- void refreshForViewersInWorld()
- Set<UUID> getViewers()
- void forceUpdate()
- V hideHologram(Collection<Player> players)
- void hideHologram(Player player)
- void forceShowHologram(Player player)
- void forceUpdateShownStateFor(Player player)
- int hashCode()
- boolean equals(Object o)
- Component getShownText(Player player)
- boolean isWithinVisibilityDistance(Player player)
- void refreshHologram(Player player)
- V refreshHologram(Collection<Player> players)
- int getEntityId()
- boolean isViewer(Player player)
- boolean isViewer(UUID player)
- void queueUpdate()
- void createHologram()
- HologramData getData()

### Class: de.oliver.fancyholograms.api.hologram.HologramType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- TEXT
- ITEM
- BLOCK

Methods:
- **static** HologramType valueOf(String name)
- **static** HologramType[] values()
- **static** HologramType getByName(String name)
- List<String> getCommands()

