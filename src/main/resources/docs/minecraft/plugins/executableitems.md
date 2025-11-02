# ExecutableItems-API-Complete-Documentation

**Plugin:** ExecutableItems
**Library:** SCore
**Package:** com.ssomar.score.api.executableitems

## Plugin Setup

### Plugin.yml Configuration
softdepend: [ExecutableItems, SCore]

## Getting Started

### Check if ExecutableItems is Present
```java
public static boolean hasExecutableItems = false;
Plugin executableItems;
if(executableItems = Bukkit.getPluginManager().getPlugin("ExecutableItems") != null && executableItems.isEnabled()) {
    SCore.plugin.getServer().getLogger().info("["+NAME+"] ExecutableItems hooked !");
    hasExecutableItems = true;
}
```

### Access the API
```java
import com.ssomar.score.api.executableitems.ExecutableItemsAPI;

ExecutableItemsManagerInterface manager = ExecutableItemsAPI.getExecutableItemsManager();
```

## Usage Examples

### Give ExecutableItem to Player
```java
public void giveExecutableItem(Player player, String executableItemId, int amount){
    ItemStack item = null;
    Optional<ExecutableItemInterface> eiOpt = ExecutableItemsAPI.getExecutableItemsManager().getExecutableItem(executableItemId);
    if(eiOpt.isPresent()) {
        item = eiOpt.get().buildItem(amount, Optional.empty(), Optional.of(player));
    }
    if(item != null) {
        player.getInventory().addItem(item);
    }
    /* else
         Your error message here */
}
```

### Check if ItemStack is ExecutableItem
```java
ItemStack itemStack = player.getItemInHand();
Optional<ExecutableItemInterface> eiOpt = ExecutableItemsAPI.getExecutableItemsManager().getExecutableItem(itemStack);
if(eiOpt.isPresent()) {
    // It's an ExecutableItem
    ExecutableItemInterface ei = eiOpt.get();
    // Do something with it
}
```

### Verify ExecutableItem ID
```java
String itemId = "legendary_sword";
if(ExecutableItemsAPI.getExecutableItemsManager().isValidID(itemId)) {
    // Valid ExecutableItem ID
}
```

### Get All ExecutableItem IDs
```java
List<String> allIds = ExecutableItemsAPI.getExecutableItemsManager().getExecutableItemIdsList();
for(String id : allIds) {
    System.out.println("Found ExecutableItem: " + id);
}
```

### Build Item with Custom Usage
```java
Optional<ExecutableItemInterface> eiOpt = ExecutableItemsAPI.getExecutableItemsManager().getExecutableItem("special_sword");
if(eiOpt.isPresent()) {
    ExecutableItemInterface ei = eiOpt.get();
    // Build with 1 item, 50 custom usage, created by player
    ItemStack item = ei.buildItem(1, Optional.of(50), Optional.of(player));
}
```

### Add ExecutableItem Infos to Existing Item
```java
ItemStack customItem = new ItemStack(Material.DIAMOND_SWORD);
// Add custom modifications to item...

Optional<ExecutableItemInterface> eiOpt = ExecutableItemsAPI.getExecutableItemsManager().getExecutableItem("legendary_sword");
if(eiOpt.isPresent()) {
    // This will add ExecutableItem data to your item
    // It overrides name/lore but keeps customModelData
    customItem = eiOpt.get().addExecutableItemInfos(customItem, Optional.of(player));
}
```

### Check Player Permission for Item
```java
Optional<ExecutableItemInterface> eiOpt = ExecutableItemsAPI.getExecutableItemsManager().getExecutableItem("vip_sword");
if(eiOpt.isPresent()) {
    ExecutableItemInterface ei = eiOpt.get();
    boolean showError = true; // Show error message if no permission
    if(ei.hasItemPerm(player, showError)) {
        // Player has permission to use this item
    }
}
```

### Register New ExecutableItem Object
```java
ItemStack itemStack = player.getItemInHand();
String id = "custom_item";
String name = "Custom Item";
ExecutableItemInterface newItem = ExecutableItemsAPI.registerNewExecutableItemObject(itemStack, id, name);
```

### Get ExecutableItem Object from ItemStack
```java
ItemStack itemStack = player.getItemInHand();
ExecutableItemObjectInterface eiObject = ExecutableItemsAPI.getExecutableItemObject(itemStack);
if(eiObject != null) {
    // Get usage remaining
    int usage = eiObject.getUsage();
    
    // Update usage
    eiObject.updateUsage(usage - 1);
    
    // Refresh the item
    eiObject.refreshItem();
}
```

## Important Events

### AddItemInPlayerInventoryEvent (Since SCore 3.4.7)
Call this when adding ExecutableItem to player inventory:
```java
AddItemInPlayerInventoryEvent eventToCall = new AddItemInPlayerInventoryEvent(player, itemStack, firstEmptySlot);
Bukkit.getPluginManager().callEvent(eventToCall);
```
This event is particularly useful for the custom activator/trigger: EI ENTER IN PLAYER INVENTORY

### RemoveItemInPlayerInventoryEvent
```java
@EventHandler
public void onItemRemove(RemoveItemInPlayerInventoryEvent event) {
    Player player = event.getPlayer();
    ItemStack item = event.getItem();
    int slot = event.getSlot();
    // Handle item removal
}
```

### ExecutableItemsPostLoadEvent
```java
@EventHandler
public void onExecutableItemsLoaded(ExecutableItemsPostLoadEvent event) {
    // All ExecutableItems are now loaded
    // Safe to access them via API
}
```

## API Components Documentation

### ExecutableItemsAPI Class
Package: com.ssomar.score.api.executableitems.ExecutableItemsAPI
Type: Class

Methods:
- **static** ExecutableItemsManagerInterface getExecutableItemsManager()
- **static** ExecutableItemInterface registerNewExecutableItemObject(ItemStack, String, String)
- **static** ExecutableItemObjectInterface getExecutableItemObject(ItemStack)

### ExecutableItemsManagerInterface
Package: com.ssomar.score.api.executableitems.config
Type: Interface

Methods:
- List<ExecutableItemInterface> getAllExecutableItems() - Get all ExecutableItems
- Optional<ExecutableItemInterface> getExecutableItem(String id) - Get by ID
- Optional<ExecutableItemInterface> getExecutableItem(ItemStack itemStack) - Get from ItemStack
- boolean isValidID(String id) - Verify if ID is valid
- List<String> getExecutableItemIdsList() - Get all IDs

### ExecutableItemInterface
Package: com.ssomar.score.api.executableitems.config
Type: Interface
Extends: SObjectInterface, SObjectWithActivators, SObjectBuildable, SObjectWithVariables

Methods:
- ItemStack addExecutableItemInfos(ItemStack item, Optional<Player> creator) - Add EI data to item
- boolean hasItemPerm(Player player, boolean showError) - Check player permission
- ItemStack buildItem(int amount, Optional<Integer> usage, Optional<Player> creator) - Build the item
- ItemStack buildItem(int amount, Optional<Integer> usage, Optional<Player> creator, Map<String,String> variables) - Build with variables
- void addCooldown(Player player, int cooldown, boolean message) - Add player cooldown
- void addCooldown(Player player, int cooldown, boolean message, String activatorId) - Add specific cooldown
- void addGlobalCooldown(int cooldown, boolean message) - Add global cooldown
- Item dropItem(Location location, int amount) - Drop item at location
- boolean hasKeepItemOnDeath() - Check keep on death setting
- ColoredStringFeature getDisplayName() - Get display name
- List<String> getDescription() - Get item description
- void setUsage(int usage) - Set item usage

### ExecutableItemObjectInterface  
Package: com.ssomar.score.api.executableitems.config
Type: Interface

Methods:
- void refreshItem() - Refresh the item
- Map<String,String> getVariablesValues() - Get variable values
- String updateVariable(String variableName, String value, VariableUpdateType type) - Update variable
- boolean isValid() - Check if object is valid
- ItemStack refresh(List<String> errors) - Refresh with error handling
- void updateUsage(int usage) - Update usage count
- int getUsage() - Get current usage

### Event Classes

#### AddItemInPlayerInventoryEvent
Package: com.ssomar.score.api.executableitems.events
Extends: PlayerEvent

Methods:
- int getSlot() - Get inventory slot
- ItemStack getItem() - Get the item
- HandlerList getHandlers() - Event handlers
- **static** HandlerList getHandlerList() - Static handler list

#### RemoveItemInPlayerInventoryEvent
Package: com.ssomar.score.api.executableitems.events
Extends: PlayerEvent

Methods:
- int getSlot() - Get inventory slot
- ItemStack getItem() - Get the item
- HandlerList getHandlers() - Event handlers
- **static** HandlerList getHandlerList() - Static handler list

#### ExecutableItemsPostLoadEvent
Package: com.ssomar.score.api.executableitems.load
Extends: Event

Methods:
- HandlerList getHandlers() - Event handlers
- **static** HandlerList getHandlerList() - Static handler list