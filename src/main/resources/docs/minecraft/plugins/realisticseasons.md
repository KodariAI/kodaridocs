# RealisticSeasons-11.10.1-me-casperge-realisticseasons-api API Reference

**Package Filter:** `me.casperge.realisticseasons.api`

## Package: me.casperge.realisticseasons.api

### Class: me.casperge.realisticseasons.api.TemperatureEffect
Type: Interface

Methods:
- void cancel()
- int getModifier()

### Class: me.casperge.realisticseasons.api.CustomBiomeFileLoader
Type: Class

Methods:
- **static** List<CustomWorldGenerator> getActiveGenerators()
- **static** void writeFiles(CustomWorldGenerator)
- **static** List<CustomWorldGenerator> getAlreadyInstalledGenerators()

### Class: me.casperge.realisticseasons.api.CustomWorldGenerator
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- TERRALITH_2

Methods:
- **static** boolean isKnownBiome(String)
- **static** boolean isWorldGenerator(String)
- String getResourceFolderName()
- **static** CustomWorldGenerator valueOf(String)
- **static** List<String> getAllGenerators()
- **static** CustomWorldGenerator fromBiome(String)
- String getDetectionBiome()
- **static** CustomWorldGenerator[] values()
- String toString()
- **static** CustomWorldGenerator fromFile(String)

### Class: me.casperge.realisticseasons.api.MMobs
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- MMobs(RealisticSeasons main)

Methods:
- void onMythicConditionLoad(MythicConditionLoadEvent)

### Class: me.casperge.realisticseasons.api.PAPI
Type: Class
Extends: me.clip.placeholderapi.expansion.PlaceholderExpansion

Constructors:
- PAPI(RealisticSeasons main)

Methods:
- String getVersion()
- boolean canRegister()
- String onRequest(OfflinePlayer, String)
- String getAuthor()
- String getIdentifier()
- boolean persist()
- String setPlaceHolders(Player, String)

### Class: me.casperge.realisticseasons.api.SeasonBiome
Type: Class

Constructors:
- SeasonBiome(Season season, String originalBiome, String fogColor, String waterColor, String waterFogColor, String skyColor, String grassColor, String[] foliageColor)

Methods:
- String[] getFoliageColorsHex()
- String getFogColorHex()
- String getWaterColoHex()
- Season getSeason()
- String getOriginalBiome()
- String getWaterFogColorHex()
- String getGrassColorHex()
- String getSkyColorHex()

### Class: me.casperge.realisticseasons.api.SeasonChangeEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- SeasonChangeEvent(World world, Season newSeason, Season oldSeason)

Methods:
- Season getOldSeason()
- World getWorld()
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- Season getNewSeason()

### Class: me.casperge.realisticseasons.api.SeasonCondition
Type: Class
Implements: io.lumine.mythic.api.skills.conditions.IEntityCondition

Constructors:
- SeasonCondition(MythicLineConfig seasons, RealisticSeasons main)

Methods:
- boolean check(AbstractEntity)

### Class: me.casperge.realisticseasons.api.SeasonEventEnd
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- SeasonEventEnd(World world, SeasonCustomEvent e)

Methods:
- World getWorld()
- SeasonCustomEvent getCustomEvent()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.casperge.realisticseasons.api.SeasonEventStart
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- SeasonEventStart(World world, SeasonCustomEvent e)

Methods:
- World getWorld()
- boolean isCancelled()
- SeasonCustomEvent getCustomEvent()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()

### Class: me.casperge.realisticseasons.api.SeasonParticle
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FIREFLY
- SHOOTING_STAR
- FALLING_LEAF
- SMALL_FALLING_LEAF
- COLD_BREATH

Methods:
- **static** SeasonParticle valueOf(String)
- **static** SeasonParticle[] values()

### Class: me.casperge.realisticseasons.api.SeasonParticleStartEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- SeasonParticleStartEvent(Location loc, Player p, SeasonParticle particle)

Methods:
- Location getLocation()
- Player getPlayer()
- boolean isCancelled()
- SeasonParticle getParticleType()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()

### Class: me.casperge.realisticseasons.api.SeasonsAPI
Type: Class

Constructors:
- SeasonsAPI(RealisticSeasons main)

Methods:
- void setSeason(World, Season)
- Season getSeason(World)
- List<String> getActiveEvents(World)
- int getMinutes(World)
- SeasonBiome getReplacementSeasonBiome(Biome, Season)
- SeasonBiome getReplacementSeasonBiome(String, Season)
- SeasonBiome getReplacementSeasonBiome(Location, Season)
- int getAirTemperature(Location)
- int getHours(World)
- int getSeconds(World)
- String getDayOfWeek(World)
- void applyTimedTemperatureEffect(Player, int, int)
- String getCurrentMonthName(World)
- TemperatureEffect applyPermanentTemperatureEffect(Player, int)
- void setDate(World, Date)
- Date getDate(World)
- **static** SeasonsAPI getInstance()
- int getTemperature(Player)

## Package: me.casperge.realisticseasons.api.landplugins

### Class: me.casperge.realisticseasons.api.landplugins.LandPlugin
Type: Interface

Methods:
- Integer getTemperatureModifier(int, int, World)
- boolean hasSeasonEffects(int, int, World)
- boolean hasBlockChanges(int, int, World)
- Integer getPermanentTemperature(int, int, World)
- Priority getPriority()
- boolean hasMobSpawns(int, int, World)
- Season getPermanentSeason(int, int, World)

### Class: me.casperge.realisticseasons.api.landplugins.Factions
Type: Class
Implements: me.casperge.realisticseasons.api.landplugins.LandPlugin

Constructors:
- Factions(RealisticSeasons main)

Methods:
- Integer getTemperatureModifier(int, int, World)
- boolean hasSeasonEffects(int, int, World)
- boolean hasBlockChanges(int, int, World)
- Integer getPermanentTemperature(int, int, World)
- Priority getPriority()
- boolean hasMobSpawns(int, int, World)
- Season getPermanentSeason(int, int, World)

### Class: me.casperge.realisticseasons.api.landplugins.GriefPrevention
Type: Class
Implements: me.casperge.realisticseasons.api.landplugins.LandPlugin

Constructors:
- GriefPrevention(RealisticSeasons main)

Methods:
- Integer getTemperatureModifier(int, int, World)
- boolean hasSeasonEffects(int, int, World)
- boolean hasBlockChanges(int, int, World)
- Integer getPermanentTemperature(int, int, World)
- Priority getPriority()
- boolean hasMobSpawns(int, int, World)
- Season getPermanentSeason(int, int, World)

### Class: me.casperge.realisticseasons.api.landplugins.Lands
Type: Class
Implements: me.casperge.realisticseasons.api.landplugins.LandPlugin

Constructors:
- Lands(RealisticSeasons main)

Methods:
- Integer getTemperatureModifier(int, int, World)
- boolean hasSeasonEffects(int, int, World)
- boolean hasBlockChanges(int, int, World)
- Integer getPermanentTemperature(int, int, World)
- Priority getPriority()
- boolean hasMobSpawns(int, int, World)
- Season getPermanentSeason(int, int, World)

### Class: me.casperge.realisticseasons.api.landplugins.Priority
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LOWEST
- LOW
- MEDIUM
- HIGH
- HIGHEST

Methods:
- boolean isHigherThan(Priority)
- int intValue()
- **static** Priority valueOf(String)
- **static** Priority[] values()

### Class: me.casperge.realisticseasons.api.landplugins.WGSeason
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SUMMER
- WINTER
- FALL
- SPRING

Methods:
- **static** WGSeason valueOf(String)
- **static** WGSeason[] values()
- **static** Season getRSSeason(WGSeason)

### Class: me.casperge.realisticseasons.api.landplugins.WGuard
Type: Class
Implements: me.casperge.realisticseasons.api.landplugins.LandPlugin

Constructors:
- WGuard(RealisticSeasons main)

Methods:
- Integer getTemperatureModifier(int, int, World)
- boolean hasSeasonEffects(int, int, World)
- boolean hasBlockChanges(int, int, World)
- Integer getPermanentTemperature(int, int, World)
- Priority getPriority()
- boolean hasMobSpawns(int, int, World)
- Season getPermanentSeason(int, int, World)

## Package: me.casperge.realisticseasons.api.maps

### Class: me.casperge.realisticseasons.api.maps.MapPlugin
Type: Interface

Methods:
- boolean isFullRenderPause(World)
- void setFullRenderPause(boolean, World)

### Class: me.casperge.realisticseasons.api.maps.BMap
Type: Class
Implements: me.casperge.realisticseasons.api.maps.MapPlugin

Constructors:
- BMap(RealisticSeasons main)

Methods:
- boolean isFullRenderPause(World)
- void setFullRenderPause(boolean, World)

### Class: me.casperge.realisticseasons.api.maps.DMap
Type: Class
Implements: me.casperge.realisticseasons.api.maps.MapPlugin

Constructors:
- DMap(RealisticSeasons dynmapAPI)

Methods:
- boolean isFullRenderPause(World)
- void setFullRenderPause(boolean, World)

