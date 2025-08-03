# VulcanAPI API Reference

## Package: me.frep.vulcan.api

### Class: me.frep.vulcan.api.VulcanAPI
Type: Interface

Methods:
- void flag(Player, String, String, String)
- Map getBroadcastPunishments()
- Map getAlertIntervals()
- IPlayerData getPlayerData(Player)
- Map getRandomRotationIntervals()
- void executeBanWave()
- Map getMinimumViolationsToNotify()
- double getTps()
- Map getHotbarShuffleIntervals()
- String getVulcanVersion()
- Map getRandomRotation()
- List getChecks(Player)
- Set getChecks()
- Check getCheck(Player, String, char)
- int getSensitivity(Player)
- Map getMinimumTps()
- void toggleAlerts(Player)
- Map getMaximumPings()
- Map getEnabledChecks()
- boolean isFrozen(Player)
- int getTransactionPing(Player)
- int getPlayerViolations(Player)
- void toggleVerbose(Player)
- double getKurtosis(Player)
- int getTotalViolations(Player)
- Map getPunishmentCommands()
- String getServerVersion()
- Map getBufferDecays()
- int getPing(Player)
- Map getHotbarShuffle()
- int getJoinTicks(Player)
- int getMovementViolations(Player)
- boolean hasAlertsEnabled(Player)
- int getTicks()
- boolean isCheckEnabled(String)
- Map getMaxViolations()
- Map getMaxBuffers()
- String getClientVersion(Player)
- Map getHotbarShuffleMinimums()
- void setFrozen(Player, boolean)
- double getCps(Player)
- Map getPunishableChecks()
- Map getBufferMultiples()
- Map getCheckData()
- Map getRandomRotationMinimums()
- int getCombatViolations(Player)

## Package: me.frep.vulcan.api.check

### Class: me.frep.vulcan.api.check.Check
Type: Interface

Methods:
- double getMaxBuffer()
- char getDisplayType()
- String getName()
- double getBuffer()
- void setBuffer(double)
- double getBufferMultiple()
- String getCategory()
- int getAlertInterval()
- String getDescription()
- int getMaxVl()
- int getMinimumVlToNotify()
- boolean isExperimental()
- String getDisplayName()
- char getType()
- String getComplexType()
- int getVl()
- void setVl(int)
- boolean isPunishable()
- double getBufferDecay()

### Class: me.frep.vulcan.api.check.ICheckData
Type: Interface

Methods:
- double getMaxBuffer()
- boolean isRandomRotation()
- List getPunishmentCommands()
- double getBufferMultiple()
- boolean isBroadcastPunishment()
- int getMinimumVlToShuffleHotbar()
- int getAlertInterval()
- int getMinimumVlToRandomlyRotate()
- int getMinimumVlToNotify()
- int getMaxViolations()
- double getMinimumTps()
- boolean isEnabled()
- int getRandomRotationInterval()
- boolean isHotbarShuffle()
- int getMaxPing()
- boolean isPunishable()
- double getBufferDecay()

## Package: me.frep.vulcan.api.data

### Class: me.frep.vulcan.api.data.IPlayerData
Type: Interface

Methods:
- long getJoinTime()
- int getTotalViolations()
- int getScaffoldViolations()
- int getAutoClickerViolations()
- String getClientBrand()
- int getTimerViolations()
- int getJoinTicks()
- int getMovementViolations()
- long getLastClientBrandAlert()
- int getPlayerViolations()
- int getCombatViolations()

## Package: me.frep.vulcan.api.event

### Class: me.frep.vulcan.api.event.VulcanDisableAlertsEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- long getTimestamp()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanDiscordWebhookPunishEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- long getTimestamp()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanEnableAlertsEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- long getTimestamp()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanFlagEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- Check getCheck()
- String getInfo()
- long getTimestamp()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanGhostBlockEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- long getTimestamp()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanJudgementDayEndEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanJudgementDayStartEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanPostFlagEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- Check getCheck()
- String getInfo()
- long getTimestamp()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanPunishEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- Check getCheck()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanPunishmentLogCreateEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanRegisterPlayerEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanSetbackEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- Check getCheck()
- long getTimestamp()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.frep.vulcan.api.event.VulcanViolationResetEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()

