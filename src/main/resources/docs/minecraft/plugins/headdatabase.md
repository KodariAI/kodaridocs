# HeadDatabase-API-1.3.2 API Reference

## Package: me.arcaniax.hdb.api

### Class: me.arcaniax.hdb.api.DatabaseLoadEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- int getAmount()

### Class: me.arcaniax.hdb.api.HeadDatabaseAPI
Type: Class

Methods:
- boolean removeHead(String)
- String getItemID(ItemStack)
- String getBlockID(Block)
- boolean addHead(CategoryEnum, Head)
- String addHead(CategoryEnum, String, UUID)
- String addHead(CategoryEnum, String, String)
- ItemStack getRandomHead()
- CategoryEnum getCategory(String)
- boolean isDecorativeHead(Block)
- boolean isDecorativeHead(ItemStack)
- boolean setBlockSkin(Block, String)
- boolean isHead(String)
- List getHeads(CategoryEnum)
- String getBase64(String)
- String getBase64(ItemStack)
- String getBase64(Block)
- void setPrefixID(String)
- ItemStack getItemHead(String)
- ItemStack getItemHead(Block)

### Class: me.arcaniax.hdb.api.PlayerClickHeadEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- boolean isCancelled()
- boolean isEconomy()
- Player getPlayer()
- HandlerList getHandlers()
- void setCancelled(Boolean)
- ItemStack getHead()
- CategoryEnum getCategoryEnum()
- **static** HandlerList getHandlerList()
- EconomyEnum getEconomyEnum()
- String getHeadID()
- double getPrice()

## Package: me.arcaniax.hdb.enums

### Class: me.arcaniax.hdb.enums.CategoryEnum
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** CategoryEnum valueOf(String)
- **static** CategoryEnum[] values()

### Class: me.arcaniax.hdb.enums.EconomyEnum
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** EconomyEnum valueOf(String)
- **static** EconomyEnum[] values()

### Class: me.arcaniax.hdb.enums.VanillaHeadTypeEnum
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** VanillaHeadTypeEnum valueOf(String)
- **static** VanillaHeadTypeEnum[] values()

## Package: me.arcaniax.hdb.object.head

### Class: me.arcaniax.hdb.object.head.Head
Type: Class

Methods:
- boolean search(String)
- ItemStack getHead()
- void setPrice(Double)
- double getPrice()

### Class: me.arcaniax.hdb.object.head.OwnHead
Type: Class
Extends: me.arcaniax.hdb.object.head.VanillaHead

Methods:
- ItemStack getHead(Player)

### Class: me.arcaniax.hdb.object.head.VanillaHead
Type: Class
Extends: me.arcaniax.hdb.object.head.Head

Methods:
- ItemStack getHead()

