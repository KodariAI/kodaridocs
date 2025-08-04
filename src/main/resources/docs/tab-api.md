# TAB-API-5.2.5 API Reference

## Package: me.neznamy.tab.api

### Class: me.neznamy.tab.api.TabPlayer
Type: Interface

Methods:
- String getServer()
- void setExpectedProfileName(String)
- String getWorld()
- Object getPlayer()
- String getExpectedProfileName()
- void setTemporaryGroup(String)
- String getName()
- String getGroup()
- boolean isBedrockPlayer()
- boolean hasTemporaryGroup()
- boolean isLoaded()
- UUID getUniqueId()

### Class: me.neznamy.tab.api.TabAPI
Type: Abstract Class

Methods:
- TabListFormatManager getTabListFormatManager()
- ScoreboardManager getScoreboardManager()
- BossBarManager getBossBarManager()
- EventBus getEventBus()
- TabPlayer[] getOnlinePlayers()
- TabPlayer getPlayer(UUID)
- TabPlayer getPlayer(String)
- SortingManager getSortingManager()
- LayoutManager getLayoutManager()
- HeaderFooterManager getHeaderFooterManager()
- TabAPI getInstance()
- PlaceholderManager getPlaceholderManager()
- NameTagManager getNameTagManager()
- void setInstance(TabAPI)

## Package: me.neznamy.tab.api.bossbar

### Class: me.neznamy.tab.api.bossbar.BossBar
Type: Interface

Methods:
- boolean containsPlayer(TabPlayer)
- String getName()
- void setProgress(String)
- void setProgress(float)
- String getColor()
- void setTitle(String)
- boolean isAnnouncementBar()
- String getProgress()
- void removePlayer(TabPlayer)
- UUID getUniqueId()
- String getStyle()
- String getTitle()
- void setColor(String)
- void setColor(BarColor)
- void addPlayer(TabPlayer)
- void setStyle(String)
- void setStyle(BarStyle)
- List getPlayers()

### Class: me.neznamy.tab.api.bossbar.BossBarManager
Type: Interface

Methods:
- void sendBossBarTemporarily(TabPlayer, String, int)
- List getAnnouncedBossBars()
- void setBossBarVisible(TabPlayer, boolean, boolean)
- BossBar getBossBar(String)
- BossBar createBossBar(String, float, BarColor, BarStyle)
- BossBar createBossBar(String, String, String, String)
- void toggleBossBar(TabPlayer, boolean)
- void announceBossBar(String, int)
- Map getRegisteredBossBars()
- void removeBossBar(String)
- void removeBossBar(BossBar)
- boolean hasBossBarVisible(TabPlayer)

### Class: me.neznamy.tab.api.bossbar.BarColor
Type: Enum
Extends: java.lang.Enum

Methods:
- BarColor valueOf(String)
- BarColor[] values()

### Class: me.neznamy.tab.api.bossbar.BarStyle
Type: Enum
Extends: java.lang.Enum

Methods:
- BarStyle valueOf(String)
- BarStyle[] values()

## Package: me.neznamy.tab.api.event

### Class: me.neznamy.tab.api.event.EventBus
Type: Interface

Methods:
- void unregister(Object)
- void unregister(EventHandler)
- void register(Object)
- void register(Class, EventHandler)

### Class: me.neznamy.tab.api.event.EventHandler
Type: Interface

Methods:
- void handle(Object)

### Class: me.neznamy.tab.api.event.Subscribe
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: me.neznamy.tab.api.event.TabEvent
Type: Interface

No public methods found

## Package: me.neznamy.tab.api.event.player

### Class: me.neznamy.tab.api.event.player.PlayerLoadEvent
Type: Interface
Implements: me.neznamy.tab.api.event.TabEvent

Methods:
- boolean isJoin()
- TabPlayer getPlayer()

## Package: me.neznamy.tab.api.event.plugin

### Class: me.neznamy.tab.api.event.plugin.PlaceholderRegisterEvent
Type: Interface
Implements: me.neznamy.tab.api.event.TabEvent

Methods:
- String getIdentifier()
- void setRelationalPlaceholder(BiFunction)
- void setServerPlaceholder(Supplier)
- void setPlayerPlaceholder(Function)

### Class: me.neznamy.tab.api.event.plugin.TabLoadEvent
Type: Interface
Implements: me.neznamy.tab.api.event.TabEvent

No public methods found

## Package: me.neznamy.tab.api.integration

### Class: me.neznamy.tab.api.integration.VanishIntegration
Type: Abstract Class

Methods:
- void registerHandler(VanishIntegration)
- boolean isVanished(TabPlayer)
- List getHandlers()
- String getPlugin()
- void unregister()
- void unregisterHandler(VanishIntegration)
- boolean canSee(TabPlayer, TabPlayer)
- void register()

## Package: me.neznamy.tab.api.nametag

### Class: me.neznamy.tab.api.nametag.NameTagManager
Type: Interface

Methods:
- String getOriginalSuffix(TabPlayer)
- void showNameTagVisibilityView(TabPlayer, boolean)
- void setCollisionRule(TabPlayer, Boolean)
- String getOriginalReplacedSuffix(TabPlayer)
- void hideNameTagVisibilityView(TabPlayer, boolean)
- boolean hasHiddenNameTag(TabPlayer)
- boolean hasHiddenNameTag(TabPlayer, TabPlayer)
- boolean hasTeamHandlingPaused(TabPlayer)
- void toggleNameTagVisibilityView(TabPlayer, boolean)
- String getOriginalRawPrefix(TabPlayer)
- boolean hasHiddenNameTagVisibilityView(TabPlayer)
- String getCustomSuffix(TabPlayer)
- String getOriginalReplacedPrefix(TabPlayer)
- void resumeTeamHandling(TabPlayer)
- String getOriginalRawSuffix(TabPlayer)
- void setPrefix(TabPlayer, String)
- String getOriginalPrefix(TabPlayer)
- String getCustomPrefix(TabPlayer)
- Boolean getCollisionRule(TabPlayer)
- void showNameTag(TabPlayer)
- void showNameTag(TabPlayer, TabPlayer)
- void hideNameTag(TabPlayer)
- void hideNameTag(TabPlayer, TabPlayer)
- void setSuffix(TabPlayer, String)
- void pauseTeamHandling(TabPlayer)

## Package: me.neznamy.tab.api.placeholder

### Class: me.neznamy.tab.api.placeholder.Placeholder
Type: Interface

Methods:
- String getIdentifier()
- int getRefresh()

### Class: me.neznamy.tab.api.placeholder.PlaceholderManager
Type: Interface

Methods:
- RelationalPlaceholder registerRelationalPlaceholder(String, int, BiFunction)
- PlayerPlaceholder registerPlayerPlaceholder(String, int, Function)
- Placeholder getPlaceholder(String)
- ServerPlaceholder registerServerPlaceholder(String, int, Supplier)
- void unregisterPlaceholder(Placeholder)
- void unregisterPlaceholder(String)

### Class: me.neznamy.tab.api.placeholder.PlayerPlaceholder
Type: Interface
Implements: me.neznamy.tab.api.placeholder.Placeholder

Methods:
- void updateValue(TabPlayer, String)
- void update(TabPlayer)

### Class: me.neznamy.tab.api.placeholder.RelationalPlaceholder
Type: Interface
Implements: me.neznamy.tab.api.placeholder.Placeholder

Methods:
- void updateValue(TabPlayer, TabPlayer, String)
- void update(TabPlayer, TabPlayer)

### Class: me.neznamy.tab.api.placeholder.ServerPlaceholder
Type: Interface
Implements: me.neznamy.tab.api.placeholder.Placeholder

Methods:
- void updateValue(String)
- void update()

## Package: me.neznamy.tab.api.scoreboard

### Class: me.neznamy.tab.api.scoreboard.Line
Type: Interface

Methods:
- String getText()
- void setText(String)

### Class: me.neznamy.tab.api.scoreboard.Scoreboard
Type: Interface

Methods:
- void addLine(String)
- String getTitle()
- String getName()
- void unregister()
- List getLines()
- void setTitle(String)
- void removeLine(int)

### Class: me.neznamy.tab.api.scoreboard.ScoreboardManager
Type: Interface

Methods:
- void announceScoreboard(String, int)
- void showScoreboard(TabPlayer, Scoreboard)
- Scoreboard getActiveScoreboard(TabPlayer)
- void toggleScoreboard(TabPlayer, boolean)
- boolean hasCustomScoreboard(TabPlayer)
- Map getRegisteredScoreboards()
- boolean hasScoreboardVisible(TabPlayer)
- void resetScoreboard(TabPlayer)
- void removeScoreboard(String)
- void removeScoreboard(Scoreboard)
- void setScoreboardVisible(TabPlayer, boolean, boolean)
- Scoreboard createScoreboard(String, String, List)

## Package: me.neznamy.tab.api.tablist

### Class: me.neznamy.tab.api.tablist.HeaderFooterManager
Type: Interface

Methods:
- void setFooter(TabPlayer, String)
- void setHeaderAndFooter(TabPlayer, String, String)
- void setHeader(TabPlayer, String)

### Class: me.neznamy.tab.api.tablist.SortingManager
Type: Interface

Methods:
- String getOriginalTeamName(TabPlayer)
- String getForcedTeamName(TabPlayer)
- void forceTeamName(TabPlayer, String)

### Class: me.neznamy.tab.api.tablist.TabListFormatManager
Type: Interface

Methods:
- String getOriginalSuffix(TabPlayer)
- void setName(TabPlayer, String)
- String getCustomName(TabPlayer)
- String getOriginalReplacedSuffix(TabPlayer)
- String getOriginalName(TabPlayer)
- String getOriginalRawPrefix(TabPlayer)
- String getOriginalReplacedName(TabPlayer)
- String getCustomSuffix(TabPlayer)
- String getOriginalReplacedPrefix(TabPlayer)
- String getOriginalRawName(TabPlayer)
- String getOriginalRawSuffix(TabPlayer)
- void setPrefix(TabPlayer, String)
- String getOriginalPrefix(TabPlayer)
- String getCustomPrefix(TabPlayer)
- void setSuffix(TabPlayer, String)

## Package: me.neznamy.tab.api.tablist.layout

### Class: me.neznamy.tab.api.tablist.layout.Layout
Type: Interface

Methods:
- String getName()
- void addFixedSlot(int, String)
- void addFixedSlot(int, String, String)
- void addFixedSlot(int, String, int)
- void addFixedSlot(int, String, String, int)
- void addGroup(String, int[])

### Class: me.neznamy.tab.api.tablist.layout.LayoutManager
Type: Interface

Methods:
- void resetLayout(TabPlayer)
- Layout createNewLayout(String)
- Layout getLayout(String)
- void sendLayout(TabPlayer, Layout)

