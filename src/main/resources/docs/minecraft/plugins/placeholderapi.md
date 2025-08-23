# PlaceholderAPI-2.11.6 API Reference

## Package: me.clip.placeholderapi

### Class: me.clip.placeholderapi.PlaceholderAPI
Type: Class

Methods:
- **static** boolean registerExpansion(PlaceholderExpansion)
- **static** String setPlaceholders(OfflinePlayer, String)
- **static** List setPlaceholders(OfflinePlayer, List)
- **static** String setPlaceholders(Player, String)
- **static** List setPlaceholders(Player, List)
- **static** String setPlaceholders(OfflinePlayer, String, Pattern, boolean)
- **static** List setPlaceholders(OfflinePlayer, List, Pattern, boolean)
- **static** List setPlaceholders(OfflinePlayer, List, boolean)
- **static** List setPlaceholders(OfflinePlayer, List, Pattern)
- **static** String setPlaceholders(Player, String, boolean)
- **static** List setPlaceholders(Player, List, boolean)
- **static** String setPlaceholders(OfflinePlayer, String, boolean)
- **static** String setPlaceholders(OfflinePlayer, String, Pattern)
- **static** boolean containsPlaceholders(String)
- **static** boolean containsBracketPlaceholders(String)
- **static** boolean unregisterExpansion(PlaceholderExpansion)
- **static** Set getExternalPlaceholderPlugins()
- **static** Map getPlaceholders()
- **static** Pattern getPlaceholderPattern()
- **static** boolean unregisterPlaceholderHook(Plugin)
- **static** boolean unregisterPlaceholderHook(String)
- **static** Set getRegisteredPlaceholderPlugins()
- **static** String setBracketPlaceholders(OfflinePlayer, String)
- **static** List setBracketPlaceholders(OfflinePlayer, List)
- **static** String setBracketPlaceholders(Player, String)
- **static** List setBracketPlaceholders(Player, List)
- **static** List setBracketPlaceholders(OfflinePlayer, List, boolean)
- **static** String setBracketPlaceholders(OfflinePlayer, String, boolean)
- **static** String setBracketPlaceholders(Player, String, boolean)
- **static** List setBracketPlaceholders(Player, List, boolean)
- **static** String setRelationalPlaceholders(Player, Player, String)
- **static** List setRelationalPlaceholders(Player, Player, List)
- **static** String setRelationalPlaceholders(Player, Player, String, boolean)
- **static** List setRelationalPlaceholders(Player, Player, List, boolean)
- **static** Pattern getBracketPlaceholderPattern()
- **static** boolean registerPlaceholderHook(Plugin, PlaceholderHook)
- **static** boolean registerPlaceholderHook(String, PlaceholderHook)
- **static** boolean isRegistered(String)
- **static** Pattern getRelationalPlaceholderPattern()
- **static** Set getRegisteredIdentifiers()

### Class: me.clip.placeholderapi.PlaceholderAPIPlugin
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- void reloadConf(CommandSender)
- BukkitAudiences getAdventure()
- CloudExpansionManager getCloudExpansionManager()
- **static** String booleanTrue()
- LocalExpansionManager getLocalExpansionManager()
- **static** Version getServerVersion()
- void onLoad()
- **static** String booleanFalse()
- **static** SimpleDateFormat getDateFormat()
- void onEnable()
- **static** PlaceholderAPIPlugin getInstance()
- void onDisable()
- PlaceholderAPIConfig getPlaceholderAPIConfig()

### Class: me.clip.placeholderapi.PlaceholderHook
Type: Abstract Class

Methods:
- String onRequest(OfflinePlayer, String)
- String onPlaceholderRequest(Player, String)

## Package: me.clip.placeholderapi.commands

### Class: me.clip.placeholderapi.commands.PlaceholderCommand
Type: Abstract Class

Methods:
- Set getLabels()
- String getPermission()
- String getLabel()
- **static** void suggestByParameter(Stream, List, String)
- **static** Stream filterByPermission(CommandSender, Stream)
- void setPermission(String)
- void complete(PlaceholderAPIPlugin, CommandSender, String, List, List)
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)
- Set getAlias()

### Class: me.clip.placeholderapi.commands.PlaceholderCommandRouter
Type: Class
Implements: org.bukkit.command.CommandExecutor, org.bukkit.command.TabCompleter

Methods:
- boolean onCommand(CommandSender, Command, String, String[])
- List onTabComplete(CommandSender, Command, String, String[])

## Package: me.clip.placeholderapi.commands.impl.cloud

### Class: me.clip.placeholderapi.commands.impl.cloud.CommandECloud
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void complete(PlaceholderAPIPlugin, CommandSender, String, List, List)
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.cloud.CommandECloudClear
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.cloud.CommandECloudDownload
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void complete(PlaceholderAPIPlugin, CommandSender, String, List, List)
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.cloud.CommandECloudExpansionInfo
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void complete(PlaceholderAPIPlugin, CommandSender, String, List, List)
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.cloud.CommandECloudExpansionList
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- **static** void addExpansionTitle(StringBuilder, String, int)
- void complete(PlaceholderAPIPlugin, CommandSender, String, List, List)
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.cloud.CommandECloudExpansionPlaceholders
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void complete(PlaceholderAPIPlugin, CommandSender, String, List, List)
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.cloud.CommandECloudRefresh
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.cloud.CommandECloudStatus
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.cloud.CommandECloudUpdate
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void complete(PlaceholderAPIPlugin, CommandSender, String, List, List)
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

## Package: me.clip.placeholderapi.commands.impl.local

### Class: me.clip.placeholderapi.commands.impl.local.CommandDump
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.local.CommandExpansionRegister
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void complete(PlaceholderAPIPlugin, CommandSender, String, List, List)
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.local.CommandExpansionUnregister
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void complete(PlaceholderAPIPlugin, CommandSender, String, List, List)
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.local.CommandHelp
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.local.CommandInfo
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void complete(PlaceholderAPIPlugin, CommandSender, String, List, List)
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.local.CommandList
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.local.CommandParse
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void complete(PlaceholderAPIPlugin, CommandSender, String, List, List)
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.local.CommandReload
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

### Class: me.clip.placeholderapi.commands.impl.local.CommandVersion
Type: Class
Extends: me.clip.placeholderapi.commands.PlaceholderCommand

Methods:
- void evaluate(PlaceholderAPIPlugin, CommandSender, String, List)

## Package: me.clip.placeholderapi.configuration

### Class: me.clip.placeholderapi.configuration.ExpansionSort
Type: Enum
Extends: java.lang.Enum
Implements: java.util.Comparator

Methods:
- int compare(CloudExpansion, CloudExpansion)
- int compare(Object, Object)
- **static** ExpansionSort valueOf(String)
- **static** ExpansionSort[] values()

### Class: me.clip.placeholderapi.configuration.PlaceholderAPIConfig
Type: Class

Methods:
- Optional getExpansionSort()
- String dateFormat()
- boolean isDebugMode()
- String booleanTrue()
- void setCloudEnabled(boolean)
- String booleanFalse()
- boolean checkUpdates()
- boolean isCloudEnabled()

## Package: me.clip.placeholderapi.events

### Class: me.clip.placeholderapi.events.ExpansionRegisterEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- PlaceholderExpansion getExpansion()
- **static** HandlerList getHandlerList()

### Class: me.clip.placeholderapi.events.ExpansionUnregisterEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- PlaceholderExpansion getExpansion()
- **static** HandlerList getHandlerList()

### Class: me.clip.placeholderapi.events.ExpansionsLoadedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- List getExpansions()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.clip.placeholderapi.events.PlaceholderHookUnloadEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- PlaceholderHook getHook()
- String getHookName()

## Package: me.clip.placeholderapi.exceptions

### Class: me.clip.placeholderapi.exceptions.NoDefaultCommandException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: me.clip.placeholderapi.expansion

### Class: me.clip.placeholderapi.expansion.Cacheable
Type: Interface

Methods:
- void clear()

### Class: me.clip.placeholderapi.expansion.Cleanable
Type: Interface

Methods:
- void cleanup(Player)

### Class: me.clip.placeholderapi.expansion.Configurable
Type: Interface

Methods:
- Map getDefaults()

### Class: me.clip.placeholderapi.expansion.Relational
Type: Interface

Methods:
- String onPlaceholderRequest(Player, Player, String)

### Class: me.clip.placeholderapi.expansion.Taskable
Type: Interface

Methods:
- void stop()
- void start()

### Class: me.clip.placeholderapi.expansion.VersionSpecific
Type: Interface

Methods:
- boolean isCompatibleWith(Version)

### Class: me.clip.placeholderapi.expansion.NMSVersion
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** NMSVersion getVersion(String)
- String getVersion()
- **static** NMSVersion valueOf(String)
- **static** NMSVersion[] values()

### Class: me.clip.placeholderapi.expansion.PlaceholderExpansion
Type: Abstract Class
Extends: me.clip.placeholderapi.PlaceholderHook

Methods:
- String getName()
- void log(Level, String)
- void log(Level, String, Throwable)
- String getAuthor()
- PlaceholderAPIPlugin getPlaceholderAPI()
- double getDouble(String, double)
- List getPlaceholders()
- String getDescription()
- String getIdentifier()
- Object get(String, Object)
- void warning(String)
- boolean getBoolean(String, boolean)
- boolean persist()
- void info(String)
- String getVersion()
- ConfigurationSection getConfigSection()
- ConfigurationSection getConfigSection(String)
- boolean unregister()
- String getString(String, String)
- String getRequiredPlugin()
- long getLong(String, long)
- boolean canRegister()
- int getInt(String, int)
- String getLink()
- PlaceholderExpansion$Type getExpansionType()
- String getPlugin()
- boolean equals(Object)
- void severe(String)
- void severe(String, Throwable)
- String toString()
- boolean isRegistered()
- void setExpansionType(PlaceholderExpansion$Type)
- boolean configurationContains(String)
- List getStringList(String)
- boolean register()

### Class: me.clip.placeholderapi.expansion.PlaceholderExpansion$Type
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PlaceholderExpansion$Type valueOf(String)
- **static** PlaceholderExpansion$Type[] values()

### Class: me.clip.placeholderapi.expansion.Version
Type: Class

Methods:
- String getVersion()
- boolean compareTo(String)
- boolean isSpigot()

## Package: me.clip.placeholderapi.expansion.cloud

### Class: me.clip.placeholderapi.expansion.cloud.CloudExpansion
Type: Class

Methods:
- void setName(String)
- void setPlaceholders(List)
- String getName()
- boolean isVerified()
- String getAuthor()
- void setHasExpansion(boolean)
- void setDescription(String)
- List getPlaceholders()
- String getDescription()
- String getDependencyUrl()
- void setLatestVersion(String)
- boolean hasExpansion()
- void setSourceUrl(String)
- List getVersions()
- double getAverage_rating()
- void setVersions(List)
- String getTimeSinceLastUpdate()
- List getAvailableVersions()
- String getLatestVersion()
- CloudExpansion$Version getVersion()
- CloudExpansion$Version getVersion(String)
- void setLastUpdate(long)
- String getSourceUrl()
- void setAuthor(String)
- void setDependencyUrl(String)
- boolean shouldUpdate()
- long getRatingsCount()
- long getLastUpdate()
- void setShouldUpdate(boolean)

### Class: me.clip.placeholderapi.expansion.cloud.CloudExpansion$Version
Type: Class

Methods:
- String getVersion()
- String getUrl()
- void setVersion(String)
- void setReleaseNotes(String)
- String getReleaseNotes()
- void setUrl(String)

## Package: me.clip.placeholderapi.expansion.manager

### Class: me.clip.placeholderapi.expansion.manager.CloudExpansionManager
Type: Class

Methods:
- Map getCloudExpansionsByAuthor(String)
- Optional findCloudExpansionByName(String)
- boolean isDownloading(CloudExpansion)
- void load()
- int getCloudExpansionAuthorCount()
- int getCloudUpdateCount()
- Map getCloudExpansionsInstalled()
- void fetch()
- CompletableFuture downloadExpansion(CloudExpansion, CloudExpansion$Version)
- void clean()
- void kill()
- Set getCloudExpansionAuthors()
- Map getCloudExpansions()

### Class: me.clip.placeholderapi.expansion.manager.LocalExpansionManager
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- File getExpansionsFolder()
- Collection getExpansions()
- boolean unregister(PlaceholderExpansion)
- PlaceholderExpansion createExpansionInstance(Class) throws LinkageError
- void kill()
- CompletableFuture findExpansionsOnDisk()
- void onQuit(PlayerQuitEvent)
- void load(CommandSender)
- CompletableFuture findExpansionInFile(File)
- Optional findExpansionByIdentifier(String)
- Optional findExpansionByName(String)
- PlaceholderExpansion getExpansion(String)
- Collection getIdentifiers()
- void onPluginDisable(PluginDisableEvent)
- Optional register(Class)
- boolean register(PlaceholderExpansion)

### Class: me.clip.placeholderapi.expansion.manager.MethodSignature
Type: Class

Methods:
- String getName()
- int hashCode()
- boolean equals(Object)
- Class[] getParams()

## Package: me.clip.placeholderapi.libs.kyori.adventure

### Class: me.clip.placeholderapi.libs.kyori.adventure.Adventure
Type: Class

No public methods found

## Package: me.clip.placeholderapi.libs.kyori.adventure.audience

### Class: me.clip.placeholderapi.libs.kyori.adventure.audience.Audience
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.pointer.Pointered

Methods:
- void sendPlayerListHeader(ComponentLike)
- void sendPlayerListHeader(Component)
- void forEachAudience(Consumer)
- **static** Audience audience(Audience[])
- **static** ForwardingAudience audience(Iterable)
- void sendTitlePart(TitlePart, Object)
- void sendMessage(ComponentLike)
- void sendMessage(Component)
- void sendMessage(ComponentLike, MessageType)
- void sendMessage(Component, MessageType)
- void sendMessage(Identified, ComponentLike)
- void sendMessage(Identity, ComponentLike)
- void sendMessage(Identified, Component)
- void sendMessage(Identity, Component)
- void sendMessage(Identified, ComponentLike, MessageType)
- void sendMessage(Identity, ComponentLike, MessageType)
- void sendMessage(Identified, Component, MessageType)
- void sendMessage(Identity, Component, MessageType)
- void sendMessage(Component, ChatType$Bound)
- void sendMessage(ComponentLike, ChatType$Bound)
- void sendMessage(SignedMessage, ChatType$Bound)
- void deleteMessage(SignedMessage)
- void deleteMessage(SignedMessage$Signature)
- void sendPlayerListHeaderAndFooter(ComponentLike, ComponentLike)
- void sendPlayerListHeaderAndFooter(Component, Component)
- **static** Collector toAudience()
- void hideBossBar(BossBar)
- **static** Audience empty()
- void openBook(Book$Builder)
- void openBook(Book)
- void showBossBar(BossBar)
- void stopSound(Sound)
- void stopSound(SoundStop)
- void showTitle(Title)
- void playSound(Sound)
- void playSound(Sound, double, double, double)
- void playSound(Sound, Sound$Emitter)
- void clearTitle()
- void resetTitle()
- void sendPlayerListFooter(ComponentLike)
- void sendPlayerListFooter(Component)
- void sendActionBar(ComponentLike)
- void sendActionBar(Component)
- Audience filterAudience(Predicate)

### Class: me.clip.placeholderapi.libs.kyori.adventure.audience.ForwardingAudience
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.audience.Audience

Methods:
- void sendPlayerListHeader(Component)
- void forEachAudience(Consumer)
- void sendTitlePart(TitlePart, Object)
- void sendMessage(Component)
- void sendMessage(Component, ChatType$Bound)
- void sendMessage(SignedMessage, ChatType$Bound)
- void sendMessage(Identified, Component, MessageType)
- void sendMessage(Identity, Component, MessageType)
- void deleteMessage(SignedMessage$Signature)
- void sendPlayerListHeaderAndFooter(Component, Component)
- void hideBossBar(BossBar)
- void openBook(Book)
- void showBossBar(BossBar)
- void stopSound(SoundStop)
- void playSound(Sound)
- void playSound(Sound, double, double, double)
- void playSound(Sound, Sound$Emitter)
- void clearTitle()
- Iterable audiences()
- void resetTitle()
- Pointers pointers()
- void sendPlayerListFooter(Component)
- void sendActionBar(Component)
- Audience filterAudience(Predicate)

### Class: me.clip.placeholderapi.libs.kyori.adventure.audience.ForwardingAudience$Single
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.audience.ForwardingAudience

Methods:
- void sendPlayerListHeader(Component)
- void forEachAudience(Consumer)
- Audience audience()
- Object getOrDefault(Pointer, Object)
- void sendTitlePart(TitlePart, Object)
- void sendMessage(Component)
- void sendMessage(Component, ChatType$Bound)
- void sendMessage(SignedMessage, ChatType$Bound)
- void sendMessage(Identified, Component, MessageType)
- void sendMessage(Identity, Component, MessageType)
- void deleteMessage(SignedMessage$Signature)
- void sendPlayerListHeaderAndFooter(Component, Component)
- void hideBossBar(BossBar)
- void openBook(Book)
- void showBossBar(BossBar)
- Object getOrDefaultFrom(Pointer, Supplier)
- void stopSound(SoundStop)
- void playSound(Sound)
- void playSound(Sound, double, double, double)
- void playSound(Sound, Sound$Emitter)
- Optional get(Pointer)
- void clearTitle()
- Iterable audiences()
- void resetTitle()
- Pointers pointers()
- void sendPlayerListFooter(Component)
- void sendActionBar(Component)
- Audience filterAudience(Predicate)

### Class: me.clip.placeholderapi.libs.kyori.adventure.audience.Audiences
Type: Class

Methods:
- **static** Consumer sendingMessage(ComponentLike)

### Class: me.clip.placeholderapi.libs.kyori.adventure.audience.MessageType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** MessageType valueOf(String)
- **static** MessageType[] values()

## Package: me.clip.placeholderapi.libs.kyori.adventure.bossbar

### Class: me.clip.placeholderapi.libs.kyori.adventure.bossbar.BossBar
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- boolean hasFlag(BossBar$Flag)
- BossBar removeFlag(BossBar$Flag)
- BossBar$Overlay overlay()
- BossBar overlay(BossBar$Overlay)
- BossBar$Color color()
- BossBar color(BossBar$Color)
- Set flags()
- BossBar flags(Set)
- BossBar removeListener(BossBar$Listener)
- float percent()
- BossBar percent(float)
- BossBar addFlag(BossBar$Flag)
- **static** BossBar bossBar(ComponentLike, float, BossBar$Color, BossBar$Overlay)
- **static** BossBar bossBar(Component, float, BossBar$Color, BossBar$Overlay)
- **static** BossBar bossBar(ComponentLike, float, BossBar$Color, BossBar$Overlay, Set)
- **static** BossBar bossBar(Component, float, BossBar$Color, BossBar$Overlay, Set)
- BossBar addFlags(BossBar$Flag[])
- BossBar addFlags(Iterable)
- Component name()
- BossBar name(ComponentLike)
- BossBar name(Component)
- float progress()
- BossBar progress(float)
- BossBar addListener(BossBar$Listener)
- BossBar removeFlags(BossBar$Flag[])
- BossBar removeFlags(Iterable)

### Class: me.clip.placeholderapi.libs.kyori.adventure.bossbar.BossBar$Listener
Type: Interface

Methods:
- void bossBarNameChanged(BossBar, Component, Component)
- void bossBarProgressChanged(BossBar, float, float)
- void bossBarOverlayChanged(BossBar, BossBar$Overlay, BossBar$Overlay)
- void bossBarPercentChanged(BossBar, float, float)
- void bossBarFlagsChanged(BossBar, Set, Set)
- void bossBarColorChanged(BossBar, BossBar$Color, BossBar$Color)

### Class: me.clip.placeholderapi.libs.kyori.adventure.bossbar.BossBarImplementation
Type: Interface

Methods:
- **static** BossBarImplementation get(BossBar, Class)

### Class: me.clip.placeholderapi.libs.kyori.adventure.bossbar.BossBarImplementation$Provider
Type: Interface

Methods:
- BossBarImplementation create(BossBar)

### Class: me.clip.placeholderapi.libs.kyori.adventure.bossbar.BossBar$Color
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BossBar$Color valueOf(String)
- **static** BossBar$Color[] values()

### Class: me.clip.placeholderapi.libs.kyori.adventure.bossbar.BossBar$Flag
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BossBar$Flag valueOf(String)
- **static** BossBar$Flag[] values()

### Class: me.clip.placeholderapi.libs.kyori.adventure.bossbar.BossBar$Overlay
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BossBar$Overlay valueOf(String)
- **static** BossBar$Overlay[] values()

## Package: me.clip.placeholderapi.libs.kyori.adventure.builder

### Class: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder
Type: Interface

Methods:
- **static** Object configureAndBuild(AbstractBuilder, Consumer)
- Object build()

## Package: me.clip.placeholderapi.libs.kyori.adventure.chat

### Class: me.clip.placeholderapi.libs.kyori.adventure.chat.ChatType
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable, me.clip.placeholderapi.libs.kyori.adventure.key.Keyed

Methods:
- ChatType$Bound bind(ComponentLike)
- ChatType$Bound bind(ComponentLike, ComponentLike)
- Stream examinableProperties()
- **static** ChatType chatType(Keyed)

### Class: me.clip.placeholderapi.libs.kyori.adventure.chat.ChatType$Bound
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- Component name()
- Stream examinableProperties()
- ChatType type()
- Component target()

### Class: me.clip.placeholderapi.libs.kyori.adventure.chat.SignedMessage
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.identity.Identified, me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- boolean isSystem()
- Component unsignedContent()
- long salt()
- **static** SignedMessage system(String, ComponentLike)
- **static** SignedMessage$Signature signature(byte[])
- SignedMessage$Signature signature()
- boolean canDelete()
- Stream examinableProperties()
- String message()
- Instant timestamp()

### Class: me.clip.placeholderapi.libs.kyori.adventure.chat.SignedMessage$Signature
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- byte[] bytes()
- Stream examinableProperties()

## Package: me.clip.placeholderapi.libs.kyori.adventure.identity

### Class: me.clip.placeholderapi.libs.kyori.adventure.identity.Identified
Type: Interface

Methods:
- Identity identity()

### Class: me.clip.placeholderapi.libs.kyori.adventure.identity.Identity
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- **static** Identity nil()
- **static** Identity identity(UUID)
- Stream examinableProperties()
- UUID uuid()

## Package: me.clip.placeholderapi.libs.kyori.adventure.internal

### Class: me.clip.placeholderapi.libs.kyori.adventure.internal.Internals
Type: Class

Methods:
- **static** String toString(Examinable)

## Package: me.clip.placeholderapi.libs.kyori.adventure.internal.properties

### Class: me.clip.placeholderapi.libs.kyori.adventure.internal.properties.AdventureProperties$Property
Type: Interface

Methods:
- Object value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.internal.properties.AdventureProperties
Type: Class

Methods:
- **static** AdventureProperties$Property property(String, Function, Object)

## Package: me.clip.placeholderapi.libs.kyori.adventure.inventory

### Class: me.clip.placeholderapi.libs.kyori.adventure.inventory.Book
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.util.Buildable, me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- Book$Builder toBuilder()
- Buildable$Builder toBuilder()
- List pages()
- Book pages(Component[])
- Book pages(List)
- Component author()
- Book author(Component)
- **static** Book book(Component, Component, Collection)
- **static** Book book(Component, Component, Component[])
- **static** Book$Builder builder()
- Component title()
- Book title(Component)

### Class: me.clip.placeholderapi.libs.kyori.adventure.inventory.Book$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder, me.clip.placeholderapi.libs.kyori.adventure.util.Buildable$Builder

Methods:
- Book$Builder pages(Component[])
- Book$Builder pages(Collection)
- Book build()
- Object build()
- Book$Builder author(Component)
- Book$Builder addPage(Component)
- Book$Builder title(Component)

## Package: me.clip.placeholderapi.libs.kyori.adventure.key

### Class: me.clip.placeholderapi.libs.kyori.adventure.key.Key
Type: Interface
Implements: java.lang.Comparable, me.clip.placeholderapi.libs.kyori.examination.Examinable, me.clip.placeholderapi.libs.kyori.adventure.key.Namespaced, me.clip.placeholderapi.libs.kyori.adventure.key.Keyed

Methods:
- **static** boolean parseableValue(String)
- **static** Comparator comparator()
- String namespace()
- **static** boolean allowedInNamespace(char)
- **static** boolean parseableNamespace(String)
- int compareTo(Key)
- int compareTo(Object)
- Stream examinableProperties()
- String asString()
- String value()
- **static** boolean allowedInValue(char)
- **static** boolean parseable(String)
- **static** Key key(String)
- **static** Key key(String, char)
- **static** Key key(Namespaced, String)
- **static** Key key(String, String)
- Key key()

### Class: me.clip.placeholderapi.libs.kyori.adventure.key.Keyed
Type: Interface

Methods:
- Key key()

### Class: me.clip.placeholderapi.libs.kyori.adventure.key.KeyedValue
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.key.Keyed

Methods:
- **static** KeyedValue keyedValue(Key, Object)
- **static** KeyedValue of(Key, Object)
- Object value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.key.Namespaced
Type: Interface

Methods:
- String namespace()

### Class: me.clip.placeholderapi.libs.kyori.adventure.key.InvalidKeyException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- String keyValue()
- String keyNamespace()

## Package: me.clip.placeholderapi.libs.kyori.adventure.nbt

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.ArrayBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTag

Methods:
- BinaryTagType type()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTagLike, me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- BinaryTag asBinaryTag()
- BinaryTagType type()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTagIO$Reader
Type: Interface

Methods:
- CompoundBinaryTag read(Path) throws IOException
- CompoundBinaryTag read(Path, BinaryTagIO$Compression) throws IOException
- CompoundBinaryTag read(InputStream) throws IOException
- CompoundBinaryTag read(InputStream, BinaryTagIO$Compression) throws IOException
- CompoundBinaryTag read(DataInput) throws IOException
- Map$Entry readNamed(Path) throws IOException
- Map$Entry readNamed(Path, BinaryTagIO$Compression) throws IOException
- Map$Entry readNamed(InputStream) throws IOException
- Map$Entry readNamed(InputStream, BinaryTagIO$Compression) throws IOException
- Map$Entry readNamed(DataInput) throws IOException

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTagIO$Writer
Type: Interface

Methods:
- void writeNamed(Map$Entry, Path) throws IOException
- void writeNamed(Map$Entry, Path, BinaryTagIO$Compression) throws IOException
- void writeNamed(Map$Entry, OutputStream) throws IOException
- void writeNamed(Map$Entry, OutputStream, BinaryTagIO$Compression) throws IOException
- void writeNamed(Map$Entry, DataOutput) throws IOException
- void write(CompoundBinaryTag, Path) throws IOException
- void write(CompoundBinaryTag, Path, BinaryTagIO$Compression) throws IOException
- void write(CompoundBinaryTag, OutputStream) throws IOException
- void write(CompoundBinaryTag, OutputStream, BinaryTagIO$Compression) throws IOException
- void write(CompoundBinaryTag, DataOutput) throws IOException

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTagLike
Type: Interface

Methods:
- BinaryTag asBinaryTag()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.ByteArrayBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- int size()
- byte get(int)
- **static** ByteArrayBinaryTag of(byte[])
- BinaryTagType type()
- byte[] value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.ByteBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** ByteBinaryTag of(byte)
- BinaryTagType type()
- byte value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.CompoundBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTag, me.clip.placeholderapi.libs.kyori.adventure.nbt.CompoundTagSetter, java.lang.Iterable

Methods:
- CompoundBinaryTag getCompound(String)
- CompoundBinaryTag getCompound(String, CompoundBinaryTag)
- byte getByte(String)
- byte getByte(String, byte)
- short getShort(String)
- short getShort(String, short)
- double getDouble(String)
- double getDouble(String, double)
- String getString(String)
- String getString(String, String)
- float getFloat(String)
- float getFloat(String, float)
- BinaryTagType type()
- long[] getLongArray(String)
- long[] getLongArray(String, long[])
- **static** CompoundBinaryTag empty()
- long getLong(String)
- long getLong(String, long)
- int getInt(String)
- int getInt(String, int)
- ListBinaryTag getList(String)
- ListBinaryTag getList(String, ListBinaryTag)
- ListBinaryTag getList(String, BinaryTagType)
- ListBinaryTag getList(String, BinaryTagType, ListBinaryTag)
- BinaryTag get(String)
- byte[] getByteArray(String)
- byte[] getByteArray(String, byte[])
- **static** CompoundBinaryTag$Builder builder()
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- **static** CompoundBinaryTag from(Map)
- Set keySet()
- int[] getIntArray(String)
- int[] getIntArray(String, int[])

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.CompoundBinaryTag$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.CompoundTagSetter

Methods:
- CompoundBinaryTag build()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.CompoundTagSetter
Type: Interface

Methods:
- Object putFloat(String, float)
- Object putByte(String, byte)
- Object putInt(String, int)
- Object putString(String, String)
- Object putIntArray(String, int[])
- Object putDouble(String, double)
- Object putLongArray(String, long[])
- Object putLong(String, long)
- Object putShort(String, short)
- Object putBoolean(String, boolean)
- Object remove(String)
- Object remove(String, Consumer)
- Object put(String, BinaryTag)
- Object put(CompoundBinaryTag)
- Object put(Map)
- Object putByteArray(String, byte[])

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.DoubleBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** DoubleBinaryTag of(double)
- BinaryTagType type()
- double value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.EndBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTag

Methods:
- **static** EndBinaryTag get()
- BinaryTagType type()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.FloatBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** FloatBinaryTag of(float)
- BinaryTagType type()
- float value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.IntArrayBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- PrimitiveIterator$OfInt iterator()
- Iterator iterator()
- int size()
- IntStream stream()
- Spliterator$OfInt spliterator()
- Spliterator spliterator()
- int get(int)
- **static** IntArrayBinaryTag of(int[])
- void forEachInt(IntConsumer)
- BinaryTagType type()
- int[] value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.IntBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** IntBinaryTag of(int)
- BinaryTagType type()
- int value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.ListBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.ListTagSetter, me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTag, java.lang.Iterable

Methods:
- CompoundBinaryTag getCompound(int)
- CompoundBinaryTag getCompound(int, CompoundBinaryTag)
- byte getByte(int)
- byte getByte(int, byte)
- ListBinaryTag set(int, BinaryTag, Consumer)
- short getShort(int)
- short getShort(int, short)
- double getDouble(int)
- double getDouble(int, double)
- String getString(int)
- String getString(int, String)
- float getFloat(int)
- float getFloat(int, float)
- BinaryTagType type()
- BinaryTagType listType()
- ListBinaryTag remove(int, Consumer)
- long[] getLongArray(int)
- long[] getLongArray(int, long[])
- **static** ListBinaryTag empty()
- long getLong(int)
- long getLong(int, long)
- int getInt(int)
- int getInt(int, int)
- int size()
- Stream stream()
- ListBinaryTag getList(int)
- ListBinaryTag getList(int, BinaryTagType)
- ListBinaryTag getList(int, ListBinaryTag)
- ListBinaryTag getList(int, BinaryTagType, ListBinaryTag)
- BinaryTag get(int)
- **static** ListBinaryTag of(BinaryTagType, List)
- byte[] getByteArray(int)
- byte[] getByteArray(int, byte[])
- **static** ListBinaryTag$Builder builder()
- **static** ListBinaryTag$Builder builder(BinaryTagType)
- **static** ListBinaryTag from(Iterable)
- BinaryTagType elementType()
- int[] getIntArray(int)
- int[] getIntArray(int, int[])

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.ListBinaryTag$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.ListTagSetter

Methods:
- ListBinaryTag build()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.ListTagSetter
Type: Interface

Methods:
- Object add(BinaryTag)
- Object add(Iterable)

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.LongArrayBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- PrimitiveIterator$OfLong iterator()
- Iterator iterator()
- int size()
- LongStream stream()
- Spliterator$OfLong spliterator()
- Spliterator spliterator()
- long get(int)
- **static** LongArrayBinaryTag of(long[])
- BinaryTagType type()
- void forEachLong(LongConsumer)
- long[] value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.LongBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** LongBinaryTag of(long)
- BinaryTagType type()
- long value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.NumberBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTag

Methods:
- int intValue()
- float floatValue()
- short shortValue()
- double doubleValue()
- BinaryTagType type()
- long longValue()
- byte byteValue()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.ShortBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** ShortBinaryTag of(short)
- BinaryTagType type()
- short value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.StringBinaryTag
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTag

Methods:
- **static** StringBinaryTag of(String)
- BinaryTagType type()
- String value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTagIO
Type: Class

Methods:
- **static** void writeCompressedPath(CompoundBinaryTag, Path) throws IOException
- **static** void writeOutputStream(CompoundBinaryTag, OutputStream) throws IOException
- **static** CompoundBinaryTag readCompressedInputStream(InputStream) throws IOException
- **static** CompoundBinaryTag readPath(Path) throws IOException
- **static** BinaryTagIO$Reader reader()
- **static** BinaryTagIO$Reader reader(long)
- **static** CompoundBinaryTag readCompressedPath(Path) throws IOException
- **static** CompoundBinaryTag readInputStream(InputStream) throws IOException
- **static** void writeCompressedOutputStream(CompoundBinaryTag, OutputStream) throws IOException
- **static** BinaryTagIO$Writer writer()
- **static** CompoundBinaryTag readDataInput(DataInput) throws IOException
- **static** BinaryTagIO$Reader unlimitedReader()
- **static** void writeDataOutput(CompoundBinaryTag, DataOutput) throws IOException
- **static** void writePath(CompoundBinaryTag, Path) throws IOException

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTagIO$Compression
Type: Abstract Class

No public methods found

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTagScope$NoOp
Type: Class
Implements: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTagScope

Methods:
- void close()

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTagType
Type: Abstract Class
Implements: java.util.function.Predicate

Methods:
- BinaryTag read(DataInput) throws IOException
- boolean test(BinaryTagType)
- boolean test(Object)
- byte id()
- void write(BinaryTag, DataOutput) throws IOException

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.BinaryTagTypes
Type: Class

No public methods found

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.TagStringIO
Type: Class

Methods:
- void toWriter(CompoundBinaryTag, Writer) throws IOException
- **static** TagStringIO get()
- **static** TagStringIO$Builder builder()
- String asString(CompoundBinaryTag) throws IOException
- CompoundBinaryTag asCompound(String) throws IOException

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.TagStringIO$Builder
Type: Class

Methods:
- TagStringIO build()
- TagStringIO$Builder indent(int)
- TagStringIO$Builder indentTab(int)
- TagStringIO$Builder emitLegacy(boolean)
- TagStringIO$Builder acceptLegacy(boolean)

## Package: me.clip.placeholderapi.libs.kyori.adventure.nbt.api

### Class: me.clip.placeholderapi.libs.kyori.adventure.nbt.api.BinaryTagHolder
Type: Interface

Methods:
- **static** BinaryTagHolder encode(Object, Codec) throws Exception
- **static** BinaryTagHolder binaryTagHolder(String)
- String string()
- Object get(Codec) throws Exception
- **static** BinaryTagHolder of(String)

## Package: me.clip.placeholderapi.libs.kyori.adventure.permission

### Class: me.clip.placeholderapi.libs.kyori.adventure.permission.PermissionChecker
Type: Interface
Implements: java.util.function.Predicate

Methods:
- **static** PermissionChecker always(TriState)
- boolean test(String)
- boolean test(Object)
- TriState value(String)

## Package: me.clip.placeholderapi.libs.kyori.adventure.platform

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.AudienceProvider
Type: Interface
Implements: java.lang.AutoCloseable

Methods:
- Audience all()
- Audience server(String)
- Audience console()
- ComponentFlattener flattener()
- Audience world(Key)
- Audience players()
- Audience permission(Key)
- Audience permission(String)
- void close()
- Audience player(UUID)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.AudienceProvider$Builder
Type: Interface

Methods:
- AudienceProvider$Builder componentRenderer(ComponentRenderer)
- AudienceProvider$Builder componentRenderer(Function, ComponentRenderer)
- AudienceProvider$Builder partition(Function)
- AudienceProvider build()

## Package: me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit.BukkitAudiences
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.AudienceProvider

Methods:
- Audience filter(Predicate)
- Audience sender(CommandSender)
- **static** BukkitAudiences$Builder builder(Plugin)
- **static** BukkitAudiences create(Plugin)
- **static** Sound$Emitter asEmitter(Entity)
- Audience player(Player)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit.BukkitAudiences$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.AudienceProvider$Builder

No public methods found

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit.BukkitComponentSerializer
Type: Class

Methods:
- **static** LegacyComponentSerializer legacy()
- **static** GsonComponentSerializer gson()

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit.CraftBukkitFacet$AbstractBook
Type: Abstract Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit.CraftBukkitFacet$PacketFacet
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Book

Methods:
- void openBook(Player, ItemStack)
- void openBook(Object, Object)
- ItemStack createBook(String, String, Iterable)
- Object createBook(String, String, Iterable)
- String createMessage(Player, Component)
- Object createMessage(CommandSender, Component)
- Object createMessage(Object, Component)
- boolean isSupported()

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit.CraftBukkitFacet$BossBar$Builder
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit.CraftBukkitFacet
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$BossBar$Builder

Methods:
- CraftBukkitFacet$BossBar createBossBar(Collection)
- Facet$BossBar createBossBar(Collection)
- boolean isSupported()

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit.CraftBukkitFacet$BossBarWither$Builder
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit.CraftBukkitFacet
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$BossBar$Builder

Methods:
- CraftBukkitFacet$BossBarWither createBossBar(Collection)
- Facet$BossBar createBossBar(Collection)
- boolean isSupported()

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit.MinecraftComponentSerializer
Type: Class
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- Object serialize(Component)
- **static** MinecraftComponentSerializer get()
- **static** boolean isSupported()
- Component deserialize(Object)

## Package: me.clip.placeholderapi.libs.kyori.adventure.platform.facet

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet
Type: Interface

Methods:
- **static** Collection of(Supplier[])
- **static** Facet of(Collection, Object)
- boolean isApplicable(Object)
- boolean isSupported()

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$ActionBar
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Message

Methods:
- void sendMessage(Object, Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Book
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Message

Methods:
- void openBook(Object, Object)
- Object createBook(String, String, Iterable)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$BossBar
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.bossbar.BossBar$Listener, java.io.Closeable

Methods:
- void bossBarInitialized(BossBar)
- boolean isEmpty()
- void removeViewer(Object)
- void addViewer(Object)
- void close()

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$BossBar$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet

Methods:
- Facet$BossBar createBossBar(Collection)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$BossBarEntity
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$BossBar, me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$FakeEntity

Methods:
- void bossBarNameChanged(BossBar, Component, Component)
- void bossBarProgressChanged(BossBar, float, float)
- void removeViewer(Object)
- void addViewer(Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$BossBarPacket
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$BossBar

Methods:
- int createColor(BossBar$Color)
- byte createFlag(byte, Set, Set)
- int createOverlay(BossBar$Overlay)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Chat
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Message

Methods:
- void sendMessage(Object, Identity, Object, Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$ChatPacket
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Chat

Methods:
- byte createMessageType(MessageType)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$EntitySound
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet

Methods:
- Object createForEmitter(Sound, Sound$Emitter)
- Object createForSelf(Object, Sound)
- void playSound(Object, Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$FakeEntity
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Position, java.io.Closeable

Methods:
- void metadata(int, Object)
- void teleport(Object, Object)
- void name(Component)
- void health(float)
- void invisible(boolean)
- void close()

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Message
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet

Methods:
- Object createMessage(Object, Component)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Pointers
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet

Methods:
- void contributePointers(Object, Pointers$Builder)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Position
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet

Methods:
- Object createPosition(Object)
- Object createPosition(double, double, double)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Sound
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Position

Methods:
- void stopSound(Object, SoundStop)
- void playSound(Object, Sound, Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$TabList
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Message

Methods:
- void send(Object, Object, Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Title
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Message

Methods:
- void contributeSubtitle(Object, Object)
- int toTicks(Duration)
- void showTitle(Object, Object)
- void clearTitle(Object)
- Object completeTitle(Object)
- void contributeTimes(Object, int, int, int)
- void contributeTitle(Object, Object)
- Object createTitleCollection()
- void resetTitle(Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$TitlePacket
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Title

No public methods found

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.FacetComponentFlattener$Translator
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet

Methods:
- String valueOrDefault(Object, String)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.FacetAudience
Type: Class
Implements: me.clip.placeholderapi.libs.kyori.adventure.audience.Audience, java.io.Closeable

Methods:
- void sendPlayerListHeader(Component)
- void sendTitlePart(TitlePart, Object)
- void sendMessage(Identity, Component, MessageType)
- void sendMessage(Component, ChatType$Bound)
- void sendMessage(SignedMessage, ChatType$Bound)
- void refresh()
- void removeViewer(Object)
- void sendPlayerListHeaderAndFooter(Component, Component)
- void hideBossBar(BossBar)
- void showBossBar(BossBar)
- void openBook(Book)
- void stopSound(SoundStop)
- void showTitle(Title)
- void playSound(Sound)
- void playSound(Sound, Sound$Emitter)
- void playSound(Sound, double, double, double)
- void clearTitle()
- void addViewer(Object)
- void close()
- void resetTitle()
- Pointers pointers()
- void sendPlayerListFooter(Component)
- void sendActionBar(Component)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.FacetAudienceProvider
Type: Abstract Class
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.AudienceProvider, me.clip.placeholderapi.libs.kyori.adventure.audience.ForwardingAudience

Methods:
- Audience filter(Predicate)
- Audience all()
- Audience server(String)
- Audience console()
- Audience world(Key)
- void refreshViewer(Object)
- Audience players()
- Iterable audiences()
- void removeViewer(Object)
- void addViewer(Object)
- Audience permission(String)
- void close()
- Audience player(UUID)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.FacetBase
Type: Abstract Class
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet

Methods:
- boolean isApplicable(Object)
- boolean isSupported()

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.FacetComponentFlattener
Type: Class

Methods:
- **static** ComponentFlattener get(Object, Collection)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.FacetPointers
Type: Class

No public methods found

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.FacetPointers$Type
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** FacetPointers$Type valueOf(String)
- **static** FacetPointers$Type[] values()

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Knob
Type: Class

Methods:
- **static** void logError(Throwable, String, Object[])
- **static** void logMessage(String, Object[])
- **static** boolean isEnabled(String, boolean)
- **static** void logUnsupported(Object, Object)

## Package: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.FacetBase
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$Message

Methods:
- int findProtocol(Object)
- boolean isApplicable(Object)
- String createMessage(Object, Component)
- Object createMessage(Object, Component)
- UserConnection findConnection(Object)
- boolean isSupported()

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$ActionBar
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$Chat
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$ActionBar

Methods:
- byte createMessageType(MessageType)
- void sendMessage(Object, String)
- void sendMessage(Object, Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$ActionBarTitle
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$ActionBar

Methods:
- void sendMessage(Object, String)
- void sendMessage(Object, Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$BossBar
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$BossBarPacket

Methods:
- void bossBarInitialized(BossBar)
- void bossBarNameChanged(BossBar, Component, Component)
- void broadcastPacket(int)
- void bossBarProgressChanged(BossBar, float, float)
- void sendPacket(Object, int)
- boolean isEmpty()
- void bossBarOverlayChanged(BossBar, BossBar$Overlay, BossBar$Overlay)
- void removeViewer(Object)
- void addViewer(Object)
- void bossBarFlagsChanged(BossBar, Set, Set)
- void bossBarColorChanged(BossBar, BossBar$Color, BossBar$Color)
- void close()

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$BossBar$Builder
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$BossBar$Builder

Methods:
- Facet$BossBar createBossBar(Collection)
- Object createMessage(Object, Component)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$BossBar$Builder1_9_To_1_15
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$BossBar$Builder

Methods:
- Facet$BossBar createBossBar(Collection)
- Object createMessage(Object, Component)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$Chat
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$ChatPacket

Methods:
- void sendMessage(Object, Identity, String, Object)
- void sendMessage(Object, Identity, Object, Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet

Methods:
- void sendPacket(PacketWrapper)
- Object createMessage(Object, Component)
- JsonElement parse(String)
- boolean isSupported()
- PacketWrapper createPacket(Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$TabList
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$TabList

Methods:
- void send(Object, String, String)
- void send(Object, Object, Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$Title
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Implements: me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet$TitlePacket

Methods:
- void contributeSubtitle(List, String)
- void contributeSubtitle(Object, Object)
- void showTitle(Object, Consumer)
- void showTitle(Object, Object)
- void clearTitle(Object)
- Consumer completeTitle(List)
- Object completeTitle(Object)
- void contributeTimes(List, int, int, int)
- void contributeTimes(Object, int, int, int)
- void contributeTitle(List, String)
- void contributeTitle(Object, Object)
- List createTitleCollection()
- Object createTitleCollection()
- void resetTitle(Object)

## Package: me.clip.placeholderapi.libs.kyori.adventure.pointer

### Class: me.clip.placeholderapi.libs.kyori.adventure.pointer.Pointer
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- **static** Pointer pointer(Class, Key)
- Stream examinableProperties()
- Class type()
- Key key()

### Class: me.clip.placeholderapi.libs.kyori.adventure.pointer.Pointered
Type: Interface

Methods:
- Object getOrDefaultFrom(Pointer, Supplier)
- Object getOrDefault(Pointer, Object)
- Optional get(Pointer)
- Pointers pointers()

### Class: me.clip.placeholderapi.libs.kyori.adventure.pointer.Pointers
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.util.Buildable

Methods:
- Object getOrDefaultFrom(Pointer, Supplier)
- Object getOrDefault(Pointer, Object)
- Optional get(Pointer)
- **static** Pointers$Builder builder()
- boolean supports(Pointer)
- **static** Pointers empty()

### Class: me.clip.placeholderapi.libs.kyori.adventure.pointer.Pointers$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder, me.clip.placeholderapi.libs.kyori.adventure.util.Buildable$Builder

Methods:
- Pointers$Builder withDynamic(Pointer, Supplier)
- Pointers$Builder withStatic(Pointer, Object)

## Package: me.clip.placeholderapi.libs.kyori.adventure.sound

### Class: me.clip.placeholderapi.libs.kyori.adventure.sound.Sound
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- float volume()
- OptionalLong seed()
- SoundStop asStop()
- **static** Sound$Builder sound()
- **static** Sound$Builder sound(Sound)
- **static** Sound sound(Consumer)
- **static** Sound sound(Key, Sound$Source, float, float)
- **static** Sound sound(Sound$Type, Sound$Source, float, float)
- **static** Sound sound(Supplier, Sound$Source, float, float)
- **static** Sound sound(Key, Sound$Source$Provider, float, float)
- **static** Sound sound(Sound$Type, Sound$Source$Provider, float, float)
- **static** Sound sound(Supplier, Sound$Source$Provider, float, float)
- Key name()
- float pitch()
- Sound$Source source()

### Class: me.clip.placeholderapi.libs.kyori.adventure.sound.Sound$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder

Methods:
- Sound$Builder volume(float)
- Sound$Builder seed(long)
- Sound$Builder seed(OptionalLong)
- Sound$Builder pitch(float)
- Sound$Builder source(Sound$Source)
- Sound$Builder source(Sound$Source$Provider)
- Sound$Builder type(Key)
- Sound$Builder type(Sound$Type)
- Sound$Builder type(Supplier)

### Class: me.clip.placeholderapi.libs.kyori.adventure.sound.Sound$Emitter
Type: Interface

Methods:
- **static** Sound$Emitter self()

### Class: me.clip.placeholderapi.libs.kyori.adventure.sound.Sound$Source$Provider
Type: Interface

Methods:
- Sound$Source soundSource()

### Class: me.clip.placeholderapi.libs.kyori.adventure.sound.Sound$Type
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.key.Keyed

Methods:
- Key key()

### Class: me.clip.placeholderapi.libs.kyori.adventure.sound.SoundStop
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- **static** SoundStop all()
- **static** SoundStop namedOnSource(Key, Sound$Source)
- **static** SoundStop namedOnSource(Sound$Type, Sound$Source)
- **static** SoundStop namedOnSource(Supplier, Sound$Source)
- **static** SoundStop named(Key)
- **static** SoundStop named(Sound$Type)
- **static** SoundStop named(Supplier)
- Key sound()
- **static** SoundStop source(Sound$Source)
- Sound$Source source()

### Class: me.clip.placeholderapi.libs.kyori.adventure.sound.Sound$Source
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Sound$Source valueOf(String)
- **static** Sound$Source[] values()

## Package: me.clip.placeholderapi.libs.kyori.adventure.text

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.BlockNBTComponent
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.NBTComponent, me.clip.placeholderapi.libs.kyori.adventure.text.ScopedComponent

Methods:
- BlockNBTComponent localPos(double, double, double)
- BlockNBTComponent$Pos pos()
- BlockNBTComponent pos(BlockNBTComponent$Pos)
- BlockNBTComponent worldPos(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)
- Stream examinableProperties()
- BlockNBTComponent relativeWorldPos(int, int, int)
- BlockNBTComponent absoluteWorldPos(int, int, int)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.BlockNBTComponent$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.NBTComponentBuilder

Methods:
- BlockNBTComponent$Builder localPos(double, double, double)
- BlockNBTComponent$Builder pos(BlockNBTComponent$Pos)
- BlockNBTComponent$Builder worldPos(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)
- BlockNBTComponent$Builder relativeWorldPos(int, int, int)
- BlockNBTComponent$Builder absoluteWorldPos(int, int, int)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.BlockNBTComponent$LocalPos
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.BlockNBTComponent$Pos

Methods:
- double forwards()
- **static** BlockNBTComponent$LocalPos localPos(double, double, double)
- double left()
- **static** BlockNBTComponent$LocalPos of(double, double, double)
- double up()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.BlockNBTComponent$Pos
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- String asString()
- **static** BlockNBTComponent$Pos fromString(String) throws IllegalArgumentException

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.BlockNBTComponent$WorldPos
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.BlockNBTComponent$Pos

Methods:
- **static** BlockNBTComponent$WorldPos of(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)
- BlockNBTComponent$WorldPos$Coordinate x()
- BlockNBTComponent$WorldPos$Coordinate y()
- BlockNBTComponent$WorldPos$Coordinate z()
- **static** BlockNBTComponent$WorldPos worldPos(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.BlockNBTComponent$WorldPos$Coordinate
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- **static** BlockNBTComponent$WorldPos$Coordinate coordinate(int, BlockNBTComponent$WorldPos$Coordinate$Type)
- **static** BlockNBTComponent$WorldPos$Coordinate absolute(int)
- **static** BlockNBTComponent$WorldPos$Coordinate of(int, BlockNBTComponent$WorldPos$Coordinate$Type)
- BlockNBTComponent$WorldPos$Coordinate$Type type()
- int value()
- **static** BlockNBTComponent$WorldPos$Coordinate relative(int)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.BuildableComponent
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.util.Buildable, me.clip.placeholderapi.libs.kyori.adventure.text.Component

Methods:
- ComponentBuilder toBuilder()
- Buildable$Builder toBuilder()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.Component
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentBuilderApplicable, me.clip.placeholderapi.libs.kyori.adventure.text.ComponentLike, me.clip.placeholderapi.libs.kyori.examination.Examinable, me.clip.placeholderapi.libs.kyori.adventure.text.event.HoverEventSource, me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleGetter, me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleSetter

Methods:
- Component decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- Component compact()
- TextColor color()
- Component color(TextColor)
- StyleSetter color(TextColor)
- **static** EntityNBTComponent$Builder entityNBT()
- **static** EntityNBTComponent entityNBT(Consumer)
- **static** EntityNBTComponent entityNBT(String, String)
- Component replaceFirstText(String, ComponentLike)
- Component replaceFirstText(Pattern, Function)
- Iterable iterable(ComponentIteratorType, ComponentIteratorFlag[])
- Iterable iterable(ComponentIteratorType, Set)
- **static** TextComponent textOfChildren(ComponentLike[])
- Map decorations()
- Component decorations(Map)
- StyleSetter decorations(Map)
- **static** StorageNBTComponent$Builder storageNBT()
- **static** StorageNBTComponent storageNBT(Consumer)
- **static** StorageNBTComponent storageNBT(String, Key)
- **static** StorageNBTComponent storageNBT(String, boolean, Key)
- **static** StorageNBTComponent storageNBT(String, boolean, ComponentLike, Key)
- Component asComponent()
- **static** TextComponent space()
- Component colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- void detectCycle(Component)
- **static** TextComponent empty()
- HoverEvent hoverEvent()
- Component hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- **static** BlockNBTComponent$Builder blockNBT()
- **static** BlockNBTComponent blockNBT(Consumer)
- **static** BlockNBTComponent blockNBT(String, BlockNBTComponent$Pos)
- **static** BlockNBTComponent blockNBT(String, boolean, BlockNBTComponent$Pos)
- **static** BlockNBTComponent blockNBT(String, boolean, ComponentLike, BlockNBTComponent$Pos)
- **static** ScoreComponent$Builder score()
- **static** ScoreComponent score(Consumer)
- **static** ScoreComponent score(String, String)
- **static** ScoreComponent score(String, String, String)
- Iterator iterator(ComponentIteratorType, ComponentIteratorFlag[])
- Iterator iterator(ComponentIteratorType, Set)
- **static** TextComponent newline()
- List children()
- Component children(List)
- Component mergeStyle(Component)
- Component mergeStyle(Component, Style$Merge[])
- Component mergeStyle(Component, Set)
- Component appendNewline()
- **static** SelectorComponent$Builder selector()
- **static** SelectorComponent selector(Consumer)
- **static** SelectorComponent selector(String)
- **static** SelectorComponent selector(String, ComponentLike)
- Stream examinableProperties()
- HoverEvent asHoverEvent(UnaryOperator)
- **static** TextComponent$Builder text()
- **static** TextComponent text(Consumer)
- **static** TextComponent text(String)
- **static** TextComponent text(String, Style)
- **static** TextComponent text(String, TextColor)
- **static** TextComponent text(String, TextColor, TextDecoration[])
- **static** TextComponent text(String, TextColor, Set)
- **static** TextComponent text(boolean)
- **static** TextComponent text(boolean, Style)
- **static** TextComponent text(boolean, TextColor)
- **static** TextComponent text(boolean, TextColor, TextDecoration[])
- **static** TextComponent text(boolean, TextColor, Set)
- **static** TextComponent text(char)
- **static** TextComponent text(char, Style)
- **static** TextComponent text(char, TextColor)
- **static** TextComponent text(char, TextColor, TextDecoration[])
- **static** TextComponent text(char, TextColor, Set)
- **static** TextComponent text(double)
- **static** TextComponent text(double, Style)
- **static** TextComponent text(double, TextColor)
- **static** TextComponent text(double, TextColor, TextDecoration[])
- **static** TextComponent text(double, TextColor, Set)
- **static** TextComponent text(float)
- **static** TextComponent text(float, Style)
- **static** TextComponent text(float, TextColor)
- **static** TextComponent text(float, TextColor, TextDecoration[])
- **static** TextComponent text(float, TextColor, Set)
- **static** TextComponent text(int)
- **static** TextComponent text(int, Style)
- **static** TextComponent text(int, TextColor)
- **static** TextComponent text(int, TextColor, TextDecoration[])
- **static** TextComponent text(int, TextColor, Set)
- **static** TextComponent text(long)
- **static** TextComponent text(long, Style)
- **static** TextComponent text(long, TextColor)
- **static** TextComponent text(long, TextColor, TextDecoration[])
- **static** TextComponent text(long, TextColor, Set)
- **static** TextComponent join(ComponentLike, ComponentLike[])
- **static** TextComponent join(ComponentLike, Iterable)
- **static** Component join(JoinConfiguration, ComponentLike[])
- **static** Component join(JoinConfiguration, Iterable)
- TextDecoration$State decoration(TextDecoration)
- Component decoration(TextDecoration, boolean)
- Component decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- void componentBuilderApply(ComponentBuilder)
- **static** TranslatableComponent$Builder translatable()
- **static** TranslatableComponent translatable(Consumer)
- **static** TranslatableComponent translatable(String)
- **static** TranslatableComponent translatable(Translatable)
- **static** TranslatableComponent translatable(String, String)
- **static** TranslatableComponent translatable(Translatable, String)
- **static** TranslatableComponent translatable(String, Style)
- **static** TranslatableComponent translatable(Translatable, Style)
- **static** TranslatableComponent translatable(String, String, Style)
- **static** TranslatableComponent translatable(Translatable, String, Style)
- **static** TranslatableComponent translatable(String, String, StyleBuilderApplicable[])
- **static** TranslatableComponent translatable(Translatable, String, Iterable)
- **static** TranslatableComponent translatable(String, String, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, String, ComponentLike[])
- **static** TranslatableComponent translatable(String, String, Style, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, String, Style, ComponentLike[])
- **static** TranslatableComponent translatable(String, String, Style, List)
- **static** TranslatableComponent translatable(Translatable, String, Style, List)
- **static** TranslatableComponent translatable(String, String, List, Iterable)
- **static** TranslatableComponent translatable(Translatable, String, List, Iterable)
- **static** TranslatableComponent translatable(String, String, List, StyleBuilderApplicable[])
- **static** TranslatableComponent translatable(Translatable, String, List, StyleBuilderApplicable[])
- **static** TranslatableComponent translatable(String, TextColor)
- **static** TranslatableComponent translatable(Translatable, TextColor)
- **static** TranslatableComponent translatable(String, TextColor, TextDecoration[])
- **static** TranslatableComponent translatable(Translatable, TextColor, TextDecoration[])
- **static** TranslatableComponent translatable(String, TextColor, Set)
- **static** TranslatableComponent translatable(Translatable, TextColor, Set)
- **static** TranslatableComponent translatable(String, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, ComponentLike[])
- **static** TranslatableComponent translatable(String, Style, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, Style, ComponentLike[])
- **static** TranslatableComponent translatable(String, TextColor, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, TextColor, ComponentLike[])
- **static** TranslatableComponent translatable(String, TextColor, Set, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, TextColor, Set, ComponentLike[])
- **static** TranslatableComponent translatable(String, List)
- **static** TranslatableComponent translatable(Translatable, List)
- **static** TranslatableComponent translatable(String, Style, List)
- **static** TranslatableComponent translatable(Translatable, Style, List)
- **static** TranslatableComponent translatable(String, TextColor, List)
- **static** TranslatableComponent translatable(Translatable, TextColor, List)
- **static** TranslatableComponent translatable(String, TextColor, Set, List)
- **static** TranslatableComponent translatable(Translatable, TextColor, Set, List)
- Component replaceText(Consumer)
- Component replaceText(TextReplacementConfig)
- Component replaceText(String, ComponentLike)
- Component replaceText(Pattern, Function)
- Component replaceText(String, ComponentLike, int)
- Component replaceText(Pattern, Function, int)
- Component replaceText(String, ComponentLike, IntFunction2)
- Component replaceText(Pattern, Function, IntFunction2)
- Component appendSpace()
- Spliterator spliterator(ComponentIteratorType, ComponentIteratorFlag[])
- Spliterator spliterator(ComponentIteratorType, Set)
- boolean hasStyling()
- boolean hasDecoration(TextDecoration)
- ClickEvent clickEvent()
- Component clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- boolean contains(Component)
- boolean contains(Component, BiPredicate)
- Component applyFallbackStyle(Style)
- Component applyFallbackStyle(StyleBuilderApplicable[])
- **static** KeybindComponent$Builder keybind()
- **static** KeybindComponent keybind(Consumer)
- **static** KeybindComponent keybind(String)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike)
- **static** KeybindComponent keybind(String, Style)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, Style)
- **static** KeybindComponent keybind(String, TextColor)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor)
- **static** KeybindComponent keybind(String, TextColor, TextDecoration[])
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor, TextDecoration[])
- **static** KeybindComponent keybind(String, TextColor, Set)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor, Set)
- **static** Collector toComponent()
- **static** Collector toComponent(Component)
- String insertion()
- Component insertion(String)
- StyleSetter insertion(String)
- Style style()
- Component style(Style)
- Component style(Consumer)
- Component style(Consumer, Style$Merge$Strategy)
- Component style(Style$Builder)
- Component append(Component)
- Component append(ComponentLike)
- Component append(ComponentBuilder)
- Component decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- Key font()
- Component font(Key)
- StyleSetter font(Key)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentApplicable
Type: Interface

Methods:
- Component componentApply(Component)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentBuilder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder, me.clip.placeholderapi.libs.kyori.adventure.util.Buildable$Builder, me.clip.placeholderapi.libs.kyori.adventure.text.ComponentBuilderApplicable, me.clip.placeholderapi.libs.kyori.adventure.text.ComponentLike, me.clip.placeholderapi.libs.kyori.adventure.text.format.MutableStyleSetter

Methods:
- ComponentBuilder decorate(TextDecoration)
- ComponentBuilder decorate(TextDecoration[])
- MutableStyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration)
- ComponentBuilder color(TextColor)
- StyleSetter color(TextColor)
- ComponentBuilder applicableApply(ComponentBuilderApplicable)
- ComponentBuilder resetStyle()
- ComponentBuilder decorations(Set, boolean)
- ComponentBuilder decorations(Map)
- MutableStyleSetter decorations(Set, boolean)
- MutableStyleSetter decorations(Map)
- StyleSetter decorations(Set, boolean)
- StyleSetter decorations(Map)
- Component asComponent()
- ComponentBuilder colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- ComponentBuilder hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- ComponentBuilder mapChildren(Function)
- List children()
- ComponentBuilder mergeStyle(Component)
- ComponentBuilder mergeStyle(Component, Style$Merge[])
- ComponentBuilder mergeStyle(Component, Set)
- ComponentBuilder appendNewline()
- ComponentBuilder decoration(TextDecoration, boolean)
- ComponentBuilder decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- void componentBuilderApply(ComponentBuilder)
- ComponentBuilder appendSpace()
- ComponentBuilder apply(Consumer)
- ComponentBuilder clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- BuildableComponent build()
- Object build()
- ComponentBuilder mapChildrenDeep(Function)
- ComponentBuilder insertion(String)
- StyleSetter insertion(String)
- ComponentBuilder style(Style)
- ComponentBuilder style(Consumer)
- ComponentBuilder applyDeep(Consumer)
- ComponentBuilder append(Component)
- ComponentBuilder append(ComponentLike)
- ComponentBuilder append(ComponentBuilder)
- ComponentBuilder append(Component[])
- ComponentBuilder append(ComponentLike[])
- ComponentBuilder append(Iterable)
- ComponentBuilder decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- ComponentBuilder font(Key)
- StyleSetter font(Key)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentBuilderApplicable
Type: Interface

Methods:
- void componentBuilderApply(ComponentBuilder)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentIteratorType
Type: Interface

Methods:
- void populate(Component, Deque, Set)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentLike
Type: Interface

Methods:
- **static** Component unbox(ComponentLike)
- **static** List asComponents(List)
- **static** List asComponents(List, Predicate)
- Component asComponent()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.EntityNBTComponent
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.NBTComponent, me.clip.placeholderapi.libs.kyori.adventure.text.ScopedComponent

Methods:
- String selector()
- EntityNBTComponent selector(String)
- Stream examinableProperties()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.EntityNBTComponent$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.NBTComponentBuilder

Methods:
- EntityNBTComponent$Builder selector(String)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.JoinConfiguration
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.util.Buildable, me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- **static** JoinConfiguration commas(boolean)
- Component prefix()
- Component suffix()
- **static** JoinConfiguration noSeparators()
- **static** JoinConfiguration separator(ComponentLike)
- Component separator()
- Predicate predicate()
- Function convertor()
- **static** JoinConfiguration newlines()
- Component lastSeparatorIfSerial()
- **static** JoinConfiguration$Builder builder()
- Component lastSeparator()
- **static** JoinConfiguration separators(ComponentLike, ComponentLike)
- **static** JoinConfiguration arrayLike()
- Style parentStyle()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.JoinConfiguration$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder, me.clip.placeholderapi.libs.kyori.adventure.util.Buildable$Builder

Methods:
- JoinConfiguration$Builder predicate(Predicate)
- JoinConfiguration$Builder convertor(Function)
- JoinConfiguration$Builder prefix(ComponentLike)
- JoinConfiguration$Builder lastSeparatorIfSerial(ComponentLike)
- JoinConfiguration$Builder lastSeparator(ComponentLike)
- JoinConfiguration$Builder suffix(ComponentLike)
- JoinConfiguration$Builder separator(ComponentLike)
- JoinConfiguration$Builder parentStyle(Style)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.KeybindComponent
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.BuildableComponent, me.clip.placeholderapi.libs.kyori.adventure.text.ScopedComponent

Methods:
- String keybind()
- KeybindComponent keybind(String)
- KeybindComponent keybind(KeybindComponent$KeybindLike)
- Stream examinableProperties()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.KeybindComponent$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentBuilder

Methods:
- KeybindComponent$Builder keybind(String)
- KeybindComponent$Builder keybind(KeybindComponent$KeybindLike)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.KeybindComponent$KeybindLike
Type: Interface

Methods:
- String asKeybind()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.NBTComponent
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.BuildableComponent

Methods:
- String nbtPath()
- NBTComponent nbtPath(String)
- boolean interpret()
- NBTComponent interpret(boolean)
- Stream examinableProperties()
- Component separator()
- NBTComponent separator(ComponentLike)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.NBTComponentBuilder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentBuilder

Methods:
- NBTComponentBuilder nbtPath(String)
- NBTComponentBuilder interpret(boolean)
- NBTComponentBuilder separator(ComponentLike)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.ScopedComponent
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.Component

Methods:
- Component hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- Component clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- Component decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- Component color(TextColor)
- StyleSetter color(TextColor)
- Component children(List)
- Component mergeStyle(Component)
- Component mergeStyle(Component, Style$Merge[])
- Component mergeStyle(Component, Set)
- Component insertion(String)
- StyleSetter insertion(String)
- Component style(Style)
- Component style(Consumer)
- Component style(Style$Builder)
- Component decoration(TextDecoration, boolean)
- Component decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- Component append(Component)
- Component append(ComponentLike)
- Component append(ComponentBuilder)
- Component colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.ScoreComponent
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.BuildableComponent, me.clip.placeholderapi.libs.kyori.adventure.text.ScopedComponent

Methods:
- String name()
- ScoreComponent name(String)
- Stream examinableProperties()
- String value()
- ScoreComponent value(String)
- String objective()
- ScoreComponent objective(String)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.ScoreComponent$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentBuilder

Methods:
- ScoreComponent$Builder name(String)
- ScoreComponent$Builder value(String)
- ScoreComponent$Builder objective(String)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.SelectorComponent
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.BuildableComponent, me.clip.placeholderapi.libs.kyori.adventure.text.ScopedComponent

Methods:
- String pattern()
- SelectorComponent pattern(String)
- Stream examinableProperties()
- Component separator()
- SelectorComponent separator(ComponentLike)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.SelectorComponent$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentBuilder

Methods:
- SelectorComponent$Builder pattern(String)
- SelectorComponent$Builder separator(ComponentLike)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.StorageNBTComponent
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.NBTComponent, me.clip.placeholderapi.libs.kyori.adventure.text.ScopedComponent

Methods:
- Stream examinableProperties()
- Key storage()
- StorageNBTComponent storage(Key)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.StorageNBTComponent$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.NBTComponentBuilder

Methods:
- StorageNBTComponent$Builder storage(Key)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.TextComponent
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.BuildableComponent, me.clip.placeholderapi.libs.kyori.adventure.text.ScopedComponent

Methods:
- **static** TextComponent ofChildren(ComponentLike[])
- Stream examinableProperties()
- String content()
- TextComponent content(String)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.TextComponent$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentBuilder

Methods:
- String content()
- TextComponent$Builder content(String)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.TextReplacementConfig
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.util.Buildable, me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- **static** TextReplacementConfig$Builder builder()
- Pattern matchPattern()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.TextReplacementConfig$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder, me.clip.placeholderapi.libs.kyori.adventure.util.Buildable$Builder

Methods:
- TextReplacementConfig$Builder condition(IntFunction2)
- TextReplacementConfig$Builder condition(TextReplacementConfig$Condition)
- TextReplacementConfig$Builder times(int)
- TextReplacementConfig$Builder once()
- TextReplacementConfig$Builder matchLiteral(String)
- TextReplacementConfig$Builder match(String)
- TextReplacementConfig$Builder match(Pattern)
- TextReplacementConfig$Builder replacement(String)
- TextReplacementConfig$Builder replacement(ComponentLike)
- TextReplacementConfig$Builder replacement(Function)
- TextReplacementConfig$Builder replacement(BiFunction)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.TextReplacementConfig$Condition
Type: Interface

Methods:
- PatternReplacementResult shouldReplace(MatchResult, int, int)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.TranslatableComponent
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.BuildableComponent, me.clip.placeholderapi.libs.kyori.adventure.text.ScopedComponent

Methods:
- List args()
- TranslatableComponent args(ComponentLike[])
- TranslatableComponent args(List)
- Stream examinableProperties()
- String fallback()
- TranslatableComponent fallback(String)
- String key()
- TranslatableComponent key(Translatable)
- TranslatableComponent key(String)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.TranslatableComponent$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentBuilder

Methods:
- TranslatableComponent$Builder args(ComponentBuilder)
- TranslatableComponent$Builder args(ComponentBuilder[])
- TranslatableComponent$Builder args(Component)
- TranslatableComponent$Builder args(ComponentLike[])
- TranslatableComponent$Builder args(List)
- TranslatableComponent$Builder fallback(String)
- TranslatableComponent$Builder key(Translatable)
- TranslatableComponent$Builder key(String)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.AbstractComponent
Type: Abstract Class
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.Component

Methods:
- List children()
- int hashCode()
- boolean equals(Object)
- String toString()
- Style style()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.BlockNBTComponent$WorldPos$Coordinate$Type
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BlockNBTComponent$WorldPos$Coordinate$Type valueOf(String)
- **static** BlockNBTComponent$WorldPos$Coordinate$Type[] values()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentIteratorFlag
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ComponentIteratorFlag valueOf(String)
- **static** ComponentIteratorFlag[] values()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.LinearComponents
Type: Class

Methods:
- **static** Component linear(ComponentBuilderApplicable[])

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.PatternReplacementResult
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PatternReplacementResult valueOf(String)
- **static** PatternReplacementResult[] values()

## Package: me.clip.placeholderapi.libs.kyori.adventure.text.event

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.event.ClickCallback
Type: Interface

Methods:
- ClickCallback filter(Predicate)
- ClickCallback filter(Predicate, Consumer)
- ClickCallback requiringPermission(String)
- ClickCallback requiringPermission(String, Consumer)
- **static** ClickCallback widen(ClickCallback, Class, Consumer)
- **static** ClickCallback widen(ClickCallback, Class)
- void accept(Audience)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.event.ClickCallback$Options
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- Duration lifetime()
- **static** ClickCallback$Options$Builder builder()
- **static** ClickCallback$Options$Builder builder(ClickCallback$Options)
- int uses()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.event.ClickCallback$Options$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder

Methods:
- ClickCallback$Options$Builder lifetime(TemporalAmount)
- ClickCallback$Options$Builder uses(int)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.event.ClickCallback$Provider
Type: Interface

Methods:
- ClickEvent create(ClickCallback, ClickCallback$Options)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.event.HoverEventSource
Type: Interface

Methods:
- **static** HoverEvent unbox(HoverEventSource)
- HoverEvent asHoverEvent()
- HoverEvent asHoverEvent(UnaryOperator)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.event.ClickEvent
Type: Class
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable, me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- **static** ClickEvent openFile(String)
- void styleApply(Style$Builder)
- **static** ClickEvent openUrl(String)
- **static** ClickEvent openUrl(URL)
- **static** ClickEvent clickEvent(ClickEvent$Action, String)
- **static** ClickEvent changePage(String)
- **static** ClickEvent changePage(int)
- int hashCode()
- boolean equals(Object)
- **static** ClickEvent suggestCommand(String)
- ClickEvent$Action action()
- **static** ClickEvent callback(ClickCallback)
- **static** ClickEvent callback(ClickCallback, ClickCallback$Options)
- **static** ClickEvent callback(ClickCallback, Consumer)
- **static** ClickEvent copyToClipboard(String)
- String toString()
- **static** ClickEvent runCommand(String)
- Stream examinableProperties()
- String value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.event.ClickEvent$Action
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean readable()
- **static** ClickEvent$Action valueOf(String)
- **static** ClickEvent$Action[] values()
- String toString()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.event.HoverEvent
Type: Class
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable, me.clip.placeholderapi.libs.kyori.adventure.text.event.HoverEventSource, me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- **static** HoverEvent hoverEvent(HoverEvent$Action, Object)
- **static** HoverEvent showEntity(Key, UUID)
- **static** HoverEvent showEntity(Keyed, UUID)
- **static** HoverEvent showEntity(Key, UUID, Component)
- **static** HoverEvent showEntity(Keyed, UUID, Component)
- **static** HoverEvent showEntity(HoverEvent$ShowEntity)
- int hashCode()
- boolean equals(Object)
- **static** HoverEvent showText(ComponentLike)
- **static** HoverEvent showText(Component)
- HoverEvent$Action action()
- **static** HoverEvent showItem(Key, int)
- **static** HoverEvent showItem(Keyed, int)
- **static** HoverEvent showItem(Key, int, BinaryTagHolder)
- **static** HoverEvent showItem(Keyed, int, BinaryTagHolder)
- **static** HoverEvent showItem(HoverEvent$ShowItem)
- String toString()
- HoverEvent withRenderedValue(ComponentRenderer, Object)
- Stream examinableProperties()
- HoverEvent asHoverEvent()
- HoverEvent asHoverEvent(UnaryOperator)
- void styleApply(Style$Builder)
- Object value()
- HoverEvent value(Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.event.HoverEvent$Action
Type: Class

Methods:
- boolean readable()
- String toString()
- Class type()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.event.HoverEvent$ShowEntity
Type: Class
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- int hashCode()
- boolean equals(Object)
- **static** HoverEvent$ShowEntity of(Key, UUID)
- **static** HoverEvent$ShowEntity of(Keyed, UUID)
- **static** HoverEvent$ShowEntity of(Key, UUID, Component)
- **static** HoverEvent$ShowEntity of(Keyed, UUID, Component)
- Component name()
- HoverEvent$ShowEntity name(Component)
- String toString()
- Stream examinableProperties()
- UUID id()
- HoverEvent$ShowEntity id(UUID)
- Key type()
- HoverEvent$ShowEntity type(Key)
- HoverEvent$ShowEntity type(Keyed)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.event.HoverEvent$ShowItem
Type: Class
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- BinaryTagHolder nbt()
- HoverEvent$ShowItem nbt(BinaryTagHolder)
- Key item()
- HoverEvent$ShowItem item(Key)
- int hashCode()
- boolean equals(Object)
- **static** HoverEvent$ShowItem of(Key, int)
- **static** HoverEvent$ShowItem of(Keyed, int)
- **static** HoverEvent$ShowItem of(Key, int, BinaryTagHolder)
- **static** HoverEvent$ShowItem of(Keyed, int, BinaryTagHolder)
- int count()
- HoverEvent$ShowItem count(int)
- String toString()
- Stream examinableProperties()

## Package: me.clip.placeholderapi.libs.kyori.adventure.text.flattener

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.flattener.ComponentFlattener
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.util.Buildable

Methods:
- void flatten(Component, FlattenerListener)
- **static** ComponentFlattener textOnly()
- **static** ComponentFlattener$Builder builder()
- **static** ComponentFlattener basic()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.flattener.ComponentFlattener$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder, me.clip.placeholderapi.libs.kyori.adventure.util.Buildable$Builder

Methods:
- ComponentFlattener$Builder complexMapper(Class, BiConsumer)
- ComponentFlattener$Builder unknownMapper(Function)
- ComponentFlattener$Builder mapper(Class, Function)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.flattener.FlattenerListener
Type: Interface

Methods:
- void pushStyle(Style)
- void component(String)
- void popStyle(Style)

## Package: me.clip.placeholderapi.libs.kyori.adventure.text.format

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.MutableStyleSetter
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleSetter

Methods:
- MutableStyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration[])
- MutableStyleSetter decorations(Map)
- MutableStyleSetter decorations(Set, boolean)
- StyleSetter decorations(Set, boolean)
- StyleSetter decorations(Map)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.Style
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.util.Buildable, me.clip.placeholderapi.libs.kyori.examination.Examinable, me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleGetter, me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleSetter

Methods:
- Style$Builder toBuilder()
- Buildable$Builder toBuilder()
- Style decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- Style unmerge(Style)
- TextColor color()
- Style color(TextColor)
- StyleSetter color(TextColor)
- Style edit(Consumer)
- Style edit(Consumer, Style$Merge$Strategy)
- boolean isEmpty()
- Map decorations()
- Style decorations(Map)
- StyleSetter decorations(Map)
- boolean hasDecoration(TextDecoration)
- Style colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- **static** Style empty()
- HoverEvent hoverEvent()
- Style hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- ClickEvent clickEvent()
- Style clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- Style merge(Style)
- Style merge(Style, Style$Merge$Strategy)
- Style merge(Style, Style$Merge)
- Style merge(Style, Style$Merge$Strategy, Style$Merge)
- Style merge(Style, Style$Merge[])
- Style merge(Style, Style$Merge$Strategy, Style$Merge[])
- Style merge(Style, Set)
- Style merge(Style, Style$Merge$Strategy, Set)
- String insertion()
- Style insertion(String)
- StyleSetter insertion(String)
- **static** Style$Builder style()
- **static** Style style(Consumer)
- **static** Style style(TextColor)
- **static** Style style(TextDecoration)
- **static** Style style(TextColor, TextDecoration[])
- **static** Style style(TextColor, Set)
- **static** Style style(StyleBuilderApplicable[])
- **static** Style style(Iterable)
- TextDecoration$State decoration(TextDecoration)
- Style decoration(TextDecoration, boolean)
- Style decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- Style decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- Key font()
- Style font(Key)
- StyleSetter font(Key)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.Style$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder, me.clip.placeholderapi.libs.kyori.adventure.util.Buildable$Builder, me.clip.placeholderapi.libs.kyori.adventure.text.format.MutableStyleSetter

Methods:
- Style$Builder decorate(TextDecoration)
- Style$Builder decorate(TextDecoration[])
- MutableStyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration)
- Style$Builder color(TextColor)
- StyleSetter color(TextColor)
- Style$Builder apply(StyleBuilderApplicable)
- Style$Builder decorations(Map)
- MutableStyleSetter decorations(Map)
- StyleSetter decorations(Map)
- Style$Builder colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- Style$Builder hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- Style$Builder clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- Style build()
- Object build()
- Style$Builder merge(Style)
- Style$Builder merge(Style, Style$Merge$Strategy)
- Style$Builder merge(Style, Style$Merge[])
- Style$Builder merge(Style, Style$Merge$Strategy, Style$Merge[])
- Style$Builder merge(Style, Set)
- Style$Builder merge(Style, Style$Merge$Strategy, Set)
- Style$Builder insertion(String)
- StyleSetter insertion(String)
- Style$Builder decoration(TextDecoration, boolean)
- Style$Builder decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- Style$Builder decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- Style$Builder font(Key)
- StyleSetter font(Key)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleBuilderApplicable
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.ComponentBuilderApplicable

Methods:
- void styleApply(Style$Builder)
- void componentBuilderApply(ComponentBuilder)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleGetter
Type: Interface

Methods:
- HoverEvent hoverEvent()
- ClickEvent clickEvent()
- TextColor color()
- String insertion()
- Map decorations()
- boolean hasDecoration(TextDecoration)
- TextDecoration$State decoration(TextDecoration)
- Key font()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleSetter
Type: Interface

Methods:
- StyleSetter hoverEvent(HoverEventSource)
- StyleSetter clickEvent(ClickEvent)
- StyleSetter decorate(TextDecoration)
- StyleSetter decorate(TextDecoration[])
- StyleSetter color(TextColor)
- StyleSetter insertion(String)
- StyleSetter decorations(Map)
- StyleSetter decorations(Set, boolean)
- StyleSetter decoration(TextDecoration, boolean)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter colorIfAbsent(TextColor)
- StyleSetter font(Key)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.TextColor
Type: Interface
Implements: java.lang.Comparable, me.clip.placeholderapi.libs.kyori.examination.Examinable, me.clip.placeholderapi.libs.kyori.adventure.util.RGBLike, me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleBuilderApplicable, me.clip.placeholderapi.libs.kyori.adventure.text.format.TextFormat

Methods:
- int red()
- int green()
- int blue()
- **static** TextColor fromCSSHexString(String)
- **static** TextColor color(int)
- **static** TextColor color(RGBLike)
- **static** TextColor color(HSVLike)
- **static** TextColor color(int, int, int)
- **static** TextColor color(float, float, float)
- **static** TextColor lerp(float, RGBLike, RGBLike)
- **static** TextColor fromHexString(String)
- Stream examinableProperties()
- int compareTo(TextColor)
- int compareTo(Object)
- String asHexString()
- void styleApply(Style$Builder)
- int value()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.TextDecorationAndState
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable, me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- Stream examinableProperties()
- TextDecoration$State state()
- void styleApply(Style$Builder)
- TextDecoration decoration()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.TextFormat
Type: Interface

No public methods found

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.NamedTextColor
Type: Class
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.format.TextColor

Methods:
- **static** NamedTextColor nearestTo(TextColor)
- **static** NamedTextColor namedColor(int)
- HSVLike asHSV()
- String toString()
- Stream examinableProperties()
- int value()
- **static** NamedTextColor ofExact(int)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.Style$Merge
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Set all()
- **static** Style$Merge valueOf(String)
- **static** Set of(Style$Merge[])
- **static** Style$Merge[] values()
- **static** Set colorAndDecorations()
- **static** Set merges(Style$Merge[])

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.Style$Merge$Strategy
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Style$Merge$Strategy valueOf(String)
- **static** Style$Merge$Strategy[] values()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.TextDecoration
Type: Enum
Extends: java.lang.Enum
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.format.StyleBuilderApplicable, me.clip.placeholderapi.libs.kyori.adventure.text.format.TextFormat

Methods:
- TextDecorationAndState as(boolean)
- TextDecorationAndState as(TextDecoration$State)
- TextDecorationAndState withState(boolean)
- TextDecorationAndState withState(TextDecoration$State)
- TextDecorationAndState withState(TriState)
- **static** TextDecoration valueOf(String)
- **static** TextDecoration[] values()
- String toString()
- void styleApply(Style$Builder)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.format.TextDecoration$State
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TextDecoration$State byBoolean(boolean)
- **static** TextDecoration$State byBoolean(Boolean)
- **static** TextDecoration$State valueOf(String)
- **static** TextDecoration$State[] values()
- String toString()
- **static** TextDecoration$State byTriState(TriState)

## Package: me.clip.placeholderapi.libs.kyori.adventure.text.renderer

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.renderer.ComponentRenderer
Type: Interface

Methods:
- ComponentRenderer mapContext(Function)
- Component render(Component, Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.renderer.AbstractComponentRenderer
Type: Abstract Class
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.renderer.ComponentRenderer

Methods:
- Component render(Component, Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.renderer.TranslatableComponentRenderer
Type: Abstract Class
Extends: me.clip.placeholderapi.libs.kyori.adventure.text.renderer.AbstractComponentRenderer

Methods:
- **static** TranslatableComponentRenderer usingTranslationSource(Translator)

## Package: me.clip.placeholderapi.libs.kyori.adventure.text.serializer

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.ComponentSerializer
Type: Interface

Methods:
- Object serializeOr(Component, Object)
- Object serializeOrNull(Component)
- Object serialize(Component)
- Component deseializeOrNull(Object)
- Component deserializeOr(Object, Component)
- Component deserializeOrNull(Object)
- Component deserialize(Object)

## Package: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.bungeecord

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.bungeecord.BungeeComponentSerializer
Type: Class
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- BaseComponent[] serialize(Component)
- Object serialize(Component)
- **static** BungeeComponentSerializer legacy()
- **static** BungeeComponentSerializer of(GsonComponentSerializer, LegacyComponentSerializer)
- **static** BungeeComponentSerializer get()
- **static** boolean inject(Gson)
- **static** boolean isNative()
- Component deserialize(BaseComponent[])
- Component deserialize(Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.bungeecord.SelfSerializable$AdapterFactory
Type: Class
Implements: com.google.gson.TypeAdapterFactory

Methods:
- TypeAdapter create(Gson, TypeToken)

## Package: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.craftbukkit

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.craftbukkit.BukkitComponentSerializer
Type: Class

Methods:
- **static** LegacyComponentSerializer legacy()
- **static** GsonComponentSerializer gson()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.craftbukkit.MinecraftComponentSerializer
Type: Class
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- Object serialize(Component)
- **static** MinecraftComponentSerializer get()
- **static** boolean isSupported()
- Component deserialize(Object)

## Package: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.gson

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.gson.GsonComponentSerializer
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.ComponentSerializer, me.clip.placeholderapi.libs.kyori.adventure.util.Buildable

Methods:
- JsonElement serializeToTree(Component)
- Component deserializeFromTree(JsonElement)
- **static** GsonComponentSerializer$Builder builder()
- Gson serializer()
- **static** GsonComponentSerializer colorDownsamplingGson()
- **static** GsonComponentSerializer gson()
- UnaryOperator populator()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.gson.GsonComponentSerializer$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder, me.clip.placeholderapi.libs.kyori.adventure.util.Buildable$Builder

Methods:
- GsonComponentSerializer build()
- Object build()
- GsonComponentSerializer$Builder emitLegacyHoverEvent()
- GsonComponentSerializer$Builder legacyHoverEventSerializer(LegacyHoverEventSerializer)
- GsonComponentSerializer$Builder downsampleColors()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.gson.GsonComponentSerializer$Provider
Type: Interface

Methods:
- Consumer builder()
- GsonComponentSerializer gson()
- GsonComponentSerializer gsonLegacy()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.gson.LegacyHoverEventSerializer
Type: Interface

Methods:
- HoverEvent$ShowItem deserializeShowItem(Component) throws IOException
- HoverEvent$ShowEntity deserializeShowEntity(Component, Codec$Decoder) throws IOException
- Component serializeShowEntity(HoverEvent$ShowEntity, Codec$Encoder) throws IOException
- Component serializeShowItem(HoverEvent$ShowItem) throws IOException

## Package: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.gson.legacyimpl

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.gson.legacyimpl.NBTLegacyHoverEventSerializer
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.gson.LegacyHoverEventSerializer

Methods:
- **static** LegacyHoverEventSerializer get()

## Package: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.legacy

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.ComponentSerializer, me.clip.placeholderapi.libs.kyori.adventure.util.Buildable

Methods:
- String serialize(Component)
- Object serialize(Component)
- **static** LegacyComponentSerializer legacy(char)
- **static** LegacyComponentSerializer$Builder builder()
- **static** LegacyFormat parseChar(char)
- **static** LegacyComponentSerializer legacyAmpersand()
- **static** LegacyComponentSerializer legacySection()
- TextComponent deserialize(String)
- Component deserialize(Object)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder, me.clip.placeholderapi.libs.kyori.adventure.util.Buildable$Builder

Methods:
- LegacyComponentSerializer$Builder flattener(ComponentFlattener)
- LegacyComponentSerializer$Builder extractUrls()
- LegacyComponentSerializer$Builder extractUrls(Pattern)
- LegacyComponentSerializer$Builder extractUrls(Style)
- LegacyComponentSerializer$Builder extractUrls(Pattern, Style)
- LegacyComponentSerializer$Builder character(char)
- LegacyComponentSerializer$Builder useUnusualXRepeatedCharacterHexFormat()
- LegacyComponentSerializer build()
- Object build()
- LegacyComponentSerializer$Builder hexColors()
- LegacyComponentSerializer$Builder hexCharacter(char)

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer$Provider
Type: Interface

Methods:
- Consumer legacy()
- LegacyComponentSerializer legacyAmpersand()
- LegacyComponentSerializer legacySection()

### Class: me.clip.placeholderapi.libs.kyori.adventure.text.serializer.legacy.LegacyFormat
Type: Class
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- TextColor color()
- int hashCode()
- boolean equals(Object)
- boolean reset()
- Stream examinableProperties()
- TextDecoration decoration()

## Package: me.clip.placeholderapi.libs.kyori.adventure.title

### Class: me.clip.placeholderapi.libs.kyori.adventure.title.Title
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- Title$Times times()
- Object part(TitlePart)
- Component subtitle()
- **static** Title title(Component, Component)
- **static** Title title(Component, Component, Title$Times)
- Component title()

### Class: me.clip.placeholderapi.libs.kyori.adventure.title.Title$Times
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- **static** Title$Times times(Duration, Duration, Duration)
- Duration fadeOut()
- Duration fadeIn()
- **static** Title$Times of(Duration, Duration, Duration)
- Duration stay()

### Class: me.clip.placeholderapi.libs.kyori.adventure.title.TitlePart
Type: Interface

No public methods found

## Package: me.clip.placeholderapi.libs.kyori.adventure.translation

### Class: me.clip.placeholderapi.libs.kyori.adventure.translation.GlobalTranslator
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.translation.Translator, me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- **static** TranslatableComponentRenderer renderer()
- boolean removeSource(Translator)
- boolean addSource(Translator)
- Iterable sources()
- **static** GlobalTranslator get()
- **static** GlobalTranslator translator()
- **static** Component render(Component, Locale)

### Class: me.clip.placeholderapi.libs.kyori.adventure.translation.Translatable
Type: Interface

Methods:
- String translationKey()

### Class: me.clip.placeholderapi.libs.kyori.adventure.translation.TranslationRegistry
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.translation.Translator

Methods:
- void defaultLocale(Locale)
- boolean contains(String)
- void registerAll(Locale, Map)
- void registerAll(Locale, Path, boolean)
- void registerAll(Locale, ResourceBundle, boolean)
- void registerAll(Locale, Set, Function)
- void unregister(String)
- **static** TranslationRegistry create(Key)
- MessageFormat translate(String, Locale)
- void register(String, Locale, MessageFormat)

### Class: me.clip.placeholderapi.libs.kyori.adventure.translation.Translator
Type: Interface

Methods:
- Key name()
- MessageFormat translate(String, Locale)
- Component translate(TranslatableComponent, Locale)
- **static** Locale parseLocale(String)

## Package: me.clip.placeholderapi.libs.kyori.adventure.util

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.Buildable
Type: Interface

Methods:
- Buildable$Builder toBuilder()
- **static** Buildable configureAndBuild(Buildable$Builder, Consumer)

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.Buildable$Builder
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.adventure.builder.AbstractBuilder

Methods:
- Object build()

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.Codec
Type: Interface

Methods:
- Object encode(Object) throws Throwable
- **static** Codec codec(Codec$Decoder, Codec$Encoder)
- **static** Codec of(Codec$Decoder, Codec$Encoder)
- Object decode(Object) throws Throwable

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.Codec$Decoder
Type: Interface

Methods:
- Object decode(Object) throws Throwable

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.Codec$Encoder
Type: Interface

Methods:
- Object encode(Object) throws Throwable

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.ComponentMessageThrowable
Type: Interface

Methods:
- **static** Component getMessage(Throwable)
- **static** Component getOrConvertMessage(Throwable)
- Component componentMessage()

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.HSVLike
Type: Interface
Implements: me.clip.placeholderapi.libs.kyori.examination.Examinable

Methods:
- **static** HSVLike fromRGB(int, int, int)
- float s()
- float v()
- **static** HSVLike of(float, float, float)
- float h()
- **static** HSVLike hsvLike(float, float, float)
- Stream examinableProperties()

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.IntFunction2
Type: Interface

Methods:
- Object apply(int, int)

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.PlatformAPI
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.RGBLike
Type: Interface

Methods:
- int red()
- int green()
- int blue()
- HSVLike asHSV()

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.Ticks
Type: Interface

Methods:
- **static** Duration duration(long)

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.ForwardingIterator
Type: Class
Implements: java.lang.Iterable

Methods:
- Iterator iterator()
- Spliterator spliterator()

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.Index
Type: Class

Methods:
- Object keyOr(Object, Object)
- Object keyOrThrow(Object)
- Set keys()
- Set values()
- Map keyToValue()
- **static** Index create(Class, Function)
- **static** Index create(Class, Function, Enum[])
- **static** Index create(Function, Object[])
- **static** Index create(Function, List)
- Object valueOr(Object, Object)
- Object valueOrThrow(Object)
- Object value(Object)
- Object key(Object)
- Map valueToKey()

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.Listenable
Type: Abstract Class

No public methods found

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.MonkeyBars
Type: Class

Methods:
- **static** List addOne(List, Object)
- **static** Set enumSet(Class, Enum[])

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.Nag
Type: Abstract Class
Extends: java.lang.RuntimeException

Methods:
- **static** void print(Nag)

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.Services
Type: Class

Methods:
- **static** Optional service(Class)

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.ShadyPines
Type: Class

Methods:
- **static** boolean equals(double, double)
- **static** boolean equals(float, float)
- **static** Set enumSet(Class, Enum[])

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.TriState
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean toBooleanOrElseGet(BooleanSupplier)
- **static** TriState byBoolean(boolean)
- **static** TriState byBoolean(Boolean)
- Boolean toBoolean()
- boolean toBooleanOrElse(boolean)
- **static** TriState valueOf(String)
- **static** TriState[] values()

### Class: me.clip.placeholderapi.libs.kyori.adventure.util.UTF8ResourceBundleControl
Type: Class
Extends: java.util.ResourceBundle$Control

Methods:
- **static** ResourceBundle$Control get()
- ResourceBundle newBundle(String, Locale, String, ClassLoader, boolean) throws IllegalAccessException, InstantiationException, IOException

## Package: me.clip.placeholderapi.libs.kyori.examination

### Class: me.clip.placeholderapi.libs.kyori.examination.Examinable
Type: Interface

Methods:
- Object examine(Examiner)
- Stream examinableProperties()
- String examinableName()

### Class: me.clip.placeholderapi.libs.kyori.examination.Examiner
Type: Interface

Methods:
- Object examine(Examinable)
- Object examine(String, Stream)
- Object examine(Object)
- Object examine(boolean)
- Object examine(boolean[])
- Object examine(byte)
- Object examine(byte[])
- Object examine(char)
- Object examine(char[])
- Object examine(double)
- Object examine(double[])
- Object examine(float)
- Object examine(float[])
- Object examine(int)
- Object examine(int[])
- Object examine(long)
- Object examine(long[])
- Object examine(short)
- Object examine(short[])
- Object examine(String)

### Class: me.clip.placeholderapi.libs.kyori.examination.AbstractExaminer
Type: Abstract Class
Implements: me.clip.placeholderapi.libs.kyori.examination.Examiner

Methods:
- Object examine(Object)
- Object examine(String, Stream)
- Object examine(boolean[])
- Object examine(byte[])
- Object examine(char[])
- Object examine(double[])
- Object examine(float[])
- Object examine(int[])
- Object examine(long[])
- Object examine(short[])

### Class: me.clip.placeholderapi.libs.kyori.examination.ExaminableProperty
Type: Abstract Class

Methods:
- Object examine(Examiner)
- **static** ExaminableProperty of(String, Object)
- **static** ExaminableProperty of(String, String)
- **static** ExaminableProperty of(String, boolean)
- **static** ExaminableProperty of(String, boolean[])
- **static** ExaminableProperty of(String, byte)
- **static** ExaminableProperty of(String, byte[])
- **static** ExaminableProperty of(String, char)
- **static** ExaminableProperty of(String, char[])
- **static** ExaminableProperty of(String, double)
- **static** ExaminableProperty of(String, double[])
- **static** ExaminableProperty of(String, float)
- **static** ExaminableProperty of(String, float[])
- **static** ExaminableProperty of(String, int)
- **static** ExaminableProperty of(String, int[])
- **static** ExaminableProperty of(String, long)
- **static** ExaminableProperty of(String, long[])
- **static** ExaminableProperty of(String, short)
- **static** ExaminableProperty of(String, short[])
- String name()
- String toString()

## Package: me.clip.placeholderapi.libs.kyori.examination.string

### Class: me.clip.placeholderapi.libs.kyori.examination.string.MultiLineStringExaminer
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.examination.AbstractExaminer

Methods:
- Stream examine(boolean)
- Stream examine(byte)
- Stream examine(char)
- Stream examine(double)
- Stream examine(float)
- Stream examine(int)
- Stream examine(long)
- Stream examine(short)
- Stream examine(String)
- Object examine(String)
- Object examine(short)
- Object examine(long)
- Object examine(int)
- Object examine(float)
- Object examine(double)
- Object examine(char)
- Object examine(byte)
- Object examine(boolean)
- **static** MultiLineStringExaminer simpleEscaping()

### Class: me.clip.placeholderapi.libs.kyori.examination.string.StringExaminer
Type: Class
Extends: me.clip.placeholderapi.libs.kyori.examination.AbstractExaminer

Methods:
- String examine(boolean)
- String examine(byte)
- String examine(char)
- String examine(double)
- String examine(float)
- String examine(int)
- String examine(long)
- String examine(short)
- String examine(String)
- Object examine(String)
- Object examine(short)
- Object examine(long)
- Object examine(int)
- Object examine(float)
- Object examine(double)
- Object examine(char)
- Object examine(byte)
- Object examine(boolean)
- **static** StringExaminer simpleEscaping()

## Package: me.clip.placeholderapi.listeners

### Class: me.clip.placeholderapi.listeners.ServerLoadEventListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onServerLoad(ServerLoadEvent)

## Package: me.clip.placeholderapi.metrics

### Class: me.clip.placeholderapi.metrics.MetricsBase
Type: Class

Methods:
- void shutdown()
- void addCustomChart(CustomChart)

## Package: me.clip.placeholderapi.metrics.bukkit

### Class: me.clip.placeholderapi.metrics.bukkit.Metrics
Type: Class

Methods:
- void shutdown()
- void addCustomChart(CustomChart)

## Package: me.clip.placeholderapi.metrics.charts

### Class: me.clip.placeholderapi.metrics.charts.AdvancedBarChart
Type: Class
Extends: me.clip.placeholderapi.metrics.charts.CustomChart

No public methods found

### Class: me.clip.placeholderapi.metrics.charts.AdvancedPie
Type: Class
Extends: me.clip.placeholderapi.metrics.charts.CustomChart

No public methods found

### Class: me.clip.placeholderapi.metrics.charts.CustomChart
Type: Abstract Class

Methods:
- JsonObjectBuilder$JsonObject getRequestJsonObject(BiConsumer, boolean)

### Class: me.clip.placeholderapi.metrics.charts.DrilldownPie
Type: Class
Extends: me.clip.placeholderapi.metrics.charts.CustomChart

Methods:
- JsonObjectBuilder$JsonObject getChartData() throws Exception

### Class: me.clip.placeholderapi.metrics.charts.MultiLineChart
Type: Class
Extends: me.clip.placeholderapi.metrics.charts.CustomChart

No public methods found

### Class: me.clip.placeholderapi.metrics.charts.SimpleBarChart
Type: Class
Extends: me.clip.placeholderapi.metrics.charts.CustomChart

No public methods found

### Class: me.clip.placeholderapi.metrics.charts.SimplePie
Type: Class
Extends: me.clip.placeholderapi.metrics.charts.CustomChart

No public methods found

### Class: me.clip.placeholderapi.metrics.charts.SingleLineChart
Type: Class
Extends: me.clip.placeholderapi.metrics.charts.CustomChart

No public methods found

## Package: me.clip.placeholderapi.metrics.config

### Class: me.clip.placeholderapi.metrics.config.MetricsConfig
Type: Class

Methods:
- boolean isLogResponseStatusTextEnabled()
- boolean isLogSentDataEnabled()
- boolean didExistBefore()
- boolean isEnabled()
- boolean isLogErrorsEnabled()
- String getServerUUID()

## Package: me.clip.placeholderapi.metrics.json

### Class: me.clip.placeholderapi.metrics.json.JsonObjectBuilder
Type: Class

Methods:
- JsonObjectBuilder$JsonObject build()
- JsonObjectBuilder appendNull(String)
- JsonObjectBuilder appendField(String, String)
- JsonObjectBuilder appendField(String, int)
- JsonObjectBuilder appendField(String, JsonObjectBuilder$JsonObject)
- JsonObjectBuilder appendField(String, String[])
- JsonObjectBuilder appendField(String, int[])
- JsonObjectBuilder appendField(String, JsonObjectBuilder$JsonObject[])

### Class: me.clip.placeholderapi.metrics.json.JsonObjectBuilder$JsonObject
Type: Class

Methods:
- String toString()

## Package: me.clip.placeholderapi.replacer

### Class: me.clip.placeholderapi.replacer.Replacer
Type: Interface

Methods:
- String apply(String, OfflinePlayer, Function)

### Class: me.clip.placeholderapi.replacer.CharsReplacer
Type: Class
Implements: me.clip.placeholderapi.replacer.Replacer

Methods:
- String apply(String, OfflinePlayer, Function)

### Class: me.clip.placeholderapi.replacer.Replacer$Closure
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Replacer$Closure valueOf(String)
- **static** Replacer$Closure[] values()

## Package: me.clip.placeholderapi.updatechecker

### Class: me.clip.placeholderapi.updatechecker.UpdateChecker
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- boolean hasUpdateAvailable()
- void onJoin(PlayerJoinEvent)
- String getSpigotVersion()
- void fetch()

## Package: me.clip.placeholderapi.util

### Class: me.clip.placeholderapi.util.FileUtil
Type: Class

Methods:
- **static** Class findClass(File, Class) throws IOException, ClassNotFoundException

### Class: me.clip.placeholderapi.util.Format
Type: Class

Methods:
- **static** Optional tablify(Format$Align, List)

### Class: me.clip.placeholderapi.util.Format$Align
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Format$Align valueOf(String)
- **static** Format$Align[] values()

### Class: me.clip.placeholderapi.util.Futures
Type: Class

Methods:
- **static** CompletableFuture of(Stream)
- **static** CompletableFuture of(Collection)
- **static** void onMainThread(Plugin, CompletableFuture, BiConsumer)
- **static** Collector collector()

### Class: me.clip.placeholderapi.util.Msg
Type: Class

Methods:
- **static** void broadcast(String[])
- **static** void msg(CommandSender, String[])
- **static** void warn(String, Object[])
- **static** void warn(String, Throwable, Object[])
- **static** String color(String)
- **static** void log(Level, String, Object[])
- **static** void severe(String, Object[])
- **static** void severe(String, Throwable, Object[])
- **static** void info(String, Object[])

### Class: me.clip.placeholderapi.util.TimeFormat
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TimeFormat valueOf(String)
- **static** TimeFormat[] values()

### Class: me.clip.placeholderapi.util.TimeUtil
Type: Class

Methods:
- **static** String getTime(Duration)
- **static** String getTime(int)
- **static** String getTime(long)
- **static** String getRemaining(int, TimeFormat)
- **static** String getRemaining(long, TimeFormat)

