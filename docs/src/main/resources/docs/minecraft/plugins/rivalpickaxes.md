# RivalPickaxesAPI

Custom pickaxe tool plugin by Rival Development. Pickaxes have custom enchantments, XP/leveling, prestige, essence currency, auto-sell, mine blocks, and fortune boosts. The API lets you manage blocks/essence, open menus, apply pickaxe meta, register a custom economy, and listen to mining/enchant events.

> Note: These are premium plugins with limited public API docs. Examples below are derived from known method signatures and patterns shared across all Rival Tools plugins.

## Core API

```java
import me.rivaldev.pickaxes.api.events.RivalPickaxesAPI;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

RivalPickaxesAPI api = new RivalPickaxesAPI();

// Open the main pickaxe menu for a player
api.openMainMenu(player);

// Apply pickaxe meta (lore, name, enchant display) to an existing ItemStack
api.applyMetaToPickaxe(itemStack, player);

// Set specific enchants — enchantData is config-key format (e.g. "AutoSell:5;Essence:3")
api.setEnchants(itemStack, player, enchantData);

// Get the configured pickaxe material type
Material pickMaterial = api.getMaterial();

// Check if a player is currently holding a Rival Pickaxe
boolean holding = api.isPickaxe(player);
```

## Blocks and Essence Management

```java
import me.rivaldev.pickaxes.api.events.RivalPickaxesAPI;
import org.bukkit.OfflinePlayer;

RivalPickaxesAPI api = new RivalPickaxesAPI();

// Get a player's total blocks mined
long blocks = api.getBlocks(offlinePlayer);

// Set a player's blocks mined count
api.setBlocks(offlinePlayer, 5000L);

// Get a player's essence balance
double essence = api.getEssence(offlinePlayer);

// Give essence to a player
api.giveEssence(offlinePlayer, 100.0);

// Remove essence from a player
api.removeEssence(offlinePlayer, 50.0);
```

### Full Example — Bonus Essence on Block Break

```java
import me.rivaldev.pickaxes.api.events.RivalPickaxesAPI;
import me.rivaldev.pickaxes.api.events.RivalPickaxesBlockBreakEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BonusEssenceListener implements Listener {

    @EventHandler
    public void onRivalBreak(RivalPickaxesBlockBreakEvent event) {
        if (event.isCancelled()) return;
        Player player = event.getPlayer();

        RivalPickaxesAPI api = new RivalPickaxesAPI();
        api.giveEssence(player, 5.0);
    }
}
```

## Custom Economy Integration

All Rival Tools plugins share an `EconomyManager` interface. Implement it to replace Vault/default economy.

```java
import me.rivaldev.pickaxes.api.events.RivalPickaxesAPI;
import me.rivaldev.pickaxes.ecomanager.EconomyManager;
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
RivalPickaxesAPI api = new RivalPickaxesAPI();
api.registerEconomyManager(new MyCustomEconomy());
```

## Events

All events are in `me.rivaldev.pickaxes.api.events`.

### RivalPickaxesBlockBreakEvent — Core block break event (cancellable)

The most important event. Fires when a player breaks a block with a Rival Pickaxe.

```java
import me.rivaldev.pickaxes.api.events.RivalPickaxesBlockBreakEvent;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MiningListener implements Listener {

    @EventHandler
    public void onRivalBreak(RivalPickaxesBlockBreakEvent event) {
        if (event.isCancelled()) return;

        Player player = event.getPlayer();
        Block block = event.getBlock();
        boolean natural = event.isNatural();
        String mineType = event.getMineType();

        // Only process natural blocks
        if (!natural) {
            event.setCancelled(true);
            return;
        }

        // Change the mine type for custom logic
        // event.setMineType("custom_mine");
    }
}
```

### PickaxeXPGainEvent — Modify XP gained per break

```java
import me.rivaldev.pickaxes.api.events.PickaxeXPGainEvent;

@EventHandler
public void onXPGain(PickaxeXPGainEvent event) {
    event.setXP(event.getXP() * 2.0); // Double XP
}
```

### PickaxeMoneyReceiveEnchant — Modify money from mining

```java
import me.rivaldev.pickaxes.api.events.PickaxeMoneyReceiveEnchant;

@EventHandler
public void onMoney(PickaxeMoneyReceiveEnchant event) {
    event.setMoney(event.getMoney() * 1.5);
    event.setBoost(event.getBoost() + 0.25);
}
```

### PickaxeEssenceReceiveEnchantEvent / PickaxeEssenceReceivePreEnchantEvent

```java
import me.rivaldev.pickaxes.api.events.PickaxeEssenceReceiveEnchantEvent;
import me.rivaldev.pickaxes.api.events.PickaxeEssenceReceivePreEnchantEvent;

// Pre-enchant: base essence before enchantments are factored in
@EventHandler
public void onPreEssence(PickaxeEssenceReceivePreEnchantEvent event) {
    event.setEssence(event.getEssence() + 5.0);
}

// Post-enchant: after enchantment boosts are applied
@EventHandler
public void onEssence(PickaxeEssenceReceiveEnchantEvent event) {
    event.setEssence(event.getEssence() * 1.2);
    event.setBoost(event.getBoost() + 0.1);
}
```

### PickaxeLevelUpEvent / PickaxePrestigeEvent

```java
import me.rivaldev.pickaxes.api.events.PickaxeLevelUpEvent;
import me.rivaldev.pickaxes.api.events.PickaxePrestigeEvent;

@EventHandler
public void onLevelUp(PickaxeLevelUpEvent event) {
    event.getPlayer().sendMessage("Pickaxe reached level " + event.getLevel() + "!");
}

@EventHandler
public void onPrestige(PickaxePrestigeEvent event) {
    event.getPlayer().sendMessage("Pickaxe prestige " + event.getPrestige() + "!");
}
```

### PickaxeAutoSellEvent — Customize auto-sell messages

```java
import me.rivaldev.pickaxes.api.events.PickaxeAutoSellEvent;
import java.util.List;

@EventHandler
public void onAutoSell(PickaxeAutoSellEvent event) {
    List<String> messages = event.getMessage();
    messages.add("&aAuto-sell complete!");
    event.setMessage(messages);
}
```

### PickaxeFortuneBoostEvent — Modify fortune drops

```java
import me.rivaldev.pickaxes.api.events.PickaxeFortuneBoostEvent;

@EventHandler
public void onFortune(PickaxeFortuneBoostEvent event) {
    event.setAmount(event.getAmount() * 2.0); // Double fortune drops
}
```

### PickaxeMetaPreUpdateEvent — Modify pickaxe name/lore before display refresh

```java
import me.rivaldev.pickaxes.api.events.PickaxeMetaPreUpdateEvent;
import java.util.List;

@EventHandler
public void onMetaUpdate(PickaxeMetaPreUpdateEvent event) {
    List<String> lore = event.getLore();
    lore.add("&7Custom line added by my plugin");
    event.setLore(lore);
    // event.setName("&6Custom Pickaxe Name");
}
```

### Enchant Purchase/Disenchant Events

```java
import me.rivaldev.pickaxes.api.events.EnchantPurchaseEvent;
import me.rivaldev.pickaxes.api.events.EnchantDisenchantEvent;

@EventHandler
public void onPurchase(EnchantPurchaseEvent event) {
    String enchant = event.getEnchant();
    int levels = event.getAmount();
    event.getPlayer().sendMessage("Bought " + levels + "x " + enchant);
}

@EventHandler
public void onDisenchant(EnchantDisenchantEvent event) {
    String enchant = event.getEnchant();
    int levels = event.getAmount();
}
```

### Boost Events — Modify proc/finder chances

```java
import me.rivaldev.pickaxes.api.events.PickaxeEnchantProcBoostEvent;
import me.rivaldev.pickaxes.api.events.PickaxeEnchantModifyChance;
import me.rivaldev.pickaxes.api.events.KeyFinderChanceBoostEvent;
import me.rivaldev.pickaxes.api.events.SpawnerFinderChanceBoostEvent;

@EventHandler
public void onProcBoost(PickaxeEnchantProcBoostEvent event) {
    event.setBoost(event.getBoost() + 0.25); // +25% proc chance
}

@EventHandler
public void onEnchantChance(PickaxeEnchantModifyChance event) {
    String enchant = event.getEnchant();
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

### PickaxeItemReceiveEvent — Modify item drops to player

```java
import me.rivaldev.pickaxes.api.events.PickaxeItemReceiveEvent;
import org.bukkit.inventory.ItemStack;

@EventHandler
public void onItemReceive(PickaxeItemReceiveEvent event) {
    ItemStack item = event.getItemStack();
    // Redirect drop to inventory instead of ground
    event.setGiveToInventory(true);
}
```

### PickaxeLoreUpdateEvent — Modify lore during updates

```java
import me.rivaldev.pickaxes.api.events.PickaxeLoreUpdateEvent;
import java.util.List;

@EventHandler
public void onLoreUpdate(PickaxeLoreUpdateEvent event) {
    List<String> lore = event.getLore();
    lore.add("&eCustom footer line");
    event.setLore(lore);
}
```

### PickaxeUpgradeMenuOpen — Modify the upgrade GUI before it opens

```java
import me.rivaldev.pickaxes.api.events.PickaxeUpgradeMenuOpen;
import org.bukkit.inventory.Inventory;

@EventHandler
public void onMenuOpen(PickaxeUpgradeMenuOpen event) {
    Inventory inv = event.getInventory();
    // Modify inventory contents before player sees it
}
```

### PickaxeEXPFinderReceive — Modify XP finder amounts

```java
import me.rivaldev.pickaxes.api.events.PickaxeEXPFinderReceive;

@EventHandler
public void onEXPFinder(PickaxeEXPFinderReceive event) {
    event.setAmount(event.getAmount() * 2); // Double XP finder drops
}
```

## Event Reference Table

| Event | Key Methods | Cancellable |
|---|---|---|
| `RivalPickaxesBlockBreakEvent` | `getPlayer()`, `getBlock()`, `getNBT()`, `isNatural()`, `setNatural(boolean)`, `getMineType()`, `setMineType(String)`, `getMineBlock()` | Yes |
| `PickaxeXPGainEvent` | `getXP()`, `setXP(double)`, `getPlayer()`, `getNbt()` | No |
| `PickaxeMoneyReceiveEnchant` | `getMoney()`, `setMoney(double)`, `getBoost()`, `setBoost(double)`, `getPlayer()` | No |
| `PickaxeEssenceReceivePreEnchantEvent` | `getEssence()`, `setEssence(double)`, `getPlayer()` | No |
| `PickaxeEssenceReceiveEnchantEvent` | `getEssence()`, `setEssence(double)`, `getBoost()`, `setBoost(double)`, `getPlayer()` | No |
| `PickaxeLevelUpEvent` | `getLevel()`, `getPlayer()` | No |
| `PickaxePrestigeEvent` | `getPrestige()`, `getPlayer()` | No |
| `PickaxeAutoSellEvent` | `getMessage()`, `setMessage(List)`, `getPlayer()` | No |
| `PickaxeFortuneBoostEvent` | `getAmount()`, `setAmount(double)`, `getPlayer()` | No |
| `PickaxeMetaPreUpdateEvent` | `getName()`, `setName(String)`, `getLore()`, `setLore(List)`, `getItemStack()` | No |
| `PickaxeLoreUpdateEvent` | `getLore()`, `setLore(List)`, `getItemStack()`, `getPlayer()` | No |
| `EnchantPurchaseEvent` | `getEnchant()`, `getAmount()`, `getPlayer()` | No |
| `EnchantDisenchantEvent` | `getEnchant()`, `getAmount()`, `getPlayer()` | No |
| `PickaxeEnchantProcBoostEvent` | `getBoost()`, `setBoost(double)`, `getLevel()`, `getPrestige()`, `getPlayer()` | No |
| `PickaxeEnchantModifyChance` | `getEnchant()`, `getBoost()`, `setBoost(double)`, `getPlayer()` | No |
| `PickaxeItemReceiveEvent` | `getItemStack()`, `isGiveToInventory()`, `setGiveToInventory(boolean)`, `getPlayer()` | No |
| `PickaxeEXPFinderReceive` | `getAmount()`, `setAmount(long)`, `getPlayer()` | No |
| `KeyFinderChanceBoostEvent` | `getBoost()`, `setBoost(double)`, `getPlayer()` | No |
| `SpawnerFinderChanceBoostEvent` | `getBoost()`, `setBoost(double)`, `getPlayer()` | No |
| `PickaxeUpgradeMenuOpen` | `getInventory()`, `getPlayer()` | No |
| `ShopPurchaseEvent` | `getPlayer()` | No |

## API Reference — `me.rivaldev.pickaxes.api.events.RivalPickaxesAPI`

| Method | Returns |
|---|---|
| `openMainMenu(Player)` | `void` |
| `applyMetaToPickaxe(ItemStack, Player)` | `void` |
| `setEnchants(ItemStack, Player, String)` | `void` |
| `getMaterial()` | `Material` |
| `isPickaxe(Player)` | `boolean` |
| `getBlocks(OfflinePlayer)` | `long` |
| `setBlocks(OfflinePlayer, long)` | `void` |
| `getEssence(OfflinePlayer)` | `double` |
| `giveEssence(OfflinePlayer, double)` | `void` |
| `removeEssence(OfflinePlayer, double)` | `void` |
| `registerEconomyManager(EconomyManager)` | `void` |
