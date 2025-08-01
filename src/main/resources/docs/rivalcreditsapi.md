# RivalCreditsAPI API Reference

## Package: me.rivaldev.credits

### Class: me.rivaldev.credits.CreditAPI
Type: Class

Methods:
- ItemStack getPageItemsDiscounted(String, String, Player, double)
- int getCategoryPackages(String)
- void handleShopDiscounted(Player, String, String, double, int)
- String getPrefix()
- String color(Player, String)
- String color(String)
- void removeCredits(OfflinePlayer, double)
- void handleShop(Player, String, String, int)
- ItemStack addGlow(ItemStack, boolean)
- boolean runningPAPI()
- void openPage(String, Player)
- void openPage(int, String, Player)
- ItemStack getCustomTextureHead(String)
- void addCredits(OfflinePlayer, double)
- void setCredits(OfflinePlayer, double)
- boolean isInt(String)
- double getCredits(OfflinePlayer)
- CreditAPI getInstance()
- ItemStack getPageItems(String, String, Player)
- boolean isDouble(String)
- String getFormattedDouble(double)

### Class: me.rivaldev.credits.CreditsCache
Type: Class

Methods:
- void giveCredits(OfflinePlayer, double)
- List getSortedTop()
- void removeCredits(OfflinePlayer, double)
- void removeCacheGlobal()
- void saveData(Player, boolean)
- void saveDataonDisable()
- void saveTopData()
- void inventoryUpdater()
- void loadCoinsPlayerData(Player)
- void runnableCredit()
- double getCache(OfflinePlayer)
- void setCredits(OfflinePlayer, double)
- double getCredits(OfflinePlayer)
- LinkedHashMap getTopCredits()
- void updateCreditTop()
- void putCache(OfflinePlayer, double)

### Class: me.rivaldev.credits.Main
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- void startUpdateTask()
- String timeAsString(long)
- CreditsCache getCreditsCache()
- SQLManager getSQLManager()
- String timeAsStringSmall(long)
- void onEnable()
- void onDisable()
- void generateFiles()
- DiscountManager getDiscountManager()

## Package: me.rivaldev.credits.api

### Class: me.rivaldev.credits.api.RivalCreditsAPI
Type: Class

Methods:
- double getBalance(OfflinePlayer)
- void giveCredits(OfflinePlayer, double)
- void setCredits(OfflinePlayer, double)
- void removeCredits(OfflinePlayer, double)
- double getCredits(OfflinePlayer)

### Class: me.rivaldev.credits.api.RivalPackagePurchaseEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- String getPackage()
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- String getCategory()
- double getPrice()

