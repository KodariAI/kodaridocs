# InteractiveChat API Reference

Chat enhancement plugin that displays item tooltips, inventory previews, and enderchest contents in chat via keyword placeholders. The API lets plugins create item display components, manage shared inventories, register nickname providers, transform item displays, manage cooldowns, and listen for chat/mention events. Add `InteractiveChat` to `depend` or `softdepend` in plugin.yml.

## Code Examples

### Create an Item Display Component

```java
import com.loohp.interactivechat.api.InteractiveChatAPI;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

Component itemDisplay = InteractiveChatAPI.createItemDisplayComponent(player, itemStack);
// Use this component in chat messages for hover-to-see-item functionality
```

### Send a Message Bypassing InteractiveChat Processing

```java
import com.loohp.interactivechat.api.InteractiveChatAPI;
import org.bukkit.command.CommandSender;

// Send without IC keyword replacement
InteractiveChatAPI.sendMessageUnprocessed(sender, "This message won't trigger [item] placeholders");

// With Adventure Component
import net.kyori.adventure.text.Component;
InteractiveChatAPI.sendMessageUnprocessed(sender, Component.text("Raw message"));
```

### Register a Nickname Provider

```java
import com.loohp.interactivechat.api.InteractiveChatAPI;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.UUID;

// Register: given a UUID, return all known nicknames for that player
InteractiveChatAPI.registerNicknameProvider(myPlugin, uuid -> {
    String nick = getNicknameFromMySystem(uuid);
    return nick != null ? List.of(nick) : List.of();
});

// Unregister
InteractiveChatAPI.unregisterNicknameProvider(myPlugin);

// Query nicknames from all providers
List<String> allNicks = InteractiveChatAPI.getNicknames(playerUUID);
```

### Register an ItemStack Transform Provider

```java
import com.loohp.interactivechat.api.InteractiveChatAPI;
import org.bukkit.inventory.ItemStack;

// Transform items before they're displayed in chat (e.g., hide enchants, add lore)
InteractiveChatAPI.registerItemStackTransformProvider(myPlugin, 10, (item, uuid) -> {
    if (item == null) return item;
    // modify the item before display
    return item;
});

// priority: higher = runs first
// Both ItemStack and UUID parameters CAN be null

InteractiveChatAPI.unregisterItemStackTransformProvider(myPlugin);
```

### Add Inventory to Shared Display

```java
import com.loohp.interactivechat.api.InteractiveChatAPI;
import com.loohp.interactivechat.api.InteractiveChatAPI.SharedType;
import org.bukkit.inventory.Inventory;

// SharedType: ITEM, INVENTORY, INVENTORY1_UPPER, INVENTORY1_LOWER, ENDERCHEST
String hash = InteractiveChatAPI.addInventoryToItemShareList(SharedType.INVENTORY, "custom_key", inventory);
```

### Manage Placeholder Cooldowns

```java
import com.loohp.interactivechat.api.InteractiveChatAPI;
import com.loohp.interactivechat.objectholders.ICPlaceholder;
import org.bukkit.entity.Player;

import java.util.List;

List<ICPlaceholder> placeholders = InteractiveChatAPI.getICPlaceholderList();
for (ICPlaceholder placeholder : placeholders) {
    boolean onCooldown = InteractiveChatAPI.isPlaceholderOnCooldown(player, placeholder);
    long cooldownLeft = InteractiveChatAPI.getPlayerPlaceholderCooldown(player, placeholder);
}

// Universal cooldown (applies to all placeholders)
long universalCd = InteractiveChatAPI.getPlayerUniversalCooldown(player);
```

### Get ICPlayer Data

```java
import com.loohp.interactivechat.api.InteractiveChatAPI;
import com.loohp.interactivechat.objectholders.ICPlayer;
import com.loohp.interactivechat.objectholders.OfflineICPlayer;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.UUID;

// Online players
ICPlayer icPlayer = InteractiveChatAPI.getICPlayer(player);
ICPlayer byUUID = InteractiveChatAPI.getICPlayer(uuid);
ICPlayer byName = InteractiveChatAPI.getICPlayer("Steve");
Collection<ICPlayer> allOnline = InteractiveChatAPI.getOnlineICPlayers();

// Offline player
OfflineICPlayer offline = InteractiveChatAPI.getOfflineICPlayer(uuid);
```

### Listen for Events

```java
import com.loohp.interactivechat.api.events.PlayerMentionPlayerEvent;
import com.loohp.interactivechat.api.events.PreChatPacketSendEvent;
import com.loohp.interactivechat.api.events.ItemPlaceholderEvent;
import com.loohp.interactivechat.api.events.InteractiveChatConfigReloadEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class ICListener implements Listener {

    @EventHandler
    public void onMention(PlayerMentionPlayerEvent event) {
        // Cancellable — player mentioned another player in chat
        Player receiver = event.getReceiver();
        event.setSilent(true); // suppress mention notification
    }

    @EventHandler
    public void onPreChatSend(PreChatPacketSendEvent event) {
        // Cancellable — fires after IC processing, before packet send
        Player receiver = event.getReceiver();
        Component component = event.getComponent();
        Component original = event.getOriginal();

        // Cancel sends original unmodified message if sendOriginalIfCancelled is true
        event.setSendOriginalIfCancelled(true);
        event.setCancelled(true);
    }

    @EventHandler
    public void onItemPlaceholder(ItemPlaceholderEvent event) {
        // NOT cancellable — but you can modify the displayed item
        ItemStack item = event.getItemStack();
        event.setItemStack(modifyForDisplay(item));
    }

    @EventHandler
    public void onReload(InteractiveChatConfigReloadEvent event) {
        // Fired when /ic reload runs
    }
}
```

## API Reference (Trimmed)

### `com.loohp.interactivechat.api.InteractiveChatAPI` (all static)

| Return | Method | Description |
|---|---|---|
| `Component` | `createItemDisplayComponent(Player, ItemStack)` | Create item hover component |
| `void` | `sendMessageUnprocessed(CommandSender, String)` | Send bypassing IC |
| `void` | `sendMessageUnprocessed(CommandSender, Component)` | Send component bypassing IC |
| `String` | `markSender(String, UUID)` | Mark message with sender UUID |
| `List<ICPlaceholder>` | `getICPlaceholderList()` | All registered placeholders |
| `boolean` | `isPlaceholderOnCooldown(Player, ICPlaceholder)` | Cooldown check |
| `void` | `registerNicknameProvider(Plugin, Function<UUID, List<String>>)` | Register nick provider |
| `void` | `unregisterNicknameProvider(Plugin)` | Unregister nick provider |
| `List<String>` | `getNicknames(UUID)` | Get all nicknames |
| `void` | `registerItemStackTransformProvider(Plugin, int priority, BiFunction<ItemStack, UUID, ItemStack>)` | Transform items before display |
| `ICPlayer` | `getICPlayer(Player)` | Get ICPlayer |
| `ICPlayer` | `getICPlayer(UUID)` | Get ICPlayer by UUID |
| `Collection<ICPlayer>` | `getOnlineICPlayers()` | All online ICPlayers |
| `String` | `addInventoryToItemShareList(SharedType, String, Inventory)` | Share inventory for display |

`SharedType` enum: `ITEM`, `INVENTORY`, `INVENTORY1_UPPER`, `INVENTORY1_LOWER`, `ENDERCHEST`

### Events (`com.loohp.interactivechat.api.events`)

| Event | Cancellable | Key Methods |
|---|---|---|
| `PlayerMentionPlayerEvent` | Yes | `getReceiver()`, `getSender()` (UUID), `setSilent(boolean)`, `setTitle/Subtitle/Actionbar/Toast` |
| `PreChatPacketSendEvent` | Yes | `getReceiver()`, `getSender()`, `getComponent()`, `getOriginal()`, `setSendOriginalIfCancelled()` |
| `PrePacketComponentProcessEvent` | No | `getReceiver()`, `getSender()` (UUID), `getComponent()`, `setComponent()` |
| `PostPacketComponentProcessEvent` | No | `getReceiver()`, `getSender()` (UUID), `getComponent()`, `setComponent()` |
| `ItemPlaceholderEvent` | No | `getItemStack()`, `setItemStack()` |
| `InventoryPlaceholderEvent` | No | `getInventory()`, `setInventory()`, `getType()` |
| `ICPlayerJoinEvent` | No | `getPlayer()`, `isRemote()` |
| `ICPlayerQuitEvent` | No | `getPlayer()`, `isRemote()` |
| `InteractiveChatConfigReloadEvent` | No | (none) |
