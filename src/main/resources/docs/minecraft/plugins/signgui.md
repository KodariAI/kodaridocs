# SignGUI Complete Quick Reference

## Project Setup

### Adding SignGUI to Your Project

In your manifest.kod file, add signgui to the include section:

manifest.kod:
include:
- signgui

This will automatically include SignGUI in your project compilation.

### Imports
```java
import de.rapha149.signgui.SignGUI;
import de.rapha149.signgui.SignGUIAction;
import de.rapha149.signgui.exception.SignGUIVersionException;
```

## Basic Usage
```java
try {
    SignGUI gui = SignGUI.builder()
        .setLines("§6Enter name:", "", "", "")
        .setHandler((player, result) -> {
            String input = result.getLineWithoutColor(1);
            player.sendMessage("You entered: " + input);
            return Collections.emptyList();
        })
        .build();
    
    gui.open(player);
} catch (SignGUIVersionException e) {
    // Server version not supported
}
```

## Complete Builder Reference

### Line Configuration
```java
.setLines(String line1, String line2, String line3, String line4)  // Set all lines (null = empty)
.setLine(int index, String text)                                    // Set specific line (0-3)
```

### Sign Appearance
```java
.setType(Material.DARK_OAK_SIGN)    // Sign wood type
.setColor(DyeColor.YELLOW)          // Text color
```

### Handler Configuration
```java
.setHandler(BiFunction<Player, SignGUIResult, List<SignGUIAction>> handler)  // Required
.callHandlerSynchronously(JavaPlugin plugin)  // Run handler on main thread (default: async)
```

## SignGUIResult Methods
```java
result.getLine(int index)                 // Get line with color codes
result.getLineWithoutColor(int index)     // Get line without color codes
result.getLines()                         // Get all lines as String[]
result.getLinesWithoutColor()             // Get all lines without color codes
```

## SignGUIAction Types
```java
SignGUIAction.displayNewLines(String... lines)           // Reopen sign with new lines
SignGUIAction.openInventory(Plugin plugin, Inventory inv) // Open inventory after closing
SignGUIAction.run(Runnable runnable)                     // Execute custom code
```

## Complete Examples

### Input Validation with Retry
```java
public void openNameInput(Player player) {
    try {
        SignGUI.builder()
            .setLines("§e§lEnter Name", "§7-----------", "", "")
            .setType(Material.OAK_SIGN)
            .setColor(DyeColor.BLACK)
            .setHandler((p, result) -> {
                String name = result.getLineWithoutColor(2).trim();
                
                if (name.isEmpty()) {
                    p.sendMessage("§cName cannot be empty!");
                    return List.of(SignGUIAction.displayNewLines(
                        "§c§lTry Again", "§7-----------", "", ""
                    ));
                }
                
                if (name.length() < 3) {
                    p.sendMessage("§cName must be at least 3 characters!");
                    return List.of(SignGUIAction.displayNewLines(
                        "§c§lToo Short", "§7-----------", "", ""
                    ));
                }
                
                p.sendMessage("§aName set to: " + name);
                return Collections.emptyList();
            })
            .build()
            .open(player);
    } catch (SignGUIVersionException e) {
        player.sendMessage("§cSign GUI not supported on this server version.");
    }
}
```

### Number Input with Inventory Follow-up
```java
public void openAmountSelector(Player player, ItemStack item) {
    try {
        SignGUI.builder()
            .setLines("§6Enter Amount", "§7(1-64)", "", "")
            .setHandler((p, result) -> {
                String input = result.getLineWithoutColor(2).trim();
                
                try {
                    int amount = Integer.parseInt(input);
                    if (amount < 1 || amount > 64) {
                        return List.of(SignGUIAction.displayNewLines(
                            "§cInvalid Range", "§7(1-64)", "", ""
                        ));
                    }
                    
                    item.setAmount(amount);
                    Inventory confirmInv = createConfirmInventory(item);
                    
                    return List.of(
                        SignGUIAction.openInventory(plugin, confirmInv),
                        SignGUIAction.run(() -> p.sendMessage("§aSelect confirm or cancel"))
                    );
                    
                } catch (NumberFormatException e) {
                    return List.of(SignGUIAction.displayNewLines(
                        "§cNumbers Only!", "§7(1-64)", "", ""
                    ));
                }
            })
            .build()
            .open(player);
    } catch (SignGUIVersionException e) {
        player.sendMessage("§cFeature not available.");
    }
}
```

### Synchronous Handler for World Modifications
```java
public void openWarpCreator(Player player) {
    try {
        SignGUI.builder()
            .setLines("§5§lNew Warp", "§7Enter name:", "", "")
            .setType(Material.WARPED_SIGN)
            .setColor(DyeColor.PURPLE)
            .callHandlerSynchronously(plugin)  // Required for Bukkit API calls
            .setHandler((p, result) -> {
                String warpName = result.getLineWithoutColor(2).trim();
                
                if (warpName.isEmpty()) {
                    return List.of(SignGUIAction.displayNewLines(
                        "§c§lInvalid", "§7Enter name:", "", ""
                    ));
                }
                
                // Safe to call Bukkit API - handler runs on main thread
                Location loc = p.getLocation();
                saveWarp(warpName, loc);
                p.sendMessage("§aWarp '" + warpName + "' created!");
                
                return Collections.emptyList();
            })
            .build()
            .open(player);
    } catch (SignGUIVersionException e) {
        player.sendMessage("§cNot supported.");
    }
}
```

### Multi-Player Sign GUI
```java
public void openPollForAll(Collection<Player> players, String question) {
    try {
        SignGUI gui = SignGUI.builder()
            .setLines("§6§l" + question, "§7Type: yes/no", "", "")
            .setHandler((p, result) -> {
                String answer = result.getLineWithoutColor(2).toLowerCase().trim();
                recordVote(p, answer);
                p.sendMessage("§aVote recorded!");
                return Collections.emptyList();
            })
            .build();
        
        // Open same GUI for multiple players
        for (Player player : players) {
            gui.open(player);
        }
    } catch (SignGUIVersionException e) {
        players.forEach(p -> p.sendMessage("§cVoting unavailable."));
    }
}
```

## FoliaLib Integration
```java
public void openSignSafely(Player player) {
    // Wait for chunks to load after join
    foliaLib.getScheduler().runAtEntityLater(player, task -> {
        try {
            SignGUI.builder()
                .setLines("§aReady!", "", "", "")
                .setHandler((p, result) -> Collections.emptyList())
                .build()
                .open(player);
        } catch (SignGUIVersionException e) {
            player.sendMessage("§cNot supported.");
        }
    }, 60L); // 3 second delay
}
```

## Important Limitations

1. **Players can edit all lines** - Pre-written instruction lines can be modified by players
2. **Sign location matters** - Sign spawns 3 blocks behind player; quick camera turns may reveal it
3. **Join delay required** - Wait 2-3+ seconds after PlayerJoinEvent before opening
4. **Glow cannot change on redisplay** - Must create new SignGUI to change glow status

## Best Practices

- Leave first line(s) blank for player input
- Use lower lines for instructions (players less likely to edit)
- Validate input in handler and use `displayNewLines()` for retries
- Use `callHandlerSynchronously(plugin)` when modifying world/entities
- Catch `SignGUIVersionException` gracefully with fallback behavior
- Add delay when opening after PlayerJoinEvent (minimum 60 ticks recommended)

## Supported Versions

Minecraft 1.8 - 1.21 (including Adventure text and mojang-mapped Paper 1.20.5+)