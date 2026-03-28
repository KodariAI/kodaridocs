# Spicord_5.7.2 API Reference

## Package: eu.mcdb.universal

### Class: eu.mcdb.universal.ServerInterface
Type: Interface

Methods:
- void broadcast(String)
- String getVersion()
- boolean isBukkit()
- UniversalPlayer getPlayer(UUID)
- String[] getOnlinePlayers()
- Logger getLogger()
- boolean isVelocity()
- boolean isSponge()
- Map<String, List<String>> getServersAndPlayers()
- boolean isBungeeCord()
- boolean dispatchCommand(String)
- int getOnlineCount()
- String[] getPlugins()
- void registerCommand(Object, UniversalCommand)
- int getPlayerLimit()

### Class: eu.mcdb.universal.Server
Type: Abstract Class
Implements: eu.mcdb.universal.ServerInterface

Methods:
- void registerCommandAsSpicord(UniversalCommand command)
- **static** ServerType getServerType()
- boolean isDebugEnabled()
- **static** Server getInstance()
- boolean isProxy()
- **static** void setInstance(Server instance, ServerType serverType)
- void setDebugEnabled(boolean debugEnabled)

### Class: eu.mcdb.universal.ServerType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BUKKIT
- VELOCITY
- BUNGEECORD
- SPONGE
- UNKNOWN

Methods:
- **static** ServerType auto()
- **static** ServerType valueOf(String name)
- **static** ServerType[] values()

## Package: eu.mcdb.universal.command

### Class: eu.mcdb.universal.command.UniversalCommand
Type: Abstract Class

Constructors:
- UniversalCommand(String name)
- UniversalCommand(String name, String permission, String[] aliases)

Methods:
- String[] getAliases()
- List<String> getSuggestions(UniversalCommandSender, String)
- String getPermission()
- String getName()
- boolean onCommand(UniversalCommandSender, String[])
- void register(Object plugin)

### Class: eu.mcdb.universal.command.UniversalCommandSender
Type: Abstract Class

Methods:
- boolean isPlayer()
- UniversalPlayer getPlayer()
- String getName()
- boolean hasPermission(String)
- void sendMessage(String)
- void sendFormattedMessage(String message, Object[] args)
- void sendFormattedMessage(String message, char magicChar, Object[] args)

## Package: eu.mcdb.universal.command.api

### Class: eu.mcdb.universal.command.api.AsyncCommandHandler
Type: Interface
Implements: eu.mcdb.universal.command.api.CommandHandler

Methods:
- boolean handle(UniversalCommandSender sender, CommandParameters parameters)
- boolean handleAsync(UniversalCommandSender, CommandParameters)

### Class: eu.mcdb.universal.command.api.CommandHandler
Type: Interface

Methods:
- boolean handle(UniversalCommandSender, CommandParameters)

### Class: eu.mcdb.universal.command.api.ParameterSuggestionProvider
Type: Interface

Methods:
- List<String> suggest(String)

### Class: eu.mcdb.universal.command.api.UnparametrizedCommandHandler
Type: Interface
Implements: eu.mcdb.universal.command.api.CommandHandler

Methods:
- boolean handle(UniversalCommandSender)
- boolean handle(UniversalCommandSender sender, CommandParameters parameters)

### Class: eu.mcdb.universal.command.api.Command
Type: Class
Extends: eu.mcdb.universal.command.UniversalCommand

Constructors:
- Command(String name)
- Command(String name, String permission)
- Command(String name, String permission, String[] aliases)

Methods:
- void setUsageEnabled(boolean usageEnabled)
- Command getParent()
- String getPrefix()
- String getName()
- String getPermission()
- void setUsagePrefix(String prefix)
- void sendAllUsage(UniversalCommandSender sender)
- boolean onCommand(UniversalCommandSender sender, String[] args)
- void setAsyncCommandHandler(AsyncCommandHandler commandHandler)
- void addSubCommand(String name, CommandHandler handler)
- void addSubCommand(String name, String permission, CommandHandler handler)
- void addSubCommand(Command subcommand)
- boolean isUsageEnabled()
- Command createHelpCommand()
- String getUsage()
- CommandHandler getCommandHandler()
- List<String> getSuggestions(UniversalCommandSender sender, String args)
- void setupHelpCommand()
- void sendUsage(UniversalCommandSender sender)
- Set<Command> getSubCommands()
- Command getSubCommand(String name)
- Map<Integer, CommandParameter> getParameters()
- void setParameter(int index, CommandParameter parameter)
- void detachChilds()
- void setCommandHandler(CommandHandler commandHandler)
- void setCommandHandler(UnparametrizedCommandHandler commandHandler)

### Class: eu.mcdb.universal.command.api.CommandParameter
Type: Class

Constructors:
- CommandParameter(String name)
- CommandParameter(String name, String displayName, boolean optional, ParameterSuggestionProvider suggestionProvider)
- CommandParameter(String name, boolean optional)

Methods:
- String getName()
- String getDisplayName()
- boolean isOptional()
- void setDisplayName(String displayName)
- ParameterSuggestionProvider getSuggestionProvider()

### Class: eu.mcdb.universal.command.api.CommandParameters
Type: Class

Constructors:
- CommandParameters(Map<String, String> values)

Methods:
- String getValue(String name)
- Optional<String> getOptionalValue(String name)

## Package: eu.mcdb.universal.config

### Class: eu.mcdb.universal.config.BaseConfiguration
Type: Interface

Methods:
- List<Long> getLongList(String)
- List<Boolean> getBooleanList(String)
- void set(String, Object)
- Map<String, Object> getValues()
- void save() throws IOException
- double getDouble(String)
- double getDouble(String, double)
- Collection<String> getKeys()
- String getString(String)
- String getString(String, String)
- List<Map<**>> getMapList(String)
- List<Double> getDoubleList(String)
- long getLong(String)
- long getLong(String, long)
- int getInt(String)
- int getInt(String, int)
- boolean contains(String)
- BaseConfiguration getConfiguration(String)
- List<Float> getFloatList(String)
- List<*> getList(String)
- List<*> getList(String, List<*>)
- List<Integer> getIntegerList(String)
- Object get(String)
- Object get(String, Object)
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- List<String> getStringList(String)

### Class: eu.mcdb.universal.config.YamlConfiguration
Type: Abstract Class
Implements: eu.mcdb.universal.config.BaseConfiguration

Methods:
- **static** YamlConfiguration load(File file)
- **static** YamlConfiguration load(String file)
- String toString()
- TT to(Class<TT> clazz)

## Package: eu.mcdb.universal.player

### Class: eu.mcdb.universal.player.UniversalPlayer
Type: Class
Extends: eu.mcdb.universal.command.UniversalCommandSender
Implements: org.spicord.player.Player

Constructors:
- UniversalPlayer(String name, UUID uniqueId)

Methods:
- boolean isPlayer()
- boolean isVelocityPlayer()
- Player getVelocityPlayer()
- UniversalPlayer getPlayer()
- String getName()
- Object getHandle()
- void sendMessage(String message)
- boolean isSpongePlayer()
- boolean isOnline()
- boolean isProxiedPlayer()
- boolean isBukkitPlayer()
- Player getBukkitPlayer()
- ServerPlayer getSpongePlayer()
- UUID getUniqueId()
- boolean hasPermission(String permission)
- ProxiedPlayer getProxiedPlayer()
- boolean isBungeePlayer()

## Package: eu.mcdb.util

### Class: eu.mcdb.util.ArrayUtils
Type: Class

Methods:
- **static** [TT pop([T array)
- **static** [TT shift([T array)
- **static** [TT remove([T array, T element)
- **static** [TT push([T array, T element)

### Class: eu.mcdb.util.SLF4JWrapper
Type: Class
Extends: java.util.logging.Logger

Constructors:
- SLF4JWrapper(String logger)
- SLF4JWrapper(Logger logger)

Methods:
- Logger getSLF4JLogger()
- void log(LogRecord record)

## Package: eu.mcdb.util.chat

### Class: eu.mcdb.util.chat.ChatColor
Type: Class

Methods:
- **static** String translateAlternateColorCodes(char magic, String text)
- **static** String stripColor(String str)

## Package: org.spicord

### Class: org.spicord.SpicordPlugin
Type: Interface
Implements: org.spicord.plugin.PluginInterface

Methods:
- void reloadSpicord()
- Spicord getSpicord()

### Class: org.spicord.Library
Type: Class
Implements: java.io.Serializable

Constructors:
- Library(String name, String sha1, String url, String dontloadifclassfound)
- Library(String name, String sha1, String url)

Methods:
- String getUrl()
- byte[] download() throws IOException
- String getName()
- String getDontloadifclassfound()
- String getFileName()
- String getSha1()

### Class: org.spicord.LibraryLoader
Type: Class

Constructors:
- LibraryLoader(JarClassLoader loader, String libraries, Logger logger, File libFolder)

Methods:
- **static** boolean isForceLoad()
- void loadLibraries()
- **static** void setForceLoad(boolean forceLoad)
- void downloadLibraries() throws IOException

### Class: org.spicord.Spicord
Type: Class

Methods:
- **static** String getVersion()
- ScheduledExecutorService getThreadPool()
- void debug(String message, Object[] args)
- V callEvent(SpicordEvent<TT> eventType, T object)
- Logger getLogger()
- **static** boolean isLoaded()
- SpicordConfiguration getConfig()
- DiscordBot getBotByName(String name)
- ServiceManager getServiceManager()
- AddonManager getAddonManager()
- SpicordPlugin getPlugin()
- ServerType getServerType()
- **static** Spicord getInstance()
- V addEventListener(SpicordEvent<TT> eventType, EventHandler<TT> eventHandler)

### Class: org.spicord.SpicordCommand
Type: Class
Extends: eu.mcdb.universal.command.api.Command

Constructors:
- SpicordCommand(SpicordPlugin plugin)

No public methods found

### Class: org.spicord.SpicordLoader
Type: Class

Constructors:
- SpicordLoader(SpicordPlugin plugin)
- SpicordLoader(JarClassLoader libraryLoader, SpicordPlugin threadPool)

Methods:
- ScheduledExecutorService getThreadPool()
- void load()
- **static** V addStartupListener(EventHandler<Spicord> listener)
- Spicord getSpicord()
- SpicordConfiguration getConfig()
- void shutdown()

### Class: org.spicord.SpicordScheduler
Type: Class

Methods:
- **static** ScheduledExecutorService getDefaultScheduler()

### Class: org.spicord.SpicordServiceManager
Type: Class
Implements: org.spicord.api.services.ServiceManager

Methods:
- Z registerService(Class<Service> serviceClass, Service service)
- Z unregisterService(Class<Service> serviceClass)
- boolean unregisterService(Service service)
- TT getService(Class<Service> serviceClass)
- TT getService(String id)
- Z isServiceRegistered(Class<Service> serviceClass)

## Package: org.spicord.addon

### Class: org.spicord.addon.AddonDescription
Type: Class

Methods:
- String getVersion()
- String getLanguage()
- String getName()
- String getAuthor()
- String[] getModules()
- String getId()
- String getMain()

### Class: org.spicord.addon.AddonManager
Type: Class

Constructors:
- AddonManager(Spicord spicord, Logger logger)

Methods:
- Set<SimpleAddon> getAddons(DiscordBot bot)
- Set<SimpleAddon> getAddons()
- SimpleAddon getAddonById(String id)
- boolean registerAddon(SimpleAddon addon)
- boolean registerAddon(SimpleAddon addon, PluginInterface plugin)
- boolean registerAddon(SimpleAddon addon, boolean initFields)
- boolean unregisterAddon(SimpleAddon addon)
- boolean unregisterAddon(String id)
- boolean isRegistered(SimpleAddon addon)
- boolean isRegistered(String id)
- void loadAddons(DiscordBot bot)
- void loadAddons(File addonsDir)

## Package: org.spicord.addon.internal

### Class: org.spicord.addon.internal.InfoAddon
Type: Class
Extends: org.spicord.api.addon.SimpleAddon

Methods:
- void handleCommand(SlashCommandInteractionEvent event)
- void onReady(DiscordBot bot)

### Class: org.spicord.addon.internal.PlayersAddon
Type: Class
Extends: org.spicord.api.addon.SimpleAddon

Methods:
- void handleCommand(SlashCommandInteractionEvent event)
- void onReady(DiscordBot bot)

### Class: org.spicord.addon.internal.PluginsAddon
Type: Class
Extends: org.spicord.api.addon.SimpleAddon

Methods:
- void handleCommand(SlashCommandInteractionEvent event)
- void onReady(DiscordBot bot)

## Package: org.spicord.api.addon

### Class: org.spicord.api.addon.Addon
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Addon$ServerSoftware[] supportedServers()
- String name()
- String id()
- String version()
- String[] authors()

### Class: org.spicord.api.addon.Addon$ServerSoftware
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ALL
- SPIGOT
- SPONGE
- BUNGEECORD
- VELOCITY

Methods:
- **static** Addon$ServerSoftware valueOf(String name)
- **static** Addon$ServerSoftware[] values()

### Class: org.spicord.api.addon.JavaScriptAddon
Type: Class
Extends: org.spicord.api.addon.SimpleAddon

Constructors:
- JavaScriptAddon(String name, String id, String author, String version, JavaScriptBaseAddon _commands, ScriptEngine engine)

Methods:
- Collection<GatewayIntent> getRequiredIntents()
- void onShutdown(DiscordBot bot)
- void onLoad(DiscordBot bot)
- void onDisable()
- void onReady(DiscordBot bot)

### Class: org.spicord.api.addon.JavaScriptBaseAddon
Type: Class

Methods:
- String[] getRequiredIntents()
- Object get(String action)
- Map<String, Object> buildCommands()
- void setRequiredIntents(String[] requiredIntents)
- void on(String action, Object function)

### Class: org.spicord.api.addon.SimpleAddon
Type: Abstract Class

Constructors:
- SimpleAddon(String name, String id, String author)
- SimpleAddon(String name, String id, String author, String version)
- SimpleAddon(String name, String id, String author, String[] commands)
- SimpleAddon(String name, String id, String author, String version, String[] commands)

Methods:
- String getVersion()
- Collection<GatewayIntent> getRequiredIntents()
- void onUnload(DiscordBot bot)
- String getName()
- String getAuthor()
- boolean isJavaScriptAddon()
- void onCommand(DiscordBotCommand command, String[] args)
- Logger getLogger()
- String getId()
- void onUnregister(Spicord spicord)
- File getDataFolder()
- File getFile()
- void onDisable()
- String[] getCommands()
- void onRegister(Spicord spicord)
- void initFields(Spicord spicord, File file, File dataFolder, Logger logger)
- void onShutdown(DiscordBot bot)
- void onLoad(DiscordBot bot)
- Spicord getSpicord()
- void onMessageReceived(DiscordBot bot, MessageReceivedEvent event)
- void onReady(DiscordBot bot)

## Package: org.spicord.api.bot

### Class: org.spicord.api.bot.SimpleBot
Type: Abstract Class

Constructors:
- SimpleBot(String name, String token)

Methods:
- String getName()

## Package: org.spicord.api.bot.command

### Class: org.spicord.api.bot.command.BotCommand
Type: Interface

Methods:
- void onCommand(DiscordBotCommand, String[])

### Class: org.spicord.api.bot.command.SimpleCommand
Type: Abstract Class

Constructors:
- SimpleCommand(String[] arguments)

Methods:
- String[] getArguments()

## Package: org.spicord.api.services

### Class: org.spicord.api.services.Service
Type: Interface

Methods:
- void reload()
- void stop()
- void load()
- String id()

### Class: org.spicord.api.services.ServiceManager
Type: Interface

Methods:
- Z registerService(Class<Service>, Service)
- Z unregisterService(Class<Service>)
- boolean unregisterService(Service)
- TT getService(Class<Service>)
- TT getService(String)
- Z isServiceRegistered(Class<Service>)

## Package: org.spicord.api.services.linking

### Class: org.spicord.api.services.linking.LinkingService
Type: Interface
Implements: org.spicord.api.services.Service

Methods:
- boolean isLinked(UniversalPlayer)
- boolean isLinked(UUID)
- boolean isLinked(Long)
- boolean removePending(PendingLinkData)
- LinkData[] getLinked()
- boolean removeLink(LinkData)
- LinkData getLinkData(Long)
- LinkData getLinkData(UUID)
- boolean addPending(PendingLinkData)
- PendingLinkData[] getPending()
- boolean isPending(UniversalPlayer)
- **static** boolean isValidMinecraftName(String name)
- LinkData createLink(PendingLinkData, long)

### Class: org.spicord.api.services.linking.LinkData
Type: Class

Constructors:
- LinkData(Long discordId, String playerName, String playerId)

Methods:
- String getName()
- long getDiscordId()
- int hashCode()
- boolean equals(Object o)
- Long getId()
- String getPlayerName()
- UUID getUniqueId()
- UUID getPlayerId()

### Class: org.spicord.api.services.linking.PendingLinkData
Type: Class

Constructors:
- PendingLinkData(String name, UUID uniqueId)

Methods:
- String getName()
- **static** PendingLinkData of(UniversalPlayer player)
- LinkData create(long discordId)
- **static** PendingLinkData forPlayer(UniversalPlayer player)
- String getPlayerName()
- LinkData complete(long discordId)
- UUID getUniqueId()
- UUID getPlayerId()

## Package: org.spicord.bot

### Class: org.spicord.bot.DiscordBot
Type: Class
Extends: org.spicord.api.bot.SimpleBot

Constructors:
- DiscordBot(Spicord spicord, String name, String commandHandlers, boolean enabled, List<String> addons, boolean initialCommandCleanup, boolean commandSupportEnabled, String commandPrefix)

Methods:
- Collection<String> getAddons()
- boolean isPrivilegedUser(User user)
- boolean isReady()
- V onCommand(String name, Consumer<DiscordBotCommand> command)
- void onCommand(String name, BotCommand command)
- String getCommandPrefix()
- boolean isConnected()
- boolean isCommandSupportEnabled()
- String getJdaStatus()
- DiscordBot$BotStatus getStatus()
- void unregisterCommand(String name)
- DiscordBot$Presence getPresence()
- SlashCommand commandBuilder(String name, String description)
- boolean isEnabled()
- V unloadAddon(T addon)
- JDA getJda()
- long getBotId()
- void registerCommand(SlashCommand command, Guild guild)
- void registerCommand(SlashCommand command)
- void registerCommand(DiscordCommand command)
- boolean isDisabled()
- void loadAddon(SimpleAddon addon)
- void unregisterCommands(String[] names)
- void addEventListener(ListenerAdapter listener)

### Class: org.spicord.bot.DiscordBot$BotStatus
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- READY
- OFFLINE
- STARTING
- STOPPING
- UNKNOWN

Methods:
- **static** DiscordBot$BotStatus valueOf(String name)
- **static** DiscordBot$BotStatus[] values()
- String toString()

### Class: org.spicord.bot.DiscordBot$Presence
Type: Class

Constructors:
- DiscordBot$Presence(DiscordBot this$0)

Methods:
- void setCustom(String value)
- void setStreaming(String value)
- void setOnline()
- void setCompeting(String value)
- void setWatching(String value)
- void setListening(String value)
- void setDoNotDisturb()
- void setIdle()
- void setInvisible()
- void setPlaying(String value)

### Class: org.spicord.bot.DiscordBotLoader
Type: Class

Methods:
- **static** boolean startBot(DiscordBot bot)
- **static** void shutdownBot(DiscordBot bot)

## Package: org.spicord.bot.command

### Class: org.spicord.bot.command.DiscordCommandHandler
Type: Interface
Implements: eu.mcdb.universal.command.api.CommandHandler

Methods:
- boolean handle(DiscordCommandSender, GuildMessageChannel, CommandParameters)
- boolean handle(UniversalCommandSender sender, CommandParameters parameters)

### Class: org.spicord.bot.command.SlashCommandCompleter
Type: Interface

Methods:
- void handle(CommandAutoCompleteInteractionEvent)

### Class: org.spicord.bot.command.SlashCommandExecutor
Type: Interface

Methods:
- void handle(SlashCommandInteractionEvent)

### Class: org.spicord.bot.command.UnparametrizedDiscordCommandHandler
Type: Interface
Implements: org.spicord.bot.command.DiscordCommandHandler

Methods:
- boolean handle(DiscordCommandSender, GuildMessageChannel)
- boolean handle(DiscordCommandSender sender, GuildMessageChannel channel, CommandParameters parameters)

### Class: org.spicord.bot.command.DiscordBotCommand
Type: Class
Extends: org.spicord.api.bot.command.SimpleCommand

Constructors:
- DiscordBotCommand(String name, String[] args, Message message)

Methods:
- Guild getGuild()
- String getPrefix()
- String getName()
- GuildMessageChannel getChannel()
- User getAuthor()
- String getAuthorAsMention()
- Message getMessage()
- Member getMember()
- String toString()
- Member getSender()
- void reply(String message)
- void reply(String message, boolean wrap)
- void reply(Embed embed)
- void reply(MessageEmbed embed)

### Class: org.spicord.bot.command.DiscordCommand
Type: Class
Extends: eu.mcdb.universal.command.api.Command
Implements: org.spicord.api.bot.command.BotCommand

Constructors:
- DiscordCommand(String name)
- DiscordCommand(String name, Permission permission)
- DiscordCommand(String name, Permission permission, String[] aliases)

Methods:
- void onCommand(DiscordBotCommand command, String[] args)
- void setCommandHandler(DiscordCommandHandler commandHandler)
- void setCommandHandler(UnparametrizedDiscordCommandHandler commandHandler)
- void addSubCommand(String name, DiscordCommandHandler handler)
- void addSubCommand(String name, String permission, DiscordCommandHandler handler)

### Class: org.spicord.bot.command.DiscordCommandSender
Type: Class
Extends: eu.mcdb.universal.command.UniversalCommandSender

Constructors:
- DiscordCommandSender(DiscordBotCommand member)

Methods:
- String getName()
- boolean hasPermission(String permission)
- void sendMessage(String message)

### Class: org.spicord.bot.command.SlashCommand
Type: Class

Constructors:
- SlashCommand(String name, String description)

Methods:
- String getName()
- SlashCommand addSubcommand(SlashCommand subcommand)
- SubcommandData toJdaSubcommand()
- boolean isNsfw()
- SlashCommandExecutor getExecutor()
- SlashCommand setDefaultPermissions(Collection<Permission> permissions)
- SlashCommand setDefaultPermissions(Permission[] permissions)
- SlashCommandCompleter getCompleter()
- String getDescription()
- SlashCommand setExecutor(SlashCommandExecutor executor)
- SlashCommand setGuildOnly(boolean guildOnly)
- List<SlashCommandGroup> getSubcommandGroups()
- DefaultMemberPermissions getDefaultMemberPermissions()
- SlashCommand addOption(OptionType type, String name, String description)
- SlashCommand addOption(OptionType type, String name, String description, boolean required)
- SlashCommand addOption(OptionType type, String name, String description, boolean required, boolean autoComplete)
- SlashCommand setCompleter(SlashCommandCompleter completer)
- SlashCommand setNSFW(boolean nsfw)
- boolean isSingle()
- List<SlashCommand> getSubcommands()
- boolean isGuildOnly()
- List<SlashCommandOption> getOptions()
- SlashCommand addSubcommandGroup(SlashCommandGroup group)

### Class: org.spicord.bot.command.SlashCommandGroup
Type: Class

Constructors:
- SlashCommandGroup(String name, String description)

Methods:
- SubcommandGroupData buildGroup()
- String getName()
- SlashCommandGroup addSubcommand(SlashCommand subcommand)
- List<SlashCommand> getSubcommands()
- String getDescription()

### Class: org.spicord.bot.command.SlashCommandHandler
Type: Class

Constructors:
- SlashCommandHandler(SlashCommandExecutor executor, SlashCommandCompleter completer)

Methods:
- void complete(CommandAutoCompleteInteractionEvent event)
- void execute(SlashCommandInteractionEvent event)

### Class: org.spicord.bot.command.SlashCommandOption
Type: Class

Constructors:
- SlashCommandOption(OptionType type, String name, String description, boolean required, boolean autoComplete)

Methods:
- boolean isRequired()
- String getName()
- OptionData toJdaOption()
- boolean isAutoComplete()
- OptionType getType()
- String getDescription()

## Package: org.spicord.bukkit

### Class: org.spicord.bukkit.BukkitJDADetector
Type: Class

Methods:
- **static** void checkOtherJDA(SpicordBukkit spicordPlugin)

### Class: org.spicord.bukkit.SpicordBukkit
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin
Implements: org.spicord.SpicordPlugin

Methods:
- void reloadSpicord()
- void onLoad()
- Spicord getSpicord()
- void onEnable()
- void onDisable()
- File getFile()

## Package: org.spicord.bukkit.server

### Class: org.spicord.bukkit.server.BukkitCommandExecutor
Type: Class
Implements: org.bukkit.command.CommandExecutor, org.bukkit.command.TabCompleter

Constructors:
- BukkitCommandExecutor(UniversalCommand command)

Methods:
- boolean onCommand(CommandSender sender, Command, String, String[] args)
- List<String> onTabComplete(CommandSender sender, Command cmd, String label, String args)
- **static** void register(JavaPlugin plugin, UniversalCommand command)

### Class: org.spicord.bukkit.server.BukkitCommandSender
Type: Class
Extends: eu.mcdb.universal.command.UniversalCommandSender

Constructors:
- BukkitCommandSender(CommandSender sender)

Methods:
- boolean hasPermission(String permission)
- void sendMessage(String message)

### Class: org.spicord.bukkit.server.BukkitPlayer
Type: Class
Extends: eu.mcdb.universal.player.UniversalPlayer

Constructors:
- BukkitPlayer(Player player)

Methods:
- boolean hasPermission(String permission)
- Object getHandle()
- void sendMessage(String message)
- boolean isOnline()
- Player getBukkitPlayer()

### Class: org.spicord.bukkit.server.BukkitServer
Type: Class
Extends: eu.mcdb.universal.Server

Constructors:
- BukkitServer(Server server, JavaPlugin plugin)

Methods:
- void broadcast(String message)
- String getVersion()
- boolean dispatchCommand(String command)
- UniversalPlayer getPlayer(UUID uuid)
- String[] getOnlinePlayers()
- int getOnlineCount()
- Logger getLogger()
- String[] getPlugins()
- void registerCommand(Object plugin, UniversalCommand command)
- Map<String, List<String>> getServersAndPlayers()
- int getPlayerLimit()
- Runnable registerListener(Class<TT> event, Consumer<TT> handler)

## Package: org.spicord.bungee

### Class: org.spicord.bungee.BungeeJDADetector
Type: Class

Methods:
- **static** Set<ClassLoader> checkOtherJDA(SpicordBungee spicordPlugin)

### Class: org.spicord.bungee.SpicordBungee
Type: Class
Extends: net.md_5.bungee.api.plugin.Plugin
Implements: org.spicord.SpicordPlugin

Methods:
- void reloadSpicord()
- void onLoad()
- Spicord getSpicord()
- void onEnable()
- void onDisable()

## Package: org.spicord.bungee.server

### Class: org.spicord.bungee.server.BungeeCommandExecutor
Type: Class
Extends: net.md_5.bungee.api.plugin.Command
Implements: net.md_5.bungee.api.plugin.TabExecutor

Constructors:
- BungeeCommandExecutor(UniversalCommand command)

Methods:
- Iterable<String> onTabComplete(CommandSender sender, String args)
- void execute(CommandSender sender, String[] args)
- **static** void register(Plugin plugin, UniversalCommand command)

### Class: org.spicord.bungee.server.BungeeCommandSender
Type: Class
Extends: eu.mcdb.universal.command.UniversalCommandSender

Constructors:
- BungeeCommandSender(CommandSender sender)

Methods:
- boolean hasPermission(String permission)
- void sendMessage(String message)

### Class: org.spicord.bungee.server.BungeeEventProcessor
Type: Class

Methods:
- void handle(Event event)
- Runnable registerEvent(Class<TT> event, Consumer<TT> handler)

### Class: org.spicord.bungee.server.BungeeListenerAdapter
Type: Class
Implements: net.md_5.bungee.api.plugin.Listener

Constructors:
- BungeeListenerAdapter(BungeeEventProcessor eventProcessor)

Methods:
- void onLogin(LoginEvent event)
- void onProxyReload(ProxyReloadEvent event)
- void onPreLogin(PreLoginEvent event)
- void onPlayerDisconnect(PlayerDisconnectEvent event)
- void onProxyPing(ProxyPingEvent event)
- void onServerConnected(ServerConnectedEvent event)
- void onPluginMessage(PluginMessageEvent event)
- void onPermissionCheck(PermissionCheckEvent event)
- void onServerKick(ServerKickEvent event)
- void onServerConnect(ServerConnectEvent event)
- void onChat(ChatEvent event)
- void onClientConnect(ClientConnectEvent event)
- void onServerSwitch(ServerSwitchEvent event)
- void onSettingsChanged(SettingsChangedEvent event)
- void onPostLogin(PostLoginEvent event)
- void onTabCompleteResponse(TabCompleteResponseEvent event)
- void onTabComplete(TabCompleteEvent event)
- void onPlayerHandshake(PlayerHandshakeEvent event)
- void onServerDisconnect(ServerDisconnectEvent event)

### Class: org.spicord.bungee.server.BungeePlayer
Type: Class
Extends: eu.mcdb.universal.player.UniversalPlayer

Constructors:
- BungeePlayer(ProxiedPlayer player)

Methods:
- boolean hasPermission(String permission)
- ProxiedPlayer getProxiedPlayer()
- Object getHandle()
- void sendMessage(String message)
- boolean isOnline()

### Class: org.spicord.bungee.server.BungeeServer
Type: Class
Extends: eu.mcdb.universal.Server

Constructors:
- BungeeServer(ProxyServer server, Plugin plugin)

Methods:
- void broadcast(String message)
- String getVersion()
- boolean dispatchCommand(String command)
- UniversalPlayer getPlayer(UUID uuid)
- String[] getOnlinePlayers()
- int getOnlineCount()
- Logger getLogger()
- String[] getPlugins()
- void registerCommand(Object plugin, UniversalCommand command)
- Map<String, List<String>> getServersAndPlayers()
- int getPlayerLimit()
- Runnable registerListener(Class<TT> event, Consumer<TT> handler)

## Package: org.spicord.config

### Class: org.spicord.config.SpicordConfig
Type: Class

Methods:
- SpicordConfig$JDALogging getJdaLogging()
- String getIntegratedAddonFooter()
- int getLoadDelay()
- SpicordConfig$Bot[] getBots()

### Class: org.spicord.config.SpicordConfig$Bot
Type: Class

Methods:
- String getName()
- List<String> getAddons()
- String getToken()
- boolean isEnabled()
- String getCommandPrefix()
- boolean isCommandSupportEnabled()
- boolean isInitialCommandCleanupEnabled()

### Class: org.spicord.config.SpicordConfig$JDALogging
Type: Class

Methods:
- boolean isDebug()
- boolean isEnabled()

### Class: org.spicord.config.SpicordConfiguration
Type: Class

Constructors:
- SpicordConfiguration(Spicord spicord, File dataFolder)

Methods:
- SpicordConfiguration$ConfigurationManager getManager()
- void load()
- void save()
- String getIntegratedAddonFooter()
- int getLoadDelay()
- boolean isJdaMessagesEnabled()
- void saveDefault()
- boolean isDebugEnabled()
- File getDataFolder()
- Set<DiscordBot> getBots()

### Class: org.spicord.config.SpicordConfiguration$ConfigurationManager
Type: Class

Constructors:
- SpicordConfiguration$ConfigurationManager(SpicordConfiguration this$0, SpicordConfig conf)

Methods:
- void removeAddonFromBot(String addonKey, String botName)
- void addAddonToBot(String addonKey, String botName)

## Package: org.spicord.embed

### Class: org.spicord.embed.Embed
Type: Class
Implements: java.io.Serializable

Constructors:
- Embed(String description)
- Embed(String title, String description)

Methods:
- int getVersion()
- **static** Embed fromWebhook(Webhook webhook)
- Embed setPlaceholders(User user)
- Message sendToChannel(GuildMessageChannel channel)
- Embed unserialize(byte[] data) throws IOException
- boolean hasContent()
- Embed$EmbedData getEmbedData()
- String getContent()
- void sendToChannelAsync(GuildMessageChannel channel)
- boolean hasEmbedData()
- Webhook toWebhook()
- byte[] serialize() throws IOException
- String toJson()
- MessageEmbed toJdaEmbed()
- Embed clone()
- Object clone() throws CloneNotSupportedException
- **static** Embed fromJson(String json)
- String toString()
- **static** Embed fromString(String content)

### Class: org.spicord.embed.Embed$Author
Type: Class
Implements: java.io.Serializable

Constructors:
- Embed$Author(Embed this$0)

Methods:
- String getUrl()
- boolean hasUrl()
- String getName()
- String getIconUrl()
- boolean hasIconUrl()

### Class: org.spicord.embed.Embed$EmbedData
Type: Class
Implements: java.io.Serializable

Methods:
- boolean hasThumbnail()
- Embed$Footer getFooter()
- boolean hasFields()
- Embed$Author getAuthor()
- Integer getColor()
- boolean hasDescription()
- boolean hasImage()
- String getDescription()
- boolean hasTimestamp()
- String getUrl()
- boolean hasUrl()
- Embed$Field[] getFields()
- String getTitle()
- void removeAuthor()
- OffsetDateTime getTimestamp()
- String getImageUrl()
- String getThumbnailUrl()
- boolean hasAuthor()
- boolean hasFooter()
- boolean hasTitle()

### Class: org.spicord.embed.Embed$Field
Type: Class
Implements: java.io.Serializable

Constructors:
- Embed$Field(Embed this$0)

Methods:
- String getValue()
- String getName()
- Boolean isInline()

### Class: org.spicord.embed.Embed$Footer
Type: Class
Implements: java.io.Serializable

Constructors:
- Embed$Footer(Embed this$0)

Methods:
- String getText()
- String getIconUrl()

### Class: org.spicord.embed.Embed$Image
Type: Class
Implements: java.io.Serializable

Constructors:
- Embed$Image(Embed this$0)

No public methods found

### Class: org.spicord.embed.Embed$Thumbnail
Type: Class
Implements: java.io.Serializable

Constructors:
- Embed$Thumbnail(Embed this$0)

No public methods found

### Class: org.spicord.embed.EmbedLoader
Type: Class

Methods:
- void load(File dir)
- **static** EmbedLoader extractAndLoad(File file, File out) throws IOException
- Embed getEmbedByName(String name)

### Class: org.spicord.embed.EmbedParser
Type: Class

Methods:
- **static** Embed parse(String json)

### Class: org.spicord.embed.EmbedSender
Type: Class

Methods:
- **static** MessageCreateAction prepare(GuildMessageChannel channel, Embed embed)

### Class: org.spicord.embed.Webhook
Type: Class

Constructors:
- Webhook(String content, Embed$EmbedData[] embeds)

Methods:
- void setAvatarUrl(String avatarUrl)
- String getAvatarUrl()
- **static** Webhook fromEmbed(Embed embed)
- Embed toEmbed()
- String toJson()
- void sendTo(String webhookUrl) throws IOException
- void setUsername(String username)
- String getContent()
- void setUserFromEmbedData()
- String toString()
- Embed$EmbedData[] getEmbeds()
- String getUsername()

## Package: org.spicord.event

### Class: org.spicord.event.EventHandler
Type: Interface

Methods:
- V handleSafe(T object)
- V handle(T)

### Class: org.spicord.event.SpicordEvent
Type: Class

Methods:
- **static** SpicordEvent<*> values()

## Package: org.spicord.fix

### Class: org.spicord.fix.FixClassLoaderPosition
Type: Class

Methods:
- **static** boolean init(boolean isBukkit)
- **static** boolean bungee()
- **static** boolean bukkit()

### Class: org.spicord.fix.Fixes
Type: Class

Methods:
- **static** void checkForceload(SpicordPlugin plugin)
- **static** void checkLoader(SpicordPlugin plugin, boolean isBukkit)

## Package: org.spicord.player

### Class: org.spicord.player.Player
Type: Interface

Methods:
- String getName()
- boolean hasPermission(String)
- Object getHandle()
- void sendMessage(String)
- boolean isOnline()
- UUID getUniqueId()

## Package: org.spicord.plugin

### Class: org.spicord.plugin.PluginInterface
Type: Interface

Methods:
- Logger getLogger()
- File getDataFolder()
- File getFile()

### Class: org.spicord.plugin.VelocityPlugin
Type: Abstract Class

Constructors:
- VelocityPlugin(ProxyServer server)
- VelocityPlugin(ProxyServer server, PluginContainer plugin)

Methods:
- **static** ProxyServer getProxyServer()
- Logger getSLF4JLogger()
- **static** EventManager getEventManager()
- Logger getLogger()
- void onLoad()
- **static** CommandManager getCommandManager()
- File getDataFolder()
- void onEnable()
- File getFile()
- **static** PluginManager getPluginManager()

## Package: org.spicord.reflect

### Class: org.spicord.reflect.AccessibleObject
Type: Interface

Methods:
- TT setAccessible()
- TT setAccessible(boolean)

### Class: org.spicord.reflect.ExceptionConsumer
Type: Interface

Methods:
- TT runHandled()
- TT run() throws Exception

### Class: org.spicord.reflect.ExceptionHandler
Type: Interface

Methods:
- void handleException(Exception)

### Class: org.spicord.reflect.InvokableObject
Type: Interface

Methods:
- TT invoke(Object)
- ReflectedObject invokeReflect(Object[])

### Class: org.spicord.reflect.LambdaBuilder
Type: Interface
Implements: org.spicord.reflect.ExceptionHandler

Methods:
- MethodHandle getHandle()
- MethodHandle getHandle(MethodHandles$Lookup)
- TT createLambda(Class<TT> interfaceClass)
- TT createLambda(Class<TT> interfaceClass, MethodHandle handle, MethodHandles$Lookup lookup)
- Member getMember()

### Class: org.spicord.reflect.ReflectExceptionHandler
Type: Interface

Methods:
- void handle(Exception)

### Class: org.spicord.reflect.ConstructorAccessor
Type: Class
Extends: org.spicord.reflect.ReflectBase

Methods:
- Object newInstance(Object[] args)

### Class: org.spicord.reflect.MemberUtils
Type: Class

Methods:
- **static** boolean isStatic(Member m)
- **static** boolean isPublic(Member m)
- **static** boolean isFinal(Member m)
- **static** boolean isAbstract(Member m)

### Class: org.spicord.reflect.ReflectBase
Type: Class
Implements: org.spicord.reflect.ExceptionHandler

Methods:
- void handleException(Exception e)
- TT setErrorRule(ReflectErrorRule errorRule)
- TT setErrorHandler(ReflectExceptionHandler handler)
- ReflectErrorRule getErrorRule()

### Class: org.spicord.reflect.ReflectErrorRule
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- THROW
- PRINT
- IGNORE

Methods:
- **static** ReflectErrorRule valueOf(String name)
- **static** ReflectErrorRule[] values()

### Class: org.spicord.reflect.ReflectException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- ReflectException(Throwable cause)

No public methods found

### Class: org.spicord.reflect.ReflectUtils
Type: Class

Methods:
- **static** TT getSingletonFromField(Class<TT> clazz)
- **static** Z isFunctionalInterface(Class<*> clazz)
- **static** String getCaller()
- **static** MethodHandles$Lookup getLookup(Member m)
- **static** TT consumeException(ExceptionConsumer<TT> action)
- **static** Class<*> getArrayClass(Class<*> clazz)
- **static** TT getSingletonFromMethod(Class<TT> clazz)
- **static** Method getInterfaceMethod(Class<*> interfaceClass)
- **static** Optional<Class<*>> findClass(String name)
- **static** TT getSingleton(Class<TT> clazz)
- **static** File getJarFile(Class<*> clazz)

### Class: org.spicord.reflect.ReflectedConstructor
Type: Class
Extends: org.spicord.reflect.ReflectBase
Implements: org.spicord.reflect.AccessibleObject, org.spicord.reflect.InvokableObject, org.spicord.reflect.LambdaBuilder

Methods:
- ConstructorAccessor getConstructorAccessor()
- ReflectedConstructor setAccessible(boolean flag)
- Object setAccessible(boolean)
- MethodHandle getHandle(MethodHandles$Lookup lookup)
- Member getMember()
- TT invoke(Object args)
- ReflectedObject invokeReflect(Object[] args)

### Class: org.spicord.reflect.ReflectedEnum
Type: Class

Methods:
- TT addValue(String name, Object args)

### Class: org.spicord.reflect.ReflectedField
Type: Class
Extends: org.spicord.reflect.ReflectBase
Implements: org.spicord.reflect.AccessibleObject

Constructors:
- ReflectedField(Object o, String field)
- ReflectedField(Class<*> clazz, String f)

Methods:
- TT getValue()
- TT getValue(Object obj)
- boolean isStatic()
- ReflectedField setAccessible(boolean flag)
- Object setAccessible(boolean)
- void setValue(Object value)
- void setValue(Object obj, Object value)
- ReflectedField setModifiable()
- ReflectedObject getReflectValue()

### Class: org.spicord.reflect.ReflectedMethod
Type: Class
Extends: org.spicord.reflect.ReflectBase
Implements: org.spicord.reflect.AccessibleObject, org.spicord.reflect.InvokableObject, org.spicord.reflect.LambdaBuilder

Methods:
- ReflectedMethod setAccessible(boolean flag)
- Object setAccessible(boolean)
- MethodHandle getHandle(MethodHandles$Lookup lookup)
- Member getMember()
- TT invoke(Object args)
- ReflectedObject invokeReflect(Object[] args)

### Class: org.spicord.reflect.ReflectedObject
Type: Class
Extends: org.spicord.reflect.ReflectBase

Constructors:
- ReflectedObject(Class<*> c)
- ReflectedObject(Class<*> c, Object o)
- ReflectedObject(Object o)

Methods:
- ReflectedMethod findMethod(Function<Method, Boolean> fun)
- ReflectedField getField(String name)
- boolean isEnum()
- boolean isArray()
- ReflectedMethod getMethod(String name, Class<*> parameterTypes)
- ReflectedField findField(Function<Field, Boolean> fun)
- ReflectedConstructor getConstructor(Class<*> parameterTypes)

## Package: org.spicord.script

### Class: org.spicord.script.IScriptEngine
Type: Interface

Methods:
- TT loadScript(File) throws IOException
- TT loadScript(File, ScriptEnvironment) throws IOException
- TT eval(String)
- ModuleManager getModuleManager()
- TT callFunction(Object, Object)
- TT toJava(Object)
- TT toJava(Class<TT>, Object)
- TT wrap(Object)

### Class: org.spicord.script.ModuleManager
Type: Interface

Methods:
- Object getModule(String)
- void registerBukkitModules()
- void registerDefaultModules()
- ScriptEngine getEngine()
- void registerNative(Object)
- boolean isRegistered(String)
- V register(String, Class<*>)
- void register(String, Object)

### Class: org.spicord.script.NativeMethod
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.spicord.script.Function
Type: Class

Methods:
- Object call(Object[] args)

### Class: org.spicord.script.ScriptEngine
Type: Abstract Class
Implements: org.spicord.script.IScriptEngine, java.lang.AutoCloseable

Methods:
- **static** ScriptEngine getDefaultEngine()
- **static** void registerEngine(String name, ScriptEngine instance)
- **static** V registerEngine(String name, Supplier<ScriptEngine> initializer)
- **static** ScriptEngine getEngine(String name)

### Class: org.spicord.script.ScriptEnvironment
Type: Class

Methods:
- ScriptEnvironment addEnv(String name, Object val)
- Map<String, Object> getEnv()

### Class: org.spicord.script.ScriptException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- ScriptException(String message)
- ScriptException(Throwable cause)
- ScriptException(String message, Throwable cause)

No public methods found

### Class: org.spicord.script.ScriptInfo
Type: Class

Constructors:
- ScriptInfo(File f)
- ScriptInfo(File directory, ScriptEnvironment env)

Methods:
- boolean isFile()
- Reader getReader()
- boolean exists()
- Map<String, Object> getEnvironment()
- String getDirectory()
- String getFileName()
- boolean hasEnvironment()

## Package: org.spicord.script.module

### Class: org.spicord.script.module.BukkitEvents$ListenerExecutor
Type: Interface
Implements: org.bukkit.event.Listener, org.bukkit.plugin.EventExecutor

No public methods found

### Class: org.spicord.script.module.BukkitEvents
Type: Class

Methods:
- void unregisterAll()
- V registerEvent(Class<Event> event, NativeFunction executor)

### Class: org.spicord.script.module.FileSystem
Type: Class

Methods:
- **static** String readFileSync(String path, String encoding) throws IOException

### Class: org.spicord.script.module.Native
Type: Class

Constructors:
- Native(ScriptEngine engine)

Methods:
- Object getClass(String name)
- void load(String path)
- Object get(String name)
- Class<*> getJavaClass(String name)

### Class: org.spicord.script.module.Path
Type: Class

Constructors:
- Path(ScriptEngine engine)

Methods:
- **static** String basename(String path)
- **static** String basename(String path, String ext)
- **static** String resolve(String[] paths)
- **static** String normalize(String path)
- String format(Object obj)
- **static** boolean isAbsolute(String path)
- **static** Path$PathObject parse(String path)
- **static** String join(String[] paths)
- **static** String extname(String path)
- **static** String dirname(String path)

### Class: org.spicord.script.module.Path$PathObject
Type: Class

Constructors:
- Path$PathObject(Path this$0)

No public methods found

### Class: org.spicord.script.module.Worker
Type: Class

Constructors:
- Worker(ScriptEngine engine)

Methods:
- int setTimeout(Object fn, int delay)
- int setInterval(Object fn, int delay)
- void clearTimeout(int id)
- void clearInterval(int id)

## Package: org.spicord.server.event

### Class: org.spicord.server.event.ServerEventManager
Type: Interface

Methods:
- void registerListener()

### Class: org.spicord.server.event.CancellableEvent
Type: Class
Extends: org.spicord.server.event.ServerEvent

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancelled)

### Class: org.spicord.server.event.PlayerLoginEvent
Type: Class
Extends: org.spicord.server.event.CancellableEvent

Constructors:
- PlayerLoginEvent(String name, SocketAddress address)

Methods:
- String getName()
- String getAddress()

### Class: org.spicord.server.event.PlayerPreLoginEvent
Type: Class
Extends: org.spicord.server.event.CancellableEvent

Constructors:
- PlayerPreLoginEvent(String name, SocketAddress address)

Methods:
- String getName()
- String getAddress()

### Class: org.spicord.server.event.ServerEvent
Type: Class

No public methods found

## Package: org.spicord.sponge

### Class: org.spicord.sponge.CustomClassLoader
Type: Class
Extends: java.net.URLClassLoader
Implements: org.spicord.util.JarClassLoader

Methods:
- void loadJar(Path path)

### Class: org.spicord.sponge.Log4JWrapper
Type: Class
Extends: java.util.logging.Logger

Methods:
- void log(LogRecord record)

### Class: org.spicord.sponge.SpicordSponge
Type: Class
Implements: org.spicord.SpicordPlugin

Constructors:
- SpicordSponge(Path dataFolder, Game game, PluginContainer serverInstanceSetter, Logger logger)

Methods:
- void reloadSpicord()
- void onLoadedGame(LoadedGameEvent event)
- void onStoppedGame(StoppedGameEvent event)
- Logger getLogger()
- Spicord getSpicord()
- File getDataFolder()
- File getFile()

## Package: org.spicord.sponge.server

### Class: org.spicord.sponge.server.SpongeCommandExecutor
Type: Class
Implements: org.spongepowered.api.command.Command$Raw

Constructors:
- SpongeCommandExecutor(UniversalCommand command)

Methods:
- boolean canExecute(CommandCause cause)
- CommandResult process(CommandCause cause, ArgumentReader$Mutable arguments)
- Component usage(CommandCause cause)
- Optional<Component> shortDescription(CommandCause cause)
- Optional<Component> extendedDescription(CommandCause cause)
- List<CommandCompletion> complete(CommandCause cause, ArgumentReader$Mutable arguments)
- **static** void register(Object pluginInstance, UniversalCommand command)

### Class: org.spicord.sponge.server.SpongeCommandSender
Type: Class
Extends: eu.mcdb.universal.command.UniversalCommandSender

Constructors:
- SpongeCommandSender(CommandCause cause)

Methods:
- boolean hasPermission(String permission)
- void sendMessage(String message)

### Class: org.spicord.sponge.server.SpongePlayer
Type: Class
Extends: eu.mcdb.universal.player.UniversalPlayer

Constructors:
- SpongePlayer(ServerPlayer player)

Methods:
- boolean hasPermission(String permission)
- Object getHandle()
- void sendMessage(String message)
- boolean isOnline()
- ServerPlayer getSpongePlayer()

### Class: org.spicord.sponge.server.SpongeServer
Type: Class
Extends: eu.mcdb.universal.Server

Constructors:
- SpongeServer(Game game, PluginContainer plugin)

Methods:
- void broadcast(String message)
- String getVersion()
- boolean dispatchCommand(String command)
- UniversalPlayer getPlayer(UUID uuid)
- String[] getOnlinePlayers()
- int getOnlineCount()
- Logger getLogger()
- String[] getPlugins()
- void registerCommand(Object plugin, UniversalCommand command)
- Map<String, List<String>> getServersAndPlayers()
- int getPlayerLimit()
- Runnable registerListener(Class<TT> event, Consumer<TT> handler)

## Package: org.spicord.util

### Class: org.spicord.util.JarClassLoader
Type: Interface

Methods:
- void loadJar(Path)

### Class: org.spicord.util.AbsoluteFile
Type: Class

Methods:
- **static** File of(String pathname)
- **static** File of(String parent, String child)

### Class: org.spicord.util.Conversions
Type: Class

Methods:
- **static** MessageEmbed toJdaEmbed(Embed embed)

### Class: org.spicord.util.FileSystem
Type: Class

Methods:
- **static** String readFile(String file) throws IOException
- **static** String readFile(File file) throws IOException
- **static** String readFile(String file, String charset) throws IOException
- **static** byte[] readBytes(String file) throws IOException
- **static** byte[] readBytes(Path path) throws IOException

### Class: org.spicord.util.FileUtils
Type: Class

Methods:
- **static** File getParent(File file)
- **static** void deleteOnExit(File file)

### Class: org.spicord.util.JDALoggerFactory
Type: Class
Extends: java.util.HashMap

Constructors:
- JDALoggerFactory(Spicord s)

Methods:
- boolean containsKey(Object key)
- Logger get(Object key)
- Object get(Object)
- boolean isEmpty()

### Class: org.spicord.util.JDALoggerImpl
Type: Class
Extends: org.slf4j.helpers.LegacyAbstractLogger

Constructors:
- JDALoggerImpl(String prefix, Logger log)

Methods:
- boolean isInfoEnabled()
- boolean isErrorEnabled()
- boolean isTraceEnabled()
- boolean isWarnEnabled()
- boolean isDebugEnabled()

### Class: org.spicord.util.JDAUtils
Type: Class

Methods:
- **static** CompletableFuture<Command> addSubcommand(Command command, SubcommandData data)

### Class: org.spicord.util.SpicordClassLoader
Type: Class
Implements: org.spicord.util.JarClassLoader

Constructors:
- SpicordClassLoader(ClassLoader addURL)

Methods:
- void loadJar(Path file)
- MethodHandle getAddUrlMethod(ClassLoader loader) throws ReflectiveOperationException

### Class: org.spicord.util.UpdateNotifier
Type: Class

Constructors:
- UpdateNotifier(String url, Logger log, boolean logError)

Methods:
- V checkForVersion(String version, Map<String, String> extra) throws IOException
- V checkForVersionAsync(ExecutorService executorService, String version, Map<String, String> extra)

### Class: org.spicord.util.VanishAPI
Type: Abstract Class

Methods:
- boolean isVanished(Object)
- **static** VanishAPI get()
- **static** boolean isPresent()
- boolean isVisible(Object player)
- **static** boolean isDummy()

### Class: org.spicord.util.ZipExtractor
Type: Class
Implements: java.lang.AutoCloseable

Constructors:
- ZipExtractor(File zipFile) throws IOException

Methods:
- void filter(String regex)
- void extractTo(File out) throws IOException
- void extractTo(File out, boolean replace) throws IOException
- boolean isFlatRoot()
- void setFlatRoot(boolean flatRoot)
- void reset()
- boolean hasEntry(String path)
- void close() throws IOException
- Optional<Reader> readEntry(String path) throws IOException

## Package: org.spicord.velocity

### Class: org.spicord.velocity.SpicordVelocity
Type: Class
Extends: org.spicord.plugin.VelocityPlugin
Implements: org.spicord.SpicordPlugin

Constructors:
- SpicordVelocity(ProxyServer loader, PluginContainer plugin)

Methods:
- void reloadSpicord()
- void onProxyInitialize(ProxyInitializeEvent event)
- Spicord getSpicord()
- File getFile()

## Package: org.spicord.velocity.server

### Class: org.spicord.velocity.server.VelocityCommandExecutor
Type: Class
Implements: com.velocitypowered.api.command.SimpleCommand

Constructors:
- VelocityCommandExecutor(UniversalCommand command)

Methods:
- List<String> suggest(SimpleCommand$Invocation invocation)
- List suggest(CommandInvocation)
- void execute(SimpleCommand$Invocation invocation)
- void execute(CommandInvocation)
- **static** void register(Object plugin, UniversalCommand command)

### Class: org.spicord.velocity.server.VelocityCommandSender
Type: Class
Extends: eu.mcdb.universal.command.UniversalCommandSender

Constructors:
- VelocityCommandSender(CommandSource source)

Methods:
- boolean hasPermission(String permission)
- void sendMessage(String message)

### Class: org.spicord.velocity.server.VelocityPlayer
Type: Class
Extends: eu.mcdb.universal.player.UniversalPlayer

Constructors:
- VelocityPlayer(Player player)

Methods:
- Player getVelocityPlayer()
- boolean hasPermission(String permission)
- Object getHandle()
- void sendMessage(String message)
- boolean isOnline()

### Class: org.spicord.velocity.server.VelocityServer
Type: Class
Extends: eu.mcdb.universal.Server

Constructors:
- VelocityServer(ProxyServer server, Object plugin)

Methods:
- void broadcast(String message)
- String getVersion()
- boolean dispatchCommand(String command)
- UniversalPlayer getPlayer(UUID uuid)
- String[] getOnlinePlayers()
- int getOnlineCount()
- Logger getLogger()
- String[] getPlugins()
- void registerCommand(Object plugin, UniversalCommand command)
- Map<String, List<String>> getServersAndPlayers()
- int getPlayerLimit()
- Runnable registerListener(Class<TT> event, Consumer<TT> handler)

