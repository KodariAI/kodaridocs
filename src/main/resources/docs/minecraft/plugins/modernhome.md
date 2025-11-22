# ModernHome-API-Complete-Documentation

**Plugin:** ModernHome
**Package:** me.serbob.commons.api

## Plugin Setup

### Plugin.yml Configuration
softdepend: [ModernHome]

## Getting Started

### Check if ModernHome is Present
```java
public static boolean hasModernHome = false;
Plugin ModernHome;
if(ModernHome = Bukkit.getPluginManager().getPlugin("ModernHome") != null && ModernHome.isEnabled()) {
    getLogger().info("[YourPlugin] ModernHome hooked!");
    hasModernHome = true;
}
```

### Access the API
```java
import me.serbob.commons.api.ModernHomeAPI;

ModernHomeAPI api = ModernHomeAPI.getInstance();
```

## Usage Examples

### Get Player Homes
```java
// Get homes by UUID
UUID playerUUID = player.getUniqueId();
Map<Integer, HomeData> homes = ModernHomeAPI.getInstance().getHomes(playerUUID);

// Get homes by OfflinePlayer
OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(playerName);
Map<Integer, HomeData> homes = ModernHomeAPI.getInstance().getHomes(offlinePlayer);

// Iterate through homes
for(Map.Entry<Integer, HomeData> entry : homes.entrySet()) {
    int slot = entry.getKey();
    HomeData home = entry.getValue();
    String homeName = home.getName();
    Location location = home.getLocation().adaptToBukkitLocation();
}
```

### Set Home with Auto Index
```java
// Set home at player's current location (auto-assigns next available index)
Player player = event.getPlayer();
String homeName = "spawn";
boolean success = ModernHomeAPI.getInstance().setHome(player, homeName);

if(success) {
    player.sendMessage("Home set successfully!");
} else {
    player.sendMessage("Failed to set home - check limits or blacklisted worlds");
}

// Set home at specific location with auto index
Location customLocation = new Location(world, 100, 64, 100);
boolean success = ModernHomeAPI.getInstance().setHome(player, "base", customLocation);
```

### Set Home at Specific Index
```java
// Set home at specific index slot
int index = 3;
String homeName = "farm";
boolean success = ModernHomeAPI.getInstance().setHome(player, index, homeName);

// Set home at specific index and location
Location location = new Location(world, 200, 70, 300);
boolean success = ModernHomeAPI.getInstance().setHome(player, index, homeName, location);

// This will overwrite existing home at index if one exists
```

### Force Set Home (Bypass Restrictions)
```java
// Force set home with auto index
boolean success = ModernHomeAPI.getInstance().setHomeForce(player, "admin_home");

// Force set at specific location with auto index
Location loc = new Location(world, 0, 100, 0);
ModernHomeAPI.getInstance().setHomeForce(player, "forced", loc);

// Force set at specific index
int index = 5;
ModernHomeAPI.getInstance().setHomeForce(player, index, "forced_index");

// Force set at specific index and location
ModernHomeAPI.getInstance().setHomeForce(player, index, "forced_index", loc);

// Force set for offline player by UUID with auto index
UUID targetUUID = UUID.fromString("uuid-here");
ModernHomeAPI.getInstance().setHomeForce(targetUUID, "offline_home", location);

// Force set for offline player at specific index
ModernHomeAPI.getInstance().setHomeForce(targetUUID, 2, "offline_indexed", location);
```

### Delete Home
```java
// Delete home by index for online player
Player player = event.getPlayer();
int homeIndex = 1;
boolean success = ModernHomeAPI.getInstance().deleteHome(player, homeIndex);

if(success) {
    player.sendMessage("Home deleted successfully!");
} else {
    player.sendMessage("Home not found or invalid index!");
}

// Delete home for offline player by UUID
UUID targetUUID = UUID.fromString("uuid-here");
boolean deleted = ModernHomeAPI.getInstance().deleteHome(targetUUID, 2);
```

### Working with HomeData
```java
Map<Integer, HomeData> homes = ModernHomeAPI.getInstance().getHomes(player.getUniqueId());

for(HomeData home : homes.values()) {
    // Get home properties
    int index = home.getIndex();
    String name = home.getName();
    String fancyName = home.getNameFancy(); // Color coded name
    String serverId = home.getServerId();
    
    // Get location
    ImaginaryLocation imagLoc = home.getLocation();
    Location bukkitLoc = imagLoc.adaptToBukkitLocation();
    
    // Teleport player to home
    player.teleport(bukkitLoc);
}
```

### Home Slot Management
```java
public class HomeSlotManager {
    
    // Replace home at specific slot
    public void replaceHomeAtSlot(Player player, int slot, String newName, Location newLocation) {
        // This will overwrite any existing home at this slot
        boolean success = ModernHomeAPI.getInstance().setHome(player, slot, newName, newLocation);
        
        if(success) {
            player.sendMessage("Home at slot " + slot + " replaced!");
        }
    }
    
    // Find first empty slot and set home
    public void setHomeAtFirstEmpty(Player player, String homeName) {
        Map<Integer, HomeData> homes = ModernHomeAPI.getInstance().getHomes(player.getUniqueId());
        
        // Find first empty slot (1-based index)
        for(int i = 1; i <= 10; i++) { // Assuming max 10 homes
            if(!homes.containsKey(i)) {
                if(ModernHomeAPI.getInstance().setHome(player, i, homeName)) {
                    player.sendMessage("Home set at slot " + i);
                    return;
                }
            }
        }
        
        player.sendMessage("No empty slots available!");
    }
}
```

### Home Management Commands Example
```java
public class HomeCommands implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        
        if(label.equalsIgnoreCase("sethome")) {
            if(args.length < 1) {
                player.sendMessage("Usage: /sethome <name> [index]");
                return true;
            }
            
            String homeName = args[0];
            
            if(args.length >= 2) {
                // Set at specific index
                try {
                    int index = Integer.parseInt(args[1]);
                    if(ModernHomeAPI.getInstance().setHome(player, index, homeName)) {
                        player.sendMessage("Home '" + homeName + "' set at slot " + index);
                    } else {
                        player.sendMessage("Failed to set home at slot " + index);
                    }
                } catch(NumberFormatException e) {
                    player.sendMessage("Invalid index!");
                }
            } else {
                // Auto-assign index
                if(ModernHomeAPI.getInstance().setHome(player, homeName)) {
                    player.sendMessage("Home '" + homeName + "' set!");
                } else {
                    player.sendMessage("Failed to set home!");
                }
            }
            return true;
        }
        
        if(label.equalsIgnoreCase("delhome")) {
            if(args.length < 1) {
                player.sendMessage("Usage: /delhome <index>");
                return true;
            }
            
            try {
                int index = Integer.parseInt(args[0]);
                if(ModernHomeAPI.getInstance().deleteHome(player, index)) {
                    player.sendMessage("Home deleted!");
                } else {
                    player.sendMessage("Home not found!");
                }
            } catch(NumberFormatException e) {
                player.sendMessage("Invalid home index!");
            }
            return true;
        }
        
        if(label.equalsIgnoreCase("homes")) {
            Map<Integer, HomeData> homes = ModernHomeAPI.getInstance().getHomes(player.getUniqueId());
            
            if(homes.isEmpty()) {
                player.sendMessage("You have no homes!");
                return true;
            }
            
            player.sendMessage("Your homes:");
            for(HomeData home : homes.values()) {
                player.sendMessage("- [" + home.getIndex() + "] " + home.getNameFancy() + " at " + 
                    home.getLocation().getX() + ", " + 
                    home.getLocation().getY() + ", " + 
                    home.getLocation().getZ());
            }
            return true;
        }
        
        return false;
    }
}
```

### Admin Home Management
```java
public class AdminHomeManager {
    
    public void setHomeForOfflinePlayer(String playerName, int index, String homeName, Location location) {
        OfflinePlayer target = Bukkit.getOfflinePlayer(playerName);
        UUID targetUUID = target.getUniqueId();
        
        // Force set home at specific index for offline player
        boolean success = ModernHomeAPI.getInstance().setHomeForce(targetUUID, index, homeName, location);
        
        if(success) {
            Bukkit.getLogger().info("Home set at index " + index + " for " + playerName);
        }
    }
    
    public void reorganizeHomes(Player player) {
        Map<Integer, HomeData> homes = ModernHomeAPI.getInstance().getHomes(player.getUniqueId());
        
        // Delete all homes
        for(int index : homes.keySet()) {
            ModernHomeAPI.getInstance().deleteHome(player, index);
        }
        
        // Re-add homes with sequential indexes
        int newIndex = 1;
        for(HomeData home : homes.values()) {
            Location loc = home.getLocation().adaptToBukkitLocation();
            ModernHomeAPI.getInstance().setHomeForce(player, newIndex++, home.getName(), loc);
        }
    }
}
```

## API Components Documentation

### ModernHomeAPI Class
Package: me.serbob.commons.api.ModernHomeAPI
Type: Class (Singleton)

Methods:
- **static** ModernHomeAPI getInstance() - Get API instance
- Map<Integer, HomeData> getHomes(UUID uuid) - Get homes by player UUID
- Map<Integer, HomeData> getHomes(OfflinePlayer offlinePlayer) - Get homes by offline player
- boolean setHome(Player player, String homeName) - Set home at player location with auto index
- boolean setHome(Player player, String homeName, Location location) - Set home at location with auto index
- boolean setHome(Player player, int index, String homeName) - Set home at player location with specific index
- boolean setHome(Player player, int index, String homeName, Location location) - Set home at location with specific index
- boolean setHomeForce(Player player, String homeName) - Force set home at player location with auto index
- boolean setHomeForce(Player player, String homeName, Location location) - Force set home at location with auto index
- boolean setHomeForce(UUID uuid, String homeName, Location location) - Force set home for UUID with auto index
- boolean setHomeForce(Player player, int index, String homeName) - Force set home at player location with specific index
- boolean setHomeForce(Player player, int index, String homeName, Location location) - Force set home at location with specific index
- boolean setHomeForce(UUID uuid, int index, String homeName, Location location) - Force set home for UUID with specific index
- boolean deleteHome(Player player, int index) - Delete home by index for player
- boolean deleteHome(UUID uuid, int index) - Delete home by index for UUID

### HomeData Class
Package: me.serbob.commons.api.util.HomeData
Type: Class

Constructor:
- HomeData(int index, String name, ImaginaryLocation location)
- HomeData(int index, String name, ImaginaryLocation location, String serverId)

Methods:
- int getIndex() - Get home slot index
- String getName() - Get home name
- ImaginaryLocation getLocation() - Get home location
- String getServerId() - Get server ID where home was created
- String getNameFancy() - Get color formatted name
- void setIndex(int index) - Set home index
- void setName(String name) - Set home name
- void setLocation(ImaginaryLocation location) - Set home location
- void setServerId(String serverId) - Set server ID

### ImaginaryLocation Class
Package: me.serbob.commons.api.util.ImaginaryLocation
Type: Class

Constructors:
- ImaginaryLocation(String worldName, int x, int y, int z)
- ImaginaryLocation(Location location)
- ImaginaryLocation(String worldName, int x, int y, int z, Location cachedLocation)

Methods:
- String getWorldName() - Get world name
- int getX() - Get X coordinate
- int getY() - Get Y coordinate
- int getZ() - Get Z coordinate
- Location getCachedLocation() - Get cached Bukkit location
- Location adaptToBukkitLocation() - Convert to Bukkit Location
- void setWorldName(String worldName) - Set world name
- void setX(int x) - Set X coordinate
- void setY(int y) - Set Y coordinate
- void setZ(int z) - Set Z coordinate
- void setCachedLocation(Location cachedLocation) - Set cached location

### Return Values and Validation

#### setHome() Validation (Auto Index):
1. Height limit check - Returns false if Y > configured limit
2. Blacklisted worlds check - Returns false if world is blacklisted
3. Home limit check - Returns false if player reached max homes
4. WorldGuard region check - Returns false if not allowed in region

#### setHome() Validation (Specific Index):
1. Index validation - Returns false if index < 1
2. Height limit check - Returns false if Y > configured limit
3. Blacklisted worlds check - Returns false if world is blacklisted
4. Index limit check - Returns false if index > max homes for player
5. WorldGuard region check - Returns false if not allowed in region

#### setHomeForce() Behavior:
- Auto index version: Bypasses all validation checks
- Specific index version: Only validates index >= 1
- Returns false only if player data cannot be found (for UUID method) or index < 1

#### deleteHome() Validation:
- Returns false if index < 1 (invalid index)
- Returns false if player data not found
- Returns false if home at index doesn't exist
- Returns true only if home successfully removed and saved

### Home Slot Assignment
- Auto index: Automatically assigns next available slot number
- Specific index: Sets home at exact index (overwrites if exists)
- Fills gaps in slot numbers if homes were deleted (auto index only)
- Indexes start from 1
- Indexes must be >= 1 for valid homes

### Server ID Tracking
- Each home stores the server ID where it was created
- Useful for multi-server/proxy setups
- Automatically set when creating homes