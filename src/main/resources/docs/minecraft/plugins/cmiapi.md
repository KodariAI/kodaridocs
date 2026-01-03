# CMI-API9.7.14.3 API Reference

## Package: com.Zrips.CMI

### Class: com.Zrips.CMI.CMI
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- DynMapManager getDynMapManager()
- WorldManager getRegionManager()
- NickNameManager getNickNameManager()
- EnderChestManager getEnderChestManager()
- SignManager getSignManager()
- SavedInventoryManager getSavedInventoryManager()
- int getViewRange(World world)
- HomeManager getHomeManager()
- ChunkPreview getChunkPreviewManager()
- DeathMessageManager getDeathMessageManager()
- HashMap<String, List<String>> preFetchNames()
- PatrolManager getPatrolManager()
- DiscordSRVManager getDiscordSRVManager()
- String getOffOn(Player player, Player whoGets)
- String getOffOn(Player player)
- String getOffOn(boolean state)
- Player getTarget(CommandSender sender, String playerName, Object cmd, boolean checkOrther, boolean inform)
- Player getTarget(CommandSender sender, String playerName, Object cmd)
- Player getTarget(CommandSender sender, String playerName, Object cmd, boolean checkOrther)
- Player getTarget(CommandSender sender, String playerName, String cmd)
- Player getTarget(CommandSender sender, String playerName, String cmd, boolean checkOther)
- Player getTarget(CommandSender sender, String playerName, String cmd, boolean checkOther, boolean inform)
- Config getConfigManager()
- JailManager getJailManager()
- CTextManager getCTextManager()
- PermissionsManager getPermissionsManager()
- void setDBClassloader()
- CitizensManager getCitizensManager()
- BlueMapManager getBlueMapManager()
- void loadMessage(Object amount, String type, Long took)
- RandomTeleportationManager getRandomTeleportationManager()
- UUID getServerUUID()
- PlayerOptionsManager getPlayerOptionsManager()
- TimedCommandManager getTimedCommandManager()
- SkinManager getSkinManager()
- WarmUpManager getWarmUpManager()
- ElytraManager getElytraManager()
- PaintingManager getPaintingManager()
- PortalManager getPortalManager()
- ArmorEffectManager getArmorEffectManager()
- ChatFormatManager getChatFormatManager()
- PlayerCombatManager getPlayerCombatManager()
- ReplaceBlock getReplaceBlockManager()
- ChunkFix getChunkFixManager()
- void setFullyLoaded(boolean fullyLoaded)
- WarpManager getWarpManager()
- boolean safeRenameFile(String file, String toFile)
- ParticleManager getParticleManager()
- ConsoleFilterManager getConsoleFilterManager()
- AliasManager getAliasManager()
- FlightChargeManager getFlightChargeManager()
- void save(Player player)
- long getServerStartupTime()
- EnchantManager getEnchantManager()
- void onDisable()
- VanishManager getVanishManager()
- boolean isServerLoaded()
- WorthManager getWorthManager()
- AnimationManager getAnimationManager()
- FindBiomeManager getFindBiomeManager()
- ChatFilterManager getChatFilterManager()
- CooldownManager getCooldownManager()
- void Enabled(boolean state)
- SpecializedCommandManager getSpecializedCommandManager()
- ChatBubbleManager getChatBubbleManager()
- **static** boolean isShuttingDown()
- TimeManager getTimeManager()
- LightFix getLightFixManager()
- Placeholder getPlaceholderAPIManager()
- ShulkerBoxManager getShulkerBoxManager()
- Player getPlayer(String playerName)
- VotifierManager getVotifierManager()
- UnloadChunks getUnloadChunksManager()
- Language getLM()
- CMIWorldChunkManager getScanManager()
- ViewRangeManager getViewRangeManager()
- HologramManager getHologramManager()
- VersionChecker getVersionCheckManager()
- Sorting getSortingManager()
- CMIMirrorManagerV2 getMirrorManagerV2()
- InteractiveCommandManager getInteractiveCommandManager()
- PacketInjector getPacketInjector()
- RegChestManager getRegChestManager()
- HashMap<String, UUID> preFetchUUIDS()
- PlayerManager getPlayerManager()
- Util getUtilManager()
- RepairManager getRepairManager()
- RecipeManager getRecipeManager()
- EventActionManager getEventActionManager()
- RankManager getRankManager()
- PlayTimeManager getPlayTimeManager()
- AfkManager getAfkManager()
- PlayTimeRewardsManager getPlayTimeRewardManager()
- void setVaultPerm(Permission vaultPerm)
- boolean isFullyLoaded()
- void performCommand(CommandSender sender, Object cls)
- V performCommand(CommandSender sender, Class<*> clas)
- void performCommand(CommandSender sender, Object cls, String cmd)
- V performCommand(CommandSender sender, Class<*> clas, String cmd)
- void performCommand(CommandSender sender, String cmd)
- SpawnerChargeManager getSpawnerChargesManager()
- BungeeCordManager getBungeeCordManager()
- TagManager getTagManager()
- SavedItemManager getSavedItemManager()
- CommandsHandler getCommandManager()
- Reflections getReflectionManager()
- void setTimer(long timer)
- long getTimer()
- Purge getPurgeManager()
- MirrorManager getMirrorManager()
- WarningManager getWarningManager()
- ArmorStandManager getArmorStandManager()
- DBManager getDbManager()
- AnvilManager getAnvilManager()
- CMIUser getUser(CommandSender sender, String playerName, Object cmd, boolean inform, boolean checkOther)
- CMIUser getUser(CommandSender sender, String playerName, Object cmd)
- CMIUser getUser(CommandSender sender, String playerName, Object cmd, boolean checkOther)
- CMIUser getUser(CommandSender sender, String playerName, String cmd)
- CMIUser getUser(CommandSender sender, String playerName, String cmd, boolean inform, boolean checkOther)
- CMIUser getUser(CommandSender sender, String playerName, String cmd, boolean inform, boolean checkOther, boolean informOnPerm)
- Lag getLagMeter()
- void onEnable()
- CustomNBTManager getCustomNBTManager()
- IpManager getIpManager()
- Reflections getRef()
- NMS getNMS()
- TabComplete getTab()
- TeleportManager getTeleportManager()
- SchedulerManager getSchedulerManager()
- TabListManager getTabListManager()
- Permission getVaultPerm()
- StatsManager getStatsManager()
- DBClassLoader getDBClassloader()
- CMICommandCostManager getCommandCostManager()
- TotemManager getTotemManager()
- TabListHeaderFooterHandler getTabListHandler()
- ScavengeManager getScavengeManager()
- SelectionManager getSelectionManager()
- void consoleMessage(String message)
- ChatManager getChatManager()
- LookupService getLookupService()
- KitsManager getKitsManager()
- void renameDirectory(String fromDir, String toDir)
- **static** CMI getInstance()
- void initLM()
- Scoreboard getSB()
- TeleportHandler getTeleportHandler()
- EconomyManager getEconomyManager()

### Class: com.Zrips.CMI.CMIOnEnable
Type: Class

Methods:
- **static** void init(CMI plugin)
- **static** void defaultLocaleDownloader()

### Class: com.Zrips.CMI.Config
Type: Class

Constructors:
- Config(CMI plugin)

Methods:
- boolean isMirrorBreakDisabled()
- String getShortDateFormat()
- boolean isPreventHook()
- boolean isOnLimitedItemUseInform()
- boolean isItemNameMarkChanged()
- String getCompassColor()
- boolean isPotionEffectsDeductWhileOffline()
- boolean isBossBarHpBarEnabled()
- List<String> getElevatorIndicators()
- String getElevatorStaticIndicator()
- List<EntityType> getGroundCleanEntityWhiteList()
- boolean isAllowRconCommands()
- int getOptimizationsSimilarCommandChecker()
- int getTeleportJumpDefault()
- boolean isChatDynMapChat()
- int getRandomTeleportCooldown()
- boolean isRepairShareAddLore()
- int getMaxHp()
- void setArmorDurabilityLossUse(boolean armorDurabilityLossUse)
- boolean isOptimizationsCommandRemoveLabel()
- int getTeleportTpaHereMaxDistance()
- long getPlayerMailExpiresIn()
- void setCMIPlayTimeTracking(boolean cMIPlayTimeTracking)
- List<String> getOptimizationsNameChangeCommands()
- boolean isExploitPatcherRiptide()
- String getCompassTargetIcon()
- List<String> getRandomTeleportExcludedBiomes()
- boolean isElytraPreventSelfDamage()
- boolean isFlyAboveRoof()
- HashMap<Material, Integer> getBlockedItems()
- boolean isTeleportTpaMove()
- void setMaintenanceMessage(String maintenanceMessage)
- int getDurabilityLossPercentage()
- CMIEffectManager$CMIParticle getPointDefaultParticle()
- boolean isToolDurabilityLossUse()
- boolean isDurabilityLossUse()
- boolean isSignEditBlocked(String line)
- boolean isAutoTimeSmooth()
- boolean isItemLoreMarkChanged()
- boolean isRepairShareBypassWithPerm()
- List<String> getCommandSpyCommandList()
- void setArmorDurabilityLossPercentage(int armorDurabilityLossPercentage)
- boolean isPreloadTopPlaytime()
- boolean isSpawnersXpDrop()
- HashMap<String, Integer> getFlyAboveRoofLimitationsMap()
- boolean isColorsMe()
- Boolean isBlackListedItemsEnabledFor(TeleportManager$TpAction action)
- boolean isBlockedSpawnReason(String worldName, CreatureSpawnEvent$SpawnReason reason)
- boolean isSellLog()
- List<String> getCleanUpWhiteList()
- boolean isPreventIronGolemRoses()
- int getCompassUpdateInterval()
- int getPlayerMailMax()
- boolean isPartialPlayerName()
- boolean isChatIgnorePublicMessage()
- boolean isNetherPortalPreventCreation()
- boolean isMulticraftDisableList()
- boolean isPreventBedExplosionNether()
- int getToolDurabilityLossPercentage()
- boolean isTeleportSwitchPlaces()
- ConfigReader getLocaleConfig()
- RandomTeleport getRandomTeleport(World w)
- RandomTeleport getRandomTeleport(World w, boolean includeDisabled)
- boolean isMaintenance()
- int getRandomTeleportMaxTries()
- ConfigReader getConfig()
- boolean isPreventEntityBoatEnterMonsters()
- boolean isOptimizationsCommandSorting()
- boolean isPreventPlayersBelowBedrock()
- String getMaintenanceMessage()
- int getBackMinDistance()
- int getLoginAutoHideFrom()
- String getCompassSpawnIcon()
- boolean isRepairShareInformWithMessage()
- boolean isExploitPatcherCheckItem()
- boolean isOverrideLoginMessage()
- void setMaintenance(boolean maintenance)
- int getTeleportTpaWarmup()
- boolean isOptimizationsSimilarCommandPrevention()
- boolean isRepairShareCancelEvent()
- boolean isPreventEntityBoatEnterAnimals()
- int getAutoTimeSmoothSpeed()
- List<Material> getGroundCleanWhiteList()
- void ChangeConfig(String path, Object list)
- void ChangeConfig(String path, Object list, boolean load)
- CText getMotd()
- HashMap<String, RandomTeleport> getRandomTeleports()
- int getRepairShareDurability()
- List<EntityType> getHpBarBlackList()
- int getArmorDurabilityLossPercentage()
- boolean isCleanRconCommands()
- List<Material> getItemLoreTypeBlackList()
- boolean isTpahereCurrentLoc()
- int getTeleportTpaMaxDistance()
- List<String> getFixWorldsToFix()
- String getElevatorIndicator()
- Location getFirstSpawnPoint()
- boolean isPreventEntityBoatEnterVillagers()
- boolean isColorsPrivateMessage()
- boolean isChatClickHoverMessages()
- int getSpyDelayForTrigger()
- boolean isSafeLocationDownThenUp()
- boolean isTpaCurrentLoc()
- boolean isInvDisableOffline()
- boolean isBossBarCompassEnabled()
- boolean isShowNewVersion()
- boolean isCMIPlayTimeTracking()
- boolean isPermisionInConsole()
- long getPlayerNotesExpiresIn()
- String getCompassDeathIcon()
- boolean isDisableRiptide()
- int getLogoutAutoHideFrom()
- List<String> getBackBlackList()
- String getLongDateFormat()
- boolean isPreventBedExplosionTheEnd()
- boolean isDisableWorldChunkCheckInfo()
- boolean isColorsPublicMessages()
- boolean isPreventExpPortals()
- boolean isRecoveryAsRegularCompass()
- boolean isChatReplyToLastMessenger()
- List<String> getCommandSpyBlackListed()
- boolean isArmorDurabilityLossUse()
- boolean isModifyChatFormat()
- boolean isRepairShareProtectCommandRepair()
- boolean LoadLang(String lang)
- boolean LoadLang(String lang, boolean isReload)
- boolean isAutoDownloadGeoIp()
- String getCompassHomeIcon()
- boolean reload()
- void reload(CommandSender sender)
- boolean isPerformCommandsOnNewName()
- boolean isRecoveryRequireCompass()
- boolean load()
- boolean load(boolean isReload)
- boolean isAutoDownloadGeoLiteCity()
- boolean isPreventPlayersOnNetherRoof()
- HashMap<CMIItemStack, String> getItemRenamingPreventMap()
- CMIItemStack getSelectionTool()
- boolean reloadLanguage()
- int getPlayerMailAllDays()
- boolean isNotesShowOnAlertEvent()
- List<String> getCustomCommandSenders()
- boolean isRepairShareProtectNormalRepair()
- boolean isPermisionOnError()
- int getNetherRoofHeight()
- String getCompassShape()
- String getBooksDefaultAuthor()
- boolean isSpawnersSupportDisabled()
- boolean isCompassRequireCompass()
- int getLastMessengerTimeOut()

### Class: com.Zrips.CMI.PlayerManager
Type: Class

Constructors:
- PlayerManager(CMI plugin)

Methods:
- CMIUserAlert getAlert(UUID uuid)
- CMILocation getLoc(YamlConfiguration conf, String path)
- void addUser(CMIUser user)
- void addUser(CMIUser user, Integer id)
- CMIUser getUserByAproxName(String name)
- void loadUserFromDb(ResultSet res)
- void addSocialSpy(UUID uuid)
- void removeSocialSpyDelayed(UUID uuid)
- void sendMessageToSpies(CommandSender sender, String senderName, Player receiver, String msg)
- void sendMessageToCommandSpies(Player sender, String msg)
- void removeSocialSpy(UUID uuid)
- boolean openMailGui(Player player, int page)
- boolean isCommandSpy(UUID uuid)
- void removeUser(CMIUser user)
- CMIUser getDuplicatedUser(String name)
- void addAlert(UUID uuid)
- void addAlert(UUID uuid, long until, String)
- Player getFakeOperator()
- void addCuffed(UUID uuid)
- void addCommandSpyDelayed(UUID uuid)
- void addCommandSpy(UUID uuid)
- CMIUser softRemoveUser(UUID uuid)
- CMIUser softRemoveUser(UUID uuid, boolean fromDataBse)
- CMIUser softRemoveUser(CMIUser user)
- CMIUser softRemoveUser(CMIUser user, boolean fromDataBse)
- void saveUser(CMIUser user)
- void forceSaveAllUsersIntoDataBase()
- Map<UUID, CMIUser> getAllUsers()
- void removeSignSpy(UUID uuid)
- void sendChatRoomMessageToSpies(CommandSender sender, String receiver, String msg)
- boolean isCuffed(Player player)
- boolean isCuffed(UUID uuid)
- void updateUserName(CMIUser user, String newName)
- void updateUserName(CMIUser user, String oldname, String newName)
- void removeCuffed(Player player)
- void removeCuffed(UUID uuid)
- void clearData()
- CMILocation convertStringToLocation(String map, boolean includeSpawnPoints)
- CMILocation convertStringToLocation(String map)
- Player getFakeOperatorRaw()
- Set<UUID> getAlerts()
- PreparedStatement savePlayerToDB(CMIUser user, PreparedStatement prest, boolean addId) throws Throwable
- int getTotalUserCount()
- Object getValueFromDb(ResultSet res, DBDAO$TablesFieldsType fieldType, String column)
- Map<String, Object> convertLoc(Location loc)
- String convertLocToString(Location loc)
- String convertLocToString(CMILocation loc)
- CMIUser getUser(Integer id)
- CMIUser getUser(String name)
- CMIUser getUser(String name, boolean includeDuplicate)
- CMIUser getUser(String name, boolean includeDuplicate, boolean checkOflline)
- CMIUser getUser(String name, boolean includeDuplicate, boolean checkOflline, boolean createFake, boolean exactName)
- CMIUser getUser(String name, boolean includeDuplicate, boolean checkOflline, boolean createFake, boolean exactName, boolean checkNickName)
- CMIUser getUser(OfflinePlayer player)
- CMIUser getUser(OfflinePlayer player, boolean createNew)
- CMIUser getUser(Player player)
- CMIUser getUser(UUID uuid)
- void loadData()
- boolean switchPlayerData(UUID source, UUID target)
- boolean switchPlayerData(CMIUser source, CMIUser target)
- CMIUser getByName(String name)
- Map<String, List<CMIUser>> getDuplicatedUsers()
- boolean isSocialSpy(UUID uuid)
- String convertBlockLocToString(Location loc)
- boolean isSignSpy(UUID uuid)
- void sendMessageToSignSpies(Player sender, String msg, Location loc)
- String convertLocToStringShortBlock(CMILocation loc)
- void addSignSpyDelayed(UUID uuid)
- void removeCommandSpy(UUID uuid)
- void addSocialSpyDelayed(UUID uuid)
- UUID getEmptyUserUUID()
- void removeCommandSpyDelayed(UUID uuid)
- String getFakeUserName()
- void addSignSpy(UUID uuid)
- boolean checkForExistingSimilarUser(CMIUser user, boolean inform)
- void removeAlert(UUID uuid)
- boolean isUserExist(UUID uuid)
- boolean addDuplicatedUser(CMIUser user)
- boolean isDuplicatedUserName(String name)
- String convertLocToStringShort(CMILocation loc)
- String convertLocToStringShort(Location loc)
- UUID getFakeUserUUID()

### Class: com.Zrips.CMI.Reflections
Type: Class

Constructors:
- Reflections(CMI plugin)

Methods:
- void respawn(Player player)
- boolean openStonecutter(Player player)
- boolean openAnvil(Player player)
- boolean openLoom(Player player)
- void printEntityNBT(Entity entity, CommandSender sender)
- void sendPacket(Object connection, Object packet)
- V printNBT(Object t, int level, CommandSender sender, List<String> path)
- boolean openSmithingTable(Player player)
- boolean openCartographyTable(Player player)
- int getPing(Player player)
- void setGameMode(Player player, GameMode mode)
- int getHoneyLevel(Block block)
- void setOnGround(Player p, boolean state)
- ItemStack tryToMakeShulkerBox(ItemStack item)
- void openBook(ItemStack i, Player p)
- void manageEnchantment(Enchantment enchant, boolean disable)
- boolean openGrindstone(Player player)
- void changePlayerLimit(int amount)
- int getBeesInside(Block block)
- Class<*> getMinecraftClass(String nmsClassString)
- void setMotd(String motd)
- void printItemNBT(ItemStack item, CommandSender sender)
- void exitBed(Player p)
- boolean openSignUI(Player player, Sign sign)
- void changeViewDistance(int amount)

### Class: com.Zrips.CMI.TabComplete
Type: Class
Implements: org.bukkit.command.TabCompleter

Constructors:
- TabComplete(CMI plugin)

Methods:
- List<String> getByAction(CommandSender sender, TabComplete$TabAction action, String args, int i)
- void addTabComplete(String tab)
- List<Object> getTabCompleteList(String args)
- String getTabComplete(String tab)
- List<String> get(CommandSender sender, String command, String label, String args)
- List<String> onTabComplete(CommandSender sender, Command command, String label, String args)

### Class: com.Zrips.CMI.TabComplete$TabAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- na
- allPlayername
- allIGNPlayername
- playername
- mutedplayername
- damageCause
- bannedplayername
- playerOption
- gamemode
- worlds
- portals
- allportals
- itemname
- playeritems
- blockname
- EntityType
- cleanEntityType
- kit
- kitnames
- kitp
- chatroom
- biome
- treeType
- maxplayers
- potioneffect
- effect
- merchants
- enchant
- limitedEnchant
- halfViewRange
- doubleViewRange
- ViewRange
- maxenchantlevel
- currentItemName
- loreLine
- currentItemLore
- currentLocation
- currentFullLocation
- currentX
- currentY
- currentZ
- currentWorld
- currentPitch
- currentYaw
- itemFlag
- nickName
- fullNickName
- gamerule
- gamerulevalue
- nickNames
- homes
- warps
- allwarps
- playerwarps
- rankname
- statstype
- statssubtype
- motd
- bungeeserver
- scheduleName
- ctext
- attachedCommand
- jail
- cellId
- sound
- customalias
- dbusercollumsshort
- placeholders
- warncategory
- projectiletype
- holograms
- mobtype
- vanishaction
- signLine

Methods:
- **static** TabComplete$TabAction valueOf(String name)
- **static** TabComplete$TabAction[] values()
- String getDesc()
- **static** TabComplete$TabAction getAction(String name)

## Package: com.Zrips.CMI.AllListeners

### Class: com.Zrips.CMI.AllListeners.ArmorChangeListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ArmorChangeListener(CMI plugin)

Methods:
- void InventoryDragEvent(InventoryDragEvent event)
- void dispenserFireEvent(BlockDispenseEvent event)
- void playerInteractEvent(PlayerPickupItemEvent event)
- void playerInteractEvent(PlayerItemHeldEvent event)
- void playerInteractEvent(PlayerQuitEvent event)
- void playerInteractEvent(PlayerInteractEvent event)
- void onInventoryClick(InventoryClickEvent event)

### Class: com.Zrips.CMI.AllListeners.ArmorChangeListener1_9
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ArmorChangeListener1_9(CMI plugin)

Methods:
- void playerInteractEvent(PlayerSwapHandItemsEvent event)

### Class: com.Zrips.CMI.AllListeners.BossBarCompassListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- BossBarCompassListener(CMI plugin)

Methods:
- void PlayerItemHeldEvent(PlayerJoinEvent event)
- void PlayerItemHeldEvent(PlayerItemHeldEvent event)
- void onPlayerMoveEvent(PlayerMoveEvent event)

### Class: com.Zrips.CMI.AllListeners.CustomMessagesListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- CustomMessagesListener(CMI plugin)

Methods:
- void onQuit(PlayerQuitEvent event)
- void onJoin(PlayerJoinEvent event)
- void onJoinMulti(PlayerQuitEvent event)
- void onJoinMulti(PlayerJoinEvent event)

### Class: com.Zrips.CMI.AllListeners.DamageControlListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- DamageControlListener(CMI plugin)

Methods:
- void EntityDamageEvent(EntityDamageEvent event)

### Class: com.Zrips.CMI.AllListeners.DecoratedPotListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- DecoratedPotListener(CMI plugin)

Methods:
- void onInteractBeeHive(PlayerInteractEvent event)

### Class: com.Zrips.CMI.AllListeners.ElevatorListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ElevatorListener(CMI plugin)

Methods:
- void PlayerInteractEvent(PlayerInteractEvent event)
- void onSignChangeEventElevator(SignChangeEvent event)

### Class: com.Zrips.CMI.AllListeners.FirstJoinListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- FirstJoinListener(CMI plugin)

Methods:
- void onPlayerFirstLogin(PlayerJoinEvent event)

### Class: com.Zrips.CMI.AllListeners.GlicthListeners
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- GlicthListeners(CMI plugin)

Methods:
- void EntityPortalEvent(EntityPortalEvent event)
- void onCommand(PlayerCommandPreprocessEvent event)
- void EntityTeleportEvent(EntityTeleportEvent event)
- void onPlayerEditBookEvent(PlayerEditBookEvent event)

### Class: com.Zrips.CMI.AllListeners.HatListeners
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- HatListeners(CMI plugin)

Methods:
- void hatPlacement(InventoryClickEvent event)
- void armorChangeEvent(CMIArmorChangeEvent event)

### Class: com.Zrips.CMI.AllListeners.LaunchPadListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- LaunchPadListener(CMI plugin)

Methods:
- void onTeleportLaunch(PlayerTeleportEvent event)
- void onTeleport(PlayerTeleportEvent event)
- void EntityDamageEvent(EntityDamageEvent event)

### Class: com.Zrips.CMI.AllListeners.LaunchPadListener1_9
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- LaunchPadListener1_9(CMI plugin)

Methods:
- void EntityToggleGlideEvent(EntityToggleGlideEvent event)

### Class: com.Zrips.CMI.AllListeners.MobExpirationListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- MobExpirationListener(CMI plugin)

Methods:
- void EntityDeathEvent(EntityDeathEvent event)
- **static** void addMob(Entity ent, double seconds)

### Class: com.Zrips.CMI.AllListeners.NameChangeListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- NameChangeListener(CMI plugin)

Methods:
- void onJoin(PlayerJoinEvent event)
- void onJoinLowest(PlayerLoginEvent event)

### Class: com.Zrips.CMI.AllListeners.NightSpeedUpListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- NightSpeedUpListener(CMI plugin)

Methods:
- void PlayerBedEnterEvent(PlayerBedEnterEvent event)
- void PlayerBedLeaveEvent(PlayerBedLeaveEvent event)

### Class: com.Zrips.CMI.AllListeners.NoTargetListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- NoTargetListener(CMI plugin)

Methods:
- void EntityTargetLivingEntityEvent(EntityTargetLivingEntityEvent event)
- **static** void toggleOff(CMIUser user)
- **static** void removeNoTargetPlayers(UUID uuid)
- **static** boolean isInNoTargetPlayers(UUID uuid)
- **static** void addNoTargetPlayers(UUID uuid)
- **static** void toggleOn(CMIUser user)

### Class: com.Zrips.CMI.AllListeners.PlayerItemDamageListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PlayerItemDamageListener(CMI plugin)

Methods:
- void armorDurabilityLoss(PlayerItemDamageEvent event)
- void itemDurabilityLoss(PlayerItemDamageEvent event)

### Class: com.Zrips.CMI.AllListeners.PlayerListeners
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PlayerListeners(CMI plugin)

Methods:
- void onRespawn(PlayerRespawnEvent event)
- void PlayerDeathEvent(PlayerDeathEvent event)
- void onPotionSplashEvent(PotionSplashEvent event)
- void onChat(AsyncPlayerChatEvent event)
- void onPlayerJoinSafe(PlayerJoinEvent event)
- void CreatureSpawnEvent(CreatureSpawnEvent event)
- void onFishingRodUse(PlayerFishEvent event)
- void onEntityDamage(EntityDamageEvent event)
- void onRespawnSetLocation(PlayerRespawnEvent event)
- void onPlayerLoginFakeUser(PlayerLoginEvent event)
- void onInteractHead(PlayerInteractEvent event)
- void PlayerQuitEventPermissioCache(PlayerQuitEvent event)
- void FoodLevelChangeEvent(FoodLevelChangeEvent event)
- void onPlayerLogin(PlayerLoginEvent event)
- void onJoinInSpawn(PlayerJoinEvent event)
- void VehicleEnterEvent(VehicleEnterEvent event)
- void onInteractBeeHive(PlayerInteractEvent event)
- void EntityDeathEvent(EntityDeathEvent event)
- void onPlayerFirstJoin(PlayerJoinEvent event)
- void onCommand(ServerCommandEvent event)
- void PlayerQuitEvent(PlayerQuitEvent event)
- void PlayerEditBookEvent(PlayerEditBookEvent event)
- void onInteract(PlayerInteractEvent event)
- void PlayerDeathEventHunger(PlayerDeathEvent event)
- void onTeleport(PlayerTeleportEvent event)
- void onChatIgnore(AsyncPlayerChatEvent event)
- void onPlayerLoginLimit(PlayerLoginEvent event)
- void EntityPortalEnterEvent(EntityPortalEnterEvent event)
- void onSignInteract(PlayerInteractEvent event)
- void PlayerPickupItemEvent(PlayerPickupItemEvent event)
- void onPlayerDropItemEvent(PlayerDropItemEvent event)
- void onPlayerDropItemEvent(PlayerToggleSprintEvent event)
- void PlayerRespawnEventHunger(PlayerRespawnEvent event)

### Class: com.Zrips.CMI.AllListeners.PlayerListeners1_8
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PlayerListeners1_8(CMI plugin)

Methods:
- void PlayerInteractMinecart(PlayerInteractAtEntityEvent event)

### Class: com.Zrips.CMI.AllListeners.PortalCreationListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PortalCreationListener(CMI plugin)

Methods:
- void PortalCreateEvent(PortalCreateEvent event)
- void CMIPortalCreateEvent(CMIPortalCreateEvent event)

### Class: com.Zrips.CMI.AllListeners.ProtocolEvent
Type: Class

Methods:
- **static** void includeViewRange(CMI plugin)

### Class: com.Zrips.CMI.AllListeners.ProtocolEvent18
Type: Class

Methods:
- **static** void includeViewRange18(CMI plugin)

### Class: com.Zrips.CMI.AllListeners.TeleportWithListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- TeleportWithListener(CMI plugin)

Methods:
- void onTeleportWithEntity(PlayerTeleportEvent event)

### Class: com.Zrips.CMI.AllListeners.UserCuffedEvents
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- UserCuffedEvents(CMI plugin)

Methods:
- void chat(AsyncPlayerChatEvent event)
- void onPlayerMove(PlayerMoveEvent event)
- void onPlayerMove(PlayerCommandPreprocessEvent event)
- void onPlayerInteract(PlayerInteractEvent event)
- void onPlayerInteract(InventoryClickEvent event)
- void onHit(EntityDamageByEntityEvent event)
- void onPlayerDropItemEvent(PlayerDropItemEvent event)
- void onPlayerLogin(PlayerJoinEvent event)
- void onPlayerDamage(EntityDamageEvent event)
- void onProjectileLaunchEvent(ProjectileLaunchEvent event)

### Class: com.Zrips.CMI.AllListeners.UserEvents
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- UserEvents(CMI plugin)

Methods:
- **static** void addBackLocationExclusion(UUID uuid)
- void onPlayerLoginNameCheck(PlayerLoginEvent event)
- void onPlayerMoveBelow(PlayerMoveEvent event)
- void teleportBack(PlayerTeleportEvent event)
- void onPlayerDeath(PlayerDeathEvent event)
- void onPlayerDeath(PlayerMoveEvent event)
- void onPlayerQuit(PlayerQuitEvent event)
- void removeFromRankCheck(PlayerQuitEvent event)
- void teleportBackWECompasss(PlayerInteractEvent event)
- void onCMIUserBalanceChangeEvent(CMIUserBalanceChangeEvent event)
- void onPlayerLogin(PlayerLoginEvent event)
- void onPlayerLogin(PlayerJoinEvent event)
- void onPlayerLoginIpRecord(PlayerLoginEvent event)
- void onPlayerFlyToHigh(PlayerMoveEvent event)

### Class: com.Zrips.CMI.AllListeners.WorldLimits
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- WorldLimits(CMI plugin)

Methods:
- void onWorldChangeFlyCached(PlayerChangedWorldEvent event)
- void onLoginFly(PlayerLoginEvent event)
- void onLoginGameMode(PlayerLoginEvent event)
- void onWorldChangeGod(PlayerChangedWorldEvent event)
- void onRespawnSetLocation(PlayerRespawnEvent event)
- void onLoginGod(PlayerLoginEvent event)
- void PlayerDeathEventHunger(PlayerDeathEvent event)
- void onWorldChangeFly(PlayerChangedWorldEvent event)
- void onWorldChangeGameMode(PlayerChangedWorldEvent event)
- void onTeleport(PlayerTeleportEvent event)

### Class: com.Zrips.CMI.AllListeners.WorldLimitsElytra
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- WorldLimitsElytra(CMI plugin)

Methods:
- void onLoginElytra(PlayerLoginEvent event)
- void EntityToggleGlideEvent(EntityToggleGlideEvent event)
- void PlayerMoveEvent(PlayerMoveEvent event)
- void onWorldChangeElytra(PlayerChangedWorldEvent event)

### Class: com.Zrips.CMI.AllListeners.versionCheck
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- versionCheck(CMI plugin)

Methods:
- void onJoin(PlayerJoinEvent event)

## Package: com.Zrips.CMI.Containers

### Class: com.Zrips.CMI.Containers.ActionType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NORMAL
- ENDER
- CHECKING
- NONE

Methods:
- String getName()
- **static** ActionType valueOf(String name)
- **static** ActionType[] values()

### Class: com.Zrips.CMI.Containers.BasicRecipe
Type: Class

Constructors:
- BasicRecipe(ItemStack result, ItemStack input)

Methods:
- ItemStack getResult()
- ItemStack getInput()

### Class: com.Zrips.CMI.Containers.BlockStateType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- disarmed
- triggered
- half
- powered
- conditional
- axis
- type
- down
- mode
- lit
- west
- layers
- up
- drag
- persistent
- locked
- inverted
- eggs
- shape
- level
- hatch
- moisture
- unstable
- eye
- in_wall
- delay
- has_record
- has_bottle_0
- attached
- has_bottle_1
- has_bottle_2
- note
- hinge
- waterlogged
- distance
- south
- part
- north
- facing
- instrument
- extended
- enabled
- east
- pickles
- power
- snowy
- occupied
- rotation
- bites
- face
- stage
- Short
- age
- open

Methods:
- Class<*> getClassType()
- **static** BlockStateType valueOf(String name)
- **static** BlockStateType[] values()
- **static** BlockStateType getByName(String name)

### Class: com.Zrips.CMI.Containers.CMIAttribute
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SCALE
- MOVEMENT_SPEED
- MAX_HEALTH

Methods:
- double getValue(Entity ent)
- Object getAttribute()
- **static** CMIAttribute valueOf(String name)
- AttributeInstance get(Entity ent)
- **static** CMIAttribute[] values()
- double getBaseValue(Entity ent)
- void setBaseValue(Entity ent, double value)

### Class: com.Zrips.CMI.Containers.CMIBanEntry
Type: Class

Constructors:
- CMIBanEntry(CMIUser baned)

Methods:
- void setSource(CMIUser user)
- String getReason()
- Long getCreated()
- **static** String getIpBanMessage(BanEntry banEntry)
- void setExpiration(Long date)
- void setCreated(Long date)
- Long getLeftTime()
- CMIUser getTargetUser()
- boolean isPermanent()
- String getTarget()
- Long getExpiration()
- String getSource()
- void setReason(String reason)
- CMIUser getSourceUser()
- **static** String getBanMessage(BanEntry banEntry)

### Class: com.Zrips.CMI.Containers.CMIBanRecords
Type: Class

Methods:
- **static** CMIBanEntry getBanEntryRaw(UUID uuid)
- **static** BanList<*> getBanEntriesByIP()
- **static** CMIBanEntry getBanEntry(UUID uuid)
- **static** CMIBanEntry getBanEntry(CMIUser user, boolean update)
- **static** BanEntry getBanEntry(CMIUser user)
- **static** BanEntry getBanEntry(Player player)
- **static** BanEntry getBanEntry(UUID uuid, String name)
- **static** void pardon(UUID uuid, String name)
- **static** void updateBanEntry(CMIUser user, BanEntry entry)
- **static** CMIUser setBanned(CMIUser user, String reason, CMIUser by, Date until, Date when)
- **static** CMIUser unBan(CMIUser user)
- **static** BanEntry getBanEntryByIP(String ip)
- **static** CMIBanEntry addBanEntry(UUID uuid, CMIBanEntry entry)
- **static** BanEntry addBanByIP(String ip, String reason, Date date, String source)
- **static** BanEntry addBan(UUID uuid, String name, String reason, Date date, String source)
- **static** void pardonByIP(String ip)
- **static** CMIBanEntry removeBanEntry(UUID uuid)
- **static** BanList<*> getBanEntries()

### Class: com.Zrips.CMI.Containers.CMICollision
Type: Class

Constructors:
- CMICollision(CMIHitBox box)
- CMICollision(Vector min, Vector max)
- CMICollision(double x1, double y1, double z1, double x2, double y2, double z2)

Methods:
- boolean contains(Location location)
- boolean collides(CMIRay ray, double tmin, double)
- double min(int i)
- double collidesNearest(CMIRay ray, double tmin, double)
- Vector getMin()
- double max(int i)
- Vector getMax()

### Class: com.Zrips.CMI.Containers.CMIColorTypes
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- publicmessage
- privatemessage
- me
- nickname
- signs
- books
- itemname
- itemlore

Methods:
- boolean isClean()
- void setClean(boolean clean)
- **static** CMIColorTypes valueOf(String name)
- **static** CMIColorTypes[] values()

### Class: com.Zrips.CMI.Containers.CMICompass
Type: Class

Methods:
- **static** boolean isRecoveryAsRegularCompass()
- **static** boolean isCompassShowSpawn()
- **static** String getCompassColor()
- **static** void loadConfig()
- **static** String getCompassShape()
- **static** boolean isBossBarCompassEnabled()
- **static** boolean isCompassShowCompass()
- **static** String getCompassDeathIcon()
- **static** String getCompassHomeIcon()
- **static** boolean isCompassShowDeath()
- **static** String getCompassTargetIcon()
- **static** boolean isRecoveryRequireCompass()
- **static** List<String> getCompassColors()
- **static** boolean isCompassShowHome()
- **static** boolean isCompassRequireCompass()
- **static** String getCompassSpawnIcon()
- **static** int getCompassUpdateInterval()

### Class: com.Zrips.CMI.Containers.CMICounter
Type: Class

Methods:
- **static** HashMap<String, Long> getCounter(UUID uuid)
- **static** boolean isJoinedCounter(UUID uuid)
- **static** void setJoinedCounter(UUID uuid, boolean joinedCounter)

### Class: com.Zrips.CMI.Containers.CMICustomLogInOutMessages
Type: Class

Methods:
- **static** Matcher matchLongLogoutNameFilter(String name)
- **static** int getLogoutAutoHideFrom()
- **static** boolean isLoginServerSwitch()
- **static** boolean isLoginDisabled()
- **static** boolean isLogoutNameFilterUse()
- **static** boolean isLogoutDisabled()
- **static** boolean isLoginCustomUse()
- **static** void loadConfig()
- **static** int getLoginAutoHideFrom()
- **static** boolean isLogoutServerSwitch()
- **static** boolean isFirstJoinMessageUse()
- **static** boolean isLoginNameFilterUse()
- **static** boolean isLogoutCustomUse()

### Class: com.Zrips.CMI.Containers.CMIDamageCause
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BLOCK_EXPLOSION
- CONTACT
- CRAMMING
- CUSTOM
- DRAGON_BREATH
- DROWNING
- DRYOUT
- ENTITY_ATTACK
- ENTITY_EXPLOSION
- ENTITY_SWEEP_ATTACK
- FALL
- FALLING_BLOCK
- FIRE
- FIRE_TICK
- FLY_INTO_WALL
- HOT_FLOOR
- LAVA
- LIGHTNING
- MAGIC
- MELTING
- POISON
- PROJECTILE
- STARVATION
- SUFFOCATION
- SUICIDE
- THORNS
- VOID
- WITHER

Methods:
- String getSecondaryName()
- String getName()
- **static** CMIDamageCause valueOf(String name)
- **static** CMIDamageCause[] values()
- **static** CMIDamageCause getByName(String name)
- EntityDamageEvent$DamageCause getCause()

### Class: com.Zrips.CMI.Containers.CMIDirection
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- N
- NE
- E
- SE
- S
- SW
- W
- NW

Methods:
- **static** CMIDirection getFromAngle(double angle)
- int getX()
- String getTranslatedName()
- String getName()
- int getZ()
- int getAngle()
- **static** float getAngle(Location loc1, Location loc2)
- **static** float getAngle(float yaw)
- **static** CMIDirection valueOf(String name)
- **static** CMIDirection[] values()
- CMIDirection rotate90ClockWise()
- **static** Location rotateOnAxisDistance(Location location, double distance, double, double p)
- **static** Vector rotateOnAxisDistanceVector(Location location, double distance, double, double p)
- CMIDirection rotate90CounterClockWise()
- **static** CMIDirection getFromLocations(Location loc1, Location loc2)

### Class: com.Zrips.CMI.Containers.CMIEquipmentSlot
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NONE
- CHEST
- FEET
- HAND
- HEAD
- LEGS
- OFF_HAND

Methods:
- **static** CMIEquipmentSlot valueOf(String name)
- **static** CMIEquipmentSlot get(String name)
- **static** CMIEquipmentSlot get(EquipmentSlot slot)
- **static** CMIEquipmentSlot get(PlayerInteractAtEntityEvent event)
- **static** CMIEquipmentSlot get(PlayerInteractEvent event)
- **static** CMIEquipmentSlot[] values()

### Class: com.Zrips.CMI.Containers.CMIEvent
Type: Class

Methods:
- **static** BlockPlaceEvent placeBlockEvent(Block block, Player player)
- **static** BlockPlaceEvent placeSignEvent(Block block, Sign sign, Player player)
- **static** BlockPlaceEvent createSignEvent(Block block, Sign sign, Player player)

### Class: com.Zrips.CMI.Containers.CMIEventPriority
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LOWEST
- LOW
- NORMAL
- HIGH
- HIGHEST
- MONITOR

Methods:
- **static** String[] generateComments(String prefix, CMIEventPriority defaultPriority, boolean simplified)
- **static** CMIEventPriority valueOf(String name)
- **static** CMIEventPriority[] values()
- **static** String listGeneralPriorities()
- **static** CMIEventPriority getPriority(String name)
- EventPriority getPriority()
- **static** String listPriorities()

### Class: com.Zrips.CMI.Containers.CMIExperience
Type: Class

Methods:
- **static** int getLevel(Player player)
- **static** long getXpToLevelUpFrom(int level)
- **static** long getTotalExpToLevel(int level)
- **static** long getExpForCurrentLevel(Player player)
- **static** void addExp(Player player, long exp)
- **static** void setExp(Player player, long exp)
- **static** long getMissingExp(Player player)
- **static** void takeExp(Player player, long exp)
- **static** long getTotalExp(Player player)
- **static** int levelFromExp(long exp)
- **static** void setLevel(Player player, int level)

### Class: com.Zrips.CMI.Containers.CMIFileAppender
Type: Class

Constructors:
- CMIFileAppender(String filePath)

Methods:
- void appendData(Object data)
- void close()

### Class: com.Zrips.CMI.Containers.CMIHitBox
Type: Class

Constructors:
- CMIHitBox(Block block)
- CMIHitBox(Entity ent)

Methods:
- void setMax(Vector max)
- Location getCenterLocation()
- World getWorld()
- Block getBlock()
- boolean isPassable()
- boolean collides(Entity ent)
- boolean collides(Vector position)
- Block getCollidingdBlock()
- Block getCollidingdBlock(World world, Vector minimal, Vector maximum)
- Block getCollidingdBlock(World world, Vector minimal, Vector maximum, boolean resize)
- Vector getMax()
- void setSnapshot(ChunkSnapshot snapshot)
- Entity getEntity()
- double getHitBoxLength()
- Vector getMaxGlobal()
- ChunkSnapshot getSnapshot()
- void setEntity(Entity ent)
- boolean canPlayerStand(Location loc)
- void byExactXYZ(double x, double, double y)
- boolean byExactXYZ(double x, double, double y, double)
- void setMin(Vector min)
- Vector getMin()
- double getHitBoxHeight()
- Vector getMinGlobal()
- double getHitBoxWidth()
- boolean isEmptySpace(Location loc)
- boolean isEmptySpace()
- boolean isEmptySpace(World world, Vector minimal, Vector maximum, boolean resize)
- Double getHeightAtLocation(Location loc)

### Class: com.Zrips.CMI.Containers.CMIInteractType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LeftClick
- RightClick
- LeftShiftClick
- RightShiftClick

Methods:
- **static** CMIInteractType valueOf(String name)
- **static** CMIInteractType[] values()
- **static** CMIInteractType getByName(String name)
- **static** CMIInteractType getFromAction(Action action, Player player)

### Class: com.Zrips.CMI.Containers.CMIIpBanEntry
Type: Class

Constructors:
- CMIIpBanEntry(String ip, Long banedAt, String bannedBy, Long bannedUntil, String reason)

Methods:
- void setSource(String bannedBy)
- String getKey()
- String getReason()
- String getSource()
- void setReason(String reason)
- void setExpires(Long bannedUntil)
- Long getBanedAt()
- void setBanedAt(Long banedAt)
- Long getExpires()
- void setKey(String ip)

### Class: com.Zrips.CMI.Containers.CMIItemDonations
Type: Class

Methods:
- UUID getDonor()
- UUID getReceiver()
- void setDonor(UUID donor)
- Long getTime()
- **static** void addItemDonation(CMIItemDonations donation)
- ItemStack getItem()
- **static** HashMap<UUID, CMIItemDonations> getPendingDonations(UUID uuid)
- void setItem(ItemStack item)
- void setTime(Long time)
- void setReceiver(UUID receiver)

### Class: com.Zrips.CMI.Containers.CMIItemRepair
Type: Class

Methods:
- **static** D getRepairCost(List<ItemStack> items)
- **static** double getRepairCost(ItemStack item)

### Class: com.Zrips.CMI.Containers.CMIJson
Type: Class

Methods:
- **static** List<Object> deserializeList(String str)
- **static** String serialize(HashMap<TK, TV> map)
- **static** String serializeList(List<*> list)
- **static** HashMap<String, Object> deserialize(String json)

### Class: com.Zrips.CMI.Containers.CMIKitUsage
Type: Class

Constructors:
- CMIKitUsage(Kit kit)
- CMIKitUsage(String kitConfigName, Long lastUsage)
- CMIKitUsage(Kit kit, Long lastUsage)
- CMIKitUsage(Kit kit, Long lastUsage, int usedTimes)
- CMIKitUsage(String kitConfigName, Long lastUsage, int usedTimes)

Methods:
- int getUsedTimes()
- Long getLastUsage()
- String getKitName()
- Kit getKit()
- void addUsedTimes()
- void setUsedTimes(int usedTimes)
- void setLastUsage(Long lastUsage)

### Class: com.Zrips.CMI.Containers.CMIMail
Type: Class

Methods:
- **static** long getMailToAllExpirationMS()
- **static** String getSendersName(CommandSender sender)
- **static** void loadConfig()
- **static** long getMailExpiresInMS()
- **static** String getConsoleMailSender()
- **static** int getMaxMail()

### Class: com.Zrips.CMI.Containers.CMIMessageReplies
Type: Class

Methods:
- **static** void removeMessageReplyTo(String sender)
- **static** void addMessageReplyToBySender(String target, String sender)
- **static** void addMessageReplyTo(String target, String sender)
- **static** String getMessageReplyTo(String sender)

### Class: com.Zrips.CMI.Containers.CMIMuteData
Type: Class

Methods:
- String getMutedReason()
- **static** String getMutedReason(UUID uuid)
- CMIMuteData setMutedUntil(long mutedUntil)
- **static** void setMutedUntil(UUID uuid, long mutedUntil)
- CMIMuteData setMutedReason(String mutedReason)
- **static** void setMutedReason(UUID uuid, String reason)
- **static** boolean isShadowMuted(UUID uuid)
- long getShadowMutedUntil()
- **static** long getShadowMutedUntil(UUID uuid)
- long getMutedUntil()
- **static** Long getMutedUntil(UUID uuid)
- CMIMuteData setShadowMutedUntil(long shadowMutedUntil)
- **static** void setShadowMutedUntil(UUID uuid, long shadowMutedUntil)
- **static** boolean isMuted(UUID uuid)

### Class: com.Zrips.CMI.Containers.CMINamePlate
Type: Class

Methods:
- void setNamePlateSuffix(String namePlateSuffix)
- **static** void setNamePlateSuffix(UUID uuid, String namePlateSuffix)
- String getNamePlateSuffix()
- **static** String getNamePlateSuffix(UUID uuid)
- ChatColor getNamePlateNameColor()
- **static** ChatColor getNamePlateNameColor(UUID uuid)
- void setNamePlatePrefix(String namePlatePrefix)
- **static** void setNamePlatePrefix(UUID uuid, String namePlatePrefix)
- String getNamePlatePrefix()
- **static** String getNamePlatePrefix(UUID uuid)
- boolean isEmptyRecord()
- void setNamePlateNameColor(ChatColor namePlateNameColor)
- **static** void setNamePlateNameColor(UUID uuid, ChatColor namePlateNameColor)

### Class: com.Zrips.CMI.Containers.CMIPermissionPlayerData
Type: Class

Methods:
- String getPrefix()
- **static** String getPrefix(CMIUser user)
- **static** void updateSuffix(CMIUser user)
- **static** void updateGroup(CMIUser user)
- CMIPermissionPlayerData setNameColor(String nameColor)
- **static** void clearCache(UUID uuid)
- String getNameColor()
- **static** String getNameColor(CMIUser user)
- **static** void updatePrefix(CMIUser user)
- **static** String getGroupName(CMIUser user)
- CMIPermissionPlayerData setGroup(String group)
- String getSuffix()
- **static** String getSuffix(CMIUser user)
- CMIPermissionPlayerData setPrefix(String prefix)
- String getGroup()
- CMIPermissionPlayerData setSuffix(String suffix)

### Class: com.Zrips.CMI.Containers.CMIPlayerGlowData
Type: Class

Constructors:
- CMIPlayerGlowData(ChatColor glow)

Methods:
- void setGlow(ChatColor glow)
- **static** void setGlow(UUID uuid, ChatColor glow)
- **static** void applyGlow(UUID uuid)
- ChatColor getGlow()
- **static** ChatColor getGlow(UUID uuid)

### Class: com.Zrips.CMI.Containers.CMIPlayerInventory
Type: Class

Constructors:
- CMIPlayerInventory(CMIUser user)

Methods:
- HashMap<Integer, ItemStack> removeItem(ItemStack items)
- **static** Inventory getTopInventory(Player player)
- int getTotalAmount(ItemStack item, CMIPlayerInventory$itemCheckType[] checkTypes)
- int getTotalAmount(ItemStack item, boolean exact, CMIPlayerInventory$itemCheckType[] checkTypes)
- HashMap<Integer, ItemStack> removeItemByCriteria(ItemStack item, CMIPlayerInventory$itemCheckType checkTypes)
- HashMap<Integer, ItemStack> removeItemByCriteria(ItemStack item, boolean exact, CMIPlayerInventory$itemCheckType checkTypes)
- void clear(int index)
- ItemStack getItem(int index)
- ItemStack getItem(CMIPlayerInventory$CMIInventorySlot type)
- **static** boolean matches(ItemStack checkingItem, ItemStack lookingFor, CMIPlayerInventory$itemCheckType[] checkTypes)
- **static** boolean matches(ItemStack checkingItem, ItemStack lookingFor, boolean exact, CMIPlayerInventory$itemCheckType[] checkTypes)
- List<ItemStack> getItems(CMIPlayerInventory$CMIInventorySlot type)
- HashMap<Integer, ItemStack> addItem(ItemStack item, int preferredSlot)
- HashMap<Integer, ItemStack> addItem(ItemStack item)
- HashMap<Integer, ItemStack> addItem(ItemStack item, CMIPlayerInventory$CMIFullInventoryAction action)
- HashMap<Integer, ItemStack> addItem(ItemStack item, CMIPlayerInventory$CMIFullInventoryAction action, int preferredSlot)
- boolean contains(ItemStack item)
- void removeItemFromMainHand(ItemStack item)
- **static** ItemStack[] getTopInventoryContents(Player player)
- Z canFit(List<ItemStack> item)
- boolean canFit(ItemStack[] items)
- int getFreeSlots()
- int getFreeSlots(CMIPlayerInventory$CMIInventorySlot place)
- boolean has(ItemStack item, CMIPlayerInventory$itemCheckType[] checkTypes)
- boolean has(ItemStack item, boolean exact, CMIPlayerInventory$itemCheckType[] checkTypes)
- I emptySlotsRemainingIfAdded(List<ItemStack> item)
- int emptySlotsRemainingIfAdded(ItemStack[] items)
- void setItem(CMIPlayerInventory$CMIInventorySlot type, ItemStack item)
- void setItem(int index, ItemStack item)

### Class: com.Zrips.CMI.Containers.CMIPlayerInventory$CMIFullInventoryAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Abort
- Drop
- Return

Methods:
- **static** CMIPlayerInventory$CMIFullInventoryAction valueOf(String name)
- **static** CMIPlayerInventory$CMIFullInventoryAction[] values()

### Class: com.Zrips.CMI.Containers.CMIPlayerInventory$CMIInventorySlot
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Armor
- Helmet
- ChestPlate
- Pants
- Boots
- OffHand
- MainHand
- QuickBar
- PartInventory
- MainInventory
- CraftingIngredients
- CraftingResult

Methods:
- Integer getSlot()
- **static** CMIPlayerInventory$CMIInventorySlot valueOf(String name)
- **static** CMIPlayerInventory$CMIInventorySlot[] values()
- List<Integer> getSlots()

### Class: com.Zrips.CMI.Containers.CMIPlayerInventory$itemCheckType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- name
- lore
- amount
- nbt
- material
- custommodel
- durability

Methods:
- **static** CMIPlayerInventory$itemCheckType valueOf(String name)
- **static** CMIPlayerInventory$itemCheckType[] values()

### Class: com.Zrips.CMI.Containers.CMIPlayerTempData
Type: Class

Methods:
- void setPlayTimeOptimized(long playTimeOptimized)
- String getBungeeBackLocation()
- void setLastRespawn(long lastRespawn)
- long getAfkImunity()
- void setBungeeBackLocation(String bungeeBackLocation)
- HashMap<UserDataUpdateType, Long> getLastInfoUpdate()
- void setDeathBackExpiration(long deathBackExpiration)
- **static** CMIPlayerTempData computeIfAbsent(UUID uuid)
- void setAfkImunity(long afkImunity)
- long getLastPatrol()
- long getLastRespawn()
- CmdCooldown getCommandCooldown()
- void setBackExpiration(long backExpirationAt)
- V setLastInfoUpdate(HashMap<UserDataUpdateType, Long> lastInfoUpdate)
- **static** CMIPlayerTempData get(UUID uuid)
- long getBackExpiration()
- **static** void clearOnLogOff(UUID uuid)
- long getDeathBackExpiration()
- void setLastPatrol(long lastPatrol)
- void setCommandCooldown(CmdCooldown commandCooldown)
- long getPlayTimeOptimized()

### Class: com.Zrips.CMI.Containers.CMIRay
Type: Class

Constructors:
- CMIRay(Vector origin, Vector direction)
- CMIRay(Player player)

Methods:
- Vector getPoint(double distance)
- Vector getDirection()
- Vector getOrigin()
- double origin(int i)
- double direction(int i)

### Class: com.Zrips.CMI.Containers.CMIRayTrace
Type: Class

Constructors:
- CMIRayTrace(Player player)
- CMIRayTrace(World world, Vector origin, Vector direction)

Methods:
- ArrayList<Vector> traverse(double blocksAway, double)
- ArrayList<Block> getLastTwoBlocks(double blocksAway)
- ArrayList<Block> getLastTwoBlocks(double blocksAway, double)
- Vector getPostion(double blocksAway)
- ArrayList<Block> getBlocks(double blocksAway)
- ArrayList<Block> getBlocks(double blocksAway, double)

### Class: com.Zrips.CMI.Containers.CMIReplyResponder
Type: Class

Constructors:
- CMIReplyResponder(String name, Long time)

Methods:
- void setName(String name)
- String getName()
- Long getTime()
- void setTime(Long time)

### Class: com.Zrips.CMI.Containers.CMISorting
Type: Class

Methods:
- **static** Map<String, Integer> sortByValueDescending(Map<String, Integer> unsortedMap)

### Class: com.Zrips.CMI.Containers.CMISoundPreset
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- WarpGuiOpen
- TeleportHome
- TeleportWarp
- TeleportSpawn
- TeleportFail
- PrivateMessage
- TpaRequest
- MailNotification
- TeleportUp
- TeleportDown

Methods:
- void play(Player player)
- void play(Location loc)
- void setEnabled(boolean enabled)
- String getSoundString()
- **static** CMISoundPreset valueOf(String name)
- boolean isEnabled()
- **static** CMISoundPreset[] values()
- void setSound(CMISound sound)
- CMISound getSound()
- void setSoundString(String soundString)

### Class: com.Zrips.CMI.Containers.CMISounds
Type: Class

Methods:
- **static** List<String> getSoundNames()

### Class: com.Zrips.CMI.Containers.CMISpawner
Type: Class

Constructors:
- CMISpawner(Block block)

Methods:
- EntityType getSpawnedType()
- int getMinSpawnDelay()
- World getWorld()
- Location getLocation()
- int getDelay()
- void setRequiredPlayerRange(int)
- BlockData getBlockData()
- boolean update()
- boolean update(boolean)
- boolean update(boolean, boolean)
- void setCreatureTypeByName(String)
- void setMaxNearbyEntities(int)
- void setSpawnedType(EntityType)
- void setSpawnCount(int)
- void setSpawnRange(int)
- int getSpawnRange()
- void setDelay(int)
- List<MetadataValue> getMetadata(String)
- Block getBlock()
- void setMinSpawnDelay(int)
- String getCreatureTypeName()
- int getSpawnCount()
- boolean hasMetadata(String)
- void setBlockData(BlockData data)
- int getMaxSpawnDelay()
- void setMetadata(String, MetadataValue)
- int getX()
- int getY()
- void setMaxSpawnDelay(int)
- int getZ()
- Material getType()
- void removeMetadata(String, Plugin)
- int getMaxNearbyEntities()
- byte getLightLevel()
- int getRequiredPlayerRange()

### Class: com.Zrips.CMI.Containers.CMISunMover
Type: Class

Methods:
- CMITask getTimeMoverTask()
- void setTimeMoverTask(CMITask task)
- String getMoving()
- void setMoving(String moving)

### Class: com.Zrips.CMI.Containers.CMITabComplete
Type: Class

Methods:
- void addTabComplete(String tab)
- List<Object> getTabCompleteList(String args)
- String getTabComplete(String tab)

### Class: com.Zrips.CMI.Containers.CMITextCleaner
Type: Class

Methods:
- **static** String cleanFromColorCodes(Object p, String msg, CMIColorTypes type, boolean clean)
- **static** String cleanFromColorCodes(Object p, String msg, CMIColorTypes type, boolean clean, boolean forceClean)

### Class: com.Zrips.CMI.Containers.CMITimeRate
Type: Class

Constructors:
- CMITimeRate(timeState state, int everyTicks, int addAmount)

Methods:
- boolean isTurnCycleOff()
- timeState getState()
- void setAddAmount(int addAmount)
- void setTurnCycleOff(boolean turnCycleOff)
- void setState(timeState state)
- int getEveryTicks()
- int getAddAmount()
- void setEveryTicks(int everyTicks)

### Class: com.Zrips.CMI.Containers.CMITrialSpawner
Type: Class

Constructors:
- CMITrialSpawner(Block block)

Methods:
- List<MetadataValue> getMetadata(String)
- World getWorld()
- Location getLocation()
- Block getBlock()
- BlockData getBlockData()
- boolean update()
- boolean update(boolean)
- boolean update(boolean, boolean)
- boolean hasMetadata(String)
- void setBlockData(BlockData data)
- void setMetadata(String key, MetadataValue meta)
- int getX()
- int getY()
- int getZ()
- Material getType()
- void removeMetadata(String key, Plugin plugin)
- byte getLightLevel()

### Class: com.Zrips.CMI.Containers.CMIUser
Type: Class

Constructors:
- CMIUser(int id)
- CMIUser(UUID uuid)
- CMIUser(UUID uuid, boolean updatePerm)
- CMIUser(OfflinePlayer player)

Methods:
- void setPlayerTime(long i)
- void setPlayerTime(long pTime, boolean)
- Location getLocation()
- void setBungeeBackLocation(String bungeeBackLocation)
- void clearMails()
- long getLeftCombatTime()
- String getNickName()
- void setItemInHand(ItemStack item)
- void setCuffed(boolean cuffed)
- void setCuffed(boolean cuffed, boolean save)
- void updatePrefix()
- UUID getUniqueId()
- V setNotes(List<PlayerNote> notes)
- String getChatMessageFormatString()
- boolean isJailed()
- CMIUser unBan()
- void addKill(UUID uuid)
- boolean isBanned()
- void setPlayTimeOptimizedOn(long playTimeOptimized)
- ItemStack getItemInHand()
- V setLockedIps(List<String> lockedIps)
- void setTpLoc(Location tpLoc)
- void setTpLoc(Location tpLoc, boolean save)
- boolean removeLockedIps(String Ip)
- void setLastLogoff(long lastLogoff)
- Boolean getOptionState(PlayerOption option)
- ItemStack getItemInOffHand()
- void setGameMode(GameMode mode)
- Z addAllIps(Map<String, Integer> map)
- void removeIgnore(UUID ignore)
- void setJoinedCounter(boolean joinedCounter)
- void setNoPayToggled(boolean noPayToggle)
- void setShowTotemBar(boolean showTotemBar)
- boolean hasPermission(PermissionsManager$CMIPerm perm)
- double getLookDirectionInDegrees()
- boolean hasMeta()
- String getCleanDisplayName()
- Double deposit(Double balance, CMIUser source)
- Double deposit(Double balance)
- Double deposit(String worldName, Double balance)
- Double deposit(String worldName, Double balance, CMIUser source)
- boolean isAcceptingPM()
- boolean isAllowFlight()
- boolean isFlying()
- Set<CmiHome> getHomesBySlot(int slot)
- int removeWarning(CMIPlayerWarning warning)
- void setJailedReason(String jailedReason)
- boolean respawn()
- List<String> getLockedIps()
- void setName(String name)
- int getPlayTimeRewardId()
- CMIChatColor getChatColor()
- SavedInventories getSavedInventories()
- List<CMIPlayerWarning> getWarnings()
- void setSignSpy(boolean spy, boolean save)
- void setHadAllowFlight(boolean allowFlight)
- CMIChatRoom getChatRoom()
- void setMutedReason(String reason)
- void setDidLastDamageToPlayer(Long didLastDamageToPlayer)
- String getNamePlateSuffix()
- void addBossBar(BossBarInfo barInfo)
- void joinChatRoom(String name)
- void setExp(long exp)
- long getLastLogoffClean()
- Location getTpLoc()
- Set<String> getOneTimeRewards()
- long getMissingExp()
- CMIPlayerInventory getInventory()
- String getWarningsSerialized()
- FlightCharge getFlightCharge()
- void updatePermissions()
- HashMap<EntityType, EntityKillCount> getEntityKills()
- worldFlyState getFlyCachedMode(String worldName)
- CMIRank recalculateRank()
- int getTotalFavoriteHomeCount()
- void setTagName(String tagName)
- double getHeadDropChance(UUID uuid)
- double getHeadDropChance(UUID uuid, boolean addEnchantBonus)
- boolean hasSetPermission(PermissionsManager$CMIPerm perm)
- long getPlayerTime()
- V setIps(LinkedHashMap<String, Integer> ips)
- void sendMessage(String msg)
- void sendMessage(String command, String shortPath, Object[] variables)
- void setPlayer(Player player)
- void setChatColor(CMIChatColor chatColor)
- long getAfkImunityUntil()
- long getTfly()
- String getSkin()
- boolean hasSetSkin()
- long getLastLogoff()
- long getLastLogoff(boolean forceUpdate)
- String getTagName()
- boolean setWasFlying(boolean flying)
- long getTgod()
- boolean isTgod()
- void addMail(PlayerMail mail, boolean save)
- CMIEconomyAcount getEconomyAccount()
- World getWorld()
- void setLastLogin(long lastLogin)
- String getName()
- String getName(boolean update)
- HashMap<String, Long> getWarningsAsMap()
- ChatColor getNamePlateNameColor()
- void updateSuffix()
- void setGotLastDamageFromPlayer(Long gotLastDamageFromPlayer)
- boolean isTagSoundEnabled()
- void setMirror(Mirrors mirror)
- void addExp(long exp)
- void setUuidNoPermUpdate(UUID uuid)
- CMIVanish getVanish()
- void setInvId(int invId)
- void updateBanEntry(BanEntry entry)
- void setGotLastDamageFromMob(Long gotLastDamageFromMob)
- CmdCooldown getCommandCooldowns()
- void addKitsUsage(CMIKitUsage usage)
- CMIPlayerMessageColor getChatMessageFormat()
- ConcurrentHashMap<String, BossBarInfo> getBossBarInfo()
- V setWarnings(List<CMIPlayerWarning> warnings)
- boolean has(Double balance)
- boolean has(String worldName, Double balance)
- int getLeftKitUseTimes(Kit kit)
- void addForPlayTimeRewardSave()
- void setChatMessageFormat(CMIPlayerMessageColor chatMessageFormat)
- long getTotalExp()
- String getCity()
- boolean isAfk()
- String getCountryCode()
- void setCMIPlayTime(CMIPlayTime playTime)
- int getPlayTimeId()
- void addHome(String name, CmiHome home, boolean save)
- void addHome(CmiHome home, boolean save)
- void dropItemNearPlayer(ItemStack one)
- CMIJailCell getCell()
- boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId)
- boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId, String reason)
- boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId, String reason, UUID jailedBy)
- void setAllowFlight(boolean allowFlight)
- TreeMap<Long, damageInformation> getLastDamage()
- damageInformation getLastDamage(damageInformation comparison)
- void addRepeatableReward(String name, long time)
- void setCell(CMIJailCell cell)
- void setSkin(String skin)
- void setCollision(boolean state)
- String getPTROString()
- long getShadowMutedUntil()
- String getPTRRString()
- void saveIfOffline()
- void addFlyToCache(String worldName, boolean state, boolean temp)
- Set<CmiHome> getHomesFromWorld(String worldName)
- Long getGotLastDamageFromPlayer()
- void setPlayTimeId(int playTimeId)
- void setVotifierVotes(int votifierVotes)
- int getId()
- void addItemDonationFrom(CMIItemDonations donation)
- boolean isShiftEditEnabled()
- void setDisplayName(String displayName)
- void addCounter(String cmd, Long time)
- void setLastTeleportLocation(Location tpLoc)
- void setLastTeleportLocation(Location tpLoc, boolean save)
- void setPatroled()
- BossBarInfo getBossBar(String name)
- boolean isVanished()
- CmiHome getHome(String name)
- String getDisplayNameClean(boolean update)
- CMIVanish getVanishOrNull()
- boolean isSitting()
- void updateVanishMode()
- void setToggledOffBBCompass(Boolean toggleCompass)
- void setChatRoom(CMIChatRoom cmiChatRoom)
- Set<UUID> getIgnores()
- String getAfkReason()
- Long getLastDailyVoteTime()
- CMIPlayTime getCMIPlayTime()
- void removeHome(String name)
- void removeHome(CmiHome home)
- boolean addVotifierVote()
- boolean canUseKit(Kit kit)
- Long getRepeatableRewardTime(String name)
- long getJailedForTime()
- boolean isInCombatWithPlayer()
- boolean addIps(String ip)
- Double withdraw(Double balance, CMIUser target)
- Double withdraw(Double balance)
- Double withdraw(String worldName, Double balance)
- Double withdraw(String worldName, Double balance, CMIUser source)
- Long getGotLastDamageAt()
- HashMap<String, Long> getKitsAsMap()
- **static** Player getOnlinePlayer(CommandSender sender, String playerName)
- **static** Player getOnlinePlayer(CommandSender sender, String playerName, boolean partialName)
- **static** Player getOnlinePlayer(String playerName)
- **static** Player getOnlinePlayer(String playerName, boolean partialName)
- **static** Player getOnlinePlayer(UUID uuid)
- void addLastDamage(damageInformation lastDamage)
- void setLevel(int level)
- boolean isGod()
- void addHeadDropCount(UUID uuid)
- boolean isCommandSpy()
- boolean isTeleportToggled()
- void setFlying(boolean flying)
- void hideBossBars()
- **static** Collection<CMIUser> getUsers()
- boolean isSame(CommandSender sender)
- boolean isSame(Player player)
- V setOptions(HashMap<PlayerOption, Boolean> options)
- void removeBossBar(String name)
- void removeBossBar(BossBarInfo bossBar)
- Location getDeathLoc()
- String getBungeeBackLocation()
- long getTotalPlayTime()
- long getTotalPlayTime(boolean update)
- HashMap<String, Long> getCounter()
- Long getCounter(String cmd)
- boolean hasMoney(Double balance)
- String getPrefix()
- void setAfk(boolean afk)
- void setAfk(boolean afk, CMIAfkEnterEvent$AfkType type)
- void setAfk(boolean afk, CMIAfkEnterEvent$AfkType type, boolean performCommands)
- CMIRank getRank()
- CmiHome getBedHome()
- boolean isCuffed()
- Long getJailedUntil()
- long getExpForCurrentLevel()
- String getFormatedBalance()
- String getFormatedBalance(boolean shorts)
- String getFormatedBalance(String worldName)
- String getFormatedBalance(String worldName, boolean shorts)
- void setJailedBy(UUID jailedBy)
- void removeMail(PlayerMail mail)
- void setAlertUntil(long alertUntil)
- void setAlertUntil(long alertUntil, boolean)
- void setAlertUntil(long alertUntil, String)
- void setAlertUntil(long alertUntil, String, boolean reason)
- void addForDelayedSave()
- List<PlayerMail> getMails()
- CMIUser setBanned()
- CMIUser setBanned(String reason)
- CMIUser setBanned(Date until)
- CMIUser setBanned(String reason, Date until)
- CMIUser setBanned(String reason, CommandSender by, Date until)
- CMIUser setBanned(String reason, CMIUser by, Date until, Date when)
- Long getKitTime(Kit kit)
- Double getBalance()
- Double getBalance(String worldName)
- LinkedHashMap<String, CmiHome> getHomes()
- String getDisplayName()
- String getDisplayName(boolean update)
- String getIgnoresString()
- String getAlertReason()
- Long getKitUseTimeIn(Kit kit)
- HashMap<PlayerOption, Boolean> getOptions()
- int getDailyVoteCount()
- void addKit(Kit kit, Long time)
- void addKit(Kit kit, Long time, boolean save)
- void addKit(Kit kit, Long time, Integer usedTimes, boolean save)
- void addKit(String kitConfigName, Long time, Integer usedTimes, boolean save)
- String getJailedReason()
- void setGlow(ChatColor glow, boolean save)
- long getTotemCooldown()
- void updateGroup()
- String getNamePlatePrefix()
- boolean isSilenceMode()
- boolean isJoinedCounter()
- boolean leaveChatRoom()
- void setNamePlateSuffix(String namePlateSuffix)
- void setCommandSpy(boolean spy, boolean save)
- void setTfly(long tfly)
- void setTfly(long tfly, boolean)
- LinkedHashMap<Kit, CMIKitUsage> getKits()
- void unjail()
- int getKitUseTimes(Kit kit)
- void setNamePlatePrefix(String namePlatePrefix)
- void setTgod(long tgod)
- void setTgod(long tgod, boolean)
- String getMutedReason()
- AfkInfo getAfkInfo()
- void clearCachedFlyModes()
- boolean isShadowMuted()
- int getVotifierVotes()
- void setUuid(UUID uuid)
- HashMap<String, Long> getRepeatableRewards()
- void setOptionState(PlayerOption option, boolean state)
- long getExp()
- CMILocation getCMILogOutLocation()
- void setPlayTimeRewardId(int playTimeRewardId)
- CMIDirection getLookDirection()
- void addOneTimeReward(String name)
- int getLevel()
- V setMail(List<PlayerMail> mail)
- long getpTime()
- void setTagSoundEnabled(boolean tagEnabled)
- CMIPlayerWarning addWarning(String source, String reason, CMIWarningCategory category)
- CMIPlayerWarning addWarning(CMIPlayerWarning warning)
- void setpTime(long i)
- void setpTime(long pTime, boolean)
- void setSilenceMode(boolean silenceMode)
- ChatColor getGlow()
- long getAlertUntil()
- boolean isMuted()
- HashMap<String, Integer> getIps()
- void setTeleportInvulnerability(long teleportInvulnerability)
- void reapplyNamePlate()
- Player getPlayer()
- Player getPlayer(boolean loadOfflineObject)
- **static** Player getPlayer(String playerName)
- String getCountry()
- void setTotalPlayTime(long totalPlayTime)
- double getEntityHeadDropChance(EntityType type)
- double getEntityHeadDropChance(EntityType type, Boolean addEnchantBonus)
- void addLockedIps(String Ip)
- void setDidLastDamageToEntity(Long didLastDamageToMob)
- Boolean getCollision()
- boolean isNoPayToggled()
- String getNameColor()
- void addCommandCooldownByEndTime(String cmd, Long time, Long endTime)
- void setVanished(boolean vanished)
- void setVanished(boolean vanished, boolean fireEvent)
- void addIgnore(UUID ignore, boolean save)
- V setKits(LinkedHashMap<Kit, CMIKitUsage> kits)
- void setItemInOffHand(ItemStack item)
- void setShiftEditEnabled(boolean shiftEditEnabled)
- void setTeleportToggled(boolean noTeleport, boolean save)
- Long getMutedUntil()
- void setId(int id)
- void updateJailedTimeOnJoin()
- boolean isShowTotemBar()
- void setGotLastDamageAt(Long gotLastDamageAt)
- boolean isClaimedReward(PTROneTime reward)
- Mirrors getMirror()
- Collection<CMIKitUsage> getKitsUsages()
- void setTotemWarmup(long totemWarmup)
- void addEntityKill(EntityType type)
- void setAcceptingPM(boolean acceptingPM)
- int getWarningPoints()
- void setJailedForTime(long jailedForTime)
- void setJailedForTime(long jailedForTime, boolean)
- void setNickName(String nickName, boolean save)
- HashMap<UUID, PlayerKillCount> getKills()
- void clearBossMaps()
- V setIgnores(Set<UUID> ignores)
- void setTotemCooldown(long totemCooldown)
- int getInvId()
- OfflinePlayer getOfflinePlayer()
- String getSuffix()
- void addNote(PlayerNote note, boolean save)
- void reaplyNamePlate()
- UUID getUuid()
- Location getLastTeleportLocation()
- void unloadData()
- void setShadowMutedUntil(long shadowMutedUntil)
- boolean isCMIVanished()
- String getLastIp()
- void setNamePlateNameColor(ChatColor namePlateNameColor)
- boolean hadAllowFlight()
- int getLastHomeSlot()
- boolean isInCombatWithMob()
- void setAfkReason(String reason)
- int getValidHomeCount()
- long getStatistic(StatsManager$CMIStatistic stat)
- long getStatistic(StatsManager$CMIStatistic stat, Object thing)
- void resetLastDamage()
- void cacheClear()
- UUID getJailedBy()
- **static** CMIUser getUser(String playerName)
- **static** CMIUser getUser(OfflinePlayer player)
- **static** CMIUser getUser(Player player)
- **static** CMIUser getUser(UUID uuid)
- CompletableFuture<CMITeleportFeedback> teleport(Entity ent)
- CompletableFuture<CMITeleportFeedback> teleport(Location loc)
- CompletableFuture<CMITeleportFeedback> teleport(Location loc, CMITeleportType type)
- ArrayList<String> getHomesList()
- boolean isOnline()
- long getTeleportInvulnerability()
- long getLastPatrol()
- PlayerCharge getPCharge()
- PlayerCharge getPCharge(boolean update)
- boolean isSpy()
- worldFlyState removeFlyCachedMode(String worldName)
- boolean isCollidable()
- void updatePlayTime()
- LinkedHashMap<String, CMILocation> getHomesAsMap()
- List<PlayerNote> getNotes()
- List<PlayerNote> getNotes(boolean filterOldOut)
- long getPlayTimeOptimizedOn()
- void setDeathLoc(CMILocation deathLoc)
- void updateDisplayName()
- void updateDisplayName(boolean force)
- boolean isSignSpy()
- void setAlertReason(String alertReason)
- void setAlertReason(String alertReason, boolean save)
- long getLastLogin()
- long getLastLogin(boolean forceUpdate)
- void setMutedUntil(long mutedUntil)
- void setRank(CMIRank rank)
- boolean isIgnoring(UUID uuid)
- CMIBanEntry getBanEntryRaw()
- CMIBanEntry getBanEntry()
- CMIBanEntry getBanEntry(boolean update)
- Boolean isFakeAccount()
- Boolean isToggledOffBBCompass()
- void removeAlert()
- CMIRank getNullRank()
- String getGroupName()
- CMIUser resetKitUseTimes(Kit kit)
- boolean wasFlying()
- Location getLogOutLocation()
- Long getGotLastDamageFromMob()
- void setSpy(boolean spy)
- PlayerMeta getMeta()
- String getMeta(String Key)
- void updateInventory()
- void setLogOutLocation(Location logOutLocation)
- void setLogOutLocation(CMILocation logOutLocation)
- void setFakeAccount(boolean isFakeAccount)
- long getTotemWarmup()
- long getTotalPlayTimeClean()
- HashMap<UUID, CMIItemDonations> getPendingDonations()
- AfkInfo getAfkInfoSafe()
- void takeExp(long exp)

### Class: com.Zrips.CMI.Containers.CMIUserAlert
Type: Class

Constructors:
- CMIUserAlert(long until)
- CMIUserAlert(long until, String reason)

Methods:
- String getReason()
- void setReason(String reason)
- long getUntil()
- void setUntil(long until)

### Class: com.Zrips.CMI.Containers.CMIUserJailData
Type: Class

Methods:
- String getJailedReason()
- CMIJailCell getCell()
- UUID getJailedBy()
- void setJailedForTime(long jailedForTime)
- void setJailedBy(UUID jailedBy)
- void setCell(CMIJailCell cell)
- long getJailedForTime()
- void setJailedReason(String jailedReason)

### Class: com.Zrips.CMI.Containers.CMIVanish
Type: Class

Constructors:
- CMIVanish(CMIUser user)

Methods:
- Long getVanishedFrom()
- void setWasCollidable(Boolean wasCollidable)
- void set(VanishAction action, boolean state)
- void set(VanishAction action, int state)
- VanishActionState getState(VanishAction action)
- void setPlaytimeAtVanishStart(Long playtimeAtAfkStart)
- void setVanishedFrom(Long vanishedFrom)
- Boolean getWasCollidable()
- CMIUser getUser()
- Long getPlaytimeAtVanishStart()
- boolean is(VanishAction action)
- String toString()
- void fromString(String line)
- void setUser(CMIUser user)

### Class: com.Zrips.CMI.Containers.CMIWorldLimits
Type: Class

Methods:
- **static** HashMap<String, Boolean> getWorldGodMode()
- **static** Boolean getWorldGodMode(String worldName)
- **static** boolean isGodModeLimited(String worldName)
- **static** void loadConfig()
- **static** HashMap<String, Boolean> getWorldElytraMode()
- **static** Boolean getWorldElytraMode(String worldName)
- **static** HashMap<String, Integer> getFlyAboveRoofLimitationsMap()
- **static** boolean isWorldLimits()
- **static** HashMap<String, GameMode> getWorldGameMode()
- **static** GameMode getWorldGameMode(String worldName)
- **static** HashMap<String, List<CreatureSpawnEvent$SpawnReason>> getBlockedSpawnReasons()
- **static** Integer getFlyAboveRoof(String worldName)
- **static** boolean isBlockedSpawnReason(String worldName, CreatureSpawnEvent$SpawnReason reason)
- **static** boolean isReenabledFlyAfterDeath()
- **static** boolean isGameModeLimited(String worldName)
- **static** boolean isFlyAboveRoof()
- **static** boolean isElytraModeLimited(String worldName)
- **static** HashMap<String, Boolean> getWorldFlyMode()
- **static** Boolean getWorldFlyMode(String worldName)
- **static** boolean isFlyModeLimited(String worldName)

### Class: com.Zrips.CMI.Containers.ChunkInfo
Type: Class

Constructors:
- ChunkInfo(int x, int z)

Methods:
- void setW(World w)
- World getW()
- int getX()
- int getZ()

### Class: com.Zrips.CMI.Containers.ChunkPreviewInfo
Type: Class

Methods:
- Player getPlayer()
- World getWorld()
- void setX(int mcaX)
- CMITask getScheduleTask()
- int getRegionChecked()
- void addChunk(ChunkInfo chunk)
- File[] getRegionFiles()
- void setZ(int mcaZ)
- void setAutoSpeed(boolean autoSpeed)
- int getCX()
- void addFound()
- int getCZ()
- void setShowInfo(long time)
- int getRange()
- long getStartTime()
- int getloaded()
- void addChunkCkecked()
- int getCurrentId()
- int getFound()
- void setRegionFiles(File[] regionFiles)
- String getPlayerName()
- V addChunks(ArrayList<ChunkInfo> chunks)
- void setSpeed(int speed)
- int getSpeed()
- boolean isMessages()
- void setWorld(World world)
- void setScheduleTask(CMITask task)
- void addRegionChecked()
- void setCurrentId(int id)
- void setShowRegionInfo(boolean state)
- void setMessages(boolean messages)
- void addLoaded()
- void setChunksCkeckedLast(int chunksCkeckedLast)
- void setRunning(boolean state)
- void addCX()
- void setCX(int cX)
- boolean isRunning()
- boolean isAutoSpeed()
- int getChunksCkeckedLast()
- void setStartTime()
- void addCZ()
- void setCZ(int cZ)
- long getShowInfo()
- void setRange(int range)
- void setPlayer(Player Player)
- ArrayList<ChunkInfo> getChunks()
- int getChunkChecked()
- boolean isShowRegionInfo()
- int getX()
- int getZ()

### Class: com.Zrips.CMI.Containers.CommandAlias
Type: Class

Constructors:
- CommandAlias(String alias, List<String> commands, boolean state)
- CommandAlias(String alias, List<String> commands, boolean state, CommandAliasType type)
- CommandAlias(String alias, List<String> commands, boolean state, CommandAliasType type, String cmiCommandName)
- CommandAlias(String alias, String fileName, List<String> commands, boolean state)
- CommandAlias(String alias, String fileName, List<String> commands, boolean state, CommandAliasType type)
- CommandAlias(String alias, String fileName, List<String> commands, boolean state, CommandAliasType type, String cmiCommandName)

Methods:
- void recheckTabCompletes()
- void addAlternative(String alternative)
- void recalculateDynamicVariables()
- void setDisableBase(boolean disableBase)
- void setExact(boolean exact)
- Set<String> getAlternatives()
- boolean isAddTabs()
- List<String> getCommands()
- void setOverrideTab(boolean overrideTab)
- String getCleanCommand()
- void setFileName(String fileName)
- boolean isRequiresPerm()
- CMITabComplete getCustomTab()
- String getAliasBaseCommand()
- boolean isDisableBase()
- boolean isExact()
- boolean isAlternative()
- String getFileName()
- boolean isTabComplete()
- List<Object> getTabCompleteList(String args)
- V setCommands(List<String> commands)
- String getCommand()
- String getCommand(CommandSender sender, List<String> args)
- String getAliasAsOneWordNS()
- void setAlternative(boolean alternative)
- V setCustomTab(List<String> customTab)
- void setTabComplete(boolean tabComplete)
- String getAliasAsOneWord()
- boolean containsDynamicVariables()
- V setAlternatives(Set<String> alternatives)
- boolean getState()
- String getCommandsForLore()
- void setAddTabs(boolean addTabs)
- CommandAliasType getType()
- List<String> getCustomTabRawList()
- void setRequiresPerm(boolean requiresPerm)
- void setState(boolean state)
- void setAlias(String alias)
- String getCmiCommandName()
- String getAlias()
- boolean isOverrideTab()

### Class: com.Zrips.CMI.Containers.CommandAliasType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- base
- subbase
- custom

Methods:
- **static** CommandAliasType valueOf(String name)
- **static** CommandAliasType[] values()

### Class: com.Zrips.CMI.Containers.CommandReg
Type: Abstract Class
Implements: org.bukkit.command.CommandExecutor, org.bukkit.command.TabExecutor

Constructors:
- CommandReg(String command, CommandAlias alias)

Methods:
- boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
- List<String> onTabComplete(CommandSender sender, Command cmd, String label, String args)
- boolean register()
- boolean register(String permission)

### Class: com.Zrips.CMI.Containers.CondenseResult
Type: Class

Constructors:
- CondenseResult(int inputAmount, int resultAmount)

Methods:
- List<ItemStack> getToAdd()
- int getResultAmount()
- void addImputAmount(int imputAmount)
- int getImputAmount()
- void addToAdd(ItemStack toAdd)
- void addResultAmount(int resultAmount)

### Class: com.Zrips.CMI.Containers.CounterInfo
Type: Class

Constructors:
- CounterInfo(String message, List<Player> list, int t, CMI plugin)

Methods:
- void lowerTime()
- List<Player> getList()
- CMI getPlugin()
- String getMessage()
- int getLeftTime()

### Class: com.Zrips.CMI.Containers.DamageControl
Type: Class

Constructors:
- DamageControl(String node, EntityDamageEvent$DamageCause cause, double mult)

Methods:
- double getMult()
- void setNode(String node)
- void setCause(EntityDamageEvent$DamageCause cause)
- String getNode()
- EntityDamageEvent$DamageCause getCause()
- void setMult(double mult)

### Class: com.Zrips.CMI.Containers.Direction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SOUTH
- WEST
- NORTH
- EAST

Methods:
- String getDirection()
- **static** Direction valueOf(String name)
- **static** Direction[] values()

### Class: com.Zrips.CMI.Containers.FixChunkInfo
Type: Class

Methods:
- Vector getCenter()
- World getWorld()
- void setX(int mcaX)
- CMITask getScheduleTask()
- double getRegionChecked()
- void addChunk(ChunkInfo chunk)
- List<File> getRegionFiles()
- void setZ(int mcaZ)
- void setAutoSpeed(boolean autoSpeed)
- void addFound()
- void setShowInfo(long time)
- int getRange()
- List<ChunkInfo> getChunksResult()
- long getStartTime()
- int getloaded()
- RegionFiles getCurrentRegion()
- void addChunkCkecked()
- int getCurrentId()
- int getFound()
- V setRegionFiles(List<File> regionFiles2)
- void setCenter(Vector center)
- V addChunks(ArrayList<ChunkInfo> chunks)
- void setSpeed(int speed)
- int getSpeed()
- double getTotal()
- boolean isMessages()
- CommandSender getSender()
- void setWorld(World world)
- void setScheduleTask(CMITask task)
- void setTotal(double total)
- void addRegionChecked()
- void setCurrentId(int id)
- void setShowRegionInfo(boolean state)
- void setMessages(boolean messages)
- void addLoaded()
- void addChunkResult(ChunkInfo c)
- void setOnlyChunks(boolean state)
- void setChunksCkeckedLast(double checked2)
- void setRunning(boolean state)
- void setCurrentRegion(RegionFiles currentRegion)
- boolean isRunning()
- boolean isAutoSpeed()
- double getChunksCkeckedLast()
- void setStartTime()
- long getShowInfo()
- void setRange(int range)
- ArrayList<ChunkInfo> getChunks()
- double getChunkChecked()
- boolean isShowRegionInfo()
- int getX()
- int getZ()
- void setSender(UUID sender)
- boolean isOnlyChunks()

### Class: com.Zrips.CMI.Containers.LocationType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- INVENTORY
- ENDERCHEST

Methods:
- String getName()
- **static** LocationType valueOf(String name)
- **static** LocationType[] values()

### Class: com.Zrips.CMI.Containers.PInfo
Type: Class

Constructors:
- PInfo(String permission, String desc, boolean cmd)
- PInfo(String permission, String desc, boolean cmd, boolean others)
- PInfo(String permission, String desc)

Methods:
- String getPermission()
- boolean isOthers()
- String getDesc()
- void setCmd(boolean cmd)
- void setDesc(String desc)
- void setPermission(String permission)
- void setOthers(boolean others)
- boolean isCmd()

### Class: com.Zrips.CMI.Containers.PlayerMail
Type: Class

Constructors:
- PlayerMail(String sender, Long time, String message)
- PlayerMail(String sender, Long time, String message, Long keepForSeconds)
- PlayerMail(CommandSender sender, String message)
- PlayerMail(CommandSender sender, String message, Long keepForSeconds)
- PlayerMail(CommandSender sender, long time, String message, Long keepForSeconds)

Methods:
- void setKeepFor(Long keepFor)
- Long getTime()
- String getMessage()
- Long getKeepFor()
- void setSender(String sender)
- void setMessage(String message)
- String getSender()
- void setTime(Long time)

### Class: com.Zrips.CMI.Containers.PlayerNote
Type: Class

Constructors:
- PlayerNote(String sender, Long time, String note)

Methods:
- Long getTime()
- void setNote(String note)
- String getNote()
- void setSender(String sender)
- String getSender()
- void setTime(Long time)

### Class: com.Zrips.CMI.Containers.RandomTeleport
Type: Class

Constructors:
- RandomTeleport(boolean enabled, int MaxDistance, int MinDistance, CMILocation center)
- RandomTeleport(World world, int MaxDistance, int MinDistance, int centerX, int centerZ)
- RandomTeleport(World world)

Methods:
- boolean isIgnoreMaterials()
- Set<String> getIgnoredBiomes()
- boolean isIgnoredMaterial(CMIMaterial material)
- Location getCenter()
- boolean isCircle()
- boolean isAllowFromAnotherWorld()
- RandomTeleport setMinY(int minY)
- RandomTeleport setIgnoreLava(boolean ignoreLava)
- RandomTeleport setMinDistance(int minDistance)
- RandomTeleport setPreferredBiomes(Set<String> preferredBiomes)
- RandomTeleport setIgnoreLeaves(boolean ignoreLeaves)
- RandomTeleport setIgnoreWater(boolean ignoreWater)
- RandomTeleport setIgnoreCrawl(boolean IgnoreCrawl)
- Set<String> getPreferredBiomes()
- int getMaxTries()
- boolean isIgnoreLeaves()
- RandomTeleport setMaxTries(int maxTries)
- CMIVectorInt3D getRandomLocation()
- boolean isPreferredBiome(String biome)
- RandomTeleport setIgnoredMaterials(Set<CMIMaterial> ignoredMaterials)
- boolean isRequireWorldPermission()
- RandomTeleport setIgnoredBiomes(Set<String> ignoredBiomes)
- RandomTeleport setCooldown(int cooldown)
- RandomTeleport setCenter(CMILocation loc)
- int getMaxY()
- int getMaxDistance()
- boolean isIgnoreWater()
- RandomTeleport setCircle(boolean circle)
- int getCooldown()
- RandomTeleport setSurfaceOnly(boolean surfaceOnly)
- RandomTeleport setEnabled(boolean enabled)
- boolean isIgnoredBiome(String biome)
- RandomTeleport setIgnorePowderSnow(boolean ignorePowderSnow)
- int getMinCord()
- boolean isIgnoreCrawl()
- RandomTeleport setFromAnotherWorld(boolean fromAnotherWorld)
- boolean isEnabled()
- RandomTeleport setMaxDistance(int maxDistance)
- int getMinDistance()
- int getCooldownWithDefault()
- int getMaxCord()
- boolean isIgnorePowderedSnow()
- RandomTeleport setMaxY(int maxY)
- boolean isSurfaceOnly()
- RandomTeleport setRequireWorldPermission(boolean requireWorldPermission)
- int getMinY()
- boolean isIgnoreLava()

### Class: com.Zrips.CMI.Containers.RegionFiles
Type: Class

Constructors:
- RegionFiles(File path)

Methods:
- boolean hasChunk(int x, int z)
- void close() throws IOException

### Class: com.Zrips.CMI.Containers.ScanFindPlace
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CHEST
- TRAPPED_CHEST
- FURNACE
- DROPPER
- DISPENSER
- ITEM_FRAME
- HOPPER
- BREWING_STAND
- HORSE
- ENTITY
- MINECART_CHEST
- MINECART_HOPPER
- ARMOR_STAND
- SHULKER_BOX
- SHULKER_INCEPTION
- UNKNOWN

Methods:
- String getName()
- **static** ScanFindPlace valueOf(String name)
- **static** ScanFindPlace[] values()

### Class: com.Zrips.CMI.Containers.SilentChest
Type: Class

Constructors:
- SilentChest(Player player, Inventory inv, Location loc)

Methods:
- void setEditing(boolean state)
- void setSourceInventory(Inventory sourceInventory)
- Location getLocation()
- Player getPlayer()
- Inventory getInv()
- boolean isEditing()
- Inventory getSourceInventory()

### Class: com.Zrips.CMI.Containers.SleepStats
Type: Class

Constructors:
- SleepStats(World world)

Methods:
- void setTotal(double total)
- void setOnline(int online)
- World getWorld()
- void setPercent(double percent)
- **static** void loadConfig()
- int getOnline()
- void onBedLeave(Player player)
- int needToBeSleeping()
- void onBedEnter(Player player)
- void setSpeed(int speed)
- void setSleeping(double sleeping)
- int getSpeed()
- double getPercent()
- double getTotal()
- int getWorldOnline()
- void setWorld(World world)
- double getSleeping()

### Class: com.Zrips.CMI.Containers.Snd
Type: Class

Constructors:
- Snd(Player sender, Player target)

Methods:
- CMIUser getSenderUser()
- Snd setSource(Player sender)
- Snd setSource(CMIUser user)
- Snd setSource(CommandSender sender)
- Snd setSource(ConsoleCommandSender console)
- String getSenderName()
- ConsoleCommandSender getConsoleTarget()
- String getTargetName()
- ConsoleCommandSender getConsoleSender()
- void setSourceUser(CMIUser sourceUser)
- CMIUser getTargetUser()
- Snd setSenderName(String senderName)
- ConsoleCommandSender getConsoleSource()
- Player getPlayerSource()
- void setTargetUser(CMIUser targetUser)
- Player getPlayerSender()
- void setSenderUser(CMIUser senderUser)
- Snd setTarget(Player sender)
- Snd setTarget(CMIUser user)
- Snd setTarget(CommandSender sender)
- Snd setTarget(ConsoleCommandSender console)
- Player getPlayerTarget()
- Snd setSender(Player sender)
- Snd setSender(CMIUser user)
- Snd setSender(CommandSender sender)
- Snd setSender(ConsoleCommandSender console)
- Snd setTargetName(String targetName)
- CMIUser getSourceUser()

### Class: com.Zrips.CMI.Containers.Speed
Type: Class

Constructors:
- Speed(Player player)

Methods:
- Long getSuperBoost()
- boolean isAllowSuperBoost()
- boolean isGoodTime()
- void setFree(boolean free)
- void setBoost(Long boost)
- void setBb(BossBarInfo bb)
- boolean isSpeedometer()
- void setSuperBoost(Long superBoost)
- BossBarInfo getBb()
- boolean isShowDurability()
- boolean isAllowBoost()
- boolean isSuperBoosting()
- boolean isFree()
- double getSpeed()
- boolean isBoosting()
- Long getBoost()
- void setLoc(Location loc)
- void setTime(Long time)

### Class: com.Zrips.CMI.Containers.UCInfo
Type: Class

Methods:
- void addRegionChecked()
- void setCurrentId(int id)
- V setChunks(List<Chunk> chunks)
- CMITask getScheduleTask()
- void setShowRegionInfo(boolean state)
- void setMessages(boolean messages)
- int getRegionChecked()
- void setAutoSpeed(boolean autoSpeed)
- void setChunksCkeckedLast(int chunksCkeckedLast)
- void setRunning(boolean state)
- boolean isRunning()
- void addFound()
- void setShowInfo(long time)
- boolean isAutoSpeed()
- int getChunksCkeckedLast()
- long getStartTime()
- void setStartTime()
- void addChunkCkecked()
- int getCurrentId()
- long getShowInfo()
- int getFound()
- String getPlayerName()
- int getChunkChecked()
- List<Chunk> getChunks()
- boolean isShowRegionInfo()
- void setSpeed(int speed)
- int getSpeed()
- boolean isMessages()
- void setSender(CommandSender sender)
- CommandSender getSender()
- void setScheduleTask(CMITask task)

### Class: com.Zrips.CMI.Containers.UserDataUpdateType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- prefix
- suffix
- group
- nameColor
- displayname

Methods:
- **static** UserDataUpdateType valueOf(String name)
- **static** UserDataUpdateType[] values()

### Class: com.Zrips.CMI.Containers.itemInfo
Type: Class

Constructors:
- itemInfo(CMIMaterial mat)
- itemInfo(Material mat)

Methods:
- Material getMaterial()
- CMIMaterial getMat()
- int getChance()
- void setChance(int chance)
- void setId(CMIMaterial mat)
- void setMaterial(Material mat)

### Class: com.Zrips.CMI.Containers.teleportAll
Type: Class

Methods:
- Player getPlayer()
- Location getDestination()
- String getTargetWorld()
- void setPlayer(Player Player)
- List<String> getNames()
- void addName(String name)
- void setTargetFolder(String targetFolder)
- void setDestination(Location destination)
- String getTargetFolder()
- void addTeleported()
- V setTask(CompletableFuture<Void> task)
- void setTargetWorld(String targetWorld)
- int getTeleportedCount()
- CompletableFuture<Void> getTask()

### Class: com.Zrips.CMI.Containers.worldFlyState
Type: Class

Constructors:
- worldFlyState(GameMode mode, boolean state, boolean temp)

Methods:
- void setTemp(boolean temp)
- boolean isTemp()
- void setMode(GameMode mode)
- GameMode getGameMode()
- boolean isFlyEnabled()
- void setFlyEnabled(boolean state)

## Package: com.Zrips.CMI.CustomEventTrigers

### Class: com.Zrips.CMI.CustomEventTrigers.AnvilListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AnvilListener(CMI plugin)

Methods:
- void onItemRepair(PrepareAnvilEvent event)
- void onItemRepair(InventoryClickEvent event)
- void PrepareAnvilEvent(PrepareAnvilEvent event)
- void onitemRename(InventoryClickEvent event)

## Package: com.Zrips.CMI.Locale

### Class: com.Zrips.CMI.Locale.CMILC
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- info_Same
- info_cantLoginWithDifCap
- info_NoCommandWhileSleeping
- info_PurgeNotEnabled
- info_TeamManagementDisabled
- info_NoGameMode
- info_NameChange
- info_Cooldowns
- info_specializedCooldowns
- info_specializedRunning
- info_CooldownOneTime
- info_WarmUp_canceled
- info_WarmUp_counter
- info_WarmUp_DontMove
- info_WarmUp_Boss_DontMove
- info_WarmUp_Boss_WaitFor
- info_FailedSpawnerMine
- info_ClickSpawner
- info_Elevator_created
- info_CantPlaceSpawner
- info_ChunksLoading
- info_CantUseNonEncrypted
- info_CantUseTrident
- info_CantDecode
- info_CantTeleport
- info_CantTeleportDistance
- info_BlackList
- info_wrongPortal
- info_ItemWillBreak
- info_ArmorWillBreak
- info_flyingToHigh
- info_specializedItemFail
- info_sunSpeeding
- info_sleepersRequired
- info_sunSpeedingTitle
- info_skippingNight
- info_sunSpeedingSubTitle
- info_repairConfirm
- info_bookDate
- info_maintenance
- info_mapLimit
- info_startedEditingPainting
- info_canceledEditingPainting
- info_changedPainting
- info_noSpam
- info_noCmdSpam
- info_spamConsoleInform
- info_FirstJoin
- info_LogoutCustom
- info_LoginCustom
- info_deathlocation
- info_book_exploit
- info_combat_CostToOpen
- info_combat_CantUseShulkerBox
- info_combat_CantUseCommand
- info_combat_bossBarPvp
- info_combat_bossBarPve
- info_noSchedule
- info_totem_cooldown
- info_totem_warmup
- info_totem_cantConsume
- info_InventorySave_info
- info_InventorySave_saved
- info_InventorySave_NoSavedInv
- info_InventorySave_NoEntries
- info_InventorySave_CantFind
- info_InventorySave_TopLine
- info_InventorySave_List
- info_InventorySave_KillerSymbol
- info_InventorySave_Click
- info_InventorySave_IdDontExist
- info_InventorySave_Deleted
- info_InventorySave_Restored
- info_InventorySave_GotRestored
- info_InventorySave_LoadForSelf
- info_InventorySave_LoadForOwner
- info_InventorySave_NextInventory
- info_InventorySave_PreviousInventory
- info_InventorySave_Editable
- info_InventorySave_NonEditable
- info_vanishSymbolOn
- info_vanishSymbolOff
- info_afkSymbolOn
- info_afkSymbolOff
- info_beeinfo
- info_decoratedpotinfo
- info_pvp_noGodDamage
- info_pve_noGodDamage
- info_InvEmpty_armor
- info_InvEmpty_hand
- info_InvEmpty_maininv
- info_InvEmpty_maininvslots
- info_InvEmpty_inv
- info_InvEmpty_offhand
- info_InvEmpty_quickbar
- info_InvEmpty_quickbarslots
- info_InvEmpty_subinv
- info_InvEmpty_subinvslots
- info_Relog
- info_Any
- info_outsideWorldBorder
- info_noWorldAccess
- info_IncorrectColor
- info_time_days
- info_time_hours
- info_time_minutes
- info_time_seconds
- warp_list
- afk_off
- afk_MayNotRespond
- afk_MayNotRespondStaff
- BossBar_hpBar
- BossBar_playerhpBar
- Potion_Effects
- Potion_List
- Potion_NoPotions
- Information_Title
- Information_Health
- Information_Hunger
- Information_Saturation
- Information_Exp
- Information_NotEnoughExp
- Information_NotEnoughExpNeed
- Information_tooMuchExp
- Information_NotEnoughVotes
- Information_TooMuchVotes
- Information_BadGameMode
- Information_BadArea
- Information_GameMode
- Information_Flying
- Information_Uuid
- Information_FirstConnection
- Information_Lastseen
- Information_Onlinesince
- Information_Money
- Information_Group
- econ_commandCost
- econ_disabled
- Elytra_Speed
- Elytra_SpeedBoost
- Elytra_SpeedSuperBoost
- Elytra_CanUse
- Elytra_CantGlide
- Elytra_Charging
- NetherPortal_ToHigh
- NetherPortal_ToWide
- NetherPortal_Creation
- NetherPortal_Disabled
- Ender_Title
- Chat_localPrefix
- Chat_shoutPrefix
- Chat_LocalNoOne
- Chat_shoutDeduction
- Chat_publicHover
- Chat_privateHover
- Chat_staffHover
- Chat_helpopHover
- Chat_link
- Chat_item
- Chat_itemAmount
- Chat_itemEmpty
- Spy_Chat_msg
- Spy_Chat_custom
- Spy_Command_msg
- Spy_Sign_msg
- info_CommandFormat
- info_ServerSwitchOut
- info_ServerSwitchIn

Methods:
- **static** void sendMessageByPath(Object sender, String path, Object[] variables)
- **static** void sendMessageByPath(String locale, Object sender, String path, Object[] variables)
- **static** String getIM(Class<*> c, String path, Object variables)
- **static** String getIM(Object c, String path, Object[] variables)
- **static** String getIM(String cmd, String path, Object[] variables)
- String getPt()
- String getText()
- **static** CMILC valueOf(String name)
- **static** CMILC[] values()
- List<String> getComments()
- **static** int broadcastMessage(String msg)
- **static** int broadcastMessage(CommandSender sender, String msg)
- **static** int broadcastMessage(CommandSender sender, PermissionsManager$CMIPerm perm, String msg)
- **static** int broadcastMessage(CommandSender sender, String msg, boolean showForsender)
- **static** I broadcastMessage(CommandSender sender, String msg, boolean showForsender, Set<Player> ignorePlayers)
- **static** I broadcastMessage(CommandSender sender, String msg, boolean showForsender, PermissionsManager$CMIPerm perm, Set<Player> ignorePlayers)
- void sendMessage(Object sender, Object[] values)
- **static** void sendMessage(Object sender, String msg)
- **static** void sendMessage(Object sender, String msg, boolean updateSnd)
- **static** void sendMessage(Object sender, String msg, boolean updateSnd, boolean translateColors)
- **static** void sendMessage(Object sender, String msg, boolean updateSnd, boolean translateColors, boolean translatePlaceholders)
- **static** void sendMessage(Object sender, String msg, boolean updateSnd, boolean translateColors, boolean translatePlaceholders, boolean filterNewLine)
- **static** List<String> getIML(String cmd, String path, Object variables)
- **static** List<String> getIML(Object c, String path, Object variables)
- **static** List<String> getIML(Class<*> c, String path, Object variables)
- String getLocale(Object[] values)
- **static** V info(Class<*> c, CMIUser user, String path, Object variables)
- **static** void info(Object c, CMIUser user, String path, Object[] variables)
- **static** V info(Class<*> c, CommandSender sender, String path, Object variables)
- **static** void info(Object thi, CommandSender sender, String path, Object[] variables)
- **static** void info(String c, CommandSender sender, String path, Object[] variables)
- **static** void info(String c, Player player, String path, Object[] variables)

### Class: com.Zrips.CMI.Locale.Language
Type: Class

Constructors:
- Language(CMI plugin)

Methods:
- String replacePlayer(String type, Player player, Player whoGets, String msg)
- String replacePlayer(String type, Location loc, String msg)
- String replacePlayer(Location loc, String msg)
- boolean containsKey(String key)
- List<String> getMessageList(String key, Object variables)
- boolean containsLKey(String locale, String key)
- String getMessage(String key, Object[] variables)
- FileConfiguration getCustom()
- Set<String> getKeys(String path)
- String getDefaultMessage(String key)
- boolean isList(String key)
- String getLMessage(String locale, String key, Object[] variables)
- List<String> updateSnd(Snd snd, List<String> msg)
- String updateSnd(Snd snd, String msg)
- void reload()
- List<String> getMessageLList(String locale, String key, Object variables)
- String filterNewLine(String msg)
- Set<String> getLKeys(String locale, String path)
- boolean isString(String key)
- String replaceUser(String type, CMIUser user, String msg)
- String replaceUser(String type, CMIUser user, Player whoGets, String msg)
- boolean isLList(String locale, String key)

## Package: com.Zrips.CMI.Modules.AStand

### Class: com.Zrips.CMI.Modules.AStand.ArmorStandCopy
Type: Class

Methods:
- void setStand(ArmorStand stand)
- Player getPlayer()
- Set<ArmorStandManager$armorStandExtraActions> getExtraCopy()
- Set<ArmorStandManager$armorStandActions> getCopy()
- ArmorStand getStand()
- void setPlayer(Player player)
- void duplicateOn(ArmorStand stand)

### Class: com.Zrips.CMI.Modules.AStand.ArmorStandListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ArmorStandListener(CMI plugin)

Methods:
- void onArmorStandDeath(EntityDeathEvent event)
- void armorStandSpawnEvent(CreatureSpawnEvent event)
- void onBlockInteract(PlayerInteractEvent event)

### Class: com.Zrips.CMI.Modules.AStand.ArmorStandListener1_8
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ArmorStandListener1_8(CMI plugin)

Methods:
- void PlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event)
- **static** boolean checkInteract(Player player, Entity ent)
- void editorCheck(PlayerInteractAtEntityEvent event)
- void onPlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event)
- **static** boolean checkManipulation(Player player, Entity ent)
- void vanillaBugFix(PlayerInteractAtEntityEvent event)

### Class: com.Zrips.CMI.Modules.AStand.ArmorStandManager
Type: Class

Constructors:
- ArmorStandManager(CMI plugin)

Methods:
- boolean canInteract(Player player, Entity ent, boolean checkInteraction)
- void updateArmorStandItems(CMIGui gui)
- boolean isTooFar(Player player, Entity ent)
- void loadConfig(ConfigReader cfg)
- void removeSavedArmorStand(String name)
- void save()
- void removeEditor(Player player)
- boolean openEditor(Player player, Entity ent, boolean checkInteraction)
- V duplicate(ArmorStand source, ArmorStand target, Set<ArmorStandManager$armorStandActions> copy)
- boolean openCopyWindow(Player player, ArmorStand armor)
- Entity getLast(Player player)
- boolean openSaveWindow(Player player, Entity ent)
- void load()
- V duplicateExtra(ArmorStand source, ArmorStand target, Set<ArmorStandManager$armorStandExtraActions> copy)
- void switchArmorStandArms(CMIGui gui)
- boolean isOk(CMIGui gui)
- ArmorStandSave getSavedArmorStand(String name)
- boolean openPositionEditor(Player player, Entity ent)
- UUID getEditorOf(UUID uuid)
- void changeAngle(CMIGui gui, ArmorStandManager$armorStandActions apose, ArmorStandManager$armorStandPoseC coord, int value)
- void changeAngle(ArmorStand armor, Player player, ArmorStandManager$armorStandActions apose, ArmorStandManager$armorStandPoseC coord, int value)
- HashMap<String, ArmorStandSave> getSavedArmorStands()
- boolean isBeingEdited(UUID uuid)
- void removeEditorWithDelay(UUID uuid)

### Class: com.Zrips.CMI.Modules.AStand.ArmorStandManager$armorStandActions
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- head
- body
- torso
- leftArm
- rightArm
- leftLeg
- rightLeg
- pos

Methods:
- **static** ArmorStandManager$armorStandActions valueOf(String name)
- **static** ArmorStandManager$armorStandActions[] values()
- **static** ArmorStandManager$armorStandActions getByName(String name)

### Class: com.Zrips.CMI.Modules.AStand.ArmorStandManager$armorStandEditorSlots
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- helmet
- chest
- offhand
- mainhand
- leggings
- boots

Methods:
- int getSlot()
- **static** ArmorStandManager$armorStandEditorSlots valueOf(String name)
- **static** ArmorStandManager$armorStandEditorSlots[] values()
- **static** ArmorStandManager$armorStandEditorSlots getBySlot(int slot)

### Class: com.Zrips.CMI.Modules.AStand.ArmorStandManager$armorStandExtraActions
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- updateitems
- plate
- size
- visible
- arms
- gravity
- glow
- invulnerable
- name
- interactable
- scale

Methods:
- **static** ArmorStandManager$armorStandExtraActions valueOf(String name)
- **static** ArmorStandManager$armorStandExtraActions[] values()
- **static** ArmorStandManager$armorStandExtraActions getByName(String name)

### Class: com.Zrips.CMI.Modules.AStand.ArmorStandManager$armorStandPoseC
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- x
- y
- z

Methods:
- **static** ArmorStandManager$armorStandPoseC valueOf(String name)
- **static** ArmorStandManager$armorStandPoseC[] values()

### Class: com.Zrips.CMI.Modules.AStand.ArmorStandManager$armorStandSaveOptions
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- helmet
- chest
- offhand
- mainhand
- leggings
- boots
- name
- body
- plate
- size
- visible
- arms
- gravity
- glow
- invulnerable
- interactable
- scale
- head
- torso
- leftArm
- rightArm
- leftLeg
- rightLeg

Methods:
- Vector getMin()
- Vector getMax()
- **static** ArmorStandManager$armorStandSaveOptions valueOf(String name)
- **static** ArmorStandManager$armorStandSaveOptions[] values()
- **static** ArmorStandManager$armorStandSaveOptions getByName(String name)
- Vector getDefault()

### Class: com.Zrips.CMI.Modules.AStand.ArmorStandSave
Type: Class

Methods:
- void setName(String name)
- String serialize()
- void setStand(ArmorStand stand)
- Player getPlayer()
- String getName()
- boolean apply(ArmorStand stand)
- void setSerialized(String serialized)
- String getSerialized()
- ItemStack createItem()
- ArmorStand getStand()
- void setPlayer(Player player)
- Set<ArmorStandManager$armorStandSaveOptions> getSaveOptions()

## Package: com.Zrips.CMI.Modules.Afk

### Class: com.Zrips.CMI.Modules.Afk.AfkInfo
Type: Class

Methods:
- void setAfkFrom(Long afkFrom)
- void setAfkAt(CMIVectorInt3D afkAt)
- String getReason()
- int getKicksPerformed()
- CMIVectorInt3D getAfkAt()
- long getAfkFrom()
- void setKickOutInSec(int kickOutIn)
- void setType(CMIAfkEnterEvent$AfkType type)
- void setKicksPerformed(int kicksPerformed)
- CMIAfkEnterEvent$AfkType getType()
- void setReason(String reason)
- void addKicksPerformed()
- void setPlaytimeAtAfkStart(Long playtimeAtAfkStart)
- long getPlaytimeAtAfkStart()
- int getKickOutInSec()

### Class: com.Zrips.CMI.Modules.Afk.AfkListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AfkListener(CMI plugin)

Methods:
- void EntityTargetLivingEntityEvent(EntityTargetLivingEntityEvent event)
- void onItemDrop(PlayerDropItemEvent event)
- void CMIAfkLeaveEvent(CMIAfkLeaveEvent event)
- void CMIAfkEnterEvent(CMIAfkEnterEvent event)
- void onPlayerRespawnEvent(PlayerRespawnEvent event)
- void onPlayerAliasCommand(PlayerCommandPreprocessEvent event)
- void PlayerInteractEvent(PlayerInteractEvent event)
- void PlayerQuitEvent(PlayerQuitEvent event)
- void onEntityDamageByEntityEvent(EntityDamageByEntityEvent event)
- void onPlayerTeleportEvent(PlayerTeleportEvent event)
- void onBlockBreakEvent(BlockBreakEvent event)
- void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event)
- void InventoryClickEvent(InventoryClickEvent event)
- void onFishingRodUse(PlayerFishEvent event)
- void CreatureSpawnEvent(CreatureSpawnEvent event)
- void PlayerLoginEvent(PlayerLoginEvent event)
- void onPlayerMove(PlayerMoveEvent event)
- void PlayerToggleSneakEvent(PlayerToggleSneakEvent event)
- void PlayerItemHeldEvent(PlayerItemHeldEvent event)
- **static** boolean isSameDirection(CMIUser user)
- void PlayerPickupItemEvent(PlayerPickupItemEvent event)
- void CMIAfkKickEvent(CMIAfkKickEvent event)
- void onPlayerCommand(PlayerCommandPreprocessEvent event)
- void EntityDamageEvent(EntityDamageEvent event)
- void onFishingRodUseOnPlayer(PlayerFishEvent event)

### Class: com.Zrips.CMI.Modules.Afk.AfkListener1_8
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AfkListener1_8(CMI plugin)

Methods:
- void onSplashPotion(PotionSplashEvent event)
- void PlayerInteractEntityEvent(PlayerInteractAtEntityEvent event)

### Class: com.Zrips.CMI.Modules.Afk.AfkListener1_9
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AfkListener1_9(CMI plugin)

Methods:
- void onLingeringSplashPotion(LingeringPotionSplashEvent event)
- void onLingeringEffectApply(AreaEffectCloudApplyEvent event)

### Class: com.Zrips.CMI.Modules.Afk.AfkManager
Type: Class

Constructors:
- AfkManager(CMI plugin)

Methods:
- boolean isPreventHook()
- boolean isPreventMobSpawning()
- List<String> getAwayTrigerCommands()
- void removeAfkInfo(UUID uuid)
- boolean isPreventMobDamage()
- boolean nearActivePlayer(Location loc, CreatureSpawnEvent$SpawnReason reason)
- boolean isSmartInteractCheck()
- boolean isDisableOnInteract()
- void setStopPlayTime(boolean stopPlayTime)
- void removeUser(CMIUser user)
- boolean isPreventMobSpawningNatural()
- boolean isPreventJumping()
- AfkInfo createAfkInfo(UUID uuid)
- boolean isAfk(UUID uuid)
- Set<CMIUser> getAfkPlayers()
- V setAwayTrigerCommands(List<String> awayTrigerCommands)
- boolean isStopPlayTime()
- List<String> getManualAwayTrigerCommands()
- boolean isPreventMobVillageDefence()
- boolean isDisableOnInventoryClick()
- V removeUserFromAfk(CMIUser user, List<String> cmds)
- boolean isDisableOnMove()
- boolean isAfkEnabled()
- void setLastAction(CMIUser user, long time)
- boolean isPreventDamage()
- void stop()
- HashMap<UUID, AfkInfo> getAfkPlayersMap()
- void showTitle(CMIUser user, boolean fade)
- boolean isDisableOnLookAround()
- boolean isDisableOnPrivateChat()
- void loadConfig()
- boolean isDisableOnFishing()
- void removeFromAfkTimePreventer(CMIUser user)
- boolean isPreventPushing()
- List<String> getManualLeaveCommands()
- **static** Boolean isNear(Location loc1, Location loc2)
- V setManualAwayTrigerCommands(List<String> manualAwayTrigerCommands)
- Long getLastAction(CMIUser user)
- boolean isDisableOnPublicChat()
- AfkInfo getAfkInfo(UUID uuid)
- V setManualLeaveCommands(List<String> manualLeaveCommands)
- boolean isDisabledWorld(World world)
- boolean isDisabledWorld(String name)
- boolean isDisableExpPickup()
- void updateUser(CMIUser user)
- long getClosestKickTime()
- long getAwayTrigerTime()
- void AddToAfkTimePreventer(CMIUser user)
- boolean isDisableOnCommand()
- void hideTitle(CMIUser user)
- boolean isDisableItemPickup()
- boolean isAntiAfkMachines()
- boolean isPreventMobSpawningSpawners()
- V setAutoLeaveCommands(List<String> autoLeaveCommands)
- int getAfkPlayerCount()
- List<String> getAutoLeaveCommands()
- int getCheckInterval()
- List<String> getLeaveTrigerCommands()
- V setUserToAfk(CMIUser user, List<String> cmds)
- boolean isDisableOnItemDrop()

### Class: com.Zrips.CMI.Modules.Afk.checkInfo
Type: Class

Methods:
- boolean timeToCheck()
- Location getLocation()
- void updateLocation(Location loc)
- double getPrevAngle()
- Long getTime()
- boolean isSameDirection(Location loc)
- void updateTime()
- void setPrevAngle(double prevAngle)
- boolean isOnlyPitchChange(Location loc)

## Package: com.Zrips.CMI.Modules.Alias

### Class: com.Zrips.CMI.Modules.Alias.AliasManager
Type: Class

Constructors:
- AliasManager(CMI plugin)

Methods:
- List<String> updateCommands(CommandAlias alias, List<String> args, List<String> commands)
- void saveNew()
- void saveNew(String fileName)
- HashMap<String, CommandAlias> getAll()
- LinkedHashMap<String, CommandAlias> getDefaultAlias()
- List<CommandAlias> getAliasStartingWith(String msg)
- List<CommandAlias> getAliasStartingWith(String msg, CommandAliasType type)
- void fullLoad()
- void save()
- LinkedHashMap<String, CommandAlias> getCustom()
- void clearCache()
- void addDefault(CommandAlias ca)
- void load()
- void removeCustom(String command)
- void removeCustom(CommandAlias ca)
- void loadRegularAlias()
- CommandAlias getAliasForCommand(String msg)
- void addCustom(CommandAlias ca)
- HashMap<String, CommandAlias> getFrom()

### Class: com.Zrips.CMI.Modules.Alias.AliasTabCompListener_1_13_older
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void PlayerChatTabCompleteEvent(PlayerChatTabCompleteEvent event)

### Class: com.Zrips.CMI.Modules.Alias.AliasTabCompListener_1_14_never
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void PlayerChatTabCompleteEvent(TabCompleteEvent event)
- void onPlayerCommandSendEvent(PlayerCommandSendEvent event)

### Class: com.Zrips.CMI.Modules.Alias.Allias
Type: Class
Extends: com.Zrips.CMI.Containers.CommandReg

Constructors:
- Allias(String command, CommandAlias alias)

Methods:
- boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)

### Class: com.Zrips.CMI.Modules.Alias.onPreprocessCommand
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onCommand(PlayerCommandPreprocessEvent event)
- void onCommandSpy(PlayerCommandPreprocessEvent event)

### Class: com.Zrips.CMI.Modules.Alias.onServerPreprocessCommand
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void RemoteServerCommandEvent(RemoteServerCommandEvent event)
- void onConsoleCommand(ServerCommandEvent event)

## Package: com.Zrips.CMI.Modules.Animations

### Class: com.Zrips.CMI.Modules.Animations.AnimationColoredArmorListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AnimationColoredArmorListener(CMI plugin)

Methods:
- void leatherArmor(CMIArmorChangeEvent event)
- void leatherArmor(PlayerJoinEvent event)

### Class: com.Zrips.CMI.Modules.Animations.AnimationListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AnimationListener(CMI plugin)

Methods:
- void onPlayerQuitRiding(PlayerQuitEvent event)

### Class: com.Zrips.CMI.Modules.Animations.AnimationListener1_21
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AnimationListener1_21(CMI plugin)

Methods:
- **static** void process(Entity ent, Entity dismounted)
- void VehicleEnterEvent(EntityMountEvent event)
- void VehicleExitEvent(EntityDismountEvent event)

### Class: com.Zrips.CMI.Modules.Animations.AnimationListenerLegacy
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AnimationListenerLegacy(CMI plugin)

Methods:
- void VehicleExitEvent(EntityDismountEvent event)

### Class: com.Zrips.CMI.Modules.Animations.AnimationManager
Type: Class

Constructors:
- AnimationManager(CMI plugin)

Methods:
- int getChairRange()
- void addRiding(UUID riding, UUID vehicle)
- void addRiding(Player player, Entity vehicle)
- boolean isStairsAsChairs()
- void loadConfig()
- HashMap<UUID, UUID> getRidingList()
- boolean isBeingRiden(UUID uuid)
- boolean isSlabsAsChairs()
- void clearCache(UUID uuid)
- void removePlayerFromChair(UUID uuid)
- void removePlayerFromChair(Player player)
- void removePlayerFromChair(Player player, boolean delay)
- void removePlayerFromChair(Player player, boolean delay, boolean center)
- void removePlayerFromChair(Player player, boolean delay, boolean center, boolean teleport)
- void removePlayer(UUID uuid)
- void removePlayer(Player player)
- void removePlayer(Player player, boolean delay)
- Entity getChair(Player player)
- UUID removeRiding(UUID uuid)
- boolean isSitOnStairs()
- boolean isDoubleClickWait(Player player)
- boolean isRiding(UUID uuid)
- CompletableFuture<List<Entity>> removePassengers(Player player, String playerName)
- boolean isDoubleClick()
- boolean isSomeOneSittingHere(Block block)
- boolean isValidChairBlock(Block block)
- void sit(Player player)
- void sit(Player player, boolean persistent)
- void sit(Player player, Location location, boolean persistent)
- void sit(Player player, Block block)
- void sit(Player player, Block block, boolean persistent)
- boolean isSitting(Player player)
- boolean isRemoveFromChairOnDamage()
- **static** int getIntFromColor(int Red, int Green, int Blue)
- UUID getBeingRiden(UUID uuid)
- void setSitOnStairs(boolean sitOnStairs)
- void addLeatherArmor(Player player)
- void sitOnPlayer(Player player, Player target)
- void stopLeatherUpdate()
- boolean isRidingNonSteerable(UUID uuid)

### Class: com.Zrips.CMI.Modules.Animations.AnimationManager$Chair
Type: Class

Constructors:
- AnimationManager$Chair(AnimationManager this$0)

Methods:
- void setLastCheck(long lastCheck)
- long getLastCheck()
- boolean isPersistent()
- AnimationManager$Chair setArmorStandLoc(Location armorStandLoc)
- Location getChairLoc()
- void setPersistent(boolean persistent)
- Location getArmorStandLoc()
- AnimationManager$Chair setEnt(Entity ent)
- AnimationManager$Chair setChairLoc(Location chairLoc)
- Entity getEnt()

### Class: com.Zrips.CMI.Modules.Animations.AnimationManager$LeatherAnimationType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Rainbow
- Health
- Biome
- Day

Methods:
- **static** AnimationManager$LeatherAnimationType getById(int id)
- **static** AnimationManager$LeatherAnimationType valueOf(String name)
- **static** AnimationManager$LeatherAnimationType[] values()
- **static** AnimationManager$LeatherAnimationType getByName(String name)
- void setId(Integer id)
- Integer getId()

### Class: com.Zrips.CMI.Modules.Animations.AnimationRideListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AnimationRideListener(CMI plugin)

Methods:
- void EntityDeathEvent(EntityDeathEvent event)
- void PlayerMoveEvent(VehicleMoveEvent event)
- void PlayerMoveEvent(PlayerMoveEvent event)
- void PlayerDeathEvent(PlayerDeathEvent event)
- void EntityTeleportEvent(PlayerTeleportEvent event)
- void EntityDamageEvent(EntityDamageEvent event)

### Class: com.Zrips.CMI.Modules.Animations.AnimationSitListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AnimationSitListener(CMI plugin)

Methods:
- void PlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event)
- void VehicleExitEvent(VehicleExitEvent event)
- void PlayerTeleportEvent(PlayerTeleportEvent event)
- void PlayerTeleportEvent(PlayerDeathEvent event)
- void PlayerTeleportEvent(PlayerQuitEvent event)
- void PlayerTeleportEvent(PlayerInteractEvent event)
- void BlockBreakEvent(BlockBreakEvent event)
- void PlayerMoveEvent(PlayerMoveEvent event)
- void EntityTeleportEvent(EntityTeleportEvent event)
- void EntityDamageEvent(EntityDamageEvent event)

### Class: com.Zrips.CMI.Modules.Animations.LeatherAnimation
Type: Class

Methods:
- void setSascending(boolean sascending)
- void setSaturationValue(Float saturationValue)
- boolean isSascending()
- void setAscending(boolean ascending)
- AnimationManager$LeatherAnimationType getAnimation(CMIPlayerInventory$CMIInventorySlot slot)
- V setMap(HashMap<Integer, AnimationManager$LeatherAnimationType> map)
- boolean isAscending()
- void setColorValue(Float colorValue)
- Float getColorValue()
- Float getSaturationValue()
- void setAnimation(CMIPlayerInventory$CMIInventorySlot slot, AnimationManager$LeatherAnimationType type)
- HashMap<Integer, AnimationManager$LeatherAnimationType> getMap()

## Package: com.Zrips.CMI.Modules.Anvil

### Class: com.Zrips.CMI.Modules.Anvil.CMIAnvilGUI$AnvilClickEventHandler
Type: Interface

Methods:
- void onAnvilClose(InventoryCloseEvent)
- void onAnvilClick(CMIAnvilGUI$AnvilClickEvent)

### Class: com.Zrips.CMI.Modules.Anvil.AnvilColorRenameListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AnvilColorRenameListener(CMI plugin)

Methods:
- void PrepareAnvilEvent(PrepareAnvilEvent event)
- void CMIItemRenameEvent(CMIAnvilItemRenameEvent event)

### Class: com.Zrips.CMI.Modules.Anvil.AnvilManager
Type: Class

Constructors:
- AnvilManager(CMI plugin)

Methods:
- int getRepairCost(ItemStack source, ItemStack source2, ItemStack result)

### Class: com.Zrips.CMI.Modules.Anvil.AnvilUnlimitedListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- AnvilUnlimitedListener(CMI plugin)

No public methods found

### Class: com.Zrips.CMI.Modules.Anvil.CMIAnvilGUI
Type: Class

Constructors:
- CMIAnvilGUI(Player Player, CMIAnvilGUI$AnvilClickEventHandler Handler)

Methods:
- Player getPlayer()
- void setColorRename(boolean ColorRename)
- void setSlotName(CMIAnvilGUI$AnvilSlot Slot, String Name)
- Field getField(Class<*> clazz, String fieldName) throws Exception
- void setTitle(String Title)
- String getSlotName(CMIAnvilGUI$AnvilSlot Slot)
- void setSlot(CMIAnvilGUI$AnvilSlot Slot, ItemStack Item)
- ItemStack getSlot(CMIAnvilGUI$AnvilSlot Slot)
- String getDefaultText()
- String getTitle()
- void setDefaultText(String DefaultText)
- boolean getColorRename()
- void open()
- void open(String Title)

### Class: com.Zrips.CMI.Modules.Anvil.CMIAnvilGUI$AnvilClickEvent
Type: Class

Constructors:
- CMIAnvilGUI$AnvilClickEvent(CMIAnvilGUI this$0, CMIAnvilGUI$AnvilSlot Slot, ItemStack Item, String Text)

Methods:
- CMIAnvilGUI$AnvilSlot getSlot()
- String getText()
- void setItemStack(ItemStack Item)
- ItemStack getItemStack()
- boolean hasText()

### Class: com.Zrips.CMI.Modules.Anvil.CMIAnvilGUI$AnvilSlot
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- INPUT_LEFT
- INPUT_RIGHT
- OUTPUT

Methods:
- int getSlot()
- **static** CMIAnvilGUI$AnvilSlot valueOf(String name)
- **static** CMIAnvilGUI$AnvilSlot[] values()
- **static** CMIAnvilGUI$AnvilSlot bySlot(int Slot)

## Package: com.Zrips.CMI.Modules.ArmorEffects

### Class: com.Zrips.CMI.Modules.ArmorEffects.ArmorEffectListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ArmorEffectListener(CMI plugin)

Methods:
- void onPlayerLoginNameCheck(PlayerJoinEvent event)
- void onPlayerQuit(PlayerQuitEvent event)
- void onBlockInteract(CMIArmorChangeEvent event)

### Class: com.Zrips.CMI.Modules.ArmorEffects.ArmorEffectManager
Type: Class

Constructors:
- ArmorEffectManager(CMI plugin)

Methods:
- **static** PotionEffect getPotionEffect(Player player, PotionEffectType type)
- void addPlayer(UUID uuid)
- boolean checkPlayerArmor(Player player)
- void tasker()
- void onDisable()
- void removePlayer(UUID uuid)

## Package: com.Zrips.CMI.Modules.AttachedCommands

### Class: com.Zrips.CMI.Modules.AttachedCommands.CustomNBTListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- CustomNBTListener(CMI plugin)

Methods:
- void playerInteractAtEntityDamageCommand(EntityDamageByEntityEvent event)
- **static** void clearCache(UUID uuid)
- void playerConsumeEvent(PlayerItemConsumeEvent event)
- void playerInteractCommand(PlayerInteractEvent event)

### Class: com.Zrips.CMI.Modules.AttachedCommands.CustomNBTListener1_8
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- CustomNBTListener1_8(CMI plugin)

Methods:
- void playerInteractAtEntityCommand(PlayerInteractAtEntityEvent event)

### Class: com.Zrips.CMI.Modules.AttachedCommands.CustomNBTManager
Type: Class

Constructors:
- CustomNBTManager(CMI plugin)

Methods:
- ItemStack updateRepairLore(ItemStack item, UUID uuid)
- String handleConsoleCommand(Player player, String cmd)
- ItemStack clear(ItemStack iih)
- ItemStack updateUsesLore(ItemStack item)
- ItemStack updateUsesLore(ItemStack item, int uses)

### Class: com.Zrips.CMI.Modules.AttachedCommands.CustomNBTManager$CustomNBTType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NBTCommands
- CMILimitedUseCurrent
- CMILimitedUseMax
- CMISafeLimitedUse
- CMILimitedLeftClick
- CMIRepairMan
- Add
- Clear
- Take
- CMICheque
- MoneyCheque
- RandomId
- CooldownId
- Cooldown
- ItemCooldown

Methods:
- **static** CustomNBTManager$CustomNBTType valueOf(String name)
- **static** CustomNBTManager$CustomNBTType[] values()

### Class: com.Zrips.CMI.Modules.AttachedCommands.itemCooldown
Type: Class

Methods:
- Long getClickedOn()
- void setId(Integer id)
- Integer getId()
- void setClickedOn(Long clickedOn)

## Package: com.Zrips.CMI.Modules.BlueMap

### Class: com.Zrips.CMI.Modules.BlueMap.BlueMapListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- BlueMapListener(CMI plugin)

Methods:
- void onCMIWarpRemoveEvent(CMIWarpRemoveEvent event)
- void onCMIWarpCreateEvent(CMIWarpCreateEvent event)

### Class: com.Zrips.CMI.Modules.BlueMap.BlueMapManager
Type: Class

Constructors:
- BlueMapManager(CMI plugin)

Methods:
- void removeWarp(CmiWarp warp)
- void removeWarp(CmiWarp warp, Location location)
- void addWarp(CmiWarp warp)
- void addWarp(CmiWarp warp, CMILocation location)
- void loadConfig()
- void addAllWarpMarkers()

## Package: com.Zrips.CMI.Modules.BungeeCord

### Class: com.Zrips.CMI.Modules.BungeeCord.CMIBungeeCord$ForwardConsumer
Type: Interface

Methods:
- void accept(String, Player, byte[])

### Class: com.Zrips.CMI.Modules.BungeeCord.BungeeCordListener
Type: Class
Implements: org.bukkit.plugin.messaging.PluginMessageListener, org.bukkit.event.Listener

Constructors:
- BungeeCordListener(CMI plugin)

Methods:
- void onPluginMessageReceived(String channel, Player player, byte[] bytes)
- void onPlayerJoinEvent(PlayerJoinEvent event)
- void onPlayerQuitEvent(PlayerQuitEvent event)

### Class: com.Zrips.CMI.Modules.BungeeCord.BungeeCordManager
Type: Class

Constructors:
- BungeeCordManager(CMI plugin)

Methods:
- boolean isNamesInTabComplete()
- void sendPortalSetLocationToBungee(String setter, String targetServer, String portalName, Location loc)
- boolean isCMIBPresent()
- void sendPrivateMessage(String sender, String target, String message)
- BungeePlayer getBungeePlayer(String player)
- BungeePlayer getBungeePlayer(UUID uuid)
- void setCMIBPresent(boolean cMIBPresent)
- void sendBroadcastMessage(String sender, BungeeCordServer server, String message)
- void sendPublicMessage(String server, String sender, String message)
- void sendStaffMessage(String sender, String message)
- void sendStaffMessage(String server, String sender, String message)
- void updateServersIp()
- void setBungeeCord(boolean state)
- void updateServers()
- BungeeCordServer getServer(String server)
- int getPlayersInServer(String serverName)
- void talksWith(String who, String with)
- void sendPortalSetSuccessResponse(String setter, String targetServer, String portalName, String loc)
- void setThisServer(BungeeCordServer thisServer)
- void sendServerInformationToBungee()
- void teleporToLocation(String targetServer, UUID uuid, String loc, Location from)
- void teleporToLocation(String targetServer, UUID uuid, String loc, Location from, String cmds)
- CMIBungeeCord getBungeeCord()
- void sendPlayerListRequest()
- void recordBackLocation(String targetServer, UUID uuid, Location from)
- boolean isBackToPreviousServer()
- void updateServersInfo()
- void withWhomHeTalks(String playerName)
- Set<String> getPlayerNamesFromServers()
- Set<String> getPlayerNamesFromServers(boolean includeVanished, boolean checkWhiteListServers)
- boolean isBungee()
- boolean anyPlayersOnServer(String serverName)
- boolean isPlayerOnAnotherServer(String player)
- void loadConfig()
- String getThisServerName()
- HashMap<String, BungeeCordServer> getServers()
- void connectToServer(Player player, String serverName)
- void connectToServer(String player, String server)
- boolean isBungeeCord()
- void setNetworkType(CMIBungeeType type)
- void sendServerListRequest()
- void sendNetworkInfoUpdate()
- boolean isAnyoneElseOnlineOnNetwork(String excludedPlayer)
- void sendPlayerInfoRequest(String serverName)
- void forward(String server, String channelName, byte[] data)
- boolean isEnabledSupport()
- void sendMessage(String sender, String target, String message)
- BungeeCordServer getPlayerServer(UUID uuid)
- BungeeCordServer getPlayerServer(String player)
- void connectOther(String playerName, String server)
- BungeeCordServer getThisServer()
- void setThisServerName(String thisServerName)
- CMIBungeeType getNetworkType()
- String getThisServerNameOneWord()
- void initialize()
- void addServer(BungeeCordServer server)
- void sendNewPlayerInfoToNetwork(Player player)
- void sendNewPlayerInfoToNetwork(Player player, String server)

### Class: com.Zrips.CMI.Modules.BungeeCord.BungeeCordServer
Type: Class

Constructors:
- BungeeCordServer(String name, String ip, Integer port)

Methods:
- void setName(String name)
- BungeePlayer getPlayer(UUID uuid)
- BungeePlayer getPlayer(String name)
- void setOnline(boolean online)
- void setMaxPlayers(int maxPlayers)
- String getName()
- String getIp()
- int getCurrentPlayers()
- void update()
- boolean isOnline()
- int getMaxPlayers()
- String getMotd()
- void clearPlayers()
- void setNextCheck(Long nextCheck)
- void setPort(int port)
- void setIp(String ip)
- void removePlayer(UUID uuid, String name)
- int getPort()
- void addPlayer(BungeePlayer player)
- ConcurrentHashMap<String, BungeePlayer> getPlayersMapName()
- Long getNextCheck()
- void setMotd(String motd)
- ConcurrentHashMap<String, BungeePlayer> getPlayersMapUUID()

### Class: com.Zrips.CMI.Modules.BungeeCord.BungeePlayer
Type: Class

Methods:
- BungeePlayer setName(String playerName)
- BungeeCordServer getBungeeServer()
- String getName()
- boolean getVanished()
- void setPreviousServer(String previousServer)
- String getNickName()
- void setServerSwitchTime(Long serverSwitchTime)
- void setNickName(String nickName)
- BungeePlayer setUniqueId(UUID uuid)
- String getServerName()
- UUID getUniqueId()
- BungeePlayer setVanished(boolean vanished)
- String getPreviousServer()
- BungeePlayer setPlayerDisplayName(String playerDisplayName)
- void setBungeeServer(BungeeCordServer bungeeServer)
- Long getServerSwitchTime()
- String getPlayerDisplayName()

### Class: com.Zrips.CMI.Modules.BungeeCord.CMIBungeeCord
Type: Class

Constructors:
- CMIBungeeCord(Plugin plugin)

Methods:
- CompletableFuture<String> getServer()
- void forward(String server, String channelName, byte[] data)
- CompletableFuture<InetSocketAddress> getIp(Player player)
- CompletableFuture<Integer> getPlayerCount(String serverName)
- void unregister()
- void sendMessage(String playerName, String message)
- CompletableFuture<List<String>> getServers()
- CompletableFuture<String> getServerPlayerCount(String serverName)
- CompletableFuture<InetSocketAddress> getServerIp(String serverName)
- CompletableFuture<List<String>> getServersPlayerCount()
- void kickPlayer(String playerName, String kickMessage)
- void registerForwardListener(CMIBungeeCord$ForwardConsumer globalListener)
- void registerForwardListener(String channelName, CMIBungeeCord$ForwardConsumer listener)
- void connectOther(String playerName, String server)
- CompletableFuture<String> getUUID(Player player)
- CompletableFuture<String> getUUID(String playerName)
- void forwardToPlayer(String playerName, String channelName, byte[] data)
- **static** CMIBungeeCord of(Plugin plugin)
- CompletableFuture<List<String>> getPlayerList(String serverName)
- void connect(Player player, String serverName)

### Class: com.Zrips.CMI.Modules.BungeeCord.CMIBungeeType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BungeeCord
- Velocity
- Unknown

Methods:
- **static** CMIBungeeType valueOf(String name)
- **static** CMIBungeeType[] values()

### Class: com.Zrips.CMI.Modules.BungeeCord.ServerListPing
Type: Class

Constructors:
- ServerListPing(String ip, int port)
- ServerListPing(InetSocketAddress host)

Methods:
- ServerListPing$StatusResponse fetchData() throws IOException
- void writeVarInt(DataOutputStream out, int) throws IOException
- InetSocketAddress getAddress()
- int readVarInt(DataInputStream in) throws IOException

### Class: com.Zrips.CMI.Modules.BungeeCord.ServerListPing$Description
Type: Class

Constructors:
- ServerListPing$Description(ServerListPing this$0)

Methods:
- String getText()

### Class: com.Zrips.CMI.Modules.BungeeCord.ServerListPing$Description116
Type: Class

Constructors:
- ServerListPing$Description116(ServerListPing this$0)

Methods:
- Gson getText()

### Class: com.Zrips.CMI.Modules.BungeeCord.ServerListPing$Player
Type: Class

Constructors:
- ServerListPing$Player(ServerListPing this$0)

Methods:
- String getName()
- String getId()

### Class: com.Zrips.CMI.Modules.BungeeCord.ServerListPing$Players
Type: Class

Constructors:
- ServerListPing$Players(ServerListPing this$0)

Methods:
- int getMax()
- int getOnline()
- List<ServerListPing$Player> getSample()

### Class: com.Zrips.CMI.Modules.BungeeCord.ServerListPing$StatusResponse
Type: Class

Constructors:
- ServerListPing$StatusResponse(ServerListPing this$0)

Methods:
- String getFavicon()
- ServerListPing$Version getVersion()
- void setFavicon(String favicon)
- void setPlayers(ServerListPing$Players players)
- void setVersion(ServerListPing$Version version)
- int getTime()
- void setDescription(String description)
- ServerListPing$Players getPlayers()
- String getDescription()
- void setTime(int time)

### Class: com.Zrips.CMI.Modules.BungeeCord.ServerListPing$StatusResponse116
Type: Class

Constructors:
- ServerListPing$StatusResponse116(ServerListPing this$0)

Methods:
- String getFavicon()
- ServerListPing$Version getVersion()
- int getTime()
- ServerListPing$Players getPlayers()
- ServerListPing$Description116 getDescription()
- void setTime(int time)

### Class: com.Zrips.CMI.Modules.BungeeCord.ServerListPing$StatusResponse19
Type: Class

Constructors:
- ServerListPing$StatusResponse19(ServerListPing this$0)

Methods:
- String getFavicon()
- ServerListPing$Version getVersion()
- int getTime()
- ServerListPing$Players getPlayers()
- ServerListPing$Description getDescription()
- void setTime(int time)

### Class: com.Zrips.CMI.Modules.BungeeCord.ServerListPing$Version
Type: Class

Constructors:
- ServerListPing$Version(ServerListPing this$0)

Methods:
- String getName()
- String getProtocol()

## Package: com.Zrips.CMI.Modules.Chat

### Class: com.Zrips.CMI.Modules.Chat.CMIChatBubble
Type: Class

Constructors:
- CMIChatBubble(Player player, String text, Set<Player> receivers)

Methods:
- void show()
- CompletableFuture<Void> delete()
- CMITextDisplay getDisplay()

### Class: com.Zrips.CMI.Modules.Chat.CMIPlayerMessageColor
Type: Class

Constructors:
- CMIPlayerMessageColor(CMIChatColor color)
- CMIPlayerMessageColor(CMIChatColor color, Set<CMIChatColor> formats)

Methods:
- void setColor(CMIChatColor color)
- V setFormat(Set<CMIChatColor> formats)
- String formatsToString()
- CMIChatColor getColor()
- String toString()
- Set<CMIChatColor> getFormats()

### Class: com.Zrips.CMI.Modules.Chat.ChatBubbleListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ChatBubbleListener(CMI pl)

Methods:
- void AsyncPlayerChatEvent(AsyncPlayerChatEvent event)
- void onPlayerQuitEvent(PlayerQuitEvent event)

### Class: com.Zrips.CMI.Modules.Chat.ChatBubbleManager
Type: Class

Constructors:
- ChatBubbleManager(CMI plugin)

Methods:
- CMIChatBubble getBubble(UUID uuid)
- double getShowFor(String text)
- double getScale()
- int getLineWidth()
- void loadConfig(ConfigReader cfg)
- Color getBackgroundColor()
- double getOffset()
- CMIEventPriority getPriority()
- V showBubble(Player sender, String text, Set<Player> receivers)
- boolean isShadow()
- void clearCache(UUID uuid)
- boolean inRange(Location loc1, Location loc2)

### Class: com.Zrips.CMI.Modules.Chat.ChatManager
Type: Class

Constructors:
- ChatManager(CMI plugin)

Methods:
- boolean isChatIgnorePublicMessage()
- boolean isDiscordSRVRanged()
- CMIPlayerMessageColor getColorFromCache(UUID uuid)
- boolean isChatReplyToLastMessenger()
- Set<CMIPlayerMessageColor> getChatColors()
- CMIEventPriority getColorsPublicMessagesPriority()
- boolean isModifyChatFormat()
- boolean loadConfig(boolean isReload)
- String getDiscordSRVLabel()
- void removeFromCache(UUID uuid)
- boolean isColorsMe()
- void addToCache(UUID uuid, CMIPlayerMessageColor color)
- boolean isChatDiscordSRV()
- List<String> getCleanUpWhiteList()
- String getChatDiscordSRVGlobalChannel()
- boolean isColorsNickName()
- String getDiscordSRVUnlinkedLabel()
- boolean isColorsPublicMessages()
- CMIEventPriority getFormatPublicMessagesPriority()
- boolean isPrivateMessagesGroups()
- boolean isChatDynMapChat()
- boolean isColorsPrivateMessage()
- boolean isChatClickHoverMessages()
- int getLastMessengerTimeOut()

## Package: com.Zrips.CMI.Modules.ChatFilter

### Class: com.Zrips.CMI.Modules.ChatFilter.ChatFilterListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ChatFilterListener(CMI plugin)

No public methods found

### Class: com.Zrips.CMI.Modules.ChatFilter.ChatFilterManager
Type: Class

Constructors:
- ChatFilterManager(CMI plugin)

Methods:
- CMIEventPriority getCommandSpamPriority()
- **static** int editDistance(String s1, String s2)
- Set<String> getEmojis()
- boolean isCapToLowerCase()
- CMIEventPriority getCapsCheckPriority()
- void clearCache(UUID uuid)
- CMIEventPriority getFilterCheckPriority()
- boolean isSpamedCommand(Player player, String message)
- boolean isCancelCapEvent()
- RuleResponse getCorrectMessage(Player player, String message)
- RuleResponse getCorrectMessage(Player player, String message, boolean privateMessage)
- void loadCommandFilters()
- boolean checkCaps(Player player, String message)
- void load()
- CMIEventPriority getChatSpamPriority()
- **static** double similarity(String s1, String s2)
- String replaceEmoji(String message)
- CMIEventPriority getSignAdvertisementPriority()
- CMIEventPriority getSimpleReplacerPriority()
- boolean isSpam(Player player, String message)
- HashMap<String, String> getEmojiReplacerMap()

### Class: com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule
Type: Class

Constructors:
- ChatFilterRule(String ruleName, String group, List<String> list, String replaceWith, ChatFilterBlockType blockType, String messageToStaff, List<String> commands)
- ChatFilterRule(String ruleName, List<String> list)

Methods:
- V setCommands(List<String> commands)
- void setBlockType(ChatFilterBlockType blockType)
- void setInformConsole(boolean informConsole)
- String getRuleName()
- String getMessageToStaff()
- void setMessageToStaff(String messageToStaff)
- boolean isApplyToPrivateMessages()
- List<String> getCommands()
- void setGroup(String group)
- void setApplyToPrivateMessages(boolean applyToPrivateMessages)
- boolean isInformConsole()
- String getGroup()
- Matcher getMatcher(String msg)
- void setRuleName(String ruleName)
- void setReplaceWith(String replaceWith)
- ChatFilterRule setPattern(String list)
- V setPattern(List<String> list)
- List<Pattern> getPattern()
- ChatFilterBlockType getBlockType()
- String getReplaceWith()

### Class: com.Zrips.CMI.Modules.ChatFilter.MessageLog
Type: Class

Constructors:
- MessageLog(int range)

Methods:
- HashMap<Long, String> getMessages()
- void addMessage(String message)

### Class: com.Zrips.CMI.Modules.ChatFilter.RuleResponse
Type: Class

Constructors:
- RuleResponse(String message)

Methods:
- String getRulesNamesAsString()
- void setUpdatedMessage(String updatedMessage)
- void addRule(ChatFilterRule rule)
- ChatFilterBlockType getMaxFilterBlockType()
- void informStaff(Player player)
- String getUpdatedMessage()
- boolean isInformConsole()
- boolean isBypass(String bypass)
- void performCommands(Player player)
- void addBypass(String bypass)
- String getMessage()
- HashMap<String, ChatFilterRule> getRules()
- void setMessage(String message)

## Package: com.Zrips.CMI.Modules.ChatFormat

### Class: com.Zrips.CMI.Modules.ChatFormat.CMIChatRoom
Type: Class

Constructors:
- CMIChatRoom(String chatName)

Methods:
- Set<UUID> getInvitations()
- void addWatcher(CMIUser user)
- boolean removeWatcher(CMIUser user)
- void addUser(CMIUser user)
- boolean isPrivate()
- UUID getOwner()
- void informJoin(CMIUser joined)
- void setOwner(UUID owner)
- void removeInvitation(UUID uuid)
- boolean removeUser(CMIUser user)
- boolean isOwner(UUID check)
- Set<CMIUser> getUsers()
- boolean isPersistent()
- boolean isLocked()
- Set<UUID> getWatchersUUID()
- void setPersistent(boolean persistent)
- void setKeepAliveUntil(long keepAliveUntil)
- void informLeave(CMIUser left)
- void broadcastMessage(CMIUser sender, String msg)
- void addInvitation(UUID uuid)
- void setLocked(boolean locked)
- void cleanOldUsers()
- boolean kick(CMIUser user)
- boolean isInvited(UUID uuid)
- Set<CMIUser> getWatchers()
- long getKeepAliveUntil()
- void setChatName(String chatName)
- String getChatName()
- void setPrivate(boolean priv)

### Class: com.Zrips.CMI.Modules.ChatFormat.ChatColorListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ChatColorListener(CMI plugin)

No public methods found

### Class: com.Zrips.CMI.Modules.ChatFormat.ChatFormatListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ChatFormatListener(CMI plugin)

Methods:
- **static** String processGradientChat(Player player, String message)
- void AsyncPlayerChatEventBungee(AsyncPlayerChatEvent event)
- void AsyncPlayerChatEventRawConverter(AsyncPlayerChatEvent event)
- void AsyncPlayerChatEventPersonalMute(AsyncPlayerChatEvent event)
- void AsyncPlayerChatEventShadowMute(AsyncPlayerChatEvent event)

### Class: com.Zrips.CMI.Modules.ChatFormat.ChatFormatManager
Type: Class

Constructors:
- ChatFormatManager(CMI plugin)

Methods:
- String getGroupFormat(Player player)
- void setChatShoutRange(int chatShoutRange)
- RawMessage convertHoverOver(RawMessage rm, String message, Player player)
- RawMessage convertHoverOver(RawMessage rm, String message, Player player, boolean itemReplaced)
- void loadConfig(ConfigReader cfg)
- boolean createChatRoom(CMIUser user, String name, boolean priv)
- boolean createChatRoom(CMIUser user, String name, boolean priv, boolean locked, boolean persistent)
- void setChatMutedReason(String chatMutedReason)
- void save()
- String getGroupMessageFormat(Player player)
- StringBuilder convertHoverItem(StringBuilder str, String message, Player player, boolean itemReplaced)
- boolean isBungeePublicMessages()
- void clearCache(UUID uuid)
- HashMap<String, CMIChatRoom> getChatRooms()
- boolean leaveChatRoom(UUID uuid)
- void leaveChatRoom(CMIUser user)
- CMIChatRoom getChatRoom(String name)
- CMIChatRoom getChatRoom(UUID uuid)
- void load()
- Integer getChatShoutCost()
- boolean joinChatRoom(CMIUser user, String name)
- String getNickNamePrefix(CMIUser user)
- String getChatMutedReason()
- Long getChatMutedUntil()
- void sendMessage(String sender, String targetName, String message)
- void sendMessage(CommandSender sender, Player Target, String message)
- void sendMessage(CommandSender sender, Player Target, String message, boolean showToReceiver)
- void sendMessage(CommandSender sender, String senderName, Player Target, String targetname, String message)
- void sendMessage(CommandSender sender, String senderName, Player target, String targetname, String message, boolean showToReceiver)
- void setChatRoom(CMIUser user, CMIChatRoom cmiChatRoom)
- Set<UUID> getStaffChats()
- void setChatMutedUntil(Long chatMutedUntil)
- String getChatShoutColor()
- void setChatShoutCost(int chatShoutCost)
- int getChatShoutRange()
- boolean isBungeeMessages()
- void broadcastBungeeMessage(String sender, String message)
- boolean containsUrl(String message)
- boolean isBungeeStaffMessages()
- String updateUrl(String message)
- void setChatGeneralRange(int chatGeneralRange)
- int getChatGeneralRange()
- int getChatGeneralRange(World world)
- boolean isBungeePublicMessagesSingleIgnore()

### Class: com.Zrips.CMI.Modules.ChatFormat.ChatFormatManager$chatClickAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- pubmsg
- privmsg
- staffmsg
- helpop
- chatroom
- discord

Methods:
- String getCommand()
- String getCommand(CMIUser user)
- String getCommand(String playerName, String playerDisplayName, String playerNickName)
- void updateClickAction(RawMessage rm, CMIUser user)
- void updateClickAction(RawMessage rm, String playerName, String playerDisplayName, String playerNickName)
- **static** ChatFormatManager$chatClickAction valueOf(String name)
- **static** ChatFormatManager$chatClickAction[] values()
- void setCommand(String cmd)
- void setSuggestion(String sug)
- String getSuggestion(CMIUser user)
- String getSuggestion(String playerName, String playerDisplayName, String playerNickName)

## Package: com.Zrips.CMI.Modules.ChatTag

### Class: com.Zrips.CMI.Modules.ChatTag.TagListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- TagListener(CMI plugin)

Methods:
- void PlayerChatTabCompleteEvent(PlayerChatTabCompleteEvent event)

### Class: com.Zrips.CMI.Modules.ChatTag.TagManager
Type: Class

Constructors:
- TagManager(CMI plugin)

Methods:
- void setHardCoreMode(boolean hardCoreMode)
- void load(ConfigReader cfg)
- boolean isHardCoreMode()
- boolean isChatTagRemoveEta()
- String tag(Player player, String msg, String format)
- String tag(Player player, String msg, String format, boolean performCmds)
- String tag(CMIUser senderUser, String msg, String format, boolean performCmds)
- boolean isChatTagEnabled()
- String getChatTagColor()

## Package: com.Zrips.CMI.Modules.ChunkPreview

### Class: com.Zrips.CMI.Modules.ChunkPreview.ChunkPreview
Type: Class

Constructors:
- ChunkPreview(CMI plugin)

Methods:
- void loadRegionFile(ChunkPreviewInfo scan)
- void clearCache(UUID uuid)

## Package: com.Zrips.CMI.Modules.CmdCooldown

### Class: com.Zrips.CMI.Modules.CmdCooldown.CMICmdCooldown
Type: Class

Constructors:
- CMICmdCooldown(String command, int cdSeconds)

Methods:
- int getCooldownSeconds()
- ParticleManager$CMIPresetAnimations getAnimation()
- String getCommand()
- String getSubCommand()
- void setCooldown(int cdSeconds)
- void setCommand(String command)
- void setAnimation(ParticleManager$CMIPresetAnimations animation)

### Class: com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown
Type: Class

Methods:
- void addCooldown2(String cmd, Long time, Long timePeriod)
- HashMap<String, CmdCooldown$CMICooldown> getList()
- void removeCooldown(String cmd)
- void clear()
- void addCooldown(String cmd, int cooldownSeconds)
- void addCooldown(String cmd, Long startedAt, int cooldownSeconds)
- void addCooldown(String cmd, Long startedAt, double cooldownSeconds)

### Class: com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown$CMICooldown
Type: Class

Constructors:
- CmdCooldown$CMICooldown(CmdCooldown this$0, Long time, int cooldownSeconds)
- CmdCooldown$CMICooldown(CmdCooldown this$0, Long time, double cooldownSeconds)

Methods:
- Long getEndTime()
- int getTimePeriod()
- void setTimePeriod(int cooldownSeconds)
- void setInitialized(Long initialized)
- Long getDelta()
- Long getInitialized()

### Class: com.Zrips.CMI.Modules.CmdCooldown.CooldownListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- CooldownListener(CMI plugin)

Methods:
- void onCommand(PlayerCommandPreprocessEvent event)

### Class: com.Zrips.CMI.Modules.CmdCooldown.CooldownManager
Type: Class

Constructors:
- CooldownManager(CMI plugin)

Methods:
- boolean canUseSpecCommand(Player player, SpecCMDCooldown cooldown, boolean inform)
- void loadConfig()
- boolean canUseCmd(CommandSender sender, String cmd)
- boolean removeCooldown(CommandSender sender, String cmd)
- void addCD(String cmd, Long seconds)
- boolean canUseSpecCommandGlobal(CommandSender sender, SpecCMDCooldown cooldown, boolean inform)
- HashMap<String, CMICmdCooldown> getCooldowns()
- boolean isCmdInCooldown(CommandSender sender, String cmd)
- int getCooldownCount()
- void addCooldown(String cmd, int seconds)
- void addCooldown(CMICmdCooldown cooldown)

## Package: com.Zrips.CMI.Modules.CmdCost

### Class: com.Zrips.CMI.Modules.CmdCost.CMICommandCost
Type: Class

Constructors:
- CMICommandCost(String cmd, double cost)

Methods:
- boolean isConfirmation(UUID uuid, String cmd)
- String getCommand()
- void setCost(double cost)
- String getSubCommand()
- void addConfirmation(UUID uuid, String cmd)
- boolean isRequiresConfirmation()
- void removeConfirmation(UUID uuid)
- boolean isInformOnCharge()
- void setRequiresConfirmation(boolean requiresConfirmation)
- void setInformOnCharge(boolean informOnCharge)
- double getCost()
- void setCommand(String command)

### Class: com.Zrips.CMI.Modules.CmdCost.CMICommandCostManager
Type: Class

Constructors:
- CMICommandCostManager(CMI plugin)

Methods:
- boolean loadConfig(boolean isReload)
- CMICommandCostUsage canUseCmd(CommandSender sender, String cmd)
- boolean isContinueCommand(CommandSender sender, String cmd)
- void addCost(String cmd, double cost)
- CMICommandCost getCost(String cmd)
- int getCommandCostCount()

### Class: com.Zrips.CMI.Modules.CmdCost.CMICommandCostUsage
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Cant
- Can
- NoMoney
- CostBypass
- ReqConfirm

Methods:
- **static** CMICommandCostUsage valueOf(String name)
- **static** CMICommandCostUsage[] values()

## Package: com.Zrips.CMI.Modules.CmdWarmUp

### Class: com.Zrips.CMI.Modules.CmdWarmUp.CmdWarmUp
Type: Class

Constructors:
- CmdWarmUp(String command, Long warmUpTime, boolean move)

Methods:
- void setWU(Long warmUpTime)
- ParticleManager$CMIPresetAnimations getAnimation()
- String getCommand()
- Long getTime()
- String getSubCommand()
- void setCommand(String command)
- boolean isMove()
- void setAnimation(ParticleManager$CMIPresetAnimations animation)
- void setMove(boolean move)
- void setTime(Long warmUpTime)
- Long getWU()

### Class: com.Zrips.CMI.Modules.CmdWarmUp.WarmUpInfo
Type: Class

Constructors:
- WarmUpInfo(String cmd, boolean move)
- WarmUpInfo(Location loc, boolean move)

Methods:
- Location getLoc()
- int getLeftCount()
- CMIVisualEffect getEffectAnimation()
- String getCmd()
- void setLeftCount(int leftCount)
- void setBar(BossBarInfo bar)
- BossBarInfo getBar()
- void setTask(CMITask task)
- void setEffectAnimation(CMIVisualEffect effectAnimation)
- void setCmd(String cmd)
- void setLoc(Location loc)
- boolean isMove()
- CMITask getTask()
- void setMove(boolean move)

### Class: com.Zrips.CMI.Modules.CmdWarmUp.WarmUpListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- WarmUpListener(CMI plugin)

Methods:
- void onPlayerVelocityEvent(PlayerVelocityEvent event)
- void onPlayerMove(PlayerMoveEvent event)
- void onPlayerMove(PlayerTeleportEvent event)
- void onCommand(PlayerCommandPreprocessEvent event)
- void PlayerQuitEvent(PlayerQuitEvent event)
- void onPlayerDamage(EntityDamageEvent event)

### Class: com.Zrips.CMI.Modules.CmdWarmUp.WarmUpManager
Type: Class

Constructors:
- WarmUpManager(CMI plugin)

Methods:
- boolean cancel(UUID uuid)
- boolean cancel(UUID uuid, boolean soft)
- boolean canMove(Player player)
- boolean canMove(UUID uuid)
- boolean isOnWarmUp(Player player)
- boolean isOnWarmUp(UUID uuid)
- void loadConfig()
- boolean canMoveByCmd(String cmd)
- boolean startTeleportUsage(Player player, Location loc)
- boolean startTeleportUsage(TeleportManager$TpAction action, Player player, Location loc)
- void addWU(String cmd, CmdWarmUp warmup)
- boolean isWarmupCommand(CommandSender sender, String cmd)
- boolean startCmdUsage(CommandSender sender, String cmd)

## Package: com.Zrips.CMI.Modules.Collision

### Class: com.Zrips.CMI.Modules.Collision.CollisionListener
Type: Class
Implements: org.bukkit.event.Listener

No public methods found

### Class: com.Zrips.CMI.Modules.Collision.CollisionManager
Type: Class

No public methods found

## Package: com.Zrips.CMI.Modules.ConsoleFilter

### Class: com.Zrips.CMI.Modules.ConsoleFilter.CMIConsoleMessageType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ERROR
- CHAT
- COMMAND

Methods:
- **static** CMIConsoleMessageType valueOf(String name)
- **static** CMIConsoleMessageType[] values()

### Class: com.Zrips.CMI.Modules.ConsoleFilter.CMIConsoleRecord
Type: Class

Constructors:
- CMIConsoleRecord(String message, long time)

Methods:
- long getTime()
- String getMessage()

### Class: com.Zrips.CMI.Modules.ConsoleFilter.ConsoleFilterManager
Type: Class

Constructors:
- ConsoleFilterManager(CMI plugin)

Methods:
- **static** Plugin getPluginFromLogEvent(LogEvent event)
- void add(CMIConsoleRecord element)
- void load()
- int size()
- List<CMIConsoleRecord> getCachedMessages()
- CMIConsoleRecord get(int index)

### Class: com.Zrips.CMI.Modules.ConsoleFilter.ConsoleMessageListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ConsoleMessageListener(CMI plugin)

Methods:
- void onCMIAsyncConsoleMessageEvent(CMIAsyncConsoleMessageEvent event)

## Package: com.Zrips.CMI.Modules.CustomText

### Class: com.Zrips.CMI.Modules.CustomText.CText
Type: Class

Constructors:
- CText(String name)

Methods:
- void setName(String name)
- V setPages(HashMap<Integer, List<String>> p)
- void setAutoAlias(boolean autoAlias, boolean save)
- String getName()
- List<String> getPage(Integer page)
- void removePage(Integer page)
- void removePage(int page)
- HashMap<Integer, CTextPage> getPagesMap()
- boolean isAutoAlias()
- int getTotalPages()
- void setHidden(boolean hidden)
- String getPath()
- V addPage(Integer page, List<String> lines)
- void addPage(int place, CTextPage page)
- CTextPage getPageInfo(int page)
- boolean isAutoPage()
- V setPagesMap(HashMap<Integer, CTextPage> pages)
- void addPageLabel(int pageNumber, String label)
- boolean isRequirePermission()
- void replaceLine(Integer pageNumber, Integer lineNr, String line)
- void replaceLine(int pageNumber, int lineNr, String line)
- void setPath(String path)
- ItemStack convertToBook(Player player)
- void setRequirePermission(boolean requirePermission)
- boolean isHidden()
- void removeLine(Integer pageNumber, Integer lineNr)
- void removeLine(int pageNumber, int lineNr)
- void setAutoPage(boolean autoPage)
- void addLine(Integer page, String line)
- void addLine(int pageNumber, String line)
- int getTotalLines()
- HashMap<Integer, List<String>> getPages()

### Class: com.Zrips.CMI.Modules.CustomText.CText$bookPage
Type: Class

Constructors:
- CText$bookPage(CText this$0, String lines)
- CText$bookPage(CText this$0, boolean json, String lines)

Methods:
- void setLines(String lines)
- void setJson(boolean json)
- boolean isJson()
- String getLines()

### Class: com.Zrips.CMI.Modules.CustomText.CTextEditorListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- CTextEditorListener(CMI plugin)

Methods:
- void onShadowCommand(PlayerCommandPreprocessEvent event)
- void AsyncPlayerChatEvent(AsyncPlayerChatEvent event)

### Class: com.Zrips.CMI.Modules.CustomText.CTextManager
Type: Class

Constructors:
- CTextManager(CMI plugin)

Methods:
- String getChatEditorCmd(Player player)
- List<String> move(List<String> list, int place, int direction)
- CText getCText(String name)
- CText getCTextFromFile(File file)
- HashMap<String, CText> getAll()
- void showCText(CommandSender sender, CText cText, Integer page)
- void showCText(CommandSender sender, CMIUser source, CText cText, Integer page)
- V showCText(Set<Player> senders, CMIUser source, CText cText, Integer pageNumber)
- void save(CText cText)
- **static** String clean(String text)
- void deleteCText(String name)
- void delete(CText cText)
- void showCTextEditor(CommandSender sender, CText cText, Integer pageNumber)
- void load()
- boolean isChatEditing(Player player)
- void removeChatEditor(Player player)
- void removeCTextLine(CText cText, Integer pageNumber, Integer line)
- CText addNewCText(String name)
- void addChatEditor(Player player, String cmd)

### Class: com.Zrips.CMI.Modules.CustomText.CTextPage
Type: Class

Constructors:
- CTextPage(List<String> lines)

Methods:
- CTextPage setLines(List<String> lines)
- String getLabel()
- List<String> getLines()
- CTextPage setLabel(String label)

## Package: com.Zrips.CMI.Modules.DataBase

### Class: com.Zrips.CMI.Modules.DataBase.DBClassLoader
Type: Class
Extends: java.net.URLClassLoader

Constructors:
- DBClassLoader(CMI core)

Methods:
- void addURL(URL url)
- void addFile(File f) throws IOException

### Class: com.Zrips.CMI.Modules.DataBase.DBConnection
Type: Class

Constructors:
- DBConnection(Connection conn)

Methods:
- Statement createStatement() throws SQLException
- boolean isClosed()
- void setAutoCommit(Boolean mode) throws SQLException
- boolean isValid(int timeout) throws SQLException
- void commit() throws SQLException
- PreparedStatement prepareStatement(String sql) throws SQLException
- PreparedStatement prepareStatement(String sql, int returnGeneratedKeys) throws SQLException
- DatabaseMetaData getMetaData() throws SQLException
- void closeConnection() throws SQLException

### Class: com.Zrips.CMI.Modules.DataBase.DBConnectionPool
Type: Class

Constructors:
- DBConnectionPool(String driverName, String url, String username, String password) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

Methods:
- DBConnection getConnection() throws SQLException
- void closeConnection()

### Class: com.Zrips.CMI.Modules.DataBase.DBDAO
Type: Abstract Class

Methods:
- void updatePlayerPlayTime(CMIUser user)
- boolean createTable(String) throws SQLException
- void prepareTempBatch()
- String getTableCharSet(DBDAO$DBTables)
- DBManager$DataBaseType getDbType()
- void loadPlayerPlayTimeRewards()
- boolean isConnected()
- void loadAllUsers()
- Statement prepareStatement(String) throws SQLException
- void updatePlayerInventory(CMIUser user, String string)
- void updatePlayerPlayTimeRewards(CMIUser user)
- boolean executeTempBatch()
- int getLogOffCount(long timeRangeSec)
- void loadUser(UUID uuid)
- void loadUser(int id)
- boolean removeUser(int id)
- boolean updatePlayer(CMIUser user)
- boolean truncate(String)
- boolean isLocked()
- void updateUUID(int id, UUID uuid)
- V getUserPlayTimeIds(HashMap<CMIPlayDay, CMIUser> getPlayerPlayTimeId)
- void setUp() throws SQLException
- void close(ResultSet res)
- void close(Statement stmt)
- boolean addCollumn(String, String, String)
- LinkedHashSet<CMIUser> getLastLogOffList(int from, int to)
- void loadPlayTimes()
- void loadPlayTimes(CMIUser user)
- V getUserPlayTimeRewardIds(HashMap<Integer, CMIUser> users)
- String getPrefix()
- void setDbType(DBManager$DataBaseType dabType)
- void updateUserName(int id, String name)
- boolean isCollumn(String, String)
- V getUserInvIds(HashMap<Integer, CMIUser> users)
- int getInvId(int iid)
- V getUserIds(HashMap<String, CMIUser> users)
- boolean convertTableRowFormat(DBDAO$DBTables)
- String getTableRowFormat(DBDAO$DBTables)
- String getInv(CMIUser user)
- void closeConnections()
- void setAutoCommit(boolean state)
- boolean isTable(String)
- boolean convertTableToUTF8(DBDAO$DBTables)
- void executeSQL(String sql) throws SQLException

### Class: com.Zrips.CMI.Modules.DataBase.DBDAO$DBTables
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UserTable
- InvTable
- PlayTime
- PlayTimeReward

Methods:
- String getInsertQuery()
- **static** DBDAO$DBTables valueOf(String name)
- String getTableName()
- **static** DBDAO$DBTables[] values()
- String getUpdateQuery()
- String getQuery()

### Class: com.Zrips.CMI.Modules.DataBase.DBDAO$InventoryTablesFields
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- player_id
- inventories

Methods:
- String getCollumn()
- String getType()
- **static** DBDAO$InventoryTablesFields valueOf(String name)
- **static** DBDAO$InventoryTablesFields[] values()
- DBDAO$TablesFieldsType getFieldType()

### Class: com.Zrips.CMI.Modules.DataBase.DBDAO$PlaytimeRewardTablesFields
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- player_id
- repeatable
- onetime

Methods:
- String getCollumn()
- String getType()
- **static** DBDAO$PlaytimeRewardTablesFields valueOf(String name)
- **static** DBDAO$PlaytimeRewardTablesFields[] values()
- DBDAO$TablesFieldsType getFieldType()

### Class: com.Zrips.CMI.Modules.DataBase.DBDAO$PlaytimeTablesFields
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- player_id
- date
- h0
- h1
- h2
- h3
- h4
- h5
- h6
- h7
- h8
- h9
- h10
- h11
- h12
- h13
- h14
- h15
- h16
- h17
- h18
- h19
- h20
- h21
- h22
- h23

Methods:
- String getCollumn()
- boolean isTimeField()
- String getType()
- **static** DBDAO$PlaytimeTablesFields valueOf(String name)
- **static** DBDAO$PlaytimeTablesFields[] values()
- DBDAO$TablesFieldsType getFieldType()
- int getHour()

### Class: com.Zrips.CMI.Modules.DataBase.DBDAO$TablesFieldsType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- decimal
- number
- longtext
- text
- stringList
- stringLongMap
- stringIntMap
- stringDoubleMap
- stringStringMap
- locationMap
- state
- location
- longNumber

Methods:
- String getType()
- **static** DBDAO$TablesFieldsType getByname(String name)
- **static** DBDAO$TablesFieldsType valueOf(String name)
- **static** DBDAO$TablesFieldsType[] values()

### Class: com.Zrips.CMI.Modules.DataBase.DBDAO$UserTablesFields
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- player_uuid
- username
- nickname
- LogOutLocation
- DeathLocation
- TeleportLocation
- Homes
- LastLoginTime
- LastLogoffTime
- TotalPlayTime
- tFly
- tGod
- Glow
- Ips
- Cuffed
- AlertUntil
- AlertReason
- JoinedCounter
- LockedIps
- pTime
- Kits
- Charges
- Cooldowns
- Balance
- Notes
- Rank
- BannedUntil
- BannedAt
- BannedBy
- BanReason
- Ignores
- Vanish
- Economy
- Mail
- FlightCharge
- UserMeta
- Flying
- Votifier
- Jail
- JailedUntil
- FakeAccount
- PlaytimeOptimized
- flightChargeEnabled
- JailReason
- Skin
- Collision
- NamePrefix
- NameSuffix
- Warnings
- NameColor
- Muted
- AFRecharge
- DisplayName
- Options
- ChatColor

Methods:
- String getCollumn()
- String getType()
- **static** DBDAO$UserTablesFields valueOf(String name)
- **static** DBDAO$UserTablesFields[] values()
- DBDAO$TablesFieldsType getFieldType()
- String getColumn()

### Class: com.Zrips.CMI.Modules.DataBase.DBDAO$mysqltypes
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- old
- MySQL
- MariaDB

Methods:
- **static** DBDAO$mysqltypes valueOf(String name)
- **static** DBDAO$mysqltypes[] values()

### Class: com.Zrips.CMI.Modules.DataBase.DBDrivers
Type: Class
Implements: java.sql.Driver

Constructors:
- DBDrivers(Driver driver)

Methods:
- int getMajorVersion()
- Logger getParentLogger() throws SQLFeatureNotSupportedException
- int getMinorVersion()
- boolean jdbcCompliant()
- Connection connect(String url, Properties info) throws SQLException
- DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException
- boolean acceptsURL(String url) throws SQLException

### Class: com.Zrips.CMI.Modules.DataBase.DBManager
Type: Class

Constructors:
- DBManager(CMI plugin)

Methods:
- void saveBatch(boolean all)
- DBManager$DataBaseType getDbType()
- void clear()
- void start()
- boolean isRapidModeEnabled()
- void saveBatchAsync(boolean allEntries)
- void saveAllInNextCicle()
- void startRapidSave()
- boolean isForceSaveOnLogOut()
- DBDAO getDB()
- void stop()
- void load()
- void addForSave(CMIUser user)
- void addForSave(CMIUser user, String inventory)
- boolean isForceLoadOnLogIn()
- void addForPlayTimeRewardSave(CMIUser user)
- void switchDataBase()

### Class: com.Zrips.CMI.Modules.DataBase.DBManager$DataBaseType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- MySQL
- SqLite

Methods:
- **static** DBManager$DataBaseType valueOf(String name)
- **static** DBManager$DataBaseType[] values()

### Class: com.Zrips.CMI.Modules.DataBase.DBMySQL
Type: Class
Extends: com.Zrips.CMI.Modules.DataBase.DBDAO

Constructors:
- DBMySQL(CMI plugin, String hostname, String database, String username, String password, String prefix, boolean autoReconnect, boolean certificate, boolean ssl)

Methods:
- boolean convertTableRowFormat(DBDAO$DBTables table)
- String getTableRowFormat(DBDAO$DBTables table)
- boolean createTable(String query)
- boolean truncate(String table)
- String getTableCharSet(DBDAO$DBTables table)
- boolean isCollumn(String table, String collumn)
- Statement prepareStatement(String query) throws SQLException
- void initialize()
- DBMySQL initialize(CMI plugin, String hostname, String database, String username, String password, String prefix, boolean autoReconnect, boolean certificate, boolean ssl)
- boolean isTable(String table)
- boolean convertTableToUTF8(DBDAO$DBTables table)
- boolean addCollumn(String table, String collumn, String type)

### Class: com.Zrips.CMI.Modules.DataBase.DBSQLite
Type: Class
Extends: com.Zrips.CMI.Modules.DataBase.DBDAO

Methods:
- boolean convertTableRowFormat(DBDAO$DBTables table)
- String getTableRowFormat(DBDAO$DBTables table)
- boolean createTable(String query)
- boolean truncate(String table)
- String getTableCharSet(DBDAO$DBTables table)
- boolean isCollumn(String table, String column)
- Statement prepareStatement(String query) throws SQLException
- void initialize()
- boolean isTable(String table)
- boolean convertTableToUTF8(DBDAO$DBTables table)
- boolean addCollumn(String table, String collumn, String type)

## Package: com.Zrips.CMI.Modules.DeathMessages

### Class: com.Zrips.CMI.Modules.DeathMessages.CMIDeathType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Arrows
- Cactus
- Drowning
- Suffocation
- Elytra
- Explosions
- Falling
- FallingBlocks
- Fire
- FireBall
- EndCrystal
- FireworkRockets
- Lava
- Lightning
- MagmaBlock
- Player
- Block
- Tnt
- Mob
- PotionsOfHarming
- Projectile
- Entity
- Starving
- Thorns
- Trident
- SplashPotion
- Void
- WitherEffect
- Custom
- Suicide

Methods:
- **static** CMIDeathType valueOf(String name)
- **static** CMIDeathType[] values()

### Class: com.Zrips.CMI.Modules.DeathMessages.DeathMessageListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- DeathMessageListener(CMI plugin)

Methods:
- void onQuit(PlayerDeathEvent event)
- void onPlayerDeathEventMonitor(PlayerDeathEvent event)
- void onPlayerDeathEvent(PlayerDeathEvent event)
- void PlayerCombatEvent(EntityDamageEvent event)
- void onPlayerDeathEventHighest(PlayerDeathEvent event)
- void playerDamageEvent(EntityDamageEvent event)

### Class: com.Zrips.CMI.Modules.DeathMessages.DeathMessageManager
Type: Class

Constructors:
- DeathMessageManager(CMI plugin)

Methods:
- List<String> getPlayerHover()
- int getAutoHideFrom()
- String getPrefix()
- void load()
- void relocateDeathMessageLocaleFiles()
- boolean isEnabled()
- boolean broadcastDeathMessage(Player player, RawMessage rm)
- List<String> getKillerHover()
- String getDeathMessage(String path)
- void defaultLocaleDownloader()

### Class: com.Zrips.CMI.Modules.DeathMessages.DeathMessages
Type: Class

Constructors:
- DeathMessages(String path, List<String> messages)

Methods:
- String getRandom()
- String getPath()
- V setMessages(List<String> messages)
- List<String> getMessages()
- DeathMessages addMessage(String message)

### Class: com.Zrips.CMI.Modules.DeathMessages.damageInformation
Type: Class

Methods:
- double getDamage()
- Block getBlock()
- Long getTime()
- **static** void cacheClear(UUID uuid)
- void setBlock(Block block)
- ItemStack getItem()
- void setCause(EntityDamageEvent$DamageCause cause)
- void setDamage(double damage)
- void setEnt(Entity ent)
- **static** TreeMap<Long, damageInformation> getLastDamage(UUID uuid)
- **static** damageInformation getLastDamage(UUID uuid, damageInformation comparison)
- EntityDamageEvent$DamageCause getCause()
- **static** TreeMap<Long, damageInformation> addLastDamage(UUID uuid, damageInformation lastDamage)
- void reset()
- Entity getEnt()
- void setItem(ItemStack item)
- void setTime(Long time)
- void setTime()

## Package: com.Zrips.CMI.Modules.DiscordSRV

### Class: com.Zrips.CMI.Modules.DiscordSRV.DiscordSRVManager
Type: Class

Constructors:
- DiscordSRVManager(CMI plugin)

Methods:
- void sendDiscordMessage(Player player, String message)
- void sendDiscordDeathMessage(Player player, String deathMessage)

## Package: com.Zrips.CMI.Modules.Display

### Class: com.Zrips.CMI.Modules.Display.CMIBillboard
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- VERTICAL
- CENTER
- FIXED
- HORIZONTAL

Methods:
- CMIBillboard next()
- **static** CMIBillboard valueOf(String name)
- **static** CMIBillboard[] values()
- **static** CMIBillboard getByName(String name)
- Display$Billboard getBillboard()

### Class: com.Zrips.CMI.Modules.Display.CMIBlockDisplay
Type: Class
Extends: com.Zrips.CMI.Modules.Display.CMIDisplay

Constructors:
- CMIBlockDisplay(Location loc)

Methods:
- Transformation getBlockTransform()
- void setScale(double s)
- void setItemDisplayTransform(Transformation itemTransform)
- BlockData getBlockData()
- float getDisplayHeight()
- void setFacing(double pitchRadians, double)
- void setDepth(double depth)
- void setBlockData(BlockData data)

### Class: com.Zrips.CMI.Modules.Display.CMIDisplay
Type: Class

Constructors:
- CMIDisplay(CMIDisplayType type, Location loc)

Methods:
- Entity getDisplayEntity()
- Location getLocation()
- Transformation getTransformation()
- void getTransformation(Transformation transformation)
- void setRange(int range)
- void setInterpolationDelay(int delay)
- void show(Player player)
- void destroy(Player player)
- void update(Player player)
- void update(Player player, boolean updatePosition)
- Display$Billboard getBillboard()
- void setBillboard(Display$Billboard billboard)
- int getId()
- void addAsPassenger(Player receiver, Entity vehicle)
- V addAsPassenger(Set<Player> receivers, Entity vehicle)
- int getInterpolationDelay()
- int getInterpolationDuration()
- void setHeight(double height)
- void setWidth(double width)
- void setBrightness(int skyValue, int blockValue)
- void setInterpolationDuration(int duration)
- void setLocation(Location loc)
- float getRange()
- Object getDisplay()

### Class: com.Zrips.CMI.Modules.Display.CMIDisplayTransform
Type: Class

No public methods found

### Class: com.Zrips.CMI.Modules.Display.CMIDisplayType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Text
- Block
- Item
- Interaction

Methods:
- **static** CMIDisplayType valueOf(String name)
- **static** CMIDisplayType[] values()

### Class: com.Zrips.CMI.Modules.Display.CMIInteractionEntity
Type: Class
Extends: com.Zrips.CMI.Modules.Display.CMIDisplay

Constructors:
- CMIInteractionEntity(Location loc)

Methods:
- void setHeight(double height)
- void setWidth(double width)

### Class: com.Zrips.CMI.Modules.Display.CMIItemDisplay
Type: Class
Extends: com.Zrips.CMI.Modules.Display.CMIDisplay

Constructors:
- CMIItemDisplay(Location loc)

Methods:
- void setScale(double s)
- ItemDisplay$ItemDisplayTransform getItemDisplayTransform()
- void setItemDisplayTransform(ItemDisplay$ItemDisplayTransform itemTransform)
- float getDisplayHeight()
- void setItemStack(CMIItemStack item)
- void setItemStack(ItemStack item)
- ItemStack getItemStack()
- void setFacing(double pitchRadians, double)
- void setDepth(double depth)

### Class: com.Zrips.CMI.Modules.Display.CMITextAlignment
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LEFT
- CENTER
- RIGHT

Methods:
- CMITextAlignment next()
- TextDisplay$TextAlignment getTextAlignment()
- **static** CMITextAlignment valueOf(String name)
- **static** CMITextAlignment[] values()
- **static** CMITextAlignment getByName(String name)

### Class: com.Zrips.CMI.Modules.Display.CMITextDisplay
Type: Class
Extends: com.Zrips.CMI.Modules.Display.CMIDisplay

Constructors:
- CMITextDisplay(Location loc)

Methods:
- boolean isSeeThrough()
- void setSeeThrough(boolean seeThrough)
- void setBackgroundColor(Color color)
- void setBackgroundColor(CMIChatColor color)
- TextDisplay$TextAlignment getAligment()
- Color getBackgroundColor()
- String getText()
- boolean isShadowed()
- void setDefaultBackground(boolean show)
- void setLineWidth(int lineWidth)
- boolean isDefaultBackground()
- byte getTextOpacity()
- int getLineWidth()
- void setAligment(TextDisplay$TextAlignment aligment)
- float getDisplayHeight()
- void setShadowed(boolean shadow)
- void setFacing(double pitchDegrees, double)
- void setTextOpacity(byte textOpacity)
- V setText(List<String> text)
- void setText(String text)

## Package: com.Zrips.CMI.Modules.DynMap

### Class: com.Zrips.CMI.Modules.DynMap.DynMapListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- DynMapListener(CMI plugin)

Methods:
- void CMIPlayerVanishEvent(CMIPlayerVanishEvent event)
- void PlayerLoginEvent(PlayerLoginEvent event)
- void CMIPlayerUnVanishEvent(CMIPlayerUnVanishEvent event)

### Class: com.Zrips.CMI.Modules.DynMap.DynMapManager
Type: Class

Constructors:
- DynMapManager(CMI plugin)

Methods:
- void init()
- void processPlayer(Player player)
- void processPlayer(CMIUser user)
- void sentMessage(Player player, String message)

## Package: com.Zrips.CMI.Modules.DynamicSigns

### Class: com.Zrips.CMI.Modules.DynamicSigns.CMISign
Type: Class

Constructors:
- CMISign(CMILocation loc)

Methods:
- CMILocation getLoc()
- World getWorld()
- List<String> getLinesAsList()
- void updateCurrentLine()
- void setArea(CuboidArea area)
- String getLine(int place)
- void update()
- void update(Player player)
- List<String> getLines()
- int getActivationRange()
- boolean isPersonal()
- double getUpdateIntervalSec()
- void setSign(Sign sign)
- boolean isTimeToUpdate()
- void setAsUpdated()
- V setLines(List<String> l)
- void setLines(String[] lines)
- Sign getSign()
- void setActivationRange(int activationRange)
- CuboidArea getBasicArea()
- void setUpdateIntervalSec(double updateIntervalSec)
- void setPersonal(boolean personal)
- CompletableFuture<CuboidArea> getArea()

### Class: com.Zrips.CMI.Modules.DynamicSigns.SignListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- SignListener(CMI plugin)

Methods:
- void onPlayerMoveExtendedRnage(PlayerMoveEvent event)
- void onPlayerMoveExtendedRnage(PlayerTeleportEvent event)
- void onPlayerMoveExtendedRnage(PlayerQuitEvent event)
- void onPlayerMoveExtendedRnage(BlockBreakEvent event)
- void onPlayerMoveExtendedRnage(PlayerJoinEvent event)

### Class: com.Zrips.CMI.Modules.DynamicSigns.SignManager
Type: Class

Constructors:
- SignManager(CMI plugin)

Methods:
- void removeLastSignInRange(CMISign sign, UUID uuid)
- void removeLastSignInRange(UUID uuid)
- Set<CMISign> getSigns()
- void addLastSignInRange(CMISign sign, UUID uuid)
- void loadConfig()
- void save()
- CMISign getByLoc(Location loc)
- **static** void changeIndividual(Player player, CMISign sign)
- boolean isNearSign(UUID uuid)
- int getSignCheckInterval()
- **static** void changeRange(Player player, GUIManager$GUIClickType click, CMISign sign)
- void load()
- void handleSignUpdates(Player player, Location locto)
- void addPlayersNearSign(CMISign sign)
- void removeSign(CMISign sign)
- HashMap<CMIChatColor, CMIChatColor> getColorChange()
- void openGui(Player player, CMISign sign)
- void removeNearSign(UUID uuid, CMISign sign)
- void removeNearSign(UUID uuid)
- Set<CMISign> getAllInRangeByLoc(Location loc)
- List<CMISign> getSignsByDistance(Location loc)
- List<String> getSignEditBlackList()
- **static** void changeInterval(Player player, GUIManager$GUIClickType click, CMISign sign)
- void stop()
- void addSign(CMISign sign)
- V setColorChange(HashMap<CMIChatColor, CMIChatColor> colorChange)
- void recalculateChunks()
- void recalculateChunks(CMISign sign)
- void addNearSign(UUID uuid, CMISign sign)

## Package: com.Zrips.CMI.Modules.Economy

### Class: com.Zrips.CMI.Modules.Economy.CMIEconomyAcount
Type: Class

Constructors:
- CMIEconomyAcount(CMIUser user)

Methods:
- HashMap<String, Double> getWorldGroupBalances()
- String getCurrentWorldGroupName()
- **static** String format(double number, HashMap<Double, String>, String hashMap)
- String getFormatedBalance()
- String getFormatedBalance(boolean shorts)
- String getFormatedBalance(String worldName)
- String getFormatedBalance(String worldName, boolean shorts)
- EconomyManager$WorldGroup getCurrentWorldGroup()
- int updateBalTopPosition()
- int getBalTopPosition()
- Map<EconomyManager$WorldGroup, Double> getBalances()
- Double getBalance()
- Double getBalance(String worldName)
- Double deposit(double amount)
- Double deposit(String worldName, double amount)
- Double deposit(String worldName, double amount, CMIUser)
- boolean has(double amount)
- boolean has(String worldName, double amount)
- Double setBalance(double amount)
- Double setBalance(EconomyManager$WorldGroup defaultGroup, double amount)
- Double setBalance(EconomyManager$WorldGroup defaultGroup, double amount, boolean)
- Double setBalance(EconomyManager$WorldGroup defaultGroup, double amount, boolean, boolean save)
- HashMap<String, Double> getWorldGroupBalancesRounded()
- void setBalTopPosition(int balTopPos)
- Double withdraw(double amount)
- Double withdraw(String worldName, double amount)
- Double withdraw(String worldName, double amount, CMIUser)

### Class: com.Zrips.CMI.Modules.Economy.Economy
Type: Class

Constructors:
- Economy(CMI pl)

Methods:
- **static** String currencyNamePlural()
- **static** EconomyResponse deleteBank(String name)
- **static** String getName()
- **static** boolean hasAccount(String playerName)
- **static** boolean hasAccount(OfflinePlayer offlinePlayer)
- **static** boolean hasAccount(String playerName, String worldName)
- **static** boolean hasAccount(OfflinePlayer offlinePlayer, String worldName)
- **static** EconomyResponse depositPlayer(String playerName, double amount)
- **static** EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, double amount)
- **static** EconomyResponse depositPlayer(String playerName, String worldName, double amount)
- **static** EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, String worldName, double amount)
- **static** EconomyResponse bankBalance(String name)
- **static** EconomyResponse bankDeposit(String name, double amount)
- **static** EconomyResponse bankWithdraw(String name, double amount)
- **static** String format(double amount)
- **static** EconomyResponse withdrawPlayer(String playerName, double amount)
- **static** EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, double amount)
- **static** EconomyResponse withdrawPlayer(String playerName, String worldName, double amount)
- **static** EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, String worldName, double amount)
- **static** EconomyResponse createBank(String name, String player)
- **static** EconomyResponse createBank(String name, OfflinePlayer offlinePlayer)
- **static** List<String> getBanks()
- **static** double getBalance(String playerName)
- **static** double getBalance(OfflinePlayer offlinePlayer)
- **static** double getBalance(String playerName, String worldName)
- **static** double getBalance(OfflinePlayer offlinePlayer, String worldName)
- **static** boolean createPlayerAccount(String playerName)
- **static** boolean createPlayerAccount(OfflinePlayer offlinePlayer)
- **static** boolean createPlayerAccount(String playerName, String worldName)
- **static** boolean createPlayerAccount(OfflinePlayer offlinePlayer, String worldName)
- **static** EconomyResponse bankHas(String name, double amount)
- boolean isEnabled()
- **static** String currencyNameSingular()
- **static** EconomyResponse isBankMember(String name, String playerName)
- **static** EconomyResponse isBankMember(String name, OfflinePlayer offlinePlayer)
- **static** int fractionalDigits()
- **static** EconomyResponse isBankOwner(String name, String playerName)
- **static** EconomyResponse isBankOwner(String name, OfflinePlayer offlinePlayer)
- **static** boolean has(String playerName, double amount)
- **static** boolean has(OfflinePlayer offlinePlayer, double amount)
- **static** boolean has(String playerName, String worldName, double amount)
- **static** boolean has(OfflinePlayer offlinePlayer, String worldName, double amount)
- **static** boolean hasBankSupport()

### Class: com.Zrips.CMI.Modules.Economy.EconomyManager
Type: Class

Constructors:
- EconomyManager(CMI plugin)

Methods:
- void setRecalculatingTop(boolean recalculatingTop)
- Double getMaxChequeValue()
- boolean isConfirmation()
- DecimalFormat getMoneyFormat()
- DecimalFormat getMoneyFormat(String worldName)
- SortedMap<Double, UUID> getBalTopMap()
- String getTownyNationPrefix()
- void loadConfig()
- boolean isChequePaperRequired()
- DecimalFormat getShortMoneyFormat()
- boolean isVaultEnabled()
- Double getTotalServerMoney()
- void updateBalTop(CMIUser user)
- boolean isChequeInCreative()
- void moneyLog(CMIUser targetUser, CMIUser sourceUser, double change, EconomyManager$CMIMoneyLogType, String type)
- Boolean isRecalculatingTop()
- void closeStream()
- Set<EconomyManager$WorldGroup> getWorldGroups()
- String getTownyDebtPrefix()
- void setTownyNationPrefix(String townyNationPrefix)
- V setBalTopExclude(List<String> balTopExclude)
- boolean isTownyAccount(String playerName)
- boolean isCustomWorldsEnabled()
- boolean isBalTopDisplayWithShorts()
- VaultManager getVaultManager()
- String format(Double money)
- EconomyManager$WorldGroup getDefaultGroup()
- List<String> getBalTopExclude()
- Double translateMoney(String value)
- void setTownyDebtPrefix(String townyDebtPrefix)
- int getBalTopPlace(UUID uuid)
- Set<String> getWorlds(EconomyManager$WorldGroup worldGroup)
- boolean isChequeAcceptNotEncoded()
- void setEnabled(boolean enabled)
- void removeFromUpdateCache(UUID uuid)
- String getTownyTownPrefix()
- void setTownyTownPrefix(String townyTownPrefix)
- boolean isChequeRequiresPermission()
- boolean isEnabled()
- EconomyManager$WorldGroup getWorldGroup(String name)
- void setForBalTopRecalculation()
- String getTownyClosedEconomyName()
- boolean isBalTopIncludeFakes()
- void recalculateBalTop()

### Class: com.Zrips.CMI.Modules.Economy.EconomyManager$CMIEconomyResponse
Type: Class

Constructors:
- EconomyManager$CMIEconomyResponse(EconomyManager this$0, double amount, double balance, EconomyManager$EconResponseType type)

Methods:
- double getBalance()
- EconomyManager$EconResponseType getType()
- double getAmount()

### Class: com.Zrips.CMI.Modules.Economy.EconomyManager$CMIMoneyLogType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Unknown
- Transfer

Methods:
- void setEnabled(boolean enabled)
- **static** EconomyManager$CMIMoneyLogType valueOf(String name)
- boolean isEnabled()
- **static** EconomyManager$CMIMoneyLogType[] values()

### Class: com.Zrips.CMI.Modules.Economy.EconomyManager$EconResponseType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SUCCESS
- FAILURE
- NOT_IMPLEMENTED

Methods:
- **static** EconomyManager$EconResponseType valueOf(String name)
- **static** EconomyManager$EconResponseType[] values()

### Class: com.Zrips.CMI.Modules.Economy.EconomyManager$WorldGroup
Type: Class

Constructors:
- EconomyManager$WorldGroup(EconomyManager this$0, String name)

Methods:
- EconomyManager$WorldGroup setShortNumbersSuffixes(HashMap<Double, String> shortNumbersSuffixes)
- void setName(String name)
- String getName()
- EconomyManager$WorldGroup setMaximumAmount(Double maximumAmount)
- Double getMinimalAmount()
- String getCurrencySymbol()
- EconomyManager$WorldGroup setPlacing(String Placing)
- String getPlacing()
- EconomyManager$WorldGroup setSwitchPlaces(boolean switchPlaces)
- EconomyManager$WorldGroup setCurrencyName(String currencyName)
- Double getMaximumAmount()
- EconomyManager$WorldGroup setCurrencyFormat(String currencyFormat)
- boolean isFractions()
- String getCurrencyFormat()
- EconomyManager$WorldGroup setMinimalAmount(Double minimalAmount)
- EconomyManager$WorldGroup setFractions(boolean fractions)
- EconomyManager$WorldGroup setCurrencySymbol(String currencySymbol)
- String getCurrencyName()
- EconomyManager$WorldGroup setStartingAmount(Double startingAmount)
- Double getMinimalPay()
- Double getStartingAmount()
- boolean isSwitchPlaces()
- EconomyManager$WorldGroup setUseShortNumbers(boolean useShortNumners)
- EconomyManager$WorldGroup setMinimalPay(Double minimalPay)
- boolean isUseShortNumbers()
- HashMap<Double, String> getShortNumbersSuffixes()

### Class: com.Zrips.CMI.Modules.Economy.VaultHandler
Type: Class
Extends: net.milkbowl.vault.economy.AbstractEconomy

Constructors:
- VaultHandler(CMI plugin)
- VaultHandler(Plugin plugin)

Methods:
- String currencyNamePlural()
- EconomyResponse deleteBank(String name)
- String TrA(double amount)
- String getName()
- boolean hasAccount(String playerName)
- boolean hasAccount(OfflinePlayer offlinePlayer)
- boolean hasAccount(String playerName, String worldName)
- boolean hasAccount(OfflinePlayer offlinePlayer, String worldName)
- EconomyResponse depositPlayer(String playerName, double amount)
- EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, double amount)
- EconomyResponse depositPlayer(String playerName, String worldName, double amount)
- EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, String worldName, double amount)
- EconomyResponse bankBalance(String name)
- EconomyResponse bankDeposit(String name, double amount)
- EconomyResponse bankWithdraw(String name, double amount)
- String format(double amount)
- EconomyResponse withdrawPlayer(String playerName, double amount)
- EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, double amount)
- EconomyResponse withdrawPlayer(String playerName, String worldName, double amount)
- EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, String worldName, double amount)
- EconomyResponse createBank(String name, String player)
- EconomyResponse createBank(String name, OfflinePlayer offlinePlayer)
- List<String> getBanks()
- double getBalance(String playerName)
- double getBalance(OfflinePlayer offlinePlayer)
- double getBalance(String playerName, String worldName)
- double getBalance(OfflinePlayer offlinePlayer, String worldName)
- boolean createPlayerAccount(String playerName)
- boolean createPlayerAccount(OfflinePlayer offlinePlayer)
- boolean createPlayerAccount(String playerName, String worldName)
- boolean createPlayerAccount(OfflinePlayer offlinePlayer, String worldName)
- EconomyResponse bankHas(String name, double amount)
- boolean isEnabled()
- String currencyNameSingular()
- EconomyResponse isBankMember(String name, String playerName)
- EconomyResponse isBankMember(String name, OfflinePlayer offlinePlayer)
- int fractionalDigits()
- EconomyResponse isBankOwner(String name, String playerName)
- EconomyResponse isBankOwner(String name, OfflinePlayer offlinePlayer)
- boolean has(String playerName, double amount)
- boolean has(OfflinePlayer offlinePlayer, double amount)
- boolean has(String playerName, String worldName, double amount)
- boolean has(OfflinePlayer offlinePlayer, String worldName, double amount)
- boolean hasBankSupport()
- void setCMI(CMI cmi)

### Class: com.Zrips.CMI.Modules.Economy.VaultHandler$EconomyServerListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- VaultHandler$EconomyServerListener(VaultHandler this$0, VaultHandler economy)

Methods:
- void onPluginEnable(PluginEnableEvent event)
- void onPluginDisable(PluginDisableEvent event)

### Class: com.Zrips.CMI.Modules.Economy.VaultManager
Type: Class

Constructors:
- VaultManager(CMI plugin)

Methods:
- String getVersion()
- Economy getVaultEconomy()
- boolean isVaultEnabled()
- VaultManager$EconomySetupResponse setupVault()
- boolean isSupportsCmi()
- String format(Double money)

### Class: com.Zrips.CMI.Modules.Economy.VaultManager$EconomySetupResponse
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Vault
- NoVault
- NoVaultEconomy
- CMI

Methods:
- **static** VaultManager$EconomySetupResponse valueOf(String name)
- **static** VaultManager$EconomySetupResponse[] values()

## Package: com.Zrips.CMI.Modules.Elytra

### Class: com.Zrips.CMI.Modules.Elytra.ElytraBoostListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ElytraBoostListener(CMI plugin)

Methods:
- **static** double xPosYaw(double time, double, double radius)
- **static** double yPosYaw(double time, double)
- void onElytraFlight(PlayerInteractEvent event)
- **static** double zPosYaw(double time, double, double radius)
- void EntityToggleGlideEvent(EntityToggleGlideEvent event)
- void spawnCircle(Player player)
- **static** void spawnCircle(Location loc)
- void onInventoryClick(CMIArmorChangeEvent event)
- double zPosPitch2(double time, double, double radius)
- void onPlayerSpeed(PlayerMoveEvent event)

### Class: com.Zrips.CMI.Modules.Elytra.ElytraExploitListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ElytraExploitListener(CMI plugin)

Methods:
- void onElytraFlightTrident(PlayerInteractEvent event)
- void DamageEvent(EntityDamageByEntityEvent event)

### Class: com.Zrips.CMI.Modules.Elytra.ElytraExploitListener1_13
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ElytraExploitListener1_13(CMI plugin)

Methods:
- void onElytraFlightTrident(PlayerRiptideEvent event)

### Class: com.Zrips.CMI.Modules.Elytra.ElytraLaunchListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ElytraLaunchListener(CMI plugin)

Methods:
- void onSneakEnd(PlayerToggleSneakEvent event)
- void onMoveRemove(PlayerMoveEvent event)
- void onElytraLaunch(PlayerInteractEvent event)

### Class: com.Zrips.CMI.Modules.Elytra.ElytraManager
Type: Class

Constructors:
- ElytraManager(CMI plugin)

Methods:
- boolean isBoostSpeedDecimals()
- boolean isBoostShowParticles()
- double getLaunchTime()
- boolean isPreventRocketUsage()
- boolean isBoostRequiresItem()
- int getBoostAmount()
- void loadConfig()
- boolean isPreventSelfDamage()
- double getBoostSuperMultyplier()
- boolean isBoostUseItems()
- boolean isBoostSpeedLimitStop()
- boolean isDisableRiptide()
- CMIMaterial getLaunchItem()
- double getBoostMultyplier()
- CMIMaterial getBoostItem()
- CMIMaterial getBoostItemConsume()
- int getBoostSpeedLimit()
- int getBoostSuperAmount()

## Package: com.Zrips.CMI.Modules.Enchants

### Class: com.Zrips.CMI.Modules.Enchants.EnchantListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- EnchantListener(CMI plugin)

Methods:
- void InventoryCloseEvent(InventoryCloseEvent event)

### Class: com.Zrips.CMI.Modules.Enchants.EnchantManager
Type: Class

Constructors:
- EnchantManager(CMI plugin)

Methods:
- boolean isEnforceValidEnchants()
- void loadConfig()
- void loadDisabledEnchants()
- boolean isRequireSpecificPermission()
- boolean isEnchantLimitEnabled()
- Integer getMaxLevel(Enchantment enchant)
- void addDisabled(Enchantment disabled)
- HashMap<String, Enchantment> getDisabled()
- void disableEnchantsOnLoad()
- void updateConfig()
- boolean isDisabled(Enchantment disabled)
- void removeDisabled(Enchantment disabled)
- boolean isPermissionLevelLimit()
- void reEnableEnchantsOnDisable()

## Package: com.Zrips.CMI.Modules.EventActions

### Class: com.Zrips.CMI.Modules.EventActions.EventActionListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- EventActionListener(CMI plugin)

Methods:
- void PlayerKillPlayerEvent(PlayerDeathEvent event)
- void PlayerVoidFallEvent(PlayerMoveEvent event)
- void CMIPvPStartEventAsync(CMIPvPStartEventAsync event)
- void PlayerRespawnEvent(PlayerRespawnEvent event)
- void PlayerTeleportEvent(PlayerTeleportEvent event)
- void PlayerQuitEvent(PlayerQuitEvent event)
- void PlayerDeathEvent(PlayerDeathEvent event)
- void PlayerKickEvent(PlayerKickEvent event)
- void PlayerGameModeChangeEvent(PlayerGameModeChangeEvent event)
- void PlayerPortalEvent(PlayerPortalEvent event)
- void PlayerJoinEvent(PlayerJoinEvent event)
- void CMIPvPEndEventAsync(CMIPvPEndEventAsync event)
- void CMIPlayerBanEvent(CMIPlayerBanEvent event)
- void PlayerChangedWorldEvent(PlayerChangedWorldEvent event)
- void PlayerFirstJoinEvent(PlayerJoinEvent event)
- void PlayerLevelChangeEvent(PlayerLevelChangeEvent event)
- void PlayerBedEnterEvent(PlayerBedEnterEvent event)
- void PlayerBedLeaveEvent(PlayerBedLeaveEvent event)

### Class: com.Zrips.CMI.Modules.EventActions.EventActionListener1_12
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- EventActionListener1_12(CMI plugin)

Methods:
- void PlayerAdvancementDoneEvent(PlayerAdvancementDoneEvent event)

### Class: com.Zrips.CMI.Modules.EventActions.EventActionListener1_9
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- EventActionListener1_9(CMI plugin)

Methods:
- void PlayerSwapHandItemsEventCancel(PlayerSwapHandItemsEvent event)
- void EntityToggleGlideEvent(EntityToggleGlideEvent event)
- void onInventoryClick(InventoryClickEvent event)
- void PlayerSwapHandItemsEvent(PlayerSwapHandItemsEvent event)

### Class: com.Zrips.CMI.Modules.EventActions.EventActionManager
Type: Class

Constructors:
- EventActionManager(CMI plugin)

Methods:
- void load()
- void performCommands(EventActionManager$eventAction action, Player player)
- void performCommands(EventActionManager$eventAction action, Player player, String value)
- void performCommands(EventActionManager$eventAction action, Player player, Player source)
- void performCommands(EventActionManager$eventAction action, Player player, Player source, String value)
- void performCommands(EventActionManager$eventAction action, Player player, Player source, Object value1, Object value2)

### Class: com.Zrips.CMI.Modules.EventActions.EventActionManager$eventAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- firstJoinServer
- joinServer
- quitServer
- playerDeath
- playerKillPlayer
- playerRespawn
- playerTeleport
- bedLeave
- bedEnter
- playerWorldChange
- playerPreWorldChange
- playerGameModeChange
- playerKick
- playerBan
- playerLevelChange
- voidFall
- elytraStartGlide
- advancementDone
- elytraEndGlide
- sneakingSwapHandItems
- swapHandItems
- pvpstart
- pvpend

Methods:
- boolean isDisableEvent()
- void setEnabled(boolean enabled)
- List<String> getSourceCommands()
- V setCommands(List<String> commands)
- **static** EventActionManager$eventAction valueOf(String name)
- boolean isEnabled()
- **static** EventActionManager$eventAction[] values()
- void clear()
- V setSourceCommands(List<String> commands)
- boolean isIncludeSource()
- void setDisableEvent(boolean disableEvent)
- List<String> getCommands()

## Package: com.Zrips.CMI.Modules.FindBiome

### Class: com.Zrips.CMI.Modules.FindBiome.FindBiomeInfo
Type: Class

Constructors:
- FindBiomeInfo(Player player, String biome)

Methods:
- void setCurrentId(int id)
- int getCurrentId()
- Player getPlayer()
- long getShowInfo()
- CMITask getScheduleTask()
- void setPlayer(Player Player)
- void setShowRegionInfo(boolean state)
- void setMessages(boolean messages)
- boolean isShowRegionInfo()
- void setRunning(boolean state)
- void setSpeed(int speed)
- void setSkipped(int skipped)
- void addSkipped()
- boolean isRunning()
- int getSkipped()
- WorldInfo getRI()
- void setShowInfo(long time)
- int getSpeed()
- boolean isMessages()
- long getStartTime()
- void setStartTime()
- void setBiome(String biome)
- void setRI(WorldInfo RI)
- String getBiome()
- void setScheduleTask(CMITask task)

### Class: com.Zrips.CMI.Modules.FindBiome.FindBiomeManager
Type: Class

Constructors:
- FindBiomeManager(CMI plugin)

Methods:
- boolean stop(Player player)
- void start(FindBiomeInfo scan)

## Package: com.Zrips.CMI.Modules.Fireworks

### Class: com.Zrips.CMI.Modules.Fireworks.CMIFireWorkExplosion
Type: Class

No public methods found

### Class: com.Zrips.CMI.Modules.Fireworks.CMIFirework
Type: Class

Constructors:
- CMIFirework(String text)

No public methods found

### Class: com.Zrips.CMI.Modules.Fireworks.firework
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

## Package: com.Zrips.CMI.Modules.FlightCharge

### Class: com.Zrips.CMI.Modules.FlightCharge.FlightCharge
Type: Class

Methods:
- Double getSafeCharge()
- Double getCharge()
- void setInformedMissingMoney(boolean informedMissingMoney)
- Integer getMax()
- boolean isExpAutoRecharge()
- void setAutoRecharge(Boolean autoRecharge)
- boolean isInformedMissingExp()
- void setAutoMoneyRecharge(boolean moneyRecharge)
- void setAutoMoneyRecharge()
- void setEnabled(boolean enabled)
- boolean isInformedMissingMoney()
- boolean isMoneyAutoRecharge()
- Boolean isAutoRecharge()
- void setCharge(Double charge)
- boolean isEnabled()
- void addCharge(Double charge)
- void setInformedMissingExp(boolean informedMissingExp)
- Double getLastChange()
- void setAutoExpRecharge(boolean expRecharge)
- void setAutoExpRecharge()
- void takeCharge(Double charge)

### Class: com.Zrips.CMI.Modules.FlightCharge.FlightChargeManager
Type: Class

Constructors:
- FlightChargeManager(CMI plugin)

Methods:
- void setMoneyRechargeCost(double moneyRechargeCost)
- void setGlowColor(CMIChatColor glowColor)
- int getDeductOnFallMulti()
- double getDeductOnIdling()
- boolean isFlightChargeEnabledByDefault()
- double getExpRechargeCost()
- void setMaxChargeLevel(int maxChargeLevel)
- PlayerCharge getPCharge(UUID uuid)
- PlayerCharge getPCharge(UUID uuid, boolean update)
- boolean isKillOnFall()
- boolean isFlightChargeAutoSwitch()
- void setDeductOnIdling(int deductOnIdling)
- int getMaxChargeLevel()
- void load()
- double getAutoRechargeAmount()
- boolean isDamageOnFall()
- CMIChatColor getGlowColor()
- FlightCharge getFlightCharge(UUID uuid)
- void setDamageOnToggle(boolean damageOnToggle)
- void process(Player player, Integer take)
- void process(traveledDistance dinfo, Integer take)
- double getAutoRechargeFrom()
- void setDeductOnFallMulti(int deductOnFallMulti)
- double getMoneyRechargeCost()
- void setDamageOnFall(boolean damageOnFall)
- void autorecharge(CMIUser user)
- void setFlightChargeEnabledByDefault(boolean flightChargeEnabledByDefault)
- void updateBossBar(CMIUser user)
- boolean isDamageOnToggle()
- void setKillOnFall(boolean killOnFall)
- void setExpRechargeCost(double expRechargeCost)

### Class: com.Zrips.CMI.Modules.FlightCharge.FlightListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- FlightListener(CMI plugin)

Methods:
- void PlayerJoinEvent(PlayerJoinEvent event)
- void PlayerJoinEvent(PlayerChangedWorldEvent event)
- void PlayerMoveEvent2(PlayerMoveEvent event)
- void PlayerToggleFlightEvent(PlayerToggleFlightEvent event)
- void CMIBossBarHideEvent(CMIBossBarHideEvent event)
- void onRespawn(PlayerRespawnEvent event)
- void PlayerQuitEvent(PlayerQuitEvent event)
- void PlayerTeleportEvent(PlayerTeleportEvent event)
- void PlayerMoveEvent(PlayerMoveEvent event)
- void PlayerGameModeChangeEvent(PlayerGameModeChangeEvent event)

### Class: com.Zrips.CMI.Modules.FlightCharge.freeFall
Type: Class

Methods:
- freeFall setFallDistance(Float fallDistance)
- Boolean getJump()
- freeFall setJump(Boolean jump)
- Float getFallDistance()

### Class: com.Zrips.CMI.Modules.FlightCharge.traveledDistance
Type: Class

Methods:
- boolean toSoonToCheck()
- void updateLocation()
- Long sinceLastUpdate()
- CMIUser getUser()
- Double getDistanceTraveled()

## Package: com.Zrips.CMI.Modules.Future

### Class: com.Zrips.CMI.Modules.Future.CMIFutureBatcher
Type: Class

Constructors:
- CMIFutureBatcher(int delayBetweenBatches)

Methods:
- void cancel()
- int getQueueSize()
- boolean isRunning()
- int getDelayBetweenBatches()
- void processQueue()
- CompletableFuture<*> addBatch(CompletableFuture<*> future)
- void setDelayBetweenBatches(int delayBetweenBatches)

## Package: com.Zrips.CMI.Modules.GeoIP

### Class: com.Zrips.CMI.Modules.GeoIP.Country
Type: Class

Constructors:
- Country(String code, String name)

Methods:
- void setName(String name)
- String getName()
- void setCode(String code)
- String getCode()

### Class: com.Zrips.CMI.Modules.GeoIP.DatabaseInfo
Type: Class

No public methods found

### Class: com.Zrips.CMI.Modules.GeoIP.IPLocation
Type: Class

Methods:
- void setCountryCode(String countryCode)
- String getCountryCode()
- void setRegion(String region)
- void setCity(String city)
- String getRegion()
- void setCountryName(String countryName)
- String getCountryName()
- void setPostalCode(String postalCode)
- String getPostalCode()
- String getCity()

### Class: com.Zrips.CMI.Modules.GeoIP.LookupService
Type: Class

Constructors:
- LookupService(File databaseFile, int options) throws IOException

Methods:
- IPLocation getLocation(InetAddress addr)
- IPLocation getLocation(String str)
- void close()

## Package: com.Zrips.CMI.Modules.Holograms

### Class: com.Zrips.CMI.Modules.Holograms.CMIDataWatcher
Type: Class

Constructors:
- CMIDataWatcher(Integer id, Object stand, CMIHoloLineType type)
- CMIDataWatcher(Integer id, Integer secid, Object stand, CMIHoloLineType type)

Methods:
- Location getLoc()
- void setStand(Object watcher)
- boolean isUpdatingHead()
- CMIHoloLineType getType()
- Object getStand()
- CMIItemStack getItem()
- void setId(Integer id)
- void setUpdatingHead(boolean updatingHead)
- Integer getId()
- void setType(CMIHoloLineType type)
- void setLoc(Location loc)
- void setItem(CMIItemStack item)
- void remove(Player player)

### Class: com.Zrips.CMI.Modules.Holograms.CMIFont
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- A
- a
- B
- b
- C
- c
- D
- d
- E
- e
- F
- f
- G
- g
- H
- h
- I
- i
- J
- j
- K
- k
- L
- l
- M
- m
- N
- n
- O
- o
- P
- p
- Q
- q
- R
- r
- S
- s
- T
- t
- U
- u
- V
- v
- W
- w
- X
- x
- Y
- y
- Z
- z
- NUM_1
- NUM_2
- NUM_3
- NUM_4
- NUM_5
- NUM_6
- NUM_7
- NUM_8
- NUM_9
- NUM_0
- EXCLAMATION_POINT
- AT_SYMBOL
- NUM_SIGN
- DOLLAR_SIGN
- PERCENT
- UP_ARROW
- AMPERSAND
- ASTERISK
- LEFT_PARENTHESIS
- RIGHT_PERENTHESIS
- MINUS
- UNDERSCORE
- PLUS_SIGN
- EQUALS_SIGN
- LEFT_CURL_BRACE
- RIGHT_CURL_BRACE
- LEFT_BRACKET
- RIGHT_BRACKET
- COLON
- SEMI_COLON
- DOUBLE_QUOTE
- SINGLE_QUOTE
- LEFT_ARROW
- RIGHT_ARROW
- QUESTION_MARK
- SLASH
- BACK_SLASH
- LINE
- TILDE
- TICK
- PERIOD
- COMMA
- SPACE
- DEFAULT

Methods:
- **static** CMIFont valueOf(String name)
- **static** CMIFont[] values()
- **static** CMIFont getDefaultFontInfo(char c)
- int getLength()
- int getBoldLength()
- char getCharacter()
- **static** int getWidth(String text)

### Class: com.Zrips.CMI.Modules.Holograms.CMIHoloLineType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- plainText
- placeholder
- icon
- staticIcon
- image

Methods:
- **static** CMIHoloLineType valueOf(String name)
- **static** CMIHoloLineType[] values()

### Class: com.Zrips.CMI.Modules.Holograms.CMIHologram
Type: Class

Constructors:
- CMIHologram(String name, Location loc)
- CMIHologram(String name, Location loc, Player playerToShowFor)
- CMIHologram(Location loc, Player playerToShowFor, List<String> lines)
- CMIHologram(String name, CMILocation loc)

Methods:
- boolean isSeeThrough()
- CMILocation getLocation()
- void setExtraInteractionHeight(double extraInteractionHeight)
- void setuSync(boolean uSync)
- CMIHologram setTextAlignment(CMITextAlignment textAlignment)
- CMIHologram setIconPitch(int iconPitch)
- boolean isStabilizedHoverParticles()
- List<String> getCommands()
- List<String> getCommands(Player player)
- List<String> getCommands(Player player, CMIInteractType type)
- void setParticleOffsetY(double particleOffsetY)
- void setParticleOffsetX(double particleOffsetX)
- boolean isShowWhenNotPersistent()
- boolean isNewIneractionMethod()
- void setAreaExtra(CuboidArea area)
- void enable()
- void setLOSInterval(double LOSupdateIntervalSec)
- boolean isAutoPagination()
- void setStabilizedHoverParticles(boolean stabilizedHoverParticles)
- CMIHologram setIconScale(double iconScale)
- Set<UUID> getLastHoloInRangeExtra()
- CMITask getSched()
- Vector getCenterVector()
- int getIconPitch()
- Boolean isDownOrder()
- void setFollowPlayer(double followPlayer)
- void setBigButton(boolean bigButton)
- void addLastHoloInRangeExtra(UUID uuid)
- Integer getPlayerPage(UUID uuid)
- int getBlockLevel()
- void setGroup(String group)
- void recheckPermissionAccess()
- CMIHologram setPlayerToShowFor(Player playerToShowFor)
- void stop()
- boolean isEnabled()
- boolean isNewDisplayMethod()
- void setLine(int place, String line)
- void setExtraParticleWidth(double extraParticleWidth)
- CMIHologram setShadowed(boolean shadowed)
- void setName(String name)
- void setSeeThrough(boolean seeThrough)
- double getIconScale()
- void setArea(CuboidArea area)
- void addLastHoloInRange(UUID uuid)
- int getSkyLevel()
- double getLOSupdateIntervalSec()
- boolean isSticky()
- Set<UUID> getLastHoloInRange()
- void goToPrevPage(Player player)
- void goToPrevPage(UUID uuid)
- void setParticleSpacing(double particleSpacing)
- double getHeight()
- float getIconOffsetX()
- int getUpdateRange()
- void setExtraInteractionWidth(double extraInteractionWidth)
- void setAutoPaginationOffset(int autoPaginationOffset)
- boolean isFadeInAnimation()
- void setHoverEffect(CMIEffectManager$CMIParticle effect)
- void setShowWhenNotPersistent(boolean showWhenNotPersistent)
- boolean isShowParticle()
- CMIHologramUserData getData(Player player)
- CMIHologramUserData getData(UUID uuid)
- void setIconOffsetX(float iconOffsetX)
- void setExtraParticleHeight(double extraParticleHeight)
- double getFollowPlayer()
- CMIHologram setScaleW(double scale)
- int getBackgroundAlpha()
- void refresh()
- CMIHologram setScaleH(double scale)
- void setShowParticle(boolean showParticle)
- void setShowRange(int showRange)
- void hide(Player player)
- void hide()
- void hide(UUID uuid)
- int getPitch()
- void disable()
- CMIHologram setPitch(int angle)
- int getIconYaw()
- void recheckTaskers()
- void setLoc(Location loc)
- void setPageChangeIntervalSec(double pageChangeIntervalSec)
- Player getPlayerToShowFor()
- CuboidArea getArea()
- void setUpdateRange(int activationRange)
- void moveTo(Location loc)
- Location getCenterLocation()
- Location getLoc()
- World getWorld()
- String getName()
- int getPageCount()
- boolean isuSync()
- CMIChatColor getBackgroundColor()
- CMIHologramPage getPage(int page)
- boolean isRequiresPermission()
- CMIBillboard getBillboard()
- void removeLastHoloInRange(UUID uuid)
- List<String> getLines()
- boolean isFollowPlayer()
- void clearFakeEntities()
- void updatePages()
- int getTextAlpha()
- double getParticleOffsetX()
- void superficialMoveTo(Location loc)
- double getParticleOffsetY()
- boolean isCheckLineOfSight()
- Double getIconSpacing()
- CMIHologram setIconYaw(int iconYaw)
- void setParticleCount(int particleCount)
- CMIBillboard getIconBillboard()
- CMITextAlignment getTextAlignment()
- int getSelfDestructIn()
- V setCommands(List<String> commands)
- CMIHologram setSkyLevel(int skyLevel)
- CMIHologram setBillboard(CMIBillboard billboard)
- boolean isShadowed()
- boolean isShowHoverParticle()
- CMIHologram setYaw(int angle)
- void setShowHoverParticle(boolean showHoverParticle)
- int getYaw()
- int getShowRange()
- void addLine(String line)
- void setInteractable(boolean interactable)
- boolean isSaveToFile()
- boolean isChangedLine()
- double getScaleW()
- String getGroup()
- void goToPage(UUID uuid, int page)
- CMIEffect getHoverEffect()
- void setPermissionRequirement(boolean requestPermission)
- double getScaleH()
- void makePersistent()
- void update()
- void update(Player player)
- void update(Player player, boolean oneTime)
- void onInteraction(Player player, CMIInteractType type)
- boolean isDoubleSided()
- double getExtraInteractionWidth()
- void removeFromCache(UUID uuid)
- void removeFromCache(UUID uuid, boolean deleteData)
- void removeFromCache(UUID uuid, int size)
- CuboidArea getAreaExtra()
- void remove()
- void setSpacing(Double spacing)
- String getWorldName()
- boolean isInteractable()
- CMIHologram setTextAlpha(int alpha)
- double getExtraParticleHeight()
- double getParticleSpacing()
- Double getSpacing()
- void setFadeInAnimation(boolean fadeInAnimation)
- int getParticleCount()
- void removeLastHoloInRangeExtra(UUID uuid)
- void setSched(CMITask schedId)
- CMIHologram setBackgroundAlpha(int alpha)
- void processPrevNextPageClick(Player player)
- CMIHologram setSelfDestructIn(int selfDestructIn)
- int getAutoPaginationOffset()
- CMIHologram setIconBillboard(CMIBillboard billboard)
- void setDownOrder(Boolean downOrder)
- void goToNextPage(Player player)
- void goToNextPage(UUID uuid)
- CMIHologram setBackgroundColor(CMIChatColor backgroundColor)
- CMIHologram setNewDisplayMethod(boolean newDisplayMethod)
- void setAutoPagination(boolean autoPagination)
- String getLine(int place)
- int getHoveringLine(UUID uuid)
- double getUpdateIntervalSec()
- void checkHoverPosition(Player player)
- void showToPlayer()
- void setIconSpacing(Double iconSpacing)
- void removeLine(int line)
- V setLines(List<String> l)
- double getPageChangeIntervalSec()
- void setSaveToFile(boolean saveToFile)
- double getExtraInteractionHeight()
- void setSticky(boolean sticky)
- CMIHologram setBlockLevel(int blockLevel)
- double getExtraParticleWidth()
- CMIHologram setDoubleSided(boolean doubleSided)
- void setNewIneractionMethod(boolean newIneractionMethod)
- boolean isBigButton()
- void setUpdateIntervalSec(double d)

### Class: com.Zrips.CMI.Modules.Holograms.CMIHologramBatch
Type: Class

Methods:
- void addDisplay(int side, CMIDisplay display)
- ConcurrentHashMap<Integer, CMIDisplay> getIcons()
- void clear()
- void destroy(Player player)
- void addIcon(int line, CMIDisplay icon)
- CMIDisplay getDisplay(int side)
- CMIDisplay getIcon(int line)
- ConcurrentHashMap<Integer, CMIDisplay> getDisplays()

### Class: com.Zrips.CMI.Modules.Holograms.CMIHologramClickEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIHologramClickEvent(Player player, CMIHologram holo, int line, CMIVector3D pos, CMIInteractType actionType)

Methods:
- int getLineNumber()
- CMIInteractType getActionType()
- CMIVector3D getPos()
- CMIHologram getHologram()

### Class: com.Zrips.CMI.Modules.Holograms.CMIHologramHoveringPosition
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- None
- Left
- Right

Methods:
- **static** CMIHologramHoveringPosition valueOf(String name)
- **static** CMIHologramHoveringPosition[] values()

### Class: com.Zrips.CMI.Modules.Holograms.CMIHologramLine
Type: Class

Constructors:
- CMIHologramLine(String text)

Methods:
- void setGlobalY(double globalY)
- double getGlobalY()
- String getCommand()
- String getText()
- String getText(Player player)
- boolean isIcon()
- List<String> getPlainImage()
- CMIItemStack getItem(Player player)
- CMIItemStack getItem(Player player, CMIAsyncHead ahead)
- CMIItemStack getItem()
- void setGlowing(boolean glowing)
- void setType(CMIHoloLineType type)
- void setStaticText(boolean staticText)
- void setItemInHand(boolean itemInHand)
- void setHoverText(String hoverText)
- String getHoverText(Player player)
- String getHoverText()
- Boolean isRandomU()
- boolean isStaticText()
- CMIHoloLineType getType()
- CMIHologramLine clone()
- Object clone() throws CloneNotSupportedException
- boolean isGlowing()
- CompletableFuture<List<String>> getImage(Player player)
- boolean isItemInHand()
- void setItem(CMIItemStack item)
- V setImage(List<String> image)

### Class: com.Zrips.CMI.Modules.Holograms.CMIHologramPage
Type: Class

Methods:
- double getHeight()
- V setCommands(List<String> commands)
- V setLines(List<CMIHologramLine> lines)
- void calculateWidth()
- int getPage()
- List<CMIHologramLine> getLines()
- int getWidth()
- void setWidth(int width)
- void setHeight(double height)
- List<String> getCommands()
- void setPage(int page)

### Class: com.Zrips.CMI.Modules.Holograms.CMIHologramStartHoverEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerEvent

Constructors:
- CMIHologramStartHoverEvent(Player player, CMIHologram holo, CMIPlaneIntersection pos)

Methods:
- CMIPlaneIntersection getPos()
- CMIHologram getHologram()

### Class: com.Zrips.CMI.Modules.Holograms.CMIHologramStopHoverEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerEvent

Constructors:
- CMIHologramStopHoverEvent(Player player, CMIHologram holo)

Methods:
- CMIHologram getHologram()

### Class: com.Zrips.CMI.Modules.Holograms.CMIHologramUserData
Type: Class

Methods:
- long getNextUpdate()
- int getPage()
- void setHoveringHologram(CMIHologram hoveringHologram)
- FakeInfo getFakeInfo()
- CMIHologramHoveringPosition getHoveringSide()
- boolean isSkipUpdate()
- boolean isSkipPageChange()
- void setFadeInAnimation(CMIHologramFadeInAnimation fadeInAnimation)
- List<CMIDataWatcher> getDataWatcher()
- void startFadeInAnimation(CMIHologram holo, Player player)
- void setUpdateLocation(boolean updateLocation)
- void setSkipUpdate(boolean skipUpdate)
- CMIHologramUserData setHoveringLine(int line)
- CMIHologramUserData setPage(int page)
- void setNextUpdate(long nextUpdate)
- void setFakeInfo(FakeInfo fakeInfo)
- CMIHologramUserData setSkipPageChange(boolean skipPageChange)
- int getHoveringLine()
- CompletableFuture<*> addBatch(CompletableFuture<*> future)
- CMIHologramBatch getHologramBatch()
- boolean isUpdateLocation()
- void setHologramBatch(CMIHologramBatch batch)
- void initializeFadeInAnimation(double targetScale, double, double targetBackgroundOpacity)
- CMIHologramFadeInAnimation getFadeInAnimation()
- CMIFutureBatcher getBatcher()
- CMIHologram getHoveringHologram()
- int getHoveringLineAndReset()
- CMIHologramUserData setHoveringSide(CMIHologramHoveringPosition hoveringLeftSide)
- V setDataWatcher(List<CMIDataWatcher> dataWatcher)

### Class: com.Zrips.CMI.Modules.Holograms.HologramGUIEditor
Type: Class

Methods:
- **static** void openGui(Player player, CMIHologram holo)
- **static** void editLocation(Player player, CMIHologram holo)
- **static** void editInteractions(Player player, CMIHologram holo)

### Class: com.Zrips.CMI.Modules.Holograms.HologramListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- HologramListener(CMI plugin)

Methods:
- void onPlayerJoinEvent(PlayerJoinEvent event)
- void onPlayerRespawnEvent(PlayerRespawnEvent event)
- void CMIPlayerFakeEntityInteractEvent(CMIPlayerFakeEntityInteractEvent event)
- **static** double zPosYaw(double time, double, double radius)
- void CMIHologramStopHoverEvent(CMIHologramStopHoverEvent event)
- void onPlayerMoveExtendedRnage(PlayerMoveEvent event)
- void onPlayerMoveExtendedRnage(PlayerTeleportEvent event)
- void onInteract(PlayerInteractEvent event)
- void onInteract(CMIHologramClickEvent event)
- void CMIHologramStartHoverEvent(CMIHologramStartHoverEvent event)
- void onPlayerQuitEvent(PlayerQuitEvent event)

### Class: com.Zrips.CMI.Modules.Holograms.HologramManager
Type: Class

Constructors:
- HologramManager(CMI plugin)

Methods:
- void setPrevPageSection(CMIHologramLine prevPage)
- Optional<Location> getCenterLocation(Set<CMIHologram> holograms)
- void removeLastHologramInRange(UUID uuid)
- HologramManager$CMIAiming getAimAt(UUID uuid)
- void removeNearHoloExtra(UUID uuid, CMIHologram holo)
- CMIHologram getByLoc(Location loc)
- void clearCache(UUID uuid)
- Set<CMIHologram> getHologramsByGroup(String group)
- boolean recheckInteractableHolograms(Player player)
- void addNearHoloExtra(UUID uuid, CMIHologram holo)
- void removeHolo(CMIHologram holo)
- void clearCachedData(UUID uuid)
- void setNextPageSection(CMIHologramLine nextPage)
- void addAimAt(UUID uuid, String name, CMIVector3D pos)
- void addAimAt(UUID uuid, String name, CMIVector3D pos, double localX)
- void setNextPageLength(int nextPageLength)
- void addNearHolo(UUID uuid, CMIHologram holo)
- int getNextPageLength()
- void handleHoloUpdates(Player player, Location locto)
- void openGui(Player player, CMIHologram holo)
- int getHoloCheckInterval()
- void addHologram(CMIHologram holo)
- void addHologram(CMIHologram holo, boolean checkForPlayers)
- void addHologram(CMIHologram holo, boolean checkForPlayers, boolean recalculateChunks)
- void addPlayersNearHoloExtra(CMIHologram holo, boolean forceUpdate)
- void stop()
- Location getCenterOfGroup(String group)
- void recalculateChunks()
- void recalculateChunks(CMIHologram holo)
- List<CMIHologram> getHologramsByDistance(Location loc)
- void relocateHologramGroup(Location loc, String group)
- void recalculateChunksExtra(CMIHologram holo)
- void loadConfig()
- void hideAllHolograms()
- void save()
- void handleHoloRangeUpdates(Player player, Location locto)
- CMIHologramLine getNextPageSection()
- void removeNearHolo(UUID uuid, CMIHologram holo)
- void hideHoloForAllPlayers(CMIHologram holo)
- CMIHologram getByLocExtra(Location loc)
- void reload()
- void load()
- Set<CMIHologram> getAllInRangeByLocExtra(Location loc)
- void setPrevPageLength(int prevPageLength)
- CMIHologram getByName(String name)
- void removeChunkRecords(CMIHologram holo)
- void shiftHologramGroup(Vector vector, String group)
- void removeAimAt(UUID uuid)
- boolean isNearHolo(UUID uuid)
- int getPrevPageLength()
- void addPlayersNearHolo(CMIHologram holo, boolean forceUpdate)
- void rotateHologramYawGroup(int amount, String group, Location referencePoint)
- CMIHologramLine getPrevPageSection()
- Set<CMIHologram> getAllInRangeByLoc(Location loc)
- boolean rechecInteractableHolograms(UUID uuid)
- void resetHoloForAllPlayers(CMIHologram holo)
- HashMap<String, CMIHologram> getHolograms()
- Set<CMIHologram> getPlayerActiveHolograms(UUID uuid)

## Package: com.Zrips.CMI.Modules.Holograms.Animations

### Class: com.Zrips.CMI.Modules.Holograms.Animations.CMIHologramAnimation
Type: Class

Methods:
- double getTarget(CMIHologramAnimationType type)
- CMIHologramValueChanger get(CMIHologramAnimationType type)
- void update()
- void setTarget(CMIHologramAnimationType type, double targetScale)
- boolean finished()
- **static** Color applyAlpha(Color color, int alpha)
- double getCurrent(CMIHologramAnimationType type)
- void setCurrent(CMIHologramAnimationType type, double currentScale)

### Class: com.Zrips.CMI.Modules.Holograms.Animations.CMIHologramAnimationType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Scale
- Opacity
- TextOpacity

Methods:
- **static** CMIHologramAnimationType valueOf(String name)
- **static** CMIHologramAnimationType[] values()

### Class: com.Zrips.CMI.Modules.Holograms.Animations.CMIHologramFadeInAnimation
Type: Class
Extends: com.Zrips.CMI.Modules.Holograms.Animations.CMIHologramAnimation

Constructors:
- CMIHologramFadeInAnimation(CMIHologramValueChanger scale, CMIHologramValueChanger opacity, CMIHologramValueChanger textOpacity)

No public methods found

### Class: com.Zrips.CMI.Modules.Holograms.Animations.CMIHologramValueChanger
Type: Class

Constructors:
- CMIHologramValueChanger(double start, double stop)
- CMIHologramValueChanger(double start, double stop, double changeBy)

Methods:
- double updateValue()
- double getTarget()
- void setChangeSpeed(double changeSpeed)
- void setTarget(double target)
- **static** double increment(double start, double, int end, double)
- CMIHologramValueChanger increment(double timeFrame)
- CMIHologramValueChanger increment(double timeFrame, int)
- boolean finished()
- double getCurrent()
- void setCurrent(double current)
- double getChangeSpeed()

## Package: com.Zrips.CMI.Modules.Homes

### Class: com.Zrips.CMI.Modules.Homes.CmiHome
Type: Class

Constructors:
- CmiHome(String name, CMILocation loc)
- CmiHome(String name, CMILocation loc, boolean privateH)

Methods:
- void setSlot(Integer slot)
- CMIMaterial getMaterial()
- Integer getSlot()
- CMILocation getLoc()
- String getName()
- CMIMaterial getIconMaterial()
- void setFavorite(boolean fav)
- boolean isBed()
- boolean isPrivate()
- void setBed(boolean bed)
- void setPrivate(boolean privateH)
- boolean isFavorite()
- void setMaterial(CMIMaterial material)

### Class: com.Zrips.CMI.Modules.Homes.HomeListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- HomeListener(CMI plugin)

Methods:
- void bedBreak(BlockBreakEvent event)
- void onEnderChestClick(PlayerInteractEvent event)

### Class: com.Zrips.CMI.Modules.Homes.HomeListener1_11
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- HomeListener1_11(CMI plugin)

Methods:
- void onEnderChestClick(PlayerBedEnterEvent event)

### Class: com.Zrips.CMI.Modules.Homes.HomeManager
Type: Class

Constructors:
- HomeManager(CMI plugin)

Methods:
- int getMaxHomes(CommandSender sender)
- int getMaxHomes(Player player)
- boolean isConfirmation()
- void addBedHome(CMIUser user, CmiHome bedHome)
- int getWorldLimit(String worldName)
- void loadConfig()
- String getDefaultHomeName()
- void addHomeGroup(String group, int amount)
- boolean isRemoveBedLocationOnBedBreak()
- void setHomeNameRegex(String homeNameRegex)
- Location getReSpawnLocation(Player player)
- Location getReSpawnLocation(Player player, Location respawnLoc)
- boolean isPickRealBlock()
- boolean openHomeGui(Player player, CMIUser user, int page)
- int getHomesMaxGuiSlots()
- HashMap<String, HashMap<CMIUser, CmiHome>> getBedHomes()
- String getHomeNameRegex()
- boolean openSimpleHomeGui(Player player, CMIUser user, int page)
- boolean isHomesWorldLimits()
- boolean openComplexHomeGui(Player player, CMIUser user, int page)
- int getGuiCloseButtonSlot()
- String getDefaultBedHomeName()
- HomeWorldLimit getWorldLimitObject(String worldName)
- int getRespawnImmortality()
- boolean isCheckBlockbreak()
- boolean isHomesGuiComplex()
- void setHomesWorldLimits(boolean homesWorldLimits)
- boolean isHomesGui()
- boolean isOnlyShiftBed()
- boolean removeBedHome(Location loc)
- CMIItemStack getGuiCloseButtonItem()
- boolean isHomesBedInteraction()

### Class: com.Zrips.CMI.Modules.Homes.HomeManager$RespawnPriority
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- anchor
- bedLocation
- spawn
- homeLocation
- worldSpawn

Methods:
- **static** HomeManager$RespawnPriority valueOf(String name)
- **static** HomeManager$RespawnPriority[] values()
- **static** HomeManager$RespawnPriority getByName(String name)
- **static** String getAsString()
- **static** List<String> getAsStringList()

### Class: com.Zrips.CMI.Modules.Homes.HomeWorldLimit
Type: Class

Methods:
- int getLimit()
- void setLimit(int limit)
- V setWorlds(List<String> worlds)
- List<String> getWorlds()

## Package: com.Zrips.CMI.Modules.Hooks

### Class: com.Zrips.CMI.Modules.Hooks.CMIHookSubType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PlayerVaults
- PlayerVaultsX
- PlayerVaultsNBT
- VaultPermissions

Methods:
- **static** CMIHookSubType valueOf(String name)
- **static** CMIHookSubType[] values()

### Class: com.Zrips.CMI.Modules.Hooks.CMIHookType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CMILib
- BlueMap
- AureliumSkills
- AuraSkills
- DiscordSRV
- dynmap
- Towny
- mcMMO
- Jobs
- Vault
- LWC
- VaultPermissions
- PlayerVaults
- PlaceholderAPI
- MVdWPlaceholderAPI
- Votifier
- Citizens
- NoCheatPlus
- ProtocolLib

Methods:
- void setEnabled(boolean loaded)
- void init()
- boolean hasSubType()
- **static** CMIHookType valueOf(String name)
- void setSubType(CMIHookSubType subType)
- boolean isEnabled()
- Plugin getPlugin()
- **static** CMIHookType[] values()
- CMIHookSubType getSubType()
- boolean isPresent()
- void update()
- boolean isShowFoundMessage()
- void setPresent(boolean present)

## Package: com.Zrips.CMI.Modules.HpBar

### Class: com.Zrips.CMI.Modules.HpBar.HpBarListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- HpBarListener(CMI plugin)

Methods:
- void EntityDamageEntityEvent(EntityDamageByEntityEvent event)

## Package: com.Zrips.CMI.Modules.InteractiveCommand

### Class: com.Zrips.CMI.Modules.InteractiveCommand.CMIInteractiveCommand
Type: Class

Constructors:
- CMIInteractiveCommand(String name)

Methods:
- void setName(String name)
- String getName()
- List<String> getCommandsOriginal()
- boolean isCancelInteraction()
- List<Integer> getIDList()
- void addCommand(String commands)
- boolean isSignLinesEmpty()
- List<String> getCommands(Player player)
- List<String> getCommands()
- V setCitizensCache(Set<CMINPC> citizensCache)
- V setSignLines(List<String> signLines)
- void addUUID(UUID uuid, Integer id)
- void addUUID(UUID uuid, UUID secondaryUUID, Integer id)
- void addCitizensCache(CMINPC citizen)
- boolean isPublic()
- boolean isSignRequiresPerm()
- void updateSignText(Block block)
- boolean hasUUID(UUID uuid)
- void setPublic(boolean publicIc)
- V setCommands(List<String> commands)
- Set<CMINPC> getCitizensCache()
- Set<UUID> getUUIDList()
- Set<CMILocation> getLocList()
- List<String> getUUIDStringList()
- void addLoc(CMILocation loc)
- CMIInteractiveCommand removeEntity(UUID uuid)
- List<String> getLocListAsString()
- void setSignRequiresPerm(boolean signRequiresPerm)
- boolean containsSigntext()
- void setCancelInteraction(boolean cancelInteraction)
- List<String> getSignLines()
- CMIInteractiveCommand removeLoc(CMILocation loc)
- V setUUIDList(HashMap<UUID, CMINPC> uuid)
- List<String> getUUIDStringListSave()
- List<CMINPC> getNPCList()
- HashMap<UUID, CMINPC> getUUIDMap()
- V setLoc(List<CMILocation> loc)

### Class: com.Zrips.CMI.Modules.InteractiveCommand.CMINPC
Type: Class

Constructors:
- CMINPC(int id)
- CMINPC(UUID uuid)

Methods:
- UUID getSecondaryUUID()
- UUID getUuid()
- CMINPC setSecondaryUUID(UUID secondaryUuid)
- CMINPC setId(Integer id)
- Integer getId()
- CMINPC setUuid(UUID uuid)

### Class: com.Zrips.CMI.Modules.InteractiveCommand.CitizensManager
Type: Class

Constructors:
- CitizensManager(CMI plugin)

Methods:
- UUID getEntityRealUUID(int id)
- boolean isCitizen(Entity ent)
- Integer getEntityId(Entity ent)
- Integer getEntityId(UUID uuid)
- UUID getCitizenPrivateUUID(UUID uuid)
- UUID getEntityUUID(Entity ent)
- UUID getEntityUUID(int id)

### Class: com.Zrips.CMI.Modules.InteractiveCommand.InteractiveCommandListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- InteractiveCommandListener(CMI plugin)

Methods:
- void onSignChangeEvent(SignChangeEvent event)
- void blockBreak(BlockPhysicsEvent event)
- void blockBreak(BlockBreakEvent event)
- void PlayerInteractEvent(PlayerInteractEvent event)
- void PlayerInteractCancelableEvent(PlayerInteractEvent event)

### Class: com.Zrips.CMI.Modules.InteractiveCommand.InteractiveCommandListener1_8
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- InteractiveCommandListener1_8(CMI plugin)

Methods:
- void onPlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event)
- void onEntityDamageByEntityEvent(EntityDamageByEntityEvent event)

### Class: com.Zrips.CMI.Modules.InteractiveCommand.InteractiveCommandManager
Type: Class

Constructors:
- InteractiveCommandManager(CMI plugin)

Methods:
- CMITask getSaveTask()
- void save()
- CMIInteractiveCommand getByLoc(Location loc)
- CMIInteractiveCommand getByUUID(UUID uuid)
- CMIInteractiveCommand getByCitizensId(Integer id)
- CMIInteractiveCommand removeEntity(UUID uuid)
- Set<CMIInteractiveCommand> getFullList()
- void addEntity(UUID uuid, CMIInteractiveCommand cmib)
- CMIInteractiveCommand addInteractiveCommand(CMIInteractiveCommand cmib)
- CMIInteractiveCommand addInteractiveCommand(CMIInteractiveCommand cmib, boolean save)
- CMIInteractiveCommand addInteractiveCommand(CMIInteractiveCommand cmib, boolean save, Location addedLocation)
- CMIInteractiveCommand removeLoc(CMILocation loc)
- void load()
- CMIInteractiveCommand getByName(String name)
- Entity getEntityByUUID(UUID uuid)
- void forceSave()
- Set<CMIInteractiveCommand> getSortedByDistance(Location loc)
- void clearLocationsFromIC(CMIInteractiveCommand cmib)
- void deleteIC(CMIInteractiveCommand cmib)

## Package: com.Zrips.CMI.Modules.InvEndEditor

### Class: com.Zrips.CMI.Modules.InvEndEditor.EndWatcher
Type: Class

Constructors:
- EndWatcher(Player player1, Player target)

Methods:
- Player getTarget()
- CMITask getSaveTask()
- void setTarget(Player target)
- Player getMaster()
- void setSaveTask(CMITask saveTask)
- void setMaster(Player player)

### Class: com.Zrips.CMI.Modules.InvEndEditor.EnderChestListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- EnderChestListener(CMI plugin)

Methods:
- void onPlayerLoginEnder(PlayerLoginEvent event)
- void onPlayerLoginEnder(PlayerJoinEvent event)
- void onNormalInventoryClose(InventoryCloseEvent event)
- void onPlayerQuitEnder(PlayerQuitEvent event)
- void onEnderChestDrag(InventoryDragEvent event)
- void onEnderChestClick(InventoryClickEvent event)

### Class: com.Zrips.CMI.Modules.InvEndEditor.EnderChestManager
Type: Class

Constructors:
- EnderChestManager(CMI plugin)

Methods:
- EndWatcher getSlave(Player player)
- void removeWatcher(Player player)
- boolean isBeingWatched(Player player)
- boolean updateTargetEnderChest(Player player)
- boolean isWatching(Player player)
- boolean openEnderChest(Player player, Player target)
- EndWatcher getWatcher(Player player)

## Package: com.Zrips.CMI.Modules.InvRegEditor

### Class: com.Zrips.CMI.Modules.InvRegEditor.CMIInvSee
Type: Class

Constructors:
- CMIInvSee(Player watcher, Player target)

Methods:
- void setTempLocked(boolean tempLocked)
- ItemStack getCursor()
- CMIInvSee setWatcher(Player watcher)
- ItemStack getOffHand()
- Player getWatcher()
- boolean isTempLocked()
- Player getTarget()
- void setTargetContents(ItemStack[] contents)
- void setTargetArmorContents(ItemStack[] armor)
- void setTask(CMITask task)
- ItemStack[] getContents()
- CMIInvSee setTarget(Player target)
- void setCursor(ItemStack cursor)
- void setOffHand(ItemStack offHand)
- CMITask getTask()
- ItemStack[] getArmorContents()

### Class: com.Zrips.CMI.Modules.InvRegEditor.RegChestListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- RegChestListener(CMI plugin)

Methods:
- void onPlayerLoginEnder(PlayerJoinEvent event)
- void onInventoryDragEventLog(InventoryDragEvent event)
- void onPlayerQuitEnder(PlayerQuitEvent event)
- void onInventoryClick(InventoryClickEvent event)
- void onCMIPlayerUnVanishEvent(CMIPlayerUnVanishEvent event)
- void onCMIPlayerVanishEvent(CMIPlayerVanishEvent event)

### Class: com.Zrips.CMI.Modules.InvRegEditor.RegChestManager
Type: Class

Constructors:
- RegChestManager(CMI plugin)

Methods:
- CMIInvSee removeSlave(Player player)
- boolean openInventory(Player watcher, Player target)
- boolean isSlave(Player player)
- CMIGui createGui(Player watcher, Player target)
- CMIInvSee removeWatcher(Player player)
- CMIInvSee getInformation(Player player)
- void tempLockWatcher(Player target)
- boolean isWatching(Player player)
- void recheckPlayerInventory(Player target)
- void remove(Player player)

## Package: com.Zrips.CMI.Modules.Ips

### Class: com.Zrips.CMI.Modules.Ips.IpManager
Type: Class

Constructors:
- IpManager(CMI plugin)

Methods:
- Set<CMIUser> getUsers(String ip)
- boolean ipIsOk(String ip)
- void clearCache()
- V addIp(HashMap<String, Integer> map, CMIUser user)
- void addIp(String ip, CMIUser user)
- boolean alternateIpIsOk(String ip)

## Package: com.Zrips.CMI.Modules.Jail

### Class: com.Zrips.CMI.Modules.Jail.CMIJail
Type: Class

Methods:
- CuboidArea loadBounds(String root) throws Exception
- void setName(String name)
- boolean isPreventLeave()
- void addCell(CMIJailCell cell)
- V setCells(HashMap<Integer, CMIJailCell> cells)
- int getNextCellId()
- String getName()
- boolean checkCollision(CuboidArea area)
- void setPreventLeave(boolean preventLeave)
- void setArea(CuboidArea area)
- boolean containsLoc(Location loc)
- boolean containsLoc(Location loc, int range)
- Location getOutsideLocation()
- void setOutsideLocation(Location safeLoc)
- void setOutsideLocation(CMILocation safeLoc)
- int getCountInCells()
- HashMap<Integer, CMIJailCell> getCells()
- CuboidArea getArea()

### Class: com.Zrips.CMI.Modules.Jail.CMIJailCell
Type: Class

Constructors:
- CMIJailCell(CMIJail jail)

Methods:
- CMIJail getJail()
- World getWorld()
- CMILocation getTeleportInLocation()
- void loadJailed(String root) throws Exception
- void setId(int id)
- Integer getId()
- void removeJailed(UUID uuid)
- void addJailed(UUID uuid)
- void setWorld(World world)
- V setJailed(HashSet<UUID> jailedOnes)
- Set<UUID> getJailed()
- void setTeleportInLocation(Location safeLoc)
- void setTeleportInLocation(CMILocation safeLoc)
- void teleportToCell(CMIUser user)

### Class: com.Zrips.CMI.Modules.Jail.JailListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- JailListener(CMI plugin)

Methods:
- void PlayerJoinEvent(PlayerJoinEvent event)
- void CMIAfkEnterEvent(CMIAfkEnterEvent event)
- void CMIAfkEnterEvent(CMIAfkLeaveEvent event)
- void onPlayerInteract(InventoryClickEvent event)
- void onPlayerInteract(PlayerDropItemEvent event)
- void onPlayerMove(PlayerMoveEvent event)
- void onPlayerMove(PlayerCommandPreprocessEvent event)
- void onFoodChange(FoodLevelChangeEvent event)
- void PlayerQuitEvent(PlayerQuitEvent event)
- void PlayerPickupItemEvent(PlayerPickupItemEvent event)
- void AsyncPlayerChatEvent(AsyncPlayerChatEvent event)
- void onHit(EntityDamageByEntityEvent event)
- void onPlayerDamage(EntityDamageEvent event)
- void PlayerRespawnEventHunger(PlayerRespawnEvent event)

### Class: com.Zrips.CMI.Modules.Jail.JailManager
Type: Class

Constructors:
- JailManager(CMI plugin)

Methods:
- void removeOnline(CMIUser user)
- SortedMap<String, CMIJail> getJails()
- CMIJail collidesWithJail(CuboidArea newarea)
- CMIJail collidesWithJail(CuboidArea newarea, CMIJail ignore)
- void loadConfig()
- V loadMap(Map<String, Object> root) throws Exception
- void removeJail(CMIJail jail)
- void save()
- CMIUserJailData getJailData(UUID uuid)
- CMIJail getByLoc(Location loc)
- boolean anyJailedOnline()
- boolean isCountWhileOffline()
- void recheckAllOnline()
- boolean isNoHunger()
- boolean isOnlineAndInJail(CMIUser user)
- void informAboutLeftTime(Player player)
- void informAboutLeftTime(CMIUser user)
- void load()
- CMIJail getByName(String name)
- void setJailChatRange(Integer jailChatRange)
- void setDefaultTime(int defaultTime)
- void addJail(CMIJail jail)
- boolean canUseCommand(String command)
- Integer getJailChatRange()
- void setCountWhileOffline(boolean countWhileOffline)
- List<CMIJail> getJailsByDistance(Location loc)
- void placePlayerIntoJail(CMIUser user)
- boolean placePlayerIntoJail(CMIUser user, CMIJail jail, Integer cellId, Long jailedFor)
- CMIUserJailData getOrCreateJailData(UUID uuid)
- boolean isNoAfk()
- CMIJailCell getValidCell(CMIUser user)
- CMIJailCell getValidCell(CMIUser user, CMIJail j, Integer cellId)
- Integer getDefaultTime()
- boolean isPreventDamage()
- void stop()
- void addOnline(CMIUser user)
- int getJailsCheckInterval()
- void recalculateChunks()
- void recalculateChunks(CMIJail jail)
- void removePlayerFromJail(CMIUser user)

## Package: com.Zrips.CMI.Modules.Kits

### Class: com.Zrips.CMI.Modules.Kits.Clickery
Type: Class

Methods:
- int getSpeed()

### Class: com.Zrips.CMI.Modules.Kits.Kit
Type: Class

Constructors:
- Kit(String name)

Methods:
- ItemStack getFirstNotNullItem()
- long getDelay()
- void setMaxUsages(int maxUsages)
- Integer getPage()
- int getWeight()
- void setCost(double cost)
- ItemStack getChest()
- List<String> getCommands(Player player)
- List<String> getCommands()
- void setFileName(String fileName)
- List<ItemStack> getItems()
- List<ItemStack> getItems(Player player)
- void setIconOff(ItemStack iconOff)
- ItemStack getLegs()
- int getMaxUsages()
- String getFileName()
- void setDelay(long delay)
- void setDropItems(boolean dropItems)
- boolean isLimitedUse()
- void setExtraItem(CMIPlayerInventory$CMIInventorySlot slot, ItemStack item)
- V setCommands(List<String> commands)
- ItemStack getOffHand()
- void setCommandName(String CommandName)
- String getConfigName()
- boolean isShowDespiteWeight()
- void setIcon(ItemStack icon)
- void setShowDespiteUsage(boolean showDespiteUsage)
- void setEnabled(boolean enabled)
- void setGroup(String group)
- ItemStack getHelmet()
- String getDisplayName()
- boolean isEnabled()
- String getGroup()
- void reset()
- void setBoots(ItemStack boots)
- ItemStack getBoots()
- double getCost()
- void setName(String name)
- ItemStack getExtraItem(CMIPlayerInventory$CMIInventorySlot slot)
- ItemStack getExtraItem(Player player, CMIPlayerInventory$CMIInventorySlot slot)
- boolean enoughFreeSpace(Player player)
- boolean isShowDespiteUsage()
- V setDescription(List<String> description)
- void setDisplayName(String displayName)
- List<String> getDescription(Player player)
- List<String> getDescription()
- void setSlot(Integer slot)
- void addItem(ItemStack item)
- V setConditions(List<String> conditions)
- ItemStack getSafeIconOff()
- void setOffHand(ItemStack offHand)
- V setItem(List<ItemStack> item)
- void setItem(int slot, ItemStack item)
- void setPage(Integer page)
- ItemStack getSafeIcon()
- int getExpCost()
- void setWeight(int weight)
- void setHelmet(ItemStack helmet)
- List<String> getConditions()
- boolean isDropItems()
- void setShowDespiteWeight(boolean showDespiteWeight)
- void setLegs(ItemStack legs)
- void setExpCost(int expCost)
- ItemStack getIcon()
- void setChest(ItemStack chest)
- Integer getSlot()
- ItemStack getIconOff()
- String getCommandName()

### Class: com.Zrips.CMI.Modules.Kits.KitListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- KitListener(CMI plugin)

Methods:
- void onPlayerFirstLogin(PlayerJoinEvent event)

### Class: com.Zrips.CMI.Modules.Kits.KitsManager
Type: Class

Constructors:
- KitsManager(CMI plugin)

Methods:
- void addKit(Kit kit)
- Kit getNewbieKit()
- **static** void openGuiEditorSettingsPreview(Player player, Kit kit)
- void safeSave()
- void openGuiEditorMain(Kit kit, Player player, boolean editor)
- ItemStack updateItemStackLore(ItemStack item, Player player, Kit kit)
- HashMap<String, List<Kit>> getValidKitsForPlayer(Player player, boolean includePreview)
- void loadConfig(ConfigReader cfg)
- void listPlayersKitsInGUI(Player player)
- void listPlayersKitsInGUI(Player player, int page)
- void save()
- **static** void saveOnClose()
- void startChatKitRemove(Player player, Kit kit, boolean confirmed)
- void clearCache(UUID uuid)
- boolean startChatKitCommandRename(Player player, Kit kit)
- **static** LinkedHashMap<String, CMIKitUsage> getUserKits(UUID uuid)
- void onDisable()
- void openGuiEditorSettings(Kit kit, Player player, boolean editor)
- void listPlayersKitsForEditing(Player player, Integer page)
- V setKits(LinkedHashMap<String, Kit> map)
- CMIItemStack getKitPreviewIcon(KitsManager$CMIKitGUILayout type)
- void load()
- boolean isKitsGUIFillEmptyFields()
- void renameKitCommandName(Kit kit, String newName)
- void renameKitConfigName(Kit kit, String newName)
- **static** void ItemClickInGui(Player player, Kit kit)
- boolean removeKit(String name)
- boolean isKitsGUI()
- Kit getKit(Player player, String name)
- Kit getKit(Player player, String name, boolean ignorePerm)
- Kit getKit(Player player, String name, boolean ignorePerm, boolean includePreview)
- Kit getKit(String name)
- Kit getKit(String name, boolean getdisabled)
- **static** HashMap<String, Object> getPlayersKitsDataForSave(UUID uuid)
- void listPlayersKitsInComplexGUI(Player player, int page)
- String processText(String text, Player player, Kit kit)
- List<Kit> getKitsByCommandName(Kit kit)
- boolean startChatKitRename(Player player, Kit kit)
- boolean startChatKitAdd(Player player, String kitName)
- boolean startChatKitGroupRename(Player player, Kit kit)
- LinkedHashMap<String, Kit> getKitMap()
- void listPlayersKits(Player player)
- void listPlayersKits(CommandSender sender, Player player, int page)
- void giveKit(Player player, Kit kit)
- void giveKit(Player player, Kit kit, boolean giveItems)
- List<Kit> getGroupedKits(String kitConfigName)
- List<Kit> getGroupedKits(Kit kit)

### Class: com.Zrips.CMI.Modules.Kits.KitsManager$CMIKitGUILayout
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Separator
- OffHand
- Helmet
- Chest
- Legs
- Boots
- Clone
- configName
- commandName
- fileName
- displayName
- ShowDespiteWeight
- Weight
- Group
- Slot
- Page
- DropItems
- Icon
- IconCD
- Delay
- Money
- Exp
- Back
- Commands
- Conditions
- ShowWithoutUsage
- Usages
- Description
- Enabled
- Settings
- MainMenu

Methods:
- void setIcon(CMIItemStack icon)
- **static** KitsManager$CMIKitGUILayout getButton(int slot)
- Integer getSlot()
- **static** KitsManager$CMIKitGUILayout valueOf(String name)
- **static** KitsManager$CMIKitGUILayout[] values()
- CMIItemStack getIcon()

## Package: com.Zrips.CMI.Modules.LightFix

### Class: com.Zrips.CMI.Modules.LightFix.LightFix
Type: Class

Constructors:
- LightFix(CMI plugin)

Methods:
- void start(LightFixInfo scan)

### Class: com.Zrips.CMI.Modules.LightFix.LightFixInfo
Type: Class

Methods:
- Player getPlayer()
- long getShowInfo()
- CMITask getScheduleTask()
- void setPlayer(Player Player)
- void setMessages(boolean messages)
- String getPlayerName()
- void setAutoSpeed(boolean autoSpeed)
- void setRunning(boolean state)
- void setSpeed(int speed)
- boolean isRunning()
- boolean isShowInfo()
- WorldInfo getRI()
- void setShowInfo(long time)
- void setShowInfo(boolean state)
- int getSpeed()
- boolean isAutoSpeed()
- boolean isMessages()
- long getStartTime()
- void setStartTime()
- void setRI(WorldInfo rI)
- void setScheduleTask(CMITask task)

## Package: com.Zrips.CMI.Modules.Mirror

### Class: com.Zrips.CMI.Modules.Mirror.MirrorListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- MirrorListener(CMI plugin)

Methods:
- void BlockPlaceEvent(BlockPlaceEvent event)
- void BlockBreakEvent(BlockBreakEvent event)

### Class: com.Zrips.CMI.Modules.Mirror.MirrorManager
Type: Class

Constructors:
- MirrorManager(CMI plugin)

Methods:
- Mirrors getMirror(UUID uuid)
- void removeMirroring(Player player)
- void removeMirroring(UUID uuid)
- boolean addMirroring(Player player)
- boolean isMirroring(Player player)
- void MirrorPlace(Player player, Block block, ItemStack i)
- void openNewGui(CMIUser user)
- void setMirror(UUID uuid, Mirrors mirror)
- void MirrorBreak(Player player, Block block)

### Class: com.Zrips.CMI.Modules.Mirror.MirrorManager$MirrorAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- X
- Y
- Z
- XY
- ZY
- XZ
- ZX
- Rotate90V
- Rotate90H
- Rotate90HC
- Rotate180H
- Pause
- Location

Methods:
- void setName(String name)
- int getSlot()
- String getName()
- **static** MirrorManager$MirrorAction valueOf(String name)
- **static** MirrorManager$MirrorAction[] values()
- String getDesc()
- void setDesc(String desc)

### Class: com.Zrips.CMI.Modules.Mirror.MirrorManager$mirrorShift
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- north
- northEast
- east
- southEast
- south
- southWest
- west
- northWest

Methods:
- MirrorManager$mirrorShift setOffset(int offset)
- **static** MirrorManager$mirrorShift valueOf(String name)
- int getOffset()
- **static** MirrorManager$mirrorShift[] values()
- Location modifyLocation(Location loc)

### Class: com.Zrips.CMI.Modules.Mirror.Mirrors
Type: Class

Constructors:
- Mirrors(Location loc)

Methods:
- boolean isPaused()
- Location getCenter()
- void setLastAction(long lastAction)
- Mirrors set(MirrorManager$MirrorAction action, Boolean state)
- Mirrors clone()
- Object clone() throws CloneNotSupportedException
- Mirrors setPaused(boolean paused)
- Mirrors setCenter(Location loc)
- Mirrors reset()
- long getLastAction()
- boolean is(MirrorManager$MirrorAction action)

### Class: com.Zrips.CMI.Modules.Mirror.Rotation
Type: Class

Constructors:
- Rotation(Material mat, short data)

Methods:
- Material getMat()
- void setData(short data)
- void setMat(Material mat)
- short getData()

## Package: com.Zrips.CMI.Modules.MirrorV2

### Class: com.Zrips.CMI.Modules.MirrorV2.CMIBlockMirroringV2
Type: Class

Constructors:
- CMIBlockMirroringV2(Player player, Location loc)

Methods:
- boolean isPaused()
- Location getCenter()
- CMIBlockMirroringV2 set(CMIMirrorTypeV2 action, CMIMirrorModeV2 mode)
- CMIBlockMirroringV2 setPaused(boolean paused)
- CMIBlockMirroringV2 setCenter(Location loc)
- CompletableFuture<Set<Vector>> getPointsAsync(Vector startingPoint)
- boolean is(CMIMirrorTypeV2 action)
- int edgeToNumber()
- Vector getEdge()
- void setLastAction(long lastAction)
- CMIBlockMirroringV2 setEdge(Vector edge)
- CMIMirrorModeV2 get(CMIMirrorTypeV2 action)
- CMIBlockMirroringV2 clone()
- Object clone() throws CloneNotSupportedException
- CMIBlockMirroringV2 reset()
- CompletableFuture<HashMap<Vector, CMIMirrorFlipInformation>> getPointsWithFlipAsync(Vector startingPoint)
- long getLastAction()
- Vector getNextEdge()

### Class: com.Zrips.CMI.Modules.MirrorV2.CMIBlockMirroringV2$Axis
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- X
- Y
- Z

Methods:
- **static** CMIBlockMirroringV2$Axis valueOf(String name)
- **static** CMIBlockMirroringV2$Axis[] values()
- Vector getVector()

### Class: com.Zrips.CMI.Modules.MirrorV2.CMIMirrorBlockInformationV2
Type: Class

Methods:
- Location getLoc(World world)
- void setVector(Vector vector)
- void setData(Object data)
- Object getData()

### Class: com.Zrips.CMI.Modules.MirrorV2.CMIMirrorFlipInformation
Type: Class

Methods:
- CMIMirrorFlipInformation add(CMIBlock$FlipDirection direction)
- Set<CMIBlock$FlipDirection> get()

### Class: com.Zrips.CMI.Modules.MirrorV2.CMIMirrorListenerV2
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- CMIMirrorListenerV2(CMI plugin)

Methods:
- void BlockPlaceEvent(BlockPlaceEvent event)
- void BlockBreakEvent(BlockBreakEvent event)

### Class: com.Zrips.CMI.Modules.MirrorV2.CMIMirrorManagerV2
Type: Class

Constructors:
- CMIMirrorManagerV2(CMI plugin)

Methods:
- CMIBlockMirroringV2 getMirror(CMIUser user)
- CMIBlockMirroringV2 getMirror(Player player)
- void removeMirroring(Player player)
- void removeMirroring(UUID uuid)
- boolean addMirroring(Player player)
- void openGui(CMIUser user)
- boolean isMirroring(Player player)
- void setMirror(UUID uuid, CMIBlockMirroringV2 mirror)
- void breakBlock(Player player, Block block)
- void placeBlock(Player player, Block block, ItemStack i)

### Class: com.Zrips.CMI.Modules.MirrorV2.CMIMirrorModeV2
Type: Class

Constructors:
- CMIMirrorModeV2(CMIMirrorTypeV2 type)

Methods:
- void setEnabled(boolean enabled)
- void setSections(int sections)
- CMIMirrorTypeV2 getType()
- boolean isEnabled()
- void setType(CMIMirrorTypeV2 type)
- int getSections()

### Class: com.Zrips.CMI.Modules.MirrorV2.CMIMirrorTypeV2
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- X
- Y
- Z
- XR
- YR
- ZR
- XY180
- YZ180
- ZX180
- XYZ180
- X90
- Y90
- Z90
- X90R
- Y90R
- Z90R
- XYM
- XYMR
- YZM
- YZMR
- ZXM
- ZXMR

Methods:
- boolean isSections()
- int getSlot()
- void setSections(boolean sections)
- void setVector(Vector vector)
- String getName()
- **static** CMIMirrorTypeV2 valueOf(String name)
- **static** CMIMirrorTypeV2[] values()
- Vector getVector()
- String getDesc()
- void setDesc(String desc)

### Class: com.Zrips.CMI.Modules.MirrorV2.CMIRotationAngle
Type: Class

Constructors:
- CMIRotationAngle(float pitch, float yaw)

Methods:
- float getYaw()
- float getPitch()
- void setPitch(float pitch)
- void setYaw(float yaw)

## Package: com.Zrips.CMI.Modules.ModuleHandling

### Class: com.Zrips.CMI.Modules.ModuleHandling.CMIModule
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- silentChest
- versionCheck
- worldLimits
- worldLimitsElytra
- customMessages
- firstJoinMessages
- cuffed
- elevator
- nightSpeedup
- damageControl
- portalCreation
- teleportWith
- durabilityLoss
- mirror
- spawners
- spawnerProximity
- spawnerCharge
- warmup
- cooldown
- interactiveCommands
- attachedCommands
- armorEffects
- playerChatTag
- chatBubble
- tablist
- paintingEditor
- vanish
- moneyCheque
- armorstand
- cmiPlaytime
- holograms
- portals
- homeInteractions
- dynamicSigns
- signEdit
- coloredArmor
- noTarget
- ranks
- votifier
- playerCombat
- headDrop
- kits
- schedule
- namePlates
- jail
- flightCharge
- shulkerBackpack
- decoratedpot
- skin
- selection
- hpBossBar
- afk
- timedCommands
- eventCommands
- disabledEnchants
- sitAnimation
- rideAnimation
- bossBarCompass
- elytraBoost
- elytraLaunch
- elytraExploit
- totemBehavior
- anvilRenameColor
- launchPad
- deathMessages
- serverLinks
- hat

Methods:
- CMIModuleClass[] getListeners()
- void setEnabled(boolean enabled)
- **static** CMIModule valueOf(String name)
- **static** boolean isEnabled(String name)
- boolean isEnabled()
- **static** CMIModule[] values()
- Version getToVersion()
- **static** CMIModule getByName(String name)
- String getDesc()
- void setDesc(String desc)
- Version getFromVersion()
- void registerListener()

### Class: com.Zrips.CMI.Modules.ModuleHandling.CMIModuleClass
Type: Class

Constructors:
- CMIModuleClass(Class<*> listener)
- CMIModuleClass(Class<*> listener, Version from)
- CMIModuleClass(Class<*> listener, Version from, Version to)

Methods:
- Version getTo()
- Class<*> getListener()
- Version getFrom()

### Class: com.Zrips.CMI.Modules.ModuleHandling.CMIModuleManager
Type: Class

Methods:
- **static** void registerListeners()
- **static** void load()
- **static** void switchInFile(CMIModule module, boolean state)

## Package: com.Zrips.CMI.Modules.MoneyCheque

### Class: com.Zrips.CMI.Modules.MoneyCheque.MoneyChequeListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- MoneyChequeListener(CMI plugin)

Methods:
- void playerInteractOneTime(PlayerInteractEvent event)
- void playerInteractOneTime(CMIAnvilItemRenameEvent event)

## Package: com.Zrips.CMI.Modules.NickName

### Class: com.Zrips.CMI.Modules.NickName.NickNameListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- NickNameListener(CMI plugin)

Methods:
- **static** String processGradientChat(Player player, String message)
- void PlayerLoginEvent(PlayerLoginEvent event)

### Class: com.Zrips.CMI.Modules.NickName.NickNameManager
Type: Class

Constructors:
- NickNameManager(CMI plugin)

Methods:
- UUID whoUsesName(String nick)
- boolean isIncludeNickNameInTabComplete()
- void setPrefixWhenDifferent(Boolean prefixWhenDifferent)
- void removeNickName(String nick)
- int getNickNameLengthMax()
- String getNickNameFormat()
- List<String> getNickNamesStartingWith(Player player, String nick)
- Boolean isIncludeRealNameInTabComplete()
- Boolean isPrefixWhenDifferent()
- void load()
- boolean isDisplayNameChange()
- Boolean isColorsNickName()
- List<String> getNickNameBlackList()
- void addNewNickName(String nick, UUID uuid)
- int getNickNameLengthMin()
- String getValidNickNameRegex()
- void setNickNamePrefix(String nickNamePrefix)
- String getNickNamePrefix()

## Package: com.Zrips.CMI.Modules.Notify

### Class: com.Zrips.CMI.Modules.Notify.Notification
Type: Class

Constructors:
- Notification(String notifyier)

Methods:
- void addMesage(String mesage)
- List<String> getMesages()
- void setNotifyier(String notifyier)
- String getNotifyier()
- V setMesages(List<String> mesages)

## Package: com.Zrips.CMI.Modules.Packets

### Class: com.Zrips.CMI.Modules.Packets.FakeInfo
Type: Class

Methods:
- Player getPlayer()
- FakeInfo setObj(Object obj)
- FakeInfo setId(int id)
- Object getObj()
- FakeInfo setPlayer(Player player)
- int getId()
- Object getEntity()
- void setEntity(Object entity)

### Class: com.Zrips.CMI.Modules.Packets.PacketHandler
Type: Class
Extends: io.netty.channel.ChannelDuplexHandler

Constructors:
- PacketHandler(Player p)

Methods:
- **static** void addFakeEntity(FakeInfo fake)
- **static** void removeFakeEntity(FakeInfo fake)
- **static** void clearFakeEntities()
- **static** void clearCache(UUID uuid)
- void write(ChannelHandlerContext ctx, Object m, ChannelPromise promise) throws Exception
- void channelRead(ChannelHandlerContext c, Object m) throws Exception

### Class: com.Zrips.CMI.Modules.Packets.PacketInjector
Type: Class

Methods:
- void addPlayer(Player p)
- Field getField(Class<*> clazz, String fieldName) throws Exception
- void removePlayer(Player p)

### Class: com.Zrips.CMI.Modules.Packets.PacketPlayerListeners
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PacketPlayerListeners(CMI plugin)

Methods:
- void onPacketPlayerQuit(PlayerQuitEvent event)
- void onPacketPlayerLogin(PlayerJoinEvent event)

## Package: com.Zrips.CMI.Modules.Painting

### Class: com.Zrips.CMI.Modules.Painting.PaintingListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PaintingListener(CMI plugin)

Methods:
- void onSignInteractShift(PlayerInteractEvent event)
- void onItemHeldChange(PlayerItemHeldEvent event)
- void onPlayerInteractPaiting(PlayerInteractEntityEvent event)
- void onPaintingBreak(PlayerQuitEvent event)
- void onPaintingBreak(HangingBreakEvent event)

### Class: com.Zrips.CMI.Modules.Painting.PaintingManager
Type: Class

Constructors:
- PaintingManager(CMI plugin)

Methods:
- Painting getPainting(UUID uuid)
- boolean isEditing(UUID uuid)
- void removeEditor(UUID uuid)
- void removeEditor(Entity entity)
- void addEditor(UUID uuid, Entity ent)

## Package: com.Zrips.CMI.Modules.Particl

### Class: com.Zrips.CMI.Modules.Particl.CMIPEAnimationInterface
Type: Interface

Methods:
- void setDuration(double)
- int getInterval()
- Player getPlayerMove()
- Location getCenter()
- void setColor(Color)
- void setColor(Color)
- void setColor(CMIChatColor)
- double getDuration()
- void show()
- void setCenter(Location)
- boolean isHideWithVanish()
- boolean isFixedLocation()
- Z render(List<Player>)

### Class: com.Zrips.CMI.Modules.Particl.CMIPEAnimation
Type: Class
Implements: com.Zrips.CMI.Modules.Particl.CMIPEAnimationInterface

Constructors:
- CMIPEAnimation(CMIEffect effect)
- CMIPEAnimation(CMIEffectManager$CMIParticle effect)

Methods:
- void setDuration(double d)
- void setEffect(CMIEffectManager$CMIParticle particle)
- int getInterval()
- Player getPlayerMove()
- void setHideWithVanish(boolean hideWithVanish)
- Location getCenter()
- void setParticle(CMIEffectManager$CMIParticle particle)
- Vector getOffset()
- void show()
- void setCenter(Location center)
- boolean isHideWithVanish()
- Color getColor()
- CMIEffectManager$CMIParticle getParticle()
- void setCMIEffect(CMIEffect effect)
- CMIEffect getCMIEffect()
- void setColor(Color color)
- void setColor(Color color)
- void setColor(CMIChatColor color)
- double getDuration()
- void setInterval(int interval)
- void setOffset(Vector offset)
- void setPlayerMove(Player playerMove)
- CMIEffectManager$CMIParticle getEffect()
- boolean isFixedLocation()
- void setFixedLocation(boolean fixedLocation)
- Z render(List<Player> players)

### Class: com.Zrips.CMI.Modules.Particl.CMIPECircle
Type: Class
Extends: com.Zrips.CMI.Modules.Particl.CMIPEAnimation

Constructors:
- CMIPECircle(CMIEffect effect)
- CMIPECircle(CMIEffectManager$CMIParticle effect)

Methods:
- void setFollowPitch(boolean followPitch)
- void setMaxRadius(double maxRadius)
- boolean isFollowPitch()
- void setMoveMulty(Double moveMulty)
- boolean isRaindbowColor()
- Vector getMove()
- boolean isRaindbowColorFromStart()
- void setPitchAdjust(double pitchAdjust)
- void setRadius(double radius)
- short getStartingAngle()
- double getRadiusChange()
- double xPosYaw(double time, double, double radius)
- void setYawAdjust(double yawAdjust)
- double getYawAdjust()
- boolean isFollowYaw()
- double zPosYaw(double time, double, double radius)
- void setFollowYaw(boolean followYaw)
- Double getMoveMulty()
- boolean isRaindbowColorStatic()
- Z render(List<Player> players)
- void setMove(Vector move)
- double getMaxRadius()
- int getTimes()
- void setFollowDirection(boolean followDirection)
- double getRadius()
- void setYaw(double yaw)
- double getYaw()
- void setRotating(boolean circling)
- boolean isRotating()
- void setStartingAngle(short startingAngle)
- double getPitch()
- double yPosYaw(double time, double)
- void setRaindbowColorStatic(boolean raindbowColorStatic)
- double getMaxMoveDistance()
- void setRaindbowColor(boolean raindbowColor)
- void setRadiusChange(double radiusChange)
- boolean isFollowDirection()
- void setPitch(double pitch)
- double getPitchAdjust()
- void setTimes(int times)
- void setRaindbowColorFromStart(boolean raindbowColorFromStart)
- void setMaxMoveDistance(double MaxMoveDistance)

### Class: com.Zrips.CMI.Modules.Particl.CMIPEFireWork
Type: Class
Extends: com.Zrips.CMI.Modules.Particl.CMIPEAnimation

Methods:
- void setFadeFrom(Color fadeFrom)
- Boolean getTrail()
- FireworkEffect$Type getType()
- Color getFadeTo()
- void setTrail(Boolean trail)
- Boolean getFlicker()
- Color getFadeFrom()
- void setFadeTo(Color fadeTo)
- void setType(FireworkEffect$Type type)
- void setFlicker(Boolean flicker)
- Z render(List<Player> players)

### Class: com.Zrips.CMI.Modules.Particl.CMIVisualEffect
Type: Class

Constructors:
- CMIVisualEffect(Player targetPlayer, ParticleManager$CMIPresetAnimations effect)
- CMIVisualEffect(Player targetPlayer, CMIPEAnimationInterface effect)
- CMIVisualEffect(Location loc, CMIPEAnimationInterface effect)

Methods:
- void setEffect(CMIPEAnimationInterface effect)
- int getInterval()
- void stop()
- void setInterval(int interval)
- void setTargetPlayer(Player targetPlayer)
- void show()
- void show(Player player)
- Long getUntil()
- CMIPEAnimationInterface getEffect()
- Player getTargetPlayer()
- void continueAnimation()
- void setUntil(Long until)
- void pause()

### Class: com.Zrips.CMI.Modules.Particl.ParticleManager
Type: Class

Constructors:
- ParticleManager(CMI plugin)

Methods:
- void loadConfig()
- void show(String a, Player player)
- void show(CMIPEAnimationInterface animation, Location loc)
- void show(CMIPEAnimationInterface animation, Player player)
- boolean removeAllPlayerEffects()
- boolean removePlayerEffects(CMIVisualEffect effect)
- boolean removePlayerEffects(UUID uuid)
- CMIPEAnimationInterface getParticleAnimation(String string)
- void drawLine(Player player, Location loc1, Location loc2, CMIEffectManager$CMIParticle effect, boolean center)
- void drawLine(Location loc1, Location loc2, CMIEffectManager$CMIParticle effect, boolean center, Player player)
- V drawLine(Location loc1, Location loc2, CMIEffectManager$CMIParticle effect, boolean center, List<Player> players)
- V drawLine(Location loc1, Location loc2, CMIEffectManager$CMIParticle effect, boolean center, List<Player> players, Long keepFor)
- V drawLine(Location loc1, Location loc2, CMIEffect effect, boolean center, List<Player> players, Long keepFor, Double speed)
- boolean addPlayerEffect(CMIVisualEffect effect)

### Class: com.Zrips.CMI.Modules.Particl.ParticleManager$CMIPresetAnimations
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- TotemHalo
- Healing
- GlyphHead
- tpaWarmup
- GColumn
- SmallBoop
- HologramInteraction
- HologramNewInteraction
- HologramHover
- TpUp
- TpDown
- custom1
- custom2
- custom3
- custom4
- custom5
- custom6
- custom7
- custom8
- custom9
- custom10
- custom11
- custom12
- custom13
- custom14
- custom15
- custom16
- custom17
- custom18
- custom19
- custom20
- custom21
- custom22
- custom23
- custom24
- custom25
- custom26
- custom27
- custom28
- custom29
- custom30

Methods:
- void setEnabled(boolean enabled)
- String getAnimString()
- **static** ParticleManager$CMIPresetAnimations valueOf(String name)
- boolean isEnabled()
- **static** ParticleManager$CMIPresetAnimations[] values()
- **static** ParticleManager$CMIPresetAnimations getByName(String name)
- void show(Location loc)
- void show(Player player)
- void setAnimString(String string)
- CMIPEAnimationInterface getInter()
- CMIPEAnimationInterface getInter(Player player)

### Class: com.Zrips.CMI.Modules.Particl.Vectors
Type: Class

Methods:
- void setp2(Vector state)
- Vector getp2()
- void setp1(Vector state)
- Vector getp1()

## Package: com.Zrips.CMI.Modules.Patrol

### Class: com.Zrips.CMI.Modules.Patrol.PatrolManager
Type: Class

Constructors:
- PatrolManager(CMI plugin)

Methods:
- CMIUser getNextUser()

## Package: com.Zrips.CMI.Modules.Permissions

### Class: com.Zrips.CMI.Modules.Permissions.PermissionInterface
Type: Interface

Methods:
- String getPrefix(Player)
- String getPrefix(UUID)
- String getMainGroup(Player)
- String getMainGroup(String, UUID)
- String getSufix(Player)
- String getSufix(UUID)
- String getNameColor(Player)

### Class: com.Zrips.CMI.Modules.Permissions.BPermissionsHandler
Type: Class
Implements: com.Zrips.CMI.Modules.Permissions.PermissionInterface

Methods:
- String getPrefix(Player player)
- String getPrefix(UUID uuid)
- String getMainGroup(Player player)
- String getMainGroup(String world, UUID uuid)
- String getSufix(Player player)
- String getSufix(UUID uuid)
- String getNameColor(Player player)

### Class: com.Zrips.CMI.Modules.Permissions.GroupManagerXHandler
Type: Class
Implements: com.Zrips.CMI.Modules.Permissions.PermissionInterface

Constructors:
- GroupManagerXHandler(CMI plugin)

Methods:
- String getPrefix(Player player)
- String getPrefix(UUID uuid)
- String getMainGroup(Player player)
- String getMainGroup(String world, UUID uuid)
- String getSufix(Player player)
- String getSufix(UUID uuid)
- String getNameColor(Player player)

### Class: com.Zrips.CMI.Modules.Permissions.LuckPermsHandler4
Type: Class
Implements: com.Zrips.CMI.Modules.Permissions.PermissionInterface

Methods:
- String getPrefix(Player player)
- String getPrefix(UUID uuid)
- String getMainGroup(Player player)
- String getMainGroup(String world, UUID uuid)
- String getSufix(Player player)
- String getSufix(UUID uuid)
- String getNameColor(Player player)

### Class: com.Zrips.CMI.Modules.Permissions.LuckPermsHandler5
Type: Class
Implements: com.Zrips.CMI.Modules.Permissions.PermissionInterface

Methods:
- String getPrefix(Player player)
- String getPrefix(UUID uuid)
- String getMainGroup(Player player)
- String getMainGroup(String world, UUID uuid)
- String getSufix(Player player)
- String getSufix(UUID uuid)
- String getNameColor(Player player)

### Class: com.Zrips.CMI.Modules.Permissions.NoneHandler
Type: Class
Implements: com.Zrips.CMI.Modules.Permissions.PermissionInterface

Methods:
- String getPrefix(Player player)
- String getPrefix(UUID uuid)
- String getMainGroup(Player player)
- String getMainGroup(String world, UUID uuid)
- String getSufix(Player player)
- String getSufix(UUID uuid)
- String getNameColor(Player player)

### Class: com.Zrips.CMI.Modules.Permissions.PEXHandler
Type: Class
Implements: com.Zrips.CMI.Modules.Permissions.PermissionInterface

Methods:
- String getPrefix(Player player)
- String getPrefix(UUID uuid)
- String getMainGroup(Player player)
- String getMainGroup(String world, UUID uuid)
- String getSufix(Player player)
- String getSufix(UUID uuid)
- String getNameColor(Player player)

### Class: com.Zrips.CMI.Modules.Permissions.PermissionInfo
Type: Class

Constructors:
- PermissionInfo(String permission, Long delay)

Methods:
- Long getDelay()
- String getPermission()
- Set<String> getValues()
- boolean isTimeToRecalculate()
- Double getMaxValue()
- Double getMaxValue(double defaultV)
- int getMaxValue(int defaultV)
- void setLastChecked(long lastChecked)
- void setEnabled(boolean enabled)
- void setMaxValue(Double maxValue)
- Double getMinValue()
- Double getMinValue(double defaultV)
- int getMinValue(int defaultV)
- boolean isEnabled()
- Long getLastChecked()
- void setPermission(String permission)
- void setDelay(long delay)
- void setMinValue(Double minValue)
- void addValue(String value)

### Class: com.Zrips.CMI.Modules.Permissions.PermissionsManager
Type: Class

Constructors:
- PermissionsManager(CMI plugin)

Methods:
- PermissionInfo addToCache(Player player, String perm, boolean has, Long delayInMiliseconds)
- PermissionAttachmentInfo getSetPermission(CommandSender sender, String perm)
- String getPrefix(UUID uuid)
- String getPrefix(Player player)
- String getMainGroup(Player player)
- String getSufix(UUID uuid)
- String getSufix(Player player)
- void checkPermissions()
- PermissionInfo getPermissionInfo(Player player, String perm, Long delayInMiliseconds)
- PermissionInfo getPermissionInfo(Player player, PermissionsManager$CMIPerm perm, String[] extra)
- PermissionInfo getPermissionInfo(Player player, PermissionsManager$CMIPerm perm)
- PermissionInfo getPermissionInfo(Player player, PermissionsManager$CMIPerm perm, Long delayInMiliseconds)
- PermissionInfo getPermissionInfo(Player player, String perm)
- PermissionInfo getPermissionInfo(Player player, String perm, boolean force)
- PermissionInfo getPermissionInfo(Player player, String perm, boolean force, Long delay)
- PermissionInfo getFromCache(Player player, String perm)
- void removeFromCache(Player player)
- boolean isSetPermission(CommandSender sender, String perm)
- boolean isSetPermission(Player player, String perm)
- String getNameColor(Player player)

### Class: com.Zrips.CMI.Modules.Permissions.PermissionsManager$CMIPerm
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- security_admin
- buttonteleport
- enderedit
- bedhome
- actionbar_colors
- totem_frominventory
- elevator_use
- elevator_create
- bossbar_colors
- bossbar_hpbar
- dynmap_hidden
- prewards_notification
- prewards_$1
- anvil_colors
- anvil_bypassitalic
- title_colors
- tag_color
- colors_$1_$star
- colors_$1_$2
- seevanished
- vanishlevel_$1
- messages_disablelogin
- messages_disablequit
- scrollpainting
- autorespawn
- elytralaunch
- permisiononerror
- invedit
- book_colors
- book_pages_$1
- damagecontrol_$1
- chorusteleport
- teleport_with_$1
- randomteleport_$1
- randomteleport_cooldownbypass
- fullserver_bypass
- signs_shiftedit
- signs_shifteditbypass
- netherportalbypass
- silentchest_editing
- interactivesign_$1
- versioncheck
- worldlimit_gamemode_bypass
- worldlimit_fly_bypass
- worldlimit_elytra_bypass
- worldlimit_fly_aboveroof
- worldlimit_god_bypass
- spawners_charge_bypass
- inventoryhat
- inventoryhat_bypass
- minecart_change_$1
- hologram_$1
- kit_$1
- kit_$1_preview
- kit_bypass_money
- kit_bypass_exp
- kit_bypass_time
- kit_bypass_onetimeuse
- pvp_cmdBypass
- pvp_godBypass
- pve_godBypass
- pvp_PFlyBypass
- pvp_MFlyBypass
- spawnonjoin_bypass
- spawngroup_$1
- respawngroup_$1
- rank_$1
- select
- chatgroup_$1
- chatmessagegroup_$1
- chat_shout
- chat_rangebypass
- chat_rangespy
- tablist_$1
- elytra
- elytra_boost
- elytra_superboost
- elytra_speedometer
- elytra_freeflight
- hunger_keepafterdeath
- anvil_itemrename_bypass
- sleepignore
- chatfilter_inform
- chatfilter_bypass_$1
- commandfilter_bypass
- chatfilter_spambypass
- chatfilter_capbypass
- deathlocation
- saveinv
- scheduler_exclude
- openshulker
- openshulker_free
- openshulker_shift
- safeteleport
- safeteleport_bypass_$1
- viewrange
- viewrange_$1
- dropspawner
- dropspawner_$1
- dropspawner_nosilk
- dropspawner_basedropchance_$1
- dropspawner_stopafter_$1
- spawners_proximity_bypass
- spawners_charge_$1
- keepinventory
- keepexp
- informDurability
- egginteract_$1
- trialegginteract_$1
- placespawner
- placespawner_$1
- teleport_bypassblacklist
- teleport_currentlocation
- armorstand_hands
- armorstand_offhand
- bungee_publicmessages_$1
- warmupbypass_$1
- warmuptime_$1_$2
- command
- command_options_$1
- command_jump_$1
- costbypass_$1
- cooldownbypass_$1
- cooldown_$1_$2
- command_armorstand_$1
- command_armorstand_renaming
- command_armorstand_movebypass
- command_armorstand_admin
- command_armorstand_template_$1
- command_giftpet_bypass
- command_releasepet_bypass
- command_donate_bypass
- command_donate_accept
- command_donate_send
- command_portal_$1
- command_kill_byforce
- command_kiteditor_admin
- command_itemframe_$1
- command_world_$1
- command_skin_perm_$1
- command_point_$1
- command_ender_preventmodify
- command_ender_preventmodify_bypass
- command_inv_preventmodify
- command_inv_location
- command_inv_information
- command_inv_preventmodify_bypass
- command_give_max_$1
- command_tfly_admin
- command_tfly_maxtime_$1
- command_spawner_shiftclick
- command_spawner_$1
- command_repair_$1
- command_head_othersource
- command_note_add
- command_note_remove
- command_gm_$1
- command_replaceblock_speed
- command_scan_speed
- command_fixchunk_speed
- command_enchant_bypasslimit
- command_enchant_bypassinvalid
- enchantments_$1
- enchantments_$1_$2
- command_attachcommand_cc
- command_attachcommand_silent
- command_sendall_bypass
- command_heal_all
- command_feed_all
- command_$1_others
- command_prewards_others_claim
- command_$1_others_$2
- command_msg_vanish
- command_msg_togglebypass
- command_msg_$1_send
- command_bossbarmsg_admin
- command_sell_$1
- command_patrol_bypass
- command_afk_auto
- command_afk_staffinform
- command_afk_kickbypass
- command_afk_kickOutIn_$1
- command_cheque_admin
- command_cheque_withdraw
- command_invcheck_edit
- command_warp_$1
- command_warp_showlist
- command_warp_redefine
- command_warp_specificlocation
- command_warp_diffdisplayname
- command_setwarp_multiloc
- command_setwarp_unlimited
- command_setwarp_$1
- command_removewarp_bypass
- command_counter_autojoin
- command_tpa_warmupbypass
- command_tpahere_warmupbypass
- command_home_bypassprivate
- command_homes_range
- command_sethome_unlimited
- command_sethome_$1
- command_sethome_customloc
- command_sethome_iconpicker
- command_sethome_iconpickeroncreation
- command_sethome_overwrite
- command_sethome_bypass
- command_sethome_bypasslimit
- command_mail_read
- command_mail_clear
- command_mail_send
- command_mail_sendtemp
- command_itemlore_modification
- command_glow_color_$1
- command_walkspeed_$1
- command_tptoggle_bypass
- command_sudo_bypass
- command_repair_repairshare_bypass
- command_repair_bypass
- command_nick_bypassblacklist
- command_nick_bypass_length
- command_nick_bypassinuse
- command_nick_different
- command_msg_clean
- command_msg_noreply
- command_ignore_bypass
- command_silence_bypass
- command_more_oversize
- command_recipe_admin
- command_recipe_custom
- command_list_admin
- command_list_staff
- command_list_hidden
- command_list_group_$1
- command_checkban_seereason
- command_mirror_nodeduct
- command_lfix_admin
- command_commandspy_hide
- command_commandspy_bypass
- command_signspy_hide
- command_socialspy_hide
- command_mute_max_$1
- command_mute_bypass
- command_mutechat_bypass
- command_money_admin
- command_money_betweenworldgroups
- command_time_$1
- command_weather_$1
- command_weather_$1_$2
- command_pweather_$1
- command_back_ondeath
- command_back_worldbypass
- command_flightcharge_admin
- command_kick_bypass
- command_ride_$1
- command_sit_stairs
- command_sit_persistent
- command_sit_location
- command_maintenance_bypass
- command_alert_inform
- command_helpop_inform
- command_fly_safelogin
- command_cuff_bypass
- command_jail_bypasscmd
- command_jail_bypass
- command_jail_maxtime_$1
- command_near_hide
- command_near_max_$1
- command_tpa_max_$1
- command_tpahere_max_$1
- command_silent
- command_warn_bypass
- command_ban_bypass
- command_banip_bypass
- command_tempban_bypass
- command_tempban_max_unlimited
- command_tempban_max_$1
- command_broadcast_colors
- command_broadcast_clean
- command_charges_edit
- command_checkaccount_showip
- command_info_ip
- command_info_pos
- command_info_bed
- command_info_back
- command_info_deathlocation
- command_clearchat_bypass
- command_counter_force
- command_counter_time
- command_counter_range
- command_counter_center
- command_counter_msg
- command_ctext_$1
- command_flyspeed_$1
- command_shoot_$1
- command_chat_kick
- command_chat_see
- command_chat_force
- command_chat_create
- command_chat_create_private
- command_chat_create_locked
- command_chat_leave_locked
- command_chat_create_persistent
- command_chat_invite
- command_chat_joinbypass
- command_chat_seebypass
- command_chat_list
- command_chat_listrooms
- customalias_$1
- command_repair
- command_$1

Methods:
- String getPermission()
- String getPermission(String[] extra)
- **static** PermissionsManager$CMIPerm valueOf(String name)
- String[] getWars()
- boolean hasSetPermission(CommandSender sender, String[] extra)
- boolean hasSetPermission(CommandSender sender, boolean inform, String[] extra)
- **static** boolean hasSetPermission(CommandSender sender, String perm, boolean inform)
- **static** PermissionsManager$CMIPerm[] values()
- PermissionInfo getPermissionInfo(Player player, String[] extra)
- void setShow(Boolean show)
- String getCleanPermissionForShow()
- Boolean getShow()
- boolean hasPermission(CommandSender sender)
- boolean hasPermission(CommandSender sender, Integer[] extra)
- boolean hasPermission(CommandSender sender, String[] extra)
- boolean hasPermission(CommandSender sender, Long delay, String[] extra)
- boolean hasPermission(CommandSender sender, boolean inform, String[] extra)
- boolean hasPermission(CommandSender sender, boolean inform, boolean informConsole, String[] extra)
- boolean hasPermission(CommandSender sender, boolean inform, Long delayInMiliSeconds)
- boolean hasPermission(CommandSender sender, boolean inform, boolean informConsole, Long delay, String[] extra)
- **static** boolean hasPermission(CommandSender sender, String permision, Boolean output)
- **static** boolean hasPermission(CommandSender sender, String permision, Boolean output, boolean informConsole)
- String getPermissionForShow()
- String getPermissionForShow(boolean cmd)
- String getDesc()
- void setDesc(String desc)
- void setWars(String[] wars)

### Class: com.Zrips.CMI.Modules.Permissions.UltraPermissions3Handler
Type: Class
Implements: com.Zrips.CMI.Modules.Permissions.PermissionInterface

Methods:
- String getPrefix(Player player)
- String getPrefix(UUID uuid)
- String getMainGroup(Player player)
- String getMainGroup(String world, UUID uuid)
- String getSufix(Player player)
- String getSufix(UUID uuid)
- String getNameColor(Player player)

### Class: com.Zrips.CMI.Modules.Permissions.VaultHandler
Type: Class
Implements: com.Zrips.CMI.Modules.Permissions.PermissionInterface

Constructors:
- VaultHandler(CMI plugin)

Methods:
- String getPrefix(Player player)
- String getPrefix(UUID uuid)
- String getMainGroup(Player player)
- String getMainGroup(String world, UUID uuid)
- String getSufix(Player player)
- String getSufix(UUID uuid)
- String getNameColor(Player player)

### Class: com.Zrips.CMI.Modules.Permissions.ZPermissionsHandler
Type: Class
Implements: com.Zrips.CMI.Modules.Permissions.PermissionInterface

Methods:
- String getPrefix(Player player)
- String getPrefix(UUID uuid)
- String getMainGroup(Player player)
- String getMainGroup(String world, UUID uuid)
- String getSufix(Player player)
- String getSufix(UUID uuid)
- String getNameColor(Player player)

## Package: com.Zrips.CMI.Modules.Placeholders

### Class: com.Zrips.CMI.Modules.Placeholders.MVdWPlaceholderAPIHook
Type: Class

Methods:
- **static** boolean hook(CMI plugin)

### Class: com.Zrips.CMI.Modules.Placeholders.Placeholder
Type: Class

Constructors:
- Placeholder(CMI plugin)

Methods:
- String getValue(Player player, Placeholder$CMIPlaceHolders placeHolder)
- String getValue(Player player, Placeholder$CMIPlaceHolders placeHolder, String value)
- String getValue(UUID uuid, Placeholder$CMIPlaceHolders placeHolder, String value)
- List<String> updatePlaceHolders(Player player, List<String> messages)
- String updatePlaceHolders(UUID uuid, String message)
- String updatePlaceHolders(String message)
- String updatePlaceHolders(Player player, String message)
- boolean containsPlaceHolder(String msg)
- String translatePAPIPlaceHolder(Player player, Placeholder$CMIPlaceHolders place, String group)
- Placeholder$CMIPlaceholderType getPlaceHolderType(Player player, String placeholder)
- String replacePlaceHolders(String msg, String with)
- String translateOwnPlaceHolder(Player player, String message)
- String translateOwnPlaceHolder(UUID uuid, String message)
- boolean hasMetaValue(CMIUser user, String key)
- String coolDownPlaceHolders(String msg, Player player)
- String coolDownPlaceHolders(String msg)

### Class: com.Zrips.CMI.Modules.Placeholders.Placeholder$CMIPlaceHolders
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- cmi_user_charges_left
- cmi_user_charges_max
- cmi_user_charges_time
- cmi_user_charges_cooldown
- cmi_user_display_name
- cmi_p_$1_display_name
- cmi_user_cleannickname
- cmi_user_nickname
- cmi_user_name
- cmi_user_uuid
- cmi_user_uuid_$1
- cmi_user_deathloc
- cmi_user_backloc
- cmi_user_cuffed
- cmi_p_$1_cuffed
- cmi_user_muted
- cmi_p_$1_muted
- cmi_user_inpvp
- cmi_user_god
- cmi_p_$1_god
- cmi_user_sneaking
- cmi_user_mail_count
- cmi_user_warning_count
- cmi_user_warning_points
- cmi_user_afk
- cmi_user_afk_symbol
- cmi_user_afk_msg
- cmi_user_afk_for
- cmi_user_afk_in
- cmi_user_spy
- cmi_user_cmdspy
- cmi_user_signspy
- cmi_user_joinedcounter
- cmi_user_banned
- cmi_p_$1_banned
- cmi_user_maxhomes
- cmi_user_homeamount
- cmi_user_homelist
- cmi_user_missingexp
- cmi_user_missingexpp
- cmi_user_exp
- cmi_user_expp
- cmi_user_totalexp
- cmi_user_level
- cmi_user_ping
- cmi_user_gamemode
- cmi_user_op
- cmi_user_pweather
- cmi_user_weather
- cmi_user_weatherduration
- cmi_user_canfly
- cmi_user_flying
- cmi_user_vanished_symbol
- cmi_user_balance_formated
- cmi_user_balance_formatted
- cmi_user_balance
- cmi_user_prefix
- cmi_user_suffix
- cmi_user_group
- cmi_user_nameplate_prefix
- cmi_user_nameplate_suffix
- cmi_user_tfly
- cmi_user_tfly_formated
- cmi_user_tfly_formatted
- cmi_user_flightcharge
- cmi_user_tgod
- cmi_user_tgod_formated
- cmi_user_tgod_formatted
- cmi_user_votecount
- cmi_user_dailyvotecount
- cmi_user_chatcolor
- cmi_user_rank
- cmi_user_rank_displayname
- cmi_user_rank_name
- cmi_user_nextranks
- cmi_user_nextrankpercent
- cmi_user_nextvalidranks
- cmi_user_canrankup
- cmi_user_country
- cmi_user_country_code
- cmi_user_city
- cmi_user_name_colorcode
- cmi_user_glow_code
- cmi_user_glow_name
- cmi_user_jailed
- cmi_p_$1_jailed
- cmi_user_jailname
- cmi_p_$1_jailname
- cmi_user_jailcell
- cmi_p_$1_jailcell
- cmi_user_jailtime
- cmi_p_$1_jailtime
- cmi_user_jailreason
- cmi_p_$1_jailreason
- cmi_user_jailedby
- cmi_p_$1_jailedby
- cmi_user_riding
- cmi_user_beingriddenby
- cmi_user_bungeeserver
- cmi_user_rt_cooldown
- cmi_user_rt_cooldown_$1
- cmi_user_playtime_formatted
- cmi_user_playtime_days
- cmi_user_playtime_dayst
- cmi_user_playtime_hours
- cmi_user_playtime_hoursf
- cmi_user_playtime_hourst
- cmi_user_playtime_minutes
- cmi_user_playtime_minutest
- cmi_user_playtime_seconds
- cmi_user_playtime_secondst
- cmi_user_prewards_count
- cmi_user_world_formatted
- cmi_user_online
- cmi_p_$1_online
- cmi_user_itemcount_$1
- cmi_user_maxperm_$1_$2
- cmi_user_toggle_$1
- cmi_user_togglename_$1
- cmi_user_holo_page_$1
- cmi_equation_$1
- cmi_equationint_$1
- cmi_color_$1
- cmi_iteminhand_displayname
- cmi_iteminhand_realname
- cmi_iteminhand_type
- cmi_iteminhand_itemdata
- cmi_iteminhand_amount
- cmi_iteminhand_durability
- cmi_iteminhand_maxdurability
- cmi_iteminhand_custommodeldata
- cmi_iteminhand_worth
- cmi_iteminhand_worth_one
- cmi_iteminhand_worthc
- cmi_iteminhand_worthc_one
- cmi_schedule_nextin_$1
- cmi_schedule_endat_$1
- cmi_baltop_name_$1
- cmi_baltop_money_$1
- cmi_baltop_shortmoney_$1
- cmi_playtimetop_name_$1
- cmi_playtimetop_time_$1
- cmi_votetop_$1
- cmi_votetopcount_$1
- cmi_worth_buy_$1
- cmi_worth_sell_$1
- cmi_worthc_buy_$1
- cmi_worthc_sell_$1
- cmi_bungee_total_$1
- cmi_bungee_current_$1
- cmi_bungee_motd_$1
- cmi_bungee_onlinestatus_$1
- cmi_tps_1
- cmi_tps_60
- cmi_tps_300
- cmi_tps_$1_colored
- cmi_tps_$1
- cmi_random_player_name
- cmi_lastrandom_player_name
- cmi_random_$1_$2
- cmi_lastrandom_$1
- cmi_user_rank_percent_$1
- cmi_user_meta_$1
- cmi_user_metaint_$1
- cmi_chatmute_time
- cmi_chatmute_reason
- cmi_user_baltop
- cmi_user_stats_$1
- cmi_user_kitcd_$1
- cmi_user_kit_available
- cmi_user_kit_available_$1
- cmi_user_kit_hasaccess_$1
- cmi_jail_time_$1_$2
- cmi_jail_username_$1_$2
- cmi_jail_reason_$1_$2
- cmi_weather_$1
- cmi_weatherduration_$1
- cmi_afk_count
- cmi_maintenance_state
- cmi_maintenance_message
- cmi_chat_range
- cmi_server_uptime
- cmi_server_uptime_seconds
- cmi_server_worlds
- cmi_server_vanished
- cmi_server_users
- player_world
- cmi_player_world
- player_x
- cmi_player_x
- player_y
- cmi_player_y
- player_z
- cmi_player_z
- player_biome
- cmi_player_biome
- vault_eco_balance_formatted
- server_online
- cmi_server_online
- server_max_players
- cmi_server_max_players
- server_online_$1
- cmi_server_online_$1
- server_unique_joins
- cmi_server_unique_joins
- onlineplayers_names
- cmi_onlineplayers_names
- onlineplayers_displaynames
- cmi_onlineplayers_displaynames
- server_time_$1_$2
- cmi_server_time_$1_$2
- server_time_$1
- cmi_server_time_$1
- world_time12_$1
- cmi_world_time12_$1
- world_time24_$1
- cmi_world_time24_$1

Methods:
- List<String> getComplexRegexMatchers(String text)
- List<String> getComplexValues(String text)
- **static** Placeholder$CMIPlaceHolders valueOf(String name)
- **static** Placeholder$CMIPlaceHolders[] values()
- Object getCachedValue(UUID uuid)
- String getDescription()
- **static** Placeholder$CMIPlaceHolders getByNameExact(String name)
- boolean isHidden()
- String getMVdW()
- boolean isCache()
- void setRule(ChatFilterRule rule)
- void addCachedValue(UUID uuid, String value, int validForMiliSeconds)
- Placeholder$CMIPlaceHolders getUserRedirect()
- ChatFilterRule getRule()
- **static** Placeholder$CMIPlaceHolders getByName(String name)
- String getFull()
- **static** int getCount()
- boolean isComplex()

### Class: com.Zrips.CMI.Modules.Placeholders.Placeholder$CMIPlaceholderType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CMI
- PAPI
- MVdW

Methods:
- **static** Placeholder$CMIPlaceholderType valueOf(String name)
- **static** Placeholder$CMIPlaceholderType[] values()

### Class: com.Zrips.CMI.Modules.Placeholders.PlaceholderCache
Type: Class

Methods:
- String getValue()
- void setValidUntil(long validUntil)
- long getValidUntil()
- void setValue(String value)

## Package: com.Zrips.CMI.Modules.PlayTime

### Class: com.Zrips.CMI.Modules.PlayTime.CMIPlayDay
Type: Class

Constructors:
- CMIPlayDay(CMIUser user, int date)

Methods:
- void updatePlayTime()
- void setId(Integer id)
- void setHourPlaytime(int hour, Long playTime, boolean overTime)
- Integer getId()
- int getDate()
- void checkPreviousHour(int hour)
- Long getCurrentHourPlaytime()
- void setLastUpdate(Long lastUpdate)
- long getLastUpdate()
- Long getHourPlaytime(int hour)
- Long getTotalTime()

### Class: com.Zrips.CMI.Modules.PlayTime.CMIPlayTime
Type: Class

Constructors:
- CMIPlayTime(CMIUser user)

Methods:
- Set<CMIPlayDay> getForSave()
- Long getTotalPlayTime()
- void addDayForSave(CMIPlayDay playDay)
- Long getPlayTime(PlayTimeManager$PlaytimeRange range)
- void updatePlayTime()
- void updatePlayTime(boolean checkForOnline)
- CMIPlayDay getPlayDayOfToday()
- CMIPlayDay getPlayDay(Integer date)
- TreeMap<Integer, CMIPlayDay> getDays()

### Class: com.Zrips.CMI.Modules.PlayTime.CMIPlayTimeFormat
Type: Class

Methods:
- **static** String formatPlaytimePlaceholder(long ticks)
- **static** void update()

### Class: com.Zrips.CMI.Modules.PlayTime.PlayTimeListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PlayTimeListener(CMI plugin)

Methods:
- void onPlayerMoveExtendedRnage(PlayerQuitEvent event)
- void onPlayerMoveExtendedRnage(PlayerJoinEvent event)

### Class: com.Zrips.CMI.Modules.PlayTime.PlayTimeManager
Type: Class

Constructors:
- PlayTimeManager(CMI plugin)

Methods:
- String formatDate(int date)
- CMIPlayTime getCMIPlayTime(UUID uuid)
- Integer getDaysBackDate(int i)
- void setCMIPlayTime(UUID uuid, CMIPlayTime playTime)
- void stop()
- void updatePlayTimes()

### Class: com.Zrips.CMI.Modules.PlayTime.PlayTimeManager$PlaytimeRange
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- thishour
- hourback
- today
- yesterday
- thisweek
- week
- thismonth
- month
- thisyear
- year
- total

Methods:
- boolean isDetailed()
- **static** PlayTimeManager$PlaytimeRange valueOf(String name)
- **static** PlayTimeManager$PlaytimeRange[] values()
- CMIMaterial getColor()
- void update()
- void setCache(UUID uuid, Long cache)
- void setSlot(int slot)
- int getSlot()
- Long getCache(UUID uuid)
- void setColor(CMIMaterial color)
- **static** PlayTimeManager$PlaytimeRange getByName(String name)
- void setCacheLastUpdate(UUID uuid, Integer cacheLastUpdate)
- Integer getCacheLastUpdate(UUID uuid)
- Integer getStartTime()

## Package: com.Zrips.CMI.Modules.PlayTimeRewards

### Class: com.Zrips.CMI.Modules.PlayTimeRewards.PTROneTime
Type: Class
Extends: com.Zrips.CMI.Modules.PlayTimeRewards.PlayTimeReward

Constructors:
- PTROneTime(String name)

Methods:
- Long getPayFor()
- void setPayFor(Long payFor)

### Class: com.Zrips.CMI.Modules.PlayTimeRewards.PTRRepeat
Type: Class
Extends: com.Zrips.CMI.Modules.PlayTimeRewards.PlayTimeReward

Constructors:
- PTRRepeat(String name)

Methods:
- Long getPayEvery()
- void setPayEvery(Long payEvery)
- void setStackRewards(boolean stackRewards)
- boolean isStackRewards()

### Class: com.Zrips.CMI.Modules.PlayTimeRewards.PlayTimeReward
Type: Class

Constructors:
- PlayTimeReward(String name)

Methods:
- void setName(String name)
- V setCommands(List<String> commands)
- void setAutoClaim(boolean autoClaim)
- String getName()
- void setRange(Long range)
- String getDisplayName()
- Long getRange()
- boolean isAutoClaim()
- void performCommands(Player player)
- V setDescription(List<String> description)
- void setDisplayName(String displayName)
- List<String> getDescription()
- List<String> getCommands()

### Class: com.Zrips.CMI.Modules.PlayTimeRewards.PlayTimeRewardsListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PlayTimeRewardsListener(CMI plugin)

No public methods found

### Class: com.Zrips.CMI.Modules.PlayTimeRewards.PlayTimeRewardsManager
Type: Class

Constructors:
- PlayTimeRewardsManager(CMI plugin)

Methods:
- V setRepeatableRewards(HashMap<String, PTRRepeat> repeatableRewards)
- V setOneTimeRewards(TreeMap<Long, PTROneTime> oneTimeRewards)
- int getClaimableRewardCount(CMIUser user)
- Long getAfkAction(CMIUser user)
- void loadConfig()
- void removeFromAfkAction(CMIUser user)
- PTRRepeat getRepeatingRewardByName(String name)
- int getOneTimeAmount()
- void clearCache(UUID uuid)
- void informPlayer(Player player, String rewardName)
- HashMap<String, PTRRepeat> getRepeatableRewards()
- boolean isExcludeAfk()
- void load()
- void stop()
- boolean isEnabled()
- PTROneTime getOneTimeRewardByName(String name)
- TreeMap<Long, PTROneTime> getOneTimeRewards()
- void updateAfkAction(CMIUser user)
- void setOneTimeAmount(int oneTimeAmount)

### Class: com.Zrips.CMI.Modules.PlayTimeRewards.PlaytimeClaimCache
Type: Class

Methods:
- void setLastUpdate(long lastUpdate)
- long getLastUpdate()
- int getCount()
- void setCount(int count)

## Package: com.Zrips.CMI.Modules.PlayerCombat

### Class: com.Zrips.CMI.Modules.PlayerCombat.CMIPlayerCombat
Type: Class

Methods:
- void setGotLastDamageAt(Long gotLastDamageAt)
- void setGotLastDamageFromMob(Long gotLastDamageFromEntity)
- void setDidLastDamageToPlayer(Long didLastDamageToPlayer)
- boolean isInCombatWithMob()
- long getGotLastDamageFromPlayer()
- long getLeftCombatTime()
- Long getGotLastDamageAt()
- boolean isInCombat()
- long getGotLastDamageFromMob()
- void setGotLastDamageFromPlayer(Long gotLastDamageFromPlayer)
- void setDidLastDamageToMob(Long didLastDamageToEntity)
- boolean isInCombatWithPlayer()

### Class: com.Zrips.CMI.Modules.PlayerCombat.CombatDamageType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Player
- Mob
- Environmental

Methods:
- **static** CombatDamageType valueOf(String name)
- **static** CombatDamageType[] values()

### Class: com.Zrips.CMI.Modules.PlayerCombat.EntityHeadDrop
Type: Class

Constructors:
- EntityHeadDrop(CMIEntityType type)

Methods:
- void setBaseDropChance(double baseDropChance)
- CMIEntityType getType()
- void addHead(String texture, Double chance)
- V setHeads(HashMap<String, Double> heads)
- ItemStack getHead()
- ItemStack getHead(Entity ent)
- ItemStack getHead(Player player, Entity ent)
- double getBaseLowerAmount()
- double getBaseDropChance()
- HashMap<String, Double> getHeads()
- void setBaseLowerAmount(double baseLowerAmount)

### Class: com.Zrips.CMI.Modules.PlayerCombat.EntityKillCount
Type: Class

Constructors:
- EntityKillCount(EntityType type)

Methods:
- void addHeadDropCount()
- Long getLastKill()
- void setKills(int kills)
- void setHeadDropCount(int headDropCount)
- void setLastKill(Long lastKill)
- int getHeadDropCount()
- int addKill()
- int getKills()

### Class: com.Zrips.CMI.Modules.PlayerCombat.HeadContainerListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- HeadContainerListener(CMI plugin)

Methods:
- void onBlockPlaceEvent(BlockPlaceEvent event)
- void onBlockBreakEvent(BlockBreakEvent event)

### Class: com.Zrips.CMI.Modules.PlayerCombat.HeadDropListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- HeadDropListener(CMI plugin)

Methods:
- void onEntityDeath(EntityDeathEvent event)
- void onPlayerDeath(EntityDeathEvent event)
- void BlockBreakEvent(BlockBreakEvent event)
- void PlayerCombatEvent(EntityDamageEvent event)

### Class: com.Zrips.CMI.Modules.PlayerCombat.PlayerCombatListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PlayerCombatListener(CMI plugin)

Methods:
- void PlayerPreCombatEvent(EntityDamageEvent event)
- void entityCombatEvent(EntityDamageEvent event)
- void CMIPvEEndEventAsync(CMIPvEEndEventAsync event)
- void CMIPvPStartEventAsync(CMIPvPStartEventAsync event)
- void CMIPvPStartEventAsync(CMIPvEStartEventAsync event)
- void PlayerQuitEvent(PlayerQuitEvent event)
- void playerDamageEvent(EntityDamageEvent event)
- void CMIPvPEndEventAsync(CMIPvPEndEventAsync event)
- void PlayerJoinEvent(PlayerJoinEvent event)
- void onPlayerDeath(EntityDeathEvent event)
- void onSplashPotion(PotionSplashEvent event)
- void playerDamageByEntityCombatEvent(EntityDamageEvent event)
- void onPlayerMove(PlayerCommandPreprocessEvent event)
- void PlayerCombatEvent(EntityDamageEvent event)
- void PlayerForceCombatEvent(EntityDamageEvent event)
- void entityPreCombatEvent(EntityDamageEvent event)

### Class: com.Zrips.CMI.Modules.PlayerCombat.PlayerCombatManager
Type: Class

Constructors:
- PlayerCombatManager(CMI plugin)

Methods:
- long getLeftCombatTime(UUID uuid)
- Long getGotLastDamageAt(UUID uuid)
- HashMap<EntityType, EntityHeadDrop> getEntityHeadDropChance()
- void setGotLastDamageFromPlayer(UUID uuid, Long gotLastDamageFromPlayer)
- void clearCache(UUID uuid)
- void setDidLastDamageToEntity(UUID uuid, Long didLastDamageToMob)
- int getCombatTimer()
- Boolean isDropPlayerHead()
- boolean isPlayerShowBossBar()
- boolean isAllowedPlayerCommand(String command)
- double getLowerChanceWithEachKill()
- boolean isAllowedMobCommand(String command)
- void setGotLastDamageFromMob(UUID uuid, Long gotLastDamageFromMob)
- Boolean isPVENoGodDamageInform()
- boolean isMaintainName()
- boolean isPDisableFallDamage()
- List<String> getMobWorlds()
- boolean isMaintainEnchants()
- void setGotLastDamageAt(UUID uuid, Long gotLastDamageAt)
- boolean isPvPIncludeVictim()
- Boolean isMDisableFlight()
- ItemStack tryToGetEntityHead(EntityType type)
- ItemStack tryToGetEntityHead(Player player, Entity ent)
- HashMap<UUID, PlayerKillCount> getKills(UUID uuid)
- boolean isMobIncludeEnvironment()
- List<String> getPlayerWorlds()
- HashMap<Integer, Double> getLootPlayerBonus()
- double getPlayerDropHeadPercentage()
- void setCombatTimer(int combatTimer)
- void stop()
- Boolean isPDisableFlight()
- HashMap<Integer, Double> getLootMobBonus()
- boolean isMobShowDamageNumbers()
- void addPlayerIntoCombat(CMIUser user)
- boolean isMobBlockCommands()
- boolean isPlayerShowDamageNumbers()
- boolean isInCombatWithMob(UUID uuid)
- Long getGotLastDamageFromPlayer(UUID uuid)
- double getEntityDropHeadPercentage(EntityType type)
- void loadHeads()
- void loadConfig()
- void showDamageNumber(Player player, Double damage, Location loc, boolean isPlayer)
- void show(Player player, String text, Location loc)
- Boolean isPVENoGodDamage()
- boolean isMDisableFallDamage()
- double getEntityHeadDropChanceLowering(EntityType type)
- boolean isPvEIncludeVictim()
- void setDidLastDamageToPlayer(UUID uuid, Long didLastDamageToPlayer)
- boolean isMobShowBossBar()
- Boolean isDropEntityHead()
- Boolean isPVPNoGodDamageInform()
- HashMap<EntityType, EntityKillCount> getEntityKills(UUID uuid)
- void addPlayerIntoMobCombat(CMIUser user)
- Boolean isPVPNoGodDamage()
- boolean isSafeZoneDamage()
- Long getGotLastDamageFromMob(UUID uuid)
- boolean isPlayerBlockCommands()
- List<String> getPlayerHeadLore()
- void removePlayerFromCombat(CMIUser user)
- boolean isMaintainLore()
- boolean isInCombatWithPlayer(UUID uuid)

### Class: com.Zrips.CMI.Modules.PlayerCombat.PlayerKillCount
Type: Class

Constructors:
- PlayerKillCount(UUID uuid)

Methods:
- void addHeadDropCount()
- Long getLastKill()
- void setKills(int kills)
- void setHeadDropCount(int headDropCount)
- void setLastKill(Long lastKill)
- int getHeadDropCount()
- int addKill()
- int getKills()

## Package: com.Zrips.CMI.Modules.PlayerMeta

### Class: com.Zrips.CMI.Modules.PlayerMeta.PlayerMeta
Type: Class

Methods:
- void add(String key, String value, String defaultV)
- void add(String key, String value)
- **static** PlayerMeta getMetaRaw(UUID uuid)
- String getValue(String key)
- HashMap<String, String> getMapForSave()
- boolean containsValues()
- **static** PlayerMeta getMeta(UUID uuid)
- HashMap<String, PlayerMeta$metaValues> getMap()
- void remove(String key)

### Class: com.Zrips.CMI.Modules.PlayerMeta.PlayerMeta$metaValues
Type: Class

Constructors:
- PlayerMeta$metaValues(PlayerMeta this$0)
- PlayerMeta$metaValues(PlayerMeta this$0, String value)

Methods:
- String getValue()
- void setValue(String value)

## Package: com.Zrips.CMI.Modules.PlayerOptions

### Class: com.Zrips.CMI.Modules.PlayerOptions.PlayerOption
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- visibleHolograms
- shiftSignEdit
- totemBossBar
- bossBarCompass
- tagSound
- chatSpy
- cmdSpy
- signSpy
- acceptingPM
- acceptingTPA
- acceptingMoney
- chatbubble
- pmSound
- rideMe
- pveDamageNumbers
- pvpDamageNumbers
- InformDurability
- receivePets

Methods:
- **static** String toDefaultValueString()
- int getUISlot()
- **static** PlayerOption valueOf(String name)
- void setGlobalEnabled(boolean globalEnabled)
- **static** PlayerOption[] values()
- Version getVersionFrom()
- ItemStack getIcon()
- void setIcon(ItemStack icon)
- boolean isGlobalEnabled()
- **static** PlayerOption get(String name)
- boolean isEnabled()
- String getDesc()
- **static** String toString(HashMap<PlayerOption, Boolean> map)
- void setDesc(String desc)
- **static** HashMap<PlayerOption, Boolean> fromString(String line)

### Class: com.Zrips.CMI.Modules.PlayerOptions.PlayerOptionsManager
Type: Class

Constructors:
- PlayerOptionsManager(CMI plugin)

Methods:
- void loadConfig()
- void openOptionGUI(CMIUser user)
- void openOptionGUI(Player sender, CMIUser user)

## Package: com.Zrips.CMI.Modules.Portals

### Class: com.Zrips.CMI.Modules.Portals.CMIPlane
Type: Class

Constructors:
- CMIPlane(Vector center, CMIVector2D sizeMin, CMIVector2D sizeMax)

Methods:
- CMIVector2D getSizeMax()
- void setSizeMin(CMIVector2D sizeMin)
- Vector getCenter()
- CMIVector2D getSizeMin()
- void setCenter(Vector center)
- void setSizeMax(CMIVector2D sizeMax)

### Class: com.Zrips.CMI.Modules.Portals.CMIPlaneIntersection
Type: Class

Methods:
- **static** double xPosYaw(double time, double, double radius)
- **static** double yPosYaw(double time, double)
- **static** CompletableFuture<CMIPlaneIntersection> get(Vector rayVector, Vector rayPoint, Vector planeNormal, CMIPlane plane)
- **static** double zPosYaw(double time, double, double radius)
- void setLocalLoc(CMIVector2D localLoc)
- **static** CMIVector3D rotateAroundCenter(double lx, double, double ly, double)
- void setGlobalLoc(CMIVector3D globalLoc)
- CMIVector3D getGlobalLoc()
- CMIVector2D getLocalLoc()

### Class: com.Zrips.CMI.Modules.Portals.CMIPortal
Type: Class

Methods:
- void setParticleAmount(int particleAmount)
- World getWorld()
- String getName()
- void setPerformCommandsWithoutTp(boolean performCommandsWithoutTp)
- boolean isRequiresPermission()
- List<String> getCommands()
- List<String> getCommands(Player player)
- void setBungeeLocation(String bungeeLocation)
- boolean isShowParticles()
- void setTpLoc(Location tpLoc)
- boolean isKickBack()
- V setCommands(List<String> commands)
- CMIPortal setEffectColor(Color color)
- boolean checkCollision(CuboidArea area)
- void setToExactBungeeLocation(boolean toExactBungeeLocation)
- CMIEffect getCMIEffect()
- boolean isParticlesByPermission()
- Location getSafeLoc()
- void setEnabled(boolean enabled)
- void setActivationRange(int activationRange)
- boolean isEnabled()
- CMIEffectManager$CMIParticle getEffect()
- void setBungeeServer(String bungeeServer)
- void setWorld(World world)
- void setName(String name)
- void setShowParticles(boolean showParticles)
- void setParticlesByPermission(boolean particlesByPermission)
- void setPercentToHide(int percentToHide)
- void setArea(CuboidArea area, boolean recalculatePart)
- boolean teleport(Player player)
- boolean containsLoc(Location loc)
- boolean containsLoc(Location loc, int range)
- boolean isToExactBungeeLocation()
- int getActivationRange()
- void setCMIEffect(CMIEffect cmiEffect)
- void setSafeLoc(Location safeLoc)
- void setWorldName(String worldName)
- String getWorldName()
- Set<UUID> getParticleForPlayers()
- void setRequiresPermission(boolean requiresPermission)
- Location getTpLoc()
- boolean getPerformCommandsWithoutTp()
- void setKickBack(boolean kickBack)
- void setEffect(CMIEffectManager$CMIParticle effect)
- CuboidArea loadBounds(String root) throws Exception
- String getBungeeServer()
- Set<UUID> updateParticleLimitations(Player player)
- Set<UUID> removeParticleLimitations(Player player)
- Set<UUID> removeParticleLimitations(UUID uuid)
- Location loadTpLoc(Object root) throws Exception
- boolean isInformOnMissingPerm()
- String getBungeeLocation()
- V setParticleForPlayers(Set<UUID> particleForPlayers)
- void setInformOnMissingPerm(boolean informOnMissingPerm)
- int getPercentToHide()
- CuboidArea getArea()
- int getParticleAmount()

### Class: com.Zrips.CMI.Modules.Portals.CMIVector2D
Type: Class

Constructors:
- CMIVector2D(Vector v)
- CMIVector2D(double x, double y)

Methods:
- CMIVector2D minus(CMIVector2D v)
- CMIVector2D minus(Vector v)
- void setY(double y)
- double getX()
- CMIVector2D times(double s)
- double getY()
- void setX(double x)
- double dot(CMIVector2D v)
- String toString()
- CMIVector2D plus(CMIVector2D v)

### Class: com.Zrips.CMI.Modules.Portals.CMIVector3D
Type: Class

Constructors:
- CMIVector3D(Vector v)
- CMIVector3D(double x, double y, double z)

Methods:
- CMIVector3D add(CMIVector3D other)
- CMIVector3D minus(CMIVector3D v)
- CMIVector3D minus(Vector v)
- CMIVector3D setY(double y)
- CMIVector3D setX(double x)
- CMIVector3D cross(CMIVector3D other)
- double dot(CMIVector3D v)
- CMIVector3D scale(double scaleFactor)
- Location toLocation(World world)
- CMIVector3D setZ(double z)
- CMIVector3D plus(CMIVector3D v)
- double getX()
- CMIVector3D times(double s)
- double getY()
- double getZ()
- CMIVector3D normalize()
- String toString()
- CMIVector3D multiply(double scalar)

### Class: com.Zrips.CMI.Modules.Portals.CuboidArea
Type: Class

Constructors:
- CuboidArea(World world, Vector startLoc, Vector endLoc)
- CuboidArea(CMILocation startLoc, CMILocation endLoc)
- CuboidArea(Location startLoc, Location endLoc)
- CuboidArea(World world)

Methods:
- World getWorld()
- Location getMiddleLocation()
- void setPoint(Vector vector)
- boolean shift(Player player, double amount)
- boolean shift(CuboidArea$Direction d, double amount)
- void setArea(CuboidArea area)
- boolean containsLoc(Location loc)
- boolean containsLoc(Vector vector)
- boolean containsLoc(Location loc, int extraRange)
- boolean containsLoc(Vector vector, int extraRange)
- Vector getLowPoint()
- int getYSize()
- void setHighLocation(Location highLocation)
- Location getOutsideFreeLoc()
- void setLowPoint(Vector lowPoint)
- String getWorldName()
- boolean valid()
- void setHighPoint(Vector highLocation)
- Vector getHighPoint()
- void setLocation(Location location)
- Location getHighLoc()
- Vector getMiddlePoint()
- int getZSize()
- boolean checkCollision(CuboidArea area)
- boolean contract(Player player, double amount)
- boolean contract(CuboidArea$Direction d, double amount)
- List<CuboidArea$ChunkRef> getChunks()
- List<CuboidArea$ChunkRef> getChunks(int range)
- void setLowLocation(Location lowLocation)
- boolean expand(Player player, double amount)
- boolean expand(CuboidArea$Direction d, double amount)
- long getSize()
- boolean isAreaWithinArea(CuboidArea area)
- Location getLowLoc()
- CuboidArea clone()
- Object clone() throws CloneNotSupportedException
- String toString()
- void setWorld(World world)
- int getXSize()

### Class: com.Zrips.CMI.Modules.Portals.CuboidArea$ChunkRef
Type: Class

Constructors:
- CuboidArea$ChunkRef(Location loc)
- CuboidArea$ChunkRef(int x, int z)

Methods:
- int hashCode()
- boolean equals(Object obj)
- **static** int getChunkCoord(int val)
- String toString()

### Class: com.Zrips.CMI.Modules.Portals.CuboidArea$Direction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UP
- DOWN
- PLUSX
- PLUSZ
- MINUSX
- MINUSZ

Methods:
- **static** CuboidArea$Direction valueOf(String name)
- **static** CuboidArea$Direction[] values()

### Class: com.Zrips.CMI.Modules.Portals.PortalListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PortalListener(CMI plugin)

Methods:
- void onPlayerJoinEvent(PlayerJoinEvent event)
- void onPlayerMove(PlayerMoveEvent event)
- void onPlayerMoveExtendedRnage(PlayerTeleportEvent event)
- void onPlayerQuitEvent(PlayerQuitEvent event)
- void onVehicleMove(VehicleMoveEvent event)
- void onVehicleMove(VehicleEnterEvent event)
- void onPlayerMoveExtendedRange(PlayerMoveEvent event)

### Class: com.Zrips.CMI.Modules.Portals.PortalManager
Type: Class

Constructors:
- PortalManager(CMI plugin)

Methods:
- void savePortals()
- void addLastPortalInRange(CMIPortal portal, UUID uuid)
- void loadConfig()
- void addPortal(CMIPortal portal)
- V loadMap(String world, Map<String, Object> root) throws Exception
- Set<CMIPortal> getByLocExtended(Location loc)
- CMIPortal getByLoc(Location loc)
- List<String> getCommandsOnTeleport()
- void load()
- void addNearPortal(UUID uuid, CMIPortal portal)
- CMIPortal getByName(String name)
- boolean isNearPortal(UUID uuid)
- Set<CMIPortal> getByLocList(Location loc)
- int getPortalsCheckParticleInterval()
- void handlePortalVisualizerUpdates()
- boolean handlePortalVisualizerUpdates(Player player, Location locfrom, Location locto)
- Map<UUID, Set<CMIPortal>> getPlayerNearPortals()
- void removeLastPortalInRange(CMIPortal portal, UUID uuid)
- void removeLastPortalInRange(UUID uuid)
- Map<CMIPortal, Set<UUID>> getLastPortalInRange()
- void forceUpdate(CMIPortal portal)
- void forceUpdate(UUID uuid, CMIPortal portal)
- void removePortal(CMIPortal portal)
- int getPortalsCheckInterval()
- void stop()
- CMIPortal collidesWithPortal(CuboidArea newarea)
- void removeNearPortal(UUID uuid, CMIPortal portal)
- void removeNearPortal(UUID uuid)
- void recalculateChunks()
- void recalculateChunks(CMIPortal portal)
- SortedMap<String, CMIPortal> getPortals()
- List<CMIPortal> getPortalsByDistance(Location loc)

### Class: com.Zrips.CMI.Modules.Portals.RandomLoc
Type: Class

Constructors:
- RandomLoc(double x, double y, double z)

Methods:
- double getX()
- double getY()
- double getZ()

## Package: com.Zrips.CMI.Modules.Ranks

### Class: com.Zrips.CMI.Modules.Ranks.AuraSkillsManager
Type: Class

Methods:
- **static** boolean isSkillCorrect(String name)
- **static** int getSkillLevel(Player player, String skillName)
- **static** String getRealSkillName(CommandSender sender, String name)

### Class: com.Zrips.CMI.Modules.Ranks.AureliumManager
Type: Class

Methods:
- **static** boolean isSkillCorrect(String name)
- **static** int getSkillLevel(Player player, String skill)
- **static** String getRealSkillName(CommandSender sender, String name)

### Class: com.Zrips.CMI.Modules.Ranks.CMIRank
Type: Class

Constructors:
- CMIRank(String name)

Methods:
- String getName()
- int getWeight()
- LinkedHashMap<String, Integer> getAureliumRequirements()
- V setMcmmoRequirements(LinkedHashMap<String, Integer> mcmmoRequirements)
- V setNextRanksT(List<String> nextRanksT)
- void setAutoRankup(boolean autoRankup)
- LinkedHashMap<StatsManager$CMIStatistic, LinkedHashMap<Object, Long>> getStatRequirements()
- List<String> getCommands()
- List<CMIRank> getNextValidRankUps(CMIUser user)
- LinkedHashMap<String, String> getPermRequirements()
- V setAuraSkillsRequirements(LinkedHashMap<String, Integer> aureliumRequirements)
- void performCommands(CMIUser user)
- LinkedHashMap<CMIItemStack, Integer> getItemRequirements()
- RankManager$rankupFailType canRankup(CMIUser user)
- CMIRank addStatRequirement(StatsManager$CMIStatistic stat, String name, Long amount)
- LinkedHashMap<String, Integer> getJobsRequirements()
- List<String> getCommandsOnRankDown()
- V setPermRequirements(LinkedHashMap<String, String> permRequirements)
- void takeMoney(CMIUser user)
- void setRankUpConfirmation(boolean rankUpConfirmation)
- V setCommands(List<String> commands)
- LinkedHashMap<String, Integer> getMcmmoRequirements()
- String getValidPreviousRanksAsString()
- LinkedHashMap<Object, Long> getStatRequirement(StatsManager$CMIStatistic stat)
- void setEnabled(boolean enabled)
- V setPlaceholderRequirements(LinkedHashMap<String, CMIRankPlaceholder> placeholderRequirements)
- double getMoneyCost()
- String getDisplayName()
- void calculateNextRanks()
- boolean isEnabled()
- void reset()
- void setName(String name)
- int getVotes()
- boolean isRankUpConfirmation()
- void finalizeRankup(CMIUser user)
- void finalizeRankup(CMIUser user, Boolean commands, Boolean cost)
- List<CMIRank> getValidPreviousRanks(CMIUser user)
- void setDisplayName(String displayName)
- boolean isOnSamePathWith(CMIRank rank2)
- LinkedHashMap<String, CMIRankPlaceholder> getPlaceholderRequirements()
- V setAureliumRequirements(LinkedHashMap<String, Integer> aureliumRequirements)
- V setCommandsOnRankDown(List<String> commandsOnRankDown)
- V setJobsRequirements(LinkedHashMap<String, Integer> jobsRequirements)
- V setItemRequirements(LinkedHashMap<CMIItemStack, Integer> itemRequirements)
- void setVotes(int votes)
- void takeItems(CMIUser user)
- void performCommandsOnRankDown(CMIUser user)
- List<CMIRank> getPreviousRanks()
- void setDefaultRank(boolean defaultRank)
- List<CMIRank> getNextRanks()
- double getExpCost()
- void setWeight(int weight)
- V setStatRequirements(LinkedHashMap<StatsManager$CMIStatistic, LinkedHashMap<Object, Long>> statRequirements)
- void setExpCost(double expCost)
- boolean isDefaultRank()
- LinkedHashMap<String, Integer> getAuraSkillsRequirements()
- boolean isAutoRankup()
- void setMoneyCost(double moneyCost)
- void takeExp(CMIUser user)

### Class: com.Zrips.CMI.Modules.Ranks.CMIRankPlaceholder
Type: Class

Constructors:
- CMIRankPlaceholder(String line)

Methods:
- Object getValue()
- void setAction(rankPlaceholderAction action)
- String getPlaceholder()
- rankPlaceholderType getType()
- void setPlaceholder(String placeholder)
- void setValue(Object value)
- String getMessage()
- rankPlaceholderAction getAction()
- void setMessage(String message)
- void setType(rankPlaceholderType type)
- double percent(Player player)

### Class: com.Zrips.CMI.Modules.Ranks.InformTimer
Type: Class

Constructors:
- InformTimer(long nextCheck)

Methods:
- Long getNextCheck()
- void resetTimesInformed()
- void setNextCheck(Long nextCheck)
- void addTimesInformed()
- Long getTimesInformed()

### Class: com.Zrips.CMI.Modules.Ranks.JobsManager
Type: Class

Methods:
- **static** String getRealJobName(String name)
- **static** int getJobsLevel(Player player, String jobName)
- **static** boolean isJobCorrect(String name)

### Class: com.Zrips.CMI.Modules.Ranks.McMMOManager
Type: Class

Methods:
- **static** boolean isSkillCorrect(String name)
- **static** int getSkillLevel(Player player, String skill)
- **static** String getRealSkillName(String name)

### Class: com.Zrips.CMI.Modules.Ranks.RankManager
Type: Class

Constructors:
- RankManager(CMI plugin)

Methods:
- HashMap<String, CMIRank> getRanks()
- HashMap<StatsManager$CMIStatistic, LinkedHashMap<Object, RankManager$rankCurrentRequirement>> getStatsRequirements(CMIUser user, CMIRank rank)
- void removeFromCheck(UUID uuid)
- Double getMoneyDonePercentage(CMIUser user, CMIRank rank)
- Double getPlaceholderDonePercentage(CMIUser user, CMIRank rank)
- Double getExpDonePercentage(CMIUser user, CMIRank rank)
- Double getMcMMODonePercentage(CMIUser user, CMIRank rank)
- void loadConfig()
- void listPermRequirements(CommandSender sender, CMIUser user, CMIRank rank)
- void listExpRequirements(CommandSender sender, CMIUser user, CMIRank rank)
- Double getStatsDonePercentage(CMIUser user, CMIRank rank)
- void listPlaceholderRequirements(CommandSender sender, CMIUser user, CMIRank rank)
- void run()
- Double getJobsDonePercentage(CMIUser user, CMIRank rank)
- boolean isStrictPermissionCheck()
- void load()
- Double getAuraSkillsDonePercentage(CMIUser user, CMIRank rank)
- Double getOverallDonePercentage(CMIUser user, CMIRank rank)
- Z removeContents(Player player, LinkedHashMap<CMIItemStack, Integer> map)
- boolean isListSamePathOnly()
- void listMcmmoRequirements(CommandSender sender, CMIUser user, CMIRank rank)
- CMIRank getDefaultRank(Player player)
- void autoRecheck()
- boolean isPermissionCheck()
- void setRank(CMIUser user, CMIRank rank)
- CMIRank recalculateRank(CMIUser user)
- boolean canRankUpAuto(CMIUser user)
- void listVoteRequirements(CommandSender sender, CMIUser user, CMIRank rank)
- void addRank(CMIRank rank)
- void listStatsRequirements(CommandSender sender, CMIUser user, CMIRank rank)
- CMIRank getRank(CMIUser user)
- CMIRank getRank(String name)
- Double getVoteDonePercentage(CMIUser user, CMIRank rank)
- Double getItemDonePercentage(CMIUser user, CMIRank rank)
- void listAureliumRequirements(CommandSender sender, CMIUser user, CMIRank rank)
- void listMoneyRequirements(CommandSender sender, CMIUser user, CMIRank rank)
- Double getAureliumDonePercentage(CMIUser user, CMIRank rank)
- CMIRank getNullRank(CMIUser user)
- String translateValue(StatsManager$CMIStatistic stat, Long value)
- void stop()
- void listItemRequirements(CommandSender sender, CMIUser user, CMIRank rank)
- void listAuraSkillsRequirements(CommandSender sender, CMIUser user, CMIRank rank)
- ParticleManager$CMIPresetAnimations getRankEffect()
- RankManager$rankupFailType canRankUp(CMIUser user, CMIRank rank)
- boolean isProgressBar()
- void listJobsRequirements(CommandSender sender, CMIUser user, CMIRank rank)
- Double getPermDonePercentage(CMIUser user, CMIRank rank)

### Class: com.Zrips.CMI.Modules.Ranks.RankManager$rankCache
Type: Class

Constructors:
- RankManager$rankCache(RankManager this$0, long time)
- RankManager$rankCache(RankManager this$0)

Methods:
- boolean timeToCheck(RankManager$rankupType type)
- Double getCache(RankManager$rankupType type)
- void setCache(RankManager$rankupType type, Double percent)

### Class: com.Zrips.CMI.Modules.Ranks.RankManager$rankCurrentRequirement
Type: Class

Constructors:
- RankManager$rankCurrentRequirement(RankManager this$0, Long need, Long have)

Methods:
- void setHave(Long have)
- void setNeed(Long need)
- Long getHave()
- Long getNeed()

### Class: com.Zrips.CMI.Modules.Ranks.RankManager$rankupFailType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Money
- Exp
- Stats
- McMMO
- Aurelium
- AuraSkills
- Jobs
- Placeholoder
- Perm
- None
- NoRank
- Items
- Votes
- SameRank

Methods:
- **static** RankManager$rankupFailType valueOf(String name)
- **static** RankManager$rankupFailType[] values()

### Class: com.Zrips.CMI.Modules.Ranks.RankManager$rankupType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Money
- Exp
- Stats
- McMMO
- Aurelium
- AuraSkills
- Jobs
- Perm
- Placeholoder
- Items
- Votes

Methods:
- **static** RankManager$rankupType valueOf(String name)
- **static** RankManager$rankupType[] values()

### Class: com.Zrips.CMI.Modules.Ranks.rankPlaceholderAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- more
- less
- equal

Methods:
- **static** rankPlaceholderAction valueOf(String name)
- **static** rankPlaceholderAction[] values()

### Class: com.Zrips.CMI.Modules.Ranks.rankPlaceholderType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- number
- string
- invalid

Methods:
- **static** rankPlaceholderType valueOf(String name)
- **static** rankPlaceholderType[] values()

## Package: com.Zrips.CMI.Modules.Recipes

### Class: com.Zrips.CMI.Modules.Recipes.RecipeManager
Type: Class

Constructors:
- RecipeManager(CMI plugin)

Methods:
- boolean removeRecipe(CMIRecipe recipe)
- V setRecipes(List<CMIRecipe> recipes)
- void loadConfig()
- CMIRecipe getByKey(String identificator)
- boolean isRecipesRequireBackwards()
- Recipe exist(Recipe recipe)
- Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, CMIRecipeIngredient> Recipe)
- Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, CMIRecipeIngredient> Recipe, CMIRecipeCraftData temp)
- Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, CMIRecipeIngredient> Recipe, CMIRecipeCraftData temp, String customKey)
- Recipe addRecipe(CMIRecipeType type, Recipe recipe)
- Recipe addRecipe(CMIRecipeType type, Recipe recipe, CMIRecipeCraftData data)
- Recipe addRecipe(CMIRecipeType type, Recipe recipe, CMIRecipeCraftData data, String customKey)
- void load()
- HashMap<String, CMIRecipe> getCustomRecipes()
- Integer getGUIRecipeResultSlot()
- boolean isRecipes4Sized()
- boolean isCustom(Recipe recipe)
- Boolean openOnlyCustomRecipeUI(Player player, int page)
- Recipe getRecipe(HashMap<Integer, ItemStack> ingredients)
- boolean isDisabled(Recipe r)
- Boolean openRecipeUI(Player player, CMIItemStack cm, int page)
- Boolean openRecipeUI(Player player, CMIItemStack cm, int page, boolean onlyCustom)
- Boolean openRecipeUI(Player player, CMIItemStack cm, int page, List<Recipe> recipes)
- Boolean openRecipeUI(Player player, int page, List<Recipe> recipes)
- List<CMIRecipe> getRecipes()

### Class: com.Zrips.CMI.Modules.Recipes.recipeInformation
Type: Class

Methods:
- void setCraftData(CMIRecipeCraftData craftData)
- String getCustomId()
- void setCustomId(String customId)
- boolean isExact()
- CMIRecipeCraftData getCraftData()
- void setExact(boolean exact)

## Package: com.Zrips.CMI.Modules.Region

### Class: com.Zrips.CMI.Modules.Region.CMIRegion
Type: Class

Constructors:
- CMIRegion(Location loc)
- CMIRegion(Chunk chunk)
- CMIRegion(int x, int z)

Methods:
- int getX()
- CMIRegion setX(int x)
- int getZ()
- String toString()
- CMIRegion setZ(int z)

### Class: com.Zrips.CMI.Modules.Region.RegionListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- RegionListener(CMI plugin)

No public methods found

### Class: com.Zrips.CMI.Modules.Region.WorldInfo
Type: Class

Constructors:
- WorldInfo(World world, CMIRegion center)
- WorldInfo(Location center, int range)

Methods:
- WorldInfo setRegionPlaces(CMIRegion region, List<Boolean> places)
- World getWorld()
- CMIRegion getCenter()
- V setRegion(Map<String, List<Boolean>> regionChunks)
- void addLastChecked()
- void setRange(Integer range)
- void setLastChecked(long lastChecked)
- void setTotalChunks(long totalChunks)
- void setCenter(CMIRegion center)
- Chunk getNextChunk(boolean exist)
- boolean allChecked()
- List<Boolean> getRegionPlaces(CMIRegion region)
- void addTotalChunks(int chunks)
- void addTotalChunks()
- Boolean getRegionsChunk(CMIRegion region, int place)
- CMIRegion getNextChunkLoc(boolean exist)
- long getLeftToScan()
- Map<String, List<Boolean>> getRegion()
- Integer getRange()
- long getLastChecked()
- V setRegionChunks(CMIRegion scord, List<Boolean> list)
- WorldInfo clone()
- Object clone() throws CloneNotSupportedException
- void setWorld(World world)
- long getNextPlace()
- long getTotalChunks()

### Class: com.Zrips.CMI.Modules.Region.WorldManager
Type: Class

Constructors:
- WorldManager(CMI plugin)

Methods:
- void loadWorldChunksInfo(World world)
- boolean stillLoading(World world)
- boolean stillLoading()
- WorldInfo fillEmpty(World world, CMIRegion center, Integer range)
- void addChunk(Chunk chunk)
- void cancelLoading()
- HashMap<String, CMIRegion> getRegionFiles(World world)
- HashMap<String, CMIRegion> getRegionFiles(CMIRegion center, Integer range)
- CMIRegion getNextInSpiral(long place)
- WorldInfo getWorldInfoFromWorld(World world)
- Chunk getNextChunk(WorldInfo info, boolean existing)
- void removeWorldInfo(World world)
- WorldInfo getWorldInfoInRange(World world, CMIVectorInt2D center, int range)
- WorldInfo getWorldInfoInRange(World world, CMIRegion center, Integer range)
- WorldInfo getWorldInfo(World world, CMIRegion center, Integer range)
- WorldInfo getWorldInfo(World world, CMIRegion center)
- CMIRegion getNextChunkLocation(WorldInfo info, boolean existing)

## Package: com.Zrips.CMI.Modules.Repair

### Class: com.Zrips.CMI.Modules.Repair.RepairListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- RepairListener(CMI plugin)

Methods:
- void PlayerItemHeldEvent(PlayerPickupItemEvent event)
- void PlayerItemHeldEvent(PlayerItemHeldEvent event)
- void CMIArmorChangeEvent(CMIArmorChangeEvent event)
- void CMIAnvilItemRepairEvent(CMIAnvilItemRepairEvent event)

### Class: com.Zrips.CMI.Modules.Repair.RepairManager
Type: Class

Constructors:
- RepairManager(CMI plugin)

Methods:
- List<Integer> getBlockedCustomDataID()
- double getBaseRepairCost()
- boolean isRSProtectCommandRepair()
- void loadConfig()
- boolean isRSProtectNormalRepair()
- boolean isRSCancelEvent()
- boolean isRepairCostsMoney()
- boolean isCheckDurability()
- boolean isRepairConfirmation()
- int getRSDurability()
- boolean isRSInformWithMessage()
- double getEnchantWorthPercentage()
- boolean isRSBypassWithPerm()
- double getWorthPercentage()
- boolean isRSAddLore()

## Package: com.Zrips.CMI.Modules.ReplaceBlock

### Class: com.Zrips.CMI.Modules.ReplaceBlock.BRInfo
Type: Class

Methods:
- void setTotal(double d)
- Player getPlayer()
- void setY(int y)
- void addReplaceInfo(itemInfo info)
- CMITask getScheduleTask()
- void setMessages(boolean messages)
- void setAutoSpeed(boolean autoSpeed)
- void setRunning(boolean state)
- List<itemInfo> getItemInfo()
- boolean isRunning()
- boolean isShowInfo()
- long getReplaced()
- WorldInfo getRI()
- void setShowInfo(long time)
- void setShowInfo(boolean state)
- boolean isAutoSpeed()
- long getStartTime()
- void setStartTime()
- void setRI(WorldInfo rI)
- long getShowInfo()
- void setPlayer(Player Player)
- String getPlayerName()
- void setSpeed(int speed)
- int getY()
- void addReplaced()
- int getSpeed()
- List<itemInfo> getReplaceInfo()
- double getTotal()
- void addItemInfo(itemInfo info)
- boolean isMessages()
- void setScheduleTask(CMITask task)

### Class: com.Zrips.CMI.Modules.ReplaceBlock.ReplaceBlock
Type: Class

Constructors:
- ReplaceBlock(CMI plugin)

Methods:
- void start(BRInfo scan)

## Package: com.Zrips.CMI.Modules.SavedInv

### Class: com.Zrips.CMI.Modules.SavedInv.CMIInventory
Type: Class

Constructors:
- CMIInventory(String owner, UUID uuid)

Methods:
- Location getLocation()
- double getMaxHealth()
- Long getTime()
- void afterSave()
- V setPotions(Collection<PotionEffect> potions)
- GameMode getGameMode()
- ItemStack getChest()
- int getId()
- float getSaturation()
- String getOwner()
- void setOwner(String owner)
- UUID getUniqueId()
- Collection<PotionEffect> getPotions()
- void setKiller(String killer)
- HashMap<Integer, ItemStack> getItems()
- ItemStack getPants()
- boolean isEditable()
- boolean isFly()
- V setItems(HashMap<Integer, ItemStack> items)
- void setExp(double exp)
- void setId(int id)
- int getHunger()
- void setHunger(int hunger)
- double getHealth()
- void setHealth(double health)
- void setTime(Long time)
- void setMaxHealth(double maxHealth)
- void setDeathReason(String deathReason)
- ItemStack getOffHand()
- String getKiller()
- void setGameMode(GameMode gameMode)
- void setUuid(UUID uuid)
- String getDeathReason()
- double getExp()
- ItemStack getHelmet()
- void setEditable(boolean editable)
- void setFly(boolean fly)
- UUID getUuid()
- void setLoc(Location loc)
- void setSaturation(float saturation)
- ItemStack getBoots()

### Class: com.Zrips.CMI.Modules.SavedInv.SaveInvListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- SaveInvListener(CMI plugin)

Methods:
- void onPlayerDeathShowLocation(PlayerDeathEvent event)
- void onPlayerDeath(PlayerDeathEvent event)
- void onInventoryOpenEvent(InventoryOpenEvent event)
- void onNormalInventoryClose(InventoryCloseEvent event)
- void onInventoryDrag(InventoryDragEvent event)
- void onInventoryClick(InventoryClickEvent event)

### Class: com.Zrips.CMI.Modules.SavedInv.SavedInventories
Type: Class

Constructors:
- SavedInventories(CMIUser owner)

Methods:
- LinkedHashMap<Integer, CMIInventory> getInventories()
- CMIInventory getFirstInv()
- CMIInventory removeInventory(int id)
- CMIInventory removeInventory(CMIInventory inv)
- int getNextId()
- CMIInventory getLastInv()
- CMIInventory getInventory(int id)
- int getSavedInventoryCount()
- CMIUser getOwner()
- void addInventory(CMIInventory inv)
- CMIInventory getPrevInv(int id)
- CMIInventory getNextInv(int id)
- void setOwner(CMIUser owner)

### Class: com.Zrips.CMI.Modules.SavedInv.SavedInventoryManager
Type: Class

Constructors:
- SavedInventoryManager(CMI plugin)

Methods:
- Boolean isSaveOnDeathRequiresPermission()
- SavedInventories getInventories(CMIUser user)
- boolean saveAllInventories(UUID uuid)
- CMIInventory getInvById(CMIUser user, int id)
- void updateCMIInventoryItems(Inventory top, CMIInventory inv)
- CMIInventory getFirstInv(CMIUser user)
- CMIInventory getFirstInv(SavedInventories inventories)
- void loadConfig()
- int showTimer(Player player, int current, int found, int total, int skipped, int currentplace)
- int getMaxSavedInventorys()
- void loadInventories(CMIUser user)
- void loadInventories(CMIUser user, String invString)
- void addInventory(CMIUser user, CMIInventory inventory)
- void addInventory(CMIUser user, CMIInventory inventory, Integer id)
- void addInventory(CMIUser user, CMIInventory inventory, boolean checkLimits)
- void addInventory(CMIUser user, CMIInventory inventory, Integer id, boolean checkLimits)
- CMIInventory getNextInv(CMIUser user, int id)
- void clearAll()
- ConcurrentHashMap<UUID, SavedInventories> getMap()
- CMIInventory generateInvFromMap(HashMap<String, Object> map)
- void InvList(CommandSender sender, Player player)
- void InvList(CommandSender sender, CMIUser user)
- boolean removeInventory(CMIUser user, int id)
- CMIInventory saveInv(Player player, Entity killer, EntityDamageEvent$DamageCause cause)
- CMIInventory saveInv(Player player, Entity killer, EntityDamageEvent$DamageCause cause, Integer id)
- CMIInventory saveInv(CMIInventory inv, Integer id)
- void openSavedInv(Player player, CMIInventory inv, boolean preview)
- HashMap<String, Object> generateMapFromPlayerInv(CMIInventory inv)
- Boolean isSaveOnDeath()
- boolean loadInv(CommandSender sender, CMIUser user, CMIInventory inv)
- CMIInventory getLastInv(CMIUser user)
- CMIInventory generateCMIInventory(Player player, Entity killer, EntityDamageEvent$DamageCause cause)
- CMIInventory generateCMIInventory(CMIInventory cmiI, Entity killer, EntityDamageEvent$DamageCause cause)
- CMIInventory getPrevInv(CMIUser user, int id)

## Package: com.Zrips.CMI.Modules.SavedItems

### Class: com.Zrips.CMI.Modules.SavedItems.SavedItem
Type: Class

Constructors:
- SavedItem(String name)
- SavedItem(String name, ItemStack item)

Methods:
- void setName(String name)
- String getName()
- void setCategory(String category)
- String getCategory()
- void reset()
- ItemStack getItem()
- void setItem(ItemStack item)

### Class: com.Zrips.CMI.Modules.SavedItems.SavedItemManager
Type: Class

Constructors:
- SavedItemManager(CMI plugin)

Methods:
- ItemStack getUpatedItemClone(Player player, SavedItem savedItem)
- Set<SavedItem> getSavedItems(String category)
- void load()
- void save()
- LinkedHashMap<String, LinkedHashMap<String, SavedItem>> getSavedItemMap()
- int savedItemCount()
- void addSavedItem(SavedItem savedItem)
- String processText(String text, Player player, SavedItem savedItem)
- SavedItem getSavedItem(String category, String name)
- boolean removeSavedItem(SavedItem savedItem)
- boolean removeSavedItem(String category, String name)

## Package: com.Zrips.CMI.Modules.Scan

### Class: com.Zrips.CMI.Modules.Scan.CMIWorldChunkManager
Type: Class

Constructors:
- CMIWorldChunkManager(CMI plugin)

Methods:
- CompletableFuture<CMIWorldChunksRanged> getWorldChunkInfoInRange(World world, CMIVectorInt2D center)
- int getDefaultRange()
- int getScanDefaultSpeed()
- void loadConfig()
- boolean isLogIntoFile()
- boolean isDisableWorldChunkCheckInfo()
- CompletableFuture<CMIWorldChunksRanged> getWorldChunkInfoInRangeAsync(World world, CMIVectorInt2D center, int range)
- boolean isPurge()
- **static** HashMap<Long, CMIVectorInt2D> getRegionFiles(CMIVectorInt2D center, int range)
- CompletableFuture<CMIWorldChunks> loadWorldChunksInRangeAsync(World world, CMIVectorInt2D center, int range)
- double getScanSoftCap()

### Class: com.Zrips.CMI.Modules.Scan.CMIWorldChunks
Type: Class

Constructors:
- CMIWorldChunks(World world)

Methods:
- World getWorld()
- V setRegion(Map<Long, BitSet> regionChunks)
- void setTotalChunks(long totalChunks)
- **static** int getRegionX(long packed)
- BitSet getChunks(long region)
- Map<Long, BitSet> getRegionChunks()
- BitSet getRegionChunks(CMIVectorInt2D region)
- BitSet getRegionChunks(long region)
- void addTotalChunks(int chunks)
- void addTotalChunks()
- boolean getRegionsChunk(CMIVectorInt2D region, int place)
- boolean getRegionsChunk(long region, int)
- **static** CMIVectorInt2D getRegion(long packed)
- void setRegionChunks(CMIVectorInt2D region, BitSet list)
- void setRegionChunks(long region, BitSet)
- CMIWorldChunks clone()
- Object clone() throws CloneNotSupportedException
- **static** int getRegionZ(long packed)
- **static** long packRegionCoords(CMIVectorInt2D region)
- **static** long packRegionCoords(int regionX, int regionZ)
- long getTotalChunks()

### Class: com.Zrips.CMI.Modules.Scan.CMIWorldChunksRanged
Type: Class
Extends: com.Zrips.CMI.Modules.Scan.CMIWorldChunks

Constructors:
- CMIWorldChunksRanged(World world, CMIVectorInt2D center, int range)

Methods:
- **static** CMIVectorInt2D getRealChunkFromPlace(CMIVectorInt2D region, int place)
- CMIVectorInt2D getCenter()
- void addLastChecked()
- void setRange(int range)
- void setLastChecked(long lastChecked)
- void setCenter(CMIVectorInt2D center)
- **static** CMIVectorInt2D chunkPlaceToCoords(int index)
- **static** int chunkCoordToPlace(Chunk chunk)
- CMIVectorInt2D getNextInSpiral(long place)
- boolean allChecked()
- long getLeftToScan()
- int getRange()
- long getLastChecked()
- **static** CMIVectorInt2D getRegionCord(Chunk chunk)
- **static** CMIVectorInt2D getRegionCord(int x, int z)
- long getNextPlace()
- CMIVectorInt2D getNextChunkLocation(boolean existing)

### Class: com.Zrips.CMI.Modules.Scan.CMIWorldDataSearch
Type: Class
Extends: com.Zrips.CMI.Modules.Search.CMIDataSearch

Constructors:
- CMIWorldDataSearch(CommandSender sender, Location center, int range)
- CMIWorldDataSearch(CommandSender sender)

Methods:
- boolean isPaused()
- CMIVectorInt2D getCenter()
- World getWorld()
- void setRange(int range)
- long getSkippedChunks()
- void onPauseChange()
- void setPaused(boolean paused)
- void setCenter(Chunk chunk)
- void setCenter(int x, int z)
- void onDataLoadStart()
- **static** CMIWorldDataSearch getActiveSearch()
- void search()
- **static** UUID locationToUUID(Vector vector)
- ConcurrentHashMap<UUID, CMIDataResultLocationBase> getSearchResults()
- void setWorld(World world)

## Package: com.Zrips.CMI.Modules.Scavenger

### Class: com.Zrips.CMI.Modules.Scavenger.CMIScavengeItem
Type: Class

Methods:
- Player getPlayer()
- Map<Enchantment, Integer> getEnchants()
- double getLeftDurabilityPercentage()
- void setPlayer(Player player)
- ItemStack getItem()
- List<ItemStack> enchantsToBooks()
- double getEnchantExtractionFailChance(Enchantment enchant)
- double getItemBreakChance()
- ItemStack createBook(Enchantment enchant)
- ItemStack createBook(Enchantment enchant, int level)
- double getBreakChanceByItemDurability()
- double getEnchantLevelLowerChance(Enchantment enchant)
- int getRecipeResultAmount()
- boolean canScavenge()
- double getExtractionCost()
- double getIngredientReturnChance()
- List<ItemStack> getIngredients()
- List<ItemStack> getIngredients(boolean checkDurability)
- List<ItemStack> getIngredients(boolean checkDurability, boolean considerEndResultAmount)
- boolean isBlackListedItem()

### Class: com.Zrips.CMI.Modules.Scavenger.ScavengeManager
Type: Class

Constructors:
- ScavengeManager(CMI cmi)

Methods:
- void loadConfig()
- void openExtractor(Player player)

## Package: com.Zrips.CMI.Modules.Search

### Class: com.Zrips.CMI.Modules.Search.CMIDataResultBase
Type: Class

No public methods found

### Class: com.Zrips.CMI.Modules.Search.CMIDataResultItem
Type: Class
Extends: com.Zrips.CMI.Modules.Search.CMIDataResultValue

Constructors:
- CMIDataResultItem(CMIPlayerSearchPlaceType type, UUID uuid, int amount)

Methods:
- String getSubIdentifier()
- String getValueOutput()
- void setSubIdentifier(String identifier)

### Class: com.Zrips.CMI.Modules.Search.CMIDataResultLocationBase
Type: Class
Extends: com.Zrips.CMI.Modules.Search.CMIDataResultBase

Constructors:
- CMIDataResultLocationBase(CMIVectorInt3D vector, int amount)

Methods:
- Location getLocation(World world)
- String getValueOutput()
- UUID getUUID()
- CMIVectorInt3D getVector()
- CMIDataResultLocationBase addAmount(int amount)
- int getAmount()

### Class: com.Zrips.CMI.Modules.Search.CMIDataResultLocationBlock
Type: Class
Extends: com.Zrips.CMI.Modules.Search.CMIDataResultLocationBase

Constructors:
- CMIDataResultLocationBlock(CMIMaterial type, CMIVectorInt3D vector, int amount)

Methods:
- String getValueOutput()
- CMIMaterial getType()

### Class: com.Zrips.CMI.Modules.Search.CMIDataResultLocationEntity
Type: Class
Extends: com.Zrips.CMI.Modules.Search.CMIDataResultLocationBase

Constructors:
- CMIDataResultLocationEntity(Entity ent, CMIVectorInt3D vector, int amount)
- CMIDataResultLocationEntity(CMIEntityType type, CMIVectorInt3D vector, int amount)

Methods:
- String getValueOutput()
- UUID getUUID()
- CMIEntityType getType()

### Class: com.Zrips.CMI.Modules.Search.CMIDataResultPlayerBase
Type: Class
Extends: com.Zrips.CMI.Modules.Search.CMIDataResultBase

Constructors:
- CMIDataResultPlayerBase(CMIPlayerSearchPlaceType type, UUID uuid)

Methods:
- String getValueOutput()
- CMIPlayerSearchPlaceType getType()
- UUID getUniqueId()

### Class: com.Zrips.CMI.Modules.Search.CMIDataResultValue
Type: Class
Extends: com.Zrips.CMI.Modules.Search.CMIDataResultPlayerBase

Constructors:
- CMIDataResultValue(CMIPlayerSearchPlaceType type, UUID uuid, int amount)

Methods:
- String getValueOutput()
- CMIDataResultValue addAmount(int amount)
- int getAmount()

### Class: com.Zrips.CMI.Modules.Search.CMIDataSearch
Type: Class

Constructors:
- CMIDataSearch(CommandSender sender)

Methods:
- void cancel()
- void search()
- boolean isRunning()
- void setPurge(boolean state)
- int getTotalFound()
- void onCycle(int cyclesDone)
- boolean isPurge()
- long getTotalToCheck()
- List<SearchTypeBase> getSearchingFor()
- void onFinish()
- void addSearchingFor(SearchTypeBase searchingFor)
- int getTotalChecked()
- CommandSender getInitiator()

### Class: com.Zrips.CMI.Modules.Search.CMIPlayerDataSearch
Type: Class
Extends: com.Zrips.CMI.Modules.Search.CMIDataSearch

Constructors:
- CMIPlayerDataSearch(CommandSender sender)

Methods:
- void search()
- ConcurrentMap<UUID, ConcurrentHashMap<CMIPlayerSearchPlaceType, CMIDataResultPlayerBase>> getSearchResults()
- **static** CMIPlayerDataSearch getActiveSearch()

### Class: com.Zrips.CMI.Modules.Search.CMIPlayerSearchPlaceType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Inventory
- InventoryShulker
- InventoryBundle
- EnderChest
- EnderChestShulker
- EnderChestBundle
- PlayerVaults
- Custom

Methods:
- **static** CMIPlayerSearchPlaceType valueOf(String name)
- **static** CMIPlayerSearchPlaceType[] values()
- String getPlace()
- String getCmd()
- String getPref()

### Class: com.Zrips.CMI.Modules.Search.CMIWorldSearchPlaceType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ContainerHolder
- Unknown

Methods:
- **static** CMIWorldSearchPlaceType valueOf(String name)
- **static** CMIWorldSearchPlaceType[] values()
- String getPlace()
- String getCmd()
- String getPref()

### Class: com.Zrips.CMI.Modules.Search.ItemSearchCriteria
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- MATERIAL
- NAME
- LORE
- ENCHANT
- MODELDATA
- POTION
- AMOUNT
- EXACT
- OVERSIZE

Methods:
- **static** Set<ItemSearchCriteria> getFromString(String criteria)
- **static** ItemSearchCriteria valueOf(String name)
- **static** ItemSearchCriteria[] values()
- **static** ItemSearchCriteria getByName(String name)

### Class: com.Zrips.CMI.Modules.Search.SearchType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ITEM
- GM
- GOD
- MAXHP
- FLY

Methods:
- String getName()
- **static** SearchType valueOf(String name)
- **static** SearchType[] values()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeBase
Type: Class

Methods:
- SearchType getType()
- SearchTypeBase setType(SearchType type)
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeContentsBase
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypeBase

Methods:
- Set<CMIDataResultBase> checkContent(ItemStack contents)

### Class: com.Zrips.CMI.Modules.Search.SearchTypeFlyMode
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypePlayerBase

Constructors:
- SearchTypeFlyMode(boolean allowFlight)

Methods:
- Set<CMIDataResultBase> checkPlayer(Player player)
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeGameMode
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypePlayerBase

Constructors:
- SearchTypeGameMode(GameMode mode)

Methods:
- Set<CMIDataResultBase> checkPlayer(Player player)
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeGodMode
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypePlayerBase

Constructors:
- SearchTypeGodMode(boolean godMode)

Methods:
- Set<CMIDataResultBase> checkPlayer(Player player)
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeItem
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypeContentsBase

Constructors:
- SearchTypeItem(SearchTypeItem parent)

Methods:
- void setCurrentCheckedLocation(CMIPlayerSearchPlaceType type)
- void setCurrentUUID(UUID player)
- Set<CMIDataResultBase> checkContent(ItemStack contents)
- void finishedLocationCheck()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeItemAmount
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypeItem

Constructors:
- SearchTypeItemAmount(int stackSize)
- SearchTypeItemAmount(SearchTypeItem parent, int stackSize)

Methods:
- int getStackSize()
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeItemEnchant
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypeItem

Constructors:
- SearchTypeItemEnchant(Enchantment enchant, int level)
- SearchTypeItemEnchant(SearchTypeItem parent, Enchantment enchant, int level)

Methods:
- int getLevel()
- Enchantment getEnchant()
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeItemExact
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypeItem

Constructors:
- SearchTypeItemExact(ItemStack item)
- SearchTypeItemExact(SearchTypeItem parent, ItemStack item)

Methods:
- ItemStack getSearchedItem()
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeItemLore
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypeItem

Constructors:
- SearchTypeItemLore(String lore)
- SearchTypeItemLore(SearchTypeItem parent, String lore)

Methods:
- String getSearchTypeName()
- String getLore()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeItemMaterial
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypeItem

Constructors:
- SearchTypeItemMaterial(Material material)
- SearchTypeItemMaterial(SearchTypeItem parent, Material material)

Methods:
- Material getMaterial()
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeItemModelData
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypeItem

Constructors:
- SearchTypeItemModelData(int modelData)
- SearchTypeItemModelData(SearchTypeItem parent, int modelData)

Methods:
- int getModelData()
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeItemName
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypeItem

Constructors:
- SearchTypeItemName(String name)
- SearchTypeItemName(SearchTypeItem parent, String name)

Methods:
- String getName()
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeItemStack
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypeItem

Constructors:
- SearchTypeItemStack(ItemStack item, Set<ItemSearchCriteria> criteria)

Methods:
- ItemStack getSearchedItem()
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypeMaxHealth
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypePlayerBase

Constructors:
- SearchTypeMaxHealth(int health)

Methods:
- Set<CMIDataResultBase> checkPlayer(Player player)
- String getSearchTypeName()

### Class: com.Zrips.CMI.Modules.Search.SearchTypePlayerBase
Type: Class
Extends: com.Zrips.CMI.Modules.Search.SearchTypeBase

Methods:
- Set<CMIDataResultBase> checkPlayer(Player player)

## Package: com.Zrips.CMI.Modules.Selection

### Class: com.Zrips.CMI.Modules.Selection.SelectionListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- SelectionListener(CMI plugin)

Methods:
- void onSelection(PlayerInteractEvent event)

### Class: com.Zrips.CMI.Modules.Selection.SelectionManager
Type: Class

Constructors:
- SelectionManager(CMI plugin)

Methods:
- Location getPlayerLoc2(Player player)
- Location getPlayerLoc2(String player)
- Location getPlayerLoc2(UUID uuid)
- Location getPlayerLoc1(Player player)
- Location getPlayerLoc1(String player)
- Location getPlayerLoc1(UUID uuid)
- boolean worldEditUpdate(Player player)
- boolean makeBorders(Player player)
- void showSelectionInfo(Player player)
- void updateLocations(Player player, Location loc1, Location loc2)
- void updateLocations(Player player, Location loc1, Location loc2, boolean force)
- CuboidArea getSelectionCuboid(Player player)
- CuboidArea getSelectionCuboid(String player)
- CuboidArea getSelectionCuboid(UUID uuid)
- void setSelectionCuboid(Player player, CuboidArea area)
- void showSelection(Player player)
- void afterSelectionUpdate(Player player)
- void afterSelectionUpdate(Player player, boolean force)
- boolean hasPlacedBoth(Player player)
- boolean hasPlacedBoth(String player)
- boolean hasPlacedBoth(UUID uuid)
- void placeLoc2(Player player, Location loc)
- void placeLoc2(Player player, Location loc, boolean show)
- void clearSelection(Player player)
- void showBounds(Player player, Visualizer v)
- void placeLoc1(Player player, Location loc)
- void placeLoc1(Player player, Location loc, boolean show)
- boolean worldEdit(Player player)
- List<Location> getLocations(Location lowLoc, Location loc, Vector vector, boolean StartFromZero)
- void hideSelection(Player player)

### Class: com.Zrips.CMI.Modules.Selection.SelectionSides
Type: Class

Constructors:
- SelectionSides(Boolean NorthSide, Boolean WestSide, Boolean EastSide, Boolean SouthSide, Boolean TopSide, Boolean BottomSide)

Methods:
- void setWestSide(boolean state)
- boolean ShowTopSide()
- void setTopSide(boolean state)
- boolean ShowSouthSide()
- boolean ShowNorthSide()
- boolean ShowWestSide()
- void setEastSide(boolean state)
- boolean ShowEastSide()
- void setBottomSide(boolean state)
- void setNorthSide(boolean state)
- boolean ShowBottomSide()
- void setSouthSide(boolean state)

### Class: com.Zrips.CMI.Modules.Selection.Visualizer
Type: Class

Constructors:
- Visualizer(Player player)

Methods:
- Location getLoc()
- Player getPlayer()
- long getStart()
- V setErrorLocations2(List<Location> errorLocations)
- List<CuboidArea> getErrorAreas()
- void setStarting(int starting)
- void setOnce(boolean once)
- void setErrorTask(CMITask errorId)
- V setErrorLocations(List<Location> errorLocations)
- void setStart(long start)
- void setTask(CMITask id)
- V setLocations2(List<Location> locations)
- List<Location> getErrorLocations2()
- void cancelAll()
- int getStarting()
- void setErrorAreas(CMIPortal res)
- void setErrorAreas(CuboidArea[] errorAreas)
- V setErrorAreas(ArrayList<CuboidArea> errorAreas)
- void setErrorAreas(CuboidArea errorArea)
- boolean isSameLoc()
- CMITask getErrorTask()
- void setPlayer(Player player)
- List<Location> getErrorLocations()
- List<Location> getLocations2()
- boolean isOnce()
- V setLocations(List<Location> locations)
- List<Location> getLocations()
- List<CuboidArea> getAreas()
- void setLoc(Location loc)
- void setAreas(CMIPortal res)
- void setAreas(CuboidArea[] areas)
- V setAreas(ArrayList<CuboidArea> areas)
- void setAreas(CuboidArea area)
- CMITask getTask()

## Package: com.Zrips.CMI.Modules.Sheduler

### Class: com.Zrips.CMI.Modules.Sheduler.SchedTime
Type: Class

Methods:
- void setMonth(Integer month)
- void setDone(boolean done)
- boolean isDone()
- void setHour(Integer hour)
- void setYear(Integer year)
- Integer getDay()
- void setDayOfWeek(Integer dayOfWeek)
- boolean isNow()
- void setSecond(Integer second)
- void setMinute(Integer minute)
- Integer getDayOfWeek()
- Integer getYear()
- Integer getSecond()
- Integer getMinute()
- void setDay(Integer day)
- Integer getHour()
- Integer getMonth()
- long getNextMili()

### Class: com.Zrips.CMI.Modules.Sheduler.Schedule
Type: Class

Constructors:
- Schedule(String name)

Methods:
- List<String> getMinPlayerCommands()
- void setName(String name)
- void setRandomize(boolean randomize)
- void setMinPlayer(Integer minPlayer)
- long getDelay()
- String getName()
- boolean isPlayerMinOk()
- List<SchedTime> getTime()
- boolean isSingleLinear()
- void setPlayerAmountFeedback(Boolean playerAmountFeedback)
- boolean isPlayerAmountOk()
- boolean isRandomize()
- List<String> getCommands()
- void setPerformed(boolean performed)
- String getDuplicatedRandomCommand()
- Long getLastPerformedOn()
- boolean isPlayerMaxOk()
- boolean isDontTranslatePlaceholders()
- void setLastPerformedOn()
- void setLastPerformedOn(Long lastPerformedOn)
- boolean isPerformed()
- void setDuplicateRandomize(boolean duplicateRandomize)
- Integer getMaxPlayer()
- void setDelay(long delay)
- void recalculateNext()
- void setDontTranslatePlaceholders(boolean dontTranslatePlaceholders)
- V setTime(List<SchedTime> time)
- Integer getMinPlayer()
- V setMinPlayerCommands(List<String> minPlayerCommands)
- void setSingleLinear(boolean singleLinear)
- V setCommands(List<String> commands)
- void setMaxPlayer(Integer maxPlayer)
- List<String> updateSchedCmds(List<String> cmds, Player player)
- void perform()
- String getSingleLinearCommand()
- boolean isDuplicateRandomize()
- Double getTotalCommandDelay()
- void setEnabled(boolean enabled)
- boolean isRepeatable()
- Long getPerformOn()
- String getRandomCommand()
- Boolean isPlayerAmountFeedback()
- boolean isEnabled()
- Player getRandomPlayer()
- void safePerform()
- void reset()
- boolean itsTimeToPerform()
- void setRepeatable(boolean repeatable)

### Class: com.Zrips.CMI.Modules.Sheduler.SchedulerManager
Type: Class

Constructors:
- SchedulerManager(CMI plugin)

Methods:
- void load()
- void stop()
- int getActualWeekDay(int day)
- Schedule getSchedule(String name)
- Schedule getSchedule(String name, boolean includeDisabled)
- HashMap<String, Schedule> getMap()

## Package: com.Zrips.CMI.Modules.ShulkerBoxInventory

### Class: com.Zrips.CMI.Modules.ShulkerBoxInventory.ShulkerBoxListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ShulkerBoxListener(CMI plugin)

Methods:
- void InventoryCloseEvent(InventoryCloseEvent event)
- void PlayerInteractEvent(PlayerInteractEvent event)
- void ShulkerEdit(InventoryClickEvent event)
- void ShulkerEdit(InventoryDragEvent event)
- void ShulkerItemOpen(InventoryClickEvent event)
- void CheckForChulker(InventoryClickEvent event)

### Class: com.Zrips.CMI.Modules.ShulkerBoxInventory.ShulkerBoxManager
Type: Class

Constructors:
- ShulkerBoxManager(CMI plugin)

Methods:
- void updateShulkerItem(Player player)
- List<ItemStack> getShulkerBoxContents(ItemStack OneItem)
- void setShulkerInv(ItemStack shulkerBox, ItemStack[] cont)
- void updateEntireShulkerInv(Player player, ItemStack[] cont)
- boolean isShulkerBox(ItemStack OneItem)
- boolean stillHaveItem(Player player)
- void openShulkerBox(Player player, ItemStack item)
- void loadConfig()
- boolean isEditing(Player player)
- void closeAll()
- void remove(Player player)

### Class: com.Zrips.CMI.Modules.ShulkerBoxInventory.ShulkerInv
Type: Class

Constructors:
- ShulkerInv(Player player, Inventory customInv)

Methods:
- void setSourceId(Integer sourceId)
- void setCustomInv(Inventory customInv)
- Inventory getCustomInv()
- Player getPlayer()
- void setShulkerBox(ItemStack shulkerBox)
- ItemStack getShulkerBox()
- void setPlayer(Player player)
- Integer getSourceId()

## Package: com.Zrips.CMI.Modules.Signs

### Class: com.Zrips.CMI.Modules.Signs.PlayerSignEdit1_20Listeners
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PlayerSignEdit1_20Listeners(CMI plugin)

Methods:
- void onPlayerSignOpenEvent(PlayerSignOpenEvent event)

### Class: com.Zrips.CMI.Modules.Signs.PlayerSignEditListeners
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- PlayerSignEditListeners(CMI plugin)

Methods:
- void onSignInteractShift(PlayerInteractEvent event)
- void onSignChangeEvent(SignChangeEvent event)

## Package: com.Zrips.CMI.Modules.SilentChest

### Class: com.Zrips.CMI.Modules.SilentChest.silentChestListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- silentChestListener(CMI plugin)

Methods:
- void onPlayerInteract(PlayerInteractEvent event)
- void onSilentInventoryClick(InventoryClickEvent event)
- void onSilentInventoryClick(InventoryDragEvent event)
- void onSilentInventoryClickWatcher(InventoryClickEvent event)
- void onSilentInventoryClickWatcher(InventoryDragEvent event)
- void onSilentInventoryClose(InventoryCloseEvent event)
- void onInventoryMoveItemEvent(InventoryMoveItemEvent event)
- **static** void clearCache(UUID uuid)
- void onBlockBreakEvent(BlockBreakEvent event)
- void animation(PlayerAnimationEvent event)

## Package: com.Zrips.CMI.Modules.Skin

### Class: com.Zrips.CMI.Modules.Skin.CMISkin
Type: Class

Constructors:
- CMISkin(String name, UUID uuid, String skin, String signature)

Methods:
- void setName(String name)
- String getName()
- String getSkin()
- UUID getUuid()
- void setSignature(String signature)
- String getSignature()
- void setLastUpdate(Long lastUpdate)
- Long getLastUpdate()
- void setUuid(UUID uuid)
- void setSkin(String skin)

### Class: com.Zrips.CMI.Modules.Skin.SkinListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- SkinListener(CMI plugin)

Methods:
- void onPlayerLogin(PlayerLoginEvent event)

### Class: com.Zrips.CMI.Modules.Skin.SkinManager
Type: Class

Constructors:
- SkinManager(CMI plugin)

Methods:
- boolean isSteveOnOff()
- boolean isRequireSpecificPerm()
- void load()
- void loadConfig()
- CMISkin getSkin(String name)
- void save(CMISkin skin)
- void setRequireSpecificPerm(boolean requireSpecificPerm)
- boolean applySkin(Player player, String playerName)
- boolean applySkin(Player player, UUID uuid)
- void setSteveOnOff(boolean steveOnOff)
- void removeSkinFromCache(String playerName)
- boolean isAutoApply()
- boolean setSkin(GameProfile profile, UUID uuid)

## Package: com.Zrips.CMI.Modules.SpawnerCharge

### Class: com.Zrips.CMI.Modules.SpawnerCharge.PlayerCharge
Type: Class

Constructors:
- PlayerCharge(CMIUser user, boolean update)

Methods:
- boolean lowerCd()
- void setLastGive(long lastGive)
- int getChargesClean()
- long getLastGive()
- int getCooldown()
- String getLeftTime()
- boolean haveLeftCharge()
- int getCharges()
- void setCharges(int charges)
- int getMaxCharges()
- boolean have()
- void reset()
- void reset(boolean update)
- boolean addCharge()
- boolean addCharge(int amount)
- boolean addCharge(int amount, boolean force)
- boolean takeCharge()
- boolean takeCharge(int amount)
- boolean takeCharge(int amount, boolean force)
- int getBonus()

### Class: com.Zrips.CMI.Modules.SpawnerCharge.SCharges
Type: Class

Constructors:
- SCharges(String name, int startingCharges, int maxCharges, int cooldown)

Methods:
- int getStartingCharges()
- void setName(String name)
- String getName()
- void setMaxCharges(int maxCharges)
- int getMaxCharges()
- void setCooldown(int cooldown)
- void setBonus(int bonus)
- int getCooldown()
- void setStartingCharges(int startingCharges)
- int getBonus()

### Class: com.Zrips.CMI.Modules.SpawnerCharge.SpawnerActionsListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- SpawnerActionsListener(CMI plugin)

Methods:
- void onPlayerInteractEvent(PlayerInteractEvent event)
- void onTrialSpawnerInteract(PlayerInteractEvent event)
- void onBlockPlace(BlockPlaceEvent event)
- void onBlockBreakExplodeCreeper(EntityExplodeEvent event)
- void onBlockBreakExplodeTnT(EntityExplodeEvent event)

### Class: com.Zrips.CMI.Modules.SpawnerCharge.SpawnerChargeListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- SpawnerChargeListener(CMI plugin)

Methods:
- void BlockPlaceEvent(BlockPlaceEvent event)
- void BlockBreakEventFull(BlockBreakEvent event)
- void BlockBreakEventExpDrop(BlockBreakEvent event)
- void blockBreakEventFull(BlockBreakEvent event)
- **static** void clearCache(UUID uuid)

### Class: com.Zrips.CMI.Modules.SpawnerCharge.SpawnerChargeManager
Type: Class

Methods:
- boolean isTrialSpawnersEggInteractRequiresPermission()
- SCharges getCharge(String name)
- SCharges getCharge(Player player)
- void loadConfig()
- boolean isSpawnersXpDrop()
- int getSpawnerDropChance(Player player, Block block)
- PlayerCharge getPCharge(CMIUser user, boolean update)
- int getSpawnerDropChanceTnt()
- void openSpawnerPickerUI(Player player)
- void openSpawnerPickerUI(Player player, int page)
- int getSpawnersProximityRange()
- boolean isSpawnerDropFromTnt()
- boolean isSpawnersProximityUse()
- boolean isChargesBreakWithoutCharge()
- boolean isSpawnersBreakEnabled()
- int getSpawnerDropChanceCreeper()
- boolean isChargesUse()
- boolean isSpawnerDropFromCreeper()
- boolean isSpawnersPlaceRequiresExactPermission()
- boolean isSpawnersSupportDisabled()
- boolean changeSpawnerType(Block block, EntityType type)
- boolean isSpawnersPlaceRequiresPermission()
- boolean isSpawnersPlaceEnabled()
- boolean isSpawnersIntoInventory()
- int getSpawnersStopDroppingAfter(Player player)
- double getDropChance(Player player, Block block)
- void addCharge(SCharges charge)
- boolean isSpawnersEggInteractRequiresPermission()

### Class: com.Zrips.CMI.Modules.SpawnerCharge.SpawnerProximityListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- SpawnerProximityListener(CMI plugin)

Methods:
- void BlockPlaceEventRange(BlockPlaceEvent event)

## Package: com.Zrips.CMI.Modules.SpecializedCommands

### Class: com.Zrips.CMI.Modules.SpecializedCommands.SpecCMDCooldown
Type: Class

Methods:
- SpecCMDCooldown setCooldown(long seconds)
- SpecCMDCooldown setCooldown(double seconds)
- SpecCMDCooldown setCmd(String cmd)
- String getBaseCmd()
- long untilNextUse(Long usedOn)
- String getCmd()
- double getCD()
- long getCooldown()

### Class: com.Zrips.CMI.Modules.SpecializedCommands.SpecializedCommandManager
Type: Class

Constructors:
- SpecializedCommandManager(CMI plugin)

Methods:
- boolean executeCmd(String cmd, Player senderPlayer)
- boolean executeCmd(String cmd, Player senderPlayer, CMIInteractType clickType)
- boolean executeCmd(String cmd, Player senderPlayer, CMIInteractType clickType, CommandSender sender)
- boolean executeCmd(String initializer, String cmd, Player senderPlayer, CMIInteractType clickType, CommandSender sender)
- boolean executeCmd(String initializer, String cmd, Player senderPlayer, CMIInteractType clickType, CommandSender sender, SpecializedCommandManager$CheckStatements groupedStatements)
- boolean isSpecializedCommand(String cmd)
- V processCmds(List<String> cmds)
- V processCmds(List<String> cmds, CommandSender sender)
- V processCmds(List<String> cmds, Player player)
- V processCmds(List<String> cmds, Player player, CMIInteractType clickType)
- V processCmds(String initializer, List<String> cmds, Player player)
- V processCmds(String initializer, List<String> cmds, Player player, CMIInteractType clickType)
- V processCmds(String initializer, List<String> cmds, Player player, CMIInteractType clickType, CommandSender sender)
- boolean dispatch(CommandSender sender, String commandLine) throws CommandException
- V processAliasCmdsAsPlayer(String initializer, List<String> cmds, Player player)
- specCommand processSpecializedCommand(String cmd)
- void clearCache(UUID uuid)

### Class: com.Zrips.CMI.Modules.SpecializedCommands.SpecializedCommandManager$specCommandAction
Type: Class

Constructors:
- SpecializedCommandManager$specCommandAction(SpecializedCommandManager this$0, SpecializedCommandManager$specialisedCommand cmd)

Methods:
- void setStopAfter(boolean stopAfter)
- void setInitializer(String initializer)
- boolean isStopAfter()
- Object getValue2()
- SpecializedCommandManager$specialisedCommand getCmd()
- boolean isNeedToInform()
- String getInitializer()
- void setNeedToBreak(boolean needToBreak)
- Object getValue()
- boolean isNeedToBreak()
- void setValue2(Object value2)
- boolean isOpposite()
- void setOpposite(boolean opposite)
- void setValue(Object value)
- void setNeedToInform(boolean needToInform)
- void setCmd(SpecializedCommandManager$specialisedCommand cmd)

### Class: com.Zrips.CMI.Modules.SpecializedCommands.SpecializedCommandManager$specialisedCommand
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- permission
- group
- bpermission
- money
- exp
- hasMoney
- hasItem
- hasExactItem
- item
- exactItem
- hasExp
- votes
- cooldown
- ucooldown
- gcooldown
- ifonline
- ifoffline
- ifempty
- stopdelay
- check
- contains
- statement
- if_
- ifhasair
- ifhashunger
- ifhashealth
- ifingamemode
- ifinworld
- ifinportal
- click
- ptarget
- closeinv
- ph
- ch
- msg
- broadcast
- actionbar
- title
- subtitle
- kickall
- fromConsole
- asConsole
- asFakeOp
- likePlayer
- asPlayer
- allPlayers

Methods:
- SpecializedCommandManager$specialisedCommandType getType()
- void setFormat(String format)
- **static** SpecializedCommandManager$specialisedCommand valueOf(String name)
- **static** SpecializedCommandManager$specCommandAction get(String arg)
- **static** SpecializedCommandManager$specialisedCommand[] values()
- String getFormat()
- String getFormatForCheck()
- void setType(SpecializedCommandManager$specialisedCommandType type)

### Class: com.Zrips.CMI.Modules.SpecializedCommands.SpecializedCommandManager$specialisedCommandType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- action
- subaction
- condition
- statement

Methods:
- **static** SpecializedCommandManager$specialisedCommandType valueOf(String name)
- **static** SpecializedCommandManager$specialisedCommandType[] values()

### Class: com.Zrips.CMI.Modules.SpecializedCommands.overflowCommands
Type: Class

Constructors:
- overflowCommands(String command)

Methods:
- int getRepeat()
- void setRepeat(int repeat)
- long getTime()
- void addCommand(String command)
- Set<String> getCommands()
- void addRepeat()
- void setTime(long time)

### Class: com.Zrips.CMI.Modules.SpecializedCommands.specCommand
Type: Class

Methods:
- boolean containsSubaction(SpecializedCommandManager$specialisedCommand cmd)
- void add(SpecializedCommandManager$specCommandAction l)
- List<SpecializedCommandManager$specCommandAction> getStatements()
- List<SpecializedCommandManager$specCommandAction> getConditionList()
- SpecializedCommandManager$specialisedCommand getAction()
- void setCmd(String cmd)
- List<SpecializedCommandManager$specCommandAction> getSubactions()
- String getCmd()

## Package: com.Zrips.CMI.Modules.Statistics

### Class: com.Zrips.CMI.Modules.Statistics.CMIStats
Type: Class

Methods:
- **static** long getTotalTravelDistance(CMIUser user)
- **static** long getStat(CMIUser user, StatsManager$CMIStatistic stat)
- **static** long getStat(CMIUser user, StatsManager$CMIStatistic stat, Object thing)

### Class: com.Zrips.CMI.Modules.Statistics.StatsManager
Type: Class

Constructors:
- StatsManager(CMI plugin)

Methods:
- CMIUser getUserByPlace(int place)
- Statistic getStatistic(StatsManager$CMIStatistic type)
- int getTotalCount()
- StatsManager$CMIStatistic getStatisticByName(String name)
- int getPlace(CMIUser user)
- Long getPlaytimeFromCache(CMIUser user)
- boolean changeTo(Player player, StatsManager$CMIStatistic st, String extra, Long amount)
- Long getTimeByPlace(int place)
- boolean isDataLoaded()
- void addUserData(CMIUser user)
- void loadStats(CommandSender sender, String targetName)
- boolean isScanning()
- void stop()
- SortedMap<Long, CMIUser> getTop()
- SortedMap<Long, CMIUser> getTop(int count)
- int getPages()

### Class: com.Zrips.CMI.Modules.Statistics.StatsManager$CMIStatistic
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LEAVE_GAME
- PLAY_ONE_TICK
- TIME_SINCE_DEATH
- TIME_SINCE_REST
- SNEAK_TIME
- ACOUNT_AGE
- TRAVEL
- WALK_ONE_CM
- CROUCH_ONE_CM
- SPRINT_ONE_CM
- SWIM_ONE_CM
- FALL_ONE_CM
- CLIMB_ONE_CM
- FLY_ONE_CM
- DIVE_ONE_CM
- WALK_UNDER_WATER_ONE_CM
- WALK_ON_WATER_ONE_CM
- MINECART_ONE_CM
- BOAT_ONE_CM
- PIG_ONE_CM
- HORSE_ONE_CM
- AVIATE_ONE_CM
- JUMP
- DAMAGE_DEALT
- DAMAGE_TAKEN
- DAMAGE_DEALT_ABSORBED
- DAMAGE_DEALT_RESISTED
- DAMAGE_BLOCKED_BY_SHIELD
- DAMAGE_ABSORBED
- DAMAGE_RESISTED
- DEATHS
- ENTITY_KILLED_BY
- MOB_KILLS
- PLAYER_KILLS
- ITEM_ENCHANTED
- ANIMALS_BRED
- FISH_CAUGHT
- TALKED_TO_VILLAGER
- TRADED_WITH_VILLAGER
- CAKE_SLICES_EATEN
- CAULDRON_FILLED
- CAULDRON_USED
- ARMOR_CLEANED
- BANNER_CLEANED
- BREWINGSTAND_INTERACTION
- BEACON_INTERACTION
- CRAFTING_TABLE_INTERACTION
- FURNACE_INTERACTION
- DISPENSER_INSPECTED
- DROPPER_INSPECTED
- HOPPER_INSPECTED
- CHEST_OPENED
- TRAPPED_CHEST_TRIGGERED
- ENDERCHEST_OPENED
- NOTEBLOCK_PLAYED
- NOTEBLOCK_TUNED
- FLOWER_POTTED
- RECORD_PLAYED
- SLEEP_IN_BED
- SHULKER_BOX_OPENED
- CLEAN_SHULKER_BOX
- DROP
- MINE_BLOCK
- PLACE_BLOCK
- BREAK_ITEM
- CRAFT_ITEM
- USE_ITEM
- PICKUP
- KILL_ENTITY
- STRIDER_ONE_CM
- INTERACT_WITH_BLAST_FURNACE
- INTERACT_WITH_SMOKER
- INTERACT_WITH_LECTERN
- INTERACT_WITH_CAMPFIRE
- INTERACT_WITH_CARTOGRAPHY_TABLE
- INTERACT_WITH_LOOM
- INTERACT_WITH_STONECUTTER
- INTERACT_WITH_ANVIL
- INTERACT_WITH_GRINDSTONE
- INTERACT_WITH_SMITHING_TABLE
- BELL_RING
- RAID_TRIGGER
- RAID_WIN
- TARGET_HIT
- OPEN_BARREL
- DROP_COUNT
- TOTAL_WORLD_TIME

Methods:
- String getNewName()
- String getName()
- boolean isBlock()
- void setSubSatistic(boolean isSubSatistic)
- boolean isSubSatistic()
- StatsManager$svt getType()
- **static** StatsManager$CMIStatistic valueOf(String name)
- **static** StatsManager$CMIStatistic[] values()
- **static** StatsManager$CMIStatistic getByName(String name)
- void setBlock(boolean isBlock)
- StatsManager$CMIType getSubType()
- Statistic getBukkitStat()

### Class: com.Zrips.CMI.Modules.Statistics.StatsManager$CMIType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- None
- Material
- Block
- Entity

Methods:
- **static** StatsManager$CMIType valueOf(String name)
- **static** StatsManager$CMIType[] values()

### Class: com.Zrips.CMI.Modules.Statistics.StatsManager$svt
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Time
- Distance
- Damage
- Number

Methods:
- **static** StatsManager$svt valueOf(String name)
- **static** StatsManager$svt[] values()

## Package: com.Zrips.CMI.Modules.TabList

### Class: com.Zrips.CMI.Modules.TabList.CMITabSortingOrder
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ASC
- DESC

Methods:
- **static** CMITabSortingOrder valueOf(String name)
- **static** CMITabSortingOrder[] values()
- **static** CMITabSortingOrder getByName(String name)

### Class: com.Zrips.CMI.Modules.TabList.CMITabSortingType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Group
- CustomGroup
- Name
- NickName
- Balance
- World

Methods:
- **static** CMITabSortingType valueOf(String name)
- **static** CMITabSortingType[] values()
- **static** CMITabSortingType getByName(String name)
- **static** String toStringList()

### Class: com.Zrips.CMI.Modules.TabList.TabList
Type: Class

Methods:
- void prepareNextAnimationForFooter()
- void setPlayerNameFormat(String format)
- List<String> getFooter()
- V setHeaderMap(HashMap<Integer, List<String>> headerMap)
- V addFooterAnimation(List<String> footer)
- V setFooterMap(HashMap<Integer, List<String>> footerMap)
- V setHeader(List<String> header)
- HashMap<Integer, List<String>> getHeaderMap()
- List<String> getHeader()
- String getPlayerNameFormat()
- HashMap<Integer, List<String>> getFooterMap()
- V setFooter(List<String> footer)
- void prepareNextAnimationForHeader()
- V addHeaderAnimation(List<String> header)

### Class: com.Zrips.CMI.Modules.TabList.TabListCache
Type: Class

Constructors:
- TabListCache(Player player, TabList tl)

Methods:
- void setPlayerNameFormat(String playerNameFormat)
- String getPlayerNameFormat()
- Player getPlayer()
- List<String> getFooter()
- TabList getTl()
- V setFooter(List<String> footer)
- void setPlayer(Player player)
- void setTl(TabList tl)
- V setHeader(List<String> header)
- List<String> getHeader()

### Class: com.Zrips.CMI.Modules.TabList.TabListHeaderFooterHandler
Type: Class

Constructors:
- TabListHeaderFooterHandler(CMI plugin)

Methods:
- V send(Player receivingPacket, List<String> h, List<String> f)
- void send(Player receivingPacket, String header, String footer)

### Class: com.Zrips.CMI.Modules.TabList.TabListListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- TabListListener(CMI plugin)

Methods:
- void onCMIAfkEnterEvent(CMIAfkEnterEvent event)
- void onPlayerJoinEvent(PlayerJoinEvent event)
- void onPlayerChangedWorldEvent(PlayerChangedWorldEvent event)
- void onPlayerDeathEvent(PlayerDeathEvent event)
- void onPlayerTeleportEvent(PlayerTeleportEvent event)
- void onPlayerQuitEvent(PlayerQuitEvent event)
- void onCMIAfkLeaveEvent(CMIAfkLeaveEvent event)

### Class: com.Zrips.CMI.Modules.TabList.TabListManager
Type: Class

Constructors:
- TabListManager(CMI plugin)

Methods:
- boolean isUpdatesOnJoin()
- void updateTabListAsync(Player player)
- void updateTabListSync(Player player)
- boolean isUpdatesOnNickChange()
- void loadConfig()
- boolean isSortingEnabled()
- boolean isUpdateTabListNames()
- boolean isUpdatesOnPlayerTeleport()
- CMITabSortingType getSortingType()
- boolean isUpdatesOnLeave()
- boolean isUpdatesOnPlayerDeath()
- boolean isUpdatesOnWorldChange()
- void stop()
- TabList getTL(Player player)
- boolean isEnabled()
- CMITabSortingOrder getSortingOrder()
- void updateTabList(int delay)
- void updateTabList()
- void updateTabList(Player player)
- boolean isUpdatesOnAfkStateChange()
- void updateTablistName(Player player)

## Package: com.Zrips.CMI.Modules.TagName

### Class: com.Zrips.CMI.Modules.TagName.TagNameManager
Type: Class

Constructors:
- TagNameManager(CMI plugin)

Methods:
- void loadConfig()

### Class: com.Zrips.CMI.Modules.TagName.TagNameManager$TeamAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CREATE
- UPDATE
- DESTROY

Methods:
- **static** TagNameManager$TeamAction valueOf(String name)
- **static** TagNameManager$TeamAction[] values()

## Package: com.Zrips.CMI.Modules.Teleportations

### Class: com.Zrips.CMI.Modules.Teleportations.CMIChunkSnapShot
Type: Class

Constructors:
- CMIChunkSnapShot(World world)

Methods:
- World getWorld()
- CMIChunkSnapShot setMinY(int minY)
- int getMaxY()
- CMIChunkSnapShot setMaxY(int maxY)
- CMIChunkSnapShot setSnapshot(ChunkSnapshot snap)
- int getMinY()
- ChunkSnapshot getSnapshot()

### Class: com.Zrips.CMI.Modules.Teleportations.CMIRunningRandomTeleports
Type: Class

Methods:
- long getEndTime()
- CMIRunningRandomTeleports setTime(long time)

### Class: com.Zrips.CMI.Modules.Teleportations.CMITeleportCondition
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Good
- BadFloor
- Void
- Suffocation
- Fall
- Unknown
- Plugin
- UnsafeTeleportation
- NoPermission
- MissingWorld

Methods:
- **static** CMITeleportCondition valueOf(String name)
- **static** CMITeleportCondition[] values()
- **static** String getBadLocations()

### Class: com.Zrips.CMI.Modules.Teleportations.CMITeleportFeedback
Type: Class

Constructors:
- CMITeleportFeedback(Location location, boolean success)

Methods:
- CMITeleportFeedback setFloor(CMIMaterial floor)
- Location getLocation()
- CMITeleportFeedback setSuccess(boolean success)
- void setFallDistance(double fallDistance)
- void setCondition(CMITeleportCondition condition)
- CMITeleportCondition getCondition()
- boolean isGood()
- void showFeedbackMessage(CommandSender sender, Player player)
- CMITeleportFeedback setLocation(Location location)
- CMIMaterial getFloor()
- double getFallDistance()
- boolean isSuccess()

### Class: com.Zrips.CMI.Modules.Teleportations.CMITeleportLocation
Type: Class

Constructors:
- CMITeleportLocation(World world)

Methods:
- Location getLocation()
- World getWorld()
- CMITeleportLocation setFallDistance(double fallDistance)
- void setType(CMITeleportType type)
- double getFallDistance()
- CMITeleportLocation setPosition(Vector position)
- CMITeleportLocation setYaw(float yaw)
- CMITeleportLocation setFloor(CMIMaterial floor)
- float getYaw()
- CMITeleportLocation setCondition(CMITeleportCondition condition)
- CMITeleportCondition getCondition()
- float getPitch()
- Vector getPosition()
- CMITeleportType getType()
- CMITeleportLocation setPitch(float pitch)
- CMIMaterial getFloor()

### Class: com.Zrips.CMI.Modules.Teleportations.CMITeleportType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Unknown
- Elevator
- SafeLogin
- Spawn
- NetherRoof
- BelowBedrock
- Back
- DBack
- Home
- Jump
- Patrol
- Portal
- WarmUp
- Biome
- FlightCharge
- InvEdit
- TimedCommand
- TpaAll
- Tp
- Bungee
- Top
- Down
- TpAll
- TpHere
- TpPos
- TpoPos
- Warp
- JoinSpawn
- Totem
- randomTp
- World
- HoloEdit

Methods:
- void setFrom(ParticleManager$CMIPresetAnimations from)
- **static** CMITeleportType valueOf(String name)
- **static** CMITeleportType[] values()
- void setTo(ParticleManager$CMIPresetAnimations to)
- ParticleManager$CMIPresetAnimations getTo()
- PlayerTeleportEvent$TeleportCause getCause()
- ParticleManager$CMIPresetAnimations getFrom()

### Class: com.Zrips.CMI.Modules.Teleportations.CMITeleportationBounds
Type: Class

Methods:
- Player getPlayer()
- World getWorld()
- CMITeleportationBounds setCanFly(boolean canFly)
- CMITeleportationBounds setMinY(int minY)
- CMITeleportationBounds setRange(double range)
- CMITeleportationBounds setUpRange(double range)
- CMITeleportationBounds setImortal(boolean imortal)
- void setPlayer(Player player)
- int getMaxY()
- boolean isCanFly()
- boolean isIgnoreYLimits()
- void setIgnoreYLimits(boolean ignoreYLimits)
- CMITeleportationBounds setPosition(CMIVector3D position)
- CMITeleportationBounds setYaw(float yaw)
- float getYaw()
- float getPitch()
- CMIVector3D getPosition()
- CMITeleportationBounds setDownRange(double range)
- void setFlying(boolean flying)
- CMITeleportationBounds setPitch(float pitch)
- CMITeleportationBounds setMaxY(int maxY)
- boolean isFlying()
- CMITeleportationBounds setWorld(World world)
- boolean isImortal()
- int getMinY()

### Class: com.Zrips.CMI.Modules.Teleportations.DangerousTp
Type: Class

Constructors:
- DangerousTp(UUID uuid, Location location)

Methods:
- Location getLocation()
- void setLocation(Location location)
- Long getTime()
- UUID getUuid()
- void setUuid(UUID uuid)
- void setTime(Long time)

### Class: com.Zrips.CMI.Modules.Teleportations.InvulnerabilityListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- InvulnerabilityListener(CMI plugin)

Methods:
- **static** void addImmortal(CMIUser user)
- **static** void addImmortal(CMIUser user, World world)
- void onPlayerQuit(PlayerQuitEvent event)
- void onPlayerLogin(BlockPlaceEvent event)
- void onPlayerLogin(BlockBreakEvent event)
- void onPlayerLogin(PlayerInteractEvent event)

### Class: com.Zrips.CMI.Modules.Teleportations.PositionRelativeData
Type: Class

Constructors:
- PositionRelativeData(Location loc)

Methods:
- int getMaxWorldY()
- int getMinWorldY()
- int getLocalZ()
- int getLocalX()

### Class: com.Zrips.CMI.Modules.Teleportations.RandomTeleportationManager
Type: Class

Constructors:
- RandomTeleportationManager(CMI plugin)

Methods:
- List<String> getRandomTeleportExcludedBiomes()
- void loadConfig()
- CompletableFuture<Boolean> randomTeleport(Player player, World world)
- CompletableFuture<CMITeleportLocation> getRandomTeleportationLocation(RandomTeleport rtloc, Location loc, CompletableFuture<CMIChunkSnapShot> nestedChunkSnapshot)
- RandomTeleport getRandomTeleport(World w)
- RandomTeleport getRandomTeleport(String worldName)
- RandomTeleport getRandomTeleport(World w, boolean includeDisabled)
- RandomTeleport getRandomTeleport(String worldName, boolean includeDisabled)
- HashMap<String, RandomTeleport> getRandomTeleports()
- int getRandomTeleportCooldown()
- int getRandomTeleportMaxTries()

### Class: com.Zrips.CMI.Modules.Teleportations.SafeTeleport
Type: Class

Constructors:
- SafeTeleport(Location old, Location safeLoc, Location lastCheckedLoc, CMITeleportCondition TpCondition)
- SafeTeleport(Location old, Location safeLoc, CMITeleportCondition TpCondition)
- SafeTeleport(Location old, Location safeLoc, CMITeleportCondition TpCondition, boolean enableFly)
- SafeTeleport(Location old, Location safeLoc, Location lastCheckedLoc, CMITeleportCondition TpCondition, boolean enableFly)

Methods:
- boolean isEnableFly()
- Location getSafeLoc()
- Location getLastCheckedLoc()
- SafeTeleport setEnableFly(boolean enableFly)
- boolean isForceDisableFly()
- Location getOld()
- void setForceDisableFly(boolean forceDisableFly)
- void setLastCheckedLoc(Location lastCheckedLoc)
- CMITeleportCondition getTpCondition()

### Class: com.Zrips.CMI.Modules.Teleportations.TeleportHandler
Type: Class

Constructors:
- TeleportHandler(CMI plugin)

Methods:
- **static** boolean hasSafeTeleport(Player player)
- CompletableFuture<Location> getBottomLocation(Location loc)
- Location getBadTeleport(UUID uuid)
- void removeBadTeleport(UUID uuid)
- void addBadTeleport(UUID uuid, Location loc)
- boolean bypassesBadLocation(Player player, CMITeleportCondition condition)
- boolean isBad(CMIMaterial cmat)
- boolean isEmpty(ChunkSnapshot snap, int localY, PositionRelativeData positionData)
- boolean isEmpty(CMIMaterial type, boolean includeWater)
- List<Entity> shakePassengers(Entity entity)
- CompletableFuture<Boolean> teleportEntity(Entity entity, Location loc, PlayerTeleportEvent$TeleportCause cause)
- boolean needToFly(Player player)
- CompletableFuture<Double> getDistanceToDrop(Location loc)
- CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, boolean safe)
- CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc)
- CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, CMITeleportType type)
- CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, boolean safe, CMITeleportType type)
- CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, boolean safe, CMITeleportType type, boolean ignoreHeightLimits)
- CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, PlayerTeleportEvent$TeleportCause cause)
- CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, PlayerTeleportEvent$TeleportCause cause, boolean safe)
- CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, PlayerTeleportEvent$TeleportCause cause, boolean safe, CMITeleportType type)
- CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, PlayerTeleportEvent$TeleportCause cause, boolean safe, CMITeleportType type, boolean ignoreHeightLimits)
- CompletableFuture<CMITeleportFeedback> getSafeLocation(Player player, Location loc, int maxUpRange, int maxDownRange)
- CompletableFuture<CMITeleportFeedback> getSafeLocation(Player player, Location loc, int maxUpRange, int maxDownRange, boolean checkForProtections)
- CompletableFuture<Boolean> finalizeTeleportation(Player player, PlayerTeleportEvent$TeleportCause cause, CMITeleportLocation cmiLocationDetector)
- CompletableFuture<CMIChunkSnapShot> getSnapshot(Location loc, boolean generate, boolean biomeData)
- CompletableFuture<CMIChunkSnapShot> getSnapshot(World world, int chunkX, int chunkZ, boolean generate, boolean biomeData)
- CompletableFuture<CMITeleportLocation> getSafeTeleportationLocation(CMITeleportationBounds checkBounds, CompletableFuture<CMIChunkSnapShot> nestedChunkSnapshot)
- boolean isEmptySpaceForPlayer(ChunkSnapshot snap, int localY, PositionRelativeData positionData)
- boolean isEmptySpaceForPlayer(ChunkSnapshot snap, int localY, PositionRelativeData positionData, boolean ignoreCrawl)
- CompletableFuture<Location> getDownLocation(Location loc)
- void showParticleEffect(Player player, CMITeleportType type, Location from, Location to)
- CompletableFuture<Location> getTopLocation(Location loc)
- CompletableFuture<Material> getBlockType(Location loc, boolean generate)
- CMIMaterial getBlockType(ChunkSnapshot snap, int localY, PositionRelativeData data)

### Class: com.Zrips.CMI.Modules.Teleportations.TeleportManager
Type: Class

Constructors:
- TeleportManager(CMI plugin)

Methods:
- TreeMap<UUID, Set<TpInfo>> getTeleportRequests()
- Set<TpInfo> getTeleportRequests(UUID uuid)
- List<String> getDBackBlackList()
- void loadConfig()
- int getInvulnerabilityTime()
- int getInvulnerabilityTime(World world)
- int getInvulnerabilityTime(String world)
- boolean addTpRequest(Player whoOffers, Player whoAccepts, TeleportManager$TpAction action)
- boolean addTpRequest(Player whoOffers, Player whoAccepts, TeleportManager$TpAction action, boolean currentLoc)
- boolean isDenyConfirm()
- int getTpaHereMaxDistance()
- boolean isBlockedRequest(Player whoOffers, Player whoAccepts, TeleportManager$TpAction action)
- Boolean isBlackListedItemsEnabledFor(TeleportManager$TpAction action)
- boolean isTpaMove()
- void addTpBlock(Player whoAccepts, TpInfo ti)
- boolean isTpahereCurrentLoc()
- int getTpaWarmupTime()
- boolean isBackWithWE()
- boolean isDisbleInvulnerabilityOnBlockBreakPlace()
- boolean isAlreadyInRequest(Player whoOffers, Player whoAccepts, TeleportManager$TpAction action)
- int getTpaTime()
- TpInfo getTeleportInfo(Player whoAccepts, Player whoOffers)
- TpInfo getTeleportInfo(Player whoAccepts, Player whoOffers, TeleportManager$TpAction action)
- boolean isSafeLocationDownThenUp()
- boolean isTpaCurrentLoc()
- int getTpBypassTime()
- boolean removeTpRequest(Player whoOffers, Player whoAccepts)
- long getBlockTime(Player whoOffers, Player whoAccepts, TeleportManager$TpAction action)
- boolean isDisbleInvulnerabilityOnInteract()
- List<String> getBackBlackList()
- TreeMap<UUID, Set<TpInfo>> getBlockedRequests()
- Set<TpInfo> getBlockedRequests(UUID uuid)
- boolean isSwitchTeleportPlaces()
- int getBackMinDistance()
- int getBackExpiration()
- HashMap<Material, Integer> getBlockedItems()
- int getJumpDefaultDistance()
- int getDeathBackExpiration()
- int getTpaMaxDistance()
- void setSafeLocationDownThenUp(boolean safeLocationDownThenUp)
- void clearRequests(Player player)

### Class: com.Zrips.CMI.Modules.Teleportations.TeleportManager$TpAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- tpa
- tpahere
- tpaall
- tp
- warp
- home
- spawn

Methods:
- **static** TeleportManager$TpAction valueOf(String name)
- **static** TeleportManager$TpAction get(String name)
- **static** TeleportManager$TpAction[] values()

### Class: com.Zrips.CMI.Modules.Teleportations.TpInfo
Type: Class

Constructors:
- TpInfo(Player whoOffers, Player whoAccepts, TeleportManager$TpAction action)

Methods:
- void setWhoAccepts(Player whoAccepts)
- Location getLoc()
- void setAction(TeleportManager$TpAction action)
- long getWhen()
- Player getWhoAccepts()
- Player getWhoOffers()
- void setWhoOffers(Player whoOffers)
- TeleportManager$TpAction getAction()
- void setLoc(Location loc)
- void setWhen(long when)

## Package: com.Zrips.CMI.Modules.TimedCommands

### Class: com.Zrips.CMI.Modules.TimedCommands.TimedCommandListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- TimedCommandListener(CMI plugin)

Methods:
- void EntityTargetLivingEntityEvent(EntityTargetLivingEntityEvent event)
- void onRespawn(PlayerRespawnEvent event)
- void PlayerLoginEvent(PlayerLoginEvent event)
- void PlayerLoginEvent(PlayerChangedWorldEvent event)
- void onPlayerLogOff(PlayerQuitEvent event)

### Class: com.Zrips.CMI.Modules.TimedCommands.TimedCommandManager
Type: Class

Constructors:
- TimedCommandManager(CMI plugin)

Methods:
- void addTimed(CMIUser user)
- boolean checkTGod(CMIUser user, boolean logout)
- void stop()
- boolean checkTFly(CMIUser user, boolean logout)

## Package: com.Zrips.CMI.Modules.Totems

### Class: com.Zrips.CMI.Modules.Totems.CMIPlayerTotemData
Type: Class

Methods:
- long getTotemCooldown()
- **static** long getTotemCooldown(UUID uuid)
- CMIPlayerTotemData setTotemWarmup(long totemWarmup)
- **static** void setTotemWarmup(UUID uuid, long totemWarmup)
- long getTotemWarmup()
- **static** long getTotemWarmup(UUID uuid)
- **static** void removeData(UUID uuid)
- CMIPlayerTotemData setTotemCooldown(long totemCooldown)
- **static** void setTotemCooldown(UUID uuid, long totemCooldown)

### Class: com.Zrips.CMI.Modules.Totems.ResurectionListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ResurectionListener(CMI plugin)

Methods:
- void EntityDamageEventWarmup(EntityDamageEvent event)
- **static** boolean haveTotem(Player player)
- void EntityDamageByEntityEvent(EntityDamageByEntityEvent event)
- void EntityResurrectEventTotemUse(EntityResurrectEvent event)
- void PlayerInteractEvent(PlayerInteractEvent event)
- void onEntityResurrectEventTotemUse(EntityResurrectEvent event)
- void PlayerDeathEvent(PlayerDeathEvent event)
- void EntityDamageByEntityEventWarmup(EntityDamageByEntityEvent event)
- void EntityDamageEvent(EntityDamageEvent event)

### Class: com.Zrips.CMI.Modules.Totems.TotemBossBar
Type: Class

Constructors:
- TotemBossBar(BossBar bar, TotemManager$BossBarType type)

Methods:
- void setEffect(CMIVisualEffect effect)
- void setBar(BossBar bar)
- TotemManager$BossBarType getType()
- BossBar getBar()
- CMIVisualEffect getEffect()
- void setType(TotemManager$BossBarType type)

### Class: com.Zrips.CMI.Modules.Totems.TotemManager
Type: Class

Constructors:
- TotemManager(CMI plugin)

Methods:
- int getAbsorbtionDuration()
- void ShowTotemWarmup(Player player)
- int getFireResistanceDuration()
- void loadConfig()
- boolean isTotemCooldownUse()
- boolean isOnCd(Player player)
- void ShowTotemCooldown(Player player)
- void ShowTotemCooldown(CMIUser user)
- void removePlayer(Player player, TotemManager$BossBarType type)
- void stopWarmupEffect(Player player)
- int getTotemWarmupTime()
- boolean isFullDisableInWorlds(World world)
- boolean isFullDisableInWorlds(String worldName)
- int getTotemCooldownTime()
- TotemBossBar getBossBar(Player player)
- TotemBossBar getBossBar(Player player, TotemManager$BossBarType type)
- TotemBossBar getBossBar(UUID uuid, TotemManager$BossBarType type)
- void checkAllForTotemCd()
- boolean isTotemRemoveFromInventory()
- Long getLeftCd(Player player, int cd)
- boolean isTotemRequirePermission()
- boolean isOnWarmup(Player player)
- boolean isTotemProtectFromVoid()
- void showWarmupEffect(Player player)
- boolean isBlackListedWorld(World world)
- boolean isBlackListedWorld(String worldName)
- boolean isTotemWarmupUse()
- void addCooldownPlayer(Player player)
- int getRegenerationDuration()
- List<String> getBlackListedWorlds()
- void hideAllBars()
- boolean toggleBar(Player player)
- boolean toggleBar(CMIUser user, Boolean state)
- void addWarmupPlayer(Player player)
- List<String> getFullDisableInWorlds()

### Class: com.Zrips.CMI.Modules.Totems.TotemManager$BossBarType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Cooldown
- Warmup

Methods:
- **static** TotemManager$BossBarType valueOf(String name)
- **static** TotemManager$BossBarType[] values()

## Package: com.Zrips.CMI.Modules.Vanish

### Class: com.Zrips.CMI.Modules.Vanish.VanishAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- isVanished
- damageToEntity
- playerDamage
- itemPickup
- mobAggro
- interaction
- noisyChest
- informOnLeave
- informOnJoin
- nightVision
- bossbar
- afkcommands
- PrivateMessages
- relogDisable
- noMessages
- fakeJoinLeave
- mobSpawning
- stopPlaytime
- sleepIgnore
- joinVanished
- deathMessages
- hookPlayers
- level

Methods:
- int getMaxValue()
- **static** VanishAction valueOf(String name)
- **static** VanishAction[] values()
- **static** String getDefaultInternalString()
- VanishActionState valueFomString(String value)
- void setSlot(int slot)
- void setMaxValue(int maxValue)
- void setEnabled(boolean defaults)
- int getSlot()
- **static** String getDefaultConfigString()
- **static** VanishAction get(String name)
- boolean isEnabled()
- String getDesc()
- void setDesc(String desc)

### Class: com.Zrips.CMI.Modules.Vanish.VanishActionState
Type: Class

Methods:
- boolean is()
- String toString()
- VanishActionState fromString(String value)

### Class: com.Zrips.CMI.Modules.Vanish.VanishActionStateBoolean
Type: Class
Extends: com.Zrips.CMI.Modules.Vanish.VanishActionState

Constructors:
- VanishActionStateBoolean(boolean state)

Methods:
- boolean is()
- String toString()
- VanishActionStateBoolean fromString(String value)
- VanishActionState fromString(String)

### Class: com.Zrips.CMI.Modules.Vanish.VanishActionStateInt
Type: Class
Extends: com.Zrips.CMI.Modules.Vanish.VanishActionState

Constructors:
- VanishActionStateInt(int value)

Methods:
- int getValue()
- boolean is()
- String toString()
- VanishActionStateInt fromString(String value)
- VanishActionState fromString(String)

### Class: com.Zrips.CMI.Modules.Vanish.VanishListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- VanishListener(CMI plugin)

Methods:
- void onVanish(CMIPlayerVanishEvent event)
- void onPlayerInteractEvent(PlayerInteractEvent event)
- void onPlayerJoinHideYou(PlayerJoinEvent event)
- void ping(ServerListPingEvent event)
- void onEntityTarget(EntityTargetEvent event)
- void onPlayerLeave(PlayerQuitEvent event)
- void onPlayerDeathEvent(PlayerDeathEvent event)
- void onQuit(PlayerQuitEvent event)
- void EntityDamageByEntityEvent(ProjectileHitEvent event)
- void CreatureSpawnEvent(CreatureSpawnEvent event)
- void CreatureSpawnEvent(SpawnerSpawnEvent event)
- void onEntityDamage(EntityDamageEvent event)
- void PlayerPickupItemEvent(PlayerPickupItemEvent event)
- void onPlayerJoinHideOthers(PlayerJoinEvent event)
- void onFishingRodUseOnPlayer(PlayerFishEvent event)

### Class: com.Zrips.CMI.Modules.Vanish.VanishListener1_19
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- VanishListener1_19(CMI plugin)

Methods:
- void onBlockReceiveGameEvent(BlockReceiveGameEvent event)

### Class: com.Zrips.CMI.Modules.Vanish.VanishListener1_21
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- VanishListener1_21(CMI plugin)

No public methods found

### Class: com.Zrips.CMI.Modules.Vanish.VanishManager
Type: Class

Constructors:
- VanishManager(CMI plugin)

Methods:
- void loadConfig()
- boolean nearActivePlayer(Location loc)
- void removeFromPlayTimePreventer(CMIUser user)
- Set<UUID> getAllVanished()
- **static** boolean is(UUID uuid, VanishAction action)
- void hideVanishedPlayersFor(Player player)
- CMIVanish getVanish(UUID uuid)
- void removePlayer(CMIUser user)
- void removePlayer(Player player)
- void removePlayer(UUID uuid)
- void removePlayer(UUID uuid, boolean showForOthers)
- CMIVanish getOrCreateVanish(CMIUser user)
- CMIVanish getOrCreateVanish(UUID uuid)
- Set<UUID> getVanishedOnlineList()
- **static** VanishActionState getState(UUID uuid, VanishAction action)
- void addPlayer(CMIUser user)
- void addPlayer(Player player)
- void addPlayer(UUID uuid)
- void hidePlayerForEveryone(Player player)
- void addToPlayTimePreventer(CMIUser user)
- void applyVanish(CMIUser user)
- void applyVanish(CMIUser user, boolean fireUnvanishEvent)
- void applyVanish(CMIUser user, boolean fireUnvanishEvent, boolean showMessages)
- void applyVanish(CMIUser user, boolean fireUnvanishEvent, boolean showMessages, boolean login)
- CMIVanish getVanishRaw(UUID uuid)

## Package: com.Zrips.CMI.Modules.ViewRange

### Class: com.Zrips.CMI.Modules.ViewRange.ChunkChange
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- ChunkChange(CMI plugin)

Methods:
- void onChunkChangeMove(CMIChunkChangeEvent event)

### Class: com.Zrips.CMI.Modules.ViewRange.ViewRangeInfo
Type: Class

Methods:
- Player getPlayer()
- World getWorld()
- void setX(int mcaX)
- long getTeleportingTime()
- CMITask getScheduleTask()
- V removeLoadedChunks(List<ChunkInfo> chunks)
- int getRegionChecked()
- void addChunk(ChunkInfo chunk)
- File[] getRegionFiles()
- void setZ(int mcaZ)
- void setAutoSpeed(boolean autoSpeed)
- int getCX()
- void setMoveDirection(Direction dir)
- void addFound()
- int getCZ()
- void setShowInfo(long time)
- int getRange()
- long getStartTime()
- int getloaded()
- void addLoadedChunk(ChunkInfo chunk)
- void addChunkCkecked()
- int getCurrentId()
- int getFound()
- void setRegionFiles(File[] regionFiles)
- V addUnloadChunks(List<ChunkInfo> tempUnloadList)
- boolean isTeleporting()
- List<ChunkInfo> getLoadedChunks()
- String getPlayerName()
- V addChunks(ArrayList<ChunkInfo> chunks)
- void setSpeed(int speed)
- int getSpeed()
- V addLoadedChunks(List<ChunkInfo> chunks)
- void setTeleporting(boolean teleporting)
- boolean isMessages()
- void setWorld(World world)
- void setScheduleTask(CMITask task)
- void addRegionChecked()
- void setCurrentId(int id)
- void setShowRegionInfo(boolean state)
- void setMessages(boolean messages)
- void addLoaded()
- void setChunksCkeckedLast(int chunksCkeckedLast)
- void setRunning(boolean state)
- void addCX()
- void setCX(int cX)
- boolean isRunning()
- boolean isAutoSpeed()
- int getChunksCkeckedLast()
- void setStartTime()
- void addCZ()
- void setCZ(int cZ)
- Direction getMoveDirection()
- long getShowInfo()
- void setTeleportingTime(long tptime)
- void setRange(int range)
- void setChunk(Chunk chunk)
- void setPlayer(Player Player)
- ArrayList<ChunkInfo> getChunks()
- int getChunkChecked()
- boolean isShowRegionInfo()
- List<ChunkInfo> getUnloadChunks()
- int getX()
- void resetChunkCkecked()
- int getZ()
- Chunk getChunk()

### Class: com.Zrips.CMI.Modules.ViewRange.ViewRangeListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onLogIn(PlayerJoinEvent event)
- void onJoin(PlayerTeleportEvent event)

### Class: com.Zrips.CMI.Modules.ViewRange.ViewRangeManager
Type: Class

Constructors:
- ViewRangeManager(CMI plugin)

Methods:
- int getRangeFromPerm(Player player)
- void loadChunk(ViewRangeInfo scan)
- void FillOnMove(ViewRangeInfo scan)

## Package: com.Zrips.CMI.Modules.Votifier

### Class: com.Zrips.CMI.Modules.Votifier.VotifierManager
Type: Class

Constructors:
- VotifierManager(CMI plugin)

Methods:
- void loadConfig()
- void removeVoteReminder(UUID uuid)
- ConcurrentSkipListMap<Double, CMIUser> getTop()
- int getMaxVotesInADay()
- void updateTopList()
- void processVote(CMIUser user, String service)
- void processVote(CMIUser user, String service, String ip)
- void addToVoteReminder(UUID uuid)
- void updateVoteCountList(CMIUser user)

## Package: com.Zrips.CMI.Modules.Warnings

### Class: com.Zrips.CMI.Modules.Warnings.CMIPlayerWarning
Type: Class

Methods:
- Long getGivenAt()
- String getGivenBy()
- void setCategory(CMIWarningCategory category)
- void setGivenAt(Long givenAt)
- String getReason()
- void setReason(String reason)
- CMIWarningCategory getCategory()
- void setGivenBy(String givenBy)

### Class: com.Zrips.CMI.Modules.Warnings.CMIWarningCategory
Type: Class

Constructors:
- CMIWarningCategory(String name)

Methods:
- void setName(String name)
- void setDefaultReason(String defaultReason)
- String getName()
- Long getLifeTime()
- String getDefaultReason()
- int getPoints()
- void setPoints(int points)
- void setLifeTime(Long lifeTime)

### Class: com.Zrips.CMI.Modules.Warnings.WarningManager
Type: Class

Constructors:
- WarningManager(CMI plugin)

Methods:
- String serializeWarnings(List<CMIPlayerWarning> warnings)
- List<String> getCommandsByWarns(Player player, int from, int to)
- List<String> getCommandsByWarns(int warns)
- HashMap<String, CMIWarningCategory> getCategories()
- CMIWarningCategory getDefaultCategory()
- void loadConfig()
- List<CMIPlayerWarning> deserializeWarnings(String warnings)
- List<CMIPlayerWarning> getWarnings(UUID uuid)
- CMIWarningCategory getCategory(String name)
- V setWarnings(UUID uuid, List<CMIPlayerWarning> warnings)
- List<CMIPlayerWarning> getOrCreateWarnings(UUID uuid)

## Package: com.Zrips.CMI.Modules.Warps

### Class: com.Zrips.CMI.Modules.Warps.CmiWarp
Type: Class

Constructors:
- CmiWarp(String name)
- CmiWarp(String name, CMILocation loc)

Methods:
- void setName(String name)
- void setOffItem(ItemStack offItem)
- CMILocation getLoc()
- ItemStack getOffItem()
- String getName()
- void setRandomizeYaw(boolean randomizeYaw)
- Integer getPage()
- boolean hasSecondaryLocations()
- ItemStack getItem()
- void addLocation(CMILocation location)
- boolean isReqPerm()
- CMILocation getLocIncRand()
- void setDisplayName(String displayName)
- void resetQueue()
- void setSlot(Integer slot)
- void setReqPerm(boolean reqPerm)
- void setRepeatingLocation(boolean repeatingLocation)
- String getCreatorName()
- void setHidden(boolean hidden)
- void setShowUnavailable(Boolean showUnavailable)
- void setAutoLore(Boolean autoLore)
- Boolean isShowUnavailable()
- void setItem(ItemStack item)
- void setPage(int p)
- boolean isRepeatingLocation()
- boolean isRandomizeYaw()
- void setCreator(UUID creator)
- UUID getCreator()
- boolean isHidden()
- ItemStack getIcon()
- void setGroup(String group)
- Integer getSlot()
- String getDisplayName()
- boolean sameGroup(String group)
- String getGroup()
- V setLocations(List<CMILocation> locations)
- List<CMILocation> getLocations()
- void reset()
- String getShownName()
- Boolean isAutoLore()
- void setLoc(CMILocation loc)
- ItemStack getOffIcon()

### Class: com.Zrips.CMI.Modules.Warps.WarpManager
Type: Class

Constructors:
- WarpManager(CMI plugin)

Methods:
- int getWarpPerPage()
- void safeSave()
- void addWarp(CmiWarp warp)
- void addWarp(CmiWarp warp, boolean save)
- boolean isWarpShowCreator()
- void loadConfig(ConfigReader cfg)
- int getPageCount(Player player)
- I getPageCount(List<CmiWarp> w)
- void save()
- void onDisable()
- void setMinLenght(int minLenght)
- void remove(CmiWarp warp)
- void openWarpEditor(Player player, String warp)
- void openWarpEditor(Player player, CmiWarp warp)
- void load()
- void setMaxLenght(int maxLenght)
- boolean isWarpRequirePerm()
- CMIGui openGUI(Player player, int page, String group)
- CMIGui openGUI(Player player, List<CmiWarp> warpList, String group)
- int getPageCountFrom(int page, String group)
- int getMaxWarps(CommandSender sender)
- int getMaxWarps(Player player)
- int getWarpCount(Player player)
- HashMap<String, CmiWarp> getWarps()
- List<CmiWarp> getWarps(Player player, String group)
- List<CmiWarp> getWarps(Player player)
- List<CmiWarp> getWarps(Player player, Integer page, String group)
- List<CmiWarp> getWarps(Player player, Integer page, String group, boolean includeHidden)
- List<CmiWarp> getWarps(Player player, Integer page, String group, boolean includeHidden, boolean onlyOwn)
- List<CmiWarp> getWarps(int page, String group)
- List<CmiWarp> getWarps(int page, Integer slot, String group)
- int getMinLength()
- void asyncSave()
- int getMaxLength()
- HashMap<Integer, HashMap<Integer, CmiWarp>> getPagedWarps(Player player, String group, boolean includeHidden, boolean onlyOwn)
- boolean isGUIOnCreation()
- CmiWarp getWarp(Player player, String name)
- CmiWarp getWarp(String name)
- CMIGui openComplexGUI(Player player, int page, String group)
- CMIGui openComplexGUI(Player player, int page, HashMap<Integer, HashMap<Integer, CmiWarp>> warpMap)
- boolean isWarpGUI()

## Package: com.Zrips.CMI.Modules.Worlds

### Class: com.Zrips.CMI.Modules.Worlds.CMIBiome
Type: Class

Methods:
- String getName()
- String getLocalized()
- **static** Set<String> values()
- **static** CMIBiome get(String name)
- Color getColor()
- int getId()

### Class: com.Zrips.CMI.Modules.Worlds.CMIBiomeType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- OCEAN
- PLAINS
- DESERT
- MOUNTAINS
- FOREST
- TAIGA
- SWAMP
- RIVER
- NETHER
- THE_END
- FROZEN_OCEAN
- FROZEN_RIVER
- SNOWY_TUNDRA
- SNOWY_MOUNTAINS
- MUSHROOM_FIELDS
- MUSHROOM_FIELD_SHORE
- BEACH
- DESERT_HILLS
- WOODED_HILLS
- TAIGA_HILLS
- MOUNTAIN_EDGE
- JUNGLE
- JUNGLE_HILLS
- JUNGLE_EDGE
- DEEP_OCEAN
- STONE_SHORE
- SNOWY_BEACH
- BIRCH_FOREST
- BIRCH_FOREST_HILLS
- DARK_FOREST
- SNOWY_TAIGA
- SNOWY_TAIGA_HILLS
- GIANT_TREE_TAIGA
- GIANT_TREE_TAIGA_HILLS
- WOODED_MOUNTAINS
- SAVANNA
- SAVANNA_PLATEAU
- BADLANDS
- WOODED_BADLANDS_PLATEAU
- BADLANDS_PLATEAU
- SMALL_END_ISLANDS
- END_MIDLANDS
- END_HIGHLANDS
- END_BARRENS
- WARM_OCEAN
- LUKEWARM_OCEAN
- COLD_OCEAN
- DEEP_WARM_OCEAN
- DEEP_LUKEWARM_OCEAN
- DEEP_COLD_OCEAN
- DEEP_FROZEN_OCEAN
- THE_VOID
- SUNFLOWER_PLAINS
- DESERT_LAKES
- GRAVELLY_MOUNTAINS
- FLOWER_FOREST
- TAIGA_MOUNTAINS
- SWAMP_HILLS
- ICE_SPIKES
- MODIFIED_JUNGLE
- MODIFIED_JUNGLE_EDGE
- TALL_BIRCH_FOREST
- TALL_BIRCH_HILLS
- DARK_FOREST_HILLS
- SNOWY_TAIGA_MOUNTAINS
- GIANT_SPRUCE_TAIGA
- GIANT_SPRUCE_TAIGA_HILLS
- MODIFIED_GRAVELLY_MOUNTAINS
- SHATTERED_SAVANNA
- SHATTERED_SAVANNA_PLATEAU
- ERODED_BADLANDS
- MODIFIED_WOODED_BADLANDS_PLATEAU
- MODIFIED_BADLANDS_PLATEAU
- GROVE
- JAGGED_PEAKS
- SOUL_SAND_VALLEY
- CHERRY_GROVE
- OLD_GROWTH_PINE_TAIGA
- WINDSWEPT_HILLS
- STONY_PEAKS
- WARPED_FOREST
- CRIMSON_FOREST
- LUSH_CAVES
- WINDSWEPT_GRAVELLY_HILLS
- STONY_SHORE
- FROZEN_PEAKS
- MANGROVE_SWAMP
- NETHER_WASTES
- WINDSWEPT_SAVANNA
- OLD_GROWTH_SPRUCE_TAIGA
- DEEP_DARK
- WOODED_BADLANDS
- WINDSWEPT_FOREST
- SNOWY_SLOPES
- BASALT_DELTAS
- SPARSE_JUNGLE
- MEADOW
- DRIPSTONE_CAVES
- OLD_GROWTH_BIRCH_FOREST
- SNOWY_PLAINS
- BAMBOO_JUNGLE

Methods:
- **static** CMIBiomeType valueOf(String name)
- **static** CMIBiomeType get(String name)
- **static** CMIBiomeType[] values()
- void setId(int id)
- Color getColor()
- int getId()

### Class: com.Zrips.CMI.Modules.Worlds.CMIChunk
Type: Class

Constructors:
- CMIChunk(Chunk chunk)
- CMIChunk(World world, int x, int z)

Methods:
- int getRelativeZ()
- World getWorld()
- String getBiomeColorCodes()
- List<CMIBiome> getBiomes()
- Color getUnbluredColor()
- CMIChunk recheckBiomes(Chunk chunk)
- CMIChunk recheckBiomes()
- Integer getPlace()
- int getRelativeX()
- boolean isGenerated()
- Integer getX()
- ChunkSnapshot getEmptyChunkSnapshot()
- Integer getZ()
- V setBiomes(List<CMIBiome> biomes)
- Chunk getChunk()
- CMIChunk setGenerated(boolean generated)

### Class: com.Zrips.CMI.Modules.Worlds.CMIRegion
Type: Class

Constructors:
- CMIRegion(Location loc)
- CMIRegion(Chunk chunk)
- CMIRegion(World world, int x, int z)

Methods:
- World getWorld()
- int getX()
- CMIRegion setX(int x)
- V setChunks(TreeMap<Integer, CMIChunk> chunks)
- int getZ()
- CMIChunk getChunk(Chunk chunk)
- CMIChunk getChunk(int x, int z)
- boolean exists(int place)
- boolean exists(int x, int z)
- CMIChunk addChunk(World world, int x, int z)
- CMIChunk addChunk(Chunk chunk)
- TreeMap<Integer, CMIChunk> getChunks()
- Integer getPlace()
- void setWorld(World world)
- CMIRegion setZ(int z)
- CMIChunk getRelativeChunk(int x, int z)

### Class: com.Zrips.CMI.Modules.Worlds.CMIWorld
Type: Class

Constructors:
- CMIWorld(Chunk chunk)
- CMIWorld(World world)

Methods:
- TreeMap<Integer, CMIRegion> getRegions()
- boolean insideWorldBorder(Location loc)
- World getWorld()
- CMIRegion getRegionByChunkCoord(int x, int z)
- **static** int getMinHeight(World world)
- CMIRegion getRegion(Chunk chunk)
- CMIRegion getRegion(int x, int z)
- V setRegions(TreeMap<Integer, CMIRegion> regions)
- CMIRegion addRegion(World world, int x, int z)
- CMIRegion addRegion(Chunk chunk)
- void setWorld(World world)

### Class: com.Zrips.CMI.Modules.Worlds.CMIWorldListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- CMIWorldListener(CMI plugin)

Methods:
- **static** void delayRecheck(String world, UpdateOnWorldLoad upd)
- void onWorldLoad(WorldLoadEvent event)

### Class: com.Zrips.CMI.Modules.Worlds.UpdateOnWorldLoad
Type: Class

Methods:
- void update(World world)

### Class: com.Zrips.CMI.Modules.Worlds.WorldManager
Type: Class

Constructors:
- WorldManager(CMI plugin)

No public methods found

## Package: com.Zrips.CMI.Modules.Worth

### Class: com.Zrips.CMI.Modules.Worth.WorthEnchantment
Type: Class

Constructors:
- WorthEnchantment(Enchantment enchant, int level, double sellPrice, Double buyPrice)

Methods:
- Integer getLevel()
- void setBuyPrice(Double buyPrice)
- Double getBuyPrice()
- Enchantment getEnchant()
- boolean isBuyPriceSet()
- Double getSellPrice()
- void setSellPrice(double price)

### Class: com.Zrips.CMI.Modules.Worth.WorthItem
Type: Class

Constructors:
- WorthItem(ItemStack item, Integer data, double price)
- WorthItem(ItemStack item, double price)
- WorthItem(ItemStack item)

Methods:
- void setRecipe(Recipe recipe)
- **static** double getEnchantSellPrice(ItemStack item)
- Double getBuyPrice()
- void updateRecipes()
- Recipe getExploitRecipe()
- void setData(Integer data)
- boolean isBuyPriceSet()
- ItemStack getItem()
- Double getSellPrice()
- void setExploitRecipe(Recipe exploitRecipe)
- void setSellPrice(double price)
- Double getPlayerSellPrice(ItemStack item, boolean includeEnchants, boolean includeDurability)
- void resetRecipes()
- void setModelData(Integer modelData)
- Integer getModelData()
- Recipe updateExploitRecipe()
- void setBuyPrice(Double buyPrice)
- Recipe getRecipe()
- void setItem(ItemStack item)
- Integer getData()

### Class: com.Zrips.CMI.Modules.Worth.WorthItemCheck
Type: Class

Constructors:
- WorthItemCheck(ItemStack item)

Methods:
- void setWorth(WorthItem worth)
- Double getEnchantSellPrice()
- Double getBuyPrice()
- WorthItem getWorth()
- boolean isBuyPriceSet()
- ItemStack getItem()
- Double getSellPrice()
- Double getSellPrice(boolean includeEnchants)
- Double getSellPrice(boolean includeEnchants, boolean includeDurability)

### Class: com.Zrips.CMI.Modules.Worth.WorthListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- WorthListener(CMI plugin)

Methods:
- void InventoryClickEvent(InventoryClickEvent event)
- void InventoryCloseEvent(CMIGUICloseEvent event)
- void CMIPlayerItemsSellEvent(CMIPlayerItemsSellEvent event)

### Class: com.Zrips.CMI.Modules.Worth.WorthManager
Type: Class

Constructors:
- WorthManager(CMI plugin)

Methods:
- boolean isRepairBeforeSell(ItemStack item)
- Double getEnchantSellPrice(Enchantment enchant, int level)
- void loadConfig()
- double getWorthByDurability(ItemStack item, double amount)
- WorthItem getWorth(ItemStack item)
- WorthItem getWorth(ItemStack item, boolean includeFree)
- void loadEnchtWorth()
- void addEnchantWorth(WorthEnchantment worth)
- void openWorthListGui(Player player, int page)
- void openWorthListGui(Player player, int page, boolean missing)
- WorthItem addWorth(WorthItem worth)
- HashMap<CMIMaterial, List<WorthItem>> getMap()
- double damagePercentage(ItemStack item)
- boolean isShulkerWithItems(ItemStack item)
- List<ItemStack> getItems(Player player, WorthManager$worthType type)
- List<ItemStack> getItems(Player player, WorthManager$worthType type, CMIMaterial material)
- List<ItemStack> getItems(Player player, WorthManager$worthType type, CMIMaterial material, int amount)
- void updatePriceInFile()
- void updatePriceInFile(WorthItem worth)
- void updatePriceInFile(WorthEnchantment enchantWorth)
- void updatePriceInFile(WorthItem worth, WorthEnchantment enchantWorth)
- void load()
- void closeStream()
- int getAutoGeneratePriceIncrease()
- boolean containsBlockedLore(CMIItemStack citem)
- V sellLog(Player player, HashMap<WorthItem, Integer> total)
- WorthEnchantment getEnchantWorth(Enchantment enchant, int level)
- void openWorthGui(Player player, CMIItemStack iih)

### Class: com.Zrips.CMI.Modules.Worth.WorthManager$worthType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- all
- hand
- blocks
- same
- material
- gui

Methods:
- **static** WorthManager$worthType valueOf(String name)
- **static** WorthManager$worthType[] values()
- **static** WorthManager$worthType getByName(String name)

## Package: com.Zrips.CMI.NBT

### Class: com.Zrips.CMI.NBT.NMS
Type: Interface

Methods:
- Player getPlayer(CMIUser)
- void updateCollisions(Player, boolean, boolean)
- void setMiscLocation(Player, Location)
- void setMiscLocation(File, Location)
- void updateHologram(Player, CMIDataWatcher, String, ItemStack)
- void showResurection(Player)
- void setPotionEffects(Player, PotionEffect)
- void updatePlayerViaPackets(Player)
- String getWorldName(File)
- Player createFakeOperator()
- boolean clearSkin(Player)
- Block getBlockLookingAt(Player, int, boolean)
- Block getBlockLookingAt(World, Vector, Vector, boolean)
- void updateExpBar(Player)
- void removeHologram(Player, Integer)
- CMIHitBox getBlockHitBox(CMIHitBox)
- FakeInfo spawnClickable(Player, Location, Object, boolean)
- CMIDataWatcher makeFloatingIcon(Player, Location, ItemStack)
- CMIDataWatcher makeFloatingIcon(Player, Location, ItemStack, boolean)
- Command getCommand(String)
- void setEntityTag(Entity, String, Object)
- CMIHitBox getEntityHitBox(CMIHitBox)
- Inventory getShulkerInv(ItemStack)
- Inventory getShulkerInv(Block)
- void resendChunk(Chunk, Player)
- int getTickLived(UUID)
- ItemStack removeEnchantNbt(ItemStack, Enchantment)
- ItemStack setNBTList(ItemStack, String, List<String>)
- void clearPotionEffects(Player)
- boolean forceTeleport(Player, Location)
- boolean getGodMode(Player)
- boolean changeGodMode(Player, boolean)
- void unloadChunk(Chunk, Player)
- void unloadData(Player)
- CMIDataWatcher spawnHologram(Player, Location, String, ItemStack)
- void relightChunk(Chunk)

## Package: com.Zrips.CMI.commands

### Class: com.Zrips.CMI.commands.CAnnotation
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean subIgnoreHelpPage()
- boolean test()
- boolean hidden()
- String[] multiTab()
- boolean ignoreHelpPage()
- String[] explanation()
- int priority()
- Class<Cmd> redirectClass()
- String[] modules()
- String args()
- String redirectFormat()
- int[] regVar()
- String[] tab()
- boolean paccess()
- boolean asyncSupported()
- boolean alias()
- int[] consoleVar()
- String[] customAlias()
- boolean others()
- String info()

### Class: com.Zrips.CMI.commands.Cmd
Type: Interface

Methods:
- Boolean perform(CMI, CommandSender, String[])
- void getExtra(ConfigReader)

### Class: com.Zrips.CMI.commands.CMICommand
Type: Class

Constructors:
- CMICommand(Cmd cmdClass, String name, CAnnotation anottation)

Methods:
- void setAnottation(CAnnotation anottation)
- CMICommand setName(String name)
- void setEnabled(Boolean enabled)
- String getName()
- CMICommand setCmdClass(Cmd cmdClass)
- void setBaseEnabled(boolean baseEnabled)
- String getTranslatedArgs()
- Boolean getEnabled()
- boolean getBaseEnabled()
- CAnnotation getAnottation()
- Cmd getCmdClass()

### Class: com.Zrips.CMI.commands.CommandsHandler
Type: Class
Implements: org.bukkit.command.CommandExecutor

Constructors:
- CommandsHandler(CMI plugin)

Methods:
- **static** HashSet<String> getClassesFromPackage(String pckgname)
- **static** String getLabel()
- **static** int distance(String a, String b)
- void addDisabledBase(String disabledBase)
- void setBaseCommandState(String command, boolean state)
- Map<String, Integer> GetCommands(CommandSender sender)
- boolean onCommand(CommandSender sender, Command command, String l, String[] args)
- **static** String getCommandPrefix(String command)
- void fillCommands()
- boolean isTestServer()
- Map<String, CMICommand> getCommands()
- **static** boolean hasCommandPermission(CommandSender sender, String cmd, Long delay)
- Boolean performCMICommand(CommandSender sender, Cmd command, String[] args)
- Boolean performCMICommand(CommandSender sender, Class<*> command, String args)
- Boolean performCMICommand(CommandSender sender, CMICommand cmd, String[] args)
- void sendUsage(CommandSender sender, String cmd)
- void sendUsage(CommandSender sender, String cmd, boolean explanation)
- String getUserName2(CMIUser user)
- String getUserName1(CMIUser user)
- List<String> getDisabledBase()
- void clearDisabledBase()

### Class: com.Zrips.CMI.commands.Void
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

## Package: com.Zrips.CMI.commands.list

### Class: com.Zrips.CMI.commands.list.actionbarmsg
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.afk
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.afkcheck
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.air
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.alert
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.aliaseditor
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.anvil
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.anvilrepaircost
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.armoreffect
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.armorstand
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.attachcommand
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.autorecharge
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.back
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.balance
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.baltop
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ban
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.banlist
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.bbroadcast
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.blockcycling
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.blockinfo
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.blocknbt
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.book
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.bossbarmsg
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.broadcast
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.burn
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.cartographytable
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.charges
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.chat
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.chatcolor
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.checkaccount
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.checkban
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.checkcommand
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.checkexp
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.checkperm
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.cheque
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.clear
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.clearchat
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.clearender
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.colorlimits
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.colorpicker
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.colors
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.compass
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.condense
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- **static** void clearCache()
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.counter
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.cplaytime
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ctellraw
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ctext
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.cuff
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.customrecipe
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- void openSubMenu(Player player, CMIRecipeType t)
- void openSubMenu(Player player, CMIRecipe recipe)
- void openSubMenu(Player player, CMIRecipeType t, CMIRecipe recipe)
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void openMainMenu(Player player, int page)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.dback
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.disableenchant
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.dispose
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.distance
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.donate
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.down
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.dsign
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.dye
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- **static** ItemStack setCustom(CommandSender sender, Player player, ItemStack iih, AnimationManager$LeatherAnimationType custom)
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.editctext
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.editlocale
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.editplaytime
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.editwarnings
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.editwarp
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.effect
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.emojipicker
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.enchant
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ender
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.endgateway
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.entityinfo
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.entitynbt
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.exp
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ext
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.falldistance
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.feed
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.findbiome
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.fixchunk
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.flightcharge
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- **static** boolean expRecharge(CommandSender sender, CMIUser user, int rechargeAmount)
- **static** boolean expRecharge(CommandSender sender, CMIUser user, int rechargeAmount, boolean silent)
- **static** boolean moneyRecharge(CommandSender sender, CMIUser user, int rechargeAmount, boolean silent)
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.fly
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI pl, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.flyc
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.flyspeed
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.gamerule
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.generateworth
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.getbook
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.giftpet
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.give
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.giveall
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.glow
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.gm
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.god
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.grindstone
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.groundclean
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- **static** boolean isUsefull(ItemStack stack, boolean keepShulker)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.haspermission
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.hat
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- **static** Boolean checkHatItem(Player player, ItemStack iih)
- **static** boolean isHelmet(ItemStack item)
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.head
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.heal
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.helpop
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.hideflags
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.hologram
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.hologrampages
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.home
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.homes
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.hunger
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ic
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ifoffline
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ifonline
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ignore
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.importfrom
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.importoldusers
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.info
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.inv
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.invcheck
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.invlist
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.invload
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.invremove
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.invremoveall
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.invsave
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ipban
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ipbanlist
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.item
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.itemcmdata
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.itemframe
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.iteminfo
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.itemlore
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.itemname
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.itemnbt
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.jail
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.jailedit
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.jaillist
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- **static** void showCellInfo(CommandSender sender, CMIJailCell cell)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.jump
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.kick
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.kill
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.killall
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- **static** boolean isMonster(Entity ent)
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.kit
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.kitcdreset
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.kiteditor
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.kitusagereset
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.lastonline
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- **static** void addLogOff(CMIUser user)
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.launch
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- **static** Vector calculateVelocity(Vector from, Vector to, double heightGain)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.lfix
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.list
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.lockip
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- boolean isValid(String ip)
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.loom
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.mail
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.mailall
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.maintenance
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.maxhp
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.maxplayers
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.me
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.merchant
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- **static** List<Villager$Profession> getVillagerProfessions()
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.migratedatabase
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.mirror
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.mobhead
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.money
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.more
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.msg
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.mute
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.mutechat
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.nameplate
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.near
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.nick
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI pl, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.notarget
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.note
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.openbook
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.oplist
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.options
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.panimation
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.patrol
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.pay
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ping
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.placeholders
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.playercollision
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.playtime
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.playtimetop
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.point
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.portals
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.pos
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.preview
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.prewards
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ptime
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.purge
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.pweather
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.rankdown
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.rankinfo
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ranklist
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.rankset
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.rankup
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.realname
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.recipe
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.releasepet
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.reload
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.removehome
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.removeuser
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.removewarp
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.repair
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.repaircost
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.replaceblock
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI pl, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.reply
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.resetback
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.resetdbfields
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.ride
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.rt
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- **static** void addUsedAt(UUID uuid, String world, long time)
- **static** Long getUsedAt(UUID uuid, String world)
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.sameip
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.saturation
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.saveall
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.saveditems
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.sc
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.scale
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.scan
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- **static** Location lookAt(Player player, Location target)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.scavenge
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.schedule
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.se
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- BlockFace getClosestFace(float direction)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.search
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.seen
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.select
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.sell
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- **static** Z sellingItems(CommandSender sender, Player player, WorthManager$worthType actionType, List<ItemStack> forPriceCheck, int amount, boolean silent, boolean removeItems)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.sendall
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.server
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.serverlinks
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.serverlist
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.servertime
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.setenchantworth
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.setfirstspawn
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.sethome
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.setmotd
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.setrt
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.setspawn
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.setwarp
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.setworth
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.shadowmute
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.shakeitoff
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.shoot
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.silence
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.silentchest
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.sit
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.skin
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.smite
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.smithingtable
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.solve
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.sound
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.spawn
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.spawner
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.spawnereditor
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.spawnmob
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- **static** void proccessMob(CommandSender sender, Entity ent, String subValues)
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.speed
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.staffmsg
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- **static** void sendStaffMsg(CommandSender sender, String senderName, String message)
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.stats
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- **static** String convertDistance(long distance)
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.statsedit
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.status
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.stonecutter
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.sudo
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.suicide
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.switchplayerdata
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tablistupdate
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tempban
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tempipban
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tfly
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tgod
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.time
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.titlemsg
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.toast
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.top
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tp
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tpa
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tpaall
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tpaccept
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tpahere
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tpall
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tpallworld
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tpbypass
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tpdeny
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tphere
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tpo
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tpohere
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tpopos
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tppos
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tps
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.tree
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.unban
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.unbreakable
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.uncondense
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- **static** void clearCache()
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.unjail
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.unloadchunks
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.unmute
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.unmutechat
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.usermeta
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.util
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- **static** String encode(String data) throws IOException
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- **static** String decode(String encodedString) throws IOException
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.vanish
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.vanishedit
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.version
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.viewrange
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.voteedit
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.votes
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.votetop
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.walkspeed
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.warn
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.warnings
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.warp
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.warpgroups
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.weather
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.workbench
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.world
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.worth
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

### Class: com.Zrips.CMI.commands.list.worthlist
Type: Class
Implements: com.Zrips.CMI.commands.Cmd

Methods:
- Boolean perform(CMI plugin, CommandSender sender, String[] args)
- void getExtra(ConfigReader c)

## Package: com.Zrips.CMI.events

### Class: com.Zrips.CMI.events.CMIAfkEnterEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIAfkEnterEvent(Player player, List<String> awayTrigerCommands, CMIAfkEnterEvent$AfkType afkType)

Methods:
- V setAwayTrigerCommands(List<String> awayTrigerCommands)
- List<String> getAwayTrigerCommands()
- CMIAfkEnterEvent$AfkType getType()

### Class: com.Zrips.CMI.events.CMIAfkEnterEvent$AfkType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- auto
- manual

Methods:
- **static** CMIAfkEnterEvent$AfkType valueOf(String name)
- **static** CMIAfkEnterEvent$AfkType[] values()

### Class: com.Zrips.CMI.events.CMIAfkKickEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIAfkKickEvent(Player player, List<String> kickTrigerCommands)

Methods:
- V setKickTrigerCommands(List<String> kickTrigerCommands)
- List<String> getKickTrigerCommands()

### Class: com.Zrips.CMI.events.CMIAfkLeaveEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerEvent

Constructors:
- CMIAfkLeaveEvent(Player player)
- CMIAfkLeaveEvent(Player player, List<String> leaveTrigerCommands)
- CMIAfkLeaveEvent(Player player, List<String> leaveTrigerCommands, long time, String reason)

Methods:
- String getReason()
- long getTime()
- V setLeaveTrigerCommands(List<String> leaveTrigerCommands)
- List<String> getLeaveTrigerCommands()

### Class: com.Zrips.CMI.events.CMIAnvilItemRenameEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIAnvilItemRenameEvent(Player player, ItemStack itemFrom, ItemStack itemTo, int cost)

Methods:
- ItemStack getItemFrom()
- ItemStack getItemTo()
- void setItemTo(ItemStack itemTo)
- int getCost()

### Class: com.Zrips.CMI.events.CMIAnvilItemRepairEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIAnvilItemRepairEvent(Player player, ItemStack itemFrom, ItemStack itemTo, int repairCost)

Methods:
- ItemStack getItemFrom()
- ItemStack getItemTo()
- int getRepairCost()
- void setItemTo(ItemStack itemTo)

### Class: com.Zrips.CMI.events.CMIArmorChangeEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIArmorChangeEvent(Player equipType, CMIArmorChangeEvent$EquipMethod equipType, ArmorTypes type, ItemStack oldArmorPiece, ItemStack newArmorPiece)

Methods:
- void setNewArmorPiece(ItemStack newArmorPiece)
- void setOldArmorPiece(ItemStack oldArmorPiece)
- ArmorTypes getType()
- CMIArmorChangeEvent$EquipMethod getMethod()
- ItemStack getOldArmorPiece()
- ItemStack getNewArmorPiece()

### Class: com.Zrips.CMI.events.CMIArmorChangeEvent$EquipMethod
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SHIFT_CLICK
- DRAG
- HOTBAR
- HOTBAR_SWAP
- DISPENSER
- BROKE
- DEATH

Methods:
- **static** CMIArmorChangeEvent$EquipMethod valueOf(String name)
- **static** CMIArmorChangeEvent$EquipMethod[] values()

### Class: com.Zrips.CMI.events.CMIAsyncConsoleMessageEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIEvent

Constructors:
- CMIAsyncConsoleMessageEvent(String message, long time)

Methods:
- long getTime()
- String getMessage()

### Class: com.Zrips.CMI.events.CMIAsyncPlayerTeleportEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIAsyncPlayerTeleportEvent(CommandSender sender, Player player, SafeTeleport safe, CMITeleportType type)

Methods:
- CMITeleportType getType()
- SafeTeleport getSafe()
- Location getTo()
- CommandSender getSender()

### Class: com.Zrips.CMI.events.CMIBackpackOpenEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIBackpackOpenEvent(ShulkerInv shulkerbackpack)
- CMIBackpackOpenEvent(ShulkerInv shulkerbackpack, double costToOpen)

Methods:
- ItemStack getShulkerBox()
- ShulkerInv getShulkerbackpack()
- Inventory getGuiInv()
- void setCostToOpen(double costToOpen)
- double getCostToOpen()

### Class: com.Zrips.CMI.events.CMICancellableEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIEvent
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancel)

### Class: com.Zrips.CMI.events.CMIChequeCreationEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIChequeCreationEvent(Player player, ItemStack cheque, double price)

Methods:
- void setCheque(ItemStack cheque)
- ItemStack getCheque()
- void setPrice(double price)
- double getPrice()

### Class: com.Zrips.CMI.events.CMIChequeUsageEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIChequeUsageEvent(Player player, ItemStack cheque, double price)

Methods:
- void setCheque(ItemStack cheque)
- ItemStack getCheque()
- void setPrice(double price)
- double getPrice()

### Class: com.Zrips.CMI.events.CMIChunkChangeEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIChunkChangeEvent(Player player, Chunk oldChunk, Chunk newChunk)

Methods:
- Chunk getNewChunk()
- Chunk getOldChunk()

### Class: com.Zrips.CMI.events.CMIConfigReloadEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIEvent

Constructors:
- CMIConfigReloadEvent(CommandSender sender)

Methods:
- CommandSender getSender()

### Class: com.Zrips.CMI.events.CMIEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- CMIEvent(boolean async)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: com.Zrips.CMI.events.CMIEventCommandEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIEventCommandEvent(Player action, Player source, EventActionManager$eventAction action, List<String> commands, List<String> sourceCommands)

Methods:
- List<String> getSourceCommands()
- void setSource(Player source)
- V setCommands(List<String> commands)
- Player getSource()
- EventActionManager$eventAction getAction()
- List<String> getCommands()

### Class: com.Zrips.CMI.events.CMIIpBanEvent
Type: Class
Extends: com.Zrips.CMI.events.CMICancellableEvent

Constructors:
- CMIIpBanEvent(CommandSender by, String ip, String reason, Long until)

Methods:
- String getReason()
- String getIp()
- CommandSender getBannedBy()
- Long getUntil()

### Class: com.Zrips.CMI.events.CMIIpUnBanEvent
Type: Class
Extends: com.Zrips.CMI.events.CMICancellableEvent

Constructors:
- CMIIpUnBanEvent(CommandSender by, String ip)

Methods:
- String getIp()
- CommandSender getBannedBy()

### Class: com.Zrips.CMI.events.CMIPlayerBanEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIEvent

Constructors:
- CMIPlayerBanEvent(CommandSender by, UUID banned, String reason, Long until)

Methods:
- String getReason()
- CommandSender getBannedBy()
- UUID getBanned()
- Long getUntil()

### Class: com.Zrips.CMI.events.CMIPlayerCancellableEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- CMIPlayerCancellableEvent(Player player, boolean async)
- CMIPlayerCancellableEvent(Player player)

Methods:
- boolean isCancelled()
- void setCancelled(boolean cancel)

### Class: com.Zrips.CMI.events.CMIPlayerChatFilterCapsEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPlayerChatFilterCapsEvent(Player player, String message)

Methods:
- String getMessage()
- void setMessage(String message)

### Class: com.Zrips.CMI.events.CMIPlayerChatFilterEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPlayerChatFilterEvent(Player player, RuleResponse response)

Methods:
- RuleResponse getResponse()

### Class: com.Zrips.CMI.events.CMIPlayerEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIEvent

Constructors:
- CMIPlayerEvent(Player player, boolean player)
- CMIPlayerEvent(Player player)

Methods:
- Player getPlayer()

### Class: com.Zrips.CMI.events.CMIPlayerFakeEntityInteractEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerEvent

Constructors:
- CMIPlayerFakeEntityInteractEvent(Player id, int id, Object obj, CMIInteractType type)

Methods:
- Object getObject()
- CMIInteractType getType()
- int getEntityId()
- void setType(CMIInteractType type)

### Class: com.Zrips.CMI.events.CMIPlayerItemsSellEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerEvent

Constructors:
- CMIPlayerItemsSellEvent(Player player, WorthManager$worthType sellType, int totalAmount, double totalPayment, HashMap<CMIMaterial, Integer> amounts, HashMap<CMIMaterial, Double> payments)

Methods:
- int getTotalAmount()
- HashMap<CMIMaterial, Double> getPayments()
- void setTotalPayment(double totalPayment)
- HashMap<CMIMaterial, Integer> getAmounts()
- double getTotalPayment()
- WorthManager$worthType getSellType()

### Class: com.Zrips.CMI.events.CMIPlayerJailEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIUserCancellableEvent

Constructors:
- CMIPlayerJailEvent(CMIUser user, CMIJailCell cell)

Methods:
- CMIJailCell getCell()
- void setCell(CMIJailCell cell)

### Class: com.Zrips.CMI.events.CMIPlayerKickEvent
Type: Class
Extends: com.Zrips.CMI.events.CMICancellableEvent

Constructors:
- CMIPlayerKickEvent(CommandSender by, UUID banned, String reason)

Methods:
- String getReason()
- CommandSender getBannedBy()
- UUID getBanned()

### Class: com.Zrips.CMI.events.CMIPlayerNickNameChangeEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIUserCancellableEvent

Constructors:
- CMIPlayerNickNameChangeEvent(CMIUser user, String nickname)

Methods:
- String getNickName()
- void setNickName(String nickname)

### Class: com.Zrips.CMI.events.CMIPlayerOpenArmorStandEditorEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPlayerOpenArmorStandEditorEvent(Player player, ArmorStand armorStand)

Methods:
- void setArmorStand(ArmorStand armorStand)
- ArmorStand getArmorStand()

### Class: com.Zrips.CMI.events.CMIPlayerSitEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPlayerSitEvent(Player player, AnimationManager$Chair chair)

Methods:
- AnimationManager$Chair getChair()

### Class: com.Zrips.CMI.events.CMIPlayerTeleportRequestEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPlayerTeleportRequestEvent(Player whoOffers, Player whoAccepts, TeleportManager$TpAction action)

Methods:
- Player getWhoAccepts()
- Player getWhoOffers()
- TeleportManager$TpAction getAction()

### Class: com.Zrips.CMI.events.CMIPlayerUnBanEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPlayerUnBanEvent(CommandSender by, Player player)

Methods:
- CommandSender getBannedBy()

### Class: com.Zrips.CMI.events.CMIPlayerUnVanishEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPlayerUnVanishEvent(Player player)

No public methods found

### Class: com.Zrips.CMI.events.CMIPlayerUnjailEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIEvent

Constructors:
- CMIPlayerUnjailEvent(CMIUser user, CMIJailCell cell)

Methods:
- CMIJailCell getCell()
- CMIUser getUser()

### Class: com.Zrips.CMI.events.CMIPlayerVanishEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPlayerVanishEvent(Player player)

No public methods found

### Class: com.Zrips.CMI.events.CMIPlayerWarnEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIUserCancellableEvent

Constructors:
- CMIPlayerWarnEvent(CMIUser user, CMIPlayerWarning warning)

Methods:
- CMIPlayerWarning getWarning()

### Class: com.Zrips.CMI.events.CMIPlayerWarpEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPlayerWarpEvent(Player target, CmiWarp warp, CommandSender sender)

Methods:
- CommandSender getCommandSender()
- CmiWarp getWarp()
- void setWarp(CmiWarp warp)
- void setCommandSender(CommandSender sender)

### Class: com.Zrips.CMI.events.CMIPortalCreateEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPortalCreateEvent(Player player, World world, PortalCreateEvent$CreateReason reason, int height, int width)

Methods:
- Vector getLowestPoint()
- World getWorld()
- int getHeight()
- void setLowestPoint(Vector lowestPoint)
- CMIPortalCreateEvent$CMIPortalType getType()
- PortalCreateEvent$CreateReason getReason()
- int getWidth()
- void setType(CMIPortalCreateEvent$CMIPortalType type)

### Class: com.Zrips.CMI.events.CMIPortalCreateEvent$CMIPortalType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Nether
- End

Methods:
- **static** CMIPortalCreateEvent$CMIPortalType valueOf(String name)
- **static** CMIPortalCreateEvent$CMIPortalType[] values()

### Class: com.Zrips.CMI.events.CMIPortalUseEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPortalUseEvent(Player portal, CMIPortal portal)

Methods:
- CMIPortal getPortal()

### Class: com.Zrips.CMI.events.CMIPvEEndEventAsync
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerEvent

Constructors:
- CMIPvEEndEventAsync(Player player)

No public methods found

### Class: com.Zrips.CMI.events.CMIPvEStartEventAsync
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPvEStartEventAsync(Player player)

No public methods found

### Class: com.Zrips.CMI.events.CMIPvPEndEventAsync
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerEvent

Constructors:
- CMIPvPEndEventAsync(Player player)

No public methods found

### Class: com.Zrips.CMI.events.CMIPvPStartEventAsync
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMIPvPStartEventAsync(Player player)

No public methods found

### Class: com.Zrips.CMI.events.CMISelectionEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerEvent

Constructors:
- CMISelectionEvent(Player player, CuboidArea area)

Methods:
- void setArea(CuboidArea area)
- CuboidArea getArea()

### Class: com.Zrips.CMI.events.CMISelectionVisualizationEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIPlayerCancellableEvent

Constructors:
- CMISelectionVisualizationEvent(Player player)
- CMISelectionVisualizationEvent(Player player, Visualizer visualizer)

Methods:
- Visualizer getVisualizer()

### Class: com.Zrips.CMI.events.CMIStaffMessageEvent
Type: Class
Extends: com.Zrips.CMI.events.CMICancellableEvent

Constructors:
- CMIStaffMessageEvent(CommandSender by, Set<Player> receivers, String message)

Methods:
- V setReceivers(Set<Player> receivers)
- Set<Player> getReceivers()
- CommandSender getSentBy()
- String getMessage()
- void setMessage(String message)

### Class: com.Zrips.CMI.events.CMIUserBalanceChangeEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIUserEvent

Constructors:
- CMIUserBalanceChangeEvent(CMIUser user, double from, double to)
- CMIUserBalanceChangeEvent(CMIUser user, double from, double to, String actionType, CMIUser source)
- CMIUserBalanceChangeEvent(CMIUser user, double from, double to, String actionType)

Methods:
- void setActionType(String actionType)
- String getActionType()
- CMIUser getSource()
- double getTo()
- double getFrom()

### Class: com.Zrips.CMI.events.CMIUserCancellableEvent
Type: Class
Extends: com.Zrips.CMI.events.CMICancellableEvent

Constructors:
- CMIUserCancellableEvent(CMIUser user)

Methods:
- CMIUser getUser()

### Class: com.Zrips.CMI.events.CMIUserEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIEvent

Constructors:
- CMIUserEvent(CMIUser user, boolean user)
- CMIUserEvent(CMIUser user)

Methods:
- CMIUser getUser()

### Class: com.Zrips.CMI.events.CMIUserHomeCreateEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIUserCancellableEvent

Constructors:
- CMIUserHomeCreateEvent(CMIUser user, CmiHome home)

Methods:
- CmiHome getHome()

### Class: com.Zrips.CMI.events.CMIUserHomeRemoveEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIUserCancellableEvent

Constructors:
- CMIUserHomeRemoveEvent(CMIUser user, CmiHome home)

Methods:
- CmiHome getHome()

### Class: com.Zrips.CMI.events.CMIUserKitAcquireEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIUserCancellableEvent

Constructors:
- CMIUserKitAcquireEvent(CMIUser user, Kit kit, boolean giveItems)

Methods:
- boolean isGiveItems()
- void setGiveItems(boolean giveItems)
- Kit getKit()

### Class: com.Zrips.CMI.events.CMIWarpCreateEvent
Type: Class
Extends: com.Zrips.CMI.events.CMICancellableEvent

Constructors:
- CMIWarpCreateEvent(CmiWarp warp)

Methods:
- CmiWarp getWarp()

### Class: com.Zrips.CMI.events.CMIWarpRemoveEvent
Type: Class
Extends: com.Zrips.CMI.events.CMIEvent

Constructors:
- CMIWarpRemoveEvent(CmiWarp warp)

Methods:
- CmiWarp getWarp()

## Package: com.Zrips.CMI.utils

### Class: com.Zrips.CMI.utils.CMIDiskUsage
Type: Class

Methods:
- **static** long getUsed()
- **static** void update()
- **static** long getTotal()
- **static** long getUsable()

### Class: com.Zrips.CMI.utils.CMIEncoder
Type: Class

Methods:
- **static** String encode(String str)
- **static** List<String> encode(List<String> str)
- **static** boolean isEncoded(String str)
- **static** List<String> decode2(List<String> str)
- **static** void initialize()
- **static** List<String> decodeList(List<String> str)
- **static** String decode(String str)

### Class: com.Zrips.CMI.utils.CMINBTListType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- END
- BYTE
- SHORT
- INT
- LONG
- FLOAT
- DOUBLE
- BYTE_
- STRING
- LIST
- COMPOUND
- INT_
- LONG_

Methods:
- **static** String getType(int id)
- **static** CMINBTListType valueOf(String name)
- **static** CMINBTListType[] values()
- int getId()

### Class: com.Zrips.CMI.utils.ChunkFix
Type: Class

Constructors:
- ChunkFix(CMI plugin)

Methods:
- void loadRegionFile(FixChunkInfo scan)

### Class: com.Zrips.CMI.utils.DateFormat
Type: Class

Methods:
- **static** String MiliToDateShort(long currentTime)
- **static** int[] splitToComponentDate(Long biggys)
- **static** String MiliToHours(long currentTime)
- **static** int[] splitToComponentTimes(Long biggys)
- **static** String MiliToDate(long currentTime)
- **static** String MiliToDate(long currentTime, String)

### Class: com.Zrips.CMI.utils.EssentialsConverter
Type: Class

Methods:
- **static** void convert(CommandSender sender, importSettings is)
- **static** void convertUsers(CommandSender sender, importSettings is)

### Class: com.Zrips.CMI.utils.EssentialsConverter$importType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- homes
- warps
- nickname
- logoutlocation
- money
- mail

Methods:
- **static** EssentialsConverter$importType valueOf(String name)
- **static** EssentialsConverter$importType[] values()

### Class: com.Zrips.CMI.utils.FileDownloader
Type: Class

Methods:
- void afterDownload()
- void failedDownload()
- void downloadUsingStream(String urlStr, String file)

### Class: com.Zrips.CMI.utils.HDConverter
Type: Class

Methods:
- **static** void convert(CommandSender sender)

### Class: com.Zrips.CMI.utils.Lag
Type: Class
Implements: java.lang.Runnable

Methods:
- **static** double getProcessCpuLoad() throws Exception
- int getTicks()
- List<Long> getLastTimes(int range)
- double getTPS()
- double getTPS(int seconds)
- void run()

### Class: com.Zrips.CMI.utils.ListEditor
Type: Class

Methods:
- **static** List<String> move(List<String> list, int place, listMoveDirection direction)
- **static** Z processEditListClean(String args, Player player, String cmd, String name, List<String> list, boolean add, String subCommand)
- **static** Z showListForEditing(Player player, String cmd, String name, List<String> list, boolean ShowAdd)
- **static** Z showListForEditing(Player player, String cmd, String name, List<String> list, boolean ShowAdd, boolean fillEmpty)

### Class: com.Zrips.CMI.utils.ListEditor$listEditorType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- text
- commands

Methods:
- **static** ListEditor$listEditorType valueOf(String name)
- **static** ListEditor$listEditorType[] values()

### Class: com.Zrips.CMI.utils.PlayerVaultManager
Type: Class

Methods:
- **static** Inventory loadOtherVault(UUID uuid, int i, int y)
- **static** boolean vaultExists(UUID uuid, int id)

### Class: com.Zrips.CMI.utils.Purge
Type: Class

Constructors:
- Purge(CMI plugin)

Methods:
- boolean isPlayerStatsEnabled()
- boolean isPlayerDataEnabled()
- void purgeLWC(UUID uuid)
- void loadConfig()
- boolean purgePlayerStatsFiles(UUID uuid, boolean chekcIfEnabled)
- void StartingPurge()
- boolean isCleanOnStart()
- boolean purgePlayerDataFiles(UUID uuid, boolean chekcIfEnabled)
- void initialize()
- boolean purgePlayerAdvancementsFiles(UUID uuid, boolean chekcIfEnabled)
- void purgeEssentialsFiles(UUID uuid)

### Class: com.Zrips.CMI.utils.Purge$PurgeType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PlayerData
- PlayerStat
- PlayerAdvancements
- Essentials
- Lwc

Methods:
- **static** Purge$PurgeType valueOf(String name)
- **static** Purge$PurgeType[] values()

### Class: com.Zrips.CMI.utils.ServerLinksManager
Type: Class

Methods:
- **static** void load()
- **static** void save()

### Class: com.Zrips.CMI.utils.SpawnUtil
Type: Class

Methods:
- **static** boolean isSpawnSpawnOnJoin()
- **static** void loadConfig()
- **static** void save()
- **static** Set<String> getIgnoredSpawnWorlds()
- **static** void addNew(String group, CMILocation loc, boolean respawn)
- **static** void addNew(String group, CMILocation loc, boolean respawn, Integer range)
- **static** V addNew(String group, CMILocation loc, boolean respawn, Integer range, Set<String> worlds)
- **static** V addNew(String group, CMILocation loc, boolean respawn, Integer range, List<World> worlds)
- **static** CMILocation getSpawnPoint(Player player)
- **static** boolean isIgnoresSpawnWorld(String worldName)
- **static** CMILocation getGroupReSpawnPoint(Player player)

### Class: com.Zrips.CMI.utils.SpawnUtil$SpawnPoint
Type: Class

Constructors:
- SpawnUtil$SpawnPoint(String group, CMILocation loc, boolean respawn)
- SpawnUtil$SpawnPoint(String group, CMILocation loc, boolean respawn, Integer rng)
- SpawnUtil$SpawnPoint(String group, CMILocation loc, boolean respawn, Integer rng, List<World> worlds)
- SpawnUtil$SpawnPoint(String group, CMILocation loc, boolean respawn, Integer rng, Set<String> worlds)

Methods:
- void setRespawn(boolean respawn)
- void setGroup(String group)
- List<String> getWorldsAsStringList()
- CMILocation getLocation()
- boolean isRespawn()
- void setLocation(CMILocation location)
- String getGroup()
- void setRng(Integer rng)
- V setWorlds(List<World> worlds)
- Integer getRng()
- List<World> getWorlds()

### Class: com.Zrips.CMI.utils.TimeManager
Type: Class

Constructors:
- TimeManager(CMI plugin)

Methods:
- void addFroozenWorlds(World world)
- **static** String to24hourAproximateShort(Long ticks, boolean trim)
- void moveSun(World world, int interval, int updateInterval, int u, boolean boosBar)
- void stopDayTimer(World world)
- void stopDayTimer(String worldName)
- void loadConfig()
- long setPTime(Player player, String time, boolean smooth)
- long setPTime(Player player, TimeInfo tInfo, boolean smooth)
- void cancelSunMove(World world)
- void cancelSunMove(World world, boolean changeCycle)
- void removeFroozenWorlds(World world)
- List<String> getWorlds()
- boolean isFroozenWorld(World world)
- long setTime(World world, String time, boolean smooth)
- long setTime(World world, TimeInfo tInfo, boolean smooth)
- void runTimer()

### Class: com.Zrips.CMI.utils.UUIDFetcher
Type: Class

Methods:
- **static** UUID getUUID(String name)

### Class: com.Zrips.CMI.utils.UnloadChunks
Type: Class

Constructors:
- UnloadChunks(CMI plugin)

Methods:
- void loadRegionFile(UCInfo scan)

### Class: com.Zrips.CMI.utils.Util
Type: Class

Constructors:
- Util(CMI plugin)

Methods:
- World getWorld(String name)
- List<ItemStack> ConvertInvToList(Inventory inv)
- Player getRandomOnlinePlayer()
- Player getRandomOnlinePlayer(Set<Player> exclude)
- Vector getVector(Location loc1, Location loc2)
- List<Player> getPlayersFromRange(Location loc, int range, boolean forced)
- List<Player> getPlayersFromRange(Location loc, int range)
- List<Player> getPlayersFromRange(Player player, Location loc, int range)
- **static** ItemStack setCustomModelData(ItemStack item, int data)
- **static** String simplifyGradientColors(String text)
- **static** File getFile(Player player)
- **static** File getFile(UUID uuid)
- boolean lookingAt(Player player, Vector target, double maxYawAngle, double)
- **static** void fixHeadNameSection(ConfigurationSection section)
- String getLineSplitter(String text)
- boolean hasSilkTouch(ItemStack is, int lvl)
- boolean canRepair(ItemStack item)
- CMIChatColor getTpsColor(Double tps)
- **static** Player getAttacker(EntityDamageEvent event)
- String getMessageReplyTo(String sender)
- Z isFullInv(ItemStack cn, List<ItemStack> list)
- int getOnlinePlayerCount()
- int getOnlinePlayerCount(World world)
- String getOnlinePlayersAsString()
- String getOnlinePlayersAsString(String ignore)
- void addMessageReplayTo(String target, String sender)
- boolean isNPC(Player player)
- **static** ItemStack setUnbreakable(ItemStack item, boolean state)
- String serializePotionEffect(PotionEffect effect)
- **static** int getOnlinePlayersCount()
- String createTextProbgressBar(int bars, float total, float current)
- double getYaw(Location loc1, Location loc2)
- TreeMap<Double, Entity> getClosestEntities(Location center, int range, double treshold, EntityType)
- **static** boolean isUnbreakable(ItemStack item)
- **static** Integer getCustomModelData(ItemStack item)
- boolean haveBlackListedItems(Player player, TeleportManager$TpAction action)
- ItemStack setEntityType(ItemStack is, EntityType type)
- Block getTargetBlock(Player player, int distance, boolean ignoreNoneSolids)
- Block getTargetBlock(Player player, int distance)
- Block getTargetBlock(Player player, Material lookingFor, int distance)
- Block getTargetBlock(Player player, Material lookingFor, int distance, boolean ignoreNoneSolids)
- **static** Util$SignSide getSignSide(Block sign, Location loc)
- ArrayList<Block> getLastTwoTargetBlock(Player player, int distance)
- ArrayList<Block> getLastTwoTargetBlock(Player player, Material lookingFor, int distance, boolean fluids)
- boolean needRepair(ItemStack item)
- Entity getClosestEntity(Location center, int range, EntityType type)
- int getPlayerTrackingRange()
- int getPlayerTrackingRange(World world)
- Entity getTargetEntity(Player player)
- Entity getTargetEntity(Player player, double pov)
- Entity getTargetEntity(Player player, boolean includeSpectator, boolean includeInvisible)
- Entity getTargetEntity(Player player, double pov, boolean, boolean includeSpectator)
- ItemStack repairItem(ItemStack item)
- List<String> getWorldList()
- int getMaxWorldHeight(World world)
- HashMap<Material, Integer> getBlackListedItems(Player player)
- String getWorldName(UUID uuid)
- Block getHighestBlockAt(Location loc, boolean includeSolids)
- int getItemData(ItemStack item)
- List<Player> getPlayersFromRangeForCounter(Location loc, int range, boolean forced)
- itemInfo getItemInfo(String text)
- String getMessageReplayTo(String sender)
- void removeMessageReplyTo(String sender)
- void addMessageReplyTo(String target, String sender)
- boolean blockedItemFromRenaming(CommandSender sender, ItemStack itemFrom, ItemStack item, String newName)
- **static** Entity getDamager(EntityDamageEvent event)
- UUID generateUUID(String playerName)
- double getDistance(Location loc1, Location loc2)
- **static** void fixItemStackFile(File file)
- void removeMessageReplayTo(String sender)
- void resendBlockInfo(Player player, Block block)
- **static** ItemStack getItemFromObject(Object itemObject)
- PotionEffect deserializePotionEffect(String effect)
- PotionEffect deserializePotionEffect(String effect, Integer overrideDuration)
- double getPitch(Location loc1, Location loc2)
- boolean validName(String name)
- boolean validName(String regex, String name)
- String convertLocToStringShort(Location loc)
- void addMessageReplyToBySender(String target, String sender)
- String translateDamageCause(String cause)

### Class: com.Zrips.CMI.utils.Util$SignSide
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FRONT
- BACK

Methods:
- **static** Util$SignSide valueOf(String name)
- **static** Util$SignSide[] values()

### Class: com.Zrips.CMI.utils.VersionChecker
Type: Class

Constructors:
- VersionChecker(CMI plugin)

Methods:
- String getOfficialVersion()
- String getOfficialVersion(int resource)
- Integer convertVersion(String v)
- String deconvertVersion(Integer v)
- void VersionCheck(Player player)

### Class: com.Zrips.CMI.utils.importSettings
Type: Class

Methods:
- importSettings set(EssentialsConverter$importType type, boolean state)
- V setMap(HashMap<EssentialsConverter$importType, Boolean> map)
- boolean is(EssentialsConverter$importType type)
- HashMap<EssentialsConverter$importType, Boolean> getMap()

