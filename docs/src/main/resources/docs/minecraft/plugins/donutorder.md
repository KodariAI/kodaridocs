# donutorder-api API Reference

## Package: me.serbob.donutorder.api.currency

### Class: me.serbob.donutorder.api.currency.CurrencyHook
Type: Interface
Description: Interface for integrating different economy/currency plugins with DonutOrder

Methods:
- String getName() - Get the name of the currency plugin
- void init() - Initialize the currency hook
- double getBalance(OfflinePlayer player) - Get player's balance
- void withdraw(OfflinePlayer player, double amount) - Remove amount from player's balance
- void deposit(OfflinePlayer player, double amount) - Add amount to player's balance

### Class: me.serbob.donutorder.api.currency.CurrencyManager
Type: Class
Description: Singleton manager for handling currency plugin integrations. Uses lazy initialization pattern for thread-safe singleton implementation.

Methods:
- **static** CurrencyManager getInstance() - Get the singleton instance of CurrencyManager
- Map<String, CurrencyHook> getRegisteredCurrencies() - Get all registered currency hooks (@Getter)
- void registerCurrency(CurrencyHook currencyHook) - Register a new currency integration
- boolean setActiveCurrency(String currencyName) - Set active currency from config. Returns true if currency was set successfully. Pass "none" to disable currency integration
- double getBalance(OfflinePlayer player) - Get player's balance. Returns 0 if no currency active
- void withdraw(OfflinePlayer player, double amount) - Remove amount from player's balance. Does nothing if no currency active
- void deposit(OfflinePlayer player, double amount) - Add amount to player's balance. Does nothing if no currency active
- CurrencyHook getActiveCurrency() - Get currently active currency or null if none

## Package: me.serbob.donutorder.api.event

### Class: me.serbob.donutorder.api.event.CurrencyRegistrationCompleteEvent
Type: Class
Extends: org.bukkit.event.Event
Description: Event fired when all currency hooks have been registered and an active currency has been selected

Methods:
- CurrencyRegistrationCompleteEvent(Map<String, CurrencyHook> registeredCurrencies, CurrencyHook activeCurrency) - Constructor
- Map<String, CurrencyHook> getRegisteredCurrencies() - Get all registered currency hooks (@Getter)
- CurrencyHook getActiveCurrency() - Get the active currency hook that will be used (@Getter)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: me.serbob.donutorder.api.event.OrderExpirationEvent
Type: Class
Extends: org.bukkit.event.Event
Description: Event fired when an order expires. Orders expire after their duration has passed and can then be deleted after the deletion threshold period.

Methods:
- OrderExpirationEvent(Order order) - Constructor
- Order getOrder() - Get the order that has expired (@Getter)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: me.serbob.donutorder.api.event.PlayerOrderDeliveryCompleteEvent
Type: Class
Extends: org.bukkit.event.Event
Description: Event fired when a player completes delivering items for an order

Methods:
- PlayerOrderDeliveryCompleteEvent(Player player, Order order) - Constructor
- Player getPlayer() - Get the player who completed the delivery (@Getter)
- Order getOrder() - Get the order that was completed (@Getter)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: me.serbob.donutorder.api.event.PlayerOrderItemEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable
Description: Event fired when a player interacts with an order item. Can be cancelled to prevent the interaction.

Methods:
- PlayerOrderItemEvent(Player player, Order order) - Constructor
- Player getPlayer() - Get the player interacting with the order (@Getter)
- Order getOrder() - Get the order being interacted with (@Getter)
- boolean isCancelled()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: me.serbob.donutorder.api.event.PlayerQueryItemEvent
Type: Class
Extends: org.bukkit.event.Event
Description: Event fired when a player queries for items. Other plugins can add items to the query results through this event.

Methods:
- PlayerQueryItemEvent(Player player, String query) - Constructor
- Player getPlayer() - Get the player who initiated the query (@Getter)
- String getQuery() - Get the search query string (@Getter)
- QueryItemList getList() - Get the list where items can be added
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

### Class: me.serbob.donutorder.api.event.PlayerQueryItemEvent.QueryItemList
Type: Class
Description: Container for items that match a player's query

Methods:
- void addItem(ItemStack item) - Add an item to the query results
- List<ItemStack> getItems() - Get all items in the query results

### Class: me.serbob.donutorder.api.event.ShopRegistrationCompleteEvent
Type: Class
Extends: org.bukkit.event.Event
Description: Event fired when all shop hooks have been registered and an active shop has been selected

Methods:
- ShopRegistrationCompleteEvent(Map<String, ShopHook> registeredShops, ShopHook activeShop) - Constructor
- Map<String, ShopHook> getRegisteredShops() - Get all registered shop hooks (@Getter)
- ShopHook getActiveShop() - Get the active shop hook that will be used for pricing (@Getter)
- **static** HandlerList getHandlerList()
- HandlerList getHandlers()

## Package: me.serbob.donutorder.api.shop

### Class: me.serbob.donutorder.api.shop.OrderItem
Type: Class
Description: Represents an item in an order with its associated sell price

Methods:
- OrderItem() - Constructor (@RequiredArgsConstructor)
- ItemStack getItem() - Get the item (@Getter)
- double getSellPrice() - Get the sell price of the item (@Getter)

### Class: me.serbob.donutorder.api.shop.ShopHook
Type: Interface
Description: Interface for integrating different shop plugins with DonutOrder for price retrieval

Methods:
- String getName() - Get the name of the shop plugin
- void init() - Initialize the shop hook
- double getSellPrice(ItemStack itemStack) - Get sell price for a specific item. Returns -1 if not found

### Class: me.serbob.donutorder.api.shop.ShopManager
Type: Class
Description: Singleton manager for handling shop plugin integrations and price synchronization

Methods:
- **static** ShopManager getInstance() - Get the singleton instance of ShopManager
- Map<String, ShopHook> getRegisteredShops() - Get all registered shop hooks (@Getter)
- void registerShop(ShopHook shopHook) - Register a new shop integration
- boolean setActiveShop(String shopName) - Set active shop from config. Returns true if shop was set successfully. Pass "none" to disable shop integration
- ShopHook getActiveShop() - Get currently active shop or null if none
- void syncPrices() - Sync prices from active shop to all material configurations. Only syncs items with valid prices (not -1)

## Package: me.serbob.donutorder.api.util

### Class: me.serbob.donutorder.api.util.Order
Type: Class
Description: Represents a player order with delivery tracking and expiration management. Orders have a creation time, duration, and deletion threshold for automatic cleanup.

Methods:
- Order(UUID orderId, UUID creatorId, String playerName, ItemStack item, int totalAmount, double pricePerItem, int deliveredAmount, int claimedAmount, double totalPaid, long creationTime, long duration) - Full constructor (@AllArgsConstructor)
- Order(UUID orderId, UUID creatorId, String playerName, ItemStack item, int totalAmount, double pricePerItem, int deliveredAmount, double totalPaid, long duration) - Convenience constructor (sets claimedAmount to 0 and creationTime to current time)
- UUID getOrderId() - Get unique order identifier (@Getter)
- UUID getCreatorId() - Get UUID of player who created the order (@Getter)
- String getPlayerName() - Get name of player who created the order (@Getter)
- void setPlayerName(String playerName) - Set player name (@Setter)
- ItemStack getItem() - Get the item being ordered (@Getter)
- void setItem(ItemStack item) - Set the item (@Setter)
- int getTotalAmount() - Get total amount of items ordered (@Getter)
- void setTotalAmount(int totalAmount) - Set total amount (@Setter)
- double getPricePerItem() - Get price per individual item (@Getter)
- void setPricePerItem(double pricePerItem) - Set price per item (@Setter)
- int getDeliveredAmount() - Get amount already delivered (@Getter)
- void setDeliveredAmount(int deliveredAmount) - Set delivered amount (@Setter)
- int getClaimedAmount() - Get amount claimed but not yet delivered (@Getter)
- void setClaimedAmount(int claimedAmount) - Set claimed amount (@Setter)
- double getTotalPaid() - Get total amount paid so far (@Getter)
- void setTotalPaid(double totalPaid) - Set total paid (@Setter)
- long getCreationTime() - Get timestamp when order was created (@Getter)
- void setCreationTime(long creationTime) - Set creation time (@Setter)
- long getDuration() - Get duration in milliseconds before order expires (@Getter)
- void setDuration(long duration) - Set duration (@Setter)
- void setDELETION_THRESHOLD(int expirationDurationInDays) - Set how many days after expiration before order is deleted
- int getAvailableAmount() - Get remaining amount that can be delivered (total - delivered - claimed)
- long getExpirationTime() - Get timestamp when order will expire
- long getRemainingTime() - Get milliseconds until order expires
- long getDeletionRemainingTime() - Get milliseconds until order will be deleted
- boolean isExpired() - Check if order has passed deletion threshold and should be removed
- boolean isInDeletionThreshold() - Check if order has expired but not yet reached deletion threshold
- void handleExpiration() - Handle order expiration logic (currently empty, can be overridden)
- double getTotalCost() - Get total cost of the entire order
- double getRemainingCost() - Get remaining amount to be paid
- boolean isComplete() - Check if all items have been delivered
- String toString() - Get string representation of the order (@ToString)