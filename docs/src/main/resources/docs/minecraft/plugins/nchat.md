# nChat API Reference

Multi-platform chat plugin by nickuc with channels, private messaging, proxy support, and tags. The API lets plugins look up channels, send virtual messages, register custom tags, modify chat events, and spoof sender names. Add `nChat` to `depend` or `softdepend` in plugin.yml.

> All events are **asynchronous** — use `Bukkit.getScheduler().runTask()` if you need to interact with the Bukkit API inside handlers.

## Code Examples

### Getting the API

```java
import com.nickuc.chat.api.NchatAPI;

NchatAPI api = NchatAPI.getAPI();
```

### Look Up Channels

```java
import com.nickuc.chat.api.NchatAPI;
import com.nickuc.chat.api.types.PublicChannel;

NchatAPI api = NchatAPI.getAPI();

PublicChannel channel = api.getChannelByName("global");
PublicChannel byCmd = api.getChannelByCommand("g");
PublicChannel either = api.getChannelByNameAndCommand("global"); // tries both

boolean exists = api.hasChannelByName("global");
```

### Send a Virtual Message (Fake Sender)

```java
import com.nickuc.chat.api.NchatAPI;
import com.nickuc.chat.api.types.PublicChannel;

NchatAPI api = NchatAPI.getAPI();
PublicChannel channel = api.getChannelByName("global");

// Message from a fake sender name
api.handleVirtualMessage("FakePlayer", "Hello from the API!", channel, event -> {
    // VirtualMessageEvent callback — modify before it's sent
});

// Message with no sender name
api.handleVirtualMessage("Hello world!", channel, event -> {});
```

### Register a Custom Tag

```java
import com.nickuc.chat.api.NchatAPI;
import com.nickuc.chat.api.translator.GlobalTag;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

NchatAPI.getAPI().registerTag("level", new GlobalTag() {
    @Override
    public String replaceTag(Player player, String currentValue) {
        return String.valueOf(player.getLevel());
    }

    @Override
    public Plugin getOwner() {
        return myPlugin;
    }
});
// Now {level} can be used in nChat formats
```

### Listen for Chat Events

```java
import com.nickuc.chat.api.events.PublicMessageEvent;
import com.nickuc.chat.api.events.PrivateMessageEvent;
import com.nickuc.chat.api.events.VirtualMessageEvent;
import com.nickuc.chat.api.types.PublicChannel;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChatListener implements Listener {

    @EventHandler
    public void onPublicMessage(PublicMessageEvent event) {
        // Cancellable, async
        Player sender = event.getPlayer();
        PublicChannel channel = event.getChannel();
        String message = event.getMessage();

        // Modify message
        event.setMessage(message.replace("badword", "***"));

        // Modify tags in the format
        event.setTag("prefix", "[Custom]");

        // Spoof the sender name
        event.setSpoofedName("Admin");
    }

    @EventHandler
    public void onPrivateMessage(PrivateMessageEvent event) {
        // Cancellable, async
        Player sender = event.getSender();
        Player target = event.getTarget();
        String message = event.getMessage();
    }

    @EventHandler
    public void onVirtualMessage(VirtualMessageEvent event) {
        // Cancellable, async — triggered by handleVirtualMessage()
        String senderName = event.getSenderName();
        PublicChannel channel = event.getChannel();
    }
}
```

### Proxy Chat Events

```java
import com.nickuc.chat.api.events.ProxyPublicMessageEvent;
import com.nickuc.chat.api.events.ProxyPrivateMessageEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ProxyChatListener implements Listener {

    @EventHandler
    public void onProxyPublic(ProxyPublicMessageEvent event) {
        // Cancellable — message from another server
        String senderName = event.getSender(); // String, not Player
    }

    @EventHandler
    public void onProxyPrivate(ProxyPrivateMessageEvent event) {
        // Cancellable
        String sender = event.getSender();
        String target = event.getTarget();
    }
}
```

## API Reference (Trimmed)

### `com.nickuc.chat.api.NchatAPI`

| Return | Method | Description |
|---|---|---|
| `static NchatAPI` | `getAPI()` | Get API instance |
| `PublicChannel` | `getChannelByName(String)` | Channel by name |
| `PublicChannel` | `getChannelByCommand(String)` | Channel by command |
| `PublicChannel` | `getChannelByNameAndCommand(String)` | Try both |
| `boolean` | `hasChannelByName(String)` | Exists by name |
| `boolean` | `hasChannelByCommand(String)` | Exists by command |
| `void` | `createChannel(Channel)` | Create channel |
| `void` | `handleVirtualMessage(String msg, PublicChannel, Consumer<VirtualMessageEvent>)` | Send virtual message |
| `void` | `handleVirtualMessage(String sender, String msg, PublicChannel, Consumer<VirtualMessageEvent>)` | With sender name |
| `void` | `registerTag(String id, GlobalTag)` | Register custom tag |

### `com.nickuc.chat.api.translator.GlobalTag` (interface)

| Return | Method | Description |
|---|---|---|
| `String` | `replaceTag(Player, String currentValue)` | Return replacement value |
| `Plugin` | `getOwner()` | Owning plugin |

### Events (all async, all cancellable)

| Event | Package | Key Methods |
|---|---|---|
| `PublicMessageEvent` | `com.nickuc.chat.api.events` | `getPlayer()`, `getChannel()`, `getMessage()`, `setMessage()`, `setTag()`, `setSpoofedName()` |
| `PrivateMessageEvent` | `com.nickuc.chat.api.events` | `getSender()`, `getTarget()`, `getMessage()`, `setMessage()`, `setSpoofedName()` |
| `ProxyPublicMessageEvent` | `com.nickuc.chat.api.events` | `getSender()` (String), `getChannel()`, `setSpoofedName()` |
| `ProxyPrivateMessageEvent` | `com.nickuc.chat.api.events` | `getSender()` (String), `getTarget()` (String) |
| `VirtualMessageEvent` | `com.nickuc.chat.api.events` | `getSenderName()`, `getChannel()`, `getMessage()`, `setMessage()` |

All events inherit from `FragmentableMessageEvent`: `getMessage()`, `setMessage()`, `getFormat()`, `setFormat()`, `getTag()`, `setTag()`, `getRecipients()`, `isCancelled()`, `setCancelled()`
