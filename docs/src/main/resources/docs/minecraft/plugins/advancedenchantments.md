# AdvancedEnchantments API Reference

Custom enchantment plugin with 400+ enchants, custom effects, and triggers. The API lets plugins apply existing custom enchants to items, register new effects/triggers/targets that can be used inside enchant configs, and listen for enchantment activation events. Add `AdvancedEnchantments` to `depend` or `softdepend` in plugin.yml.

> **Note:** The API JAR is downloaded from SpigotMC. There is no public Maven repository.

## Terminology (Important)

These terms have precise, distinct meanings. The API does NOT let you create whole enchantments programmatically — those are YAML-only.

| Term | What it is |
|---|---|
| **Enchantment** | The actual custom enchant defined in a YAML file (e.g. `explosive`, `berserk`). Combines triggers + conditions + effects. **Created via YAML, not the API.** |
| **Trigger** | An event that activates an enchant (e.g. `ATTACK`, `MINING`, `DEFENSE`). Listed in the enchant's `type:` field. |
| **Effect** | An action that runs when an enchant fires (e.g. `LIGHTNING @Victim`, `TNT @Victim`). Listed in the level's `effects:` block. **Effects are NOT enchants** — they are pieces used inside enchants. |
| **Target** | The recipient of an effect (e.g. `@Victim`, `@Attacker`, `@Self`, `@Block`). Appended to an effect string with `@`. |
| **Condition** | A per-level activation gate evaluated before effects run. |
| **Group** | A category of enchants (e.g. `SIMPLE`, `UNIQUE`, `LEGENDARY`) defined in `groups.yml`. |

The API gives you three extension points for the system:
- `registerEffect()` adds a new effect TYPE that someone can use in YAML enchants
- `registerTrigger()` adds a new trigger TYPE
- `registerTarget()` adds a new target TYPE

To create an actual new enchant, you write a YAML file (or use in-game commands) — not the API.

## Code Examples

### Apply an Existing Enchant to an Item

```java
import net.advancedplugins.ae.api.AEAPI;
import org.bukkit.inventory.ItemStack;
import org.bukkit.entity.Player;

// "Explosive" must already exist as a YAML enchant on the server
ItemStack enchanted = AEAPI.applyEnchant("Explosive", 3, itemStack);

// IMPORTANT: reassign — applyEnchant returns a new ItemStack, original is not mutated
player.getInventory().setItemInMainHand(enchanted);
```

### Block Break Compatibility

```java
import net.advancedplugins.ae.api.AEAPI;
import org.bukkit.block.Block;

// Check if AE should ignore this block break
boolean ignored = AEAPI.ignoreBlockEvent(block);

// Register a metadata key — blocks with this metadata will have their drops
// ignored by AE's TP_DROPS effect handler
AEAPI.addIgnoreBlockWithMeta("myplugin.fakeBlock");
```

### Register a Custom Effect

This adds a new effect TYPE (`STRIKE_LIGHTNING`) that can then be used inside YAML enchants like `STRIKE_LIGHTNING @Victim`.

```java
import net.advancedplugins.ae.api.AEAPI;
import net.advancedplugins.ae.api.AdvancedEffect;
import net.advancedplugins.ae.api.ExecutionTask;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.java.JavaPlugin;

public class LightningEffect extends AdvancedEffect {

    public LightningEffect(JavaPlugin plugin) {
        // Constructor: (plugin, effectName, description, usage, weight)
        super(plugin, "STRIKE_LIGHTNING", "Strikes lightning", "STRIKE_LIGHTNING", 1);
    }

    @Override
    public boolean executeEffect(ExecutionTask task, LivingEntity target, String[] args) {
        // args[] = parameters after the effect name in the YAML
        // e.g. "STRIKE_LIGHTNING:5 @Victim" -> args[0] = "5"
        target.getWorld().strikeLightning(target.getLocation());
        return true; // false on validation failure
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

Adds a new trigger TYPE (`SNEAK`) that YAML enchants can declare in their `type:` field.

```java
import net.advancedplugins.ae.api.AEAPI;
import net.advancedplugins.ae.api.AdvancedTrigger;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SneakTrigger extends AdvancedTrigger {

    public SneakTrigger(JavaPlugin plugin) {
        super(plugin, "SNEAK"); // trigger name as used in YAML's `type:` field
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onSneak(PlayerToggleSneakEvent event) {
        if (!event.isSneaking()) return;
        Player player = event.getPlayer();

        // Fire the enchant execution pipeline for the player's main hand item
        executionBuilder()
            .setAttacker(player)
            .setAttackerMain(true)
            .setEvent(event)
            .setItem(player.getInventory().getItemInMainHand())
            .processVariables("")  // semicolon-separated key;value pairs for conditions
            .buildAndExecute();
    }
}

// Register in onEnable:
AEAPI.registerTrigger(plugin, new SneakTrigger(plugin));
```

### Register a Custom Target

Adds a new target TYPE (`@Add{x=1,y=0,z=0}`) usable in enchant YAMLs.

```java
import net.advancedplugins.ae.api.AEAPI;
import net.advancedplugins.ae.api.target.TargetType;
import net.advancedplugins.ae.api.target.TargetResults;
import net.advancedplugins.ae.api.target.TargetArgument;
import net.advancedplugins.ae.api.ExecutionTask;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collections;
import java.util.Map;

public class AddTarget extends TargetType {

    public AddTarget() {
        super("Add"); // matches @Add{x=1,y=0,z=0} in YAML
    }

    @Override
    public TargetResults getTargets(String effect, String target, ExecutionTask task) {
        Map<TargetArgument, String> params = classifyTarget(target);

        double x = Double.parseDouble(params.getOrDefault(TargetArgument.X, "0.0"));
        double y = Double.parseDouble(params.getOrDefault(TargetArgument.Y, "0.0"));
        double z = Double.parseDouble(params.getOrDefault(TargetArgument.Z, "0.0"));

        Location loc = task.getBuilder().getMain().getLocation().clone().add(x, y, z);
        return TargetResults.builder()
            .targetLocations(Collections.singletonList(loc))
            .build();
    }
}

// Register in onEnable:
AEAPI.registerTarget(plugin, new AddTarget());
```

### Listen for Enchant Activation

```java
import net.advancedplugins.ae.api.EffectsActivateEvent;
import net.advancedplugins.ae.api.EnchantApplyEvent;
import net.advancedplugins.ae.api.ItemApplyEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class AEListener implements Listener {

    @EventHandler
    public void onEffectActivate(EffectsActivateEvent event) {
        // Cancellable — prevent the enchant's effects from firing
        event.setCancelled(true);
    }

    @EventHandler
    public void onEnchantApply(EnchantApplyEvent event) {
        // Fires when an enchant is applied to an item (anvil, book, etc.)
    }

    @EventHandler
    public void onItemApply(ItemApplyEvent event) {
        // Fires when any AE plugin item (book, dust, scroll, orb) is used on an item
    }
}
```

> **Deprecated:** `EnchantActivateEvent` is deprecated and may not fire reliably. Use `EffectsActivateEvent` instead.

## API Reference (Trimmed)

### `net.advancedplugins.ae.api.AEAPI` (all static)

| Return | Method | Description |
|---|---|---|
| `ItemStack` | `applyEnchant(String name, int level, ItemStack)` | Apply existing YAML enchant. Returns new ItemStack — must reassign. |
| `boolean` | `registerEffect(JavaPlugin, AdvancedEffect)` | Register custom effect type |
| `boolean` | `registerTrigger(JavaPlugin, AdvancedTrigger)` | Register custom trigger type |
| `boolean` | `registerTarget(JavaPlugin, TargetType)` | Register custom target type |
| `boolean` | `ignoreBlockEvent(Block)` | Should AE ignore this block break |
| `void` | `addIgnoreBlockWithMeta(String metadataName)` | Skip drops handling for blocks with this metadata key |

> **Note:** Other methods (e.g. `isAnEnchantment`, `getEnchantLevel`, `removeEnchant`, `getEnchants`, `removeHolyWhiteScroll`) exist but their exact signatures are not publicly documented. Decompile the API JAR to see them.

### `net.advancedplugins.ae.api.AdvancedEffect` (abstract)

**Constructors:**
- `AdvancedEffect(JavaPlugin, String effectName)`
- `AdvancedEffect(JavaPlugin, String effectName, String description, String usage)`
- `AdvancedEffect(JavaPlugin, String effectName, String description, String usage, int weight)`

**Override at least one:**
- `boolean executeEffect(ExecutionTask, LivingEntity target, String[] args)`
- `boolean executeEffect(ExecutionTask, Location target, String[] args)`

`args[]` = parameters parsed from the YAML effect string after the name. `BURN:100` produces `args[0] = "100"`. `BOOST:FORWARD:5` produces `args[0] = "FORWARD"`, `args[1] = "5"`.

### `net.advancedplugins.ae.api.AdvancedTrigger` (abstract, implements Bukkit `Listener`)

- Constructor: `AdvancedTrigger(JavaPlugin, String triggerName)`
- Auto-registered as a Bukkit listener
- Inside your `@EventHandler` methods, fire enchants via `executionBuilder()`

**ExecutionBuilder fluent chain:**
- `.setAttacker(Player)`
- `.setAttackerMain(boolean)`
- `.setEvent(Event)`
- `.setItem(ItemStack)`
- `.setStackItem(StackItem)`
- `.setItemType(RollItemType)`
- `.processVariables(String)` — `"key1;value1;key2;value2"` for condition variables
- `.buildAndExecute()`

### `net.advancedplugins.ae.api.target.TargetType` (abstract)

- Constructor: `TargetType(String targetName)` — name without `@` prefix
- Override: `TargetResults getTargets(String effect, String target, ExecutionTask task)`
- Use `classifyTarget(String)` to parse named params into `Map<TargetArgument, String>`
- Build results: `TargetResults.builder().targetLocations(List<Location>).build()`

### Events (`net.advancedplugins.ae.api`)

| Event | Cancellable | Description |
|---|---|---|
| `EffectsActivateEvent` | Yes | Enchant effects about to activate (after triggers + conditions pass). Replaces deprecated `EnchantActivateEvent`. |
| `EnchantApplyEvent` | Unknown | Enchant applied to an item. Has `getItemStackSlot()` (added in v9.0.0b81). |
| `ItemApplyEvent` | Unknown | Plugin item (book, dust, scroll, orb) applied to an item. Added in v9.9.5. |

> **Note:** Event field/method signatures are not publicly documented. Decompile the API JAR for full details.
