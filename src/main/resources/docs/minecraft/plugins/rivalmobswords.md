# RivalMobSwordsAPI

Custom mob sword tool plugin by Rival Development. Swords have custom enchantments, XP/leveling, prestige, essence currency, and auto-sell on mob kills. The API lets you create swords programmatically, open the upgrade menu, register a custom economy, and listen to kill/enchant events.

> Note: These are premium plugins with limited public API docs. Examples below are derived from known method signatures and patterns shared across all Rival Tools plugins.

## Core API

```java
import me.rivaldev.mobsword.rivalmobswords.api.RivalMobSwordsAPI;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

RivalMobSwordsAPI api = new RivalMobSwordsAPI();

// Open the main mob sword menu for a player
api.openMainMenu(player);

// Apply sword meta (lore, name, enchant display) to an existing ItemStack
api.applyMetaToSword(itemStack, player);

// Set specific enchants — enchantData is config-key format (e.g. "AutoSell:5;Looting:3")
api.setEnchants(itemStack, player, enchantData);

// Get the configured sword material type
Material swordMaterial = api.getMaterial();
```

## Custom Economy Integration

Implement the `EconomyManager` interface to replace Vault or the default economy.

```java
import me.rivaldev.mobsword.rivalmobswords.ecomanager.EconomyManager;
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
RivalMobSwordsAPI api = new RivalMobSwordsAPI();
api.registerEconomy(new MyCustomEconomy());
```

## Events

All events are in `me.rivaldev.mobsword.rivalmobswords.api`.

### RivalMobKillEvent — Core mob kill event (cancellable)

The most important event. Fires when a player kills a mob with a Rival Mob Sword.

```java
import me.rivaldev.mobsword.rivalmobswords.api.RivalMobKillEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import java.util.ArrayList;
import java.util.List;

public class MobKillListener implements Listener {

    @EventHandler
    public void onMobKill(RivalMobKillEvent event) {
        Player player = event.getPlayer();
        Entity mob = event.getEntity();
        String mode = event.getMode();
        double procBoost = event.getProcboost();
        List<String> drops = event.getDrops();

        // Modify drop list
        ArrayList<String> newDrops = new ArrayList<>(drops);
        newDrops.add("DIAMOND:1");
        event.setDrops(newDrops);

        // Modify proc boost
        event.setProcboost(procBoost + 0.5);
    }
}
```

### RivalMobHitEvent — Fires on every hit (cancellable)

```java
import me.rivaldev.mobsword.rivalmobswords.api.RivalMobHitEvent;

@EventHandler
public void onMobHit(RivalMobHitEvent event) {
    if (event.isCancelled()) return;
    Player player = event.getPlayer();
    Entity entity = event.getEntity();
    // Cancel the Rival Mob Sword processing for this hit
    // event.setCancelled(true);
}
```

### SwordXPGainEvent — Modify XP gained per kill

```java
import me.rivaldev.mobsword.rivalmobswords.api.SwordXPGainEvent;

@EventHandler
public void onXPGain(SwordXPGainEvent event) {
    event.setXP(event.getXP() * 2.0);     // Double XP
    event.setBoost(event.getBoost() + 0.5); // +50% boost on top
}
```

### SwordMoneyReceiveEvent — Modify money from kills

```java
import me.rivaldev.mobsword.rivalmobswords.api.SwordMoneyReceiveEvent;

@EventHandler
public void onMoney(SwordMoneyReceiveEvent event) {
    event.setMoney(event.getMoney() * 1.5);
    event.setBoost(event.getBoost() + 0.25);
}
```

### SwordEssenceReceiveEnchantEvent / SwordEssenceReceivePreEnchantEvent

```java
import me.rivaldev.mobsword.rivalmobswords.api.SwordEssenceReceiveEnchantEvent;
import me.rivaldev.mobsword.rivalmobswords.api.SwordEssenceReceivePreEnchantEvent;

// Pre-enchant: base essence before enchantments are factored in
@EventHandler
public void onPreEssence(SwordEssenceReceivePreEnchantEvent event) {
    event.setEssence(event.getEssence() + 5.0);
}

// Post-enchant: after enchantment boosts are applied
@EventHandler
public void onEssence(SwordEssenceReceiveEnchantEvent event) {
    event.setEssence(event.getEssence() * 1.2);
    event.setBoost(event.getBoost() + 0.1);
}
```

### SwordLevelUpEvent / SwordPrestigeEvent

```java
import me.rivaldev.mobsword.rivalmobswords.api.SwordLevelUpEvent;
import me.rivaldev.mobsword.rivalmobswords.api.SwordPrestigeEvent;

@EventHandler
public void onLevelUp(SwordLevelUpEvent event) {
    event.getPlayer().sendMessage("Sword reached level " + event.getLevel() + "!");
}

@EventHandler
public void onPrestige(SwordPrestigeEvent event) {
    event.getPlayer().sendMessage("Sword prestige " + event.getPrestige() + "!");
}
```

### SwordAutoSellEvent — Customize auto-sell messages

```java
import me.rivaldev.mobsword.rivalmobswords.api.SwordAutoSellEvent;

@EventHandler
public void onAutoSell(SwordAutoSellEvent event) {
    event.setMessage(event.getMessage());
}
```

### SwordMetaPreUpdateEvent — Modify sword name/lore before display refresh

```java
import me.rivaldev.mobsword.rivalmobswords.api.SwordMetaPreUpdateEvent;
import java.util.List;

@EventHandler
public void onMetaUpdate(SwordMetaPreUpdateEvent event) {
    List<String> lore = event.getLore();
    lore.add("&7Custom line");
    event.setLore(lore);
    // event.setName("&6Custom Sword Name");
}
```

### Enchant Purchase/Disenchant Events

```java
import me.rivaldev.mobsword.rivalmobswords.api.EnchantPurchaseEvent;
import me.rivaldev.mobsword.rivalmobswords.api.EnchantDisenchantEvent;

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
import me.rivaldev.mobsword.rivalmobswords.api.SwordEnchantProcBoostEvent;
import me.rivaldev.mobsword.rivalmobswords.api.SwordEnchantModifyChance;
import me.rivaldev.mobsword.rivalmobswords.api.KeyFinderChanceBoostEvent;
import me.rivaldev.mobsword.rivalmobswords.api.SpawnerFinderChanceBoostEvent;
import me.rivaldev.mobsword.rivalmobswords.api.SwordLootingEvent;

@EventHandler
public void onProcBoost(SwordEnchantProcBoostEvent event) {
    event.setBoost(event.getBoost() + 0.25);
}

@EventHandler
public void onEnchantChance(SwordEnchantModifyChance event) {
    String enchant = event.getEnchant();
    long level = event.getLevel();
    event.setBoost(event.getBoost() + 0.1);
}

@EventHandler
public void onLooting(SwordLootingEvent event) {
    event.setAmount(event.getAmount() * 2.0);
}
```

### SwordItemReceiveEvent — Modify item drops to player

```java
import me.rivaldev.mobsword.rivalmobswords.api.SwordItemReceiveEvent;
import org.bukkit.inventory.ItemStack;

@EventHandler
public void onItemReceive(SwordItemReceiveEvent event) {
    ItemStack item = event.getItemStack();
    // Redirect drop to inventory instead of ground
    event.setGiveToInventory(true);
}
```

## Event Reference Table

| Event | Key Methods | Cancellable |
|---|---|---|
| `RivalMobKillEvent` | `getPlayer()`, `getEntity()`, `getMode()`, `getDrops()`, `setDrops(ArrayList)`, `getProcboost()`, `setProcboost(double)` | No |
| `RivalMobHitEvent` | `getPlayer()`, `getEntity()`, `getObject()`, `setCancelled(boolean)` | Yes |
| `SwordXPGainEvent` | `getXP()`, `setXP(double)`, `getBoost()`, `setBoost(double)` | No |
| `SwordMoneyReceiveEvent` | `getMoney()`, `setMoney(double)`, `getBoost()`, `setBoost(double)` | No |
| `SwordEssenceReceivePreEnchantEvent` | `getEssence()`, `setEssence(double)` | No |
| `SwordEssenceReceiveEnchantEvent` | `getEssence()`, `setEssence(double)`, `getBoost()`, `setBoost(double)` | No |
| `SwordLevelUpEvent` | `getLevel()`, `getPlayer()` | No |
| `SwordPrestigeEvent` | `getPrestige()`, `getPlayer()` | No |
| `SwordAutoSellEvent` | `getMessage()`, `setMessage(List)` | No |
| `SwordMetaPreUpdateEvent` | `getName()`, `setName(String)`, `getLore()`, `setLore(List)`, `getItemStack()` | No |
| `EnchantPurchaseEvent` | `getEnchant()`, `getAmount()`, `getPlayer()` | No |
| `EnchantDisenchantEvent` | `getEnchant()`, `getAmount()`, `getPlayer()` | No |
| `SwordEnchantProcBoostEvent` | `getBoost()`, `setBoost(double)` | No |
| `SwordEnchantModifyChance` | `getEnchant()`, `getLevel()`, `getBoost()`, `setBoost(double)` | No |
| `SwordLootingEvent` | `getAmount()`, `setAmount(double)` | No |
| `SwordItemReceiveEvent` | `getItemStack()`, `isGiveToInventory()`, `setGiveToInventory(boolean)` | No |
| `SwordEXPReceiveEvent` | `getEXP()`, `setEXP(int)` | No |
| `KeyFinderChanceBoostEvent` | `getBoost()`, `setBoost(double)` | No |
| `SpawnerFinderChanceBoostEvent` | `getBoost()`, `setBoost(double)` | No |
| `SwordUpgradeMenuOpen` | `getInventory()`, `getPlayer()` | No |
