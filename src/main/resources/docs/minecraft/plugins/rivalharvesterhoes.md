# RivalHarvesterHoesAPI (2) API Reference

## Package: me.rivaldev.harvesterhoes

### Class: me.rivaldev.harvesterhoes.Main
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- void setupBentoBox()
- CacheHandler getCacheHandler()
- LevelManager getLevelManager()
- ArrayList<String> getAllEnchants()
- void setupShopGUIPlus()
- void setupAureliumSkills()
- void generateFiles()
- void registerPlugins()
- void openPage(String, Player)
- void versionDetector()
- **static** String timeAsStringSmall(long)
- boolean is1_20Version()
- **static** boolean isHoeMaterial(ItemStack)
- String getFormattedInt(int)
- void registerCommands()
- boolean getProtocolLibEnabled()
- void registerCrops()
- NewCropCaching getModernCropCache()
- void setupCyberLevels()
- boolean getUltimateSkillsEnabled()
- boolean getSuperiorSkyBlockHookCanBreak(Player, Location)
- ItemStack EssenceItem()
- boolean isAboveVersion(String, String)
- void setupJobs()
- void setupProtocolLib()
- **static** String timeAsString(long)
- SQLManager getSQLManager()
- void delayedFullInventory(Player)
- void cacheZoneBlocks()
- boolean getSuperiorSkyBlockHookIsEnabled()
- void setupEcoSkills()
- ArrayList<String> nbtProcEnchants()
- boolean isDouble(String)
- NMSManager setupNMS()
- String extractMinecraftVersion(String)
- void setupMCMMO()
- ArrayList<String> enchantBooks()
- **static** boolean isAHoe(ItemStack)
- void handleShop(Player, String, String)
- **static** boolean isHoe(Player)
- boolean getFactionsEnabled()
- ItemStack addGlow(ItemStack, boolean)
- void onEnable()
- void setupCitizens()
- EssenceCaching getEssenceCache()
- void setupOptimalSkills()
- void onDisable()
- void registerListeners()
- EntityHider entityHider()
- boolean getOptimalSkillsEnabled()
- boolean getMcMMOHookIsEnabled()
- void setupGriefPrevention()
- boolean getEconomyShopGUI()
- String getFormattedLong(Long)
- ItemStack getPageItems(String, String, Player)
- void setupUltimateCoreSkills()
- boolean getSuperBoostersEnabled()
- void setupUltimateCoreCollections()
- boolean getBentoBoxEnabled()
- void loadEnchants()
- void debug(String)
- boolean isLong(String)
- EntityHider getEntityHider()
- void loadEnchantRewards()
- ProtocolLibHook getProtocolLibHook()
- NMSManager getNMSHandler()
- void setupEconomy()
- void setupEnchantPlugins()
- boolean isPerPlayerHoe()
- boolean getQuestsEnabled()
- EconomyManager getEconomy()
- ArrayList<String> CapProcEnchants()
- boolean getUltimateCollectionsEnabled()
- void setupWorldGuard()
- boolean getWorldGuardEnabled()
- void setupEconomyHandler()
- void setupSuperiorSkyblock()
- EnchantLogic getEnchantLogic()
- CommentedConfiguration getConfig()
- FileConfiguration getConfig()
- boolean getGriefPreventionEnabled()
- LevelManager setupLevelManager()
- boolean getEcoSkills()
- boolean isPerPlayerHoeEnchants()
- void loadDropsPrice()
- boolean getAureliumEnabled()
- void setupFactionsBridge()
- void setupXLTournaments()
- boolean getShopGUIPlusHookIsEnabled()
- void setupSuperBoosters()
- void onLoad()
- void registerEconomy(EconomyManager)
- **static** String longToDate(long)
- StandModelLib getStandModelLib()
- String getFormattedDouble(double)

### Class: me.rivaldev.harvesterhoes.Metrics$AdvancedBarChart
Type: Class
Extends: me.rivaldev.harvesterhoes.Metrics$CustomChart

No public methods found

### Class: me.rivaldev.harvesterhoes.Metrics$AdvancedPie
Type: Class
Extends: me.rivaldev.harvesterhoes.Metrics$CustomChart

No public methods found

### Class: me.rivaldev.harvesterhoes.Metrics$CustomChart
Type: Abstract Class

Methods:
- Metrics$JsonObjectBuilder$JsonObject getRequestJsonObject(BiConsumer<String, Throwable>, boolean)

### Class: me.rivaldev.harvesterhoes.Metrics$DrilldownPie
Type: Class
Extends: me.rivaldev.harvesterhoes.Metrics$CustomChart

Methods:
- Metrics$JsonObjectBuilder$JsonObject getChartData() throws Exception

### Class: me.rivaldev.harvesterhoes.Metrics$JsonObjectBuilder
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

### Class: me.rivaldev.harvesterhoes.Metrics$JsonObjectBuilder$JsonObject
Type: Class

Methods:
- String toString()

### Class: me.rivaldev.harvesterhoes.Metrics$MetricsBase
Type: Class

Methods:
- void shutdown()
- void addCustomChart(Metrics$CustomChart)

### Class: me.rivaldev.harvesterhoes.Metrics$MultiLineChart
Type: Class
Extends: me.rivaldev.harvesterhoes.Metrics$CustomChart

No public methods found

### Class: me.rivaldev.harvesterhoes.Metrics$SimpleBarChart
Type: Class
Extends: me.rivaldev.harvesterhoes.Metrics$CustomChart

No public methods found

### Class: me.rivaldev.harvesterhoes.Metrics$SimplePie
Type: Class
Extends: me.rivaldev.harvesterhoes.Metrics$CustomChart

No public methods found

### Class: me.rivaldev.harvesterhoes.Metrics$SingleLineChart
Type: Class
Extends: me.rivaldev.harvesterhoes.Metrics$CustomChart

No public methods found

## Package: me.rivaldev.harvesterhoes.api.events

### Class: me.rivaldev.harvesterhoes.api.events.HoeAbilityModifyChance
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HarvesterHoeObject getCache()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getEnchant()
- String getAbility()
- double getBoost()
- void setMultiplier(double)
- double getMultiplier()

### Class: me.rivaldev.harvesterhoes.api.events.HoeAbilityProcBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- long getPrestige()
- HarvesterHoeObject getCache()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getBoost()
- void setMultiplier(double)
- double getMultiplier()

### Class: me.rivaldev.harvesterhoes.api.events.HoeAutoSellEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- double getItems()
- void setMoney(double)
- Player getPlayer()
- HandlerList getHandlers()
- void setItems(double)
- **static** HandlerList getHandlerList()
- List<String> getMessage()
- double getMoney()
- void setEssence(double)
- V setMessage(List<String>)
- double getEssence()

### Class: me.rivaldev.harvesterhoes.api.events.HoeCropBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HarvesterHoeObject getCache()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getBoost()
- void setAmount(double)
- void setMultiplier(double)
- double getMultiplier()
- double getAmount()

### Class: me.rivaldev.harvesterhoes.api.events.HoeEnchantModifyChance
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HarvesterHoeObject getCache()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getEnchant()
- double getBoost()
- void setMultiplier(double)
- double getMultiplier()

### Class: me.rivaldev.harvesterhoes.api.events.HoeEnchantProcBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- long getPrestige()
- HarvesterHoeObject getCache()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getBoost()
- void setMultiplier(double)
- double getMultiplier()

### Class: me.rivaldev.harvesterhoes.api.events.HoeEssenceReceiveEnchantEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getBoost()
- void setEssence(double)
- double getEssence()
- void setMultiplier(double)
- double getMultiplier()

### Class: me.rivaldev.harvesterhoes.api.events.HoeEssenceReceivePreEnchantEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setEssence(double)
- double getEssence()

### Class: me.rivaldev.harvesterhoes.api.events.HoeItemReceiveEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- boolean isGiveToInventory()
- void setGiveToInventory(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ItemStack getItemStack()

### Class: me.rivaldev.harvesterhoes.api.events.HoeLoreUpdateEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- V setLore(List<String>)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ItemStack getItemStack()
- List<String> getLore()

### Class: me.rivaldev.harvesterhoes.api.events.HoeMenuOpenEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.rivaldev.harvesterhoes.api.events.HoeMetaPreUpdateEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- void setName(String)
- Player getPlayer()
- String getName()
- V setLore(List<String>)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setItemStack(ItemStack)
- ItemStack getItemStack()
- List<String> getLore()

### Class: me.rivaldev.harvesterhoes.api.events.HoeMoneyReceiveEnchant
Type: Class
Extends: org.bukkit.event.Event

Methods:
- void setMoney(double)
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getBoost()
- double getMoney()
- void setMultiplier(double)
- double getMultiplier()

### Class: me.rivaldev.harvesterhoes.api.events.HoeUpgradeMenuOpen
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Inventory getInventory()

### Class: me.rivaldev.harvesterhoes.api.events.HoeXPGainEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- long getLevel()
- HarvesterHoeObject getCache()
- Player getPlayer()
- void setBoost(double)
- double getXP()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getBoost()
- void setXP(double)
- void setMultiplier(double)
- double getMultiplier()

### Class: me.rivaldev.harvesterhoes.api.events.KeyFinderChanceBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getBoost()
- void setMultiplier(double)
- double getMultiplier()

### Class: me.rivaldev.harvesterhoes.api.events.RivalBlockBreakEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Material getMaterial()
- Player getPlayer()
- boolean isCancelled()
- int getHoePrestige()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Block getCrop()
- ItemStack getHoeItem()
- int getHoeLevel()
- void setAmount(int)
- int getAmount()

### Class: me.rivaldev.harvesterhoes.api.events.RivalEXPFinderReceive
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setAmount(long)
- long getAmount()

### Class: me.rivaldev.harvesterhoes.api.events.RivalHarvesterHoesAPI
Type: Class

Methods:
- Material getMaterial()
- void setEnchants(ItemStack, Player, String)
- void registerEconomyManager(EconomyManager)
- void removeEssence(OfflinePlayer, double)
- void setCropBalance(OfflinePlayer, long, String)
- void setCropBalance(OfflinePlayer, long, Material)
- boolean isHoe(Player)
- long getCropBalance(OfflinePlayer, String)
- void giveEssence(OfflinePlayer, double)
- double getEssence(OfflinePlayer)
- void openMainMenu(Player)
- void applyMetaToHoe(ItemStack, Player)

### Class: me.rivaldev.harvesterhoes.api.events.SpawnerFinderChanceBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- double getBoost()
- void setMultiplier(double)
- double getMultiplier()

## Package: me.rivaldev.harvesterhoes.customcommands

### Class: me.rivaldev.harvesterhoes.customcommands.CommandHandler
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- **static** void executeCommands(Material, Player, long, long)
- **static** void loadRewards()
- void listen(RivalBlockBreakEvent)

### Class: me.rivaldev.harvesterhoes.customcommands.CommandReward
Type: Class

Methods:
- List<String> getRegions()
- double getChance()
- int getHoePrestigeRequirement()
- int getHoeLevelRequirement()
- List<String> getCommands()

## Package: me.rivaldev.harvesterhoes.ecomanager

### Class: me.rivaldev.harvesterhoes.ecomanager.EconomyManager
Type: Interface

Methods:
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

### Class: me.rivaldev.harvesterhoes.ecomanager.ElementalTokensEconomy
Type: Class
Implements: me.rivaldev.harvesterhoes.ecomanager.EconomyManager

Methods:
- String getEconomyCommand()
- String getEconomyName()
- TokenAPI getTokenAPI()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

### Class: me.rivaldev.harvesterhoes.ecomanager.PlaceholderAPIEconomy
Type: Class
Implements: me.rivaldev.harvesterhoes.ecomanager.EconomyManager

Methods:
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

### Class: me.rivaldev.harvesterhoes.ecomanager.RivalHarvesterHoesEconomy
Type: Class
Implements: me.rivaldev.harvesterhoes.ecomanager.EconomyManager

Methods:
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

### Class: me.rivaldev.harvesterhoes.ecomanager.VaultEconomy
Type: Class
Implements: me.rivaldev.harvesterhoes.ecomanager.EconomyManager

Methods:
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

