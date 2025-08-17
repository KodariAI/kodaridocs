# EconomyShopGUI-API-1.8.0 API Reference

## Package: me.gypopo.economyshopgui.api

### Class: me.gypopo.economyshopgui.api.EconomyShopGUIHook
Type: Class

Methods:
- boolean hasPermissions(ShopItem, Player)
- boolean hasPermissions(ShopItem, Player, String)
- void sellItemStock(ShopItem, UUID, int)
- AdvancedBuyPrice getMultipleBuyPrices(ShopItem)
- Optional getBuyPrice(OfflinePlayer, ItemStack)
- boolean isSellAble(ShopItem)
- EconomyProvider getEcon(EcoType)
- AdvancedSellPrice getMultipleSellPrices(ShopItem)
- ShopSection getShopSection(String)
- void sellItem(ItemStack, int)
- void sellItem(ShopItem, int)
- int sellItemLimit(ShopItem, UUID, int)
- int getSellLimit(ShopItem, UUID)
- ShopItem getShopItem(ItemStack)
- ShopItem getShopItem(Player, ItemStack)
- ShopItem getShopItem(String)
- Double getItemSellPrice(ItemStack)
- Double getItemSellPrice(Player, ItemStack)
- Double getItemSellPrice(ShopItem, ItemStack)
- Double getItemSellPrice(ShopItem, ItemStack, Player)
- Double getItemSellPrice(ShopItem, ItemStack, Player, int, int)
- Double getItemSellPrice(ShopItem, ItemStack, int, int)
- Double getItemBuyPrice(ItemStack)
- Double getItemBuyPrice(Player, ItemStack)
- Double getItemBuyPrice(ShopItem, ItemStack)
- Double getItemBuyPrice(ShopItem, ItemStack, Player)
- double getItemBuyPrice(ShopItem, int)
- double getItemBuyPrice(ShopItem, Player, int)
- Long getSellLimitRestockTime(ShopItem, UUID)
- int getItemStock(ShopItem, UUID)
- boolean hasMultipleBuyPrices(ShopItem)
- Optional getSellPrice(OfflinePlayer, ItemStack)
- SellPrices getSellPrices(OfflinePlayer, ItemStack[])
- void buyItem(ItemStack, int)
- void buyItem(ShopItem, int)
- SellPrices getCutSellPrices(OfflinePlayer, ItemStack[], boolean)
- List getShopSections()
- boolean isBuyAble(ShopItem)
- int buyItemStock(ShopItem, UUID, int)
- Long getItemStockRestockTime(ShopItem, UUID)
- boolean hasMultipleSellPrices(ShopItem)
- Map getSections()

## Package: me.gypopo.economyshopgui.api.events

### Class: me.gypopo.economyshopgui.api.events.CustomEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.gypopo.economyshopgui.api.events.PostTransactionEvent
Type: Class
Extends: me.gypopo.economyshopgui.api.events.CustomEvent

Methods:
- Map getItems()
- Player getPlayer()
- Transaction$Type getTransactionType()
- ItemStack getItemStack()
- Transaction$Result getTransactionResult()
- Map getPrices()
- double getPrice()
- ShopItem getShopItem()
- int getAmount()

### Class: me.gypopo.economyshopgui.api.events.PreTransactionEvent
Type: Class
Extends: me.gypopo.economyshopgui.api.events.CustomEvent
Implements: org.bukkit.event.Cancellable

Methods:
- Map getOriginalPrices()
- Map getItems()
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- Transaction$Type getTransactionType()
- ItemStack getItemStack()
- void setPrice(double)
- Map getPrices()
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
- Map getPrices()
- double getPrice(EcoType)
- ShopItem getShopItem()
- int getAmount()

### Class: me.gypopo.economyshopgui.api.objects.SellPrice
Type: Class

Methods:
- OfflinePlayer getPlayer()
- SellPrice updateLimits()
- Map getPrices()
- double getPrice(EcoType)
- ShopItem getShopItem()
- int getAmount()

### Class: me.gypopo.economyshopgui.api.objects.SellPrices
Type: Class

Methods:
- Map getItems()
- OfflinePlayer getPlayer()
- SellPrices updateLimits()
- boolean isEmpty()
- Map getPrices()
- double getPrice(EcoType)

## Package: me.gypopo.economyshopgui.api.prices

### Class: me.gypopo.economyshopgui.api.prices.AdvancedBuyPrice
Type: Class

Methods:
- List getBuyTypes()
- boolean isBuyAble()
- boolean requireAll()
- Map getBuyPrices(EcoType, int)
- Map getBuyPrices(EcoType, Player, int)

### Class: me.gypopo.economyshopgui.api.prices.AdvancedSellPrice
Type: Class

Methods:
- boolean isSellAble()
- List getSellTypes()
- Map getSellPrices(EcoType, ItemStack)
- Map getSellPrices(EcoType, ItemStack, int, int)
- Map getSellPrices(EcoType, Player, ItemStack)
- Map getSellPrices(EcoType, Player, ItemStack, int, int)
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
- Map getItems()
- int getSize()
- String getItem(int)

## Package: me.gypopo.economyshopgui.objects.mappings

### Class: me.gypopo.economyshopgui.objects.mappings.ClickAction
Type: Enum
Extends: java.lang.Enum

Methods:
- ClickAction valueOf(String)
- ClickAction[] values()

## Package: me.gypopo.economyshopgui.objects.shops

### Class: me.gypopo.economyshopgui.objects.shops.ShopSection
Type: Interface

Methods:
- void openShopSection(Player, boolean)
- void openShopSection(Player, boolean, String)
- void openShopSection(Player, int, boolean)
- void openShopSection(Player, int, boolean, String)
- List getClickCommands()
- boolean isCommandItem()
- boolean isSubSection()
- Collection getShopItems()
- boolean isHidden()
- ClickAction getClickAction(ClickType)
- String getSection()
- ShopType getType()
- ShopPageItems getShopPageItems(int)
- List getItemLocs()
- boolean isCloseMenu()
- int getPages()
- void reloadItem(String)
- int getPageForShopItem(String)
- ShopItem getShopItem(String)

### Class: me.gypopo.economyshopgui.objects.shops.ShopType
Type: Enum
Extends: java.lang.Enum

Methods:
- ShopType valueOf(String)
- ShopType[] values()

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

Methods:
- EcoType getFromString(String)
- String getName()
- EconomyType valueOf(String)
- EconomyType[] values()

### Class: me.gypopo.economyshopgui.util.Transaction
Type: Class

No public methods found

