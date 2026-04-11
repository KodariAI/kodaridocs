# AdvancedEnchantments API Reference

Custom enchantment plugin with 400+ enchants, custom effects, and triggers. The API lets plugins apply custom enchantments to items, register custom effects and triggers, and listen for enchantment events. Add `AdvancedEnchantments` to `depend` or `softdepend` in plugin.yml.

> **Note:** The API JAR must be downloaded from SpigotMC and added as a local dependency. There is no public Maven repository.

## Code Examples

### Apply a Custom Enchantment to an Item

```java
import net.advancedplugins.ae.api.AEAPI;
import org.bukkit.inventory.ItemStack;

// IMPORTANT: reassign the returned ItemStack — the original is not mutated
ItemStack enchanted = AEAPI.applyEnchant("Explosive", 3, itemStack);
player.getInventory().setItemInMainHand(enchanted);
```

### Get a Right-Click Enchantment Book

```java
import net.advancedplugins.ae.api.AEAPI;
import org.bukkit.inventory.ItemStack;

ItemStack book = AEAPI.getRightClickBook("Simple");
player.getInventory().addItem(book);
```

### Ignore Block Break Event

```java
import net.advancedplugins.ae.api.AEAPI;
import org.bukkit.block.Block;

// Tell AE to ignore the next block break event for this block
// Useful when your plugin programmatically breaks blocks
AEAPI.ignoreBlockEvent(block);
```

### Register a Custom Effect

```java
import net.advancedplugins.ae.api.AEAPI;
import net.advancedplugins.ae.api.AdvancedEffect;
import net.advancedplugins.ae.api.ExecutionTask;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.java.JavaPlugin;

public class LightningEffect extends AdvancedEffect {

    public LightningEffect(JavaPlugin plugin) {
        super(plugin, "LIGHTNING_STRIKE", "Strikes target with lightning", "LIGHTNING_STRIKE", 1);
    }

    @Override
    public boolean executeEffect(ExecutionTask task, LivingEntity target, String[] args) {
        target.getWorld().strikeLightning(target.getLocation());
        return true;
    }

    @Override
    public boolean executeEffect(ExecutionTask task, Location target, String[] args) {
        target.getWorld().strikeLightning(target);
        return true;
    }
}

// Register in onEnable:
AEAPI.registerEffect(plugin, new LightningEffect(plugin));
```

### Register a Custom Trigger

```java
import net.advancedplugins.ae.api.AEAPI;
import net.advancedplugins.ae.api.AdvancedTrigger;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.plugin.java.JavaPlugin;

public class SneakTrigger extends AdvancedTrigger {

    public SneakTrigger(JavaPlugin plugin) {
        super(plugin, "SNEAK");
    }

    @EventHandler
    public void onSneak(PlayerToggleSneakEvent event) {
        if (!event.isSneaking()) return;
        Player player = event.getPlayer();

        executionBuilder()
            .setAttacker(player)
            .setAttackerMain(player.getInventory().getItemInMainHand())
            .setEvent(event)
            .setItemType(EquipmentSlot.HAND)
            .setItem(player.getInventory().getItemInMainHand())
            .processVariables()
            .buildAndExecute();
    }
}

// Register in onEnable:
AEAPI.registerTrigger(plugin, new SneakTrigger(plugin));
```

### Listen for Enchantment Events

```java
import net.advancedplugins.ae.api.EffectsActivateEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class AEListener implements Listener {

    @EventHandler
    public void onEffectActivate(EffectsActivateEvent event) {
        // Cancellable — prevent enchantment effect from firing
        event.setCancelled(true);
    }
}
```

## API Reference (Trimmed)

### `net.advancedplugins.ae.api.AEAPI` (static)

| Return | Method | Description |
|---|---|---|
| `ItemStack` | `applyEnchant(String name, int level, ItemStack)` | Apply enchant (returns new ItemStack) |
| `boolean` | `registerEffect(JavaPlugin, AdvancedEffect)` | Register custom effect |
| `boolean` | `registerTrigger(JavaPlugin, AdvancedTrigger)` | Register custom trigger |
| `ItemStack` | `getRightClickBook(String group)` | Get enchant book by group |
| `void` | `ignoreBlockEvent(Block)` | Ignore next block break for block |

### `net.advancedplugins.ae.api.AdvancedEffect` (abstract)

Constructors:
- `AdvancedEffect(JavaPlugin, String effectName)`
- `AdvancedEffect(JavaPlugin, String effectName, String description, String usage, int weight)`

Override:
- `boolean executeEffect(ExecutionTask, LivingEntity target, String[] args)`
- `boolean executeEffect(ExecutionTask, Location target, String[] args)`

### `net.advancedplugins.ae.api.AdvancedTrigger` (abstract, implements Listener)

- Auto-registers as Bukkit listener
- Use `executionBuilder()` in your `@EventHandler` methods
- Builder chain: `.setAttacker()`, `.setEvent()`, `.setItem()`, `.setItemType()`, `.processVariables()`, `.buildAndExecute()`

### Events (`net.advancedplugins.ae.api`)

| Event | Cancellable | Description |
|---|---|---|
| `EffectsActivateEvent` | Yes | Enchantment effect activating |
| `EnchantApplyEvent` | Unknown | Enchantment applied to item |
| `ItemApplyEvent` | Unknown | Plugin item (book, dust, scroll) applied |
