# CyberLevels-1.0.2-com-bitaspire-cyberlevels API Reference

**Package Filter:** `com.bitaspire.cyberlevels`

## Package: com.bitaspire.cyberlevels

### Class: com.bitaspire.cyberlevels.CyberLevels
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- GlobalScheduler scheduler()
- CyberCore core()
- Cache cache()
- double serverVersion()
- **static** CyberLevels instance()
- String getAuthors()
- boolean isEnabled(String)
- void logger(String[])
- void reloadPlugin()
- UserManager userManager()
- LevelSystem levelSystem()
- void onEnable()
- void onDisable()

### Class: com.bitaspire.cyberlevels.Message
Type: Class

Methods:
- Message single(Function)
- Message$Values keys(String[])
- Message placeholder(String, Object)
- Message list(List)
- Message list(String[])
- Message list(Function)
- boolean send(Player)
- boolean send(LevelUser)
- boolean send()
- Message operator(UnaryOperator)
- Message player(Player)
- Message player(LevelUser)

### Class: com.bitaspire.cyberlevels.Message$Values
Type: Class

Methods:
- Message values(Object[])

## Package: com.bitaspire.cyberlevels.cache

### Class: com.bitaspire.cyberlevels.cache.AntiAbuse
Type: Class

Methods:
- boolean isSilkTouchEnabled()
- boolean includeNaturalCrops()
- Map getModules()
- void unregister()
- boolean onlyNaturalBlocks()
- Map getAntiAbuses()
- CyberLevels getMain()
- void register()

### Class: com.bitaspire.cyberlevels.cache.Cache
Type: Class

Methods:
- EarnExp earnExp()
- AntiAbuse antiAbuse()
- void loadSecondaryFiles()
- Lang lang()
- Config config()
- Rewards rewards()
- Levels levels()

### Class: com.bitaspire.cyberlevels.cache.Config
Type: Class

Methods:
- boolean isMultiplierCommands()
- boolean isExpIntegerOnly()
- boolean preventDuplicateRewards()
- boolean isAutoSaveEnabled()
- boolean isMessagesOnConsole()
- boolean isLeaderboardEnabled()
- boolean syncLeaderboardOnAutoSave()
- boolean isMessagesOnAutoSave()
- boolean stackComboExp()
- void update()
- boolean autoUpdateEarnExp()
- boolean useBigDecimalSystem()
- CLVFile getFile()
- int getAutoSaveInterval()
- Config$Database database()
- boolean leaderboardInstantUpdate()
- boolean roundEarnExp()
- int getRoundingDigits()
- boolean autoUpdateLang()
- boolean isMultiplierEvents()
- boolean addLevelRewards()
- boolean isRoundingEnabled()
- boolean autoUpdateConfig()

### Class: com.bitaspire.cyberlevels.cache.Config$Database
Type: Class

Methods:
- String getPassword()
- String getDatabase()
- String getPort()
- String getType()
- String getTable()
- boolean isEnabled()
- String getSqliteFile()
- String getHost()
- String getUsername()
- boolean isSsl()

### Class: com.bitaspire.cyberlevels.cache.EarnExp
Type: Class

Methods:
- Map getExpSources()
- void unregister()
- void update()
- void register()

### Class: com.bitaspire.cyberlevels.cache.Lang
Type: Class

Methods:
- List getGainedExp()
- List getLostExp()
- List getSetExp()
- String getProgressIncompleteColor()
- void update()
- List getHelpPlayer()
- List getHelpAdmin()
- CLVFile getFile()
- List getNotNumber()
- List getAddedExp()
- List getNoPermission()
- List getRemovedExp()
- List getPlayerNotFound()
- List getTopFooter()
- Lang$LeaderboardKeys leaderboardKeys()
- List getAutoSave()
- List getSetLevel()
- String getPrefix()
- List getReloaded()
- List getTopHeader()
- boolean sendMessage(Player, Function, String[], Object[])
- boolean sendMessage(Player, Function, String, Object)
- boolean sendMessage(Player, Function)
- List getLevelInfo()
- List getLostLevels()
- String getProgressCompleteColor()
- String getProgressEndColor()
- List getGainedLevels()
- List getPurgePlayer()
- List getRemovedLevels()
- String getProgressBar()
- List getTopContent()
- List getReloading()
- List getAddedLevels()

### Class: com.bitaspire.cyberlevels.cache.Lang$LeaderboardKeys
Type: Class

Methods:
- String getLoadingName()
- String getLoadingExp()
- String getNoPlayerLevel()
- String getLoadingLevel()
- String getNoPlayerExp()
- String getNoPlayerName()

### Class: com.bitaspire.cyberlevels.cache.Levels
Type: Class

Methods:
- long getStartLevel()
- int getStartExp()
- Map getCustomFormulas()
- String getFormula()
- long getMaxLevel()

### Class: com.bitaspire.cyberlevels.cache.Rewards
Type: Class

Methods:
- Map getRewards()

## Package: com.bitaspire.cyberlevels.command

### Class: com.bitaspire.cyberlevels.command.CLVCommand
Type: Class
Implements: org.bukkit.command.CommandExecutor

Methods:
- boolean onCommand(CommandSender, Command, String, String[])

### Class: com.bitaspire.cyberlevels.command.CLVTabComplete
Type: Class
Implements: org.bukkit.command.TabCompleter

Methods:
- List onTabComplete(CommandSender, Command, String, String[])

## Package: com.bitaspire.cyberlevels.hook

### Class: com.bitaspire.cyberlevels.hook.HookManager
Type: Class

Methods:
- void unregister()
- void register()

## Package: com.bitaspire.cyberlevels.level

### Class: com.bitaspire.cyberlevels.level.AntiAbuse
Type: Interface

Methods:
- boolean isLimited(Player, ExpSource)
- boolean isLimiterEnabled()
- long getLimiterAmount()
- void resetLimiter(Player)
- void resetCooldown(Player)
- boolean isWorldsWhitelist()
- void resetLimiters()
- void cancelTimer()
- boolean isWorldsEnabled()
- int getCooldownLeft(Player)
- int getCooldownTime()
- void resetCooldowns()
- AntiAbuse$Timer getTimer()
- int getLimiter(Player)
- boolean isCooldownEnabled()

### Class: com.bitaspire.cyberlevels.level.ExpSource
Type: Interface

Methods:
- boolean isInList(String, boolean)
- boolean isInList(String)
- int getInterval()
- String getName()
- String getCategory()
- List getIncludeList()
- boolean includes()
- boolean useSpecifics()
- double getPartialMatchesExp(String)
- boolean isWhitelist()
- ExpSource$Range getRange()
- boolean hasPermission(Player, boolean)
- boolean hasPermission(Player)
- boolean isEnabled()
- ExpSource$Range getSpecificRange(String)
- ExpSource$Registrable getRegistrable()
- List getSpecificList()

### Class: com.bitaspire.cyberlevels.level.ExpSource$Range
Type: Interface

Methods:
- double getRandom()
- double getMin()
- double getMax()

### Class: com.bitaspire.cyberlevels.level.ExpSource$Registrable
Type: Interface

Methods:
- void unregister()
- void register()

### Class: com.bitaspire.cyberlevels.level.Formula
Type: Interface

Methods:
- String getAsString()
- Number evaluate(Player)

### Class: com.bitaspire.cyberlevels.level.Leaderboard
Type: Interface

Methods:
- void update()
- boolean isUpdating()
- int checkPosition(LevelUser)
- int checkPosition(Player)
- LevelUser getTopPlayer(int)
- List getTopTenPlayers()

### Class: com.bitaspire.cyberlevels.level.LevelSystem
Type: Interface

Methods:
- boolean checkAntiAbuse(Player, ExpSource)
- String replacePlaceholders(String, Player, boolean)
- Leaderboard getLeaderboard()
- int getStartExp()
- List getRewards(long)
- String roundDecimalAsString(Number)
- long getMaxLevel()
- Number getRequiredExp(long, Player)
- long getStartLevel()
- Map getExpSources()
- String getProgressBar(Number, Number)
- String getPercent(Number, Number)
- Number roundDecimal(Number)
- Map getAntiAbuses()
- Formula getCustomFormula(long)
- Formula getFormula()
- Operator getOperator()

### Class: com.bitaspire.cyberlevels.level.Operator
Type: Interface

Methods:
- Number add(Number, Number)
- Number zero()
- int compare(Number, Number)
- Number abs(Number)
- Number min(Number, Number)
- Number max(Number, Number)
- Number negate(Number)
- Number valueOf(String) throws NumberFormatException
- Number subtract(Number, Number)
- Number fromDouble(double)
- String toString(Number)
- Number divide(Number, Number)
- Number divide(Number, Number, int, RoundingMode)
- Number multiply(Number, Number)

### Class: com.bitaspire.cyberlevels.level.Reward
Type: Interface

Methods:
- void executeCommands(Player)
- void sendMessages(Player)
- void playSound(Player)
- void giveAll(Player)

### Class: com.bitaspire.cyberlevels.level.AntiAbuse$Timer
Type: Class

Methods:
- void start()
- void purge()
- long getResetEpochTime()

## Package: com.bitaspire.cyberlevels.listener

### Class: com.bitaspire.cyberlevels.listener.Listeners
Type: Class

Methods:
- void unregister()
- void register()

## Package: com.bitaspire.cyberlevels.user

### Class: com.bitaspire.cyberlevels.user.Database
Type: Interface

Methods:
- void disconnect()
- void removeUser(UUID)
- void addUser(LevelUser, boolean)
- void addUser(LevelUser)
- Set getUuids()
- LevelUser getUser(UUID)
- LevelUser getUser(Player)
- boolean isConnected()
- void updateUser(LevelUser)
- boolean isUserLoaded(LevelUser)
- void connect()

### Class: com.bitaspire.cyberlevels.user.LevelUser
Type: Interface
Implements: java.lang.Comparable

Methods:
- Player getPlayer()
- String getName()
- void addLevel(long)
- void addExp(Number, boolean)
- void addExp(String, boolean)
- boolean isOnline()
- void removeLevel(long)
- Number getExp()
- void setLevel(long, boolean)
- long getLevel()
- Number getRemainingExp()
- Number getRequiredExp()
- OfflinePlayer getOffline()
- boolean hasParentPerm(String, boolean)
- void removeExp(Number)
- void removeExp(String)
- String getProgressBar()
- UUID getUuid()
- void setExp(Number, boolean, boolean, boolean)
- void setExp(String, boolean, boolean, boolean)
- void setExp(Number, boolean, boolean)
- void setExp(String, boolean, boolean)
- String getPercent()
- double getMultiplier()

### Class: com.bitaspire.cyberlevels.user.UserManager
Type: Interface

Methods:
- void loadOnlinePlayers()
- void savePlayer(Player, boolean)
- List getUsersList()
- void cancelAutoSave()
- Database getDatabase()
- void saveOnlinePlayers(boolean)
- void removeUser(UUID)
- Set getUsers()
- LevelUser getUser(UUID)
- LevelUser getUser(Player)
- LevelUser getUser(String)
- void startAutoSave()
- void loadPlayer(OfflinePlayer)
- void loadPlayer(Player)
- void saveUser(LevelUser)

