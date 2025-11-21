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

### Set Home for Player
```java
// Set home at player's current location
Player player = event.getPlayer();
String homeName = "spawn";
boolean success = ModernHomeAPI.getInstance().setHome(player, homeName);

if(success) {
    player.sendMessage("Home set successfully!");
} else {
    player.sendMessage("Failed to set home - check limits or blacklisted worlds");
}
```

### Set Home at Specific Location
```java
Location customLocation = new Location(world, 100, 64, 100);
boolean success = ModernHomeAPI.getInstance().setHome(player, "base", customLocation);
```

### Force Set Home (Bypass Restrictions)
```java
// Force set home ignoring limits and restrictions
boolean success = ModernHomeAPI.getInstance().setHomeForce(player, "admin_home");

// Force set at specific location
Location loc = new Location(world, 0, 100, 0);
ModernHomeAPI.getInstance().setHomeForce(player, "forced", loc);

// Force set for offline player by UUID
UUID targetUUID = UUID.fromString("uuid-here");
ModernHomeAPI.getInstance().setHomeForce(targetUUID, "offline_home", location);
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

### Create Custom ImaginaryLocation
```java
// From coordinates
ImaginaryLocation loc1 = new ImaginaryLocation("world", 100, 64, 200);

// From Bukkit Location
Location bukkitLoc = player.getLocation();
ImaginaryLocation loc2 = new ImaginaryLocation(bukkitLoc);

// Convert back to Bukkit Location
Location converted = loc2.adaptToBukkitLocation();
```

### Check if Home Can Be Set
```java
public boolean canSetHome(Player player, Location location) {
    // This example shows the checks that setHome() performs internally
    
    // Check height limit
    if(location.getY() > getHeightLimit()) {
        return false;
    }
    
    // Check blacklisted worlds
    if(isBlacklistedWorld(location.getWorld().getName())) {
        return false;
    }
    
    // Check player's home limit
    Map<Integer, HomeData> currentHomes = ModernHomeAPI.getInstance().getHomes(player.getUniqueId());
    int maxHomes = getMaxHomesForPlayer(player);
    if(currentHomes.size() >= maxHomes) {
        return false;
    }
    
    return true;
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
                player.sendMessage("Usage: /sethome <name>");
                return true;
            }
            
            String homeName = args[0];
            if(ModernHomeAPI.getInstance().setHome(player, homeName)) {
                player.sendMessage("Home '" + homeName + "' set!");
            } else {
                player.sendMessage("Failed to set home!");
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
                player.sendMessage("- " + home.getNameFancy() + " at " + 
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

## API Components Documentation

### ModernHomeAPI Class
Package: me.serbob.commons.api.ModernHomeAPI
Type: Class (Singleton)

Methods:
- **static** ModernHomeAPI getInstance() - Get API instance
- Map<Integer, HomeData> getHomes(UUID uuid) - Get homes by player UUID
- Map<Integer, HomeData> getHomes(OfflinePlayer offlinePlayer) - Get homes by offline player
- boolean setHome(Player player, String homeName) - Set home at player location
- boolean setHome(Player player, String homeName, Location location) - Set home at specific location
- boolean setHomeForce(Player player, String homeName) - Force set home at player location
- boolean setHomeForce(Player player, String homeName, Location location) - Force set home at location
- boolean setHomeForce(UUID uuid, String homeName, Location location) - Force set home for UUID

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

#### setHome() Validation Checks:
1. Height limit check - Returns false if Y > configured limit
2. Blacklisted worlds check - Returns false if world is blacklisted
3. Home limit check - Returns false if player reached max homes
4. WorldGuard region check - Returns false if not allowed in region

#### setHomeForce() Behavior:
- Bypasses all validation checks
- Always creates home if player data exists
- Returns false only if player data cannot be found (for UUID method)

### Home Slot Assignment
- Automatically assigns next available slot number
- Fills gaps in slot numbers if homes were deleted
- Starts from slot 1

### Server ID Tracking
- Each home stores the server ID where it was created
- Useful for multi-server/proxy setups
- Automatically set when creating homes