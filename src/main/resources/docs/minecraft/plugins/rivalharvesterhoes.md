# RivalHarvesterHoesAPI

Custom harvester hoe tool plugin by Rival Development. Hoes have custom enchantments, XP/leveling, prestige, essence currency, crop tracking, and auto-sell on harvest. The API lets you check hoe status, manage essence/crop balances, open the upgrade menu, register a custom economy, and listen to harvest events.

> Note: These are premium plugins with limited public API docs. Examples below are derived from known method signatures and patterns shared across all Rival Tools plugins.

## Core API

```java
import me.rivaldev.harvesterhoes.api.events.RivalHarvesterHoesAPI;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

RivalHarvesterHoesAPI api = new RivalHarvesterHoesAPI();

// Check if a player is holding a harvester hoe
boolean holding = api.isHoe(player);

// Open the main hoe menu for a player
api.openMainMenu(player);

// Apply hoe meta (lore, name, enchant display) to an existing ItemStack
api.applyMetaToHoe(itemStack, player);

// Set specific enchants — enchantData is config-key format (e.g. "AutoSell:5;Harvester:3")
api.setEnchants(itemStack, player, enchantData);

// Get the configured hoe material type
Material hoeMaterial = api.getMaterial();

// Essence management
double essence = api.getEssence(offlinePlayer);
api.giveEssence(offlinePlayer, 500.0);
api.removeEssence(offlinePlayer, 100.0);

// Crop balance tracking (by Material or String name)
long crops = api.getCropBalance(offlinePlayer, "WHEAT");
api.setCropBalance(offlinePlayer, 1000L, Material.WHEAT);
api.setCropBalance(offlinePlayer, 1000L, "WHEAT");
```

### Static Hoe Checks (Main class)

```java
import me.rivaldev.harvesterhoes.Main;
import org.bukkit.inventory.ItemStack;

// Check if an ItemStack is a harvester hoe
boolean isHoe = Main.isAHoe(itemStack);

// Check if the material qualifies as a hoe material
boolean isHoeMat = Main.isHoeMaterial(itemStack);
```

## Custom Economy Integration

All Rival Tools plugins share an `EconomyManager` interface. Implement it to replace Vault/default economy.

```java
import me.rivaldev.harvesterhoes.api.events.RivalHarvesterHoesAPI;
import me.rivaldev.harvesterhoes.ecomanager.EconomyManager;
import org.bukkit.OfflinePlayer;

public class MyCustomEconomy implements EconomyManager {

    @Override
    public String getEconomyName() { return "MyEconomy"; }

    @Override
    public String getEconomyCommand() { return "myeco"; }

    @Override
    public double getEconomyAmount(OfflinePlayer player) {
        return getBalanceFromMySystem(player);
    }

    @Override
    public void giveEconomyAmount(OfflinePlayer player, double amount) {
        addToMySystem(player, amount);
    }

    @Override
    public void removeEconomyAmount(OfflinePlayer player, double amount) {
        removeFromMySystem(player, amount);
    }
}

// Register in onEnable:
RivalHarvesterHoesAPI api = new RivalHarvesterHoesAPI();
api.registerEconomyManager(new MyCustomEconomy());
```

## Events

All events are in `me.rivaldev.harvesterhoes.api.events`.

### RivalBlockBreakEvent — Core crop break event (cancellable)

The most important event. Fires when a player breaks a crop with a Rival Harvester Hoe.

```java
import me.rivaldev.harvesterhoes.api.events.RivalBlockBreakEvent;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class HarvestListener implements Listener {

    @EventHandler
    public void onCropBreak(RivalBlockBreakEvent event) {
        if (event.isCancelled()) return;

        Player player = event.getPlayer();
        Block crop = event.getCrop();
        Material material = event.getMaterial();
        ItemStack hoeItem = event.getHoeItem();
        int hoeLevel = event.getHoeLevel();
        int hoePrestige = event.getHoePrestige();
        int amount = event.getAmount();

        // Double drops for wheat
        if (material == Material.WHEAT) {
            event.setAmount(amount * 2);
        }

        // Cancel processing for specific conditions
        // event.setCancelled(true);
    }
}
```

### HoeXPGainEvent — Modify XP gained per harvest

```java
import me.rivaldev.harvesterhoes.api.events.HoeXPGainEvent;

@EventHandler
public void onXPGain(HoeXPGainEvent event) {
    event.setXP(event.getXP() * 2.0);     // Double XP
    event.setBoost(event.getBoost() + 0.5); // +50% boost on top
    // event.setMultiplier(event.getMultiplier() + 0.25); // Multiplicative boost
    long level = event.getLevel();
}
```

### HoeCropBoostEvent — Modify crop drop amounts

```java
import me.rivaldev.harvesterhoes.api.events.HoeCropBoostEvent;

@EventHandler
public void onCropBoost(HoeCropBoostEvent event) {
    event.setAmount(event.getAmount() * 1.5);  // 1.5x crop drops
    event.setBoost(event.getBoost() + 0.25);   // Additive boost
    // event.setMultiplier(event.getMultiplier() + 0.1); // Multiplicative boost
}
```

### HoeAutoSellEvent — Customize auto-sell results and messages

```java
import me.rivaldev.harvesterhoes.api.events.HoeAutoSellEvent;
import org.bukkit.entity.Player;
import java.util.List;

@EventHandler
public void onAutoSell(HoeAutoSellEvent event) {
    Player player = event.getPlayer();
    double money = event.getMoney();
    double essence = event.getEssence();
    double items = event.getItems();

    // Modify payouts
    event.setMoney(money * 1.5);
    event.setEssence(essence + 10.0);
    event.setItems(items);

    // Modify auto-sell messages
    List<String> messages = event.getMessage();
    messages.add("&aBonus payout applied!");
    event.setMessage(messages);
}
```

### HoeMoneyReceiveEnchant — Modify money from enchant procs

```java
import me.rivaldev.harvesterhoes.api.events.HoeMoneyReceiveEnchant;

@EventHandler
public void onMoney(HoeMoneyReceiveEnchant event) {
    event.setMoney(event.getMoney() * 1.5);
    event.setBoost(event.getBoost() + 0.25);
    // event.setMultiplier(event.getMultiplier() + 0.1);
}
```

### Essence Events — Pre-enchant and post-enchant essence

```java
import me.rivaldev.harvesterhoes.api.events.HoeEssenceReceivePreEnchantEvent;
import me.rivaldev.harvesterhoes.api.events.HoeEssenceReceiveEnchantEvent;

// Pre-enchant: base essence before enchantments are factored in
@EventHandler
public void onPreEssence(HoeEssenceReceivePreEnchantEvent event) {
    event.setEssence(event.getEssence() + 5.0);
}

// Post-enchant: after enchantment boosts are applied
@EventHandler
public void onEssence(HoeEssenceReceiveEnchantEvent event) {
    event.setEssence(event.getEssence() * 1.2);
    event.setBoost(event.getBoost() + 0.1);
}
```

### Boost Events — Modify enchant/ability proc and finder chances

```java
import me.rivaldev.harvesterhoes.api.events.HoeEnchantProcBoostEvent;
import me.rivaldev.harvesterhoes.api.events.HoeEnchantModifyChance;
import me.rivaldev.harvesterhoes.api.events.HoeAbilityProcBoostEvent;
import me.rivaldev.harvesterhoes.api.events.HoeAbilityModifyChance;
import me.rivaldev.harvesterhoes.api.events.KeyFinderChanceBoostEvent;
import me.rivaldev.harvesterhoes.api.events.SpawnerFinderChanceBoostEvent;

@EventHandler
public void onEnchantProcBoost(HoeEnchantProcBoostEvent event) {
    event.setBoost(event.getBoost() + 0.25);
    long prestige = event.getPrestige();
}

@EventHandler
public void onEnchantChance(HoeEnchantModifyChance event) {
    String enchant = event.getEnchant();
    event.setBoost(event.getBoost() + 0.1);
}

@EventHandler
public void onAbilityProcBoost(HoeAbilityProcBoostEvent event) {
    event.setBoost(event.getBoost() + 0.25);
}

@EventHandler
public void onAbilityChance(HoeAbilityModifyChance event) {
    String ability = event.getAbility();
    event.setBoost(event.getBoost() + 0.1);
}

@EventHandler
public void onKeyBoost(KeyFinderChanceBoostEvent event) {
    event.setBoost(event.getBoost() + 0.10);
}

@EventHandler
public void onSpawnerBoost(SpawnerFinderChanceBoostEvent event) {
    event.setBoost(event.getBoost() + 0.10);
}
```

### HoeItemReceiveEvent — Modify item drops to player

```java
import me.rivaldev.harvesterhoes.api.events.HoeItemReceiveEvent;
import org.bukkit.inventory.ItemStack;

@EventHandler
public void onItemReceive(HoeItemReceiveEvent event) {
    ItemStack item = event.getItemStack();
    // Redirect drops to inventory instead of ground
    event.setGiveToInventory(true);
}
```

### HoeMenuOpenEvent — Cancel or intercept hoe menu opening (cancellable)

```java
import me.rivaldev.harvesterhoes.api.events.HoeMenuOpenEvent;

@EventHandler
public void onMenuOpen(HoeMenuOpenEvent event) {
    if (!event.getPlayer().hasPermission("myplugin.hoesmenu")) {
        event.setCancelled(true);
    }
}
```

### HoeMetaPreUpdateEvent — Modify hoe name/lore before display refresh

```java
import me.rivaldev.harvesterhoes.api.events.HoeMetaPreUpdateEvent;
import java.util.List;

@EventHandler
public void onMetaUpdate(HoeMetaPreUpdateEvent event) {
    List<String> lore = event.getLore();
    lore.add("&7Custom line added by my plugin");
    event.setLore(lore);
    // event.setName("&6Custom Hoe Name");
    // event.setItemStack(modifiedItemStack);
}
```

### HoeLoreUpdateEvent — Modify hoe lore after it is generated

```java
import me.rivaldev.harvesterhoes.api.events.HoeLoreUpdateEvent;
import java.util.List;

@EventHandler
public void onLoreUpdate(HoeLoreUpdateEvent event) {
    List<String> lore = event.getLore();
    lore.add("&eOwned by " + event.getPlayer().getName());
    event.setLore(lore);
}
```

### HoeUpgradeMenuOpen — Modify the upgrade GUI before it opens

```java
import me.rivaldev.harvesterhoes.api.events.HoeUpgradeMenuOpen;
import org.bukkit.inventory.Inventory;

@EventHandler
public void onUpgradeOpen(HoeUpgradeMenuOpen event) {
    Inventory inv = event.getInventory();
    // Modify inventory contents before player sees it
}
```

### RivalEXPFinderReceive — Modify EXP finder drops

```java
import me.rivaldev.harvesterhoes.api.events.RivalEXPFinderReceive;

@EventHandler
public void onEXPFinder(RivalEXPFinderReceive event) {
    event.setAmount(event.getAmount() * 2); // Double EXP finder reward
}
```

## Event Reference Table

| Event | Key Methods | Cancellable |
|---|---|---|
| `RivalBlockBreakEvent` | `getPlayer()`, `getCrop()`, `getMaterial()`, `getHoeItem()`, `getHoeLevel()`, `getHoePrestige()`, `getAmount()`, `setAmount(int)` | Yes |
| `HoeXPGainEvent` | `getXP()`, `setXP(double)`, `getBoost()`, `setBoost(double)`, `setMultiplier(double)`, `getLevel()`, `getCache()` | No |
| `HoeCropBoostEvent` | `getAmount()`, `setAmount(double)`, `getBoost()`, `setBoost(double)`, `setMultiplier(double)`, `getCache()` | No |
| `HoeAutoSellEvent` | `getMoney()`, `setMoney(double)`, `getEssence()`, `setEssence(double)`, `getItems()`, `setItems(double)`, `getMessage()`, `setMessage(List)` | No |
| `HoeMoneyReceiveEnchant` | `getMoney()`, `setMoney(double)`, `getBoost()`, `setBoost(double)`, `setMultiplier(double)` | No |
| `HoeEssenceReceivePreEnchantEvent` | `getEssence()`, `setEssence(double)` | No |
| `HoeEssenceReceiveEnchantEvent` | `getEssence()`, `setEssence(double)`, `getBoost()`, `setBoost(double)`, `setMultiplier(double)` | No |
| `HoeEnchantProcBoostEvent` | `getBoost()`, `setBoost(double)`, `setMultiplier(double)`, `getPrestige()`, `getCache()` | No |
| `HoeEnchantModifyChance` | `getEnchant()`, `getBoost()`, `setBoost(double)`, `setMultiplier(double)`, `getCache()` | No |
| `HoeAbilityProcBoostEvent` | `getBoost()`, `setBoost(double)`, `setMultiplier(double)`, `getPrestige()`, `getCache()` | No |
| `HoeAbilityModifyChance` | `getAbility()`, `getEnchant()`, `getBoost()`, `setBoost(double)`, `setMultiplier(double)`, `getCache()` | No |
| `HoeItemReceiveEvent` | `getItemStack()`, `isGiveToInventory()`, `setGiveToInventory(boolean)` | No |
| `HoeMenuOpenEvent` | `getPlayer()`, `isCancelled()`, `setCancelled(boolean)` | Yes |
| `HoeMetaPreUpdateEvent` | `getName()`, `setName(String)`, `getLore()`, `setLore(List)`, `getItemStack()`, `setItemStack(ItemStack)` | No |
| `HoeLoreUpdateEvent` | `getLore()`, `setLore(List)`, `getItemStack()`, `getPlayer()` | No |
| `HoeUpgradeMenuOpen` | `getInventory()`, `getPlayer()` | No |
| `RivalEXPFinderReceive` | `getAmount()`, `setAmount(long)`, `getPlayer()` | No |
| `KeyFinderChanceBoostEvent` | `getBoost()`, `setBoost(double)`, `setMultiplier(double)` | No |
| `SpawnerFinderChanceBoostEvent` | `getBoost()`, `setBoost(double)`, `setMultiplier(double)` | No |

## RivalHarvesterHoesAPI Methods

| Method | Description |
|---|---|
| `boolean isHoe(Player)` | Check if player is holding a harvester hoe |
| `void openMainMenu(Player)` | Open the main hoe upgrade menu |
| `void applyMetaToHoe(ItemStack, Player)` | Refresh hoe display (lore, name, enchants) |
| `void setEnchants(ItemStack, Player, String)` | Set enchants via config-key format string |
| `Material getMaterial()` | Get the configured hoe material type |
| `double getEssence(OfflinePlayer)` | Get player's essence balance |
| `void giveEssence(OfflinePlayer, double)` | Add essence to player |
| `void removeEssence(OfflinePlayer, double)` | Remove essence from player |
| `long getCropBalance(OfflinePlayer, String)` | Get crop count by material name |
| `void setCropBalance(OfflinePlayer, long, String)` | Set crop count by material name |
| `void setCropBalance(OfflinePlayer, long, Material)` | Set crop count by Material enum |
| `void registerEconomyManager(EconomyManager)` | Register a custom economy provider |

## EconomyManager Interface (`me.rivaldev.harvesterhoes.ecomanager.EconomyManager`)

| Method | Description |
|---|---|
| `String getEconomyName()` | Display name of the economy |
| `String getEconomyCommand()` | Command prefix for the economy |
| `double getEconomyAmount(OfflinePlayer)` | Get player's balance |
| `void giveEconomyAmount(OfflinePlayer, double)` | Add to player's balance |
| `void removeEconomyAmount(OfflinePlayer, double)` | Remove from player's balance |
