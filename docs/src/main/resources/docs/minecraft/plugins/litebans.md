# LiteBans API Reference

LiteBans is a punishment management plugin (bans, mutes, warns, kicks). Its API lets you query punishment data, listen for punishment events, and run custom SQL against its database. All API calls are thread-safe but must NOT be called on the main server thread (they hit the database).

## Code Examples

### Check if a Player is Banned or Muted

```java
import litebans.api.Database;

import java.util.UUID;

public boolean isBanned(UUID uuid, String ip) {
    // Uses default server scope
    return Database.get().isPlayerBanned(uuid, ip);
}

public boolean isBannedOnServer(UUID uuid, String ip, String server) {
    // null = global scope only, Database.ANY_SERVER_SCOPE = all scopes
    return Database.get().isPlayerBanned(uuid, ip, server);
}

public boolean isMuted(UUID uuid, String ip) {
    return Database.get().isPlayerMuted(uuid, ip);
}
```

### Get Ban/Mute Entry Details

```java
import litebans.api.Database;
import litebans.api.Entry;

import java.util.UUID;

public void printBanInfo(UUID uuid, String ip) {
    Entry ban = Database.get().getBan(uuid, ip, Database.ANY_SERVER_SCOPE);
    if (ban == null) {
        System.out.println("Player is not banned.");
        return;
    }
    System.out.println("Reason: " + ban.getReason());
    System.out.println("Banned by: " + ban.getExecutorName());
    System.out.println("Permanent: " + ban.isPermanent());
    System.out.println("Active: " + ban.isActive());
    System.out.println("Server scope: " + ban.getServerScope());

    if (!ban.isPermanent()) {
        long remaining = ban.getRemainingDuration(System.currentTimeMillis());
        System.out.println("Remaining ms: " + remaining);
    }
}
```

### Listen for Punishment Events

```java
import litebans.api.Events;
import litebans.api.Entry;

// Register in onEnable(), all callbacks fire ASYNC (not on main thread)
Events.get().register(new Events.Listener() {
    @Override
    public void entryAdded(Entry entry) {
        // entry.getType() returns "ban", "mute", "warn", or "kick"
        getLogger().info(entry.getType() + " added for " + entry.getUuid()
            + " reason: " + entry.getReason());
    }

    @Override
    public void entryRemoved(Entry entry) {
        getLogger().info(entry.getType() + " removed for " + entry.getUuid()
            + " removed by: " + entry.getRemovedByName());
    }

    @Override
    public void broadcastSent(String message, String type) {
        // message = the broadcast text, type = broadcast type (nullable)
        // If type is non-null, players need "litebans.notify.<type>" permission to see it
    }
});
```

### Custom Database Queries with PreparedStatement

```java
import litebans.api.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

// Table tokens: {bans}, {mutes}, {warnings}, {kicks}, {history}, {servers}
// These are replaced with actual table names at runtime
public void queryActiveBans() {
    try (PreparedStatement ps = Database.get().prepareStatement(
            "SELECT uuid, reason, banned_by_name FROM {bans} WHERE active = 1 LIMIT 10")) {
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String uuid = rs.getString("uuid");
                String reason = rs.getString("reason");
                String bannedBy = rs.getString("banned_by_name");
                System.out.println(uuid + " banned by " + bannedBy + ": " + reason);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

### Look Up Players by IP

```java
import litebans.api.Database;

import java.util.Collection;
import java.util.UUID;

Collection<UUID> alts = Database.get().getUsersByIP("127.0.0.1");
for (UUID alt : alts) {
    String name = Database.get().getPlayerName(alt);
    System.out.println("Alt account: " + name + " (" + alt + ")");
}
```

## API Reference

### litebans.api.Database (abstract)

Singleton accessed via `Database.get()`. All query methods hit the database -- do NOT call on the main thread.

**Fields:**
- `static String ANY_SERVER_SCOPE` -- pass as `server` param to match all server scopes

**Ban/Mute checks:**
- `boolean isPlayerBanned(UUID uuid, String ip)` -- default server scope
- `boolean isPlayerBanned(UUID uuid, String ip, String server)` -- null=global only, ANY_SERVER_SCOPE=all
- `boolean isPlayerMuted(UUID uuid, String ip)`
- `boolean isPlayerMuted(UUID uuid, String ip, String server)`

**Entry retrieval (returns null if not found):**
- `Entry getBan(UUID uuid, String ip, String server)`
- `Entry getBan(long id, String server)`
- `Entry getMute(UUID uuid, String ip, String server)`
- `Entry getMute(long id, String server)`
- `Entry getWarning(UUID uuid, String ip, String server)`
- `Entry getWarning(long id, String server)`
- `Entry getKick(UUID uuid, String ip, String server)`
- `Entry getKick(long id, String server)`

**Utility:**
- `Collection<UUID> getUsersByIP(String ip)` -- UUIDs that have joined from this IP
- `String getPlayerName(UUID uuid)` -- last known name, null if never joined
- `PreparedStatement prepareStatement(String sql) throws SQLException` -- supports tokens: `{bans}`, `{mutes}`, `{warnings}`, `{kicks}`, `{history}`, `{servers}`

### litebans.api.Entry (abstract)

Represents a ban, mute, warning, or kick record. Uses Lombok `@Getter` on all fields.

**Getter methods (from fields):**
- `long getId()`
- `String getType()` -- "ban", "mute", "warn", or "kick"
- `String getUuid()` -- target player UUID (nullable)
- `String getIp()` -- target IP (nullable)
- `String getReason()` -- punishment reason (nullable)
- `String getExecutorUUID()` -- punisher UUID (nullable, null = console)
- `String getExecutorName()` -- punisher name (nullable)
- `String getRemovedByUUID()` -- who removed it (nullable)
- `String getRemovedByName()` -- who removed it (nullable)
- `String getRemovalReason()` -- reason for removal (nullable)
- `long getDateStart()` -- epoch millis when created
- `long getDateEnd()` -- epoch millis when it expires
- `String getServerScope()` -- server scope (nullable)
- `String getServerOrigin()` -- server where punishment was issued (nullable)
- `boolean isSilent()`
- `boolean isIpban()`
- `boolean isActive()`

**Abstract methods:**
- `long getDuration()` -- millis from start to expiry, -1 if permanent
- `String getDurationString()` -- formatted duration (may contain color codes, do not parse)
- `long getRemainingDuration(long currentTime)` -- millis until expiry, -1 if permanent/expired
- `String getRemainingDurationString(long currentTime)` -- formatted remaining time
- `boolean isPermanent()` -- true if no expiration
- `boolean isExpired(long currentTime)` -- true if expired (expired != inactive)
- `String getRandomID()` -- unique random ID string
- `int getTemplateID()`
- `String getTemplateName()` -- blank string if no template used
- `boolean hasTemplate()`

### litebans.api.Events (abstract)

Singleton accessed via `Events.get()`. All events fire asynchronously. Events are NOT cancellable; they fire after the action is already complete. Wildcard unbans do not fire individual entryRemoved events.

- `void register(Events.Listener listener)`
- `void unregister(Events.Listener listener)`

### litebans.api.Events.Listener

Extend or instantiate anonymously. Override only the methods you need.

- `void entryAdded(Entry entry)` -- fired after a punishment is added to the database
- `void entryRemoved(Entry entry)` -- fired after a punishment is removed from the database
- `void broadcastSent(String message, String type)` -- fired after a broadcast is sent; type is nullable, if non-null requires `litebans.notify.<type>` permission

### litebans.api.RandomID (abstract)

Converts between numeric IDs and random ID strings.

- `static RandomID get()`
- `String convert(long id)` -- numeric ID to random ID string
- `long reveal(String randomId)` -- random ID string to numeric ID
