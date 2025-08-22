# packetevents-spigot-2.9.4 API Reference

## Package: com.github.retrooper.packetevents

### Class: com.github.retrooper.packetevents.PacketEvents
Type: Class

Methods:
- **static** void setAPI(PacketEventsAPI)
- **static** PacketEventsAPI getAPI()

### Class: com.github.retrooper.packetevents.PacketEventsAPI
Type: Abstract Class

Methods:
- PEVersion getVersion()
- void init()
- UpdateChecker getUpdateChecker()
- boolean isTerminated()
- PacketEventsSettings getSettings()
- ChannelInjector getInjector()
- boolean isInitialized()
- Logger getLogger()
- boolean isLoaded()
- ProtocolManager getProtocolManager()
- void load()
- Object getPlugin()
- EventManager getEventManager()
- NettyManager getNettyManager()
- void terminate()
- LogManager getLogManager()
- PlayerManager getPlayerManager()
- ServerManager getServerManager()

## Package: com.github.retrooper.packetevents.annotations

### Class: com.github.retrooper.packetevents.annotations.RuntimeObsolete
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String reason()
- String since()

## Package: com.github.retrooper.packetevents.event

### Class: com.github.retrooper.packetevents.event.CallableEvent
Type: Interface

Methods:
- void call(PacketListenerCommon)

### Class: com.github.retrooper.packetevents.event.CancellableEvent
Type: Interface

Methods:
- boolean isCancelled()
- void setCancelled(boolean)

### Class: com.github.retrooper.packetevents.event.PacketHandler
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.github.retrooper.packetevents.event.PacketListener
Type: Interface

Methods:
- void onPacketSend(PacketSendEvent)
- void onPacketEventExternal(PacketEvent)
- PacketListenerAbstract asAbstract(PacketListenerPriority)
- void onUserConnect(UserConnectEvent)
- void onUserDisconnect(UserDisconnectEvent)
- void onUserLogin(UserLoginEvent)
- void onPacketReceive(PacketReceiveEvent)

### Class: com.github.retrooper.packetevents.event.PlayerEvent
Type: Interface

Methods:
- Object getPlayer()

### Class: com.github.retrooper.packetevents.event.UserEvent
Type: Interface

Methods:
- User getUser()

### Class: com.github.retrooper.packetevents.event.EventManager
Type: Class

Methods:
- void unregisterListener(PacketListenerCommon)
- PacketListenerCommon[] registerListeners(PacketListenerCommon[])
- void callEvent(PacketEvent)
- void callEvent(PacketEvent, Runnable)
- void unregisterListeners(PacketListenerCommon[])
- void unregisterAllListeners()
- PacketListenerCommon registerListener(PacketListener, PacketListenerPriority)
- PacketListenerCommon registerListener(PacketListenerCommon)

### Class: com.github.retrooper.packetevents.event.PacketEvent
Type: Abstract Class
Implements: com.github.retrooper.packetevents.event.CallableEvent

Methods:
- long getTimestamp()
- void callPacketEventExternal(PacketListenerCommon)

### Class: com.github.retrooper.packetevents.event.PacketListenerAbstract
Type: Abstract Class
Extends: com.github.retrooper.packetevents.event.PacketListenerCommon

Methods:
- void onPacketSend(PacketSendEvent)
- void onPacketReceive(PacketReceiveEvent)

### Class: com.github.retrooper.packetevents.event.PacketListenerCommon
Type: Abstract Class

Methods:
- void onPacketEventExternal(PacketEvent)
- void onUserConnect(UserConnectEvent)
- void onUserDisconnect(UserDisconnectEvent)
- void onUserLogin(UserLoginEvent)
- PacketListenerPriority getPriority()

### Class: com.github.retrooper.packetevents.event.PacketListenerPriority
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PacketListenerPriority getById(byte)
- **static** PacketListenerPriority valueOf(String)
- **static** PacketListenerPriority[] values()
- byte getId()

### Class: com.github.retrooper.packetevents.event.PacketReceiveEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.ProtocolPacketEvent

Methods:
- void call(PacketListenerCommon)
- PacketReceiveEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException

### Class: com.github.retrooper.packetevents.event.PacketSendEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.ProtocolPacketEvent

Methods:
- void call(PacketListenerCommon)
- boolean hasTasksAfterSend()
- PacketSendEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- List getTasksAfterSend()

### Class: com.github.retrooper.packetevents.event.ProtocolPacketEvent
Type: Abstract Class
Extends: com.github.retrooper.packetevents.event.PacketEvent
Implements: com.github.retrooper.packetevents.event.PlayerEvent, com.github.retrooper.packetevents.event.CancellableEvent, com.github.retrooper.packetevents.event.UserEvent

Methods:
- Object getPlayer()
- User getUser()
- ConnectionState getConnectionState()
- void cleanUp()
- Object getChannel()
- boolean hasPostTasks()
- SocketAddress getAddress()
- boolean needsReEncode()
- PacketTypeCommon getPacketType()
- void markForReEncode(boolean)
- boolean isClone()
- void setServerVersion(ServerVersion)
- Object getFullBufferClone()
- PacketWrapper getLastUsedWrapper()
- boolean isCancelled()
- int getPacketId()
- void setByteBuf(Object)
- void setCancelled(boolean)
- ServerVersion getServerVersion()
- String getPacketName()
- void setPlayer(Object)
- Object getByteBuf()
- void setClientVersion(ClientVersion)
- List getPostTasks()
- InetSocketAddress getSocketAddress()
- ClientVersion getClientVersion()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- void setLastUsedWrapper(PacketWrapper)

### Class: com.github.retrooper.packetevents.event.SimplePacketListenerAbstract
Type: Abstract Class
Extends: com.github.retrooper.packetevents.event.PacketListenerCommon

Methods:
- void onPacketStatusSend(PacketStatusSendEvent)
- void onPacketConfigReceive(PacketConfigReceiveEvent)
- void onPacketPlaySend(PacketPlaySendEvent)
- void onPacketLoginReceive(PacketLoginReceiveEvent)
- void onPacketStatusReceive(PacketStatusReceiveEvent)
- void onPacketConfigSend(PacketConfigSendEvent)
- void onPacketHandshakeReceive(PacketHandshakeReceiveEvent)
- void onPacketPlayReceive(PacketPlayReceiveEvent)
- void onPacketLoginSend(PacketLoginSendEvent)

### Class: com.github.retrooper.packetevents.event.UserConnectEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketEvent
Implements: com.github.retrooper.packetevents.event.CancellableEvent, com.github.retrooper.packetevents.event.UserEvent

Methods:
- void call(PacketListenerCommon)
- boolean isCancelled()
- void setCancelled(boolean)
- User getUser()

### Class: com.github.retrooper.packetevents.event.UserDisconnectEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketEvent
Implements: com.github.retrooper.packetevents.event.UserEvent

Methods:
- void call(PacketListenerCommon)
- User getUser()

### Class: com.github.retrooper.packetevents.event.UserLoginEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketEvent
Implements: com.github.retrooper.packetevents.event.CallableEvent, com.github.retrooper.packetevents.event.UserEvent, com.github.retrooper.packetevents.event.PlayerEvent

Methods:
- void call(PacketListenerCommon)
- Object getPlayer()
- User getUser()

## Package: com.github.retrooper.packetevents.event.simple

### Class: com.github.retrooper.packetevents.event.simple.PacketConfigReceiveEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketReceiveEvent

Methods:
- PacketConfigReceiveEvent clone()
- PacketReceiveEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- PacketType$Configuration$Client getPacketType()
- PacketTypeCommon getPacketType()

### Class: com.github.retrooper.packetevents.event.simple.PacketConfigSendEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketSendEvent

Methods:
- PacketConfigSendEvent clone()
- PacketSendEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- PacketType$Configuration$Server getPacketType()
- PacketTypeCommon getPacketType()

### Class: com.github.retrooper.packetevents.event.simple.PacketHandshakeReceiveEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketReceiveEvent

Methods:
- PacketHandshakeReceiveEvent clone()
- PacketReceiveEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- PacketType$Handshaking$Client getPacketType()
- PacketTypeCommon getPacketType()

### Class: com.github.retrooper.packetevents.event.simple.PacketHandshakeSendEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketSendEvent

Methods:
- PacketHandshakeSendEvent clone()
- PacketSendEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- PacketType$Handshaking$Client getPacketType()
- PacketTypeCommon getPacketType()

### Class: com.github.retrooper.packetevents.event.simple.PacketLoginReceiveEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketReceiveEvent

Methods:
- PacketLoginReceiveEvent clone()
- PacketReceiveEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- PacketType$Login$Client getPacketType()
- PacketTypeCommon getPacketType()

### Class: com.github.retrooper.packetevents.event.simple.PacketLoginSendEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketSendEvent

Methods:
- PacketLoginSendEvent clone()
- PacketSendEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- PacketType$Login$Server getPacketType()
- PacketTypeCommon getPacketType()

### Class: com.github.retrooper.packetevents.event.simple.PacketPlayReceiveEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketReceiveEvent

Methods:
- PacketPlayReceiveEvent clone()
- PacketReceiveEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- PacketType$Play$Client getPacketType()
- PacketTypeCommon getPacketType()

### Class: com.github.retrooper.packetevents.event.simple.PacketPlaySendEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketSendEvent

Methods:
- PacketPlaySendEvent clone()
- PacketSendEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- PacketType$Play$Server getPacketType()
- PacketTypeCommon getPacketType()

### Class: com.github.retrooper.packetevents.event.simple.PacketStatusReceiveEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketReceiveEvent

Methods:
- PacketStatusReceiveEvent clone()
- PacketReceiveEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- PacketType$Status$Client getPacketType()
- PacketTypeCommon getPacketType()

### Class: com.github.retrooper.packetevents.event.simple.PacketStatusSendEvent
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketSendEvent

Methods:
- PacketStatusSendEvent clone()
- PacketSendEvent clone()
- ProtocolPacketEvent clone()
- Object clone() throws CloneNotSupportedException
- PacketType$Status$Server getPacketType()
- PacketTypeCommon getPacketType()

## Package: com.github.retrooper.packetevents.exception

### Class: com.github.retrooper.packetevents.exception.CancelPacketException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- Throwable fillInStackTrace()

### Class: com.github.retrooper.packetevents.exception.InvalidDisconnectPacketSend
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: com.github.retrooper.packetevents.exception.InvalidHandshakeException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: com.github.retrooper.packetevents.exception.PacketProcessException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: com.github.retrooper.packetevents.injector

### Class: com.github.retrooper.packetevents.injector.ChannelInjector
Type: Interface

Methods:
- boolean isPlayerSet(Object)
- boolean isServerBound()
- PacketSide getPacketSide()
- void setPlayer(Object, Object)
- void updateUser(Object, User)
- void uninject()
- boolean isProxy()
- void inject()

## Package: com.github.retrooper.packetevents.manager

### Class: com.github.retrooper.packetevents.manager.InternalPacketListener
Type: Class
Extends: com.github.retrooper.packetevents.event.PacketListenerAbstract

Methods:
- void onPacketSend(PacketSendEvent)
- void onPacketReceive(PacketReceiveEvent)

## Package: com.github.retrooper.packetevents.manager.player

### Class: com.github.retrooper.packetevents.manager.player.PlayerManager
Type: Interface

Methods:
- Object getChannel(Object)
- ClientVersion getClientVersion(Object)
- void receivePacketSilently(Object, Object)
- void receivePacketSilently(Object, PacketWrapper)
- void sendPacket(Object, Object)
- void sendPacket(Object, PacketWrapper)
- User getUser(Object)
- void sendPacketSilently(Object, Object)
- void sendPacketSilently(Object, PacketWrapper)
- ConnectionState getConnectionState(Object) throws IllegalStateException
- int getPing(Object)
- void writePacket(Object, Object)
- void writePacket(Object, PacketWrapper)
- void writePacketSilently(Object, Object)
- void writePacketSilently(Object, PacketWrapper)
- void receivePacket(Object, Object)
- void receivePacket(Object, PacketWrapper)

## Package: com.github.retrooper.packetevents.manager.protocol

### Class: com.github.retrooper.packetevents.manager.protocol.ProtocolManager
Type: Interface

Methods:
- User getUser(Object)
- void sendPacket(Object, Object)
- void sendPacket(Object, PacketWrapper)
- void receivePackets(Object, Object[])
- void setChannel(UUID, Object)
- void writePackets(Object, Object[])
- void sendPacketsSilently(Object, Object[])
- void removeChannel(Object)
- User removeUser(Object)
- Object getChannel(UUID)
- Collection getUsers()
- void receivePacketSilently(Object, Object)
- void receivePacketSilently(Object, PacketWrapper)
- void sendPacketSilently(Object, Object)
- void sendPacketSilently(Object, PacketWrapper)
- void setUser(Object, User)
- void receivePacket(Object, Object)
- void receivePacket(Object, PacketWrapper)
- boolean hasChannel(Object)
- void removeChannelById(UUID)
- void receivePacketsSilently(Object, Object[])
- void sendPackets(Object, Object[])
- void setClientVersion(Object, ClientVersion)
- ClientVersion getClientVersion(Object)
- void writePacketsSilently(Object, Object[])
- Collection getChannels()
- ProtocolVersion getPlatformVersion()
- void writePacket(Object, Object)
- void writePacket(Object, PacketWrapper)
- void writePacketSilently(Object, Object)
- void writePacketSilently(Object, PacketWrapper)
- Object[] transformWrappers(PacketWrapper, Object, boolean)

## Package: com.github.retrooper.packetevents.manager.server

### Class: com.github.retrooper.packetevents.manager.server.ServerManager
Type: Interface

Methods:
- ServerVersion getVersion()
- SystemOS getOS()
- Object getRegistryCacheKey(User, ClientVersion)

### Class: com.github.retrooper.packetevents.manager.server.ServerVersion
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean isOlderThanOrEquals(ServerVersion)
- ClientVersion toClientVersion()
- **static** ServerVersion valueOf(String)
- **static** ServerVersion[] values()
- boolean isNewerThanOrEquals(ServerVersion)
- boolean is(VersionComparison, ServerVersion)
- boolean isNewerThan(ServerVersion)
- **static** ServerVersion[] reversedValues()
- int getProtocolVersion()
- **static** ServerVersion getLatest()
- boolean isOlderThan(ServerVersion)
- **static** ServerVersion getOldest()
- **static** ServerVersion getById(int)
- String getReleaseName()

### Class: com.github.retrooper.packetevents.manager.server.SystemOS
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** SystemOS getOS()
- **static** SystemOS valueOf(String)
- **static** SystemOS[] values()
- **static** SystemOS getOSNoCache()

### Class: com.github.retrooper.packetevents.manager.server.VersionComparison
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** VersionComparison valueOf(String)
- **static** VersionComparison[] values()

## Package: com.github.retrooper.packetevents.netty

### Class: com.github.retrooper.packetevents.netty.NettyManager
Type: Interface

Methods:
- ByteBufOperator getByteBufOperator()
- ChannelOperator getChannelOperator()
- ByteBufAllocationOperator getByteBufAllocationOperator()

## Package: com.github.retrooper.packetevents.netty.buffer

### Class: com.github.retrooper.packetevents.netty.buffer.ByteBufAllocationOperator
Type: Interface

Methods:
- Object copiedBuffer(byte[])
- Object directBuffer()
- Object directBuffer(int)
- Object emptyBuffer()
- Object wrappedBuffer(byte[])
- Object compositeBuffer()
- Object compositeBuffer(int)
- Object buffer()
- Object buffer(int)

### Class: com.github.retrooper.packetevents.netty.buffer.ByteBufOperator
Type: Interface

Methods:
- Object markReaderIndex(Object)
- int readerIndex(Object)
- Object readerIndex(Object, int)
- boolean release(Object)
- Object retain(Object)
- void writeFloat(Object, float)
- Object resetReaderIndex(Object)
- char readChar(Object)
- Object getBytes(Object, int, byte[])
- int capacity(Object)
- Object capacity(Object, int)
- int refCnt(Object)
- void writeLong(Object, long)
- byte[] array(Object)
- double readDouble(Object)
- float readFloat(Object)
- Object copy(Object)
- int readInt(Object)
- short readUnsignedByte(Object)
- void writeDouble(Object, double)
- void writeInt(Object, int)
- boolean hasArray(Object)
- void writeMedium(Object, int)
- void writeByte(Object, int)
- Object resetWriterIndex(Object)
- int writableBytes(Object)
- int readableBytes(Object)
- Object clear(Object)
- Object readSlice(Object, int)
- Object duplicate(Object)
- short getUnsignedByte(Object, int)
- int writerIndex(Object)
- Object writerIndex(Object, int)
- Object allocateNewBuffer(Object)
- Object skipBytes(Object, int)
- long readUnsignedInt(Object)
- void writeChar(Object, int)
- Object retainedDuplicate(Object)
- Object writeBytes(Object, Object)
- Object writeBytes(Object, byte[])
- Object writeBytes(Object, byte[], int, int)
- int readMedium(Object)
- long readLong(Object)
- short readShort(Object)
- Object markWriterIndex(Object)
- Object readBytes(Object, byte[], int, int)
- Object readBytes(Object, int)
- void readBytes(Object, byte[])
- boolean readBoolean(Object)
- String toString(Object, int, int, Charset)
- void writeShort(Object, int)
- byte readByte(Object)
- boolean isReadable(Object)
- void writeBoolean(Object, boolean)
- int readUnsignedShort(Object)

### Class: com.github.retrooper.packetevents.netty.buffer.ByteBufHelper
Type: Class

Methods:
- **static** Object markReaderIndex(Object)
- **static** int readerIndex(Object)
- **static** Object readerIndex(Object, int)
- **static** boolean release(Object)
- **static** Object resetReaderIndex(Object)
- **static** void writeFloat(Object, float)
- **static** Object getBytes(Object, int, byte[])
- **static** int refCnt(Object)
- **static** int getByteSize(int)
- **static** int readInt(Object)
- **static** void writeMedium(Object, int)
- **static** void writeByte(Object, int)
- **static** Object resetWriterIndex(Object)
- **static** int writableBytes(Object)
- **static** Object duplicate(Object)
- **static** int writerIndex(Object)
- **static** Object writerIndex(Object, int)
- **static** long readUnsignedInt(Object)
- **static** Object retainedDuplicate(Object)
- **static** Object writeBytes(Object, Object)
- **static** void writeBytes(Object, byte[])
- **static** void writeBytes(Object, byte[], int, int)
- **static** int readMedium(Object)
- **static** void writeVarInt(Object, int)
- **static** Object markWriterIndex(Object)
- **static** void writeShort(Object, int)
- **static** boolean isReadable(Object)
- **static** int readUnsignedShort(Object)
- **static** void writeBoolean(Object, boolean)
- **static** int readVarInt(Object)
- **static** Object retain(Object)
- **static** char readChar(Object)
- **static** int capacity(Object)
- **static** Object capacity(Object, int)
- **static** void writeLong(Object, long)
- **static** byte[] array(Object)
- **static** double readDouble(Object)
- **static** float readFloat(Object)
- **static** Object copy(Object)
- **static** short readUnsignedByte(Object)
- **static** byte[] copyBytes(Object)
- **static** void writeDouble(Object, double)
- **static** void writeInt(Object, int)
- **static** boolean hasArray(Object)
- **static** int readableBytes(Object)
- **static** Object clear(Object)
- **static** Object readSlice(Object, int)
- **static** short getUnsignedByte(Object, int)
- **static** Object allocateNewBuffer(Object)
- **static** Object skipBytes(Object, int)
- **static** void writeChar(Object, int)
- **static** long readLong(Object)
- **static** short readShort(Object)
- **static** Object readBytes(Object, byte[], int, int)
- **static** Object readBytes(Object, int)
- **static** void readBytes(Object, byte[])
- **static** boolean readBoolean(Object)
- **static** String toString(Object, int, int, Charset)
- **static** byte readByte(Object)

### Class: com.github.retrooper.packetevents.netty.buffer.ByteBufInputStream
Type: Class
Extends: java.io.InputStream
Implements: java.io.DataInput

Methods:
- int read() throws IOException
- int read(byte[], int, int) throws IOException
- boolean markSupported()
- int available() throws IOException
- long skip(long) throws IOException
- String readLine() throws IOException
- char readChar() throws IOException
- int skipBytes(int) throws IOException
- String readUTF() throws IOException
- long readLong() throws IOException
- short readShort() throws IOException
- long[] readLongs(int) throws IOException
- void readFully(byte[]) throws IOException
- void readFully(byte[], int, int) throws IOException
- double readDouble() throws IOException
- float readFloat() throws IOException
- void reset() throws IOException
- int readBytes()
- byte[] readBytes(int)
- boolean readBoolean() throws IOException
- int readInt() throws IOException
- byte readByte() throws IOException
- int readUnsignedByte() throws IOException
- void close() throws IOException
- int readUnsignedShort() throws IOException
- void mark(int)

### Class: com.github.retrooper.packetevents.netty.buffer.ByteBufOutputStream
Type: Class
Extends: java.io.OutputStream
Implements: java.io.DataOutput

Methods:
- void writeInt(int) throws IOException
- void writeByte(int) throws IOException
- void writeFloat(float) throws IOException
- int writtenBytes()
- void writeChar(int) throws IOException
- void writeLong(long) throws IOException
- void writeBytes(String) throws IOException
- void writeUTF(String) throws IOException
- void writeShort(int) throws IOException
- Object buffer()
- void writeChars(String) throws IOException
- void write(byte[], int, int) throws IOException
- void write(byte[]) throws IOException
- void write(int) throws IOException
- void writeBoolean(boolean) throws IOException
- void writeDouble(double) throws IOException

### Class: com.github.retrooper.packetevents.netty.buffer.UnpooledByteBufAllocationHelper
Type: Class

Methods:
- **static** Object copiedBuffer(byte[])
- **static** Object directBuffer()
- **static** Object directBuffer(int)
- **static** Object emptyBuffer()
- **static** Object wrappedBuffer(byte[])
- **static** Object compositeBuffer()
- **static** Object compositeBuffer(int)
- **static** Object buffer()
- **static** Object buffer(int)

## Package: com.github.retrooper.packetevents.netty.channel

### Class: com.github.retrooper.packetevents.netty.channel.ChannelOperator
Type: Interface

Methods:
- void runInEventLoop(Object, Runnable)
- Object pooledByteBuf(Object)
- List pipelineHandlerNames(Object)
- Object getPipelineHandler(Object, String)
- Object writeAndFlushInContext(Object, String, Object)
- Object writeAndFlush(Object, Object)
- Object fireChannelRead(Object, Object)
- boolean isOpen(Object)
- Object getPipeline(Object)
- Object flush(Object)
- Object writeInContext(Object, String, Object)
- SocketAddress localAddress(Object)
- Object fireChannelReadInContext(Object, String, Object)
- Object flushInContext(Object, String)
- Object getPipelineContext(Object, String)
- Object write(Object, Object)
- Object close(Object)
- SocketAddress remoteAddress(Object)

### Class: com.github.retrooper.packetevents.netty.channel.ChannelHelper
Type: Class

Methods:
- **static** void runInEventLoop(Object, Runnable)
- **static** String pipelineHandlerNamesAsString(Object)
- **static** Object pooledByteBuf(Object)
- **static** List pipelineHandlerNames(Object)
- **static** Object getPipelineHandler(Object, String)
- **static** Object writeAndFlushInContext(Object, String, Object)
- **static** Object writeAndFlush(Object, Object)
- **static** Object fireChannelRead(Object, Object)
- **static** boolean isOpen(Object)
- **static** Object getPipeline(Object)
- **static** Object flush(Object)
- **static** Object writeInContext(Object, String, Object)
- **static** SocketAddress localAddress(Object)
- **static** Object fireChannelReadInContext(Object, String, Object)
- **static** Object flushInContext(Object, String)
- **static** Object getPipelineContext(Object, String)
- **static** Object write(Object, Object)
- **static** Object close(Object)
- **static** SocketAddress remoteAddress(Object)

## Package: com.github.retrooper.packetevents.protocol

### Class: com.github.retrooper.packetevents.protocol.ConnectionState
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ConnectionState getById(int)
- **static** ConnectionState valueOf(String)
- **static** ConnectionState[] values()

### Class: com.github.retrooper.packetevents.protocol.PacketSide
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PacketSide valueOf(String)
- **static** PacketSide[] values()
- PacketSide getOpposite()

### Class: com.github.retrooper.packetevents.protocol.ProtocolVersion
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ProtocolVersion valueOf(String)
- **static** ProtocolVersion[] values()

## Package: com.github.retrooper.packetevents.protocol.advancements

### Class: com.github.retrooper.packetevents.protocol.advancements.Advancement
Type: Class

Methods:
- List getCriteria()
- ResourceLocation getParent()
- List getRequirements()
- void setDisplay(AdvancementDisplay)
- **static** Advancement read(PacketWrapper)
- boolean isSendsTelemetryData()
- void setSendsTelemetryData(boolean)
- void setParent(ResourceLocation)
- void setRequirements(List)
- void setCriteria(List)
- **static** void write(PacketWrapper, Advancement)
- AdvancementDisplay getDisplay()

### Class: com.github.retrooper.packetevents.protocol.advancements.AdvancementDisplay
Type: Class

Methods:
- int packFlags()
- void setY(float)
- void setX(float)
- **static** AdvancementDisplay read(PacketWrapper)
- void setTitle(Component)
- void setDescription(Component)
- void setType(AdvancementType)
- void setBackground(ResourceLocation)
- boolean isShowToast()
- Component getDescription()
- boolean isHidden()
- ItemStack getIcon()
- void setIcon(ItemStack)
- float getX()
- float getY()
- Component getTitle()
- AdvancementType getType()
- void setHidden(boolean)
- void setShowToast(boolean)
- ResourceLocation getBackground()
- **static** void write(PacketWrapper, AdvancementDisplay)

### Class: com.github.retrooper.packetevents.protocol.advancements.AdvancementHolder
Type: Class

Methods:
- Advancement getAdvancement()
- **static** AdvancementHolder read(PacketWrapper)
- void setIdentifier(ResourceLocation)
- ResourceLocation getIdentifier()
- **static** void write(PacketWrapper, AdvancementHolder)
- void setAdvancement(Advancement)

### Class: com.github.retrooper.packetevents.protocol.advancements.AdvancementProgress
Type: Class

Methods:
- Map getCriteria()
- **static** AdvancementProgress read(PacketWrapper)
- void setCriteria(Map)
- **static** void write(PacketWrapper, AdvancementProgress)

### Class: com.github.retrooper.packetevents.protocol.advancements.AdvancementProgress$CriterionProgress
Type: Class

Methods:
- **static** AdvancementProgress$CriterionProgress read(PacketWrapper)
- void setObtainedTimestamp(Long)
- Long getObtainedTimestamp()
- **static** void write(PacketWrapper, AdvancementProgress$CriterionProgress)

### Class: com.github.retrooper.packetevents.protocol.advancements.AdvancementType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** AdvancementType valueOf(String)
- **static** AdvancementType[] values()

## Package: com.github.retrooper.packetevents.protocol.attribute

### Class: com.github.retrooper.packetevents.protocol.attribute.Attribute
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- double sanitizeValue(double)
- double sanitizeValue(double, ClientVersion)
- double getMinValue()
- ResourceLocation getName()
- ResourceLocation getName(ClientVersion)
- double getMaxValue()
- double getDefaultValue()

### Class: com.github.retrooper.packetevents.protocol.attribute.AttributeDisplay
Type: Interface

Methods:
- **static** AttributeDisplay read(PacketWrapper)
- AttributeDisplayType getType()
- **static** void write(PacketWrapper, AttributeDisplay)

### Class: com.github.retrooper.packetevents.protocol.attribute.AttributeDisplayType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- AttributeDisplay read(PacketWrapper)
- void write(PacketWrapper, AttributeDisplay)

### Class: com.github.retrooper.packetevents.protocol.attribute.AttributeDisplayTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** AttributeDisplayType define(String, PacketWrapper$Reader, PacketWrapper$Writer)

### Class: com.github.retrooper.packetevents.protocol.attribute.AttributeOperation
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** AttributeOperation valueOf(String)
- **static** AttributeOperation[] values()

### Class: com.github.retrooper.packetevents.protocol.attribute.Attributes
Type: Class

Methods:
- **static** Attribute getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Attribute getByName(String)

### Class: com.github.retrooper.packetevents.protocol.attribute.DefaultAttributeDisplay
Type: Class
Implements: com.github.retrooper.packetevents.protocol.attribute.AttributeDisplay

Methods:
- **static** DefaultAttributeDisplay read(PacketWrapper)
- AttributeDisplayType getType()
- **static** void write(PacketWrapper, DefaultAttributeDisplay)

### Class: com.github.retrooper.packetevents.protocol.attribute.HiddenAttributeDisplay
Type: Class
Implements: com.github.retrooper.packetevents.protocol.attribute.AttributeDisplay

Methods:
- **static** HiddenAttributeDisplay read(PacketWrapper)
- AttributeDisplayType getType()
- **static** void write(PacketWrapper, HiddenAttributeDisplay)

### Class: com.github.retrooper.packetevents.protocol.attribute.OverrideAttributeDisplay
Type: Class
Implements: com.github.retrooper.packetevents.protocol.attribute.AttributeDisplay

Methods:
- **static** OverrideAttributeDisplay read(PacketWrapper)
- AttributeDisplayType getType()
- int hashCode()
- boolean equals(Object)
- Component getComponent()
- **static** void write(PacketWrapper, OverrideAttributeDisplay)

### Class: com.github.retrooper.packetevents.protocol.attribute.StaticAttribute
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.attribute.Attribute

Methods:
- double getMinValue()
- ResourceLocation getName(ClientVersion)
- double getMaxValue()
- double getDefaultValue()

### Class: com.github.retrooper.packetevents.protocol.attribute.StaticAttributeDisplayType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.attribute.AttributeDisplayType

Methods:
- AttributeDisplay read(PacketWrapper)
- void write(PacketWrapper, AttributeDisplay)

## Package: com.github.retrooper.packetevents.protocol.chat

### Class: com.github.retrooper.packetevents.protocol.chat.ChatType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(ChatType, ClientVersion)
- **static** void writeDirect(PacketWrapper, ChatType)
- ChatTypeDecoration getOverlayDecoration()
- **static** ChatType readDirect(PacketWrapper)
- ChatType$NarrationPriority getNarrationPriority()
- ChatTypeDecoration getChatDecoration()
- **static** ChatType decode(NBT, ClientVersion, TypesBuilderData)
- ChatTypeDecoration getNarrationDecoration()

### Class: com.github.retrooper.packetevents.protocol.chat.Parsers$Reader
Type: Interface
Implements: java.util.function.Function

No public methods found

### Class: com.github.retrooper.packetevents.protocol.chat.Parsers$Writer
Type: Interface
Implements: java.util.function.BiConsumer

No public methods found

### Class: com.github.retrooper.packetevents.protocol.chat.ChatCompletionAction
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ChatCompletionAction valueOf(String)
- **static** ChatCompletionAction[] values()
- **static** ChatCompletionAction fromId(int)

### Class: com.github.retrooper.packetevents.protocol.chat.ChatType$Bound
Type: Class
Extends: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage_v1_19_1$ChatTypeBoundNetwork

No public methods found

### Class: com.github.retrooper.packetevents.protocol.chat.ChatType$NarrationPriority
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ChatType$NarrationPriority valueOf(String)
- **static** ChatType$NarrationPriority[] values()
- String getId()

### Class: com.github.retrooper.packetevents.protocol.chat.ChatTypeDecoration
Type: Class

Methods:
- **static** NBT encode(ChatTypeDecoration, ClientVersion)
- **static** NBT encode(ChatTypeDecoration, PacketWrapper)
- Component decorate(Component, ChatType$Bound)
- **static** ChatTypeDecoration read(PacketWrapper)
- String getTranslationKey()
- **static** ChatTypeDecoration teamMessage(String)
- **static** ChatTypeDecoration decode(NBT, ClientVersion)
- **static** ChatTypeDecoration decode(NBT, PacketWrapper)
- **static** ChatTypeDecoration incomingDirectMessage(String)
- **static** ChatTypeDecoration withSender(String)
- Style getStyle()
- int hashCode()
- boolean equals(Object)
- List getParameters()
- **static** void write(PacketWrapper, ChatTypeDecoration)
- **static** ChatTypeDecoration outgoingDirectMessage(String)

### Class: com.github.retrooper.packetevents.protocol.chat.ChatTypeDecoration$Parameter
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ChatTypeDecoration$Parameter valueOf(String)
- **static** ChatTypeDecoration$Parameter[] values()
- **static** ChatTypeDecoration$Parameter valueByName(String)
- String getId()

### Class: com.github.retrooper.packetevents.protocol.chat.ChatTypes
Type: Class

Methods:
- **static** ChatType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** ChatType getByName(String)
- **static** ChatType define(String)
- **static** ChatType define(String, ChatTypeDecoration)
- **static** ChatType define(String, ChatTypeDecoration, ChatTypeDecoration)

### Class: com.github.retrooper.packetevents.protocol.chat.LastSeenMessages
Type: Class

Methods:
- void updateHash(DataOutput) throws IOException
- List getEntries()

### Class: com.github.retrooper.packetevents.protocol.chat.LastSeenMessages$Entry
Type: Class

Methods:
- byte[] getLastVerifier()
- UUID getUUID()

### Class: com.github.retrooper.packetevents.protocol.chat.LastSeenMessages$LegacyUpdate
Type: Class

Methods:
- LastSeenMessages getLastSeenMessages()
- LastSeenMessages$Entry getLastReceived()

### Class: com.github.retrooper.packetevents.protocol.chat.LastSeenMessages$Packed
Type: Class

Methods:
- List getPackedMessageSignatures()
- void setPackedMessageSignatures(List)

### Class: com.github.retrooper.packetevents.protocol.chat.LastSeenMessages$Update
Type: Class

Methods:
- BitSet getAcknowledged()
- int getOffset()
- byte getChecksum()

### Class: com.github.retrooper.packetevents.protocol.chat.MessageSender
Type: Class

Methods:
- void setTeamName(Component)
- UUID getUUID()
- Component getDisplayName()
- Component getTeamName()
- void setDisplayName(Component)
- void setUUID(UUID)

### Class: com.github.retrooper.packetevents.protocol.chat.MessageSignature
Type: Class

Methods:
- void setBytes(byte[])
- byte[] getBytes()

### Class: com.github.retrooper.packetevents.protocol.chat.MessageSignature$Packed
Type: Class

Methods:
- void setFullSignature(MessageSignature)
- Optional getFullSignature()
- void setId(int)
- int getId()

### Class: com.github.retrooper.packetevents.protocol.chat.Node
Type: Class

Methods:
- void setName(Optional)
- void setParserID(Optional)
- Optional getName()
- void setProperties(Optional)
- Optional getProperties()
- int getRedirectNodeIndex()
- Optional getSuggestionsType()
- List getChildren()
- void setSuggestionsType(Optional)
- Optional getParserID()
- void setParser(Optional)
- Optional getParser()
- byte getFlags()
- void setChildren(List)
- void setFlags(byte)
- void setRedirectNodeIndex(int)

### Class: com.github.retrooper.packetevents.protocol.chat.Parsers
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** Parsers$Parser getById(ClientVersion, int)
- **static** List getParsers()
- **static** Parsers$Parser getByName(String)
- **static** Parsers$Parser define(String)
- **static** Parsers$Parser define(String, Parsers$Reader, Parsers$Writer)

### Class: com.github.retrooper.packetevents.protocol.chat.Parsers$Parser
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity

Methods:
- Optional readProperties(PacketWrapper)
- void writeProperties(PacketWrapper, List)

### Class: com.github.retrooper.packetevents.protocol.chat.RemoteChatSession
Type: Class

Methods:
- PublicProfileKey getPublicProfileKey()
- UUID getSessionId()

### Class: com.github.retrooper.packetevents.protocol.chat.SignedCommandArgument
Type: Class

Methods:
- void setSignature(MessageSignature)
- MessageSignature getSignature()
- String getArgument()
- void setArgument(String)

### Class: com.github.retrooper.packetevents.protocol.chat.StaticChatType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.chat.ChatType

Methods:
- ChatTypeDecoration getOverlayDecoration()
- ChatType$NarrationPriority getNarrationPriority()
- boolean deepEquals(Object)
- int deepHashCode()
- ChatTypeDecoration getChatDecoration()
- String toString()
- ChatType copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- ChatTypeDecoration getNarrationDecoration()

## Package: com.github.retrooper.packetevents.protocol.chat.clickevent

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEvent
Type: Interface

Methods:
- **static** void encode(NBTCompound, PacketWrapper, ClickEvent)
- ClickEvent asAdventure()
- **static** ClickEvent fromAdventure(ClickEvent)
- ClickEventAction getAction()
- **static** ClickEvent decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEventAction
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- void encode(NBTCompound, PacketWrapper, ClickEvent)
- boolean isAllowFromServer()
- ClickEvent decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.ChangePageClickEvent
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEvent

Methods:
- **static** void encode(NBTCompound, PacketWrapper, ChangePageClickEvent)
- int getPage()
- ClickEvent asAdventure()
- ClickEventAction getAction()
- **static** ChangePageClickEvent decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEventActions
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** ClickEventAction define(String, boolean, NbtMapDecoder, NbtMapEncoder)

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.CopyToClipboardClickEvent
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEvent

Methods:
- **static** void encode(NBTCompound, PacketWrapper, CopyToClipboardClickEvent)
- String getValue()
- ClickEvent asAdventure()
- ClickEventAction getAction()
- **static** CopyToClipboardClickEvent decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.CustomClickEvent
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEvent

Methods:
- **static** void encode(NBTCompound, PacketWrapper, CustomClickEvent)
- NBT getPayload()
- ClickEvent asAdventure()
- ResourceLocation getId()
- ClickEventAction getAction()
- **static** CustomClickEvent decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.OpenFileClickEvent
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEvent

Methods:
- **static** void encode(NBTCompound, PacketWrapper, OpenFileClickEvent)
- ClickEvent asAdventure()
- String getPath()
- ClickEventAction getAction()
- **static** OpenFileClickEvent decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.OpenUrlClickEvent
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEvent

Methods:
- **static** void encode(NBTCompound, PacketWrapper, OpenUrlClickEvent)
- String getUrl()
- ClickEvent asAdventure()
- ClickEventAction getAction()
- **static** OpenUrlClickEvent decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.RunCommandClickEvent
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEvent

Methods:
- **static** void encode(NBTCompound, PacketWrapper, RunCommandClickEvent)
- String getCommand()
- ClickEvent asAdventure()
- ClickEventAction getAction()
- **static** RunCommandClickEvent decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.ShowDialogClickEvent
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEvent

Methods:
- **static** void encode(NBTCompound, PacketWrapper, ShowDialogClickEvent)
- ClickEvent asAdventure()
- ClickEventAction getAction()
- **static** ShowDialogClickEvent decode(NBTCompound, PacketWrapper)
- MappedEntityRef getDialogRef()
- Dialog getDialog()

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.StaticClickEventAction
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEventAction

Methods:
- void encode(NBTCompound, PacketWrapper, ClickEvent)
- boolean isAllowFromServer()
- ClickEvent decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.SuggestCommandClickEvent
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEvent

Methods:
- **static** void encode(NBTCompound, PacketWrapper, SuggestCommandClickEvent)
- String getCommand()
- ClickEvent asAdventure()
- ClickEventAction getAction()
- **static** SuggestCommandClickEvent decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.chat.clickevent.TwitchUserInfoClickEvent
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.clickevent.ClickEvent

Methods:
- **static** void encode(NBTCompound, PacketWrapper, TwitchUserInfoClickEvent)
- String getValue()
- ClickEvent asAdventure()
- ClickEventAction getAction()
- **static** TwitchUserInfoClickEvent decode(NBTCompound, PacketWrapper)

## Package: com.github.retrooper.packetevents.protocol.chat.filter

### Class: com.github.retrooper.packetevents.protocol.chat.filter.FilterMask
Type: Class

Methods:
- BitSet getMask()
- FilterMaskType getType()

### Class: com.github.retrooper.packetevents.protocol.chat.filter.FilterMaskType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** FilterMaskType getById(int)
- **static** FilterMaskType valueOf(String)
- **static** FilterMaskType[] values()
- int getId()

## Package: com.github.retrooper.packetevents.protocol.chat.message

### Class: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage
Type: Class

Methods:
- void setChatContentJson(ClientVersion, String)
- ChatType getType()
- void setChatContent(Component)
- Component getChatContent()
- void setType(ChatType)
- String getChatContentJson(ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.chat.message.ChatMessageLegacy
Type: Class
Extends: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage

No public methods found

### Class: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage_v1_16
Type: Class
Extends: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage

Methods:
- UUID getSenderUUID()
- void setSenderUUID(UUID)

### Class: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage_v1_19
Type: Class
Extends: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage_v1_16

Methods:
- void setTeamName(Component)
- void setSenderDisplayName(Component)
- Instant getTimestamp()
- void setSalt(long)
- Component getUnsignedChatContent()
- void setSignature(byte[])
- byte[] getSignature()
- long getSalt()
- void setUnsignedChatContent(Component)
- Component getTeamName()
- void setTimestamp(Instant)
- Component getSenderDisplayName()

### Class: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage_v1_19_1
Type: Class
Extends: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage_v1_16

Methods:
- ChatType$Bound getChatFormatting()
- void setSignature(byte[])
- void setFilterMask(FilterMask)
- long getSalt()
- byte[] getSignature()
- void setChatType(ChatType$Bound)
- boolean isChatContentDecorated()
- void setPreviousSignature(byte[])
- void setType(ChatType)
- void setUnsignedChatContent(Component)
- ChatType$Bound getChatType()
- FilterMask getFilterMask()
- void setChatFormatting(ChatType$Bound)
- void setPlainContent(String)
- ChatType getType()
- Instant getTimestamp()
- byte[] getPreviousSignature()
- void setSalt(long)
- Component getUnsignedChatContent()
- void setLastSeenMessages(LastSeenMessages)
- String getPlainContent()
- LastSeenMessages getLastSeenMessages()
- void setTimestamp(Instant)

### Class: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage_v1_19_1$ChatTypeBoundNetwork
Type: Class

Methods:
- void setName(Component)
- Component getName()
- ChatType getType()
- Component getTargetName()
- void setType(ChatType)
- void setTargetName(Component)

### Class: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage_v1_19_3
Type: Class
Extends: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage_v1_16

Methods:
- int getIndex()
- ChatType$Bound getChatFormatting()
- Component getChatContent()
- void setSignature(byte[])
- void setFilterMask(FilterMask)
- long getSalt()
- byte[] getSignature()
- void setChatType(ChatType$Bound)
- void setUnsignedChatContent(Component)
- ChatType$Bound getChatType()
- void setLastSeenMessagesPacked(LastSeenMessages$Packed)
- FilterMask getFilterMask()
- void setChatFormatting(ChatType$Bound)
- void setPlainContent(String)
- Instant getTimestamp()
- void setChatContent(Component)
- void setIndex(int)
- Optional getUnsignedChatContent()
- void setSalt(long)
- String getPlainContent()
- void setTimestamp(Instant)
- LastSeenMessages$Packed getLastSeenMessagesPacked()

### Class: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage_v1_21_5
Type: Class
Extends: com.github.retrooper.packetevents.protocol.chat.message.ChatMessage_v1_19_3

Methods:
- void setGlobalIndex(int)
- int getGlobalIndex()

## Package: com.github.retrooper.packetevents.protocol.chat.message.reader

### Class: com.github.retrooper.packetevents.protocol.chat.message.reader.ChatMessageProcessor
Type: Interface

Methods:
- ChatMessage readChatMessage(PacketWrapper)
- void writeChatMessage(PacketWrapper, ChatMessage)

## Package: com.github.retrooper.packetevents.protocol.chat.message.reader.impl

### Class: com.github.retrooper.packetevents.protocol.chat.message.reader.impl.ChatMessageProcessorLegacy
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.message.reader.ChatMessageProcessor

Methods:
- ChatMessage readChatMessage(PacketWrapper)
- void writeChatMessage(PacketWrapper, ChatMessage)

### Class: com.github.retrooper.packetevents.protocol.chat.message.reader.impl.ChatMessageProcessor_v1_16
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.message.reader.ChatMessageProcessor

Methods:
- ChatMessage readChatMessage(PacketWrapper)
- void writeChatMessage(PacketWrapper, ChatMessage)

### Class: com.github.retrooper.packetevents.protocol.chat.message.reader.impl.ChatMessageProcessor_v1_19
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.message.reader.ChatMessageProcessor

Methods:
- ChatMessage readChatMessage(PacketWrapper)
- void writeChatMessage(PacketWrapper, ChatMessage)

### Class: com.github.retrooper.packetevents.protocol.chat.message.reader.impl.ChatMessageProcessor_v1_19_1
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.message.reader.ChatMessageProcessor

Methods:
- ChatMessage readChatMessage(PacketWrapper)
- void writeChatMessage(PacketWrapper, ChatMessage)

### Class: com.github.retrooper.packetevents.protocol.chat.message.reader.impl.ChatMessageProcessor_v1_19_3
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.message.reader.ChatMessageProcessor

Methods:
- ChatMessage readChatMessage(PacketWrapper)
- void writeChatMessage(PacketWrapper, ChatMessage)

### Class: com.github.retrooper.packetevents.protocol.chat.message.reader.impl.ChatMessageProcessor_v1_21_5
Type: Class
Implements: com.github.retrooper.packetevents.protocol.chat.message.reader.ChatMessageProcessor

Methods:
- ChatMessage readChatMessage(PacketWrapper)
- void writeChatMessage(PacketWrapper, ChatMessage)

## Package: com.github.retrooper.packetevents.protocol.color

### Class: com.github.retrooper.packetevents.protocol.color.AlphaColor
Type: Class
Extends: com.github.retrooper.packetevents.protocol.color.Color

Methods:
- int red()
- **static** NBT encode(AlphaColor, ClientVersion)
- int green()
- int blue()
- AlphaColor withAlpha(int)
- AlphaColor withBlue(int)
- Color withBlue(int)
- int alpha()
- int asRGB()
- **static** AlphaColor decode(NBT, ClientVersion)
- AlphaColor withGreen(int)
- Color withGreen(int)
- AlphaColor withRed(int)
- Color withRed(int)

### Class: com.github.retrooper.packetevents.protocol.color.Color
Type: Class
Implements: net.kyori.adventure.util.RGBLike

Methods:
- int red()
- **static** NBT encode(Color, ClientVersion)
- int green()
- **static** Color read(PacketWrapper)
- int blue()
- Color withBlue(int)
- **static** Color readShort(PacketWrapper)
- int asRGB()
- **static** void writeShort(PacketWrapper, Color)
- **static** Color decode(NBT, ClientVersion)
- **static** void write(PacketWrapper, Color)
- Color withGreen(int)
- Color withRed(int)

### Class: com.github.retrooper.packetevents.protocol.color.DyeColor
Type: Enum
Extends: java.lang.Enum
Implements: net.kyori.adventure.util.RGBLike

Methods:
- int red()
- int green()
- **static** DyeColor read(PacketWrapper)
- int blue()
- Color color()
- **static** DyeColor valueOf(String)
- **static** DyeColor[] values()
- Color fireworkColor()
- int mapColorId()
- Color textColor()
- **static** void write(PacketWrapper, DyeColor)

## Package: com.github.retrooper.packetevents.protocol.component

### Class: com.github.retrooper.packetevents.protocol.component.ComponentType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- NBT encode(Object, ClientVersion)
- Object read(PacketWrapper)
- ComponentType legacyMap(Function, Function)
- Object decode(NBT, ClientVersion)
- void write(PacketWrapper, Object)

### Class: com.github.retrooper.packetevents.protocol.component.ComponentType$Decoder
Type: Interface

Methods:
- Object decode(NBT, ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.component.ComponentType$Encoder
Type: Interface

Methods:
- NBT encode(Object, ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.component.IComponentMap
Type: Interface

Methods:
- **static** NBT encode(PacketWrapper, StaticComponentMap)
- **static** NBT encode(StaticComponentMap, ClientVersion)
- Object getOr(ComponentType, Object)
- Optional getOptional(ComponentType)
- void set(ComponentValue)
- void set(ComponentType, Object)
- void set(ComponentType, Optional)
- Object get(ComponentType)
- boolean has(ComponentType)
- **static** StaticComponentMap decode(NBT, PacketWrapper, IRegistry)
- **static** StaticComponentMap decode(NBT, ClientVersion, IRegistry)
- void unset(ComponentType)

### Class: com.github.retrooper.packetevents.protocol.component.ComponentPredicate
Type: Class
Implements: java.util.function.Predicate

Methods:
- **static** ComponentPredicate read(PacketWrapper)
- boolean test(IComponentMap)
- boolean test(Object)
- **static** ComponentPredicate fromPatches(PatchableComponentMap)
- int hashCode()
- boolean equals(Object)
- void setRequiredComponents(List)
- **static** ComponentPredicate emptyPredicate()
- String toString()
- PatchableComponentMap asPatches(StaticComponentMap)
- **static** void write(PacketWrapper, ComponentPredicate)
- List getRequiredComponents()

### Class: com.github.retrooper.packetevents.protocol.component.ComponentTypes
Type: Class

Methods:
- **static** ComponentType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** ComponentType getByName(String)
- **static** ComponentType define(String)
- **static** ComponentType define(String, PacketWrapper$Reader, PacketWrapper$Writer)

### Class: com.github.retrooper.packetevents.protocol.component.ComponentValue
Type: Class

Methods:
- Object getValue()
- **static** ComponentValue read(PacketWrapper)
- ComponentType getType()
- int hashCode()
- boolean equals(Object)
- String toString()
- **static** void write(PacketWrapper, ComponentValue)

### Class: com.github.retrooper.packetevents.protocol.component.EnchantEffectComponentTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** ComponentType define(String)
- **static** ComponentType define(String, ComponentType$Decoder, ComponentType$Encoder)

### Class: com.github.retrooper.packetevents.protocol.component.HashedComponentPatchMap
Type: Class

Methods:
- **static** HashedComponentPatchMap read(PacketWrapper)
- Set getRemovedComponents()
- Map getAddedComponents()
- **static** void write(PacketWrapper, HashedComponentPatchMap)

### Class: com.github.retrooper.packetevents.protocol.component.PatchableComponentMap
Type: Class
Implements: com.github.retrooper.packetevents.protocol.component.IComponentMap

Methods:
- void set(ComponentType, Optional)
- int hashCode()
- boolean equals(Object)
- Object get(ComponentType)
- String toString()
- Map getBase()
- PatchableComponentMap copy()
- boolean has(ComponentType)
- Map getPatches()

### Class: com.github.retrooper.packetevents.protocol.component.StaticComponentMap
Type: Class
Implements: com.github.retrooper.packetevents.protocol.component.IComponentMap

Methods:
- void set(ComponentType, Optional)
- int hashCode()
- boolean equals(Object)
- StaticComponentMap merge(StaticComponentMap)
- Object get(ComponentType)
- boolean isEmpty()
- **static** StaticComponentMap$Builder builder()
- String toString()
- Map getDelegate()
- boolean has(ComponentType)

### Class: com.github.retrooper.packetevents.protocol.component.StaticComponentMap$Builder
Type: Class

Methods:
- StaticComponentMap$Builder set(ComponentType, Optional)
- StaticComponentMap$Builder set(ComponentType, Object)
- StaticComponentMap build()
- StaticComponentMap$Builder setAll(StaticComponentMap$Builder)
- StaticComponentMap$Builder setAll(StaticComponentMap)
- StaticComponentMap$Builder setAll(Map)

### Class: com.github.retrooper.packetevents.protocol.component.StaticComponentType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.component.ComponentType

Methods:
- NBT encode(Object, ClientVersion)
- Object read(PacketWrapper)
- ComponentType legacyMap(Function, Function)
- Object decode(NBT, ClientVersion)
- void write(PacketWrapper, Object)

## Package: com.github.retrooper.packetevents.protocol.component.builtin

### Class: com.github.retrooper.packetevents.protocol.component.builtin.AxolotlVariantComponent
Type: Class

Methods:
- **static** AxolotlVariantComponent read(PacketWrapper)
- AxolotlVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(AxolotlVariant)
- **static** void write(PacketWrapper, AxolotlVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.CatCollarComponent
Type: Class

Methods:
- void setDyeColor(DyeColor)
- **static** CatCollarComponent read(PacketWrapper)
- int hashCode()
- DyeColor getDyeColor()
- boolean equals(Object)
- **static** void write(PacketWrapper, CatCollarComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.CatVariantComponent
Type: Class

Methods:
- **static** CatVariantComponent read(PacketWrapper)
- CatVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(CatVariant)
- **static** void write(PacketWrapper, CatVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.ChickenVariantComponent
Type: Class

Methods:
- **static** ChickenVariantComponent read(PacketWrapper)
- MaybeMappedEntity getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(MaybeMappedEntity)
- **static** void write(PacketWrapper, ChickenVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.CowVariantComponent
Type: Class

Methods:
- **static** CowVariantComponent read(PacketWrapper)
- CowVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(CowVariant)
- **static** void write(PacketWrapper, CowVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.FoxVariantComponent
Type: Class

Methods:
- **static** FoxVariantComponent read(PacketWrapper)
- FoxVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(FoxVariant)
- **static** void write(PacketWrapper, FoxVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.FrogVariantComponent
Type: Class

Methods:
- **static** FrogVariantComponent read(PacketWrapper)
- FrogVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(FrogVariant)
- **static** void write(PacketWrapper, FrogVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.HorseVariantComponent
Type: Class

Methods:
- **static** HorseVariantComponent read(PacketWrapper)
- HorseVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(HorseVariant)
- **static** void write(PacketWrapper, HorseVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.LlamaVariantComponent
Type: Class

Methods:
- **static** LlamaVariantComponent read(PacketWrapper)
- LlamaVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(LlamaVariant)
- **static** void write(PacketWrapper, LlamaVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.MooshroomVariantComponent
Type: Class

Methods:
- **static** MooshroomVariantComponent read(PacketWrapper)
- MooshroomVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(MooshroomVariant)
- **static** void write(PacketWrapper, MooshroomVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.PaintingVariantComponent
Type: Class

Methods:
- **static** PaintingVariantComponent read(PacketWrapper)
- PaintingVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(PaintingVariant)
- **static** void write(PacketWrapper, PaintingVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.ParrotVariantComponent
Type: Class

Methods:
- **static** ParrotVariantComponent read(PacketWrapper)
- ParrotVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(ParrotVariant)
- **static** void write(PacketWrapper, ParrotVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.PigVariantComponent
Type: Class

Methods:
- **static** PigVariantComponent read(PacketWrapper)
- PigVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(PigVariant)
- **static** void write(PacketWrapper, PigVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.RabbitVariantComponent
Type: Class

Methods:
- **static** RabbitVariantComponent read(PacketWrapper)
- RabbitVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(RabbitVariant)
- **static** void write(PacketWrapper, RabbitVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.SalmonSizeComponent
Type: Class

Methods:
- **static** SalmonSizeComponent read(PacketWrapper)
- SalmonVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(SalmonVariant)
- **static** void write(PacketWrapper, SalmonSizeComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.SheepColorComponent
Type: Class

Methods:
- void setDyeColor(DyeColor)
- **static** SheepColorComponent read(PacketWrapper)
- int hashCode()
- DyeColor getDyeColor()
- boolean equals(Object)
- **static** void write(PacketWrapper, SheepColorComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.ShulkerColorComponent
Type: Class

Methods:
- void setDyeColor(DyeColor)
- **static** ShulkerColorComponent read(PacketWrapper)
- int hashCode()
- DyeColor getDyeColor()
- boolean equals(Object)
- **static** void write(PacketWrapper, ShulkerColorComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.TropicalFishBaseColorComponent
Type: Class

Methods:
- void setDyeColor(DyeColor)
- **static** TropicalFishBaseColorComponent read(PacketWrapper)
- int hashCode()
- DyeColor getDyeColor()
- boolean equals(Object)
- **static** void write(PacketWrapper, TropicalFishBaseColorComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.TropicalFishPatternColorComponent
Type: Class

Methods:
- void setDyeColor(DyeColor)
- **static** TropicalFishPatternColorComponent read(PacketWrapper)
- int hashCode()
- DyeColor getDyeColor()
- boolean equals(Object)
- **static** void write(PacketWrapper, TropicalFishPatternColorComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.TropicalFishPatternComponent
Type: Class

Methods:
- **static** TropicalFishPatternComponent read(PacketWrapper)
- TropicalFishPattern getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(TropicalFishPattern)
- **static** void write(PacketWrapper, TropicalFishPatternComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.VillagerVariantComponent
Type: Class

Methods:
- void setVillagerType(VillagerType)
- **static** VillagerVariantComponent read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- **static** void write(PacketWrapper, VillagerVariantComponent)
- VillagerType getVillagerType()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.WolfCollarComponent
Type: Class

Methods:
- void setDyeColor(DyeColor)
- **static** WolfCollarComponent read(PacketWrapper)
- int hashCode()
- DyeColor getDyeColor()
- boolean equals(Object)
- **static** void write(PacketWrapper, WolfCollarComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.WolfSoundVariantComponent
Type: Class

Methods:
- WolfSoundVariant getSoundVariant()
- **static** WolfSoundVariantComponent read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setSoundVariant(WolfSoundVariant)
- **static** void write(PacketWrapper, WolfSoundVariantComponent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.WolfVariantComponent
Type: Class

Methods:
- **static** WolfVariantComponent read(PacketWrapper)
- WolfVariant getVariant()
- int hashCode()
- boolean equals(Object)
- void setVariant(WolfVariant)
- **static** void write(PacketWrapper, WolfVariantComponent)

## Package: com.github.retrooper.packetevents.protocol.component.builtin.item

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAdventurePredicate$ValueMatcher
Type: Interface

Methods:
- **static** ItemAdventurePredicate$ValueMatcher read(PacketWrapper)
- **static** void write(PacketWrapper, ItemAdventurePredicate$ValueMatcher)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ArmorTrim
Type: Class

Methods:
- TrimMaterial getMaterial()
- **static** ArmorTrim read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setPattern(TrimPattern)
- String toString()
- boolean isShowInTooltip()
- void setShowInTooltip(boolean)
- TrimPattern getPattern()
- **static** void write(PacketWrapper, ArmorTrim)
- void setMaterial(TrimMaterial)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.BannerLayers
Type: Class

Methods:
- void addLayer(BannerLayers$Layer)
- void setLayers(List)
- **static** BannerLayers read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- List getLayers()
- **static** void write(PacketWrapper, BannerLayers)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.BannerLayers$Layer
Type: Class

Methods:
- void setColor(DyeColor)
- **static** BannerLayers$Layer read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- DyeColor getColor()
- void setPattern(BannerPattern)
- BannerPattern getPattern()
- **static** void write(PacketWrapper, BannerLayers$Layer)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.BundleContents
Type: Class

Methods:
- List getItems()
- void addItem(ItemStack)
- **static** BundleContents read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setItems(List)
- **static** void write(PacketWrapper, BundleContents)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ChargedProjectiles
Type: Class

Methods:
- List getItems()
- void addItem(ItemStack)
- **static** ChargedProjectiles read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setItems(List)
- **static** void write(PacketWrapper, ChargedProjectiles)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.CustomData
Type: Class

Methods:
- **static** NBTCompound read(PacketWrapper)
- **static** void write(PacketWrapper, NBTCompound)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.DebugStickState
Type: Class

Methods:
- String getProperty(StateType)
- **static** DebugStickState read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setProperties(Map)
- Map getProperties()
- void setProperty(StateType, String)
- **static** void write(PacketWrapper, DebugStickState)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.FireworkExplosion
Type: Class

Methods:
- boolean isHasTwinkle()
- List getFadeColors()
- void setHasTwinkle(boolean)
- **static** FireworkExplosion read(PacketWrapper)
- void addColor(int)
- FireworkExplosion$Shape getShape()
- void setFadeColors(List)
- void addFadeColor(int)
- void setShape(FireworkExplosion$Shape)
- List getColors()
- void setHasTrail(boolean)
- int hashCode()
- boolean isHasTrail()
- boolean equals(Object)
- void setColors(List)
- **static** void write(PacketWrapper, FireworkExplosion)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.FireworkExplosion$Shape
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** FireworkExplosion$Shape valueOf(String)
- **static** FireworkExplosion$Shape[] values()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.FoodProperties
Type: Class

Methods:
- **static** FoodProperties read(PacketWrapper)
- float getEatSeconds()
- float getSaturation()
- void addEffect(FoodProperties$PossibleEffect)
- void setUsingConvertsTo(ItemStack)
- void setEffects(List)
- List getEffects()
- boolean isCanAlwaysEat()
- void setEatSeconds(float)
- ItemStack getUsingConvertsTo()
- void setCanAlwaysEat(boolean)
- int getNutrition()
- int hashCode()
- boolean equals(Object)
- void setSaturation(float)
- void setNutrition(int)
- **static** void write(PacketWrapper, FoodProperties)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.FoodProperties$PossibleEffect
Type: Class

Methods:
- void setEffect(PotionEffect)
- **static** FoodProperties$PossibleEffect read(PacketWrapper)
- int hashCode()
- float getProbability()
- boolean equals(Object)
- PotionEffect getEffect()
- void setProbability(float)
- **static** void write(PacketWrapper, FoodProperties$PossibleEffect)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAdventurePredicate
Type: Class

Methods:
- **static** ItemAdventurePredicate read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void addPredicate(ItemAdventurePredicate$BlockPredicate)
- boolean isShowInTooltip()
- void setShowInTooltip(boolean)
- void setPredicates(List)
- List getPredicates()
- **static** void write(PacketWrapper, ItemAdventurePredicate)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAdventurePredicate$BlockPredicate
Type: Class

Methods:
- NBTCompound getNbt()
- **static** ItemAdventurePredicate$BlockPredicate read(PacketWrapper)
- void setBlocks(MappedEntitySet)
- int hashCode()
- void setMatchers(ComponentMatchers)
- boolean equals(Object)
- void setProperties(List)
- List getProperties()
- ComponentMatchers getMatchers()
- MappedEntitySet getBlocks()
- void setNbt(NBTCompound)
- void addProperty(ItemAdventurePredicate$PropertyMatcher)
- **static** void write(PacketWrapper, ItemAdventurePredicate$BlockPredicate)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAdventurePredicate$ExactValueMatcher
Type: Class
Implements: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAdventurePredicate$ValueMatcher

Methods:
- String getValue()
- **static** ItemAdventurePredicate$ExactValueMatcher read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setValue(String)
- **static** void write(PacketWrapper, ItemAdventurePredicate$ExactValueMatcher)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAdventurePredicate$PropertyMatcher
Type: Class

Methods:
- void setName(String)
- String getName()
- **static** ItemAdventurePredicate$PropertyMatcher read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- ItemAdventurePredicate$ValueMatcher getMatcher()
- void setMatcher(ItemAdventurePredicate$ValueMatcher)
- **static** void write(PacketWrapper, ItemAdventurePredicate$PropertyMatcher)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAdventurePredicate$RangedValueMatcher
Type: Class
Implements: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAdventurePredicate$ValueMatcher

Methods:
- void setMaxValue(String)
- String getMinValue()
- **static** ItemAdventurePredicate$RangedValueMatcher read(PacketWrapper)
- int hashCode()
- String getMaxValue()
- boolean equals(Object)
- **static** void write(PacketWrapper, ItemAdventurePredicate$RangedValueMatcher)
- void setMinValue(String)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAttributeModifiers
Type: Class

Methods:
- **static** ItemAttributeModifiers read(PacketWrapper)
- void addModifier(ItemAttributeModifiers$ModifierEntry)
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean isShowInTooltip()
- void setModifiers(List)
- List getModifiers()
- void setShowInTooltip(boolean)
- **static** void write(PacketWrapper, ItemAttributeModifiers)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAttributeModifiers$EquipmentSlotGroup
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ItemAttributeModifiers$EquipmentSlotGroup valueOf(String)
- **static** ItemAttributeModifiers$EquipmentSlotGroup[] values()
- String getId()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAttributeModifiers$Modifier
Type: Class

Methods:
- void setName(String)
- String getName()
- **static** ItemAttributeModifiers$Modifier read(PacketWrapper)
- UUID getId()
- double getValue()
- ResourceLocation getNameKey()
- void setNameKey(ResourceLocation)
- int hashCode()
- boolean equals(Object)
- void setValue(double)
- void setOperation(AttributeOperation)
- AttributeOperation getOperation()
- void setId(UUID)
- String toString()
- **static** void write(PacketWrapper, ItemAttributeModifiers$Modifier)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemAttributeModifiers$ModifierEntry
Type: Class

Methods:
- void setAttribute(Attribute)
- Attribute getAttribute()
- **static** ItemAttributeModifiers$ModifierEntry read(PacketWrapper)
- ItemAttributeModifiers$EquipmentSlotGroup getSlotGroup()
- int hashCode()
- boolean equals(Object)
- ItemAttributeModifiers$Modifier getModifier()
- String toString()
- void setModifier(ItemAttributeModifiers$Modifier)
- **static** void write(PacketWrapper, ItemAttributeModifiers$ModifierEntry)
- void setSlotGroup(ItemAttributeModifiers$EquipmentSlotGroup)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemBees
Type: Class

Methods:
- **static** ItemBees read(PacketWrapper)
- void addBee(ItemBees$BeeEntry)
- int hashCode()
- boolean equals(Object)
- List getBees()
- void setBees(List)
- **static** void write(PacketWrapper, ItemBees)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemBees$BeeEntry
Type: Class

Methods:
- **static** ItemBees$BeeEntry read(PacketWrapper)
- int hashCode()
- void setMinTicksInHive(int)
- void setTicksInHive(int)
- boolean equals(Object)
- void setEntityData(NBTCompound)
- NBTCompound getEntityData()
- int getMinTicksInHive()
- **static** void write(PacketWrapper, ItemBees$BeeEntry)
- int getTicksInHive()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemBlockStateProperties
Type: Class

Methods:
- Object getProperty(StateValue)
- String getProperty(String)
- **static** ItemBlockStateProperties read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setProperties(Map)
- Map getProperties()
- void setProperty(StateValue, Object)
- void setProperty(String, String)
- void unsetProperty(StateValue)
- void unsetProperty(String)
- **static** void write(PacketWrapper, ItemBlockStateProperties)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemBlocksAttacks
Type: Class

Methods:
- void setDamageReductions(List)
- ResourceLocation getBypassedBy()
- **static** ItemBlocksAttacks read(PacketWrapper)
- void setDisableSound(Sound)
- void setBlockDelaySeconds(float)
- float getBlockDelaySeconds()
- ItemBlocksAttacks$ItemDamageFunction getItemDamage()
- void setBlockSound(Sound)
- void setDisableCooldownScale(float)
- float getDisableCooldownScale()
- List getDamageReductions()
- int hashCode()
- boolean equals(Object)
- Sound getBlockSound()
- void setBypassedBy(ResourceLocation)
- void setItemDamage(ItemBlocksAttacks$ItemDamageFunction)
- **static** void write(PacketWrapper, ItemBlocksAttacks)
- Sound getDisableSound()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemBlocksAttacks$DamageReduction
Type: Class

Methods:
- void setFactor(float)
- float getHorizontalBlockingAngle()
- **static** ItemBlocksAttacks$DamageReduction read(PacketWrapper)
- MappedEntitySet getType()
- int hashCode()
- boolean equals(Object)
- float getBase()
- void setBase(float)
- void setType(MappedEntitySet)
- **static** void write(PacketWrapper, ItemBlocksAttacks$DamageReduction)
- float getFactor()
- void setHorizontalBlockingAngle(float)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemBlocksAttacks$ItemDamageFunction
Type: Class

Methods:
- void setFactor(float)
- **static** ItemBlocksAttacks$ItemDamageFunction read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- float getBase()
- void setThreshold(float)
- float getThreshold()
- void setBase(float)
- **static** void write(PacketWrapper, ItemBlocksAttacks$ItemDamageFunction)
- float getFactor()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemBreakSound
Type: Class

Methods:
- **static** ItemBreakSound read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setSound(Sound)
- **static** void write(PacketWrapper, ItemBreakSound)
- Sound getSound()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemConsumable
Type: Class

Methods:
- void setConsumeSeconds(float)
- **static** ItemConsumable read(PacketWrapper)
- void setConsumeParticles(boolean)
- void setAnimation(ItemConsumable$Animation)
- void setEffects(List)
- List getEffects()
- boolean isConsumeParticles()
- int hashCode()
- ItemConsumable$Animation getAnimation()
- boolean equals(Object)
- float getConsumeSeconds()
- void setSound(Sound)
- String toString()
- **static** void write(PacketWrapper, ItemConsumable)
- Sound getSound()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemConsumable$Animation
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ItemConsumable$Animation valueOf(String)
- **static** ItemConsumable$Animation[] values()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemContainerContents
Type: Class

Methods:
- List getItems()
- void addItem(ItemStack)
- **static** ItemContainerContents read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setItems(List)
- **static** void write(PacketWrapper, ItemContainerContents)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemContainerLoot
Type: Class

Methods:
- void setLootTable(ResourceLocation)
- ResourceLocation getLootTable()
- long getSeed()
- **static** ItemContainerLoot read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setSeed(long)
- **static** void write(PacketWrapper, ItemContainerLoot)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemCustomModelData
Type: Class

Methods:
- List getColors()
- **static** ItemCustomModelData read(PacketWrapper)
- void setStrings(List)
- List getFloats()
- void setLegacyId(int)
- void setColors(List)
- void setFloats(List)
- List getFlags()
- int getLegacyId()
- **static** void write(PacketWrapper, ItemCustomModelData)
- void setFlags(List)
- List getStrings()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemDamageResistant
Type: Class

Methods:
- **static** ItemDamageResistant read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- ResourceLocation getTypesTagKey()
- void setTypesTagKey(ResourceLocation)
- String toString()
- **static** void write(PacketWrapper, ItemDamageResistant)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemDeathProtection
Type: Class

Methods:
- **static** ItemDeathProtection read(PacketWrapper)
- void setDeathEffects(List)
- int hashCode()
- boolean equals(Object)
- String toString()
- **static** void write(PacketWrapper, ItemDeathProtection)
- List getDeathEffects()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemDyeColor
Type: Class

Methods:
- **static** ItemDyeColor read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setRgb(int)
- boolean isShowInTooltip()
- void setShowInTooltip(boolean)
- **static** void write(PacketWrapper, ItemDyeColor)
- int getRgb()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemEnchantable
Type: Class

Methods:
- int getValue()
- **static** ItemEnchantable read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setValue(int)
- String toString()
- **static** void write(PacketWrapper, ItemEnchantable)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemEnchantments
Type: Class
Implements: java.lang.Iterable

Methods:
- int getEnchantmentLevel(EnchantmentType)
- **static** ItemEnchantments read(PacketWrapper)
- boolean isEmpty()
- boolean isShowInTooltip()
- int getEnchantmentCount()
- void setShowInTooltip(boolean)
- Map getEnchantments()
- Iterator iterator()
- void setEnchantmentLevel(EnchantmentType, int)
- void setEnchantments(Map)
- int hashCode()
- boolean equals(Object)
- String toString()
- **static** void write(PacketWrapper, ItemEnchantments)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemEquippable
Type: Class

Methods:
- boolean isCanBeSheared()
- void setSwappable(boolean)
- void setAllowedEntities(MappedEntitySet)
- boolean isEquipOnInteract()
- void setSlot(EquipmentSlot)
- void setEquipSound(Sound)
- void setAssetId(ResourceLocation)
- int hashCode()
- boolean isSwappable()
- ResourceLocation getCameraOverlay()
- **static** void write(PacketWrapper, ItemEquippable)
- Sound getEquipSound()
- void setDispensable(boolean)
- ResourceLocation getModel()
- **static** ItemEquippable read(PacketWrapper)
- void setEquipOnInteract(boolean)
- MappedEntitySet getAllowedEntities()
- void setCameraOverlay(ResourceLocation)
- boolean isDamageOnHurt()
- boolean isDispensable()
- EquipmentSlot getSlot()
- void setCanBeSheared(boolean)
- boolean equals(Object)
- void setDamageOnHurt(boolean)
- void setModel(ResourceLocation)
- Sound getShearingSound()
- String toString()
- void setShearingSound(Sound)
- ResourceLocation getAssetId()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemFireworks
Type: Class

Methods:
- **static** ItemFireworks read(PacketWrapper)
- int hashCode()
- List getExplosions()
- boolean equals(Object)
- void setExplosions(List)
- void setFlightDuration(int)
- **static** void write(PacketWrapper, ItemFireworks)
- int getFlightDuration()
- void addExplosion(FireworkExplosion)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemInstrument
Type: Class

Methods:
- MaybeMappedEntity getInstrument()
- **static** ItemInstrument read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setInstrument(MaybeMappedEntity)
- **static** void write(PacketWrapper, ItemInstrument)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemJukeboxPlayable
Type: Class

Methods:
- **static** ItemJukeboxPlayable read(PacketWrapper)
- void setSong(JukeboxSong)
- void setJukeboxSong(IJukeboxSong)
- void setJukeboxSong(JukeboxSong)
- boolean isShowInTooltip()
- void setShowInTooltip(boolean)
- JukeboxSong getSong()
- MaybeMappedEntity getSongHolder()
- ResourceLocation getSongKey()
- int hashCode()
- boolean equals(Object)
- void setSongKey(ResourceLocation)
- IJukeboxSong getJukeboxSong()
- **static** void write(PacketWrapper, ItemJukeboxPlayable)
- void setSongHolder(MaybeMappedEntity)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemLock
Type: Class

Methods:
- **static** ItemLock read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setCode(String)
- String getCode()
- **static** void write(PacketWrapper, ItemLock)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemLore
Type: Class

Methods:
- void setLines(List)
- void addLine(Component)
- **static** ItemLore read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- List getLines()
- String toString()
- **static** void write(PacketWrapper, ItemLore)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemMapDecorations
Type: Class

Methods:
- void setDecoration(String, ItemMapDecorations$Decoration)
- Map getDecorations()
- **static** ItemMapDecorations read(PacketWrapper)
- void setDecorations(Map)
- int hashCode()
- boolean equals(Object)
- ItemMapDecorations$Decoration getDecoration(String)
- **static** void write(PacketWrapper, ItemMapDecorations)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemMapDecorations$Decoration
Type: Class

Methods:
- double getX()
- void setX(double)
- **static** void writeCompound(NBTCompound, ItemMapDecorations$Decoration)
- double getZ()
- MapDecorationType getType()
- int hashCode()
- boolean equals(Object)
- float getRotation()
- **static** ItemMapDecorations$Decoration readCompound(NBTCompound)
- void setRotation(float)
- void setType(MapDecorationType)
- void setZ(double)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemMapPostProcessingState
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ItemMapPostProcessingState valueOf(String)
- **static** ItemMapPostProcessingState[] values()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemModel
Type: Class

Methods:
- ResourceLocation getModelLocation()
- void setModelLocation(ResourceLocation)
- **static** ItemModel read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- String toString()
- **static** void write(PacketWrapper, ItemModel)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemPotionContents
Type: Class

Methods:
- Potion getPotion()
- **static** ItemPotionContents read(PacketWrapper)
- void setCustomEffects(List)
- void setCustomName(String)
- String getCustomName()
- int hashCode()
- boolean equals(Object)
- void setPotion(Potion)
- Integer getCustomColor()
- void setCustomColor(Integer)
- **static** void write(PacketWrapper, ItemPotionContents)
- List getCustomEffects()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemPotionDurationScale
Type: Class

Methods:
- **static** ItemPotionDurationScale read(PacketWrapper)
- float getScale()
- int hashCode()
- void setScale(float)
- boolean equals(Object)
- **static** void write(PacketWrapper, ItemPotionDurationScale)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemProfile
Type: Class

Methods:
- void setName(String)
- String getName()
- **static** ItemProfile read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setProperties(List)
- List getProperties()
- void setId(UUID)
- UUID getId()
- void addProperty(ItemProfile$Property)
- **static** void write(PacketWrapper, ItemProfile)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemProfile$Property
Type: Class

Methods:
- void setName(String)
- String getValue()
- String getName()
- **static** ItemProfile$Property read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setValue(String)
- void setSignature(String)
- String getSignature()
- **static** void write(PacketWrapper, ItemProfile$Property)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemProvidesBannerPatterns
Type: Class

Methods:
- void setTagKey(ResourceLocation)
- **static** ItemProvidesBannerPatterns read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- ResourceLocation getTagKey()
- **static** void write(PacketWrapper, ItemProvidesBannerPatterns)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemProvidesTrimMaterial
Type: Class

Methods:
- MaybeMappedEntity getMaterial()
- **static** ItemProvidesTrimMaterial read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- **static** void write(PacketWrapper, ItemProvidesTrimMaterial)
- void setMaterial(MaybeMappedEntity)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemRarity
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ItemRarity valueOf(String)
- **static** ItemRarity[] values()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemRecipes
Type: Class

Methods:
- void removeRecipe(ResourceLocation)
- void setRecipes(List)
- void addRecipe(ResourceLocation)
- **static** ItemRecipes read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- **static** void write(PacketWrapper, ItemRecipes)
- List getRecipes()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemRepairable
Type: Class

Methods:
- MappedEntitySet getItems()
- **static** ItemRepairable read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setItems(MappedEntitySet)
- String toString()
- **static** void write(PacketWrapper, ItemRepairable)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemTool
Type: Class

Methods:
- **static** ItemTool read(PacketWrapper)
- void addRule(ItemTool$Rule)
- int hashCode()
- boolean isCanDestroyBlocksInCreative()
- boolean equals(Object)
- void setDefaultMiningSpeed(float)
- float getDefaultMiningSpeed()
- List getRules()
- void setRules(List)
- int getDamagePerBlock()
- **static** void write(PacketWrapper, ItemTool)
- void setCanDestroyBlocksInCreative(boolean)
- void setDamagePerBlock(int)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemTool$Rule
Type: Class

Methods:
- void setSpeed(Float)
- **static** ItemTool$Rule read(PacketWrapper)
- void setCorrectForDrops(Boolean)
- void setBlocks(MappedEntitySet)
- int hashCode()
- boolean equals(Object)
- Float getSpeed()
- MappedEntitySet getBlocks()
- **static** void write(PacketWrapper, ItemTool$Rule)
- Boolean getCorrectForDrops()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemTooltipDisplay
Type: Class

Methods:
- **static** ItemTooltipDisplay read(PacketWrapper)
- boolean isHideTooltip()
- void setHideTooltip(boolean)
- int hashCode()
- boolean equals(Object)
- void setHiddenComponents(Set)
- Set getHiddenComponents()
- **static** void write(PacketWrapper, ItemTooltipDisplay)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemTooltipStyle
Type: Class

Methods:
- **static** ItemTooltipStyle read(PacketWrapper)
- int hashCode()
- void setTooltipLoc(ResourceLocation)
- ResourceLocation getTooltipLoc()
- boolean equals(Object)
- String toString()
- **static** void write(PacketWrapper, ItemTooltipStyle)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemUnbreakable
Type: Class

Methods:
- **static** ItemUnbreakable read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- boolean isShowInTooltip()
- void setShowInTooltip(boolean)
- **static** void write(PacketWrapper, ItemUnbreakable)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemUseCooldown
Type: Class

Methods:
- Optional getCooldownGroup()
- float getSeconds()
- **static** ItemUseCooldown read(PacketWrapper)
- int hashCode()
- void setCooldownGroup(Optional)
- void setSeconds(float)
- boolean equals(Object)
- WrapperPlayServerSetCooldown buildWrapper(ItemStack)
- WrapperPlayServerSetCooldown buildWrapper(ItemType)
- String toString()
- **static** void write(PacketWrapper, ItemUseCooldown)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemUseRemainder
Type: Class

Methods:
- ItemStack getTarget()
- **static** ItemUseRemainder read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setTarget(ItemStack)
- String toString()
- **static** void write(PacketWrapper, ItemUseRemainder)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.ItemWeapon
Type: Class

Methods:
- float getDisableBlockingForSeconds()
- **static** ItemWeapon read(PacketWrapper)
- int getItemDamagePerAttack()
- int hashCode()
- boolean equals(Object)
- void setDisableBlockingForSeconds(float)
- void setItemDamagePerAttack(int)
- **static** void write(PacketWrapper, ItemWeapon)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.LodestoneTracker
Type: Class

Methods:
- boolean isTracked()
- WorldBlockPosition getTarget()
- **static** LodestoneTracker read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setTracked(boolean)
- void setTarget(WorldBlockPosition)
- **static** void write(PacketWrapper, LodestoneTracker)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.PotDecorations
Type: Class

Methods:
- ItemType getBack()
- void setBack(ItemType)
- ItemType getFront()
- ItemType getRight()
- **static** PotDecorations read(PacketWrapper)
- void setLeft(ItemType)
- int hashCode()
- boolean equals(Object)
- void setFront(ItemType)
- void setRight(ItemType)
- **static** void write(PacketWrapper, PotDecorations)
- ItemType getLeft()

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.SuspiciousStewEffects
Type: Class

Methods:
- List getEffects()
- **static** SuspiciousStewEffects read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void addEffect(SuspiciousStewEffects$EffectEntry)
- **static** void write(PacketWrapper, SuspiciousStewEffects)
- void setEffects(List)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.SuspiciousStewEffects$EffectEntry
Type: Class

Methods:
- void setDuration(int)
- **static** SuspiciousStewEffects$EffectEntry read(PacketWrapper)
- int getDuration()
- PotionType getType()
- int hashCode()
- boolean equals(Object)
- void setType(PotionType)
- **static** void write(PacketWrapper, SuspiciousStewEffects$EffectEntry)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.WritableBookContent
Type: Class

Methods:
- void setPages(List)
- **static** WritableBookContent read(PacketWrapper)
- int hashCode()
- Filterable getPage(int)
- boolean equals(Object)
- void addPage(Filterable)
- List getPages()
- **static** void write(PacketWrapper, WritableBookContent)

### Class: com.github.retrooper.packetevents.protocol.component.builtin.item.WrittenBookContent
Type: Class

Methods:
- void setResolved(boolean)
- void setPages(List)
- **static** WrittenBookContent read(PacketWrapper)
- String getAuthor()
- Filterable getPage(int)
- void setGeneration(int)
- void setTitle(Filterable)
- Filterable getTitle()
- void setAuthor(String)
- int hashCode()
- boolean equals(Object)
- int getGeneration()
- void addPage(Filterable)
- List getPages()
- boolean isResolved()
- **static** void write(PacketWrapper, WrittenBookContent)

## Package: com.github.retrooper.packetevents.protocol.component.predicates

### Class: com.github.retrooper.packetevents.protocol.component.predicates.ComponentPredicateType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- IComponentPredicate read(PacketWrapper)
- void write(PacketWrapper, IComponentPredicate)

### Class: com.github.retrooper.packetevents.protocol.component.predicates.IComponentPredicate
Type: Interface

No public methods found

### Class: com.github.retrooper.packetevents.protocol.component.predicates.ComponentMatchers
Type: Class

Methods:
- void setComponents(ComponentPredicate)
- **static** ComponentMatchers read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- ComponentPredicate getComponents()
- void setPredicates(List)
- List getPredicates()
- **static** void write(PacketWrapper, ComponentMatchers)

### Class: com.github.retrooper.packetevents.protocol.component.predicates.ComponentPredicateTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** ComponentPredicateType define(String, PacketWrapper$Reader, PacketWrapper$Writer)

### Class: com.github.retrooper.packetevents.protocol.component.predicates.NbtComponentPredicate
Type: Class
Implements: com.github.retrooper.packetevents.protocol.component.predicates.IComponentPredicate

Methods:
- **static** NbtComponentPredicate read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- NBT getTag()
- **static** void write(PacketWrapper, NbtComponentPredicate)

### Class: com.github.retrooper.packetevents.protocol.component.predicates.StaticComponentPredicateType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.component.predicates.ComponentPredicateType

Methods:
- IComponentPredicate read(PacketWrapper)
- void write(PacketWrapper, IComponentPredicate)

### Class: com.github.retrooper.packetevents.protocol.component.predicates.TypedComponentPredicate
Type: Class

Methods:
- **static** TypedComponentPredicate read(PacketWrapper)
- IComponentPredicate getPredicate()
- ComponentPredicateType getType()
- int hashCode()
- boolean equals(Object)
- **static** void write(PacketWrapper, TypedComponentPredicate)

## Package: com.github.retrooper.packetevents.protocol.dialog

### Class: com.github.retrooper.packetevents.protocol.dialog.Dialog
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, net.kyori.adventure.dialog.DialogLike

Methods:
- **static** NBT encodeDirect(Dialog, PacketWrapper)
- **static** NBT encode(PacketWrapper, Dialog)
- **static** void writeDirect(PacketWrapper, Dialog)
- **static** Dialog read(PacketWrapper)
- **static** Dialog decodeDirect(NBT, PacketWrapper, TypesBuilderData)
- **static** Dialog readDirect(PacketWrapper)
- DialogType getType()
- **static** Dialog decode(NBT, PacketWrapper)
- **static** void write(PacketWrapper, Dialog)

### Class: com.github.retrooper.packetevents.protocol.dialog.DialogType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- void encode(NBTCompound, PacketWrapper, Dialog)
- Dialog decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.CommonDialogData
Type: Class

Methods:
- **static** void encode(NBTCompound, PacketWrapper, CommonDialogData)
- Component getExternalTitle()
- Component getTitle()
- List getBody()
- DialogAction getAfterAction()
- boolean isCanCloseWithEscape()
- List getInputs()
- boolean isPause()
- **static** CommonDialogData decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.ConfirmationDialog
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.dialog.Dialog

Methods:
- **static** void encode(NBTCompound, PacketWrapper, ConfirmationDialog)
- ActionButton getYesButton()
- boolean deepEquals(Object)
- DialogType getType()
- int deepHashCode()
- CommonDialogData getCommon()
- Dialog copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- **static** ConfirmationDialog decode(NBTCompound, PacketWrapper)
- ActionButton getNoButton()

### Class: com.github.retrooper.packetevents.protocol.dialog.DialogAction
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** NBT encode(PacketWrapper, DialogAction)
- String getName()
- **static** DialogAction valueOf(String)
- **static** DialogAction[] values()
- **static** DialogAction decode(NBT, PacketWrapper)
- boolean isWillUnpause()

### Class: com.github.retrooper.packetevents.protocol.dialog.DialogListDialog
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.dialog.Dialog

Methods:
- **static** void encode(NBTCompound, PacketWrapper, DialogListDialog)
- boolean deepEquals(Object)
- DialogType getType()
- int deepHashCode()
- MappedEntityRefSet getDialogs()
- CommonDialogData getCommon()
- ActionButton getExitAction()
- Dialog copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- int getButtonWidth()
- **static** DialogListDialog decode(NBTCompound, PacketWrapper)
- int getColumns()

### Class: com.github.retrooper.packetevents.protocol.dialog.DialogTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** DialogType define(String, NbtMapDecoder, NbtMapEncoder)

### Class: com.github.retrooper.packetevents.protocol.dialog.Dialogs
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** Dialog define(String, Dialog)

### Class: com.github.retrooper.packetevents.protocol.dialog.MultiActionDialog
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.dialog.Dialog

Methods:
- **static** void encode(NBTCompound, PacketWrapper, MultiActionDialog)
- boolean deepEquals(Object)
- DialogType getType()
- int deepHashCode()
- CommonDialogData getCommon()
- List getActions()
- ActionButton getExitAction()
- Dialog copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- **static** MultiActionDialog decode(NBTCompound, PacketWrapper)
- int getColumns()

### Class: com.github.retrooper.packetevents.protocol.dialog.NoticeDialog
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.dialog.Dialog

Methods:
- **static** void encode(NBTCompound, PacketWrapper, NoticeDialog)
- boolean deepEquals(Object)
- DialogType getType()
- int deepHashCode()
- CommonDialogData getCommon()
- ActionButton getAction()
- Dialog copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- **static** NoticeDialog decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.ServerLinksDialog
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.dialog.Dialog

Methods:
- **static** void encode(NBTCompound, PacketWrapper, ServerLinksDialog)
- boolean deepEquals(Object)
- DialogType getType()
- int deepHashCode()
- CommonDialogData getCommon()
- ActionButton getExitAction()
- Dialog copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- int getButtonWidth()
- **static** ServerLinksDialog decode(NBTCompound, PacketWrapper)
- int getColumns()

### Class: com.github.retrooper.packetevents.protocol.dialog.StaticDialogType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.dialog.DialogType

Methods:
- void encode(NBTCompound, PacketWrapper, Dialog)
- Dialog decode(NBTCompound, PacketWrapper)

## Package: com.github.retrooper.packetevents.protocol.dialog.action

### Class: com.github.retrooper.packetevents.protocol.dialog.action.Action
Type: Interface

Methods:
- **static** NBT encode(PacketWrapper, Action)
- ActionType getType()
- **static** Action decode(NBT, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.action.ActionType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- void encode(NBTCompound, PacketWrapper, Action)
- Action decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.action.ActionTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** ActionType define(String, NbtMapDecoder, NbtMapEncoder)

### Class: com.github.retrooper.packetevents.protocol.dialog.action.DialogTemplate
Type: Class

Methods:
- **static** NBT encode(PacketWrapper, DialogTemplate)
- String getRaw()
- **static** DialogTemplate decode(NBT, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.action.DynamicCustomAction
Type: Class
Implements: com.github.retrooper.packetevents.protocol.dialog.action.Action

Methods:
- NBTCompound getAdditions()
- **static** void encode(NBTCompound, PacketWrapper, DynamicCustomAction)
- ActionType getType()
- ResourceLocation getId()
- **static** DynamicCustomAction decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.action.DynamicRunCommandAction
Type: Class
Implements: com.github.retrooper.packetevents.protocol.dialog.action.Action

Methods:
- **static** void encode(NBTCompound, PacketWrapper, DynamicRunCommandAction)
- ActionType getType()
- DialogTemplate getTemplate()
- **static** DynamicRunCommandAction decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.action.StaticAction
Type: Class
Implements: com.github.retrooper.packetevents.protocol.dialog.action.Action

Methods:
- **static** void encode(NBTCompound, PacketWrapper, StaticAction)
- ActionType getType()
- ClickEvent getClickEvent()
- **static** StaticAction decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.action.StaticActionType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.dialog.action.ActionType

Methods:
- void encode(NBTCompound, PacketWrapper, Action)
- Action decode(NBTCompound, PacketWrapper)

## Package: com.github.retrooper.packetevents.protocol.dialog.body

### Class: com.github.retrooper.packetevents.protocol.dialog.body.DialogBody
Type: Interface

Methods:
- **static** NBT encode(PacketWrapper, DialogBody)
- DialogBodyType getType()
- **static** DialogBody decode(NBT, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.body.DialogBodyType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- void encode(NBTCompound, PacketWrapper, DialogBody)
- DialogBody decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.body.DialogBodyTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** DialogBodyType define(String, NbtMapDecoder, NbtMapEncoder)

### Class: com.github.retrooper.packetevents.protocol.dialog.body.ItemDialogBody
Type: Class
Implements: com.github.retrooper.packetevents.protocol.dialog.body.DialogBody

Methods:
- **static** void encode(NBTCompound, PacketWrapper, ItemDialogBody)
- int getHeight()
- DialogBodyType getType()
- ItemStack getItem()
- boolean isShowDecorations()
- int getWidth()
- **static** ItemDialogBody decode(NBTCompound, PacketWrapper)
- PlainMessage getDescription()
- boolean isShowTooltip()

### Class: com.github.retrooper.packetevents.protocol.dialog.body.PlainMessage
Type: Class

Methods:
- **static** NBT encode(PacketWrapper, PlainMessage)
- **static** void encode(NBTCompound, PacketWrapper, PlainMessage)
- Component getContents()
- int getWidth()
- **static** PlainMessage decode(NBT, PacketWrapper)
- **static** PlainMessage decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.body.PlainMessageDialogBody
Type: Class
Implements: com.github.retrooper.packetevents.protocol.dialog.body.DialogBody

Methods:
- **static** void encode(NBTCompound, PacketWrapper, PlainMessageDialogBody)
- DialogBodyType getType()
- PlainMessage getMessage()
- **static** PlainMessageDialogBody decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.body.StaticDialogBodyType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.dialog.body.DialogBodyType

Methods:
- void encode(NBTCompound, PacketWrapper, DialogBody)
- DialogBody decode(NBTCompound, PacketWrapper)

## Package: com.github.retrooper.packetevents.protocol.dialog.button

### Class: com.github.retrooper.packetevents.protocol.dialog.button.ActionButton
Type: Class

Methods:
- **static** NBT encode(PacketWrapper, ActionButton)
- CommonButtonData getButton()
- Action getAction()
- **static** ActionButton decode(NBT, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.button.CommonButtonData
Type: Class

Methods:
- **static** void encode(NBTCompound, PacketWrapper, CommonButtonData)
- Component getLabel()
- Component getTooltip()
- int getWidth()
- **static** CommonButtonData decode(NBTCompound, PacketWrapper)

## Package: com.github.retrooper.packetevents.protocol.dialog.input

### Class: com.github.retrooper.packetevents.protocol.dialog.input.InputControl
Type: Interface

Methods:
- **static** void encode(NBTCompound, PacketWrapper, InputControl)
- InputControlType getType()
- **static** InputControl decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.input.InputControlType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- void encode(NBTCompound, PacketWrapper, InputControl)
- InputControl decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.input.BooleanInputControl
Type: Class
Implements: com.github.retrooper.packetevents.protocol.dialog.input.InputControl

Methods:
- String getOnFalse()
- **static** void encode(NBTCompound, PacketWrapper, BooleanInputControl)
- Component getLabel()
- String getOnTrue()
- InputControlType getType()
- boolean isInitial()
- **static** BooleanInputControl decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.input.Input
Type: Class

Methods:
- **static** NBT encode(PacketWrapper, Input)
- String getKey()
- InputControl getControl()
- **static** Input decode(NBT, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.input.InputControlTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** InputControlType define(String, NbtMapDecoder, NbtMapEncoder)

### Class: com.github.retrooper.packetevents.protocol.dialog.input.NumberRangeInputControl
Type: Class
Implements: com.github.retrooper.packetevents.protocol.dialog.input.InputControl

Methods:
- **static** void encode(NBTCompound, PacketWrapper, NumberRangeInputControl)
- String getLabelFormat()
- Component getLabel()
- InputControlType getType()
- int getWidth()
- **static** NumberRangeInputControl decode(NBTCompound, PacketWrapper)
- NumberRangeInputControl$RangeInfo getRangeInfo()

### Class: com.github.retrooper.packetevents.protocol.dialog.input.NumberRangeInputControl$RangeInfo
Type: Class

Methods:
- Float getInitial()
- **static** void encode(NBTCompound, PacketWrapper, NumberRangeInputControl$RangeInfo)
- float getStart()
- Float getStep()
- **static** NumberRangeInputControl$RangeInfo decode(NBTCompound, PacketWrapper)
- float getEnd()

### Class: com.github.retrooper.packetevents.protocol.dialog.input.SingleOptionInputControl
Type: Class
Implements: com.github.retrooper.packetevents.protocol.dialog.input.InputControl

Methods:
- **static** void encode(NBTCompound, PacketWrapper, SingleOptionInputControl)
- Component getLabel()
- InputControlType getType()
- boolean isLabelVisible()
- List getOptions()
- int getWidth()
- **static** SingleOptionInputControl decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.input.SingleOptionInputControl$Entry
Type: Class

Methods:
- **static** NBT encode(PacketWrapper, SingleOptionInputControl$Entry)
- boolean isInitial()
- String getId()
- **static** SingleOptionInputControl$Entry decode(NBT, PacketWrapper)
- Component getDisplay()

### Class: com.github.retrooper.packetevents.protocol.dialog.input.StaticInputControlType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.dialog.input.InputControlType

Methods:
- void encode(NBTCompound, PacketWrapper, InputControl)
- InputControl decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.input.TextInputControl
Type: Class
Implements: com.github.retrooper.packetevents.protocol.dialog.input.InputControl

Methods:
- TextInputControl$MultilineOptions getMultiline()
- String getInitial()
- **static** void encode(NBTCompound, PacketWrapper, TextInputControl)
- Component getLabel()
- int getMaxLength()
- InputControlType getType()
- boolean isLabelVisible()
- int getWidth()
- **static** TextInputControl decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.dialog.input.TextInputControl$MultilineOptions
Type: Class

Methods:
- **static** NBT encode(PacketWrapper, TextInputControl$MultilineOptions)
- Integer getHeight()
- **static** TextInputControl$MultilineOptions decode(NBT, PacketWrapper)
- Integer getMaxLines()

## Package: com.github.retrooper.packetevents.protocol.entity

### Class: com.github.retrooper.packetevents.protocol.entity.EntityPositionData
Type: Class

Methods:
- Vector3d getDeltaMovement()
- float getYaw()
- float getPitch()
- Vector3d getPosition()
- **static** EntityPositionData read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setPitch(float)
- String toString()
- void setDeltaMovement(Vector3d)
- **static** void write(PacketWrapper, EntityPositionData)
- void setPosition(Vector3d)
- void setYaw(float)

## Package: com.github.retrooper.packetevents.protocol.entity.armadillo

### Class: com.github.retrooper.packetevents.protocol.entity.armadillo.ArmadilloState
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ArmadilloState valueOf(String)
- **static** ArmadilloState[] values()

## Package: com.github.retrooper.packetevents.protocol.entity.axolotl

### Class: com.github.retrooper.packetevents.protocol.entity.axolotl.AxolotlVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.entity.axolotl.AxolotlVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** AxolotlVariant define(String)

### Class: com.github.retrooper.packetevents.protocol.entity.axolotl.StaticAxolotlVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.axolotl.AxolotlVariant

No public methods found

## Package: com.github.retrooper.packetevents.protocol.entity.cat

### Class: com.github.retrooper.packetevents.protocol.entity.cat.CatVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(CatVariant, ClientVersion)
- **static** CatVariant read(PacketWrapper)
- **static** CatVariant decode(NBT, ClientVersion, TypesBuilderData)
- **static** void write(PacketWrapper, CatVariant)
- ResourceLocation getAssetId()

### Class: com.github.retrooper.packetevents.protocol.entity.cat.CatVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** CatVariant define(String)

### Class: com.github.retrooper.packetevents.protocol.entity.cat.StaticCatVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.cat.CatVariant

Methods:
- boolean deepEquals(Object)
- int deepHashCode()
- CatVariant copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- ResourceLocation getAssetId()

## Package: com.github.retrooper.packetevents.protocol.entity.chicken

### Class: com.github.retrooper.packetevents.protocol.entity.chicken.ChickenVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(ChickenVariant, ClientVersion)
- **static** ChickenVariant read(PacketWrapper)
- ChickenVariant$ModelType getModelType()
- **static** ChickenVariant decode(NBT, ClientVersion, TypesBuilderData)
- **static** void write(PacketWrapper, ChickenVariant)
- ResourceLocation getAssetId()

### Class: com.github.retrooper.packetevents.protocol.entity.chicken.ChickenVariant$ModelType
Type: Enum
Extends: java.lang.Enum

Methods:
- String getName()
- **static** ChickenVariant$ModelType valueOf(String)
- **static** ChickenVariant$ModelType[] values()
- **static** ChickenVariant$ModelType getByName(String)

### Class: com.github.retrooper.packetevents.protocol.entity.chicken.ChickenVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** ChickenVariant define(String, ChickenVariant$ModelType, String)

### Class: com.github.retrooper.packetevents.protocol.entity.chicken.StaticChickenVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.chicken.ChickenVariant

Methods:
- boolean deepEquals(Object)
- int deepHashCode()
- ChickenVariant$ModelType getModelType()
- ChickenVariant copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- ResourceLocation getAssetId()

## Package: com.github.retrooper.packetevents.protocol.entity.cow

### Class: com.github.retrooper.packetevents.protocol.entity.cow.CowVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(CowVariant, ClientVersion)
- **static** CowVariant read(PacketWrapper)
- CowVariant$ModelType getModelType()
- **static** CowVariant decode(NBT, ClientVersion, TypesBuilderData)
- **static** void write(PacketWrapper, CowVariant)
- ResourceLocation getAssetId()

### Class: com.github.retrooper.packetevents.protocol.entity.cow.CowVariant$ModelType
Type: Enum
Extends: java.lang.Enum

Methods:
- String getName()
- **static** CowVariant$ModelType valueOf(String)
- **static** CowVariant$ModelType[] values()
- **static** CowVariant$ModelType getByName(String)

### Class: com.github.retrooper.packetevents.protocol.entity.cow.CowVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** CowVariant define(String, CowVariant$ModelType, String)

### Class: com.github.retrooper.packetevents.protocol.entity.cow.StaticCowVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.cow.CowVariant

Methods:
- boolean deepEquals(Object)
- int deepHashCode()
- CowVariant$ModelType getModelType()
- CowVariant copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- ResourceLocation getAssetId()

## Package: com.github.retrooper.packetevents.protocol.entity.data

### Class: com.github.retrooper.packetevents.protocol.entity.data.EntityMetadataProvider
Type: Interface

Methods:
- List entityData(ClientVersion)
- List entityData()

### Class: com.github.retrooper.packetevents.protocol.entity.data.EntityData
Type: Class

Methods:
- Object getValue()
- int getIndex()
- EntityDataType getType()
- void setIndex(int)
- void setValue(Object)
- void setType(EntityDataType)

### Class: com.github.retrooper.packetevents.protocol.entity.data.EntityDataType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity

Methods:
- Function getDataDeserializer()
- Object read(PacketWrapper)
- BiConsumer getDataSerializer()
- void write(PacketWrapper, Object)

### Class: com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes
Type: Class

Methods:
- **static** EntityDataType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** EntityDataType define(String, PacketWrapper$Reader, PacketWrapper$Writer)
- **static** EntityDataType getByName(String)

## Package: com.github.retrooper.packetevents.protocol.entity.fox

### Class: com.github.retrooper.packetevents.protocol.entity.fox.FoxVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.entity.fox.FoxVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** FoxVariant define(String)

### Class: com.github.retrooper.packetevents.protocol.entity.fox.StaticFoxVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.fox.FoxVariant

No public methods found

## Package: com.github.retrooper.packetevents.protocol.entity.frog

### Class: com.github.retrooper.packetevents.protocol.entity.frog.FrogVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(FrogVariant, ClientVersion)
- **static** FrogVariant read(PacketWrapper)
- **static** FrogVariant decode(NBT, ClientVersion, TypesBuilderData)
- **static** void write(PacketWrapper, FrogVariant)
- ResourceLocation getAssetId()

### Class: com.github.retrooper.packetevents.protocol.entity.frog.FrogVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** FrogVariant define(String, String)

### Class: com.github.retrooper.packetevents.protocol.entity.frog.StaticFrogVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.frog.FrogVariant

Methods:
- boolean deepEquals(Object)
- int deepHashCode()
- FrogVariant copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- ResourceLocation getAssetId()

## Package: com.github.retrooper.packetevents.protocol.entity.horse

### Class: com.github.retrooper.packetevents.protocol.entity.horse.HorseVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.entity.horse.HorseVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** HorseVariant define(String)

### Class: com.github.retrooper.packetevents.protocol.entity.horse.StaticHorseVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.horse.HorseVariant

No public methods found

## Package: com.github.retrooper.packetevents.protocol.entity.llama

### Class: com.github.retrooper.packetevents.protocol.entity.llama.LlamaVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.entity.llama.LlamaVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** LlamaVariant define(String)

### Class: com.github.retrooper.packetevents.protocol.entity.llama.StaticLlamaVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.llama.LlamaVariant

No public methods found

## Package: com.github.retrooper.packetevents.protocol.entity.mooshroom

### Class: com.github.retrooper.packetevents.protocol.entity.mooshroom.MooshroomVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.entity.mooshroom.MooshroomVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** MooshroomVariant define(String)

### Class: com.github.retrooper.packetevents.protocol.entity.mooshroom.StaticMooshroomVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.mooshroom.MooshroomVariant

No public methods found

## Package: com.github.retrooper.packetevents.protocol.entity.parrot

### Class: com.github.retrooper.packetevents.protocol.entity.parrot.ParrotVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.entity.parrot.ParrotVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** ParrotVariant define(String)

### Class: com.github.retrooper.packetevents.protocol.entity.parrot.StaticParrotVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.parrot.ParrotVariant

No public methods found

## Package: com.github.retrooper.packetevents.protocol.entity.pig

### Class: com.github.retrooper.packetevents.protocol.entity.pig.PigVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(PigVariant, ClientVersion)
- **static** PigVariant read(PacketWrapper)
- PigVariant$ModelType getModelType()
- **static** PigVariant decode(NBT, ClientVersion, TypesBuilderData)
- **static** void write(PacketWrapper, PigVariant)
- ResourceLocation getAssetId()

### Class: com.github.retrooper.packetevents.protocol.entity.pig.PigVariant$ModelType
Type: Enum
Extends: java.lang.Enum

Methods:
- String getName()
- **static** PigVariant$ModelType valueOf(String)
- **static** PigVariant$ModelType[] values()
- **static** PigVariant$ModelType getByName(String)

### Class: com.github.retrooper.packetevents.protocol.entity.pig.PigVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** PigVariant define(String, PigVariant$ModelType, String)

### Class: com.github.retrooper.packetevents.protocol.entity.pig.StaticPigVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.pig.PigVariant

Methods:
- boolean deepEquals(Object)
- int deepHashCode()
- PigVariant$ModelType getModelType()
- PigVariant copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- ResourceLocation getAssetId()

## Package: com.github.retrooper.packetevents.protocol.entity.pose

### Class: com.github.retrooper.packetevents.protocol.entity.pose.EntityPose
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** EntityPose getById(ClientVersion, int)
- **static** EntityPose valueOf(String)
- **static** EntityPose[] values()
- int getId(ClientVersion)

## Package: com.github.retrooper.packetevents.protocol.entity.rabbit

### Class: com.github.retrooper.packetevents.protocol.entity.rabbit.RabbitVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.entity.rabbit.RabbitVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** RabbitVariant define(String)

### Class: com.github.retrooper.packetevents.protocol.entity.rabbit.StaticRabbitVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.rabbit.RabbitVariant

No public methods found

## Package: com.github.retrooper.packetevents.protocol.entity.salmon

### Class: com.github.retrooper.packetevents.protocol.entity.salmon.SalmonVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.entity.salmon.SalmonVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** SalmonVariant define(String)

### Class: com.github.retrooper.packetevents.protocol.entity.salmon.StaticSalmonVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.salmon.SalmonVariant

No public methods found

## Package: com.github.retrooper.packetevents.protocol.entity.sniffer

### Class: com.github.retrooper.packetevents.protocol.entity.sniffer.SnifferState
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** SnifferState valueOf(String)
- **static** SnifferState[] values()

## Package: com.github.retrooper.packetevents.protocol.entity.transform

### Class: com.github.retrooper.packetevents.protocol.entity.transform.EntityTransformType
Type: Class

Methods:
- void setPlayerSkin(UserProfile)
- Optional getTypeModifier()
- float getScale()
- void setScale(float)
- Optional getPlayerSkin()
- void setTypeModifier(EntityTransformType$TypeModifier)

### Class: com.github.retrooper.packetevents.protocol.entity.transform.EntityTransformType$TypeModifier
Type: Class

Methods:
- EntityType getEntityType()
- void setTag(NBTCompound)
- Optional getTag()
- void setEntityType(EntityType)

## Package: com.github.retrooper.packetevents.protocol.entity.tropicalfish

### Class: com.github.retrooper.packetevents.protocol.entity.tropicalfish.TropicalFishPattern
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- TropicalFishPattern$Base getBase()

### Class: com.github.retrooper.packetevents.protocol.entity.tropicalfish.StaticTropicalFishPattern
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.tropicalfish.TropicalFishPattern

Methods:
- TropicalFishPattern$Base getBase()

### Class: com.github.retrooper.packetevents.protocol.entity.tropicalfish.TropicalFishPattern$Base
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TropicalFishPattern$Base valueOf(String)
- **static** TropicalFishPattern$Base[] values()

### Class: com.github.retrooper.packetevents.protocol.entity.tropicalfish.TropicalFishPatterns
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** TropicalFishPattern define(String, TropicalFishPattern$Base)

## Package: com.github.retrooper.packetevents.protocol.entity.type

### Class: com.github.retrooper.packetevents.protocol.entity.type.EntityType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.LegacyMappedEntity

Methods:
- Optional getParent()
- boolean isInstanceOf(EntityType)

### Class: com.github.retrooper.packetevents.protocol.entity.type.EntityTypes
Type: Class

Methods:
- **static** boolean isTypeInstanceOf(EntityType, EntityType)
- **static** VersionedRegistry getLegacySpawnRegistry()
- **static** EntityType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** EntityType getByName(String)
- **static** EntityType define(String, EntityType)
- **static** EntityType getByLegacyId(ClientVersion, int)

### Class: com.github.retrooper.packetevents.protocol.entity.type.StaticEntityType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.type.EntityType

Methods:
- Optional getParent()
- boolean isInstanceOf(EntityType)
- int getLegacyId(ClientVersion)

## Package: com.github.retrooper.packetevents.protocol.entity.villager

### Class: com.github.retrooper.packetevents.protocol.entity.villager.VillagerData
Type: Class

Methods:
- int getLevel()
- VillagerLevel getVillagerLevel()
- VillagerType getType()
- void setType(VillagerType)
- void setLevel(int)
- void setLevel(VillagerLevel)
- void setProfession(VillagerProfession)
- VillagerProfession getProfession()

## Package: com.github.retrooper.packetevents.protocol.entity.villager.level

### Class: com.github.retrooper.packetevents.protocol.entity.villager.level.VillagerLevel
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** VillagerLevel getById(int)
- **static** VillagerLevel valueOf(String)
- **static** VillagerLevel[] values()
- int getId()

## Package: com.github.retrooper.packetevents.protocol.entity.villager.profession

### Class: com.github.retrooper.packetevents.protocol.entity.villager.profession.VillagerProfession
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.StaticMappedEntity

Methods:
- int getId()

### Class: com.github.retrooper.packetevents.protocol.entity.villager.profession.StaticVillagerProfession
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.villager.profession.VillagerProfession

Methods:
- int getId()

### Class: com.github.retrooper.packetevents.protocol.entity.villager.profession.VillagerProfessions
Type: Class

Methods:
- **static** VillagerProfession getById(int)
- **static** VillagerProfession getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** VillagerProfession getByName(String)
- **static** VillagerProfession define(int, String)
- **static** VillagerProfession define(String)

## Package: com.github.retrooper.packetevents.protocol.entity.villager.type

### Class: com.github.retrooper.packetevents.protocol.entity.villager.type.VillagerType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.StaticMappedEntity

Methods:
- int getId()

### Class: com.github.retrooper.packetevents.protocol.entity.villager.type.StaticVillagerType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.villager.type.VillagerType

Methods:
- int getId()

### Class: com.github.retrooper.packetevents.protocol.entity.villager.type.VillagerTypes
Type: Class

Methods:
- **static** VillagerType getById(int)
- **static** VillagerType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** VillagerType getByName(String)
- **static** VillagerType define(int, String)
- **static** VillagerType define(String)

## Package: com.github.retrooper.packetevents.protocol.entity.wolfvariant

### Class: com.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfSoundVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(WolfSoundVariant, ClientVersion)
- Sound getAmbientSound()
- Sound getDeathSound()
- **static** WolfSoundVariant read(PacketWrapper)
- Sound getGrowlSound()
- Sound getPantSound()
- Sound getHurtSound()
- **static** WolfSoundVariant decode(NBT, ClientVersion, TypesBuilderData)
- **static** void write(PacketWrapper, WolfSoundVariant)
- Sound getWhineSound()

### Class: com.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(WolfVariant, ClientVersion)
- **static** NBT encode(PacketWrapper, WolfVariant)
- **static** void writeDirect(PacketWrapper, WolfVariant)
- ResourceLocation getAngryTexture()
- **static** WolfVariant read(PacketWrapper)
- **static** WolfVariant readDirect(PacketWrapper)
- MappedEntitySet getBiomes()
- ResourceLocation getWildTexture()
- ResourceLocation getTameTexture()
- **static** WolfVariant decode(NBT, ClientVersion, TypesBuilderData)
- **static** WolfVariant decode(NBT, PacketWrapper, TypesBuilderData)
- **static** void write(PacketWrapper, WolfVariant)

### Class: com.github.retrooper.packetevents.protocol.entity.wolfvariant.StaticWolfSoundVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfSoundVariant

Methods:
- Sound getAmbientSound()
- Sound getDeathSound()
- Sound getGrowlSound()
- boolean deepEquals(Object)
- int deepHashCode()
- Sound getPantSound()
- Sound getHurtSound()
- WolfSoundVariant copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- Sound getWhineSound()

### Class: com.github.retrooper.packetevents.protocol.entity.wolfvariant.StaticWolfVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfVariant

Methods:
- ResourceLocation getAngryTexture()
- MappedEntitySet getBiomes()
- ResourceLocation getWildTexture()
- boolean deepEquals(Object)
- int deepHashCode()
- String toString()
- ResourceLocation getTameTexture()
- WolfVariant copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)

### Class: com.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfSoundVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** WolfSoundVariant define(String, String)
- **static** WolfSoundVariant define(String, Sound, Sound, Sound, Sound, Sound, Sound)

### Class: com.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfVariants
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** WolfVariant define(String, MappedEntitySet)
- **static** WolfVariant define(String, String, MappedEntitySet)
- **static** WolfVariant define(String, ResourceLocation, ResourceLocation, ResourceLocation, MappedEntitySet)

## Package: com.github.retrooper.packetevents.protocol.item

### Class: com.github.retrooper.packetevents.protocol.item.HashedStack
Type: Class

Methods:
- **static** Optional fromItemStack(ItemStack)
- **static** Optional read(PacketWrapper)
- HashedComponentPatchMap getComponents()
- ItemType getItem()
- int getCount()
- ItemStack asItemStack()
- **static** void write(PacketWrapper, Optional)

### Class: com.github.retrooper.packetevents.protocol.item.ItemStack
Type: Class

Methods:
- **static** NBT encode(PacketWrapper, ItemStack)
- int getMaxStackSize()
- String getEnchantmentsTagName(ClientVersion)
- int getLegacyData()
- NBTCompound getNBT()
- int getEnchantmentLevel(EnchantmentType)
- int getEnchantmentLevel(EnchantmentType, ClientVersion)
- boolean canBeDepleted()
- **static** ItemStack decode(NBT, PacketWrapper)
- **static** ItemStack decode(NBT, ClientVersion)
- boolean hasComponent(ComponentType)
- ItemStack split(int)
- int getDamageValue()
- **static** ItemStack$Builder builder()
- Object getComponentOr(ComponentType, Object)
- boolean isEnchantable()
- boolean isEnchantable(ClientVersion)
- PatchableComponentMap getComponents()
- boolean isStackable()
- ItemStack copy()
- **static** boolean tagMatches(ItemStack, ItemStack)
- void setAmount(int)
- int getMaxDamage()
- int getAmount()
- boolean isDamaged()
- ClientVersion getVersion()
- void setComponents(PatchableComponentMap)
- void grow(int)
- void shrink(int)
- **static** boolean isSameItemSameComponents(ItemStack, ItemStack)
- boolean isEnchanted()
- boolean isEnchanted(ClientVersion)
- IRegistryHolder getRegistryHolder()
- boolean isEmpty()
- boolean is(ItemType)
- void setComponent(ComponentType, Object)
- void setComponent(ComponentType, Optional)
- **static** boolean isSameItemSameTags(ItemStack, ItemStack)
- boolean hasComponentPatches()
- void unsetComponent(ComponentType)
- List getEnchantments()
- List getEnchantments(ClientVersion)
- void setEnchantments(List)
- void setEnchantments(List, ClientVersion)
- ItemType getType()
- NBTCompound getOrCreateTag()
- **static** NBT encodeForParticle(ItemStack, ClientVersion)
- boolean equals(Object)
- String toString()
- void setLegacyData(int)
- Optional getComponent(ComponentType)
- boolean isDamageableItem()
- void setNBT(NBTCompound)
- void setDamageValue(int)

### Class: com.github.retrooper.packetevents.protocol.item.ItemStack$Builder
Type: Class

Methods:
- ItemStack$Builder nbt(NBTCompound)
- ItemStack$Builder nbt(String, NBT)
- ItemStack$Builder component(ComponentType, Object)
- ItemStack$Builder components(PatchableComponentMap)
- ItemStack$Builder amount(int)
- ItemStack build()
- ItemStack$Builder registryHolder(IRegistryHolder)
- ItemStack$Builder legacyData(int)
- ItemStack$Builder wrapper(PacketWrapper)
- ItemStack$Builder type(ItemType)
- ItemStack$Builder version(ClientVersion)
- ItemStack$Builder user(User)

### Class: com.github.retrooper.packetevents.protocol.item.ItemStackSerialization
Type: Class

Methods:
- **static** ItemStack readModern(PacketWrapper)
- **static** ItemStack read(PacketWrapper)
- **static** void writeUntrusted(PacketWrapper, ItemStack)
- **static** ItemStack readUntrusted(PacketWrapper)
- **static** void writeModern(PacketWrapper, ItemStack)
- **static** void write(PacketWrapper, ItemStack)

## Package: com.github.retrooper.packetevents.protocol.item.armormaterial

### Class: com.github.retrooper.packetevents.protocol.item.armormaterial.ArmorMaterial
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.item.armormaterial.ArmorMaterials
Type: Class

Methods:
- **static** ArmorMaterial getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** ArmorMaterial getByName(String)

### Class: com.github.retrooper.packetevents.protocol.item.armormaterial.StaticArmorMaterial
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.item.armormaterial.ArmorMaterial

No public methods found

## Package: com.github.retrooper.packetevents.protocol.item.banner

### Class: com.github.retrooper.packetevents.protocol.item.banner.BannerPattern
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(BannerPattern, ClientVersion)
- **static** void writeDirect(PacketWrapper, BannerPattern)
- **static** BannerPattern readDirect(PacketWrapper)
- String getTranslationKey()
- **static** BannerPattern decode(NBT, ClientVersion, TypesBuilderData)
- ResourceLocation getAssetId()

### Class: com.github.retrooper.packetevents.protocol.item.banner.BannerPatterns
Type: Class

Methods:
- **static** BannerPattern getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** BannerPattern getByName(String)
- **static** BannerPattern define(String)
- **static** BannerPattern define(String, ResourceLocation, String)

### Class: com.github.retrooper.packetevents.protocol.item.banner.StaticBannerPattern
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.item.banner.BannerPattern

Methods:
- boolean deepEquals(Object)
- int deepHashCode()
- String getTranslationKey()
- String toString()
- BannerPattern copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- ResourceLocation getAssetId()

## Package: com.github.retrooper.packetevents.protocol.item.book

### Class: com.github.retrooper.packetevents.protocol.item.book.BookType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BookType getById(int)
- **static** BookType valueOf(String)
- **static** BookType[] values()
- int getId()

## Package: com.github.retrooper.packetevents.protocol.item.consumables

### Class: com.github.retrooper.packetevents.protocol.item.consumables.ConsumeEffectType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- ConsumeEffect read(PacketWrapper)
- void write(PacketWrapper, ConsumeEffect)

### Class: com.github.retrooper.packetevents.protocol.item.consumables.ConsumeEffect
Type: Abstract Class

Methods:
- **static** ConsumeEffect readFull(PacketWrapper)
- ConsumeEffectType getType()
- **static** void writeFull(PacketWrapper, ConsumeEffect)

### Class: com.github.retrooper.packetevents.protocol.item.consumables.ConsumeEffectTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** ConsumeEffectType define(String, PacketWrapper$Reader, PacketWrapper$Writer)

### Class: com.github.retrooper.packetevents.protocol.item.consumables.StaticConsumeEffectType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.item.consumables.ConsumeEffectType

Methods:
- ConsumeEffect read(PacketWrapper)
- void write(PacketWrapper, ConsumeEffect)

## Package: com.github.retrooper.packetevents.protocol.item.consumables.builtin

### Class: com.github.retrooper.packetevents.protocol.item.consumables.builtin.ApplyEffectsConsumeEffect
Type: Class
Extends: com.github.retrooper.packetevents.protocol.item.consumables.ConsumeEffect

Methods:
- List getEffects()
- **static** ApplyEffectsConsumeEffect read(PacketWrapper)
- float getProbability()
- **static** void write(PacketWrapper, ApplyEffectsConsumeEffect)

### Class: com.github.retrooper.packetevents.protocol.item.consumables.builtin.ClearAllEffectsConsumeEffect
Type: Class
Extends: com.github.retrooper.packetevents.protocol.item.consumables.ConsumeEffect

Methods:
- **static** ClearAllEffectsConsumeEffect read(PacketWrapper)
- **static** void write(PacketWrapper, ClearAllEffectsConsumeEffect)

### Class: com.github.retrooper.packetevents.protocol.item.consumables.builtin.PlaySoundConsumeEffect
Type: Class
Extends: com.github.retrooper.packetevents.protocol.item.consumables.ConsumeEffect

Methods:
- **static** PlaySoundConsumeEffect read(PacketWrapper)
- **static** void write(PacketWrapper, PlaySoundConsumeEffect)
- Sound getSound()

### Class: com.github.retrooper.packetevents.protocol.item.consumables.builtin.RemoveEffectsConsumeEffect
Type: Class
Extends: com.github.retrooper.packetevents.protocol.item.consumables.ConsumeEffect

Methods:
- MappedEntitySet getEffects()
- **static** RemoveEffectsConsumeEffect read(PacketWrapper)
- **static** void write(PacketWrapper, RemoveEffectsConsumeEffect)

### Class: com.github.retrooper.packetevents.protocol.item.consumables.builtin.TeleportRandomlyConsumeEffect
Type: Class
Extends: com.github.retrooper.packetevents.protocol.item.consumables.ConsumeEffect

Methods:
- float getDiameter()
- **static** TeleportRandomlyConsumeEffect read(PacketWrapper)
- **static** void write(PacketWrapper, TeleportRandomlyConsumeEffect)

## Package: com.github.retrooper.packetevents.protocol.item.enchantment

### Class: com.github.retrooper.packetevents.protocol.item.enchantment.Enchantment
Type: Class

Methods:
- int getLevel()
- EnchantmentType getType()
- **static** Enchantment$Builder builder()
- void setType(EnchantmentType)
- void setLevel(int)

### Class: com.github.retrooper.packetevents.protocol.item.enchantment.Enchantment$Builder
Type: Class

Methods:
- Enchantment build()
- Enchantment$Builder level(int)
- Enchantment$Builder type(EnchantmentType)

### Class: com.github.retrooper.packetevents.protocol.item.enchantment.EnchantmentCost
Type: Class

Methods:
- **static** NBT encode(EnchantmentCost, ClientVersion)
- **static** NBT encode(PacketWrapper, EnchantmentCost)
- int getPerLevelAboveFirst()
- int hashCode()
- boolean equals(Object)
- String toString()
- int getBase()
- **static** EnchantmentCost decode(NBT, ClientVersion)
- **static** EnchantmentCost decode(NBT, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.item.enchantment.EnchantmentDefinition
Type: Class

Methods:
- **static** NBT encode(EnchantmentDefinition, ClientVersion)
- **static** NBT encode(PacketWrapper, EnchantmentDefinition)
- **static** void encode(NBTCompound, PacketWrapper, EnchantmentDefinition)
- int hashCode()
- EnchantmentCost getMinCost()
- int getWeight()
- Optional getPrimaryItems()
- boolean equals(Object)
- int getAnvilCost()
- MappedEntitySet getSupportedItems()
- String toString()
- List getSlots()
- **static** EnchantmentDefinition decode(NBT, ClientVersion)
- **static** EnchantmentDefinition decode(NBT, PacketWrapper)
- int getMaxLevel()
- EnchantmentCost getMaxCost()

## Package: com.github.retrooper.packetevents.protocol.item.enchantment.type

### Class: com.github.retrooper.packetevents.protocol.item.enchantment.type.EnchantmentType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(EnchantmentType, ClientVersion)
- **static** NBT encode(EnchantmentType, PacketWrapper)
- MappedEntityRefSet getExclusiveRefSet()
- EnchantmentDefinition getDefinition()
- StaticComponentMap getEffects()
- MappedEntitySet getExclusiveSet()
- **static** EnchantmentType decode(NBT, ClientVersion, TypesBuilderData)
- **static** EnchantmentType decode(NBT, PacketWrapper, TypesBuilderData)
- Component getDescription()

### Class: com.github.retrooper.packetevents.protocol.item.enchantment.type.EnchantmentTypes
Type: Class

Methods:
- **static** EnchantmentType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** EnchantmentType getByName(String)
- **static** EnchantmentType define(String)

### Class: com.github.retrooper.packetevents.protocol.item.enchantment.type.StaticEnchantmentType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.item.enchantment.type.EnchantmentType, com.github.retrooper.packetevents.protocol.mapper.ResolvableEntity

Methods:
- MappedEntityRefSet getExclusiveRefSet()
- EnchantmentDefinition getDefinition()
- StaticComponentMap getEffects()
- boolean deepEquals(Object)
- int deepHashCode()
- MappedEntitySet getExclusiveSet()
- String toString()
- EnchantmentType copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- Component getDescription()
- void doResolve(PacketWrapper)

## Package: com.github.retrooper.packetevents.protocol.item.instrument

### Class: com.github.retrooper.packetevents.protocol.item.instrument.Instrument
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(Instrument, ClientVersion)
- **static** NBT encode(PacketWrapper, Instrument)
- **static** void writeDirect(PacketWrapper, Instrument)
- **static** Instrument read(PacketWrapper)
- **static** Instrument readDirect(PacketWrapper)
- float getUseSeconds()
- float getRange()
- **static** Instrument decode(NBT, ClientVersion, TypesBuilderData)
- **static** Instrument decode(NBT, PacketWrapper, TypesBuilderData)
- **static** void write(PacketWrapper, Instrument)
- Component getDescription()
- int getUseDuration()
- Sound getSound()

### Class: com.github.retrooper.packetevents.protocol.item.instrument.Instruments
Type: Class

Methods:
- **static** Instrument getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Instrument getByName(String)
- **static** Instrument define(String, Sound)
- **static** Instrument define(String, Sound, int, float)

### Class: com.github.retrooper.packetevents.protocol.item.instrument.StaticInstrument
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.item.instrument.Instrument

Methods:
- boolean deepEquals(Object)
- float getUseSeconds()
- int deepHashCode()
- float getRange()
- Instrument copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- Component getDescription()
- Sound getSound()

## Package: com.github.retrooper.packetevents.protocol.item.jukebox

### Class: com.github.retrooper.packetevents.protocol.item.jukebox.IJukeboxSong
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(IJukeboxSong, ClientVersion)
- **static** NBT encode(PacketWrapper, IJukeboxSong)
- **static** void writeDirect(PacketWrapper, IJukeboxSong)
- **static** IJukeboxSong read(PacketWrapper)
- **static** IJukeboxSong readDirect(PacketWrapper)
- float getLengthInSeconds()
- **static** IJukeboxSong decode(NBT, ClientVersion, TypesBuilderData)
- **static** IJukeboxSong decode(NBT, PacketWrapper, TypesBuilderData)
- **static** void write(PacketWrapper, IJukeboxSong)
- Component getDescription()
- int getComparatorOutput()
- Sound getSound()

### Class: com.github.retrooper.packetevents.protocol.item.jukebox.JukeboxSong
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.item.jukebox.IJukeboxSong

Methods:
- void setLengthInSeconds(float)
- **static** JukeboxSong read(PacketWrapper)
- boolean deepEquals(Object)
- float getLengthInSeconds()
- void setComparatorOutput(int)
- void setDescription(Component)
- Component getDescription()
- int getComparatorOutput()
- int deepHashCode()
- void setSound(Sound)
- String toString()
- IJukeboxSong copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- **static** void write(PacketWrapper, JukeboxSong)
- Sound getSound()

### Class: com.github.retrooper.packetevents.protocol.item.jukebox.JukeboxSongs
Type: Class

Methods:
- **static** IJukeboxSong getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** IJukeboxSong getByName(String)
- **static** IJukeboxSong define(String, Sound, float, int)

## Package: com.github.retrooper.packetevents.protocol.item.mapdecoration

### Class: com.github.retrooper.packetevents.protocol.item.mapdecoration.MapDecorationType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- boolean isShowOnItemFrame()
- int getMapColor()
- boolean isExplorationMapElement()
- ResourceLocation getAssetId()
- boolean isTrackCount()

### Class: com.github.retrooper.packetevents.protocol.item.mapdecoration.MapDecorationTypes
Type: Class

Methods:
- **static** MapDecorationType getById(int, ClientVersion)
- **static** MapDecorationType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** MapDecorationType getByName(String)
- **static** MapDecorationType define(String, boolean, boolean)
- **static** MapDecorationType define(String, ResourceLocation, boolean, boolean)
- **static** MapDecorationType define(String, boolean, int, boolean, boolean)
- **static** MapDecorationType define(String, ResourceLocation, boolean, int, boolean, boolean)

### Class: com.github.retrooper.packetevents.protocol.item.mapdecoration.StaticMapDecorationType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.item.mapdecoration.MapDecorationType

Methods:
- boolean isShowOnItemFrame()
- int getMapColor()
- boolean isExplorationMapElement()
- ResourceLocation getAssetId()
- boolean isTrackCount()

## Package: com.github.retrooper.packetevents.protocol.item.trimmaterial

### Class: com.github.retrooper.packetevents.protocol.item.trimmaterial.TrimMaterial
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(TrimMaterial, ClientVersion)
- **static** NBT encode(PacketWrapper, TrimMaterial)
- **static** void writeDirect(PacketWrapper, TrimMaterial)
- **static** TrimMaterial read(PacketWrapper)
- **static** TrimMaterial readDirect(PacketWrapper)
- float getItemModelIndex()
- ItemType getIngredient()
- String getAssetName()
- Map getOverrideArmorMaterials()
- String getArmorMaterialOverride(ArmorMaterial)
- **static** TrimMaterial decode(NBT, ClientVersion, TypesBuilderData)
- **static** TrimMaterial decode(NBT, PacketWrapper, TypesBuilderData)
- **static** void write(PacketWrapper, TrimMaterial)
- Component getDescription()

### Class: com.github.retrooper.packetevents.protocol.item.trimmaterial.StaticTrimMaterial
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.item.trimmaterial.TrimMaterial

Methods:
- float getItemModelIndex()
- ItemType getIngredient()
- boolean deepEquals(Object)
- String getAssetName()
- int deepHashCode()
- Map getOverrideArmorMaterials()
- String toString()
- TrimMaterial copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- Component getDescription()

### Class: com.github.retrooper.packetevents.protocol.item.trimmaterial.TrimMaterials
Type: Class

Methods:
- **static** TrimMaterial getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** TrimMaterial getByName(String)
- **static** TrimMaterial define(String, ItemType, float, int)
- **static** TrimMaterial define(String, String, ItemType, float, Map, Component)

## Package: com.github.retrooper.packetevents.protocol.item.trimpattern

### Class: com.github.retrooper.packetevents.protocol.item.trimpattern.TrimPattern
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(TrimPattern, ClientVersion)
- **static** NBT encode(PacketWrapper, TrimPattern)
- **static** void writeDirect(PacketWrapper, TrimPattern)
- ItemType getTemplateItem()
- **static** TrimPattern read(PacketWrapper)
- **static** TrimPattern readDirect(PacketWrapper)
- boolean isDecal()
- **static** TrimPattern decode(NBT, ClientVersion, TypesBuilderData)
- **static** TrimPattern decode(NBT, PacketWrapper, TypesBuilderData)
- **static** void write(PacketWrapper, TrimPattern)
- Component getDescription()
- ResourceLocation getAssetId()

### Class: com.github.retrooper.packetevents.protocol.item.trimpattern.StaticTrimPattern
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.item.trimpattern.TrimPattern

Methods:
- ItemType getTemplateItem()
- boolean deepEquals(Object)
- int deepHashCode()
- String toString()
- boolean isDecal()
- TrimPattern copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- Component getDescription()
- ResourceLocation getAssetId()

### Class: com.github.retrooper.packetevents.protocol.item.trimpattern.TrimPatterns
Type: Class

Methods:
- **static** TrimPattern getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** TrimPattern getByName(String)
- **static** TrimPattern define(String)
- **static** TrimPattern define(String, ResourceLocation, ItemType, Component, boolean)

## Package: com.github.retrooper.packetevents.protocol.item.type

### Class: com.github.retrooper.packetevents.protocol.item.type.ItemType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- Set getAttributes()
- StateType getPlacedType()
- boolean isMusicDisc()
- boolean hasAttribute(ItemTypes$ItemAttribute)
- StaticComponentMap getComponents()
- StaticComponentMap getComponents(ClientVersion)
- int getMaxDurability()
- int getMaxAmount()
- ItemType getCraftRemainder()

### Class: com.github.retrooper.packetevents.protocol.item.type.ItemTypes
Type: Class

Methods:
- **static** ItemType getTypePlacingState(StateType)
- **static** ItemType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** ItemType getByName(String)
- **static** ItemType define(int, String, ItemType, StateType, int, List)
- **static** ItemTypes$Builder builder(String)

### Class: com.github.retrooper.packetevents.protocol.item.type.ItemTypes$Builder
Type: Class

Methods:
- ItemType build()
- ItemTypes$Builder setMaxDurability(int)
- ItemTypes$Builder setPlacedType(StateType)
- ItemTypes$Builder setAttributes(ItemTypes$ItemAttribute[])
- ItemTypes$Builder setCraftRemainder(ItemType)
- ItemTypes$Builder setMaxAmount(int)

### Class: com.github.retrooper.packetevents.protocol.item.type.ItemTypes$ItemAttribute
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ItemTypes$ItemAttribute valueOf(String)
- **static** ItemTypes$ItemAttribute[] values()

### Class: com.github.retrooper.packetevents.protocol.item.type.StaticItemType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.item.type.ItemType

Methods:
- Set getAttributes()
- StateType getPlacedType()
- StaticComponentMap getComponents(ClientVersion)
- int getMaxDurability()
- int getMaxAmount()
- ItemType getCraftRemainder()

## Package: com.github.retrooper.packetevents.protocol.mapper

### Class: com.github.retrooper.packetevents.protocol.mapper.CopyableEntity
Type: Interface

Methods:
- MappedEntity copy(TypesBuilderData)

### Class: com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity
Type: Interface

Methods:
- boolean deepEquals(Object)
- int deepHashCode()

### Class: com.github.retrooper.packetevents.protocol.mapper.LegacyMappedEntity
Type: Interface

Methods:
- ResourceLocation getName()
- int getLegacyId(ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.mapper.MappedEntity
Type: Interface

Methods:
- ResourceLocation getName()
- boolean isRegistered()
- int getId(ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.mapper.MappedEntityRef
Type: Interface
Implements: java.util.function.Supplier

Methods:
- **static** NBT encode(PacketWrapper, NbtEncoder, MappedEntityRef)
- MappedEntity get()
- Object get()
- **static** MappedEntityRef decode(NBT, IRegistry, NbtDecoder, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.mapper.MappedEntityRefSet
Type: Interface

Methods:
- MappedEntitySet resolve(PacketWrapper, IRegistry)
- MappedEntitySet resolve(ClientVersion, IRegistryHolder, IRegistry)
- MappedEntitySet resolve(ClientVersion, IRegistry)
- boolean isEmpty()

### Class: com.github.retrooper.packetevents.protocol.mapper.ResolvableEntity
Type: Interface

Methods:
- void doResolve(PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.mapper.StaticMappedEntity
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- int getId()
- int getId(ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Type: Abstract Class
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- ResourceLocation getName()
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean isRegistered()
- int getId(ClientVersion)
- TypesBuilderData getRegistryData()

### Class: com.github.retrooper.packetevents.protocol.mapper.GenericMappedEntity
Type: Class
Implements: com.github.retrooper.packetevents.protocol.mapper.StaticMappedEntity

Methods:
- ResourceLocation getName()
- **static** GenericMappedEntity read(PacketWrapper)
- **static** GenericMappedEntity getById(ClientVersion, int)
- int getId()
- **static** void write(PacketWrapper, GenericMappedEntity)

### Class: com.github.retrooper.packetevents.protocol.mapper.MappedEntityRef$Named
Type: Class
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntityRef

Methods:
- MappedEntity get()
- Object get()

### Class: com.github.retrooper.packetevents.protocol.mapper.MappedEntityRef$Static
Type: Class
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntityRef

Methods:
- MappedEntity get()
- Object get()

### Class: com.github.retrooper.packetevents.protocol.mapper.MappedEntitySet
Type: Class
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntityRefSet

Methods:
- **static** NBT encodeRefSet(PacketWrapper, MappedEntityRefSet)
- **static** NBT encodeRefSet(MappedEntityRefSet, ClientVersion)
- **static** NBT encode(MappedEntitySet, ClientVersion)
- **static** NBT encode(PacketWrapper, MappedEntitySet)
- **static** MappedEntitySet read(PacketWrapper, BiFunction)
- MappedEntitySet resolve(PacketWrapper, IRegistry)
- MappedEntitySet resolve(ClientVersion, IRegistryHolder, IRegistry)
- MappedEntitySet resolve(ClientVersion, IRegistry)
- **static** MappedEntityRefSet readRefSet(PacketWrapper)
- boolean isEmpty()
- ResourceLocation getTagKey()
- **static** MappedEntitySet decode(NBT, ClientVersion, IRegistry)
- **static** MappedEntitySet decode(NBT, PacketWrapper, IRegistry)
- **static** void writeRefSet(PacketWrapper, MappedEntityRefSet)
- **static** MappedEntitySet createEmpty()
- **static** MappedEntityRefSet decodeRefSet(NBT, PacketWrapper)
- **static** MappedEntityRefSet decodeRefSet(NBT, ClientVersion)
- int hashCode()
- boolean equals(Object)
- List getEntities()
- String toString()
- **static** void write(PacketWrapper, MappedEntitySet)

### Class: com.github.retrooper.packetevents.protocol.mapper.MaybeMappedEntity
Type: Class

Methods:
- MappedEntity getValue()
- ResourceLocation getName()
- MappedEntity getValueOrThrow()
- **static** MaybeMappedEntity read(PacketWrapper, IRegistry, PacketWrapper$Reader)
- int hashCode()
- boolean equals(Object)
- **static** void write(PacketWrapper, MaybeMappedEntity, PacketWrapper$Writer)

## Package: com.github.retrooper.packetevents.protocol.nbt

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTLimiter
Type: Interface

Methods:
- **static** NBTLimiter noop()
- void checkReadability(int)
- **static** NBTLimiter forBuffer(Object)
- **static** NBTLimiter forBuffer(Object, int)
- void increment(int)

### Class: com.github.retrooper.packetevents.protocol.nbt.NBT
Type: Abstract Class

Methods:
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- String toString()
- NBT copy()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTByte
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBTNumber

Methods:
- float getAsFloat()
- byte getAsByte()
- boolean getAsBool()
- Number getAsNumber()
- double getAsDouble()
- int getAsInt()
- long getAsLong()
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- String toString()
- NBTByte copy()
- NBT copy()
- short getAsShort()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTByteArray
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBT

Methods:
- byte[] getValue()
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- String toString()
- NBTByteArray copy()
- NBT copy()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTCompound
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBT

Methods:
- Object getOr(String, NbtDecoder, Object, PacketWrapper)
- NBTList getTagListOfTypeOrThrow(String, Class)
- Map getTags()
- NBTCompound getCompoundTagOrThrow(String)
- NBT getTagOrNull(String)
- NBTList getCompoundListTagOrThrow(String)
- NBTCompound getCompoundTagOrNull(String)
- List getListOrThrow(String, NbtDecoder, PacketWrapper)
- NBT removeTag(String)
- NBT getTagOfTypeOrNull(String, Class)
- NBTString getStringTagOrThrow(String)
- NBTList getTagListOfTypeOrNull(String, Class)
- Set getTagNames()
- NBTNumber getNumberTagOrNull(String)
- NBTList getCompoundListTagOrNull(String)
- NBTNumber getNumberTagOrThrow(String)
- int size()
- NBTType getType()
- String getStringTagValueOrDefault(String, String)
- NBTList getStringListTagOrThrow(String)
- NBT getTagOfTypeOrThrow(String, Class)
- List getListOrNull(String, NbtDecoder, PacketWrapper)
- List getListOrEmpty(String, NbtDecoder, PacketWrapper)
- NBTList getNumberListTagOrNull(String)
- Number getNumberTagValueOrThrow(String)
- void setCompactList(String, List, NbtEncoder, PacketWrapper)
- NBTList removeTagAndReturnIfListType(String, Class)
- NBT removeTagAndReturnIfType(String, Class)
- NBTList getStringListTagOrNull(String)
- NBTList getNumberTagListTagOrThrow(String)
- NBT getTagOrThrow(String)
- int hashCode()
- boolean getBoolean(String)
- void setTag(String, NBT)
- NBTCompound copy()
- NBT copy()
- void set(String, Object, NbtEncoder, PacketWrapper)
- NBTString getStringTagOrNull(String)
- String getStringTagValueOrThrow(String)
- boolean isEmpty()
- boolean getBooleanOr(String, boolean)
- void setList(String, List, NbtEncoder, PacketWrapper)
- Object getOrNull(String, NbtDecoder, PacketWrapper)
- Number getNumberTagValueOrDefault(String, Number)
- boolean equals(Object)
- List getListOr(String, NbtDecoder, List, PacketWrapper)
- Object getOrThrow(String, NbtDecoder, PacketWrapper)
- String getStringTagValueOrNull(String)
- String toString()
- Number getNumberTagValueOrNull(String)

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTDouble
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBTNumber

Methods:
- float getAsFloat()
- byte getAsByte()
- long getAsLong()
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- Number getAsNumber()
- String toString()
- NBTDouble copy()
- NBT copy()
- double getAsDouble()
- short getAsShort()
- int getAsInt()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTEnd
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBT

Methods:
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- String toString()
- NBTEnd copy()
- NBT copy()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTFloat
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBTNumber

Methods:
- float getAsFloat()
- byte getAsByte()
- long getAsLong()
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- Number getAsNumber()
- String toString()
- NBTFloat copy()
- NBT copy()
- double getAsDouble()
- short getAsShort()
- int getAsInt()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTInt
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBTNumber

Methods:
- float getAsFloat()
- byte getAsByte()
- long getAsLong()
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- Number getAsNumber()
- String toString()
- NBTInt copy()
- NBT copy()
- double getAsDouble()
- short getAsShort()
- int getAsInt()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTIntArray
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBT

Methods:
- int[] getValue()
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- String toString()
- NBTIntArray copy()
- NBT copy()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTList
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBT

Methods:
- **static** NBTList createStringList()
- **static** NBTList createCompoundList()
- boolean isEmpty()
- List getTags()
- void addTag(int, NBT)
- void addTag(NBT)
- NBT getTag(int)
- void addTagUnsafe(int, NBT)
- void addTagUnsafe(NBT)
- int size()
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- NBTType getTagsType()
- void removeTag(int)
- String toString()
- void setTag(int, NBT)
- NBTList copy()
- NBT copy()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTLong
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBTNumber

Methods:
- float getAsFloat()
- byte getAsByte()
- long getAsLong()
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- Number getAsNumber()
- String toString()
- NBTLong copy()
- NBT copy()
- double getAsDouble()
- short getAsShort()
- int getAsInt()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTLongArray
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBT

Methods:
- long[] getValue()
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- String toString()
- NBTLongArray copy()
- NBT copy()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTNumber
Type: Abstract Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBT

Methods:
- float getAsFloat()
- byte getAsByte()
- long getAsLong()
- Number getAsNumber()
- double getAsDouble()
- short getAsShort()
- int getAsInt()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTShort
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBTNumber

Methods:
- float getAsFloat()
- byte getAsByte()
- long getAsLong()
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- Number getAsNumber()
- String toString()
- NBTShort copy()
- NBT copy()
- double getAsDouble()
- short getAsShort()
- int getAsInt()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTString
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBT

Methods:
- String getValue()
- NBTType getType()
- int hashCode()
- boolean equals(Object)
- String toString()
- NBTString copy()
- NBT copy()

### Class: com.github.retrooper.packetevents.protocol.nbt.NBTType
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()
- Class getNBTClass()

## Package: com.github.retrooper.packetevents.protocol.nbt.codec

### Class: com.github.retrooper.packetevents.protocol.nbt.codec.NBTCodec
Type: Class

Methods:
- **static** NBT jsonToNBT(JsonElement)
- **static** void writeNBTToBuffer(Object, ServerVersion, NBTCompound)
- **static** void writeNBTToBuffer(Object, ServerVersion, NBT)
- **static** NBT readNBTFromBuffer(Object, ServerVersion)
- **static** NBT readNBTFromBuffer(Object, ServerVersion, NBTLimiter)
- **static** JsonElement nbtToJson(NBT, boolean)

## Package: com.github.retrooper.packetevents.protocol.nbt.serializer

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTReader
Type: Interface

Methods:
- NBT deserializeTag(NBTLimiter, Object) throws IOException
- NBT deserializeTag(NBTLimiter, Object, boolean) throws IOException

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTSerializer$IdReader
Type: Interface

Methods:
- int readId(NBTLimiter, Object) throws IOException

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTSerializer$IdWriter
Type: Interface

Methods:
- void writeId(Object, int) throws IOException

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTSerializer$NameReader
Type: Interface

Methods:
- String readName(NBTLimiter, Object) throws IOException

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTSerializer$NameWriter
Type: Interface

Methods:
- void writeName(Object, String) throws IOException

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTSerializer$TagReader
Type: Interface

Methods:
- NBT readTag(NBTLimiter, Object) throws IOException

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTSerializer$TagWriter
Type: Interface

Methods:
- void writeTag(Object, NBT) throws IOException

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTWriter
Type: Interface

Methods:
- void serializeTag(Object, NBT) throws IOException
- void serializeTag(Object, NBT, boolean) throws IOException

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.DefaultNBTSerializer
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTSerializer

No public methods found

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTSerializer
Type: Class
Implements: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTReader, com.github.retrooper.packetevents.protocol.nbt.serializer.NBTWriter

Methods:
- NBT deserializeTag(NBTLimiter, Object, boolean) throws IOException
- void serializeTag(Object, NBT, boolean) throws IOException

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.SequentialNBTReader
Type: Class
Implements: com.github.retrooper.packetevents.protocol.nbt.serializer.NBTReader

Methods:
- NBT deserializeTag(NBTLimiter, DataInputStream, boolean) throws IOException
- NBT deserializeTag(NBTLimiter, Object, boolean) throws IOException

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.SequentialNBTReader$Compound
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBT
Implements: java.util.Iterator, java.lang.Iterable, com.github.retrooper.packetevents.protocol.nbt.serializer.SequentialNBTReader$Skippable, java.io.Closeable

Methods:
- Map$Entry next()
- Object next()
- Iterator iterator()
- NBTType getType()
- NBTCompound readFully()
- int hashCode()
- boolean equals(Object)
- byte[] readFullyAsBytes()
- void skipOne()
- void skip()
- boolean hasNext()
- NBT copy()
- void close() throws IOException

### Class: com.github.retrooper.packetevents.protocol.nbt.serializer.SequentialNBTReader$List
Type: Class
Extends: com.github.retrooper.packetevents.protocol.nbt.NBT
Implements: java.util.Iterator, java.lang.Iterable, com.github.retrooper.packetevents.protocol.nbt.serializer.SequentialNBTReader$Skippable, java.io.Closeable

Methods:
- NBT next()
- Object next()
- Iterator iterator()
- NBTType getType()
- NBTList readFully()
- int hashCode()
- boolean equals(Object)
- byte[] readFullyAsBinary()
- void skipOne()
- void skip()
- boolean hasNext()
- NBT copy()
- void close() throws IOException

## Package: com.github.retrooper.packetevents.protocol.npc

### Class: com.github.retrooper.packetevents.protocol.npc.NPC
Type: Class

Methods:
- void setPrefixName(Component)
- Location getLocation()
- void setMainHand(ItemStack)
- void updateEquipment()
- void teleport(Location)
- GameMode getGameMode()
- int getId()
- void despawn(Object)
- WrapperPlayServerPlayerInfo$PlayerData getLegacyPlayerInfoData()
- NamedTextColor getNameColor()
- void setTeamName(String)
- void updateRotation(float, float)
- void setLocation(Location)
- Component getSuffixName()
- String getTeamName()
- void setChestplate(ItemStack)
- void setOffHand(ItemStack)
- int getDisplayPing()
- boolean hasSpawned(Object)
- WrapperPlayServerPlayerInfoUpdate$PlayerInfo getModernPlayerInfoData()
- void setTabName(Component)
- void changeSkin(UUID, List)
- ItemStack getOffHand()
- void updateTabPing(int)
- UserProfile getProfile()
- Component getPrefixName()
- void setNameColor(NamedTextColor)
- void setHelmet(ItemStack)
- void setLeggings(ItemStack)
- void setGameMode(GameMode)
- ItemStack getChestplate()
- ItemStack getMainHand()
- ItemStack getLeggings()
- void despawnAll()
- ItemStack getHelmet()
- void updateLocation(Location)
- void spawn(Object)
- void setSuffixName(Component)
- Set getChannels()
- void updateGameMode(GameMode)
- void setDisplayPing(int)
- Component getTabName()
- void setBoots(ItemStack)
- ItemStack getBoots()
- void updateNameTag()

## Package: com.github.retrooper.packetevents.protocol.packettype

### Class: com.github.retrooper.packetevents.protocol.packettype.ClientBoundPacket
Type: Interface

No public methods found

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketTypeCommon
Type: Interface

Methods:
- String getName()
- PacketSide getSide()
- int getId(ClientVersion)
- Class getWrapperClass()

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketTypeConstant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.packettype.PacketTypeCommon

Methods:
- int getId(ClientVersion)
- int getId()

### Class: com.github.retrooper.packetevents.protocol.packettype.ServerBoundPacket
Type: Interface

No public methods found

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType
Type: Class

Methods:
- **static** void prepare()
- **static** boolean isPrepared()
- **static** PacketTypeCommon getById(PacketSide, ConnectionState, ClientVersion, int)

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Configuration
Type: Class

No public methods found

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Configuration$Client
Type: Enum
Extends: java.lang.Enum
Implements: com.github.retrooper.packetevents.protocol.packettype.PacketTypeCommon, com.github.retrooper.packetevents.protocol.packettype.ServerBoundPacket

Methods:
- **static** void load()
- **static** PacketTypeCommon getById(int)
- **static** PacketTypeCommon getById(ClientVersion, int)
- **static** PacketType$Configuration$Client valueOf(String)
- **static** PacketType$Configuration$Client[] values()
- PacketSide getSide()
- int getId()
- int getId(ClientVersion)
- Class getWrapperClass()

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Configuration$Server
Type: Enum
Extends: java.lang.Enum
Implements: com.github.retrooper.packetevents.protocol.packettype.PacketTypeCommon, com.github.retrooper.packetevents.protocol.packettype.ClientBoundPacket

Methods:
- **static** void load()
- **static** PacketTypeCommon getById(int)
- **static** PacketTypeCommon getById(ClientVersion, int)
- **static** PacketType$Configuration$Server valueOf(String)
- **static** PacketType$Configuration$Server[] values()
- PacketSide getSide()
- int getId()
- int getId(ClientVersion)
- Class getWrapperClass()

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Handshaking
Type: Class

No public methods found

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Handshaking$Client
Type: Enum
Extends: java.lang.Enum
Implements: com.github.retrooper.packetevents.protocol.packettype.PacketTypeConstant, com.github.retrooper.packetevents.protocol.packettype.ServerBoundPacket

Methods:
- **static** PacketTypeCommon getById(int)
- **static** PacketType$Handshaking$Client valueOf(String)
- **static** PacketType$Handshaking$Client[] values()
- PacketSide getSide()
- int getId()
- Class getWrapperClass()

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Handshaking$Server
Type: Enum
Extends: java.lang.Enum
Implements: com.github.retrooper.packetevents.protocol.packettype.PacketTypeConstant, com.github.retrooper.packetevents.protocol.packettype.ClientBoundPacket

Methods:
- **static** PacketTypeCommon getById(int)
- **static** PacketType$Handshaking$Server valueOf(String)
- **static** PacketType$Handshaking$Server[] values()
- PacketSide getSide()
- int getId()
- Class getWrapperClass()

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Login
Type: Class

No public methods found

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Login$Client
Type: Enum
Extends: java.lang.Enum
Implements: com.github.retrooper.packetevents.protocol.packettype.PacketTypeConstant, com.github.retrooper.packetevents.protocol.packettype.ServerBoundPacket

Methods:
- **static** PacketTypeCommon getById(int)
- **static** PacketType$Login$Client valueOf(String)
- **static** PacketType$Login$Client[] values()
- PacketSide getSide()
- int getId()
- Class getWrapperClass()

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Login$Server
Type: Enum
Extends: java.lang.Enum
Implements: com.github.retrooper.packetevents.protocol.packettype.PacketTypeConstant, com.github.retrooper.packetevents.protocol.packettype.ClientBoundPacket

Methods:
- **static** PacketTypeCommon getById(int)
- **static** PacketType$Login$Server valueOf(String)
- **static** PacketType$Login$Server[] values()
- PacketSide getSide()
- int getId()
- Class getWrapperClass()

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Play
Type: Class

No public methods found

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Play$Client
Type: Enum
Extends: java.lang.Enum
Implements: com.github.retrooper.packetevents.protocol.packettype.PacketTypeCommon, com.github.retrooper.packetevents.protocol.packettype.ServerBoundPacket

Methods:
- **static** void load()
- **static** PacketTypeCommon getById(ClientVersion, int)
- **static** PacketType$Play$Client valueOf(String)
- **static** PacketType$Play$Client[] values()
- PacketSide getSide()
- int getId(ClientVersion)
- Class getWrapperClass()

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Play$Server
Type: Enum
Extends: java.lang.Enum
Implements: com.github.retrooper.packetevents.protocol.packettype.PacketTypeCommon, com.github.retrooper.packetevents.protocol.packettype.ClientBoundPacket

Methods:
- **static** void load()
- **static** PacketTypeCommon getById(ClientVersion, int)
- **static** PacketType$Play$Server valueOf(String)
- **static** PacketType$Play$Server[] values()
- PacketSide getSide()
- int getId(ClientVersion)
- Class getWrapperClass()

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Status
Type: Class

No public methods found

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Status$Client
Type: Enum
Extends: java.lang.Enum
Implements: com.github.retrooper.packetevents.protocol.packettype.PacketTypeConstant, com.github.retrooper.packetevents.protocol.packettype.ServerBoundPacket

Methods:
- **static** PacketTypeCommon getById(int)
- **static** PacketType$Status$Client valueOf(String)
- **static** PacketType$Status$Client[] values()
- PacketSide getSide()
- int getId()
- Class getWrapperClass()

### Class: com.github.retrooper.packetevents.protocol.packettype.PacketType$Status$Server
Type: Enum
Extends: java.lang.Enum
Implements: com.github.retrooper.packetevents.protocol.packettype.PacketTypeConstant, com.github.retrooper.packetevents.protocol.packettype.ClientBoundPacket

Methods:
- **static** PacketTypeCommon getById(int)
- **static** PacketType$Status$Server valueOf(String)
- **static** PacketType$Status$Server[] values()
- PacketSide getSide()
- int getId()
- Class getWrapperClass()

## Package: com.github.retrooper.packetevents.protocol.packettype.clientbound

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_12
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_12 valueOf(String)
- **static** ClientboundPacketType_1_12[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_12_1
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_12_1 valueOf(String)
- **static** ClientboundPacketType_1_12_1[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_13
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_13 valueOf(String)
- **static** ClientboundPacketType_1_13[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_14
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_14 valueOf(String)
- **static** ClientboundPacketType_1_14[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_14_4
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_14_4 valueOf(String)
- **static** ClientboundPacketType_1_14_4[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_15
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_15 valueOf(String)
- **static** ClientboundPacketType_1_15[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_15_2
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_15_2 valueOf(String)
- **static** ClientboundPacketType_1_15_2[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_16
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_16 valueOf(String)
- **static** ClientboundPacketType_1_16[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_16_2
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_16_2 valueOf(String)
- **static** ClientboundPacketType_1_16_2[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_17
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_17 valueOf(String)
- **static** ClientboundPacketType_1_17[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_18
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_18 valueOf(String)
- **static** ClientboundPacketType_1_18[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_19
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_19 valueOf(String)
- **static** ClientboundPacketType_1_19[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_19_1
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_19_1 valueOf(String)
- **static** ClientboundPacketType_1_19_1[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_19_3
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_19_3 valueOf(String)
- **static** ClientboundPacketType_1_19_3[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_19_4
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_19_4 valueOf(String)
- **static** ClientboundPacketType_1_19_4[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_20_2
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_20_2 valueOf(String)
- **static** ClientboundPacketType_1_20_2[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_20_3
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_20_3 valueOf(String)
- **static** ClientboundPacketType_1_20_3[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_20_5
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_20_5 valueOf(String)
- **static** ClientboundPacketType_1_20_5[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_21
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_21 valueOf(String)
- **static** ClientboundPacketType_1_21[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_21_2
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_21_2 valueOf(String)
- **static** ClientboundPacketType_1_21_2[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_21_5
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_21_5 valueOf(String)
- **static** ClientboundPacketType_1_21_5[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_21_6
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_21_6 valueOf(String)
- **static** ClientboundPacketType_1_21_6[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_7_10
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_7_10 valueOf(String)
- **static** ClientboundPacketType_1_7_10[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_8
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_8 valueOf(String)
- **static** ClientboundPacketType_1_8[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_9
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_9 valueOf(String)
- **static** ClientboundPacketType_1_9[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_9_3
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundPacketType_1_9_3 valueOf(String)
- **static** ClientboundPacketType_1_9_3[] values()

## Package: com.github.retrooper.packetevents.protocol.packettype.config.clientbound

### Class: com.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_1_20_2
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundConfigPacketType_1_20_2 valueOf(String)
- **static** ClientboundConfigPacketType_1_20_2[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_1_20_3
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundConfigPacketType_1_20_3 valueOf(String)
- **static** ClientboundConfigPacketType_1_20_3[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_1_20_5
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundConfigPacketType_1_20_5 valueOf(String)
- **static** ClientboundConfigPacketType_1_20_5[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_1_21
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundConfigPacketType_1_21 valueOf(String)
- **static** ClientboundConfigPacketType_1_21[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_1_21_6
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ClientboundConfigPacketType_1_21_6 valueOf(String)
- **static** ClientboundConfigPacketType_1_21_6[] values()

## Package: com.github.retrooper.packetevents.protocol.packettype.config.serverbound

### Class: com.github.retrooper.packetevents.protocol.packettype.config.serverbound.ServerboundConfigPacketType_1_20_2
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundConfigPacketType_1_20_2 valueOf(String)
- **static** ServerboundConfigPacketType_1_20_2[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.config.serverbound.ServerboundConfigPacketType_1_20_5
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundConfigPacketType_1_20_5 valueOf(String)
- **static** ServerboundConfigPacketType_1_20_5[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.config.serverbound.ServerboundConfigPacketType_1_21_6
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundConfigPacketType_1_21_6 valueOf(String)
- **static** ServerboundConfigPacketType_1_21_6[] values()

## Package: com.github.retrooper.packetevents.protocol.packettype.serverbound

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_12
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_12 valueOf(String)
- **static** ServerboundPacketType_1_12[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_12_1
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_12_1 valueOf(String)
- **static** ServerboundPacketType_1_12_1[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_13
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_13 valueOf(String)
- **static** ServerboundPacketType_1_13[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_14
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_14 valueOf(String)
- **static** ServerboundPacketType_1_14[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_15_2
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_15_2 valueOf(String)
- **static** ServerboundPacketType_1_15_2[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_16
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_16 valueOf(String)
- **static** ServerboundPacketType_1_16[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_16_2
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_16_2 valueOf(String)
- **static** ServerboundPacketType_1_16_2[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_17
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_17 valueOf(String)
- **static** ServerboundPacketType_1_17[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_19
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_19 valueOf(String)
- **static** ServerboundPacketType_1_19[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_19_1
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_19_1 valueOf(String)
- **static** ServerboundPacketType_1_19_1[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_19_3
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_19_3 valueOf(String)
- **static** ServerboundPacketType_1_19_3[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_19_4
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_19_4 valueOf(String)
- **static** ServerboundPacketType_1_19_4[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_20_2
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_20_2 valueOf(String)
- **static** ServerboundPacketType_1_20_2[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_20_3
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_20_3 valueOf(String)
- **static** ServerboundPacketType_1_20_3[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_20_5
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_20_5 valueOf(String)
- **static** ServerboundPacketType_1_20_5[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_21_2
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_21_2 valueOf(String)
- **static** ServerboundPacketType_1_21_2[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_21_4
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_21_4 valueOf(String)
- **static** ServerboundPacketType_1_21_4[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_21_5
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_21_5 valueOf(String)
- **static** ServerboundPacketType_1_21_5[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_21_6
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_21_6 valueOf(String)
- **static** ServerboundPacketType_1_21_6[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_7_10
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_7_10 valueOf(String)
- **static** ServerboundPacketType_1_7_10[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_8
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_8 valueOf(String)
- **static** ServerboundPacketType_1_8[] values()

### Class: com.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_9
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerboundPacketType_1_9 valueOf(String)
- **static** ServerboundPacketType_1_9[] values()

## Package: com.github.retrooper.packetevents.protocol.particle

### Class: com.github.retrooper.packetevents.protocol.particle.Particle
Type: Class

Methods:
- **static** NBT encode(Particle, ClientVersion)
- **static** Particle read(PacketWrapper)
- void setData(ParticleData)
- ParticleType getType()
- void setType(ParticleType)
- **static** Particle decode(NBT, ClientVersion)
- **static** void write(PacketWrapper, Particle)
- ParticleData getData()

## Package: com.github.retrooper.packetevents.protocol.particle.data

### Class: com.github.retrooper.packetevents.protocol.particle.data.LegacyConvertible
Type: Interface

Methods:
- LegacyParticleData toLegacy(ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.particle.data.LegacyParticleData
Type: Class
Extends: com.github.retrooper.packetevents.protocol.particle.data.ParticleData
Implements: com.github.retrooper.packetevents.protocol.particle.data.LegacyConvertible

Methods:
- **static** LegacyParticleData ofItem(ItemType, byte)
- **static** LegacyParticleData ofBlock(ItemType, byte)
- **static** LegacyParticleData zero()
- **static** int getSize(int)
- int[] getLegacyData()
- **static** LegacyParticleData read(PacketWrapper, int)
- **static** LegacyParticleData ofOne(int)
- boolean isEmpty()
- **static** void write(PacketWrapper, int, LegacyParticleData)
- **static** LegacyParticleData nullValue(int)
- **static** LegacyParticleData ofTwo(int, int)
- LegacyParticleData toLegacy(ClientVersion)
- void validate(int)

### Class: com.github.retrooper.packetevents.protocol.particle.data.ParticleBlockStateData
Type: Class
Extends: com.github.retrooper.packetevents.protocol.particle.data.ParticleData
Implements: com.github.retrooper.packetevents.protocol.particle.data.LegacyConvertible

Methods:
- **static** void encode(ParticleBlockStateData, ClientVersion, NBTCompound)
- **static** ParticleBlockStateData read(PacketWrapper)
- boolean isEmpty()
- **static** ParticleBlockStateData decode(NBTCompound, ClientVersion)
- void setBlockState(WrappedBlockState)
- WrappedBlockState getBlockState()
- **static** void write(PacketWrapper, ParticleBlockStateData)
- LegacyParticleData toLegacy(ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.particle.data.ParticleColorData
Type: Class
Extends: com.github.retrooper.packetevents.protocol.particle.data.ParticleData

Methods:
- **static** void encode(ParticleColorData, ClientVersion, NBTCompound)
- void setColor(int)
- **static** ParticleColorData read(PacketWrapper)
- boolean isEmpty()
- int getColor()
- void setAlphaColor(AlphaColor)
- **static** ParticleColorData decode(NBTCompound, ClientVersion)
- **static** void write(PacketWrapper, ParticleColorData)

### Class: com.github.retrooper.packetevents.protocol.particle.data.ParticleData
Type: Class

Methods:
- **static** ParticleData emptyData()
- boolean isEmpty()

### Class: com.github.retrooper.packetevents.protocol.particle.data.ParticleDustColorTransitionData
Type: Class
Extends: com.github.retrooper.packetevents.protocol.particle.data.ParticleData

Methods:
- **static** void encode(ParticleDustColorTransitionData, ClientVersion, NBTCompound)
- float getEndRed()
- **static** ParticleDustColorTransitionData read(PacketWrapper)
- Color getStart()
- void setScale(float)
- float getEndBlue()
- boolean isEmpty()
- **static** ParticleDustColorTransitionData decode(NBTCompound, ClientVersion)
- Color getEnd()
- void setStartGreen(float)
- void setEndGreen(float)
- float getStartRed()
- float getScale()
- void setStartBlue(float)
- void setStart(Color)
- void setEndBlue(float)
- void setEndRed(float)
- void setEnd(Color)
- float getStartBlue()
- **static** void write(PacketWrapper, ParticleDustColorTransitionData)
- float getEndGreen()
- float getStartGreen()
- void setStartRed(float)

### Class: com.github.retrooper.packetevents.protocol.particle.data.ParticleDustData
Type: Class
Extends: com.github.retrooper.packetevents.protocol.particle.data.ParticleData

Methods:
- **static** void encode(ParticleDustData, ClientVersion, NBTCompound)
- **static** ParticleDustData read(PacketWrapper)
- void setScale(float)
- boolean isEmpty()
- Color getColor()
- **static** ParticleDustData decode(NBTCompound, ClientVersion)
- float getBlue()
- void setGreen(float)
- void setRed(float)
- void setColor(Color)
- float getGreen()
- float getRed()
- float getScale()
- void setBlue(float)
- **static** void write(PacketWrapper, ParticleDustData)

### Class: com.github.retrooper.packetevents.protocol.particle.data.ParticleItemStackData
Type: Class
Extends: com.github.retrooper.packetevents.protocol.particle.data.ParticleData
Implements: com.github.retrooper.packetevents.protocol.particle.data.LegacyConvertible

Methods:
- **static** void encode(ParticleItemStackData, ClientVersion, NBTCompound)
- **static** ParticleItemStackData read(PacketWrapper)
- boolean isEmpty()
- void setItemStack(ItemStack)
- ItemStack getItemStack()
- **static** ParticleItemStackData decode(NBTCompound, ClientVersion)
- **static** void write(PacketWrapper, ParticleItemStackData)
- LegacyParticleData toLegacy(ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.particle.data.ParticleSculkChargeData
Type: Class
Extends: com.github.retrooper.packetevents.protocol.particle.data.ParticleData

Methods:
- **static** void encode(ParticleSculkChargeData, ClientVersion, NBTCompound)
- void setRoll(float)
- **static** ParticleSculkChargeData read(PacketWrapper)
- float getRoll()
- boolean isEmpty()
- **static** ParticleSculkChargeData decode(NBTCompound, ClientVersion)
- **static** void write(PacketWrapper, ParticleSculkChargeData)

### Class: com.github.retrooper.packetevents.protocol.particle.data.ParticleShriekData
Type: Class
Extends: com.github.retrooper.packetevents.protocol.particle.data.ParticleData

Methods:
- **static** void encode(ParticleShriekData, ClientVersion, NBTCompound)
- **static** ParticleShriekData read(PacketWrapper)
- int getDelay()
- boolean isEmpty()
- **static** ParticleShriekData decode(NBTCompound, ClientVersion)
- **static** void write(PacketWrapper, ParticleShriekData)
- void setDelay(int)

### Class: com.github.retrooper.packetevents.protocol.particle.data.ParticleTrailData
Type: Class
Extends: com.github.retrooper.packetevents.protocol.particle.data.ParticleData

Methods:
- void setDuration(int)
- **static** void encode(ParticleTrailData, ClientVersion, NBTCompound)
- Vector3d getTarget()
- void setColor(Color)
- **static** ParticleTrailData read(PacketWrapper)
- int getDuration()
- boolean isEmpty()
- Color getColor()
- void setTarget(Vector3d)
- **static** ParticleTrailData decode(NBTCompound, ClientVersion)
- **static** void write(PacketWrapper, ParticleTrailData)

### Class: com.github.retrooper.packetevents.protocol.particle.data.ParticleVibrationData
Type: Class
Extends: com.github.retrooper.packetevents.protocol.particle.data.ParticleData

Methods:
- **static** void encode(ParticleVibrationData, ClientVersion, NBTCompound)
- Vector3i getStartingPosition()
- **static** ParticleVibrationData read(PacketWrapper)
- void setEntityId(int)
- boolean isEmpty()
- PositionSourceType getSourceType()
- void setTicks(int)
- **static** ParticleVibrationData decode(NBTCompound, ClientVersion)
- void setEntityEyeHeight(Float)
- void setEntityEyeHeight(float)
- int getTicks()
- Optional getBlockPosition()
- void setStartingPosition(Vector3i)
- ParticleVibrationData$PositionType getType()
- PositionSource getSource()
- Optional getEntityEyeHeight()
- Optional getEntityId()
- void setBlockPosition(Vector3i)
- **static** void write(PacketWrapper, ParticleVibrationData)

### Class: com.github.retrooper.packetevents.protocol.particle.data.ParticleVibrationData$PositionType
Type: Enum
Extends: java.lang.Enum
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- ResourceLocation getName()
- **static** ParticleVibrationData$PositionType byModern(PositionSourceType)
- **static** ParticleVibrationData$PositionType getById(int)
- **static** ParticleVibrationData$PositionType valueOf(String)
- **static** ParticleVibrationData$PositionType[] values()
- **static** ParticleVibrationData$PositionType getByName(String)
- **static** ParticleVibrationData$PositionType getByName(ResourceLocation)
- int getId(ClientVersion)

## Package: com.github.retrooper.packetevents.protocol.particle.type

### Class: com.github.retrooper.packetevents.protocol.particle.type.ParticleType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- BiConsumer writeDataFunction()
- ParticleData readData(PacketWrapper)
- ParticleData decodeData(NBTCompound, ClientVersion)
- Function readDataFunction()
- void writeData(PacketWrapper, ParticleData)
- void encodeData(ParticleData, ClientVersion, NBTCompound)

### Class: com.github.retrooper.packetevents.protocol.particle.type.ParticleTypes$Decoder
Type: Interface

Methods:
- Object decode(NBTCompound, ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.particle.type.ParticleTypes$Encoder
Type: Interface

Methods:
- void encode(Object, ClientVersion, NBTCompound)

### Class: com.github.retrooper.packetevents.protocol.particle.type.ParticleTypes
Type: Class

Methods:
- **static** ParticleType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** ParticleType getByName(String)
- **static** ParticleType define(String)
- **static** ParticleType define(String, PacketWrapper$Reader, PacketWrapper$Writer, ParticleTypes$Decoder, ParticleTypes$Encoder)

### Class: com.github.retrooper.packetevents.protocol.particle.type.StaticParticleType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.particle.type.ParticleType

Methods:
- ParticleData readData(PacketWrapper)
- ParticleData decodeData(NBTCompound, ClientVersion)
- void writeData(PacketWrapper, ParticleData)
- void encodeData(ParticleData, ClientVersion, NBTCompound)

## Package: com.github.retrooper.packetevents.protocol.player

### Class: com.github.retrooper.packetevents.protocol.player.ClientVersion
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean isOlderThanOrEquals(ClientVersion)
- **static** ClientVersion valueOf(String)
- **static** ClientVersion[] values()
- boolean isNewerThanOrEquals(ClientVersion)
- boolean is(VersionComparison, ClientVersion)
- boolean isNewerThan(ClientVersion)
- **static** boolean isRelease(int)
- boolean isRelease()
- int getProtocolVersion()
- **static** ClientVersion getLatest()
- boolean isOlderThan(ClientVersion)
- **static** ClientVersion getOldest()
- **static** ClientVersion getById(int)
- ServerVersion toServerVersion()
- String getReleaseName()
- **static** boolean isPreRelease(int)
- boolean isPreRelease()

### Class: com.github.retrooper.packetevents.protocol.player.Combat
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Combat getById(int)
- **static** Combat valueOf(String)
- **static** Combat[] values()
- int getId()

### Class: com.github.retrooper.packetevents.protocol.player.DiggingAction
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DiggingAction getById(int)
- **static** DiggingAction valueOf(String)
- **static** DiggingAction[] values()
- int getId()

### Class: com.github.retrooper.packetevents.protocol.player.Equipment
Type: Class

Methods:
- void setSlot(EquipmentSlot)
- EquipmentSlot getSlot()
- boolean equals(Object)
- ItemStack getItem()
- void setItem(ItemStack)

### Class: com.github.retrooper.packetevents.protocol.player.EquipmentSlot
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** EquipmentSlot getById(ClientVersion, int)
- **static** EquipmentSlot getById(ServerVersion, int)
- **static** EquipmentSlot valueOf(String)
- **static** EquipmentSlot[] values()
- int getId(ServerVersion)
- int getId(ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.player.GameMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** GameMode defaultGameMode()
- **static** GameMode getById(int)
- **static** GameMode valueOf(String)
- **static** GameMode[] values()
- int getId()

### Class: com.github.retrooper.packetevents.protocol.player.HumanoidArm
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** HumanoidArm getById(int)
- **static** HumanoidArm valueOf(String)
- **static** HumanoidArm[] values()
- int getId()

### Class: com.github.retrooper.packetevents.protocol.player.InteractionHand
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** InteractionHand getById(int)
- **static** InteractionHand valueOf(String)
- **static** InteractionHand[] values()
- int getId()

### Class: com.github.retrooper.packetevents.protocol.player.PublicProfileKey
Type: Class

Methods:
- boolean hasExpired()
- PublicKey getKey()
- Instant getExpiresAt()
- byte[] getKeySignature()

### Class: com.github.retrooper.packetevents.protocol.player.SkinSection
Type: Class

Methods:
- byte getMask()
- byte set(byte, boolean)
- boolean isSet(byte)
- SkinSection combine(SkinSection)

### Class: com.github.retrooper.packetevents.protocol.player.TextureProperty
Type: Class

Methods:
- String getValue()
- String getName()
- String getSignature()
- boolean isSignatureValid(PublicKey)

### Class: com.github.retrooper.packetevents.protocol.player.User
Type: Class
Implements: com.github.retrooper.packetevents.util.mappings.IRegistryHolder

Methods:
- AdventureSerializer getSerializers()
- String getName()
- IRegistry getRegistry(ResourceLocation, ClientVersion)
- NBTCompound getWorldNBT(String)
- NBTCompound getWorldNBT(int)
- NBTCompound getWorldNBT(Dimension)
- void setDefaultWorldHeights(ServerVersion, Dimension)
- void setDefaultWorldHeights(boolean)
- void setDimensionType(DimensionType)
- void sendTitle(String, String, int, int, int)
- void sendTitle(Component, Component, int, int, int)
- void sendPacket(Object)
- void sendPacket(PacketWrapper)
- ConnectionState getConnectionState() throws IllegalStateException
- void setTotalWorldHeight(int)
- void setMinWorldHeight(int)
- void closeInventory()
- String getWorldName(int)
- String getWorldName(Dimension)
- void setEncoderState(ConnectionState)
- UUID getUUID()
- Object getChannel()
- void receivePacketSilently(Object)
- void receivePacketSilently(PacketWrapper)
- void setDimension(Dimension)
- Dimension getDimension()
- void switchDimensionType(ServerVersion, Dimension)
- void sendPacketSilently(Object)
- void sendPacketSilently(PacketWrapper)
- int getEntityId()
- InetSocketAddress getAddress()
- ConnectionState getDecoderState()
- void receivePacket(Object)
- void receivePacket(PacketWrapper)
- ClientVersion getPacketVersion()
- void setEntityId(int)
- void setDecoderState(ConnectionState)
- DimensionType getDimensionType()
- UserProfile getProfile()
- void sendMessage(String)
- void sendMessage(Component)
- void sendMessage(Component, ChatType)
- void setWorldNBT(NBTList)
- int getTotalWorldHeight()
- int getTotalWorldHeight(ClientVersion)
- void flushPackets()
- void closeConnection()
- ConnectionState getEncoderState()
- int getMinWorldHeight()
- int getMinWorldHeight(ClientVersion)
- void setClientVersion(ClientVersion)
- ClientVersion getClientVersion()
- void putRegistry(IRegistry)
- void writePacket(Object)
- void writePacket(PacketWrapper)
- void writePacketSilently(Object)
- void writePacketSilently(PacketWrapper)
- void setConnectionState(ConnectionState)

### Class: com.github.retrooper.packetevents.protocol.player.UserProfile
Type: Class

Methods:
- void setName(String)
- List getTextureProperties()
- String getName()
- UUID getUUID()
- void setTextureProperties(List)
- void setUUID(UUID)

## Package: com.github.retrooper.packetevents.protocol.potion

### Class: com.github.retrooper.packetevents.protocol.potion.Potion
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.potion.PotionType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.potion.PotionEffect
Type: Class

Methods:
- **static** PotionEffect read(PacketWrapper)
- **static** void write(PacketWrapper, PotionEffect)

### Class: com.github.retrooper.packetevents.protocol.potion.PotionEffect$Properties
Type: Class

Methods:
- **static** PotionEffect$Properties read(PacketWrapper)
- **static** void write(PacketWrapper, PotionEffect$Properties)

### Class: com.github.retrooper.packetevents.protocol.potion.PotionTypes
Type: Class

Methods:
- **static** PotionType getById(int)
- **static** PotionType getById(int, ServerVersion)
- **static** PotionType getById(int, ClientVersion)
- **static** PotionType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** PotionType getByName(String)
- **static** PotionType define(String, int)
- **static** PotionType define(String)

### Class: com.github.retrooper.packetevents.protocol.potion.Potions
Type: Class

Methods:
- **static** Potion getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Potion getByName(String)
- **static** Potion define(String)

### Class: com.github.retrooper.packetevents.protocol.potion.StaticPotion
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.potion.Potion

No public methods found

### Class: com.github.retrooper.packetevents.protocol.potion.StaticPotionType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.potion.PotionType

No public methods found

## Package: com.github.retrooper.packetevents.protocol.recipe

### Class: com.github.retrooper.packetevents.protocol.recipe.RecipeSerializer
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- RecipeData read(PacketWrapper)
- RecipeType getLegacyType()
- void write(PacketWrapper, RecipeData)

### Class: com.github.retrooper.packetevents.protocol.recipe.CookingCategory
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** CookingCategory valueOf(String)
- **static** CookingCategory[] values()

### Class: com.github.retrooper.packetevents.protocol.recipe.CraftingCategory
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** CraftingCategory valueOf(String)
- **static** CraftingCategory[] values()

### Class: com.github.retrooper.packetevents.protocol.recipe.Ingredient
Type: Class

Methods:
- **static** Ingredient read(PacketWrapper)
- ItemStack[] getOptions()
- **static** void write(PacketWrapper, Ingredient)

### Class: com.github.retrooper.packetevents.protocol.recipe.Recipe
Type: Class

Methods:
- ResourceLocation getKey()
- **static** Recipe read(PacketWrapper)
- RecipeSerializer getSerializer()
- RecipeType getType()
- String getIdentifier()
- String toString()
- **static** void write(PacketWrapper, Recipe)
- RecipeData getData()

### Class: com.github.retrooper.packetevents.protocol.recipe.RecipeBookSettings
Type: Class

Methods:
- RecipeBookSettings$TypeState getState(RecipeBookType)
- **static** RecipeBookSettings read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- void setState(RecipeBookType, RecipeBookSettings$TypeState)
- String toString()
- Map getStates()
- **static** void write(PacketWrapper, RecipeBookSettings)

### Class: com.github.retrooper.packetevents.protocol.recipe.RecipeBookSettings$TypeState
Type: Class

Methods:
- void setFiltering(boolean)
- void setOpen(boolean)
- boolean isOpen()
- **static** RecipeBookSettings$TypeState read(PacketWrapper)
- boolean isFiltering()
- int hashCode()
- boolean equals(Object)
- String toString()
- **static** void write(PacketWrapper, RecipeBookSettings$TypeState)

### Class: com.github.retrooper.packetevents.protocol.recipe.RecipeBookType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** RecipeBookType valueOf(String)
- **static** RecipeBookType[] values()

### Class: com.github.retrooper.packetevents.protocol.recipe.RecipeDisplayEntry
Type: Class

Methods:
- void setDisplay(RecipeDisplay)
- **static** RecipeDisplayEntry read(PacketWrapper)
- RecipeBookCategory getCategory()
- RecipeDisplayId getId()
- void setGroup(Integer)
- void setCategory(RecipeBookCategory)
- int hashCode()
- boolean equals(Object)
- void setIngredients(List)
- Integer getGroup()
- void setId(RecipeDisplayId)
- String toString()
- **static** void write(PacketWrapper, RecipeDisplayEntry)
- List getIngredients()
- RecipeDisplay getDisplay()

### Class: com.github.retrooper.packetevents.protocol.recipe.RecipeDisplayId
Type: Class

Methods:
- **static** RecipeDisplayId read(PacketWrapper)
- int getId()
- **static** void write(PacketWrapper, RecipeDisplayId)

### Class: com.github.retrooper.packetevents.protocol.recipe.RecipePropertySet
Type: Class

Methods:
- Set getItems()
- **static** RecipePropertySet read(PacketWrapper)
- void setItems(Set)
- **static** void write(PacketWrapper, RecipePropertySet)

### Class: com.github.retrooper.packetevents.protocol.recipe.RecipeSerializers
Type: Class

Methods:
- **static** RecipeSerializer getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** RecipeSerializer getByName(String)
- **static** RecipeSerializer define(String, PacketWrapper$Reader, PacketWrapper$Writer)
- **static** RecipeSerializer define(String, PacketWrapper$Reader, PacketWrapper$Writer, RecipeType)

### Class: com.github.retrooper.packetevents.protocol.recipe.RecipeType
Type: Enum
Extends: java.lang.Enum

Methods:
- RecipeSerializer getSerializer()
- **static** RecipeType valueOf(String)
- **static** RecipeType[] values()

### Class: com.github.retrooper.packetevents.protocol.recipe.SingleInputOptionDisplay
Type: Class

Methods:
- void setOptionDisplay(SlotDisplay)
- **static** SingleInputOptionDisplay read(PacketWrapper)
- SlotDisplay getOptionDisplay()
- MappedEntitySet getInput()
- **static** void write(PacketWrapper, SingleInputOptionDisplay)
- void setInput(MappedEntitySet)

### Class: com.github.retrooper.packetevents.protocol.recipe.StaticRecipeSerializer
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.recipe.RecipeSerializer

Methods:
- RecipeData read(PacketWrapper)
- RecipeType getLegacyType()
- void write(PacketWrapper, RecipeData)

## Package: com.github.retrooper.packetevents.protocol.recipe.category

### Class: com.github.retrooper.packetevents.protocol.recipe.category.RecipeBookCategory
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.recipe.category.RecipeBookCategories
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()

### Class: com.github.retrooper.packetevents.protocol.recipe.category.StaticRecipeBookCategory
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.recipe.category.RecipeBookCategory

No public methods found

## Package: com.github.retrooper.packetevents.protocol.recipe.data

### Class: com.github.retrooper.packetevents.protocol.recipe.data.RecipeData
Type: Interface

No public methods found

### Class: com.github.retrooper.packetevents.protocol.recipe.data.CookedRecipeData
Type: Class
Implements: com.github.retrooper.packetevents.protocol.recipe.data.RecipeData

Methods:
- **static** CookedRecipeData read(PacketWrapper)
- Ingredient getIngredient()
- float getExperience()
- ItemStack getResult()
- String getGroup()
- CookingCategory getCategory()
- **static** void write(PacketWrapper, CookedRecipeData)
- int getCookingTime()

### Class: com.github.retrooper.packetevents.protocol.recipe.data.MerchantItemCost
Type: Class

Methods:
- **static** MerchantItemCost ofItem(ItemStack)
- void setPredicate(ComponentPredicate)
- **static** MerchantItemCost read(PacketWrapper)
- ComponentPredicate getPredicate()
- ItemStack asItem()
- ItemType getItem()
- **static** void writeItem(PacketWrapper, ItemStack)
- **static** ItemStack readItem(PacketWrapper)
- int getCount()
- **static** void write(PacketWrapper, MerchantItemCost)
- void setCount(int)
- void setItem(ItemType)
- **static** MerchantItemCost emptyCost()

### Class: com.github.retrooper.packetevents.protocol.recipe.data.MerchantOffer
Type: Class
Implements: com.github.retrooper.packetevents.protocol.recipe.data.RecipeData

Methods:
- void setMaxUses(int)
- int getUses()
- void setOutputItem(ItemStack)
- ItemStack getOutputItem()
- MerchantItemCost getFirstInputCost()
- int getMaxUses()
- boolean isOutOfStock()
- MerchantItemCost getSecondInputCost()
- void setSpecialPrice(int)
- int getXp()
- ItemStack getSecondInputItem()
- void setPriceMultiplier(float)
- **static** MerchantOffer of(ItemStack, ItemStack, ItemStack, int, int, int, int, float, int)
- **static** MerchantOffer of(ItemStack, ItemStack, int, int, int, int, float, int)
- **static** MerchantOffer of(ItemStack, ItemStack, int, int, int, float, int)
- **static** MerchantOffer of(MerchantItemCost, MerchantItemCost, ItemStack, int, int, int, int, float, int)
- **static** MerchantOffer of(MerchantItemCost, ItemStack, int, int, int, int, float, int)
- **static** MerchantOffer of(MerchantItemCost, ItemStack, int, int, int, float, int)
- int getSpecialPrice()
- void setSecondInputCost(MerchantItemCost)
- void setSecondInputItem(ItemStack)
- void setFirstInputItem(ItemStack)
- void setFirstInputCost(MerchantItemCost)
- float getPriceMultiplier()
- ItemStack getFirstInputItem()
- void setDemand(int)
- void setXp(int)
- int getDemand()
- void setUses(int)

### Class: com.github.retrooper.packetevents.protocol.recipe.data.ShapedRecipeData
Type: Class
Implements: com.github.retrooper.packetevents.protocol.recipe.data.RecipeData

Methods:
- int getHeight()
- **static** ShapedRecipeData read(PacketWrapper)
- ItemStack getResult()
- String getGroup()
- boolean isShowNotification()
- CraftingCategory getCategory()
- int getWidth()
- **static** void write(PacketWrapper, ShapedRecipeData)
- Ingredient[] getIngredients()

### Class: com.github.retrooper.packetevents.protocol.recipe.data.ShapelessRecipeData
Type: Class
Implements: com.github.retrooper.packetevents.protocol.recipe.data.RecipeData

Methods:
- **static** ShapelessRecipeData read(PacketWrapper)
- ItemStack getResult()
- String getGroup()
- CraftingCategory getCategory()
- **static** void write(PacketWrapper, ShapelessRecipeData)
- Ingredient[] getIngredients()

### Class: com.github.retrooper.packetevents.protocol.recipe.data.SimpleRecipeData
Type: Class
Implements: com.github.retrooper.packetevents.protocol.recipe.data.RecipeData

Methods:
- **static** SimpleRecipeData read(PacketWrapper)
- CraftingCategory getCategory()
- **static** void write(PacketWrapper, SimpleRecipeData)

### Class: com.github.retrooper.packetevents.protocol.recipe.data.SmithingRecipeData
Type: Class
Implements: com.github.retrooper.packetevents.protocol.recipe.data.RecipeData

Methods:
- **static** SmithingRecipeData read(PacketWrapper)
- **static** SmithingRecipeData read(PacketWrapper, boolean)
- Ingredient getTemplate()
- ItemStack getResult()
- Ingredient getBase()
- **static** void write(PacketWrapper, SmithingRecipeData)
- **static** void write(PacketWrapper, SmithingRecipeData, boolean)
- Ingredient getAddition()

### Class: com.github.retrooper.packetevents.protocol.recipe.data.SmithingTrimRecipeData
Type: Class
Implements: com.github.retrooper.packetevents.protocol.recipe.data.RecipeData

Methods:
- **static** SmithingTrimRecipeData read(PacketWrapper)
- Ingredient getTemplate()
- Ingredient getBase()
- **static** void write(PacketWrapper, SmithingTrimRecipeData)
- Ingredient getAddition()

### Class: com.github.retrooper.packetevents.protocol.recipe.data.StoneCuttingRecipeData
Type: Class
Implements: com.github.retrooper.packetevents.protocol.recipe.data.RecipeData

Methods:
- **static** StoneCuttingRecipeData read(PacketWrapper)
- Ingredient getIngredient()
- ItemStack getResult()
- String getGroup()
- **static** void write(PacketWrapper, StoneCuttingRecipeData)

## Package: com.github.retrooper.packetevents.protocol.recipe.display

### Class: com.github.retrooper.packetevents.protocol.recipe.display.RecipeDisplayType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- RecipeDisplay read(PacketWrapper)
- void write(PacketWrapper, RecipeDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.FurnaceRecipeDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.RecipeDisplay

Methods:
- void setDuration(int)
- **static** FurnaceRecipeDisplay read(PacketWrapper)
- void setIngredient(SlotDisplay)
- void setResult(SlotDisplay)
- void setExperience(float)
- float getExperience()
- SlotDisplay getCraftingStation()
- void setFuel(SlotDisplay)
- SlotDisplay getFuel()
- int getDuration()
- SlotDisplay getIngredient()
- int hashCode()
- boolean equals(Object)
- SlotDisplay getResult()
- void setCraftingStation(SlotDisplay)
- String toString()
- **static** void write(PacketWrapper, FurnaceRecipeDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.RecipeDisplay
Type: Abstract Class

Methods:
- **static** RecipeDisplay read(PacketWrapper)
- RecipeDisplayType getType()
- **static** void write(PacketWrapper, RecipeDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.RecipeDisplayTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()

### Class: com.github.retrooper.packetevents.protocol.recipe.display.ShapedCraftingRecipeDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.RecipeDisplay

Methods:
- **static** ShapedCraftingRecipeDisplay read(PacketWrapper)
- void setResult(SlotDisplay)
- int getWidth()
- void setHeight(int)
- void setWidth(int)
- SlotDisplay getCraftingStation()
- int getHeight()
- int hashCode()
- boolean equals(Object)
- SlotDisplay getResult()
- void setIngredients(List)
- void setCraftingStation(SlotDisplay)
- String toString()
- **static** void write(PacketWrapper, ShapedCraftingRecipeDisplay)
- List getIngredients()

### Class: com.github.retrooper.packetevents.protocol.recipe.display.ShapelessCraftingRecipeDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.RecipeDisplay

Methods:
- **static** ShapelessCraftingRecipeDisplay read(PacketWrapper)
- void setResult(SlotDisplay)
- int hashCode()
- boolean equals(Object)
- SlotDisplay getResult()
- void setIngredients(List)
- void setCraftingStation(SlotDisplay)
- String toString()
- **static** void write(PacketWrapper, ShapelessCraftingRecipeDisplay)
- SlotDisplay getCraftingStation()
- List getIngredients()

### Class: com.github.retrooper.packetevents.protocol.recipe.display.SmithingRecipeDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.RecipeDisplay

Methods:
- **static** SmithingRecipeDisplay read(PacketWrapper)
- void setResult(SlotDisplay)
- SlotDisplay getTemplate()
- void setAddition(SlotDisplay)
- SlotDisplay getCraftingStation()
- SlotDisplay getAddition()
- void setTemplate(SlotDisplay)
- int hashCode()
- boolean equals(Object)
- SlotDisplay getResult()
- void setCraftingStation(SlotDisplay)
- String toString()
- SlotDisplay getBase()
- void setBase(SlotDisplay)
- **static** void write(PacketWrapper, SmithingRecipeDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.StaticRecipeDisplayType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.recipe.display.RecipeDisplayType

Methods:
- RecipeDisplay read(PacketWrapper)
- void write(PacketWrapper, RecipeDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.StonecutterRecipeDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.RecipeDisplay

Methods:
- **static** StonecutterRecipeDisplay read(PacketWrapper)
- void setResult(SlotDisplay)
- int hashCode()
- boolean equals(Object)
- SlotDisplay getResult()
- void setCraftingStation(SlotDisplay)
- String toString()
- SlotDisplay getInput()
- **static** void write(PacketWrapper, StonecutterRecipeDisplay)
- SlotDisplay getCraftingStation()
- void setInput(SlotDisplay)

## Package: com.github.retrooper.packetevents.protocol.recipe.display.slot

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplayType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- SlotDisplay read(PacketWrapper)
- void write(PacketWrapper, SlotDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.AnyFuelSlotDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplay

Methods:
- **static** AnyFuelSlotDisplay read(PacketWrapper)
- **static** void write(PacketWrapper, AnyFuelSlotDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.CompositeSlotDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplay

Methods:
- **static** CompositeSlotDisplay read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- List getContents()
- String toString()
- void setContents(List)
- **static** void write(PacketWrapper, CompositeSlotDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.EmptySlotDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplay

Methods:
- **static** EmptySlotDisplay read(PacketWrapper)
- **static** void write(PacketWrapper, EmptySlotDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.ItemSlotDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplay

Methods:
- **static** ItemSlotDisplay read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- ItemType getItem()
- String toString()
- **static** void write(PacketWrapper, ItemSlotDisplay)
- void setItem(ItemType)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.ItemStackSlotDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplay

Methods:
- void setStack(ItemStack)
- **static** ItemStackSlotDisplay read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- String toString()
- ItemStack getStack()
- **static** void write(PacketWrapper, ItemStackSlotDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplay
Type: Abstract Class

Methods:
- **static** SlotDisplay read(PacketWrapper)
- SlotDisplayType getType()
- **static** void write(PacketWrapper, SlotDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplayTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.SmithingTrimSlotDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplay

Methods:
- SlotDisplay getMaterial()
- **static** SmithingTrimSlotDisplay read(PacketWrapper)
- int hashCode()
- TrimPattern getTrimPattern()
- boolean equals(Object)
- void setTrimPattern(TrimPattern)
- void setPattern(SlotDisplay)
- String toString()
- SlotDisplay getBase()
- void setBase(SlotDisplay)
- SlotDisplay getPattern()
- **static** void write(PacketWrapper, SmithingTrimSlotDisplay)
- void setMaterial(SlotDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.StaticSlotDisplayType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplayType

Methods:
- SlotDisplay read(PacketWrapper)
- void write(PacketWrapper, SlotDisplay)

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.TagSlotDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplay

Methods:
- **static** TagSlotDisplay read(PacketWrapper)
- void setItemTag(ResourceLocation)
- int hashCode()
- boolean equals(Object)
- String toString()
- **static** void write(PacketWrapper, TagSlotDisplay)
- ResourceLocation getItemTag()

### Class: com.github.retrooper.packetevents.protocol.recipe.display.slot.WithRemainderSlotDisplay
Type: Class
Extends: com.github.retrooper.packetevents.protocol.recipe.display.slot.SlotDisplay

Methods:
- **static** WithRemainderSlotDisplay read(PacketWrapper)
- int hashCode()
- boolean equals(Object)
- SlotDisplay getRemainder()
- String toString()
- void setRemainder(SlotDisplay)
- SlotDisplay getInput()
- **static** void write(PacketWrapper, WithRemainderSlotDisplay)
- void setInput(SlotDisplay)

## Package: com.github.retrooper.packetevents.protocol.score

### Class: com.github.retrooper.packetevents.protocol.score.ScoreFormat
Type: Interface

Methods:
- ScoreFormatType getType()
- **static** FixedScoreFormat fixedScore(Component)
- **static** void writeTyped(PacketWrapper, ScoreFormat)
- Component format(int)
- **static** StyledScoreFormat styledScore(Style)
- **static** BlankScoreFormat blankScore()
- **static** ScoreFormat readTyped(PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.score.ScoreFormatType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.StaticMappedEntity

Methods:
- ScoreFormat read(PacketWrapper)
- int getId()
- void write(PacketWrapper, ScoreFormat)

### Class: com.github.retrooper.packetevents.protocol.score.BlankScoreFormat
Type: Class
Implements: com.github.retrooper.packetevents.protocol.score.ScoreFormat

Methods:
- **static** BlankScoreFormat read(PacketWrapper)
- ScoreFormatType getType()
- Component format(int)
- **static** void write(PacketWrapper, BlankScoreFormat)

### Class: com.github.retrooper.packetevents.protocol.score.FixedScoreFormat
Type: Class
Implements: com.github.retrooper.packetevents.protocol.score.ScoreFormat

Methods:
- Component getValue()
- **static** FixedScoreFormat read(PacketWrapper)
- ScoreFormatType getType()
- Component format(int)
- **static** void write(PacketWrapper, FixedScoreFormat)

### Class: com.github.retrooper.packetevents.protocol.score.ScoreFormatTypes
Type: Class

Methods:
- **static** ScoreFormat read(PacketWrapper)
- **static** ScoreFormatType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** ScoreFormatType getByName(String)
- **static** ScoreFormatType getByName(ResourceLocation)
- **static** ScoreFormatType define(int, String, Class, Function, BiConsumer)
- **static** ScoreFormatType define(String, PacketWrapper$Reader, PacketWrapper$Writer)
- **static** void write(PacketWrapper, ScoreFormat)

### Class: com.github.retrooper.packetevents.protocol.score.StaticScoreFormatType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.score.ScoreFormatType

Methods:
- ScoreFormat read(PacketWrapper)
- int getId()
- void write(PacketWrapper, ScoreFormat)

### Class: com.github.retrooper.packetevents.protocol.score.StyledScoreFormat
Type: Class
Implements: com.github.retrooper.packetevents.protocol.score.ScoreFormat

Methods:
- Style getStyle()
- **static** StyledScoreFormat read(PacketWrapper)
- ScoreFormatType getType()
- Component format(int)
- **static** void write(PacketWrapper, StyledScoreFormat)

## Package: com.github.retrooper.packetevents.protocol.sound

### Class: com.github.retrooper.packetevents.protocol.sound.Sound
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- **static** NBT encode(Sound, ClientVersion)
- **static** NBT encode(PacketWrapper, Sound)
- **static** void writeDirect(PacketWrapper, Sound)
- **static** Sound read(PacketWrapper)
- **static** Sound readDirect(PacketWrapper)
- Float getRange()
- **static** Sound decode(NBT, ClientVersion)
- **static** Sound decode(NBT, PacketWrapper)
- ResourceLocation getSoundId()
- **static** void write(PacketWrapper, Sound)

### Class: com.github.retrooper.packetevents.protocol.sound.SoundCategory
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** SoundCategory valueOf(String)
- **static** SoundCategory[] values()
- **static** SoundCategory fromId(int)

### Class: com.github.retrooper.packetevents.protocol.sound.Sounds
Type: Class

Methods:
- **static** Sound getByNameOrCreate(String)
- **static** Sound getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** Sound getByName(String)
- **static** Sound define(String)
- **static** Sound define(String, ResourceLocation, Float)

### Class: com.github.retrooper.packetevents.protocol.sound.StaticSound
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.sound.Sound

Methods:
- int hashCode()
- Float getRange()
- boolean equals(Object)
- ResourceLocation getSoundId()

## Package: com.github.retrooper.packetevents.protocol.stats

### Class: com.github.retrooper.packetevents.protocol.stats.Statistic
Type: Interface

Methods:
- Component display()
- String getId()

### Class: com.github.retrooper.packetevents.protocol.stats.Statistics
Type: Class

Methods:
- **static** Statistic getById(String)

## Package: com.github.retrooper.packetevents.protocol.stream

### Class: com.github.retrooper.packetevents.protocol.stream.NetStreamInput
Type: Class
Extends: java.io.FilterInputStream

Methods:
- String readString()
- short[] readShorts(int)
- int readShorts(short[])
- int readShorts(short[], int, int)
- char readChar()
- long readVarLong()
- long readLong()
- long[] readLongs(int)
- int readLongs(long[])
- int readLongs(long[], int, int)
- short readShort()
- double readDouble()
- float readFloat()
- byte[] readBytes(int)
- int readBytes(byte[])
- int readBytes(byte[], int, int)
- boolean readBoolean()
- UUID readUUID()
- int readInt()
- byte readByte()
- int readUnsignedByte()
- int readUnsignedShort()
- int[] readInts(int)
- int readInts(int[])
- int readInts(int[], int, int)
- int readVarInt()

### Class: com.github.retrooper.packetevents.protocol.stream.NetStreamInputWrapper
Type: Class
Extends: com.github.retrooper.packetevents.protocol.stream.NetStreamInput

Methods:
- int read()
- int read(byte[])
- int read(byte[], int, int)
- boolean markSupported()
- int available()
- void reset()
- long skip(long)
- PacketWrapper getWrapper()
- void close()
- void mark(int)

### Class: com.github.retrooper.packetevents.protocol.stream.NetStreamOutput
Type: Class
Extends: java.io.FilterOutputStream

Methods:
- void writeInt(int)
- void writeByte(int)
- void writeVarLong(long)
- void writeInts(int[])
- void writeInts(int[], int)
- void writeFloat(float)
- void writeChar(int)
- void writeLong(long)
- void writeBytes(byte[])
- void writeBytes(byte[], int)
- void writeShorts(short[])
- void writeShorts(short[], int)
- void writeUUID(UUID)
- void writeVarInt(int)
- void writeShort(int)
- void writeString(String)
- void writeBoolean(boolean)
- void writeLongs(long[])
- void writeLongs(long[], int)
- void writeDouble(double)

### Class: com.github.retrooper.packetevents.protocol.stream.NetStreamOutputWrapper
Type: Class
Extends: com.github.retrooper.packetevents.protocol.stream.NetStreamOutput

Methods:
- void flush()
- void close()
- void write(int)
- void write(byte[])
- void write(byte[], int, int)

## Package: com.github.retrooper.packetevents.protocol.teleport

### Class: com.github.retrooper.packetevents.protocol.teleport.RelativeFlag
Type: Class

Methods:
- byte getMask()
- RelativeFlag set(RelativeFlag, boolean)
- RelativeFlag set(int, boolean)
- byte set(byte, boolean)
- RelativeFlag or(RelativeFlag)
- boolean isSet(byte)
- RelativeFlag and(RelativeFlag)
- boolean has(RelativeFlag)
- boolean has(int)
- int getFullMask()
- RelativeFlag combine(RelativeFlag)

## Package: com.github.retrooper.packetevents.protocol.util

### Class: com.github.retrooper.packetevents.protocol.util.NbtDecoder
Type: Interface

Methods:
- Object decode(NBT, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.util.NbtEncoder
Type: Interface

Methods:
- NBT encode(PacketWrapper, Object)

### Class: com.github.retrooper.packetevents.protocol.util.NbtMapDecoder
Type: Interface

Methods:
- Object decode(NBTCompound, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.util.NbtMapEncoder
Type: Interface

Methods:
- void encode(NBTCompound, PacketWrapper, Object)

## Package: com.github.retrooper.packetevents.protocol.world

### Class: com.github.retrooper.packetevents.protocol.world.BlockFace
Type: Enum
Extends: java.lang.Enum

Methods:
- int getHorizontalId()
- short getFaceValue()
- BlockFace getCW()
- **static** BlockFace getLegacyBlockFaceByValue(int)
- **static** BlockFace valueOf(String)
- BlockFace getOppositeFace()
- **static** BlockFace[] values()
- BlockFace getCCW()
- **static** BlockFace getBlockFaceByValue(int)
- int getModZ()
- int getModX()
- int getModY()

### Class: com.github.retrooper.packetevents.protocol.world.BoundingBox
Type: Class

Methods:
- Vector3d getCenter()
- BoundingBox shift(double, double, double)
- BoundingBox shift(Vector3d)
- double getVolume()
- double getHeight()
- double getWidthZ()
- Vector3d getMin()
- int hashCode()
- double getWidthX()
- BoundingBox intersection(BoundingBox)
- **static** BoundingBox of(Vector3d, Vector3d)
- **static** BoundingBox of(Vector3d, double, double, double)
- boolean overlaps(BoundingBox)
- boolean overlaps(Vector3d, Vector3d)
- BoundingBox copy(BoundingBox)
- double getCenterZ()
- double getCenterY()
- double getCenterX()
- **static** BoundingBox deserialize(Map)
- Vector3d getMax()
- double getMaxX()
- double getMaxY()
- BoundingBox union(double, double, double)
- BoundingBox union(Vector3d)
- BoundingBox union(BoundingBox)
- double getMaxZ()
- Map serialize()
- boolean contains(double, double, double)
- boolean contains(Vector3d)
- boolean contains(BoundingBox)
- boolean contains(Vector3d, Vector3d)
- BoundingBox expand(double, double, double, double, double, double)
- BoundingBox expand(double, double, double)
- BoundingBox expand(Vector3d)
- BoundingBox expand(double)
- BoundingBox expand(double, double, double, double)
- BoundingBox expand(Vector3d, double)
- BoundingBox expandDirectional(double, double, double)
- BoundingBox expandDirectional(Vector3d)
- boolean equals(Object)
- BoundingBox clone()
- Object clone() throws CloneNotSupportedException
- BoundingBox resize(double, double, double, double, double, double)
- String toString()
- double getMinZ()
- double getMinX()
- double getMinY()

### Class: com.github.retrooper.packetevents.protocol.world.Difficulty
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Difficulty getById(int)
- **static** Difficulty valueOf(String)
- **static** Difficulty[] values()
- int getId()

### Class: com.github.retrooper.packetevents.protocol.world.Dimension
Type: Class

Methods:
- **static** Dimension fromDimensionType(DimensionType, User, ClientVersion)
- NBTCompound getAttributes()
- DimensionType getType()
- String getDimensionName()
- DimensionTypeRef asDimensionTypeRef()
- **static** Dimension fromDimensionTypeRef(DimensionTypeRef)
- DimensionType asDimensionType(User, ClientVersion)
- void setId(int)
- int getId()
- void setDimensionName(String)
- void setAttributes(NBTCompound)
- void setType(DimensionType)

### Class: com.github.retrooper.packetevents.protocol.world.DimensionType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** boolean isDebug(String)
- **static** boolean isFlat(String)
- String getName()
- **static** DimensionType getById(int)
- **static** DimensionType valueOf(String)
- **static** DimensionType[] values()
- **static** DimensionType getByName(String)
- int getId()

### Class: com.github.retrooper.packetevents.protocol.world.Direction
Type: Enum
Extends: java.lang.Enum

Methods:
- int getHorizontalIndex()
- **static** Direction valueOf(String)
- **static** Direction getByIndex(int)
- **static** Direction[] values()
- Vector3i getVector()
- **static** Direction getByHorizontalIndex(int)
- Axis getAxis()

### Class: com.github.retrooper.packetevents.protocol.world.JointType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JointType valueOf(String)
- **static** JointType[] values()
- **static** Optional byName(String)
- String getSerializedName()
- Component getTranslatableName()

### Class: com.github.retrooper.packetevents.protocol.world.Location
Type: Class

Methods:
- Vector3f getDirection()
- void setPosition(Vector3d)
- void setYaw(float)
- float getYaw()
- double getX()
- float getPitch()
- double getY()
- Vector3d getPosition()
- double getZ()
- Location clone()
- Object clone() throws CloneNotSupportedException
- void setPitch(float)
- String toString()
- void setDirection(Vector3f)

### Class: com.github.retrooper.packetevents.protocol.world.MaterialType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** MaterialType valueOf(String)
- **static** MaterialType[] values()

### Class: com.github.retrooper.packetevents.protocol.world.PaintingType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PaintingType getByTitle(String)
- int getHeight()
- String getTitle()
- **static** PaintingType getById(int)
- **static** PaintingType valueOf(String)
- **static** PaintingType[] values()
- int getId()
- int getWidth()

### Class: com.github.retrooper.packetevents.protocol.world.PushReaction
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PushReaction valueOf(String)
- **static** PushReaction[] values()

### Class: com.github.retrooper.packetevents.protocol.world.Rotation
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Rotation valueOf(String)
- **static** Rotation[] values()

### Class: com.github.retrooper.packetevents.protocol.world.StructureMirror
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** StructureMirror valueOf(String)
- **static** StructureMirror[] values()

### Class: com.github.retrooper.packetevents.protocol.world.StructureRotation
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** StructureRotation valueOf(String)
- **static** StructureRotation[] values()

### Class: com.github.retrooper.packetevents.protocol.world.TestInstanceData
Type: Class

Methods:
- boolean isIgnoreEntities()
- **static** TestInstanceData read(PacketWrapper)
- void setTest(ResourceLocation)
- StructureRotation getRotation()
- void setIgnoreEntities(boolean)
- void setRotation(StructureRotation)
- TestInstanceData$Status getStatus()
- ResourceLocation getTest()
- void setStatus(TestInstanceData$Status)
- void setErrorMessage(Component)
- Vector3i getSize()
- void setSize(Vector3i)
- **static** void write(PacketWrapper, TestInstanceData)
- Component getErrorMessage()

### Class: com.github.retrooper.packetevents.protocol.world.TestInstanceData$Status
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TestInstanceData$Status valueOf(String)
- **static** TestInstanceData$Status[] values()

### Class: com.github.retrooper.packetevents.protocol.world.TileEntityType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TileEntityType getById(int)
- **static** TileEntityType valueOf(String)
- **static** TileEntityType[] values()
- int getId()

### Class: com.github.retrooper.packetevents.protocol.world.WorldBlockPosition
Type: Class

Methods:
- Vector3i getBlockPosition()
- ResourceLocation getWorld()
- void setBlockPosition(Vector3i)
- void setWorld(ResourceLocation)

### Class: com.github.retrooper.packetevents.protocol.world.WorldType
Type: Enum
Extends: java.lang.Enum

Methods:
- String getName()
- **static** WorldType valueOf(String)
- **static** WorldType[] values()
- **static** WorldType getByName(String)

## Package: com.github.retrooper.packetevents.protocol.world.biome

### Class: com.github.retrooper.packetevents.protocol.world.biome.Biome
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(Biome, ClientVersion)
- BiomeEffects getEffects()
- float getDownfall()
- Biome$TemperatureModifier getTemperatureModifier()
- boolean hasPrecipitation()
- Float getDepth()
- Float getScale()
- Biome$Category getCategory()
- **static** Biome decode(NBT, ClientVersion, TypesBuilderData)
- float getTemperature()
- Biome$Precipitation getPrecipitation()

### Class: com.github.retrooper.packetevents.protocol.world.biome.Biome$Category
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Biome$Category valueOf(String)
- **static** Biome$Category[] values()
- String getId()

### Class: com.github.retrooper.packetevents.protocol.world.biome.Biome$Precipitation
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Biome$Precipitation valueOf(String)
- **static** Biome$Precipitation[] values()
- String getId()

### Class: com.github.retrooper.packetevents.protocol.world.biome.Biome$TemperatureModifier
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Biome$TemperatureModifier valueOf(String)
- **static** Biome$TemperatureModifier[] values()
- String getId()

### Class: com.github.retrooper.packetevents.protocol.world.biome.BiomeEffects
Type: Class

Methods:
- Optional getAmbientSound()
- **static** NBT encode(BiomeEffects, ClientVersion)
- OptionalInt getFoliageColor()
- int getSkyColor()
- Optional getAdditionsSound()
- OptionalInt getGrassColor()
- BiomeEffects$GrassColorModifier getGrassColorModifier()
- Optional getParticle()
- **static** BiomeEffects decode(NBT, ClientVersion)
- Optional getMoodSound()
- int hashCode()
- int getFogColor()
- boolean equals(Object)
- RandomWeightedList getMusics()
- Optional getMusic()
- int getWaterFogColor()
- int getWaterColor()

### Class: com.github.retrooper.packetevents.protocol.world.biome.BiomeEffects$AdditionsSettings
Type: Class

Methods:
- **static** NBT encode(BiomeEffects$AdditionsSettings, ClientVersion)
- double getTickChance()
- int hashCode()
- boolean equals(Object)
- **static** BiomeEffects$AdditionsSettings decode(NBT, ClientVersion)
- Sound getSound()

### Class: com.github.retrooper.packetevents.protocol.world.biome.BiomeEffects$GrassColorModifier
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BiomeEffects$GrassColorModifier valueOf(String)
- **static** BiomeEffects$GrassColorModifier[] values()
- String getId()

### Class: com.github.retrooper.packetevents.protocol.world.biome.BiomeEffects$MoodSettings
Type: Class

Methods:
- **static** NBT encode(BiomeEffects$MoodSettings, ClientVersion)
- double getSoundOffset()
- int getBlockSearchExtent()
- int hashCode()
- boolean equals(Object)
- int getTickDelay()
- **static** BiomeEffects$MoodSettings decode(NBT, ClientVersion)
- Sound getSound()

### Class: com.github.retrooper.packetevents.protocol.world.biome.BiomeEffects$MusicSettings
Type: Class

Methods:
- **static** NBT encode(BiomeEffects$MusicSettings, ClientVersion)
- int hashCode()
- boolean isReplaceMusic()
- boolean equals(Object)
- int getMinDelay()
- **static** BiomeEffects$MusicSettings decode(NBT, ClientVersion)
- int getMaxDelay()
- Sound getSound()

### Class: com.github.retrooper.packetevents.protocol.world.biome.BiomeEffects$ParticleSettings
Type: Class

Methods:
- **static** NBT encode(BiomeEffects$ParticleSettings, ClientVersion)
- float getProbability()
- Particle getParticle()
- **static** BiomeEffects$ParticleSettings decode(NBT, ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.world.biome.Biomes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** Biome define(String)
- **static** Biome define(String, boolean)

### Class: com.github.retrooper.packetevents.protocol.world.biome.StaticBiome
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.world.biome.Biome

Methods:
- float getDownfall()
- Biome$TemperatureModifier getTemperatureModifier()
- Float getDepth()
- boolean deepEquals(Object)
- Biome$Category getCategory()
- BiomeEffects getEffects()
- boolean hasPrecipitation()
- Float getScale()
- int deepHashCode()
- String toString()
- Biome copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- float getTemperature()
- Biome$Precipitation getPrecipitation()

## Package: com.github.retrooper.packetevents.protocol.world.blockentity

### Class: com.github.retrooper.packetevents.protocol.world.blockentity.BlockEntityType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

No public methods found

### Class: com.github.retrooper.packetevents.protocol.world.blockentity.BlockEntityTypes
Type: Class

Methods:
- **static** BlockEntityType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** BlockEntityType getByName(String)

### Class: com.github.retrooper.packetevents.protocol.world.blockentity.StaticBlockEntityType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.world.blockentity.BlockEntityType

No public methods found

## Package: com.github.retrooper.packetevents.protocol.world.chunk

### Class: com.github.retrooper.packetevents.protocol.world.chunk.BaseChunk
Type: Interface

Methods:
- void set(int, int, int, WrappedBlockState)
- void set(int, int, int, int)
- void set(ClientVersion, int, int, int, int)
- int getBlockId(int, int, int)
- WrappedBlockState get(ClientVersion, int, int, int)
- WrappedBlockState get(ClientVersion, int, int, int, boolean)
- WrappedBlockState get(int, int, int)
- WrappedBlockState get(int, int, int, boolean)
- boolean isEmpty()
- **static** BaseChunk create()

### Class: com.github.retrooper.packetevents.protocol.world.chunk.ByteArray3d
Type: Class

Methods:
- void set(int, int, int, int)
- int get(int, int, int)
- void fill(int)
- byte[] getData()

### Class: com.github.retrooper.packetevents.protocol.world.chunk.ChunkBitMask
Type: Class

Methods:
- **static** BitSet readChunkMask(PacketWrapper)
- **static** void writeChunkMask(PacketWrapper, BitSet)
- **static** long[] readBitSetLongs(PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.world.chunk.Column
Type: Class

Methods:
- boolean hasHeightMaps()
- int getX()
- int[] getBiomeDataInts()
- boolean hasBiomeData()
- int getZ()
- Map getHeightmaps()
- NBTCompound getHeightMaps()
- byte[] getBiomeDataBytes()
- BaseChunk[] getChunks()
- TileEntity[] getTileEntities()
- boolean isFullChunk()

### Class: com.github.retrooper.packetevents.protocol.world.chunk.HeightmapType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** HeightmapType read(PacketWrapper)
- **static** HeightmapType getHeightmapType(String)
- **static** HeightmapType valueOf(String)
- **static** HeightmapType[] values()
- boolean isClient()
- String getSerializationKey()
- **static** void write(PacketWrapper, HeightmapType)

### Class: com.github.retrooper.packetevents.protocol.world.chunk.LightData
Type: Class
Implements: java.lang.Cloneable

Methods:
- void setSkyLightMask(BitSet)
- **static** LightData read(PacketWrapper)
- void setSkyLightArray(byte[][])
- void setBlockLightMask(BitSet)
- void setEmptySkyLightMask(BitSet)
- boolean isTrustEdges()
- void setTrustEdges(boolean)
- BitSet getEmptySkyLightMask()
- BitSet getSkyLightMask()
- int getSkyLightCount()
- int getBlockLightCount()
- void setBlockLightArray(byte[][])
- void setEmptyBlockLightMask(BitSet)
- BitSet getBlockLightMask()
- LightData clone()
- Object clone() throws CloneNotSupportedException
- void setSkyLightCount(int)
- byte[][] getBlockLightArray()
- void setBlockLightCount(int)
- BitSet getEmptyBlockLightMask()
- **static** void write(PacketWrapper, LightData)
- byte[][] getSkyLightArray()

### Class: com.github.retrooper.packetevents.protocol.world.chunk.NetworkChunkData
Type: Class

Methods:
- int getMask()
- int getExtendedChunkMask()
- void setData(byte[])
- boolean isFullChunk()
- byte[] getData()
- boolean hasSkyLight()

### Class: com.github.retrooper.packetevents.protocol.world.chunk.NibbleArray3d
Type: Class

Methods:
- void set(int, int, int, int)
- int get(int, int, int)
- byte[] getData()

### Class: com.github.retrooper.packetevents.protocol.world.chunk.ParsedChunkData
Type: Class

No public methods found

### Class: com.github.retrooper.packetevents.protocol.world.chunk.ShortArray3d
Type: Class

Methods:
- int getBlock(int, int, int)
- void set(int, int, int, int)
- void setData(int, int, int, int)
- int hashCode()
- void setBlockAndData(int, int, int, int, int)
- boolean equals(Object)
- int get(int, int, int)
- void setBlock(int, int, int, int)
- void fill(int)
- short[] getData()
- int getData(int, int, int)

### Class: com.github.retrooper.packetevents.protocol.world.chunk.TileEntity
Type: Class

Methods:
- NBTCompound getNBT()
- void setY(int)
- int getX()
- void setX(int)
- int getY()
- int getZ()
- int getType()
- short getYShort()
- void setZ(int)
- byte getPackedByte()

## Package: com.github.retrooper.packetevents.protocol.world.chunk.impl.v1_16

### Class: com.github.retrooper.packetevents.protocol.world.chunk.impl.v1_16.Chunk_v1_9
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.BaseChunk

Methods:
- NibbleArray3d getBlockLight()
- void set(int, int, int, int)
- **static** Chunk_v1_9 read(PacketWrapper, boolean, boolean)
- int getBlockId(int, int, int)
- void setBlockLight(NibbleArray3d)
- void setSkyLight(NibbleArray3d)
- boolean isEmpty()
- NibbleArray3d getSkyLight()
- **static** void write(PacketWrapper, Chunk_v1_9)
- **static** void write(NetStreamOutput, Chunk_v1_9)

## Package: com.github.retrooper.packetevents.protocol.world.chunk.impl.v1_7

### Class: com.github.retrooper.packetevents.protocol.world.chunk.impl.v1_7.Chunk_v1_7
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.BaseChunk

Methods:
- NibbleArray3d getBlockLight()
- NibbleArray3d getMetadata()
- void set(int, int, int, int)
- int getBlockId(int, int, int)
- NibbleArray3d getExtendedBlocks()
- boolean isEmpty()
- ByteArray3d getBlocks()
- NibbleArray3d getSkyLight()

## Package: com.github.retrooper.packetevents.protocol.world.chunk.impl.v1_8

### Class: com.github.retrooper.packetevents.protocol.world.chunk.impl.v1_8.Chunk_v1_8
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.BaseChunk

Methods:
- NibbleArray3d getBlockLight()
- void set(int, int, int, int)
- int getBlockId(int, int, int)
- boolean isEmpty()
- ShortArray3d getBlocks()
- NibbleArray3d getSkyLight()

## Package: com.github.retrooper.packetevents.protocol.world.chunk.impl.v_1_18

### Class: com.github.retrooper.packetevents.protocol.world.chunk.impl.v_1_18.Chunk_v1_18
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.BaseChunk

Methods:
- DataPalette getChunkData()
- void setBlockCount(int)
- void set(int, int, int, int)
- **static** Chunk_v1_18 read(PacketWrapper)
- **static** Chunk_v1_18 read(NetStreamInput)
- **static** Chunk_v1_18 read(NetStreamInput, boolean)
- int getBlockId(int, int, int)
- boolean isEmpty()
- DataPalette getBiomeData()
- int getBlockCount()
- **static** void write(PacketWrapper, Chunk_v1_18)
- **static** void write(NetStreamOutput, Chunk_v1_18)
- **static** void write(NetStreamOutput, Chunk_v1_18, boolean)

## Package: com.github.retrooper.packetevents.protocol.world.chunk.palette

### Class: com.github.retrooper.packetevents.protocol.world.chunk.palette.Palette
Type: Interface

Methods:
- int getBits()
- int size()
- int stateToId(int)
- int idToState(int)

### Class: com.github.retrooper.packetevents.protocol.world.chunk.palette.DataPalette
Type: Class

Methods:
- **static** DataPalette createEmpty(PaletteType)
- **static** DataPalette createForChunk()
- int set(int, int, int, int)
- **static** DataPalette read(NetStreamInput, PaletteType)
- **static** DataPalette read(NetStreamInput, PaletteType, boolean)
- **static** DataPalette read(NetStreamInput, PaletteType, boolean, boolean)
- int get(int, int, int)
- **static** DataPalette createForBiome()
- **static** DataPalette readLegacy(NetStreamInput)
- **static** void write(NetStreamOutput, DataPalette)
- **static** void write(NetStreamOutput, DataPalette, boolean)

### Class: com.github.retrooper.packetevents.protocol.world.chunk.palette.GlobalPalette
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.palette.Palette

Methods:
- int getBits()
- int size()
- int stateToId(int)
- int idToState(int)

### Class: com.github.retrooper.packetevents.protocol.world.chunk.palette.ListPalette
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.palette.Palette

Methods:
- int getBits()
- int size()
- int stateToId(int)
- int idToState(int)

### Class: com.github.retrooper.packetevents.protocol.world.chunk.palette.MapPalette
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.palette.Palette

Methods:
- int getBits()
- int size()
- int stateToId(int)
- int idToState(int)

### Class: com.github.retrooper.packetevents.protocol.world.chunk.palette.PaletteType
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean isForceMaxListPaletteSize()
- DataPalette read(PacketWrapper)
- int getMaxBitsPerEntry()
- int getStorageSize()
- int getMaxBitsPerEntryForList()
- **static** PaletteType valueOf(String)
- int getMaxBitsPerEntryForMap()
- **static** PaletteType[] values()
- DataPalette create()
- int getMinBitsPerEntry()
- int getBitShift()
- **static** void write(PacketWrapper, DataPalette)

### Class: com.github.retrooper.packetevents.protocol.world.chunk.palette.SingletonPalette
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.palette.Palette

Methods:
- int getBits()
- int size()
- int stateToId(int)
- int idToState(int)

## Package: com.github.retrooper.packetevents.protocol.world.chunk.reader

### Class: com.github.retrooper.packetevents.protocol.world.chunk.reader.ChunkReader
Type: Interface

Methods:
- BaseChunk[] read(Dimension, BitSet, BitSet, boolean, boolean, boolean, int, byte[], NetStreamInput)
- BaseChunk[] read(DimensionType, BitSet, BitSet, boolean, boolean, boolean, int, byte[], NetStreamInput)
- BaseChunk[] read(DimensionType, BitSet, BitSet, boolean, boolean, boolean, int, int, PacketWrapper)

## Package: com.github.retrooper.packetevents.protocol.world.chunk.reader.impl

### Class: com.github.retrooper.packetevents.protocol.world.chunk.reader.impl.ChunkReader_v1_16
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.reader.ChunkReader

Methods:
- BaseChunk[] read(DimensionType, BitSet, BitSet, boolean, boolean, boolean, int, int, PacketWrapper)

### Class: com.github.retrooper.packetevents.protocol.world.chunk.reader.impl.ChunkReader_v1_18
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.reader.ChunkReader

Methods:
- BaseChunk[] read(DimensionType, BitSet, BitSet, boolean, boolean, boolean, int, int, PacketWrapper)
- **static** int getMojangZeroByteSuffixLength(BaseChunk[])

### Class: com.github.retrooper.packetevents.protocol.world.chunk.reader.impl.ChunkReader_v1_7
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.reader.ChunkReader

Methods:
- BaseChunk[] read(DimensionType, BitSet, BitSet, boolean, boolean, boolean, int, int, PacketWrapper)
- **static** NetworkChunkData chunksToData(Chunk_v1_7[], byte[])

### Class: com.github.retrooper.packetevents.protocol.world.chunk.reader.impl.ChunkReader_v1_8
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.reader.ChunkReader

Methods:
- BaseChunk[] read(DimensionType, BitSet, BitSet, boolean, boolean, boolean, int, int, PacketWrapper)
- **static** NetworkChunkData chunksToData(Chunk_v1_8[], byte[])

### Class: com.github.retrooper.packetevents.protocol.world.chunk.reader.impl.ChunkReader_v1_9
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.chunk.reader.ChunkReader

Methods:
- BaseChunk[] read(DimensionType, BitSet, BitSet, boolean, boolean, boolean, int, int, PacketWrapper)

## Package: com.github.retrooper.packetevents.protocol.world.chunk.storage

### Class: com.github.retrooper.packetevents.protocol.world.chunk.storage.BaseStorage
Type: Abstract Class

Methods:
- void set(int, int)
- int getBitsPerEntry()
- int get(int)
- long[] getData()

### Class: com.github.retrooper.packetevents.protocol.world.chunk.storage.BitStorage
Type: Class
Extends: com.github.retrooper.packetevents.protocol.world.chunk.storage.BaseStorage

Methods:
- int getSize()
- void set(int, int)
- int getBitsPerEntry()
- int get(int)
- long[] getData()

### Class: com.github.retrooper.packetevents.protocol.world.chunk.storage.LegacyFlexibleStorage
Type: Class
Extends: com.github.retrooper.packetevents.protocol.world.chunk.storage.BaseStorage

Methods:
- int getSize()
- int getBitsPerEntry()
- void set(int, int)
- int get(int)
- long[] getData()
- long getMaxEntryValue()

## Package: com.github.retrooper.packetevents.protocol.world.damagetype

### Class: com.github.retrooper.packetevents.protocol.world.damagetype.DamageType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(DamageType, ClientVersion)
- DamageEffects getEffects()
- float getExhaustion()
- DamageScaling getScaling()
- String getMessageId()
- DeathMessageType getDeathMessageType()
- **static** DamageType decode(NBT, ClientVersion, TypesBuilderData)

### Class: com.github.retrooper.packetevents.protocol.world.damagetype.DamageEffects
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DamageEffects valueOf(String)
- **static** DamageEffects[] values()
- String getId()

### Class: com.github.retrooper.packetevents.protocol.world.damagetype.DamageScaling
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DamageScaling valueOf(String)
- **static** DamageScaling[] values()
- String getId()

### Class: com.github.retrooper.packetevents.protocol.world.damagetype.DamageTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()
- **static** DamageType getById(ClientVersion, int)
- **static** Collection values()
- **static** DamageType getByName(String)
- **static** DamageType define(String, String, float)
- **static** DamageType define(String, String, float, DamageEffects)
- **static** DamageType define(String, String, DamageScaling, float)
- **static** DamageType define(String, String, DamageScaling, float, DamageEffects, DeathMessageType)

### Class: com.github.retrooper.packetevents.protocol.world.damagetype.DeathMessageType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DeathMessageType valueOf(String)
- **static** DeathMessageType[] values()
- String getId()

### Class: com.github.retrooper.packetevents.protocol.world.damagetype.StaticDamageType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.world.damagetype.DamageType

Methods:
- DamageEffects getEffects()
- float getExhaustion()
- DamageScaling getScaling()
- String getMessageId()
- boolean deepEquals(Object)
- DeathMessageType getDeathMessageType()
- int deepHashCode()
- String toString()
- DamageType copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)

## Package: com.github.retrooper.packetevents.protocol.world.dimension

### Class: com.github.retrooper.packetevents.protocol.world.dimension.DimensionType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(DimensionType, ClientVersion)
- boolean isPiglinSafe()
- boolean isNatural()
- boolean isRespawnAnchorWorking()
- Integer getCloudHeight()
- boolean hasCeiling()
- boolean isBedWorking()
- String getInfiniburnTag()
- boolean isShrunk()
- int getMonsterSpawnBlockLightLimit()
- boolean hasRaids()
- **static** DimensionType decode(NBT, ClientVersion, TypesBuilderData)
- DimensionTypeRef asRef(ClientVersion)
- int getLogicalHeight()
- int getLogicalHeight(ClientVersion)
- OptionalLong getFixedTime()
- NBT getMonsterSpawnLightLevel()
- double getCoordinateScale()
- int getHeight()
- int getHeight(ClientVersion)
- float getAmbientLight()
- boolean isUltraWarm()
- ResourceLocation getEffectsLocation()
- boolean hasSkyLight()
- int getMinY()
- int getMinY(ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.world.dimension.DimensionTypeRef
Type: Interface

Methods:
- **static** DimensionTypeRef read(PacketWrapper)
- ResourceLocation getName()
- DimensionType resolve(IRegistry, ClientVersion)
- int getId()
- **static** void write(PacketWrapper, DimensionTypeRef)
- NBT getData()

### Class: com.github.retrooper.packetevents.protocol.world.dimension.DimensionTypeRef$DataRef
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.dimension.DimensionTypeRef

Methods:
- ResourceLocation getName()
- DimensionType resolve(IRegistry, ClientVersion)
- NBT getData()
- ResourceLocation getNullableName()

### Class: com.github.retrooper.packetevents.protocol.world.dimension.DimensionTypeRef$DirectRef
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.dimension.DimensionTypeRef

Methods:
- ClientVersion getVersion()
- ResourceLocation getName()
- DimensionType resolve(IRegistry, ClientVersion)
- DimensionType getDimensionType()
- int getId()
- NBT getData()

### Class: com.github.retrooper.packetevents.protocol.world.dimension.DimensionTypeRef$IdRef
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.dimension.DimensionTypeRef

Methods:
- DimensionType resolve(IRegistry, ClientVersion)
- int getId()

### Class: com.github.retrooper.packetevents.protocol.world.dimension.DimensionTypeRef$NameRef
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.dimension.DimensionTypeRef

Methods:
- ResourceLocation getName()
- DimensionType resolve(IRegistry, ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.world.dimension.DimensionTypes
Type: Class

Methods:
- **static** VersionedRegistry getRegistry()

### Class: com.github.retrooper.packetevents.protocol.world.dimension.StaticDimensionType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.world.dimension.DimensionType

Methods:
- boolean isPiglinSafe()
- boolean isNatural()
- boolean isRespawnAnchorWorking()
- Integer getCloudHeight()
- boolean hasCeiling()
- boolean isBedWorking()
- boolean deepEquals(Object)
- String getInfiniburnTag()
- int getMonsterSpawnBlockLightLimit()
- boolean hasRaids()
- int getLogicalHeight(ClientVersion)
- OptionalLong getFixedTime()
- NBT getMonsterSpawnLightLevel()
- double getCoordinateScale()
- int getHeight(ClientVersion)
- float getAmbientLight()
- int deepHashCode()
- boolean isUltraWarm()
- String toString()
- DimensionType copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- ResourceLocation getEffectsLocation()
- boolean hasSkyLight()
- int getMinY(ClientVersion)

## Package: com.github.retrooper.packetevents.protocol.world.painting

### Class: com.github.retrooper.packetevents.protocol.world.painting.PaintingVariant
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity, com.github.retrooper.packetevents.protocol.mapper.CopyableEntity, com.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity

Methods:
- **static** NBT encode(PaintingVariant, ClientVersion)
- **static** void writeDirect(PacketWrapper, PaintingVariant)
- int getHeight()
- **static** PaintingVariant read(PacketWrapper)
- **static** PaintingVariant readDirect(PacketWrapper)
- int getWidth()
- **static** PaintingVariant decode(NBT, ClientVersion, TypesBuilderData)
- **static** void write(PacketWrapper, PaintingVariant)
- ResourceLocation getAssetId()

### Class: com.github.retrooper.packetevents.protocol.world.painting.PaintingVariants
Type: Class

Methods:
- **static** PaintingVariant getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** PaintingVariant getByName(String)
- **static** PaintingVariant define(String, int, int)
- **static** PaintingVariant define(String, int, int, ResourceLocation)

### Class: com.github.retrooper.packetevents.protocol.world.painting.StaticPaintingVariant
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.world.painting.PaintingVariant

Methods:
- int getHeight()
- boolean deepEquals(Object)
- int deepHashCode()
- String toString()
- int getWidth()
- PaintingVariant copy(TypesBuilderData)
- MappedEntity copy(TypesBuilderData)
- ResourceLocation getAssetId()

## Package: com.github.retrooper.packetevents.protocol.world.positionsource

### Class: com.github.retrooper.packetevents.protocol.world.positionsource.PositionSourceType
Type: Interface
Implements: com.github.retrooper.packetevents.protocol.mapper.MappedEntity

Methods:
- void encode(PositionSource, ClientVersion, NBTCompound)
- PositionSource read(PacketWrapper)
- PositionSource decode(NBTCompound, ClientVersion)
- void write(PacketWrapper, PositionSource)

### Class: com.github.retrooper.packetevents.protocol.world.positionsource.PositionSourceTypes$Decoder
Type: Interface

Methods:
- Object decode(NBTCompound, ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.world.positionsource.PositionSourceTypes$Encoder
Type: Interface

Methods:
- void encode(Object, ClientVersion, NBTCompound)

### Class: com.github.retrooper.packetevents.protocol.world.positionsource.PositionSource
Type: Abstract Class

Methods:
- **static** NBT encode(PositionSource, ClientVersion)
- **static** NBT encode(PositionSource, PositionSourceType, ClientVersion)
- PositionSourceType getType()
- **static** PositionSource decode(NBT, ClientVersion)

### Class: com.github.retrooper.packetevents.protocol.world.positionsource.PositionSourceTypes
Type: Class

Methods:
- **static** PositionSourceType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** PositionSourceType getByName(String)
- **static** PositionSourceType define(String, PacketWrapper$Reader, PacketWrapper$Writer, PositionSourceTypes$Decoder, PositionSourceTypes$Encoder)

### Class: com.github.retrooper.packetevents.protocol.world.positionsource.StaticPositionSourceType
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity
Implements: com.github.retrooper.packetevents.protocol.world.positionsource.PositionSourceType

Methods:
- void encode(PositionSource, ClientVersion, NBTCompound)
- PositionSource read(PacketWrapper)
- PositionSource decode(NBTCompound, ClientVersion)
- void write(PacketWrapper, PositionSource)

## Package: com.github.retrooper.packetevents.protocol.world.positionsource.builtin

### Class: com.github.retrooper.packetevents.protocol.world.positionsource.builtin.BlockPositionSource
Type: Class
Extends: com.github.retrooper.packetevents.protocol.world.positionsource.PositionSource

Methods:
- void setPos(Vector3i)
- **static** BlockPositionSource read(PacketWrapper)
- Vector3i getPos()
- **static** BlockPositionSource decodeSource(NBTCompound, ClientVersion)
- **static** void write(PacketWrapper, BlockPositionSource)
- **static** void encodeSource(BlockPositionSource, ClientVersion, NBTCompound)

### Class: com.github.retrooper.packetevents.protocol.world.positionsource.builtin.EntityPositionSource
Type: Class
Extends: com.github.retrooper.packetevents.protocol.world.positionsource.PositionSource

Methods:
- float getOffsetY()
- **static** EntityPositionSource read(PacketWrapper)
- void setEntityUniqueId(Optional)
- void setOffsetY(float)
- void setEntityId(int)
- int getEntityId()
- Optional getEntityUniqueId()
- **static** EntityPositionSource decodeSource(NBTCompound, ClientVersion)
- **static** void write(PacketWrapper, EntityPositionSource)
- **static** void encodeSource(EntityPositionSource, ClientVersion, NBTCompound)

## Package: com.github.retrooper.packetevents.protocol.world.states

### Class: com.github.retrooper.packetevents.protocol.world.states.WrappedBlockState
Type: Class

Methods:
- void setShrieking(boolean)
- void setBloom(Bloom)
- boolean isUnstable()
- int getGlobalId()
- boolean isSlotFiveOccupied()
- void setStage(int)
- int getHatch()
- boolean isOccupied()
- boolean isLocked()
- void setUp(boolean)
- boolean isShort()
- boolean isInverted()
- void setInWall(boolean)
- Attachment getAttachment()
- boolean isSlotFourOccupied()
- TrialSpawnerState getTrialSpawnerState()
- void setRotation(int)
- boolean isMap()
- StateType getType()
- void setCharges(int)
- boolean isAttached()
- int getAge()
- void setDusted(boolean)
- void setPower(int)
- int getCandles()
- boolean isShrieking()
- void setCandles(int)
- boolean isBottom()
- int getFlowerAmount()
- Map getInternalData()
- int getStage()
- void setOrientation(Orientation)
- int getDistance()
- void setSlotOneOccupied(boolean)
- void setLayers(int)
- void setPersistent(boolean)
- void setEye(boolean)
- void setDown(boolean)
- void setTilt(Tilt)
- void setDisarmed(boolean)
- int getMoisture()
- Bloom getBloom()
- void setAttachment(Attachment)
- String toString()
- BlockFace getFacing()
- int getSegmentAmount()
- void setInstrument(Instrument)
- boolean isSlotZeroOccupied()
- **static** NBT encode(WrappedBlockState, ClientVersion)
- void setThickness(Thickness)
- boolean isSlotTwoOccupied()
- void setAttached(boolean)
- void setShort(boolean)
- void setInverted(boolean)
- void setSegmentAmount(int)
- Leaves getLeaves()
- CreakingHeartState getCreaking()
- Orientation getOrientation()
- void setSignalFire(boolean)
- boolean isPersistent()
- void setVerticalDirection(VerticalDirection)
- void setSlotZeroOccupied(boolean)
- void setHasBottle2(boolean)
- VerticalDirection getVerticalDirection()
- void setHasBottle0(boolean)
- void setHasBottle1(boolean)
- void setDelay(int)
- void setCreakingHeartState(CreakingHeartState)
- boolean isExtended()
- void setNorth(North)
- Instrument getInstrument()
- Tilt getTilt()
- void setTypeData(Type)
- **static** WrappedBlockState getDefaultState(StateType)
- **static** WrappedBlockState getDefaultState(ClientVersion, StateType)
- **static** WrappedBlockState getDefaultState(ClientVersion, StateType, boolean)
- void setCrafting(boolean)
- Shape getShape()
- int getLayers()
- void setTrialSpawnerState(TrialSpawnerState)
- int getHoneyLevel()
- boolean isSlotOneOccupied()
- int hashCode()
- void setLit(boolean)
- void setEggs(int)
- void setSlotFiveOccupied(boolean)
- void setTip(boolean)
- boolean isDrag()
- boolean isHasBook()
- void setCreaking(CreakingHeartState)
- SculkSensorPhase getSculkSensorPhase()
- boolean isTip()
- int getHydration()
- void setLocked(boolean)
- boolean isLit()
- int getBites()
- void setOccupied(boolean)
- void setSlotTwoOccupied(boolean)
- void setBottom(boolean)
- boolean isHasRecord()
- WrappedBlockState clone()
- Object clone() throws CloneNotSupportedException
- Type getTypeData()
- int getEggs()
- void setConditional(boolean)
- boolean isCanSummon()
- void setHinge(Hinge)
- void setDrag(boolean)
- void setTriggered(boolean)
- boolean isConditional()
- East getEast()
- void setLevel(int)
- boolean isHanging()
- void setHasBook(boolean)
- Half getHalf()
- void setNatural(boolean)
- South getSouth()
- void setEnabled(boolean)
- void setCanSummon(boolean)
- boolean isOpen()
- void setEast(East)
- boolean isEnabled()
- void setNote(int)
- void setPart(Part)
- boolean isSnowy()
- void setFacing(BlockFace)
- void setSouth(South)
- void setAge(int)
- void setCracked(boolean)
- void setBerries(boolean)
- boolean isHasBottle2()
- boolean isSlotThreeOccupied()
- boolean isHasBottle0()
- boolean isDown()
- boolean isHasBottle1()
- boolean isSignalFire()
- boolean isUp()
- boolean isEye()
- void setPickles(int)
- void setHoneyLevel(int)
- Object getData(StateValue)
- void setWest(West)
- void setData(StateValue, Object)
- void setMode(Mode)
- Axis getAxis()
- void setAxis(Axis)
- int getLevel()
- void setActive(boolean)
- boolean equals(Object)
- int getPickles()
- void setOpen(boolean)
- int getDelay()
- int getRotation()
- boolean isPowered()
- boolean isActive()
- **static** WrappedBlockState decode(NBT, ClientVersion)
- North getNorth()
- boolean isDisarmed()
- void setFace(Face)
- void setMap(boolean)
- Mode getMode()
- boolean isCrafting()
- void setSnowy(boolean)
- void setUnstable(boolean)
- West getWest()
- **static** WrappedBlockState getByString(String)
- **static** WrappedBlockState getByString(ClientVersion, String)
- **static** WrappedBlockState getByString(ClientVersion, String, boolean)
- Face getFace()
- void setHasRecord(boolean)
- void setExtended(boolean)
- int getPower()
- void setDistance(int)
- void setHydration(int)
- void setFlowerAmount(int)
- **static** void ensureLoad()
- void setPowered(boolean)
- void setMoisture(int)
- void setWaterlogged(boolean)
- boolean isWaterlogged()
- boolean isBerries()
- boolean isCracked()
- boolean isInWall()
- void setLeaves(Leaves)
- **static** WrappedBlockState getByGlobalId(int)
- **static** WrappedBlockState getByGlobalId(int, boolean)
- **static** WrappedBlockState getByGlobalId(ClientVersion, int)
- **static** WrappedBlockState getByGlobalId(ClientVersion, int, boolean)
- void setSlotFourOccupied(boolean)
- int getCharges()
- boolean isTriggered()
- boolean isNatural()
- Thickness getThickness()
- void setSculkSensorPhase(SculkSensorPhase)
- boolean isDusted()
- void setHanging(boolean)
- void setSlotThreeOccupied(boolean)
- Part getPart()
- int getNote()
- void setHatch(int)
- void setShape(Shape)
- void setBites(int)
- CreakingHeartState getCreakingHeartState()
- Hinge getHinge()
- void setHalf(Half)

## Package: com.github.retrooper.packetevents.protocol.world.states.defaulttags

### Class: com.github.retrooper.packetevents.protocol.world.states.defaulttags.BlockTags
Type: Class

Methods:
- boolean contains(StateType)
- String getName()
- boolean isReallyEmpty()
- **static** BlockTags getByName(String)
- Set getStates()

### Class: com.github.retrooper.packetevents.protocol.world.states.defaulttags.ItemTags
Type: Class

Methods:
- boolean contains(ItemType)
- String getName()
- boolean isReallyEmpty()
- ItemTags getByName(String)
- Set getStates()

## Package: com.github.retrooper.packetevents.protocol.world.states.enums

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Attachment
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Attachment valueOf(String)
- **static** Attachment[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Axis
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Axis valueOf(String)
- **static** Axis[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Bloom
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Bloom valueOf(String)
- **static** Bloom[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.CreakingHeartState
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** CreakingHeartState valueOf(String)
- **static** CreakingHeartState[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.East
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** East valueOf(String)
- **static** East[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Face
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Face valueOf(String)
- **static** Face[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Half
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Half valueOf(String)
- **static** Half[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Hinge
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Hinge valueOf(String)
- **static** Hinge[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Instrument
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Instrument valueOf(String)
- **static** Instrument[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Leaves
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Leaves valueOf(String)
- **static** Leaves[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Mode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Mode valueOf(String)
- **static** Mode[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.North
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** North valueOf(String)
- **static** North[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Orientation
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Orientation valueOf(String)
- **static** Orientation[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Part
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Part valueOf(String)
- **static** Part[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.SculkSensorPhase
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** SculkSensorPhase valueOf(String)
- **static** SculkSensorPhase[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Shape
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Shape valueOf(String)
- **static** Shape[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.South
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** South valueOf(String)
- **static** South[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Thickness
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Thickness valueOf(String)
- **static** Thickness[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Tilt
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Tilt valueOf(String)
- **static** Tilt[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.TrialSpawnerState
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TrialSpawnerState valueOf(String)
- **static** TrialSpawnerState[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.Type
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Type valueOf(String)
- **static** Type[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.VaultState
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** VaultState valueOf(String)
- **static** VaultState[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.VerticalDirection
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** VerticalDirection valueOf(String)
- **static** VerticalDirection[] values()

### Class: com.github.retrooper.packetevents.protocol.world.states.enums.West
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** West valueOf(String)
- **static** West[] values()

## Package: com.github.retrooper.packetevents.protocol.world.states.type

### Class: com.github.retrooper.packetevents.protocol.world.states.type.StateType
Type: Class

Methods:
- String getName()
- boolean isBlocking()
- StateType$Mapped getMapped()
- MaterialType getMaterialType()
- boolean isRequiresCorrectTool()
- boolean isSolid()
- float getBlastResistance()
- WrappedBlockState createBlockState()
- WrappedBlockState createBlockState(ClientVersion)
- int hashCode()
- float getHardness()
- boolean equals(Object)
- boolean exceedsCube()
- String toString()
- boolean isReplaceable()
- boolean isAir()

### Class: com.github.retrooper.packetevents.protocol.world.states.type.StateType$Mapped
Type: Class
Extends: com.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity

Methods:
- StateType getStateType()

### Class: com.github.retrooper.packetevents.protocol.world.states.type.StateTypes
Type: Class

Methods:
- **static** StateType$Mapped getMappedById(ClientVersion, int)
- **static** StateType getById(ClientVersion, int)
- **static** VersionedRegistry getRegistry()
- **static** Collection values()
- **static** StateTypes$Builder builder()
- **static** StateType$Mapped getMappedByName(String)
- **static** StateType$Mapped getMappedByName(ResourceLocation)
- **static** StateType getByName(String)
- **static** StateType getByName(ResourceLocation)

### Class: com.github.retrooper.packetevents.protocol.world.states.type.StateTypes$Builder
Type: Class

Methods:
- StateTypes$Builder isSolid(boolean)
- StateTypes$Builder hardness(float)
- StateTypes$Builder requiresCorrectTool(boolean)
- StateTypes$Builder isBlocking(boolean)
- StateType build()
- StateTypes$Builder name(String)
- StateTypes$Builder isAir(boolean)
- StateTypes$Builder blastResistance(float)
- StateTypes$Builder isShapeExceedsCube(boolean)
- StateTypes$Builder setMaterial(MaterialType)

### Class: com.github.retrooper.packetevents.protocol.world.states.type.StateValue
Type: Enum
Extends: java.lang.Enum

Methods:
- String getName()
- **static** StateValue valueOf(String)
- Function getParser()
- **static** StateValue[] values()
- **static** StateValue byName(String)
- Object parse(String)
- Class getDataClass()

## Package: com.github.retrooper.packetevents.protocol.world.waypoint

### Class: com.github.retrooper.packetevents.protocol.world.waypoint.WaypointInfo
Type: Interface

Methods:
- WaypointInfo$Type getType()

### Class: com.github.retrooper.packetevents.protocol.world.waypoint.AzimuthWaypointInfo
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.waypoint.WaypointInfo

Methods:
- **static** AzimuthWaypointInfo read(PacketWrapper)
- float getAngle()
- WaypointInfo$Type getType()
- **static** void write(PacketWrapper, WaypointInfo)

### Class: com.github.retrooper.packetevents.protocol.world.waypoint.ChunkWaypointInfo
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.waypoint.WaypointInfo

Methods:
- **static** ChunkWaypointInfo read(PacketWrapper)
- int getChunkZ()
- WaypointInfo$Type getType()
- int getChunkX()
- **static** void write(PacketWrapper, WaypointInfo)

### Class: com.github.retrooper.packetevents.protocol.world.waypoint.EmptyWaypointInfo
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.waypoint.WaypointInfo

Methods:
- **static** EmptyWaypointInfo read(PacketWrapper)
- WaypointInfo$Type getType()
- **static** void write(PacketWrapper, WaypointInfo)

### Class: com.github.retrooper.packetevents.protocol.world.waypoint.TrackedWaypoint
Type: Class

Methods:
- **static** TrackedWaypoint read(PacketWrapper)
- WaypointInfo getInfo()
- Either getIdentifier()
- **static** void write(PacketWrapper, TrackedWaypoint)
- WaypointIcon getIcon()

### Class: com.github.retrooper.packetevents.protocol.world.waypoint.Vec3iWaypointInfo
Type: Class
Implements: com.github.retrooper.packetevents.protocol.world.waypoint.WaypointInfo

Methods:
- Vector3i getPosition()
- **static** Vec3iWaypointInfo read(PacketWrapper)
- WaypointInfo$Type getType()
- **static** void write(PacketWrapper, WaypointInfo)

### Class: com.github.retrooper.packetevents.protocol.world.waypoint.WaypointIcon
Type: Class

Methods:
- ResourceLocation getStyle()
- **static** WaypointIcon read(PacketWrapper)
- Color getColor()
- **static** void write(PacketWrapper, WaypointIcon)

### Class: com.github.retrooper.packetevents.protocol.world.waypoint.WaypointInfo$Type
Type: Enum
Extends: java.lang.Enum

Methods:
- WaypointInfo read(PacketWrapper)
- **static** WaypointInfo$Type valueOf(String)
- **static** WaypointInfo$Type[] values()
- void write(PacketWrapper, WaypointInfo)

## Package: com.github.retrooper.packetevents.resources

### Class: com.github.retrooper.packetevents.resources.ResourceLocation
Type: Class
Implements: net.kyori.adventure.key.Keyed

Methods:
- **static** ResourceLocation minecraft(String)
- **static** NBT encode(PacketWrapper, ResourceLocation)
- String getKey()
- **static** ResourceLocation read(PacketWrapper)
- **static** String getNamespace(String)
- String getNamespace()
- int hashCode()
- boolean equals(Object)
- **static** String getPath(String)
- String toString()
- **static** ResourceLocation decode(NBT, PacketWrapper)
- **static** void write(PacketWrapper, ResourceLocation)
- Key key()
- **static** String normString(String)

## Package: com.github.retrooper.packetevents.settings

### Class: com.github.retrooper.packetevents.settings.PacketEventsSettings
Type: Class

Methods:
- PacketEventsSettings timeStampMode(TimeStampMode)
- PacketEventsSettings debug(boolean)
- PacketEventsSettings reEncodeByDefault(boolean)
- boolean reEncodeByDefault()
- Function getResourceProvider()
- PacketEventsSettings fullStackTrace(boolean)
- PacketEventsSettings kickOnPacketException(boolean)
- boolean isKickIfTerminated()
- boolean isFullStackTraceEnabled()
- boolean isKickOnPacketExceptionEnabled()
- PacketEventsSettings kickIfTerminated(boolean)
- PacketEventsSettings customResourceProvider(Function)
- boolean shouldCheckForUpdates()
- PacketEventsSettings downsampleColors(boolean)
- TimeStampMode getTimeStampMode()
- boolean isDebugEnabled()
- PacketEventsSettings checkForUpdates(boolean)
- boolean isbStatsEnabled()
- boolean shouldDownsampleColors()
- PacketEventsSettings bStats(boolean)

## Package: com.github.retrooper.packetevents.util

### Class: com.github.retrooper.packetevents.util.BinaryNBTCompound
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()
- byte[] getData()

### Class: com.github.retrooper.packetevents.util.ColorUtil
Type: Class

Methods:
- **static** int getId(NamedTextColor)
- **static** String toString(NamedTextColor)
- **static** NamedTextColor fromId(int)

### Class: com.github.retrooper.packetevents.util.Dummy
Type: Class

Methods:
- **static** Dummy dummy()
- **static** void dummyWriteNbt(PacketWrapper, Dummy)
- **static** Dummy dummyRead(PacketWrapper)
- String toString()
- **static** Dummy dummyReadNbt(PacketWrapper)
- **static** void dummyWrite(PacketWrapper, Dummy)

### Class: com.github.retrooper.packetevents.util.Either
Type: Class

Methods:
- boolean isRight()
- Object getRight()
- boolean isLeft()
- int hashCode()
- boolean equals(Object)
- Object get()
- **static** Either createRight(Object)
- **static** Either createLeft(Object)
- Object getLeft()

### Class: com.github.retrooper.packetevents.util.EnumUtil
Type: Class

Methods:
- **static** Enum valueOf(Class, String)
- **static** Enum valueByIndex(Class, int)

### Class: com.github.retrooper.packetevents.util.EventCreationUtil
Type: Class

Methods:
- **static** PacketSendEvent createSendEvent(Object, User, Object, Object, boolean) throws PacketProcessException
- **static** PacketReceiveEvent createReceiveEvent(Object, User, Object, Object, boolean) throws PacketProcessException

### Class: com.github.retrooper.packetevents.util.ExceptionUtil
Type: Class

Methods:
- **static** boolean isException(Throwable, Class)
- **static** boolean isExceptionContainedIn(Throwable, Set)

### Class: com.github.retrooper.packetevents.util.FakeChannelUtil
Type: Class

Methods:
- **static** boolean isFakeChannel(Object)

### Class: com.github.retrooper.packetevents.util.Filterable
Type: Class

Methods:
- Object getFiltered()
- **static** Filterable read(PacketWrapper, PacketWrapper$Reader)
- void setRaw(Object)
- int hashCode()
- boolean equals(Object)
- Object getRaw()
- **static** void write(PacketWrapper, Filterable, PacketWrapper$Writer)
- void setFiltered(Object)

### Class: com.github.retrooper.packetevents.util.KnownPack
Type: Class

Methods:
- String getVersion()
- String getNamespace()
- int hashCode()
- boolean equals(Object)
- String toString()
- String getId()

### Class: com.github.retrooper.packetevents.util.LegacyFormat
Type: Class

Methods:
- **static** String trimLegacyFormat(String, int)

### Class: com.github.retrooper.packetevents.util.LogManager
Type: Class

Methods:
- boolean isDebug()
- void warn(String)
- void debug(String)
- void severe(String)
- void info(String)

### Class: com.github.retrooper.packetevents.util.MathUtil
Type: Class

Methods:
- **static** int floor(double)
- **static** int floor(float)
- **static** int clamp(int, int, int)
- **static** double clamp(double, double, double)
- **static** float clamp(float, float, float)

### Class: com.github.retrooper.packetevents.util.MojangAPIUtil
Type: Class

Methods:
- **static** String requestPlayerName(UUID)
- **static** List requestPlayerTextureProperties(UUID)
- **static** UUID requestPlayerUUID(String)

### Class: com.github.retrooper.packetevents.util.PEVersion
Type: Class
Implements: java.lang.Comparable

Methods:
- int[] asArray()
- int minor()
- String toStringWithoutSnapshot()
- int compareTo(PEVersion)
- int compareTo(Object)
- String snapshotCommit()
- boolean isNewerThan(PEVersion)
- int patch()
- boolean isOlderThan(PEVersion)
- int major()
- int hashCode()
- boolean equals(Object)
- PEVersion clone()
- Object clone() throws CloneNotSupportedException
- String toString()
- **static** PEVersion fromString(String)
- boolean snapshot()

### Class: com.github.retrooper.packetevents.util.PEVersions
Type: Class

No public methods found

### Class: com.github.retrooper.packetevents.util.PacketEventsImplHelper
Type: Class

Methods:
- **static** PacketReceiveEvent handleServerBoundPacket(Object, User, Object, Object, boolean) throws Exception
- **static** void handleDisconnection(Object, UUID)
- **static** PacketSendEvent handleClientBoundPacket(Object, User, Object, Object, boolean) throws Exception
- **static** ProtocolPacketEvent handlePacket(Object, User, Object, Object, boolean, PacketSide) throws Exception

### Class: com.github.retrooper.packetevents.util.PacketTransformationUtil
Type: Class

Methods:
- **static** PacketWrapper[] transform(PacketWrapper)

### Class: com.github.retrooper.packetevents.util.Quaternion4f
Type: Class

Methods:
- void setW(float)
- float getW()
- void setY(float)
- float getX()
- float getY()
- void setX(float)
- float getZ()
- void setZ(float)

### Class: com.github.retrooper.packetevents.util.RandomWeightedList
Type: Class
Implements: java.lang.Iterable

Methods:
- **static** NBT encode(RandomWeightedList, ClientVersion, ComponentType$Encoder)
- Iterator iterator()
- List getEntries()
- **static** RandomWeightedList decode(NBT, ClientVersion, ComponentType$Decoder)
- void setEntries(List)

### Class: com.github.retrooper.packetevents.util.RandomWeightedList$Entry
Type: Class

Methods:
- **static** NBTCompound encode(RandomWeightedList$Entry, ClientVersion, ComponentType$Encoder)
- int getWeight()
- **static** RandomWeightedList$Entry decode(NBT, ClientVersion, ComponentType$Decoder)
- Object getData()

### Class: com.github.retrooper.packetevents.util.StringUtil
Type: Class

Methods:
- **static** String maximizeLength(String, int)

### Class: com.github.retrooper.packetevents.util.TimeStampMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TimeStampMode valueOf(String)
- **static** TimeStampMode[] values()

### Class: com.github.retrooper.packetevents.util.UUIDUtil
Type: Class

Methods:
- **static** UUID fromStringWithoutDashes(String)
- **static** String toStringWithoutDashes(UUID)
- **static** String toString(UUID)
- **static** UUID fromString(String)

### Class: com.github.retrooper.packetevents.util.UniqueIdUtil
Type: Class

Methods:
- **static** int[] toIntArray(UUID)
- **static** UUID fromIntArray(int[])

### Class: com.github.retrooper.packetevents.util.Vector3d
Type: Class

Methods:
- Vector3i toVector3i()
- **static** NBT encode(Vector3d, ClientVersion)
- Vector3d crossProduct(Vector3d)
- double distance(Vector3d)
- double dot(Vector3d)
- **static** Vector3d decode(NBT, ClientVersion)
- **static** Vector3d zero()
- double distanceSquared(Vector3d)
- int hashCode()
- Vector3d normalize()
- Vector3d multiply(double, double, double)
- Vector3d multiply(Vector3d)
- Vector3d multiply(double)
- **static** void write(PacketWrapper, Vector3d)
- Vector3d add(double, double, double)
- Vector3d add(Vector3d)
- double lengthSquared()
- **static** Vector3d read(PacketWrapper)
- Vector3d offset(BlockFace)
- Vector3d subtract(double, double, double)
- Vector3d subtract(Vector3d)
- double length()
- Vector3d withZ(double)
- Vector3d withX(double)
- Vector3d withY(double)
- Vector3d with(Double, Double, Double)
- double getX()
- double getY()
- double getZ()
- boolean equals(Object)
- String toString()

### Class: com.github.retrooper.packetevents.util.Vector3f
Type: Class

Methods:
- Vector3f add(float, float, float)
- Vector3f add(Vector3f)
- Vector3f crossProduct(Vector3f)
- Vector3f offset(BlockFace)
- Vector3f subtract(float, float, float)
- Vector3f subtract(Vector3f)
- float dot(Vector3f)
- Vector3f withZ(float)
- Vector3f withX(float)
- Vector3f withY(float)
- **static** Vector3f zero()
- Vector3f with(Float, Float, Float)
- float getX()
- float getY()
- float getZ()
- int hashCode()
- boolean equals(Object)
- String toString()
- Vector3f multiply(float, float, float)
- Vector3f multiply(Vector3f)
- Vector3f multiply(float)

### Class: com.github.retrooper.packetevents.util.Vector3i
Type: Class

Methods:
- Vector3i add(int, int, int)
- Vector3i add(Vector3i)
- Vector3i crossProduct(Vector3i)
- **static** Vector3i read(PacketWrapper)
- Vector3i offset(BlockFace)
- Vector3i subtract(int, int, int)
- Vector3i subtract(Vector3i)
- int dot(Vector3i)
- Vector3i withZ(int)
- long getSerializedPosition(ServerVersion)
- long getSerializedPosition()
- Vector3i withX(int)
- Vector3i withY(int)
- **static** Vector3i zero()
- Vector3i with(Integer, Integer, Integer)
- int getX()
- int getY()
- int getZ()
- int hashCode()
- boolean equals(Object)
- String toString()
- Vector3d toVector3d()
- Vector3i multiply(int, int, int)
- Vector3i multiply(Vector3i)
- Vector3i multiply(int)
- **static** void write(PacketWrapper, Vector3i)

### Class: com.github.retrooper.packetevents.util.VersionMapper
Type: Class

Methods:
- ClientVersion[] getReversedVersions()
- int getIndex(ClientVersion)
- ClientVersion[] getVersions()

## Package: com.github.retrooper.packetevents.util.adventure

### Class: com.github.retrooper.packetevents.util.adventure.AdventureIndexUtil
Type: Class

Methods:
- **static** Object indexValueOrThrow(Index, Object)
- **static** Object indexKeyOrThrow(Index, Object)

### Class: com.github.retrooper.packetevents.util.adventure.AdventureNBTSerializer
Type: Class
Implements: io.github.retrooper.packetevents.adventure.serializer.ComponentSerializer

Methods:
- NBT serializeOr(Component, NBT)
- NBT serializeOr(Component, NBT, PacketWrapper)
- Object serializeOr(Component, Object)
- NBT serialize(Component)
- NBT serialize(Component, PacketWrapper)
- Object serialize(Component)
- NBT serializeOrNull(Component)
- NBT serializeOrNull(Component, PacketWrapper)
- Object serializeOrNull(Component)
- NBTCompound serializeStyle(Style)
- NBTCompound serializeStyle(Style, PacketWrapper)
- Component deserializeOr(NBT, Component)
- Component deserializeOr(NBT, Component, PacketWrapper)
- Component deserializeOr(Object, Component)
- Component deserializeOrNull(NBT)
- Component deserializeOrNull(NBT, PacketWrapper)
- Component deserializeOrNull(Object)
- Style deserializeStyle(NBTCompound)
- Style deserializeStyle(NBTCompound, PacketWrapper)
- Component deserialize(NBT)
- Component deserialize(NBT, PacketWrapper)
- Component deserialize(Object)

### Class: com.github.retrooper.packetevents.util.adventure.AdventureSerializer
Type: Class
Implements: com.github.retrooper.packetevents.protocol.util.NbtEncoder, com.github.retrooper.packetevents.protocol.util.NbtDecoder

Methods:
- NBT encode(PacketWrapper, Component)
- NBT encode(PacketWrapper, Object)
- AdventureNBTSerializer nbt()
- LegacyComponentSerializer legacy()
- String asJson(Component)
- Component fromLegacy(String)
- **static** AdventureSerializer serializer(PacketWrapper)
- **static** AdventureSerializer serializer(ClientVersion)
- **static** AdventureSerializer serializer()
- **static** Component parseComponent(String)
- Component decode(NBT, PacketWrapper)
- Object decode(NBT, PacketWrapper)
- JsonElement asJsonTree(Component)
- **static** AdventureNBTSerializer getNBTSerializer()
- Component fromJsonTree(JsonElement)
- **static** Component fromLegacyFormat(String)
- **static** NBT toNbt(Component)
- **static** LegacyComponentSerializer getLegacyGsonSerializer()
- **static** JsonElement toJsonTree(Component)
- **static** String toLegacyFormat(Component)
- **static** String asVanilla(Component)
- **static** GsonComponentSerializer getGsonSerializer()
- Component fromNbtTag(NBT)
- Component fromNbtTag(NBT, PacketWrapper)
- **static** Component parseJsonTree(JsonElement)
- **static** Component fromNbt(NBT)
- **static** String toJson(Component)
- String asLegacy(Component)
- Component fromJson(String)
- GsonComponentSerializer gson()
- **static** LegacyComponentSerializer getLegacySerializer()
- NBT asNbtTag(Component)
- NBT asNbtTag(Component, PacketWrapper)

### Class: com.github.retrooper.packetevents.util.adventure.NbtTagHolder
Type: Class
Implements: net.kyori.adventure.nbt.api.BinaryTagHolder

Methods:
- String string()
- Object get(Codec) throws Exception
- NBT getTag()

## Package: com.github.retrooper.packetevents.util.crypto

### Class: com.github.retrooper.packetevents.util.crypto.MessageSignData
Type: Class

Methods:
- SaltSignature getSaltSignature()
- void setSignedPreview(boolean)
- boolean isSignedPreview()
- Instant getTimestamp()

### Class: com.github.retrooper.packetevents.util.crypto.MinecraftEncryptionUtil
Type: Class

Methods:
- **static** byte[] encrypt(String, PublicKey, byte[])
- **static** byte[] encrypt(Cipher, byte[])
- **static** byte[] decryptRSA(PrivateKey, byte[])
- **static** PublicKey publicKey(byte[])
- **static** byte[] decrypt(Cipher, byte[])
- **static** byte[] decrypt(String, PrivateKey, byte[])
- **static** byte[] encryptRSA(PublicKey, byte[])

### Class: com.github.retrooper.packetevents.util.crypto.SaltSignature
Type: Class

Methods:
- void setSalt(long)
- void setSignature(byte[])
- byte[] getSignature()
- long getSalt()

### Class: com.github.retrooper.packetevents.util.crypto.SignatureData
Type: Class

Methods:
- Instant getTimestamp()
- byte[] getSignature()
- PublicKey getPublicKey()

## Package: com.github.retrooper.packetevents.util.mappings

### Class: com.github.retrooper.packetevents.util.mappings.Diff
Type: Interface

Methods:
- void applyTo(Object)

### Class: com.github.retrooper.packetevents.util.mappings.IRegistry
Type: Interface
Implements: java.util.function.BiFunction

Methods:
- ResourceLocation getRegistryKey()
- int size()
- MappedEntity apply(ClientVersion, Integer)
- Object apply(Object, Object)
- Collection getEntries()
- MappedEntity getById(ClientVersion, int)
- MappedEntity getByName(ResourceLocation)
- MappedEntity getByName(String)
- int getId(String, ClientVersion)
- int getId(MappedEntity, ClientVersion)
- MappedEntity getByNameOrThrow(ResourceLocation)
- MappedEntity getByNameOrThrow(String)
- MappedEntity getByIdOrThrow(ClientVersion, int)

### Class: com.github.retrooper.packetevents.util.mappings.IRegistryHolder
Type: Interface

Methods:
- IRegistry getRegistry(ResourceLocation)
- IRegistry getRegistry(ResourceLocation, ClientVersion)
- IRegistry getRegistryOr(IRegistry)
- IRegistry getRegistryOr(IRegistry, ClientVersion)

### Class: com.github.retrooper.packetevents.util.mappings.SynchronizedRegistriesHandler$LegacyNbtEntryDecoder
Type: Interface

Methods:
- SynchronizedRegistriesHandler$NbtEntryDecoder upgrade()
- Object decode(NBT, ClientVersion, TypesBuilderData)

### Class: com.github.retrooper.packetevents.util.mappings.SynchronizedRegistriesHandler$NbtEntryDecoder
Type: Interface

Methods:
- Object decode(NBT, PacketWrapper, TypesBuilderData)

### Class: com.github.retrooper.packetevents.util.mappings.GlobalRegistryHolder
Type: Class
Implements: com.github.retrooper.packetevents.util.mappings.IRegistryHolder

Methods:
- IRegistry getRegistry(ResourceLocation, ClientVersion)
- **static** Object getGlobalRegistryCacheKey(User, ClientVersion)

### Class: com.github.retrooper.packetevents.util.mappings.ListDiff
Type: Abstract Class
Implements: com.github.retrooper.packetevents.util.mappings.Diff

Methods:
- void applyTo(List)
- void applyTo(Object)
- int getIndex()

### Class: com.github.retrooper.packetevents.util.mappings.ListDiff$Addition
Type: Class
Extends: com.github.retrooper.packetevents.util.mappings.ListDiff

Methods:
- void applyTo(List)
- void applyTo(Object)
- List getValues()
- String toString()

### Class: com.github.retrooper.packetevents.util.mappings.ListDiff$Changed
Type: Class
Extends: com.github.retrooper.packetevents.util.mappings.ListDiff

Methods:
- void applyTo(List)
- void applyTo(Object)
- int getOldSize()
- String toString()
- List getNewValue()

### Class: com.github.retrooper.packetevents.util.mappings.ListDiff$Removal
Type: Class
Extends: com.github.retrooper.packetevents.util.mappings.ListDiff

Methods:
- void applyTo(List)
- void applyTo(Object)
- int getSize()
- String toString()

### Class: com.github.retrooper.packetevents.util.mappings.MapDiff
Type: Abstract Class
Implements: com.github.retrooper.packetevents.util.mappings.Diff

Methods:
- void applyTo(Map)
- void applyTo(Object)
- Object getKey()

### Class: com.github.retrooper.packetevents.util.mappings.MapDiff$Addition
Type: Class
Extends: com.github.retrooper.packetevents.util.mappings.MapDiff

Methods:
- void applyTo(Map)
- void applyTo(Object)
- Object getValue()
- String toString()

### Class: com.github.retrooper.packetevents.util.mappings.MapDiff$Removal
Type: Class
Extends: com.github.retrooper.packetevents.util.mappings.MapDiff

Methods:
- void applyTo(Map)
- void applyTo(Object)
- String toString()

### Class: com.github.retrooper.packetevents.util.mappings.MappingHelper
Type: Class

Methods:
- **static** void registerMapping(TypesBuilder, Map, Map, TypesBuilderData, MappedEntity)
- **static** List createDiff(SequentialNBTReader$Compound)
- **static** SequentialNBTReader$Compound decompress(String)
- **static** List createListDiff(SequentialNBTReader$Compound)
- **static** int getId(ClientVersion, TypesBuilder, TypesBuilderData)

### Class: com.github.retrooper.packetevents.util.mappings.SimpleRegistry
Type: Class
Implements: com.github.retrooper.packetevents.util.mappings.IRegistry

Methods:
- ResourceLocation getRegistryKey()
- int size()
- Collection getEntries()
- MappedEntity getById(ClientVersion, int)
- MappedEntity getByName(String)
- MappedEntity define(String, int, MappedEntity)
- MappedEntity define(ResourceLocation, int, MappedEntity)
- String toString()
- int getId(String, ClientVersion)
- int getId(MappedEntity, ClientVersion)

### Class: com.github.retrooper.packetevents.util.mappings.SimpleTypesBuilderData
Type: Class
Extends: com.github.retrooper.packetevents.util.mappings.TypesBuilderData

Methods:
- int getId(ClientVersion)

### Class: com.github.retrooper.packetevents.util.mappings.SynchronizedRegistriesHandler
Type: Class

Methods:
- **static** void handleLegacyRegistries(User, PacketWrapper, NBTCompound)
- **static** SynchronizedRegistriesHandler$RegistryEntry getRegistryEntry(ResourceLocation)
- **static** void handleRegistry(User, PacketWrapper, ResourceLocation, List)
- **static** void handleRegistry(User, PacketWrapper, ResourceLocation, List, Object)

### Class: com.github.retrooper.packetevents.util.mappings.SynchronizedRegistriesHandler$RegistryEntry
Type: Class

Methods:
- ResourceLocation getRegistryKey()
- SimpleRegistry getSyncedRegistry(Object)
- SimpleRegistry computeSyncedRegistry(Object, Supplier)
- SimpleRegistry createFromElements(List, PacketWrapper)

### Class: com.github.retrooper.packetevents.util.mappings.TypesBuilder
Type: Class

Methods:
- boolean isMappingDataLoaded()
- ClientVersion[] getReversedVersions()
- void load()
- Map getEntries()
- VersionedRegistry getRegistry()
- TypesBuilderData define(String)
- int getDataIndex(ClientVersion)
- ClientVersion[] getVersions()
- void unloadFileMappings()

### Class: com.github.retrooper.packetevents.util.mappings.TypesBuilderData
Type: Class

Methods:
- ResourceLocation getName()
- int getId(ClientVersion)
- int[] getData()

### Class: com.github.retrooper.packetevents.util.mappings.VersionedRegistry
Type: Class
Implements: com.github.retrooper.packetevents.util.mappings.IRegistry

Methods:
- void unloadMappings()
- ResourceLocation getRegistryKey()
- int size()
- Collection getEntries()
- MappedEntity getById(ClientVersion, int)
- TypesBuilder getTypesBuilder()
- MappedEntity getByName(ResourceLocation)
- MappedEntity getByName(String)
- MappedEntity define(String, Function)
- String toString()
- int getId(MappedEntity, ClientVersion)

## Package: com.github.retrooper.packetevents.util.reflection

### Class: com.github.retrooper.packetevents.util.reflection.ReflectionObjectReader
Type: Interface

Methods:
- Enum readEnumConstant(int, Class)
- int[] readIntArray(int)
- Object[] readObjectArray(int, Class)
- double[] readDoubleArray(int)
- String readString(int)
- String[] readStringArray(int)
- Object readObject(int, Class)
- short[] readShortArray(int)
- long[] readLongArray(int)
- byte[] readByteArray(int)
- long readLong(int)
- Object readAnyObject(int)
- short readShort(int)
- double readDouble(int)
- float readFloat(int)
- float[] readFloatArray(int)
- boolean readBoolean(int)
- boolean[] readBooleanArray(int)
- int readInt(int)
- byte readByte(int)

### Class: com.github.retrooper.packetevents.util.reflection.ReflectionObjectWriter
Type: Interface

Methods:
- void writeInt(int, int)
- void writeByte(int, byte)
- void writeByteArray(int, byte[])
- void writeStringArray(int, String[])
- void writeObject(int, Object)
- void writeShortArray(int, short[])
- void writeLongArray(int, long[])
- void writeBooleanArray(int, boolean[])
- void writeDoubleArray(int, double[])
- void writeFloat(int, float)
- void writeAnyObject(int, Object)
- void writeLong(int, long)
- void writeEnumConstant(int, Enum)
- void writeShort(int, short)
- void writeFloatArray(int, float[])
- void writeString(int, String)
- void writeBoolean(int, boolean)
- void writeIntArray(int, int[])
- void writeDouble(int, double)

### Class: com.github.retrooper.packetevents.util.reflection.NestedClassUtil
Type: Class

Methods:
- **static** Class getNestedClass(Class, String)
- **static** Class getNestedClass(Class, int)
- **static** Class getNestedClass(Class, Annotation, int)

### Class: com.github.retrooper.packetevents.util.reflection.Reflection
Type: Class

Methods:
- **static** Class getClassByNameWithoutException(String)
- **static** Method getMethodExact(Class, String, Class, Class[])
- **static** Field[] getFields(Class)
- **static** Field getField(Class, String)
- **static** Field getField(Class, Class, int)
- **static** Field getField(Class, Class, int, boolean)
- **static** Field getField(Class, int)
- **static** Method getMethodCheckContainsString(Class, String, Class)
- **static** Method getMethod(Class, String, Class[])
- **static** Method getMethod(Class, int, Class[])
- **static** Method getMethod(Class, Class, int, Class[])
- **static** Method getMethod(Class, String, int)
- **static** Method getMethod(Class, Class, int)
- **static** Constructor getConstructor(Class, int)
- **static** Constructor getConstructor(Class, Class[])
- **static** List getMethods(Class, String, Class)

### Class: com.github.retrooper.packetevents.util.reflection.ReflectionObject
Type: Class
Implements: com.github.retrooper.packetevents.util.reflection.ReflectionObjectReader, com.github.retrooper.packetevents.util.reflection.ReflectionObjectWriter

Methods:
- void writeStringArray(int, String[])
- Object[] readObjectArray(int, Class)
- void writeShortArray(int, short[])
- double[] readDoubleArray(int)
- void writeLongArray(int, long[])
- void writeBooleanArray(int, boolean[])
- void writeFloat(int, float)
- List readList(int)
- void writeLong(int, long)
- double readDouble(int)
- float readFloat(int)
- void writeFloatArray(int, float[])
- int readInt(int)
- void write(Class, int, Object) throws IllegalStateException
- void writeIntArray(int, int[])
- void writeDouble(int, double)
- void writeInt(int, int)
- Enum readEnumConstant(int, Class)
- void writeByte(int, byte)
- void writeByteArray(int, byte[])
- Object read(int, Class)
- int[] readIntArray(int)
- void writeObject(int, Object)
- String readString(int)
- void writeDoubleArray(int, double[])
- void writeAnyObject(int, Object)
- String[] readStringArray(int)
- Object readObject(int, Class)
- short[] readShortArray(int)
- void writeEnumConstant(int, Enum)
- long[] readLongArray(int)
- void writeList(int, List)
- byte[] readByteArray(int)
- long readLong(int)
- Object readAnyObject(int)
- short readShort(int)
- void writeShort(int, short)
- float[] readFloatArray(int)
- boolean readBoolean(int)
- boolean[] readBooleanArray(int)
- byte readByte(int)
- void writeString(int, String)
- void writeBoolean(int, boolean)

## Package: com.github.retrooper.packetevents.util.updatechecker

### Class: com.github.retrooper.packetevents.util.updatechecker.UpdateChecker
Type: Class

Methods:
- String checkLatestReleasedVersion()
- UpdateChecker$UpdateCheckerStatus checkForUpdate()
- void handleUpdateCheck(Runnable)
- void handleUpdateCheck()

### Class: com.github.retrooper.packetevents.util.updatechecker.UpdateChecker$UpdateCheckerStatus
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** UpdateChecker$UpdateCheckerStatus valueOf(String)
- **static** UpdateChecker$UpdateCheckerStatus[] values()

## Package: com.github.retrooper.packetevents.wrapper

### Class: com.github.retrooper.packetevents.wrapper.PacketWrapper$Reader
Type: Interface
Implements: java.util.function.Function

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.PacketWrapper$Writer
Type: Interface
Implements: java.util.function.BiConsumer

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.PacketTypeData
Type: Class

Methods:
- void setPacketType(PacketTypeCommon)
- void setNativePacketId(int)
- PacketTypeCommon getPacketType()
- int getNativePacketId()

### Class: com.github.retrooper.packetevents.wrapper.PacketWrapper
Type: Class

Methods:
- void writeMessageSignaturePacked(MessageSignature$Packed)
- VillagerData readVillagerData()
- MappedEntity readMappedEntity(BiFunction)
- MappedEntity readMappedEntity(IRegistry)
- AdventureSerializer getSerializers()
- byte[] readByteArrayOfSize(int)
- void writeItemStack(ItemStack)
- **static** PacketWrapper createUniversalPacketWrapper(Object)
- **static** PacketWrapper createUniversalPacketWrapper(Object, ServerVersion)
- void writeEnumSet(EnumSet, Class)
- LastSeenMessages$Entry readLastSeenMessagesEntry()
- void writeFloat(float)
- Component readComponentAsJSON()
- void writeMap(Map, PacketWrapper$Writer, PacketWrapper$Writer)
- int readContainerId()
- void setPacketId(int)
- void writeLegacyLastSeenMessagesUpdate(LastSeenMessages$LegacyUpdate)
- void writeNBT(NBTCompound)
- List readList(PacketWrapper$Reader)
- List readList(PacketWrapper$Reader, int)
- void writeKnownPack(KnownPack)
- Object readLengthPrefixed(int, PacketWrapper$Reader)
- UUID readUUID()
- Object readOptional(PacketWrapper$Reader)
- int readInt()
- void write()
- byte[] readRemainingBytes()
- GameMode readGameMode()
- void writeMedium(int)
- MappedEntity readMappedEntityOrDirect(BiFunction, PacketWrapper$Reader)
- MappedEntity readMappedEntityOrDirect(IRegistry, PacketWrapper$Reader)
- void writeComponentAsJSON(Component)
- NBT readNBTRaw()
- void writePresentItemStack(ItemStack)
- String readComponentJSON()
- ServerVersion getServerVersion()
- void writeJavaOptional(Optional, PacketWrapper$Writer)
- int getMaxMessageLength()
- **static** PacketWrapper createDummyWrapper(ClientVersion)
- void writeEither(Either, PacketWrapper$Writer, PacketWrapper$Writer)
- IRegistry replaceRegistry(IRegistry)
- ItemStack readPresentItemStack()
- EnumSet readEnumSet(Class)
- long readVarLong()
- void writeList(List, PacketWrapper$Writer)
- void writeComponent(Component)
- MessageSignature$Packed readMessageSignaturePacked()
- PublicKey readPublicKey()
- void writeUUID(UUID)
- void writeVarInt(int)
- void writeWorldBlockPosition(WorldBlockPosition)
- int[] readVarIntArray()
- void writeBoolean(boolean)
- int readVarInt()
- void resetByteBuf()
- void writeComponentJSON(String)
- void writeNullableVarInt(Integer)
- **static** IntFunction limitValue(IntFunction, int)
- MerchantOffer readMerchantOffer()
- Style readStyle()
- void writeBitSet(BitSet)
- void writeRemoteChatSession(RemoteChatSession)
- void writeLongArray(long[])
- Either readEither(PacketWrapper$Reader, PacketWrapper$Reader)
- void writeSaltSignature(SaltSignature)
- void writeDimension(Dimension)
- void writeNBTRaw(NBT)
- void writeTimestamp(Instant)
- double readDouble()
- float readFloat()
- void writeMappedEntityOrDirect(MappedEntity, PacketWrapper$Writer)
- int readVarShort()
- void copy(PacketWrapper)
- NBT readNullableNBT()
- int[] readVarIntArrayOfSize(int)
- NBTCompound readUnlimitedNBT()
- void writeInt(int)
- void writeVarIntArray(int[])
- void writeOptional(Object, PacketWrapper$Writer)
- void writeByteArray(byte[])
- void writeSignatureData(SignatureData)
- void setBuffer(Object)
- String readString()
- String readString(int)
- float readRotation()
- void writeByteArrayOfSize(byte[])
- void writeLastMessagesEntry(LastSeenMessages$Entry)
- long[] readLongArray(int)
- long[] readLongArray()
- void setClientVersion(ClientVersion)
- byte[] readByteArray(int)
- byte[] readByteArray()
- long readLong()
- **static** int getChunkZ(long)
- short readShort()
- **static** long getChunkKey(int, int)
- void writeEntityMetadata(List)
- void writeEntityMetadata(EntityMetadataProvider)
- **static** int getChunkX(long)
- byte[] readBytes(int)
- boolean readBoolean()
- void writeIdentifier(ResourceLocation, int)
- void writeIdentifier(ResourceLocation)
- void writeMappedEntity(MappedEntity)
- void writeStyle(Style)
- Map readMap(PacketWrapper$Reader, PacketWrapper$Reader)
- Map readMap(PacketWrapper$Reader, PacketWrapper$Reader, int)
- Dimension readDimension()
- LastSeenMessages$Update readLastSeenMessagesUpdate()
- void writeSignedCommandArguments(List)
- void writePublicKey(PublicKey)
- void readEvent(ProtocolPacketEvent)
- ChatType$Bound readChatTypeBoundNetwork()
- List readEntityMetadata()
- void resetBuffer()
- Object[] readArray(PacketWrapper$Reader, Class)
- void writeCollection(Collection, PacketWrapper$Writer)
- void setServerVersion(ServerVersion)
- void prepareForSend(Object, boolean, boolean)
- void prepareForSend(Object, boolean)
- void writePublicProfileKey(PublicProfileKey)
- Instant readTimestamp()
- void writeByte(int)
- void read()
- int getPacketId()
- Component readComponentAsNBT()
- void writeEnum(Enum)
- void writeContainerId(int)
- void writeMessageSignature(MessageSignature)
- IRegistryHolder getRegistryHolder()
- Vector3i readBlockPosition()
- NBT readUnlimitedNBTRaw()
- PublicProfileKey readPublicProfileKey()
- ResourceLocation readIdentifier(int)
- ResourceLocation readIdentifier()
- KnownPack readKnownPack()
- void writeNode(Node)
- void writeChatTypeBoundNetwork(ChatType$Bound)
- void writeVillagerData(VillagerData)
- PacketTypeData getPacketTypeData()
- void writeMerchantOffer(MerchantOffer)
- NBTCompound readNBT()
- LastSeenMessages$Packed readLastSeenMessagesPacked()
- List readSignedCommandArguments()
- MessageSignature readMessageSignature()
- void writeBlockPosition(Vector3i)
- LastSeenMessages readLastSeenMessages()
- void writeLastSeenMessagesUpdate(LastSeenMessages$Update)
- void writeBytes(byte[])
- int readMedium()
- void writeFilterMask(FilterMask)
- RemoteChatSession readRemoteChatSession()
- ClientVersion getClientVersion()
- void setNativePacketId(int)
- void writeShort(int)
- ItemStack readItemStackModern()
- void writeComponentAsNBT(Component)
- int getNativePacketId()
- void writeLastSeenMessages(LastSeenMessages)
- int readUnsignedShort()
- Integer readNullableVarInt()
- Object getBuffer()
- SignatureData readSignatureData()
- void writeGameMode(GameMode)
- void writeVarLong(long)
- Component readComponent()
- ItemStack readItemStack()
- void writeVarShort(int)
- void writeLong(long)
- Object readMultiVersional(VersionComparison, ServerVersion, PacketWrapper$Reader, PacketWrapper$Reader)
- void writeArray(Object[], PacketWrapper$Writer)
- void writeMultiVersional(VersionComparison, ServerVersion, Object, PacketWrapper$Writer, PacketWrapper$Writer)
- LastSeenMessages$LegacyUpdate readLegacyLastSeenMessagesUpdate()
- BitSet readBitSet()
- void writeVarIntArrayOfSize(int[])
- short readUnsignedByte()
- void writeDouble(double)
- WorldBlockPosition readWorldBlockPosition()
- void writeItemStackModern(ItemStack)
- FilterMask readFilterMask()
- void writeLastSeenMessagesPacked(LastSeenMessages$Packed)
- Enum readEnum(Class)
- Enum readEnum(Enum[])
- Optional readJavaOptional(PacketWrapper$Reader)
- void writeLengthPrefixed(Object, PacketWrapper$Writer)
- void writeRotation(float)
- Collection readCollection(IntFunction, PacketWrapper$Reader)
- Collection readCollection(IntFunction, PacketWrapper$Reader, int)
- SaltSignature readSaltSignature()
- byte readByte()
- void writeString(String)
- void writeString(String, int)
- void writeString(String, int, boolean)
- Node readNode()

## Package: com.github.retrooper.packetevents.wrapper.common.client

### Class: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonClientCustomClickAction
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- NBT getPayload()
- void read()
- void setPayload(NBT)
- void setId(ResourceLocation)
- ResourceLocation getId()
- void copy(WrapperCommonClientCustomClickAction)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonClientSettings
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setMainHand(HumanoidArm)
- int getViewDistance()
- void setChatVisibility(WrapperCommonClientSettings$ChatVisibility)
- void setChatColors(boolean)
- void setParticleStatus(WrapperCommonClientSettings$ParticleStatus)
- void setIgnoredDifficulty(byte)
- WrapperCommonClientSettings$ChatVisibility getChatVisibility()
- WrapperCommonClientSettings$ParticleStatus getParticleStatus()
- byte getIgnoredDifficulty()
- void setVisibleSkinSections(SkinSection)
- boolean isChatColors()
- void setSkinMask(byte)
- void copy(WrapperCommonClientSettings)
- void copy(PacketWrapper)
- void setSkinSectionVisible(SkinSection, boolean)
- void write()
- boolean isServerListingAllowed()
- boolean isSkinSectionVisible(SkinSection)
- void read()
- byte getSkinMask()
- void setTextFilteringEnabled(boolean)
- boolean isTextFilteringEnabled()
- HumanoidArm getMainHand()
- SkinSection getVisibleSkinSection()
- void setServerListingAllowed(boolean)
- void setViewDistance(int)
- String getLocale()
- void setLocale(String)

### Class: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonClientSettings$ChatVisibility
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperCommonClientSettings$ChatVisibility valueOf(String)
- **static** WrapperCommonClientSettings$ChatVisibility[] values()

### Class: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonClientSettings$ParticleStatus
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperCommonClientSettings$ParticleStatus valueOf(String)
- **static** WrapperCommonClientSettings$ParticleStatus[] values()

### Class: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonCookieResponse
Type: Abstract Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- byte[] getPayload()
- ResourceLocation getKey()
- void read()
- void setPayload(byte[])
- void copy(WrapperCommonCookieResponse)
- void copy(PacketWrapper)
- void write()
- void setKey(ResourceLocation)

## Package: com.github.retrooper.packetevents.wrapper.common.server

### Class: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerClearDialog
Type: Abstract Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerCustomReportDetails
Type: Abstract Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setDetails(Map)
- Map getDetails()
- void copy(WrapperCommonServerCustomReportDetails)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerPing
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setId(int)
- int getId()
- void copy(WrapperCommonServerPing)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerServerLinks
Type: Abstract Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- List getLinks()
- void read()
- void setLinks(List)
- void copy(WrapperCommonServerServerLinks)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerServerLinks$KnownType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperCommonServerServerLinks$KnownType valueOf(String)
- **static** WrapperCommonServerServerLinks$KnownType[] values()

### Class: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerServerLinks$ServerLink
Type: Class

Methods:
- String getUrl()
- **static** WrapperCommonServerServerLinks$ServerLink read(PacketWrapper)
- WrapperCommonServerServerLinks$KnownType getKnownType()
- int hashCode()
- boolean equals(Object)
- String toString()
- Component getCustomType()
- **static** void write(PacketWrapper, WrapperCommonServerServerLinks$ServerLink)

### Class: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerShowDialog
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void copy(WrapperCommonServerShowDialog)
- void copy(PacketWrapper)
- void setDialog(Dialog)
- void write()
- Dialog getDialog()

## Package: com.github.retrooper.packetevents.wrapper.configuration.client

### Class: com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientConfigurationEndAck
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientCookieResponse
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonCookieResponse

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientCustomClickAction
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonClientCustomClickAction

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientKeepAlive
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setId(long)
- long getId()
- void copy(WrapperConfigClientKeepAlive)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientPluginMessage
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- String getChannelName()
- void setChannelName(String)
- void read()
- void setData(byte[])
- void copy(WrapperConfigClientPluginMessage)
- void copy(PacketWrapper)
- void write()
- byte[] getData()

### Class: com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientPong
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setId(int)
- int getId()
- void copy(WrapperConfigClientPong)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientResourcePackStatus
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- UUID getPackId()
- void read()
- void setResult(WrapperConfigClientResourcePackStatus$Result)
- void setPackId(UUID)
- WrapperConfigClientResourcePackStatus$Result getResult()
- void copy(WrapperConfigClientResourcePackStatus)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientResourcePackStatus$Result
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperConfigClientResourcePackStatus$Result valueOf(String)
- **static** WrapperConfigClientResourcePackStatus$Result[] values()

### Class: com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientSelectKnownPacks
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- List getKnownPacks()
- void read()
- void setKnownPacks(List)
- void copy(WrapperConfigClientSelectKnownPacks)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientSettings
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonClientSettings

Methods:
- boolean isAllowServerListings()
- boolean isChatColorable()
- HumanoidArm getHand()
- void setChatColorable(boolean)
- void setAllowServerListings(boolean)
- void setHand(HumanoidArm)
- void setVisibleSkinSectionMask(byte)
- byte getVisibleSkinSectionMask()
- void setVisibility(WrapperConfigClientSettings$ChatVisibility)
- WrapperConfigClientSettings$ChatVisibility getVisibility()

### Class: com.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientSettings$ChatVisibility
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperConfigClientSettings$ChatVisibility valueOf(String)
- **static** WrapperConfigClientSettings$ChatVisibility[] values()

## Package: com.github.retrooper.packetevents.wrapper.configuration.server

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerClearDialog
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerClearDialog

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerConfigurationEnd
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerCookieRequest
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- ResourceLocation getKey()
- void read()
- void copy(WrapperConfigServerCookieRequest)
- void copy(PacketWrapper)
- void write()
- void setKey(ResourceLocation)

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerCustomReportDetails
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerCustomReportDetails

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerDisconnect
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- Component getReason()
- void setReason(Component)
- void copy(WrapperConfigServerDisconnect)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerKeepAlive
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setId(long)
- long getId()
- void copy(WrapperConfigServerKeepAlive)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerPing
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerPing

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerPluginMessage
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- String getChannelName()
- void setChannelName(String)
- void read()
- void setData(byte[])
- void copy(WrapperConfigServerPluginMessage)
- void copy(PacketWrapper)
- void write()
- byte[] getData()

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerRegistryData
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setRegistryData(NBTCompound)
- void read()
- ResourceLocation getRegistryKey()
- List getElements()
- void setElements(List)
- void copy(WrapperConfigServerRegistryData)
- void copy(PacketWrapper)
- void write()
- void setRegistryKey(ResourceLocation)
- NBTCompound getRegistryData()

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerRegistryData$RegistryElement
Type: Class

Methods:
- **static** List convertNbt(NBTList)
- int hashCode()
- boolean equals(Object)
- String toString()
- ResourceLocation getId()
- NBT getData()

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerResetChat
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerResourcePackRemove
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- UUID getPackId()
- void read()
- void setPackId(UUID)
- void copy(WrapperConfigServerResourcePackRemove)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerResourcePackSend
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- boolean isRequired()
- void setRequired(boolean)
- void setPrompt(Component)
- void read()
- String getHash()
- void setPackId(UUID)
- Component getPrompt()
- void setUrl(String)
- String getUrl()
- UUID getPackId()
- void setHash(String)
- void copy(WrapperConfigServerResourcePackSend)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerSelectKnownPacks
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- List getKnownPacks()
- void read()
- void setKnownPacks(List)
- void copy(WrapperConfigServerSelectKnownPacks)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerServerLinks
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerServerLinks

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerShowDialog
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerShowDialog

Methods:
- void read()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerStoreCookie
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- byte[] getPayload()
- ResourceLocation getKey()
- void read()
- void setPayload(byte[])
- void copy(WrapperConfigServerStoreCookie)
- void copy(PacketWrapper)
- void write()
- void setKey(ResourceLocation)

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerTransfer
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setHost(String)
- int getPort()
- void read()
- void copy(WrapperConfigServerTransfer)
- void copy(PacketWrapper)
- void setPort(int)
- void write()
- String getHost()

### Class: com.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerUpdateEnabledFeatures
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setFeatures(Set)
- void read()
- Set getFeatures()
- void copy(WrapperConfigServerUpdateEnabledFeatures)
- void copy(PacketWrapper)
- void write()

## Package: com.github.retrooper.packetevents.wrapper.handshaking.client

### Class: com.github.retrooper.packetevents.wrapper.handshaking.client.WrapperHandshakingClientHandshake
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- String getServerAddress()
- void read()
- void setNextConnectionState(ConnectionState)
- WrapperHandshakingClientHandshake$ConnectionIntention getIntention()
- void setServerPort(int)
- void setProtocolVersion(int)
- void setIntention(WrapperHandshakingClientHandshake$ConnectionIntention)
- int getProtocolVersion()
- int getServerPort()
- void setClientVersion(ClientVersion)
- ClientVersion getClientVersion()
- void copy(WrapperHandshakingClientHandshake)
- void copy(PacketWrapper)
- void write()
- ConnectionState getNextConnectionState()
- void setServerAddress(String)

### Class: com.github.retrooper.packetevents.wrapper.handshaking.client.WrapperHandshakingClientHandshake$ConnectionIntention
Type: Enum
Extends: java.lang.Enum

Methods:
- ConnectionState getTargetState()
- **static** WrapperHandshakingClientHandshake$ConnectionIntention valueOf(String)
- **static** WrapperHandshakingClientHandshake$ConnectionIntention[] values()
- int getId()
- **static** WrapperHandshakingClientHandshake$ConnectionIntention fromId(int)

## Package: com.github.retrooper.packetevents.wrapper.login.client

### Class: com.github.retrooper.packetevents.wrapper.login.client.WrapperLoginClientCookieResponse
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonCookieResponse

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.login.client.WrapperLoginClientEncryptionResponse
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Optional getSaltSignature()
- void setEncryptedVerifyToken(byte[])
- SecretKey getSecretKey(PrivateKey)
- void setEncryptedSharedSecret(byte[])
- void read()
- void setSaltSignature(SaltSignature)
- void setSharedKey(SecretKey, PublicKey)
- byte[] getEncryptedSharedSecret()
- void copy(WrapperLoginClientEncryptionResponse)
- void copy(PacketWrapper)
- void write()
- Optional getEncryptedVerifyToken()

### Class: com.github.retrooper.packetevents.wrapper.login.client.WrapperLoginClientLoginStart
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setUsername(String)
- void setSignatureData(SignatureData)
- void copy(WrapperLoginClientLoginStart)
- void copy(PacketWrapper)
- void write()
- Optional getPlayerUUID()
- Optional getSignatureData()
- void setPlayerUUID(UUID)
- String getUsername()

### Class: com.github.retrooper.packetevents.wrapper.login.client.WrapperLoginClientLoginSuccessAck
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.login.client.WrapperLoginClientPluginResponse
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- boolean isSuccessful()
- int getMessageId()
- void setData(byte[])
- void setSuccessful(boolean)
- void copy(WrapperLoginClientPluginResponse)
- void copy(PacketWrapper)
- void setMessageId(int)
- void write()
- byte[] getData()

## Package: com.github.retrooper.packetevents.wrapper.login.server

### Class: com.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerCookieRequest
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- ResourceLocation getKey()
- void read()
- void copy(WrapperLoginServerCookieRequest)
- void copy(PacketWrapper)
- void write()
- void setKey(ResourceLocation)

### Class: com.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerDisconnect
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- Component getReason()
- void setReason(Component)
- void copy(WrapperLoginServerDisconnect)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerEncryptionRequest
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setVerifyToken(byte[])
- void read()
- void setServerId(String)
- void setPublicKey(PublicKey)
- PublicKey getPublicKey()
- void setShouldAuthenticate(boolean)
- byte[] getVerifyToken()
- boolean isShouldAuthenticate()
- void setPublicKeyBytes(byte[])
- String getServerId()
- void copy(WrapperLoginServerEncryptionRequest)
- void copy(PacketWrapper)
- byte[] getPublicKeyBytes()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerLoginSuccess
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setUserProfile(UserProfile)
- boolean isStrictErrorHandling()
- void read()
- void setStrictErrorHandling(boolean)
- void copy(WrapperLoginServerLoginSuccess)
- void copy(PacketWrapper)
- void write()
- UserProfile getUserProfile()

### Class: com.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerPluginRequest
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- String getChannelName()
- void setChannelName(String)
- void read()
- int getMessageId()
- void setData(byte[])
- void copy(WrapperLoginServerPluginRequest)
- void copy(PacketWrapper)
- void setMessageId(int)
- void write()
- byte[] getData()

### Class: com.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerSetCompression
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setThreshold(int)
- int getThreshold()
- void copy(WrapperLoginServerSetCompression)
- void copy(PacketWrapper)
- void write()

## Package: com.github.retrooper.packetevents.wrapper.play.client

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientAdvancementTab
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setAction(WrapperPlayClientAdvancementTab$Action)
- void read()
- void setTabId(String)
- Optional getTabId()
- WrapperPlayClientAdvancementTab$Action getAction()
- void copy(WrapperPlayClientAdvancementTab)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientAdvancementTab$Action
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientAdvancementTab$Action getById(int)
- **static** WrapperPlayClientAdvancementTab$Action valueOf(String)
- **static** WrapperPlayClientAdvancementTab$Action[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientAnimation
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- InteractionHand getHand()
- void setHand(InteractionHand)
- void copy(WrapperPlayClientAnimation)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChangeGameMode
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- GameMode getGameMode()
- void setGameMode(GameMode)
- void copy(WrapperPlayClientChangeGameMode)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatAck
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setOffset(int)
- int getOffset()
- void setLastSeenMessages(LastSeenMessages$LegacyUpdate)
- LastSeenMessages$LegacyUpdate getLastSeenMessages()
- void copy(WrapperPlayClientChatAck)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatCommand
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setLegacyLastSeenMessages(LastSeenMessages$LegacyUpdate)
- void read()
- List getSignedArguments()
- String getCommand()
- void setCommand(String)
- void setSignedArguments(List)
- void setMessageSignData(MessageSignData)
- LastSeenMessages$LegacyUpdate getLegacyLastSeenMessages()
- MessageSignData getMessageSignData()
- void setLastSeenMessages(LastSeenMessages$Update)
- LastSeenMessages$Update getLastSeenMessages()
- void copy(WrapperPlayClientChatCommand)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatCommandUnsigned
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- String getCommand()
- void copy(WrapperPlayClientChatCommandUnsigned)
- void copy(PacketWrapper)
- void setCommand(String)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatMessage
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setLegacyLastSeenMessages(LastSeenMessages$LegacyUpdate)
- void read()
- LastSeenMessages$LegacyUpdate getLegacyLastSeenMessages()
- Optional getMessageSignData()
- void setLastSeenMessages(LastSeenMessages$Update)
- String getMessage()
- LastSeenMessages$Update getLastSeenMessages()
- void copy(WrapperPlayClientChatMessage)
- void copy(PacketWrapper)
- void setMessage(String)
- void write()
- void setMessageSignData(MessageSignData)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatPreview
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- int getQueryId()
- String getMessage()
- void setQueryId(int)
- void copy(WrapperPlayClientChatPreview)
- void copy(PacketWrapper)
- void setMessage(String)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatSessionUpdate
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- RemoteChatSession getChatSession()
- void copy(WrapperPlayClientChatSessionUpdate)
- void copy(PacketWrapper)
- void write()
- void setChatSession(RemoteChatSession)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChunkBatchAck
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void copy(WrapperPlayClientChunkBatchAck)
- void copy(PacketWrapper)
- void write()
- void setDesiredChunksPerTick(float)
- float getDesiredChunksPerTick()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClickWindow
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSlots(Optional)
- void setStateID(Optional)
- void setCarriedItemStack(ItemStack)
- void setActionNumber(int)
- void read()
- void setHashedSlots(Map)
- Optional getActionNumber()
- void setWindowClickType(WrapperPlayClientClickWindow$WindowClickType)
- Optional getStateId()
- void setSlot(int)
- int getButton()
- int getSlot()
- ItemStack getCarriedItemStack()
- void setCarriedHashedStack(Optional)
- WrapperPlayClientClickWindow$WindowClickType getWindowClickType()
- void setButton(int)
- void setWindowId(int)
- Map getHashedSlots()
- Optional getSlots()
- void copy(WrapperPlayClientClickWindow)
- void copy(PacketWrapper)
- Optional getCarriedHashedStack()
- void write()
- int getWindowId()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClickWindow$WindowClickType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientClickWindow$WindowClickType getById(int)
- **static** WrapperPlayClientClickWindow$WindowClickType valueOf(String)
- **static** WrapperPlayClientClickWindow$WindowClickType[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClickWindowButton
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setButtonId(int)
- void setWindowId(int)
- void copy(WrapperPlayClientClickWindowButton)
- void copy(PacketWrapper)
- int getButtonId()
- void write()
- int getWindowId()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClientStatus
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setAction(WrapperPlayClientClientStatus$Action)
- void read()
- WrapperPlayClientClientStatus$Action getAction()
- void copy(WrapperPlayClientClientStatus)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClientStatus$Action
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientClientStatus$Action getById(int)
- **static** WrapperPlayClientClientStatus$Action valueOf(String)
- **static** WrapperPlayClientClientStatus$Action[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClientTickEnd
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCloseWindow
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setWindowId(int)
- void copy(WrapperPlayClientCloseWindow)
- void copy(PacketWrapper)
- void write()
- int getWindowId()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientConfigurationAck
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCookieResponse
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonCookieResponse

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCraftRecipeRequest
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setRecipe(Object)
- void read()
- void setMakeAll(boolean)
- void setRecipeKey(ResourceLocation)
- void setRecipeId(RecipeDisplayId)
- ResourceLocation getRecipeKey()
- boolean isMakeAll()
- Object getRecipe()
- void setWindowId(int)
- void copy(WrapperPlayClientCraftRecipeRequest)
- void copy(PacketWrapper)
- void write()
- RecipeDisplayId getRecipeId()
- int getWindowId()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCreativeInventoryAction
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSlot(int)
- int getSlot()
- void read()
- void setItemStack(ItemStack)
- ItemStack getItemStack()
- void copy(WrapperPlayClientCreativeInventoryAction)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCustomClickAction
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonClientCustomClickAction

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientDebugPing
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- long getTimestamp()
- void copy(WrapperPlayClientDebugPing)
- void copy(PacketWrapper)
- void write()
- void setTimestamp(long)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientDebugSampleSubscription
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- WrapperPlayServerDebugSample$SampleType getSampleType()
- void read()
- void setSampleType(WrapperPlayServerDebugSample$SampleType)
- void copy(WrapperPlayClientDebugSampleSubscription)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientEditBook
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setPages(List)
- void read()
- void setTitle(String)
- Boolean getSigning()
- void setItemStack(ItemStack)
- void setSlot(int)
- int getSlot()
- String getTitle()
- void setSigning(Boolean)
- ItemStack getItemStack()
- List getPages()
- void copy(WrapperPlayClientEditBook)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientEntityAction
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setAction(WrapperPlayClientEntityAction$Action)
- void read()
- int getJumpBoost()
- void setEntityId(int)
- WrapperPlayClientEntityAction$Action getAction()
- int getEntityId()
- void copy(WrapperPlayClientEntityAction)
- void copy(PacketWrapper)
- void write()
- void setJumpBoost(int)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientEntityAction$Action
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientEntityAction$Action getById(ServerVersion, int)
- **static** WrapperPlayClientEntityAction$Action valueOf(String)
- **static** WrapperPlayClientEntityAction$Action[] values()
- int getId(ServerVersion)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientGenerateStructure
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setKeepJigsaws(boolean)
- Vector3i getBlockPosition()
- void read()
- void copy(WrapperPlayClientGenerateStructure)
- void copy(PacketWrapper)
- void setBlockPosition(Vector3i)
- int getLevels()
- void write()
- boolean isKeepingJigsaws()
- void setLevels(int)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientHeldItemChange
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSlot(int)
- int getSlot()
- void read()
- void copy(WrapperPlayClientHeldItemChange)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientInteractEntity
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setAction(WrapperPlayClientInteractEntity$InteractAction)
- void read()
- InteractionHand getHand()
- void setEntityId(int)
- WrapperPlayClientInteractEntity$InteractAction getAction()
- Optional getTarget()
- Optional isSneaking()
- void setSneaking(Optional)
- void setTarget(Optional)
- int getEntityId()
- void setHand(InteractionHand)
- void copy(WrapperPlayClientInteractEntity)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientInteractEntity$InteractAction
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientInteractEntity$InteractAction valueOf(String)
- **static** WrapperPlayClientInteractEntity$InteractAction[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientKeepAlive
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setId(long)
- long getId()
- void copy(WrapperPlayClientKeepAlive)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientLockDifficulty
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- boolean isLocked()
- void copy(WrapperPlayClientLockDifficulty)
- void copy(PacketWrapper)
- void write()
- void setLocked(boolean)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientNameItem
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- String getItemName()
- void read()
- void copy(WrapperPlayClientNameItem)
- void copy(PacketWrapper)
- void write()
- void setItemName(String)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPickItem
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSlot(int)
- int getSlot()
- void read()
- void copy(WrapperPlayClientPickItem)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPickItemFromBlock
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Vector3i getBlockPos()
- void read()
- void setIncludeData(boolean)
- boolean isIncludeData()
- void copy(WrapperPlayClientPickItemFromBlock)
- void copy(PacketWrapper)
- void setBlockPos(Vector3i)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPickItemFromEntity
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setEntityId(int)
- void setIncludeData(boolean)
- int getEntityId()
- boolean isIncludeData()
- void copy(WrapperPlayClientPickItemFromEntity)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerAbilities
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setCreativeMode(Optional)
- void read()
- Optional getWalkSpeed()
- void setFlightAllowed(Optional)
- void setInGodMode(Optional)
- Optional isInGodMode()
- void setFlying(boolean)
- Optional isInCreativeMode()
- Optional isFlightAllowed()
- Optional getFlySpeed()
- void copy(WrapperPlayClientPlayerAbilities)
- void copy(PacketWrapper)
- void setWalkSpeed(Optional)
- boolean isFlying()
- void setFlySpeed(Optional)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerBlockPlacement
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSequence(int)
- Vector3f getCursorPosition()
- void setInsideBlock(Optional)
- void setWorldBorderHit(Optional)
- void read()
- int getFaceId()
- InteractionHand getHand()
- void setCursorPosition(Vector3f)
- void setItemStack(Optional)
- BlockFace getFace()
- Vector3i getBlockPosition()
- Optional getInsideBlock()
- void setFace(BlockFace)
- Optional getWorldBorderHit()
- void setFaceId(int)
- Optional getItemStack()
- void setHand(InteractionHand)
- void copy(WrapperPlayClientPlayerBlockPlacement)
- void copy(PacketWrapper)
- void setBlockPosition(Vector3i)
- int getSequence()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerDigging
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSequence(int)
- void setAction(DiggingAction)
- void read()
- DiggingAction getAction()
- Vector3i getBlockPosition()
- void setBlockFace(BlockFace)
- BlockFace getBlockFace()
- void setBlockFaceId(int)
- void copy(WrapperPlayClientPlayerDigging)
- void copy(PacketWrapper)
- void setBlockPosition(Vector3i)
- int getSequence()
- int getBlockFaceId()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerFlying
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setPositionChanged(boolean)
- Location getLocation()
- void read()
- boolean hasRotationChanged()
- void setHorizontalCollision(boolean)
- void setRotationChanged(boolean)
- void setOnGround(boolean)
- boolean isHorizontalCollision()
- void setLocation(Location)
- boolean isOnGround()
- void copy(WrapperPlayClientPlayerFlying)
- void copy(PacketWrapper)
- boolean hasPositionChanged()
- **static** boolean isFlying(PacketTypeCommon)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerInput
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setForward(boolean)
- void read()
- void setLeft(boolean)
- void setBackward(boolean)
- boolean isSprint()
- boolean isForward()
- void setShift(boolean)
- boolean isRight()
- boolean isLeft()
- void setSprint(boolean)
- boolean isShift()
- void setRight(boolean)
- void copy(WrapperPlayClientPlayerInput)
- void copy(PacketWrapper)
- void setJump(boolean)
- boolean isJump()
- void write()
- boolean isBackward()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerLoaded
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerPosition
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerFlying

Methods:
- Vector3d getPosition()
- void setPosition(Vector3d)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerPositionAndRotation
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerFlying

Methods:
- float getYaw()
- float getPitch()
- Vector3d getPosition()
- void setPitch(float)
- void setPosition(Vector3d)
- void setYaw(float)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerRotation
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerFlying

Methods:
- float getYaw()
- float getPitch()
- void setPitch(float)
- void setYaw(float)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPluginMessage
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- String getChannelName()
- void setChannelName(String)
- void read()
- void setData(byte[])
- void copy(WrapperPlayClientPluginMessage)
- void copy(PacketWrapper)
- void write()
- byte[] getData()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPong
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setId(int)
- int getId()
- void copy(WrapperPlayClientPong)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientQueryBlockNBT
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Vector3i getBlockPosition()
- void read()
- int getTransactionId()
- void setTransactionId(int)
- void copy(WrapperPlayClientQueryBlockNBT)
- void copy(PacketWrapper)
- void setBlockPosition(Vector3i)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientQueryEntityNBT
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- int getTransactionId()
- void setEntityId(int)
- int getEntityId()
- void setTransactionId(int)
- void copy(WrapperPlayClientQueryEntityNBT)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientResourcePackStatus
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- UUID getPackId()
- void read()
- String getHash()
- void setResult(WrapperPlayClientResourcePackStatus$Result)
- void setPackId(UUID)
- WrapperPlayClientResourcePackStatus$Result getResult()
- void setHash(String)
- void copy(WrapperPlayClientResourcePackStatus)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientResourcePackStatus$Result
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientResourcePackStatus$Result valueOf(String)
- **static** WrapperPlayClientResourcePackStatus$Result[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSelectBundleItem
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setSelectedItemIndex(int)
- void setSlotId(int)
- int getSlotId()
- void copy(WrapperPlayClientSelectBundleItem)
- void copy(PacketWrapper)
- void write()
- int getSelectedItemIndex()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSelectTrade
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSlot(int)
- int getSlot()
- void read()
- void copy(WrapperPlayClientSelectTrade)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetBeaconEffect
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSecondaryEffect(int)
- int getSecondaryEffect()
- void read()
- void setPrimaryEffect(int)
- void copy(WrapperPlayClientSetBeaconEffect)
- void copy(PacketWrapper)
- void write()
- int getPrimaryEffect()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetDifficulty
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void copy(WrapperPlayClientSetDifficulty)
- void copy(PacketWrapper)
- void setDifficulty(Difficulty)
- Difficulty getDifficulty()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetDisplayedRecipe
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setRecipeId(RecipeDisplayId)
- void setRecipe(ResourceLocation)
- void read()
- ResourceLocation getRecipe()
- void copy(WrapperPlayClientSetDisplayedRecipe)
- void copy(PacketWrapper)
- void write()
- RecipeDisplayId getRecipeId()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetRecipeBookState
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setFilterActive(boolean)
- void read()
- void setBookOpen(boolean)
- void setBookType(BookType)
- boolean isFilterActive()
- void copy(WrapperPlayClientSetRecipeBookState)
- void copy(PacketWrapper)
- boolean isBookOpen()
- void write()
- BookType getBookType()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetStructureBlock
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setName(String)
- boolean isShowBoundingBox()
- String getName()
- WrapperPlayClientSetStructureBlock$UpdateType getUpdateType()
- StructureRotation getRotation()
- Vector3i getOffset()
- void setMirror(StructureMirror)
- void setIgnoreEntities(boolean)
- void setPosition(Vector3i)
- boolean isStrict()
- void setSize(Vector3i)
- void setOffset(Vector3i)
- float getIntegrity()
- WrapperPlayClientSetStructureBlock$StructureMode getMode()
- void copy(WrapperPlayClientSetStructureBlock)
- void copy(PacketWrapper)
- void write()
- String getData()
- boolean isIgnoreEntities()
- StructureMirror getMirror()
- long getSeed()
- void read()
- void setUpdateType(WrapperPlayClientSetStructureBlock$UpdateType)
- void setData(String)
- void setMode(WrapperPlayClientSetStructureBlock$StructureMode)
- void setIntegrity(float)
- boolean isShowAir()
- void setStrict(boolean)
- void setRotation(StructureRotation)
- Vector3i getSize()
- Vector3i getPosition()
- void setSeed(long)
- void setShowAir(boolean)
- void setShowBoundingBox(boolean)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetStructureBlock$StructureMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientSetStructureBlock$StructureMode valueOf(String)
- **static** WrapperPlayClientSetStructureBlock$StructureMode[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetStructureBlock$UpdateType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientSetStructureBlock$UpdateType valueOf(String)
- **static** WrapperPlayClientSetStructureBlock$UpdateType[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetTestBlock
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Vector3i getPosition()
- void read()
- void setMode(WrapperPlayClientSetTestBlock$TestBlockMode)
- String getMessage()
- WrapperPlayClientSetTestBlock$TestBlockMode getMode()
- void copy(WrapperPlayClientSetTestBlock)
- void copy(PacketWrapper)
- void setMessage(String)
- void write()
- void setPosition(Vector3i)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetTestBlock$TestBlockMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientSetTestBlock$TestBlockMode valueOf(String)
- **static** WrapperPlayClientSetTestBlock$TestBlockMode[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSettings
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.client.WrapperCommonClientSettings

Methods:
- boolean isChatColorable()
- void setChatColorable(boolean)
- void setVisibleSkinSectionMask(byte)
- byte getVisibleSkinSectionMask()
- void setVisibility(WrapperPlayClientSettings$ChatVisibility)
- WrapperPlayClientSettings$ChatVisibility getVisibility()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSettings$ChatVisibility
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientSettings$ChatVisibility valueOf(String)
- **static** WrapperPlayClientSettings$ChatVisibility[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSlotStateChange
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSlot(int)
- int getSlot()
- void read()
- boolean isState()
- void setState(boolean)
- void setWindowId(int)
- void copy(WrapperPlayClientSlotStateChange)
- void copy(PacketWrapper)
- void write()
- int getWindowId()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSpectate
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- UUID getTargetUUID()
- void read()
- void setTargetUUID(UUID)
- void copy(WrapperPlayClientSpectate)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSteerBoat
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- boolean isLeftPaddleTurning()
- void read()
- boolean isRightPaddleTurning()
- void setLeftPaddleTurning(boolean)
- void setRightPaddleTurning(boolean)
- void copy(WrapperPlayClientSteerBoat)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSteerVehicle
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setForward(float)
- void read()
- boolean isUnmount()
- float getSideways()
- void setSideways(float)
- void copy(WrapperPlayClientSteerVehicle)
- void copy(PacketWrapper)
- void setJump(boolean)
- boolean isJump()
- byte getFlags()
- void write()
- void setUnmount(boolean)
- void setFlags(byte)
- float getForward()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientTabComplete
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Optional getBlockPosition()
- boolean isAssumeCommand()
- void setAssumeCommand(boolean)
- void read()
- Optional getTransactionId()
- String getText()
- void setTransactionId(Integer)
- void copy(WrapperPlayClientTabComplete)
- void copy(PacketWrapper)
- void setBlockPosition(Vector3i)
- void write()
- void setText(String)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientTeleportConfirm
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- int getTeleportId()
- void read()
- void setTeleportId(int)
- void copy(WrapperPlayClientTeleportConfirm)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientTestInstanceBlockAction
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setAction(WrapperPlayClientTestInstanceBlockAction$Action)
- Vector3i getPosition()
- void read()
- void setData(TestInstanceData)
- WrapperPlayClientTestInstanceBlockAction$Action getAction()
- void copy(WrapperPlayClientTestInstanceBlockAction)
- void copy(PacketWrapper)
- void write()
- TestInstanceData getData()
- void setPosition(Vector3i)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientTestInstanceBlockAction$Action
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientTestInstanceBlockAction$Action valueOf(String)
- **static** WrapperPlayClientTestInstanceBlockAction$Action[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientUpdateCommandBlock
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- String getCommand()
- void setMode(WrapperPlayClientUpdateCommandBlock$CommandBlockMode)
- void setAutomatic(boolean)
- boolean isConditional()
- void setCommand(String)
- void setPosition(Vector3i)
- Vector3i getPosition()
- void setDoesTrackOutput(boolean)
- void setConditional(boolean)
- WrapperPlayClientUpdateCommandBlock$CommandBlockMode getMode()
- void copy(WrapperPlayClientUpdateCommandBlock)
- void copy(PacketWrapper)
- short getFlags()
- void write()
- void setFlags(short)
- boolean isAutomatic()
- boolean isDoesTrackOutput()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientUpdateCommandBlock$CommandBlockMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayClientUpdateCommandBlock$CommandBlockMode getById(int)
- **static** WrapperPlayClientUpdateCommandBlock$CommandBlockMode valueOf(String)
- **static** WrapperPlayClientUpdateCommandBlock$CommandBlockMode[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientUpdateCommandBlockMinecart
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- String getCommand()
- void setEntityId(int)
- int getEntityId()
- void copy(WrapperPlayClientUpdateCommandBlockMinecart)
- void copy(PacketWrapper)
- void setCommand(String)
- void write()
- void setTrackOutput(boolean)
- boolean isTrackOutput()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientUpdateJigsawBlock
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setName(ResourceLocation)
- int getSelectionPriority()
- ResourceLocation getName()
- void read()
- void setJointType(JointType)
- int getPlacementPriority()
- void setPosition(Vector3i)
- void setPool(ResourceLocation)
- Optional getTarget()
- Vector3i getPosition()
- ResourceLocation getPool()
- void setPlacementPriority(int)
- void setFinalState(String)
- String getFinalState()
- void setTarget(ResourceLocation)
- void copy(WrapperPlayClientUpdateJigsawBlock)
- void copy(PacketWrapper)
- Optional getJointType()
- void write()
- void setSelectionPriority(int)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientUpdateSign
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Vector3i getBlockPosition()
- void read()
- boolean isFrontText()
- void setTextLines(String[])
- String[] getTextLines()
- void setFrontText(boolean)
- void copy(WrapperPlayClientUpdateSign)
- void copy(PacketWrapper)
- void setBlockPosition(Vector3i)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientUseItem
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSequence(int)
- float getYaw()
- float getPitch()
- void read()
- InteractionHand getHand()
- void setPitch(float)
- void setHand(InteractionHand)
- void copy(WrapperPlayClientUseItem)
- void copy(PacketWrapper)
- int getSequence()
- void write()
- void setYaw(float)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientVehicleMove
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- float getYaw()
- float getPitch()
- Vector3d getPosition()
- void read()
- void setPitch(float)
- boolean isOnGround()
- void copy(WrapperPlayClientVehicleMove)
- void copy(PacketWrapper)
- void setOnGround(boolean)
- void write()
- void setPosition(Vector3d)
- void setYaw(float)

### Class: com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientWindowConfirmation
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- short getActionId()
- boolean isAccepted()
- void setAccepted(boolean)
- void setActionId(short)
- void setWindowId(int)
- void copy(WrapperPlayClientWindowConfirmation)
- void copy(PacketWrapper)
- void write()
- int getWindowId()

## Package: com.github.retrooper.packetevents.wrapper.play.server

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerAcknowledgeBlockChanges
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSequence(int)
- void read()
- void copy(WrapperPlayServerAcknowledgeBlockChanges)
- void copy(PacketWrapper)
- int getSequence()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerAcknowledgePlayerDigging
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setBlockId(int)
- Vector3i getBlockPosition()
- void setAction(DiggingAction)
- void read()
- int getBlockId()
- boolean isSuccessful()
- void setSuccessful(boolean)
- DiggingAction getAction()
- void copy(WrapperPlayServerAcknowledgePlayerDigging)
- void copy(PacketWrapper)
- void setBlockPosition(Vector3i)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerActionBar
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Component getActionBarText()
- void setActionBarText(Component)
- void read()
- void copy(WrapperPlayServerActionBar)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerAttachEntity
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- int getAttachedId()
- void read()
- int getHoldingId()
- void setLeash(boolean)
- void setAttachedId(int)
- boolean isLeash()
- void copy(WrapperPlayServerAttachEntity)
- void copy(PacketWrapper)
- void setHoldingId(int)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBlockAction
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- int getBlockTypeId()
- void read()
- void setBlockType(WrappedBlockState)
- int getActionId()
- void setActionId(int)
- int getActionData()
- Vector3i getBlockPosition()
- void setBlockTypeId(int)
- void copy(WrapperPlayServerBlockAction)
- void copy(PacketWrapper)
- void setActionData(int)
- void setBlockPosition(Vector3i)
- void write()
- WrappedBlockState getBlockType()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBlockBreakAnimation
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setDestroyStage(byte)
- Vector3i getBlockPosition()
- void read()
- byte getDestroyStage()
- void setEntityId(int)
- int getEntityId()
- void copy(WrapperPlayServerBlockBreakAnimation)
- void copy(PacketWrapper)
- void setBlockPosition(Vector3i)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBlockChange
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setBlockID(int)
- Vector3i getBlockPosition()
- void read()
- int getBlockId()
- void copy(WrapperPlayServerBlockChange)
- void copy(PacketWrapper)
- void setBlockState(WrappedBlockState)
- WrappedBlockState getBlockState()
- void setBlockPosition(Vector3i)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBlockEntityData
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- NBTCompound getNBT()
- Vector3i getPosition()
- void read()
- int getType()
- TileEntityType getAsTileType()
- void copy(WrapperPlayServerBlockEntityData)
- void copy(PacketWrapper)
- void setNBT(NBTCompound)
- void setType(int)
- void setType(BlockEntityType)
- void setType(TileEntityType)
- BlockEntityType getBlockEntityType()
- void write()
- void setPosition(Vector3i)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBossBar
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setAction(WrapperPlayServerBossBar$Action)
- void read()
- BossBar$Color getColor()
- void setTitle(Component)
- WrapperPlayServerBossBar$Action getAction()
- void setUUID(UUID)
- void setColor(BossBar$Color)
- Component getTitle()
- UUID getUUID()
- BossBar$Overlay getOverlay()
- void copy(WrapperPlayServerBossBar)
- void copy(PacketWrapper)
- EnumSet getFlags()
- void setOverlay(BossBar$Overlay)
- void write()
- void setFlags(EnumSet)
- float getHealth()
- void setHealth(float)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBossBar$Action
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerBossBar$Action valueOf(String)
- **static** WrapperPlayServerBossBar$Action[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBundle
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCamera
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- int getCameraId()
- void setCameraId(int)
- void copy(WrapperPlayServerCamera)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChangeGameState
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- float getValue()
- void read()
- WrapperPlayServerChangeGameState$Reason getReason()
- void setValue(float)
- void setReason(WrapperPlayServerChangeGameState$Reason)
- void copy(WrapperPlayServerChangeGameState)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChangeGameState$Reason
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerChangeGameState$Reason getById(int)
- **static** WrapperPlayServerChangeGameState$Reason valueOf(String)
- **static** WrapperPlayServerChangeGameState$Reason[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChatMessage
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- ChatMessage getMessage()
- void copy(WrapperPlayServerChatMessage)
- void copy(PacketWrapper)
- void setMessage(ChatMessage)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChatPreview
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- int getQueryId()
- Optional getMessage()
- void setQueryId(int)
- void copy(WrapperPlayServerChatPreview)
- void copy(PacketWrapper)
- void setMessage(Component)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChunkBatchBegin
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChunkBatchEnd
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setBatchSize(int)
- int getBatchSize()
- void read()
- void copy(WrapperPlayServerChunkBatchEnd)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChunkData
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setColumn(Column)
- void read()
- void setLightData(LightData)
- boolean isIgnoreOldData()
- Column getColumn()
- void copy(WrapperPlayServerChunkData)
- void copy(PacketWrapper)
- void write()
- void setIgnoreOldData(boolean)
- LightData getLightData()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChunkDataBulk
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- int[] getX()
- void read()
- int[] getZ()
- byte[][] getBiomeData()
- BaseChunk[][] getChunks()
- void copy(WrapperPlayServerChunkDataBulk)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerClearDialog
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerClearDialog

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerClearTitles
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- boolean getReset()
- void copy(WrapperPlayServerClearTitles)
- void copy(PacketWrapper)
- void setReset(boolean)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCloseWindow
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setWindowId(int)
- void copy(WrapperPlayServerCloseWindow)
- void copy(PacketWrapper)
- void write()
- int getWindowId()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCollectItem
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setCollectedEntityId(int)
- void read()
- void setPickupItemCount(int)
- int getCollectorEntityId()
- int getPickupItemCount()
- void setCollectorEntityId(int)
- void copy(WrapperPlayServerCollectItem)
- void copy(PacketWrapper)
- void write()
- int getCollectedEntityId()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCombatEvent
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setDuration(int)
- void read()
- void setEntityId(int)
- void setPlayerId(int)
- Optional getDeathMessage()
- int getPlayerId()
- int getDuration()
- int getEntityId()
- void setDeathMessage(Component)
- void copy(WrapperPlayServerCombatEvent)
- void copy(PacketWrapper)
- Combat getCombat()
- void setCombat(Combat)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerConfigurationStart
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCookieRequest
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- ResourceLocation getKey()
- void read()
- void copy(WrapperPlayServerCookieRequest)
- void copy(PacketWrapper)
- void write()
- void setKey(ResourceLocation)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCraftRecipeResponse
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setRecipe(Object)
- void read()
- void setRecipeDisplay(RecipeDisplay)
- void setRecipeKey(ResourceLocation)
- void setRecipeId(RecipeDisplayId)
- ResourceLocation getRecipeKey()
- Object getRecipe()
- RecipeDisplay getRecipeDisplay()
- void setWindowId(int)
- void copy(WrapperPlayServerCraftRecipeResponse)
- void copy(PacketWrapper)
- void write()
- RecipeDisplayId getRecipeId()
- int getWindowId()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCustomChatCompletions
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setAction(ChatCompletionAction)
- void read()
- List getEntries()
- ChatCompletionAction getAction()
- void copy(WrapperPlayServerCustomChatCompletions)
- void copy(PacketWrapper)
- void write()
- void setEntries(List)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCustomReportDetails
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerCustomReportDetails

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDamageEvent
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setEntityId(int)
- int getSourceDirectId()
- void setSourceCauseId(int)
- DamageType getSourceType()
- int getSourceCauseId()
- void setSourceDirectId(int)
- void setSourceType(DamageType)
- int getEntityId()
- void copy(WrapperPlayServerDamageEvent)
- void copy(PacketWrapper)
- void setSourcePosition(Vector3d)
- void write()
- Vector3d getSourcePosition()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDeathCombatEvent
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setEntityId(int)
- void setPlayerId(int)
- Optional getEntityId()
- void setDeathMessage(Component)
- void copy(WrapperPlayServerDeathCombatEvent)
- void copy(PacketWrapper)
- Component getDeathMessage()
- void write()
- int getPlayerId()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDebugPong
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- long getTimestamp()
- void copy(WrapperPlayServerDebugPong)
- void copy(PacketWrapper)
- void write()
- void setTimestamp(long)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDebugSample
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- WrapperPlayServerDebugSample$SampleType getSampleType()
- void read()
- void setSampleType(WrapperPlayServerDebugSample$SampleType)
- void copy(WrapperPlayServerDebugSample)
- void copy(PacketWrapper)
- void write()
- long[] getSample()
- void setSample(long[])

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDebugSample$SampleType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerDebugSample$SampleType valueOf(String)
- **static** WrapperPlayServerDebugSample$SampleType[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDeclareCommands
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setNodes(List)
- void read()
- List getNodes()
- void setRootIndex(int)
- int getRootIndex()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDeclareRecipes
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setRecipes(Recipe[])
- Map getItemSets()
- void read()
- void setStonecutterRecipes(List)
- void setItemSets(Map)
- List getStonecutterRecipes()
- void copy(WrapperPlayServerDeclareRecipes)
- void copy(PacketWrapper)
- void write()
- Recipe[] getRecipes()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDeleteChat
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setSignature(byte[])
- byte[] getSignature()
- void copy(WrapperPlayServerDeleteChat)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDestroyEntities
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- int[] getEntityIds()
- void copy(WrapperPlayServerDestroyEntities)
- void copy(PacketWrapper)
- void write()
- void setEntityIds(int[])

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDifficulty
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- boolean isLocked()
- void copy(WrapperPlayServerDifficulty)
- void copy(PacketWrapper)
- void setDifficulty(Difficulty)
- Difficulty getDifficulty()
- void write()
- void setLocked(boolean)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDisconnect
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- Component getReason()
- void setReason(Component)
- void copy(WrapperPlayServerDisconnect)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDisguisedChat
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setChatFormatting(ChatType$Bound)
- ChatType$Bound getChatFormatting()
- Component getMessage()
- void setChatType(ChatType$Bound)
- void copy(WrapperPlayServerDisguisedChat)
- void copy(PacketWrapper)
- void setMessage(Component)
- void write()
- ChatType$Bound getChatType()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDisplayScoreboard
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- int getPosition()
- void read()
- String getScoreName()
- void setScoreName(String)
- void copy(WrapperPlayServerDisplayScoreboard)
- void copy(PacketWrapper)
- void write()
- void setPosition(int)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEffect
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setGlobalEvent(boolean)
- boolean isGlobalEvent()
- Vector3i getPosition()
- void read()
- void setData(int)
- int getType()
- void copy(WrapperPlayServerEffect)
- void copy(PacketWrapper)
- void setType(int)
- void write()
- int getData()
- void setPosition(Vector3i)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEndCombatEvent
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setDuration(int)
- void read()
- int getDuration()
- void setEntityId(int)
- Optional getEntityId()
- void copy(WrapperPlayServerEndCombatEvent)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEnterCombatEvent
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void copy(WrapperPlayServerEnterCombatEvent)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityAnimation
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- WrapperPlayServerEntityAnimation$EntityAnimationType getType()
- void setEntityId(int)
- int getEntityId()
- void copy(WrapperPlayServerEntityAnimation)
- void copy(PacketWrapper)
- void setType(WrapperPlayServerEntityAnimation$EntityAnimationType)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityAnimation$EntityAnimationType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerEntityAnimation$EntityAnimationType getById(int)
- **static** WrapperPlayServerEntityAnimation$EntityAnimationType valueOf(String)
- **static** WrapperPlayServerEntityAnimation$EntityAnimationType[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityEffect
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- boolean isShowIcon()
- void setVisible(boolean)
- void setShowIcon(boolean)
- void read()
- int getEffectDurationTicks()
- NBTCompound getFactorData()
- void setPotionType(PotionType)
- PotionType getPotionType()
- void setAmbient(boolean)
- void setEntityId(int)
- boolean isAmbient()
- boolean isVisible()
- void setEffectDurationTicks(int)
- void setFactorData(NBTCompound)
- void setEffectAmplifier(int)
- int getEntityId()
- int getEffectAmplifier()
- void copy(WrapperPlayServerEntityEffect)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityEquipment
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setEquipment(List)
- void setEntityId(int)
- int getEntityId()
- void copy(WrapperPlayServerEntityEquipment)
- void copy(PacketWrapper)
- List getEquipment()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityHeadLook
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setEntityId(int)
- void setHeadYaw(float)
- int getEntityId()
- void copy(WrapperPlayServerEntityHeadLook)
- void copy(PacketWrapper)
- float getHeadYaw()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityMetadata
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- List getEntityMetadata()
- void read()
- void setEntityId(int)
- int getEntityId()
- void setEntityMetadata(List)
- void setEntityMetadata(EntityMetadataProvider)
- void copy(WrapperPlayServerEntityMetadata)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityMovement
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setEntityId(int)
- int getEntityId()
- void copy(WrapperPlayServerEntityMovement)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityPositionSync
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- EntityPositionData getValues()
- void setValues(EntityPositionData)
- void setId(int)
- boolean isOnGround()
- int getId()
- void copy(WrapperPlayServerEntityPositionSync)
- void copy(PacketWrapper)
- void setOnGround(boolean)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityRelativeMove
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- double getDeltaZ()
- void setEntityId(int)
- double getDeltaY()
- double getDeltaX()
- void setOnGround(boolean)
- void setDeltaY(double)
- void setDeltaX(double)
- void setDeltaZ(double)
- boolean isOnGround()
- int getEntityId()
- void copy(WrapperPlayServerEntityRelativeMove)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityRelativeMoveAndRotation
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- double getDeltaZ()
- void setEntityId(int)
- double getDeltaY()
- double getDeltaX()
- void setOnGround(boolean)
- void setYaw(float)
- void setDeltaY(double)
- float getYaw()
- void setDeltaX(double)
- float getPitch()
- void setDeltaZ(double)
- void setPitch(float)
- boolean isOnGround()
- int getEntityId()
- void copy(WrapperPlayServerEntityRelativeMoveAndRotation)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityRotation
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- float getYaw()
- float getPitch()
- void read()
- void setEntityId(int)
- void setPitch(float)
- boolean isOnGround()
- int getEntityId()
- void copy(WrapperPlayServerEntityRotation)
- void copy(PacketWrapper)
- void setOnGround(boolean)
- void write()
- void setYaw(float)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntitySoundEffect
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- long getSeed()
- void read()
- void setEntityId(int)
- void setVolume(float)
- void setSoundCategory(SoundCategory)
- void setSoundId(int)
- float getVolume()
- float getPitch()
- SoundCategory getSoundCategory()
- void setPitch(float)
- void setSound(Sound)
- int getEntityId()
- void copy(WrapperPlayServerEntitySoundEffect)
- void copy(PacketWrapper)
- void setSeed(long)
- int getSoundId()
- void write()
- Sound getSound()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityStatus
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setEntityId(int)
- int getEntityId()
- void copy(WrapperPlayServerEntityStatus)
- void copy(PacketWrapper)
- int getStatus()
- void write()
- void setStatus(int)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityTeleport
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setRelativeFlags(RelativeFlag)
- void read()
- RelativeFlag getRelativeFlags()
- EntityPositionData getValues()
- void setEntityId(int)
- void setOnGround(boolean)
- void setPosition(Vector3d)
- void setYaw(float)
- Vector3d getDeltaMovement()
- float getYaw()
- float getPitch()
- Vector3d getPosition()
- void setValues(EntityPositionData)
- void setPitch(float)
- boolean isOnGround()
- int getEntityId()
- void copy(WrapperPlayServerEntityTeleport)
- void copy(PacketWrapper)
- void setDeltaMovement(Vector3d)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityVelocity
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Vector3d getVelocity()
- void read()
- void setVelocity(Vector3d)
- void setEntityId(int)
- int getEntityId()
- void copy(WrapperPlayServerEntityVelocity)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerExplosion
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setExplosionSoundRange(Float)
- ResourceLocation getExplosionSoundKey()
- void setRecords(List)
- Sound getExplosionSound()
- void setPlayerMotion(Vector3f)
- Particle getParticle()
- Vector3f getPlayerMotion()
- void setKnockback(Vector3d)
- void setPosition(Vector3d)
- void setExplosionSound(Sound)
- WrapperPlayServerExplosion$BlockInteraction getBlockInteraction()
- void setStrength(float)
- List getRecords()
- Vector3d getKnockback()
- void copy(WrapperPlayServerExplosion)
- void copy(PacketWrapper)
- void write()
- void setBlockInteraction(WrapperPlayServerExplosion$BlockInteraction)
- Particle getSmallExplosionParticles()
- void setExplosionSoundKey(ResourceLocation)
- Particle getLargeExplosionParticles()
- void read()
- void setSmallExplosionParticles(Particle)
- void setParticle(Particle)
- float getStrength()
- Vector3d getPosition()
- Float getExplosionSoundRange()
- void setLargeExplosionParticles(Particle)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerExplosion$BlockInteraction
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerExplosion$BlockInteraction valueOf(String)
- **static** WrapperPlayServerExplosion$BlockInteraction[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerFacePlayer
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- Vector3d getTargetPosition()
- void setTargetPosition(Vector3d)
- void setAimUnit(WrapperPlayServerFacePlayer$EntitySection)
- WrapperPlayServerFacePlayer$TargetEntity getTargetEntity()
- void copy(WrapperPlayServerFacePlayer)
- void copy(PacketWrapper)
- void setTargetEntity(WrapperPlayServerFacePlayer$TargetEntity)
- WrapperPlayServerFacePlayer$EntitySection getAimUnit()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerFacePlayer$EntitySection
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerFacePlayer$EntitySection getById(int)
- **static** WrapperPlayServerFacePlayer$EntitySection valueOf(String)
- **static** WrapperPlayServerFacePlayer$EntitySection[] values()
- int getId()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerFacePlayer$TargetEntity
Type: Class

Methods:
- WrapperPlayServerFacePlayer$EntitySection getEntitySection()
- void setEntitySection(WrapperPlayServerFacePlayer$EntitySection)
- void setEntityId(int)
- int getEntityId()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerHeldItemChange
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSlot(int)
- int getSlot()
- void read()
- void copy(WrapperPlayServerHeldItemChange)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerHurtAnimation
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- float getYaw()
- void read()
- void setEntityId(int)
- int getEntityId()
- void copy(WrapperPlayServerHurtAnimation)
- void copy(PacketWrapper)
- void write()
- void setYaw(float)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerInitializeWorldBorder
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setOldDiameter(double)
- void setX(double)
- void read()
- void setPortalTeleportBoundary(int)
- void setZ(double)
- void setWarningBlocks(int)
- double getNewDiameter()
- int getPortalTeleportBoundary()
- void setSpeed(long)
- double getX()
- int getWarningBlocks()
- double getOldDiameter()
- double getZ()
- void setNewDiameter(double)
- void setWarningTime(int)
- long getSpeed()
- int getWarningTime()
- void copy(WrapperPlayServerInitializeWorldBorder)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerJoinGame
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- long getHashedSeed()
- void setSeaLevel(int)
- void setHardcore(boolean)
- Dimension getDimension()
- void setHashedSeed(long)
- void setReducedDebugInfo(boolean)
- void write()
- void read()
- boolean isRespawnScreenEnabled()
- void setEntityId(int)
- void setGameMode(GameMode)
- NBTCompound getDimensionCodec()
- void setFlat(boolean)
- void setDimensionCodec(NBTCompound)
- void setRespawnScreenEnabled(boolean)
- void setLimitedCrafting(boolean)
- void setPreviousGameMode(GameMode)
- GameMode getPreviousGameMode()
- Optional getPortalCooldown()
- void setMaxPlayers(int)
- void setDimensionType(DimensionType)
- DimensionTypeRef getDimensionTypeRef()
- int getViewDistance()
- GameMode getGameMode()
- void setEnforcesSecureChat(boolean)
- void setDebug(boolean)
- void setDifficulty(Difficulty)
- int getSeaLevel()
- boolean isDebug()
- int getSimulationDistance()
- void setWorldName(String)
- String getWorldName()
- WorldBlockPosition getLastDeathPosition()
- void setLastDeathPosition(WorldBlockPosition)
- void setDimension(Dimension)
- List getWorldNames()
- void setDimensionTypeRef(DimensionTypeRef)
- int getEntityId()
- void setPortalCooldown(int)
- void copy(WrapperPlayServerJoinGame)
- void copy(PacketWrapper)
- boolean isReducedDebugInfo()
- boolean isFlat()
- void setWorldNames(List)
- DimensionType getDimensionType()
- int getMaxPlayers()
- boolean isLimitedCrafting()
- void setSimulationDistance(int)
- boolean isHardcore()
- boolean isEnforcesSecureChat()
- void setViewDistance(int)
- Difficulty getDifficulty()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerKeepAlive
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setId(long)
- long getId()
- void copy(WrapperPlayServerKeepAlive)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerMapData
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setColumns(int)
- void setX(int)
- void read()
- void setDecorations(List)
- void setData(byte[])
- void setScale(byte)
- int getMapId()
- int getRows()
- void setTrackingPosition(boolean)
- void setMapId(int)
- void setZ(int)
- void setLocked(boolean)
- int getColumns()
- int getX()
- List getDecorations()
- int getZ()
- void setRows(int)
- byte getScale()
- boolean isLocked()
- boolean isTrackingPosition()
- void write()
- byte[] getData()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerMapData$MapDecoration
Type: Class

Methods:
- void setY(byte)
- byte getX()
- byte getY()
- void setX(byte)
- **static** WrapperPlayServerMapData$MapDecoration read(PacketWrapper)
- byte getDirection()
- Component getDisplayName()
- MapDecorationType getType()
- void setDisplayName(Component)
- void setDirection(byte)
- void setType(MapDecorationType)
- **static** void write(PacketWrapper, WrapperPlayServerMapData$MapDecoration)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerMerchantOffers
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setContainerId(int)
- void read()
- void setShowProgress(boolean)
- void setCanRestock(boolean)
- List getMerchantOffers()
- void setVillagerLevel(int)
- void setMerchantOffers(List)
- int getContainerId()
- void setVillagerXp(int)
- int getVillagerLevel()
- boolean isCanRestock()
- int getVillagerXp()
- void copy(WrapperPlayServerMerchantOffers)
- void copy(PacketWrapper)
- void write()
- boolean isShowProgress()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerMoveMinecart
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setEntityId(int)
- List getLerpSteps()
- int getEntityId()
- void copy(WrapperPlayServerMoveMinecart)
- void copy(PacketWrapper)
- void setLerpSteps(List)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerMoveMinecart$MinecartStep
Type: Class

Methods:
- **static** WrapperPlayServerMoveMinecart$MinecartStep read(PacketWrapper)
- float getWeight()
- void setWeight(float)
- Vector3d getMovement()
- void setPosition(Vector3d)
- void setYaw(float)
- float getYaw()
- float getPitch()
- Vector3d getPosition()
- void setMovement(Vector3d)
- int hashCode()
- boolean equals(Object)
- void setPitch(float)
- **static** void write(PacketWrapper, WrapperPlayServerMoveMinecart$MinecartStep)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerMultiBlockChange
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- boolean getTrustEdges()
- Vector3i getChunkPosition()
- void read()
- void setBlocks(WrapperPlayServerMultiBlockChange$EncodedBlock[])
- void setTrustEdges(Boolean)
- WrapperPlayServerMultiBlockChange$EncodedBlock[] getBlocks()
- void copy(WrapperPlayServerMultiBlockChange)
- void copy(PacketWrapper)
- void setChunkPosition(Vector3i)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerMultiBlockChange$EncodedBlock
Type: Class

Methods:
- void setBlockId(int)
- void setY(int)
- int getX()
- void setX(int)
- int getY()
- int getZ()
- int getBlockId()
- long toLong()
- void setBlockState(WrappedBlockState)
- WrappedBlockState getBlockState(ClientVersion)
- void setZ(int)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerNBTQueryResponse
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- int getTransactionId()
- void setTag(NBTCompound)
- void setTransactionId(int)
- void copy(WrapperPlayServerNBTQueryResponse)
- void copy(PacketWrapper)
- NBTCompound getTag()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerOpenBook
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- InteractionHand getHand()
- void setHand(InteractionHand)
- void copy(WrapperPlayServerOpenBook)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerOpenHorseWindow
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setEntityId(int)
- void setSlotCount(int)
- int getEntityId()
- void setWindowId(int)
- void copy(WrapperPlayServerOpenHorseWindow)
- void copy(PacketWrapper)
- void write()
- int getSlotCount()
- int getWindowId()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerOpenSignEditor
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Vector3i getPosition()
- void read()
- boolean isFrontText()
- void setFrontText(boolean)
- void copy(WrapperPlayServerOpenSignEditor)
- void copy(PacketWrapper)
- void write()
- void setPosition(Vector3i)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerOpenWindow
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setContainerId(int)
- void read()
- void setTitle(Component)
- String getLegacyType()
- void setType(int)
- int getContainerId()
- Component getTitle()
- void setLegacyType(String)
- boolean isUseProvidedWindowTitle()
- int getType()
- int getHorseId()
- void setLegacySlots(int)
- void setHorseId(int)
- void setUseProvidedWindowTitle(boolean)
- int getLegacySlots()
- void copy(WrapperPlayServerOpenWindow)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerParticle
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- boolean isLongDistance()
- Vector3f getOffset()
- void setParticle(Particle)
- void setLongDistance(boolean)
- boolean isAlwaysShow()
- Particle getParticle()
- void setPosition(Vector3d)
- Vector3d getPosition()
- int getParticleCount()
- void setOffset(Vector3f)
- void setAlwaysShow(boolean)
- void setParticleCount(int)
- float getMaxSpeed()
- void copy(WrapperPlayServerParticle)
- void copy(PacketWrapper)
- void write()
- void setMaxSpeed(float)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPing
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerPing

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerAbilities
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setFlightAllowed(boolean)
- void setInGodMode(boolean)
- float getFOVModifier()
- boolean isInGodMode()
- void setFOVModifier(float)
- void setInCreativeMode(boolean)
- void setFlying(boolean)
- boolean isInCreativeMode()
- boolean isFlightAllowed()
- float getFlySpeed()
- void copy(WrapperPlayServerPlayerAbilities)
- void copy(PacketWrapper)
- boolean isFlying()
- void setFlySpeed(float)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerChatHeader
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- byte[] getHash()
- Optional getPreviousSignature()
- void setSignature(byte[])
- byte[] getSignature()
- void setHash(byte[])
- void copy(WrapperPlayServerPlayerChatHeader)
- void copy(PacketWrapper)
- void setPreviousSignature(byte[])
- void write()
- UUID getPlayerUUID()
- void setPlayerUUID(UUID)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerInfo
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setAction(WrapperPlayServerPlayerInfo$Action)
- void read()
- List getPlayerDataList()
- void setPlayerDataList(List)
- WrapperPlayServerPlayerInfo$Action getAction()
- void copy(WrapperPlayServerPlayerInfo)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerInfo$Action
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerPlayerInfo$Action valueOf(String)
- **static** WrapperPlayServerPlayerInfo$Action[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerInfo$PlayerData
Type: Class

Methods:
- void setUserProfile(UserProfile)
- Component getDisplayName()
- UserProfile getUser()
- GameMode getGameMode()
- void setSignatureData(SignatureData)
- void setPing(int)
- int getPing()
- void setGameMode(GameMode)
- void setDisplayName(Component)
- void setUser(UserProfile)
- SignatureData getSignatureData()
- UserProfile getUserProfile()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerInfoRemove
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- List getProfileIds()
- void read()
- void setProfileIds(List)
- void copy(WrapperPlayServerPlayerInfoRemove)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerInfoUpdate
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- List getEntries()
- void setActions(EnumSet)
- EnumSet getActions()
- void copy(WrapperPlayServerPlayerInfoUpdate)
- void copy(PacketWrapper)
- void write()
- void setEntries(List)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerInfoUpdate$Action
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerPlayerInfoUpdate$Action valueOf(String)
- **static** WrapperPlayServerPlayerInfoUpdate$Action[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerInfoUpdate$PlayerInfo
Type: Class

Methods:
- void setGameProfile(UserProfile)
- void setListOrder(int)
- GameMode getGameMode()
- void setShowHat(boolean)
- void setListed(boolean)
- void setGameMode(GameMode)
- void setLatency(int)
- void setDisplayName(Component)
- int getLatency()
- UserProfile getGameProfile()
- UUID getProfileId()
- int getListOrder()
- boolean isListed()
- RemoteChatSession getChatSession()
- Component getDisplayName()
- boolean isShowHat()
- void setChatSession(RemoteChatSession)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerListHeaderAndFooter
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- Component getFooter()
- Component getHeaderComponent()
- void setHeaderJson(String)
- void setFooterJson(String)
- void setFooterComponent(Component)
- void setHeader(Component)
- Component getHeader()
- String getFooterJson()
- String getHeaderJson()
- void setFooter(Component)
- void setHeaderComponent(Component)
- Component getFooterComponent()
- void copy(WrapperPlayServerPlayerListHeaderAndFooter)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerPositionAndLook
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- boolean isRelativeFlag(RelativeFlag)
- void setRelativeFlags(RelativeFlag)
- void setY(double)
- void setX(double)
- void setRelative(RelativeFlag, boolean)
- void setZ(double)
- void setPosition(Vector3d)
- Vector3d getDeltaMovement()
- int getTeleportId()
- void setValues(EntityPositionData)
- void setTeleportId(int)
- void setRelativeMask(byte)
- void copy(WrapperPlayServerPlayerPositionAndLook)
- void copy(PacketWrapper)
- void setDeltaMovement(Vector3d)
- void write()
- void read()
- RelativeFlag getRelativeFlags()
- EntityPositionData getValues()
- boolean isDismountVehicle()
- void setYaw(float)
- float getYaw()
- double getX()
- float getPitch()
- double getY()
- Vector3d getPosition()
- void setDismountVehicle(boolean)
- double getZ()
- byte getRelativeMask()
- void setPitch(float)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerRotation
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- float getYaw()
- float getPitch()
- void read()
- void setPitch(float)
- void copy(WrapperPlayServerPlayerRotation)
- void copy(PacketWrapper)
- void write()
- void setYaw(float)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPluginMessage
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- String getChannelName()
- void setChannelName(String)
- void read()
- void setData(byte[])
- void copy(WrapperPlayServerPluginMessage)
- void copy(PacketWrapper)
- void write()
- byte[] getData()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerProjectilePower
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- double getPowerX()
- double getPowerZ()
- double getPowerY()
- void read()
- void setEntityId(int)
- void setPowerY(double)
- void setPowerZ(double)
- void setPower(double)
- void setPowerX(double)
- double getPower()
- int getEntityId()
- void copy(WrapperPlayServerProjectilePower)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRecipeBookAdd
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- List getEntries()
- boolean isReplace()
- void setReplace(boolean)
- void copy(WrapperPlayServerRecipeBookAdd)
- void copy(PacketWrapper)
- void write()
- void setEntries(List)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRecipeBookAdd$AddEntry
Type: Class

Methods:
- byte packFlags()
- **static** WrapperPlayServerRecipeBookAdd$AddEntry read(PacketWrapper)
- void setHighlight(boolean)
- boolean isHighlight()
- RecipeDisplayEntry getContents()
- void setNotification(boolean)
- boolean isNotification()
- void setContents(RecipeDisplayEntry)
- **static** void write(PacketWrapper, WrapperPlayServerRecipeBookAdd$AddEntry)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRecipeBookRemove
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setRecipeIds(List)
- List getRecipeIds()
- void copy(WrapperPlayServerRecipeBookRemove)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRecipeBookSettings
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSettings(RecipeBookSettings)
- void read()
- RecipeBookSettings getSettings()
- void copy(WrapperPlayServerRecipeBookSettings)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRemoveEntityEffect
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setPotionType(PotionType)
- PotionType getPotionType()
- void setEntityId(int)
- int getEntityId()
- void copy(WrapperPlayServerRemoveEntityEffect)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerResetScore
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setObjective(String)
- void read()
- String getObjective()
- void copy(WrapperPlayServerResetScore)
- void copy(PacketWrapper)
- String getTargetName()
- void setTargetName(String)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerResourcePackRemove
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- UUID getPackId()
- void read()
- void setPackId(UUID)
- void copy(WrapperPlayServerResourcePackRemove)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerResourcePackSend
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- boolean isRequired()
- void setRequired(boolean)
- void setPrompt(Component)
- void read()
- String getHash()
- void setPackId(UUID)
- Component getPrompt()
- void setUrl(String)
- String getUrl()
- UUID getPackId()
- void setHash(String)
- void copy(WrapperPlayServerResourcePackSend)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRespawn
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Optional getPortalCooldown()
- long getHashedSeed()
- boolean isWorldFlat()
- void setDimensionType(DimensionType)
- DimensionTypeRef getDimensionTypeRef()
- GameMode getGameMode()
- void setKeptData(byte)
- void setDifficulty(Difficulty)
- void setWorldFlat(boolean)
- void setWorldDebug(boolean)
- void setWorldName(String)
- Optional getWorldName()
- WorldBlockPosition getLastDeathPosition()
- void setLastDeathPosition(WorldBlockPosition)
- boolean isWorldDebug()
- void setDimension(Dimension)
- Dimension getDimension()
- void setDimensionTypeRef(DimensionTypeRef)
- void setHashedSeed(long)
- void setPortalCooldown(int)
- void copy(WrapperPlayServerRespawn)
- void copy(PacketWrapper)
- void write()
- void read()
- boolean isKeepingAllPlayerData()
- DimensionType getDimensionType()
- void setKeepingAllPlayerData(boolean)
- void setGameMode(GameMode)
- byte getKeptData()
- void setPreviousGameMode(GameMode)
- Difficulty getDifficulty()
- GameMode getPreviousGameMode()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerScoreboardObjective
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setName(String)
- void setRenderType(WrapperPlayServerScoreboardObjective$RenderType)
- String getName()
- void read()
- void setMode(WrapperPlayServerScoreboardObjective$ObjectiveMode)
- WrapperPlayServerScoreboardObjective$RenderType getRenderType()
- void setScoreFormat(ScoreFormat)
- void setDisplayName(Component)
- Component getDisplayName()
- ScoreFormat getScoreFormat()
- WrapperPlayServerScoreboardObjective$ObjectiveMode getMode()
- void copy(WrapperPlayServerScoreboardObjective)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerScoreboardObjective$ObjectiveMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerScoreboardObjective$ObjectiveMode getById(int)
- **static** WrapperPlayServerScoreboardObjective$ObjectiveMode valueOf(String)
- **static** WrapperPlayServerScoreboardObjective$ObjectiveMode[] values()
- **static** WrapperPlayServerScoreboardObjective$ObjectiveMode getByName(String)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerScoreboardObjective$RenderType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerScoreboardObjective$RenderType getById(int)
- **static** WrapperPlayServerScoreboardObjective$RenderType valueOf(String)
- **static** WrapperPlayServerScoreboardObjective$RenderType[] values()
- **static** WrapperPlayServerScoreboardObjective$RenderType getByName(String)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSelectAdvancementsTab
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setIdentifier(ResourceLocation)
- ResourceLocation getIdentifier()
- void copy(WrapperPlayServerSelectAdvancementsTab)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerServerData
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setIcon(String)
- void setEnforceSecureChat(boolean)
- void setPreviewsChat(boolean)
- void read()
- boolean isPreviewsChat()
- boolean isEnforceSecureChat()
- void setMOTD(Component)
- Component getMOTD()
- void copy(WrapperPlayServerServerData)
- void copy(PacketWrapper)
- void write()
- Optional getIcon()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerServerLinks
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerServerLinks

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetCompression
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setThreshold(int)
- int getThreshold()
- void copy(WrapperPlayServerSetCompression)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetCooldown
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- ResourceLocation getCooldownGroup()
- void read()
- int getCooldownTicks()
- void setCooldownGroup(ResourceLocation)
- ItemType getItem()
- void copy(WrapperPlayServerSetCooldown)
- void copy(PacketWrapper)
- void write()
- void setItem(ItemType)
- void setCooldownTicks(int)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetCursorItem
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setStack(ItemStack)
- void read()
- ItemStack getStack()
- void copy(WrapperPlayServerSetCursorItem)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetDisplayChatPreview
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- boolean isChatPreviewDisplay()
- void setChatPreviewDisplay(boolean)
- void read()
- void copy(WrapperPlayServerSetDisplayChatPreview)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetExperience
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- int getLevel()
- void setExperienceBar(float)
- int getTotalExperience()
- void read()
- void copy(WrapperPlayServerSetExperience)
- void copy(PacketWrapper)
- float getExperienceBar()
- void setTotalExperience(int)
- void write()
- void setLevel(int)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetPassengers
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- int[] getPassengers()
- void setEntityId(int)
- int getEntityId()
- void setPassengers(int[])
- void copy(WrapperPlayServerSetPassengers)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetPlayerInventory
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setStack(ItemStack)
- void setSlot(int)
- int getSlot()
- void read()
- ItemStack getStack()
- void copy(WrapperPlayServerSetPlayerInventory)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetSlot
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSlot(int)
- void setStateId(int)
- int getSlot()
- void read()
- ItemStack getItem()
- void setWindowId(int)
- void copy(WrapperPlayServerSetSlot)
- void copy(PacketWrapper)
- void write()
- void setItem(ItemStack)
- int getStateId()
- int getWindowId()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetTitleSubtitle
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- String getSubtitleJson()
- Component getSubtitle()
- void setSubtitleJson(String)
- void setSubtitle(Component)
- void copy(WrapperPlayServerSetTitleSubtitle)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetTitleText
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setTitleJson(String)
- Component getTitle()
- void read()
- String getTitleJson()
- void setTitle(Component)
- void copy(WrapperPlayServerSetTitleText)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetTitleTimes
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- int getFadeOutTicks()
- void setFadeOutTicks(int)
- void read()
- void setStayTicks(int)
- int getFadeInTicks()
- void copy(WrapperPlayServerSetTitleTimes)
- void copy(PacketWrapper)
- int getStayTicks()
- void write()
- void setFadeInTicks(int)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerShowDialog
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerShowDialog

No public methods found

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSoundEffect
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- long getSeed()
- void read()
- void setEffectPosition(Vector3i)
- void setVolume(float)
- void setSoundCategory(SoundCategory)
- void setSoundId(int)
- float getVolume()
- float getPitch()
- Vector3i getEffectPosition()
- SoundCategory getSoundCategory()
- void setPitch(float)
- void setSound(Sound)
- void copy(WrapperPlayServerSoundEffect)
- void copy(PacketWrapper)
- void setSeed(long)
- int getSoundId()
- void write()
- Sound getSound()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnEntity
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Optional getVelocity()
- void read()
- void setData(int)
- void setEntityId(int)
- void setHeadYaw(float)
- EntityType getEntityType()
- float getHeadYaw()
- void setUUID(Optional)
- void setPosition(Vector3d)
- void setYaw(float)
- float getYaw()
- float getPitch()
- Vector3d getPosition()
- Optional getUUID()
- void setVelocity(Optional)
- void setPitch(float)
- int getEntityId()
- void copy(WrapperPlayServerSpawnEntity)
- void copy(PacketWrapper)
- void write()
- int getData()
- void setEntityType(EntityType)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnExperienceOrb
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setY(double)
- void setX(double)
- void read()
- void setEntityId(int)
- void setZ(double)
- double getX()
- double getY()
- double getZ()
- int getEntityId()
- void copy(WrapperPlayServerSpawnExperienceOrb)
- void copy(PacketWrapper)
- short getCount()
- void write()
- void setCount(short)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnLivingEntity
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setHeadPitch(float)
- void setEntityUUID(UUID)
- float getHeadPitch()
- Vector3d getVelocity()
- void read()
- void setEntityId(int)
- EntityType getEntityType()
- void setPosition(Vector3d)
- void setYaw(float)
- UUID getEntityUUID()
- List getEntityMetadata()
- float getYaw()
- float getPitch()
- Vector3d getPosition()
- void setVelocity(Vector3d)
- void setPitch(float)
- int getEntityId()
- void setEntityMetadata(List)
- void setEntityMetadata(EntityMetadataProvider)
- void copy(WrapperPlayServerSpawnLivingEntity)
- void copy(PacketWrapper)
- void write()
- void setEntityType(EntityType)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnPainting
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- Direction getDirection()
- void setEntityId(int)
- void setType(PaintingType)
- void setUUID(UUID)
- void setPosition(Vector3i)
- Vector3i getPosition()
- UUID getUUID()
- Optional getType()
- int getEntityId()
- void copy(WrapperPlayServerSpawnPainting)
- void copy(PacketWrapper)
- void setDirection(Direction)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnPlayer
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setEntityId(int)
- ItemType getItem()
- void setUUID(UUID)
- void setPosition(Vector3d)
- void setYaw(float)
- List getEntityMetadata()
- float getYaw()
- float getPitch()
- Vector3d getPosition()
- UUID getUUID()
- void setPitch(float)
- int getEntityId()
- void setEntityMetadata(List)
- void setEntityMetadata(EntityMetadataProvider)
- void copy(WrapperPlayServerSpawnPlayer)
- void copy(PacketWrapper)
- void write()
- void setItem(ItemType)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnPosition
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Vector3i getPosition()
- void read()
- Optional getAngle()
- void setAngle(float)
- void copy(WrapperPlayServerSpawnPosition)
- void copy(PacketWrapper)
- void write()
- void setPosition(Vector3i)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnWeatherEntity
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setY(double)
- void setX(double)
- void read()
- void setEntityId(int)
- void setType(byte)
- void setZ(double)
- double getX()
- double getY()
- double getZ()
- byte getType()
- int getEntityId()
- void copy(WrapperPlayServerSpawnWeatherEntity)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerStatistics
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setStatistics(Map)
- Map getStatistics()
- void copy(WrapperPlayServerStatistics)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerStoreCookie
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- byte[] getPayload()
- ResourceLocation getKey()
- void read()
- void setPayload(byte[])
- void copy(WrapperPlayServerStoreCookie)
- void copy(PacketWrapper)
- void write()
- void setKey(ResourceLocation)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSystemChatMessage
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setMessageJson(String)
- boolean isOverlay()
- void read()
- ChatType getType()
- Component getMessage()
- void copy(WrapperPlayServerSystemChatMessage)
- void copy(PacketWrapper)
- void setOverlay(boolean)
- void setMessage(Component)
- void setType(ChatType)
- void write()
- String getMessageJson()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTabComplete
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setCommandRange(WrapperPlayServerTabComplete$CommandRange)
- void read()
- void setCommandMatches(List)
- Optional getCommandRange()
- Optional getTransactionId()
- List getCommandMatches()
- void setTransactionId(Integer)
- void copy(WrapperPlayServerTabComplete)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTabComplete$CommandMatch
Type: Class

Methods:
- Optional getTooltip()
- String getText()
- void setTooltip(Component)
- void setText(String)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTabComplete$CommandRange
Type: Class

Methods:
- int getBegin()
- void setBegin(int)
- int getLength()
- void setEnd(int)
- int getEnd()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTags
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setTagMap(Map)
- void read()
- Map getTagMap()
- Map getTags()
- void setTags(HashMap)
- void copy(WrapperPlayServerTags)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTags$Tag
Type: Class

Methods:
- void setName(String)
- ResourceLocation getKey()
- String getName()
- **static** WrapperPlayServerTags$Tag read(PacketWrapper)
- List getValues()
- void setValues(List)
- **static** void write(PacketWrapper, WrapperPlayServerTags$Tag)
- void setKey(ResourceLocation)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTeams
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Optional getTeamInfo()
- void setTeamName(String)
- void setPlayers(Collection)
- void read()
- void setTeamInfo(WrapperPlayServerTeams$ScoreBoardTeamInfo)
- WrapperPlayServerTeams$TeamMode getTeamMode()
- void setTeamMode(WrapperPlayServerTeams$TeamMode)
- void copy(WrapperPlayServerTeams)
- void copy(PacketWrapper)
- String getTeamName()
- Collection getPlayers()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTeams$CollisionRule
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerTeams$CollisionRule valueOf(String)
- **static** WrapperPlayServerTeams$CollisionRule[] values()
- String getId()
- **static** WrapperPlayServerTeams$CollisionRule fromID(String)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTeams$NameTagVisibility
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerTeams$NameTagVisibility valueOf(String)
- **static** WrapperPlayServerTeams$NameTagVisibility[] values()
- String getId()
- **static** WrapperPlayServerTeams$NameTagVisibility fromID(String)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTeams$OptionData
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerTeams$OptionData fromValue(byte)
- **static** WrapperPlayServerTeams$OptionData valueOf(String)
- byte getByteValue()
- **static** WrapperPlayServerTeams$OptionData[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTeams$ScoreBoardTeamInfo
Type: Class

Methods:
- Component getPrefix()
- NamedTextColor getColor()
- void setCollisionRule(WrapperPlayServerTeams$CollisionRule)
- WrapperPlayServerTeams$NameTagVisibility getTagVisibility()
- void setDisplayName(Component)
- WrapperPlayServerTeams$OptionData getOptionData()
- Component getSuffix()
- void setColor(NamedTextColor)
- void setPrefix(Component)
- Component getDisplayName()
- WrapperPlayServerTeams$CollisionRule getCollisionRule()
- void setSuffix(Component)
- void setTagVisibility(WrapperPlayServerTeams$NameTagVisibility)
- void setOptionData(WrapperPlayServerTeams$OptionData)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTeams$TeamMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerTeams$TeamMode valueOf(String)
- **static** WrapperPlayServerTeams$TeamMode[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTestInstanceBlockStatus
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Vector3i getSize()
- void setSize(Vector3i)
- void read()
- void copy(WrapperPlayServerTestInstanceBlockStatus)
- void copy(PacketWrapper)
- Component getStatus()
- void write()
- void setStatus(Component)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTickingState
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setFrozen(boolean)
- float getTickRate()
- void copy(WrapperPlayServerTickingState)
- void copy(PacketWrapper)
- boolean isFrozen()
- void setTickRate(float)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTickingStep
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- int getTickSteps()
- void copy(WrapperPlayServerTickingStep)
- void copy(PacketWrapper)
- void write()
- void setTickSteps(int)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTimeUpdate
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- long getWorldAge()
- void read()
- void setWorldAge(long)
- long getTimeOfDay()
- void setTickTime(boolean)
- void copy(WrapperPlayServerTimeUpdate)
- void copy(PacketWrapper)
- boolean isTickTime()
- void write()
- void setTimeOfDay(long)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTitle
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setAction(WrapperPlayServerTitle$TitleAction)
- void read()
- void setActionBarJson(String)
- String getSubtitleJson()
- Component getSubtitle()
- void setActionBar(Component)
- void setTitle(Component)
- WrapperPlayServerTitle$TitleAction getAction()
- int getFadeOutTicks()
- void setTitleJson(String)
- void setFadeOutTicks(int)
- Component getTitle()
- void setStayTicks(int)
- String getTitleJson()
- int getFadeInTicks()
- void setSubtitleJson(String)
- Component getActionBar()
- void setSubtitle(Component)
- void copy(WrapperPlayServerTitle)
- void copy(PacketWrapper)
- int getStayTicks()
- void write()
- void setFadeInTicks(int)
- String getActionBarJson()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTitle$TitleAction
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerTitle$TitleAction valueOf(String)
- **static** WrapperPlayServerTitle$TitleAction[] values()
- int getId()
- **static** WrapperPlayServerTitle$TitleAction fromLegacyId(int)
- int getLegacyId()
- **static** WrapperPlayServerTitle$TitleAction fromId(int)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTransfer
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setHost(String)
- int getPort()
- void read()
- void copy(WrapperPlayServerTransfer)
- void copy(PacketWrapper)
- void setPort(int)
- void write()
- String getHost()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUnloadChunk
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setChunkX(int)
- void setChunkZ(int)
- void read()
- int getChunkZ()
- int getChunkX()
- void copy(WrapperPlayServerUnloadChunk)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateAdvancements
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- List getAddedAdvancements()
- void setRemovedAdvancements(Set)
- void setAddedAdvancements(List)
- void read()
- void setProgress(Map)
- boolean isShowAdvancements()
- void setReset(boolean)
- Map getProgress()
- void setShowAdvancements(boolean)
- Set getRemovedAdvancements()
- boolean isReset()
- void copy(WrapperPlayServerUpdateAdvancements)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateAttributes
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setProperties(List)
- List getProperties()
- void setEntityId(int)
- int getEntityId()
- void copy(WrapperPlayServerUpdateAttributes)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateAttributes$Property
Type: Class

Methods:
- String getKey()
- void addModifier(WrapperPlayServerUpdateAttributes$PropertyModifier)
- void setModifiers(List)
- void setDirty()
- double getValue()
- void setAttribute(Attribute)
- Attribute getAttribute()
- double calcValue0()
- boolean removeModifierIf(Predicate)
- void setValue(double)
- List getModifiers()
- boolean removeModifier(ResourceLocation)
- boolean removeModifier(UUID)
- boolean removeModifier(ResourceLocation, UUID)
- void setKey(String)
- double calcValue()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateAttributes$PropertyModifier
Type: Class

Methods:
- void setName(ResourceLocation)
- ResourceLocation getName()
- void setNameAndUUID(ResourceLocation, UUID)
- UUID getUUID()
- **static** UUID generateSemiUniqueId(ResourceLocation)
- void setOperation(WrapperPlayServerUpdateAttributes$PropertyModifier$Operation)
- WrapperPlayServerUpdateAttributes$PropertyModifier$Operation getOperation()
- void setAmount(double)
- void setUUID(UUID)
- double getAmount()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateAttributes$PropertyModifier$Operation
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerUpdateAttributes$PropertyModifier$Operation valueOf(String)
- **static** WrapperPlayServerUpdateAttributes$PropertyModifier$Operation[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateEnabledFeatures
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setFeatures(Set)
- void read()
- Set getFeatures()
- void copy(WrapperPlayServerUpdateEnabledFeatures)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateEntityNBT
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setEntityId(int)
- NBTCompound getNBTCompound()
- int getEntityId()
- void copy(WrapperPlayServerUpdateEntityNBT)
- void copy(PacketWrapper)
- void setNBTCompound(NBTCompound)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateHealth
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- float getFoodSaturation()
- void read()
- void setFood(int)
- int getFood()
- void copy(WrapperPlayServerUpdateHealth)
- void copy(PacketWrapper)
- void write()
- float getHealth()
- void setFoodSaturation(float)
- void setHealth(float)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateLight
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- int getX()
- void setX(int)
- void read()
- int getZ()
- void setLightData(LightData)
- void copy(WrapperPlayServerUpdateLight)
- void copy(PacketWrapper)
- void setZ(int)
- void write()
- LightData getLightData()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateScore
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Component getEntityDisplayName()
- void setEntityDisplayName(Component)
- void setAction(WrapperPlayServerUpdateScore$Action)
- void read()
- WrapperPlayServerUpdateScore$Action getAction()
- void setScoreFormat(ScoreFormat)
- void setEntityName(String)
- Optional getValue()
- void setObjectiveName(String)
- String getObjectiveName()
- ScoreFormat getScoreFormat()
- void setValue(Optional)
- void copy(WrapperPlayServerUpdateScore)
- void copy(PacketWrapper)
- String getEntityName()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateScore$Action
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerUpdateScore$Action valueOf(String)
- **static** WrapperPlayServerUpdateScore$Action[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateSimulationDistance
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSimulationDistance(int)
- int getSimulationDistance()
- void read()
- void copy(WrapperPlayServerUpdateSimulationDistance)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateViewDistance
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- int getViewDistance()
- void copy(WrapperPlayServerUpdateViewDistance)
- void copy(PacketWrapper)
- void setViewDistance(int)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateViewPosition
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setChunkX(int)
- void setChunkZ(int)
- void read()
- int getChunkZ()
- int getChunkX()
- void copy(WrapperPlayServerUpdateViewPosition)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUseBed
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- Vector3i getPosition()
- void read()
- void setEntityId(int)
- int getEntityId()
- void copy(WrapperPlayServerUseBed)
- void copy(PacketWrapper)
- void write()
- void setPosition(Vector3i)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerVehicleMove
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- float getYaw()
- float getPitch()
- Vector3d getPosition()
- void read()
- void setPitch(float)
- void copy(WrapperPlayServerVehicleMove)
- void copy(PacketWrapper)
- void write()
- void setPosition(Vector3d)
- void setYaw(float)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWaypoint
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setWaypoint(TrackedWaypoint)
- void read()
- void setOperation(WrapperPlayServerWaypoint$Operation)
- WrapperPlayServerWaypoint$Operation getOperation()
- void copy(WrapperPlayServerWaypoint)
- void copy(PacketWrapper)
- TrackedWaypoint getWaypoint()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWaypoint$Operation
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerWaypoint$Operation valueOf(String)
- **static** WrapperPlayServerWaypoint$Operation[] values()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWindowConfirmation
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- short getActionId()
- boolean isAccepted()
- void setAccepted(boolean)
- void setActionId(short)
- void setWindowId(int)
- void copy(WrapperPlayServerWindowConfirmation)
- void copy(PacketWrapper)
- void write()
- int getWindowId()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWindowItems
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setStateId(int)
- Optional getCarriedItem()
- List getItems()
- void read()
- void setCarriedItem(ItemStack)
- void setItems(List)
- void setWindowId(int)
- void copy(WrapperPlayServerWindowItems)
- void copy(PacketWrapper)
- void write()
- int getStateId()
- int getWindowId()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWindowProperty
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- int getContainerId()
- int getValue()
- void setContainerId(int)
- void read()
- void setValue(int)
- void setId(int)
- int getId()
- void setWindowId(byte)
- void copy(WrapperPlayServerWindowProperty)
- void copy(PacketWrapper)
- byte getWindowIdB()
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWorldBorder
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setAction(WrapperPlayServerWorldBorder$WorldBorderAction)
- void read()
- void setCenterX(double)
- void setCenterZ(double)
- void setNewRadius(double)
- void setPortalTeleportBoundary(int)
- WrapperPlayServerWorldBorder$WorldBorderAction getAction()
- double getRadius()
- void setWarningBlocks(int)
- void setRadius(double)
- void setSpeed(long)
- int getPortalTeleportBoundary()
- int getWarningBlocks()
- void setWarningTime(int)
- long getSpeed()
- double getNewRadius()
- void setOldRadius(double)
- int getWarningTime()
- double getOldRadius()
- void copy(WrapperPlayServerWorldBorder)
- void copy(PacketWrapper)
- double getCenterZ()
- void write()
- double getCenterX()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWorldBorder$WorldBorderAction
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** WrapperPlayServerWorldBorder$WorldBorderAction valueOf(String)
- **static** WrapperPlayServerWorldBorder$WorldBorderAction[] values()
- int getId()
- **static** WrapperPlayServerWorldBorder$WorldBorderAction fromId(int)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWorldBorderCenter
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- double getX()
- void setX(double)
- void read()
- double getZ()
- void copy(WrapperPlayServerWorldBorderCenter)
- void copy(PacketWrapper)
- void setZ(double)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWorldBorderSize
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- double getDiameter()
- void setDiameter(double)
- void read()
- void copy(WrapperPlayServerWorldBorderSize)
- void copy(PacketWrapper)
- void write()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWorldBorderWarningReach
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- int getWarningBlocks()
- void copy(WrapperPlayServerWorldBorderWarningReach)
- void copy(PacketWrapper)
- void write()
- void setWarningBlocks(int)

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayWorldBorderLerpSize
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void setSpeed(long)
- void setOldDiameter(double)
- void read()
- double getOldDiameter()
- void setNewDiameter(double)
- long getSpeed()
- void copy(WrapperPlayWorldBorderLerpSize)
- void copy(PacketWrapper)
- void write()
- double getNewDiameter()

### Class: com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayWorldBorderWarningDelay
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void copy(WrapperPlayWorldBorderWarningDelay)
- void copy(PacketWrapper)
- void write()

## Package: com.github.retrooper.packetevents.wrapper.status.client

### Class: com.github.retrooper.packetevents.wrapper.status.client.WrapperStatusClientPing
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- long getTime()
- void copy(WrapperStatusClientPing)
- void copy(PacketWrapper)
- void write()
- void setTime(long)

### Class: com.github.retrooper.packetevents.wrapper.status.client.WrapperStatusClientRequest
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void copy(WrapperStatusClientRequest)
- void copy(PacketWrapper)
- void write()

## Package: com.github.retrooper.packetevents.wrapper.status.server

### Class: com.github.retrooper.packetevents.wrapper.status.server.WrapperStatusServerPong
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- long getTime()
- void copy(WrapperStatusServerPong)
- void copy(PacketWrapper)
- void write()
- void setTime(long)

### Class: com.github.retrooper.packetevents.wrapper.status.server.WrapperStatusServerResponse
Type: Class
Extends: com.github.retrooper.packetevents.wrapper.PacketWrapper

Methods:
- void read()
- void setComponentJson(String)
- void setComponent(JsonObject)
- JsonObject getComponent()
- void copy(WrapperStatusServerResponse)
- void copy(PacketWrapper)
- void write()
- String getComponentJson()

## Package: io.github.retrooper.packetevents

### Class: io.github.retrooper.packetevents.PacketEventsPlugin
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- void onLoad()
- void onEnable()
- void onDisable()

## Package: io.github.retrooper.packetevents.adventure.option

### Class: io.github.retrooper.packetevents.adventure.option.Option
Type: Interface

Methods:
- Object defaultValue()
- ValueType valueType()
- **static** Option enumOption(String, Class, Enum)
- String id()
- Class type()
- **static** Option booleanOption(String, boolean)

### Class: io.github.retrooper.packetevents.adventure.option.OptionSchema
Type: Interface

Methods:
- OptionState emptyState()
- **static** OptionSchema$Mutable childSchema(OptionSchema)
- OptionState$VersionedBuilder versionedStateBuilder()
- Set knownOptions()
- boolean has(Option)
- **static** OptionSchema$Mutable globalSchema()
- OptionState$Builder stateBuilder()
- **static** OptionSchema$Mutable emptySchema()

### Class: io.github.retrooper.packetevents.adventure.option.OptionSchema$Mutable
Type: Interface
Implements: io.github.retrooper.packetevents.adventure.option.OptionSchema

Methods:
- Option stringOption(String, String)
- Option intOption(String, int)
- OptionSchema frozenView()
- Option doubleOption(String, double)
- Option enumOption(String, Class, Enum)
- Option booleanOption(String, boolean)

### Class: io.github.retrooper.packetevents.adventure.option.OptionState
Type: Interface

Methods:
- OptionSchema schema()
- **static** OptionState$Builder optionState()
- **static** OptionState emptyOptionState()
- **static** OptionState$VersionedBuilder versionedOptionState()
- boolean has(Option)
- Object value(Option)

### Class: io.github.retrooper.packetevents.adventure.option.OptionState$Builder
Type: Interface

Methods:
- OptionState build()
- OptionState$Builder values(OptionState)
- OptionState$Builder values(ValueSource)
- OptionState$Builder value(Option, Object)

### Class: io.github.retrooper.packetevents.adventure.option.OptionState$Versioned
Type: Interface
Implements: io.github.retrooper.packetevents.adventure.option.OptionState

Methods:
- OptionState$Versioned at(int)
- Map childStates()

### Class: io.github.retrooper.packetevents.adventure.option.OptionState$VersionedBuilder
Type: Interface

Methods:
- OptionState$Versioned build()
- OptionState$VersionedBuilder version(int, Consumer)

## Package: io.github.retrooper.packetevents.adventure.option.value

### Class: io.github.retrooper.packetevents.adventure.option.value.ValueSource
Type: Interface

Methods:
- **static** ValueSource systemProperty()
- **static** ValueSource systemProperty(String)
- Object value(Option)
- **static** ValueSource environmentVariable()
- **static** ValueSource environmentVariable(String)

### Class: io.github.retrooper.packetevents.adventure.option.value.ValueType
Type: Interface

Methods:
- **static** ValueType doubleType()
- **static** ValueType booleanType()
- **static** ValueType integerType()
- **static** ValueType stringType()
- **static** ValueType enumType(Class)
- Object parse(String) throws IllegalArgumentException
- Class type()

## Package: io.github.retrooper.packetevents.adventure.serializer

### Class: io.github.retrooper.packetevents.adventure.serializer.ComponentDecoder
Type: Interface

Methods:
- Component deserializeOr(Object, Component)
- Component deserializeOrNull(Object)
- Component deserialize(Object)

### Class: io.github.retrooper.packetevents.adventure.serializer.ComponentDecoder
Type: Interface

Methods:
- Component deserializeOr(Object, Component)
- Component deserializeOrNull(Object)
- Component deserialize(Object)

### Class: io.github.retrooper.packetevents.adventure.serializer.ComponentEncoder
Type: Interface

Methods:
- Object serializeOr(Component, Object)
- Object serializeOrNull(Component)
- Object serialize(Component)

### Class: io.github.retrooper.packetevents.adventure.serializer.ComponentEncoder
Type: Interface

Methods:
- Object serializeOr(Component, Object)
- Object serializeOrNull(Component)
- Object serialize(Component)

### Class: io.github.retrooper.packetevents.adventure.serializer.ComponentSerializer
Type: Interface
Implements: io.github.retrooper.packetevents.adventure.serializer.ComponentEncoder, io.github.retrooper.packetevents.adventure.serializer.ComponentDecoder

Methods:
- Object serializeOr(Component, Object)
- Object serializeOrNull(Component)
- Object serialize(Component)
- Component deseializeOrNull(Object)
- Component deserializeOr(Object, Component)
- Component deserializeOrNull(Object)
- Component deserialize(Object)

### Class: io.github.retrooper.packetevents.adventure.serializer.ComponentSerializer
Type: Interface
Implements: io.github.retrooper.packetevents.adventure.serializer.ComponentEncoder, io.github.retrooper.packetevents.adventure.serializer.ComponentDecoder

Methods:
- Object serializeOr(Component, Object)
- Object serializeOrNull(Component)
- Object serialize(Component)
- Component deseializeOrNull(Object)
- Component deserializeOr(Object, Component)
- Component deserializeOrNull(Object)
- Component deserialize(Object)

## Package: io.github.retrooper.packetevents.adventure.serializer.commons

### Class: io.github.retrooper.packetevents.adventure.serializer.commons.ComponentTreeConstants
Type: Class

No public methods found

## Package: io.github.retrooper.packetevents.adventure.serializer.gson

### Class: io.github.retrooper.packetevents.adventure.serializer.gson.BackwardCompatUtil$ShowAchievementToComponent
Type: Interface

Methods:
- Component convert(String)

### Class: io.github.retrooper.packetevents.adventure.serializer.gson.GsonComponentSerializer
Type: Interface
Implements: io.github.retrooper.packetevents.adventure.serializer.json.JSONComponentSerializer, net.kyori.adventure.util.Buildable

Methods:
- JsonElement serializeToTree(Component)
- Component deserializeFromTree(JsonElement)
- **static** GsonComponentSerializer$Builder builder()
- Gson serializer()
- **static** GsonComponentSerializer colorDownsamplingGson()
- **static** GsonComponentSerializer gson()
- UnaryOperator populator()

### Class: io.github.retrooper.packetevents.adventure.serializer.gson.GsonComponentSerializer$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder, io.github.retrooper.packetevents.adventure.serializer.json.JSONComponentSerializer$Builder

Methods:
- GsonComponentSerializer build()
- Object build()
- JSONComponentSerializer build()
- GsonComponentSerializer$Builder emitLegacyHoverEvent()
- JSONComponentSerializer$Builder emitLegacyHoverEvent()
- GsonComponentSerializer$Builder legacyHoverEventSerializer(LegacyHoverEventSerializer)
- GsonComponentSerializer$Builder legacyHoverEventSerializer(LegacyHoverEventSerializer)
- JSONComponentSerializer$Builder legacyHoverEventSerializer(LegacyHoverEventSerializer)
- GsonComponentSerializer$Builder editOptions(Consumer)
- JSONComponentSerializer$Builder editOptions(Consumer)
- GsonComponentSerializer$Builder options(OptionState)
- JSONComponentSerializer$Builder options(OptionState)
- GsonComponentSerializer$Builder downsampleColors()
- JSONComponentSerializer$Builder downsampleColors()
- GsonComponentSerializer$Builder showAchievementToComponent(BackwardCompatUtil$ShowAchievementToComponent)

### Class: io.github.retrooper.packetevents.adventure.serializer.gson.GsonComponentSerializer$Provider
Type: Interface

Methods:
- Consumer builder()
- GsonComponentSerializer gson()
- GsonComponentSerializer gsonLegacy()

### Class: io.github.retrooper.packetevents.adventure.serializer.gson.GsonDataComponentValue
Type: Interface
Implements: net.kyori.adventure.text.event.DataComponentValue

Methods:
- **static** GsonDataComponentValue gsonDataComponentValue(JsonElement)
- JsonElement element()

### Class: io.github.retrooper.packetevents.adventure.serializer.gson.LegacyHoverEventSerializer
Type: Interface
Implements: io.github.retrooper.packetevents.adventure.serializer.json.LegacyHoverEventSerializer

No public methods found

### Class: io.github.retrooper.packetevents.adventure.serializer.gson.BackwardCompatUtil
Type: Class

Methods:
- **static** HoverEvent$ShowEntity createShowEntity(Key, UUID, Component)
- **static** HoverEvent$ShowItem createShowItem(Key, int, BinaryTagHolder)
- **static** Codec createCodec(Codec$Decoder, Codec$Encoder)

## Package: io.github.retrooper.packetevents.adventure.serializer.gson.impl

### Class: io.github.retrooper.packetevents.adventure.serializer.gson.impl.GsonDataComponentValueConverterProvider
Type: Class
Implements: net.kyori.adventure.text.event.DataComponentValueConverterRegistry$Provider

Methods:
- Iterable conversions()
- Key id()

### Class: io.github.retrooper.packetevents.adventure.serializer.gson.impl.JSONComponentSerializerProviderImpl
Type: Class
Implements: io.github.retrooper.packetevents.adventure.serializer.json.JSONComponentSerializer$Provider, net.kyori.adventure.util.Services$Fallback

Methods:
- JSONComponentSerializer instance()
- Supplier builder()
- String toString()

## Package: io.github.retrooper.packetevents.adventure.serializer.json

### Class: io.github.retrooper.packetevents.adventure.serializer.json.JSONComponentSerializer
Type: Interface
Implements: io.github.retrooper.packetevents.adventure.serializer.ComponentSerializer

Methods:
- **static** JSONComponentSerializer$Builder builder()
- **static** JSONComponentSerializer json()

### Class: io.github.retrooper.packetevents.adventure.serializer.json.JSONComponentSerializer$Builder
Type: Interface

Methods:
- JSONComponentSerializer build()
- JSONComponentSerializer$Builder emitLegacyHoverEvent()
- JSONComponentSerializer$Builder legacyHoverEventSerializer(LegacyHoverEventSerializer)
- JSONComponentSerializer$Builder editOptions(Consumer)
- JSONComponentSerializer$Builder options(OptionState)
- JSONComponentSerializer$Builder downsampleColors()

### Class: io.github.retrooper.packetevents.adventure.serializer.json.JSONComponentSerializer$Provider
Type: Interface

Methods:
- JSONComponentSerializer instance()
- Supplier builder()

### Class: io.github.retrooper.packetevents.adventure.serializer.json.LegacyHoverEventSerializer
Type: Interface

Methods:
- HoverEvent$ShowItem deserializeShowItem(Component) throws IOException
- HoverEvent$ShowEntity deserializeShowEntity(Component, Codec$Decoder) throws IOException
- Component serializeShowEntity(HoverEvent$ShowEntity, Codec$Encoder) throws IOException
- Component serializeShowItem(HoverEvent$ShowItem) throws IOException

### Class: io.github.retrooper.packetevents.adventure.serializer.json.JSONComponentConstants
Type: Class

No public methods found

### Class: io.github.retrooper.packetevents.adventure.serializer.json.JSONOptions
Type: Class

Methods:
- **static** OptionSchema schema()
- **static** OptionState$Versioned byDataVersion()
- **static** OptionState compatibility()

### Class: io.github.retrooper.packetevents.adventure.serializer.json.JSONOptions$ClickEventValueMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JSONOptions$ClickEventValueMode valueOf(String)
- **static** JSONOptions$ClickEventValueMode[] values()

### Class: io.github.retrooper.packetevents.adventure.serializer.json.JSONOptions$HoverEventValueMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JSONOptions$HoverEventValueMode valueOf(String)
- **static** JSONOptions$HoverEventValueMode[] values()

### Class: io.github.retrooper.packetevents.adventure.serializer.json.JSONOptions$ShadowColorEmitMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JSONOptions$ShadowColorEmitMode valueOf(String)
- **static** JSONOptions$ShadowColorEmitMode[] values()

### Class: io.github.retrooper.packetevents.adventure.serializer.json.JSONOptions$ShowItemHoverDataMode
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** JSONOptions$ShowItemHoverDataMode valueOf(String)
- **static** JSONOptions$ShowItemHoverDataMode[] values()

## Package: io.github.retrooper.packetevents.adventure.serializer.json.legacyimpl

### Class: io.github.retrooper.packetevents.adventure.serializer.json.legacyimpl.NBTLegacyHoverEventSerializer
Type: Interface
Implements: io.github.retrooper.packetevents.adventure.serializer.json.LegacyHoverEventSerializer

Methods:
- **static** LegacyHoverEventSerializer get()

## Package: io.github.retrooper.packetevents.adventure.serializer.legacy

### Class: io.github.retrooper.packetevents.adventure.serializer.legacy.CharacterAndFormat
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- char character()
- **static** List defaults()
- TextFormat format()
- boolean caseInsensitive()
- **static** CharacterAndFormat characterAndFormat(char, TextFormat)
- **static** CharacterAndFormat characterAndFormat(char, TextFormat, boolean)
- Stream examinableProperties()

### Class: io.github.retrooper.packetevents.adventure.serializer.legacy.LegacyComponentSerializer
Type: Interface
Implements: io.github.retrooper.packetevents.adventure.serializer.ComponentSerializer, net.kyori.adventure.util.Buildable

Methods:
- String serialize(Component)
- Object serialize(Component)
- **static** LegacyComponentSerializer legacy(char)
- **static** LegacyComponentSerializer$Builder builder()
- **static** LegacyFormat parseChar(char)
- **static** LegacyComponentSerializer legacyAmpersand()
- **static** LegacyComponentSerializer legacySection()
- TextComponent deserialize(String)
- Component deserialize(Object)

### Class: io.github.retrooper.packetevents.adventure.serializer.legacy.LegacyComponentSerializer$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- LegacyComponentSerializer$Builder flattener(ComponentFlattener)
- LegacyComponentSerializer$Builder extractUrls()
- LegacyComponentSerializer$Builder extractUrls(Pattern)
- LegacyComponentSerializer$Builder extractUrls(Style)
- LegacyComponentSerializer$Builder extractUrls(Pattern, Style)
- LegacyComponentSerializer$Builder character(char)
- LegacyComponentSerializer$Builder formats(List)
- LegacyComponentSerializer$Builder useUnusualXRepeatedCharacterHexFormat()
- LegacyComponentSerializer build()
- Object build()
- LegacyComponentSerializer$Builder hexColors()
- LegacyComponentSerializer$Builder hexCharacter(char)

### Class: io.github.retrooper.packetevents.adventure.serializer.legacy.LegacyComponentSerializer$Provider
Type: Interface

Methods:
- Consumer legacy()
- LegacyComponentSerializer legacyAmpersand()
- LegacyComponentSerializer legacySection()

### Class: io.github.retrooper.packetevents.adventure.serializer.legacy.LegacyFormat
Type: Class
Implements: net.kyori.examination.Examinable

Methods:
- TextColor color()
- int hashCode()
- boolean equals(Object)
- boolean reset()
- Stream examinableProperties()
- TextDecoration decoration()

### Class: io.github.retrooper.packetevents.adventure.serializer.legacy.Reset
Type: Enum
Extends: java.lang.Enum
Implements: net.kyori.adventure.text.format.TextFormat

Methods:
- **static** Reset valueOf(String)
- **static** Reset[] values()

## Package: io.github.retrooper.packetevents.bstats

### Class: io.github.retrooper.packetevents.bstats.MetricsBase
Type: Class

Methods:
- void shutdown()
- void addCustomChart(CustomChart)

## Package: io.github.retrooper.packetevents.bstats.bukkit

### Class: io.github.retrooper.packetevents.bstats.bukkit.Metrics
Type: Class

Methods:
- void shutdown()
- void addCustomChart(CustomChart)

## Package: io.github.retrooper.packetevents.bstats.charts

### Class: io.github.retrooper.packetevents.bstats.charts.AdvancedBarChart
Type: Class
Extends: io.github.retrooper.packetevents.bstats.charts.CustomChart

No public methods found

### Class: io.github.retrooper.packetevents.bstats.charts.AdvancedPie
Type: Class
Extends: io.github.retrooper.packetevents.bstats.charts.CustomChart

No public methods found

### Class: io.github.retrooper.packetevents.bstats.charts.CustomChart
Type: Abstract Class

Methods:
- JsonObjectBuilder$JsonObject getRequestJsonObject(BiConsumer, boolean)

### Class: io.github.retrooper.packetevents.bstats.charts.DrilldownPie
Type: Class
Extends: io.github.retrooper.packetevents.bstats.charts.CustomChart

Methods:
- JsonObjectBuilder$JsonObject getChartData() throws Exception

### Class: io.github.retrooper.packetevents.bstats.charts.MultiLineChart
Type: Class
Extends: io.github.retrooper.packetevents.bstats.charts.CustomChart

No public methods found

### Class: io.github.retrooper.packetevents.bstats.charts.SimpleBarChart
Type: Class
Extends: io.github.retrooper.packetevents.bstats.charts.CustomChart

No public methods found

### Class: io.github.retrooper.packetevents.bstats.charts.SimplePie
Type: Class
Extends: io.github.retrooper.packetevents.bstats.charts.CustomChart

No public methods found

### Class: io.github.retrooper.packetevents.bstats.charts.SingleLineChart
Type: Class
Extends: io.github.retrooper.packetevents.bstats.charts.CustomChart

No public methods found

## Package: io.github.retrooper.packetevents.bstats.config

### Class: io.github.retrooper.packetevents.bstats.config.MetricsConfig
Type: Class

Methods:
- boolean isLogResponseStatusTextEnabled()
- boolean isLogSentDataEnabled()
- boolean didExistBefore()
- boolean isEnabled()
- boolean isLogErrorsEnabled()
- String getServerUUID()

## Package: io.github.retrooper.packetevents.bstats.json

### Class: io.github.retrooper.packetevents.bstats.json.JsonObjectBuilder
Type: Class

Methods:
- JsonObjectBuilder$JsonObject build()
- JsonObjectBuilder appendNull(String)
- JsonObjectBuilder appendField(String, String)
- JsonObjectBuilder appendField(String, int)
- JsonObjectBuilder appendField(String, JsonObjectBuilder$JsonObject)
- JsonObjectBuilder appendField(String, String[])
- JsonObjectBuilder appendField(String, int[])
- JsonObjectBuilder appendField(String, JsonObjectBuilder$JsonObject[])

### Class: io.github.retrooper.packetevents.bstats.json.JsonObjectBuilder$JsonObject
Type: Class

Methods:
- String toString()

## Package: io.github.retrooper.packetevents.bukkit

### Class: io.github.retrooper.packetevents.bukkit.InternalBukkitListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onLogin(PlayerLoginEvent)
- void onJoin(PlayerJoinEvent)

### Class: io.github.retrooper.packetevents.bukkit.InternalBukkitLoginListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onLogin(PlayerLoginEvent)

### Class: io.github.retrooper.packetevents.bukkit.InternalGlobalBukkitListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onPlayerJoin(PlayerJoinEvent)

### Class: io.github.retrooper.packetevents.bukkit.InternalPaperListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onSpawnLocation(PlayerSpawnLocationEvent)
- void onJoin(PlayerJoinEvent)

## Package: io.github.retrooper.packetevents.factory.spigot

### Class: io.github.retrooper.packetevents.factory.spigot.SpigotPacketEventsBuilder
Type: Class

Methods:
- **static** PacketEventsAPI build(Plugin)
- **static** PacketEventsAPI build(Plugin, PacketEventsSettings)
- **static** void clearBuildCache()
- **static** PacketEventsAPI buildNoCache(Plugin)
- **static** PacketEventsAPI buildNoCache(Plugin, PacketEventsSettings)

## Package: io.github.retrooper.packetevents.impl.netty

### Class: io.github.retrooper.packetevents.impl.netty.BuildData
Type: Class

Methods:
- String getName()

### Class: io.github.retrooper.packetevents.impl.netty.NettyManagerImpl
Type: Class
Implements: com.github.retrooper.packetevents.netty.NettyManager

Methods:
- ByteBufOperator getByteBufOperator()
- ChannelOperator getChannelOperator()
- ByteBufAllocationOperator getByteBufAllocationOperator()

## Package: io.github.retrooper.packetevents.impl.netty.buffer

### Class: io.github.retrooper.packetevents.impl.netty.buffer.ByteBufAllocationOperatorImpl
Type: Class
Implements: com.github.retrooper.packetevents.netty.buffer.ByteBufAllocationOperator

Methods:
- Object copiedBuffer(byte[])
- Object directBuffer()
- Object directBuffer(int)
- Object emptyBuffer()
- Object wrappedBuffer(byte[])
- Object compositeBuffer()
- Object compositeBuffer(int)
- Object buffer()
- Object buffer(int)

### Class: io.github.retrooper.packetevents.impl.netty.buffer.ByteBufOperatorImpl
Type: Class
Implements: com.github.retrooper.packetevents.netty.buffer.ByteBufOperator

Methods:
- Object markReaderIndex(Object)
- int readerIndex(Object)
- Object readerIndex(Object, int)
- boolean release(Object)
- Object retain(Object)
- Object resetReaderIndex(Object)
- Object getBytes(Object, int, byte[])
- int capacity(Object)
- Object capacity(Object, int)
- int refCnt(Object)
- void writeLong(Object, long)
- byte[] array(Object)
- Object copy(Object)
- int readInt(Object)
- void writeInt(Object, int)
- boolean hasArray(Object)
- void writeMedium(Object, int)
- void writeByte(Object, int)
- Object resetWriterIndex(Object)
- int writableBytes(Object)
- int readableBytes(Object)
- Object clear(Object)
- Object readSlice(Object, int)
- Object duplicate(Object)
- short getUnsignedByte(Object, int)
- int writerIndex(Object)
- Object writerIndex(Object, int)
- Object allocateNewBuffer(Object)
- Object skipBytes(Object, int)
- long readUnsignedInt(Object)
- Object retainedDuplicate(Object)
- Object writeBytes(Object, Object)
- Object writeBytes(Object, byte[])
- Object writeBytes(Object, byte[], int, int)
- int readMedium(Object)
- long readLong(Object)
- short readShort(Object)
- Object markWriterIndex(Object)
- Object readBytes(Object, byte[], int, int)
- Object readBytes(Object, int)
- void readBytes(Object, byte[])
- String toString(Object, int, int, Charset)
- void writeShort(Object, int)
- byte readByte(Object)
- boolean isReadable(Object)

## Package: io.github.retrooper.packetevents.impl.netty.channel

### Class: io.github.retrooper.packetevents.impl.netty.channel.ChannelOperatorImpl
Type: Class
Implements: com.github.retrooper.packetevents.netty.channel.ChannelOperator

Methods:
- void runInEventLoop(Object, Runnable)
- Object pooledByteBuf(Object)
- List pipelineHandlerNames(Object)
- Object getPipelineHandler(Object, String)
- Object writeAndFlushInContext(Object, String, Object)
- Object writeAndFlush(Object, Object)
- Object fireChannelRead(Object, Object)
- boolean isOpen(Object)
- Object getPipeline(Object)
- Object flush(Object)
- Object writeInContext(Object, String, Object)
- SocketAddress localAddress(Object)
- Object fireChannelReadInContext(Object, String, Object)
- Object flushInContext(Object, String)
- Object getPipelineContext(Object, String)
- Object write(Object, Object)
- Object close(Object)
- SocketAddress remoteAddress(Object)

## Package: io.github.retrooper.packetevents.impl.netty.factory

### Class: io.github.retrooper.packetevents.impl.netty.factory.NettyPacketEventsBuilder
Type: Class

Methods:
- **static** PacketEventsAPI build(BuildData, ChannelInjector, ProtocolManager, ServerManagerAbstract, PlayerManagerAbstract)
- **static** PacketEventsAPI build(BuildData, ChannelInjector, ProtocolManager, ServerManagerAbstract, PlayerManagerAbstract, PacketEventsSettings)
- **static** void clearBuildCache()
- **static** PacketEventsAPI buildNoCache(BuildData, ChannelInjector, ProtocolManager, ServerManagerAbstract, PlayerManagerAbstract)
- **static** PacketEventsAPI buildNoCache(BuildData, ChannelInjector, ProtocolManager, ServerManagerAbstract, PlayerManagerAbstract, PacketEventsSettings)

## Package: io.github.retrooper.packetevents.impl.netty.manager.player

### Class: io.github.retrooper.packetevents.impl.netty.manager.player.PlayerManagerAbstract
Type: Abstract Class
Implements: com.github.retrooper.packetevents.manager.player.PlayerManager

Methods:
- Object getChannel(Object)
- ClientVersion getClientVersion(Object)
- User getUser(Object)
- int getPing(Object)

## Package: io.github.retrooper.packetevents.impl.netty.manager.protocol

### Class: io.github.retrooper.packetevents.impl.netty.manager.protocol.ProtocolManagerAbstract
Type: Abstract Class
Implements: com.github.retrooper.packetevents.manager.protocol.ProtocolManager

Methods:
- ClientVersion getClientVersion(Object)
- void receivePacketSilently(Object, Object)
- void sendPacket(Object, Object)
- void sendPacketSilently(Object, Object)
- ProtocolVersion getPlatformVersion()
- void writePacket(Object, Object)
- void writePacketSilently(Object, Object)
- void receivePacket(Object, Object)

## Package: io.github.retrooper.packetevents.impl.netty.manager.server

### Class: io.github.retrooper.packetevents.impl.netty.manager.server.ServerManagerAbstract
Type: Abstract Class
Implements: com.github.retrooper.packetevents.manager.server.ServerManager

Methods:
- ServerVersion getVersion()

## Package: io.github.retrooper.packetevents.injector

### Class: io.github.retrooper.packetevents.injector.SpigotChannelInjector
Type: Class
Implements: com.github.retrooper.packetevents.injector.ChannelInjector

Methods:
- boolean isPlayerSet(Object)
- boolean isServerBound()
- void updatePlayer(User, Object)
- void setPlayer(Object, Object)
- void updateUser(Object, User)
- void uninject()
- boolean isProxy()
- void inject()

## Package: io.github.retrooper.packetevents.injector.connection

### Class: io.github.retrooper.packetevents.injector.connection.PreChannelInitializer_v1_12
Type: Class
Extends: io.netty.channel.ChannelInboundHandlerAdapter

Methods:
- void exceptionCaught(ChannelHandlerContext, Throwable)
- void channelRegistered(ChannelHandlerContext)

### Class: io.github.retrooper.packetevents.injector.connection.PreChannelInitializer_v1_8
Type: Class
Extends: io.netty.channel.ChannelInitializer

No public methods found

### Class: io.github.retrooper.packetevents.injector.connection.ServerChannelHandler
Type: Class
Extends: io.netty.channel.ChannelInboundHandlerAdapter

Methods:
- void channelRead(ChannelHandlerContext, Object) throws Exception

### Class: io.github.retrooper.packetevents.injector.connection.ServerConnectionInitializer
Type: Class

Methods:
- **static** void destroyHandlers(Object)
- **static** void initChannel(Object, ConnectionState)
- **static** void relocateHandlers(Channel, PacketEventsDecoder, User)

## Package: io.github.retrooper.packetevents.injector.handlers

### Class: io.github.retrooper.packetevents.injector.handlers.PacketEventsDecoder
Type: Class
Extends: io.netty.handler.codec.MessageToMessageDecoder

Methods:
- void read(ChannelHandlerContext, ByteBuf, List) throws Exception
- void exceptionCaught(ChannelHandlerContext, Throwable) throws Exception
- void userEventTriggered(ChannelHandlerContext, Object) throws Exception
- void decode(ChannelHandlerContext, ByteBuf, List) throws Exception
- void decode(ChannelHandlerContext, Object, List) throws Exception

### Class: io.github.retrooper.packetevents.injector.handlers.PacketEventsEncoder
Type: Class
Extends: io.netty.channel.ChannelOutboundHandlerAdapter

Methods:
- void exceptionCaught(ChannelHandlerContext, Throwable) throws Exception
- void write(ChannelHandlerContext, Object, ChannelPromise) throws Exception

## Package: io.github.retrooper.packetevents.manager

### Class: io.github.retrooper.packetevents.manager.InternalBukkitPacketListener
Type: Class
Extends: com.github.retrooper.packetevents.manager.InternalPacketListener

Methods:
- void onPacketSend(PacketSendEvent)
- void onPacketReceive(PacketReceiveEvent)

## Package: io.github.retrooper.packetevents.manager.player

### Class: io.github.retrooper.packetevents.manager.player.PlayerManagerImpl
Type: Class
Implements: com.github.retrooper.packetevents.manager.player.PlayerManager

Methods:
- Object getChannel(Object)
- ClientVersion getClientVersion(Object)
- User getUser(Object)
- int getPing(Object)

## Package: io.github.retrooper.packetevents.manager.protocol

### Class: io.github.retrooper.packetevents.manager.protocol.ProtocolManagerImpl
Type: Class
Implements: com.github.retrooper.packetevents.manager.protocol.ProtocolManager

Methods:
- ClientVersion getClientVersion(Object)
- void receivePacketSilently(Object, Object)
- void sendPacket(Object, Object)
- void sendPacketSilently(Object, Object)
- ProtocolVersion getPlatformVersion()
- void writePacket(Object, Object)
- void writePacketSilently(Object, Object)
- void receivePacket(Object, Object)

## Package: io.github.retrooper.packetevents.manager.server

### Class: io.github.retrooper.packetevents.manager.server.ServerManagerImpl
Type: Class
Implements: com.github.retrooper.packetevents.manager.server.ServerManager

Methods:
- ServerVersion getVersion()
- Object getRegistryCacheKey(User, ClientVersion)

## Package: io.github.retrooper.packetevents.netty

### Class: io.github.retrooper.packetevents.netty.NettyManagerImpl
Type: Class
Implements: com.github.retrooper.packetevents.netty.NettyManager

Methods:
- ByteBufOperator getByteBufOperator()
- ChannelOperator getChannelOperator()
- ByteBufAllocationOperator getByteBufAllocationOperator()

## Package: io.github.retrooper.packetevents.netty.buffer

### Class: io.github.retrooper.packetevents.netty.buffer.ByteBufAllocationOperatorModernImpl
Type: Class
Implements: com.github.retrooper.packetevents.netty.buffer.ByteBufAllocationOperator

Methods:
- Object copiedBuffer(byte[])
- Object directBuffer()
- Object directBuffer(int)
- Object emptyBuffer()
- Object wrappedBuffer(byte[])
- Object compositeBuffer()
- Object compositeBuffer(int)
- Object buffer()
- Object buffer(int)

### Class: io.github.retrooper.packetevents.netty.buffer.ByteBufOperatorModernImpl
Type: Class
Implements: com.github.retrooper.packetevents.netty.buffer.ByteBufOperator

Methods:
- Object markReaderIndex(Object)
- int readerIndex(Object)
- Object readerIndex(Object, int)
- boolean release(Object)
- Object retain(Object)
- Object resetReaderIndex(Object)
- Object getBytes(Object, int, byte[])
- int capacity(Object)
- Object capacity(Object, int)
- int refCnt(Object)
- void writeLong(Object, long)
- byte[] array(Object)
- Object copy(Object)
- int readInt(Object)
- void writeInt(Object, int)
- boolean hasArray(Object)
- void writeMedium(Object, int)
- void writeByte(Object, int)
- Object resetWriterIndex(Object)
- int writableBytes(Object)
- int readableBytes(Object)
- Object clear(Object)
- Object readSlice(Object, int)
- Object duplicate(Object)
- short getUnsignedByte(Object, int)
- int writerIndex(Object)
- Object writerIndex(Object, int)
- Object allocateNewBuffer(Object)
- Object skipBytes(Object, int)
- long readUnsignedInt(Object)
- Object retainedDuplicate(Object)
- Object writeBytes(Object, Object)
- Object writeBytes(Object, byte[])
- Object writeBytes(Object, byte[], int, int)
- int readMedium(Object)
- long readLong(Object)
- short readShort(Object)
- Object markWriterIndex(Object)
- Object readBytes(Object, byte[], int, int)
- Object readBytes(Object, int)
- void readBytes(Object, byte[])
- String toString(Object, int, int, Charset)
- void writeShort(Object, int)
- byte readByte(Object)
- boolean isReadable(Object)

## Package: io.github.retrooper.packetevents.netty.channel

### Class: io.github.retrooper.packetevents.netty.channel.ChannelOperatorModernImpl
Type: Class
Implements: com.github.retrooper.packetevents.netty.channel.ChannelOperator

Methods:
- void runInEventLoop(Object, Runnable)
- Object pooledByteBuf(Object)
- List pipelineHandlerNames(Object)
- Object getPipelineHandler(Object, String)
- Object writeAndFlushInContext(Object, String, Object)
- Object writeAndFlush(Object, Object)
- Object fireChannelRead(Object, Object)
- boolean isOpen(Object)
- Object getPipeline(Object)
- Object flush(Object)
- Object writeInContext(Object, String, Object)
- SocketAddress localAddress(Object)
- Object fireChannelReadInContext(Object, String, Object)
- Object flushInContext(Object, String)
- Object getPipelineContext(Object, String)
- Object write(Object, Object)
- Object close(Object)
- SocketAddress remoteAddress(Object)

## Package: io.github.retrooper.packetevents.util

### Class: io.github.retrooper.packetevents.util.BukkitLogManager
Type: Class
Extends: com.github.retrooper.packetevents.util.LogManager

Methods:
- void warn(String)
- void debug(String)
- void severe(String)
- void info(String)

### Class: io.github.retrooper.packetevents.util.FoliaCompatUtil
Type: Class

Methods:
- **static** void runTask(Plugin, Consumer)
- **static** void runTaskOnInit(Plugin, Runnable)
- **static** void runTaskForEntity(Entity, Plugin, Runnable, Runnable, long)
- **static** boolean isFolia()
- **static** void runTaskTimerAsync(Plugin, Consumer, long, long)
- **static** void runTaskAsync(Plugin, Runnable)

### Class: io.github.retrooper.packetevents.util.GeyserUtil
Type: Class

Methods:
- **static** boolean isGeyserPlayer(UUID)

### Class: io.github.retrooper.packetevents.util.InjectedList
Type: Class
Implements: java.util.List

Methods:
- boolean add(Object)
- void add(int, Object)
- List subList(int, int)
- Object set(int, Object)
- List originalList()
- boolean containsAll(Collection)
- void clear()
- boolean isEmpty()
- boolean remove(Object)
- Object remove(int)
- int lastIndexOf(Object)
- boolean removeAll(Collection)
- Iterator iterator()
- boolean contains(Object)
- int size()
- boolean addAll(Collection)
- boolean addAll(int, Collection)
- Object get(int)
- Consumer pushBackAction()
- Object[] toArray()
- Object[] toArray(Object[])
- ListIterator listIterator()
- ListIterator listIterator(int)
- int indexOf(Object)
- boolean retainAll(Collection)

### Class: io.github.retrooper.packetevents.util.PlayerPingAccessorModern
Type: Class

Methods:
- **static** int getPing(Player)

### Class: io.github.retrooper.packetevents.util.SpigotConversionUtil
Type: Class

Methods:
- **static** MainHand toBukkitHand(HumanoidArm)
- **static** Location toBukkitLocation(World, Location)
- **static** ParticleType fromBukkitParticle(Enum)
- **static** ItemStack fromBukkitItemStack(ItemStack)
- **static** WrappedBlockState fromBukkitBlockData(BlockData)
- **static** GameMode fromBukkitGameMode(GameMode)
- **static** Enum toBukkitParticle(ParticleType)
- **static** Pose toBukkitPose(EntityPose)
- **static** GameMode toBukkitGameMode(GameMode)
- **static** MaterialData toBukkitMaterialData(WrappedBlockState)
- **static** DimensionType typeFromBukkitWorld(World)
- **static** Dimension fromBukkitWorld(World)
- **static** PotionEffectType toBukkitPotionEffectType(PotionType)
- **static** PotionType fromBukkitPotionEffectType(PotionEffectType)
- **static** List getEntityMetadata(Entity)
- **static** WrappedBlockState fromBukkitMaterialData(MaterialData)
- **static** EntityType toBukkitEntityType(EntityType)
- **static** ItemType fromBukkitItemMaterial(Material)
- **static** EntityType fromBukkitEntityType(EntityType)
- **static** ItemStack toBukkitItemStack(ItemStack)
- **static** BlockData toBukkitBlockData(WrappedBlockState)
- **static** Entity getEntityById(World, int)
- **static** Material toBukkitItemMaterial(ItemType)
- **static** EntityPose fromBukkitPose(Pose)
- **static** Location fromBukkitLocation(Location)

### Class: io.github.retrooper.packetevents.util.SpigotReflectionUtil
Type: Class

Methods:
- **static** int getDimensionId(Object)
- **static** ItemStack toBukkitItemStack(Object)
- **static** Object getChannel(Player)
- **static** Entity getEntityById(World, int)
- **static** Entity getEntityById(int)
- **static** NBTCompound fromMinecraftNBT(Object)
- **static** String getDimensionKey(Object)
- **static** ItemStack encodeBukkitItemStack(ItemStack)
- **static** Object getMinecraftServerInstance(Server)
- **static** Object getMobEffectListById(int)
- **static** Object convertBukkitWorldToWorldServer(World)
- **static** Object getPlayerConnection(Player)
- **static** Entity getBukkitEntity(Object)
- **static** void init()
- **static** Object writeNMSItemStackPacketDataSerializer(Object, Object)
- **static** Enum fromPacketEventsParticle(ParticleType)
- **static** Object convertWorldServerDimensionToNMSNbt(Object)
- **static** int generateEntityId()
- **static** Class getNettyClass(String)
- **static** void writeNmsNbtToStream(Object, DataOutput)
- **static** Object toNMSItemStack(ItemStack)
- **static** Class getServerClass(String, String)
- **static** ParticleType toPacketEventsParticle(Enum)
- **static** List getNetworkManagers()
- **static** int getEffectId(Object)
- **static** Object readNMSItemStackPacketDataSerializer(Object)
- **static** Object getEntityPlayer(Player)
- **static** int getBlockDataCombinedId(MaterialData)
- **static** Object getNetworkManager(Player)
- **static** Object readNmsNbtFromStream(DataInputStream)
- **static** double getTPS()
- **static** Object getNMSAxisAlignedBoundingBox(Object)
- **static** Object createNMSItemStack(Object, int)
- **static** Object createNMSItemStack(int, int)
- **static** List getUserProfile(Player)
- **static** Object getGameProfile(Player)
- **static** List getEntityList(World)
- **static** Class getOBCClass(String)
- **static** int getNMSItemId(Object)
- **static** Object getNMSEntity(Entity)
- **static** Class getNMSClass(String) throws ClassNotFoundException
- **static** Object createBlockPosition(int, int, int)
- **static** String fromStringToJSON(String)
- **static** Object getRemoteChatSession(Player)
- **static** Object getFrozenRegistryAccess()
- **static** Object toMinecraftNBT(NBTCompound)
- **static** int getPlayerPingLegacy(Player)
- **static** Object getNMSItemById(int)
- **static** Object getMinecraftServerConnectionInstance()
- **static** double[] recentTPS()
- **static** boolean isMinecraftServerInstanceDebugging()
- **static** Object convertBukkitServerToNMSServer(Server)
- **static** Object createPacketDataSerializer(Object)
- **static** List getEntityMetadata(Entity)
- **static** MaterialData getBlockDataByCombinedId(int)
- **static** Object getCraftPlayer(Player)
- **static** ItemStack decodeBukkitItemStack(ItemStack)

## Package: io.github.retrooper.packetevents.util.folia

### Class: io.github.retrooper.packetevents.util.folia.AsyncScheduler
Type: Class

Methods:
- void cancel(Plugin)
- TaskWrapper runAtFixedRate(Plugin, Consumer, long, long, TimeUnit)
- TaskWrapper runAtFixedRate(Plugin, Consumer, long, long)
- TaskWrapper runNow(Plugin, Consumer)
- TaskWrapper runDelayed(Plugin, Consumer, long, TimeUnit)

### Class: io.github.retrooper.packetevents.util.folia.EntityScheduler
Type: Class

Methods:
- TaskWrapper runAtFixedRate(Entity, Plugin, Consumer, Runnable, long, long)
- TaskWrapper runDelayed(Entity, Plugin, Consumer, Runnable, long)
- TaskWrapper run(Entity, Plugin, Consumer, Runnable)
- void execute(Entity, Plugin, Runnable, Runnable, long)

### Class: io.github.retrooper.packetevents.util.folia.FoliaScheduler
Type: Class

Methods:
- **static** GlobalRegionScheduler getGlobalRegionScheduler()
- **static** EntityScheduler getEntityScheduler()
- **static** RegionScheduler getRegionScheduler()
- **static** void runTaskOnInit(Plugin, Runnable)
- **static** AsyncScheduler getAsyncScheduler()
- **static** boolean isFolia()

### Class: io.github.retrooper.packetevents.util.folia.GlobalRegionScheduler
Type: Class

Methods:
- void cancel(Plugin)
- TaskWrapper runAtFixedRate(Plugin, Consumer, long, long)
- TaskWrapper runDelayed(Plugin, Consumer, long)
- TaskWrapper run(Plugin, Consumer)
- void execute(Plugin, Runnable)

### Class: io.github.retrooper.packetevents.util.folia.RegionScheduler
Type: Class

Methods:
- TaskWrapper runAtFixedRate(Plugin, World, int, int, Consumer, long, long)
- TaskWrapper runAtFixedRate(Plugin, Location, Consumer, long, long)
- TaskWrapper runDelayed(Plugin, World, int, int, Consumer, long)
- TaskWrapper runDelayed(Plugin, Location, Consumer, long)
- TaskWrapper run(Plugin, World, int, int, Consumer)
- TaskWrapper run(Plugin, Location, Consumer)
- void execute(Plugin, World, int, int, Runnable)
- void execute(Plugin, Location, Runnable)

### Class: io.github.retrooper.packetevents.util.folia.TaskWrapper
Type: Class

Methods:
- void cancel()
- boolean isCancelled()
- Plugin getOwner()

## Package: io.github.retrooper.packetevents.util.protocolsupport

### Class: io.github.retrooper.packetevents.util.protocolsupport.ProtocolSupportUtil
Type: Class

Methods:
- **static** int getProtocolVersion(SocketAddress)
- **static** int getProtocolVersion(Player)
- **static** boolean isAvailable()
- **static** void checkIfProtocolSupportIsPresent()

## Package: io.github.retrooper.packetevents.util.viaversion

### Class: io.github.retrooper.packetevents.util.viaversion.ViaVersionAccessor
Type: Interface

Methods:
- int getProtocolVersion(Player)
- int getProtocolVersion(User)
- Class getBukkitDecodeHandlerClass()
- Class getBukkitEncodeHandlerClass()
- Class getUserConnectionClass()

### Class: io.github.retrooper.packetevents.util.viaversion.CustomPipelineUtil
Type: Class

Methods:
- **static** List callDecode(Object, Object, Object) throws InvocationTargetException
- **static** void init()
- **static** List callMTMDecode(Object, Object, Object) throws InvocationTargetException
- **static** List callMTMEncode(Object, Object, Object)
- **static** void callEncode(Object, Object, Object, Object) throws InvocationTargetException

### Class: io.github.retrooper.packetevents.util.viaversion.ViaVersionAccessorImpl
Type: Class
Implements: io.github.retrooper.packetevents.util.viaversion.ViaVersionAccessor

Methods:
- int getProtocolVersion(Player)
- int getProtocolVersion(User)
- Class getBukkitDecodeHandlerClass()
- Class getBukkitEncodeHandlerClass()
- Class getUserConnectionClass()

### Class: io.github.retrooper.packetevents.util.viaversion.ViaVersionAccessorImplLegacy
Type: Class
Implements: io.github.retrooper.packetevents.util.viaversion.ViaVersionAccessor

Methods:
- int getProtocolVersion(Player)
- int getProtocolVersion(User)
- Class getBukkitDecodeHandlerClass()
- Class getBukkitEncodeHandlerClass()
- Class getUserConnectionClass()

### Class: io.github.retrooper.packetevents.util.viaversion.ViaVersionUtil
Type: Class

Methods:
- **static** int getProtocolVersion(User)
- **static** int getProtocolVersion(Player)
- **static** boolean isAvailable()
- **static** Class getBukkitDecodeHandlerClass()
- **static** Class getBukkitEncodeHandlerClass()
- **static** ViaVersionAccessor getViaVersionAccessor()
- **static** Class getUserConnectionClass()
- **static** void checkIfViaIsPresent()

## Package: net.kyori.adventure

### Class: net.kyori.adventure.Adventure
Type: Class

No public methods found

## Package: net.kyori.adventure.audience

### Class: net.kyori.adventure.audience.Audience
Type: Interface
Implements: net.kyori.adventure.pointer.Pointered

Methods:
- void sendPlayerListHeader(ComponentLike)
- void sendPlayerListHeader(Component)
- void forEachAudience(Consumer)
- void removeResourcePacks(ResourcePackRequestLike)
- void removeResourcePacks(ResourcePackRequest)
- void removeResourcePacks(ResourcePackInfoLike, ResourcePackInfoLike[])
- void removeResourcePacks(Iterable)
- void removeResourcePacks(UUID, UUID[])
- **static** Audience audience(Audience[])
- **static** ForwardingAudience audience(Iterable)
- void sendResourcePacks(ResourcePackInfoLike, ResourcePackInfoLike[])
- void sendResourcePacks(ResourcePackRequestLike)
- void sendResourcePacks(ResourcePackRequest)
- void sendTitlePart(TitlePart, Object)
- void sendMessage(ComponentLike)
- void sendMessage(Component)
- void sendMessage(ComponentLike, MessageType)
- void sendMessage(Component, MessageType)
- void sendMessage(Identified, ComponentLike)
- void sendMessage(Identity, ComponentLike)
- void sendMessage(Identified, Component)
- void sendMessage(Identity, Component)
- void sendMessage(Identified, ComponentLike, MessageType)
- void sendMessage(Identity, ComponentLike, MessageType)
- void sendMessage(Identified, Component, MessageType)
- void sendMessage(Identity, Component, MessageType)
- void sendMessage(Component, ChatType$Bound)
- void sendMessage(ComponentLike, ChatType$Bound)
- void sendMessage(SignedMessage, ChatType$Bound)
- void deleteMessage(SignedMessage)
- void deleteMessage(SignedMessage$Signature)
- void sendPlayerListHeaderAndFooter(ComponentLike, ComponentLike)
- void sendPlayerListHeaderAndFooter(Component, Component)
- **static** Collector toAudience()
- void hideBossBar(BossBar)
- **static** Audience empty()
- void openBook(Book$Builder)
- void openBook(Book)
- void showBossBar(BossBar)
- void clearResourcePacks()
- void stopSound(Sound)
- void stopSound(SoundStop)
- void showDialog(DialogLike)
- void showTitle(Title)
- void playSound(Sound)
- void playSound(Sound, double, double, double)
- void playSound(Sound, Sound$Emitter)
- void clearTitle()
- void resetTitle()
- void sendPlayerListFooter(ComponentLike)
- void sendPlayerListFooter(Component)
- void sendActionBar(ComponentLike)
- void sendActionBar(Component)
- Audience filterAudience(Predicate)

### Class: net.kyori.adventure.audience.ForwardingAudience
Type: Interface
Implements: net.kyori.adventure.audience.Audience

Methods:
- void sendPlayerListHeader(Component)
- void forEachAudience(Consumer)
- void removeResourcePacks(Iterable)
- void removeResourcePacks(UUID, UUID[])
- void sendResourcePacks(ResourcePackRequest)
- void sendTitlePart(TitlePart, Object)
- void sendMessage(Component)
- void sendMessage(Component, ChatType$Bound)
- void sendMessage(SignedMessage, ChatType$Bound)
- void sendMessage(Identified, Component, MessageType)
- void sendMessage(Identity, Component, MessageType)
- void deleteMessage(SignedMessage$Signature)
- void sendPlayerListHeaderAndFooter(Component, Component)
- void hideBossBar(BossBar)
- void openBook(Book)
- void showBossBar(BossBar)
- void clearResourcePacks()
- void stopSound(SoundStop)
- void showDialog(DialogLike)
- void playSound(Sound)
- void playSound(Sound, double, double, double)
- void playSound(Sound, Sound$Emitter)
- void clearTitle()
- Iterable audiences()
- void resetTitle()
- Pointers pointers()
- void sendPlayerListFooter(Component)
- void sendActionBar(Component)
- Audience filterAudience(Predicate)

### Class: net.kyori.adventure.audience.ForwardingAudience$Single
Type: Interface
Implements: net.kyori.adventure.audience.ForwardingAudience

Methods:
- void sendPlayerListHeader(Component)
- Object getOrDefault(Pointer, Object)
- void sendResourcePacks(ResourcePackRequest)
- void sendTitlePart(TitlePart, Object)
- void showBossBar(BossBar)
- void clearResourcePacks()
- Object getOrDefaultFrom(Pointer, Supplier)
- void stopSound(SoundStop)
- void showDialog(DialogLike)
- void playSound(Sound)
- void playSound(Sound, double, double, double)
- void playSound(Sound, Sound$Emitter)
- Optional get(Pointer)
- Iterable audiences()
- Pointers pointers()
- void sendPlayerListFooter(Component)
- void forEachAudience(Consumer)
- void removeResourcePacks(Iterable)
- void removeResourcePacks(UUID, UUID[])
- Audience audience()
- void sendMessage(Component)
- void sendMessage(Component, ChatType$Bound)
- void sendMessage(SignedMessage, ChatType$Bound)
- void sendMessage(Identified, Component, MessageType)
- void sendMessage(Identity, Component, MessageType)
- void deleteMessage(SignedMessage$Signature)
- void sendPlayerListHeaderAndFooter(Component, Component)
- void hideBossBar(BossBar)
- void openBook(Book)
- void clearTitle()
- void resetTitle()
- void sendActionBar(Component)
- Audience filterAudience(Predicate)

### Class: net.kyori.adventure.audience.Audiences
Type: Class

Methods:
- **static** Consumer sendingMessage(ComponentLike)

### Class: net.kyori.adventure.audience.MessageType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** MessageType valueOf(String)
- **static** MessageType[] values()

## Package: net.kyori.adventure.bossbar

### Class: net.kyori.adventure.bossbar.BossBar
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- boolean hasFlag(BossBar$Flag)
- BossBar removeFlag(BossBar$Flag)
- BossBar$Overlay overlay()
- BossBar overlay(BossBar$Overlay)
- BossBar$Color color()
- BossBar color(BossBar$Color)
- Set flags()
- BossBar flags(Set)
- BossBar removeViewer(Audience)
- BossBar removeListener(BossBar$Listener)
- float percent()
- BossBar percent(float)
- BossBar addFlag(BossBar$Flag)
- **static** BossBar bossBar(ComponentLike, float, BossBar$Color, BossBar$Overlay)
- **static** BossBar bossBar(Component, float, BossBar$Color, BossBar$Overlay)
- **static** BossBar bossBar(ComponentLike, float, BossBar$Color, BossBar$Overlay, Set)
- **static** BossBar bossBar(Component, float, BossBar$Color, BossBar$Overlay, Set)
- Iterable viewers()
- BossBar addFlags(BossBar$Flag[])
- BossBar addFlags(Iterable)
- Component name()
- BossBar name(ComponentLike)
- BossBar name(Component)
- BossBar addViewer(Audience)
- float progress()
- BossBar progress(float)
- BossBar addListener(BossBar$Listener)
- BossBar removeFlags(BossBar$Flag[])
- BossBar removeFlags(Iterable)

### Class: net.kyori.adventure.bossbar.BossBar$Listener
Type: Interface

Methods:
- void bossBarNameChanged(BossBar, Component, Component)
- void bossBarProgressChanged(BossBar, float, float)
- void bossBarOverlayChanged(BossBar, BossBar$Overlay, BossBar$Overlay)
- void bossBarPercentChanged(BossBar, float, float)
- void bossBarFlagsChanged(BossBar, Set, Set)
- void bossBarColorChanged(BossBar, BossBar$Color, BossBar$Color)

### Class: net.kyori.adventure.bossbar.BossBarImplementation
Type: Interface

Methods:
- Iterable viewers()
- **static** BossBarImplementation get(BossBar, Class)

### Class: net.kyori.adventure.bossbar.BossBarImplementation$Provider
Type: Interface

Methods:
- BossBarImplementation create(BossBar)

### Class: net.kyori.adventure.bossbar.BossBarViewer
Type: Interface

Methods:
- Iterable activeBossBars()

### Class: net.kyori.adventure.bossbar.BossBar$Color
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BossBar$Color valueOf(String)
- **static** BossBar$Color[] values()

### Class: net.kyori.adventure.bossbar.BossBar$Flag
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BossBar$Flag valueOf(String)
- **static** BossBar$Flag[] values()

### Class: net.kyori.adventure.bossbar.BossBar$Overlay
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BossBar$Overlay valueOf(String)
- **static** BossBar$Overlay[] values()

## Package: net.kyori.adventure.builder

### Class: net.kyori.adventure.builder.AbstractBuilder
Type: Interface

Methods:
- **static** Object configureAndBuild(AbstractBuilder, Consumer)
- Object build()

## Package: net.kyori.adventure.chat

### Class: net.kyori.adventure.chat.ChatType
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.key.Keyed

Methods:
- ChatType$Bound bind(ComponentLike)
- ChatType$Bound bind(ComponentLike, ComponentLike)
- Stream examinableProperties()
- **static** ChatType chatType(Keyed)

### Class: net.kyori.adventure.chat.ChatType$Bound
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- Component name()
- Stream examinableProperties()
- ChatType type()
- Component target()

### Class: net.kyori.adventure.chat.SignedMessage
Type: Interface
Implements: net.kyori.adventure.identity.Identified, net.kyori.examination.Examinable

Methods:
- boolean isSystem()
- Component unsignedContent()
- long salt()
- **static** SignedMessage system(String, ComponentLike)
- **static** SignedMessage$Signature signature(byte[])
- SignedMessage$Signature signature()
- boolean canDelete()
- Stream examinableProperties()
- String message()
- Instant timestamp()

### Class: net.kyori.adventure.chat.SignedMessage$Signature
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- byte[] bytes()
- Stream examinableProperties()

## Package: net.kyori.adventure.dialog

### Class: net.kyori.adventure.dialog.DialogLike
Type: Interface

No public methods found

## Package: net.kyori.adventure.identity

### Class: net.kyori.adventure.identity.Identified
Type: Interface

Methods:
- Identity identity()

### Class: net.kyori.adventure.identity.Identity
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.identity.Identified

Methods:
- **static** Identity nil()
- **static** Identity identity(UUID)
- Identity identity()
- Stream examinableProperties()
- UUID uuid()

## Package: net.kyori.adventure.internal

### Class: net.kyori.adventure.internal.Internals
Type: Class

Methods:
- **static** String toString(Examinable)

## Package: net.kyori.adventure.internal.properties

### Class: net.kyori.adventure.internal.properties.AdventureProperties$Property
Type: Interface

Methods:
- Object value()

### Class: net.kyori.adventure.internal.properties.AdventureProperties
Type: Class

Methods:
- **static** AdventureProperties$Property property(String, Function, Object)

## Package: net.kyori.adventure.inventory

### Class: net.kyori.adventure.inventory.Book
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable

Methods:
- Book$Builder toBuilder()
- Buildable$Builder toBuilder()
- List pages()
- Book pages(Component[])
- Book pages(List)
- Component author()
- Book author(Component)
- **static** Book book(Component, Component, Collection)
- **static** Book book(Component, Component, Component[])
- **static** Book$Builder builder()
- Component title()
- Book title(Component)

### Class: net.kyori.adventure.inventory.Book$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- Book$Builder pages(Component[])
- Book$Builder pages(Collection)
- Book build()
- Object build()
- Book$Builder author(Component)
- Book$Builder addPage(Component)
- Book$Builder title(Component)

## Package: net.kyori.adventure.key

### Class: net.kyori.adventure.key.Key
Type: Interface
Implements: java.lang.Comparable, net.kyori.examination.Examinable, net.kyori.adventure.key.Namespaced, net.kyori.adventure.key.Keyed

Methods:
- **static** boolean parseableValue(String)
- **static** boolean allowedInNamespace(char)
- **static** boolean parseableNamespace(String)
- int compareTo(Key)
- int compareTo(Object)
- **static** boolean allowedInValue(char)
- **static** boolean parseable(String)
- **static** Comparator comparator()
- String namespace()
- **static** OptionalInt checkValue(String)
- Stream examinableProperties()
- String asString()
- String value()
- **static** OptionalInt checkNamespace(String)
- **static** Key key(String)
- **static** Key key(String, char)
- **static** Key key(Namespaced, String)
- **static** Key key(String, String)
- Key key()
- String asMinimalString()

### Class: net.kyori.adventure.key.KeyPattern
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.kyori.adventure.key.KeyPattern$Namespace
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.kyori.adventure.key.KeyPattern$Value
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.kyori.adventure.key.Keyed
Type: Interface

Methods:
- Key key()

### Class: net.kyori.adventure.key.KeyedValue
Type: Interface
Implements: net.kyori.adventure.key.Keyed

Methods:
- **static** KeyedValue keyedValue(Key, Object)
- **static** KeyedValue of(Key, Object)
- Object value()

### Class: net.kyori.adventure.key.Namespaced
Type: Interface

Methods:
- String namespace()

### Class: net.kyori.adventure.key.InvalidKeyException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- String keyValue()
- String keyNamespace()

## Package: net.kyori.adventure.nbt

### Class: net.kyori.adventure.nbt.ArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- BinaryTagType type()

### Class: net.kyori.adventure.nbt.BinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTagLike, net.kyori.examination.Examinable

Methods:
- BinaryTag asBinaryTag()
- BinaryTagType type()

### Class: net.kyori.adventure.nbt.BinaryTagIO$Reader
Type: Interface

Methods:
- CompoundBinaryTag read(Path) throws IOException
- CompoundBinaryTag read(Path, BinaryTagIO$Compression) throws IOException
- CompoundBinaryTag read(InputStream) throws IOException
- CompoundBinaryTag read(InputStream, BinaryTagIO$Compression) throws IOException
- CompoundBinaryTag read(DataInput) throws IOException
- CompoundBinaryTag readNameless(Path) throws IOException
- CompoundBinaryTag readNameless(Path, BinaryTagIO$Compression) throws IOException
- CompoundBinaryTag readNameless(InputStream) throws IOException
- CompoundBinaryTag readNameless(InputStream, BinaryTagIO$Compression) throws IOException
- CompoundBinaryTag readNameless(DataInput) throws IOException
- Map$Entry readNamed(Path) throws IOException
- Map$Entry readNamed(Path, BinaryTagIO$Compression) throws IOException
- Map$Entry readNamed(InputStream) throws IOException
- Map$Entry readNamed(InputStream, BinaryTagIO$Compression) throws IOException
- Map$Entry readNamed(DataInput) throws IOException

### Class: net.kyori.adventure.nbt.BinaryTagIO$Writer
Type: Interface

Methods:
- void writeNameless(CompoundBinaryTag, Path) throws IOException
- void writeNameless(CompoundBinaryTag, Path, BinaryTagIO$Compression) throws IOException
- void writeNameless(CompoundBinaryTag, OutputStream) throws IOException
- void writeNameless(CompoundBinaryTag, OutputStream, BinaryTagIO$Compression) throws IOException
- void writeNameless(CompoundBinaryTag, DataOutput) throws IOException
- void writeNamed(Map$Entry, Path) throws IOException
- void writeNamed(Map$Entry, Path, BinaryTagIO$Compression) throws IOException
- void writeNamed(Map$Entry, OutputStream) throws IOException
- void writeNamed(Map$Entry, OutputStream, BinaryTagIO$Compression) throws IOException
- void writeNamed(Map$Entry, DataOutput) throws IOException
- void write(CompoundBinaryTag, Path) throws IOException
- void write(CompoundBinaryTag, Path, BinaryTagIO$Compression) throws IOException
- void write(CompoundBinaryTag, OutputStream) throws IOException
- void write(CompoundBinaryTag, OutputStream, BinaryTagIO$Compression) throws IOException
- void write(CompoundBinaryTag, DataOutput) throws IOException

### Class: net.kyori.adventure.nbt.BinaryTagLike
Type: Interface

Methods:
- BinaryTag asBinaryTag()

### Class: net.kyori.adventure.nbt.ByteArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- int size()
- byte get(int)
- **static** ByteArrayBinaryTag of(byte[])
- **static** ByteArrayBinaryTag byteArrayBinaryTag(byte[])
- BinaryTagType type()
- byte[] value()

### Class: net.kyori.adventure.nbt.ByteBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** ByteBinaryTag of(byte)
- BinaryTagType type()
- byte value()
- **static** ByteBinaryTag byteBinaryTag(byte)

### Class: net.kyori.adventure.nbt.CompoundBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag, net.kyori.adventure.nbt.CompoundTagSetter, java.lang.Iterable

Methods:
- CompoundBinaryTag getCompound(String)
- CompoundBinaryTag getCompound(String, CompoundBinaryTag)
- **static** Collector toCompoundTag()
- **static** Collector toCompoundTag(Function, Function)
- **static** Collector toCompoundTag(CompoundBinaryTag)
- **static** Collector toCompoundTag(CompoundBinaryTag, Function, Function)
- byte getByte(String)
- byte getByte(String, byte)
- short getShort(String)
- short getShort(String, short)
- boolean isEmpty()
- double getDouble(String)
- double getDouble(String, double)
- String getString(String)
- String getString(String, String)
- float getFloat(String)
- float getFloat(String, float)
- BinaryTagType type()
- long[] getLongArray(String)
- long[] getLongArray(String, long[])
- **static** CompoundBinaryTag empty()
- long getLong(String)
- long getLong(String, long)
- int getInt(String)
- int getInt(String, int)
- int size()
- Stream stream()
- ListBinaryTag getList(String)
- ListBinaryTag getList(String, ListBinaryTag)
- ListBinaryTag getList(String, BinaryTagType)
- ListBinaryTag getList(String, BinaryTagType, ListBinaryTag)
- BinaryTag get(String)
- byte[] getByteArray(String)
- byte[] getByteArray(String, byte[])
- **static** CompoundBinaryTag$Builder builder()
- boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- **static** CompoundBinaryTag from(Map)
- Set keySet()
- int[] getIntArray(String)
- int[] getIntArray(String, int[])

### Class: net.kyori.adventure.nbt.CompoundBinaryTag$Builder
Type: Interface
Implements: net.kyori.adventure.nbt.CompoundTagSetter

Methods:
- CompoundBinaryTag build()

### Class: net.kyori.adventure.nbt.CompoundTagSetter
Type: Interface

Methods:
- Object putFloat(String, float)
- Object putByte(String, byte)
- Object putInt(String, int)
- Object putString(String, String)
- Object putIntArray(String, int[])
- Object putDouble(String, double)
- Object putLongArray(String, long[])
- Object putLong(String, long)
- Object putShort(String, short)
- Object putBoolean(String, boolean)
- Object remove(String)
- Object remove(String, Consumer)
- Object put(String, BinaryTag)
- Object put(CompoundBinaryTag)
- Object put(Map)
- Object putByteArray(String, byte[])

### Class: net.kyori.adventure.nbt.DoubleBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** DoubleBinaryTag doubleBinaryTag(double)
- **static** DoubleBinaryTag of(double)
- BinaryTagType type()
- double value()

### Class: net.kyori.adventure.nbt.EndBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- **static** EndBinaryTag endBinaryTag()
- **static** EndBinaryTag get()
- BinaryTagType type()

### Class: net.kyori.adventure.nbt.FloatBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** FloatBinaryTag floatBinaryTag(float)
- **static** FloatBinaryTag of(float)
- BinaryTagType type()
- float value()

### Class: net.kyori.adventure.nbt.IntArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- PrimitiveIterator$OfInt iterator()
- Iterator iterator()
- int size()
- IntStream stream()
- Spliterator$OfInt spliterator()
- Spliterator spliterator()
- **static** IntArrayBinaryTag intArrayBinaryTag(int[])
- int get(int)
- **static** IntArrayBinaryTag of(int[])
- void forEachInt(IntConsumer)
- BinaryTagType type()
- int[] value()

### Class: net.kyori.adventure.nbt.IntBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** IntBinaryTag intBinaryTag(int)
- **static** IntBinaryTag of(int)
- BinaryTagType type()
- int value()

### Class: net.kyori.adventure.nbt.ListBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ListTagSetter, net.kyori.adventure.nbt.BinaryTag, java.lang.Iterable

Methods:
- CompoundBinaryTag getCompound(int)
- CompoundBinaryTag getCompound(int, CompoundBinaryTag)
- **static** ListBinaryTag listBinaryTag(BinaryTagType, List)
- byte getByte(int)
- byte getByte(int, byte)
- ListBinaryTag unwrapHeterogeneity()
- double getDouble(int)
- double getDouble(int, double)
- float getFloat(int)
- float getFloat(int, float)
- BinaryTagType type()
- BinaryTagType listType()
- ListBinaryTag remove(int, Consumer)
- **static** ListBinaryTag empty()
- **static** Collector toListTag()
- **static** Collector toListTag(ListBinaryTag)
- Stream stream()
- ListBinaryTag getList(int)
- ListBinaryTag getList(int, BinaryTagType)
- ListBinaryTag getList(int, ListBinaryTag)
- ListBinaryTag getList(int, BinaryTagType, ListBinaryTag)
- BinaryTag get(int)
- **static** ListBinaryTag of(BinaryTagType, List)
- **static** ListBinaryTag$Builder builder()
- **static** ListBinaryTag$Builder builder(BinaryTagType)
- **static** ListBinaryTag from(Iterable)
- ListBinaryTag set(int, BinaryTag, Consumer)
- short getShort(int)
- short getShort(int, short)
- **static** ListBinaryTag$Builder heterogeneousListBinaryTag()
- boolean isEmpty()
- String getString(int)
- String getString(int, String)
- long[] getLongArray(int)
- long[] getLongArray(int, long[])
- long getLong(int)
- long getLong(int, long)
- ListBinaryTag wrapHeterogeneity()
- int getInt(int)
- int getInt(int, int)
- int size()
- byte[] getByteArray(int)
- byte[] getByteArray(int, byte[])
- BinaryTagType elementType()
- int[] getIntArray(int)
- int[] getIntArray(int, int[])

### Class: net.kyori.adventure.nbt.ListBinaryTag$Builder
Type: Interface
Implements: net.kyori.adventure.nbt.ListTagSetter

Methods:
- ListBinaryTag build()

### Class: net.kyori.adventure.nbt.ListTagSetter
Type: Interface

Methods:
- Object add(BinaryTag)
- Object add(Iterable)

### Class: net.kyori.adventure.nbt.LongArrayBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.ArrayBinaryTag, java.lang.Iterable

Methods:
- **static** LongArrayBinaryTag longArrayBinaryTag(long[])
- PrimitiveIterator$OfLong iterator()
- Iterator iterator()
- int size()
- LongStream stream()
- Spliterator$OfLong spliterator()
- Spliterator spliterator()
- long get(int)
- **static** LongArrayBinaryTag of(long[])
- BinaryTagType type()
- void forEachLong(LongConsumer)
- long[] value()

### Class: net.kyori.adventure.nbt.LongBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** LongBinaryTag of(long)
- BinaryTagType type()
- **static** LongBinaryTag longBinaryTag(long)
- long value()

### Class: net.kyori.adventure.nbt.NumberBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- int intValue()
- float floatValue()
- short shortValue()
- Number numberValue()
- double doubleValue()
- BinaryTagType type()
- long longValue()
- byte byteValue()

### Class: net.kyori.adventure.nbt.ShortBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.NumberBinaryTag

Methods:
- **static** ShortBinaryTag of(short)
- **static** ShortBinaryTag shortBinaryTag(short)
- BinaryTagType type()
- short value()

### Class: net.kyori.adventure.nbt.StringBinaryTag
Type: Interface
Implements: net.kyori.adventure.nbt.BinaryTag

Methods:
- **static** StringBinaryTag stringBinaryTag(String)
- **static** StringBinaryTag of(String)
- BinaryTagType type()
- String value()

### Class: net.kyori.adventure.nbt.BinaryTagIO
Type: Class

Methods:
- **static** void writeCompressedPath(CompoundBinaryTag, Path) throws IOException
- **static** void writeOutputStream(CompoundBinaryTag, OutputStream) throws IOException
- **static** CompoundBinaryTag readCompressedInputStream(InputStream) throws IOException
- **static** CompoundBinaryTag readPath(Path) throws IOException
- **static** BinaryTagIO$Reader reader()
- **static** BinaryTagIO$Reader reader(long)
- **static** CompoundBinaryTag readCompressedPath(Path) throws IOException
- **static** CompoundBinaryTag readInputStream(InputStream) throws IOException
- **static** void writeCompressedOutputStream(CompoundBinaryTag, OutputStream) throws IOException
- **static** BinaryTagIO$Writer writer()
- **static** CompoundBinaryTag readDataInput(DataInput) throws IOException
- **static** BinaryTagIO$Reader unlimitedReader()
- **static** void writeDataOutput(CompoundBinaryTag, DataOutput) throws IOException
- **static** void writePath(CompoundBinaryTag, Path) throws IOException

### Class: net.kyori.adventure.nbt.BinaryTagIO$Compression
Type: Abstract Class

No public methods found

### Class: net.kyori.adventure.nbt.BinaryTagScope$NoOp
Type: Class
Implements: net.kyori.adventure.nbt.BinaryTagScope

Methods:
- void close()

### Class: net.kyori.adventure.nbt.BinaryTagType
Type: Abstract Class
Implements: java.util.function.Predicate

Methods:
- BinaryTag read(DataInput) throws IOException
- boolean test(BinaryTagType)
- boolean test(Object)
- byte id()
- void write(BinaryTag, DataOutput) throws IOException

### Class: net.kyori.adventure.nbt.BinaryTagTypes
Type: Class

No public methods found

### Class: net.kyori.adventure.nbt.TagStringIO
Type: Class

Methods:
- BinaryTag asTag(String) throws IOException
- BinaryTag asTag(String, Appendable) throws IOException
- **static** TagStringIO tagStringIO()
- void toWriter(CompoundBinaryTag, Writer) throws IOException
- void toWriter(BinaryTag, Writer) throws IOException
- **static** TagStringIO get()
- **static** TagStringIO$Builder builder()
- String asString(CompoundBinaryTag) throws IOException
- String asString(BinaryTag) throws IOException
- CompoundBinaryTag asCompound(String) throws IOException
- CompoundBinaryTag asCompound(String, Appendable) throws IOException

### Class: net.kyori.adventure.nbt.TagStringIO$Builder
Type: Class

Methods:
- TagStringIO build()
- TagStringIO$Builder indent(int)
- TagStringIO$Builder emitHeterogeneousLists(boolean)
- TagStringIO$Builder indentTab(int)
- TagStringIO$Builder emitLegacy(boolean)
- TagStringIO$Builder acceptHeterogeneousLists(boolean)
- TagStringIO$Builder acceptLegacy(boolean)

## Package: net.kyori.adventure.nbt.api

### Class: net.kyori.adventure.nbt.api.BinaryTagHolder
Type: Interface
Implements: net.kyori.adventure.text.event.DataComponentValue$TagSerializable

Methods:
- BinaryTagHolder asBinaryTag()
- **static** BinaryTagHolder encode(Object, Codec) throws Exception
- **static** BinaryTagHolder binaryTagHolder(String)
- String string()
- Object get(Codec) throws Exception
- **static** BinaryTagHolder of(String)

## Package: net.kyori.adventure.permission

### Class: net.kyori.adventure.permission.PermissionChecker
Type: Interface
Implements: java.util.function.Predicate

Methods:
- **static** PermissionChecker always(TriState)
- boolean test(String)
- boolean test(Object)
- TriState value(String)

## Package: net.kyori.adventure.pointer

### Class: net.kyori.adventure.pointer.Pointer
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** Pointer pointer(Class, Key)
- Stream examinableProperties()
- Class type()
- Key key()

### Class: net.kyori.adventure.pointer.Pointered
Type: Interface

Methods:
- Object getOrDefaultFrom(Pointer, Supplier)
- Object getOrDefault(Pointer, Object)
- Optional get(Pointer)
- Pointers pointers()

### Class: net.kyori.adventure.pointer.Pointers
Type: Interface
Implements: net.kyori.adventure.util.Buildable

Methods:
- Object getOrDefaultFrom(Pointer, Supplier)
- Object getOrDefault(Pointer, Object)
- Optional get(Pointer)
- **static** Pointers$Builder builder()
- boolean supports(Pointer)
- **static** Pointers empty()

### Class: net.kyori.adventure.pointer.Pointers$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- Pointers$Builder withDynamic(Pointer, Supplier)
- Pointers$Builder withStatic(Pointer, Object)

### Class: net.kyori.adventure.pointer.PointersSupplier
Type: Interface

Methods:
- Function resolver(Pointer)
- Pointers view(Object)
- **static** PointersSupplier$Builder builder()
- boolean supports(Pointer)

### Class: net.kyori.adventure.pointer.PointersSupplier$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder

Methods:
- PointersSupplier$Builder parent(PointersSupplier)
- PointersSupplier$Builder resolving(Pointer, Function)

## Package: net.kyori.adventure.resource

### Class: net.kyori.adventure.resource.ResourcePackCallback
Type: Interface

Methods:
- **static** ResourcePackCallback noOp()
- void packEventReceived(UUID, ResourcePackStatus, Audience)
- **static** ResourcePackCallback onTerminal(BiConsumer, BiConsumer)

### Class: net.kyori.adventure.resource.ResourcePackInfo
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.resource.ResourcePackInfoLike

Methods:
- **static** ResourcePackInfo resourcePackInfo(UUID, URI, String)
- **static** ResourcePackInfo$Builder resourcePackInfo()
- ResourcePackInfo asResourcePackInfo()
- UUID id()
- URI uri()
- String hash()

### Class: net.kyori.adventure.resource.ResourcePackInfo$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.resource.ResourcePackInfoLike

Methods:
- ResourcePackInfo build()
- Object build()
- ResourcePackInfo asResourcePackInfo()
- ResourcePackInfo$Builder id(UUID)
- ResourcePackInfo$Builder uri(URI)
- CompletableFuture computeHashAndBuild()
- CompletableFuture computeHashAndBuild(Executor)
- ResourcePackInfo$Builder hash(String)

### Class: net.kyori.adventure.resource.ResourcePackInfoLike
Type: Interface

Methods:
- ResourcePackInfo asResourcePackInfo()

### Class: net.kyori.adventure.resource.ResourcePackRequest
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.resource.ResourcePackRequestLike

Methods:
- boolean replace()
- ResourcePackRequest replace(boolean)
- **static** ResourcePackRequest$Builder resourcePackRequest()
- **static** ResourcePackRequest$Builder resourcePackRequest(ResourcePackRequest)
- ResourcePackCallback callback()
- ResourcePackRequest callback(ResourcePackCallback)
- **static** ResourcePackRequest addingRequest(ResourcePackInfoLike, ResourcePackInfoLike[])
- ResourcePackRequest asResourcePackRequest()
- Component prompt()
- List packs()
- ResourcePackRequest packs(Iterable)
- boolean required()

### Class: net.kyori.adventure.resource.ResourcePackRequest$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.resource.ResourcePackRequestLike

Methods:
- ResourcePackRequest$Builder replace(boolean)
- ResourcePackRequest$Builder callback(ResourcePackCallback)
- ResourcePackRequest asResourcePackRequest()
- ResourcePackRequest$Builder prompt(Component)
- ResourcePackRequest$Builder packs(ResourcePackInfoLike, ResourcePackInfoLike[])
- ResourcePackRequest$Builder packs(Iterable)
- ResourcePackRequest$Builder required(boolean)

### Class: net.kyori.adventure.resource.ResourcePackRequestLike
Type: Interface

Methods:
- ResourcePackRequest asResourcePackRequest()

### Class: net.kyori.adventure.resource.ResourcePackStatus
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ResourcePackStatus valueOf(String)
- **static** ResourcePackStatus[] values()
- boolean intermediate()

## Package: net.kyori.adventure.sound

### Class: net.kyori.adventure.sound.Sound
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- float volume()
- OptionalLong seed()
- SoundStop asStop()
- **static** Sound$Builder sound()
- **static** Sound$Builder sound(Sound)
- **static** Sound sound(Consumer)
- **static** Sound sound(Key, Sound$Source, float, float)
- **static** Sound sound(Sound$Type, Sound$Source, float, float)
- **static** Sound sound(Supplier, Sound$Source, float, float)
- **static** Sound sound(Key, Sound$Source$Provider, float, float)
- **static** Sound sound(Sound$Type, Sound$Source$Provider, float, float)
- **static** Sound sound(Supplier, Sound$Source$Provider, float, float)
- Key name()
- float pitch()
- Sound$Source source()

### Class: net.kyori.adventure.sound.Sound$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder

Methods:
- Sound$Builder volume(float)
- Sound$Builder seed(long)
- Sound$Builder seed(OptionalLong)
- Sound$Builder pitch(float)
- Sound$Builder source(Sound$Source)
- Sound$Builder source(Sound$Source$Provider)
- Sound$Builder type(Key)
- Sound$Builder type(Sound$Type)
- Sound$Builder type(Supplier)

### Class: net.kyori.adventure.sound.Sound$Emitter
Type: Interface

Methods:
- **static** Sound$Emitter self()

### Class: net.kyori.adventure.sound.Sound$Source$Provider
Type: Interface

Methods:
- Sound$Source soundSource()

### Class: net.kyori.adventure.sound.Sound$Type
Type: Interface
Implements: net.kyori.adventure.key.Keyed

Methods:
- Key key()

### Class: net.kyori.adventure.sound.SoundStop
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** SoundStop all()
- **static** SoundStop namedOnSource(Key, Sound$Source)
- **static** SoundStop namedOnSource(Sound$Type, Sound$Source)
- **static** SoundStop namedOnSource(Supplier, Sound$Source)
- **static** SoundStop named(Key)
- **static** SoundStop named(Sound$Type)
- **static** SoundStop named(Supplier)
- Key sound()
- **static** SoundStop source(Sound$Source)
- Sound$Source source()

### Class: net.kyori.adventure.sound.Sound$Source
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Sound$Source valueOf(String)
- **static** Sound$Source[] values()

## Package: net.kyori.adventure.text

### Class: net.kyori.adventure.text.BlockNBTComponent
Type: Interface
Implements: net.kyori.adventure.text.NBTComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- BlockNBTComponent localPos(double, double, double)
- BlockNBTComponent$Pos pos()
- BlockNBTComponent pos(BlockNBTComponent$Pos)
- BlockNBTComponent worldPos(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)
- Stream examinableProperties()
- BlockNBTComponent relativeWorldPos(int, int, int)
- BlockNBTComponent absoluteWorldPos(int, int, int)

### Class: net.kyori.adventure.text.BlockNBTComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.NBTComponentBuilder

Methods:
- BlockNBTComponent$Builder localPos(double, double, double)
- BlockNBTComponent$Builder pos(BlockNBTComponent$Pos)
- BlockNBTComponent$Builder worldPos(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)
- BlockNBTComponent$Builder relativeWorldPos(int, int, int)
- BlockNBTComponent$Builder absoluteWorldPos(int, int, int)

### Class: net.kyori.adventure.text.BlockNBTComponent$LocalPos
Type: Interface
Implements: net.kyori.adventure.text.BlockNBTComponent$Pos

Methods:
- double forwards()
- **static** BlockNBTComponent$LocalPos localPos(double, double, double)
- double left()
- **static** BlockNBTComponent$LocalPos of(double, double, double)
- double up()

### Class: net.kyori.adventure.text.BlockNBTComponent$Pos
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- String asString()
- **static** BlockNBTComponent$Pos fromString(String) throws IllegalArgumentException

### Class: net.kyori.adventure.text.BlockNBTComponent$WorldPos
Type: Interface
Implements: net.kyori.adventure.text.BlockNBTComponent$Pos

Methods:
- **static** BlockNBTComponent$WorldPos of(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)
- BlockNBTComponent$WorldPos$Coordinate x()
- BlockNBTComponent$WorldPos$Coordinate y()
- BlockNBTComponent$WorldPos$Coordinate z()
- **static** BlockNBTComponent$WorldPos worldPos(BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate, BlockNBTComponent$WorldPos$Coordinate)

### Class: net.kyori.adventure.text.BlockNBTComponent$WorldPos$Coordinate
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** BlockNBTComponent$WorldPos$Coordinate coordinate(int, BlockNBTComponent$WorldPos$Coordinate$Type)
- **static** BlockNBTComponent$WorldPos$Coordinate absolute(int)
- **static** BlockNBTComponent$WorldPos$Coordinate of(int, BlockNBTComponent$WorldPos$Coordinate$Type)
- BlockNBTComponent$WorldPos$Coordinate$Type type()
- int value()
- **static** BlockNBTComponent$WorldPos$Coordinate relative(int)

### Class: net.kyori.adventure.text.BuildableComponent
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.adventure.text.Component

Methods:
- ComponentBuilder toBuilder()
- Buildable$Builder toBuilder()

### Class: net.kyori.adventure.text.Component
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilderApplicable, net.kyori.adventure.text.ComponentLike, net.kyori.examination.Examinable, net.kyori.adventure.text.event.HoverEventSource, net.kyori.adventure.text.format.StyleGetter, net.kyori.adventure.text.format.StyleSetter

Methods:
- Component decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- **static** VirtualComponent virtual(Class, VirtualComponentRenderer)
- **static** VirtualComponent virtual(Class, VirtualComponentRenderer, Style)
- **static** VirtualComponent virtual(Class, VirtualComponentRenderer, StyleBuilderApplicable[])
- **static** VirtualComponent virtual(Class, VirtualComponentRenderer, Iterable)
- Component compact()
- TextColor color()
- Component color(TextColor)
- StyleSetter color(TextColor)
- **static** EntityNBTComponent$Builder entityNBT()
- **static** EntityNBTComponent entityNBT(Consumer)
- **static** EntityNBTComponent entityNBT(String, String)
- Component replaceFirstText(String, ComponentLike)
- Component replaceFirstText(Pattern, Function)
- Iterable iterable(ComponentIteratorType, ComponentIteratorFlag[])
- Iterable iterable(ComponentIteratorType, Set)
- **static** TextComponent textOfChildren(ComponentLike[])
- Map decorations()
- Component decorations(Map)
- StyleSetter decorations(Map)
- **static** StorageNBTComponent$Builder storageNBT()
- **static** StorageNBTComponent storageNBT(Consumer)
- **static** StorageNBTComponent storageNBT(String, Key)
- **static** StorageNBTComponent storageNBT(String, boolean, Key)
- **static** StorageNBTComponent storageNBT(String, boolean, ComponentLike, Key)
- Component asComponent()
- **static** TextComponent space()
- Component shadowColorIfAbsent(ARGBLike)
- StyleSetter shadowColorIfAbsent(ARGBLike)
- Component colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- void detectCycle(Component)
- **static** TextComponent empty()
- HoverEvent hoverEvent()
- Component hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- **static** BlockNBTComponent$Builder blockNBT()
- **static** BlockNBTComponent blockNBT(Consumer)
- **static** BlockNBTComponent blockNBT(String, BlockNBTComponent$Pos)
- **static** BlockNBTComponent blockNBT(String, boolean, BlockNBTComponent$Pos)
- **static** BlockNBTComponent blockNBT(String, boolean, ComponentLike, BlockNBTComponent$Pos)
- **static** ScoreComponent$Builder score()
- **static** ScoreComponent score(Consumer)
- **static** ScoreComponent score(String, String)
- **static** ScoreComponent score(String, String, String)
- Iterator iterator(ComponentIteratorType, ComponentIteratorFlag[])
- Iterator iterator(ComponentIteratorType, Set)
- **static** TextComponent newline()
- List children()
- Component children(List)
- Component mergeStyle(Component)
- Component mergeStyle(Component, Style$Merge[])
- Component mergeStyle(Component, Set)
- Component appendNewline()
- **static** SelectorComponent$Builder selector()
- **static** SelectorComponent selector(Consumer)
- **static** SelectorComponent selector(String)
- **static** SelectorComponent selector(String, ComponentLike)
- Stream examinableProperties()
- HoverEvent asHoverEvent(UnaryOperator)
- **static** TextComponent$Builder text()
- **static** TextComponent text(Consumer)
- **static** TextComponent text(String)
- **static** TextComponent text(String, Style)
- **static** TextComponent text(String, TextColor)
- **static** TextComponent text(String, TextColor, TextDecoration[])
- **static** TextComponent text(String, TextColor, Set)
- **static** TextComponent text(boolean)
- **static** TextComponent text(boolean, Style)
- **static** TextComponent text(boolean, TextColor)
- **static** TextComponent text(boolean, TextColor, TextDecoration[])
- **static** TextComponent text(boolean, TextColor, Set)
- **static** TextComponent text(char)
- **static** TextComponent text(char, Style)
- **static** TextComponent text(char, TextColor)
- **static** TextComponent text(char, TextColor, TextDecoration[])
- **static** TextComponent text(char, TextColor, Set)
- **static** TextComponent text(double)
- **static** TextComponent text(double, Style)
- **static** TextComponent text(double, TextColor)
- **static** TextComponent text(double, TextColor, TextDecoration[])
- **static** TextComponent text(double, TextColor, Set)
- **static** TextComponent text(float)
- **static** TextComponent text(float, Style)
- **static** TextComponent text(float, TextColor)
- **static** TextComponent text(float, TextColor, TextDecoration[])
- **static** TextComponent text(float, TextColor, Set)
- **static** TextComponent text(int)
- **static** TextComponent text(int, Style)
- **static** TextComponent text(int, TextColor)
- **static** TextComponent text(int, TextColor, TextDecoration[])
- **static** TextComponent text(int, TextColor, Set)
- **static** TextComponent text(long)
- **static** TextComponent text(long, Style)
- **static** TextComponent text(long, TextColor)
- **static** TextComponent text(long, TextColor, TextDecoration[])
- **static** TextComponent text(long, TextColor, Set)
- **static** TextComponent join(ComponentLike, ComponentLike[])
- **static** TextComponent join(ComponentLike, Iterable)
- **static** Component join(JoinConfiguration$Builder, ComponentLike[])
- **static** Component join(JoinConfiguration$Builder, Iterable)
- **static** Component join(JoinConfiguration, ComponentLike[])
- **static** Component join(JoinConfiguration, Iterable)
- TextDecoration$State decoration(TextDecoration)
- Component decoration(TextDecoration, boolean)
- Component decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- ShadowColor shadowColor()
- Component shadowColor(ARGBLike)
- StyleSetter shadowColor(ARGBLike)
- void componentBuilderApply(ComponentBuilder)
- **static** TranslatableComponent$Builder translatable()
- **static** TranslatableComponent translatable(Consumer)
- **static** TranslatableComponent translatable(String)
- **static** TranslatableComponent translatable(Translatable)
- **static** TranslatableComponent translatable(String, String)
- **static** TranslatableComponent translatable(Translatable, String)
- **static** TranslatableComponent translatable(String, Style)
- **static** TranslatableComponent translatable(Translatable, Style)
- **static** TranslatableComponent translatable(String, String, Style)
- **static** TranslatableComponent translatable(Translatable, String, Style)
- **static** TranslatableComponent translatable(String, String, StyleBuilderApplicable[])
- **static** TranslatableComponent translatable(Translatable, String, Iterable)
- **static** TranslatableComponent translatable(String, String, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, String, ComponentLike[])
- **static** TranslatableComponent translatable(String, String, Style, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, String, Style, ComponentLike[])
- **static** TranslatableComponent translatable(String, String, Style, List)
- **static** TranslatableComponent translatable(Translatable, String, Style, List)
- **static** TranslatableComponent translatable(String, String, List, Iterable)
- **static** TranslatableComponent translatable(Translatable, String, List, Iterable)
- **static** TranslatableComponent translatable(String, String, List, StyleBuilderApplicable[])
- **static** TranslatableComponent translatable(Translatable, String, List, StyleBuilderApplicable[])
- **static** TranslatableComponent translatable(String, TextColor)
- **static** TranslatableComponent translatable(Translatable, TextColor)
- **static** TranslatableComponent translatable(String, TextColor, TextDecoration[])
- **static** TranslatableComponent translatable(Translatable, TextColor, TextDecoration[])
- **static** TranslatableComponent translatable(String, TextColor, Set)
- **static** TranslatableComponent translatable(Translatable, TextColor, Set)
- **static** TranslatableComponent translatable(String, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, ComponentLike[])
- **static** TranslatableComponent translatable(String, Style, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, Style, ComponentLike[])
- **static** TranslatableComponent translatable(String, TextColor, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, TextColor, ComponentLike[])
- **static** TranslatableComponent translatable(String, TextColor, Set, ComponentLike[])
- **static** TranslatableComponent translatable(Translatable, TextColor, Set, ComponentLike[])
- **static** TranslatableComponent translatable(String, List)
- **static** TranslatableComponent translatable(Translatable, List)
- **static** TranslatableComponent translatable(String, Style, List)
- **static** TranslatableComponent translatable(Translatable, Style, List)
- **static** TranslatableComponent translatable(String, TextColor, List)
- **static** TranslatableComponent translatable(Translatable, TextColor, List)
- **static** TranslatableComponent translatable(String, TextColor, Set, List)
- **static** TranslatableComponent translatable(Translatable, TextColor, Set, List)
- Component replaceText(Consumer)
- Component replaceText(TextReplacementConfig)
- Component replaceText(String, ComponentLike)
- Component replaceText(Pattern, Function)
- Component replaceText(String, ComponentLike, int)
- Component replaceText(Pattern, Function, int)
- Component replaceText(String, ComponentLike, IntFunction2)
- Component replaceText(Pattern, Function, IntFunction2)
- Component appendSpace()
- Spliterator spliterator(ComponentIteratorType, ComponentIteratorFlag[])
- Spliterator spliterator(ComponentIteratorType, Set)
- boolean hasStyling()
- boolean hasDecoration(TextDecoration)
- ClickEvent clickEvent()
- Component clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- boolean contains(Component)
- boolean contains(Component, BiPredicate)
- Component applyFallbackStyle(Style)
- Component applyFallbackStyle(StyleBuilderApplicable[])
- **static** KeybindComponent$Builder keybind()
- **static** KeybindComponent keybind(Consumer)
- **static** KeybindComponent keybind(String)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike)
- **static** KeybindComponent keybind(String, Style)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, Style)
- **static** KeybindComponent keybind(String, TextColor)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor)
- **static** KeybindComponent keybind(String, TextColor, TextDecoration[])
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor, TextDecoration[])
- **static** KeybindComponent keybind(String, TextColor, Set)
- **static** KeybindComponent keybind(KeybindComponent$KeybindLike, TextColor, Set)
- **static** Collector toComponent()
- **static** Collector toComponent(Component)
- String insertion()
- Component insertion(String)
- StyleSetter insertion(String)
- Style style()
- Component style(Style)
- Component style(Consumer)
- Component style(Consumer, Style$Merge$Strategy)
- Component style(Style$Builder)
- Component append(Component)
- Component append(ComponentLike)
- Component append(ComponentBuilder)
- Component append(ComponentLike[])
- Component append(List)
- Component decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- Key font()
- Component font(Key)
- StyleSetter font(Key)

### Class: net.kyori.adventure.text.ComponentApplicable
Type: Interface

Methods:
- Component componentApply(Component)

### Class: net.kyori.adventure.text.ComponentBuilder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder, net.kyori.adventure.text.ComponentBuilderApplicable, net.kyori.adventure.text.ComponentLike, net.kyori.adventure.text.format.MutableStyleSetter

Methods:
- ComponentBuilder decorate(TextDecoration)
- ComponentBuilder decorate(TextDecoration[])
- MutableStyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration)
- ComponentBuilder color(TextColor)
- StyleSetter color(TextColor)
- ComponentBuilder applicableApply(ComponentBuilderApplicable)
- ComponentBuilder resetStyle()
- ComponentBuilder decorations(Set, boolean)
- ComponentBuilder decorations(Map)
- MutableStyleSetter decorations(Set, boolean)
- MutableStyleSetter decorations(Map)
- StyleSetter decorations(Set, boolean)
- StyleSetter decorations(Map)
- Component asComponent()
- ComponentBuilder colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- ComponentBuilder hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- ComponentBuilder mapChildren(Function)
- List children()
- ComponentBuilder mergeStyle(Component)
- ComponentBuilder mergeStyle(Component, Style$Merge[])
- ComponentBuilder mergeStyle(Component, Set)
- ComponentBuilder appendNewline()
- ComponentBuilder decoration(TextDecoration, boolean)
- ComponentBuilder decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- void componentBuilderApply(ComponentBuilder)
- ComponentBuilder appendSpace()
- ComponentBuilder apply(Consumer)
- ComponentBuilder clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- BuildableComponent build()
- Object build()
- ComponentBuilder mapChildrenDeep(Function)
- ComponentBuilder insertion(String)
- StyleSetter insertion(String)
- ComponentBuilder style(Style)
- ComponentBuilder style(Consumer)
- ComponentBuilder applyDeep(Consumer)
- ComponentBuilder append(Component)
- ComponentBuilder append(ComponentLike)
- ComponentBuilder append(ComponentBuilder)
- ComponentBuilder append(Component[])
- ComponentBuilder append(ComponentLike[])
- ComponentBuilder append(Iterable)
- ComponentBuilder decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- ComponentBuilder font(Key)
- StyleSetter font(Key)

### Class: net.kyori.adventure.text.ComponentBuilderApplicable
Type: Interface

Methods:
- void componentBuilderApply(ComponentBuilder)

### Class: net.kyori.adventure.text.ComponentIteratorType
Type: Interface

Methods:
- void populate(Component, Deque, Set)

### Class: net.kyori.adventure.text.ComponentLike
Type: Interface

Methods:
- **static** Component unbox(ComponentLike)
- **static** List asComponents(List)
- **static** List asComponents(List, Predicate)
- Component asComponent()

### Class: net.kyori.adventure.text.EntityNBTComponent
Type: Interface
Implements: net.kyori.adventure.text.NBTComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String selector()
- EntityNBTComponent selector(String)
- Stream examinableProperties()

### Class: net.kyori.adventure.text.EntityNBTComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.NBTComponentBuilder

Methods:
- EntityNBTComponent$Builder selector(String)

### Class: net.kyori.adventure.text.JoinConfiguration
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable

Methods:
- **static** JoinConfiguration commas(boolean)
- Component prefix()
- Component suffix()
- **static** JoinConfiguration noSeparators()
- **static** JoinConfiguration separator(ComponentLike)
- Component separator()
- Predicate predicate()
- Function convertor()
- **static** JoinConfiguration newlines()
- Component lastSeparatorIfSerial()
- **static** JoinConfiguration spaces()
- **static** JoinConfiguration$Builder builder()
- Component lastSeparator()
- **static** JoinConfiguration separators(ComponentLike, ComponentLike)
- **static** JoinConfiguration arrayLike()
- Style parentStyle()

### Class: net.kyori.adventure.text.JoinConfiguration$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- JoinConfiguration$Builder predicate(Predicate)
- JoinConfiguration$Builder convertor(Function)
- JoinConfiguration$Builder prefix(ComponentLike)
- JoinConfiguration$Builder lastSeparatorIfSerial(ComponentLike)
- JoinConfiguration$Builder lastSeparator(ComponentLike)
- JoinConfiguration$Builder suffix(ComponentLike)
- JoinConfiguration$Builder separator(ComponentLike)
- JoinConfiguration$Builder parentStyle(Style)

### Class: net.kyori.adventure.text.KeybindComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String keybind()
- KeybindComponent keybind(String)
- KeybindComponent keybind(KeybindComponent$KeybindLike)
- Stream examinableProperties()

### Class: net.kyori.adventure.text.KeybindComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- KeybindComponent$Builder keybind(String)
- KeybindComponent$Builder keybind(KeybindComponent$KeybindLike)

### Class: net.kyori.adventure.text.KeybindComponent$KeybindLike
Type: Interface

Methods:
- String asKeybind()

### Class: net.kyori.adventure.text.NBTComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent

Methods:
- String nbtPath()
- NBTComponent nbtPath(String)
- boolean interpret()
- NBTComponent interpret(boolean)
- Stream examinableProperties()
- Component separator()
- NBTComponent separator(ComponentLike)

### Class: net.kyori.adventure.text.NBTComponentBuilder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- NBTComponentBuilder nbtPath(String)
- NBTComponentBuilder interpret(boolean)
- NBTComponentBuilder separator(ComponentLike)

### Class: net.kyori.adventure.text.ScopedComponent
Type: Interface
Implements: net.kyori.adventure.text.Component

Methods:
- Component decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- Component color(TextColor)
- StyleSetter color(TextColor)
- Component appendSpace()
- Component decorations(Map)
- StyleSetter decorations(Map)
- Component asComponent()
- Component shadowColorIfAbsent(ARGBLike)
- StyleSetter shadowColorIfAbsent(ARGBLike)
- Component colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- Component hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- Component clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- Component applyFallbackStyle(StyleBuilderApplicable[])
- Component applyFallbackStyle(Style)
- Component children(List)
- Component mergeStyle(Component)
- Component mergeStyle(Component, Style$Merge[])
- Component mergeStyle(Component, Set)
- Component appendNewline()
- Component insertion(String)
- StyleSetter insertion(String)
- Component style(Style)
- Component style(Consumer)
- Component style(Style$Builder)
- Component style(Consumer, Style$Merge$Strategy)
- Component decoration(TextDecoration, boolean)
- Component decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- Component shadowColor(ARGBLike)
- StyleSetter shadowColor(ARGBLike)
- Component append(Component)
- Component append(ComponentLike)
- Component append(ComponentBuilder)
- Component append(List)
- Component append(ComponentLike[])
- Component font(Key)
- StyleSetter font(Key)
- Component decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)

### Class: net.kyori.adventure.text.ScoreComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String name()
- ScoreComponent name(String)
- Stream examinableProperties()
- String value()
- ScoreComponent value(String)
- String objective()
- ScoreComponent objective(String)

### Class: net.kyori.adventure.text.ScoreComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- ScoreComponent$Builder name(String)
- ScoreComponent$Builder value(String)
- ScoreComponent$Builder objective(String)

### Class: net.kyori.adventure.text.SelectorComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- String pattern()
- SelectorComponent pattern(String)
- Stream examinableProperties()
- Component separator()
- SelectorComponent separator(ComponentLike)

### Class: net.kyori.adventure.text.SelectorComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- SelectorComponent$Builder pattern(String)
- SelectorComponent$Builder separator(ComponentLike)

### Class: net.kyori.adventure.text.StorageNBTComponent
Type: Interface
Implements: net.kyori.adventure.text.NBTComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- Stream examinableProperties()
- Key storage()
- StorageNBTComponent storage(Key)

### Class: net.kyori.adventure.text.StorageNBTComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.NBTComponentBuilder

Methods:
- StorageNBTComponent$Builder storage(Key)

### Class: net.kyori.adventure.text.TextComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- **static** TextComponent ofChildren(ComponentLike[])
- Stream examinableProperties()
- String content()
- TextComponent content(String)

### Class: net.kyori.adventure.text.TextComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- String content()
- TextComponent$Builder content(String)

### Class: net.kyori.adventure.text.TextReplacementConfig
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable

Methods:
- **static** TextReplacementConfig$Builder builder()
- Pattern matchPattern()

### Class: net.kyori.adventure.text.TextReplacementConfig$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- TextReplacementConfig$Builder condition(IntFunction2)
- TextReplacementConfig$Builder condition(TextReplacementConfig$Condition)
- TextReplacementConfig$Builder times(int)
- TextReplacementConfig$Builder once()
- TextReplacementConfig$Builder matchLiteral(String)
- TextReplacementConfig$Builder match(String)
- TextReplacementConfig$Builder match(Pattern)
- TextReplacementConfig$Builder replacement(String)
- TextReplacementConfig$Builder replacement(ComponentLike)
- TextReplacementConfig$Builder replacement(Function)
- TextReplacementConfig$Builder replacement(BiFunction)
- TextReplacementConfig$Builder replaceInsideHoverEvents(boolean)

### Class: net.kyori.adventure.text.TextReplacementConfig$Condition
Type: Interface

Methods:
- PatternReplacementResult shouldReplace(MatchResult, int, int)

### Class: net.kyori.adventure.text.TranslatableComponent
Type: Interface
Implements: net.kyori.adventure.text.BuildableComponent, net.kyori.adventure.text.ScopedComponent

Methods:
- List args()
- TranslatableComponent args(ComponentLike[])
- TranslatableComponent args(List)
- List arguments()
- TranslatableComponent arguments(ComponentLike[])
- TranslatableComponent arguments(List)
- Stream examinableProperties()
- String fallback()
- TranslatableComponent fallback(String)
- String key()
- TranslatableComponent key(Translatable)
- TranslatableComponent key(String)

### Class: net.kyori.adventure.text.TranslatableComponent$Builder
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilder

Methods:
- TranslatableComponent$Builder args(ComponentBuilder)
- TranslatableComponent$Builder args(ComponentBuilder[])
- TranslatableComponent$Builder args(Component)
- TranslatableComponent$Builder args(ComponentLike[])
- TranslatableComponent$Builder args(List)
- TranslatableComponent$Builder arguments(ComponentLike[])
- TranslatableComponent$Builder arguments(List)
- TranslatableComponent$Builder fallback(String)
- TranslatableComponent$Builder key(Translatable)
- TranslatableComponent$Builder key(String)

### Class: net.kyori.adventure.text.TranslationArgument
Type: Interface
Implements: net.kyori.adventure.text.TranslationArgumentLike, net.kyori.examination.Examinable

Methods:
- TranslationArgument asTranslationArgument()
- **static** TranslationArgument component(ComponentLike)
- **static** TranslationArgument bool(boolean)
- **static** TranslationArgument numeric(Number)
- Object value()

### Class: net.kyori.adventure.text.TranslationArgumentLike
Type: Interface
Implements: net.kyori.adventure.text.ComponentLike

Methods:
- TranslationArgument asTranslationArgument()
- Component asComponent()

### Class: net.kyori.adventure.text.VirtualComponent
Type: Interface
Implements: net.kyori.adventure.text.TextComponent

Methods:
- VirtualComponentRenderer renderer()
- Class contextType()

### Class: net.kyori.adventure.text.VirtualComponentRenderer
Type: Interface

Methods:
- ComponentLike apply(Object)
- String fallbackString()

### Class: net.kyori.adventure.text.AbstractComponent
Type: Abstract Class
Implements: net.kyori.adventure.text.Component

Methods:
- List children()
- int hashCode()
- boolean equals(Object)
- String toString()
- Style style()

### Class: net.kyori.adventure.text.BlockNBTComponent$WorldPos$Coordinate$Type
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** BlockNBTComponent$WorldPos$Coordinate$Type valueOf(String)
- **static** BlockNBTComponent$WorldPos$Coordinate$Type[] values()

### Class: net.kyori.adventure.text.ComponentIteratorFlag
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ComponentIteratorFlag valueOf(String)
- **static** ComponentIteratorFlag[] values()

### Class: net.kyori.adventure.text.LinearComponents
Type: Class

Methods:
- **static** Component linear(ComponentBuilderApplicable[])

### Class: net.kyori.adventure.text.PatternReplacementResult
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PatternReplacementResult valueOf(String)
- **static** PatternReplacementResult[] values()

## Package: net.kyori.adventure.text.event

### Class: net.kyori.adventure.text.event.ClickCallback
Type: Interface

Methods:
- ClickCallback filter(Predicate)
- ClickCallback filter(Predicate, Consumer)
- ClickCallback requiringPermission(String)
- ClickCallback requiringPermission(String, Consumer)
- **static** ClickCallback widen(ClickCallback, Class, Consumer)
- **static** ClickCallback widen(ClickCallback, Class)
- void accept(Audience)

### Class: net.kyori.adventure.text.event.ClickCallback$Options
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- Duration lifetime()
- **static** ClickCallback$Options$Builder builder()
- **static** ClickCallback$Options$Builder builder(ClickCallback$Options)
- int uses()

### Class: net.kyori.adventure.text.event.ClickCallback$Options$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder

Methods:
- ClickCallback$Options$Builder lifetime(TemporalAmount)
- ClickCallback$Options$Builder uses(int)

### Class: net.kyori.adventure.text.event.ClickCallback$Provider
Type: Interface

Methods:
- ClickEvent create(ClickCallback, ClickCallback$Options)

### Class: net.kyori.adventure.text.event.ClickEvent$Payload
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** ClickEvent$Payload$Dialog dialog(DialogLike)
- **static** ClickEvent$Payload$Text string(String)
- **static** ClickEvent$Payload$Custom custom(Key, String)
- **static** ClickEvent$Payload$Custom custom(Key, BinaryTagHolder)
- **static** ClickEvent$Payload$Int integer(int)

### Class: net.kyori.adventure.text.event.ClickEvent$Payload$Custom
Type: Interface
Implements: net.kyori.adventure.text.event.ClickEvent$Payload, net.kyori.adventure.key.Keyed

Methods:
- BinaryTagHolder nbt()
- String data()

### Class: net.kyori.adventure.text.event.ClickEvent$Payload$Dialog
Type: Interface
Implements: net.kyori.adventure.text.event.ClickEvent$Payload

Methods:
- DialogLike dialog()

### Class: net.kyori.adventure.text.event.ClickEvent$Payload$Int
Type: Interface
Implements: net.kyori.adventure.text.event.ClickEvent$Payload

Methods:
- int integer()

### Class: net.kyori.adventure.text.event.ClickEvent$Payload$Text
Type: Interface
Implements: net.kyori.adventure.text.event.ClickEvent$Payload

Methods:
- String value()

### Class: net.kyori.adventure.text.event.DataComponentValue
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** DataComponentValue$Removed removed()

### Class: net.kyori.adventure.text.event.DataComponentValue$Removed
Type: Interface
Implements: net.kyori.adventure.text.event.DataComponentValue

No public methods found

### Class: net.kyori.adventure.text.event.DataComponentValue$TagSerializable
Type: Interface
Implements: net.kyori.adventure.text.event.DataComponentValue

Methods:
- BinaryTagHolder asBinaryTag()

### Class: net.kyori.adventure.text.event.DataComponentValueConverterRegistry$Conversion
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- Class destination()
- Class source()
- **static** DataComponentValueConverterRegistry$Conversion convert(Class, Class, BiFunction)
- Object convert(Key, Object)

### Class: net.kyori.adventure.text.event.DataComponentValueConverterRegistry$Provider
Type: Interface

Methods:
- Iterable conversions()
- Key id()

### Class: net.kyori.adventure.text.event.HoverEventSource
Type: Interface

Methods:
- **static** HoverEvent unbox(HoverEventSource)
- HoverEvent asHoverEvent()
- HoverEvent asHoverEvent(UnaryOperator)

### Class: net.kyori.adventure.text.event.ClickEvent
Type: Class
Implements: net.kyori.examination.Examinable, net.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- **static** ClickEvent openFile(String)
- **static** ClickEvent custom(Key, String)
- **static** ClickEvent custom(Key, BinaryTagHolder)
- void styleApply(Style$Builder)
- **static** ClickEvent openUrl(String)
- **static** ClickEvent openUrl(URL)
- **static** ClickEvent clickEvent(ClickEvent$Action, String)
- **static** ClickEvent showDialog(DialogLike)
- **static** ClickEvent changePage(String)
- **static** ClickEvent changePage(int)
- ClickEvent$Payload payload()
- int hashCode()
- boolean equals(Object)
- **static** ClickEvent suggestCommand(String)
- ClickEvent$Action action()
- **static** ClickEvent callback(ClickCallback)
- **static** ClickEvent callback(ClickCallback, ClickCallback$Options)
- **static** ClickEvent callback(ClickCallback, Consumer)
- **static** ClickEvent copyToClipboard(String)
- String toString()
- **static** ClickEvent runCommand(String)
- Stream examinableProperties()
- String value()

### Class: net.kyori.adventure.text.event.ClickEvent$Action
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean readable()
- Class payloadType()
- **static** ClickEvent$Action valueOf(String)
- **static** ClickEvent$Action[] values()
- boolean supports(ClickEvent$Payload)
- String toString()

### Class: net.kyori.adventure.text.event.DataComponentValueConverterRegistry
Type: Class

Methods:
- **static** DataComponentValue convert(Class, Key, DataComponentValue)
- **static** Set knownProviders()

### Class: net.kyori.adventure.text.event.HoverEvent
Type: Class
Implements: net.kyori.examination.Examinable, net.kyori.adventure.text.event.HoverEventSource, net.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- **static** HoverEvent showText(ComponentLike)
- **static** HoverEvent showText(Component)
- HoverEvent withRenderedValue(ComponentRenderer, Object)
- void styleApply(Style$Builder)
- **static** HoverEvent hoverEvent(HoverEvent$Action, Object)
- **static** HoverEvent showAchievement(String)
- **static** HoverEvent showEntity(Key, UUID)
- **static** HoverEvent showEntity(Keyed, UUID)
- **static** HoverEvent showEntity(Key, UUID, Component)
- **static** HoverEvent showEntity(Keyed, UUID, Component)
- **static** HoverEvent showEntity(HoverEvent$ShowEntity)
- int hashCode()
- boolean equals(Object)
- HoverEvent$Action action()
- **static** HoverEvent showItem(Key, int)
- **static** HoverEvent showItem(Keyed, int)
- **static** HoverEvent showItem(Key, int, BinaryTagHolder)
- **static** HoverEvent showItem(Keyed, int, BinaryTagHolder)
- **static** HoverEvent showItem(Keyed, int, Map)
- **static** HoverEvent showItem(HoverEvent$ShowItem)
- String toString()
- Stream examinableProperties()
- HoverEvent asHoverEvent()
- HoverEvent asHoverEvent(UnaryOperator)
- Object value()
- HoverEvent value(Object)

### Class: net.kyori.adventure.text.event.HoverEvent$Action
Type: Class

Methods:
- boolean readable()
- String toString()
- Class type()

### Class: net.kyori.adventure.text.event.HoverEvent$ShowEntity
Type: Class
Implements: net.kyori.examination.Examinable

Methods:
- **static** HoverEvent$ShowEntity showEntity(Key, UUID)
- **static** HoverEvent$ShowEntity showEntity(Keyed, UUID)
- **static** HoverEvent$ShowEntity showEntity(Key, UUID, Component)
- **static** HoverEvent$ShowEntity showEntity(Keyed, UUID, Component)
- int hashCode()
- boolean equals(Object)
- **static** HoverEvent$ShowEntity of(Key, UUID)
- **static** HoverEvent$ShowEntity of(Keyed, UUID)
- **static** HoverEvent$ShowEntity of(Key, UUID, Component)
- **static** HoverEvent$ShowEntity of(Keyed, UUID, Component)
- Component name()
- HoverEvent$ShowEntity name(Component)
- String toString()
- Stream examinableProperties()
- UUID id()
- HoverEvent$ShowEntity id(UUID)
- Key type()
- HoverEvent$ShowEntity type(Key)
- HoverEvent$ShowEntity type(Keyed)

### Class: net.kyori.adventure.text.event.HoverEvent$ShowItem
Type: Class
Implements: net.kyori.examination.Examinable

Methods:
- BinaryTagHolder nbt()
- HoverEvent$ShowItem nbt(BinaryTagHolder)
- Key item()
- HoverEvent$ShowItem item(Key)
- Map dataComponents()
- HoverEvent$ShowItem dataComponents(Map)
- int hashCode()
- boolean equals(Object)
- **static** HoverEvent$ShowItem of(Key, int)
- **static** HoverEvent$ShowItem of(Keyed, int)
- **static** HoverEvent$ShowItem of(Key, int, BinaryTagHolder)
- **static** HoverEvent$ShowItem of(Keyed, int, BinaryTagHolder)
- int count()
- HoverEvent$ShowItem count(int)
- **static** HoverEvent$ShowItem showItem(Key, int)
- **static** HoverEvent$ShowItem showItem(Keyed, int)
- **static** HoverEvent$ShowItem showItem(Key, int, BinaryTagHolder)
- **static** HoverEvent$ShowItem showItem(Keyed, int, BinaryTagHolder)
- **static** HoverEvent$ShowItem showItem(Keyed, int, Map)
- String toString()
- Stream examinableProperties()
- Map dataComponentsAs(Class)

## Package: net.kyori.adventure.text.flattener

### Class: net.kyori.adventure.text.flattener.ComponentFlattener
Type: Interface
Implements: net.kyori.adventure.util.Buildable

Methods:
- void flatten(Component, FlattenerListener)
- **static** ComponentFlattener textOnly()
- **static** ComponentFlattener$Builder builder()
- **static** ComponentFlattener basic()

### Class: net.kyori.adventure.text.flattener.ComponentFlattener$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder

Methods:
- ComponentFlattener$Builder complexMapper(Class, BiConsumer)
- ComponentFlattener$Builder unknownMapper(Function)
- ComponentFlattener$Builder mapper(Class, Function)
- ComponentFlattener$Builder nestingLimit(int)

### Class: net.kyori.adventure.text.flattener.FlattenerListener
Type: Interface

Methods:
- boolean shouldContinue()
- void pushStyle(Style)
- void component(String)
- void popStyle(Style)

## Package: net.kyori.adventure.text.format

### Class: net.kyori.adventure.text.format.MutableStyleSetter
Type: Interface
Implements: net.kyori.adventure.text.format.StyleSetter

Methods:
- MutableStyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration[])
- MutableStyleSetter decorations(Map)
- MutableStyleSetter decorations(Set, boolean)
- StyleSetter decorations(Set, boolean)
- StyleSetter decorations(Map)

### Class: net.kyori.adventure.text.format.ShadowColor
Type: Interface
Implements: net.kyori.adventure.text.format.StyleBuilderApplicable, net.kyori.adventure.util.ARGBLike

Methods:
- int red()
- int green()
- int blue()
- **static** ShadowColor lerp(float, ARGBLike, ARGBLike)
- int alpha()
- **static** ShadowColor fromHexString(String)
- String asHexString()
- **static** ShadowColor none()
- void styleApply(Style$Builder)
- int value()
- **static** ShadowColor shadowColor(int)
- **static** ShadowColor shadowColor(int, int, int, int)
- **static** ShadowColor shadowColor(RGBLike, int)
- **static** ShadowColor shadowColor(ARGBLike)

### Class: net.kyori.adventure.text.format.Style
Type: Interface
Implements: net.kyori.adventure.util.Buildable, net.kyori.examination.Examinable, net.kyori.adventure.text.format.StyleGetter, net.kyori.adventure.text.format.StyleSetter

Methods:
- Style$Builder toBuilder()
- Buildable$Builder toBuilder()
- Style decorate(TextDecoration)
- StyleSetter decorate(TextDecoration)
- Style unmerge(Style)
- TextColor color()
- Style color(TextColor)
- StyleSetter color(TextColor)
- Style edit(Consumer)
- Style edit(Consumer, Style$Merge$Strategy)
- boolean isEmpty()
- Map decorations()
- Style decorations(Map)
- StyleSetter decorations(Map)
- boolean hasDecoration(TextDecoration)
- Style colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- **static** Style empty()
- HoverEvent hoverEvent()
- Style hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- ClickEvent clickEvent()
- Style clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- Style merge(Style)
- Style merge(Style, Style$Merge$Strategy)
- Style merge(Style, Style$Merge)
- Style merge(Style, Style$Merge$Strategy, Style$Merge)
- Style merge(Style, Style$Merge[])
- Style merge(Style, Style$Merge$Strategy, Style$Merge[])
- Style merge(Style, Set)
- Style merge(Style, Style$Merge$Strategy, Set)
- String insertion()
- Style insertion(String)
- StyleSetter insertion(String)
- **static** Style$Builder style()
- **static** Style style(Consumer)
- **static** Style style(TextColor)
- **static** Style style(TextDecoration)
- **static** Style style(TextColor, TextDecoration[])
- **static** Style style(TextColor, Set)
- **static** Style style(StyleBuilderApplicable[])
- **static** Style style(Iterable)
- TextDecoration$State decoration(TextDecoration)
- Style decoration(TextDecoration, boolean)
- Style decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- Style decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- Key font()
- Style font(Key)
- StyleSetter font(Key)

### Class: net.kyori.adventure.text.format.Style$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder, net.kyori.adventure.util.Buildable$Builder, net.kyori.adventure.text.format.MutableStyleSetter

Methods:
- Style$Builder decorate(TextDecoration)
- Style$Builder decorate(TextDecoration[])
- MutableStyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration[])
- StyleSetter decorate(TextDecoration)
- Style$Builder color(TextColor)
- StyleSetter color(TextColor)
- Style$Builder apply(StyleBuilderApplicable)
- Style$Builder decorations(Map)
- MutableStyleSetter decorations(Map)
- StyleSetter decorations(Map)
- Style$Builder colorIfAbsent(TextColor)
- StyleSetter colorIfAbsent(TextColor)
- Style$Builder hoverEvent(HoverEventSource)
- StyleSetter hoverEvent(HoverEventSource)
- Style$Builder clickEvent(ClickEvent)
- StyleSetter clickEvent(ClickEvent)
- Style build()
- Object build()
- Style$Builder merge(Style)
- Style$Builder merge(Style, Style$Merge$Strategy)
- Style$Builder merge(Style, Style$Merge[])
- Style$Builder merge(Style, Style$Merge$Strategy, Style$Merge[])
- Style$Builder merge(Style, Set)
- Style$Builder merge(Style, Style$Merge$Strategy, Set)
- Style$Builder insertion(String)
- StyleSetter insertion(String)
- Style$Builder decoration(TextDecoration, boolean)
- Style$Builder decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter decoration(TextDecoration, boolean)
- Style$Builder decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- Style$Builder font(Key)
- StyleSetter font(Key)

### Class: net.kyori.adventure.text.format.StyleBuilderApplicable
Type: Interface
Implements: net.kyori.adventure.text.ComponentBuilderApplicable

Methods:
- void styleApply(Style$Builder)
- void componentBuilderApply(ComponentBuilder)

### Class: net.kyori.adventure.text.format.StyleGetter
Type: Interface

Methods:
- HoverEvent hoverEvent()
- ClickEvent clickEvent()
- TextColor color()
- String insertion()
- Map decorations()
- boolean hasDecoration(TextDecoration)
- TextDecoration$State decoration(TextDecoration)
- ShadowColor shadowColor()
- Key font()

### Class: net.kyori.adventure.text.format.StyleSetter
Type: Interface

Methods:
- StyleSetter hoverEvent(HoverEventSource)
- StyleSetter clickEvent(ClickEvent)
- StyleSetter decorate(TextDecoration)
- StyleSetter decorate(TextDecoration[])
- StyleSetter color(TextColor)
- StyleSetter insertion(String)
- StyleSetter decorations(Map)
- StyleSetter decorations(Set, boolean)
- StyleSetter decoration(TextDecoration, boolean)
- StyleSetter decoration(TextDecoration, TextDecoration$State)
- StyleSetter shadowColor(ARGBLike)
- StyleSetter decorationIfAbsent(TextDecoration, TextDecoration$State)
- StyleSetter shadowColorIfAbsent(ARGBLike)
- StyleSetter colorIfAbsent(TextColor)
- StyleSetter font(Key)

### Class: net.kyori.adventure.text.format.TextColor
Type: Interface
Implements: java.lang.Comparable, net.kyori.examination.Examinable, net.kyori.adventure.util.RGBLike, net.kyori.adventure.text.format.StyleBuilderApplicable, net.kyori.adventure.text.format.TextFormat

Methods:
- int green()
- **static** TextColor fromCSSHexString(String)
- **static** TextColor color(int)
- **static** TextColor color(RGBLike)
- **static** TextColor color(HSVLike)
- **static** TextColor color(int, int, int)
- **static** TextColor color(float, float, float)
- **static** TextColor lerp(float, RGBLike, RGBLike)
- int compareTo(TextColor)
- int compareTo(Object)
- void styleApply(Style$Builder)
- int red()
- int blue()
- **static** TextColor nearestColorTo(List, TextColor)
- **static** TextColor fromHexString(String)
- Stream examinableProperties()
- String asHexString()
- int value()

### Class: net.kyori.adventure.text.format.TextDecorationAndState
Type: Interface
Implements: net.kyori.examination.Examinable, net.kyori.adventure.text.format.StyleBuilderApplicable

Methods:
- Stream examinableProperties()
- TextDecoration$State state()
- void styleApply(Style$Builder)
- TextDecoration decoration()

### Class: net.kyori.adventure.text.format.TextFormat
Type: Interface

No public methods found

### Class: net.kyori.adventure.text.format.NamedTextColor
Type: Class
Implements: net.kyori.adventure.text.format.TextColor

Methods:
- **static** NamedTextColor nearestTo(TextColor)
- **static** NamedTextColor namedColor(int)
- HSVLike asHSV()
- String toString()
- Stream examinableProperties()
- int value()
- **static** NamedTextColor ofExact(int)

### Class: net.kyori.adventure.text.format.Style$Merge
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Set all()
- **static** Style$Merge valueOf(String)
- **static** Set of(Style$Merge[])
- **static** Style$Merge[] values()
- **static** Set colorAndDecorations()
- **static** Set merges(Style$Merge[])

### Class: net.kyori.adventure.text.format.Style$Merge$Strategy
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** Style$Merge$Strategy valueOf(String)
- **static** Style$Merge$Strategy[] values()

### Class: net.kyori.adventure.text.format.TextDecoration
Type: Enum
Extends: java.lang.Enum
Implements: net.kyori.adventure.text.format.StyleBuilderApplicable, net.kyori.adventure.text.format.TextFormat

Methods:
- TextDecorationAndState as(boolean)
- TextDecorationAndState as(TextDecoration$State)
- TextDecorationAndState withState(boolean)
- TextDecorationAndState withState(TextDecoration$State)
- TextDecorationAndState withState(TriState)
- **static** TextDecoration valueOf(String)
- **static** TextDecoration[] values()
- String toString()
- void styleApply(Style$Builder)

### Class: net.kyori.adventure.text.format.TextDecoration$State
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** TextDecoration$State byBoolean(boolean)
- **static** TextDecoration$State byBoolean(Boolean)
- **static** TextDecoration$State valueOf(String)
- **static** TextDecoration$State[] values()
- String toString()
- **static** TextDecoration$State byTriState(TriState)

## Package: net.kyori.adventure.text.renderer

### Class: net.kyori.adventure.text.renderer.ComponentRenderer
Type: Interface

Methods:
- ComponentRenderer mapContext(Function)
- Component render(Component, Object)

### Class: net.kyori.adventure.text.renderer.AbstractComponentRenderer
Type: Abstract Class
Implements: net.kyori.adventure.text.renderer.ComponentRenderer

Methods:
- Component render(Component, Object)

### Class: net.kyori.adventure.text.renderer.TranslatableComponentRenderer
Type: Abstract Class
Extends: net.kyori.adventure.text.renderer.AbstractComponentRenderer

Methods:
- **static** TranslatableComponentRenderer usingTranslationSource(Translator)

## Package: net.kyori.adventure.title

### Class: net.kyori.adventure.title.Title
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- Title$Times times()
- Object part(TitlePart)
- Component subtitle()
- **static** Title title(Component, Component)
- **static** Title title(Component, Component, Title$Times)
- Component title()

### Class: net.kyori.adventure.title.Title$Times
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** Title$Times times(Duration, Duration, Duration)
- Duration fadeOut()
- Duration fadeIn()
- **static** Title$Times of(Duration, Duration, Duration)
- Duration stay()

### Class: net.kyori.adventure.title.TitlePart
Type: Interface

No public methods found

## Package: net.kyori.adventure.translation

### Class: net.kyori.adventure.translation.GlobalTranslator
Type: Interface
Implements: net.kyori.adventure.translation.Translator, net.kyori.examination.Examinable

Methods:
- **static** TranslatableComponentRenderer renderer()
- boolean removeSource(Translator)
- boolean addSource(Translator)
- Iterable sources()
- **static** GlobalTranslator get()
- **static** GlobalTranslator translator()
- **static** Component render(Component, Locale)

### Class: net.kyori.adventure.translation.Translatable
Type: Interface

Methods:
- String translationKey()

### Class: net.kyori.adventure.translation.TranslationRegistry
Type: Interface
Implements: net.kyori.adventure.translation.Translator, net.kyori.adventure.translation.TranslationStore$StringBased

Methods:
- void defaultLocale(Locale)
- boolean contains(String)
- void registerAll(Locale, Map)
- void registerAll(Locale, Path, boolean)
- void registerAll(Locale, ResourceBundle, boolean)
- void registerAll(Locale, Set, Function)
- void unregister(String)
- **static** TranslationRegistry create(Key)
- MessageFormat translate(String, Locale)
- void register(String, Locale, MessageFormat)
- void register(String, Locale, Object)

### Class: net.kyori.adventure.translation.TranslationStore
Type: Interface
Implements: net.kyori.adventure.translation.Translator

Methods:
- void defaultLocale(Locale)
- boolean canTranslate(String, Locale)
- boolean contains(String)
- boolean contains(String, Locale)
- **static** TranslationStore component(Key)
- **static** TranslationStore$StringBased messageFormat(Key)
- void registerAll(Locale, Map)
- void registerAll(Locale, Set, Function)
- void unregister(String)
- void register(String, Locale, Object)

### Class: net.kyori.adventure.translation.TranslationStore$StringBased
Type: Interface
Implements: net.kyori.adventure.translation.TranslationStore

Methods:
- void registerAll(Locale, Path, boolean)
- void registerAll(Locale, ResourceBundle, boolean)

### Class: net.kyori.adventure.translation.Translator
Type: Interface

Methods:
- boolean canTranslate(String, Locale)
- Key name()
- TriState hasAnyTranslations()
- MessageFormat translate(String, Locale)
- Component translate(TranslatableComponent, Locale)
- **static** Locale parseLocale(String)

### Class: net.kyori.adventure.translation.AbstractTranslationStore
Type: Abstract Class
Implements: net.kyori.examination.Examinable, net.kyori.adventure.translation.TranslationStore

Methods:
- void defaultLocale(Locale)
- boolean canTranslate(String, Locale)
- boolean contains(String)
- boolean contains(String, Locale)
- int hashCode()
- void registerAll(Locale, Map)
- void registerAll(Locale, Set, Function)
- boolean equals(Object)
- Key name()
- void unregister(String)
- String toString()
- Stream examinableProperties()
- TriState hasAnyTranslations()
- void register(String, Locale, Object)

### Class: net.kyori.adventure.translation.AbstractTranslationStore$StringBased
Type: Abstract Class
Extends: net.kyori.adventure.translation.AbstractTranslationStore
Implements: net.kyori.adventure.translation.TranslationStore$StringBased

Methods:
- void registerAll(Locale, Path, boolean)
- void registerAll(Locale, ResourceBundle, boolean)

## Package: net.kyori.adventure.util

### Class: net.kyori.adventure.util.ARGBLike
Type: Interface
Implements: net.kyori.adventure.util.RGBLike

Methods:
- int alpha()

### Class: net.kyori.adventure.util.Buildable
Type: Interface

Methods:
- Buildable$Builder toBuilder()
- **static** Buildable configureAndBuild(Buildable$Builder, Consumer)

### Class: net.kyori.adventure.util.Buildable$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder

Methods:
- Object build()

### Class: net.kyori.adventure.util.Codec
Type: Interface

Methods:
- Object encode(Object) throws Throwable
- **static** Codec codec(Codec$Decoder, Codec$Encoder)
- **static** Codec of(Codec$Decoder, Codec$Encoder)
- Object decode(Object) throws Throwable

### Class: net.kyori.adventure.util.Codec$Decoder
Type: Interface

Methods:
- Object decode(Object) throws Throwable

### Class: net.kyori.adventure.util.Codec$Encoder
Type: Interface

Methods:
- Object encode(Object) throws Throwable

### Class: net.kyori.adventure.util.ComponentMessageThrowable
Type: Interface

Methods:
- **static** Component getMessage(Throwable)
- **static** Component getOrConvertMessage(Throwable)
- Component componentMessage()

### Class: net.kyori.adventure.util.HSVLike
Type: Interface
Implements: net.kyori.examination.Examinable

Methods:
- **static** HSVLike fromRGB(int, int, int)
- float s()
- float v()
- **static** HSVLike of(float, float, float)
- float h()
- **static** HSVLike hsvLike(float, float, float)
- Stream examinableProperties()

### Class: net.kyori.adventure.util.InheritanceAwareMap
Type: Interface

Methods:
- InheritanceAwareMap with(Class, Object)
- boolean containsKey(Class)
- Object get(Class)
- **static** InheritanceAwareMap$Builder builder()
- **static** InheritanceAwareMap$Builder builder(InheritanceAwareMap)
- InheritanceAwareMap without(Class)
- **static** InheritanceAwareMap empty()

### Class: net.kyori.adventure.util.InheritanceAwareMap$Builder
Type: Interface
Implements: net.kyori.adventure.builder.AbstractBuilder

Methods:
- InheritanceAwareMap$Builder putAll(InheritanceAwareMap)
- InheritanceAwareMap$Builder strict(boolean)
- InheritanceAwareMap$Builder remove(Class)
- InheritanceAwareMap$Builder put(Class, Object)

### Class: net.kyori.adventure.util.IntFunction2
Type: Interface

Methods:
- Object apply(int, int)

### Class: net.kyori.adventure.util.PlatformAPI
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: net.kyori.adventure.util.RGBLike
Type: Interface

Methods:
- int red()
- int green()
- int blue()
- HSVLike asHSV()

### Class: net.kyori.adventure.util.Services$Fallback
Type: Interface

No public methods found

### Class: net.kyori.adventure.util.Ticks
Type: Interface

Methods:
- **static** Duration duration(long)

### Class: net.kyori.adventure.util.ForwardingIterator
Type: Class
Implements: java.lang.Iterable

Methods:
- Iterator iterator()
- Spliterator spliterator()

### Class: net.kyori.adventure.util.Index
Type: Class

Methods:
- Object keyOr(Object, Object)
- Object keyOrThrow(Object)
- Set keys()
- Set values()
- Map keyToValue()
- **static** Index create(Class, Function)
- **static** Index create(Class, Function, Enum[])
- **static** Index create(Function, Object[])
- **static** Index create(Function, List)
- Object valueOr(Object, Object)
- Object valueOrThrow(Object)
- Object value(Object)
- Object key(Object)
- Map valueToKey()

### Class: net.kyori.adventure.util.Listenable
Type: Abstract Class

No public methods found

### Class: net.kyori.adventure.util.MonkeyBars
Type: Class

Methods:
- **static** List addOne(List, Object)
- **static** List toUnmodifiableList(Function, Iterable)
- **static** List nonEmptyArrayToList(Function, Object, Object[])
- **static** Set enumSet(Class, Enum[])

### Class: net.kyori.adventure.util.Nag
Type: Abstract Class
Extends: java.lang.RuntimeException

Methods:
- **static** void print(Nag)

### Class: net.kyori.adventure.util.Services
Type: Class

Methods:
- **static** Optional serviceWithFallback(Class)
- **static** Optional service(Class)
- **static** Set services(Class)

### Class: net.kyori.adventure.util.ShadyPines
Type: Class

Methods:
- **static** boolean equals(double, double)
- **static** boolean equals(float, float)
- **static** Set enumSet(Class, Enum[])

### Class: net.kyori.adventure.util.TriState
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean toBooleanOrElseGet(BooleanSupplier)
- **static** TriState byBoolean(boolean)
- **static** TriState byBoolean(Boolean)
- Boolean toBoolean()
- boolean toBooleanOrElse(boolean)
- **static** TriState valueOf(String)
- **static** TriState[] values()

### Class: net.kyori.adventure.util.UTF8ResourceBundleControl
Type: Class
Extends: java.util.ResourceBundle$Control

Methods:
- **static** ResourceBundle$Control get()
- ResourceBundle newBundle(String, Locale, String, ClassLoader, boolean) throws IllegalAccessException, InstantiationException, IOException

## Package: net.kyori.examination

### Class: net.kyori.examination.Examinable
Type: Interface

Methods:
- Object examine(Examiner)
- Stream examinableProperties()
- String examinableName()

### Class: net.kyori.examination.Examiner
Type: Interface

Methods:
- Object examine(Examinable)
- Object examine(String, Stream)
- Object examine(Object)
- Object examine(boolean)
- Object examine(boolean[])
- Object examine(byte)
- Object examine(byte[])
- Object examine(char)
- Object examine(char[])
- Object examine(double)
- Object examine(double[])
- Object examine(float)
- Object examine(float[])
- Object examine(int)
- Object examine(int[])
- Object examine(long)
- Object examine(long[])
- Object examine(short)
- Object examine(short[])
- Object examine(String)

### Class: net.kyori.examination.AbstractExaminer
Type: Abstract Class
Implements: net.kyori.examination.Examiner

Methods:
- Object examine(Object)
- Object examine(String, Stream)
- Object examine(boolean[])
- Object examine(byte[])
- Object examine(char[])
- Object examine(double[])
- Object examine(float[])
- Object examine(int[])
- Object examine(long[])
- Object examine(short[])

### Class: net.kyori.examination.ExaminableProperty
Type: Abstract Class

Methods:
- Object examine(Examiner)
- **static** ExaminableProperty of(String, Object)
- **static** ExaminableProperty of(String, String)
- **static** ExaminableProperty of(String, boolean)
- **static** ExaminableProperty of(String, boolean[])
- **static** ExaminableProperty of(String, byte)
- **static** ExaminableProperty of(String, byte[])
- **static** ExaminableProperty of(String, char)
- **static** ExaminableProperty of(String, char[])
- **static** ExaminableProperty of(String, double)
- **static** ExaminableProperty of(String, double[])
- **static** ExaminableProperty of(String, float)
- **static** ExaminableProperty of(String, float[])
- **static** ExaminableProperty of(String, int)
- **static** ExaminableProperty of(String, int[])
- **static** ExaminableProperty of(String, long)
- **static** ExaminableProperty of(String, long[])
- **static** ExaminableProperty of(String, short)
- **static** ExaminableProperty of(String, short[])
- String name()
- String toString()

## Package: net.kyori.examination.string

### Class: net.kyori.examination.string.MultiLineStringExaminer
Type: Class
Extends: net.kyori.examination.AbstractExaminer

Methods:
- Stream examine(boolean)
- Stream examine(byte)
- Stream examine(char)
- Stream examine(double)
- Stream examine(float)
- Stream examine(int)
- Stream examine(long)
- Stream examine(short)
- Stream examine(String)
- Object examine(String)
- Object examine(short)
- Object examine(long)
- Object examine(int)
- Object examine(float)
- Object examine(double)
- Object examine(char)
- Object examine(byte)
- Object examine(boolean)
- **static** MultiLineStringExaminer simpleEscaping()

### Class: net.kyori.examination.string.StringExaminer
Type: Class
Extends: net.kyori.examination.AbstractExaminer

Methods:
- String examine(boolean)
- String examine(byte)
- String examine(char)
- String examine(double)
- String examine(float)
- String examine(int)
- String examine(long)
- String examine(short)
- String examine(String)
- Object examine(String)
- Object examine(short)
- Object examine(long)
- Object examine(int)
- Object examine(float)
- Object examine(double)
- Object examine(char)
- Object examine(byte)
- Object examine(boolean)
- **static** StringExaminer simpleEscaping()

