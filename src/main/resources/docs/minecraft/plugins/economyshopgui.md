# EconomyShopGUI-API-1.9.0 API Reference

## Package: me.gypopo.economyshopgui.api

### Class: me.gypopo.economyshopgui.api.EconomyShopGUIHook
Type: Class

Methods:
- **static** boolean hasPermissions(ShopItem, Player)
- **static** boolean hasPermissions(ShopItem, Player, String)
- **static** void sellItemStock(ShopItem, UUID, int)
- **static** AdvancedBuyPrice getMultipleBuyPrices(ShopItem)
- **static** Optional<BuyPrice> getBuyPrice(OfflinePlayer, ItemStack)
- **static** boolean isSellAble(ShopItem)
- **static** EconomyProvider getEcon(EcoType)
- **static** AdvancedSellPrice getMultipleSellPrices(ShopItem)
- **static** ShopSection getShopSection(String)
- **static** void sellItem(ItemStack, int)
- **static** void sellItem(ShopItem, int)
- **static** int sellItemLimit(ShopItem, UUID, int)
- **static** int getSellLimit(ShopItem, UUID)
- **static** ShopItem getShopItem(ItemStack)
- **static** ShopItem getShopItem(Player, ItemStack)
- **static** ShopItem getShopItem(String)
- **static** Double getItemSellPrice(ItemStack)
- **static** Double getItemSellPrice(Player, ItemStack)
- **static** Double getItemSellPrice(ShopItem, ItemStack)
- **static** Double getItemSellPrice(ShopItem, ItemStack, Player)
- **static** Double getItemSellPrice(ShopItem, ItemStack, Player, int, int)
- **static** Double getItemSellPrice(ShopItem, ItemStack, int, int)
- **static** Double getItemBuyPrice(ItemStack)
- **static** Double getItemBuyPrice(Player, ItemStack)
- **static** Double getItemBuyPrice(ShopItem, ItemStack)
- **static** Double getItemBuyPrice(ShopItem, ItemStack, Player)
- **static** double getItemBuyPrice(ShopItem, int)
- **static** double getItemBuyPrice(ShopItem, Player, int)
- **static** Long getSellLimitRestockTime(ShopItem, UUID)
- **static** int getItemStock(ShopItem, UUID)
- **static** boolean hasMultipleBuyPrices(ShopItem)
- **static** Optional<SellPrice> getSellPrice(OfflinePlayer, ItemStack)
- **static** SellPrices getSellPrices(OfflinePlayer, ItemStack[])
- **static** void buyItem(ItemStack, int)
- **static** void buyItem(ShopItem, int)
- **static** SellPrices getCutSellPrices(OfflinePlayer, ItemStack[], boolean)
- **static** List<String> getShopSections()
- **static** boolean isBuyAble(ShopItem)
- **static** int buyItemStock(ShopItem, UUID, int)
- **static** Long getItemStockRestockTime(ShopItem, UUID)
- **static** boolean hasMultipleSellPrices(ShopItem)
- **static** Map<String, ShopSection> getSections()

## Package: me.gypopo.economyshopgui.api.events

### Class: me.gypopo.economyshopgui.api.events.CustomEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: me.gypopo.economyshopgui.api.events.EconomyPreLoadEvent
Type: Class
Extends: me.gypopo.economyshopgui.api.events.CustomEvent

Methods:
- void registerExternal(ExternalEconomy)

### Class: me.gypopo.economyshopgui.api.events.PostTransactionEvent
Type: Class
Extends: me.gypopo.economyshopgui.api.events.CustomEvent

Methods:
- Map<ShopItem, Integer> getItems()
- Player getPlayer()
- Transaction$Type getTransactionType()
- ItemStack getItemStack()
- Transaction$Result getTransactionResult()
- Map<EcoType, Double> getPrices()
- double getPrice()
- ShopItem getShopItem()
- int getAmount()

### Class: me.gypopo.economyshopgui.api.events.PreTransactionEvent
Type: Class
Extends: me.gypopo.economyshopgui.api.events.CustomEvent
Implements: org.bukkit.event.Cancellable

Methods:
- Map<EcoType, Double> getOriginalPrices()
- Map<ShopItem, Integer> getItems()
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- Transaction$Type getTransactionType()
- ItemStack getItemStack()
- void setPrice(double)
- Map<EcoType, Double> getPrices()
- double getOriginalPrice()
- double getPrice()
- ShopItem getShopItem()
- int getAmount()

### Class: me.gypopo.economyshopgui.api.events.ShopItemsLoadEvent
Type: Class
Extends: me.gypopo.economyshopgui.api.events.CustomEvent

No public methods found

## Package: me.gypopo.economyshopgui.api.objects

### Class: me.gypopo.economyshopgui.api.objects.BuyPrice
Type: Class

Methods:
- OfflinePlayer getPlayer()
- BuyPrice updateLimits()
- Map<EcoType, Double> getPrices()
- double getPrice(EcoType)
- ShopItem getShopItem()
- int getAmount()

### Class: me.gypopo.economyshopgui.api.objects.ExternalEconomy
Type: Abstract Class
Extends: me.gypopo.economyshopgui.providers.economys.ExternalEconomyProvider

Methods:
- void depositBalance(OfflinePlayer, double)
- String getName()
- double getBalance(OfflinePlayer)
- String getPlural()
- void withdrawBalance(OfflinePlayer, double)
- boolean isDecimal()
- String getFriendly()
- String getSingular()

### Class: me.gypopo.economyshopgui.api.objects.SellPrice
Type: Class

Methods:
- OfflinePlayer getPlayer()
- SellPrice updateLimits()
- Map<EcoType, Double> getPrices()
- double getPrice(EcoType)
- ShopItem getShopItem()
- int getAmount()

### Class: me.gypopo.economyshopgui.api.objects.SellPrices
Type: Class

Methods:
- Map<ShopItem, Integer> getItems()
- OfflinePlayer getPlayer()
- SellPrices updateLimits()
- boolean isEmpty()
- Map<EcoType, Double> getPrices()
- double getPrice(EcoType)

## Package: me.gypopo.economyshopgui.api.prices

### Class: me.gypopo.economyshopgui.api.prices.AdvancedBuyPrice
Type: Class

Methods:
- List<EcoType> getBuyTypes()
- boolean isBuyAble()
- boolean requireAll()
- Map<EcoType, Double> getBuyPrices(EcoType, int)
- Map<EcoType, Double> getBuyPrices(EcoType, Player, int)

### Class: me.gypopo.economyshopgui.api.prices.AdvancedSellPrice
Type: Class

Methods:
- boolean isSellAble()
- List<EcoType> getSellTypes()
- Map<EcoType, Double> getSellPrices(EcoType, ItemStack)
- Map<EcoType, Double> getSellPrices(EcoType, ItemStack, int, int)
- Map<EcoType, Double> getSellPrices(EcoType, Player, ItemStack)
- Map<EcoType, Double> getSellPrices(EcoType, Player, ItemStack, int, int)
- boolean giveAll()

## Package: me.gypopo.economyshopgui.objects

### Class: me.gypopo.economyshopgui.objects.ShopItem
Type: Class

Methods:
- boolean isMinSell(int)
- ItemStack getItemToGive()
- EcoType getEcoType()
- boolean isDynamicPricing()
- int getLimitedSellMode()
- String getItemPath()
- boolean isMaxSell(int)
- int getLimitedStockMode()
- boolean isRefillStock()
- boolean hasItemError()
- boolean isHidden()
- boolean isLinked()
- boolean isDisplayItem()
- boolean isMaxBuy(int)
- int getStackSize()
- int getMinSell()
- int getMinBuy()
- boolean isMinBuy(int)
- String getSubSection()
- int getMaxSell()
- boolean hasSeasonModifier(String)
- int getMaxBuy()
- ItemStack getShopItem()

### Class: me.gypopo.economyshopgui.objects.ShopPageItems
Type: Class

Methods:
- Map<Integer, ItemStack> getItems()
- int getSize()
- String getItem(int)

## Package: me.gypopo.economyshopgui.objects.mappings

### Class: me.gypopo.economyshopgui.objects.mappings.ClickAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BUY
- SELL
- SELL_ALL
- GUI_EDITOR

Methods:
- **static** ClickAction valueOf(String)
- **static** ClickAction[] values()

## Package: me.gypopo.economyshopgui.objects.shops

### Class: me.gypopo.economyshopgui.objects.shops.ShopSection
Type: Interface

Methods:
- void openShopSection(Player, boolean)
- void openShopSection(Player, boolean, String)
- void openShopSection(Player, int, boolean)
- void openShopSection(Player, int, boolean, String)
- List<String> getClickCommands()
- boolean isCommandItem()
- boolean isSubSection()
- Collection<ShopItem> getShopItems()
- boolean isHidden()
- ClickAction getClickAction(ClickType)
- String getSection()
- ShopType getType()
- ShopPageItems getShopPageItems(int)
- List<String> getItemLocs()
- boolean isCloseMenu()
- int getPages()
- void reloadItem(String)
- int getPageForShopItem(String)
- ShopItem getShopItem(String)

### Class: me.gypopo.economyshopgui.objects.shops.ShopType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CATEGORY
- ROTATING

Methods:
- **static** ShopType valueOf(String)
- **static** ShopType[] values()

## Package: me.gypopo.economyshopgui.providers

### Class: me.gypopo.economyshopgui.providers.EconomyProvider
Type: Interface

Methods:
- void depositBalance(OfflinePlayer, double)
- double getBalance(OfflinePlayer)
- String getPlural()
- EcoType getType()
- void withdrawBalance(OfflinePlayer, double)
- String getFriendly()
- boolean isDecimal()
- String getSingular()
- String formatPrice(double)

## Package: me.gypopo.economyshopgui.providers.economys

### Class: me.gypopo.economyshopgui.providers.economys.ExternalEconomyProvider
Type: Class
Implements: me.gypopo.economyshopgui.providers.EconomyProvider

Methods:
- void depositBalance(OfflinePlayer, double)
- String getName()
- double getBalance(OfflinePlayer)
- String getPlural()
- EcoType getType()
- void withdrawBalance(OfflinePlayer, double)
- boolean isDecimal()
- String getFriendly()
- String getCurrencyName()
- String getSingular()
- String formatPrice(double)

## Package: me.gypopo.economyshopgui.util

### Class: me.gypopo.economyshopgui.util.EcoType
Type: Class

Methods:
- String getCurrency()
- EconomyType getType()
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: me.gypopo.economyshopgui.util.EconomyType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- EXP
- ITEM
- VAULT
- LEVELS
- ECOBITS
- COINS_ENGINE
- PLAYER_POINTS
- GEMS_ECONOMY
- ULTRA_ECONOMY
- VOTING_PLUGIN
- EXTERNAL

Methods:
- **static** EcoType getFromString(String)
- String getName()
- **static** EconomyType valueOf(String)
- **static** EconomyType[] values()

### Class: me.gypopo.economyshopgui.util.Transaction
Type: Class

No public methods found

### Class: me.gypopo.economyshopgui.util.Transaction$Mode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BUY
- SELL

Methods:
- **static** Transaction$Mode getFromType(Transaction$Type)
- String getName()
- **static** Transaction$Mode valueOf(String)
- **static** Transaction$Mode[] values()

### Class: me.gypopo.economyshopgui.util.Transaction$Result
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SUCCESS
- SUCCESS_COMMANDS_EXECUTED
- NOT_ALL_ITEMS_ADDED
- CANT_STORE_PAYMENT
- NOT_ENOUGH_SPACE
- INSUFFICIENT_FUNDS
- NO_INVENTORY_SPACE
- NEGATIVE_ITEM_PRICE
- TRANSACTION_CANCELLED
- NO_ITEMS_FOUND
- NO_ITEM_STOCK_LEFT
- HIGHER_LEVEL_REQUIRED
- REACHED_SELL_LIMIT
- NOT_ENOUGH_ITEMS

Methods:
- **static** Transaction$Result valueOf(String)
- **static** Transaction$Result[] values()

### Class: me.gypopo.economyshopgui.util.Transaction$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SELL_GUI_SCREEN
- SELL_ALL_COMMAND
- SELL_ALL_SCREEN
- SELL_SCREEN
- BUY_SCREEN
- BUY_STACKS_SCREEN
- QUICK_SELL
- QUICK_BUY
- SHOPSTAND_BUY_SCREEN
- SHOPSTAND_SELL_SCREEN
- AUTO_SELL_CHEST

Methods:
- String getName()
- **static** Transaction$Type valueOf(String)
- **static** Transaction$Type[] values()
- String getMode()

