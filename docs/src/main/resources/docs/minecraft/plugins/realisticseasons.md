# RealisticSeasons API

Adds real seasons (spring, summer, fall, winter) to Minecraft worlds with temperature, calendar, biome color changes, and seasonal particles. Requires `RealisticSeasons` as a `depend` or `softdepend` in plugin.yml.

## Getting the API

```java
import me.casperge.realisticseasons.api.SeasonsAPI;

SeasonsAPI api = SeasonsAPI.getInstance();
```

## Get and Set Season

```java
import me.casperge.realisticseasons.api.SeasonsAPI;
import me.casperge.realisticseasons.season.Season;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class SeasonExample {

    public void checkSeason(Player player) {
        SeasonsAPI api = SeasonsAPI.getInstance();
        World world = player.getWorld();

        // Get current season
        Season season = api.getSeason(world);

        // Set season (also updates the date)
        api.setSeason(world, Season.WINTER);

        // Season enum values: SPRING, SUMMER, FALL, WINTER
        if (season == Season.SUMMER) {
            player.sendMessage("It's summer!");
        }
    }
}
```

## Date and Calendar

Use the RealisticSeasons Date class, NOT java.util.Date.

```java
import me.casperge.realisticseasons.api.SeasonsAPI;
import me.casperge.realisticseasons.api.Date;
import org.bukkit.World;

public class DateExample {

    public void dateOperations(World world) {
        SeasonsAPI api = SeasonsAPI.getInstance();

        // Get current date
        Date date = api.getDate(world);

        // Set date (day, month, year) - may update season
        api.setDate(world, new Date(1, 1, 2022));

        // Time queries
        int hours = api.getHours(world);
        int minutes = api.getMinutes(world);
        int seconds = api.getSeconds(world);

        // Calendar names (from calendar.yml config)
        String dayName = api.getDayOfWeek(world);
        String monthName = api.getCurrentMonthName(world);
    }
}
```

## Temperature

```java
import me.casperge.realisticseasons.api.SeasonsAPI;
import me.casperge.realisticseasons.api.TemperatureEffect;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class TemperatureExample {

    public void temperatureOperations(Player player) {
        SeasonsAPI api = SeasonsAPI.getInstance();

        // Get player body temperature
        int bodyTemp = api.getTemperature(player);

        // Get air temperature at a location
        Location loc = player.getLocation();
        int airTemp = api.getAirTemperature(loc);

        // Apply timed temperature modifier (modifier amount, duration seconds)
        api.applyTimedTemperatureEffect(player, -10, 60); // cool down for 60s

        // Apply permanent temperature modifier (persists until cancelled, not across restarts)
        TemperatureEffect effect = api.applyPermanentTemperatureEffect(player, 15);

        // Remove the permanent effect
        effect.cancel();

        // Check modifier value
        int modifier = effect.getModifier();
    }
}
```

## Listen for Season Changes

```java
import me.casperge.realisticseasons.api.SeasonChangeEvent;
import me.casperge.realisticseasons.season.Season;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class SeasonListener implements Listener {

    @EventHandler
    public void onSeasonChange(SeasonChangeEvent event) {
        World world = event.getWorld();
        Season oldSeason = event.getOldSeason();
        Season newSeason = event.getNewSeason();

        // Cancel the season change
        // event.setCancelled(true);
    }
}
```

## Listen for Day Changes

```java
import me.casperge.realisticseasons.api.DayChangeEvent;
import me.casperge.realisticseasons.api.Date;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class DayListener implements Listener {

    @EventHandler
    public void onDayChange(DayChangeEvent event) {
        Date from = event.getFrom();
        Date to = event.getTo();
        World world = event.getWorld();
    }
}
```

## Season Particle Events

```java
import me.casperge.realisticseasons.api.SeasonParticleStartEvent;
import me.casperge.realisticseasons.api.SeasonParticle;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ParticleListener implements Listener {

    @EventHandler
    public void onParticle(SeasonParticleStartEvent event) {
        Player player = event.getPlayer();
        Location loc = event.getLocation();
        SeasonParticle type = event.getParticleType();

        // SeasonParticle values: FIREFLY, SHOOTING_STAR, FALLING_LEAF,
        //                        SMALL_FALLING_LEAF, COLD_BREATH

        // Cancel specific particles
        if (type == SeasonParticle.COLD_BREATH) {
            event.setCancelled(true);
        }
    }
}
```

## Custom Season Events

```java
import me.casperge.realisticseasons.api.SeasonEventStart;
import me.casperge.realisticseasons.api.SeasonEventEnd;
import me.casperge.realisticseasons.api.SeasonsAPI;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import java.util.List;

public class CustomEventListener implements Listener {

    @EventHandler
    public void onEventStart(SeasonEventStart event) {
        World world = event.getWorld();
        String eventName = event.getCustomEvent().getName();
        boolean showsInList = event.getCustomEvent().doDisplay();

        // Cancel the event from starting
        // event.setCancelled(true);
    }

    @EventHandler
    public void onEventEnd(SeasonEventEnd event) {
        World world = event.getWorld();
        String eventName = event.getCustomEvent().getName();
    }

    public void checkActiveEvents(World world) {
        SeasonsAPI api = SeasonsAPI.getInstance();
        List<String> active = api.getActiveEvents(world);
    }
}
```

## Chunk Refresh Event

```java
import me.casperge.realisticseasons.api.SeasonRefreshChunkEvent;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChunkListener implements Listener {

    @EventHandler
    public void onChunkRefresh(SeasonRefreshChunkEvent event) {
        Chunk chunk = event.getChunk();
        Player player = event.getPlayer();

        // Cancel chunk seasonal refresh
        // event.setCancelled(true);
    }
}
```

## Seasonal Biome Colors

```java
import me.casperge.realisticseasons.api.SeasonsAPI;
import me.casperge.realisticseasons.api.SeasonBiome;
import me.casperge.realisticseasons.season.Season;
import org.bukkit.Location;
import org.bukkit.block.Biome;

public class BiomeExample {

    public void getBiomeColors(Location loc) {
        SeasonsAPI api = SeasonsAPI.getInstance();

        // Three ways to get seasonal biome data
        SeasonBiome biome = api.getReplacementSeasonBiome(loc, Season.WINTER);
        // or: api.getReplacementSeasonBiome("minecraft:plains", Season.WINTER);
        // or: api.getReplacementSeasonBiome(Biome.PLAINS, Season.WINTER);

        // All return hex color strings
        String fogColor = biome.getFogColorHex();
        String waterColor = biome.getWaterColoHex();    // note: typo in API, no 'r'
        String waterFogColor = biome.getWaterFogColorHex();
        String skyColor = biome.getSkyColorHex();
        String grassColor = biome.getGrassColorHex();
        String[] foliageColors = biome.getFoliageColorsHex();

        Season season = biome.getSeason();
        String originalBiome = biome.getOriginalBiome();
    }
}
```

## API Reference

### me.casperge.realisticseasons.api.SeasonsAPI
- `static SeasonsAPI getInstance()`
- `Season getSeason(World)`
- `void setSeason(World, Season)`
- `Date getDate(World)`
- `void setDate(World, Date)`
- `int getHours(World)`
- `int getMinutes(World)`
- `int getSeconds(World)`
- `String getDayOfWeek(World)`
- `String getCurrentMonthName(World)`
- `int getTemperature(Player)`
- `int getAirTemperature(Location)`
- `void applyTimedTemperatureEffect(Player, int modifier, int seconds)`
- `TemperatureEffect applyPermanentTemperatureEffect(Player, int modifier)`
- `List<String> getActiveEvents(World)`
- `SeasonBiome getReplacementSeasonBiome(Biome, Season)`
- `SeasonBiome getReplacementSeasonBiome(String biomeName, Season)`
- `SeasonBiome getReplacementSeasonBiome(Location, Season)`

### me.casperge.realisticseasons.season.Season (Enum)
`SPRING`, `SUMMER`, `FALL`, `WINTER`

### me.casperge.realisticseasons.api.TemperatureEffect (Interface)
- `void cancel()`
- `int getModifier()`

### me.casperge.realisticseasons.api.SeasonChangeEvent extends Event implements Cancellable
- `Season getNewSeason()`
- `Season getOldSeason()`
- `World getWorld()`

### me.casperge.realisticseasons.api.DayChangeEvent extends Event
- `Date getFrom()`
- `Date getTo()`
- `World getWorld()`

### me.casperge.realisticseasons.api.SeasonParticleStartEvent extends Event implements Cancellable
- `Player getPlayer()`
- `Location getLocation()`
- `SeasonParticle getParticleType()`

### me.casperge.realisticseasons.api.SeasonParticle (Enum)
`FIREFLY`, `SHOOTING_STAR`, `FALLING_LEAF`, `SMALL_FALLING_LEAF`, `COLD_BREATH`

### me.casperge.realisticseasons.api.SeasonEventStart extends Event implements Cancellable
- `World getWorld()`
- `SeasonCustomEvent getCustomEvent()`

### me.casperge.realisticseasons.api.SeasonEventEnd extends Event
- `World getWorld()`
- `SeasonCustomEvent getCustomEvent()`

### me.casperge.realisticseasons.api.SeasonRefreshChunkEvent extends Event implements Cancellable
- `Chunk getChunk()`
- `Player getPlayer()`

### me.casperge.realisticseasons.api.SeasonBiome
- `Season getSeason()`
- `String getOriginalBiome()`
- `String getFogColorHex()`
- `String getWaterColoHex()`
- `String getWaterFogColorHex()`
- `String getSkyColorHex()`
- `String getGrassColorHex()`
- `String[] getFoliageColorsHex()`

### me.casperge.realisticseasons.api.Date
- `Date(int day, int month, int year)`
