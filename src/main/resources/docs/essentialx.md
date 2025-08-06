# EssentialsX-2.21.1 API Reference

## Package: com.earth2me.essentials

### Class: com.earth2me.essentials.FakeAccessor
Type: Interface

Methods:
- void getUser(Player)
- void onPlayerJoin(PlayerJoinEvent)

### Class: com.earth2me.essentials.IConf
Type: Interface

Methods:
- void reloadConfig()

### Class: com.earth2me.essentials.IEssentials
Type: Interface
Implements: org.bukkit.plugin.Plugin

Methods:
- Collection getOnlinePlayers()
- UpdateChecker getUpdateChecker()
- IJails getJails()
- World getWorld(String)
- PluginCommand getPluginCommand(String)
- ISettings getSettings()
- Worth getWorth()
- User getUser(Object)
- User getUser(UUID)
- User getUser(String)
- User getUser(Player)
- BukkitTask runTaskTimerAsynchronously(Runnable, long, long)
- Iterable getOnlineUsers()
- List getVanishedPlayers()
- boolean onCommandEssentials(CommandSender, Command, String, String[], ClassLoader, String, String, IEssentialsModule)
- BalanceTop getBalanceTop()
- Kits getKits()
- void reload()
- Provider provider(Class)
- void showError(CommandSource, Throwable, String)
- IUserMap getUsers()
- BukkitTask runTaskLaterAsynchronously(Runnable, long)
- BukkitTask runTaskAsynchronously(Runnable)
- UserMap getUserMap()
- BukkitScheduler getScheduler()
- AlternativeCommandsHandler getAlternativeCommandsHandler()
- void addReloadListener(IConf)
- ProviderFactory getProviders()
- int broadcastMessage(String)
- int broadcastMessage(IUser, String)
- int broadcastMessage(IUser, String, Predicate)
- int broadcastMessage(String, String)
- User matchUser(Server, User, String, Boolean, boolean) throws PlayerNotFoundException
- int scheduleSyncRepeatingTask(Runnable, long, long)
- RandomTeleport getRandomTeleport()
- I18n getI18n()
- IWarps getWarps()
- boolean canInteractWith(CommandSource, User)
- boolean canInteractWith(User, User)
- MailService getMail()
- Backup getBackup()
- IItemDb getItemDb()
- PermissionsHandler getPermissionsHandler()
- void broadcastTl(String, Object[])
- void broadcastTl(IUser, String, Object[])
- void broadcastTl(IUser, String, String, Object[])
- void broadcastTl(IUser, Predicate, String, Object[])
- void broadcastTl(IUser, Predicate, boolean, String, Object[])
- int scheduleSyncDelayedTask(Runnable)
- int scheduleSyncDelayedTask(Runnable, long)
- User getOfflineUser(String)
- List onTabCompleteEssentials(CommandSender, Command, String, String[], ClassLoader, String, String, IEssentialsModule)
- Map getCommandMap()
- EssentialsTimer getTimer()

### Class: com.earth2me.essentials.IEssentialsModule
Type: Interface

No public methods found

### Class: com.earth2me.essentials.ISettings
Type: Interface
Implements: com.earth2me.essentials.IConf

Methods:
- boolean removeGodOnDisconnect()
- boolean isChatQuestionEnabled()
- String getCurrencySymbol()
- Tag getPrimaryColor()
- Tag getSecondaryColor()
- boolean isCommandOverridden(String)
- boolean getDisableItemPickupWhileAfk()
- boolean isWorldTimePermissions()
- int getDefaultStackSize()
- int getMaxNickLength()
- File getConfigFile()
- BigDecimal getMultiplier(User)
- BigDecimal getMaxMoney()
- boolean allowOldIdSigns()
- boolean isForcePassengerTeleport()
- boolean permissionBasedItemSpawn()
- boolean isPlayerCommand(String)
- boolean isWorldChangeFlyResetEnabled()
- boolean isKitAutoEquip()
- boolean isPersistShout()
- boolean infoAfterDeath()
- String getWorldAlias(String)
- boolean broadcastAfkMessage()
- BigDecimal getCommandCost(IEssentialsCommand)
- BigDecimal getCommandCost(String)
- long getBaltopMinPlaytime()
- List getUnprotectedSignNames()
- boolean isWaterSafe()
- int getMotdDelay()
- boolean isReplyToVanished()
- boolean isCustomQuitMessage()
- boolean isWorldChangeSpeedResetEnabled()
- boolean isUsePaperChatEvent()
- BigDecimal getMinMoney()
- int getTpaMaxRequests()
- List getProtectList(String)
- boolean isMilkBucketEasterEggEnabled()
- boolean warnOnBuildDisallow()
- long getBackupInterval()
- long getAutoAfkKick()
- boolean useBukkitPermissions()
- String getOperatorColor() throws Exception
- Set getMuteCommands()
- boolean isSocialSpyMessages()
- long getLoginAttackDelay()
- int getMailsPerMinute()
- String getCustomJoinMessage()
- long getMaxUserCacheValueExpiry()
- boolean isUpdateCheckEnabled()
- void setEssentialsChatActive(boolean)
- boolean isAlwaysTeleportSafety()
- String getAfkListName()
- Set getNoGodWorlds()
- boolean isTeleportToCenterLocation()
- String getNicknamePrefix()
- ISettings$TeleportWhenFreePolicy getTeleportWhenFreePolicy()
- boolean areDeathMessagesEnabled()
- boolean isNpcsInBalanceRanking()
- boolean showZeroBaltop()
- int getChatRadius()
- boolean isTradeInStacks(int)
- boolean isTradeInStacks(Material)
- boolean getRepairEnchanted()
- CommentedConfigurationNode getKitSection()
- long getCommandCooldownMs(String)
- boolean isCommandCooldownPersistent(String)
- boolean isSkippingUsedOneTimeKitsFromKitList()
- Set getDisabledCommands()
- boolean isUserInSpawnOnJoinGroup(IUser)
- boolean hasJoinQuitMessagePlayerCount()
- int getNotifyPlayerOfMailCooldown()
- boolean isJailOnlineTime()
- double getHealCooldown()
- boolean isConfirmHomeOverwrite()
- int getMaxUserCacheCount()
- BigDecimal getStartingBalance()
- boolean isWorldHomePermissions()
- long getMaxTempban()
- Set getSocialSpyCommands()
- int getOversizedStackSize()
- List itemSpawnBlacklist()
- Map$Entry getCommandCooldownEntry(String)
- boolean changePlayerListName()
- boolean isAllowBulkBuySell()
- boolean getFreezeAfkPlayers()
- boolean getAnnounceNewPlayers()
- ISettings$KeepInvPolicy getVanishingItemsPolicy()
- boolean addPrefixSuffix()
- boolean getPerWarpPermission()
- long getTpaAcceptCancellation()
- Set getNickBlacklist()
- Set getMultipleHomes()
- boolean getRespawnAtHome()
- boolean isCurrencySymbolSuffixed()
- boolean isEcoLogUpdateEnabled()
- char getChatShout()
- boolean isRespawnAtBed()
- boolean isCustomNewUsernameMessage()
- boolean isEcoLogEnabled()
- boolean isRespawnAtAnchor()
- double getMaxFlySpeed()
- boolean registerBackInListener()
- List getDefaultEnabledConfirmCommands()
- double getMaxProjectileSpeed()
- List getProtectListRaw(String)
- boolean isPastebinCreateKit()
- String getLocale()
- boolean isCommandCooldownsEnabled()
- boolean getSocialSpyListenMutedPlayers()
- boolean disablePrefix()
- boolean isLastMessageReplyRecipient()
- long getPermissionsLagWarning()
- boolean allowSilentJoinQuit()
- boolean isAllowSellNamedItems()
- boolean isWorldChangePreserveFlying()
- List enabledSigns()
- boolean isAllowWorldInBroadcastworld()
- boolean showNonEssCommandsInHelp()
- boolean cancelAfkOnMove()
- char getChatQuestion()
- String getItemDbType()
- boolean warnOnSmite()
- EventPriority getSpawnJoinPriority()
- boolean isSpawnIfNoHome()
- boolean isSpawnOnJoin()
- boolean cancelAfkOnInteract()
- double getTeleportDelay()
- String getNewbieSpawn()
- int getProtectCreeperMaxHeight()
- boolean isCustomServerFullMessage()
- BigDecimal getBaltopMinBalance()
- boolean logCommandBlockCommands()
- BigDecimal getMinimumPayAmount()
- boolean getProtectPreventSpawn(String)
- boolean hideDisplayNameInVanish()
- boolean isAfkListName()
- int getSignUsePerSecond()
- boolean isSocialSpyDisplayNames()
- long getLastMessageReplyRecipientTimeout()
- boolean isNotifyNoNewMail()
- int getJoinQuitMessagePlayerCount()
- boolean changeTabCompleteName()
- boolean changeDisplayName()
- boolean isSendFlyEnableOnJoin()
- NumberFormat getCurrencyFormat()
- boolean getProtectBoolean(String, boolean)
- boolean isWorldTeleportPermissions()
- String getRandomSpawnLocation()
- String getCustomNewUsernameMessage()
- String getNewPlayerKit()
- boolean cancelAfkOnChat()
- String getNickRegex()
- boolean isCommandDisabled(IEssentialsCommand)
- boolean isCommandDisabled(String)
- EventPriority getRespawnPriority()
- boolean isAddingPrefixInPlayerlist()
- boolean isUseBetterKits()
- long getMaxMute()
- List getSpawnOnJoinGroups()
- boolean sleepIgnoresAfkPlayers()
- double getTeleportCooldown()
- boolean isDirectHatAllowed()
- boolean isCompassTowardsHomePerm()
- boolean isVerboseCommandUsages()
- boolean hidePermissionlessHelp()
- boolean ignoreColorsInMaxLength()
- IText getAnnounceNewPlayerFormat()
- boolean isPayExcludesIgnoreList()
- boolean realNamesOnList()
- int getMaxTreeCommandRange()
- boolean isCustomJoinMessage()
- Map getListGroupConfig()
- boolean isShoutDefault()
- String getChatFormat(String)
- String getChatFormat(String, ChatType)
- boolean disableSuffix()
- boolean getUpdateBedAtDaytime()
- boolean sleepIgnoresVanishedPlayers()
- boolean isTeleportPassengerDismount()
- boolean isConfirmCommandEnabledByDefault(String)
- long getAutoAfk()
- boolean isSafeUsermap()
- boolean isForceDisableTeleportSafety()
- int getNearRadius()
- double getMaxWalkSpeed()
- long getTeleportInvulnerability()
- void setDebug(boolean)
- String getRandomRespawnLocation()
- boolean isDebug()
- int getSpawnMobLimit()
- boolean isDropItemsIfFull()
- int getMaxItemLore()
- String getBackupCommand()
- ISettings$KeepInvPolicy getBindingItemsPolicy()
- boolean areSignsDisabled()
- boolean isTeleportSafetyEnabled()
- boolean isEcoDisabled()
- long getEconomyLagWarning()
- boolean isTeleportInvulnerability()
- String getProtectString(String)
- String getCustomQuitMessage()
- boolean isRemovingEffectsOnHeal()
- boolean isPerPlayerLocale()
- boolean allowUnsafeEnchantments()
- int getHomeLimit(String)
- int getHomeLimit(User)
- boolean isAlwaysRunBackup()
- boolean isAddingSuffixInPlayerlist()

### Class: com.earth2me.essentials.ITarget
Type: Interface

Methods:
- Location getLocation()

### Class: com.earth2me.essentials.IUser
Type: Interface

Methods:
- Set getConfigKeys()
- boolean isLastMessageReplyRecipient()
- void payUser(User, BigDecimal) throws Exception
- String getName()
- boolean isPromptingClearConfirm()
- long getTeleportRequestTime()
- void setMailList(ArrayList)
- void sendMail(MailSender, String)
- void sendMail(MailSender, String, long)
- boolean hasOutstandingTeleportRequest()
- Location getLogoutLocation()
- void setVanished(boolean)
- String getJail()
- Map getCommandCooldowns()
- ArrayList getMailMessages()
- boolean isLeavingHidden()
- void setLastLocation()
- boolean isAuthorized(String)
- boolean isAuthorized(IEssentialsCommand)
- boolean isAuthorized(IEssentialsCommand, String)
- UUID getUUID()
- void setHidden(boolean)
- void healCooldown() throws Exception
- boolean isToggleShout()
- boolean inGroup(String)
- boolean hasHome()
- void enableInvulnerabilityAfterTeleport()
- boolean isAfk()
- void sendTl(String, Object[])
- boolean canBuild()
- void takeMoney(BigDecimal)
- void takeMoney(BigDecimal, CommandSource)
- void setMoney(BigDecimal) throws MaxMoneyException
- Boolean canSpawnItem(Material)
- void setAfk(boolean, AfkStatusChangeEvent$Cause)
- void setAfk(boolean)
- IAsyncTeleport getAsyncTeleport()
- void addCommandCooldown(Pattern, Date, boolean)
- void setHome(String, Location)
- long getAfkSince()
- String getAfkMessage()
- List getMails()
- void setLogoutLocation()
- void setToggleShout(boolean)
- String getDisplayName()
- void setIgnoreMsg(boolean)
- List getHomes()
- CommandSource getSource()
- String getGroup()
- List getCooldownsList()
- void setLastTeleportTimestamp(long)
- void setPromptingClearConfirm(boolean)
- boolean isPromptingPayConfirm()
- Player getBase()
- String playerTl(String, Object[])
- Date getCommandCooldownExpiry(String)
- void sendComponent(ComponentLike)
- boolean canAfford(BigDecimal)
- Block getTargetBlock(int)
- boolean isAcceptingPay()
- Map getConfirmingPayments()
- String getFormattedNickname()
- boolean isIgnoreExempt()
- long getLastTeleportTimestamp()
- void setFreeze(boolean)
- List getPastUsernames()
- void setLastMessageReplyRecipient(boolean)
- long getLastActivityTime()
- boolean isFreeze()
- void resetInvulnerabilityAfterTeleport()
- void setPromptingPayConfirm(boolean)
- boolean hasPendingTpaRequests(boolean, boolean)
- boolean clearCommandCooldown(Pattern)
- void setAcceptingPay(boolean)
- boolean isGodModeEnabled()
- Location getHome(String) throws Exception
- Location getHome(Location) throws Exception
- boolean isVanished()
- void delHome(String) throws Exception
- void setJail(String)
- Location getLastLocation()
- boolean hasInvulnerabilityAfterTeleport()
- BigDecimal getMoney()
- void setConfigProperty(String, Object)
- void renameHome(String, String) throws Exception
- void setLeavingHidden(boolean)
- void giveMoney(BigDecimal) throws MaxMoneyException
- void giveMoney(BigDecimal, CommandSource) throws MaxMoneyException
- void requestTeleport(User, boolean)
- void sendMessage(String)
- int getMailAmount()
- IUser$TpaRequest getNextTpaRequest(boolean, boolean, boolean)
- void addPastUsername(String)
- boolean isHidden()
- boolean isPermissionSet(String)
- boolean isIgnoreMsg()
- String getFormattedJailTime()
- Component tlComponent(String, Object[])
- void setAfkMessage(String)
- Map getConfigMap()
- Map getConfigMap(String)
- void addMail(String)

### Class: com.earth2me.essentials.AlternativeCommandsHandler
Type: Class

Methods:
- void removePlugin(Plugin)
- Map disabledCommands()
- void executed(String, Command)
- void addPlugin(Plugin)
- Command getAlternative(String)

### Class: com.earth2me.essentials.AsyncTeleport
Type: Class
Implements: com.earth2me.essentials.api.IAsyncTeleport

Methods:
- void respawn(Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void nowUnsafe(Location, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void teleport(Location, Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void teleport(Player, Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void now(Location, boolean, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void now(Player, boolean, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void setTpType(AsyncTeleport$TeleportType)
- void cooldown(boolean) throws Throwable
- boolean cooldown(boolean, CompletableFuture)
- void back(Trade, CompletableFuture)
- void back(IUser, Trade, CompletableFuture)
- void back(CompletableFuture)
- void teleportPlayer(IUser, Location, Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void teleportPlayer(IUser, Player, Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void warp(IUser, String, Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)

### Class: com.earth2me.essentials.AsyncTimedTeleport
Type: Class
Implements: java.lang.Runnable

Methods:
- void run()

### Class: com.earth2me.essentials.Backup
Type: Class
Implements: java.lang.Runnable

Methods:
- CompletableFuture getTaskLock()
- void stopTask()
- void setPendingShutdown(boolean)
- void run()
- void onPlayerJoin()

### Class: com.earth2me.essentials.BalanceTopImpl
Type: Class
Implements: net.essentialsx.api.v2.services.BalanceTop

Methods:
- long getCacheAge()
- BigDecimal getBalanceTopTotal()
- CompletableFuture calculateBalanceTopMapAsync()
- boolean isCacheLocked()
- Map getBalanceTopCache()

### Class: com.earth2me.essentials.ChargeException
Type: Class
Extends: net.ess3.api.TranslatableException

No public methods found

### Class: com.earth2me.essentials.CommandSource
Type: Class

Methods:
- boolean isPlayer()
- void sendTl(String, Object[])
- boolean isAuthorized(String)
- Player getPlayer()
- String getDisplayName()
- IUser getUser()
- Component tlComponent(String, Object[])
- String tl(String, Object[])
- void sendMessage(String)
- String getSelfSelector()
- CommandSender setSender(CommandSender)
- CommandSender getSender()
- void sendComponent(Component)

### Class: com.earth2me.essentials.Console
Type: Class
Implements: com.earth2me.essentials.messaging.IMessageRecipient

Methods:
- void setReplyRecipient(IMessageRecipient)
- void sendTl(String, Object[])
- CommandSender getCommandSender(Server) throws Exception
- CommandSender getCommandSender()
- boolean isReachable()
- String tlSender(String, Object[])
- String getName()
- UUID getUUID()
- String getDisplayName()
- IMessageRecipient$MessageResponse onReceiveMessage(IMessageRecipient, String)
- void sendMessage(String)
- IMessageRecipient$MessageResponse sendMessage(IMessageRecipient, String)
- Console getInstance()
- boolean isHiddenFrom(Player)
- IMessageRecipient getReplyRecipient()

### Class: com.earth2me.essentials.Enchantments
Type: Class

Methods:
- void registerAlias(String, Enchantment)
- Set entrySet()
- void registerEnchantment(String, Enchantment)
- Enchantment getByName(String)
- Set keySet()
- String getRealName(Enchantment)

### Class: com.earth2me.essentials.Essentials
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin
Implements: net.ess3.api.IEssentials

Methods:
- Collection getOnlinePlayers()
- World getWorld(String)
- UpdateChecker getUpdateChecker()
- PluginCommand getPluginCommand(String)
- Worth getWorth()
- BalanceTop getBalanceTop()
- void showError(CommandSource, Throwable, String)
- ModernUserMap getUsers()
- IUserMap getUsers()
- BukkitTask runTaskLaterAsynchronously(Runnable, long)
- BukkitAudiences getBukkitAudience()
- ProviderFactory getProviders()
- boolean onCommand(CommandSender, Command, String, String[])
- User matchUser(Server, User, String, Boolean, boolean) throws PlayerNotFoundException
- int scheduleSyncRepeatingTask(Runnable, long, long)
- MailService getMail()
- void saveConfig()
- IItemDb getItemDb()
- IItemDb getItemDb()
- void broadcastTl(String, Object[])
- void broadcastTl(IUser, String, Object[])
- void broadcastTl(IUser, String, String, Object[])
- void broadcastTl(IUser, Predicate, String, Object[])
- void broadcastTl(IUser, Predicate, boolean, String, Object[])
- List onTabCompleteEssentials(CommandSender, Command, String, String[], ClassLoader, String, String, IEssentialsModule)
- EssentialsTimer getTimer()
- void setupForTesting(Server) throws IOException, InvalidDescriptionException
- IJails getJails()
- IJails getJails()
- ISettings getSettings()
- ISettings getSettings()
- User getUser(Object)
- User getUser(String)
- User getUser(UUID)
- User getUser(Player)
- Collection getVanishedPlayersNew()
- BukkitTask runTaskTimerAsynchronously(Runnable, long, long)
- void onEnable()
- Iterable getOnlineUsers()
- void onDisable()
- List getVanishedPlayers()
- boolean onCommandEssentials(CommandSender, Command, String, String[], ClassLoader, String, String, IEssentialsModule)
- Kits getKits()
- void reload()
- BukkitTask runTaskAsynchronously(Runnable)
- List onTabComplete(CommandSender, Command, String, String[])
- UserMap getUserMap()
- BukkitScheduler getScheduler()
- Logger getWrappedLogger()
- AlternativeCommandsHandler getAlternativeCommandsHandler()
- void addReloadListener(IConf)
- int broadcastMessage(String)
- int broadcastMessage(IUser, String)
- int broadcastMessage(IUser, String, Predicate)
- int broadcastMessage(String, String)
- RandomTeleport getRandomTeleport()
- I18n getI18n()
- void cleanupOpenInventories()
- Warps getWarps()
- IWarps getWarps()
- boolean canInteractWith(CommandSource, User)
- boolean canInteractWith(User, User)
- Backup getBackup()
- PermissionsHandler getPermissionsHandler()
- int scheduleSyncDelayedTask(Runnable)
- int scheduleSyncDelayedTask(Runnable, long)
- CustomItemResolver getCustomItemResolver()
- User getOfflineUser(String)
- void onLoad()
- Map getCommandMap()

### Class: com.earth2me.essentials.EssentialsBlockListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onBlockPlace(BlockPlaceEvent)

### Class: com.earth2me.essentials.EssentialsEntityListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onEntityShootBow(EntityShootBowEvent)
- void onPlayerDeathInvEvent(PlayerDeathEvent)
- void onEntityCombust(EntityCombustEvent)
- void onEntityRegainHealth(EntityRegainHealthEvent)
- void onEntityDamage(EntityDamageByEntityEvent)
- void onEntityDamage(EntityDamageEvent)
- void onEntityTarget(EntityTargetEvent)
- void onFoodLevelChange(FoodLevelChangeEvent)
- void onEntityCombustByEntity(EntityCombustByEntityEvent)
- void onPlayerDeathExpEvent(PlayerDeathEvent)
- void onPlayerDeathEvent(PlayerDeathEvent)
- void onPotionSplashEvent(PotionSplashEvent)

### Class: com.earth2me.essentials.EssentialsLogger
Type: Class

Methods:
- LoggerProvider getLoggerProvider(Plugin)
- LoggerProvider getLoggerProvider(String)
- void updatePluginLogger(Plugin)

### Class: com.earth2me.essentials.EssentialsPlayerListener
Type: Class
Implements: org.bukkit.event.Listener, com.earth2me.essentials.FakeAccessor

Methods:
- void getUser(Player)
- void onPlayerInteract(PlayerInteractEvent)
- void onPlayerQuit(PlayerQuitEvent)
- void onPlayerLoginBanned(PlayerLoginEvent)
- void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent)
- void onPlayerJoin(PlayerJoinEvent)
- void onPlayerRespawn(PlayerRespawnEvent)
- void handlePlayerCommandPreprocess(PlayerCommandPreprocessEvent, String)
- void onInventoryClickEvent(InventoryClickEvent)
- void onPlayerTeleport(PlayerTeleportEvent)
- void onPlayerBucketEmpty(PlayerBucketEmptyEvent)
- void onInventoryCloseEvent(InventoryCloseEvent)
- void onPlayerChangedWorld(PlayerChangedWorldEvent)
- void onPlayerMove(PlayerMoveEvent)
- void onPlayerChangedWorldFlyReset(PlayerChangedWorldEvent)
- void onPlayerChat(AsyncPlayerChatEvent)
- void registerEvents()
- void onPlayerLogin(PlayerLoginEvent)
- void delayedJoin(Player, String)
- void onPlayerFishEvent(PlayerFishEvent)
- void onPlayerEggThrow(PlayerEggThrowEvent)

### Class: com.earth2me.essentials.EssentialsPluginListener
Type: Class
Implements: org.bukkit.event.Listener, com.earth2me.essentials.IConf

Methods:
- void onPluginEnable(PluginEnableEvent)
- void reloadConfig()
- void onPluginDisable(PluginDisableEvent)

### Class: com.earth2me.essentials.EssentialsServerListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onServerListPing(ServerListPingEvent) throws Exception

### Class: com.earth2me.essentials.EssentialsTimer
Type: Class
Implements: java.lang.Runnable

Methods:
- void run()
- double getAverageTPS()

### Class: com.earth2me.essentials.EssentialsUpgrade
Type: Class

Methods:
- void upgradeLang()
- void afterSettings()
- void convertIgnoreList()
- void uuidFileConvert(IEssentials, Boolean)
- void convertStupidCamelCaseUserdataKeys()
- void convertKits()
- void purgeBrokenNpcAccounts()
- void updateRandomTeleport()
- void convertMailList()
- void preModules()
- void beforeSettings()
- void generateUidCache()
- void banFormatChange()
- Location getFakeLocation(CommentedConfigurationNode, String)

### Class: com.earth2me.essentials.ExecuteTimer
Type: Class

Methods:
- void start()
- String end()
- void mark(String)

### Class: com.earth2me.essentials.FakeServer
Type: Class
Implements: org.bukkit.Server

Methods:
- Advancement getAdvancement(NamespacedKey)
- void clearRecipes()
- List getRecipesFor(ItemStack)
- World getWorld(String)
- World getWorld(UUID)
- Player getPlayer(String)
- Player getPlayer(UUID)
- Collection getOnlinePlayers()
- String getName()
- PluginCommand getPluginCommand(String)
- Messenger getMessenger()
- String getMotd()
- int getAnimalSpawnLimit()
- ConsoleCommandSender getConsoleSender()
- String getServerName()
- void setDefaultGameMode(GameMode)
- Set getOperators()
- Set getBannedPlayers()
- ChunkGenerator$ChunkData createChunkData(World)
- int getWaterAnimalSpawnLimit()
- void reloadWhitelist()
- int getSpawnRadius()
- UnsafeValues getUnsafe()
- void sendPluginMessage(Plugin, String, byte[])
- CachedServerIcon loadServerIcon(File)
- CachedServerIcon loadServerIcon(BufferedImage)
- OfflinePlayerStub[] getOfflinePlayers()
- OfflinePlayer[] getOfflinePlayers()
- FakeServer getServer()
- boolean getAllowEnd()
- boolean unloadWorld(String, boolean)
- boolean unloadWorld(World, boolean)
- void setWhitelist(boolean)
- Logger getLogger()
- Set getIPBans()
- boolean getAllowNether()
- String getBukkitVersion()
- boolean isPrimaryThread()
- MapView getMap(short)
- MapView getMap(int)
- ItemFactory getItemFactory()
- ScoreboardManager getScoreboardManager()
- OfflinePlayer getOfflinePlayer(String)
- OfflinePlayer getOfflinePlayer(UUID)
- ServicesManager getServicesManager()
- CachedServerIcon getServerIcon()
- BossBar createBossBar(String, BarColor, BarStyle, BarFlag[])
- String getServerId()
- Merchant createMerchant(String)
- File getWorldContainer()
- void shutdown()
- Map getCommandAliases()
- BanList getBanList(BanList$Type)
- int getTicksPerAnimalSpawns()
- void setSpawnRadius(int)
- int broadcast(String, String)
- int getIdleTimeout()
- String getIp()
- int getViewDistance()
- void savePlayers()
- void reloadData()
- Iterator advancementIterator()
- void resetRecipes()
- PluginManager getPluginManager()
- void reload()
- String getShutdownMessage()
- Warning$WarningState getWarningState()
- World createWorld(String, World$Environment)
- World createWorld(WorldCreator)
- boolean getOnlineMode()
- File getUpdateFolderFile()
- BukkitScheduler getScheduler()
- String getVersion()
- Set getListeningPluginChannels()
- boolean hasWhitelist()
- String getUpdateFolder()
- GameMode getDefaultGameMode()
- void banIP(String)
- boolean getGenerateStructures()
- int broadcastMessage(String)
- MapView createMap(World)
- int getMaxPlayers()
- int getTicksPerMonsterSpawns()
- Entity getEntity(UUID)
- String getWorldType()
- int getMonsterSpawnLimit()
- List getWorlds()
- List matchPlayer(String)
- HelpMap getHelpMap()
- Iterator recipeIterator()
- boolean dispatchCommand(CommandSender, String)
- boolean addRecipe(Recipe)
- boolean isHardcore()
- int getPort()
- boolean getAllowFlight()
- Player getPlayerExact(String)
- int getAmbientSpawnLimit()
- Inventory createInventory(InventoryHolder, InventoryType)
- Inventory createInventory(InventoryHolder, int)
- Inventory createInventory(InventoryHolder, int, String)
- Inventory createInventory(InventoryHolder, InventoryType, String)
- Set getWhitelistedPlayers()
- void setIdleTimeout(int)
- void unbanIP(String)
- long getConnectionThrottle()

### Class: com.earth2me.essentials.FakeWorld
Type: Class
Implements: org.bukkit.World

Methods:
- String getName()
- Item dropItemNaturally(Location, ItemStack)
- void setAnimalSpawnLimit(int)
- List getPopulators()
- LightningStrike strikeLightning(Location)
- Arrow spawnArrow(Location, Vector, float, float)
- Arrow spawnArrow(Location, Vector, float, float, Class)
- void setThunderDuration(int)
- String[] getGameRules()
- int getAnimalSpawnLimit()
- void setWaterAnimalSpawnLimit(int)
- int getWeatherDuration()
- boolean setGameRuleValue(String, String)
- void setStorm(boolean)
- Item dropItem(Location, ItemStack)
- UUID getUID()
- LightningStrike strikeLightningEffect(Location)
- boolean unloadChunkRequest(int, int)
- boolean unloadChunkRequest(int, int, boolean)
- ChunkGenerator getGenerator()
- void setFullTime(long)
- int getWaterAnimalSpawnLimit()
- Collection getNearbyEntities(Location, double, double, double)
- void setTicksPerMonsterSpawns(int)
- int getHighestBlockYAt(int, int)
- int getHighestBlockYAt(Location)
- boolean isGameRule(String)
- void setTicksPerAnimalSpawns(int)
- void setBiome(int, int, Biome)
- void setAutoSave(boolean)
- List getPlayers()
- void sendPluginMessage(Plugin, String, byte[])
- int getMaxHeight()
- void setTime(long)
- List getMetadata(String)
- void setSpawnFlags(boolean, boolean)
- boolean setSpawnLocation(Location)
- boolean setSpawnLocation(int, int, int)
- Chunk[] getLoadedChunks()
- double getHumidity(int, int)
- void setWeatherDuration(int)
- Collection getEntitiesByClass(Class[])
- Collection getEntitiesByClass(Class)
- boolean isChunkLoaded(Chunk)
- boolean isChunkLoaded(int, int)
- ChunkSnapshot getEmptyChunkSnapshot(int, int, boolean, boolean)
- Collection getEntitiesByClasses(Class[])
- String getGameRuleValue(String)
- Chunk getChunkAt(int, int)
- Chunk getChunkAt(Location)
- Chunk getChunkAt(Block)
- void setThundering(boolean)
- List getEntities()
- boolean isChunkInUse(int, int)
- List getLivingEntities()
- double getTemperature(int, int)
- boolean regenerateChunk(int, int)
- long getTicksPerAnimalSpawns()
- boolean canGenerateStructures()
- long getFullTime()
- long getTime()
- void save()
- void playEffect(Location, Effect, int)
- void playEffect(Location, Effect, int, int)
- void playEffect(Location, Effect, Object)
- void playEffect(Location, Effect, Object, int)
- Location getSpawnLocation()
- File getWorldFolder()
- void setDifficulty(Difficulty)
- int getSeaLevel()
- Block getHighestBlockAt(int, int)
- Block getHighestBlockAt(Location)
- boolean getAllowAnimals()
- boolean hasStorm()
- int getBlockTypeIdAt(int, int, int)
- int getBlockTypeIdAt(Location)
- void playSound(Location, Sound, float, float)
- void playSound(Location, String, float, float)
- void playSound(Location, Sound, SoundCategory, float, float)
- void playSound(Location, String, SoundCategory, float, float)
- Entity spawnEntity(Location, EntityType)
- boolean generateTree(Location, TreeType)
- boolean generateTree(Location, TreeType, BlockChangeDelegate)
- Biome getBiome(int, int)
- void spawnParticle(Particle, Location, int)
- void spawnParticle(Particle, double, double, double, int)
- void spawnParticle(Particle, Location, int, Object)
- void spawnParticle(Particle, double, double, double, int, Object)
- void spawnParticle(Particle, Location, int, double, double, double)
- void spawnParticle(Particle, double, double, double, int, double, double, double)
- void spawnParticle(Particle, Location, int, double, double, double, Object)
- void spawnParticle(Particle, double, double, double, int, double, double, double, Object)
- void spawnParticle(Particle, Location, int, double, double, double, double)
- void spawnParticle(Particle, double, double, double, int, double, double, double, double)
- void spawnParticle(Particle, Location, int, double, double, double, double, Object)
- void spawnParticle(Particle, double, double, double, int, double, double, double, double, Object)
- Set getListeningPluginChannels()
- long getSeed()
- boolean getAllowMonsters()
- int getThunderDuration()
- void loadChunk(Chunk)
- void loadChunk(int, int)
- boolean loadChunk(int, int, boolean)
- boolean createExplosion(double, double, double, float)
- boolean createExplosion(double, double, double, float, boolean)
- boolean createExplosion(double, double, double, float, boolean, boolean)
- boolean createExplosion(Location, float)
- boolean createExplosion(Location, float, boolean)
- void setPVP(boolean)
- World$Environment getEnvironment()
- boolean hasMetadata(String)
- long getTicksPerMonsterSpawns()
- WorldType getWorldType()
- Block getBlockAt(int, int, int)
- Block getBlockAt(Location)
- boolean getKeepSpawnInMemory()
- int getMonsterSpawnLimit()
- boolean isAutoSave()
- void setMetadata(String, MetadataValue)
- Entity spawn(Location, Class) throws IllegalArgumentException
- Entity spawn(Location, Class, Consumer) throws IllegalArgumentException
- void removeMetadata(String, Plugin)
- boolean isThundering()
- void setAmbientSpawnLimit(int)
- void setMonsterSpawnLimit(int)
- boolean unloadChunk(Chunk)
- boolean unloadChunk(int, int)
- boolean unloadChunk(int, int, boolean)
- boolean unloadChunk(int, int, boolean, boolean)
- int getAmbientSpawnLimit()
- void setKeepSpawnInMemory(boolean)
- boolean getPVP()
- Difficulty getDifficulty()
- boolean refreshChunk(int, int)
- WorldBorder getWorldBorder()
- FallingBlock spawnFallingBlock(Location, MaterialData) throws IllegalArgumentException
- FallingBlock spawnFallingBlock(Location, Material, byte) throws IllegalArgumentException
- FallingBlock spawnFallingBlock(Location, int, byte) throws IllegalArgumentException

### Class: com.earth2me.essentials.I18n
Type: Class
Implements: net.ess3.api.II18n

Methods:
- Object[] mutateArgs(Object[], Function)
- String capitalCase(String)
- void updateLocale(String)
- String tlLocale(Locale, String, Object[])
- Locale getCurrentLocale()
- void onEnable()
- Locale getLocale(String)
- void onDisable()
- String tlLiteral(String, Object[])

### Class: com.earth2me.essentials.Jails
Type: Class
Implements: net.ess3.api.IJails

Methods:
- Location getJail(String) throws Exception
- void startTransaction()
- Collection getList() throws Exception
- void setJail(String, Location) throws Exception
- void removeJail(String) throws Exception
- void reloadConfig()
- void sendToJail(IUser, String, CompletableFuture) throws Exception
- int getCount()
- void resetListener()
- void stopTransaction(boolean)

### Class: com.earth2me.essentials.Kit
Type: Class

Methods:
- boolean expandItems(User) throws Exception
- boolean expandItems(User, List) throws Exception
- List getItems(User) throws Exception
- List getItems() throws Exception
- String getName()
- void chargeUser(User) throws Exception
- void checkAffordable(User) throws Exception
- long getNextUse(User) throws Exception
- void checkPerms(User) throws Exception
- void resetTime(User)
- void checkDelay(User) throws Exception
- void setTime(User) throws Exception

### Class: com.earth2me.essentials.Kits
Type: Class
Implements: com.earth2me.essentials.IConf

Methods:
- void addKit(String, List, long)
- EssentialsConfiguration getRootConfig()
- String matchKit(String)
- Map getKit(String)
- void reloadConfig()
- String listKits(IEssentials, User) throws Exception
- void removeKit(String)
- File getFile()
- Set getKitKeys()

### Class: com.earth2me.essentials.LocationTarget
Type: Class
Implements: com.earth2me.essentials.ITarget

Methods:
- Location getLocation()

### Class: com.earth2me.essentials.MailServiceImpl
Type: Class
Implements: net.essentialsx.api.v2.services.mail.MailService

Methods:
- String getMailTlKey(MailMessage)
- void sendLegacyMail(IUser, String)
- String getMailLine(MailMessage)
- void sendMail(IUser, MailSender, String)
- void sendMail(IUser, MailSender, String, long)
- Object[] getMailTlArgs(MailMessage)

### Class: com.earth2me.essentials.ManagedFile
Type: Class

Methods:
- void copyResourceAscii(String, File) throws IOException
- boolean checkForVersion(File, String) throws IOException
- List getLines()
- MessageDigest getDigest() throws IOException

### Class: com.earth2me.essentials.MetaItemStack
Type: Class

Methods:
- boolean canSpawn(IEssentials)
- void addBannerMeta(CommandSource, boolean, String, IEssentials) throws Exception
- boolean isValidFirework()
- void addPotionMeta(CommandSource, boolean, String, IEssentials) throws Exception
- void addEnchantment(CommandSource, boolean, Enchantment, int) throws Exception
- FireworkEffect$Builder getFireworkBuilder()
- PotionEffect getPotionEffect()
- void addFireworkMeta(CommandSource, boolean, String, IEssentials) throws Exception
- Enchantment getEnchantment(User, String) throws Exception
- void addItemFlags(String) throws Exception
- boolean isValidPotion()
- boolean completePotion()
- void parseStringMeta(CommandSource, boolean, String[], int, IEssentials) throws Exception
- ItemStack getItemStack()
- void addStringMeta(CommandSource, boolean, String, IEssentials) throws Exception

### Class: com.earth2me.essentials.Mob
Type: Enum
Extends: java.lang.Enum

Methods:
- Mob fromBukkitType(EntityType)
- Entity spawn(World, Server, Location) throws Mob$MobException
- EntityType getType()
- Mob valueOf(String)
- Mob[] values()
- Mob fromName(String)
- Set getMobList()

### Class: com.earth2me.essentials.MobCompat
Type: Class

Methods:
- void setFoxType(Entity, String)
- void setPandaGene(Entity, String, boolean)
- void setParrotVariant(Entity, String)
- void setVillagerType(Entity, String)
- void setCowVariant(Entity, String)
- void setSalmonSize(Entity, String)
- void setAxolotlVariant(Entity, String)
- void setVillagerProfession(Entity, MobCompat$VillagerProfession)
- void setBoatVariant(Entity, MobCompat$BoatVariant)
- void setLlamaColor(Entity, String)
- void setFrogVariant(Entity, String)
- void setChickenVariant(Entity, String)
- void setTropicalFishPattern(Entity, String)
- void setCatType(Entity, MobCompat$CatType)
- void setCamelSaddle(Entity, Player)
- void setMooshroomVariant(Entity, String)
- void setWolfVariant(Entity, String)
- void setPigVariant(Entity, String)

### Class: com.earth2me.essentials.MobData
Type: Enum
Extends: java.lang.Enum

Methods:
- void setData(Entity, Player, String) throws Exception
- String getMatched()
- MobData valueOf(String)
- MobData[] values()
- LinkedHashMap getPossibleData(Entity, boolean)
- MobData fromData(Entity, String)
- List getValidHelp(Entity)

### Class: com.earth2me.essentials.OfflinePlayerStub
Type: Class
Implements: org.bukkit.entity.Player

Methods:
- InventoryView openMerchant(Villager, boolean)
- InventoryView openMerchant(Merchant, boolean)
- void setPlayerTime(long, boolean)
- Location getLocation()
- Location getLocation(Location)
- boolean isSprinting()
- void setGlowing(boolean)
- void setLastDamageCause(EntityDamageEvent)
- UUID getUniqueId()
- void setItemInHand(ItemStack)
- void setMomentum(Vector)
- boolean hasAchievement(Achievement)
- boolean isGlowing()
- void setSleepingIgnored(boolean)
- boolean isBanned()
- boolean canSee(Player)
- void sendPluginMessage(Plugin, String, byte[])
- void sendBlockChange(Location, Material, byte)
- void sendBlockChange(Location, int, byte)
- void abandonConversation(Conversation)
- void abandonConversation(Conversation, ConversationAbandonedEvent)
- ItemStack getItemInHand()
- Set getEffectivePermissions()
- boolean sendChunkChange(Location, int, int, int, byte[])
- double getHealthScale()
- Player getKiller()
- void setGameMode(GameMode)
- boolean isPlayerTimeRelative()
- EntityType getType()
- void setMaximumNoDamageTicks(int)
- boolean isSneaking()
- boolean hasPermission(String)
- boolean hasPermission(Permission)
- Set getScoreboardTags()
- boolean isFlying()
- void setName(String)
- void setGliding(boolean)
- GameMode getGameMode()
- void playEffect(Location, Effect, int)
- void playEffect(EntityEffect)
- void playEffect(Location, Effect, Object)
- void loadData()
- ItemStack getItemOnCursor()
- float getFallDistance()
- double getHeight()
- void stopSound(Sound)
- void stopSound(String)
- void stopSound(Sound, SoundCategory)
- void stopSound(String, SoundCategory)
- void setExp(float)
- PlayerInventory getInventory()
- Inventory getInventory()
- AdvancementProgress getAdvancementProgress(Advancement)
- void spawnParticle(Particle, Location, int)
- void spawnParticle(Particle, double, double, double, int)
- void spawnParticle(Particle, Location, int, Object)
- void spawnParticle(Particle, double, double, double, int, Object)
- void spawnParticle(Particle, Location, int, double, double, double)
- void spawnParticle(Particle, double, double, double, int, double, double, double)
- void spawnParticle(Particle, Location, int, double, double, double, Object)
- void spawnParticle(Particle, double, double, double, int, double, double, double, Object)
- void spawnParticle(Particle, Location, int, double, double, double, double)
- void spawnParticle(Particle, double, double, double, int, double, double, double, double)
- void spawnParticle(Particle, Location, int, double, double, double, double, Object)
- void spawnParticle(Particle, double, double, double, int, double, double, double, double, Object)
- Vector getMomentum()
- void resetMaxHealth()
- Entity getShoulderEntityRight()
- Set getListeningPluginChannels()
- boolean isBlocking()
- String getCustomName()
- long getPlayerTime()
- void sendMessage(String)
- void sendMessage(String[])
- long getPlayerTimeOffset()
- MainHand getMainHand()
- void removeAttachment(PermissionAttachment)
- WeatherType getPlayerWeather()
- void setMetadata(String, MetadataValue)
- InventoryView openWorkbench(Location, boolean)
- boolean getAllowFlight()
- Location getCompassTarget()
- boolean isOnGround()
- void setGravity(boolean)
- BlockFace getFacing()
- boolean isSilent()
- void setTexturePack(String)
- void resetPlayerTime()
- void setHealthScaled(boolean)
- World getWorld()
- String getName()
- PermissionAttachment addAttachment(Plugin, String, boolean)
- PermissionAttachment addAttachment(Plugin)
- PermissionAttachment addAttachment(Plugin, String, boolean, int)
- PermissionAttachment addAttachment(Plugin, int)
- void decrementStatistic(Statistic) throws IllegalArgumentException
- void decrementStatistic(Statistic, int) throws IllegalArgumentException
- void decrementStatistic(Statistic, Material) throws IllegalArgumentException
- void decrementStatistic(Statistic, Material, int) throws IllegalArgumentException
- void decrementStatistic(Statistic, EntityType) throws IllegalArgumentException
- void decrementStatistic(Statistic, EntityType, int)
- void teleportTo(Location)
- void teleportTo(Entity)
- void setAI(boolean)
- boolean isConversing()
- void closeInventory()
- void setTicksLived(int)
- boolean hasPotionEffect(PotionEffectType)
- boolean getRemoveWhenFarAway()
- List getNearbyEntities(double, double, double)
- void setVelocity(Vector)
- int getFireTicks()
- void setInvulnerable(boolean)
- void setRemoveWhenFarAway(boolean)
- void setResourcePack(String)
- void setResourcePack(String, byte[])
- boolean isOp()
- int getTicksLived()
- InventoryView openEnchanting(Location, boolean)
- void setBedSpawnLocation(Location, boolean)
- void setBedSpawnLocation(Location)
- float getExhaustion()
- void saveData()
- boolean isHealthScaled()
- void setAllowFlight(boolean)
- double getLastDamage()
- boolean performCommand(String)
- boolean hasPlayedBefore()
- void sendMap(MapView)
- long getLastPlayed()
- boolean isCustomNameVisible()
- boolean setWindowProperty(InventoryView$Property, int)
- void setCanPickupItems(boolean)
- boolean getCanPickupItems()
- void setFlySpeed(float) throws IllegalArgumentException
- void setTotalExperience(int)
- void setStatistic(Statistic, int) throws IllegalArgumentException
- void setStatistic(Statistic, Material, int) throws IllegalArgumentException
- void setStatistic(Statistic, EntityType, int)
- void playNote(Location, byte, byte)
- void playNote(Location, Instrument, Note)
- boolean beginConversation(Conversation)
- int getRemainingAir()
- long getFirstPlayed()
- Vehicle getVehicle()
- Entity getVehicle()
- void setDisplayName(String)
- boolean isWhitelisted()
- boolean isGliding()
- void setCompassTarget(Location)
- void remove()
- InventoryView getOpenInventory()
- Inventory getEnderChest()
- void setNoDamageTicks(int)
- InetSocketAddress getAddress()
- void removeAchievement(Achievement)
- boolean isInsideVehicle()
- boolean setLeashHolder(Entity)
- void setHealth(double)
- boolean hasCooldown(Material)
- void incrementStatistic(Statistic)
- void incrementStatistic(Statistic, int)
- void incrementStatistic(Statistic, Material)
- void incrementStatistic(Statistic, Material, int)
- void incrementStatistic(Statistic, EntityType) throws IllegalArgumentException
- void incrementStatistic(Statistic, EntityType, int) throws IllegalArgumentException
- boolean isSleeping()
- boolean isEmpty()
- boolean isInvulnerable()
- boolean isPermissionSet(String)
- boolean isPermissionSet(Permission)
- void setItemOnCursor(ItemStack)
- void giveExpLevels(int)
- List getLastTwoTargetBlocks(Set, int)
- Entity getPassenger()
- float getFlySpeed()
- void setExhaustion(float)
- void setLastDamage(double)
- void setShoulderEntityLeft(Entity)
- String getLocale()
- void setWhitelisted(boolean)
- void acceptConversationInput(String)
- void recalculatePermissions()
- void awardAchievement(Achievement)
- void setLevel(int)
- boolean isDead()
- boolean eject()
- int getMaximumAir()
- void setFlying(boolean)
- int getMaximumNoDamageTicks()
- void setHealthScale(double) throws IllegalArgumentException
- double getHealth()
- Server getServer()
- Location getEyeLocation()
- void setMaxHealth(double)
- void sendRawMessage(String)
- void setSpectatorTarget(Entity)
- Entity getLeashHolder() throws IllegalStateException
- void showPlayer(Player)
- void showPlayer(Plugin, Player)
- boolean setPassenger(Entity)
- void giveExp(int)
- Map serialize()
- void setBanned(boolean)
- PotionEffect getPotionEffect(PotionEffectType)
- String getDisplayName()
- int getFoodLevel()
- void setMaximumAir(int)
- void resetTitle()
- int getMaxFireTicks()
- void damage(double)
- void damage(double, Entity)
- double getMaxHealth()
- int getTotalExperience()
- Vector getVelocity()
- float getWalkSpeed()
- boolean isHandRaised()
- void sendTitle(String, String)
- void sendTitle(String, String, int, int, int)
- boolean isLeashed()
- float getSaturation()
- double getWidth()
- double getEyeHeight()
- double getEyeHeight(boolean)
- EntityEquipment getEquipment()
- boolean addPotionEffect(PotionEffect)
- boolean addPotionEffect(PotionEffect, boolean)
- void playSound(Location, Sound, float, float)
- void playSound(Location, String, float, float)
- void playSound(Location, Sound, SoundCategory, float, float)
- void playSound(Location, String, SoundCategory, float, float)
- void setSneaking(boolean)
- Scoreboard getScoreboard()
- int getEntityId()
- InventoryView openInventory(Inventory)
- void openInventory(InventoryView)
- boolean addPotionEffects(Collection)
- void setScoreboard(Scoreboard) throws IllegalArgumentException, IllegalStateException
- void setOp(boolean)
- boolean isValid()
- boolean hasMetadata(String)
- int getSleepTicks()
- float getExp()
- int getLevel()
- void kickPlayer(String)
- List getPassengers()
- void chat(String)
- void setSaturation(float)
- Player getPlayer()
- void setFallDistance(float)
- void setCustomName(String)
- boolean hasGravity()
- void setPlayerListName(String)
- boolean leaveVehicle()
- String getPlayerListName()
- boolean addPassenger(Entity)
- void setRemainingAir(int)
- void setFireTicks(int)
- void setCollidable(boolean)
- boolean isSleepingIgnored()
- void hidePlayer(Player)
- void hidePlayer(Plugin, Player)
- int getNoDamageTicks()
- List getMetadata(String)
- boolean hasAI()
- Projectile launchProjectile(Class)
- Projectile launchProjectile(Class, Vector)
- int getCooldown(Material)
- List getLineOfSight(Set, int)
- Location getBedSpawnLocation()
- EntityDamageEvent getLastDamageCause()
- void setSprinting(boolean)
- Block getTargetBlock(Set, int)
- int getPortalCooldown()
- Entity getShoulderEntityLeft()
- int getExpToLevel()
- int getStatistic(Statistic) throws IllegalArgumentException
- int getStatistic(Statistic, Material) throws IllegalArgumentException
- int getStatistic(Statistic, EntityType) throws IllegalArgumentException
- boolean teleport(Location)
- boolean teleport(Entity)
- boolean teleport(Location, PlayerTeleportEvent$TeleportCause)
- boolean teleport(Entity, PlayerTeleportEvent$TeleportCause)
- Entity getSpectatorTarget()
- boolean isOnline()
- void setShoulderEntityRight(Entity)
- boolean isCollidable()
- void setPlayerWeather(WeatherType)
- AttributeInstance getAttribute(Attribute)
- void sendSignChange(Location, String[]) throws IllegalArgumentException
- void setSilent(boolean)
- boolean hasLineOfSight(Entity)
- void setLocation(Location)
- void setPortalCooldown(int)
- void setCustomNameVisible(boolean)
- void setWalkSpeed(float) throws IllegalArgumentException
- void setCooldown(Material, int)
- boolean addScoreboardTag(String)
- void removePotionEffect(PotionEffectType)
- boolean removeScoreboardTag(String)
- PistonMoveReaction getPistonMoveReaction()
- void removeMetadata(String, Plugin)
- void updateInventory()
- void resetPlayerWeather()
- Collection getActivePotionEffects()
- void setFoodLevel(int)
- boolean removePassenger(Entity)

### Class: com.earth2me.essentials.PlayerExtension
Type: Class

Methods:
- Server getServer()
- OfflinePlayer getOffline()
- Location getLocation()
- World getWorld()
- Player getBase()
- Player setBase(Player)

### Class: com.earth2me.essentials.PlayerList
Type: Class

Methods:
- Map getPlayerLists(IEssentials, IUser, boolean)
- String listGroupUsers(IEssentials, Map, String) throws Exception
- String listUsers(IEssentials, List, String)
- String listSummary(IEssentials, User, boolean)
- List getMergedList(IEssentials, Map, String)
- String outputFormat(String, String)
- List prepareGroupedList(IEssentials, CommandSource, String, Map)

### Class: com.earth2me.essentials.PlayerTarget
Type: Class
Implements: com.earth2me.essentials.ITarget

Methods:
- Location getLocation()

### Class: com.earth2me.essentials.Potions
Type: Class

Methods:
- Set entrySet()
- PotionEffectType getByName(String)

### Class: com.earth2me.essentials.ProviderFactory
Type: Class

Methods:
- void finalizeRegistration()
- Provider get(Class)
- void registerProvider(Class[])

### Class: com.earth2me.essentials.RandomTeleport
Type: Class
Implements: com.earth2me.essentials.IConf

Methods:
- double getMaxRange(String)
- Location getCenter(String)
- boolean isPerLocationPermission()
- void setCenter(String, Location)
- String getDefaultLocation()
- void setMinRange(String, double)
- boolean hasLocation(String)
- Set getExcludedBiomes()
- File getFile()
- double getMinRange(String)
- EssentialsConfiguration getConfig()
- int getFindAttempts()
- int getCacheThreshold()
- void reloadConfig()
- Queue getCachedLocations(String)
- List listLocations()
- void setMaxRange(String, double)
- void cacheRandomLocations(String)
- CompletableFuture getRandomLocation(String)
- CompletableFuture getRandomLocation(Location, double, double)

### Class: com.earth2me.essentials.Settings
Type: Class
Implements: net.ess3.api.ISettings

Methods:
- boolean removeGodOnDisconnect()
- boolean isChatQuestionEnabled()
- String getCurrencySymbol()
- Tag getPrimaryColor()
- Tag getSecondaryColor()
- boolean isCommandOverridden(String)
- boolean getDisableItemPickupWhileAfk()
- boolean isWorldTimePermissions()
- int getDefaultStackSize()
- int getMaxNickLength()
- File getConfigFile()
- BigDecimal getMultiplier(User)
- BigDecimal getMaxMoney()
- boolean allowOldIdSigns()
- boolean isForcePassengerTeleport()
- boolean permissionBasedItemSpawn()
- boolean isPlayerCommand(String)
- boolean isWorldChangeFlyResetEnabled()
- boolean isKitAutoEquip()
- boolean isPersistShout()
- boolean _isEcoDisabled()
- boolean infoAfterDeath()
- String getWorldAlias(String)
- boolean broadcastAfkMessage()
- BigDecimal getCommandCost(IEssentialsCommand)
- BigDecimal getCommandCost(String)
- long getBaltopMinPlaytime()
- List getUnprotectedSignNames()
- boolean isWaterSafe()
- int getMotdDelay()
- boolean isReplyToVanished()
- boolean isCustomQuitMessage()
- boolean isWorldChangeSpeedResetEnabled()
- boolean isUsePaperChatEvent()
- BigDecimal getMinMoney()
- int getTpaMaxRequests()
- List getProtectList(String)
- boolean isMilkBucketEasterEggEnabled()
- boolean warnOnBuildDisallow()
- long getBackupInterval()
- long getAutoAfkKick()
- boolean useBukkitPermissions()
- String _getCustomNewUsernameMessage()
- String getOperatorColor()
- Set getMuteCommands()
- boolean isSocialSpyMessages()
- long getLoginAttackDelay()
- int getMailsPerMinute()
- long getMaxUserCacheValueExpiry()
- String getCustomJoinMessage()
- boolean isUpdateCheckEnabled()
- void setEssentialsChatActive(boolean)
- ISettings$KeepInvPolicy _getBindingItemsPolicy()
- boolean isAlwaysTeleportSafety()
- String getAfkListName()
- Set getNoGodWorlds()
- boolean isTeleportToCenterLocation()
- String getNicknamePrefix()
- boolean _isTeleportSafetyEnabled()
- ISettings$TeleportWhenFreePolicy getTeleportWhenFreePolicy()
- boolean areDeathMessagesEnabled()
- boolean isNpcsInBalanceRanking()
- boolean showZeroBaltop()
- int getChatRadius()
- boolean isTradeInStacks(int)
- boolean isTradeInStacks(Material)
- boolean getRepairEnchanted()
- CommentedConfigurationNode getKitSection()
- long getCommandCooldownMs(String)
- boolean isCommandCooldownPersistent(String)
- boolean isSkippingUsedOneTimeKitsFromKitList()
- Set getDisabledCommands()
- boolean isUserInSpawnOnJoinGroup(IUser)
- boolean hasJoinQuitMessagePlayerCount()
- int getNotifyPlayerOfMailCooldown()
- boolean isJailOnlineTime()
- double getHealCooldown()
- boolean isConfirmHomeOverwrite()
- int getMaxUserCacheCount()
- BigDecimal getStartingBalance()
- String _getCustomJoinMessage()
- boolean isWorldHomePermissions()
- long getMaxTempban()
- Set getSocialSpyCommands()
- int getOversizedStackSize()
- List itemSpawnBlacklist()
- Map$Entry getCommandCooldownEntry(String)
- boolean changePlayerListName()
- boolean isAllowBulkBuySell()
- boolean getFreezeAfkPlayers()
- boolean getAnnounceNewPlayers()
- ISettings$KeepInvPolicy getVanishingItemsPolicy()
- boolean addPrefixSuffix()
- boolean getPerWarpPermission()
- long getTpaAcceptCancellation()
- Set getNickBlacklist()
- void reloadConfig()
- Set getMultipleHomes()
- boolean isCurrencySymbolSuffixed()
- boolean getRespawnAtHome()
- boolean isEcoLogUpdateEnabled()
- char getChatShout()
- boolean isRespawnAtBed()
- boolean isCustomNewUsernameMessage()
- String _getAfkListName()
- boolean isEcoLogEnabled()
- boolean isRespawnAtAnchor()
- double getMaxFlySpeed()
- boolean registerBackInListener()
- List getDefaultEnabledConfirmCommands()
- double getMaxProjectileSpeed()
- List getProtectListRaw(String)
- boolean isPastebinCreateKit()
- String getLocale()
- boolean isCommandCooldownsEnabled()
- boolean getSocialSpyListenMutedPlayers()
- boolean disablePrefix()
- boolean isLastMessageReplyRecipient()
- long getPermissionsLagWarning()
- boolean allowSilentJoinQuit()
- boolean isWorldChangePreserveFlying()
- boolean isAllowSellNamedItems()
- List enabledSigns()
- boolean isAllowWorldInBroadcastworld()
- boolean showNonEssCommandsInHelp()
- boolean cancelAfkOnMove()
- char getChatQuestion()
- String getItemDbType()
- boolean warnOnSmite()
- EventPriority getSpawnJoinPriority()
- boolean isSpawnIfNoHome()
- boolean isSpawnOnJoin()
- boolean cancelAfkOnInteract()
- double getTeleportDelay()
- String getNewbieSpawn()
- int getProtectCreeperMaxHeight()
- boolean isCustomServerFullMessage()
- BigDecimal getBaltopMinBalance()
- boolean logCommandBlockCommands()
- BigDecimal getMinimumPayAmount()
- boolean getProtectPreventSpawn(String)
- boolean hideDisplayNameInVanish()
- boolean isAfkListName()
- boolean _isEcoLogUpdateEnabled()
- int getSignUsePerSecond()
- boolean _allowSilentJoinQuit()
- boolean isSocialSpyDisplayNames()
- long getLastMessageReplyRecipientTimeout()
- boolean isNotifyNoNewMail()
- int getJoinQuitMessagePlayerCount()
- boolean changeTabCompleteName()
- boolean changeDisplayName()
- boolean isSendFlyEnableOnJoin()
- NumberFormat getCurrencyFormat()
- boolean getProtectBoolean(String, boolean)
- boolean isWorldTeleportPermissions()
- String getRandomSpawnLocation()
- String getCustomNewUsernameMessage()
- String getNewPlayerKit()
- boolean cancelAfkOnChat()
- String getNickRegex()
- boolean isCommandDisabled(IEssentialsCommand)
- boolean isCommandDisabled(String)
- EventPriority getRespawnPriority()
- boolean isAddingPrefixInPlayerlist()
- boolean isUseBetterKits()
- long getMaxMute()
- List getSpawnOnJoinGroups()
- boolean sleepIgnoresAfkPlayers()
- double getTeleportCooldown()
- boolean isDirectHatAllowed()
- boolean isCompassTowardsHomePerm()
- boolean isVerboseCommandUsages()
- boolean hidePermissionlessHelp()
- boolean ignoreColorsInMaxLength()
- IText getAnnounceNewPlayerFormat()
- boolean isPayExcludesIgnoreList()
- List _getSpawnOnJoinGroups()
- ISettings$KeepInvPolicy _getVanishingItemsPolicy()
- String _getCustomQuitMessage()
- boolean realNamesOnList()
- int getMaxTreeCommandRange()
- boolean isCustomJoinMessage()
- Map getListGroupConfig()
- boolean isShoutDefault()
- String getChatFormat(String)
- String getChatFormat(String, ChatType)
- boolean disableSuffix()
- boolean sleepIgnoresVanishedPlayers()
- boolean isTeleportPassengerDismount()
- boolean getUpdateBedAtDaytime()
- boolean isConfirmCommandEnabledByDefault(String)
- long getAutoAfk()
- boolean isSafeUsermap()
- boolean isForceDisableTeleportSafety()
- int getNearRadius()
- double getMaxWalkSpeed()
- boolean _isEcoLogEnabled()
- long getTeleportInvulnerability()
- void setDebug(boolean)
- String getRandomRespawnLocation()
- boolean isDebug()
- int getSpawnMobLimit()
- boolean isDropItemsIfFull()
- int getMaxItemLore()
- String getBackupCommand()
- ISettings$KeepInvPolicy getBindingItemsPolicy()
- boolean areSignsDisabled()
- boolean isTeleportSafetyEnabled()
- boolean isEcoDisabled()
- long getEconomyLagWarning()
- boolean isTeleportInvulnerability()
- String getProtectString(String)
- String getCustomQuitMessage()
- boolean isRemovingEffectsOnHeal()
- boolean isPerPlayerLocale()
- boolean allowUnsafeEnchantments()
- int getHomeLimit(User)
- int getHomeLimit(String)
- boolean isAlwaysRunBackup()
- boolean isAddingSuffixInPlayerlist()

### Class: com.earth2me.essentials.SpawnMob
Type: Class

Methods:
- void spawnmob(IEssentials, Server, User, List, List, int) throws Exception
- void spawnmob(IEssentials, Server, CommandSource, User, List, List, int) throws Exception
- void spawnmob(IEssentials, Server, CommandSource, User, Location, List, List, int) throws Exception
- List mobParts(String)
- String mobList(User)
- List mobData(String)

### Class: com.earth2me.essentials.TNTExplodeListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onEntityExplode(EntityExplodeEvent)

### Class: com.earth2me.essentials.Trade
Type: Class

Methods:
- void charge(IUser) throws ChargeException
- void charge(IUser, CompletableFuture)
- Trade$TradeType getType()
- void log(String, String, String, String, Trade, String, Trade, Location, BigDecimal, IEssentials)
- BigDecimal getCommandCost(IUser)
- Integer getExperience()
- boolean pay(IUser) throws MaxMoneyException
- Map pay(IUser, Trade$OverflowType) throws MaxMoneyException
- ItemStack getItemStack()
- BigDecimal getMoney()
- void isAffordableFor(IUser) throws ChargeException
- void isAffordableFor(IUser, CompletableFuture)
- void closeLog()

### Class: com.earth2me.essentials.UUIDMap
Type: Class

Methods:
- void writeUUIDMap()
- void forceWriteUUIDMap()
- void shutdown()

### Class: com.earth2me.essentials.UUIDPlayer
Type: Class
Implements: org.bukkit.entity.Player

Methods:
- void setPlayerTime(long, boolean)
- Location getLocation()
- Location getLocation(Location)
- boolean isSprinting()
- void setLastDamageCause(EntityDamageEvent)
- void setItemInHand(ItemStack)
- UUID getUniqueId()
- boolean hasAchievement(Achievement)
- void setSleepingIgnored(boolean)
- boolean canSee(Player)
- boolean isBanned()
- void sendPluginMessage(Plugin, String, byte[])
- void sendBlockChange(Location, Material, byte)
- void sendBlockChange(Location, int, byte)
- ItemStack getItemInHand()
- void abandonConversation(Conversation)
- void abandonConversation(Conversation, ConversationAbandonedEvent)
- Set getEffectivePermissions()
- boolean sendChunkChange(Location, int, int, int, byte[])
- double getHealthScale()
- Player getKiller()
- void setGameMode(GameMode)
- boolean isPlayerTimeRelative()
- EntityType getType()
- void setMaximumNoDamageTicks(int)
- boolean isSneaking()
- boolean hasPermission(String)
- boolean hasPermission(Permission)
- boolean isFlying()
- GameMode getGameMode()
- void playEffect(Location, Effect, int)
- void playEffect(Location, Effect, Object)
- void playEffect(EntityEffect)
- void loadData()
- ItemStack getItemOnCursor()
- float getFallDistance()
- void setExp(float)
- PlayerInventory getInventory()
- Inventory getInventory()
- void resetMaxHealth()
- Set getListeningPluginChannels()
- boolean isBlocking()
- String getCustomName()
- long getPlayerTime()
- void sendMessage(String)
- void sendMessage(String[])
- long getPlayerTimeOffset()
- void removeAttachment(PermissionAttachment)
- void _INVALID_setHealth(int)
- WeatherType getPlayerWeather()
- void setMetadata(String, MetadataValue)
- InventoryView openWorkbench(Location, boolean)
- boolean getAllowFlight()
- Location getCompassTarget()
- boolean isOnGround()
- void setTexturePack(String)
- void resetPlayerTime()
- void setHealthScaled(boolean)
- World getWorld()
- String getName()
- PermissionAttachment addAttachment(Plugin, String, boolean)
- PermissionAttachment addAttachment(Plugin)
- PermissionAttachment addAttachment(Plugin, String, boolean, int)
- PermissionAttachment addAttachment(Plugin, int)
- void _INVALID_setLastDamage(int)
- void decrementStatistic(Statistic) throws IllegalArgumentException
- void decrementStatistic(Statistic, int) throws IllegalArgumentException
- void decrementStatistic(Statistic, Material) throws IllegalArgumentException
- void decrementStatistic(Statistic, Material, int) throws IllegalArgumentException
- void decrementStatistic(Statistic, EntityType) throws IllegalArgumentException
- void decrementStatistic(Statistic, EntityType, int)
- void setTicksLived(int)
- int _INVALID_getHealth()
- void closeInventory()
- boolean isConversing()
- boolean hasPotionEffect(PotionEffectType)
- boolean getRemoveWhenFarAway()
- int getFireTicks()
- List getNearbyEntities(double, double, double)
- void setVelocity(Vector)
- void setRemoveWhenFarAway(boolean)
- void setResourcePack(String)
- boolean isOp()
- int _INVALID_getLastDamage()
- int getTicksLived()
- InventoryView openEnchanting(Location, boolean)
- void setBedSpawnLocation(Location)
- void setBedSpawnLocation(Location, boolean)
- float getExhaustion()
- void saveData()
- boolean isHealthScaled()
- void setAllowFlight(boolean)
- double getLastDamage()
- boolean performCommand(String)
- boolean hasPlayedBefore()
- void sendMap(MapView)
- long getLastPlayed()
- boolean isCustomNameVisible()
- boolean setWindowProperty(InventoryView$Property, int)
- void setCanPickupItems(boolean)
- boolean getCanPickupItems()
- void setFlySpeed(float) throws IllegalArgumentException
- void setTotalExperience(int)
- void setStatistic(Statistic, int) throws IllegalArgumentException
- void setStatistic(Statistic, Material, int) throws IllegalArgumentException
- void setStatistic(Statistic, EntityType, int)
- void playNote(Location, byte, byte)
- void playNote(Location, Instrument, Note)
- boolean beginConversation(Conversation)
- int getRemainingAir()
- Entity getVehicle()
- long getFirstPlayed()
- void setDisplayName(String)
- boolean isWhitelisted()
- void remove()
- void setCompassTarget(Location)
- InventoryView getOpenInventory()
- Inventory getEnderChest()
- void setNoDamageTicks(int)
- InetSocketAddress getAddress()
- void removeAchievement(Achievement)
- boolean isInsideVehicle()
- boolean setLeashHolder(Entity)
- void setHealth(double)
- void incrementStatistic(Statistic) throws IllegalArgumentException
- void incrementStatistic(Statistic, int) throws IllegalArgumentException
- void incrementStatistic(Statistic, Material) throws IllegalArgumentException
- void incrementStatistic(Statistic, Material, int) throws IllegalArgumentException
- void incrementStatistic(Statistic, EntityType) throws IllegalArgumentException
- void incrementStatistic(Statistic, EntityType, int) throws IllegalArgumentException
- boolean isEmpty()
- boolean isSleeping()
- boolean isPermissionSet(String)
- boolean isPermissionSet(Permission)
- void setItemOnCursor(ItemStack)
- List getLastTwoTargetBlocks(HashSet, int)
- List getLastTwoTargetBlocks(Set, int)
- void giveExpLevels(int)
- Entity getPassenger()
- float getFlySpeed()
- void setLastDamage(double)
- void setExhaustion(float)
- void setWhitelisted(boolean)
- void _INVALID_setMaxHealth(int)
- void acceptConversationInput(String)
- void recalculatePermissions()
- void awardAchievement(Achievement)
- boolean isDead()
- void setLevel(int)
- boolean eject()
- int getMaximumAir()
- void setFlying(boolean)
- Snowball throwSnowball()
- int getMaximumNoDamageTicks()
- void setHealthScale(double) throws IllegalArgumentException
- double getHealth()
- Server getServer()
- Location getEyeLocation()
- void setMaxHealth(double)
- void sendRawMessage(String)
- Entity getLeashHolder() throws IllegalStateException
- void setSpectatorTarget(Entity)
- boolean setPassenger(Entity)
- void showPlayer(Player)
- void giveExp(int)
- Map serialize()
- void setBanned(boolean)
- String getDisplayName()
- void setMaximumAir(int)
- int getFoodLevel()
- void resetTitle()
- int getMaxFireTicks()
- void damage(double)
- void damage(double, Entity)
- double getMaxHealth()
- int getTotalExperience()
- Vector getVelocity()
- float getWalkSpeed()
- void sendTitle(String, String)
- boolean isLeashed()
- float getSaturation()
- double getEyeHeight()
- double getEyeHeight(boolean)
- EntityEquipment getEquipment()
- boolean addPotionEffect(PotionEffect)
- boolean addPotionEffect(PotionEffect, boolean)
- Egg throwEgg()
- void playSound(Location, Sound, float, float)
- void playSound(Location, String, float, float)
- void setSneaking(boolean)
- int getEntityId()
- Scoreboard getScoreboard()
- InventoryView openInventory(Inventory)
- void openInventory(InventoryView)
- boolean addPotionEffects(Collection)
- void setScoreboard(Scoreboard) throws IllegalArgumentException, IllegalStateException
- void setOp(boolean)
- boolean isValid()
- boolean hasMetadata(String)
- int getSleepTicks()
- float getExp()
- int getLevel()
- void kickPlayer(String)
- void chat(String)
- void setSaturation(float)
- Player getPlayer()
- void setFallDistance(float)
- void setCustomName(String)
- void setPlayerListName(String)
- boolean leaveVehicle()
- void setRemainingAir(int)
- String getPlayerListName()
- void setFireTicks(int)
- boolean isSleepingIgnored()
- void hidePlayer(Player)
- int getNoDamageTicks()
- List getMetadata(String)
- Projectile launchProjectile(Class)
- Projectile launchProjectile(Class, Vector)
- List getLineOfSight(HashSet, int)
- List getLineOfSight(Set, int)
- EntityDamageEvent getLastDamageCause()
- Location getBedSpawnLocation()
- int _INVALID_getMaxHealth()
- void setSprinting(boolean)
- Block getTargetBlock(HashSet, int)
- Block getTargetBlock(Set, int)
- int getExpToLevel()
- int getStatistic(Statistic) throws IllegalArgumentException
- int getStatistic(Statistic, Material) throws IllegalArgumentException
- int getStatistic(Statistic, EntityType) throws IllegalArgumentException
- boolean teleport(Location)
- boolean teleport(Location, PlayerTeleportEvent$TeleportCause)
- boolean teleport(Entity)
- boolean teleport(Entity, PlayerTeleportEvent$TeleportCause)
- Entity getSpectatorTarget()
- boolean isOnline()
- void setPlayerWeather(WeatherType)
- void sendSignChange(Location, String[]) throws IllegalArgumentException
- boolean hasLineOfSight(Entity)
- Arrow shootArrow()
- void setCustomNameVisible(boolean)
- void setWalkSpeed(float) throws IllegalArgumentException
- void _INVALID_damage(int)
- void _INVALID_damage(int, Entity)
- void removePotionEffect(PotionEffectType)
- void removeMetadata(String, Plugin)
- Player$Spigot spigot()
- Entity$Spigot spigot()
- void updateInventory()
- Collection getActivePotionEffects()
- void setFoodLevel(int)
- void resetPlayerWeather()

### Class: com.earth2me.essentials.User
Type: Class
Extends: com.earth2me.essentials.UserData
Implements: java.lang.Comparable, com.earth2me.essentials.messaging.IMessageRecipient, net.ess3.api.IUser

Methods:
- void setRecipeSee(boolean)
- void sendMail(MailSender, String)
- void sendMail(MailSender, String, long)
- boolean isFlyClickJump()
- IMessageRecipient getReplyRecipient()
- void checkActivity()
- void setReplyRecipient(IMessageRecipient)
- boolean isLeavingHidden()
- void setLastLocation()
- void setHidden(boolean)
- void healCooldown() throws Exception
- void updateMoneyCache(BigDecimal)
- TriState isAuthorizedExact(String)
- Collection getPendingTpaKeys()
- void setRightClickJump(boolean)
- void setInvSee(boolean)
- boolean inGroup(String)
- ItemStack getItemInHand()
- void sendTl(String, Object[])
- void takeMoney(BigDecimal)
- void takeMoney(BigDecimal, CommandSource)
- void takeMoney(BigDecimal, CommandSource, UserBalanceUpdateEvent$Cause)
- void setMoney(BigDecimal) throws MaxMoneyException
- void setMoney(BigDecimal, UserBalanceUpdateEvent$Cause) throws MaxMoneyException
- Boolean canSpawnItem(Material)
- void notifyOfMail()
- void setAfk(boolean)
- void setAfk(boolean, AfkStatusChangeEvent$Cause)
- List getSignCopy()
- long getAfkSince()
- void setLogoutLocation()
- void setLastOnlineActivity(long)
- void setToggleShout(boolean)
- long getLastVanishTime()
- boolean isSignThrottled()
- Location getAfkPosition()
- void setIgnoreMsg(boolean)
- String getDisplayName()
- String playerTl(String, Object[])
- IUser$TpaRequest getOutstandingTpaRequest(String, boolean)
- void updateActivityOnInteract(boolean)
- boolean canAfford(BigDecimal)
- boolean canAfford(BigDecimal, boolean)
- int getFlightTick()
- String tlSender(String, Object[])
- void setLastHomeConfirmation(String)
- String getFormattedNickname()
- void setFreeze(boolean)
- void resetInvulnerabilityAfterTeleport()
- boolean isEnderSee()
- void setEnderSee(boolean)
- boolean hasPendingTpaRequests(boolean, boolean)
- boolean isGodModeEnabled()
- boolean canInteractVanished()
- boolean isBaltopExempt()
- void updateThrottle()
- String getNick()
- String getNick(boolean)
- String getNick(boolean, boolean, boolean)
- String getNick(boolean, boolean)
- void updateActivityOnChat(boolean)
- void setLeavingHidden(boolean)
- void sendMessage(String)
- IMessageRecipient$MessageResponse sendMessage(IMessageRecipient, String)
- boolean equals(Object)
- void addMail(String)
- void payUser(User, BigDecimal) throws Exception
- void payUser(User, BigDecimal, UserBalanceUpdateEvent$Cause) throws Exception
- String getName()
- boolean checkSignThrottle()
- long getTeleportRequestTime()
- int compareTo(User)
- int compareTo(Object)
- void setLastHomeConfirmationTimestamp()
- void setVanished(boolean)
- boolean isAuthorized(IEssentialsCommand)
- boolean isAuthorized(IEssentialsCommand, String)
- boolean isAuthorized(String)
- UUID getUUID()
- String getConfirmingClearCommand()
- boolean isToggleShout()
- void enableInvulnerabilityAfterTeleport()
- boolean canBuild()
- boolean hasOutstandingTpaRequest(String, boolean)
- void setConfirmingClearCommand(String)
- AsyncTeleport getAsyncTeleport()
- IAsyncTeleport getAsyncTeleport()
- void setFlightTick(int)
- String getAfkMessage()
- String getLastHomeConfirmation()
- IMessageRecipient$MessageResponse onReceiveMessage(IMessageRecipient, String)
- CommandSource getSource()
- String getGroup()
- void dispose()
- Locale getPlayerLocale(String)
- void sendComponent(ComponentLike)
- Block getTargetBlock(int)
- Map getConfirmingPayments()
- boolean isIgnoreExempt()
- boolean isRecipeSee()
- long getLastOnlineActivity()
- void update(Player)
- IUser$TpaRequest removeTpaRequest(String)
- long getLastActivityTime()
- boolean isFreeze()
- void updateActivity(boolean)
- void updateActivity(boolean, AfkStatusChangeEvent$Cause)
- boolean isVanished()
- int hashCode()
- long getLastHomeConfirmationTimestamp()
- boolean toggleAfk()
- boolean toggleAfk(AfkStatusChangeEvent$Cause)
- boolean hasInvulnerabilityAfterTeleport()
- BigDecimal getMoney()
- boolean checkJailTimeout(long)
- void giveMoney(BigDecimal) throws MaxMoneyException
- void giveMoney(BigDecimal, CommandSource) throws MaxMoneyException
- void giveMoney(BigDecimal, CommandSource, UserBalanceUpdateEvent$Cause) throws MaxMoneyException
- boolean isReachable()
- void setDisplayNick()
- void requestTeleport(User, boolean)
- IEssentials getEssentials()
- IUser$TpaRequest getNextTpaRequest(boolean, boolean, boolean)
- boolean isGodModeEnabledRaw()
- boolean isHidden()
- boolean isHidden(Player)
- boolean isPermissionSet(String)
- boolean isIgnoreMsg()
- boolean isInvSee()
- boolean checkMuteTimeout(long)
- String getFormattedJailTime()
- Component tlComponent(String, Object[])
- void updateActivityOnMove(boolean)
- void setAfkMessage(String)
- boolean isHiddenFrom(Player)

### Class: com.earth2me.essentials.UserData
Type: Abstract Class
Extends: com.earth2me.essentials.PlayerExtension
Implements: com.earth2me.essentials.IConf

Methods:
- boolean isLastMessageReplyRecipient()
- void setMails(List)
- boolean isPromptingClearConfirm()
- void setLastLogout(long)
- void setJailed(boolean)
- Location getLogoutLocation()
- boolean hasValidHomes()
- boolean arePowerToolsEnabled()
- ArrayList getMailMessages()
- void setLastLocation(Location)
- void setLastAccountName(String)
- boolean isJailed()
- long getLastLogout()
- boolean isBaltopExcludeCache()
- void setJailTimeout(long)
- boolean hasHome()
- boolean hasHome(String)
- void setNPC(boolean)
- void setMoney(BigDecimal, boolean) throws MaxMoneyException
- UUID getConfigUUID()
- void setKitTimestamp(String, long)
- void addCommandCooldown(Pattern, Date, boolean)
- boolean isSocialSpyEnabled()
- void setHome(String, Location)
- List getMails()
- void setLogoutLocation(Location)
- void _setAfk(boolean)
- List getHomes()
- void setLastTeleportTimestamp(long)
- boolean isPromptingPayConfirm()
- void setNickname(String)
- void reset()
- boolean isIgnoredPlayer(String)
- boolean isIgnoredPlayer(IUser)
- void save()
- void setMuted(boolean)
- boolean toggleJailed()
- void setLastMessageReplyRecipient(boolean)
- void setAutoTeleportEnabled(boolean)
- void setPromptingPayConfirm(boolean)
- boolean clearCommandCooldown(Pattern)
- void clearAllPowertools()
- void setAcceptingPay(boolean)
- long getKitTimestamp(String)
- boolean isGodModeEnabled()
- long getMuteTimeout()
- void setJail(String)
- Location getLastLocation()
- String getGeoLocation()
- void renameHome(String, String) throws Exception
- boolean getMuted()
- long getJailTimeout()
- void setGeoLocation(String)
- void addPastUsername(String)
- void setBaltopExemptCache(boolean)
- void setIgnoredPlayer(IUser, boolean)
- Map getConfigMap()
- Map getConfigMap(String)
- boolean isMuted()
- void setGodModeEnabled(boolean)
- boolean isAutoTeleportEnabled()
- Set getConfigKeys()
- void setLastLogin(long)
- void setPowerToolsEnabled(boolean)
- void setMailList(ArrayList)
- String getJail()
- Map getCommandCooldowns()
- boolean isAfk()
- List _getIgnoredPlayers()
- boolean isNPC()
- long getOnlineJailedTime()
- void setMuteTimeout(long)
- boolean hasUnlimited(ItemStack)
- void setIgnoredPlayers(List)
- boolean isTeleportEnabled()
- void cleanup()
- List getCooldownsList()
- void setShouting(boolean)
- void setPromptingClearConfirm(boolean)
- void setOnlineJailedTime(long)
- Date getCommandCooldownExpiry(String)
- List getPowertool(ItemStack)
- List getPowertool(Material)
- boolean isAcceptingPay()
- void startTransaction()
- void setConfigPropertyRaw(String, Object)
- boolean isShouting()
- boolean togglePowerToolsEnabled()
- void setIgnoredPlayerUUIDs(List)
- void setMuteReason(String)
- long getLastTeleportTimestamp()
- List getPastUsernames()
- void setLastHealTimestamp(long)
- boolean hasPowerTools()
- Location getHome(String)
- Location getHome(Location)
- void delHome(String) throws Exception
- void setUnlimited(ItemStack, boolean)
- void reloadConfig()
- boolean hasMuteReason()
- BigDecimal getMoney()
- long getLastLogin()
- void setConfigProperty(String, Object)
- void stopTransaction()
- Set getUnlimited()
- long getLastHealTimestamp()
- void setTeleportEnabled(boolean)
- String getMuteReason()
- int getMailAmount()
- void setPowertool(ItemStack, List)
- String getLastLoginAddress()
- String getLastAccountName()
- int getUnreadMailAmount()
- String getNickname()
- void setSocialSpyEnabled(boolean)

### Class: com.earth2me.essentials.UserMap
Type: Class

Methods:
- User load(String) throws Exception
- User load(OfflinePlayer) throws UserDoesNotExistException
- int getUniqueUsers()
- void trackUUID(UUID, String, boolean)
- User getUser(String)
- User getUser(UUID)
- Set getAllUniqueUsers()
- UUIDMap getUUIDMap()

### Class: com.earth2me.essentials.Warps
Type: Class
Implements: com.earth2me.essentials.IConf, net.ess3.api.IWarps

Methods:
- void removeWarp(String) throws Exception
- Collection getList()
- void reloadConfig()
- Location getWarp(String) throws WarpNotFoundException
- boolean isWarp(String)
- boolean isEmpty()
- UUID getLastOwner(String) throws WarpNotFoundException
- void setWarp(String, Location) throws Exception
- void setWarp(IUser, String, Location) throws Exception
- File getWarpFile(String) throws InvalidNameException
- int getCount()

### Class: com.earth2me.essentials.Worth
Type: Class
Implements: com.earth2me.essentials.IConf

Methods:
- void reloadConfig()
- void setPrice(IEssentials, ItemStack, double)
- File getFile()
- BigDecimal getPrice(IEssentials, ItemStack)
- int getAmount(IEssentials, User, ItemStack, String[], boolean) throws Exception

## Package: com.earth2me.essentials.api

### Class: com.earth2me.essentials.api.IAsyncTeleport
Type: Interface

Methods:
- void respawn(Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void nowUnsafe(Location, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void teleport(Location, Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void teleport(Player, Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void now(Location, boolean, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void now(Player, boolean, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void back(Trade, CompletableFuture)
- void back(IUser, Trade, CompletableFuture)
- void back(CompletableFuture)
- void teleportPlayer(IUser, Location, Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void teleportPlayer(IUser, Player, Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)
- void warp(IUser, String, Trade, PlayerTeleportEvent$TeleportCause, CompletableFuture)

### Class: com.earth2me.essentials.api.II18n
Type: Interface

Methods:
- Locale getCurrentLocale()

### Class: com.earth2me.essentials.api.IItemDb
Type: Interface

Methods:
- Material getFromLegacyId(int)
- String serialize(ItemStack)
- String names(ItemStack)
- boolean isReady()
- ItemStack get(String, int) throws Exception
- ItemStack get(String) throws Exception
- String name(ItemStack)
- List nameList(ItemStack)
- Collection listNames()
- int getLegacyId(Material) throws Exception
- Material getFromLegacy(String)
- Material getFromLegacy(int, byte)
- List getMatching(User, String[]) throws Exception

### Class: com.earth2me.essentials.api.IJails
Type: Interface
Implements: com.earth2me.essentials.IConf

Methods:
- Location getJail(String) throws Exception
- void startTransaction()
- Collection getList() throws Exception
- void setJail(String, Location) throws Exception
- void removeJail(String) throws Exception
- void sendToJail(IUser, String, CompletableFuture) throws Exception
- int getCount()
- void stopTransaction(boolean)

### Class: com.earth2me.essentials.api.ITeleport
Type: Interface

Methods:
- void respawn(Trade, PlayerTeleportEvent$TeleportCause) throws Exception
- void teleport(Location, Trade) throws Exception
- void teleport(Location, Trade, PlayerTeleportEvent$TeleportCause) throws Exception
- void teleport(Player, Trade, PlayerTeleportEvent$TeleportCause) throws Exception
- void now(Location, boolean, PlayerTeleportEvent$TeleportCause) throws Exception
- void now(Player, boolean, PlayerTeleportEvent$TeleportCause) throws Exception
- void back(Trade) throws Exception
- void back(IUser, Trade) throws Exception
- void back() throws Exception
- void teleportPlayer(IUser, Location, Trade, PlayerTeleportEvent$TeleportCause) throws Exception
- void teleportPlayer(IUser, Player, Trade, PlayerTeleportEvent$TeleportCause) throws Exception
- void warp(IUser, String, Trade, PlayerTeleportEvent$TeleportCause) throws Exception

### Class: com.earth2me.essentials.api.IWarps
Type: Interface
Implements: com.earth2me.essentials.IConf

Methods:
- void removeWarp(String) throws Exception
- Collection getList()
- boolean isEmpty()
- boolean isWarp(String)
- Location getWarp(String) throws WarpNotFoundException
- UUID getLastOwner(String) throws WarpNotFoundException
- void setWarp(String, Location) throws Exception
- void setWarp(IUser, String, Location) throws Exception
- File getWarpFile(String) throws InvalidNameException
- int getCount()

### Class: com.earth2me.essentials.api.Economy
Type: Class

Methods:
- void add(String, double) throws UserDoesNotExistException, NoLoanPermittedException, MaxMoneyException
- void add(String, BigDecimal) throws UserDoesNotExistException, NoLoanPermittedException, ArithmeticException, MaxMoneyException
- void add(UUID, BigDecimal) throws NoLoanPermittedException, ArithmeticException, UserDoesNotExistException, MaxMoneyException
- void add(User, BigDecimal) throws NoLoanPermittedException, ArithmeticException, MaxMoneyException
- boolean isNegative(String) throws UserDoesNotExistException
- boolean isNegative(UUID) throws UserDoesNotExistException
- boolean isNegative(User)
- void setMoney(String, double) throws UserDoesNotExistException, NoLoanPermittedException, MaxMoneyException
- void setMoney(String, BigDecimal) throws UserDoesNotExistException, NoLoanPermittedException, MaxMoneyException
- void setMoney(UUID, BigDecimal) throws NoLoanPermittedException, UserDoesNotExistException, MaxMoneyException
- void setMoney(User, BigDecimal) throws NoLoanPermittedException, MaxMoneyException
- void setEss(IEssentials)
- boolean hasEnough(String, double) throws UserDoesNotExistException
- boolean hasEnough(String, BigDecimal) throws UserDoesNotExistException, ArithmeticException
- boolean hasEnough(UUID, BigDecimal) throws ArithmeticException, UserDoesNotExistException
- boolean hasEnough(User, BigDecimal) throws ArithmeticException
- void subtract(String, double) throws UserDoesNotExistException, NoLoanPermittedException, MaxMoneyException
- void subtract(UUID, BigDecimal) throws NoLoanPermittedException, ArithmeticException, UserDoesNotExistException, MaxMoneyException
- void subtract(User, BigDecimal) throws NoLoanPermittedException, ArithmeticException, MaxMoneyException
- String format(double)
- String format(BigDecimal)
- boolean hasMore(String, double) throws UserDoesNotExistException
- boolean hasMore(String, BigDecimal) throws UserDoesNotExistException, ArithmeticException
- boolean hasMore(UUID, BigDecimal) throws ArithmeticException, UserDoesNotExistException
- boolean hasMore(User, BigDecimal) throws ArithmeticException
- boolean isNPC(String) throws UserDoesNotExistException
- boolean createNPC(String)
- void resetBalance(String) throws UserDoesNotExistException, NoLoanPermittedException, MaxMoneyException
- void resetBalance(UUID) throws NoLoanPermittedException, UserDoesNotExistException, MaxMoneyException
- void resetBalance(User) throws NoLoanPermittedException, MaxMoneyException
- void removeNPC(String) throws UserDoesNotExistException
- BigDecimal getMoneyExact(String) throws UserDoesNotExistException
- BigDecimal getMoneyExact(UUID) throws UserDoesNotExistException
- BigDecimal getMoneyExact(User)
- boolean playerExists(String)
- boolean playerExists(UUID)
- boolean hasLess(String, double) throws UserDoesNotExistException
- boolean hasLess(String, BigDecimal) throws UserDoesNotExistException, ArithmeticException
- boolean hasLess(UUID, BigDecimal) throws ArithmeticException, UserDoesNotExistException
- boolean hasLess(User, BigDecimal) throws ArithmeticException
- void divide(String, double) throws UserDoesNotExistException, NoLoanPermittedException, MaxMoneyException
- void divide(String, BigDecimal) throws UserDoesNotExistException, NoLoanPermittedException, ArithmeticException, MaxMoneyException
- void divide(UUID, BigDecimal) throws NoLoanPermittedException, ArithmeticException, UserDoesNotExistException, MaxMoneyException
- void divide(User, BigDecimal) throws NoLoanPermittedException, ArithmeticException, MaxMoneyException
- double getMoney(String) throws UserDoesNotExistException
- void multiply(String, double) throws UserDoesNotExistException, NoLoanPermittedException, MaxMoneyException
- void multiply(String, BigDecimal) throws UserDoesNotExistException, NoLoanPermittedException, ArithmeticException, MaxMoneyException
- void multiply(UUID, BigDecimal) throws NoLoanPermittedException, ArithmeticException, UserDoesNotExistException, MaxMoneyException
- void multiply(User, BigDecimal) throws NoLoanPermittedException, ArithmeticException, MaxMoneyException
- void substract(String, BigDecimal) throws UserDoesNotExistException, NoLoanPermittedException, ArithmeticException, MaxMoneyException

### Class: com.earth2me.essentials.api.InvalidNameException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.earth2me.essentials.api.InvalidWorldException
Type: Class
Extends: net.ess3.api.TranslatableException

Methods:
- String getWorld()

### Class: com.earth2me.essentials.api.NoLoanPermittedException
Type: Class
Extends: net.ess3.api.NoLoanPermittedException

No public methods found

### Class: com.earth2me.essentials.api.UserDoesNotExistException
Type: Class
Extends: net.ess3.api.TranslatableException

No public methods found

## Package: com.earth2me.essentials.commands

### Class: com.earth2me.essentials.commands.IEssentialsCommand
Type: Interface

Methods:
- String getName()
- void showError(CommandSender, Throwable, String)
- void setEssentialsModule(IEssentialsModule)
- void setEssentials(IEssentials)
- Map getUsageStrings()
- List tabComplete(Server, User, String, Command, String[])
- List tabComplete(Server, CommandSource, String, Command, String[])
- void run(Server, User, String, Command, String[]) throws Exception
- void run(Server, CommandSource, String, Command, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandafk
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandantioch
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandanvil
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandback
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandbackup
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandbalance
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandbalancetop
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandban
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandbanip
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandbeezooka
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandbigtree
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandbook
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandbottom
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandbreak
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandbroadcast
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandbroadcastworld
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandburn
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandcartographytable
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandclearinventory
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandclearinventoryconfirmtoggle
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandcompass
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandcondense
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandcreatekit
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandcustomtext
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commanddelhome
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commanddeljail
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commanddelkit
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commanddelwarp
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commanddepth
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commanddisposal
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandeco
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandeditsign
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandenchant
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandenderchest
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandessentials
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void runItemTest(Server, CommandSource, String, String[])
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandexp
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandext
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandfeed
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandfireball
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandfirework
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandfly
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsToggleCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandgamemode
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandgc
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandgetpos
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandgive
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandgod
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsToggleCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandgrindstone
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandhat
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandheal
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandhelp
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandhelpop
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandhome
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandice
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandignore
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandinfo
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandinvsee
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commanditem
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commanditemdb
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commanditemlore
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commanditemname
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandjails
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandjump
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandkick
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandkickall
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandkill
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandkit
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandkitreset
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandkittycannon
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandlightning
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandlist
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandloom
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandmail
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandme
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandmore
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandmotd
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandmsg
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandmsgtoggle
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsToggleCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandmute
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandnear
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandnick
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandnuke
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandpay
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandpayconfirmtoggle
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandpaytoggle
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsToggleCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandping
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandplaytime
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandpotion
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandpowertool
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandpowertooltoggle
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandptime
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void getUserTime(CommandSource, IUser)
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandpweather
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandr
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandrealname
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandrecipe
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void shapelessRecipe(CommandSource, ShapelessRecipe, boolean)
- void furnaceRecipe(CommandSource, FurnaceRecipe)
- void shapedRecipe(CommandSource, ShapedRecipe, boolean)
- void run(Server, CommandSource, String, String[]) throws Exception
- String getMaterialName(CommandSource, ItemStack)
- String getMaterialName(CommandSource, Material)

### Class: com.earth2me.essentials.commands.Commandremove
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandrenamehome
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandrepair
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void repairHand(User) throws Exception
- void repairAll(User) throws Exception
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandrest
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandrtoggle
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsToggleCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandrules
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandseen
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandsell
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandsethome
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandsetjail
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandsettpr
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandsetwarp
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandsetworth
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandshowkit
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandskull
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandsmithingtable
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandsocialspy
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsToggleCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandspawner
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandspawnmob
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandspeed
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandstonecutter
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandsudo
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsLoopCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandsuicide
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtempban
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtempbanip
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandthunder
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtime
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtogglejail
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtop
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtp
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtpa
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtpaall
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtpacancel
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- boolean cancelTeleportRequest(User, User)
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtpaccept
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtpahere
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtpall
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtpauto
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsToggleCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandtpdeny
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtphere
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtpo
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtpoffline
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtpohere
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtppos
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandtpr
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandtptoggle
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsToggleCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandtree
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandunban
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandunbanip
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandunlimited
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandvanish
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsToggleCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandwarp
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandwarpinfo
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandweather
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandwhois
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandworkbench
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.Commandworld
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.Commandworth
Type: Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

Methods:
- void run(Server, User, String, String[]) throws Exception
- void run(Server, CommandSource, String, String[]) throws Exception

### Class: com.earth2me.essentials.commands.EssentialsCommand
Type: Abstract Class
Implements: com.earth2me.essentials.commands.IEssentialsCommand

Methods:
- CompletableFuture getNewExceptionFuture(CommandSource, String)
- String getName()
- void showError(CommandSender, Throwable, String)
- void setEssentialsModule(IEssentialsModule)
- void setEssentials(IEssentials)
- Map getUsageStrings()
- List tabComplete(Server, User, String, Command, String[])
- List tabComplete(Server, CommandSource, String, Command, String[])
- String getFinalArg(String[], int)
- void run(Server, User, String, Command, String[]) throws Exception
- void run(Server, CommandSource, String, Command, String[]) throws Exception

### Class: com.earth2me.essentials.commands.EssentialsLoopCommand
Type: Abstract Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.EssentialsToggleCommand
Type: Abstract Class
Extends: com.earth2me.essentials.commands.EssentialsCommand

No public methods found

### Class: com.earth2me.essentials.commands.InvalidModifierException
Type: Class
Extends: net.ess3.api.TranslatableException

No public methods found

### Class: com.earth2me.essentials.commands.NoChargeException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.earth2me.essentials.commands.NotEnoughArgumentsException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.earth2me.essentials.commands.PlayerExemptException
Type: Class
Extends: net.ess3.api.TranslatableException

No public methods found

### Class: com.earth2me.essentials.commands.PlayerNotFoundException
Type: Class
Extends: net.ess3.api.TranslatableException

No public methods found

### Class: com.earth2me.essentials.commands.QuietAbortException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.earth2me.essentials.commands.WarpNotFoundException
Type: Class
Extends: net.ess3.api.TranslatableException

No public methods found

## Package: com.earth2me.essentials.config

### Class: com.earth2me.essentials.config.ConfigurateUtil
Type: Class

Methods:
- Set getRootNodeKeys(EssentialsConfiguration)
- Map getRawMap(EssentialsConfiguration, String)
- Map getRawMap(CommentedConfigurationNode)
- boolean isInt(CommentedConfigurationNode)
- boolean isString(CommentedConfigurationNode)
- BigDecimal toBigDecimal(String, BigDecimal)
- Set getKeys(CommentedConfigurationNode)
- List getMapList(CommentedConfigurationNode)
- Map getMap(CommentedConfigurationNode)
- boolean isDouble(CommentedConfigurationNode)

### Class: com.earth2me.essentials.config.ConfigurationSaveTask
Type: Class
Implements: java.lang.Runnable

Methods:
- void run()

### Class: com.earth2me.essentials.config.EssentialsConfiguration
Type: Class

Methods:
- void setSaveHook(Runnable)
- boolean isTransaction()
- void startTransaction()
- LazyLocation getLocation(String)
- void convertAltFile()
- void convertLegacyFile()
- CommentedConfigurationNode newSection()
- void save()
- BigDecimal getBigDecimal(String, BigDecimal)
- double getDouble(String, double)
- float getFloat(String, float)
- void blockingSave()
- boolean isList(String)
- File getFile()
- boolean isBoolean(String)
- CommentedConfigurationNode getSection(String)
- void load()
- Map getLocationSectionMap(String)
- List getList(String, Class)
- void setRootHolder(Class, Object)
- Object get(String)
- boolean getBoolean(String, boolean)
- void stopTransaction()
- void stopTransaction(boolean)
- CommentedConfigurationNode getRootNode()
- void setRaw(String, Object)
- CommentedConfigurationNode toSplitRoot(String, CommentedConfigurationNode)
- void setExplicitList(String, List, Type)
- Set getKeys()
- String getString(String, String)
- boolean legacyFileExists()
- boolean hasProperty(String)
- Map getMap()
- long getLong(String, long)
- Map getStringMap(String)
- int getInt(String, int)
- void setProperty(String, Location)
- void setProperty(String, List)
- void setProperty(String, String)
- void setProperty(String, boolean)
- void setProperty(String, long)
- void setProperty(String, int)
- void setProperty(String, double)
- void setProperty(String, float)
- void setProperty(String, BigDecimal)
- boolean altFileExists()
- void removeProperty(String)

### Class: com.earth2me.essentials.config.EssentialsUserConfiguration
Type: Class
Extends: com.earth2me.essentials.config.EssentialsConfiguration

Methods:
- void setUsername(String)
- void convertAltFile()
- void convertLegacyFile()
- UUID getUuid()
- boolean altFileExists()
- boolean legacyFileExists()
- String getUsername()

## Package: com.earth2me.essentials.config.annotations

### Class: com.earth2me.essentials.config.annotations.DeleteIfIncomplete
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.earth2me.essentials.config.annotations.DeleteOnEmpty
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

## Package: com.earth2me.essentials.config.entities

### Class: com.earth2me.essentials.config.entities.CommandCooldown
Type: Class
Implements: com.earth2me.essentials.config.processors.DeleteIfIncompleteProcessor$IncompleteEntity

Methods:
- Pattern pattern()
- void pattern(Pattern)
- Long value()
- void value(Long)
- boolean isIncomplete()

### Class: com.earth2me.essentials.config.entities.LazyLocation
Type: Class

Methods:
- String world()
- String worldName()
- double x()
- double y()
- Location location()
- double z()
- LazyLocation fromLocation(Location)
- float pitch()
- float yaw()

## Package: com.earth2me.essentials.config.holders

### Class: com.earth2me.essentials.config.holders.UserConfigHolder
Type: Class

Methods:
- ArrayList mail()
- void mail(ArrayList)
- UserConfigHolder$Timestamps timestamps()
- boolean acceptingPay()
- void acceptingPay(boolean)
- boolean powerToolsEnabled()
- void powerToolsEnabled(boolean)
- boolean godMode()
- void godMode(boolean)
- boolean socialSpy()
- void socialSpy(boolean)
- boolean jailed()
- void jailed(boolean)
- Map powertools()
- String nickname()
- void nickname(String)
- Boolean confirmClear()
- void confirmClear(Boolean)
- List ignore()
- void ignore(List)
- Map homes()
- void homes(Map)
- boolean muted()
- void muted(boolean)
- Boolean lastMessageReplyRecipient()
- void lastMessageReplyRecipient(Boolean)
- String lastAccountName()
- void lastAccountName(String)
- LazyLocation logoutLocation()
- void logoutLocation(Location)
- boolean npc()
- void npc(boolean)
- Set unlimited()
- boolean afk()
- void afk(boolean)
- String npcName()
- void npcName(String)
- String ipAddress()
- void ipAddress(String)
- LazyLocation lastLocation()
- void lastLocation(Location)
- Boolean shouting()
- void shouting(Boolean)
- String muteReason()
- void muteReason(String)
- boolean baltopExempt()
- void baltopExempt(boolean)
- String jail()
- void jail(String)
- boolean teleportAuto()
- void teleportAuto(boolean)
- boolean teleportEnabled()
- void teleportEnabled(boolean)
- List pastUsernames()
- void pastUsernames(List)
- BigDecimal money()
- void money(BigDecimal)
- Boolean confirmPay()
- void confirmPay(Boolean)
- String geolocation()
- void geolocation(String)

## Package: com.earth2me.essentials.config.processors

### Class: com.earth2me.essentials.config.processors.DeleteIfIncompleteProcessor
Type: Class
Implements: com.earth2me.essentials.libs.configurate.objectmapping.meta.Processor

Methods:
- void process(Object, ConfigurationNode)

### Class: com.earth2me.essentials.config.processors.DeleteOnEmptyProcessor
Type: Class
Implements: com.earth2me.essentials.libs.configurate.objectmapping.meta.Processor

Methods:
- void process(Object, ConfigurationNode)

## Package: com.earth2me.essentials.config.serializers

### Class: com.earth2me.essentials.config.serializers.BigDecimalTypeSerializer
Type: Class
Extends: com.earth2me.essentials.libs.configurate.serialize.ScalarSerializer

Methods:
- BigDecimal deserialize(Type, Object) throws SerializationException
- Object deserialize(Type, Object) throws SerializationException

### Class: com.earth2me.essentials.config.serializers.CommandCooldownSerializer
Type: Class
Implements: com.earth2me.essentials.libs.configurate.serialize.TypeSerializer

Methods:
- void serialize(Type, CommandCooldown, ConfigurationNode) throws SerializationException
- void serialize(Type, Object, ConfigurationNode) throws SerializationException
- CommandCooldown deserialize(Type, ConfigurationNode) throws SerializationException
- Object deserialize(Type, ConfigurationNode) throws SerializationException

### Class: com.earth2me.essentials.config.serializers.LocationTypeSerializer
Type: Class
Implements: com.earth2me.essentials.libs.configurate.serialize.TypeSerializer

Methods:
- void serialize(Type, LazyLocation, ConfigurationNode) throws SerializationException
- void serialize(Type, Object, ConfigurationNode) throws SerializationException
- LazyLocation deserialize(Type, ConfigurationNode) throws SerializationException
- Object deserialize(Type, ConfigurationNode) throws SerializationException

### Class: com.earth2me.essentials.config.serializers.MailMessageSerializer
Type: Class
Implements: com.earth2me.essentials.libs.configurate.serialize.TypeSerializer

Methods:
- void serialize(Type, MailMessage, ConfigurationNode) throws SerializationException
- void serialize(Type, Object, ConfigurationNode) throws SerializationException
- MailMessage deserialize(Type, ConfigurationNode) throws SerializationException
- Object deserialize(Type, ConfigurationNode) throws SerializationException

### Class: com.earth2me.essentials.config.serializers.MaterialTypeSerializer
Type: Class
Extends: com.earth2me.essentials.libs.configurate.serialize.ScalarSerializer

Methods:
- Material deserialize(Type, Object) throws SerializationException
- Object deserialize(Type, Object) throws SerializationException

## Package: com.earth2me.essentials.craftbukkit

### Class: com.earth2me.essentials.craftbukkit.BanLookup
Type: Class

Methods:
- BanEntry getBanEntry(IEssentials, String)
- Boolean isBanned(IEssentials, User)
- Boolean isBanned(IEssentials, String)

### Class: com.earth2me.essentials.craftbukkit.Inventories
Type: Class

Methods:
- ItemStack getItemInMainHand(Player)
- void setItemInMainHand(Player, ItemStack)
- void setItemInMainHand(EntityEquipment, ItemStack)
- void setSlot(Player, int, ItemStack)
- int removeItemSimilar(Player, ItemStack, boolean)
- Map addItem(Player, ItemStack[])
- Map addItem(Player, int, ItemStack[])
- Map addItem(Player, int, boolean, ItemStack[])
- void setItemInMainHandDropChance(EntityEquipment, float)
- void clearSlot(Player, int)
- boolean hasSpace(Player, int, boolean, ItemStack[])
- int removeItems(Player, Predicate, boolean)
- void removeItemExact(Player, ItemStack, boolean)
- ItemStack[] getInventory(Player, boolean)
- boolean containsAtLeast(Player, ItemStack, int)
- boolean removeItemAmount(Player, ItemStack, int)
- ItemStack getItemInHand(Player)

### Class: com.earth2me.essentials.craftbukkit.InventoryData
Type: Class

Methods:
- HashMap getPartialSlots()
- List getEmptySlots()

### Class: com.earth2me.essentials.craftbukkit.SetExpFix
Type: Class

Methods:
- int getTotalExperience(Player)
- int getExpToLevel(int)
- int getExpUntilNextLevel(Player)
- int getExpAtLevel(int)
- void setTotalExperience(Player, int)

## Package: com.earth2me.essentials.economy

### Class: com.earth2me.essentials.economy.EconomyLayer
Type: Interface

Methods:
- String getBackendName()
- boolean set(OfflinePlayer, BigDecimal)
- BigDecimal getBalance(OfflinePlayer)
- String getName()
- boolean createPlayerAccount(OfflinePlayer)
- boolean hasAccount(OfflinePlayer)
- void disable()
- void enable(Plugin)
- String getPluginVersion()
- String getPluginName()
- boolean deposit(OfflinePlayer, BigDecimal)
- boolean onServerLoad()
- boolean withdraw(OfflinePlayer, BigDecimal)

### Class: com.earth2me.essentials.economy.EconomyLayers
Type: Class

Methods:
- void init()
- boolean isLayerSelected()
- EconomyLayer onPluginEnable(Plugin)
- boolean isServerStarted()
- boolean onPluginDisable(Plugin)
- void onEnable(Essentials)
- void onServerLoad()
- void registerLayer(EconomyLayer)
- EconomyLayer getSelectedLayer()

## Package: com.earth2me.essentials.economy.layers

### Class: com.earth2me.essentials.economy.layers.VaultLayer
Type: Class
Implements: com.earth2me.essentials.economy.EconomyLayer

Methods:
- String getBackendName()
- String getName()
- BigDecimal getBalance(OfflinePlayer)
- boolean createPlayerAccount(OfflinePlayer)
- boolean hasAccount(OfflinePlayer)
- void disable()
- void enable(Plugin)
- String getPluginVersion()
- String getPluginName()
- boolean deposit(OfflinePlayer, BigDecimal)
- boolean onServerLoad()
- boolean withdraw(OfflinePlayer, BigDecimal)

## Package: com.earth2me.essentials.economy.vault

### Class: com.earth2me.essentials.economy.vault.VaultEconomyProvider
Type: Class
Implements: net.milkbowl.vault.economy.Economy

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String)
- String getName()
- boolean hasAccount(String)
- boolean hasAccount(OfflinePlayer)
- boolean hasAccount(String, String)
- boolean hasAccount(OfflinePlayer, String)
- EconomyResponse depositPlayer(String, double)
- EconomyResponse depositPlayer(OfflinePlayer, double)
- EconomyResponse depositPlayer(String, String, double)
- EconomyResponse depositPlayer(OfflinePlayer, String, double)
- EconomyResponse bankBalance(String)
- EconomyResponse bankDeposit(String, double)
- EconomyResponse bankWithdraw(String, double)
- String format(double)
- EconomyResponse withdrawPlayer(String, double)
- EconomyResponse withdrawPlayer(OfflinePlayer, double)
- EconomyResponse withdrawPlayer(String, String, double)
- EconomyResponse withdrawPlayer(OfflinePlayer, String, double)
- EconomyResponse createBank(String, String)
- EconomyResponse createBank(String, OfflinePlayer)
- List getBanks()
- double getBalance(String)
- double getBalance(OfflinePlayer)
- double getBalance(String, String)
- double getBalance(OfflinePlayer, String)
- boolean createPlayerAccount(String)
- boolean createPlayerAccount(OfflinePlayer)
- boolean createPlayerAccount(String, String)
- boolean createPlayerAccount(OfflinePlayer, String)
- EconomyResponse bankHas(String, double)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String, String)
- EconomyResponse isBankMember(String, OfflinePlayer)
- int fractionalDigits()
- EconomyResponse isBankOwner(String, String)
- EconomyResponse isBankOwner(String, OfflinePlayer)
- boolean has(String, double)
- boolean has(OfflinePlayer, double)
- boolean has(String, String, double)
- boolean has(OfflinePlayer, String, double)
- boolean hasBankSupport()

## Package: com.earth2me.essentials.items

### Class: com.earth2me.essentials.items.AbstractItemDb
Type: Abstract Class
Implements: com.earth2me.essentials.IConf, net.ess3.api.IItemDb

Methods:
- String serialize(ItemStack)
- String serialize(ItemStack, boolean)
- boolean isResolverPresent(Plugin, String)
- boolean isReady()
- ItemStack get(String) throws Exception
- Map getResolvers()
- Map getResolvers(Plugin)
- void registerResolver(Plugin, String, IItemDb$ItemResolver) throws Exception
- IItemDb$ItemResolver getResolver(Plugin, String)
- void unregisterResolver(Plugin, String) throws Exception
- List getMatching(User, String[]) throws Exception

### Class: com.earth2me.essentials.items.CustomItemResolver
Type: Class
Implements: net.ess3.api.IItemDb$ItemResolver, com.earth2me.essentials.IConf

Methods:
- ItemStack apply(String)
- Object apply(Object)
- void reloadConfig()
- void removeAlias(String)
- void setAlias(String, String)
- Collection getNames()
- List getAliasesFor(String) throws Exception

### Class: com.earth2me.essentials.items.FlatItemDb
Type: Class
Extends: com.earth2me.essentials.items.AbstractItemDb

Methods:
- ItemStack get(String, boolean) throws Exception
- String name(ItemStack)
- List nameList(ItemStack)
- void reloadConfig()
- Collection listNames()
- int getLegacyId(Material)

### Class: com.earth2me.essentials.items.LegacyItemDb
Type: Class
Extends: com.earth2me.essentials.items.AbstractItemDb

Methods:
- ItemStack get(String, boolean) throws Exception
- String name(ItemStack)
- List nameList(ItemStack)
- void reloadConfig()
- Collection listNames()
- int getLegacyId(Material) throws Exception

## Package: com.earth2me.essentials.libs.bstats

### Class: com.earth2me.essentials.libs.bstats.MetricsBase
Type: Class

Methods:
- void addCustomChart(CustomChart)

## Package: com.earth2me.essentials.libs.bstats.bukkit

### Class: com.earth2me.essentials.libs.bstats.bukkit.Metrics
Type: Class

Methods:
- void addCustomChart(CustomChart)

## Package: com.earth2me.essentials.libs.bstats.charts

### Class: com.earth2me.essentials.libs.bstats.charts.AdvancedBarChart
Type: Class
Extends: com.earth2me.essentials.libs.bstats.charts.CustomChart

No public methods found

### Class: com.earth2me.essentials.libs.bstats.charts.AdvancedPie
Type: Class
Extends: com.earth2me.essentials.libs.bstats.charts.CustomChart

No public methods found

### Class: com.earth2me.essentials.libs.bstats.charts.CustomChart
Type: Abstract Class

Methods:
- JsonObjectBuilder$JsonObject getRequestJsonObject(BiConsumer, boolean)

### Class: com.earth2me.essentials.libs.bstats.charts.DrilldownPie
Type: Class
Extends: com.earth2me.essentials.libs.bstats.charts.CustomChart

Methods:
- JsonObjectBuilder$JsonObject getChartData() throws Exception

### Class: com.earth2me.essentials.libs.bstats.charts.MultiLineChart
Type: Class
Extends: com.earth2me.essentials.libs.bstats.charts.CustomChart

No public methods found

### Class: com.earth2me.essentials.libs.bstats.charts.SimpleBarChart
Type: Class
Extends: com.earth2me.essentials.libs.bstats.charts.CustomChart

No public methods found

### Class: com.earth2me.essentials.libs.bstats.charts.SimplePie
Type: Class
Extends: com.earth2me.essentials.libs.bstats.charts.CustomChart

No public methods found

### Class: com.earth2me.essentials.libs.bstats.charts.SingleLineChart
Type: Class
Extends: com.earth2me.essentials.libs.bstats.charts.CustomChart

No public methods found

## Package: com.earth2me.essentials.libs.bstats.config

### Class: com.earth2me.essentials.libs.bstats.config.MetricsConfig
Type: Class

Methods:
- boolean isLogResponseStatusTextEnabled()
- boolean isLogSentDataEnabled()
- boolean didExistBefore()
- boolean isEnabled()
- boolean isLogErrorsEnabled()
- String getServerUUID()

## Package: com.earth2me.essentials.libs.bstats.json

### Class: com.earth2me.essentials.libs.bstats.json.JsonObjectBuilder
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

## Package: com.earth2me.essentials.libs.checkerframework.checker.nullness.qual

### Class: com.earth2me.essentials.libs.checkerframework.checker.nullness.qual.MonotonicNonNull
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.earth2me.essentials.libs.checkerframework.checker.nullness.qual.NonNull
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.earth2me.essentials.libs.checkerframework.checker.nullness.qual.Nullable
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

## Package: com.earth2me.essentials.libs.checkerframework.framework.qual

### Class: com.earth2me.essentials.libs.checkerframework.framework.qual.DefaultFor
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class[] types()
- String[] names()
- TypeKind[] typeKinds()
- String[] namesExceptions()
- TypeUseLocation[] value()

### Class: com.earth2me.essentials.libs.checkerframework.framework.qual.DefaultQualifierInHierarchy
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.earth2me.essentials.libs.checkerframework.framework.qual.MonotonicQualifier
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class value()

### Class: com.earth2me.essentials.libs.checkerframework.framework.qual.QualifierForLiterals
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] stringPatterns()
- LiteralKind[] value()

### Class: com.earth2me.essentials.libs.checkerframework.framework.qual.SubtypeOf
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class[] value()

### Class: com.earth2me.essentials.libs.checkerframework.framework.qual.UpperBoundFor
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class[] types()
- TypeKind[] typeKinds()

### Class: com.earth2me.essentials.libs.checkerframework.framework.qual.LiteralKind
Type: Enum
Extends: java.lang.Enum

Methods:
- LiteralKind valueOf(String)
- LiteralKind[] values()
- List primitiveLiteralKinds()
- List allLiteralKinds()

### Class: com.earth2me.essentials.libs.checkerframework.framework.qual.TypeKind
Type: Enum
Extends: java.lang.Enum

Methods:
- TypeKind valueOf(String)
- TypeKind[] values()

### Class: com.earth2me.essentials.libs.checkerframework.framework.qual.TypeUseLocation
Type: Enum
Extends: java.lang.Enum

Methods:
- TypeUseLocation valueOf(String)
- TypeUseLocation[] values()

## Package: com.earth2me.essentials.libs.configurate

### Class: com.earth2me.essentials.libs.configurate.AttributedConfigurationNode
Type: Interface
Implements: com.earth2me.essentials.libs.configurate.CommentedConfigurationNodeIntermediary

Methods:
- ConfigurationNodeFactory factory()
- AttributedConfigurationNode addAttribute(String, String)
- boolean hasAttributes()
- AttributedConfigurationNode root()
- AttributedConfigurationNode root(CheckedConsumer) throws Exception
- AttributedConfigurationNode root(String)
- AttributedConfigurationNode root(String, CheckedConsumer) throws Exception
- AttributedConfigurationNode root(String, ConfigurationOptions)
- AttributedConfigurationNode root(String, ConfigurationOptions, CheckedConsumer) throws Exception
- AttributedConfigurationNode attributes(Map)
- Map attributes()
- String attribute(String)
- AttributedConfigurationNode removeAttribute(String)
- String tagName()
- AttributedConfigurationNode tagName(String)

### Class: com.earth2me.essentials.libs.configurate.BasicConfigurationNode
Type: Interface
Implements: com.earth2me.essentials.libs.configurate.ScopedConfigurationNode

Methods:
- ConfigurationNodeFactory factory()
- BasicConfigurationNode root()
- BasicConfigurationNode root(CheckedConsumer) throws Exception
- BasicConfigurationNode root(ConfigurationOptions)
- BasicConfigurationNode root(ConfigurationOptions, CheckedConsumer) throws Exception

### Class: com.earth2me.essentials.libs.configurate.CommentedConfigurationNode
Type: Interface
Implements: com.earth2me.essentials.libs.configurate.CommentedConfigurationNodeIntermediary

Methods:
- ConfigurationNodeFactory factory()
- CommentedConfigurationNode root()
- CommentedConfigurationNode root(CheckedConsumer) throws Exception
- CommentedConfigurationNode root(ConfigurationOptions)
- CommentedConfigurationNode root(ConfigurationOptions, CheckedConsumer) throws Exception

### Class: com.earth2me.essentials.libs.configurate.CommentedConfigurationNodeIntermediary
Type: Interface
Implements: com.earth2me.essentials.libs.configurate.ScopedConfigurationNode

Methods:
- CommentedConfigurationNodeIntermediary commentIfAbsent(String)
- String comment()
- CommentedConfigurationNodeIntermediary comment(String)

### Class: com.earth2me.essentials.libs.configurate.ConfigurationNode
Type: Interface

Methods:
- ConfigurationNode parent()
- boolean virtual()
- Collector toListCollector(TypeToken)
- Collector toListCollector(Class)
- boolean removeChild(Object)
- double getDouble()
- double getDouble(double)
- float getFloat()
- float getFloat(float)
- Map childrenMap()
- boolean isList()
- boolean empty()
- Collector toMapCollector(TypeToken)
- Collector toMapCollector(Class)
- NodePath path()
- List getList(TypeToken) throws SerializationException
- List getList(TypeToken, List) throws SerializationException
- List getList(TypeToken, Supplier) throws SerializationException
- List getList(Class) throws SerializationException
- List getList(Class, List) throws SerializationException
- List getList(Class, Supplier) throws SerializationException
- Object get(TypeToken) throws SerializationException
- Object get(TypeToken, Object) throws SerializationException
- Object get(TypeToken, Supplier) throws SerializationException
- Object get(Class) throws SerializationException
- Object get(Class, Object) throws SerializationException
- Object get(Class, Supplier) throws SerializationException
- Object get(AnnotatedType) throws SerializationException
- Object get(AnnotatedType, Object) throws SerializationException
- Object get(AnnotatedType, Supplier) throws SerializationException
- Object get(Type) throws SerializationException
- Object get(Type, Object) throws SerializationException
- Object get(Type, Supplier) throws SerializationException
- ConfigurationOptions options()
- ConfigurationNode from(ConfigurationNode)
- boolean getBoolean()
- boolean getBoolean(boolean)
- ConfigurationNode copy()
- List childrenList()
- Object key()
- ConfigurationNode appendListNode()
- Object rawScalar()
- Map ownHints()
- ConfigurationNode set(Object) throws SerializationException
- ConfigurationNode set(TypeToken, Object) throws SerializationException
- ConfigurationNode set(Class, Object) throws SerializationException
- ConfigurationNode set(Type, Object) throws SerializationException
- ConfigurationNode set(AnnotatedType, Object) throws SerializationException
- Object raw()
- ConfigurationNode raw(Object)
- Object require(TypeToken) throws SerializationException
- Object require(Class) throws SerializationException
- Object require(Type) throws SerializationException
- String getString()
- String getString(String)
- ConfigurationNode setList(Class, List) throws SerializationException
- ConfigurationNode setList(TypeToken, List) throws SerializationException
- boolean isMap()
- long getLong()
- long getLong(long)
- int getInt()
- int getInt(int)
- ConfigurationNode node(Object[])
- ConfigurationNode node(Iterable)
- ConfigurationNode mergeFrom(ConfigurationNode)
- ConfigurationNode hint(RepresentationHint, Object)
- Object hint(RepresentationHint)
- boolean isNull()
- boolean hasChild(Object[])
- boolean hasChild(Iterable)
- Object ownHint(RepresentationHint)
- Object visit(ConfigurationVisitor) throws Exception
- Object visit(ConfigurationVisitor, Object) throws Exception
- Object visit(ConfigurationVisitor$Safe)
- Object visit(ConfigurationVisitor$Safe, Object)

### Class: com.earth2me.essentials.libs.configurate.ConfigurationNodeFactory
Type: Interface

Methods:
- Collector toMapCollector(TypeToken)
- Collector toMapCollector(Class)
- Collector toListCollector(TypeToken)
- Collector toListCollector(Class)
- ConfigurationNode createNode(ConfigurationOptions)
- ConfigurationNode createNode()
- ConfigurationNode createNode(CheckedConsumer) throws Exception
- ConfigurationNode createNode(ConfigurationOptions, CheckedConsumer) throws Exception
- ConfigurationOptions defaultOptions()

### Class: com.earth2me.essentials.libs.configurate.ConfigurationVisitor
Type: Interface

Methods:
- void enterNode(ConfigurationNode, Object) throws Exception
- void enterScalarNode(ConfigurationNode, Object) throws Exception
- void beginVisit(ConfigurationNode, Object) throws Exception
- Object endVisit(Object) throws Exception
- void exitListNode(ConfigurationNode, Object) throws Exception
- void exitMappingNode(ConfigurationNode, Object) throws Exception
- void enterMappingNode(ConfigurationNode, Object) throws Exception
- Object newState() throws Exception
- void enterListNode(ConfigurationNode, Object) throws Exception

### Class: com.earth2me.essentials.libs.configurate.NodePath
Type: Interface
Implements: java.lang.Iterable

Methods:
- NodePath withAppendedChild(Object)
- NodePath with(int, Object) throws IndexOutOfBoundsException
- NodePath path(Object[])
- NodePath path()
- Iterator iterator()
- int size()
- Object[] array()
- Object get(int)
- NodePath of(Object[])
- NodePath of(Collection)
- NodePath copy()
- NodePath plus(NodePath)

### Class: com.earth2me.essentials.libs.configurate.ScopedConfigurationNode
Type: Interface
Implements: com.earth2me.essentials.libs.configurate.ConfigurationNode

Methods:
- ScopedConfigurationNode parent()
- ConfigurationNode parent()
- ScopedConfigurationNode set(Object) throws SerializationException
- ScopedConfigurationNode set(Type, Object) throws SerializationException
- ScopedConfigurationNode set(AnnotatedType, Object) throws SerializationException
- ScopedConfigurationNode set(Class, Object) throws SerializationException
- ScopedConfigurationNode set(TypeToken, Object) throws SerializationException
- ConfigurationNode set(AnnotatedType, Object) throws SerializationException
- ConfigurationNode set(Type, Object) throws SerializationException
- ConfigurationNode set(Class, Object) throws SerializationException
- ConfigurationNode set(TypeToken, Object) throws SerializationException
- ConfigurationNode set(Object) throws SerializationException
- Collector toListCollector(TypeToken)
- Collector toListCollector(Class)
- ScopedConfigurationNode raw(Object)
- ConfigurationNode raw(Object)
- Map childrenMap()
- ScopedConfigurationNode setList(Class, List) throws SerializationException
- ScopedConfigurationNode setList(TypeToken, List) throws SerializationException
- ConfigurationNode setList(TypeToken, List) throws SerializationException
- ConfigurationNode setList(Class, List) throws SerializationException
- Collector toMapCollector(TypeToken)
- Collector toMapCollector(Class)
- ScopedConfigurationNode node(Object[])
- ScopedConfigurationNode node(Iterable)
- ConfigurationNode node(Iterable)
- ConfigurationNode node(Object[])
- ScopedConfigurationNode act(CheckedConsumer) throws Exception
- ScopedConfigurationNode mergeFrom(ConfigurationNode)
- ConfigurationNode mergeFrom(ConfigurationNode)
- ScopedConfigurationNode hint(RepresentationHint, Object)
- ConfigurationNode hint(RepresentationHint, Object)
- ScopedConfigurationNode self()
- ScopedConfigurationNode from(ConfigurationNode)
- ConfigurationNode from(ConfigurationNode)
- ScopedConfigurationNode copy()
- ConfigurationNode copy()
- List childrenList()
- ScopedConfigurationNode appendListNode()
- ConfigurationNode appendListNode()

### Class: com.earth2me.essentials.libs.configurate.ConfigurateException
Type: Class
Extends: java.io.IOException

Methods:
- NodePath path()
- String getMessage()
- void initPath(Supplier)
- ConfigurateException wrap(ConfigurationNode, IOException)
- String rawMessage()

### Class: com.earth2me.essentials.libs.configurate.ConfigurationOptions
Type: Abstract Class

Methods:
- boolean acceptsType(Class)
- TypeSerializerCollection serializers()
- ConfigurationOptions serializers(TypeSerializerCollection)
- ConfigurationOptions serializers(Consumer)
- MapFactory mapFactory()
- ConfigurationOptions mapFactory(MapFactory)
- ConfigurationOptions defaults()
- boolean implicitInitialization()
- ConfigurationOptions implicitInitialization(boolean)
- ConfigurationOptions nativeTypes(Set)
- String header()
- ConfigurationOptions header(String)
- boolean shouldCopyDefaults()
- ConfigurationOptions shouldCopyDefaults(boolean)

### Class: com.earth2me.essentials.libs.configurate.RepresentationHint
Type: Abstract Class

Methods:
- String identifier()
- boolean inheritable()
- Object defaultValue()
- TypeToken valueType()
- RepresentationHint of(String, Class)
- RepresentationHint of(String, TypeToken)
- RepresentationHint$Builder builder()

## Package: com.earth2me.essentials.libs.configurate.loader

### Class: com.earth2me.essentials.libs.configurate.loader.CommentHandler
Type: Interface

Methods:
- String extractHeader(BufferedReader) throws IOException
- Stream toComment(Stream)

### Class: com.earth2me.essentials.libs.configurate.loader.ConfigurationFormat
Type: Interface

Methods:
- Set supportedExtensions()
- ConfigurationFormat forExtension(String)
- Set supportedFormats()
- ConfigurationLoader create(Path)
- ConfigurationLoader create(Path, ConfigurationNode)
- ConfigurationLoader create(URL)
- ConfigurationLoader create(URL, ConfigurationNode)
- String id()

### Class: com.earth2me.essentials.libs.configurate.loader.ConfigurationLoader
Type: Interface
Implements: com.earth2me.essentials.libs.configurate.ConfigurationNodeFactory

Methods:
- ConfigurationNode load() throws ConfigurateException
- ConfigurationNode load(ConfigurationOptions) throws ConfigurateException
- boolean canLoad()
- void save(ConfigurationNode) throws ConfigurateException
- boolean canSave()
- ConfigurationReference loadToReference() throws ConfigurateException

### Class: com.earth2me.essentials.libs.configurate.loader.AbstractConfigurationFormat
Type: Abstract Class
Implements: com.earth2me.essentials.libs.configurate.loader.ConfigurationFormat

Methods:
- Set supportedExtensions()
- ConfigurationLoader create(Path)
- ConfigurationLoader create(Path, ConfigurationNode)
- ConfigurationLoader create(URL)
- ConfigurationLoader create(URL, ConfigurationNode)
- String id()

### Class: com.earth2me.essentials.libs.configurate.loader.AbstractConfigurationLoader
Type: Abstract Class
Implements: com.earth2me.essentials.libs.configurate.loader.ConfigurationLoader

Methods:
- ScopedConfigurationNode load(ConfigurationOptions) throws ParsingException
- ConfigurationNode load(ConfigurationOptions) throws ConfigurateException
- CommentHandler defaultCommentHandler()
- boolean canLoad()
- ConfigurationOptions defaultOptions()
- void save(ConfigurationNode) throws ConfigurateException
- boolean canSave()
- ConfigurationReference loadToReference() throws ConfigurateException

### Class: com.earth2me.essentials.libs.configurate.loader.AtomicFiles
Type: Class

Methods:
- BufferedWriter atomicBufferedWriter(Path, Charset) throws IOException
- Callable atomicWriterFactory(Path, Charset)

### Class: com.earth2me.essentials.libs.configurate.loader.CommentHandlers
Type: Enum
Extends: java.lang.Enum
Implements: com.earth2me.essentials.libs.configurate.loader.CommentHandler

Methods:
- String extractHeader(BufferedReader) throws IOException
- CommentHandlers valueOf(String)
- Stream toComment(Stream)
- CommentHandlers[] values()
- String extractComment(BufferedReader, Iterable) throws IOException

### Class: com.earth2me.essentials.libs.configurate.loader.HeaderMode
Type: Enum
Extends: java.lang.Enum

Methods:
- HeaderMode valueOf(String)
- HeaderMode[] values()

### Class: com.earth2me.essentials.libs.configurate.loader.ParsingException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.ConfigurateException

Methods:
- int line()
- String context()
- int column()
- String getMessage()
- ParsingException wrap(ConfigurationNode, IOException)

## Package: com.earth2me.essentials.libs.configurate.objectmapping

### Class: com.earth2me.essentials.libs.configurate.objectmapping.ConfigSerializable
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.earth2me.essentials.libs.configurate.objectmapping.FieldDiscoverer
Type: Interface

Methods:
- FieldDiscoverer$InstanceFactory discover(AnnotatedType, FieldDiscoverer$FieldCollector) throws SerializationException
- FieldDiscoverer emptyConstructorObject()
- FieldDiscoverer record()
- FieldDiscoverer instantiableObject(CheckedFunction)
- FieldDiscoverer object(CheckedFunction)
- FieldDiscoverer object(CheckedFunction, String)

### Class: com.earth2me.essentials.libs.configurate.objectmapping.ObjectMapper
Type: Interface

Methods:
- ObjectMapper$Factory$Builder emptyFactoryBuilder()
- ObjectMapper$Factory factory()
- ObjectMapper$Factory$Builder factoryBuilder()
- Object load(ConfigurationNode) throws SerializationException
- void save(Object, ConfigurationNode) throws SerializationException
- List fields()
- boolean canCreateInstances()
- Type mappedType()

### Class: com.earth2me.essentials.libs.configurate.objectmapping.FieldData
Type: Abstract Class

Methods:
- AnnotatedType resolvedType()
- boolean isValid(Object)
- String name()
- ConfigurationNode resolveNode(ConfigurationNode)
- void validate(Object) throws SerializationException

## Package: com.earth2me.essentials.libs.configurate.objectmapping.meta

### Class: com.earth2me.essentials.libs.configurate.objectmapping.meta.Comment
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean override()
- String value()

### Class: com.earth2me.essentials.libs.configurate.objectmapping.meta.Constraint
Type: Interface

Methods:
- Constraint$Factory pattern()
- Constraint$Factory localizedPattern(ResourceBundle)
- Constraint$Factory required()
- void validate(Object) throws SerializationException

### Class: com.earth2me.essentials.libs.configurate.objectmapping.meta.Matches
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- int flags()
- String failureMessage()
- String value()

### Class: com.earth2me.essentials.libs.configurate.objectmapping.meta.NodeKey
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.earth2me.essentials.libs.configurate.objectmapping.meta.NodeResolver
Type: Interface

Methods:
- NodeResolver$Factory onlyWithAnnotation(Class)
- ConfigurationNode resolve(ConfigurationNode)
- NodeResolver$Factory nodeFromParent()
- NodeResolver$Factory onlyWithSetting()
- NodeResolver$Factory keyFromSetting()
- NodeResolver$Factory nodeKey()

### Class: com.earth2me.essentials.libs.configurate.objectmapping.meta.PostProcess
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.earth2me.essentials.libs.configurate.objectmapping.meta.PostProcessor
Type: Interface

Methods:
- PostProcessor$Factory methodsAnnotatedPostProcess()
- PostProcessor$Factory methodsAnnotated(Class)
- void postProcess(Object) throws SerializationException

### Class: com.earth2me.essentials.libs.configurate.objectmapping.meta.Processor
Type: Interface

Methods:
- void process(Object, ConfigurationNode)
- Processor$Factory comments()
- Processor$Factory localizedComments(ResourceBundle)

### Class: com.earth2me.essentials.libs.configurate.objectmapping.meta.Required
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.earth2me.essentials.libs.configurate.objectmapping.meta.Setting
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean nodeFromParent()
- String value()

## Package: com.earth2me.essentials.libs.configurate.reactive

### Class: com.earth2me.essentials.libs.configurate.reactive.Disposable
Type: Interface

Methods:
- void dispose()

### Class: com.earth2me.essentials.libs.configurate.reactive.Processor
Type: Interface
Implements: com.earth2me.essentials.libs.configurate.reactive.Publisher, com.earth2me.essentials.libs.configurate.reactive.Subscriber

Methods:
- boolean closeIfUnsubscribed()
- Processor$Iso create()
- Processor$Iso create(Executor)
- Processor$TransactionalIso createTransactional()
- Processor$TransactionalIso createTransactional(Executor)
- void inject(Object)
- Processor map(CheckedFunction)
- Publisher map(CheckedFunction)
- void fallbackHandler(Subscriber)

### Class: com.earth2me.essentials.libs.configurate.reactive.Publisher
Type: Interface

Methods:
- Publisher$Cached cache()
- Publisher$Cached cache(Object)
- boolean hasSubscribers()
- Disposable subscribe(Subscriber)
- Executor executor()
- Publisher map(CheckedFunction)
- Publisher execute(CheckedSupplier)
- Publisher execute(CheckedSupplier, Executor)

### Class: com.earth2me.essentials.libs.configurate.reactive.Subscriber
Type: Interface

Methods:
- void onClose()
- void onError(Throwable)
- void submit(Object)

### Class: com.earth2me.essentials.libs.configurate.reactive.TransactionalSubscriber
Type: Interface
Implements: com.earth2me.essentials.libs.configurate.reactive.Subscriber

Methods:
- void rollback()
- void beginTransaction(Object) throws TransactionFailedException
- void submit(Object)
- void commit()

### Class: com.earth2me.essentials.libs.configurate.reactive.TransactionFailedException
Type: Class
Extends: java.lang.Exception

No public methods found

## Package: com.earth2me.essentials.libs.configurate.reference

### Class: com.earth2me.essentials.libs.configurate.reference.ConfigurationReference
Type: Interface
Implements: java.lang.AutoCloseable

Methods:
- void set(Object[], Object) throws SerializationException
- void set(Object[], Class, Object) throws SerializationException
- void set(Object[], TypeToken, Object) throws SerializationException
- void set(NodePath, Object) throws SerializationException
- void set(NodePath, Class, Object) throws SerializationException
- void set(NodePath, TypeToken, Object) throws SerializationException
- ConfigurationLoader loader()
- void save() throws ConfigurateException
- void save(ConfigurationNode) throws ConfigurateException
- Publisher updates()
- Publisher saveAsync()
- ConfigurationReference watching(Function, Path, WatchServiceListener) throws ConfigurateException
- ValueReference referenceTo(TypeToken, Object[]) throws SerializationException
- ValueReference referenceTo(Class, Object[]) throws SerializationException
- ValueReference referenceTo(TypeToken, NodePath) throws SerializationException
- ValueReference referenceTo(Class, NodePath) throws SerializationException
- ValueReference referenceTo(TypeToken, NodePath, Object) throws SerializationException
- ValueReference referenceTo(Class, NodePath, Object) throws SerializationException
- ConfigurationNode node()
- void load() throws ConfigurateException
- ConfigurationNode get(Object[])
- ConfigurationNode get(Iterable)
- Publisher updateAsync(Function)
- ConfigurationReference fixed(ConfigurationLoader) throws ConfigurateException
- void close()
- Publisher errors()

### Class: com.earth2me.essentials.libs.configurate.reference.ValueReference
Type: Interface
Implements: com.earth2me.essentials.libs.configurate.reactive.Publisher

Methods:
- ConfigurationNode node()
- boolean set(Object)
- Object get()
- Publisher updateAsync(Function)
- boolean update(Function)
- boolean setAndSave(Object)
- Publisher setAndSaveAsync(Object)

### Class: com.earth2me.essentials.libs.configurate.reference.WatchServiceListener
Type: Class
Implements: java.lang.AutoCloseable

Methods:
- Disposable listenToDirectory(Path, Subscriber) throws ConfigurateException, IllegalArgumentException
- Disposable listenToFile(Path, Subscriber) throws ConfigurateException, IllegalArgumentException
- WatchServiceListener$Builder builder()
- WatchServiceListener create() throws IOException
- void close() throws IOException
- ConfigurationReference listenToConfiguration(Function, Path) throws ConfigurateException

## Package: com.earth2me.essentials.libs.configurate.serialize

### Class: com.earth2me.essentials.libs.configurate.serialize.PatternFlags
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- int value()

### Class: com.earth2me.essentials.libs.configurate.serialize.TypeSerializer
Type: Interface

Methods:
- void serialize(AnnotatedType, Object, ConfigurationNode) throws SerializationException
- void serialize(Type, Object, ConfigurationNode) throws SerializationException
- Object emptyValue(Type, ConfigurationOptions)
- Object emptyValue(AnnotatedType, ConfigurationOptions)
- ScalarSerializer of(Type, BiFunction, CheckedFunction)
- ScalarSerializer of(Class, BiFunction, CheckedFunction)
- Object deserialize(AnnotatedType, ConfigurationNode) throws SerializationException
- Object deserialize(Type, ConfigurationNode) throws SerializationException

### Class: com.earth2me.essentials.libs.configurate.serialize.AbstractListChildSerializer
Type: Abstract Class
Implements: com.earth2me.essentials.libs.configurate.serialize.TypeSerializer$Annotated

Methods:
- void serialize(AnnotatedType, Object, ConfigurationNode) throws SerializationException
- Object emptyValue(AnnotatedType, ConfigurationOptions)
- Object deserialize(AnnotatedType, ConfigurationNode) throws SerializationException

### Class: com.earth2me.essentials.libs.configurate.serialize.CoercionFailedException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.serialize.SerializationException

No public methods found

### Class: com.earth2me.essentials.libs.configurate.serialize.ScalarSerializer
Type: Abstract Class
Implements: com.earth2me.essentials.libs.configurate.serialize.TypeSerializer$Annotated

Methods:
- String serializeToString(Object)
- void serialize(AnnotatedType, Object, ConfigurationNode)
- void serialize(Type, Object, ConfigurationNode)
- TypeToken type()
- Object tryDeserialize(Object)
- Object deserialize(Type, ConfigurationNode) throws SerializationException
- Object deserialize(AnnotatedType, ConfigurationNode) throws SerializationException
- Object deserialize(Object) throws SerializationException
- Object deserialize(AnnotatedType, Object) throws SerializationException
- Object deserialize(Type, Object) throws SerializationException

### Class: com.earth2me.essentials.libs.configurate.serialize.Scalars
Type: Class

No public methods found

### Class: com.earth2me.essentials.libs.configurate.serialize.SerializationException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.ConfigurateException

Methods:
- Type expectedType()
- String getMessage()
- void initType(Type)
- void initType(AnnotatedType)

### Class: com.earth2me.essentials.libs.configurate.serialize.TypeSerializerCollection
Type: Class

Methods:
- TypeSerializerCollection defaults()
- TypeSerializerCollection$Builder childBuilder()
- int hashCode()
- boolean equals(Object)
- TypeSerializer get(TypeToken)
- TypeSerializer get(Class)
- TypeSerializer get(Type)
- TypeSerializer get(AnnotatedType)
- TypeSerializerCollection$Builder builder()
- String toString()

## Package: com.earth2me.essentials.libs.configurate.transformation

### Class: com.earth2me.essentials.libs.configurate.transformation.ConfigurationTransformation
Type: Interface

Methods:
- ConfigurationTransformation chain(ConfigurationTransformation[])
- void apply(ConfigurationNode) throws ConfigurateException
- ConfigurationTransformation$VersionedBuilder versionedBuilder()
- ConfigurationTransformation$Builder builder()
- ConfigurationTransformation empty()

### Class: com.earth2me.essentials.libs.configurate.transformation.TransformAction
Type: Interface

Methods:
- TransformAction set(TypeToken, Object)
- TransformAction set(TypeToken, Supplier)
- TransformAction set(Class, Supplier)
- TransformAction rename(Object)
- Object[] visitPath(NodePath, ConfigurationNode) throws ConfigurateException
- TransformAction remove()

### Class: com.earth2me.essentials.libs.configurate.transformation.MoveStrategy
Type: Enum
Extends: java.lang.Enum

Methods:
- void move(ConfigurationNode, ConfigurationNode)
- MoveStrategy valueOf(String)
- MoveStrategy[] values()

## Package: com.earth2me.essentials.libs.configurate.util

### Class: com.earth2me.essentials.libs.configurate.util.CheckedConsumer
Type: Interface

Methods:
- CheckedConsumer from(Consumer)
- void accept(Object) throws Throwable

### Class: com.earth2me.essentials.libs.configurate.util.CheckedFunction
Type: Interface

Methods:
- Object apply(Object) throws Exception
- CheckedFunction from(Function)

### Class: com.earth2me.essentials.libs.configurate.util.CheckedSupplier
Type: Interface

Methods:
- Object get() throws Throwable
- CheckedSupplier from(Supplier)

### Class: com.earth2me.essentials.libs.configurate.util.MapFactory
Type: Interface

Methods:
- Map create()

### Class: com.earth2me.essentials.libs.configurate.util.NamingScheme
Type: Interface

Methods:
- String coerce(String)

### Class: com.earth2me.essentials.libs.configurate.util.EnumLookup
Type: Class

Methods:
- Enum lookupEnum(Class, String)

### Class: com.earth2me.essentials.libs.configurate.util.MapFactories
Type: Class

Methods:
- MapFactory sortedNatural()
- MapFactory unordered()
- MapFactory sorted(Comparator)
- MapFactory insertionOrdered()

### Class: com.earth2me.essentials.libs.configurate.util.NamingSchemes
Type: Enum
Extends: java.lang.Enum
Implements: com.earth2me.essentials.libs.configurate.util.NamingScheme

Methods:
- NamingSchemes valueOf(String)
- NamingSchemes[] values()

### Class: com.earth2me.essentials.libs.configurate.util.Strings
Type: Class

Methods:
- String repeat(String, int)
- boolean isBlank(String)

### Class: com.earth2me.essentials.libs.configurate.util.Types
Type: Class

Methods:
- boolean isBoxedPrimitive(Type)
- Type requireCompleteParameters(Type)
- Object defaultValue(Class)
- Type unbox(Type)
- AnnotatedElement combinedAnnotations(AnnotatedElement[])
- List allDeclaredMethods(Class)
- TypeToken makeListType(TypeToken)
- TypeToken makeList(Class)
- Type box(Type)
- boolean isArray(Type)
- Stream allSuperTypesAndInterfaces(Type)
- Stream allSuperTypes(Type)
- TypeToken makeMap(Class, Class)
- TypeToken makeMap(TypeToken, TypeToken)
- TypeToken makeMap(Class, TypeToken)
- TypeToken makeMap(TypeToken, Class)

### Class: com.earth2me.essentials.libs.configurate.util.UnmodifiableCollections
Type: Class

Methods:
- Set toSet(Object[])
- Map$Entry immutableMapEntry(Object, Object)
- Map buildMap(Consumer)
- List toList(Object[])
- List copyOf(List)
- Set copyOf(Set)
- Map copyOf(Map)

### Class: com.earth2me.essentials.libs.configurate.util.UnmodifiableCollections
Type: Class

Methods:
- Set toSet(Object[])
- Map$Entry immutableMapEntry(Object, Object)
- Map buildMap(Consumer)
- List toList(Object[])
- List copyOf(List)
- Set copyOf(Set)
- Map copyOf(Map)

## Package: com.earth2me.essentials.libs.configurate.yaml

### Class: com.earth2me.essentials.libs.configurate.yaml.NodeStyle
Type: Enum
Extends: java.lang.Enum

Methods:
- NodeStyle valueOf(String)
- NodeStyle[] values()

### Class: com.earth2me.essentials.libs.configurate.yaml.YamlConfigurationFormat
Type: Class
Extends: com.earth2me.essentials.libs.configurate.loader.AbstractConfigurationFormat

No public methods found

### Class: com.earth2me.essentials.libs.configurate.yaml.YamlConfigurationLoader
Type: Class
Extends: com.earth2me.essentials.libs.configurate.loader.AbstractConfigurationLoader

Methods:
- CommentedConfigurationNode createNode(ConfigurationOptions)
- ConfigurationNode createNode(ConfigurationOptions)
- YamlConfigurationLoader$Builder builder()

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.DumperOptions
Type: Class

Methods:
- boolean isAllowUnicode()
- TimeZone getTimeZone()
- void setExplicitStart(boolean)
- Map getTags()
- boolean isExplicitStart()
- boolean isProcessComments()
- void setTags(Map)
- int getWidth()
- void setIndentWithIndicator(boolean)
- DumperOptions$NonPrintableStyle getNonPrintableStyle()
- void setMaxSimpleKeyLength(int)
- void setCanonical(boolean)
- int getIndicatorIndent()
- void setDefaultScalarStyle(DumperOptions$ScalarStyle)
- DumperOptions$ScalarStyle getDefaultScalarStyle()
- boolean isDereferenceAliases()
- void setSplitLines(boolean)
- void setIndicatorIndent(int)
- boolean getSplitLines()
- void setNonPrintableStyle(DumperOptions$NonPrintableStyle)
- void setTimeZone(TimeZone)
- void setIndent(int)
- boolean isAllowReadOnlyProperties()
- boolean isExplicitEnd()
- void setDefaultFlowStyle(DumperOptions$FlowStyle)
- void setPrettyFlow(boolean)
- DumperOptions$Version getVersion()
- void setAllowUnicode(boolean)
- boolean isPrettyFlow()
- int getIndent()
- void setProcessComments(boolean)
- DumperOptions$FlowStyle getDefaultFlowStyle()
- void setVersion(DumperOptions$Version)
- void setExplicitEnd(boolean)
- boolean getIndentWithIndicator()
- void setWidth(int)
- void setDereferenceAliases(boolean)
- void setLineBreak(DumperOptions$LineBreak)
- void setAllowReadOnlyProperties(boolean)
- DumperOptions$LineBreak getLineBreak()
- int getMaxSimpleKeyLength()
- void setAnchorGenerator(AnchorGenerator)
- boolean isCanonical()
- AnchorGenerator getAnchorGenerator()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.LoaderOptions
Type: Class

Methods:
- int getMaxAliasesForCollections()
- boolean isMergeOnCompose()
- void setMaxAliasesForCollections(int)
- void setTagInspector(TagInspector)
- LoaderOptions setProcessComments(boolean)
- void setCodePointLimit(int)
- TagInspector getTagInspector()
- int getCodePointLimit()
- LoaderOptions setAcceptTabs(boolean)
- void setWarnOnDuplicateKeys(boolean)
- void setNestingDepthLimit(int)
- boolean isProcessComments()
- boolean getAllowRecursiveKeys()
- void setWrappedToRootException(boolean)
- boolean isEnumCaseSensitive()
- void setEnumCaseSensitive(boolean)
- boolean isWrappedToRootException()
- boolean isWarnOnDuplicateKeys()
- boolean isAllowDuplicateKeys()
- void setAllowRecursiveKeys(boolean)
- void setAllowDuplicateKeys(boolean)
- boolean isAcceptTabs()
- int getNestingDepthLimit()
- void setMergeOnCompose(boolean)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.TypeDescription
Type: Class

Methods:
- Property getProperty(String)
- Object finalizeConstruction(Object)
- Set getProperties()
- Object newInstance(Node)
- Object newInstance(String, Node)
- void substituteProperty(String, Class, String, String, Class[])
- void substituteProperty(PropertySubstitute)
- Tag getTag()
- void addPropertyParameters(String, Class[])
- void putMapPropertyType(String, Class, Class)
- Class getType()
- void setExcludes(String[])
- boolean setProperty(Object, String, Object) throws Exception
- boolean setupPropertyType(String, Node)
- String toString()
- void setPropertyUtils(PropertyUtils)
- void putListPropertyType(String, Class)
- void setIncludes(String[])

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.Yaml
Type: Class

Methods:
- void setName(String)
- String dumpAsMap(Object)
- String getName()
- void addImplicitResolver(Tag, Pattern, String)
- void addImplicitResolver(Tag, Pattern, String, int)
- String dumpAll(Iterator)
- void dumpAll(Iterator, Writer)
- Iterable parse(Reader)
- Iterable loadAll(Reader)
- Iterable loadAll(String)
- Iterable loadAll(InputStream)
- Object loadAs(Reader, Class)
- Object loadAs(String, Class)
- Object loadAs(InputStream, Class)
- String dumpAs(Object, Tag, DumperOptions$FlowStyle)
- void serialize(Node, Writer)
- List serialize(Node)
- Object load(String)
- Object load(InputStream)
- Object load(Reader)
- Iterable composeAll(Reader)
- Node compose(Reader)
- void addTypeDescription(TypeDescription)
- void setBeanAccess(BeanAccess)
- String toString()
- String dump(Object)
- void dump(Object, Writer)
- Node represent(Object)

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.comments

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.comments.CommentEventsCollector
Type: Class

Methods:
- boolean isEmpty()
- List consume()
- Event collectEventsAndPoll(Event)
- CommentEventsCollector collectEvents()
- Event collectEvents(Event)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.comments.CommentLine
Type: Class

Methods:
- String getValue()
- CommentType getCommentType()
- Mark getStartMark()
- String toString()
- Mark getEndMark()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.comments.CommentType
Type: Enum
Extends: java.lang.Enum

Methods:
- CommentType valueOf(String)
- CommentType[] values()

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.composer

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.composer.Composer
Type: Class

Methods:
- Node getSingleNode()
- boolean checkNode()
- Node getNode()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.composer.ComposerException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error.MarkedYAMLException

No public methods found

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor.Construct
Type: Interface

Methods:
- Object construct(Node)
- void construct2ndStep(Node, Object)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor.AbstractConstruct
Type: Abstract Class
Implements: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor.Construct

Methods:
- void construct2ndStep(Node, Object)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor.BaseConstructor
Type: Abstract Class

Methods:
- boolean isExplicitPropertyUtils()
- Object getSingleData(Class)
- boolean checkData()
- void setWarnOnDuplicateKeys(boolean)
- void setWrappedToRootException(boolean)
- boolean isEnumCaseSensitive()
- void setEnumCaseSensitive(boolean)
- boolean isWrappedToRootException()
- boolean isWarnOnDuplicateKeys()
- boolean isAllowDuplicateKeys()
- void setAllowDuplicateKeys(boolean)
- LoaderOptions getLoadingConfig()
- TypeDescription addTypeDescription(TypeDescription)
- PropertyUtils getPropertyUtils()
- void setComposer(Composer)
- void setPropertyUtils(PropertyUtils)
- Object getData() throws NoSuchElementException

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor.Constructor
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor.SafeConstructor

No public methods found

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor.ConstructorException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error.MarkedYAMLException

No public methods found

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor.DuplicateKeyException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor.ConstructorException

No public methods found

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor.SafeConstructor
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.constructor.BaseConstructor

No public methods found

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.emitter

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.emitter.Emitable
Type: Interface

Methods:
- void emit(Event) throws IOException

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.emitter.Emitter
Type: Class
Implements: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.emitter.Emitable

Methods:
- void emit(Event) throws IOException

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.emitter.EmitterException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error.YAMLException

No public methods found

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.emitter.ScalarAnalysis
Type: Class

Methods:
- boolean isAllowFlowPlain()
- boolean isMultiline()
- String getScalar()
- boolean isAllowSingleQuoted()
- boolean isEmpty()
- boolean isAllowBlock()
- boolean isAllowBlockPlain()

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error.Mark
Type: Class
Implements: java.io.Serializable

Methods:
- String getName()
- int[] getBuffer()
- int getIndex()
- int getLine()
- int getColumn()
- String get_snippet(int, int)
- String get_snippet()
- String toString()
- int getPointer()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error.MarkedYAMLException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error.YAMLException

Methods:
- String getProblem()
- Mark getProblemMark()
- Mark getContextMark()
- String getMessage()
- String toString()
- String getContext()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error.YAMLException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.AliasEvent
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.NodeEvent

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.CollectionEndEvent
Type: Abstract Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.Event

No public methods found

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.CollectionStartEvent
Type: Abstract Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.NodeEvent

Methods:
- DumperOptions$FlowStyle getFlowStyle()
- boolean getImplicit()
- boolean isFlow()
- String getTag()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.CommentEvent
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.Event

Methods:
- String getValue()
- CommentType getCommentType()
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.DocumentEndEvent
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.Event

Methods:
- boolean getExplicit()
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.DocumentStartEvent
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.Event

Methods:
- DumperOptions$Version getVersion()
- boolean getExplicit()
- Map getTags()
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.Event
Type: Abstract Class

Methods:
- int hashCode()
- Mark getStartMark()
- boolean equals(Object)
- boolean is(Event$ID)
- String toString()
- Event$ID getEventId()
- Mark getEndMark()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.ImplicitTuple
Type: Class

Methods:
- boolean bothFalse()
- String toString()
- boolean canOmitTagInPlainScalar()
- boolean canOmitTagInNonPlainScalar()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.MappingEndEvent
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.CollectionEndEvent

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.MappingStartEvent
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.CollectionStartEvent

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.NodeEvent
Type: Abstract Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.Event

Methods:
- String getAnchor()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.ScalarEvent
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.NodeEvent

Methods:
- boolean isFolded()
- String getValue()
- boolean isLiteral()
- boolean isPlain()
- ImplicitTuple getImplicit()
- boolean isJson()
- boolean isSQuoted()
- DumperOptions$ScalarStyle getScalarStyle()
- String getTag()
- Event$ID getEventId()
- boolean isDQuoted()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.SequenceEndEvent
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.CollectionEndEvent

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.SequenceStartEvent
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.CollectionStartEvent

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.StreamEndEvent
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.Event

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.StreamStartEvent
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.events.Event

Methods:
- Event$ID getEventId()

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.external.com.google.gdata.util.common.base

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.external.com.google.gdata.util.common.base.Escaper
Type: Interface

Methods:
- String escape(String)
- Appendable escape(Appendable)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper

Methods:
- String escape(String)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper
Type: Abstract Class
Implements: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.external.com.google.gdata.util.common.base.Escaper

Methods:
- String escape(String)
- Appendable escape(Appendable)

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.inspector

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.inspector.TagInspector
Type: Interface

Methods:
- boolean isGlobalTagAllowed(Tag)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.inspector.UnTrustedTagInspector
Type: Class
Implements: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.inspector.TagInspector

Methods:
- boolean isGlobalTagAllowed(Tag)

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.internal

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.internal.Logger
Type: Class

Methods:
- void warn(String)
- boolean isLoggable(Logger$Level)
- Logger getLogger(String)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.internal.Logger
Type: Class

Methods:
- void warn(String)
- boolean isLoggable(Logger$Level)
- Logger getLogger(String)

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.BeanAccess
Type: Enum
Extends: java.lang.Enum

Methods:
- BeanAccess valueOf(String)
- BeanAccess[] values()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.FieldProperty
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.GenericProperty

Methods:
- void set(Object, Object) throws Exception
- Annotation getAnnotation(Class)
- Object get(Object)
- List getAnnotations()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.GenericProperty
Type: Abstract Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.Property

Methods:
- Class[] getActualTypeArguments()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.MethodProperty
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.GenericProperty

Methods:
- void set(Object, Object) throws Exception
- Annotation getAnnotation(Class)
- Object get(Object)
- boolean isWritable()
- boolean isReadable()
- List getAnnotations()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.MissingProperty
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.Property

Methods:
- void set(Object, Object) throws Exception
- Class[] getActualTypeArguments()
- Annotation getAnnotation(Class)
- Object get(Object)
- List getAnnotations()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.Property
Type: Abstract Class
Implements: java.lang.Comparable

Methods:
- void set(Object, Object) throws Exception
- String getName()
- Class[] getActualTypeArguments()
- int compareTo(Property)
- int compareTo(Object)
- boolean isWritable()
- List getAnnotations()
- Annotation getAnnotation(Class)
- Class getType()
- int hashCode()
- boolean equals(Object)
- Object get(Object)
- String toString()
- boolean isReadable()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.PropertySubstitute
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.Property

Methods:
- String getName()
- void set(Object, Object) throws Exception
- Class[] getActualTypeArguments()
- Class getType()
- Annotation getAnnotation(Class)
- Object get(Object)
- void setTargetType(Class)
- boolean isWritable()
- boolean isReadable()
- List getAnnotations()
- void setActualTypeArguments(Class[])
- void setDelegate(Property)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.introspector.PropertyUtils
Type: Class

Methods:
- boolean isSkipMissingProperties()
- void setAllowReadOnlyProperties(boolean)
- Property getProperty(Class, String)
- Property getProperty(Class, String, BeanAccess)
- Set getProperties(Class)
- Set getProperties(Class, BeanAccess)
- void setBeanAccess(BeanAccess)
- boolean isAllowReadOnlyProperties()
- void setSkipMissingProperties(boolean)

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.AnchorNode
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.Node

Methods:
- Node getRealNode()
- NodeId getNodeId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.CollectionNode
Type: Abstract Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.Node

Methods:
- DumperOptions$FlowStyle getFlowStyle()
- void setFlowStyle(DumperOptions$FlowStyle)
- List getValue()
- void setEndMark(Mark)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.MappingNode
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.CollectionNode

Methods:
- void setTypes(Class, Class)
- List getValue()
- NodeId getNodeId()
- void setOnlyKeyType(Class)
- boolean isMerged()
- void setValue(List)
- String toString()
- void setMerged(boolean)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.Node
Type: Abstract Class

Methods:
- List getInLineComments()
- boolean isTwoStepsConstruction()
- NodeId getNodeId()
- Mark getStartMark()
- void setUseClassConstructor(Boolean)
- void setType(Class)
- Tag getTag()
- Mark getEndMark()
- boolean useClassConstructor()
- void setBlockComments(List)
- void setInLineComments(List)
- String getAnchor()
- void setTwoStepsConstruction(boolean)
- List getEndComments()
- Class getType()
- int hashCode()
- boolean equals(Object)
- void setAnchor(String)
- void setTag(Tag)
- List getBlockComments()
- void setEndComments(List)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.NodeId
Type: Enum
Extends: java.lang.Enum

Methods:
- NodeId valueOf(String)
- NodeId[] values()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.NodeTuple
Type: Class

Methods:
- Node getKeyNode()
- String toString()
- Node getValueNode()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.ScalarNode
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.Node

Methods:
- String getValue()
- NodeId getNodeId()
- boolean isPlain()
- String toString()
- DumperOptions$ScalarStyle getScalarStyle()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.SequenceNode
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.CollectionNode

Methods:
- List getValue()
- NodeId getNodeId()
- String toString()
- void setListType(Class)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.nodes.Tag
Type: Class

Methods:
- boolean isCustomGlobal()
- String getValue()
- int hashCode()
- boolean equals(Object)
- String toString()
- String getClassName()
- boolean isSecondary()
- boolean matches(Class)
- boolean isCompatible(Class)
- boolean startsWith(String)

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.parser

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.parser.Parser
Type: Interface

Methods:
- Event getEvent()
- Event peekEvent()
- boolean checkEvent(Event$ID)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.parser.ParserException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error.MarkedYAMLException

No public methods found

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.parser.ParserImpl
Type: Class
Implements: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.parser.Parser

Methods:
- Event getEvent()
- Event peekEvent()
- boolean checkEvent(Event$ID)

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.reader

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.reader.ReaderException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error.YAMLException

Methods:
- int getPosition()
- String getName()
- int getCodePoint()
- String toString()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.reader.StreamReader
Type: Class

Methods:
- Mark getMark()
- void resetDocumentIndex()
- int getIndex()
- String prefixForward(int)
- String prefix(int)
- void forward()
- void forward(int)
- int getLine()
- int getDocumentIndex()
- int getColumn()
- boolean isPrintable(String)
- boolean isPrintable(int)
- int peek()
- int peek(int)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.reader.UnicodeReader
Type: Class
Extends: java.io.Reader

Methods:
- String getEncoding()
- int read(char[], int, int) throws IOException
- void close() throws IOException

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.representer

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.representer.Represent
Type: Interface

Methods:
- Node representData(Object)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.representer.BaseRepresenter
Type: Abstract Class

Methods:
- DumperOptions$ScalarStyle getDefaultScalarStyle()
- void setDefaultScalarStyle(DumperOptions$ScalarStyle)
- boolean isExplicitPropertyUtils()
- DumperOptions$FlowStyle getDefaultFlowStyle()
- PropertyUtils getPropertyUtils()
- void setPropertyUtils(PropertyUtils)
- void setDefaultFlowStyle(DumperOptions$FlowStyle)
- Node represent(Object)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.representer.Representer
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.representer.SafeRepresenter

Methods:
- Tag addClassTag(Class, Tag)
- TimeZone getTimeZone()
- TypeDescription addTypeDescription(TypeDescription)
- void setTimeZone(TimeZone)
- void setPropertyUtils(PropertyUtils)

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.resolver

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.resolver.Resolver
Type: Class

Methods:
- Tag resolve(NodeId, String, boolean)
- void addImplicitResolver(Tag, Pattern, String)
- void addImplicitResolver(Tag, Pattern, String, int)

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.scanner

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.scanner.Scanner
Type: Interface

Methods:
- void resetDocumentIndex()
- Token getToken()
- Token peekToken()
- boolean checkToken(Token$ID[])
- boolean checkToken(Token$ID)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.scanner.Constant
Type: Class

Methods:
- boolean has(int)
- boolean has(int, String)
- boolean hasNo(int)
- boolean hasNo(int, String)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.scanner.ScannerException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error.MarkedYAMLException

No public methods found

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.scanner.ScannerImpl
Type: Class
Implements: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.scanner.Scanner

Methods:
- void resetDocumentIndex()
- Token getToken()
- Token peekToken()
- boolean checkToken(Token$ID)
- boolean checkToken(Token$ID[])

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.serializer

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.serializer.AnchorGenerator
Type: Interface

Methods:
- String nextAnchor(Node)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.serializer.NumberAnchorGenerator
Type: Class
Implements: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.serializer.AnchorGenerator

Methods:
- String nextAnchor(Node)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.serializer.Serializer
Type: Class

Methods:
- void serialize(Node) throws IOException
- void close() throws IOException
- void open() throws IOException

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.serializer.SerializerException
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.error.YAMLException

No public methods found

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.AliasToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.AnchorToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.BlockEndToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.BlockEntryToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.BlockMappingStartToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.BlockSequenceStartToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.CommentToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()
- CommentType getCommentType()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.DirectiveToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- List getValue()
- Token$ID getTokenId()
- String getName()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.DocumentEndToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.DocumentStartToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.FlowEntryToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.FlowMappingEndToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.FlowMappingStartToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.FlowSequenceEndToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.FlowSequenceStartToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.KeyToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.ScalarToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()
- DumperOptions$ScalarStyle getStyle()
- boolean getPlain()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.StreamEndToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.StreamStartToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.TagToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- TagTuple getValue()
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.TagTuple
Type: Class

Methods:
- String getSuffix()
- String getHandle()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token
Type: Abstract Class

Methods:
- Token$ID getTokenId()
- Mark getStartMark()
- Mark getEndMark()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.ValueToken
Type: Class
Extends: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

## Package: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.util

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.util.ArrayStack
Type: Class

Methods:
- Object pop()
- void clear()
- boolean isEmpty()
- void push(Object)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.util.ArrayUtils
Type: Class

Methods:
- List toUnmodifiableCompositeList(Object[], Object[])
- List toUnmodifiableList(Object[])

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.util.EnumUtils
Type: Class

Methods:
- Enum findEnumInsensitiveCase(Class, String)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.util.MergeUtils
Type: Abstract Class

Methods:
- List flatten(MappingNode)
- MappingNode asMappingNode(Node)

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.util.PlatformFeatureDetector
Type: Class

Methods:
- boolean isIntrospectionAvailable()
- boolean isRunningOnAndroid()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.util.Tuple
Type: Class

Methods:
- Object _1()
- Object _2()

### Class: com.earth2me.essentials.libs.configurate.yaml.internal.snakeyaml.util.UriEncoder
Type: Abstract Class

Methods:
- String encode(String)
- String decode(ByteBuffer) throws CharacterCodingException
- String decode(String)

## Package: com.earth2me.essentials.libs.geantyref

### Class: com.earth2me.essentials.libs.geantyref.AnnotatedCaptureType
Type: Interface
Implements: java.lang.reflect.AnnotatedType

Methods:
- void setAnnotatedUpperBounds(AnnotatedType[])
- AnnotatedWildcardType getAnnotatedWildcardType()
- AnnotatedTypeVariable getAnnotatedTypeVariable()
- AnnotatedType[] getAnnotatedUpperBounds()
- AnnotatedType[] getAnnotatedLowerBounds()

### Class: com.earth2me.essentials.libs.geantyref.CaptureType
Type: Interface
Implements: java.lang.reflect.Type

Methods:
- TypeVariable getTypeVariable()
- void setUpperBounds(Type[])
- WildcardType getWildcardType()
- Type[] getLowerBounds()
- Type[] getUpperBounds()

### Class: com.earth2me.essentials.libs.geantyref.AnnotatedTypeMap
Type: Class
Implements: java.util.Map

Methods:
- Object getOrDefault(Object, Object)
- Set entrySet()
- void forEach(BiConsumer)
- boolean containsKey(Object)
- Object computeIfAbsent(AnnotatedType, Function)
- Object computeIfAbsent(Object, Function)
- Collection values()
- boolean replace(AnnotatedType, Object, Object)
- Object replace(AnnotatedType, Object)
- Object replace(Object, Object)
- boolean replace(Object, Object, Object)
- void clear()
- boolean isEmpty()
- void replaceAll(BiFunction)
- Object remove(Object)
- boolean remove(Object, Object)
- Object put(AnnotatedType, Object)
- Object put(Object, Object)
- boolean containsValue(Object)
- Object compute(AnnotatedType, BiFunction)
- Object compute(Object, BiFunction)
- Object computeIfPresent(AnnotatedType, BiFunction)
- Object computeIfPresent(Object, BiFunction)
- int size()
- int hashCode()
- Object merge(AnnotatedType, Object, BiFunction)
- Object merge(Object, Object, BiFunction)
- boolean equals(Object)
- void putAll(Map)
- Object get(Object)
- Object putIfAbsent(AnnotatedType, Object)
- Object putIfAbsent(Object, Object)
- Set keySet()

### Class: com.earth2me.essentials.libs.geantyref.AnnotatedTypeSet
Type: Class
Implements: java.util.Set

Methods:
- boolean add(AnnotatedType)
- boolean add(Object)
- boolean removeAll(Collection)
- Iterator iterator()
- boolean contains(Object)
- int size()
- boolean addAll(Collection)
- boolean containsAll(Collection)
- void clear()
- Object[] toArray()
- Object[] toArray(Object[])
- boolean isEmpty()
- boolean remove(Object)
- boolean retainAll(Collection)

### Class: com.earth2me.essentials.libs.geantyref.AnnotationFormatException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.earth2me.essentials.libs.geantyref.GenericTypeReflector
Type: Class

Methods:
- AnnotatedParameterizedType replaceParameters(AnnotatedParameterizedType, AnnotatedType[])
- AnnotatedType getFieldType(Field, AnnotatedType)
- Type getFieldType(Field, Type)
- AnnotatedType annotate(Type)
- AnnotatedType annotate(Type, Annotation[])
- AnnotatedType[] getParameterTypes(Executable, AnnotatedType)
- Type[] getParameterTypes(Executable, Type)
- Type box(Type)
- AnnotatedType[] getExactParameterTypes(Executable, AnnotatedType)
- Type[] getExactParameterTypes(Executable, Type)
- AnnotatedType toCanonicalBoxed(AnnotatedType)
- AnnotatedType resolveExactType(AnnotatedType, AnnotatedType)
- Type resolveExactType(Type, Type)
- boolean isMissingTypeParameters(Type)
- AnnotatedType transform(AnnotatedType, TypeVisitor)
- int hashCode(AnnotatedType[])
- Annotation[] merge(Annotation[][])
- AnnotatedType mergeAnnotations(AnnotatedType, AnnotatedType)
- Type addWildcardParameters(Class)
- AnnotatedType reduceBounded(AnnotatedType)
- AnnotatedType getExactReturnType(Method, AnnotatedType)
- Type getExactReturnType(Method, Type)
- boolean isBoxType(Type)
- String getTypeName(Type)
- Class erase(Type)
- AnnotatedType resolveType(AnnotatedType, AnnotatedType)
- Type resolveType(Type, Type)
- AnnotatedType updateAnnotations(AnnotatedType, Annotation[])
- AnnotatedType capture(AnnotatedType)
- AnnotatedParameterizedType capture(AnnotatedParameterizedType)
- AnnotatedType getExactSuperType(AnnotatedType, Class)
- Type getExactSuperType(Type, Class)
- AnnotatedType getExactFieldType(Field, AnnotatedType)
- Type getExactFieldType(Field, Type)
- boolean isSuperType(Type, Type)
- AnnotatedType replaceAnnotations(AnnotatedType, Annotation[])
- AnnotatedType toCanonical(AnnotatedType)
- AnnotatedType getReturnType(Method, AnnotatedType)
- Type getReturnType(Method, Type)
- List getUpperBoundClassAndInterfaces(Type)
- boolean equals(AnnotatedType, AnnotatedType)
- AnnotatedType getTypeParameter(AnnotatedType, TypeVariable)
- Type getTypeParameter(Type, TypeVariable)
- AnnotatedType getExactSubType(AnnotatedType, Class)
- Type getExactSubType(Type, Class)
- boolean isFullyBound(Type)
- AnnotatedType getArrayComponentType(AnnotatedType)
- Type getArrayComponentType(Type)

### Class: com.earth2me.essentials.libs.geantyref.TypeArgumentNotInBoundException
Type: Class
Extends: java.lang.IllegalArgumentException

Methods:
- Type getArgument()
- Type getBound()
- TypeVariable getParameter()

### Class: com.earth2me.essentials.libs.geantyref.TypeFactory
Type: Class

Methods:
- Annotation annotation(Class, Map) throws AnnotationFormatException
- WildcardType wildcardExtends(Type)
- AnnotatedParameterizedType parameterizedAnnotatedType(ParameterizedType, Annotation[], Annotation[][])
- Type arrayOf(Type)
- AnnotatedArrayType arrayOf(AnnotatedType, Annotation[])
- Type parameterizedInnerClass(Type, Class, Type[])
- Type innerClass(Type, Class)
- AnnotatedType parameterizedAnnotatedClass(Class, Annotation[], AnnotatedType[])
- AnnotatedType annotatedInnerClass(Type, Class, Annotation[])
- Type parameterizedClass(Class, Type[])
- WildcardType wildcardSuper(Type)
- WildcardType unboundWildcard()
- AnnotatedType parameterizedAnnotatedInnerClass(Type, Class, Annotation[], AnnotatedType[])
- AnnotatedType annotatedClass(Class, Annotation[])

### Class: com.earth2me.essentials.libs.geantyref.TypeToken
Type: Abstract Class

Methods:
- Type getType()
- int hashCode()
- boolean equals(Object)
- TypeToken get(Class)
- TypeToken get(Type)
- AnnotatedType getCanonicalType()
- AnnotatedType getAnnotatedType()

### Class: com.earth2me.essentials.libs.geantyref.TypeVariableImpl
Type: Class
Implements: java.lang.reflect.TypeVariable

Methods:
- AnnotatedType[] getAnnotatedBounds()
- String getName()
- Annotation getAnnotation(Class)
- int hashCode()
- boolean equals(Object)
- String toString()
- Annotation[] getAnnotations()
- Type[] getBounds()
- Annotation[] getDeclaredAnnotations()
- GenericDeclaration getGenericDeclaration()

### Class: com.earth2me.essentials.libs.geantyref.TypeVisitor
Type: Abstract Class

No public methods found

## Package: com.earth2me.essentials.libs.kyori.adventure

### Class: com.earth2me.essentials.libs.kyori.adventure.Adventure
Type: Class

No public methods found

## Package: com.earth2me.essentials.libs.kyori.adventure.audience

### Class: com.earth2me.essentials.libs.kyori.adventure.audience.Audience
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.pointer.Pointered

Methods:
- void sendPlayerListHeader(ComponentLike)
- void sendPlayerListHeader(Component)
- void forEachAudience(Consumer)
- void removeResourcePacks(ResourcePackRequestLike)
- void removeResourcePacks(ResourcePackRequest)
- void removeResourcePacks(ResourcePackInfoLike, ResourcePackInfoLike[])
- void removeResourcePacks(Iterable)
- void removeResourcePacks(UUID, UUID[])
- Audience audience(Audience[])
- ForwardingAudience audience(Iterable)
- void sendResourcePacks(ResourcePackInfoLike, ResourcePackInfoLike[])
- void sendResourcePacks(ResourcePackRequestLike)
- void sendResourcePacks(ResourcePackRequest)
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
- Collector toAudience()
- void hideBossBar(BossBar)
- Audience empty()
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
- Audience filterAudience(Predicate)

### Class: com.earth2me.essentials.libs.kyori.adventure.audience.ForwardingAudience
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.audience.Audience

Methods:
- void sendPlayerListHeader(Component)
- void forEachAudience(Consumer)
- void removeResourcePacks(Iterable)
- void removeResourcePacks(UUID, UUID[])
- void sendResourcePacks(ResourcePackRequest)
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
- void clearResourcePacks()
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

### Class: com.earth2me.essentials.libs.kyori.adventure.audience.Audiences
Type: Class

Methods:
- Consumer sendingMessage(ComponentLike)

### Class: com.earth2me.essentials.libs.kyori.adventure.audience.MessageType
Type: Enum
Extends: java.lang.Enum

Methods:
- MessageType valueOf(String)
- MessageType[] values()

## Package: com.earth2me.essentials.libs.kyori.adventure.bossbar

### Class: com.earth2me.essentials.libs.kyori.adventure.bossbar.BossBar
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- boolean hasFlag(BossBar$Flag)
- BossBar removeFlag(BossBar$Flag)
- BossBar$Overlay overlay()
- BossBar overlay(BossBar$Overlay)
- BossBar$Color color()
- BossBar color(BossBar$Color)
- Set flags()
- BossBar flags(Set)
- BossBar removeViewer(Audience)
- BossBar removeListener(BossBar$Listener)
- float percent()
- BossBar percent(float)
- BossBar addFlag(BossBar$Flag)
- BossBar bossBar(ComponentLike, float, BossBar$Color, BossBar$Overlay)
- BossBar bossBar(Component, float, BossBar$Color, BossBar$Overlay)
- BossBar bossBar(ComponentLike, float, BossBar$Color, BossBar$Overlay, Set)
- BossBar bossBar(Component, float, BossBar$Color, BossBar$Overlay, Set)
- Iterable viewers()
- BossBar addFlags(BossBar$Flag[])
- BossBar addFlags(Iterable)
- Component name()
- BossBar name(ComponentLike)
- BossBar name(Component)
- BossBar addViewer(Audience)
- float progress()
- BossBar progress(float)
- BossBar addListener(BossBar$Listener)
- BossBar removeFlags(BossBar$Flag[])
- BossBar removeFlags(Iterable)

### Class: com.earth2me.essentials.libs.kyori.adventure.bossbar.BossBarImplementation
Type: Interface

Methods:
- Iterable viewers()
- BossBarImplementation get(BossBar, Class)

### Class: com.earth2me.essentials.libs.kyori.adventure.bossbar.BossBarViewer
Type: Interface

Methods:
- Iterable activeBossBars()

## Package: com.earth2me.essentials.libs.kyori.adventure.builder

### Class: com.earth2me.essentials.libs.kyori.adventure.builder.AbstractBuilder
Type: Interface

Methods:
- Object configureAndBuild(AbstractBuilder, Consumer)
- Object build()

## Package: com.earth2me.essentials.libs.kyori.adventure.chat

### Class: com.earth2me.essentials.libs.kyori.adventure.chat.ChatType
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable, com.earth2me.essentials.libs.kyori.adventure.key.Keyed

Methods:
- ChatType$Bound bind(ComponentLike)
- ChatType$Bound bind(ComponentLike, ComponentLike)
- Stream examinableProperties()
- ChatType chatType(Keyed)

### Class: com.earth2me.essentials.libs.kyori.adventure.chat.SignedMessage
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.identity.Identified, com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- boolean isSystem()
- Component unsignedContent()
- long salt()
- SignedMessage system(String, ComponentLike)
- SignedMessage$Signature signature(byte[])
- SignedMessage$Signature signature()
- boolean canDelete()
- Stream examinableProperties()
- String message()
- Instant timestamp()

## Package: com.earth2me.essentials.libs.kyori.adventure.identity

### Class: com.earth2me.essentials.libs.kyori.adventure.identity.Identified
Type: Interface

Methods:
- Identity identity()

### Class: com.earth2me.essentials.libs.kyori.adventure.identity.Identity
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable, com.earth2me.essentials.libs.kyori.adventure.identity.Identified

Methods:
- Identity nil()
- Identity identity(UUID)
- Identity identity()
- Stream examinableProperties()
- UUID uuid()

## Package: com.earth2me.essentials.libs.kyori.adventure.internal

### Class: com.earth2me.essentials.libs.kyori.adventure.internal.Internals
Type: Class

Methods:
- String toString(Examinable)

## Package: com.earth2me.essentials.libs.kyori.adventure.internal.properties

### Class: com.earth2me.essentials.libs.kyori.adventure.internal.properties.AdventureProperties
Type: Class

Methods:
- AdventureProperties$Property property(String, Function, Object)

## Package: com.earth2me.essentials.libs.kyori.adventure.inventory

### Class: com.earth2me.essentials.libs.kyori.adventure.inventory.Book
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.util.Buildable, com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- Book$Builder toBuilder()
- Buildable$Builder toBuilder()
- List pages()
- Book pages(Component[])
- Book pages(List)
- Component author()
- Book author(Component)
- Book book(Component, Component, Collection)
- Book book(Component, Component, Component[])
- Book$Builder builder()
- Component title()
- Book title(Component)

## Package: com.earth2me.essentials.libs.kyori.adventure.key

### Class: com.earth2me.essentials.libs.kyori.adventure.key.Key
Type: Interface
Implements: java.lang.Comparable, com.earth2me.essentials.libs.kyori.examination.Examinable, com.earth2me.essentials.libs.kyori.adventure.key.Namespaced, com.earth2me.essentials.libs.kyori.adventure.key.Keyed

Methods:
- boolean parseableValue(String)
- boolean allowedInNamespace(char)
- boolean parseableNamespace(String)
- int compareTo(Key)
- int compareTo(Object)
- boolean allowedInValue(char)
- boolean parseable(String)
- Comparator comparator()
- String namespace()
- OptionalInt checkValue(String)
- Stream examinableProperties()
- String asString()
- String value()
- OptionalInt checkNamespace(String)
- Key key(String)
- Key key(String, char)
- Key key(Namespaced, String)
- Key key(String, String)
- Key key()
- String asMinimalString()

### Class: com.earth2me.essentials.libs.kyori.adventure.key.KeyPattern
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.earth2me.essentials.libs.kyori.adventure.key.Keyed
Type: Interface

Methods:
- Key key()

### Class: com.earth2me.essentials.libs.kyori.adventure.key.KeyedValue
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.key.Keyed

Methods:
- KeyedValue keyedValue(Key, Object)
- KeyedValue of(Key, Object)
- Object value()

### Class: com.earth2me.essentials.libs.kyori.adventure.key.Namespaced
Type: Interface

Methods:
- String namespace()

### Class: com.earth2me.essentials.libs.kyori.adventure.key.InvalidKeyException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- String keyValue()
- String keyNamespace()

## Package: com.earth2me.essentials.libs.kyori.adventure.nbt

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.ArrayBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTag

Methods:
- BinaryTagType type()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTagLike, com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- BinaryTag asBinaryTag()
- BinaryTagType type()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTagLike
Type: Interface

Methods:
- BinaryTag asBinaryTag()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.ByteArrayBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- int size()
- byte get(int)
- ByteArrayBinaryTag of(byte[])
- ByteArrayBinaryTag byteArrayBinaryTag(byte[])
- BinaryTagType type()
- byte[] value()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.ByteBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- ByteBinaryTag of(byte)
- BinaryTagType type()
- byte value()
- ByteBinaryTag byteBinaryTag(byte)

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.CompoundBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTag, com.earth2me.essentials.libs.kyori.adventure.nbt.CompoundTagSetter, java.lang.Iterable

Methods:
- CompoundBinaryTag getCompound(String)
- CompoundBinaryTag getCompound(String, CompoundBinaryTag)
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
- BinaryTagType type()
- long[] getLongArray(String)
- long[] getLongArray(String, long[])
- CompoundBinaryTag empty()
- long getLong(String)
- long getLong(String, long)
- int getInt(String)
- int getInt(String, int)
- int size()
- ListBinaryTag getList(String)
- ListBinaryTag getList(String, ListBinaryTag)
- ListBinaryTag getList(String, BinaryTagType)
- ListBinaryTag getList(String, BinaryTagType, ListBinaryTag)
- BinaryTag get(String)
- byte[] getByteArray(String)
- byte[] getByteArray(String, byte[])
- CompoundBinaryTag$Builder builder()
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- CompoundBinaryTag from(Map)
- Set keySet()
- int[] getIntArray(String)
- int[] getIntArray(String, int[])

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.CompoundTagSetter
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

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.DoubleBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- DoubleBinaryTag doubleBinaryTag(double)
- DoubleBinaryTag of(double)
- BinaryTagType type()
- double value()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.EndBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTag

Methods:
- EndBinaryTag endBinaryTag()
- EndBinaryTag get()
- BinaryTagType type()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.FloatBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- FloatBinaryTag floatBinaryTag(float)
- FloatBinaryTag of(float)
- BinaryTagType type()
- float value()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.IntArrayBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- PrimitiveIterator$OfInt iterator()
- Iterator iterator()
- int size()
- IntStream stream()
- Spliterator$OfInt spliterator()
- Spliterator spliterator()
- IntArrayBinaryTag intArrayBinaryTag(int[])
- int get(int)
- IntArrayBinaryTag of(int[])
- void forEachInt(IntConsumer)
- BinaryTagType type()
- int[] value()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.IntBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- IntBinaryTag intBinaryTag(int)
- IntBinaryTag of(int)
- BinaryTagType type()
- int value()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.ListBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.ListTagSetter, com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTag, java.lang.Iterable

Methods:
- CompoundBinaryTag getCompound(int)
- CompoundBinaryTag getCompound(int, CompoundBinaryTag)
- ListBinaryTag listBinaryTag(BinaryTagType, List)
- byte getByte(int)
- byte getByte(int, byte)
- double getDouble(int)
- double getDouble(int, double)
- float getFloat(int)
- float getFloat(int, float)
- BinaryTagType type()
- BinaryTagType listType()
- ListBinaryTag remove(int, Consumer)
- ListBinaryTag empty()
- Stream stream()
- ListBinaryTag getList(int)
- ListBinaryTag getList(int, BinaryTagType)
- ListBinaryTag getList(int, ListBinaryTag)
- ListBinaryTag getList(int, BinaryTagType, ListBinaryTag)
- BinaryTag get(int)
- ListBinaryTag of(BinaryTagType, List)
- ListBinaryTag$Builder builder()
- ListBinaryTag$Builder builder(BinaryTagType)
- ListBinaryTag from(Iterable)
- ListBinaryTag set(int, BinaryTag, Consumer)
- short getShort(int)
- short getShort(int, short)
- boolean isEmpty()
- String getString(int)
- String getString(int, String)
- long[] getLongArray(int)
- long[] getLongArray(int, long[])
- long getLong(int)
- long getLong(int, long)
- int getInt(int)
- int getInt(int, int)
- int size()
- byte[] getByteArray(int)
- byte[] getByteArray(int, byte[])
- BinaryTagType elementType()
- int[] getIntArray(int)
- int[] getIntArray(int, int[])

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.ListTagSetter
Type: Interface

Methods:
- Object add(BinaryTag)
- Object add(Iterable)

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.LongArrayBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- LongArrayBinaryTag longArrayBinaryTag(long[])
- PrimitiveIterator$OfLong iterator()
- Iterator iterator()
- int size()
- LongStream stream()
- Spliterator$OfLong spliterator()
- Spliterator spliterator()
- long get(int)
- LongArrayBinaryTag of(long[])
- BinaryTagType type()
- void forEachLong(LongConsumer)
- long[] value()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.LongBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- LongBinaryTag of(long)
- BinaryTagType type()
- LongBinaryTag longBinaryTag(long)
- long value()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.NumberBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTag

Methods:
- int intValue()
- float floatValue()
- short shortValue()
- double doubleValue()
- BinaryTagType type()
- long longValue()
- byte byteValue()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.ShortBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.NumberBinaryTag

Methods:
- ShortBinaryTag of(short)
- ShortBinaryTag shortBinaryTag(short)
- BinaryTagType type()
- short value()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.StringBinaryTag
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTag

Methods:
- StringBinaryTag stringBinaryTag(String)
- StringBinaryTag of(String)
- BinaryTagType type()
- String value()

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTagIO
Type: Class

Methods:
- void writeCompressedPath(CompoundBinaryTag, Path) throws IOException
- void writeOutputStream(CompoundBinaryTag, OutputStream) throws IOException
- CompoundBinaryTag readCompressedInputStream(InputStream) throws IOException
- CompoundBinaryTag readPath(Path) throws IOException
- BinaryTagIO$Reader reader()
- BinaryTagIO$Reader reader(long)
- CompoundBinaryTag readCompressedPath(Path) throws IOException
- CompoundBinaryTag readInputStream(InputStream) throws IOException
- void writeCompressedOutputStream(CompoundBinaryTag, OutputStream) throws IOException
- BinaryTagIO$Writer writer()
- CompoundBinaryTag readDataInput(DataInput) throws IOException
- BinaryTagIO$Reader unlimitedReader()
- void writeDataOutput(CompoundBinaryTag, DataOutput) throws IOException
- void writePath(CompoundBinaryTag, Path) throws IOException

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTagType
Type: Abstract Class
Implements: java.util.function.Predicate

Methods:
- BinaryTag read(DataInput) throws IOException
- boolean test(BinaryTagType)
- boolean test(Object)
- byte id()
- void write(BinaryTag, DataOutput) throws IOException

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.BinaryTagTypes
Type: Class

No public methods found

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.TagStringIO
Type: Class

Methods:
- void toWriter(CompoundBinaryTag, Writer) throws IOException
- TagStringIO get()
- TagStringIO$Builder builder()
- String asString(CompoundBinaryTag) throws IOException
- CompoundBinaryTag asCompound(String) throws IOException

## Package: com.earth2me.essentials.libs.kyori.adventure.nbt.api

### Class: com.earth2me.essentials.libs.kyori.adventure.nbt.api.BinaryTagHolder
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.event.DataComponentValue$TagSerializable

Methods:
- BinaryTagHolder asBinaryTag()
- BinaryTagHolder encode(Object, Codec) throws Exception
- BinaryTagHolder binaryTagHolder(String)
- String string()
- Object get(Codec) throws Exception
- BinaryTagHolder of(String)

## Package: com.earth2me.essentials.libs.kyori.adventure.permission

### Class: com.earth2me.essentials.libs.kyori.adventure.permission.PermissionChecker
Type: Interface
Implements: java.util.function.Predicate

Methods:
- PermissionChecker always(TriState)
- boolean test(String)
- boolean test(Object)
- TriState value(String)

## Package: com.earth2me.essentials.libs.kyori.adventure.platform

### Class: com.earth2me.essentials.libs.kyori.adventure.platform.AudienceProvider
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

## Package: com.earth2me.essentials.libs.kyori.adventure.platform.bukkit

### Class: com.earth2me.essentials.libs.kyori.adventure.platform.bukkit.BukkitAudiences
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.platform.AudienceProvider

Methods:
- Audience filter(Predicate)
- Audience sender(CommandSender)
- BukkitAudiences$Builder builder(Plugin)
- BukkitAudiences create(Plugin)
- Sound$Emitter asEmitter(Entity)
- Audience player(Player)

### Class: com.earth2me.essentials.libs.kyori.adventure.platform.bukkit.BukkitComponentSerializer
Type: Class

Methods:
- LegacyComponentSerializer legacy()
- GsonComponentSerializer gson()

### Class: com.earth2me.essentials.libs.kyori.adventure.platform.bukkit.MinecraftComponentSerializer
Type: Class
Implements: com.earth2me.essentials.libs.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- Object serialize(Component)
- MinecraftComponentSerializer get()
- boolean isSupported()
- Component deserialize(Object)

## Package: com.earth2me.essentials.libs.kyori.adventure.platform.facet

### Class: com.earth2me.essentials.libs.kyori.adventure.platform.facet.Facet
Type: Interface

Methods:
- Collection of(Supplier[])
- Facet of(Collection, Object)
- boolean isApplicable(Object)
- boolean isSupported()

### Class: com.earth2me.essentials.libs.kyori.adventure.platform.facet.FacetAudience
Type: Class
Implements: com.earth2me.essentials.libs.kyori.adventure.audience.Audience, java.io.Closeable

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

### Class: com.earth2me.essentials.libs.kyori.adventure.platform.facet.FacetAudienceProvider
Type: Abstract Class
Implements: com.earth2me.essentials.libs.kyori.adventure.platform.AudienceProvider, com.earth2me.essentials.libs.kyori.adventure.audience.ForwardingAudience

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

### Class: com.earth2me.essentials.libs.kyori.adventure.platform.facet.FacetBase
Type: Abstract Class
Implements: com.earth2me.essentials.libs.kyori.adventure.platform.facet.Facet

Methods:
- boolean isApplicable(Object)
- boolean isSupported()

### Class: com.earth2me.essentials.libs.kyori.adventure.platform.facet.FacetComponentFlattener
Type: Class

Methods:
- ComponentFlattener get(Object, Collection)

### Class: com.earth2me.essentials.libs.kyori.adventure.platform.facet.FacetPointers
Type: Class

No public methods found

### Class: com.earth2me.essentials.libs.kyori.adventure.platform.facet.Knob
Type: Class

Methods:
- void logError(Throwable, String, Object[])
- void logMessage(String, Object[])
- boolean isEnabled(String, boolean)
- void logUnsupported(Object, Object)

## Package: com.earth2me.essentials.libs.kyori.adventure.pointer

### Class: com.earth2me.essentials.libs.kyori.adventure.pointer.Pointer
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- Pointer pointer(Class, Key)
- Stream examinableProperties()
- Class type()
- Key key()

### Class: com.earth2me.essentials.libs.kyori.adventure.pointer.Pointered
Type: Interface

Methods:
- Object getOrDefaultFrom(Pointer, Supplier)
- Object getOrDefault(Pointer, Object)
- Optional get(Pointer)
- Pointers pointers()

### Class: com.earth2me.essentials.libs.kyori.adventure.pointer.Pointers
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.util.Buildable

Methods:
- Object getOrDefaultFrom(Pointer, Supplier)
- Object getOrDefault(Pointer, Object)
- Optional get(Pointer)
- Pointers$Builder builder()
- boolean supports(Pointer)
- Pointers empty()

### Class: com.earth2me.essentials.libs.kyori.adventure.pointer.PointersSupplier
Type: Interface

Methods:
- Function resolver(Pointer)
- Pointers view(Object)
- PointersSupplier$Builder builder()
- boolean supports(Pointer)

## Package: com.earth2me.essentials.libs.kyori.adventure.resource

### Class: com.earth2me.essentials.libs.kyori.adventure.resource.ResourcePackCallback
Type: Interface

Methods:
- ResourcePackCallback noOp()
- void packEventReceived(UUID, ResourcePackStatus, Audience)
- ResourcePackCallback onTerminal(BiConsumer, BiConsumer)

### Class: com.earth2me.essentials.libs.kyori.adventure.resource.ResourcePackInfo
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable, com.earth2me.essentials.libs.kyori.adventure.resource.ResourcePackInfoLike

Methods:
- ResourcePackInfo resourcePackInfo(UUID, URI, String)
- ResourcePackInfo$Builder resourcePackInfo()
- ResourcePackInfo asResourcePackInfo()
- UUID id()
- URI uri()
- String hash()

### Class: com.earth2me.essentials.libs.kyori.adventure.resource.ResourcePackInfoLike
Type: Interface

Methods:
- ResourcePackInfo asResourcePackInfo()

### Class: com.earth2me.essentials.libs.kyori.adventure.resource.ResourcePackRequest
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable, com.earth2me.essentials.libs.kyori.adventure.resource.ResourcePackRequestLike

Methods:
- boolean replace()
- ResourcePackRequest replace(boolean)
- ResourcePackRequest$Builder resourcePackRequest()
- ResourcePackRequest$Builder resourcePackRequest(ResourcePackRequest)
- ResourcePackCallback callback()
- ResourcePackRequest callback(ResourcePackCallback)
- ResourcePackRequest addingRequest(ResourcePackInfoLike, ResourcePackInfoLike[])
- ResourcePackRequest asResourcePackRequest()
- Component prompt()
- List packs()
- ResourcePackRequest packs(Iterable)
- boolean required()

### Class: com.earth2me.essentials.libs.kyori.adventure.resource.ResourcePackRequestLike
Type: Interface

Methods:
- ResourcePackRequest asResourcePackRequest()

### Class: com.earth2me.essentials.libs.kyori.adventure.resource.ResourcePackStatus
Type: Enum
Extends: java.lang.Enum

Methods:
- ResourcePackStatus valueOf(String)
- ResourcePackStatus[] values()
- boolean intermediate()

## Package: com.earth2me.essentials.libs.kyori.adventure.sound

### Class: com.earth2me.essentials.libs.kyori.adventure.sound.Sound
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- float volume()
- OptionalLong seed()
- SoundStop asStop()
- Sound$Builder sound()
- Sound$Builder sound(Sound)
- Sound sound(Consumer)
- Sound sound(Key, Sound$Source, float, float)
- Sound sound(Sound$Type, Sound$Source, float, float)
- Sound sound(Supplier, Sound$Source, float, float)
- Sound sound(Key, Sound$Source$Provider, float, float)
- Sound sound(Sound$Type, Sound$Source$Provider, float, float)
- Sound sound(Supplier, Sound$Source$Provider, float, float)
- Key name()
- float pitch()
- Sound$Source source()

### Class: com.earth2me.essentials.libs.kyori.adventure.sound.SoundStop
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- SoundStop all()
- SoundStop namedOnSource(Key, Sound$Source)
- SoundStop namedOnSource(Sound$Type, Sound$Source)
- SoundStop namedOnSource(Supplier, Sound$Source)
- SoundStop named(Key)
- SoundStop named(Sound$Type)
- SoundStop named(Supplier)
- Key sound()
- SoundStop source(Sound$Source)
- Sound$Source source()

## Package: com.earth2me.essentials.libs.kyori.adventure.text

### Class: com.earth2me.essentials.libs.kyori.adventure.text.BlockNBTComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.NBTComponent, com.earth2me.essentials.libs.kyori.adventure.text.ScopedComponent

Methods:
- BlockNBTComponent localPos(double, double, double)
- BlockNBTComponent$Pos pos()
- BlockNBTComponent pos(BlockNBTComponent$Pos)
- BlockNBTComponent worldPos(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)
- Stream examinableProperties()
- BlockNBTComponent relativeWorldPos(int, int, int)
- BlockNBTComponent absoluteWorldPos(int, int, int)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.BuildableComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.util.Buildable, com.earth2me.essentials.libs.kyori.adventure.text.Component

Methods:
- ComponentBuilder toBuilder()
- Buildable$Builder toBuilder()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.Component
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.ComponentBuilderApplicable, com.earth2me.essentials.libs.kyori.adventure.text.ComponentLike, com.earth2me.essentials.libs.kyori.examination.Examinable, com.earth2me.essentials.libs.kyori.adventure.text.event.HoverEventSource, com.earth2me.essentials.libs.kyori.adventure.text.format.StyleGetter, com.earth2me.essentials.libs.kyori.adventure.text.format.StyleSetter

Methods:
- Component decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- VirtualComponent virtual(Class, VirtualComponentRenderer)
- VirtualComponent virtual(Class, VirtualComponentRenderer, Style)
- VirtualComponent virtual(Class, VirtualComponentRenderer, StyleBuilderApplicable[])
- VirtualComponent virtual(Class, VirtualComponentRenderer, Iterable)
- Component compact()
- TextColor color()
- Component color(TextColor)
- StyleSetter color(TextColor)
- EntityNBTComponent$Builder entityNBT()
- EntityNBTComponent entityNBT(Consumer)
- EntityNBTComponent entityNBT(String, String)
- Component replaceFirstText(String, ComponentLike)
- Component replaceFirstText(Pattern, Function)
- Iterable iterable(ComponentIteratorType, ComponentIteratorFlag[])
- Iterable iterable(ComponentIteratorType, Set)
- TextComponent textOfChildren(ComponentLike[])
- Map decorations()
- Component decorations(Map)
- StyleSetter decorations(Map)
- StorageNBTComponent$Builder storageNBT()
- StorageNBTComponent storageNBT(Consumer)
- StorageNBTComponent storageNBT(String, Key)
- StorageNBTComponent storageNBT(String, boolean, Key)
- StorageNBTComponent storageNBT(String, boolean, ComponentLike, Key)
- Component asComponent()
- TextComponent space()
- Component shadowColorIfAbsent(ARGBLike)
- StyleSetter shadowColorIfAbsent(ARGBLike)
- Component colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- void detectCycle(Component)
- TextComponent empty()
- HoverEvent hoverEvent()
- Component hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- BlockNBTComponent$Builder blockNBT()
- BlockNBTComponent blockNBT(Consumer)
- BlockNBTComponent blockNBT(String, BlockNBTComponent$Pos)
- BlockNBTComponent blockNBT(String, boolean, BlockNBTComponent$Pos)
- BlockNBTComponent blockNBT(String, boolean, ComponentLike, BlockNBTComponent$Pos)
- ScoreComponent$Builder score()
- ScoreComponent score(Consumer)
- ScoreComponent score(String, String)
- ScoreComponent score(String, String, String)
- Iterator iterator(ComponentIteratorType, ComponentIteratorFlag[])
- Iterator iterator(ComponentIteratorType, Set)
- TextComponent newline()
- List children()
- Component children(List)
- Component mergeStyle(Component)
- Component mergeStyle(Component, Style$Merge[])
- Component mergeStyle(Component, Set)
- Component appendNewline()
- SelectorComponent$Builder selector()
- SelectorComponent selector(Consumer)
- SelectorComponent selector(String)
- SelectorComponent selector(String, ComponentLike)
- Stream examinableProperties()
- HoverEvent asHoverEvent(UnaryOperator)
- TextComponent$Builder text()
- TextComponent text(Consumer)
- TextComponent text(String)
- TextComponent text(String, Style)
- TextComponent text(String, TextColor)
- TextComponent text(String, TextColor, TextDecoration[])
- TextComponent text(String, TextColor, Set)
- TextComponent text(boolean)
- TextComponent text(boolean, Style)
- TextComponent text(boolean, TextColor)
- TextComponent text(boolean, TextColor, TextDecoration[])
- TextComponent text(boolean, TextColor, Set)
- TextComponent text(char)
- TextComponent text(char, Style)
- TextComponent text(char, TextColor)
- TextComponent text(char, TextColor, TextDecoration[])
- TextComponent text(char, TextColor, Set)
- TextComponent text(double)
- TextComponent text(double, Style)
- TextComponent text(double, TextColor)
- TextComponent text(double, TextColor, TextDecoration[])
- TextComponent text(double, TextColor, Set)
- TextComponent text(float)
- TextComponent text(float, Style)
- TextComponent text(float, TextColor)
- TextComponent text(float, TextColor, TextDecoration[])
- TextComponent text(float, TextColor, Set)
- TextComponent text(int)
- TextComponent text(int, Style)
- TextComponent text(int, TextColor)
- TextComponent text(int, TextColor, TextDecoration[])
- TextComponent text(int, TextColor, Set)
- TextComponent text(long)
- TextComponent text(long, Style)
- TextComponent text(long, TextColor)
- TextComponent text(long, TextColor, TextDecoration[])
- TextComponent text(long, TextColor, Set)
- TextComponent join(ComponentLike, ComponentLike[])
- TextComponent join(ComponentLike, Iterable)
- Component join(JoinConfiguration$Builder, ComponentLike[])
- Component join(JoinConfiguration$Builder, Iterable)
- Component join(JoinConfiguration, ComponentLike[])
- Component join(JoinConfiguration, Iterable)
- TextDecoration$State decoration(TextDecoration)
- Component decoration(TextDecoration, boolean)
- Component decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- ShadowColor shadowColor()
- Component shadowColor(ARGBLike)
- StyleSetter shadowColor(ARGBLike)
- void componentBuilderApply(ComponentBuilder)
- TranslatableComponent$Builder translatable()
- TranslatableComponent translatable(Consumer)
- TranslatableComponent translatable(String)
- TranslatableComponent translatable(Translatable)
- TranslatableComponent translatable(String, String)
- TranslatableComponent translatable(Translatable, String)
- TranslatableComponent translatable(String, Style)
- TranslatableComponent translatable(Translatable, Style)
- TranslatableComponent translatable(String, String, Style)
- TranslatableComponent translatable(Translatable, String, Style)
- TranslatableComponent translatable(String, String, StyleBuilderApplicable[])
- TranslatableComponent translatable(Translatable, String, Iterable)
- TranslatableComponent translatable(String, String, ComponentLike[])
- TranslatableComponent translatable(Translatable, String, ComponentLike[])
- TranslatableComponent translatable(String, String, Style, ComponentLike[])
- TranslatableComponent translatable(Translatable, String, Style, ComponentLike[])
- TranslatableComponent translatable(String, String, Style, List)
- TranslatableComponent translatable(Translatable, String, Style, List)
- TranslatableComponent translatable(String, String, List, Iterable)
- TranslatableComponent translatable(Translatable, String, List, Iterable)
- TranslatableComponent translatable(String, String, List, StyleBuilderApplicable[])
- TranslatableComponent translatable(Translatable, String, List, StyleBuilderApplicable[])
- TranslatableComponent translatable(String, TextColor)
- TranslatableComponent translatable(Translatable, TextColor)
- TranslatableComponent translatable(String, TextColor, TextDecoration[])
- TranslatableComponent translatable(Translatable, TextColor, TextDecoration[])
- TranslatableComponent translatable(String, TextColor, Set)
- TranslatableComponent translatable(Translatable, TextColor, Set)
- TranslatableComponent translatable(String, ComponentLike[])
- TranslatableComponent translatable(Translatable, ComponentLike[])
- TranslatableComponent translatable(String, Style, ComponentLike[])
- TranslatableComponent translatable(Translatable, Style, ComponentLike[])
- TranslatableComponent translatable(String, TextColor, ComponentLike[])
- TranslatableComponent translatable(Translatable, TextColor, ComponentLike[])
- TranslatableComponent translatable(String, TextColor, Set, ComponentLike[])
- TranslatableComponent translatable(Translatable, TextColor, Set, ComponentLike[])
- TranslatableComponent translatable(String, List)
- TranslatableComponent translatable(Translatable, List)
- TranslatableComponent translatable(String, Style, List)
- TranslatableComponent translatable(Translatable, Style, List)
- TranslatableComponent translatable(String, TextColor, List)
- TranslatableComponent translatable(Translatable, TextColor, List)
- TranslatableComponent translatable(String, TextColor, Set, List)
- TranslatableComponent translatable(Translatable, TextColor, Set, List)
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
- KeybindComponent$Builder keybind()
- KeybindComponent keybind(Consumer)
- KeybindComponent keybind(String)
- KeybindComponent keybind(KeybindComponent$KeybindLike)
- KeybindComponent keybind(String, Style)
- KeybindComponent keybind(KeybindComponent$KeybindLike, Style)
- KeybindComponent keybind(String, TextColor)
- KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor)
- KeybindComponent keybind(String, TextColor, TextDecoration[])
- KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor, TextDecoration[])
- KeybindComponent keybind(String, TextColor, Set)
- KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor, Set)
- Collector toComponent()
- Collector toComponent(Component)
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

### Class: com.earth2me.essentials.libs.kyori.adventure.text.ComponentApplicable
Type: Interface

Methods:
- Component componentApply(Component)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.ComponentBuilder
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.builder.AbstractBuilder, com.earth2me.essentials.libs.kyori.adventure.util.Buildable$Builder, com.earth2me.essentials.libs.kyori.adventure.text.ComponentBuilderApplicable, com.earth2me.essentials.libs.kyori.adventure.text.ComponentLike, com.earth2me.essentials.libs.kyori.adventure.text.format.MutableStyleSetter

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

### Class: com.earth2me.essentials.libs.kyori.adventure.text.ComponentBuilderApplicable
Type: Interface

Methods:
- void componentBuilderApply(ComponentBuilder)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.ComponentIteratorType
Type: Interface

Methods:
- void populate(Component, Deque, Set)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.ComponentLike
Type: Interface

Methods:
- Component unbox(ComponentLike)
- List asComponents(List)
- List asComponents(List, Predicate)
- Component asComponent()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.EntityNBTComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.NBTComponent, com.earth2me.essentials.libs.kyori.adventure.text.ScopedComponent

Methods:
- String selector()
- EntityNBTComponent selector(String)
- Stream examinableProperties()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.JoinConfiguration
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.util.Buildable, com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- JoinConfiguration commas(boolean)
- Component prefix()
- Component suffix()
- JoinConfiguration noSeparators()
- JoinConfiguration separator(ComponentLike)
- Component separator()
- Predicate predicate()
- Function convertor()
- JoinConfiguration newlines()
- Component lastSeparatorIfSerial()
- JoinConfiguration spaces()
- JoinConfiguration$Builder builder()
- Component lastSeparator()
- JoinConfiguration separators(ComponentLike, ComponentLike)
- JoinConfiguration arrayLike()
- Style parentStyle()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.KeybindComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.BuildableComponent, com.earth2me.essentials.libs.kyori.adventure.text.ScopedComponent

Methods:
- String keybind()
- KeybindComponent keybind(String)
- KeybindComponent keybind(KeybindComponent$KeybindLike)
- Stream examinableProperties()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.NBTComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.BuildableComponent

Methods:
- String nbtPath()
- NBTComponent nbtPath(String)
- boolean interpret()
- NBTComponent interpret(boolean)
- Stream examinableProperties()
- Component separator()
- NBTComponent separator(ComponentLike)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.NBTComponentBuilder
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.ComponentBuilder

Methods:
- NBTComponentBuilder nbtPath(String)
- NBTComponentBuilder interpret(boolean)
- NBTComponentBuilder separator(ComponentLike)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.ScopedComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.Component

Methods:
- Component decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- Component color(TextColor)
- StyleSetter color(TextColor)
- Component appendSpace()
- Component decorations(Map)
- StyleSetter decorations(Map)
- Component asComponent()
- Component shadowColorIfAbsent(ARGBLike)
- StyleSetter shadowColorIfAbsent(ARGBLike)
- Component colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- Component hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- Component clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- Component applyFallbackStyle(StyleBuilderApplicable[])
- Component applyFallbackStyle(Style)
- Component children(List)
- Component mergeStyle(Component)
- Component mergeStyle(Component, Style$Merge[])
- Component mergeStyle(Component, Set)
- Component appendNewline()
- Component insertion(String)
- StyleSetter insertion(String)
- Component style(Style)
- Component style(Consumer)
- Component style(Style$Builder)
- Component style(Consumer, Style$Merge$Strategy)
- Component decoration(TextDecoration, boolean)
- Component decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- Component shadowColor(ARGBLike)
- StyleSetter shadowColor(ARGBLike)
- Component append(Component)
- Component append(ComponentLike)
- Component append(ComponentBuilder)
- Component font(Key)
- StyleSetter font(Key)
- Component decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.ScoreComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.BuildableComponent, com.earth2me.essentials.libs.kyori.adventure.text.ScopedComponent

Methods:
- String name()
- ScoreComponent name(String)
- Stream examinableProperties()
- String value()
- ScoreComponent value(String)
- String objective()
- ScoreComponent objective(String)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.SelectorComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.BuildableComponent, com.earth2me.essentials.libs.kyori.adventure.text.ScopedComponent

Methods:
- String pattern()
- SelectorComponent pattern(String)
- Stream examinableProperties()
- Component separator()
- SelectorComponent separator(ComponentLike)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.StorageNBTComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.NBTComponent, com.earth2me.essentials.libs.kyori.adventure.text.ScopedComponent

Methods:
- Stream examinableProperties()
- Key storage()
- StorageNBTComponent storage(Key)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.TextComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.BuildableComponent, com.earth2me.essentials.libs.kyori.adventure.text.ScopedComponent

Methods:
- TextComponent ofChildren(ComponentLike[])
- Stream examinableProperties()
- String content()
- TextComponent content(String)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.TextReplacementConfig
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.util.Buildable, com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- TextReplacementConfig$Builder builder()
- Pattern matchPattern()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.TranslatableComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.BuildableComponent, com.earth2me.essentials.libs.kyori.adventure.text.ScopedComponent

Methods:
- List args()
- TranslatableComponent args(ComponentLike[])
- TranslatableComponent args(List)
- List arguments()
- TranslatableComponent arguments(ComponentLike[])
- TranslatableComponent arguments(List)
- Stream examinableProperties()
- String fallback()
- TranslatableComponent fallback(String)
- String key()
- TranslatableComponent key(Translatable)
- TranslatableComponent key(String)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.TranslationArgument
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.TranslationArgumentLike, com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- TranslationArgument asTranslationArgument()
- TranslationArgument component(ComponentLike)
- TranslationArgument bool(boolean)
- TranslationArgument numeric(Number)
- Object value()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.TranslationArgumentLike
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.ComponentLike

Methods:
- TranslationArgument asTranslationArgument()
- Component asComponent()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.VirtualComponent
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.TextComponent

Methods:
- VirtualComponentRenderer renderer()
- Class contextType()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.VirtualComponentRenderer
Type: Interface

Methods:
- ComponentLike apply(Object)
- String fallbackString()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.AbstractComponent
Type: Abstract Class
Implements: com.earth2me.essentials.libs.kyori.adventure.text.Component

Methods:
- List children()
- int hashCode()
- boolean equals(Object)
- String toString()
- Style style()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.ComponentIteratorFlag
Type: Enum
Extends: java.lang.Enum

Methods:
- ComponentIteratorFlag valueOf(String)
- ComponentIteratorFlag[] values()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.LinearComponents
Type: Class

Methods:
- Component linear(ComponentBuilderApplicable[])

### Class: com.earth2me.essentials.libs.kyori.adventure.text.PatternReplacementResult
Type: Enum
Extends: java.lang.Enum

Methods:
- PatternReplacementResult valueOf(String)
- PatternReplacementResult[] values()

## Package: com.earth2me.essentials.libs.kyori.adventure.text.event

### Class: com.earth2me.essentials.libs.kyori.adventure.text.event.ClickCallback
Type: Interface

Methods:
- ClickCallback filter(Predicate)
- ClickCallback filter(Predicate, Consumer)
- ClickCallback requiringPermission(String)
- ClickCallback requiringPermission(String, Consumer)
- ClickCallback widen(ClickCallback, Class, Consumer)
- ClickCallback widen(ClickCallback, Class)
- void accept(Audience)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.event.DataComponentValue
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- DataComponentValue$Removed removed()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.event.HoverEventSource
Type: Interface

Methods:
- HoverEvent unbox(HoverEventSource)
- HoverEvent asHoverEvent()
- HoverEvent asHoverEvent(UnaryOperator)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.event.ClickEvent
Type: Class
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable, com.earth2me.essentials.libs.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- ClickEvent openFile(String)
- void styleApply(Style$Builder)
- ClickEvent openUrl(String)
- ClickEvent openUrl(URL)
- ClickEvent clickEvent(ClickEvent$Action, String)
- ClickEvent changePage(String)
- ClickEvent changePage(int)
- int hashCode()
- boolean equals(Object)
- ClickEvent suggestCommand(String)
- ClickEvent$Action action()
- ClickEvent callback(ClickCallback)
- ClickEvent callback(ClickCallback, ClickCallback$Options)
- ClickEvent callback(ClickCallback, Consumer)
- ClickEvent copyToClipboard(String)
- String toString()
- ClickEvent runCommand(String)
- Stream examinableProperties()
- String value()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.event.DataComponentValueConverterRegistry
Type: Class

Methods:
- DataComponentValue convert(Class, Key, DataComponentValue)
- Set knownProviders()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.event.HoverEvent
Type: Class
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable, com.earth2me.essentials.libs.kyori.adventure.text.event.HoverEventSource, com.earth2me.essentials.libs.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- HoverEvent showText(ComponentLike)
- HoverEvent showText(Component)
- HoverEvent withRenderedValue(ComponentRenderer, Object)
- void styleApply(Style$Builder)
- HoverEvent hoverEvent(HoverEvent$Action, Object)
- HoverEvent showAchievement(String)
- HoverEvent showEntity(Key, UUID)
- HoverEvent showEntity(Keyed, UUID)
- HoverEvent showEntity(Key, UUID, Component)
- HoverEvent showEntity(Keyed, UUID, Component)
- HoverEvent showEntity(HoverEvent$ShowEntity)
- int hashCode()
- boolean equals(Object)
- HoverEvent$Action action()
- HoverEvent showItem(Key, int)
- HoverEvent showItem(Keyed, int)
- HoverEvent showItem(Key, int, BinaryTagHolder)
- HoverEvent showItem(Keyed, int, BinaryTagHolder)
- HoverEvent showItem(Keyed, int, Map)
- HoverEvent showItem(HoverEvent$ShowItem)
- String toString()
- Stream examinableProperties()
- HoverEvent asHoverEvent()
- HoverEvent asHoverEvent(UnaryOperator)
- Object value()
- HoverEvent value(Object)

## Package: com.earth2me.essentials.libs.kyori.adventure.text.flattener

### Class: com.earth2me.essentials.libs.kyori.adventure.text.flattener.ComponentFlattener
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.util.Buildable

Methods:
- void flatten(Component, FlattenerListener)
- ComponentFlattener textOnly()
- ComponentFlattener$Builder builder()
- ComponentFlattener basic()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.flattener.FlattenerListener
Type: Interface

Methods:
- boolean shouldContinue()
- void pushStyle(Style)
- void component(String)
- void popStyle(Style)

## Package: com.earth2me.essentials.libs.kyori.adventure.text.format

### Class: com.earth2me.essentials.libs.kyori.adventure.text.format.MutableStyleSetter
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.format.StyleSetter

Methods:
- MutableStyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration[])
- MutableStyleSetter decorations(Map)
- MutableStyleSetter decorations(Set, boolean)
- StyleSetter decorations(Set, boolean)
- StyleSetter decorations(Map)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.format.ShadowColor
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.format.StyleBuilderApplicable, com.earth2me.essentials.libs.kyori.adventure.util.ARGBLike

Methods:
- int red()
- int green()
- int blue()
- ShadowColor lerp(float, ARGBLike, ARGBLike)
- int alpha()
- ShadowColor fromHexString(String)
- String asHexString()
- ShadowColor none()
- void styleApply(Style$Builder)
- int value()
- ShadowColor shadowColor(int)
- ShadowColor shadowColor(int, int, int, int)
- ShadowColor shadowColor(RGBLike, int)
- ShadowColor shadowColor(ARGBLike)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.format.Style
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.util.Buildable, com.earth2me.essentials.libs.kyori.examination.Examinable, com.earth2me.essentials.libs.kyori.adventure.text.format.StyleGetter, com.earth2me.essentials.libs.kyori.adventure.text.format.StyleSetter

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
- Style empty()
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
- Style$Builder style()
- Style style(Consumer)
- Style style(TextColor)
- Style style(TextDecoration)
- Style style(TextColor, TextDecoration[])
- Style style(TextColor, Set)
- Style style(StyleBuilderApplicable[])
- Style style(Iterable)
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

### Class: com.earth2me.essentials.libs.kyori.adventure.text.format.StyleBuilderApplicable
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.ComponentBuilderApplicable

Methods:
- void styleApply(Style$Builder)
- void componentBuilderApply(ComponentBuilder)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.format.StyleGetter
Type: Interface

Methods:
- HoverEvent hoverEvent()
- ClickEvent clickEvent()
- TextColor color()
- String insertion()
- Map decorations()
- boolean hasDecoration(TextDecoration)
- TextDecoration$State decoration(TextDecoration)
- ShadowColor shadowColor()
- Key font()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.format.StyleSetter
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
- StyleSetter shadowColor(ARGBLike)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter shadowColorIfAbsent(ARGBLike)
- StyleSetter colorIfAbsent(TextColor)
- StyleSetter font(Key)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.format.TextColor
Type: Interface
Implements: java.lang.Comparable, com.earth2me.essentials.libs.kyori.examination.Examinable, com.earth2me.essentials.libs.kyori.adventure.util.RGBLike, com.earth2me.essentials.libs.kyori.adventure.text.format.StyleBuilderApplicable, com.earth2me.essentials.libs.kyori.adventure.text.format.TextFormat

Methods:
- int green()
- TextColor fromCSSHexString(String)
- TextColor color(int)
- TextColor color(RGBLike)
- TextColor color(HSVLike)
- TextColor color(int, int, int)
- TextColor color(float, float, float)
- TextColor lerp(float, RGBLike, RGBLike)
- int compareTo(TextColor)
- int compareTo(Object)
- void styleApply(Style$Builder)
- int red()
- int blue()
- TextColor nearestColorTo(List, TextColor)
- TextColor fromHexString(String)
- Stream examinableProperties()
- String asHexString()
- int value()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.format.TextDecorationAndState
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable, com.earth2me.essentials.libs.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- Stream examinableProperties()
- TextDecoration$State state()
- void styleApply(Style$Builder)
- TextDecoration decoration()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.format.TextFormat
Type: Interface

No public methods found

### Class: com.earth2me.essentials.libs.kyori.adventure.text.format.NamedTextColor
Type: Class
Implements: com.earth2me.essentials.libs.kyori.adventure.text.format.TextColor

Methods:
- NamedTextColor nearestTo(TextColor)
- NamedTextColor namedColor(int)
- HSVLike asHSV()
- String toString()
- Stream examinableProperties()
- int value()
- NamedTextColor ofExact(int)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.format.TextDecoration
Type: Enum
Extends: java.lang.Enum
Implements: com.earth2me.essentials.libs.kyori.adventure.text.format.StyleBuilderApplicable, com.earth2me.essentials.libs.kyori.adventure.text.format.TextFormat

Methods:
- TextDecorationAndState as(boolean)
- TextDecorationAndState as(TextDecoration$State)
- TextDecorationAndState withState(boolean)
- TextDecorationAndState withState(TextDecoration$State)
- TextDecorationAndState withState(TriState)
- TextDecoration valueOf(String)
- TextDecoration[] values()
- String toString()
- void styleApply(Style$Builder)

## Package: com.earth2me.essentials.libs.kyori.adventure.text.minimessage

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.Context
Type: Interface

Methods:
- Pointered targetOrThrow()
- boolean emitVirtuals()
- Pointered targetAsType(Class)
- ParsingException newException(String, ArgumentQueue)
- ParsingException newException(String)
- ParsingException newException(String, Throwable, ArgumentQueue)
- Component deserialize(String)
- Component deserialize(String, TagResolver)
- Component deserialize(String, TagResolver[])
- Pointered target()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.MiniMessage
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- String escapeTags(String)
- String escapeTags(String, TagResolver)
- String escapeTags(String, TagResolver[])
- MiniMessage miniMessage()
- MiniMessage$Builder builder()
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

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.ParsingException
Type: Abstract Class
Extends: java.lang.RuntimeException

Methods:
- String originalText()
- int startIndex()
- int endIndex()
- String detailMessage()

## Package: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.TagInternals
Type: Class

Methods:
- boolean sanitizeAndCheckValidTagName(String)
- void assertValidTagName(String)
- void sanitizeAndAssertValidTagName(String)

## Package: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.ParsingExceptionImpl
Type: Class
Extends: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.ParsingException

Methods:
- String originalText()
- int startIndex()
- int endIndex()
- String getMessage()
- Token[] tokens()
- void tokens(Token[])
- String detailMessage()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.Token
Type: Class
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- int startIndex()
- int hashCode()
- int endIndex()
- boolean equals(Object)
- CharSequence get(CharSequence)
- String toString()
- List childTokens()
- void childTokens(List)
- Stream examinableProperties()
- TokenType type()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.TokenParser
Type: Class

Methods:
- String resolvePreProcessTags(String, TokenParser$TagProvider)
- void parseString(String, boolean, MatchedTokenConsumer)
- String unescape(String, int, int, IntPredicate)
- RootNode parse(TokenParser$TagProvider, Predicate, String, String, boolean) throws ParsingException
- List tokenize(String, boolean)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.TokenType
Type: Enum
Extends: java.lang.Enum

Methods:
- TokenType valueOf(String)
- TokenType[] values()

## Package: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.match

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer
Type: Abstract Class

Methods:
- Object result()
- int lastEndIndex()
- void accept(int, int, TokenType)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.match.StringResolvingMatchedTokenConsumer
Type: Class
Extends: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer

Methods:
- String result()
- Object result()
- void accept(int, int, TokenType)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.match.TokenListProducingMatchedTokenConsumer
Type: Class
Extends: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.match.MatchedTokenConsumer

Methods:
- List result()
- Object result()
- void accept(int, int, TokenType)

## Package: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.node

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.node.ElementNode
Type: Class
Implements: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tree.Node

Methods:
- String sourceMessage()
- ElementNode parent()
- Node parent()
- List unsafeChildren()
- StringBuilder buildToString(StringBuilder, int)
- List children()
- String toString()
- void addChild(ElementNode)
- Token token()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.node.RootNode
Type: Class
Extends: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.node.ElementNode
Implements: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tree.Node$Root

Methods:
- String input()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.node.TagNode
Type: Class
Extends: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.node.ElementNode

Methods:
- StringBuilder buildToString(StringBuilder, int)
- String name()
- List parts()
- Tag tag()
- void tag(Tag)
- Token token()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.node.TagPart
Type: Class
Implements: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.Tag$Argument

Methods:
- String unquoteAndEscape(String, int, int)
- String toString()
- String value()
- Token token()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.node.TextNode
Type: Class
Extends: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.node.ValueNode

No public methods found

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.node.ValueNode
Type: Abstract Class
Extends: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.parser.node.ElementNode

Methods:
- StringBuilder buildToString(StringBuilder, int)
- String value()
- Token token()

## Package: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.serializer

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.serializer.ClaimConsumer
Type: Interface

Methods:
- boolean component(Emitable)
- boolean styleClaimed(String)
- boolean componentClaimed()
- void style(String, Emitable)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.serializer.Emitable
Type: Interface

Methods:
- void emit(TokenEmitter)
- Component substitute()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver
Type: Interface

Methods:
- TagResolver claimingStyle(String, BiFunction, StyleClaim)
- TagResolver claimingStyle(Set, BiFunction, StyleClaim)
- TagResolver claimingComponent(String, BiFunction, Function)
- TagResolver claimingComponent(Set, BiFunction, Function)
- void handle(Component, ClaimConsumer)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.serializer.StyleClaim
Type: Interface

Methods:
- Emitable apply(Style)
- String claimKey()
- StyleClaim claim(String, Function, BiConsumer)
- StyleClaim claim(String, Function, Predicate, BiConsumer)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.serializer.TokenEmitter
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

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.internal.serializer.QuotingOverride
Type: Enum
Extends: java.lang.Enum

Methods:
- QuotingOverride valueOf(String)
- QuotingOverride[] values()

## Package: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.Inserting
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.Tag

Methods:
- boolean allowsChildren()
- Component value()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.Modifying
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.Tag

Methods:
- void postVisit()
- Component apply(Component, int)
- void visit(Node, int)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.ParserDirective
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.Tag

No public methods found

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.PreProcess
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.Tag

Methods:
- String value()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.Tag
Type: Interface

Methods:
- Tag styling(Consumer)
- Tag styling(StyleBuilderApplicable[])
- PreProcess preProcessParsed(String)
- Tag inserting(Component)
- Tag inserting(ComponentLike)
- Tag selfClosingInserting(Component)
- Tag selfClosingInserting(ComponentLike)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.TagPattern
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

## Package: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.resolver

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue
Type: Interface

Methods:
- Tag$Argument pop()
- void reset()
- boolean hasNext()
- Tag$Argument popOr(String)
- Tag$Argument popOr(Supplier)
- Tag$Argument peek()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.resolver.TagResolver
Type: Interface

Methods:
- TagResolver standard()
- TagResolver$Single resolver(String, Tag)
- TagResolver resolver(String, BiFunction)
- TagResolver resolver(Set, BiFunction)
- TagResolver resolver(TagResolver[])
- TagResolver resolver(Iterable)
- Tag resolve(String, ArgumentQueue, Context) throws ParsingException
- TagResolver$Builder builder()
- boolean has(String)
- Collector toTagResolver()
- TagResolver caching(TagResolver$WithoutArguments)
- TagResolver empty()

## Package: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.standard

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.standard.StandardTags
Type: Class

Methods:
- TagResolver nbt()
- TagResolver translatable()
- TagResolver color()
- TagResolver gradient()
- TagResolver decorations(TextDecoration)
- TagResolver decorations()
- TagResolver transition()
- TagResolver hoverEvent()
- TagResolver score()
- TagResolver rainbow()
- TagResolver clickEvent()
- TagResolver newline()
- TagResolver defaults()
- TagResolver pride()
- TagResolver keybind()
- TagResolver reset()
- TagResolver translatableFallback()
- TagResolver selector()
- TagResolver insertion()
- TagResolver shadowColor()
- TagResolver font()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.standard.TransitionTag
Type: Class
Implements: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tag.Inserting, com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- int hashCode()
- boolean equals(Object)
- Stream examinableProperties()
- Component value()

## Package: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tree

### Class: com.earth2me.essentials.libs.kyori.adventure.text.minimessage.tree.Node
Type: Interface

Methods:
- Node parent()
- List children()
- String toString()

## Package: com.earth2me.essentials.libs.kyori.adventure.text.renderer

### Class: com.earth2me.essentials.libs.kyori.adventure.text.renderer.ComponentRenderer
Type: Interface

Methods:
- ComponentRenderer mapContext(Function)
- Component render(Component, Object)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.renderer.AbstractComponentRenderer
Type: Abstract Class
Implements: com.earth2me.essentials.libs.kyori.adventure.text.renderer.ComponentRenderer

Methods:
- Component render(Component, Object)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.renderer.TranslatableComponentRenderer
Type: Abstract Class
Extends: com.earth2me.essentials.libs.kyori.adventure.text.renderer.AbstractComponentRenderer

Methods:
- TranslatableComponentRenderer usingTranslationSource(Translator)

## Package: com.earth2me.essentials.libs.kyori.adventure.text.serializer

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.ComponentDecoder
Type: Interface

Methods:
- Component deserializeOr(Object, Component)
- Component deserializeOrNull(Object)
- Component deserialize(Object)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.ComponentEncoder
Type: Interface

Methods:
- Object serializeOr(Component, Object)
- Object serializeOrNull(Component)
- Object serialize(Component)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.ComponentSerializer
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.serializer.ComponentEncoder, com.earth2me.essentials.libs.kyori.adventure.text.serializer.ComponentDecoder

Methods:
- Object serializeOr(Component, Object)
- Object serializeOrNull(Component)
- Object serialize(Component)
- Component deseializeOrNull(Object)
- Component deserializeOr(Object, Component)
- Component deserializeOrNull(Object)
- Component deserialize(Object)

## Package: com.earth2me.essentials.libs.kyori.adventure.text.serializer.bungeecord

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.bungeecord.BungeeComponentSerializer
Type: Class
Implements: com.earth2me.essentials.libs.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- BaseComponent[] serialize(Component)
- Object serialize(Component)
- BungeeComponentSerializer legacy()
- BungeeComponentSerializer of(GsonComponentSerializer, LegacyComponentSerializer)
- BungeeComponentSerializer get()
- boolean inject(Gson)
- boolean isNative()
- Component deserialize(BaseComponent[])
- Component deserialize(Object)

## Package: com.earth2me.essentials.libs.kyori.adventure.text.serializer.gson

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.gson.GsonComponentSerializer
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.serializer.json.JSONComponentSerializer, com.earth2me.essentials.libs.kyori.adventure.util.Buildable

Methods:
- JsonElement serializeToTree(Component)
- Component deserializeFromTree(JsonElement)
- GsonComponentSerializer$Builder builder()
- Gson serializer()
- GsonComponentSerializer colorDownsamplingGson()
- GsonComponentSerializer gson()
- UnaryOperator populator()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.gson.GsonDataComponentValue
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.event.DataComponentValue

Methods:
- GsonDataComponentValue gsonDataComponentValue(JsonElement)
- JsonElement element()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.gson.LegacyHoverEventSerializer
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.serializer.json.LegacyHoverEventSerializer

No public methods found

## Package: com.earth2me.essentials.libs.kyori.adventure.text.serializer.gson.impl

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.gson.impl.GsonDataComponentValueConverterProvider
Type: Class
Implements: com.earth2me.essentials.libs.kyori.adventure.text.event.DataComponentValueConverterRegistry$Provider

Methods:
- Iterable conversions()
- Key id()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.gson.impl.JSONComponentSerializerProviderImpl
Type: Class
Implements: com.earth2me.essentials.libs.kyori.adventure.text.serializer.json.JSONComponentSerializer$Provider, com.earth2me.essentials.libs.kyori.adventure.util.Services$Fallback

Methods:
- JSONComponentSerializer instance()
- Supplier builder()
- String toString()

## Package: com.earth2me.essentials.libs.kyori.adventure.text.serializer.gson.legacyimpl

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.gson.legacyimpl.NBTLegacyHoverEventSerializer
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.serializer.gson.LegacyHoverEventSerializer

Methods:
- LegacyHoverEventSerializer get()

## Package: com.earth2me.essentials.libs.kyori.adventure.text.serializer.json

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.json.JSONComponentSerializer
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- JSONComponentSerializer$Builder builder()
- JSONComponentSerializer json()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.json.LegacyHoverEventSerializer
Type: Interface

Methods:
- HoverEvent$ShowItem deserializeShowItem(Component) throws IOException
- HoverEvent$ShowEntity deserializeShowEntity(Component, Codec$Decoder) throws IOException
- Component serializeShowEntity(HoverEvent$ShowEntity, Codec$Encoder) throws IOException
- Component serializeShowItem(HoverEvent$ShowItem) throws IOException

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.json.JSONComponentConstants
Type: Class

No public methods found

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.json.JSONOptions
Type: Class

Methods:
- OptionState$Versioned byDataVersion()
- OptionState compatibility()

## Package: com.earth2me.essentials.libs.kyori.adventure.text.serializer.legacy

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.legacy.CharacterAndFormat
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- char character()
- List defaults()
- TextFormat format()
- boolean caseInsensitive()
- CharacterAndFormat characterAndFormat(char, TextFormat)
- CharacterAndFormat characterAndFormat(char, TextFormat, boolean)
- Stream examinableProperties()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.text.serializer.ComponentSerializer, com.earth2me.essentials.libs.kyori.adventure.util.Buildable

Methods:
- String serialize(Component)
- Object serialize(Component)
- LegacyComponentSerializer legacy(char)
- LegacyComponentSerializer$Builder builder()
- LegacyFormat parseChar(char)
- LegacyComponentSerializer legacyAmpersand()
- LegacyComponentSerializer legacySection()
- TextComponent deserialize(String)
- Component deserialize(Object)

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.legacy.LegacyFormat
Type: Class
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- TextColor color()
- int hashCode()
- boolean equals(Object)
- boolean reset()
- Stream examinableProperties()
- TextDecoration decoration()

### Class: com.earth2me.essentials.libs.kyori.adventure.text.serializer.legacy.Reset
Type: Enum
Extends: java.lang.Enum
Implements: com.earth2me.essentials.libs.kyori.adventure.text.format.TextFormat

Methods:
- Reset valueOf(String)
- Reset[] values()

## Package: com.earth2me.essentials.libs.kyori.adventure.title

### Class: com.earth2me.essentials.libs.kyori.adventure.title.Title
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- Title$Times times()
- Object part(TitlePart)
- Component subtitle()
- Title title(Component, Component)
- Title title(Component, Component, Title$Times)
- Component title()

### Class: com.earth2me.essentials.libs.kyori.adventure.title.TitlePart
Type: Interface

No public methods found

## Package: com.earth2me.essentials.libs.kyori.adventure.translation

### Class: com.earth2me.essentials.libs.kyori.adventure.translation.GlobalTranslator
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.translation.Translator, com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- TranslatableComponentRenderer renderer()
- boolean removeSource(Translator)
- boolean addSource(Translator)
- Iterable sources()
- GlobalTranslator get()
- GlobalTranslator translator()
- Component render(Component, Locale)

### Class: com.earth2me.essentials.libs.kyori.adventure.translation.Translatable
Type: Interface

Methods:
- String translationKey()

### Class: com.earth2me.essentials.libs.kyori.adventure.translation.TranslationRegistry
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.translation.Translator

Methods:
- void defaultLocale(Locale)
- boolean contains(String)
- void registerAll(Locale, Map)
- void registerAll(Locale, Path, boolean)
- void registerAll(Locale, ResourceBundle, boolean)
- void registerAll(Locale, Set, Function)
- void unregister(String)
- TranslationRegistry create(Key)
- MessageFormat translate(String, Locale)
- void register(String, Locale, MessageFormat)

### Class: com.earth2me.essentials.libs.kyori.adventure.translation.Translator
Type: Interface

Methods:
- Key name()
- TriState hasAnyTranslations()
- MessageFormat translate(String, Locale)
- Component translate(TranslatableComponent, Locale)
- Locale parseLocale(String)

## Package: com.earth2me.essentials.libs.kyori.adventure.util

### Class: com.earth2me.essentials.libs.kyori.adventure.util.ARGBLike
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.adventure.util.RGBLike

Methods:
- int alpha()

### Class: com.earth2me.essentials.libs.kyori.adventure.util.Buildable
Type: Interface

Methods:
- Buildable$Builder toBuilder()
- Buildable configureAndBuild(Buildable$Builder, Consumer)

### Class: com.earth2me.essentials.libs.kyori.adventure.util.Codec
Type: Interface

Methods:
- Object encode(Object) throws Throwable
- Codec codec(Codec$Decoder, Codec$Encoder)
- Codec of(Codec$Decoder, Codec$Encoder)
- Object decode(Object) throws Throwable

### Class: com.earth2me.essentials.libs.kyori.adventure.util.ComponentMessageThrowable
Type: Interface

Methods:
- Component getMessage(Throwable)
- Component getOrConvertMessage(Throwable)
- Component componentMessage()

### Class: com.earth2me.essentials.libs.kyori.adventure.util.HSVLike
Type: Interface
Implements: com.earth2me.essentials.libs.kyori.examination.Examinable

Methods:
- HSVLike fromRGB(int, int, int)
- float s()
- float v()
- HSVLike of(float, float, float)
- float h()
- HSVLike hsvLike(float, float, float)
- Stream examinableProperties()

### Class: com.earth2me.essentials.libs.kyori.adventure.util.InheritanceAwareMap
Type: Interface

Methods:
- InheritanceAwareMap with(Class, Object)
- boolean containsKey(Class)
- Object get(Class)
- InheritanceAwareMap$Builder builder()
- InheritanceAwareMap$Builder builder(InheritanceAwareMap)
- InheritanceAwareMap without(Class)
- InheritanceAwareMap empty()

### Class: com.earth2me.essentials.libs.kyori.adventure.util.IntFunction2
Type: Interface

Methods:
- Object apply(int, int)

### Class: com.earth2me.essentials.libs.kyori.adventure.util.PlatformAPI
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.earth2me.essentials.libs.kyori.adventure.util.RGBLike
Type: Interface

Methods:
- int red()
- int green()
- int blue()
- HSVLike asHSV()

### Class: com.earth2me.essentials.libs.kyori.adventure.util.Ticks
Type: Interface

Methods:
- Duration duration(long)

### Class: com.earth2me.essentials.libs.kyori.adventure.util.ForwardingIterator
Type: Class
Implements: java.lang.Iterable

Methods:
- Iterator iterator()
- Spliterator spliterator()

### Class: com.earth2me.essentials.libs.kyori.adventure.util.Index
Type: Class

Methods:
- Object keyOr(Object, Object)
- Object keyOrThrow(Object)
- Set keys()
- Set values()
- Map keyToValue()
- Index create(Class, Function)
- Index create(Class, Function, Enum[])
- Index create(Function, Object[])
- Index create(Function, List)
- Object valueOr(Object, Object)
- Object valueOrThrow(Object)
- Object value(Object)
- Object key(Object)
- Map valueToKey()

### Class: com.earth2me.essentials.libs.kyori.adventure.util.Listenable
Type: Abstract Class

No public methods found

### Class: com.earth2me.essentials.libs.kyori.adventure.util.MonkeyBars
Type: Class

Methods:
- List addOne(List, Object)
- List toUnmodifiableList(Function, Iterable)
- List nonEmptyArrayToList(Function, Object, Object[])
- Set enumSet(Class, Enum[])

### Class: com.earth2me.essentials.libs.kyori.adventure.util.Nag
Type: Abstract Class
Extends: java.lang.RuntimeException

Methods:
- void print(Nag)

### Class: com.earth2me.essentials.libs.kyori.adventure.util.Services
Type: Class

Methods:
- Optional serviceWithFallback(Class)
- Optional service(Class)
- Set services(Class)

### Class: com.earth2me.essentials.libs.kyori.adventure.util.ShadyPines
Type: Class

Methods:
- boolean equals(double, double)
- boolean equals(float, float)
- Set enumSet(Class, Enum[])

### Class: com.earth2me.essentials.libs.kyori.adventure.util.TriState
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean toBooleanOrElseGet(BooleanSupplier)
- TriState byBoolean(boolean)
- TriState byBoolean(Boolean)
- Boolean toBoolean()
- boolean toBooleanOrElse(boolean)
- TriState valueOf(String)
- TriState[] values()

### Class: com.earth2me.essentials.libs.kyori.adventure.util.UTF8ResourceBundleControl
Type: Class
Extends: java.util.ResourceBundle$Control

Methods:
- ResourceBundle$Control get()
- ResourceBundle newBundle(String, Locale, String, ClassLoader, boolean) throws IllegalAccessException, InstantiationException, IOException

## Package: com.earth2me.essentials.libs.kyori.examination

### Class: com.earth2me.essentials.libs.kyori.examination.Examinable
Type: Interface

Methods:
- Object examine(Examiner)
- Stream examinableProperties()
- String examinableName()

### Class: com.earth2me.essentials.libs.kyori.examination.Examiner
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

### Class: com.earth2me.essentials.libs.kyori.examination.AbstractExaminer
Type: Abstract Class
Implements: com.earth2me.essentials.libs.kyori.examination.Examiner

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

### Class: com.earth2me.essentials.libs.kyori.examination.ExaminableProperty
Type: Abstract Class

Methods:
- Object examine(Examiner)
- ExaminableProperty of(String, Object)
- ExaminableProperty of(String, String)
- ExaminableProperty of(String, boolean)
- ExaminableProperty of(String, boolean[])
- ExaminableProperty of(String, byte)
- ExaminableProperty of(String, byte[])
- ExaminableProperty of(String, char)
- ExaminableProperty of(String, char[])
- ExaminableProperty of(String, double)
- ExaminableProperty of(String, double[])
- ExaminableProperty of(String, float)
- ExaminableProperty of(String, float[])
- ExaminableProperty of(String, int)
- ExaminableProperty of(String, int[])
- ExaminableProperty of(String, long)
- ExaminableProperty of(String, long[])
- ExaminableProperty of(String, short)
- ExaminableProperty of(String, short[])
- String name()
- String toString()

## Package: com.earth2me.essentials.libs.kyori.examination.string

### Class: com.earth2me.essentials.libs.kyori.examination.string.MultiLineStringExaminer
Type: Class
Extends: com.earth2me.essentials.libs.kyori.examination.AbstractExaminer

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
- MultiLineStringExaminer simpleEscaping()

### Class: com.earth2me.essentials.libs.kyori.examination.string.StringExaminer
Type: Class
Extends: com.earth2me.essentials.libs.kyori.examination.AbstractExaminer

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
- StringExaminer simpleEscaping()

## Package: com.earth2me.essentials.libs.kyori.option

### Class: com.earth2me.essentials.libs.kyori.option.Option
Type: Interface

Methods:
- Object defaultValue()
- ValueType valueType()
- Option enumOption(String, Class, Enum)
- String id()
- Class type()
- Option booleanOption(String, boolean)

### Class: com.earth2me.essentials.libs.kyori.option.OptionSchema
Type: Interface

Methods:
- OptionState emptyState()
- OptionSchema$Mutable childSchema(OptionSchema)
- OptionState$VersionedBuilder versionedStateBuilder()
- Set knownOptions()
- boolean has(Option)
- OptionSchema$Mutable globalSchema()
- OptionState$Builder stateBuilder()
- OptionSchema$Mutable emptySchema()

### Class: com.earth2me.essentials.libs.kyori.option.OptionState
Type: Interface

Methods:
- OptionSchema schema()
- OptionState$Builder optionState()
- OptionState emptyOptionState()
- OptionState$VersionedBuilder versionedOptionState()
- boolean has(Option)
- Object value(Option)

## Package: com.earth2me.essentials.libs.kyori.option.value

### Class: com.earth2me.essentials.libs.kyori.option.value.ValueSource
Type: Interface

Methods:
- ValueSource systemProperty()
- ValueSource systemProperty(String)
- Object value(Option)
- ValueSource environmentVariable()
- ValueSource environmentVariable(String)

### Class: com.earth2me.essentials.libs.kyori.option.value.ValueType
Type: Interface

Methods:
- ValueType doubleType()
- ValueType booleanType()
- ValueType integerType()
- ValueType stringType()
- ValueType enumType(Class)
- Object parse(String) throws IllegalArgumentException
- Class type()

## Package: com.earth2me.essentials.libs.snakeyaml

### Class: com.earth2me.essentials.libs.snakeyaml.DumperOptions
Type: Class

Methods:
- boolean isAllowUnicode()
- TimeZone getTimeZone()
- void setExplicitStart(boolean)
- Map getTags()
- boolean isExplicitStart()
- boolean isProcessComments()
- void setTags(Map)
- int getWidth()
- void setIndentWithIndicator(boolean)
- DumperOptions$NonPrintableStyle getNonPrintableStyle()
- void setMaxSimpleKeyLength(int)
- void setCanonical(boolean)
- int getIndicatorIndent()
- void setDefaultScalarStyle(DumperOptions$ScalarStyle)
- DumperOptions$ScalarStyle getDefaultScalarStyle()
- void setSplitLines(boolean)
- void setIndicatorIndent(int)
- boolean getSplitLines()
- void setNonPrintableStyle(DumperOptions$NonPrintableStyle)
- void setTimeZone(TimeZone)
- void setIndent(int)
- boolean isAllowReadOnlyProperties()
- boolean isExplicitEnd()
- void setDefaultFlowStyle(DumperOptions$FlowStyle)
- void setPrettyFlow(boolean)
- DumperOptions$Version getVersion()
- void setAllowUnicode(boolean)
- boolean isPrettyFlow()
- int getIndent()
- void setProcessComments(boolean)
- DumperOptions$FlowStyle getDefaultFlowStyle()
- void setVersion(DumperOptions$Version)
- void setExplicitEnd(boolean)
- boolean getIndentWithIndicator()
- void setWidth(int)
- void setLineBreak(DumperOptions$LineBreak)
- void setAllowReadOnlyProperties(boolean)
- DumperOptions$LineBreak getLineBreak()
- int getMaxSimpleKeyLength()
- void setAnchorGenerator(AnchorGenerator)
- boolean isCanonical()
- AnchorGenerator getAnchorGenerator()

### Class: com.earth2me.essentials.libs.snakeyaml.LoaderOptions
Type: Class

Methods:
- int getMaxAliasesForCollections()
- void setMaxAliasesForCollections(int)
- void setTagInspector(TagInspector)
- LoaderOptions setProcessComments(boolean)
- void setCodePointLimit(int)
- TagInspector getTagInspector()
- int getCodePointLimit()
- void setNestingDepthLimit(int)
- boolean isProcessComments()
- boolean getAllowRecursiveKeys()
- void setWrappedToRootException(boolean)
- boolean isEnumCaseSensitive()
- void setEnumCaseSensitive(boolean)
- boolean isWrappedToRootException()
- boolean isAllowDuplicateKeys()
- void setAllowRecursiveKeys(boolean)
- void setAllowDuplicateKeys(boolean)
- int getNestingDepthLimit()

### Class: com.earth2me.essentials.libs.snakeyaml.TypeDescription
Type: Class

Methods:
- Property getProperty(String)
- Object finalizeConstruction(Object)
- Set getProperties()
- Object newInstance(Node)
- Object newInstance(String, Node)
- void substituteProperty(String, Class, String, String, Class[])
- void substituteProperty(PropertySubstitute)
- Tag getTag()
- void addPropertyParameters(String, Class[])
- void putMapPropertyType(String, Class, Class)
- Class getType()
- void setExcludes(String[])
- boolean setProperty(Object, String, Object) throws Exception
- boolean setupPropertyType(String, Node)
- String toString()
- void setPropertyUtils(PropertyUtils)
- void putListPropertyType(String, Class)
- void setIncludes(String[])

### Class: com.earth2me.essentials.libs.snakeyaml.Yaml
Type: Class

Methods:
- void setName(String)
- String dumpAsMap(Object)
- String getName()
- void addImplicitResolver(Tag, Pattern, String)
- void addImplicitResolver(Tag, Pattern, String, int)
- String dumpAll(Iterator)
- void dumpAll(Iterator, Writer)
- Iterable parse(Reader)
- Iterable loadAll(Reader)
- Iterable loadAll(String)
- Iterable loadAll(InputStream)
- Object loadAs(Reader, Class)
- Object loadAs(String, Class)
- Object loadAs(InputStream, Class)
- String dumpAs(Object, Tag, DumperOptions$FlowStyle)
- void serialize(Node, Writer)
- List serialize(Node)
- Object load(String)
- Object load(InputStream)
- Object load(Reader)
- Iterable composeAll(Reader)
- Node compose(Reader)
- void addTypeDescription(TypeDescription)
- void setBeanAccess(BeanAccess)
- String toString()
- String dump(Object)
- void dump(Object, Writer)
- Node represent(Object)

## Package: com.earth2me.essentials.libs.snakeyaml.comments

### Class: com.earth2me.essentials.libs.snakeyaml.comments.CommentEventsCollector
Type: Class

Methods:
- boolean isEmpty()
- List consume()
- Event collectEventsAndPoll(Event)
- CommentEventsCollector collectEvents()
- Event collectEvents(Event)

### Class: com.earth2me.essentials.libs.snakeyaml.comments.CommentLine
Type: Class

Methods:
- String getValue()
- CommentType getCommentType()
- Mark getStartMark()
- String toString()
- Mark getEndMark()

### Class: com.earth2me.essentials.libs.snakeyaml.comments.CommentType
Type: Enum
Extends: java.lang.Enum

Methods:
- CommentType valueOf(String)
- CommentType[] values()

## Package: com.earth2me.essentials.libs.snakeyaml.composer

### Class: com.earth2me.essentials.libs.snakeyaml.composer.Composer
Type: Class

Methods:
- Node getSingleNode()
- boolean checkNode()
- Node getNode()

### Class: com.earth2me.essentials.libs.snakeyaml.composer.ComposerException
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.error.MarkedYAMLException

No public methods found

## Package: com.earth2me.essentials.libs.snakeyaml.constructor

### Class: com.earth2me.essentials.libs.snakeyaml.constructor.Construct
Type: Interface

Methods:
- Object construct(Node)
- void construct2ndStep(Node, Object)

### Class: com.earth2me.essentials.libs.snakeyaml.constructor.AbstractConstruct
Type: Abstract Class
Implements: com.earth2me.essentials.libs.snakeyaml.constructor.Construct

Methods:
- void construct2ndStep(Node, Object)

### Class: com.earth2me.essentials.libs.snakeyaml.constructor.BaseConstructor
Type: Abstract Class

Methods:
- boolean isExplicitPropertyUtils()
- Object getSingleData(Class)
- boolean checkData()
- void setWrappedToRootException(boolean)
- boolean isEnumCaseSensitive()
- void setEnumCaseSensitive(boolean)
- boolean isWrappedToRootException()
- boolean isAllowDuplicateKeys()
- void setAllowDuplicateKeys(boolean)
- LoaderOptions getLoadingConfig()
- TypeDescription addTypeDescription(TypeDescription)
- PropertyUtils getPropertyUtils()
- void setComposer(Composer)
- void setPropertyUtils(PropertyUtils)
- Object getData() throws NoSuchElementException

### Class: com.earth2me.essentials.libs.snakeyaml.constructor.Constructor
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.constructor.SafeConstructor

No public methods found

### Class: com.earth2me.essentials.libs.snakeyaml.constructor.ConstructorException
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.error.MarkedYAMLException

No public methods found

### Class: com.earth2me.essentials.libs.snakeyaml.constructor.CustomClassLoaderConstructor
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.constructor.Constructor

No public methods found

### Class: com.earth2me.essentials.libs.snakeyaml.constructor.DuplicateKeyException
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.constructor.ConstructorException

No public methods found

### Class: com.earth2me.essentials.libs.snakeyaml.constructor.SafeConstructor
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.constructor.BaseConstructor

No public methods found

## Package: com.earth2me.essentials.libs.snakeyaml.emitter

### Class: com.earth2me.essentials.libs.snakeyaml.emitter.Emitable
Type: Interface

Methods:
- void emit(Event) throws IOException

### Class: com.earth2me.essentials.libs.snakeyaml.emitter.Emitter
Type: Class
Implements: com.earth2me.essentials.libs.snakeyaml.emitter.Emitable

Methods:
- void emit(Event) throws IOException

### Class: com.earth2me.essentials.libs.snakeyaml.emitter.EmitterException
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.error.YAMLException

No public methods found

### Class: com.earth2me.essentials.libs.snakeyaml.emitter.ScalarAnalysis
Type: Class

Methods:
- boolean isAllowFlowPlain()
- boolean isMultiline()
- String getScalar()
- boolean isAllowSingleQuoted()
- boolean isEmpty()
- boolean isAllowBlock()
- boolean isAllowBlockPlain()

## Package: com.earth2me.essentials.libs.snakeyaml.env

### Class: com.earth2me.essentials.libs.snakeyaml.env.EnvScalarConstructor
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.constructor.Constructor

Methods:
- String apply(String, String, String, String)
- String getEnv(String)

## Package: com.earth2me.essentials.libs.snakeyaml.error

### Class: com.earth2me.essentials.libs.snakeyaml.error.Mark
Type: Class
Implements: java.io.Serializable

Methods:
- String getName()
- int[] getBuffer()
- int getIndex()
- int getLine()
- int getColumn()
- String get_snippet(int, int)
- String get_snippet()
- String toString()
- int getPointer()

### Class: com.earth2me.essentials.libs.snakeyaml.error.MarkedYAMLException
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.error.YAMLException

Methods:
- String getProblem()
- Mark getProblemMark()
- Mark getContextMark()
- String getMessage()
- String toString()
- String getContext()

### Class: com.earth2me.essentials.libs.snakeyaml.error.MissingEnvironmentVariableException
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.error.YAMLException

No public methods found

### Class: com.earth2me.essentials.libs.snakeyaml.error.YAMLException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: com.earth2me.essentials.libs.snakeyaml.events

### Class: com.earth2me.essentials.libs.snakeyaml.events.AliasEvent
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.NodeEvent

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.snakeyaml.events.CollectionEndEvent
Type: Abstract Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.Event

No public methods found

### Class: com.earth2me.essentials.libs.snakeyaml.events.CollectionStartEvent
Type: Abstract Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.NodeEvent

Methods:
- DumperOptions$FlowStyle getFlowStyle()
- boolean getImplicit()
- boolean isFlow()
- String getTag()

### Class: com.earth2me.essentials.libs.snakeyaml.events.CommentEvent
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.Event

Methods:
- String getValue()
- CommentType getCommentType()
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.snakeyaml.events.DocumentEndEvent
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.Event

Methods:
- boolean getExplicit()
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.snakeyaml.events.DocumentStartEvent
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.Event

Methods:
- DumperOptions$Version getVersion()
- boolean getExplicit()
- Map getTags()
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.snakeyaml.events.Event
Type: Abstract Class

Methods:
- int hashCode()
- Mark getStartMark()
- boolean equals(Object)
- boolean is(Event$ID)
- String toString()
- Event$ID getEventId()
- Mark getEndMark()

### Class: com.earth2me.essentials.libs.snakeyaml.events.ImplicitTuple
Type: Class

Methods:
- boolean bothFalse()
- String toString()
- boolean canOmitTagInPlainScalar()
- boolean canOmitTagInNonPlainScalar()

### Class: com.earth2me.essentials.libs.snakeyaml.events.MappingEndEvent
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.CollectionEndEvent

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.snakeyaml.events.MappingStartEvent
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.CollectionStartEvent

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.snakeyaml.events.NodeEvent
Type: Abstract Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.Event

Methods:
- String getAnchor()

### Class: com.earth2me.essentials.libs.snakeyaml.events.ScalarEvent
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.NodeEvent

Methods:
- String getValue()
- boolean isPlain()
- ImplicitTuple getImplicit()
- DumperOptions$ScalarStyle getScalarStyle()
- String getTag()
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.snakeyaml.events.SequenceEndEvent
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.CollectionEndEvent

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.snakeyaml.events.SequenceStartEvent
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.CollectionStartEvent

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.snakeyaml.events.StreamEndEvent
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.Event

Methods:
- Event$ID getEventId()

### Class: com.earth2me.essentials.libs.snakeyaml.events.StreamStartEvent
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.events.Event

Methods:
- Event$ID getEventId()

## Package: com.earth2me.essentials.libs.snakeyaml.extensions.compactnotation

### Class: com.earth2me.essentials.libs.snakeyaml.extensions.compactnotation.CompactConstructor
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.constructor.Constructor

Methods:
- CompactData getCompactData(String)

### Class: com.earth2me.essentials.libs.snakeyaml.extensions.compactnotation.CompactData
Type: Class

Methods:
- String getPrefix()
- Map getProperties()
- List getArguments()
- String toString()

### Class: com.earth2me.essentials.libs.snakeyaml.extensions.compactnotation.PackageCompactConstructor
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.extensions.compactnotation.CompactConstructor

No public methods found

## Package: com.earth2me.essentials.libs.snakeyaml.external.biz.base64Coder

### Class: com.earth2me.essentials.libs.snakeyaml.external.biz.base64Coder.Base64Coder
Type: Class

Methods:
- byte[] decodeLines(String)
- char[] encode(byte[])
- char[] encode(byte[], int)
- char[] encode(byte[], int, int)
- String encodeLines(byte[])
- String encodeLines(byte[], int, int, int, String)
- String encodeString(String)
- String decodeString(String)
- byte[] decode(String)
- byte[] decode(char[])
- byte[] decode(char[], int, int)

## Package: com.earth2me.essentials.libs.snakeyaml.external.com.google.gdata.util.common.base

### Class: com.earth2me.essentials.libs.snakeyaml.external.com.google.gdata.util.common.base.Escaper
Type: Interface

Methods:
- String escape(String)
- Appendable escape(Appendable)

### Class: com.earth2me.essentials.libs.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper

Methods:
- String escape(String)

### Class: com.earth2me.essentials.libs.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper
Type: Abstract Class
Implements: com.earth2me.essentials.libs.snakeyaml.external.com.google.gdata.util.common.base.Escaper

Methods:
- String escape(String)
- Appendable escape(Appendable)

## Package: com.earth2me.essentials.libs.snakeyaml.inspector

### Class: com.earth2me.essentials.libs.snakeyaml.inspector.TagInspector
Type: Interface

Methods:
- boolean isGlobalTagAllowed(Tag)

### Class: com.earth2me.essentials.libs.snakeyaml.inspector.UnTrustedTagInspector
Type: Class
Implements: com.earth2me.essentials.libs.snakeyaml.inspector.TagInspector

Methods:
- boolean isGlobalTagAllowed(Tag)

## Package: com.earth2me.essentials.libs.snakeyaml.internal

### Class: com.earth2me.essentials.libs.snakeyaml.internal.Logger
Type: Class

Methods:
- void warn(String)
- boolean isLoggable(Logger$Level)
- Logger getLogger(String)

### Class: com.earth2me.essentials.libs.snakeyaml.internal.Logger
Type: Class

Methods:
- void warn(String)
- boolean isLoggable(Logger$Level)
- Logger getLogger(String)

## Package: com.earth2me.essentials.libs.snakeyaml.introspector

### Class: com.earth2me.essentials.libs.snakeyaml.introspector.BeanAccess
Type: Enum
Extends: java.lang.Enum

Methods:
- BeanAccess valueOf(String)
- BeanAccess[] values()

### Class: com.earth2me.essentials.libs.snakeyaml.introspector.FieldProperty
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.introspector.GenericProperty

Methods:
- void set(Object, Object) throws Exception
- Annotation getAnnotation(Class)
- Object get(Object)
- List getAnnotations()

### Class: com.earth2me.essentials.libs.snakeyaml.introspector.GenericProperty
Type: Abstract Class
Extends: com.earth2me.essentials.libs.snakeyaml.introspector.Property

Methods:
- Class[] getActualTypeArguments()

### Class: com.earth2me.essentials.libs.snakeyaml.introspector.MethodProperty
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.introspector.GenericProperty

Methods:
- void set(Object, Object) throws Exception
- Annotation getAnnotation(Class)
- Object get(Object)
- boolean isWritable()
- boolean isReadable()
- List getAnnotations()

### Class: com.earth2me.essentials.libs.snakeyaml.introspector.MissingProperty
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.introspector.Property

Methods:
- void set(Object, Object) throws Exception
- Class[] getActualTypeArguments()
- Annotation getAnnotation(Class)
- Object get(Object)
- List getAnnotations()

### Class: com.earth2me.essentials.libs.snakeyaml.introspector.Property
Type: Abstract Class
Implements: java.lang.Comparable

Methods:
- void set(Object, Object) throws Exception
- String getName()
- Class[] getActualTypeArguments()
- int compareTo(Property)
- int compareTo(Object)
- boolean isWritable()
- List getAnnotations()
- Annotation getAnnotation(Class)
- Class getType()
- int hashCode()
- boolean equals(Object)
- Object get(Object)
- String toString()
- boolean isReadable()

### Class: com.earth2me.essentials.libs.snakeyaml.introspector.PropertySubstitute
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.introspector.Property

Methods:
- String getName()
- void set(Object, Object) throws Exception
- Class[] getActualTypeArguments()
- Class getType()
- Annotation getAnnotation(Class)
- Object get(Object)
- void setTargetType(Class)
- boolean isWritable()
- boolean isReadable()
- List getAnnotations()
- void setActualTypeArguments(Class[])
- void setDelegate(Property)

### Class: com.earth2me.essentials.libs.snakeyaml.introspector.PropertyUtils
Type: Class

Methods:
- boolean isSkipMissingProperties()
- void setAllowReadOnlyProperties(boolean)
- Property getProperty(Class, String)
- Property getProperty(Class, String, BeanAccess)
- Set getProperties(Class)
- Set getProperties(Class, BeanAccess)
- void setBeanAccess(BeanAccess)
- boolean isAllowReadOnlyProperties()
- void setSkipMissingProperties(boolean)

## Package: com.earth2me.essentials.libs.snakeyaml.nodes

### Class: com.earth2me.essentials.libs.snakeyaml.nodes.AnchorNode
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.nodes.Node

Methods:
- Node getRealNode()
- NodeId getNodeId()

### Class: com.earth2me.essentials.libs.snakeyaml.nodes.CollectionNode
Type: Abstract Class
Extends: com.earth2me.essentials.libs.snakeyaml.nodes.Node

Methods:
- DumperOptions$FlowStyle getFlowStyle()
- void setFlowStyle(DumperOptions$FlowStyle)
- List getValue()
- void setEndMark(Mark)

### Class: com.earth2me.essentials.libs.snakeyaml.nodes.MappingNode
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.nodes.CollectionNode

Methods:
- void setTypes(Class, Class)
- List getValue()
- NodeId getNodeId()
- void setOnlyKeyType(Class)
- boolean isMerged()
- void setValue(List)
- String toString()
- void setMerged(boolean)

### Class: com.earth2me.essentials.libs.snakeyaml.nodes.Node
Type: Abstract Class

Methods:
- List getInLineComments()
- boolean isTwoStepsConstruction()
- NodeId getNodeId()
- Mark getStartMark()
- void setUseClassConstructor(Boolean)
- void setType(Class)
- Tag getTag()
- Mark getEndMark()
- boolean useClassConstructor()
- void setBlockComments(List)
- void setInLineComments(List)
- String getAnchor()
- void setTwoStepsConstruction(boolean)
- List getEndComments()
- Class getType()
- int hashCode()
- boolean equals(Object)
- void setAnchor(String)
- void setTag(Tag)
- List getBlockComments()
- void setEndComments(List)

### Class: com.earth2me.essentials.libs.snakeyaml.nodes.NodeId
Type: Enum
Extends: java.lang.Enum

Methods:
- NodeId valueOf(String)
- NodeId[] values()

### Class: com.earth2me.essentials.libs.snakeyaml.nodes.NodeTuple
Type: Class

Methods:
- Node getKeyNode()
- String toString()
- Node getValueNode()

### Class: com.earth2me.essentials.libs.snakeyaml.nodes.ScalarNode
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.nodes.Node

Methods:
- String getValue()
- NodeId getNodeId()
- boolean isPlain()
- String toString()
- DumperOptions$ScalarStyle getScalarStyle()

### Class: com.earth2me.essentials.libs.snakeyaml.nodes.SequenceNode
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.nodes.CollectionNode

Methods:
- List getValue()
- NodeId getNodeId()
- String toString()
- void setListType(Class)

### Class: com.earth2me.essentials.libs.snakeyaml.nodes.Tag
Type: Class

Methods:
- boolean isCustomGlobal()
- String getValue()
- int hashCode()
- boolean equals(Object)
- String toString()
- String getClassName()
- boolean isSecondary()
- boolean matches(Class)
- boolean isCompatible(Class)
- boolean startsWith(String)

## Package: com.earth2me.essentials.libs.snakeyaml.parser

### Class: com.earth2me.essentials.libs.snakeyaml.parser.Parser
Type: Interface

Methods:
- Event getEvent()
- Event peekEvent()
- boolean checkEvent(Event$ID)

### Class: com.earth2me.essentials.libs.snakeyaml.parser.ParserException
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.error.MarkedYAMLException

No public methods found

### Class: com.earth2me.essentials.libs.snakeyaml.parser.ParserImpl
Type: Class
Implements: com.earth2me.essentials.libs.snakeyaml.parser.Parser

Methods:
- Event getEvent()
- Event peekEvent()
- boolean checkEvent(Event$ID)

## Package: com.earth2me.essentials.libs.snakeyaml.reader

### Class: com.earth2me.essentials.libs.snakeyaml.reader.ReaderException
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.error.YAMLException

Methods:
- int getPosition()
- String getName()
- int getCodePoint()
- String toString()

### Class: com.earth2me.essentials.libs.snakeyaml.reader.StreamReader
Type: Class

Methods:
- Mark getMark()
- void resetDocumentIndex()
- int getIndex()
- String prefixForward(int)
- String prefix(int)
- void forward()
- void forward(int)
- int getLine()
- int getDocumentIndex()
- int getColumn()
- boolean isPrintable(String)
- boolean isPrintable(int)
- int peek()
- int peek(int)

### Class: com.earth2me.essentials.libs.snakeyaml.reader.UnicodeReader
Type: Class
Extends: java.io.Reader

Methods:
- String getEncoding()
- int read(char[], int, int) throws IOException
- void close() throws IOException

## Package: com.earth2me.essentials.libs.snakeyaml.representer

### Class: com.earth2me.essentials.libs.snakeyaml.representer.Represent
Type: Interface

Methods:
- Node representData(Object)

### Class: com.earth2me.essentials.libs.snakeyaml.representer.BaseRepresenter
Type: Abstract Class

Methods:
- DumperOptions$ScalarStyle getDefaultScalarStyle()
- void setDefaultScalarStyle(DumperOptions$ScalarStyle)
- boolean isExplicitPropertyUtils()
- DumperOptions$FlowStyle getDefaultFlowStyle()
- PropertyUtils getPropertyUtils()
- void setPropertyUtils(PropertyUtils)
- void setDefaultFlowStyle(DumperOptions$FlowStyle)
- Node represent(Object)

### Class: com.earth2me.essentials.libs.snakeyaml.representer.Representer
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.representer.SafeRepresenter

Methods:
- Tag addClassTag(Class, Tag)
- TimeZone getTimeZone()
- TypeDescription addTypeDescription(TypeDescription)
- void setTimeZone(TimeZone)
- void setPropertyUtils(PropertyUtils)

## Package: com.earth2me.essentials.libs.snakeyaml.resolver

### Class: com.earth2me.essentials.libs.snakeyaml.resolver.Resolver
Type: Class

Methods:
- Tag resolve(NodeId, String, boolean)
- void addImplicitResolver(Tag, Pattern, String)
- void addImplicitResolver(Tag, Pattern, String, int)

## Package: com.earth2me.essentials.libs.snakeyaml.scanner

### Class: com.earth2me.essentials.libs.snakeyaml.scanner.Scanner
Type: Interface

Methods:
- void resetDocumentIndex()
- Token getToken()
- Token peekToken()
- boolean checkToken(Token$ID[])

### Class: com.earth2me.essentials.libs.snakeyaml.scanner.Constant
Type: Class

Methods:
- boolean has(int)
- boolean has(int, String)
- boolean hasNo(int)
- boolean hasNo(int, String)

### Class: com.earth2me.essentials.libs.snakeyaml.scanner.ScannerException
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.error.MarkedYAMLException

No public methods found

### Class: com.earth2me.essentials.libs.snakeyaml.scanner.ScannerImpl
Type: Class
Implements: com.earth2me.essentials.libs.snakeyaml.scanner.Scanner

Methods:
- void resetDocumentIndex()
- Token getToken()
- Token peekToken()
- boolean checkToken(Token$ID[])

## Package: com.earth2me.essentials.libs.snakeyaml.serializer

### Class: com.earth2me.essentials.libs.snakeyaml.serializer.AnchorGenerator
Type: Interface

Methods:
- String nextAnchor(Node)

### Class: com.earth2me.essentials.libs.snakeyaml.serializer.NumberAnchorGenerator
Type: Class
Implements: com.earth2me.essentials.libs.snakeyaml.serializer.AnchorGenerator

Methods:
- String nextAnchor(Node)

### Class: com.earth2me.essentials.libs.snakeyaml.serializer.Serializer
Type: Class

Methods:
- void serialize(Node) throws IOException
- void close() throws IOException
- void open() throws IOException

### Class: com.earth2me.essentials.libs.snakeyaml.serializer.SerializerException
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.error.YAMLException

No public methods found

## Package: com.earth2me.essentials.libs.snakeyaml.tokens

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.AliasToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.AnchorToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.BlockEndToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.BlockEntryToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.BlockMappingStartToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.BlockSequenceStartToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.CommentToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()
- CommentType getCommentType()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.DirectiveToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- List getValue()
- Token$ID getTokenId()
- String getName()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.DocumentEndToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.DocumentStartToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.FlowEntryToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.FlowMappingEndToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.FlowMappingStartToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.FlowSequenceEndToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.FlowSequenceStartToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.KeyToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.ScalarToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()
- DumperOptions$ScalarStyle getStyle()
- boolean getPlain()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.StreamEndToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.StreamStartToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.TagToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- TagTuple getValue()
- Token$ID getTokenId()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.TagTuple
Type: Class

Methods:
- String getSuffix()
- String getHandle()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.Token
Type: Abstract Class

Methods:
- Token$ID getTokenId()
- Mark getStartMark()
- Mark getEndMark()

### Class: com.earth2me.essentials.libs.snakeyaml.tokens.ValueToken
Type: Class
Extends: com.earth2me.essentials.libs.snakeyaml.tokens.Token

Methods:
- Token$ID getTokenId()

## Package: com.earth2me.essentials.libs.snakeyaml.util

### Class: com.earth2me.essentials.libs.snakeyaml.util.ArrayStack
Type: Class

Methods:
- Object pop()
- void clear()
- boolean isEmpty()
- void push(Object)

### Class: com.earth2me.essentials.libs.snakeyaml.util.ArrayUtils
Type: Class

Methods:
- List toUnmodifiableCompositeList(Object[], Object[])
- List toUnmodifiableList(Object[])

### Class: com.earth2me.essentials.libs.snakeyaml.util.EnumUtils
Type: Class

Methods:
- Enum findEnumInsensitiveCase(Class, String)

### Class: com.earth2me.essentials.libs.snakeyaml.util.PlatformFeatureDetector
Type: Class

Methods:
- boolean isRunningOnAndroid()

### Class: com.earth2me.essentials.libs.snakeyaml.util.UriEncoder
Type: Abstract Class

Methods:
- String encode(String)
- String decode(ByteBuffer) throws CharacterCodingException
- String decode(String)

## Package: com.earth2me.essentials.messaging

### Class: com.earth2me.essentials.messaging.IMessageRecipient
Type: Interface
Implements: net.essentialsx.api.v2.services.mail.MailSender

Methods:
- void setReplyRecipient(IMessageRecipient)
- void sendTl(String, Object[])
- boolean isReachable()
- String getName()
- String tlSender(String, Object[])
- String getDisplayName()
- IMessageRecipient$MessageResponse onReceiveMessage(IMessageRecipient, String)
- void sendMessage(String)
- IMessageRecipient$MessageResponse sendMessage(IMessageRecipient, String)
- boolean isHiddenFrom(Player)
- IMessageRecipient getReplyRecipient()

### Class: com.earth2me.essentials.messaging.SimpleMessageRecipient
Type: Class
Implements: com.earth2me.essentials.messaging.IMessageRecipient

Methods:
- void setReplyRecipient(IMessageRecipient)
- void sendTl(String, Object[])
- boolean isReachable()
- String getName()
- String tlSender(String, Object[])
- UUID getUUID()
- String getDisplayName()
- IMessageRecipient$MessageResponse onReceiveMessage(IMessageRecipient, String)
- void sendMessage(String)
- IMessageRecipient$MessageResponse sendMessage(IMessageRecipient, String)
- boolean isHiddenFrom(Player)
- IMessageRecipient getReplyRecipient()

## Package: com.earth2me.essentials.metrics

### Class: com.earth2me.essentials.metrics.MetricsWrapper
Type: Class

Methods:
- void markCommand(String, boolean)
- void addCustomChart(CustomChart)

## Package: com.earth2me.essentials.paperlib

### Class: com.earth2me.essentials.paperlib.PaperLib
Type: Class

Methods:
- boolean isPaper()
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)
- CompletableFuture getChunkAtAsync(Location)
- CompletableFuture getChunkAtAsync(Location, boolean)
- CompletableFuture getChunkAtAsync(World, int, int)
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)
- int getMinecraftVersion()
- boolean isVersion(int)
- boolean isVersion(int, int)
- Environment getEnvironment()
- int getMinecraftPatchVersion()
- CompletableFuture teleportAsync(Entity, Location)
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)
- boolean isSpigot()
- CompletableFuture getChunkAtAsyncUrgently(World, int, int, boolean)
- boolean isChunkGenerated(Location)
- boolean isChunkGenerated(World, int, int)
- void setCustomEnvironment(Environment)
- void suggestPaper(Plugin)
- void suggestPaper(Plugin, Level)
- BlockStateSnapshotResult getBlockState(Block, boolean)
- int getMinecraftPreReleaseVersion()

## Package: com.earth2me.essentials.paperlib.environments

### Class: com.earth2me.essentials.paperlib.environments.CraftBukkitEnvironment
Type: Class
Extends: com.earth2me.essentials.paperlib.environments.Environment

Methods:
- String getName()

### Class: com.earth2me.essentials.paperlib.environments.Environment
Type: Abstract Class

Methods:
- CompletableFuture getChunkAtAsyncUrgently(World, int, int, boolean)
- boolean isPaper()
- boolean isChunkGenerated(World, int, int)
- String getName()
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)
- CompletableFuture teleport(Entity, Location, PlayerTeleportEvent$TeleportCause)
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)
- int getMinecraftVersion()
- boolean isVersion(int)
- boolean isVersion(int, int)
- BlockStateSnapshotResult getBlockState(Block, boolean)
- int getMinecraftPreReleaseVersion()
- int getMinecraftPatchVersion()
- boolean isSpigot()

### Class: com.earth2me.essentials.paperlib.environments.PaperEnvironment
Type: Class
Extends: com.earth2me.essentials.paperlib.environments.SpigotEnvironment

Methods:
- boolean isPaper()
- String getName()

### Class: com.earth2me.essentials.paperlib.environments.SpigotEnvironment
Type: Class
Extends: com.earth2me.essentials.paperlib.environments.CraftBukkitEnvironment

Methods:
- String getName()
- boolean isSpigot()

## Package: com.earth2me.essentials.paperlib.features.asyncchunks

### Class: com.earth2me.essentials.paperlib.features.asyncchunks.AsyncChunks
Type: Interface

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.earth2me.essentials.paperlib.features.asyncchunks.AsyncChunksPaper_13
Type: Class
Implements: com.earth2me.essentials.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.earth2me.essentials.paperlib.features.asyncchunks.AsyncChunksPaper_15
Type: Class
Implements: com.earth2me.essentials.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.earth2me.essentials.paperlib.features.asyncchunks.AsyncChunksPaper_9_12
Type: Class
Implements: com.earth2me.essentials.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.earth2me.essentials.paperlib.features.asyncchunks.AsyncChunksSync
Type: Class
Implements: com.earth2me.essentials.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

## Package: com.earth2me.essentials.paperlib.features.asyncteleport

### Class: com.earth2me.essentials.paperlib.features.asyncteleport.AsyncTeleport
Type: Interface

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.earth2me.essentials.paperlib.features.asyncteleport.AsyncTeleportPaper
Type: Class
Implements: com.earth2me.essentials.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.earth2me.essentials.paperlib.features.asyncteleport.AsyncTeleportPaper_13
Type: Class
Implements: com.earth2me.essentials.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.earth2me.essentials.paperlib.features.asyncteleport.AsyncTeleportSync
Type: Class
Implements: com.earth2me.essentials.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

## Package: com.earth2me.essentials.paperlib.features.bedspawnlocation

### Class: com.earth2me.essentials.paperlib.features.bedspawnlocation.BedSpawnLocation
Type: Interface

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

### Class: com.earth2me.essentials.paperlib.features.bedspawnlocation.BedSpawnLocationPaper
Type: Class
Implements: com.earth2me.essentials.paperlib.features.bedspawnlocation.BedSpawnLocation

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

### Class: com.earth2me.essentials.paperlib.features.bedspawnlocation.BedSpawnLocationSync
Type: Class
Implements: com.earth2me.essentials.paperlib.features.bedspawnlocation.BedSpawnLocation

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

## Package: com.earth2me.essentials.paperlib.features.blockstatesnapshot

### Class: com.earth2me.essentials.paperlib.features.blockstatesnapshot.BlockStateSnapshot
Type: Interface

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.earth2me.essentials.paperlib.features.blockstatesnapshot.BlockStateSnapshotBeforeSnapshots
Type: Class
Implements: com.earth2me.essentials.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.earth2me.essentials.paperlib.features.blockstatesnapshot.BlockStateSnapshotNoOption
Type: Class
Implements: com.earth2me.essentials.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.earth2me.essentials.paperlib.features.blockstatesnapshot.BlockStateSnapshotOptionalSnapshots
Type: Class
Implements: com.earth2me.essentials.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.earth2me.essentials.paperlib.features.blockstatesnapshot.BlockStateSnapshotResult
Type: Class

Methods:
- BlockState getState()
- boolean isSnapshot()

## Package: com.earth2me.essentials.paperlib.features.chunkisgenerated

### Class: com.earth2me.essentials.paperlib.features.chunkisgenerated.ChunkIsGenerated
Type: Interface

Methods:
- boolean isChunkGenerated(World, int, int)

### Class: com.earth2me.essentials.paperlib.features.chunkisgenerated.ChunkIsGeneratedApiExists
Type: Class
Implements: com.earth2me.essentials.paperlib.features.chunkisgenerated.ChunkIsGenerated

Methods:
- boolean isChunkGenerated(World, int, int)

### Class: com.earth2me.essentials.paperlib.features.chunkisgenerated.ChunkIsGeneratedUnknown
Type: Class
Implements: com.earth2me.essentials.paperlib.features.chunkisgenerated.ChunkIsGenerated

Methods:
- boolean isChunkGenerated(World, int, int)

## Package: com.earth2me.essentials.perm

### Class: com.earth2me.essentials.perm.IPermissionsHandler
Type: Interface

Methods:
- boolean tryProvider(Essentials)
- boolean canBuild(Player, String)
- String getPrefix(Player)
- boolean removeFromGroup(OfflinePlayer, String)
- void registerContext(String, Function, Supplier)
- boolean isPermissionSet(Player, String)
- String getBackendName()
- String getSuffix(Player)
- void unregisterContexts()
- TriState isPermissionSetExact(Player, String)
- boolean hasPermission(Player, String)
- String getGroup(OfflinePlayer)
- boolean inGroup(Player, String)
- boolean addToGroup(OfflinePlayer, String)
- List getGroups(OfflinePlayer)
- List getGroups()

### Class: com.earth2me.essentials.perm.PermissionsDefaults
Type: Class

Methods:
- void registerAllBackDefaults()
- void registerAllHatDefaults()
- void registerBackDefaultFor(World)

### Class: com.earth2me.essentials.perm.PermissionsHandler
Type: Class
Implements: com.earth2me.essentials.perm.IPermissionsHandler

Methods:
- boolean tryProvider(Essentials)
- boolean canBuild(Player, String)
- String getName()
- String getPrefix(Player)
- void checkPermissions()
- boolean removeFromGroup(OfflinePlayer, String)
- void registerContext(String, Function, Supplier)
- boolean isPermissionSet(Player, String)
- String getBackendName()
- String getSuffix(Player)
- void unregisterContexts()
- TriState isPermissionSetExact(Player, String)
- boolean hasPermission(Player, String)
- String getGroup(OfflinePlayer)
- boolean inGroup(Player, String)
- boolean addToGroup(OfflinePlayer, String)
- void setUseSuperperms(boolean)
- List getGroups(OfflinePlayer)
- List getGroups()

## Package: com.earth2me.essentials.perm.impl

### Class: com.earth2me.essentials.perm.impl.AbstractVaultHandler
Type: Abstract Class
Extends: com.earth2me.essentials.perm.impl.SuperpermsHandler

Methods:
- String getBackendName()
- String getSuffix(Player)
- String getPrefix(Player)
- String getGroup(OfflinePlayer)
- boolean removeFromGroup(OfflinePlayer, String)
- boolean inGroup(Player, String)
- boolean addToGroup(OfflinePlayer, String)
- List getGroups(OfflinePlayer)
- List getGroups()

### Class: com.earth2me.essentials.perm.impl.ConfigPermissionsHandler
Type: Class
Extends: com.earth2me.essentials.perm.impl.SuperpermsHandler

Methods:
- boolean tryProvider(Essentials)
- boolean canBuild(Player, String)
- String getBackendName()
- TriState isPermissionSetExact(Player, String)
- boolean hasPermission(Player, String)

### Class: com.earth2me.essentials.perm.impl.GenericVaultHandler
Type: Class
Extends: com.earth2me.essentials.perm.impl.AbstractVaultHandler

Methods:
- boolean tryProvider(Essentials)

### Class: com.earth2me.essentials.perm.impl.LuckPermsHandler
Type: Class
Extends: com.earth2me.essentials.perm.impl.ModernVaultHandler

Methods:
- boolean tryProvider(Essentials)
- void unregisterContexts()
- void registerContext(String, Function, Supplier)

### Class: com.earth2me.essentials.perm.impl.ModernVaultHandler
Type: Class
Extends: com.earth2me.essentials.perm.impl.AbstractVaultHandler

Methods:
- boolean tryProvider(Essentials)
- boolean canBuild(Player, String)

### Class: com.earth2me.essentials.perm.impl.SuperpermsHandler
Type: Class
Implements: com.earth2me.essentials.perm.IPermissionsHandler

Methods:
- boolean tryProvider(Essentials)
- boolean canBuild(Player, String)
- String getPrefix(Player)
- boolean removeFromGroup(OfflinePlayer, String)
- void registerContext(String, Function, Supplier)
- boolean isPermissionSet(Player, String)
- String getBackendName()
- String getSuffix(Player)
- void unregisterContexts()
- TriState isPermissionSetExact(Player, String)
- boolean hasPermission(Player, String)
- String getGroup(OfflinePlayer)
- boolean inGroup(Player, String)
- boolean addToGroup(OfflinePlayer, String)
- String getEnabledPermsPlugin()
- List getGroups(OfflinePlayer)
- List getGroups()

## Package: com.earth2me.essentials.signs

### Class: com.earth2me.essentials.signs.EssentialsSign
Type: Class

Methods:
- String getSuccessName(IEssentials)
- String getSuccessName()
- String getName()
- boolean isOwner(IEssentials, User, EssentialsSign$ISign, int, String)
- boolean areHeavyEventRequired()
- String getTemplateName()
- Set getBlocks()
- void setOwnerData(IEssentials, User, EssentialsSign$ISign)
- void setOwner(IEssentials, User, EssentialsSign$ISign, int, String)
- String getUsername(User)
- boolean isValidSign(EssentialsSign$ISign)
- boolean isValidSign(IEssentials, EssentialsSign$ISign)

### Class: com.earth2me.essentials.signs.SignAnvil
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignBalance
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignBlockListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onSignBlockIgnite(BlockIgniteEvent)
- void onSignBlockPlace(BlockPlaceEvent)
- void onSignBlockBurn(BlockBurnEvent)
- void onSignSignChange2(SignChangeEvent)
- void onSignSignChange(SignChangeEvent)
- void onSignBlockPistonExtend(BlockPistonExtendEvent)
- void onSignBlockBreak(BlockBreakEvent)
- void onSignBlockPistonRetract(BlockPistonRetractEvent)
- boolean protectSignsAndBlocks(Block, Player) throws MaxMoneyException

### Class: com.earth2me.essentials.signs.SignBuy
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignCartography
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignDisposal
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignEnchant
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignEntityListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onSignEntityExplode(EntityExplodeEvent)
- void onSignEntityChangeBlock(EntityChangeBlockEvent)

### Class: com.earth2me.essentials.signs.SignException
Type: Class
Extends: net.ess3.api.TranslatableException

No public methods found

### Class: com.earth2me.essentials.signs.SignFree
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignGameMode
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignGrindstone
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignHeal
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignInfo
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignKit
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignLoom
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignMail
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignPlayerListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onSignPlayerInteract(PlayerInteractEvent)

### Class: com.earth2me.essentials.signs.SignProtection
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

Methods:
- boolean onBlockPush(Block, IEssentials)
- boolean onBlockBreak(Block, IEssentials)
- boolean areHeavyEventRequired()
- boolean hasAdjacentBlock(Block, Block[])
- boolean onBlockIgnite(Block, IEssentials)
- Set getBlocks()
- SignProtection$SignProtectionState isBlockProtected(Block, User, String, boolean)
- boolean isBlockProtected(Block)
- boolean onBlockBurn(Block, IEssentials)
- boolean onBlockExplode(Block, IEssentials)

### Class: com.earth2me.essentials.signs.SignRandomTeleport
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignRepair
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignSell
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignSmithing
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignSpawnmob
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignTime
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignTrade
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignWarp
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignWeather
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.SignWorkbench
Type: Class
Extends: com.earth2me.essentials.signs.EssentialsSign

No public methods found

### Class: com.earth2me.essentials.signs.Signs
Type: Enum
Extends: java.lang.Enum

Methods:
- EssentialsSign getSign()
- Signs valueOf(String)
- Signs[] values()

## Package: com.earth2me.essentials.textreader

### Class: com.earth2me.essentials.textreader.IResolvable
Type: Interface

Methods:
- int getLineCount()

### Class: com.earth2me.essentials.textreader.IText
Type: Interface
Implements: com.earth2me.essentials.textreader.IResolvable

Methods:
- List getChapters()
- int getLineCount()
- List getLines()
- Map getBookmarks()

### Class: com.earth2me.essentials.textreader.ITranslatableText
Type: Interface
Implements: com.earth2me.essentials.textreader.IResolvable

Methods:
- int getLineCount()
- List getLines()

### Class: com.earth2me.essentials.textreader.BookInput
Type: Class
Implements: com.earth2me.essentials.textreader.IText

Methods:
- List getChapters()
- List getLines()
- Map getBookmarks()

### Class: com.earth2me.essentials.textreader.BookPager
Type: Class

Methods:
- List getPages(String) throws Exception

### Class: com.earth2me.essentials.textreader.HelpInput
Type: Class
Implements: com.earth2me.essentials.textreader.IText

Methods:
- List getChapters()
- List getLines()
- Map getBookmarks()

### Class: com.earth2me.essentials.textreader.KeywordReplacer
Type: Class
Implements: com.earth2me.essentials.textreader.IText

Methods:
- List getChapters()
- List getLines()
- Map getBookmarks()

### Class: com.earth2me.essentials.textreader.SimpleTextInput
Type: Class
Implements: com.earth2me.essentials.textreader.IText

Methods:
- List getChapters()
- void addLine(String)
- List getLines()
- Map getBookmarks()

### Class: com.earth2me.essentials.textreader.SimpleTextPager
Type: Class

Methods:
- void showPage(CommandSource)
- void showPage(CommandSource, String, String)

### Class: com.earth2me.essentials.textreader.SimpleTranslatableText
Type: Class
Implements: com.earth2me.essentials.textreader.ITranslatableText

Methods:
- void addLine(String, Object[])
- List getLines()

### Class: com.earth2me.essentials.textreader.TextInput
Type: Class
Implements: com.earth2me.essentials.textreader.IText

Methods:
- List getChapters()
- List getLines()
- Map getBookmarks()

### Class: com.earth2me.essentials.textreader.TextPager
Type: Class

Methods:
- void showPage(String, String, String, CommandSource)

## Package: com.earth2me.essentials.updatecheck

### Class: com.earth2me.essentials.updatecheck.UpdateChecker
Type: Class

Methods:
- String getBuildInfo()
- String getVersionBranch()
- boolean isDevBuild()
- CompletableFuture fetchLatestRelease()
- Component[] getVersionMessages(boolean, boolean, CommandSource)
- String getLatestRelease()
- CompletableFuture fetchLatestDev()
- String getVersionIdentifier()

## Package: com.earth2me.essentials.userstorage

### Class: com.earth2me.essentials.userstorage.IUserMap
Type: Interface

Methods:
- int getUserCount()
- Map getNameCache()
- User loadUncachedUser(Player)
- User loadUncachedUser(UUID)
- User getUser(UUID)
- User getUser(Player)
- User getUser(String)
- long getCachedCount()
- Set getAllUserUUIDs()

### Class: com.earth2me.essentials.userstorage.ModernUUIDCache
Type: Class

Methods:
- void writeUuidCache(File, Set) throws IOException
- void writeNameUuidMap(File, Map) throws IOException
- void shutdown()

### Class: com.earth2me.essentials.userstorage.ModernUserMap
Type: Class
Extends: com.google.common.cache.CacheLoader
Implements: com.earth2me.essentials.userstorage.IUserMap

Methods:
- int getUserCount()
- Map getNameCache()
- User load(UUID) throws Exception
- Object load(Object) throws Exception
- String getSanitizedName(String)
- User loadUncachedUser(Player)
- User loadUncachedUser(UUID)
- User getUser(UUID)
- User getUser(Player)
- User getUser(String)
- void addCachedNpcName(UUID, String)
- void invalidate(UUID)
- void blockingSave()
- long getCachedCount()
- void shutdown()
- Set getAllUserUUIDs()

## Package: com.earth2me.essentials.utils

### Class: com.earth2me.essentials.utils.AdventureUtil
Type: Class

Methods:
- void setEss(IEssentials)
- String adventureToLegacy(Component)
- Component legacyToAdventure(String)
- String escapeTags(String)
- MiniMessage miniMessage()
- NamedTextColor fromChar(char)
- AdventureUtil$ParsedPlaceholder parsed(String)
- String miniToLegacy(String)
- String legacyToMini(String)
- String legacyToMini(String, boolean)

### Class: com.earth2me.essentials.utils.CommandMapUtil
Type: Class

Methods:
- JsonObject toJson(IEssentials, Map)
- JsonObject toJson(IEssentials, Command)
- String toJsonPretty(IEssentials, Map)

### Class: com.earth2me.essentials.utils.CommonPlaceholders
Type: Class

Methods:
- AdventureUtil$ParsedPlaceholder enableDisable(CommandSource, boolean)
- AdventureUtil$ParsedPlaceholder trueFalse(CommandSource, boolean)

### Class: com.earth2me.essentials.utils.DateUtil
Type: Class

Methods:
- long parseDateDiff(String, boolean) throws Exception
- long parseDateDiff(String, boolean, boolean) throws Exception
- String formatDateDiff(long)
- String formatDateDiff(Calendar, Calendar)
- String removeTimePattern(String)

### Class: com.earth2me.essentials.utils.DescParseTickFormat
Type: Class

Methods:
- boolean meansReset(String)
- String format24(long)
- String format(long)
- long hoursMinutesToTicks(int, int)
- long parse12(String) throws NumberFormatException
- String format12(long)
- long parse24(String) throws NumberFormatException
- Date ticksToDate(long)
- long parse(String) throws NumberFormatException
- String formatDateFormat(long, SimpleDateFormat)
- String formatTicks(long)
- long parseAlias(String) throws NumberFormatException
- long parseTicks(String) throws NumberFormatException

### Class: com.earth2me.essentials.utils.DownsampleUtil
Type: Class

Methods:
- String nearestTo(int)

### Class: com.earth2me.essentials.utils.EnumUtil
Type: Class

Methods:
- Material getMaterial(String[])
- Statistic getStatistic(String[])
- Enum valueOf(Class, String[])
- EntityType getEntityType(String[])
- Set getAllMatching(Class, String[])

### Class: com.earth2me.essentials.utils.FloatUtil
Type: Class

Methods:
- double parseDouble(String) throws NumberFormatException
- float parseFloat(String) throws NumberFormatException

### Class: com.earth2me.essentials.utils.FormatUtil
Type: Class

Methods:
- String formatString(IUser, String, String)
- String parseHexColor(String) throws NumberFormatException
- String stripLogColorFormat(String)
- String formatMessage(IUser, String, String)
- String unformatString(String)
- String unformatString(IUser, String, String)
- String unformatString(String, EnumSet, boolean)
- String stripMiniFormat(String)
- String lastCode(String)
- String stripFormat(String)
- String stripAnsi(String)
- boolean validIP(String)
- String stripPaper(String)
- String replaceFormat(String)
- String stripEssentialsFormat(String)

### Class: com.earth2me.essentials.utils.LocationUtil
Type: Class

Methods:
- boolean isBlockUnsafeForUser(IEssentials, IUser, World, int, int, int)
- boolean isBlockOutsideWorldBorder(World, int, int)
- Location getRoundedDestination(Location)
- int getXInsideWorldBorder(World, int)
- Location getTarget(LivingEntity) throws Exception
- Location getTarget(LivingEntity, int) throws Exception
- boolean shouldFly(IEssentials, Location)
- ItemStack convertBlockToItem(Block)
- boolean isBlockDamaging(World, int, int, int)
- int getZInsideWorldBorder(World, int)
- boolean isBlockAboveAir(IEssentials, World, int, int, int)
- void setIsWaterSafe(boolean)
- Location getSafeDestination(IUser, Location) throws Exception
- Location getSafeDestination(IEssentials, IUser, Location) throws Exception
- Location getSafeDestination(IEssentials, Location) throws Exception
- boolean isBlockUnsafe(IEssentials, World, int, int, int)

### Class: com.earth2me.essentials.utils.MaterialUtil
Type: Class

Methods:
- int getDamage(ItemStack)
- DyeColor getColorOf(Material)
- boolean isLeatherArmor(Material)
- boolean isSignPost(Material)
- boolean isPotion(Material)
- boolean isBanner(Material)
- void setDamage(ItemStack, int)
- boolean isHangingSign(Material)
- boolean isBed(Material)
- boolean isEditableBook(Material)
- Material convertFromLegacy(int, byte)
- boolean isChestplate(Material)
- boolean isSign(Material)
- boolean isFireworkCharge(Material)
- boolean isHelmet(Material)
- boolean isWallSign(Material)
- boolean isBoots(Material)
- boolean isPlayerHead(ItemStack)
- boolean isWallHangingSign(Material)
- boolean isAir(Material)
- boolean isSkull(Material)
- boolean isFirework(Material)
- boolean isLeggings(Material)

### Class: com.earth2me.essentials.utils.NumberUtil
Type: Class

Methods:
- String shortCurrency(BigDecimal, IEssentials)
- String formatDouble(double)
- boolean isLong(String)
- String formatAsPrettyCurrency(BigDecimal)
- boolean isHexadecimal(String)
- boolean isPositiveInt(String)
- String displayCurrencyExactly(BigDecimal, IEssentials)
- int constrainToRange(int, int, int)
- String formatAsCurrency(BigDecimal)
- boolean isNumeric(String)
- void internalSetPrettyFormat(NumberFormat)
- boolean isInt(String)
- String sanitizeCurrencyString(String, IEssentials)
- BigDecimal parseStringToBDecimal(String, Locale) throws ParseException, InvalidModifierException
- BigDecimal parseStringToBDecimal(String) throws ParseException, InvalidModifierException
- String displayCurrency(BigDecimal, IEssentials)

### Class: com.earth2me.essentials.utils.PasteUtil
Type: Class

Methods:
- CompletableFuture createPaste(List)

### Class: com.earth2me.essentials.utils.RegistryUtil
Type: Class

Methods:
- Object valueOf(Class, String[])
- Object[] values(Class)

### Class: com.earth2me.essentials.utils.StringUtil
Type: Class

Methods:
- String stripToNull(String)
- UUID toUUID(String)
- String sanitizeFileName(String)
- String abbreviate(String, int)
- String strip(String)
- String strip(String, String)
- String strip(String, Function)
- String joinList(Object[])
- String joinList(String, Object[])
- String joinListSkip(String, String, Object[])
- String sanitizeString(String)
- String safeString(String)

### Class: com.earth2me.essentials.utils.TriState
Type: Enum
Extends: java.lang.Enum

Methods:
- TriState valueOf(String)
- TriState[] values()

### Class: com.earth2me.essentials.utils.VersionUtil
Type: Class

Methods:
- boolean isPaper()
- boolean isServerSupported()
- VersionUtil$BukkitVersion getServerBukkitVersion()
- String getSupportStatusClass()
- VersionUtil$SupportStatus getServerSupportStatus()

## Package: net.ess3.api

### Class: net.ess3.api.IEssentials
Type: Interface
Implements: com.earth2me.essentials.IEssentials

Methods:
- CustomItemResolver getCustomItemResolver()
- Collection getVanishedPlayersNew()

### Class: net.ess3.api.II18n
Type: Interface
Implements: com.earth2me.essentials.api.II18n

No public methods found

### Class: net.ess3.api.IItemDb
Type: Interface
Implements: com.earth2me.essentials.api.IItemDb

Methods:
- String serialize(ItemStack, boolean)
- boolean isResolverPresent(Plugin, String)
- ItemStack get(String, boolean) throws Exception
- Map getResolvers()
- Map getResolvers(Plugin)
- void registerResolver(Plugin, String, IItemDb$ItemResolver) throws Exception
- IItemDb$ItemResolver getResolver(Plugin, String)
- void unregisterResolver(Plugin, String) throws Exception

### Class: net.ess3.api.IJails
Type: Interface
Implements: com.earth2me.essentials.api.IJails

No public methods found

### Class: net.ess3.api.ISettings
Type: Interface
Implements: com.earth2me.essentials.ISettings

No public methods found

### Class: net.ess3.api.ITeleport
Type: Interface
Implements: com.earth2me.essentials.api.ITeleport

No public methods found

### Class: net.ess3.api.IUser
Type: Interface
Implements: com.earth2me.essentials.IUser

No public methods found

### Class: net.ess3.api.IWarps
Type: Interface
Implements: com.earth2me.essentials.api.IWarps

No public methods found

### Class: net.ess3.api.Economy
Type: Class
Extends: com.earth2me.essentials.api.Economy

No public methods found

### Class: net.ess3.api.InvalidNameException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: net.ess3.api.InvalidWorldException
Type: Class
Extends: net.ess3.api.TranslatableException

Methods:
- String getWorld()

### Class: net.ess3.api.MaxMoneyException
Type: Class
Extends: net.ess3.api.TranslatableException

No public methods found

### Class: net.ess3.api.NoLoanPermittedException
Type: Class
Extends: net.ess3.api.TranslatableException

No public methods found

### Class: net.ess3.api.PluginKey
Type: Class

Methods:
- String getKey()
- PluginKey random(Plugin)
- int hashCode()
- boolean equals(Object)
- Plugin getPlugin()
- PluginKey fromKey(Plugin, String)
- String toString()

### Class: net.ess3.api.TranslatableException
Type: Class
Extends: java.lang.Exception

Methods:
- String getTlKey()
- String getMessage()
- TranslatableException setCause(Throwable)
- Object[] getArgs()

### Class: net.ess3.api.UserDoesNotExistException
Type: Class
Extends: net.ess3.api.TranslatableException

No public methods found

## Package: net.ess3.api.events

### Class: net.ess3.api.events.AfkStatusChangeEvent
Type: Class
Extends: net.ess3.api.events.StatusChangeEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()
- AfkStatusChangeEvent$Cause getCause()

### Class: net.ess3.api.events.FlyStatusChangeEvent
Type: Class
Extends: net.ess3.api.events.StatusChangeEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: net.ess3.api.events.GodStatusChangeEvent
Type: Class
Extends: net.ess3.api.events.StatusChangeEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: net.ess3.api.events.IgnoreStatusChangeEvent
Type: Class
Extends: net.ess3.api.events.StatusChangeEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: net.ess3.api.events.JailStatusChangeEvent
Type: Class
Extends: net.ess3.api.events.StatusChangeEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: net.ess3.api.events.KitClaimEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- IUser getUser()
- HandlerList getHandlerList()
- Kit getKit()

### Class: net.ess3.api.events.LocalChatSpyEvent
Type: Class
Extends: net.essentialsx.api.v2.events.chat.ChatEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: net.ess3.api.events.MuteStatusChangeEvent
Type: Class
Extends: net.ess3.api.events.StatusChangeEvent

Methods:
- HandlerList getHandlers()
- String getReason()
- Optional getTimestamp()
- HandlerList getHandlerList()

### Class: net.ess3.api.events.NickChangeEvent
Type: Class
Extends: net.ess3.api.events.StateChangeEvent
Implements: org.bukkit.event.Cancellable

Methods:
- String getValue()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- IUser getController()
- IUser getAffected()

### Class: net.ess3.api.events.PrivateMessagePreSendEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- HandlerList getHandlerList()
- String getMessage()
- void setMessage(String)
- IMessageRecipient getSender()
- IMessageRecipient getRecipient()

### Class: net.ess3.api.events.PrivateMessageSentEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- IMessageRecipient$MessageResponse getResponse()
- HandlerList getHandlerList()
- String getMessage()
- IMessageRecipient getSender()
- IMessageRecipient getRecipient()

### Class: net.ess3.api.events.SignBreakEvent
Type: Class
Extends: net.ess3.api.events.SignEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: net.ess3.api.events.SignCreateEvent
Type: Class
Extends: net.ess3.api.events.SignEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: net.ess3.api.events.SignEvent
Type: Abstract Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- EssentialsSign getEssentialsSign()
- void setCancelled(boolean)
- EssentialsSign$ISign getSign()
- IUser getUser()

### Class: net.ess3.api.events.SignInteractEvent
Type: Class
Extends: net.ess3.api.events.SignEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: net.ess3.api.events.SignTransactionEvent
Type: Class
Extends: net.ess3.api.events.SignInteractEvent
Implements: org.bukkit.event.Cancellable

Methods:
- BigDecimal getTransactionValue()
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- HandlerList getHandlerList()
- SignTransactionEvent$TransactionType getTransactionType()
- ItemStack getItemStack()

### Class: net.ess3.api.events.StateChangeEvent
Type: Abstract Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- IUser getController()
- IUser getAffected()

### Class: net.ess3.api.events.StatusChangeEvent
Type: Abstract Class
Extends: net.ess3.api.events.StateChangeEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean getValue()

### Class: net.ess3.api.events.TPARequestEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- IUser getTarget()
- HandlerList getHandlers()
- void setCancelled(boolean)
- HandlerList getHandlerList()
- CommandSource getRequester()
- boolean isTeleportHere()

### Class: net.ess3.api.events.UserBalanceUpdateEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- BigDecimal getOldBalance()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- UserBalanceUpdateEvent$Cause getCause()
- void setNewBalance(BigDecimal)
- BigDecimal getNewBalance()

### Class: net.ess3.api.events.UserRandomTeleportEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- double getMaxRange()
- Location getCenter()
- String getName()
- boolean isModified()
- HandlerList getHandlers()
- void setCancelled(boolean)
- IUser getUser()
- HandlerList getHandlerList()
- void setCenter(Location)
- void setMinRange(double)
- void setMaxRange(double)
- double getMinRange()

### Class: net.ess3.api.events.UserTeleportHomeEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- UserTeleportHomeEvent$HomeType getHomeType()
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- IUser getUser()
- HandlerList getHandlerList()
- Location getHomeLocation()
- String getHomeName()

### Class: net.ess3.api.events.UserWarpEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- IUser getUser()
- HandlerList getHandlerList()
- String getWarp()
- Trade getTrade()
- void setWarp(String)

### Class: net.ess3.api.events.VanishStatusChangeEvent
Type: Class
Extends: net.ess3.api.events.StatusChangeEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

## Package: net.ess3.api.events.teleport

### Class: net.ess3.api.events.teleport.PreTeleportEvent
Type: Class
Extends: net.ess3.api.events.teleport.TeleportEvent

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: net.ess3.api.events.teleport.TeleportEvent
Type: Abstract Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- ITarget getTarget()
- IUser getTeleporter()
- void setCancelled(boolean)
- PlayerTeleportEvent$TeleportCause getTeleportCause()
- IUser getTeleportee()

### Class: net.ess3.api.events.teleport.TeleportWarmupEvent
Type: Class
Extends: net.ess3.api.events.teleport.TeleportEvent

Methods:
- double getDelay()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setDelay(double)

## Package: net.ess3.nms.refl

### Class: net.ess3.nms.refl.ReflUtil
Type: Class

Methods:
- Class getOBCClass(String)
- ReflUtil$NMSVersion getNmsVersionObject()
- boolean isMojMap()
- Method getMethodCached(Class, String)
- Method getMethodCached(Class, String, Class[])
- String getNMSVersion()
- Field getFieldCached(Class, String)
- Class getNMSClass(String)
- Class getClassCached(String)
- Constructor getConstructorCached(Class)
- Constructor getConstructorCached(Class, Class[])

### Class: net.ess3.nms.refl.SpawnEggRefl
Type: Class

Methods:
- EntityType getSpawnedType()
- void setSpawnedType(EntityType)
- SpawnEggRefl fromItemStack(ItemStack) throws Exception
- ItemStack toItemStack() throws Exception
- ItemStack toItemStack(int) throws Exception
- String toString()

## Package: net.ess3.nms.refl.providers

### Class: net.ess3.nms.refl.providers.AchievementListenerProvider
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onAchievement(PlayerAchievementAwardedEvent)

### Class: net.ess3.nms.refl.providers.AdvancementListenerProvider
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onAdvancement(PlayerAdvancementDoneEvent)

### Class: net.ess3.nms.refl.providers.ReflDataWorldInfoProvider
Type: Class
Implements: net.ess3.provider.WorldInfoProvider

Methods:
- boolean test()
- int getMinHeight(World)
- int getLogicalHeight(World)
- int getMaxHeight(World)

### Class: net.ess3.nms.refl.providers.ReflFormattedCommandAliasProvider
Type: Class
Implements: net.ess3.provider.FormattedCommandAliasProvider

Methods:
- String buildCommand(FormattedCommandAlias, CommandSender, String, String[])
- List createCommands(FormattedCommandAlias, CommandSender, String[])
- String[] getFormatStrings(FormattedCommandAlias)

### Class: net.ess3.nms.refl.providers.ReflKnownCommandsProvider
Type: Class
Implements: net.ess3.provider.KnownCommandsProvider

Methods:
- Map getKnownCommands()

### Class: net.ess3.nms.refl.providers.ReflOnlineModeProvider
Type: Class
Implements: net.ess3.provider.OnlineModeProvider

Methods:
- String getOnlineModeString()

### Class: net.ess3.nms.refl.providers.ReflPersistentDataProvider
Type: Class
Implements: net.ess3.provider.PersistentDataProvider

Methods:
- void set(ItemStack, String, String)
- String getString(ItemStack, String)
- void remove(ItemStack, String)

### Class: net.ess3.nms.refl.providers.ReflServerStateProvider
Type: Class
Implements: net.ess3.provider.ServerStateProvider

Methods:
- boolean isStopping()

### Class: net.ess3.nms.refl.providers.ReflSpawnEggProvider
Type: Class
Implements: net.ess3.provider.SpawnEggProvider

Methods:
- EntityType getSpawnedType(ItemStack) throws IllegalArgumentException
- ItemStack createEggItem(EntityType) throws IllegalArgumentException
- boolean test()

### Class: net.ess3.nms.refl.providers.ReflSpawnerBlockProvider
Type: Class
Implements: net.ess3.provider.SpawnerBlockProvider

Methods:
- void setMinSpawnDelay(CreatureSpawner, int)
- void setMaxSpawnDelay(CreatureSpawner, int)

### Class: net.ess3.nms.refl.providers.ReflSyncCommandsProvider
Type: Class
Implements: net.ess3.provider.SyncCommandsProvider

Methods:
- void syncCommands()

## Package: net.ess3.provider

### Class: net.ess3.provider.AbstractChatEvent
Type: Interface

Methods:
- void addRecipient(Player)
- void removeRecipients(Predicate)
- Player getPlayer()
- boolean isCancelled()
- void setFormat(String)
- Set recipients()
- void setCancelled(boolean)
- String getMessage()
- String getFormat()
- void setMessage(String)
- boolean isAsynchronous()

### Class: net.ess3.provider.BannerDataProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- void setBaseColor(ItemStack, DyeColor)
- DyeColor getBaseColor(ItemStack)

### Class: net.ess3.provider.BiomeKeyProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- NamespacedKey getBiomeKey(Block)

### Class: net.ess3.provider.ContainerProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- InventoryView openStonecutter(Player)
- InventoryView openLoom(Player)
- InventoryView openGrindstone(Player)
- InventoryView openAnvil(Player)
- InventoryView openSmithingTable(Player)
- InventoryView openCartographyTable(Player)

### Class: net.ess3.provider.DamageEventProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- EntityDamageEvent callDamageEvent(Player, EntityDamageEvent$DamageCause, double)

### Class: net.ess3.provider.FormattedCommandAliasProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- String buildCommand(FormattedCommandAlias, CommandSender, String, String[])
- List createCommands(FormattedCommandAlias, CommandSender, String[])
- String[] getFormatStrings(FormattedCommandAlias)

### Class: net.ess3.provider.InventoryViewProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- Inventory getBottomInventory(InventoryView)
- Inventory getTopInventory(InventoryView)
- void close(InventoryView)
- void setItem(InventoryView, int, ItemStack)

### Class: net.ess3.provider.ItemUnbreakableProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- void setUnbreakable(ItemMeta, boolean)

### Class: net.ess3.provider.KnownCommandsProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- Map getKnownCommands()

### Class: net.ess3.provider.MaterialTagProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- boolean isTagged(String, Material)
- boolean tagExists(String)

### Class: net.ess3.provider.OnlineModeProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- String getOnlineModeString()

### Class: net.ess3.provider.PersistentDataProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- void set(ItemStack, String, String)
- String getString(ItemStack, String)
- void remove(ItemStack, String)

### Class: net.ess3.provider.PlayerLocaleProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- String getLocale(Player)

### Class: net.ess3.provider.PotionMetaProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- boolean isUpgraded(ItemStack)
- PotionType getBasePotionType(ItemStack)
- void setBasePotionType(ItemStack, PotionType, boolean, boolean)
- void setSplashPotion(ItemStack, boolean)
- boolean isExtended(ItemStack)
- ItemStack createPotionItem(Material, int)
- boolean isSplashPotion(ItemStack)
- Collection getCustomEffects(ItemStack)

### Class: net.ess3.provider.Provider
Type: Interface

No public methods found

### Class: net.ess3.provider.SerializationProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- byte[] serializeItem(ItemStack)
- ItemStack deserializeItem(byte[])

### Class: net.ess3.provider.ServerStateProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- boolean isStopping()

### Class: net.ess3.provider.SignDataProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- void setSignData(Sign, String, String)
- String getSignData(Sign, String)

### Class: net.ess3.provider.SpawnEggProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- EntityType getSpawnedType(ItemStack) throws IllegalArgumentException
- ItemStack createEggItem(EntityType) throws IllegalArgumentException

### Class: net.ess3.provider.SpawnerBlockProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- void setMinSpawnDelay(CreatureSpawner, int)
- void setMaxSpawnDelay(CreatureSpawner, int)

### Class: net.ess3.provider.SpawnerItemProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- EntityType getEntityType(ItemStack) throws IllegalArgumentException
- ItemStack setDisplayName(ItemStack, EntityType)
- ItemStack setEntityType(ItemStack, EntityType) throws IllegalArgumentException

### Class: net.ess3.provider.SyncCommandsProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- void syncCommands()

### Class: net.ess3.provider.TickCountProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- int getTickCount()

### Class: net.ess3.provider.WorldInfoProvider
Type: Interface
Implements: net.ess3.provider.Provider

Methods:
- int getMinHeight(World)
- int getLogicalHeight(World)
- int getMaxHeight(World)

### Class: net.ess3.provider.AbstractAchievementEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- String getName()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: net.ess3.provider.CommandSendListenerProvider
Type: Abstract Class
Implements: net.ess3.provider.Provider, org.bukkit.event.Listener

No public methods found

### Class: net.ess3.provider.LoggerProvider
Type: Abstract Class
Extends: org.bukkit.plugin.PluginLogger

Methods:
- void log(Level, String)
- void log(Level, String, Throwable)
- void log(LogRecord)
- void severe(String)
- void warning(String)
- void info(String)

### Class: net.ess3.provider.ProviderListener
Type: Abstract Class
Implements: net.ess3.provider.Provider, org.bukkit.event.Listener

No public methods found

## Package: net.ess3.provider.providers

### Class: net.ess3.provider.providers.BaseBannerDataProvider
Type: Class
Implements: net.ess3.provider.BannerDataProvider

Methods:
- void setBaseColor(ItemStack, DyeColor)
- DyeColor getBaseColor(ItemStack)
- boolean test()

### Class: net.ess3.provider.providers.BaseInventoryViewProvider
Type: Class
Implements: net.ess3.provider.InventoryViewProvider

Methods:
- Inventory getBottomInventory(InventoryView)
- Inventory getTopInventory(InventoryView)
- boolean test()
- void close(InventoryView)
- void setItem(InventoryView, int, ItemStack)

### Class: net.ess3.provider.providers.BaseLoggerProvider
Type: Class
Extends: net.ess3.provider.LoggerProvider

No public methods found

### Class: net.ess3.provider.providers.BlockMetaSpawnerItemProvider
Type: Class
Implements: net.ess3.provider.SpawnerItemProvider

Methods:
- EntityType getEntityType(ItemStack) throws IllegalArgumentException
- ItemStack setEntityType(ItemStack, EntityType) throws IllegalArgumentException

### Class: net.ess3.provider.providers.BukkitCommandSendListenerProvider
Type: Class
Extends: net.ess3.provider.CommandSendListenerProvider

Methods:
- void onCommandSend(PlayerCommandSendEvent)

### Class: net.ess3.provider.providers.BukkitMaterialTagProvider
Type: Class
Implements: net.ess3.provider.MaterialTagProvider

Methods:
- boolean isTagged(String, Material)
- boolean test()
- boolean tagExists(String)

### Class: net.ess3.provider.providers.BukkitSenderProvider
Type: Class
Implements: org.bukkit.command.CommandSender

Methods:
- Server getServer()
- Set getEffectivePermissions()
- String getName()
- void setOp(boolean)
- boolean hasPermission(String)
- boolean hasPermission(Permission)
- CommandSender$Spigot spigot()
- void sendMessage(String)
- void sendMessage(String[])
- void sendMessage(UUID, String)
- void sendMessage(UUID, String[])
- boolean isOp()
- void recalculatePermissions()
- void removeAttachment(PermissionAttachment)
- PermissionAttachment addAttachment(Plugin, String, boolean)
- PermissionAttachment addAttachment(Plugin)
- PermissionAttachment addAttachment(Plugin, String, boolean, int)
- PermissionAttachment addAttachment(Plugin, int)
- boolean isPermissionSet(String)
- boolean isPermissionSet(Permission)

### Class: net.ess3.provider.providers.BukkitSpawnerBlockProvider
Type: Class
Implements: net.ess3.provider.SpawnerBlockProvider

Methods:
- boolean test()
- void setMinSpawnDelay(CreatureSpawner, int)
- void setMaxSpawnDelay(CreatureSpawner, int)

### Class: net.ess3.provider.providers.FixedHeightWorldInfoProvider
Type: Class
Implements: net.ess3.provider.WorldInfoProvider

Methods:
- int getMinHeight(World)
- int getLogicalHeight(World)
- int getMaxHeight(World)

### Class: net.ess3.provider.providers.FlatSpawnEggProvider
Type: Class
Implements: net.ess3.provider.SpawnEggProvider

Methods:
- EntityType getSpawnedType(ItemStack) throws IllegalArgumentException
- ItemStack createEggItem(EntityType) throws IllegalArgumentException
- boolean test()

### Class: net.ess3.provider.providers.LegacyBannerDataProvider
Type: Class
Implements: net.ess3.provider.BannerDataProvider

Methods:
- void setBaseColor(ItemStack, DyeColor)
- DyeColor getBaseColor(ItemStack)

### Class: net.ess3.provider.providers.LegacyDamageEventProvider
Type: Class
Implements: net.ess3.provider.DamageEventProvider

Methods:
- EntityDamageEvent callDamageEvent(Player, EntityDamageEvent$DamageCause, double)

### Class: net.ess3.provider.providers.LegacyInventoryViewProvider
Type: Class
Implements: net.ess3.provider.InventoryViewProvider

Methods:
- Inventory getBottomInventory(InventoryView)
- Inventory getTopInventory(InventoryView)
- void close(InventoryView)
- void setItem(InventoryView, int, ItemStack)

### Class: net.ess3.provider.providers.LegacyItemUnbreakableProvider
Type: Class
Implements: net.ess3.provider.ItemUnbreakableProvider

Methods:
- void setUnbreakable(ItemMeta, boolean)

### Class: net.ess3.provider.providers.LegacyPlayerLocaleProvider
Type: Class
Implements: net.ess3.provider.PlayerLocaleProvider

Methods:
- String getLocale(Player)

### Class: net.ess3.provider.providers.LegacyPotionMetaProvider
Type: Class
Implements: net.ess3.provider.PotionMetaProvider

Methods:
- boolean isUpgraded(ItemStack)
- boolean test()
- PotionType getBasePotionType(ItemStack)
- void setBasePotionType(ItemStack, PotionType, boolean, boolean)
- void setSplashPotion(ItemStack, boolean)
- boolean isExtended(ItemStack)
- ItemStack createPotionItem(Material, int)
- boolean isSplashPotion(ItemStack)
- Collection getCustomEffects(ItemStack)

### Class: net.ess3.provider.providers.LegacySpawnEggProvider
Type: Class
Implements: net.ess3.provider.SpawnEggProvider

Methods:
- EntityType getSpawnedType(ItemStack) throws IllegalArgumentException
- ItemStack createEggItem(EntityType) throws IllegalArgumentException

### Class: net.ess3.provider.providers.ModernCommandSenderSpigotCreator
Type: Class

Methods:
- CommandSender$Spigot stupidDumbHackToMakeTheJvmHappy(BukkitSenderProvider)

### Class: net.ess3.provider.providers.ModernDamageEventProvider
Type: Class
Implements: net.ess3.provider.DamageEventProvider

Methods:
- boolean test()
- EntityDamageEvent callDamageEvent(Player, EntityDamageEvent$DamageCause, double)

### Class: net.ess3.provider.providers.ModernDataWorldInfoProvider
Type: Class
Implements: net.ess3.provider.WorldInfoProvider

Methods:
- boolean test()
- int getMinHeight(World)
- int getLogicalHeight(World)
- int getMaxHeight(World)

### Class: net.ess3.provider.providers.ModernItemUnbreakableProvider
Type: Class
Implements: net.ess3.provider.ItemUnbreakableProvider

Methods:
- boolean test()
- void setUnbreakable(ItemMeta, boolean)

### Class: net.ess3.provider.providers.ModernPersistentDataProvider
Type: Class
Implements: net.ess3.provider.PersistentDataProvider

Methods:
- void set(ItemStack, String, String)
- boolean test()
- String getString(ItemStack, String)
- void remove(ItemStack, String)

### Class: net.ess3.provider.providers.ModernPlayerLocaleProvider
Type: Class
Implements: net.ess3.provider.PlayerLocaleProvider

Methods:
- boolean test()
- String getLocale(Player)

### Class: net.ess3.provider.providers.ModernPotionMetaProvider
Type: Class
Implements: net.ess3.provider.PotionMetaProvider

Methods:
- boolean isUpgraded(ItemStack)
- boolean test()
- PotionType getBasePotionType(ItemStack)
- void setBasePotionType(ItemStack, PotionType, boolean, boolean)
- void setSplashPotion(ItemStack, boolean)
- boolean isExtended(ItemStack)
- ItemStack createPotionItem(Material, int)
- boolean isSplashPotion(ItemStack)
- Collection getCustomEffects(ItemStack)

### Class: net.ess3.provider.providers.ModernSignDataProvider
Type: Class
Implements: net.ess3.provider.SignDataProvider

Methods:
- void setSignData(Sign, String, String)
- boolean test()
- String getSignData(Sign, String)

### Class: net.ess3.provider.providers.ModernSyncCommandsProvider
Type: Class
Implements: net.ess3.provider.SyncCommandsProvider

Methods:
- boolean test()
- void syncCommands()

### Class: net.ess3.provider.providers.PaperAdvancementListenerProvider
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onAdvancement(PlayerAdvancementDoneEvent)

### Class: net.ess3.provider.providers.PaperBiomeKeyProvider
Type: Class
Implements: net.ess3.provider.BiomeKeyProvider

Methods:
- NamespacedKey getBiomeKey(Block)
- boolean test()

### Class: net.ess3.provider.providers.PaperChatEvent
Type: Class
Implements: net.ess3.provider.AbstractChatEvent

Methods:
- void addRecipient(Player)
- void removeRecipients(Predicate)
- Player getPlayer()
- boolean isCancelled()
- void setFormat(String)
- Set recipients()
- void setCancelled(boolean)
- String getMessage()
- String getFormat()
- void setMessage(String)
- boolean isAsynchronous()

### Class: net.ess3.provider.providers.PaperChatListenerProvider
Type: Abstract Class
Implements: org.bukkit.event.Listener

Methods:
- void onHighest(AsyncChatEvent)
- void onChatLowest(AbstractChatEvent)
- void onLowest(AsyncChatEvent)
- void onChatMonitor(AbstractChatEvent)
- void onChatHighest(AbstractChatEvent)
- void onMonitor(AsyncChatEvent)
- void onNormal(AsyncChatEvent)
- void onChatNormal(AbstractChatEvent)

### Class: net.ess3.provider.providers.PaperCommandSendListenerProvider
Type: Class
Extends: net.ess3.provider.CommandSendListenerProvider

Methods:
- void onAsyncCommandSend(AsyncPlayerSendCommandsEvent)

### Class: net.ess3.provider.providers.PaperCommandSender
Type: Class
Extends: net.ess3.provider.providers.BukkitSenderProvider

Methods:
- Component name()
- void sendMessage(Identity, Component, MessageType)
- void sendMessage(ComponentLike)
- void sendMessage(Identified, ComponentLike)
- void sendMessage(Identity, ComponentLike)
- void sendMessage(Component)
- void sendMessage(Identified, Component)
- void sendMessage(Identity, Component)
- void sendMessage(ComponentLike, MessageType)
- void sendMessage(Identified, ComponentLike, MessageType)
- void sendMessage(Identity, ComponentLike, MessageType)
- void sendMessage(Component, MessageType)
- void sendMessage(Identified, Component, MessageType)
- boolean forwardingSenderAvailable()
- void sendDumbComponent(Component)
- CommandSender createCommandSender(Consumer)

### Class: net.ess3.provider.providers.PaperContainerProvider
Type: Class
Implements: net.ess3.provider.ContainerProvider

Methods:
- InventoryView openStonecutter(Player)
- InventoryView openLoom(Player)
- InventoryView openGrindstone(Player)
- InventoryView openAnvil(Player)
- boolean test()
- InventoryView openSmithingTable(Player)
- InventoryView openCartographyTable(Player)

### Class: net.ess3.provider.providers.PaperKnownCommandsProvider
Type: Class
Implements: net.ess3.provider.KnownCommandsProvider

Methods:
- boolean test()
- Map getKnownCommands()

### Class: net.ess3.provider.providers.PaperLoggerProvider
Type: Class
Extends: net.ess3.provider.LoggerProvider

No public methods found

### Class: net.ess3.provider.providers.PaperMaterialTagProvider
Type: Class
Implements: net.ess3.provider.MaterialTagProvider

Methods:
- boolean isTagged(String, Material)
- boolean test()
- boolean tagExists(String)

### Class: net.ess3.provider.providers.PaperRecipeBookListener
Type: Class
Extends: net.ess3.provider.ProviderListener

Methods:
- void onPlayerRecipeBookClick(PlayerRecipeBookClickEvent)

### Class: net.ess3.provider.providers.PaperSerializationProvider
Type: Class
Implements: net.ess3.provider.SerializationProvider

Methods:
- boolean test()
- byte[] serializeItem(ItemStack)
- ItemStack deserializeItem(byte[])

### Class: net.ess3.provider.providers.PaperServerStateProvider
Type: Class
Implements: net.ess3.provider.ServerStateProvider

Methods:
- boolean test()
- boolean isStopping()

### Class: net.ess3.provider.providers.PaperTickCountProvider
Type: Class
Implements: net.ess3.provider.TickCountProvider

Methods:
- int getTickCount()
- boolean test()

### Class: net.ess3.provider.providers.PrehistoricPotionMetaProvider
Type: Class
Implements: net.ess3.provider.PotionMetaProvider

Methods:
- boolean isUpgraded(ItemStack)
- PotionType getBasePotionType(ItemStack)
- void setBasePotionType(ItemStack, PotionType, boolean, boolean)
- void setSplashPotion(ItemStack, boolean)
- boolean isExtended(ItemStack)
- ItemStack createPotionItem(Material, int)
- boolean isSplashPotion(ItemStack)
- Collection getCustomEffects(ItemStack)

## Package: net.essentialsx.api.v2

### Class: net.essentialsx.api.v2.ChatType
Type: Enum
Extends: java.lang.Enum

Methods:
- ChatType valueOf(String)
- ChatType[] values()
- String key()

## Package: net.essentialsx.api.v2.events

### Class: net.essentialsx.api.v2.events.AsyncUserDataLoadEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- String getJoinMessage()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- IUser getUser()

### Class: net.essentialsx.api.v2.events.HelpopMessageSendEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()
- String getMessage()
- IMessageRecipient getSender()
- List getRecipients()

### Class: net.essentialsx.api.v2.events.HomeModifyEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- IUser getHomeOwner()
- Location getNewLocation()
- boolean isCancelled()
- String getNewName()
- HandlerList getHandlers()
- void setCancelled(boolean)
- Location getOldLocation()
- HandlerList getHandlerList()
- IUser getUser()
- HomeModifyEvent$HomeModifyCause getCause()
- String getOldName()

### Class: net.essentialsx.api.v2.events.KitPreExpandItemsEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- List getItemStacks()
- HandlerList getHandlerList()
- String getKitName()
- IUser getUser()

### Class: net.essentialsx.api.v2.events.TeleportRequestResponseEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- IUser$TpaRequest getTpaRequest()
- IUser getRequestee()
- HandlerList getHandlers()
- void setCancelled(boolean)
- boolean isAccept()
- HandlerList getHandlerList()
- boolean isDeny()
- IUser getRequester()

### Class: net.essentialsx.api.v2.events.TransactionEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- IUser getTarget()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- CommandSource getRequester()
- BigDecimal getAmount()

### Class: net.essentialsx.api.v2.events.UserActionEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()
- IUser getUser()
- String getMessage()
- Collection getRecipients()

### Class: net.essentialsx.api.v2.events.UserKickEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- String getReason()
- HandlerList getHandlerList()
- void setReason(String)
- IUser getKicked()
- IUser getKicker()

### Class: net.essentialsx.api.v2.events.UserMailEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- HandlerList getHandlerList()
- MailMessage getMessage()
- IUser getRecipient()

### Class: net.essentialsx.api.v2.events.WarpModifyEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Location getNewLocation()
- boolean isCancelled()
- String getWarpName()
- HandlerList getHandlers()
- Location getOldLocation()
- void setCancelled(boolean)
- HandlerList getHandlerList()
- IUser getUser()
- WarpModifyEvent$WarpModifyCause getCause()

## Package: net.essentialsx.api.v2.events.chat

### Class: net.essentialsx.api.v2.events.chat.ChatEvent
Type: Abstract Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- void setFormat(String) throws IllegalFormatException, NullPointerException
- void setCancelled(boolean)
- String getMessage()
- String getFormat()
- void setMessage(String)
- Set getRecipients()
- ChatType getChatType()

### Class: net.essentialsx.api.v2.events.chat.GlobalChatEvent
Type: Class
Extends: net.essentialsx.api.v2.events.chat.ChatEvent
Implements: org.bukkit.event.Cancellable

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: net.essentialsx.api.v2.events.chat.LocalChatEvent
Type: Class
Extends: net.essentialsx.api.v2.events.chat.ChatEvent
Implements: org.bukkit.event.Cancellable

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()
- long getRadius()

## Package: net.essentialsx.api.v2.services

### Class: net.essentialsx.api.v2.services.BalanceTop
Type: Interface

Methods:
- long getCacheAge()
- BigDecimal getBalanceTopTotal()
- CompletableFuture calculateBalanceTopMapAsync()
- boolean isCacheLocked()
- Map getBalanceTopCache()

## Package: net.essentialsx.api.v2.services.mail

### Class: net.essentialsx.api.v2.services.mail.MailSender
Type: Interface

Methods:
- String getName()
- UUID getUUID()

### Class: net.essentialsx.api.v2.services.mail.MailService
Type: Interface

Methods:
- String getMailTlKey(MailMessage)
- void sendLegacyMail(IUser, String)
- String getMailLine(MailMessage)
- void sendMail(IUser, MailSender, String)
- void sendMail(IUser, MailSender, String, long)
- Object[] getMailTlArgs(MailMessage)

### Class: net.essentialsx.api.v2.services.mail.MailMessage
Type: Class

Methods:
- UUID getSenderUUID()
- boolean isLegacy()
- boolean isRead()
- String getMessage()
- boolean isExpired()
- long getTimeSent()
- String getSenderUsername()
- long getTimeExpire()

## Package: net.essentialsx.providers

### Class: net.essentialsx.providers.NullableProvider
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.essentialsx.providers.ProviderData
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- int weight()
- String description()

### Class: net.essentialsx.providers.ProviderTest
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

## Package: nu.studer.java.util

### Class: nu.studer.java.util.OrderedProperties
Type: Class
Implements: java.io.Serializable

Methods:
- String getProperty(String)
- String getProperty(String, String)
- void loadFromXML(InputStream) throws IOException, InvalidPropertiesFormatException
- Set entrySet()
- Set stringPropertyNames()
- boolean isEmpty()
- void store(OutputStream, String) throws IOException
- void store(Writer, String) throws IOException
- OrderedProperties copyOf(OrderedProperties)
- void list(PrintStream)
- void list(PrintWriter)
- void storeToXML(OutputStream, String) throws IOException
- void storeToXML(OutputStream, String, String) throws IOException
- void load(InputStream) throws IOException
- void load(Reader) throws IOException
- int size()
- int hashCode()
- Enumeration propertyNames()
- boolean equals(Object)
- String setProperty(String, String)
- Properties toJdkProperties()
- String toString()
- boolean containsProperty(String)
- String removeProperty(String)

