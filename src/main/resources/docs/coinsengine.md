# CoinsEngine-2.5.0-su-nightexpress-coinsengine-api API Reference

**Package Filter:** `su.nightexpress.coinsengine.api`

## Package: su.nightexpress.coinsengine.api

### Class: su.nightexpress.coinsengine.api.CoinsEngineAPI
Type: Class

Methods:
- **static** Currency getCurrency(String)
- **static** void clear()
- **static** boolean hasCurrency(String)
- **static** UserManager getUserManager()
- **static** boolean isLoaded()
- **static** CompletableFuture getUserDataAsync(String)
- **static** CompletableFuture getUserDataAsync(UUID)
- **static** boolean removeBalance(UUID, String, double)
- **static** boolean removeBalance(UUID, Currency, double)
- **static** void removeBalance(Player, Currency, double)
- **static** double getBalance(UUID, String)
- **static** double getBalance(UUID, Currency)
- **static** double getBalance(Player, Currency)
- **static** CoinsEnginePlugin plugin()
- **static** void load(CoinsEnginePlugin)
- **static** Collection getCurrencies()
- **static** CoinsUser getUserData(Player)
- **static** CoinsUser getUserData(String)
- **static** CoinsUser getUserData(UUID)
- **static** CurrencyManager getCurrencyManager()
- **static** boolean setBalance(UUID, String, double)
- **static** boolean setBalance(UUID, Currency, double)
- **static** void setBalance(Player, Currency, double)
- **static** void regsiterCurrency(Currency)
- **static** boolean addBalance(UUID, String, double)
- **static** boolean addBalance(UUID, Currency, double)
- **static** void addBalance(Player, Currency, double)

## Package: su.nightexpress.coinsengine.api.currency

### Class: su.nightexpress.coinsengine.api.currency.Currency
Type: Interface

Methods:
- CompactNumber formatCompactValue(double)
- String formatCompact(double)
- Map getExchangeRates()
- String getName()
- boolean isLeaderboardEnabled()
- void sendPrefixed(LangText, CommandSender)
- void sendPrefixed(LangText, CommandSender, Consumer)
- void sendPrefixed(LangMessage, CommandSender)
- void sendPrefixed(LangMessage, CommandSender, Consumer)
- double floorAndLimit(double)
- boolean isInteger()
- boolean isUnlimited()
- double fine(double)
- String getFormatShort()
- boolean isVaultEconomy()
- double limit(double)
- boolean isDecimal()
- String getFormat()
- boolean isUnderLimit(double)
- UnaryOperator replacePlaceholders()
- String getPrefix()
- String getPermission()
- void setVaultEconomy(boolean)
- void setDecimal(boolean)
- void setStartValue(double)
- boolean isTransferAllowed()
- String format(double)
- boolean isSynchronizable()
- double getExchangeRate(Currency)
- double getExchangeRate(String)
- void setIcon(ItemStack)
- void setIcon(NightItem)
- void setMaxValue(double)
- double floorIfNeeded(double)
- boolean hasPermission(Player)
- void setCommandAliases(String[])
- double fineAndLimit(double)
- String[] getCommandAliases()
- String getSymbol()
- void setName(String)
- void setSynchronizable(boolean)
- double getMaxValue()
- CompactNumber compacted(double)
- NightItem icon()
- void setPermissionRequired(boolean)
- String getColumnName()
- double getMinTransferAmount()
- String getId()
- double getStartValue()
- void setExchangeAllowed(boolean)
- String formatValue(double)
- void setFormat(String)
- boolean isPermissionRequired()
- void setColumnName(String)
- boolean isLimited()
- double limitIfNeeded(double)
- boolean isExchangeAllowed()
- double getExchangeResult(Currency, double)
- boolean canExchangeTo(Currency)
- ItemStack getIcon()
- void setTransferAllowed(boolean)
- void setPrefix(String)
- void setMinTransferAmount(double)
- void setFormatShort(String)
- void setSymbol(String)

### Class: su.nightexpress.coinsengine.api.currency.CurrencyOperation
Type: Interface

Methods:
- boolean isLoggable()
- Currency getCurrency()
- CoinsUser getUser()
- OperationResult perform()
- void setLoggable(boolean)
- double getAmount()

### Class: su.nightexpress.coinsengine.api.currency.OperationResult
Type: Class

Methods:
- String getLog()
- long getTimestamp()
- boolean isSuccess()

## Package: su.nightexpress.coinsengine.api.event

### Class: su.nightexpress.coinsengine.api.event.ChangeBalanceEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- Currency getCurrency()
- double getNewAmount()
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- CoinsUser getUser()
- **static** HandlerList getHandlerList()
- double getOldAmount()

