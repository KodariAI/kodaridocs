# LiteBans-litebans-api API Reference

**Package Filter:** `litebans.api`

## Package: litebans.api

### Class: litebans.api.Database
Type: Abstract Class

Methods:
- Entry getBan(long, String)
- Entry getBan(UUID, String, String)
- Entry getWarning(long, String)
- Entry getWarning(UUID, String, String)
- **static** Database get()
- PreparedStatement prepareStatement(String)
- String getPlayerName(UUID)
- boolean isPlayerMuted(UUID, String)
- boolean isPlayerMuted(UUID, String, String)
- Collection getUsersByIP(String)
- Entry getKick(UUID, String, String)
- Entry getKick(long, String)
- Entry getMute(long, String)
- Entry getMute(UUID, String, String)
- **static** void setInstance(Database)
- boolean isPlayerBanned(UUID, String)
- boolean isPlayerBanned(UUID, String, String)

### Class: litebans.api.Entry
Type: Abstract Class

Methods:
- long getDateEnd()
- String getExecutorUUID()
- long getRemainingDuration(long)
- String getIp()
- String getRemovedByName()
- String getExecutorName()
- long getId()
- boolean isActive()
- String getRandomID()
- String getRemovedByUUID()
- long getDuration()
- String getRemainingDurationString(long)
- String getTemplateName()
- boolean isIpban()
- String getServerOrigin()
- String getReason()
- long getDateStart()
- int getTemplateID()
- boolean isPermanent()
- String getServerScope()
- String getRemovalReason()
- String getType()
- String getUuid()
- String getDurationString()
- String toString()
- boolean isSilent()
- boolean hasTemplate()
- boolean isExpired(long)

### Class: litebans.api.Events
Type: Abstract Class

Methods:
- **static** Events get()
- void unregister(Events$Listener)
- **static** void setInstance(Events)
- void register(Events$Listener)

### Class: litebans.api.Events$Listener
Type: Class

Methods:
- void entryAdded(Entry)
- void entryRemoved(Entry)
- void broadcastSent(String, String)

### Class: litebans.api.PlayerProvider
Type: Abstract Class

Methods:
- String provide(String)
- **static** PlayerProvider get()
- **static** void setInstance(PlayerProvider)

### Class: litebans.api.RandomID
Type: Abstract Class

Methods:
- long reveal(String)
- **static** RandomID get()
- String convert(long)
- **static** void setInstance(RandomID)

## Package: litebans.api.exception

### Class: litebans.api.exception.MissingImplementationException
Type: Class
Extends: java.lang.UnsupportedOperationException

No public methods found

