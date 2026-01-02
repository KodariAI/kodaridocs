# economy-bridge-1.2.1 API Reference

## Package: su.nightexpress.economybridge

### Class: su.nightexpress.economybridge.BridgePlugin
Type: Class
Extends: su.nightexpress.nightcore.NightPlugin
Implements: su.nightexpress.nightcore.command.experimental.ImprovedCommands

Methods:
- void disable()
- void enable()
- ItemManager getItemManager()
- CurrencyManager getCurrencyManager()

### Class: su.nightexpress.economybridge.EconomyBridge
Type: Class

Methods:
- **static** DummyCurrency getDummyCurrency()
- **static** Currency getCurrency(String)
- **static** boolean withdrawEconomy(Player, double)
- **static** boolean withdrawEconomy(UUID, double)
- **static** boolean hasEnough(Player, String, double)
- **static** boolean hasEnough(UUID, String, double)
- **static** boolean handle(String, Consumer)
- **static** boolean hasCurrency(String)
- **static** boolean hasCurrency()
- **static** double getEconomyBalance(Player)
- **static** double getEconomyBalance(UUID)
- **static** void registerCurrency(Currency)
- **static** double getBalance(Player, String)
- **static** double getBalance(UUID, String)
- **static** Set getCurrencies()
- **static** BridgePlugin getPlugin()
- **static** boolean deposit(Player, String, double)
- **static** boolean deposit(UUID, String, double)
- **static** Currency getCurrencyOrDummy(String)
- **static** CurrencyManager getCurrencyManager()
- **static** boolean isDisabled(String)
- **static** boolean depositEconomy(Player, double)
- **static** boolean depositEconomy(UUID, double)
- **static** Set getCurrencyIds()
- **static** boolean hasEconomy()
- **static** boolean withdraw(Player, String, double)
- **static** boolean withdraw(UUID, String, double)

### Class: su.nightexpress.economybridge.ItemBridge
Type: Class

Methods:
- **static** boolean registerHandler(ItemHandler)
- **static** boolean isCustomItem(ItemStack)
- **static** String getItemId(String, ItemStack)
- **static** String getItemId(ItemStack)
- **static** Set getHandlers()
- **static** ItemStack createItem(String, String)
- **static** ItemManager getItemManager()
- **static** ItemHandler getHandlerOrDummy(String)
- **static** ItemHandler getHandlerOrDummy(ItemStack)
- **static** ItemHandler getHandler(String)
- **static** ItemHandler getHandler(ItemStack)
- **static** DummyHandler getDummyHandler()
- **static** ItemHandler getItemHandler(String)
- **static** ItemHandler getItemHandler(ItemStack)

### Class: su.nightexpress.economybridge.Placeholders
Type: Class
Extends: su.nightexpress.nightcore.util.Placeholders

Methods:
- **static** UnaryOperator forCurrency(Currency)

## Package: su.nightexpress.economybridge.api

### Class: su.nightexpress.economybridge.api.Currency
Type: Interface

Methods:
- ItemStack getDefaultIcon()
- void give(Player, double)
- void give(UUID, double)
- UnaryOperator replacePlaceholders()
- String getName()
- boolean canHandleDecimals()
- String getInternalId()
- double fineValue(double)
- String format(double)
- String applyFormat(String, double)
- ItemStack getIcon()
- void take(Player, double)
- void take(UUID, double)
- double getBalance(Player)
- double getBalance(UUID)
- String formatValue(double)
- String getDefaultFormat()
- String getFormat()
- String getOriginalId()
- boolean canHandleOffline()
- String getDefaultName()
- boolean isDummy()

## Package: su.nightexpress.economybridge.api.item

### Class: su.nightexpress.economybridge.api.item.ItemHandler
Type: Interface

Methods:
- String getItemId(ItemStack)
- String getName()
- boolean isValidId(String)
- boolean canHandle(ItemStack)
- ItemStack createItem(String)
- boolean isDummy()

## Package: su.nightexpress.economybridge.command

### Class: su.nightexpress.economybridge.command.BaseCommands
Type: Class

Methods:
- **static** void load(BridgePlugin)

### Class: su.nightexpress.economybridge.command.CommandArguments
Type: Class

No public methods found

## Package: su.nightexpress.economybridge.config

### Class: su.nightexpress.economybridge.config.Config
Type: Class

Methods:
- **static** boolean isDisabledCurrency(String)
- **static** boolean isPlaceholderAPIInFormat()

### Class: su.nightexpress.economybridge.config.Lang
Type: Class
Extends: su.nightexpress.nightcore.core.CoreLang

No public methods found

### Class: su.nightexpress.economybridge.config.Perms
Type: Class

No public methods found

## Package: su.nightexpress.economybridge.currency

### Class: su.nightexpress.economybridge.currency.CurrencyId
Type: Class

Methods:
- **static** String forCoinsEngine(String)
- **static** String reroute(String)
- **static** String forUltraEconomy(String)

### Class: su.nightexpress.economybridge.currency.CurrencyManager
Type: Class
Extends: su.nightexpress.nightcore.manager.AbstractManager

Methods:
- Currency getCurrency(String)
- void loadCurrency(String, String, Function)
- void loadCurrency(String, Function)
- void loadCurrency(AbstractCurrency)
- void loadCurrency(AbstractCurrency, CurrencySettings)
- FileConfig getCurrenciesConfig()
- void handlePluginLoad(String)
- void loadItemCurrencies()
- boolean hasCurrency()
- void registerCurrency(Currency)
- Set getCurrencies()
- FileConfig getItemsConfig()
- Map getCurrencyMap()
- Currency getCurrencyOrDummy(String)
- void saveCurrency(ItemStackCurrency)
- Set getCurrencyIds()
- void loadBuiltInCurrencies()

### Class: su.nightexpress.economybridge.currency.CurrencyPlugins
Type: Class

No public methods found

### Class: su.nightexpress.economybridge.currency.CurrencySettings
Type: Class

Methods:
- **static** CurrencySettings fromDefaults(Currency)
- String getName()
- void load(FileConfig, String)
- String getFormat()
- void write(FileConfig, String)
- ItemStack getIcon()

## Package: su.nightexpress.economybridge.currency.impl

### Class: su.nightexpress.economybridge.currency.impl.BeastTokensCurrency
Type: Class
Extends: su.nightexpress.economybridge.currency.type.AbstractCurrency

Methods:
- void take(Player, double)
- void take(UUID, double)
- void give(Player, double)
- void give(UUID, double)
- ItemStack getDefaultIcon()
- double getBalance(Player)
- double getBalance(UUID)
- boolean canHandleDecimals()
- boolean canHandleOffline()
- String getDefaultName()

### Class: su.nightexpress.economybridge.currency.impl.CoinsEngineCurrency
Type: Class
Implements: su.nightexpress.economybridge.api.Currency

Methods:
- void give(Player, double)
- void give(UUID, double)
- ItemStack getDefaultIcon()
- UnaryOperator replacePlaceholders()
- String getName()
- boolean canHandleDecimals()
- String getInternalId()
- double fineValue(double)
- ItemStack getIcon()
- void take(Player, double)
- void take(UUID, double)
- double getBalance(Player)
- double getBalance(UUID)
- String formatValue(double)
- **static** Set getCurrencies()
- String getDefaultFormat()
- String getFormat()
- String getOriginalId()
- boolean canHandleOffline()
- String getDefaultName()

### Class: su.nightexpress.economybridge.currency.impl.DummyCurrency
Type: Class
Implements: su.nightexpress.economybridge.api.Currency

Methods:
- void give(Player, double)
- void give(UUID, double)
- ItemStack getDefaultIcon()
- String getName()
- boolean canHandleDecimals()
- String getInternalId()
- ItemStack getIcon()
- void take(Player, double)
- void take(UUID, double)
- double getBalance(Player)
- double getBalance(UUID)
- String getDefaultFormat()
- String getFormat()
- String getOriginalId()
- boolean canHandleOffline()
- String getDefaultName()

### Class: su.nightexpress.economybridge.currency.impl.EliteMobsCurrency
Type: Class
Extends: su.nightexpress.economybridge.currency.type.AbstractCurrency

Methods:
- void take(Player, double)
- void take(UUID, double)
- void give(Player, double)
- void give(UUID, double)
- ItemStack getDefaultIcon()
- double getBalance(Player)
- double getBalance(UUID)
- boolean canHandleDecimals()
- boolean canHandleOffline()
- String getDefaultName()

### Class: su.nightexpress.economybridge.currency.impl.ItemStackCurrency
Type: Class
Extends: su.nightexpress.economybridge.currency.type.AbstractCurrency

Methods:
- void take(Player, double)
- void take(UUID, double)
- void give(Player, double)
- void give(UUID, double)
- ItemStack getDefaultIcon()
- double getBalance(Player)
- double getBalance(UUID)
- boolean canHandleDecimals()
- ItemStack getItem()
- boolean canHandleOffline()
- String getDefaultName()
- void setItem(ItemStack)

### Class: su.nightexpress.economybridge.currency.impl.PlayerPointsCurrency
Type: Class
Extends: su.nightexpress.economybridge.currency.type.AbstractCurrency

Methods:
- void take(Player, double)
- void take(UUID, double)
- void give(Player, double)
- void give(UUID, double)
- ItemStack getDefaultIcon()
- double getBalance(Player)
- double getBalance(UUID)
- boolean canHandleDecimals()
- boolean canHandleOffline()
- String getDefaultName()

### Class: su.nightexpress.economybridge.currency.impl.UltraEconomyCurrency
Type: Class
Implements: su.nightexpress.economybridge.api.Currency

Methods:
- void give(Player, double)
- void give(UUID, double)
- ItemStack getDefaultIcon()
- String getName()
- boolean canHandleDecimals()
- String getInternalId()
- String format(double)
- ItemStack getIcon()
- void take(Player, double)
- void take(UUID, double)
- double getBalance(Player)
- double getBalance(UUID)
- String formatValue(double)
- **static** Set getCurrencies()
- String getFormat()
- String getOriginalId()
- boolean canHandleOffline()
- String getDefaultName()

### Class: su.nightexpress.economybridge.currency.impl.VaultEconomyCurrency
Type: Class
Extends: su.nightexpress.economybridge.currency.type.AbstractCurrency

Methods:
- void take(Player, double)
- void take(UUID, double)
- void give(Player, double)
- void give(UUID, double)
- ItemStack getDefaultIcon()
- double getBalance(Player)
- double getBalance(UUID)
- boolean canHandleDecimals()
- String getDefaultFormat()
- boolean canHandleOffline()
- String getDefaultName()

### Class: su.nightexpress.economybridge.currency.impl.VotingCurrency
Type: Class
Extends: su.nightexpress.economybridge.currency.type.AbstractCurrency

Methods:
- void take(Player, double)
- void take(UUID, double)
- void give(Player, double)
- void give(UUID, double)
- ItemStack getDefaultIcon()
- double getBalance(Player)
- double getBalance(UUID)
- boolean canHandleDecimals()
- boolean canHandleOffline()
- String getDefaultName()

### Class: su.nightexpress.economybridge.currency.impl.XPLevelsCurrency
Type: Class
Extends: su.nightexpress.economybridge.currency.type.AbstractCurrency

Methods:
- void take(Player, double)
- void take(UUID, double)
- void give(Player, double)
- void give(UUID, double)
- ItemStack getDefaultIcon()
- double getBalance(Player)
- double getBalance(UUID)
- boolean canHandleDecimals()
- boolean canHandleOffline()
- String getDefaultName()

### Class: su.nightexpress.economybridge.currency.impl.XPPointsCurrency
Type: Class
Extends: su.nightexpress.economybridge.currency.type.AbstractCurrency

Methods:
- void take(Player, double)
- void take(UUID, double)
- void give(Player, double)
- void give(UUID, double)
- ItemStack getDefaultIcon()
- double getBalance(Player)
- double getBalance(UUID)
- boolean canHandleDecimals()
- boolean canHandleOffline()
- String getDefaultName()

## Package: su.nightexpress.economybridge.currency.listener

### Class: su.nightexpress.economybridge.currency.listener.CurrencyListener
Type: Class
Extends: su.nightexpress.nightcore.manager.AbstractListener

Methods:
- void onPluginEnable(PluginEnableEvent)
- void onServiceRegister(ServiceRegisterEvent)

## Package: su.nightexpress.economybridge.currency.type

### Class: su.nightexpress.economybridge.currency.type.AbstractCurrency
Type: Abstract Class
Implements: su.nightexpress.economybridge.api.Currency

Methods:
- String getName()
- void load(CurrencySettings)
- CurrencySettings getSettings()
- String getInternalId()
- String getFormat()
- String getOriginalId()
- ItemStack getIcon()

## Package: su.nightexpress.economybridge.hook

### Class: su.nightexpress.economybridge.hook.VaultHook
Type: Class

Methods:
- **static** double getBalance(Player)
- **static** double getBalance(OfflinePlayer)
- **static** String getEconomyName()
- **static** boolean setupEconomy()
- **static** boolean deposit(Player, double)
- **static** boolean deposit(OfflinePlayer, double)
- **static** Economy getEconomy()
- **static** boolean hasEconomy()
- **static** void shutdown()
- **static** boolean withdraw(Player, double)
- **static** boolean withdraw(OfflinePlayer, double)

## Package: su.nightexpress.economybridge.item

### Class: su.nightexpress.economybridge.item.ItemManager
Type: Class
Extends: su.nightexpress.nightcore.manager.AbstractManager

Methods:
- Set getHandlers()
- ItemHandler getHandler(String)
- ItemHandler getHandler(ItemStack)
- DummyHandler getDummyHandler()
- boolean register(String, Supplier)
- boolean register(ItemHandler)

### Class: su.nightexpress.economybridge.item.ItemPlugins
Type: Class

Methods:
- **static** List values()

## Package: su.nightexpress.economybridge.item.handler

### Class: su.nightexpress.economybridge.item.handler.AbstractItemHandler
Type: Abstract Class
Implements: su.nightexpress.economybridge.api.item.ItemHandler

Methods:
- boolean isDummy()

## Package: su.nightexpress.economybridge.item.handler.impl

### Class: su.nightexpress.economybridge.item.handler.impl.DummyHandler
Type: Class
Extends: su.nightexpress.economybridge.item.handler.AbstractItemHandler

Methods:
- String getItemId(ItemStack)
- String getName()
- boolean isValidId(String)
- boolean canHandle(ItemStack)
- ItemStack createItem(String)
- boolean isDummy()

### Class: su.nightexpress.economybridge.item.handler.impl.ExcellentCratesHandler
Type: Class
Extends: su.nightexpress.economybridge.item.handler.AbstractItemHandler

Methods:
- String getItemId(ItemStack)
- String getName()
- boolean isValidId(String)
- boolean canHandle(ItemStack)
- ItemStack createItem(String)

### Class: su.nightexpress.economybridge.item.handler.impl.ExecutableItemsHandler
Type: Class
Extends: su.nightexpress.economybridge.item.handler.AbstractItemHandler

Methods:
- String getItemId(ItemStack)
- String getName()
- boolean isValidId(String)
- boolean canHandle(ItemStack)
- ItemStack createItem(String)

### Class: su.nightexpress.economybridge.item.handler.impl.ItemsAdderHandler
Type: Class
Extends: su.nightexpress.economybridge.item.handler.AbstractItemHandler

Methods:
- String getItemId(ItemStack)
- String getName()
- boolean isValidId(String)
- boolean canHandle(ItemStack)
- ItemStack createItem(String)

### Class: su.nightexpress.economybridge.item.handler.impl.MMOItemsHandler
Type: Class
Extends: su.nightexpress.economybridge.item.handler.AbstractItemHandler

Methods:
- String getItemId(ItemStack)
- String getName()
- boolean isValidId(String)
- boolean canHandle(ItemStack)
- ItemStack createItem(String)

### Class: su.nightexpress.economybridge.item.handler.impl.NexoHandler
Type: Class
Extends: su.nightexpress.economybridge.item.handler.AbstractItemHandler

Methods:
- String getItemId(ItemStack)
- String getName()
- boolean isValidId(String)
- boolean canHandle(ItemStack)
- ItemStack createItem(String)

### Class: su.nightexpress.economybridge.item.handler.impl.OraxenHandler
Type: Class
Extends: su.nightexpress.economybridge.item.handler.AbstractItemHandler

Methods:
- String getItemId(ItemStack)
- String getName()
- boolean isValidId(String)
- boolean canHandle(ItemStack)
- ItemStack createItem(String)

