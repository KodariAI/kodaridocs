# api-5.5-20231022.200451-2 API Reference

## Package: net.luckperms.api

### Class: net.luckperms.api.LuckPerms
Type: Interface

Methods:
- GroupManager getGroupManager()
- ActionLogger getActionLogger()
- CompletableFuture runUpdateTask()
- TrackManager getTrackManager()
- NodeBuilderRegistry getNodeBuilderRegistry()
- String getServerName()
- QueryOptionsRegistry getQueryOptionsRegistry()
- UserManager getUserManager()
- ContextManager getContextManager()
- EventBus getEventBus()
- PluginMetadata getPluginMetadata()
- MetaStackFactory getMetaStackFactory()
- PlayerAdapter getPlayerAdapter(Class)
- Optional getMessagingService()
- NodeMatcherFactory getNodeMatcherFactory()
- void registerMessengerProvider(MessengerProvider)
- Health runHealthCheck()
- Platform getPlatform()

### Class: net.luckperms.api.LuckPermsProvider
Type: Class

Methods:
- LuckPerms get()

## Package: net.luckperms.api.actionlog

### Class: net.luckperms.api.actionlog.Action
Type: Interface
Implements: java.lang.Comparable

Methods:
- Target getTarget()
- Instant getTimestamp()
- Source getSource()
- Builder builder()
- String getDescription()

### Class: net.luckperms.api.actionlog.ActionLog
Type: Interface

Methods:
- SortedSet getTrackHistory(String)
- SortedSet getGroupHistory(String)
- SortedSet getContent()
- SortedSet getContent(UUID)
- SortedSet getUserHistory(UUID)

### Class: net.luckperms.api.actionlog.ActionLogger
Type: Interface

Methods:
- CompletableFuture submit(Action)
- CompletableFuture submitToStorage(Action)
- CompletableFuture getLog()
- Builder actionBuilder()
- CompletableFuture broadcastAction(Action)

## Package: net.luckperms.api.cacheddata

### Class: net.luckperms.api.cacheddata.CachedData
Type: Interface

Methods:
- QueryOptions getQueryOptions()

### Class: net.luckperms.api.cacheddata.CachedDataManager
Type: Interface

Methods:
- Container metaData()
- void invalidatePermissionCalculators()
- CachedPermissionData getPermissionData()
- CachedPermissionData getPermissionData(QueryOptions)
- Container permissionData()
- void invalidate()
- CachedMetaData getMetaData(QueryOptions)
- CachedMetaData getMetaData()

### Class: net.luckperms.api.cacheddata.CachedMetaData
Type: Interface
Implements: net.luckperms.api.cacheddata.CachedData

Methods:
- MetaStackDefinition getSuffixStackDefinition()
- SortedMap getSuffixes()
- String getPrefix()
- int getWeight()
- String getPrimaryGroup()
- Result querySuffix()
- MetaStackDefinition getPrefixStackDefinition()
- Result queryPrefix()
- Result queryWeight()
- String getSuffix()
- Map getMeta()
- SortedMap getPrefixes()
- Result queryMetaValue(String)
- String getMetaValue(String)
- Optional getMetaValue(String, Function)

### Class: net.luckperms.api.cacheddata.CachedPermissionData
Type: Interface
Implements: net.luckperms.api.cacheddata.CachedData

Methods:
- Map getPermissionMap()
- Tristate checkPermission(String)
- Result queryPermission(String)
- void invalidateCache()

### Class: net.luckperms.api.cacheddata.Result
Type: Interface

Methods:
- Object result()
- Node node()

## Package: net.luckperms.api.context

### Class: net.luckperms.api.context.Context
Type: Interface

Methods:
- boolean isValidValue(String)
- String getValue()
- String getKey()
- boolean isValidKey(String)

### Class: net.luckperms.api.context.ContextCalculator
Type: Interface

Methods:
- ContextSet estimatePotentialContexts()
- void calculate(Object, ContextConsumer)
- ContextCalculator forSingleContext(String, Function)

### Class: net.luckperms.api.context.ContextConsumer
Type: Interface

Methods:
- void accept(String, String)
- void accept(Context)
- void accept(ContextSet)

### Class: net.luckperms.api.context.ContextManager
Type: Interface

Methods:
- void unregisterCalculator(ContextCalculator)
- ImmutableContextSet getStaticContext()
- void invalidateCache(Object)
- Builder queryOptionsBuilder(QueryMode)
- QueryOptions getStaticQueryOptions()
- void registerCalculator(ContextCalculator)
- void signalContextUpdate(Object)
- ImmutableContextSet getContext(Object)
- Optional getContext(User)
- QueryOptions getQueryOptions(Object)
- Optional getQueryOptions(User)
- ContextSetFactory getContextSetFactory()

### Class: net.luckperms.api.context.ContextSet
Type: Interface
Implements: java.lang.Iterable

Methods:
- Set getValues(String)
- Optional getAnyValue(String)
- boolean containsKey(String)
- boolean isEmpty()
- boolean containsAny(String, Iterable)
- boolean isSatisfiedBy(ContextSet)
- boolean isSatisfiedBy(ContextSet, ContextSatisfyMode)
- Map toFlattenedMap()
- Set toSet()
- Iterator iterator()
- boolean contains(String, String)
- boolean contains(Context)
- int size()
- ImmutableContextSet immutableCopy()
- boolean isImmutable()
- Map toMap()
- MutableContextSet mutableCopy()

### Class: net.luckperms.api.context.ContextSetFactory
Type: Interface

Methods:
- ImmutableContextSet immutableOf(String, String)
- ImmutableContextSet immutableEmpty()
- MutableContextSet mutable()
- Builder immutableBuilder()

### Class: net.luckperms.api.context.ImmutableContextSet
Type: Interface
Implements: net.luckperms.api.context.ContextSet

Methods:
- ImmutableContextSet immutableCopy()
- ImmutableContextSet of(String, String)
- Builder builder()
- ImmutableContextSet empty()

### Class: net.luckperms.api.context.MutableContextSet
Type: Interface
Implements: net.luckperms.api.context.ContextSet

Methods:
- void add(Context)
- void add(String, String)
- void removeAll(String)
- void addAll(ContextSet)
- void addAll(Iterable)
- MutableContextSet of(String, String)
- void clear()
- MutableContextSet create()
- void remove(String, String)

### Class: net.luckperms.api.context.StaticContextCalculator
Type: Interface
Implements: net.luckperms.api.context.ContextCalculator

Methods:
- void calculate(ContextConsumer)
- void calculate(Object, ContextConsumer)
- StaticContextCalculator forSingleContext(String, Supplier)

### Class: net.luckperms.api.context.ContextSatisfyMode
Type: Enum
Extends: java.lang.Enum

Methods:
- ContextSatisfyMode valueOf(String)
- ContextSatisfyMode[] values()

### Class: net.luckperms.api.context.DefaultContextKeys
Type: Class

No public methods

## Package: net.luckperms.api.event

### Class: net.luckperms.api.event.EventBus
Type: Interface

Methods:
- Set getSubscriptions(Class)
- EventSubscription subscribe(Object, Class, Consumer)
- EventSubscription subscribe(Class, Consumer)

### Class: net.luckperms.api.event.EventSubscription
Type: Interface
Implements: java.lang.AutoCloseable

Methods:
- Class getEventClass()
- boolean isActive()
- Consumer getHandler()
- void close()

### Class: net.luckperms.api.event.LuckPermsEvent
Type: Interface

Methods:
- LuckPerms getLuckPerms()
- Class getEventType()

## Package: net.luckperms.api.event.cause

### Class: net.luckperms.api.event.cause.CreationCause
Type: Enum
Extends: java.lang.Enum

Methods:
- CreationCause valueOf(String)
- CreationCause[] values()

### Class: net.luckperms.api.event.cause.DeletionCause
Type: Enum
Extends: java.lang.Enum

Methods:
- DeletionCause valueOf(String)
- DeletionCause[] values()

## Package: net.luckperms.api.event.context

### Class: net.luckperms.api.event.context.ContextUpdateEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- Object getSubject()
- Optional getSubject(Class)

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
- Set getExistingData()
- DeletionCause getCause()

### Class: net.luckperms.api.event.group.GroupLoadAllEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

No public methods

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
- Origin getOrigin()
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
- Origin getOrigin()
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

## Package: net.luckperms.api.event.node

### Class: net.luckperms.api.event.node.NodeAddEvent
Type: Interface
Implements: net.luckperms.api.event.node.NodeMutateEvent

Methods:
- Node getNode()
- Set getDataBefore()

### Class: net.luckperms.api.event.node.NodeClearEvent
Type: Interface
Implements: net.luckperms.api.event.node.NodeMutateEvent

Methods:
- Set getNodes()
- Set getDataBefore()

### Class: net.luckperms.api.event.node.NodeMutateEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- PermissionHolder getTarget()
- DataType getDataType()
- Set getDataAfter()
- boolean isUser()
- boolean isGroup()
- Set getDataBefore()

### Class: net.luckperms.api.event.node.NodeRemoveEvent
Type: Interface
Implements: net.luckperms.api.event.node.NodeMutateEvent

Methods:
- Node getNode()
- Set getDataBefore()

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
- void setType(String)
- UUID getUniqueId()

### Class: net.luckperms.api.event.player.lookup.UniqueIdLookupEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.ResultEvent

Methods:
- void setUniqueId(UUID)
- String getUsername()

### Class: net.luckperms.api.event.player.lookup.UsernameLookupEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.ResultEvent

Methods:
- void setUsername(String)
- UUID getUniqueId()

### Class: net.luckperms.api.event.player.lookup.UsernameValidityCheckEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- void setValid(boolean)
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
- Type getType()

## Package: net.luckperms.api.event.sync

### Class: net.luckperms.api.event.sync.ConfigReloadEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

No public methods

### Class: net.luckperms.api.event.sync.PostSyncEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

No public methods

### Class: net.luckperms.api.event.sync.PreNetworkSyncEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.Cancellable

Methods:
- UUID getSyncId()

### Class: net.luckperms.api.event.sync.PreSyncEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent, net.luckperms.api.event.type.Cancellable

No public methods

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
- String getTrackName()
- List getExistingData()
- DeletionCause getCause()

### Class: net.luckperms.api.event.track.TrackLoadAllEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

No public methods

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

No public methods

### Class: net.luckperms.api.event.track.mutate.TrackMutateEvent
Type: Interface
Implements: net.luckperms.api.event.LuckPermsEvent

Methods:
- Track getTrack()
- List getStateAfter()
- List getStateBefore()

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
- boolean setCancelled(boolean)
- boolean isNotCancelled()
- AtomicBoolean cancellationState()

### Class: net.luckperms.api.event.type.ResultEvent
Type: Interface

Methods:
- AtomicReference result()
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
- Optional getGroupFrom()
- User getUser()
- TrackAction getAction()
- Optional getGroupTo()

### Class: net.luckperms.api.event.user.track.TrackAction
Type: Enum
Extends: java.lang.Enum

Methods:
- TrackAction valueOf(String)
- TrackAction[] values()

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
- Extension loadExtension(Path) throws IOException
- void loadExtension(Extension)
- Collection getLoadedExtensions()

## Package: net.luckperms.api.messaging

### Class: net.luckperms.api.messaging.MessagingService
Type: Interface

Methods:
- String getName()
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

### Class: net.luckperms.api.messenger.message.type.UpdateMessage
Type: Interface
Implements: net.luckperms.api.messenger.message.Message

No public methods

### Class: net.luckperms.api.messenger.message.type.UserUpdateMessage
Type: Interface
Implements: net.luckperms.api.messenger.message.Message

Methods:
- UUID getUserUniqueId()

## Package: net.luckperms.api.metastacking

### Class: net.luckperms.api.metastacking.DuplicateRemovalFunction
Type: Interface

Methods:
- void processDuplicates(List)

### Class: net.luckperms.api.metastacking.MetaStackDefinition
Type: Interface

Methods:
- String getStartSpacer()
- DuplicateRemovalFunction getDuplicateRemovalFunction()
- String getEndSpacer()
- List getElements()
- String getMiddleSpacer()

### Class: net.luckperms.api.metastacking.MetaStackElement
Type: Interface

Methods:
- boolean shouldAccumulate(ChatMetaType, ChatMetaNode, ChatMetaNode)

### Class: net.luckperms.api.metastacking.MetaStackFactory
Type: Interface

Methods:
- List fromStrings(List)
- MetaStackDefinition createDefinition(List, DuplicateRemovalFunction, String, String, String)
- Optional fromString(String)

## Package: net.luckperms.api.model

### Class: net.luckperms.api.model.PermissionHolder
Type: Interface

Methods:
- Collection resolveInheritedNodes(QueryOptions)
- Collection resolveInheritedNodes(NodeType, QueryOptions)
- NodeMap transientData()
- Collection getNodes(NodeType)
- Collection getNodes()
- SortedSet getDistinctNodes()
- NodeMap data()
- Identifier getIdentifier()
- Collection getInheritedGroups(QueryOptions)
- String getFriendlyName()
- void auditTemporaryNodes()
- SortedSet resolveDistinctInheritedNodes(QueryOptions)
- QueryOptions getQueryOptions()
- NodeMap getData(DataType)
- CachedDataManager getCachedData()

### Class: net.luckperms.api.model.PlayerSaveResult
Type: Interface

Methods:
- Set getOutcomes()
- boolean includes(Outcome)
- Set getOtherUniqueIds()
- String getPreviousUsername()

## Package: net.luckperms.api.model.data

### Class: net.luckperms.api.model.data.NodeMap
Type: Interface

Methods:
- WithMergedNode add(Node, TemporaryNodeMergeStrategy)
- DataMutateResult add(Node)
- Tristate contains(Node, NodeEqualityPredicate)
- Collection toCollection()
- Map toMap()
- void clear(ContextSet, Predicate)
- void clear()
- void clear(Predicate)
- void clear(ContextSet)
- DataMutateResult remove(Node)

### Class: net.luckperms.api.model.data.DataMutateResult
Type: Enum
Extends: java.lang.Enum
Implements: net.luckperms.api.util.Result

Methods:
- DataMutateResult valueOf(String)
- DataMutateResult[] values()
- boolean wasSuccessful()

### Class: net.luckperms.api.model.data.DataType
Type: Enum
Extends: java.lang.Enum

Methods:
- DataType valueOf(String)
- DataType[] values()

### Class: net.luckperms.api.model.data.TemporaryNodeMergeStrategy
Type: Enum
Extends: java.lang.Enum

Methods:
- TemporaryNodeMergeStrategy valueOf(String)
- TemporaryNodeMergeStrategy[] values()

## Package: net.luckperms.api.model.group

### Class: net.luckperms.api.model.group.Group
Type: Interface
Implements: net.luckperms.api.model.PermissionHolder

Methods:
- String getName()
- String getDisplayName(QueryOptions)
- String getDisplayName()
- OptionalInt getWeight()

### Class: net.luckperms.api.model.group.GroupManager
Type: Interface

Methods:
- CompletableFuture saveGroup(Group)
- CompletableFuture searchAll(NodeMatcher)
- CompletableFuture getWithPermission(String)
- CompletableFuture modifyGroup(String, Consumer)
- CompletableFuture loadAllGroups()
- Group getGroup(String)
- CompletableFuture loadGroup(String)
- Set getLoadedGroups()
- CompletableFuture deleteGroup(Group)
- CompletableFuture createAndLoadGroup(String)
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
- CompletableFuture searchAll(NodeMatcher)
- CompletableFuture getWithPermission(String)
- User getUser(String)
- User getUser(UUID)
- Set getLoadedUsers()
- CompletableFuture deletePlayerData(UUID)
- CompletableFuture lookupUniqueId(String)
- void cleanupUser(User)
- boolean isLoaded(UUID)
- CompletableFuture modifyUser(UUID, Consumer)
- CompletableFuture savePlayerData(UUID, String)
- CompletableFuture lookupUsername(UUID)
- CompletableFuture loadUser(UUID)
- CompletableFuture loadUser(UUID, String)
- CompletableFuture getUniqueUsers()
- CompletableFuture saveUser(User)

## Package: net.luckperms.api.node

### Class: net.luckperms.api.node.HeldNode
Type: Interface

Methods:
- Node getNode()
- Object getHolder()

### Class: net.luckperms.api.node.Node
Type: Interface

Methods:
- NodeBuilder toBuilder()
- String getKey()
- Object metadata(NodeMetadataKey) throws IllegalStateException
- Optional getMetadata(NodeMetadataKey)
- boolean isNegated()
- Duration getExpiryDuration()
- Instant getExpiry()
- boolean hasExpired()
- boolean getValue()
- ImmutableContextSet getContexts()
- boolean hasExpiry()
- NodeType getType()
- boolean equals(Node, NodeEqualityPredicate)
- boolean equals(Object)
- NodeBuilder builder(String)
- Collection resolveShorthand()

### Class: net.luckperms.api.node.NodeBuilder
Type: Interface

Methods:
- NodeBuilder negated(boolean)
- NodeBuilder clearExpiry()
- NodeBuilder withContext(String, String)
- NodeBuilder withContext(ContextSet)
- ScopedNode build()
- NodeBuilder withMetadata(NodeMetadataKey, Object)
- NodeBuilder context(ContextSet)
- NodeBuilder expiry(TemporalAccessor)
- NodeBuilder expiry(TemporalAmount)
- NodeBuilder expiry(long, TimeUnit)
- NodeBuilder expiry(long)
- NodeBuilder value(boolean)

### Class: net.luckperms.api.node.NodeBuilderRegistry
Type: Interface

Methods:
- Builder forWeight()
- Builder forPermission()
- Builder forRegexPermission()
- Builder forSuffix()
- Builder forInheritance()
- NodeBuilder forKey(String)
- Builder forDisplayName()
- Builder forPrefix()
- Builder forMeta()

### Class: net.luckperms.api.node.NodeEqualityPredicate
Type: Interface

Methods:
- boolean areEqual(Node, Node)
- Predicate equalTo(Node)

### Class: net.luckperms.api.node.NodeType
Type: Interface

Methods:
- Predicate predicate()
- Predicate predicate(Predicate)
- Node cast(Node)
- String name()
- boolean matches(Node)
- Optional tryCast(Node)

### Class: net.luckperms.api.node.ScopedNode
Type: Interface
Implements: net.luckperms.api.node.Node

Methods:
- NodeBuilder toBuilder()
- NodeType getType()

### Class: net.luckperms.api.node.ChatMetaType
Type: Enum
Extends: java.lang.Enum

Methods:
- ChatMetaType valueOf(String)
- ChatMetaType[] values()
- Builder builder(String, int)
- Builder builder()
- String toString()
- NodeType nodeType()

## Package: net.luckperms.api.node.matcher

### Class: net.luckperms.api.node.matcher.NodeMatcher
Type: Interface
Implements: java.util.function.Predicate

Methods:
- boolean test(Object)
- boolean test(Node)
- NodeMatcher equals(Node, NodeEqualityPredicate)
- NodeMatcher metaKey(String)
- NodeMatcher metaKey(MetaNode)
- NodeMatcher keyStartsWith(String)
- NodeMatcher type(NodeType)
- NodeMatcher key(String)
- NodeMatcher key(Node)

### Class: net.luckperms.api.node.matcher.NodeMatcherFactory
Type: Interface

Methods:
- NodeMatcher equals(Node, NodeEqualityPredicate)
- NodeMatcher metaKey(String)
- NodeMatcher keyStartsWith(String)
- NodeMatcher type(NodeType)
- NodeMatcher key(String)
- NodeMatcher key(Node)

## Package: net.luckperms.api.node.metadata

### Class: net.luckperms.api.node.metadata.NodeMetadataKey
Type: Interface

Methods:
- NodeMetadataKey of(String, Class)
- String name()
- Class type()

## Package: net.luckperms.api.node.metadata.types

### Class: net.luckperms.api.node.metadata.types.InheritanceOriginMetadata
Type: Interface

Methods:
- Identifier getOrigin()
- boolean wasInherited(Identifier)
- DataType getDataType()

## Package: net.luckperms.api.node.types

### Class: net.luckperms.api.node.types.ChatMetaNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- ChatMetaType getMetaType()
- int getPriority()
- String getMetaValue()

### Class: net.luckperms.api.node.types.DisplayNameNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- NodeType getType()
- String getDisplayName()
- Builder builder(String)
- Builder builder()

### Class: net.luckperms.api.node.types.InheritanceNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- String getGroupName()
- NodeType getType()
- Builder builder(String)
- Builder builder(Group)
- Builder builder()

### Class: net.luckperms.api.node.types.MetaNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- NodeType getType()
- Builder builder(String, String)
- Builder builder()
- String getMetaKey()
- String getMetaValue()

### Class: net.luckperms.api.node.types.PermissionNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- String getPermission()
- NodeType getType()
- OptionalInt getWildcardLevel()
- boolean isWildcard()
- Builder builder(String)
- Builder builder()

### Class: net.luckperms.api.node.types.PrefixNode
Type: Interface
Implements: net.luckperms.api.node.types.ChatMetaNode

Methods:
- NodeType getType()
- Builder builder()
- Builder builder(String, int)

### Class: net.luckperms.api.node.types.RegexPermissionNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- String getPatternString()
- NodeType getType()
- Builder builder(String)
- Builder builder(Pattern)
- Builder builder()
- Optional getPattern()

### Class: net.luckperms.api.node.types.SuffixNode
Type: Interface
Implements: net.luckperms.api.node.types.ChatMetaNode

Methods:
- NodeType getType()
- Builder builder()
- Builder builder(String, int)

### Class: net.luckperms.api.node.types.WeightNode
Type: Interface
Implements: net.luckperms.api.node.ScopedNode

Methods:
- NodeType getType()
- int getWeight()
- Builder builder(int)
- Builder builder()

## Package: net.luckperms.api.platform

### Class: net.luckperms.api.platform.Health
Type: Interface

Methods:
- Map getDetails()
- boolean isHealthy()

### Class: net.luckperms.api.platform.Platform
Type: Interface

Methods:
- Type getType()
- Set getUniqueConnections()
- Instant getStartTime()
- Collection getKnownPermissions()

### Class: net.luckperms.api.platform.PlatformEntity
Type: Interface

Methods:
- String getName()
- Type getType()
- UUID getUniqueId()

### Class: net.luckperms.api.platform.PlayerAdapter
Type: Interface

Methods:
- User getUser(Object)
- CachedPermissionData getPermissionData(Object)
- CachedMetaData getMetaData(Object)
- ImmutableContextSet getContext(Object)
- QueryOptions getQueryOptions(Object)

### Class: net.luckperms.api.platform.PluginMetadata
Type: Interface

Methods:
- String getVersion()
- String getApiVersion()

## Package: net.luckperms.api.query

### Class: net.luckperms.api.query.OptionKey
Type: Interface

Methods:
- OptionKey of(String, Class)
- String name()
- Class type()

### Class: net.luckperms.api.query.QueryOptions
Type: Interface

Methods:
- QueryMode mode()
- QueryOptions contextual(ContextSet, Set)
- QueryOptions contextual(ContextSet)
- Builder toBuilder()
- QueryOptions defaultContextualOptions()
- QueryOptions nonContextual()
- QueryOptions nonContextual(Set)
- boolean flag(Flag)
- boolean satisfies(ContextSet, ContextSatisfyMode)
- boolean satisfies(ContextSet)
- Map options()
- Set flags()
- ImmutableContextSet context()
- Builder builder(QueryMode)
- Optional option(OptionKey)

### Class: net.luckperms.api.query.QueryOptionsRegistry
Type: Interface

Methods:
- QueryOptions defaultContextualOptions()
- QueryOptions defaultNonContextualOptions()

### Class: net.luckperms.api.query.Flag
Type: Enum
Extends: java.lang.Enum

Methods:
- Flag valueOf(String)
- Flag[] values()

### Class: net.luckperms.api.query.QueryMode
Type: Enum
Extends: java.lang.Enum

Methods:
- QueryMode valueOf(String)
- QueryMode[] values()

## Package: net.luckperms.api.query.dataorder

### Class: net.luckperms.api.query.dataorder.DataQueryOrderFunction
Type: Interface

Methods:
- Comparator getOrderComparator(Identifier)
- DataQueryOrderFunction always(Comparator)

### Class: net.luckperms.api.query.dataorder.DataTypeFilterFunction
Type: Interface

Methods:
- DataTypeFilterFunction always(Predicate)
- Predicate getTypeFilter(Identifier)

### Class: net.luckperms.api.query.dataorder.DataQueryOrder
Type: Enum
Extends: java.lang.Enum
Implements: java.util.Comparator

Methods:
- DataQueryOrder valueOf(String)
- DataQueryOrder[] values()
- void queryInOrder(Comparator, Consumer)
- List order(Comparator)

### Class: net.luckperms.api.query.dataorder.DataTypeFilter
Type: Enum
Extends: java.lang.Enum
Implements: java.util.function.Predicate

Methods:
- DataTypeFilter valueOf(String)
- DataTypeFilter[] values()
- List values(Predicate)

## Package: net.luckperms.api.query.meta

### Class: net.luckperms.api.query.meta.MetaValueSelector
Type: Interface

Methods:
- Result selectValue(String, List)

## Package: net.luckperms.api.track

### Class: net.luckperms.api.track.DemotionResult
Type: Interface
Implements: net.luckperms.api.util.Result

Methods:
- Optional getGroupFrom()
- boolean wasSuccessful()
- Status getStatus()
- Optional getGroupTo()

### Class: net.luckperms.api.track.PromotionResult
Type: Interface
Implements: net.luckperms.api.util.Result

Methods:
- Optional getGroupFrom()
- boolean wasSuccessful()
- Status getStatus()
- Optional getGroupTo()

### Class: net.luckperms.api.track.Track
Type: Interface

Methods:
- String getPrevious(Group)
- boolean containsGroup(Group)
- boolean containsGroup(String)
- PromotionResult promote(User, ContextSet)
- DataMutateResult insertGroup(Group, int) throws IndexOutOfBoundsException
- String getName()
- DemotionResult demote(User, ContextSet)
- DataMutateResult appendGroup(Group)
- DataMutateResult removeGroup(String)
- DataMutateResult removeGroup(Group)
- void clearGroups()
- String getNext(Group)
- List getGroups()

### Class: net.luckperms.api.track.TrackManager
Type: Interface

Methods:
- Track getTrack(String)
- CompletableFuture loadTrack(String)
- CompletableFuture saveTrack(Track)
- CompletableFuture loadAllTracks()
- CompletableFuture createAndLoadTrack(String)
- CompletableFuture deleteTrack(Track)
- boolean isLoaded(String)
- Set getLoadedTracks()

## Package: net.luckperms.api.util

### Class: net.luckperms.api.util.Result
Type: Interface

Methods:
- boolean wasSuccessful()

### Class: net.luckperms.api.util.Tristate
Type: Enum
Extends: java.lang.Enum

Methods:
- Tristate valueOf(String)
- Tristate[] values()
- Tristate of(boolean)
- Tristate of(Boolean)
- boolean asBoolean()
