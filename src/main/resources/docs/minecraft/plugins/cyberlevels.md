# CyberLevels-0.5.9 (2)-net-zerotoil-dev-cyberlevels API Reference

**Package Filter:** `net.zerotoil.dev.cyberlevels`

## Package: net.zerotoil.dev.cyberlevels

### Class: net.zerotoil.dev.cyberlevels.CyberLevels
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- String serverFork()
- int serverVersion()
- LangUtils langUtils()
- LevelUtils levelUtils()
- void logger(String[])
- void onEnable()
- void onDisable()
- void reloadClasses(boolean)
- String getAuthors()
- PlayerUtils playerUtils()
- Files files()
- LevelCache levelCache()
- EXPListeners expListeners()
- EXPCache expCache()

## Package: net.zerotoil.dev.cyberlevels.addons

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics
Type: Class

Methods:
- void addCustomChart(Metrics$CustomChart)

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics$AdvancedBarChart
Type: Class
Extends: net.zerotoil.dev.cyberlevels.addons.Metrics$CustomChart

No public methods found

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics$AdvancedPie
Type: Class
Extends: net.zerotoil.dev.cyberlevels.addons.Metrics$CustomChart

No public methods found

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics$CustomChart
Type: Abstract Class

Methods:
- Metrics$JsonObjectBuilder$JsonObject getRequestJsonObject(BiConsumer<String, Throwable>, boolean)

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics$DrilldownPie
Type: Class
Extends: net.zerotoil.dev.cyberlevels.addons.Metrics$CustomChart

Methods:
- Metrics$JsonObjectBuilder$JsonObject getChartData() throws Exception

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics$JsonObjectBuilder
Type: Class

Methods:
- Metrics$JsonObjectBuilder$JsonObject build()
- Metrics$JsonObjectBuilder appendNull(String)
- Metrics$JsonObjectBuilder appendField(String, String)
- Metrics$JsonObjectBuilder appendField(String, int)
- Metrics$JsonObjectBuilder appendField(String, Metrics$JsonObjectBuilder$JsonObject)
- Metrics$JsonObjectBuilder appendField(String, String[])
- Metrics$JsonObjectBuilder appendField(String, int[])
- Metrics$JsonObjectBuilder appendField(String, Metrics$JsonObjectBuilder$JsonObject[])

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics$JsonObjectBuilder$JsonObject
Type: Class

Methods:
- String toString()

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics$MetricsBase
Type: Class

Methods:
- void addCustomChart(Metrics$CustomChart)

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics$MultiLineChart
Type: Class
Extends: net.zerotoil.dev.cyberlevels.addons.Metrics$CustomChart

No public methods found

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics$SimpleBarChart
Type: Class
Extends: net.zerotoil.dev.cyberlevels.addons.Metrics$CustomChart

No public methods found

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics$SimplePie
Type: Class
Extends: net.zerotoil.dev.cyberlevels.addons.Metrics$CustomChart

No public methods found

### Class: net.zerotoil.dev.cyberlevels.addons.Metrics$SingleLineChart
Type: Class
Extends: net.zerotoil.dev.cyberlevels.addons.Metrics$CustomChart

No public methods found

### Class: net.zerotoil.dev.cyberlevels.addons.PlaceholderAPI
Type: Class
Extends: me.clip.placeholderapi.expansion.PlaceholderExpansion

Methods:
- String getVersion()
- String onRequest(OfflinePlayer, String)
- String getAuthor()
- String getIdentifier()
- boolean persist()

## Package: net.zerotoil.dev.cyberlevels.api.events

### Class: net.zerotoil.dev.cyberlevels.api.events.XPChangeEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- double getOldXP()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getNewXP()
- void setAmount(double)
- double getAmount()

## Package: net.zerotoil.dev.cyberlevels.commands

### Class: net.zerotoil.dev.cyberlevels.commands.CLVCommand
Type: Class
Implements: org.bukkit.command.CommandExecutor

Methods:
- boolean onCommand(CommandSender, Command, String, String[])

### Class: net.zerotoil.dev.cyberlevels.commands.CLVTabComplete
Type: Class
Implements: org.bukkit.command.TabCompleter

Methods:
- List<String> onTabComplete(CommandSender, Command, String, String)

## Package: net.zerotoil.dev.cyberlevels.interfaces

### Class: net.zerotoil.dev.cyberlevels.interfaces.Reflection
Type: Interface

Methods:
- void sendPacket(Player, Object)
- Class<*> getNMSClass(String)

## Package: net.zerotoil.dev.cyberlevels.listeners

### Class: net.zerotoil.dev.cyberlevels.listeners.AntiAbuseListeners
Type: Class
Implements: org.bukkit.event.Listener

No public methods found

### Class: net.zerotoil.dev.cyberlevels.listeners.EXPListeners
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- boolean checkAbuse(Player, EXPEarnEvent)
- void sendExp(Player, EXPEarnEvent, String)
- void sendPermissionExp(Player, EXPEarnEvent)

### Class: net.zerotoil.dev.cyberlevels.listeners.EXPListenersV10
Type: Class
Implements: org.bukkit.event.Listener

No public methods found

### Class: net.zerotoil.dev.cyberlevels.listeners.JoinListener
Type: Class
Implements: org.bukkit.event.Listener

No public methods found

## Package: net.zerotoil.dev.cyberlevels.listeners.hooks

### Class: net.zerotoil.dev.cyberlevels.listeners.hooks.RivalHarvesterHoesHook
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- boolean checkAbuse(Player, EXPEarnEvent)
- void onRivalBlockBreak(RivalBlockBreakEvent)
- void sendExp(Player, EXPEarnEvent, String)

## Package: net.zerotoil.dev.cyberlevels.objects

### Class: net.zerotoil.dev.cyberlevels.objects.ActionBar$GetActionBar
Type: Interface

Methods:
- void send(Player, String)

### Class: net.zerotoil.dev.cyberlevels.objects.Title$GetTitle
Type: Interface

Methods:
- void send(Player, String, String, int, int, int)

### Class: net.zerotoil.dev.cyberlevels.objects.ActionBar
Type: Class
Implements: net.zerotoil.dev.cyberlevels.interfaces.Reflection

Methods:
- ActionBar$GetActionBar getMethod()

### Class: net.zerotoil.dev.cyberlevels.objects.MySQL
Type: Class

Methods:
- void disconnect()
- PlayerData getPlayerData(Player)
- void updatePlayer(Player)
- List<LeaderboardPlayer> getAllPlayers()
- boolean isConnected()
- boolean playerInTable(Player)
- boolean playerInTable(String)
- void addTable(String)
- void addTable(String, String)

### Class: net.zerotoil.dev.cyberlevels.objects.RewardObject
Type: Class

Methods:
- void giveReward(Player)
- void sendMessage(Player)

### Class: net.zerotoil.dev.cyberlevels.objects.Title
Type: Class
Implements: net.zerotoil.dev.cyberlevels.interfaces.Reflection

Methods:
- Title$GetTitle newTitle()
- Title$GetTitle getMethod()

## Package: net.zerotoil.dev.cyberlevels.objects.antiabuse

### Class: net.zerotoil.dev.cyberlevels.objects.antiabuse.AntiAbuse
Type: Class

Methods:
- boolean isLimited(Player, String)
- long getPlayerLimiter(Player)
- void resetLimiters()
- boolean isCoolingDown(Player, String)
- void cancelTimer()
- long getPlayerCooldown(Player)
- void resetLimiter(Player)
- void resetCooldowns()
- boolean isWorldLimited(Player, String)
- void resetCooldown(Player)

### Class: net.zerotoil.dev.cyberlevels.objects.antiabuse.TimedAbuseReset
Type: Class

Methods:
- long timeToReset()
- void formatTime(boolean) throws ParseException
- void run(long)

## Package: net.zerotoil.dev.cyberlevels.objects.exp

### Class: net.zerotoil.dev.cyberlevels.objects.exp.EXPCache
Type: Class

Methods:
- void startTimedEXP()
- boolean isOnlyNaturalBlocks()
- Map<String, EXPEarnEvent> expEarnEvents()
- void cancelAntiAbuseTimers()
- boolean roundExp()
- boolean isPreventSilkTouchAbuse()
- boolean isAntiAbuse(Player, String)
- void loadAntiAbuse()
- boolean useDouble()
- void cancelTimedEXP()
- void loadExpEvents()
- boolean isIncludeNaturalCrops()

### Class: net.zerotoil.dev.cyberlevels.objects.exp.EXPEarnEvent
Type: Class

Methods:
- boolean hasPartialMatches(String, boolean)
- String getName()
- boolean isSpecificEnabled()
- HashMap<String, Double> getSpecificMax()
- String getCategory()
- double getMaxEXP()
- boolean isInGeneralList(String)
- double getPartialMatchesExp(String)
- double getSpecificExp(String)
- HashMap<String, Double> getSpecificMin()
- **static** Random getRandom()
- double getMinEXP()
- boolean isWhitelist()
- List<String> getList()
- Boolean getEnabled()
- boolean hasPermission(Player)
- boolean isEnabled()
- boolean isIncludedEnabled()
- boolean isInSpecificList(String)
- boolean hasGeneralPermission(Player)
- double getGeneralExp()

## Package: net.zerotoil.dev.cyberlevels.objects.files

### Class: net.zerotoil.dev.cyberlevels.objects.files.ConfigUpdater
Type: Class

Methods:
- **static** V update(Plugin, String, File, List<String>) throws IOException

### Class: net.zerotoil.dev.cyberlevels.objects.files.Files
Type: Class

Methods:
- YAMLFile get(String)
- HashMap<String, YAMLFile> getFiles()
- Configuration getConfig(String)
- void addFile(String, String)
- void loadFiles()

### Class: net.zerotoil.dev.cyberlevels.objects.files.KeyBuilder
Type: Class
Implements: java.lang.Cloneable

Methods:
- **static** String getIndents(String, char)
- boolean isSubKey(String)
- boolean isConfigSectionWithKeys()
- boolean isSubKeyOf(String)
- **static** boolean isSubKeyOf(String, String, char)
- boolean isConfigSection()
- void removeLastKey()
- boolean isEmpty()
- String toString()
- String getLastKey()
- void parseLine(String)

### Class: net.zerotoil.dev.cyberlevels.objects.files.YAMLFile
Type: Class

Methods:
- void updateConfig()
- void reloadConfig()
- void saveDefaultConfig()
- FileConfiguration getConfig()
- void saveConfig() throws IOException

## Package: net.zerotoil.dev.cyberlevels.objects.leaderboard

### Class: net.zerotoil.dev.cyberlevels.objects.leaderboard.Leaderboard
Type: Class

Methods:
- void updateLeaderboard()
- int checkFrom(Player)
- boolean isUpdating()
- List<LeaderboardPlayer> getTopTenPlayers()
- LeaderboardPlayer getTopPlayer(int)

### Class: net.zerotoil.dev.cyberlevels.objects.leaderboard.LeaderboardPlayer
Type: Class
Implements: java.lang.Comparable

Methods:
- long getLevel()
- OfflinePlayer getPlayer()
- String getUUID()
- int compareTo(Object)
- double getExp()

## Package: net.zerotoil.dev.cyberlevels.objects.levels

### Class: net.zerotoil.dev.cyberlevels.objects.levels.LevelCache
Type: Class

Methods:
- boolean addLevelReward()
- Long maxLevel()
- void loadOnlinePlayers()
- boolean isMessageConsole()
- boolean isPreventDuplicateRewards()
- Leaderboard getLeaderboard()
- void cancelAutoSave()
- Map<Player, PlayerData> playerLevels()
- void saveOnlinePlayers(boolean)
- boolean isLeaderboardEnabled()
- Double startExp()
- boolean doEventMultiplier()
- boolean doCommandMultiplier()
- void loadLeaderboard()
- boolean isLeaderboardInstantUpdate()
- Long startLevel()
- void loadPlayer(Player)
- Map<Long, LevelData> levelData()
- void loadLevelData()
- void savePlayer(Player, boolean)
- void clearLevelData()
- boolean isStackComboExp()
- void loadRewards()
- MySQL getMySQL()
- void startAutoSave()

### Class: net.zerotoil.dev.cyberlevels.objects.levels.LevelData
Type: Class

Methods:
- Double getRequiredExp(Player)
- void addReward(RewardObject)
- void clearRewards()
- List<RewardObject> getRewards()
- V setRewards(List<RewardObject>)
- void setLevel(Long)

### Class: net.zerotoil.dev.cyberlevels.objects.levels.PlayerData
Type: Class

Methods:
- Long getLevel()
- void setMaxLevel(Long)
- Player getPlayer()
- double nextExpRequirement()
- void removeExp(double)
- void addLevel(long)
- void setExp(double, boolean, boolean)
- void setExp(double, boolean, boolean, boolean)
- void addExp(double, boolean)
- void addExp(double, double, boolean, boolean)
- String toString()
- Long getMaxLevel()
- void removeLevel(long)
- Double getExp()
- void setLevel(long, boolean)

## Package: net.zerotoil.dev.cyberlevels.utilities

### Class: net.zerotoil.dev.cyberlevels.utilities.FontInfo
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
- RIGHT_PARENTHESIS
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
- BAR_PIECE

Methods:
- **static** FontInfo valueOf(String)
- **static** FontInfo[] values()
- **static** FontInfo getDefaultFontInfo(char)
- int getLength()
- int getBoldLength()
- char getCharacter()

### Class: net.zerotoil.dev.cyberlevels.utilities.LangUtils
Type: Class

Methods:
- void sendCentered(Player, String)
- List<String> convertList(ConfigurationSection, String)
- String colorize(Player, String)
- String parseFormat(String, String)
- void sendMixed(Player, String)
- String parsePAPI(Player, String)
- void sendMessage(Player, Player, String)
- void sendMessage(Player, String)
- void sendMessage(Player, String, boolean)
- void sendMessage(Player, String, boolean, boolean)
- void sendMessage(Player, Player, String, boolean, boolean, String[], String[])
- void sendHelp(Player, boolean)
- void title(Player, String[], String[])
- void actionBar(Player, String)
- void typeMessage(Player, String)

### Class: net.zerotoil.dev.cyberlevels.utilities.LevelUtils
Type: Class

Methods:
- int getDecimals()
- String progressBar(Double, Double)
- String roundStringDecimal(double)
- String generalFormula()
- String getPercent(Double, Double)
- double roundDecimal(double)
- String getPlaceholders(String, Player, boolean)
- String getPlaceholders(String, Player, boolean, boolean)
- Configuration levelsYML()
- String levelFormula(long)
- Configuration langYML()

### Class: net.zerotoil.dev.cyberlevels.utilities.Logger
Type: Class

Methods:
- void log(CommandSender, String[])
- void log(String[])
- void playerLog(Player, String[])
- void rawLog(String[])

### Class: net.zerotoil.dev.cyberlevels.utilities.PlayerUtils
Type: Class

Methods:
- boolean hasParentPerm(Player, String, boolean)
- double getMultiplier(Player)

