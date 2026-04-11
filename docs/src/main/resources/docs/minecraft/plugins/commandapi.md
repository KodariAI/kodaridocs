# CommandAPI Reference

Command framework by Jorel Ali that uses Minecraft's Brigadier system. Provides 50+ argument types with built-in validation and tab-completion. Commands work with `/execute`, command blocks, and datapacks.

## Shading Setup

In your `manifest.kod`:
```yaml
include:
  - commandapi
```

Initialize in your main class (required when shading):

```java
import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPIPaperConfig;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

    @Override
    public void onLoad() {
        CommandAPI.onLoad(new CommandAPIPaperConfig(this).verboseOutput(false));
    }

    @Override
    public void onEnable() {
        CommandAPI.onEnable();
        // Register commands here
    }

    @Override
    public void onDisable() {
        CommandAPI.onDisable();
    }
}
```

> **WARNING:** Only use `CommandAPIPaperConfig`. Do NOT use `CommandAPIBukkitConfig` or `CommandAPIConfig` — they are abstract.

## Code Examples

### Basic command

```java
import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.GreedyStringArgument;
import org.bukkit.Bukkit;

new CommandAPICommand("broadcast")
    .withPermission("myplugin.broadcast")
    .withArguments(new GreedyStringArgument("message"))
    .executes((sender, args) -> {
        Bukkit.broadcastMessage((String) args.get("message"));
    })
    .register();
```

### Player-only command with entity selector

```java
import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.EntitySelectorArgument;
import dev.jorel.commandapi.arguments.IntegerArgument;
import org.bukkit.entity.Player;

new CommandAPICommand("heal")
    .withPermission("myplugin.heal")
    .withArguments(new EntitySelectorArgument.OnePlayer("target"))
    .executesPlayer((player, args) -> {
        Player target = (Player) args.get("target");
        target.setHealth(20.0);
        player.sendMessage("Healed " + target.getName());
    })
    .register();
```

### Optional arguments

`withOptionalArguments()` is called on the **command builder**, NOT on an argument.

```java
import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.EntitySelectorArgument;
import dev.jorel.commandapi.arguments.IntegerArgument;
import org.bukkit.entity.Player;

new CommandAPICommand("give")
    .withArguments(new EntitySelectorArgument.OnePlayer("target"))
    .withOptionalArguments(new IntegerArgument("amount", 1, 64))
    .executesPlayer((player, args) -> {
        Player target = (Player) args.get("target");
        int amount = (int) args.getOptional("amount").orElse(1);
        // give items
    })
    .register();
```

### Subcommands

```java
import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.StringArgument;

new CommandAPICommand("myplugin")
    .withSubcommand(new CommandAPICommand("reload")
        .withPermission("myplugin.reload")
        .executes((sender, args) -> {
            sender.sendMessage("Reloaded!");
        }))
    .withSubcommand(new CommandAPICommand("set")
        .withArguments(new StringArgument("key"))
        .withArguments(new StringArgument("value"))
        .executes((sender, args) -> {
            String key = (String) args.get("key");
            String value = (String) args.get("value");
            sender.sendMessage("Set " + key + " to " + value);
        }))
    .register();
```

### Suggestions

```java
import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.StringArgument;
import dev.jorel.commandapi.arguments.ArgumentSuggestions;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

new CommandAPICommand("warp")
    .withArguments(new StringArgument("name")
        .replaceSuggestions(ArgumentSuggestions.strings("spawn", "shop", "arena")))
    .executes((sender, args) -> {
        String warp = (String) args.get("name");
    })
    .register();

// Dynamic suggestions
new CommandAPICommand("msg")
    .withArguments(new StringArgument("player")
        .replaceSuggestions(ArgumentSuggestions.strings(info ->
            Bukkit.getOnlinePlayers().stream()
                .map(Player::getName)
                .toArray(String[]::new))))
    .withArguments(new GreedyStringArgument("message"))
    .executes((sender, args) -> {
        // send message
    })
    .register();
```

### Suggestions with tooltips

```java
import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.StringArgument;
import dev.jorel.commandapi.arguments.ArgumentSuggestions;
import dev.jorel.commandapi.StringTooltip;
import dev.jorel.commandapi.IStringTooltip;

new CommandAPICommand("emote")
    .withArguments(new StringArgument("emote")
        .replaceSuggestions(ArgumentSuggestions.stringsWithTooltips(
            StringTooltip.ofString("wave", "Wave at nearby players"),
            StringTooltip.ofString("dance", "Do a dance")
        )))
    .executes((sender, args) -> {
        // handle emote
    })
    .register();
```

### Command tree (branching)

```java
import dev.jorel.commandapi.CommandTree;
import dev.jorel.commandapi.arguments.LiteralArgument;
import dev.jorel.commandapi.arguments.IntegerArgument;
import dev.jorel.commandapi.arguments.GreedyStringArgument;

new CommandTree("sign")
    .then(new LiteralArgument("set")
        .then(new IntegerArgument("line", 1, 4)
            .then(new GreedyStringArgument("text")
                .executesPlayer((player, args) -> {
                    int line = (int) args.get("line");
                    String text = (String) args.get("text");
                }))))
    .then(new LiteralArgument("clear")
        .then(new IntegerArgument("line", 1, 4)
            .executesPlayer((player, args) -> {
                int line = (int) args.get("line");
            })))
    .register();
```

### Multiple executor types

```java
import dev.jorel.commandapi.CommandAPICommand;

new CommandAPICommand("hello")
    .executesPlayer((player, args) -> {
        player.sendMessage("Hello player!");
    })
    .executesConsole((console, args) -> {
        console.sendMessage("Hello console!");
    })
    .register();
```

### Failing a command

```java
import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.StringArgument;

new CommandAPICommand("check")
    .withArguments(new StringArgument("code"))
    .executes((sender, args) -> {
        String code = (String) args.get("code");
        if (!isValidCode(code)) {
            throw CommandAPI.failWithString("Invalid code: " + code);
        }
    })
    .register();
```

### Unregistering commands

```java
import dev.jorel.commandapi.CommandAPI;

CommandAPI.unregister("gamemode");
```

## Argument Types Quick Reference

All arguments are in package `dev.jorel.commandapi.arguments`.

| Argument Class | Returns | Notes |
|---|---|---|
| `IntegerArgument("name")` | `int` | Optional min/max: `IntegerArgument("n", 1, 100)` |
| `DoubleArgument("name")` | `double` | Optional min/max |
| `FloatArgument("name")` | `float` | Optional min/max |
| `LongArgument("name")` | `long` | Optional min/max |
| `BooleanArgument("name")` | `boolean` | |
| `StringArgument("name")` | `String` | Single word |
| `TextArgument("name")` | `String` | Quoted or single word |
| `GreedyStringArgument("name")` | `String` | All remaining input, MUST be last |
| `EntitySelectorArgument.OnePlayer("name")` | `Player` | @p, @r, or player name |
| `EntitySelectorArgument.ManyPlayers("name")` | `Collection<Player>` | @a or multiple |
| `EntitySelectorArgument.OneEntity("name")` | `Entity` | Single entity |
| `EntitySelectorArgument.ManyEntities("name")` | `Collection<Entity>` | Multiple entities |
| `PlayerArgument("name")` | `Player` | Online player name only |
| `EntityTypeArgument("name")` | `EntityType` | e.g. `creeper`, `zombie` |
| `LocationArgument("name")` | `Location` | x y z, supports ~ and ^ |
| `LocationArgument("name", LocationType.BLOCK_POSITION)` | `Location` | Integer coords |
| `Location2DArgument("name")` | `Location2D` | x z |
| `RotationArgument("name")` | `Rotation` | pitch yaw |
| `ItemStackArgument("name")` | `ItemStack` | Always amount 1 |
| `BlockStateArgument("name")` | `BlockData` | Block with state |
| `EnchantmentArgument("name")` | `Enchantment` | |
| `PotionEffectArgument("name")` | `PotionEffectType` | |
| `ParticleArgument("name")` | `ParticleData<?>` | `.particle()` and `.data()` |
| `SoundArgument("name")` | `Sound` | |
| `BiomeArgument("name")` | `Biome` | |
| `WorldArgument("name")` | `World` | |
| `TimeArgument("name")` | `int` | Ticks. Input: `2d`, `10s`, `20t` |
| `AngleArgument("name")` | `float` | -180 to 180 |
| `UUIDArgument("name")` | `UUID` | |
| `NamespacedKeyArgument("name")` | `NamespacedKey` | |
| `AdvancementArgument("name")` | `Advancement` | |
| `LootTableArgument("name")` | `LootTable` | |
| `RecipeArgument("name")` | `Recipe` | |
| `ChatColorArgument("name")` | `ChatColor` | Adventure: `NamedTextColor` |
| `ObjectiveArgument("name")` | `Objective` | |
| `TeamArgument("name")` | `Team` | |
| `ScoreHolderArgument.Single("name")` | `String` | Player/entity name |
| `ScoreHolderArgument.Multiple("name")` | `Collection<String>` | |
| `IntegerRangeArgument("name")` | `IntegerRange` | Input: `5`, `5..10`, `..10` |
| `DoubleRangeArgument("name")` | `DoubleRange` | |
| `LiteralArgument("value")` | (not in args) | Fixed literal, not returned |
| `MultiLiteralArgument("name", "a", "b", "c")` | `String` | Returns selected value |
| `BlockPredicateArgument("name")` | `Predicate<Block>` | |
| `ItemStackPredicateArgument("name")` | `Predicate<ItemStack>` | |
| `CommandArgument("name")` | `CommandResult` | `.execute(sender)` |
| `CustomArgument<T, B>` | `T` | Custom parsing |

## Key Rules

- `withOptionalArguments()` goes on the **command builder** (`CommandAPICommand`), NOT on an argument
- Arguments do NOT have `setOptionalDescription()`, `withDescription()`, or `setDescription()` — these methods do not exist
- `CommandAPIPaperConfig` is the only config class you can instantiate. `CommandAPIBukkitConfig` and `CommandAPIConfig` are abstract
- `GreedyStringArgument` MUST be the last argument
- Access argument values with `args.get("name")` and cast. For optional: `args.getOptional("name").orElse(default)`
- Executor types: `executes()` (any), `executesPlayer()`, `executesConsole()`, `executesEntity()`, `executesCommandBlock()`, `executesProxy()`, `executesNative()`
