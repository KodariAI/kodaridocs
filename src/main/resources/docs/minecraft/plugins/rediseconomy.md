# RedisEconomy-4.5.4-dev-unnm3d-rediseconomy-api API Reference

**Package Filter:** `dev.unnm3d.rediseconomy.api`

## Package: dev.unnm3d.rediseconomy.api

### Class: dev.unnm3d.rediseconomy.api.RedisEconomyAPI
Type: Abstract Class

Methods:
- UUID getUUIDFromUsernameCache(String)
- Map getCurrenciesWithNames()
- Collection getCurrencies()
- Currency getDefaultCurrency()
- EconomyExchange getExchange()
- Currency getCurrencyBySymbol(String)
- String getCaseSensitiveName(String)
- **static** RedisEconomyAPI getAPI()
- Currency getCurrencyByName(String)
- String getUsernameFromUUIDCache(UUID)

### Class: dev.unnm3d.rediseconomy.api.TransactionEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Transaction getTransaction()

