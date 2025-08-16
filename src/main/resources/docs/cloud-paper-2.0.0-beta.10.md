# cloud-paper-2.0.0-beta.10 API Reference

## Package: org.incendo.cloud.paper

### Class: org.incendo.cloud.paper.PluginMetaHolder
Type: Interface
Implements: org.incendo.cloud.bukkit.PluginHolder

Methods:
- PluginMeta owningPluginMeta()
- Plugin owningPlugin()
- **static** PluginMetaHolder fromPluginHolder(PluginHolder)

### Class: org.incendo.cloud.paper.LegacyPaperCommandManager
Type: Class
Extends: org.incendo.cloud.bukkit.BukkitCommandManager

Methods:
- **static** LegacyPaperCommandManager createNative(Plugin, ExecutionCoordinator) throws BukkitCommandManager$InitializationException
- void registerAsynchronousCompletions() throws IllegalStateException
- void registerLegacyPaperBrigadier() throws BukkitCommandManager$BrigadierInitializationException
- boolean hasBrigadierManager()
- void registerBrigadier() throws BukkitCommandManager$BrigadierInitializationException
- CloudBrigadierManager brigadierManager()

### Class: org.incendo.cloud.paper.PaperCommandManager
Type: Class
Extends: org.incendo.cloud.CommandManager
Implements: org.incendo.cloud.SenderMapperHolder, org.incendo.cloud.paper.PluginMetaHolder, org.incendo.cloud.bukkit.PluginHolder, org.incendo.cloud.brigadier.BrigadierManagerHolder

Methods:
- boolean hasPermission(Object, String)
- **static** PaperCommandManager$Builder builder(SenderMapper)
- **static** PaperCommandManager$Builder builder()
- PluginMeta owningPluginMeta()
- SenderMapper senderMapper()
- boolean hasBrigadierManager()
- CloudBrigadierManager brigadierManager()

### Class: org.incendo.cloud.paper.PaperCommandManager$Bootstrapped
Type: Class
Extends: org.incendo.cloud.paper.PaperCommandManager

Methods:
- void onEnable()

### Class: org.incendo.cloud.paper.PaperCommandManager$Builder
Type: Class

Methods:
- PaperCommandManager$CoordinatedBuilder executionCoordinator(ExecutionCoordinator)

### Class: org.incendo.cloud.paper.PaperCommandManager$CoordinatedBuilder
Type: Class

Methods:
- PaperCommandManager$Bootstrapped buildBootstrapped(BootstrapContext)
- PaperCommandManager buildOnEnable(Plugin)

## Package: org.incendo.cloud.paper.parser

### Class: org.incendo.cloud.paper.parser.RegistryEntryParser$RegistryEntry
Type: Interface

Methods:
- Object value()
- NamespacedKey key()

### Class: org.incendo.cloud.paper.parser.KeyedWorldParser
Type: Class
Implements: org.incendo.cloud.parser.ArgumentParser, org.incendo.cloud.suggestion.SuggestionProvider

Methods:
- **static** CommandComponent$Builder keyedWorldComponent()
- CompletableFuture suggestionsFuture(CommandContext, CommandInput)
- **static** ParserDescriptor keyedWorldParser()
- ArgumentParseResult parse(CommandContext, CommandInput)

### Class: org.incendo.cloud.paper.parser.RegistryEntryParser
Type: Class
Implements: org.incendo.cloud.parser.ArgumentParser, org.incendo.cloud.suggestion.SuggestionProvider, org.incendo.cloud.parser.MappedArgumentParser

Methods:
- CompletableFuture suggestionsFuture(CommandContext, CommandInput)
- **static** ParserDescriptor registryEntryParser(RegistryKey, TypeToken)
- ArgumentParser baseParser()
- ArgumentParseResult parse(CommandContext, CommandInput)

### Class: org.incendo.cloud.paper.parser.RegistryEntryParser$ParseException
Type: Class
Extends: org.incendo.cloud.exception.parsing.ParserException

Methods:
- RegistryKey registryKey()
- String input()

## Package: org.incendo.cloud.paper.suggestion

### Class: org.incendo.cloud.paper.suggestion.SuggestionListener
Type: Interface
Implements: org.bukkit.event.Listener

No public methods found

### Class: org.incendo.cloud.paper.suggestion.SuggestionListenerFactory
Type: Interface

Methods:
- **static** SuggestionListenerFactory create(LegacyPaperCommandManager)
- SuggestionListener createListener()

### Class: org.incendo.cloud.paper.suggestion.SuggestionListenerFactory$SuggestionListenerFactoryImpl
Type: Class
Implements: org.incendo.cloud.paper.suggestion.SuggestionListenerFactory

Methods:
- SuggestionListener createListener()

## Package: org.incendo.cloud.paper.suggestion.tooltips

### Class: org.incendo.cloud.paper.suggestion.tooltips.CompletionMapper
Type: Interface

Methods:
- AsyncTabCompleteEvent$Completion map(TooltipSuggestion)

### Class: org.incendo.cloud.paper.suggestion.tooltips.CompletionMapperFactory
Type: Interface

Methods:
- **static** CompletionMapperFactory detectingRelocation()
- CompletionMapper createMapper()

### Class: org.incendo.cloud.paper.suggestion.tooltips.CompletionMapperFactory$CompletionMapperFactoryImpl
Type: Class
Implements: org.incendo.cloud.paper.suggestion.tooltips.CompletionMapperFactory

Methods:
- CompletionMapper createMapper()

## Package: org.incendo.cloud.paper.util.sender

### Class: org.incendo.cloud.paper.util.sender.Source
Type: Interface

Methods:
- CommandSourceStack stack()
- CommandSender source()

### Class: org.incendo.cloud.paper.util.sender.ConsoleSource
Type: Class
Extends: org.incendo.cloud.paper.util.sender.GenericSource

Methods:
- ConsoleCommandSender source()
- CommandSender source()

### Class: org.incendo.cloud.paper.util.sender.EntitySource
Type: Class
Extends: org.incendo.cloud.paper.util.sender.GenericSource

Methods:
- Entity source()
- CommandSender source()

### Class: org.incendo.cloud.paper.util.sender.PaperSimpleSenderMapper
Type: Class
Implements: org.incendo.cloud.SenderMapper

Methods:
- **static** PaperSimpleSenderMapper simpleSenderMapper()
- CommandSourceStack reverse(Source)
- Object reverse(Object)
- Source map(CommandSourceStack)
- Object map(Object)

### Class: org.incendo.cloud.paper.util.sender.PlayerSource
Type: Class
Extends: org.incendo.cloud.paper.util.sender.EntitySource

Methods:
- Player source()
- Entity source()
- CommandSender source()

