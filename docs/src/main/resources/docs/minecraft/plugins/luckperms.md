# LuckPerms API Reference

LuckPerms is a permissions plugin for Minecraft servers. The API entry point is `LuckPermsProvider.get()` which returns a `LuckPerms` instance. From there:
- `getUserManager()` / `getGroupManager()` / `getTrackManager()` to load and manage users, groups, tracks
- `User` / `Group` extend `PermissionHolder`, which holds `Node` objects representing permissions, inheritances, prefixes, suffixes, meta
- `Node.builder("key")` creates permission nodes; specialized builders exist: `InheritanceNode`, `PrefixNode`, `SuffixNode`, `MetaNode`, `WeightNode`
- `CachedDataManager` (from `user.getCachedData()`) provides fast resolved lookups via `CachedPermissionData` and `CachedMetaData`
- `PlayerAdapter` provides the fastest path to get User/CachedData for online players
- `EventBus` for listening to LuckPerms-specific events
- All storage operations return `CompletableFuture` -- never call `.join()` on the main thread

## Code Examples

### Getting the API Instance

```java
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;

LuckPerms luckPerms = LuckPermsProvider.get();
```

### Getting a User (Online Player)

```java
import net.luckperms.api.LuckPerms;
import net.luckperms.api.model.user.User;
import net.luckperms.api.platform.PlayerAdapter;
import org.bukkit.entity.Player;

// Best way for online players -- fast, no async needed
PlayerAdapter<Player> adapter = luckPerms.getPlayerAdapter(Player.class);
User user = adapter.getUser(player);

// Alternative via UUID (only works if player is online)
User user = luckPerms.getUserManager().getUser(player.getUniqueId());
```

### Loading an Offline User

```java
import net.luckperms.api.model.user.UserManager;
import net.luckperms.api.model.user.User;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

UserManager userManager = luckPerms.getUserManager();
CompletableFuture<User> userFuture = userManager.loadUser(uniqueId);

userFuture.thenAcceptAsync(user -> {
    // user is now loaded, safe to query
    String name = user.getUsername();
});
```

### Checking Permissions via CachedPermissionData

```java
import net.luckperms.api.cacheddata.CachedPermissionData;
import net.luckperms.api.query.Tristate;
import org.bukkit.entity.Player;

// Via PlayerAdapter (fastest for online players)
CachedPermissionData permData = luckPerms.getPlayerAdapter(Player.class).getPermissionData(player);
Tristate result = permData.checkPermission("myplugin.admin");
boolean hasPerm = result.asBoolean(); // false if UNDEFINED or FALSE

// Via User object
CachedPermissionData permData = user.getCachedData().getPermissionData();
Tristate result = permData.checkPermission("myplugin.admin");
```

### Getting Prefix, Suffix, Meta via CachedMetaData

```java
import net.luckperms.api.cacheddata.CachedMetaData;
import org.bukkit.entity.Player;

// Via PlayerAdapter
CachedMetaData metaData = luckPerms.getPlayerAdapter(Player.class).getMetaData(player);

// Via User
CachedMetaData metaData = user.getCachedData().getMetaData();

String prefix = metaData.getPrefix();   // highest priority prefix, or null
String suffix = metaData.getSuffix();   // highest priority suffix, or null
String value = metaData.getMetaValue("my-key"); // null if not set
String group = metaData.getPrimaryGroup();

// Typed meta value with transformer
int level = metaData.getMetaValue("level", Integer::parseInt).orElse(0);
```

### Adding / Removing Permissions

```java
import net.luckperms.api.node.Node;
import net.luckperms.api.model.data.DataMutateResult;

// Add a permission
Node node = Node.builder("myplugin.use").build();
DataMutateResult result = user.data().add(node);
luckPerms.getUserManager().saveUser(user);

// Remove a permission
user.data().remove(node);
luckPerms.getUserManager().saveUser(user);

// Convenient: load, modify, save in one call (runs async)
luckPerms.getUserManager().modifyUser(uuid, u -> {
    u.data().add(Node.builder("myplugin.use").build());
});
```

### Negating a Permission

```java
import net.luckperms.api.node.Node;

Node negated = Node.builder("myplugin.fly").value(false).build();
user.data().add(negated);
luckPerms.getUserManager().saveUser(user);
```

### Temporary Permissions (Expiry)

```java
import net.luckperms.api.node.Node;
import java.time.Duration;

Node tempNode = Node.builder("myplugin.vip")
        .expiry(Duration.ofDays(30))
        .build();
user.data().add(tempNode);
luckPerms.getUserManager().saveUser(user);
```

### Adding a User to a Group (InheritanceNode)

```java
import net.luckperms.api.node.types.InheritanceNode;

InheritanceNode node = InheritanceNode.builder("vip").build();
user.data().add(node);
luckPerms.getUserManager().saveUser(user);

// Temporary group membership
InheritanceNode tempNode = InheritanceNode.builder("vip")
        .expiry(Duration.ofDays(30))
        .build();
user.data().add(tempNode);
luckPerms.getUserManager().saveUser(user);
```

### Removing a User from a Group

```java
import net.luckperms.api.node.types.InheritanceNode;

InheritanceNode node = InheritanceNode.builder("vip").build();
user.data().remove(node);
luckPerms.getUserManager().saveUser(user);
```

### PrefixNode, SuffixNode, MetaNode, WeightNode

```java
import net.luckperms.api.node.types.PrefixNode;
import net.luckperms.api.node.types.SuffixNode;
import net.luckperms.api.node.types.MetaNode;
import net.luckperms.api.node.types.WeightNode;

// Prefix with priority 100
PrefixNode prefix = PrefixNode.builder("[Admin] ", 100).build();
user.data().add(prefix);

// Suffix with priority 50
SuffixNode suffix = SuffixNode.builder(" [VIP]", 50).build();
user.data().add(suffix);

// Meta key-value
MetaNode meta = MetaNode.builder("home-limit", "5").build();
user.data().add(meta);

// Weight (usually on groups)
WeightNode weight = WeightNode.builder(75).build();
group.data().add(weight);
```

### Storing and Querying Custom Metadata

```java
import net.luckperms.api.node.types.MetaNode;
import net.luckperms.api.node.NodeType;

// Set (clear old value first, then add new)
public void setLevel(Player player, int level) {
    User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
    MetaNode node = MetaNode.builder("level", Integer.toString(level)).build();
    user.data().clear(NodeType.META.predicate(mn -> mn.getMetaKey().equals("level")));
    user.data().add(node);
    luckPerms.getUserManager().saveUser(user);
}

// Query via CachedMetaData
public int getLevel(Player player) {
    CachedMetaData metaData = luckPerms.getPlayerAdapter(Player.class).getMetaData(player);
    return metaData.getMetaValue("level", Integer::parseInt).orElse(0);
}
```

### Context-Specific Permissions

```java
import net.luckperms.api.node.Node;
import net.luckperms.api.context.DefaultContextKeys;

// Permission only on "survival" server
Node node = Node.builder("myplugin.kit.daily")
        .withContext(DefaultContextKeys.SERVER_KEY, "survival")
        .build();
user.data().add(node);

// Permission only in "world_nether" world
Node node = Node.builder("myplugin.fly")
        .withContext(DefaultContextKeys.WORLD_KEY, "world_nether")
        .build();
user.data().add(node);
```

### Reading a User's Groups

```java
import net.luckperms.api.node.NodeType;
import net.luckperms.api.node.types.InheritanceNode;
import java.util.Set;
import java.util.stream.Collectors;

Set<String> groups = user.getNodes(NodeType.INHERITANCE).stream()
        .map(InheritanceNode::getGroupName)
        .collect(Collectors.toSet());
```

### Checking Group Membership

```java
// Simplest way -- uses Bukkit's permission check under the hood
public static boolean isInGroup(Player player, String group) {
    return player.hasPermission("group." + group);
}

// Via LuckPerms API nodes
public static boolean isInGroup(User user, String group) {
    return user.getNodes(NodeType.INHERITANCE).stream()
            .map(InheritanceNode::getGroupName)
            .anyMatch(g -> g.equalsIgnoreCase(group));
}
```

### Loading / Creating Groups

```java
import net.luckperms.api.model.group.Group;
import net.luckperms.api.model.group.GroupManager;

GroupManager groupManager = luckPerms.getGroupManager();

// Load existing group
groupManager.loadGroup("vip").thenAcceptAsync(optGroup -> {
    if (optGroup.isPresent()) {
        Group group = optGroup.get();
    }
});

// Create and save a new group
groupManager.createAndLoadGroup("elite").thenAcceptAsync(group -> {
    group.data().add(Node.builder("myplugin.elite").build());
    groupManager.saveGroup(group);
});

// Modify group (load, edit, save in one call)
groupManager.modifyGroup("vip", group -> {
    group.data().add(PrefixNode.builder("[VIP] ", 50).build());
});
```

### Tracks: Promotion and Demotion

```java
import net.luckperms.api.track.Track;
import net.luckperms.api.track.TrackManager;
import net.luckperms.api.track.PromotionResult;
import net.luckperms.api.track.DemotionResult;
import net.luckperms.api.context.ImmutableContextSet;

TrackManager trackManager = luckPerms.getTrackManager();

trackManager.loadTrack("staff").thenAcceptAsync(optTrack -> {
    if (optTrack.isEmpty()) return;
    Track track = optTrack.get();

    // Promote user along the track (global context)
    PromotionResult promoResult = track.promote(user, ImmutableContextSet.empty());
    if (promoResult.wasSuccessful()) {
        String newGroup = promoResult.getGroupTo().orElse("unknown");
    }

    // Demote user along the track
    DemotionResult demoResult = track.demote(user, ImmutableContextSet.empty());

    luckPerms.getUserManager().saveUser(user);
});
```

### EventBus: Listening to Events

```java
import net.luckperms.api.event.EventBus;
import net.luckperms.api.event.user.UserDataRecalculateEvent;
import net.luckperms.api.event.user.UserLoadEvent;
import net.luckperms.api.event.node.NodeAddEvent;
import net.luckperms.api.event.node.NodeRemoveEvent;
import net.luckperms.api.event.node.NodeClearEvent;
import net.luckperms.api.event.user.track.UserPromoteEvent;
import net.luckperms.api.event.log.LogPublishEvent;

EventBus eventBus = luckPerms.getEventBus();

// Listen for user load
eventBus.subscribe(myPlugin, UserLoadEvent.class, event -> {
    User user = event.getUser();
});

// Listen for cached data recalculation
eventBus.subscribe(myPlugin, UserDataRecalculateEvent.class, event -> {
    User user = event.getUser();
    CachedPermissionData permData = user.getCachedData().getPermissionData();
});

// Listen for node (permission/group/meta) additions
eventBus.subscribe(myPlugin, NodeAddEvent.class, event -> {
    Node node = event.getNode();
    boolean isGroup = event.isGroup();
    boolean isUser = event.isUser();
});

// Listen for track promotion
eventBus.subscribe(myPlugin, UserPromoteEvent.class, event -> {
    event.getUser();
    event.getTrack();
    event.getGroupFrom();
    event.getGroupTo();
});
```

### ContextSet: Building and Querying

```java
import net.luckperms.api.context.ImmutableContextSet;
import net.luckperms.api.context.MutableContextSet;

// Immutable
ImmutableContextSet empty = ImmutableContextSet.empty();
ImmutableContextSet single = ImmutableContextSet.of("server", "survival");
ImmutableContextSet multi = ImmutableContextSet.builder()
        .add("server", "survival")
        .add("world", "world_nether")
        .build();

// Mutable
MutableContextSet set = MutableContextSet.create();
set.add("server", "lobby");
set.add("world", "spawn");
set.removeAll("world");
ImmutableContextSet immutable = set.immutableCopy();

// Query active context for an online player
ImmutableContextSet ctx = luckPerms.getContextManager().getContext(player);
```

### Registering a Custom ContextCalculator

```java
import net.luckperms.api.context.ContextCalculator;
import net.luckperms.api.context.ContextConsumer;
import net.luckperms.api.context.ContextSet;
import net.luckperms.api.context.ImmutableContextSet;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class GameModeCalculator implements ContextCalculator<Player> {
    @Override
    public void calculate(Player target, ContextConsumer consumer) {
        consumer.accept("gamemode", target.getGameMode().name().toLowerCase());
    }

    @Override
    public ContextSet estimatePotentialContexts() {
        ImmutableContextSet.Builder builder = ImmutableContextSet.builder();
        for (GameMode gm : GameMode.values()) {
            builder.add("gamemode", gm.name().toLowerCase());
        }
        return builder.build();
    }
}

// Register it
luckPerms.getContextManager().registerCalculator(new GameModeCalculator());
```

### Modifying an Existing Node (Immutable Pattern)

```java
// Nodes are immutable. To modify, use toBuilder():
Node original = Node.builder("some.perm").build();
Node negated = original.toBuilder().value(false).build();
Node withExpiry = original.toBuilder().expiry(Duration.ofHours(1)).build();
```

## API Reference

### net.luckperms.api

#### LuckPerms (Interface)
Entry point to the API.
- `UserManager getUserManager()`
- `GroupManager getGroupManager()`
- `TrackManager getTrackManager()`
- `PlayerAdapter<T> getPlayerAdapter(Class<T>)`
- `EventBus getEventBus()`
- `ContextManager getContextManager()`
- `NodeBuilderRegistry getNodeBuilderRegistry()`
- `CompletableFuture<Void> runUpdateTask()`

#### LuckPermsProvider (Class)
- `static LuckPerms get()`

### net.luckperms.api.model.user

#### UserManager (Interface)
- `User getUser(UUID)`
- `User getUser(String username)`
- `CompletableFuture<User> loadUser(UUID)`
- `CompletableFuture<User> loadUser(UUID, String username)`
- `CompletableFuture<Void> saveUser(User)`
- `CompletableFuture<Void> modifyUser(UUID, Consumer<User>)`
- `CompletableFuture<Set<UUID>> getUniqueUsers()`
- `CompletableFuture<List<HeldNode<UUID>>> getWithPermission(String)`
- `PlayerSaveResult savePlayerData(UUID, String)`
- `CompletableFuture<Set<UUID>> getKnownUserUniqueIds()`

#### User (Interface)
Extends: `PermissionHolder`
- `UUID getUniqueId()`
- `String getUsername()`
- `String getPrimaryGroup()`
- `CachedDataManager getCachedData()`
- `QueryOptions getQueryOptions()`

### net.luckperms.api.model.group

#### GroupManager (Interface)
- `Group getGroup(String name)`
- `CompletableFuture<Optional<Group>> loadGroup(String name)`
- `CompletableFuture<Group> createAndLoadGroup(String name)`
- `CompletableFuture<Void> saveGroup(Group)`
- `CompletableFuture<Void> modifyGroup(String, Consumer<Group>)`
- `CompletableFuture<Void> deleteGroup(Group)`
- `Set<Group> getLoadedGroups()`

#### Group (Interface)
Extends: `PermissionHolder`
- `String getName()`
- `Optional<String> getDisplayName()`
- `int getWeight()`
- `CachedDataManager getCachedData()`

### net.luckperms.api.model

#### PermissionHolder (Interface)
Shared base for `User` and `Group`.
- `NodeMap data()` -- for modifying normal data
- `NodeMap transientData()` -- for modifying transient (non-persistent) data
- `Collection<Node> getNodes()`
- `Collection<T> getNodes(NodeType<T>)`
- `SortedSet<Node> getDistinctNodes()`
- `Collection<Node> resolveInheritedNodes(QueryOptions)`
- `Collection<Group> getInheritedGroups(QueryOptions)`
- `QueryOptions getQueryOptions()`

#### NodeMap (Interface)
- `DataMutateResult add(Node)`
- `DataMutateResult remove(Node)`
- `DataMutateResult add(Node, TemporaryNodeMergeStrategy)`
- `void clear()`
- `void clear(Predicate<Node>)`
- `void clear(NodeType<?>)`
- `Map<String, Boolean> toMap()`

### net.luckperms.api.node

#### Node (Interface)
- `String getKey()`
- `boolean getValue()`
- `boolean hasExpiry()`
- `Instant getExpiry()`
- `boolean hasExpired()`
- `ContextSet getContexts()`
- `NodeBuilder<?, ?> toBuilder()`
- `static NodeBuilder<?, ?> builder(String key)`

#### NodeBuilder (Interface)
- `NodeBuilder value(boolean)`
- `NodeBuilder negated(boolean)`
- `NodeBuilder expiry(Duration)`
- `NodeBuilder expiry(Instant)`
- `NodeBuilder context(ContextSet)`
- `NodeBuilder withContext(String key, String value)`
- `Node build()`

#### NodeType (Interface)
Predefined types for filtering/casting nodes:
- `NodeType.PERMISSION` -- `PermissionNode`
- `NodeType.REGEX_PERMISSION` -- `RegexPermissionNode`
- `NodeType.INHERITANCE` -- `InheritanceNode`
- `NodeType.PREFIX` -- `PrefixNode`
- `NodeType.SUFFIX` -- `SuffixNode`
- `NodeType.META` -- `MetaNode`
- `NodeType.WEIGHT` -- `WeightNode`
- `NodeType.DISPLAY_NAME` -- `DisplayNameNode`

Methods:
- `boolean matches(Node)`
- `T cast(Node)`
- `Predicate<Node> predicate(Predicate<T>)`

### net.luckperms.api.node.types

#### PermissionNode (Interface)
Extends: `Node`
- `String getPermission()`
- `static NodeBuilder<PermissionNode, ?> builder(String permission)`

#### InheritanceNode (Interface)
Extends: `Node`
- `String getGroupName()`
- `static NodeBuilder<InheritanceNode, ?> builder(String groupName)`
- `static NodeBuilder<InheritanceNode, ?> builder(Group group)`

#### PrefixNode (Interface)
Extends: `Node`, `ChatMetaNode`
- `int getPriority()`
- `String getMetaValue()`
- `static NodeBuilder<PrefixNode, ?> builder(String prefix, int priority)`

#### SuffixNode (Interface)
Extends: `Node`, `ChatMetaNode`
- `int getPriority()`
- `String getMetaValue()`
- `static NodeBuilder<SuffixNode, ?> builder(String suffix, int priority)`

#### MetaNode (Interface)
Extends: `Node`
- `String getMetaKey()`
- `String getMetaValue()`
- `static NodeBuilder<MetaNode, ?> builder(String key, String value)`

#### WeightNode (Interface)
Extends: `Node`
- `int getWeight()`
- `static NodeBuilder<WeightNode, ?> builder(int weight)`

#### DisplayNameNode (Interface)
Extends: `Node`
- `String getDisplayName()`
- `static NodeBuilder<DisplayNameNode, ?> builder(String displayName)`

### net.luckperms.api.cacheddata

#### CachedDataManager (Interface)
- `CachedPermissionData getPermissionData()`
- `CachedPermissionData getPermissionData(QueryOptions)`
- `CachedMetaData getMetaData()`
- `CachedMetaData getMetaData(QueryOptions)`
- `void invalidate()`

#### CachedPermissionData (Interface)
- `Tristate checkPermission(String permission)`
- `Map<String, Boolean> getPermissionMap()`
- `QueryOptions getQueryOptions()`

#### CachedMetaData (Interface)
- `String getPrefix()`
- `String getSuffix()`
- `String getMetaValue(String key)`
- `Optional<T> getMetaValue(String key, Function<String, T> transformer)`
- `Map<String, List<String>> getMeta()`
- `SortedMap<Integer, String> getPrefixes()`
- `SortedMap<Integer, String> getSuffixes()`
- `String getPrimaryGroup()`
- `int getWeight()`
- `QueryOptions getQueryOptions()`

### net.luckperms.api.query

#### Tristate (Enum)
- `TRUE`
- `FALSE`
- `UNDEFINED`
- `boolean asBoolean()` -- TRUE=true, FALSE/UNDEFINED=false

### net.luckperms.api.model.data

#### DataMutateResult (Enum)
- `SUCCESS`
- `FAIL`
- `boolean wasSuccessful()`

### net.luckperms.api.track

#### TrackManager (Interface)
- `Track getTrack(String name)`
- `CompletableFuture<Optional<Track>> loadTrack(String name)`
- `CompletableFuture<Track> createAndLoadTrack(String name)`
- `CompletableFuture<Void> saveTrack(Track)`
- `CompletableFuture<Void> deleteTrack(Track)`
- `Set<Track> getLoadedTracks()`

#### Track (Interface)
- `String getName()`
- `List<String> getGroups()`
- `String getNext(Group current)`
- `String getPrevious(Group current)`
- `PromotionResult promote(User, ContextSet)`
- `DemotionResult demote(User, ContextSet)`
- `DataMutateResult appendGroup(Group)`
- `DataMutateResult removeGroup(Group)`
- `boolean containsGroup(String)`

#### PromotionResult (Interface)
- `boolean wasSuccessful()`
- `Optional<String> getGroupFrom()`
- `Optional<String> getGroupTo()`

#### DemotionResult (Interface)
- `boolean wasSuccessful()`
- `Optional<String> getGroupFrom()`
- `Optional<String> getGroupTo()`

### net.luckperms.api.platform

#### PlayerAdapter\<T\> (Interface)
Fast lookups for online players only.
- `User getUser(T player)`
- `ImmutableContextSet getContext(T player)`
- `QueryOptions getQueryOptions(T player)`
- `CachedPermissionData getPermissionData(T player)` (default)
- `CachedMetaData getMetaData(T player)` (default)

### net.luckperms.api.event

#### EventBus (Interface)
- `<T extends LuckPermsEvent> EventSubscription<T> subscribe(Object plugin, Class<T> eventClass, Consumer<T> handler)`
- `<T extends LuckPermsEvent> EventSubscription<T> subscribe(Class<T> eventClass, Consumer<T> handler)`

Key events:
- `net.luckperms.api.event.user.UserLoadEvent` -- user loaded from storage
- `net.luckperms.api.event.user.UserDataRecalculateEvent` -- cached data recalculated
- `net.luckperms.api.event.user.track.UserPromoteEvent` -- user promoted on track
- `net.luckperms.api.event.user.track.UserDemoteEvent` -- user demoted on track
- `net.luckperms.api.event.node.NodeAddEvent` -- node added to user/group
- `net.luckperms.api.event.node.NodeRemoveEvent` -- node removed from user/group
- `net.luckperms.api.event.node.NodeClearEvent` -- nodes cleared from user/group
- `net.luckperms.api.event.log.LogPublishEvent` -- action log entry published
- `net.luckperms.api.event.group.GroupLoadEvent` -- group loaded from storage
- `net.luckperms.api.event.group.GroupCreateEvent` -- group created
- `net.luckperms.api.event.group.GroupDeleteEvent` -- group deleted

### net.luckperms.api.context

#### ContextSet (Interface)
- `boolean contains(String key, String value)`
- `Set<String> getValues(String key)`
- `Optional<String> getAnyValue(String key)`
- `boolean isEmpty()`
- `int size()`
- `MutableContextSet mutableCopy()`
- `ImmutableContextSet immutableCopy()`

#### ImmutableContextSet (Class)
Extends: `ContextSet`
- `static ImmutableContextSet empty()`
- `static ImmutableContextSet of(String key, String value)`
- `static Builder builder()`

Builder methods: `add(String key, String value)`, `addAll(ContextSet)`, `build()`

#### MutableContextSet (Class)
Extends: `ContextSet`
- `static MutableContextSet create()`
- `static MutableContextSet of(String key, String value)`
- `void add(String key, String value)`
- `void addAll(ContextSet)`
- `void remove(String key, String value)`
- `void removeAll(String key)`
- `void clear()`

#### DefaultContextKeys (Class)
- `static final String SERVER_KEY = "server"`
- `static final String WORLD_KEY = "world"`
