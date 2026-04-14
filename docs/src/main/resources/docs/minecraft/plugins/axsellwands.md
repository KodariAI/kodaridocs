# AxSellwands API Reference

Sell wand plugin by Artillex Studios. The API lets plugins register custom protection, price provider, currency, and container hooks, plus listen for sell events to modify payouts. Add `AxSellwands` to `depend` or `softdepend` in plugin.yml.

> **Important:** Custom price or currency providers will be overridden on `/axsellwands reload` unless you set `price-plugin: CUSTOM` or `economy-plugin: CUSTOM` in `hooks.yml`.

## Code Examples

### Listen for Sell Events

```java
import com.artillexstudios.axsellwands.api.events.AxSellwandsSellEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class SellListener implements Listener {

    @EventHandler
    public void onSell(AxSellwandsSellEvent event) {
        // Cancellable
        Player player = event.getPlayer();
        double money = event.getMoneyMade();
        int items = event.getItemsSold();

        // Modify the payout (e.g. 50% bonus for VIPs)
        if (player.hasPermission("vip.sellbonus")) {
            event.setMoneyMade(money * 1.5);
        }

        // Or cancel entirely
        // event.setCancelled(true);
    }
}
```

### Register a Custom Protection Hook

```java
import com.artillexstudios.axsellwands.hooks.HookManager;
import com.artillexstudios.axsellwands.hooks.protection.ProtectionHook;
import org.bukkit.plugin.java.JavaPlugin;

JavaPlugin plugin = /* your plugin */;

HookManager.registerProtectionHook(plugin, (player, location) -> {
    // Return false to block sell wand use at this location
    return MyProtection.canBuild(player, location);
});
```

### Register a Custom Price Provider

```java
import com.artillexstudios.axsellwands.hooks.HookManager;
import com.artillexstudios.axsellwands.hooks.shop.PricesHook;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

HookManager.registerPriceProviderHook(plugin, new PricesHook() {
    @Override
    public void setup() {}

    @Override
    public double getPrice(ItemStack item) {
        return MyShop.getSellPrice(item);
    }

    @Override
    public double getPrice(Player player, ItemStack item) {
        return MyShop.getSellPriceFor(player, item);
    }
});
// REQUIRED: set price-plugin: CUSTOM in hooks.yml
```

### Register a Custom Currency Hook

```java
import com.artillexstudios.axsellwands.hooks.HookManager;
import com.artillexstudios.axsellwands.hooks.currency.CurrencyHook;
import org.bukkit.entity.Player;

HookManager.registerCurrencyHook(plugin, new CurrencyHook() {
    @Override
    public void setup() {}

    @Override
    public double getBalance(Player p) {
        return MyEconomy.getBalance(p);
    }

    @Override
    public void giveBalance(Player p, double amount) {
        MyEconomy.give(p, amount);
    }

    @Override
    public void takeBalance(Player p, double amount) {
        MyEconomy.take(p, amount);
    }
});
// REQUIRED: set economy-plugin: CUSTOM in hooks.yml
```

### Query Sellwand Configurations

```java
import com.artillexstudios.axsellwands.sellwands.Sellwand;
import com.artillexstudios.axsellwands.sellwands.Sellwands;

import java.util.HashMap;

HashMap<String, Sellwand> allWands = Sellwands.getSellwands();
Sellwand wand = allWands.get("normal-sellwand");

if (wand != null) {
    String displayName = wand.getName();
    float multiplier = wand.getMultiplier();
    int maxUses = wand.getUses();         // -1 = unlimited
    long cooldownMs = wand.getCooldown();
}
```

### Utility Hook Methods

```java
import com.artillexstudios.axsellwands.hooks.HookManager;
import com.artillexstudios.axsellwands.hooks.container.ContainerHook;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

Player player = /* ... */;
Location location = /* ... */;
Block block = /* ... */;

// Check all registered protection hooks
boolean canBuild = HookManager.canBuildAt(player, location);

// Check if block is a custom container
ContainerHook hook = HookManager.getContainerAt(player, block);
if (hook != null) {
    java.util.List<org.bukkit.inventory.ItemStack> items = hook.getItems(player, block);
}
```

## API Reference (Trimmed)

### `com.artillexstudios.axsellwands.hooks.HookManager` (all static)

| Return | Method | Description |
|---|---|---|
| `void` | `registerProtectionHook(Plugin, ProtectionHook)` | Register protection check |
| `void` | `registerPriceProviderHook(Plugin, PricesHook)` | Register custom price provider |
| `void` | `registerCurrencyHook(Plugin, CurrencyHook)` | Register custom currency |
| `CurrencyHook` | `getCurrency()` | Active currency hook |
| `PricesHook` | `getShopPrices()` | Active price hook |
| `boolean` | `canBuildAt(Player, Location)` | Check all protection hooks |
| `ContainerHook` | `getContainerAt(Player, Block)` | Get container hook for block |

### Hook Interfaces

**`ProtectionHook`** (`com.artillexstudios.axsellwands.hooks.protection`):
- `boolean canPlayerBuildAt(Player, Location)`

**`PricesHook`** (`com.artillexstudios.axsellwands.hooks.shop`):
- `void setup()`
- `double getPrice(ItemStack)`
- `double getPrice(Player, ItemStack)`

**`CurrencyHook`** (`com.artillexstudios.axsellwands.hooks.currency`):
- `void setup()`
- `double getBalance(Player)`
- `void giveBalance(Player, double)`
- `void takeBalance(Player, double)`

**`ContainerHook`** (`com.artillexstudios.axsellwands.hooks.container`):
- `boolean isContainer(Player, Block)`
- `List<ItemStack> getItems(Player, Block)`

### `com.artillexstudios.axsellwands.sellwands.Sellwand`

| Return | Method | Description |
|---|---|---|
| `String` | `getId()` | Sellwand ID (filename) |
| `String` | `getName()` | Display name |
| `float` | `getMultiplier()` | Price multiplier |
| `int` | `getUses()` | Max uses (-1 = unlimited) |
| `long` | `getCooldown()` | Cooldown in ms |
| `HashSet<Material>` | `getDisallowed()` | Blocked container materials |
| `HashSet<Material>` | `getAllowed()` | Allowed container materials |

### `com.artillexstudios.axsellwands.sellwands.Sellwands`

| Return | Method | Description |
|---|---|---|
| `static HashMap<String, Sellwand>` | `getSellwands()` | All loaded sellwand types |

### Events (`com.artillexstudios.axsellwands.api.events`)

| Event | Cancellable | Key Methods |
|---|---|---|
| `AxSellwandsSellEvent` | Yes | `getPlayer()`, `getMoneyMade()`, `setMoneyMade(double)`, `getItemsSold()` |

### Built-in Provider Options

- **Price sources** (for `hooks.yml` `price-plugin`): `AXGENS`, `SHOPGUIPLUS`, `ESSENTIALS`, `CMI`, `ECONOMYSHOPGUI`, `DYNAMICSHOP`, `EXCELLENTSHOP`, `BUILTIN`, `CUSTOM`
- **Currency sources** (for `hooks.yml` `economy-plugin`): `VAULT`, `PLAYERPOINTS`, `COINSENGINE`, `EXCELLENTECONOMY`, `ROYALEECONOMY`, `CUSTOM`
