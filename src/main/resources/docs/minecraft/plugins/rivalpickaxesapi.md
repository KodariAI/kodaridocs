# RivalPickaxesAPI API Reference

## Package: me.rivaldev.pickaxes

### Class: me.rivaldev.pickaxes.Main
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- boolean isPerPlayerPickaxe()
- LevelManager getLevelManager()
- ArrayList getAllEnchants()
- void setupShopGUIPlus()
- void setupAureliumSkills()
- void generateFiles()
- void openPage(String, Player)
- BlocksCaching getBlocksCache()
- String timeAsStringSmall(long)
- boolean isHoeMaterial(ItemStack)
- String getFormattedInt(int)
- void registerCommands()
- void registerCrops()
- void setupBattlePass()
- boolean getUltimateSkillsEnabled()
- ItemStack EssenceItem()
- String timeAsString(long)
- void loadPrices()
- SQLManager getSQLManager()
- void delayedFullInventory(Player)
- void saveOfflineBlocks()
- boolean getSuperiorSkyBlockHookIsEnabled()
- ArrayList nbtProcEnchants()
- boolean isDouble(String)
- ToolManager getToolManager()
- NMSManager setupNMS()
- void setupMCMMO()
- ArrayList enchantBooks()
- void handleShop(Player, String, String)
- boolean isHoe(Player)
- boolean getFactionsEnabled()
- ItemStack addGlow(ItemStack, boolean)
- void onEnable()
- EssenceCaching getEssenceCache()
- void setupOptimalSkills()
- void onDisable()
- void registerListeners()
- boolean getOptimalSkillsEnabled()
- boolean getMcMMOHookIsEnabled()
- WorldGuardIml getWorldGuardIml()
- boolean getEconomyShopGUI()
- String getFormattedLong(Long)
- ItemStack getPageItems(String, String, Player)
- boolean getSuperBoostersEnabled()
- boolean getBentoBoxEnabled()
- void loadEnchants()
- void debug(String)
- boolean isLong(String)
- void loadEnchantRewards()
- NMSManager getNMSHandler()
- boolean setupEconomy()
- void setupEnchantPlugins()
- EconomyManager getEconomy()
- boolean getUltimateCollectionsEnabled()
- WorldGuardIml setupWorldGuard()
- void loadnbtEnchants()
- boolean getWorldGuardEnabled()
- void setupEconomyHandler()
- void setupSuperiorSkyblock()
- EnchantLogic getEnchantLogic()
- void loadOfflineBlocks()
- CommentedConfiguration getConfig()
- FileConfiguration getConfig()
- boolean getGriefPreventionEnabled()
- LevelManager setupLevelManager()
- boolean getEcoSkills()
- boolean isPerPlayerHoeEnchants()
- boolean getAureliumEnabled()
- void setupXLTournaments()
- boolean getShopGUIPlusHookIsEnabled()
- void setupSuperBoosters()
- void registerEconomy(EconomyManager)
- String longToDate(long)
- String getFormattedDouble(double)

### Class: me.rivaldev.pickaxes.Metrics
Type: Class

Methods:
- void addCustomChart(Metrics$CustomChart)

### Class: me.rivaldev.pickaxes.WorldGuard6
Type: Class
Implements: me.rivaldev.pickaxes.WorldGuardIml

Methods:
- boolean playerInRegion(String, Player)
- boolean canBreak(Player, Location)
- boolean processCheckRegionCustomReward(Player, List)
- boolean processRegionCheck(Location, List)
- List getRegionName(Location)
- boolean locationInRegion(String, Location)

### Class: me.rivaldev.pickaxes.WorldGuard7
Type: Class
Implements: me.rivaldev.pickaxes.WorldGuardIml

Methods:
- boolean playerInRegion(String, Player)
- boolean canBreak(Player, Location)
- boolean processCheckRegionCustomReward(Player, List)
- boolean processRegionCheck(Location, List)
- List getRegionName(Location)
- boolean locationInRegion(String, Location)

## Package: me.rivaldev.pickaxes.api.events

### Class: me.rivaldev.pickaxes.api.events.ActivatedAbilityObj
Type: Class

Methods:
- String getAbilityName()
- long getTimeActivated()

### Class: me.rivaldev.pickaxes.api.events.EnchantDisenchantEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- String getEnchant()
- int getAmount()

### Class: me.rivaldev.pickaxes.api.events.EnchantPurchaseEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- String getEnchant()
- int getAmount()

### Class: me.rivaldev.pickaxes.api.events.KeyFinderChanceBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()

### Class: me.rivaldev.pickaxes.api.events.PickaxeAutoSellEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- List getMessage()
- void setMessage(List)

### Class: me.rivaldev.pickaxes.api.events.PickaxeEXPFinderReceive
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setAmount(long)
- long getAmount()

### Class: me.rivaldev.pickaxes.api.events.PickaxeEnchantModifyChance
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setBoost(double)
- NBTItem getNbtItem()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- String getEnchant()
- double getBoost()

### Class: me.rivaldev.pickaxes.api.events.PickaxeEnchantProcBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- int getLevel()
- int getPrestige()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()

### Class: me.rivaldev.pickaxes.api.events.PickaxeEssenceReceiveEnchantEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- int getLevel()
- int getPrestige()
- NBTItem getNbt()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- NBTCompound getCrystals()
- double getBoost()
- void setEssence(double)
- void setCrystals(NBTCompound)
- double getEssence()

### Class: me.rivaldev.pickaxes.api.events.PickaxeEssenceReceivePreEnchantEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setEssence(double)
- double getEssence()

### Class: me.rivaldev.pickaxes.api.events.PickaxeFortuneBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setAmount(double)
- double getAmount()

### Class: me.rivaldev.pickaxes.api.events.PickaxeItemReceiveEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- NBTItem getNbt()
- Player getPlayer()
- boolean isGiveToInventory()
- void setGiveToInventory(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- ItemStack getItemStack()

### Class: me.rivaldev.pickaxes.api.events.PickaxeLevelUpEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- int getLevel()
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.rivaldev.pickaxes.api.events.PickaxeLoreUpdateEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setLore(List)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- ItemStack getItemStack()
- List getLore()

### Class: me.rivaldev.pickaxes.api.events.PickaxeMetaPreUpdateEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- void setName(String)
- Player getPlayer()
- String getName()
- void setLore(List)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- ItemStack getItemStack()
- List getLore()

### Class: me.rivaldev.pickaxes.api.events.PickaxeMoneyReceiveEnchant
Type: Class
Extends: org.bukkit.event.Event

Methods:
- void setMoney(double)
- int getLevel()
- int getPrestige()
- NBTItem getNbt()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- NBTCompound getCrystals()
- double getBoost()
- double getMoney()
- void setCrystals(NBTCompound)

### Class: me.rivaldev.pickaxes.api.events.PickaxePrestigeEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- int getPrestige()
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.rivaldev.pickaxes.api.events.PickaxeUpgradeMenuOpen
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- Inventory getInventory()

### Class: me.rivaldev.pickaxes.api.events.PickaxeXPGainEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- NBTItem getNbt()
- Player getPlayer()
- double getXP()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setXP(double)

### Class: me.rivaldev.pickaxes.api.events.RivalPickaxesAPI
Type: Class

Methods:
- Material getMaterial()
- void setEnchants(ItemStack, Player, String)
- void applyMetaToPickaxe(ItemStack, Player)
- void registerEconomyManager(EconomyManager)
- void removeEssence(OfflinePlayer, double)
- void setBlocks(OfflinePlayer, long)
- long getBlocks(OfflinePlayer)
- void giveEssence(OfflinePlayer, double)
- double getEssence(OfflinePlayer)
- void openMainMenu(Player)
- boolean isPickaxe(Player)

### Class: me.rivaldev.pickaxes.api.events.RivalPickaxesBlockBreakEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isNatural()
- void setMineType(String)
- NBTItem getNBT()
- Block getBlock()
- Player getPlayer()
- boolean isCancelled()
- MineBlock getMineBlock()
- String getMineType()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setNatural(boolean)

### Class: me.rivaldev.pickaxes.api.events.ShopPurchaseEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.rivaldev.pickaxes.api.events.SpawnerFinderChanceBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()

## Package: me.rivaldev.pickaxes.ecomanager

### Class: me.rivaldev.pickaxes.ecomanager.PlaceholderAPIEconomy
Type: Class
Implements: me.rivaldev.pickaxes.ecomanager.EconomyManager

Methods:
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

### Class: me.rivaldev.pickaxes.ecomanager.RivalHarvesterHoesEconomy
Type: Class
Implements: me.rivaldev.pickaxes.ecomanager.EconomyManager

Methods:
- void init()
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

### Class: me.rivaldev.pickaxes.ecomanager.RivalPickaxesEconomy
Type: Class
Implements: me.rivaldev.pickaxes.ecomanager.EconomyManager

Methods:
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

### Class: me.rivaldev.pickaxes.ecomanager.VaultEconomy
Type: Class
Implements: me.rivaldev.pickaxes.ecomanager.EconomyManager

Methods:
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

## Package: me.rivaldev.pickaxes.mines

### Class: me.rivaldev.pickaxes.mines.MineBlock
Type: Class

Methods:
- List getMaterials()
- Material getReplacable()
- Long getNextResetTimeMillis()
- void updateNextResetTimeMillis()
- String getMineType()
- void updateLastResetTimeMillis()
- String toString()
- MineBlock fromString(String)

### Class: me.rivaldev.pickaxes.mines.MineBlockGUI
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void openPage(int)
- void openInventory(Player)
- void onClick(InventoryClickEvent)
- int getMaxPage()
- ItemStack getNextPage()
- ItemStack getReturnPage()
- ItemStack getCurrentPage(int, int, int, UUID)
- ItemStack getFiller()

### Class: me.rivaldev.pickaxes.mines.MineLoader
Type: Class

Methods:
- void removeMine(Location)
- void init()
- void addMine(Location, String)
- MineBlock getMineBlock(Location)
- Material getBlockReplacement(String)
- void checkBlocks()
- void loadMaterials()
- void save()
- ConcurrentHashMap getBlockMap()
- ConcurrentHashMap getBrokenBlockMap()

### Class: me.rivaldev.pickaxes.mines.MineTask
Type: Class
Extends: org.bukkit.scheduler.BukkitRunnable

Methods:
- void add(Location, MineBlock)
- void run()

### Class: me.rivaldev.pickaxes.mines.MineWand
Type: Class

Methods:
- Location getLocationTwo()
- void setLocationTwo(Location)
- void setLocationOne(Location)
- Location getLocationOne()
- String getPlayerName()

### Class: me.rivaldev.pickaxes.mines.MineWandManager
Type: Class

Methods:
- MineWand getWand(String)
- void setLocationTwo(String, Location)
- void setLocationOne(String, Location)

