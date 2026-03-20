# CommandAPI-11.1.0-Networking-Plugin API Reference

## Package: dev.jorel.commandapi

### Class: dev.jorel.commandapi.CommandAPINetworkingMain
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- BukkitNetworkingCommandAPIMessenger getMessenger()
- void onEnable()

## Package: dev.jorel.commandapi.exceptions

### Class: dev.jorel.commandapi.exceptions.ProtocolVersionTooOldException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- int getProtocolVersion()
- **static** ProtocolVersionTooOldException whileSending(Object target, int protocolVersion, String reason)
- String getReason()
- **static** ProtocolVersionTooOldException received(Object sender, int protocolVersion, String reason)

## Package: dev.jorel.commandapi.network

### Class: dev.jorel.commandapi.network.CommandAPIPacket
Type: Interface

Methods:
- void write(FriendlyByteBuffer, Object, int) throws ProtocolVersionTooOldException

### Class: dev.jorel.commandapi.network.CommandAPIPacketHandler
Type: Interface

Methods:
- V handlePacket(T, int)

### Class: dev.jorel.commandapi.network.CommandAPIPacketHandlerProvider
Type: Interface

Methods:
- CommandAPIPacketHandler<TInputChannel> getHandlerForProtocol(CommandAPIProtocol protocol)
- HandshakePacketHandler<TInputChannel> getHandshakePacketHandler()
- PlayPacketHandler<TInputChannel> getPlayPacketHandler()

### Class: dev.jorel.commandapi.network.HandshakePacketHandler
Type: Interface
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandler

Methods:
- V handleProtocolVersionTooOldPacket(T sender, int packet)
- V handleSetVersionPacket(T, int)
- V handlePacket(T sender, int packet)

### Class: dev.jorel.commandapi.network.PlayPacketHandler
Type: Interface
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandler

Methods:
- V handleUpdateRequirementsPacket(T, int)
- V handlePacket(T sender, int packet)

### Class: dev.jorel.commandapi.network.BukkitNetworkingCommandAPIMessenger
Type: Class
Extends: dev.jorel.commandapi.network.CommandAPIMessenger
Implements: org.bukkit.plugin.messaging.PluginMessageListener, org.bukkit.event.Listener

Constructors:
- BukkitNetworkingCommandAPIMessenger(CommandAPINetworkingMain plugin)

Methods:
- void sendRawBytes(CommandAPIProtocol protocol, Player target, byte[] bytes)
- void sendRawBytes(CommandAPIProtocol, Object, byte[])
- void onPluginMessageReceived(String channel, Player player, byte[] message)
- void onPlayerRegisterChannel(PlayerRegisterChannelEvent event)
- void onPlayerLeave(PlayerQuitEvent event)
- int getConnectionProtocolVersion(Player target)
- int getConnectionProtocolVersion(Object)
- void setProtocolVersion(Player sender, int protocolVersion)
- void close()

### Class: dev.jorel.commandapi.network.BukkitNetworkingHandshakePacketHandler
Type: Class
Implements: dev.jorel.commandapi.network.HandshakePacketHandler

Methods:
- void handleSetVersionPacket(Player sender, SetVersionPacket packet)
- void handleSetVersionPacket(Object, SetVersionPacket)

### Class: dev.jorel.commandapi.network.BukkitNetworkingPacketHandlerProvider
Type: Class
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandlerProvider

Methods:
- BukkitNetworkingHandshakePacketHandler getHandshakePacketHandler()
- HandshakePacketHandler getHandshakePacketHandler()
- BukkitNetworkingPlayPacketHandler getPlayPacketHandler()
- PlayPacketHandler getPlayPacketHandler()

### Class: dev.jorel.commandapi.network.BukkitNetworkingPlayPacketHandler
Type: Class
Implements: dev.jorel.commandapi.network.PlayPacketHandler

Methods:
- void handleUpdateRequirementsPacket(Player sender, UpdateRequirementsPacket packet)
- void handleUpdateRequirementsPacket(Object, UpdateRequirementsPacket)

### Class: dev.jorel.commandapi.network.CommandAPIMessenger
Type: Abstract Class

Methods:
- V sendPacket(T target, O packet)
- I getConnectionProtocolVersion(T)
- void close()

### Class: dev.jorel.commandapi.network.CommandAPIProtocol
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- HANDSHAKE
- PLAY

Methods:
- String getChannelIdentifier()
- **static** CommandAPIProtocol valueOf(String name)
- **static** CommandAPIProtocol[] values()
- I getId(Class<CommandAPIPacket> clazz)
- **static** CommandAPIProtocol getProtocolForChannel(String channelIdentifier)
- Set<Class<CommandAPIPacket>> getAllPacketTypes()
- CommandAPIPacket createPacket(int id, FriendlyByteBuffer buffer)
- **static** CommandAPIProtocol getProtocolForPacket(Class<CommandAPIPacket> clazz)
- **static** Set<String> getAllChannelIdentifiers()

### Class: dev.jorel.commandapi.network.FriendlyByteBuffer
Type: Class

Constructors:
- FriendlyByteBuffer(byte[] bytes)

Methods:
- void writeInt(int i) throws IllegalStateException
- void writeByte(byte b) throws IllegalStateException
- void writeByte(int i) throws IllegalStateException
- void checkWriteIndexIsInBounds() throws IllegalStateException
- void checkWriteIndexIsInBounds(int writeIndex) throws IllegalStateException
- boolean isReadIndexOutOfBounds()
- boolean isReadIndexOutOfBounds(int readIndex)
- String readString(int maxLength) throws IllegalStateException
- byte[] getRemainingBytes() throws IllegalStateException
- void setReadIndex(int index) throws IllegalStateException
- int getReadIndex()
- void resetIndices()
- void writeBytes(byte[] bytes) throws IllegalStateException
- int countReadableBytes()
- void setWriteIndex(int index) throws IllegalStateException
- int getWriteIndex()
- byte[] toByteArray() throws IllegalStateException
- void writeVarInt(int value) throws IllegalStateException
- byte[] readBytes(int n) throws IllegalStateException
- int countTotalBytes()
- void checkReadIndexIsInBounds() throws IllegalStateException
- void checkReadIndexIsInBounds(int readIndex) throws IllegalStateException
- int readInt() throws IllegalStateException
- byte readByte() throws IllegalStateException
- void writeString(String string, int maxLength)
- boolean isWriteIndexOutOfBounds()
- boolean isWriteIndexOutOfBounds(int writeIndex)
- int readVarInt() throws IllegalStateException

## Package: dev.jorel.commandapi.network.packets

### Class: dev.jorel.commandapi.network.packets.ProtocolVersionTooOldPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Constructors:
- ProtocolVersionTooOldPacket(int protocolVersion, String reason)

Methods:
- String reason()
- int hashCode()
- boolean equals(Object o)
- int protocolVersion()
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion)
- **static** ProtocolVersionTooOldPacket deserialize(FriendlyByteBuffer buffer)

### Class: dev.jorel.commandapi.network.packets.SetVersionPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Constructors:
- SetVersionPacket(int protocolVersion)

Methods:
- int hashCode()
- boolean equals(Object o)
- int protocolVersion()
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion)
- **static** SetVersionPacket deserialize(FriendlyByteBuffer buffer)

### Class: dev.jorel.commandapi.network.packets.UpdateRequirementsPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Methods:
- int hashCode()
- boolean equals(Object o)
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion) throws ProtocolVersionTooOldException
- **static** UpdateRequirementsPacket deserialize(FriendlyByteBuffer ignored)


# CommandAPI-11.1.0-Paper API Reference

## Package: dev.jorel.commandapi

### Class: dev.jorel.commandapi.BukkitExecutable
Type: Interface
Implements: dev.jorel.commandapi.PlatformExecutable

Methods:
- TImpl executesCommandBlock(CommandBlockCommandExecutor executor)
- TImpl executesCommandBlock(CommandBlockExecutionInfo info)
- TImpl executesCommandBlock(CommandBlockResultingCommandExecutor executor)
- TImpl executesCommandBlock(CommandBlockResultingExecutionInfo info)
- TImpl executesPlayer(PlayerCommandExecutor executor)
- TImpl executesPlayer(PlayerExecutionInfo info)
- TImpl executesPlayer(PlayerResultingCommandExecutor executor)
- TImpl executesPlayer(PlayerResultingExecutionInfo info)
- TImpl executesNative(NativeCommandExecutor executor)
- TImpl executesNative(NativeExecutionInfo info)
- TImpl executesNative(NativeResultingCommandExecutor executor)
- TImpl executesNative(NativeResultingExecutionInfo info)
- TImpl executesConsole(ConsoleCommandExecutor executor)
- TImpl executesConsole(ConsoleExecutionInfo info)
- TImpl executesConsole(ConsoleResultingCommandExecutor executor)
- TImpl executesConsole(ConsoleResultingExecutionInfo info)
- TImpl executesProxy(ProxyCommandExecutor executor)
- TImpl executesProxy(ProxyExecutionInfo info)
- TImpl executesProxy(ProxyResultingCommandExecutor executor)
- TImpl executesProxy(ProxyResultingExecutionInfo info)
- TImpl executesFeedbackForwarding(FeedbackForwardingCommandExecutor executor)
- TImpl executesFeedbackForwarding(FeedbackForwardingExecutionInfo info)
- TImpl executesFeedbackForwarding(FeedbackForwardingResultingCommandExecutor executor)
- TImpl executesFeedbackForwarding(FeedbackForwardingResultingExecutionInfo info)
- TImpl executesRemoteConsole(RemoteConsoleCommandExecutor executor)
- TImpl executesRemoteConsole(RemoteConsoleExecutionInfo info)
- TImpl executesRemoteConsole(RemoteConsoleResultingCommandExecutor executor)
- TImpl executesRemoteConsole(RemoteConsoleResultingExecutionInfo info)
- TImpl executes(CommandExecutor executor, ExecutorType types)
- TImpl executes(CommandExecutionInfo executor, ExecutorType types)
- TImpl executes(ResultingCommandExecutor executor, ExecutorType types)
- TImpl executes(ResultingCommandExecutionInfo executor, ExecutorType types)
- TImpl executesEntity(EntityCommandExecutor executor)
- TImpl executesEntity(EntityExecutionInfo info)
- TImpl executesEntity(EntityResultingCommandExecutor executor)
- TImpl executesEntity(EntityResultingExecutionInfo info)

### Class: dev.jorel.commandapi.BukkitPlatform
Type: Interface
Implements: dev.jorel.commandapi.CommandAPIPlatform

Methods:
- BukkitCommandSender<CommandSender> wrapCommandSender(CommandSender)
- AbstractCommandSender wrapCommandSender(Object)
- BukkitCommandAPIMessenger getMessenger()
- void onLoad()
- CommandMap getCommandMap()
- Platform activePlatform()
- CommandRegistrationStrategy<TSource> createCommandRegistrationStrategy()

### Class: dev.jorel.commandapi.ChainableBuilder
Type: Interface

Methods:
- TImpl instance()

### Class: dev.jorel.commandapi.CommandAPILogger
Type: Interface

Methods:
- **static** CommandAPILogger silent()
- **static** CommandAPILogger fromApacheLog4jLogger(Logger logger)
- **static** CommandAPILogger bindToMethods(Consumer<String> info, Consumer<String> warning, Consumer<String> severe, BiConsumer<String, Throwable> severeException)
- **static** CommandAPILogger fromJavaLogger(Logger logger)
- void severe(String)
- void severe(String, Throwable)
- void warning(String)
- **static** CommandAPILogger fromSlf4jLogger(Logger logger)
- void info(String)

### Class: dev.jorel.commandapi.CommandAPIPlatform
Type: Interface

Methods:
- void registerPermission(String)
- CommandAPIMessenger<**> setupMessenger()
- AbstractCommandSender<+TCommandSender> wrapCommandSender(T)
- void unregister(String, boolean)
- AbstractCommandSender<+TCommandSender> getCommandSenderFromCommandSource(T)
- CommandAPILogger getLogger()
- V postCommandRegistration(RegisteredCommand, LiteralCommandNode<TSource>, List<LiteralCommandNode<TSource>>)
- void onEnable()
- void preCommandRegistration(String)
- SuggestionProvider<TSource> getSuggestionProvider(SuggestionProviders)
- TSource getBrigadierSourceFromCommandSender(AbstractCommandSender<+TCommandSender>)
- void onDisable()
- CommandDispatcher<TSource> getBrigadierDispatcher()
- LiteralCommandNode<TSource> registerCommandNode(LiteralArgumentBuilder<TSource>, String)
- TArgument newConcreteLiteralArgument(String, String)
- V updateRequirements(AbstractPlayer<*>)
- AbstractCommandSender<+TCommandSender> getSenderForCommand(CommandContext<TSource>, boolean)
- AbstractCommandAPICommand<*TArgument, TCommandSender> newConcreteCommandAPICommand(CommandMetaData<TCommandSender>)
- TArgument newConcreteMultiLiteralArgument(String, String)
- void onLoad()
- void reloadDataPacks()
- V createDispatcherFile(File, CommandDispatcher<TSource>) throws IOException

### Class: dev.jorel.commandapi.IStringTooltip
Type: Interface

Methods:
- Message getTooltip()
- String getSuggestion()

### Class: dev.jorel.commandapi.MojangMappedVersionHandler
Type: Interface

Methods:
- **static** boolean isMojangMapped()

### Class: dev.jorel.commandapi.PlatformExecutable
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- CommandAPIExecutor<TCommandSender, AbstractCommandSender<+TCommandSender>> getExecutor()

### Class: dev.jorel.commandapi.AbstractArgumentTree
Type: Abstract Class
Extends: dev.jorel.commandapi.Executable

Methods:
- TImpl thenNested(List<AbstractArgumentTree<*TArgument, TCommandSender>> trees)
- TImpl thenNested(AbstractArgumentTree<*TArgument, TCommandSender> trees)
- CommandAPIExecutor getExecutor()
- Executable clearExecutors()
- TImpl then(AbstractArgumentTree<*TArgument, TCommandSender> tree)
- void setExecutor(CommandAPIExecutor)

### Class: dev.jorel.commandapi.AbstractCommandAPICommand
Type: Abstract Class
Extends: dev.jorel.commandapi.ExecutableCommand

Methods:
- V setSubcommands(List<TImpl> subcommands)
- List<TImpl> getSubcommands()
- V setArguments(List<TArgument> args)
- List<TArgument> getArguments()
- TImpl withOptionalArguments(List<TArgument> args)
- TImpl withOptionalArguments([T args)
- TImpl withArguments(List<TArgument> args)
- TImpl withArguments([T args)
- TImpl copy()
- boolean isConverted()
- TImpl withSubcommand(T subcommand)
- TImpl withSubcommands([T subcommands)
- void register(String namespace)

### Class: dev.jorel.commandapi.AbstractCommandTree
Type: Abstract Class
Extends: dev.jorel.commandapi.ExecutableCommand

Methods:
- TImpl thenNested(List<AbstractArgumentTree<*TArgument, TCommandSender>> trees)
- TImpl thenNested(AbstractArgumentTree<*TArgument, TCommandSender> trees)
- TImpl then(AbstractArgumentTree<*TArgument, TCommandSender> tree)
- void register(String namespace)

### Class: dev.jorel.commandapi.Brigadier
Type: Class

Methods:
- **static** SuggestionProvider toSuggestions(T argument, A args)
- **static** LiteralArgumentBuilder fromLiteralArgument(Literal<TArgument> literalArgument)
- **static** RequiredArgumentBuilder fromArgument(List<TArgument> args, T argument)
- **static** RequiredArgumentBuilder fromArgument(T argument)
- **static** TCommandSender getCommandSenderFromContext(CommandContext cmdCtx)
- **static** CommandDispatcher getCommandDispatcher()
- **static** RedirectModifier fromPredicate(BiPredicate<TCommandSender, Object> predicate, List<TArgument> args)
- **static** Object getBrigadierSourceFromCommandSender(T sender)
- **static** Object parseArguments(CommandContext cmdCtx, List<TArgument> args) throws CommandSyntaxException
- **static** Command fromCommand(AbstractCommandAPICommand<*TArgument, TCommandSender> command)
- **static** RootCommandNode getRootNode()

### Class: dev.jorel.commandapi.BukkitStringTooltip
Type: Class
Extends: dev.jorel.commandapi.StringTooltip

Methods:
- **static** Collection<StringTooltip> generateAdventureComponents(Function<String, ComponentLike> tooltipGenerator, String suggestions)
- **static** Collection<StringTooltip> generateAdventureComponents(Function<String, ComponentLike> tooltipGenerator, Collection<String> suggestions)
- **static** StringTooltip ofBaseComponents(String suggestion, BaseComponent[] tooltip)
- **static** Collection<StringTooltip> generateBaseComponents(Function<String, BaseComponent> tooltipGenerator, String suggestions)
- **static** Collection<StringTooltip> generateBaseComponents(Function<String, BaseComponent> tooltipGenerator, Collection<String> suggestions)
- **static** StringTooltip ofAdventureComponent(String suggestion, ComponentLike tooltip)

### Class: dev.jorel.commandapi.BukkitTooltip
Type: Class
Extends: dev.jorel.commandapi.Tooltip

Methods:
- **static** Message messageFromBaseComponents(BaseComponent[] components)
- **static** Message messageFromAdventureComponent(ComponentLike component)
- **static** Tooltip<TS> ofBaseComponents(T object, short tooltip)
- **static** Collection<Tooltip<TS>> generateAdventureComponents(Function<TS, ComponentLike> tooltipGenerator, [T suggestions)
- **static** Collection<Tooltip<TS>> generateAdventureComponents(Function<TS, ComponentLike> tooltipGenerator, Collection<TS> suggestions)
- **static** Collection<Tooltip<TS>> generateBaseComponents(Function<TS, BaseComponent> tooltipGenerator, [T suggestions)
- **static** Collection<Tooltip<TS>> generateBaseComponents(Function<TS, BaseComponent> tooltipGenerator, Collection<TS> suggestions)
- **static** Tooltip<TS> ofAdventureComponent(T object, short tooltip)

### Class: dev.jorel.commandapi.CommandAPI
Type: Class

Methods:
- **static** void logException(String message, Throwable throwable)
- **static** void logNormal(String message)
- **static** void logWarning(String message)
- **static** void unregister(String command)
- **static** void unregister(String command, boolean unregisterNamespaces)
- **static** CommandAPILogger getLogger()
- **static** void logInfo(String message)
- **static** void onEnable()
- **static** void onDisable()
- **static** boolean isLoaded()
- **static** boolean canRegister()
- **static** V updateRequirements(T player)
- **static** void logError(String message)
- **static** InternalConfig getConfiguration()
- **static** void setLogger(CommandAPILogger logger)
- **static** void stopCommandRegistration()
- **static** WrapperCommandSyntaxException failWithString(String message)
- **static** V onLoad(CommandAPIConfig<*> config)
- **static** List<RegisteredCommand> getRegisteredCommands()
- **static** V registerCommand(Class<*> commandClass)
- **static** void reloadDatapacks()
- **static** WrapperCommandSyntaxException failWithMessage(Message message)

### Class: dev.jorel.commandapi.CommandAPIBukkit
Type: Abstract Class
Implements: dev.jorel.commandapi.BukkitPlatform

Methods:
- V registerBukkitRecipesSafely(Iterator<Recipe> recipes)
- void registerPermission(String string)
- BukkitCommandAPIMessenger setupMessenger()
- CommandAPIMessenger setupMessenger()
- BukkitCommandAPIMessenger getMessenger()
- V postCommandRegistration(RegisteredCommand registeredCommand, LiteralCommandNode<TSource> resultantNode, List<LiteralCommandNode<TSource>> aliasNodes)
- TSource getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- void onDisable()
- CommandDispatcher<TSource> getBrigadierDispatcher()
- LiteralCommandNode<TSource> registerCommandNode(LiteralArgumentBuilder<TSource> node, String namespace)
- Argument<String> newConcreteLiteralArgument(String nodeName, String literal)
- AbstractArgument newConcreteLiteralArgument(String, String)
- **static** InternalBukkitConfig getConfiguration()
- NMS<TSource> getNMS()
- CommandAPICommand newConcreteCommandAPICommand(CommandMetaData<CommandSender> meta)
- AbstractCommandAPICommand newConcreteCommandAPICommand(CommandMetaData)
- **static** CommandAPIBukkit<TSource> get()
- void reloadDataPacks()
- V createDispatcherFile(File file, CommandDispatcher<TSource> dispatcher) throws IOException
- CommandRegistrationStrategy<TSource> getCommandRegistrationStrategy()
- **static** V initializeNBTAPI(Class<TT> nbtContainerClass, Function<Object, TT> nbtContainerConstructor)
- BukkitCommandSender<CommandSender> wrapCommandSender(CommandSender)
- AbstractCommandSender wrapCommandSender(Object)
- BukkitCommandSender<CommandSender> getCommandSenderFromCommandSource(T css)
- AbstractCommandSender getCommandSenderFromCommandSource(Object)
- void unregister(String commandName, boolean unregisterNamespaces)
- **static** void unregister(String commandName, boolean unregisterNamespaces, boolean unregisterBukkit)
- CommandAPILogger getLogger()
- void preCommandRegistration(String commandName)
- SuggestionProvider<TSource> getSuggestionProvider(SuggestionProviders suggestionProvider)
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<TSource> cmdCtx, boolean forceNative)
- AbstractCommandSender getSenderForCommand(CommandContext, boolean)
- V updateRequirements(AbstractPlayer<*> player)
- JavaPlugin getPlugin()
- Argument<String> newConcreteMultiLiteralArgument(String nodeName, String literals)
- AbstractArgument newConcreteMultiLiteralArgument(String, String[])
- void onLoad()

### Class: dev.jorel.commandapi.CommandAPIBukkitConfig
Type: Abstract Class
Extends: dev.jorel.commandapi.CommandAPIConfig

Constructors:
- CommandAPIBukkitConfig(String pluginName)

Methods:
- TT instance()
- Object instance()
- TT initializeNBTAPI(Class<TNBT> nbtContainerClass, Function<Object, TNBT> nbtContainerConstructor)
- TT addSkipSenderProxy(String names)
- TT addSkipSenderProxy(List<String> names)
- TT setNamespace(String namespace)
- CommandAPIConfig setNamespace(String)
- TT fallbackToLatestNMS(boolean fallbackToLatestNMS)

### Class: dev.jorel.commandapi.CommandAPICommand
Type: Class
Extends: dev.jorel.commandapi.AbstractCommandAPICommand
Implements: dev.jorel.commandapi.BukkitExecutable

Constructors:
- CommandAPICommand(CommandMetaData<CommandSender> meta)
- CommandAPICommand(String commandName)

Methods:
- CommandAPICommand instance()
- Object instance()
- void register(String namespace)
- void register(JavaPlugin plugin)
- CommandAPICommand withHelp(HelpTopic helpTopic)

### Class: dev.jorel.commandapi.CommandAPIConfig
Type: Abstract Class
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- TImpl enableNetworking(boolean enabled)
- TImpl makeNetworkingExceptionsWarnings(boolean value)
- TImpl missingExecutorImplementationMessage(String value)
- TImpl silentLogs(boolean value)
- TImpl dispatcherFile(File file)
- TImpl setNamespace(String namespace)
- TImpl verboseOutput(boolean value)

### Class: dev.jorel.commandapi.CommandAPIExecutor
Type: Class

Methods:
- V setNormalExecutors(List<NormalExecutor<TCommandSender, TWrapperType>> normalExecutors)
- boolean hasAnyExecutors()
- V addNormalExecutor(NormalExecutor<**> executor)
- V setResultingExecutors(List<ResultingExecutor<TCommandSender, TWrapperType>> resultingExecutors)
- List<NormalExecutor<TCommandSender, TWrapperType>> getNormalExecutors()
- I execute(ExecutionInfo<TCommandSender, TWrapperType> info) throws CommandSyntaxException
- V addResultingExecutor(ResultingExecutor<**> executor)
- boolean isForceNative()
- List<ResultingExecutor<TCommandSender, TWrapperType>> getResultingExecutors()

### Class: dev.jorel.commandapi.CommandAPIHandler
Type: Class

Methods:
- **static** Field getField(Class<*> clazz, String name)
- **static** Field getField(Class<*> clazz, String name, String mojangMappedName)
- Command<TSource> generateCommand([T args, A executor, r converted)
- void writeDispatcherToFile()
- void onLoad()
- **static** CommandAPIHandler<***> getInstance()
- void onEnable()
- **static** String getRawArgumentInput(CommandContext<TCommandSource> cmdCtx, String key)
- void onDisable()
- CommandAPIPlatform<TArgument, TCommandSender, TSource> getPlatform()

### Class: dev.jorel.commandapi.CommandAPIMain
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- void onLoad()
- void onEnable()
- void saveDefaultConfig()

### Class: dev.jorel.commandapi.CommandAPIPaper
Type: Class
Extends: dev.jorel.commandapi.CommandAPIBukkit

Methods:
- **static** WrapperCommandSyntaxException failWithAdventureComponent(ComponentLike message)
- **static** InternalPaperConfig getConfiguration()
- **static** CommandAPIPaper<TSource> getPaper()
- BukkitCommandSender<CommandSender> wrapCommandSender(CommandSender sender)
- AbstractCommandSender wrapCommandSender(Object)
- BundledNMS<TSource> getNMS()
- NMS getNMS()
- CommandAPILogger getLogger()
- void onLoad()
- CommandMap getCommandMap()
- Platform activePlatform()
- void onEnable()
- LifecycleEventOwner getLifecycleEventOwner()
- CommandRegistrationStrategy<TSource> createCommandRegistrationStrategy()

### Class: dev.jorel.commandapi.CommandAPIPaperConfig
Type: Class
Extends: dev.jorel.commandapi.CommandAPIBukkitConfig

Constructors:
- CommandAPIPaperConfig(LifecycleEventOwner hookPaperReload)

Methods:
- CommandAPIPaperConfig instance()
- CommandAPIBukkitConfig instance()
- Object instance()

### Class: dev.jorel.commandapi.CommandAPIVersionHandler
Type: Abstract Class

No public methods found

### Class: dev.jorel.commandapi.CommandPermission
Type: Class

Methods:
- Optional<String> getPermission()
- int hashCode()
- boolean equals(Object obj)
- boolean isNegated()
- String toString()
- **static** CommandPermission fromString(String permission)

### Class: dev.jorel.commandapi.CommandRegistrationStrategy
Type: Abstract Class

Methods:
- void runTasksAfterServerStart()
- void unregister(String, boolean, boolean)
- void preReloadDataPacks()
- V postCommandRegistration(RegisteredCommand registeredCommand, LiteralCommandNode<TSource> resultantNode, List<LiteralCommandNode<TSource>> aliasNodes)
- LiteralCommandNode<TSource> registerCommandNode(LiteralArgumentBuilder<TSource>, String)
- CommandDispatcher<TSource> getBrigadierDispatcher()

### Class: dev.jorel.commandapi.CommandTree
Type: Class
Extends: dev.jorel.commandapi.AbstractCommandTree
Implements: dev.jorel.commandapi.BukkitExecutable

Constructors:
- CommandTree(String commandName)

Methods:
- CommandTree instance()
- Object instance()
- void register(String namespace)
- void register(JavaPlugin plugin)

### Class: dev.jorel.commandapi.Converter
Type: Class

Methods:
- **static** void convert(JavaPlugin plugin)
- **static** void convert(JavaPlugin plugin, String cmdName)
- **static** V convert(JavaPlugin plugin, String cmdName, Argument<*> arguments)
- **static** V convert(JavaPlugin plugin, String cmdName, List<Argument<*>> arguments)
- **static** void convert(String cmdName)
- **static** V convert(String cmdName, List<Argument<*>> arguments)

### Class: dev.jorel.commandapi.ExecutableCommand
Type: Abstract Class
Extends: dev.jorel.commandapi.Executable

Methods:
- TImpl withPermission(CommandPermission permission)
- TImpl withPermission(String permission)
- TImpl withUsage(String usage)
- String[] getAliases()
- Predicate<TCommandSender> getRequirements()
- CommandPermission getPermission()
- String getName()
- void setAliases(String[] aliases)
- CommandAPIExecutor getExecutor()
- void setExecutor(CommandAPIExecutor)
- TImpl withShortDescription(String description)
- TImpl withHelp(String shortDescription, String fullDescription)
- String[] getUsage()
- TImpl withRequirement(Predicate<TCommandSender> requirement)
- TImpl withFullDescription(String description)
- String getFullDescription()
- String getShortDescription()
- TImpl withAliases(String aliases)
- Executable clearExecutors()
- void override()
- void setPermission(CommandPermission permission)
- V setRequirements(Predicate<TCommandSender> requirements)
- TImpl withoutPermission(CommandPermission permission)
- TImpl withoutPermission(String permission)
- void register()
- void register(String)

### Class: dev.jorel.commandapi.Execution
Type: Class

Constructors:
- Execution(List<TArgument> arguments, CommandAPIExecutor<TCommandSender, AbstractCommandSender<+TCommandSender>> executor)

Methods:
- Execution<TCommandSender, TArgument> prependedBy(T argument)
- V register(CommandMetaData<TCommandSender> meta, String namespace)

### Class: dev.jorel.commandapi.InternalBukkitConfig
Type: Abstract Class
Extends: dev.jorel.commandapi.InternalConfig

Constructors:
- InternalBukkitConfig(CommandAPIBukkitConfig<CommandAPIBukkitConfig<*>> pluginName)

Methods:
- V lateInitializeNBT(Class<*> nbtContainerClass, Function<Object, *> nbtContainerConstructor)
- Class<*> getNBTContainerClass()
- boolean skipReloadDatapacks()
- String getPluginName()
- Function<Object, *> getNBTContainerConstructor()
- boolean shouldSkipSenderProxy(String commandName)
- boolean fallbackToLatestNMS()

### Class: dev.jorel.commandapi.InternalConfig
Type: Class

Constructors:
- InternalConfig(CommandAPIConfig<*> verboseOutput)

Methods:
- String getNamespace()
- boolean hasSilentLogs()
- boolean makeNetworkingExceptionsWarnings()
- boolean isNetworkingEnabled()
- String getMissingImplementationMessage()
- boolean hasVerboseOutput()
- File getDispatcherFile()

### Class: dev.jorel.commandapi.InternalPaperConfig
Type: Class
Extends: dev.jorel.commandapi.InternalBukkitConfig

Constructors:
- InternalPaperConfig(CommandAPIPaperConfig pluginMeta)

Methods:
- PluginMeta getPluginMeta()
- LifecycleEventOwner getLifecycleEventOwner()

### Class: dev.jorel.commandapi.LoadContext
Type: Class
Extends: java.lang.Record

Constructors:
- LoadContext(CommandAPIPlatform<***> platform)
- LoadContext(CommandAPIPlatform<***> platform, Runnable context)

Methods:
- int hashCode()
- boolean equals(Object o)
- Runnable context()
- String toString()
- CommandAPIPlatform<***> platform()

### Class: dev.jorel.commandapi.PaperCommandRegistration
Type: Class
Extends: dev.jorel.commandapi.CommandRegistrationStrategy

Constructors:
- PaperCommandRegistration(Supplier<CommandDispatcher<TSource>> getBrigadierDispatcher, Predicate<CommandNode<TSource>> isBukkitCommand)

Methods:
- void unregister(String commandName, boolean unregisterNamespaces, boolean unregisterBukkit)
- Z isBukkitCommand(CommandNode<TSource> node)
- void preReloadDataPacks()
- LiteralCommandNode<TSource> registerCommandNode(LiteralArgumentBuilder<TSource> node, String namespace)
- CommandDispatcher<TSource> getBrigadierDispatcher()

### Class: dev.jorel.commandapi.Platform
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SPIGOT
- PAPER

Methods:
- **static** Platform valueOf(String name)
- **static** Platform[] values()

### Class: dev.jorel.commandapi.RegisteredCommand
Type: Class
Extends: java.lang.Record

Constructors:
- RegisteredCommand(String commandName, List<String> argsAsStr, List<AbstractArgument<****>> arguments, Optional<String> shortDescription, Optional<String> fullDescription, Optional<String> usageDescription, Optional<Object> helpTopic, String aliases, CommandPermission permission, String namespace)

Methods:
- String[] aliases()
- boolean shouldGenerateHelpTopic()
- CommandPermission permission()
- Optional<String> usageDescription()
- Optional<String> shortDescription()
- Optional<String> fullDescription()
- String commandName()
- int hashCode()
- boolean equals(Object obj)
- String namespace()
- Optional<Object> helpTopic()
- List<AbstractArgument<****>> arguments()
- String toString()
- List<String> argsAsStr()

### Class: dev.jorel.commandapi.SafeVarHandle
Type: Class

Methods:
- TFieldType getStatic()
- V set(T instance, T param)
- TFieldType get(T instance)
- **static** SafeVarHandle<TType, TFieldType> ofOrNull(Class<-TType> classType, String fieldName, String mojangMappedFieldName, Class<-TFieldType> fieldType)

### Class: dev.jorel.commandapi.Schedulers
Type: Class

Constructors:
- Schedulers(boolean isFoliaPresent)

Methods:
- void scheduleSync(Plugin plugin, Runnable runnable)
- int scheduleSyncRepeatingTask(Plugin plugin, Runnable runnable, long delay, long)
- void scheduleSyncDelayed(Plugin plugin, Runnable runnable, long delay)
- void cancelTask(Plugin plugin, int id)
- void scheduleAsync(Plugin plugin, Runnable runnable)

### Class: dev.jorel.commandapi.StringTooltip
Type: Class
Implements: dev.jorel.commandapi.IStringTooltip

Methods:
- **static** StringTooltip ofString(String suggestion, String tooltip)
- **static** Collection<StringTooltip> generateStrings(UnaryOperator<String> tooltipGenerator, String suggestions)
- **static** Collection<StringTooltip> generateStrings(UnaryOperator<String> tooltipGenerator, Collection<String> suggestions)
- Message getTooltip()
- **static** StringTooltip ofMessage(String suggestion, Message tooltip)
- **static** Collection<StringTooltip> generateMessages(Function<String, Message> tooltipGenerator, String suggestions)
- **static** Collection<StringTooltip> generateMessages(Function<String, Message> tooltipGenerator, Collection<String> suggestions)
- **static** StringTooltip none(String suggestion)
- **static** Collection<StringTooltip> none(String suggestions)
- **static** Collection<StringTooltip> none(Collection<String> suggestions)
- String getSuggestion()

### Class: dev.jorel.commandapi.SuggestionInfo
Type: Class
Extends: java.lang.Record

Constructors:
- SuggestionInfo(T sender, char previousArgs, o currentInput, m currentArg)

Methods:
- String currentInput()
- TCommandSender sender()
- int hashCode()
- boolean equals(Object o)
- String currentArg()
- CommandArguments previousArgs()
- String toString()

### Class: dev.jorel.commandapi.Tooltip
Type: Class

Methods:
- **static** Tooltip<TS> ofString(T object, short tooltip)
- **static** Collection<Tooltip<TS>> generateStrings(Function<TS, String> tooltipGenerator, [T suggestions)
- **static** Collection<Tooltip<TS>> generateStrings(Function<TS, String> tooltipGenerator, Collection<TS> suggestions)
- Message getTooltip()
- **static** Function<Tooltip<TS>, StringTooltip> build(Function<TS, String> mapper)
- **static** Tooltip<TS> ofMessage(T object, short tooltip)
- **static** Collection<Tooltip<TS>> generateMessages(Function<TS, Message> tooltipGenerator, [T suggestions)
- **static** Collection<Tooltip<TS>> generateMessages(Function<TS, Message> tooltipGenerator, Collection<TS> suggestions)
- **static** Tooltip<TS> arrayOf(Tooltip<TS> tooltips)
- **static** Tooltip<TS> none(T object)
- **static** Collection<Tooltip<TS>> none([T suggestions)
- **static** Collection<Tooltip<TS>> none(Collection<TS> suggestions)
- **static** Message messageFromString(String string)
- TS getSuggestion()

## Package: dev.jorel.commandapi.arguments

### Class: dev.jorel.commandapi.arguments.ArgumentSuggestions
Type: Interface

Methods:
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltipsAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<IStringTooltip>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<String>>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<String>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> strings(String suggestions)
- **static** ArgumentSuggestions<TCommandSender> strings(Collection<String> suggestions)
- **static** ArgumentSuggestions<TCommandSender> strings(Function<SuggestionInfo<TCommandSender>, String> suggestions)
- **static** ArgumentSuggestions<TCommandSender> merge(ArgumentSuggestions<TCommandSender> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltipsCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<IStringTooltip>>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringCollection(Function<SuggestionInfo<TCommandSender>, Collection<String>> suggestions)
- CompletableFuture<Suggestions> suggest(SuggestionInfo<TCommandSender>, SuggestionsBuilder) throws CommandSyntaxException
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltipsCollection(Function<SuggestionInfo<TCommandSender>, Collection<IStringTooltip>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltips(IStringTooltip suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltips(Collection<IStringTooltip> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltips(Function<SuggestionInfo<TCommandSender>, IStringTooltip> suggestions)
- **static** ArgumentSuggestions<TCommandSender> empty()

### Class: dev.jorel.commandapi.arguments.CustomArgument$CustomArgumentInfoParser
Type: Interface

Methods:
- TT apply(CustomArgument$CustomArgumentInfo<TB>) throws CustomArgument$CustomArgumentException

### Class: dev.jorel.commandapi.arguments.CustomProvidedArgument
Type: Interface

Methods:
- SuggestionProviders getSuggestionProvider()

### Class: dev.jorel.commandapi.arguments.GreedyArgument
Type: Interface

No public methods found

### Class: dev.jorel.commandapi.arguments.Literal
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- String getLiteral()

### Class: dev.jorel.commandapi.arguments.MultiLiteral
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- String[] getLiterals()

### Class: dev.jorel.commandapi.arguments.SafeOverrideable
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- TImpl replaceSafeSuggestions(SafeSuggestions<TS, TCommandSender> suggestions)
- Function<TS, String> getMapper()
- TImpl includeSuggestions(ArgumentSuggestions<TCommandSender>)
- TImpl replaceSuggestions(ArgumentSuggestions<TCommandSender>)
- TImpl includeSafeSuggestions(SafeSuggestions<TS, TCommandSender> suggestions)

### Class: dev.jorel.commandapi.arguments.SafeSuggestions
Type: Interface

Methods:
- ArgumentSuggestions<TCommandSender> toSuggestions(Function<TS, String>)
- **static** SafeSuggestions<TT, TCommandSender> tooltipsAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Tooltip<TT>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggestCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<TT>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggestCollection(Function<SuggestionInfo<TCommandSender>, Collection<TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltipCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<Tooltip<TT>>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggest([T suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggest(Collection<TT> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggest(Function<SuggestionInfo<TCommandSender>, [TT> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltipCollection(Function<SuggestionInfo<TCommandSender>, Collection<Tooltip<TT>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltips(Tooltip<TT> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltips(Collection<Tooltip<TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltips(Function<SuggestionInfo<TCommandSender>, Tooltip<TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggestAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<[TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> empty()

### Class: dev.jorel.commandapi.arguments.StringParser
Type: Interface

Methods:
- TT parse(String) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.arguments.AbstractArgument
Type: Abstract Class
Extends: dev.jorel.commandapi.AbstractArgumentTree

Methods:
- TImpl withPermission(CommandPermission permission)
- TImpl withPermission(String permission)
- String getHelpString()
- TT parseArgument(CommandContext<TSource>, String, CommandArguments) throws CommandSyntaxException
- ArgumentType<*> getRawType()
- Predicate<TCommandSender> getRequirements()
- Optional<ArgumentSuggestions<TCommandSender>> getIncludedSuggestions()
- V copyPermissionsAndRequirements(T argument)
- TImpl setListed(boolean listed)
- TImpl includeSuggestions(ArgumentSuggestions<TCommandSender> suggestions)
- boolean isOptional()
- String getNodeName()
- List<String> getEntityNames(Object argument)
- boolean hasCombinedArguments()
- List<TArgument> getCombinedArguments()
- TImpl withRequirement(Predicate<TCommandSender> requirement)
- CommandPermission getArgumentPermission()
- CommandAPIArgumentType getArgumentType()
- boolean isListed()
- Class<TT> getPrimitiveType()
- Optional<ArgumentSuggestions<TCommandSender>> getOverriddenSuggestions()
- String toString()
- TImpl replaceSuggestions(ArgumentSuggestions<TCommandSender> suggestions)
- TImpl combineWith([T combinedArguments)
- TImpl setOptional(boolean optional)

### Class: dev.jorel.commandapi.arguments.AdvancementArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- AdvancementArgument(String nodeName)

Methods:
- Advancement parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Advancement> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.AngleArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- AngleArgument(String nodeName)

Methods:
- Float parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Float> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.Argument
Type: Abstract Class
Extends: dev.jorel.commandapi.arguments.AbstractArgument
Implements: dev.jorel.commandapi.BukkitExecutable

Methods:
- Argument<TT> instance()
- Object instance()

### Class: dev.jorel.commandapi.arguments.ArgumentSubType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ENTITYSELECTOR_ONE_ENTITY
- ENTITYSELECTOR_ONE_PLAYER
- ENTITYSELECTOR_MANY_ENTITIES
- ENTITYSELECTOR_MANY_PLAYERS
- BIOME_BIOME
- BIOME_NAMESPACEDKEY
- SOUND_SOUND
- SOUND_NAMESPACEDKEY
- SCOREHOLDER_SINGLE
- SCOREHOLDER_MULTIPLE
- POTION_EFFECT_POTION_EFFECT
- POTION_EFFECT_NAMESPACEDKEY

Methods:
- **static** ArgumentSubType valueOf(String name)
- **static** ArgumentSubType[] values()

### Class: dev.jorel.commandapi.arguments.AsyncPlayerProfileArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- AsyncPlayerProfileArgument(String nodeName)

Methods:
- CompletableFuture<List<PlayerProfile>> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs)
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<CompletableFuture<List<PlayerProfile>>> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.AxisArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- AxisArgument(String nodeName)

Methods:
- EnumSet<Axis> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<EnumSet> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.BiomeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- BiomeArgument(String nodeName)

Methods:
- Biome parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Biome> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.BiomeArgument$NamespacedKey
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- BiomeArgument$NamespacedKey(String nodeName)

Methods:
- NamespacedKey parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<NamespacedKey> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.BlockPredicateArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- BlockPredicateArgument(String nodeName)

Methods:
- Predicate<*> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Predicate> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.BlockStateArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- BlockStateArgument(String nodeName)

Methods:
- BlockState parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<BlockState> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.BooleanArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- BooleanArgument(String nodeName)

Methods:
- Boolean parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Boolean> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ChatArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.GreedyArgument

Constructors:
- ChatArgument(String nodeName)

Methods:
- SignedMessage parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<SignedMessage> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ChatColorArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- ChatColorArgument(String nodeName)

Methods:
- NamedTextColor parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<NamedTextColor> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ChatComponentArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- ChatComponentArgument(String nodeName)

Methods:
- Component parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Component> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.CommandAPIArgumentType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ADVANCEMENT
- ADVENTURE_CHAT
- ADVENTURE_CHATCOLOR
- ADVENTURE_CHAT_COMPONENT
- ANGLE
- ASYNC_OFFLINE_PLAYER
- AXIS
- BIOME
- BLOCK_PREDICATE
- BLOCKSTATE
- CHAT
- CHAT_COMPONENT
- CHATCOLOR
- COMMAND
- CUSTOM
- DIMENSION
- ENCHANTMENT
- ENTITY_SELECTOR
- ENTITY_TYPE
- ENVIRONMENT
- FLOAT_RANGE
- FUNCTION
- INT_RANGE
- ITEMSTACK
- ITEMSTACK_PREDICATE
- LIST
- LIST_TEXT
- LITERAL
- LOCATION
- LOCATION_2D
- LOOT_TABLE
- MAP
- MATH_OPERATION
- MULTI_LITERAL
- NAMESPACED_KEY
- NBT_COMPOUND
- OBJECTIVE
- OBJECTIVE_CRITERIA
- PARTICLE
- PLAYER
- POTION_EFFECT
- PRIMITIVE_BOOLEAN
- PRIMITIVE_DOUBLE
- PRIMITIVE_FLOAT
- PRIMITIVE_GREEDY_STRING
- PRIMITIVE_INTEGER
- PRIMITIVE_LONG
- PRIMITIVE_STRING
- PRIMITIVE_TEXT
- RECIPE
- ROTATION
- SCORE_HOLDER
- SCOREBOARD_SLOT
- SOUND
- TEAM
- TIME
- UUID

Methods:
- **static** CommandAPIArgumentType fromInternal(String internal)
- **static** CommandAPIArgumentType valueOf(String name)
- **static** CommandAPIArgumentType[] values()

### Class: dev.jorel.commandapi.arguments.CommandArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.GreedyArgument

Constructors:
- CommandArgument(String replacements)

Methods:
- CommandResult parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<CommandResult> getPrimitiveType()
- Argument<CommandResult> branchSuggestions(SuggestionsBranch<CommandSender> branches)
- CommandArgument replaceSuggestions(ArgumentSuggestions<CommandSender> suggestions)
- CommandArgument replaceSuggestions(ArgumentSuggestions<CommandSender> suggestions)
- AbstractArgument replaceSuggestions(ArgumentSuggestions)
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.CustomArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- CustomArgument(Argument<TB> base, CustomArgument$CustomArgumentInfoParser<TT, TB> infoParser)

Methods:
- TT parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Class<TT> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.CustomArgument$CustomArgumentException
Type: Class
Extends: java.lang.Exception

Methods:
- CommandSyntaxException toCommandSyntax(String result, CommandContext<*> cmdCtx)
- **static** CustomArgument$CustomArgumentException fromAdventureComponent(ComponentLike errorMessage)
- **static** CustomArgument$CustomArgumentException fromString(String errorMessage)
- **static** CustomArgument$CustomArgumentException fromMessageBuilder(CustomArgument$MessageBuilder errorMessage)

### Class: dev.jorel.commandapi.arguments.CustomArgument$CustomArgumentInfo
Type: Class
Extends: java.lang.Record

Constructors:
- CustomArgument$CustomArgumentInfo(CommandSender sender, CommandArguments previousArgs, String input, T currentInput)

Methods:
- String input()
- TB currentInput()
- CommandSender sender()
- int hashCode()
- boolean equals(Object o)
- CommandArguments previousArgs()
- String toString()

### Class: dev.jorel.commandapi.arguments.CustomArgument$MessageBuilder
Type: Class
Implements: java.io.Serializable

Constructors:
- CustomArgument$MessageBuilder(String builder)

Methods:
- CustomArgument$MessageBuilder appendArgInput()
- String toString()
- CustomArgument$MessageBuilder append(String str)
- CustomArgument$MessageBuilder append(Object obj)
- CustomArgument$MessageBuilder appendHere()
- CustomArgument$MessageBuilder appendFullInput()

### Class: dev.jorel.commandapi.arguments.DoubleArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- DoubleArgument(String nodeName)
- DoubleArgument(String nodeName, double min)
- DoubleArgument(String nodeName, double min, double max)

Methods:
- Double parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Double> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.DoubleRangeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- DoubleRangeArgument(String nodeName)

Methods:
- DoubleRange parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<DoubleRange> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EnchantmentArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- EnchantmentArgument(String nodeName)

Methods:
- Enchantment parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Enchantment> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EntitySelectorArgument
Type: Class

No public methods found

### Class: dev.jorel.commandapi.arguments.EntitySelectorArgument$ManyEntities
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- EntitySelectorArgument$ManyEntities(String nodeName)
- EntitySelectorArgument$ManyEntities(String nodeName, boolean allowEmpty)

Methods:
- Collection<Entity> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Collection> getPrimitiveType()
- List<String> getEntityNames(Object argument)
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EntitySelectorArgument$ManyPlayers
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- EntitySelectorArgument$ManyPlayers(String nodeName)
- EntitySelectorArgument$ManyPlayers(String nodeName, boolean allowEmpty)

Methods:
- Collection<Player> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Collection> getPrimitiveType()
- List<String> getEntityNames(Object argument)
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EntitySelectorArgument$OneEntity
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- EntitySelectorArgument$OneEntity(String nodeName)

Methods:
- Entity parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Entity> getPrimitiveType()
- List<String> getEntityNames(Object argument)
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EntitySelectorArgument$OnePlayer
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- EntitySelectorArgument$OnePlayer(String nodeName)

Methods:
- Player parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Player> getPrimitiveType()
- List<String> getEntityNames(Object argument)
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EntityTypeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- EntityTypeArgument(String nodeName)

Methods:
- EntityType parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<EntityType> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.FloatArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- FloatArgument(String nodeName)
- FloatArgument(String nodeName, float min)
- FloatArgument(String nodeName, float min, float max)

Methods:
- Float parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Float> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.FunctionArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- FunctionArgument(String nodeName)

Methods:
- FunctionWrapper parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<FunctionWrapper> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.GreedyStringArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.GreedyArgument

Constructors:
- GreedyStringArgument(String nodeName)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.IntegerArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- IntegerArgument(String nodeName)
- IntegerArgument(String nodeName, int min)
- IntegerArgument(String nodeName, int min, int max)

Methods:
- Integer parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Integer> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.IntegerRangeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- IntegerRangeArgument(String nodeName)

Methods:
- IntegerRange parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<IntegerRange> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ItemStackArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- ItemStackArgument(String nodeName)

Methods:
- ItemStack parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<ItemStack> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ItemStackPredicateArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- ItemStackPredicateArgument(String nodeName)

Methods:
- Predicate<ItemStack> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Predicate> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ListArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.ListArgumentCommon
Implements: dev.jorel.commandapi.arguments.GreedyArgument

No public methods found

### Class: dev.jorel.commandapi.arguments.ListArgumentBuilder
Type: Class

Constructors:
- ListArgumentBuilder(String nodeName)
- ListArgumentBuilder(String nodeName, String delimiter)

Methods:
- ListArgumentBuilder<TT> allowDuplicates(boolean allowDuplicates)
- ListArgumentBuilder<TT>ListArgumentBuilderSuggests withList(Function<SuggestionInfo<CommandSender>, Collection<TT>> list)
- ListArgumentBuilder<TT>ListArgumentBuilderSuggests withList(Supplier<Collection<TT>> list)
- ListArgumentBuilder<TT>ListArgumentBuilderSuggests withList(Collection<TT> list)
- ListArgumentBuilder<TT>ListArgumentBuilderSuggests withList([T array)

### Class: dev.jorel.commandapi.arguments.ListArgumentBuilder$ListArgumentBuilderSuggests
Type: Class

Methods:
- ListArgumentBuilder<TT>ListArgumentBuilderFinished withStringTooltipMapper(Function<TT, IStringTooltip> mapper)
- ListArgumentBuilder<TT>ListArgumentBuilderFinished withMapper(Function<TT, String> mapper)
- ListArgumentBuilder<TT>ListArgumentBuilderFinished withStringMapper()

### Class: dev.jorel.commandapi.arguments.ListArgumentBuilder$ListArgumentBuilderSuggests$ListArgumentBuilderFinished
Type: Class

Methods:
- ListArgument<TT> buildGreedy()
- ListTextArgument<TT> buildText()

### Class: dev.jorel.commandapi.arguments.ListArgumentCommon
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Methods:
- List<TT> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<List> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ListTextArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.ListArgumentCommon

No public methods found

### Class: dev.jorel.commandapi.arguments.LiteralArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.Literal

Constructors:
- LiteralArgument(String literal)
- LiteralArgument(String nodeName, String literal)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- String getHelpString()
- String getLiteral()
- **static** LiteralArgument of(String literal)
- **static** LiteralArgument of(String nodeName, String literal)
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()
- **static** LiteralArgument literal(String literal)
- **static** LiteralArgument literal(String nodeName, String literal)

### Class: dev.jorel.commandapi.arguments.Location2DArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- Location2DArgument(String nodeName)
- Location2DArgument(String nodeName, LocationType type)
- Location2DArgument(String nodeName, LocationType isPrecise, boolean centerPosition)

Methods:
- Location2D parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Location2D> getPrimitiveType()
- LocationType getLocationType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.LocationArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- LocationArgument(String nodeName)
- LocationArgument(String nodeName, LocationType type)
- LocationArgument(String nodeName, LocationType isPrecise, boolean centerPosition)

Methods:
- Location parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Location> getPrimitiveType()
- LocationType getLocationType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.LocationType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BLOCK_POSITION
- PRECISE_POSITION

Methods:
- **static** LocationType valueOf(String name)
- **static** LocationType[] values()

### Class: dev.jorel.commandapi.arguments.LongArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- LongArgument(String nodeName)
- LongArgument(String nodeName, long min)
- LongArgument(String nodeName, long min, long max)

Methods:
- Long parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Long> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.LootTableArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- LootTableArgument(String nodeName)

Methods:
- LootTable parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<LootTable> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.MapArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.GreedyArgument

Methods:
- LinkedHashMap<TK, TV> parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<LinkedHashMap> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.MapArgumentBuilder
Type: Class

Constructors:
- MapArgumentBuilder(String nodeName)
- MapArgumentBuilder(String nodeName, char delimiter)
- MapArgumentBuilder(String nodeName, char delimiter, String separator)

Methods:
- MapArgumentBuilder<TK, TV>MapArgumentBuilderValueMapper withKeyMapper(StringParser<TK> keyMapper)

### Class: dev.jorel.commandapi.arguments.MapArgumentBuilder$MapArgumentBuilderValueMapper
Type: Class

Constructors:
- MapArgumentBuilder$MapArgumentBuilderValueMapper(StringParser<TK> this$0, StringParser keyMapper)

Methods:
- MapArgumentBuilder<TK, TV>MapArgumentBuilderSuggestsKey withValueMapper(StringParser<TV> valueMapper)

### Class: dev.jorel.commandapi.arguments.MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey
Type: Class

Constructors:
- MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey(StringParser<TV> this$1, StringParser valueMapper)

Methods:
- MapArgumentBuilder<TK, TV>MapArgumentBuilderSuggestsValue withKeyList(List<String> keyList)
- MapArgumentBuilder<TK, TV>MapArgumentBuilderSuggestsValue withoutKeyList()

### Class: dev.jorel.commandapi.arguments.MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey$MapArgumentBuilderSuggestsValue
Type: Class

Constructors:
- MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey$MapArgumentBuilderSuggestsValue(List<String> this$2, List keyList)

Methods:
- MapArgumentBuilder<TK, TV>MapArgumentBuilderFinished withoutValueList()
- MapArgumentBuilder<TK, TV>MapArgumentBuilderFinished withoutValueList(boolean allowDuplicates)
- MapArgumentBuilder<TK, TV>MapArgumentBuilderFinished withValueList(List<String> valueList)
- MapArgumentBuilder<TK, TV>MapArgumentBuilderFinished withValueList(List<String> valueList, boolean allowDuplicates)

### Class: dev.jorel.commandapi.arguments.MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey$MapArgumentBuilderSuggestsValue$MapArgumentBuilderFinished
Type: Class

Constructors:
- MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey$MapArgumentBuilderSuggestsValue$MapArgumentBuilderFinished(List<String> this$3, boolean valueList, boolean allowValueDuplicates)

Methods:
- MapArgument<TK, TV> build()

### Class: dev.jorel.commandapi.arguments.MathOperationArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- MathOperationArgument(String nodeName)

Methods:
- MathOperation parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<MathOperation> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.MultiLiteralArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.MultiLiteral

Constructors:
- MultiLiteralArgument(String nodeName, String[] literals)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- String[] getLiterals()
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.NBTCompoundArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- NBTCompoundArgument(String nodeName)

Methods:
- TNBTContainer parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Class<TNBTContainer> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.NamespacedKeyArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- NamespacedKeyArgument(String nodeName)

Methods:
- NamespacedKey parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<NamespacedKey> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ObjectiveArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- ObjectiveArgument(String nodeName)

Methods:
- Objective parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Objective> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ObjectiveCriteriaArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- ObjectiveCriteriaArgument(String nodeName)

Methods:
- String parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ParticleArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- ParticleArgument(String nodeName)

Methods:
- ParticleData<*> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<ParticleData> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.PlayerProfileArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- PlayerProfileArgument(String nodeName)

Methods:
- List<PlayerProfile> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<List> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.PotionEffectArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- PotionEffectArgument(String nodeName)

Methods:
- PotionEffectType parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<PotionEffectType> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.PotionEffectArgument$NamespacedKey
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- PotionEffectArgument$NamespacedKey(String nodeName)

Methods:
- NamespacedKey parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<NamespacedKey> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.RecipeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- RecipeArgument(String nodeName)

Methods:
- Recipe parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Recipe> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.RotationArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- RotationArgument(String nodeName)

Methods:
- Rotation parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Rotation> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Type: Abstract Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.SafeOverrideable

Methods:
- Function<TS, String> getMapper()
- **static** Function<TS, String> fromKey(Function<TS, NamespacedKey> mapper)

### Class: dev.jorel.commandapi.arguments.ScoreHolderArgument
Type: Class

No public methods found

### Class: dev.jorel.commandapi.arguments.ScoreHolderArgument$Multiple
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- ScoreHolderArgument$Multiple(String nodeName)

Methods:
- Collection<String> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Collection> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ScoreHolderArgument$Single
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- ScoreHolderArgument$Single(String nodeName)

Methods:
- String parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ScoreboardSlotArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- ScoreboardSlotArgument(String nodeName)

Methods:
- ScoreboardSlot parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<ScoreboardSlot> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.SoundArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- SoundArgument(String nodeName)

Methods:
- Sound parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Sound> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.SoundArgument$NamespacedKey
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- SoundArgument$NamespacedKey(String nodeName)

Methods:
- NamespacedKey parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<NamespacedKey> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.StringArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- StringArgument(String nodeName)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.SuggestionProviders
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FUNCTION
- RECIPES
- SOUNDS
- ADVANCEMENTS
- LOOT_TABLES
- BIOMES
- ENTITIES
- POTION_EFFECTS

Methods:
- **static** SuggestionProviders valueOf(String name)
- **static** SuggestionProviders[] values()

### Class: dev.jorel.commandapi.arguments.SuggestionsBranch
Type: Class

Methods:
- V enforceReplacements(T sender, char arguments) throws CommandSyntaxException
- **static** SuggestionsBranch<TCommandSender> suggest(ArgumentSuggestions<TCommandSender> suggestions)
- SuggestionsBranch<TCommandSender> branch(SuggestionsBranch<TCommandSender> branches)
- ArgumentSuggestions<TCommandSender> getNextSuggestion(T sender, char previousArguments) throws CommandSyntaxException

### Class: dev.jorel.commandapi.arguments.TeamArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- TeamArgument(String nodeName)

Methods:
- Team parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Team> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.TextArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- TextArgument(String nodeName)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.TimeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- TimeArgument(String nodeName)

Methods:
- Integer parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Integer> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.UUIDArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- UUIDArgument(String nodeName)

Methods:
- UUID parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<UUID> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.WorldArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- WorldArgument(String nodeName)

Methods:
- World parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<World> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

## Package: dev.jorel.commandapi.arguments.parser

### Class: dev.jorel.commandapi.arguments.parser.EntitySelectorParser
Type: Class
Extends: java.lang.Record

Constructors:
- EntitySelectorParser(ThrowingSupplyingParser<Player> player, ThrowingSupplyingParser<Entity> entity, ThrowingFunctionParser<Boolean, Collection<Player>> players, ThrowingFunctionParser<Boolean, Collection<Entity>> entities)

Methods:
- ThrowingFunctionParser<Boolean, Collection<Entity>> entities()
- ThrowingFunctionParser<Boolean, Collection<Player>> players()
- int hashCode()
- boolean equals(Object o)
- String toString()
- ThrowingSupplyingParser<Entity> entity()
- ThrowingSupplyingParser<Player> player()

### Class: dev.jorel.commandapi.arguments.parser.RegistryParser
Type: Class
Extends: java.lang.Record

Constructors:
- RegistryParser(ThrowingSupplyingParser<TT> type, ThrowingSupplyingParser<NamespacedKey> key)

Methods:
- int hashCode()
- boolean equals(Object o)
- String toString()
- ThrowingSupplyingParser<TT> type()
- ThrowingSupplyingParser<NamespacedKey> key()

## Package: dev.jorel.commandapi.arguments.parser.function

### Class: dev.jorel.commandapi.arguments.parser.function.ThrowingBiFunction
Type: Interface

Methods:
- TR^TE apply(T, T) throws Exception

### Class: dev.jorel.commandapi.arguments.parser.function.ThrowingFunctionParser
Type: Interface

Methods:
- TR apply(T) throws CommandSyntaxException

### Class: dev.jorel.commandapi.arguments.parser.function.ThrowingSupplier
Type: Interface

Methods:
- TT get() throws Exception

### Class: dev.jorel.commandapi.arguments.parser.function.ThrowingSupplyingParser
Type: Interface

Methods:
- TT get() throws CommandSyntaxException

## Package: dev.jorel.commandapi.commandsenders

### Class: dev.jorel.commandapi.commandsenders.AbstractBlockCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractCommandSender
Type: Interface

Methods:
- TSource getSource()
- boolean hasPermission(String)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.AbstractConsoleCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractEntity
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractFeedbackForwardingCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractNativeProxyCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractProxiedCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractPlayer
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractProxiedCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractRemoteConsoleCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.BukkitCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.BukkitBlockCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractBlockCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitBlockCommandSender(BlockCommandSender commandBlock)

Methods:
- BlockCommandSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitConsoleCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractConsoleCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitConsoleCommandSender(ConsoleCommandSender sender)

Methods:
- ConsoleCommandSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitEntity
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractEntity, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitEntity(Entity entity)

Methods:
- Entity getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitFeedbackForwardingCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractFeedbackForwardingCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitFeedbackForwardingCommandSender(T sender)

Methods:
- TFeedbackForwardingSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitNativeProxyCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractNativeProxyCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitNativeProxyCommandSender(NativeProxyCommandSender proxySender)

Methods:
- NativeProxyCommandSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitPlayer
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractPlayer, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitPlayer(Player player)

Methods:
- Player getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitProxiedCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractProxiedCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitProxiedCommandSender(ProxiedCommandSender proxySender)

Methods:
- ProxiedCommandSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitRemoteConsoleCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractRemoteConsoleCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitRemoteConsoleCommandSender(RemoteConsoleCommandSender remote)

Methods:
- RemoteConsoleCommandSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

## Package: dev.jorel.commandapi.config

### Class: dev.jorel.commandapi.config.ConfigurationAdapter
Type: Interface

Methods:
- Object getValue(String)
- ConfigurationAdapter<TConfiguration> loadFromFile() throws IOException
- boolean contains(String)
- void saveToFile() throws IOException
- void setValue(String, Object)
- void tryCreateSection(String)
- void setComment(String, String[])
- String[] getComment(String)
- Set<String> getKeys()
- ConfigurationAdapter<TConfiguration> complete()
- void saveDefaultConfig(DefaultConfig defaultConfig, File directory, Logger logger)
- TConfiguration config()
- ConfigurationAdapter<TConfiguration> createNew()

### Class: dev.jorel.commandapi.config.BukkitConfigurationAdapter
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.config.ConfigurationAdapter

Constructors:
- BukkitConfigurationAdapter(YamlConfiguration config, File configFile)

Methods:
- ConfigurationAdapter<YamlConfiguration> loadFromFile()
- Set<String> getKeys()
- ConfigurationAdapter<YamlConfiguration> createNew()
- Object getValue(String key)
- boolean contains(String key)
- void saveToFile() throws IOException
- int hashCode()
- File configFile()
- boolean equals(Object o)
- void setValue(String key, Object value)
- void tryCreateSection(String key)
- void setComment(String key, String[] comment)
- String toString()
- String[] getComment(String key)
- **static** BukkitConfigurationAdapter createMinimalInstance(File configFile)
- ConfigurationAdapter<YamlConfiguration> complete()
- YamlConfiguration config()
- Object config()

### Class: dev.jorel.commandapi.config.CommentedConfigOption
Type: Class
Extends: java.lang.Record

Constructors:
- CommentedConfigOption(String comment, T option)

Methods:
- int hashCode()
- boolean equals(Object o)
- String[] comment()
- String toString()
- TT option()

### Class: dev.jorel.commandapi.config.CommentedSection
Type: Class
Extends: java.lang.Record

Constructors:
- CommentedSection(String[] comment)

Methods:
- int hashCode()
- boolean equals(Object o)
- String[] comment()
- String toString()

### Class: dev.jorel.commandapi.config.ConfigGenerator
Type: Class

Methods:
- ConfigurationAdapter<TT> generate(ConfigurationAdapter<TT> existingConfig)
- **static** ConfigGenerator createNew(DefaultConfig defaultConfig)

### Class: dev.jorel.commandapi.config.DefaultBukkitConfig
Type: Class
Extends: dev.jorel.commandapi.config.DefaultConfig

Methods:
- **static** CommentedConfigOption<Boolean> FALLBACK_TO_LATEST_NMS(boolean paper)
- **static** DefaultBukkitConfig createDefaultPaperConfig()
- **static** DefaultBukkitConfig create(Map<String, CommentedConfigOption<*>> options, Map<String, CommentedSection> sections)
- **static** DefaultBukkitConfig createDefaultSpigotConfig()

### Class: dev.jorel.commandapi.config.DefaultConfig
Type: Abstract Class

Methods:
- Map<String, CommentedConfigOption<*>> getAllOptions()
- Map<String, CommentedSection> getAllSections()

## Package: dev.jorel.commandapi.exceptions

### Class: dev.jorel.commandapi.exceptions.BadLiteralException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- BadLiteralException(boolean isNull)

No public methods found

### Class: dev.jorel.commandapi.exceptions.ConflictingPermissionsException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- ConflictingPermissionsException(String command, CommandPermission currentPermission, CommandPermission conflictingPermission)

No public methods found

### Class: dev.jorel.commandapi.exceptions.EmptyExecutorException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: dev.jorel.commandapi.exceptions.GreedyArgumentException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- GreedyArgumentException(AbstractArgument<****> arguments)

No public methods found

### Class: dev.jorel.commandapi.exceptions.InvalidCommandNameException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- InvalidCommandNameException(String commandName)

No public methods found

### Class: dev.jorel.commandapi.exceptions.InvalidNumberException
Type: Class
Extends: java.lang.Exception

Constructors:
- InvalidNumberException(String input, String command, int index)

No public methods found

### Class: dev.jorel.commandapi.exceptions.InvalidRangeException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: dev.jorel.commandapi.exceptions.MissingCommandExecutorException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- MissingCommandExecutorException(String commandName)

No public methods found

### Class: dev.jorel.commandapi.exceptions.NBTAPINotFoundException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- NBTAPINotFoundException(Class<*> c)

No public methods found

### Class: dev.jorel.commandapi.exceptions.OptionalArgumentException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- OptionalArgumentException(String commandName)

No public methods found

### Class: dev.jorel.commandapi.exceptions.PaperAdventureNotFoundException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- PaperAdventureNotFoundException(Class<*> c)

No public methods found

### Class: dev.jorel.commandapi.exceptions.PlatformException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- PlatformException(String message)

No public methods found

### Class: dev.jorel.commandapi.exceptions.ProtocolVersionTooOldException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- int getProtocolVersion()
- **static** ProtocolVersionTooOldException whileSending(Object target, int protocolVersion, String reason)
- String getReason()
- **static** ProtocolVersionTooOldException received(Object sender, int protocolVersion, String reason)

### Class: dev.jorel.commandapi.exceptions.SpigotNotFoundException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- SpigotNotFoundException(Class<*> c)

No public methods found

### Class: dev.jorel.commandapi.exceptions.UnimplementedArgumentException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- UnimplementedArgumentException(String type, String versionSupportedIn)

No public methods found

### Class: dev.jorel.commandapi.exceptions.UnknownArgumentException
Type: Class
Extends: java.lang.Exception

Constructors:
- UnknownArgumentException(String argument)

No public methods found

### Class: dev.jorel.commandapi.exceptions.UnsupportedVersionException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- UnsupportedVersionException(String version)

No public methods found

### Class: dev.jorel.commandapi.exceptions.WrapperCommandSyntaxException
Type: Class
Extends: java.lang.Exception

Constructors:
- WrapperCommandSyntaxException(CommandSyntaxException exception)

Methods:
- int getCursor()
- void setStackTrace(StackTraceElement[] stackTrace)
- void printStackTrace()
- void printStackTrace(PrintStream s)
- void printStackTrace(PrintWriter s)
- StackTraceElement[] getStackTrace()
- CommandSyntaxException getException()
- CommandExceptionType getType()
- String getLocalizedMessage()
- Message getRawMessage()
- Throwable initCause(Throwable cause)
- String getMessage()
- String getInput()
- String getContext()
- Throwable getCause()

## Package: dev.jorel.commandapi.executors

### Class: dev.jorel.commandapi.executors.CommandBlockCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(BlockCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<BlockCommandSender, BukkitBlockCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.CommandBlockExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<BlockCommandSender, BukkitBlockCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.CommandBlockResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(BlockCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<BlockCommandSender, BukkitBlockCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.CommandBlockResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<BlockCommandSender, BukkitBlockCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.CommandExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<CommandSender, BukkitCommandSender<CommandSender>>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.CommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(CommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<CommandSender, BukkitCommandSender<CommandSender>> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(ConsoleCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<ConsoleCommandSender, BukkitConsoleCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<ConsoleCommandSender, BukkitConsoleCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(ConsoleCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<ConsoleCommandSender, BukkitConsoleCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<ConsoleCommandSender, BukkitConsoleCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.EntityCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(Entity, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<Entity, BukkitEntity> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.EntityExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<Entity, BukkitEntity>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.EntityResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(Entity, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<Entity, BukkitEntity> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.EntityResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<Entity, BukkitEntity>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ExecutionInfo
Type: Interface

Methods:
- CommandArguments args()
- TWrapperType senderWrapper()
- TSender sender()

### Class: dev.jorel.commandapi.executors.FeedbackForwardingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(CommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<CommandSender, BukkitFeedbackForwardingCommandSender<CommandSender>> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.FeedbackForwardingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<CommandSender, BukkitFeedbackForwardingCommandSender<CommandSender>>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.FeedbackForwardingResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(CommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<CommandSender, BukkitFeedbackForwardingCommandSender<CommandSender>> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.FeedbackForwardingResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<CommandSender, BukkitFeedbackForwardingCommandSender<CommandSender>>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.NativeCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(NativeProxyCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.NativeExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.NativeResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(NativeProxyCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.NativeResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.NormalExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.TypedExecutor

Methods:
- I executeWith(ExecutionInfo<TCommandSender, TWrapperType> info) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<TCommandSender, TWrapperType>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(Player, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<Player, BukkitPlayer> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<Player, BukkitPlayer>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(Player, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<Player, BukkitPlayer> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<Player, BukkitPlayer>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ProxyCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(NativeProxyCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ProxyExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ProxyResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(NativeProxyCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ProxyResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.RemoteConsoleCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(RemoteConsoleCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<RemoteConsoleCommandSender, BukkitRemoteConsoleCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.RemoteConsoleExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<RemoteConsoleCommandSender, BukkitRemoteConsoleCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.RemoteConsoleResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(RemoteConsoleCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<RemoteConsoleCommandSender, BukkitRemoteConsoleCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.RemoteConsoleResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<RemoteConsoleCommandSender, BukkitRemoteConsoleCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ResultingCommandExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<CommandSender, BukkitCommandSender<CommandSender>>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(CommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<CommandSender, BukkitCommandSender<CommandSender>> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ResultingExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.TypedExecutor

Methods:
- I executeWith(ExecutionInfo<TCommandSender, TWrapperType> info) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<TCommandSender, TWrapperType>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.TypedExecutor
Type: Interface

Methods:
- I executeWith(ExecutionInfo<TCommandSender, TWrapperType>) throws WrapperCommandSyntaxException
- ExecutorType getType()

### Class: dev.jorel.commandapi.executors.BukkitExecutionInfo
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.executors.ExecutionInfo

Constructors:
- BukkitExecutionInfo(T sender, short senderWrapper, e args)

Methods:
- CommandArguments args()
- BukkitCommandSender<+TSender> senderWrapper()
- AbstractCommandSender senderWrapper()
- TSender sender()
- int hashCode()
- boolean equals(Object o)
- String toString()

### Class: dev.jorel.commandapi.executors.CommandArguments
Type: Class
Extends: java.lang.Record

Constructors:
- CommandArguments(Object args, Map<String, Object> argsMap, String rawArgs, Map<String, String> rawArgsMap, String fullInput)

Methods:
- TT getByArgumentOrDefault(AbstractArgument<TT, ***> argumentType, T defaultValue)
- TT getByClassOrDefault(String nodeName, Class<TT> argumentType, T defaultValue)
- TT getByClassOrDefault(int index, Class<TT> argumentType, T defaultValue)
- Optional<TT> getOptionalByArgument(AbstractArgument<TT, ***> argumentType)
- Object getOrDefault(int index, Object defaultValue)
- Object getOrDefault(String nodeName, Object defaultValue)
- Object getOrDefault(int index, Supplier<*> defaultValue)
- Object getOrDefault(String nodeName, Supplier<*> defaultValue)
- TT getOrDefaultUnchecked(int index, T defaultValue)
- TT getOrDefaultUnchecked(String nodeName, T defaultValue)
- TT getOrDefaultUnchecked(int index, Supplier<TT> defaultValue)
- TT getOrDefaultUnchecked(String nodeName, Supplier<TT> defaultValue)
- Optional<String> getRawOptional(int index)
- Optional<String> getRawOptional(String nodeName)
- TT getByClass(String nodeName, Class<TT> argumentType)
- TT getByClass(int index, Class<TT> argumentType)
- int count()
- String fullInput()
- Optional<TT> getOptionalUnchecked(int index)
- Optional<TT> getOptionalUnchecked(String nodeName)
- TT getUnchecked(int index)
- TT getUnchecked(String nodeName)
- Optional<TT> getOptionalByClass(String nodeName, Class<TT> argumentType)
- Optional<TT> getOptionalByClass(int index, Class<TT> argumentType)
- Object[] args()
- Optional<Object> getOptional(int index)
- Optional<Object> getOptional(String nodeName)
- String getOrDefaultRaw(int index, String defaultValue)
- String getOrDefaultRaw(String nodeName, String defaultValue)
- String getOrDefaultRaw(int index, Supplier<String> defaultValue)
- String getOrDefaultRaw(String nodeName, Supplier<String> defaultValue)
- int hashCode()
- boolean equals(Object obj)
- Object get(int index)
- Object get(String nodeName)
- String toString()
- TT getByArgument(AbstractArgument<TT, ***> argumentType)
- String getRaw(int index)
- String getRaw(String nodeName)
- Map<String, Object> argsMap()
- Map<String, String> rawArgsMap()
- String[] rawArgs()

### Class: dev.jorel.commandapi.executors.ExecutorType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PLAYER
- ENTITY
- CONSOLE
- BLOCK
- ALL
- PROXY
- NATIVE
- REMOTE
- FEEDBACK_FORWARDING

Methods:
- **static** ExecutorType valueOf(String name)
- **static** ExecutorType[] values()

## Package: dev.jorel.commandapi.network

### Class: dev.jorel.commandapi.network.CommandAPIPacket
Type: Interface

Methods:
- void write(FriendlyByteBuffer, Object, int) throws ProtocolVersionTooOldException

### Class: dev.jorel.commandapi.network.CommandAPIPacketHandler
Type: Interface

Methods:
- V handlePacket(T, int)

### Class: dev.jorel.commandapi.network.CommandAPIPacketHandlerProvider
Type: Interface

Methods:
- CommandAPIPacketHandler<TInputChannel> getHandlerForProtocol(CommandAPIProtocol protocol)
- HandshakePacketHandler<TInputChannel> getHandshakePacketHandler()
- PlayPacketHandler<TInputChannel> getPlayPacketHandler()

### Class: dev.jorel.commandapi.network.HandshakePacketHandler
Type: Interface
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandler

Methods:
- V handleProtocolVersionTooOldPacket(T sender, int packet)
- V handleSetVersionPacket(T, int)
- V handlePacket(T sender, int packet)

### Class: dev.jorel.commandapi.network.PlayPacketHandler
Type: Interface
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandler

Methods:
- V handleUpdateRequirementsPacket(T, int)
- V handlePacket(T sender, int packet)

### Class: dev.jorel.commandapi.network.BukkitCommandAPIMessenger
Type: Class
Extends: dev.jorel.commandapi.network.CommandAPIMessenger
Implements: org.bukkit.plugin.messaging.PluginMessageListener, org.bukkit.event.Listener

Constructors:
- BukkitCommandAPIMessenger(JavaPlugin plugin)

Methods:
- void sendRawBytes(CommandAPIProtocol protocol, Player target, byte[] bytes)
- void sendRawBytes(CommandAPIProtocol, Object, byte[])
- void onPluginMessageReceived(String channel, Player player, byte[] message)
- void onPlayerRegisterChannel(PlayerRegisterChannelEvent event)
- void onPlayerLeave(PlayerQuitEvent event)
- int getConnectionProtocolVersion(Player target)
- int getConnectionProtocolVersion(Object)
- void setProtocolVersion(Player sender, int protocolVersion)
- void close()

### Class: dev.jorel.commandapi.network.BukkitHandshakePacketHandler
Type: Class
Implements: dev.jorel.commandapi.network.HandshakePacketHandler

Methods:
- void handleSetVersionPacket(Player sender, SetVersionPacket packet)
- void handleSetVersionPacket(Object, SetVersionPacket)

### Class: dev.jorel.commandapi.network.BukkitPacketHandlerProvider
Type: Class
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandlerProvider

Methods:
- BukkitHandshakePacketHandler getHandshakePacketHandler()
- HandshakePacketHandler getHandshakePacketHandler()
- BukkitPlayPacketHandler getPlayPacketHandler()
- PlayPacketHandler getPlayPacketHandler()

### Class: dev.jorel.commandapi.network.BukkitPlayPacketHandler
Type: Class
Implements: dev.jorel.commandapi.network.PlayPacketHandler

Methods:
- void handleUpdateRequirementsPacket(Player sender, UpdateRequirementsPacket packet)
- void handleUpdateRequirementsPacket(Object, UpdateRequirementsPacket)

### Class: dev.jorel.commandapi.network.CommandAPIMessenger
Type: Abstract Class

Methods:
- V sendPacket(T target, O packet)
- I getConnectionProtocolVersion(T)
- void close()

### Class: dev.jorel.commandapi.network.CommandAPIProtocol
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- HANDSHAKE
- PLAY

Methods:
- String getChannelIdentifier()
- **static** CommandAPIProtocol valueOf(String name)
- **static** CommandAPIProtocol[] values()
- I getId(Class<CommandAPIPacket> clazz)
- **static** CommandAPIProtocol getProtocolForChannel(String channelIdentifier)
- Set<Class<CommandAPIPacket>> getAllPacketTypes()
- CommandAPIPacket createPacket(int id, FriendlyByteBuffer buffer)
- **static** CommandAPIProtocol getProtocolForPacket(Class<CommandAPIPacket> clazz)
- **static** Set<String> getAllChannelIdentifiers()

### Class: dev.jorel.commandapi.network.FriendlyByteBuffer
Type: Class

Constructors:
- FriendlyByteBuffer(byte[] bytes)

Methods:
- void writeInt(int i) throws IllegalStateException
- void writeByte(byte b) throws IllegalStateException
- void writeByte(int i) throws IllegalStateException
- void checkWriteIndexIsInBounds() throws IllegalStateException
- void checkWriteIndexIsInBounds(int writeIndex) throws IllegalStateException
- boolean isReadIndexOutOfBounds()
- boolean isReadIndexOutOfBounds(int readIndex)
- String readString(int maxLength) throws IllegalStateException
- byte[] getRemainingBytes() throws IllegalStateException
- void setReadIndex(int index) throws IllegalStateException
- int getReadIndex()
- void resetIndices()
- void writeBytes(byte[] bytes) throws IllegalStateException
- int countReadableBytes()
- void setWriteIndex(int index) throws IllegalStateException
- int getWriteIndex()
- byte[] toByteArray() throws IllegalStateException
- void writeVarInt(int value) throws IllegalStateException
- byte[] readBytes(int n) throws IllegalStateException
- int countTotalBytes()
- void checkReadIndexIsInBounds() throws IllegalStateException
- void checkReadIndexIsInBounds(int readIndex) throws IllegalStateException
- int readInt() throws IllegalStateException
- byte readByte() throws IllegalStateException
- void writeString(String string, int maxLength)
- boolean isWriteIndexOutOfBounds()
- boolean isWriteIndexOutOfBounds(int writeIndex)
- int readVarInt() throws IllegalStateException

## Package: dev.jorel.commandapi.network.packets

### Class: dev.jorel.commandapi.network.packets.ProtocolVersionTooOldPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Constructors:
- ProtocolVersionTooOldPacket(int protocolVersion, String reason)

Methods:
- String reason()
- int hashCode()
- boolean equals(Object o)
- int protocolVersion()
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion)
- **static** ProtocolVersionTooOldPacket deserialize(FriendlyByteBuffer buffer)

### Class: dev.jorel.commandapi.network.packets.SetVersionPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Constructors:
- SetVersionPacket(int protocolVersion)

Methods:
- int hashCode()
- boolean equals(Object o)
- int protocolVersion()
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion)
- **static** SetVersionPacket deserialize(FriendlyByteBuffer buffer)

### Class: dev.jorel.commandapi.network.packets.UpdateRequirementsPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Methods:
- int hashCode()
- boolean equals(Object o)
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion) throws ProtocolVersionTooOldException
- **static** UpdateRequirementsPacket deserialize(FriendlyByteBuffer ignored)

## Package: dev.jorel.commandapi.nms

### Class: dev.jorel.commandapi.nms.BundledNMS
Type: Interface
Implements: dev.jorel.commandapi.nms.NMS, dev.jorel.commandapi.nms.PaperNMS

Methods:
- SignedMessage getChat(CommandContext<TSource>, String) throws CommandSyntaxException
- NamedTextColor getChatColor(CommandContext<TSource>, String)
- List<PlayerProfile> getProfile(CommandContext<TSource>, String) throws CommandSyntaxException
- Component getChatComponent(CommandContext<TSource>, String) throws CommandSyntaxException

### Class: dev.jorel.commandapi.nms.NMS
Type: Interface

Methods:
- Advancement getAdvancement(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- Set<NamespacedKey> getTags()
- String convert(ItemStack)
- String convert(ParticleData<*>)
- String convert(PotionEffectType)
- String convert(Sound)
- NamespacedKey getMinecraftKey(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentPosition2D()
- Predicate<ItemStack> getItemStackPredicate(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- String[] compatibleVersions()
- Location getLocationBlock(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- String getObjectiveCriteria(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentRotation()
- UUID getUUID(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentAngle()
- Enchantment getEnchantment(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- World getDimension(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentNBTCompound()
- V createDispatcherFile(File, CommandDispatcher<TCommandListenerWrapper>) throws IOException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentVec3(boolean)
- ArgumentType<*> _ArgumentVec2(boolean)
- ArgumentType<*> _ArgumentScoreboardObjective()
- Objective getObjective(CommandContext<TCommandListenerWrapper>, String) throws IllegalArgumentException, CommandSyntaxException
- Predicate<Block> getBlockPredicate(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentItemStack()
- ArgumentType<*> _ArgumentChatFormat()
- ArgumentType<*> _ArgumentAxis()
- ArgumentType<*> _ArgumentUUID()
- ArgumentType<*> _ArgumentBlockState()
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentScoreboardTeam()
- TT getMinecraftServer()
- F getAngle(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender, CommandSender, Location, World)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<TCommandListenerWrapper>, String)
- IntegerRange getIntRange(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentPosition()
- ArgumentType<*> _ArgumentAdvancement()
- I getTime(CommandContext<TCommandListenerWrapper>, String)
- String getScoreHolderSingle(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentMathOperation()
- ParticleData<*> getParticle(CommandContext<TCommandListenerWrapper>, String)
- Object getNBTCompound(CommandContext<TCommandListenerWrapper>, String, Function<Object, TNBTContainer>)
- Location2D getLocation2DBlock(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- TCommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender>)
- Location getLocationPrecise(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntity(ArgumentSubType)
- LootTable getLootTable(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentScoreboardSlot()
- ArgumentType<*> _ArgumentItemPredicate()
- Team getTeam(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<TCommandListenerWrapper>, String)
- TT getRecipe(CommandContext<TCommandListenerWrapper>, String, BiFunction<NamespacedKey, Recipe, TT>) throws CommandSyntaxException
- ArgumentType<*> _ArgumentProfile()
- ItemStack getItemStack(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- Message generateMessageFromJson(String)
- RegistryParser<Biome> getBiome(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- World getWorldForCSS(T)
- HelpTopic generateHelpTopic(String, String, String, String)
- ArgumentType<*> _ArgumentMobEffect()
- ArgumentType<*> _ArgumentChat()
- FunctionWrapper getFunction(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- BukkitCommandSender<CommandSender> getCommandSenderFromCommandSource(T)
- EntityType getEntityType(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentScoreboardCriteria()
- ArgumentType<*> _ArgumentParticle()
- EnumSet<Axis> getAxis(CommandContext<TCommandListenerWrapper>, String)
- SimpleFunctionWrapper[] getTag(NamespacedKey)
- SuggestionProvider<TCommandListenerWrapper> getSuggestionProvider(SuggestionProviders)
- ArgumentType<*> _ArgumentBlockPredicate()
- ArgumentType<*> _ArgumentFloatRange()
- Map<String, HelpTopic> getHelpMap()
- ArgumentType<*> _ArgumentIntRange()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<TCommandListenerWrapper>, boolean)
- ArgumentType<*> _ArgumentTime()
- ArgumentType<*> _ArgumentRecipe()
- MathOperation getMathOperation(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEnchantment()
- ArgumentType<*> _ArgumentTag()
- ArgumentType<*> _ArgumentScoreholder(ArgumentSubType)
- ArgumentType<*> _ArgumentDimension()
- RegistryParser<Sound> getSound(CommandContext<TCommandListenerWrapper>, String)

### Class: dev.jorel.commandapi.nms.PaperNMS
Type: Interface

Methods:
- CommandRegistrationStrategy<TCommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<TCommandListenerWrapper> bukkitNMS()

### Class: dev.jorel.commandapi.nms.APITypeProvider
Type: Class
Implements: dev.jorel.commandapi.nms.BundledNMS

Constructors:
- APITypeProvider(PaperNMS<*> paperNMS)

Methods:
- Advancement getAdvancement(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- ArgumentType<*> _ArgumentEntitySummon()
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- String convert(PotionEffectType potion)
- String convert(Sound sound)
- NamespacedKey getMinecraftKey(CommandContext<CommandSourceStack> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- String getObjectiveCriteria(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentRotation()
- ArgumentType<*> _ArgumentAngle()
- Enchantment getEnchantment(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentNBTCompound()
- V createDispatcherFile(File file, CommandDispatcher<CommandSourceStack> brigadierDispatcher) throws IOException
- DoubleRange getDoubleRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentVec3(boolean centerPosition)
- ArgumentType<*> _ArgumentVec2(boolean centerPosition)
- ArgumentType<*> _ArgumentScoreboardObjective()
- Objective getObjective(CommandContext<CommandSourceStack> cmdCtx, String key) throws IllegalArgumentException, CommandSyntaxException
- List<PlayerProfile> getProfile(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentItemStack()
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentScoreboardTeam()
- F getAngle(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentSyntheticBiome()
- NamedTextColor getChatColor(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentPosition()
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentMathOperation()
- ParticleData<*> getParticle(CommandContext<CommandSourceStack> cmdCtx, String key)
- Object getNBTCompound(CommandContext<CommandSourceStack> cmdCtx, String key, Function<Object, TNBTContainer> nbtContainerConstructor)
- CommandSourceStack getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- ArgumentType<*> _ArgumentEntity(ArgumentSubType subType)
- ArgumentType<*> _ArgumentScoreboardSlot()
- Team getTeam(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandSourceStack> cmdCtx, String key)
- ItemStack getItemStack(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- World getWorldForCSS(CommandSourceStack clw)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- FunctionWrapper getFunction(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- EntityType getEntityType(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentScoreboardCriteria()
- EnumSet<Axis> getAxis(CommandContext<CommandSourceStack> cmdCtx, String key)
- SuggestionProvider<CommandSourceStack> getSuggestionProvider(SuggestionProviders provider)
- ArgumentType<*> _ArgumentBlockPredicate()
- ArgumentType<*> _ArgumentTime()
- ArgumentType<*> _ArgumentTag()
- RegistryParser<Sound> getSound(CommandContext<CommandSourceStack> cmdCtx, String key)
- Location2D getLocation2DPrecise(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Rotation getRotation(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentPosition2D()
- Location getLocationBlock(CommandContext<CommandSourceStack> cmdCtx, String str) throws CommandSyntaxException
- UUID getUUID(CommandContext<CommandSourceStack> cmdCtx, String key)
- World getDimension(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- Predicate<Block> getBlockPredicate(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentChatFormat()
- ArgumentType<*> _ArgumentAxis()
- ArgumentType<*> _ArgumentUUID()
- ArgumentType<*> _ArgumentBlockState()
- SignedMessage getChat(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- NMS<CommandSourceStack> bukkitNMS()
- BlockState getBlockState(CommandContext<CommandSourceStack> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- I getTime(CommandContext<CommandSourceStack> cmdCtx, String key)
- Location2D getLocation2DBlock(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Location getLocationPrecise(CommandContext<CommandSourceStack> cmdCtx, String str) throws CommandSyntaxException
- LootTable getLootTable(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentItemPredicate()
- Collection<String> getScoreHolderMultiple(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- TT getRecipe(CommandContext<CommandSourceStack> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ArgumentType<*> _ArgumentProfile()
- CommandRegistrationStrategy<CommandSourceStack> createCommandRegistrationStrategy()
- RegistryParser<Biome> getBiome(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentMobEffect()
- ArgumentType<*> _ArgumentChat()
- BukkitCommandSender<CommandSender> getCommandSenderFromCommandSource(CommandSourceStack css)
- BukkitCommandSender getCommandSenderFromCommandSource(Object)
- Component getChatComponent(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentParticle()
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- ArgumentType<*> _ArgumentFloatRange()
- Map<String, HelpTopic> getHelpMap()
- ArgumentType<*> _ArgumentIntRange()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandSourceStack> cmdCtx, boolean forceNative)
- ArgumentType<*> _ArgumentRecipe()
- MathOperation getMathOperation(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEnchantment()
- ArgumentType<*> _ArgumentScoreholder(ArgumentSubType subType)
- ArgumentType<*> _ArgumentDimension()

### Class: dev.jorel.commandapi.nms.NMS_1_20_R4
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_20_R4(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandSourceStack> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandSourceStack> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandSourceStack> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandSourceStack> cmdCtx, String key)
- CommandSourceStack getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandSourceStack> cmdCtx, String key)
- Team getTeam(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandSourceStack> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandSourceStack css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandSourceStack> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandSourceStack> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(ResourceLocation key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandSourceStack> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandSourceStack> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R1
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R1(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandSourceStack> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandSourceStack> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandSourceStack> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandSourceStack> cmdCtx, String key)
- CommandSourceStack getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandSourceStack> cmdCtx, String key)
- Team getTeam(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandSourceStack> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandSourceStack css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandSourceStack> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandSourceStack> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(ResourceLocation key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandSourceStack> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandSourceStack> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R2
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R2(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandSourceStack> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandSourceStack> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandSourceStack> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandSourceStack> cmdCtx, String key)
- CommandSourceStack getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandSourceStack> cmdCtx, String key)
- Team getTeam(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandSourceStack> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandSourceStack css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandSourceStack> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandSourceStack> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(ResourceLocation key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandSourceStack> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandSourceStack> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R3
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R3(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandSourceStack> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandSourceStack> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandSourceStack> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandSourceStack> cmdCtx, String key)
- CommandSourceStack getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandSourceStack> cmdCtx, String key)
- Team getTeam(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandSourceStack> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandSourceStack css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandSourceStack> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandSourceStack> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(ResourceLocation key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandSourceStack> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandSourceStack> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R4
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R4(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandSourceStack> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandSourceStack> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandSourceStack> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandSourceStack> cmdCtx, String key)
- CommandSourceStack getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandSourceStack> cmdCtx, String key)
- Team getTeam(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandSourceStack> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandSourceStack css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandSourceStack> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandSourceStack> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(ResourceLocation key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandSourceStack> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandSourceStack> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R5
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R5(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandSourceStack> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandSourceStack> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandSourceStack> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandSourceStack> cmdCtx, String key)
- CommandSourceStack getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandSourceStack> cmdCtx, String key)
- Team getTeam(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandSourceStack> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandSourceStack css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandSourceStack> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandSourceStack> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(ResourceLocation key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandSourceStack> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandSourceStack> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R6
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R6(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandSourceStack> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandSourceStack> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandSourceStack> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandSourceStack> cmdCtx, String key)
- CommandSourceStack getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandSourceStack> cmdCtx, String key)
- Team getTeam(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandSourceStack> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandSourceStack css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandSourceStack> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandSourceStack> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(ResourceLocation key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandSourceStack> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandSourceStack> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R7
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R7(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandSourceStack> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandSourceStack> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandSourceStack> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandSourceStack> cmdCtx, String key)
- CommandSourceStack getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandSourceStack> cmdCtx, String key)
- Team getTeam(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandSourceStack> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandSourceStack> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandSourceStack css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandSourceStack> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandSourceStack> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(Identifier key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandSourceStack> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandSourceStack> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_Common
Type: Abstract Class
Implements: dev.jorel.commandapi.nms.NMS

Methods:
- ArgumentType<*> _ArgumentPosition()
- I getTime(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentMathOperation()
- Object getNBTCompound(CommandContext<CommandSourceStack> cmdCtx, String key, Function<Object, TNBTContainer> nbtContainerConstructor)
- Location2D getLocation2DBlock(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- String convert(PotionEffectType potion)
- String convert(Sound sound)
- ArgumentType<*> _ArgumentPosition2D()
- Location getLocationPrecise(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- Location getLocationBlock(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntity(ArgumentSubType subType)
- String getObjectiveCriteria(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentScoreboardSlot()
- ArgumentType<*> _ArgumentRotation()
- UUID getUUID(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentAngle()
- ArgumentType<*> _ArgumentItemPredicate()
- ArgumentType<*> _ArgumentProfile()
- ArgumentType<*> _ArgumentNBTCompound()
- V createDispatcherFile(File file, CommandDispatcher<CommandSourceStack> dispatcher) throws IOException
- ArgumentType<*> _ArgumentVec3(boolean centerPosition)
- ArgumentType<*> _ArgumentVec2(boolean centerPosition)
- ArgumentType<*> _ArgumentScoreboardObjective()
- ArgumentType<*> _ArgumentChat()
- EntityType getEntityType(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- BukkitCommandSender<CommandSender> getCommandSenderFromCommandSource(CommandSourceStack css)
- BukkitCommandSender getCommandSenderFromCommandSource(Object)
- Predicate<Block> getBlockPredicate(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentScoreboardCriteria()
- ArgumentType<*> _ArgumentParticle()
- EnumSet<Axis> getAxis(CommandContext<CommandSourceStack> cmdCtx, String key)
- ArgumentType<*> _ArgumentItemStack()
- ArgumentType<*> _ArgumentChatFormat()
- ArgumentType<*> _ArgumentAxis()
- ArgumentType<*> _ArgumentUUID()
- ArgumentType<*> _ArgumentBlockPredicate()
- ArgumentType<*> _ArgumentBlockState()
- ArgumentType<*> _ArgumentFloatRange()
- ArgumentType<*> _ArgumentIntRange()
- ArgumentType<*> _ArgumentScoreboardTeam()
- ArgumentType<*> _ArgumentTime()
- MathOperation getMathOperation(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- F getAngle(CommandContext<CommandSourceStack> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentTag()
- ArgumentType<*> _ArgumentScoreholder(ArgumentSubType subType)
- ArgumentType<*> _ArgumentDimension()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_20_R4
Type: Class
Extends: org.bukkit.craftbukkit.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_20_R4(CommandSourceStack world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R1
Type: Class
Extends: org.bukkit.craftbukkit.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R1(CommandSourceStack world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R2
Type: Class
Extends: org.bukkit.craftbukkit.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R2(CommandSourceStack world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R3
Type: Class
Extends: org.bukkit.craftbukkit.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R3(CommandSourceStack world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R4
Type: Class
Extends: org.bukkit.craftbukkit.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R4(CommandSourceStack world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R5
Type: Class
Extends: org.bukkit.craftbukkit.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R5(CommandSourceStack world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R6
Type: Class
Extends: org.bukkit.craftbukkit.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R6(CommandSourceStack world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R7
Type: Class
Extends: org.bukkit.craftbukkit.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R7(CommandSourceStack world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.PaperNMS_1_20_R4
Type: Class
Implements: dev.jorel.commandapi.nms.PaperNMS

Methods:
- CommandRegistrationStrategy<CommandSourceStack> createCommandRegistrationStrategy()
- NMS<CommandSourceStack> bukkitNMS()

### Class: dev.jorel.commandapi.nms.PaperNMS_1_21_R1
Type: Class
Implements: dev.jorel.commandapi.nms.PaperNMS

Methods:
- CommandRegistrationStrategy<CommandSourceStack> createCommandRegistrationStrategy()
- NMS<CommandSourceStack> bukkitNMS()

### Class: dev.jorel.commandapi.nms.PaperNMS_1_21_R2
Type: Class
Implements: dev.jorel.commandapi.nms.PaperNMS

Methods:
- CommandRegistrationStrategy<CommandSourceStack> createCommandRegistrationStrategy()
- NMS<CommandSourceStack> bukkitNMS()

### Class: dev.jorel.commandapi.nms.PaperNMS_1_21_R3
Type: Class
Implements: dev.jorel.commandapi.nms.PaperNMS

Methods:
- CommandRegistrationStrategy<CommandSourceStack> createCommandRegistrationStrategy()
- NMS<CommandSourceStack> bukkitNMS()

### Class: dev.jorel.commandapi.nms.PaperNMS_1_21_R4
Type: Class
Implements: dev.jorel.commandapi.nms.PaperNMS

Methods:
- CommandRegistrationStrategy<CommandSourceStack> createCommandRegistrationStrategy()
- NMS<CommandSourceStack> bukkitNMS()

### Class: dev.jorel.commandapi.nms.PaperNMS_1_21_R5
Type: Class
Implements: dev.jorel.commandapi.nms.PaperNMS

Methods:
- CommandRegistrationStrategy<CommandSourceStack> createCommandRegistrationStrategy()
- NMS<CommandSourceStack> bukkitNMS()

### Class: dev.jorel.commandapi.nms.PaperNMS_1_21_R6
Type: Class
Implements: dev.jorel.commandapi.nms.PaperNMS

Methods:
- CommandRegistrationStrategy<CommandSourceStack> createCommandRegistrationStrategy()
- NMS<CommandSourceStack> bukkitNMS()

### Class: dev.jorel.commandapi.nms.PaperNMS_1_21_R7
Type: Class
Implements: dev.jorel.commandapi.nms.PaperNMS

Methods:
- CommandRegistrationStrategy<CommandSourceStack> createCommandRegistrationStrategy()
- NMS<CommandSourceStack> bukkitNMS()

## Package: dev.jorel.commandapi.wrappers

### Class: dev.jorel.commandapi.wrappers.NativeProxyCommandSender
Type: Interface
Implements: org.bukkit.command.ProxiedCommandSender

Methods:
- World getWorld()
- Location getLocation()
- **static** NativeProxyCommandSender from(CommandSender caller, CommandSender callee, Location location, World world)

### Class: dev.jorel.commandapi.wrappers.CommandResult
Type: Class
Extends: java.lang.Record

Constructors:
- CommandResult(Command command, String[] args)

Methods:
- String[] args()
- int hashCode()
- boolean equals(Object o)
- String toString()
- boolean execute(CommandSender sender)
- Command command()

### Class: dev.jorel.commandapi.wrappers.ComplexRecipeImpl
Type: Class
Extends: java.lang.Record
Implements: org.bukkit.inventory.ComplexRecipe

Constructors:
- ComplexRecipeImpl(NamespacedKey key, Recipe recipe)

Methods:
- NamespacedKey getKey()
- int hashCode()
- boolean equals(Object o)
- ItemStack getResult()
- Recipe recipe()
- String toString()
- NamespacedKey key()
- Key key()

### Class: dev.jorel.commandapi.wrappers.DoubleRange
Type: Class

Constructors:
- DoubleRange(double low, double high)

Methods:
- **static** DoubleRange doubleRangeGreaterThanOrEq(double min)
- int hashCode()
- boolean equals(Object obj)
- **static** DoubleRange doubleRangeLessThanOrEq(double max)
- String toString()
- boolean isInRange(double f)
- double getUpperBound()
- double getLowerBound()

### Class: dev.jorel.commandapi.wrappers.FunctionWrapper
Type: Class
Extends: dev.jorel.commandapi.wrappers.SimpleFunctionWrapper

Constructors:
- FunctionWrapper(NamespacedKey minecraftKey, ToIntFunction invoker, Object commandListenerWrapper, Function<Entity, Object> mapper, String internalCommands)

Methods:
- int runAs(Entity e)
- **static** FunctionWrapper fromSimpleFunctionWrapper(SimpleFunctionWrapper wrapper, Object commandListenerWrapper, Function<Entity, Object> mapper)
- int run()

### Class: dev.jorel.commandapi.wrappers.IntegerRange
Type: Class

Constructors:
- IntegerRange(int low, int high)

Methods:
- **static** IntegerRange integerRangeGreaterThanOrEq(int min)
- **static** IntegerRange integerRangeLessThanOrEq(int max)
- int hashCode()
- boolean equals(Object obj)
- String toString()
- boolean isInRange(int i)
- int getUpperBound()
- int getLowerBound()

### Class: dev.jorel.commandapi.wrappers.Location2D
Type: Class
Extends: org.bukkit.Location

Constructors:
- Location2D(World world, double x, double y, double z, float yaw, float pitch)
- Location2D(World world, double x, double y, double z)
- Location2D(World world, double x, double z)

Methods:
- void setY(double y)
- double getY()
- int getBlockY()

### Class: dev.jorel.commandapi.wrappers.MathOperation
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ADD
- ASSIGN
- DIVIDE
- MAX
- MIN
- MOD
- MULTIPLY
- SUBTRACT
- SWAP

Methods:
- int apply(int val1, int val2)
- float apply(float val1, float val2)
- **static** MathOperation valueOf(String name)
- **static** MathOperation[] values()
- String toString()
- **static** MathOperation fromString(String input)

### Class: dev.jorel.commandapi.wrappers.ParticleData
Type: Class
Extends: java.lang.Record

Constructors:
- ParticleData(Particle particle, T data)

Methods:
- TT data()
- int hashCode()
- boolean equals(Object o)
- Particle particle()
- String toString()

### Class: dev.jorel.commandapi.wrappers.Rotation
Type: Class

Constructors:
- Rotation(float yaw, float pitch)

Methods:
- float getYaw()
- float getPitch()
- float getNormalizedPitch()
- int hashCode()
- boolean equals(Object obj)
- String toString()
- float getNormalizedYaw()

### Class: dev.jorel.commandapi.wrappers.ScoreboardSlot
Type: Enum
Extends: java.lang.Enum
Implements: org.bukkit.Keyed

Enum Constants:
- PLAYER_LIST
- SIDEBAR
- LEGACY_BELOW_NAME
- BELOW_NAME
- SIDEBAR_TEAM_BLACK
- SIDEBAR_TEAM_DARK_BLUE
- SIDEBAR_TEAM_DARK_GREEN
- SIDEBAR_TEAM_DARK_AQUA
- SIDEBAR_TEAM_DARK_RED
- SIDEBAR_TEAM_DARK_PURPLE
- SIDEBAR_TEAM_GOLD
- SIDEBAR_TEAM_GRAY
- SIDEBAR_TEAM_DARK_GRAY
- SIDEBAR_TEAM_BLUE
- SIDEBAR_TEAM_GREEN
- SIDEBAR_TEAM_AQUA
- SIDEBAR_TEAM_RED
- SIDEBAR_TEAM_LIGHT_PURPLE
- SIDEBAR_TEAM_YELLOW
- SIDEBAR_TEAM_WHITE

Methods:
- boolean hasTeamColor()
- NamespacedKey getKey()
- **static** ScoreboardSlot valueOf(String name)
- ChatColor getTeamColor()
- **static** ScoreboardSlot ofTeamColor(ChatColor color)
- **static** ScoreboardSlot of(DisplaySlot slot)
- **static** ScoreboardSlot[] values()
- String toString()
- **static** ScoreboardSlot ofMinecraft(int i)
- DisplaySlot getDisplaySlot()

### Class: dev.jorel.commandapi.wrappers.SimpleFunctionWrapper
Type: Class
Implements: org.bukkit.Keyed

Constructors:
- SimpleFunctionWrapper(NamespacedKey minecraftKey, ToIntFunction functionExecutor, String[] internalCommands)

Methods:
- NamespacedKey getKey()
- **static** SimpleFunctionWrapper getFunction(NamespacedKey key)
- **static** Set<NamespacedKey> getFunctions()
- int run(CommandSender sender)
- **static** Set<NamespacedKey> getTags()
- **static** SimpleFunctionWrapper[] getTag(NamespacedKey key)
- String[] getCommands()

### Class: dev.jorel.commandapi.wrappers.Time
Type: Class

Methods:
- **static** Time seconds(int seconds)
- **static** Time ticks(int ticks)
- int hashCode()
- boolean equals(Object obj)
- **static** Time days(int days)
- String toString()

# CommandAPI-11.1.0-Spigot API Reference

## Package: dev.jorel.commandapi

### Class: dev.jorel.commandapi.BukkitExecutable
Type: Interface
Implements: dev.jorel.commandapi.PlatformExecutable

Methods:
- TImpl executesCommandBlock(CommandBlockCommandExecutor executor)
- TImpl executesCommandBlock(CommandBlockExecutionInfo info)
- TImpl executesCommandBlock(CommandBlockResultingCommandExecutor executor)
- TImpl executesCommandBlock(CommandBlockResultingExecutionInfo info)
- TImpl executesPlayer(PlayerCommandExecutor executor)
- TImpl executesPlayer(PlayerExecutionInfo info)
- TImpl executesPlayer(PlayerResultingCommandExecutor executor)
- TImpl executesPlayer(PlayerResultingExecutionInfo info)
- TImpl executesNative(NativeCommandExecutor executor)
- TImpl executesNative(NativeExecutionInfo info)
- TImpl executesNative(NativeResultingCommandExecutor executor)
- TImpl executesNative(NativeResultingExecutionInfo info)
- TImpl executesConsole(ConsoleCommandExecutor executor)
- TImpl executesConsole(ConsoleExecutionInfo info)
- TImpl executesConsole(ConsoleResultingCommandExecutor executor)
- TImpl executesConsole(ConsoleResultingExecutionInfo info)
- TImpl executesProxy(ProxyCommandExecutor executor)
- TImpl executesProxy(ProxyExecutionInfo info)
- TImpl executesProxy(ProxyResultingCommandExecutor executor)
- TImpl executesProxy(ProxyResultingExecutionInfo info)
- TImpl executesFeedbackForwarding(FeedbackForwardingCommandExecutor executor)
- TImpl executesFeedbackForwarding(FeedbackForwardingExecutionInfo info)
- TImpl executesFeedbackForwarding(FeedbackForwardingResultingCommandExecutor executor)
- TImpl executesFeedbackForwarding(FeedbackForwardingResultingExecutionInfo info)
- TImpl executesRemoteConsole(RemoteConsoleCommandExecutor executor)
- TImpl executesRemoteConsole(RemoteConsoleExecutionInfo info)
- TImpl executesRemoteConsole(RemoteConsoleResultingCommandExecutor executor)
- TImpl executesRemoteConsole(RemoteConsoleResultingExecutionInfo info)
- TImpl executes(CommandExecutor executor, ExecutorType types)
- TImpl executes(CommandExecutionInfo executor, ExecutorType types)
- TImpl executes(ResultingCommandExecutor executor, ExecutorType types)
- TImpl executes(ResultingCommandExecutionInfo executor, ExecutorType types)
- TImpl executesEntity(EntityCommandExecutor executor)
- TImpl executesEntity(EntityExecutionInfo info)
- TImpl executesEntity(EntityResultingCommandExecutor executor)
- TImpl executesEntity(EntityResultingExecutionInfo info)

### Class: dev.jorel.commandapi.BukkitPlatform
Type: Interface
Implements: dev.jorel.commandapi.CommandAPIPlatform

Methods:
- BukkitCommandSender<CommandSender> wrapCommandSender(CommandSender)
- AbstractCommandSender wrapCommandSender(Object)
- BukkitCommandAPIMessenger getMessenger()
- void onLoad()
- CommandMap getCommandMap()
- Platform activePlatform()
- CommandRegistrationStrategy<TSource> createCommandRegistrationStrategy()

### Class: dev.jorel.commandapi.ChainableBuilder
Type: Interface

Methods:
- TImpl instance()

### Class: dev.jorel.commandapi.CommandAPILogger
Type: Interface

Methods:
- **static** CommandAPILogger silent()
- **static** CommandAPILogger fromApacheLog4jLogger(Logger logger)
- **static** CommandAPILogger bindToMethods(Consumer<String> info, Consumer<String> warning, Consumer<String> severe, BiConsumer<String, Throwable> severeException)
- **static** CommandAPILogger fromJavaLogger(Logger logger)
- void severe(String)
- void severe(String, Throwable)
- void warning(String)
- **static** CommandAPILogger fromSlf4jLogger(Logger logger)
- void info(String)

### Class: dev.jorel.commandapi.CommandAPIPlatform
Type: Interface

Methods:
- void registerPermission(String)
- CommandAPIMessenger<**> setupMessenger()
- AbstractCommandSender<+TCommandSender> wrapCommandSender(T)
- void unregister(String, boolean)
- AbstractCommandSender<+TCommandSender> getCommandSenderFromCommandSource(T)
- CommandAPILogger getLogger()
- V postCommandRegistration(RegisteredCommand, LiteralCommandNode<TSource>, List<LiteralCommandNode<TSource>>)
- void onEnable()
- void preCommandRegistration(String)
- SuggestionProvider<TSource> getSuggestionProvider(SuggestionProviders)
- TSource getBrigadierSourceFromCommandSender(AbstractCommandSender<+TCommandSender>)
- void onDisable()
- CommandDispatcher<TSource> getBrigadierDispatcher()
- LiteralCommandNode<TSource> registerCommandNode(LiteralArgumentBuilder<TSource>, String)
- TArgument newConcreteLiteralArgument(String, String)
- V updateRequirements(AbstractPlayer<*>)
- AbstractCommandSender<+TCommandSender> getSenderForCommand(CommandContext<TSource>, boolean)
- AbstractCommandAPICommand<*TArgument, TCommandSender> newConcreteCommandAPICommand(CommandMetaData<TCommandSender>)
- TArgument newConcreteMultiLiteralArgument(String, String)
- void onLoad()
- void reloadDataPacks()
- V createDispatcherFile(File, CommandDispatcher<TSource>) throws IOException

### Class: dev.jorel.commandapi.IStringTooltip
Type: Interface

Methods:
- Message getTooltip()
- String getSuggestion()

### Class: dev.jorel.commandapi.MojangMappedVersionHandler
Type: Interface

Methods:
- **static** boolean isMojangMapped()

### Class: dev.jorel.commandapi.PlatformExecutable
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- CommandAPIExecutor<TCommandSender, AbstractCommandSender<+TCommandSender>> getExecutor()

### Class: dev.jorel.commandapi.AbstractArgumentTree
Type: Abstract Class
Extends: dev.jorel.commandapi.Executable

Methods:
- TImpl thenNested(List<AbstractArgumentTree<*TArgument, TCommandSender>> trees)
- TImpl thenNested(AbstractArgumentTree<*TArgument, TCommandSender> trees)
- CommandAPIExecutor getExecutor()
- Executable clearExecutors()
- TImpl then(AbstractArgumentTree<*TArgument, TCommandSender> tree)
- void setExecutor(CommandAPIExecutor)

### Class: dev.jorel.commandapi.AbstractCommandAPICommand
Type: Abstract Class
Extends: dev.jorel.commandapi.ExecutableCommand

Methods:
- V setSubcommands(List<TImpl> subcommands)
- List<TImpl> getSubcommands()
- V setArguments(List<TArgument> args)
- List<TArgument> getArguments()
- TImpl withOptionalArguments(List<TArgument> args)
- TImpl withOptionalArguments([T args)
- TImpl withArguments(List<TArgument> args)
- TImpl withArguments([T args)
- TImpl copy()
- boolean isConverted()
- TImpl withSubcommand(T subcommand)
- TImpl withSubcommands([T subcommands)
- void register(String namespace)

### Class: dev.jorel.commandapi.AbstractCommandTree
Type: Abstract Class
Extends: dev.jorel.commandapi.ExecutableCommand

Methods:
- TImpl thenNested(List<AbstractArgumentTree<*TArgument, TCommandSender>> trees)
- TImpl thenNested(AbstractArgumentTree<*TArgument, TCommandSender> trees)
- TImpl then(AbstractArgumentTree<*TArgument, TCommandSender> tree)
- void register(String namespace)

### Class: dev.jorel.commandapi.Brigadier
Type: Class

Methods:
- **static** SuggestionProvider toSuggestions(T argument, A args)
- **static** LiteralArgumentBuilder fromLiteralArgument(Literal<TArgument> literalArgument)
- **static** RequiredArgumentBuilder fromArgument(List<TArgument> args, T argument)
- **static** RequiredArgumentBuilder fromArgument(T argument)
- **static** TCommandSender getCommandSenderFromContext(CommandContext cmdCtx)
- **static** CommandDispatcher getCommandDispatcher()
- **static** RedirectModifier fromPredicate(BiPredicate<TCommandSender, Object> predicate, List<TArgument> args)
- **static** Object getBrigadierSourceFromCommandSender(T sender)
- **static** Object parseArguments(CommandContext cmdCtx, List<TArgument> args) throws CommandSyntaxException
- **static** Command fromCommand(AbstractCommandAPICommand<*TArgument, TCommandSender> command)
- **static** RootCommandNode getRootNode()

### Class: dev.jorel.commandapi.BukkitStringTooltip
Type: Class
Extends: dev.jorel.commandapi.StringTooltip

Methods:
- **static** Collection<StringTooltip> generateAdventureComponents(Function<String, ComponentLike> tooltipGenerator, String suggestions)
- **static** Collection<StringTooltip> generateAdventureComponents(Function<String, ComponentLike> tooltipGenerator, Collection<String> suggestions)
- **static** StringTooltip ofBaseComponents(String suggestion, BaseComponent[] tooltip)
- **static** Collection<StringTooltip> generateBaseComponents(Function<String, BaseComponent> tooltipGenerator, String suggestions)
- **static** Collection<StringTooltip> generateBaseComponents(Function<String, BaseComponent> tooltipGenerator, Collection<String> suggestions)
- **static** StringTooltip ofAdventureComponent(String suggestion, ComponentLike tooltip)

### Class: dev.jorel.commandapi.BukkitTooltip
Type: Class
Extends: dev.jorel.commandapi.Tooltip

Methods:
- **static** Message messageFromBaseComponents(BaseComponent[] components)
- **static** Message messageFromAdventureComponent(ComponentLike component)
- **static** Tooltip<TS> ofBaseComponents(T object, short tooltip)
- **static** Collection<Tooltip<TS>> generateAdventureComponents(Function<TS, ComponentLike> tooltipGenerator, [T suggestions)
- **static** Collection<Tooltip<TS>> generateAdventureComponents(Function<TS, ComponentLike> tooltipGenerator, Collection<TS> suggestions)
- **static** Collection<Tooltip<TS>> generateBaseComponents(Function<TS, BaseComponent> tooltipGenerator, [T suggestions)
- **static** Collection<Tooltip<TS>> generateBaseComponents(Function<TS, BaseComponent> tooltipGenerator, Collection<TS> suggestions)
- **static** Tooltip<TS> ofAdventureComponent(T object, short tooltip)

### Class: dev.jorel.commandapi.CommandAPI
Type: Class

Methods:
- **static** void logException(String message, Throwable throwable)
- **static** void logNormal(String message)
- **static** void logWarning(String message)
- **static** void unregister(String command)
- **static** void unregister(String command, boolean unregisterNamespaces)
- **static** CommandAPILogger getLogger()
- **static** void logInfo(String message)
- **static** void onEnable()
- **static** void onDisable()
- **static** boolean isLoaded()
- **static** boolean canRegister()
- **static** V updateRequirements(T player)
- **static** void logError(String message)
- **static** InternalConfig getConfiguration()
- **static** void setLogger(CommandAPILogger logger)
- **static** void stopCommandRegistration()
- **static** WrapperCommandSyntaxException failWithString(String message)
- **static** V onLoad(CommandAPIConfig<*> config)
- **static** List<RegisteredCommand> getRegisteredCommands()
- **static** V registerCommand(Class<*> commandClass)
- **static** void reloadDatapacks()
- **static** WrapperCommandSyntaxException failWithMessage(Message message)

### Class: dev.jorel.commandapi.CommandAPIBukkit
Type: Abstract Class
Implements: dev.jorel.commandapi.BukkitPlatform

Methods:
- V registerBukkitRecipesSafely(Iterator<Recipe> recipes)
- void registerPermission(String string)
- BukkitCommandAPIMessenger setupMessenger()
- CommandAPIMessenger setupMessenger()
- BukkitCommandAPIMessenger getMessenger()
- V postCommandRegistration(RegisteredCommand registeredCommand, LiteralCommandNode<TSource> resultantNode, List<LiteralCommandNode<TSource>> aliasNodes)
- TSource getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- void onDisable()
- CommandDispatcher<TSource> getBrigadierDispatcher()
- LiteralCommandNode<TSource> registerCommandNode(LiteralArgumentBuilder<TSource> node, String namespace)
- Argument<String> newConcreteLiteralArgument(String nodeName, String literal)
- AbstractArgument newConcreteLiteralArgument(String, String)
- **static** InternalBukkitConfig getConfiguration()
- NMS<TSource> getNMS()
- CommandAPICommand newConcreteCommandAPICommand(CommandMetaData<CommandSender> meta)
- AbstractCommandAPICommand newConcreteCommandAPICommand(CommandMetaData)
- **static** CommandAPIBukkit<TSource> get()
- void reloadDataPacks()
- V createDispatcherFile(File file, CommandDispatcher<TSource> dispatcher) throws IOException
- CommandRegistrationStrategy<TSource> getCommandRegistrationStrategy()
- **static** V initializeNBTAPI(Class<TT> nbtContainerClass, Function<Object, TT> nbtContainerConstructor)
- BukkitCommandSender<CommandSender> wrapCommandSender(CommandSender)
- AbstractCommandSender wrapCommandSender(Object)
- BukkitCommandSender<CommandSender> getCommandSenderFromCommandSource(T css)
- AbstractCommandSender getCommandSenderFromCommandSource(Object)
- void unregister(String commandName, boolean unregisterNamespaces)
- **static** void unregister(String commandName, boolean unregisterNamespaces, boolean unregisterBukkit)
- CommandAPILogger getLogger()
- void preCommandRegistration(String commandName)
- SuggestionProvider<TSource> getSuggestionProvider(SuggestionProviders suggestionProvider)
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<TSource> cmdCtx, boolean forceNative)
- AbstractCommandSender getSenderForCommand(CommandContext, boolean)
- V updateRequirements(AbstractPlayer<*> player)
- JavaPlugin getPlugin()
- Argument<String> newConcreteMultiLiteralArgument(String nodeName, String literals)
- AbstractArgument newConcreteMultiLiteralArgument(String, String[])
- void onLoad()

### Class: dev.jorel.commandapi.CommandAPIBukkitConfig
Type: Abstract Class
Extends: dev.jorel.commandapi.CommandAPIConfig

Constructors:
- CommandAPIBukkitConfig(String pluginName)

Methods:
- TT instance()
- Object instance()
- TT initializeNBTAPI(Class<TNBT> nbtContainerClass, Function<Object, TNBT> nbtContainerConstructor)
- TT addSkipSenderProxy(String names)
- TT addSkipSenderProxy(List<String> names)
- TT setNamespace(String namespace)
- CommandAPIConfig setNamespace(String)
- TT fallbackToLatestNMS(boolean fallbackToLatestNMS)

### Class: dev.jorel.commandapi.CommandAPICommand
Type: Class
Extends: dev.jorel.commandapi.AbstractCommandAPICommand
Implements: dev.jorel.commandapi.BukkitExecutable

Constructors:
- CommandAPICommand(CommandMetaData<CommandSender> meta)
- CommandAPICommand(String commandName)

Methods:
- CommandAPICommand instance()
- Object instance()
- void register(String namespace)
- void register(JavaPlugin plugin)
- CommandAPICommand withHelp(HelpTopic helpTopic)

### Class: dev.jorel.commandapi.CommandAPIConfig
Type: Abstract Class
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- TImpl enableNetworking(boolean enabled)
- TImpl makeNetworkingExceptionsWarnings(boolean value)
- TImpl missingExecutorImplementationMessage(String value)
- TImpl silentLogs(boolean value)
- TImpl dispatcherFile(File file)
- TImpl setNamespace(String namespace)
- TImpl verboseOutput(boolean value)

### Class: dev.jorel.commandapi.CommandAPIExecutor
Type: Class

Methods:
- V setNormalExecutors(List<NormalExecutor<TCommandSender, TWrapperType>> normalExecutors)
- boolean hasAnyExecutors()
- V addNormalExecutor(NormalExecutor<**> executor)
- V setResultingExecutors(List<ResultingExecutor<TCommandSender, TWrapperType>> resultingExecutors)
- List<NormalExecutor<TCommandSender, TWrapperType>> getNormalExecutors()
- I execute(ExecutionInfo<TCommandSender, TWrapperType> info) throws CommandSyntaxException
- V addResultingExecutor(ResultingExecutor<**> executor)
- boolean isForceNative()
- List<ResultingExecutor<TCommandSender, TWrapperType>> getResultingExecutors()

### Class: dev.jorel.commandapi.CommandAPIHandler
Type: Class

Methods:
- **static** Field getField(Class<*> clazz, String name)
- **static** Field getField(Class<*> clazz, String name, String mojangMappedName)
- Command<TSource> generateCommand([T args, A executor, r converted)
- void writeDispatcherToFile()
- void onLoad()
- **static** CommandAPIHandler<***> getInstance()
- void onEnable()
- **static** String getRawArgumentInput(CommandContext<TCommandSource> cmdCtx, String key)
- void onDisable()
- CommandAPIPlatform<TArgument, TCommandSender, TSource> getPlatform()

### Class: dev.jorel.commandapi.CommandAPIMain
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- void onLoad()
- void onEnable()
- void saveDefaultConfig()

### Class: dev.jorel.commandapi.CommandAPISpigot
Type: Abstract Class
Extends: dev.jorel.commandapi.CommandAPIBukkit
Implements: dev.jorel.commandapi.nms.SpigotNMS

Methods:
- **static** InternalSpigotConfig getConfiguration()
- BukkitCommandSender<CommandSender> wrapCommandSender(CommandSender sender)
- AbstractCommandSender wrapCommandSender(Object)
- **static** CommandAPISpigot<TSource> getSpigot()
- **static** WrapperCommandSyntaxException failWithBaseComponents(BaseComponent[] message)
- CommandMap getCommandMap()
- Platform activePlatform()
- void onEnable()

### Class: dev.jorel.commandapi.CommandAPISpigotConfig
Type: Class
Extends: dev.jorel.commandapi.CommandAPIBukkitConfig

Constructors:
- CommandAPISpigotConfig(JavaPlugin plugin)

Methods:
- CommandAPISpigotConfig instance()
- CommandAPIBukkitConfig instance()
- Object instance()
- CommandAPISpigotConfig skipReloadDatapacks(boolean skip)

### Class: dev.jorel.commandapi.CommandAPIVersionHandler
Type: Abstract Class

No public methods found

### Class: dev.jorel.commandapi.CommandPermission
Type: Class

Methods:
- Optional<String> getPermission()
- int hashCode()
- boolean equals(Object obj)
- boolean isNegated()
- String toString()
- **static** CommandPermission fromString(String permission)

### Class: dev.jorel.commandapi.CommandRegistrationStrategy
Type: Abstract Class

Methods:
- void runTasksAfterServerStart()
- void unregister(String, boolean, boolean)
- void preReloadDataPacks()
- V postCommandRegistration(RegisteredCommand registeredCommand, LiteralCommandNode<TSource> resultantNode, List<LiteralCommandNode<TSource>> aliasNodes)
- LiteralCommandNode<TSource> registerCommandNode(LiteralArgumentBuilder<TSource>, String)
- CommandDispatcher<TSource> getBrigadierDispatcher()

### Class: dev.jorel.commandapi.CommandTree
Type: Class
Extends: dev.jorel.commandapi.AbstractCommandTree
Implements: dev.jorel.commandapi.BukkitExecutable

Constructors:
- CommandTree(String commandName)

Methods:
- CommandTree instance()
- Object instance()
- void register(String namespace)
- void register(JavaPlugin plugin)

### Class: dev.jorel.commandapi.Converter
Type: Class

Methods:
- **static** void convert(JavaPlugin plugin)
- **static** void convert(JavaPlugin plugin, String cmdName)
- **static** V convert(JavaPlugin plugin, String cmdName, Argument<*> arguments)
- **static** V convert(JavaPlugin plugin, String cmdName, List<Argument<*>> arguments)
- **static** void convert(String cmdName)
- **static** V convert(String cmdName, List<Argument<*>> arguments)

### Class: dev.jorel.commandapi.ExecutableCommand
Type: Abstract Class
Extends: dev.jorel.commandapi.Executable

Methods:
- TImpl withPermission(CommandPermission permission)
- TImpl withPermission(String permission)
- TImpl withUsage(String usage)
- String[] getAliases()
- Predicate<TCommandSender> getRequirements()
- CommandPermission getPermission()
- String getName()
- void setAliases(String[] aliases)
- CommandAPIExecutor getExecutor()
- void setExecutor(CommandAPIExecutor)
- TImpl withShortDescription(String description)
- TImpl withHelp(String shortDescription, String fullDescription)
- String[] getUsage()
- TImpl withRequirement(Predicate<TCommandSender> requirement)
- TImpl withFullDescription(String description)
- String getFullDescription()
- String getShortDescription()
- TImpl withAliases(String aliases)
- Executable clearExecutors()
- void override()
- void setPermission(CommandPermission permission)
- V setRequirements(Predicate<TCommandSender> requirements)
- TImpl withoutPermission(CommandPermission permission)
- TImpl withoutPermission(String permission)
- void register()
- void register(String)

### Class: dev.jorel.commandapi.Execution
Type: Class

Constructors:
- Execution(List<TArgument> arguments, CommandAPIExecutor<TCommandSender, AbstractCommandSender<+TCommandSender>> executor)

Methods:
- Execution<TCommandSender, TArgument> prependedBy(T argument)
- V register(CommandMetaData<TCommandSender> meta, String namespace)

### Class: dev.jorel.commandapi.InternalBukkitConfig
Type: Abstract Class
Extends: dev.jorel.commandapi.InternalConfig

Constructors:
- InternalBukkitConfig(CommandAPIBukkitConfig<CommandAPIBukkitConfig<*>> pluginName)

Methods:
- V lateInitializeNBT(Class<*> nbtContainerClass, Function<Object, *> nbtContainerConstructor)
- Class<*> getNBTContainerClass()
- boolean skipReloadDatapacks()
- String getPluginName()
- Function<Object, *> getNBTContainerConstructor()
- boolean shouldSkipSenderProxy(String commandName)
- boolean fallbackToLatestNMS()

### Class: dev.jorel.commandapi.InternalConfig
Type: Class

Constructors:
- InternalConfig(CommandAPIConfig<*> verboseOutput)

Methods:
- String getNamespace()
- boolean hasSilentLogs()
- boolean makeNetworkingExceptionsWarnings()
- boolean isNetworkingEnabled()
- String getMissingImplementationMessage()
- boolean hasVerboseOutput()
- File getDispatcherFile()

### Class: dev.jorel.commandapi.InternalSpigotConfig
Type: Class
Extends: dev.jorel.commandapi.InternalBukkitConfig

Constructors:
- InternalSpigotConfig(CommandAPISpigotConfig plugin)

Methods:
- JavaPlugin getPlugin()

### Class: dev.jorel.commandapi.LoadContext
Type: Class
Extends: java.lang.Record

Constructors:
- LoadContext(CommandAPIPlatform<***> platform)
- LoadContext(CommandAPIPlatform<***> platform, Runnable context)

Methods:
- int hashCode()
- boolean equals(Object o)
- Runnable context()
- String toString()
- CommandAPIPlatform<***> platform()

### Class: dev.jorel.commandapi.Platform
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SPIGOT
- PAPER

Methods:
- **static** Platform valueOf(String name)
- **static** Platform[] values()

### Class: dev.jorel.commandapi.RegisteredCommand
Type: Class
Extends: java.lang.Record

Constructors:
- RegisteredCommand(String commandName, List<String> argsAsStr, List<AbstractArgument<****>> arguments, Optional<String> shortDescription, Optional<String> fullDescription, Optional<String> usageDescription, Optional<Object> helpTopic, String aliases, CommandPermission permission, String namespace)

Methods:
- String[] aliases()
- boolean shouldGenerateHelpTopic()
- CommandPermission permission()
- Optional<String> usageDescription()
- Optional<String> shortDescription()
- Optional<String> fullDescription()
- String commandName()
- int hashCode()
- boolean equals(Object obj)
- String namespace()
- Optional<Object> helpTopic()
- List<AbstractArgument<****>> arguments()
- String toString()
- List<String> argsAsStr()

### Class: dev.jorel.commandapi.SafeVarHandle
Type: Class

Methods:
- TFieldType getStatic()
- V set(T instance, T param)
- TFieldType get(T instance)
- **static** SafeVarHandle<TType, TFieldType> ofOrNull(Class<-TType> classType, String fieldName, String mojangMappedFieldName, Class<-TFieldType> fieldType)

### Class: dev.jorel.commandapi.SpigotCommandRegistration
Type: Class
Extends: dev.jorel.commandapi.CommandRegistrationStrategy

Constructors:
- SpigotCommandRegistration(CommandDispatcher<TSource> brigadierDispatcher, SimpleCommandMap commandMap, Supplier<CommandDispatcher<TSource>> getResourcesDispatcher, Predicate<Command> isVanillaCommandWrapper, Function<CommandNode<TSource>, Command> wrapToVanillaCommandWrapper, Predicate<CommandNode<TSource>> isBukkitCommandWrapper)

Methods:
- Command wrapToVanillaCommandWrapper(CommandNode<TSource> node)
- Z isBukkitCommandWrapper(CommandNode<TSource> node)
- void runTasksAfterServerStart()
- CommandDispatcher<TSource> getResourcesDispatcher()
- void unregister(String commandName, boolean unregisterNamespaces, boolean unregisterBukkit)
- boolean isVanillaCommandWrapper(Command command)
- void preReloadDataPacks()
- V postCommandRegistration(RegisteredCommand registeredCommand, LiteralCommandNode<TSource> resultantNode, List<LiteralCommandNode<TSource>> aliasNodes)
- LiteralCommandNode<TSource> registerCommandNode(LiteralArgumentBuilder<TSource> node, String namespace)
- CommandDispatcher<TSource> getBrigadierDispatcher()

### Class: dev.jorel.commandapi.StringTooltip
Type: Class
Implements: dev.jorel.commandapi.IStringTooltip

Methods:
- **static** StringTooltip ofString(String suggestion, String tooltip)
- **static** Collection<StringTooltip> generateStrings(UnaryOperator<String> tooltipGenerator, String suggestions)
- **static** Collection<StringTooltip> generateStrings(UnaryOperator<String> tooltipGenerator, Collection<String> suggestions)
- Message getTooltip()
- **static** StringTooltip ofMessage(String suggestion, Message tooltip)
- **static** Collection<StringTooltip> generateMessages(Function<String, Message> tooltipGenerator, String suggestions)
- **static** Collection<StringTooltip> generateMessages(Function<String, Message> tooltipGenerator, Collection<String> suggestions)
- **static** StringTooltip none(String suggestion)
- **static** Collection<StringTooltip> none(String suggestions)
- **static** Collection<StringTooltip> none(Collection<String> suggestions)
- String getSuggestion()

### Class: dev.jorel.commandapi.SuggestionInfo
Type: Class
Extends: java.lang.Record

Constructors:
- SuggestionInfo(T sender, char previousArgs, o currentInput, m currentArg)

Methods:
- String currentInput()
- TCommandSender sender()
- int hashCode()
- boolean equals(Object o)
- String currentArg()
- CommandArguments previousArgs()
- String toString()

### Class: dev.jorel.commandapi.Tooltip
Type: Class

Methods:
- **static** Tooltip<TS> ofString(T object, short tooltip)
- **static** Collection<Tooltip<TS>> generateStrings(Function<TS, String> tooltipGenerator, [T suggestions)
- **static** Collection<Tooltip<TS>> generateStrings(Function<TS, String> tooltipGenerator, Collection<TS> suggestions)
- Message getTooltip()
- **static** Function<Tooltip<TS>, StringTooltip> build(Function<TS, String> mapper)
- **static** Tooltip<TS> ofMessage(T object, short tooltip)
- **static** Collection<Tooltip<TS>> generateMessages(Function<TS, Message> tooltipGenerator, [T suggestions)
- **static** Collection<Tooltip<TS>> generateMessages(Function<TS, Message> tooltipGenerator, Collection<TS> suggestions)
- **static** Tooltip<TS> arrayOf(Tooltip<TS> tooltips)
- **static** Tooltip<TS> none(T object)
- **static** Collection<Tooltip<TS>> none([T suggestions)
- **static** Collection<Tooltip<TS>> none(Collection<TS> suggestions)
- **static** Message messageFromString(String string)
- TS getSuggestion()

## Package: dev.jorel.commandapi.arguments

### Class: dev.jorel.commandapi.arguments.ArgumentSuggestions
Type: Interface

Methods:
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltipsAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<IStringTooltip>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<String>>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<String>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> strings(String suggestions)
- **static** ArgumentSuggestions<TCommandSender> strings(Collection<String> suggestions)
- **static** ArgumentSuggestions<TCommandSender> strings(Function<SuggestionInfo<TCommandSender>, String> suggestions)
- **static** ArgumentSuggestions<TCommandSender> merge(ArgumentSuggestions<TCommandSender> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltipsCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<IStringTooltip>>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringCollection(Function<SuggestionInfo<TCommandSender>, Collection<String>> suggestions)
- CompletableFuture<Suggestions> suggest(SuggestionInfo<TCommandSender>, SuggestionsBuilder) throws CommandSyntaxException
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltipsCollection(Function<SuggestionInfo<TCommandSender>, Collection<IStringTooltip>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltips(IStringTooltip suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltips(Collection<IStringTooltip> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltips(Function<SuggestionInfo<TCommandSender>, IStringTooltip> suggestions)
- **static** ArgumentSuggestions<TCommandSender> empty()

### Class: dev.jorel.commandapi.arguments.CustomArgument$CustomArgumentInfoParser
Type: Interface

Methods:
- TT apply(CustomArgument$CustomArgumentInfo<TB>) throws CustomArgument$CustomArgumentException

### Class: dev.jorel.commandapi.arguments.CustomProvidedArgument
Type: Interface

Methods:
- SuggestionProviders getSuggestionProvider()

### Class: dev.jorel.commandapi.arguments.GreedyArgument
Type: Interface

No public methods found

### Class: dev.jorel.commandapi.arguments.Literal
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- String getLiteral()

### Class: dev.jorel.commandapi.arguments.MultiLiteral
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- String[] getLiterals()

### Class: dev.jorel.commandapi.arguments.SafeOverrideable
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- TImpl replaceSafeSuggestions(SafeSuggestions<TS, TCommandSender> suggestions)
- Function<TS, String> getMapper()
- TImpl includeSuggestions(ArgumentSuggestions<TCommandSender>)
- TImpl replaceSuggestions(ArgumentSuggestions<TCommandSender>)
- TImpl includeSafeSuggestions(SafeSuggestions<TS, TCommandSender> suggestions)

### Class: dev.jorel.commandapi.arguments.SafeSuggestions
Type: Interface

Methods:
- ArgumentSuggestions<TCommandSender> toSuggestions(Function<TS, String>)
- **static** SafeSuggestions<TT, TCommandSender> tooltipsAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Tooltip<TT>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggestCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<TT>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggestCollection(Function<SuggestionInfo<TCommandSender>, Collection<TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltipCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<Tooltip<TT>>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggest([T suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggest(Collection<TT> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggest(Function<SuggestionInfo<TCommandSender>, [TT> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltipCollection(Function<SuggestionInfo<TCommandSender>, Collection<Tooltip<TT>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltips(Tooltip<TT> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltips(Collection<Tooltip<TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltips(Function<SuggestionInfo<TCommandSender>, Tooltip<TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggestAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<[TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> empty()

### Class: dev.jorel.commandapi.arguments.StringParser
Type: Interface

Methods:
- TT parse(String) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.arguments.AbstractArgument
Type: Abstract Class
Extends: dev.jorel.commandapi.AbstractArgumentTree

Methods:
- TImpl withPermission(CommandPermission permission)
- TImpl withPermission(String permission)
- String getHelpString()
- TT parseArgument(CommandContext<TSource>, String, CommandArguments) throws CommandSyntaxException
- ArgumentType<*> getRawType()
- Predicate<TCommandSender> getRequirements()
- Optional<ArgumentSuggestions<TCommandSender>> getIncludedSuggestions()
- V copyPermissionsAndRequirements(T argument)
- TImpl setListed(boolean listed)
- TImpl includeSuggestions(ArgumentSuggestions<TCommandSender> suggestions)
- boolean isOptional()
- String getNodeName()
- List<String> getEntityNames(Object argument)
- boolean hasCombinedArguments()
- List<TArgument> getCombinedArguments()
- TImpl withRequirement(Predicate<TCommandSender> requirement)
- CommandPermission getArgumentPermission()
- CommandAPIArgumentType getArgumentType()
- boolean isListed()
- Class<TT> getPrimitiveType()
- Optional<ArgumentSuggestions<TCommandSender>> getOverriddenSuggestions()
- String toString()
- TImpl replaceSuggestions(ArgumentSuggestions<TCommandSender> suggestions)
- TImpl combineWith([T combinedArguments)
- TImpl setOptional(boolean optional)

### Class: dev.jorel.commandapi.arguments.AdvancementArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- AdvancementArgument(String nodeName)

Methods:
- Advancement parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Advancement> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.AngleArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- AngleArgument(String nodeName)

Methods:
- Float parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Float> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.Argument
Type: Abstract Class
Extends: dev.jorel.commandapi.arguments.AbstractArgument
Implements: dev.jorel.commandapi.BukkitExecutable

Methods:
- Argument<TT> instance()
- Object instance()

### Class: dev.jorel.commandapi.arguments.ArgumentSubType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ENTITYSELECTOR_ONE_ENTITY
- ENTITYSELECTOR_ONE_PLAYER
- ENTITYSELECTOR_MANY_ENTITIES
- ENTITYSELECTOR_MANY_PLAYERS
- BIOME_BIOME
- BIOME_NAMESPACEDKEY
- SOUND_SOUND
- SOUND_NAMESPACEDKEY
- SCOREHOLDER_SINGLE
- SCOREHOLDER_MULTIPLE
- POTION_EFFECT_POTION_EFFECT
- POTION_EFFECT_NAMESPACEDKEY

Methods:
- **static** ArgumentSubType valueOf(String name)
- **static** ArgumentSubType[] values()

### Class: dev.jorel.commandapi.arguments.AsyncPlayerProfileArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- AsyncPlayerProfileArgument(String nodeName)

Methods:
- CompletableFuture<List<PlayerProfile>> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs)
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<CompletableFuture<List<PlayerProfile>>> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.AxisArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- AxisArgument(String nodeName)

Methods:
- EnumSet<Axis> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<EnumSet> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.BiomeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- BiomeArgument(String nodeName)

Methods:
- Biome parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Biome> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.BiomeArgument$NamespacedKey
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- BiomeArgument$NamespacedKey(String nodeName)

Methods:
- NamespacedKey parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<NamespacedKey> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.BlockPredicateArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- BlockPredicateArgument(String nodeName)

Methods:
- Predicate<*> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Predicate> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.BlockStateArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- BlockStateArgument(String nodeName)

Methods:
- BlockState parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<BlockState> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.BooleanArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- BooleanArgument(String nodeName)

Methods:
- Boolean parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Boolean> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ChatArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.GreedyArgument

Constructors:
- ChatArgument(String nodeName)

Methods:
- BaseComponent parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<BaseComponent> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ChatColorArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- ChatColorArgument(String nodeName)

Methods:
- ChatColor parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<ChatColor> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ChatComponentArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- ChatComponentArgument(String nodeName)

Methods:
- BaseComponent parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<BaseComponent> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.CommandAPIArgumentType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ADVANCEMENT
- ADVENTURE_CHAT
- ADVENTURE_CHATCOLOR
- ADVENTURE_CHAT_COMPONENT
- ANGLE
- ASYNC_OFFLINE_PLAYER
- AXIS
- BIOME
- BLOCK_PREDICATE
- BLOCKSTATE
- CHAT
- CHAT_COMPONENT
- CHATCOLOR
- COMMAND
- CUSTOM
- DIMENSION
- ENCHANTMENT
- ENTITY_SELECTOR
- ENTITY_TYPE
- ENVIRONMENT
- FLOAT_RANGE
- FUNCTION
- INT_RANGE
- ITEMSTACK
- ITEMSTACK_PREDICATE
- LIST
- LIST_TEXT
- LITERAL
- LOCATION
- LOCATION_2D
- LOOT_TABLE
- MAP
- MATH_OPERATION
- MULTI_LITERAL
- NAMESPACED_KEY
- NBT_COMPOUND
- OBJECTIVE
- OBJECTIVE_CRITERIA
- PARTICLE
- PLAYER
- POTION_EFFECT
- PRIMITIVE_BOOLEAN
- PRIMITIVE_DOUBLE
- PRIMITIVE_FLOAT
- PRIMITIVE_GREEDY_STRING
- PRIMITIVE_INTEGER
- PRIMITIVE_LONG
- PRIMITIVE_STRING
- PRIMITIVE_TEXT
- RECIPE
- ROTATION
- SCORE_HOLDER
- SCOREBOARD_SLOT
- SOUND
- TEAM
- TIME
- UUID

Methods:
- **static** CommandAPIArgumentType fromInternal(String internal)
- **static** CommandAPIArgumentType valueOf(String name)
- **static** CommandAPIArgumentType[] values()

### Class: dev.jorel.commandapi.arguments.CommandArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.GreedyArgument

Constructors:
- CommandArgument(String replacements)

Methods:
- CommandResult parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<CommandResult> getPrimitiveType()
- Argument<CommandResult> branchSuggestions(SuggestionsBranch<CommandSender> branches)
- CommandArgument replaceSuggestions(ArgumentSuggestions<CommandSender> suggestions)
- CommandArgument replaceSuggestions(ArgumentSuggestions<CommandSender> suggestions)
- AbstractArgument replaceSuggestions(ArgumentSuggestions)
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.CustomArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- CustomArgument(Argument<TB> base, CustomArgument$CustomArgumentInfoParser<TT, TB> infoParser)

Methods:
- TT parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Class<TT> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.CustomArgument$CustomArgumentException
Type: Class
Extends: java.lang.Exception

Methods:
- **static** CustomArgument$CustomArgumentException fromBaseComponents(BaseComponent[] errorMessage)
- CommandSyntaxException toCommandSyntax(String result, CommandContext<*> cmdCtx)
- **static** CustomArgument$CustomArgumentException fromString(String errorMessage)
- **static** CustomArgument$CustomArgumentException fromMessageBuilder(CustomArgument$MessageBuilder errorMessage)

### Class: dev.jorel.commandapi.arguments.CustomArgument$CustomArgumentInfo
Type: Class
Extends: java.lang.Record

Constructors:
- CustomArgument$CustomArgumentInfo(CommandSender sender, CommandArguments previousArgs, String input, T currentInput)

Methods:
- String input()
- TB currentInput()
- CommandSender sender()
- int hashCode()
- boolean equals(Object o)
- CommandArguments previousArgs()
- String toString()

### Class: dev.jorel.commandapi.arguments.CustomArgument$MessageBuilder
Type: Class
Implements: java.io.Serializable

Constructors:
- CustomArgument$MessageBuilder(String builder)

Methods:
- CustomArgument$MessageBuilder appendArgInput()
- String toString()
- CustomArgument$MessageBuilder append(String str)
- CustomArgument$MessageBuilder append(Object obj)
- CustomArgument$MessageBuilder appendHere()
- CustomArgument$MessageBuilder appendFullInput()

### Class: dev.jorel.commandapi.arguments.DoubleArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- DoubleArgument(String nodeName)
- DoubleArgument(String nodeName, double min)
- DoubleArgument(String nodeName, double min, double max)

Methods:
- Double parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Double> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.DoubleRangeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- DoubleRangeArgument(String nodeName)

Methods:
- DoubleRange parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<DoubleRange> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EnchantmentArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- EnchantmentArgument(String nodeName)

Methods:
- Enchantment parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Enchantment> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EntitySelectorArgument
Type: Class

No public methods found

### Class: dev.jorel.commandapi.arguments.EntitySelectorArgument$ManyEntities
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- EntitySelectorArgument$ManyEntities(String nodeName)
- EntitySelectorArgument$ManyEntities(String nodeName, boolean allowEmpty)

Methods:
- Collection<Entity> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Collection> getPrimitiveType()
- List<String> getEntityNames(Object argument)
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EntitySelectorArgument$ManyPlayers
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- EntitySelectorArgument$ManyPlayers(String nodeName)
- EntitySelectorArgument$ManyPlayers(String nodeName, boolean allowEmpty)

Methods:
- Collection<Player> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Collection> getPrimitiveType()
- List<String> getEntityNames(Object argument)
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EntitySelectorArgument$OneEntity
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- EntitySelectorArgument$OneEntity(String nodeName)

Methods:
- Entity parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Entity> getPrimitiveType()
- List<String> getEntityNames(Object argument)
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EntitySelectorArgument$OnePlayer
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- EntitySelectorArgument$OnePlayer(String nodeName)

Methods:
- Player parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Player> getPrimitiveType()
- List<String> getEntityNames(Object argument)
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.EntityTypeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- EntityTypeArgument(String nodeName)

Methods:
- EntityType parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<EntityType> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.FloatArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- FloatArgument(String nodeName)
- FloatArgument(String nodeName, float min)
- FloatArgument(String nodeName, float min, float max)

Methods:
- Float parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Float> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.FunctionArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- FunctionArgument(String nodeName)

Methods:
- FunctionWrapper parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<FunctionWrapper> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.GreedyStringArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.GreedyArgument

Constructors:
- GreedyStringArgument(String nodeName)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.IntegerArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- IntegerArgument(String nodeName)
- IntegerArgument(String nodeName, int min)
- IntegerArgument(String nodeName, int min, int max)

Methods:
- Integer parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Integer> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.IntegerRangeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- IntegerRangeArgument(String nodeName)

Methods:
- IntegerRange parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<IntegerRange> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ItemStackArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- ItemStackArgument(String nodeName)

Methods:
- ItemStack parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<ItemStack> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ItemStackPredicateArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- ItemStackPredicateArgument(String nodeName)

Methods:
- Predicate<ItemStack> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Predicate> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ListArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.ListArgumentCommon
Implements: dev.jorel.commandapi.arguments.GreedyArgument

No public methods found

### Class: dev.jorel.commandapi.arguments.ListArgumentBuilder
Type: Class

Constructors:
- ListArgumentBuilder(String nodeName)
- ListArgumentBuilder(String nodeName, String delimiter)

Methods:
- ListArgumentBuilder<TT> allowDuplicates(boolean allowDuplicates)
- ListArgumentBuilder<TT>ListArgumentBuilderSuggests withList(Function<SuggestionInfo<CommandSender>, Collection<TT>> list)
- ListArgumentBuilder<TT>ListArgumentBuilderSuggests withList(Supplier<Collection<TT>> list)
- ListArgumentBuilder<TT>ListArgumentBuilderSuggests withList(Collection<TT> list)
- ListArgumentBuilder<TT>ListArgumentBuilderSuggests withList([T array)

### Class: dev.jorel.commandapi.arguments.ListArgumentBuilder$ListArgumentBuilderSuggests
Type: Class

Methods:
- ListArgumentBuilder<TT>ListArgumentBuilderFinished withStringTooltipMapper(Function<TT, IStringTooltip> mapper)
- ListArgumentBuilder<TT>ListArgumentBuilderFinished withMapper(Function<TT, String> mapper)
- ListArgumentBuilder<TT>ListArgumentBuilderFinished withStringMapper()

### Class: dev.jorel.commandapi.arguments.ListArgumentBuilder$ListArgumentBuilderSuggests$ListArgumentBuilderFinished
Type: Class

Methods:
- ListArgument<TT> buildGreedy()
- ListTextArgument<TT> buildText()

### Class: dev.jorel.commandapi.arguments.ListArgumentCommon
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Methods:
- List<TT> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<List> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ListTextArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.ListArgumentCommon

No public methods found

### Class: dev.jorel.commandapi.arguments.LiteralArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.Literal

Constructors:
- LiteralArgument(String literal)
- LiteralArgument(String nodeName, String literal)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- String getHelpString()
- String getLiteral()
- **static** LiteralArgument of(String literal)
- **static** LiteralArgument of(String nodeName, String literal)
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()
- **static** LiteralArgument literal(String literal)
- **static** LiteralArgument literal(String nodeName, String literal)

### Class: dev.jorel.commandapi.arguments.Location2DArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- Location2DArgument(String nodeName)
- Location2DArgument(String nodeName, LocationType type)
- Location2DArgument(String nodeName, LocationType isPrecise, boolean centerPosition)

Methods:
- Location2D parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Location2D> getPrimitiveType()
- LocationType getLocationType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.LocationArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- LocationArgument(String nodeName)
- LocationArgument(String nodeName, LocationType type)
- LocationArgument(String nodeName, LocationType isPrecise, boolean centerPosition)

Methods:
- Location parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Location> getPrimitiveType()
- LocationType getLocationType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.LocationType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BLOCK_POSITION
- PRECISE_POSITION

Methods:
- **static** LocationType valueOf(String name)
- **static** LocationType[] values()

### Class: dev.jorel.commandapi.arguments.LongArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- LongArgument(String nodeName)
- LongArgument(String nodeName, long min)
- LongArgument(String nodeName, long min, long max)

Methods:
- Long parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Long> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.LootTableArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- LootTableArgument(String nodeName)

Methods:
- LootTable parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<LootTable> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.MapArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.GreedyArgument

Methods:
- LinkedHashMap<TK, TV> parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<LinkedHashMap> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.MapArgumentBuilder
Type: Class

Constructors:
- MapArgumentBuilder(String nodeName)
- MapArgumentBuilder(String nodeName, char delimiter)
- MapArgumentBuilder(String nodeName, char delimiter, String separator)

Methods:
- MapArgumentBuilder<TK, TV>MapArgumentBuilderValueMapper withKeyMapper(StringParser<TK> keyMapper)

### Class: dev.jorel.commandapi.arguments.MapArgumentBuilder$MapArgumentBuilderValueMapper
Type: Class

Constructors:
- MapArgumentBuilder$MapArgumentBuilderValueMapper(StringParser<TK> this$0, StringParser keyMapper)

Methods:
- MapArgumentBuilder<TK, TV>MapArgumentBuilderSuggestsKey withValueMapper(StringParser<TV> valueMapper)

### Class: dev.jorel.commandapi.arguments.MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey
Type: Class

Constructors:
- MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey(StringParser<TV> this$1, StringParser valueMapper)

Methods:
- MapArgumentBuilder<TK, TV>MapArgumentBuilderSuggestsValue withKeyList(List<String> keyList)
- MapArgumentBuilder<TK, TV>MapArgumentBuilderSuggestsValue withoutKeyList()

### Class: dev.jorel.commandapi.arguments.MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey$MapArgumentBuilderSuggestsValue
Type: Class

Constructors:
- MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey$MapArgumentBuilderSuggestsValue(List<String> this$2, List keyList)

Methods:
- MapArgumentBuilder<TK, TV>MapArgumentBuilderFinished withoutValueList()
- MapArgumentBuilder<TK, TV>MapArgumentBuilderFinished withoutValueList(boolean allowDuplicates)
- MapArgumentBuilder<TK, TV>MapArgumentBuilderFinished withValueList(List<String> valueList)
- MapArgumentBuilder<TK, TV>MapArgumentBuilderFinished withValueList(List<String> valueList, boolean allowDuplicates)

### Class: dev.jorel.commandapi.arguments.MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey$MapArgumentBuilderSuggestsValue$MapArgumentBuilderFinished
Type: Class

Constructors:
- MapArgumentBuilder$MapArgumentBuilderValueMapper$MapArgumentBuilderSuggestsKey$MapArgumentBuilderSuggestsValue$MapArgumentBuilderFinished(List<String> this$3, boolean valueList, boolean allowValueDuplicates)

Methods:
- MapArgument<TK, TV> build()

### Class: dev.jorel.commandapi.arguments.MathOperationArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- MathOperationArgument(String nodeName)

Methods:
- MathOperation parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<MathOperation> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.MultiLiteralArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.MultiLiteral

Constructors:
- MultiLiteralArgument(String nodeName, String[] literals)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- String[] getLiterals()
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.NBTCompoundArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- NBTCompoundArgument(String nodeName)

Methods:
- TNBTContainer parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Class<TNBTContainer> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.NamespacedKeyArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- NamespacedKeyArgument(String nodeName)

Methods:
- NamespacedKey parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<NamespacedKey> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ObjectiveArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- ObjectiveArgument(String nodeName)

Methods:
- Objective parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Objective> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ObjectiveCriteriaArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- ObjectiveCriteriaArgument(String nodeName)

Methods:
- String parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ParticleArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- ParticleArgument(String nodeName)

Methods:
- ParticleData<*> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<ParticleData> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.PlayerProfileArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- PlayerProfileArgument(String nodeName)

Methods:
- List<PlayerProfile> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<List> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.PotionEffectArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- PotionEffectArgument(String nodeName)

Methods:
- PotionEffectType parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<PotionEffectType> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.PotionEffectArgument$NamespacedKey
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- PotionEffectArgument$NamespacedKey(String nodeName)

Methods:
- NamespacedKey parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<NamespacedKey> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.RecipeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- RecipeArgument(String nodeName)

Methods:
- Recipe parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Recipe> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.RotationArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- RotationArgument(String nodeName)

Methods:
- Rotation parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Rotation> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Type: Abstract Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.SafeOverrideable

Methods:
- Function<TS, String> getMapper()
- **static** Function<TS, String> fromKey(Function<TS, NamespacedKey> mapper)

### Class: dev.jorel.commandapi.arguments.ScoreHolderArgument
Type: Class

No public methods found

### Class: dev.jorel.commandapi.arguments.ScoreHolderArgument$Multiple
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- ScoreHolderArgument$Multiple(String nodeName)

Methods:
- Collection<String> parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Collection> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ScoreHolderArgument$Single
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- ScoreHolderArgument$Single(String nodeName)

Methods:
- String parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.ScoreboardSlotArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- ScoreboardSlotArgument(String nodeName)

Methods:
- ScoreboardSlot parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<ScoreboardSlot> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.SoundArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- SoundArgument(String nodeName)

Methods:
- Sound parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Sound> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.SoundArgument$NamespacedKey
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.CustomProvidedArgument

Constructors:
- SoundArgument$NamespacedKey(String nodeName)

Methods:
- NamespacedKey parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<NamespacedKey> getPrimitiveType()
- SuggestionProviders getSuggestionProvider()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.StringArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- StringArgument(String nodeName)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.SuggestionProviders
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FUNCTION
- RECIPES
- SOUNDS
- ADVANCEMENTS
- LOOT_TABLES
- BIOMES
- ENTITIES
- POTION_EFFECTS

Methods:
- **static** SuggestionProviders valueOf(String name)
- **static** SuggestionProviders[] values()

### Class: dev.jorel.commandapi.arguments.SuggestionsBranch
Type: Class

Methods:
- V enforceReplacements(T sender, char arguments) throws CommandSyntaxException
- **static** SuggestionsBranch<TCommandSender> suggest(ArgumentSuggestions<TCommandSender> suggestions)
- SuggestionsBranch<TCommandSender> branch(SuggestionsBranch<TCommandSender> branches)
- ArgumentSuggestions<TCommandSender> getNextSuggestion(T sender, char previousArguments) throws CommandSyntaxException

### Class: dev.jorel.commandapi.arguments.TeamArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- TeamArgument(String nodeName)

Methods:
- Team parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Team> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.TextArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- TextArgument(String nodeName)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.TimeArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- TimeArgument(String nodeName)

Methods:
- Integer parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Integer> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.UUIDArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- UUIDArgument(String nodeName)

Methods:
- UUID parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<UUID> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.WorldArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- WorldArgument(String nodeName)

Methods:
- World parseArgument(CommandContext<TCommandSourceStack> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<World> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

## Package: dev.jorel.commandapi.arguments.parser

### Class: dev.jorel.commandapi.arguments.parser.EntitySelectorParser
Type: Class
Extends: java.lang.Record

Constructors:
- EntitySelectorParser(ThrowingSupplyingParser<Player> player, ThrowingSupplyingParser<Entity> entity, ThrowingFunctionParser<Boolean, Collection<Player>> players, ThrowingFunctionParser<Boolean, Collection<Entity>> entities)

Methods:
- ThrowingFunctionParser<Boolean, Collection<Entity>> entities()
- ThrowingFunctionParser<Boolean, Collection<Player>> players()
- int hashCode()
- boolean equals(Object o)
- String toString()
- ThrowingSupplyingParser<Entity> entity()
- ThrowingSupplyingParser<Player> player()

### Class: dev.jorel.commandapi.arguments.parser.RegistryParser
Type: Class
Extends: java.lang.Record

Constructors:
- RegistryParser(ThrowingSupplyingParser<TT> type, ThrowingSupplyingParser<NamespacedKey> key)

Methods:
- int hashCode()
- boolean equals(Object o)
- String toString()
- ThrowingSupplyingParser<TT> type()
- ThrowingSupplyingParser<NamespacedKey> key()

## Package: dev.jorel.commandapi.arguments.parser.function

### Class: dev.jorel.commandapi.arguments.parser.function.ThrowingBiFunction
Type: Interface

Methods:
- TR^TE apply(T, T) throws Exception

### Class: dev.jorel.commandapi.arguments.parser.function.ThrowingFunctionParser
Type: Interface

Methods:
- TR apply(T) throws CommandSyntaxException

### Class: dev.jorel.commandapi.arguments.parser.function.ThrowingSupplier
Type: Interface

Methods:
- TT get() throws Exception

### Class: dev.jorel.commandapi.arguments.parser.function.ThrowingSupplyingParser
Type: Interface

Methods:
- TT get() throws CommandSyntaxException

## Package: dev.jorel.commandapi.commandsenders

### Class: dev.jorel.commandapi.commandsenders.AbstractBlockCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractCommandSender
Type: Interface

Methods:
- TSource getSource()
- boolean hasPermission(String)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.AbstractConsoleCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractEntity
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractFeedbackForwardingCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractNativeProxyCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractProxiedCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractPlayer
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractProxiedCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractRemoteConsoleCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.BukkitCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.BukkitBlockCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractBlockCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitBlockCommandSender(BlockCommandSender commandBlock)

Methods:
- BlockCommandSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitConsoleCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractConsoleCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitConsoleCommandSender(ConsoleCommandSender sender)

Methods:
- ConsoleCommandSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitEntity
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractEntity, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitEntity(Entity entity)

Methods:
- Entity getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitFeedbackForwardingCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractFeedbackForwardingCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitFeedbackForwardingCommandSender(T sender)

Methods:
- TFeedbackForwardingSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitNativeProxyCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractNativeProxyCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitNativeProxyCommandSender(NativeProxyCommandSender proxySender)

Methods:
- NativeProxyCommandSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitPlayer
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractPlayer, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitPlayer(Player player)

Methods:
- Player getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitProxiedCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractProxiedCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitProxiedCommandSender(ProxiedCommandSender proxySender)

Methods:
- ProxiedCommandSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.BukkitRemoteConsoleCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractRemoteConsoleCommandSender, dev.jorel.commandapi.commandsenders.BukkitCommandSender

Constructors:
- BukkitRemoteConsoleCommandSender(RemoteConsoleCommandSender remote)

Methods:
- RemoteConsoleCommandSender getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

## Package: dev.jorel.commandapi.config

### Class: dev.jorel.commandapi.config.ConfigurationAdapter
Type: Interface

Methods:
- Object getValue(String)
- ConfigurationAdapter<TConfiguration> loadFromFile() throws IOException
- boolean contains(String)
- void saveToFile() throws IOException
- void setValue(String, Object)
- void tryCreateSection(String)
- void setComment(String, String[])
- String[] getComment(String)
- Set<String> getKeys()
- ConfigurationAdapter<TConfiguration> complete()
- void saveDefaultConfig(DefaultConfig defaultConfig, File directory, Logger logger)
- TConfiguration config()
- ConfigurationAdapter<TConfiguration> createNew()

### Class: dev.jorel.commandapi.config.BukkitConfigurationAdapter
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.config.ConfigurationAdapter

Constructors:
- BukkitConfigurationAdapter(YamlConfiguration config, File configFile)

Methods:
- ConfigurationAdapter<YamlConfiguration> loadFromFile()
- Set<String> getKeys()
- ConfigurationAdapter<YamlConfiguration> createNew()
- Object getValue(String key)
- boolean contains(String key)
- void saveToFile() throws IOException
- int hashCode()
- File configFile()
- boolean equals(Object o)
- void setValue(String key, Object value)
- void tryCreateSection(String key)
- void setComment(String key, String[] comment)
- String toString()
- String[] getComment(String key)
- **static** BukkitConfigurationAdapter createMinimalInstance(File configFile)
- ConfigurationAdapter<YamlConfiguration> complete()
- YamlConfiguration config()
- Object config()

### Class: dev.jorel.commandapi.config.CommentedConfigOption
Type: Class
Extends: java.lang.Record

Constructors:
- CommentedConfigOption(String comment, T option)

Methods:
- int hashCode()
- boolean equals(Object o)
- String[] comment()
- String toString()
- TT option()

### Class: dev.jorel.commandapi.config.CommentedSection
Type: Class
Extends: java.lang.Record

Constructors:
- CommentedSection(String[] comment)

Methods:
- int hashCode()
- boolean equals(Object o)
- String[] comment()
- String toString()

### Class: dev.jorel.commandapi.config.ConfigGenerator
Type: Class

Methods:
- ConfigurationAdapter<TT> generate(ConfigurationAdapter<TT> existingConfig)
- **static** ConfigGenerator createNew(DefaultConfig defaultConfig)

### Class: dev.jorel.commandapi.config.DefaultBukkitConfig
Type: Class
Extends: dev.jorel.commandapi.config.DefaultConfig

Methods:
- **static** CommentedConfigOption<Boolean> FALLBACK_TO_LATEST_NMS(boolean paper)
- **static** DefaultBukkitConfig createDefaultPaperConfig()
- **static** DefaultBukkitConfig create(Map<String, CommentedConfigOption<*>> options, Map<String, CommentedSection> sections)
- **static** DefaultBukkitConfig createDefaultSpigotConfig()

### Class: dev.jorel.commandapi.config.DefaultConfig
Type: Abstract Class

Methods:
- Map<String, CommentedConfigOption<*>> getAllOptions()
- Map<String, CommentedSection> getAllSections()

## Package: dev.jorel.commandapi.exceptions

### Class: dev.jorel.commandapi.exceptions.BadLiteralException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- BadLiteralException(boolean isNull)

No public methods found

### Class: dev.jorel.commandapi.exceptions.ConflictingPermissionsException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- ConflictingPermissionsException(String command, CommandPermission currentPermission, CommandPermission conflictingPermission)

No public methods found

### Class: dev.jorel.commandapi.exceptions.EmptyExecutorException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: dev.jorel.commandapi.exceptions.GreedyArgumentException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- GreedyArgumentException(AbstractArgument<****> arguments)

No public methods found

### Class: dev.jorel.commandapi.exceptions.InvalidCommandNameException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- InvalidCommandNameException(String commandName)

No public methods found

### Class: dev.jorel.commandapi.exceptions.InvalidNumberException
Type: Class
Extends: java.lang.Exception

Constructors:
- InvalidNumberException(String input, String command, int index)

No public methods found

### Class: dev.jorel.commandapi.exceptions.InvalidRangeException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: dev.jorel.commandapi.exceptions.MissingCommandExecutorException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- MissingCommandExecutorException(String commandName)

No public methods found

### Class: dev.jorel.commandapi.exceptions.NBTAPINotFoundException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- NBTAPINotFoundException(Class<*> c)

No public methods found

### Class: dev.jorel.commandapi.exceptions.OptionalArgumentException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- OptionalArgumentException(String commandName)

No public methods found

### Class: dev.jorel.commandapi.exceptions.PaperAdventureNotFoundException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- PaperAdventureNotFoundException(Class<*> c)

No public methods found

### Class: dev.jorel.commandapi.exceptions.PlatformException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- PlatformException(String message)

No public methods found

### Class: dev.jorel.commandapi.exceptions.ProtocolVersionTooOldException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- int getProtocolVersion()
- **static** ProtocolVersionTooOldException whileSending(Object target, int protocolVersion, String reason)
- String getReason()
- **static** ProtocolVersionTooOldException received(Object sender, int protocolVersion, String reason)

### Class: dev.jorel.commandapi.exceptions.SpigotNotFoundException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- SpigotNotFoundException(Class<*> c)

No public methods found

### Class: dev.jorel.commandapi.exceptions.UnimplementedArgumentException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- UnimplementedArgumentException(String type, String versionSupportedIn)

No public methods found

### Class: dev.jorel.commandapi.exceptions.UnknownArgumentException
Type: Class
Extends: java.lang.Exception

Constructors:
- UnknownArgumentException(String argument)

No public methods found

### Class: dev.jorel.commandapi.exceptions.UnsupportedVersionException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- UnsupportedVersionException(String version)

No public methods found

### Class: dev.jorel.commandapi.exceptions.WrapperCommandSyntaxException
Type: Class
Extends: java.lang.Exception

Constructors:
- WrapperCommandSyntaxException(CommandSyntaxException exception)

Methods:
- int getCursor()
- void setStackTrace(StackTraceElement[] stackTrace)
- void printStackTrace()
- void printStackTrace(PrintStream s)
- void printStackTrace(PrintWriter s)
- StackTraceElement[] getStackTrace()
- CommandSyntaxException getException()
- CommandExceptionType getType()
- String getLocalizedMessage()
- Message getRawMessage()
- Throwable initCause(Throwable cause)
- String getMessage()
- String getInput()
- String getContext()
- Throwable getCause()

## Package: dev.jorel.commandapi.executors

### Class: dev.jorel.commandapi.executors.CommandBlockCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(BlockCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<BlockCommandSender, BukkitBlockCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.CommandBlockExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<BlockCommandSender, BukkitBlockCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.CommandBlockResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(BlockCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<BlockCommandSender, BukkitBlockCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.CommandBlockResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<BlockCommandSender, BukkitBlockCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.CommandExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<CommandSender, BukkitCommandSender<CommandSender>>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.CommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(CommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<CommandSender, BukkitCommandSender<CommandSender>> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(ConsoleCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<ConsoleCommandSender, BukkitConsoleCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<ConsoleCommandSender, BukkitConsoleCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(ConsoleCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<ConsoleCommandSender, BukkitConsoleCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<ConsoleCommandSender, BukkitConsoleCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.EntityCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(Entity, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<Entity, BukkitEntity> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.EntityExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<Entity, BukkitEntity>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.EntityResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(Entity, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<Entity, BukkitEntity> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.EntityResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<Entity, BukkitEntity>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ExecutionInfo
Type: Interface

Methods:
- CommandArguments args()
- TWrapperType senderWrapper()
- TSender sender()

### Class: dev.jorel.commandapi.executors.FeedbackForwardingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(CommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<CommandSender, BukkitFeedbackForwardingCommandSender<CommandSender>> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.FeedbackForwardingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<CommandSender, BukkitFeedbackForwardingCommandSender<CommandSender>>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.FeedbackForwardingResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(CommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<CommandSender, BukkitFeedbackForwardingCommandSender<CommandSender>> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.FeedbackForwardingResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<CommandSender, BukkitFeedbackForwardingCommandSender<CommandSender>>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.NativeCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(NativeProxyCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.NativeExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.NativeResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(NativeProxyCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.NativeResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.NormalExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.TypedExecutor

Methods:
- I executeWith(ExecutionInfo<TCommandSender, TWrapperType> info) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<TCommandSender, TWrapperType>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(Player, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<Player, BukkitPlayer> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<Player, BukkitPlayer>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(Player, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<Player, BukkitPlayer> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<Player, BukkitPlayer>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ProxyCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(NativeProxyCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ProxyExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ProxyResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(NativeProxyCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ProxyResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<NativeProxyCommandSender, BukkitNativeProxyCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.RemoteConsoleCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(RemoteConsoleCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<RemoteConsoleCommandSender, BukkitRemoteConsoleCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.RemoteConsoleExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<RemoteConsoleCommandSender, BukkitRemoteConsoleCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.RemoteConsoleResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(RemoteConsoleCommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<RemoteConsoleCommandSender, BukkitRemoteConsoleCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.RemoteConsoleResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<RemoteConsoleCommandSender, BukkitRemoteConsoleCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ResultingCommandExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<CommandSender, BukkitCommandSender<CommandSender>>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(CommandSender, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<CommandSender, BukkitCommandSender<CommandSender>> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ResultingExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.TypedExecutor

Methods:
- I executeWith(ExecutionInfo<TCommandSender, TWrapperType> info) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<TCommandSender, TWrapperType>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.TypedExecutor
Type: Interface

Methods:
- I executeWith(ExecutionInfo<TCommandSender, TWrapperType>) throws WrapperCommandSyntaxException
- ExecutorType getType()

### Class: dev.jorel.commandapi.executors.BukkitExecutionInfo
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.executors.ExecutionInfo

Constructors:
- BukkitExecutionInfo(T sender, short senderWrapper, e args)

Methods:
- CommandArguments args()
- BukkitCommandSender<+TSender> senderWrapper()
- AbstractCommandSender senderWrapper()
- TSender sender()
- int hashCode()
- boolean equals(Object o)
- String toString()

### Class: dev.jorel.commandapi.executors.CommandArguments
Type: Class
Extends: java.lang.Record

Constructors:
- CommandArguments(Object args, Map<String, Object> argsMap, String rawArgs, Map<String, String> rawArgsMap, String fullInput)

Methods:
- TT getByArgumentOrDefault(AbstractArgument<TT, ***> argumentType, T defaultValue)
- TT getByClassOrDefault(String nodeName, Class<TT> argumentType, T defaultValue)
- TT getByClassOrDefault(int index, Class<TT> argumentType, T defaultValue)
- Optional<TT> getOptionalByArgument(AbstractArgument<TT, ***> argumentType)
- Object getOrDefault(int index, Object defaultValue)
- Object getOrDefault(String nodeName, Object defaultValue)
- Object getOrDefault(int index, Supplier<*> defaultValue)
- Object getOrDefault(String nodeName, Supplier<*> defaultValue)
- TT getOrDefaultUnchecked(int index, T defaultValue)
- TT getOrDefaultUnchecked(String nodeName, T defaultValue)
- TT getOrDefaultUnchecked(int index, Supplier<TT> defaultValue)
- TT getOrDefaultUnchecked(String nodeName, Supplier<TT> defaultValue)
- Optional<String> getRawOptional(int index)
- Optional<String> getRawOptional(String nodeName)
- TT getByClass(String nodeName, Class<TT> argumentType)
- TT getByClass(int index, Class<TT> argumentType)
- int count()
- String fullInput()
- Optional<TT> getOptionalUnchecked(int index)
- Optional<TT> getOptionalUnchecked(String nodeName)
- TT getUnchecked(int index)
- TT getUnchecked(String nodeName)
- Optional<TT> getOptionalByClass(String nodeName, Class<TT> argumentType)
- Optional<TT> getOptionalByClass(int index, Class<TT> argumentType)
- Object[] args()
- Optional<Object> getOptional(int index)
- Optional<Object> getOptional(String nodeName)
- String getOrDefaultRaw(int index, String defaultValue)
- String getOrDefaultRaw(String nodeName, String defaultValue)
- String getOrDefaultRaw(int index, Supplier<String> defaultValue)
- String getOrDefaultRaw(String nodeName, Supplier<String> defaultValue)
- int hashCode()
- boolean equals(Object obj)
- Object get(int index)
- Object get(String nodeName)
- String toString()
- TT getByArgument(AbstractArgument<TT, ***> argumentType)
- String getRaw(int index)
- String getRaw(String nodeName)
- Map<String, Object> argsMap()
- Map<String, String> rawArgsMap()
- String[] rawArgs()

### Class: dev.jorel.commandapi.executors.ExecutorType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PLAYER
- ENTITY
- CONSOLE
- BLOCK
- ALL
- PROXY
- NATIVE
- REMOTE
- FEEDBACK_FORWARDING

Methods:
- **static** ExecutorType valueOf(String name)
- **static** ExecutorType[] values()

## Package: dev.jorel.commandapi.network

### Class: dev.jorel.commandapi.network.CommandAPIPacket
Type: Interface

Methods:
- void write(FriendlyByteBuffer, Object, int) throws ProtocolVersionTooOldException

### Class: dev.jorel.commandapi.network.CommandAPIPacketHandler
Type: Interface

Methods:
- V handlePacket(T, int)

### Class: dev.jorel.commandapi.network.CommandAPIPacketHandlerProvider
Type: Interface

Methods:
- CommandAPIPacketHandler<TInputChannel> getHandlerForProtocol(CommandAPIProtocol protocol)
- HandshakePacketHandler<TInputChannel> getHandshakePacketHandler()
- PlayPacketHandler<TInputChannel> getPlayPacketHandler()

### Class: dev.jorel.commandapi.network.HandshakePacketHandler
Type: Interface
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandler

Methods:
- V handleProtocolVersionTooOldPacket(T sender, int packet)
- V handleSetVersionPacket(T, int)
- V handlePacket(T sender, int packet)

### Class: dev.jorel.commandapi.network.PlayPacketHandler
Type: Interface
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandler

Methods:
- V handleUpdateRequirementsPacket(T, int)
- V handlePacket(T sender, int packet)

### Class: dev.jorel.commandapi.network.BukkitCommandAPIMessenger
Type: Class
Extends: dev.jorel.commandapi.network.CommandAPIMessenger
Implements: org.bukkit.plugin.messaging.PluginMessageListener, org.bukkit.event.Listener

Constructors:
- BukkitCommandAPIMessenger(JavaPlugin plugin)

Methods:
- void sendRawBytes(CommandAPIProtocol protocol, Player target, byte[] bytes)
- void sendRawBytes(CommandAPIProtocol, Object, byte[])
- void onPluginMessageReceived(String channel, Player player, byte[] message)
- void onPlayerRegisterChannel(PlayerRegisterChannelEvent event)
- void onPlayerLeave(PlayerQuitEvent event)
- int getConnectionProtocolVersion(Player target)
- int getConnectionProtocolVersion(Object)
- void setProtocolVersion(Player sender, int protocolVersion)
- void close()

### Class: dev.jorel.commandapi.network.BukkitHandshakePacketHandler
Type: Class
Implements: dev.jorel.commandapi.network.HandshakePacketHandler

Methods:
- void handleSetVersionPacket(Player sender, SetVersionPacket packet)
- void handleSetVersionPacket(Object, SetVersionPacket)

### Class: dev.jorel.commandapi.network.BukkitPacketHandlerProvider
Type: Class
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandlerProvider

Methods:
- BukkitHandshakePacketHandler getHandshakePacketHandler()
- HandshakePacketHandler getHandshakePacketHandler()
- BukkitPlayPacketHandler getPlayPacketHandler()
- PlayPacketHandler getPlayPacketHandler()

### Class: dev.jorel.commandapi.network.BukkitPlayPacketHandler
Type: Class
Implements: dev.jorel.commandapi.network.PlayPacketHandler

Methods:
- void handleUpdateRequirementsPacket(Player sender, UpdateRequirementsPacket packet)
- void handleUpdateRequirementsPacket(Object, UpdateRequirementsPacket)

### Class: dev.jorel.commandapi.network.CommandAPIMessenger
Type: Abstract Class

Methods:
- V sendPacket(T target, O packet)
- I getConnectionProtocolVersion(T)
- void close()

### Class: dev.jorel.commandapi.network.CommandAPIProtocol
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- HANDSHAKE
- PLAY

Methods:
- String getChannelIdentifier()
- **static** CommandAPIProtocol valueOf(String name)
- **static** CommandAPIProtocol[] values()
- I getId(Class<CommandAPIPacket> clazz)
- **static** CommandAPIProtocol getProtocolForChannel(String channelIdentifier)
- Set<Class<CommandAPIPacket>> getAllPacketTypes()
- CommandAPIPacket createPacket(int id, FriendlyByteBuffer buffer)
- **static** CommandAPIProtocol getProtocolForPacket(Class<CommandAPIPacket> clazz)
- **static** Set<String> getAllChannelIdentifiers()

### Class: dev.jorel.commandapi.network.FriendlyByteBuffer
Type: Class

Constructors:
- FriendlyByteBuffer(byte[] bytes)

Methods:
- void writeInt(int i) throws IllegalStateException
- void writeByte(byte b) throws IllegalStateException
- void writeByte(int i) throws IllegalStateException
- void checkWriteIndexIsInBounds() throws IllegalStateException
- void checkWriteIndexIsInBounds(int writeIndex) throws IllegalStateException
- boolean isReadIndexOutOfBounds()
- boolean isReadIndexOutOfBounds(int readIndex)
- String readString(int maxLength) throws IllegalStateException
- byte[] getRemainingBytes() throws IllegalStateException
- void setReadIndex(int index) throws IllegalStateException
- int getReadIndex()
- void resetIndices()
- void writeBytes(byte[] bytes) throws IllegalStateException
- int countReadableBytes()
- void setWriteIndex(int index) throws IllegalStateException
- int getWriteIndex()
- byte[] toByteArray() throws IllegalStateException
- void writeVarInt(int value) throws IllegalStateException
- byte[] readBytes(int n) throws IllegalStateException
- int countTotalBytes()
- void checkReadIndexIsInBounds() throws IllegalStateException
- void checkReadIndexIsInBounds(int readIndex) throws IllegalStateException
- int readInt() throws IllegalStateException
- byte readByte() throws IllegalStateException
- void writeString(String string, int maxLength)
- boolean isWriteIndexOutOfBounds()
- boolean isWriteIndexOutOfBounds(int writeIndex)
- int readVarInt() throws IllegalStateException

## Package: dev.jorel.commandapi.network.packets

### Class: dev.jorel.commandapi.network.packets.ProtocolVersionTooOldPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Constructors:
- ProtocolVersionTooOldPacket(int protocolVersion, String reason)

Methods:
- String reason()
- int hashCode()
- boolean equals(Object o)
- int protocolVersion()
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion)
- **static** ProtocolVersionTooOldPacket deserialize(FriendlyByteBuffer buffer)

### Class: dev.jorel.commandapi.network.packets.SetVersionPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Constructors:
- SetVersionPacket(int protocolVersion)

Methods:
- int hashCode()
- boolean equals(Object o)
- int protocolVersion()
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion)
- **static** SetVersionPacket deserialize(FriendlyByteBuffer buffer)

### Class: dev.jorel.commandapi.network.packets.UpdateRequirementsPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Methods:
- int hashCode()
- boolean equals(Object o)
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion) throws ProtocolVersionTooOldException
- **static** UpdateRequirementsPacket deserialize(FriendlyByteBuffer ignored)

## Package: dev.jorel.commandapi.nms

### Class: dev.jorel.commandapi.nms.NMS
Type: Interface

Methods:
- Advancement getAdvancement(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- Set<NamespacedKey> getTags()
- String convert(ItemStack)
- String convert(ParticleData<*>)
- String convert(PotionEffectType)
- String convert(Sound)
- NamespacedKey getMinecraftKey(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentPosition2D()
- Predicate<ItemStack> getItemStackPredicate(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- String[] compatibleVersions()
- Location getLocationBlock(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- String getObjectiveCriteria(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentRotation()
- UUID getUUID(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentAngle()
- Enchantment getEnchantment(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- World getDimension(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentNBTCompound()
- V createDispatcherFile(File, CommandDispatcher<TCommandListenerWrapper>) throws IOException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentVec3(boolean)
- ArgumentType<*> _ArgumentVec2(boolean)
- ArgumentType<*> _ArgumentScoreboardObjective()
- Objective getObjective(CommandContext<TCommandListenerWrapper>, String) throws IllegalArgumentException, CommandSyntaxException
- Predicate<Block> getBlockPredicate(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentItemStack()
- ArgumentType<*> _ArgumentChatFormat()
- ArgumentType<*> _ArgumentAxis()
- ArgumentType<*> _ArgumentUUID()
- ArgumentType<*> _ArgumentBlockState()
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentScoreboardTeam()
- TT getMinecraftServer()
- F getAngle(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender, CommandSender, Location, World)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<TCommandListenerWrapper>, String)
- IntegerRange getIntRange(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentPosition()
- ArgumentType<*> _ArgumentAdvancement()
- I getTime(CommandContext<TCommandListenerWrapper>, String)
- String getScoreHolderSingle(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentMathOperation()
- ParticleData<*> getParticle(CommandContext<TCommandListenerWrapper>, String)
- Object getNBTCompound(CommandContext<TCommandListenerWrapper>, String, Function<Object, TNBTContainer>)
- Location2D getLocation2DBlock(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- TCommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender>)
- Location getLocationPrecise(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntity(ArgumentSubType)
- LootTable getLootTable(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentScoreboardSlot()
- ArgumentType<*> _ArgumentItemPredicate()
- Team getTeam(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<TCommandListenerWrapper>, String)
- TT getRecipe(CommandContext<TCommandListenerWrapper>, String, BiFunction<NamespacedKey, Recipe, TT>) throws CommandSyntaxException
- ArgumentType<*> _ArgumentProfile()
- ItemStack getItemStack(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- Message generateMessageFromJson(String)
- RegistryParser<Biome> getBiome(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- World getWorldForCSS(T)
- HelpTopic generateHelpTopic(String, String, String, String)
- ArgumentType<*> _ArgumentMobEffect()
- ArgumentType<*> _ArgumentChat()
- FunctionWrapper getFunction(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- BukkitCommandSender<CommandSender> getCommandSenderFromCommandSource(T)
- EntityType getEntityType(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<TCommandListenerWrapper>, String)
- ArgumentType<*> _ArgumentScoreboardCriteria()
- ArgumentType<*> _ArgumentParticle()
- EnumSet<Axis> getAxis(CommandContext<TCommandListenerWrapper>, String)
- SimpleFunctionWrapper[] getTag(NamespacedKey)
- SuggestionProvider<TCommandListenerWrapper> getSuggestionProvider(SuggestionProviders)
- ArgumentType<*> _ArgumentBlockPredicate()
- ArgumentType<*> _ArgumentFloatRange()
- Map<String, HelpTopic> getHelpMap()
- ArgumentType<*> _ArgumentIntRange()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<TCommandListenerWrapper>, boolean)
- ArgumentType<*> _ArgumentTime()
- ArgumentType<*> _ArgumentRecipe()
- MathOperation getMathOperation(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEnchantment()
- ArgumentType<*> _ArgumentTag()
- ArgumentType<*> _ArgumentScoreholder(ArgumentSubType)
- ArgumentType<*> _ArgumentDimension()
- RegistryParser<Sound> getSound(CommandContext<TCommandListenerWrapper>, String)

### Class: dev.jorel.commandapi.nms.SpigotNMS
Type: Interface

Methods:
- BaseComponent getChat(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<TCommandListenerWrapper>, String)
- List<PlayerProfile> getProfile(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<TCommandListenerWrapper>, String) throws CommandSyntaxException
- NMS<TCommandListenerWrapper> bukkitNMS()
- boolean isNullCommandSender(CommandSender sender)

### Class: dev.jorel.commandapi.nms.NMS_1_20_R1
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Methods:
- Advancement getAdvancement(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Team getTeam(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandListenerWrapper> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandListenerWrapper css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandListenerWrapper> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandListenerWrapper> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(MinecraftKey key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandListenerWrapper> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandListenerWrapper> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_20_R2
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Methods:
- Advancement getAdvancement(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Team getTeam(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandListenerWrapper> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandListenerWrapper css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandListenerWrapper> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandListenerWrapper> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(MinecraftKey key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandListenerWrapper> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandListenerWrapper> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_20_R3
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Methods:
- Advancement getAdvancement(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Team getTeam(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandListenerWrapper> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandListenerWrapper css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandListenerWrapper> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandListenerWrapper> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(MinecraftKey key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandListenerWrapper> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandListenerWrapper> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_20_R4
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_20_R4(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Team getTeam(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandListenerWrapper> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandListenerWrapper css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandListenerWrapper> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandListenerWrapper> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(MinecraftKey key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandListenerWrapper> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandListenerWrapper> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R1
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R1(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Team getTeam(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandListenerWrapper> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandListenerWrapper css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandListenerWrapper> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandListenerWrapper> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(MinecraftKey key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandListenerWrapper> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandListenerWrapper> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R2
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R2(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Team getTeam(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandListenerWrapper> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandListenerWrapper css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandListenerWrapper> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandListenerWrapper> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(MinecraftKey key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandListenerWrapper> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandListenerWrapper> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R3
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R3(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Team getTeam(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandListenerWrapper> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandListenerWrapper css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandListenerWrapper> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandListenerWrapper> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(MinecraftKey key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandListenerWrapper> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandListenerWrapper> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R4
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R4(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Team getTeam(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandListenerWrapper> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandListenerWrapper css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandListenerWrapper> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandListenerWrapper> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(MinecraftKey key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandListenerWrapper> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandListenerWrapper> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R5
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R5(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Team getTeam(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandListenerWrapper> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandListenerWrapper css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandListenerWrapper> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandListenerWrapper> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(MinecraftKey key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandListenerWrapper> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandListenerWrapper> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R6
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R6(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Team getTeam(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandListenerWrapper> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandListenerWrapper css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandListenerWrapper> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandListenerWrapper> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(MinecraftKey key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandListenerWrapper> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandListenerWrapper> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_1_21_R7
Type: Class
Extends: dev.jorel.commandapi.nms.NMS_Common

Constructors:
- NMS_1_21_R7(Supplier<CommandBuildContext> commandBuildContext)

Methods:
- Advancement getAdvancement(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleCommandMap getSimpleCommandMap()
- Location2D getLocation2DPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntitySummon()
- Rotation getRotation(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Set<NamespacedKey> getTags()
- String convert(ItemStack is)
- String convert(ParticleData<*> particle)
- NamespacedKey getMinecraftKey(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Predicate<ItemStack> getItemStackPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String[] compatibleVersions()
- Enchantment getEnchantment(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getDimension(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- void reloadDataPacks()
- DoubleRange getDoubleRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Objective getObjective(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- RegistryParser<PotionEffectType> getPotionEffect(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getMinecraftServer()
- NativeProxyCommandSender createNativeProxyCommandSender(CommandSender caller, CommandSender callee, Location location, World world)
- ArgumentType<*> _ArgumentSyntheticBiome()
- BlockState getBlockState(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- IntegerRange getIntRange(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAdvancement()
- String getScoreHolderSingle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ParticleData<*> getParticle(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandListenerWrapper getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSender> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- LootTable getLootTable(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- Team getTeam(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Collection<String> getScoreHolderMultiple(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ScoreboardSlot getScoreboardSlot(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- TT getRecipe(CommandContext<CommandListenerWrapper> cmdCtx, String key, BiFunction<NamespacedKey, Recipe, TT> result) throws CommandSyntaxException
- ItemStack getItemStack(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Message generateMessageFromJson(String json)
- RegistryParser<Biome> getBiome(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- World getWorldForCSS(CommandListenerWrapper css)
- World getWorldForCSS(Object)
- HelpTopic generateHelpTopic(String commandName, String shortDescription, String fullDescription, String permission)
- ArgumentType<*> _ArgumentMobEffect()
- FunctionWrapper getFunction(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- SimpleFunctionWrapper getFunction(NamespacedKey key)
- ArgumentType<*> _ArgumentMinecraftKeyRegistered()
- ArgumentType<*> _ArgumentChatComponent()
- Set<NamespacedKey> getFunctions()
- EntitySelectorParser getEntitySelector(CommandContext<CommandListenerWrapper> cmdCtx, String str)
- SimpleFunctionWrapper[] getTag(NamespacedKey key)
- SuggestionProvider<CommandListenerWrapper> getSuggestionProvider(SuggestionProviders provider)
- NamespacedKey fromResourceLocation(MinecraftKey key)
- Map<String, HelpTopic> getHelpMap()
- BukkitCommandSender<CommandSender> getSenderForCommand(CommandContext<CommandListenerWrapper> cmdCtx, boolean isNative)
- ArgumentType<*> _ArgumentRecipe()
- ArgumentType<*> _ArgumentEnchantment()
- RegistryParser<Sound> getSound(CommandContext<CommandListenerWrapper> cmdCtx, String key)

### Class: dev.jorel.commandapi.nms.NMS_Common
Type: Abstract Class
Implements: dev.jorel.commandapi.nms.NMS

Methods:
- ArgumentType<*> _ArgumentPosition()
- I getTime(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentMathOperation()
- Object getNBTCompound(CommandContext<CommandListenerWrapper> cmdCtx, String key, Function<Object, TNBTContainer> nbtContainerConstructor)
- Location2D getLocation2DBlock(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- String convert(PotionEffectType potion)
- String convert(Sound sound)
- ArgumentType<*> _ArgumentPosition2D()
- Location getLocationPrecise(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- Location getLocationBlock(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentEntity(ArgumentSubType subType)
- String getObjectiveCriteria(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentScoreboardSlot()
- ArgumentType<*> _ArgumentRotation()
- UUID getUUID(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentAngle()
- ArgumentType<*> _ArgumentItemPredicate()
- ArgumentType<*> _ArgumentProfile()
- ArgumentType<*> _ArgumentNBTCompound()
- V createDispatcherFile(File file, CommandDispatcher<CommandListenerWrapper> dispatcher) throws IOException
- ArgumentType<*> _ArgumentVec3(boolean centerPosition)
- ArgumentType<*> _ArgumentVec2(boolean centerPosition)
- ArgumentType<*> _ArgumentScoreboardObjective()
- ArgumentType<*> _ArgumentChat()
- EntityType getEntityType(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BukkitCommandSender<CommandSender> getCommandSenderFromCommandSource(CommandListenerWrapper css)
- BukkitCommandSender getCommandSenderFromCommandSource(Object)
- Predicate<Block> getBlockPredicate(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentScoreboardCriteria()
- ArgumentType<*> _ArgumentParticle()
- EnumSet<Axis> getAxis(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- ArgumentType<*> _ArgumentItemStack()
- ArgumentType<*> _ArgumentChatFormat()
- ArgumentType<*> _ArgumentAxis()
- ArgumentType<*> _ArgumentUUID()
- ArgumentType<*> _ArgumentBlockPredicate()
- ArgumentType<*> _ArgumentBlockState()
- ArgumentType<*> _ArgumentFloatRange()
- ArgumentType<*> _ArgumentIntRange()
- ArgumentType<*> _ArgumentScoreboardTeam()
- ArgumentType<*> _ArgumentTime()
- MathOperation getMathOperation(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- F getAngle(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ArgumentType<*> _ArgumentTag()
- ArgumentType<*> _ArgumentScoreholder(ArgumentSubType subType)
- ArgumentType<*> _ArgumentDimension()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_20_R1
Type: Class
Extends: org.bukkit.craftbukkit.v1_20_R1.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_20_R1(CommandListenerWrapper world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_20_R2
Type: Class
Extends: org.bukkit.craftbukkit.v1_20_R2.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_20_R2(CommandListenerWrapper world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_20_R3
Type: Class
Extends: org.bukkit.craftbukkit.v1_20_R3.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_20_R3(CommandListenerWrapper world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_20_R4
Type: Class
Extends: org.bukkit.craftbukkit.v1_20_R4.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_20_R4(CommandListenerWrapper world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R1
Type: Class
Extends: org.bukkit.craftbukkit.v1_21_R1.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R1(CommandListenerWrapper world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R2
Type: Class
Extends: org.bukkit.craftbukkit.v1_21_R2.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R2(CommandListenerWrapper world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R3
Type: Class
Extends: org.bukkit.craftbukkit.v1_21_R3.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R3(CommandListenerWrapper world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R4
Type: Class
Extends: org.bukkit.craftbukkit.v1_21_R4.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R4(CommandListenerWrapper world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R5
Type: Class
Extends: org.bukkit.craftbukkit.v1_21_R5.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R5(CommandListenerWrapper world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R6
Type: Class
Extends: org.bukkit.craftbukkit.v1_21_R6.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R6(CommandListenerWrapper world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.NativeProxyCommandSender_1_21_R7
Type: Class
Extends: org.bukkit.craftbukkit.v1_21_R7.command.ProxiedNativeCommandSender
Implements: dev.jorel.commandapi.wrappers.NativeProxyCommandSender

Constructors:
- NativeProxyCommandSender_1_21_R7(CommandListenerWrapper world, CommandSender caller, CommandSender callee)

Methods:
- World getWorld()
- Location getLocation()

### Class: dev.jorel.commandapi.nms.SpigotNMS_1_20_R1
Type: Class
Extends: dev.jorel.commandapi.CommandAPISpigot

Constructors:
- SpigotNMS_1_20_R1(InternalSpigotConfig config)

Methods:
- BaseComponent getChat(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- List<PlayerProfile> getProfile(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandRegistrationStrategy<CommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<CommandListenerWrapper> bukkitNMS()

### Class: dev.jorel.commandapi.nms.SpigotNMS_1_20_R2
Type: Class
Extends: dev.jorel.commandapi.CommandAPISpigot

Constructors:
- SpigotNMS_1_20_R2(InternalSpigotConfig config)

Methods:
- BaseComponent getChat(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- List<PlayerProfile> getProfile(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandRegistrationStrategy<CommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<CommandListenerWrapper> bukkitNMS()

### Class: dev.jorel.commandapi.nms.SpigotNMS_1_20_R3
Type: Class
Extends: dev.jorel.commandapi.CommandAPISpigot

Constructors:
- SpigotNMS_1_20_R3(InternalSpigotConfig config)

Methods:
- BaseComponent getChat(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- List<PlayerProfile> getProfile(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandRegistrationStrategy<CommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<CommandListenerWrapper> bukkitNMS()

### Class: dev.jorel.commandapi.nms.SpigotNMS_1_20_R4
Type: Class
Extends: dev.jorel.commandapi.CommandAPISpigot

Constructors:
- SpigotNMS_1_20_R4(InternalSpigotConfig config)

Methods:
- BaseComponent getChat(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- List<PlayerProfile> getProfile(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandRegistrationStrategy<CommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<CommandListenerWrapper> bukkitNMS()

### Class: dev.jorel.commandapi.nms.SpigotNMS_1_21_R1
Type: Class
Extends: dev.jorel.commandapi.CommandAPISpigot

Constructors:
- SpigotNMS_1_21_R1(InternalSpigotConfig config)

Methods:
- BaseComponent getChat(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- List<PlayerProfile> getProfile(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandRegistrationStrategy<CommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<CommandListenerWrapper> bukkitNMS()

### Class: dev.jorel.commandapi.nms.SpigotNMS_1_21_R2
Type: Class
Extends: dev.jorel.commandapi.CommandAPISpigot

Constructors:
- SpigotNMS_1_21_R2(InternalSpigotConfig config)

Methods:
- BaseComponent getChat(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- List<PlayerProfile> getProfile(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandRegistrationStrategy<CommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<CommandListenerWrapper> bukkitNMS()

### Class: dev.jorel.commandapi.nms.SpigotNMS_1_21_R3
Type: Class
Extends: dev.jorel.commandapi.CommandAPISpigot

Constructors:
- SpigotNMS_1_21_R3(InternalSpigotConfig config)

Methods:
- BaseComponent getChat(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- List<PlayerProfile> getProfile(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- CommandRegistrationStrategy<CommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<CommandListenerWrapper> bukkitNMS()

### Class: dev.jorel.commandapi.nms.SpigotNMS_1_21_R4
Type: Class
Extends: dev.jorel.commandapi.CommandAPISpigot

Constructors:
- SpigotNMS_1_21_R4(InternalSpigotConfig config)

Methods:
- BaseComponent getChat(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- List<PlayerProfile> getProfile(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- CommandRegistrationStrategy<CommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<CommandListenerWrapper> bukkitNMS()

### Class: dev.jorel.commandapi.nms.SpigotNMS_1_21_R5
Type: Class
Extends: dev.jorel.commandapi.CommandAPISpigot

Constructors:
- SpigotNMS_1_21_R5(InternalSpigotConfig config)

Methods:
- BaseComponent getChat(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- List<PlayerProfile> getProfile(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- CommandRegistrationStrategy<CommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<CommandListenerWrapper> bukkitNMS()

### Class: dev.jorel.commandapi.nms.SpigotNMS_1_21_R6
Type: Class
Extends: dev.jorel.commandapi.CommandAPISpigot

Constructors:
- SpigotNMS_1_21_R6(InternalSpigotConfig config)

Methods:
- BaseComponent getChat(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- List<PlayerProfile> getProfile(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- CommandRegistrationStrategy<CommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<CommandListenerWrapper> bukkitNMS()

### Class: dev.jorel.commandapi.nms.SpigotNMS_1_21_R7
Type: Class
Extends: dev.jorel.commandapi.CommandAPISpigot

Constructors:
- SpigotNMS_1_21_R7(InternalSpigotConfig config)

Methods:
- BaseComponent getChat(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- ChatColor getChatColor(CommandContext<CommandListenerWrapper> cmdCtx, String key)
- List<PlayerProfile> getProfile(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- BaseComponent getChatComponent(CommandContext<CommandListenerWrapper> cmdCtx, String key) throws CommandSyntaxException
- CommandRegistrationStrategy<CommandListenerWrapper> createCommandRegistrationStrategy()
- NMS<CommandListenerWrapper> bukkitNMS()
- boolean isNullCommandSender(CommandSender sender)

## Package: dev.jorel.commandapi.wrappers

### Class: dev.jorel.commandapi.wrappers.NativeProxyCommandSender
Type: Interface
Implements: org.bukkit.command.ProxiedCommandSender

Methods:
- World getWorld()
- Location getLocation()
- **static** NativeProxyCommandSender from(CommandSender caller, CommandSender callee, Location location, World world)

### Class: dev.jorel.commandapi.wrappers.CommandResult
Type: Class
Extends: java.lang.Record

Constructors:
- CommandResult(Command command, String[] args)

Methods:
- String[] args()
- int hashCode()
- boolean equals(Object o)
- String toString()
- boolean execute(CommandSender sender)
- Command command()

### Class: dev.jorel.commandapi.wrappers.ComplexRecipeImpl
Type: Class
Extends: java.lang.Record
Implements: org.bukkit.inventory.ComplexRecipe

Constructors:
- ComplexRecipeImpl(NamespacedKey key, Recipe recipe)

Methods:
- NamespacedKey getKey()
- int hashCode()
- boolean equals(Object o)
- ItemStack getResult()
- Recipe recipe()
- String toString()
- NamespacedKey key()

### Class: dev.jorel.commandapi.wrappers.DoubleRange
Type: Class

Constructors:
- DoubleRange(double low, double high)

Methods:
- **static** DoubleRange doubleRangeGreaterThanOrEq(double min)
- int hashCode()
- boolean equals(Object obj)
- **static** DoubleRange doubleRangeLessThanOrEq(double max)
- String toString()
- boolean isInRange(double f)
- double getUpperBound()
- double getLowerBound()

### Class: dev.jorel.commandapi.wrappers.FunctionWrapper
Type: Class
Extends: dev.jorel.commandapi.wrappers.SimpleFunctionWrapper

Constructors:
- FunctionWrapper(NamespacedKey minecraftKey, ToIntFunction invoker, Object commandListenerWrapper, Function<Entity, Object> mapper, String internalCommands)

Methods:
- int runAs(Entity e)
- **static** FunctionWrapper fromSimpleFunctionWrapper(SimpleFunctionWrapper wrapper, Object commandListenerWrapper, Function<Entity, Object> mapper)
- int run()

### Class: dev.jorel.commandapi.wrappers.IntegerRange
Type: Class

Constructors:
- IntegerRange(int low, int high)

Methods:
- **static** IntegerRange integerRangeGreaterThanOrEq(int min)
- **static** IntegerRange integerRangeLessThanOrEq(int max)
- int hashCode()
- boolean equals(Object obj)
- String toString()
- boolean isInRange(int i)
- int getUpperBound()
- int getLowerBound()

### Class: dev.jorel.commandapi.wrappers.Location2D
Type: Class
Extends: org.bukkit.Location

Constructors:
- Location2D(World world, double x, double y, double z, float yaw, float pitch)
- Location2D(World world, double x, double y, double z)
- Location2D(World world, double x, double z)

Methods:
- void setY(double y)
- double getY()
- int getBlockY()

### Class: dev.jorel.commandapi.wrappers.MathOperation
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ADD
- ASSIGN
- DIVIDE
- MAX
- MIN
- MOD
- MULTIPLY
- SUBTRACT
- SWAP

Methods:
- int apply(int val1, int val2)
- float apply(float val1, float val2)
- **static** MathOperation valueOf(String name)
- **static** MathOperation[] values()
- String toString()
- **static** MathOperation fromString(String input)

### Class: dev.jorel.commandapi.wrappers.ParticleData
Type: Class
Extends: java.lang.Record

Constructors:
- ParticleData(Particle particle, T data)

Methods:
- TT data()
- int hashCode()
- boolean equals(Object o)
- Particle particle()
- String toString()

### Class: dev.jorel.commandapi.wrappers.Rotation
Type: Class

Constructors:
- Rotation(float yaw, float pitch)

Methods:
- float getYaw()
- float getPitch()
- float getNormalizedPitch()
- int hashCode()
- boolean equals(Object obj)
- String toString()
- float getNormalizedYaw()

### Class: dev.jorel.commandapi.wrappers.ScoreboardSlot
Type: Enum
Extends: java.lang.Enum
Implements: org.bukkit.Keyed

Enum Constants:
- PLAYER_LIST
- SIDEBAR
- LEGACY_BELOW_NAME
- BELOW_NAME
- SIDEBAR_TEAM_BLACK
- SIDEBAR_TEAM_DARK_BLUE
- SIDEBAR_TEAM_DARK_GREEN
- SIDEBAR_TEAM_DARK_AQUA
- SIDEBAR_TEAM_DARK_RED
- SIDEBAR_TEAM_DARK_PURPLE
- SIDEBAR_TEAM_GOLD
- SIDEBAR_TEAM_GRAY
- SIDEBAR_TEAM_DARK_GRAY
- SIDEBAR_TEAM_BLUE
- SIDEBAR_TEAM_GREEN
- SIDEBAR_TEAM_AQUA
- SIDEBAR_TEAM_RED
- SIDEBAR_TEAM_LIGHT_PURPLE
- SIDEBAR_TEAM_YELLOW
- SIDEBAR_TEAM_WHITE

Methods:
- boolean hasTeamColor()
- NamespacedKey getKey()
- **static** ScoreboardSlot valueOf(String name)
- ChatColor getTeamColor()
- **static** ScoreboardSlot ofTeamColor(ChatColor color)
- **static** ScoreboardSlot of(DisplaySlot slot)
- **static** ScoreboardSlot[] values()
- String toString()
- **static** ScoreboardSlot ofMinecraft(int i)
- DisplaySlot getDisplaySlot()

### Class: dev.jorel.commandapi.wrappers.SimpleFunctionWrapper
Type: Class
Implements: org.bukkit.Keyed

Constructors:
- SimpleFunctionWrapper(NamespacedKey minecraftKey, ToIntFunction functionExecutor, String[] internalCommands)

Methods:
- NamespacedKey getKey()
- **static** SimpleFunctionWrapper getFunction(NamespacedKey key)
- **static** Set<NamespacedKey> getFunctions()
- int run(CommandSender sender)
- **static** Set<NamespacedKey> getTags()
- **static** SimpleFunctionWrapper[] getTag(NamespacedKey key)
- String[] getCommands()

### Class: dev.jorel.commandapi.wrappers.Time
Type: Class

Methods:
- **static** Time seconds(int seconds)
- **static** Time ticks(int ticks)
- int hashCode()
- boolean equals(Object obj)
- **static** Time days(int days)
- String toString()

# CommandAPI-11.1.0-Velocity API Reference

## Package: dev.jorel.commandapi

### Class: dev.jorel.commandapi.ChainableBuilder
Type: Interface

Methods:
- TImpl instance()

### Class: dev.jorel.commandapi.CommandAPILogger
Type: Interface

Methods:
- **static** CommandAPILogger silent()
- **static** CommandAPILogger fromApacheLog4jLogger(Logger logger)
- **static** CommandAPILogger bindToMethods(Consumer<String> info, Consumer<String> warning, Consumer<String> severe, BiConsumer<String, Throwable> severeException)
- **static** CommandAPILogger fromJavaLogger(Logger logger)
- void severe(String)
- void severe(String, Throwable)
- void warning(String)
- **static** CommandAPILogger fromSlf4jLogger(Logger logger)
- void info(String)

### Class: dev.jorel.commandapi.CommandAPIPlatform
Type: Interface

Methods:
- void registerPermission(String)
- CommandAPIMessenger<**> setupMessenger()
- AbstractCommandSender<+TCommandSender> wrapCommandSender(T)
- void unregister(String, boolean)
- AbstractCommandSender<+TCommandSender> getCommandSenderFromCommandSource(T)
- CommandAPILogger getLogger()
- V postCommandRegistration(RegisteredCommand, LiteralCommandNode<TSource>, List<LiteralCommandNode<TSource>>)
- void onEnable()
- void preCommandRegistration(String)
- SuggestionProvider<TSource> getSuggestionProvider(SuggestionProviders)
- TSource getBrigadierSourceFromCommandSender(AbstractCommandSender<+TCommandSender>)
- void onDisable()
- CommandDispatcher<TSource> getBrigadierDispatcher()
- LiteralCommandNode<TSource> registerCommandNode(LiteralArgumentBuilder<TSource>, String)
- TArgument newConcreteLiteralArgument(String, String)
- V updateRequirements(AbstractPlayer<*>)
- AbstractCommandSender<+TCommandSender> getSenderForCommand(CommandContext<TSource>, boolean)
- AbstractCommandAPICommand<*TArgument, TCommandSender> newConcreteCommandAPICommand(CommandMetaData<TCommandSender>)
- TArgument newConcreteMultiLiteralArgument(String, String)
- void onLoad()
- void reloadDataPacks()
- V createDispatcherFile(File, CommandDispatcher<TSource>) throws IOException

### Class: dev.jorel.commandapi.IStringTooltip
Type: Interface

Methods:
- Message getTooltip()
- String getSuggestion()

### Class: dev.jorel.commandapi.MojangMappedVersionHandler
Type: Interface

Methods:
- **static** boolean isMojangMapped()

### Class: dev.jorel.commandapi.PlatformExecutable
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- CommandAPIExecutor<TCommandSender, AbstractCommandSender<+TCommandSender>> getExecutor()

### Class: dev.jorel.commandapi.VelocityExecutable
Type: Interface
Implements: dev.jorel.commandapi.PlatformExecutable

Methods:
- TImpl executesPlayer(PlayerCommandExecutor executor)
- TImpl executesPlayer(PlayerExecutionInfo executor)
- TImpl executesPlayer(PlayerResultingCommandExecutor executor)
- TImpl executesPlayer(PlayerResultingExecutionInfo executor)
- TImpl executesConsole(ConsoleCommandExecutor executor)
- TImpl executesConsole(ConsoleExecutionInfo executor)
- TImpl executesConsole(ConsoleResultingCommandExecutor executor)
- TImpl executesConsole(ConsoleResultingExecutionInfo executor)
- TImpl executes(CommandExecutor executor, ExecutorType types)
- TImpl executes(CommandExecutionInfo executor, ExecutorType types)
- TImpl executes(ResultingCommandExecutor executor, ExecutorType types)
- TImpl executes(ResultingCommandExecutionInfo executor, ExecutorType types)

### Class: dev.jorel.commandapi.AbstractArgumentTree
Type: Abstract Class
Extends: dev.jorel.commandapi.Executable

Methods:
- TImpl thenNested(List<AbstractArgumentTree<*TArgument, TCommandSender>> trees)
- TImpl thenNested(AbstractArgumentTree<*TArgument, TCommandSender> trees)
- CommandAPIExecutor getExecutor()
- Executable clearExecutors()
- TImpl then(AbstractArgumentTree<*TArgument, TCommandSender> tree)
- void setExecutor(CommandAPIExecutor)

### Class: dev.jorel.commandapi.AbstractCommandAPICommand
Type: Abstract Class
Extends: dev.jorel.commandapi.ExecutableCommand

Methods:
- V setSubcommands(List<TImpl> subcommands)
- List<TImpl> getSubcommands()
- V setArguments(List<TArgument> args)
- List<TArgument> getArguments()
- TImpl withOptionalArguments(List<TArgument> args)
- TImpl withOptionalArguments([T args)
- TImpl withArguments(List<TArgument> args)
- TImpl withArguments([T args)
- TImpl copy()
- boolean isConverted()
- TImpl withSubcommand(T subcommand)
- TImpl withSubcommands([T subcommands)
- void register(String namespace)

### Class: dev.jorel.commandapi.AbstractCommandTree
Type: Abstract Class
Extends: dev.jorel.commandapi.ExecutableCommand

Methods:
- TImpl thenNested(List<AbstractArgumentTree<*TArgument, TCommandSender>> trees)
- TImpl thenNested(AbstractArgumentTree<*TArgument, TCommandSender> trees)
- TImpl then(AbstractArgumentTree<*TArgument, TCommandSender> tree)
- void register(String namespace)

### Class: dev.jorel.commandapi.Brigadier
Type: Class

Methods:
- **static** SuggestionProvider toSuggestions(T argument, A args)
- **static** LiteralArgumentBuilder fromLiteralArgument(Literal<TArgument> literalArgument)
- **static** RequiredArgumentBuilder fromArgument(List<TArgument> args, T argument)
- **static** RequiredArgumentBuilder fromArgument(T argument)
- **static** TCommandSender getCommandSenderFromContext(CommandContext cmdCtx)
- **static** CommandDispatcher getCommandDispatcher()
- **static** RedirectModifier fromPredicate(BiPredicate<TCommandSender, Object> predicate, List<TArgument> args)
- **static** Object getBrigadierSourceFromCommandSender(T sender)
- **static** Object parseArguments(CommandContext cmdCtx, List<TArgument> args) throws CommandSyntaxException
- **static** Command fromCommand(AbstractCommandAPICommand<*TArgument, TCommandSender> command)
- **static** RootCommandNode getRootNode()

### Class: dev.jorel.commandapi.CommandAPI
Type: Class

Methods:
- **static** void logException(String message, Throwable throwable)
- **static** void logNormal(String message)
- **static** void logWarning(String message)
- **static** void unregister(String command)
- **static** void unregister(String command, boolean unregisterNamespaces)
- **static** CommandAPILogger getLogger()
- **static** void logInfo(String message)
- **static** void onEnable()
- **static** void onDisable()
- **static** boolean isLoaded()
- **static** boolean canRegister()
- **static** V updateRequirements(T player)
- **static** void logError(String message)
- **static** InternalConfig getConfiguration()
- **static** void setLogger(CommandAPILogger logger)
- **static** void stopCommandRegistration()
- **static** WrapperCommandSyntaxException failWithString(String message)
- **static** V onLoad(CommandAPIConfig<*> config)
- **static** List<RegisteredCommand> getRegisteredCommands()
- **static** V registerCommand(Class<*> commandClass)
- **static** void reloadDatapacks()
- **static** WrapperCommandSyntaxException failWithMessage(Message message)

### Class: dev.jorel.commandapi.CommandAPICommand
Type: Class
Extends: dev.jorel.commandapi.AbstractCommandAPICommand
Implements: dev.jorel.commandapi.VelocityExecutable

Constructors:
- CommandAPICommand(String commandName)

Methods:
- CommandAPICommand instance()
- Object instance()
- void register(String namespace)
- void register(Object plugin)

### Class: dev.jorel.commandapi.CommandAPIConfig
Type: Abstract Class
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- TImpl enableNetworking(boolean enabled)
- TImpl makeNetworkingExceptionsWarnings(boolean value)
- TImpl missingExecutorImplementationMessage(String value)
- TImpl silentLogs(boolean value)
- TImpl dispatcherFile(File file)
- TImpl setNamespace(String namespace)
- TImpl verboseOutput(boolean value)

### Class: dev.jorel.commandapi.CommandAPIExecutor
Type: Class

Methods:
- V setNormalExecutors(List<NormalExecutor<TCommandSender, TWrapperType>> normalExecutors)
- boolean hasAnyExecutors()
- V addNormalExecutor(NormalExecutor<**> executor)
- V setResultingExecutors(List<ResultingExecutor<TCommandSender, TWrapperType>> resultingExecutors)
- List<NormalExecutor<TCommandSender, TWrapperType>> getNormalExecutors()
- I execute(ExecutionInfo<TCommandSender, TWrapperType> info) throws CommandSyntaxException
- V addResultingExecutor(ResultingExecutor<**> executor)
- boolean isForceNative()
- List<ResultingExecutor<TCommandSender, TWrapperType>> getResultingExecutors()

### Class: dev.jorel.commandapi.CommandAPIHandler
Type: Class

Methods:
- **static** Field getField(Class<*> clazz, String name)
- **static** Field getField(Class<*> clazz, String name, String mojangMappedName)
- Command<TSource> generateCommand([T args, A executor, r converted)
- void writeDispatcherToFile()
- void onLoad()
- **static** CommandAPIHandler<***> getInstance()
- void onEnable()
- **static** String getRawArgumentInput(CommandContext<TCommandSource> cmdCtx, String key)
- void onDisable()
- CommandAPIPlatform<TArgument, TCommandSender, TSource> getPlatform()

### Class: dev.jorel.commandapi.CommandAPIMain
Type: Class

Constructors:
- CommandAPIMain(ProxyServer server, Logger logger, Path dataDirectory)

Methods:
- void onProxyInitialization(ProxyInitializeEvent event)
- void onProxyReload(ProxyReloadEvent event)
- void onProxyShutdown(ProxyShutdownEvent event)

### Class: dev.jorel.commandapi.CommandAPIVelocity
Type: Class
Implements: dev.jorel.commandapi.CommandAPIPlatform

Constructors:
- CommandAPIVelocity(InternalVelocityConfig config)

Methods:
- void registerPermission(String string)
- VelocityCommandAPIMessenger setupMessenger()
- CommandAPIMessenger setupMessenger()
- VelocityCommandAPIMessenger getMessenger()
- V postCommandRegistration(RegisteredCommand registeredCommand, LiteralCommandNode<CommandSource> resultantNode, List<LiteralCommandNode<CommandSource>> aliasNodes)
- void onEnable()
- CommandSource getBrigadierSourceFromCommandSender(AbstractCommandSender<CommandSource> sender)
- Object getBrigadierSourceFromCommandSender(AbstractCommandSender)
- void onDisable()
- LiteralCommandNode<CommandSource> registerCommandNode(LiteralArgumentBuilder<CommandSource> node, String namespace)
- CommandDispatcher<CommandSource> getBrigadierDispatcher()
- Argument<String> newConcreteLiteralArgument(String nodeName, String literal)
- AbstractArgument newConcreteLiteralArgument(String, String)
- **static** InternalVelocityConfig getConfiguration()
- AbstractCommandAPICommand<Argument<*>, CommandSource> newConcreteCommandAPICommand(CommandMetaData<CommandSource> meta)
- **static** CommandAPIVelocity get()
- void reloadDataPacks()
- V createDispatcherFile(File file, CommandDispatcher<CommandSource> brigadierDispatcher) throws IOException
- VelocityCommandSender<CommandSource> wrapCommandSender(CommandSource commandSource)
- AbstractCommandSender wrapCommandSender(Object)
- VelocityCommandSender<CommandSource> getCommandSenderFromCommandSource(CommandSource cs)
- AbstractCommandSender getCommandSenderFromCommandSource(Object)
- void unregister(String commandName, boolean unregisterNamespaces)
- CommandAPILogger getLogger()
- void preCommandRegistration(String commandName)
- SuggestionProvider<CommandSource> getSuggestionProvider(SuggestionProviders suggestionProvider)
- V updateRequirements(AbstractPlayer<*> playerWrapper)
- VelocityCommandSender<CommandSource> getSenderForCommand(CommandContext<CommandSource> cmdCtx, boolean forceNative)
- AbstractCommandSender getSenderForCommand(CommandContext, boolean)
- Argument<String> newConcreteMultiLiteralArgument(String nodeName, String literals)
- AbstractArgument newConcreteMultiLiteralArgument(String, String[])
- void onLoad()

### Class: dev.jorel.commandapi.CommandAPIVelocityConfig
Type: Class
Extends: dev.jorel.commandapi.CommandAPIConfig

Constructors:
- CommandAPIVelocityConfig(ProxyServer server, Object plugin)

Methods:
- CommandAPIVelocityConfig instance()
- Object instance()
- CommandAPIVelocityConfig usePluginNamespace()
- CommandAPIVelocityConfig setNamespace(String namespace)
- CommandAPIConfig setNamespace(String)

### Class: dev.jorel.commandapi.CommandAPIVersionHandler
Type: Abstract Class

No public methods found

### Class: dev.jorel.commandapi.CommandPermission
Type: Class

Methods:
- Optional<String> getPermission()
- int hashCode()
- boolean equals(Object obj)
- boolean isNegated()
- String toString()
- **static** CommandPermission fromString(String permission)

### Class: dev.jorel.commandapi.CommandTree
Type: Class
Extends: dev.jorel.commandapi.AbstractCommandTree
Implements: dev.jorel.commandapi.VelocityExecutable

Constructors:
- CommandTree(String commandName)

Methods:
- CommandTree instance()
- Object instance()
- void register(String namespace)
- void register(Object plugin)

### Class: dev.jorel.commandapi.ExecutableCommand
Type: Abstract Class
Extends: dev.jorel.commandapi.Executable

Methods:
- TImpl withPermission(CommandPermission permission)
- TImpl withPermission(String permission)
- TImpl withUsage(String usage)
- String[] getAliases()
- Predicate<TCommandSender> getRequirements()
- CommandPermission getPermission()
- String getName()
- void setAliases(String[] aliases)
- CommandAPIExecutor getExecutor()
- void setExecutor(CommandAPIExecutor)
- TImpl withShortDescription(String description)
- TImpl withHelp(String shortDescription, String fullDescription)
- String[] getUsage()
- TImpl withRequirement(Predicate<TCommandSender> requirement)
- TImpl withFullDescription(String description)
- String getFullDescription()
- String getShortDescription()
- TImpl withAliases(String aliases)
- Executable clearExecutors()
- void override()
- void setPermission(CommandPermission permission)
- V setRequirements(Predicate<TCommandSender> requirements)
- TImpl withoutPermission(CommandPermission permission)
- TImpl withoutPermission(String permission)
- void register()
- void register(String)

### Class: dev.jorel.commandapi.Execution
Type: Class

Constructors:
- Execution(List<TArgument> arguments, CommandAPIExecutor<TCommandSender, AbstractCommandSender<+TCommandSender>> executor)

Methods:
- Execution<TCommandSender, TArgument> prependedBy(T argument)
- V register(CommandMetaData<TCommandSender> meta, String namespace)

### Class: dev.jorel.commandapi.InternalConfig
Type: Class

Constructors:
- InternalConfig(CommandAPIConfig<*> verboseOutput)

Methods:
- String getNamespace()
- boolean hasSilentLogs()
- boolean makeNetworkingExceptionsWarnings()
- boolean isNetworkingEnabled()
- String getMissingImplementationMessage()
- boolean hasVerboseOutput()
- File getDispatcherFile()

### Class: dev.jorel.commandapi.InternalVelocityConfig
Type: Class
Extends: dev.jorel.commandapi.InternalConfig

Constructors:
- InternalVelocityConfig(CommandAPIVelocityConfig server)

Methods:
- ProxyServer getServer()
- Object getPlugin()

### Class: dev.jorel.commandapi.LoadContext
Type: Class
Extends: java.lang.Record

Constructors:
- LoadContext(CommandAPIPlatform<***> platform)
- LoadContext(CommandAPIPlatform<***> platform, Runnable context)

Methods:
- int hashCode()
- boolean equals(Object o)
- Runnable context()
- String toString()
- CommandAPIPlatform<***> platform()

### Class: dev.jorel.commandapi.RegisteredCommand
Type: Class
Extends: java.lang.Record

Constructors:
- RegisteredCommand(String commandName, List<String> argsAsStr, List<AbstractArgument<****>> arguments, Optional<String> shortDescription, Optional<String> fullDescription, Optional<String> usageDescription, Optional<Object> helpTopic, String aliases, CommandPermission permission, String namespace)

Methods:
- String[] aliases()
- boolean shouldGenerateHelpTopic()
- CommandPermission permission()
- Optional<String> usageDescription()
- Optional<String> shortDescription()
- Optional<String> fullDescription()
- String commandName()
- int hashCode()
- boolean equals(Object obj)
- String namespace()
- Optional<Object> helpTopic()
- List<AbstractArgument<****>> arguments()
- String toString()
- List<String> argsAsStr()

### Class: dev.jorel.commandapi.SafeVarHandle
Type: Class

Methods:
- TFieldType getStatic()
- V set(T instance, T param)
- TFieldType get(T instance)
- **static** SafeVarHandle<TType, TFieldType> ofOrNull(Class<-TType> classType, String fieldName, String mojangMappedFieldName, Class<-TFieldType> fieldType)

### Class: dev.jorel.commandapi.StringTooltip
Type: Class
Implements: dev.jorel.commandapi.IStringTooltip

Methods:
- **static** StringTooltip ofString(String suggestion, String tooltip)
- **static** Collection<StringTooltip> generateStrings(UnaryOperator<String> tooltipGenerator, String suggestions)
- **static** Collection<StringTooltip> generateStrings(UnaryOperator<String> tooltipGenerator, Collection<String> suggestions)
- Message getTooltip()
- **static** StringTooltip ofMessage(String suggestion, Message tooltip)
- **static** Collection<StringTooltip> generateMessages(Function<String, Message> tooltipGenerator, String suggestions)
- **static** Collection<StringTooltip> generateMessages(Function<String, Message> tooltipGenerator, Collection<String> suggestions)
- **static** StringTooltip none(String suggestion)
- **static** Collection<StringTooltip> none(String suggestions)
- **static** Collection<StringTooltip> none(Collection<String> suggestions)
- String getSuggestion()

### Class: dev.jorel.commandapi.SuggestionInfo
Type: Class
Extends: java.lang.Record

Constructors:
- SuggestionInfo(T sender, char previousArgs, o currentInput, m currentArg)

Methods:
- String currentInput()
- TCommandSender sender()
- int hashCode()
- boolean equals(Object o)
- String currentArg()
- CommandArguments previousArgs()
- String toString()

### Class: dev.jorel.commandapi.Tooltip
Type: Class

Methods:
- **static** Tooltip<TS> ofString(T object, short tooltip)
- **static** Collection<Tooltip<TS>> generateStrings(Function<TS, String> tooltipGenerator, [T suggestions)
- **static** Collection<Tooltip<TS>> generateStrings(Function<TS, String> tooltipGenerator, Collection<TS> suggestions)
- Message getTooltip()
- **static** Function<Tooltip<TS>, StringTooltip> build(Function<TS, String> mapper)
- **static** Tooltip<TS> ofMessage(T object, short tooltip)
- **static** Collection<Tooltip<TS>> generateMessages(Function<TS, Message> tooltipGenerator, [T suggestions)
- **static** Collection<Tooltip<TS>> generateMessages(Function<TS, Message> tooltipGenerator, Collection<TS> suggestions)
- **static** Tooltip<TS> arrayOf(Tooltip<TS> tooltips)
- **static** Tooltip<TS> none(T object)
- **static** Collection<Tooltip<TS>> none([T suggestions)
- **static** Collection<Tooltip<TS>> none(Collection<TS> suggestions)
- **static** Message messageFromString(String string)
- TS getSuggestion()

## Package: dev.jorel.commandapi.arguments

### Class: dev.jorel.commandapi.arguments.ArgumentSuggestions
Type: Interface

Methods:
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltipsAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<IStringTooltip>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<String>>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<String>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> strings(String suggestions)
- **static** ArgumentSuggestions<TCommandSender> strings(Collection<String> suggestions)
- **static** ArgumentSuggestions<TCommandSender> strings(Function<SuggestionInfo<TCommandSender>, String> suggestions)
- **static** ArgumentSuggestions<TCommandSender> merge(ArgumentSuggestions<TCommandSender> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltipsCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<IStringTooltip>>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringCollection(Function<SuggestionInfo<TCommandSender>, Collection<String>> suggestions)
- CompletableFuture<Suggestions> suggest(SuggestionInfo<TCommandSender>, SuggestionsBuilder) throws CommandSyntaxException
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltipsCollection(Function<SuggestionInfo<TCommandSender>, Collection<IStringTooltip>> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltips(IStringTooltip suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltips(Collection<IStringTooltip> suggestions)
- **static** ArgumentSuggestions<TCommandSender> stringsWithTooltips(Function<SuggestionInfo<TCommandSender>, IStringTooltip> suggestions)
- **static** ArgumentSuggestions<TCommandSender> empty()

### Class: dev.jorel.commandapi.arguments.CustomProvidedArgument
Type: Interface

Methods:
- SuggestionProviders getSuggestionProvider()

### Class: dev.jorel.commandapi.arguments.GreedyArgument
Type: Interface

No public methods found

### Class: dev.jorel.commandapi.arguments.Literal
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- String getLiteral()

### Class: dev.jorel.commandapi.arguments.MultiLiteral
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- String[] getLiterals()

### Class: dev.jorel.commandapi.arguments.SafeOverrideable
Type: Interface
Implements: dev.jorel.commandapi.ChainableBuilder

Methods:
- TImpl replaceSafeSuggestions(SafeSuggestions<TS, TCommandSender> suggestions)
- Function<TS, String> getMapper()
- TImpl includeSuggestions(ArgumentSuggestions<TCommandSender>)
- TImpl replaceSuggestions(ArgumentSuggestions<TCommandSender>)
- TImpl includeSafeSuggestions(SafeSuggestions<TS, TCommandSender> suggestions)

### Class: dev.jorel.commandapi.arguments.SafeSuggestions
Type: Interface

Methods:
- ArgumentSuggestions<TCommandSender> toSuggestions(Function<TS, String>)
- **static** SafeSuggestions<TT, TCommandSender> tooltipsAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Tooltip<TT>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggestCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<TT>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggestCollection(Function<SuggestionInfo<TCommandSender>, Collection<TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltipCollectionAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<Collection<Tooltip<TT>>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggest([T suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggest(Collection<TT> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggest(Function<SuggestionInfo<TCommandSender>, [TT> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltipCollection(Function<SuggestionInfo<TCommandSender>, Collection<Tooltip<TT>>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltips(Tooltip<TT> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltips(Collection<Tooltip<TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> tooltips(Function<SuggestionInfo<TCommandSender>, Tooltip<TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> suggestAsync(Function<SuggestionInfo<TCommandSender>, CompletableFuture<[TT>> suggestions)
- **static** SafeSuggestions<TT, TCommandSender> empty()

### Class: dev.jorel.commandapi.arguments.StringParser
Type: Interface

Methods:
- TT parse(String) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.arguments.AbstractArgument
Type: Abstract Class
Extends: dev.jorel.commandapi.AbstractArgumentTree

Methods:
- TImpl withPermission(CommandPermission permission)
- TImpl withPermission(String permission)
- String getHelpString()
- TT parseArgument(CommandContext<TSource>, String, CommandArguments) throws CommandSyntaxException
- ArgumentType<*> getRawType()
- Predicate<TCommandSender> getRequirements()
- Optional<ArgumentSuggestions<TCommandSender>> getIncludedSuggestions()
- V copyPermissionsAndRequirements(T argument)
- TImpl setListed(boolean listed)
- TImpl includeSuggestions(ArgumentSuggestions<TCommandSender> suggestions)
- boolean isOptional()
- String getNodeName()
- List<String> getEntityNames(Object argument)
- boolean hasCombinedArguments()
- List<TArgument> getCombinedArguments()
- TImpl withRequirement(Predicate<TCommandSender> requirement)
- CommandPermission getArgumentPermission()
- CommandAPIArgumentType getArgumentType()
- boolean isListed()
- Class<TT> getPrimitiveType()
- Optional<ArgumentSuggestions<TCommandSender>> getOverriddenSuggestions()
- String toString()
- TImpl replaceSuggestions(ArgumentSuggestions<TCommandSender> suggestions)
- TImpl combineWith([T combinedArguments)
- TImpl setOptional(boolean optional)

### Class: dev.jorel.commandapi.arguments.Argument
Type: Abstract Class
Extends: dev.jorel.commandapi.arguments.AbstractArgument
Implements: dev.jorel.commandapi.VelocityExecutable

Methods:
- Argument<TT> instance()
- Object instance()

### Class: dev.jorel.commandapi.arguments.BooleanArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- BooleanArgument(String nodeName)

Methods:
- Boolean parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Boolean> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.CommandAPIArgumentType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ADVANCEMENT
- ADVENTURE_CHAT
- ADVENTURE_CHATCOLOR
- ADVENTURE_CHAT_COMPONENT
- ANGLE
- ASYNC_OFFLINE_PLAYER
- AXIS
- BIOME
- BLOCK_PREDICATE
- BLOCKSTATE
- CHAT
- CHAT_COMPONENT
- CHATCOLOR
- COMMAND
- CUSTOM
- DIMENSION
- ENCHANTMENT
- ENTITY_SELECTOR
- ENTITY_TYPE
- ENVIRONMENT
- FLOAT_RANGE
- FUNCTION
- INT_RANGE
- ITEMSTACK
- ITEMSTACK_PREDICATE
- LIST
- LIST_TEXT
- LITERAL
- LOCATION
- LOCATION_2D
- LOOT_TABLE
- MAP
- MATH_OPERATION
- MULTI_LITERAL
- NAMESPACED_KEY
- NBT_COMPOUND
- OBJECTIVE
- OBJECTIVE_CRITERIA
- PARTICLE
- PLAYER
- POTION_EFFECT
- PRIMITIVE_BOOLEAN
- PRIMITIVE_DOUBLE
- PRIMITIVE_FLOAT
- PRIMITIVE_GREEDY_STRING
- PRIMITIVE_INTEGER
- PRIMITIVE_LONG
- PRIMITIVE_STRING
- PRIMITIVE_TEXT
- RECIPE
- ROTATION
- SCORE_HOLDER
- SCOREBOARD_SLOT
- SOUND
- TEAM
- TIME
- UUID

Methods:
- **static** CommandAPIArgumentType fromInternal(String internal)
- **static** CommandAPIArgumentType valueOf(String name)
- **static** CommandAPIArgumentType[] values()

### Class: dev.jorel.commandapi.arguments.DoubleArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- DoubleArgument(String nodeName)
- DoubleArgument(String nodeName, double min)
- DoubleArgument(String nodeName, double min, double max)

Methods:
- Double parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Double> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.FloatArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- FloatArgument(String nodeName)
- FloatArgument(String nodeName, float min)
- FloatArgument(String nodeName, float min, float max)

Methods:
- Float parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Float> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.GreedyStringArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Implements: dev.jorel.commandapi.arguments.GreedyArgument

Constructors:
- GreedyStringArgument(String nodeName)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.IntegerArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- IntegerArgument(String nodeName)
- IntegerArgument(String nodeName, int min)
- IntegerArgument(String nodeName, int min, int max)

Methods:
- Integer parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Integer> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.LiteralArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.Literal

Constructors:
- LiteralArgument(String literal)
- LiteralArgument(String nodeName, String literal)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- String getHelpString()
- String getLiteral()
- Class<String> getPrimitiveType()
- **static** LiteralArgument of(String literal)
- **static** LiteralArgument of(String nodeName, String literal)
- CommandAPIArgumentType getArgumentType()
- **static** LiteralArgument literal(String literal)
- **static** LiteralArgument literal(String nodeName, String literal)

### Class: dev.jorel.commandapi.arguments.LocationType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BLOCK_POSITION
- PRECISE_POSITION

Methods:
- **static** LocationType valueOf(String name)
- **static** LocationType[] values()

### Class: dev.jorel.commandapi.arguments.LongArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.SafeOverrideableArgument

Constructors:
- LongArgument(String nodeName)
- LongArgument(String nodeName, long min)
- LongArgument(String nodeName, long min, long max)

Methods:
- Long parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<Long> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.MultiLiteralArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.MultiLiteral

Constructors:
- MultiLiteralArgument(String nodeName, String[] literals)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- String[] getLiterals()
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.SafeOverrideableArgument
Type: Abstract Class
Extends: dev.jorel.commandapi.arguments.Argument
Implements: dev.jorel.commandapi.arguments.SafeOverrideable

Methods:
- Function<TS, String> getMapper()

### Class: dev.jorel.commandapi.arguments.StringArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- StringArgument(String nodeName)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

### Class: dev.jorel.commandapi.arguments.SuggestionProviders
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FUNCTION
- RECIPES
- SOUNDS
- ADVANCEMENTS
- LOOT_TABLES
- BIOMES
- ENTITIES
- POTION_EFFECTS

Methods:
- **static** SuggestionProviders valueOf(String name)
- **static** SuggestionProviders[] values()

### Class: dev.jorel.commandapi.arguments.SuggestionsBranch
Type: Class

Methods:
- V enforceReplacements(T sender, char arguments) throws CommandSyntaxException
- **static** SuggestionsBranch<TCommandSender> suggest(ArgumentSuggestions<TCommandSender> suggestions)
- SuggestionsBranch<TCommandSender> branch(SuggestionsBranch<TCommandSender> branches)
- ArgumentSuggestions<TCommandSender> getNextSuggestion(T sender, char previousArguments) throws CommandSyntaxException

### Class: dev.jorel.commandapi.arguments.TextArgument
Type: Class
Extends: dev.jorel.commandapi.arguments.Argument

Constructors:
- TextArgument(String nodeName)

Methods:
- String parseArgument(CommandContext<TSource> cmdCtx, String key, CommandArguments previousArgs) throws CommandSyntaxException
- Object parseArgument(CommandContext, String, CommandArguments) throws CommandSyntaxException
- Class<String> getPrimitiveType()
- CommandAPIArgumentType getArgumentType()

## Package: dev.jorel.commandapi.commandsenders

### Class: dev.jorel.commandapi.commandsenders.AbstractBlockCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractCommandSender
Type: Interface

Methods:
- TSource getSource()
- boolean hasPermission(String)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.AbstractConsoleCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractEntity
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractFeedbackForwardingCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractNativeProxyCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractProxiedCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractPlayer
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractProxiedCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.AbstractRemoteConsoleCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.VelocityCommandSender
Type: Interface
Implements: dev.jorel.commandapi.commandsenders.AbstractCommandSender

No public methods found

### Class: dev.jorel.commandapi.commandsenders.VelocityConsoleCommandSender
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractConsoleCommandSender, dev.jorel.commandapi.commandsenders.VelocityCommandSender

Constructors:
- VelocityConsoleCommandSender(ConsoleCommandSource source)

Methods:
- ConsoleCommandSource getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

### Class: dev.jorel.commandapi.commandsenders.VelocityPlayer
Type: Class
Implements: dev.jorel.commandapi.commandsenders.AbstractPlayer, dev.jorel.commandapi.commandsenders.VelocityCommandSender

Constructors:
- VelocityPlayer(Player player)

Methods:
- Player getSource()
- Object getSource()
- boolean hasPermission(String permissionNode)
- boolean isOp()

## Package: dev.jorel.commandapi.config

### Class: dev.jorel.commandapi.config.ConfigurationAdapter
Type: Interface

Methods:
- Object getValue(String)
- ConfigurationAdapter<TConfiguration> loadFromFile() throws IOException
- boolean contains(String)
- void saveToFile() throws IOException
- void setValue(String, Object)
- void tryCreateSection(String)
- void setComment(String, String[])
- String[] getComment(String)
- Set<String> getKeys()
- ConfigurationAdapter<TConfiguration> complete()
- void saveDefaultConfig(DefaultConfig defaultConfig, File directory, Logger logger)
- TConfiguration config()
- ConfigurationAdapter<TConfiguration> createNew()

### Class: dev.jorel.commandapi.config.CommentedConfigOption
Type: Class
Extends: java.lang.Record

Constructors:
- CommentedConfigOption(String comment, T option)

Methods:
- int hashCode()
- boolean equals(Object o)
- String[] comment()
- String toString()
- TT option()

### Class: dev.jorel.commandapi.config.CommentedSection
Type: Class
Extends: java.lang.Record

Constructors:
- CommentedSection(String[] comment)

Methods:
- int hashCode()
- boolean equals(Object o)
- String[] comment()
- String toString()

### Class: dev.jorel.commandapi.config.ConfigGenerator
Type: Class

Methods:
- ConfigurationAdapter<TT> generate(ConfigurationAdapter<TT> existingConfig)
- **static** ConfigGenerator createNew(DefaultConfig defaultConfig)

### Class: dev.jorel.commandapi.config.DefaultConfig
Type: Abstract Class

Methods:
- Map<String, CommentedConfigOption<*>> getAllOptions()
- Map<String, CommentedSection> getAllSections()

### Class: dev.jorel.commandapi.config.DefaultVelocityConfig
Type: Class
Extends: dev.jorel.commandapi.config.DefaultConfig

Methods:
- **static** DefaultVelocityConfig create(Map<String, CommentedConfigOption<*>> options, Map<String, CommentedSection> sections)
- **static** DefaultVelocityConfig createDefault()

### Class: dev.jorel.commandapi.config.VelocityConfigurationAdapter
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.config.ConfigurationAdapter

Constructors:
- VelocityConfigurationAdapter(YamlConfigurationLoader loader, CommentedConfigurationNode config, DefaultVelocityConfig defaultVelocityConfig)

Methods:
- DefaultVelocityConfig defaultVelocityConfig()
- ConfigurationAdapter<ConfigurationNode> loadFromFile() throws IOException
- YamlConfigurationLoader loader()
- Set<String> getKeys()
- ConfigurationAdapter<ConfigurationNode> createNew()
- Object getValue(String key)
- boolean contains(String key)
- void saveToFile() throws IOException
- int hashCode()
- boolean equals(Object o)
- void setValue(String key, Object value)
- void tryCreateSection(String key)
- void setComment(String key, String[] comment)
- String toString()
- String[] getComment(String key)
- **static** VelocityConfigurationAdapter createMinimalInstance(YamlConfigurationLoader loader)
- ConfigurationAdapter<ConfigurationNode> complete()
- CommentedConfigurationNode config()
- Object config()

## Package: dev.jorel.commandapi.exceptions

### Class: dev.jorel.commandapi.exceptions.BadLiteralException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- BadLiteralException(boolean isNull)

No public methods found

### Class: dev.jorel.commandapi.exceptions.ConflictingPermissionsException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- ConflictingPermissionsException(String command, CommandPermission currentPermission, CommandPermission conflictingPermission)

No public methods found

### Class: dev.jorel.commandapi.exceptions.EmptyExecutorException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: dev.jorel.commandapi.exceptions.GreedyArgumentException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- GreedyArgumentException(AbstractArgument<****> arguments)

No public methods found

### Class: dev.jorel.commandapi.exceptions.InvalidCommandNameException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- InvalidCommandNameException(String commandName)

No public methods found

### Class: dev.jorel.commandapi.exceptions.InvalidRangeException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: dev.jorel.commandapi.exceptions.MissingCommandExecutorException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- MissingCommandExecutorException(String commandName)

No public methods found

### Class: dev.jorel.commandapi.exceptions.NBTAPINotFoundException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- NBTAPINotFoundException(Class<*> c)

No public methods found

### Class: dev.jorel.commandapi.exceptions.OptionalArgumentException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- OptionalArgumentException(String commandName)

No public methods found

### Class: dev.jorel.commandapi.exceptions.PaperAdventureNotFoundException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- PaperAdventureNotFoundException(Class<*> c)

No public methods found

### Class: dev.jorel.commandapi.exceptions.ProtocolVersionTooOldException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- int getProtocolVersion()
- **static** ProtocolVersionTooOldException whileSending(Object target, int protocolVersion, String reason)
- String getReason()
- **static** ProtocolVersionTooOldException received(Object sender, int protocolVersion, String reason)

### Class: dev.jorel.commandapi.exceptions.SpigotNotFoundException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- SpigotNotFoundException(Class<*> c)

No public methods found

### Class: dev.jorel.commandapi.exceptions.UnimplementedArgumentException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- UnimplementedArgumentException(String type, String versionSupportedIn)

No public methods found

### Class: dev.jorel.commandapi.exceptions.WrapperCommandSyntaxException
Type: Class
Extends: java.lang.Exception

Constructors:
- WrapperCommandSyntaxException(CommandSyntaxException exception)

Methods:
- int getCursor()
- void setStackTrace(StackTraceElement[] stackTrace)
- void printStackTrace()
- void printStackTrace(PrintStream s)
- void printStackTrace(PrintWriter s)
- StackTraceElement[] getStackTrace()
- CommandSyntaxException getException()
- CommandExceptionType getType()
- String getLocalizedMessage()
- Message getRawMessage()
- Throwable initCause(Throwable cause)
- String getMessage()
- String getInput()
- String getContext()
- Throwable getCause()

## Package: dev.jorel.commandapi.executors

### Class: dev.jorel.commandapi.executors.CommandExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<CommandSource, VelocityCommandSender<CommandSource>>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.CommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(CommandSource, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<CommandSource, VelocityCommandSender<CommandSource>> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(ConsoleCommandSource, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<ConsoleCommandSource, VelocityConsoleCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<ConsoleCommandSource, VelocityConsoleCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(ConsoleCommandSource, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<ConsoleCommandSource, VelocityConsoleCommandSender> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ConsoleResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<ConsoleCommandSource, VelocityConsoleCommandSender>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ExecutionInfo
Type: Interface

Methods:
- CommandArguments args()
- TWrapperType senderWrapper()
- TSender sender()

### Class: dev.jorel.commandapi.executors.NormalExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.TypedExecutor

Methods:
- I executeWith(ExecutionInfo<TCommandSender, TWrapperType> info) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<TCommandSender, TWrapperType>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- void run(Player, CommandArguments) throws WrapperCommandSyntaxException
- V run(ExecutionInfo<Player, VelocityPlayer> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.NormalExecutor

Methods:
- ExecutorType getType()
- V run(ExecutionInfo<Player, VelocityPlayer>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(Player, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<Player, VelocityPlayer> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.PlayerResultingExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<Player, VelocityPlayer>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ResultingCommandExecutionInfo
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- I run(ExecutionInfo<CommandSource, VelocityCommandSender<CommandSource>>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ResultingCommandExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.ResultingExecutor

Methods:
- ExecutorType getType()
- int run(CommandSource, CommandArguments) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<CommandSource, VelocityCommandSender<CommandSource>> info) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.ResultingExecutor
Type: Interface
Implements: dev.jorel.commandapi.executors.TypedExecutor

Methods:
- I executeWith(ExecutionInfo<TCommandSender, TWrapperType> info) throws WrapperCommandSyntaxException
- I run(ExecutionInfo<TCommandSender, TWrapperType>) throws WrapperCommandSyntaxException

### Class: dev.jorel.commandapi.executors.TypedExecutor
Type: Interface

Methods:
- I executeWith(ExecutionInfo<TCommandSender, TWrapperType>) throws WrapperCommandSyntaxException
- ExecutorType getType()

### Class: dev.jorel.commandapi.executors.CommandArguments
Type: Class
Extends: java.lang.Record

Constructors:
- CommandArguments(Object args, Map<String, Object> argsMap, String rawArgs, Map<String, String> rawArgsMap, String fullInput)

Methods:
- TT getByArgumentOrDefault(AbstractArgument<TT, ***> argumentType, T defaultValue)
- TT getByClassOrDefault(String nodeName, Class<TT> argumentType, T defaultValue)
- TT getByClassOrDefault(int index, Class<TT> argumentType, T defaultValue)
- Optional<TT> getOptionalByArgument(AbstractArgument<TT, ***> argumentType)
- Object getOrDefault(int index, Object defaultValue)
- Object getOrDefault(String nodeName, Object defaultValue)
- Object getOrDefault(int index, Supplier<*> defaultValue)
- Object getOrDefault(String nodeName, Supplier<*> defaultValue)
- TT getOrDefaultUnchecked(int index, T defaultValue)
- TT getOrDefaultUnchecked(String nodeName, T defaultValue)
- TT getOrDefaultUnchecked(int index, Supplier<TT> defaultValue)
- TT getOrDefaultUnchecked(String nodeName, Supplier<TT> defaultValue)
- Optional<String> getRawOptional(int index)
- Optional<String> getRawOptional(String nodeName)
- TT getByClass(String nodeName, Class<TT> argumentType)
- TT getByClass(int index, Class<TT> argumentType)
- int count()
- String fullInput()
- Optional<TT> getOptionalUnchecked(int index)
- Optional<TT> getOptionalUnchecked(String nodeName)
- TT getUnchecked(int index)
- TT getUnchecked(String nodeName)
- Optional<TT> getOptionalByClass(String nodeName, Class<TT> argumentType)
- Optional<TT> getOptionalByClass(int index, Class<TT> argumentType)
- Object[] args()
- Optional<Object> getOptional(int index)
- Optional<Object> getOptional(String nodeName)
- String getOrDefaultRaw(int index, String defaultValue)
- String getOrDefaultRaw(String nodeName, String defaultValue)
- String getOrDefaultRaw(int index, Supplier<String> defaultValue)
- String getOrDefaultRaw(String nodeName, Supplier<String> defaultValue)
- int hashCode()
- boolean equals(Object obj)
- Object get(int index)
- Object get(String nodeName)
- String toString()
- TT getByArgument(AbstractArgument<TT, ***> argumentType)
- String getRaw(int index)
- String getRaw(String nodeName)
- Map<String, Object> argsMap()
- Map<String, String> rawArgsMap()
- String[] rawArgs()

### Class: dev.jorel.commandapi.executors.ExecutorType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PLAYER
- ENTITY
- CONSOLE
- BLOCK
- ALL
- PROXY
- NATIVE
- REMOTE
- FEEDBACK_FORWARDING

Methods:
- **static** ExecutorType valueOf(String name)
- **static** ExecutorType[] values()

### Class: dev.jorel.commandapi.executors.VelocityExecutionInfo
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.executors.ExecutionInfo

Constructors:
- VelocityExecutionInfo(T sender, short senderWrapper, e args)

Methods:
- CommandArguments args()
- VelocityCommandSender<+TSender> senderWrapper()
- AbstractCommandSender senderWrapper()
- TSender sender()
- int hashCode()
- boolean equals(Object o)
- String toString()

## Package: dev.jorel.commandapi.network

### Class: dev.jorel.commandapi.network.CommandAPIPacket
Type: Interface

Methods:
- void write(FriendlyByteBuffer, Object, int) throws ProtocolVersionTooOldException

### Class: dev.jorel.commandapi.network.CommandAPIPacketHandler
Type: Interface

Methods:
- V handlePacket(T, int)

### Class: dev.jorel.commandapi.network.CommandAPIPacketHandlerProvider
Type: Interface

Methods:
- CommandAPIPacketHandler<TInputChannel> getHandlerForProtocol(CommandAPIProtocol protocol)
- HandshakePacketHandler<TInputChannel> getHandshakePacketHandler()
- PlayPacketHandler<TInputChannel> getPlayPacketHandler()

### Class: dev.jorel.commandapi.network.HandshakePacketHandler
Type: Interface
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandler

Methods:
- V handleProtocolVersionTooOldPacket(T sender, int packet)
- V handleSetVersionPacket(T, int)
- V handlePacket(T sender, int packet)

### Class: dev.jorel.commandapi.network.PlayPacketHandler
Type: Interface
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandler

Methods:
- V handleUpdateRequirementsPacket(T, int)
- V handlePacket(T sender, int packet)

### Class: dev.jorel.commandapi.network.CommandAPIMessenger
Type: Abstract Class

Methods:
- V sendPacket(T target, O packet)
- I getConnectionProtocolVersion(T)
- void close()

### Class: dev.jorel.commandapi.network.CommandAPIProtocol
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- HANDSHAKE
- PLAY

Methods:
- String getChannelIdentifier()
- **static** CommandAPIProtocol valueOf(String name)
- **static** CommandAPIProtocol[] values()
- I getId(Class<CommandAPIPacket> clazz)
- **static** CommandAPIProtocol getProtocolForChannel(String channelIdentifier)
- Set<Class<CommandAPIPacket>> getAllPacketTypes()
- CommandAPIPacket createPacket(int id, FriendlyByteBuffer buffer)
- **static** CommandAPIProtocol getProtocolForPacket(Class<CommandAPIPacket> clazz)
- **static** Set<String> getAllChannelIdentifiers()

### Class: dev.jorel.commandapi.network.FriendlyByteBuffer
Type: Class

Constructors:
- FriendlyByteBuffer(byte[] bytes)

Methods:
- void writeInt(int i) throws IllegalStateException
- void writeByte(byte b) throws IllegalStateException
- void writeByte(int i) throws IllegalStateException
- void checkWriteIndexIsInBounds() throws IllegalStateException
- void checkWriteIndexIsInBounds(int writeIndex) throws IllegalStateException
- boolean isReadIndexOutOfBounds()
- boolean isReadIndexOutOfBounds(int readIndex)
- String readString(int maxLength) throws IllegalStateException
- byte[] getRemainingBytes() throws IllegalStateException
- void setReadIndex(int index) throws IllegalStateException
- int getReadIndex()
- void resetIndices()
- void writeBytes(byte[] bytes) throws IllegalStateException
- int countReadableBytes()
- void setWriteIndex(int index) throws IllegalStateException
- int getWriteIndex()
- byte[] toByteArray() throws IllegalStateException
- void writeVarInt(int value) throws IllegalStateException
- byte[] readBytes(int n) throws IllegalStateException
- int countTotalBytes()
- void checkReadIndexIsInBounds() throws IllegalStateException
- void checkReadIndexIsInBounds(int readIndex) throws IllegalStateException
- int readInt() throws IllegalStateException
- byte readByte() throws IllegalStateException
- void writeString(String string, int maxLength)
- boolean isWriteIndexOutOfBounds()
- boolean isWriteIndexOutOfBounds(int writeIndex)
- int readVarInt() throws IllegalStateException

### Class: dev.jorel.commandapi.network.VelocityCommandAPIMessenger
Type: Class
Extends: dev.jorel.commandapi.network.CommandAPIMessenger

Constructors:
- VelocityCommandAPIMessenger(Object plugin, ProxyServer proxy)

Methods:
- void sendRawBytes(CommandAPIProtocol protocol, ChannelMessageSink target, byte[] bytes)
- void sendRawBytes(CommandAPIProtocol, Object, byte[])
- void setPlayerProtocolVersion(Player player, int protocolVersion)
- void onPlayerLeave(DisconnectEvent event)
- void setServerProtocolVersion(ServerConnection server, int protocolVersion)
- void onServerConnected(ServerPostConnectEvent event)
- void onPluginMessageEvent(PluginMessageEvent event)
- int getConnectionProtocolVersion(ChannelMessageSink target)
- int getConnectionProtocolVersion(Object)
- void close()

### Class: dev.jorel.commandapi.network.VelocityHandshakePacketHandler
Type: Class
Implements: dev.jorel.commandapi.network.HandshakePacketHandler

Methods:
- void handleSetVersionPacket(ChannelMessageSource sender, SetVersionPacket packet)
- void handleSetVersionPacket(Object, SetVersionPacket)

### Class: dev.jorel.commandapi.network.VelocityPacketHandlerProvider
Type: Class
Implements: dev.jorel.commandapi.network.CommandAPIPacketHandlerProvider

Methods:
- VelocityHandshakePacketHandler getHandshakePacketHandler()
- HandshakePacketHandler getHandshakePacketHandler()
- VelocityPlayPacketHandler getPlayPacketHandler()
- PlayPacketHandler getPlayPacketHandler()

### Class: dev.jorel.commandapi.network.VelocityPlayPacketHandler
Type: Class
Implements: dev.jorel.commandapi.network.PlayPacketHandler

Methods:
- void handleUpdateRequirementsPacket(ChannelMessageSource sender, UpdateRequirementsPacket packet)
- void handleUpdateRequirementsPacket(Object, UpdateRequirementsPacket)

## Package: dev.jorel.commandapi.network.packets

### Class: dev.jorel.commandapi.network.packets.ProtocolVersionTooOldPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Constructors:
- ProtocolVersionTooOldPacket(int protocolVersion, String reason)

Methods:
- String reason()
- int hashCode()
- boolean equals(Object o)
- int protocolVersion()
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion)
- **static** ProtocolVersionTooOldPacket deserialize(FriendlyByteBuffer buffer)

### Class: dev.jorel.commandapi.network.packets.SetVersionPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Constructors:
- SetVersionPacket(int protocolVersion)

Methods:
- int hashCode()
- boolean equals(Object o)
- int protocolVersion()
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion)
- **static** SetVersionPacket deserialize(FriendlyByteBuffer buffer)

### Class: dev.jorel.commandapi.network.packets.UpdateRequirementsPacket
Type: Class
Extends: java.lang.Record
Implements: dev.jorel.commandapi.network.CommandAPIPacket

Methods:
- int hashCode()
- boolean equals(Object o)
- String toString()
- void write(FriendlyByteBuffer buffer, Object target, int protocolVersion) throws ProtocolVersionTooOldException
- **static** UpdateRequirementsPacket deserialize(FriendlyByteBuffer ignored)

## Package: dev.jorel.commandapi.wrappers

### Class: dev.jorel.commandapi.wrappers.DoubleRange
Type: Class

Constructors:
- DoubleRange(double low, double high)

Methods:
- **static** DoubleRange doubleRangeGreaterThanOrEq(double min)
- int hashCode()
- boolean equals(Object obj)
- **static** DoubleRange doubleRangeLessThanOrEq(double max)
- String toString()
- boolean isInRange(double f)
- double getUpperBound()
- double getLowerBound()

### Class: dev.jorel.commandapi.wrappers.IntegerRange
Type: Class

Constructors:
- IntegerRange(int low, int high)

Methods:
- **static** IntegerRange integerRangeGreaterThanOrEq(int min)
- **static** IntegerRange integerRangeLessThanOrEq(int max)
- int hashCode()
- boolean equals(Object obj)
- String toString()
- boolean isInRange(int i)
- int getUpperBound()
- int getLowerBound()

### Class: dev.jorel.commandapi.wrappers.MathOperation
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ADD
- ASSIGN
- DIVIDE
- MAX
- MIN
- MOD
- MULTIPLY
- SUBTRACT
- SWAP

Methods:
- int apply(int val1, int val2)
- float apply(float val1, float val2)
- **static** MathOperation valueOf(String name)
- **static** MathOperation[] values()
- String toString()
- **static** MathOperation fromString(String input)

### Class: dev.jorel.commandapi.wrappers.Rotation
Type: Class

Constructors:
- Rotation(float yaw, float pitch)

Methods:
- float getYaw()
- float getPitch()
- float getNormalizedPitch()
- int hashCode()
- boolean equals(Object obj)
- String toString()
- float getNormalizedYaw()

### Class: dev.jorel.commandapi.wrappers.Time
Type: Class

Methods:
- **static** Time seconds(int seconds)
- **static** Time ticks(int ticks)
- int hashCode()
- boolean equals(Object obj)
- **static** Time days(int days)
- String toString()