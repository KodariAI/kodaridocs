# ExecutableItems API

ExecutableItems (by Ssomar) lets server owners create custom items with activators/triggers. The API lives in SCore and uses interfaces so your plugin can look up items by ID, build ItemStacks, inspect held items, and track usage -- all without depending on ExecutableItems internals.

**Requires:** SCore library (ships with ExecutableItems). Add `softdepend: [ExecutableItems, SCore]` to your plugin.yml.

## Code Examples

### Check if ExecutableItems is installed
```java
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

Plugin eiPlugin = Bukkit.getPluginManager().getPlugin("ExecutableItems");
boolean hasEI = eiPlugin != null && eiPlugin.isEnabled();
```

### Get the manager
```java
import com.ssomar.score.api.executableitems.ExecutableItemsAPI;
import com.ssomar.score.api.executableitems.config.ExecutableItemsManagerInterface;

ExecutableItemsManagerInterface manager = ExecutableItemsAPI.getExecutableItemsManager();
```

### Look up an ExecutableItem by ID and give it to a player
```java
import com.ssomar.score.api.executableitems.ExecutableItemsAPI;
import com.ssomar.score.api.executableitems.config.ExecutableItemInterface;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import java.util.Optional;

Optional<ExecutableItemInterface> eiOpt =
    ExecutableItemsAPI.getExecutableItemsManager().getExecutableItem("legendary_sword");
if (eiOpt.isPresent()) {
    // args: amount, optional custom usage count, optional creator player
    ItemStack item = eiOpt.get().buildItem(1, Optional.empty(), Optional.of(player));
    player.getInventory().addItem(item);
}
```

### Build an item with a specific usage count and variables
```java
import java.util.Map;
import java.util.Optional;

Map<String, String> variables = Map.of("level", "5", "owner", player.getName());
ItemStack item = eiOpt.get().buildItem(1, Optional.of(50), Optional.of(player), variables);
```

### Check if an ItemStack is an ExecutableItem
```java
import com.ssomar.score.api.executableitems.ExecutableItemsAPI;
import com.ssomar.score.api.executableitems.config.ExecutableItemInterface;
import org.bukkit.inventory.ItemStack;
import java.util.Optional;

ItemStack held = player.getInventory().getItemInMainHand();
Optional<ExecutableItemInterface> eiOpt =
    ExecutableItemsAPI.getExecutableItemsManager().getExecutableItem(held);
if (eiOpt.isPresent()) {
    ExecutableItemInterface ei = eiOpt.get();
    // confirmed ExecutableItem -- use ei.getId(), ei.getDescription(), etc.
}
```

### Get the ExecutableItemObject for an ItemStack (usage, variables)
```java
import com.ssomar.score.api.executableitems.ExecutableItemsAPI;
import com.ssomar.score.api.executableitems.config.ExecutableItemObjectInterface;
import com.ssomar.score.utils.emums.VariableUpdateType;

ExecutableItemObjectInterface obj = ExecutableItemsAPI.getExecutableItemObject(held);
if (obj.isValid()) {
    int usage = obj.getUsage();
    obj.updateUsage(usage - 1);

    // update a custom variable
    obj.updateVariable("kills", "10", VariableUpdateType.SET);

    obj.refreshItem(); // apply changes to the ItemStack in-hand
}
```

### Add ExecutableItem metadata to an existing ItemStack
```java
// Overrides name/lore with the EI config but keeps customModelData
ItemStack result = eiOpt.get().addExecutableItemInfos(existingItemStack, Optional.of(player));
```

### Register a brand-new ExecutableItem at runtime
```java
import com.ssomar.score.api.executableitems.ExecutableItemsAPI;
import com.ssomar.score.api.executableitems.config.ExecutableItemInterface;

// third arg is the sub-folder inside plugins/ExecutableItems/items/
ExecutableItemInterface created =
    ExecutableItemsAPI.registerNewExecutableItemObject(itemStack, "my_custom_id", "custom/");
```

### Validate an ID and list all IDs
```java
boolean valid = manager.isValidID("legendary_sword");

java.util.List<String> allIds = manager.getExecutableItemIdsList();
```

### Listen to events
```java
import com.ssomar.score.api.executableitems.events.AddItemInPlayerInventoryEvent;
import com.ssomar.score.api.executableitems.events.RemoveItemInPlayerInventoryEvent;
import com.ssomar.score.api.executableitems.load.ExecutableItemsPostLoadEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EIListener implements Listener {

    // Fired after all EI configs are loaded -- safe to query the API
    @EventHandler
    public void onLoaded(ExecutableItemsPostLoadEvent event) {
        // initialize your cache here
    }

    // Fire this yourself when programmatically adding an EI to inventory
    // so the EI ENTER_IN_PLAYER_INVENTORY activator triggers:
    // Bukkit.getPluginManager().callEvent(
    //     new AddItemInPlayerInventoryEvent(player, itemStack, slot));

    @EventHandler
    public void onItemAdded(AddItemInPlayerInventoryEvent event) {
        event.getPlayer();  // Player
        event.getItem();    // ItemStack
        event.getSlot();    // int
    }

    @EventHandler
    public void onItemRemoved(RemoveItemInPlayerInventoryEvent event) {
        event.getPlayer();
        event.getItem();
        event.getSlot();
    }
}
```

---

## API Reference

### com.ssomar.score.api.executableitems.ExecutableItemsAPI
```
static ExecutableItemsManagerInterface  getExecutableItemsManager()
static ExecutableItemObjectInterface    getExecutableItemObject(ItemStack)
static ExecutableItemInterface          registerNewExecutableItemObject(ItemStack, String id, String folder)
```

### com.ssomar.score.api.executableitems.config.ExecutableItemsManagerInterface
```
boolean                           isValidID(String id)
Optional<ExecutableItemInterface> getExecutableItem(String id)
Optional<ExecutableItemInterface> getExecutableItem(ItemStack)
List<String>                      getExecutableItemIdsList()
List<ExecutableItemInterface>     getAllExecutableItems()
```

### com.ssomar.score.api.executableitems.config.ExecutableItemInterface
Extends: SObjectInterface, SObjectWithActivators, SObjectBuildable, SObjectWithVariables
```
ItemStack buildItem(int amount, Optional<Integer> usage, Optional<Player> creator)
ItemStack buildItem(int amount, Optional<Integer> usage, Optional<Player> creator, Map<String,String> variables)
ItemStack buildItem(int amount, Optional<Player> creator)
ItemStack buildItem(int amount, Optional<Player> creator, Map<String,Object> settings)
ItemStack addExecutableItemInfos(ItemStack, Optional<Player> creator)
boolean   hasItemPerm(@NotNull Player, boolean showError)
boolean   hasKeepItemOnDeath()
void      setUsage(int usage)
void      addCooldown(Player, int cooldown, boolean isInTicks)
void      addCooldown(Player, int cooldown, boolean isInTicks, String activatorID)
void      addGlobalCooldown(int cooldown, boolean isInTicks)
void      addGlobalCooldown(int cooldown, boolean isInTicks, String activatorID)
Item      dropItem(Location, int amount)
List<String>            getDescription()
ColoredStringFeature    getDisplayName()
```

### com.ssomar.score.api.executableitems.config.ExecutableItemObjectInterface
```
boolean              isValid()
int                  getUsage()
void                 updateUsage(int usage)
void                 refreshItem()
ItemStack            refresh(List<ResetSetting> resetSettings)
Map<String,String>   getVariablesValues()
String               updateVariable(String name, String value, VariableUpdateType type)
```

### com.ssomar.score.api.executableitems.events.AddItemInPlayerInventoryEvent
Extends: PlayerEvent
```
Constructor(Player, ItemStack, int slot)
ItemStack getItem()
int       getSlot()
```

### com.ssomar.score.api.executableitems.events.RemoveItemInPlayerInventoryEvent
Extends: PlayerEvent
```
Constructor(Player, ItemStack, int slot)
ItemStack getItem()
int       getSlot()
```

### com.ssomar.score.api.executableitems.load.ExecutableItemsPostLoadEvent
Extends: Event -- fired when all ExecutableItems configs finish loading.

### com.ssomar.score.utils.emums.VariableUpdateType
Enum: `SET`, `MODIFICATION`, `LIST_ADD`, `LIST_REMOVE`, `LIST_CLEAR`

### com.ssomar.score.utils.emums.ResetSetting
Enum: `MATERIAL`, `NAME`, `LORE`, `DURABILITY`, `ATTRIBUTES`, `ENCHANTS`, `CUSTOM_MODEL_DATA`, `USAGE`, `ARMOR_SETTINGS`, `ITEM_RARITY`, `BOOK`, `EQUIPPABLE`, `REPAIRABLE`, `HIDERS`, `INSTRUMENT`, `TOOL_RULES`, `FIREWORK`, `FIREWORK_EXPLOSION`, `CONTAINER`, `HEAD`, `BANNER`, `FOOD`, `CONSUMABLE`, `BUNDLE`, `BLOCK_STATE`, `CHARGED_PROJECTILES`, `MYFURNITURE`, `SPAWNER`, `WEAPON`, `BLOCK_ATTACKS`, `TOOLTIP_MODEL`
