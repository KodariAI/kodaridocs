# RivalFishingRodsAPI

Custom fishing rod tool plugin by Rival Development. Rods have custom enchantments, XP/leveling, essence currency, and auto-sell. The API lets you create rods programmatically, open the upgrade menu, register a custom economy, and listen to fishing-related events.

> Note: These are premium plugins with limited public API docs. Examples below are derived from known method signatures and patterns shared across all Rival Tools plugins.

## Core API

```java
import me.rivaldev.fishingrod.rivalfishingrods.api.RivalFishingRodsAPI;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

RivalFishingRodsAPI api = new RivalFishingRodsAPI();

// Open the main fishing rod menu for a player
api.openMainMenu(player);

// Apply rod meta (lore, name, enchant display) to an existing fishing rod ItemStack
api.applyMetaToFishingRod(itemStack, player);

// Set specific enchants on a rod — enchantData is config-key format (e.g. "AutoSell:5;Essence:3")
api.setEnchants(itemStack, player, enchantData);
```

## Custom Economy Integration

All Rival Tools plugins share an `EconomyManager` interface. Implement it to replace Vault/default economy.

```java
import me.rivaldev.fishingrod.rivalfishingrods.api.RivalFishingRodsAPI;
import me.rivaldev.fishingrod.rivalfishingrods.ecomanager.EconomyManager;
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
RivalFishingRodsAPI api = new RivalFishingRodsAPI();
api.registerEconomy(new MyCustomEconomy());
```

## Events

All events are in `me.rivaldev.fishingrod.rivalfishingrods.api`.

### RodXPGainEvent — Modify XP from fishing

```java
import me.rivaldev.fishingrod.rivalfishingrods.api.RodXPGainEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FishingListener implements Listener {

    @EventHandler
    public void onXPGain(RodXPGainEvent event) {
        // Double all XP
        event.setXP(event.getXP() * 2.0);
    }
}
```

### RodMoneyReceiveEvent — Modify money earned

```java
import me.rivaldev.fishingrod.rivalfishingrods.api.RodMoneyReceiveEvent;

@EventHandler
public void onMoney(RodMoneyReceiveEvent event) {
    event.setMoney(event.getMoney() * 1.5);
}
```

### RodEssenceReceiveEvent — Modify essence earned

```java
import me.rivaldev.fishingrod.rivalfishingrods.api.RodEssenceReceiveEvent;

@EventHandler
public void onEssence(RodEssenceReceiveEvent event) {
    event.setEssence(event.getEssence() + 10.0);
}
```

### RodAutoSellEvent — Customize auto-sell messages

```java
import me.rivaldev.fishingrod.rivalfishingrods.api.RodAutoSellEvent;
import java.util.List;

@EventHandler
public void onAutoSell(RodAutoSellEvent event) {
    List<String> messages = event.getMessage();
    messages.add("&aAuto-sell complete!");
    event.setMessage(messages);
}
```

### RodMetaPreUpdateEvent — Modify rod name/lore before display refresh

```java
import me.rivaldev.fishingrod.rivalfishingrods.api.RodMetaPreUpdateEvent;
import java.util.List;

@EventHandler
public void onMetaUpdate(RodMetaPreUpdateEvent event) {
    List<String> lore = event.getLore();
    lore.add("&7Custom line added by my plugin");
    event.setLore(lore);
}
```

### Boost Events — Modify proc/finder chances

```java
import me.rivaldev.fishingrod.rivalfishingrods.api.RodEnchantProcBoostEvent;
import me.rivaldev.fishingrod.rivalfishingrods.api.KeyFinderChanceBoostEvent;
import me.rivaldev.fishingrod.rivalfishingrods.api.SpawnerFinderChanceBoostEvent;

@EventHandler
public void onProcBoost(RodEnchantProcBoostEvent event) {
    event.setBoost(event.getBoost() + 0.25); // +25% proc chance
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

### RodUpgradeMenuOpen — Modify the upgrade GUI before it opens

```java
import me.rivaldev.fishingrod.rivalfishingrods.api.RodUpgradeMenuOpen;
import org.bukkit.inventory.Inventory;

@EventHandler
public void onMenuOpen(RodUpgradeMenuOpen event) {
    Inventory inv = event.getInventory();
    // Modify inventory contents before player sees it
}
```

## Event Reference Table

| Event | Key Methods | Description |
|---|---|---|
| `RodXPGainEvent` | `getXP()`, `setXP(double)`, `getPlayer()`, `getNbt()` | Rod gains XP from fishing |
| `RodMoneyReceiveEvent` | `getMoney()`, `setMoney(double)`, `getPlayer()` | Player earns money |
| `RodEssenceReceiveEvent` | `getEssence()`, `setEssence(double)`, `getPlayer()` | Player earns essence |
| `RodAutoSellEvent` | `getMessage()`, `setMessage(List)`, `getPlayer()` | Auto-sell triggers |
| `RodMetaPreUpdateEvent` | `getName()`, `setName(String)`, `getLore()`, `setLore(List)`, `getItemStack()` | Rod display refreshes |
| `RodEnchantProcBoostEvent` | `getBoost()`, `setBoost(double)`, `getPlayer()` | Enchant proc chance modifier |
| `KeyFinderChanceBoostEvent` | `getBoost()`, `setBoost(double)`, `getPlayer()` | Key finder chance modifier |
| `SpawnerFinderChanceBoostEvent` | `getBoost()`, `setBoost(double)`, `getPlayer()` | Spawner finder chance modifier |
| `RodUpgradeMenuOpen` | `getInventory()`, `getPlayer()` | Upgrade menu about to open |
