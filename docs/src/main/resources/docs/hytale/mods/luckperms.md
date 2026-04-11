# LuckPerms API (Hytale)

Permission management API for Hytale servers. Handles users, groups, permissions, meta (prefix/suffix), tracks, and contexts.
This is the same LuckPerms API as Minecraft (`net.luckperms.api`), but on Hytale you pass `PlayerRef` instead of `Player`/`OfflinePlayer`.

Entry point: `net.luckperms.api.LuckPermsProvider.get()` returns the `LuckPerms` API instance.
**Important:** LuckPerms initializes during the `start()` phase, not `setup()`. Call `LuckPermsProvider.get()` in `start()` or later.

Data is stored as `Node` objects on `PermissionHolder` (User or Group).
Node types: `PermissionNode`, `InheritanceNode`, `PrefixNode`, `SuffixNode`, `MetaNode`, `WeightNode`, `RegexPermissionNode`, `DisplayNameNode`.

## Examples

### Getting the API

```java
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

public class MyPlugin extends JavaPlugin {
    private LuckPerms luckPerms;

    public MyPlugin(JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void start() {
        // must be in start(), not setup() — LuckPerms isn't ready during setup
        this.luckPerms = LuckPermsProvider.get();
    }
}
```

### Checking a Permission (Online Player)

```java
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.cacheddata.CachedPermissionData;
import net.luckperms.api.model.user.User;
import net.luckperms.api.platform.PlayerAdapter;
import net.luckperms.api.util.Tristate;
import com.hypixel.hytale.server.api.player.PlayerRef;

// on Hytale, use PlayerRef.class instead of Player.class
PlayerAdapter<PlayerRef> adapter = LuckPermsProvider.get().getPlayerAdapter(PlayerRef.class);
User user = adapter.getUser(playerRef);
CachedPermissionData permissionData = user.getCachedData().getPermissionData();

Tristate result = permissionData.checkPermission("myplugin.admin");
boolean hasPermission = result.asBoolean(); // UNDEFINED resolves to false
```

### Getting Prefix/Suffix/Meta

```java
import net.luckperms.api.cacheddata.CachedMetaData;
import net.luckperms.api.platform.PlayerAdapter;
import com.hypixel.hytale.server.api.player.PlayerRef;

PlayerAdapter<PlayerRef> adapter = LuckPermsProvider.get().getPlayerAdapter(PlayerRef.class);
CachedMetaData metaData = adapter.getMetaData(playerRef);

String prefix = metaData.getPrefix();             // highest priority prefix, or null
String suffix = metaData.getSuffix();             // highest priority suffix, or null
String primaryGroup = metaData.getPrimaryGroup();
String customValue = metaData.getMetaValue("my-key"); // custom meta, or null
```

### Adding a Permission to a User

```java
import net.luckperms.api.model.user.UserManager;
import net.luckperms.api.node.Node;

UserManager userManager = LuckPermsProvider.get().getUserManager();

// modifyUser loads from storage, applies changes, and saves back — async
userManager.modifyUser(playerRef.getUniqueId(), user -> {
    user.data().add(Node.builder("myplugin.vip").build());
});
```

### Removing a Permission

```java
userManager.modifyUser(playerRef.getUniqueId(), user -> {
    user.data().remove(Node.builder("myplugin.vip").build());
});
```

### Temporary Permission (Expires After Duration)

```java
import java.time.Duration;

userManager.modifyUser(playerRef.getUniqueId(), user -> {
    user.data().add(Node.builder("myplugin.boost")
            .expiry(Duration.ofHours(1))
            .build());
});
```

### Adding a User to a Group

```java
import net.luckperms.api.node.types.InheritanceNode;

userManager.modifyUser(playerRef.getUniqueId(), user -> {
    InheritanceNode node = InheritanceNode.builder("vip").build();
    user.data().add(node);
});
```

### Temporary Group Membership

```java
userManager.modifyUser(playerRef.getUniqueId(), user -> {
    InheritanceNode node = InheritanceNode.builder("vip")
            .expiry(Duration.ofDays(30))
            .build();
    user.data().add(node);
});
```

### Removing a User from a Group

```java
userManager.modifyUser(playerRef.getUniqueId(), user -> {
    InheritanceNode node = InheritanceNode.builder("vip").build();
    user.data().remove(node);
});
```

### Setting a Prefix

```java
import net.luckperms.api.node.types.PrefixNode;

userManager.modifyUser(playerRef.getUniqueId(), user -> {
    PrefixNode node = PrefixNode.builder("[Admin] ", 100).build();
    user.data().add(node);
});
```

### Setting a Suffix

```java
import net.luckperms.api.node.types.SuffixNode;

userManager.modifyUser(playerRef.getUniqueId(), user -> {
    SuffixNode node = SuffixNode.builder(" [MVP]", 100).build();
    user.data().add(node);
});
```

### Setting Custom Meta

```java
import net.luckperms.api.node.types.MetaNode;

userManager.modifyUser(playerRef.getUniqueId(), user -> {
    MetaNode node = MetaNode.builder("home-limit", "5").build();
    user.data().add(node);
});
```

### Loading an Offline User

```java
UserManager userManager = LuckPermsProvider.get().getUserManager();

// async — returns CompletableFuture
userManager.loadUser(uuid).thenAccept(user -> {
    CachedPermissionData data = user.getCachedData().getPermissionData();
    boolean isVip = data.checkPermission("myplugin.vip").asBoolean();
});
```

### Creating and Modifying Groups

```java
import net.luckperms.api.model.group.GroupManager;

GroupManager groupManager = LuckPermsProvider.get().getGroupManager();

// create a group (async)
groupManager.createAndLoadGroup("vip").thenAccept(group -> {
    group.data().add(Node.builder("myplugin.vip.feature").build());
    group.data().add(PrefixNode.builder("[VIP] ", 50).build());
    groupManager.saveGroup(group);
});

// modify existing group
groupManager.modifyGroup("vip", group -> {
    group.data().add(Node.builder("myplugin.vip.newperk").build());
});
```

### Context-Specific Permissions

```java
import net.luckperms.api.context.ImmutableContextSet;
import net.luckperms.api.context.DefaultContextKeys;

// permission only on a specific server (network setup)
userManager.modifyUser(playerRef.getUniqueId(), user -> {
    Node node = Node.builder("myplugin.feature")
            .withContext(DefaultContextKeys.SERVER_KEY, "lobby")
            .build();
    user.data().add(node);
});

// permission only in a specific world
userManager.modifyUser(playerRef.getUniqueId(), user -> {
    Node node = Node.builder("myplugin.fly")
            .withContext(DefaultContextKeys.WORLD_KEY, "creative")
            .build();
    user.data().add(node);
});
```

### Negating a Permission

```java
userManager.modifyUser(playerRef.getUniqueId(), user -> {
    Node node = Node.builder("myplugin.command")
            .value(false) // negated — explicitly denies
            .build();
    user.data().add(node);
});
```

### Listening to Events

LuckPerms uses its own event system, not Hytale's event registry.

```java
import net.luckperms.api.event.EventBus;
import net.luckperms.api.event.node.NodeAddEvent;
import net.luckperms.api.event.user.UserDataRecalculateEvent;

EventBus eventBus = LuckPermsProvider.get().getEventBus();

// listen for permission changes
eventBus.subscribe(this, NodeAddEvent.class, event -> {
    if (event.isUser()) {
        // a node was added to a user
    }
});

// listen for cached data being recalculated
eventBus.subscribe(this, UserDataRecalculateEvent.class, event -> {
    User user = event.getUser();
    // cached data was refreshed
});
```

### Tracks (Promotion/Demotion)

```java
import net.luckperms.api.track.Track;
import net.luckperms.api.track.TrackManager;
import net.luckperms.api.track.PromotionResult;

TrackManager trackManager = LuckPermsProvider.get().getTrackManager();

trackManager.loadTrack("staff").thenAccept(optTrack -> {
    Track track = optTrack.orElse(null);
    if (track == null) return;

    userManager.loadUser(uuid).thenAccept(user -> {
        PromotionResult result = track.promote(user, ImmutableContextSet.empty());
        if (result.wasSuccessful()) {
            // user was promoted
        }
        userManager.saveUser(user);
    });
});
```

### PlayerAdapter (Fast Lookups for Online Players)

```java
import net.luckperms.api.platform.PlayerAdapter;
import com.hypixel.hytale.server.api.player.PlayerRef;

PlayerAdapter<PlayerRef> adapter = LuckPermsProvider.get().getPlayerAdapter(PlayerRef.class);

// all of these are fast, cached lookups — no async needed
User user = adapter.getUser(playerRef);
CachedPermissionData perms = adapter.getPermissionData(playerRef);
CachedMetaData meta = adapter.getMetaData(playerRef);
ImmutableContextSet ctx = adapter.getContext(playerRef);
```

### Checking Which Groups a User Is In

```java
import net.luckperms.api.node.NodeType;
import net.luckperms.api.node.types.InheritanceNode;
import java.util.stream.Collectors;

PlayerAdapter<PlayerRef> adapter = LuckPermsProvider.get().getPlayerAdapter(PlayerRef.class);
User user = adapter.getUser(playerRef);

// get all group names the user inherits from
Set<String> groups = user.getNodes(NodeType.INHERITANCE).stream()
        .map(InheritanceNode::getGroupName)
        .collect(Collectors.toSet());

// check if user is in a specific group
boolean isVip = user.getNodes(NodeType.INHERITANCE).stream()
        .anyMatch(n -> n.getGroupName().equals("vip"));
```

## Key Differences from Minecraft LuckPerms

| Minecraft | Hytale |
|---|---|
| `Player` / `OfflinePlayer` | `PlayerRef` (`com.hypixel.hytale.server.api.player.PlayerRef`) |
| `getPlayerAdapter(Player.class)` | `getPlayerAdapter(PlayerRef.class)` |
| API ready in `onEnable()` | API ready in `start()`, **not** `setup()` |
| `JavaPlugin` from `org.bukkit.plugin` | `JavaPlugin` from `com.hypixel.hytale.server.core.plugin` |
| Constructor: `public MyPlugin()` | Constructor: `public MyPlugin(JavaPluginInit init)` |

The entire `net.luckperms.api` package is the same — all Node builders, managers, events, and cached data classes work identically.

## Package: net.luckperms.api

### Class: net.luckperms.api.LuckPerms
Type: Interface

Methods:
- GroupManager getGroupManager()
- ActionFilterFactory getActionFilterFactory()
- ActionLogger getActionLogger()
- CompletableFuture<Void> runUpdateTask()
- NodeBuilderRegistry getNodeBuilderRegistry()
- TrackManager getTrackManager()
- QueryOptionsRegistry getQueryOptionsRegistry()
- String getServerName()
- UserManager getUserManager()
- ContextManager getContextManager()
- EventBus getEventBus()
- MetaStackFactory getMetaStackFactory()
- PluginMetadata getPluginMetadata()
- Optional<MessagingService> getMessagingService()
- PlayerAdapter<TT> getPlayerAdapter(Class<TT>)
- NodeMatcherFactory getNodeMatcherFactory()
- void registerMessengerProvider(MessengerProvider)
- Health runHealthCheck()
- Platform getPlatform()

### Class: net.luckperms.api.LuckPermsProvider
Type: Class

Methods:
- **static** LuckPerms get()

## Package: net.luckperms.api.model.user

### Class: net.luckperms.api.model.user.User
Type: Interface
Implements: net.luckperms.api.model.PermissionHolder

Methods:
- DataMutateResult setPrimaryGroup(String)
- String getPrimaryGroup()
- String getUsername()
- UUID getUniqueId()

### Class: net.luckperms.api.model.user.UserManager
Type: Interface

Methods:
- CompletableFuture<Map<UUID, Collection<TT>>> searchAll(NodeMatcher<+TT>)
- CompletableFuture<List<HeldNode<UUID>>> getWithPermission(String)
- Set<User> getLoadedUsers()
- User getUser(UUID)
- User getUser(String)
- CompletableFuture<Void> deletePlayerData(UUID)
- void cleanupUser(User)
- CompletableFuture<UUID> lookupUniqueId(String)
- boolean isLoaded(UUID)
- CompletableFuture<Void> modifyUser(UUID uniqueId, Consumer<User> action)
- CompletableFuture<PlayerSaveResult> savePlayerData(UUID, String)
- CompletableFuture<String> lookupUsername(UUID)
- CompletableFuture<User> loadUser(UUID, String)
- CompletableFuture<User> loadUser(UUID uniqueId)
- CompletableFuture<Set<UUID>> getUniqueUsers()
- CompletableFuture<Void> saveUser(User)

## Package: net.luckperms.api.model.group

### Class: net.luckperms.api.model.group.Group
Type: Interface
Implements: net.luckperms.api.model.PermissionHolder

Methods:
- String getName()
- String getDisplayName()
- String getDisplayName(QueryOptions)
- OptionalInt getWeight()

### Class: net.luckperms.api.model.group.GroupManager
Type: Interface

Methods:
- CompletableFuture<Void> saveGroup(Group)
- CompletableFuture<Map<String, Collection<TT>>> searchAll(NodeMatcher<+TT>)
- CompletableFuture<List<HeldNode<String>>> getWithPermission(String)
- Group getGroup(String)
- CompletableFuture<Void> loadAllGroups()
- CompletableFuture<Void> modifyGroup(String name, Consumer<Group> action)
- CompletableFuture<Optional<Group>> loadGroup(String)
- Set<Group> getLoadedGroups()
- CompletableFuture<Void> deleteGroup(Group)
- CompletableFuture<Group> createAndLoadGroup(String)
- boolean isLoaded(String)

## Package: net.luckperms.api.model

### Class: net.luckperms.api.model.PermissionHolder
Type: Interface

Methods:
- Collection<Node> resolveInheritedNodes(QueryOptions)
- Collection<TT> resolveInheritedNodes(NodeType<TT> type, QueryOptions queryOptions)
- NodeMap transientData()
- SortedSet<Node> getDistinctNodes()
- Collection<Node> getNodes()
- Collection<TT> getNodes(NodeType<TT> type)
- NodeMap data()
- PermissionHolder$Identifier getIdentifier()
- Collection<Group> getInheritedGroups(QueryOptions)
- String getFriendlyName()
- void auditTemporaryNodes()
- SortedSet<Node> resolveDistinctInheritedNodes(QueryOptions)
- NodeMap getData(DataType)
- CachedDataManager getCachedData()
- QueryOptions getQueryOptions()

## Package: net.luckperms.api.model.data

### Class: net.luckperms.api.model.data.NodeMap
Type: Interface

Methods:
- DataMutateResult add(Node)
- DataMutateResult$WithMergedNode add(Node, TemporaryNodeMergeStrategy)
- Tristate contains(Node, NodeEqualityPredicate)
- Collection<Node> toCollection()
- Map<ImmutableContextSet, Collection<Node>> toMap()
- void clear()
- V clear(Predicate<Node>)
- void clear(ContextSet)
- V clear(ContextSet, Predicate<Node>)
- DataMutateResult remove(Node)

### Class: net.luckperms.api.model.data.DataMutateResult
Type: Enum
Extends: java.lang.Enum
Implements: net.luckperms.api.util.Result

Enum Constants:
- SUCCESS
- FAIL
- FAIL_ALREADY_HAS
- FAIL_LACKS

Methods:
- **static** DataMutateResult valueOf(String name)
- **static** DataMutateResult[] values()
- boolean wasSuccessful()

### Class: net.luckperms.api.model.data.DataType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NORMAL
- TRANSIENT

### Class: net.luckperms.api.model.data.TemporaryNodeMergeStrategy
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ADD_NEW_DURATION_TO_EXISTING
- REPLACE_EXISTING_IF_DURATION_LONGER
- NONE

## Package: net.luckperms.api.node

### Class: net.luckperms.api.node.Node
Type: Interface

Methods:
- NodeBuilder<**> toBuilder()
- String getKey()
- TT metadata(NodeMetadataKey<TT> key) throws IllegalStateException
- Optional<TT> getMetadata(NodeMetadataKey<TT>)
- Duration getExpiryDuration()
- Instant getExpiry()
- boolean isNegated()
- boolean hasExpired()
- boolean getValue()
- ImmutableContextSet getContexts()
- boolean hasExpiry()
- NodeType<*> getType()
- boolean equals(Node, NodeEqualityPredicate)
- **static** NodeBuilder<**> builder(String key)
- Collection<String> resolveShorthand()

### Class: net.luckperms.api.node.NodeBuilder
Type: Interface

Methods:
- TB clearExpiry()
- TB negated(boolean)
- TB withContext(String, String)
- TB withContext(ContextSet)
- TN build()
- TB withMetadata(NodeMetadataKey<TT>, T)
- TB context(ContextSet)
- TB expiry(long)
- TB expiry(TemporalAccessor)
- TB expiry(TemporalAmount)
- TB expiry(long duration, TimeUnit)
- TB value(boolean)

### Class: net.luckperms.api.node.NodeType
Type: Interface

Methods:
- Predicate<Node> predicate()
- Predicate<Node> predicate(Predicate<-TT> and)
- TT cast(Node)
- String name()
- boolean matches(Node)
- Optional<TT> tryCast(Node node)

## Package: net.luckperms.api.node.types

### Class: net.luckperms.api.node.types.PermissionNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- String getPermission()
- NodeType<PermissionNode> getType()
- OptionalInt getWildcardLevel()
- **static** PermissionNode$Builder builder()
- **static** PermissionNode$Builder builder(String permission)
- boolean isWildcard()

### Class: net.luckperms.api.node.types.InheritanceNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- String getGroupName()
- NodeType<InheritanceNode> getType()
- **static** InheritanceNode$Builder builder()
- **static** InheritanceNode$Builder builder(String group)
- **static** InheritanceNode$Builder builder(Group group)

### Class: net.luckperms.api.node.types.PrefixNode
Type: Interface
Implements: net.luckperms.api.node.types.ChatMetaNode

Methods:
- NodeType<PrefixNode> getType()
- **static** PrefixNode$Builder builder()
- **static** PrefixNode$Builder builder(String prefix, int priority)

### Class: net.luckperms.api.node.types.SuffixNode
Type: Interface
Implements: net.luckperms.api.node.types.ChatMetaNode

Methods:
- NodeType<SuffixNode> getType()
- **static** SuffixNode$Builder builder()
- **static** SuffixNode$Builder builder(String suffix, int priority)

### Class: net.luckperms.api.node.types.MetaNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- NodeType<MetaNode> getType()
- **static** MetaNode$Builder builder()
- **static** MetaNode$Builder builder(String key, String value)
- String getMetaKey()
- String getMetaValue()

### Class: net.luckperms.api.node.types.WeightNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- NodeType<WeightNode> getType()
- int getWeight()
- **static** WeightNode$Builder builder()
- **static** WeightNode$Builder builder(int weight)

### Class: net.luckperms.api.node.types.RegexPermissionNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- String getPatternString()
- NodeType<RegexPermissionNode> getType()
- **static** RegexPermissionNode$Builder builder()
- **static** RegexPermissionNode$Builder builder(String pattern)
- **static** RegexPermissionNode$Builder builder(Pattern pattern)
- Optional<Pattern> getPattern()

### Class: net.luckperms.api.node.types.DisplayNameNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- String getDisplayName()
- NodeType<DisplayNameNode> getType()
- **static** DisplayNameNode$Builder builder()
- **static** DisplayNameNode$Builder builder(String displayName)

## Package: net.luckperms.api.cacheddata

### Class: net.luckperms.api.cacheddata.CachedDataManager
Type: Interface

Methods:
- CachedDataManager$Container<CachedMetaData> metaData()
- void invalidatePermissionCalculators()
- CachedPermissionData getPermissionData(QueryOptions)
- CachedPermissionData getPermissionData()
- CachedDataManager$Container<CachedPermissionData> permissionData()
- void invalidate()
- CachedMetaData getMetaData(QueryOptions)
- CachedMetaData getMetaData()

### Class: net.luckperms.api.cacheddata.CachedPermissionData
Type: Interface
Implements: net.luckperms.api.cacheddata.CachedData

Methods:
- Map<String, Boolean> getPermissionMap()
- Tristate checkPermission(String permission)
- Result<Tristate, Node> queryPermission(String)
- void invalidateCache()

### Class: net.luckperms.api.cacheddata.CachedMetaData
Type: Interface
Implements: net.luckperms.api.cacheddata.CachedData

Methods:
- MetaStackDefinition getSuffixStackDefinition()
- SortedMap<Integer, String> getSuffixes()
- String getPrefix()
- String getPrimaryGroup()
- int getWeight()
- Result<String, SuffixNode> querySuffix()
- MetaStackDefinition getPrefixStackDefinition()
- Result<String, PrefixNode> queryPrefix()
- Result<Integer, WeightNode> queryWeight()
- String getSuffix()
- Map<String, List<String>> getMeta()
- SortedMap<Integer, String> getPrefixes()
- Result<String, MetaNode> queryMetaValue(String)
- String getMetaValue(String key)
- Optional<TT> getMetaValue(String key, Function<String, +TT> valueTransformer)

## Package: net.luckperms.api.event

### Class: net.luckperms.api.event.EventBus
Type: Interface

Methods:
- Set<EventSubscription<TT>> getSubscriptions(Class<TT>)
- EventSubscription<TT> subscribe(Class<TT>, Consumer<-TT>)
- EventSubscription<TT> subscribe(Object, Class<TT>, Consumer<-TT>)

### Class: net.luckperms.api.event.EventSubscription
Type: Interface
Implements: java.lang.AutoCloseable

Methods:
- Class<TT> getEventClass()
- Consumer<-TT> getHandler()
- boolean isActive()
- void close()

## Package: net.luckperms.api.track

### Class: net.luckperms.api.track.Track
Type: Interface

Methods:
- boolean containsGroup(Group)
- boolean containsGroup(String)
- String getPrevious(Group)
- DataMutateResult insertGroup(Group, int) throws IndexOutOfBoundsException
- PromotionResult promote(User, ContextSet)
- DemotionResult demote(User, ContextSet)
- String getName()
- DataMutateResult appendGroup(Group)
- void clearGroups()
- DataMutateResult removeGroup(Group)
- DataMutateResult removeGroup(String)
- String getNext(Group)
- List<String> getGroups()

### Class: net.luckperms.api.track.TrackManager
Type: Interface

Methods:
- Track getTrack(String)
- CompletableFuture<Optional<Track>> loadTrack(String)
- CompletableFuture<Void> loadAllTracks()
- CompletableFuture<Void> saveTrack(Track)
- CompletableFuture<Track> createAndLoadTrack(String)
- CompletableFuture<Void> deleteTrack(Track)
- CompletableFuture<Void> modifyTrack(String name, Consumer<Track> action)
- boolean isLoaded(String)
- Set<Track> getLoadedTracks()

## Package: net.luckperms.api.context

### Class: net.luckperms.api.context.ImmutableContextSet
Type: Interface
Implements: net.luckperms.api.context.ContextSet

Methods:
- ImmutableContextSet immutableCopy()
- **static** ImmutableContextSet of(String key, String value)
- **static** ImmutableContextSet$Builder builder()
- **static** ImmutableContextSet empty()

### Class: net.luckperms.api.context.MutableContextSet
Type: Interface
Implements: net.luckperms.api.context.ContextSet

Methods:
- void add(String, String)
- void add(Context entry)
- void removeAll(String)
- V addAll(Iterable<Context> iterable)
- void addAll(ContextSet)
- **static** MutableContextSet of(String key, String value)
- void clear()
- **static** MutableContextSet create()
- void remove(String, String)

## Package: net.luckperms.api.platform

### Class: net.luckperms.api.platform.PlayerAdapter
Type: Interface

Methods:
- CachedPermissionData getPermissionData(T player)
- User getUser(T)
- CachedMetaData getMetaData(T player)
- ImmutableContextSet getContext(T)
- QueryOptions getQueryOptions(T)

## Package: net.luckperms.api.util

### Class: net.luckperms.api.util.Tristate
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- TRUE
- FALSE
- UNDEFINED

Methods:
- **static** Tristate valueOf(String name)
- **static** Tristate of(boolean val)
- **static** Tristate of(Boolean val)
- **static** Tristate[] values()
- boolean asBoolean()
