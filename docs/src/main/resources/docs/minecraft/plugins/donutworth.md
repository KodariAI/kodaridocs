# donutworth-api API Reference

## Package: me.serbob.donutworth.api.currency

### Class: me.serbob.donutworth.api.currency.CurrencyHook
Type: Interface
Description: Interface for integrating different economy/currency plugins with DonutWorth

Methods:
- String getName() - Get the name of the currency plugin
- void init() - Initialize the currency hook
- double getBalance(OfflinePlayer player) - Get player's balance
- void withdraw(OfflinePlayer player, double amount) - Remove amount from player's balance
- void deposit(OfflinePlayer player, double amount) - Add amount to player's balance

### Class: me.serbob.donutworth.api.currency.CurrencyManager
Type: Class
Description: Singleton manager for handling currency plugin integrations. Uses lazy initialization with @Getter(lazy = true) for thread-safe singleton.

Methods:
- **static** CurrencyManager getInstance() - Get the singleton instance of CurrencyManager (@Getter lazy)
- Map<String, CurrencyHook> getRegisteredCurrencies() - Get all registered currency hooks (@Getter)
- void registerCurrency(CurrencyHook currencyHook) - Register a new currency integration
- boolean setActiveCurrency(String currencyName) - Set active currency from config. Returns true if currency was set successfully. Pass "none" to disable currency integration
- double getBalance(Player player) - Get player's balance. Returns 0 if no currency active
- void withdraw(Player player, double amount) - Remove amount from player's balance. Does nothing if no currency active
- void deposit(Player player, double amount) - Add amount to player's balance. Does nothing if no currency active
- CurrencyHook getActiveCurrency() - Get currently active currency or null if none

## Package: me.serbob.donutworth.api.event

### Class: me.serbob.donutworth.api.event.AsyncPostItemsSoldEvent
Type: Class
Extends: org.bukkit.event.Event
Description: Asynchronous event fired after items have been sold. This event is called after the transaction is complete and cannot be modified.

Methods:
- AsyncPostItemsSoldEvent(List<ItemStack> itemsSold, double price, Player player) - Constructor (async = true)
- List<ItemStack> getItemsSold() - Get the list of items that were sold (@Getter)
- double getPrice() - Get the final price the items were sold for (@Getter)
- Player getPlayer() - Get the player who sold the items (@Getter)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: me.serbob.donutworth.api.event.CurrencyRegistrationCompleteEvent
Type: Class
Extends: org.bukkit.event.Event
Description: Event fired when all currency hooks have been registered and an active currency has been selected. Useful for plugins that need to know when the economy system is ready.

Methods:
- CurrencyRegistrationCompleteEvent(Map<String, CurrencyHook> registeredCurrencies, CurrencyHook activeCurrency) - Constructor
- Map<String, CurrencyHook> getRegisteredCurrencies() - Get all registered currency hooks (@Getter)
- CurrencyHook getActiveCurrency() - Get the active currency hook that will be used (@Getter)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: me.serbob.donutworth.api.event.PreItemsSoldEvent
Type: Class
Extends: org.bukkit.event.Event
Description: Event fired before items are sold. The price can be modified in this event to apply custom multipliers or adjustments.

Methods:
- PreItemsSoldEvent(List<ItemStack> itemsSold, double price, Player player) - Constructor
- List<ItemStack> getItemsSold() - Get the list of items about to be sold (@Getter)
- double getPrice() - Get the calculated price for the items (@Getter)
- void setPrice(double price) - Set/modify the price before the sale completes (@Setter)
- Player getPlayer() - Get the player who is selling the items (@Getter)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: me.serbob.donutworth.api.event.ShopRegistrationCompleteEvent
Type: Class
Extends: org.bukkit.event.Event
Description: Event fired when all shop hooks have been registered and an active shop has been selected. Useful for plugins that need to know when the shop pricing system is ready.

Methods:
- ShopRegistrationCompleteEvent(Map<String, ShopHook> registeredShops, ShopHook activeShop) - Constructor (@AllArgsConstructor)
- Map<String, ShopHook> getRegisteredShops() - Get all registered shop hooks (@Getter)
- ShopHook getActiveShop() - Get the active shop hook that will be used for pricing (@Getter)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

## Package: me.serbob.donutworth.api.shop

### Class: me.serbob.donutworth.api.shop.ShopHook
Type: Interface
Description: Interface for integrating different shop plugins with DonutWorth. Allows DonutWorth to fetch prices from various shop systems.

Methods:
- String getName() - Get the name of the shop plugin
- void init() - Initialize the shop hook
- double getSellPrice(Material material) - Get sell price for a specific material. Returns -1 if not found
- double getSellPrice(Player player, Material material) - Get sell price for a specific material and player (for player-specific prices). Returns -1 if not found

### Class: me.serbob.donutworth.api.shop.ShopManager
Type: Class
Description: Singleton manager for handling shop plugin integrations. Uses lazy initialization with @Getter(lazy = true) for thread-safe singleton. Manages registration and price fetching from different shop plugins.

Methods:
- **static** ShopManager getInstance() - Get the singleton instance of ShopManager (@Getter lazy)
- Map<String, ShopHook> getRegisteredShops() - Get all registered shop hooks (@Getter)
- void registerShop(ShopHook shopHook) - Register a new shop integration
- boolean setActiveShop(String shopName) - Set active shop from config. Returns true if shop was set successfully. Pass "none" to disable shop integration
- double getPrice(Material material) - Get price for a material. Returns -1 if no shop active
- double getPrice(Player player, Material material) - Get price for a player and material (supports player-specific pricing). Returns -1 if no shop active
- ShopHook getActiveShop() - Get currently active shop or null if none
- boolean hasAnActiveShop() - Check if there is an active shop configured
- void syncPrices() - Sync prices from active shop to all material configurations in DonutWorth. Updates internal price cache with latest shop prices

## Package: me.serbob.donutworth.api.util

### Class: me.serbob.donutworth.api.util.Prices
Type: Class
Description: Utility class for price calculations and management. Provides static methods for getting and setting item prices with support for multipliers.

Methods:
- **static** double getPriceWithMultiplier(Player player, ItemStack itemStack) - Get the price of an item with player-specific category multipliers applied. This is the final sell price a player would receive
- **static** double getPrice(ItemStack itemStack) - Get the base price of an item without any multipliers
- **static** void addOrUpdatePrice(ItemStack itemStack, double amount) - Add a new price or update existing price for an item
- **static** void removePrice(ItemStack itemStack) - Remove the price entry for an item