# RivalCreditsAPI

Custom server economy plugin by Rival Development. Lets players earn, spend, and trade "credits" through a configurable shop system. The API provides balance management and a purchase event hook.

> Note: These are premium plugins with limited public API docs. Examples below are derived from the known method signatures and official docs at docs.rivaldev.xyz.

## Core API — Balance Management

The primary API class for all credit operations. Access it statically.

```java
import me.rivaldev.credits.api.RivalCreditsAPI;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

RivalCreditsAPI api = new RivalCreditsAPI();

// Get a player's credit balance
double balance = api.getCredits(player);
// or
double balance = api.getBalance(player);

// Give credits
api.giveCredits(player, 500.0);

// Remove credits
api.removeCredits(player, 100.0);

// Set credits to an exact amount
api.setCredits(player, 1000.0);
```

### Full Example — Reward on Kill

```java
import me.rivaldev.credits.api.RivalCreditsAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillRewardListener implements Listener {

    @EventHandler
    public void onPlayerKill(PlayerDeathEvent event) {
        Player killer = event.getEntity().getKiller();
        if (killer == null) return;

        RivalCreditsAPI api = new RivalCreditsAPI();
        api.giveCredits(killer, 50.0);
        killer.sendMessage("You earned 50 credits for the kill!");
    }
}
```

## RivalCreditsAPI Methods

| Method | Description |
|---|---|
| `double getCredits(OfflinePlayer)` | Get current credit balance |
| `double getBalance(OfflinePlayer)` | Same as getCredits |
| `void giveCredits(OfflinePlayer, double)` | Add credits to balance |
| `void removeCredits(OfflinePlayer, double)` | Subtract credits from balance |
| `void setCredits(OfflinePlayer, double)` | Set balance to exact value |

## Event — RivalPackagePurchaseEvent

Fired when a player purchases a package from the credits shop.

```java
import me.rivaldev.credits.api.RivalPackagePurchaseEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PurchaseListener implements Listener {

    @EventHandler
    public void onPackagePurchase(RivalPackagePurchaseEvent event) {
        Player player = event.getPlayer();
        String category = event.getCategory();
        String packageName = event.getPackage();
        double price = event.getPrice();

        player.sendMessage("You bought " + packageName
            + " from " + category + " for " + price + " credits!");
    }
}
```

### RivalPackagePurchaseEvent Methods

| Method | Returns | Description |
|---|---|---|
| `getPlayer()` | `Player` | The buyer |
| `getCategory()` | `String` | Shop category name |
| `getPackage()` | `String` | Package identifier |
| `getPrice()` | `double` | Amount paid |

## Accessing the Legacy CreditAPI Singleton

The older `CreditAPI` class exposes shop GUI helpers. Use `RivalCreditsAPI` for balance operations instead.

```java
import me.rivaldev.credits.CreditAPI;

CreditAPI legacy = CreditAPI.getInstance();

// Open a shop page for the player
legacy.openPage("weapons", player);

// Get number of packages in a category
int count = legacy.getCategoryPackages("weapons");
```
