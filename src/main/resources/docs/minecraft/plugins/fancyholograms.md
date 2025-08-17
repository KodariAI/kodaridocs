# FancyHolograms-2.7.0-de-oliver-fancyholograms-api API Reference

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
- Collection getHolograms()
- Collection getPersistentHolograms()
- Optional getHologram(String)
- void saveHolograms()
- Hologram create(HologramData)
- void removeHologram(Hologram)
- void loadHolograms()

### Class: de.oliver.fancyholograms.api.HologramStorage
Type: Interface

Methods:
- void saveBatch(Collection, boolean)
- void save(Hologram)
- Collection loadAll()
- Collection loadAll(String)
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

Methods:
- Material getBlock()
- boolean read(ConfigurationSection, String)
- BlockHologramData setBlock(Material)
- BlockHologramData copy(String)
- DisplayHologramData copy(String)
- HologramData copy(String)
- boolean write(ConfigurationSection, String)

### Class: de.oliver.fancyholograms.api.data.DisplayHologramData
Type: Class
Extends: de.oliver.fancyholograms.api.data.HologramData

Methods:
- boolean read(ConfigurationSection, String)
- Display$Brightness getBrightness()
- DisplayHologramData setScale(Vector3f)
- DisplayHologramData setShadowRadius(float)
- DisplayHologramData setBillboard(Display$Billboard)
- Display$Billboard getBillboard()
- DisplayHologramData setTranslation(Vector3f)
- int getInterpolationDuration()
- DisplayHologramData setInterpolationDuration(int)
- DisplayHologramData setShadowStrength(float)
- DisplayHologramData setBrightness(Display$Brightness)
- Vector3f getScale()
- float getShadowStrength()
- DisplayHologramData copy(String)
- HologramData copy(String)
- float getShadowRadius()
- Vector3f getTranslation()
- boolean write(ConfigurationSection, String)

### Class: de.oliver.fancyholograms.api.data.HologramData
Type: Class
Implements: de.oliver.fancyholograms.api.data.YamlData

Methods:
- Location getLocation()
- boolean read(ConfigurationSection, String)
- String getName()
- int getVisibilityDistance()
- boolean hasChanges()
- HologramData setPersistent(boolean)
- HologramData setVisibilityDistance(int)
- HologramData setVisibility(Visibility)
- String getLinkedNpcName()
- HologramData setLinkedNpcName(String)
- HologramData setLocation(Location)
- HologramType getType()
- boolean isPersistent()
- HologramData copy(String)
- boolean write(ConfigurationSection, String)
- Visibility getVisibility()
- void setHasChanges(boolean)

### Class: de.oliver.fancyholograms.api.data.ItemHologramData
Type: Class
Extends: de.oliver.fancyholograms.api.data.DisplayHologramData

Methods:
- boolean read(ConfigurationSection, String)
- ItemHologramData copy(String)
- DisplayHologramData copy(String)
- HologramData copy(String)
- ItemHologramData setItemStack(ItemStack)
- ItemStack getItemStack()
- boolean write(ConfigurationSection, String)

### Class: de.oliver.fancyholograms.api.data.TextHologramData
Type: Class
Extends: de.oliver.fancyholograms.api.data.DisplayHologramData

Methods:
- boolean isSeeThrough()
- TextDisplay$TextAlignment getTextAlignment()
- boolean read(ConfigurationSection, String)
- TextHologramData setSeeThrough(boolean)
- List getText()
- TextHologramData setTextUpdateInterval(int)
- TextHologramData setTextAlignment(TextDisplay$TextAlignment)
- TextHologramData setBackground(Color)
- boolean hasTextShadow()
- void removeLine(int)
- void addLine(String)
- TextHologramData setTextShadow(boolean)
- TextHologramData copy(String)
- DisplayHologramData copy(String)
- HologramData copy(String)
- boolean write(ConfigurationSection, String)
- int getTextUpdateInterval()
- Color getBackground()
- TextHologramData setText(List)

## Package: de.oliver.fancyholograms.api.data.property

### Class: de.oliver.fancyholograms.api.data.property.Visibility$VisibilityPredicate
Type: Interface

Methods:
- boolean canSee(Player, Hologram)

### Class: de.oliver.fancyholograms.api.data.property.Visibility
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Visibility valueOf(String)
- **static** Optional byString(String)
- **static** Visibility[] values()
- boolean canSee(Player, Hologram)

### Class: de.oliver.fancyholograms.api.data.property.Visibility$ManualVisibility
Type: Class

Methods:
- **static** void removeDistantViewer(Hologram, UUID)
- **static** void removeDistantViewer(String, UUID)
- **static** void addDistantViewer(Hologram, UUID)
- **static** void addDistantViewer(String, UUID)
- **static** void clear()
- **static** boolean canSee(Player, Hologram)
- **static** void remove(Hologram)
- **static** void remove(String)

## Package: de.oliver.fancyholograms.api.events

### Class: de.oliver.fancyholograms.api.events.HologramCreateEvent
Type: Class
Extends: de.oliver.fancyholograms.api.events.HologramEvent

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancyholograms.api.events.HologramDeleteEvent
Type: Class
Extends: de.oliver.fancyholograms.api.events.HologramEvent

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
- void setCancelled(boolean)
- Hologram getHologram()

### Class: de.oliver.fancyholograms.api.events.HologramHideEvent
Type: Class
Extends: de.oliver.fancyholograms.api.events.HologramEvent

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancyholograms.api.events.HologramShowEvent
Type: Class
Extends: de.oliver.fancyholograms.api.events.HologramEvent

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancyholograms.api.events.HologramUpdateEvent
Type: Class
Extends: de.oliver.fancyholograms.api.events.HologramEvent

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

Methods:
- **static** HologramUpdateEvent$HologramModification valueOf(String)
- **static** HologramUpdateEvent$HologramModification[] values()

### Class: de.oliver.fancyholograms.api.events.HologramsLoadedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- ImmutableList getManager()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: de.oliver.fancyholograms.api.events.HologramsUnloadedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- ImmutableList getManager()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: de.oliver.fancyholograms.api.hologram

### Class: de.oliver.fancyholograms.api.hologram.Hologram
Type: Abstract Class

Methods:
- Display getDisplayEntity()
- boolean meetsVisibilityConditions(Player)
- void forceHideHologram(Player)
- void showHologram(Collection)
- void showHologram(Player)
- String getName()
- void deleteHologram()
- void updateShownStateFor(Player)
- void refreshForViewers()
- void updateHologram()
- void refreshForViewersInWorld()
- Set getViewers()
- void forceUpdate()
- void hideHologram(Collection)
- void hideHologram(Player)
- void forceShowHologram(Player)
- void forceUpdateShownStateFor(Player)
- int hashCode()
- boolean equals(Object)
- Component getShownText(Player)
- boolean isWithinVisibilityDistance(Player)
- void refreshHologram(Player)
- void refreshHologram(Collection)
- int getEntityId()
- boolean isViewer(Player)
- boolean isViewer(UUID)
- void queueUpdate()
- void createHologram()
- HologramData getData()

### Class: de.oliver.fancyholograms.api.hologram.HologramType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** HologramType valueOf(String)
- **static** HologramType[] values()
- **static** HologramType getByName(String)
- List getCommands()

