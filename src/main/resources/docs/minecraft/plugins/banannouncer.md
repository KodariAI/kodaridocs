# BanAnnouncer_3.0.0 API Reference

## Package: me.tini.announcer

### Class: me.tini.announcer.BanAnnouncerPlugin
Type: Interface

Methods:
- String getVersion()
- void warn(String msg, Object[] args)
- void log(String msg, Object[] args)
- Logger getLogger()
- File getDataFolder()
- BanAnnouncer getAnnouncer()
- File getFile()

### Class: me.tini.announcer.IMessenger
Type: Interface

Methods:
- boolean isAvailable()
- boolean sendMessage(String, byte[])
- void registerOutgoingChannel(String)

### Class: me.tini.announcer.BanAnnouncer
Type: Abstract Class

Constructors:
- BanAnnouncer(Config config, BanAnnouncerPlugin plugin)

Methods:
- void sendDiscordMessage(Embed)
- void loadExtensions(File folder)
- Logger getLogger()
- String processPlaceholder(PunishmentInfo info, String placeholder)
- Collection<ExtensionContainer> getExtensions()
- Config getConfig()
- Embed buildEmbed(PunishmentInfo punishment)
- **static** BanAnnouncer build(BanAnnouncerPlugin plugin, Config config)
- V registerExtension(String name, String id, Supplier<AbstractExtension> instanceSupplier, String requiredClass)
- void disable()
- boolean isEnabled()
- BanAnnouncerPlugin getPlugin()
- V registerPlaceholder(String placeholder, Function<PunishmentInfo, String> provider)
- void handlePunishment(PunishmentInfo punishment, PunishmentListener listener)
- void initialize()
- void enableExtensions()

### Class: me.tini.announcer.BanAnnouncerForward
Type: Class
Extends: me.tini.announcer.BanAnnouncer

Constructors:
- BanAnnouncerForward(Config config, BanAnnouncerPlugin messenger)

Methods:
- void sendDiscordMessage(Embed message)
- void handlePunishment(PunishmentInfo punishment, PunishmentListener listener)
- void initialize()

### Class: me.tini.announcer.BanAnnouncerWebhook
Type: Class
Extends: me.tini.announcer.BanAnnouncer

Constructors:
- BanAnnouncerWebhook(Config config, BanAnnouncerPlugin plugin)

Methods:
- void sendDiscordMessage(Embed message)
- void initialize()

### Class: me.tini.announcer.ForwardInfo
Type: Class

No public methods found

### Class: me.tini.announcer.MessageFormatter
Type: Class

Methods:
- MessageFormatter setString(String key, String value)
- Embed format(Embed embed)
- V setOtherPlaceholderHandler(Function<String, String> handler)

### Class: me.tini.announcer.PunishmentInfo
Type: Class

Constructors:
- PunishmentInfo(PunishmentInfo$Type type)

Methods:
- void setDuration(String duration)
- String getPlayer()
- long getDateEnd()
- String getLitebansServerScope()
- String getLitebansRandomId()
- void setPlayerId(String uuidDashed)
- void setLitebansRemovedByName(String litebansRemovedByName)
- String getId()
- void setDateEnd(long dateEnd)
- String getPlayerId()
- void setDateStart(long dateStart)
- boolean isRevoked()
- String getJail()
- String getDuration()
- int hashCode()
- void setStart(long dateStart)
- void setJail(String jail)
- void setReason(String reason)
- void setLitebansRandomId(String litebansRandomId)
- void setId(String id)
- void setOperator(String operator)
- void setEnd(long dateEnd)
- String getOperator()
- void setLitebansServerOrigin(String litebansServerOrigin)
- String getReason()
- void setLitebansServerScope(String litebansServerScope)
- void setPlayer(String player)
- String getLitebansRemovedByName()
- void setType(PunishmentInfo$Type type)
- long getDateStart()
- void setLitebansRemovalReason(String litebansRemovalReason)
- boolean isPermanent()
- String getLitebansRemovalReason()
- void setPermanent(boolean permanent)
- PunishmentInfo$Type getType()
- boolean equals(Object o)
- String toString()
- String getLitebansServerOrigin()

### Class: me.tini.announcer.PunishmentInfo$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- KICK
- JAIL
- UNJAIL
- BAN
- TEMPBAN
- UNBAN
- MUTE
- TEMPMUTE
- UNMUTE
- BANIP
- TEMPBANIP
- UNBANIP
- WARN
- TEMPWARN
- UNWARN
- NOTE
- UNNOTE

Methods:
- **static** PunishmentInfo$Type valueOf(String name)
- **static** PunishmentInfo$Type[] values()

### Class: me.tini.announcer.PunishmentListener
Type: Abstract Class

Constructors:
- PunishmentListener(BanAnnouncer announcer)

Methods:
- ExtensionContainer getExtensionLoader()
- String getName()
- void unregister()
- BanAnnouncer getAnnouncer()
- void handlePunishment(PunishmentInfo punishment)
- void register()

### Class: me.tini.announcer.ReloadCommand
Type: Class
Implements: me.tini.announcer.command.ICommandExecutor

Methods:
- boolean handle(ICommandSender sender, String[] args)

## Package: me.tini.announcer.command

### Class: me.tini.announcer.command.ICommandExecutor
Type: Interface

Methods:
- boolean handle(ICommandSender, String[])

### Class: me.tini.announcer.command.ICommandSender
Type: Interface

Methods:
- boolean hasPermission(String)
- String name()
- void sendMessage(String)
- UUID uniqueId()

### Class: me.tini.announcer.command.IPlugin
Type: Interface

Methods:
- void registerCommand(String, ICommandExecutor)

### Class: me.tini.announcer.command.AbstractCommandSender
Type: Abstract Class
Implements: me.tini.announcer.command.ICommandSender

Constructors:
- AbstractCommandSender(String name, UUID uuid, T handle)

Methods:
- TT getHandle()
- String name()
- UUID uniqueId()

## Package: me.tini.announcer.command.bukkit

### Class: me.tini.announcer.command.bukkit.IBukkitPlugin
Type: Interface
Implements: me.tini.announcer.command.IPlugin

Methods:
- void registerCommand(String name, ICommandExecutor command)

### Class: me.tini.announcer.command.bukkit.BukkitCommandExecutor
Type: Class
Implements: org.bukkit.command.CommandExecutor

Constructors:
- BukkitCommandExecutor(ICommandExecutor command)

Methods:
- boolean onCommand(CommandSender sender, Command command, String label, String[] args)

### Class: me.tini.announcer.command.bukkit.BukkitCommandSender
Type: Class
Extends: me.tini.announcer.command.AbstractCommandSender

Constructors:
- BukkitCommandSender(Player player)
- BukkitCommandSender(CommandSender sender)

Methods:
- boolean hasPermission(String permission)
- void sendMessage(String message)

## Package: me.tini.announcer.command.bungee

### Class: me.tini.announcer.command.bungee.IBungeePlugin
Type: Interface
Implements: me.tini.announcer.command.IPlugin

Methods:
- void registerCommand(String name, ICommandExecutor command)

### Class: me.tini.announcer.command.bungee.BungeeCommandExecutor
Type: Class
Extends: net.md_5.bungee.api.plugin.Command

Constructors:
- BungeeCommandExecutor(String name, ICommandExecutor command)

Methods:
- void execute(CommandSender sender, String[] args)

### Class: me.tini.announcer.command.bungee.BungeeCommandSender
Type: Class
Extends: me.tini.announcer.command.AbstractCommandSender

Constructors:
- BungeeCommandSender(ProxiedPlayer player)
- BungeeCommandSender(CommandSender sender)

Methods:
- boolean hasPermission(String permission)
- void sendMessage(String message)

## Package: me.tini.announcer.command.sponge

### Class: me.tini.announcer.command.sponge.ISpongePlugin
Type: Interface
Implements: me.tini.announcer.command.IPlugin

Methods:
- void registerCommand(String name, ICommandExecutor command)

### Class: me.tini.announcer.command.sponge.SpongeCommandExecutor
Type: Class
Implements: org.spongepowered.api.command.Command$Raw

Constructors:
- SpongeCommandExecutor(ICommandExecutor command)

Methods:
- boolean canExecute(CommandCause cause)
- CommandResult process(CommandCause cause, ArgumentReader$Mutable arguments) throws CommandException
- Component usage(CommandCause cause)
- Optional<Component> shortDescription(CommandCause cause)
- Optional<Component> extendedDescription(CommandCause cause)
- List<CommandCompletion> complete(CommandCause cause, ArgumentReader$Mutable arguments) throws CommandException

### Class: me.tini.announcer.command.sponge.SpongeCommandSender
Type: Class
Extends: me.tini.announcer.command.AbstractCommandSender

Constructors:
- SpongeCommandSender(ServerPlayer player)
- SpongeCommandSender(SystemSubject console)

Methods:
- boolean hasPermission(String permission)
- void sendMessage(String message)

## Package: me.tini.announcer.command.velocity

### Class: me.tini.announcer.command.velocity.IVelocityPlugin
Type: Interface
Implements: me.tini.announcer.command.IPlugin

Methods:
- ProxyServer getProxyServer()
- void registerCommand(String name, ICommandExecutor command)

### Class: me.tini.announcer.command.velocity.VelocityCommandExecutor
Type: Class
Implements: com.velocitypowered.api.command.SimpleCommand

Constructors:
- VelocityCommandExecutor(ICommandExecutor command)

Methods:
- List<String> suggest(SimpleCommand$Invocation invocation)
- List suggest(CommandInvocation)
- void execute(SimpleCommand$Invocation invocation)
- void execute(CommandInvocation)

### Class: me.tini.announcer.command.velocity.VelocityCommandSender
Type: Class
Extends: me.tini.announcer.command.AbstractCommandSender

Constructors:
- VelocityCommandSender(Player player)
- VelocityCommandSender(CommandSource source)

Methods:
- boolean hasPermission(String permission)
- void sendMessage(String message)

## Package: me.tini.announcer.config

### Class: me.tini.announcer.config.Config
Type: Class

Constructors:
- Config(BanAnnouncerPlugin dataFolder)

Methods:
- boolean isIgnoreSilent()
- void reload()
- Set<String> getEnabledExtensions()
- boolean isUseDiscordCommand()
- String getWebhookUrl()
- String getMode()
- **static** Config getInstance()
- boolean isAutoDetect()
- String getAutomaticText()
- long getChannelToAnnounce()
- String getConsoleName()
- Messages getMessages()
- String getExpiredOperatorName()

### Class: me.tini.announcer.config.Messages
Type: Class

Methods:
- File getEmbedFolder()
- Embed getUnban()
- Embed getTempban()
- Embed getUnbanip()
- Embed getTempwarn()
- Embed getNote()
- Embed getMute()
- Embed getBanip()
- Embed getBan()
- Embed getJail()
- Embed getTempbanip()
- void reload()
- Embed getUnjail()
- Embed getUnwarn()
- Embed getTempmute()
- Embed getUnmute()
- Embed getWarn()
- Embed getKick()
- EmbedLoader getEmbedLoader()
- Embed getUnnote()
- JsonObject getJson()

## Package: me.tini.announcer.embed

### Class: me.tini.announcer.embed.Embed
Type: Class
Implements: java.io.Serializable

Constructors:
- Embed(String description)
- Embed(String title, String description)

Methods:
- int getVersion()
- **static** Embed fromWebhook(Webhook webhook)
- String toJson()
- boolean hasContent()
- Embed$EmbedData getEmbedData()
- String getContent()
- Embed clone()
- Object clone() throws CloneNotSupportedException
- **static** Embed fromJson(String json)
- boolean hasEmbedData()
- String toString()
- **static** Embed fromString(String content)
- Webhook toWebhook()

### Class: me.tini.announcer.embed.Embed$Author
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

### Class: me.tini.announcer.embed.Embed$EmbedData
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

### Class: me.tini.announcer.embed.Embed$Field
Type: Class
Implements: java.io.Serializable

Constructors:
- Embed$Field(Embed this$0)

Methods:
- String getValue()
- String getName()
- Boolean isInline()

### Class: me.tini.announcer.embed.Embed$Footer
Type: Class
Implements: java.io.Serializable

Constructors:
- Embed$Footer(Embed this$0)

Methods:
- String getText()
- String getIconUrl()

### Class: me.tini.announcer.embed.Embed$Image
Type: Class
Implements: java.io.Serializable

Constructors:
- Embed$Image(Embed this$0)

No public methods found

### Class: me.tini.announcer.embed.Embed$Thumbnail
Type: Class
Implements: java.io.Serializable

Constructors:
- Embed$Thumbnail(Embed this$0)

No public methods found

### Class: me.tini.announcer.embed.EmbedLoader
Type: Class

Methods:
- void load(File dir)
- **static** EmbedLoader extractAndLoad(File file, File out) throws IOException
- Embed getEmbedByName(String name)

### Class: me.tini.announcer.embed.EmbedParser
Type: Class

Methods:
- **static** Embed parse(String json)

### Class: me.tini.announcer.embed.Webhook
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

## Package: me.tini.announcer.extension

### Class: me.tini.announcer.extension.AbstractExtension
Type: Abstract Class

Methods:
- PunishmentListener getPunishmentListener()
- String processPlaceholder(PunishmentInfo info, String placeholder)

### Class: me.tini.announcer.extension.ExtensionContainer
Type: Class

Constructors:
- ExtensionContainer(ExtensionInfo info, Supplier<AbstractExtension> instanceSupplier)

Methods:
- Supplier<AbstractExtension> getInstanceSupplier(BanAnnouncerPlugin plugin)
- String getName()
- ExtensionInfo getInfo()
- AbstractExtension getInstance()
- void close()
- boolean isInstanceCreated()

### Class: me.tini.announcer.extension.ExtensionInfo
Type: Class

Constructors:
- ExtensionInfo(String name, String id, String mainClass, String requiredClass)

Methods:
- String getMainClass()
- String getName()
- String getRequiredClass()
- boolean hasPunishmentManager()
- String getId()

### Class: me.tini.announcer.extension.FileExtensionContainer
Type: Class
Extends: me.tini.announcer.extension.ExtensionContainer

Constructors:
- FileExtensionContainer(File loader)

Methods:
- Supplier<AbstractExtension> getInstanceSupplier(BanAnnouncerPlugin plugin)
- void close()

## Package: me.tini.announcer.extension.impl.advancedban

### Class: me.tini.announcer.extension.impl.advancedban.AdvancedBanExtensionBukkit
Type: Class
Extends: me.tini.announcer.extension.AbstractExtension

Constructors:
- AdvancedBanExtensionBukkit(BanAnnouncerBukkit listener)

Methods:
- PunishmentListener getPunishmentListener()

### Class: me.tini.announcer.extension.impl.advancedban.AdvancedBanExtensionBungee
Type: Class
Extends: me.tini.announcer.extension.AbstractExtension

Constructors:
- AdvancedBanExtensionBungee(BanAnnouncerBungee listener)

Methods:
- PunishmentListener getPunishmentListener()

### Class: me.tini.announcer.extension.impl.advancedban.AdvancedBanListenerBukkit
Type: Class
Extends: me.tini.announcer.plugin.bukkit.BukkitPunishmentListener

Constructors:
- AdvancedBanListenerBukkit(BanAnnouncerBukkit plugin)

Methods:
- void onRevokePunishment(RevokePunishmentEvent event)
- void onPunishment(PunishmentEvent event)

### Class: me.tini.announcer.extension.impl.advancedban.AdvancedBanListenerBungee
Type: Class
Extends: me.tini.announcer.plugin.bungee.BungeePunishmentListener

Constructors:
- AdvancedBanListenerBungee(BanAnnouncerBungee plugin)

Methods:
- void onRevokePunishment(RevokePunishmentEvent event)
- void onPunishment(PunishmentEvent event)

### Class: me.tini.announcer.extension.impl.advancedban.AdvancedBanUtil
Type: Class

Methods:
- **static** PunishmentInfo convertPunishment(Config config, Punishment pun, boolean revoked)

## Package: me.tini.announcer.extension.impl.betterjails

### Class: me.tini.announcer.extension.impl.betterjails.BetterJailsExtension
Type: Class
Extends: me.tini.announcer.extension.AbstractExtension

Constructors:
- BetterJailsExtension(BanAnnouncerBukkit listener)

Methods:
- PunishmentListener getPunishmentListener()

### Class: me.tini.announcer.extension.impl.betterjails.BetterJailsListener
Type: Class
Extends: me.tini.announcer.plugin.bukkit.BukkitPunishmentListener

Constructors:
- BetterJailsListener(BanAnnouncerBukkit betterJails)

Methods:
- void unregister()
- void register()

### Class: me.tini.announcer.extension.impl.betterjails.TimeUtils
Type: Class

Methods:
- **static** String parseMillis(long millis)

## Package: me.tini.announcer.extension.impl.essentialsjail

### Class: me.tini.announcer.extension.impl.essentialsjail.EssentialsJailExtension
Type: Class
Extends: me.tini.announcer.extension.AbstractExtension

Constructors:
- EssentialsJailExtension(BanAnnouncerBukkit listener)

Methods:
- PunishmentListener getPunishmentListener()

### Class: me.tini.announcer.extension.impl.essentialsjail.EssentialsJailListener
Type: Class
Extends: me.tini.announcer.plugin.bukkit.BukkitPunishmentListener

Constructors:
- EssentialsJailListener(BanAnnouncerBukkit plugin)

Methods:
- void onJailStatusChange(JailStatusChangeEvent event)

## Package: me.tini.announcer.extension.impl.forward

### Class: me.tini.announcer.extension.impl.forward.ForwardExtensionBungee
Type: Class
Extends: me.tini.announcer.extension.AbstractExtension

Constructors:
- ForwardExtensionBungee(BanAnnouncerBungee listener)

Methods:
- PunishmentListener getPunishmentListener()

### Class: me.tini.announcer.extension.impl.forward.ForwardExtensionVelocity
Type: Class
Extends: me.tini.announcer.extension.AbstractExtension

Constructors:
- ForwardExtensionVelocity(BanAnnouncerVelocity listener)

Methods:
- PunishmentListener getPunishmentListener()

### Class: me.tini.announcer.extension.impl.forward.ForwardListenerBungee
Type: Class
Extends: me.tini.announcer.plugin.bungee.BungeePunishmentListener

Constructors:
- ForwardListenerBungee(BanAnnouncerBungee plugin)

Methods:
- void unregister()
- void onPluginMessage(PluginMessageEvent event)
- void register()

### Class: me.tini.announcer.extension.impl.forward.ForwardListenerVelocity
Type: Class
Extends: me.tini.announcer.plugin.velocity.VelocityPunishmentListener

Constructors:
- ForwardListenerVelocity(BanAnnouncerVelocity CHANNEL)

Methods:
- void unregister()
- void onPluginMessage(PluginMessageEvent event)
- void register()

## Package: me.tini.announcer.extension.impl.libertybans

### Class: me.tini.announcer.extension.impl.libertybans.LibertyBansExtension
Type: Class
Extends: me.tini.announcer.extension.AbstractExtension

Constructors:
- LibertyBansExtension(BanAnnouncerPlugin listener)

Methods:
- PunishmentListener getPunishmentListener()

### Class: me.tini.announcer.extension.impl.libertybans.LibertyBansListener
Type: Class
Extends: me.tini.announcer.PunishmentListener

Constructors:
- LibertyBansListener(BanAnnouncerPlugin libertyBans)

Methods:
- void unregister()
- void register()

## Package: me.tini.announcer.extension.impl.litebans

### Class: me.tini.announcer.extension.impl.litebans.LiteBansExtension
Type: Class
Extends: me.tini.announcer.extension.AbstractExtension

Constructors:
- LiteBansExtension(BanAnnouncerPlugin listener)

Methods:
- PunishmentListener getPunishmentListener()

### Class: me.tini.announcer.extension.impl.litebans.LiteBansListener
Type: Class
Extends: me.tini.announcer.PunishmentListener

Constructors:
- LiteBansListener(BanAnnouncerPlugin events)

Methods:
- void unregister()
- void handleEntry(Entry entry, boolean revoked)
- void register()

## Package: me.tini.announcer.extension.impl.maxbans

### Class: me.tini.announcer.extension.impl.maxbans.MaxBansExtension
Type: Class
Extends: me.tini.announcer.extension.AbstractExtension

Constructors:
- MaxBansExtension(BanAnnouncerBukkit listener)

Methods:
- PunishmentListener getPunishmentListener()

### Class: me.tini.announcer.extension.impl.maxbans.MaxBansListener
Type: Class
Extends: me.tini.announcer.plugin.bukkit.BukkitPunishmentListener

Constructors:
- MaxBansListener(BanAnnouncerBukkit plugin)

Methods:
- void onWarnUser(WarnUserEvent event)
- void onKickUser(KickUserEvent event)
- void onUnbanUser(UnbanUserEvent event)
- void onUnmuteUser(UnmuteUserEvent event)
- void onMuteAddress(MuteAddressEvent event)
- void onUnbanAddress(UnbanAddressEvent event)
- void onUnmuteAddress(UnmuteAddressEvent event)
- void onMuteUser(MuteUserEvent event)
- void onBanUser(BanUserEvent event)
- void onBanAddress(BanAddressEvent event)

## Package: me.tini.announcer.extension.impl.spongevanilla

### Class: me.tini.announcer.extension.impl.spongevanilla.SpongeVanillaExtension
Type: Class
Extends: me.tini.announcer.extension.AbstractExtension

Constructors:
- SpongeVanillaExtension(BanAnnouncerSponge listener)

Methods:
- PunishmentListener getPunishmentListener()

### Class: me.tini.announcer.extension.impl.spongevanilla.SpongeVanillaListener
Type: Class
Extends: me.tini.announcer.plugin.sponge.SpongePunishmentListener

Constructors:
- SpongeVanillaListener(BanAnnouncerSponge plugin)

Methods:
- void onKickPlayer(KickPlayerEvent event)
- void onBanUser(BanUserEvent event)
- void onBanUser(PardonUserEvent event)
- void onPardonIp(PardonIpEvent event)
- void onBanIp(BanIpEvent event)

## Package: me.tini.announcer.plugin.bukkit

### Class: me.tini.announcer.plugin.bukkit.BanAnnouncerBukkit
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin
Implements: me.tini.announcer.BanAnnouncerPlugin, me.tini.announcer.command.bukkit.IBukkitPlugin, me.tini.announcer.IMessenger

Methods:
- String getVersion()
- boolean isAvailable()
- boolean sendMessage(String channel, byte[] payload)
- BanAnnouncer getAnnouncer()
- void onEnable()
- void onDisable()
- File getFile()
- void registerOutgoingChannel(String channel)

### Class: me.tini.announcer.plugin.bukkit.BukkitPunishmentListener
Type: Class
Extends: me.tini.announcer.PunishmentListener
Implements: org.bukkit.event.Listener

Constructors:
- BukkitPunishmentListener(BanAnnouncerBukkit plugin)

Methods:
- BanAnnouncerBukkit getPlugin()
- void unregister()
- void register()

## Package: me.tini.announcer.plugin.bungee

### Class: me.tini.announcer.plugin.bungee.BanAnnouncerBungee
Type: Class
Extends: net.md_5.bungee.api.plugin.Plugin
Implements: me.tini.announcer.BanAnnouncerPlugin, me.tini.announcer.command.bungee.IBungeePlugin

Methods:
- String getVersion()
- BanAnnouncer getAnnouncer()
- void onEnable()
- void onDisable()

### Class: me.tini.announcer.plugin.bungee.BungeePunishmentListener
Type: Class
Extends: me.tini.announcer.PunishmentListener
Implements: net.md_5.bungee.api.plugin.Listener

Constructors:
- BungeePunishmentListener(BanAnnouncerBungee plugin)

Methods:
- BanAnnouncerBungee getPlugin()
- void unregister()
- void register()

## Package: me.tini.announcer.plugin.sponge

### Class: me.tini.announcer.plugin.sponge.BanAnnouncerSponge
Type: Class
Implements: me.tini.announcer.BanAnnouncerPlugin, me.tini.announcer.command.sponge.ISpongePlugin

Constructors:
- BanAnnouncerSponge(Path dataFolder, Game game, PluginContainer pluginContainer, Logger logger)

Methods:
- String getVersion()
- PluginContainer getPluginContainer()
- Game getGame()
- Logger getLogger()
- File getDataFolder()
- BanAnnouncer getAnnouncer()
- void onEnable(ConstructPluginEvent event)
- File getFile()
- void onDisable()

### Class: me.tini.announcer.plugin.sponge.SpongePunishmentListener
Type: Class
Extends: me.tini.announcer.PunishmentListener

Constructors:
- SpongePunishmentListener(BanAnnouncerSponge plugin)

Methods:
- BanAnnouncerSponge getPlugin()
- void unregister()
- void register()

## Package: me.tini.announcer.plugin.velocity

### Class: me.tini.announcer.plugin.velocity.BanAnnouncerVelocity
Type: Class
Implements: me.tini.announcer.BanAnnouncerPlugin, me.tini.announcer.command.velocity.IVelocityPlugin

Constructors:
- BanAnnouncerVelocity(ProxyServer proxyServer)

Methods:
- ProxyServer getProxyServer()
- String getVersion()
- void onShutdown(ProxyShutdownEvent event)
- Logger getLogger()
- void onProxyInitialize(ProxyInitializeEvent event)
- File getDataFolder()
- BanAnnouncer getAnnouncer()
- File getFile()

### Class: me.tini.announcer.plugin.velocity.VelocityPunishmentListener
Type: Class
Extends: me.tini.announcer.PunishmentListener

Constructors:
- VelocityPunishmentListener(BanAnnouncerVelocity plugin)

Methods:
- BanAnnouncerVelocity getPlugin()
- void unregister()
- void register()

## Package: me.tini.announcer.spicord

### Class: me.tini.announcer.spicord.BanAnnouncerAddon
Type: Class
Extends: org.spicord.api.addon.SimpleAddon

Constructors:
- BanAnnouncerAddon(BanAnnouncerPlugin plugin, BanAnnouncerSpicord announcer)

Methods:
- void onShutdown(DiscordBot bot)
- void onLoad(DiscordBot bot)
- void onReady(DiscordBot bot)

### Class: me.tini.announcer.spicord.BanAnnouncerSpicord
Type: Class
Extends: me.tini.announcer.BanAnnouncer

Constructors:
- BanAnnouncerSpicord(Config config, BanAnnouncerPlugin plugin)

Methods:
- void sendDiscordMessage(Embed message)
- void disable()
- void setBot(DiscordBot bot)
- void initialize()
- void removeBot(DiscordBot bot)

### Class: me.tini.announcer.spicord.Conversions
Type: Class

Methods:
- **static** Embed toSpicordEmbed(Embed baEmbed)

### Class: me.tini.announcer.spicord.SpicordPluginWrapper
Type: Class
Implements: org.spicord.plugin.PluginInterface

Constructors:
- SpicordPluginWrapper(BanAnnouncerPlugin plugin)

Methods:
- Logger getLogger()
- File getDataFolder()
- File getFile()

## Package: me.tini.announcer.utils

### Class: me.tini.announcer.utils.Log4JWrapper
Type: Class
Extends: java.util.logging.Logger

Constructors:
- Log4JWrapper(Logger logger)

Methods:
- void log(LogRecord record)

### Class: me.tini.announcer.utils.ReflectUtils
Type: Class

Methods:
- **static** File getJarFile(Class<*> clazz)

### Class: me.tini.announcer.utils.SLF4JWrapper
Type: Class
Extends: java.util.logging.Logger

Constructors:
- SLF4JWrapper(String logger)
- SLF4JWrapper(Logger logger)

Methods:
- Logger getSLF4JLogger()
- void log(LogRecord record)

### Class: me.tini.announcer.utils.ZipExtractor
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

