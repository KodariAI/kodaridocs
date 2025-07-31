# RivalFishingRodsAPI API Reference

## Package: me.rivaldev.fishingrod.rivalfishingrods

### Class: me.rivaldev.fishingrod.rivalfishingrods.Main
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- ArrayList nbtEnchants()
- boolean isRod(Player)
- LevelManager getLevelManager()
- boolean isRodMaterial(ItemStack)
- ItemStack addGlow(ItemStack, boolean)
- void onEnable()
- EssenceCaching getEssenceCache()
- void onDisable()
- void generateFiles()
- void registerListeners()
- String timeAsStringSmall(long)
- String getFormattedInt(int)
- void registerCommands()
- ArrayList testChance()
- FishesCaching getFishCache()
- String getFormattedLong(Long)
- boolean isLong(String)
- void loadEnchantRewards()
- void setupEconomy()
- ArrayList CapProcEnchants()
- EconomyManager getEconomy()
- void setupEconomyHandler()
- boolean isPerPlayerRodEnchants()
- LevelManager setupLevelManager()
- boolean isPerPlayerRod()
- String timeAsString(long)
- SQLManager getSQLManager()
- void delayedFullInventory(Player)
- void registerEconomy(EconomyManager)
- ArrayList nbtProcEnchants()
- boolean isDouble(String)
- String getFormattedDouble(double)

## Package: me.rivaldev.fishingrod.rivalfishingrods.api

### Class: me.rivaldev.fishingrod.rivalfishingrods.api.KeyFinderChanceBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()

### Class: me.rivaldev.fishingrod.rivalfishingrods.api.RivalFishingRodsAPI
Type: Class

Methods:
- void setEnchants(ItemStack, Player, String)
- void applyMetaToFishingRod(ItemStack, Player)
- void registerEconomy(EconomyManager)
- void openMainMenu(Player)

### Class: me.rivaldev.fishingrod.rivalfishingrods.api.RodAutoSellEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- List getMessage()
- void setMessage(List)

### Class: me.rivaldev.fishingrod.rivalfishingrods.api.RodEnchantProcBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()

### Class: me.rivaldev.fishingrod.rivalfishingrods.api.RodEssenceReceiveEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setEssence(double)
- double getEssence()

### Class: me.rivaldev.fishingrod.rivalfishingrods.api.RodMetaPreUpdateEvent
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

### Class: me.rivaldev.fishingrod.rivalfishingrods.api.RodMoneyReceiveEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- void setMoney(double)
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getMoney()

### Class: me.rivaldev.fishingrod.rivalfishingrods.api.RodUpgradeMenuOpen
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- Inventory getInventory()

### Class: me.rivaldev.fishingrod.rivalfishingrods.api.RodXPGainEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- NBTItem getNbt()
- Player getPlayer()
- double getXP()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setXP(double)

### Class: me.rivaldev.fishingrod.rivalfishingrods.api.SpawnerFinderChanceBoostEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- void setBoost(double)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()

