# Spicord API Reference

Spicord is a Discord bot integration plugin for Bukkit/Spigot, BungeeCord, Velocity, and Sponge. It wraps JDA (Java Discord API) and exposes an addon system so your plugin can interact with one or more configured Discord bots.

## Class Hierarchy

```
Spicord (singleton entry point)
  |
  +-- AddonManager           registers/unregisters addons
  +-- SpicordConfiguration   holds bot list from config
  +-- ServiceManager
  +-- EventHandler<T>        internal event bus
  |
  +-- DiscordBot             live bot instance (wraps JDA)
        |
        +-- JDA              raw JDA handle (full Discord API)
        +-- Presence         bot online status / activity
        +-- BotStatus        READY, OFFLINE, STARTING, STOPPING
        +-- SlashCommand     slash command builder
        +-- DiscordBotCommand  legacy prefix command context

SimpleAddon (extend this to build addons)
```

**Key rule:** Never instantiate `Spicord` or `DiscordBot` yourself. Always access them through `Spicord.getInstance()`.

**Key rule:** Register your addon early (e.g. in `onEnable()`). If Spicord is already loaded the addon is "late-loaded" onto live bots automatically.

**Key rule:** Only interact with a bot inside `onReady(DiscordBot bot)` or after you have confirmed `bot.isReady()`.

Spicord bundles JDA internally — do NOT shade it. Add `Spicord` to `depend` or `softdepend` in plugin.yml.

```yaml
# plugin.yml
softdepend: [Spicord]
```

## `org.spicord.Spicord`

Singleton. Bootstrapped by Spicord itself; never constructed by you.

```java
// Static access
Spicord instance    = Spicord.getInstance();   // null if not loaded
boolean loaded      = Spicord.isLoaded();
String  version     = Spicord.getVersion();

// Instance methods
AddonManager  addonManager  = spicord.getAddonManager();
SpicordConfiguration config = spicord.getConfig();
Logger logger               = spicord.getLogger();

DiscordBot bot = spicord.getBotByName("MyBot"); // null if not found

// Event bus (usually not needed by addon authors)
spicord.addEventListener(SpicordEvent.SPICORD_LOADED, s -> { /* ... */ });
```

## `org.spicord.addon.AddonManager`

Manages all registered addons. Obtained via `Spicord.getInstance().getAddonManager()`.

```java
boolean registered = addonManager.isRegistered("my.addon.id");
boolean registered = addonManager.isRegistered(myAddon);

// Register — call this in your plugin's onEnable()
boolean ok = addonManager.registerAddon(myAddon);

// Register with plugin file/folder/logger inherited from your plugin
boolean ok = addonManager.registerAddon(myAddon, pluginInterface);

// Unregister
boolean ok = addonManager.unregisterAddon(myAddon);
boolean ok = addonManager.unregisterAddon("my.addon.id");

SimpleAddon addon = addonManager.getAddonById("my.addon.id");
Set<SimpleAddon> all = addonManager.getAddons();
Set<SimpleAddon> forBot = addonManager.getAddons(discordBot);
```

## `org.spicord.api.addon.SimpleAddon` + `@Addon`

The base class for all addons. Extend it and annotate with `@Addon`.

### `@org.spicord.api.addon.Addon` annotation

```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Addon {
    String id();           // unique reverse-domain id, e.g. "myplugin.discord"
    String name();
    String[] authors();
    String version();
    ServerSoftware[] supportedServers() default { ServerSoftware.ALL };

    enum ServerSoftware { ALL, SPIGOT, SPONGE, BUNGEECORD, VELOCITY }
}
```

### Lifecycle callbacks (override as needed)

| Method | When called |
|---|---|
| `onRegister(Spicord spicord)` | Addon is registered with AddonManager |
| `onLoad(DiscordBot bot)` | A bot that lists this addon starts loading |
| `onReady(DiscordBot bot)` | That bot is fully connected and ready |
| `onMessageReceived(DiscordBot bot, MessageReceivedEvent event)` | Bot receives any Discord message |
| `onShutdown(DiscordBot bot)` | Bot is shutting down; stop interacting with JDA |
| `onUnload(DiscordBot bot)` | Bot unloads this addon |
| `onDisable()` | Spicord/server is disabling; release resources |
| `onUnregister(Spicord spicord)` | Addon removed from AddonManager |

### Utility accessors available inside SimpleAddon

```java
Spicord getSpicord()
String  getName()
String  getId()
String  getAuthor()
String  getVersion()
File    getFile()        // jar file this addon loaded from (may be null)
File    getDataFolder()  // data directory for config files (may be null)
Logger  getLogger()

// Override to declare required JDA gateway intents
Collection<GatewayIntent> getRequiredIntents()  // default: empty
```

### Minimal addon example

```java
import org.spicord.api.addon.Addon;
import org.spicord.api.addon.SimpleAddon;
import org.spicord.bot.DiscordBot;
import net.dv8tion.jda.api.JDA;

@Addon(id = "myplugin.discord", name = "MyPlugin Discord", authors = {"YourName"}, version = "1.0")
public class MyDiscordAddon extends SimpleAddon {

    private DiscordBot bot;

    @Override
    public void onReady(DiscordBot bot) {
        this.bot = bot;
        // Safe to use bot.getJda() here
        bot.getJda().getGuilds().forEach(g -> getLogger().info("Guild: " + g.getName()));
    }

    @Override
    public void onShutdown(DiscordBot bot) {
        this.bot = null;
    }
}
```

### Register from your Bukkit plugin

```java
@Override
public void onEnable() {
    if (!Spicord.isLoaded()) return;

    Spicord.getInstance()
           .getAddonManager()
           .registerAddon(new MyDiscordAddon(), this); // 'this' implements PluginInterface
}
```

> `PluginInterface` requires `getFile()`, `getDataFolder()`, `getLogger()`. Bukkit's `JavaPlugin` already has these — you just need to implement the interface on your plugin class:

```java
public class MyPlugin extends JavaPlugin implements PluginInterface { }
```

## `org.spicord.bot.DiscordBot`

Obtained from `onReady(DiscordBot bot)` or `Spicord.getInstance().getBotByName("name")`.

### State / inspection

```java
JDA        jda    = bot.getJda();          // raw JDA — use for anything not in Spicord API
BotStatus  status = bot.getStatus();       // READY | OFFLINE | STARTING | STOPPING
boolean    ready  = bot.isReady();
boolean    enabled = bot.isEnabled();
String     name   = bot.getName();
long       botId  = bot.getBotId();

// Check if a Discord user is the bot owner / team member
boolean privileged = bot.isPrivilegedUser(user);
```

`BotStatus` enum values: `READY`, `OFFLINE`, `STARTING`, `STOPPING`, `UNKNOWN`.

### Presence (bot status / activity)

```java
DiscordBot.Presence p = bot.getPresence();
p.setPlaying("Minecraft");
p.setListening("your commands");
p.setWatching("the server");
p.setStreaming("live");
p.setCompeting("tournaments");
p.setCustom("some custom status");

p.setOnline();
p.setIdle();
p.setDoNotDisturb();
p.setInvisible();
```

### Register JDA listeners

```java
// Add any JDA ListenerAdapter directly
bot.addEventListener(new ListenerAdapter() {
    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) { /* ... */ }
});
```

### Send messages to a channel

Use the raw JDA `TextChannel`/`GuildMessageChannel`:

```java
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

TextChannel channel = bot.getJda().getTextChannelById("CHANNEL_ID");
if (channel != null) {
    channel.sendMessage("Hello from Minecraft!").queue();
}
```

### Send embeds

Use `org.spicord.embed.Embed` or raw JDA `EmbedBuilder`:

```java
import org.spicord.embed.Embed;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

// Spicord Embed helper
Embed embed = Embed.fromString("Player joined the server!");
embed.sendToChannel(channel);

// Or async
embed.sendToChannelAsync(/* Supplier<GuildMessageChannel> */);

// Raw JDA EmbedBuilder (full control)
import net.dv8tion.jda.api.EmbedBuilder;
import java.awt.Color;

MessageEmbed jdaEmbed = new EmbedBuilder()
    .setTitle("Server Alert")
    .setDescription("A player just joined!")
    .setColor(Color.GREEN)
    .addField("Player", player.getName(), true)
    .build();

channel.sendMessageEmbeds(jdaEmbed).queue();
```

## Slash Commands

Build and register slash commands inside `onReady()`.

### `org.spicord.bot.command.SlashCommand`

```java
SlashCommand cmd = bot.commandBuilder("ping", "Check bot latency")
    .addOption(OptionType.STRING, "message", "Optional message", false)
    .setExecutor(event -> {
        event.reply("Pong!").setEphemeral(true).queue();
    })
    .setCompleter(event -> {
        // Handle tab-complete suggestions for autocomplete options
        event.replyChoiceStrings("option1", "option2").queue();
    });

// Register globally (takes up to 1 hour to propagate)
bot.registerCommand(cmd);

// Register to a specific guild (instant)
Guild guild = bot.getJda().getGuildById("GUILD_ID");
bot.registerCommand(cmd, guild);
```

### Subcommands

```java
SlashCommand sub1 = bot.commandBuilder("start", "Start something")
    .setExecutor(event -> event.reply("Starting...").queue());

SlashCommand sub2 = bot.commandBuilder("stop", "Stop something")
    .setExecutor(event -> event.reply("Stopping...").queue());

SlashCommand parent = bot.commandBuilder("server", "Server controls")
    .addSubcommand(sub1)
    .addSubcommand(sub2);

bot.registerCommand(parent, guild);
```

### `SlashCommandExecutor` interface

```java
package org.spicord.bot.command;

public interface SlashCommandExecutor {
    void handle(SlashCommandInteractionEvent event);
}
```

### `SlashCommandCompleter` interface

```java
package org.spicord.bot.command;

public interface SlashCommandCompleter {
    void handle(CommandAutoCompleteInteractionEvent event);
}
```

### `SlashCommandOption` constructor

```java
new SlashCommandOption(OptionType type, String name, String description,
                       boolean required, boolean autoComplete)
```

## Legacy Prefix Commands (deprecated)

The old `!command`-style system is deprecated in favor of slash commands. Shown here for reference only.

```java
// In onReady():
bot.onCommand("hello", cmd -> {
    cmd.reply("Hello, " + cmd.getAuthorAsMention() + "!");
});
```

`DiscordBotCommand` fields available in the handler:

```java
String   getName()          // command name without prefix
String[] getArguments()     // arguments split by space
Message  getMessage()       // raw JDA Message
User     getAuthor()        // Discord User who sent it
Member   getSender()        // Guild Member (has roles, nick, etc.)
Guild    getGuild()
GuildMessageChannel getChannel()
String   getPrefix()        // the prefix that was used

// Reply helpers
cmd.reply(String message)          // wraps in embed
cmd.reply(String message, false)   // plain text
cmd.reply(Embed embed)
cmd.reply(MessageEmbed embed)      // raw JDA embed
```

## Events (`org.spicord.event`)

Only one global event exists:

```java
public final class SpicordEvent<T> {
    public static final SpicordEvent<Spicord> SPICORD_LOADED;
}

public interface EventHandler<T> {
    void handle(T object);
}
```

Usage:

```java
Spicord.getInstance().addEventListener(SpicordEvent.SPICORD_LOADED, spicord -> {
    // Spicord finished loading all bots
});
```

## Full Working Example

```java
import org.bukkit.plugin.java.JavaPlugin;
import org.spicord.Spicord;
import org.spicord.api.addon.Addon;
import org.spicord.api.addon.SimpleAddon;
import org.spicord.bot.DiscordBot;
import org.spicord.plugin.PluginInterface;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.interactions.commands.OptionType;

import java.awt.Color;
import java.io.File;
import java.util.logging.Logger;

public class MyPlugin extends JavaPlugin implements PluginInterface {

    @Override
    public void onEnable() {
        if (!Spicord.isLoaded()) {
            getLogger().warning("Spicord not found, Discord integration disabled.");
            return;
        }
        Spicord.getInstance().getAddonManager().registerAddon(new MyAddon(), this);
    }

    // PluginInterface — JavaPlugin already has getDataFolder() and getLogger(),
    // only getFile() needs delegating
    @Override
    public File getFile() { return super.getFile(); }

    @Addon(id = "myplugin.main", name = "MyPlugin", authors = {"Dev"}, version = "1.0")
    public static class MyAddon extends SimpleAddon {

        private DiscordBot bot;
        private TextChannel announceChannel;

        @Override
        public void onReady(DiscordBot bot) {
            this.bot = bot;

            // Grab a channel for outgoing announcements
            announceChannel = bot.getJda().getTextChannelById("YOUR_CHANNEL_ID");

            // Register a slash command on a specific guild
            bot.registerCommand(
                bot.commandBuilder("status", "Get server status")
                   .addOption(OptionType.STRING, "info", "What to check", false)
                   .setExecutor(event -> {
                       event.reply("Server is online!").setEphemeral(true).queue();
                   }),
                bot.getJda().getGuildById("YOUR_GUILD_ID")
            );

            bot.getPresence().setPlaying("Minecraft " + getSpicord().getPlugin().getDescription().getVersion());
        }

        @Override
        public void onShutdown(DiscordBot bot) {
            this.bot = null;
            this.announceChannel = null;
        }

        /** Call from your plugin when something happens in Minecraft */
        public void announce(String playerName, String action) {
            if (announceChannel == null) return;
            announceChannel.sendMessageEmbeds(
                new EmbedBuilder()
                    .setDescription(playerName + " " + action)
                    .setColor(Color.CYAN)
                    .build()
            ).queue();
        }
    }
}
```

## Configuration (spicord/config.yml)

Bots are declared in Spicord's own config. Your plugin only needs to list the addon id under the bot entry:

```yaml
bots:
  - name: "MyBot"
    token: "BOT_TOKEN_HERE"
    enabled: true
    addons:
      - "myplugin.main"   # matches @Addon(id = "myplugin.main")
    command-support: false
    initial-command-cleanup: false
```

Your plugin does **not** manage the bot token or startup — Spicord does. You only register the addon and react to lifecycle callbacks.
