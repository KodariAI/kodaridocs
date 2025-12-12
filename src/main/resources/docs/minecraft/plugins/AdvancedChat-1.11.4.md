# AdvancedChat-1.11.4 API Reference

## Package: net.advancedplugins.chat

### Class: net.advancedplugins.chat.Core
Type: Class
Extends: net.advancedplugins.chat.impl.utils.plugin.AdvancedPlugin

Methods:
- **static** JoinMessagesHandler getJoinMessagesHandler()
- **static** RuleHandler getRuleHandler()
- **static** ChannelHandler getChannelHandler()
- **static** FormattingHandler getFormattingHandler()
- **static** PluginMessageBroker getPluginMessageBroker()
- **static** ServerListMOTDHandler getServerListMOTDHandler()
- **static** TagsHandler getTagsHandler()
- **static** CrossServerMessageBroker getCrossServerMessageBroker()
- **static** ChannelStorage getChannelStorage()
- void registerListeners()
- **static** BukkitAudiences getAdventure()
- **static** SwearWordsHandler getSwearWordsHandler()
- **static** ChatBubbleHandler getChatBubbleHandler()
- void startup()
- void unload()
- **static** CustomCommandsStorage getCustomCommandsStorage()
- void registerCommands()
- **static** CommandsHandler getCommandsHandler()
- **static** CommandsHiderHandler getCommandsHiderHandler()
- **static** CustomCommandsHandler getCustomCommandsHandler()
- **static** NameColorHandler getNameColorHandler()
- **static** CustomizerHandler getCustomizerHandler()
- **static** LocaleHandler getLocaleHandler()
- **static** ChatColorHandler getChatColorHandler()
- **static** VariablesHandler getVariablesHandler()
- **static** AIHandler getAiHandler()
- **static** AnnouncementsHandler getAnnouncementsHandler()
- void startupTasks()
- **static** GamesHandler getGamesHandler()
- **static** AdvancedMenusHandler getMenusHandler()
- **static** EffectsHandler getEffectsHandler()

## Package: net.advancedplugins.chat.abilities

### Class: net.advancedplugins.chat.abilities.ChatAbilitiesReader
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.reader.AbilitiesReader

Methods:
- List<AdvancedAbility> getRawAbilities(ActionExecutionBuilder)

## Package: net.advancedplugins.chat.abilities.custom

### Class: net.advancedplugins.chat.abilities.custom.OnGameEndTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- **static** OnGameEndTrigger getTrigger()
- void activate()

### Class: net.advancedplugins.chat.abilities.custom.OnGameStartTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- **static** OnGameStartTrigger getTrigger()
- void activate()

### Class: net.advancedplugins.chat.abilities.custom.OnMessageTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- **static** OnMessageTrigger getTrigger()
- **static** String stripMsg(String)
- void activate(AsyncPlayerChatEvent)

### Class: net.advancedplugins.chat.abilities.custom.ReplaceMessageEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.abilities.custom.ReplaceRegexMessageEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.abilities.custom.StartGameEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.abilities.custom.StopAbilitiesEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.abilities.custom.StopGameEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

## Package: net.advancedplugins.chat.ai

### Class: net.advancedplugins.chat.ai.AIHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- void reload()
- void addMessage(Player, String)

### Class: net.advancedplugins.chat.ai.AIRequest
Type: Class

Methods:
- Player getPlayer()
- String getMessage()
- UUID getPlayerUUID()

### Class: net.advancedplugins.chat.ai.ChatViolation
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SWEARING
- SEXUAL
- HATE
- HARASSMENT
- SELF_HARM
- SEXUAL_MINORS
- HATE_THREATENING
- VIOLENCE_GRAPHIC
- SELF_HARM_INTENT
- SELF_HARM_INSTRUCTIONS
- HARASSMENT_THREATENING
- VIOLENCE

Methods:
- **static** ChatViolation fromSerializedName(String)
- String getSerialized()
- **static** ChatViolation valueOf(String)
- **static** ChatViolation[] values()
- String getBypassPermission(String)
- boolean isFlagged(ContentItem)

### Class: net.advancedplugins.chat.ai.ContentItem
Type: Class

Methods:
- ContentItem$Categories getCategories()
- Map<String, Double> getCategory_scores()
- boolean isFlagged()

### Class: net.advancedplugins.chat.ai.ContentItem$Categories
Type: Class

Methods:
- boolean isSwearing()
- boolean isHateThreatening()
- boolean isViolenceGraphic()
- boolean isSelfHarm()
- boolean isSexual()
- boolean isHarassment()
- boolean isHarassmentThreatening()
- boolean isHate()
- boolean isViolence()
- boolean isSelfHarmInstructions()
- boolean isSelfHarmIntent()
- boolean isSexualMinors()

## Package: net.advancedplugins.chat.announcements

### Class: net.advancedplugins.chat.announcements.AnnouncementsHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- int getInterval()
- int getCurrentAnnouncement()
- void reload()
- void displayAnnouncement(String)
- List<String> getOrder()
- HashMap<String, List<String>> getAnnouncements()
- boolean isRandomOrder()
- String getSound()
- void displayAnnouncements()

## Package: net.advancedplugins.chat.api

### Class: net.advancedplugins.chat.api.AdvancedChannelChatEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- boolean isQuickMessage()
- void setRange(double)
- ChatChannel getChannel()
- void setCancelled(boolean)
- double getRange()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getMessage()
- void setSender(CommandSender)
- void setMessage(String)
- CommandSender getSender()
- void setQuickMessage(boolean)

### Class: net.advancedplugins.chat.api.AdvancedChatAPI
Type: Class

Methods:
- void openNameColorMenu(Player)
- ChatChannel getChatChannel(String)
- boolean joinChatChannel(UUID, String)
- boolean joinChatChannel(UUID, ChatChannel)
- List<ChatChannel> getAllowedChatChannels(CommandSender)
- boolean isSpyingOnChannel(Player, String)
- boolean isSpyingOnChannel(Player, ChatChannel)
- void removeAllPlayerSpy(Player)
- ChatChannel getPlayerChatChannel(UUID)
- boolean hasPlayerIgnored(Player, String)
- Map<String, ChatRule> getChatRules()
- CustomNameColor getPlayerCustomNameColor(Player)
- boolean hasAllPlayersIgnored(Player)
- void removeAllPlayerIgnore(Player)
- Map<String, CustomCommand> getCustomCommands()
- boolean isCustomCommand(String)
- List<ChatChannel> getChatChannels()
- boolean unregisterCustomCommand(String)
- TextResult processMessageSwear(Player, String)
- boolean addChannelSpy(Player, String)
- boolean addChannelSpy(Player, ChatChannel)
- CustomNameColor getCustomNameColor(String)
- void setAllPlayerSpy(Player)
- boolean canUseColors(Permissible)
- CustomChatColor getPlayerCustomColor(Player)
- boolean removePlayerIgnore(Player, String)
- String getPlayerChatTagName(Player)
- boolean isChatGameRunning()
- void setChatTag(Player, String)
- void setChatTag(Player, ChatTag)
- void addChatRule(String, ChatRule)
- HashMap<String, ChatGame> getChatGames()
- boolean removePlayerSpy(Player, String)
- Set<String> getSpiedChannels(Player)
- ChatFormat getSenderChatFormat(CommandSender)
- boolean isSpyingOnAllChannels(Player)
- Set<String> getCrossServerPlayers()
- Set<String> getCrossServerPlayers(boolean)
- ChatTag getChatTag(String)
- boolean isSpyingOnPlayer(Player, String)
- boolean addPlayerIgnore(Player, String)
- Map<String, CustomVariable> getCustomVariables()
- ChatFormat getChatFormat(String)
- void setAllPlayerIgnore(Player)
- void addChatFormat(String, ChatFormat)
- boolean removeChannelSpy(Player, String)
- boolean removeChannelSpy(Player, ChatChannel)
- boolean isSpyingOnAllPlayers(Player)
- ChatTag getPlayerChatTag(Player)
- boolean registerCustomCommand(String, CustomCommand)
- boolean addPlayerSpy(Player, String)
- Set<String> getIgnoredPlayers(Player)
- void registerCustomVariable(JavaPlugin, CustomVariable)
- boolean areChatGamesEnabled()
- void startChatGame(ChatGame)
- void openChatTagsMenu(Player)
- boolean isPlayerInChannel(UUID)
- void leaveChatChannel(UUID)
- boolean leaveChatChannel(UUID, String)
- boolean leaveChatChannel(UUID, ChatChannel)
- boolean canBypassIgnore(Permissible)
- boolean canUseMagicColors(Permissible)
- CustomChatColor getCustomColor(String)
- **static** AdvancedChatAPI getApi()
- ChatRule getChatRule(String)
- Set<String> getSpiedPlayers(Player)
- ChatGame getRunningChatGame()
- JoinMessage getJoinMessageFormat(Player)
- boolean setChatFormat(ChatFormat, Player)
- void startRandomChatGame(ChatGame)
- boolean isChatChannel(String)
- Set<String> getSwearWordList()
- void openChatColorMenu(Player)
- void setAllChannelSpy(Player, boolean)

### Class: net.advancedplugins.chat.api.AdvancedChatEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setRange(double)
- void setCancelled(boolean)
- double getRange()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getMessage()
- void setMessage(String)
- AsyncPlayerChatEvent getChatEvent()

### Class: net.advancedplugins.chat.api.AnnouncementSendEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- String getUnparsedMessage()
- boolean isCancelled()
- void setUnparsedMessage(String)
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: net.advancedplugins.chat.bubbles

### Class: net.advancedplugins.chat.bubbles.ChatBubble
Type: Class

Methods:
- int getMaxCount()
- void removeActive(Player)
- String getCutOffMessage()
- int getBackgroundARGB()
- float getScale()
- int getMaxLength()
- boolean isRemoveOnMove()
- int getPriority()
- int getDurationMillis()
- List<String> getLines()
- int getMaxLines()
- void send(Player, String)

### Class: net.advancedplugins.chat.bubbles.ChatBubble$BubbleData
Type: Class
Extends: java.lang.Record

Methods:
- ChatBubble bubble()
- Player sender()
- int hashCode()
- TextDisplay display()
- boolean equals(Object)
- String toString()
- Location senderOriginalLoc()
- Long time()

### Class: net.advancedplugins.chat.bubbles.ChatBubbleHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- List<ChatBubble> getChatBubbles(Permissible)
- void reload()
- void displayBubble(Player, String)

## Package: net.advancedplugins.chat.channel

### Class: net.advancedplugins.chat.channel.ChannelHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler
Implements: org.bukkit.event.Listener

Methods:
- boolean isQuickMessage(String)
- boolean sendQuickMessage(CommandSender, String)

### Class: net.advancedplugins.chat.channel.ChannelStorage
Type: Class

Methods:
- boolean isInChannel(UUID)
- ChatChannel getPlayerChannel(UUID)
- void init()
- Set<UUID> getPlayersInChannel(ChatChannel)
- List<ChatChannel> getAllowedChannels(CommandSender)
- boolean isChannel(String)
- boolean setConsoleChannel(ChatChannel)
- void leaveChannel(UUID)
- ChatChannel getConsoleChannel()
- List<String> getChannelSections()
- void reload()
- ChatChannel getChannel(String)
- boolean isAutoJoin()
- List<ChatChannel> getChannels()
- boolean joinChannel(UUID, ChatChannel)

### Class: net.advancedplugins.chat.channel.ChatChannel
Type: Class

Methods:
- String parsePlaceholders(String)
- String getPrefix()
- String getName()
- void setDisabled(boolean)
- String getColor()
- boolean isSameWorld()
- String getSectionName()
- int hashCode()
- double getRange()
- boolean equals(Object)
- void sendChannelMessage(CommandSender, String, boolean)
- int getPriority()
- boolean isCrossServer()
- String toString()
- boolean isAlwaysVisible()
- boolean isDisabled()

## Package: net.advancedplugins.chat.chat.pdc

### Class: net.advancedplugins.chat.chat.pdc.ChannelSpyPlayer
Type: Class

Methods:
- **static** boolean removeChannelSpy(Player, String)
- **static** boolean addChannelSpy(Player, String)
- **static** boolean isSpyingOnAll(Player)
- **static** Set<String> getSpiedChannels(Player)
- **static** void setSpyOnAll(Player)
- **static** void stopSpyingOnAll(Player)
- **static** boolean isSpying(Player, String)

### Class: net.advancedplugins.chat.chat.pdc.HideAnnouncementsPlayer
Type: Class

Methods:
- **static** boolean isHidingAnnouncements(Player)
- **static** void stopHidingAnnouncements(Player)
- **static** void setHideAnnouncements(Player)

### Class: net.advancedplugins.chat.chat.pdc.HideChatPlayer
Type: Class

Methods:
- **static** void setHideChat(Player)
- **static** boolean isHidingChat(Player)
- **static** void stopHidingChat(Player)

### Class: net.advancedplugins.chat.chat.pdc.IgnoredPlayer
Type: Class

Methods:
- **static** void setAllIgnore(Player)
- **static** boolean canBypassIgnore(Permissible)
- **static** void stopAllIgnore(Player)
- **static** boolean removePlayerIgnore(Player, String)
- **static** boolean addPlayerIgnore(Player, String)
- **static** Set<String> getIgnoredPlayers(Player)
- **static** boolean hasPlayerIgnored(Player, String)
- **static** boolean hasAllIgnored(Player)

### Class: net.advancedplugins.chat.chat.pdc.SpyPlayer
Type: Class

Methods:
- **static** boolean removePlayerSpy(Player, String)
- **static** boolean isSpyingOnAll(Player)
- **static** void setSpyOnAll(Player)
- **static** boolean addPlayerSpy(Player, String)
- **static** void stopSpyingOnAll(Player)
- **static** boolean isSpying(Player, String)
- **static** Set<String> getSpiedPlayers(Player)

### Class: net.advancedplugins.chat.chat.pdc.WarnPlayer
Type: Class

Methods:
- **static** boolean hasWarns(Player)
- **static** void clearWarns(Player)
- **static** void addWarn(Player)
- **static** void setWarns(Player, int)
- **static** int getWarns(Player)

## Package: net.advancedplugins.chat.chat.player_head

### Class: net.advancedplugins.chat.chat.player_head.ChatHead
Type: Class

Methods:
- **static** ChatHead getBlocking(int, String)
- **static** ChatHead of(int, String)
- CompletableFuture<List<Component>> fetchHeadLines()
- List<Component> getHeadLines()
- **static** ChatHead getIfCached(int, String)

### Class: net.advancedplugins.chat.chat.player_head.ChatHeadListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onPlayerQuit(PlayerQuitEvent)
- void onPlayerJoin(AsyncPlayerPreLoginEvent)

## Package: net.advancedplugins.chat.colors

### Class: net.advancedplugins.chat.colors.ChatColorHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- String formatMessage(Player, String)
- ImmutableMap<String, CustomChatColor> getColors()
- void reload()
- void setPlayerColor(Player, String)
- JavaPlugin getPlugin()
- CustomChatColor getColor(String)
- CustomChatColor getColor(Player)

### Class: net.advancedplugins.chat.colors.CustomChatColor
Type: Class

Methods:
- void setName(String)
- String getName()
- V setLore(List<String>)
- void setFormat(String)
- **static** CustomChatColor$CustomChatColorBuilder builder()
- ItemStack getItem()
- String getFormat()
- void setItem(ItemStack)
- List<String> getLore()

### Class: net.advancedplugins.chat.colors.CustomChatColor$CustomChatColorBuilder
Type: Class

Methods:
- CustomChatColor$CustomChatColorBuilder item(ItemStack)
- CustomChatColor$CustomChatColorBuilder lore(List<String>)
- CustomChatColor build()
- CustomChatColor$CustomChatColorBuilder name(String)
- CustomChatColor$CustomChatColorBuilder format(String)
- String toString()

### Class: net.advancedplugins.chat.colors.CustomNameColor
Type: Class

Methods:
- void setName(String)
- String getName()
- V setLore(List<String>)
- void setFormat(String)
- **static** CustomNameColor$CustomNameColorBuilder builder()
- ItemStack getItem()
- String getFormat()
- void setItem(ItemStack)
- List<String> getLore()

### Class: net.advancedplugins.chat.colors.CustomNameColor$CustomNameColorBuilder
Type: Class

Methods:
- CustomNameColor$CustomNameColorBuilder item(ItemStack)
- CustomNameColor$CustomNameColorBuilder lore(List<String>)
- CustomNameColor build()
- CustomNameColor$CustomNameColorBuilder name(String)
- CustomNameColor$CustomNameColorBuilder format(String)
- String toString()

### Class: net.advancedplugins.chat.colors.NameColorHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- ImmutableMap<String, CustomNameColor> getColors()
- void reload()
- void setPlayerColor(Player, String)
- JavaPlugin getPlugin()
- String formatName(Player, String)
- CustomNameColor getColor(String)
- CustomNameColor getColor(Player)

## Package: net.advancedplugins.chat.command_hider

### Class: net.advancedplugins.chat.command_hider.CommandsHiderHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- void init()
- void reload()

### Class: net.advancedplugins.chat.command_hider.CommandsHiderListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onCommandSend(PlayerCommandSendEvent)

## Package: net.advancedplugins.chat.commands

### Class: net.advancedplugins.chat.commands.CommandsHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

No public methods found

## Package: net.advancedplugins.chat.commands.impl

### Class: net.advancedplugins.chat.commands.impl.AlertStaffCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.ChatColorCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.NameColorCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.WarnCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- **static** void load()
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.WarnPunishment$WarnPunishmentBuilder
Type: Class

Methods:
- WarnPunishment build()
- WarnPunishment$WarnPunishmentBuilder warns(int)
- String toString()
- WarnPunishment$WarnPunishmentBuilder commands(List<String>)

## Package: net.advancedplugins.chat.commands.impl.channel

### Class: net.advancedplugins.chat.commands.impl.channel.ChannelCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.channel.ChannelsCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- **static** boolean canListChannels(Permissible)
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.channel.disable

### Class: net.advancedplugins.chat.commands.impl.channel.disable.ChannelDisableCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- **static** boolean canBypassDisabledChannel(Permissible)
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.channel.disable.ChannelEnableCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.channel.spy

### Class: net.advancedplugins.chat.commands.impl.channel.spy.ChannelSpyCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.channel.spy.ChannelUnSpyCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.channel.spy.sub

### Class: net.advancedplugins.chat.commands.impl.channel.spy.sub.ChannelSpyAllSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.channel.spy.sub.ChannelSpyChannelSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.channel.spy.sub.ChannelSpyListSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.channel.spy.sub.ChannelUnSpyAllSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.channel.spy.sub.ChannelUnSpyChannelSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.channel.sub

### Class: net.advancedplugins.chat.commands.impl.channel.sub.ChannelAutoJoinSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.channel.sub.ChannelInfoSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.channel.sub.ChannelJoinSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.channel.sub.ChannelLeaveSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.commandspy

### Class: net.advancedplugins.chat.commands.impl.commandspy.CommandSpyCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand
Implements: org.bukkit.event.Listener

Methods:
- void onExecute(CommandSender, String[])
- void onLeave(PlayerQuitEvent)

## Package: net.advancedplugins.chat.commands.impl.hideannouncements

### Class: net.advancedplugins.chat.commands.impl.hideannouncements.HideAnnouncementsCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.hidechat

### Class: net.advancedplugins.chat.commands.impl.hidechat.HideChatCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])
- **static** boolean canBypassHiddenChat(Permissible)

## Package: net.advancedplugins.chat.commands.impl.ignore

### Class: net.advancedplugins.chat.commands.impl.ignore.IgnoreCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- **static** boolean canIgnore(Permissible)
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.ignore.UnIgnoreCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- **static** boolean canUnIgnore(Permissible)
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.ignore.sub

### Class: net.advancedplugins.chat.commands.impl.ignore.sub.IgnoreAllSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])
- **static** boolean canIgnoreAll(Permissible)

### Class: net.advancedplugins.chat.commands.impl.ignore.sub.IgnoreListSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.ignore.sub.IgnorePlayerSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- **static** boolean canIgnore(Permissible)
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.ignore.sub.UnIgnoreAllSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- **static** boolean canUnIgnoreAll(Permissible)
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.ignore.sub.UnIgnorePlayerSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.main_cmd

### Class: net.advancedplugins.chat.commands.impl.main_cmd.ChatCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.main_cmd.sub

### Class: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigSubCommand

Methods:
- void onExecute(CommandSender, String[])
- LocaleHandler lang()

### Class: net.advancedplugins.chat.commands.impl.main_cmd.sub.AnnounceConfigSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.main_cmd.sub.AnnounceSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand
Implements: org.bukkit.plugin.messaging.PluginMessageListener

Methods:
- void onPluginMessageReceived(String, Player, byte[])
- void sendToOtherServers(CommandSender, String)
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.main_cmd.sub.ClearSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.main_cmd.sub.CommandsSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.main_cmd.sub.DisableChatSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- **static** boolean canBypassDisabledChat(Permissible)
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.main_cmd.sub.InfoSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.main_cmd.sub.PreviewAnnouncementSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.main_cmd.sub.ReloadSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.msg

### Class: net.advancedplugins.chat.commands.impl.msg.MsgCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand
Implements: org.bukkit.plugin.messaging.PluginMessageListener

Methods:
- void onPluginMessageReceived(String, Player, byte[])
- void onExecute(CommandSender, String[])
- **static** void send(CommandSender, String, String, boolean, boolean)
- **static** boolean canUseMsg(Permissible)

### Class: net.advancedplugins.chat.commands.impl.msg.ReplyCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- **static** boolean canReply(Permissible)
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.spy

### Class: net.advancedplugins.chat.commands.impl.spy.SpyCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.spy.UnSpyCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.spy.sub

### Class: net.advancedplugins.chat.commands.impl.spy.sub.SpyAllSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.spy.sub.SpyListSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.spy.sub.SpyPlayerSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.spy.sub.UnSpyAllSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.spy.sub.UnSpyPlayerSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.tags

### Class: net.advancedplugins.chat.commands.impl.tags.TagsCommand
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.commands.impl.tags.sub

### Class: net.advancedplugins.chat.commands.impl.tags.sub.ApplyTagSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.tags.sub.CreateTagSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.tags.sub.DeleteTagSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

### Class: net.advancedplugins.chat.commands.impl.tags.sub.ListTagsSub
Type: Class
Extends: net.advancedplugins.chat.commands.impl.main_cmd.sub.ACSubCommand

Methods:
- void onExecute(CommandSender, String[])

## Package: net.advancedplugins.chat.cross_server.player

### Class: net.advancedplugins.chat.cross_server.player.CrossServerMessageBroker
Type: Class
Implements: org.bukkit.plugin.messaging.PluginMessageListener

Methods:
- void onPluginMessageReceived(String, Player, byte[])
- void requestPlayers(Player)
- void sendChatMessage(Player, String, Component)
- void sendPlayers(Player, String, CrossServerPlayer[])
- V listen(CrossServerMessageBroker$SubChannel, BiConsumer<Player, [B>)

### Class: net.advancedplugins.chat.cross_server.player.CrossServerMessageBroker$SubChannel
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PLAYER_LIST
- PLAYER_LIST_RESPONSE

Methods:
- String getName()
- **static** CrossServerMessageBroker$SubChannel valueOf(String)
- **static** CrossServerMessageBroker$SubChannel[] values()
- **static** CrossServerMessageBroker$SubChannel fromName(String)

### Class: net.advancedplugins.chat.cross_server.player.CrossServerPlayer
Type: Class
Extends: java.lang.Record

Methods:
- boolean vanished()
- int hashCode()
- boolean equals(Object)
- String name()
- String serverName()
- Set<String> ignoredPlayerNames()
- ChatChannel chatChannel()
- String toString()
- boolean allIgnored()
- Set<String> allowedChannels()
- JoinMessage joinMessage()

### Class: net.advancedplugins.chat.cross_server.player.CrossServerPlayerAdapter
Type: Class
Implements: com.google.gson.JsonSerializer, com.google.gson.JsonDeserializer

Methods:
- JsonElement serialize(CrossServerPlayer, Type, JsonSerializationContext)
- JsonElement serialize(Object, Type, JsonSerializationContext)
- CrossServerPlayer deserialize(JsonElement, Type, JsonDeserializationContext)
- Object deserialize(JsonElement, Type, JsonDeserializationContext)

### Class: net.advancedplugins.chat.cross_server.player.CrossServerPlayers
Type: Class

Methods:
- **static** Set<String> getPlayerNames(boolean)
- **static** V setPlayers(Set<CrossServerPlayer>)
- **static** Set<CrossServerPlayer> addPlayers(CrossServerPlayer)
- **static** CrossServerPlayer getByName(String)
- **static** void removePlayers(CrossServerPlayer[])
- **static** Set<String> getNonVanishedPlayerNames(boolean)
- **static** Set<CrossServerPlayer> getRemotePlayers()

### Class: net.advancedplugins.chat.cross_server.player.CrossServerPlayersHandler
Type: Class

Methods:
- **static** void fetchServerName()
- void runPlayerDifferenceTask()

## Package: net.advancedplugins.chat.cross_server.player.event

### Class: net.advancedplugins.chat.cross_server.player.event.CrossServerPlayerEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- CrossServerPlayer getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: net.advancedplugins.chat.cross_server.player.event.CrossServerPlayerJoinEvent
Type: Class
Extends: net.advancedplugins.chat.cross_server.player.event.CrossServerPlayerEvent

No public methods found

### Class: net.advancedplugins.chat.cross_server.player.event.CrossServerPlayerQuitEvent
Type: Class
Extends: net.advancedplugins.chat.cross_server.player.event.CrossServerPlayerEvent

No public methods found

## Package: net.advancedplugins.chat.custom_command

### Class: net.advancedplugins.chat.custom_command.CustomCommand
Type: Class

Methods:
- List<String> getAliases()
- String getPermission()
- Map<String, CustomCommand$SubCommand> getSubCommands()
- List<AdvancedAbility> getAbility()
- String getDescription()
- String getBaseCommand()
- List<AdvancedAbility> getInvalidArgsAbility()

### Class: net.advancedplugins.chat.custom_command.CustomCommand$SubCommand
Type: Class

Methods:
- List<AdvancedAbility> getAbility()

### Class: net.advancedplugins.chat.custom_command.CustomCommandTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onCommand(PlayerCommandPreprocessEvent)
- **static** String getAction()

### Class: net.advancedplugins.chat.custom_command.CustomCommandVariables
Type: Class

Methods:
- **static** List<String> generateVariables(String, int)

### Class: net.advancedplugins.chat.custom_command.CustomCommandsHandler
Type: Class

Methods:
- List<AdvancedAbility> getCustomCommandAbilities(PreCustomCommandEvent)

### Class: net.advancedplugins.chat.custom_command.CustomCommandsStorage
Type: Class

Methods:
- void init()
- void reload()
- Map<String, CustomCommand> getCommandsMap()
- **static** void invokeSyncCommands()
- CustomCommand getCommand(String)
- boolean isCustomCommand(String)
- **static** V registerCommand(String, String, String, List<String>)
- **static** void unregisterCommand(String)

### Class: net.advancedplugins.chat.custom_command.CustomCommandsTabCompleter
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onTabComplete(TabCompleteEvent)

### Class: net.advancedplugins.chat.custom_command.PreCustomCommandEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getCmd()
- String[] getArgs()

## Package: net.advancedplugins.chat.customizer

### Class: net.advancedplugins.chat.customizer.ChatCustomization
Type: Class

Methods:
- String getFind()
- String getKey()
- CompareType getFindType()
- **static** ChatCustomization$ChatCustomizationBuilder builder()
- Map<String, String> getReplaceables()

### Class: net.advancedplugins.chat.customizer.ChatCustomization$ChatCustomizationBuilder
Type: Class

Methods:
- ChatCustomization build()
- ChatCustomization$ChatCustomizationBuilder find(String)
- ChatCustomization$ChatCustomizationBuilder replaceable(String, String)
- ChatCustomization$ChatCustomizationBuilder findType(CompareType)
- String toString()
- ChatCustomization$ChatCustomizationBuilder clearReplaceables()
- ChatCustomization$ChatCustomizationBuilder replaceables(Map<String, String>)
- ChatCustomization$ChatCustomizationBuilder key(String)

### Class: net.advancedplugins.chat.customizer.CustomizerHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- HashSet<ChatCustomization> getCustomizations()
- CustomizerProtLibHook getCustomizerEngine()
- void reload()
- JavaPlugin getPlugin()
- String parseMessage(Player, String)

### Class: net.advancedplugins.chat.customizer.CustomizerProtLibHook
Type: Class

No public methods found

## Package: net.advancedplugins.chat.formatting

### Class: net.advancedplugins.chat.formatting.ChatFormat
Type: Class

Methods:
- String getFormatName()
- String getPermission()
- ChatFormatGroup getPrefixFormat()
- ChatFormatGroup getSuffixFormat()
- double getRange()
- boolean isCrossServer()
- int getPriority()
- ChatFormatGroup getChatFormat()
- ChatFormatGroup getNameFormat()

### Class: net.advancedplugins.chat.formatting.DefaultFormatHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

No public methods found

### Class: net.advancedplugins.chat.formatting.FormatStorage
Type: Class

Methods:
- ImmutableMap<String, ChatFormat> getFormats()
- ChatFormat getFormat(String)
- void addFormat(String, ChatFormat)

### Class: net.advancedplugins.chat.formatting.FormattingHandler
Type: Class

Methods:
- boolean hasFormat(CommandSender)
- void reload()
- JavaPlugin getPlugin()
- ChatFormat getDefaultFormat()
- FormatStorage getFormatStorage()
- Set<Player> getPlayersInRange(Player, double)
- ChatFormat getFormat(CommandSender)
- String getFormatFor(CommandSender, Object, String)

## Package: net.advancedplugins.chat.formatting.groups

### Class: net.advancedplugins.chat.formatting.groups.ChatFormatGroup
Type: Class

Methods:
- String getClick()
- String getText()
- ImmutableList<String> getHover()

## Package: net.advancedplugins.chat.games

### Class: net.advancedplugins.chat.games.ChatGame
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- AdvancedAbility getGameEndNoWinner()
- String getType()
- AdvancedAbility getGameEndWinner()
- String getGameName()
- boolean isEnabled()
- int getLength()
- AdvancedAbility getGameStart()

### Class: net.advancedplugins.chat.games.GamesHandler
Type: Class

Methods:
- ChatGame getRunningGame()
- void setGameInterval(int)
- List<AdvancedAbility> passToGame(String)
- void setEnabled(boolean)
- void setRunningGame(ChatGame)
- void setTimerId(int)
- void reload()
- int getTimerId()
- JavaPlugin getPlugin()
- boolean isEnabled()
- V setGames(HashMap<String, ChatGame>)
- void stopGame(boolean)
- void startGame()
- void startGame(ChatGame)
- HashMap<String, ChatGame> getGames()
- int getGameInterval()

## Package: net.advancedplugins.chat.impl.commons.api

### Class: net.advancedplugins.chat.impl.commons.api.AbilityPreactivateEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- ActionExecution getActionExecution()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- LivingEntity getOtherEntity()
- AdvancedAbility getEffect()
- LivingEntity getMainEntity()

### Class: net.advancedplugins.chat.impl.commons.api.EffectsActivateEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- ExecutionTask getExecutionTask()
- EffectsActivateEvent setOtherTargets(List<LivingEntity>)
- List<LivingEntity> getOtherTargets()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- LivingEntity getOtherEntity()
- AdvancedAbility getEffect()
- LivingEntity getMainEntity()

### Class: net.advancedplugins.chat.impl.commons.api.EffectsActivatedEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- ExecutionTask getExecutionTask()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- LivingEntity getOtherEntity()
- AdvancedAbility getEffect()
- LivingEntity getMainEntity()

## Package: net.advancedplugins.chat.impl.commons.armorutils

### Class: net.advancedplugins.chat.impl.commons.armorutils.ArmorEquipEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Methods:
- void setNewArmorPiece(ItemStack)
- boolean isCancelled()
- Long getCalled()
- void setOldArmorPiece(ItemStack)
- ArmorType getType()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ArmorEquipEvent$EquipMethod getMethod()
- ItemStack getOldArmorPiece()
- ItemStack getNewArmorPiece()
- boolean isSendMessage()
- void setSendMessage(boolean)

### Class: net.advancedplugins.chat.impl.commons.armorutils.ArmorEquipEvent$EquipMethod
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SHIFT_CLICK
- DRAG
- PICK_DROP
- HOTBAR
- HOTBAR_SWAP
- OFFHAND_SWAP
- DISPENSER
- BROKE
- DEATH
- WORLD_CHANGE
- COMMAND

Methods:
- **static** ArmorEquipEvent$EquipMethod valueOf(String)
- **static** ArmorEquipEvent$EquipMethod[] values()

### Class: net.advancedplugins.chat.impl.commons.armorutils.ArmorListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void playerInteractEvent(PlayerInteractEvent)
- void itemBreakEvent(PlayerItemBreakEvent)
- void inventoryDrag(InventoryDragEvent)
- void playerDeathEvent(PlayerRespawnEvent)
- void onInventoryClick(InventoryClickEvent)

### Class: net.advancedplugins.chat.impl.commons.armorutils.ArmorType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- HELMET
- CHESTPLATE
- LEGGINGS
- BOOTS

Methods:
- **static** V setHelmets(List<String>)
- **static** List<String> getHelmets()
- **static** ArmorType matchType(ItemStack)
- **static** ArmorType matchType(String)
- **static** ArmorType valueOf(String)
- **static** ArmorType fromSlot(int)
- **static** ArmorType[] values()
- **static** V setLeggings(List<String>)
- **static** List<String> getLeggings()
- **static** ArmorType getClosest(LivingEntity, ItemStack)
- int getSlot()
- **static** List<String> getChestPlates()
- EquipmentSlot getEquipmentSlot()
- ItemStack get(LivingEntity)
- **static** V setBoots(List<String>)
- **static** V setChestPlates(List<String>)
- RollItemType getRollItemType()
- **static** List<String> getBoots()
- **static** Map<ArmorType, ItemStack> getArmorContents(LivingEntity)
- **static** void setArmorItem(LivingEntity, ItemStack)
- **static** void setArmorItem(LivingEntity, ItemStack, ArmorType)

## Package: net.advancedplugins.chat.impl.commons.effects

### Class: net.advancedplugins.chat.impl.commons.effects.EffectsHandler
Type: Class

Methods:
- **static** String getKey()
- **static** PointersHandler getPointersHandler()
- **static** void debug(String)
- **static** Map<String, AntiCheatHook> getAntiCheatHooks()
- **static** FunctionsHandler getFunctionsHandler()
- **static** void setDebug(boolean)
- **static** EffectStorage getEffectStorage()
- void registerPatches()
- **static** TriggerHandler getTriggerHandler()
- **static** VariablesHandler getVariablesHandler()
- void unload()
- **static** AbilitiesReader getAbilitiesReader()
- **static** JavaPlugin getInstance()
- **static** ProtectionHandler getProtection()
- **static** EffectsHandler getEffectsHandler()
- **static** Targets getTargetHandler()
- **static** EconomyHandler getEconomyHandler()

## Package: net.advancedplugins.chat.impl.commons.effects.abilities

### Class: net.advancedplugins.chat.impl.commons.effects.abilities.AdvancedAbility
Type: Class

Methods:
- AdvancedAbility setName(String)
- String getName()
- double getChance()
- List<String> getBlacklist()
- List<String> getWhitelist()
- AdvancedAbility setWorldBlacklist(List<String>)
- List<String> getWorldBlacklist()
- int getSouls()
- AdvancedAbility setSection(ConfigurationSection)
- ConfigurationSection getSection()
- AdvancedAbility setConditions(List<String>)
- AdvancedAbility setChance(double)
- String getNameNoLevel()
- **static** AdvancedAbility builder()
- AdvancedAbility setRepeatingDelay(int)
- int getRepeatingDelay()
- String getCommand()
- AdvancedAbility setWhitelist(List<String>)
- AdvancedAbility setCooldown(int)
- List<String> getConditions()
- AdvancedAbility setSouls(int)
- int getCooldown()
- String getCooldownMessage()
- AdvancedAbility setType(List<String>)
- AdvancedAbility setCommand(String)
- AdvancedAbility setBlacklist(List<String>)
- AdvancedAbility setEffects(List<String>)
- List<String> getEffects()
- boolean isRepeatingInstantApply()
- **static** AdvancedAbility readFromConfig(String, List<String>, ConfigurationSection)
- AdvancedAbility setCooldownMessage(String)
- List<String> getTypes()
- AdvancedAbility setRepeatingInstantApply(boolean)

### Class: net.advancedplugins.chat.impl.commons.effects.abilities.DisabledAbility
Type: Class

Methods:
- Long getForTime()
- Long getActivatesOn()
- String getAbility()
- Long getInitialized()

## Package: net.advancedplugins.chat.impl.commons.effects.actions

### Class: net.advancedplugins.chat.impl.commons.effects.actions.ActionExecution
Type: Class

Methods:
- LinkedList<AdvancedAbility> getEffects()
- boolean isCancelled()
- String parseVariables(String)
- **static** void addDisabledAbility(UUID, String, int)
- HashMap<String, String> getVariables()
- ActionExecutionBuilder getBuilder()
- void build()
- LinkedList<String> getAllEffectsRaw()
- void setCancelled(boolean)
- void run()
- **static** List<String> getDisabledAbilities(UUID)
- LinkedList<String> getAllEffects()
- void addVariable(String, String)

### Class: net.advancedplugins.chat.impl.commons.effects.actions.ActionExecutionBuilder
Type: Class

Methods:
- Event getEvent()
- boolean shouldSkipCooldown()
- void globalVariables()
- Map<String, String> getVariables()
- ActionExecutionBuilder setStackItem(StackItem)
- ActionExecutionBuilder skipChances()
- ActionExecutionBuilder setBlock(Block)
- ItemStack getItem()
- boolean shouldSkipConditions()
- boolean isRemoved()
- ActionExecutionBuilder setVictim(LivingEntity)
- LivingEntity getVictim()
- ActionExecutionBuilder only(AdvancedAbility[])
- ActionExecutionBuilder setAttacker(LivingEntity)
- void buildAndExecute()
- ActionExecutionBuilder addDrops(Block, List<ItemStack>)
- ActionExecutionBuilder addDrops(Block, Collection<ItemStack>)
- ActionExecutionBuilder addDrops(Location, ItemStack[])
- LivingEntity getAttacker()
- ActionExecutionBuilder asRepeating()
- ActionExecutionBuilder setItem(ItemStack)
- boolean shouldSkipChances()
- Block getBlock()
- StackItem getStackItem()
- ActionExecutionBuilder setAttackerMain(boolean)
- RollItemType getItemType()
- LivingEntity getOther()
- ActionExecutionBuilder setDamageEventNotGoingToRun(boolean)
- ActionExecutionBuilder setEvent(Event)
- ActionExecutionBuilder asPermanent()
- LivingEntity getMain()
- ActionExecutionBuilder setItemType(RollItemType)
- List<AdvancedAbility> getAllowedAbilities()
- ActionExecutionBuilder setSkipCooldown(boolean)
- List<AdvancedAbility> getEffects()
- boolean isPermanent()
- ActionExecutionBuilder setSoulboundOnly(boolean)
- ActionExecutionBuilder skipConditions()
- boolean isRepeating()
- String getType()
- ActionExecution build()
- ActionExecutionBuilder setRemoval(boolean)
- DropsHandler getDrops()
- ActionExecutionBuilder processVariables(String[])
- boolean isDamageEventNotGoingToRun()

### Class: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- boolean isComboEnabled()
- String getTriggerName()
- void setEnabled(boolean)
- boolean isEnabled()
- void addCombo(UUID)
- void resetCombo(UUID)
- void setDescription(String)
- String getDescription()
- ActionExecutionBuilder executionBuilder()
- void setComboEnabled(boolean)
- void registerListener()

## Package: net.advancedplugins.chat.impl.commons.effects.actions.execution

### Class: net.advancedplugins.chat.impl.commons.effects.actions.execution.ExecutionTask
Type: Class

Methods:
- DamageHandler getDamageHandler()
- void init()
- ExecutionTask asSets(boolean)
- void reportIssue(String, String[])
- ActionExecutionBuilder getBuilder()
- ActionExecution getActionExecution()
- ExecutionTask setLocation(Location)
- AdvancedAbility getAbility()
- ExecutionTask soulboundOnly(boolean)

## Package: net.advancedplugins.chat.impl.commons.effects.actions.handlers

### Class: net.advancedplugins.chat.impl.commons.effects.actions.handlers.DamageHandler
Type: Class

Methods:
- void damage(EntityDamageEvent, double, boolean)
- void damage(Damageable, double)
- void damage(Damageable, Entity, double)
- void damage(Damageable, Entity, double, EntityDamageEvent$DamageCause)
- boolean damageIgnoringArmor(Damageable, LivingEntity, LivingEntity, double)
- void heal(Entity, double)
- void revive(Entity, Location)

### Class: net.advancedplugins.chat.impl.commons.effects.actions.handlers.DropsCollection
Type: Class

Methods:
- List<ItemStack> getItems()
- List<ItemStack> getParsedItems()

### Class: net.advancedplugins.chat.impl.commons.effects.actions.handlers.DropsHandler
Type: Class

Methods:
- List<Block> getAllBlocks()
- ConcurrentHashMap<Location, DropsCollection> getDropsMap()
- void clearDrops(Block)
- DropsSettings getSettings()
- Collection<DropsCollection> getAllDrops()
- void handle()
- DropsCollection getDrops(Block)
- void addDrops(Block, ItemStack[])
- V addDrops(Block, Collection<ItemStack>)
- void addDrops(Location, ItemStack[])
- void setBuilder(ActionExecutionBuilder)
- BlockBreakEvent breakBlock(Player, boolean, boolean, Block[])
- void removeBlock(Block)

## Package: net.advancedplugins.chat.impl.commons.effects.actions.utils

### Class: net.advancedplugins.chat.impl.commons.effects.actions.utils.GetAllRollItems
Type: Class

Methods:
- **static** List<StackItem> getMainItems(LivingEntity)
- **static** List<StackItem> getItems(LivingEntity, RollItemType)
- **static** List<StackItem> getItemsInHands(LivingEntity)
- **static** List<StackItem> getAllItems(LivingEntity)
- **static** List<StackItem> get(LivingEntity)

### Class: net.advancedplugins.chat.impl.commons.effects.actions.utils.RollItemType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- HAND
- OFFHAND
- HELMET
- CHESTPLATE
- LEGGINGS
- BOOTS
- OTHER
- HANDS
- MAIN
- GET_FOR_DEATH
- ALL

Methods:
- EquipmentSlot getSlot()
- **static** RollItemType getHand(Player, ItemStack)
- **static** RollItemType getFromEquipment(EquipmentSlot)
- **static** RollItemType valueOf(String)
- **static** RollItemType[] values()

### Class: net.advancedplugins.chat.impl.commons.effects.actions.utils.StackItem
Type: Class

Methods:
- ItemStack getItem()
- RollItemType getRollItemType()
- void setNumber(int)

## Package: net.advancedplugins.chat.impl.commons.effects.conditions

### Class: net.advancedplugins.chat.impl.commons.effects.conditions.ConResult
Type: Class

Methods:
- ConditionType getCondition()
- Object getResult()
- ConditionType getOriginalCondition()

### Class: net.advancedplugins.chat.impl.commons.effects.conditions.ConditionType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- STOP
- FORCE
- ALLOW
- ADD
- REMOVE
- NONE
- CONTINUE

Methods:
- **static** ConditionType valueOf(String)
- **static** ConditionType[] values()

### Class: net.advancedplugins.chat.impl.commons.effects.conditions.Fractor
Type: Class

Methods:
- **static** ConResult getResult(String, LivingEntity, LivingEntity, ActionExecution)

## Package: net.advancedplugins.chat.impl.commons.effects.effects

### Class: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- String getName()
- int getWeight()
- void setWeight(int)
- LivingEntity getOtherEntity(LivingEntity, ExecutionTask)
- void setExemptFromAC(boolean)
- **static** void updateItem(ActionExecutionBuilder, LivingEntity, ItemStack, RollItemType)
- String getDescription()
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])
- ImmutableMap<Integer, Class> getArgumentType()
- String getUsage()
- String getEffectName()
- void warn(String)
- boolean hasStringArgument()
- void addArgument(int, Class)
- void setBlockEffect(boolean)
- boolean isBlockEffect()
- JavaPlugin getPlugin()
- boolean isExemptFromAC()

### Class: net.advancedplugins.chat.impl.commons.effects.effects.EffectStorage
Type: Class

Methods:
- ImmutableCollection<AdvancedEffect> getEffects()
- List<String> getEffectsAsStringList()
- void unload()
- AdvancedEffect getEffect(String)
- boolean register(JavaPlugin, AdvancedEffect)

## Package: net.advancedplugins.chat.impl.commons.effects.effects.external.advancedseasons

### Class: net.advancedplugins.chat.impl.commons.effects.effects.external.advancedseasons.SetTemperatureEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, Location, String[])

## Package: net.advancedplugins.chat.impl.commons.effects.effects.external.advancedskills

### Class: net.advancedplugins.chat.impl.commons.effects.effects.external.advancedskills.GiveManaEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.external.advancedskills.GivePointsEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

## Package: net.advancedplugins.chat.impl.commons.effects.effects.external.ae

### Class: net.advancedplugins.chat.impl.commons.effects.effects.external.ae.AddEnchantEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.external.ae.AddSoulsEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.external.ae.RemoveEnchantEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.external.ae.RemoveSoulsEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

## Package: net.advancedplugins.chat.impl.commons.effects.effects.external.mcmmo

### Class: net.advancedplugins.chat.impl.commons.effects.effects.external.mcmmo.AddExpMcmmoEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

## Package: net.advancedplugins.chat.impl.commons.effects.effects.internal

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ActionbarEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.AddDurabilityArmorEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.AddDurabilityCurrentItemEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.AddDurabilityItemEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.AddFoodEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.AddHealthEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.AddMoneyEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.AddWalkSpeedEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void onPlayerQuit(PlayerQuitEvent)
- void addSpeed(Player, float)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.AirEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ApplyPotionEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- **static** int getPermanentLength()
- **static** V handlePermanentRemoval(LivingEntity, List<PotionEffect>, PotionEffectType, int)
- **static** Map<UUID, List<PotionEffect>> getActivatedPermanentPotions()
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.AutoReelEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void retrieveHook(FishHook, ItemStack)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.BleedEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.BloodEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, Location, String[])
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.BoostEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void onFall(EntityDamageEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.BreakBlockEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.BreakTreeEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.BroadcastEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.BroadcastPermissionEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.BurnEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.CactusEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.CancelEventEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.CancelUseEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void onUse(PlayerInteractEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- **static** void addCancelled(UUID, Material, Long)

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ConsoleCommandEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, Location, String[])
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.CureEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.CurePermanentEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.DecreaseDamageEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.DeleteItemEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.DisableActivationEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.DisableKnockbackEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void onDamage(EntityDamageEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.DisarmEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.DoHarmEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.DoubleDamageEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.DropHeadEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.DropHeldItemEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.DropItemEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ExpEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ExplodeEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ExtinguishEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.FireballEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.FireworkEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.FlyEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.FlySpeedEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void onPlayerQuit(PlayerQuitEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.FreezeEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void onWalk(PlayerMoveEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.GiveItemEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.GuardEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean isGuard(Entity)
- void onSpawn(CreatureSpawnEvent)
- void onGuardDeath(EntityDeathEvent)
- void steal(UUID, UUID)
- **static** GuardEffect getGuardEffect()
- Map<UUID, UUID> getGuards()
- void summonGuard(EntityType, boolean, String, int, int, LivingEntity, boolean)
- void summonGuard(EntityType, boolean, String, int, LivingEntity, boolean)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- void onExplode(ExplosionPrimeEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.HalfDamageEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.IgnoreArmorDamageEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.IgnoreArmorProtectionEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.IncreaseDamageEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.InvertVariableEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.InvincibleEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void onDamage(EntityDamageEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.KeepOnDeathEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- **static** HashMap<UUID, List<ItemStack>> getReturnItems()
- void onDeath(PlayerDeathEvent)
- **static** List<UUID> getUUIDs()
- void onRespawn(PlayerRespawnEvent)
- void onDeathQueue(PlayerDeathEvent)
- **static** ItemStack removeHolyWhiteScroll(ItemStack)
- **static** void handleDeath(Player, PlayerDeathEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.KillEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.LavaWalkerEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- **static** void clearQueue()
- void onMove(PlayerMoveEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.LightningEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.MessageEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.MoreDropsEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.NegateDamageEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.OpenCraftingTableEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.OpenEnderChestEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ParticleEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ParticleLineEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.PermissionEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.PlantSeedsEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.PlayEntityEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.PlaySoundEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.PlaySoundOutloudEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.PlayerCommandEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.PotionOverrideEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ProjectileEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.PullAwayEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.PullCloserEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.PumpkinEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.RemoveArmorEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.RemoveHealthDamageEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.RemoveHealthDamageTotemEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.RemoveHealthEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.RemoveHealthTotemEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.RemoveMoneyEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.RemoveRandomArmorEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.RepairEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ResetComboEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ReviveEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ScreenFreezeEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.SetAirEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.SetBlockEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.SetMaxCatchTimeEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.SetMinCatchTimeEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.SetVariableEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.ShuffleHotbarEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.SmeltEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.SnowblindEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.SpawnArrowsEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void stopArrowsBreakBlock(EntityDamageByEntityEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.SpawnBlocksEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void onFallingBlockLand(EntityChangeBlockEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.SpawnEntityEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.StealExpEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.StealGuardEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- Map<UUID, UUID> getGuards()
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.StealHealthEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.StealMoneyEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.StopKnockbackEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.SubtitleEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.TakeAwayEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.TeleportBehindEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.TeleportEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.TitleEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.TntEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.TotemEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.TpDropsEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- boolean executeEffect(ExecutionTask, LivingEntity, String[])
- boolean executeEffect(ExecutionTask, Location, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.WalkSpeedEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void onPlayerQuit(PlayerQuitEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.WaterWalkerEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- **static** void clearQueue()
- void onMove(PlayerMoveEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

### Class: net.advancedplugins.chat.impl.commons.effects.effects.internal.WebWalkerEffect
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.effects.AdvancedEffect

Methods:
- void onMove(PlayerMoveEvent)
- boolean executeEffect(ExecutionTask, LivingEntity, String[])

## Package: net.advancedplugins.chat.impl.commons.effects.effects.utils

### Class: net.advancedplugins.chat.impl.commons.effects.effects.utils.PlantSeedsType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SEEDS
- POTATO
- MELON
- PUMPKIN
- CARROT
- BEETROOT
- PITCHER_PLANT
- TORCHFLOWER_SEEDS
- NETHER_WART

Methods:
- Material getNewBlockType()
- **static** PlantSeedsType matchType(String)
- Material getBlockRequired()
- **static** PlantSeedsType valueOf(String)
- **static** PlantSeedsType[] values()
- Material getSeedsMaterial()

### Class: net.advancedplugins.chat.impl.commons.effects.effects.utils.PumpkinDeathListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onHelmetChange(InventoryClickEvent)
- void onDeath(PlayerDeathEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.effects.utils.TridentShootHandler
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onLang(ProjectileHitEvent)
- **static** ItemStack getItem(UUID)
- void onShoot(ProjectileLaunchEvent)

## Package: net.advancedplugins.chat.impl.commons.effects.hook

### Class: net.advancedplugins.chat.impl.commons.effects.hook.AntiCheatHook
Type: Interface

Methods:
- boolean exemptDebug(Player)
- boolean isRunning()
- AntiCheatHook getHook()
- boolean isPresent()
- boolean exempt(Player)
- void nonExempt(Player)
- void register()

## Package: net.advancedplugins.chat.impl.commons.effects.hook.type

### Class: net.advancedplugins.chat.impl.commons.effects.hook.type.AAC5Hook
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.hook.AntiCheatHook

Methods:
- boolean exemptDebug(Player)
- boolean isRunning()
- AntiCheatHook getHook()
- boolean isPresent()
- boolean exempt(Player)
- void nonExempt(Player)
- void register()

### Class: net.advancedplugins.chat.impl.commons.effects.hook.type.AACHook
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.hook.AntiCheatHook

Methods:
- boolean exemptDebug(Player)
- boolean isRunning()
- AntiCheatHook getHook()
- boolean isPresent()
- boolean exempt(Player)
- void nonExempt(Player)
- void register()

### Class: net.advancedplugins.chat.impl.commons.effects.hook.type.CNCPHook
Type: Class
Extends: me.asofold.bpl.cncp.hooks.generic.ClassExemptionHook
Implements: net.advancedplugins.chat.impl.commons.effects.hook.AntiCheatHook

Methods:
- String getHookVersion()
- boolean exemptDebug(Player)
- boolean isRunning()
- AntiCheatHook getHook()
- boolean isPresent()
- boolean exempt(Player)
- void nonExempt(Player)
- String getHookName()
- void register()

### Class: net.advancedplugins.chat.impl.commons.effects.hook.type.IntaveHook
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.hook.AntiCheatHook

Methods:
- boolean exemptDebug(Player)
- boolean isRunning()
- AntiCheatHook getHook()
- boolean isPresent()
- boolean exempt(Player)
- void nonExempt(Player)
- void register()

### Class: net.advancedplugins.chat.impl.commons.effects.hook.type.SoaromaHook
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.hook.AntiCheatHook

Methods:
- boolean exemptDebug(Player)
- boolean isRunning()
- AntiCheatHook getHook()
- boolean isPresent()
- boolean exempt(Player)
- void nonExempt(Player)
- void register()

### Class: net.advancedplugins.chat.impl.commons.effects.hook.type.SpartanHook
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.hook.AntiCheatHook

Methods:
- boolean exemptDebug(Player)
- boolean isRunning()
- AntiCheatHook getHook()
- boolean isPresent()
- boolean exempt(Player)
- void nonExempt(Player)
- void register()

### Class: net.advancedplugins.chat.impl.commons.effects.hook.type.VulcanHook
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.hook.AntiCheatHook

Methods:
- boolean exemptDebug(Player)
- boolean isRunning()
- AntiCheatHook getHook()
- boolean isPresent()
- boolean exempt(Player)
- void nonExempt(Player)
- void register()

## Package: net.advancedplugins.chat.impl.commons.effects.mechanics.functions

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType
Type: Interface

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionsHandler
Type: Class

Methods:
- String parseEffectLine(String, LivingEntity, ExecutionTask)
- void register(JavaPlugin, FunctionType)

## Package: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal.ChanceFunction
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal.ConditionFunction
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal.IfEndsFunction
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal.IfStartsFunction
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal.IntFunction
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal.MathFunction
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal.NiceFormatFunction
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal.RandomNumberFunction
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal.RandomWordFunction
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal.RoundFunction
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.internal.ScrambleFunction
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.functions.FunctionType

Methods:
- String getName()
- String parse(String, LivingEntity, ExecutionTask)

## Package: net.advancedplugins.chat.impl.commons.effects.mechanics.pointers

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.pointers.PointersHandler
Type: Class

Methods:
- String parseEffectLine(String, String, ExecutionTask)

## Package: net.advancedplugins.chat.impl.commons.effects.mechanics.targets

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetArgument
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- IGNORE_TOOL
- RADIUS
- RADIUS_CUSTOM
- TARGET
- LIMIT
- DISTANCE
- DEPTH
- POINTS
- X
- Y
- Z
- ANGLE
- MODE

Methods:
- **static** TargetArgument valueOf(String)
- **static** TargetArgument[] values()
- **static** TargetArgument matchFromArg(String)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetResults
Type: Class

Methods:
- void setEffect(String)
- V mergeList(List<LivingEntity>)
- List<Location> getTargetLocations()
- V mergeLocations(List<Location>)
- **static** TargetResults$TargetResultsBuilder builder()
- String getEffect()
- List<LivingEntity> getTargetList()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetResults$TargetResultsBuilder
Type: Class

Methods:
- TargetResults$TargetResultsBuilder targetList(List<LivingEntity>)
- TargetResults build()
- TargetResults$TargetResultsBuilder effect(String)
- String toString()
- TargetResults$TargetResultsBuilder targetLocations(List<Location>)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType
Type: Class

Methods:
- TargetResults getTargets(String, String, ExecutionTask)
- HashMap<TargetArgument, String> classifyTarget(String)
- String extractTargetString(String)
- String getPrefix()
- String getName()
- TargetType setPrefix(String)
- TargetResults noTarget()
- String replaceTargetFromEffect(String)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.Targets
Type: Class

Methods:
- TargetResults handleTargets(String, ExecutionTask)
- Collection<TargetType> targetTypes()
- void register(TargetType)

## Package: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.AOETarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.AddTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.AllPlayersTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.AttackerTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.BlockInDistanceTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.BlockTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.EntityInSightTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)
- **static** List<LivingEntity> getEntityInLineOfSight(LivingEntity, int, int, int, AreaUtils$RadiusTarget)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.EyeHeightTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.NearestPlayerTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.PlayerFromNameTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.SelfTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.TrenchTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)
- **static** Vector getUpVector(BlockFace)
- **static** Vector getRightVector(BlockFace)
- **static** BlockFace getPlayerFacing(float, float)
- **static** V processBlock(Block, Block, Location, boolean, ExecutionTask, List<Location>)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.TunnelTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.VeinTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.internal.VictimTarget
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.mechanics.targets.TargetType

Methods:
- TargetResults getTargets(String, String, ExecutionTask)

## Package: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.TriggerHandler
Type: Class

Methods:
- void disableAllTriggers()
- Collection<AdvancedTrigger> getTriggers()
- AdvancedTrigger getTrigger(String)
- boolean isValid(String)
- void registerExternal(JavaPlugin, AdvancedTrigger, String)
- List<String> getTriggersAsString()
- void register(JavaPlugin, AdvancedTrigger)

## Package: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.external

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.external.CustomMobDefenseTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onHit(CustomEntityPunchEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.external.TemperatureChangeEventTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onTempChange(TemperatureChangeEvent)
- void trigger(Player, int, int, int, Event)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.external.TemperatureEventTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void trigger(Player, String, Event)
- void onTemp(TemperatureEvent)

## Package: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.ArmorWearTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onArmor(ArmorEquipEvent)
- boolean updateWornArmor(LivingEntity, ItemStack, ItemStack, ArmorType)
- boolean updateWornArmor(LivingEntity, ItemStack, ItemStack, ArmorType, boolean)
- boolean updateWornArmor(LivingEntity, ItemStack, ItemStack, ArmorType, boolean, boolean)
- void onDeath(PlayerDeathEvent)
- void onPlayerQuit(PlayerQuitEvent)
- void runCheck(LivingEntity, ItemStack, ArmorType, boolean, boolean)
- void onWorldChange(PlayerChangedWorldEvent)
- void onResurrect(EntityResurrectEvent)
- void onPlayerJoin(PlayerJoinEvent)
- **static** ArmorWearTrigger getArmorWearTrigger()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.ArrowHitTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onHit(ProjectileHitEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.AttackMobTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void playerHitMob(EntityDamageByEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.AttackTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void playerHitMob(EntityDamageByEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.BiteHookTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onPlayerFish(PlayerFishEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.BowFireTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onShoot(EntityShootBowEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.BrewPotionTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onPotionBrew(InventoryClickEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.CatchFishTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onPlayerFish(PlayerFishEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.CommandTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onCommand(PlayerCommandPreprocessEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.DeathTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onDeath(EntityDamageByEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.DefenseMobProjectileTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onProjectileHitEvent(EntityDamageByEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.DefenseMobTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void playerHitPlayer(EntityDamageByEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.DefenseProjectileTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onProjectileHitEvent(EntityDamageByEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.DefenseTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void playerHitPlayer(EntityDamageByEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.EatTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onConsume(PlayerItemConsumeEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.ElytraFlyDamageTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onDamage(EntityDamageEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.ElytraFlyTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onFly(EntityToggleGlideEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.ExplosionTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onDamage(EntityDamageEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.FallDamageTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onDamage(EntityDamageEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.FireTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onDamage(EntityDamageEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.HoldItemTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void executeCheck(LivingEntity, ItemStack, ItemStack)
- void onPlayerQuit(PlayerQuitEvent)
- void onInventoryOpen(InventoryOpenEvent)
- boolean runCheck(ItemStack, LivingEntity, boolean, boolean)
- void updateAll(LivingEntity)
- void itemBreakEvent(PlayerItemBreakEvent)
- void onPlayerJoin(PlayerJoinEvent)
- void onPickup(PlayerPickupItemEvent)
- **static** HoldItemTrigger getHoldItemTrigger()
- void onItemSwitchEvent(PlayerItemHeldEvent)
- void onDrop(PlayerDropItemEvent)
- void onInvClick(InventoryClickEvent)
- void onSwapHand(PlayerSwapHandItemsEvent)
- void executeOffhandCheck(LivingEntity, ItemStack, ItemStack)
- void onInventoryClose(InventoryCloseEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.HookEntityTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onPlayerFish(PlayerFishEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.HornTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onGoatHornSound(PlayerInteractEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.ItemBreakTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onBreak(PlayerItemBreakEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.JoinTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onJoin(PlayerJoinEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.JumpTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onJump(PlayerJumpEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.KillMobTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onMobDeath(EntityDeathEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.KillPlayerTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onMobDeath(EntityDamageByEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.MiningTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onBlockBreak(BlockBreakEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.PassiveDeathTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onPassiveDeath(EntityDamageEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.QuitTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onQuit(PlayerQuitEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.RepeatingTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onQuit(PlayerQuitEvent)
- void stopAll(LivingEntity)
- **static** RepeatingTrigger getTrigger()
- void onItemDrop(PlayerDropItemEvent)
- void stop(LivingEntity, RollItemType, Event)
- void onItemPickUp(PlayerPickupItemEvent)
- void activate(LivingEntity, RollItemType, ItemStack, Event)
- void onItemChange(PlayerItemHeldEvent)
- void onWorldChange(PlayerChangedWorldEvent)
- **static** HashMap<UUID, UserRepeaters> getRepeaters()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.RightClickEntityTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onPlayerInteract(PlayerInteractAtEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.RightClickTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onPlayerInteract(PlayerInteractEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.RodCastTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onPlayerFish(PlayerFishEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.ShieldBlockTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void playerHitPlayer(EntityDamageByEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.ShootMobTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onProjectileHitEvent(EntityDamageByEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.ShootTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onShoot(EntityShootBowEvent)
- void onProjectileHitEvent(EntityDamageByEntityEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.StruckTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onDamage(EntityDamageEvent)

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.triggers.internal.SwingTrigger
Type: Class
Extends: net.advancedplugins.chat.impl.commons.effects.actions.AdvancedTrigger

Methods:
- void onPlayerInteract(PlayerInteractEvent)

## Package: net.advancedplugins.chat.impl.commons.effects.mechanics.variables

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariableType
Type: Interface

Methods:
- String parse(String, LivingEntity, ExecutionTask)
- String getVariable()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariablesHandler
Type: Class

Methods:
- String parseEffectLine(String, LivingEntity, ExecutionTask)
- void register(JavaPlugin, VariableType)
- void register(JavaPlugin, String, VariableType)

## Package: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.external

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.external.EnchantLevelVariable
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariableType

Methods:
- String parse(String, LivingEntity, ExecutionTask)
- String getVariable()

## Package: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.internal

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.internal.AttackerNameVariable
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariableType

Methods:
- String parse(String, LivingEntity, ExecutionTask)
- String getVariable()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.internal.CurrentTimeVariable
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariableType

Methods:
- String parse(String, LivingEntity, ExecutionTask)
- String getVariable()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.internal.DamageCauseVariable
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariableType

Methods:
- String parse(String, LivingEntity, ExecutionTask)
- String getVariable()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.internal.DamageVariable
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariableType

Methods:
- String parse(String, LivingEntity, ExecutionTask)
- String getVariable()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.internal.LastRandomVariable
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariableType

Methods:
- String parse(String, LivingEntity, ExecutionTask)
- String getVariable()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.internal.PlayerNameVariable
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariableType

Methods:
- String parse(String, LivingEntity, ExecutionTask)
- String getVariable()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.internal.RawDamageVariable
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariableType

Methods:
- String parse(String, LivingEntity, ExecutionTask)
- String getVariable()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.internal.SystemTimeVariable
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariableType

Methods:
- String parse(String, LivingEntity, ExecutionTask)
- String getVariable()

### Class: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.internal.VictimNameVariable
Type: Class
Implements: net.advancedplugins.chat.impl.commons.effects.mechanics.variables.VariableType

Methods:
- String parse(String, LivingEntity, ExecutionTask)
- String getVariable()

## Package: net.advancedplugins.chat.impl.commons.effects.reader

### Class: net.advancedplugins.chat.impl.commons.effects.reader.AbilitiesReader
Type: Interface

Methods:
- List<AdvancedAbility> getRawAbilities(ActionExecutionBuilder)

## Package: net.advancedplugins.chat.impl.commons.effects.settings

### Class: net.advancedplugins.chat.impl.commons.effects.settings.SettingValues
Type: Class

Methods:
- **static** void setTrenchMoveItemsToInventory(boolean)
- **static** V setHolyWhitescrollWorldBlacklist(HashSet<String>)
- **static** boolean isBowFullPower()
- **static** V setIgnoredMetaDrops(List<String>)
- **static** boolean isTunnelMoveItemsToInventory()
- **static** boolean isCallBlockBreakEvents()
- **static** void setBreakTreeRespectPlayerPlacedBlocks(boolean)
- **static** boolean isExpEffectIgnoreSilktouch()
- **static** List<String> getIgnoredMetaDrops()
- **static** void setTunnelMoveItemsToInventory(boolean)
- **static** boolean isAddBrokenBlocksToMCStats()
- **static** void setBreakBlockEffectDoAllDurabilityDamage(boolean)
- **static** HashSet<String> getHolyWhitescrollWorldBlacklist()
- **static** void setAddBrokenBlocksToMCStats(boolean)
- **static** V setTrenchBlacklist(Set<Material>)
- **static** V setBannedMaterials(List<String>)
- **static** void setCallBlockBreakEvents(boolean)
- **static** void setExpEffectIgnoreSilktouch(boolean)
- **static** List<String> getBannedMaterials()
- **static** boolean isTrenchMoveItemsToInventory()
- **static** boolean isBreakBlockEffectDoAllDurabilityDamage()
- **static** boolean isBreakTreeRespectPlayerPlacedBlocks()
- **static** Set<Material> getTrenchBlacklist()
- **static** void setBowFullPower(boolean)

## Package: net.advancedplugins.chat.impl.commons.effects.utils

### Class: net.advancedplugins.chat.impl.commons.effects.utils.Combo
Type: Class

Methods:
- **static** void add(UUID)
- **static** void endCombos(UUID)
- **static** int getCombos(UUID)

## Package: net.advancedplugins.chat.impl.commons.effects.variables

### Class: net.advancedplugins.chat.impl.commons.effects.variables.DynamicVariable
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LEVEL_OF_SKILL
- HAS_ENCHANTMENT_IN_HAND_OF
- HAS_ENCHANTMENT_IN_SLOT_OF
- HAS_POTION_EFFECT
- ITEM_IN_HAND_LEVEL
- POTION_EFFECT_LEVEL

Methods:
- **static** Map<String, String> getValue(Variables$VariableData, DynamicVariable, String, Map<String, String>, ActionExecution)
- **static** LivingEntity getTarget(Variables$VariableData, DynamicVariable)
- String getStart()
- **static** DynamicVariable valueOf(String)
- **static** HashMap<String, String> getCustomPermanentVariables()
- **static** DynamicVariable[] values()
- **static** HashMap<String, String> getCustomVariables()
- **static** String parseThroughCustomVariables(String)
- boolean needsPlayer()

### Class: net.advancedplugins.chat.impl.commons.effects.variables.StaticVariable
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ADVANCEDITEMS_TYPE
- ADVANCEDITEMS_HELMET_TYPE
- ADVANCEDITEMS_CHESTPLATE_TYPE
- ADVANCEDITEMS_LEGGINGS_TYPE
- ADVANCEDITEMS_BOOTS_TYPE
- ADVANCEDENCHANTMENTS_SOULS
- CAN_BREAK
- FACTION_LAND
- FOOD
- IS_BLEEDING
- HELMET
- CHESTPLATE
- LEGGINGS
- BOOTS
- IS_BLOCKING
- IS_FLYING
- IS_SNEAKING
- PERMISSIONS
- IS_OP
- CLIENT_VERSION
- TRIGGER_TYPE
- IS_RIDING
- RIDING_ENTITY
- BLOCK_BELOW
- COMBO
- CUSTOM_NAME
- HEALTH
- HEALTH_PERCENTAGE
- IS_CRITICAL
- IS_GLIDING
- IS_CROUCHING
- IS_SPRINTING
- IS_HOLDING
- IS_HOSTILE
- IS_DAMAGEABLE
- IS_ON_FIRE
- IS_NIGHT
- IS_REMOVAL
- IS_UNDER_WATER
- ITEM_SLOT
- MAX_HEALTH
- MOB_TYPE
- IS_PLAYER
- ITEM_TYPE
- NAME
- NEARBY_MOBS
- OFFHAND_ITEM
- PLAYERS
- TIME
- WORLD
- X
- X_DOUBLE
- Y
- WEATHER
- Y_DOUBLE
- Z
- Z_DOUBLE
- YAW
- PITCH
- BLOCK_TAGS
- BLOCK_NATURAL
- BLOCK_IS_INTERACTABLE
- INVENTORY_FULL

Methods:
- **static** String getValue(Variables$VariableData, StaticVariable, String, ActionExecution)
- **static** LivingEntity getTarget(Variables$VariableData, StaticVariable)
- String getName()
- **static** StaticVariable valueOf(String)
- **static** StaticVariable[] values()
- boolean needsPlayer()

### Class: net.advancedplugins.chat.impl.commons.effects.variables.Variables
Type: Class

Methods:
- **static** String replaceVariables(String, LivingEntity, LivingEntity, ActionExecution)

### Class: net.advancedplugins.chat.impl.commons.effects.variables.Variables$VariableArgs
Type: Class

Methods:
- void add(Object)
- TT get(Class<TT>)

### Class: net.advancedplugins.chat.impl.commons.effects.variables.Variables$VariableData
Type: Class

No public methods found

## Package: net.advancedplugins.chat.impl.commons.patches

### Class: net.advancedplugins.chat.impl.commons.patches.ClearCommandEvent
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onHeal(PlayerCommandPreprocessEvent)

### Class: net.advancedplugins.chat.impl.commons.patches.HatCommandEvent
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onHeal(PlayerCommandPreprocessEvent)

### Class: net.advancedplugins.chat.impl.commons.patches.HealCommandEvent
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onHeal(PlayerCommandPreprocessEvent)

## Package: net.advancedplugins.chat.impl.utils

### Class: net.advancedplugins.chat.impl.utils.TryCatchMethodShort
Type: Interface

Methods:
- String tryCatch()

### Class: net.advancedplugins.chat.impl.utils.ACooldown
Type: Class

Methods:
- **static** void putToCooldown(LivingEntity, String, double)
- **static** void reload()
- **static** boolean isInCooldown(LivingEntity, String)

### Class: net.advancedplugins.chat.impl.utils.ASManager
Type: Class

Methods:
- **static** boolean doesBlockFaceMatch(Block, String, BlockFace[])
- **static** Material getFixedMaterial(Material)
- **static** String parseVariables(String, Map<String, String>, Replace)
- **static** String parseVariables(String, String, Map<String, String>, Replace)
- **static** List<TT> getItemsInPage(List<TT>, int, int)
- **static** String tryOrElse(TryCatchMethodShort, String)
- **static** Map<String, String> stringToMap(String)
- **static** void setByMatching(ItemStack, ItemStack, LivingEntity)
- **static** void reportIssue(Exception, String)
- **static** String fetchJsonFromUrl(String)
- **static** Z isValidEnum(Class<TT>, String)
- **static** ItemStack itemStackOrDefault(String, Material)
- **static** String join(String[], String)
- **static** String join(Collection<String>, String)
- **static** String join(Iterable<String>, String)
- **static** String join(String[], String, int, int)
- **static** String join(Map, String, int)
- **static** boolean notNullAndTrue(Boolean)
- **static** String substringBetween(String, String, String)
- **static** void notNull(Object, String)
- **static** String formatTime(long)
- **static** int minmax(int, int, int)
- **static** String capitalize(String)
- **static** Material getMaterial(String)
- **static** String getMaterial(ItemStack)
- **static** boolean parseCondition(String)
- **static** Z contains(String, List<String>)
- **static** boolean contains(String, String[])
- **static** Set<TT> getKeysByValue(Map<TT, TE>, T)
- **static** String serializeItem(ItemStack)
- **static** boolean isUnbreakable(ItemStack)
- **static** boolean hasAmount(Player, Material, int)
- **static** boolean isAir(Material)
- **static** boolean isAir(Block)
- **static** boolean isAir(ItemStack)
- **static** int[] subarray(int[], int, int)
- **static** [TV subarray([T, void, ;)
- **static** Location offsetToLookingLocation(Location, double)
- **static** List<String> getVariables(String, String, String)
- **static** FileConfiguration loadConfig(File)
- **static** void log(String)
- **static** boolean isLog(Material)
- **static** boolean parseBoolean(String, boolean)
- **static** void resetPlayerHealth(Player, double)
- **static** void playEffect(String, float, int, Location)
- **static** boolean isTool(Material)
- **static** String getBlockMaterial(Block)
- **static** ItemStack makeItemGlow(ItemStack, Boolean)
- **static** ItemStack makeItemGlow(ItemStack)
- **static** void fillEmptyInventorySlots(Inventory, ItemStack)
- **static** boolean isSpawner(Material)
- **static** boolean isSpawner(Block)
- **static** boolean isFortuneBlock(Material)
- **static** int[] getSlots(String)
- **static** ImmutableMap<TK, TV> toImmutable(Map<TK, TV>)
- **static** boolean isTall(Material)
- **static** boolean isValid(Material)
- **static** boolean isValid(ItemStack)
- **static** boolean isValid(Block)
- **static** ItemStack deserializeItem(String)
- **static** List<TT> reverse(Set<TT>)
- **static** void unZip(File, File)
- **static** boolean isExcessVelocity(Vector)
- **static** int hexToDecimal(String)
- **static** Set<Material> createMaterialSet(Collection<String>)
- **static** void isNull(Object, String)
- **static** ImmutableList<TV> toImmutableList(List<TV>)
- **static** boolean isWallBlock(Material)
- **static** Set<TT> shuffle(Set<TT>)
- **static** void saveResource(String)
- **static** void sendActionBar(String, Player)
- **static** boolean hasTotem(Player)
- **static** boolean sameBlock(Location, Location)
- **static** String getOrDefault(Replace, String)
- **static** Object getOrDefault(Object, Object)
- **static** String getRoughNumber(long)
- **static** List<Location> removeDuplicateLocations(List<Location>)
- **static** List<String> replace(List<String>, String, String)
- **static** TT getFromArray([T, T)
- **static** double parseThroughCalculator(String)
- **static** File getFile(String)
- **static** List<ItemStack> condense(ItemStack)
- **static** ItemStack matchMaterial(String, int, int)
- **static** ItemStack matchMaterial(String, int, int, boolean, boolean)
- **static** void dropItem(Location, ItemStack[])
- **static** boolean hasPotionEffect(LivingEntity, PotionEffectType, int)
- **static** boolean doChancesPass(int)
- **static** String limit(String, int, String)
- **static** List<String> toStringList([T)
- **static** int getExpToDrop(Material, ItemStack)
- **static** boolean isHostile(EntityType)
- **static** int getAmount(Player, Material)
- **static** Optional<Entity> getEntityFromUUID(UUID, World)
- **static** String format(long)
- **static** boolean isDamageable(Material)
- **static** Material getItemFromBlock(Material)
- **static** void setInstance(JavaPlugin)
- **static** int getEmptySlotOtherThan(int, Player)
- **static** boolean isPlayer(Entity)
- **static** Collection<Block> getNearbyBlocks(Location, float, float, float)
- **static** ImmutableMap<String, TT> configObjecstToImmutableMap(Class<TT>, FileConfiguration, String)
- **static** BlockFace getCardinalDirection(float)
- **static** String color(String)
- **static** boolean isOnline(LivingEntity)
- **static** int getInvSize(int)
- **static** ImmutableMap<TK, TV> configToImmutableMap(FileConfiguration, String, Function<String, TK>, Class<TV>)
- **static** double parseDouble(String, double)
- **static** Pair<String, Integer> parseEnchantment(String)
- **static** void giveItem(Player, ItemStack[])
- **static** V giveItem(Player, Collection<ItemStack>)
- **static** TT getKeyByValue(Map<TT, TE>, T)
- **static** Object extractFromDataArray(String, String, String, Object)
- **static** void reduceHeldItems(Player, EquipmentSlot, int)
- **static** int getEmptySlotCountInInventory(Player)
- **static** boolean isCorrectTool(ItemStack, Material)
- **static** Object getNMSEntity(LivingEntity)
- **static** String formatMaterialName(Material)
- **static** String formatMaterialName(String)
- **static** boolean removeItems(Inventory, Material, int)
- **static** boolean removeItems(Inventory, ItemStack, int)
- **static** int similarityPercentage(String, String)
- **static** String[] listFiles(String)
- **static** void deleteFile(File)
- **static** List<Block> getBlocksFlat(Block, int)
- **static** void debug(String)
- **static** Material getNonWallMaterial(Material)
- **static** void giveItemAtSlot(Player, ItemStack, int)
- **static** boolean isVegetation(Material)
- **static** Player getPlayerInsensitive(String)
- **static** boolean isDay(long)
- **static** int parseInt(String)
- **static** int parseInt(String, int)
- **static** double round(double, int)
- **static** int getDropAmount(Block, Material, ItemStack)
- **static** int[] getNumbersInRange(int, int)
- **static** Block getOtherHalfOfBed(Block)
- **static** JavaPlugin getInstance()
- **static** int getPages(int, int)
- **static** TT randomElement(Collection<TT>)
- **static** boolean itemStackEquals(ItemStack, ItemStack, boolean)

### Class: net.advancedplugins.chat.impl.utils.AreaUtils
Type: Class

Methods:
- **static** boolean isDamageable(Entity, Entity)
- **static** List<LivingEntity> getEntitiesInRadius(int, Entity, boolean, boolean, boolean)
- **static** List<LivingEntity> getEntitiesInRadius(int, Entity, AreaUtils$RadiusTarget)

### Class: net.advancedplugins.chat.impl.utils.AreaUtils$RadiusTarget
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ALL
- PLAYERS
- MOBS
- DAMAGEABLE
- UNDAMAGEABLE

Methods:
- **static** AreaUtils$RadiusTarget valueOf(String)
- **static** AreaUtils$RadiusTarget[] values()

### Class: net.advancedplugins.chat.impl.utils.BreakWholeTree
Type: Class

Methods:
- Set<Block> get()

### Class: net.advancedplugins.chat.impl.utils.ColorUtils
Type: Class

Methods:
- **static** String getLastColor(String)
- **static** String format(String)
- **static** List<String> format(List<String>)
- **static** String stripColor(String)
- **static** List<String> stripColor(List<String>)

### Class: net.advancedplugins.chat.impl.utils.CropUtils
Type: Class

Methods:
- **static** int getCropAmount()
- **static** Material getSeed(Material)
- **static** boolean isSeeded(Material)
- **static** boolean isFullyGrown(Block)
- **static** Material convertToMaterial(String)
- **static** int getDropAmount(Block, Material, ItemStack)
- **static** boolean isWheat(Material)
- **static** boolean isCrop(Material)
- **static** int getSeedAmount()
- **static** boolean isBeetroot(Material)

### Class: net.advancedplugins.chat.impl.utils.DataHandler
Type: Class

Methods:
- List<Listener> getListeners()
- int getLoopNumber()
- LocalLocation getLocation(String)
- int increaseLoop()
- void clearLoopNumer()
- boolean isPath(String)
- void save()
- TT getEnum(String, Class<TT>)
- File getFile()
- void registerListener(Listener)
- void addTask(int)
- HashMap<String, TT> sectionToMap(String, Class<TT>)
- UUID getUUID(String)
- void setLocation(String, Location)
- void setLocation(String, LocalLocation)
- void unload()
- void reloadConfig()
- boolean getBoolean(String, boolean)
- boolean getBoolean(String)
- UUID stringToId(String)
- String getFileName()
- String getString(String)
- String getString(String, String)
- void tick()
- Set<String> getKeys(String)
- Set<String> getKeys(FileConfiguration, String)
- void saveAsync()
- FileConfiguration getConfig()
- int getInt(String)
- boolean isEnabled()
- String getStringColored(String)
- List<Integer> getActiveTasks()
- JavaPlugin getInstance()
- List<String> getStringList(String)

### Class: net.advancedplugins.chat.impl.utils.DecimalToRoman
Type: Class

Methods:
- **static** String toRoman(int)
- **static** String parseInteger(int)

### Class: net.advancedplugins.chat.impl.utils.EntityHead
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- AXOLOTL_LUCY
- AXOLOTL_WILD
- AXOLOTL_CYAN
- AXOLOTL_GOLD
- AXOLOTL_BLUE
- BAT
- BEE_AWARE
- BEE
- BLAZE
- CAT_BLACK
- CAT_BRITISH
- CAT_CALICO
- CAT_JELLIE
- CAT_PERSIAN
- CAT_RAGDOLL
- CAT_RED
- CAT_SIAMESE
- CAT_TABBY
- CAT_WHITE
- CAVE_SPIDER
- CHICKEN
- COD
- COW
- DOLPHIN
- DONKEY
- DROWNED
- ELDER_GUARDIAN
- ENDERMAN
- ENDERMITE
- EVOKER
- FOX
- FOX_WHITE
- GIANT
- GLOW_SQUID
- GOAT
- GUARDIAN
- HOGLIN
- HORSE_WHITE
- HORSE_CREAMY
- HORSE_CHESTNUT
- HORSE_BROWN
- HORSE_BLACK
- HORSE_GRAY
- HORSE_DARK_BROWN
- HUSK
- ILLUSIONER
- IRON_GOLEM
- LLAMA_BROWN
- LLAMA
- LLAMA_GRAY
- LLAMA_CREAMY
- LLAMA_WHITE
- MAGMA_CUBE
- MULE
- MUSHROOM_COW_BROWN
- MUSHROOM_COW_RED
- OCELOT
- PANDA
- PANDA_BROWN
- PHANTOM
- PIG
- PIGLIN
- PIGLIN_BRUTE
- PILLAGER
- POLAR_BEAR
- PUFFERFISH
- RABBIT
- RABBIT_BROWN
- RABBIT_WHITE
- RABBIT_BLACK
- RABBIT_BLACK_AND_WHITE
- RABBIT_GOLD
- RABBIT_SALT_AND_PEPPER
- RABBIT_THE_KILLER_BUNNY
- RAVAGER
- SALMON
- SHEEP
- SHEEP_WHITE
- SHEEP_BLACK
- SHEEP_PURPLE
- SHEEP_PINK
- SHEEP_ORANGE
- SHEEP_MAGENTA
- SHEEP_LIME
- SHEEP_LIGHT_GRAY
- SHEEP_LIGHT_BLUE
- SHEEP_GREEN
- SHEEP_GRAY
- SHEEP_CYAN
- SHEEP_BLUE
- SHEEP_BROWN
- SHEEP_RED
- SHEEP_YELLOW
- SHULKER
- SILVERFISH
- SILVER_FISH
- SKELETON_HORSE
- SLIME
- SNOWMAN
- SPIDER
- SQUID
- STRAY
- STRIDER
- TRADER_LLAMA_BROWN
- TRADER_LLAMA_GRAY
- TRADER_LLAMA_CREAMY
- TRADER_LLAMA_WHITE
- TURTLE
- VEX
- VEX_CHARGE
- VINDICATOR
- WANDERING_TRADER
- WITCH
- WITHER
- WOLF
- WOLF_ANGRY
- ZOGLIN
- ZOMBIE_HORSE
- ZOMBIE_VILLAGER_NULL
- ZOMBIE_VILLAGER_ARMORER
- ZOMBIE_VILLAGER_BUTCHER
- ZOMBIE_VILLAGER_CARTOGRAPHER
- ZOMBIE_VILLAGER_CLERIC
- ZOMBIE_VILLAGER_FARMER
- ZOMBIE_VILLAGER_FISHERMAN
- ZOMBIE_VILLAGER_FLETCHER
- ZOMBIE_VILLAGER_LIBRARIAN
- ZOMBIE_VILLAGER_SHEPHERD
- ZOMBIE_VILLAGER_WEAPONSMITH
- ZOMBIFIED_PIGLIN
- GHAST
- VILLAGER_NULL
- VILLAGER
- VILLAGER_ARMORER
- VILLAGER_BUTCHER
- VILLAGER_CARTOGRAPHER
- VILLAGER_CLERIC
- VILLAGER_FARMER
- VILLAGER_FISHERMAN
- VILLAGER_FLETCHER
- VILLAGER_LIBRARIAN
- VILLAGER_SHEPHERD
- VILLAGER_WEAPONSMITH
- PARROT_RED
- PARROT_BLUE
- PARROT_CYAN
- PARROT_GRAY
- PARROT_GREEN
- TROPICAL_FISH_ORANGE
- TROPICAL_FISH_MAGENTA
- TROPICAL_FISH_LIGHT_BLUE
- TROPICAL_FISH_YELLOW
- TROPICAL_FISH_PINK
- TROPICAL_FISH_GRAY
- TROPICAL_FISH_CYAN
- TROPICAL_FISH_BLUE
- TROPICAL_FISH_GREEN
- TROPICAL_FISH_RED
- TROPICAL_FISH_BLACK
- TROPICAL_FISH_LIGHT_GRAY
- ALLAY
- TADPOLE
- WARDEN
- FROG_TEMPERATE
- FROG_WARM
- FROG_COLD
- FROG
- CREEPER
- CAMEL
- SKELETON
- ZOMBIE

Methods:
- **static** EntityHead valueOf(String)
- **static** EntityHead[] values()
- ItemStack getItem()
- **static** ItemStack matchFromName(String)

### Class: net.advancedplugins.chat.impl.utils.EntitySpawnUtils
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- **static** Entity spawnEntity(Plugin, World, Location, EntityType)

### Class: net.advancedplugins.chat.impl.utils.ExperienceManager
Type: Class

Methods:
- void changeExp(int)
- int getTotalExperience()
- **static** double getLevelFromExp(long)
- void setTotalExperience(int)
- **static** void setTotalExperience(Player, int)
- **static** int getExpAtLevel(int)
- **static** int getIntLevelFromExp(long)

### Class: net.advancedplugins.chat.impl.utils.FoliaScheduler
Type: Class

Methods:
- **static** void cancelAll(Plugin)
- **static** FoliaScheduler$Task runTask(Plugin, Runnable)
- **static** FoliaScheduler$Task runTaskLaterAsynchronously(Plugin, Runnable, long)
- **static** FoliaScheduler$Task runTaskTimerAsynchronously(Plugin, Runnable, long, long)
- **static** V runTaskTimerAsynchronously(Plugin, Consumer<FoliaScheduler$Task>, long, long)
- **static** FoliaScheduler$Task runTaskAsynchronously(Plugin, Runnable)
- **static** FoliaScheduler$Task runTaskLater(Plugin, Runnable, long)
- **static** boolean isFolia()
- **static** FoliaScheduler$Task runTaskTimer(Plugin, Runnable, long, long)

### Class: net.advancedplugins.chat.impl.utils.FoliaScheduler$Task
Type: Class

Methods:
- int getTaskId()
- void cancel()

### Class: net.advancedplugins.chat.impl.utils.ItemDurability
Type: Class

Methods:
- int getDurability()
- ItemDurability healItem(int)
- ItemDurability handleDurabilityChange(int)
- ItemDurability damageItem(int)
- int getDealtDamage()
- ItemDurability setDurability(int)
- ItemDurability repairItem()
- int getMaxDurability()
- ItemStack getItemStack()
- boolean isBroken()
- int getUnbreakingLevel()

### Class: net.advancedplugins.chat.impl.utils.LocalLocation
Type: Class
Extends: org.bukkit.Location

Methods:
- String getLocationName()
- void setName(String)
- **static** LocalLocation fromBlock(Block)
- String getEncode()
- **static** LocalLocation getFromEncode(String)
- Optional<Block> getOptionalBlock()
- String getChunkEncode()
- **static** String getChunkEncode(Chunk)
- LocalLocation clone()
- Location clone()
- Object clone()
- boolean isInDistance(Location, int)
- **static** String locToEncode(Location)
- void playParticles(Effect, int, float)

### Class: net.advancedplugins.chat.impl.utils.MathUtils
Type: Class

Methods:
- **static** boolean isInteger(String)
- **static** boolean isLong(String)
- **static** boolean isByte(String)
- **static** I getClosestInt(int, List<Integer>)
- **static** boolean isFloat(String)
- **static** boolean isShort(String)
- **static** int randomBetween(int, int)
- **static** int clamp(int, int, int)
- **static** long clamp(long, long, long)
- **static** double clamp(double, double, double)
- **static** boolean isDouble(String)

### Class: net.advancedplugins.chat.impl.utils.Pair
Type: Class

Methods:
- TV getValue()
- TT getKey()
- V setValue(T)
- **static** Pair<TS, TU> of(T, short)
- V setKey(T)

### Class: net.advancedplugins.chat.impl.utils.PlayASound
Type: Class

Methods:
- **static** void playSound(String, Player)
- **static** void playSound(String, Player, float, float)
- **static** void playSound(String, Location)
- **static** void playSound(String, Location, float, float)

### Class: net.advancedplugins.chat.impl.utils.PotionEffectMatcher
Type: Class

Methods:
- **static** PotionEffectType matchPotion(String)

### Class: net.advancedplugins.chat.impl.utils.ReallyFastBlockHandler
Type: Class

Methods:
- **static** void init()
- **static** ReallyFastBlockHandler getForWorld(World)
- void setType(Material, Block[])

### Class: net.advancedplugins.chat.impl.utils.Registry
Type: Class

Methods:
- **static** String get()

### Class: net.advancedplugins.chat.impl.utils.RemoveDeathItems
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- **static** void add(UUID, ItemStack)
- void onDeath(EntityDeathEvent)

### Class: net.advancedplugins.chat.impl.utils.SchedulerUtils
Type: Class

Methods:
- **static** int runTask(Runnable)
- **static** int runTaskLater(Runnable, long)
- **static** int runTaskLater(Runnable)
- **static** int runTaskTimerAsync(Runnable, long, long)
- **static** int runTaskAsync(Runnable)
- **static** int runTaskTimer(Runnable, long, long)

### Class: net.advancedplugins.chat.impl.utils.SkullCreator
Type: Class

Methods:
- **static** ItemStack itemFromUrl(String)
- **static** void blockWithUuid(Block, UUID)
- **static** void blockWithName(Block, String)
- **static** ItemStack itemWithUrl(ItemStack, String)
- **static** ItemStack createSkull()
- **static** ItemStack itemWithUuid(ItemStack, UUID)
- **static** ItemStack itemWithBase64(ItemStack, String)
- **static** ItemStack itemFromName(String)
- **static** void blockWithUrl(Block, String)
- **static** ItemStack itemWithName(ItemStack, String)
- **static** ItemStack itemFromBase64(String)
- **static** ItemStack itemFromUuid(UUID)
- **static** void blockWithBase64(Block, String)

### Class: net.advancedplugins.chat.impl.utils.TotemUndying
Type: Class

Methods:
- boolean playEffect(LivingEntity, EquipmentSlot, int, int, int, boolean)

### Class: net.advancedplugins.chat.impl.utils.VanillaEnchants
Type: Class

Methods:
- **static** Enchantment displayNameToEnchant(String)
- **static** Enchantment displayNameToEnchant(String, boolean)
- **static** String enchantToDisplayName(Enchantment)

## Package: net.advancedplugins.chat.impl.utils.abilities

### Class: net.advancedplugins.chat.impl.utils.abilities.DropsSettings
Type: Class

Methods:
- boolean isSilkTouch()
- void setSmelt(boolean)
- boolean isTerraformEvent()
- boolean isAddToInventory()
- void setDropExpAmount(int)
- void setTool(ItemStack)
- void setDropExp(boolean)
- ItemStack getTool()
- void setDropsMultiplier(int)
- void setBreakBlocks(boolean)
- void setSilkTouch(boolean)
- void setAddToInventory(boolean)
- void setDurabilityDamage(boolean)
- boolean isDefaultDrops()
- int getDropsMultiplier()
- boolean isTreeFellerEvent()
- void setDefaultDrops(boolean)
- boolean isSmelt()
- boolean isBreakBlocks()
- int getDropExpAmount()
- boolean isDropExp()
- void setTerraformEvent(boolean)
- void setTreeFellerEvent(boolean)
- boolean isDurabilityDamage()

### Class: net.advancedplugins.chat.impl.utils.abilities.SmeltMaterial
Type: Class

Methods:
- **static** ItemStack material(ItemStack)
- **static** ItemStack material(Material)

## Package: net.advancedplugins.chat.impl.utils.annotations

### Class: net.advancedplugins.chat.impl.utils.annotations.ConfigKey
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

## Package: net.advancedplugins.chat.impl.utils.commands

### Class: net.advancedplugins.chat.impl.utils.commands.CommandBaseNew
Type: Class

Methods:
- CommandBaseNew registerArgumentType(Class<*>, ArgumentType<*>)
- boolean onCommand(CommandSender, Command, String, String[])
- List<String> onTabComplete(CommandSender, Command, String, String)
- V registerCommand(ConfigCommand<CommandSender>)
- Set<ConfigCommand<CommandSender>> getCommands()

### Class: net.advancedplugins.chat.impl.utils.commands.ConfigCommand
Type: Abstract Class

Methods:
- Collection<String> tabCompletionSuggestion(CommandSender, int)
- TU parseArgument(String, int)
- TU parseArgument(String, int, T)
- V setNoPermission(Function<TT, String>)
- Integer getPageCount()
- String getNoPermissionLang(CommandSender)
- void addShowcaseCommand(String, String)
- Function<TT, String> getNotOnline()
- void sendHelpMessage(Plugin, CommandSender)
- int getArgumentsSize()
- void addFlats(String[])
- Function<TT, String> getNoPermission()
- void sendHelpPage(CommandSender, String, String[])
- boolean isMatchUntilIndex(String[], int)
- int getArgumentsSizeReal()
- LinkedList<ConfigCommand$ShowcaseCommand> getShowcaseCommands()
- boolean isConsole()
- String getNotOnlineLang(CommandSender)
- V addFlatWithAliases(String, List<String>)
- void addFlatWithAliases(String, String[])
- **static** ConfigCommand$ArgConfig getArgConfig(DataHandler, String, String)
- V onExecute(T, T)
- V setNotOnline(Function<TT, String>)
- boolean isArgumentValid(String[], int)
- String[] getEnd(String[])
- boolean isMatch(String[])
- String getFormatted()
- **static** ConfigCommand$Config getConfig(DataHandler, String)
- ConfigCommand$Config getConfig()
- void sendUsage(CommandSender)
- LinkedList<ConfigSubCommand<CommandSender>> getSubCommands()
- boolean isPlayerOnline(CommandSender, Player)
- void middleMan(CommandSender, String[])
- JavaPlugin getPlugin()
- V setArguments(List<Argument<*>>)
- List<Argument<*>> getArguments()
- void addFlat(String)

### Class: net.advancedplugins.chat.impl.utils.commands.ConfigCommand$ArgConfig
Type: Class

Methods:
- String getDisplayArg()
- String getArg()

### Class: net.advancedplugins.chat.impl.utils.commands.ConfigCommand$Config
Type: Class

Methods:
- List<String> getAliases()
- String getPermission()
- String getCommand()
- boolean isEnabled()
- String getDescription()

### Class: net.advancedplugins.chat.impl.utils.commands.ConfigSubCommand
Type: Abstract Class
Extends: net.advancedplugins.chat.impl.utils.commands.ConfigCommand

Methods:
- boolean isEndless()
- boolean isArgumentValid(String[], int)
- String getFormatted(String)

## Package: net.advancedplugins.chat.impl.utils.commands.argument

### Class: net.advancedplugins.chat.impl.utils.commands.argument.ArgumentType
Type: Interface

Methods:
- TT parse(String)

### Class: net.advancedplugins.chat.impl.utils.commands.argument.Argument
Type: Class

Methods:
- Set<String> getAliases()
- Argument asOptional()
- ArgumentType<TT> getType()
- String getArgument()
- boolean isOptional()
- Function<CommandSender, Collection<String>> getOnTabComplete()

### Class: net.advancedplugins.chat.impl.utils.commands.argument.ArgumentHandler
Type: Class

Methods:
- **static** ArgumentType<TT> getArgumentType(Class<*>)
- **static** V register(Class<*>, ArgumentType<*>)

### Class: net.advancedplugins.chat.impl.utils.commands.argument.ConfigArgument
Type: Class
Extends: net.advancedplugins.chat.impl.utils.commands.argument.Argument

Methods:
- ConfigCommand$ArgConfig getArgConfig()

## Package: net.advancedplugins.chat.impl.utils.economy

### Class: net.advancedplugins.chat.impl.utils.economy.AdvancedEconomy
Type: Interface

Methods:
- double getBalance(Player)
- String getName()
- boolean giveUser(Player, double)
- boolean chargeUser(Player, double)

### Class: net.advancedplugins.chat.impl.utils.economy.EconomyHandler
Type: Class

Methods:
- boolean charge(Player, String)
- boolean registerEconomy(AdvancedEconomy)
- AdvancedEconomy getEcon(String)

## Package: net.advancedplugins.chat.impl.utils.economy.local

### Class: net.advancedplugins.chat.impl.utils.economy.local.DiamondsEconomy
Type: Class
Implements: net.advancedplugins.chat.impl.utils.economy.AdvancedEconomy

Methods:
- double getBalance(Player)
- String getName()
- boolean giveUser(Player, double)
- boolean chargeUser(Player, double)

### Class: net.advancedplugins.chat.impl.utils.economy.local.EmeraldsEconomy
Type: Class
Implements: net.advancedplugins.chat.impl.utils.economy.AdvancedEconomy

Methods:
- double getBalance(Player)
- String getName()
- boolean giveUser(Player, double)
- boolean chargeUser(Player, double)

### Class: net.advancedplugins.chat.impl.utils.economy.local.ExpEconomy
Type: Class
Implements: net.advancedplugins.chat.impl.utils.economy.AdvancedEconomy

Methods:
- double getBalance(Player)
- String getName()
- boolean giveUser(Player, double)
- boolean chargeUser(Player, double)

### Class: net.advancedplugins.chat.impl.utils.economy.local.GoldEconomy
Type: Class
Implements: net.advancedplugins.chat.impl.utils.economy.AdvancedEconomy

Methods:
- double getBalance(Player)
- String getName()
- boolean giveUser(Player, double)
- boolean chargeUser(Player, double)

### Class: net.advancedplugins.chat.impl.utils.economy.local.LevelEconomy
Type: Class
Implements: net.advancedplugins.chat.impl.utils.economy.AdvancedEconomy

Methods:
- double getBalance(Player)
- String getName()
- boolean giveUser(Player, double)
- boolean chargeUser(Player, double)

### Class: net.advancedplugins.chat.impl.utils.economy.local.SoulsEconomy
Type: Class
Implements: net.advancedplugins.chat.impl.utils.economy.AdvancedEconomy

Methods:
- double getBalance(Player)
- String getName()
- boolean giveUser(Player, double)
- boolean chargeUser(Player, double)

### Class: net.advancedplugins.chat.impl.utils.economy.local.VaultEconomy
Type: Class
Implements: net.advancedplugins.chat.impl.utils.economy.AdvancedEconomy

Methods:
- double getBalance(Player)
- String getName()
- boolean giveUser(Player, double)
- boolean chargeUser(Player, double)

## Package: net.advancedplugins.chat.impl.utils.evalex

### Class: net.advancedplugins.chat.impl.utils.evalex.Expression$LazyNumber
Type: Interface

Methods:
- BigDecimal eval()
- String getString()

### Class: net.advancedplugins.chat.impl.utils.evalex.Function
Type: Interface
Implements: net.advancedplugins.chat.impl.utils.evalex.LazyFunction

Methods:
- BigDecimal eval(List<BigDecimal>)

### Class: net.advancedplugins.chat.impl.utils.evalex.LazyFunction
Type: Interface

Methods:
- int getNumParams()
- String getName()
- Expression$LazyNumber lazyEval(List<Expression$LazyNumber>)
- boolean isBooleanFunction()
- boolean numParamsVaries()

### Class: net.advancedplugins.chat.impl.utils.evalex.LazyOperator
Type: Interface

Methods:
- Expression$LazyNumber eval(Expression$LazyNumber, Expression$LazyNumber)
- int getPrecedence()
- String getOper()
- boolean isBooleanOperator()
- boolean isLeftAssoc()

### Class: net.advancedplugins.chat.impl.utils.evalex.Operator
Type: Interface
Implements: net.advancedplugins.chat.impl.utils.evalex.LazyOperator

Methods:
- BigDecimal eval(BigDecimal, BigDecimal)

### Class: net.advancedplugins.chat.impl.utils.evalex.AbstractFunction
Type: Abstract Class
Extends: net.advancedplugins.chat.impl.utils.evalex.AbstractLazyFunction
Implements: net.advancedplugins.chat.impl.utils.evalex.Function

Methods:
- Expression$LazyNumber lazyEval(List<Expression$LazyNumber>)

### Class: net.advancedplugins.chat.impl.utils.evalex.AbstractLazyFunction
Type: Abstract Class
Implements: net.advancedplugins.chat.impl.utils.evalex.LazyFunction

Methods:
- int getNumParams()
- String getName()
- boolean isBooleanFunction()
- boolean numParamsVaries()

### Class: net.advancedplugins.chat.impl.utils.evalex.AbstractLazyOperator
Type: Abstract Class
Implements: net.advancedplugins.chat.impl.utils.evalex.LazyOperator

Methods:
- int getPrecedence()
- String getOper()
- boolean isBooleanOperator()
- boolean isLeftAssoc()

### Class: net.advancedplugins.chat.impl.utils.evalex.AbstractOperator
Type: Abstract Class
Extends: net.advancedplugins.chat.impl.utils.evalex.AbstractLazyOperator
Implements: net.advancedplugins.chat.impl.utils.evalex.Operator

Methods:
- Expression$LazyNumber eval(Expression$LazyNumber, Expression$LazyNumber)

### Class: net.advancedplugins.chat.impl.utils.evalex.AbstractUnaryOperator
Type: Abstract Class
Extends: net.advancedplugins.chat.impl.utils.evalex.AbstractOperator

Methods:
- BigDecimal evalUnary(BigDecimal)
- Expression$LazyNumber eval(Expression$LazyNumber, Expression$LazyNumber)
- BigDecimal eval(BigDecimal, BigDecimal)

### Class: net.advancedplugins.chat.impl.utils.evalex.Expression
Type: Class

Methods:
- Set<String> getDeclaredOperators()
- String toRPN()
- String getOriginalExpression()
- Function addFunction(Function)
- List<String> getUsedVariables()
- List<String> infixNotation()
- Expression setPrecision(int)
- Set<String> getDeclaredFunctions()
- Expression setVariable(String, BigDecimal)
- Expression setVariable(String, Expression$LazyNumber)
- Expression setVariable(String, String)
- Expression setVariableCharacters(String)
- Expression with(String, BigDecimal)
- Expression with(String, Expression$LazyNumber)
- Expression with(String, String)
- boolean isBoolean()
- String getExpression()
- TOPERATOR addOperator(T)
- BigDecimal eval()
- BigDecimal eval(boolean)
- int hashCode()
- Expression and(String, String)
- Expression and(String, BigDecimal)
- Expression and(String, Expression$LazyNumber)
- LazyFunction addLazyFunction(LazyFunction)
- boolean equals(Object)
- Iterator<Expression$Token> getExpressionTokenizer()
- String toString()
- Expression setFirstVariableCharacters(String)
- Expression setRoundingMode(RoundingMode)
- Set<String> getDeclaredVariables()

### Class: net.advancedplugins.chat.impl.utils.evalex.Expression$ExpressionException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: net.advancedplugins.chat.impl.utils.evalex.Expression$Function
Type: Abstract Class
Extends: net.advancedplugins.chat.impl.utils.evalex.AbstractFunction

No public methods found

### Class: net.advancedplugins.chat.impl.utils.evalex.Expression$LazyFunction
Type: Abstract Class
Extends: net.advancedplugins.chat.impl.utils.evalex.AbstractLazyFunction

No public methods found

### Class: net.advancedplugins.chat.impl.utils.evalex.Expression$Operator
Type: Abstract Class
Extends: net.advancedplugins.chat.impl.utils.evalex.AbstractOperator

No public methods found

### Class: net.advancedplugins.chat.impl.utils.evalex.Expression$Token
Type: Class

Methods:
- int length()
- String toString()
- char charAt(int)
- void append(char)
- void append(String)

### Class: net.advancedplugins.chat.impl.utils.evalex.Expression$UnaryOperator
Type: Abstract Class
Extends: net.advancedplugins.chat.impl.utils.evalex.AbstractUnaryOperator

No public methods found

### Class: net.advancedplugins.chat.impl.utils.evalex.ExpressionSettings
Type: Class

Methods:
- MathContext getMathContext()
- **static** ExpressionSettings$Builder builder()
- int getPowerOperatorPrecedence()

### Class: net.advancedplugins.chat.impl.utils.evalex.ExpressionSettings$Builder
Type: Class

Methods:
- ExpressionSettings$Builder powerOperatorPrecedenceHigher()
- ExpressionSettings$Builder powerOperatorPrecedence(int)
- ExpressionSettings build()
- ExpressionSettings$Builder mathContext(MathContext)

### Class: net.advancedplugins.chat.impl.utils.evalex.LazyIfNumber
Type: Class
Implements: net.advancedplugins.chat.impl.utils.evalex.Expression$LazyNumber

Methods:
- BigDecimal eval()
- String getString()

## Package: net.advancedplugins.chat.impl.utils.files

### Class: net.advancedplugins.chat.impl.utils.files.ResourceFileManager
Type: Class

Methods:
- **static** void saveAllResources(JavaPlugin, String, String)
- **static** void saveAllResourceFolders(JavaPlugin, String[], String)

## Package: net.advancedplugins.chat.impl.utils.hooks

### Class: net.advancedplugins.chat.impl.utils.hooks.PermissionHook
Type: Interface

Methods:
- boolean isPermEnabled()
- boolean addPerm(Player, String)
- boolean removePerm(Player, String)

### Class: net.advancedplugins.chat.impl.utils.hooks.VanishHook
Type: Interface

Methods:
- boolean isPlayerVanished(Player)

### Class: net.advancedplugins.chat.impl.utils.hooks.HookPlugin
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ADVANCEDENCHANTMENTS
- ADVANCEDSKILLS
- WORLDGUARD
- TOWNY
- TAB
- TOWNYCHAT
- LWC
- LANDS
- GRIEFPREVENTION
- GRIEFDEFENDER
- SLIMEFUN
- ADVANCEDPETS
- DYNMAP
- RESIDENCE
- AURASKILLS
- PLACEHOLDERAPI
- ESSENTIALS
- CMI
- FACTIONS
- ITEMSADDER
- MYTHICMOBS
- GEYSER
- MCMMO
- SUPERIORSKYBLOCK2
- ORAXEN
- PROTECTIONSTONES
- PROTOCOLLIB
- FACTIONSKORE
- ADVANCEDCHESTS
- BEACONPLUS3
- LUCKPERMS
- VAULT
- VIAVERSION
- PREMIUMVANISH
- SUPERVANISH
- DISCORDSRV

Methods:
- **static** HookPlugin valueOf(String)
- **static** HookPlugin[] values()
- String getPluginName()

### Class: net.advancedplugins.chat.impl.utils.hooks.HooksHandler
Type: Class

Methods:
- **static** PermissionHook getPermissionHook()
- **static** void hook(JavaPlugin)
- **static** HologramHandler getHolograms()
- **static** VanishHook getVanishHook()
- **static** boolean isEnabled(HookPlugin)
- **static** PluginHookInstance getHook(HookPlugin)
- **static** boolean isPlayerVanished(Player)

### Class: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Type: Class

Methods:
- String getName()
- boolean isEnabled()
- Plugin getPluginInstance()

## Package: net.advancedplugins.chat.impl.utils.hooks.factions

### Class: net.advancedplugins.chat.impl.utils.hooks.factions.FactionsPluginHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getRelationOfLand(Player)
- String getRelation(Player, Player)

## Package: net.advancedplugins.chat.impl.utils.hooks.holograms

### Class: net.advancedplugins.chat.impl.utils.hooks.holograms.CMIHologramHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.holograms.HologramHandler

Methods:
- String getName()
- void updateHologram(String, String)
- void removeHologram(String)
- void createHologram(Location, String, String)

### Class: net.advancedplugins.chat.impl.utils.hooks.holograms.DecentHologramsHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.holograms.HologramHandler

Methods:
- String getName()
- void updateHologram(String, String)
- void removeHologram(String)
- void createHologram(Location, String, String)

### Class: net.advancedplugins.chat.impl.utils.hooks.holograms.HologramHandler
Type: Class

Methods:
- String getName()
- JavaPlugin getPlugin()
- double getOffset()
- void removeHologram(String)
- void updateHologram(String, String)
- void createHologram(Location, String, String)

## Package: net.advancedplugins.chat.impl.utils.hooks.plugins

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.AdvancedChestsHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getName()
- boolean isEnabled()
- boolean isAdvancedChest(Location)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.AdvancedEnchantmentsHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getName()
- boolean isEnabled()
- AdvancedEnchantment getInstance(String)
- HashMap<String, Integer> getEnchantmentsOnItem(ItemStack)
- List<String> getAllEnchantments()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.AdvancedSkillsHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getName()
- boolean isEnabled()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.AuraSkillsHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Implements: org.bukkit.event.Listener

Methods:
- String getName()
- boolean isTerraformEvent(BlockBreakEvent)
- boolean isEnabled()
- void addBrokenBlockToMap(Block, Player, DropsSettings)
- void onLoot(LootDropEvent)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.BeaconsPlus3Hook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getName()
- boolean isEnabled()
- boolean isBeaconPlus(Location)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.CMIHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Implements: net.advancedplugins.chat.impl.utils.hooks.VanishHook, org.bukkit.event.Listener

Methods:
- String getName()
- boolean isEnabled()
- boolean isPlayerVanished(Player)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.DiscordSRVHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getName()
- void processChatMessage(Player, String, String, Event)
- boolean isEnabled()
- void processGlobalChatMessage(Player, String, Event)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.DynmapHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getName()
- boolean isEnabled()
- void setDynmapGeneration(boolean)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.EssentialsHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Implements: net.advancedplugins.chat.impl.utils.hooks.VanishHook, org.bukkit.event.Listener

Methods:
- String getName()
- boolean isEnabled()
- boolean isPlayerVanished(Player)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.FactionsMCoreHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.factions.FactionsPluginHook

Methods:
- String getName()
- boolean isEnabled()
- String getRelationOfLand(Player)
- String getRelation(Player, Player)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.FactionsUUIDHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.factions.FactionsPluginHook

Methods:
- String getName()
- boolean isEnabled()
- String getRelationOfLand(Player)
- String getRelation(Player, Player)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.GeyserHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getName()
- boolean isEnabled()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.GriefDefenderHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- boolean canBuild(Player, Location)
- String getName()
- boolean isEnabled()
- boolean canIceGenerate(Location)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.GriefPreventionHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- boolean canBuild(Player, Location)
- String getName()
- boolean isEnabled()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.ItemsAdderHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Implements: org.bukkit.event.Listener

Methods:
- int getCustomItemDurability(ItemStack)
- void onCustomBlockBreak(CustomBlockBreakEvent)
- boolean canBeBrokenWith(ItemStack, Block)
- String getName()
- boolean removeBlock(Block)
- boolean isCustomItem(ItemStack)
- String replaceFontImages(String)
- String replaceFontImages(Player, String)
- List<ItemStack> getLootForCustomBlock(Block)
- List<ItemStack> getLootForCustomBlock(ItemStack, Block)
- boolean isCustomBlock(Block)
- boolean isEnabled()
- int getCustomItemMaxDurability(ItemStack)
- ItemStack getByName(String)
- ItemStack setCustomItemDurability(ItemStack, int)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.LandsHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- boolean canBuild(Player, Location)
- boolean canAttack(Player, Player)
- boolean isProtected(Location)
- String getName()
- boolean isEnabled()
- boolean canMobsSpawn(Location)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.LuckPermsHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Implements: net.advancedplugins.chat.impl.utils.hooks.PermissionHook

Methods:
- String getName()
- String getGroup(Player)
- boolean isEnabled()
- boolean isPermEnabled()
- boolean addPerm(Player, String)
- boolean removePerm(Player, String)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.McMMOHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Implements: org.bukkit.event.Listener

Methods:
- boolean isFakeBlockBreak(Event)
- String getName()
- int getHerbalismBonusDropMultiplier(Block)
- void onBonusDrop(McMMOItemSpawnEvent)
- void processHerbalismBlockBreakEvent(Player, BlockBreakEvent)
- boolean isFakeFishEvent(Event)
- void addSkillExperience(Player, String, int)
- List<String> getSkills()
- boolean isBleeding(Player)
- void onTelepathyTreeFellerBonusItemSpawn(McMMOItemSpawnEvent)
- boolean herbalismCheck(Player, BlockBreakEvent)
- boolean callFakeEvent(Block, Player)
- int getSkillLevel(Player, String)
- boolean isEnabled()
- boolean isTreeFellerEvent(Event)
- boolean blockHasHerbalismBonusDrops(Block)
- void processBlockBreakEvent(Player, BlockBreakEvent, boolean, boolean)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.MythicMobsHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Implements: org.bukkit.event.Listener

Methods:
- **static** Set<Entity> getIgnoreEnchantsMobs()
- boolean isMythicMob(LivingEntity)
- String getName()
- boolean isEnabled()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.OraxenHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Implements: org.bukkit.event.Listener

Methods:
- boolean canBeBrokenWith(ItemStack, Block)
- void onCustomBlockBreak(OraxenNoteBlockBreakEvent)
- boolean isCustomNoteBlock(Block)
- String getName()
- List<ItemStack> getLootForCustomBlock(Block)
- boolean isCustomStringBlock(Block)
- boolean isCustomBlock(Block)
- boolean isEnabled()
- boolean removeBlock(Block)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.PlaceholderAPIHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String parsePlaceholders(Player, Player, String)
- String getName()
- boolean isEnabled()
- boolean registerPlaceholder(String, PlaceholderHook)
- String parsePlaceholder(OfflinePlayer, String)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.PremiumVanishHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Implements: net.advancedplugins.chat.impl.utils.hooks.VanishHook

Methods:
- String getName()
- boolean isEnabled()
- boolean isPlayerVanished(Player)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.ProtectionStonesHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getName()
- boolean isProtectionStone(Block)
- boolean isEnabled()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.ResidenceHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- boolean canBuild(Player, Location)
- boolean isProtected(Location)
- String getName()
- boolean isEnabled()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.SlimeFunHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- boolean isSlimefunItem(Location)
- boolean isSlimefunItem(Block)
- boolean canBuild(Player, Location)
- boolean hasSoulbound(ItemStack, World)
- String getName()
- boolean isEnabled()
- Collection<ItemStack> getDrops(Location)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.SuperVanishHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Implements: net.advancedplugins.chat.impl.utils.hooks.VanishHook

Methods:
- String getName()
- boolean isEnabled()
- boolean isPlayerVanished(Player)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.SuperiorSkyblock2Hook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- int getStackedAmount(Block)
- String getName()
- boolean isStackedBlock(Block)
- boolean isEnabled()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.TabHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getName()
- boolean isEnabled()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.TownyChatHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getName()
- boolean isEnabled()
- boolean isInTownyChannel(Player)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.TownyHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- boolean canBuild(Player, Location)
- boolean canBreak(Player, Location)
- boolean hasKeepInventory(Player)
- String getName()
- boolean isEnabled()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.VaultHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance
Implements: net.advancedplugins.chat.impl.utils.hooks.PermissionHook

Methods:
- String getName()
- boolean isEnabled()
- boolean isPermEnabled()
- boolean addPerm(Player, String)
- boolean removePerm(Player, String)

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.VaultHook$NoOpPermission
Type: Class
Extends: net.milkbowl.vault.permission.Permission

Methods:
- String getName()
- String getPrimaryGroup(String, String)
- boolean playerRemove(String, String, String)
- boolean playerAdd(String, String, String)
- boolean playerRemoveGroup(String, String, String)
- boolean groupAdd(String, String, String)
- boolean playerHas(String, String, String)
- boolean groupRemove(String, String, String)
- boolean hasSuperPermsCompat()
- boolean groupHas(String, String, String)
- boolean playerAddGroup(String, String, String)
- boolean isEnabled()
- boolean hasGroupSupport()
- String[] getPlayerGroups(String, String)
- boolean playerInGroup(String, String, String)
- String[] getGroups()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.ViaVersionHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- String getName()
- String getPlayerVersion(Player)
- boolean isEnabled()

### Class: net.advancedplugins.chat.impl.utils.hooks.plugins.WorldGuardHook
Type: Class
Extends: net.advancedplugins.chat.impl.utils.hooks.PluginHookInstance

Methods:
- boolean canBuild(Player, Location)
- boolean isProtected(Location)
- String getName()
- boolean isEnabled()
- boolean canMobsSpawn(Location)

## Package: net.advancedplugins.chat.impl.utils.items

### Class: net.advancedplugins.chat.impl.utils.items.ConfigItemCreator
Type: Class

Methods:
- **static** V setDefaultPaths(HashMap<String, String>)
- **static** HashMap<String, String> getDefaultPaths()
- **static** ItemStack fromConfigSection(String, String, Map<String, String>, Map<String, String>, JavaPlugin)
- **static** ItemStack fromConfigSection(FileConfiguration, ItemStack, String, Map<String, String>, Map<String, String>)
- **static** ItemStack fromConfigSection(ConfigurationSection, ItemStack, String, Map<String, String>, Map<String, String>, Player)
- **static** ItemStack fromConfigSection(ConfigurationSection, ConfigurationSection, ItemStack, String, String, Map<String, String>, Map<String, String>, Map<String, String>, Player)
- **static** ItemStack fromConfigSection(FileConfiguration, String, Map<String, String>, Map<String, String>)
- **static** ItemStack fromConfigSection(ConfigurationSection, String, Map<String, String>, Map<String, String>)
- **static** ItemStack fromConfigSection(ConfigurationSection, ConfigurationSection, String, String, Map<String, String>, Map<String, String>, Map<String, String>)
- **static** ItemStack fromConfigSection(ConfigurationSection, String, Map<String, String>, Map<String, String>, Player)
- **static** ItemStack fromConfigSection(ConfigurationSection, ConfigurationSection, String, String, Map<String, String>, Map<String, String>, Map<String, String>, Player)

### Class: net.advancedplugins.chat.impl.utils.items.ItemBuilder
Type: Class

Methods:
- ItemBuilder setName(String)
- V addLoreLines(List<String>)
- ItemBuilder setCustomNBT(String)
- ItemBuilder setInfinityDurability()
- ItemBuilder setCustomModelData(Integer)
- ItemBuilder setGlowing(boolean)
- ItemBuilder addNBTTag(String, String)
- ItemBuilder addCustomEnchantment(String, int)
- ItemBuilder setItemFlags(ItemFlag[])
- ItemBuilder addUnsafeEnchantment(Enchantment, int)
- ItemBuilder addEnchantment(Enchantment, int)
- ItemStack toItemStack()
- ItemBuilder setDurability(short)
- ItemBuilder setAmount(int)
- Optional<ConfigurationSection> getConfigSection()
- ItemMeta getItemMeta()
- ItemBuilder setUnbreakable(boolean)
- ItemBuilder setArmorTrim(String, String)
- ItemBuilder removeLoreLine(String)
- ItemBuilder removeLoreLine(int)
- ItemBuilder setType(Material)
- ItemBuilder addEnchantments(Map<Enchantment, Integer>)
- ItemBuilder setColor(Color)
- ItemBuilder addAttribute(Attribute, AttributeModifier)
- ItemBuilder setLore(String[])
- ItemBuilder setLore(List<String>)
- ItemBuilder setItemModel(String)
- ItemBuilder addItemFlag(ItemFlag[])
- ItemBuilder addLoreLine(String)
- ItemBuilder addLoreLine(String, int)
- ItemBuilder addPDC(String, String)
- ItemBuilder setSkullOwner(String)
- ItemBuilder removeEnchantment(Enchantment)

### Class: net.advancedplugins.chat.impl.utils.items.ItemFlagFix
Type: Class

Methods:
- **static** void fix(ItemStack)
- **static** void fix(ItemMeta)
- **static** ItemFlag[] hideAllAttributes()

## Package: net.advancedplugins.chat.impl.utils.locale

### Class: net.advancedplugins.chat.impl.utils.locale.LocaleHandler
Type: Class

Methods:
- String getPrefix()
- void setPrefix(String)
- JavaPlugin getInstance()
- String getString(String, String)
- String getString(String)
- LocaleHandler readLocaleFiles(JavaPlugin, String)
- **static** LocaleHandler getHandler()
- List<String> getStringList(String)
- String getLocale()
- LocaleFile getFile()
- void saveAllLocaleFiles(JavaPlugin)
- void setLocale(String)
- ImmutableSet<String> getAvailableLocales()

## Package: net.advancedplugins.chat.impl.utils.locale.subclass

### Class: net.advancedplugins.chat.impl.utils.locale.subclass.LocaleFile
Type: Class

Methods:
- void reloadLocaleConfig()
- FileConfiguration getConfiguration()
- FileConfiguration getLocaleConfig()
- void setConfiguration(FileConfiguration)
- String getLocale()

## Package: net.advancedplugins.chat.impl.utils.menus

### Class: net.advancedplugins.chat.impl.utils.menus.AdvancedMenu
Type: Class
Implements: org.bukkit.inventory.InventoryHolder

Methods:
- void openInventory()
- void openInventory(Integer)
- Player getPlayer()
- int getPage()
- int getMaxPages()
- void setTitle(String)
- void setReplace(Replace)
- int getInvSize()
- void setMaxPages(int)
- void refreshItems()
- void processItem(String, ConfigurationSection, Replace)
- void processItem(String, ConfigurationSection)
- AdvancedMenu addAction(ClickAction, int[])
- AdvancedMenu addItem(AdvancedMenuItem, int[])
- String getTitle()
- Replace getReplace()
- void setFillerItem(AdvancedMenuItem)
- Inventory getInventory()
- AdvancedMenu addCloseAction(ClickAction)
- void setPage(int)

### Class: net.advancedplugins.chat.impl.utils.menus.AdvancedMenuClick
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onClose(InventoryCloseEvent)
- void onClick(InventoryClickEvent)

### Class: net.advancedplugins.chat.impl.utils.menus.AdvancedMenusHandler
Type: Class

Methods:
- void unload()
- String getPath(String)
- **static** AdvancedMenusHandler getInstance()
- HashMap<String, ClickAction> getDefaultActions()

## Package: net.advancedplugins.chat.impl.utils.menus.item

### Class: net.advancedplugins.chat.impl.utils.menus.item.ClickAction
Type: Interface

Methods:
- void onClick(Player, AdvancedMenu, AdvancedMenuItem, int, ClickType)

### Class: net.advancedplugins.chat.impl.utils.menus.item.ClickActionArgs
Type: Interface
Implements: net.advancedplugins.chat.impl.utils.menus.item.ClickAction

Methods:
- void onClick(Player, AdvancedMenu, AdvancedMenuItem, int, ClickType, String)

### Class: net.advancedplugins.chat.impl.utils.menus.item.AdvancedMenuItem
Type: Class

Methods:
- AdvancedMenuItem setSlots(int[])
- void addToInventory(Inventory)
- AdvancedMenuItem setData(String)
- AdvancedMenuItem setGlow()
- ItemStack getItem()
- String getAction()
- String getSlots()
- AdvancedMenuItem setAmount(int)
- String getData()

## Package: net.advancedplugins.chat.impl.utils.nbt

### Class: net.advancedplugins.chat.impl.utils.nbt.NBTapi
Type: Class

Methods:
- **static** long getLong(String, ItemStack)
- **static** Integer getInt(String, ItemStack)
- **static** boolean contains(String, ItemStack)
- **static** String get(String, ItemStack)
- **static** ItemStack removeTag(String, ItemStack)
- **static** ItemStack addNBTTag(String, String, ItemStack)
- **static** ItemStack addNBTTag(String, int, ItemStack)
- **static** ItemStack addNBTTag(String, long, ItemStack)

## Package: net.advancedplugins.chat.impl.utils.nbt.backend

### Class: net.advancedplugins.chat.impl.utils.nbt.backend.ClassWrapper
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CRAFT_BlockData
- CRAFT_World
- CRAFT_Entity
- CRAFT_Player
- CRAFT_MagicNumbers
- CRAFT_MetaBook
- CRAFT_Enchantment
- NMS_Block
- NMS_EntityPlayer
- NMS_EntityHuman
- NMS_DamageSource
- NMS_IChatBaseComponent
- NMS_EnumHand
- NMS_Explosion
- NMS_PathEntity
- NMS_ENTITY_INSENTIENT
- CRAFT_FISHHOOK
- CRAFT_ITEMSTACK
- CRAFT_METAITEM
- CRAFT_ENTITY
- CRAFT_WORLD
- CRAFT_SERVER
- CRAFT_PERSISTENTDATACONTAINER
- NMS_NBTBASE
- NMS_NBTTAGSTRING
- NMS_NBTTAGINT
- NMS_NBTTAGINTARRAY
- NMS_NBTTAGFLOAT
- NMS_NBTTAGDOUBLE
- NMS_NBTTAGLONG
- NMS_ITEMSTACK
- NMS_NBTTAGCOMPOUND
- NMS_NBTTAGLIST
- NMS_NBTCOMPRESSEDSTREAMTOOLS
- NMS_MOJANGSONPARSER
- NMS_TILEENTITY
- NMS_BLOCKPOSITION
- NMS_WORLDSERVER
- NMS_MINECRAFTSERVER
- NMS_WORLD
- NMS_ENTITY
- NMS_ENTITYTYPES
- NMS_REGISTRYSIMPLE
- NMS_REGISTRYMATERIALS
- NMS_IREGISTRY
- NMS_MINECRAFTKEY
- NMS_GAMEPROFILESERIALIZER
- NMS_IBLOCKDATA
- NMS_NBTACCOUNTER
- NMS_CUSTOMDATA
- NMS_DATACOMPONENTTYPE
- NMS_DATACOMPONENTS
- NMS_DATACOMPONENTHOLDER
- NMS_PROVIDER
- NMS_SERVER
- NMS_DATAFIXERS
- NMS_REFERENCES
- NMS_NBTOPS
- GAMEPROFILE

Methods:
- Class<*> getClazz()
- String getMojangName()
- **static** ClassWrapper valueOf(String)
- **static** ClassWrapper[] values()

### Class: net.advancedplugins.chat.impl.utils.nbt.backend.ReflectionMethod
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- COMPOUND_SET_FLOAT
- COMPOUND_SET_STRING
- COMPOUND_SET_INT
- COMPOUND_SET_BYTEARRAY
- COMPOUND_SET_INTARRAY
- COMPOUND_SET_LONG
- COMPOUND_SET_SHORT
- COMPOUND_SET_BYTE
- COMPOUND_SET_DOUBLE
- COMPOUND_SET_BOOLEAN
- COMPOUND_SET_UUID
- COMPOUND_MERGE
- COMPOUND_SET
- COMPOUND_GET
- COMPOUND_GET_LIST
- COMPOUND_OWN_TYPE
- COMPOUND_GET_FLOAT
- COMPOUND_GET_STRING
- COMPOUND_GET_INT
- COMPOUND_GET_BYTEARRAY
- COMPOUND_GET_INTARRAY
- COMPOUND_GET_LONG
- COMPOUND_GET_SHORT
- COMPOUND_GET_BYTE
- COMPOUND_GET_DOUBLE
- COMPOUND_GET_BOOLEAN
- COMPOUND_GET_UUID
- COMPOUND_GET_COMPOUND
- NMSITEM_GETTAG
- NMSITEM_SAVE
- NMSITEM_CREATESTACK
- COMPOUND_REMOVE_KEY
- COMPOUND_HAS_KEY
- COMPOUND_GET_TYPE
- COMPOUND_GET_KEYS
- LISTCOMPOUND_GET_KEYS
- LIST_REMOVE_KEY
- LIST_SIZE
- LIST_SET
- LEGACY_LIST_ADD
- LIST_ADD
- LIST_GET_STRING
- LIST_GET_COMPOUND
- LIST_GET
- ITEMSTACK_SET_TAG
- ITEMSTACK_NMSCOPY
- ITEMSTACK_BUKKITMIRROR
- CRAFT_WORLD_GET_HANDLE
- NMS_WORLD_GET_TILEENTITY
- NMS_WORLD_SET_TILEENTITY
- NMS_WORLD_REMOVE_TILEENTITY
- NMS_WORLD_GET_TILEENTITY_1_7_10
- TILEENTITY_LOAD_LEGACY191
- TILEENTITY_LOAD_LEGACY183
- TILEENTITY_LOAD_LEGACY1121
- TILEENTITY_LOAD_LEGACY1151
- TILEENTITY_LOAD
- TILEENTITY_GET_NBT
- TILEENTITY_GET_NBT_1181
- TILEENTITY_SET_NBT_LEGACY1151
- TILEENTITY_SET_NBT_LEGACY1161
- TILEENTITY_SET_NBT
- TILEENTITY_GET_BLOCKDATA
- CRAFT_ENTITY_GET_HANDLE
- NMS_ENTITY_SET_NBT
- NMS_ENTITY_GET_NBT
- NMS_ENTITY_GETSAVEID
- NBTFILE_READV2
- NBTACCOUNTER_CREATE_UNLIMITED
- NBTFILE_READ
- NBTFILE_WRITE
- PARSE_NBT
- REGISTRY_KEYSET
- REGISTRY_GET
- REGISTRY_SET
- REGISTRY_GET_INVERSE
- REGISTRYMATERIALS_KEYSET
- REGISTRYMATERIALS_GET
- REGISTRYMATERIALS_GETKEY
- GAMEPROFILE_DESERIALIZE
- GAMEPROFILE_SERIALIZE
- CRAFT_PERSISTENT_DATA_CONTAINER_TO_TAG
- CRAFT_PERSISTENT_DATA_CONTAINER_GET_MAP
- CRAFT_PERSISTENT_DATA_CONTAINER_PUT_ALL
- CRAFT_MagicNumbers_getBlock
- NMS_Block_getBlockData
- CRAFT_MagicNumbers_getItem
- CRAFT_ItemStack_asNMSCopy
- NMS_ItemStack_canDestroySpecialBlock
- CRAFT_Entity_getHandle
- NMS_Entity_damageEntity
- NMS_EntityPlayer_attack
- NMS_ENTITY_GETNAVIGATION
- NMSDATACOMPONENTHOLDER_GET
- NMSCUSTOMDATA_GETCOPY
- NMSITEM_SET
- NMSITEM_SAVE_MODERN
- NMSITEM_LOAD
- NMSSERVER_GETREGISTRYACCESS
- NMSSERVER_GETSERVER
- TILEENTITY_GET_NBT_1205
- TILEENTITY_SET_NBT_1205
- GET_DATAFIXER
- ITEMSTACK_SET_GLINT_OVERRIDE
- NMS_REGISTER_BIOME

Methods:
- ReflectionMethod$Since getSelectedVersionInfo()
- String getMethodName()
- **static** ReflectionMethod valueOf(String)
- **static** ReflectionMethod[] values()
- ClassWrapper getParentClassWrapper()
- Object run(Object, Object[])
- boolean isLoaded()
- boolean isCompatible()

### Class: net.advancedplugins.chat.impl.utils.nbt.backend.ReflectionMethod$Since
Type: Class

No public methods found

## Package: net.advancedplugins.chat.impl.utils.nbt.utils

### Class: net.advancedplugins.chat.impl.utils.nbt.utils.MinecraftVersion
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Unknown
- MC1_7_R4
- MC1_8_R3
- MC1_9_R1
- MC1_9_R2
- MC1_10_R1
- MC1_11_R1
- MC1_12_R1
- MC1_13_R1
- MC1_13_R2
- MC1_14_R1
- MC1_15_R1
- MC1_16_R1
- MC1_16_R2
- MC1_16_R3
- MC1_17_R1
- MC1_18_R1
- MC1_18_R2
- MC1_19_R1
- MC1_19_R2
- MC1_19_R3
- MC1_20_R1
- MC1_20_R2
- MC1_20_R3
- MC1_20_R4
- MC1_21_R1
- MC1_21_R2
- MC1_21_R3
- MC1_21_R4
- MC1_21_R5
- MC1_21_R6

Methods:
- **static** MinecraftVersion getVersion()
- **static** MinecraftVersion init()
- **static** boolean isPaper()
- **static** int getVersionNumber()
- **static** MinecraftVersion valueOf(String)
- **static** MinecraftVersion[] values()
- boolean isMojangMapping()
- **static** void disableDuplicateUUIDReporting(JavaPlugin)
- **static** boolean isNew()
- **static** boolean isNewerThan(MinecraftVersion)
- int getVersionId()
- **static** boolean hasGsonSupport()
- String getPackageName()
- **static** MinecraftVersion getCurrentVersion()
- **static** boolean isAtLeastVersion(MinecraftVersion)

### Class: net.advancedplugins.chat.impl.utils.nbt.utils.MojangToMapping
Type: Class

Methods:
- **static** Map<String, String> getMapping()

### Class: net.advancedplugins.chat.impl.utils.nbt.utils.NbtApiException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: net.advancedplugins.chat.impl.utils.nbt.utils.PackageWrapper
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NMS
- CRAFTBUKKIT
- NONE

Methods:
- **static** PackageWrapper valueOf(String)
- **static** PackageWrapper[] values()
- String getUri()

## Package: net.advancedplugins.chat.impl.utils.pdc

### Class: net.advancedplugins.chat.impl.utils.pdc.PDCHandler
Type: Class

Methods:
- **static** void set(PersistentDataHolder, String, PersistentDataType, Object)
- **static** void set(Block, String, PersistentDataType, String)
- **static** double getDouble(PersistentDataHolder, String)
- **static** List<String> getKeys(ItemStack)
- **static** String getKeys(Player)
- **static** float getFloat(PersistentDataHolder, String)
- **static** String getString(PersistentDataHolder, String, String)
- **static** String getString(PersistentDataHolder, String)
- **static** void unset(PersistentDataHolder, String)
- **static** boolean hasString(PersistentDataHolder, String)
- **static** void remove(PersistentDataHolder, String)
- **static** void remove(Block, String)
- **static** void setInt(PersistentDataHolder, String, int)
- **static** void setDouble(PersistentDataHolder, String, double)
- **static** long getLong(PersistentDataHolder, String)
- **static** long getLong(World, String)
- **static** boolean hasPDC(PersistentDataHolder)
- **static** boolean hasBoolean(PersistentDataHolder, String)
- **static** boolean hasInt(PersistentDataHolder, String)
- **static** int getInt(PersistentDataHolder, String)
- **static** void setLong(PersistentDataHolder, String, long)
- **static** void setString(PersistentDataHolder, String, String)
- **static** boolean contains(PersistentDataHolder, String)
- **static** NamespacedKey getNamespace(String, String)
- **static** NamespacedKey getNamespace(String)
- **static** Object get(PersistentDataHolder, String, PersistentDataType)
- **static** Object get(ItemStack, NamespacedKey)
- **static** Object get(Block, String)
- **static** boolean getBoolean(PersistentDataHolder, String)
- **static** boolean has(PersistentDataHolder, String, PersistentDataType)
- **static** boolean has(PersistentDataHolder, String)
- **static** boolean has(PersistentDataHolder, NamespacedKey)
- **static** boolean has(Block, String)
- **static** void setBoolean(PersistentDataHolder, String, boolean)

## Package: net.advancedplugins.chat.impl.utils.plugin

### Class: net.advancedplugins.chat.impl.utils.plugin.AdvancedPlugin
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin
Implements: org.bukkit.event.Listener

Methods:
- void saveAllFiles(String)
- void setLoaded(boolean)
- void onEnable()
- boolean isLoaded()
- void onDisable()
- void saveFiles(String[])
- void onJoin(PlayerJoinEvent)
- void registerListeners()
- void startup()
- void unload()
- void registerEvents(Listener)
- void registerCommands()
- **static** AdvancedPlugin getInstance()
- void saveResource(String)

## Package: net.advancedplugins.chat.impl.utils.protection

### Class: net.advancedplugins.chat.impl.utils.protection.ProtectionType
Type: Interface

Methods:
- boolean canAttack(Player, Player)
- boolean canBreak(Player, Location)
- boolean isProtected(Location)
- String getName()

### Class: net.advancedplugins.chat.impl.utils.protection.ProtectionHandler
Type: Class

Methods:
- boolean canAttack(Player, Player)
- boolean canBreak(Location, Player)
- boolean isProtected(Location)
- void register(JavaPlugin, ProtectionType)

## Package: net.advancedplugins.chat.impl.utils.protection.events

### Class: net.advancedplugins.chat.impl.utils.protection.events.FakeAdvancedBlockBreakEvent
Type: Class
Extends: org.bukkit.event.block.BlockBreakEvent

Methods:
- void setDropItems(boolean)
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean)
- boolean isDropItems()

## Package: net.advancedplugins.chat.impl.utils.protection.external

### Class: net.advancedplugins.chat.impl.utils.protection.external.FactionsCheck
Type: Class
Implements: net.advancedplugins.chat.impl.utils.protection.ProtectionType

Methods:
- boolean canAttack(Player, Player)
- boolean canBreak(Player, Location)
- boolean isProtected(Location)
- String getName()

### Class: net.advancedplugins.chat.impl.utils.protection.external.LandsCheck
Type: Class
Implements: net.advancedplugins.chat.impl.utils.protection.ProtectionType

Methods:
- boolean canAttack(Player, Player)
- boolean canBreak(Player, Location)
- boolean isProtected(Location)
- String getName()

### Class: net.advancedplugins.chat.impl.utils.protection.external.ProtectionStonesCheck
Type: Class
Implements: net.advancedplugins.chat.impl.utils.protection.ProtectionType

Methods:
- boolean canAttack(Player, Player)
- boolean canBreak(Player, Location)
- boolean isProtected(Location)
- String getName()

### Class: net.advancedplugins.chat.impl.utils.protection.external.SlimeFunCheck
Type: Class
Implements: net.advancedplugins.chat.impl.utils.protection.ProtectionType

Methods:
- boolean canAttack(Player, Player)
- boolean canBreak(Player, Location)
- boolean isProtected(Location)
- String getName()

### Class: net.advancedplugins.chat.impl.utils.protection.external.WorldGuardCheck
Type: Class
Implements: net.advancedplugins.chat.impl.utils.protection.ProtectionType

Methods:
- boolean canAttack(Player, Player)
- boolean canBreak(Player, Location)
- boolean isProtected(Location)
- String getName()

## Package: net.advancedplugins.chat.impl.utils.protection.internal

### Class: net.advancedplugins.chat.impl.utils.protection.internal.GlobalProtCheck
Type: Class
Implements: net.advancedplugins.chat.impl.utils.protection.ProtectionType, org.bukkit.event.Listener

Methods:
- boolean canBreak(Player, Location)
- boolean canAttack(Player, Player)
- boolean isProtected(Location)
- String getName()

## Package: net.advancedplugins.chat.impl.utils.stringManipulation

### Class: net.advancedplugins.chat.impl.utils.stringManipulation.CompareType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CONTAINS
- EQUALS
- STARTS_WITH
- ENDS_WITH
- REGEX

Methods:
- boolean compare(String, String)
- **static** CompareType valueOf(String)
- **static** CompareType[] values()

## Package: net.advancedplugins.chat.impl.utils.text

### Class: net.advancedplugins.chat.impl.utils.text.Replace
Type: Interface
Implements: java.util.function.UnaryOperator

No public methods found

### Class: net.advancedplugins.chat.impl.utils.text.BooleanConverter
Type: Class

Methods:
- **static** String booleanToYesNo(boolean)

### Class: net.advancedplugins.chat.impl.utils.text.Replacer
Type: Class

Methods:
- String applyTo(String)
- OfflinePlayer getPlayer()
- Replacer set(String, Object)
- Replacer set(String, Supplier<Object>)
- boolean isUsePlaceholderApi()
- **static** Replacer of(Map<String, String>)
- **static** String to(String, UnaryOperator<Replacer>)
- HashMap<String, String> getPlaceholders()
- Replacer tryAddPapi(OfflinePlayer)

### Class: net.advancedplugins.chat.impl.utils.text.Text
Type: Class

Methods:
- **static** String modify(String)
- **static** String modify(String, Replace)
- **static** String modify(String, Replace, boolean)
- **static** List<String> modify(List<String>)
- **static** List<String> modify(List<String>, Replace)
- **static** List<String> modify(List<String>, Replace, boolean)
- **static** ItemStack modify(ItemStack, Replace)
- **static** String parsePapi(String, OfflinePlayer)
- **static** List<String> parsePapi(List<String>, OfflinePlayer)
- **static** String decolorize(String)
- **static** void sendMessage(CommandSender, String)
- **static** V sendMessage(Collection<CommandSender>, String)
- **static** String renderColorCodes(String)
- **static** void useProperHexPattern()

## Package: net.advancedplugins.chat.impl.utils.trycatch

### Class: net.advancedplugins.chat.impl.utils.trycatch.TryCatchUtil$ITryCatch
Type: Interface

Methods:
- void run() throws Exception

### Class: net.advancedplugins.chat.impl.utils.trycatch.TryCatchUtil$ITryCatchWithReturn
Type: Interface

Methods:
- TT run() throws Exception

### Class: net.advancedplugins.chat.impl.utils.trycatch.TryCatchUtil
Type: Class

Methods:
- **static** V tryRun(TryCatchUtil$ITryCatch, Consumer<Exception>)
- **static** void tryRun(TryCatchUtil$ITryCatch)
- **static** TT tryAndReturn(TryCatchUtil$ITryCatchWithReturn<TT>)
- **static** TT tryOrDefault(TryCatchUtil$ITryCatchWithReturn<TT>, T, T)
- **static** TT tryOrDefault(TryCatchUtil$ITryCatchWithReturn<TT>, T)

## Package: net.advancedplugins.chat.join_messages

### Class: net.advancedplugins.chat.join_messages.JoinMessage
Type: Class
Implements: java.io.Serializable

Methods:
- boolean isShowJoin()
- List<String> getQuitMessages()
- boolean isShowQuit()
- boolean isShowJoinCrossServer()
- AdvancedAbility getJoinAbility()
- String getGroup()
- int getPriority()
- AdvancedAbility getQuitAbility()
- List<String> getJoinMessages()
- boolean isShowQuitCrossServer()

### Class: net.advancedplugins.chat.join_messages.JoinMessagesHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler
Implements: org.bukkit.event.Listener

Methods:
- void init()
- void reload()
- void onPlayerQuit(PlayerQuitEvent)
- JoinMessage getFormat(Player)
- JoinMessage getFormat(String)
- void onCrossServerPlayerJoin(CrossServerPlayerJoinEvent)
- void onCrossServerPlayerQuit(CrossServerPlayerQuitEvent)
- void onPlayerJoin(PlayerJoinEvent)

## Package: net.advancedplugins.chat.listeners

### Class: net.advancedplugins.chat.listeners.ChatListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- **static** String formatMsg(CommandSender, String, String)
- **static** String parsePlaceholders(String, String, String)
- **static** String escapeChars(String)
- void onChat(AsyncPlayerChatEvent)

### Class: net.advancedplugins.chat.listeners.ConsoleChatListener
Type: Class
Implements: org.bukkit.event.Listener

No public methods found

### Class: net.advancedplugins.chat.listeners.DeathMessagesListener
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler
Implements: org.bukkit.event.Listener

Methods:
- void onPlayerDeath(PlayerDeathEvent)

## Package: net.advancedplugins.chat.mention

### Class: net.advancedplugins.chat.mention.MentionChatSuggestions
Type: Class

Methods:
- **static** void runTask()

### Class: net.advancedplugins.chat.mention.MentionUtils
Type: Class

Methods:
- **static** boolean canBeMentioned(Permissible)
- **static** void playMentionSound(CommandSender, Player, String)
- **static** String colorMentions(String, String)
- **static** boolean canUseMention(Permissible)
- **static** boolean isEnabled()
- **static** boolean isMentioned(String, String)

## Package: net.advancedplugins.chat.menu_links

### Class: net.advancedplugins.chat.menu_links.MenuLink
Type: Class

Methods:
- String getLink()
- String getPermission()
- String getName()
- String getType()

### Class: net.advancedplugins.chat.menu_links.MenuLinkHandler
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- **static** void reload()
- void onLink(PlayerLinksSendEvent)

## Package: net.advancedplugins.chat.menus

### Class: net.advancedplugins.chat.menus.ChatColorMenu
Type: Class
Extends: net.advancedplugins.chat.impl.utils.menus.AdvancedMenu

Methods:
- void openInventory()
- void openInventory(Integer)

### Class: net.advancedplugins.chat.menus.ChatTagsMenu
Type: Class
Extends: net.advancedplugins.chat.impl.utils.menus.AdvancedMenu

Methods:
- void openInventory()
- void openInventory(Integer)
- Collection<ChatTag> getShowTags(Player)

### Class: net.advancedplugins.chat.menus.NameColorMenu
Type: Class
Extends: net.advancedplugins.chat.impl.utils.menus.AdvancedMenu

Methods:
- void openInventory()
- void openInventory(Integer)

## Package: net.advancedplugins.chat.messaging_channels

### Class: net.advancedplugins.chat.messaging_channels.PluginMessageBroker
Type: Class
Implements: org.bukkit.plugin.messaging.PluginMessageListener

Methods:
- void onPluginMessageReceived(String, Player, byte[])
- V request(Player, String, BiConsumer<Player, [B>, String)
- String getIncomingChannel()
- String getOutgoingChannel()
- V listen(String, BiConsumer<Player, [B>)

## Package: net.advancedplugins.chat.motd

### Class: net.advancedplugins.chat.motd.ChatMOTDListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onPlayerJoin(PlayerJoinEvent)

### Class: net.advancedplugins.chat.motd.ServerListMOTDHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- CachedServerIcon getRandomIcon()
- void reload()
- String getRandomMotd()

### Class: net.advancedplugins.chat.motd.ServerListMOTDListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onServerListPing(ServerListPingEvent)

## Package: net.advancedplugins.chat.pdc

### Class: net.advancedplugins.chat.pdc.PDCKey
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- IGNORE
- IGNORE_ALL
- SPY
- SPY_ALL
- CHANNEL_SPY
- CHANNEL_SPY_ALL
- CHANNEL_AUTO_JOIN_BLOCK
- CHAT_COLOR
- NAME_COLOR
- CHAT_TAG
- WARN
- HIDE_CHAT
- HIDE_ANNOUNCEMENTS

Methods:
- String getKey()
- **static** PDCKey valueOf(String)
- PersistentDataType<**> getDataType()
- **static** PDCKey[] values()

## Package: net.advancedplugins.chat.placeholders

### Class: net.advancedplugins.chat.placeholders.PAPIPlaceholders
Type: Class
Extends: me.clip.placeholderapi.expansion.PlaceholderExpansion

Methods:
- String getVersion()
- String onRequest(OfflinePlayer, String)
- String getAuthor()
- String getIdentifier()
- boolean persist()

## Package: net.advancedplugins.chat.rules

### Class: net.advancedplugins.chat.rules.ChatRule
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- boolean isEnabled()
- AdvancedAbility getAbility()
- boolean doesBypass(LivingEntity)
- **static** String getBypassPermission(String)
- String getBypassPermission()

### Class: net.advancedplugins.chat.rules.RuleHandler
Type: Class

Methods:
- void reload()
- void addRule(String, ChatRule)
- List<AdvancedAbility> getRulesAbilities(LivingEntity)
- Set<String> getRuleNames()
- ChatRule getRule(String)
- ImmutableMap<String, ChatRule> getRules()
- void loadRules()

## Package: net.advancedplugins.chat.rules.builtin

### Class: net.advancedplugins.chat.rules.builtin.SwearWordsHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- HashSet<String> getSwearWordsList()
- boolean shouldSendMessage()
- TextResult processMessage(String, Player)
- void reload()

### Class: net.advancedplugins.chat.rules.builtin.TextResult
Type: Class

Methods:
- boolean isViolating()
- String getFinalText()
- void setViolating(boolean)
- void setFinalText(String)

## Package: net.advancedplugins.chat.tags

### Class: net.advancedplugins.chat.tags.ChatTag
Type: Class

Methods:
- void setSectionName(String)
- void setFormat(String)
- **static** ChatTag$ChatTagBuilder builder()
- ItemStack getItem()
- String getFormat()
- String getSectionName()
- void setItem(ItemStack)

### Class: net.advancedplugins.chat.tags.ChatTag$ChatTagBuilder
Type: Class

Methods:
- ChatTag$ChatTagBuilder sectionName(String)
- ChatTag$ChatTagBuilder item(ItemStack)
- ChatTag build()
- ChatTag$ChatTagBuilder format(String)
- String toString()

### Class: net.advancedplugins.chat.tags.TagsHandler
Type: Class
Extends: net.advancedplugins.chat.impl.utils.DataHandler

Methods:
- void deleteTag(String)
- boolean isShowLockedTags()
- String getTagFormat(Player)
- void reload()
- boolean isAddSpaceBeforeTag()
- boolean createTag(String, String, String)
- JavaPlugin getPlugin()
- ImmutableMap<String, ChatTag> getTags()
- void setTag(Player, String)
- boolean isAddSpaceAfterTag()
- ChatTag getTag(String)
- String getTag(Player)

## Package: net.advancedplugins.chat.utils

### Class: net.advancedplugins.chat.utils.CenterMessage
Type: Class

Methods:
- **static** String getCenteredMessage(String)

### Class: net.advancedplugins.chat.utils.CustomAdvancement
Type: Class

Methods:
- Advancement getAdvancement()
- NamespacedKey getKey()
- void grantTo(Player)
- Component getMessage()
- void revokeFrom(Player)
- boolean isShowToast()
- void remove()
- boolean isHidden()
- String getIcon()
- boolean isAnnounceToChat()
- CustomAdvancement$Style getStyle()
- Plugin getPlugin()
- **static** CustomAdvancement$Builder builder()
- String getBackground()

### Class: net.advancedplugins.chat.utils.CustomAdvancement$Builder
Type: Class

Methods:
- CustomAdvancement$Builder plugin(Plugin)
- CustomAdvancement$Builder hidden(boolean)
- CustomAdvancement build()
- CustomAdvancement$Builder announceToChat(boolean)
- CustomAdvancement$Builder background(String)
- CustomAdvancement$Builder icon(String)
- CustomAdvancement$Builder showToast(boolean)
- CustomAdvancement$Builder style(CustomAdvancement$Style)
- CustomAdvancement$Builder message(Component)
- CustomAdvancement$Builder key(NamespacedKey)

### Class: net.advancedplugins.chat.utils.CustomAdvancement$Style
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- GOAL
- TASK
- CHALLENGE

Methods:
- **static** CustomAdvancement$Style valueOf(String)
- **static** CustomAdvancement$Style[] values()

### Class: net.advancedplugins.chat.utils.CustomAdvancementHandler
Type: Class

Methods:
- **static** void send(Player, CustomAdvancement)

### Class: net.advancedplugins.chat.utils.MiniMessageConverter
Type: Class

Methods:
- **static** Map<String, String> getMagicMap()
- **static** Component getFromLegacy(String)

### Class: net.advancedplugins.chat.utils.MiniMessageConverter$MiniTranslator$Option
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- COLOR
- FORMAT
- GRADIENT
- FAST_RESET
- CLOSE_COLORS

Methods:
- **static** MiniMessageConverter$MiniTranslator$Option valueOf(String)
- **static** MiniMessageConverter$MiniTranslator$Option[] values()

### Class: net.advancedplugins.chat.utils.PermissibleColor
Type: Class

Methods:
- **static** String getColoredIfPerm(Permissible, String)
- **static** boolean canUseColors(Permissible)
- **static** boolean canUseMagic(Permissible)

### Class: net.advancedplugins.chat.utils.SmallCapsInterpreter
Type: Class

Methods:
- **static** String preProcessMessage(String)
- **static** boolean isSmallCaps(char)
- **static** String toSmallCaps(String)

### Class: net.advancedplugins.chat.utils.TextNew
Type: Class

Methods:
- **static** List<String> renderToLegacy(CommandSender, Object, List<String>, Replace)
- **static** String renderToLegacy(String)
- **static** String renderToLegacy(CommandSender, Object, String, Replace)
- **static** void sendToastMessageWithoutParsing(CommandSender, String)
- **static** String parsePAPI(OfflinePlayer, Object, String)
- **static** String parsePlaceholdersWithoutPAPI(Player, String)
- **static** void sendToastMessage(CommandSender, OfflinePlayer, String)
- **static** void sendToastMessage(CommandSender, Object, String)
- **static** void sendToastMessage(Player, CommandSender, String)
- **static** void sendToastMessage(Player, OfflinePlayer, String)
- **static** void sendToastMessage(Player, String)
- **static** String toLegacy(Component)
- **static** String createHoverMessage(String, Object)
- **static** String createHoverMessage(Component, Object)
- **static** void sendBossBarMessage(Player, Component, float, BossBar$Color, BossBar$Overlay, long)
- **static** void sendDefaultMessage(CommandSender, Component)
- **static** void sendActionBarMessage(Player, Component)
- **static** Component stripColorComponent(String)
- **static** Component stripColorComponent(Component)
- **static** String stripColor(String)
- **static** String stripColor(Component)
- **static** void sendTitleMessage(Player, Component, Component)
- **static** Component render(String)
- **static** Component render(ServerOperator, Object, String)
- **static** List<Component> render(CommandSender, Object, List<String>, Replace)
- **static** List<Component> render(CommandSender, Object, List<String>)
- **static** Component render(CommandSender, Object, String, Replace)
- **static** Component renderWithPAPI(Object, Object, String)

## Package: net.advancedplugins.chat.variables

### Class: net.advancedplugins.chat.variables.CustomVariable
Type: Class

Methods:
- String getFallbackValue()
- String getValue()
- String getVariableFormatted()
- VariableType getType()
- String parseChatMessage(String, Player, Event)
- VariablesHandler getHandler()
- String getHover()
- String getVariable()

### Class: net.advancedplugins.chat.variables.ItemAsStringParser
Type: Class

Methods:
- **static** List<String> parseItem(ItemStack)

### Class: net.advancedplugins.chat.variables.VariableType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CHAT_MESSAGE
- PLACEHOLDER

Methods:
- String getStart()
- **static** VariableType valueOf(String)
- **static** VariableType[] values()
- String getEnd()

### Class: net.advancedplugins.chat.variables.VariablesHandler
Type: Class

Methods:
- void reload()
- ScriptEngine getEngine()
- String parseChatMessage(String, Player, Event)
- HashMap<String, CustomVariable> getVariableMap()
- void register(JavaPlugin, CustomVariable)

## Package: net.kyori.adventure.audience

### Class: net.kyori.adventure.audience.Audience
Type: Interface
Implements: net.kyori.adventure.pointer.Pointered

Methods:
- void sendPlayerListHeader(ComponentLike)
- void sendPlayerListHeader(Component)
- V forEachAudience(Consumer<Audience>)
- void removeResourcePacks(ResourcePackRequestLike)
- void removeResourcePacks(ResourcePackRequest)
- void removeResourcePacks(ResourcePackInfoLike, ResourcePackInfoLike[])
- V removeResourcePacks(Iterable<UUID>)
- void removeResourcePacks(UUID, UUID[])
- **static** Audience audience(Audience[])
- **static** ForwardingAudience audience(Iterable<Audience>)
- void sendResourcePacks(ResourcePackInfoLike, ResourcePackInfoLike[])
- void sendResourcePacks(ResourcePackRequestLike)
- void sendResourcePacks(ResourcePackRequest)
- V sendTitlePart(TitlePart<TT>, T)
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
- **static** Collector<Audience, ForwardingAudience> toAudience()
- void hideBossBar(BossBar)
- **static** Audience empty()
- void openBook(Book$Builder)
- void openBook(Book)
- void showBossBar(BossBar)
- void clearResourcePacks()
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
- Audience filterAudience(Predicate<Audience>)

### Class: net.kyori.adventure.audience.ForwardingAudience
Type: Interface
Implements: net.kyori.adventure.audience.Audience

Methods:
- void sendPlayerListHeader(Component)
- V forEachAudience(Consumer<Audience>)
- V removeResourcePacks(Iterable<UUID>)
- void removeResourcePacks(UUID, UUID[])
- void sendResourcePacks(ResourcePackRequest)
- V sendTitlePart(TitlePart<TT>, T)
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
- void clearResourcePacks()
- void stopSound(SoundStop)
- void playSound(Sound)
- void playSound(Sound, double, double, double)
- void playSound(Sound, Sound$Emitter)
- void clearTitle()
- Iterable<Audience> audiences()
- void resetTitle()
- Pointers pointers()
- void sendPlayerListFooter(Component)
- void sendActionBar(Component)
- Audience filterAudience(Predicate<Audience>)

### Class: net.kyori.adventure.audience.ForwardingAudience$Single
Type: Interface
Implements: net.kyori.adventure.audience.ForwardingAudience

Methods:
- void sendPlayerListHeader(Component)
- V forEachAudience(Consumer<Audience>)
- V removeResourcePacks(Iterable<UUID>)
- void removeResourcePacks(UUID, UUID[])
- Audience audience()
- TT getOrDefault(Pointer<TT>, T)
- void sendResourcePacks(ResourcePackRequest)
- V sendTitlePart(TitlePart<TT>, T)
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
- void clearResourcePacks()
- TT getOrDefaultFrom(Pointer<TT>, Supplier<+TT>)
- void stopSound(SoundStop)
- void playSound(Sound)
- void playSound(Sound, double, double, double)
- void playSound(Sound, Sound$Emitter)
- Optional<TT> get(Pointer<TT>)
- void clearTitle()
- Iterable<Audience> audiences()
- void resetTitle()
- Pointers pointers()
- void sendPlayerListFooter(Component)
- void sendActionBar(Component)
- Audience filterAudience(Predicate<Audience>)

### Class: net.kyori.adventure.audience.Audiences
Type: Class

Methods:
- **static** Consumer<Audience> sendingMessage(ComponentLike)

### Class: net.kyori.adventure.audience.MessageType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CHAT
- SYSTEM

Methods:
- **static** MessageType valueOf(String)
- **static** MessageType[] values()

## Package: net.kyori.adventure.bossbar

### Class: net.kyori.adventure.bossbar.BossBar
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- boolean hasFlag(BossBar$Flag)
- BossBar removeFlag(BossBar$Flag)
- BossBar$Overlay overlay()
- BossBar overlay(BossBar$Overlay)
- BossBar$Color color()
- BossBar color(BossBar$Color)
- Set<BossBar$Flag> flags()
- BossBar flags(Set<BossBar$Flag>)
- BossBar removeViewer(Audience)
- BossBar removeListener(BossBar$Listener)
- float percent()
- BossBar percent(float)
- BossBar addFlag(BossBar$Flag)
- **static** BossBar bossBar(ComponentLike, float, BossBar$Color, BossBar$Overlay)
- **static** BossBar bossBar(Component, float, BossBar$Color, BossBar$Overlay)
- **static** BossBar bossBar(ComponentLike, float, BossBar$Color, BossBar$Overlay, Set<BossBar$Flag>)
- **static** BossBar bossBar(Component, float, BossBar$Color, BossBar$Overlay, Set<BossBar$Flag>)
- Iterable<BossBarViewer> viewers()
- BossBar addFlags(BossBar$Flag[])
- BossBar addFlags(Iterable<BossBar$Flag>)
- Component name()
- BossBar name(ComponentLike)
- BossBar name(Component)
- BossBar addViewer(Audience)
- float progress()
- BossBar progress(float)
- BossBar addListener(BossBar$Listener)
- BossBar removeFlags(BossBar$Flag[])
- BossBar removeFlags(Iterable<BossBar$Flag>)

### Class: net.kyori.adventure.bossbar.BossBar$Listener
Type: Interface

Methods:
- void bossBarNameChanged(BossBar, Component, Component)
- void bossBarProgressChanged(BossBar, float, float)
- void bossBarOverlayChanged(BossBar, BossBar$Overlay, BossBar$Overlay)
- void bossBarPercentChanged(BossBar, float, float)
- V bossBarFlagsChanged(BossBar, Set<BossBar$Flag>, Set<BossBar$Flag>)
- void bossBarColorChanged(BossBar, BossBar$Color, BossBar$Color)

### Class: net.kyori.adventure.bossbar.BossBarImplementation
Type: Interface

Methods:
- Iterable<BossBarViewer> viewers()
- **static** TI get(BossBar, Class<TI>)

### Class: net.kyori.adventure.bossbar.BossBarImplementation$Provider
Type: Interface

Methods:
- BossBarImplementation create(BossBar)

### Class: net.kyori.adventure.bossbar.BossBarViewer
Type: Interface

Methods:
- Iterable<BossBar> activeBossBars()

### Class: net.kyori.adventure.bossbar.BossBar$Color
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PINK
- BLUE
- RED
- GREEN
- YELLOW
- PURPLE
- WHITE

Methods:
- **static** BossBar$Color valueOf(String)
- **static** BossBar$Color[] values()

### Class: net.kyori.adventure.bossbar.BossBar$Flag
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DARKEN_SCREEN
- PLAY_BOSS_MUSIC
- CREATE_WORLD_FOG

Methods:
- **static** BossBar$Flag valueOf(String)
- **static** BossBar$Flag[] values()

### Class: net.kyori.adventure.bossbar.BossBar$Overlay
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PROGRESS
- NOTCHED_6
- NOTCHED_10
- NOTCHED_12
- NOTCHED_20

Methods:
- **static** BossBar$Overlay valueOf(String)
- **static** BossBar$Overlay[] values()

## Package: net.kyori.adventure.builder

### Class: net.kyori.adventure.builder.AbstractBuilder
Type: Interface

Methods:
- **static** TR configureAndBuild(T, byte)
- TR build()

## Package: net.kyori.adventure.chat

### Class: net.kyori.adventure.chat.ChatType
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.key.Keyed

Methods:
- ChatType$Bound bind(ComponentLike)
- ChatType$Bound bind(ComponentLike, ComponentLike)
- Stream<ExaminableProperty> examinableProperties()
- **static** ChatType chatType(Keyed)

### Class: net.kyori.adventure.chat.ChatType$Bound
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- Component name()
- Stream<ExaminableProperty> examinableProperties()
- ChatType type()
- Component target()

### Class: net.kyori.adventure.chat.SignedMessage
Type: Interface
Implements: net.kyori.adventure.identity.Identified, net.kyori.examination.Examinable

Methods:
- boolean isSystem()
- Component unsignedContent()
- long salt()
- **static** SignedMessage system(String, ComponentLike)
- **static** SignedMessage$Signature signature(byte[])
- SignedMessage$Signature signature()
- boolean canDelete()
- Stream<ExaminableProperty> examinableProperties()
- String message()
- Instant timestamp()

### Class: net.kyori.adventure.chat.SignedMessage$Signature
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- byte[] bytes()
- Stream<ExaminableProperty> examinableProperties()

## Package: net.kyori.adventure.identity

### Class: net.kyori.adventure.identity.Identified
Type: Interface

Methods:
- Identity identity()

### Class: net.kyori.adventure.identity.Identity
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.identity.Identified

Methods:
- **static** Identity nil()
- **static** Identity identity(UUID)
- Identity identity()
- Stream<ExaminableProperty> examinableProperties()
- UUID uuid()

## Package: net.kyori.adventure.internal

### Class: net.kyori.adventure.internal.Internals
Type: Class

Methods:
- **static** String toString(Examinable)

## Package: net.kyori.adventure.internal.properties

### Class: net.kyori.adventure.internal.properties.AdventureProperties$Property
Type: Interface

Methods:
- TT value()

### Class: net.kyori.adventure.internal.properties.AdventureProperties
Type: Class

Methods:
- **static** AdventureProperties$Property<TT> property(String, Function<String, TT>, T)

## Package: net.kyori.adventure.inventory

### Class: net.kyori.adventure.inventory.Book
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable

Methods:
- Book$Builder toBuilder()
- Buildable$Builder toBuilder()
- List<Component> pages()
- Book pages(Component[])
- Book pages(List<Component>)
- Component author()
- Book author(Component)
- **static** Book book(Component, Component, Collection<Component>)
- **static** Book book(Component, Component, Component[])
- **static** Book$Builder builder()
- Component title()
- Book title(Component)

### Class: net.kyori.adventure.inventory.Book$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- Book$Builder pages(Component[])
- Book$Builder pages(Collection<Component>)
- Book build()
- Object build()
- Book$Builder author(Component)
- Book$Builder addPage(Component)
- Book$Builder title(Component)

## Package: net.kyori.adventure.key

### Class: net.kyori.adventure.key.Key
Type: Interface
Implements: java.lang.Comparable, net.kyori.examination.Examinable, net.kyori.adventure.key.Namespaced, net.kyori.adventure.key.Keyed

Methods:
- **static** boolean parseableValue(String)
- **static** boolean allowedInNamespace(char)
- **static** boolean parseableNamespace(String)
- int compareTo(Key)
- int compareTo(Object)
- **static** boolean allowedInValue(char)
- **static** boolean parseable(String)
- **static** Comparator<Key> comparator()
- String namespace()
- **static** OptionalInt checkValue(String)
- Stream<ExaminableProperty> examinableProperties()
- String asString()
- String value()
- **static** OptionalInt checkNamespace(String)
- **static** Key key(String)
- **static** Key key(String, char)
- **static** Key key(Namespaced, String)
- **static** Key key(String, String)
- Key key()
- String asMinimalString()

### Class: net.kyori.adventure.key.KeyPattern
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.kyori.adventure.key.KeyPattern$Namespace
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.kyori.adventure.key.KeyPattern$Value
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.kyori.adventure.key.Keyed
Type: Interface

Methods:
- Key key()

### Class: net.kyori.adventure.key.Namespaced
Type: Interface

Methods:
- String namespace()

### Class: net.kyori.adventure.key.InvalidKeyException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- String keyValue()
- String keyNamespace()

## Package: net.kyori.adventure.nbt

### Class: net.kyori.adventure.nbt.ArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- BinaryTagType<ArrayBinaryTag> type()

### Class: net.kyori.adventure.nbt.BinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTagLike, net.kyori.examination.Examinable

Methods:
- BinaryTag asBinaryTag()
- BinaryTagType<BinaryTag> type()

### Class: net.kyori.adventure.nbt.BinaryTagIO$Reader
Type: Interface

Methods:
- CompoundBinaryTag read(Path) throws IOException
- CompoundBinaryTag read(Path, BinaryTagIO$Compression) throws IOException
- CompoundBinaryTag read(InputStream) throws IOException
- CompoundBinaryTag read(InputStream, BinaryTagIO$Compression) throws IOException
- CompoundBinaryTag read(DataInput) throws IOException
- CompoundBinaryTag readNameless(Path) throws IOException
- CompoundBinaryTag readNameless(Path, BinaryTagIO$Compression) throws IOException
- CompoundBinaryTag readNameless(InputStream) throws IOException
- CompoundBinaryTag readNameless(InputStream, BinaryTagIO$Compression) throws IOException
- CompoundBinaryTag readNameless(DataInput) throws IOException
- Map$Entry<String, CompoundBinaryTag> readNamed(Path) throws IOException
- Map$Entry<String, CompoundBinaryTag> readNamed(Path, BinaryTagIO$Compression) throws IOException
- Map$Entry<String, CompoundBinaryTag> readNamed(InputStream) throws IOException
- Map$Entry<String, CompoundBinaryTag> readNamed(InputStream, BinaryTagIO$Compression) throws IOException
- Map$Entry<String, CompoundBinaryTag> readNamed(DataInput) throws IOException

### Class: net.kyori.adventure.nbt.BinaryTagIO$Writer
Type: Interface

Methods:
- void writeNameless(CompoundBinaryTag, Path) throws IOException
- void writeNameless(CompoundBinaryTag, Path, BinaryTagIO$Compression) throws IOException
- void writeNameless(CompoundBinaryTag, OutputStream) throws IOException
- void writeNameless(CompoundBinaryTag, OutputStream, BinaryTagIO$Compression) throws IOException
- void writeNameless(CompoundBinaryTag, DataOutput) throws IOException
- V writeNamed(Map$Entry<String, CompoundBinaryTag>, Path) throws IOException
- V writeNamed(Map$Entry<String, CompoundBinaryTag>, Path, BinaryTagIO$Compression) throws IOException
- V writeNamed(Map$Entry<String, CompoundBinaryTag>, OutputStream) throws IOException
- V writeNamed(Map$Entry<String, CompoundBinaryTag>, OutputStream, BinaryTagIO$Compression) throws IOException
- V writeNamed(Map$Entry<String, CompoundBinaryTag>, DataOutput) throws IOException
- void write(CompoundBinaryTag, Path) throws IOException
- void write(CompoundBinaryTag, Path, BinaryTagIO$Compression) throws IOException
- void write(CompoundBinaryTag, OutputStream) throws IOException
- void write(CompoundBinaryTag, OutputStream, BinaryTagIO$Compression) throws IOException
- void write(CompoundBinaryTag, DataOutput) throws IOException

### Class: net.kyori.adventure.nbt.BinaryTagLike
Type: Interface

Methods:
- BinaryTag asBinaryTag()

### Class: net.kyori.adventure.nbt.ByteArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- int size()
- byte get(int)
- **static** ByteArrayBinaryTag of(byte[])
- **static** ByteArrayBinaryTag byteArrayBinaryTag(byte[])
- BinaryTagType<ByteArrayBinaryTag> type()
- byte[] value()

### Class: net.kyori.adventure.nbt.ByteBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** ByteBinaryTag of(byte)
- BinaryTagType<ByteBinaryTag> type()
- byte value()
- **static** ByteBinaryTag byteBinaryTag(byte)

### Class: net.kyori.adventure.nbt.CompoundBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag, net.kyori.adventure.nbt.CompoundTagSetter, java.lang.Iterable

Methods:
- CompoundBinaryTag getCompound(String)
- CompoundBinaryTag getCompound(String, CompoundBinaryTag)
- **static** Collector<Map$Entry<String, BinaryTag>, CompoundBinaryTag> toCompoundTag()
- **static** Collector<TT, CompoundBinaryTag> toCompoundTag(Function<TT, String>, Function<TT, BinaryTag>)
- **static** Collector<Map$Entry<String, BinaryTag>, CompoundBinaryTag> toCompoundTag(CompoundBinaryTag)
- **static** Collector<TT, CompoundBinaryTag> toCompoundTag(CompoundBinaryTag, Function<TT, String>, Function<TT, BinaryTag>)
- byte getByte(String)
- byte getByte(String, byte)
- short getShort(String)
- short getShort(String, short)
- boolean isEmpty()
- double getDouble(String)
- double getDouble(String, double)
- String getString(String)
- String getString(String, String)
- float getFloat(String)
- float getFloat(String, float)
- BinaryTagType<CompoundBinaryTag> type()
- long[] getLongArray(String)
- long[] getLongArray(String, long[])
- **static** CompoundBinaryTag empty()
- long getLong(String)
- long getLong(String, long)
- int getInt(String)
- int getInt(String, int)
- int size()
- Stream<Map$Entry<String, BinaryTag>> stream()
- ListBinaryTag getList(String)
- ListBinaryTag getList(String, ListBinaryTag)
- ListBinaryTag getList(String, BinaryTagType<BinaryTag>)
- ListBinaryTag getList(String, BinaryTagType<BinaryTag>, ListBinaryTag)
- BinaryTag get(String)
- byte[] getByteArray(String)
- byte[] getByteArray(String, byte[])
- **static** CompoundBinaryTag$Builder builder()
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- **static** CompoundBinaryTag from(Map<String, BinaryTag>)
- Set<String> keySet()
- int[] getIntArray(String)
- int[] getIntArray(String, int[])

### Class: net.kyori.adventure.nbt.CompoundBinaryTag$Builder
Type: Interface
Implements: net.kyori.adventure.nbt.CompoundTagSetter

Methods:
- CompoundBinaryTag build()

### Class: net.kyori.adventure.nbt.CompoundTagSetter
Type: Interface

Methods:
- TR putFloat(String, float)
- TR putByte(String, byte)
- TR putInt(String, int)
- TR putString(String, String)
- TR putIntArray(String, [I)
- TR putDouble(String, double)
- TR putLongArray(String, [J)
- TR putLong(String, long)
- TR putShort(String, short)
- TR putBoolean(String, boolean)
- TR remove(String)
- TR remove(String, Consumer<BinaryTag>)
- TR put(String, BinaryTag)
- TR put(CompoundBinaryTag)
- TR put(Map<String, BinaryTag>)
- TR putByteArray(String, [B)

### Class: net.kyori.adventure.nbt.DoubleBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** DoubleBinaryTag doubleBinaryTag(double)
- **static** DoubleBinaryTag of(double)
- BinaryTagType<DoubleBinaryTag> type()
- double value()

### Class: net.kyori.adventure.nbt.EndBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- **static** EndBinaryTag endBinaryTag()
- **static** EndBinaryTag get()
- BinaryTagType<EndBinaryTag> type()

### Class: net.kyori.adventure.nbt.FloatBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** FloatBinaryTag floatBinaryTag(float)
- **static** FloatBinaryTag of(float)
- BinaryTagType<FloatBinaryTag> type()
- float value()

### Class: net.kyori.adventure.nbt.IntArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- PrimitiveIterator$OfInt iterator()
- Iterator iterator()
- int size()
- IntStream stream()
- Spliterator$OfInt spliterator()
- Spliterator spliterator()
- **static** IntArrayBinaryTag intArrayBinaryTag(int[])
- int get(int)
- **static** IntArrayBinaryTag of(int[])
- void forEachInt(IntConsumer)
- BinaryTagType<IntArrayBinaryTag> type()
- int[] value()

### Class: net.kyori.adventure.nbt.IntBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** IntBinaryTag intBinaryTag(int)
- **static** IntBinaryTag of(int)
- BinaryTagType<IntBinaryTag> type()
- int value()

### Class: net.kyori.adventure.nbt.ListBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ListTagSetter, net.kyori.adventure.nbt.BinaryTag, java.lang.Iterable

Methods:
- CompoundBinaryTag getCompound(int)
- CompoundBinaryTag getCompound(int, CompoundBinaryTag)
- **static** ListBinaryTag listBinaryTag(BinaryTagType<BinaryTag>, List<BinaryTag>)
- byte getByte(int)
- byte getByte(int, byte)
- ListBinaryTag unwrapHeterogeneity()
- double getDouble(int)
- double getDouble(int, double)
- float getFloat(int)
- float getFloat(int, float)
- BinaryTagType<ListBinaryTag> type()
- BinaryTagType<BinaryTag> listType()
- ListBinaryTag remove(int, Consumer<BinaryTag>)
- **static** ListBinaryTag empty()
- **static** Collector<BinaryTag, ListBinaryTag> toListTag()
- **static** Collector<BinaryTag, ListBinaryTag> toListTag(ListBinaryTag)
- Stream<BinaryTag> stream()
- ListBinaryTag getList(int)
- ListBinaryTag getList(int, BinaryTagType<*>)
- ListBinaryTag getList(int, ListBinaryTag)
- ListBinaryTag getList(int, BinaryTagType<*>, ListBinaryTag)
- BinaryTag get(int)
- **static** ListBinaryTag of(BinaryTagType<BinaryTag>, List<BinaryTag>)
- **static** ListBinaryTag$Builder<BinaryTag> builder()
- **static** ListBinaryTag$Builder<TT> builder(BinaryTagType<TT>)
- **static** ListBinaryTag from(Iterable<BinaryTag>)
- ListBinaryTag set(int, BinaryTag, Consumer<BinaryTag>)
- short getShort(int)
- short getShort(int, short)
- **static** ListBinaryTag$Builder<BinaryTag> heterogeneousListBinaryTag()
- boolean isEmpty()
- String getString(int)
- String getString(int, String)
- long[] getLongArray(int)
- long[] getLongArray(int, long[])
- long getLong(int)
- long getLong(int, long)
- ListBinaryTag wrapHeterogeneity()
- int getInt(int)
- int getInt(int, int)
- int size()
- byte[] getByteArray(int)
- byte[] getByteArray(int, byte[])
- BinaryTagType<BinaryTag> elementType()
- int[] getIntArray(int)
- int[] getIntArray(int, int[])

### Class: net.kyori.adventure.nbt.ListBinaryTag$Builder
Type: Interface
Implements: net.kyori.adventure.nbt.ListTagSetter

Methods:
- ListBinaryTag build()

### Class: net.kyori.adventure.nbt.ListTagSetter
Type: Interface

Methods:
- TR add(T)
- TR add(Iterable<+TT>)

### Class: net.kyori.adventure.nbt.LongArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- **static** LongArrayBinaryTag longArrayBinaryTag(long[])
- PrimitiveIterator$OfLong iterator()
- Iterator iterator()
- int size()
- LongStream stream()
- Spliterator$OfLong spliterator()
- Spliterator spliterator()
- long get(int)
- **static** LongArrayBinaryTag of(long[])
- BinaryTagType<LongArrayBinaryTag> type()
- void forEachLong(LongConsumer)
- long[] value()

### Class: net.kyori.adventure.nbt.LongBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** LongBinaryTag of(long)
- BinaryTagType<LongBinaryTag> type()
- **static** LongBinaryTag longBinaryTag(long)
- long value()

### Class: net.kyori.adventure.nbt.NumberBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- int intValue()
- float floatValue()
- short shortValue()
- Number numberValue()
- double doubleValue()
- BinaryTagType<NumberBinaryTag> type()
- long longValue()
- byte byteValue()

### Class: net.kyori.adventure.nbt.ShortBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** ShortBinaryTag of(short)
- **static** ShortBinaryTag shortBinaryTag(short)
- BinaryTagType<ShortBinaryTag> type()
- short value()

### Class: net.kyori.adventure.nbt.StringBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- **static** StringBinaryTag stringBinaryTag(String)
- **static** StringBinaryTag of(String)
- BinaryTagType<StringBinaryTag> type()
- String value()

### Class: net.kyori.adventure.nbt.BinaryTagIO
Type: Class

Methods:
- **static** void writeCompressedPath(CompoundBinaryTag, Path)
- **static** void writeOutputStream(CompoundBinaryTag, OutputStream)
- **static** CompoundBinaryTag readCompressedInputStream(InputStream)
- **static** CompoundBinaryTag readPath(Path)
- **static** BinaryTagIO$Reader reader()
- **static** BinaryTagIO$Reader reader(long)
- **static** CompoundBinaryTag readCompressedPath(Path)
- **static** CompoundBinaryTag readInputStream(InputStream)
- **static** void writeCompressedOutputStream(CompoundBinaryTag, OutputStream)
- **static** BinaryTagIO$Writer writer()
- **static** CompoundBinaryTag readDataInput(DataInput)
- **static** BinaryTagIO$Reader unlimitedReader()
- **static** void writeDataOutput(CompoundBinaryTag, DataOutput)
- **static** void writePath(CompoundBinaryTag, Path)

### Class: net.kyori.adventure.nbt.BinaryTagIO$Compression
Type: Abstract Class

No public methods found

### Class: net.kyori.adventure.nbt.BinaryTagScope$NoOp
Type: Class
Implements: net.kyori.adventure.nbt.BinaryTagScope

Methods:
- void close()

### Class: net.kyori.adventure.nbt.BinaryTagType
Type: Abstract Class
Implements: java.util.function.Predicate

Methods:
- TT read(DataInput)
- Z test(BinaryTagType<BinaryTag>)
- boolean test(Object)
- byte id()
- V write(T, T)

### Class: net.kyori.adventure.nbt.BinaryTagTypes
Type: Class

No public methods found

### Class: net.kyori.adventure.nbt.TagStringIO
Type: Class

Methods:
- void toWriter(CompoundBinaryTag, Writer)
- **static** TagStringIO get()
- **static** TagStringIO$Builder builder()
- String asString(CompoundBinaryTag)
- String asString(BinaryTag)
- CompoundBinaryTag asCompound(String)

### Class: net.kyori.adventure.nbt.TagStringIO$Builder
Type: Class

Methods:
- TagStringIO build()
- TagStringIO$Builder indent(int)
- TagStringIO$Builder indentTab(int)
- TagStringIO$Builder emitLegacy(boolean)
- TagStringIO$Builder acceptLegacy(boolean)

## Package: net.kyori.adventure.nbt.api

### Class: net.kyori.adventure.nbt.api.BinaryTagHolder
Type: Interface
Implements: net.kyori.adventure.text.event.DataComponentValue$TagSerializable

Methods:
- BinaryTagHolder asBinaryTag()
- **static** BinaryTagHolder^TEX encode(T, T) throws Exception
- **static** BinaryTagHolder binaryTagHolder(String)
- String string()
- TT^TDX get(Codec<TT, String, TDX, *>) throws Exception
- **static** BinaryTagHolder of(String)

## Package: net.kyori.adventure.permission

### Class: net.kyori.adventure.permission.PermissionChecker
Type: Interface
Implements: java.util.function.Predicate

Methods:
- **static** PermissionChecker always(TriState)
- boolean test(String)
- boolean test(Object)
- TriState value(String)

## Package: net.kyori.adventure.platform

### Class: net.kyori.adventure.platform.AudienceProvider
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

### Class: net.kyori.adventure.platform.AudienceProvider$Builder
Type: Interface

Methods:
- TB componentRenderer(ComponentRenderer<Pointered>)
- TB componentRenderer(Function<Pointered, TT>, ComponentRenderer<TT>)
- TB partition(Function<Pointered, *>)
- TP build()

## Package: net.kyori.adventure.platform.bukkit

### Class: net.kyori.adventure.platform.bukkit.BukkitAudiences
Type: Interface
Implements: net.kyori.adventure.platform.AudienceProvider

Methods:
- Audience filter(Predicate<CommandSender>)
- Audience sender(CommandSender)
- **static** BukkitAudiences$Builder builder(Plugin)
- **static** BukkitAudiences create(Plugin)
- **static** Sound$Emitter asEmitter(Entity)
- Audience player(Player)

### Class: net.kyori.adventure.platform.bukkit.BukkitAudiences$Builder
Type: Interface
Implements: net.kyori.adventure.platform.AudienceProvider$Builder

No public methods found

### Class: net.kyori.adventure.platform.bukkit.BukkitComponentSerializer
Type: Class

Methods:
- **static** LegacyComponentSerializer legacy()
- **static** GsonComponentSerializer gson()

### Class: net.kyori.adventure.platform.bukkit.CraftBukkitFacet$AbstractBook
Type: Abstract Class
Extends: net.kyori.adventure.platform.bukkit.CraftBukkitFacet$PacketFacet
Implements: net.kyori.adventure.platform.facet.Facet$Book

Methods:
- void openBook(Player, ItemStack)
- void openBook(Object, Object)
- ItemStack createBook(String, String, Iterable<Object>)
- Object createBook(String, String, Iterable)
- String createMessage(Player, Component)
- Object createMessage(CommandSender, Component)
- Object createMessage(Object, Component)
- boolean isSupported()

### Class: net.kyori.adventure.platform.bukkit.CraftBukkitFacet$BossBar$Builder
Type: Class
Extends: net.kyori.adventure.platform.bukkit.CraftBukkitFacet
Implements: net.kyori.adventure.platform.facet.Facet$BossBar$Builder

Methods:
- CraftBukkitFacet$BossBar createBossBar(Collection<Player>)
- Facet$BossBar createBossBar(Collection)
- boolean isSupported()

### Class: net.kyori.adventure.platform.bukkit.CraftBukkitFacet$BossBarWither$Builder
Type: Class
Extends: net.kyori.adventure.platform.bukkit.CraftBukkitFacet
Implements: net.kyori.adventure.platform.facet.Facet$BossBar$Builder

Methods:
- CraftBukkitFacet$BossBarWither createBossBar(Collection<Player>)
- Facet$BossBar createBossBar(Collection)
- boolean isSupported()

### Class: net.kyori.adventure.platform.bukkit.MinecraftComponentSerializer
Type: Class
Implements: net.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- Object serialize(Component)
- **static** MinecraftComponentSerializer get()
- **static** boolean isSupported()
- Component deserialize(Object)

## Package: net.kyori.adventure.platform.facet

### Class: net.kyori.adventure.platform.facet.Facet
Type: Interface

Methods:
- **static** Collection<TF> of(Supplier<TF>)
- **static** TF of(Collection<TF>, T)
- Z isApplicable(T)
- boolean isSupported()

### Class: net.kyori.adventure.platform.facet.Facet$ActionBar
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet$Message

Methods:
- V sendMessage(T, void)

### Class: net.kyori.adventure.platform.facet.Facet$Book
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet$Message

Methods:
- V openBook(T, void)
- TB createBook(String, String, Iterable<TM>)

### Class: net.kyori.adventure.platform.facet.Facet$BossBar
Type: Interface
Implements: net.kyori.adventure.bossbar.BossBar$Listener, java.io.Closeable

Methods:
- void bossBarInitialized(BossBar)
- boolean isEmpty()
- V removeViewer(T)
- V addViewer(T)
- void close()

### Class: net.kyori.adventure.platform.facet.Facet$BossBar$Builder
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet

Methods:
- TB createBossBar(Collection<TV>)

### Class: net.kyori.adventure.platform.facet.Facet$BossBarEntity
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet$BossBar, net.kyori.adventure.platform.facet.Facet$FakeEntity

Methods:
- void bossBarNameChanged(BossBar, Component, Component)
- void bossBarProgressChanged(BossBar, float, float)
- V removeViewer(T)
- V addViewer(T)

### Class: net.kyori.adventure.platform.facet.Facet$BossBarPacket
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet$BossBar

Methods:
- int createColor(BossBar$Color)
- B createFlag(byte, Set<BossBar$Flag>, Set<BossBar$Flag>)
- int createOverlay(BossBar$Overlay)

### Class: net.kyori.adventure.platform.facet.Facet$Chat
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet$Message

Methods:
- V sendMessage(T, void, ;, Identity)

### Class: net.kyori.adventure.platform.facet.Facet$ChatPacket
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet$Chat

Methods:
- byte createMessageType(MessageType)

### Class: net.kyori.adventure.platform.facet.Facet$EntitySound
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet

Methods:
- TM createForEmitter(Sound, Sound$Emitter)
- TM createForSelf(T, void)
- V playSound(T, void)

### Class: net.kyori.adventure.platform.facet.Facet$FakeEntity
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet$Position, java.io.Closeable

Methods:
- void metadata(int, Object)
- V teleport(T, void)
- void name(Component)
- void health(float)
- void invisible(boolean)
- void close()

### Class: net.kyori.adventure.platform.facet.Facet$Message
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet

Methods:
- TM createMessage(T, void)

### Class: net.kyori.adventure.platform.facet.Facet$Pointers
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet

Methods:
- V contributePointers(T, void)

### Class: net.kyori.adventure.platform.facet.Facet$Position
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet

Methods:
- TP createPosition(T)
- TP createPosition(double, double, double)

### Class: net.kyori.adventure.platform.facet.Facet$Sound
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet$Position

Methods:
- V stopSound(T, void)
- V playSound(T, void, ;)

### Class: net.kyori.adventure.platform.facet.Facet$TabList
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet$Message

Methods:
- V send(T, void, ;)

### Class: net.kyori.adventure.platform.facet.Facet$Title
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet$Message

Methods:
- V contributeSubtitle(T, char)
- int toTicks(Duration)
- V showTitle(T, void)
- V clearTitle(T)
- TT completeTitle(T)
- V contributeTimes(T, char, ;, int)
- V contributeTitle(T, char)
- TC createTitleCollection()
- V resetTitle(T)

### Class: net.kyori.adventure.platform.facet.Facet$TitlePacket
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet$Title

No public methods found

### Class: net.kyori.adventure.platform.facet.FacetComponentFlattener$Translator
Type: Interface
Implements: net.kyori.adventure.platform.facet.Facet

Methods:
- String valueOrDefault(T, void)

### Class: net.kyori.adventure.platform.facet.FacetAudience
Type: Class
Implements: net.kyori.adventure.audience.Audience, java.io.Closeable

Methods:
- void sendPlayerListHeader(Component)
- V sendTitlePart(TitlePart<TT>, T)
- void sendMessage(Identity, Component, MessageType)
- void sendMessage(Component, ChatType$Bound)
- void sendMessage(SignedMessage, ChatType$Bound)
- void refresh()
- V removeViewer(T)
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
- V addViewer(T)
- void close()
- void resetTitle()
- Pointers pointers()
- void sendPlayerListFooter(Component)
- void sendActionBar(Component)

### Class: net.kyori.adventure.platform.facet.FacetAudienceProvider
Type: Abstract Class
Implements: net.kyori.adventure.platform.AudienceProvider, net.kyori.adventure.audience.ForwardingAudience

Methods:
- Audience filter(Predicate<TV>)
- Audience all()
- Audience server(String)
- Audience console()
- Audience world(Key)
- V refreshViewer(T)
- Audience players()
- Iterable<Audience> audiences()
- V removeViewer(T)
- V addViewer(T)
- Audience permission(String)
- void close()
- Audience player(UUID)

### Class: net.kyori.adventure.platform.facet.FacetBase
Type: Abstract Class
Implements: net.kyori.adventure.platform.facet.Facet

Methods:
- Z isApplicable(T)
- boolean isSupported()

### Class: net.kyori.adventure.platform.facet.FacetComponentFlattener
Type: Class

Methods:
- **static** ComponentFlattener get(T, void)

### Class: net.kyori.adventure.platform.facet.FacetPointers
Type: Class

No public methods found

### Class: net.kyori.adventure.platform.facet.FacetPointers$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PLAYER
- CONSOLE
- OTHER

Methods:
- **static** FacetPointers$Type valueOf(String)
- **static** FacetPointers$Type[] values()

### Class: net.kyori.adventure.platform.facet.Knob
Type: Class

Methods:
- **static** void logError(Throwable, String, Object[])
- **static** void logMessage(String, Object[])
- **static** boolean isEnabled(String, boolean)
- **static** void logUnsupported(Object, Object)

## Package: net.kyori.adventure.platform.viaversion

### Class: net.kyori.adventure.platform.viaversion.ViaFacet
Type: Class
Extends: net.kyori.adventure.platform.facet.FacetBase
Implements: net.kyori.adventure.platform.facet.Facet$Message

Methods:
- I findProtocol(T)
- Z isApplicable(T)
- String createMessage(T, void)
- Object createMessage(Object, Component)
- UserConnection findConnection(T)
- boolean isSupported()

### Class: net.kyori.adventure.platform.viaversion.ViaFacet$ActionBar
Type: Class
Extends: net.kyori.adventure.platform.viaversion.ViaFacet$Chat
Implements: net.kyori.adventure.platform.facet.Facet$ActionBar

Methods:
- byte createMessageType(MessageType)
- V sendMessage(T, void)
- void sendMessage(Object, Object)

### Class: net.kyori.adventure.platform.viaversion.ViaFacet$ActionBarTitle
Type: Class
Extends: net.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Implements: net.kyori.adventure.platform.facet.Facet$ActionBar

Methods:
- V sendMessage(T, void)
- void sendMessage(Object, Object)

### Class: net.kyori.adventure.platform.viaversion.ViaFacet$BossBar
Type: Class
Extends: net.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Implements: net.kyori.adventure.platform.facet.Facet$BossBarPacket

Methods:
- void bossBarInitialized(BossBar)
- void bossBarNameChanged(BossBar, Component, Component)
- void broadcastPacket(int)
- void bossBarProgressChanged(BossBar, float, float)
- V sendPacket(T, void)
- boolean isEmpty()
- void bossBarOverlayChanged(BossBar, BossBar$Overlay, BossBar$Overlay)
- V removeViewer(T)
- V addViewer(T)
- V bossBarFlagsChanged(BossBar, Set<BossBar$Flag>, Set<BossBar$Flag>)
- void bossBarColorChanged(BossBar, BossBar$Color, BossBar$Color)
- void close()

### Class: net.kyori.adventure.platform.viaversion.ViaFacet$BossBar$Builder
Type: Class
Extends: net.kyori.adventure.platform.viaversion.ViaFacet
Implements: net.kyori.adventure.platform.facet.Facet$BossBar$Builder

Methods:
- Facet$BossBar<TV> createBossBar(Collection<TV>)
- Object createMessage(Object, Component)

### Class: net.kyori.adventure.platform.viaversion.ViaFacet$BossBar$Builder1_9_To_1_15
Type: Class
Extends: net.kyori.adventure.platform.viaversion.ViaFacet
Implements: net.kyori.adventure.platform.facet.Facet$BossBar$Builder

Methods:
- Facet$BossBar<TV> createBossBar(Collection<TV>)
- Object createMessage(Object, Component)

### Class: net.kyori.adventure.platform.viaversion.ViaFacet$Chat
Type: Class
Extends: net.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Implements: net.kyori.adventure.platform.facet.Facet$ChatPacket

Methods:
- V sendMessage(T, void, ;, Identity)
- void sendMessage(Object, Identity, Object, Object)

### Class: net.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Type: Class
Extends: net.kyori.adventure.platform.viaversion.ViaFacet

Methods:
- void sendPacket(PacketWrapper)
- Object createMessage(Object, Component)
- JsonElement parse(String)
- boolean isSupported()
- PacketWrapper createPacket(T)

### Class: net.kyori.adventure.platform.viaversion.ViaFacet$TabList
Type: Class
Extends: net.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Implements: net.kyori.adventure.platform.facet.Facet$TabList

Methods:
- V send(T, void, ;)
- void send(Object, Object, Object)

### Class: net.kyori.adventure.platform.viaversion.ViaFacet$Title
Type: Class
Extends: net.kyori.adventure.platform.viaversion.ViaFacet$ProtocolBased
Implements: net.kyori.adventure.platform.facet.Facet$TitlePacket

Methods:
- V contributeSubtitle(List<Consumer<PacketWrapper>>, String)
- void contributeSubtitle(Object, Object)
- V showTitle(T, void)
- void showTitle(Object, Object)
- V clearTitle(T)
- Consumer<TV> completeTitle(List<Consumer<PacketWrapper>>)
- Object completeTitle(Object)
- V contributeTimes(List<Consumer<PacketWrapper>>, int, int, int)
- void contributeTimes(Object, int, int, int)
- V contributeTitle(List<Consumer<PacketWrapper>>, String)
- void contributeTitle(Object, Object)
- List<Consumer<PacketWrapper>> createTitleCollection()
- Object createTitleCollection()
- V resetTitle(T)

## Package: net.kyori.adventure.pointer

### Class: net.kyori.adventure.pointer.Pointer
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** Pointer<TV> pointer(Class<TV>, Key)
- Stream<ExaminableProperty> examinableProperties()
- Class<TV> type()
- Key key()

### Class: net.kyori.adventure.pointer.Pointered
Type: Interface

Methods:
- TT getOrDefaultFrom(Pointer<TT>, Supplier<+TT>)
- TT getOrDefault(Pointer<TT>, T)
- Optional<TT> get(Pointer<TT>)
- Pointers pointers()

### Class: net.kyori.adventure.pointer.Pointers
Type: Interface
Implements: net.kyori.adventure.util.Buildable

Methods:
- TT getOrDefaultFrom(Pointer<TT>, Supplier<+TT>)
- TT getOrDefault(Pointer<TT>, T)
- Optional<TT> get(Pointer<TT>)
- **static** Pointers$Builder builder()
- Z supports(Pointer<TT>)
- **static** Pointers empty()

### Class: net.kyori.adventure.pointer.Pointers$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- Pointers$Builder withDynamic(Pointer<TT>, Supplier<TT>)
- Pointers$Builder withStatic(Pointer<TT>, T)

## Package: net.kyori.adventure.resource

### Class: net.kyori.adventure.resource.ResourcePackCallback
Type: Interface

Methods:
- **static** ResourcePackCallback noOp()
- void packEventReceived(UUID, ResourcePackStatus, Audience)
- **static** ResourcePackCallback onTerminal(BiConsumer<UUID, Audience>, BiConsumer<UUID, Audience>)

### Class: net.kyori.adventure.resource.ResourcePackInfo
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.resource.ResourcePackInfoLike

Methods:
- **static** ResourcePackInfo resourcePackInfo(UUID, URI, String)
- **static** ResourcePackInfo$Builder resourcePackInfo()
- ResourcePackInfo asResourcePackInfo()
- UUID id()
- URI uri()
- String hash()

### Class: net.kyori.adventure.resource.ResourcePackInfo$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.resource.ResourcePackInfoLike

Methods:
- ResourcePackInfo build()
- Object build()
- ResourcePackInfo asResourcePackInfo()
- ResourcePackInfo$Builder id(UUID)
- ResourcePackInfo$Builder uri(URI)
- CompletableFuture<ResourcePackInfo> computeHashAndBuild()
- CompletableFuture<ResourcePackInfo> computeHashAndBuild(Executor)
- ResourcePackInfo$Builder hash(String)

### Class: net.kyori.adventure.resource.ResourcePackInfoLike
Type: Interface

Methods:
- ResourcePackInfo asResourcePackInfo()

### Class: net.kyori.adventure.resource.ResourcePackRequest
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.resource.ResourcePackRequestLike

Methods:
- boolean replace()
- ResourcePackRequest replace(boolean)
- **static** ResourcePackRequest$Builder resourcePackRequest()
- **static** ResourcePackRequest$Builder resourcePackRequest(ResourcePackRequest)
- ResourcePackCallback callback()
- ResourcePackRequest callback(ResourcePackCallback)
- **static** ResourcePackRequest addingRequest(ResourcePackInfoLike, ResourcePackInfoLike[])
- ResourcePackRequest asResourcePackRequest()
- Component prompt()
- List<ResourcePackInfo> packs()
- ResourcePackRequest packs(Iterable<ResourcePackInfoLike>)
- boolean required()

### Class: net.kyori.adventure.resource.ResourcePackRequest$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.resource.ResourcePackRequestLike

Methods:
- ResourcePackRequest$Builder replace(boolean)
- ResourcePackRequest$Builder callback(ResourcePackCallback)
- ResourcePackRequest asResourcePackRequest()
- ResourcePackRequest$Builder prompt(Component)
- ResourcePackRequest$Builder packs(ResourcePackInfoLike, ResourcePackInfoLike[])
- ResourcePackRequest$Builder packs(Iterable<ResourcePackInfoLike>)
- ResourcePackRequest$Builder required(boolean)

### Class: net.kyori.adventure.resource.ResourcePackRequestLike
Type: Interface

Methods:
- ResourcePackRequest asResourcePackRequest()

### Class: net.kyori.adventure.resource.ResourcePackStatus
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ACCEPTED
- DECLINED
- INVALID_URL
- FAILED_DOWNLOAD
- DOWNLOADED
- FAILED_RELOAD
- DISCARDED
- SUCCESSFULLY_LOADED

Methods:
- **static** ResourcePackStatus valueOf(String)
- **static** ResourcePackStatus[] values()
- boolean intermediate()

## Package: net.kyori.adventure.sound

### Class: net.kyori.adventure.sound.Sound
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- float volume()
- OptionalLong seed()
- SoundStop asStop()
- **static** Sound$Builder sound()
- **static** Sound$Builder sound(Sound)
- **static** Sound sound(Consumer<Sound$Builder>)
- **static** Sound sound(Key, Sound$Source, float, float)
- **static** Sound sound(Sound$Type, Sound$Source, float, float)
- **static** Sound sound(Supplier<Sound$Type>, Sound$Source, float, float)
- **static** Sound sound(Key, Sound$Source$Provider, float, float)
- **static** Sound sound(Sound$Type, Sound$Source$Provider, float, float)
- **static** Sound sound(Supplier<Sound$Type>, Sound$Source$Provider, float, float)
- Key name()
- float pitch()
- Sound$Source source()

### Class: net.kyori.adventure.sound.Sound$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder

Methods:
- Sound$Builder volume(float)
- Sound$Builder seed(long)
- Sound$Builder seed(OptionalLong)
- Sound$Builder pitch(float)
- Sound$Builder source(Sound$Source)
- Sound$Builder source(Sound$Source$Provider)
- Sound$Builder type(Key)
- Sound$Builder type(Sound$Type)
- Sound$Builder type(Supplier<Sound$Type>)

### Class: net.kyori.adventure.sound.Sound$Emitter
Type: Interface

Methods:
- **static** Sound$Emitter self()

### Class: net.kyori.adventure.sound.Sound$Source$Provider
Type: Interface

Methods:
- Sound$Source soundSource()

### Class: net.kyori.adventure.sound.Sound$Type
Type: Interface
Implements: net.kyori.adventure.key.Keyed

Methods:
- Key key()

### Class: net.kyori.adventure.sound.SoundStop
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** SoundStop all()
- **static** SoundStop namedOnSource(Key, Sound$Source)
- **static** SoundStop namedOnSource(Sound$Type, Sound$Source)
- **static** SoundStop namedOnSource(Supplier<Sound$Type>, Sound$Source)
- **static** SoundStop named(Key)
- **static** SoundStop named(Sound$Type)
- **static** SoundStop named(Supplier<Sound$Type>)
- Key sound()
- **static** SoundStop source(Sound$Source)
- Sound$Source source()

### Class: net.kyori.adventure.sound.Sound$Source
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- MASTER
- MUSIC
- RECORD
- WEATHER
- BLOCK
- HOSTILE
- NEUTRAL
- PLAYER
- AMBIENT
- VOICE

Methods:
- **static** Sound$Source valueOf(String)
- **static** Sound$Source[] values()

## Package: net.kyori.adventure.text

### Class: net.kyori.adventure.text.BlockNBTComponent
Type: Interface
Implements: net.kyori.adventure.text.NBTComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- BlockNBTComponent localPos(double, double, double)
- BlockNBTComponent$Pos pos()
- BlockNBTComponent pos(BlockNBTComponent$Pos)
- BlockNBTComponent worldPos(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)
- Stream<ExaminableProperty> examinableProperties()
- BlockNBTComponent relativeWorldPos(int, int, int)
- BlockNBTComponent absoluteWorldPos(int, int, int)

### Class: net.kyori.adventure.text.BlockNBTComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.NBTComponentBuilder

Methods:
- BlockNBTComponent$Builder localPos(double, double, double)
- BlockNBTComponent$Builder pos(BlockNBTComponent$Pos)
- BlockNBTComponent$Builder worldPos(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)
- BlockNBTComponent$Builder relativeWorldPos(int, int, int)
- BlockNBTComponent$Builder absoluteWorldPos(int, int, int)

### Class: net.kyori.adventure.text.BlockNBTComponent$LocalPos
Type: Interface
Implements: net.kyori.adventure.text.BlockNBTComponent$Pos

Methods:
- double forwards()
- **static** BlockNBTComponent$LocalPos localPos(double, double, double)
- double left()
- **static** BlockNBTComponent$LocalPos of(double, double, double)
- double up()

### Class: net.kyori.adventure.text.BlockNBTComponent$Pos
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- String asString()
- **static** BlockNBTComponent$Pos fromString(String) throws IllegalArgumentException

### Class: net.kyori.adventure.text.BlockNBTComponent$WorldPos
Type: Interface
Implements: net.kyori.adventure.text.BlockNBTComponent$Pos

Methods:
- **static** BlockNBTComponent$WorldPos of(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)
- BlockNBTComponent$WorldPos$Coordinate x()
- BlockNBTComponent$WorldPos$Coordinate y()
- BlockNBTComponent$WorldPos$Coordinate z()
- **static** BlockNBTComponent$WorldPos worldPos(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)

### Class: net.kyori.adventure.text.BlockNBTComponent$WorldPos$Coordinate
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** BlockNBTComponent$WorldPos$Coordinate coordinate(int, BlockNBTComponent$WorldPos$Coordinate$Type)
- **static** BlockNBTComponent$WorldPos$Coordinate absolute(int)
- **static** BlockNBTComponent$WorldPos$Coordinate of(int, BlockNBTComponent$WorldPos$Coordinate$Type)
- BlockNBTComponent$WorldPos$Coordinate$Type type()
- int value()
- **static** BlockNBTComponent$WorldPos$Coordinate relative(int)

### Class: net.kyori.adventure.text.BuildableComponent
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.adventure.text.Component

Methods:
- TB toBuilder()
- Buildable$Builder toBuilder()

### Class: net.kyori.adventure.text.Component
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilderApplicable, net.kyori.adventure.text.ComponentLike, net.kyori.examination.Examinable, net.kyori.adventure.text.event.HoverEventSource, net.kyori.adventure.text.format.StyleGetter, net.kyori.adventure.text.format.StyleSetter

Methods:
- Component decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- **static** VirtualComponent virtual(Class<TC>, VirtualComponentRenderer<TC>)
- **static** VirtualComponent virtual(Class<TC>, VirtualComponentRenderer<TC>, Style)
- **static** VirtualComponent virtual(Class<TC>, VirtualComponentRenderer<TC>, StyleBuilderApplicable)
- **static** VirtualComponent virtual(Class<TC>, VirtualComponentRenderer<TC>, Iterable<StyleBuilderApplicable>)
- Component compact()
- TextColor color()
- Component color(TextColor)
- StyleSetter color(TextColor)
- **static** EntityNBTComponent$Builder entityNBT()
- **static** EntityNBTComponent entityNBT(Consumer<EntityNBTComponent$Builder>)
- **static** EntityNBTComponent entityNBT(String, String)
- Component replaceFirstText(String, ComponentLike)
- Component replaceFirstText(Pattern, Function<TextComponent$Builder, ComponentLike>)
- Iterable<Component> iterable(ComponentIteratorType, ComponentIteratorFlag)
- Iterable<Component> iterable(ComponentIteratorType, Set<ComponentIteratorFlag>)
- **static** TextComponent textOfChildren(ComponentLike[])
- Map<TextDecoration, TextDecoration$State> decorations()
- Component decorations(Map<TextDecoration, TextDecoration$State>)
- StyleSetter decorations(Map)
- **static** StorageNBTComponent$Builder storageNBT()
- **static** StorageNBTComponent storageNBT(Consumer<StorageNBTComponent$Builder>)
- **static** StorageNBTComponent storageNBT(String, Key)
- **static** StorageNBTComponent storageNBT(String, boolean, Key)
- **static** StorageNBTComponent storageNBT(String, boolean, ComponentLike, Key)
- Component asComponent()
- **static** TextComponent space()
- Component shadowColorIfAbsent(ARGBLike)
- StyleSetter shadowColorIfAbsent(ARGBLike)
- Component colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- void detectCycle(Component)
- **static** TextComponent empty()
- HoverEvent<*> hoverEvent()
- Component hoverEvent(HoverEventSource<*>)
- StyleSetter hoverEvent(HoverEventSource)
- **static** BlockNBTComponent$Builder blockNBT()
- **static** BlockNBTComponent blockNBT(Consumer<BlockNBTComponent$Builder>)
- **static** BlockNBTComponent blockNBT(String, BlockNBTComponent$Pos)
- **static** BlockNBTComponent blockNBT(String, boolean, BlockNBTComponent$Pos)
- **static** BlockNBTComponent blockNBT(String, boolean, ComponentLike, BlockNBTComponent$Pos)
- **static** ScoreComponent$Builder score()
- **static** ScoreComponent score(Consumer<ScoreComponent$Builder>)
- **static** ScoreComponent score(String, String)
- **static** ScoreComponent score(String, String, String)
- Iterator<Component> iterator(ComponentIteratorType, ComponentIteratorFlag)
- Iterator<Component> iterator(ComponentIteratorType, Set<ComponentIteratorFlag>)
- **static** TextComponent newline()
- List<Component> children()
- Component children(List<ComponentLike>)
- Component mergeStyle(Component)
- Component mergeStyle(Component, Style$Merge[])
- Component mergeStyle(Component, Set<Style$Merge>)
- Component appendNewline()
- **static** SelectorComponent$Builder selector()
- **static** SelectorComponent selector(Consumer<SelectorComponent$Builder>)
- **static** SelectorComponent selector(String)
- **static** SelectorComponent selector(String, ComponentLike)
- Stream<ExaminableProperty> examinableProperties()
- HoverEvent<Component> asHoverEvent(UnaryOperator<Component>)
- **static** TextComponent$Builder text()
- **static** TextComponent text(Consumer<TextComponent$Builder>)
- **static** TextComponent text(String)
- **static** TextComponent text(String, Style)
- **static** TextComponent text(String, TextColor)
- **static** TextComponent text(String, TextColor, TextDecoration[])
- **static** TextComponent text(String, TextColor, Set<TextDecoration>)
- **static** TextComponent text(boolean)
- **static** TextComponent text(boolean, Style)
- **static** TextComponent text(boolean, TextColor)
- **static** TextComponent text(boolean, TextColor, TextDecoration[])
- **static** TextComponent text(boolean, TextColor, Set<TextDecoration>)
- **static** TextComponent text(char)
- **static** TextComponent text(char, Style)
- **static** TextComponent text(char, TextColor)
- **static** TextComponent text(char, TextColor, TextDecoration[])
- **static** TextComponent text(char, TextColor, Set<TextDecoration>)
- **static** TextComponent text(double)
- **static** TextComponent text(double, Style)
- **static** TextComponent text(double, TextColor)
- **static** TextComponent text(double, TextColor, TextDecoration[])
- **static** TextComponent text(double, TextColor, Set<TextDecoration>)
- **static** TextComponent text(float)
- **static** TextComponent text(float, Style)
- **static** TextComponent text(float, TextColor)
- **static** TextComponent text(float, TextColor, TextDecoration[])
- **static** TextComponent text(float, TextColor, Set<TextDecoration>)
- **static** TextComponent text(int)
- **static** TextComponent text(int, Style)
- **static** TextComponent text(int, TextColor)
- **static** TextComponent text(int, TextColor, TextDecoration[])
- **static** TextComponent text(int, TextColor, Set<TextDecoration>)
- **static** TextComponent text(long)
- **static** TextComponent text(long, Style)
- **static** TextComponent text(long, TextColor)
- **static** TextComponent text(long, TextColor, TextDecoration[])
- **static** TextComponent text(long, TextColor, Set<TextDecoration>)
- **static** TextComponent join(ComponentLike, ComponentLike[])
- **static** TextComponent join(ComponentLike, Iterable<ComponentLike>)
- **static** Component join(JoinConfiguration$Builder, ComponentLike[])
- **static** Component join(JoinConfiguration$Builder, Iterable<ComponentLike>)
- **static** Component join(JoinConfiguration, ComponentLike[])
- **static** Component join(JoinConfiguration, Iterable<ComponentLike>)
- TextDecoration$State decoration(TextDecoration)
- Component decoration(TextDecoration, boolean)
- Component decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- ShadowColor shadowColor()
- Component shadowColor(ARGBLike)
- StyleSetter shadowColor(ARGBLike)
- V componentBuilderApply(ComponentBuilder<**>)
- **static** TranslatableComponent$Builder translatable()
- **static** TranslatableComponent translatable(Consumer<TranslatableComponent$Builder>)
- **static** TranslatableComponent translatable(String)
- **static** TranslatableComponent translatable(Translatable)
- **static** TranslatableComponent translatable(String, String)
- **static** TranslatableComponent translatable(Translatable, String)
- **static** TranslatableComponent translatable(String, Style)
- **static** TranslatableComponent translatable(Translatable, Style)
- **static** TranslatableComponent translatable(String, String, Style)
- **static** TranslatableComponent translatable(Translatable, String, Style)
- **static** TranslatableComponent translatable(String, String, StyleBuilderApplicable[])
- **static** TranslatableComponent translatable(Translatable, String, Iterable<StyleBuilderApplicable>)
- **static** TranslatableComponent translatable(String, String, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, String, ComponentLike[])
- **static** TranslatableComponent translatable(String, String, Style, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, String, Style, ComponentLike[])
- **static** TranslatableComponent translatable(String, String, Style, List<ComponentLike>)
- **static** TranslatableComponent translatable(Translatable, String, Style, List<ComponentLike>)
- **static** TranslatableComponent translatable(String, String, List<ComponentLike>, Iterable<StyleBuilderApplicable>)
- **static** TranslatableComponent translatable(Translatable, String, List<ComponentLike>, Iterable<StyleBuilderApplicable>)
- **static** TranslatableComponent translatable(String, String, List<ComponentLike>, StyleBuilderApplicable)
- **static** TranslatableComponent translatable(Translatable, String, List<ComponentLike>, StyleBuilderApplicable)
- **static** TranslatableComponent translatable(String, TextColor)
- **static** TranslatableComponent translatable(Translatable, TextColor)
- **static** TranslatableComponent translatable(String, TextColor, TextDecoration[])
- **static** TranslatableComponent translatable(Translatable, TextColor, TextDecoration[])
- **static** TranslatableComponent translatable(String, TextColor, Set<TextDecoration>)
- **static** TranslatableComponent translatable(Translatable, TextColor, Set<TextDecoration>)
- **static** TranslatableComponent translatable(String, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, ComponentLike[])
- **static** TranslatableComponent translatable(String, Style, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, Style, ComponentLike[])
- **static** TranslatableComponent translatable(String, TextColor, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, TextColor, ComponentLike[])
- **static** TranslatableComponent translatable(String, TextColor, Set<TextDecoration>, ComponentLike)
- **static** TranslatableComponent translatable(Translatable, TextColor, Set<TextDecoration>, ComponentLike)
- **static** TranslatableComponent translatable(String, List<ComponentLike>)
- **static** TranslatableComponent translatable(Translatable, List<ComponentLike>)
- **static** TranslatableComponent translatable(String, Style, List<ComponentLike>)
- **static** TranslatableComponent translatable(Translatable, Style, List<ComponentLike>)
- **static** TranslatableComponent translatable(String, TextColor, List<ComponentLike>)
- **static** TranslatableComponent translatable(Translatable, TextColor, List<ComponentLike>)
- **static** TranslatableComponent translatable(String, TextColor, Set<TextDecoration>, List<ComponentLike>)
- **static** TranslatableComponent translatable(Translatable, TextColor, Set<TextDecoration>, List<ComponentLike>)
- Component replaceText(Consumer<TextReplacementConfig$Builder>)
- Component replaceText(TextReplacementConfig)
- Component replaceText(String, ComponentLike)
- Component replaceText(Pattern, Function<TextComponent$Builder, ComponentLike>)
- Component replaceText(String, ComponentLike, int)
- Component replaceText(Pattern, Function<TextComponent$Builder, ComponentLike>, int)
- Component replaceText(String, ComponentLike, IntFunction2<PatternReplacementResult>)
- Component replaceText(Pattern, Function<TextComponent$Builder, ComponentLike>, IntFunction2<PatternReplacementResult>)
- Component appendSpace()
- Spliterator<Component> spliterator(ComponentIteratorType, ComponentIteratorFlag)
- Spliterator<Component> spliterator(ComponentIteratorType, Set<ComponentIteratorFlag>)
- boolean hasStyling()
- boolean hasDecoration(TextDecoration)
- ClickEvent clickEvent()
- Component clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- boolean contains(Component)
- Z contains(Component, BiPredicate<Component, Component>)
- Component applyFallbackStyle(Style)
- Component applyFallbackStyle(StyleBuilderApplicable[])
- **static** KeybindComponent$Builder keybind()
- **static** KeybindComponent keybind(Consumer<KeybindComponent$Builder>)
- **static** KeybindComponent keybind(String)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike)
- **static** KeybindComponent keybind(String, Style)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, Style)
- **static** KeybindComponent keybind(String, TextColor)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor)
- **static** KeybindComponent keybind(String, TextColor, TextDecoration[])
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor, TextDecoration[])
- **static** KeybindComponent keybind(String, TextColor, Set<TextDecoration>)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor, Set<TextDecoration>)
- **static** Collector<Component, ComponentBuilder<**>, Component> toComponent()
- **static** Collector<Component, ComponentBuilder<**>, Component> toComponent(Component)
- String insertion()
- Component insertion(String)
- StyleSetter insertion(String)
- Style style()
- Component style(Style)
- Component style(Consumer<Style$Builder>)
- Component style(Consumer<Style$Builder>, Style$Merge$Strategy)
- Component style(Style$Builder)
- Component append(Component)
- Component append(ComponentLike)
- Component append(ComponentBuilder<**>)
- Component append(ComponentLike[])
- Component append(List<ComponentLike>)
- Component decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- Key font()
- Component font(Key)
- StyleSetter font(Key)

### Class: net.kyori.adventure.text.ComponentBuilder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder, net.kyori.adventure.text.ComponentBuilderApplicable, net.kyori.adventure.text.ComponentLike, net.kyori.adventure.text.format.MutableStyleSetter

Methods:
- TB decorate(TextDecoration)
- TB decorate(TextDecoration)
- MutableStyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration)
- TB color(TextColor)
- StyleSetter color(TextColor)
- TB applicableApply(ComponentBuilderApplicable)
- TB resetStyle()
- TB decorations(Set<TextDecoration>, boolean)
- TB decorations(Map<TextDecoration, TextDecoration$State>)
- MutableStyleSetter decorations(Set, boolean)
- MutableStyleSetter decorations(Map)
- StyleSetter decorations(Set, boolean)
- StyleSetter decorations(Map)
- Component asComponent()
- TB colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- TB hoverEvent(HoverEventSource<*>)
- StyleSetter hoverEvent(HoverEventSource)
- TB mapChildren(Function<BuildableComponent<**>, BuildableComponent<**>>)
- List<Component> children()
- TB mergeStyle(Component)
- TB mergeStyle(Component, Style$Merge)
- TB mergeStyle(Component, Set<Style$Merge>)
- TB appendNewline()
- TB decoration(TextDecoration, boolean)
- TB decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- V componentBuilderApply(ComponentBuilder<**>)
- TB appendSpace()
- TB apply(Consumer<ComponentBuilder<**>>)
- TB clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- TC build()
- Object build()
- TB mapChildrenDeep(Function<BuildableComponent<**>, BuildableComponent<**>>)
- TB insertion(String)
- StyleSetter insertion(String)
- TB style(Style)
- TB style(Consumer<Style$Builder>)
- TB applyDeep(Consumer<ComponentBuilder<**>>)
- TB append(Component)
- TB append(ComponentLike)
- TB append(ComponentBuilder<**>)
- TB append(Component)
- TB append(ComponentLike)
- TB append(Iterable<ComponentLike>)
- TB decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- TB font(Key)
- StyleSetter font(Key)

### Class: net.kyori.adventure.text.ComponentBuilderApplicable
Type: Interface

Methods:
- V componentBuilderApply(ComponentBuilder<**>)

### Class: net.kyori.adventure.text.ComponentIteratorType
Type: Interface

Methods:
- V populate(Component, Deque<Component>, Set<ComponentIteratorFlag>)

### Class: net.kyori.adventure.text.ComponentLike
Type: Interface

Methods:
- **static** Component unbox(ComponentLike)
- **static** List<Component> asComponents(List<ComponentLike>)
- **static** List<Component> asComponents(List<ComponentLike>, Predicate<Component>)
- Component asComponent()

### Class: net.kyori.adventure.text.EntityNBTComponent
Type: Interface
Implements: net.kyori.adventure.text.NBTComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String selector()
- EntityNBTComponent selector(String)
- Stream<ExaminableProperty> examinableProperties()

### Class: net.kyori.adventure.text.EntityNBTComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.NBTComponentBuilder

Methods:
- EntityNBTComponent$Builder selector(String)

### Class: net.kyori.adventure.text.JoinConfiguration
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable

Methods:
- **static** JoinConfiguration commas(boolean)
- Component prefix()
- Component suffix()
- **static** JoinConfiguration noSeparators()
- **static** JoinConfiguration separator(ComponentLike)
- Component separator()
- Predicate<ComponentLike> predicate()
- Function<ComponentLike, Component> convertor()
- **static** JoinConfiguration newlines()
- Component lastSeparatorIfSerial()
- **static** JoinConfiguration spaces()
- **static** JoinConfiguration$Builder builder()
- Component lastSeparator()
- **static** JoinConfiguration separators(ComponentLike, ComponentLike)
- **static** JoinConfiguration arrayLike()
- Style parentStyle()

### Class: net.kyori.adventure.text.JoinConfiguration$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- JoinConfiguration$Builder predicate(Predicate<ComponentLike>)
- JoinConfiguration$Builder convertor(Function<ComponentLike, Component>)
- JoinConfiguration$Builder prefix(ComponentLike)
- JoinConfiguration$Builder lastSeparatorIfSerial(ComponentLike)
- JoinConfiguration$Builder lastSeparator(ComponentLike)
- JoinConfiguration$Builder suffix(ComponentLike)
- JoinConfiguration$Builder separator(ComponentLike)
- JoinConfiguration$Builder parentStyle(Style)

### Class: net.kyori.adventure.text.KeybindComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String keybind()
- KeybindComponent keybind(String)
- KeybindComponent keybind(KeybindComponent$KeybindLike)
- Stream<ExaminableProperty> examinableProperties()

### Class: net.kyori.adventure.text.KeybindComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- KeybindComponent$Builder keybind(String)
- KeybindComponent$Builder keybind(KeybindComponent$KeybindLike)

### Class: net.kyori.adventure.text.KeybindComponent$KeybindLike
Type: Interface

Methods:
- String asKeybind()

### Class: net.kyori.adventure.text.NBTComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent

Methods:
- String nbtPath()
- TC nbtPath(String)
- boolean interpret()
- TC interpret(boolean)
- Stream<ExaminableProperty> examinableProperties()
- Component separator()
- TC separator(ComponentLike)

### Class: net.kyori.adventure.text.NBTComponentBuilder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- TB nbtPath(String)
- TB interpret(boolean)
- TB separator(ComponentLike)

### Class: net.kyori.adventure.text.ScopedComponent
Type: Interface
Implements: net.kyori.adventure.text.Component

Methods:
- TC decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- TC color(TextColor)
- StyleSetter color(TextColor)
- TC appendSpace()
- TC decorations(Map<TextDecoration, TextDecoration$State>)
- StyleSetter decorations(Map)
- TC asComponent()
- TC shadowColorIfAbsent(ARGBLike)
- StyleSetter shadowColorIfAbsent(ARGBLike)
- TC colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- TC hoverEvent(HoverEventSource<*>)
- StyleSetter hoverEvent(HoverEventSource)
- TC clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- TC applyFallbackStyle(StyleBuilderApplicable)
- TC applyFallbackStyle(Style)
- TC children(List<ComponentLike>)
- TC mergeStyle(Component)
- TC mergeStyle(Component, Style$Merge)
- TC mergeStyle(Component, Set<Style$Merge>)
- TC appendNewline()
- TC insertion(String)
- StyleSetter insertion(String)
- TC style(Style)
- TC style(Consumer<Style$Builder>)
- TC style(Style$Builder)
- TC style(Consumer<Style$Builder>, Style$Merge$Strategy)
- TC decoration(TextDecoration, boolean)
- TC decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- TC shadowColor(ARGBLike)
- StyleSetter shadowColor(ARGBLike)
- TC append(Component)
- TC append(ComponentLike)
- TC append(ComponentBuilder<**>)
- TC append(List<ComponentLike>)
- TC append(ComponentLike)
- TC font(Key)
- StyleSetter font(Key)
- TC decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)

### Class: net.kyori.adventure.text.ScoreComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String name()
- ScoreComponent name(String)
- Stream<ExaminableProperty> examinableProperties()
- String value()
- ScoreComponent value(String)
- String objective()
- ScoreComponent objective(String)

### Class: net.kyori.adventure.text.ScoreComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- ScoreComponent$Builder name(String)
- ScoreComponent$Builder value(String)
- ScoreComponent$Builder objective(String)

### Class: net.kyori.adventure.text.SelectorComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String pattern()
- SelectorComponent pattern(String)
- Stream<ExaminableProperty> examinableProperties()
- Component separator()
- SelectorComponent separator(ComponentLike)

### Class: net.kyori.adventure.text.SelectorComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- SelectorComponent$Builder pattern(String)
- SelectorComponent$Builder separator(ComponentLike)

### Class: net.kyori.adventure.text.StorageNBTComponent
Type: Interface
Implements: net.kyori.adventure.text.NBTComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- Stream<ExaminableProperty> examinableProperties()
- Key storage()
- StorageNBTComponent storage(Key)

### Class: net.kyori.adventure.text.StorageNBTComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.NBTComponentBuilder

Methods:
- StorageNBTComponent$Builder storage(Key)

### Class: net.kyori.adventure.text.TextComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- **static** TextComponent ofChildren(ComponentLike[])
- Stream<ExaminableProperty> examinableProperties()
- String content()
- TextComponent content(String)

### Class: net.kyori.adventure.text.TextComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- String content()
- TextComponent$Builder content(String)

### Class: net.kyori.adventure.text.TextReplacementConfig
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable

Methods:
- **static** TextReplacementConfig$Builder builder()
- Pattern matchPattern()

### Class: net.kyori.adventure.text.TextReplacementConfig$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- TextReplacementConfig$Builder condition(IntFunction2<PatternReplacementResult>)
- TextReplacementConfig$Builder condition(TextReplacementConfig$Condition)
- TextReplacementConfig$Builder times(int)
- TextReplacementConfig$Builder once()
- TextReplacementConfig$Builder matchLiteral(String)
- TextReplacementConfig$Builder match(String)
- TextReplacementConfig$Builder match(Pattern)
- TextReplacementConfig$Builder replacement(String)
- TextReplacementConfig$Builder replacement(ComponentLike)
- TextReplacementConfig$Builder replacement(Function<TextComponent$Builder, ComponentLike>)
- TextReplacementConfig$Builder replacement(BiFunction<MatchResult, TextComponent$Builder, ComponentLike>)
- TextReplacementConfig$Builder replaceInsideHoverEvents(boolean)

### Class: net.kyori.adventure.text.TextReplacementConfig$Condition
Type: Interface

Methods:
- PatternReplacementResult shouldReplace(MatchResult, int, int)

### Class: net.kyori.adventure.text.TranslatableComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- List<Component> args()
- TranslatableComponent args(ComponentLike[])
- TranslatableComponent args(List<ComponentLike>)
- List<TranslationArgument> arguments()
- TranslatableComponent arguments(ComponentLike[])
- TranslatableComponent arguments(List<ComponentLike>)
- Stream<ExaminableProperty> examinableProperties()
- String fallback()
- TranslatableComponent fallback(String)
- String key()
- TranslatableComponent key(Translatable)
- TranslatableComponent key(String)

### Class: net.kyori.adventure.text.TranslatableComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- TranslatableComponent$Builder args(ComponentBuilder<**>)
- TranslatableComponent$Builder args(ComponentBuilder<**>)
- TranslatableComponent$Builder args(Component)
- TranslatableComponent$Builder args(ComponentLike[])
- TranslatableComponent$Builder args(List<ComponentLike>)
- TranslatableComponent$Builder arguments(ComponentLike[])
- TranslatableComponent$Builder arguments(List<ComponentLike>)
- TranslatableComponent$Builder fallback(String)
- TranslatableComponent$Builder key(Translatable)
- TranslatableComponent$Builder key(String)

### Class: net.kyori.adventure.text.TranslationArgument
Type: Interface
Implements: net.kyori.adventure.text.TranslationArgumentLike, net.kyori.examination.Examinable

Methods:
- TranslationArgument asTranslationArgument()
- **static** TranslationArgument component(ComponentLike)
- **static** TranslationArgument bool(boolean)
- **static** TranslationArgument numeric(Number)
- Object value()

### Class: net.kyori.adventure.text.TranslationArgumentLike
Type: Interface
Implements: net.kyori.adventure.text.ComponentLike

Methods:
- TranslationArgument asTranslationArgument()
- Component asComponent()

### Class: net.kyori.adventure.text.VirtualComponent
Type: Interface
Implements: net.kyori.adventure.text.TextComponent

Methods:
- VirtualComponentRenderer<*> renderer()
- Class<*> contextType()

### Class: net.kyori.adventure.text.VirtualComponentRenderer
Type: Interface

Methods:
- ComponentLike apply(T)
- String fallbackString()

### Class: net.kyori.adventure.text.AbstractComponent
Type: Abstract Class
Implements: net.kyori.adventure.text.Component

Methods:
- List<Component> children()
- int hashCode()
- boolean equals(Object)
- String toString()
- Style style()

### Class: net.kyori.adventure.text.BlockNBTComponent$WorldPos$Coordinate$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ABSOLUTE
- RELATIVE

Methods:
- **static** BlockNBTComponent$WorldPos$Coordinate$Type valueOf(String)
- **static** BlockNBTComponent$WorldPos$Coordinate$Type[] values()

### Class: net.kyori.adventure.text.ComponentIteratorFlag
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- INCLUDE_HOVER_SHOW_ENTITY_NAME
- INCLUDE_HOVER_SHOW_TEXT_COMPONENT
- INCLUDE_TRANSLATABLE_COMPONENT_ARGUMENTS

Methods:
- **static** ComponentIteratorFlag valueOf(String)
- **static** ComponentIteratorFlag[] values()

### Class: net.kyori.adventure.text.PatternReplacementResult
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- REPLACE
- CONTINUE
- STOP

Methods:
- **static** PatternReplacementResult valueOf(String)
- **static** PatternReplacementResult[] values()

## Package: net.kyori.adventure.text.event

### Class: net.kyori.adventure.text.event.ClickCallback
Type: Interface

Methods:
- ClickCallback<TT> filter(Predicate<TT>)
- ClickCallback<TT> filter(Predicate<TT>, Consumer<Audience>)
- ClickCallback<TT> requiringPermission(String)
- ClickCallback<TT> requiringPermission(String, Consumer<Audience>)
- **static** ClickCallback<TW> widen(ClickCallback<TN>, Class<TN>, Consumer<Audience>)
- **static** ClickCallback<TW> widen(ClickCallback<TN>, Class<TN>)
- V accept(T)

### Class: net.kyori.adventure.text.event.ClickCallback$Options
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- Duration lifetime()
- **static** ClickCallback$Options$Builder builder()
- **static** ClickCallback$Options$Builder builder(ClickCallback$Options)
- int uses()

### Class: net.kyori.adventure.text.event.ClickCallback$Options$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder

Methods:
- ClickCallback$Options$Builder lifetime(TemporalAmount)
- ClickCallback$Options$Builder uses(int)

### Class: net.kyori.adventure.text.event.ClickCallback$Provider
Type: Interface

Methods:
- ClickEvent create(ClickCallback<Audience>, ClickCallback$Options)

### Class: net.kyori.adventure.text.event.DataComponentValue
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** DataComponentValue$Removed removed()

### Class: net.kyori.adventure.text.event.DataComponentValue$Removed
Type: Interface
Implements: net.kyori.adventure.text.event.DataComponentValue

No public methods found

### Class: net.kyori.adventure.text.event.DataComponentValue$TagSerializable
Type: Interface
Implements: net.kyori.adventure.text.event.DataComponentValue

Methods:
- BinaryTagHolder asBinaryTag()

### Class: net.kyori.adventure.text.event.DataComponentValueConverterRegistry$Conversion
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- Class<TO> destination()
- Class<TI> source()
- **static** DataComponentValueConverterRegistry$Conversion<TI1, TO1> convert(Class<TI1>, Class<TO1>, BiFunction<Key, TI1, TO1>)
- TO convert(Key, T)

### Class: net.kyori.adventure.text.event.DataComponentValueConverterRegistry$Provider
Type: Interface

Methods:
- Iterable<DataComponentValueConverterRegistry$Conversion<**>> conversions()
- Key id()

### Class: net.kyori.adventure.text.event.HoverEventSource
Type: Interface

Methods:
- **static** HoverEvent<TV> unbox(HoverEventSource<TV>)
- HoverEvent<TV> asHoverEvent()
- HoverEvent<TV> asHoverEvent(UnaryOperator<TV>)

### Class: net.kyori.adventure.text.event.ClickEvent
Type: Class
Implements: net.kyori.examination.Examinable, net.kyori.adventure.text.format.StyleBuilderApplicable

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
- **static** ClickEvent callback(ClickCallback<Audience>)
- **static** ClickEvent callback(ClickCallback<Audience>, ClickCallback$Options)
- **static** ClickEvent callback(ClickCallback<Audience>, Consumer<ClickCallback$Options$Builder>)
- **static** ClickEvent copyToClipboard(String)
- String toString()
- **static** ClickEvent runCommand(String)
- Stream<ExaminableProperty> examinableProperties()
- String value()

### Class: net.kyori.adventure.text.event.ClickEvent$Action
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- OPEN_URL
- OPEN_FILE
- RUN_COMMAND
- SUGGEST_COMMAND
- CHANGE_PAGE
- COPY_TO_CLIPBOARD

Methods:
- boolean readable()
- **static** ClickEvent$Action valueOf(String)
- **static** ClickEvent$Action[] values()
- String toString()

### Class: net.kyori.adventure.text.event.DataComponentValueConverterRegistry
Type: Class

Methods:
- **static** TO convert(Class<TO>, Key, DataComponentValue)
- **static** Set<Key> knownProviders()

### Class: net.kyori.adventure.text.event.HoverEvent
Type: Class
Implements: net.kyori.examination.Examinable, net.kyori.adventure.text.event.HoverEventSource, net.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- **static** HoverEvent<Component> showText(ComponentLike)
- **static** HoverEvent<Component> showText(Component)
- HoverEvent<TV> withRenderedValue(ComponentRenderer<TC>, T)
- void styleApply(Style$Builder)
- **static** HoverEvent<TV> hoverEvent(HoverEvent$Action<TV>, T)
- **static** HoverEvent<String> showAchievement(String)
- **static** HoverEvent<HoverEvent$ShowEntity> showEntity(Key, UUID)
- **static** HoverEvent<HoverEvent$ShowEntity> showEntity(Keyed, UUID)
- **static** HoverEvent<HoverEvent$ShowEntity> showEntity(Key, UUID, Component)
- **static** HoverEvent<HoverEvent$ShowEntity> showEntity(Keyed, UUID, Component)
- **static** HoverEvent<HoverEvent$ShowEntity> showEntity(HoverEvent$ShowEntity)
- int hashCode()
- boolean equals(Object)
- HoverEvent$Action<TV> action()
- **static** HoverEvent<HoverEvent$ShowItem> showItem(Key, int)
- **static** HoverEvent<HoverEvent$ShowItem> showItem(Keyed, int)
- **static** HoverEvent<HoverEvent$ShowItem> showItem(Key, int, BinaryTagHolder)
- **static** HoverEvent<HoverEvent$ShowItem> showItem(Keyed, int, BinaryTagHolder)
- **static** HoverEvent<HoverEvent$ShowItem> showItem(Keyed, int, Map<Key, DataComponentValue>)
- **static** HoverEvent<HoverEvent$ShowItem> showItem(HoverEvent$ShowItem)
- String toString()
- Stream<ExaminableProperty> examinableProperties()
- HoverEvent<TV> asHoverEvent()
- HoverEvent<TV> asHoverEvent(UnaryOperator<TV>)
- TV value()
- HoverEvent<TV> value(T)

### Class: net.kyori.adventure.text.event.HoverEvent$Action
Type: Class

Methods:
- boolean readable()
- String toString()
- Class<TV> type()

### Class: net.kyori.adventure.text.event.HoverEvent$ShowEntity
Type: Class
Implements: net.kyori.examination.Examinable

Methods:
- **static** HoverEvent$ShowEntity showEntity(Key, UUID)
- **static** HoverEvent$ShowEntity showEntity(Keyed, UUID)
- **static** HoverEvent$ShowEntity showEntity(Key, UUID, Component)
- **static** HoverEvent$ShowEntity showEntity(Keyed, UUID, Component)
- int hashCode()
- boolean equals(Object)
- **static** HoverEvent$ShowEntity of(Key, UUID)
- **static** HoverEvent$ShowEntity of(Keyed, UUID)
- **static** HoverEvent$ShowEntity of(Key, UUID, Component)
- **static** HoverEvent$ShowEntity of(Keyed, UUID, Component)
- Component name()
- HoverEvent$ShowEntity name(Component)
- String toString()
- Stream<ExaminableProperty> examinableProperties()
- UUID id()
- HoverEvent$ShowEntity id(UUID)
- Key type()
- HoverEvent$ShowEntity type(Key)
- HoverEvent$ShowEntity type(Keyed)

### Class: net.kyori.adventure.text.event.HoverEvent$ShowItem
Type: Class
Implements: net.kyori.examination.Examinable

Methods:
- BinaryTagHolder nbt()
- HoverEvent$ShowItem nbt(BinaryTagHolder)
- Key item()
- HoverEvent$ShowItem item(Key)
- Map<Key, DataComponentValue> dataComponents()
- HoverEvent$ShowItem dataComponents(Map<Key, DataComponentValue>)
- int hashCode()
- boolean equals(Object)
- **static** HoverEvent$ShowItem of(Key, int)
- **static** HoverEvent$ShowItem of(Keyed, int)
- **static** HoverEvent$ShowItem of(Key, int, BinaryTagHolder)
- **static** HoverEvent$ShowItem of(Keyed, int, BinaryTagHolder)
- int count()
- HoverEvent$ShowItem count(int)
- **static** HoverEvent$ShowItem showItem(Key, int)
- **static** HoverEvent$ShowItem showItem(Keyed, int)
- **static** HoverEvent$ShowItem showItem(Key, int, BinaryTagHolder)
- **static** HoverEvent$ShowItem showItem(Keyed, int, BinaryTagHolder)
- **static** HoverEvent$ShowItem showItem(Keyed, int, Map<Key, DataComponentValue>)
- String toString()
- Stream<ExaminableProperty> examinableProperties()
- Map<Key, TV> dataComponentsAs(Class<TV>)

## Package: net.kyori.adventure.text.flattener

### Class: net.kyori.adventure.text.flattener.ComponentFlattener
Type: Interface
Implements: net.kyori.adventure.util.Buildable

Methods:
- void flatten(Component, FlattenerListener)
- **static** ComponentFlattener textOnly()
- **static** ComponentFlattener$Builder builder()
- **static** ComponentFlattener basic()

### Class: net.kyori.adventure.text.flattener.ComponentFlattener$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- ComponentFlattener$Builder complexMapper(Class<TT>, BiConsumer<TT, Consumer<Component>>)
- ComponentFlattener$Builder unknownMapper(Function<Component, String>)
- ComponentFlattener$Builder mapper(Class<TT>, Function<TT, String>)

### Class: net.kyori.adventure.text.flattener.FlattenerListener
Type: Interface

Methods:
- boolean shouldContinue()
- void pushStyle(Style)
- void component(String)
- void popStyle(Style)

## Package: net.kyori.adventure.text.format

### Class: net.kyori.adventure.text.format.MutableStyleSetter
Type: Interface
Implements: net.kyori.adventure.text.format.StyleSetter

Methods:
- TT decorate(TextDecoration)
- StyleSetter decorate(TextDecoration[])
- TT decorations(Map<TextDecoration, TextDecoration$State>)
- TT decorations(Set<TextDecoration>, boolean)
- StyleSetter decorations(Set, boolean)
- StyleSetter decorations(Map)

### Class: net.kyori.adventure.text.format.ShadowColor
Type: Interface
Implements: net.kyori.adventure.text.format.StyleBuilderApplicable, net.kyori.adventure.util.ARGBLike

Methods:
- int red()
- int green()
- int blue()
- **static** ShadowColor lerp(float, ARGBLike, ARGBLike)
- int alpha()
- **static** ShadowColor fromHexString(String)
- String asHexString()
- **static** ShadowColor none()
- void styleApply(Style$Builder)
- int value()
- **static** ShadowColor shadowColor(int)
- **static** ShadowColor shadowColor(int, int, int, int)
- **static** ShadowColor shadowColor(RGBLike, int)
- **static** ShadowColor shadowColor(ARGBLike)

### Class: net.kyori.adventure.text.format.Style
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable, net.kyori.adventure.text.format.StyleGetter, net.kyori.adventure.text.format.StyleSetter

Methods:
- Style$Builder toBuilder()
- Buildable$Builder toBuilder()
- Style decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- Style unmerge(Style)
- TextColor color()
- Style color(TextColor)
- StyleSetter color(TextColor)
- Style edit(Consumer<Style$Builder>)
- Style edit(Consumer<Style$Builder>, Style$Merge$Strategy)
- boolean isEmpty()
- Map<TextDecoration, TextDecoration$State> decorations()
- Style decorations(Map<TextDecoration, TextDecoration$State>)
- StyleSetter decorations(Map)
- boolean hasDecoration(TextDecoration)
- Style colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- **static** Style empty()
- HoverEvent<*> hoverEvent()
- Style hoverEvent(HoverEventSource<*>)
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
- Style merge(Style, Set<Style$Merge>)
- Style merge(Style, Style$Merge$Strategy, Set<Style$Merge>)
- String insertion()
- Style insertion(String)
- StyleSetter insertion(String)
- **static** Style$Builder style()
- **static** Style style(Consumer<Style$Builder>)
- **static** Style style(TextColor)
- **static** Style style(TextDecoration)
- **static** Style style(TextColor, TextDecoration[])
- **static** Style style(TextColor, Set<TextDecoration>)
- **static** Style style(StyleBuilderApplicable[])
- **static** Style style(Iterable<StyleBuilderApplicable>)
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

### Class: net.kyori.adventure.text.format.Style$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder, net.kyori.adventure.text.format.MutableStyleSetter

Methods:
- Style$Builder decorate(TextDecoration)
- Style$Builder decorate(TextDecoration[])
- MutableStyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration)
- Style$Builder color(TextColor)
- StyleSetter color(TextColor)
- Style$Builder apply(StyleBuilderApplicable)
- Style$Builder decorations(Map<TextDecoration, TextDecoration$State>)
- MutableStyleSetter decorations(Map)
- StyleSetter decorations(Map)
- Style$Builder colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- Style$Builder hoverEvent(HoverEventSource<*>)
- StyleSetter hoverEvent(HoverEventSource)
- Style$Builder clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- Style build()
- Object build()
- Style$Builder merge(Style)
- Style$Builder merge(Style, Style$Merge$Strategy)
- Style$Builder merge(Style, Style$Merge[])
- Style$Builder merge(Style, Style$Merge$Strategy, Style$Merge[])
- Style$Builder merge(Style, Set<Style$Merge>)
- Style$Builder merge(Style, Style$Merge$Strategy, Set<Style$Merge>)
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

### Class: net.kyori.adventure.text.format.StyleBuilderApplicable
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilderApplicable

Methods:
- void styleApply(Style$Builder)
- V componentBuilderApply(ComponentBuilder<**>)

### Class: net.kyori.adventure.text.format.StyleGetter
Type: Interface

Methods:
- HoverEvent<*> hoverEvent()
- ClickEvent clickEvent()
- TextColor color()
- String insertion()
- Map<TextDecoration, TextDecoration$State> decorations()
- boolean hasDecoration(TextDecoration)
- TextDecoration$State decoration(TextDecoration)
- ShadowColor shadowColor()
- Key font()

### Class: net.kyori.adventure.text.format.StyleSetter
Type: Interface

Methods:
- TT hoverEvent(HoverEventSource<*>)
- TT clickEvent(ClickEvent)
- TT decorate(TextDecoration)
- TT decorate(TextDecoration)
- TT color(TextColor)
- TT insertion(String)
- TT decorations(Map<TextDecoration, TextDecoration$State>)
- TT decorations(Set<TextDecoration>, boolean)
- TT decoration(TextDecoration, boolean)
- TT decoration(TextDecoration, TextDecoration$State)
- TT shadowColor(ARGBLike)
- TT decorationIfAbsent(TextDecoration, TextDecoration$State)
- TT shadowColorIfAbsent(ARGBLike)
- TT colorIfAbsent(TextColor)
- TT font(Key)

### Class: net.kyori.adventure.text.format.TextColor
Type: Interface
Implements: java.lang.Comparable, net.kyori.examination.Examinable, net.kyori.adventure.util.RGBLike, net.kyori.adventure.text.format.StyleBuilderApplicable, net.kyori.adventure.text.format.TextFormat

Methods:
- int green()
- **static** TextColor fromCSSHexString(String)
- **static** TextColor color(int)
- **static** TextColor color(RGBLike)
- **static** TextColor color(HSVLike)
- **static** TextColor color(int, int, int)
- **static** TextColor color(float, float, float)
- **static** TextColor lerp(float, RGBLike, RGBLike)
- int compareTo(TextColor)
- int compareTo(Object)
- void styleApply(Style$Builder)
- int red()
- int blue()
- **static** TC nearestColorTo(List<TC>, TextColor)
- **static** TextColor fromHexString(String)
- Stream<ExaminableProperty> examinableProperties()
- String asHexString()
- int value()

### Class: net.kyori.adventure.text.format.TextDecorationAndState
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- Stream<ExaminableProperty> examinableProperties()
- TextDecoration$State state()
- void styleApply(Style$Builder)
- TextDecoration decoration()

### Class: net.kyori.adventure.text.format.TextFormat
Type: Interface

No public methods found

### Class: net.kyori.adventure.text.format.NamedTextColor
Type: Class
Implements: net.kyori.adventure.text.format.TextColor

Methods:
- **static** NamedTextColor nearestTo(TextColor)
- **static** NamedTextColor namedColor(int)
- HSVLike asHSV()
- String toString()
- Stream<ExaminableProperty> examinableProperties()
- int value()
- **static** NamedTextColor ofExact(int)

### Class: net.kyori.adventure.text.format.Style$Merge
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- COLOR
- SHADOW_COLOR
- DECORATIONS
- EVENTS
- INSERTION
- FONT

Methods:
- **static** Set<Style$Merge> all()
- **static** Style$Merge valueOf(String)
- **static** Set<Style$Merge> of(Style$Merge)
- **static** Style$Merge[] values()
- **static** Set<Style$Merge> colorAndDecorations()
- **static** Set<Style$Merge> merges(Style$Merge)

### Class: net.kyori.adventure.text.format.Style$Merge$Strategy
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ALWAYS
- NEVER
- IF_ABSENT_ON_TARGET

Methods:
- **static** Style$Merge$Strategy valueOf(String)
- **static** Style$Merge$Strategy[] values()

### Class: net.kyori.adventure.text.format.TextDecoration
Type: Enum
Extends: java.lang.Enum
Implements: net.kyori.adventure.text.format.StyleBuilderApplicable, net.kyori.adventure.text.format.TextFormat

Enum Constants:
- OBFUSCATED
- BOLD
- STRIKETHROUGH
- UNDERLINED
- ITALIC

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

### Class: net.kyori.adventure.text.format.TextDecoration$State
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NOT_SET
- FALSE
- TRUE

Methods:
- **static** TextDecoration$State byBoolean(boolean)
- **static** TextDecoration$State byBoolean(Boolean)
- **static** TextDecoration$State valueOf(String)
- **static** TextDecoration$State[] values()
- String toString()
- **static** TextDecoration$State byTriState(TriState)

## Package: net.kyori.adventure.text.minimessage

### Class: net.kyori.adventure.text.minimessage.Context
Type: Interface

Methods:
- Pointered targetOrThrow()
- boolean emitVirtuals()
- TT targetAsType(Class<TT>)
- ParsingException newException(String, ArgumentQueue)
- ParsingException newException(String)
- ParsingException newException(String, Throwable, ArgumentQueue)
- Component deserialize(String)
- Component deserialize(String, TagResolver)
- Component deserialize(String, TagResolver[])
- Pointered target()

### Class: net.kyori.adventure.text.minimessage.MiniMessage
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- String escapeTags(String)
- String escapeTags(String, TagResolver)
- String escapeTags(String, TagResolver[])
- **static** MiniMessage miniMessage()
- **static** MiniMessage$Builder builder()
- String stripTags(String)
- String stripTags(String, TagResolver)
- String stripTags(String, TagResolver[])
- Node$Root deserializeToTree(String)
- Node$Root deserializeToTree(String, Pointered)
- Node$Root deserializeToTree(String, TagResolver)
- Node$Root deserializeToTree(String, Pointered, TagResolver)
- Node$Root deserializeToTree(String, TagResolver[])
- Node$Root deserializeToTree(String, Pointered, TagResolver[])
- boolean strict()
- TagResolver tags()
- Component deserialize(String, Pointered)
- Component deserialize(String, TagResolver)
- Component deserialize(String, Pointered, TagResolver)
- Component deserialize(String, TagResolver[])
- Component deserialize(String, Pointered, TagResolver[])

### Class: net.kyori.adventure.text.minimessage.MiniMessage$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder

Methods:
- MiniMessage$Builder debug(Consumer<String>)
- MiniMessage$Builder preProcessor(UnaryOperator<String>)
- MiniMessage build()
- Object build()
- MiniMessage$Builder emitVirtuals(boolean)
- MiniMessage$Builder postProcessor(UnaryOperator<Component>)
- MiniMessage$Builder strict(boolean)
- MiniMessage$Builder editTags(Consumer<TagResolver$Builder>)
- MiniMessage$Builder tags(TagResolver)

### Class: net.kyori.adventure.text.minimessage.MiniMessage$Provider
Type: Interface

Methods:
- MiniMessage miniMessage()
- Consumer<MiniMessage$Builder> builder()

### Class: net.kyori.adventure.text.minimessage.ParsingException
Type: Abstract Class
Extends: java.lang.RuntimeException

Methods:
- String originalText()
- int startIndex()
- int endIndex()
- String detailMessage()

## Package: net.kyori.adventure.text.minimessage.internal

### Class: net.kyori.adventure.text.minimessage.internal.TagInternals
Type: Class

Methods:
- **static** boolean sanitizeAndCheckValidTagName(String)
- **static** void assertValidTagName(String)
- **static** void sanitizeAndAssertValidTagName(String)

## Package: net.kyori.adventure.text.minimessage.internal.parser

### Class: net.kyori.adventure.text.minimessage.internal.parser.TokenParser$TagProvider
Type: Interface

Methods:
- Tag resolve(String, List<Tag$Argument>, Token)
- Tag resolve(String)
- Tag resolve(TagNode)
- **static** String sanitizePlaceholderName(String)

### Class: net.kyori.adventure.text.minimessage.internal.parser.ParsingExceptionImpl
Type: Class
Extends: net.kyori.adventure.text.minimessage.ParsingException

Methods:
- String originalText()
- int startIndex()
- int endIndex()
- String getMessage()
- Token[] tokens()
- void tokens(Token[])
- String detailMessage()

### Class: net.kyori.adventure.text.minimessage.internal.parser.Token
Type: Class
Implements: net.kyori.examination.Examinable

Methods:
- int startIndex()
- int hashCode()
- int endIndex()
- boolean equals(Object)
- CharSequence get(CharSequence)
- String toString()
- List<Token> childTokens()
- V childTokens(List<Token>)
- Stream<ExaminableProperty> examinableProperties()
- TokenType type()

### Class: net.kyori.adventure.text.minimessage.internal.parser.TokenParser
Type: Class

Methods:
- **static** String resolvePreProcessTags(String, TokenParser$TagProvider)
- **static** V parseString(String, boolean, MatchedTokenConsumer<*>)
- **static** String unescape(String, int, int, IntPredicate)
- **static** RootNode parse(TokenParser$TagProvider, Predicate<String>, String, String, boolean)
- **static** List<Token> tokenize(String, boolean)

### Class: net.kyori.adventure.text.minimessage.internal.parser.TokenType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- TEXT
- OPEN_TAG
- OPEN_CLOSE_TAG
- CLOSE_TAG
- TAG_VALUE

Methods:
- **static** TokenType valueOf(String)
- **static** TokenType[] values()

## Package: net.kyori.adventure.text.minimessage.internal.parser.match

### Class: net.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer
Type: Abstract Class

Methods:
- TT result()
- int lastEndIndex()
- void accept(int, int, TokenType)

### Class: net.kyori.adventure.text.minimessage.internal.parser.match.StringResolvingMatchedTokenConsumer
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer

Methods:
- String result()
- Object result()
- void accept(int, int, TokenType)

### Class: net.kyori.adventure.text.minimessage.internal.parser.match.TokenListProducingMatchedTokenConsumer
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer

Methods:
- List<Token> result()
- Object result()
- void accept(int, int, TokenType)

## Package: net.kyori.adventure.text.minimessage.internal.parser.node

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode
Type: Class
Implements: net.kyori.adventure.text.minimessage.tree.Node

Methods:
- String sourceMessage()
- ElementNode parent()
- Node parent()
- List<ElementNode> unsafeChildren()
- StringBuilder buildToString(StringBuilder, int)
- List<ElementNode> children()
- String toString()
- void addChild(ElementNode)
- Token token()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.RootNode
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode
Implements: net.kyori.adventure.text.minimessage.tree.Node$Root

Methods:
- String input()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.TagNode
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode

Methods:
- StringBuilder buildToString(StringBuilder, int)
- String name()
- List<TagPart> parts()
- Tag tag()
- void tag(Tag)
- Token token()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.TagPart
Type: Class
Implements: net.kyori.adventure.text.minimessage.tag.Tag$Argument

Methods:
- **static** String unquoteAndEscape(String, int, int)
- String toString()
- String value()
- Token token()

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.TextNode
Type: Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ValueNode

No public methods found

### Class: net.kyori.adventure.text.minimessage.internal.parser.node.ValueNode
Type: Abstract Class
Extends: net.kyori.adventure.text.minimessage.internal.parser.node.ElementNode

Methods:
- StringBuilder buildToString(StringBuilder, int)
- String value()
- Token token()

## Package: net.kyori.adventure.text.minimessage.internal.serializer

### Class: net.kyori.adventure.text.minimessage.internal.serializer.ClaimConsumer
Type: Interface

Methods:
- boolean component(Emitable)
- boolean styleClaimed(String)
- boolean componentClaimed()
- void style(String, Emitable)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.Emitable
Type: Interface

Methods:
- void emit(TokenEmitter)
- Component substitute()

### Class: net.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver
Type: Interface

Methods:
- **static** TagResolver claimingStyle(String, BiFunction<ArgumentQueue, Context, Tag>, StyleClaim<*>)
- **static** TagResolver claimingStyle(Set<String>, BiFunction<ArgumentQueue, Context, Tag>, StyleClaim<*>)
- **static** TagResolver claimingComponent(String, BiFunction<ArgumentQueue, Context, Tag>, Function<Component, Emitable>)
- **static** TagResolver claimingComponent(Set<String>, BiFunction<ArgumentQueue, Context, Tag>, Function<Component, Emitable>)
- void handle(Component, ClaimConsumer)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver$Single
Type: Interface
Implements: net.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver

Methods:
- void handle(Component, ClaimConsumer)
- StyleClaim<*> claimStyle()
- Emitable claimComponent(Component)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.StyleClaim
Type: Interface

Methods:
- Emitable apply(Style)
- String claimKey()
- **static** StyleClaim<TT> claim(String, Function<Style, TT>, BiConsumer<TT, TokenEmitter>)
- **static** StyleClaim<TT> claim(String, Function<Style, TT>, Predicate<TT>, BiConsumer<TT, TokenEmitter>)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.TokenEmitter
Type: Interface

Methods:
- TokenEmitter pop()
- TokenEmitter argument(String)
- TokenEmitter argument(String, QuotingOverride)
- TokenEmitter argument(Component)
- TokenEmitter selfClosingTag(String)
- TokenEmitter arguments(String[])
- TokenEmitter text(String)
- TokenEmitter tag(String)

### Class: net.kyori.adventure.text.minimessage.internal.serializer.QuotingOverride
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UNQUOTED
- QUOTED

Methods:
- **static** QuotingOverride valueOf(String)
- **static** QuotingOverride[] values()

## Package: net.kyori.adventure.text.minimessage.tag

### Class: net.kyori.adventure.text.minimessage.tag.Inserting
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

Methods:
- boolean allowsChildren()
- Component value()

### Class: net.kyori.adventure.text.minimessage.tag.Modifying
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

Methods:
- void postVisit()
- Component apply(Component, int)
- void visit(Node, int)

### Class: net.kyori.adventure.text.minimessage.tag.ParserDirective
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

No public methods found

### Class: net.kyori.adventure.text.minimessage.tag.PreProcess
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.Tag

Methods:
- String value()

### Class: net.kyori.adventure.text.minimessage.tag.Tag
Type: Interface

Methods:
- **static** Tag styling(Consumer<Style$Builder>)
- **static** Tag styling(StyleBuilderApplicable[])
- **static** PreProcess preProcessParsed(String)
- **static** Tag inserting(Component)
- **static** Tag inserting(ComponentLike)
- **static** Tag selfClosingInserting(Component)
- **static** Tag selfClosingInserting(ComponentLike)

### Class: net.kyori.adventure.text.minimessage.tag.Tag$Argument
Type: Interface

Methods:
- OptionalInt asInt()
- boolean isTrue()
- OptionalDouble asDouble()
- boolean isFalse()
- String lowerValue()
- String value()

### Class: net.kyori.adventure.text.minimessage.tag.TagPattern
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

## Package: net.kyori.adventure.text.minimessage.tag.resolver

### Class: net.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue
Type: Interface

Methods:
- Tag$Argument pop()
- void reset()
- boolean hasNext()
- Tag$Argument popOr(String)
- Tag$Argument popOr(Supplier<String>)
- Tag$Argument peek()

### Class: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver
Type: Interface

Methods:
- **static** TagResolver standard()
- **static** TagResolver$Single resolver(String, Tag)
- **static** TagResolver resolver(String, BiFunction<ArgumentQueue, Context, Tag>)
- **static** TagResolver resolver(Set<String>, BiFunction<ArgumentQueue, Context, Tag>)
- **static** TagResolver resolver(TagResolver[])
- **static** TagResolver resolver(Iterable<TagResolver>)
- Tag resolve(String, ArgumentQueue, Context) throws ParsingException
- **static** TagResolver$Builder builder()
- boolean has(String)
- **static** Collector<TagResolver, TagResolver> toTagResolver()
- **static** TagResolver caching(TagResolver$WithoutArguments)
- **static** TagResolver empty()

### Class: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver$Builder
Type: Interface

Methods:
- TagResolver$Builder resolver(TagResolver)
- TagResolver$Builder resolvers(TagResolver[])
- TagResolver$Builder resolvers(Iterable<TagResolver>)
- TagResolver build()
- TagResolver$Builder tag(String, Tag)
- TagResolver$Builder tag(String, BiFunction<ArgumentQueue, Context, Tag>)
- TagResolver$Builder tag(Set<String>, BiFunction<ArgumentQueue, Context, Tag>)
- TagResolver$Builder caching(TagResolver$WithoutArguments)

### Class: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver$Single
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver$WithoutArguments

Methods:
- Tag resolve(String)
- boolean has(String)
- Tag tag()
- String key()

### Class: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver$WithoutArguments
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tag.resolver.TagResolver

Methods:
- Tag resolve(String)
- Tag resolve(String, ArgumentQueue, Context) throws ParsingException
- boolean has(String)

## Package: net.kyori.adventure.text.minimessage.tag.standard

### Class: net.kyori.adventure.text.minimessage.tag.standard.StandardTags
Type: Class

Methods:
- **static** TagResolver nbt()
- **static** TagResolver translatable()
- **static** TagResolver color()
- **static** TagResolver gradient()
- **static** TagResolver decorations(TextDecoration)
- **static** TagResolver decorations()
- **static** TagResolver transition()
- **static** TagResolver hoverEvent()
- **static** TagResolver score()
- **static** TagResolver rainbow()
- **static** TagResolver clickEvent()
- **static** TagResolver newline()
- **static** TagResolver defaults()
- **static** TagResolver pride()
- **static** TagResolver keybind()
- **static** TagResolver reset()
- **static** TagResolver translatableFallback()
- **static** TagResolver selector()
- **static** TagResolver insertion()
- **static** TagResolver shadowColor()
- **static** TagResolver font()

### Class: net.kyori.adventure.text.minimessage.tag.standard.TransitionTag
Type: Class
Implements: net.kyori.adventure.text.minimessage.tag.Inserting, net.kyori.examination.Examinable

Methods:
- int hashCode()
- boolean equals(Object)
- Stream<ExaminableProperty> examinableProperties()
- Component value()

## Package: net.kyori.adventure.text.minimessage.tree

### Class: net.kyori.adventure.text.minimessage.tree.Node
Type: Interface

Methods:
- Node parent()
- List<Node> children()
- String toString()

### Class: net.kyori.adventure.text.minimessage.tree.Node$Root
Type: Interface
Implements: net.kyori.adventure.text.minimessage.tree.Node

Methods:
- String input()

## Package: net.kyori.adventure.text.renderer

### Class: net.kyori.adventure.text.renderer.ComponentRenderer
Type: Interface

Methods:
- ComponentRenderer<TT> mapContext(Function<TT, TC>)
- Component render(Component, T)

### Class: net.kyori.adventure.text.renderer.AbstractComponentRenderer
Type: Abstract Class
Implements: net.kyori.adventure.text.renderer.ComponentRenderer

Methods:
- Component render(Component, T)

### Class: net.kyori.adventure.text.renderer.TranslatableComponentRenderer
Type: Abstract Class
Extends: net.kyori.adventure.text.renderer.AbstractComponentRenderer

Methods:
- **static** TranslatableComponentRenderer<Locale> usingTranslationSource(Translator)

## Package: net.kyori.adventure.text.serializer

### Class: net.kyori.adventure.text.serializer.ComponentDecoder
Type: Interface

Methods:
- TO deserializeOr(T, short)
- TO deserializeOrNull(T)
- TO deserialize(T)

### Class: net.kyori.adventure.text.serializer.ComponentEncoder
Type: Interface

Methods:
- TR serializeOr(T, int)
- TR serializeOrNull(T)
- TR serialize(T)

### Class: net.kyori.adventure.text.serializer.ComponentSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentEncoder, net.kyori.adventure.text.serializer.ComponentDecoder

Methods:
- TR serializeOr(T, int)
- TR serializeOrNull(T)
- TR serialize(T)
- TO deseializeOrNull(T)
- TO deserializeOr(T, R)
- TO deserializeOrNull(T)
- TO deserialize(T)

## Package: net.kyori.adventure.text.serializer.bungeecord

### Class: net.kyori.adventure.text.serializer.bungeecord.BungeeComponentSerializer
Type: Class
Implements: net.kyori.adventure.text.serializer.ComponentSerializer

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

### Class: net.kyori.adventure.text.serializer.bungeecord.SelfSerializable$AdapterFactory
Type: Class
Implements: com.google.gson.TypeAdapterFactory

Methods:
- TypeAdapter<TT> create(Gson, TypeToken<TT>)

## Package: net.kyori.adventure.text.serializer.gson

### Class: net.kyori.adventure.text.serializer.gson.GsonComponentSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.json.JSONComponentSerializer, net.kyori.adventure.util.Buildable

Methods:
- JsonElement serializeToTree(Component)
- Component deserializeFromTree(JsonElement)
- **static** GsonComponentSerializer$Builder builder()
- Gson serializer()
- **static** GsonComponentSerializer colorDownsamplingGson()
- **static** GsonComponentSerializer gson()
- UnaryOperator<GsonBuilder> populator()

### Class: net.kyori.adventure.text.serializer.gson.GsonComponentSerializer$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder, net.kyori.adventure.text.serializer.json.JSONComponentSerializer$Builder

Methods:
- GsonComponentSerializer build()
- Object build()
- JSONComponentSerializer build()
- GsonComponentSerializer$Builder emitLegacyHoverEvent()
- JSONComponentSerializer$Builder emitLegacyHoverEvent()
- GsonComponentSerializer$Builder legacyHoverEventSerializer(LegacyHoverEventSerializer)
- GsonComponentSerializer$Builder legacyHoverEventSerializer(LegacyHoverEventSerializer)
- JSONComponentSerializer$Builder legacyHoverEventSerializer(LegacyHoverEventSerializer)
- GsonComponentSerializer$Builder editOptions(Consumer<OptionState$Builder>)
- JSONComponentSerializer$Builder editOptions(Consumer)
- GsonComponentSerializer$Builder options(OptionState)
- JSONComponentSerializer$Builder options(OptionState)
- GsonComponentSerializer$Builder downsampleColors()
- JSONComponentSerializer$Builder downsampleColors()

### Class: net.kyori.adventure.text.serializer.gson.GsonComponentSerializer$Provider
Type: Interface

Methods:
- Consumer<GsonComponentSerializer$Builder> builder()
- GsonComponentSerializer gson()
- GsonComponentSerializer gsonLegacy()

### Class: net.kyori.adventure.text.serializer.gson.GsonDataComponentValue
Type: Interface
Implements: net.kyori.adventure.text.event.DataComponentValue

Methods:
- **static** GsonDataComponentValue gsonDataComponentValue(JsonElement)
- JsonElement element()

### Class: net.kyori.adventure.text.serializer.gson.LegacyHoverEventSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.json.LegacyHoverEventSerializer

No public methods found

## Package: net.kyori.adventure.text.serializer.json

### Class: net.kyori.adventure.text.serializer.json.JSONComponentSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- **static** JSONComponentSerializer$Builder builder()
- **static** JSONComponentSerializer json()

### Class: net.kyori.adventure.text.serializer.json.JSONComponentSerializer$Builder
Type: Interface

Methods:
- JSONComponentSerializer build()
- JSONComponentSerializer$Builder emitLegacyHoverEvent()
- JSONComponentSerializer$Builder legacyHoverEventSerializer(LegacyHoverEventSerializer)
- JSONComponentSerializer$Builder editOptions(Consumer<OptionState$Builder>)
- JSONComponentSerializer$Builder options(OptionState)
- JSONComponentSerializer$Builder downsampleColors()

### Class: net.kyori.adventure.text.serializer.json.JSONComponentSerializer$Provider
Type: Interface

Methods:
- JSONComponentSerializer instance()
- Supplier<JSONComponentSerializer$Builder> builder()

### Class: net.kyori.adventure.text.serializer.json.LegacyHoverEventSerializer
Type: Interface

Methods:
- HoverEvent$ShowItem deserializeShowItem(Component) throws IOException
- HoverEvent$ShowEntity deserializeShowEntity(Component, Codec$Decoder<Component, String, RuntimeException>) throws IOException
- Component serializeShowEntity(HoverEvent$ShowEntity, Codec$Encoder<Component, String, RuntimeException>) throws IOException
- Component serializeShowItem(HoverEvent$ShowItem) throws IOException

### Class: net.kyori.adventure.text.serializer.json.JSONOptions
Type: Class

Methods:
- **static** OptionSchema schema()
- **static** OptionState$Versioned byDataVersion()
- **static** OptionState compatibility()

### Class: net.kyori.adventure.text.serializer.json.JSONOptions$ClickEventValueMode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SNAKE_CASE
- CAMEL_CASE
- BOTH

Methods:
- **static** JSONOptions$ClickEventValueMode valueOf(String)
- **static** JSONOptions$ClickEventValueMode[] values()

### Class: net.kyori.adventure.text.serializer.json.JSONOptions$HoverEventValueMode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SNAKE_CASE
- CAMEL_CASE
- VALUE_FIELD
- ALL

Methods:
- **static** JSONOptions$HoverEventValueMode valueOf(String)
- **static** JSONOptions$HoverEventValueMode[] values()

### Class: net.kyori.adventure.text.serializer.json.JSONOptions$ShadowColorEmitMode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NONE
- EMIT_INTEGER
- EMIT_ARRAY

Methods:
- **static** JSONOptions$ShadowColorEmitMode valueOf(String)
- **static** JSONOptions$ShadowColorEmitMode[] values()

### Class: net.kyori.adventure.text.serializer.json.JSONOptions$ShowItemHoverDataMode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- EMIT_LEGACY_NBT
- EMIT_DATA_COMPONENTS
- EMIT_EITHER

Methods:
- **static** JSONOptions$ShowItemHoverDataMode valueOf(String)
- **static** JSONOptions$ShowItemHoverDataMode[] values()

## Package: net.kyori.adventure.text.serializer.json.legacyimpl

### Class: net.kyori.adventure.text.serializer.json.legacyimpl.NBTLegacyHoverEventSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.json.LegacyHoverEventSerializer

Methods:
- **static** LegacyHoverEventSerializer get()

## Package: net.kyori.adventure.text.serializer.legacy

### Class: net.kyori.adventure.text.serializer.legacy.CharacterAndFormat
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- char character()
- **static** List<CharacterAndFormat> defaults()
- TextFormat format()
- boolean caseInsensitive()
- **static** CharacterAndFormat characterAndFormat(char, TextFormat)
- **static** CharacterAndFormat characterAndFormat(char, TextFormat, boolean)
- Stream<ExaminableProperty> examinableProperties()

### Class: net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentSerializer, net.kyori.adventure.util.Buildable

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

### Class: net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- LegacyComponentSerializer$Builder flattener(ComponentFlattener)
- LegacyComponentSerializer$Builder extractUrls()
- LegacyComponentSerializer$Builder extractUrls(Pattern)
- LegacyComponentSerializer$Builder extractUrls(Style)
- LegacyComponentSerializer$Builder extractUrls(Pattern, Style)
- LegacyComponentSerializer$Builder character(char)
- LegacyComponentSerializer$Builder formats(List<CharacterAndFormat>)
- LegacyComponentSerializer$Builder useUnusualXRepeatedCharacterHexFormat()
- LegacyComponentSerializer build()
- Object build()
- LegacyComponentSerializer$Builder hexColors()
- LegacyComponentSerializer$Builder hexCharacter(char)

### Class: net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer$Provider
Type: Interface

Methods:
- Consumer<LegacyComponentSerializer$Builder> legacy()
- LegacyComponentSerializer legacyAmpersand()
- LegacyComponentSerializer legacySection()

### Class: net.kyori.adventure.text.serializer.legacy.LegacyFormat
Type: Class
Implements: net.kyori.examination.Examinable

Methods:
- TextColor color()
- int hashCode()
- boolean equals(Object)
- boolean reset()
- Stream<ExaminableProperty> examinableProperties()
- TextDecoration decoration()

### Class: net.kyori.adventure.text.serializer.legacy.Reset
Type: Enum
Extends: java.lang.Enum
Implements: net.kyori.adventure.text.format.TextFormat

Enum Constants:
- INSTANCE

Methods:
- **static** Reset valueOf(String)
- **static** Reset[] values()

## Package: net.kyori.adventure.text.serializer.plain

### Class: net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer
Type: Interface
Implements: net.kyori.adventure.text.serializer.ComponentSerializer, net.kyori.adventure.util.Buildable

Methods:
- String serialize(Component)
- void serialize(StringBuilder, Component)
- Object serialize(Component)
- **static** PlainTextComponentSerializer$Builder builder()
- **static** PlainTextComponentSerializer plainText()
- TextComponent deserialize(String)
- Component deserialize(Object)

### Class: net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- PlainTextComponentSerializer$Builder flattener(ComponentFlattener)

### Class: net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer$Provider
Type: Interface

Methods:
- PlainTextComponentSerializer plainTextSimple()
- Consumer<PlainTextComponentSerializer$Builder> plainText()

## Package: net.kyori.adventure.title

### Class: net.kyori.adventure.title.Title
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- Title$Times times()
- TT part(TitlePart<TT>)
- Component subtitle()
- **static** Title title(Component, Component)
- **static** Title title(Component, Component, Title$Times)
- Component title()

### Class: net.kyori.adventure.title.Title$Times
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** Title$Times times(Duration, Duration, Duration)
- Duration fadeOut()
- Duration fadeIn()
- **static** Title$Times of(Duration, Duration, Duration)
- Duration stay()

### Class: net.kyori.adventure.title.TitlePart
Type: Interface

No public methods found

## Package: net.kyori.adventure.translation

### Class: net.kyori.adventure.translation.GlobalTranslator
Type: Interface
Implements: net.kyori.adventure.translation.Translator, net.kyori.examination.Examinable

Methods:
- **static** TranslatableComponentRenderer<Locale> renderer()
- boolean removeSource(Translator)
- boolean addSource(Translator)
- Iterable<Translator> sources()
- **static** GlobalTranslator get()
- **static** GlobalTranslator translator()
- **static** Component render(Component, Locale)

### Class: net.kyori.adventure.translation.Translatable
Type: Interface

Methods:
- String translationKey()

### Class: net.kyori.adventure.translation.TranslationRegistry
Type: Interface
Implements: net.kyori.adventure.translation.Translator, net.kyori.adventure.translation.TranslationStore$StringBased

Methods:
- void defaultLocale(Locale)
- boolean contains(String)
- V registerAll(Locale, Map<String, MessageFormat>)
- void registerAll(Locale, Path, boolean)
- void registerAll(Locale, ResourceBundle, boolean)
- V registerAll(Locale, Set<String>, Function<String, MessageFormat>)
- void unregister(String)
- **static** TranslationRegistry create(Key)
- MessageFormat translate(String, Locale)
- void register(String, Locale, MessageFormat)
- void register(String, Locale, Object)

### Class: net.kyori.adventure.translation.TranslationStore
Type: Interface
Implements: net.kyori.adventure.translation.Translator

Methods:
- void defaultLocale(Locale)
- boolean canTranslate(String, Locale)
- boolean contains(String)
- boolean contains(String, Locale)
- **static** TranslationStore<Component> component(Key)
- **static** TranslationStore$StringBased<MessageFormat> messageFormat(Key)
- V registerAll(Locale, Map<String, TT>)
- V registerAll(Locale, Set<String>, Function<String, TT>)
- void unregister(String)
- V register(String, Locale, T)

### Class: net.kyori.adventure.translation.TranslationStore$StringBased
Type: Interface
Implements: net.kyori.adventure.translation.TranslationStore

Methods:
- void registerAll(Locale, Path, boolean)
- void registerAll(Locale, ResourceBundle, boolean)

### Class: net.kyori.adventure.translation.Translator
Type: Interface

Methods:
- boolean canTranslate(String, Locale)
- Key name()
- TriState hasAnyTranslations()
- MessageFormat translate(String, Locale)
- Component translate(TranslatableComponent, Locale)
- **static** Locale parseLocale(String)

### Class: net.kyori.adventure.translation.AbstractTranslationStore
Type: Abstract Class
Implements: net.kyori.examination.Examinable, net.kyori.adventure.translation.TranslationStore

Methods:
- void defaultLocale(Locale)
- boolean canTranslate(String, Locale)
- boolean contains(String)
- boolean contains(String, Locale)
- int hashCode()
- V registerAll(Locale, Map<String, TT>)
- V registerAll(Locale, Set<String>, Function<String, TT>)
- boolean equals(Object)
- Key name()
- void unregister(String)
- String toString()
- Stream<ExaminableProperty> examinableProperties()
- TriState hasAnyTranslations()
- V register(String, Locale, T)

### Class: net.kyori.adventure.translation.AbstractTranslationStore$StringBased
Type: Abstract Class
Extends: net.kyori.adventure.translation.AbstractTranslationStore
Implements: net.kyori.adventure.translation.TranslationStore$StringBased

Methods:
- void registerAll(Locale, Path, boolean)
- void registerAll(Locale, ResourceBundle, boolean)

## Package: net.kyori.adventure.util

### Class: net.kyori.adventure.util.ARGBLike
Type: Interface
Implements: net.kyori.adventure.util.RGBLike

Methods:
- int alpha()

### Class: net.kyori.adventure.util.Buildable
Type: Interface

Methods:
- TB toBuilder()
- **static** TR configureAndBuild(T, byte)

### Class: net.kyori.adventure.util.Buildable$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder

Methods:
- TR build()

### Class: net.kyori.adventure.util.Codec
Type: Interface

Methods:
- TE^TEX encode(T) throws Throwable
- **static** Codec<TD, TE, TDX, TEX> codec(Codec$Decoder<TD, TE, TDX>, Codec$Encoder<TD, TE, TEX>)
- **static** Codec<TD, TE, TDX, TEX> of(Codec$Decoder<TD, TE, TDX>, Codec$Encoder<TD, TE, TEX>)
- TD^TDX decode(T) throws Throwable

### Class: net.kyori.adventure.util.Codec$Decoder
Type: Interface

Methods:
- TD^TX decode(T) throws Throwable

### Class: net.kyori.adventure.util.Codec$Encoder
Type: Interface

Methods:
- TE^TX encode(T) throws Throwable

### Class: net.kyori.adventure.util.HSVLike
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** HSVLike fromRGB(int, int, int)
- float s()
- float v()
- **static** HSVLike of(float, float, float)
- float h()
- **static** HSVLike hsvLike(float, float, float)
- Stream<ExaminableProperty> examinableProperties()

### Class: net.kyori.adventure.util.InheritanceAwareMap
Type: Interface

Methods:
- InheritanceAwareMap<TC, TV> with(Class<+TC>, T)
- Z containsKey(Class<+TC>)
- TV get(Class<+TC>)
- **static** InheritanceAwareMap$Builder<TK, TE> builder()
- **static** InheritanceAwareMap$Builder<TK, TE> builder(InheritanceAwareMap<+TK, +TE>)
- InheritanceAwareMap<TC, TV> without(Class<+TC>)
- **static** InheritanceAwareMap<TK, TE> empty()

### Class: net.kyori.adventure.util.InheritanceAwareMap$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder

Methods:
- InheritanceAwareMap$Builder<TC, TV> putAll(InheritanceAwareMap<+TC, +TV>)
- InheritanceAwareMap$Builder<TC, TV> strict(boolean)
- InheritanceAwareMap$Builder<TC, TV> remove(Class<+TC>)
- InheritanceAwareMap$Builder<TC, TV> put(Class<+TC>, T)

### Class: net.kyori.adventure.util.IntFunction2
Type: Interface

Methods:
- TR apply(int, int)

### Class: net.kyori.adventure.util.PlatformAPI
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.kyori.adventure.util.RGBLike
Type: Interface

Methods:
- int red()
- int green()
- int blue()
- HSVLike asHSV()

### Class: net.kyori.adventure.util.Services$Fallback
Type: Interface

No public methods found

### Class: net.kyori.adventure.util.Ticks
Type: Interface

Methods:
- **static** Duration duration(long)

### Class: net.kyori.adventure.util.ForwardingIterator
Type: Class
Implements: java.lang.Iterable

Methods:
- Iterator<TT> iterator()
- Spliterator<TT> spliterator()

### Class: net.kyori.adventure.util.Index
Type: Class

Methods:
- TK keyOr(T, void)
- TK keyOrThrow(T)
- Set<TK> keys()
- Set<TV> values()
- Map<TK, TV> keyToValue()
- **static** Index<TK, TV> create(Class<TV>, Function<-TV, +TK>)
- **static** Index<TK, TV> create(Class<TV>, Function<-TV, +TK>, [T)
- **static** Index<TK, TV> create(Function<-TV, +TK>, [T)
- **static** Index<TK, TV> create(Function<-TV, +TK>, List<TV>)
- TV valueOr(T, K)
- TV valueOrThrow(T)
- TV value(T)
- TK key(T)
- Map<TV, TK> valueToKey()

### Class: net.kyori.adventure.util.MonkeyBars
Type: Class

Methods:
- **static** List<TT> addOne(List<TT>, T)
- **static** List<TO> toUnmodifiableList(Function<TI, TO>, Iterable<+TI>)
- **static** List<TO> nonEmptyArrayToList(Function<TI, TO>, T, int)
- **static** Set<TE> enumSet(Class<TE>, [T)

### Class: net.kyori.adventure.util.Nag
Type: Abstract Class
Extends: java.lang.RuntimeException

Methods:
- **static** void print(Nag)

### Class: net.kyori.adventure.util.Services
Type: Class

Methods:
- **static** Optional<TP> serviceWithFallback(Class<TP>)
- **static** Optional<TP> service(Class<TP>)
- **static** Set<TP> services(Class<+TP>)

### Class: net.kyori.adventure.util.ShadyPines
Type: Class

Methods:
- **static** boolean equals(double, double)
- **static** boolean equals(float, float)
- **static** Set<TE> enumSet(Class<TE>, [T)

### Class: net.kyori.adventure.util.TriState
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NOT_SET
- FALSE
- TRUE

Methods:
- boolean toBooleanOrElseGet(BooleanSupplier)
- **static** TriState byBoolean(boolean)
- **static** TriState byBoolean(Boolean)
- Boolean toBoolean()
- boolean toBooleanOrElse(boolean)
- **static** TriState valueOf(String)
- **static** TriState[] values()

## Package: net.kyori.examination

### Class: net.kyori.examination.Examinable
Type: Interface

Methods:
- TR examine(Examiner<TR>)
- Stream<ExaminableProperty> examinableProperties()
- String examinableName()

### Class: net.kyori.examination.Examiner
Type: Interface

Methods:
- TR examine(Examinable)
- TR examine(String, Stream<ExaminableProperty>)
- TR examine(Object)
- TR examine(boolean)
- TR examine([Z)
- TR examine(byte)
- TR examine([B)
- TR examine(char)
- TR examine([C)
- TR examine(double)
- TR examine([D)
- TR examine(float)
- TR examine([F)
- TR examine(int)
- TR examine([I)
- TR examine(long)
- TR examine([J)
- TR examine(short)
- TR examine([S)
- TR examine(String)

### Class: net.kyori.examination.AbstractExaminer
Type: Abstract Class
Implements: net.kyori.examination.Examiner

Methods:
- TR examine(Object)
- TR examine(String, Stream<ExaminableProperty>)
- TR examine([Z)
- TR examine([B)
- TR examine([C)
- TR examine([D)
- TR examine([F)
- TR examine([I)
- TR examine([J)
- TR examine([S)

### Class: net.kyori.examination.ExaminableProperty
Type: Abstract Class

Methods:
- TR examine(Examiner<+TR>)
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

## Package: net.kyori.examination.string

### Class: net.kyori.examination.string.MultiLineStringExaminer
Type: Class
Extends: net.kyori.examination.AbstractExaminer

Methods:
- Stream<String> examine(boolean)
- Stream<String> examine(byte)
- Stream<String> examine(char)
- Stream<String> examine(double)
- Stream<String> examine(float)
- Stream<String> examine(int)
- Stream<String> examine(long)
- Stream<String> examine(short)
- Stream<String> examine(String)
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

### Class: net.kyori.examination.string.StringExaminer
Type: Class
Extends: net.kyori.examination.AbstractExaminer

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

## Package: net.kyori.option

### Class: net.kyori.option.Option
Type: Interface

Methods:
- TV defaultValue()
- ValueType<TV> valueType()
- **static** Option<TE> enumOption(String, Class<TE>, T)
- String id()
- Class<TV> type()
- **static** Option<Boolean> booleanOption(String, boolean)

### Class: net.kyori.option.OptionSchema
Type: Interface

Methods:
- OptionState emptyState()
- **static** OptionSchema$Mutable childSchema(OptionSchema)
- OptionState$VersionedBuilder versionedStateBuilder()
- Set<Option<*>> knownOptions()
- Z has(Option<*>)
- **static** OptionSchema$Mutable globalSchema()
- OptionState$Builder stateBuilder()
- **static** OptionSchema$Mutable emptySchema()

### Class: net.kyori.option.OptionSchema$Mutable
Type: Interface
Implements: net.kyori.option.OptionSchema

Methods:
- Option<String> stringOption(String, String)
- Option<Integer> intOption(String, int)
- OptionSchema frozenView()
- Option<Double> doubleOption(String, double)
- Option<TE> enumOption(String, Class<TE>, T)
- Option<Boolean> booleanOption(String, boolean)

### Class: net.kyori.option.OptionState
Type: Interface

Methods:
- OptionSchema schema()
- **static** OptionState$Builder optionState()
- **static** OptionState emptyOptionState()
- **static** OptionState$VersionedBuilder versionedOptionState()
- Z has(Option<*>)
- TV value(Option<TV>)

### Class: net.kyori.option.OptionState$Builder
Type: Interface

Methods:
- OptionState build()
- OptionState$Builder values(OptionState)
- OptionState$Builder values(ValueSource)
- OptionState$Builder value(Option<TV>, T)

### Class: net.kyori.option.OptionState$Versioned
Type: Interface
Implements: net.kyori.option.OptionState

Methods:
- OptionState$Versioned at(int)
- Map<Integer, OptionState> childStates()

### Class: net.kyori.option.OptionState$VersionedBuilder
Type: Interface

Methods:
- OptionState$Versioned build()
- OptionState$VersionedBuilder version(int, Consumer<OptionState$Builder>)

## Package: net.kyori.option.value

### Class: net.kyori.option.value.ValueSource
Type: Interface

Methods:
- **static** ValueSource systemProperty()
- **static** ValueSource systemProperty(String)
- TT value(Option<TT>)
- **static** ValueSource environmentVariable()
- **static** ValueSource environmentVariable(String)

### Class: net.kyori.option.value.ValueType
Type: Interface

Methods:
- **static** ValueType<Double> doubleType()
- **static** ValueType<Boolean> booleanType()
- **static** ValueType<Integer> integerType()
- **static** ValueType<String> stringType()
- **static** ValueType<TE> enumType(Class<TE>)
- TT parse(String) throws IllegalArgumentException
- Class<TT> type()

## Package: org.apache.commons.lang3

### Class: org.apache.commons.lang3.AppendableJoiner
Type: Class

Methods:
- **static** AppendableJoiner$Builder<TT> builder()
- StringBuilder join(StringBuilder, Iterable<TT>)
- StringBuilder join(StringBuilder, [T)
- TA joinA(T, A)
- TA joinA(T, A)

### Class: org.apache.commons.lang3.AppendableJoiner$Builder
Type: Class
Implements: java.util.function.Supplier

Methods:
- AppendableJoiner$Builder<TT> setElementAppender(FailableBiConsumer<Appendable, TT, IOException>)
- AppendableJoiner$Builder<TT> setPrefix(CharSequence)
- AppendableJoiner$Builder<TT> setDelimiter(CharSequence)
- AppendableJoiner<TT> get()
- Object get()
- AppendableJoiner$Builder<TT> setSuffix(CharSequence)

### Class: org.apache.commons.lang3.ArrayFill
Type: Class

Methods:
- **static** byte[] fill(byte[], byte)
- **static** char[] fill(char[], char)
- **static** double[] fill(double[], double)
- **static** float[] fill(float[], float)
- **static** int[] fill(int[], int)
- **static** long[] fill(long[], long)
- **static** short[] fill(short[], short)
- **static** [TT fill([T, T)

### Class: org.apache.commons.lang3.ArraySorter
Type: Class

Methods:
- **static** byte[] sort(byte[])
- **static** char[] sort(char[])
- **static** double[] sort(double[])
- **static** float[] sort(float[])
- **static** int[] sort(int[])
- **static** long[] sort(long[])
- **static** short[] sort(short[])
- **static** [TT sort([T)
- **static** [TT sort([T, T)

### Class: org.apache.commons.lang3.ArrayUtils
Type: Class

Methods:
- **static** void shift(boolean[], int)
- **static** void shift(boolean[], int, int, int)
- **static** void shift(byte[], int)
- **static** void shift(byte[], int, int, int)
- **static** void shift(char[], int)
- **static** void shift(char[], int, int, int)
- **static** void shift(double[], int)
- **static** void shift(double[], int, int, int)
- **static** void shift(float[], int)
- **static** void shift(float[], int, int, int)
- **static** void shift(int[], int)
- **static** void shift(int[], int, int, int)
- **static** void shift(long[], int)
- **static** void shift(long[], int, int, int)
- **static** void shift(Object[], int)
- **static** void shift(Object[], int, int, int)
- **static** void shift(short[], int)
- **static** void shift(short[], int, int, int)
- **static** boolean isSameLength(boolean[], boolean[])
- **static** boolean isSameLength(byte[], byte[])
- **static** boolean isSameLength(char[], char[])
- **static** boolean isSameLength(double[], double[])
- **static** boolean isSameLength(float[], float[])
- **static** boolean isSameLength(int[], int[])
- **static** boolean isSameLength(long[], long[])
- **static** boolean isSameLength(Object, Object)
- **static** boolean isSameLength(Object[], Object[])
- **static** boolean isSameLength(short[], short[])
- **static** boolean[] insert(int, boolean[], boolean[])
- **static** byte[] insert(int, byte[], byte[])
- **static** char[] insert(int, char[], char[])
- **static** double[] insert(int, double[], double[])
- **static** float[] insert(int, float[], float[])
- **static** int[] insert(int, int[], int[])
- **static** long[] insert(int, long[], long[])
- **static** short[] insert(int, short[], short[])
- **static** [TT insert(int, [T, T)
- **static** boolean[] remove(boolean[], int)
- **static** byte[] remove(byte[], int)
- **static** char[] remove(char[], int)
- **static** double[] remove(double[], int)
- **static** float[] remove(float[], int)
- **static** int[] remove(int[], int)
- **static** long[] remove(long[], int)
- **static** short[] remove(short[], int)
- **static** [TT remove([T, T)
- **static** BitSet indexesOf(boolean[], boolean)
- **static** BitSet indexesOf(boolean[], boolean, int)
- **static** BitSet indexesOf(byte[], byte)
- **static** BitSet indexesOf(byte[], byte, int)
- **static** BitSet indexesOf(char[], char)
- **static** BitSet indexesOf(char[], char, int)
- **static** BitSet indexesOf(double[], double)
- **static** BitSet indexesOf(double[], double, double)
- **static** BitSet indexesOf(double[], double, int)
- **static** BitSet indexesOf(double[], double, int, double)
- **static** BitSet indexesOf(float[], float)
- **static** BitSet indexesOf(float[], float, int)
- **static** BitSet indexesOf(int[], int)
- **static** BitSet indexesOf(int[], int, int)
- **static** BitSet indexesOf(long[], long)
- **static** BitSet indexesOf(long[], long, int)
- **static** BitSet indexesOf(Object[], Object)
- **static** BitSet indexesOf(Object[], Object, int)
- **static** BitSet indexesOf(short[], short)
- **static** BitSet indexesOf(short[], short, int)
- **static** boolean[] removeAll(boolean[], int[])
- **static** byte[] removeAll(byte[], int[])
- **static** char[] removeAll(char[], int[])
- **static** double[] removeAll(double[], int[])
- **static** float[] removeAll(float[], int[])
- **static** int[] removeAll(int[], int[])
- **static** long[] removeAll(long[], int[])
- **static** short[] removeAll(short[], int[])
- **static** [TT removeAll([T, T)
- **static** boolean[] removeAllOccurrences(boolean[], boolean)
- **static** byte[] removeAllOccurrences(byte[], byte)
- **static** char[] removeAllOccurrences(char[], char)
- **static** double[] removeAllOccurrences(double[], double)
- **static** float[] removeAllOccurrences(float[], float)
- **static** int[] removeAllOccurrences(int[], int)
- **static** long[] removeAllOccurrences(long[], long)
- **static** short[] removeAllOccurrences(short[], short)
- **static** [TT removeAllOccurrences([T, T)
- **static** int hashCode(Object)
- **static** TT arraycopy(T, T, ;, int, int)
- **static** TT arraycopy(T, T, ;, int, int)
- **static** TT arraycopy(T, T, ;, int, T)
- **static** TT get([T, T)
- **static** TT get([T, T, ;)
- **static** [TT toArray([T)
- **static** boolean isSameType(Object, Object)
- **static** Boolean[] toObject(boolean[])
- **static** Byte[] toObject(byte[])
- **static** Character[] toObject(char[])
- **static** Double[] toObject(double[])
- **static** Float[] toObject(float[])
- **static** Integer[] toObject(int[])
- **static** Long[] toObject(long[])
- **static** Short[] toObject(short[])
- **static** [TT setAll([T, T)
- **static** [TT setAll([T, T)
- **static** int indexOf(boolean[], boolean)
- **static** int indexOf(boolean[], boolean, int)
- **static** int indexOf(byte[], byte)
- **static** int indexOf(byte[], byte, int)
- **static** int indexOf(char[], char)
- **static** int indexOf(char[], char, int)
- **static** int indexOf(double[], double)
- **static** int indexOf(double[], double, double)
- **static** int indexOf(double[], double, int)
- **static** int indexOf(double[], double, int, double)
- **static** int indexOf(float[], float)
- **static** int indexOf(float[], float, int)
- **static** int indexOf(int[], int)
- **static** int indexOf(int[], int, int)
- **static** int indexOf(long[], long)
- **static** int indexOf(long[], long, int)
- **static** int indexOf(Object[], Object)
- **static** int indexOf(Object[], Object, int)
- **static** int indexOf(short[], short)
- **static** int indexOf(short[], short, int)
- **static** boolean[] add(boolean[], boolean)
- **static** boolean[] add(boolean[], int, boolean)
- **static** byte[] add(byte[], byte)
- **static** byte[] add(byte[], int, byte)
- **static** char[] add(char[], char)
- **static** char[] add(char[], int, char)
- **static** double[] add(double[], double)
- **static** double[] add(double[], int, double)
- **static** float[] add(float[], float)
- **static** float[] add(float[], int, float)
- **static** int[] add(int[], int)
- **static** int[] add(int[], int, int)
- **static** long[] add(long[], int, long)
- **static** long[] add(long[], long)
- **static** short[] add(short[], int, short)
- **static** short[] add(short[], short)
- **static** [TT add([T, T, ;)
- **static** [TT add([T, T)
- **static** boolean[] toPrimitive(Boolean[])
- **static** boolean[] toPrimitive(Boolean[], boolean)
- **static** byte[] toPrimitive(Byte[])
- **static** byte[] toPrimitive(Byte[], byte)
- **static** char[] toPrimitive(Character[])
- **static** char[] toPrimitive(Character[], char)
- **static** double[] toPrimitive(Double[])
- **static** double[] toPrimitive(Double[], double)
- **static** float[] toPrimitive(Float[])
- **static** float[] toPrimitive(Float[], float)
- **static** int[] toPrimitive(Integer[])
- **static** int[] toPrimitive(Integer[], int)
- **static** long[] toPrimitive(Long[])
- **static** long[] toPrimitive(Long[], long)
- **static** Object toPrimitive(Object)
- **static** short[] toPrimitive(Short[])
- **static** short[] toPrimitive(Short[], short)
- **static** boolean[] nullToEmpty(boolean[])
- **static** Boolean[] nullToEmpty(Boolean[])
- **static** byte[] nullToEmpty(byte[])
- **static** Byte[] nullToEmpty(Byte[])
- **static** char[] nullToEmpty(char[])
- **static** Character[] nullToEmpty(Character[])
- **static** Class<*> nullToEmpty(Class<*>)
- **static** double[] nullToEmpty(double[])
- **static** Double[] nullToEmpty(Double[])
- **static** float[] nullToEmpty(float[])
- **static** Float[] nullToEmpty(Float[])
- **static** int[] nullToEmpty(int[])
- **static** Integer[] nullToEmpty(Integer[])
- **static** long[] nullToEmpty(long[])
- **static** Long[] nullToEmpty(Long[])
- **static** Object[] nullToEmpty(Object[])
- **static** short[] nullToEmpty(short[])
- **static** Short[] nullToEmpty(Short[])
- **static** String[] nullToEmpty(String[])
- **static** [TT nullToEmpty([T, T)
- **static** void swap(boolean[], int, int)
- **static** void swap(boolean[], int, int, int)
- **static** void swap(byte[], int, int)
- **static** void swap(byte[], int, int, int)
- **static** void swap(char[], int, int)
- **static** void swap(char[], int, int, int)
- **static** void swap(double[], int, int)
- **static** void swap(double[], int, int, int)
- **static** void swap(float[], int, int)
- **static** void swap(float[], int, int, int)
- **static** void swap(int[], int, int)
- **static** void swap(int[], int, int, int)
- **static** void swap(long[], int, int)
- **static** void swap(long[], int, int, int)
- **static** void swap(Object[], int, int)
- **static** void swap(Object[], int, int, int)
- **static** void swap(short[], int, int)
- **static** void swap(short[], int, int, int)
- **static** boolean isEmpty(boolean[])
- **static** boolean isEmpty(byte[])
- **static** boolean isEmpty(char[])
- **static** boolean isEmpty(double[])
- **static** boolean isEmpty(float[])
- **static** boolean isEmpty(int[])
- **static** boolean isEmpty(long[])
- **static** boolean isEmpty(Object[])
- **static** boolean isEmpty(short[])
- **static** boolean containsAny(Object[], Object[])
- **static** [TT newInstance(Class<TT>, int)
- **static** String[] toStringArray(Object[])
- **static** String[] toStringArray(Object[], String)
- **static** void reverse(boolean[])
- **static** void reverse(boolean[], int, int)
- **static** void reverse(byte[])
- **static** void reverse(byte[], int, int)
- **static** void reverse(char[])
- **static** void reverse(char[], int, int)
- **static** void reverse(double[])
- **static** void reverse(double[], int, int)
- **static** void reverse(float[])
- **static** void reverse(float[], int, int)
- **static** void reverse(int[])
- **static** void reverse(int[], int, int)
- **static** void reverse(long[])
- **static** void reverse(long[], int, int)
- **static** void reverse(Object[])
- **static** void reverse(Object[], int, int)
- **static** void reverse(short[])
- **static** void reverse(short[], int, int)
- **static** boolean[] removeElements(boolean[], boolean[])
- **static** byte[] removeElements(byte[], byte[])
- **static** char[] removeElements(char[], char[])
- **static** double[] removeElements(double[], double[])
- **static** float[] removeElements(float[], float[])
- **static** int[] removeElements(int[], int[])
- **static** long[] removeElements(long[], long[])
- **static** short[] removeElements(short[], short[])
- **static** [TT removeElements([T, T)
- **static** int lastIndexOf(boolean[], boolean)
- **static** int lastIndexOf(boolean[], boolean, int)
- **static** int lastIndexOf(byte[], byte)
- **static** int lastIndexOf(byte[], byte, int)
- **static** int lastIndexOf(char[], char)
- **static** int lastIndexOf(char[], char, int)
- **static** int lastIndexOf(double[], double)
- **static** int lastIndexOf(double[], double, double)
- **static** int lastIndexOf(double[], double, int)
- **static** int lastIndexOf(double[], double, int, double)
- **static** int lastIndexOf(float[], float)
- **static** int lastIndexOf(float[], float, int)
- **static** int lastIndexOf(int[], int)
- **static** int lastIndexOf(int[], int, int)
- **static** int lastIndexOf(long[], long)
- **static** int lastIndexOf(long[], long, int)
- **static** int lastIndexOf(Object[], Object)
- **static** int lastIndexOf(Object[], Object, int)
- **static** int lastIndexOf(short[], short)
- **static** int lastIndexOf(short[], short, int)
- **static** boolean contains(boolean[], boolean)
- **static** boolean contains(byte[], byte)
- **static** boolean contains(char[], char)
- **static** boolean contains(double[], double)
- **static** boolean contains(double[], double, double)
- **static** boolean contains(float[], float)
- **static** boolean contains(int[], int)
- **static** boolean contains(long[], long)
- **static** boolean contains(Object[], Object)
- **static** boolean contains(short[], short)
- **static** boolean[] addAll(boolean[], boolean[])
- **static** byte[] addAll(byte[], byte[])
- **static** char[] addAll(char[], char[])
- **static** double[] addAll(double[], double[])
- **static** float[] addAll(float[], float[])
- **static** int[] addAll(int[], int[])
- **static** long[] addAll(long[], long[])
- **static** short[] addAll(short[], short[])
- **static** [TT addAll([T, T)
- **static** boolean[] removeAllOccurences(boolean[], boolean)
- **static** byte[] removeAllOccurences(byte[], byte)
- **static** char[] removeAllOccurences(char[], char)
- **static** double[] removeAllOccurences(double[], double)
- **static** float[] removeAllOccurences(float[], float)
- **static** int[] removeAllOccurences(int[], int)
- **static** long[] removeAllOccurences(long[], long)
- **static** short[] removeAllOccurences(short[], short)
- **static** [TT removeAllOccurences([T, T)
- **static** Map<Object, Object> toMap(Object)
- **static** Class<TT> getComponentType([T)
- **static** boolean[] clone(boolean[])
- **static** byte[] clone(byte[])
- **static** char[] clone(char[])
- **static** double[] clone(double[])
- **static** float[] clone(float[])
- **static** int[] clone(int[])
- **static** long[] clone(long[])
- **static** short[] clone(short[])
- **static** [TT clone([T)
- **static** Z isArrayIndexValid([T, T)
- **static** int getLength(Object)
- **static** String toString(Object)
- **static** String toString(Object, String)
- **static** [TT nullTo([T, T)
- **static** boolean isNotEmpty(boolean[])
- **static** boolean isNotEmpty(byte[])
- **static** boolean isNotEmpty(char[])
- **static** boolean isNotEmpty(double[])
- **static** boolean isNotEmpty(float[])
- **static** boolean isNotEmpty(int[])
- **static** boolean isNotEmpty(long[])
- **static** boolean isNotEmpty(short[])
- **static** Z isNotEmpty([T)
- **static** boolean isSorted(boolean[])
- **static** boolean isSorted(byte[])
- **static** boolean isSorted(char[])
- **static** boolean isSorted(double[])
- **static** boolean isSorted(float[])
- **static** boolean isSorted(int[])
- **static** boolean isSorted(long[])
- **static** boolean isSorted(short[])
- **static** Z isSorted([T)
- **static** Z isSorted([T, T)
- **static** void shuffle(boolean[])
- **static** void shuffle(boolean[], Random)
- **static** void shuffle(byte[])
- **static** void shuffle(byte[], Random)
- **static** void shuffle(char[])
- **static** void shuffle(char[], Random)
- **static** void shuffle(double[])
- **static** void shuffle(double[], Random)
- **static** void shuffle(float[])
- **static** void shuffle(float[], Random)
- **static** void shuffle(int[])
- **static** void shuffle(int[], Random)
- **static** void shuffle(long[])
- **static** void shuffle(long[], Random)
- **static** void shuffle(Object[])
- **static** void shuffle(Object[], Random)
- **static** void shuffle(short[])
- **static** void shuffle(short[], Random)
- **static** boolean[] removeElement(boolean[], boolean)
- **static** byte[] removeElement(byte[], byte)
- **static** char[] removeElement(char[], char)
- **static** double[] removeElement(double[], double)
- **static** float[] removeElement(float[], float)
- **static** int[] removeElement(int[], int)
- **static** long[] removeElement(long[], long)
- **static** short[] removeElement(short[], short)
- **static** [TT removeElement([T, T)
- **static** boolean isEquals(Object, Object)
- **static** boolean[] subarray(boolean[], int, int)
- **static** byte[] subarray(byte[], int, int)
- **static** char[] subarray(char[], int, int)
- **static** double[] subarray(double[], int, int)
- **static** float[] subarray(float[], int, int)
- **static** int[] subarray(int[], int, int)
- **static** long[] subarray(long[], int, int)
- **static** short[] subarray(short[], int, int)
- **static** [TT subarray([T, T, ;)
- **static** boolean[] addFirst(boolean[], boolean)
- **static** byte[] addFirst(byte[], byte)
- **static** char[] addFirst(char[], char)
- **static** double[] addFirst(double[], double)
- **static** float[] addFirst(float[], float)
- **static** int[] addFirst(int[], int)
- **static** long[] addFirst(long[], long)
- **static** short[] addFirst(short[], short)
- **static** [TT addFirst([T, T)

### Class: org.apache.commons.lang3.BooleanUtils
Type: Class

Methods:
- **static** String toStringOnOff(boolean)
- **static** String toStringOnOff(Boolean)
- **static** boolean oneHot(boolean[])
- **static** Boolean oneHot(Boolean[])
- **static** Boolean toBooleanObject(int)
- **static** Boolean toBooleanObject(int, int, int, int)
- **static** Boolean toBooleanObject(Integer)
- **static** Boolean toBooleanObject(Integer, Integer, Integer, Integer)
- **static** Boolean toBooleanObject(String)
- **static** Boolean toBooleanObject(String, String, String, String)
- **static** int compare(boolean, boolean)
- **static** boolean or(boolean[])
- **static** Boolean or(Boolean[])
- **static** boolean isNotTrue(Boolean)
- **static** V forEach(Consumer<Boolean>)
- **static** List<Boolean> values()
- **static** boolean isFalse(Boolean)
- **static** Integer toIntegerObject(boolean)
- **static** Integer toIntegerObject(boolean, Integer, Integer)
- **static** Integer toIntegerObject(Boolean)
- **static** Integer toIntegerObject(Boolean, Integer, Integer, Integer)
- **static** int toInteger(boolean)
- **static** int toInteger(boolean, int, int)
- **static** int toInteger(Boolean, int, int, int)
- **static** boolean isTrue(Boolean)
- **static** String toStringYesNo(boolean)
- **static** String toStringYesNo(Boolean)
- **static** Boolean[] booleanValues()
- **static** boolean toBoolean(Boolean)
- **static** boolean toBoolean(int)
- **static** boolean toBoolean(int, int, int)
- **static** boolean toBoolean(Integer, Integer, Integer)
- **static** boolean toBoolean(String)
- **static** boolean toBoolean(String, String, String)
- **static** Boolean negate(Boolean)
- **static** boolean and(boolean[])
- **static** Boolean and(Boolean[])
- **static** boolean toBooleanDefaultIfNull(Boolean, boolean)
- **static** boolean xor(boolean[])
- **static** Boolean xor(Boolean[])
- **static** String toString(boolean, String, String)
- **static** String toString(Boolean, String, String, String)
- **static** boolean isNotFalse(Boolean)
- **static** boolean[] primitiveValues()
- **static** String toStringTrueFalse(boolean)
- **static** String toStringTrueFalse(Boolean)

### Class: org.apache.commons.lang3.CharSequenceUtils
Type: Class

Methods:
- **static** char[] toCharArray(CharSequence)
- **static** CharSequence subSequence(CharSequence, int)

### Class: org.apache.commons.lang3.CharUtils
Type: Class

Methods:
- **static** int compare(char, char)
- **static** boolean isAsciiAlpha(char)
- **static** String unicodeEscaped(char)
- **static** String unicodeEscaped(Character)
- **static** boolean isAsciiAlphanumeric(char)
- **static** boolean isAsciiPrintable(char)
- **static** int toIntValue(char)
- **static** int toIntValue(char, int)
- **static** int toIntValue(Character)
- **static** int toIntValue(Character, int)
- **static** boolean isAscii(char)
- **static** boolean isAsciiAlphaUpper(char)
- **static** boolean isAsciiAlphaLower(char)
- **static** boolean isAsciiControl(char)
- **static** String toString(char)
- **static** String toString(Character)
- **static** boolean isAsciiNumeric(char)
- **static** Character toCharacterObject(char)
- **static** Character toCharacterObject(String)
- **static** char toChar(Character)
- **static** char toChar(Character, char)
- **static** char toChar(String)
- **static** char toChar(String, char)

### Class: org.apache.commons.lang3.ClassUtils
Type: Class

Methods:
- **static** Class<*> getClass(ClassLoader, String)
- **static** Class<*> getClass(ClassLoader, String, boolean)
- **static** Class<*> getClass(String)
- **static** Class<*> getClass(String, boolean)
- **static** Z isAssignable(Class<*>, Class<*>)
- **static** Z isAssignable(Class<*>, Class<*>, boolean)
- **static** Z isAssignable(Class<*>, Class<*>)
- **static** Z isAssignable(Class<*>, Class<*>, boolean)
- **static** String getShortCanonicalName(Class<*>)
- **static** String getShortCanonicalName(Object, String)
- **static** String getShortCanonicalName(String)
- **static** String getName(Class<*>)
- **static** String getName(Class<*>, String)
- **static** String getName(Object)
- **static** String getName(Object, String)
- **static** Class<*> primitiveToWrapper(Class<*>)
- **static** String getShortClassName(Class<*>)
- **static** String getShortClassName(Object, String)
- **static** String getShortClassName(String)
- **static** String getCanonicalName(Class<*>)
- **static** String getCanonicalName(Class<*>, String)
- **static** String getCanonicalName(Object)
- **static** String getCanonicalName(Object, String)
- **static** Class<*> wrappersToPrimitives(Class<*>)
- **static** List<Class<*>> getAllSuperclasses(Class<*>)
- **static** Z isPublic(Class<*>)
- **static** List<Class<*>> getAllInterfaces(Class<*>)
- **static** Class<*> primitivesToWrappers(Class<*>)
- **static** Method getPublicMethod(Class<*>, String, Class<*>)
- **static** Class<*> wrapperToPrimitive(Class<*>)
- **static** Class<*> toClass(Object)
- **static** Z isPrimitiveOrWrapper(Class<*>)
- **static** Iterable<Class<*>> hierarchy(Class<*>)
- **static** Iterable<Class<*>> hierarchy(Class<*>, ClassUtils$Interfaces)
- **static** String getPackageCanonicalName(Class<*>)
- **static** String getPackageCanonicalName(Object, String)
- **static** String getPackageCanonicalName(String)
- **static** Comparator<Class<*>> comparator()
- **static** List<String> convertClassesToClassNames(List<Class<*>>)
- **static** String getAbbreviatedName(Class<*>, int)
- **static** String getAbbreviatedName(String, int)
- **static** Z isPrimitiveWrapper(Class<*>)
- **static** Class<TT> getComponentType(Class<[TT>)
- **static** String getSimpleName(Class<*>)
- **static** String getSimpleName(Class<*>, String)
- **static** String getSimpleName(Object)
- **static** String getSimpleName(Object, String)
- **static** String getPackageName(Class<*>)
- **static** String getPackageName(Object, String)
- **static** String getPackageName(String)
- **static** List<Class<*>> convertClassNamesToClasses(List<String>)
- **static** Z isInnerClass(Class<*>)

### Class: org.apache.commons.lang3.ClassUtils$Interfaces
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- INCLUDE
- EXCLUDE

Methods:
- **static** ClassUtils$Interfaces valueOf(String)
- **static** ClassUtils$Interfaces[] values()

### Class: org.apache.commons.lang3.LocaleUtils
Type: Class

Methods:
- **static** List<Locale> languagesByCountry(String)
- **static** Locale toLocale(Locale)
- **static** Locale toLocale(String)
- **static** List<Locale> availableLocaleList()
- **static** Set<Locale> availableLocaleSet()
- **static** boolean isLanguageUndetermined(Locale)
- **static** List<Locale> countriesByLanguage(String)
- **static** List<Locale> localeLookupList(Locale)
- **static** List<Locale> localeLookupList(Locale, Locale)
- **static** boolean isAvailableLocale(Locale)

### Class: org.apache.commons.lang3.LongRange
Type: Class
Extends: org.apache.commons.lang3.NumberRange

Methods:
- **static** LongRange of(long, long)
- **static** LongRange of(Long, Long)

### Class: org.apache.commons.lang3.NumberRange
Type: Class
Extends: org.apache.commons.lang3.Range

No public methods found

### Class: org.apache.commons.lang3.ObjectUtils
Type: Class

Methods:
- **static** Class<TT> getClass(T)
- **static** TT defaultIfNull(T, T)
- **static** void wait(Object, Duration)
- **static** I compare(T, T)
- **static** I compare(T, T, ;)
- **static** byte CONST_BYTE(int)
- **static** TT mode([T)
- **static** String hashCodeHex(Object)
- **static** boolean allNotNull(Object[])
- **static** TT min([T)
- **static** int hashCode(Object)
- **static** boolean CONST(boolean)
- **static** byte CONST(byte)
- **static** char CONST(char)
- **static** double CONST(double)
- **static** float CONST(float)
- **static** int CONST(int)
- **static** long CONST(long)
- **static** short CONST(short)
- **static** TT CONST(T)
- **static** boolean allNull(Object[])
- **static** short CONST_SHORT(int)
- **static** TT getFirstNonNull(Supplier<TT>)
- **static** TT cloneIfPossible(T)
- **static** TT requireNonEmpty(T)
- **static** TT requireNonEmpty(T, T)
- **static** TT max([T)
- **static** String identityHashCodeHex(Object)
- **static** boolean isEmpty(Object)
- **static** boolean notEqual(Object, Object)
- **static** boolean anyNull(Object[])
- **static** boolean anyNotNull(Object[])
- **static** TT median(Comparator<TT>, [T)
- **static** TT median([T)
- **static** TT firstNonNull([T)
- **static** boolean equals(Object, Object)
- **static** TT clone(T)
- **static** void identityToString(Appendable, Object)
- **static** String identityToString(Object)
- **static** void identityToString(StrBuilder, Object)
- **static** void identityToString(StringBuffer, Object)
- **static** void identityToString(StringBuilder, Object)
- **static** String toString(Object)
- **static** String toString(Object, String)
- **static** String toString(Supplier<Object>, Supplier<String>)
- **static** String toString(T, T)
- **static** boolean isNotEmpty(Object)
- **static** boolean isArray(Object)
- **static** int hashCodeMulti(Object[])
- **static** TT getIfNull(T, T)

### Class: org.apache.commons.lang3.ObjectUtils$Null
Type: Class
Implements: java.io.Serializable

No public methods found

### Class: org.apache.commons.lang3.Range
Type: Class
Implements: java.io.Serializable

Methods:
- Range<TT> intersectionWith(Range<TT>)
- I elementCompareTo(T)
- Comparator<TT> getComparator()
- Z isBeforeRange(Range<TT>)
- **static** Range<TT> is(T)
- **static** Range<TT> is(T, T)
- Z isEndedBy(T)
- TT getMaximum()
- Z isBefore(T)
- boolean isNaturalOrdering()
- TT fit(T)
- Z isAfterRange(Range<TT>)
- Z contains(T)
- Z isStartedBy(T)
- int hashCode()
- boolean equals(Object)
- **static** Range<TT> of(T, T)
- **static** Range<TT> of(T, T, ;)
- TT getMinimum()
- String toString()
- String toString(String)
- Z isAfter(T)
- Z containsRange(Range<TT>)
- **static** Range<TT> between(T, T)
- **static** Range<TT> between(T, T, ;)
- Z isOverlappedBy(Range<TT>)

### Class: org.apache.commons.lang3.RegExUtils
Type: Class

Methods:
- **static** String replacePattern(String, String, String)
- **static** String removeAll(String, Pattern)
- **static** String removeAll(String, String)
- **static** String removePattern(String, String)
- **static** String removeFirst(String, Pattern)
- **static** String removeFirst(String, String)
- **static** String replaceFirst(String, Pattern, String)
- **static** String replaceFirst(String, String, String)
- **static** Matcher dotAllMatcher(String, String)
- **static** String replaceAll(String, Pattern, String)
- **static** String replaceAll(String, String, String)
- **static** Pattern dotAll(String)

### Class: org.apache.commons.lang3.StringEscapeUtils
Type: Class

Methods:
- **static** String escapeHtml3(String)
- **static** String escapeXml11(String)
- **static** String escapeHtml4(String)
- **static** String escapeXml10(String)
- **static** String escapeCsv(String)
- **static** String unescapeJson(String)
- **static** String unescapeCsv(String)
- **static** String escapeJson(String)
- **static** String unescapeJava(String)
- **static** String unescapeHtml3(String)
- **static** String unescapeHtml4(String)
- **static** String unescapeEcmaScript(String)
- **static** String escapeXml(String)
- **static** String escapeJava(String)
- **static** String escapeEcmaScript(String)
- **static** String unescapeXml(String)

### Class: org.apache.commons.lang3.StringUtils
Type: Class

Methods:
- **static** String replaceOnceIgnoreCase(String, String, String)
- **static** boolean isAllEmpty(CharSequence[])
- **static** String substringAfterLast(String, int)
- **static** String substringAfterLast(String, String)
- **static** String[] substringsBetween(String, String, String)
- **static** String[] splitByWholeSeparator(String, String)
- **static** String[] splitByWholeSeparator(String, String, int)
- **static** String prependIfMissing(String, CharSequence, CharSequence[])
- **static** String stripAccents(String)
- **static** int lastIndexOfAny(CharSequence, CharSequence[])
- **static** boolean isAlphanumericSpace(CharSequence)
- **static** int countMatches(CharSequence, char)
- **static** int countMatches(CharSequence, CharSequence)
- **static** String removeAll(String, String)
- **static** String getCommonPrefix(String[])
- **static** String truncate(String, int)
- **static** String truncate(String, int, int)
- **static** String trim(String)
- **static** String join(boolean[], char)
- **static** String join(boolean[], char, int, int)
- **static** String join(byte[], char)
- **static** String join(byte[], char, int, int)
- **static** String join(char[], char)
- **static** String join(char[], char, int, int)
- **static** String join(double[], char)
- **static** String join(double[], char, int, int)
- **static** String join(float[], char)
- **static** String join(float[], char, int, int)
- **static** String join(int[], char)
- **static** String join(int[], char, int, int)
- **static** String join(Iterable<*>, char)
- **static** String join(Iterable<*>, String)
- **static** String join(Iterator<*>, char)
- **static** String join(Iterator<*>, String)
- **static** String join(List<*>, char, int, int)
- **static** String join(List<*>, String, int, int)
- **static** String join(long[], char)
- **static** String join(long[], char, int, int)
- **static** String join(Object[], char)
- **static** String join(Object[], char, int, int)
- **static** String join(Object[], String)
- **static** String join(Object[], String, int, int)
- **static** String join(short[], char)
- **static** String join(short[], char, int, int)
- **static** String join([T)
- **static** boolean equalsIgnoreCase(CharSequence, CharSequence)
- **static** TT getIfBlank(T, T)
- **static** boolean equalsAnyIgnoreCase(CharSequence, CharSequence[])
- **static** String substringBetween(String, String)
- **static** String substringBetween(String, String, String)
- **static** int lastIndexOfIgnoreCase(CharSequence, CharSequence)
- **static** int lastIndexOfIgnoreCase(CharSequence, CharSequence, int)
- **static** int[] toCodePoints(CharSequence)
- **static** String substringBeforeLast(String, String)
- **static** boolean isAlpha(CharSequence)
- **static** boolean containsAny(CharSequence, char[])
- **static** boolean containsAny(CharSequence, CharSequence)
- **static** boolean containsAny(CharSequence, CharSequence[])
- **static** String chop(String)
- **static** String trimToEmpty(String)
- **static** String[] splitByWholeSeparatorPreserveAllTokens(String, String)
- **static** String[] splitByWholeSeparatorPreserveAllTokens(String, String, int)
- **static** String capitalize(String)
- **static** boolean contains(CharSequence, CharSequence)
- **static** boolean contains(CharSequence, int)
- **static** String appendIfMissing(String, CharSequence, CharSequence[])
- **static** String left(String, int)
- **static** boolean isAllBlank(CharSequence[])
- **static** boolean containsOnly(CharSequence, char[])
- **static** boolean containsOnly(CharSequence, String)
- **static** boolean endsWith(CharSequence, CharSequence)
- **static** String difference(String, String)
- **static** String substringBefore(String, int)
- **static** String substringBefore(String, String)
- **static** String leftPad(String, int)
- **static** String leftPad(String, int, char)
- **static** String leftPad(String, int, String)
- **static** int indexOfAnyBut(CharSequence, char[])
- **static** int indexOfAnyBut(CharSequence, CharSequence)
- **static** int compareIgnoreCase(String, String)
- **static** int compareIgnoreCase(String, String, boolean)
- **static** boolean endsWithIgnoreCase(CharSequence, CharSequence)
- **static** int compare(String, String)
- **static** int compare(String, String, boolean)
- **static** int indexOfAny(CharSequence, char[])
- **static** int indexOfAny(CharSequence, CharSequence[])
- **static** int indexOfAny(CharSequence, String)
- **static** String toEncodedString(byte[], Charset)
- **static** String replaceEach(String, String[], String[])
- **static** String mid(String, int, int)
- **static** String replaceFirst(String, String, String)
- **static** int getFuzzyDistance(CharSequence, CharSequence, Locale)
- **static** String deleteWhitespace(String)
- **static** boolean isAnyBlank(CharSequence[])
- **static** boolean isAlphanumeric(CharSequence)
- **static** String stripEnd(String, String)
- **static** TT firstNonEmpty([T)
- **static** String replaceEachRepeatedly(String, String[], String[])
- **static** TT defaultIfEmpty(T, T)
- **static** String[] splitPreserveAllTokens(String)
- **static** String[] splitPreserveAllTokens(String, char)
- **static** String[] splitPreserveAllTokens(String, String)
- **static** String[] splitPreserveAllTokens(String, String, int)
- **static** String replaceChars(String, char, char)
- **static** String replaceChars(String, String, String)
- **static** boolean isMixedCase(CharSequence)
- **static** String joinWith(String, Object[])
- **static** boolean isAllLowerCase(CharSequence)
- **static** boolean isNoneEmpty(CharSequence[])
- **static** boolean isAlphaSpace(CharSequence)
- **static** String chomp(String)
- **static** String chomp(String, String)
- **static** boolean startsWithAny(CharSequence, CharSequence[])
- **static** String right(String, int)
- **static** boolean isNumericSpace(CharSequence)
- **static** String reverse(String)
- **static** String replaceIgnoreCase(String, String, String)
- **static** String replaceIgnoreCase(String, String, String, int)
- **static** String getDigits(String)
- **static** String uncapitalize(String)
- **static** TT defaultIfBlank(T, T)
- **static** String removePattern(String, String)
- **static** boolean equals(CharSequence, CharSequence)
- **static** String[] splitByCharacterTypeCamelCase(String)
- **static** int indexOfIgnoreCase(CharSequence, CharSequence)
- **static** int indexOfIgnoreCase(CharSequence, CharSequence, int)
- **static** String toString(byte[], String)
- **static** boolean isAnyEmpty(CharSequence[])
- **static** String wrap(String, char)
- **static** String wrap(String, String)
- **static** boolean startsWithIgnoreCase(CharSequence, CharSequence)
- **static** String rotate(String, int)
- **static** String appendIfMissingIgnoreCase(String, CharSequence, CharSequence[])
- **static** String normalizeSpace(String)
- **static** boolean isAllUpperCase(CharSequence)
- **static** boolean endsWithAny(CharSequence, CharSequence[])
- **static** String replace(String, String, String)
- **static** String replace(String, String, String, int)
- **static** boolean isAsciiPrintable(CharSequence)
- **static** byte[] getBytes(String, Charset)
- **static** byte[] getBytes(String, String)
- **static** String unwrap(String, char)
- **static** String unwrap(String, String)
- **static** String[] splitByCharacterType(String)
- **static** boolean isNoneBlank(CharSequence[])
- **static** int lastOrdinalIndexOf(CharSequence, CharSequence, int)
- **static** String strip(String)
- **static** String strip(String, String)
- **static** String[] split(String)
- **static** String[] split(String, char)
- **static** String[] split(String, String)
- **static** String[] split(String, String, int)
- **static** String[] stripAll(String[])
- **static** String[] stripAll(String[], String)
- **static** String removeFirst(String, String)
- **static** String lowerCase(String)
- **static** String lowerCase(String, Locale)
- **static** boolean isNotBlank(CharSequence)
- **static** int indexOf(CharSequence, CharSequence)
- **static** int indexOf(CharSequence, CharSequence, int)
- **static** int indexOf(CharSequence, int)
- **static** int indexOf(CharSequence, int, int)
- **static** String swapCase(String)
- **static** String wrapIfMissing(String, char)
- **static** String wrapIfMissing(String, String)
- **static** String overlay(String, String, int, int)
- **static** int indexOfDifference(CharSequence[])
- **static** int indexOfDifference(CharSequence, CharSequence)
- **static** int ordinalIndexOf(CharSequence, CharSequence, int)
- **static** boolean containsWhitespace(CharSequence)
- **static** boolean isWhitespace(CharSequence)
- **static** boolean containsNone(CharSequence, char[])
- **static** boolean containsNone(CharSequence, String)
- **static** String stripStart(String, String)
- **static** String rightPad(String, int)
- **static** String rightPad(String, int, char)
- **static** String rightPad(String, int, String)
- **static** TT getIfEmpty(T, T)
- **static** TT firstNonBlank([T)
- **static** String upperCase(String)
- **static** String upperCase(String, Locale)
- **static** boolean isNumeric(CharSequence)
- **static** String defaultString(String)
- **static** String defaultString(String, String)
- **static** boolean isNotEmpty(CharSequence)
- **static** double getJaroWinklerDistance(CharSequence, CharSequence)
- **static** String toRootUpperCase(String)
- **static** boolean isBlank(CharSequence)
- **static** String replaceAll(String, String, String)
- **static** String substring(String, int)
- **static** String substring(String, int, int)
- **static** String remove(String, char)
- **static** String remove(String, String)
- **static** String prependIfMissingIgnoreCase(String, CharSequence, CharSequence[])
- **static** String repeat(char, int)
- **static** String repeat(String, int)
- **static** String repeat(String, String, int)
- **static** String removeEnd(String, String)
- **static** String substringAfter(String, int)
- **static** String substringAfter(String, String)
- **static** String trimToNull(String)
- **static** String removeEndIgnoreCase(String, String)
- **static** String replacePattern(String, String, String)
- **static** String removeIgnoreCase(String, String)
- **static** String abbreviate(String, int)
- **static** String abbreviate(String, int, int)
- **static** String abbreviate(String, String, int)
- **static** String abbreviate(String, String, int, int)
- **static** String valueOf(char[])
- **static** String removeStartIgnoreCase(String, String)
- **static** boolean equalsAny(CharSequence, CharSequence[])
- **static** String center(String, int)
- **static** String center(String, int, char)
- **static** String center(String, int, String)
- **static** int length(CharSequence)
- **static** boolean isEmpty(CharSequence)
- **static** String removeStart(String, char)
- **static** String removeStart(String, String)
- **static** String toRootLowerCase(String)
- **static** boolean containsIgnoreCase(CharSequence, CharSequence)
- **static** String abbreviateMiddle(String, String, int)
- **static** String stripToNull(String)
- **static** String reverseDelimited(String, char)
- **static** int lastIndexOf(CharSequence, CharSequence)
- **static** int lastIndexOf(CharSequence, CharSequence, int)
- **static** int lastIndexOf(CharSequence, int)
- **static** int lastIndexOf(CharSequence, int, int)
- **static** String replaceOnce(String, String, String)
- **static** String stripToEmpty(String)
- **static** int getLevenshteinDistance(CharSequence, CharSequence)
- **static** int getLevenshteinDistance(CharSequence, CharSequence, int)
- **static** boolean containsAnyIgnoreCase(CharSequence, CharSequence[])
- **static** boolean startsWith(CharSequence, CharSequence)

### Class: org.apache.commons.lang3.Validate
Type: Class

Methods:
- **static** TT validIndex(T, T)
- **static** TT validIndex(T, T)
- **static** TT validIndex(T, T, ;, int)
- **static** TT validIndex(T, T, ;, int)
- **static** [TT validIndex([T, T)
- **static** [TT validIndex([T, T, ;, int)
- **static** TT notNull(T)
- **static** TT notNull(T, T, ;)
- **static** void exclusiveBetween(double, double, double)
- **static** void exclusiveBetween(double, double, double, String)
- **static** void exclusiveBetween(long, long, long)
- **static** void exclusiveBetween(long, long, long, String)
- **static** V exclusiveBetween(T, T, ;)
- **static** V exclusiveBetween(T, T, ;, T, T)
- **static** void finite(double)
- **static** void finite(double, String, Object[])
- **static** TT noNullElements(T)
- **static** TT noNullElements(T, T, ;)
- **static** [TT noNullElements([T)
- **static** [TT noNullElements([T, T, ;)
- **static** V isAssignableFrom(Class<*>, Class<*>)
- **static** V isAssignableFrom(Class<*>, Class<*>, String, Object)
- **static** void notNaN(double)
- **static** void notNaN(double, String, Object[])
- **static** void matchesPattern(CharSequence, String)
- **static** void matchesPattern(CharSequence, String, String, Object[])
- **static** void isTrue(boolean)
- **static** void isTrue(boolean, String, double)
- **static** void isTrue(boolean, String, long)
- **static** void isTrue(boolean, String, Object[])
- **static** void validState(boolean)
- **static** void validState(boolean, String, Object[])
- **static** V isInstanceOf(Class<*>, Object)
- **static** V isInstanceOf(Class<*>, Object, String, Object)
- **static** void inclusiveBetween(double, double, double)
- **static** void inclusiveBetween(double, double, double, String)
- **static** void inclusiveBetween(long, long, long)
- **static** void inclusiveBetween(long, long, long, String)
- **static** V inclusiveBetween(T, T, ;)
- **static** V inclusiveBetween(T, T, ;, T, T)
- **static** TT notBlank(T)
- **static** TT notBlank(T, T, ;)
- **static** TT notEmpty(T)
- **static** TT notEmpty(T)
- **static** TT notEmpty(T)
- **static** TT notEmpty(T, T, ;)
- **static** TT notEmpty(T, T, ;)
- **static** TT notEmpty(T, T, ;)
- **static** [TT notEmpty([T)
- **static** [TT notEmpty([T, T, ;)

## Package: org.apache.commons.lang3.builder

### Class: org.apache.commons.lang3.builder.Builder
Type: Interface

Methods:
- TT build()

### Class: org.apache.commons.lang3.builder.EqualsExclude
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.apache.commons.lang3.builder.HashCodeExclude
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.apache.commons.lang3.builder.ToStringExclude
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.apache.commons.lang3.builder.ToStringSummary
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.apache.commons.lang3.builder.CompareToBuilder
Type: Class
Implements: org.apache.commons.lang3.builder.Builder

Methods:
- int toComparison()
- Integer build()
- Object build()
- CompareToBuilder appendSuper(int)
- **static** int reflectionCompare(Object, Object)
- **static** int reflectionCompare(Object, Object, boolean)
- **static** I reflectionCompare(Object, Object, boolean, Class<*>, String)
- **static** I reflectionCompare(Object, Object, Collection<String>)
- **static** int reflectionCompare(Object, Object, String[])
- CompareToBuilder append(boolean, boolean)
- CompareToBuilder append(boolean[], boolean[])
- CompareToBuilder append(byte, byte)
- CompareToBuilder append(byte[], byte[])
- CompareToBuilder append(char, char)
- CompareToBuilder append(char[], char[])
- CompareToBuilder append(double, double)
- CompareToBuilder append(double[], double[])
- CompareToBuilder append(float, float)
- CompareToBuilder append(float[], float[])
- CompareToBuilder append(int, int)
- CompareToBuilder append(int[], int[])
- CompareToBuilder append(long, long)
- CompareToBuilder append(long[], long[])
- CompareToBuilder append(Object, Object)
- CompareToBuilder append(Object, Object, Comparator<*>)
- CompareToBuilder append(Object[], Object[])
- CompareToBuilder append(Object, Object, Comparator<*>)
- CompareToBuilder append(short, short)
- CompareToBuilder append(short[], short[])

### Class: org.apache.commons.lang3.builder.EqualsBuilder
Type: Class
Implements: org.apache.commons.lang3.builder.Builder

Methods:
- EqualsBuilder setBypassReflectionClasses(List<Class<*>>)
- EqualsBuilder reflectionAppend(Object, Object)
- **static** boolean reflectionEquals(Object, Object, boolean)
- **static** Z reflectionEquals(Object, Object, boolean, Class<*>, boolean, String)
- **static** Z reflectionEquals(Object, Object, boolean, Class<*>, String)
- **static** Z reflectionEquals(Object, Object, Collection<String>)
- **static** boolean reflectionEquals(Object, Object, String[])
- EqualsBuilder setTestRecursive(boolean)
- EqualsBuilder setReflectUpToClass(Class<*>)
- Boolean build()
- Object build()
- EqualsBuilder setExcludeFields(String[])
- void reset()
- EqualsBuilder appendSuper(boolean)
- boolean isEquals()
- EqualsBuilder setTestTransients(boolean)
- EqualsBuilder append(boolean, boolean)
- EqualsBuilder append(boolean[], boolean[])
- EqualsBuilder append(byte, byte)
- EqualsBuilder append(byte[], byte[])
- EqualsBuilder append(char, char)
- EqualsBuilder append(char[], char[])
- EqualsBuilder append(double, double)
- EqualsBuilder append(double[], double[])
- EqualsBuilder append(float, float)
- EqualsBuilder append(float[], float[])
- EqualsBuilder append(int, int)
- EqualsBuilder append(int[], int[])
- EqualsBuilder append(long, long)
- EqualsBuilder append(long[], long[])
- EqualsBuilder append(Object, Object)
- EqualsBuilder append(Object[], Object[])
- EqualsBuilder append(short, short)
- EqualsBuilder append(short[], short[])

### Class: org.apache.commons.lang3.builder.HashCodeBuilder
Type: Class
Implements: org.apache.commons.lang3.builder.Builder

Methods:
- Integer build()
- Object build()
- int hashCode()
- boolean equals(Object)
- HashCodeBuilder appendSuper(int)
- **static** int reflectionHashCode(int, int, Object)
- **static** int reflectionHashCode(int, int, Object, boolean)
- **static** I reflectionHashCode(int, int, T, T, ;, boolean)
- **static** int reflectionHashCode(Object, boolean)
- **static** I reflectionHashCode(Object, Collection<String>)
- **static** int reflectionHashCode(Object, String[])
- int toHashCode()
- HashCodeBuilder append(boolean)
- HashCodeBuilder append(boolean[])
- HashCodeBuilder append(byte)
- HashCodeBuilder append(byte[])
- HashCodeBuilder append(char)
- HashCodeBuilder append(char[])
- HashCodeBuilder append(double)
- HashCodeBuilder append(double[])
- HashCodeBuilder append(float)
- HashCodeBuilder append(float[])
- HashCodeBuilder append(int)
- HashCodeBuilder append(int[])
- HashCodeBuilder append(long)
- HashCodeBuilder append(long[])
- HashCodeBuilder append(Object)
- HashCodeBuilder append(Object[])
- HashCodeBuilder append(short)
- HashCodeBuilder append(short[])

### Class: org.apache.commons.lang3.builder.ReflectionToStringBuilder
Type: Class
Extends: org.apache.commons.lang3.builder.ToStringBuilder

Methods:
- V setUpToClass(Class<*>)
- Class<*> getUpToClass()
- ReflectionToStringBuilder reflectionAppendArray(Object)
- void setAppendTransients(boolean)
- boolean isAppendStatics()
- boolean isExcludeNullValues()
- void setExcludeNullValues(boolean)
- **static** String toStringExclude(Object, Collection<String>)
- **static** String toStringExclude(Object, String[])
- ReflectionToStringBuilder setExcludeFieldNames(String[])
- String[] getExcludeFieldNames()
- void setAppendStatics(boolean)
- String[] getIncludeFieldNames()
- **static** String toStringInclude(Object, Collection<String>)
- **static** String toStringInclude(Object, String[])
- boolean isAppendTransients()
- **static** String toString(Object)
- **static** String toString(Object, ToStringStyle)
- **static** String toString(Object, ToStringStyle, boolean)
- **static** String toString(Object, ToStringStyle, boolean, boolean)
- **static** String toString(T, T, ;, ToStringStyle, boolean, boolean)
- **static** String toString(T, T, ;, ToStringStyle, boolean)
- String toString()
- ReflectionToStringBuilder setIncludeFieldNames(String[])

### Class: org.apache.commons.lang3.builder.ToStringBuilder
Type: Class
Implements: org.apache.commons.lang3.builder.Builder

Methods:
- **static** ToStringStyle getDefaultStyle()
- Object getObject()
- **static** void setDefaultStyle(ToStringStyle)
- ToStringStyle getStyle()
- **static** String reflectionToString(Object)
- **static** String reflectionToString(Object, ToStringStyle)
- **static** String reflectionToString(Object, ToStringStyle, boolean)
- **static** String reflectionToString(T, T, ;, ToStringStyle)
- String build()
- Object build()
- String toString()
- ToStringBuilder appendSuper(String)
- ToStringBuilder appendAsObjectToString(Object)
- StringBuffer getStringBuffer()
- ToStringBuilder append(boolean)
- ToStringBuilder append(boolean[])
- ToStringBuilder append(byte)
- ToStringBuilder append(byte[])
- ToStringBuilder append(char)
- ToStringBuilder append(char[])
- ToStringBuilder append(double)
- ToStringBuilder append(double[])
- ToStringBuilder append(float)
- ToStringBuilder append(float[])
- ToStringBuilder append(int)
- ToStringBuilder append(int[])
- ToStringBuilder append(long)
- ToStringBuilder append(long[])
- ToStringBuilder append(Object)
- ToStringBuilder append(Object[])
- ToStringBuilder append(short)
- ToStringBuilder append(short[])
- ToStringBuilder append(String, boolean)
- ToStringBuilder append(String, boolean[])
- ToStringBuilder append(String, boolean[], boolean)
- ToStringBuilder append(String, byte)
- ToStringBuilder append(String, byte[])
- ToStringBuilder append(String, byte[], boolean)
- ToStringBuilder append(String, char)
- ToStringBuilder append(String, char[])
- ToStringBuilder append(String, char[], boolean)
- ToStringBuilder append(String, double)
- ToStringBuilder append(String, double[])
- ToStringBuilder append(String, double[], boolean)
- ToStringBuilder append(String, float)
- ToStringBuilder append(String, float[])
- ToStringBuilder append(String, float[], boolean)
- ToStringBuilder append(String, int)
- ToStringBuilder append(String, int[])
- ToStringBuilder append(String, int[], boolean)
- ToStringBuilder append(String, long)
- ToStringBuilder append(String, long[])
- ToStringBuilder append(String, long[], boolean)
- ToStringBuilder append(String, Object)
- ToStringBuilder append(String, Object, boolean)
- ToStringBuilder append(String, Object[])
- ToStringBuilder append(String, Object[], boolean)
- ToStringBuilder append(String, short)
- ToStringBuilder append(String, short[])
- ToStringBuilder append(String, short[], boolean)
- ToStringBuilder appendToString(String)

### Class: org.apache.commons.lang3.builder.ToStringStyle
Type: Abstract Class
Implements: java.io.Serializable

Methods:
- void appendEnd(StringBuffer, Object)
- void appendStart(StringBuffer, Object)
- **static** Map<Object, Object> getRegistry()
- void appendSuper(StringBuffer, String)
- void append(StringBuffer, String, boolean)
- void append(StringBuffer, String, boolean[], Boolean)
- void append(StringBuffer, String, byte)
- void append(StringBuffer, String, byte[], Boolean)
- void append(StringBuffer, String, char)
- void append(StringBuffer, String, char[], Boolean)
- void append(StringBuffer, String, double)
- void append(StringBuffer, String, double[], Boolean)
- void append(StringBuffer, String, float)
- void append(StringBuffer, String, float[], Boolean)
- void append(StringBuffer, String, int)
- void append(StringBuffer, String, int[], Boolean)
- void append(StringBuffer, String, long)
- void append(StringBuffer, String, long[], Boolean)
- void append(StringBuffer, String, Object, Boolean)
- void append(StringBuffer, String, Object[], Boolean)
- void append(StringBuffer, String, short)
- void append(StringBuffer, String, short[], Boolean)
- void appendToString(StringBuffer, String)

## Package: org.apache.commons.lang3.exception

### Class: org.apache.commons.lang3.exception.CloneFailedException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: org.apache.commons.lang3.exception.ExceptionUtils
Type: Class

Methods:
- **static** TR wrapAndThrow(Throwable)
- **static** List<String> getRootCauseStackTraceList(Throwable)
- **static** Throwable getCause(Throwable)
- **static** Throwable getCause(Throwable, String[])
- **static** void printRootCauseStackTrace(Throwable)
- **static** void printRootCauseStackTrace(Throwable, PrintStream)
- **static** void printRootCauseStackTrace(Throwable, PrintWriter)
- **static** I indexOfType(Throwable, Class<Throwable>)
- **static** I indexOfType(Throwable, Class<Throwable>, int)
- **static** I indexOfThrowable(Throwable, Class<Throwable>)
- **static** I indexOfThrowable(Throwable, Class<Throwable>, int)
- **static** TT asRuntimeException(Throwable)
- **static** List<Throwable> getThrowableList(Throwable)
- **static** String getStackTrace(Throwable)
- **static** Stream<Throwable> stream(Throwable)
- **static** TT throwableOfThrowable(Throwable, Class<TT>)
- **static** TT throwableOfThrowable(Throwable, Class<TT>, int)
- **static** Throwable getRootCause(Throwable)
- **static** int getThrowableCount(Throwable)
- **static** TT rethrow(Throwable)
- **static** boolean isUnchecked(Throwable)
- **static** String[] getStackFrames(Throwable)
- **static** String[] getRootCauseStackTrace(Throwable)
- **static** V forEach(Throwable, Consumer<Throwable>)
- **static** String getMessage(Throwable)
- **static** boolean isChecked(Throwable)
- **static** Throwable[] getThrowables(Throwable)
- **static** TT throwableOfType(Throwable, Class<TT>)
- **static** TT throwableOfType(Throwable, Class<TT>, int)
- **static** TT throwUnchecked(T)
- **static** TT throwUnchecked(T)
- **static** String[] getDefaultCauseMethodNames()
- **static** V removeCommonFrames(List<String>, List<String>)
- **static** Z hasCause(Throwable, Class<Throwable>)
- **static** String getRootCauseMessage(Throwable)

### Class: org.apache.commons.lang3.exception.UncheckedException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: org.apache.commons.lang3.function

### Class: org.apache.commons.lang3.function.FailableBiConsumer
Type: Interface

Methods:
- FailableBiConsumer<TT, TU, TE> andThen(FailableBiConsumer<-TT, -TU, TE>)
- **static** FailableBiConsumer<TT, TU, TE> nop()
- V^TE accept(T, T) throws Throwable

### Class: org.apache.commons.lang3.function.FailableBiFunction
Type: Interface

Methods:
- TR^TE apply(T, T) throws Throwable
- FailableBiFunction<TT, TU, TV, TE> andThen(FailableFunction<-TR, +TV, TE>)
- **static** FailableBiFunction<TT, TU, TR, TE> nop()

### Class: org.apache.commons.lang3.function.FailableBiPredicate
Type: Interface

Methods:
- **static** FailableBiPredicate<TT, TU, TE> falsePredicate()
- FailableBiPredicate<TT, TU, TE> or(FailableBiPredicate<-TT, -TU, TE>)
- Z^TE test(T, T) throws Throwable
- FailableBiPredicate<TT, TU, TE> negate()
- FailableBiPredicate<TT, TU, TE> and(FailableBiPredicate<-TT, -TU, TE>)
- **static** FailableBiPredicate<TT, TU, TE> truePredicate()

### Class: org.apache.commons.lang3.function.FailableBooleanSupplier
Type: Interface

Methods:
- Z^TE getAsBoolean() throws Throwable

### Class: org.apache.commons.lang3.function.FailableCallable
Type: Interface

Methods:
- TR^TE call() throws Throwable

### Class: org.apache.commons.lang3.function.FailableConsumer
Type: Interface

Methods:
- FailableConsumer<TT, TE> andThen(FailableConsumer<-TT, TE>)
- **static** FailableConsumer<TT, TE> nop()
- V^TE accept(T) throws Throwable

### Class: org.apache.commons.lang3.function.FailableDoubleBinaryOperator
Type: Interface

Methods:
- D^TE applyAsDouble(double, double) throws Throwable

### Class: org.apache.commons.lang3.function.FailableDoubleConsumer
Type: Interface

Methods:
- FailableDoubleConsumer<TE> andThen(FailableDoubleConsumer<TE>)
- **static** FailableDoubleConsumer<TE> nop()
- V^TE accept(double) throws Throwable

### Class: org.apache.commons.lang3.function.FailableDoubleSupplier
Type: Interface

Methods:
- D^TE getAsDouble() throws Throwable

### Class: org.apache.commons.lang3.function.FailableFunction
Type: Interface

Methods:
- FailableFunction<TV, TR, TE> compose(FailableFunction<-TV, +TT, TE>)
- TR^TE apply(T) throws Throwable
- **static** FailableFunction<TT, TT, TE> identity()
- **static** FailableFunction<TT, TR, TE> function(FailableFunction<TT, TR, TE>)
- FailableFunction<TT, TV, TE> andThen(FailableFunction<-TR, +TV, TE>)
- **static** FailableFunction<TT, TR, TE> nop()

### Class: org.apache.commons.lang3.function.FailableIntConsumer
Type: Interface

Methods:
- FailableIntConsumer<TE> andThen(FailableIntConsumer<TE>)
- **static** FailableIntConsumer<TE> nop()
- V^TE accept(int) throws Throwable

### Class: org.apache.commons.lang3.function.FailableIntSupplier
Type: Interface

Methods:
- I^TE getAsInt() throws Throwable

### Class: org.apache.commons.lang3.function.FailableLongConsumer
Type: Interface

Methods:
- FailableLongConsumer<TE> andThen(FailableLongConsumer<TE>)
- **static** FailableLongConsumer<TE> nop()
- V^TE accept(long) throws Throwable

### Class: org.apache.commons.lang3.function.FailableLongSupplier
Type: Interface

Methods:
- J^TE getAsLong() throws Throwable

### Class: org.apache.commons.lang3.function.FailablePredicate
Type: Interface

Methods:
- **static** FailablePredicate<TT, TE> falsePredicate()
- FailablePredicate<TT, TE> or(FailablePredicate<-TT, TE>)
- Z^TE test(T) throws Throwable
- FailablePredicate<TT, TE> negate()
- FailablePredicate<TT, TE> and(FailablePredicate<-TT, TE>)
- **static** FailablePredicate<TT, TE> truePredicate()

### Class: org.apache.commons.lang3.function.FailableRunnable
Type: Interface

Methods:
- V^TE run() throws Throwable

### Class: org.apache.commons.lang3.function.FailableShortSupplier
Type: Interface

Methods:
- S^TE getAsShort() throws Throwable

### Class: org.apache.commons.lang3.function.FailableSupplier
Type: Interface

Methods:
- **static** FailableSupplier<TT, TE> nul()
- TT^TE get() throws Throwable

### Class: org.apache.commons.lang3.function.ToBooleanBiFunction
Type: Interface

Methods:
- Z applyAsBoolean(T, T)

### Class: org.apache.commons.lang3.function.Failable
Type: Class

Methods:
- **static** RuntimeException rethrow(Throwable)
- **static** BiConsumer<TT, TU> asBiConsumer(FailableBiConsumer<TT, TU, *>)
- **static** Z test(FailableBiPredicate<TT, TU, TE>, T, T)
- **static** Z test(FailablePredicate<TT, TE>, T)
- **static** D applyAsDouble(FailableDoubleBinaryOperator<TE>, double, double)
- **static** TR apply(FailableBiFunction<TT, TU, TR, TE>, T, T)
- **static** TR apply(FailableFunction<TT, TR, TE>, T)
- **static** BiFunction<TT, TU, TR> asBiFunction(FailableBiFunction<TT, TU, TR, *>)
- **static** V run(FailableRunnable<TE>)
- **static** D getAsDouble(FailableDoubleSupplier<TE>)
- **static** Callable<TV> asCallable(FailableCallable<TV, *>)
- **static** I getAsInt(FailableIntSupplier<TE>)
- **static** V accept(FailableBiConsumer<TT, TU, TE>, T, T)
- **static** V accept(FailableConsumer<TT, TE>, T)
- **static** V accept(FailableDoubleConsumer<TE>, double)
- **static** V accept(FailableIntConsumer<TE>, int)
- **static** V accept(FailableLongConsumer<TE>, long)
- **static** TV call(FailableCallable<TV, TE>)
- **static** Function<TT, TR> asFunction(FailableFunction<TT, TR, *>)
- **static** J getAsLong(FailableLongSupplier<TE>)
- **static** Runnable asRunnable(FailableRunnable<*>)
- **static** Streams$FailableStream<TE> stream(Collection<TE>)
- **static** Streams$FailableStream<TT> stream(Stream<TT>)
- **static** Z getAsBoolean(FailableBooleanSupplier<TE>)
- **static** Supplier<TT> asSupplier(FailableSupplier<TT, *>)
- **static** TT get(FailableSupplier<TT, TE>)
- **static** V tryWithResources(FailableRunnable<Throwable>, FailableConsumer<Throwable, Throwable>, FailableRunnable<Throwable>)
- **static** V tryWithResources(FailableRunnable<Throwable>, FailableRunnable<Throwable>)
- **static** Predicate<TT> asPredicate(FailablePredicate<TT, *>)
- **static** Consumer<TT> asConsumer(FailableConsumer<TT, *>)
- **static** S getAsShort(FailableShortSupplier<TE>)
- **static** BiPredicate<TT, TU> asBiPredicate(FailableBiPredicate<TT, TU, *>)

### Class: org.apache.commons.lang3.function.Suppliers
Type: Class

Methods:
- **static** Supplier<TT> nul()
- **static** TT get(Supplier<TT>)

## Package: org.apache.commons.lang3.math

### Class: org.apache.commons.lang3.math.NumberUtils
Type: Class

Methods:
- **static** Long createLong(String)
- **static** Double createDouble(String)
- **static** int toInt(String)
- **static** int toInt(String, int)
- **static** int compare(byte, byte)
- **static** int compare(int, int)
- **static** int compare(long, long)
- **static** int compare(short, short)
- **static** BigDecimal toScaledBigDecimal(BigDecimal)
- **static** BigDecimal toScaledBigDecimal(BigDecimal, int, RoundingMode)
- **static** BigDecimal toScaledBigDecimal(Double)
- **static** BigDecimal toScaledBigDecimal(Double, int, RoundingMode)
- **static** BigDecimal toScaledBigDecimal(Float)
- **static** BigDecimal toScaledBigDecimal(Float, int, RoundingMode)
- **static** BigDecimal toScaledBigDecimal(String)
- **static** BigDecimal toScaledBigDecimal(String, int, RoundingMode)
- **static** long toLong(String)
- **static** long toLong(String, long)
- **static** byte max(byte[])
- **static** byte max(byte, byte, byte)
- **static** double max(double[])
- **static** double max(double, double, double)
- **static** float max(float[])
- **static** float max(float, float, float)
- **static** int max(int[])
- **static** int max(int, int, int)
- **static** long max(long[])
- **static** long max(long, long, long)
- **static** short max(short[])
- **static** short max(short, short, short)
- **static** float toFloat(String)
- **static** float toFloat(String, float)
- **static** Number createNumber(String)
- **static** byte toByte(String)
- **static** byte toByte(String, byte)
- **static** Float createFloat(String)
- **static** BigDecimal createBigDecimal(String)
- **static** byte min(byte[])
- **static** byte min(byte, byte, byte)
- **static** double min(double[])
- **static** double min(double, double, double)
- **static** float min(float[])
- **static** float min(float, float, float)
- **static** int min(int[])
- **static** int min(int, int, int)
- **static** long min(long[])
- **static** long min(long, long, long)
- **static** short min(short[])
- **static** short min(short, short, short)
- **static** double toDouble(BigDecimal)
- **static** double toDouble(BigDecimal, double)
- **static** double toDouble(String)
- **static** double toDouble(String, double)
- **static** boolean isParsable(String)
- **static** boolean isNumber(String)
- **static** boolean isDigits(String)
- **static** boolean isCreatable(String)
- **static** short toShort(String)
- **static** short toShort(String, short)
- **static** Integer createInteger(String)
- **static** BigInteger createBigInteger(String)

## Package: org.apache.commons.lang3.mutable

### Class: org.apache.commons.lang3.mutable.Mutable
Type: Interface

Methods:
- TT getValue()
- V setValue(T)

### Class: org.apache.commons.lang3.mutable.MutableInt
Type: Class
Extends: java.lang.Number
Implements: java.lang.Comparable, org.apache.commons.lang3.mutable.Mutable

Methods:
- void add(int)
- void add(Number)
- int getAndIncrement()
- int incrementAndGet()
- int intValue()
- void subtract(int)
- void subtract(Number)
- void increment()
- float floatValue()
- int decrementAndGet()
- double doubleValue()
- int compareTo(MutableInt)
- int compareTo(Object)
- long longValue()
- Integer toInteger()
- Integer getValue()
- Object getValue()
- int hashCode()
- void decrement()
- void setValue(int)
- void setValue(Number)
- void setValue(Object)
- boolean equals(Object)
- int getAndAdd(int)
- int getAndAdd(Number)
- String toString()
- int addAndGet(int)
- int addAndGet(Number)
- int getAndDecrement()

### Class: org.apache.commons.lang3.mutable.MutableObject
Type: Class
Implements: org.apache.commons.lang3.mutable.Mutable, java.io.Serializable

Methods:
- TT getValue()
- int hashCode()
- V setValue(T)
- boolean equals(Object)
- String toString()

## Package: org.apache.commons.lang3.reflect

### Class: org.apache.commons.lang3.reflect.Typed
Type: Interface

Methods:
- Type getType()

### Class: org.apache.commons.lang3.reflect.MethodUtils
Type: Class

Methods:
- **static** Object invokeStaticMethod(Class<*>, String, Object)
- **static** Object invokeStaticMethod(Class<*>, String, Object, Class<*>)
- **static** Method getMatchingAccessibleMethod(Class<*>, String, Class<*>)
- **static** Set<Method> getOverrideHierarchy(Method, ClassUtils$Interfaces)
- **static** Method getMatchingMethod(Class<*>, String, Class<*>)
- **static** TA getAnnotation(Method, Class<TA>, boolean, boolean)
- **static** Method getAccessibleMethod(Class<*>, String, Class<*>)
- **static** Method getAccessibleMethod(Method)
- **static** Method getMethodsWithAnnotation(Class<*>, Class<Annotation>)
- **static** Method getMethodsWithAnnotation(Class<*>, Class<Annotation>, boolean, boolean)
- **static** List<Method> getMethodsListWithAnnotation(Class<*>, Class<Annotation>)
- **static** List<Method> getMethodsListWithAnnotation(Class<*>, Class<Annotation>, boolean, boolean)
- **static** Object invokeExactStaticMethod(Class<*>, String, Object)
- **static** Object invokeExactStaticMethod(Class<*>, String, Object, Class<*>)
- **static** Object invokeExactMethod(Object, String)
- **static** Object invokeExactMethod(Object, String, Object[])
- **static** Object invokeExactMethod(Object, String, Object, Class<*>)
- **static** Method getMethodObject(Class<*>, String, Class<*>)
- **static** Object invokeMethod(Object, boolean, String)
- **static** Object invokeMethod(Object, boolean, String, Object[])
- **static** Object invokeMethod(Object, boolean, String, Object, Class<*>)
- **static** Object invokeMethod(Object, String)
- **static** Object invokeMethod(Object, String, Object[])
- **static** Object invokeMethod(Object, String, Object, Class<*>)

### Class: org.apache.commons.lang3.reflect.TypeUtils
Type: Class

Methods:
- **static** boolean isAssignable(Type, Type)
- **static** Class<*> getRawType(Type, Type)
- **static** ParameterizedType parameterize(Class<*>, Map<TypeVariable<*>, Type>)
- **static** ParameterizedType parameterize(Class<*>, Type)
- **static** Z typesSatisfyVariables(Map<TypeVariable<*>, Type>)
- **static** boolean isArrayType(Type)
- **static** Type[] getImplicitUpperBounds(WildcardType)
- **static** Map<TypeVariable<*>, Type> determineTypeArguments(Class<*>, ParameterizedType)
- **static** TypeUtils$WildcardTypeBuilder wildcardType()
- **static** GenericArrayType genericArrayType(Type)
- **static** Type[] normalizeUpperBounds(Type[])
- **static** boolean isInstance(Object, Type)
- **static** Type unrollVariables(Map<TypeVariable<*>, Type>, Type)
- **static** ParameterizedType parameterizeWithOwner(Type, Class<*>, Map<TypeVariable<*>, Type>)
- **static** ParameterizedType parameterizeWithOwner(Type, Class<*>, Type)
- **static** Type getImplicitBounds(TypeVariable<*>)
- **static** String toLongString(TypeVariable<*>)
- **static** boolean equals(Type, Type)
- **static** String toString(Type)
- **static** Map<TypeVariable<*>, Type> getTypeArguments(ParameterizedType)
- **static** Map<TypeVariable<*>, Type> getTypeArguments(Type, Class<*>)
- **static** boolean containsTypeVariables(Type)
- **static** Typed<TT> wrap(Class<TT>)
- **static** Typed<TT> wrap(Type)
- **static** Type[] getImplicitLowerBounds(WildcardType)
- **static** Type getArrayComponentType(Type)

### Class: org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder
Type: Class
Implements: org.apache.commons.lang3.builder.Builder

Methods:
- TypeUtils$WildcardTypeBuilder withUpperBounds(Type[])
- WildcardType build()
- Object build()
- TypeUtils$WildcardTypeBuilder withLowerBounds(Type[])

## Package: org.apache.commons.lang3.stream

### Class: org.apache.commons.lang3.stream.LangCollectors
Type: Class

Methods:
- **static** Collector<Object, String> joining()
- **static** Collector<Object, String> joining(CharSequence)
- **static** Collector<Object, String> joining(CharSequence, CharSequence, CharSequence)
- **static** Collector<Object, String> joining(CharSequence, CharSequence, CharSequence, Function<Object, String>)
- **static** TR collect(Collector<-TT, TA, TR>, [T)

### Class: org.apache.commons.lang3.stream.Streams
Type: Class

Methods:
- **static** Stream<TE> instancesOf(Class<-TE>, Collection<-TE>)
- **static** Streams$FailableStream<TE> stream(Collection<TE>)
- **static** Streams$FailableStream<TT> stream(Stream<TT>)
- **static** Stream<TE> of(Collection<TE>)
- **static** Stream<TE> of(Enumeration<TE>)
- **static** Stream<TE> of(Iterable<TE>)
- **static** Stream<TE> of(Iterator<TE>)
- **static** Stream<TT> of([T)
- **static** Collector<TT, *[TT> toArray(Class<TT>)
- **static** Streams$FailableStream<TT> failableStream(Collection<TT>)
- **static** Streams$FailableStream<TT> failableStream(Stream<TT>)
- **static** Streams$FailableStream<TT> failableStream(T)
- **static** Streams$FailableStream<TT> failableStream([T)
- **static** Stream<TE> nonNull(Collection<TE>)
- **static** Stream<TE> nonNull(T)
- **static** Stream<TE> nonNull([T)
- **static** Stream<TE> nonNull(Stream<TE>)

### Class: org.apache.commons.lang3.stream.Streams$ArrayCollector
Type: Class
Implements: java.util.stream.Collector

Methods:
- Set<Collector$Characteristics> characteristics()
- Supplier<List<TE>> supplier()
- Function<List<TE>, [TE> finisher()
- BiConsumer<List<TE>, TE> accumulator()
- BinaryOperator<List<TE>> combiner()

### Class: org.apache.commons.lang3.stream.Streams$FailableStream
Type: Class

Methods:
- TT reduce(T, T)
- Streams$FailableStream<TT> filter(FailablePredicate<TT, *>)
- Stream<TT> stream()
- V forEach(FailableConsumer<TT, *>)
- Streams$FailableStream<TR> map(FailableFunction<TT, TR, *>)
- TR collect(Collector<-TT, TA, TR>)
- TR collect(Supplier<TR>, BiConsumer<TR, -TT>, BiConsumer<TR, TR>)
- Z anyMatch(FailablePredicate<TT, *>)
- Z allMatch(FailablePredicate<TT, *>)

## Package: org.apache.commons.lang3.text

### Class: org.apache.commons.lang3.text.StrBuilder
Type: Class
Implements: java.lang.CharSequence, java.lang.Appendable, java.io.Serializable, org.apache.commons.lang3.builder.Builder

Methods:
- StrBuilder deleteCharAt(int)
- char[] toCharArray()
- char[] toCharArray(int, int)
- StrBuilder setCharAt(int, char)
- StrBuilder replace(int, int, String)
- StrBuilder replace(StrMatcher, String, int, int, int)
- StringBuilder toStringBuilder()
- StrBuilder appendWithSeparators(Iterable<*>, String)
- StrBuilder appendWithSeparators(Iterator<*>, String)
- StrBuilder appendWithSeparators(Object[], String)
- StrBuilder trim()
- StrTokenizer asTokenizer()
- StrBuilder minimizeCapacity()
- boolean equalsIgnoreCase(StrBuilder)
- int indexOf(char)
- int indexOf(char, int)
- int indexOf(String)
- int indexOf(String, int)
- int indexOf(StrMatcher)
- int indexOf(StrMatcher, int)
- StrBuilder setNullText(String)
- int readFrom(Readable)
- StrBuilder appendFixedWidthPadLeft(int, int, char)
- StrBuilder appendFixedWidthPadLeft(Object, int, char)
- StrBuilder appendSeparator(char)
- StrBuilder appendSeparator(char, char)
- StrBuilder appendSeparator(char, int)
- StrBuilder appendSeparator(String)
- StrBuilder appendSeparator(String, int)
- StrBuilder appendSeparator(String, String)
- StrBuilder setLength(int)
- boolean contains(char)
- boolean contains(String)
- boolean contains(StrMatcher)
- int size()
- String leftString(int)
- boolean endsWith(String)
- StrBuilder appendNull()
- boolean isNotEmpty()
- StrBuilder ensureCapacity(int)
- StringBuffer toStringBuffer()
- StrBuilder setNewLineText(String)
- StrBuilder insert(int, boolean)
- StrBuilder insert(int, char)
- StrBuilder insert(int, char[])
- StrBuilder insert(int, char[], int, int)
- StrBuilder insert(int, double)
- StrBuilder insert(int, float)
- StrBuilder insert(int, int)
- StrBuilder insert(int, long)
- StrBuilder insert(int, Object)
- StrBuilder insert(int, String)
- StrBuilder appendNewLine()
- String rightString(int)
- StrBuilder replaceFirst(char, char)
- StrBuilder replaceFirst(String, String)
- StrBuilder replaceFirst(StrMatcher, String)
- StrBuilder replaceAll(char, char)
- StrBuilder replaceAll(String, String)
- StrBuilder replaceAll(StrMatcher, String)
- StrBuilder delete(int, int)
- String substring(int)
- String substring(int, int)
- int capacity()
- String midString(int, int)
- String getNewLineText()
- int hashCode()
- void appendTo(Appendable)
- char[] getChars(char[])
- void getChars(int, int, char[], int)
- StrBuilder appendAll(Iterable<*>)
- StrBuilder appendAll(Iterator<*>)
- StrBuilder appendAll([T)
- int length()
- boolean isEmpty()
- StrBuilder deleteAll(char)
- StrBuilder deleteAll(String)
- StrBuilder deleteAll(StrMatcher)
- StrBuilder clear()
- Writer asWriter()
- CharSequence subSequence(int, int)
- StrBuilder reverse()
- int lastIndexOf(char)
- int lastIndexOf(char, int)
- int lastIndexOf(String)
- int lastIndexOf(String, int)
- int lastIndexOf(StrMatcher)
- int lastIndexOf(StrMatcher, int)
- StrBuilder appendln(boolean)
- StrBuilder appendln(char)
- StrBuilder appendln(char[])
- StrBuilder appendln(char[], int, int)
- StrBuilder appendln(double)
- StrBuilder appendln(float)
- StrBuilder appendln(int)
- StrBuilder appendln(long)
- StrBuilder appendln(Object)
- StrBuilder appendln(StrBuilder)
- StrBuilder appendln(StrBuilder, int, int)
- StrBuilder appendln(String)
- StrBuilder appendln(String, int, int)
- StrBuilder appendln(String, Object[])
- StrBuilder appendln(StringBuffer)
- StrBuilder appendln(StringBuffer, int, int)
- StrBuilder appendln(StringBuilder)
- StrBuilder appendln(StringBuilder, int, int)
- String getNullText()
- String build()
- Object build()
- boolean equals(Object)
- boolean equals(StrBuilder)
- StrBuilder appendFixedWidthPadRight(int, int, char)
- StrBuilder appendFixedWidthPadRight(Object, int, char)
- StrBuilder deleteFirst(char)
- StrBuilder deleteFirst(String)
- StrBuilder deleteFirst(StrMatcher)
- String toString()
- StrBuilder appendPadding(int, char)
- Reader asReader()
- char charAt(int)
- StrBuilder append(boolean)
- StrBuilder append(char)
- StrBuilder append(char[])
- StrBuilder append(char[], int, int)
- StrBuilder append(CharBuffer)
- StrBuilder append(CharBuffer, int, int)
- StrBuilder append(CharSequence)
- StrBuilder append(CharSequence, int, int)
- StrBuilder append(double)
- StrBuilder append(float)
- StrBuilder append(int)
- StrBuilder append(long)
- StrBuilder append(Object)
- StrBuilder append(StrBuilder)
- StrBuilder append(StrBuilder, int, int)
- StrBuilder append(String)
- StrBuilder append(String, int, int)
- StrBuilder append(String, Object[])
- StrBuilder append(StringBuffer)
- StrBuilder append(StringBuffer, int, int)
- StrBuilder append(StringBuilder)
- StrBuilder append(StringBuilder, int, int)
- Appendable append(char)
- Appendable append(CharSequence, int, int)
- Appendable append(CharSequence)
- boolean startsWith(String)

### Class: org.apache.commons.lang3.text.StrMatcher
Type: Abstract Class

Methods:
- **static** StrMatcher quoteMatcher()
- **static** StrMatcher tabMatcher()
- **static** StrMatcher stringMatcher(String)
- **static** StrMatcher noneMatcher()
- int isMatch(char[], int)
- int isMatch(char[], int, int, int)
- **static** StrMatcher trimMatcher()
- **static** StrMatcher charMatcher(char)
- **static** StrMatcher splitMatcher()
- **static** StrMatcher singleQuoteMatcher()
- **static** StrMatcher commaMatcher()
- **static** StrMatcher charSetMatcher(char[])
- **static** StrMatcher charSetMatcher(String)
- **static** StrMatcher doubleQuoteMatcher()
- **static** StrMatcher spaceMatcher()

### Class: org.apache.commons.lang3.text.StrTokenizer
Type: Class
Implements: java.util.ListIterator, java.lang.Cloneable

Methods:
- String next()
- Object next()
- **static** StrTokenizer getCSVInstance()
- **static** StrTokenizer getCSVInstance(char[])
- **static** StrTokenizer getCSVInstance(String)
- String previousToken()
- String getContent()
- boolean isEmptyTokenAsNull()
- int nextIndex()
- boolean isIgnoreEmptyTokens()
- void remove()
- StrTokenizer setTrimmerMatcher(StrMatcher)
- boolean hasPrevious()
- List<String> getTokenList()
- StrTokenizer setDelimiterChar(char)
- StrTokenizer setDelimiterString(String)
- StrMatcher getTrimmerMatcher()
- void add(String)
- void add(Object)
- void set(String)
- void set(Object)
- **static** StrTokenizer getTSVInstance()
- **static** StrTokenizer getTSVInstance(char[])
- **static** StrTokenizer getTSVInstance(String)
- StrTokenizer setQuoteChar(char)
- String previous()
- Object previous()
- StrTokenizer setIgnoredChar(char)
- StrMatcher getQuoteMatcher()
- StrMatcher getDelimiterMatcher()
- StrTokenizer setDelimiterMatcher(StrMatcher)
- boolean hasNext()
- StrTokenizer setQuoteMatcher(StrMatcher)
- StrMatcher getIgnoredMatcher()
- StrTokenizer setIgnoreEmptyTokens(boolean)
- String[] getTokenArray()
- int size()
- StrTokenizer setEmptyTokenAsNull(boolean)
- String nextToken()
- Object clone()
- StrTokenizer reset()
- StrTokenizer reset(char[])
- StrTokenizer reset(String)
- String toString()
- StrTokenizer setIgnoredMatcher(StrMatcher)
- int previousIndex()

### Class: org.apache.commons.lang3.text.WordUtils
Type: Class

Methods:
- **static** boolean containsAllWords(CharSequence, CharSequence[])
- **static** String uncapitalize(String)
- **static** String uncapitalize(String, char[])
- **static** String initials(String)
- **static** String initials(String, char[])
- **static** String capitalizeFully(String)
- **static** String capitalizeFully(String, char[])
- **static** String wrap(String, int)
- **static** String wrap(String, int, String, boolean)
- **static** String wrap(String, int, String, boolean, String)
- **static** String capitalize(String)
- **static** String capitalize(String, char[])
- **static** String swapCase(String)

## Package: org.apache.commons.lang3.text.translate

### Class: org.apache.commons.lang3.text.translate.AggregateTranslator
Type: Class
Extends: org.apache.commons.lang3.text.translate.CharSequenceTranslator

Methods:
- int translate(CharSequence, int, Writer)

### Class: org.apache.commons.lang3.text.translate.CharSequenceTranslator
Type: Abstract Class

Methods:
- CharSequenceTranslator with(CharSequenceTranslator[])
- **static** String hex(int)
- String translate(CharSequence)
- int translate(CharSequence, int, Writer)
- void translate(CharSequence, Writer)

### Class: org.apache.commons.lang3.text.translate.CodePointTranslator
Type: Abstract Class
Extends: org.apache.commons.lang3.text.translate.CharSequenceTranslator

Methods:
- int translate(CharSequence, int, Writer)
- boolean translate(int, Writer)

### Class: org.apache.commons.lang3.text.translate.EntityArrays
Type: Class

Methods:
- **static** String[][] HTML40_EXTENDED_ESCAPE()
- **static** String[][] BASIC_UNESCAPE()
- **static** String[][] ISO8859_1_UNESCAPE()
- **static** String[][] invert(String[][])
- **static** String[][] JAVA_CTRL_CHARS_UNESCAPE()
- **static** String[][] ISO8859_1_ESCAPE()
- **static** String[][] HTML40_EXTENDED_UNESCAPE()
- **static** String[][] JAVA_CTRL_CHARS_ESCAPE()
- **static** String[][] BASIC_ESCAPE()
- **static** String[][] APOS_ESCAPE()
- **static** String[][] APOS_UNESCAPE()

### Class: org.apache.commons.lang3.text.translate.JavaUnicodeEscaper
Type: Class
Extends: org.apache.commons.lang3.text.translate.UnicodeEscaper

Methods:
- **static** JavaUnicodeEscaper outsideOf(int, int)
- **static** JavaUnicodeEscaper below(int)
- **static** JavaUnicodeEscaper above(int)
- **static** JavaUnicodeEscaper between(int, int)

### Class: org.apache.commons.lang3.text.translate.LookupTranslator
Type: Class
Extends: org.apache.commons.lang3.text.translate.CharSequenceTranslator

Methods:
- int translate(CharSequence, int, Writer)

### Class: org.apache.commons.lang3.text.translate.NumericEntityEscaper
Type: Class
Extends: org.apache.commons.lang3.text.translate.CodePointTranslator

Methods:
- **static** NumericEntityEscaper outsideOf(int, int)
- **static** NumericEntityEscaper below(int)
- **static** NumericEntityEscaper above(int)
- boolean translate(int, Writer)
- **static** NumericEntityEscaper between(int, int)

### Class: org.apache.commons.lang3.text.translate.NumericEntityUnescaper
Type: Class
Extends: org.apache.commons.lang3.text.translate.CharSequenceTranslator

Methods:
- boolean isSet(NumericEntityUnescaper$OPTION)
- int translate(CharSequence, int, Writer)

### Class: org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- semiColonRequired
- semiColonOptional
- errorIfNoSemiColon

Methods:
- **static** NumericEntityUnescaper$OPTION valueOf(String)
- **static** NumericEntityUnescaper$OPTION[] values()

### Class: org.apache.commons.lang3.text.translate.OctalUnescaper
Type: Class
Extends: org.apache.commons.lang3.text.translate.CharSequenceTranslator

Methods:
- int translate(CharSequence, int, Writer)

### Class: org.apache.commons.lang3.text.translate.UnicodeEscaper
Type: Class
Extends: org.apache.commons.lang3.text.translate.CodePointTranslator

Methods:
- **static** UnicodeEscaper outsideOf(int, int)
- **static** UnicodeEscaper below(int)
- **static** UnicodeEscaper above(int)
- boolean translate(int, Writer)
- **static** UnicodeEscaper between(int, int)

### Class: org.apache.commons.lang3.text.translate.UnicodeUnescaper
Type: Class
Extends: org.apache.commons.lang3.text.translate.CharSequenceTranslator

Methods:
- int translate(CharSequence, int, Writer)

### Class: org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover
Type: Class
Extends: org.apache.commons.lang3.text.translate.CodePointTranslator

Methods:
- boolean translate(int, Writer)

## Package: org.apache.commons.lang3.time

### Class: org.apache.commons.lang3.time.DurationUtils
Type: Class

Methods:
- **static** int getNanosOfMiili(Duration)
- **static** Duration zeroIfNull(Duration)
- **static** Duration^TE of(FailableConsumer<Instant, TE>)
- **static** Duration^TE of(FailableRunnable<TE>)
- **static** int getNanosOfMilli(Duration)
- **static** boolean isPositive(Duration)
- **static** int toMillisInt(Duration)
- **static** Duration toDuration(long, TimeUnit)
- **static** Duration since(Temporal)
- **static** V^TT accept(FailableBiConsumer<Long, Integer, TT>, Duration)

## Package: org.apache.commons.lang3.tuple

### Class: org.apache.commons.lang3.tuple.ImmutablePair
Type: Class
Extends: org.apache.commons.lang3.tuple.Pair

Methods:
- TR getRight()
- **static** Pair<TL, TR> left(T)
- TR setValue(T)
- **static** ImmutablePair<TL, TR> of(T, )
- **static** ImmutablePair<TL, TR> of(Map$Entry<TL, TR>)
- **static** ImmutablePair<TL, TR> ofNonNull(T, )
- **static** Pair<TL, TR> right(T)
- **static** ImmutablePair<TL, TR> emptyArray()
- **static** ImmutablePair<TL, TR> nullPair()
- TL getLeft()

### Class: org.apache.commons.lang3.tuple.ImmutableTriple
Type: Class
Extends: org.apache.commons.lang3.tuple.Triple

Methods:
- **static** ImmutableTriple<TL, TM, TR> nullTriple()
- TR getRight()
- TM getMiddle()
- **static** ImmutableTriple<TL, TM, TR> of(T, , T)
- **static** ImmutableTriple<TL, TM, TR> ofNonNull(T, , T)
- **static** ImmutableTriple<TL, TM, TR> emptyArray()
- TL getLeft()

### Class: org.apache.commons.lang3.tuple.Pair
Type: Abstract Class
Implements: java.util.Map$Entry, java.lang.Comparable, java.io.Serializable

Methods:
- TL getKey()
- TV^TE apply(FailableBiFunction<TL, TR, TV, TE>)
- I compareTo(Pair<TL, TR>)
- int compareTo(Object)
- V^TE accept(FailableBiConsumer<TL, TR, TE>)
- TR getValue()
- TR getRight()
- int hashCode()
- boolean equals(Object)
- **static** Pair<TL, TR> of(T, )
- **static** Pair<TL, TR> of(Map$Entry<TL, TR>)
- String toString()
- String toString(String)
- **static** Pair<TL, TR> ofNonNull(T, )
- **static** Pair<TL, TR> emptyArray()
- TL getLeft()

### Class: org.apache.commons.lang3.tuple.Triple
Type: Abstract Class
Implements: java.lang.Comparable, java.io.Serializable

Methods:
- TR getRight()
- int hashCode()
- TM getMiddle()
- boolean equals(Object)
- **static** Triple<TL, TM, TR> of(T, , T)
- String toString()
- String toString(String)
- **static** Triple<TL, TM, TR> ofNonNull(T, , T)
- I compareTo(Triple<TL, TM, TR>)
- int compareTo(Object)
- **static** Triple<TL, TM, TR> emptyArray()
- TL getLeft()

## Package: org.apache.commons.math3

### Class: org.apache.commons.math3.Field
Type: Interface

Methods:
- Class<FieldElement<TT>> getRuntimeClass()
- TT getZero()
- TT getOne()

### Class: org.apache.commons.math3.FieldElement
Type: Interface

Methods:
- TT add(T) throws NullArgumentException
- TT negate()
- TT subtract(T) throws NullArgumentException
- Field<TT> getField()
- TT reciprocal() throws MathArithmeticException
- TT divide(T) throws NullArgumentException, MathArithmeticException
- TT multiply(int)
- TT multiply(T) throws NullArgumentException

### Class: org.apache.commons.math3.RealFieldElement
Type: Interface
Implements: org.apache.commons.math3.FieldElement

Methods:
- TT scalb(int)
- TT atanh()
- TT log()
- TT copySign(T)
- TT copySign(double)
- TT cos()
- TT log1p()
- TT expm1()
- TT rint()
- TT reciprocal()
- TT atan()
- TT cbrt()
- double getReal()
- TT tanh()
- TT sqrt()
- TT rootN(int)
- TT hypot(T) throws DimensionMismatchException
- TT sin()
- TT pow(double)
- TT pow(int)
- TT pow(T) throws DimensionMismatchException
- TT divide(double)
- TT exp()
- TT floor()
- TT multiply(double)
- TT atan2(T) throws DimensionMismatchException
- TT tan()
- TT signum()
- TT add(double)
- TT sinh()
- TT acosh()
- TT subtract(double)
- TT linearCombination([T, T) throws DimensionMismatchException
- TT linearCombination([D, [T) throws DimensionMismatchException
- TT linearCombination(T, T, ;, T)
- TT linearCombination(double, T, T, ;)
- TT linearCombination(T, T, ;, T, T, ;)
- TT linearCombination(double, T, T, ;, double, T)
- TT linearCombination(T, T, ;, T, T, ;, T, T)
- TT linearCombination(double, T, T, ;, double, T, T, ;)
- TT acos()
- TT ceil()
- TT cosh()
- TT abs()
- long round()
- TT asin()
- TT asinh()
- TT remainder(double)
- TT remainder(T) throws DimensionMismatchException

## Package: org.apache.commons.math3.analysis

### Class: org.apache.commons.math3.analysis.UnivariateFunction
Type: Interface

Methods:
- double value(double)

## Package: org.apache.commons.math3.analysis.solvers

### Class: org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver
Type: Interface

Methods:
- double getFunctionValueAccuracy()
- double getAbsoluteAccuracy()
- D solve(int, T, float, U) throws MathIllegalArgumentException, TooManyEvaluationsException
- D solve(int, T, float, U, N) throws MathIllegalArgumentException, TooManyEvaluationsException
- D solve(int, T, float)
- int getMaxEvaluations()
- int getEvaluations()
- double getRelativeAccuracy()

### Class: org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver
Type: Interface
Implements: org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver

Methods:
- D solve(int, T, float, U, N)
- D solve(int, T, float, U, N, char)

### Class: org.apache.commons.math3.analysis.solvers.UnivariateSolver
Type: Interface
Implements: org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver

No public methods found

### Class: org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver
Type: Abstract Class
Extends: org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver
Implements: org.apache.commons.math3.analysis.solvers.UnivariateSolver

No public methods found

### Class: org.apache.commons.math3.analysis.solvers.AllowedSolution
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ANY_SIDE
- LEFT_SIDE
- RIGHT_SIDE
- BELOW_SIDE
- ABOVE_SIDE

Methods:
- **static** AllowedSolution valueOf(String)
- **static** AllowedSolution[] values()

### Class: org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver
Type: Abstract Class
Implements: org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver

Methods:
- double getFunctionValueAccuracy()
- double getStartValue()
- double getAbsoluteAccuracy()
- double getMin()
- double getMax()
- D solve(int, T, float, U, N)
- D solve(int, T, float, U)
- D solve(int, T, float)
- int getMaxEvaluations()
- int getEvaluations()
- double getRelativeAccuracy()

### Class: org.apache.commons.math3.analysis.solvers.BrentSolver
Type: Class
Extends: org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver

No public methods found

### Class: org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils
Type: Class

Methods:
- **static** void verifySequence(double, double, double)
- **static** D forceSide(int, UnivariateFunction, BracketedUnivariateSolver<UnivariateFunction>, double, double, double, AllowedSolution)
- **static** boolean isSequence(double, double, double)
- **static** void verifyInterval(double, double)
- **static** double solve(UnivariateFunction, double, double)
- **static** double solve(UnivariateFunction, double, double, double)
- **static** double[] bracket(UnivariateFunction, double, double, double)
- **static** double[] bracket(UnivariateFunction, double, double, double, int)
- **static** double[] bracket(UnivariateFunction, double, double, double, double, double, int)
- **static** double midpoint(double, double)
- **static** boolean isBracketing(UnivariateFunction, double, double)
- **static** void verifyBracketing(UnivariateFunction, double, double)

## Package: org.apache.commons.math3.distribution

### Class: org.apache.commons.math3.distribution.IntegerDistribution
Type: Interface

Methods:
- void reseedRandomGenerator(long)
- double getNumericalVariance()
- double cumulativeProbability(int)
- double cumulativeProbability(int, int) throws NumberIsTooLargeException
- double getNumericalMean()
- double probability(int)
- boolean isSupportConnected()
- int inverseCumulativeProbability(double) throws OutOfRangeException
- int getSupportLowerBound()
- int sample()
- int[] sample(int)
- int getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.RealDistribution
Type: Interface

Methods:
- void reseedRandomGenerator(long)
- double cumulativeProbability(double)
- double cumulativeProbability(double, double) throws NumberIsTooLargeException
- double density(double)
- double probability(double)
- boolean isSupportConnected()
- double getSupportLowerBound()
- double sample()
- double[] sample(int)
- boolean isSupportUpperBoundInclusive()
- double getNumericalVariance()
- double getNumericalMean()
- double inverseCumulativeProbability(double) throws OutOfRangeException
- boolean isSupportLowerBoundInclusive()
- double getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.AbstractIntegerDistribution
Type: Abstract Class
Implements: org.apache.commons.math3.distribution.IntegerDistribution, java.io.Serializable

Methods:
- void reseedRandomGenerator(long)
- double cumulativeProbability(int, int)
- double logProbability(int)
- int inverseCumulativeProbability(double)
- int sample()
- int[] sample(int)

### Class: org.apache.commons.math3.distribution.AbstractRealDistribution
Type: Abstract Class
Implements: org.apache.commons.math3.distribution.RealDistribution, java.io.Serializable

Methods:
- void reseedRandomGenerator(long)
- double logDensity(double)
- double cumulativeProbability(double, double)
- double probability(double, double)
- double probability(double)
- double inverseCumulativeProbability(double)
- double sample()
- double[] sample(int)

### Class: org.apache.commons.math3.distribution.BetaDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractRealDistribution

Methods:
- boolean isSupportUpperBoundInclusive()
- double getNumericalVariance()
- double cumulativeProbability(double)
- double logDensity(double)
- double density(double)
- double getNumericalMean()
- boolean isSupportConnected()
- boolean isSupportLowerBoundInclusive()
- double getBeta()
- double getSupportLowerBound()
- double sample()
- double getSupportUpperBound()
- double getAlpha()

### Class: org.apache.commons.math3.distribution.BinomialDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractIntegerDistribution

Methods:
- double getNumericalVariance()
- double cumulativeProbability(int)
- int getNumberOfTrials()
- double getNumericalMean()
- double logProbability(int)
- double probability(int)
- double getProbabilityOfSuccess()
- boolean isSupportConnected()
- int getSupportLowerBound()
- int getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.CauchyDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractRealDistribution

Methods:
- boolean isSupportUpperBoundInclusive()
- double getNumericalVariance()
- double cumulativeProbability(double)
- double density(double)
- double getScale()
- double getMedian()
- double getNumericalMean()
- boolean isSupportConnected()
- double inverseCumulativeProbability(double)
- boolean isSupportLowerBoundInclusive()
- double getSupportLowerBound()
- double getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.ChiSquaredDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractRealDistribution

Methods:
- boolean isSupportUpperBoundInclusive()
- double getNumericalVariance()
- double cumulativeProbability(double)
- double logDensity(double)
- double density(double)
- double getNumericalMean()
- boolean isSupportConnected()
- double getDegreesOfFreedom()
- boolean isSupportLowerBoundInclusive()
- double getSupportLowerBound()
- double getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.ExponentialDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractRealDistribution

Methods:
- boolean isSupportUpperBoundInclusive()
- double getNumericalVariance()
- double cumulativeProbability(double)
- double logDensity(double)
- double density(double)
- double getNumericalMean()
- boolean isSupportConnected()
- double inverseCumulativeProbability(double)
- double getMean()
- boolean isSupportLowerBoundInclusive()
- double getSupportLowerBound()
- double sample()
- double getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.FDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractRealDistribution

Methods:
- boolean isSupportUpperBoundInclusive()
- double getNumericalVariance()
- double cumulativeProbability(double)
- double logDensity(double)
- double getDenominatorDegreesOfFreedom()
- double density(double)
- double getNumericalMean()
- boolean isSupportConnected()
- double getNumeratorDegreesOfFreedom()
- boolean isSupportLowerBoundInclusive()
- double getSupportLowerBound()
- double getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.GammaDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractRealDistribution

Methods:
- double cumulativeProbability(double)
- double logDensity(double)
- double density(double)
- boolean isSupportConnected()
- double getShape()
- double getSupportLowerBound()
- double sample()
- double getAlpha()
- boolean isSupportUpperBoundInclusive()
- double getNumericalVariance()
- double getScale()
- double getNumericalMean()
- boolean isSupportLowerBoundInclusive()
- double getBeta()
- double getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.HypergeometricDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractIntegerDistribution

Methods:
- double getNumericalVariance()
- int getNumberOfSuccesses()
- double cumulativeProbability(int)
- double upperCumulativeProbability(int)
- double getNumericalMean()
- double logProbability(int)
- double probability(int)
- boolean isSupportConnected()
- int getSampleSize()
- int getPopulationSize()
- int getSupportLowerBound()
- int getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.NormalDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractRealDistribution

Methods:
- double getStandardDeviation()
- double cumulativeProbability(double)
- double cumulativeProbability(double, double)
- double logDensity(double)
- double density(double)
- double probability(double, double)
- boolean isSupportConnected()
- double getSupportLowerBound()
- double sample()
- boolean isSupportUpperBoundInclusive()
- double getNumericalVariance()
- double getNumericalMean()
- double inverseCumulativeProbability(double)
- double getMean()
- boolean isSupportLowerBoundInclusive()
- double getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.PascalDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractIntegerDistribution

Methods:
- double getNumericalVariance()
- int getNumberOfSuccesses()
- double cumulativeProbability(int)
- double getNumericalMean()
- double logProbability(int)
- double probability(int)
- double getProbabilityOfSuccess()
- boolean isSupportConnected()
- int getSupportLowerBound()
- int getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.PoissonDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractIntegerDistribution

Methods:
- double getNumericalVariance()
- double cumulativeProbability(int)
- double normalApproximateProbability(int)
- double getNumericalMean()
- double logProbability(int)
- double probability(int)
- boolean isSupportConnected()
- double getMean()
- int getSupportLowerBound()
- int sample()
- int getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.TDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractRealDistribution

Methods:
- boolean isSupportUpperBoundInclusive()
- double getNumericalVariance()
- double cumulativeProbability(double)
- double logDensity(double)
- double density(double)
- double getNumericalMean()
- boolean isSupportConnected()
- double getDegreesOfFreedom()
- boolean isSupportLowerBoundInclusive()
- double getSupportLowerBound()
- double getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.UniformIntegerDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractIntegerDistribution

Methods:
- double getNumericalVariance()
- double cumulativeProbability(int)
- double getNumericalMean()
- double probability(int)
- boolean isSupportConnected()
- int getSupportLowerBound()
- int sample()
- int getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.WeibullDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractRealDistribution

Methods:
- boolean isSupportUpperBoundInclusive()
- double getNumericalVariance()
- double cumulativeProbability(double)
- double logDensity(double)
- double density(double)
- double getScale()
- double getNumericalMean()
- boolean isSupportConnected()
- double inverseCumulativeProbability(double)
- double getShape()
- boolean isSupportLowerBoundInclusive()
- double getSupportLowerBound()
- double getSupportUpperBound()

### Class: org.apache.commons.math3.distribution.ZipfDistribution
Type: Class
Extends: org.apache.commons.math3.distribution.AbstractIntegerDistribution

Methods:
- double getNumericalVariance()
- double cumulativeProbability(int)
- double getNumericalMean()
- double logProbability(int)
- double probability(int)
- int getNumberOfElements()
- boolean isSupportConnected()
- int getSupportLowerBound()
- int sample()
- int getSupportUpperBound()
- double getExponent()

## Package: org.apache.commons.math3.exception

### Class: org.apache.commons.math3.exception.ConvergenceException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalStateException

No public methods found

### Class: org.apache.commons.math3.exception.DimensionMismatchException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalNumberException

Methods:
- int getDimension()

### Class: org.apache.commons.math3.exception.MathArithmeticException
Type: Class
Extends: java.lang.ArithmeticException
Implements: org.apache.commons.math3.exception.util.ExceptionContextProvider

Methods:
- String getLocalizedMessage()
- String getMessage()
- ExceptionContext getContext()

### Class: org.apache.commons.math3.exception.MathIllegalArgumentException
Type: Class
Extends: java.lang.IllegalArgumentException
Implements: org.apache.commons.math3.exception.util.ExceptionContextProvider

Methods:
- String getLocalizedMessage()
- String getMessage()
- ExceptionContext getContext()

### Class: org.apache.commons.math3.exception.MathIllegalNumberException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalArgumentException

Methods:
- Number getArgument()

### Class: org.apache.commons.math3.exception.MathIllegalStateException
Type: Class
Extends: java.lang.IllegalStateException
Implements: org.apache.commons.math3.exception.util.ExceptionContextProvider

Methods:
- String getLocalizedMessage()
- String getMessage()
- ExceptionContext getContext()

### Class: org.apache.commons.math3.exception.MathInternalError
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalStateException

No public methods found

### Class: org.apache.commons.math3.exception.MathUnsupportedOperationException
Type: Class
Extends: java.lang.UnsupportedOperationException
Implements: org.apache.commons.math3.exception.util.ExceptionContextProvider

Methods:
- String getLocalizedMessage()
- String getMessage()
- ExceptionContext getContext()

### Class: org.apache.commons.math3.exception.MaxCountExceededException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalStateException

Methods:
- Number getMax()

### Class: org.apache.commons.math3.exception.NoBracketingException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalArgumentException

Methods:
- double getLo()
- double getFHi()
- double getFLo()
- double getHi()

### Class: org.apache.commons.math3.exception.NoDataException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalArgumentException

No public methods found

### Class: org.apache.commons.math3.exception.NonMonotonicSequenceException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalNumberException

Methods:
- Number getPrevious()
- boolean getStrict()
- int getIndex()
- MathArrays$OrderDirection getDirection()

### Class: org.apache.commons.math3.exception.NotANumberException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalNumberException

No public methods found

### Class: org.apache.commons.math3.exception.NotFiniteNumberException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalNumberException

No public methods found

### Class: org.apache.commons.math3.exception.NotPositiveException
Type: Class
Extends: org.apache.commons.math3.exception.NumberIsTooSmallException

No public methods found

### Class: org.apache.commons.math3.exception.NotStrictlyPositiveException
Type: Class
Extends: org.apache.commons.math3.exception.NumberIsTooSmallException

No public methods found

### Class: org.apache.commons.math3.exception.NullArgumentException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalArgumentException

No public methods found

### Class: org.apache.commons.math3.exception.NumberIsTooLargeException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalNumberException

Methods:
- boolean getBoundIsAllowed()
- Number getMax()

### Class: org.apache.commons.math3.exception.NumberIsTooSmallException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalNumberException

Methods:
- boolean getBoundIsAllowed()
- Number getMin()

### Class: org.apache.commons.math3.exception.OutOfRangeException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalNumberException

Methods:
- Number getLo()
- Number getHi()

### Class: org.apache.commons.math3.exception.TooManyEvaluationsException
Type: Class
Extends: org.apache.commons.math3.exception.MaxCountExceededException

No public methods found

### Class: org.apache.commons.math3.exception.ZeroException
Type: Class
Extends: org.apache.commons.math3.exception.MathIllegalNumberException

No public methods found

## Package: org.apache.commons.math3.exception.util

### Class: org.apache.commons.math3.exception.util.ExceptionContextProvider
Type: Interface

Methods:
- ExceptionContext getContext()

### Class: org.apache.commons.math3.exception.util.Localizable
Type: Interface
Implements: java.io.Serializable

Methods:
- String getSourceString()
- String getLocalizedString(Locale)

### Class: org.apache.commons.math3.exception.util.ArgUtils
Type: Class

Methods:
- **static** Object[] flatten(Object[])

### Class: org.apache.commons.math3.exception.util.ExceptionContext
Type: Class
Implements: java.io.Serializable

Methods:
- Object getValue(String)
- String getLocalizedMessage()
- void setValue(String, Object)
- String getMessage()
- String getMessage(Locale)
- String getMessage(Locale, String)
- Set<String> getKeys()
- void addMessage(Localizable, Object[])
- Throwable getThrowable()

### Class: org.apache.commons.math3.exception.util.LocalizedFormats
Type: Enum
Extends: java.lang.Enum
Implements: org.apache.commons.math3.exception.util.Localizable

Enum Constants:
- ARGUMENT_OUTSIDE_DOMAIN
- ARRAY_SIZE_EXCEEDS_MAX_VARIABLES
- ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1
- ARRAY_SUMS_TO_ZERO
- ASSYMETRIC_EIGEN_NOT_SUPPORTED
- AT_LEAST_ONE_COLUMN
- AT_LEAST_ONE_ROW
- BANDWIDTH
- BESSEL_FUNCTION_BAD_ARGUMENT
- BESSEL_FUNCTION_FAILED_CONVERGENCE
- BINOMIAL_INVALID_PARAMETERS_ORDER
- BINOMIAL_NEGATIVE_PARAMETER
- CANNOT_CLEAR_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS
- CANNOT_COMPUTE_0TH_ROOT_OF_UNITY
- CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA
- CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA
- CANNOT_COMPUTE_NTH_ROOT_FOR_NEGATIVE_N
- CANNOT_DISCARD_NEGATIVE_NUMBER_OF_ELEMENTS
- CANNOT_FORMAT_INSTANCE_AS_3D_VECTOR
- CANNOT_FORMAT_INSTANCE_AS_COMPLEX
- CANNOT_FORMAT_INSTANCE_AS_REAL_VECTOR
- CANNOT_FORMAT_OBJECT_TO_FRACTION
- CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS
- CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR
- CANNOT_RETRIEVE_AT_NEGATIVE_INDEX
- CANNOT_SET_AT_NEGATIVE_INDEX
- CANNOT_SUBSTITUTE_ELEMENT_FROM_EMPTY_ARRAY
- CANNOT_TRANSFORM_TO_DOUBLE
- CARDAN_ANGLES_SINGULARITY
- CLASS_DOESNT_IMPLEMENT_COMPARABLE
- CLOSE_VERTICES
- CLOSEST_ORTHOGONAL_MATRIX_HAS_NEGATIVE_DETERMINANT
- COLUMN_INDEX_OUT_OF_RANGE
- COLUMN_INDEX
- CONSTRAINT
- CONTINUED_FRACTION_INFINITY_DIVERGENCE
- CONTINUED_FRACTION_NAN_DIVERGENCE
- CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR
- CONTRACTION_CRITERIA_SMALLER_THAN_ONE
- CONVERGENCE_FAILED
- CROSSING_BOUNDARY_LOOPS
- CROSSOVER_RATE
- CUMULATIVE_PROBABILITY_RETURNED_NAN
- DIFFERENT_ROWS_LENGTHS
- DIFFERENT_ORIG_AND_PERMUTED_DATA
- DIGEST_NOT_INITIALIZED
- DIMENSIONS_MISMATCH_2x2
- DIMENSIONS_MISMATCH_SIMPLE
- DIMENSIONS_MISMATCH
- DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN
- DISTRIBUTION_NOT_LOADED
- DUPLICATED_ABSCISSA_DIVISION_BY_ZERO
- EDGE_CONNECTED_TO_ONE_FACET
- ELITISM_RATE
- EMPTY_CLUSTER_IN_K_MEANS
- EMPTY_INTERPOLATION_SAMPLE
- EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY
- EMPTY_SELECTED_COLUMN_INDEX_ARRAY
- EMPTY_SELECTED_ROW_INDEX_ARRAY
- EMPTY_STRING_FOR_IMAGINARY_CHARACTER
- ENDPOINTS_NOT_AN_INTERVAL
- EQUAL_VERTICES_IN_SIMPLEX
- EULER_ANGLES_SINGULARITY
- EVALUATION
- EXPANSION_FACTOR_SMALLER_THAN_ONE
- FACET_ORIENTATION_MISMATCH
- FACTORIAL_NEGATIVE_PARAMETER
- FAILED_BRACKETING
- FAILED_FRACTION_CONVERSION
- FIRST_COLUMNS_NOT_INITIALIZED_YET
- FIRST_ELEMENT_NOT_ZERO
- FIRST_ROWS_NOT_INITIALIZED_YET
- FRACTION_CONVERSION_OVERFLOW
- FUNCTION_NOT_DIFFERENTIABLE
- FUNCTION_NOT_POLYNOMIAL
- GCD_OVERFLOW_32_BITS
- GCD_OVERFLOW_64_BITS
- HOLE_BETWEEN_MODELS_TIME_RANGES
- ILL_CONDITIONED_OPERATOR
- INCONSISTENT_STATE_AT_2_PI_WRAPPING
- INDEX_LARGER_THAN_MAX
- INDEX_NOT_POSITIVE
- INDEX_OUT_OF_RANGE
- INDEX
- NOT_FINITE_NUMBER
- INFINITE_BOUND
- ARRAY_ELEMENT
- INFINITE_ARRAY_ELEMENT
- INFINITE_VALUE_CONVERSION
- INITIAL_CAPACITY_NOT_POSITIVE
- INITIAL_COLUMN_AFTER_FINAL_COLUMN
- INITIAL_ROW_AFTER_FINAL_ROW
- INPUT_DATA_FROM_UNSUPPORTED_DATASOURCE
- INSTANCES_NOT_COMPARABLE_TO_EXISTING_VALUES
- INSUFFICIENT_DATA
- INSUFFICIENT_DATA_FOR_T_STATISTIC
- INSUFFICIENT_DIMENSION
- DIMENSION
- INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE
- INSUFFICIENT_ROWS_AND_COLUMNS
- INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS
- INTERNAL_ERROR
- INVALID_BINARY_DIGIT
- INVALID_BINARY_CHROMOSOME
- INVALID_BRACKETING_PARAMETERS
- INVALID_FIXED_LENGTH_CHROMOSOME
- INVALID_IMPLEMENTATION
- INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS
- INVALID_ITERATIONS_LIMITS
- INVALID_MAX_ITERATIONS
- NOT_ENOUGH_DATA_REGRESSION
- INVALID_REGRESSION_ARRAY
- INVALID_REGRESSION_OBSERVATION
- INVALID_ROUNDING_METHOD
- ITERATOR_EXHAUSTED
- ITERATIONS
- LCM_OVERFLOW_32_BITS
- LCM_OVERFLOW_64_BITS
- LIST_OF_CHROMOSOMES_BIGGER_THAN_POPULATION_SIZE
- LOESS_EXPECTS_AT_LEAST_ONE_POINT
- LOWER_BOUND_NOT_BELOW_UPPER_BOUND
- LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT
- MAP_MODIFIED_WHILE_ITERATING
- MULTISTEP_STARTER_STOPPED_EARLY
- EVALUATIONS
- MAX_COUNT_EXCEEDED
- MAX_ITERATIONS_EXCEEDED
- MINIMAL_STEPSIZE_REACHED_DURING_INTEGRATION
- MISMATCHED_LOESS_ABSCISSA_ORDINATE_ARRAYS
- MUTATION_RATE
- NAN_ELEMENT_AT_INDEX
- NAN_VALUE_CONVERSION
- NEGATIVE_BRIGHTNESS_EXPONENT
- NEGATIVE_COMPLEX_MODULE
- NEGATIVE_ELEMENT_AT_2D_INDEX
- NEGATIVE_ELEMENT_AT_INDEX
- NEGATIVE_NUMBER_OF_SUCCESSES
- NUMBER_OF_SUCCESSES
- NEGATIVE_NUMBER_OF_TRIALS
- NUMBER_OF_INTERPOLATION_POINTS
- NUMBER_OF_TRIALS
- NOT_CONVEX
- NOT_CONVEX_HYPERPLANES
- ROBUSTNESS_ITERATIONS
- START_POSITION
- NON_CONVERGENT_CONTINUED_FRACTION
- NON_INVERTIBLE_TRANSFORM
- NON_POSITIVE_MICROSPHERE_ELEMENTS
- NON_POSITIVE_POLYNOMIAL_DEGREE
- NON_REAL_FINITE_ABSCISSA
- NON_REAL_FINITE_ORDINATE
- NON_REAL_FINITE_WEIGHT
- NON_SQUARE_MATRIX
- NORM
- NORMALIZE_INFINITE
- NORMALIZE_NAN
- NOT_ADDITION_COMPATIBLE_MATRICES
- NOT_DECREASING_NUMBER_OF_POINTS
- NOT_DECREASING_SEQUENCE
- NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS
- NOT_ENOUGH_POINTS_IN_SPLINE_PARTITION
- NOT_INCREASING_NUMBER_OF_POINTS
- NOT_INCREASING_SEQUENCE
- NOT_MULTIPLICATION_COMPATIBLE_MATRICES
- NOT_POSITIVE_DEFINITE_MATRIX
- NON_POSITIVE_DEFINITE_MATRIX
- NON_POSITIVE_DEFINITE_OPERATOR
- NON_SELF_ADJOINT_OPERATOR
- NON_SQUARE_OPERATOR
- DEGREES_OF_FREEDOM
- NOT_POSITIVE_DEGREES_OF_FREEDOM
- NOT_POSITIVE_ELEMENT_AT_INDEX
- NOT_POSITIVE_EXPONENT
- NUMBER_OF_ELEMENTS_SHOULD_BE_POSITIVE
- BASE
- EXPONENT
- NOT_POSITIVE_LENGTH
- LENGTH
- NOT_POSITIVE_MEAN
- MEAN
- NOT_POSITIVE_NUMBER_OF_SAMPLES
- NUMBER_OF_SAMPLES
- NOT_POSITIVE_PERMUTATION
- PERMUTATION_SIZE
- NOT_POSITIVE_POISSON_MEAN
- NOT_POSITIVE_POPULATION_SIZE
- POPULATION_SIZE
- NOT_POSITIVE_ROW_DIMENSION
- NOT_POSITIVE_SAMPLE_SIZE
- NOT_POSITIVE_SCALE
- SCALE
- NOT_POSITIVE_SHAPE
- SHAPE
- NOT_POSITIVE_STANDARD_DEVIATION
- STANDARD_DEVIATION
- NOT_POSITIVE_UPPER_BOUND
- NOT_POSITIVE_WINDOW_SIZE
- NOT_POWER_OF_TWO
- NOT_POWER_OF_TWO_CONSIDER_PADDING
- NOT_POWER_OF_TWO_PLUS_ONE
- NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS
- NOT_STRICTLY_DECREASING_SEQUENCE
- NOT_STRICTLY_INCREASING_KNOT_VALUES
- NOT_STRICTLY_INCREASING_NUMBER_OF_POINTS
- NOT_STRICTLY_INCREASING_SEQUENCE
- NOT_SUBTRACTION_COMPATIBLE_MATRICES
- NOT_SUPPORTED_IN_DIMENSION_N
- NOT_SYMMETRIC_MATRIX
- NON_SYMMETRIC_MATRIX
- NO_BIN_SELECTED
- NO_CONVERGENCE_WITH_ANY_START_POINT
- NO_DATA
- NO_DEGREES_OF_FREEDOM
- NO_DENSITY_FOR_THIS_DISTRIBUTION
- NO_FEASIBLE_SOLUTION
- NO_OPTIMUM_COMPUTED_YET
- NO_REGRESSORS
- NO_RESULT_AVAILABLE
- NO_SUCH_MATRIX_ENTRY
- NAN_NOT_ALLOWED
- NULL_NOT_ALLOWED
- ARRAY_ZERO_LENGTH_OR_NULL_NOT_ALLOWED
- COVARIANCE_MATRIX
- DENOMINATOR
- DENOMINATOR_FORMAT
- FRACTION
- FUNCTION
- IMAGINARY_FORMAT
- INPUT_ARRAY
- NUMERATOR
- NUMERATOR_FORMAT
- OBJECT_TRANSFORMATION
- REAL_FORMAT
- WHOLE_FORMAT
- NUMBER_TOO_LARGE
- NUMBER_TOO_SMALL
- NUMBER_TOO_LARGE_BOUND_EXCLUDED
- NUMBER_TOO_SMALL_BOUND_EXCLUDED
- NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE
- NUMERATOR_OVERFLOW_AFTER_MULTIPLY
- N_POINTS_GAUSS_LEGENDRE_INTEGRATOR_NOT_SUPPORTED
- OBSERVED_COUNTS_ALL_ZERO
- OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY
- BOBYQA_BOUND_DIFFERENCE_CONDITION
- OUT_OF_BOUNDS_QUANTILE_VALUE
- OUT_OF_BOUNDS_CONFIDENCE_LEVEL
- OUT_OF_BOUND_SIGNIFICANCE_LEVEL
- SIGNIFICANCE_LEVEL
- OUT_OF_ORDER_ABSCISSA_ARRAY
- OUT_OF_PLANE
- OUT_OF_RANGE_ROOT_OF_UNITY_INDEX
- OUT_OF_RANGE
- OUT_OF_RANGE_SIMPLE
- OUT_OF_RANGE_LEFT
- OUT_OF_RANGE_RIGHT
- OUTLINE_BOUNDARY_LOOP_OPEN
- OVERFLOW
- OVERFLOW_IN_FRACTION
- OVERFLOW_IN_ADDITION
- OVERFLOW_IN_SUBTRACTION
- OVERFLOW_IN_MULTIPLICATION
- PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD
- PERCENTILE_IMPLEMENTATION_UNSUPPORTED_METHOD
- PERMUTATION_EXCEEDS_N
- POLYNOMIAL
- POLYNOMIAL_INTERPOLANTS_MISMATCH_SEGMENTS
- POPULATION_LIMIT_NOT_POSITIVE
- POWER_NEGATIVE_PARAMETERS
- PROPAGATION_DIRECTION_MISMATCH
- RANDOMKEY_MUTATION_WRONG_CLASS
- ROOTS_OF_UNITY_NOT_COMPUTED_YET
- ROTATION_MATRIX_DIMENSIONS
- ROW_INDEX_OUT_OF_RANGE
- ROW_INDEX
- SAME_SIGN_AT_ENDPOINTS
- SAMPLE_SIZE_EXCEEDS_COLLECTION_SIZE
- SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE
- SIMPLEX_NEED_ONE_POINT
- SIMPLE_MESSAGE
- SINGULAR_MATRIX
- SINGULAR_OPERATOR
- SUBARRAY_ENDS_AFTER_ARRAY_END
- TOO_LARGE_CUTOFF_SINGULAR_VALUE
- TOO_LARGE_TOURNAMENT_ARITY
- TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY
- TOO_MANY_REGRESSORS
- TOO_SMALL_COST_RELATIVE_TOLERANCE
- TOO_SMALL_INTEGRATION_INTERVAL
- TOO_SMALL_ORTHOGONALITY_TOLERANCE
- TOO_SMALL_PARAMETERS_RELATIVE_TOLERANCE
- TRUST_REGION_STEP_FAILED
- TWO_OR_MORE_CATEGORIES_REQUIRED
- TWO_OR_MORE_VALUES_IN_CATEGORY_REQUIRED
- UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH
- UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM
- UNABLE_TO_FIRST_GUESS_HARMONIC_COEFFICIENTS
- UNABLE_TO_ORTHOGONOLIZE_MATRIX
- UNABLE_TO_PERFORM_QR_DECOMPOSITION_ON_JACOBIAN
- UNABLE_TO_SOLVE_SINGULAR_PROBLEM
- UNBOUNDED_SOLUTION
- UNKNOWN_MODE
- UNKNOWN_PARAMETER
- UNMATCHED_ODE_IN_EXPANDED_SET
- CANNOT_PARSE_AS_TYPE
- CANNOT_PARSE
- UNPARSEABLE_3D_VECTOR
- UNPARSEABLE_COMPLEX_NUMBER
- UNPARSEABLE_REAL_VECTOR
- UNSUPPORTED_EXPANSION_MODE
- UNSUPPORTED_OPERATION
- ARITHMETIC_EXCEPTION
- ILLEGAL_STATE
- USER_EXCEPTION
- URL_CONTAINS_NO_DATA
- VALUES_ADDED_BEFORE_CONFIGURING_STATISTIC
- VECTOR_LENGTH_MISMATCH
- VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT
- WEIGHT_AT_LEAST_ONE_NON_ZERO
- WRONG_BLOCK_LENGTH
- WRONG_NUMBER_OF_POINTS
- NUMBER_OF_POINTS
- ZERO_DENOMINATOR
- ZERO_DENOMINATOR_IN_FRACTION
- ZERO_FRACTION_TO_DIVIDE_BY
- ZERO_NORM
- ZERO_NORM_FOR_ROTATION_AXIS
- ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR
- ZERO_NOT_ALLOWED

Methods:
- String getSourceString()
- String getLocalizedString(Locale)
- **static** LocalizedFormats valueOf(String)
- **static** LocalizedFormats[] values()

## Package: org.apache.commons.math3.random

### Class: org.apache.commons.math3.random.RandomData
Type: Interface

Methods:
- long nextPoisson(double) throws NotStrictlyPositiveException
- double nextExponential(double) throws NotStrictlyPositiveException
- String nextHexString(int) throws NotStrictlyPositiveException
- int[] nextPermutation(int, int) throws NumberIsTooLargeException, NotStrictlyPositiveException
- Object nextSample(Collection<*>, int) throws NumberIsTooLargeException, NotStrictlyPositiveException
- double nextUniform(double, double) throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException
- double nextUniform(double, double, boolean) throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException
- String nextSecureHexString(int) throws NotStrictlyPositiveException
- long nextSecureLong(long, long) throws NumberIsTooLargeException
- int nextInt(int, int) throws NumberIsTooLargeException
- long nextLong(long, long) throws NumberIsTooLargeException
- double nextGaussian(double, double) throws NotStrictlyPositiveException
- int nextSecureInt(int, int) throws NumberIsTooLargeException

### Class: org.apache.commons.math3.random.RandomGenerator
Type: Interface

Methods:
- float nextFloat()
- boolean nextBoolean()
- int nextInt()
- int nextInt(int)
- long nextLong()
- void setSeed(int)
- void setSeed(int[])
- void setSeed(long)
- double nextGaussian()
- double nextDouble()
- void nextBytes(byte[])

### Class: org.apache.commons.math3.random.AbstractWell
Type: Abstract Class
Extends: org.apache.commons.math3.random.BitsStreamGenerator
Implements: java.io.Serializable

Methods:
- void setSeed(int)
- void setSeed(int[])
- void setSeed(long)

### Class: org.apache.commons.math3.random.BitsStreamGenerator
Type: Abstract Class
Implements: org.apache.commons.math3.random.RandomGenerator, java.io.Serializable

Methods:
- float nextFloat()
- void clear()
- int nextInt()
- int nextInt(int)
- boolean nextBoolean()
- long nextLong()
- long nextLong(long)
- void setSeed(int)
- void setSeed(int[])
- void setSeed(long)
- double nextGaussian()
- double nextDouble()
- void nextBytes(byte[])
- void nextBytes(byte[], int, int)

### Class: org.apache.commons.math3.random.RandomDataGenerator
Type: Class
Implements: org.apache.commons.math3.random.RandomData, java.io.Serializable

Methods:
- double nextCauchy(double, double)
- int nextPascal(int, double)
- String nextHexString(int)
- int nextHypergeometric(int, int, int)
- double nextGamma(double, double)
- double nextF(double, double)
- int nextSecureInt(int, int)
- void reSeedSecure()
- void reSeedSecure(long)
- int nextZipf(int, double)
- double nextWeibull(double, double)
- RandomGenerator getRandomGenerator()
- long nextSecureLong(long, long)
- int nextBinomial(int, double)
- double nextBeta(double, double)
- long nextPoisson(double)
- int[] nextPermutation(int, int)
- Object nextSample(Collection<*>, int)
- String nextSecureHexString(int)
- int nextInt(int, int)
- long nextLong(long, long)
- double nextChiSquare(double)
- double nextGaussian(double, double)
- void setSecureAlgorithm(String, String)
- double nextExponential(double)
- double nextUniform(double, double)
- double nextUniform(double, double, boolean)
- void reSeed(long)
- void reSeed()
- double nextT(double)

### Class: org.apache.commons.math3.random.RandomDataImpl
Type: Class
Implements: org.apache.commons.math3.random.RandomData, java.io.Serializable

Methods:
- double nextCauchy(double, double)
- int nextPascal(int, double)
- String nextHexString(int)
- int nextHypergeometric(int, int, int)
- double nextGamma(double, double)
- double nextF(double, double)
- int nextSecureInt(int, int)
- void reSeedSecure()
- void reSeedSecure(long)
- int nextZipf(int, double)
- double nextWeibull(double, double)
- long nextSecureLong(long, long)
- int nextBinomial(int, double)
- double nextBeta(double, double)
- double nextInversionDeviate(RealDistribution)
- int nextInversionDeviate(IntegerDistribution)
- long nextPoisson(double)
- int[] nextPermutation(int, int)
- Object nextSample(Collection<*>, int)
- String nextSecureHexString(int)
- int nextInt(int, int)
- long nextLong(long, long)
- double nextChiSquare(double)
- double nextGaussian(double, double)
- void setSecureAlgorithm(String, String)
- double nextExponential(double)
- double nextUniform(double, double)
- double nextUniform(double, double, boolean)
- void reSeed(long)
- void reSeed()
- double nextT(double)

### Class: org.apache.commons.math3.random.RandomGeneratorFactory
Type: Class

Methods:
- **static** long convertToLong(int[])
- **static** RandomGenerator createRandomGenerator(Random)

### Class: org.apache.commons.math3.random.Well19937c
Type: Class
Extends: org.apache.commons.math3.random.AbstractWell

No public methods found

## Package: org.apache.commons.math3.special

### Class: org.apache.commons.math3.special.Beta
Type: Class

Methods:
- **static** double logBeta(double, double, double, int)
- **static** double logBeta(double, double)
- **static** double regularizedBeta(double, double, double)
- **static** double regularizedBeta(double, double, double, double)
- **static** double regularizedBeta(double, double, double, int)
- **static** double regularizedBeta(double, double, double, double, int)

### Class: org.apache.commons.math3.special.Erf
Type: Class

Methods:
- **static** double erfc(double)
- **static** double erfInv(double)
- **static** double erf(double)
- **static** double erf(double, double)
- **static** double erfcInv(double)

### Class: org.apache.commons.math3.special.Gamma
Type: Class

Methods:
- **static** double lanczos(double)
- **static** double logGamma1p(double)
- **static** double invGamma1pm1(double)
- **static** double digamma(double)
- **static** double trigamma(double)
- **static** double regularizedGammaP(double, double)
- **static** double regularizedGammaP(double, double, double, int)
- **static** double gamma(double)
- **static** double regularizedGammaQ(double, double)
- **static** double regularizedGammaQ(double, double, double, int)
- **static** double logGamma(double)

## Package: org.apache.commons.math3.util

### Class: org.apache.commons.math3.util.DoubleArray
Type: Interface

Methods:
- double addElementRolling(double)
- void addElements(double[])
- double getElement(int)
- double[] getElements()
- void clear()
- void addElement(double)
- void setElement(int, double)
- int getNumElements()

### Class: org.apache.commons.math3.util.IntegerSequence$Incrementor$MaxCountExceededCallback
Type: Interface

Methods:
- void trigger(int) throws MaxCountExceededException

### Class: org.apache.commons.math3.util.MathArrays$Function
Type: Interface

Methods:
- double evaluate(double[])
- double evaluate(double[], int, int)

### Class: org.apache.commons.math3.util.ArithmeticUtils
Type: Class

Methods:
- **static** int addAndCheck(int, int)
- **static** long addAndCheck(long, long)
- **static** double binomialCoefficientLog(int, int)
- **static** long factorial(int)
- **static** double factorialLog(int)
- **static** double factorialDouble(int)
- **static** int gcd(int, int)
- **static** long gcd(long, long)
- **static** double binomialCoefficientDouble(int, int)
- **static** int subAndCheck(int, int)
- **static** long subAndCheck(long, long)
- **static** boolean isPowerOfTwo(long)
- **static** long stirlingS2(int, int)
- **static** int lcm(int, int)
- **static** long lcm(long, long)
- **static** long binomialCoefficient(int, int)
- **static** int pow(int, int)
- **static** int pow(int, long)
- **static** long pow(long, int)
- **static** long pow(long, long)
- **static** BigInteger pow(BigInteger, int)
- **static** BigInteger pow(BigInteger, long)
- **static** BigInteger pow(BigInteger, BigInteger)
- **static** int mulAndCheck(int, int)
- **static** long mulAndCheck(long, long)

### Class: org.apache.commons.math3.util.Combinations
Type: Class
Implements: java.lang.Iterable

Methods:
- Comparator<[I> comparator()
- Iterator<[I> iterator()
- int getK()
- int getN()

### Class: org.apache.commons.math3.util.CombinatoricsUtils
Type: Class

Methods:
- **static** double binomialCoefficientLog(int, int)
- **static** void checkBinomial(int, int)
- **static** Iterator<[I> combinationsIterator(int, int)
- **static** long stirlingS2(int, int)
- **static** long factorial(int)
- **static** double factorialLog(int)
- **static** double factorialDouble(int)
- **static** long binomialCoefficient(int, int)
- **static** double binomialCoefficientDouble(int, int)

### Class: org.apache.commons.math3.util.ContinuedFraction
Type: Abstract Class

Methods:
- double evaluate(double)
- double evaluate(double, double)
- double evaluate(double, int)
- double evaluate(double, double, int)

### Class: org.apache.commons.math3.util.FastMath
Type: Class

Methods:
- **static** double copySign(double, double)
- **static** float copySign(float, float)
- **static** double cos(double)
- **static** double log1p(double)
- **static** double expm1(double)
- **static** double rint(double)
- **static** void main(String[])
- **static** double atan(double)
- **static** double nextUp(double)
- **static** float nextUp(float)
- **static** double sqrt(double)
- **static** int decrementExact(int)
- **static** long decrementExact(long)
- **static** double exp(double)
- **static** double atan2(double, double)
- **static** double tan(double)
- **static** double signum(double)
- **static** float signum(float)
- **static** double sinh(double)
- **static** double acosh(double)
- **static** double toDegrees(double)
- **static** double ceil(double)
- **static** double acos(double)
- **static** int getExponent(double)
- **static** int getExponent(float)
- **static** int addExact(int, int)
- **static** long addExact(long, long)
- **static** double ulp(double)
- **static** float ulp(float)
- **static** double scalb(double, int)
- **static** float scalb(float, int)
- **static** int floorMod(int, int)
- **static** long floorMod(long, long)
- **static** double log(double)
- **static** double log(double, double)
- **static** double atanh(double)
- **static** double log10(double)
- **static** double nextAfter(double, double)
- **static** float nextAfter(float, double)
- **static** int multiplyExact(int, int)
- **static** long multiplyExact(long, long)
- **static** double cbrt(double)
- **static** double random()
- **static** double tanh(double)
- **static** int min(int, int)
- **static** long min(long, long)
- **static** float min(float, float)
- **static** double min(double, double)
- **static** double hypot(double, double)
- **static** double sin(double)
- **static** double pow(double, double)
- **static** double pow(double, int)
- **static** double pow(double, long)
- **static** double floor(double)
- **static** int subtractExact(int, int)
- **static** long subtractExact(long, long)
- **static** int max(int, int)
- **static** long max(long, long)
- **static** float max(float, float)
- **static** double max(double, double)
- **static** int toIntExact(long)
- **static** double nextDown(double)
- **static** float nextDown(float)
- **static** double toRadians(double)
- **static** double IEEEremainder(double, double)
- **static** double cosh(double)
- **static** int abs(int)
- **static** long abs(long)
- **static** float abs(float)
- **static** double abs(double)
- **static** long round(double)
- **static** int round(float)
- **static** int floorDiv(int, int)
- **static** long floorDiv(long, long)
- **static** int incrementExact(int)
- **static** long incrementExact(long)
- **static** double asin(double)
- **static** double asinh(double)

### Class: org.apache.commons.math3.util.IntegerSequence
Type: Class

Methods:
- **static** IntegerSequence$Range range(int, int)
- **static** IntegerSequence$Range range(int, int, int)

### Class: org.apache.commons.math3.util.IntegerSequence$Incrementor
Type: Class
Implements: java.util.Iterator

Methods:
- Integer next()
- Object next()
- IntegerSequence$Incrementor withStart(int)
- IntegerSequence$Incrementor withCallback(IntegerSequence$Incrementor$MaxCountExceededCallback)
- void increment(int)
- void increment()
- **static** IntegerSequence$Incrementor create()
- boolean hasNext()
- int getMaximalCount()
- IntegerSequence$Incrementor withMaximalCount(int)
- int getCount()
- IntegerSequence$Incrementor withIncrement(int)
- void remove()
- boolean canIncrement()
- boolean canIncrement(int)

### Class: org.apache.commons.math3.util.IntegerSequence$Range
Type: Class
Implements: java.lang.Iterable

Methods:
- Iterator<Integer> iterator()
- int size()

### Class: org.apache.commons.math3.util.MathArrays
Type: Class

Methods:
- **static** double[] copyOfRange(double[], int, int)
- **static** double[] concatenate(double[][])
- **static** double distance(double[], double[])
- **static** double distance(int[], int[])
- **static** [TT buildArray(Field<TT>, int)
- **static** [[TT buildArray(Field<TT>, int, int)
- **static** void scaleInPlace(double, double[])
- **static** double[] ebeMultiply(double[], double[])
- **static** double[] scale(double, double[])
- **static** boolean verifyValues(double[], int, int)
- **static** boolean verifyValues(double[], int, int, boolean)
- **static** boolean verifyValues(double[], double[], int, int)
- **static** boolean verifyValues(double[], double[], int, int, boolean)
- **static** double[] normalizeArray(double[], double)
- **static** boolean equalsIncludingNaN(float[], float[])
- **static** boolean equalsIncludingNaN(double[], double[])
- **static** double safeNorm(double[])
- **static** double[] convolve(double[], double[])
- **static** void checkRectangular(long[][])
- **static** Z isMonotonic([T, T, ;)
- **static** boolean isMonotonic(double[], MathArrays$OrderDirection, boolean)
- **static** double[] ebeDivide(double[], double[])
- **static** void checkNotNaN(double[])
- **static** void checkNonNegative(long[])
- **static** void checkNonNegative(long[][])
- **static** void checkPositive(double[])
- **static** boolean checkOrder(double[], MathArrays$OrderDirection, boolean, boolean)
- **static** void checkOrder(double[], MathArrays$OrderDirection, boolean)
- **static** void checkOrder(double[])
- **static** double cosAngle(double[], double[])
- **static** double distanceInf(double[], double[])
- **static** int distanceInf(int[], int[])
- **static** double distance1(double[], double[])
- **static** int distance1(int[], int[])
- **static** int[] natural(int)
- **static** boolean checkEqualLength(double[], double[], boolean)
- **static** void checkEqualLength(double[], double[])
- **static** boolean checkEqualLength(int[], int[], boolean)
- **static** void checkEqualLength(int[], int[])
- **static** double linearCombination(double[], double[])
- **static** double linearCombination(double, double, double, double)
- **static** double linearCombination(double, double, double, double, double, double)
- **static** double linearCombination(double, double, double, double, double, double, double, double)
- **static** int[] copyOf(int[])
- **static** double[] copyOf(double[])
- **static** int[] copyOf(int[], int)
- **static** double[] copyOf(double[], int)
- **static** void sortInPlace(double[], double[][])
- **static** void sortInPlace(double[], MathArrays$OrderDirection, double[][])
- **static** int[] sequence(int, int, int)
- **static** double[] ebeAdd(double[], double[])
- **static** double[] unique(double[])
- **static** boolean equals(float[], float[])
- **static** boolean equals(double[], double[])
- **static** double[] ebeSubtract(double[], double[])
- **static** void shuffle(int[], int, MathArrays$Position)
- **static** void shuffle(int[], int, MathArrays$Position, RandomGenerator)
- **static** void shuffle(int[], RandomGenerator)
- **static** void shuffle(int[])

### Class: org.apache.commons.math3.util.MathArrays$OrderDirection
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- INCREASING
- DECREASING

Methods:
- **static** MathArrays$OrderDirection valueOf(String)
- **static** MathArrays$OrderDirection[] values()

### Class: org.apache.commons.math3.util.MathArrays$Position
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- HEAD
- TAIL

Methods:
- **static** MathArrays$Position valueOf(String)
- **static** MathArrays$Position[] values()

### Class: org.apache.commons.math3.util.MathUtils
Type: Class

Methods:
- **static** double reduce(double, double, double)
- **static** void checkNotNull(Object, Localizable, Object[])
- **static** void checkNotNull(Object)
- **static** void checkFinite(double)
- **static** void checkFinite(double[])
- **static** TT min(T, T)
- **static** byte copySign(byte, byte)
- **static** short copySign(short, short)
- **static** int copySign(int, int)
- **static** long copySign(long, long)
- **static** TT max(T, T)
- **static** boolean equals(double, double)
- **static** double normalizeAngle(double, double)
- **static** int hash(double)
- **static** int hash(double[])

### Class: org.apache.commons.math3.util.Precision
Type: Class

Methods:
- **static** boolean equalsWithRelativeTolerance(double, double, double)
- **static** double round(double, int)
- **static** double round(double, int, int)
- **static** float round(float, int)
- **static** float round(float, int, int)
- **static** boolean equals(float, float)
- **static** boolean equals(float, float, float)
- **static** boolean equals(float, float, int)
- **static** boolean equals(double, double)
- **static** boolean equals(double, double, double)
- **static** boolean equals(double, double, int)
- **static** int compareTo(double, double, double)
- **static** int compareTo(double, double, int)
- **static** double representableDelta(double, double)
- **static** boolean equalsIncludingNaN(float, float)
- **static** boolean equalsIncludingNaN(float, float, float)
- **static** boolean equalsIncludingNaN(float, float, int)
- **static** boolean equalsIncludingNaN(double, double)
- **static** boolean equalsIncludingNaN(double, double, double)
- **static** boolean equalsIncludingNaN(double, double, int)

### Class: org.apache.commons.math3.util.ResizableDoubleArray
Type: Class
Implements: org.apache.commons.math3.util.DoubleArray, java.io.Serializable

Methods:
- int getNumElements()
- double getContractionCriterion()
- double compute(MathArrays$Function)
- float getExpansionFactor()
- double substituteMostRecentElement(double)
- void setExpansionFactor(float)
- void setNumElements(int)
- int hashCode()
- void addElements(double[])
- double[] getInternalValues()
- **static** void copy(ResizableDoubleArray, ResizableDoubleArray)
- ResizableDoubleArray copy()
- void setElement(int, double)
- int getExpansionMode()
- double addElementRolling(double)
- void contract()
- int start()
- void clear()
- void setExpansionMode(int)
- void setExpansionMode(ResizableDoubleArray$ExpansionMode)
- void setContractionCriteria(float)
- float getContractionCriteria()
- void discardMostRecentElements(int)
- double getElement(int)
- boolean equals(Object)
- double[] getElements()
- void discardFrontElements(int)
- void addElement(double)
- int getCapacity()

### Class: org.apache.commons.math3.util.ResizableDoubleArray$ExpansionMode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- MULTIPLICATIVE
- ADDITIVE

Methods:
- **static** ResizableDoubleArray$ExpansionMode valueOf(String)
- **static** ResizableDoubleArray$ExpansionMode[] values()

