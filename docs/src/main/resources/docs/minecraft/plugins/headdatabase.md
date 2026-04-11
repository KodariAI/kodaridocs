# HeadDatabase API

Custom head database plugin by Arcaniax. Provides API to retrieve, search, and manage thousands of decorative player heads. Requires the HeadDatabase plugin at runtime. Add `HeadDatabase` to `depend` or `softdepend` in plugin.yml.

**Critical:** You MUST wait for `DatabaseLoadEvent` before calling any API methods. The database is not available until this event fires.

## Getting the API Instance

```java
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import me.arcaniax.hdb.api.DatabaseLoadEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin implements Listener {

    private HeadDatabaseAPI hdbApi;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onDatabaseLoad(DatabaseLoadEvent event) {
        hdbApi = new HeadDatabaseAPI();
        getLogger().info("HeadDatabase loaded in " + event.getAmount() + " seconds");
    }
}
```

## Getting a Head by ID

```java
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import org.bukkit.inventory.ItemStack;

HeadDatabaseAPI api = new HeadDatabaseAPI();
ItemStack head = api.getItemHead("7129"); // returns null if ID not found
if (head != null) {
    player.getInventory().addItem(head);
}
```

## Getting the Head ID from an ItemStack or Block

```java
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import org.bukkit.inventory.ItemStack;
import org.bukkit.block.Block;

HeadDatabaseAPI api = new HeadDatabaseAPI();

// From an ItemStack
String itemId = api.getItemID(someItemStack); // returns null if not a HDB head

// From a placed Block
String blockId = api.getBlockID(someBlock); // returns null if not a HDB head
```

## Listing Heads by Category

```java
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import me.arcaniax.hdb.enums.CategoryEnum;
import me.arcaniax.hdb.object.head.Head;
import java.util.List;

HeadDatabaseAPI api = new HeadDatabaseAPI();
List<Head> animalHeads = api.getHeads(CategoryEnum.ANIMALS);
for (Head head : animalHeads) {
    ItemStack item = head.getHead();
}
```

## Handling Player Click in HDB GUI

```java
import me.arcaniax.hdb.api.PlayerClickHeadEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class HeadClickListener implements Listener {

    @EventHandler
    public void onPlayerClickHead(PlayerClickHeadEvent event) {
        Player player = event.getPlayer();
        String headId = event.getHeadID();
        ItemStack head = event.getHead();
        double price = event.getPrice();
        boolean usesEconomy = event.isEconomy();

        // Cancel the click to prevent default behavior
        // event.setCancelled(true);
    }
}
```

## Checking and Setting Decorative Heads

```java
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

HeadDatabaseAPI api = new HeadDatabaseAPI();

boolean isDecorBlock = api.isDecorativeHead(someBlock);
boolean isDecorItem = api.isDecorativeHead(someItemStack);

// Apply a head texture to a placed block
boolean success = api.setBlockSkin(someBlock, "7129");
```

## Adding and Removing Custom Heads

```java
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import me.arcaniax.hdb.enums.CategoryEnum;
import me.arcaniax.hdb.object.head.Head;
import java.util.UUID;

HeadDatabaseAPI api = new HeadDatabaseAPI();

// Add by UUID (returns the assigned head ID string)
String newId = api.addHead(CategoryEnum.CUSTOM, "My Head Name", UUID.randomUUID());

// Add by base64 texture string (returns the assigned head ID string)
String newId2 = api.addHead(CategoryEnum.CUSTOM, "My Head Name", base64TextureString);

// Add an existing Head object (returns true on success)
boolean added = api.addHead(CategoryEnum.CUSTOM, someHeadObject);

// Remove a head by ID (returns true on success)
boolean removed = api.removeHead("some-id");
```

## API Reference

### me.arcaniax.hdb.api.HeadDatabaseAPI

| Method | Returns | Description |
|---|---|---|
| `getItemHead(String id)` | `ItemStack` | Get head by ID. Returns null if not found. |
| `getItemHead(Block block)` | `ItemStack` | Get head ItemStack from a placed block. |
| `getItemID(ItemStack item)` | `String` | Get HDB ID from an ItemStack. Null if not HDB head. |
| `getBlockID(Block block)` | `String` | Get HDB ID from a placed block. Null if not HDB head. |
| `getBase64(String id)` | `String` | Get base64 texture by head ID. |
| `getBase64(ItemStack item)` | `String` | Get base64 texture from ItemStack. |
| `getBase64(Block block)` | `String` | Get base64 texture from placed block. |
| `isHead(String id)` | `boolean` | Check if a head ID exists in the database. |
| `isDecorativeHead(Block block)` | `boolean` | Check if a placed block is a decorative HDB head. |
| `isDecorativeHead(ItemStack item)` | `boolean` | Check if an ItemStack is a decorative HDB head. |
| `getHeads(CategoryEnum category)` | `List<Head>` | Get all heads in a category. |
| `getCategory(String id)` | `CategoryEnum` | Get the category of a head by ID. |
| `getRandomHead()` | `ItemStack` | Get a random head from the database. |
| `addHead(CategoryEnum, Head)` | `boolean` | Add an existing Head object to a category. |
| `addHead(CategoryEnum, String, UUID)` | `String` | Add a head by name and UUID. Returns assigned ID. |
| `addHead(CategoryEnum, String, String)` | `String` | Add a head by name and base64 texture. Returns assigned ID. |
| `removeHead(String id)` | `boolean` | Remove a head from the database by ID. |
| `setBlockSkin(Block, String id)` | `boolean` | Apply a head texture to a placed block. |
| `setPrefixID(String prefix)` | `void` | Set prefix used for head IDs. |

### me.arcaniax.hdb.api.DatabaseLoadEvent extends org.bukkit.event.Event

| Method | Returns | Description |
|---|---|---|
| `getAmount()` | `int` | Seconds HeadDatabase took to load. |

### me.arcaniax.hdb.api.PlayerClickHeadEvent extends org.bukkit.event.Event

| Method | Returns | Description |
|---|---|---|
| `getPlayer()` | `Player` | Player who clicked the head. |
| `getHead()` | `ItemStack` | The head ItemStack that was clicked. |
| `getHeadID()` | `String` | The HDB ID of the clicked head. |
| `getCategoryEnum()` | `CategoryEnum` | Category of the clicked head. |
| `getPrice()` | `double` | Price of the head. |
| `isEconomy()` | `boolean` | Whether economy is involved. |
| `getEconomyEnum()` | `EconomyEnum` | Economy type (CURRENCY, PLAYERPOINTS, ITEM). |
| `isCancelled()` | `boolean` | Whether the event is cancelled. |
| `setCancelled(Boolean cancel)` | `void` | Cancel or uncancel the event. |

### me.arcaniax.hdb.enums.CategoryEnum

`ALPHABET`, `ANIMALS`, `BLOCKS`, `DECORATION`, `FOOD_DRINKS`, `HUMANS`, `HUMANOID`, `MISCELLANEOUS`, `MONSTERS`, `PLANTS`, `CUSTOM`, `CUSTOM2`, `CUSTOM3`, `CUSTOM4`, `CUSTOM5`, `ONLINE_PLAYERS`, `DISABLED`

### me.arcaniax.hdb.enums.EconomyEnum

`CURRENCY`, `PLAYERPOINTS`, `ITEM`

### me.arcaniax.hdb.object.head.Head

| Method | Returns | Description |
|---|---|---|
| `getHead()` | `ItemStack` | Get this head as an ItemStack. |
| `getPrice()` | `double` | Get the price of this head. |
| `setPrice(Double price)` | `void` | Set the price of this head. |
| `search(String input)` | `boolean` | Check if this head matches a search query. |

Fields: `String name`, `String id`, `String b64` (base64 texture), `String uuid`, `CategoryEnum c` (category), `Collection<String> tags`
