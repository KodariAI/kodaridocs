# Lunar Client Apollo API

Server-side API for interacting with Lunar Client players. Provides modules for waypoints, titles, notifications, cooldowns, beams, borders, holograms, nametags, teams, limbs, staff mods, server rules, transfer, rich presence, and more. Uses Adventure components for text formatting.

## Getting a Module

All modules are retrieved via `Apollo.getModuleManager().getModule(ModuleClass.class)`.

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.module.waypoint.WaypointModule;
import com.lunarclient.apollo.module.title.TitleModule;
import com.lunarclient.apollo.module.notification.NotificationModule;
import com.lunarclient.apollo.module.cooldown.CooldownModule;
import com.lunarclient.apollo.module.beam.BeamModule;
import com.lunarclient.apollo.module.border.BorderModule;
import com.lunarclient.apollo.module.hologram.HologramModule;
import com.lunarclient.apollo.module.nametag.NametagModule;
import com.lunarclient.apollo.module.team.TeamModule;
import com.lunarclient.apollo.module.limb.LimbModule;
import com.lunarclient.apollo.module.staffmod.StaffModModule;
import com.lunarclient.apollo.module.serverrule.ServerRuleModule;
import com.lunarclient.apollo.module.transfer.TransferModule;
import com.lunarclient.apollo.module.vignette.VignetteModule;
import com.lunarclient.apollo.module.tntcountdown.TntCountdownModule;
import com.lunarclient.apollo.module.stopwatch.StopwatchModule;
import com.lunarclient.apollo.module.chat.ChatModule;
import com.lunarclient.apollo.module.coloredfire.ColoredFireModule;
import com.lunarclient.apollo.module.glow.GlowModule;
import com.lunarclient.apollo.module.entity.EntityModule;
import com.lunarclient.apollo.module.richpresence.RichPresenceModule;
import com.lunarclient.apollo.module.nickhider.NickHiderModule;

// Example: get the waypoint module
WaypointModule waypointModule = Apollo.getModuleManager().getModule(WaypointModule.class);
```

## Player Resolution

Most module methods take `Recipients` as the first argument. Use `Apollo.getPlayerManager()` or `Recipients.ofEveryone()`.

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;

import org.bukkit.entity.Player;
import java.util.Optional;
import java.util.UUID;

// Single player
Optional<ApolloPlayer> apolloPlayer = Apollo.getPlayerManager().getPlayer(player.getUniqueId());

// Check if player uses Lunar Client
boolean isLunar = Apollo.getPlayerManager().hasSupport(player.getUniqueId());

// All Lunar Client players
Recipients everyone = Recipients.ofEveryone();
```

## Bukkit Location Conversion

```java
import com.lunarclient.apollo.BukkitApollo;
import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import com.lunarclient.apollo.common.location.ApolloLocation;
import com.lunarclient.apollo.common.location.ApolloPlayerLocation;
import com.lunarclient.apollo.common.ApolloEntity;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

ApolloBlockLocation blockLoc = BukkitApollo.toApolloBlockLocation(bukkitLocation);
ApolloLocation loc = BukkitApollo.toApolloLocation(bukkitLocation);
ApolloPlayerLocation playerLoc = BukkitApollo.toApolloPlayerLocation(bukkitLocation);
Location back = BukkitApollo.toBukkitLocation(blockLoc);
ApolloEntity entity = BukkitApollo.toApolloEntity(bukkitEntity);
```

## Waypoint Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.module.waypoint.WaypointModule;
import com.lunarclient.apollo.module.waypoint.Waypoint;
import com.lunarclient.apollo.common.location.ApolloBlockLocation;

import org.bukkit.entity.Player;
import java.awt.Color;
import java.util.Optional;

WaypointModule waypointModule = Apollo.getModuleManager().getModule(WaypointModule.class);

// Display a waypoint
public void displayWaypoint(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        waypointModule.displayWaypoint(apolloPlayer, Waypoint.builder()
            .name("KoTH")
            .location(ApolloBlockLocation.builder()
                .world("world")
                .x(500)
                .y(100)
                .z(500)
                .build()
            )
            .color(Color.ORANGE)
            .preventRemoval(false)
            .hidden(false)
            .build()
        );
    });
}

// Remove by name
public void removeWaypoint(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> waypointModule.removeWaypoint(apolloPlayer, "KoTH"));
}

// Reset all waypoints for a player
public void resetWaypoints(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(waypointModule::resetWaypoints);
}
```

## Title Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.module.title.TitleModule;
import com.lunarclient.apollo.module.title.Title;
import com.lunarclient.apollo.module.title.TitleType;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.entity.Player;
import java.time.Duration;
import java.util.Optional;

TitleModule titleModule = Apollo.getModuleManager().getModule(TitleModule.class);

// Display a title
public void displayTitle(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> titleModule.displayTitle(apolloPlayer, Title.builder()
        .type(TitleType.TITLE)
        .message(Component.text()
            .content("Hello, player!")
            .color(NamedTextColor.GREEN)
            .decorate(TextDecoration.BOLD)
            .build())
        .scale(1.0f)
        .displayTime(Duration.ofMillis(1500L))
        .fadeInTime(Duration.ofMillis(250))
        .fadeOutTime(Duration.ofMillis(300))
        .build()));
}

// Interpolated (expanding/shrinking) title
public void displayInterpolatedTitle(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> titleModule.displayTitle(apolloPlayer, Title.builder()
        .type(TitleType.TITLE)
        .message(Component.text()
            .content("This title expands!")
            .color(NamedTextColor.GREEN)
            .decorate(TextDecoration.BOLD)
            .build())
        .scale(0.1f)
        .interpolationScale(1.0f)
        .interpolationRate(0.01f)
        .displayTime(Duration.ofMillis(5000L))
        .fadeInTime(Duration.ofMillis(250))
        .fadeOutTime(Duration.ofMillis(300))
        .build()));
}

// Reset titles
public void resetTitles(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(titleModule::resetTitles);
}

// Clear titles on server switch (option)
titleModule.getOptions().set(TitleModule.CLEAR_TITLE_ON_SERVER_SWITCH, true);
```

## Notification Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.module.notification.NotificationModule;
import com.lunarclient.apollo.module.notification.Notification;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import java.time.Duration;
import java.util.Optional;

NotificationModule notificationModule = Apollo.getModuleManager().getModule(NotificationModule.class);

// Display a notification (upper right of screen)
public void displayNotification(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        notificationModule.displayNotification(apolloPlayer, Notification.builder()
            .titleComponent(Component.text("UHC Announcement", NamedTextColor.GREEN))
            .descriptionComponent(Component.text("UHC starts in 5 minutes...", NamedTextColor.RED)
                .append(Component.newline())
                .append(Component.text("Get ready!", NamedTextColor.WHITE))
            )
            .resourceLocation("icons/golden_apple.png")
            .displayTime(Duration.ofSeconds(5))
            .build());
    });
}

// Reset all notifications
public void resetNotifications(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(notificationModule::resetNotifications);
}
```

## Cooldown Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.module.cooldown.CooldownModule;
import com.lunarclient.apollo.module.cooldown.Cooldown;
import com.lunarclient.apollo.common.icon.ItemStackIcon;
import com.lunarclient.apollo.common.icon.SimpleResourceLocationIcon;

import org.bukkit.entity.Player;
import java.time.Duration;
import java.util.Optional;

CooldownModule cooldownModule = Apollo.getModuleManager().getModule(CooldownModule.class);

// Display cooldown with item icon
public void displayItemCooldown(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        cooldownModule.displayCooldown(apolloPlayer, Cooldown.builder()
            .name("enderpearl-cooldown")
            .duration(Duration.ofSeconds(15))
            .icon(ItemStackIcon.builder()
                .itemName("ENDER_PEARL")
                .build()
            )
            .build()
        );
    });
}

// Display cooldown with resource icon
public void displayResourceCooldown(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        cooldownModule.displayCooldown(apolloPlayer, Cooldown.builder()
            .name("lunar-cooldown")
            .duration(Duration.ofSeconds(15))
            .icon(SimpleResourceLocationIcon.builder()
                .resourceLocation("lunar:logo/logo-200x182.svg")
                .size(12)
                .build()
            )
            .build()
        );
    });
}

// Remove specific cooldown by name
public void removeCooldown(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        cooldownModule.removeCooldown(apolloPlayer, "enderpearl-cooldown");
    });
}

// Reset all cooldowns
public void resetCooldowns(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(cooldownModule::resetCooldowns);
}
```

## Beam Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.module.beam.BeamModule;
import com.lunarclient.apollo.module.beam.Beam;
import com.lunarclient.apollo.common.location.ApolloBlockLocation;

import org.bukkit.entity.Player;
import java.awt.Color;
import java.util.Optional;

BeamModule beamModule = Apollo.getModuleManager().getModule(BeamModule.class);

// Display a beacon beam
public void displayBeam(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        beamModule.displayBeam(apolloPlayer, Beam.builder()
            .id("spawn-beacon")
            .color(Color.CYAN)
            .location(ApolloBlockLocation.builder()
                .world("world")
                .x(0)
                .y(60)
                .z(0)
                .build()
            )
            .build()
        );
    });
}

// Remove beam by id
public void removeBeam(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> beamModule.removeBeam(apolloPlayer, "spawn-beacon"));
}

// Reset all beams
public void resetBeams(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(beamModule::resetBeams);
}
```

## Border Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.module.border.BorderModule;
import com.lunarclient.apollo.module.border.Border;
import com.lunarclient.apollo.common.cuboid.Cuboid2D;

import org.bukkit.entity.Player;
import java.awt.Color;
import java.util.Optional;

BorderModule borderModule = Apollo.getModuleManager().getModule(BorderModule.class);

// Display a world border
public void displayBorder(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        borderModule.displayBorder(apolloPlayer, Border.builder()
            .id("pvp-tagged-spawn")
            .world("world")
            .cancelEntry(true)
            .cancelExit(true)
            .canShrinkOrExpand(false)
            .color(Color.RED)
            .bounds(Cuboid2D.builder()
                .minX(-50)
                .minZ(-50)
                .maxX(50)
                .maxZ(50)
                .build()
            )
            .durationTicks(1000)
            .build()
        );
    });
}

// Remove border by id
public void removeBorder(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> borderModule.removeBorder(apolloPlayer, "pvp-tagged-spawn"));
}

// Reset all borders
public void resetBorders(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(borderModule::resetBorders);
}
```

## Hologram Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.module.hologram.HologramModule;
import com.lunarclient.apollo.module.hologram.Hologram;
import com.lunarclient.apollo.common.location.ApolloLocation;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;

import com.google.common.collect.Lists;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.entity.Player;
import java.util.Optional;

HologramModule hologramModule = Apollo.getModuleManager().getModule(HologramModule.class);

// Display hologram to all players
public void displayHologram() {
    hologramModule.displayHologram(Recipients.ofEveryone(), Hologram.builder()
        .id("welcome-hologram")
        .location(ApolloLocation.builder()
            .world("world")
            .x(5)
            .y(105)
            .z(0)
            .build())
        .lines(Lists.newArrayList(
            Component.text()
                .content("Welcome to my server!")
                .color(NamedTextColor.RED)
                .decorate(TextDecoration.BOLD, TextDecoration.UNDERLINED)
                .build(),
            Component.text()
                .content("Type /help to get started!")
                .build()
        ))
        .showThroughWalls(true)
        .showShadow(false)
        .showBackground(true)
        .build()
    );
}

// Remove hologram by id
public void removeHologram() {
    hologramModule.removeHologram(Recipients.ofEveryone(), "welcome-hologram");
}

// Reset all holograms for a player
public void resetHolograms(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(hologramModule::resetHolograms);
}
```

## Nametag Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.module.nametag.NametagModule;
import com.lunarclient.apollo.module.nametag.Nametag;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;

import com.google.common.collect.Lists;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.entity.Player;
import java.util.Optional;

NametagModule nametagModule = Apollo.getModuleManager().getModule(NametagModule.class);

// Override a player's nametag for everyone (multi-line)
public void overrideNametag(Player target) {
    nametagModule.overrideNametag(Recipients.ofEveryone(), target.getUniqueId(), Nametag.builder()
        .lines(Lists.newArrayList(
            Component.text()
                .content("[StaffMode]")
                .decorate(TextDecoration.ITALIC)
                .color(NamedTextColor.GRAY)
                .build(),
            Component.text()
                .content(target.getName())
                .color(NamedTextColor.RED)
                .build()
        ))
        .build()
    );
}

// Reset a single player's nametag
public void resetNametag(Player target) {
    nametagModule.resetNametag(Recipients.ofEveryone(), target.getUniqueId());
}

// Reset all nametags for a viewer
public void resetNametags(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(nametagModule::resetNametags);
}
```

## Team Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.module.team.TeamModule;
import com.lunarclient.apollo.module.team.TeamMember;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.common.location.ApolloLocation;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import java.awt.Color;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

TeamModule teamModule = Apollo.getModuleManager().getModule(TeamModule.class);

// Create a team member entry
private TeamMember createTeamMember(Player member) {
    Location location = member.getLocation();
    return TeamMember.builder()
        .playerUuid(member.getUniqueId())
        .displayName(Component.text()
            .content(member.getName())
            .color(NamedTextColor.WHITE)
            .build())
        .markerColor(Color.WHITE)
        .location(ApolloLocation.builder()
            .world(location.getWorld().getName())
            .x(location.getX())
            .y(location.getY())
            .z(location.getZ())
            .build())
        .build();
}

// Update team members (call on a repeating task)
public void updateTeam(List<Player> members) {
    List<TeamMember> teammates = members.stream()
        .filter(Player::isOnline)
        .map(this::createTeamMember)
        .collect(Collectors.toList());

    members.forEach(member ->
        Apollo.getPlayerManager().getPlayer(member.getUniqueId())
            .ifPresent(apolloPlayer ->
                teamModule.updateTeamMembers(apolloPlayer, teammates)
            )
    );
}

// Reset team members
public void resetTeam(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(teamModule::resetTeamMembers);
}
```

## Limb Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.module.limb.LimbModule;
import com.lunarclient.apollo.module.limb.ArmorPiece;
import com.lunarclient.apollo.module.limb.BodyPart;

import org.bukkit.entity.Player;
import java.util.EnumSet;
import java.util.Optional;

LimbModule limbModule = Apollo.getModuleManager().getModule(LimbModule.class);

// Hide armor pieces (viewer sees target without helmet and leggings)
// ArmorPiece values: HELMET, CHESTPLATE, LEGGINGS, BOOTS
public void hideArmor(Player viewer, Player target) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        limbModule.hideArmorPieces(apolloPlayer, target.getUniqueId(),
            EnumSet.of(ArmorPiece.HELMET, ArmorPiece.LEGGINGS));
    });
}

// Reset armor pieces
public void resetArmor(Player viewer, Player target) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        limbModule.resetArmorPieces(apolloPlayer, target.getUniqueId(),
            EnumSet.of(ArmorPiece.HELMET, ArmorPiece.LEGGINGS));
    });
}

// Hide body parts
// BodyPart values: HEAD, TORSO, LEFT_ARM, RIGHT_ARM, LEFT_LEG, RIGHT_LEG
public void hideBody(Player viewer, Player target) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        limbModule.hideBodyParts(apolloPlayer, target.getUniqueId(),
            EnumSet.of(BodyPart.HEAD, BodyPart.RIGHT_ARM));
    });
}

// Reset body parts
public void resetBody(Player viewer, Player target) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        limbModule.resetBodyParts(apolloPlayer, target.getUniqueId(),
            EnumSet.of(BodyPart.HEAD, BodyPart.RIGHT_ARM));
    });
}
```

## Staff Mod Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.module.staffmod.StaffModModule;
import com.lunarclient.apollo.module.staffmod.StaffMod;

import org.bukkit.entity.Player;
import java.util.Collections;
import java.util.Optional;

StaffModModule staffModModule = Apollo.getModuleManager().getModule(StaffModModule.class);

// Enable staff mods (e.g. XRAY) for a player
public void enableStaffMods(Player viewer) {
    if (!viewer.hasPermission("apollo.staff")) return;
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer ->
        staffModModule.enableStaffMods(apolloPlayer, Collections.singletonList(StaffMod.XRAY))
    );
}

// Disable staff mods
public void disableStaffMods(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer ->
        staffModModule.disableStaffMods(apolloPlayer, Collections.singletonList(StaffMod.XRAY))
    );
}

// Enable/disable all at once
public void enableAll(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(staffModModule::enableAllStaffMods);
}
public void disableAll(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(staffModModule::disableAllStaffMods);
}
```

## Server Rule Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.module.serverrule.ServerRuleModule;

import org.bukkit.entity.Player;
import java.util.Optional;

ServerRuleModule serverRuleModule = Apollo.getModuleManager().getModule(ServerRuleModule.class);

// Set anti-portal traps globally
serverRuleModule.getOptions().set(ServerRuleModule.ANTI_PORTAL_TRAPS, true);

// Set nametag render distance globally
serverRuleModule.getOptions().set(ServerRuleModule.NAMETAG_RENDER_DISTANCE, 64);

// Set per-player override
public void setOverrideNametagDistance(Player viewer, boolean value) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    apolloPlayerOpt.ifPresent(apolloPlayer -> {
        serverRuleModule.getOptions().set(apolloPlayer,
            ServerRuleModule.OVERRIDE_NAMETAG_RENDER_DISTANCE, value);
    });
}
```

## TNT Countdown Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.module.tntcountdown.TntCountdownModule;
import com.lunarclient.apollo.common.ApolloEntity;
import com.lunarclient.apollo.recipients.Recipients;

import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;

TntCountdownModule tntModule = Apollo.getModuleManager().getModule(TntCountdownModule.class);

// Set default TNT ticks globally
tntModule.getOptions().set(TntCountdownModule.TNT_TICKS, 160);

// Spawn TNT with custom countdown displayed
public void spawnCustomTnt(Player viewer) {
    int customTicks = 200;
    TNTPrimed entity = viewer.getWorld().spawn(viewer.getLocation(), TNTPrimed.class);
    entity.setFuseTicks(customTicks);

    ApolloEntity apolloEntity = new ApolloEntity(entity.getEntityId(), entity.getUniqueId());
    tntModule.setTntCountdown(Recipients.ofEveryone(), apolloEntity, customTicks);
}
```

## Transfer Module

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.module.transfer.TransferModule;
import com.lunarclient.apollo.module.transfer.PingResponse;

import com.google.common.collect.Lists;
import org.bukkit.entity.Player;
import java.util.Optional;

TransferModule transferModule = Apollo.getModuleManager().getModule(TransferModule.class);

// Transfer a player to another server
public void transfer(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    if (!apolloPlayerOpt.isPresent()) {
        viewer.sendMessage("Join with Lunar Client to use this feature!");
        return;
    }
    transferModule.transfer(apolloPlayerOpt.get(), "mc.hypixel.net")
        .onSuccess(response -> {
            switch (response.getStatus()) {
                case ACCEPTED: viewer.sendMessage("Transfer accepted!"); break;
                case REJECTED: viewer.sendMessage("Transfer rejected!"); break;
            }
        })
        .onFailure(exception -> exception.printStackTrace());
}

// Ping servers to check latency
public void ping(Player viewer) {
    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());
    if (!apolloPlayerOpt.isPresent()) return;
    transferModule.ping(apolloPlayerOpt.get(), Lists.newArrayList("mc.hypixel.net", "minehut.com"))
        .onSuccess(response -> {
            for (PingResponse.PingData data : response.getData()) {
                switch (data.getStatus()) {
                    case SUCCESS:
                        viewer.sendMessage(String.format("Ping to %s: %d ms", data.getServerIp(), data.getPingMillis()));
                        break;
                    case TIMED_OUT:
                        viewer.sendMessage(String.format("Failed to ping %s", data.getServerIp()));
                        break;
                }
            }
        })
        .onFailure(Throwable::printStackTrace);
}
```

## Other Modules (Quick Reference)

```java
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.module.stopwatch.StopwatchModule;
import com.lunarclient.apollo.module.chat.ChatModule;
import com.lunarclient.apollo.module.coloredfire.ColoredFireModule;
import com.lunarclient.apollo.module.glow.GlowModule;
import com.lunarclient.apollo.module.entity.EntityModule;
import com.lunarclient.apollo.module.vignette.VignetteModule;
import com.lunarclient.apollo.module.vignette.Vignette;
import com.lunarclient.apollo.module.nickhider.NickHiderModule;
import com.lunarclient.apollo.module.richpresence.RichPresenceModule;
import com.lunarclient.apollo.module.richpresence.ServerRichPresence;
import com.lunarclient.apollo.common.ApolloEntity;

import net.kyori.adventure.text.Component;
import java.awt.Color;
import java.util.Collections;
import java.util.UUID;

// --- Stopwatch ---
StopwatchModule stopwatch = Apollo.getModuleManager().getModule(StopwatchModule.class);
stopwatch.startStopwatch(Recipients.ofEveryone());
stopwatch.stopStopwatch(Recipients.ofEveryone());
stopwatch.resetStopwatch(Recipients.ofEveryone());

// --- Chat (live updating messages) ---
ChatModule chat = Apollo.getModuleManager().getModule(ChatModule.class);
chat.displayLiveChatMessage(Recipients.ofEveryone(), Component.text("Live updating message"), 13);
chat.removeLiveChatMessage(Recipients.ofEveryone(), 13);

// --- Colored Fire ---
ColoredFireModule coloredFire = Apollo.getModuleManager().getModule(ColoredFireModule.class);
coloredFire.overrideColoredFire(Recipients.ofEveryone(), targetUuid, Color.BLUE);
coloredFire.resetColoredFire(Recipients.ofEveryone(), targetUuid);
coloredFire.resetColoredFires(Recipients.ofEveryone());

// --- Glow ---
GlowModule glow = Apollo.getModuleManager().getModule(GlowModule.class);
glow.overrideGlow(Recipients.ofEveryone(), targetUuid, Color.RED);
glow.resetGlow(Recipients.ofEveryone(), targetUuid);
glow.resetGlow(Recipients.ofEveryone());

// --- Entity (rainbow sheep, flipped entities) ---
EntityModule entity = Apollo.getModuleManager().getModule(EntityModule.class);
entity.overrideRainbowSheep(Recipients.ofEveryone(), Collections.singletonList(apolloEntity));
entity.resetRainbowSheep(Recipients.ofEveryone(), Collections.singletonList(apolloEntity));
entity.flipEntity(Recipients.ofEveryone(), Collections.singletonList(apolloEntity));
entity.resetFlippedEntity(Recipients.ofEveryone(), Collections.singletonList(apolloEntity));

// --- Vignette ---
VignetteModule vignette = Apollo.getModuleManager().getModule(VignetteModule.class);
vignette.displayVignette(Recipients.ofEveryone(), Vignette.builder()
    .resourceLocation("textures/misc/pumpkinblur.png")
    .opacity(0.5f)
    .build());
vignette.resetVignette(Recipients.ofEveryone());

// --- Nick Hider ---
NickHiderModule nickHider = Apollo.getModuleManager().getModule(NickHiderModule.class);
nickHider.overrideNick(Recipients.ofEveryone(), "FakeNickname");
nickHider.resetNick(Recipients.ofEveryone());

// --- Rich Presence ---
RichPresenceModule richPresence = Apollo.getModuleManager().getModule(RichPresenceModule.class);
richPresence.overrideServerRichPresence(Recipients.ofEveryone(), ServerRichPresence.builder()
    .gameName("Bedwars")
    .gameVariantName("4v4")
    .gameState("In Game")
    .playerState("Fighting")
    .mapName("Aquarium")
    .subServerName("BW-1")
    .teamCurrentSize(4)
    .teamMaxSize(4)
    .build());
richPresence.resetServerRichPresence(Recipients.ofEveryone());
```

## Apollo Events

```java
import com.lunarclient.apollo.event.EventBus;
import com.lunarclient.apollo.event.Listen;
import com.lunarclient.apollo.event.player.ApolloRegisterPlayerEvent;
import com.lunarclient.apollo.event.player.ApolloUnregisterPlayerEvent;
import com.lunarclient.apollo.event.player.ApolloPlayerHandshakeEvent;
import com.lunarclient.apollo.event.option.ApolloUpdateOptionEvent;

// Register listener
EventBus.getBus().register(this);

// Annotation-based event handling
@Listen
private void onPlayerRegister(ApolloRegisterPlayerEvent event) {
    // Player joined with Lunar Client
    event.getPlayer(); // ApolloPlayer
}

@Listen
private void onPlayerUnregister(ApolloUnregisterPlayerEvent event) {
    // Lunar Client player left
    event.getPlayer(); // ApolloPlayer
}

@Listen
private void onHandshake(ApolloPlayerHandshakeEvent event) {
    event.getPlayer();              // ApolloPlayer
    event.getMinecraftVersion();    // MinecraftVersion enum
    event.getLunarClientVersion();  // LunarClientVersion (getSemVer(), getGitBranch(), getGitCommit())
    event.getInstalledMods();       // List<LunarClientMod>
}

@Listen
private void onOptionUpdate(ApolloUpdateOptionEvent event) {
    event.getPlayer();    // ApolloPlayer
    event.getOption();    // Option
    event.getValue();     // Object
    event.setCancelled(true); // Cancel the option update
}
```

## Icon Types

```java
import com.lunarclient.apollo.common.icon.ItemStackIcon;
import com.lunarclient.apollo.common.icon.SimpleResourceLocationIcon;
import com.lunarclient.apollo.common.icon.AdvancedResourceLocationIcon;
import com.lunarclient.apollo.common.icon.Icon;

// Item-based icon
Icon itemIcon = ItemStackIcon.builder()
    .itemName("ENDER_PEARL")
    .itemId(368)             // optional legacy item ID
    .customModelData(0)      // optional custom model data
    .build();

// Simple resource icon
Icon simpleIcon = SimpleResourceLocationIcon.builder()
    .resourceLocation("lunar:logo/logo-200x182.svg")
    .size(12)
    .build();

// Advanced resource icon (texture atlas region)
Icon advancedIcon = AdvancedResourceLocationIcon.builder()
    .resourceLocation("textures/item/ender_pearl.png")
    .width(16)
    .height(16)
    .minU(0)
    .maxU(1)
    .minV(0)
    .maxV(1)
    .build();
```

## API Reference

### Core (`com.lunarclient.apollo`)
- `Apollo` -- `static ApolloModuleManager getModuleManager()`, `static ApolloPlayerManager getPlayerManager()`, `static ApolloWorldManager getWorldManager()`, `static ApolloPlatform getPlatform()`
- `BukkitApollo` -- `static ApolloBlockLocation toApolloBlockLocation(Location)`, `static ApolloLocation toApolloLocation(Location)`, `static ApolloPlayerLocation toApolloPlayerLocation(Location)`, `static Location toBukkitLocation(ApolloBlockLocation)`, `static Location toBukkitLocation(ApolloLocation)`, `static Location toBukkitLocation(ApolloPlayerLocation)`, `static ApolloEntity toApolloEntity(Entity)`, `static Recipients getRecipientsFrom(Collection)`, `static void runForPlayer(Player, Consumer)`, `static void runForPlayer(UUID, Consumer)`

### Player (`com.lunarclient.apollo.player`)
- `ApolloPlayer` (interface, implements Recipients) -- `UUID getUniqueId()`, `String getName()`, `Object getPlayer()`, `Optional getLocation()`, `Optional getWorld()`, `LunarClientVersion getLunarClientVersion()`, `MinecraftVersion getMinecraftVersion()`, `List getInstalledMods()`, `boolean hasPermission(String)`
- `ApolloPlayerManager` (interface) -- `Optional<ApolloPlayer> getPlayer(UUID)`, `boolean hasSupport(UUID)`, `Collection<ApolloPlayer> getPlayers()`

### Recipients (`com.lunarclient.apollo.recipients`)
- `Recipients` (interface) -- `static ForwardingRecipients ofEveryone()`, `static ForwardingRecipients of(Iterable)`, `void forEach(Consumer)`

### Locations (`com.lunarclient.apollo.common.location`)
- `ApolloBlockLocation` -- builder: `.world(String)`, `.x(int)`, `.y(int)`, `.z(int)`
- `ApolloLocation` -- builder: `.world(String)`, `.x(double)`, `.y(double)`, `.z(double)`
- `ApolloPlayerLocation` -- builder: `.location(ApolloLocation)`, `.yaw(float)`, `.pitch(float)`

### Cuboids (`com.lunarclient.apollo.common.cuboid`)
- `Cuboid2D` -- builder: `.minX(double)`, `.minZ(double)`, `.maxX(double)`, `.maxZ(double)`
- `Cuboid3D` -- builder: `.minX(double)`, `.minY(double)`, `.minZ(double)`, `.maxX(double)`, `.maxY(double)`, `.maxZ(double)`

### Icons (`com.lunarclient.apollo.common.icon`)
- `ItemStackIcon` -- builder: `.itemName(String)`, `.itemId(int)`, `.customModelData(int)`
- `SimpleResourceLocationIcon` -- builder: `.resourceLocation(String)`, `.size(int)`
- `AdvancedResourceLocationIcon` -- builder: `.resourceLocation(String)`, `.width(float)`, `.height(float)`, `.minU(float)`, `.maxU(float)`, `.minV(float)`, `.maxV(float)`

### Module Manager (`com.lunarclient.apollo.module`)
- `ApolloModuleManager` (interface) -- `ApolloModule getModule(Class)`, `Collection getModules()`, `boolean isEnabled(Class)`
- `ApolloModule` (abstract) -- `String getId()`, `String getName()`, `boolean isEnabled()`, `Options getOptions()`, `void enable()`, `void disable()`

### Waypoint (`com.lunarclient.apollo.module.waypoint`)
- `WaypointModule` -- `void displayWaypoint(Recipients, Waypoint)`, `void removeWaypoint(Recipients, String)`, `void removeWaypoint(Recipients, Waypoint)`, `void resetWaypoints(Recipients)`
- `Waypoint` -- builder: `.name(String)`, `.location(ApolloBlockLocation)`, `.color(java.awt.Color)`, `.preventRemoval(boolean)`, `.hidden(boolean)`

### Title (`com.lunarclient.apollo.module.title`)
- `TitleModule` -- `void displayTitle(Recipients, Title)`, `void resetTitles(Recipients)` | Option: `CLEAR_TITLE_ON_SERVER_SWITCH`
- `Title` -- builder: `.type(TitleType)`, `.message(Component)`, `.scale(float)`, `.displayTime(Duration)`, `.fadeInTime(Duration)`, `.fadeOutTime(Duration)`, `.interpolationScale(float)`, `.interpolationRate(float)`
- `TitleType` (enum) -- `TITLE`, `SUBTITLE`

### Notification (`com.lunarclient.apollo.module.notification`)
- `NotificationModule` -- `void displayNotification(Recipients, Notification)`, `void resetNotifications(Recipients)`
- `Notification` -- builder: `.titleComponent(Component)`, `.descriptionComponent(Component)`, `.title(String)`, `.description(String)`, `.resourceLocation(String)`, `.displayTime(Duration)`

### Cooldown (`com.lunarclient.apollo.module.cooldown`)
- `CooldownModule` -- `void displayCooldown(Recipients, Cooldown)`, `void removeCooldown(Recipients, String)`, `void removeCooldown(Recipients, Cooldown)`, `void resetCooldowns(Recipients)`
- `Cooldown` -- builder: `.name(String)`, `.duration(Duration)`, `.icon(Icon)`

### Beam (`com.lunarclient.apollo.module.beam`)
- `BeamModule` -- `void displayBeam(Recipients, Beam)`, `void removeBeam(Recipients, String)`, `void removeBeam(Recipients, Beam)`, `void resetBeams(Recipients)`
- `Beam` -- builder: `.id(String)`, `.color(java.awt.Color)`, `.location(ApolloBlockLocation)`

### Border (`com.lunarclient.apollo.module.border`)
- `BorderModule` -- `void displayBorder(Recipients, Border)`, `void removeBorder(Recipients, String)`, `void removeBorder(Recipients, Border)`, `void resetBorders(Recipients)`
- `Border` -- builder: `.id(String)`, `.world(String)`, `.cancelEntry(boolean)`, `.cancelExit(boolean)`, `.canShrinkOrExpand(boolean)`, `.color(java.awt.Color)`, `.bounds(Cuboid2D)`, `.durationTicks(int)`

### Hologram (`com.lunarclient.apollo.module.hologram`)
- `HologramModule` -- `void displayHologram(Recipients, Hologram)`, `void removeHologram(Recipients, String)`, `void removeHologram(Recipients, Hologram)`, `void resetHolograms(Recipients)`
- `Hologram` -- builder: `.id(String)`, `.location(ApolloLocation)`, `.lines(List<Component>)`, `.showThroughWalls(boolean)`, `.showShadow(boolean)`, `.showBackground(boolean)`

### Nametag (`com.lunarclient.apollo.module.nametag`)
- `NametagModule` -- `void overrideNametag(Recipients, UUID, Nametag)`, `void resetNametag(Recipients, UUID)`, `void resetNametags(Recipients)`
- `Nametag` -- builder: `.lines(List<Component>)`

### Team (`com.lunarclient.apollo.module.team`)
- `TeamModule` -- `void updateTeamMembers(Recipients, List<TeamMember>)`, `void resetTeamMembers(Recipients)`
- `TeamMember` -- builder: `.playerUuid(UUID)`, `.displayName(Component)`, `.markerColor(java.awt.Color)`, `.location(ApolloLocation)`

### Limb (`com.lunarclient.apollo.module.limb`)
- `LimbModule` -- `void hideArmorPieces(Recipients, UUID, Collection<ArmorPiece>)`, `void resetArmorPieces(Recipients, UUID, Collection<ArmorPiece>)`, `void hideBodyParts(Recipients, UUID, Collection<BodyPart>)`, `void resetBodyParts(Recipients, UUID, Collection<BodyPart>)`
- `ArmorPiece` (enum) -- `HELMET`, `CHESTPLATE`, `LEGGINGS`, `BOOTS`
- `BodyPart` (enum) -- `HEAD`, `TORSO`, `LEFT_ARM`, `RIGHT_ARM`, `LEFT_LEG`, `RIGHT_LEG`

### Staff Mod (`com.lunarclient.apollo.module.staffmod`)
- `StaffModModule` -- `void enableStaffMods(Recipients, List<StaffMod>)`, `void disableStaffMods(Recipients, List<StaffMod>)`, `void enableAllStaffMods(Recipients)`, `void disableAllStaffMods(Recipients)`
- `StaffMod` (enum) -- `XRAY`

### Server Rule (`com.lunarclient.apollo.module.serverrule`)
- `ServerRuleModule` -- options via `getOptions().set(option, value)` | Options: `ANTI_PORTAL_TRAPS`, `OVERRIDE_NAMETAG_RENDER_DISTANCE`, `NAMETAG_RENDER_DISTANCE`

### TNT Countdown (`com.lunarclient.apollo.module.tntcountdown`)
- `TntCountdownModule` -- `void setTntCountdown(Recipients, ApolloEntity, int)`, `void setTntCountdown(ApolloEntity, int)` | Options: `TNT_TICKS`, `OVERRIDE_CUSTOM_TICKS`

### Transfer (`com.lunarclient.apollo.module.transfer`)
- `TransferModule` -- `Future transfer(ApolloPlayer, String)`, `Future transfer(ApolloPlayer, TransferRequest)`, `Future ping(ApolloPlayer, List<String>)`, `Future ping(ApolloPlayer, PingRequest)`
- `TransferResponse.Status` (enum) -- `ACCEPTED`, `REJECTED`
- `PingResponse.PingData.Status` (enum) -- `SUCCESS`, `TIMED_OUT`

### Stopwatch (`com.lunarclient.apollo.module.stopwatch`)
- `StopwatchModule` -- `void startStopwatch(Recipients)`, `void stopStopwatch(Recipients)`, `void resetStopwatch(Recipients)`

### Chat (`com.lunarclient.apollo.module.chat`)
- `ChatModule` -- `void displayLiveChatMessage(Recipients, Component, int)`, `void removeLiveChatMessage(Recipients, int)`

### Colored Fire (`com.lunarclient.apollo.module.coloredfire`)
- `ColoredFireModule` -- `void overrideColoredFire(Recipients, UUID, java.awt.Color)`, `void resetColoredFire(Recipients, UUID)`, `void resetColoredFires(Recipients)`

### Glow (`com.lunarclient.apollo.module.glow`)
- `GlowModule` -- `void overrideGlow(Recipients, UUID, java.awt.Color)`, `void resetGlow(Recipients, UUID)`, `void resetGlow(Recipients)`

### Entity (`com.lunarclient.apollo.module.entity`)
- `EntityModule` -- `void overrideRainbowSheep(Recipients, List)`, `void resetRainbowSheep(Recipients, List)`, `void flipEntity(Recipients, List)`, `void resetFlippedEntity(Recipients, List)`

### Vignette (`com.lunarclient.apollo.module.vignette`)
- `VignetteModule` -- `void displayVignette(Recipients, Vignette)`, `void resetVignette(Recipients)`
- `Vignette` -- builder: `.resourceLocation(String)`, `.opacity(float)`

### Nick Hider (`com.lunarclient.apollo.module.nickhider`)
- `NickHiderModule` -- `void overrideNick(Recipients, String)`, `void resetNick(Recipients)`

### Rich Presence (`com.lunarclient.apollo.module.richpresence`)
- `RichPresenceModule` -- `void overrideServerRichPresence(Recipients, ServerRichPresence)`, `void resetServerRichPresence(Recipients)`
- `ServerRichPresence` -- builder: `.gameName(String)`, `.gameVariantName(String)`, `.gameState(String)`, `.playerState(String)`, `.mapName(String)`, `.subServerName(String)`, `.teamCurrentSize(int)`, `.teamMaxSize(int)`

### Tebex (`com.lunarclient.apollo.module.tebex`)
- `TebexModule` -- `void displayTebexEmbeddedCheckout(Recipients, String)`, `void displayTebexEmbeddedCheckout(Recipients, String, String)`

### Events (`com.lunarclient.apollo.event`)
- `EventBus` -- `static EventBus getBus()`, `void register(Object)`, `void unregister(Object)`
- `ApolloRegisterPlayerEvent` -- `ApolloPlayer getPlayer()`
- `ApolloUnregisterPlayerEvent` -- `ApolloPlayer getPlayer()`
- `ApolloPlayerHandshakeEvent` -- `ApolloPlayer getPlayer()`, `MinecraftVersion getMinecraftVersion()`, `LunarClientVersion getLunarClientVersion()`, `List<LunarClientMod> getInstalledMods()`
- `ApolloUpdateOptionEvent` (cancellable) -- `ApolloPlayer getPlayer()`, `Option getOption()`, `Object getValue()`, `void setCancelled(boolean)`
- `ApolloPlayerAttackEvent` -- `PlayerInfo getAttackerInfo()`, `PlayerInfo getTargetInfo()`, `double getDistance()`
- `ApolloPlayerChatOpenEvent` / `ApolloPlayerChatCloseEvent` -- `PlayerInfo getPlayerInfo()`
- `ApolloPlayerUseItemEvent` -- `PlayerInfo getPlayerInfo()`, `boolean isMainHand()`

### Options (`com.lunarclient.apollo.option`)
- `Options` (interface) -- `void set(Option, Object)`, `void set(ApolloPlayer, Option, Object)`, `Object get(Option)`, `Object get(ApolloPlayer, Option)`, `void add(Option, Object)`, `void remove(Option, Object)`

### World (`com.lunarclient.apollo.world`)
- `ApolloWorldManager` (interface) -- `Optional<ApolloWorld> getWorld(String)`, `Collection<ApolloWorld> getWorlds()`
- `ApolloWorld` (interface, implements Recipients) -- `String getName()`, `Collection<ApolloPlayer> getPlayers()`
