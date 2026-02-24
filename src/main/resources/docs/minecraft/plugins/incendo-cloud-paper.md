# Incendo Cloud (cloud-paper) - Command Framework for Paper

Cloud is a type-safe command framework for Paper/Bukkit. Build commands with strongly-typed arguments, automatic tab completion, Brigadier integration, and Paper-native sender types.

## Creating the Command Manager

### Modern Manager (Paper 1.20.6+, recommended)

```java
import org.incendo.cloud.execution.ExecutionCoordinator;
import org.incendo.cloud.paper.PaperCommandManager;
import org.incendo.cloud.paper.util.sender.PaperSimpleSenderMapper;
import org.incendo.cloud.paper.util.sender.Source;
import org.incendo.cloud.paper.util.sender.PlayerSource;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        PaperCommandManager<Source> commandManager = PaperCommandManager.builder(
                PaperSimpleSenderMapper.simpleSenderMapper()
            )
            .executionCoordinator(ExecutionCoordinator.simpleCoordinator())
            .buildOnEnable(this);

        registerCommands(commandManager);
    }
}
```

### Legacy Manager (Pre-1.20.6 / Spigot compatible)

```java
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.incendo.cloud.execution.ExecutionCoordinator;
import org.incendo.cloud.paper.LegacyPaperCommandManager;
import org.incendo.cloud.bukkit.CloudBukkitCapabilities;

public final class MyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        LegacyPaperCommandManager<CommandSender> commandManager =
            LegacyPaperCommandManager.createNative(
                this,
                ExecutionCoordinator.simpleCoordinator()
            );

        // Enable Brigadier rich completions (modern Paper), otherwise async completions
        if (commandManager.hasCapability(CloudBukkitCapabilities.NATIVE_BRIGADIER)) {
            commandManager.registerBrigadier();
        } else if (commandManager.hasCapability(CloudBukkitCapabilities.ASYNCHRONOUS_COMPLETION)) {
            commandManager.registerAsynchronousCompletions();
        }

        registerCommands(commandManager);
    }
}
```

### Bootstrapped Manager (Paper plugin.yml loader)

```java
import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import org.incendo.cloud.execution.ExecutionCoordinator;
import org.incendo.cloud.paper.PaperCommandManager;
import org.incendo.cloud.paper.util.sender.PaperSimpleSenderMapper;
import org.incendo.cloud.paper.util.sender.Source;

// In your bootstrapper:
PaperCommandManager.Bootstrapped<Source> commandManager = PaperCommandManager.builder(
        PaperSimpleSenderMapper.simpleSenderMapper()
    )
    .executionCoordinator(ExecutionCoordinator.simpleCoordinator())
    .buildBootstrapped(bootstrapContext);
```

## Registering Commands

### Basic Command with Arguments

```java
import org.incendo.cloud.CommandManager;
import org.incendo.cloud.paper.util.sender.Source;
import org.incendo.cloud.paper.util.sender.PlayerSource;
import org.incendo.cloud.description.Description;
import org.incendo.cloud.parser.standard.IntegerParser;
import org.incendo.cloud.parser.standard.StringParser;
import org.bukkit.entity.Player;

private void registerCommands(CommandManager<Source> manager) {
    // /greet <player_name> [times]
    manager.command(
        manager.commandBuilder("greet")
            .senderType(PlayerSource.class)
            .required("player_name", StringParser.single())
            .optional("times", IntegerParser.integerParser(1, 10))
            .permission("myplugin.greet")
            .handler(context -> {
                Player sender = context.sender().source();
                String target = context.get("player_name");
                int times = context.getOrDefault("times", 1);
                for (int i = 0; i < times; i++) {
                    sender.sendMessage("Hello, " + target + "!");
                }
            })
    );
}
```

### Literals (Subcommands)

```java
import org.incendo.cloud.CommandManager;
import org.incendo.cloud.paper.util.sender.Source;
import org.incendo.cloud.parser.standard.StringParser;

// /myplugin reload
manager.command(
    manager.commandBuilder("myplugin")
        .literal("reload")
        .permission("myplugin.admin.reload")
        .handler(context -> {
            // reload logic
            context.sender().source().sendMessage("Reloaded!");
        })
);

// /myplugin set <key> <value>
manager.command(
    manager.commandBuilder("myplugin")
        .literal("set")
        .required("key", StringParser.single())
        .required("value", StringParser.greedy())
        .handler(context -> {
            String key = context.get("key");
            String value = context.get("value");
            // handle set
        })
);
```

### Player Selector Arguments

```java
import org.incendo.cloud.CommandManager;
import org.incendo.cloud.paper.util.sender.Source;
import org.incendo.cloud.bukkit.parser.selector.SinglePlayerSelectorParser;
import org.incendo.cloud.bukkit.data.SinglePlayerSelector;
import org.incendo.cloud.parser.standard.IntegerParser;
import org.bukkit.entity.Player;

// /heal <player> [amount]
manager.command(
    manager.commandBuilder("heal")
        .required("target", SinglePlayerSelectorParser.singlePlayerSelectorParser())
        .optional("amount", IntegerParser.integerParser(1, 20))
        .permission("myplugin.heal")
        .handler(context -> {
            SinglePlayerSelector selector = context.get("target");
            Player target = selector.single();
            int amount = context.getOrDefault("amount", 20);
            double newHealth = Math.min(target.getHealth() + amount, target.getMaxHealth());
            target.setHealth(newHealth);
        })
);
```

### Multi-Entity Selectors (@a, @e, @r)

```java
import org.incendo.cloud.bukkit.parser.selector.MultiplePlayerSelectorParser;
import org.incendo.cloud.bukkit.data.MultiplePlayerSelector;
import org.bukkit.entity.Player;

// /broadcast <targets> <message>
manager.command(
    manager.commandBuilder("broadcast")
        .required("targets", MultiplePlayerSelectorParser.multiplePlayerSelectorParser())
        .required("message", StringParser.greedy())
        .handler(context -> {
            MultiplePlayerSelector selector = context.get("targets");
            String message = context.get("message");
            for (Player player : selector.values()) {
                player.sendMessage(message);
            }
        })
);
```

## Standard Parsers

```java
import org.incendo.cloud.parser.standard.StringParser;
import org.incendo.cloud.parser.standard.IntegerParser;
import org.incendo.cloud.parser.standard.DoubleParser;
import org.incendo.cloud.parser.standard.FloatParser;
import org.incendo.cloud.parser.standard.LongParser;
import org.incendo.cloud.parser.standard.BooleanParser;
import org.incendo.cloud.parser.standard.EnumParser;
import org.incendo.cloud.parser.standard.UUIDParser;

// String parsers
.required("word", StringParser.single())             // single word
.required("quoted", StringParser.quoted())            // "quoted string" or single
.required("text", StringParser.greedy())              // all remaining input
.required("text", StringParser.greedyFlagYielding())  // greedy, stops at flags

// Number parsers (with optional min/max)
.required("count", IntegerParser.integerParser())
.required("count", IntegerParser.integerParser(0, 100))
.required("ratio", DoubleParser.doubleParser(0.0, 1.0))
.required("amount", FloatParser.floatParser())
.required("id", LongParser.longParser())

// Boolean (liberal accepts true/false/yes/no/on/off)
.required("confirm", BooleanParser.booleanParser(true))   // liberal=true

// Enum
.required("gamemode", EnumParser.enumParser(org.bukkit.GameMode.class))

// UUID
.required("uuid", UUIDParser.uuidParser())
```

## Bukkit/Paper Parsers

```java
import org.incendo.cloud.bukkit.parser.PlayerParser;
import org.incendo.cloud.bukkit.parser.OfflinePlayerParser;
import org.incendo.cloud.bukkit.parser.WorldParser;
import org.incendo.cloud.bukkit.parser.MaterialParser;
import org.incendo.cloud.bukkit.parser.EnchantmentParser;
import org.incendo.cloud.bukkit.parser.ItemStackParser;
import org.incendo.cloud.bukkit.parser.ItemStackPredicateParser;
import org.incendo.cloud.bukkit.parser.BlockPredicateParser;
import org.incendo.cloud.bukkit.parser.LocationParser;
import org.incendo.cloud.bukkit.parser.Location2DParser;
import org.incendo.cloud.bukkit.parser.NamespacedKeyParser;
import org.incendo.cloud.bukkit.parser.selector.SinglePlayerSelectorParser;
import org.incendo.cloud.bukkit.parser.selector.SingleEntitySelectorParser;
import org.incendo.cloud.bukkit.parser.selector.MultiplePlayerSelectorParser;
import org.incendo.cloud.bukkit.parser.selector.MultipleEntitySelectorParser;
import org.incendo.cloud.paper.parser.KeyedWorldParser;
import org.incendo.cloud.paper.parser.RegistryEntryParser;

// Player (online only, no selectors)
.required("player", PlayerParser.playerParser())

// OfflinePlayer
.required("target", OfflinePlayerParser.offlinePlayerParser())

// World
.required("world", WorldParser.worldParser())

// Paper keyed world (returns NamespacedKey-based world)
.required("world", KeyedWorldParser.keyedWorldParser())

// Location (Brigadier vec3, resolves ~ relative coords)
.required("location", LocationParser.locationParser())

// Material
.required("material", MaterialParser.materialParser())

// Enchantment
.required("enchantment", EnchantmentParser.enchantmentParser())

// NamespacedKey
.required("key", NamespacedKeyParser.namespacedKeyParser())

// Entity selectors (supports @a, @p, @r, @e, @s)
.required("player", SinglePlayerSelectorParser.singlePlayerSelectorParser())
.required("entity", SingleEntitySelectorParser.singleEntitySelectorParser())
.required("players", MultiplePlayerSelectorParser.multiplePlayerSelectorParser())
.required("entities", MultipleEntitySelectorParser.multipleEntitySelectorParser())
```

## Custom Suggestions

```java
import org.incendo.cloud.suggestion.SuggestionProvider;
import org.incendo.cloud.suggestion.Suggestion;
import org.incendo.cloud.suggestion.BlockingSuggestionProvider;
import org.incendo.cloud.parser.standard.StringParser;

// Static string suggestions
.required("color", StringParser.single(),
    SuggestionProvider.suggestingStrings("red", "green", "blue"))

// Dynamic blocking suggestions (runs on calling thread)
.required("warp", StringParser.single(),
    SuggestionProvider.blockingStrings((ctx, input) -> {
        return getWarpNames(); // returns Iterable<String>
    }))

// Dynamic with Suggestion objects (supports tooltips)
.required("kit", StringParser.single(),
    SuggestionProvider.blocking((ctx, input) -> {
        return getKits().stream()
            .map(kit -> Suggestion.suggestion(kit.getName()))
            .toList();
    }))

// No suggestions
.required("secret", StringParser.single(), SuggestionProvider.noSuggestions())
```

## Flags

```java
import org.incendo.cloud.CommandManager;
import org.incendo.cloud.parser.standard.IntegerParser;
import org.incendo.cloud.parser.standard.StringParser;

// Presence flag: --silent or -s
// Value flag: --count <number>
manager.command(
    manager.commandBuilder("announce")
        .required("message", StringParser.greedy())
        .flag(manager.flagBuilder("silent").withAliases("s"))
        .flag(manager.flagBuilder("count").withComponent(
            manager.componentBuilder("count", IntegerParser.integerParser(1, 100)).build()
        ))
        .handler(context -> {
            String message = context.get("message");
            boolean silent = context.flags().isPresent("silent");
            int count = context.flags().getValue("count", 1);
            // ...
        })
);
```

## Aggregate Parsers (Multi-Argument to Single Object)

```java
import org.incendo.cloud.parser.aggregate.AggregateParser;
import org.incendo.cloud.parser.standard.StringParser;
import org.incendo.cloud.parser.standard.IntegerParser;
import org.incendo.cloud.parser.ArgumentParseResult;

AggregateParser<Source, MyLocation> locationParser = AggregateParser.<Source>builder()
    .withComponent("world", StringParser.single())
    .withComponent("x", IntegerParser.integerParser())
    .withComponent("y", IntegerParser.integerParser())
    .withComponent("z", IntegerParser.integerParser())
    .withMapper(MyLocation.class, (commandContext, aggregateContext) -> {
        String world = aggregateContext.get("world");
        int x = aggregateContext.get("x");
        int y = aggregateContext.get("y");
        int z = aggregateContext.get("z");
        return ArgumentParseResult.successFuture(new MyLocation(world, x, y, z));
    })
    .build();

// Use in command
manager.command(
    manager.commandBuilder("teleport")
        .required("location", locationParser)
        .handler(context -> {
            MyLocation loc = context.get("location");
        })
);
```

## Either Parser (Accept Multiple Types)

```java
import org.incendo.cloud.parser.ArgumentParser;
import org.incendo.cloud.type.Either;
import org.incendo.cloud.parser.standard.IntegerParser;
import org.incendo.cloud.parser.standard.BooleanParser;

manager.command(
    manager.commandBuilder("setvalue")
        .required("value", ArgumentParser.firstOf(
            IntegerParser.integerParser(),
            BooleanParser.booleanParser()
        ))
        .handler(context -> {
            Either<Integer, Boolean> value = context.get("value");
            if (value.primary().isPresent()) {
                int num = value.primary().get();
            } else {
                boolean bool = value.fallback().get();
            }
        })
);
```

## Custom Parser

```java
import org.incendo.cloud.context.CommandContext;
import org.incendo.cloud.context.CommandInput;
import org.incendo.cloud.parser.ArgumentParser;
import org.incendo.cloud.parser.ArgumentParseResult;
import org.incendo.cloud.parser.ParserDescriptor;
import io.leangen.geantyref.TypeToken;

public class GameModeParser<C> implements ArgumentParser<C, GameMode> {

    public static <C> ParserDescriptor<C, GameMode> gameModeParser() {
        return ParserDescriptor.of(new GameModeParser<>(), GameMode.class);
    }

    @Override
    public ArgumentParseResult<GameMode> parse(
            CommandContext<C> context,
            CommandInput input
    ) {
        String token = input.peekString();
        try {
            GameMode mode = GameMode.valueOf(token.toUpperCase());
            input.readString(); // consume on success
            return ArgumentParseResult.success(mode);
        } catch (IllegalArgumentException e) {
            return ArgumentParseResult.failure(
                new IllegalArgumentException("Invalid game mode: " + token)
            );
        }
    }
}
```

## Exception Handling (cloud-minecraft-extras)

```java
import org.incendo.cloud.minecraft.extras.MinecraftExceptionHandler;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

// Use default styled exception handlers (no-permission, invalid syntax, etc.)
MinecraftExceptionHandler.<Source>createNative()
    .defaultHandlers()
    .decorator(component -> Component.text()
        .append(Component.text("[MyPlugin] ", NamedTextColor.GOLD))
        .append(component)
        .build()
    )
    .registerTo(commandManager);
```

## Help System (cloud-minecraft-extras)

```java
import org.incendo.cloud.minecraft.extras.MinecraftHelp;
import org.incendo.cloud.parser.standard.StringParser;
import org.incendo.cloud.component.DefaultValue;
import net.kyori.adventure.text.format.NamedTextColor;

MinecraftHelp<Source> help = MinecraftHelp.createNative("/myhelp", commandManager);

manager.command(
    manager.commandBuilder("myhelp")
        .optional("query", StringParser.greedy(), DefaultValue.constant(""))
        .handler(context -> {
            help.queryCommands(context.get("query"), context.sender());
        })
);
```

## RichDescription (Adventure Components in Descriptions)

```java
import org.incendo.cloud.minecraft.extras.RichDescription;
import net.kyori.adventure.text.Component;

manager.command(
    manager.commandBuilder("fancy")
        .commandDescription(RichDescription.of(
            Component.text("A fancy command", NamedTextColor.GREEN)
        ))
        .required("arg", StringParser.single(),
            RichDescription.of(Component.text("An argument")))
        .handler(context -> { /* ... */ })
);
```

## TextColorParser / ComponentParser (cloud-minecraft-extras)

```java
import org.incendo.cloud.minecraft.extras.parser.TextColorParser;
import org.incendo.cloud.minecraft.extras.parser.ComponentParser;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.incendo.cloud.parser.standard.StringParser;

// Accepts named colors, &-codes, and #hex
.required("color", TextColorParser.textColorParser())

// Parses MiniMessage into Adventure Component
.required("message", ComponentParser.componentParser(
    MiniMessage.miniMessage(),
    StringParser.StringMode.GREEDY_FLAG_YIELDING
))
```

## Sender Types (Modern Manager)

The modern `PaperCommandManager` with `PaperSimpleSenderMapper` uses `Source` subtypes:

```java
import org.incendo.cloud.paper.util.sender.Source;
import org.incendo.cloud.paper.util.sender.PlayerSource;
import org.incendo.cloud.paper.util.sender.ConsoleSource;
import org.incendo.cloud.paper.util.sender.EntitySource;
import org.bukkit.entity.Player;
import org.bukkit.command.ConsoleCommandSender;

// Player-only command
manager.command(
    manager.commandBuilder("fly")
        .senderType(PlayerSource.class)
        .handler(context -> {
            Player player = context.sender().source();
            player.setFlying(!player.isFlying());
        })
);

// Console-only command
manager.command(
    manager.commandBuilder("shutdown")
        .senderType(ConsoleSource.class)
        .handler(context -> {
            ConsoleCommandSender console = context.sender().source();
            // console-only logic
        })
);

// Any sender
manager.command(
    manager.commandBuilder("info")
        .handler(context -> {
            context.sender().source().sendMessage("Info!");
        })
);
```

## Execution Coordinators

```java
import org.incendo.cloud.execution.ExecutionCoordinator;

// Simple: runs on calling thread (main thread for Bukkit commands)
ExecutionCoordinator.simpleCoordinator()

// Async: runs handlers on async thread pool
ExecutionCoordinator.asyncCoordinator()
```

## Full Plugin Example

```java
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.incendo.cloud.bukkit.CloudBukkitCapabilities;
import org.incendo.cloud.component.DefaultValue;
import org.incendo.cloud.bukkit.parser.selector.SinglePlayerSelectorParser;
import org.incendo.cloud.bukkit.data.SinglePlayerSelector;
import org.incendo.cloud.description.Description;
import org.incendo.cloud.execution.ExecutionCoordinator;
import org.incendo.cloud.minecraft.extras.MinecraftExceptionHandler;
import org.incendo.cloud.minecraft.extras.MinecraftHelp;
import org.incendo.cloud.paper.PaperCommandManager;
import org.incendo.cloud.paper.util.sender.PaperSimpleSenderMapper;
import org.incendo.cloud.paper.util.sender.PlayerSource;
import org.incendo.cloud.paper.util.sender.Source;
import org.incendo.cloud.parser.standard.IntegerParser;
import org.incendo.cloud.parser.standard.StringParser;
import org.incendo.cloud.suggestion.SuggestionProvider;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public final class MyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        PaperCommandManager<Source> manager = PaperCommandManager.builder(
                PaperSimpleSenderMapper.simpleSenderMapper()
            )
            .executionCoordinator(ExecutionCoordinator.simpleCoordinator())
            .buildOnEnable(this);

        MinecraftExceptionHandler.<Source>createNative()
            .defaultHandlers()
            .decorator(c -> Component.text()
                .append(Component.text("[MyPlugin] ", NamedTextColor.GOLD))
                .append(c).build())
            .registerTo(manager);

        MinecraftHelp<Source> help = MinecraftHelp.createNative("/mp help", manager);

        // /mp help [query]
        manager.command(manager.commandBuilder("mp")
            .literal("help")
            .optional("query", StringParser.greedy(), DefaultValue.constant(""))
            .handler(ctx -> help.queryCommands(ctx.get("query"), ctx.sender()))
        );

        // /mp heal <target> [amount]
        manager.command(manager.commandBuilder("mp")
            .literal("heal")
            .senderType(PlayerSource.class)
            .required("target", SinglePlayerSelectorParser.singlePlayerSelectorParser())
            .optional("amount", IntegerParser.integerParser(1, 20))
            .permission("myplugin.heal")
            .handler(ctx -> {
                Player target = ctx.<SinglePlayerSelector>get("target").single();
                int amount = ctx.getOrDefault("amount", 20);
                target.setHealth(Math.min(target.getHealth() + amount, target.getMaxHealth()));
                ctx.sender().source().sendMessage("Healed " + target.getName());
            })
        );

        // /mp give <target> <item> [--amount <n>] [--silent]
        manager.command(manager.commandBuilder("mp")
            .literal("give")
            .required("target", SinglePlayerSelectorParser.singlePlayerSelectorParser())
            .required("item", StringParser.single(),
                SuggestionProvider.suggestingStrings("diamond", "iron_ingot", "gold_ingot"))
            .flag(manager.flagBuilder("amount").withComponent(
                manager.componentBuilder("amount", IntegerParser.integerParser(1, 64)).build()
            ))
            .flag(manager.flagBuilder("silent").withAliases("s"))
            .permission("myplugin.give")
            .handler(ctx -> {
                Player target = ctx.<SinglePlayerSelector>get("target").single();
                String item = ctx.get("item");
                int amount = ctx.flags().getValue("amount", 1);
                boolean silent = ctx.flags().isPresent("silent");
                // give item logic
            })
        );
    }
}
```

## Important Notes

- Do NOT register cloud commands in `plugin.yml` or `paper-plugin.yml`. Cloud registers them automatically.
- Do NOT use async completions and Brigadier at the same time.
- Use `ExecutionCoordinator.nonSchedulingExecutor()` for suggestion providers to prevent deadlocks.
- The modern `PaperCommandManager` has Brigadier enabled by default.

## Trimmed API Reference

### org.incendo.cloud.paper.PaperCommandManager<C>
Extends: `org.incendo.cloud.CommandManager<C>`
- `static PaperCommandManager.Builder<CommandSourceStack> builder()` - native source stack builder
- `static PaperCommandManager.Builder<C> builder(SenderMapper<CommandSourceStack, C>)` - custom sender builder
- `boolean hasPermission(C, String)`
- `PluginMeta owningPluginMeta()`
- `SenderMapper<CommandSourceStack, C> senderMapper()`
- `boolean hasBrigadierManager()`
- `CloudBrigadierManager<C> brigadierManager()`

### org.incendo.cloud.paper.PaperCommandManager.Builder<C>
- `PaperCommandManager.CoordinatedBuilder<C> executionCoordinator(ExecutionCoordinator<C>)`

### org.incendo.cloud.paper.PaperCommandManager.CoordinatedBuilder<C>
- `PaperCommandManager<C> buildOnEnable(Plugin)`
- `PaperCommandManager.Bootstrapped<C> buildBootstrapped(BootstrapContext)`

### org.incendo.cloud.paper.PaperCommandManager.Bootstrapped<C>
Extends: `PaperCommandManager<C>`
- `void onEnable()`

### org.incendo.cloud.paper.LegacyPaperCommandManager<C>
Extends: `org.incendo.cloud.bukkit.BukkitCommandManager<C>`
- `static LegacyPaperCommandManager<CommandSender> createNative(Plugin, ExecutionCoordinator<CommandSender>)`
- `void registerBrigadier()`
- `void registerAsynchronousCompletions()`
- `boolean hasBrigadierManager()`
- `CloudBrigadierManager<C> brigadierManager()`

### org.incendo.cloud.paper.util.sender.Source
- `CommandSourceStack stack()`
- `CommandSender source()`

### org.incendo.cloud.paper.util.sender.PlayerSource extends EntitySource
- `Player source()`

### org.incendo.cloud.paper.util.sender.ConsoleSource extends GenericSource
- `ConsoleCommandSender source()`

### org.incendo.cloud.paper.util.sender.EntitySource extends GenericSource
- `Entity source()`

### org.incendo.cloud.paper.util.sender.PaperSimpleSenderMapper
Implements: `org.incendo.cloud.SenderMapper<CommandSourceStack, Source>`
- `static PaperSimpleSenderMapper simpleSenderMapper()`

### org.incendo.cloud.paper.parser.KeyedWorldParser<C>
Implements: `ArgumentParser<C, World>`, `SuggestionProvider<C>`
- `static ParserDescriptor<C, World> keyedWorldParser()`

### org.incendo.cloud.paper.parser.RegistryEntryParser<C, T>
Implements: `ArgumentParser<C, RegistryEntryParser.RegistryEntry<T>>`
- `static ParserDescriptor<C, RegistryEntry<T>> registryEntryParser(RegistryKey<T>, TypeToken<RegistryEntry<T>>)`

### Bukkit Parsers (inherited via cloud-bukkit)
- `org.incendo.cloud.bukkit.parser.PlayerParser` - `playerParser()` -> `Player`
- `org.incendo.cloud.bukkit.parser.OfflinePlayerParser` - `offlinePlayerParser()` -> `OfflinePlayer`
- `org.incendo.cloud.bukkit.parser.WorldParser` - `worldParser()` -> `World`
- `org.incendo.cloud.bukkit.parser.MaterialParser` - `materialParser()` -> `Material`
- `org.incendo.cloud.bukkit.parser.EnchantmentParser` - `enchantmentParser()` -> `Enchantment`
- `org.incendo.cloud.bukkit.parser.ItemStackParser` - `itemStackParser()` -> `ProtoItemStack`
- `org.incendo.cloud.bukkit.parser.LocationParser` - `locationParser()` -> `Location`
- `org.incendo.cloud.bukkit.parser.Location2DParser` - `location2DParser()` -> `Location2D`
- `org.incendo.cloud.bukkit.parser.NamespacedKeyParser` - `namespacedKeyParser()` -> `NamespacedKey`
- `org.incendo.cloud.bukkit.parser.selector.SinglePlayerSelectorParser` - `singlePlayerSelectorParser()` -> `SinglePlayerSelector`
- `org.incendo.cloud.bukkit.parser.selector.SingleEntitySelectorParser` - `singleEntitySelectorParser()` -> `SingleEntitySelector`
- `org.incendo.cloud.bukkit.parser.selector.MultiplePlayerSelectorParser` - `multiplePlayerSelectorParser()` -> `MultiplePlayerSelector`
- `org.incendo.cloud.bukkit.parser.selector.MultipleEntitySelectorParser` - `multipleEntitySelectorParser()` -> `MultipleEntitySelector`

### Core API (from cloud-core)
- `org.incendo.cloud.CommandManager<C>.commandBuilder(String)` -> `Command.Builder<C>`
- `org.incendo.cloud.CommandManager<C>.command(Command.Builder<C>)` - register command
- `org.incendo.cloud.CommandManager<C>.flagBuilder(String)` -> `CommandFlag.Builder<Void>`
- `org.incendo.cloud.CommandManager<C>.componentBuilder(String, ParserDescriptor)` -> `CommandComponent.Builder<C, T>`
- `org.incendo.cloud.Command.Builder<C>.literal(String, String...)` - add literal with aliases
- `org.incendo.cloud.Command.Builder<C>.required(String, ParserDescriptor<C, T>)` - required arg
- `org.incendo.cloud.Command.Builder<C>.required(String, ParserDescriptor<C, T>, SuggestionProvider<C>)` - required with suggestions
- `org.incendo.cloud.Command.Builder<C>.optional(String, ParserDescriptor<C, T>)` - optional arg
- `org.incendo.cloud.Command.Builder<C>.optional(String, ParserDescriptor<C, T>, DefaultValue<C, T>)` - optional with default
- `org.incendo.cloud.Command.Builder<C>.senderType(Class<? extends C>)` - restrict sender
- `org.incendo.cloud.Command.Builder<C>.permission(String)` - set permission
- `org.incendo.cloud.Command.Builder<C>.permission(Permission)` - set permission object
- `org.incendo.cloud.Command.Builder<C>.flag(CommandFlag<?>)` - add flag
- `org.incendo.cloud.Command.Builder<C>.handler(CommandExecutionHandler<C>)` - set handler
- `org.incendo.cloud.Command.Builder<C>.commandDescription(CommandDescription)` - set description
- `org.incendo.cloud.context.CommandContext<C>.get(String)` -> `T` - get parsed value
- `org.incendo.cloud.context.CommandContext<C>.getOrDefault(String, T)` -> `T` - with fallback
- `org.incendo.cloud.context.CommandContext<C>.sender()` -> `C` - get sender
- `org.incendo.cloud.context.CommandContext<C>.flags()` -> `FlagContext`
- `org.incendo.cloud.context.FlagContext.isPresent(String)` -> `boolean`
- `org.incendo.cloud.context.FlagContext.getValue(String, T)` -> `T` - flag value with default
- `org.incendo.cloud.suggestion.SuggestionProvider.noSuggestions()` -> `SuggestionProvider<C>`
- `org.incendo.cloud.suggestion.SuggestionProvider.suggestingStrings(String...)` -> `SuggestionProvider<C>`
- `org.incendo.cloud.suggestion.SuggestionProvider.blockingStrings(BlockingSuggestionProvider.Strings<C>)` -> `SuggestionProvider<C>`
- `org.incendo.cloud.suggestion.SuggestionProvider.blocking(BlockingSuggestionProvider<C>)` -> `SuggestionProvider<C>`
- `org.incendo.cloud.suggestion.Suggestion.suggestion(String)` -> `Suggestion`
- `org.incendo.cloud.execution.ExecutionCoordinator.simpleCoordinator()` -> `ExecutionCoordinator<C>`
- `org.incendo.cloud.execution.ExecutionCoordinator.asyncCoordinator()` -> `ExecutionCoordinator<C>`
- `org.incendo.cloud.parser.ArgumentParseResult.success(T)` -> `ArgumentParseResult<T>`
- `org.incendo.cloud.parser.ArgumentParseResult.failure(Throwable)` -> `ArgumentParseResult<T>`
- `org.incendo.cloud.parser.ArgumentParseResult.successFuture(T)` -> `CompletableFuture<ArgumentParseResult<T>>`
- `org.incendo.cloud.parser.ArgumentParser.firstOf(ParserDescriptor, ParserDescriptor)` -> `ParserDescriptor` (Either)
- `org.incendo.cloud.parser.aggregate.AggregateParser.builder()` -> `AggregateParser.Builder`

### Minecraft Extras (from cloud-minecraft-extras)
- `org.incendo.cloud.minecraft.extras.MinecraftHelp.createNative(String, CommandManager)` -> `MinecraftHelp<C>`
- `org.incendo.cloud.minecraft.extras.MinecraftHelp.queryCommands(String, C)` - display help
- `org.incendo.cloud.minecraft.extras.MinecraftExceptionHandler.createNative()` -> builder
- `org.incendo.cloud.minecraft.extras.MinecraftExceptionHandler.defaultHandlers()` -> self
- `org.incendo.cloud.minecraft.extras.MinecraftExceptionHandler.decorator(UnaryOperator<Component>)` -> self
- `org.incendo.cloud.minecraft.extras.MinecraftExceptionHandler.registerTo(CommandManager)` - register
- `org.incendo.cloud.minecraft.extras.RichDescription.of(Component)` -> `Description`
- `org.incendo.cloud.minecraft.extras.parser.TextColorParser.textColorParser()` -> `ParserDescriptor`
- `org.incendo.cloud.minecraft.extras.parser.ComponentParser.componentParser(MiniMessage, StringMode)` -> `ParserDescriptor`
