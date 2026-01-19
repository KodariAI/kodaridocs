# apiluckperms-net-luckperms-api API Reference

**Package Filter:** `net.luckperms.api`

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

## Package: net.luckperms.api.actionlog

### Class: net.luckperms.api.actionlog.Action
Type: Interface
Implements: java.lang.Comparable

Methods:
- Action$Target getTarget()
- Action$Source getSource()
- Instant getTimestamp()
- **static** Action$Builder builder()
- String getDescription()

### Class: net.luckperms.api.actionlog.Action$Builder
Type: Interface

Methods:
- Action$Builder targetName(String)
- Action build()
- Action$Builder description(String)
- Action$Builder targetType(Action$Target$Type)
- Action$Builder sourceName(String)
- Action$Builder source(UUID)
- Action$Builder target(UUID)
- Action$Builder timestamp(Instant)

### Class: net.luckperms.api.actionlog.Action$Source
Type: Interface

Methods:
- String getName()
- UUID getUniqueId()

### Class: net.luckperms.api.actionlog.Action$Target
Type: Interface

Methods:
- String getName()
- Action$Target$Type getType()
- Optional<UUID> getUniqueId()

### Class: net.luckperms.api.actionlog.ActionLog
Type: Interface

Methods:
- SortedSet<Action> getTrackHistory(String)
- SortedSet<Action> getGroupHistory(String)
- SortedSet<Action> getContent()
- SortedSet<Action> getContent(UUID)
- SortedSet<Action> getUserHistory(UUID)

### Class: net.luckperms.api.actionlog.ActionLogger
Type: Interface

Methods:
- CompletableFuture<Void> submit(Action)
- CompletableFuture<Void> submitToStorage(Action)
- CompletableFuture<ActionLog> getLog()
- Action$Builder actionBuilder()
- CompletableFuture<List<Action>> queryActions(ActionFilter)
- CompletableFuture<Page<Action>> queryActions(ActionFilter, int, int)
- CompletableFuture<Void> broadcastAction(Action)

### Class: net.luckperms.api.actionlog.Action$Target$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- USER
- GROUP
- TRACK

Methods:
- **static** Action$Target$Type valueOf(String name)
- **static** Action$Target$Type[] values()

## Package: net.luckperms.api.actionlog.filter

### Class: net.luckperms.api.actionlog.filter.ActionFilter
Type: Interface
Implements: java.util.function.Predicate

Methods:
- **static** ActionFilter search(String query)
- boolean test(Action)
- boolean test(Object)
- **static** ActionFilter source(UUID uniqueId)
- **static** ActionFilter track(String name)
- **static** ActionFilter user(UUID uniqueId)
- **static** ActionFilter any()
- **static** ActionFilter group(String name)

### Class: net.luckperms.api.actionlog.filter.ActionFilterFactory
Type: Interface

Methods:
- ActionFilter search(String)
- ActionFilter source(UUID)
- ActionFilter track(String)
- ActionFilter user(UUID)
- ActionFilter any()
- ActionFilter group(String)

## Package: net.luckperms.api.cacheddata

### Class: net.luckperms.api.cacheddata.CachedData
Type: Interface

Methods:
- QueryOptions getQueryOptions()

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

### Class: net.luckperms.api.cacheddata.CachedDataManager$Container
Type: Interface

Methods:
- CompletableFuture<+TT> reload(QueryOptions)
- CompletableFuture<Void> reload()
- TT get(QueryOptions)
- void invalidate(QueryOptions)
- void invalidate()
- TT calculate(QueryOptions)
- void recalculate(QueryOptions)
- void recalculate()

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

### Class: net.luckperms.api.cacheddata.CachedPermissionData
Type: Interface
Implements: net.luckperms.api.cacheddata.CachedData

Methods:
- Map<String, Boolean> getPermissionMap()
- Tristate checkPermission(String permission)
- Result<Tristate, Node> queryPermission(String)
- void invalidateCache()

### Class: net.luckperms.api.cacheddata.Result
Type: Interface

Methods:
- TT result()
- TN node()

## Package: net.luckperms.api.context

### Class: net.luckperms.api.context.Context
Type: Interface

Methods:
- String getValue()
- String getKey()
- **static** boolean isValidValue(String value)
- **static** boolean isValidKey(String key)

### Class: net.luckperms.api.context.ContextCalculator
Type: Interface

Methods:
- ContextSet estimatePotentialContexts()
- V calculate(T, T)
- **static** ContextCalculator<TT> forSingleContext(String key, Function<TT, String> valueFunction)

### Class: net.luckperms.api.context.ContextConsumer
Type: Interface

Methods:
- void accept(String, String)
- void accept(Context context)
- void accept(ContextSet contextSet)

### Class: net.luckperms.api.context.ContextManager
Type: Interface

Methods:
- V unregisterCalculator(ContextCalculator<*>)
- ImmutableContextSet getStaticContext()
- void invalidateCache(Object subject)
- QueryOptions$Builder queryOptionsBuilder(QueryMode)
- QueryOptions getStaticQueryOptions()
- V registerCalculator(ContextCalculator<*>)
- void signalContextUpdate(Object)
- ImmutableContextSet getContext(Object)
- Optional<ImmutableContextSet> getContext(User)
- ContextSetFactory getContextSetFactory()
- QueryOptions getQueryOptions(Object)
- Optional<QueryOptions> getQueryOptions(User)

### Class: net.luckperms.api.context.ContextSet
Type: Interface
Implements: java.lang.Iterable

Methods:
- Set<String> getValues(String)
- Optional<String> getAnyValue(String key)
- boolean containsKey(String)
- boolean isEmpty()
- Z containsAny(String key, Iterable<String> values)
- boolean isSatisfiedBy(ContextSet other)
- boolean isSatisfiedBy(ContextSet, ContextSatisfyMode)
- Map<String, String> toFlattenedMap()
- Set<Context> toSet()
- boolean contains(String, String)
- boolean contains(Context entry)
- Iterator<Context> iterator()
- int size()
- ImmutableContextSet immutableCopy()
- boolean isImmutable()
- Map<String, Set<String>> toMap()
- MutableContextSet mutableCopy()

### Class: net.luckperms.api.context.ContextSetFactory
Type: Interface

Methods:
- ImmutableContextSet immutableEmpty()
- ImmutableContextSet immutableOf(String, String)
- MutableContextSet mutable()
- ImmutableContextSet$Builder immutableBuilder()

### Class: net.luckperms.api.context.ImmutableContextSet
Type: Interface
Implements: net.luckperms.api.context.ContextSet

Methods:
- ImmutableContextSet immutableCopy()
- **static** ImmutableContextSet of(String key, String value)
- **static** ImmutableContextSet$Builder builder()
- **static** ImmutableContextSet empty()

### Class: net.luckperms.api.context.ImmutableContextSet$Builder
Type: Interface

Methods:
- ImmutableContextSet$Builder add(String, String)
- ImmutableContextSet$Builder add(Context entry)
- ImmutableContextSet build()
- ImmutableContextSet$Builder addAll(Iterable<Context> iterable)
- ImmutableContextSet$Builder addAll(ContextSet)

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

### Class: net.luckperms.api.context.StaticContextCalculator
Type: Interface
Implements: net.luckperms.api.context.ContextCalculator

Methods:
- void calculate(ContextConsumer)
- void calculate(Object target, ContextConsumer consumer)
- **static** StaticContextCalculator forSingleContext(String key, Supplier<String> valueFunction)

### Class: net.luckperms.api.context.ContextSatisfyMode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- AT_LEAST_ONE_VALUE_PER_KEY
- ALL_VALUES_PER_KEY

Methods:
- **static** ContextSatisfyMode valueOf(String name)
- **static** ContextSatisfyMode[] values()

### Class: net.luckperms.api.context.DefaultContextKeys
Type: Class

No public methods found

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

### Class: net.luckperms.api.event.LuckPermsEvent
Type: Interface

Methods:
- LuckPerms getLuckPerms()
- Class<LuckPermsEvent> getEventType()

## Package: net.luckperms.api.event.cause

### Class: net.luckperms.api.event.cause.CreationCause
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- COMMAND
- WEB_EDITOR
- API
- INTERNAL

Methods:
- **static** CreationCause valueOf(String name)
- **static** CreationCause[] values()

### Class: net.luckperms.api.event.cause.DeletionCause
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- COMMAND
- WEB_EDITOR
- API
- INTERNAL

Methods:
- **static** DeletionCause valueOf(String name)
- **static** DeletionCause[] values()

## Package: net.luckperms.api.event.context

### Class: net.luckperms.api.event.context.ContextUpdateEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- Object getSubject()
- Optional<TT> getSubject(Class<TT> subjectClass)

## Package: net.luckperms.api.event.extension

### Class: net.luckperms.api.event.extension.ExtensionLoadEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- Extension getExtension()

## Package: net.luckperms.api.event.group

### Class: net.luckperms.api.event.group.GroupCacheLoadEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- CachedDataManager getLoadedData()
- Group getGroup()

### Class: net.luckperms.api.event.group.GroupCreateEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- Group getGroup()
- CreationCause getCause()

### Class: net.luckperms.api.event.group.GroupDataRecalculateEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- Group getGroup()
- CachedDataManager getData()

### Class: net.luckperms.api.event.group.GroupDeleteEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- String getGroupName()
- Set<Node> getExistingData()
- DeletionCause getCause()

### Class: net.luckperms.api.event.group.GroupLoadAllEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

No public methods found

### Class: net.luckperms.api.event.group.GroupLoadEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- Group getGroup()

## Package: net.luckperms.api.event.log

### Class: net.luckperms.api.event.log.LogBroadcastEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.Cancellable

Methods:
- LogBroadcastEvent$Origin getOrigin()
- Action getEntry()

### Class: net.luckperms.api.event.log.LogNetworkPublishEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.Cancellable

Methods:
- UUID getLogId()
- Action getEntry()

### Class: net.luckperms.api.event.log.LogNotifyEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.Cancellable

Methods:
- LogNotifyEvent$Origin getOrigin()
- PlatformEntity getNotifiable()
- Action getEntry()

### Class: net.luckperms.api.event.log.LogPublishEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.Cancellable

Methods:
- Action getEntry()

### Class: net.luckperms.api.event.log.LogReceiveEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- UUID getLogId()
- Action getEntry()

### Class: net.luckperms.api.event.log.LogBroadcastEvent$Origin
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LOCAL
- LOCAL_API
- REMOTE

Methods:
- **static** LogBroadcastEvent$Origin valueOf(String name)
- **static** LogBroadcastEvent$Origin[] values()

### Class: net.luckperms.api.event.log.LogNotifyEvent$Origin
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LOCAL
- LOCAL_API
- REMOTE

Methods:
- **static** LogNotifyEvent$Origin valueOf(String name)
- **static** LogNotifyEvent$Origin[] values()

## Package: net.luckperms.api.event.messaging

### Class: net.luckperms.api.event.messaging.CustomMessageReceiveEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- String getPayload()
- String getChannelId()

## Package: net.luckperms.api.event.node

### Class: net.luckperms.api.event.node.NodeAddEvent
Type: Interface
Implements: net.luckperms.api.event.node.NodeMutateEvent

Methods:
- Node getNode()
- Set<Node> getDataBefore()

### Class: net.luckperms.api.event.node.NodeClearEvent
Type: Interface
Implements: net.luckperms.api.event.node.NodeMutateEvent

Methods:
- Set<Node> getNodes()
- Set<Node> getDataBefore()

### Class: net.luckperms.api.event.node.NodeMutateEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- PermissionHolder getTarget()
- DataType getDataType()
- Set<Node> getDataAfter()
- boolean isGroup()
- boolean isUser()
- Set<Node> getDataBefore()

### Class: net.luckperms.api.event.node.NodeRemoveEvent
Type: Interface
Implements: net.luckperms.api.event.node.NodeMutateEvent

Methods:
- Node getNode()
- Set<Node> getDataBefore()

## Package: net.luckperms.api.event.player

### Class: net.luckperms.api.event.player.PlayerDataSaveEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- PlayerSaveResult getResult()
- String getUsername()
- UUID getUniqueId()

### Class: net.luckperms.api.event.player.PlayerLoginProcessEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.util.Result

Methods:
- User getUser()
- boolean wasSuccessful()
- String getUsername()
- UUID getUniqueId()

## Package: net.luckperms.api.event.player.lookup

### Class: net.luckperms.api.event.player.lookup.UniqueIdDetermineTypeEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.ResultEvent

Methods:
- String getType()
- void setType(String type)
- UUID getUniqueId()

### Class: net.luckperms.api.event.player.lookup.UniqueIdLookupEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.ResultEvent

Methods:
- void setUniqueId(UUID uniqueId)
- String getUsername()

### Class: net.luckperms.api.event.player.lookup.UsernameLookupEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.ResultEvent

Methods:
- void setUsername(String username)
- UUID getUniqueId()

### Class: net.luckperms.api.event.player.lookup.UsernameValidityCheckEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- void setValid(boolean valid)
- AtomicBoolean validityState()
- boolean isValid()
- String getUsername()

## Package: net.luckperms.api.event.source

### Class: net.luckperms.api.event.source.EntitySource
Type: Interface
Implements: net.luckperms.api.event.source.Source

Methods:
- PlatformEntity getEntity()

### Class: net.luckperms.api.event.source.Source
Type: Interface

Methods:
- Source$Type getType()

### Class: net.luckperms.api.event.source.Source$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ENTITY
- UNKNOWN

Methods:
- **static** Source$Type valueOf(String name)
- **static** Source$Type[] values()

## Package: net.luckperms.api.event.sync

### Class: net.luckperms.api.event.sync.ConfigReloadEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

No public methods found

### Class: net.luckperms.api.event.sync.PostNetworkSyncEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- SyncType getType()
- boolean didSyncOccur()
- UUID getSpecificUserUniqueId()
- UUID getSyncId()

### Class: net.luckperms.api.event.sync.PostSyncEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

No public methods found

### Class: net.luckperms.api.event.sync.PreNetworkSyncEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.Cancellable

Methods:
- SyncType getType()
- UUID getSpecificUserUniqueId()
- UUID getSyncId()

### Class: net.luckperms.api.event.sync.PreSyncEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.Cancellable

No public methods found

### Class: net.luckperms.api.event.sync.SyncType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FULL
- SPECIFIC_USER

Methods:
- **static** SyncType valueOf(String name)
- **static** SyncType[] values()

## Package: net.luckperms.api.event.track

### Class: net.luckperms.api.event.track.TrackCreateEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- Track getTrack()
- CreationCause getCause()

### Class: net.luckperms.api.event.track.TrackDeleteEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- List<String> getExistingData()
- String getTrackName()
- DeletionCause getCause()

### Class: net.luckperms.api.event.track.TrackLoadAllEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

No public methods found

### Class: net.luckperms.api.event.track.TrackLoadEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- Track getTrack()

## Package: net.luckperms.api.event.track.mutate

### Class: net.luckperms.api.event.track.mutate.TrackAddGroupEvent
Type: Interface
Implements: net.luckperms.api.event.track.mutate.TrackMutateEvent

Methods:
- String getGroup()

### Class: net.luckperms.api.event.track.mutate.TrackClearEvent
Type: Interface
Implements: net.luckperms.api.event.track.mutate.TrackMutateEvent

No public methods found

### Class: net.luckperms.api.event.track.mutate.TrackMutateEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- Track getTrack()
- List<String> getStateAfter()
- List<String> getStateBefore()

### Class: net.luckperms.api.event.track.mutate.TrackRemoveGroupEvent
Type: Interface
Implements: net.luckperms.api.event.track.mutate.TrackMutateEvent

Methods:
- String getGroup()

## Package: net.luckperms.api.event.type

### Class: net.luckperms.api.event.type.Cancellable
Type: Interface

Methods:
- boolean isCancelled()
- boolean setCancelled(boolean cancelled)
- boolean isNotCancelled()
- AtomicBoolean cancellationState()

### Class: net.luckperms.api.event.type.ResultEvent
Type: Interface

Methods:
- AtomicReference<TT> result()
- boolean hasResult()

### Class: net.luckperms.api.event.type.Sourced
Type: Interface

Methods:
- Source getSource()

## Package: net.luckperms.api.event.user

### Class: net.luckperms.api.event.user.UserCacheLoadEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- CachedDataManager getLoadedData()
- User getUser()

### Class: net.luckperms.api.event.user.UserDataRecalculateEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- User getUser()
- CachedDataManager getData()

### Class: net.luckperms.api.event.user.UserFirstLoginEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- String getUsername()
- UUID getUniqueId()

### Class: net.luckperms.api.event.user.UserLoadEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- User getUser()

### Class: net.luckperms.api.event.user.UserUnloadEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.Cancellable

Methods:
- User getUser()

## Package: net.luckperms.api.event.user.track

### Class: net.luckperms.api.event.user.track.UserDemoteEvent
Type: Interface
Implements: net.luckperms.api.event.user.track.UserTrackEvent

Methods:
- TrackAction getAction()

### Class: net.luckperms.api.event.user.track.UserPromoteEvent
Type: Interface
Implements: net.luckperms.api.event.user.track.UserTrackEvent

Methods:
- TrackAction getAction()

### Class: net.luckperms.api.event.user.track.UserTrackEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.Sourced

Methods:
- Track getTrack()
- Optional<String> getGroupFrom()
- User getUser()
- TrackAction getAction()
- Optional<String> getGroupTo()

### Class: net.luckperms.api.event.user.track.TrackAction
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PROMOTION
- DEMOTION

Methods:
- **static** TrackAction valueOf(String name)
- **static** TrackAction[] values()

## Package: net.luckperms.api.event.util

### Class: net.luckperms.api.event.util.Param
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- int value()

## Package: net.luckperms.api.extension

### Class: net.luckperms.api.extension.Extension
Type: Interface

Methods:
- void load()
- void unload()

### Class: net.luckperms.api.extension.ExtensionManager
Type: Interface

Methods:
- void loadExtension(Extension)
- Extension loadExtension(Path) throws IOException
- Collection<Extension> getLoadedExtensions()

## Package: net.luckperms.api.messaging

### Class: net.luckperms.api.messaging.MessagingService
Type: Interface

Methods:
- String getName()
- void sendCustomMessage(String, String)
- void pushUserUpdate(User)
- void pushUpdate()

## Package: net.luckperms.api.messenger

### Class: net.luckperms.api.messenger.IncomingMessageConsumer
Type: Interface

Methods:
- boolean consumeIncomingMessage(Message)
- boolean consumeIncomingMessageAsString(String)

### Class: net.luckperms.api.messenger.Messenger
Type: Interface
Implements: java.lang.AutoCloseable

Methods:
- void sendOutgoingMessage(OutgoingMessage)
- void close()

### Class: net.luckperms.api.messenger.MessengerProvider
Type: Interface

Methods:
- Messenger obtain(IncomingMessageConsumer)
- String getName()

## Package: net.luckperms.api.messenger.message

### Class: net.luckperms.api.messenger.message.Message
Type: Interface

Methods:
- UUID getId()

### Class: net.luckperms.api.messenger.message.OutgoingMessage
Type: Interface
Implements: net.luckperms.api.messenger.message.Message

Methods:
- String asEncodedString()

## Package: net.luckperms.api.messenger.message.type

### Class: net.luckperms.api.messenger.message.type.ActionLogMessage
Type: Interface
Implements: net.luckperms.api.messenger.message.Message

Methods:
- Action getAction()

### Class: net.luckperms.api.messenger.message.type.CustomMessage
Type: Interface
Implements: net.luckperms.api.messenger.message.Message

Methods:
- String getPayload()
- String getChannelId()

### Class: net.luckperms.api.messenger.message.type.UpdateMessage
Type: Interface
Implements: net.luckperms.api.messenger.message.Message

No public methods found

### Class: net.luckperms.api.messenger.message.type.UserUpdateMessage
Type: Interface
Implements: net.luckperms.api.messenger.message.Message

Methods:
- UUID getUserUniqueId()

## Package: net.luckperms.api.metastacking

### Class: net.luckperms.api.metastacking.DuplicateRemovalFunction
Type: Interface

Methods:
- V processDuplicates(List<TT>)

### Class: net.luckperms.api.metastacking.MetaStackDefinition
Type: Interface

Methods:
- String getStartSpacer()
- DuplicateRemovalFunction getDuplicateRemovalFunction()
- String getEndSpacer()
- List<MetaStackElement> getElements()
- String getMiddleSpacer()

### Class: net.luckperms.api.metastacking.MetaStackElement
Type: Interface

Methods:
- Z shouldAccumulate(ChatMetaType, ChatMetaNode<**>, ChatMetaNode<**>)

### Class: net.luckperms.api.metastacking.MetaStackFactory
Type: Interface

Methods:
- MetaStackDefinition createDefinition(List<MetaStackElement>, DuplicateRemovalFunction, String, String, String)
- List<MetaStackElement> fromStrings(List<String>)
- Optional<MetaStackElement> fromString(String)

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

### Class: net.luckperms.api.model.PermissionHolder$Identifier
Type: Interface

Methods:
- String getName()
- String getType()

### Class: net.luckperms.api.model.PlayerSaveResult
Type: Interface

Methods:
- Set<PlayerSaveResult$Outcome> getOutcomes()
- Set<UUID> getOtherUniqueIds()
- boolean includes(PlayerSaveResult$Outcome outcome)
- String getPreviousUsername()

### Class: net.luckperms.api.model.PlayerSaveResult$Outcome
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CLEAN_INSERT
- NO_CHANGE
- USERNAME_UPDATED
- OTHER_UNIQUE_IDS_PRESENT_FOR_USERNAME

Methods:
- **static** PlayerSaveResult$Outcome valueOf(String name)
- **static** PlayerSaveResult$Outcome[] values()

## Package: net.luckperms.api.model.data

### Class: net.luckperms.api.model.data.DataMutateResult$WithMergedNode
Type: Interface

Methods:
- DataMutateResult getResult()
- Node getMergedNode()

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

Methods:
- **static** DataType valueOf(String name)
- **static** DataType[] values()

### Class: net.luckperms.api.model.data.TemporaryNodeMergeStrategy
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ADD_NEW_DURATION_TO_EXISTING
- REPLACE_EXISTING_IF_DURATION_LONGER
- NONE

Methods:
- **static** TemporaryNodeMergeStrategy valueOf(String name)
- **static** TemporaryNodeMergeStrategy[] values()

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

## Package: net.luckperms.api.node

### Class: net.luckperms.api.node.HeldNode
Type: Interface

Methods:
- Node getNode()
- TT getHolder()

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
- boolean equals(Object)
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

### Class: net.luckperms.api.node.NodeBuilderRegistry
Type: Interface

Methods:
- WeightNode$Builder forWeight()
- PermissionNode$Builder forPermission()
- RegexPermissionNode$Builder forRegexPermission()
- SuffixNode$Builder forSuffix()
- InheritanceNode$Builder forInheritance()
- NodeBuilder<**> forKey(String)
- DisplayNameNode$Builder forDisplayName()
- PrefixNode$Builder forPrefix()
- MetaNode$Builder forMeta()

### Class: net.luckperms.api.node.NodeEqualityPredicate
Type: Interface

Methods:
- boolean areEqual(Node, Node)
- Predicate<Node> equalTo(Node node)

### Class: net.luckperms.api.node.NodeType
Type: Interface

Methods:
- Predicate<Node> predicate()
- Predicate<Node> predicate(Predicate<-TT> and)
- TT cast(Node)
- String name()
- boolean matches(Node)
- Optional<TT> tryCast(Node node)

### Class: net.luckperms.api.node.ScopedNode
Type: Interface
Implements: net.luckperms.api.node.Node

Methods:
- TB toBuilder()
- NodeType<TN> getType()

### Class: net.luckperms.api.node.ChatMetaType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PREFIX
- SUFFIX

Methods:
- **static** ChatMetaType valueOf(String name)
- **static** ChatMetaType[] values()
- ChatMetaNode$Builder<**> builder()
- ChatMetaNode$Builder<**> builder(String, int)
- String toString()
- NodeType<ChatMetaNode<**>> nodeType()

## Package: net.luckperms.api.node.matcher

### Class: net.luckperms.api.node.matcher.NodeMatcher
Type: Interface
Implements: java.util.function.Predicate

Methods:
- boolean test(Node)
- boolean test(Object)
- **static** NodeMatcher<TT> equals(T other, T equalityPredicate)
- **static** NodeMatcher<MetaNode> metaKey(String metaKey)
- **static** NodeMatcher<MetaNode> metaKey(MetaNode metaNode)
- **static** NodeMatcher<Node> keyStartsWith(String startingWith)
- **static** NodeMatcher<TT> type(NodeType<+TT> type)
- **static** NodeMatcher<Node> key(String key)
- **static** NodeMatcher<TT> key(T node)

### Class: net.luckperms.api.node.matcher.NodeMatcherFactory
Type: Interface

Methods:
- NodeMatcher<TT> equals(T, T)
- NodeMatcher<MetaNode> metaKey(String)
- NodeMatcher<Node> keyStartsWith(String)
- NodeMatcher<TT> type(NodeType<+TT>)
- NodeMatcher<Node> key(String)
- NodeMatcher<TT> key(T)

## Package: net.luckperms.api.node.metadata

### Class: net.luckperms.api.node.metadata.NodeMetadataKey
Type: Interface

Methods:
- **static** NodeMetadataKey<TT> of(String name, Class<TT> type)
- String name()
- Class<TT> type()

## Package: net.luckperms.api.node.metadata.types

### Class: net.luckperms.api.node.metadata.types.InheritanceOriginMetadata
Type: Interface

Methods:
- PermissionHolder$Identifier getOrigin()
- boolean wasInherited(PermissionHolder$Identifier holder)
- DataType getDataType()

## Package: net.luckperms.api.node.types

### Class: net.luckperms.api.node.types.ChatMetaNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- ChatMetaType getMetaType()
- int getPriority()
- String getMetaValue()

### Class: net.luckperms.api.node.types.ChatMetaNode$Builder
Type: Interface
Implements: net.luckperms.api.node.NodeBuilder

Methods:
- TB priority(int)

### Class: net.luckperms.api.node.types.DisplayNameNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- String getDisplayName()
- NodeType<DisplayNameNode> getType()
- **static** DisplayNameNode$Builder builder()
- **static** DisplayNameNode$Builder builder(String displayName)

### Class: net.luckperms.api.node.types.DisplayNameNode$Builder
Type: Interface
Implements: net.luckperms.api.node.NodeBuilder

Methods:
- DisplayNameNode$Builder displayName(String)

### Class: net.luckperms.api.node.types.InheritanceNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- String getGroupName()
- NodeType<InheritanceNode> getType()
- **static** InheritanceNode$Builder builder()
- **static** InheritanceNode$Builder builder(String group)
- **static** InheritanceNode$Builder builder(Group group)

### Class: net.luckperms.api.node.types.InheritanceNode$Builder
Type: Interface
Implements: net.luckperms.api.node.NodeBuilder

Methods:
- InheritanceNode$Builder group(String)
- InheritanceNode$Builder group(Group)

### Class: net.luckperms.api.node.types.MetaNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- NodeType<MetaNode> getType()
- **static** MetaNode$Builder builder()
- **static** MetaNode$Builder builder(String key, String value)
- String getMetaKey()
- String getMetaValue()

### Class: net.luckperms.api.node.types.MetaNode$Builder
Type: Interface
Implements: net.luckperms.api.node.NodeBuilder

Methods:
- MetaNode$Builder value(String)
- MetaNode$Builder key(String)

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

### Class: net.luckperms.api.node.types.PermissionNode$Builder
Type: Interface
Implements: net.luckperms.api.node.NodeBuilder

Methods:
- PermissionNode$Builder permission(String)

### Class: net.luckperms.api.node.types.PrefixNode
Type: Interface
Implements: net.luckperms.api.node.types.ChatMetaNode

Methods:
- NodeType<PrefixNode> getType()
- **static** PrefixNode$Builder builder()
- **static** PrefixNode$Builder builder(String prefix, int priority)

### Class: net.luckperms.api.node.types.PrefixNode$Builder
Type: Interface
Implements: net.luckperms.api.node.types.ChatMetaNode$Builder

Methods:
- PrefixNode$Builder prefix(String)

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

### Class: net.luckperms.api.node.types.RegexPermissionNode$Builder
Type: Interface
Implements: net.luckperms.api.node.NodeBuilder

Methods:
- RegexPermissionNode$Builder pattern(String)
- RegexPermissionNode$Builder pattern(Pattern)

### Class: net.luckperms.api.node.types.SuffixNode
Type: Interface
Implements: net.luckperms.api.node.types.ChatMetaNode

Methods:
- NodeType<SuffixNode> getType()
- **static** SuffixNode$Builder builder()
- **static** SuffixNode$Builder builder(String suffix, int priority)

### Class: net.luckperms.api.node.types.SuffixNode$Builder
Type: Interface
Implements: net.luckperms.api.node.types.ChatMetaNode$Builder

Methods:
- SuffixNode$Builder suffix(String)

### Class: net.luckperms.api.node.types.WeightNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- NodeType<WeightNode> getType()
- int getWeight()
- **static** WeightNode$Builder builder()
- **static** WeightNode$Builder builder(int weight)

### Class: net.luckperms.api.node.types.WeightNode$Builder
Type: Interface
Implements: net.luckperms.api.node.NodeBuilder

Methods:
- WeightNode$Builder weight(int)

## Package: net.luckperms.api.platform

### Class: net.luckperms.api.platform.Health
Type: Interface

Methods:
- Map<String, Object> getDetails()
- boolean isHealthy()

### Class: net.luckperms.api.platform.Platform
Type: Interface

Methods:
- Platform$Type getType()
- Set<UUID> getUniqueConnections()
- Instant getStartTime()
- Collection<String> getKnownPermissions()

### Class: net.luckperms.api.platform.PlatformEntity
Type: Interface

Methods:
- String getName()
- PlatformEntity$Type getType()
- UUID getUniqueId()

### Class: net.luckperms.api.platform.PlayerAdapter
Type: Interface

Methods:
- CachedPermissionData getPermissionData(T player)
- User getUser(T)
- CachedMetaData getMetaData(T player)
- ImmutableContextSet getContext(T)
- QueryOptions getQueryOptions(T)

### Class: net.luckperms.api.platform.PluginMetadata
Type: Interface

Methods:
- String getVersion()
- String getApiVersion()

### Class: net.luckperms.api.platform.Platform$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BUKKIT
- BUNGEECORD
- SPONGE
- NUKKIT
- VELOCITY
- FABRIC
- NEOFORGE
- FORGE
- STANDALONE

Methods:
- **static** Platform$Type valueOf(String name)
- String getFriendlyName()
- **static** Platform$Type[] values()

### Class: net.luckperms.api.platform.PlatformEntity$Type
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PLAYER
- CONSOLE

Methods:
- **static** PlatformEntity$Type valueOf(String name)
- **static** PlatformEntity$Type[] values()

## Package: net.luckperms.api.query

### Class: net.luckperms.api.query.OptionKey
Type: Interface

Methods:
- **static** OptionKey<TT> of(String name, Class<TT> type)
- String name()
- Class<TT> type()

### Class: net.luckperms.api.query.QueryOptions
Type: Interface

Methods:
- QueryMode mode()
- **static** QueryOptions contextual(ContextSet context, Set<Flag> flags)
- **static** QueryOptions contextual(ContextSet context)
- QueryOptions$Builder toBuilder()
- **static** QueryOptions defaultContextualOptions()
- **static** QueryOptions nonContextual(Set<Flag> flags)
- **static** QueryOptions nonContextual()
- boolean flag(Flag)
- boolean satisfies(ContextSet contextSet)
- boolean satisfies(ContextSet, ContextSatisfyMode)
- Map<OptionKey<*>, Object> options()
- Set<Flag> flags()
- ImmutableContextSet context()
- **static** QueryOptions$Builder builder(QueryMode mode)
- Optional<TO> option(OptionKey<TO>)

### Class: net.luckperms.api.query.QueryOptions$Builder
Type: Interface

Methods:
- QueryOptions$Builder mode(QueryMode)
- QueryOptions$Builder flag(Flag, boolean)
- QueryOptions build()
- QueryOptions$Builder flags(Set<Flag>)
- QueryOptions$Builder context(ContextSet)
- QueryOptions$Builder option(OptionKey<TO>, T)

### Class: net.luckperms.api.query.QueryOptionsRegistry
Type: Interface

Methods:
- QueryOptions defaultContextualOptions()
- QueryOptions defaultNonContextualOptions()

### Class: net.luckperms.api.query.Flag
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- RESOLVE_INHERITANCE
- INCLUDE_NODES_WITHOUT_SERVER_CONTEXT
- INCLUDE_NODES_WITHOUT_WORLD_CONTEXT
- APPLY_INHERITANCE_NODES_WITHOUT_SERVER_CONTEXT
- APPLY_INHERITANCE_NODES_WITHOUT_WORLD_CONTEXT

Methods:
- **static** Flag valueOf(String name)
- **static** Flag[] values()

### Class: net.luckperms.api.query.QueryMode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CONTEXTUAL
- NON_CONTEXTUAL

Methods:
- **static** QueryMode valueOf(String name)
- **static** QueryMode[] values()

## Package: net.luckperms.api.query.dataorder

### Class: net.luckperms.api.query.dataorder.DataQueryOrderFunction
Type: Interface

Methods:
- Comparator<DataType> getOrderComparator(PermissionHolder$Identifier)
- **static** DataQueryOrderFunction always(Comparator<DataType> comparator)

### Class: net.luckperms.api.query.dataorder.DataTypeFilterFunction
Type: Interface

Methods:
- **static** DataTypeFilterFunction always(Predicate<DataType> predicate)
- Predicate<DataType> getTypeFilter(PermissionHolder$Identifier)

### Class: net.luckperms.api.query.dataorder.DataQueryOrder
Type: Enum
Extends: java.lang.Enum
Implements: java.util.Comparator

Enum Constants:
- TRANSIENT_FIRST
- TRANSIENT_LAST

Methods:
- **static** DataQueryOrder valueOf(String name)
- **static** DataQueryOrder[] values()
- **static** V queryInOrder(Comparator<DataType> comparator, Consumer<DataType> action)
- **static** List<DataType> order(Comparator<DataType> comparator)

### Class: net.luckperms.api.query.dataorder.DataTypeFilter
Type: Enum
Extends: java.lang.Enum
Implements: java.util.function.Predicate

Enum Constants:
- ALL
- NONE
- NORMAL_ONLY
- TRANSIENT_ONLY

Methods:
- **static** DataTypeFilter valueOf(String name)
- **static** DataTypeFilter[] values()
- **static** List<DataType> values(Predicate<DataType> predicate)

## Package: net.luckperms.api.query.meta

### Class: net.luckperms.api.query.meta.MetaValueSelector
Type: Interface

Methods:
- Result<String, MetaNode> selectValue(String, List<Result<String, MetaNode>>)

## Package: net.luckperms.api.track

### Class: net.luckperms.api.track.DemotionResult
Type: Interface
Implements: net.luckperms.api.util.Result

Methods:
- Optional<String> getGroupFrom()
- boolean wasSuccessful()
- DemotionResult$Status getStatus()
- Optional<String> getGroupTo()

### Class: net.luckperms.api.track.PromotionResult
Type: Interface
Implements: net.luckperms.api.util.Result

Methods:
- Optional<String> getGroupFrom()
- boolean wasSuccessful()
- PromotionResult$Status getStatus()
- Optional<String> getGroupTo()

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

### Class: net.luckperms.api.track.DemotionResult$Status
Type: Enum
Extends: java.lang.Enum
Implements: net.luckperms.api.util.Result

Enum Constants:
- SUCCESS
- REMOVED_FROM_FIRST_GROUP
- MALFORMED_TRACK
- NOT_ON_TRACK
- AMBIGUOUS_CALL
- UNDEFINED_FAILURE

Methods:
- **static** DemotionResult$Status valueOf(String name)
- **static** DemotionResult$Status[] values()
- boolean wasSuccessful()

### Class: net.luckperms.api.track.PromotionResult$Status
Type: Enum
Extends: java.lang.Enum
Implements: net.luckperms.api.util.Result

Enum Constants:
- SUCCESS
- ADDED_TO_FIRST_GROUP
- MALFORMED_TRACK
- END_OF_TRACK
- AMBIGUOUS_CALL
- UNDEFINED_FAILURE

Methods:
- **static** PromotionResult$Status valueOf(String name)
- **static** PromotionResult$Status[] values()
- boolean wasSuccessful()

## Package: net.luckperms.api.util

### Class: net.luckperms.api.util.Page
Type: Interface

Methods:
- List<TT> entries()
- int overallSize()

### Class: net.luckperms.api.util.Result
Type: Interface

Methods:
- boolean wasSuccessful()

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

