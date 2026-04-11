# LegendChat API Reference

Channel-based chat plugin with private messaging, spy mode, BungeeCord support, and tag formatting. The API lets plugins manage channels, focus players, send messages, handle private messages, manage spy mode, and listen for chat events. Add `Legendchat` to `depend` or `softdepend` in plugin.yml.

## Code Examples

### Getting the API

```java
import br.com.devpaulo.legendchat.api.Legendchat;
import br.com.devpaulo.legendchat.channels.ChannelManager;
import br.com.devpaulo.legendchat.players.PlayerManager;

// All methods are static
ChannelManager channelManager = Legendchat.getChannelManager();
PlayerManager playerManager = Legendchat.getPlayerManager();
```

### Channel Operations

```java
import br.com.devpaulo.legendchat.api.Legendchat;
import br.com.devpaulo.legendchat.channels.ChannelManager;
import br.com.devpaulo.legendchat.channels.types.Channel;
import org.bukkit.entity.Player;

import java.util.List;

ChannelManager cm = Legendchat.getChannelManager();

// Look up channels
Channel global = cm.getChannelByName("global");
Channel byNick = cm.getChannelByNickname("g");
Channel either = cm.getChannelByNameOrNickname("global");
boolean exists = cm.existsChannel("global");

// List all channels
List<Channel> channels = cm.getChannels();

// Default channel
Channel defaultChannel = Legendchat.getDefaultChannel();

// Send a message to a channel
global.sendMessage(player, "Hello everyone!");

// Channel properties
String name = global.getName();
String nickname = global.getNickname();
double maxDist = global.getMaxDistance(); // -1 = unlimited
boolean crossworlds = global.isCrossworlds();
```

### Player Channel Management

```java
import br.com.devpaulo.legendchat.api.Legendchat;
import br.com.devpaulo.legendchat.channels.types.Channel;
import br.com.devpaulo.legendchat.players.PlayerManager;
import org.bukkit.entity.Player;

PlayerManager pm = Legendchat.getPlayerManager();

// Get/set focused channel
Channel focused = pm.getPlayerFocusedChannel(player);
pm.setPlayerFocusedChannel(player, channel, true); // true = send message

// Check visibility
boolean canSee = pm.canPlayerSeeChannel(player, channel);

// Spy mode
pm.addSpy(player);
pm.removeSpy(player);
boolean isSpy = pm.isSpy(player);

// Hide from recipients
pm.hidePlayerFromRecipients(player);
pm.showPlayerToRecipients(player);
```

### Private Messages

```java
import br.com.devpaulo.legendchat.api.Legendchat;
import br.com.devpaulo.legendchat.privatemessages.PrivateMessageManager;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

PrivateMessageManager pmm = Legendchat.getPrivateMessageManager();

// Send private message
pmm.tellPlayer(sender, target, "Hello!");

// Reply to last message
pmm.replyPlayer(sender, "Reply text");

// Lock tell (persistent private chat)
pmm.lockPlayerTell(sender, target);
pmm.unlockPlayerTell(sender);
boolean locked = pmm.isPlayerTellLocked(sender);
```

### Listen for Chat Events

```java
import br.com.devpaulo.legendchat.api.events.ChatMessageEvent;
import br.com.devpaulo.legendchat.api.events.PrivateMessageEvent;
import br.com.devpaulo.legendchat.channels.types.Channel;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Set;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(ChatMessageEvent event) {
        // Cancellable
        Player sender = event.getSender();
        Channel channel = event.getChannel();
        String message = event.getMessage();

        // Modify message
        event.setMessage(message.toUpperCase());

        // Modify format
        event.setFormat(event.getFormat());

        // Work with tags ({tagname} placeholders in format)
        event.setTagValue("prefix", "[VIP]");
        String prefixValue = event.getTagValue("prefix");

        // Modify recipients
        Set<Player> recipients = event.getRecipients();
        recipients.remove(somePlayer);
    }

    @EventHandler
    public void onPrivateMessage(PrivateMessageEvent event) {
        // Cancellable
        org.bukkit.command.CommandSender sender = event.getSender();
        org.bukkit.command.CommandSender receiver = event.getReceiver();
        String message = event.getMessage();

        event.setMessage("Filtered: " + message);
    }
}
```

## API Reference (Trimmed)

### `br.com.devpaulo.legendchat.api.Legendchat` (all static)

| Return | Method | Description |
|---|---|---|
| `ChannelManager` | `getChannelManager()` | Channel operations |
| `PlayerManager` | `getPlayerManager()` | Player channel state |
| `PrivateMessageManager` | `getPrivateMessageManager()` | Private messaging |
| `MuteManager` | `getMuteManager()` | Mute management |
| `IgnoreManager` | `getIgnoreManager()` | Ignore list |
| `CensorManager` | `getCensorManager()` | Chat censoring |
| `Channel` | `getDefaultChannel()` | Default channel |

### `br.com.devpaulo.legendchat.channels.ChannelManager`

| Return | Method | Description |
|---|---|---|
| `Channel` | `getChannelByName(String)` | By name |
| `Channel` | `getChannelByNickname(String)` | By nickname |
| `Channel` | `getChannelByNameOrNickname(String)` | Try both |
| `boolean` | `existsChannel(String)` | Exists |
| `List<Channel>` | `getChannels()` | All channels |
| `void` | `createChannel(Channel)` | Create |
| `void` | `deleteChannel(Channel)` | Delete |

### `br.com.devpaulo.legendchat.channels.types.Channel`

| Return | Method | Description |
|---|---|---|
| `String` | `getName()` | Channel name |
| `String` | `getNickname()` | Short alias |
| `String` | `getFormat()` | Chat format |
| `double` | `getMaxDistance()` | Range (-1 = global) |
| `boolean` | `isCrossworlds()` | Cross-world |
| `void` | `sendMessage(Player, String)` | Send message |
| `List<Player>` | `getPlayersWhoCanSeeChannel()` | Viewers |

### Events (`br.com.devpaulo.legendchat.api.events`)

| Event | Cancellable | Key Methods |
|---|---|---|
| `ChatMessageEvent` | Yes | `getSender()`, `getChannel()`, `getMessage()`, `setMessage()`, `getFormat()`, `setFormat()`, `getTagValue()`, `setTagValue()`, `getRecipients()` |
| `PrivateMessageEvent` | Yes | `getSender()`, `getReceiver()`, `getMessage()`, `setMessage()` |
| `BungeecordChatMessageEvent` | Yes | `getChannel()`, `getMessage()`, `setMessage()`, `getFormat()`, `setFormat()`, `getTagValue()`, `setTagValue()`, `getRecipients()` |
