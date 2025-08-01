# RivalMobSwordsAPI API Reference

## Package: me.rivaldev.mobsword.rivalmobswords

### Class: me.rivaldev.mobsword.rivalmobswords.Main
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- boolean isRod(Player)
- LevelManager getLevelManager()
- ArrayList enchantBooks()
- boolean isRoseStacker()
- boolean isRodMaterial(ItemStack)
- ItemStack addGlow(ItemStack, boolean)
- ArrayList getAllEnchants()
- void onEnable()
- EssenceCaching getEssenceCache()
- void setupShopGUIPlus()
- void onDisable()
- void generateFiles()
- void setupOptimalSkills()
- void loadStackerHooks()
- boolean isPerPlayerMobSword()
- void registerListeners()
- boolean isWildStacker()
- String timeAsStringSmall(long)
- boolean getOptimalSkillsEnabled()
- String getFormattedInt(int)
- boolean processCheckWorld(Player)
- void registerCommands()
- String getFormattedLong(Long)
- void loadEnchants()
- boolean isLong(String)
- boolean getEconomyShopGUIHookIsEnabled()
- void loadEnchantRewards()
- void setupEconomy()
- MobsCaching getMobsCache()
- ArrayList CapProcEnchants()
- EconomyManager getEconomy()
- void loadnbtEnchants()
- void setupEconomyHandler()
- EnchantLogic getEnchantLogic()
- boolean isPerPlayerRodEnchants()
- LevelManager setupLevelManager()
- String timeAsString(long)
- SQLManager getSQLManager()
- void delayedFullInventory(Player)
- boolean getShopGUIPlusHookIsEnabled()
- void setupSuperBoosters()
- void registerEconomy(EconomyManager)
- boolean isDouble(String)
- String getFormattedDouble(double)

### Class: me.rivaldev.mobsword.rivalmobswords.Metrics
Type: Class

Methods:
- void addCustomChart(Metrics$CustomChart)

## Package: me.rivaldev.mobsword.rivalmobswords.api

### Class: me.rivaldev.mobsword.rivalmobswords.api.ActivatedAbilityObj
Type: Class

Methods:
- String getAbilityName()
- long getTimeActivated()

### Class: me.rivaldev.mobsword.rivalmobswords.api.EnchantDisenchantEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- String getEnchant()
- int getAmount()

### Class: me.rivaldev.mobsword.rivalmobswords.api.EnchantPurchaseEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- String getEnchant()
- int getAmount()

### Class: me.rivaldev.mobsword.rivalmobswords.api.KeyFinderChanceBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()

### Class: me.rivaldev.mobsword.rivalmobswords.api.RivalMobHitEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- MobSwordObject getObject()
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- Entity getEntity()

### Class: me.rivaldev.mobsword.rivalmobswords.api.RivalMobKillEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- void setDrops(ArrayList)
- MobSwordObject getObject()
- Player getPlayer()
- List getItemStacks()
- HandlerList getHandlers()
- double getProcboost()
- void setItemStacks(ArrayList)
- HandlerList getHandlerList()
- List getDrops()
- String getMode()
- Entity getEntity()
- void setProcboost(double)

### Class: me.rivaldev.mobsword.rivalmobswords.api.RivalMobSwordsAPI
Type: Class

Methods:
- Material getMaterial()
- void setEnchants(ItemStack, Player, String)
- void registerEconomy(EconomyManager)
- void openMainMenu(Player)
- void applyMetaToSword(ItemStack, Player)

### Class: me.rivaldev.mobsword.rivalmobswords.api.SpawnerFinderChanceBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordAutoSellEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- List getMessage()
- void setMessage(List)

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordEXPReceiveEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- MobSwordObject getCache()
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setEXP(int)
- int getEXP()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordEnchantModifyChance
Type: Class
Extends: org.bukkit.event.Event

Methods:
- long getLevel()
- MobSwordObject getCache()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- String getEnchant()
- double getBoost()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordEnchantProcBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- MobSwordObject getCache()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordEssenceReceiveEnchantEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- MobSwordObject getCache()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()
- void setEssence(double)
- double getEssence()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordEssenceReceivePreEnchantEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setEssence(double)
- double getEssence()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordItemReceiveEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- boolean isGiveToInventory()
- void setGiveToInventory(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- ItemStack getItemStack()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordLevelUpEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- int getLevel()
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordLootingEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- MobSwordObject getCache()
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setAmount(double)
- double getAmount()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordMetaPreUpdateEvent
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

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordMoneyReceiveEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- void setMoney(double)
- MobSwordObject getCache()
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()
- double getMoney()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordPrestigeEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- int getPrestige()
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordUpgradeMenuOpen
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- Inventory getInventory()

### Class: me.rivaldev.mobsword.rivalmobswords.api.SwordXPGainEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- MobSwordObject getCache()
- Player getPlayer()
- void setBoost(double)
- double getXP()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()
- void setXP(double)

## Package: me.rivaldev.mobsword.rivalmobswords.ecomanager

### Class: me.rivaldev.mobsword.rivalmobswords.ecomanager.EconomyManager
Type: Interface

Methods:
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

### Class: me.rivaldev.mobsword.rivalmobswords.ecomanager.PlaceholderAPIEconomy
Type: Class
Implements: me.rivaldev.mobsword.rivalmobswords.ecomanager.EconomyManager

Methods:
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

### Class: me.rivaldev.mobsword.rivalmobswords.ecomanager.RivalHarvesterHoesEconomy
Type: Class
Implements: me.rivaldev.mobsword.rivalmobswords.ecomanager.EconomyManager

Methods:
- void init()
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

### Class: me.rivaldev.mobsword.rivalmobswords.ecomanager.RivalMobSwordsEconomy
Type: Class
Implements: me.rivaldev.mobsword.rivalmobswords.ecomanager.EconomyManager

Methods:
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

### Class: me.rivaldev.mobsword.rivalmobswords.ecomanager.VaultEconomy
Type: Class
Implements: me.rivaldev.mobsword.rivalmobswords.ecomanager.EconomyManager

Methods:
- String getEconomyCommand()
- String getEconomyName()
- double getEconomyAmount(OfflinePlayer)
- void giveEconomyAmount(OfflinePlayer, double)
- void removeEconomyAmount(OfflinePlayer, double)

