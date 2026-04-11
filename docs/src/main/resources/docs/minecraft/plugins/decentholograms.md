# DecentHolograms API Reference

Packet-based hologram plugin with multi-page support, animations, click actions, and per-player visibility. The API lets plugins create, move, update, and delete holograms, manage pages and lines (text, items, heads, entities), handle click events, and control per-player visibility. Add `DecentHolograms` to `depend` or `softdepend` in plugin.yml.

> **Note:** The wiki has some inaccuracies. This doc is verified against the actual source code. Key differences: `HologramClickEvent` uses `getClick()` not `getClickType()`, and `getPage()` not `getHologramPage()`. All indices are 0-based.

## Code Examples

### Create a Hologram

```java
import eu.decentsoftware.holograms.api.DHAPI;
import eu.decentsoftware.holograms.api.holograms.Hologram;
import org.bukkit.Location;

import java.util.Arrays;
import java.util.List;

// Simple hologram (non-persistent, not saved to file)
Hologram holo = DHAPI.createHologram("my_hologram", location);

// With initial lines
List<String> lines = Arrays.asList("&6Welcome!", "&7Line two", "&aLine three");
Hologram holo = DHAPI.createHologram("my_hologram", location, lines);

// Persistent (saved to YAML file, survives restarts)
Hologram holo = DHAPI.createHologram("my_hologram", location, true, lines);
```

### Get an Existing Hologram

```java
import eu.decentsoftware.holograms.api.DHAPI;
import eu.decentsoftware.holograms.api.holograms.Hologram;

Hologram holo = DHAPI.getHologram("my_hologram"); // null if not found
```

### Move a Hologram

```java
import eu.decentsoftware.holograms.api.DHAPI;
import org.bukkit.Location;

DHAPI.moveHologram("my_hologram", newLocation);

// Or with a Hologram object
DHAPI.moveHologram(hologram, newLocation);
```

### Delete a Hologram

```java
import eu.decentsoftware.holograms.api.DHAPI;

DHAPI.removeHologram("my_hologram"); // deletes hologram and its file
```

### Add, Insert, Set, and Remove Lines

```java
import eu.decentsoftware.holograms.api.DHAPI;
import eu.decentsoftware.holograms.api.holograms.Hologram;
import eu.decentsoftware.holograms.api.holograms.HologramLine;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

Hologram holo = DHAPI.getHologram("my_hologram");

// Add a text line to the first page
HologramLine line = DHAPI.addHologramLine(holo, "&eNew line!");

// Add an item line (displays floating item)
DHAPI.addHologramLine(holo, Material.DIAMOND);
DHAPI.addHologramLine(holo, new ItemStack(Material.DIAMOND_SWORD));

// Add line to a specific page (0-based)
DHAPI.addHologramLine(holo, 1, "&7Page 2 line");

// Insert a line at a specific index (shifts others down)
DHAPI.insertHologramLine(holo, 0, "&cInserted at top!");
DHAPI.insertHologramLine(holo, 1, 0, "&cInserted on page 2");

// Update an existing line's content
DHAPI.setHologramLine(holo, 0, "&aUpdated first line");
DHAPI.setHologramLine(holo, 1, 0, "&aUpdated page 2 first line");

// Replace all lines on a page at once
DHAPI.setHologramLines(holo, Arrays.asList("&6Line 1", "&7Line 2", "&8Line 3"));
DHAPI.setHologramLines(holo, 1, Arrays.asList("&6Page 2 Line 1"));

// Remove a line (returns the removed line, or null)
HologramLine removed = DHAPI.removeHologramLine(holo, 0);
DHAPI.removeHologramLine(holo, 1, 0); // page 1, line 0
```

### Line Content Formats

```java
import eu.decentsoftware.holograms.api.DHAPI;
import eu.decentsoftware.holograms.api.holograms.Hologram;

Hologram holo = DHAPI.getHologram("my_hologram");

// Text line (supports color codes, PlaceholderAPI, animations)
DHAPI.addHologramLine(holo, "&6Hello %player_name%!");

// Item/icon line (prefix with #ICON:)
DHAPI.addHologramLine(holo, "#ICON: DIAMOND_SWORD");

// Player head line (prefix with #HEAD:)
DHAPI.addHologramLine(holo, "#HEAD: Notch");

// Small head line (prefix with #SMALLHEAD:)
DHAPI.addHologramLine(holo, "#SMALLHEAD: Notch");

// Entity line (prefix with #ENTITY:)
DHAPI.addHologramLine(holo, "#ENTITY: ZOMBIE");
```

### Page Management

```java
import eu.decentsoftware.holograms.api.DHAPI;
import eu.decentsoftware.holograms.api.holograms.Hologram;
import eu.decentsoftware.holograms.api.holograms.HologramPage;

import java.util.Arrays;

Hologram holo = DHAPI.getHologram("my_hologram");

// Add a new page (with default content)
HologramPage page = DHAPI.addHologramPage(holo);

// Add a page with preset lines
HologramPage page = DHAPI.addHologramPage(holo, Arrays.asList("&6Page Title", "&7Description"));

// Insert a page at a specific index
HologramPage page = DHAPI.insertHologramPage(holo, 0, Arrays.asList("&6Inserted page"));

// Remove a page (returns removed page, or null)
HologramPage removed = DHAPI.removeHologramPage(holo, 1);

// Get a page
HologramPage firstPage = DHAPI.getHologramPage(holo, 0);

// Get page count
int pageCount = holo.size();

// Show a specific page to a player
holo.show(player, 1); // show page 1

// Get what page a player is viewing
int playerPage = holo.getPlayerPage(player);
```

### Per-Player Visibility

```java
import eu.decentsoftware.holograms.api.holograms.Hologram;
import eu.decentsoftware.holograms.api.DHAPI;
import org.bukkit.entity.Player;

Hologram holo = DHAPI.getHologram("my_hologram");

// Show to all players in range
holo.showAll();

// Hide from all players
holo.hideAll();

// Hide from a specific player
holo.hide(player);

// Permanently hide from a player (persists until removed)
holo.setHidePlayer(player);
holo.removeHidePlayer(player);
boolean isHidden = holo.isHideState(player);

// Show-only mode (only players in show list can see it)
holo.setShowPlayer(player);
holo.removeShowPlayer(player);
boolean isInShowList = holo.isShowState(player);

// Force update for all viewers
holo.updateAll();
DHAPI.updateHologram("my_hologram");

// Enable/disable hologram
holo.enable();
holo.disable(eu.decentsoftware.holograms.api.holograms.DisableCause.API);
```

### Hologram Flags

```java
import eu.decentsoftware.holograms.api.holograms.Hologram;
import eu.decentsoftware.holograms.api.holograms.enums.EnumFlag;
import eu.decentsoftware.holograms.api.DHAPI;

Hologram holo = DHAPI.getHologram("my_hologram");

// Disable placeholders on this hologram
holo.addFlag(EnumFlag.DISABLE_PLACEHOLDERS);

// Disable auto-updating
holo.addFlag(EnumFlag.DISABLE_UPDATING);

// Disable animations
holo.addFlag(EnumFlag.DISABLE_ANIMATIONS);

// Disable click actions
holo.addFlag(EnumFlag.DISABLE_ACTIONS);

// Remove a flag
holo.removeFlag(EnumFlag.DISABLE_PLACEHOLDERS);

// Check flag
boolean hasFlag = holo.hasFlag(EnumFlag.DISABLE_UPDATING);
```

### Listen for Hologram Clicks

```java
import eu.decentsoftware.holograms.event.HologramClickEvent;
import eu.decentsoftware.holograms.api.actions.ClickType;
import eu.decentsoftware.holograms.api.holograms.Hologram;
import eu.decentsoftware.holograms.api.holograms.HologramPage;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class HologramListener implements Listener {

    @EventHandler
    public void onHologramClick(HologramClickEvent event) {
        // Cancellable
        Player player = event.getPlayer();
        Hologram hologram = event.getHologram();
        HologramPage page = event.getPage();          // NOT getHologramPage()
        ClickType clickType = event.getClick();         // NOT getClickType()
        int entityId = event.getEntityId();

        if (hologram.getName().equals("shop_hologram")) {
            if (clickType == ClickType.RIGHT) {
                player.sendMessage("Opening shop...");
            }
            event.setCancelled(true); // prevent default actions
        }
    }
}
```

### Listen for Hologram Lifecycle Events

```java
import eu.decentsoftware.holograms.event.HologramEnableEvent;
import eu.decentsoftware.holograms.event.HologramDisableEvent;
import eu.decentsoftware.holograms.event.HologramRegisterEvent;
import eu.decentsoftware.holograms.event.HologramUnregisterEvent;
import eu.decentsoftware.holograms.event.DecentHologramsReloadEvent;
import eu.decentsoftware.holograms.api.holograms.Hologram;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class HologramLifecycleListener implements Listener {

    @EventHandler
    public void onEnable(HologramEnableEvent event) {
        Hologram holo = event.getHologram();
    }

    @EventHandler
    public void onDisable(HologramDisableEvent event) {
        Hologram holo = event.getHologram();
    }

    @EventHandler
    public void onRegister(HologramRegisterEvent event) {
        Hologram holo = event.getHologram();
    }

    @EventHandler
    public void onUnregister(HologramUnregisterEvent event) {
        Hologram holo = event.getHologram();
    }

    @EventHandler
    public void onReload(DecentHologramsReloadEvent event) {
        // Plugin was reloaded via /dh reload
    }
}
```

### Query All Holograms

```java
import eu.decentsoftware.holograms.api.holograms.Hologram;

import java.util.Collection;
import java.util.Set;

// All cached hologram names
Set<String> names = Hologram.getCachedHologramNames();

// All cached holograms
Collection<Hologram> all = Hologram.getCachedHolograms();

// Get by name
Hologram holo = Hologram.getCachedHologram("my_hologram");
```

### Full Plugin Example

```java
import eu.decentsoftware.holograms.api.DHAPI;
import eu.decentsoftware.holograms.api.holograms.Hologram;
import eu.decentsoftware.holograms.event.HologramClickEvent;
import eu.decentsoftware.holograms.api.actions.ClickType;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class MyPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Clean up non-persistent holograms
        DHAPI.removeHologram("welcome_holo");
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String name = "welcome_" + player.getName();

        // Create a personal hologram above the player
        Location loc = player.getLocation().add(0, 3, 0);
        Hologram holo = DHAPI.createHologram(name, loc, Arrays.asList(
                "&6Welcome back, " + player.getName() + "!",
                "&7Enjoy your stay"
        ));

        // Only visible to this player
        holo.setShowPlayer(player);

        // Remove after 5 seconds
        getServer().getScheduler().runTaskLater(this, () -> {
            DHAPI.removeHologram(name);
        }, 100L);
    }

    @EventHandler
    public void onClick(HologramClickEvent event) {
        if (event.getHologram().getName().startsWith("welcome_")) {
            event.setCancelled(true);
        }
    }
}
```

## API Reference (Trimmed)

### `eu.decentsoftware.holograms.api.DHAPI` (static utility)

**Create/Delete:**

| Return | Method | Description |
|---|---|---|
| `Hologram` | `createHologram(String name, Location loc)` | Non-persistent hologram |
| `Hologram` | `createHologram(String name, Location loc, boolean save)` | Optionally persistent |
| `Hologram` | `createHologram(String name, Location loc, List<String> lines)` | With initial lines |
| `Hologram` | `createHologram(String name, Location loc, boolean save, List<String> lines)` | Full options |
| `void` | `removeHologram(String name)` | Delete hologram and file |
| `Hologram` | `getHologram(String name)` | Get by name (null if not found) |
| `void` | `moveHologram(String name, Location loc)` | Move by name |
| `void` | `moveHologram(Hologram holo, Location loc)` | Move by object |
| `void` | `updateHologram(String name)` | Force update |

**Lines (add/insert/set/remove):**

| Return | Method | Description |
|---|---|---|
| `HologramLine` | `addHologramLine(Hologram, String)` | Add text to page 0 |
| `HologramLine` | `addHologramLine(Hologram, int page, String)` | Add text to specific page |
| `HologramLine` | `addHologramLine(Hologram, Material)` | Add item to page 0 |
| `HologramLine` | `addHologramLine(Hologram, ItemStack)` | Add ItemStack to page 0 |
| `HologramLine` | `insertHologramLine(Hologram, int line, String)` | Insert on page 0 |
| `HologramLine` | `insertHologramLine(Hologram, int page, int line, String)` | Insert on specific page |
| `void` | `setHologramLine(Hologram, int line, String)` | Set content on page 0 |
| `void` | `setHologramLine(Hologram, int page, int line, String)` | Set content on specific page |
| `void` | `setHologramLines(Hologram, List<String>)` | Replace all lines on page 0 |
| `void` | `setHologramLines(Hologram, int page, List<String>)` | Replace all lines on page |
| `HologramLine` | `removeHologramLine(Hologram, int line)` | Remove from page 0 |
| `HologramLine` | `removeHologramLine(Hologram, int page, int line)` | Remove from page |

**Pages:**

| Return | Method | Description |
|---|---|---|
| `HologramPage` | `addHologramPage(Hologram)` | Add blank page |
| `HologramPage` | `addHologramPage(Hologram, List<String>)` | Add page with lines |
| `HologramPage` | `insertHologramPage(Hologram, int index)` | Insert blank page |
| `HologramPage` | `insertHologramPage(Hologram, int index, List<String>)` | Insert page with lines |
| `HologramPage` | `removeHologramPage(Hologram, int index)` | Remove page |
| `HologramPage` | `getHologramPage(Hologram, int index)` | Get page |

### `eu.decentsoftware.holograms.api.holograms.Hologram`

| Return | Method | Description |
|---|---|---|
| `String` | `getName()` | Hologram name |
| `Location` | `getLocation()` | Location |
| `void` | `setLocation(Location)` | Set location |
| `int` | `size()` | Page count |
| `HologramPage` | `getPage(int index)` | Get page by index |
| `HologramPage` | `getPage(Player)` | Page shown to player |
| `HologramPage` | `addPage()` | Add blank page |
| `HologramPage` | `insertPage(int index)` | Insert page |
| `HologramPage` | `removePage(int index)` | Remove page |
| `boolean` | `show(Player, int pageIndex)` | Show page to player |
| `void` | `showAll()` | Show to all in range |
| `void` | `hide(Player)` | Hide from player |
| `void` | `hideAll()` | Hide from all |
| `void` | `updateAll()` | Update for all viewers |
| `void` | `enable()` | Enable hologram |
| `void` | `disable(DisableCause)` | Disable hologram |
| `void` | `delete()` | Delete hologram and file |
| `void` | `save()` | Save to file |
| `void` | `setHidePlayer(Player)` | Permanently hide from player |
| `void` | `removeHidePlayer(Player)` | Remove permanent hide |
| `void` | `setShowPlayer(Player)` | Add to show-only list |
| `void` | `removeShowPlayer(Player)` | Remove from show-only list |
| `int` | `getPlayerPage(Player)` | Page index shown to player |
| `void` | `setDownOrigin(boolean)` | Lines grow downward |
| `void` | `setFacing(float)` | Set yaw direction |
| `static Hologram` | `getCachedHologram(String)` | Get from cache |
| `static Set<String>` | `getCachedHologramNames()` | All cached names |
| `static Collection<Hologram>` | `getCachedHolograms()` | All cached holograms |

### `eu.decentsoftware.holograms.api.holograms.HologramPage`

| Return | Method | Description |
|---|---|---|
| `Hologram` | `getParent()` | Parent hologram |
| `int` | `getIndex()` | Page index |
| `int` | `size()` | Line count |
| `List<HologramLine>` | `getLines()` | All lines (unmodifiable) |
| `HologramLine` | `getLine(int)` | Line by index |
| `boolean` | `addLine(HologramLine)` | Add line |
| `boolean` | `insertLine(int, HologramLine)` | Insert line |
| `boolean` | `setLine(int, String)` | Set line content |
| `HologramLine` | `removeLine(int)` | Remove line |
| `boolean` | `swapLines(int, int)` | Swap two lines |

### `eu.decentsoftware.holograms.api.holograms.HologramLine`

| Return | Method | Description |
|---|---|---|
| `HologramPage` | `getParent()` | Parent page |
| `String` | `getContent()` | Raw content string |
| `void` | `setContent(String)` | Set content (re-parses type) |
| `HologramLineType` | `getType()` | `TEXT`, `ICON`, `HEAD`, `SMALLHEAD`, `ENTITY` |
| `Location` | `getLocation()` | Line location |

### Enums

| Enum | Package | Values |
|---|---|---|
| `ClickType` | `eu.decentsoftware.holograms.api.actions` | `LEFT`, `RIGHT`, `SHIFT_LEFT`, `SHIFT_RIGHT` |
| `HologramLineType` | `eu.decentsoftware.holograms.api.holograms.enums` | `UNKNOWN`, `TEXT`, `HEAD`, `SMALLHEAD`, `ICON`, `ENTITY` |
| `EnumFlag` | `eu.decentsoftware.holograms.api.holograms.enums` | `DISABLE_PLACEHOLDERS`, `DISABLE_UPDATING`, `DISABLE_ANIMATIONS`, `DISABLE_ACTIONS` |
| `DisableCause` | `eu.decentsoftware.holograms.api.holograms` | `API`, `COMMAND`, `WORLD_UNLOAD`, `NONE` |

### Events (`eu.decentsoftware.holograms.event`)

| Event | Cancellable | Key Methods |
|---|---|---|
| `HologramClickEvent` | **Yes** | `getPlayer()`, `getHologram()`, `getPage()`, `getClick()`, `getEntityId()` |
| `HologramEnableEvent` | No | `getHologram()` |
| `HologramDisableEvent` | No | `getHologram()` |
| `HologramRegisterEvent` | No | `getHologram()` |
| `HologramUnregisterEvent` | No | `getHologram()` |
| `DecentHologramsReloadEvent` | No | (none) |

> **Warning:** `HologramClickEvent` getters are `getClick()` and `getPage()`, NOT `getClickType()` and `getHologramPage()` as the official wiki states. Verified against source code.
