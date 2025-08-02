# worldedit-bukkit-7.3.16 API Reference

## Package: com.sk89q.bukkit.util

### Class: com.sk89q.bukkit.util.CommandInspector
Type: Interface

Methods:
- String getFullText(Command)
- boolean testPermission(CommandSender, Command)
- String getShortText(Command)

### Class: com.sk89q.bukkit.util.ClassSourceValidator
Type: Class

Methods:
- Map findMismatches(List)
- void reportMismatches(List)

### Class: com.sk89q.bukkit.util.CommandInfo
Type: Class

Methods:
- String[] getAliases()
- String getName()
- String[] getPermissions()
- String getDesc()
- Object getRegisteredWith()
- String getUsage()

### Class: com.sk89q.bukkit.util.CommandRegistration
Type: Class

Methods:
- Plugin getCommandOwner(String)
- CommandMap getCommandMap()
- boolean unregisterCommands()
- boolean register(List)

### Class: com.sk89q.bukkit.util.CommandsManagerRegistration
Type: Class
Extends: com.sk89q.bukkit.util.CommandRegistration

Methods:
- boolean registerAll(List)
- boolean register(Class)

### Class: com.sk89q.bukkit.util.DynamicPluginCommand
Type: Class
Extends: org.bukkit.command.Command
Implements: org.bukkit.command.PluginIdentifiableCommand

Methods:
- boolean testPermissionSilent(CommandSender)
- Plugin getPlugin()
- String[] getPermissions()
- List tabComplete(CommandSender, String, String[]) throws IllegalArgumentException
- Object getRegisteredWith()
- void setPermissions(String[])
- Object getOwner()
- boolean execute(CommandSender, String, String[])

### Class: com.sk89q.bukkit.util.DynamicPluginCommandHelpTopic
Type: Class
Extends: org.bukkit.help.HelpTopic

Methods:
- String getFullText(CommandSender)
- boolean canSee(CommandSender)

### Class: com.sk89q.bukkit.util.FallbackRegistrationListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent)

## Package: com.sk89q.jnbt

### Class: com.sk89q.jnbt.ByteArrayTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- byte[] getValue()
- Object getValue()

### Class: com.sk89q.jnbt.ByteTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- Byte getValue()
- Object getValue()

### Class: com.sk89q.jnbt.CompoundTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- ListTag getListTag(String)
- byte getByte(String)
- short getShort(String)
- boolean containsKey(String)
- double getDouble(String)
- String getString(String)
- float getFloat(String)
- long[] getLongArray(String)
- long asLong(String)
- long getLong(String)
- int asInt(String)
- int getInt(String)
- Map getValue()
- Object getValue()
- CompoundTagBuilder createBuilder()
- List getList(String)
- List getList(String, Class)
- CompoundTag setValue(Map)
- double asDouble(String)
- byte[] getByteArray(String)
- int[] getIntArray(String)

### Class: com.sk89q.jnbt.CompoundTagBuilder
Type: Class

Methods:
- CompoundTagBuilder putInt(String, int)
- CompoundTagBuilder putString(String, String)
- CompoundTagBuilder putDouble(String, double)
- CompoundTagBuilder putLong(String, long)
- CompoundTagBuilder remove(String)
- CompoundTagBuilder put(String, Tag)
- CompoundTagBuilder putByteArray(String, byte[])
- CompoundTagBuilder putFloat(String, float)
- CompoundTagBuilder putByte(String, byte)
- CompoundTag build()
- CompoundTagBuilder putAll(Map)
- CompoundTagBuilder create()
- CompoundTagBuilder putIntArray(String, int[])
- CompoundTagBuilder putShort(String, short)
- CompoundTagBuilder putLongArray(String, long[])

### Class: com.sk89q.jnbt.DoubleTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- Double getValue()
- Object getValue()

### Class: com.sk89q.jnbt.EndTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- Object getValue()

### Class: com.sk89q.jnbt.FloatTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- Float getValue()
- Object getValue()

### Class: com.sk89q.jnbt.IntArrayTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- int[] getValue()
- Object getValue()

### Class: com.sk89q.jnbt.IntTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- Integer getValue()
- Object getValue()

### Class: com.sk89q.jnbt.LinBusConverter
Type: Class

Methods:
- LinStream convertStream(NBTInputStream)
- DataOutputStream convertStream(NBTOutputStream)
- Tag toJnbtTag(LinTag)

### Class: com.sk89q.jnbt.ListTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- ListTag getListTag(int)
- byte getByte(int)
- short getShort(int)
- double getDouble(int)
- String getString(int)
- float getFloat(int)
- long asLong(int)
- long getLong(int)
- int asInt(int)
- int getInt(int)
- List getValue()
- Object getValue()
- Tag getIfExists(int)
- Class getType()
- List getList(int)
- List getList(int, Class)
- ListTag setValue(List)
- double asDouble(int)
- byte[] getByteArray(int)
- int[] getIntArray(int)

### Class: com.sk89q.jnbt.ListTagBuilder
Type: Class

Methods:
- ListTagBuilder add(Tag)
- ListTag build()
- ListTagBuilder addAll(Collection)
- ListTagBuilder create(Class)
- ListTagBuilder createWith(Tag[])

### Class: com.sk89q.jnbt.LongArrayTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- long[] getValue()
- Object getValue()

### Class: com.sk89q.jnbt.LongTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- Long getValue()
- Object getValue()

### Class: com.sk89q.jnbt.NBTConstants
Type: Class

Methods:
- Class getClassFromType(int)

### Class: com.sk89q.jnbt.NBTInputStream
Type: Class
Implements: java.io.Closeable

Methods:
- NamedTag readNamedTag() throws IOException
- void close() throws IOException

### Class: com.sk89q.jnbt.NBTOutputStream
Type: Class
Implements: java.io.Closeable

Methods:
- void close() throws IOException
- void writeNamedTag(String, Tag) throws IOException

### Class: com.sk89q.jnbt.NBTUtils
Type: Class

Methods:
- Tag getChildTag(Map, String, Class) throws InvalidFormatException
- Vector3 toVector(ListTag)
- Class getTypeClass(int)
- String getTypeName(Class)
- int getTypeCode(Class)

### Class: com.sk89q.jnbt.NamedTag
Type: Class

Methods:
- String getName()
- Tag getTag()

### Class: com.sk89q.jnbt.ShortTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- Short getValue()
- Object getValue()

### Class: com.sk89q.jnbt.StringTag
Type: Class
Extends: com.sk89q.jnbt.Tag

Methods:
- String getValue()
- Object getValue()

### Class: com.sk89q.jnbt.Tag
Type: Abstract Class
Implements: org.enginehub.linbus.tree.ToLinTag

Methods:
- Object getValue()
- LinTag toLinTag()
- String toString()

## Package: com.sk89q.minecraft.util.commands

### Class: com.sk89q.minecraft.util.commands.Command
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String help()
- int min()
- String[] aliases()
- int max()
- String usage()
- String flags()
- boolean anyFlags()
- String desc()

### Class: com.sk89q.minecraft.util.commands.CommandAlias
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: com.sk89q.minecraft.util.commands.CommandPermissions
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: com.sk89q.minecraft.util.commands.Console
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.sk89q.minecraft.util.commands.Injector
Type: Interface

Methods:
- Object getInstance(Class) throws InvocationTargetException, IllegalAccessException, InstantiationException

### Class: com.sk89q.minecraft.util.commands.NestedCommand
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean executeBody()
- Class[] value()

### Class: com.sk89q.minecraft.util.commands.CommandContext
Type: Class

Methods:
- double getFlagDouble(char) throws NumberFormatException
- double getFlagDouble(char, double) throws NumberFormatException
- boolean hasFlag(char)
- String getJoinedStrings(int)
- int argsLength()
- String getCommand()
- String[] getParsedPaddedSlice(int, int)
- double getDouble(int) throws NumberFormatException
- double getDouble(int, double) throws NumberFormatException
- int getInteger(int) throws NumberFormatException
- int getInteger(int, int) throws NumberFormatException
- String getRemainingString(int)
- Map getValueFlags()
- String[] getPaddedSlice(int, int)
- String getString(int)
- String getString(int, String)
- String getString(int, int)
- boolean matches(String)
- CommandLocals getLocals()
- String[] split(String)
- String[] getSlice(int)
- SuggestionContext getSuggestionContext()
- int getFlagInteger(char) throws NumberFormatException
- int getFlagInteger(char, int) throws NumberFormatException
- Set getFlags()
- String[] getParsedSlice(int)
- String getFlag(char)
- String getFlag(char, String)

### Class: com.sk89q.minecraft.util.commands.CommandException
Type: Class
Extends: java.lang.Exception

Methods:
- void prependStack(String)
- String getCommandUsed(String, String)

### Class: com.sk89q.minecraft.util.commands.CommandLocals
Type: Class

Methods:
- boolean containsKey(Object)
- Object get(Object)
- Object get(Class)
- Object put(Object, Object)
- boolean containsValue(Object)

### Class: com.sk89q.minecraft.util.commands.CommandPermissionsException
Type: Class
Extends: com.sk89q.minecraft.util.commands.CommandException

No public methods found

### Class: com.sk89q.minecraft.util.commands.CommandUsageException
Type: Class
Extends: com.sk89q.minecraft.util.commands.CommandException

Methods:
- String getUsage()

### Class: com.sk89q.minecraft.util.commands.CommandsManager
Type: Abstract Class

Methods:
- Map getHelpMessages()
- void executeMethod(Method, String[], Object, Object[], int) throws CommandException
- boolean hasPermission(Object, String)
- Injector getInjector()
- boolean hasCommand(String)
- List registerAndReturn(Class)
- void invokeMethod(Method, String[], Object, Method, Object, Object[], int) throws CommandException
- void setInjector(Injector)
- void execute(String, String[], Object, Object[]) throws CommandException
- void execute(String[], Object, Object[]) throws CommandException
- Map getMethods()
- Map getCommands()
- List registerMethods(Class, Method)
- void register(Class)

### Class: com.sk89q.minecraft.util.commands.MissingNestedCommandException
Type: Class
Extends: com.sk89q.minecraft.util.commands.CommandUsageException

No public methods found

### Class: com.sk89q.minecraft.util.commands.SimpleInjector
Type: Class
Implements: com.sk89q.minecraft.util.commands.Injector

Methods:
- Object getInstance(Class)

### Class: com.sk89q.minecraft.util.commands.SuggestionContext
Type: Class

Methods:
- boolean forHangingValue()
- SuggestionContext lastValue()
- SuggestionContext flag(Character)
- boolean forLastValue()
- boolean forFlag()
- String toString()
- Character getFlag()
- SuggestionContext hangingValue()

### Class: com.sk89q.minecraft.util.commands.UnhandledCommandException
Type: Class
Extends: com.sk89q.minecraft.util.commands.CommandException

No public methods found

### Class: com.sk89q.minecraft.util.commands.WrappedCommandException
Type: Class
Extends: com.sk89q.minecraft.util.commands.CommandException

No public methods found

## Package: com.sk89q.util

### Class: com.sk89q.util.ReflectionUtil
Type: Class

Methods:
- Object getField(Object, String)

### Class: com.sk89q.util.StringUtil
Type: Class

Methods:
- Enum lookup(Map, String, boolean)
- String joinQuotedString(String[], String, int, String)
- String joinString(String[], String, int)
- String joinString(String[], String)
- String joinString(Object[], String, int)
- String joinString(int[], String, int)
- String joinString(Collection, String, int)
- List parseListInQuotes(String[], char, char, char)
- List parseListInQuotes(String[], char, char, char, boolean)
- List parseListInQuotes(String[], char, char[], char[], boolean)
- int getLevenshteinDistance(String, String)
- String trimLength(String, int)

## Package: com.sk89q.util.yaml

### Class: com.sk89q.util.yaml.YAMLFormat
Type: Enum
Extends: java.lang.Enum

Methods:
- DumperOptions$FlowStyle getStyle()
- YAMLFormat valueOf(String)
- YAMLFormat[] values()

### Class: com.sk89q.util.yaml.YAMLNode
Type: Class

Methods:
- void setWriteDefaults(boolean)
- List getIntList(String, List)
- List getBooleanList(String, List)
- YAMLNode addNode(String)
- boolean writeDefaults()
- Vector3 getVector(String)
- Vector3 getVector(String, Vector3)
- Double getDouble(String)
- double getDouble(String, double)
- List getBlockVector2List(String, List)
- List getList(String)
- Boolean getBoolean(String)
- boolean getBoolean(String, boolean)
- List getVectorList(String, List)
- Object getProperty(String)
- Map getNodes(String)
- void clear()
- List getKeys(String)
- String getString(String)
- String getString(String, String)
- List getVector2List(String, List)
- List getDoubleList(String, List)
- Map getMap()
- List getNodeList(String, List)
- Integer getInt(String)
- int getInt(String, int)
- Vector2 getVector2(String)
- void setProperty(String, Object)
- YAMLNode getNode(String)
- List getStringList(String, List)
- void removeProperty(String)

### Class: com.sk89q.util.yaml.YAMLProcessor
Type: Class
Extends: com.sk89q.util.yaml.YAMLNode

Methods:
- void load() throws IOException
- Map getComments()
- boolean save()
- void setComment(String, String)
- void setComment(String, String[])
- String getComment(String)
- OutputStream getOutputStream() throws IOException
- void setComments(Map)
- InputStream getInputStream() throws IOException
- YAMLNode getEmptyNode(boolean)
- void setHeader(String[])
- void setHeader(String)
- String getHeader()

### Class: com.sk89q.util.yaml.YAMLProcessorException
Type: Class
Extends: java.lang.Exception

No public methods found

## Package: com.sk89q.wepif

### Class: com.sk89q.wepif.PermissionsProvider
Type: Interface

Methods:
- boolean hasPermission(String, String)
- boolean hasPermission(String, String, String)
- boolean hasPermission(OfflinePlayer, String)
- boolean hasPermission(String, OfflinePlayer, String)
- boolean inGroup(String, String)
- boolean inGroup(OfflinePlayer, String)
- String[] getGroups(String)
- String[] getGroups(OfflinePlayer)

### Class: com.sk89q.wepif.PermissionsResolver
Type: Interface
Implements: com.sk89q.wepif.PermissionsProvider

Methods:
- String getDetectionMessage()
- void load()

### Class: com.sk89q.wepif.ConfigurationPermissionsResolver
Type: Class
Implements: com.sk89q.wepif.PermissionsResolver

Methods:
- String getDetectionMessage()
- void load()
- YAMLNode generateDefaultPerms(YAMLNode)
- boolean hasPermission(String, String)
- boolean hasPermission(String, String, String)
- boolean hasPermission(OfflinePlayer, String)
- boolean hasPermission(String, OfflinePlayer, String)
- boolean inGroup(String, String)
- boolean inGroup(OfflinePlayer, String)
- String[] getGroups(String)
- String[] getGroups(OfflinePlayer)

### Class: com.sk89q.wepif.DinnerPermsResolver
Type: Class
Implements: com.sk89q.wepif.PermissionsResolver

Methods:
- String getDetectionMessage()
- int internalHasPermission(Permissible, String)
- PermissionsResolver factory(Server, YAMLProcessor)
- void load()
- boolean hasPermission(String, String)
- boolean hasPermission(String, String, String)
- boolean hasPermission(OfflinePlayer, String)
- boolean hasPermission(String, OfflinePlayer, String)
- boolean inGroup(String, String)
- boolean inGroup(OfflinePlayer, String)
- Permissible getPermissible(OfflinePlayer)
- String[] getGroups(String)
- String[] getGroups(OfflinePlayer)

### Class: com.sk89q.wepif.FlatFilePermissionsResolver
Type: Class
Implements: com.sk89q.wepif.PermissionsResolver

Methods:
- String getDetectionMessage()
- PermissionsResolver factory(Server, YAMLProcessor)
- void load()
- boolean hasPermission(String, String)
- boolean hasPermission(String, String, String)
- boolean hasPermission(OfflinePlayer, String)
- boolean hasPermission(String, OfflinePlayer, String)
- Map loadGroupPermissions()
- boolean inGroup(String, String)
- boolean inGroup(OfflinePlayer, String)
- String[] getGroups(String)
- String[] getGroups(OfflinePlayer)

### Class: com.sk89q.wepif.GroupManagerResolver
Type: Class
Extends: com.sk89q.wepif.DinnerPermsResolver

Methods:
- String getDetectionMessage()
- PermissionsResolver factory(Server, YAMLProcessor)
- void load()
- boolean hasPermission(OfflinePlayer, String)
- boolean hasPermission(String, OfflinePlayer, String)
- boolean inGroup(OfflinePlayer, String)
- String[] getGroups(String)
- String[] getGroups(OfflinePlayer)

### Class: com.sk89q.wepif.NijiPermissionsResolver
Type: Class
Implements: com.sk89q.wepif.PermissionsResolver

Methods:
- String getDetectionMessage()
- PermissionsResolver factory(Server, YAMLProcessor)
- void load()
- boolean hasPermission(String, String)
- boolean hasPermission(String, String, String)
- boolean hasPermission(OfflinePlayer, String)
- boolean hasPermission(String, OfflinePlayer, String)
- boolean isFakeNijiPerms(Plugin)
- boolean inGroup(String, String)
- boolean inGroup(OfflinePlayer, String)
- String[] getGroups(String)
- String[] getGroups(OfflinePlayer)

### Class: com.sk89q.wepif.PermissionsExResolver
Type: Class
Extends: com.sk89q.wepif.DinnerPermsResolver

Methods:
- String getDetectionMessage()
- PermissionsResolver factory(Server, YAMLProcessor)
- boolean hasPermission(String, String, String)
- boolean hasPermission(OfflinePlayer, String)
- boolean hasPermission(String, OfflinePlayer, String)
- boolean inGroup(OfflinePlayer, String)
- String[] getGroups(OfflinePlayer)

### Class: com.sk89q.wepif.PermissionsResolverManager
Type: Class
Implements: com.sk89q.wepif.PermissionsResolver

Methods:
- String getDetectionMessage()
- void load()
- boolean hasPermission(String, String)
- boolean hasPermission(String, String, String)
- boolean hasPermission(OfflinePlayer, String)
- boolean hasPermission(String, OfflinePlayer, String)
- boolean isInitialized()
- boolean inGroup(String, String)
- boolean inGroup(OfflinePlayer, String)
- PermissionsResolverManager getInstance()
- void initialize(Plugin)
- void setPluginPermissionsResolver(Plugin)
- String[] getGroups(String)
- String[] getGroups(OfflinePlayer)
- void findResolver()

### Class: com.sk89q.wepif.PluginPermissionsResolver
Type: Class
Implements: com.sk89q.wepif.PermissionsResolver

Methods:
- String getDetectionMessage()
- PermissionsResolver factory(Server, YAMLProcessor)
- void load()
- boolean hasPermission(String, String)
- boolean hasPermission(String, String, String)
- boolean hasPermission(OfflinePlayer, String)
- boolean hasPermission(String, OfflinePlayer, String)
- boolean inGroup(String, String)
- boolean inGroup(OfflinePlayer, String)
- String[] getGroups(String)
- String[] getGroups(OfflinePlayer)

### Class: com.sk89q.wepif.VaultResolver
Type: Class
Implements: com.sk89q.wepif.PermissionsResolver

Methods:
- String getDetectionMessage()
- PermissionsResolver factory(Server, YAMLProcessor)
- void load()
- boolean hasPermission(String, String)
- boolean hasPermission(String, String, String)
- boolean hasPermission(OfflinePlayer, String)
- boolean hasPermission(String, OfflinePlayer, String)
- boolean inGroup(String, String)
- boolean inGroup(OfflinePlayer, String)
- String[] getGroups(String)
- String[] getGroups(OfflinePlayer)

### Class: com.sk89q.wepif.WEPIFRuntimeException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: com.sk89q.wepif.bPermissionsResolver
Type: Class
Implements: com.sk89q.wepif.PermissionsResolver

Methods:
- String getDetectionMessage()
- PermissionsResolver factory(Server, YAMLProcessor)
- void load()
- boolean hasPermission(String, String)
- boolean hasPermission(String, String, String)
- boolean hasPermission(OfflinePlayer, String)
- boolean hasPermission(String, OfflinePlayer, String)
- boolean inGroup(String, String)
- boolean inGroup(OfflinePlayer, String)
- String[] getGroups(String)
- String[] getGroups(OfflinePlayer)

## Package: com.sk89q.worldedit

### Class: com.sk89q.worldedit.DisallowedItemException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

Methods:
- String getID()

### Class: com.sk89q.worldedit.EditSession
Type: Class
Implements: com.sk89q.worldedit.extent.Extent, java.lang.AutoCloseable

Methods:
- int getHighestTerrainBlock(int, int, int, int)
- int getHighestTerrainBlock(int, int, int, int, Mask)
- World getWorld()
- int makePyramid(BlockVector3, Pattern, int, boolean) throws MaxChangedBlocksException
- int getBlockChangeLimit()
- int makePumpkinPatches(BlockVector3, int) throws MaxChangedBlocksException
- Operation commit()
- boolean setBlock(BlockVector3, BlockStateHolder, EditSession$Stage) throws WorldEditException
- boolean setBlock(BlockVector3, BlockStateHolder) throws MaxChangedBlocksException
- boolean setBlock(BlockVector3, Pattern) throws MaxChangedBlocksException
- int fixLiquid(BlockVector3, double, BlockType) throws MaxChangedBlocksException
- boolean rawSetBlock(BlockVector3, BlockStateHolder)
- BlockBag getBlockBag()
- Map popMissingBlocks()
- int stackCuboidRegion(Region, BlockVector3, int, boolean) throws MaxChangedBlocksException
- int stackCuboidRegion(Region, BlockVector3, int, boolean, boolean, Mask) throws MaxChangedBlocksException
- int deformRegion(Region, Vector3, Vector3, String) throws ExpressionException, MaxChangedBlocksException
- int deformRegion(Region, Vector3, Vector3, String, int) throws ExpressionException, MaxChangedBlocksException
- int deformRegion(Region, Vector3, Vector3, Expression, int) throws ExpressionException, MaxChangedBlocksException
- int makeShape(Region, Vector3, Vector3, Pattern, String, boolean) throws ExpressionException, MaxChangedBlocksException
- int makeShape(Region, Vector3, Vector3, Pattern, String, boolean, int) throws ExpressionException, MaxChangedBlocksException
- int makeShape(Region, Vector3, Vector3, Pattern, Expression, boolean, int) throws ExpressionException, MaxChangedBlocksException
- int makeWalls(Region, Pattern) throws MaxChangedBlocksException
- boolean isTickingWatchdog()
- int moveRegion(Region, BlockVector3, int, boolean, Pattern) throws MaxChangedBlocksException
- int moveRegion(Region, BlockVector3, int, boolean, boolean, Mask, Pattern) throws MaxChangedBlocksException
- int stackRegionBlockUnits(Region, BlockVector3, int, boolean, boolean, Mask) throws MaxChangedBlocksException, RegionOperationException
- int thaw(BlockVector3, double) throws MaxChangedBlocksException
- int thaw(BlockVector3, double, int) throws MaxChangedBlocksException
- int countBlocks(Region, Set)
- int countBlocks(Region, Mask)
- boolean setBiome(BlockVector3, BiomeType)
- boolean fullySupports3DBiomes()
- BlockVector3 getMinimumPoint()
- void setMask(Mask)
- int setBlocks(Region, BlockStateHolder) throws MaxChangedBlocksException
- int setBlocks(Region, Pattern) throws MaxChangedBlocksException
- void setSideEffectApplier(SideEffectSet)
- int removeAbove(BlockVector3, int, int) throws MaxChangedBlocksException
- void setBatchingChunks(boolean)
- Entity createEntity(Location, BaseEntity)
- boolean isTrackingHistory()
- void setBlockChangeLimit(int)
- SurvivalModeExtent getSurvivalExtent()
- int removeNear(BlockVector3, Mask, int) throws MaxChangedBlocksException
- int size()
- int drawSpline(Pattern, List, double, double, double, double, double, boolean) throws MaxChangedBlocksException
- BlockVector3 getMaximumPoint()
- List getEntities(Region)
- List getEntities()
- int makeBiomeShape(Region, Vector3, Vector3, BiomeType, String, boolean) throws ExpressionException
- int makeBiomeShape(Region, Vector3, Vector3, BiomeType, String, boolean, int) throws ExpressionException
- int makeCuboidWalls(Region, BlockStateHolder) throws MaxChangedBlocksException
- int makeCuboidWalls(Region, Pattern) throws MaxChangedBlocksException
- int morph(BlockVector3, double, int, int, int, int) throws MaxChangedBlocksException
- int drainArea(BlockVector3, double) throws MaxChangedBlocksException
- int drainArea(BlockVector3, double, boolean) throws MaxChangedBlocksException
- BlockState getBlockWithBuffer(BlockVector3)
- int makeForest(BlockVector3, int, double, TreeGenerator$TreeType) throws MaxChangedBlocksException
- int makeForest(Region, double, TreeGenerator$TreeType) throws MaxChangedBlocksException
- SideEffectSet getSideEffectApplier()
- int makeCuboidFaces(Region, BlockStateHolder) throws MaxChangedBlocksException
- int makeCuboidFaces(Region, Pattern) throws MaxChangedBlocksException
- void enableStandardMode()
- EditSession$ReorderMode getReorderMode()
- BaseBlock getFullBlockWithBuffer(BlockVector3)
- void setBlockBag(BlockBag)
- void disableBuffering()
- void redo(EditSession)
- int replaceBlocks(Region, Set, BlockStateHolder) throws MaxChangedBlocksException
- int replaceBlocks(Region, Set, Pattern) throws MaxChangedBlocksException
- int replaceBlocks(Region, Mask, Pattern) throws MaxChangedBlocksException
- int simulateSnow(BlockVector3, double) throws MaxChangedBlocksException
- int simulateSnow(BlockVector3, double, int) throws MaxChangedBlocksException
- int simulateSnow(FlatRegion, boolean) throws MaxChangedBlocksException
- int overlayCuboidBlocks(Region, BlockStateHolder) throws MaxChangedBlocksException
- int overlayCuboidBlocks(Region, Pattern) throws MaxChangedBlocksException
- int fillXZ(BlockVector3, BlockStateHolder, double, int, boolean) throws MaxChangedBlocksException
- int fillXZ(BlockVector3, Pattern, double, int, boolean) throws MaxChangedBlocksException
- void setReorderMode(EditSession$ReorderMode)
- boolean smartSetBlock(BlockVector3, BlockStateHolder)
- boolean isBatchingChunks()
- void undo(EditSession)
- int makeCone(BlockVector3, Pattern, double, double, int, boolean, double) throws MaxChangedBlocksException
- BaseBlock getFullBlock(BlockVector3)
- boolean hasFastMode()
- void setTickingWatchdog(boolean)
- int naturalizeCuboidBlocks(Region) throws MaxChangedBlocksException
- boolean isQueueEnabled()
- void close()
- BiomeType getBiome(BlockVector3)
- void enableQueue()
- int makeCylinder(BlockVector3, Pattern, double, int, boolean) throws MaxChangedBlocksException
- int makeCylinder(BlockVector3, Pattern, double, double, int, boolean) throws MaxChangedBlocksException
- Mask getMask()
- BlockState getBlock(BlockVector3)
- int green(BlockVector3, double, boolean) throws MaxChangedBlocksException
- int green(BlockVector3, double, int, boolean) throws MaxChangedBlocksException
- int center(Region, Pattern) throws MaxChangedBlocksException
- void flushSession()
- int hollowOutRegion(Region, int, Pattern) throws MaxChangedBlocksException
- void setFastMode(boolean)
- int drawLine(Pattern, BlockVector3, BlockVector3, double, boolean) throws MaxChangedBlocksException
- int drawLine(Pattern, List, double, boolean) throws MaxChangedBlocksException
- void setTrackingHistory(boolean)
- int removeBelow(BlockVector3, int, int) throws MaxChangedBlocksException
- int moveCuboidRegion(Region, BlockVector3, int, boolean, Pattern) throws MaxChangedBlocksException
- ChangeSet getChangeSet()
- int makeSphere(BlockVector3, Pattern, double, boolean) throws MaxChangedBlocksException
- int makeSphere(BlockVector3, Pattern, double, double, double, boolean) throws MaxChangedBlocksException
- int makeFaces(Region, Pattern) throws MaxChangedBlocksException
- boolean isBufferingEnabled()
- int getBlockChangeCount()
- void disableQueue()
- List getBlockDistribution(Region, boolean)

### Class: com.sk89q.worldedit.EditSessionBuilder
Type: Class

Methods:
- EditSessionBuilder actor(Actor)
- int getMaxBlocks()
- EditSessionBuilder tracing(boolean)
- World getWorld()
- EditSessionBuilder world(World)
- EditSession build()
- EditSessionBuilder locatableActor(Actor)
- EditSessionBuilder blockBag(BlockBag)
- boolean isTracing()
- BlockBag getBlockBag()
- Actor getActor()
- EditSessionBuilder maxBlocks(int)

### Class: com.sk89q.worldedit.EditSessionFactory
Type: Class

Methods:
- EditSession getEditSession(World, int)
- EditSession getEditSession(World, int, Actor)
- EditSession getEditSession(World, int, BlockBag)
- EditSession getEditSession(World, int, BlockBag, Actor)

### Class: com.sk89q.worldedit.EmptyClipboardException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

### Class: com.sk89q.worldedit.IncompleteRegionException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

### Class: com.sk89q.worldedit.InvalidItemException
Type: Class
Extends: com.sk89q.worldedit.DisallowedItemException

No public methods found

### Class: com.sk89q.worldedit.LocalConfiguration
Type: Abstract Class

Methods:
- String convertLegacyItem(String)
- void initializeSnapshotConfiguration(String, boolean)
- void setDefaultLocaleName(String)
- File getWorkingDirectory()
- void load()
- Path getWorkingDirectoryPath()

### Class: com.sk89q.worldedit.LocalSession
Type: Class

Methods:
- BrushTool getBrushTool(ItemType) throws InvalidToolBindException
- void dispatchCUISelection(Actor)
- void describeCUI(Actor)
- int getBlockChangeLimit()
- ZoneId getTimeZone()
- World getWorldOverride()
- void setClipboard(ClipboardHolder)
- SideEffectSet getSideEffectSet()
- Tool getTool(ItemType)
- BlockBag getBlockBag(Player)
- void enableSuperPickAxe()
- void setLastScript(String)
- boolean hasWorldOverride()
- boolean isUsingInventory()
- String getLastScript()
- void setWorldOverride(World)
- boolean isTickingWatchdog()
- boolean togglePlacementPosition()
- RegionSelector getRegionSelector(World)
- void setTracingActions(boolean)
- void setSideEffectSet(SideEffectSet)
- boolean isToolControlEnabled()
- void setRegionSelector(World, RegionSelector)
- void setMask(Mask)
- boolean compareAndResetDirty()
- List getLastDistribution()
- void setLastDistribution(List)
- void setTimezone(ZoneId)
- void setToolControl(boolean)
- boolean isWandItemDefault()
- void setBlockChangeLimit(int)
- boolean shouldUseServerCUI()
- String getWandItem()
- void setUseInventory(boolean)
- void disableSuperPickAxe()
- BlockTool getSuperPickaxe()
- void dispatchCUIEvent(Actor, CUIEvent)
- EditSession createEditSession(Actor)
- BrushTool getBrush(ItemType)
- void setPlacement(Placement)
- void postLoad()
- void updateServerCUI(Actor)
- boolean hasSuperPickAxe()
- World getSelectionWorld()
- void tellVersion(Actor)
- void setPlaceAtPos1(boolean)
- EditSession$ReorderMode getReorderMode()
- boolean isPlaceAtPos1()
- void onIdle()
- boolean hasCUISupport()
- void setTool(ItemType, Tool) throws InvalidToolBindException
- void setCUIVersion(int)
- void setSnapshot(Snapshot)
- EditSession redo(BlockBag, Actor)
- void setReorderMode(EditSession$ReorderMode)
- void handleCUIInitializationMessage(String, List, Actor)
- void handleCUIInitializationMessage(String, Actor)
- void setSnapshotExperimental(Snapshot)
- void remember(EditSession)
- EditSession undo(BlockBag, Actor)
- void clearHistory()
- boolean isDirty()
- boolean hasFastMode()
- int getCUIVersion()
- boolean isSelectionDefined(World)
- void setTickingWatchdog(boolean)
- String getNavWandItem()
- int getTimeout()
- boolean isNavWandItemDefault()
- void setConfiguration(LocalConfiguration)
- Mask getMask()
- void setUseServerCUI(boolean)
- BrushTool forceBrush(ItemType, Brush, String) throws InvalidToolBindException
- boolean toggleSuperPickAxe()
- Placement getPlacement()
- void dispatchCUISetup(Actor)
- ClipboardHolder getClipboard() throws EmptyClipboardException
- void setFastMode(boolean)
- Snapshot getSnapshotExperimental()
- void setSuperPickaxe(BlockTool)
- void setDefaultRegionSelector(RegionSelectorType)
- Snapshot getSnapshot()
- Calendar detectDate(String)
- void setTimeout(int)
- Region getSelection() throws IncompleteRegionException
- Region getSelection(World) throws IncompleteRegionException
- RegionSelectorType getDefaultRegionSelector()
- boolean isTracingActions()
- BlockVector3 getPlacementPosition(Actor) throws IncompleteRegionException
- void setCUISupport(boolean)

### Class: com.sk89q.worldedit.MaxBrushRadiusException
Type: Class
Extends: com.sk89q.worldedit.MaxRadiusException

No public methods found

### Class: com.sk89q.worldedit.MaxChangedBlocksException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

Methods:
- int getBlockLimit()

### Class: com.sk89q.worldedit.MaxRadiusException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

### Class: com.sk89q.worldedit.MissingWorldException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

### Class: com.sk89q.worldedit.NotABlockException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

### Class: com.sk89q.worldedit.UnknownDirectionException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

Methods:
- String getDirection()

### Class: com.sk89q.worldedit.UnknownItemException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

Methods:
- String getID()

### Class: com.sk89q.worldedit.WorldEdit
Type: Class

Methods:
- MaskFactory getMaskFactory()
- BlockVector3 getDirection(Player, String) throws UnknownDirectionException
- File getSafeSaveFile(Actor, File, String, String, String[]) throws FilenameException
- BlockVector3 getDiagonalDirection(Player, String) throws UnknownDirectionException
- Supervisor getSupervisor()
- BlockFactory getBlockFactory()
- boolean handleRightClick(Player)
- void checkMaxRadius(double) throws MaxRadiusException
- EventBus getEventBus()
- LocalConfiguration getConfiguration()
- File getWorkingDirectoryFile(String)
- boolean handleBlockRightClick(Player, Location)
- boolean handleBlockRightClick(Player, Location, Direction)
- String getVersion()
- File getSafeOpenFile(Actor, File, String, String, String[]) throws FilenameException
- EditSession newEditSession(World)
- EditSession newEditSession(Actor)
- ListeningExecutorService getExecutorService()
- boolean handleArmSwing(Player)
- void flushBlockBag(Actor, EditSession)
- AssetLoaders getAssetLoaders()
- Path getWorkingDirectoryPath(String)
- PlatformManager getPlatformManager()
- EditSessionFactory getEditSessionFactory()
- void runScript(Player, File, String[]) throws WorldEditException
- PatternFactory getPatternFactory()
- void checkMaxBrushRadius(double) throws MaxBrushRadiusException
- EditSessionBuilder newEditSessionBuilder()
- SessionManager getSessionManager()
- ItemFactory getItemFactory()
- void loadMappings()
- boolean handleBlockLeftClick(Player, Location)
- boolean handleBlockLeftClick(Player, Location, Direction)
- WorldEdit getInstance()
- TranslationManager getTranslationManager()

### Class: com.sk89q.worldedit.WorldEditException
Type: Abstract Class
Extends: java.lang.Exception

Methods:
- Component getRichMessage()

### Class: com.sk89q.worldedit.WorldEditManifest
Type: Class

Methods:
- WorldEditManifest load()
- String getWorldEditVersion()
- WorldEditManifest$Kind getWorldEditKind()

## Package: com.sk89q.worldedit.antlr

### Class: com.sk89q.worldedit.antlr.ExpressionListener
Type: Interface
Implements: com.sk89q.worldedit.antlr4.runtime.tree.ParseTreeListener

Methods:
- void enterWhileStatement(ExpressionParser$WhileStatementContext)
- void enterPoFallthrough(ExpressionParser$PoFallthroughContext)
- void enterMultiplicativeExpr(ExpressionParser$MultiplicativeExprContext)
- void enterBlock(ExpressionParser$BlockContext)
- void enterCAFallthrough(ExpressionParser$CAFallthroughContext)
- void exitExpressionStatement(ExpressionParser$ExpressionStatementContext)
- void exitPwFallthrough(ExpressionParser$PwFallthroughContext)
- void enterForStatement(ExpressionParser$ForStatementContext)
- void enterConditionalAndExpr(ExpressionParser$ConditionalAndExprContext)
- void enterStatement(ExpressionParser$StatementContext)
- void exitFunctionCallExpr(ExpressionParser$FunctionCallExprContext)
- void exitConstantExpression(ExpressionParser$ConstantExpressionContext)
- void exitComplementExpr(ExpressionParser$ComplementExprContext)
- void enterIfStatement(ExpressionParser$IfStatementContext)
- void exitCase(ExpressionParser$CaseContext)
- void enterPostCrementExpr(ExpressionParser$PostCrementExprContext)
- void exitConditionalAndExpr(ExpressionParser$ConditionalAndExprContext)
- void enterReturnStatement(ExpressionParser$ReturnStatementContext)
- void enterConditionalOrExpr(ExpressionParser$ConditionalOrExprContext)
- void exitAssignmentExpression(ExpressionParser$AssignmentExpressionContext)
- void enterMuFallthrough(ExpressionParser$MuFallthroughContext)
- void enterReFallthrough(ExpressionParser$ReFallthroughContext)
- void exitEqFallthrough(ExpressionParser$EqFallthroughContext)
- void exitRelationalExpr(ExpressionParser$RelationalExprContext)
- void exitAdFallthrough(ExpressionParser$AdFallthroughContext)
- void enterShFallthrough(ExpressionParser$ShFallthroughContext)
- void exitWrappedExpr(ExpressionParser$WrappedExprContext)
- void exitCEFallthrough(ExpressionParser$CEFallthroughContext)
- void exitAddExpr(ExpressionParser$AddExprContext)
- void enterPlusMinusExpr(ExpressionParser$PlusMinusExprContext)
- void exitReFallthrough(ExpressionParser$ReFallthroughContext)
- void exitMultiplicativeExpr(ExpressionParser$MultiplicativeExprContext)
- void enterRelationalExpr(ExpressionParser$RelationalExprContext)
- void exitDefault(ExpressionParser$DefaultContext)
- void exitMuFallthrough(ExpressionParser$MuFallthroughContext)
- void exitEmptyStatement(ExpressionParser$EmptyStatementContext)
- void enterConstantExpression(ExpressionParser$ConstantExpressionContext)
- void exitExpression(ExpressionParser$ExpressionContext)
- void exitBreakStatement(ExpressionParser$BreakStatementContext)
- void exitContinueStatement(ExpressionParser$ContinueStatementContext)
- void enterAssignmentOperator(ExpressionParser$AssignmentOperatorContext)
- void enterExpression(ExpressionParser$ExpressionContext)
- void exitReturnStatement(ExpressionParser$ReturnStatementContext)
- void enterFunctionCall(ExpressionParser$FunctionCallContext)
- void enterBreakStatement(ExpressionParser$BreakStatementContext)
- void exitPostfixExpr(ExpressionParser$PostfixExprContext)
- void exitUaFallthrough(ExpressionParser$UaFallthroughContext)
- void enterEqualityExpr(ExpressionParser$EqualityExprContext)
- void exitAllStatements(ExpressionParser$AllStatementsContext)
- void exitEqualityExpr(ExpressionParser$EqualityExprContext)
- void enterEmptyStatement(ExpressionParser$EmptyStatementContext)
- void exitPostCrementExpr(ExpressionParser$PostCrementExprContext)
- void enterShiftExpr(ExpressionParser$ShiftExprContext)
- void enterDefault(ExpressionParser$DefaultContext)
- void exitFunctionCall(ExpressionParser$FunctionCallContext)
- void exitWhileStatement(ExpressionParser$WhileStatementContext)
- void exitCAFallthrough(ExpressionParser$CAFallthroughContext)
- void enterNotExpr(ExpressionParser$NotExprContext)
- void enterUaFallthrough(ExpressionParser$UaFallthroughContext)
- void enterSimpleForStatement(ExpressionParser$SimpleForStatementContext)
- void enterCOFallthrough(ExpressionParser$COFallthroughContext)
- void enterPwFallthrough(ExpressionParser$PwFallthroughContext)
- void enterEqFallthrough(ExpressionParser$EqFallthroughContext)
- void enterTernaryExpr(ExpressionParser$TernaryExprContext)
- void enterWrappedExpr(ExpressionParser$WrappedExprContext)
- void enterAddExpr(ExpressionParser$AddExprContext)
- void exitIdExpr(ExpressionParser$IdExprContext)
- void exitDoStatement(ExpressionParser$DoStatementContext)
- void enterPowerExpr(ExpressionParser$PowerExprContext)
- void enterContinueStatement(ExpressionParser$ContinueStatementContext)
- void enterComplementExpr(ExpressionParser$ComplementExprContext)
- void exitAssignmentOperator(ExpressionParser$AssignmentOperatorContext)
- void exitShiftExpr(ExpressionParser$ShiftExprContext)
- void enterSwitchStatement(ExpressionParser$SwitchStatementContext)
- void exitForStatement(ExpressionParser$ForStatementContext)
- void exitIfStatement(ExpressionParser$IfStatementContext)
- void exitPoFallthrough(ExpressionParser$PoFallthroughContext)
- void exitNotExpr(ExpressionParser$NotExprContext)
- void enterPreCrementExpr(ExpressionParser$PreCrementExprContext)
- void exitStatement(ExpressionParser$StatementContext)
- void enterAllStatements(ExpressionParser$AllStatementsContext)
- void enterPostfixExpr(ExpressionParser$PostfixExprContext)
- void exitPlusMinusExpr(ExpressionParser$PlusMinusExprContext)
- void exitPowerExpr(ExpressionParser$PowerExprContext)
- void exitStatements(ExpressionParser$StatementsContext)
- void exitSimpleForStatement(ExpressionParser$SimpleForStatementContext)
- void exitPreCrementExpr(ExpressionParser$PreCrementExprContext)
- void enterDoStatement(ExpressionParser$DoStatementContext)
- void exitBlock(ExpressionParser$BlockContext)
- void exitSwitchStatement(ExpressionParser$SwitchStatementContext)
- void enterConstantExpr(ExpressionParser$ConstantExprContext)
- void exitConstantExpr(ExpressionParser$ConstantExprContext)
- void exitShFallthrough(ExpressionParser$ShFallthroughContext)
- void exitTernaryExpr(ExpressionParser$TernaryExprContext)
- void enterFunctionCallExpr(ExpressionParser$FunctionCallExprContext)
- void enterAssignment(ExpressionParser$AssignmentContext)
- void exitConditionalOrExpr(ExpressionParser$ConditionalOrExprContext)
- void enterAdFallthrough(ExpressionParser$AdFallthroughContext)
- void exitAssignment(ExpressionParser$AssignmentContext)
- void enterExpressionStatement(ExpressionParser$ExpressionStatementContext)
- void enterIdExpr(ExpressionParser$IdExprContext)
- void enterCEFallthrough(ExpressionParser$CEFallthroughContext)
- void enterStatements(ExpressionParser$StatementsContext)
- void enterAssignmentExpression(ExpressionParser$AssignmentExpressionContext)
- void enterCase(ExpressionParser$CaseContext)
- void exitCOFallthrough(ExpressionParser$COFallthroughContext)

### Class: com.sk89q.worldedit.antlr.ExpressionVisitor
Type: Interface
Implements: com.sk89q.worldedit.antlr4.runtime.tree.ParseTreeVisitor

Methods:
- Object visitDoStatement(ExpressionParser$DoStatementContext)
- Object visitComplementExpr(ExpressionParser$ComplementExprContext)
- Object visitExpression(ExpressionParser$ExpressionContext)
- Object visitPoFallthrough(ExpressionParser$PoFallthroughContext)
- Object visitShiftExpr(ExpressionParser$ShiftExprContext)
- Object visitAssignment(ExpressionParser$AssignmentContext)
- Object visitUaFallthrough(ExpressionParser$UaFallthroughContext)
- Object visitCAFallthrough(ExpressionParser$CAFallthroughContext)
- Object visitCase(ExpressionParser$CaseContext)
- Object visitMuFallthrough(ExpressionParser$MuFallthroughContext)
- Object visitRelationalExpr(ExpressionParser$RelationalExprContext)
- Object visitFunctionCallExpr(ExpressionParser$FunctionCallExprContext)
- Object visitAdFallthrough(ExpressionParser$AdFallthroughContext)
- Object visitCEFallthrough(ExpressionParser$CEFallthroughContext)
- Object visitPowerExpr(ExpressionParser$PowerExprContext)
- Object visitPwFallthrough(ExpressionParser$PwFallthroughContext)
- Object visitConditionalOrExpr(ExpressionParser$ConditionalOrExprContext)
- Object visitForStatement(ExpressionParser$ForStatementContext)
- Object visitAssignmentExpression(ExpressionParser$AssignmentExpressionContext)
- Object visitEqFallthrough(ExpressionParser$EqFallthroughContext)
- Object visitContinueStatement(ExpressionParser$ContinueStatementContext)
- Object visitIfStatement(ExpressionParser$IfStatementContext)
- Object visitTernaryExpr(ExpressionParser$TernaryExprContext)
- Object visitNotExpr(ExpressionParser$NotExprContext)
- Object visitMultiplicativeExpr(ExpressionParser$MultiplicativeExprContext)
- Object visitBlock(ExpressionParser$BlockContext)
- Object visitPlusMinusExpr(ExpressionParser$PlusMinusExprContext)
- Object visitReFallthrough(ExpressionParser$ReFallthroughContext)
- Object visitSimpleForStatement(ExpressionParser$SimpleForStatementContext)
- Object visitBreakStatement(ExpressionParser$BreakStatementContext)
- Object visitConstantExpr(ExpressionParser$ConstantExprContext)
- Object visitShFallthrough(ExpressionParser$ShFallthroughContext)
- Object visitAssignmentOperator(ExpressionParser$AssignmentOperatorContext)
- Object visitSwitchStatement(ExpressionParser$SwitchStatementContext)
- Object visitWrappedExpr(ExpressionParser$WrappedExprContext)
- Object visitPostCrementExpr(ExpressionParser$PostCrementExprContext)
- Object visitDefault(ExpressionParser$DefaultContext)
- Object visitStatement(ExpressionParser$StatementContext)
- Object visitAddExpr(ExpressionParser$AddExprContext)
- Object visitWhileStatement(ExpressionParser$WhileStatementContext)
- Object visitPostfixExpr(ExpressionParser$PostfixExprContext)
- Object visitConditionalAndExpr(ExpressionParser$ConditionalAndExprContext)
- Object visitIdExpr(ExpressionParser$IdExprContext)
- Object visitFunctionCall(ExpressionParser$FunctionCallContext)
- Object visitPreCrementExpr(ExpressionParser$PreCrementExprContext)
- Object visitCOFallthrough(ExpressionParser$COFallthroughContext)
- Object visitExpressionStatement(ExpressionParser$ExpressionStatementContext)
- Object visitConstantExpression(ExpressionParser$ConstantExpressionContext)
- Object visitEmptyStatement(ExpressionParser$EmptyStatementContext)
- Object visitAllStatements(ExpressionParser$AllStatementsContext)
- Object visitReturnStatement(ExpressionParser$ReturnStatementContext)
- Object visitStatements(ExpressionParser$StatementsContext)
- Object visitEqualityExpr(ExpressionParser$EqualityExprContext)

### Class: com.sk89q.worldedit.antlr.ExpressionBaseListener
Type: Class
Implements: com.sk89q.worldedit.antlr.ExpressionListener

Methods:
- void enterWhileStatement(ExpressionParser$WhileStatementContext)
- void enterPoFallthrough(ExpressionParser$PoFallthroughContext)
- void enterMultiplicativeExpr(ExpressionParser$MultiplicativeExprContext)
- void enterBlock(ExpressionParser$BlockContext)
- void enterCAFallthrough(ExpressionParser$CAFallthroughContext)
- void exitExpressionStatement(ExpressionParser$ExpressionStatementContext)
- void exitPwFallthrough(ExpressionParser$PwFallthroughContext)
- void enterForStatement(ExpressionParser$ForStatementContext)
- void enterConditionalAndExpr(ExpressionParser$ConditionalAndExprContext)
- void enterStatement(ExpressionParser$StatementContext)
- void exitFunctionCallExpr(ExpressionParser$FunctionCallExprContext)
- void enterEveryRule(ParserRuleContext)
- void exitConstantExpression(ExpressionParser$ConstantExpressionContext)
- void exitComplementExpr(ExpressionParser$ComplementExprContext)
- void enterIfStatement(ExpressionParser$IfStatementContext)
- void exitCase(ExpressionParser$CaseContext)
- void enterPostCrementExpr(ExpressionParser$PostCrementExprContext)
- void exitConditionalAndExpr(ExpressionParser$ConditionalAndExprContext)
- void enterReturnStatement(ExpressionParser$ReturnStatementContext)
- void enterConditionalOrExpr(ExpressionParser$ConditionalOrExprContext)
- void exitAssignmentExpression(ExpressionParser$AssignmentExpressionContext)
- void enterMuFallthrough(ExpressionParser$MuFallthroughContext)
- void enterReFallthrough(ExpressionParser$ReFallthroughContext)
- void exitEqFallthrough(ExpressionParser$EqFallthroughContext)
- void exitRelationalExpr(ExpressionParser$RelationalExprContext)
- void exitAdFallthrough(ExpressionParser$AdFallthroughContext)
- void enterShFallthrough(ExpressionParser$ShFallthroughContext)
- void exitWrappedExpr(ExpressionParser$WrappedExprContext)
- void exitCEFallthrough(ExpressionParser$CEFallthroughContext)
- void exitAddExpr(ExpressionParser$AddExprContext)
- void enterPlusMinusExpr(ExpressionParser$PlusMinusExprContext)
- void exitReFallthrough(ExpressionParser$ReFallthroughContext)
- void exitMultiplicativeExpr(ExpressionParser$MultiplicativeExprContext)
- void enterRelationalExpr(ExpressionParser$RelationalExprContext)
- void exitDefault(ExpressionParser$DefaultContext)
- void exitEveryRule(ParserRuleContext)
- void exitMuFallthrough(ExpressionParser$MuFallthroughContext)
- void exitEmptyStatement(ExpressionParser$EmptyStatementContext)
- void enterConstantExpression(ExpressionParser$ConstantExpressionContext)
- void exitExpression(ExpressionParser$ExpressionContext)
- void exitBreakStatement(ExpressionParser$BreakStatementContext)
- void exitContinueStatement(ExpressionParser$ContinueStatementContext)
- void enterAssignmentOperator(ExpressionParser$AssignmentOperatorContext)
- void enterExpression(ExpressionParser$ExpressionContext)
- void exitReturnStatement(ExpressionParser$ReturnStatementContext)
- void enterFunctionCall(ExpressionParser$FunctionCallContext)
- void enterBreakStatement(ExpressionParser$BreakStatementContext)
- void exitPostfixExpr(ExpressionParser$PostfixExprContext)
- void exitUaFallthrough(ExpressionParser$UaFallthroughContext)
- void enterEqualityExpr(ExpressionParser$EqualityExprContext)
- void exitAllStatements(ExpressionParser$AllStatementsContext)
- void exitEqualityExpr(ExpressionParser$EqualityExprContext)
- void visitTerminal(TerminalNode)
- void enterEmptyStatement(ExpressionParser$EmptyStatementContext)
- void exitPostCrementExpr(ExpressionParser$PostCrementExprContext)
- void enterShiftExpr(ExpressionParser$ShiftExprContext)
- void enterDefault(ExpressionParser$DefaultContext)
- void exitFunctionCall(ExpressionParser$FunctionCallContext)
- void exitWhileStatement(ExpressionParser$WhileStatementContext)
- void exitCAFallthrough(ExpressionParser$CAFallthroughContext)
- void enterNotExpr(ExpressionParser$NotExprContext)
- void enterUaFallthrough(ExpressionParser$UaFallthroughContext)
- void enterSimpleForStatement(ExpressionParser$SimpleForStatementContext)
- void enterCOFallthrough(ExpressionParser$COFallthroughContext)
- void enterPwFallthrough(ExpressionParser$PwFallthroughContext)
- void enterEqFallthrough(ExpressionParser$EqFallthroughContext)
- void enterTernaryExpr(ExpressionParser$TernaryExprContext)
- void enterWrappedExpr(ExpressionParser$WrappedExprContext)
- void enterAddExpr(ExpressionParser$AddExprContext)
- void exitIdExpr(ExpressionParser$IdExprContext)
- void exitDoStatement(ExpressionParser$DoStatementContext)
- void enterPowerExpr(ExpressionParser$PowerExprContext)
- void enterContinueStatement(ExpressionParser$ContinueStatementContext)
- void enterComplementExpr(ExpressionParser$ComplementExprContext)
- void exitAssignmentOperator(ExpressionParser$AssignmentOperatorContext)
- void exitShiftExpr(ExpressionParser$ShiftExprContext)
- void enterSwitchStatement(ExpressionParser$SwitchStatementContext)
- void exitForStatement(ExpressionParser$ForStatementContext)
- void exitIfStatement(ExpressionParser$IfStatementContext)
- void exitPoFallthrough(ExpressionParser$PoFallthroughContext)
- void exitNotExpr(ExpressionParser$NotExprContext)
- void enterPreCrementExpr(ExpressionParser$PreCrementExprContext)
- void exitStatement(ExpressionParser$StatementContext)
- void enterAllStatements(ExpressionParser$AllStatementsContext)
- void enterPostfixExpr(ExpressionParser$PostfixExprContext)
- void exitPlusMinusExpr(ExpressionParser$PlusMinusExprContext)
- void exitPowerExpr(ExpressionParser$PowerExprContext)
- void exitStatements(ExpressionParser$StatementsContext)
- void exitSimpleForStatement(ExpressionParser$SimpleForStatementContext)
- void exitPreCrementExpr(ExpressionParser$PreCrementExprContext)
- void enterDoStatement(ExpressionParser$DoStatementContext)
- void exitBlock(ExpressionParser$BlockContext)
- void exitSwitchStatement(ExpressionParser$SwitchStatementContext)
- void enterConstantExpr(ExpressionParser$ConstantExprContext)
- void exitConstantExpr(ExpressionParser$ConstantExprContext)
- void exitShFallthrough(ExpressionParser$ShFallthroughContext)
- void exitTernaryExpr(ExpressionParser$TernaryExprContext)
- void enterFunctionCallExpr(ExpressionParser$FunctionCallExprContext)
- void enterAssignment(ExpressionParser$AssignmentContext)
- void exitConditionalOrExpr(ExpressionParser$ConditionalOrExprContext)
- void enterAdFallthrough(ExpressionParser$AdFallthroughContext)
- void exitAssignment(ExpressionParser$AssignmentContext)
- void enterExpressionStatement(ExpressionParser$ExpressionStatementContext)
- void visitErrorNode(ErrorNode)
- void enterIdExpr(ExpressionParser$IdExprContext)
- void enterCEFallthrough(ExpressionParser$CEFallthroughContext)
- void enterStatements(ExpressionParser$StatementsContext)
- void enterAssignmentExpression(ExpressionParser$AssignmentExpressionContext)
- void enterCase(ExpressionParser$CaseContext)
- void exitCOFallthrough(ExpressionParser$COFallthroughContext)

### Class: com.sk89q.worldedit.antlr.ExpressionBaseVisitor
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.tree.AbstractParseTreeVisitor
Implements: com.sk89q.worldedit.antlr.ExpressionVisitor

Methods:
- Object visitDoStatement(ExpressionParser$DoStatementContext)
- Object visitComplementExpr(ExpressionParser$ComplementExprContext)
- Object visitExpression(ExpressionParser$ExpressionContext)
- Object visitPoFallthrough(ExpressionParser$PoFallthroughContext)
- Object visitShiftExpr(ExpressionParser$ShiftExprContext)
- Object visitAssignment(ExpressionParser$AssignmentContext)
- Object visitUaFallthrough(ExpressionParser$UaFallthroughContext)
- Object visitCAFallthrough(ExpressionParser$CAFallthroughContext)
- Object visitCase(ExpressionParser$CaseContext)
- Object visitMuFallthrough(ExpressionParser$MuFallthroughContext)
- Object visitRelationalExpr(ExpressionParser$RelationalExprContext)
- Object visitFunctionCallExpr(ExpressionParser$FunctionCallExprContext)
- Object visitAdFallthrough(ExpressionParser$AdFallthroughContext)
- Object visitCEFallthrough(ExpressionParser$CEFallthroughContext)
- Object visitPowerExpr(ExpressionParser$PowerExprContext)
- Object visitPwFallthrough(ExpressionParser$PwFallthroughContext)
- Object visitConditionalOrExpr(ExpressionParser$ConditionalOrExprContext)
- Object visitForStatement(ExpressionParser$ForStatementContext)
- Object visitAssignmentExpression(ExpressionParser$AssignmentExpressionContext)
- Object visitEqFallthrough(ExpressionParser$EqFallthroughContext)
- Object visitContinueStatement(ExpressionParser$ContinueStatementContext)
- Object visitIfStatement(ExpressionParser$IfStatementContext)
- Object visitTernaryExpr(ExpressionParser$TernaryExprContext)
- Object visitNotExpr(ExpressionParser$NotExprContext)
- Object visitMultiplicativeExpr(ExpressionParser$MultiplicativeExprContext)
- Object visitBlock(ExpressionParser$BlockContext)
- Object visitPlusMinusExpr(ExpressionParser$PlusMinusExprContext)
- Object visitReFallthrough(ExpressionParser$ReFallthroughContext)
- Object visitSimpleForStatement(ExpressionParser$SimpleForStatementContext)
- Object visitBreakStatement(ExpressionParser$BreakStatementContext)
- Object visitConstantExpr(ExpressionParser$ConstantExprContext)
- Object visitShFallthrough(ExpressionParser$ShFallthroughContext)
- Object visitAssignmentOperator(ExpressionParser$AssignmentOperatorContext)
- Object visitSwitchStatement(ExpressionParser$SwitchStatementContext)
- Object visitWrappedExpr(ExpressionParser$WrappedExprContext)
- Object visitPostCrementExpr(ExpressionParser$PostCrementExprContext)
- Object visitDefault(ExpressionParser$DefaultContext)
- Object visitStatement(ExpressionParser$StatementContext)
- Object visitAddExpr(ExpressionParser$AddExprContext)
- Object visitWhileStatement(ExpressionParser$WhileStatementContext)
- Object visitPostfixExpr(ExpressionParser$PostfixExprContext)
- Object visitConditionalAndExpr(ExpressionParser$ConditionalAndExprContext)
- Object visitIdExpr(ExpressionParser$IdExprContext)
- Object visitFunctionCall(ExpressionParser$FunctionCallContext)
- Object visitPreCrementExpr(ExpressionParser$PreCrementExprContext)
- Object visitCOFallthrough(ExpressionParser$COFallthroughContext)
- Object visitExpressionStatement(ExpressionParser$ExpressionStatementContext)
- Object visitConstantExpression(ExpressionParser$ConstantExpressionContext)
- Object visitEmptyStatement(ExpressionParser$EmptyStatementContext)
- Object visitAllStatements(ExpressionParser$AllStatementsContext)
- Object visitReturnStatement(ExpressionParser$ReturnStatementContext)
- Object visitStatements(ExpressionParser$StatementsContext)
- Object visitEqualityExpr(ExpressionParser$EqualityExprContext)

### Class: com.sk89q.worldedit.antlr.ExpressionLexer
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.Lexer

Methods:
- String getSerializedATN()
- String[] getTokenNames()
- String[] getRuleNames()
- Vocabulary getVocabulary()
- String[] getModeNames()
- String getGrammarFileName()
- ATN getATN()
- String[] getChannelNames()

### Class: com.sk89q.worldedit.antlr.ExpressionParser
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.Parser

Methods:
- ExpressionParser$AdditiveExpressionContext additiveExpression() throws RecognitionException
- boolean sempred(RuleContext, int, int)
- ExpressionParser$RelationalExpressionContext relationalExpression() throws RecognitionException
- ExpressionParser$AssignmentOperatorContext assignmentOperator() throws RecognitionException
- ExpressionParser$StatementsContext statements() throws RecognitionException
- ExpressionParser$ReturnStatementContext returnStatement() throws RecognitionException
- ExpressionParser$UnprioritizedExpressionContext unprioritizedExpression() throws RecognitionException
- ExpressionParser$SwitchStatementContext switchStatement() throws RecognitionException
- String getSerializedATN()
- String[] getTokenNames()
- ExpressionParser$ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException
- ExpressionParser$SimpleForStatementContext simpleForStatement() throws RecognitionException
- ExpressionParser$StatementContext statement() throws RecognitionException
- ExpressionParser$ExpressionStatementContext expressionStatement() throws RecognitionException
- ExpressionParser$BlockContext block() throws RecognitionException
- String getGrammarFileName()
- ExpressionParser$UnaryExpressionContext unaryExpression() throws RecognitionException
- ExpressionParser$PostfixExpressionContext postfixExpression() throws RecognitionException
- ExpressionParser$EmptyStatementContext emptyStatement() throws RecognitionException
- ExpressionParser$ExpressionContext expression() throws RecognitionException
- ExpressionParser$ConstantExpressionContext constantExpression() throws RecognitionException
- ExpressionParser$ShiftExpressionContext shiftExpression() throws RecognitionException
- ExpressionParser$ConditionalExpressionContext conditionalExpression() throws RecognitionException
- ExpressionParser$AssignmentContext assignment() throws RecognitionException
- ExpressionParser$AssignmentExpressionContext assignmentExpression() throws RecognitionException
- ExpressionParser$BreakStatementContext breakStatement() throws RecognitionException
- ExpressionParser$ForStatementContext forStatement() throws RecognitionException
- Vocabulary getVocabulary()
- ExpressionParser$MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException
- ExpressionParser$ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException
- ExpressionParser$IfStatementContext ifStatement() throws RecognitionException
- ATN getATN()
- ExpressionParser$WhileStatementContext whileStatement() throws RecognitionException
- ExpressionParser$PowerExpressionContext powerExpression() throws RecognitionException
- ExpressionParser$DoStatementContext doStatement() throws RecognitionException
- String[] getRuleNames()
- ExpressionParser$FunctionCallContext functionCall() throws RecognitionException
- ExpressionParser$SwitchLabelContext switchLabel() throws RecognitionException
- ExpressionParser$AllStatementsContext allStatements() throws RecognitionException
- ExpressionParser$EqualityExpressionContext equalityExpression() throws RecognitionException
- ExpressionParser$ContinueStatementContext continueStatement() throws RecognitionException

## Package: com.sk89q.worldedit.antlr4.runtime

### Class: com.sk89q.worldedit.antlr4.runtime.ANTLRErrorListener
Type: Interface

Methods:
- void reportContextSensitivity(Parser, DFA, int, int, int, ATNConfigSet)
- void syntaxError(Recognizer, Object, int, int, String, RecognitionException)
- void reportAmbiguity(Parser, DFA, int, int, boolean, BitSet, ATNConfigSet)
- void reportAttemptingFullContext(Parser, DFA, int, int, BitSet, ATNConfigSet)

### Class: com.sk89q.worldedit.antlr4.runtime.ANTLRErrorStrategy
Type: Interface

Methods:
- void recover(Parser, RecognitionException) throws RecognitionException
- void reportMatch(Parser)
- boolean inErrorRecoveryMode(Parser)
- void reset(Parser)
- void reportError(Parser, RecognitionException)
- void sync(Parser) throws RecognitionException
- Token recoverInline(Parser) throws RecognitionException

### Class: com.sk89q.worldedit.antlr4.runtime.CharStream
Type: Interface
Implements: com.sk89q.worldedit.antlr4.runtime.IntStream

Methods:
- String getText(Interval)

### Class: com.sk89q.worldedit.antlr4.runtime.IntStream
Type: Interface

Methods:
- String getSourceName()
- int size()
- int LA(int)
- void release(int)
- int index()
- void consume()
- void seek(int)
- int mark()

### Class: com.sk89q.worldedit.antlr4.runtime.Token
Type: Interface

Methods:
- int getStopIndex()
- int getStartIndex()
- int getChannel()
- int getType()
- String getText()
- int getCharPositionInLine()
- int getLine()
- int getTokenIndex()
- CharStream getInputStream()
- TokenSource getTokenSource()

### Class: com.sk89q.worldedit.antlr4.runtime.TokenFactory
Type: Interface

Methods:
- Token create(Pair, int, String, int, int, int, int, int)
- Token create(int, String)

### Class: com.sk89q.worldedit.antlr4.runtime.TokenSource
Type: Interface

Methods:
- String getSourceName()
- TokenFactory getTokenFactory()
- Token nextToken()
- int getCharPositionInLine()
- void setTokenFactory(TokenFactory)
- int getLine()
- CharStream getInputStream()

### Class: com.sk89q.worldedit.antlr4.runtime.TokenStream
Type: Interface
Implements: com.sk89q.worldedit.antlr4.runtime.IntStream

Methods:
- String getText(Interval)
- String getText()
- String getText(RuleContext)
- String getText(Token, Token)
- Token get(int)
- Token LT(int)
- TokenSource getTokenSource()

### Class: com.sk89q.worldedit.antlr4.runtime.Vocabulary
Type: Interface

Methods:
- String getDisplayName(int)
- String getLiteralName(int)
- String getSymbolicName(int)
- int getMaxTokenType()

### Class: com.sk89q.worldedit.antlr4.runtime.WritableToken
Type: Interface
Implements: com.sk89q.worldedit.antlr4.runtime.Token

Methods:
- void setTokenIndex(int)
- void setLine(int)
- void setChannel(int)
- void setType(int)
- void setCharPositionInLine(int)
- void setText(String)

### Class: com.sk89q.worldedit.antlr4.runtime.ANTLRInputStream
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.CharStream

Methods:
- String getSourceName()
- int size()
- void load(Reader, int, int) throws IOException
- int LA(int)
- String getText(Interval)
- void release(int)
- int LT(int)
- int index()
- void reset()
- String toString()
- void consume()
- void seek(int)
- int mark()

### Class: com.sk89q.worldedit.antlr4.runtime.BailErrorStrategy
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.DefaultErrorStrategy

Methods:
- void recover(Parser, RecognitionException)
- void sync(Parser)
- Token recoverInline(Parser) throws RecognitionException

### Class: com.sk89q.worldedit.antlr4.runtime.BaseErrorListener
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.ANTLRErrorListener

Methods:
- void reportContextSensitivity(Parser, DFA, int, int, int, ATNConfigSet)
- void syntaxError(Recognizer, Object, int, int, String, RecognitionException)
- void reportAmbiguity(Parser, DFA, int, int, boolean, BitSet, ATNConfigSet)
- void reportAttemptingFullContext(Parser, DFA, int, int, BitSet, ATNConfigSet)

### Class: com.sk89q.worldedit.antlr4.runtime.BufferedTokenStream
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.TokenStream

Methods:
- String getSourceName()
- String getText()
- String getText(Interval)
- String getText(RuleContext)
- String getText(Token, Token)
- void release(int)
- List getTokens()
- List getTokens(int, int)
- List getTokens(int, int, Set)
- List getTokens(int, int, int)
- List getHiddenTokensToLeft(int, int)
- List getHiddenTokensToLeft(int)
- Token LT(int)
- int index()
- void consume()
- void fill()
- void seek(int)
- int size()
- int LA(int)
- Token get(int)
- List get(int, int)
- List getHiddenTokensToRight(int, int)
- List getHiddenTokensToRight(int)
- void reset()
- void setTokenSource(TokenSource)
- TokenSource getTokenSource()
- int mark()

### Class: com.sk89q.worldedit.antlr4.runtime.CharStreams
Type: Class

Methods:
- CharStream fromPath(Path) throws IOException
- CharStream fromPath(Path, Charset) throws IOException
- CharStream fromChannel(ReadableByteChannel) throws IOException
- CharStream fromChannel(ReadableByteChannel, Charset) throws IOException
- CodePointCharStream fromChannel(ReadableByteChannel, int, CodingErrorAction, String) throws IOException
- CodePointCharStream fromChannel(ReadableByteChannel, Charset, int, CodingErrorAction, String, long) throws IOException
- CharStream fromStream(InputStream) throws IOException
- CharStream fromStream(InputStream, Charset) throws IOException
- CharStream fromStream(InputStream, Charset, long) throws IOException
- CodePointCharStream fromString(String)
- CodePointCharStream fromString(String, String)
- CharStream fromFileName(String) throws IOException
- CharStream fromFileName(String, Charset) throws IOException
- CodePointCharStream fromReader(Reader) throws IOException
- CodePointCharStream fromReader(Reader, String) throws IOException

### Class: com.sk89q.worldedit.antlr4.runtime.CodePointBuffer
Type: Class

Methods:
- CodePointBuffer withChars(CharBuffer)
- CodePointBuffer withInts(IntBuffer)
- CodePointBuffer withBytes(ByteBuffer)
- int get(int)
- CodePointBuffer$Builder builder(int)
- int position()
- void position(int)
- int remaining()

### Class: com.sk89q.worldedit.antlr4.runtime.CodePointCharStream
Type: Abstract Class
Implements: com.sk89q.worldedit.antlr4.runtime.CharStream

Methods:
- String getSourceName()
- int size()
- void release(int)
- int index()
- String toString()
- void consume()
- CodePointCharStream fromBuffer(CodePointBuffer)
- CodePointCharStream fromBuffer(CodePointBuffer, String)
- void seek(int)
- int mark()

### Class: com.sk89q.worldedit.antlr4.runtime.CommonToken
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.WritableToken, java.io.Serializable

Methods:
- void setTokenIndex(int)
- int getStopIndex()
- int getStartIndex()
- String getText()
- int getCharPositionInLine()
- int getLine()
- void setChannel(int)
- void setType(int)
- CharStream getInputStream()
- void setCharPositionInLine(int)
- void setStartIndex(int)
- int getChannel()
- int getType()
- String toString()
- String toString(Recognizer)
- void setLine(int)
- int getTokenIndex()
- void setStopIndex(int)
- TokenSource getTokenSource()
- void setText(String)

### Class: com.sk89q.worldedit.antlr4.runtime.CommonTokenFactory
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.TokenFactory

Methods:
- CommonToken create(Pair, int, String, int, int, int, int, int)
- CommonToken create(int, String)
- Token create(int, String)
- Token create(Pair, int, String, int, int, int, int, int)

### Class: com.sk89q.worldedit.antlr4.runtime.CommonTokenStream
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.BufferedTokenStream

Methods:
- int getNumberOfOnChannelTokens()
- Token LT(int)

### Class: com.sk89q.worldedit.antlr4.runtime.ConsoleErrorListener
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.BaseErrorListener

Methods:
- void syntaxError(Recognizer, Object, int, int, String, RecognitionException)

### Class: com.sk89q.worldedit.antlr4.runtime.DefaultErrorStrategy
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.ANTLRErrorStrategy

Methods:
- void recover(Parser, RecognitionException)
- void reportMatch(Parser)
- boolean inErrorRecoveryMode(Parser)
- void reset(Parser)
- void reportError(Parser, RecognitionException)
- void sync(Parser) throws RecognitionException
- Token recoverInline(Parser) throws RecognitionException

### Class: com.sk89q.worldedit.antlr4.runtime.FailedPredicateException
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.RecognitionException

Methods:
- int getRuleIndex()
- String getPredicate()
- int getPredIndex()

### Class: com.sk89q.worldedit.antlr4.runtime.InputMismatchException
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.RecognitionException

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.InterpreterRuleContext
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.ParserRuleContext

Methods:
- int getRuleIndex()

### Class: com.sk89q.worldedit.antlr4.runtime.Lexer
Type: Abstract Class
Extends: com.sk89q.worldedit.antlr4.runtime.Recognizer
Implements: com.sk89q.worldedit.antlr4.runtime.TokenSource

Methods:
- String getCharErrorDisplay(int)
- String getSourceName()
- List getAllTokens()
- void pushMode(int)
- int getCharPositionInLine()
- void skip()
- void setChannel(int)
- String[] getTokenNames()
- void mode(int)
- int getChannel()
- void setInputStream(IntStream)
- String[] getModeNames()
- String[] getChannelNames()
- void recover(LexerNoViableAltException)
- void recover(RecognitionException)
- String getText()
- int popMode()
- void more()
- void notifyListeners(LexerNoViableAltException)
- int getLine()
- void setTokenFactory(TokenFactory)
- void setType(int)
- CharStream getInputStream()
- IntStream getInputStream()
- void setCharPositionInLine(int)
- String getErrorDisplay(String)
- String getErrorDisplay(int)
- int getType()
- void setToken(Token)
- TokenFactory getTokenFactory()
- Token nextToken()
- Token getToken()
- void reset()
- void setLine(int)
- Token emitEOF()
- void emit(Token)
- Token emit()
- int getCharIndex()
- void setText(String)

### Class: com.sk89q.worldedit.antlr4.runtime.LexerNoViableAltException
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.RecognitionException

Methods:
- ATNConfigSet getDeadEndConfigs()
- int getStartIndex()
- String toString()
- CharStream getInputStream()
- IntStream getInputStream()

### Class: com.sk89q.worldedit.antlr4.runtime.ListTokenSource
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.TokenSource

Methods:
- String getSourceName()
- TokenFactory getTokenFactory()
- Token nextToken()
- int getCharPositionInLine()
- void setTokenFactory(TokenFactory)
- int getLine()
- CharStream getInputStream()

### Class: com.sk89q.worldedit.antlr4.runtime.NoViableAltException
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.RecognitionException

Methods:
- Token getStartToken()
- ATNConfigSet getDeadEndConfigs()

### Class: com.sk89q.worldedit.antlr4.runtime.Parser
Type: Abstract Class
Extends: com.sk89q.worldedit.antlr4.runtime.Recognizer

Methods:
- boolean getBuildParseTree()
- int getRuleIndex(String)
- boolean inContext(String)
- TerminalNode createTerminalNode(ParserRuleContext, Token)
- ANTLRErrorStrategy getErrorHandler()
- ParseTreePattern compileParseTreePattern(String, int)
- ParseTreePattern compileParseTreePattern(String, int, Lexer)
- Token getCurrentToken()
- void setContext(ParserRuleContext)
- ATN getATNWithBypassAlts()
- boolean isExpectedToken(int)
- void removeParseListeners()
- void enterOuterAlt(ParserRuleContext, int)
- IntervalSet getExpectedTokens()
- boolean getTrimParseTree()
- List getParseListeners()
- List getRuleInvocationStack()
- List getRuleInvocationStack(RuleContext)
- void setTokenFactory(TokenFactory)
- void setProfile(boolean)
- IntervalSet getExpectedTokensWithinCurrentRule()
- void setBuildParseTree(boolean)
- void notifyErrorListeners(String)
- void notifyErrorListeners(Token, String, RecognitionException)
- TokenStream getInputStream()
- IntStream getInputStream()
- void addParseListener(ParseTreeListener)
- void enterRule(ParserRuleContext, int, int)
- void enterRecursionRule(ParserRuleContext, int)
- void enterRecursionRule(ParserRuleContext, int, int, int)
- void removeParseListener(ParseTreeListener)
- void reset()
- boolean isTrace()
- List getDFAStrings()
- ParserRuleContext getInvokingContext(int)
- ParserRuleContext getRuleContext()
- int getNumberOfSyntaxErrors()
- void setTrace(boolean)
- void dumpDFA()
- void dumpDFA(PrintStream)
- String getSourceName()
- void exitRule()
- ErrorNode createErrorNode(ParserRuleContext, Token)
- int getPrecedence()
- void pushNewRecursionContext(ParserRuleContext, int, int)
- boolean precpred(RuleContext, int)
- Token consume()
- TokenStream getTokenStream()
- void setInputStream(IntStream)
- void setTokenStream(TokenStream)
- void setTrimParseTree(boolean)
- Token matchWildcard() throws RecognitionException
- boolean isMatchedEOF()
- Token match(int) throws RecognitionException
- ParseInfo getParseInfo()
- void unrollRecursionContexts(ParserRuleContext)
- TokenFactory getTokenFactory()
- void setErrorHandler(ANTLRErrorStrategy)
- ParserRuleContext getContext()

### Class: com.sk89q.worldedit.antlr4.runtime.ParserInterpreter
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.Parser

Methods:
- void enterRecursionRule(ParserRuleContext, int, int, int)
- String[] getTokenNames()
- InterpreterRuleContext getOverrideDecisionRoot()
- String[] getRuleNames()
- void reset()
- Vocabulary getVocabulary()
- ParserRuleContext parse(int)
- String getGrammarFileName()
- InterpreterRuleContext getRootContext()
- void addDecisionOverride(int, int, int)
- ATN getATN()

### Class: com.sk89q.worldedit.antlr4.runtime.ParserRuleContext
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.RuleContext

Methods:
- ErrorNode addErrorNode(ErrorNode)
- ErrorNode addErrorNode(Token)
- ParserRuleContext getParent()
- RuleContext getParent()
- ParseTree getParent()
- Tree getParent()
- void exitRule(ParseTreeListener)
- Token getStart()
- Interval getSourceInterval()
- List getTokens(int)
- ParseTree getChild(int)
- ParseTree getChild(Class, int)
- Tree getChild(int)
- void enterRule(ParseTreeListener)
- void copyFrom(ParserRuleContext)
- List getRuleContexts(Class)
- void removeLastChild()
- int getChildCount()
- TerminalNode getToken(int, int)
- ParseTree addAnyChild(ParseTree)
- String toInfoString(Parser)
- Token getStop()
- RuleContext addChild(RuleContext)
- TerminalNode addChild(TerminalNode)
- TerminalNode addChild(Token)
- ParserRuleContext getRuleContext(Class, int)

### Class: com.sk89q.worldedit.antlr4.runtime.ProxyErrorListener
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.ANTLRErrorListener

Methods:
- void reportContextSensitivity(Parser, DFA, int, int, int, ATNConfigSet)
- void syntaxError(Recognizer, Object, int, int, String, RecognitionException)
- void reportAmbiguity(Parser, DFA, int, int, boolean, BitSet, ATNConfigSet)
- void reportAttemptingFullContext(Parser, DFA, int, int, BitSet, ATNConfigSet)

### Class: com.sk89q.worldedit.antlr4.runtime.RecognitionException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- IntervalSet getExpectedTokens()
- Recognizer getRecognizer()
- int getOffendingState()
- RuleContext getCtx()
- Token getOffendingToken()
- IntStream getInputStream()

### Class: com.sk89q.worldedit.antlr4.runtime.Recognizer
Type: Abstract Class

Methods:
- int getTokenType(String)
- boolean sempred(RuleContext, int, int)
- boolean precpred(RuleContext, int)
- ANTLRErrorListener getErrorListenerDispatch()
- String getSerializedATN()
- String[] getTokenNames()
- String getTokenErrorDisplay(Token)
- Map getTokenTypeMap()
- void setInputStream(IntStream)
- void action(RuleContext, int, int)
- String getGrammarFileName()
- ATNSimulator getInterpreter()
- Map getRuleIndexMap()
- void setTokenFactory(TokenFactory)
- void removeErrorListener(ANTLRErrorListener)
- Vocabulary getVocabulary()
- IntStream getInputStream()
- ATN getATN()
- ParseInfo getParseInfo()
- void addErrorListener(ANTLRErrorListener)
- int getState()
- void setInterpreter(ATNSimulator)
- TokenFactory getTokenFactory()
- List getErrorListeners()
- String[] getRuleNames()
- void removeErrorListeners()
- void setState(int)
- String getErrorHeader(RecognitionException)

### Class: com.sk89q.worldedit.antlr4.runtime.RuleContext
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.tree.RuleNode

Methods:
- RuleContext getParent()
- ParseTree getParent()
- Tree getParent()
- int getRuleIndex()
- Interval getSourceInterval()
- String getText()
- ParseTree getChild(int)
- Tree getChild(int)
- boolean isEmpty()
- void setAltNumber(int)
- Object accept(ParseTreeVisitor)
- int getChildCount()
- RuleContext getPayload()
- Object getPayload()
- int depth()
- int getAltNumber()
- String toString()
- String toString(Recognizer)
- String toString(List)
- String toString(Recognizer, RuleContext)
- String toString(List, RuleContext)
- void setParent(RuleContext)
- String toStringTree(Parser)
- String toStringTree(List)
- String toStringTree()
- RuleContext getRuleContext()

### Class: com.sk89q.worldedit.antlr4.runtime.RuntimeMetaData
Type: Class

Methods:
- String getMajorMinorVersion(String)
- void checkVersion(String, String)
- String getRuntimeVersion()

### Class: com.sk89q.worldedit.antlr4.runtime.VocabularyImpl
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.Vocabulary

Methods:
- String[] getLiteralNames()
- String[] getSymbolicNames()
- String getDisplayName(int)
- String getLiteralName(int)
- String getSymbolicName(int)
- String[] getDisplayNames()
- Vocabulary fromTokenNames(String[])
- int getMaxTokenType()

## Package: com.sk89q.worldedit.antlr4.runtime.atn

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerAction
Type: Interface

Methods:
- LexerActionType getActionType()
- boolean isPositionDependent()
- void execute(Lexer)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ATN
Type: Class

Methods:
- DecisionState getDecisionState(int)
- IntervalSet getExpectedTokens(int, RuleContext)
- int getNumberOfDecisions()
- void removeState(ATNState)
- void addState(ATNState)
- IntervalSet nextTokens(ATNState, RuleContext)
- IntervalSet nextTokens(ATNState)
- int defineDecisionState(DecisionState)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ATNConfig
Type: Class

Methods:
- boolean isPrecedenceFilterSuppressed()
- int hashCode()
- boolean equals(Object)
- boolean equals(ATNConfig)
- void setPrecedenceFilterSuppressed(boolean)
- String toString()
- String toString(Recognizer, boolean)
- int getOuterContextDepth()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ATNConfigSet
Type: Class
Implements: java.util.Set

Methods:
- boolean add(ATNConfig)
- boolean add(ATNConfig, DoubleKeyMap)
- boolean add(Object)
- boolean isReadonly()
- boolean containsFast(ATNConfig)
- boolean containsAll(Collection)
- void clear()
- boolean isEmpty()
- void setReadonly(boolean)
- boolean remove(Object)
- boolean removeAll(Collection)
- Iterator iterator()
- boolean contains(Object)
- int size()
- boolean addAll(Collection)
- int hashCode()
- boolean equals(Object)
- void optimizeConfigs(ATNSimulator)
- ATNConfig get(int)
- List elements()
- ATNConfig[] toArray()
- Object[] toArray(Object[])
- Object[] toArray()
- String toString()
- Set getStates()
- List getPredicates()
- BitSet getAlts()
- boolean retainAll(Collection)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ATNDeserializationOptions
Type: Class

Methods:
- ATNDeserializationOptions getDefaultOptions()
- boolean isReadOnly()
- boolean isGenerateRuleBypassTransitions()
- void setGenerateRuleBypassTransitions(boolean)
- void setVerifyATN(boolean)
- boolean isVerifyATN()
- void makeReadOnly()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ATNDeserializer
Type: Class

Methods:
- int[] decodeIntsEncodedAs16BitWords(char[])
- int[] decodeIntsEncodedAs16BitWords(char[], boolean)
- IntegerList encodeIntsWith16BitWords(IntegerList)
- ATN deserialize(char[])
- ATN deserialize(int[])

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ATNSimulator
Type: Abstract Class

Methods:
- PredictionContext getCachedContext(PredictionContext)
- PredictionContextCache getSharedContextCache()
- void clearDFA()
- void reset()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ATNState
Type: Abstract Class

Methods:
- Transition[] getTransitions()
- void setRuleIndex(int)
- int hashCode()
- Transition removeTransition(int)
- void setTransition(int, Transition)
- boolean equals(Object)
- String toString()
- boolean onlyHasEpsilonTransitions()
- void addTransition(Transition)
- void addTransition(int, Transition)
- boolean isNonGreedyExitState()
- int getStateType()
- int getNumberOfTransitions()
- Transition transition(int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ATNType
Type: Enum
Extends: java.lang.Enum

Methods:
- ATNType valueOf(String)
- ATNType[] values()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.AbstractPredicateTransition
Type: Abstract Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.Transition

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ActionTransition
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.Transition

Methods:
- int getSerializationType()
- String toString()
- boolean isEpsilon()
- boolean matches(int, int, int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.AmbiguityInfo
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.DecisionEventInfo

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ArrayPredictionContext
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.PredictionContext

Methods:
- PredictionContext getParent(int)
- int size()
- boolean equals(Object)
- boolean isEmpty()
- String toString()
- int getReturnState(int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.AtomTransition
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.Transition

Methods:
- int getSerializationType()
- String toString()
- IntervalSet label()
- boolean matches(int, int, int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.BasicBlockStartState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.BlockStartState

Methods:
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.BasicState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ATNState

Methods:
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.BlockEndState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ATNState

Methods:
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.BlockStartState
Type: Abstract Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.DecisionState

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ContextSensitivityInfo
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.DecisionEventInfo

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.atn.DecisionEventInfo
Type: Class

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.atn.DecisionInfo
Type: Class

Methods:
- String toString()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.DecisionState
Type: Abstract Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ATNState

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.atn.EmptyPredictionContext
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.SingletonPredictionContext

Methods:
- PredictionContext getParent(int)
- int size()
- boolean equals(Object)
- boolean isEmpty()
- String toString()
- int getReturnState(int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.EpsilonTransition
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.Transition

Methods:
- int getSerializationType()
- int outermostPrecedenceReturn()
- String toString()
- boolean isEpsilon()
- boolean matches(int, int, int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ErrorInfo
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.DecisionEventInfo

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LL1Analyzer
Type: Class

Methods:
- IntervalSet[] getDecisionLookahead(ATNState)
- IntervalSet LOOK(ATNState, RuleContext)
- IntervalSet LOOK(ATNState, ATNState, RuleContext)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerATNConfig
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ATNConfig

Methods:
- int hashCode()
- LexerActionExecutor getLexerActionExecutor()
- boolean equals(ATNConfig)
- boolean hasPassedThroughNonGreedyDecision()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerATNSimulator
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ATNSimulator

Methods:
- DFA getDFA(int)
- String getText(CharStream)
- String getTokenName(int)
- int getCharPositionInLine()
- int getLine()
- void clearDFA()
- int match(CharStream, int)
- void reset()
- void copyState(LexerATNSimulator)
- void consume(CharStream)
- void setLine(int)
- void setCharPositionInLine(int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerActionExecutor
Type: Class

Methods:
- int hashCode()
- LexerActionExecutor fixOffsetBeforeMatch(int)
- boolean equals(Object)
- void execute(Lexer, CharStream, int)
- LexerAction[] getLexerActions()
- LexerActionExecutor append(LexerActionExecutor, LexerAction)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerActionType
Type: Enum
Extends: java.lang.Enum

Methods:
- LexerActionType valueOf(String)
- LexerActionType[] values()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerChannelAction
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.atn.LexerAction

Methods:
- LexerActionType getActionType()
- int getChannel()
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean isPositionDependent()
- void execute(Lexer)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerCustomAction
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.atn.LexerAction

Methods:
- int getRuleIndex()
- LexerActionType getActionType()
- int getActionIndex()
- int hashCode()
- boolean equals(Object)
- boolean isPositionDependent()
- void execute(Lexer)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerIndexedCustomAction
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.atn.LexerAction

Methods:
- LexerActionType getActionType()
- int hashCode()
- boolean equals(Object)
- int getOffset()
- LexerAction getAction()
- boolean isPositionDependent()
- void execute(Lexer)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerModeAction
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.atn.LexerAction

Methods:
- LexerActionType getActionType()
- int hashCode()
- boolean equals(Object)
- String toString()
- int getMode()
- boolean isPositionDependent()
- void execute(Lexer)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerMoreAction
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.atn.LexerAction

Methods:
- LexerActionType getActionType()
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean isPositionDependent()
- void execute(Lexer)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerPopModeAction
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.atn.LexerAction

Methods:
- LexerActionType getActionType()
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean isPositionDependent()
- void execute(Lexer)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerPushModeAction
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.atn.LexerAction

Methods:
- LexerActionType getActionType()
- int hashCode()
- boolean equals(Object)
- String toString()
- int getMode()
- boolean isPositionDependent()
- void execute(Lexer)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerSkipAction
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.atn.LexerAction

Methods:
- LexerActionType getActionType()
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean isPositionDependent()
- void execute(Lexer)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LexerTypeAction
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.atn.LexerAction

Methods:
- LexerActionType getActionType()
- int getType()
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean isPositionDependent()
- void execute(Lexer)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LookaheadEventInfo
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.DecisionEventInfo

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.atn.LoopEndState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ATNState

Methods:
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.NotSetTransition
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.SetTransition

Methods:
- int getSerializationType()
- String toString()
- boolean matches(int, int, int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.OrderedATNConfigSet
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ATNConfigSet

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ParseInfo
Type: Class

Methods:
- int getDFASize()
- int getDFASize(int)
- long getTotalSLLLookaheadOps()
- long getTotalATNLookaheadOps()
- long getTotalLLATNLookaheadOps()
- long getTotalTimeInPrediction()
- DecisionInfo[] getDecisionInfo()
- long getTotalSLLATNLookaheadOps()
- long getTotalLLLookaheadOps()
- List getLLDecisions()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ParserATNSimulator
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ATNSimulator

Methods:
- void setPredictionMode(PredictionMode)
- void dumpDeadEndConfigs(NoViableAltException)
- String getLookaheadName(TokenStream)
- String getRuleName(int)
- String getSafeEnv(String)
- PredictionMode getPredictionMode()
- Parser getParser()
- String getTokenName(int)
- void clearDFA()
- ATNConfig precedenceTransition(ATNConfig, PrecedencePredicateTransition, boolean, boolean, boolean)
- void reset()
- int adaptivePredict(TokenStream, int, ParserRuleContext)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.PlusBlockStartState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.BlockStartState

Methods:
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.PlusLoopbackState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.DecisionState

Methods:
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.PrecedencePredicateTransition
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.AbstractPredicateTransition

Methods:
- int getSerializationType()
- SemanticContext$PrecedencePredicate getPredicate()
- String toString()
- boolean isEpsilon()
- boolean matches(int, int, int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.PredicateEvalInfo
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.DecisionEventInfo

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.atn.PredicateTransition
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.AbstractPredicateTransition

Methods:
- int getSerializationType()
- SemanticContext$Predicate getPredicate()
- String toString()
- boolean isEpsilon()
- boolean matches(int, int, int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.PredictionContext
Type: Abstract Class

Methods:
- PredictionContext getParent(int)
- PredictionContext mergeRoot(SingletonPredictionContext, SingletonPredictionContext, boolean)
- List getAllContextNodes(PredictionContext)
- boolean hasEmptyPath()
- boolean isEmpty()
- PredictionContext mergeSingletons(SingletonPredictionContext, SingletonPredictionContext, boolean, DoubleKeyMap)
- PredictionContext getCachedContext(PredictionContext, PredictionContextCache, IdentityHashMap)
- void getAllContextNodes_(PredictionContext, List, Map)
- PredictionContext fromRuleContext(ATN, RuleContext)
- String[] toStrings(Recognizer, int)
- String[] toStrings(Recognizer, PredictionContext, int)
- int size()
- String toDOTString(PredictionContext)
- int hashCode()
- PredictionContext merge(PredictionContext, PredictionContext, boolean, DoubleKeyMap)
- boolean equals(Object)
- String toString(Recognizer)
- PredictionContext mergeArrays(ArrayPredictionContext, ArrayPredictionContext, boolean, DoubleKeyMap)
- int getReturnState(int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.PredictionContextCache
Type: Class

Methods:
- PredictionContext add(PredictionContext)
- int size()
- PredictionContext get(PredictionContext)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.PredictionMode
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean hasConfigInRuleStopState(ATNConfigSet)
- PredictionMode valueOf(String)
- PredictionMode[] values()
- int getSingleViableAlt(Collection)
- boolean hasSLLConflictTerminatingPrediction(PredictionMode, ATNConfigSet)
- boolean hasStateAssociatedWithOneAlt(ATNConfigSet)
- boolean hasNonConflictingAltSet(Collection)
- Collection getConflictingAltSubsets(ATNConfigSet)
- int getUniqueAlt(Collection)
- boolean allSubsetsConflict(Collection)
- int resolvesToJustOneViableAlt(Collection)
- boolean allSubsetsEqual(Collection)
- Map getStateToAltMap(ATNConfigSet)
- boolean hasConflictingAltSet(Collection)
- boolean allConfigsInRuleStopStates(ATNConfigSet)
- BitSet getAlts(Collection)
- BitSet getAlts(ATNConfigSet)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.ProfilingATNSimulator
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ParserATNSimulator

Methods:
- DFAState getCurrentState()
- DecisionInfo[] getDecisionInfo()
- int adaptivePredict(TokenStream, int, ParserRuleContext)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.RangeTransition
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.Transition

Methods:
- int getSerializationType()
- String toString()
- IntervalSet label()
- boolean matches(int, int, int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.RuleStartState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ATNState

Methods:
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.RuleStopState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ATNState

Methods:
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.RuleTransition
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.Transition

Methods:
- int getSerializationType()
- boolean isEpsilon()
- boolean matches(int, int, int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.SemanticContext
Type: Abstract Class

Methods:
- SemanticContext evalPrecedence(Recognizer, RuleContext)
- SemanticContext or(SemanticContext, SemanticContext)
- boolean eval(Recognizer, RuleContext)
- SemanticContext and(SemanticContext, SemanticContext)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.SetTransition
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.Transition

Methods:
- int getSerializationType()
- String toString()
- IntervalSet label()
- boolean matches(int, int, int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.SingletonPredictionContext
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.PredictionContext

Methods:
- PredictionContext getParent(int)
- int size()
- boolean equals(Object)
- SingletonPredictionContext create(PredictionContext, int)
- String toString()
- int getReturnState(int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.StarBlockStartState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.BlockStartState

Methods:
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.StarLoopEntryState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.DecisionState

Methods:
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.StarLoopbackState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.ATNState

Methods:
- StarLoopEntryState getLoopEntryState()
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.TokensStartState
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.DecisionState

Methods:
- int getStateType()

### Class: com.sk89q.worldedit.antlr4.runtime.atn.Transition
Type: Abstract Class

Methods:
- int getSerializationType()
- IntervalSet label()
- boolean isEpsilon()
- boolean matches(int, int, int)

### Class: com.sk89q.worldedit.antlr4.runtime.atn.WildcardTransition
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.atn.Transition

Methods:
- int getSerializationType()
- String toString()
- boolean matches(int, int, int)

## Package: com.sk89q.worldedit.antlr4.runtime.dfa

### Class: com.sk89q.worldedit.antlr4.runtime.dfa.DFA
Type: Class

Methods:
- void setPrecedenceDfa(boolean)
- DFAState getPrecedenceStartState(int)
- void setPrecedenceStartState(int, DFAState)
- String toString()
- String toString(String[])
- String toString(Vocabulary)
- boolean isPrecedenceDfa()
- List getStates()
- String toLexerString()

### Class: com.sk89q.worldedit.antlr4.runtime.dfa.DFASerializer
Type: Class

Methods:
- String toString()

### Class: com.sk89q.worldedit.antlr4.runtime.dfa.DFAState
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()
- Set getAltSet()

### Class: com.sk89q.worldedit.antlr4.runtime.dfa.LexerDFASerializer
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.dfa.DFASerializer

No public methods found

## Package: com.sk89q.worldedit.antlr4.runtime.misc

### Class: com.sk89q.worldedit.antlr4.runtime.misc.EqualityComparator
Type: Interface

Methods:
- int hashCode(Object)
- boolean equals(Object, Object)

### Class: com.sk89q.worldedit.antlr4.runtime.misc.IntSet
Type: Interface

Methods:
- void add(int)
- boolean contains(int)
- IntSet or(IntSet)
- int size()
- IntSet addAll(IntSet)
- IntSet and(IntSet)
- boolean equals(Object)
- IntSet subtract(IntSet)
- String toString()
- boolean isNil()
- List toList()
- IntSet complement(IntSet)
- void remove(int)

### Class: com.sk89q.worldedit.antlr4.runtime.misc.Predicate
Type: Interface

Methods:
- boolean test(Object)

### Class: com.sk89q.worldedit.antlr4.runtime.misc.AbstractEqualityComparator
Type: Abstract Class
Implements: com.sk89q.worldedit.antlr4.runtime.misc.EqualityComparator

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.misc.Array2DHashSet
Type: Class
Implements: java.util.Set

Methods:
- boolean add(Object)
- String toTableString()
- boolean containsFast(Object)
- Object getOrAdd(Object)
- boolean containsAll(Collection)
- void clear()
- boolean isEmpty()
- boolean remove(Object)
- boolean removeAll(Collection)
- Iterator iterator()
- boolean contains(Object)
- boolean removeFast(Object)
- int size()
- boolean addAll(Collection)
- int hashCode()
- boolean equals(Object)
- Object get(Object)
- Object[] toArray()
- Object[] toArray(Object[])
- String toString()
- boolean retainAll(Collection)

### Class: com.sk89q.worldedit.antlr4.runtime.misc.DoubleKeyMap
Type: Class

Methods:
- Collection values(Object)
- Object get(Object, Object)
- Map get(Object)
- Set keySet()
- Set keySet(Object)
- Object put(Object, Object, Object)

### Class: com.sk89q.worldedit.antlr4.runtime.misc.FlexibleHashMap
Type: Class
Implements: java.util.Map

Methods:
- String toTableString()
- Set entrySet()
- boolean containsKey(Object)
- Collection values()
- void clear()
- boolean isEmpty()
- void main(String[])
- boolean containsValue(Object)
- Object remove(Object)
- Object put(Object, Object)
- int size()
- int hashCode()
- boolean equals(Object)
- void putAll(Map)
- Object get(Object)
- String toString()
- Set keySet()

### Class: com.sk89q.worldedit.antlr4.runtime.misc.IntegerList
Type: Class

Methods:
- void add(int)
- char[] toCharArray()
- void trimToSize()
- int set(int, int)
- void clear()
- boolean isEmpty()
- int binarySearch(int)
- int binarySearch(int, int, int)
- void sort()
- boolean contains(int)
- int size()
- void addAll(int[])
- void addAll(IntegerList)
- void addAll(Collection)
- int hashCode()
- boolean equals(Object)
- int get(int)
- int[] toArray()
- void removeRange(int, int)
- int removeAt(int)
- String toString()

### Class: com.sk89q.worldedit.antlr4.runtime.misc.IntegerStack
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.misc.IntegerList

Methods:
- int pop()
- void push(int)
- int peek()

### Class: com.sk89q.worldedit.antlr4.runtime.misc.Interval
Type: Class

Methods:
- boolean startsAfter(Interval)
- int length()
- boolean adjacent(Interval)
- boolean startsBeforeDisjoint(Interval)
- Interval union(Interval)
- boolean startsAfterNonDisjoint(Interval)
- boolean startsBeforeNonDisjoint(Interval)
- boolean startsAfterDisjoint(Interval)
- boolean properlyContains(Interval)
- boolean disjoint(Interval)
- int hashCode()
- Interval intersection(Interval)
- boolean equals(Object)
- Interval of(int, int)
- String toString()
- Interval differenceNotProperlyContained(Interval)

### Class: com.sk89q.worldedit.antlr4.runtime.misc.IntervalSet
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.misc.IntSet

Methods:
- boolean isReadonly()
- List toList()
- void remove(int)
- int hashCode()
- IntervalSet and(IntSet)
- IntSet and(IntSet)
- int get(int)
- IntervalSet of(int)
- IntervalSet of(int, int)
- int[] toArray()
- IntervalSet complement(int, int)
- IntervalSet complement(IntSet)
- IntSet complement(IntSet)
- void add(int)
- void add(int, int)
- IntervalSet or(IntervalSet[])
- IntervalSet or(IntSet)
- IntSet or(IntSet)
- IntervalSet subtract(IntSet)
- IntervalSet subtract(IntervalSet, IntervalSet)
- IntSet subtract(IntSet)
- void clear()
- IntegerList toIntegerList()
- void setReadonly(boolean)
- Set toSet()
- List getIntervals()
- int getMaxElement()
- boolean contains(int)
- int size()
- int getMinElement()
- IntervalSet addAll(IntSet)
- IntSet addAll(IntSet)
- boolean equals(Object)
- String toString()
- String toString(boolean)
- String toString(String[])
- String toString(Vocabulary)
- boolean isNil()

### Class: com.sk89q.worldedit.antlr4.runtime.misc.MultiMap
Type: Class
Extends: java.util.LinkedHashMap

Methods:
- List getPairs()
- void map(Object, Object)

### Class: com.sk89q.worldedit.antlr4.runtime.misc.MurmurHash
Type: Class

Methods:
- int hashCode(Object[], int)
- int update(int, int)
- int update(int, Object)
- int finish(int, int)
- int initialize()
- int initialize(int)

### Class: com.sk89q.worldedit.antlr4.runtime.misc.ObjectEqualityComparator
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.misc.AbstractEqualityComparator

Methods:
- int hashCode(Object)
- boolean equals(Object, Object)

### Class: com.sk89q.worldedit.antlr4.runtime.misc.Pair
Type: Class
Implements: java.io.Serializable

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: com.sk89q.worldedit.antlr4.runtime.misc.ParseCancellationException
Type: Class
Extends: java.util.concurrent.CancellationException

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.misc.Utils
Type: Class

Methods:
- char[] toCharArray(IntegerList)
- int count(String, char)
- int numNonnull(Object[])
- String sequence(int, String)
- IntervalSet toSet(BitSet)
- String expandTabs(String, int)
- String escapeWhitespace(String, boolean)
- String newlines(int)
- char[] readFile(String) throws IOException
- char[] readFile(String, String) throws IOException
- Map toMap(String[])
- String spaces(int)
- String join(Iterator, String)
- String join(Object[], String)
- void writeFile(String, String) throws IOException
- void writeFile(String, String, String) throws IOException
- void removeAllElements(Collection, Object)

## Package: com.sk89q.worldedit.antlr4.runtime.tree

### Class: com.sk89q.worldedit.antlr4.runtime.tree.ErrorNode
Type: Interface
Implements: com.sk89q.worldedit.antlr4.runtime.tree.TerminalNode

No public methods found

### Class: com.sk89q.worldedit.antlr4.runtime.tree.ParseTree
Type: Interface
Implements: com.sk89q.worldedit.antlr4.runtime.tree.SyntaxTree

Methods:
- ParseTree getParent()
- Tree getParent()
- String getText()
- ParseTree getChild(int)
- Tree getChild(int)
- void setParent(RuleContext)
- String toStringTree(Parser)
- Object accept(ParseTreeVisitor)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.ParseTreeListener
Type: Interface

Methods:
- void visitErrorNode(ErrorNode)
- void visitTerminal(TerminalNode)
- void enterEveryRule(ParserRuleContext)
- void exitEveryRule(ParserRuleContext)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.ParseTreeVisitor
Type: Interface

Methods:
- Object visitErrorNode(ErrorNode)
- Object visitTerminal(TerminalNode)
- Object visit(ParseTree)
- Object visitChildren(RuleNode)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.RuleNode
Type: Interface
Implements: com.sk89q.worldedit.antlr4.runtime.tree.ParseTree

Methods:
- RuleContext getRuleContext()

### Class: com.sk89q.worldedit.antlr4.runtime.tree.SyntaxTree
Type: Interface
Implements: com.sk89q.worldedit.antlr4.runtime.tree.Tree

Methods:
- Interval getSourceInterval()

### Class: com.sk89q.worldedit.antlr4.runtime.tree.TerminalNode
Type: Interface
Implements: com.sk89q.worldedit.antlr4.runtime.tree.ParseTree

Methods:
- Token getSymbol()

### Class: com.sk89q.worldedit.antlr4.runtime.tree.Tree
Type: Interface

Methods:
- int getChildCount()
- Object getPayload()
- Tree getParent()
- Tree getChild(int)
- String toStringTree()

### Class: com.sk89q.worldedit.antlr4.runtime.tree.AbstractParseTreeVisitor
Type: Abstract Class
Implements: com.sk89q.worldedit.antlr4.runtime.tree.ParseTreeVisitor

Methods:
- Object visitErrorNode(ErrorNode)
- Object visitTerminal(TerminalNode)
- Object visit(ParseTree)
- Object visitChildren(RuleNode)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.ErrorNodeImpl
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.tree.TerminalNodeImpl
Implements: com.sk89q.worldedit.antlr4.runtime.tree.ErrorNode

Methods:
- Object accept(ParseTreeVisitor)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.ParseTreeWalker
Type: Class

Methods:
- void walk(ParseTreeListener, ParseTree)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.TerminalNodeImpl
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.tree.TerminalNode

Methods:
- int getChildCount()
- Token getPayload()
- Object getPayload()
- ParseTree getParent()
- Tree getParent()
- Interval getSourceInterval()
- String getText()
- ParseTree getChild(int)
- Tree getChild(int)
- String toString()
- void setParent(RuleContext)
- String toStringTree(Parser)
- String toStringTree()
- Token getSymbol()
- Object accept(ParseTreeVisitor)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.Trees
Type: Class

Methods:
- List getAncestors(Tree)
- Collection findAllTokenNodes(ParseTree, int)
- ParserRuleContext getRootOfSubtreeEnclosingRegion(ParseTree, int, int)
- List descendants(ParseTree)
- String getNodeText(Tree, Parser)
- String getNodeText(Tree, List)
- boolean isAncestorOf(Tree, Tree)
- List getDescendants(ParseTree)
- List getChildren(Tree)
- Tree findNodeSuchThat(Tree, Predicate)
- void stripChildrenOutOfRange(ParserRuleContext, ParserRuleContext, int, int)
- Collection findAllRuleNodes(ParseTree, int)
- String toStringTree(Tree)
- String toStringTree(Tree, Parser)
- String toStringTree(Tree, List)
- void _findAllNodes(ParseTree, int, boolean, List)
- List findAllNodes(ParseTree, int, boolean)

## Package: com.sk89q.worldedit.antlr4.runtime.tree.pattern

### Class: com.sk89q.worldedit.antlr4.runtime.tree.pattern.ParseTreeMatch
Type: Class

Methods:
- ParseTree getTree()
- ParseTree getMismatchedNode()
- MultiMap getLabels()
- List getAll(String)
- ParseTree get(String)
- String toString()
- ParseTreePattern getPattern()
- boolean succeeded()

### Class: com.sk89q.worldedit.antlr4.runtime.tree.pattern.ParseTreePattern
Type: Class

Methods:
- int getPatternRuleIndex()
- ParseTreePatternMatcher getMatcher()
- ParseTreeMatch match(ParseTree)
- String getPattern()
- List findAll(ParseTree, String)
- boolean matches(ParseTree)
- ParseTree getPatternTree()

### Class: com.sk89q.worldedit.antlr4.runtime.tree.pattern.ParseTreePatternMatcher
Type: Class

Methods:
- List split(String)
- ParseTreePattern compile(String, int)
- Parser getParser()
- ParseTreeMatch match(ParseTree, String, int)
- ParseTreeMatch match(ParseTree, ParseTreePattern)
- Lexer getLexer()
- boolean matches(ParseTree, String, int)
- boolean matches(ParseTree, ParseTreePattern)
- List tokenize(String)
- void setDelimiters(String, String, String)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.pattern.RuleTagToken
Type: Class
Implements: com.sk89q.worldedit.antlr4.runtime.Token

Methods:
- String getLabel()
- int getStopIndex()
- int getStartIndex()
- int getType()
- int getChannel()
- String getRuleName()
- String getText()
- int getCharPositionInLine()
- int getLine()
- String toString()
- int getTokenIndex()
- CharStream getInputStream()
- TokenSource getTokenSource()

### Class: com.sk89q.worldedit.antlr4.runtime.tree.pattern.TokenTagToken
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.CommonToken

Methods:
- String getLabel()
- String getText()
- String getTokenName()
- String toString()

## Package: com.sk89q.worldedit.antlr4.runtime.tree.xpath

### Class: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPath
Type: Class

Methods:
- XPathElement[] split(String)
- Collection evaluate(ParseTree)
- Collection findAll(ParseTree, String, Parser)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathElement
Type: Abstract Class

Methods:
- String toString()
- Collection evaluate(ParseTree)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathLexer
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.Lexer

Methods:
- String[] getTokenNames()
- String[] getRuleNames()
- boolean isNameStartChar(int)
- Token nextToken()
- int getCharPositionInLine()
- String matchString()
- void consume()
- Vocabulary getVocabulary()
- String[] getModeNames()
- String getGrammarFileName()
- ATN getATN()
- String matchID()
- boolean isNameChar(int)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathLexerErrorListener
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.BaseErrorListener

Methods:
- void syntaxError(Recognizer, Object, int, int, String, RecognitionException)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathRuleAnywhereElement
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathElement

Methods:
- Collection evaluate(ParseTree)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathRuleElement
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathElement

Methods:
- Collection evaluate(ParseTree)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathTokenAnywhereElement
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathElement

Methods:
- Collection evaluate(ParseTree)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathTokenElement
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathElement

Methods:
- Collection evaluate(ParseTree)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathWildcardAnywhereElement
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathElement

Methods:
- Collection evaluate(ParseTree)

### Class: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathWildcardElement
Type: Class
Extends: com.sk89q.worldedit.antlr4.runtime.tree.xpath.XPathElement

Methods:
- Collection evaluate(ParseTree)

## Package: com.sk89q.worldedit.blocks

### Class: com.sk89q.worldedit.blocks.TileEntityBlock
Type: Interface
Implements: com.sk89q.worldedit.world.NbtValued

Methods:
- String getNbtId()

### Class: com.sk89q.worldedit.blocks.BaseItem
Type: Class
Implements: com.sk89q.worldedit.world.NbtValued

Methods:
- ItemType getType()
- LazyReference getNbtReference()
- String toString()
- void setNbtReference(LazyReference)
- void setType(ItemType)

### Class: com.sk89q.worldedit.blocks.BaseItemStack
Type: Class
Extends: com.sk89q.worldedit.blocks.BaseItem

Methods:
- Component getRichName()
- void setAmount(int)
- int getAmount()

### Class: com.sk89q.worldedit.blocks.Blocks
Type: Class

Methods:
- Map resolveProperties(Map, BlockType)
- boolean containsFuzzy(Collection, BlockStateHolder)

### Class: com.sk89q.worldedit.blocks.LegacyBaseBlockWrapper
Type: Class
Extends: com.sk89q.worldedit.world.block.BaseBlock

Methods:
- LazyReference getNbtReference()
- void setNbtReference(LazyReference)

### Class: com.sk89q.worldedit.blocks.MobSpawnerBlock
Type: Class
Extends: com.sk89q.worldedit.blocks.LegacyBaseBlockWrapper

Methods:
- void setNbtData(CompoundTag)
- short getDelay()
- void setMobType(String)
- CompoundTag getNbtData()
- void setDelay(short)
- String getNbtId()
- boolean hasNbtData()
- String getMobType()

### Class: com.sk89q.worldedit.blocks.SignBlock
Type: Class
Extends: com.sk89q.worldedit.blocks.LegacyBaseBlockWrapper

Methods:
- void setNbtData(CompoundTag)
- String[] getText()
- CompoundTag getNbtData()
- String getNbtId()
- boolean hasNbtData()
- void setText(String[])

### Class: com.sk89q.worldedit.blocks.SkullBlock
Type: Class
Extends: com.sk89q.worldedit.blocks.LegacyBaseBlockWrapper

Methods:
- void setNbtData(CompoundTag)
- CompoundTag getNbtData()
- String getOwner()
- void setOwner(String)
- String getNbtId()
- boolean hasNbtData()

## Package: com.sk89q.worldedit.bstats

### Class: com.sk89q.worldedit.bstats.MetricsBase
Type: Class

Methods:
- void shutdown()
- void addCustomChart(CustomChart)

## Package: com.sk89q.worldedit.bstats.bukkit

### Class: com.sk89q.worldedit.bstats.bukkit.Metrics
Type: Class

Methods:
- void shutdown()
- void addCustomChart(CustomChart)

## Package: com.sk89q.worldedit.bstats.charts

### Class: com.sk89q.worldedit.bstats.charts.CustomChart
Type: Abstract Class

Methods:
- JsonObjectBuilder$JsonObject getRequestJsonObject(BiConsumer, boolean)

## Package: com.sk89q.worldedit.bstats.json

### Class: com.sk89q.worldedit.bstats.json.JsonObjectBuilder
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

## Package: com.sk89q.worldedit.bukkit

### Class: com.sk89q.worldedit.bukkit.BukkitAdapter
Type: Class

Methods:
- BlockVector3 asBlockVector(Location)
- BukkitWorld asBukkitWorld(World)
- ItemType asItemType(Material)
- BlockState asBlockState(ItemStack) throws WorldEditException
- World adapt(World)
- Actor adapt(CommandSender)
- BukkitPlayer adapt(Player)
- CommandSender adapt(Actor)
- Player adapt(Player)
- Direction adapt(BlockFace)
- World adapt(World)
- Location adapt(Location)
- Location adapt(Location)
- Location adapt(World, Vector3)
- Location adapt(World, BlockVector3)
- Location adapt(World, Location)
- Entity adapt(Entity)
- Material adapt(ItemType)
- Material adapt(BlockType)
- GameMode adapt(GameMode)
- BiomeType adapt(Biome)
- Biome adapt(BiomeType)
- EntityType adapt(EntityType)
- EntityType adapt(EntityType)
- BlockState adapt(BlockData)
- BlockData adapt(BlockStateHolder)
- BaseItemStack adapt(ItemStack)
- ItemStack adapt(BaseItemStack)
- boolean equals(BlockType, Material)
- Vector3 asVector(Location)
- BlockType asBlockType(Material)

### Class: com.sk89q.worldedit.bukkit.BukkitBlockCategoryRegistry
Type: Class
Implements: com.sk89q.worldedit.world.registry.BlockCategoryRegistry

Methods:
- Set getCategorisedByName(String)

### Class: com.sk89q.worldedit.bukkit.BukkitBlockCommandSender
Type: Class
Extends: com.sk89q.worldedit.extension.platform.AbstractCommandBlockActor

Methods:
- SessionKey getSessionKey()
- void checkPermission(String) throws AuthorizationException
- void printRaw(String)
- void print(String)
- void print(Component)
- String getName()
- void printDebug(String)
- boolean hasPermission(String)
- BlockCommandSender getSender()
- void printError(String)
- Locale getLocale()
- String[] getGroups()
- UUID getUniqueId()

### Class: com.sk89q.worldedit.bukkit.BukkitBlockRegistry
Type: Class
Extends: com.sk89q.worldedit.world.registry.BundledBlockRegistry

Methods:
- BlockMaterial getMaterial(BlockType)
- Component getRichName(BlockType)
- OptionalInt getInternalBlockStateId(BlockState)
- Map getProperties(BlockType)

### Class: com.sk89q.worldedit.bukkit.BukkitCommandSender
Type: Class
Extends: com.sk89q.worldedit.extension.platform.AbstractNonPlayerActor

Methods:
- SessionKey getSessionKey()
- void checkPermission(String)
- void printRaw(String)
- void print(String)
- void print(Component)
- String getName()
- void printDebug(String)
- boolean hasPermission(String)
- CommandSender getSender()
- void printError(String)
- Locale getLocale()
- String[] getGroups()
- UUID getUniqueId()

### Class: com.sk89q.worldedit.bukkit.BukkitConfiguration
Type: Class
Extends: com.sk89q.worldedit.util.YAMLConfiguration

Methods:
- void load()
- Path getWorkingDirectoryPath()

### Class: com.sk89q.worldedit.bukkit.BukkitItemCategoryRegistry
Type: Class
Implements: com.sk89q.worldedit.world.registry.ItemCategoryRegistry

Methods:
- Set getCategorisedByName(String)

### Class: com.sk89q.worldedit.bukkit.BukkitPlayer
Type: Class
Extends: com.sk89q.worldedit.extension.platform.AbstractPlayerActor

Methods:
- void printRaw(String)
- Location getLocation()
- Player getPlayer()
- World getWorld()
- String getName()
- void sendFakeBlock(BlockVector3, BlockStateHolder)
- GameMode getGameMode()
- void printError(String)
- UUID getUniqueId()
- SessionKey getSessionKey()
- void giveItem(BaseItemStack)
- void setFlying(boolean)
- boolean setLocation(Location)
- String[] getGroups()
- BaseItemStack getItemInHand(HandSide)
- void printDebug(String)
- Object getFacet(Class)
- void setGameMode(GameMode)
- boolean trySetPosition(Vector3, float, float)
- boolean isAllowedToFly()
- BaseBlock getBlockInHand(HandSide) throws WorldEditException
- BlockBag getInventoryBlockBag()
- void sendAnnouncements()
- void print(String)
- void print(Component)
- BaseEntity getState()
- String getDisplayName()
- boolean hasPermission(String)
- void dispatchCUIEvent(CUIEvent)
- Locale getLocale()

### Class: com.sk89q.worldedit.bukkit.BukkitPlayerBlockBag
Type: Class
Extends: com.sk89q.worldedit.extent.inventory.BlockBag

Methods:
- Player getPlayer()
- void fetchBlock(BlockState) throws BlockBagException
- void addSourcePosition(Location)
- void addSingleSourcePosition(Location)
- void storeBlock(BlockState, int) throws BlockBagException
- void flushChanges()

### Class: com.sk89q.worldedit.bukkit.BukkitServerInterface
Type: Class
Extends: com.sk89q.worldedit.extension.platform.AbstractPlatform
Implements: com.sk89q.worldedit.extension.platform.MultiUserPlatform

Methods:
- String getVersion()
- Registries getRegistries()
- String getPlatformName()
- Collection getConnectedUsers()
- boolean isValidMobType(String)
- Map getCapabilities()
- List getWorlds()
- void setGameHooksEnabled(boolean)
- Player matchPlayer(Player)
- int schedule(long, long, Runnable)
- long getTickCount()
- LocalConfiguration getConfiguration()
- void reload()
- BukkitWorld matchWorld(World)
- World matchWorld(World)
- int getDataVersion()
- void registerCommands(CommandManager)
- String id()
- String getPlatformVersion()
- Watchdog getWatchdog()
- DataFixer getDataFixer()
- void unregisterCommands()
- Set getSupportedSideEffects()

### Class: com.sk89q.worldedit.bukkit.BukkitWorld
Type: Class
Extends: com.sk89q.worldedit.world.AbstractWorld

Methods:
- boolean generateStructure(StructureType, EditSession, BlockVector3)
- void fixAfterFastMode(Iterable)
- World getWorld()
- String getName()
- boolean clearContainerBlockContents(BlockVector3)
- WeatherType getWeather()
- boolean setBlock(BlockVector3, BlockStateHolder, SideEffectSet)
- boolean playEffect(Vector3, int, int)
- Path getStoragePath()
- boolean generateFeature(ConfiguredFeatureType, EditSession, BlockVector3)
- void sendBiomeUpdates(Iterable)
- void dropItem(Vector3, BaseItemStack)
- boolean useItem(BlockVector3, BaseItem, Direction)
- BaseBlock getFullBlock(BlockVector3)
- int hashCode()
- Set applySideEffects(BlockVector3, BlockState, SideEffectSet)
- void setWeather(WeatherType)
- void setWeather(WeatherType, long)
- int getBlockLightLevel(BlockVector3)
- BlockVector3 getSpawnPosition()
- String id()
- boolean setBiome(BlockVector3, BiomeType)
- boolean generateTree(TreeGenerator$TreeType, EditSession, BlockVector3)
- BiomeType getBiome(BlockVector3)
- BlockState getBlock(BlockVector3)
- int getMaxY()
- TreeType toBukkitTreeType(TreeGenerator$TreeType)
- Entity createEntity(Location, BaseEntity)
- void simulateBlockMine(BlockVector3)
- boolean canPlaceAt(BlockVector3, BlockState)
- void checkLoadedChunk(BlockVector3)
- boolean regenerate(Region, Extent, RegenOptions)
- long getRemainingWeatherDuration()
- boolean equals(Object)
- List getEntities(Region)
- List getEntities()
- int getMinY()

### Class: com.sk89q.worldedit.bukkit.CUIChannelListener
Type: Class
Implements: org.bukkit.plugin.messaging.PluginMessageListener

Methods:
- void onPluginMessageReceived(String, Player, byte[])

### Class: com.sk89q.worldedit.bukkit.EditSessionBlockChangeDelegate
Type: Class
Implements: org.bukkit.BlockChangeDelegate

Methods:
- int getHeight()
- BlockData getBlockData(int, int, int)
- boolean isEmpty(int, int, int)
- boolean setBlockData(int, int, int, BlockData)

### Class: com.sk89q.worldedit.bukkit.WorldEditListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onPlayerCommandSend(PlayerCommandSendEvent)
- void onGamemode(PlayerGameModeChangeEvent)
- void onPlayerQuit(PlayerQuitEvent)
- void onPlayerInteract(PlayerInteractEvent)

### Class: com.sk89q.worldedit.bukkit.WorldEditPlugin
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin
Implements: org.bukkit.command.TabCompleter

Methods:
- void remember(Player, EditSession)
- WorldEdit getWorldEdit()
- Actor wrapCommandSender(CommandSender)
- BukkitPlayer wrapPlayer(Player)
- boolean onCommand(CommandSender, Command, String, String[])
- void onLoad()
- List onTabComplete(CommandSender, Command, String, String[])
- void onEnable()
- EditSession createEditSession(Player)
- LocalSession getSession(Player)
- void onDisable()
- PermissionsResolverManager getPermissionsResolver()
- BukkitConfiguration getLocalConfiguration()

## Package: com.sk89q.worldedit.bukkit.adapter

### Class: com.sk89q.worldedit.bukkit.adapter.BukkitImplAdapter
Type: Interface

Methods:
- boolean generateStructure(StructureType, World, EditSession, BlockVector3)
- boolean clearContainerBlockContents(World, BlockVector3)
- Component getRichBlockName(BlockType)
- boolean generateFeature(ConfiguredFeatureType, World, EditSession, BlockVector3)
- void sendBiomeUpdates(World, Iterable)
- WorldNativeAccess createWorldNativeAccess(World)
- BaseBlock getFullBlock(Location)
- boolean supportsWatchdog()
- void setBiome(Location, BiomeType)
- DataFixer getDataFixer()
- BiomeType getBiome(Location)
- Set getSupportedSideEffects()
- BlockState getBlock(Location)
- void sendFakeNBT(Player, BlockVector3, LinCompoundTag)
- Component getRichItemName(ItemType)
- Component getRichItemName(BaseItemStack)
- ItemStack adapt(BaseItemStack)
- BaseItemStack adapt(ItemStack)
- Map getProperties(BlockType)
- BaseEntity getEntity(Entity)
- void tickWatchdog()
- Entity createEntity(Location, BaseEntity)
- boolean canPlaceAt(World, BlockVector3, BlockState)
- boolean regenerate(World, Region, Extent, RegenOptions)
- void sendFakeOP(Player)
- OptionalInt getInternalBlockStateId(BlockData)
- OptionalInt getInternalBlockStateId(BlockState)
- boolean simulateItemUse(World, BlockVector3, BaseItem, Direction)
- void initializeRegistries()

### Class: com.sk89q.worldedit.bukkit.adapter.AdapterLoadException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.sk89q.worldedit.bukkit.adapter.BukkitImplLoader
Type: Class

Methods:
- void addFromJar(File) throws IOException
- BukkitImplAdapter loadAdapter() throws AdapterLoadException
- void addFromPath(ClassLoader) throws IOException

### Class: com.sk89q.worldedit.bukkit.adapter.Refraction
Type: Class

Methods:
- String pickName(String, String)

### Class: com.sk89q.worldedit.bukkit.adapter.UnsupportedVersionEditException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

## Package: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_3

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_3.PaperweightAdapter
Type: Class
Implements: com.sk89q.worldedit.bukkit.adapter.BukkitImplAdapter

Methods:
- boolean generateStructure(StructureType, World, EditSession, BlockVector3)
- boolean clearContainerBlockContents(World, BlockVector3)
- Component getRichBlockName(BlockType)
- boolean generateFeature(ConfiguredFeatureType, World, EditSession, BlockVector3)
- void sendBiomeUpdates(World, Iterable)
- boolean supportsWatchdog()
- WorldNativeAccess createWorldNativeAccess(World)
- BaseBlock getFullBlock(Location)
- void setBiome(Location, BiomeType)
- DataFixer getDataFixer()
- BiomeType getBiome(Location)
- Set getSupportedSideEffects()
- BlockState getBlock(Location)
- void sendFakeNBT(Player, BlockVector3, LinCompoundTag)
- Component getRichItemName(ItemType)
- Component getRichItemName(BaseItemStack)
- Map getProperties(BlockType)
- BlockState adapt(IBlockData)
- BiomeType adapt(BiomeBase)
- IBlockData adapt(BlockState)
- ItemStack adapt(BaseItemStack)
- BaseItemStack adapt(ItemStack)
- void tickWatchdog()
- BaseEntity getEntity(Entity)
- Entity createEntity(Location, BaseEntity)
- boolean canPlaceAt(World, BlockVector3, BlockState)
- boolean regenerate(World, Region, Extent, RegenOptions)
- void sendFakeOP(Player)
- OptionalInt getInternalBlockStateId(BlockData)
- OptionalInt getInternalBlockStateId(BlockState)
- boolean simulateItemUse(World, BlockVector3, BaseItem, Direction)
- void initializeRegistries()

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_3.PaperweightServerLevelDelegateProxy
Type: Class
Implements: java.lang.reflect.InvocationHandler

Methods:
- Object invoke(Object, Method, Object[]) throws Throwable
- GeneratorAccessSeed newInstance(EditSession, WorldServer, PaperweightAdapter)

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_3.PaperweightWorldNativeAccess
Type: Class
Implements: com.sk89q.worldedit.internal.wna.WorldNativeAccess

Methods:
- void updateLightingForBlock(BlockPosition)
- void updateLightingForBlock(Object)
- void onBlockStateChange(BlockPosition, IBlockData, IBlockData)
- void onBlockStateChange(Object, Object, Object)
- void updateNeighbors(BlockPosition, IBlockData, IBlockData, int)
- void updateNeighbors(Object, Object, Object, int)
- void markBlockChanged(Chunk, BlockPosition)
- void markBlockChanged(Object, Object)
- boolean isChunkTicking(Chunk)
- boolean isChunkTicking(Object)
- IBlockData setBlockState(Chunk, BlockPosition, IBlockData)
- Object setBlockState(Object, Object, Object)
- void updateBlock(BlockPosition, IBlockData, IBlockData)
- void updateBlock(Object, Object, Object)
- IBlockData getValidBlockForPosition(IBlockData, BlockPosition)
- Object getValidBlockForPosition(Object, Object)
- IBlockData toNative(BlockState)
- Object toNative(BlockState)
- void setCurrentSideEffectSet(SideEffectSet)
- void notifyBlockUpdate(Chunk, BlockPosition, IBlockData, IBlockData)
- void notifyBlockUpdate(Object, Object, Object, Object)
- BlockPosition getPosition(int, int, int)
- Object getPosition(int, int, int)
- void notifyNeighbors(BlockPosition, IBlockData, IBlockData)
- void notifyNeighbors(Object, Object, Object)
- boolean updateTileEntity(BlockPosition, LinCompoundTag)
- boolean updateTileEntity(Object, LinCompoundTag)
- Chunk getChunk(int, int)
- Object getChunk(int, int)
- IBlockData getBlockState(Chunk, BlockPosition)
- Object getBlockState(Object, Object)

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_3.StaticRefraction
Type: Class

No public methods found

## Package: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_4

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_4.PaperweightAdapter
Type: Class
Implements: com.sk89q.worldedit.bukkit.adapter.BukkitImplAdapter

Methods:
- boolean generateStructure(StructureType, World, EditSession, BlockVector3)
- boolean clearContainerBlockContents(World, BlockVector3)
- Component getRichBlockName(BlockType)
- boolean generateFeature(ConfiguredFeatureType, World, EditSession, BlockVector3)
- void sendBiomeUpdates(World, Iterable)
- boolean supportsWatchdog()
- WorldNativeAccess createWorldNativeAccess(World)
- BaseBlock getFullBlock(Location)
- void setBiome(Location, BiomeType)
- DataFixer getDataFixer()
- BiomeType getBiome(Location)
- Set getSupportedSideEffects()
- BlockState getBlock(Location)
- void sendFakeNBT(Player, BlockVector3, LinCompoundTag)
- Component getRichItemName(ItemType)
- Component getRichItemName(BaseItemStack)
- Map getProperties(BlockType)
- BlockState adapt(IBlockData)
- BiomeType adapt(BiomeBase)
- IBlockData adapt(BlockState)
- ItemStack adapt(BaseItemStack)
- BaseItemStack adapt(ItemStack)
- void tickWatchdog()
- BaseEntity getEntity(Entity)
- Entity createEntity(Location, BaseEntity)
- boolean canPlaceAt(World, BlockVector3, BlockState)
- boolean regenerate(World, Region, Extent, RegenOptions)
- void sendFakeOP(Player)
- OptionalInt getInternalBlockStateId(BlockData)
- OptionalInt getInternalBlockStateId(BlockState)
- boolean simulateItemUse(World, BlockVector3, BaseItem, Direction)
- void initializeRegistries()

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_4.PaperweightServerLevelDelegateProxy
Type: Class
Implements: java.lang.reflect.InvocationHandler, java.lang.AutoCloseable

Methods:
- Object invoke(Object, Method, Object[]) throws Throwable
- PaperweightServerLevelDelegateProxy$LevelAndProxy newInstance(EditSession, WorldServer, PaperweightAdapter)
- void close() throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_4.PaperweightWorldNativeAccess
Type: Class
Implements: com.sk89q.worldedit.internal.wna.WorldNativeAccess

Methods:
- void updateLightingForBlock(BlockPosition)
- void updateLightingForBlock(Object)
- void onBlockStateChange(BlockPosition, IBlockData, IBlockData)
- void onBlockStateChange(Object, Object, Object)
- void updateNeighbors(BlockPosition, IBlockData, IBlockData, int)
- void updateNeighbors(Object, Object, Object, int)
- void markBlockChanged(Chunk, BlockPosition)
- void markBlockChanged(Object, Object)
- boolean isChunkTicking(Chunk)
- boolean isChunkTicking(Object)
- IBlockData setBlockState(Chunk, BlockPosition, IBlockData)
- Object setBlockState(Object, Object, Object)
- void updateBlock(BlockPosition, IBlockData, IBlockData)
- void updateBlock(Object, Object, Object)
- IBlockData getValidBlockForPosition(IBlockData, BlockPosition)
- Object getValidBlockForPosition(Object, Object)
- IBlockData toNative(BlockState)
- Object toNative(BlockState)
- void setCurrentSideEffectSet(SideEffectSet)
- void notifyBlockUpdate(Chunk, BlockPosition, IBlockData, IBlockData)
- void notifyBlockUpdate(Object, Object, Object, Object)
- BlockPosition getPosition(int, int, int)
- Object getPosition(int, int, int)
- void notifyNeighbors(BlockPosition, IBlockData, IBlockData)
- void notifyNeighbors(Object, Object, Object)
- boolean updateTileEntity(BlockPosition, LinCompoundTag)
- boolean updateTileEntity(Object, LinCompoundTag)
- Chunk getChunk(int, int)
- Object getChunk(int, int)
- IBlockData getBlockState(Chunk, BlockPosition)
- Object getBlockState(Object, Object)

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_4.StaticRefraction
Type: Class

No public methods found

## Package: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_5

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_5.PaperweightAdapter
Type: Class
Implements: com.sk89q.worldedit.bukkit.adapter.BukkitImplAdapter

Methods:
- boolean generateStructure(StructureType, World, EditSession, BlockVector3)
- boolean clearContainerBlockContents(World, BlockVector3)
- Component getRichBlockName(BlockType)
- boolean generateFeature(ConfiguredFeatureType, World, EditSession, BlockVector3)
- void sendBiomeUpdates(World, Iterable)
- boolean supportsWatchdog()
- WorldNativeAccess createWorldNativeAccess(World)
- BaseBlock getFullBlock(Location)
- void setBiome(Location, BiomeType)
- DataFixer getDataFixer()
- BiomeType getBiome(Location)
- Set getSupportedSideEffects()
- BlockState getBlock(Location)
- void sendFakeNBT(Player, BlockVector3, LinCompoundTag)
- Component getRichItemName(ItemType)
- Component getRichItemName(BaseItemStack)
- Map getProperties(BlockType)
- BlockState adapt(IBlockData)
- BiomeType adapt(BiomeBase)
- IBlockData adapt(BlockState)
- ItemStack adapt(BaseItemStack)
- BaseItemStack adapt(ItemStack)
- void tickWatchdog()
- BaseEntity getEntity(Entity)
- Entity createEntity(Location, BaseEntity)
- boolean canPlaceAt(World, BlockVector3, BlockState)
- boolean regenerate(World, Region, Extent, RegenOptions)
- void sendFakeOP(Player)
- OptionalInt getInternalBlockStateId(BlockData)
- OptionalInt getInternalBlockStateId(BlockState)
- boolean simulateItemUse(World, BlockVector3, BaseItem, Direction)
- void initializeRegistries()

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_5.PaperweightServerLevelDelegateProxy
Type: Class
Implements: java.lang.reflect.InvocationHandler, java.lang.AutoCloseable

Methods:
- Object invoke(Object, Method, Object[]) throws Throwable
- PaperweightServerLevelDelegateProxy$LevelAndProxy newInstance(EditSession, WorldServer, PaperweightAdapter)
- void close() throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_5.PaperweightWorldNativeAccess
Type: Class
Implements: com.sk89q.worldedit.internal.wna.WorldNativeAccess

Methods:
- void updateLightingForBlock(BlockPosition)
- void updateLightingForBlock(Object)
- void onBlockStateChange(BlockPosition, IBlockData, IBlockData)
- void onBlockStateChange(Object, Object, Object)
- void updateNeighbors(BlockPosition, IBlockData, IBlockData, int)
- void updateNeighbors(Object, Object, Object, int)
- void markBlockChanged(Chunk, BlockPosition)
- void markBlockChanged(Object, Object)
- boolean isChunkTicking(Chunk)
- boolean isChunkTicking(Object)
- IBlockData setBlockState(Chunk, BlockPosition, IBlockData)
- Object setBlockState(Object, Object, Object)
- void updateBlock(BlockPosition, IBlockData, IBlockData)
- void updateBlock(Object, Object, Object)
- IBlockData getValidBlockForPosition(IBlockData, BlockPosition)
- Object getValidBlockForPosition(Object, Object)
- IBlockData toNative(BlockState)
- Object toNative(BlockState)
- void setCurrentSideEffectSet(SideEffectSet)
- void notifyBlockUpdate(Chunk, BlockPosition, IBlockData, IBlockData)
- void notifyBlockUpdate(Object, Object, Object, Object)
- BlockPosition getPosition(int, int, int)
- Object getPosition(int, int, int)
- void notifyNeighbors(BlockPosition, IBlockData, IBlockData)
- void notifyNeighbors(Object, Object, Object)
- boolean updateTileEntity(BlockPosition, LinCompoundTag)
- boolean updateTileEntity(Object, LinCompoundTag)
- Chunk getChunk(int, int)
- Object getChunk(int, int)
- IBlockData getBlockState(Chunk, BlockPosition)
- Object getBlockState(Object, Object)

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_5.StaticRefraction
Type: Class

No public methods found

## Package: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_6

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_6.ComponentConverter
Type: Class

No public methods found

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_6.PaperweightAdapter
Type: Class
Implements: com.sk89q.worldedit.bukkit.adapter.BukkitImplAdapter

Methods:
- boolean generateStructure(StructureType, World, EditSession, BlockVector3)
- boolean clearContainerBlockContents(World, BlockVector3)
- Component getRichBlockName(BlockType)
- boolean generateFeature(ConfiguredFeatureType, World, EditSession, BlockVector3)
- void sendBiomeUpdates(World, Iterable)
- boolean supportsWatchdog()
- WorldNativeAccess createWorldNativeAccess(World)
- BaseBlock getFullBlock(Location)
- void setBiome(Location, BiomeType)
- DataFixer getDataFixer()
- BiomeType getBiome(Location)
- Set getSupportedSideEffects()
- BlockState getBlock(Location)
- void sendFakeNBT(Player, BlockVector3, LinCompoundTag)
- Component getRichItemName(ItemType)
- Component getRichItemName(BaseItemStack)
- Map getProperties(BlockType)
- BlockState adapt(IBlockData)
- BiomeType adapt(BiomeBase)
- IBlockData adapt(BlockState)
- ItemStack adapt(BaseItemStack)
- BaseItemStack adapt(ItemStack)
- void tickWatchdog()
- BaseEntity getEntity(Entity)
- Entity createEntity(Location, BaseEntity)
- boolean canPlaceAt(World, BlockVector3, BlockState)
- boolean regenerate(World, Region, Extent, RegenOptions)
- void sendFakeOP(Player)
- OptionalInt getInternalBlockStateId(BlockData)
- OptionalInt getInternalBlockStateId(BlockState)
- boolean simulateItemUse(World, BlockVector3, BaseItem, Direction)
- void initializeRegistries()

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_6.PaperweightServerLevelDelegateProxy
Type: Class
Implements: java.lang.reflect.InvocationHandler, java.lang.AutoCloseable

Methods:
- Object invoke(Object, Method, Object[]) throws Throwable
- PaperweightServerLevelDelegateProxy$LevelAndProxy newInstance(EditSession, WorldServer, PaperweightAdapter)
- void close() throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_6.PaperweightWorldNativeAccess
Type: Class
Implements: com.sk89q.worldedit.internal.wna.WorldNativeAccess

Methods:
- void updateLightingForBlock(BlockPosition)
- void updateLightingForBlock(Object)
- void onBlockStateChange(BlockPosition, IBlockData, IBlockData)
- void onBlockStateChange(Object, Object, Object)
- void updateNeighbors(BlockPosition, IBlockData, IBlockData, int)
- void updateNeighbors(Object, Object, Object, int)
- void markBlockChanged(Chunk, BlockPosition)
- void markBlockChanged(Object, Object)
- boolean isChunkTicking(Chunk)
- boolean isChunkTicking(Object)
- IBlockData setBlockState(Chunk, BlockPosition, IBlockData)
- Object setBlockState(Object, Object, Object)
- void updateBlock(BlockPosition, IBlockData, IBlockData)
- void updateBlock(Object, Object, Object)
- IBlockData getValidBlockForPosition(IBlockData, BlockPosition)
- Object getValidBlockForPosition(Object, Object)
- IBlockData toNative(BlockState)
- Object toNative(BlockState)
- void setCurrentSideEffectSet(SideEffectSet)
- void notifyBlockUpdate(Chunk, BlockPosition, IBlockData, IBlockData)
- void notifyBlockUpdate(Object, Object, Object, Object)
- BlockPosition getPosition(int, int, int)
- Object getPosition(int, int, int)
- void notifyNeighbors(BlockPosition, IBlockData, IBlockData)
- void notifyNeighbors(Object, Object, Object)
- boolean updateTileEntity(BlockPosition, LinCompoundTag)
- boolean updateTileEntity(Object, LinCompoundTag)
- Chunk getChunk(int, int)
- Object getChunk(int, int)
- IBlockData getBlockState(Chunk, BlockPosition)
- Object getBlockState(Object, Object)

### Class: com.sk89q.worldedit.bukkit.adapter.impl.v1_21_6.StaticRefraction
Type: Class

No public methods found

## Package: com.sk89q.worldedit.bukkit.fastutil

### Class: com.sk89q.worldedit.bukkit.fastutil.BidirectionalIterator
Type: Interface
Implements: java.util.Iterator

Methods:
- Object previous()
- boolean hasPrevious()

### Class: com.sk89q.worldedit.bukkit.fastutil.BigListIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.BidirectionalIterator

Methods:
- void add(Object)
- void set(Object)
- long nextIndex()
- long previousIndex()

### Class: com.sk89q.worldedit.bukkit.fastutil.BigSwapper
Type: Interface

Methods:
- void swap(long, long)

### Class: com.sk89q.worldedit.bukkit.fastutil.Function
Type: Interface
Implements: java.util.function.Function

Methods:
- Object getOrDefault(Object, Object)
- int size()
- Object apply(Object)
- boolean containsKey(Object)
- Object get(Object)
- void clear()
- Object remove(Object)
- Object put(Object, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.Hash
Type: Interface

No public methods found

### Class: com.sk89q.worldedit.bukkit.fastutil.Pair
Type: Interface

Methods:
- Object left()
- Pair left(Object)
- Pair of(Object, Object)
- Object right()
- Pair right(Object)
- Comparator lexComparator()
- Pair value(Object)
- Object value()
- Pair key(Object)
- Object key()
- Object first()
- Pair first(Object)
- Object second()
- Pair second(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.Size64
Type: Interface

Methods:
- long size64()
- int size()
- long sizeOf(Collection)
- long sizeOf(Map)

### Class: com.sk89q.worldedit.bukkit.fastutil.Stack
Type: Interface

Methods:
- Object pop()
- Object top()
- boolean isEmpty()
- void push(Object)
- Object peek(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.Swapper
Type: Interface

Methods:
- void swap(int, int)

### Class: com.sk89q.worldedit.bukkit.fastutil.Arrays
Type: Class

Methods:
- void parallelQuickSort(int, int, IntComparator, Swapper)
- void ensureOffsetLength(int, int, int)
- void ensureFromTo(int, int, int)
- void quickSort(int, int, IntComparator, Swapper)
- void mergeSort(int, int, IntComparator, Swapper)

### Class: com.sk89q.worldedit.bukkit.fastutil.BigArrays
Type: Class

Methods:
- int getAndIncrement(AtomicIntegerArray[], long)
- long getAndIncrement(AtomicLongArray[], long)
- int incrementAndGet(AtomicIntegerArray[], long)
- long incrementAndGet(AtomicLongArray[], long)
- void mul(byte[][], long, byte)
- void mul(int[][], long, int)
- void mul(long[][], long, long)
- void mul(double[][], long, double)
- void mul(short[][], long, short)
- void mul(char[][], long, char)
- void mul(float[][], long, float)
- long nearestSegmentStart(long, long, long)
- void main(String[])
- int decrementAndGet(AtomicIntegerArray[], long)
- long decrementAndGet(AtomicLongArray[], long)
- void ensureFromTo(long, long, long)
- void ensureFromTo(byte[][], long, long)
- void ensureFromTo(int[][], long, long)
- void ensureFromTo(long[][], long, long)
- void ensureFromTo(double[][], long, long)
- void ensureFromTo(boolean[][], long, long)
- void ensureFromTo(short[][], long, long)
- void ensureFromTo(char[][], long, long)
- void ensureFromTo(float[][], long, long)
- void ensureFromTo(Object[][], long, long)
- void mergeSort(long, long, LongComparator, BigSwapper)
- byte[][] forceCapacity(byte[][], long, long)
- int[][] forceCapacity(int[][], long, long)
- long[][] forceCapacity(long[][], long, long)
- double[][] forceCapacity(double[][], long, long)
- boolean[][] forceCapacity(boolean[][], long, long)
- short[][] forceCapacity(short[][], long, long)
- char[][] forceCapacity(char[][], long, long)
- float[][] forceCapacity(float[][], long, long)
- Object[][] forceCapacity(Object[][], long, long)
- byte[][] trim(byte[][], long)
- int[][] trim(int[][], long)
- long[][] trim(long[][], long)
- double[][] trim(double[][], long)
- boolean[][] trim(boolean[][], long)
- short[][] trim(short[][], long)
- char[][] trim(char[][], long)
- float[][] trim(float[][], long)
- Object[][] trim(Object[][], long)
- byte get(byte[][], long)
- int get(int[][], long)
- int get(AtomicIntegerArray[], long)
- long get(long[][], long)
- long get(AtomicLongArray[], long)
- double get(double[][], long)
- boolean get(boolean[][], long)
- short get(short[][], long)
- char get(char[][], long)
- float get(float[][], long)
- Object get(Object[][], long)
- int segment(long)
- int getAndAdd(AtomicIntegerArray[], long, int)
- long getAndAdd(AtomicLongArray[], long, long)
- int displacement(long)
- int getAndSet(AtomicIntegerArray[], long, int)
- long getAndSet(AtomicLongArray[], long, long)
- void copy(byte[][], long, byte[][], long, long)
- byte[][] copy(byte[][], long, long)
- byte[][] copy(byte[][])
- void copy(int[][], long, int[][], long, long)
- int[][] copy(int[][], long, long)
- int[][] copy(int[][])
- void copy(long[][], long, long[][], long, long)
- long[][] copy(long[][], long, long)
- long[][] copy(long[][])
- void copy(double[][], long, double[][], long, long)
- double[][] copy(double[][], long, long)
- double[][] copy(double[][])
- void copy(boolean[][], long, boolean[][], long, long)
- boolean[][] copy(boolean[][], long, long)
- boolean[][] copy(boolean[][])
- void copy(short[][], long, short[][], long, long)
- short[][] copy(short[][], long, long)
- short[][] copy(short[][])
- void copy(char[][], long, char[][], long, long)
- char[][] copy(char[][], long, long)
- char[][] copy(char[][])
- void copy(float[][], long, float[][], long, long)
- float[][] copy(float[][], long, long)
- float[][] copy(float[][])
- void copy(Object[][], long, Object[][], long, long)
- Object[][] copy(Object[][], long, long)
- Object[][] copy(Object[][])
- void ensureSameLength(byte[][], byte[][])
- void ensureSameLength(int[][], int[][])
- void ensureSameLength(long[][], long[][])
- void ensureSameLength(double[][], double[][])
- void ensureSameLength(boolean[][], boolean[][])
- void ensureSameLength(short[][], short[][])
- void ensureSameLength(char[][], char[][])
- void ensureSameLength(float[][], float[][])
- void ensureSameLength(Object[][], Object[][])
- void decr(byte[][], long)
- void decr(int[][], long)
- void decr(long[][], long)
- void decr(double[][], long)
- void decr(short[][], long)
- void decr(char[][], long)
- void decr(float[][], long)
- void add(byte[][], long, byte)
- void add(int[][], long, int)
- void add(long[][], long, long)
- void add(double[][], long, double)
- void add(short[][], long, short)
- void add(char[][], long, char)
- void add(float[][], long, float)
- byte[][] grow(byte[][], long)
- byte[][] grow(byte[][], long, long)
- int[][] grow(int[][], long)
- int[][] grow(int[][], long, long)
- long[][] grow(long[][], long)
- long[][] grow(long[][], long, long)
- double[][] grow(double[][], long)
- double[][] grow(double[][], long, long)
- boolean[][] grow(boolean[][], long)
- boolean[][] grow(boolean[][], long, long)
- short[][] grow(short[][], long)
- short[][] grow(short[][], long, long)
- char[][] grow(char[][], long)
- char[][] grow(char[][], long, long)
- float[][] grow(float[][], long)
- float[][] grow(float[][], long, long)
- Object[][] grow(Object[][], long)
- Object[][] grow(Object[][], long, long)
- void set(byte[][], long, byte)
- void set(int[][], long, int)
- void set(AtomicIntegerArray[], long, int)
- void set(long[][], long, long)
- void set(AtomicLongArray[], long, long)
- void set(double[][], long, double)
- void set(boolean[][], long, boolean)
- void set(short[][], long, short)
- void set(char[][], long, char)
- void set(float[][], long, float)
- void set(Object[][], long, Object)
- void incr(byte[][], long)
- void incr(int[][], long)
- void incr(long[][], long)
- void incr(double[][], long)
- void incr(short[][], long)
- void incr(char[][], long)
- void incr(float[][], long)
- void swap(byte[][], long, long)
- void swap(int[][], long, long)
- void swap(long[][], long, long)
- void swap(double[][], long, long)
- void swap(boolean[][], long, long)
- void swap(short[][], long, long)
- void swap(char[][], long, long)
- void swap(float[][], long, long)
- void swap(Object[][], long, long)
- long length(byte[][])
- long length(AtomicIntegerArray[])
- long length(int[][])
- long length(AtomicLongArray[])
- long length(long[][])
- long length(double[][])
- long length(boolean[][])
- long length(short[][])
- long length(char[][])
- long length(float[][])
- long length(Object[][])
- long start(int)
- void ensureOffsetLength(long, long, long)
- void ensureOffsetLength(byte[][], long, long)
- void ensureOffsetLength(int[][], long, long)
- void ensureOffsetLength(long[][], long, long)
- void ensureOffsetLength(double[][], long, long)
- void ensureOffsetLength(boolean[][], long, long)
- void ensureOffsetLength(short[][], long, long)
- void ensureOffsetLength(char[][], long, long)
- void ensureOffsetLength(float[][], long, long)
- void ensureOffsetLength(Object[][], long, long)
- long index(int, int)
- void ensureLength(long)
- void fill(byte[][], byte)
- void fill(byte[][], long, long, byte)
- void fill(int[][], int)
- void fill(int[][], long, long, int)
- void fill(long[][], long)
- void fill(long[][], long, long, long)
- void fill(double[][], double)
- void fill(double[][], long, long, double)
- void fill(boolean[][], boolean)
- void fill(boolean[][], long, long, boolean)
- void fill(short[][], short)
- void fill(short[][], long, long, short)
- void fill(char[][], char)
- void fill(char[][], long, long, char)
- void fill(float[][], float)
- void fill(float[][], long, long, float)
- void fill(Object[][], Object)
- void fill(Object[][], long, long, Object)
- byte[][] reverse(byte[][])
- int[][] reverse(int[][])
- long[][] reverse(long[][])
- double[][] reverse(double[][])
- boolean[][] reverse(boolean[][])
- short[][] reverse(short[][])
- char[][] reverse(char[][])
- float[][] reverse(float[][])
- Object[][] reverse(Object[][])
- void quickSort(long, long, LongComparator, BigSwapper)
- void copyToBig(byte[], int, byte[][], long, long)
- void copyToBig(int[], int, int[][], long, long)
- void copyToBig(long[], int, long[][], long, long)
- void copyToBig(double[], int, double[][], long, long)
- void copyToBig(boolean[], int, boolean[][], long, long)
- void copyToBig(short[], int, short[][], long, long)
- void copyToBig(char[], int, char[][], long, long)
- void copyToBig(float[], int, float[][], long, long)
- void copyToBig(Object[], int, Object[][], long, long)
- byte[][] setLength(byte[][], long)
- int[][] setLength(int[][], long)
- long[][] setLength(long[][], long)
- double[][] setLength(double[][], long)
- boolean[][] setLength(boolean[][], long)
- short[][] setLength(short[][], long)
- char[][] setLength(char[][], long)
- float[][] setLength(float[][], long)
- Object[][] setLength(Object[][], long)
- void copyFromBig(byte[][], long, byte[], int, int)
- void copyFromBig(int[][], long, int[], int, int)
- void copyFromBig(long[][], long, long[], int, int)
- void copyFromBig(double[][], long, double[], int, int)
- void copyFromBig(boolean[][], long, boolean[], int, int)
- void copyFromBig(short[][], long, short[], int, int)
- void copyFromBig(char[][], long, char[], int, int)
- void copyFromBig(float[][], long, float[], int, int)
- void copyFromBig(Object[][], long, Object[], int, int)
- void assertBigArray(byte[][])
- void assertBigArray(int[][])
- void assertBigArray(long[][])
- void assertBigArray(double[][])
- void assertBigArray(boolean[][])
- void assertBigArray(short[][])
- void assertBigArray(char[][])
- void assertBigArray(float[][])
- void assertBigArray(Object[][])
- boolean compareAndSet(AtomicIntegerArray[], long, int, int)
- boolean compareAndSet(AtomicLongArray[], long, long, long)
- boolean equals(byte[][], byte[][])
- boolean equals(int[][], int[][])
- boolean equals(long[][], long[][])
- boolean equals(double[][], double[][])
- boolean equals(boolean[][], boolean[][])
- boolean equals(short[][], short[][])
- boolean equals(char[][], char[][])
- boolean equals(float[][], float[][])
- boolean equals(Object[][], Object[][])
- int addAndGet(AtomicIntegerArray[], long, int)
- long addAndGet(AtomicLongArray[], long, long)
- String toString(byte[][])
- String toString(int[][])
- String toString(long[][])
- String toString(double[][])
- String toString(boolean[][])
- String toString(short[][])
- String toString(char[][])
- String toString(float[][])
- String toString(Object[][])
- byte[][] ensureCapacity(byte[][], long)
- byte[][] ensureCapacity(byte[][], long, long)
- int[][] ensureCapacity(int[][], long)
- int[][] ensureCapacity(int[][], long, long)
- long[][] ensureCapacity(long[][], long)
- long[][] ensureCapacity(long[][], long, long)
- double[][] ensureCapacity(double[][], long)
- double[][] ensureCapacity(double[][], long, long)
- boolean[][] ensureCapacity(boolean[][], long)
- boolean[][] ensureCapacity(boolean[][], long, long)
- short[][] ensureCapacity(short[][], long)
- short[][] ensureCapacity(short[][], long, long)
- char[][] ensureCapacity(char[][], long)
- char[][] ensureCapacity(char[][], long, long)
- float[][] ensureCapacity(float[][], long)
- float[][] ensureCapacity(float[][], long, long)
- Object[][] ensureCapacity(Object[][], long)
- Object[][] ensureCapacity(Object[][], long, long)
- byte[][] shuffle(byte[][], long, long, Random)
- byte[][] shuffle(byte[][], Random)
- int[][] shuffle(int[][], long, long, Random)
- int[][] shuffle(int[][], Random)
- long[][] shuffle(long[][], long, long, Random)
- long[][] shuffle(long[][], Random)
- double[][] shuffle(double[][], long, long, Random)
- double[][] shuffle(double[][], Random)
- boolean[][] shuffle(boolean[][], long, long, Random)
- boolean[][] shuffle(boolean[][], Random)
- short[][] shuffle(short[][], long, long, Random)
- short[][] shuffle(short[][], Random)
- char[][] shuffle(char[][], long, long, Random)
- char[][] shuffle(char[][], Random)
- float[][] shuffle(float[][], long, long, Random)
- float[][] shuffle(float[][], Random)
- Object[][] shuffle(Object[][], long, long, Random)
- Object[][] shuffle(Object[][], Random)
- int getAndDecrement(AtomicIntegerArray[], long)
- long getAndDecrement(AtomicLongArray[], long)
- byte[][] wrap(byte[])
- int[][] wrap(int[])
- long[][] wrap(long[])
- double[][] wrap(double[])
- boolean[][] wrap(boolean[])
- short[][] wrap(short[])
- char[][] wrap(char[])
- float[][] wrap(float[])
- Object[][] wrap(Object[])

### Class: com.sk89q.worldedit.bukkit.fastutil.HashCommon
Type: Class

Methods:
- int long2int(long)
- long bigArraySize(long, float)
- int nextPowerOfTwo(int)
- long nextPowerOfTwo(long)
- int double2int(double)
- int murmurHash3(int)
- long murmurHash3(long)
- int arraySize(int, float)
- int invMix(int)
- long invMix(long)
- int mix(int)
- long mix(long)
- int maxFill(int, float)
- long maxFill(long, float)
- int float2int(float)

### Class: com.sk89q.worldedit.bukkit.fastutil.SafeMath
Type: Class

Methods:
- int safeLongToInt(long)
- short safeLongToShort(long)
- float safeDoubleToFloat(double)
- char safeLongToChar(long)
- byte safeLongToByte(long)
- byte safeIntToByte(int)
- char safeIntToChar(int)
- short safeIntToShort(int)

## Package: com.sk89q.worldedit.bukkit.fastutil.booleans

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.Boolean2ByteFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- byte getOrDefault(boolean, byte)
- Byte getOrDefault(Object, Byte)
- Object getOrDefault(Object, Object)
- Boolean2ShortFunction andThenShort(Byte2ShortFunction)
- Byte2ByteFunction composeByte(Byte2BooleanFunction)
- Boolean2IntFunction andThenInt(Byte2IntFunction)
- Reference2ByteFunction composeReference(Reference2BooleanFunction)
- Function andThen(Function)
- byte remove(boolean)
- Byte remove(Object)
- Object remove(Object)
- byte put(boolean, byte)
- Byte put(Boolean, Byte)
- Object put(Object, Object)
- void defaultReturnValue(byte)
- byte defaultReturnValue()
- Boolean2DoubleFunction andThenDouble(Byte2DoubleFunction)
- Boolean2ObjectFunction andThenObject(Byte2ObjectFunction)
- byte get(boolean)
- Byte get(Object)
- Object get(Object)
- Boolean2LongFunction andThenLong(Byte2LongFunction)
- Long2ByteFunction composeLong(Long2BooleanFunction)
- Boolean2ByteFunction andThenByte(Byte2ByteFunction)
- Boolean2FloatFunction andThenFloat(Byte2FloatFunction)
- boolean containsKey(boolean)
- boolean containsKey(Object)
- Int2ByteFunction composeInt(Int2BooleanFunction)
- Float2ByteFunction composeFloat(Float2BooleanFunction)
- Boolean2CharFunction andThenChar(Byte2CharFunction)
- Object2ByteFunction composeObject(Object2BooleanFunction)
- Function compose(Function)
- Short2ByteFunction composeShort(Short2BooleanFunction)
- Boolean2ReferenceFunction andThenReference(Byte2ReferenceFunction)
- Char2ByteFunction composeChar(Char2BooleanFunction)
- Double2ByteFunction composeDouble(Double2BooleanFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.Boolean2CharFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- char getOrDefault(boolean, char)
- Character getOrDefault(Object, Character)
- Object getOrDefault(Object, Object)
- Boolean2ShortFunction andThenShort(Char2ShortFunction)
- Byte2CharFunction composeByte(Byte2BooleanFunction)
- Boolean2IntFunction andThenInt(Char2IntFunction)
- Reference2CharFunction composeReference(Reference2BooleanFunction)
- Function andThen(Function)
- char remove(boolean)
- Character remove(Object)
- Object remove(Object)
- char put(boolean, char)
- Character put(Boolean, Character)
- Object put(Object, Object)
- void defaultReturnValue(char)
- char defaultReturnValue()
- Boolean2DoubleFunction andThenDouble(Char2DoubleFunction)
- Boolean2ObjectFunction andThenObject(Char2ObjectFunction)
- char get(boolean)
- Character get(Object)
- Object get(Object)
- Boolean2LongFunction andThenLong(Char2LongFunction)
- Long2CharFunction composeLong(Long2BooleanFunction)
- Boolean2ByteFunction andThenByte(Char2ByteFunction)
- Boolean2FloatFunction andThenFloat(Char2FloatFunction)
- boolean containsKey(boolean)
- boolean containsKey(Object)
- Int2CharFunction composeInt(Int2BooleanFunction)
- Float2CharFunction composeFloat(Float2BooleanFunction)
- Boolean2CharFunction andThenChar(Char2CharFunction)
- Object2CharFunction composeObject(Object2BooleanFunction)
- Function compose(Function)
- Short2CharFunction composeShort(Short2BooleanFunction)
- Boolean2ReferenceFunction andThenReference(Char2ReferenceFunction)
- Char2CharFunction composeChar(Char2BooleanFunction)
- Double2CharFunction composeDouble(Double2BooleanFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.Boolean2DoubleFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- double getOrDefault(boolean, double)
- Double getOrDefault(Object, Double)
- Object getOrDefault(Object, Object)
- Boolean2ShortFunction andThenShort(Double2ShortFunction)
- Byte2DoubleFunction composeByte(Byte2BooleanFunction)
- Boolean2IntFunction andThenInt(Double2IntFunction)
- Reference2DoubleFunction composeReference(Reference2BooleanFunction)
- Function andThen(Function)
- double remove(boolean)
- Double remove(Object)
- Object remove(Object)
- double put(boolean, double)
- Double put(Boolean, Double)
- Object put(Object, Object)
- void defaultReturnValue(double)
- double defaultReturnValue()
- Boolean2DoubleFunction andThenDouble(Double2DoubleFunction)
- Boolean2ObjectFunction andThenObject(Double2ObjectFunction)
- double get(boolean)
- Double get(Object)
- Object get(Object)
- Boolean2LongFunction andThenLong(Double2LongFunction)
- Long2DoubleFunction composeLong(Long2BooleanFunction)
- Boolean2ByteFunction andThenByte(Double2ByteFunction)
- Boolean2FloatFunction andThenFloat(Double2FloatFunction)
- boolean containsKey(boolean)
- boolean containsKey(Object)
- Int2DoubleFunction composeInt(Int2BooleanFunction)
- Float2DoubleFunction composeFloat(Float2BooleanFunction)
- Boolean2CharFunction andThenChar(Double2CharFunction)
- Object2DoubleFunction composeObject(Object2BooleanFunction)
- Function compose(Function)
- Short2DoubleFunction composeShort(Short2BooleanFunction)
- Boolean2ReferenceFunction andThenReference(Double2ReferenceFunction)
- Char2DoubleFunction composeChar(Char2BooleanFunction)
- Double2DoubleFunction composeDouble(Double2BooleanFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.Boolean2FloatFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- float getOrDefault(boolean, float)
- Float getOrDefault(Object, Float)
- Object getOrDefault(Object, Object)
- Boolean2ShortFunction andThenShort(Float2ShortFunction)
- Byte2FloatFunction composeByte(Byte2BooleanFunction)
- Boolean2IntFunction andThenInt(Float2IntFunction)
- Reference2FloatFunction composeReference(Reference2BooleanFunction)
- Function andThen(Function)
- float remove(boolean)
- Float remove(Object)
- Object remove(Object)
- float put(boolean, float)
- Float put(Boolean, Float)
- Object put(Object, Object)
- void defaultReturnValue(float)
- float defaultReturnValue()
- Boolean2DoubleFunction andThenDouble(Float2DoubleFunction)
- Boolean2ObjectFunction andThenObject(Float2ObjectFunction)
- float get(boolean)
- Float get(Object)
- Object get(Object)
- Boolean2LongFunction andThenLong(Float2LongFunction)
- Long2FloatFunction composeLong(Long2BooleanFunction)
- Boolean2ByteFunction andThenByte(Float2ByteFunction)
- Boolean2FloatFunction andThenFloat(Float2FloatFunction)
- boolean containsKey(boolean)
- boolean containsKey(Object)
- Int2FloatFunction composeInt(Int2BooleanFunction)
- Float2FloatFunction composeFloat(Float2BooleanFunction)
- Boolean2CharFunction andThenChar(Float2CharFunction)
- Object2FloatFunction composeObject(Object2BooleanFunction)
- Function compose(Function)
- Short2FloatFunction composeShort(Short2BooleanFunction)
- Boolean2ReferenceFunction andThenReference(Float2ReferenceFunction)
- Char2FloatFunction composeChar(Char2BooleanFunction)
- Double2FloatFunction composeDouble(Double2BooleanFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.Boolean2IntFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- int getOrDefault(boolean, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- Boolean2ShortFunction andThenShort(Int2ShortFunction)
- Byte2IntFunction composeByte(Byte2BooleanFunction)
- Boolean2IntFunction andThenInt(Int2IntFunction)
- Reference2IntFunction composeReference(Reference2BooleanFunction)
- Function andThen(Function)
- int remove(boolean)
- Integer remove(Object)
- Object remove(Object)
- int put(boolean, int)
- Integer put(Boolean, Integer)
- Object put(Object, Object)
- void defaultReturnValue(int)
- int defaultReturnValue()
- Boolean2DoubleFunction andThenDouble(Int2DoubleFunction)
- Boolean2ObjectFunction andThenObject(Int2ObjectFunction)
- int get(boolean)
- Integer get(Object)
- Object get(Object)
- Boolean2LongFunction andThenLong(Int2LongFunction)
- Long2IntFunction composeLong(Long2BooleanFunction)
- Boolean2ByteFunction andThenByte(Int2ByteFunction)
- Boolean2FloatFunction andThenFloat(Int2FloatFunction)
- boolean containsKey(boolean)
- boolean containsKey(Object)
- Int2IntFunction composeInt(Int2BooleanFunction)
- Float2IntFunction composeFloat(Float2BooleanFunction)
- Boolean2CharFunction andThenChar(Int2CharFunction)
- Object2IntFunction composeObject(Object2BooleanFunction)
- Function compose(Function)
- Short2IntFunction composeShort(Short2BooleanFunction)
- Boolean2ReferenceFunction andThenReference(Int2ReferenceFunction)
- Char2IntFunction composeChar(Char2BooleanFunction)
- Double2IntFunction composeDouble(Double2BooleanFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.Boolean2LongFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- long getOrDefault(boolean, long)
- Long getOrDefault(Object, Long)
- Object getOrDefault(Object, Object)
- Boolean2ShortFunction andThenShort(Long2ShortFunction)
- Byte2LongFunction composeByte(Byte2BooleanFunction)
- Boolean2IntFunction andThenInt(Long2IntFunction)
- Reference2LongFunction composeReference(Reference2BooleanFunction)
- Function andThen(Function)
- long remove(boolean)
- Long remove(Object)
- Object remove(Object)
- long put(boolean, long)
- Long put(Boolean, Long)
- Object put(Object, Object)
- void defaultReturnValue(long)
- long defaultReturnValue()
- Boolean2DoubleFunction andThenDouble(Long2DoubleFunction)
- Boolean2ObjectFunction andThenObject(Long2ObjectFunction)
- long get(boolean)
- Long get(Object)
- Object get(Object)
- Boolean2LongFunction andThenLong(Long2LongFunction)
- Long2LongFunction composeLong(Long2BooleanFunction)
- Boolean2ByteFunction andThenByte(Long2ByteFunction)
- Boolean2FloatFunction andThenFloat(Long2FloatFunction)
- boolean containsKey(boolean)
- boolean containsKey(Object)
- Int2LongFunction composeInt(Int2BooleanFunction)
- Float2LongFunction composeFloat(Float2BooleanFunction)
- Boolean2CharFunction andThenChar(Long2CharFunction)
- Object2LongFunction composeObject(Object2BooleanFunction)
- Function compose(Function)
- Short2LongFunction composeShort(Short2BooleanFunction)
- Boolean2ReferenceFunction andThenReference(Long2ReferenceFunction)
- Char2LongFunction composeChar(Char2BooleanFunction)
- Double2LongFunction composeDouble(Double2BooleanFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.Boolean2ObjectFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- Object getOrDefault(boolean, Object)
- Object getOrDefault(Object, Object)
- Boolean2ShortFunction andThenShort(Object2ShortFunction)
- Byte2ObjectFunction composeByte(Byte2BooleanFunction)
- Boolean2IntFunction andThenInt(Object2IntFunction)
- Reference2ObjectFunction composeReference(Reference2BooleanFunction)
- Object remove(boolean)
- Object remove(Object)
- Object put(boolean, Object)
- Object put(Boolean, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Boolean2DoubleFunction andThenDouble(Object2DoubleFunction)
- Boolean2ObjectFunction andThenObject(Object2ObjectFunction)
- Object get(boolean)
- Object get(Object)
- Boolean2LongFunction andThenLong(Object2LongFunction)
- Long2ObjectFunction composeLong(Long2BooleanFunction)
- Boolean2ByteFunction andThenByte(Object2ByteFunction)
- Boolean2FloatFunction andThenFloat(Object2FloatFunction)
- boolean containsKey(boolean)
- boolean containsKey(Object)
- Int2ObjectFunction composeInt(Int2BooleanFunction)
- Float2ObjectFunction composeFloat(Float2BooleanFunction)
- Boolean2CharFunction andThenChar(Object2CharFunction)
- Object2ObjectFunction composeObject(Object2BooleanFunction)
- Function compose(Function)
- Short2ObjectFunction composeShort(Short2BooleanFunction)
- Boolean2ReferenceFunction andThenReference(Object2ReferenceFunction)
- Char2ObjectFunction composeChar(Char2BooleanFunction)
- Double2ObjectFunction composeDouble(Double2BooleanFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.Boolean2ReferenceFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- Object getOrDefault(boolean, Object)
- Object getOrDefault(Object, Object)
- Boolean2ShortFunction andThenShort(Reference2ShortFunction)
- Byte2ReferenceFunction composeByte(Byte2BooleanFunction)
- Boolean2IntFunction andThenInt(Reference2IntFunction)
- Reference2ReferenceFunction composeReference(Reference2BooleanFunction)
- Object remove(boolean)
- Object remove(Object)
- Object put(boolean, Object)
- Object put(Boolean, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Boolean2DoubleFunction andThenDouble(Reference2DoubleFunction)
- Boolean2ObjectFunction andThenObject(Reference2ObjectFunction)
- Object get(boolean)
- Object get(Object)
- Boolean2LongFunction andThenLong(Reference2LongFunction)
- Long2ReferenceFunction composeLong(Long2BooleanFunction)
- Boolean2ByteFunction andThenByte(Reference2ByteFunction)
- Boolean2FloatFunction andThenFloat(Reference2FloatFunction)
- boolean containsKey(boolean)
- boolean containsKey(Object)
- Int2ReferenceFunction composeInt(Int2BooleanFunction)
- Float2ReferenceFunction composeFloat(Float2BooleanFunction)
- Boolean2CharFunction andThenChar(Reference2CharFunction)
- Object2ReferenceFunction composeObject(Object2BooleanFunction)
- Function compose(Function)
- Short2ReferenceFunction composeShort(Short2BooleanFunction)
- Boolean2ReferenceFunction andThenReference(Reference2ReferenceFunction)
- Char2ReferenceFunction composeChar(Char2BooleanFunction)
- Double2ReferenceFunction composeDouble(Double2BooleanFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.Boolean2ShortFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- short getOrDefault(boolean, short)
- Short getOrDefault(Object, Short)
- Object getOrDefault(Object, Object)
- Boolean2ShortFunction andThenShort(Short2ShortFunction)
- Byte2ShortFunction composeByte(Byte2BooleanFunction)
- Boolean2IntFunction andThenInt(Short2IntFunction)
- Reference2ShortFunction composeReference(Reference2BooleanFunction)
- Function andThen(Function)
- short remove(boolean)
- Short remove(Object)
- Object remove(Object)
- short put(boolean, short)
- Short put(Boolean, Short)
- Object put(Object, Object)
- void defaultReturnValue(short)
- short defaultReturnValue()
- Boolean2DoubleFunction andThenDouble(Short2DoubleFunction)
- Boolean2ObjectFunction andThenObject(Short2ObjectFunction)
- short get(boolean)
- Short get(Object)
- Object get(Object)
- Boolean2LongFunction andThenLong(Short2LongFunction)
- Long2ShortFunction composeLong(Long2BooleanFunction)
- Boolean2ByteFunction andThenByte(Short2ByteFunction)
- Boolean2FloatFunction andThenFloat(Short2FloatFunction)
- boolean containsKey(boolean)
- boolean containsKey(Object)
- Int2ShortFunction composeInt(Int2BooleanFunction)
- Float2ShortFunction composeFloat(Float2BooleanFunction)
- Boolean2CharFunction andThenChar(Short2CharFunction)
- Object2ShortFunction composeObject(Object2BooleanFunction)
- Function compose(Function)
- Short2ShortFunction composeShort(Short2BooleanFunction)
- Boolean2ReferenceFunction andThenReference(Short2ReferenceFunction)
- Char2ShortFunction composeChar(Char2BooleanFunction)
- Double2ShortFunction composeDouble(Double2BooleanFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.BooleanComparator
Type: Interface
Implements: java.util.Comparator

Methods:
- BooleanComparator comparingDouble(Boolean2DoubleFunction)
- int compare(boolean, boolean)
- int compare(Boolean, Boolean)
- int compare(Object, Object)
- BooleanComparator comparingLong(Boolean2LongFunction)
- BooleanComparator thenComparing(BooleanComparator)
- Comparator thenComparing(Comparator)
- BooleanComparator comparingInt(Boolean2IntFunction)
- BooleanComparator comparing(Boolean2ObjectFunction)
- BooleanComparator comparing(Boolean2ObjectFunction, Comparator)
- BooleanComparator reversed()
- Comparator reversed()

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.BooleanArrays
Type: Class

Methods:
- boolean[] grow(boolean[], int)
- boolean[] grow(boolean[], int, int)
- void swap(boolean[], int, int)
- void swap(boolean[], int, int, int)
- void parallelQuickSortIndirect(int[], boolean[], int, int)
- void parallelQuickSortIndirect(int[], boolean[])
- void ensureOffsetLength(boolean[], int, int)
- void ensureFromTo(boolean[], int, int)
- boolean[] reverse(boolean[])
- boolean[] reverse(boolean[], int, int)
- void mergeSort(boolean[], int, int, boolean[])
- void mergeSort(boolean[], int, int)
- void mergeSort(boolean[])
- void mergeSort(boolean[], int, int, BooleanComparator, boolean[])
- void mergeSort(boolean[], int, int, BooleanComparator)
- void mergeSort(boolean[], BooleanComparator)
- void quickSort(boolean[], int, int, BooleanComparator)
- void quickSort(boolean[], BooleanComparator)
- void quickSort(boolean[], int, int)
- void quickSort(boolean[])
- void quickSort(boolean[], boolean[], int, int)
- void quickSort(boolean[], boolean[])
- void fill(boolean[], boolean)
- void fill(boolean[], int, int, boolean)
- boolean[] forceCapacity(boolean[], int, int)
- void stableSort(boolean[], int, int)
- void stableSort(boolean[])
- void stableSort(boolean[], int, int, BooleanComparator)
- void stableSort(boolean[], BooleanComparator)
- boolean[] setLength(boolean[], int)
- void quickSortIndirect(int[], boolean[], int, int)
- void quickSortIndirect(int[], boolean[])
- boolean[] trim(boolean[], int)
- boolean equals(boolean[], boolean[])
- void stabilize(int[], boolean[], int, int)
- void stabilize(int[], boolean[])
- void parallelQuickSort(boolean[], int, int, BooleanComparator)
- void parallelQuickSort(boolean[], BooleanComparator)
- void parallelQuickSort(boolean[], int, int)
- void parallelQuickSort(boolean[])
- void parallelQuickSort(boolean[], boolean[], int, int)
- void parallelQuickSort(boolean[], boolean[])
- boolean[] copy(boolean[], int, int)
- boolean[] copy(boolean[])
- boolean[] ensureCapacity(boolean[], int)
- boolean[] ensureCapacity(boolean[], int, int)
- boolean[] shuffle(boolean[], int, int, Random)
- boolean[] shuffle(boolean[], Random)
- void unstableSort(boolean[], int, int)
- void unstableSort(boolean[])
- void unstableSort(boolean[], int, int, BooleanComparator)
- void unstableSort(boolean[], BooleanComparator)
- void ensureSameLength(boolean[], boolean[])

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.BooleanBigArrays
Type: Class

Methods:
- boolean[][] grow(boolean[][], long)
- boolean[][] grow(boolean[][], long, long)
- void set(boolean[][], long, boolean)
- void swap(boolean[][], long, long)
- long length(boolean[][])
- void ensureOffsetLength(boolean[][], long, long)
- void ensureFromTo(boolean[][], long, long)
- void quickSort(boolean[][], long, long, BooleanComparator)
- void quickSort(boolean[][], BooleanComparator)
- void quickSort(boolean[][], long, long)
- void quickSort(boolean[][])
- void fill(boolean[][], boolean)
- void fill(boolean[][], long, long, boolean)
- boolean[][] forceCapacity(boolean[][], long, long)
- boolean[][] newBigArray(long)
- void copyToBig(boolean[], int, boolean[][], long, long)
- boolean[][] setLength(boolean[][], long)
- void copyFromBig(boolean[][], long, boolean[], int, int)
- boolean[][] trim(boolean[][], long)
- boolean equals(boolean[][], boolean[][])
- boolean get(boolean[][], long)
- void parallelQuickSort(boolean[][], long, long)
- void parallelQuickSort(boolean[][])
- void parallelQuickSort(boolean[][], long, long, BooleanComparator)
- void parallelQuickSort(boolean[][], BooleanComparator)
- String toString(boolean[][])
- boolean[][] ensureCapacity(boolean[][], long)
- boolean[][] ensureCapacity(boolean[][], long, long)
- void copy(boolean[][], long, boolean[][], long, long)
- boolean[][] copy(boolean[][], long, long)
- boolean[][] copy(boolean[][])
- boolean[][] shuffle(boolean[][], long, long, Random)
- boolean[][] shuffle(boolean[][], Random)
- boolean[][] wrap(boolean[])
- void ensureSameLength(boolean[][], boolean[][])

### Class: com.sk89q.worldedit.bukkit.fastutil.booleans.BooleanComparators
Type: Class

Methods:
- BooleanComparator oppositeComparator(BooleanComparator)
- BooleanComparator asBooleanComparator(Comparator)

## Package: com.sk89q.worldedit.bukkit.fastutil.bytes

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.Byte2BooleanFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntPredicate

Methods:
- boolean getOrDefault(byte, boolean)
- Boolean getOrDefault(Object, Boolean)
- Object getOrDefault(Object, Object)
- Byte2ShortFunction andThenShort(Boolean2ShortFunction)
- Byte2BooleanFunction composeByte(Byte2ByteFunction)
- Byte2IntFunction andThenInt(Boolean2IntFunction)
- Reference2BooleanFunction composeReference(Reference2ByteFunction)
- Function andThen(Function)
- boolean remove(byte)
- Boolean remove(Object)
- Object remove(Object)
- boolean put(byte, boolean)
- Boolean put(Byte, Boolean)
- Object put(Object, Object)
- void defaultReturnValue(boolean)
- boolean defaultReturnValue()
- Byte2DoubleFunction andThenDouble(Boolean2DoubleFunction)
- Byte2ObjectFunction andThenObject(Boolean2ObjectFunction)
- boolean get(byte)
- Boolean get(Object)
- Object get(Object)
- Byte2LongFunction andThenLong(Boolean2LongFunction)
- Long2BooleanFunction composeLong(Long2ByteFunction)
- Byte2ByteFunction andThenByte(Boolean2ByteFunction)
- Byte2FloatFunction andThenFloat(Boolean2FloatFunction)
- boolean test(int)
- boolean containsKey(byte)
- boolean containsKey(Object)
- Int2BooleanFunction composeInt(Int2ByteFunction)
- Float2BooleanFunction composeFloat(Float2ByteFunction)
- Byte2CharFunction andThenChar(Boolean2CharFunction)
- Object2BooleanFunction composeObject(Object2ByteFunction)
- Function compose(Function)
- Short2BooleanFunction composeShort(Short2ByteFunction)
- Byte2ReferenceFunction andThenReference(Boolean2ReferenceFunction)
- Char2BooleanFunction composeChar(Char2ByteFunction)
- Double2BooleanFunction composeDouble(Double2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.Byte2ByteFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- byte getOrDefault(byte, byte)
- Byte getOrDefault(Object, Byte)
- Object getOrDefault(Object, Object)
- Byte2ShortFunction andThenShort(Byte2ShortFunction)
- Byte2ByteFunction composeByte(Byte2ByteFunction)
- Byte2IntFunction andThenInt(Byte2IntFunction)
- Reference2ByteFunction composeReference(Reference2ByteFunction)
- Function andThen(Function)
- byte remove(byte)
- Byte remove(Object)
- Object remove(Object)
- byte put(byte, byte)
- Byte put(Byte, Byte)
- Object put(Object, Object)
- void defaultReturnValue(byte)
- byte defaultReturnValue()
- Byte2DoubleFunction andThenDouble(Byte2DoubleFunction)
- Byte2ObjectFunction andThenObject(Byte2ObjectFunction)
- Byte2ByteFunction identity()
- byte get(byte)
- Byte get(Object)
- Object get(Object)
- Byte2LongFunction andThenLong(Byte2LongFunction)
- Long2ByteFunction composeLong(Long2ByteFunction)
- Byte2ByteFunction andThenByte(Byte2ByteFunction)
- Byte2FloatFunction andThenFloat(Byte2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(byte)
- boolean containsKey(Object)
- Int2ByteFunction composeInt(Int2ByteFunction)
- Float2ByteFunction composeFloat(Float2ByteFunction)
- Byte2CharFunction andThenChar(Byte2CharFunction)
- Object2ByteFunction composeObject(Object2ByteFunction)
- Function compose(Function)
- Short2ByteFunction composeShort(Short2ByteFunction)
- Byte2ReferenceFunction andThenReference(Byte2ReferenceFunction)
- Char2ByteFunction composeChar(Char2ByteFunction)
- Double2ByteFunction composeDouble(Double2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.Byte2CharFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- char getOrDefault(byte, char)
- Character getOrDefault(Object, Character)
- Object getOrDefault(Object, Object)
- Byte2ShortFunction andThenShort(Char2ShortFunction)
- Byte2CharFunction composeByte(Byte2ByteFunction)
- Byte2IntFunction andThenInt(Char2IntFunction)
- Reference2CharFunction composeReference(Reference2ByteFunction)
- Function andThen(Function)
- char remove(byte)
- Character remove(Object)
- Object remove(Object)
- char put(byte, char)
- Character put(Byte, Character)
- Object put(Object, Object)
- void defaultReturnValue(char)
- char defaultReturnValue()
- Byte2DoubleFunction andThenDouble(Char2DoubleFunction)
- Byte2ObjectFunction andThenObject(Char2ObjectFunction)
- char get(byte)
- Character get(Object)
- Object get(Object)
- Byte2LongFunction andThenLong(Char2LongFunction)
- Long2CharFunction composeLong(Long2ByteFunction)
- Byte2ByteFunction andThenByte(Char2ByteFunction)
- Byte2FloatFunction andThenFloat(Char2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(byte)
- boolean containsKey(Object)
- Int2CharFunction composeInt(Int2ByteFunction)
- Float2CharFunction composeFloat(Float2ByteFunction)
- Byte2CharFunction andThenChar(Char2CharFunction)
- Object2CharFunction composeObject(Object2ByteFunction)
- Function compose(Function)
- Short2CharFunction composeShort(Short2ByteFunction)
- Byte2ReferenceFunction andThenReference(Char2ReferenceFunction)
- Char2CharFunction composeChar(Char2ByteFunction)
- Double2CharFunction composeDouble(Double2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.Byte2DoubleFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToDoubleFunction

Methods:
- double getOrDefault(byte, double)
- Double getOrDefault(Object, Double)
- Object getOrDefault(Object, Object)
- double applyAsDouble(int)
- Byte2ShortFunction andThenShort(Double2ShortFunction)
- Byte2DoubleFunction composeByte(Byte2ByteFunction)
- Byte2IntFunction andThenInt(Double2IntFunction)
- Reference2DoubleFunction composeReference(Reference2ByteFunction)
- Function andThen(Function)
- double remove(byte)
- Double remove(Object)
- Object remove(Object)
- double put(byte, double)
- Double put(Byte, Double)
- Object put(Object, Object)
- void defaultReturnValue(double)
- double defaultReturnValue()
- Byte2DoubleFunction andThenDouble(Double2DoubleFunction)
- Byte2ObjectFunction andThenObject(Double2ObjectFunction)
- double get(byte)
- Double get(Object)
- Object get(Object)
- Byte2LongFunction andThenLong(Double2LongFunction)
- Long2DoubleFunction composeLong(Long2ByteFunction)
- Byte2ByteFunction andThenByte(Double2ByteFunction)
- Byte2FloatFunction andThenFloat(Double2FloatFunction)
- boolean containsKey(byte)
- boolean containsKey(Object)
- Int2DoubleFunction composeInt(Int2ByteFunction)
- Float2DoubleFunction composeFloat(Float2ByteFunction)
- Byte2CharFunction andThenChar(Double2CharFunction)
- Object2DoubleFunction composeObject(Object2ByteFunction)
- Function compose(Function)
- Short2DoubleFunction composeShort(Short2ByteFunction)
- Byte2ReferenceFunction andThenReference(Double2ReferenceFunction)
- Char2DoubleFunction composeChar(Char2ByteFunction)
- Double2DoubleFunction composeDouble(Double2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.Byte2FloatFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToDoubleFunction

Methods:
- float getOrDefault(byte, float)
- Float getOrDefault(Object, Float)
- Object getOrDefault(Object, Object)
- double applyAsDouble(int)
- Byte2ShortFunction andThenShort(Float2ShortFunction)
- Byte2FloatFunction composeByte(Byte2ByteFunction)
- Byte2IntFunction andThenInt(Float2IntFunction)
- Reference2FloatFunction composeReference(Reference2ByteFunction)
- Function andThen(Function)
- float remove(byte)
- Float remove(Object)
- Object remove(Object)
- float put(byte, float)
- Float put(Byte, Float)
- Object put(Object, Object)
- void defaultReturnValue(float)
- float defaultReturnValue()
- Byte2DoubleFunction andThenDouble(Float2DoubleFunction)
- Byte2ObjectFunction andThenObject(Float2ObjectFunction)
- float get(byte)
- Float get(Object)
- Object get(Object)
- Byte2LongFunction andThenLong(Float2LongFunction)
- Long2FloatFunction composeLong(Long2ByteFunction)
- Byte2ByteFunction andThenByte(Float2ByteFunction)
- Byte2FloatFunction andThenFloat(Float2FloatFunction)
- boolean containsKey(byte)
- boolean containsKey(Object)
- Int2FloatFunction composeInt(Int2ByteFunction)
- Float2FloatFunction composeFloat(Float2ByteFunction)
- Byte2CharFunction andThenChar(Float2CharFunction)
- Object2FloatFunction composeObject(Object2ByteFunction)
- Function compose(Function)
- Short2FloatFunction composeShort(Short2ByteFunction)
- Byte2ReferenceFunction andThenReference(Float2ReferenceFunction)
- Char2FloatFunction composeChar(Char2ByteFunction)
- Double2FloatFunction composeDouble(Double2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.Byte2IntFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- int getOrDefault(byte, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- Byte2ShortFunction andThenShort(Int2ShortFunction)
- Byte2IntFunction composeByte(Byte2ByteFunction)
- Byte2IntFunction andThenInt(Int2IntFunction)
- Reference2IntFunction composeReference(Reference2ByteFunction)
- Function andThen(Function)
- int remove(byte)
- Integer remove(Object)
- Object remove(Object)
- int put(byte, int)
- Integer put(Byte, Integer)
- Object put(Object, Object)
- void defaultReturnValue(int)
- int defaultReturnValue()
- Byte2DoubleFunction andThenDouble(Int2DoubleFunction)
- Byte2ObjectFunction andThenObject(Int2ObjectFunction)
- int get(byte)
- Integer get(Object)
- Object get(Object)
- Byte2LongFunction andThenLong(Int2LongFunction)
- Long2IntFunction composeLong(Long2ByteFunction)
- Byte2ByteFunction andThenByte(Int2ByteFunction)
- Byte2FloatFunction andThenFloat(Int2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(byte)
- boolean containsKey(Object)
- Int2IntFunction composeInt(Int2ByteFunction)
- Float2IntFunction composeFloat(Float2ByteFunction)
- Byte2CharFunction andThenChar(Int2CharFunction)
- Object2IntFunction composeObject(Object2ByteFunction)
- Function compose(Function)
- Short2IntFunction composeShort(Short2ByteFunction)
- Byte2ReferenceFunction andThenReference(Int2ReferenceFunction)
- Char2IntFunction composeChar(Char2ByteFunction)
- Double2IntFunction composeDouble(Double2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.Byte2LongFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToLongFunction

Methods:
- long getOrDefault(byte, long)
- Long getOrDefault(Object, Long)
- Object getOrDefault(Object, Object)
- Byte2ShortFunction andThenShort(Long2ShortFunction)
- Byte2LongFunction composeByte(Byte2ByteFunction)
- Byte2IntFunction andThenInt(Long2IntFunction)
- Reference2LongFunction composeReference(Reference2ByteFunction)
- Function andThen(Function)
- long remove(byte)
- Long remove(Object)
- Object remove(Object)
- long put(byte, long)
- Long put(Byte, Long)
- Object put(Object, Object)
- void defaultReturnValue(long)
- long defaultReturnValue()
- Byte2DoubleFunction andThenDouble(Long2DoubleFunction)
- Byte2ObjectFunction andThenObject(Long2ObjectFunction)
- long get(byte)
- Long get(Object)
- Object get(Object)
- Byte2LongFunction andThenLong(Long2LongFunction)
- Long2LongFunction composeLong(Long2ByteFunction)
- Byte2ByteFunction andThenByte(Long2ByteFunction)
- Byte2FloatFunction andThenFloat(Long2FloatFunction)
- boolean containsKey(byte)
- boolean containsKey(Object)
- Int2LongFunction composeInt(Int2ByteFunction)
- Float2LongFunction composeFloat(Float2ByteFunction)
- Byte2CharFunction andThenChar(Long2CharFunction)
- long applyAsLong(int)
- Object2LongFunction composeObject(Object2ByteFunction)
- Function compose(Function)
- Short2LongFunction composeShort(Short2ByteFunction)
- Byte2ReferenceFunction andThenReference(Long2ReferenceFunction)
- Char2LongFunction composeChar(Char2ByteFunction)
- Double2LongFunction composeDouble(Double2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.Byte2ObjectFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntFunction

Methods:
- Object getOrDefault(byte, Object)
- Object getOrDefault(Object, Object)
- Byte2ShortFunction andThenShort(Object2ShortFunction)
- Byte2ObjectFunction composeByte(Byte2ByteFunction)
- Byte2IntFunction andThenInt(Object2IntFunction)
- Reference2ObjectFunction composeReference(Reference2ByteFunction)
- Object remove(byte)
- Object remove(Object)
- Object put(byte, Object)
- Object put(Byte, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Byte2DoubleFunction andThenDouble(Object2DoubleFunction)
- Byte2ObjectFunction andThenObject(Object2ObjectFunction)
- Object get(byte)
- Object get(Object)
- Byte2LongFunction andThenLong(Object2LongFunction)
- Long2ObjectFunction composeLong(Long2ByteFunction)
- Byte2ByteFunction andThenByte(Object2ByteFunction)
- Byte2FloatFunction andThenFloat(Object2FloatFunction)
- Object apply(int)
- boolean containsKey(byte)
- boolean containsKey(Object)
- Int2ObjectFunction composeInt(Int2ByteFunction)
- Float2ObjectFunction composeFloat(Float2ByteFunction)
- Byte2CharFunction andThenChar(Object2CharFunction)
- Object2ObjectFunction composeObject(Object2ByteFunction)
- Function compose(Function)
- Short2ObjectFunction composeShort(Short2ByteFunction)
- Byte2ReferenceFunction andThenReference(Object2ReferenceFunction)
- Char2ObjectFunction composeChar(Char2ByteFunction)
- Double2ObjectFunction composeDouble(Double2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.Byte2ReferenceFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntFunction

Methods:
- Object getOrDefault(byte, Object)
- Object getOrDefault(Object, Object)
- Byte2ShortFunction andThenShort(Reference2ShortFunction)
- Byte2ReferenceFunction composeByte(Byte2ByteFunction)
- Byte2IntFunction andThenInt(Reference2IntFunction)
- Reference2ReferenceFunction composeReference(Reference2ByteFunction)
- Object remove(byte)
- Object remove(Object)
- Object put(byte, Object)
- Object put(Byte, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Byte2DoubleFunction andThenDouble(Reference2DoubleFunction)
- Byte2ObjectFunction andThenObject(Reference2ObjectFunction)
- Object get(byte)
- Object get(Object)
- Byte2LongFunction andThenLong(Reference2LongFunction)
- Long2ReferenceFunction composeLong(Long2ByteFunction)
- Byte2ByteFunction andThenByte(Reference2ByteFunction)
- Byte2FloatFunction andThenFloat(Reference2FloatFunction)
- Object apply(int)
- boolean containsKey(byte)
- boolean containsKey(Object)
- Int2ReferenceFunction composeInt(Int2ByteFunction)
- Float2ReferenceFunction composeFloat(Float2ByteFunction)
- Byte2CharFunction andThenChar(Reference2CharFunction)
- Object2ReferenceFunction composeObject(Object2ByteFunction)
- Function compose(Function)
- Short2ReferenceFunction composeShort(Short2ByteFunction)
- Byte2ReferenceFunction andThenReference(Reference2ReferenceFunction)
- Char2ReferenceFunction composeChar(Char2ByteFunction)
- Double2ReferenceFunction composeDouble(Double2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.Byte2ShortFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- short getOrDefault(byte, short)
- Short getOrDefault(Object, Short)
- Object getOrDefault(Object, Object)
- Byte2ShortFunction andThenShort(Short2ShortFunction)
- Byte2ShortFunction composeByte(Byte2ByteFunction)
- Byte2IntFunction andThenInt(Short2IntFunction)
- Reference2ShortFunction composeReference(Reference2ByteFunction)
- Function andThen(Function)
- short remove(byte)
- Short remove(Object)
- Object remove(Object)
- short put(byte, short)
- Short put(Byte, Short)
- Object put(Object, Object)
- void defaultReturnValue(short)
- short defaultReturnValue()
- Byte2DoubleFunction andThenDouble(Short2DoubleFunction)
- Byte2ObjectFunction andThenObject(Short2ObjectFunction)
- short get(byte)
- Short get(Object)
- Object get(Object)
- Byte2LongFunction andThenLong(Short2LongFunction)
- Long2ShortFunction composeLong(Long2ByteFunction)
- Byte2ByteFunction andThenByte(Short2ByteFunction)
- Byte2FloatFunction andThenFloat(Short2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(byte)
- boolean containsKey(Object)
- Int2ShortFunction composeInt(Int2ByteFunction)
- Float2ShortFunction composeFloat(Float2ByteFunction)
- Byte2CharFunction andThenChar(Short2CharFunction)
- Object2ShortFunction composeObject(Object2ByteFunction)
- Function compose(Function)
- Short2ShortFunction composeShort(Short2ByteFunction)
- Byte2ReferenceFunction andThenReference(Short2ReferenceFunction)
- Char2ShortFunction composeChar(Char2ByteFunction)
- Double2ShortFunction composeDouble(Double2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.ByteComparator
Type: Interface
Implements: java.util.Comparator

Methods:
- ByteComparator comparingDouble(Byte2DoubleFunction)
- int compare(byte, byte)
- int compare(Byte, Byte)
- int compare(Object, Object)
- ByteComparator comparingLong(Byte2LongFunction)
- ByteComparator thenComparing(ByteComparator)
- Comparator thenComparing(Comparator)
- ByteComparator comparingInt(Byte2IntFunction)
- ByteComparator comparing(Byte2ObjectFunction)
- ByteComparator comparing(Byte2ObjectFunction, Comparator)
- ByteComparator reversed()
- Comparator reversed()

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.ByteConsumer
Type: Interface
Implements: java.util.function.Consumer, java.util.function.IntConsumer

Methods:
- ByteConsumer andThen(ByteConsumer)
- ByteConsumer andThen(IntConsumer)
- Consumer andThen(Consumer)
- IntConsumer andThen(IntConsumer)
- void accept(byte)
- void accept(int)
- void accept(Byte)
- void accept(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.ByteIterator
Type: Interface
Implements: java.util.PrimitiveIterator

Methods:
- Byte next()
- Object next()
- byte nextByte()
- int skip(int)
- void forEachRemaining(ByteConsumer)
- void forEachRemaining(IntConsumer)
- void forEachRemaining(Consumer)
- void forEachRemaining(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.ByteSpliterator
Type: Interface
Implements: java.util.Spliterator$OfPrimitive

Methods:
- ByteSpliterator trySplit()
- Spliterator$OfPrimitive trySplit()
- Spliterator trySplit()
- boolean tryAdvance(Consumer)
- ByteComparator getComparator()
- Comparator getComparator()
- long skip(long)
- void forEachRemaining(Consumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.ByteArrays
Type: Class

Methods:
- int binarySearch(byte[], int, int, byte)
- int binarySearch(byte[], byte)
- int binarySearch(byte[], int, int, byte, ByteComparator)
- int binarySearch(byte[], byte, ByteComparator)
- void ensureFromTo(byte[], int, int)
- void mergeSort(byte[], int, int, byte[])
- void mergeSort(byte[], int, int)
- void mergeSort(byte[])
- void mergeSort(byte[], int, int, ByteComparator, byte[])
- void mergeSort(byte[], int, int, ByteComparator)
- void mergeSort(byte[], ByteComparator)
- byte[] forceCapacity(byte[], int, int)
- void radixSortIndirect(int[], byte[], boolean)
- void radixSortIndirect(int[], byte[], int, int, boolean)
- void radixSortIndirect(int[], byte[], byte[], boolean)
- void radixSortIndirect(int[], byte[], byte[], int, int, boolean)
- void stableSort(byte[], int, int)
- void stableSort(byte[])
- void stableSort(byte[], int, int, ByteComparator)
- void stableSort(byte[], ByteComparator)
- byte[] trim(byte[], int)
- void parallelQuickSort(byte[], int, int, ByteComparator)
- void parallelQuickSort(byte[], ByteComparator)
- void parallelQuickSort(byte[], int, int)
- void parallelQuickSort(byte[])
- void parallelQuickSort(byte[], byte[], int, int)
- void parallelQuickSort(byte[], byte[])
- byte[] copy(byte[], int, int)
- byte[] copy(byte[])
- void ensureSameLength(byte[], byte[])
- byte[] grow(byte[], int)
- byte[] grow(byte[], int, int)
- void parallelRadixSort(byte[], int, int)
- void parallelRadixSort(byte[])
- void parallelRadixSort(byte[], byte[], int, int)
- void parallelRadixSort(byte[], byte[])
- void swap(byte[], int, int)
- void swap(byte[], int, int, int)
- void parallelQuickSortIndirect(int[], byte[], int, int)
- void parallelQuickSortIndirect(int[], byte[])
- void ensureOffsetLength(byte[], int, int)
- void radixSort(byte[])
- void radixSort(byte[], int, int)
- void radixSort(byte[], byte[])
- void radixSort(byte[], byte[], int, int)
- void radixSort(byte[][])
- void radixSort(byte[][], int, int)
- byte[] reverse(byte[])
- byte[] reverse(byte[], int, int)
- void quickSort(byte[], int, int, ByteComparator)
- void quickSort(byte[], ByteComparator)
- void quickSort(byte[], int, int)
- void quickSort(byte[])
- void quickSort(byte[], byte[], int, int)
- void quickSort(byte[], byte[])
- void fill(byte[], byte)
- void fill(byte[], int, int, byte)
- byte[] setLength(byte[], int)
- void quickSortIndirect(int[], byte[], int, int)
- void quickSortIndirect(int[], byte[])
- boolean equals(byte[], byte[])
- void stabilize(int[], byte[], int, int)
- void stabilize(int[], byte[])
- void parallelRadixSortIndirect(int[], byte[], int, int, boolean)
- void parallelRadixSortIndirect(int[], byte[], boolean)
- byte[] ensureCapacity(byte[], int)
- byte[] ensureCapacity(byte[], int, int)
- byte[] shuffle(byte[], int, int, Random)
- byte[] shuffle(byte[], Random)
- void unstableSort(byte[], int, int)
- void unstableSort(byte[])
- void unstableSort(byte[], int, int, ByteComparator)
- void unstableSort(byte[], ByteComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.ByteBigArrays
Type: Class

Methods:
- void mul(byte[][], long, byte)
- long binarySearch(byte[][], long, long, byte)
- long binarySearch(byte[][], byte)
- long binarySearch(byte[][], long, long, byte, ByteComparator)
- long binarySearch(byte[][], byte, ByteComparator)
- void ensureFromTo(byte[][], long, long)
- byte[][] forceCapacity(byte[][], long, long)
- void radixSortIndirect(long[][], byte[][], byte[][], boolean)
- void radixSortIndirect(long[][], byte[][], byte[][], long, long, boolean)
- byte[][] trim(byte[][], long)
- byte get(byte[][], long)
- void parallelQuickSort(byte[][], long, long)
- void parallelQuickSort(byte[][])
- void parallelQuickSort(byte[][], long, long, ByteComparator)
- void parallelQuickSort(byte[][], ByteComparator)
- void copy(byte[][], long, byte[][], long, long)
- byte[][] copy(byte[][], long, long)
- byte[][] copy(byte[][])
- void ensureSameLength(byte[][], byte[][])
- void decr(byte[][], long)
- void add(byte[][], long, byte)
- byte[][] grow(byte[][], long)
- byte[][] grow(byte[][], long, long)
- void set(byte[][], long, byte)
- void incr(byte[][], long)
- void swap(byte[][], long, long)
- long length(byte[][])
- void ensureOffsetLength(byte[][], long, long)
- void radixSort(byte[][])
- void radixSort(byte[][], long, long)
- void radixSort(byte[][], byte[][])
- void radixSort(byte[][], byte[][], long, long)
- void quickSort(byte[][], long, long, ByteComparator)
- void quickSort(byte[][], ByteComparator)
- void quickSort(byte[][], long, long)
- void quickSort(byte[][])
- void fill(byte[][], byte)
- void fill(byte[][], long, long, byte)
- byte[][] newBigArray(long)
- void copyToBig(byte[], int, byte[][], long, long)
- byte[][] setLength(byte[][], long)
- void copyFromBig(byte[][], long, byte[], int, int)
- boolean equals(byte[][], byte[][])
- String toString(byte[][])
- byte[][] ensureCapacity(byte[][], long)
- byte[][] ensureCapacity(byte[][], long, long)
- byte[][] shuffle(byte[][], long, long, Random)
- byte[][] shuffle(byte[][], Random)
- byte[][] wrap(byte[])

### Class: com.sk89q.worldedit.bukkit.fastutil.bytes.ByteComparators
Type: Class

Methods:
- ByteComparator asByteComparator(Comparator)
- ByteComparator oppositeComparator(ByteComparator)

## Package: com.sk89q.worldedit.bukkit.fastutil.chars

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.Char2BooleanFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntPredicate

Methods:
- boolean getOrDefault(char, boolean)
- Boolean getOrDefault(Object, Boolean)
- Object getOrDefault(Object, Object)
- Char2ShortFunction andThenShort(Boolean2ShortFunction)
- Byte2BooleanFunction composeByte(Byte2CharFunction)
- Char2IntFunction andThenInt(Boolean2IntFunction)
- Reference2BooleanFunction composeReference(Reference2CharFunction)
- Function andThen(Function)
- boolean remove(char)
- Boolean remove(Object)
- Object remove(Object)
- boolean put(char, boolean)
- Boolean put(Character, Boolean)
- Object put(Object, Object)
- void defaultReturnValue(boolean)
- boolean defaultReturnValue()
- Char2DoubleFunction andThenDouble(Boolean2DoubleFunction)
- Char2ObjectFunction andThenObject(Boolean2ObjectFunction)
- boolean get(char)
- Boolean get(Object)
- Object get(Object)
- Char2LongFunction andThenLong(Boolean2LongFunction)
- Long2BooleanFunction composeLong(Long2CharFunction)
- Char2ByteFunction andThenByte(Boolean2ByteFunction)
- Char2FloatFunction andThenFloat(Boolean2FloatFunction)
- boolean test(int)
- boolean containsKey(char)
- boolean containsKey(Object)
- Int2BooleanFunction composeInt(Int2CharFunction)
- Float2BooleanFunction composeFloat(Float2CharFunction)
- Char2CharFunction andThenChar(Boolean2CharFunction)
- Object2BooleanFunction composeObject(Object2CharFunction)
- Function compose(Function)
- Short2BooleanFunction composeShort(Short2CharFunction)
- Char2ReferenceFunction andThenReference(Boolean2ReferenceFunction)
- Char2BooleanFunction composeChar(Char2CharFunction)
- Double2BooleanFunction composeDouble(Double2CharFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.Char2ByteFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- byte getOrDefault(char, byte)
- Byte getOrDefault(Object, Byte)
- Object getOrDefault(Object, Object)
- Char2ShortFunction andThenShort(Byte2ShortFunction)
- Byte2ByteFunction composeByte(Byte2CharFunction)
- Char2IntFunction andThenInt(Byte2IntFunction)
- Reference2ByteFunction composeReference(Reference2CharFunction)
- Function andThen(Function)
- byte remove(char)
- Byte remove(Object)
- Object remove(Object)
- byte put(char, byte)
- Byte put(Character, Byte)
- Object put(Object, Object)
- void defaultReturnValue(byte)
- byte defaultReturnValue()
- Char2DoubleFunction andThenDouble(Byte2DoubleFunction)
- Char2ObjectFunction andThenObject(Byte2ObjectFunction)
- byte get(char)
- Byte get(Object)
- Object get(Object)
- Char2LongFunction andThenLong(Byte2LongFunction)
- Long2ByteFunction composeLong(Long2CharFunction)
- Char2ByteFunction andThenByte(Byte2ByteFunction)
- Char2FloatFunction andThenFloat(Byte2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(char)
- boolean containsKey(Object)
- Int2ByteFunction composeInt(Int2CharFunction)
- Float2ByteFunction composeFloat(Float2CharFunction)
- Char2CharFunction andThenChar(Byte2CharFunction)
- Object2ByteFunction composeObject(Object2CharFunction)
- Function compose(Function)
- Short2ByteFunction composeShort(Short2CharFunction)
- Char2ReferenceFunction andThenReference(Byte2ReferenceFunction)
- Char2ByteFunction composeChar(Char2CharFunction)
- Double2ByteFunction composeDouble(Double2CharFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.Char2CharFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- char getOrDefault(char, char)
- Character getOrDefault(Object, Character)
- Object getOrDefault(Object, Object)
- Char2ShortFunction andThenShort(Char2ShortFunction)
- Byte2CharFunction composeByte(Byte2CharFunction)
- Char2IntFunction andThenInt(Char2IntFunction)
- Reference2CharFunction composeReference(Reference2CharFunction)
- Function andThen(Function)
- char remove(char)
- Character remove(Object)
- Object remove(Object)
- char put(char, char)
- Character put(Character, Character)
- Object put(Object, Object)
- void defaultReturnValue(char)
- char defaultReturnValue()
- Char2DoubleFunction andThenDouble(Char2DoubleFunction)
- Char2ObjectFunction andThenObject(Char2ObjectFunction)
- Char2CharFunction identity()
- char get(char)
- Character get(Object)
- Object get(Object)
- Char2LongFunction andThenLong(Char2LongFunction)
- Long2CharFunction composeLong(Long2CharFunction)
- Char2ByteFunction andThenByte(Char2ByteFunction)
- Char2FloatFunction andThenFloat(Char2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(char)
- boolean containsKey(Object)
- Int2CharFunction composeInt(Int2CharFunction)
- Float2CharFunction composeFloat(Float2CharFunction)
- Char2CharFunction andThenChar(Char2CharFunction)
- Object2CharFunction composeObject(Object2CharFunction)
- Function compose(Function)
- Short2CharFunction composeShort(Short2CharFunction)
- Char2ReferenceFunction andThenReference(Char2ReferenceFunction)
- Char2CharFunction composeChar(Char2CharFunction)
- Double2CharFunction composeDouble(Double2CharFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.Char2DoubleFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToDoubleFunction

Methods:
- double getOrDefault(char, double)
- Double getOrDefault(Object, Double)
- Object getOrDefault(Object, Object)
- double applyAsDouble(int)
- Char2ShortFunction andThenShort(Double2ShortFunction)
- Byte2DoubleFunction composeByte(Byte2CharFunction)
- Char2IntFunction andThenInt(Double2IntFunction)
- Reference2DoubleFunction composeReference(Reference2CharFunction)
- Function andThen(Function)
- double remove(char)
- Double remove(Object)
- Object remove(Object)
- double put(char, double)
- Double put(Character, Double)
- Object put(Object, Object)
- void defaultReturnValue(double)
- double defaultReturnValue()
- Char2DoubleFunction andThenDouble(Double2DoubleFunction)
- Char2ObjectFunction andThenObject(Double2ObjectFunction)
- double get(char)
- Double get(Object)
- Object get(Object)
- Char2LongFunction andThenLong(Double2LongFunction)
- Long2DoubleFunction composeLong(Long2CharFunction)
- Char2ByteFunction andThenByte(Double2ByteFunction)
- Char2FloatFunction andThenFloat(Double2FloatFunction)
- boolean containsKey(char)
- boolean containsKey(Object)
- Int2DoubleFunction composeInt(Int2CharFunction)
- Float2DoubleFunction composeFloat(Float2CharFunction)
- Char2CharFunction andThenChar(Double2CharFunction)
- Object2DoubleFunction composeObject(Object2CharFunction)
- Function compose(Function)
- Short2DoubleFunction composeShort(Short2CharFunction)
- Char2ReferenceFunction andThenReference(Double2ReferenceFunction)
- Char2DoubleFunction composeChar(Char2CharFunction)
- Double2DoubleFunction composeDouble(Double2CharFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.Char2FloatFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToDoubleFunction

Methods:
- float getOrDefault(char, float)
- Float getOrDefault(Object, Float)
- Object getOrDefault(Object, Object)
- double applyAsDouble(int)
- Char2ShortFunction andThenShort(Float2ShortFunction)
- Byte2FloatFunction composeByte(Byte2CharFunction)
- Char2IntFunction andThenInt(Float2IntFunction)
- Reference2FloatFunction composeReference(Reference2CharFunction)
- Function andThen(Function)
- float remove(char)
- Float remove(Object)
- Object remove(Object)
- float put(char, float)
- Float put(Character, Float)
- Object put(Object, Object)
- void defaultReturnValue(float)
- float defaultReturnValue()
- Char2DoubleFunction andThenDouble(Float2DoubleFunction)
- Char2ObjectFunction andThenObject(Float2ObjectFunction)
- float get(char)
- Float get(Object)
- Object get(Object)
- Char2LongFunction andThenLong(Float2LongFunction)
- Long2FloatFunction composeLong(Long2CharFunction)
- Char2ByteFunction andThenByte(Float2ByteFunction)
- Char2FloatFunction andThenFloat(Float2FloatFunction)
- boolean containsKey(char)
- boolean containsKey(Object)
- Int2FloatFunction composeInt(Int2CharFunction)
- Float2FloatFunction composeFloat(Float2CharFunction)
- Char2CharFunction andThenChar(Float2CharFunction)
- Object2FloatFunction composeObject(Object2CharFunction)
- Function compose(Function)
- Short2FloatFunction composeShort(Short2CharFunction)
- Char2ReferenceFunction andThenReference(Float2ReferenceFunction)
- Char2FloatFunction composeChar(Char2CharFunction)
- Double2FloatFunction composeDouble(Double2CharFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.Char2IntFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- int getOrDefault(char, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- Char2ShortFunction andThenShort(Int2ShortFunction)
- Byte2IntFunction composeByte(Byte2CharFunction)
- Char2IntFunction andThenInt(Int2IntFunction)
- Reference2IntFunction composeReference(Reference2CharFunction)
- Function andThen(Function)
- int remove(char)
- Integer remove(Object)
- Object remove(Object)
- int put(char, int)
- Integer put(Character, Integer)
- Object put(Object, Object)
- void defaultReturnValue(int)
- int defaultReturnValue()
- Char2DoubleFunction andThenDouble(Int2DoubleFunction)
- Char2ObjectFunction andThenObject(Int2ObjectFunction)
- int get(char)
- Integer get(Object)
- Object get(Object)
- Char2LongFunction andThenLong(Int2LongFunction)
- Long2IntFunction composeLong(Long2CharFunction)
- Char2ByteFunction andThenByte(Int2ByteFunction)
- Char2FloatFunction andThenFloat(Int2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(char)
- boolean containsKey(Object)
- Int2IntFunction composeInt(Int2CharFunction)
- Float2IntFunction composeFloat(Float2CharFunction)
- Char2CharFunction andThenChar(Int2CharFunction)
- Object2IntFunction composeObject(Object2CharFunction)
- Function compose(Function)
- Short2IntFunction composeShort(Short2CharFunction)
- Char2ReferenceFunction andThenReference(Int2ReferenceFunction)
- Char2IntFunction composeChar(Char2CharFunction)
- Double2IntFunction composeDouble(Double2CharFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.Char2LongFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToLongFunction

Methods:
- long getOrDefault(char, long)
- Long getOrDefault(Object, Long)
- Object getOrDefault(Object, Object)
- Char2ShortFunction andThenShort(Long2ShortFunction)
- Byte2LongFunction composeByte(Byte2CharFunction)
- Char2IntFunction andThenInt(Long2IntFunction)
- Reference2LongFunction composeReference(Reference2CharFunction)
- Function andThen(Function)
- long remove(char)
- Long remove(Object)
- Object remove(Object)
- long put(char, long)
- Long put(Character, Long)
- Object put(Object, Object)
- void defaultReturnValue(long)
- long defaultReturnValue()
- Char2DoubleFunction andThenDouble(Long2DoubleFunction)
- Char2ObjectFunction andThenObject(Long2ObjectFunction)
- long get(char)
- Long get(Object)
- Object get(Object)
- Char2LongFunction andThenLong(Long2LongFunction)
- Long2LongFunction composeLong(Long2CharFunction)
- Char2ByteFunction andThenByte(Long2ByteFunction)
- Char2FloatFunction andThenFloat(Long2FloatFunction)
- boolean containsKey(char)
- boolean containsKey(Object)
- Int2LongFunction composeInt(Int2CharFunction)
- Float2LongFunction composeFloat(Float2CharFunction)
- Char2CharFunction andThenChar(Long2CharFunction)
- long applyAsLong(int)
- Object2LongFunction composeObject(Object2CharFunction)
- Function compose(Function)
- Short2LongFunction composeShort(Short2CharFunction)
- Char2ReferenceFunction andThenReference(Long2ReferenceFunction)
- Char2LongFunction composeChar(Char2CharFunction)
- Double2LongFunction composeDouble(Double2CharFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.Char2ObjectFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntFunction

Methods:
- Object getOrDefault(char, Object)
- Object getOrDefault(Object, Object)
- Char2ShortFunction andThenShort(Object2ShortFunction)
- Byte2ObjectFunction composeByte(Byte2CharFunction)
- Char2IntFunction andThenInt(Object2IntFunction)
- Reference2ObjectFunction composeReference(Reference2CharFunction)
- Object remove(char)
- Object remove(Object)
- Object put(char, Object)
- Object put(Character, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Char2DoubleFunction andThenDouble(Object2DoubleFunction)
- Char2ObjectFunction andThenObject(Object2ObjectFunction)
- Object get(char)
- Object get(Object)
- Char2LongFunction andThenLong(Object2LongFunction)
- Long2ObjectFunction composeLong(Long2CharFunction)
- Char2ByteFunction andThenByte(Object2ByteFunction)
- Char2FloatFunction andThenFloat(Object2FloatFunction)
- Object apply(int)
- boolean containsKey(char)
- boolean containsKey(Object)
- Int2ObjectFunction composeInt(Int2CharFunction)
- Float2ObjectFunction composeFloat(Float2CharFunction)
- Char2CharFunction andThenChar(Object2CharFunction)
- Object2ObjectFunction composeObject(Object2CharFunction)
- Function compose(Function)
- Short2ObjectFunction composeShort(Short2CharFunction)
- Char2ReferenceFunction andThenReference(Object2ReferenceFunction)
- Char2ObjectFunction composeChar(Char2CharFunction)
- Double2ObjectFunction composeDouble(Double2CharFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.Char2ReferenceFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntFunction

Methods:
- Object getOrDefault(char, Object)
- Object getOrDefault(Object, Object)
- Char2ShortFunction andThenShort(Reference2ShortFunction)
- Byte2ReferenceFunction composeByte(Byte2CharFunction)
- Char2IntFunction andThenInt(Reference2IntFunction)
- Reference2ReferenceFunction composeReference(Reference2CharFunction)
- Object remove(char)
- Object remove(Object)
- Object put(char, Object)
- Object put(Character, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Char2DoubleFunction andThenDouble(Reference2DoubleFunction)
- Char2ObjectFunction andThenObject(Reference2ObjectFunction)
- Object get(char)
- Object get(Object)
- Char2LongFunction andThenLong(Reference2LongFunction)
- Long2ReferenceFunction composeLong(Long2CharFunction)
- Char2ByteFunction andThenByte(Reference2ByteFunction)
- Char2FloatFunction andThenFloat(Reference2FloatFunction)
- Object apply(int)
- boolean containsKey(char)
- boolean containsKey(Object)
- Int2ReferenceFunction composeInt(Int2CharFunction)
- Float2ReferenceFunction composeFloat(Float2CharFunction)
- Char2CharFunction andThenChar(Reference2CharFunction)
- Object2ReferenceFunction composeObject(Object2CharFunction)
- Function compose(Function)
- Short2ReferenceFunction composeShort(Short2CharFunction)
- Char2ReferenceFunction andThenReference(Reference2ReferenceFunction)
- Char2ReferenceFunction composeChar(Char2CharFunction)
- Double2ReferenceFunction composeDouble(Double2CharFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.Char2ShortFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- short getOrDefault(char, short)
- Short getOrDefault(Object, Short)
- Object getOrDefault(Object, Object)
- Char2ShortFunction andThenShort(Short2ShortFunction)
- Byte2ShortFunction composeByte(Byte2CharFunction)
- Char2IntFunction andThenInt(Short2IntFunction)
- Reference2ShortFunction composeReference(Reference2CharFunction)
- Function andThen(Function)
- short remove(char)
- Short remove(Object)
- Object remove(Object)
- short put(char, short)
- Short put(Character, Short)
- Object put(Object, Object)
- void defaultReturnValue(short)
- short defaultReturnValue()
- Char2DoubleFunction andThenDouble(Short2DoubleFunction)
- Char2ObjectFunction andThenObject(Short2ObjectFunction)
- short get(char)
- Short get(Object)
- Object get(Object)
- Char2LongFunction andThenLong(Short2LongFunction)
- Long2ShortFunction composeLong(Long2CharFunction)
- Char2ByteFunction andThenByte(Short2ByteFunction)
- Char2FloatFunction andThenFloat(Short2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(char)
- boolean containsKey(Object)
- Int2ShortFunction composeInt(Int2CharFunction)
- Float2ShortFunction composeFloat(Float2CharFunction)
- Char2CharFunction andThenChar(Short2CharFunction)
- Object2ShortFunction composeObject(Object2CharFunction)
- Function compose(Function)
- Short2ShortFunction composeShort(Short2CharFunction)
- Char2ReferenceFunction andThenReference(Short2ReferenceFunction)
- Char2ShortFunction composeChar(Char2CharFunction)
- Double2ShortFunction composeDouble(Double2CharFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.CharComparator
Type: Interface
Implements: java.util.Comparator

Methods:
- CharComparator comparingDouble(Char2DoubleFunction)
- int compare(char, char)
- int compare(Character, Character)
- int compare(Object, Object)
- CharComparator comparingLong(Char2LongFunction)
- CharComparator thenComparing(CharComparator)
- Comparator thenComparing(Comparator)
- CharComparator comparingInt(Char2IntFunction)
- CharComparator comparing(Char2ObjectFunction)
- CharComparator comparing(Char2ObjectFunction, Comparator)
- CharComparator reversed()
- Comparator reversed()

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.CharConsumer
Type: Interface
Implements: java.util.function.Consumer, java.util.function.IntConsumer

Methods:
- CharConsumer andThen(CharConsumer)
- CharConsumer andThen(IntConsumer)
- Consumer andThen(Consumer)
- IntConsumer andThen(IntConsumer)
- void accept(char)
- void accept(int)
- void accept(Character)
- void accept(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.CharIterator
Type: Interface
Implements: java.util.PrimitiveIterator

Methods:
- Character next()
- Object next()
- char nextChar()
- int skip(int)
- void forEachRemaining(CharConsumer)
- void forEachRemaining(IntConsumer)
- void forEachRemaining(Consumer)
- void forEachRemaining(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.CharSpliterator
Type: Interface
Implements: java.util.Spliterator$OfPrimitive

Methods:
- CharSpliterator trySplit()
- Spliterator$OfPrimitive trySplit()
- Spliterator trySplit()
- boolean tryAdvance(Consumer)
- CharComparator getComparator()
- Comparator getComparator()
- long skip(long)
- void forEachRemaining(Consumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.CharArrays
Type: Class

Methods:
- int binarySearch(char[], int, int, char)
- int binarySearch(char[], char)
- int binarySearch(char[], int, int, char, CharComparator)
- int binarySearch(char[], char, CharComparator)
- void ensureFromTo(char[], int, int)
- void mergeSort(char[], int, int, char[])
- void mergeSort(char[], int, int)
- void mergeSort(char[])
- void mergeSort(char[], int, int, CharComparator, char[])
- void mergeSort(char[], int, int, CharComparator)
- void mergeSort(char[], CharComparator)
- char[] forceCapacity(char[], int, int)
- void radixSortIndirect(int[], char[], boolean)
- void radixSortIndirect(int[], char[], int, int, boolean)
- void radixSortIndirect(int[], char[], char[], boolean)
- void radixSortIndirect(int[], char[], char[], int, int, boolean)
- void stableSort(char[], int, int)
- void stableSort(char[])
- void stableSort(char[], int, int, CharComparator)
- void stableSort(char[], CharComparator)
- char[] trim(char[], int)
- void parallelQuickSort(char[], int, int, CharComparator)
- void parallelQuickSort(char[], CharComparator)
- void parallelQuickSort(char[], int, int)
- void parallelQuickSort(char[])
- void parallelQuickSort(char[], char[], int, int)
- void parallelQuickSort(char[], char[])
- char[] copy(char[], int, int)
- char[] copy(char[])
- void ensureSameLength(char[], char[])
- char[] grow(char[], int)
- char[] grow(char[], int, int)
- void parallelRadixSort(char[], int, int)
- void parallelRadixSort(char[])
- void parallelRadixSort(char[], char[], int, int)
- void parallelRadixSort(char[], char[])
- void swap(char[], int, int)
- void swap(char[], int, int, int)
- void parallelQuickSortIndirect(int[], char[], int, int)
- void parallelQuickSortIndirect(int[], char[])
- void ensureOffsetLength(char[], int, int)
- void radixSort(char[])
- void radixSort(char[], int, int)
- void radixSort(char[], char[])
- void radixSort(char[], char[], int, int)
- void radixSort(char[][])
- void radixSort(char[][], int, int)
- char[] reverse(char[])
- char[] reverse(char[], int, int)
- void quickSort(char[], int, int, CharComparator)
- void quickSort(char[], CharComparator)
- void quickSort(char[], int, int)
- void quickSort(char[])
- void quickSort(char[], char[], int, int)
- void quickSort(char[], char[])
- void fill(char[], char)
- void fill(char[], int, int, char)
- char[] setLength(char[], int)
- void quickSortIndirect(int[], char[], int, int)
- void quickSortIndirect(int[], char[])
- boolean equals(char[], char[])
- void stabilize(int[], char[], int, int)
- void stabilize(int[], char[])
- void parallelRadixSortIndirect(int[], char[], int, int, boolean)
- void parallelRadixSortIndirect(int[], char[], boolean)
- char[] ensureCapacity(char[], int)
- char[] ensureCapacity(char[], int, int)
- char[] shuffle(char[], int, int, Random)
- char[] shuffle(char[], Random)
- void unstableSort(char[], int, int)
- void unstableSort(char[])
- void unstableSort(char[], int, int, CharComparator)
- void unstableSort(char[], CharComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.CharBigArrays
Type: Class

Methods:
- void mul(char[][], long, char)
- long binarySearch(char[][], long, long, char)
- long binarySearch(char[][], char)
- long binarySearch(char[][], long, long, char, CharComparator)
- long binarySearch(char[][], char, CharComparator)
- void ensureFromTo(char[][], long, long)
- char[][] forceCapacity(char[][], long, long)
- void radixSortIndirect(long[][], char[][], char[][], boolean)
- void radixSortIndirect(long[][], char[][], char[][], long, long, boolean)
- char[][] trim(char[][], long)
- char get(char[][], long)
- void parallelQuickSort(char[][], long, long)
- void parallelQuickSort(char[][])
- void parallelQuickSort(char[][], long, long, CharComparator)
- void parallelQuickSort(char[][], CharComparator)
- void copy(char[][], long, char[][], long, long)
- char[][] copy(char[][], long, long)
- char[][] copy(char[][])
- void ensureSameLength(char[][], char[][])
- void decr(char[][], long)
- void add(char[][], long, char)
- char[][] grow(char[][], long)
- char[][] grow(char[][], long, long)
- void set(char[][], long, char)
- void incr(char[][], long)
- void swap(char[][], long, long)
- long length(char[][])
- void ensureOffsetLength(char[][], long, long)
- void radixSort(char[][])
- void radixSort(char[][], long, long)
- void radixSort(char[][], char[][])
- void radixSort(char[][], char[][], long, long)
- void quickSort(char[][], long, long, CharComparator)
- void quickSort(char[][], CharComparator)
- void quickSort(char[][], long, long)
- void quickSort(char[][])
- void fill(char[][], char)
- void fill(char[][], long, long, char)
- char[][] newBigArray(long)
- void copyToBig(char[], int, char[][], long, long)
- char[][] setLength(char[][], long)
- void copyFromBig(char[][], long, char[], int, int)
- boolean equals(char[][], char[][])
- String toString(char[][])
- char[][] ensureCapacity(char[][], long)
- char[][] ensureCapacity(char[][], long, long)
- char[][] shuffle(char[][], long, long, Random)
- char[][] shuffle(char[][], Random)
- char[][] wrap(char[])

### Class: com.sk89q.worldedit.bukkit.fastutil.chars.CharComparators
Type: Class

Methods:
- CharComparator asCharComparator(Comparator)
- CharComparator oppositeComparator(CharComparator)

## Package: com.sk89q.worldedit.bukkit.fastutil.doubles

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2BooleanFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoublePredicate

Methods:
- boolean getOrDefault(double, boolean)
- Boolean getOrDefault(Object, Boolean)
- Object getOrDefault(Object, Object)
- Double2ShortFunction andThenShort(Boolean2ShortFunction)
- Byte2BooleanFunction composeByte(Byte2DoubleFunction)
- Double2IntFunction andThenInt(Boolean2IntFunction)
- Reference2BooleanFunction composeReference(Reference2DoubleFunction)
- Function andThen(Function)
- boolean remove(double)
- Boolean remove(Object)
- Object remove(Object)
- boolean put(double, boolean)
- Boolean put(Double, Boolean)
- Object put(Object, Object)
- void defaultReturnValue(boolean)
- boolean defaultReturnValue()
- Double2DoubleFunction andThenDouble(Boolean2DoubleFunction)
- Double2ObjectFunction andThenObject(Boolean2ObjectFunction)
- boolean get(double)
- Boolean get(Object)
- Object get(Object)
- Double2LongFunction andThenLong(Boolean2LongFunction)
- Long2BooleanFunction composeLong(Long2DoubleFunction)
- Double2ByteFunction andThenByte(Boolean2ByteFunction)
- Double2FloatFunction andThenFloat(Boolean2FloatFunction)
- boolean test(double)
- boolean containsKey(double)
- boolean containsKey(Object)
- Int2BooleanFunction composeInt(Int2DoubleFunction)
- Float2BooleanFunction composeFloat(Float2DoubleFunction)
- Double2CharFunction andThenChar(Boolean2CharFunction)
- Object2BooleanFunction composeObject(Object2DoubleFunction)
- Function compose(Function)
- Short2BooleanFunction composeShort(Short2DoubleFunction)
- Double2ReferenceFunction andThenReference(Boolean2ReferenceFunction)
- Char2BooleanFunction composeChar(Char2DoubleFunction)
- Double2BooleanFunction composeDouble(Double2DoubleFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ByteFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleToIntFunction

Methods:
- byte getOrDefault(double, byte)
- Byte getOrDefault(Object, Byte)
- Object getOrDefault(Object, Object)
- Double2ShortFunction andThenShort(Byte2ShortFunction)
- Byte2ByteFunction composeByte(Byte2DoubleFunction)
- Double2IntFunction andThenInt(Byte2IntFunction)
- Reference2ByteFunction composeReference(Reference2DoubleFunction)
- Function andThen(Function)
- byte remove(double)
- Byte remove(Object)
- Object remove(Object)
- byte put(double, byte)
- Byte put(Double, Byte)
- Object put(Object, Object)
- void defaultReturnValue(byte)
- byte defaultReturnValue()
- Double2DoubleFunction andThenDouble(Byte2DoubleFunction)
- Double2ObjectFunction andThenObject(Byte2ObjectFunction)
- byte get(double)
- Byte get(Object)
- Object get(Object)
- Double2LongFunction andThenLong(Byte2LongFunction)
- Long2ByteFunction composeLong(Long2DoubleFunction)
- Double2ByteFunction andThenByte(Byte2ByteFunction)
- Double2FloatFunction andThenFloat(Byte2FloatFunction)
- int applyAsInt(double)
- boolean containsKey(double)
- boolean containsKey(Object)
- Int2ByteFunction composeInt(Int2DoubleFunction)
- Float2ByteFunction composeFloat(Float2DoubleFunction)
- Double2CharFunction andThenChar(Byte2CharFunction)
- Object2ByteFunction composeObject(Object2DoubleFunction)
- Function compose(Function)
- Short2ByteFunction composeShort(Short2DoubleFunction)
- Double2ReferenceFunction andThenReference(Byte2ReferenceFunction)
- Char2ByteFunction composeChar(Char2DoubleFunction)
- Double2ByteFunction composeDouble(Double2DoubleFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2CharFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleToIntFunction

Methods:
- char getOrDefault(double, char)
- Character getOrDefault(Object, Character)
- Object getOrDefault(Object, Object)
- Double2ShortFunction andThenShort(Char2ShortFunction)
- Byte2CharFunction composeByte(Byte2DoubleFunction)
- Double2IntFunction andThenInt(Char2IntFunction)
- Reference2CharFunction composeReference(Reference2DoubleFunction)
- Function andThen(Function)
- char remove(double)
- Character remove(Object)
- Object remove(Object)
- char put(double, char)
- Character put(Double, Character)
- Object put(Object, Object)
- void defaultReturnValue(char)
- char defaultReturnValue()
- Double2DoubleFunction andThenDouble(Char2DoubleFunction)
- Double2ObjectFunction andThenObject(Char2ObjectFunction)
- char get(double)
- Character get(Object)
- Object get(Object)
- Double2LongFunction andThenLong(Char2LongFunction)
- Long2CharFunction composeLong(Long2DoubleFunction)
- Double2ByteFunction andThenByte(Char2ByteFunction)
- Double2FloatFunction andThenFloat(Char2FloatFunction)
- int applyAsInt(double)
- boolean containsKey(double)
- boolean containsKey(Object)
- Int2CharFunction composeInt(Int2DoubleFunction)
- Float2CharFunction composeFloat(Float2DoubleFunction)
- Double2CharFunction andThenChar(Char2CharFunction)
- Object2CharFunction composeObject(Object2DoubleFunction)
- Function compose(Function)
- Short2CharFunction composeShort(Short2DoubleFunction)
- Double2ReferenceFunction andThenReference(Char2ReferenceFunction)
- Char2CharFunction composeChar(Char2DoubleFunction)
- Double2CharFunction composeDouble(Double2DoubleFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2DoubleFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleUnaryOperator

Methods:
- double getOrDefault(double, double)
- Double getOrDefault(Object, Double)
- Object getOrDefault(Object, Object)
- double applyAsDouble(double)
- Double2ShortFunction andThenShort(Double2ShortFunction)
- Byte2DoubleFunction composeByte(Byte2DoubleFunction)
- Double2IntFunction andThenInt(Double2IntFunction)
- Reference2DoubleFunction composeReference(Reference2DoubleFunction)
- Function andThen(Function)
- double remove(double)
- Double remove(Object)
- Object remove(Object)
- double put(double, double)
- Double put(Double, Double)
- Object put(Object, Object)
- void defaultReturnValue(double)
- double defaultReturnValue()
- Double2DoubleFunction andThenDouble(Double2DoubleFunction)
- Double2ObjectFunction andThenObject(Double2ObjectFunction)
- Double2DoubleFunction identity()
- double get(double)
- Double get(Object)
- Object get(Object)
- Double2LongFunction andThenLong(Double2LongFunction)
- Long2DoubleFunction composeLong(Long2DoubleFunction)
- Double2ByteFunction andThenByte(Double2ByteFunction)
- Double2FloatFunction andThenFloat(Double2FloatFunction)
- boolean containsKey(double)
- boolean containsKey(Object)
- Int2DoubleFunction composeInt(Int2DoubleFunction)
- Float2DoubleFunction composeFloat(Float2DoubleFunction)
- Double2CharFunction andThenChar(Double2CharFunction)
- Object2DoubleFunction composeObject(Object2DoubleFunction)
- Function compose(Function)
- Short2DoubleFunction composeShort(Short2DoubleFunction)
- Double2ReferenceFunction andThenReference(Double2ReferenceFunction)
- Char2DoubleFunction composeChar(Char2DoubleFunction)
- Double2DoubleFunction composeDouble(Double2DoubleFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2FloatFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleUnaryOperator

Methods:
- float getOrDefault(double, float)
- Float getOrDefault(Object, Float)
- Object getOrDefault(Object, Object)
- double applyAsDouble(double)
- Double2ShortFunction andThenShort(Float2ShortFunction)
- Byte2FloatFunction composeByte(Byte2DoubleFunction)
- Double2IntFunction andThenInt(Float2IntFunction)
- Reference2FloatFunction composeReference(Reference2DoubleFunction)
- Function andThen(Function)
- float remove(double)
- Float remove(Object)
- Object remove(Object)
- float put(double, float)
- Float put(Double, Float)
- Object put(Object, Object)
- void defaultReturnValue(float)
- float defaultReturnValue()
- Double2DoubleFunction andThenDouble(Float2DoubleFunction)
- Double2ObjectFunction andThenObject(Float2ObjectFunction)
- float get(double)
- Float get(Object)
- Object get(Object)
- Double2LongFunction andThenLong(Float2LongFunction)
- Long2FloatFunction composeLong(Long2DoubleFunction)
- Double2ByteFunction andThenByte(Float2ByteFunction)
- Double2FloatFunction andThenFloat(Float2FloatFunction)
- boolean containsKey(double)
- boolean containsKey(Object)
- Int2FloatFunction composeInt(Int2DoubleFunction)
- Float2FloatFunction composeFloat(Float2DoubleFunction)
- Double2CharFunction andThenChar(Float2CharFunction)
- Object2FloatFunction composeObject(Object2DoubleFunction)
- Function compose(Function)
- Short2FloatFunction composeShort(Short2DoubleFunction)
- Double2ReferenceFunction andThenReference(Float2ReferenceFunction)
- Char2FloatFunction composeChar(Char2DoubleFunction)
- Double2FloatFunction composeDouble(Double2DoubleFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2IntFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleToIntFunction

Methods:
- int getOrDefault(double, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- Double2ShortFunction andThenShort(Int2ShortFunction)
- Byte2IntFunction composeByte(Byte2DoubleFunction)
- Double2IntFunction andThenInt(Int2IntFunction)
- Reference2IntFunction composeReference(Reference2DoubleFunction)
- Function andThen(Function)
- int remove(double)
- Integer remove(Object)
- Object remove(Object)
- int put(double, int)
- Integer put(Double, Integer)
- Object put(Object, Object)
- void defaultReturnValue(int)
- int defaultReturnValue()
- Double2DoubleFunction andThenDouble(Int2DoubleFunction)
- Double2ObjectFunction andThenObject(Int2ObjectFunction)
- int get(double)
- Integer get(Object)
- Object get(Object)
- Double2LongFunction andThenLong(Int2LongFunction)
- Long2IntFunction composeLong(Long2DoubleFunction)
- Double2ByteFunction andThenByte(Int2ByteFunction)
- Double2FloatFunction andThenFloat(Int2FloatFunction)
- int applyAsInt(double)
- boolean containsKey(double)
- boolean containsKey(Object)
- Int2IntFunction composeInt(Int2DoubleFunction)
- Float2IntFunction composeFloat(Float2DoubleFunction)
- Double2CharFunction andThenChar(Int2CharFunction)
- Object2IntFunction composeObject(Object2DoubleFunction)
- Function compose(Function)
- Short2IntFunction composeShort(Short2DoubleFunction)
- Double2ReferenceFunction andThenReference(Int2ReferenceFunction)
- Char2IntFunction composeChar(Char2DoubleFunction)
- Double2IntFunction composeDouble(Double2DoubleFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2LongFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleToLongFunction

Methods:
- long getOrDefault(double, long)
- Long getOrDefault(Object, Long)
- Object getOrDefault(Object, Object)
- Double2ShortFunction andThenShort(Long2ShortFunction)
- Byte2LongFunction composeByte(Byte2DoubleFunction)
- Double2IntFunction andThenInt(Long2IntFunction)
- Reference2LongFunction composeReference(Reference2DoubleFunction)
- Function andThen(Function)
- long remove(double)
- Long remove(Object)
- Object remove(Object)
- long put(double, long)
- Long put(Double, Long)
- Object put(Object, Object)
- void defaultReturnValue(long)
- long defaultReturnValue()
- Double2DoubleFunction andThenDouble(Long2DoubleFunction)
- Double2ObjectFunction andThenObject(Long2ObjectFunction)
- long get(double)
- Long get(Object)
- Object get(Object)
- Double2LongFunction andThenLong(Long2LongFunction)
- Long2LongFunction composeLong(Long2DoubleFunction)
- Double2ByteFunction andThenByte(Long2ByteFunction)
- Double2FloatFunction andThenFloat(Long2FloatFunction)
- boolean containsKey(double)
- boolean containsKey(Object)
- Int2LongFunction composeInt(Int2DoubleFunction)
- Float2LongFunction composeFloat(Float2DoubleFunction)
- Double2CharFunction andThenChar(Long2CharFunction)
- long applyAsLong(double)
- Object2LongFunction composeObject(Object2DoubleFunction)
- Function compose(Function)
- Short2LongFunction composeShort(Short2DoubleFunction)
- Double2ReferenceFunction andThenReference(Long2ReferenceFunction)
- Char2LongFunction composeChar(Char2DoubleFunction)
- Double2LongFunction composeDouble(Double2DoubleFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleFunction

Methods:
- Object getOrDefault(double, Object)
- Object getOrDefault(Object, Object)
- Double2ShortFunction andThenShort(Object2ShortFunction)
- Byte2ObjectFunction composeByte(Byte2DoubleFunction)
- Double2IntFunction andThenInt(Object2IntFunction)
- Reference2ObjectFunction composeReference(Reference2DoubleFunction)
- Object remove(double)
- Object remove(Object)
- Object put(double, Object)
- Object put(Double, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Double2DoubleFunction andThenDouble(Object2DoubleFunction)
- Double2ObjectFunction andThenObject(Object2ObjectFunction)
- Object get(double)
- Object get(Object)
- Double2LongFunction andThenLong(Object2LongFunction)
- Long2ObjectFunction composeLong(Long2DoubleFunction)
- Double2ByteFunction andThenByte(Object2ByteFunction)
- Double2FloatFunction andThenFloat(Object2FloatFunction)
- Object apply(double)
- boolean containsKey(double)
- boolean containsKey(Object)
- Int2ObjectFunction composeInt(Int2DoubleFunction)
- Float2ObjectFunction composeFloat(Float2DoubleFunction)
- Double2CharFunction andThenChar(Object2CharFunction)
- Object2ObjectFunction composeObject(Object2DoubleFunction)
- Function compose(Function)
- Short2ObjectFunction composeShort(Short2DoubleFunction)
- Double2ReferenceFunction andThenReference(Object2ReferenceFunction)
- Char2ObjectFunction composeChar(Char2DoubleFunction)
- Double2ObjectFunction composeDouble(Double2DoubleFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectMap
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectFunction, java.util.Map

Methods:
- Object getOrDefault(double, Object)
- Object getOrDefault(Object, Object)
- ObjectSet entrySet()
- Set entrySet()
- void forEach(BiConsumer)
- boolean containsKey(double)
- boolean containsKey(Object)
- Object computeIfAbsent(double, DoubleFunction)
- Object computeIfAbsent(double, Double2ObjectFunction)
- ObjectCollection values()
- Collection values()
- boolean replace(double, Object, Object)
- Object replace(double, Object)
- void clear()
- Object computeIfAbsentPartial(double, Double2ObjectFunction)
- Object remove(Object)
- boolean remove(double, Object)
- Object put(Double, Object)
- Object put(Object, Object)
- Object compute(double, BiFunction)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Object computeIfPresent(double, BiFunction)
- int size()
- Object merge(double, Object, BiFunction)
- Object get(Object)
- Object putIfAbsent(double, Object)
- DoubleSet keySet()
- Set keySet()
- ObjectSet double2ObjectEntrySet()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectSortedMap
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectMap, java.util.SortedMap

Methods:
- DoubleComparator comparator()
- Comparator comparator()
- ObjectSortedSet entrySet()
- ObjectSet entrySet()
- Set entrySet()
- Double firstKey()
- Object firstKey()
- double lastDoubleKey()
- ObjectCollection values()
- Collection values()
- Double2ObjectSortedMap subMap(double, double)
- Double2ObjectSortedMap subMap(Double, Double)
- SortedMap subMap(Object, Object)
- Double lastKey()
- Object lastKey()
- Double2ObjectSortedMap headMap(double)
- Double2ObjectSortedMap headMap(Double)
- SortedMap headMap(Object)
- DoubleSortedSet keySet()
- DoubleSet keySet()
- Set keySet()
- double firstDoubleKey()
- Double2ObjectSortedMap tailMap(double)
- Double2ObjectSortedMap tailMap(Double)
- SortedMap tailMap(Object)
- ObjectSortedSet double2ObjectEntrySet()
- ObjectSet double2ObjectEntrySet()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ReferenceFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleFunction

Methods:
- Object getOrDefault(double, Object)
- Object getOrDefault(Object, Object)
- Double2ShortFunction andThenShort(Reference2ShortFunction)
- Byte2ReferenceFunction composeByte(Byte2DoubleFunction)
- Double2IntFunction andThenInt(Reference2IntFunction)
- Reference2ReferenceFunction composeReference(Reference2DoubleFunction)
- Object remove(double)
- Object remove(Object)
- Object put(double, Object)
- Object put(Double, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Double2DoubleFunction andThenDouble(Reference2DoubleFunction)
- Double2ObjectFunction andThenObject(Reference2ObjectFunction)
- Object get(double)
- Object get(Object)
- Double2LongFunction andThenLong(Reference2LongFunction)
- Long2ReferenceFunction composeLong(Long2DoubleFunction)
- Double2ByteFunction andThenByte(Reference2ByteFunction)
- Double2FloatFunction andThenFloat(Reference2FloatFunction)
- Object apply(double)
- boolean containsKey(double)
- boolean containsKey(Object)
- Int2ReferenceFunction composeInt(Int2DoubleFunction)
- Float2ReferenceFunction composeFloat(Float2DoubleFunction)
- Double2CharFunction andThenChar(Reference2CharFunction)
- Object2ReferenceFunction composeObject(Object2DoubleFunction)
- Function compose(Function)
- Short2ReferenceFunction composeShort(Short2DoubleFunction)
- Double2ReferenceFunction andThenReference(Reference2ReferenceFunction)
- Char2ReferenceFunction composeChar(Char2DoubleFunction)
- Double2ReferenceFunction composeDouble(Double2DoubleFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ShortFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleToIntFunction

Methods:
- short getOrDefault(double, short)
- Short getOrDefault(Object, Short)
- Object getOrDefault(Object, Object)
- Double2ShortFunction andThenShort(Short2ShortFunction)
- Byte2ShortFunction composeByte(Byte2DoubleFunction)
- Double2IntFunction andThenInt(Short2IntFunction)
- Reference2ShortFunction composeReference(Reference2DoubleFunction)
- Function andThen(Function)
- short remove(double)
- Short remove(Object)
- Object remove(Object)
- short put(double, short)
- Short put(Double, Short)
- Object put(Object, Object)
- void defaultReturnValue(short)
- short defaultReturnValue()
- Double2DoubleFunction andThenDouble(Short2DoubleFunction)
- Double2ObjectFunction andThenObject(Short2ObjectFunction)
- short get(double)
- Short get(Object)
- Object get(Object)
- Double2LongFunction andThenLong(Short2LongFunction)
- Long2ShortFunction composeLong(Long2DoubleFunction)
- Double2ByteFunction andThenByte(Short2ByteFunction)
- Double2FloatFunction andThenFloat(Short2FloatFunction)
- int applyAsInt(double)
- boolean containsKey(double)
- boolean containsKey(Object)
- Int2ShortFunction composeInt(Int2DoubleFunction)
- Float2ShortFunction composeFloat(Float2DoubleFunction)
- Double2CharFunction andThenChar(Short2CharFunction)
- Object2ShortFunction composeObject(Object2DoubleFunction)
- Function compose(Function)
- Short2ShortFunction composeShort(Short2DoubleFunction)
- Double2ReferenceFunction andThenReference(Short2ReferenceFunction)
- Char2ShortFunction composeChar(Char2DoubleFunction)
- Double2ShortFunction composeDouble(Double2DoubleFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleBidirectionalIterable
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleIterable

Methods:
- DoubleBidirectionalIterator iterator()
- DoubleIterator iterator()
- Iterator iterator()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleBidirectionalIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleIterator, com.sk89q.worldedit.bukkit.fastutil.objects.ObjectBidirectionalIterator

Methods:
- Double previous()
- Object previous()
- double previousDouble()
- int back(int)
- int skip(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleBigListIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleBidirectionalIterator, com.sk89q.worldedit.bukkit.fastutil.BigListIterator

Methods:
- void add(double)
- void add(Double)
- void add(Object)
- void set(double)
- void set(Double)
- void set(Object)
- long back(long)
- long skip(long)
- int skip(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleCollection
Type: Interface
Implements: java.util.Collection, com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleIterable

Methods:
- boolean add(double)
- boolean add(Double)
- boolean add(Object)
- DoubleSpliterator spliterator()
- Spliterator spliterator()
- boolean containsAll(DoubleCollection)
- DoubleSpliterator doubleSpliterator()
- DoubleStream doubleStream()
- boolean remove(Object)
- boolean removeIf(Predicate)
- boolean removeIf(DoublePredicate)
- boolean removeIf(DoublePredicate)
- DoubleStream doubleParallelStream()
- boolean removeAll(DoubleCollection)
- boolean contains(double)
- boolean contains(Object)
- DoubleIterator iterator()
- Iterator iterator()
- Stream stream()
- boolean addAll(DoubleCollection)
- double[] toDoubleArray()
- double[] toDoubleArray(double[])
- double[] toArray(double[])
- Stream parallelStream()
- boolean rem(double)
- DoubleIterator doubleIterator()
- boolean retainAll(DoubleCollection)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleComparator
Type: Interface
Implements: java.util.Comparator

Methods:
- DoubleComparator comparingDouble(Double2DoubleFunction)
- int compare(double, double)
- int compare(Double, Double)
- int compare(Object, Object)
- DoubleComparator comparingLong(Double2LongFunction)
- DoubleComparator thenComparing(DoubleComparator)
- Comparator thenComparing(Comparator)
- DoubleComparator comparingInt(Double2IntFunction)
- DoubleComparator comparing(Double2ObjectFunction)
- DoubleComparator comparing(Double2ObjectFunction, Comparator)
- DoubleComparator reversed()
- Comparator reversed()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleConsumer
Type: Interface
Implements: java.util.function.Consumer, java.util.function.DoubleConsumer

Methods:
- DoubleConsumer andThen(DoubleConsumer)
- DoubleConsumer andThen(DoubleConsumer)
- Consumer andThen(Consumer)
- DoubleConsumer andThen(DoubleConsumer)
- void accept(Double)
- void accept(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleIterable
Type: Interface
Implements: java.lang.Iterable

Methods:
- DoubleIterator iterator()
- Iterator iterator()
- DoubleSpliterator spliterator()
- Spliterator spliterator()
- void forEach(DoubleConsumer)
- void forEach(DoubleConsumer)
- void forEach(Consumer)
- DoubleSpliterator doubleSpliterator()
- DoubleIterator doubleIterator()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleIterator
Type: Interface
Implements: java.util.PrimitiveIterator$OfDouble

Methods:
- Double next()
- Object next()
- int skip(int)
- void forEachRemaining(DoubleConsumer)
- void forEachRemaining(Consumer)
- double nextDouble()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleList
Type: Interface
Implements: java.util.List, java.lang.Comparable, com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleCollection

Methods:
- boolean add(double)
- void add(int, double)
- void add(int, Double)
- boolean add(Double)
- void add(int, Object)
- boolean add(Object)
- DoubleList subList(int, int)
- List subList(int, int)
- double set(int, double)
- Double set(int, Double)
- Object set(int, Object)
- DoubleSpliterator spliterator()
- Spliterator spliterator()
- double getDouble(int)
- void setElements(double[])
- void setElements(int, double[])
- void setElements(int, double[], int, int)
- void sort(Comparator)
- void sort(DoubleComparator)
- void removeElements(int, int)
- void replaceAll(DoubleUnaryOperator)
- void replaceAll(DoubleUnaryOperator)
- void replaceAll(UnaryOperator)
- boolean remove(Object)
- Double remove(int)
- Object remove(int)
- int lastIndexOf(double)
- int lastIndexOf(Object)
- boolean contains(Object)
- DoubleListIterator iterator()
- Iterator iterator()
- DoubleIterator iterator()
- void size(int)
- boolean addAll(int, DoubleCollection)
- boolean addAll(int, DoubleList)
- boolean addAll(DoubleList)
- double removeDouble(int)
- void addElements(int, double[])
- void addElements(int, double[], int, int)
- DoubleList of()
- DoubleList of(double)
- DoubleList of(double, double)
- DoubleList of(double, double, double)
- DoubleList of(double[])
- Double get(int)
- Object get(int)
- void getElements(int, double[], int, int)
- DoubleListIterator listIterator()
- DoubleListIterator listIterator(int)
- ListIterator listIterator(int)
- ListIterator listIterator()
- int indexOf(double)
- int indexOf(Object)
- void unstableSort(Comparator)
- void unstableSort(DoubleComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleListIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleBidirectionalIterator, java.util.ListIterator

Methods:
- Double next()
- Object next()
- void add(double)
- void add(Double)
- void add(Object)
- void set(double)
- void set(Double)
- void set(Object)
- Double previous()
- Object previous()
- void remove()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleObjectPair
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Pair

Methods:
- Double left()
- DoubleObjectPair left(double)
- DoubleObjectPair left(Double)
- Pair left(Object)
- Object left()
- DoubleObjectPair of(double, Object)
- double leftDouble()
- Comparator lexComparator()
- Double key()
- DoubleObjectPair key(double)
- DoubleObjectPair key(Double)
- Object key()
- Pair key(Object)
- Double first()
- DoubleObjectPair first(double)
- DoubleObjectPair first(Double)
- Pair first(Object)
- Object first()
- double keyDouble()
- double firstDouble()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoublePredicate
Type: Interface
Implements: java.util.function.Predicate, java.util.function.DoublePredicate

Methods:
- DoublePredicate or(DoublePredicate)
- DoublePredicate or(DoublePredicate)
- Predicate or(Predicate)
- DoublePredicate or(DoublePredicate)
- boolean test(Double)
- boolean test(Object)
- DoublePredicate negate()
- Predicate negate()
- DoublePredicate negate()
- DoublePredicate and(DoublePredicate)
- DoublePredicate and(DoublePredicate)
- Predicate and(Predicate)
- DoublePredicate and(DoublePredicate)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleSet
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleCollection, java.util.Set

Methods:
- boolean add(Double)
- boolean add(Object)
- boolean contains(Object)
- DoubleIterator iterator()
- Iterator iterator()
- DoubleSpliterator spliterator()
- Spliterator spliterator()
- DoubleSet of()
- DoubleSet of(double)
- DoubleSet of(double, double)
- DoubleSet of(double, double, double)
- DoubleSet of(double[])
- boolean rem(double)
- boolean remove(double)
- boolean remove(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleSortedSet
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleSet, java.util.SortedSet, com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleBidirectionalIterable

Methods:
- DoubleSortedSet tailSet(double)
- DoubleSortedSet tailSet(Double)
- SortedSet tailSet(Object)
- DoubleComparator comparator()
- Comparator comparator()
- DoubleBidirectionalIterator iterator(double)
- DoubleBidirectionalIterator iterator()
- DoubleIterator iterator()
- Iterator iterator()
- Double last()
- Object last()
- DoubleSortedSet headSet(double)
- DoubleSortedSet headSet(Double)
- SortedSet headSet(Object)
- DoubleSpliterator spliterator()
- Spliterator spliterator()
- double lastDouble()
- DoubleSortedSet subSet(double, double)
- DoubleSortedSet subSet(Double, Double)
- SortedSet subSet(Object, Object)
- Double first()
- Object first()
- double firstDouble()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleSpliterator
Type: Interface
Implements: java.util.Spliterator$OfDouble

Methods:
- DoubleSpliterator trySplit()
- Spliterator$OfDouble trySplit()
- Spliterator$OfPrimitive trySplit()
- Spliterator trySplit()
- boolean tryAdvance(Consumer)
- boolean tryAdvance(DoubleConsumer)
- DoubleComparator getComparator()
- Comparator getComparator()
- long skip(long)
- void forEachRemaining(Consumer)
- void forEachRemaining(DoubleConsumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleStack
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Stack

Methods:
- Double pop()
- Object pop()
- double peekDouble(int)
- Double top()
- Object top()
- double popDouble()
- double topDouble()
- void push(double)
- void push(Double)
- void push(Object)
- Double peek(int)
- Object peek(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleUnaryOperator
Type: Interface
Implements: java.util.function.UnaryOperator, java.util.function.DoubleUnaryOperator

Methods:
- DoubleUnaryOperator negation()
- double applyAsDouble(double)
- double apply(double)
- Double apply(Double)
- Object apply(Object)
- DoubleUnaryOperator identity()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDouble2ObjectFunction
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectFunction, java.io.Serializable

Methods:
- void defaultReturnValue(Object)
- Object defaultReturnValue()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDouble2ObjectMap
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDouble2ObjectFunction
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectMap, java.io.Serializable

Methods:
- int hashCode()
- boolean containsKey(double)
- boolean equals(Object)
- void putAll(Map)
- ObjectCollection values()
- Collection values()
- boolean isEmpty()
- String toString()
- DoubleSet keySet()
- Set keySet()
- boolean containsValue(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDouble2ObjectSortedMap
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDouble2ObjectMap
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectSortedMap

Methods:
- ObjectCollection values()
- Collection values()
- DoubleSortedSet keySet()
- DoubleSet keySet()
- Set keySet()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleCollection
Type: Abstract Class
Extends: java.util.AbstractCollection
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleCollection

Methods:
- boolean add(double)
- boolean add(Double)
- boolean add(Object)
- void forEach(DoubleConsumer)
- boolean containsAll(DoubleCollection)
- boolean containsAll(Collection)
- boolean remove(Object)
- boolean removeIf(DoublePredicate)
- boolean removeAll(DoubleCollection)
- boolean removeAll(Collection)
- boolean contains(double)
- boolean contains(Object)
- DoubleIterator iterator()
- Iterator iterator()
- boolean addAll(DoubleCollection)
- boolean addAll(Collection)
- double[] toDoubleArray()
- double[] toDoubleArray(double[])
- double[] toArray(double[])
- String toString()
- boolean rem(double)
- boolean retainAll(DoubleCollection)
- boolean retainAll(Collection)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleIterator
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleIterator

Methods:
- void forEachRemaining(DoubleConsumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleList
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleCollection
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleList, com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleStack

Methods:
- double peekDouble(int)
- int compareTo(List)
- int compareTo(Object)
- void replaceAll(DoubleUnaryOperator)
- DoubleListIterator iterator()
- DoubleIterator iterator()
- Iterator iterator()
- int hashCode()
- void addElements(int, double[], int, int)
- void addElements(int, double[])
- double[] toArray(double[])
- boolean rem(double)
- int indexOf(double)
- void add(int, double)
- boolean add(double)
- DoubleList subList(int, int)
- List subList(int, int)
- double set(int, double)
- void forEach(DoubleConsumer)
- void clear()
- void setElements(int, double[], int, int)
- double popDouble()
- void removeElements(int, int)
- void push(double)
- int lastIndexOf(double)
- boolean contains(double)
- void size(int)
- boolean addAll(int, Collection)
- boolean addAll(Collection)
- boolean addAll(int, DoubleCollection)
- boolean addAll(DoubleCollection)
- double[] toDoubleArray()
- double removeDouble(int)
- boolean equals(Object)
- void getElements(int, double[], int, int)
- DoubleListIterator listIterator()
- DoubleListIterator listIterator(int)
- ListIterator listIterator(int)
- ListIterator listIterator()
- String toString()
- double topDouble()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleSet
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleCollection
Implements: java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleSet

Methods:
- DoubleIterator iterator()
- Iterator iterator()
- int hashCode()
- boolean equals(Object)
- boolean rem(double)
- boolean remove(double)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleSortedSet
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleSet
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleSortedSet

Methods:
- DoubleBidirectionalIterator iterator()
- DoubleIterator iterator()
- Iterator iterator()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleSpliterator
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleSpliterator

Methods:
- boolean tryAdvance(DoubleConsumer)
- void forEachRemaining(DoubleConsumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectFunctions
Type: Class

Methods:
- Double2ObjectFunction singleton(double, Object)
- Double2ObjectFunction singleton(Double, Object)
- Double2ObjectFunction unmodifiable(Double2ObjectFunction)
- Double2ObjectFunction primitive(Function)
- Double2ObjectFunction synchronize(Double2ObjectFunction)
- Double2ObjectFunction synchronize(Double2ObjectFunction, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectLinkedOpenHashMap
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDouble2ObjectSortedMap
Implements: java.io.Serializable, java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.Hash

Methods:
- Object getOrDefault(double, Object)
- ObjectCollection values()
- Collection values()
- Object computeIfAbsent(double, DoubleFunction)
- Object computeIfAbsent(double, Double2ObjectFunction)
- boolean replace(double, Object, Object)
- Object replace(double, Object)
- Object putAndMoveToLast(double, Object)
- Object getAndMoveToLast(double)
- Object removeLast()
- boolean containsValue(Object)
- Object remove(double)
- boolean remove(double, Object)
- Object put(double, Object)
- Object compute(double, BiFunction)
- Object putAndMoveToFirst(double, Object)
- boolean trim()
- boolean trim(int)
- Object getAndMoveToFirst(double)
- int hashCode()
- Object merge(double, Object, BiFunction)
- Object get(double)
- Object removeFirst()
- void putAll(Map)
- DoubleSortedSet keySet()
- DoubleSet keySet()
- Set keySet()
- double firstDoubleKey()
- Double2ObjectSortedMap$FastSortedEntrySet double2ObjectEntrySet()
- ObjectSortedSet double2ObjectEntrySet()
- ObjectSet double2ObjectEntrySet()
- double lastDoubleKey()
- boolean containsKey(double)
- Double2ObjectSortedMap subMap(double, double)
- boolean isEmpty()
- void clear()
- DoubleComparator comparator()
- Comparator comparator()
- Object computeIfPresent(double, BiFunction)
- int size()
- Double2ObjectLinkedOpenHashMap clone()
- Object clone() throws CloneNotSupportedException
- Double2ObjectSortedMap headMap(double)
- void ensureCapacity(int)
- Object putIfAbsent(double, Object)
- Double2ObjectSortedMap tailMap(double)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectMaps
Type: Class

Methods:
- Double2ObjectMap singleton(double, Object)
- Double2ObjectMap singleton(Double, Object)
- void fastForEach(Double2ObjectMap, Consumer)
- Double2ObjectMap unmodifiable(Double2ObjectMap)
- Double2ObjectMap emptyMap()
- ObjectIterable fastIterable(Double2ObjectMap)
- ObjectIterator fastIterator(Double2ObjectMap)
- Double2ObjectMap synchronize(Double2ObjectMap)
- Double2ObjectMap synchronize(Double2ObjectMap, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.Double2ObjectSortedMaps
Type: Class

Methods:
- Double2ObjectSortedMap singleton(Double, Object)
- Double2ObjectSortedMap singleton(Double, Object, DoubleComparator)
- Double2ObjectSortedMap singleton(double, Object)
- Double2ObjectSortedMap singleton(double, Object, DoubleComparator)
- Comparator entryComparator(DoubleComparator)
- Double2ObjectSortedMap unmodifiable(Double2ObjectSortedMap)
- Double2ObjectSortedMap emptyMap()
- ObjectBidirectionalIterable fastIterable(Double2ObjectSortedMap)
- ObjectBidirectionalIterator fastIterator(Double2ObjectSortedMap)
- Double2ObjectSortedMap synchronize(Double2ObjectSortedMap)
- Double2ObjectSortedMap synchronize(Double2ObjectSortedMap, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleArrayList
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleList
Implements: java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable

Methods:
- double getDouble(int)
- int compareTo(DoubleArrayList)
- int compareTo(List)
- int compareTo(Object)
- DoubleArrayList toList(DoubleStream)
- boolean removeAll(DoubleCollection)
- void trim()
- void trim(int)
- void addElements(int, double[], int, int)
- DoubleArrayList of()
- DoubleArrayList of(double[])
- double[] toArray(double[])
- boolean rem(double)
- DoubleArrayList toListWithExpectedSize(DoubleStream, int)
- int indexOf(double)
- void add(int, double)
- boolean add(double)
- DoubleList subList(int, int)
- List subList(int, int)
- double set(int, double)
- DoubleSpliterator spliterator()
- Spliterator spliterator()
- void forEach(DoubleConsumer)
- boolean isEmpty()
- void clear()
- void setElements(int, double[], int, int)
- void sort(DoubleComparator)
- void removeElements(int, int)
- boolean removeIf(DoublePredicate)
- int lastIndexOf(double)
- int size()
- void size(int)
- boolean addAll(int, DoubleCollection)
- boolean addAll(int, DoubleList)
- double removeDouble(int)
- boolean equals(DoubleArrayList)
- boolean equals(Object)
- void getElements(int, double[], int, int)
- double[] elements()
- DoubleArrayList clone()
- Object clone() throws CloneNotSupportedException
- DoubleListIterator listIterator(int)
- ListIterator listIterator(int)
- void ensureCapacity(int)
- DoubleArrayList wrap(double[], int)
- DoubleArrayList wrap(double[])
- void unstableSort(DoubleComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleArraySet
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleSet
Implements: java.io.Serializable, java.lang.Cloneable

Methods:
- boolean add(double)
- DoubleSpliterator spliterator()
- Spliterator spliterator()
- boolean isEmpty()
- void clear()
- boolean remove(double)
- boolean contains(double)
- DoubleIterator iterator()
- Iterator iterator()
- DoubleArraySet ofUnchecked()
- DoubleArraySet ofUnchecked(double[])
- int size()
- double[] toDoubleArray()
- DoubleArraySet of()
- DoubleArraySet of(double)
- DoubleArraySet of(double[])
- DoubleArraySet clone()
- Object clone() throws CloneNotSupportedException
- double[] toArray(double[])

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleArrays
Type: Class

Methods:
- int binarySearch(double[], int, int, double)
- int binarySearch(double[], double)
- int binarySearch(double[], int, int, double, DoubleComparator)
- int binarySearch(double[], double, DoubleComparator)
- void ensureFromTo(double[], int, int)
- void mergeSort(double[], int, int, double[])
- void mergeSort(double[], int, int)
- void mergeSort(double[])
- void mergeSort(double[], int, int, DoubleComparator, double[])
- void mergeSort(double[], int, int, DoubleComparator)
- void mergeSort(double[], DoubleComparator)
- double[] forceCapacity(double[], int, int)
- void radixSortIndirect(int[], double[], boolean)
- void radixSortIndirect(int[], double[], int, int, boolean)
- void radixSortIndirect(int[], double[], double[], boolean)
- void radixSortIndirect(int[], double[], double[], int, int, boolean)
- void stableSort(double[], int, int)
- void stableSort(double[])
- void stableSort(double[], int, int, DoubleComparator)
- void stableSort(double[], DoubleComparator)
- double[] trim(double[], int)
- void parallelQuickSort(double[], int, int, DoubleComparator)
- void parallelQuickSort(double[], DoubleComparator)
- void parallelQuickSort(double[], int, int)
- void parallelQuickSort(double[])
- void parallelQuickSort(double[], double[], int, int)
- void parallelQuickSort(double[], double[])
- double[] copy(double[], int, int)
- double[] copy(double[])
- void ensureSameLength(double[], double[])
- double[] grow(double[], int)
- double[] grow(double[], int, int)
- void parallelRadixSort(double[], int, int)
- void parallelRadixSort(double[])
- void parallelRadixSort(double[], double[], int, int)
- void parallelRadixSort(double[], double[])
- void swap(double[], int, int)
- void swap(double[], int, int, int)
- void parallelQuickSortIndirect(int[], double[], int, int)
- void parallelQuickSortIndirect(int[], double[])
- void ensureOffsetLength(double[], int, int)
- void radixSort(double[])
- void radixSort(double[], int, int)
- void radixSort(double[], double[])
- void radixSort(double[], double[], int, int)
- void radixSort(double[][])
- void radixSort(double[][], int, int)
- double[] reverse(double[])
- double[] reverse(double[], int, int)
- void quickSort(double[], int, int, DoubleComparator)
- void quickSort(double[], DoubleComparator)
- void quickSort(double[], int, int)
- void quickSort(double[])
- void quickSort(double[], double[], int, int)
- void quickSort(double[], double[])
- void fill(double[], double)
- void fill(double[], int, int, double)
- double[] setLength(double[], int)
- void quickSortIndirect(int[], double[], int, int)
- void quickSortIndirect(int[], double[])
- boolean equals(double[], double[])
- void stabilize(int[], double[], int, int)
- void stabilize(int[], double[])
- void parallelRadixSortIndirect(int[], double[], int, int, boolean)
- void parallelRadixSortIndirect(int[], double[], boolean)
- double[] ensureCapacity(double[], int)
- double[] ensureCapacity(double[], int, int)
- double[] shuffle(double[], int, int, Random)
- double[] shuffle(double[], Random)
- void unstableSort(double[], int, int)
- void unstableSort(double[])
- void unstableSort(double[], int, int, DoubleComparator)
- void unstableSort(double[], DoubleComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleBigArrays
Type: Class

Methods:
- void mul(double[][], long, double)
- long binarySearch(double[][], long, long, double)
- long binarySearch(double[][], double)
- long binarySearch(double[][], long, long, double, DoubleComparator)
- long binarySearch(double[][], double, DoubleComparator)
- void ensureFromTo(double[][], long, long)
- double[][] forceCapacity(double[][], long, long)
- void radixSortIndirect(long[][], double[][], double[][], boolean)
- void radixSortIndirect(long[][], double[][], double[][], long, long, boolean)
- double[][] trim(double[][], long)
- double get(double[][], long)
- void parallelQuickSort(double[][], long, long)
- void parallelQuickSort(double[][])
- void parallelQuickSort(double[][], long, long, DoubleComparator)
- void parallelQuickSort(double[][], DoubleComparator)
- void copy(double[][], long, double[][], long, long)
- double[][] copy(double[][], long, long)
- double[][] copy(double[][])
- void ensureSameLength(double[][], double[][])
- void decr(double[][], long)
- void add(double[][], long, double)
- double[][] grow(double[][], long)
- double[][] grow(double[][], long, long)
- void set(double[][], long, double)
- void incr(double[][], long)
- void swap(double[][], long, long)
- long length(double[][])
- void ensureOffsetLength(double[][], long, long)
- void radixSort(double[][])
- void radixSort(double[][], long, long)
- void radixSort(double[][], double[][])
- void radixSort(double[][], double[][], long, long)
- void quickSort(double[][], long, long, DoubleComparator)
- void quickSort(double[][], DoubleComparator)
- void quickSort(double[][], long, long)
- void quickSort(double[][])
- void fill(double[][], double)
- void fill(double[][], long, long, double)
- double[][] newBigArray(long)
- void copyToBig(double[], int, double[][], long, long)
- double[][] setLength(double[][], long)
- void copyFromBig(double[][], long, double[], int, int)
- boolean equals(double[][], double[][])
- String toString(double[][])
- double[][] ensureCapacity(double[][], long)
- double[][] ensureCapacity(double[][], long, long)
- double[][] shuffle(double[][], long, long, Random)
- double[][] shuffle(double[][], Random)
- double[][] wrap(double[])

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleCollections
Type: Class

Methods:
- DoubleCollection asCollection(DoubleIterable)
- DoubleCollection unmodifiable(DoubleCollection)
- DoubleCollection synchronize(DoubleCollection)
- DoubleCollection synchronize(DoubleCollection, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleComparators
Type: Class

Methods:
- DoubleComparator oppositeComparator(DoubleComparator)
- DoubleComparator asDoubleComparator(Comparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleImmutableList
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleLists$ImmutableListBase
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleList, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable

Methods:
- DoubleList subList(int, int)
- List subList(int, int)
- DoubleSpliterator spliterator()
- Spliterator spliterator()
- void forEach(DoubleConsumer)
- boolean isEmpty()
- double getDouble(int)
- int compareTo(DoubleImmutableList)
- int compareTo(List)
- int compareTo(Object)
- DoubleImmutableList toList(DoubleStream)
- int lastIndexOf(double)
- int size()
- double[] toDoubleArray()
- boolean equals(DoubleImmutableList)
- boolean equals(Object)
- void getElements(int, double[], int, int)
- DoubleImmutableList of()
- DoubleImmutableList of(double[])
- DoubleImmutableList clone()
- Object clone() throws CloneNotSupportedException
- double[] toArray(double[])
- DoubleListIterator listIterator(int)
- ListIterator listIterator(int)
- DoubleImmutableList toListWithExpectedSize(DoubleStream, int)
- int indexOf(double)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleIterators
Type: Class

Methods:
- boolean all(DoubleIterator, DoublePredicate)
- DoubleListIterator singleton(double)
- DoubleIterator unmodifiable(DoubleIterator)
- DoubleBidirectionalIterator unmodifiable(DoubleBidirectionalIterator)
- DoubleListIterator unmodifiable(DoubleListIterator)
- int pour(DoubleIterator, DoubleCollection, int)
- int pour(DoubleIterator, DoubleCollection)
- DoubleList pour(DoubleIterator, int)
- DoubleList pour(DoubleIterator)
- DoubleIterator concat(DoubleIterator[])
- DoubleIterator concat(DoubleIterator[], int, int)
- int indexOf(DoubleIterator, DoublePredicate)
- boolean any(DoubleIterator, DoublePredicate)
- double[][] unwrapBig(DoubleIterator, long)
- double[][] unwrapBig(DoubleIterator)
- DoubleListIterator wrap(double[], int, int)
- DoubleListIterator wrap(double[])
- DoubleIterator wrap(ByteIterator)
- DoubleIterator wrap(ShortIterator)
- DoubleIterator wrap(CharIterator)
- DoubleIterator wrap(IntIterator)
- DoubleIterator wrap(FloatIterator)
- DoubleIterator asDoubleIterator(Iterator)
- DoubleListIterator asDoubleIterator(ListIterator)
- int unwrap(DoubleIterator, double[], int, int)
- int unwrap(DoubleIterator, double[])
- double[] unwrap(DoubleIterator, int)
- double[] unwrap(DoubleIterator)
- long unwrap(DoubleIterator, double[][], long, long)
- long unwrap(DoubleIterator, double[][])
- int unwrap(DoubleIterator, DoubleCollection, int)
- long unwrap(DoubleIterator, DoubleCollection)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleLists
Type: Class

Methods:
- DoubleList singleton(double)
- DoubleList singleton(Object)
- DoubleList emptyList()
- DoubleList unmodifiable(DoubleList)
- DoubleList shuffle(DoubleList, Random)
- DoubleList synchronize(DoubleList)
- DoubleList synchronize(DoubleList, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleObjectImmutablePair
Type: Class
Implements: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleObjectPair, java.io.Serializable

Methods:
- int hashCode()
- boolean equals(Object)
- DoubleObjectImmutablePair of(double, Object)
- String toString()
- double leftDouble()
- Object right()

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleOpenHashSet
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.doubles.AbstractDoubleSet
Implements: java.io.Serializable, java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.Hash

Methods:
- boolean add(double)
- DoubleSpliterator spliterator()
- Spliterator spliterator()
- void forEach(DoubleConsumer)
- boolean isEmpty()
- void clear()
- DoubleOpenHashSet toSetWithExpectedSize(DoubleStream, int)
- boolean remove(double)
- DoubleOpenHashSet toSet(DoubleStream)
- DoubleIterator iterator()
- Iterator iterator()
- boolean contains(double)
- boolean trim()
- boolean trim(int)
- int size()
- boolean addAll(DoubleCollection)
- boolean addAll(Collection)
- int hashCode()
- DoubleOpenHashSet of()
- DoubleOpenHashSet of(double)
- DoubleOpenHashSet of(double, double)
- DoubleOpenHashSet of(double, double, double)
- DoubleOpenHashSet of(double[])
- DoubleOpenHashSet clone()
- Object clone() throws CloneNotSupportedException
- void ensureCapacity(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleSets
Type: Class

Methods:
- DoubleSet singleton(double)
- DoubleSet singleton(Double)
- DoubleSet emptySet()
- DoubleSet unmodifiable(DoubleSet)
- DoubleSet synchronize(DoubleSet)
- DoubleSet synchronize(DoubleSet, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleSortedSets
Type: Class

Methods:
- DoubleSortedSet singleton(double)
- DoubleSortedSet singleton(double, DoubleComparator)
- DoubleSortedSet singleton(Object)
- DoubleSortedSet singleton(Object, DoubleComparator)
- DoubleSortedSet unmodifiable(DoubleSortedSet)
- DoubleSortedSet synchronize(DoubleSortedSet)
- DoubleSortedSet synchronize(DoubleSortedSet, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.doubles.DoubleSpliterators
Type: Class

Methods:
- DoubleSpliterator asSpliteratorFromSortedUnknownSize(DoubleIterator, int, DoubleComparator)
- DoubleSpliterator singleton(double)
- DoubleSpliterator singleton(double, DoubleComparator)
- DoubleSpliterator asSpliteratorUnknownSize(DoubleIterator, int)
- DoubleSpliterator asSpliteratorFromSorted(DoubleIterator, long, int, DoubleComparator)
- DoubleIterator asIterator(DoubleSpliterator)
- DoubleSpliterator wrapPreSorted(double[], int, int, int, DoubleComparator)
- DoubleSpliterator wrapPreSorted(double[], int, int, DoubleComparator)
- DoubleSpliterator wrapPreSorted(double[], DoubleComparator)
- DoubleSpliterator asDoubleSpliterator(Spliterator)
- DoubleSpliterator asDoubleSpliterator(Spliterator, DoubleComparator)
- DoubleSpliterator concat(DoubleSpliterator[])
- DoubleSpliterator concat(DoubleSpliterator[], int, int)
- void onEachMatching(DoubleSpliterator, DoublePredicate, DoubleConsumer)
- DoubleSpliterator wrap(double[], int, int)
- DoubleSpliterator wrap(double[])
- DoubleSpliterator wrap(double[], int, int, int)
- DoubleSpliterator wrap(ByteSpliterator)
- DoubleSpliterator wrap(ShortSpliterator)
- DoubleSpliterator wrap(CharSpliterator)
- DoubleSpliterator wrap(IntSpliterator)
- DoubleSpliterator wrap(FloatSpliterator)
- DoubleSpliterator asSpliterator(DoubleIterator, long, int)

## Package: com.sk89q.worldedit.bukkit.fastutil.floats

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.Float2BooleanFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoublePredicate

Methods:
- boolean getOrDefault(float, boolean)
- Boolean getOrDefault(Object, Boolean)
- Object getOrDefault(Object, Object)
- Float2ShortFunction andThenShort(Boolean2ShortFunction)
- Byte2BooleanFunction composeByte(Byte2FloatFunction)
- Float2IntFunction andThenInt(Boolean2IntFunction)
- Reference2BooleanFunction composeReference(Reference2FloatFunction)
- Function andThen(Function)
- boolean remove(float)
- Boolean remove(Object)
- Object remove(Object)
- boolean put(float, boolean)
- Boolean put(Float, Boolean)
- Object put(Object, Object)
- void defaultReturnValue(boolean)
- boolean defaultReturnValue()
- Float2DoubleFunction andThenDouble(Boolean2DoubleFunction)
- Float2ObjectFunction andThenObject(Boolean2ObjectFunction)
- boolean get(float)
- Boolean get(Object)
- Object get(Object)
- Float2LongFunction andThenLong(Boolean2LongFunction)
- Long2BooleanFunction composeLong(Long2FloatFunction)
- Float2ByteFunction andThenByte(Boolean2ByteFunction)
- Float2FloatFunction andThenFloat(Boolean2FloatFunction)
- boolean test(double)
- boolean containsKey(float)
- boolean containsKey(Object)
- Int2BooleanFunction composeInt(Int2FloatFunction)
- Float2BooleanFunction composeFloat(Float2FloatFunction)
- Float2CharFunction andThenChar(Boolean2CharFunction)
- Object2BooleanFunction composeObject(Object2FloatFunction)
- Function compose(Function)
- Short2BooleanFunction composeShort(Short2FloatFunction)
- Float2ReferenceFunction andThenReference(Boolean2ReferenceFunction)
- Char2BooleanFunction composeChar(Char2FloatFunction)
- Double2BooleanFunction composeDouble(Double2FloatFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.Float2ByteFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleToIntFunction

Methods:
- byte getOrDefault(float, byte)
- Byte getOrDefault(Object, Byte)
- Object getOrDefault(Object, Object)
- Float2ShortFunction andThenShort(Byte2ShortFunction)
- Byte2ByteFunction composeByte(Byte2FloatFunction)
- Float2IntFunction andThenInt(Byte2IntFunction)
- Reference2ByteFunction composeReference(Reference2FloatFunction)
- Function andThen(Function)
- byte remove(float)
- Byte remove(Object)
- Object remove(Object)
- byte put(float, byte)
- Byte put(Float, Byte)
- Object put(Object, Object)
- void defaultReturnValue(byte)
- byte defaultReturnValue()
- Float2DoubleFunction andThenDouble(Byte2DoubleFunction)
- Float2ObjectFunction andThenObject(Byte2ObjectFunction)
- byte get(float)
- Byte get(Object)
- Object get(Object)
- Float2LongFunction andThenLong(Byte2LongFunction)
- Long2ByteFunction composeLong(Long2FloatFunction)
- Float2ByteFunction andThenByte(Byte2ByteFunction)
- Float2FloatFunction andThenFloat(Byte2FloatFunction)
- int applyAsInt(double)
- boolean containsKey(float)
- boolean containsKey(Object)
- Int2ByteFunction composeInt(Int2FloatFunction)
- Float2ByteFunction composeFloat(Float2FloatFunction)
- Float2CharFunction andThenChar(Byte2CharFunction)
- Object2ByteFunction composeObject(Object2FloatFunction)
- Function compose(Function)
- Short2ByteFunction composeShort(Short2FloatFunction)
- Float2ReferenceFunction andThenReference(Byte2ReferenceFunction)
- Char2ByteFunction composeChar(Char2FloatFunction)
- Double2ByteFunction composeDouble(Double2FloatFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.Float2CharFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleToIntFunction

Methods:
- char getOrDefault(float, char)
- Character getOrDefault(Object, Character)
- Object getOrDefault(Object, Object)
- Float2ShortFunction andThenShort(Char2ShortFunction)
- Byte2CharFunction composeByte(Byte2FloatFunction)
- Float2IntFunction andThenInt(Char2IntFunction)
- Reference2CharFunction composeReference(Reference2FloatFunction)
- Function andThen(Function)
- char remove(float)
- Character remove(Object)
- Object remove(Object)
- char put(float, char)
- Character put(Float, Character)
- Object put(Object, Object)
- void defaultReturnValue(char)
- char defaultReturnValue()
- Float2DoubleFunction andThenDouble(Char2DoubleFunction)
- Float2ObjectFunction andThenObject(Char2ObjectFunction)
- char get(float)
- Character get(Object)
- Object get(Object)
- Float2LongFunction andThenLong(Char2LongFunction)
- Long2CharFunction composeLong(Long2FloatFunction)
- Float2ByteFunction andThenByte(Char2ByteFunction)
- Float2FloatFunction andThenFloat(Char2FloatFunction)
- int applyAsInt(double)
- boolean containsKey(float)
- boolean containsKey(Object)
- Int2CharFunction composeInt(Int2FloatFunction)
- Float2CharFunction composeFloat(Float2FloatFunction)
- Float2CharFunction andThenChar(Char2CharFunction)
- Object2CharFunction composeObject(Object2FloatFunction)
- Function compose(Function)
- Short2CharFunction composeShort(Short2FloatFunction)
- Float2ReferenceFunction andThenReference(Char2ReferenceFunction)
- Char2CharFunction composeChar(Char2FloatFunction)
- Double2CharFunction composeDouble(Double2FloatFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.Float2DoubleFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleUnaryOperator

Methods:
- double getOrDefault(float, double)
- Double getOrDefault(Object, Double)
- Object getOrDefault(Object, Object)
- double applyAsDouble(double)
- Float2ShortFunction andThenShort(Double2ShortFunction)
- Byte2DoubleFunction composeByte(Byte2FloatFunction)
- Float2IntFunction andThenInt(Double2IntFunction)
- Reference2DoubleFunction composeReference(Reference2FloatFunction)
- Function andThen(Function)
- double remove(float)
- Double remove(Object)
- Object remove(Object)
- double put(float, double)
- Double put(Float, Double)
- Object put(Object, Object)
- void defaultReturnValue(double)
- double defaultReturnValue()
- Float2DoubleFunction andThenDouble(Double2DoubleFunction)
- Float2ObjectFunction andThenObject(Double2ObjectFunction)
- double get(float)
- Double get(Object)
- Object get(Object)
- Float2LongFunction andThenLong(Double2LongFunction)
- Long2DoubleFunction composeLong(Long2FloatFunction)
- Float2ByteFunction andThenByte(Double2ByteFunction)
- Float2FloatFunction andThenFloat(Double2FloatFunction)
- boolean containsKey(float)
- boolean containsKey(Object)
- Int2DoubleFunction composeInt(Int2FloatFunction)
- Float2DoubleFunction composeFloat(Float2FloatFunction)
- Float2CharFunction andThenChar(Double2CharFunction)
- Object2DoubleFunction composeObject(Object2FloatFunction)
- Function compose(Function)
- Short2DoubleFunction composeShort(Short2FloatFunction)
- Float2ReferenceFunction andThenReference(Double2ReferenceFunction)
- Char2DoubleFunction composeChar(Char2FloatFunction)
- Double2DoubleFunction composeDouble(Double2FloatFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.Float2FloatFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleUnaryOperator

Methods:
- float getOrDefault(float, float)
- Float getOrDefault(Object, Float)
- Object getOrDefault(Object, Object)
- double applyAsDouble(double)
- Float2ShortFunction andThenShort(Float2ShortFunction)
- Byte2FloatFunction composeByte(Byte2FloatFunction)
- Float2IntFunction andThenInt(Float2IntFunction)
- Reference2FloatFunction composeReference(Reference2FloatFunction)
- Function andThen(Function)
- float remove(float)
- Float remove(Object)
- Object remove(Object)
- float put(float, float)
- Float put(Float, Float)
- Object put(Object, Object)
- void defaultReturnValue(float)
- float defaultReturnValue()
- Float2DoubleFunction andThenDouble(Float2DoubleFunction)
- Float2ObjectFunction andThenObject(Float2ObjectFunction)
- Float2FloatFunction identity()
- float get(float)
- Float get(Object)
- Object get(Object)
- Float2LongFunction andThenLong(Float2LongFunction)
- Long2FloatFunction composeLong(Long2FloatFunction)
- Float2ByteFunction andThenByte(Float2ByteFunction)
- Float2FloatFunction andThenFloat(Float2FloatFunction)
- boolean containsKey(float)
- boolean containsKey(Object)
- Int2FloatFunction composeInt(Int2FloatFunction)
- Float2FloatFunction composeFloat(Float2FloatFunction)
- Float2CharFunction andThenChar(Float2CharFunction)
- Object2FloatFunction composeObject(Object2FloatFunction)
- Function compose(Function)
- Short2FloatFunction composeShort(Short2FloatFunction)
- Float2ReferenceFunction andThenReference(Float2ReferenceFunction)
- Char2FloatFunction composeChar(Char2FloatFunction)
- Double2FloatFunction composeDouble(Double2FloatFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.Float2IntFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleToIntFunction

Methods:
- int getOrDefault(float, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- Float2ShortFunction andThenShort(Int2ShortFunction)
- Byte2IntFunction composeByte(Byte2FloatFunction)
- Float2IntFunction andThenInt(Int2IntFunction)
- Reference2IntFunction composeReference(Reference2FloatFunction)
- Function andThen(Function)
- int remove(float)
- Integer remove(Object)
- Object remove(Object)
- int put(float, int)
- Integer put(Float, Integer)
- Object put(Object, Object)
- void defaultReturnValue(int)
- int defaultReturnValue()
- Float2DoubleFunction andThenDouble(Int2DoubleFunction)
- Float2ObjectFunction andThenObject(Int2ObjectFunction)
- int get(float)
- Integer get(Object)
- Object get(Object)
- Float2LongFunction andThenLong(Int2LongFunction)
- Long2IntFunction composeLong(Long2FloatFunction)
- Float2ByteFunction andThenByte(Int2ByteFunction)
- Float2FloatFunction andThenFloat(Int2FloatFunction)
- int applyAsInt(double)
- boolean containsKey(float)
- boolean containsKey(Object)
- Int2IntFunction composeInt(Int2FloatFunction)
- Float2IntFunction composeFloat(Float2FloatFunction)
- Float2CharFunction andThenChar(Int2CharFunction)
- Object2IntFunction composeObject(Object2FloatFunction)
- Function compose(Function)
- Short2IntFunction composeShort(Short2FloatFunction)
- Float2ReferenceFunction andThenReference(Int2ReferenceFunction)
- Char2IntFunction composeChar(Char2FloatFunction)
- Double2IntFunction composeDouble(Double2FloatFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.Float2LongFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleToLongFunction

Methods:
- long getOrDefault(float, long)
- Long getOrDefault(Object, Long)
- Object getOrDefault(Object, Object)
- Float2ShortFunction andThenShort(Long2ShortFunction)
- Byte2LongFunction composeByte(Byte2FloatFunction)
- Float2IntFunction andThenInt(Long2IntFunction)
- Reference2LongFunction composeReference(Reference2FloatFunction)
- Function andThen(Function)
- long remove(float)
- Long remove(Object)
- Object remove(Object)
- long put(float, long)
- Long put(Float, Long)
- Object put(Object, Object)
- void defaultReturnValue(long)
- long defaultReturnValue()
- Float2DoubleFunction andThenDouble(Long2DoubleFunction)
- Float2ObjectFunction andThenObject(Long2ObjectFunction)
- long get(float)
- Long get(Object)
- Object get(Object)
- Float2LongFunction andThenLong(Long2LongFunction)
- Long2LongFunction composeLong(Long2FloatFunction)
- Float2ByteFunction andThenByte(Long2ByteFunction)
- Float2FloatFunction andThenFloat(Long2FloatFunction)
- boolean containsKey(float)
- boolean containsKey(Object)
- Int2LongFunction composeInt(Int2FloatFunction)
- Float2LongFunction composeFloat(Float2FloatFunction)
- Float2CharFunction andThenChar(Long2CharFunction)
- long applyAsLong(double)
- Object2LongFunction composeObject(Object2FloatFunction)
- Function compose(Function)
- Short2LongFunction composeShort(Short2FloatFunction)
- Float2ReferenceFunction andThenReference(Long2ReferenceFunction)
- Char2LongFunction composeChar(Char2FloatFunction)
- Double2LongFunction composeDouble(Double2FloatFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.Float2ObjectFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleFunction

Methods:
- Object getOrDefault(float, Object)
- Object getOrDefault(Object, Object)
- Float2ShortFunction andThenShort(Object2ShortFunction)
- Byte2ObjectFunction composeByte(Byte2FloatFunction)
- Float2IntFunction andThenInt(Object2IntFunction)
- Reference2ObjectFunction composeReference(Reference2FloatFunction)
- Object remove(float)
- Object remove(Object)
- Object put(float, Object)
- Object put(Float, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Float2DoubleFunction andThenDouble(Object2DoubleFunction)
- Float2ObjectFunction andThenObject(Object2ObjectFunction)
- Object get(float)
- Object get(Object)
- Float2LongFunction andThenLong(Object2LongFunction)
- Long2ObjectFunction composeLong(Long2FloatFunction)
- Float2ByteFunction andThenByte(Object2ByteFunction)
- Float2FloatFunction andThenFloat(Object2FloatFunction)
- Object apply(double)
- boolean containsKey(float)
- boolean containsKey(Object)
- Int2ObjectFunction composeInt(Int2FloatFunction)
- Float2ObjectFunction composeFloat(Float2FloatFunction)
- Float2CharFunction andThenChar(Object2CharFunction)
- Object2ObjectFunction composeObject(Object2FloatFunction)
- Function compose(Function)
- Short2ObjectFunction composeShort(Short2FloatFunction)
- Float2ReferenceFunction andThenReference(Object2ReferenceFunction)
- Char2ObjectFunction composeChar(Char2FloatFunction)
- Double2ObjectFunction composeDouble(Double2FloatFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.Float2ReferenceFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleFunction

Methods:
- Object getOrDefault(float, Object)
- Object getOrDefault(Object, Object)
- Float2ShortFunction andThenShort(Reference2ShortFunction)
- Byte2ReferenceFunction composeByte(Byte2FloatFunction)
- Float2IntFunction andThenInt(Reference2IntFunction)
- Reference2ReferenceFunction composeReference(Reference2FloatFunction)
- Object remove(float)
- Object remove(Object)
- Object put(float, Object)
- Object put(Float, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Float2DoubleFunction andThenDouble(Reference2DoubleFunction)
- Float2ObjectFunction andThenObject(Reference2ObjectFunction)
- Object get(float)
- Object get(Object)
- Float2LongFunction andThenLong(Reference2LongFunction)
- Long2ReferenceFunction composeLong(Long2FloatFunction)
- Float2ByteFunction andThenByte(Reference2ByteFunction)
- Float2FloatFunction andThenFloat(Reference2FloatFunction)
- Object apply(double)
- boolean containsKey(float)
- boolean containsKey(Object)
- Int2ReferenceFunction composeInt(Int2FloatFunction)
- Float2ReferenceFunction composeFloat(Float2FloatFunction)
- Float2CharFunction andThenChar(Reference2CharFunction)
- Object2ReferenceFunction composeObject(Object2FloatFunction)
- Function compose(Function)
- Short2ReferenceFunction composeShort(Short2FloatFunction)
- Float2ReferenceFunction andThenReference(Reference2ReferenceFunction)
- Char2ReferenceFunction composeChar(Char2FloatFunction)
- Double2ReferenceFunction composeDouble(Double2FloatFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.Float2ShortFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.DoubleToIntFunction

Methods:
- short getOrDefault(float, short)
- Short getOrDefault(Object, Short)
- Object getOrDefault(Object, Object)
- Float2ShortFunction andThenShort(Short2ShortFunction)
- Byte2ShortFunction composeByte(Byte2FloatFunction)
- Float2IntFunction andThenInt(Short2IntFunction)
- Reference2ShortFunction composeReference(Reference2FloatFunction)
- Function andThen(Function)
- short remove(float)
- Short remove(Object)
- Object remove(Object)
- short put(float, short)
- Short put(Float, Short)
- Object put(Object, Object)
- void defaultReturnValue(short)
- short defaultReturnValue()
- Float2DoubleFunction andThenDouble(Short2DoubleFunction)
- Float2ObjectFunction andThenObject(Short2ObjectFunction)
- short get(float)
- Short get(Object)
- Object get(Object)
- Float2LongFunction andThenLong(Short2LongFunction)
- Long2ShortFunction composeLong(Long2FloatFunction)
- Float2ByteFunction andThenByte(Short2ByteFunction)
- Float2FloatFunction andThenFloat(Short2FloatFunction)
- int applyAsInt(double)
- boolean containsKey(float)
- boolean containsKey(Object)
- Int2ShortFunction composeInt(Int2FloatFunction)
- Float2ShortFunction composeFloat(Float2FloatFunction)
- Float2CharFunction andThenChar(Short2CharFunction)
- Object2ShortFunction composeObject(Object2FloatFunction)
- Function compose(Function)
- Short2ShortFunction composeShort(Short2FloatFunction)
- Float2ReferenceFunction andThenReference(Short2ReferenceFunction)
- Char2ShortFunction composeChar(Char2FloatFunction)
- Double2ShortFunction composeDouble(Double2FloatFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.FloatComparator
Type: Interface
Implements: java.util.Comparator

Methods:
- FloatComparator comparingDouble(Float2DoubleFunction)
- int compare(float, float)
- int compare(Float, Float)
- int compare(Object, Object)
- FloatComparator comparingLong(Float2LongFunction)
- FloatComparator thenComparing(FloatComparator)
- Comparator thenComparing(Comparator)
- FloatComparator comparingInt(Float2IntFunction)
- FloatComparator comparing(Float2ObjectFunction)
- FloatComparator comparing(Float2ObjectFunction, Comparator)
- FloatComparator reversed()
- Comparator reversed()

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.FloatConsumer
Type: Interface
Implements: java.util.function.Consumer, java.util.function.DoubleConsumer

Methods:
- FloatConsumer andThen(FloatConsumer)
- FloatConsumer andThen(DoubleConsumer)
- Consumer andThen(Consumer)
- DoubleConsumer andThen(DoubleConsumer)
- void accept(float)
- void accept(double)
- void accept(Float)
- void accept(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.FloatIterator
Type: Interface
Implements: java.util.PrimitiveIterator

Methods:
- Float next()
- Object next()
- float nextFloat()
- int skip(int)
- void forEachRemaining(FloatConsumer)
- void forEachRemaining(DoubleConsumer)
- void forEachRemaining(Consumer)
- void forEachRemaining(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.FloatSpliterator
Type: Interface
Implements: java.util.Spliterator$OfPrimitive

Methods:
- FloatSpliterator trySplit()
- Spliterator$OfPrimitive trySplit()
- Spliterator trySplit()
- boolean tryAdvance(Consumer)
- FloatComparator getComparator()
- Comparator getComparator()
- long skip(long)
- void forEachRemaining(Consumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.FloatArrays
Type: Class

Methods:
- int binarySearch(float[], int, int, float)
- int binarySearch(float[], float)
- int binarySearch(float[], int, int, float, FloatComparator)
- int binarySearch(float[], float, FloatComparator)
- void ensureFromTo(float[], int, int)
- void mergeSort(float[], int, int, float[])
- void mergeSort(float[], int, int)
- void mergeSort(float[])
- void mergeSort(float[], int, int, FloatComparator, float[])
- void mergeSort(float[], int, int, FloatComparator)
- void mergeSort(float[], FloatComparator)
- float[] forceCapacity(float[], int, int)
- void radixSortIndirect(int[], float[], boolean)
- void radixSortIndirect(int[], float[], int, int, boolean)
- void radixSortIndirect(int[], float[], float[], boolean)
- void radixSortIndirect(int[], float[], float[], int, int, boolean)
- void stableSort(float[], int, int)
- void stableSort(float[])
- void stableSort(float[], int, int, FloatComparator)
- void stableSort(float[], FloatComparator)
- float[] trim(float[], int)
- void parallelQuickSort(float[], int, int, FloatComparator)
- void parallelQuickSort(float[], FloatComparator)
- void parallelQuickSort(float[], int, int)
- void parallelQuickSort(float[])
- void parallelQuickSort(float[], float[], int, int)
- void parallelQuickSort(float[], float[])
- float[] copy(float[], int, int)
- float[] copy(float[])
- void ensureSameLength(float[], float[])
- float[] grow(float[], int)
- float[] grow(float[], int, int)
- void parallelRadixSort(float[], int, int)
- void parallelRadixSort(float[])
- void parallelRadixSort(float[], float[], int, int)
- void parallelRadixSort(float[], float[])
- void swap(float[], int, int)
- void swap(float[], int, int, int)
- void parallelQuickSortIndirect(int[], float[], int, int)
- void parallelQuickSortIndirect(int[], float[])
- void ensureOffsetLength(float[], int, int)
- void radixSort(float[])
- void radixSort(float[], int, int)
- void radixSort(float[], float[])
- void radixSort(float[], float[], int, int)
- void radixSort(float[][])
- void radixSort(float[][], int, int)
- float[] reverse(float[])
- float[] reverse(float[], int, int)
- void quickSort(float[], int, int, FloatComparator)
- void quickSort(float[], FloatComparator)
- void quickSort(float[], int, int)
- void quickSort(float[])
- void quickSort(float[], float[], int, int)
- void quickSort(float[], float[])
- void fill(float[], float)
- void fill(float[], int, int, float)
- float[] setLength(float[], int)
- void quickSortIndirect(int[], float[], int, int)
- void quickSortIndirect(int[], float[])
- boolean equals(float[], float[])
- void stabilize(int[], float[], int, int)
- void stabilize(int[], float[])
- void parallelRadixSortIndirect(int[], float[], int, int, boolean)
- void parallelRadixSortIndirect(int[], float[], boolean)
- float[] ensureCapacity(float[], int)
- float[] ensureCapacity(float[], int, int)
- float[] shuffle(float[], int, int, Random)
- float[] shuffle(float[], Random)
- void unstableSort(float[], int, int)
- void unstableSort(float[])
- void unstableSort(float[], int, int, FloatComparator)
- void unstableSort(float[], FloatComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.FloatBigArrays
Type: Class

Methods:
- void mul(float[][], long, float)
- long binarySearch(float[][], long, long, float)
- long binarySearch(float[][], float)
- long binarySearch(float[][], long, long, float, FloatComparator)
- long binarySearch(float[][], float, FloatComparator)
- void ensureFromTo(float[][], long, long)
- float[][] forceCapacity(float[][], long, long)
- void radixSortIndirect(long[][], float[][], float[][], boolean)
- void radixSortIndirect(long[][], float[][], float[][], long, long, boolean)
- float[][] trim(float[][], long)
- float get(float[][], long)
- void parallelQuickSort(float[][], long, long)
- void parallelQuickSort(float[][])
- void parallelQuickSort(float[][], long, long, FloatComparator)
- void parallelQuickSort(float[][], FloatComparator)
- void copy(float[][], long, float[][], long, long)
- float[][] copy(float[][], long, long)
- float[][] copy(float[][])
- void ensureSameLength(float[][], float[][])
- void decr(float[][], long)
- void add(float[][], long, float)
- float[][] grow(float[][], long)
- float[][] grow(float[][], long, long)
- void set(float[][], long, float)
- void incr(float[][], long)
- void swap(float[][], long, long)
- long length(float[][])
- void ensureOffsetLength(float[][], long, long)
- void radixSort(float[][])
- void radixSort(float[][], long, long)
- void radixSort(float[][], float[][])
- void radixSort(float[][], float[][], long, long)
- void quickSort(float[][], long, long, FloatComparator)
- void quickSort(float[][], FloatComparator)
- void quickSort(float[][], long, long)
- void quickSort(float[][])
- void fill(float[][], float)
- void fill(float[][], long, long, float)
- float[][] newBigArray(long)
- void copyToBig(float[], int, float[][], long, long)
- float[][] setLength(float[][], long)
- void copyFromBig(float[][], long, float[], int, int)
- boolean equals(float[][], float[][])
- String toString(float[][])
- float[][] ensureCapacity(float[][], long)
- float[][] ensureCapacity(float[][], long, long)
- float[][] shuffle(float[][], long, long, Random)
- float[][] shuffle(float[][], Random)
- float[][] wrap(float[])

### Class: com.sk89q.worldedit.bukkit.fastutil.floats.FloatComparators
Type: Class

Methods:
- FloatComparator oppositeComparator(FloatComparator)
- FloatComparator asFloatComparator(Comparator)

## Package: com.sk89q.worldedit.bukkit.fastutil.ints

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2BooleanFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntPredicate

Methods:
- boolean getOrDefault(int, boolean)
- Boolean getOrDefault(Object, Boolean)
- Object getOrDefault(Object, Object)
- Int2ShortFunction andThenShort(Boolean2ShortFunction)
- Byte2BooleanFunction composeByte(Byte2IntFunction)
- Int2IntFunction andThenInt(Boolean2IntFunction)
- Reference2BooleanFunction composeReference(Reference2IntFunction)
- Function andThen(Function)
- boolean remove(int)
- Boolean remove(Object)
- Object remove(Object)
- boolean put(int, boolean)
- Boolean put(Integer, Boolean)
- Object put(Object, Object)
- void defaultReturnValue(boolean)
- boolean defaultReturnValue()
- Int2DoubleFunction andThenDouble(Boolean2DoubleFunction)
- Int2ObjectFunction andThenObject(Boolean2ObjectFunction)
- boolean get(int)
- Boolean get(Object)
- Object get(Object)
- Int2LongFunction andThenLong(Boolean2LongFunction)
- Long2BooleanFunction composeLong(Long2IntFunction)
- Int2ByteFunction andThenByte(Boolean2ByteFunction)
- Int2FloatFunction andThenFloat(Boolean2FloatFunction)
- boolean test(int)
- boolean containsKey(int)
- boolean containsKey(Object)
- Int2BooleanFunction composeInt(Int2IntFunction)
- Float2BooleanFunction composeFloat(Float2IntFunction)
- Int2CharFunction andThenChar(Boolean2CharFunction)
- Object2BooleanFunction composeObject(Object2IntFunction)
- Function compose(Function)
- Short2BooleanFunction composeShort(Short2IntFunction)
- Int2ReferenceFunction andThenReference(Boolean2ReferenceFunction)
- Char2BooleanFunction composeChar(Char2IntFunction)
- Double2BooleanFunction composeDouble(Double2IntFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ByteFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- byte getOrDefault(int, byte)
- Byte getOrDefault(Object, Byte)
- Object getOrDefault(Object, Object)
- Int2ShortFunction andThenShort(Byte2ShortFunction)
- Byte2ByteFunction composeByte(Byte2IntFunction)
- Int2IntFunction andThenInt(Byte2IntFunction)
- Reference2ByteFunction composeReference(Reference2IntFunction)
- Function andThen(Function)
- byte remove(int)
- Byte remove(Object)
- Object remove(Object)
- byte put(int, byte)
- Byte put(Integer, Byte)
- Object put(Object, Object)
- void defaultReturnValue(byte)
- byte defaultReturnValue()
- Int2DoubleFunction andThenDouble(Byte2DoubleFunction)
- Int2ObjectFunction andThenObject(Byte2ObjectFunction)
- byte get(int)
- Byte get(Object)
- Object get(Object)
- Int2LongFunction andThenLong(Byte2LongFunction)
- Long2ByteFunction composeLong(Long2IntFunction)
- Int2ByteFunction andThenByte(Byte2ByteFunction)
- Int2FloatFunction andThenFloat(Byte2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(int)
- boolean containsKey(Object)
- Int2ByteFunction composeInt(Int2IntFunction)
- Float2ByteFunction composeFloat(Float2IntFunction)
- Int2CharFunction andThenChar(Byte2CharFunction)
- Object2ByteFunction composeObject(Object2IntFunction)
- Function compose(Function)
- Short2ByteFunction composeShort(Short2IntFunction)
- Int2ReferenceFunction andThenReference(Byte2ReferenceFunction)
- Char2ByteFunction composeChar(Char2IntFunction)
- Double2ByteFunction composeDouble(Double2IntFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2CharFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- char getOrDefault(int, char)
- Character getOrDefault(Object, Character)
- Object getOrDefault(Object, Object)
- Int2ShortFunction andThenShort(Char2ShortFunction)
- Byte2CharFunction composeByte(Byte2IntFunction)
- Int2IntFunction andThenInt(Char2IntFunction)
- Reference2CharFunction composeReference(Reference2IntFunction)
- Function andThen(Function)
- char remove(int)
- Character remove(Object)
- Object remove(Object)
- char put(int, char)
- Character put(Integer, Character)
- Object put(Object, Object)
- void defaultReturnValue(char)
- char defaultReturnValue()
- Int2DoubleFunction andThenDouble(Char2DoubleFunction)
- Int2ObjectFunction andThenObject(Char2ObjectFunction)
- char get(int)
- Character get(Object)
- Object get(Object)
- Int2LongFunction andThenLong(Char2LongFunction)
- Long2CharFunction composeLong(Long2IntFunction)
- Int2ByteFunction andThenByte(Char2ByteFunction)
- Int2FloatFunction andThenFloat(Char2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(int)
- boolean containsKey(Object)
- Int2CharFunction composeInt(Int2IntFunction)
- Float2CharFunction composeFloat(Float2IntFunction)
- Int2CharFunction andThenChar(Char2CharFunction)
- Object2CharFunction composeObject(Object2IntFunction)
- Function compose(Function)
- Short2CharFunction composeShort(Short2IntFunction)
- Int2ReferenceFunction andThenReference(Char2ReferenceFunction)
- Char2CharFunction composeChar(Char2IntFunction)
- Double2CharFunction composeDouble(Double2IntFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2DoubleFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToDoubleFunction

Methods:
- double getOrDefault(int, double)
- Double getOrDefault(Object, Double)
- Object getOrDefault(Object, Object)
- double applyAsDouble(int)
- Int2ShortFunction andThenShort(Double2ShortFunction)
- Byte2DoubleFunction composeByte(Byte2IntFunction)
- Int2IntFunction andThenInt(Double2IntFunction)
- Reference2DoubleFunction composeReference(Reference2IntFunction)
- Function andThen(Function)
- double remove(int)
- Double remove(Object)
- Object remove(Object)
- double put(int, double)
- Double put(Integer, Double)
- Object put(Object, Object)
- void defaultReturnValue(double)
- double defaultReturnValue()
- Int2DoubleFunction andThenDouble(Double2DoubleFunction)
- Int2ObjectFunction andThenObject(Double2ObjectFunction)
- double get(int)
- Double get(Object)
- Object get(Object)
- Int2LongFunction andThenLong(Double2LongFunction)
- Long2DoubleFunction composeLong(Long2IntFunction)
- Int2ByteFunction andThenByte(Double2ByteFunction)
- Int2FloatFunction andThenFloat(Double2FloatFunction)
- boolean containsKey(int)
- boolean containsKey(Object)
- Int2DoubleFunction composeInt(Int2IntFunction)
- Float2DoubleFunction composeFloat(Float2IntFunction)
- Int2CharFunction andThenChar(Double2CharFunction)
- Object2DoubleFunction composeObject(Object2IntFunction)
- Function compose(Function)
- Short2DoubleFunction composeShort(Short2IntFunction)
- Int2ReferenceFunction andThenReference(Double2ReferenceFunction)
- Char2DoubleFunction composeChar(Char2IntFunction)
- Double2DoubleFunction composeDouble(Double2IntFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2FloatFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToDoubleFunction

Methods:
- float getOrDefault(int, float)
- Float getOrDefault(Object, Float)
- Object getOrDefault(Object, Object)
- double applyAsDouble(int)
- Int2ShortFunction andThenShort(Float2ShortFunction)
- Byte2FloatFunction composeByte(Byte2IntFunction)
- Int2IntFunction andThenInt(Float2IntFunction)
- Reference2FloatFunction composeReference(Reference2IntFunction)
- Function andThen(Function)
- float remove(int)
- Float remove(Object)
- Object remove(Object)
- float put(int, float)
- Float put(Integer, Float)
- Object put(Object, Object)
- void defaultReturnValue(float)
- float defaultReturnValue()
- Int2DoubleFunction andThenDouble(Float2DoubleFunction)
- Int2ObjectFunction andThenObject(Float2ObjectFunction)
- float get(int)
- Float get(Object)
- Object get(Object)
- Int2LongFunction andThenLong(Float2LongFunction)
- Long2FloatFunction composeLong(Long2IntFunction)
- Int2ByteFunction andThenByte(Float2ByteFunction)
- Int2FloatFunction andThenFloat(Float2FloatFunction)
- boolean containsKey(int)
- boolean containsKey(Object)
- Int2FloatFunction composeInt(Int2IntFunction)
- Float2FloatFunction composeFloat(Float2IntFunction)
- Int2CharFunction andThenChar(Float2CharFunction)
- Object2FloatFunction composeObject(Object2IntFunction)
- Function compose(Function)
- Short2FloatFunction composeShort(Short2IntFunction)
- Int2ReferenceFunction andThenReference(Float2ReferenceFunction)
- Char2FloatFunction composeChar(Char2IntFunction)
- Double2FloatFunction composeDouble(Double2IntFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2IntFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- int getOrDefault(int, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- Int2ShortFunction andThenShort(Int2ShortFunction)
- Byte2IntFunction composeByte(Byte2IntFunction)
- Int2IntFunction andThenInt(Int2IntFunction)
- Reference2IntFunction composeReference(Reference2IntFunction)
- Function andThen(Function)
- int remove(int)
- Integer remove(Object)
- Object remove(Object)
- int put(int, int)
- Integer put(Integer, Integer)
- Object put(Object, Object)
- void defaultReturnValue(int)
- int defaultReturnValue()
- Int2DoubleFunction andThenDouble(Int2DoubleFunction)
- Int2ObjectFunction andThenObject(Int2ObjectFunction)
- Int2IntFunction identity()
- int get(int)
- Integer get(Object)
- Object get(Object)
- Int2LongFunction andThenLong(Int2LongFunction)
- Long2IntFunction composeLong(Long2IntFunction)
- Int2ByteFunction andThenByte(Int2ByteFunction)
- Int2FloatFunction andThenFloat(Int2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(int)
- boolean containsKey(Object)
- Int2IntFunction composeInt(Int2IntFunction)
- Float2IntFunction composeFloat(Float2IntFunction)
- Int2CharFunction andThenChar(Int2CharFunction)
- Object2IntFunction composeObject(Object2IntFunction)
- Function compose(Function)
- Short2IntFunction composeShort(Short2IntFunction)
- Int2ReferenceFunction andThenReference(Int2ReferenceFunction)
- Char2IntFunction composeChar(Char2IntFunction)
- Double2IntFunction composeDouble(Double2IntFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2IntMap
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.Int2IntFunction, java.util.Map

Methods:
- int getOrDefault(int, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- int computeIfAbsentNullable(int, IntFunction)
- ObjectSet entrySet()
- Set entrySet()
- void forEach(BiConsumer)
- boolean containsKey(int)
- boolean containsKey(Object)
- int computeIfAbsent(int, IntUnaryOperator)
- int computeIfAbsent(int, Int2IntFunction)
- Integer computeIfAbsent(Integer, Function)
- Object computeIfAbsent(Object, Function)
- IntCollection values()
- Collection values()
- boolean replace(int, int, int)
- int replace(int, int)
- boolean replace(Integer, Integer, Integer)
- Integer replace(Integer, Integer)
- Object replace(Object, Object)
- boolean replace(Object, Object, Object)
- void clear()
- int computeIfAbsentPartial(int, Int2IntFunction)
- boolean containsValue(int)
- boolean containsValue(Object)
- Integer remove(Object)
- boolean remove(int, int)
- boolean remove(Object, Object)
- Object remove(Object)
- Integer put(Integer, Integer)
- Object put(Object, Object)
- int mergeInt(int, int, IntBinaryOperator)
- int mergeInt(int, int, IntBinaryOperator)
- ObjectSet int2IntEntrySet()
- int compute(int, BiFunction)
- Integer compute(Integer, BiFunction)
- Object compute(Object, BiFunction)
- void defaultReturnValue(int)
- int defaultReturnValue()
- int computeIfPresent(int, BiFunction)
- Integer computeIfPresent(Integer, BiFunction)
- Object computeIfPresent(Object, BiFunction)
- int size()
- int merge(int, int, BiFunction)
- Integer merge(Integer, Integer, BiFunction)
- Object merge(Object, Object, BiFunction)
- Integer get(Object)
- Object get(Object)
- int putIfAbsent(int, int)
- Integer putIfAbsent(Integer, Integer)
- Object putIfAbsent(Object, Object)
- IntSet keySet()
- Set keySet()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2LongFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToLongFunction

Methods:
- long getOrDefault(int, long)
- Long getOrDefault(Object, Long)
- Object getOrDefault(Object, Object)
- Int2ShortFunction andThenShort(Long2ShortFunction)
- Byte2LongFunction composeByte(Byte2IntFunction)
- Int2IntFunction andThenInt(Long2IntFunction)
- Reference2LongFunction composeReference(Reference2IntFunction)
- Function andThen(Function)
- long remove(int)
- Long remove(Object)
- Object remove(Object)
- long put(int, long)
- Long put(Integer, Long)
- Object put(Object, Object)
- void defaultReturnValue(long)
- long defaultReturnValue()
- Int2DoubleFunction andThenDouble(Long2DoubleFunction)
- Int2ObjectFunction andThenObject(Long2ObjectFunction)
- long get(int)
- Long get(Object)
- Object get(Object)
- Int2LongFunction andThenLong(Long2LongFunction)
- Long2LongFunction composeLong(Long2IntFunction)
- Int2ByteFunction andThenByte(Long2ByteFunction)
- Int2FloatFunction andThenFloat(Long2FloatFunction)
- boolean containsKey(int)
- boolean containsKey(Object)
- Int2LongFunction composeInt(Int2IntFunction)
- Float2LongFunction composeFloat(Float2IntFunction)
- Int2CharFunction andThenChar(Long2CharFunction)
- long applyAsLong(int)
- Object2LongFunction composeObject(Object2IntFunction)
- Function compose(Function)
- Short2LongFunction composeShort(Short2IntFunction)
- Int2ReferenceFunction andThenReference(Long2ReferenceFunction)
- Char2LongFunction composeChar(Char2IntFunction)
- Double2LongFunction composeDouble(Double2IntFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntFunction

Methods:
- Object getOrDefault(int, Object)
- Object getOrDefault(Object, Object)
- Int2ShortFunction andThenShort(Object2ShortFunction)
- Byte2ObjectFunction composeByte(Byte2IntFunction)
- Int2IntFunction andThenInt(Object2IntFunction)
- Reference2ObjectFunction composeReference(Reference2IntFunction)
- Object remove(int)
- Object remove(Object)
- Object put(int, Object)
- Object put(Integer, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Int2DoubleFunction andThenDouble(Object2DoubleFunction)
- Int2ObjectFunction andThenObject(Object2ObjectFunction)
- Object get(int)
- Object get(Object)
- Int2LongFunction andThenLong(Object2LongFunction)
- Long2ObjectFunction composeLong(Long2IntFunction)
- Int2ByteFunction andThenByte(Object2ByteFunction)
- Int2FloatFunction andThenFloat(Object2FloatFunction)
- Object apply(int)
- boolean containsKey(int)
- boolean containsKey(Object)
- Int2ObjectFunction composeInt(Int2IntFunction)
- Float2ObjectFunction composeFloat(Float2IntFunction)
- Int2CharFunction andThenChar(Object2CharFunction)
- Object2ObjectFunction composeObject(Object2IntFunction)
- Function compose(Function)
- Short2ObjectFunction composeShort(Short2IntFunction)
- Int2ReferenceFunction andThenReference(Object2ReferenceFunction)
- Char2ObjectFunction composeChar(Char2IntFunction)
- Double2ObjectFunction composeDouble(Double2IntFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectMap
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectFunction, java.util.Map

Methods:
- Object getOrDefault(int, Object)
- Object getOrDefault(Object, Object)
- ObjectSet entrySet()
- Set entrySet()
- void forEach(BiConsumer)
- boolean containsKey(int)
- boolean containsKey(Object)
- Object computeIfAbsent(int, IntFunction)
- Object computeIfAbsent(int, Int2ObjectFunction)
- ObjectCollection values()
- Collection values()
- boolean replace(int, Object, Object)
- Object replace(int, Object)
- void clear()
- Object computeIfAbsentPartial(int, Int2ObjectFunction)
- Object remove(Object)
- boolean remove(int, Object)
- Object put(Integer, Object)
- Object put(Object, Object)
- Object compute(int, BiFunction)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Object computeIfPresent(int, BiFunction)
- ObjectSet int2ObjectEntrySet()
- int size()
- Object merge(int, Object, BiFunction)
- Object get(Object)
- Object putIfAbsent(int, Object)
- IntSet keySet()
- Set keySet()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectSortedMap
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectMap, java.util.SortedMap

Methods:
- IntComparator comparator()
- Comparator comparator()
- ObjectSortedSet int2ObjectEntrySet()
- ObjectSet int2ObjectEntrySet()
- ObjectSortedSet entrySet()
- ObjectSet entrySet()
- Set entrySet()
- Integer firstKey()
- Object firstKey()
- ObjectCollection values()
- Collection values()
- int firstIntKey()
- Int2ObjectSortedMap subMap(int, int)
- Int2ObjectSortedMap subMap(Integer, Integer)
- SortedMap subMap(Object, Object)
- Integer lastKey()
- Object lastKey()
- Int2ObjectSortedMap headMap(int)
- Int2ObjectSortedMap headMap(Integer)
- SortedMap headMap(Object)
- IntSortedSet keySet()
- IntSet keySet()
- Set keySet()
- Int2ObjectSortedMap tailMap(int)
- Int2ObjectSortedMap tailMap(Integer)
- SortedMap tailMap(Object)
- int lastIntKey()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ReferenceFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntFunction

Methods:
- Object getOrDefault(int, Object)
- Object getOrDefault(Object, Object)
- Int2ShortFunction andThenShort(Reference2ShortFunction)
- Byte2ReferenceFunction composeByte(Byte2IntFunction)
- Int2IntFunction andThenInt(Reference2IntFunction)
- Reference2ReferenceFunction composeReference(Reference2IntFunction)
- Object remove(int)
- Object remove(Object)
- Object put(int, Object)
- Object put(Integer, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Int2DoubleFunction andThenDouble(Reference2DoubleFunction)
- Int2ObjectFunction andThenObject(Reference2ObjectFunction)
- Object get(int)
- Object get(Object)
- Int2LongFunction andThenLong(Reference2LongFunction)
- Long2ReferenceFunction composeLong(Long2IntFunction)
- Int2ByteFunction andThenByte(Reference2ByteFunction)
- Int2FloatFunction andThenFloat(Reference2FloatFunction)
- Object apply(int)
- boolean containsKey(int)
- boolean containsKey(Object)
- Int2ReferenceFunction composeInt(Int2IntFunction)
- Float2ReferenceFunction composeFloat(Float2IntFunction)
- Int2CharFunction andThenChar(Reference2CharFunction)
- Object2ReferenceFunction composeObject(Object2IntFunction)
- Function compose(Function)
- Short2ReferenceFunction composeShort(Short2IntFunction)
- Int2ReferenceFunction andThenReference(Reference2ReferenceFunction)
- Char2ReferenceFunction composeChar(Char2IntFunction)
- Double2ReferenceFunction composeDouble(Double2IntFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ShortFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- short getOrDefault(int, short)
- Short getOrDefault(Object, Short)
- Object getOrDefault(Object, Object)
- Int2ShortFunction andThenShort(Short2ShortFunction)
- Byte2ShortFunction composeByte(Byte2IntFunction)
- Int2IntFunction andThenInt(Short2IntFunction)
- Reference2ShortFunction composeReference(Reference2IntFunction)
- Function andThen(Function)
- short remove(int)
- Short remove(Object)
- Object remove(Object)
- short put(int, short)
- Short put(Integer, Short)
- Object put(Object, Object)
- void defaultReturnValue(short)
- short defaultReturnValue()
- Int2DoubleFunction andThenDouble(Short2DoubleFunction)
- Int2ObjectFunction andThenObject(Short2ObjectFunction)
- short get(int)
- Short get(Object)
- Object get(Object)
- Int2LongFunction andThenLong(Short2LongFunction)
- Long2ShortFunction composeLong(Long2IntFunction)
- Int2ByteFunction andThenByte(Short2ByteFunction)
- Int2FloatFunction andThenFloat(Short2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(int)
- boolean containsKey(Object)
- Int2ShortFunction composeInt(Int2IntFunction)
- Float2ShortFunction composeFloat(Float2IntFunction)
- Int2CharFunction andThenChar(Short2CharFunction)
- Object2ShortFunction composeObject(Object2IntFunction)
- Function compose(Function)
- Short2ShortFunction composeShort(Short2IntFunction)
- Int2ReferenceFunction andThenReference(Short2ReferenceFunction)
- Char2ShortFunction composeChar(Char2IntFunction)
- Double2ShortFunction composeDouble(Double2IntFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntBidirectionalIterable
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntIterable

Methods:
- IntBidirectionalIterator iterator()
- IntIterator iterator()
- Iterator iterator()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntBidirectionalIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntIterator, com.sk89q.worldedit.bukkit.fastutil.objects.ObjectBidirectionalIterator

Methods:
- int previousInt()
- Integer previous()
- Object previous()
- int back(int)
- int skip(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntBigListIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntBidirectionalIterator, com.sk89q.worldedit.bukkit.fastutil.BigListIterator

Methods:
- void add(int)
- void add(Integer)
- void add(Object)
- void set(int)
- void set(Integer)
- void set(Object)
- long back(long)
- long skip(long)
- int skip(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntBinaryOperator
Type: Interface
Implements: java.util.function.BinaryOperator, java.util.function.IntBinaryOperator

Methods:
- int applyAsInt(int, int)
- int apply(int, int)
- Integer apply(Integer, Integer)
- Object apply(Object, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntCollection
Type: Interface
Implements: java.util.Collection, com.sk89q.worldedit.bukkit.fastutil.ints.IntIterable

Methods:
- boolean add(int)
- boolean add(Integer)
- boolean add(Object)
- IntSpliterator spliterator()
- Spliterator spliterator()
- boolean containsAll(IntCollection)
- IntIterator intIterator()
- IntSpliterator intSpliterator()
- boolean remove(Object)
- boolean removeIf(Predicate)
- boolean removeIf(IntPredicate)
- boolean removeIf(IntPredicate)
- IntStream intStream()
- boolean removeAll(IntCollection)
- boolean contains(int)
- boolean contains(Object)
- IntIterator iterator()
- Iterator iterator()
- Stream stream()
- boolean addAll(IntCollection)
- int[] toIntArray()
- int[] toIntArray(int[])
- int[] toArray(int[])
- Stream parallelStream()
- boolean rem(int)
- IntStream intParallelStream()
- boolean retainAll(IntCollection)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntComparator
Type: Interface
Implements: java.util.Comparator

Methods:
- IntComparator comparingDouble(Int2DoubleFunction)
- int compare(int, int)
- int compare(Integer, Integer)
- int compare(Object, Object)
- IntComparator comparingLong(Int2LongFunction)
- IntComparator thenComparing(IntComparator)
- Comparator thenComparing(Comparator)
- IntComparator comparingInt(Int2IntFunction)
- IntComparator comparing(Int2ObjectFunction)
- IntComparator comparing(Int2ObjectFunction, Comparator)
- IntComparator reversed()
- Comparator reversed()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntConsumer
Type: Interface
Implements: java.util.function.Consumer, java.util.function.IntConsumer

Methods:
- IntConsumer andThen(IntConsumer)
- IntConsumer andThen(IntConsumer)
- Consumer andThen(Consumer)
- IntConsumer andThen(IntConsumer)
- void accept(Integer)
- void accept(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntIntPair
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Pair

Methods:
- int leftInt()
- int firstInt()
- Integer right()
- IntIntPair right(int)
- IntIntPair right(Integer)
- Pair right(Object)
- Object right()
- int valueInt()
- int keyInt()
- Integer second()
- IntIntPair second(int)
- IntIntPair second(Integer)
- Pair second(Object)
- Object second()
- int rightInt()
- Integer left()
- IntIntPair left(int)
- IntIntPair left(Integer)
- Pair left(Object)
- Object left()
- IntIntPair of(int, int)
- Comparator lexComparator()
- Integer value()
- IntIntPair value(int)
- IntIntPair value(Integer)
- Object value()
- Pair value(Object)
- Integer key()
- IntIntPair key(int)
- IntIntPair key(Integer)
- Object key()
- Pair key(Object)
- Integer first()
- IntIntPair first(int)
- IntIntPair first(Integer)
- Pair first(Object)
- Object first()
- int secondInt()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntIterable
Type: Interface
Implements: java.lang.Iterable

Methods:
- IntIterator iterator()
- Iterator iterator()
- IntSpliterator spliterator()
- Spliterator spliterator()
- void forEach(IntConsumer)
- void forEach(IntConsumer)
- void forEach(Consumer)
- IntIterator intIterator()
- IntSpliterator intSpliterator()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntIterator
Type: Interface
Implements: java.util.PrimitiveIterator$OfInt

Methods:
- Integer next()
- Object next()
- int skip(int)
- void forEachRemaining(IntConsumer)
- void forEachRemaining(Consumer)
- int nextInt()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntList
Type: Interface
Implements: java.util.List, java.lang.Comparable, com.sk89q.worldedit.bukkit.fastutil.ints.IntCollection

Methods:
- boolean add(int)
- void add(int, int)
- void add(int, Integer)
- boolean add(Integer)
- void add(int, Object)
- boolean add(Object)
- IntList subList(int, int)
- List subList(int, int)
- int set(int, int)
- Integer set(int, Integer)
- Object set(int, Object)
- int removeInt(int)
- IntSpliterator spliterator()
- Spliterator spliterator()
- void setElements(int[])
- void setElements(int, int[])
- void setElements(int, int[], int, int)
- void sort(Comparator)
- void sort(IntComparator)
- void removeElements(int, int)
- void replaceAll(IntUnaryOperator)
- void replaceAll(IntUnaryOperator)
- void replaceAll(UnaryOperator)
- boolean remove(Object)
- Integer remove(int)
- Object remove(int)
- int lastIndexOf(int)
- int lastIndexOf(Object)
- int getInt(int)
- boolean contains(Object)
- IntListIterator iterator()
- Iterator iterator()
- IntIterator iterator()
- void size(int)
- boolean addAll(int, IntCollection)
- boolean addAll(int, IntList)
- boolean addAll(IntList)
- void addElements(int, int[])
- void addElements(int, int[], int, int)
- IntList of()
- IntList of(int)
- IntList of(int, int)
- IntList of(int, int, int)
- IntList of(int[])
- Integer get(int)
- Object get(int)
- void getElements(int, int[], int, int)
- IntListIterator listIterator()
- IntListIterator listIterator(int)
- ListIterator listIterator(int)
- ListIterator listIterator()
- int indexOf(int)
- int indexOf(Object)
- void unstableSort(Comparator)
- void unstableSort(IntComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntListIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntBidirectionalIterator, java.util.ListIterator

Methods:
- Integer next()
- Object next()
- void add(int)
- void add(Integer)
- void add(Object)
- void set(int)
- void set(Integer)
- void set(Object)
- Integer previous()
- Object previous()
- void remove()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntObjectPair
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Pair

Methods:
- Integer left()
- IntObjectPair left(int)
- IntObjectPair left(Integer)
- Pair left(Object)
- Object left()
- int leftInt()
- int firstInt()
- IntObjectPair of(int, Object)
- Comparator lexComparator()
- int keyInt()
- Integer key()
- IntObjectPair key(int)
- IntObjectPair key(Integer)
- Object key()
- Pair key(Object)
- Integer first()
- IntObjectPair first(int)
- IntObjectPair first(Integer)
- Pair first(Object)
- Object first()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntPredicate
Type: Interface
Implements: java.util.function.Predicate, java.util.function.IntPredicate

Methods:
- IntPredicate or(IntPredicate)
- IntPredicate or(IntPredicate)
- Predicate or(Predicate)
- IntPredicate or(IntPredicate)
- boolean test(Integer)
- boolean test(Object)
- IntPredicate negate()
- Predicate negate()
- IntPredicate negate()
- IntPredicate and(IntPredicate)
- IntPredicate and(IntPredicate)
- Predicate and(Predicate)
- IntPredicate and(IntPredicate)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntSet
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntCollection, java.util.Set

Methods:
- boolean add(Integer)
- boolean add(Object)
- boolean contains(Object)
- IntIterator iterator()
- Iterator iterator()
- IntSpliterator spliterator()
- Spliterator spliterator()
- IntSet of()
- IntSet of(int)
- IntSet of(int, int)
- IntSet of(int, int, int)
- IntSet of(int[])
- boolean rem(int)
- boolean remove(int)
- boolean remove(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntSortedSet
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntSet, java.util.SortedSet, com.sk89q.worldedit.bukkit.fastutil.ints.IntBidirectionalIterable

Methods:
- IntSortedSet tailSet(int)
- IntSortedSet tailSet(Integer)
- SortedSet tailSet(Object)
- IntComparator comparator()
- Comparator comparator()
- IntBidirectionalIterator iterator(int)
- IntBidirectionalIterator iterator()
- IntIterator iterator()
- Iterator iterator()
- Integer last()
- Object last()
- IntSortedSet headSet(int)
- IntSortedSet headSet(Integer)
- SortedSet headSet(Object)
- IntSpliterator spliterator()
- Spliterator spliterator()
- int firstInt()
- int lastInt()
- IntSortedSet subSet(int, int)
- IntSortedSet subSet(Integer, Integer)
- SortedSet subSet(Object, Object)
- Integer first()
- Object first()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntSpliterator
Type: Interface
Implements: java.util.Spliterator$OfInt

Methods:
- IntSpliterator trySplit()
- Spliterator$OfInt trySplit()
- Spliterator$OfPrimitive trySplit()
- Spliterator trySplit()
- boolean tryAdvance(Consumer)
- boolean tryAdvance(IntConsumer)
- IntComparator getComparator()
- Comparator getComparator()
- long skip(long)
- void forEachRemaining(Consumer)
- void forEachRemaining(IntConsumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntStack
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Stack

Methods:
- Integer pop()
- Object pop()
- int peekInt(int)
- int popInt()
- Integer top()
- Object top()
- int topInt()
- void push(int)
- void push(Integer)
- void push(Object)
- Integer peek(int)
- Object peek(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntUnaryOperator
Type: Interface
Implements: java.util.function.UnaryOperator, java.util.function.IntUnaryOperator

Methods:
- IntUnaryOperator negation()
- int applyAsInt(int)
- int apply(int)
- Integer apply(Integer)
- Object apply(Object)
- IntUnaryOperator identity()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractInt2IntFunction
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.Int2IntFunction, java.io.Serializable

Methods:
- void defaultReturnValue(int)
- int defaultReturnValue()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractInt2IntMap
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractInt2IntFunction
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.Int2IntMap, java.io.Serializable

Methods:
- int hashCode()
- boolean containsKey(int)
- boolean equals(Object)
- void putAll(Map)
- IntCollection values()
- Collection values()
- boolean isEmpty()
- String toString()
- IntSet keySet()
- Set keySet()
- boolean containsValue(int)
- int mergeInt(int, int, IntBinaryOperator)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractInt2ObjectFunction
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectFunction, java.io.Serializable

Methods:
- void defaultReturnValue(Object)
- Object defaultReturnValue()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractInt2ObjectMap
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractInt2ObjectFunction
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectMap, java.io.Serializable

Methods:
- int hashCode()
- boolean containsKey(int)
- boolean equals(Object)
- void putAll(Map)
- ObjectCollection values()
- Collection values()
- boolean isEmpty()
- String toString()
- IntSet keySet()
- Set keySet()
- boolean containsValue(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractInt2ObjectSortedMap
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractInt2ObjectMap
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectSortedMap

Methods:
- ObjectCollection values()
- Collection values()
- IntSortedSet keySet()
- IntSet keySet()
- Set keySet()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntCollection
Type: Abstract Class
Extends: java.util.AbstractCollection
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntCollection

Methods:
- boolean add(int)
- boolean add(Integer)
- boolean add(Object)
- void forEach(IntConsumer)
- boolean containsAll(IntCollection)
- boolean containsAll(Collection)
- boolean remove(Object)
- boolean removeIf(IntPredicate)
- boolean removeAll(IntCollection)
- boolean removeAll(Collection)
- boolean contains(int)
- boolean contains(Object)
- IntIterator iterator()
- Iterator iterator()
- boolean addAll(IntCollection)
- boolean addAll(Collection)
- int[] toIntArray()
- int[] toIntArray(int[])
- int[] toArray(int[])
- String toString()
- boolean rem(int)
- boolean retainAll(IntCollection)
- boolean retainAll(Collection)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntIterator
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntIterator

Methods:
- void forEachRemaining(IntConsumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntList
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntCollection
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntList, com.sk89q.worldedit.bukkit.fastutil.ints.IntStack

Methods:
- int peekInt(int)
- int compareTo(List)
- int compareTo(Object)
- void replaceAll(IntUnaryOperator)
- IntListIterator iterator()
- IntIterator iterator()
- Iterator iterator()
- int hashCode()
- void addElements(int, int[], int, int)
- void addElements(int, int[])
- int[] toIntArray()
- int[] toArray(int[])
- int topInt()
- boolean rem(int)
- int indexOf(int)
- void add(int, int)
- boolean add(int)
- IntList subList(int, int)
- List subList(int, int)
- int set(int, int)
- int removeInt(int)
- void forEach(IntConsumer)
- void clear()
- void setElements(int, int[], int, int)
- void removeElements(int, int)
- void push(int)
- int popInt()
- int lastIndexOf(int)
- boolean contains(int)
- void size(int)
- boolean addAll(int, Collection)
- boolean addAll(Collection)
- boolean addAll(int, IntCollection)
- boolean addAll(IntCollection)
- boolean equals(Object)
- void getElements(int, int[], int, int)
- IntListIterator listIterator()
- IntListIterator listIterator(int)
- ListIterator listIterator(int)
- ListIterator listIterator()
- String toString()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntSet
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntCollection
Implements: java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.ints.IntSet

Methods:
- IntIterator iterator()
- Iterator iterator()
- int hashCode()
- boolean equals(Object)
- boolean rem(int)
- boolean remove(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntSortedSet
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntSet
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntSortedSet

Methods:
- IntBidirectionalIterator iterator()
- IntIterator iterator()
- Iterator iterator()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntSpliterator
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntSpliterator

Methods:
- boolean tryAdvance(IntConsumer)
- void forEachRemaining(IntConsumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2IntFunctions
Type: Class

Methods:
- Int2IntFunction singleton(int, int)
- Int2IntFunction singleton(Integer, Integer)
- Int2IntFunction unmodifiable(Int2IntFunction)
- Int2IntFunction primitive(Function)
- Int2IntFunction synchronize(Int2IntFunction)
- Int2IntFunction synchronize(Int2IntFunction, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2IntMaps
Type: Class

Methods:
- Int2IntMap singleton(int, int)
- Int2IntMap singleton(Integer, Integer)
- void fastForEach(Int2IntMap, Consumer)
- Int2IntMap unmodifiable(Int2IntMap)
- ObjectIterable fastIterable(Int2IntMap)
- ObjectIterator fastIterator(Int2IntMap)
- Int2IntMap synchronize(Int2IntMap)
- Int2IntMap synchronize(Int2IntMap, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2IntOpenHashMap
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractInt2IntMap
Implements: java.io.Serializable, java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.Hash

Methods:
- int getOrDefault(int, int)
- IntCollection values()
- Collection values()
- int computeIfAbsent(int, IntUnaryOperator)
- int computeIfAbsent(int, Int2IntFunction)
- boolean replace(int, int, int)
- int replace(int, int)
- boolean containsValue(int)
- int remove(int)
- boolean remove(int, int)
- int put(int, int)
- Int2IntMap$FastEntrySet int2IntEntrySet()
- ObjectSet int2IntEntrySet()
- int compute(int, BiFunction)
- boolean trim()
- boolean trim(int)
- int hashCode()
- int merge(int, int, BiFunction)
- int get(int)
- void putAll(Map)
- IntSet keySet()
- Set keySet()
- int computeIfAbsentNullable(int, IntFunction)
- boolean containsKey(int)
- boolean isEmpty()
- void clear()
- int computeIfPresent(int, BiFunction)
- int size()
- Int2IntOpenHashMap clone()
- Object clone() throws CloneNotSupportedException
- int addTo(int, int)
- void ensureCapacity(int)
- int putIfAbsent(int, int)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectFunctions
Type: Class

Methods:
- Int2ObjectFunction singleton(int, Object)
- Int2ObjectFunction singleton(Integer, Object)
- Int2ObjectFunction unmodifiable(Int2ObjectFunction)
- Int2ObjectFunction primitive(Function)
- Int2ObjectFunction synchronize(Int2ObjectFunction)
- Int2ObjectFunction synchronize(Int2ObjectFunction, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectLinkedOpenHashMap
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractInt2ObjectSortedMap
Implements: java.io.Serializable, java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.Hash

Methods:
- Object getOrDefault(int, Object)
- ObjectCollection values()
- Collection values()
- int firstIntKey()
- Object computeIfAbsent(int, IntFunction)
- Object computeIfAbsent(int, Int2ObjectFunction)
- boolean replace(int, Object, Object)
- Object replace(int, Object)
- Object putAndMoveToLast(int, Object)
- Object getAndMoveToLast(int)
- Object removeLast()
- boolean containsValue(Object)
- Object remove(int)
- boolean remove(int, Object)
- Object put(int, Object)
- Object compute(int, BiFunction)
- Object putAndMoveToFirst(int, Object)
- Int2ObjectSortedMap$FastSortedEntrySet int2ObjectEntrySet()
- ObjectSortedSet int2ObjectEntrySet()
- ObjectSet int2ObjectEntrySet()
- boolean trim()
- boolean trim(int)
- Object getAndMoveToFirst(int)
- int hashCode()
- Object merge(int, Object, BiFunction)
- Object get(int)
- Object removeFirst()
- void putAll(Map)
- IntSortedSet keySet()
- IntSet keySet()
- Set keySet()
- int lastIntKey()
- boolean containsKey(int)
- Int2ObjectSortedMap subMap(int, int)
- boolean isEmpty()
- void clear()
- IntComparator comparator()
- Comparator comparator()
- Object computeIfPresent(int, BiFunction)
- int size()
- Int2ObjectLinkedOpenHashMap clone()
- Object clone() throws CloneNotSupportedException
- Int2ObjectSortedMap headMap(int)
- void ensureCapacity(int)
- Object putIfAbsent(int, Object)
- Int2ObjectSortedMap tailMap(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectMaps
Type: Class

Methods:
- Int2ObjectMap singleton(int, Object)
- Int2ObjectMap singleton(Integer, Object)
- void fastForEach(Int2ObjectMap, Consumer)
- Int2ObjectMap unmodifiable(Int2ObjectMap)
- Int2ObjectMap emptyMap()
- ObjectIterable fastIterable(Int2ObjectMap)
- ObjectIterator fastIterator(Int2ObjectMap)
- Int2ObjectMap synchronize(Int2ObjectMap)
- Int2ObjectMap synchronize(Int2ObjectMap, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectOpenHashMap
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractInt2ObjectMap
Implements: java.io.Serializable, java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.Hash

Methods:
- Object getOrDefault(int, Object)
- boolean containsKey(int)
- ObjectCollection values()
- Collection values()
- Object computeIfAbsent(int, IntFunction)
- Object computeIfAbsent(int, Int2ObjectFunction)
- boolean isEmpty()
- void clear()
- boolean replace(int, Object, Object)
- Object replace(int, Object)
- boolean containsValue(Object)
- Object remove(int)
- boolean remove(int, Object)
- Object put(int, Object)
- Object compute(int, BiFunction)
- Int2ObjectMap$FastEntrySet int2ObjectEntrySet()
- ObjectSet int2ObjectEntrySet()
- Object computeIfPresent(int, BiFunction)
- boolean trim()
- boolean trim(int)
- int size()
- int hashCode()
- Object merge(int, Object, BiFunction)
- Object get(int)
- void putAll(Map)
- Int2ObjectOpenHashMap clone()
- Object clone() throws CloneNotSupportedException
- void ensureCapacity(int)
- IntSet keySet()
- Set keySet()
- Object putIfAbsent(int, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.Int2ObjectSortedMaps
Type: Class

Methods:
- Int2ObjectSortedMap singleton(Integer, Object)
- Int2ObjectSortedMap singleton(Integer, Object, IntComparator)
- Int2ObjectSortedMap singleton(int, Object)
- Int2ObjectSortedMap singleton(int, Object, IntComparator)
- Comparator entryComparator(IntComparator)
- Int2ObjectSortedMap unmodifiable(Int2ObjectSortedMap)
- Int2ObjectSortedMap emptyMap()
- ObjectBidirectionalIterable fastIterable(Int2ObjectSortedMap)
- ObjectBidirectionalIterator fastIterator(Int2ObjectSortedMap)
- Int2ObjectSortedMap synchronize(Int2ObjectSortedMap)
- Int2ObjectSortedMap synchronize(Int2ObjectSortedMap, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntArrayList
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntList
Implements: java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable

Methods:
- int compareTo(IntArrayList)
- int compareTo(List)
- int compareTo(Object)
- IntArrayList toList(IntStream)
- boolean removeAll(IntCollection)
- void trim()
- void trim(int)
- void addElements(int, int[], int, int)
- IntArrayList of()
- IntArrayList of(int[])
- int[] toArray(int[])
- boolean rem(int)
- IntArrayList toListWithExpectedSize(IntStream, int)
- int indexOf(int)
- void add(int, int)
- boolean add(int)
- IntList subList(int, int)
- List subList(int, int)
- int set(int, int)
- int removeInt(int)
- IntSpliterator spliterator()
- Spliterator spliterator()
- void forEach(IntConsumer)
- boolean isEmpty()
- void clear()
- void setElements(int, int[], int, int)
- void sort(IntComparator)
- void removeElements(int, int)
- boolean removeIf(IntPredicate)
- int lastIndexOf(int)
- int getInt(int)
- int size()
- void size(int)
- boolean addAll(int, IntCollection)
- boolean addAll(int, IntList)
- boolean equals(IntArrayList)
- boolean equals(Object)
- void getElements(int, int[], int, int)
- int[] elements()
- IntArrayList clone()
- Object clone() throws CloneNotSupportedException
- IntListIterator listIterator(int)
- ListIterator listIterator(int)
- void ensureCapacity(int)
- IntArrayList wrap(int[], int)
- IntArrayList wrap(int[])
- void unstableSort(IntComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntArraySet
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntSet
Implements: java.io.Serializable, java.lang.Cloneable

Methods:
- boolean add(int)
- IntSpliterator spliterator()
- Spliterator spliterator()
- boolean isEmpty()
- void clear()
- boolean remove(int)
- boolean contains(int)
- IntIterator iterator()
- Iterator iterator()
- IntArraySet ofUnchecked()
- IntArraySet ofUnchecked(int[])
- int size()
- int[] toIntArray()
- IntArraySet of()
- IntArraySet of(int)
- IntArraySet of(int[])
- IntArraySet clone()
- Object clone() throws CloneNotSupportedException
- int[] toArray(int[])

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntArrays
Type: Class

Methods:
- int binarySearch(int[], int, int, int)
- int binarySearch(int[], int)
- int binarySearch(int[], int, int, int, IntComparator)
- int binarySearch(int[], int, IntComparator)
- void ensureFromTo(int[], int, int)
- void mergeSort(int[], int, int, int[])
- void mergeSort(int[], int, int)
- void mergeSort(int[])
- void mergeSort(int[], int, int, IntComparator, int[])
- void mergeSort(int[], int, int, IntComparator)
- void mergeSort(int[], IntComparator)
- int[] forceCapacity(int[], int, int)
- void radixSortIndirect(int[], int[], boolean)
- void radixSortIndirect(int[], int[], int, int, boolean)
- void radixSortIndirect(int[], int[], int[], boolean)
- void radixSortIndirect(int[], int[], int[], int, int, boolean)
- void stableSort(int[], int, int)
- void stableSort(int[])
- void stableSort(int[], int, int, IntComparator)
- void stableSort(int[], IntComparator)
- int[] trim(int[], int)
- void parallelQuickSort(int[], int, int, IntComparator)
- void parallelQuickSort(int[], IntComparator)
- void parallelQuickSort(int[], int, int)
- void parallelQuickSort(int[])
- void parallelQuickSort(int[], int[], int, int)
- void parallelQuickSort(int[], int[])
- int[] copy(int[], int, int)
- int[] copy(int[])
- void ensureSameLength(int[], int[])
- int[] grow(int[], int)
- int[] grow(int[], int, int)
- void parallelRadixSort(int[], int, int)
- void parallelRadixSort(int[])
- void parallelRadixSort(int[], int[], int, int)
- void parallelRadixSort(int[], int[])
- void swap(int[], int, int)
- void swap(int[], int, int, int)
- void parallelQuickSortIndirect(int[], int[], int, int)
- void parallelQuickSortIndirect(int[], int[])
- void ensureOffsetLength(int[], int, int)
- void radixSort(int[])
- void radixSort(int[], int, int)
- void radixSort(int[], int[])
- void radixSort(int[], int[], int, int)
- void radixSort(int[][])
- void radixSort(int[][], int, int)
- int[] reverse(int[])
- int[] reverse(int[], int, int)
- void quickSort(int[], int, int, IntComparator)
- void quickSort(int[], IntComparator)
- void quickSort(int[], int, int)
- void quickSort(int[])
- void quickSort(int[], int[], int, int)
- void quickSort(int[], int[])
- void fill(int[], int)
- void fill(int[], int, int, int)
- int[] setLength(int[], int)
- void quickSortIndirect(int[], int[], int, int)
- void quickSortIndirect(int[], int[])
- boolean equals(int[], int[])
- void stabilize(int[], int[], int, int)
- void stabilize(int[], int[])
- void parallelRadixSortIndirect(int[], int[], int, int, boolean)
- void parallelRadixSortIndirect(int[], int[], boolean)
- int[] ensureCapacity(int[], int)
- int[] ensureCapacity(int[], int, int)
- int[] shuffle(int[], int, int, Random)
- int[] shuffle(int[], Random)
- void unstableSort(int[], int, int)
- void unstableSort(int[])
- void unstableSort(int[], int, int, IntComparator)
- void unstableSort(int[], IntComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntBigArrays
Type: Class

Methods:
- void mul(int[][], long, int)
- long binarySearch(int[][], long, long, int)
- long binarySearch(int[][], int)
- long binarySearch(int[][], long, long, int, IntComparator)
- long binarySearch(int[][], int, IntComparator)
- void ensureFromTo(int[][], long, long)
- int[][] forceCapacity(int[][], long, long)
- void radixSortIndirect(long[][], int[][], int[][], boolean)
- void radixSortIndirect(long[][], int[][], int[][], long, long, boolean)
- int[][] trim(int[][], long)
- int get(int[][], long)
- void parallelQuickSort(int[][], long, long)
- void parallelQuickSort(int[][])
- void parallelQuickSort(int[][], long, long, IntComparator)
- void parallelQuickSort(int[][], IntComparator)
- void copy(int[][], long, int[][], long, long)
- int[][] copy(int[][], long, long)
- int[][] copy(int[][])
- void ensureSameLength(int[][], int[][])
- void decr(int[][], long)
- void add(int[][], long, int)
- int[][] grow(int[][], long)
- int[][] grow(int[][], long, long)
- void set(int[][], long, int)
- void incr(int[][], long)
- void swap(int[][], long, long)
- long length(int[][])
- void ensureOffsetLength(int[][], long, long)
- void radixSort(int[][])
- void radixSort(int[][], long, long)
- void radixSort(int[][], int[][])
- void radixSort(int[][], int[][], long, long)
- void quickSort(int[][], long, long, IntComparator)
- void quickSort(int[][], IntComparator)
- void quickSort(int[][], long, long)
- void quickSort(int[][])
- void fill(int[][], int)
- void fill(int[][], long, long, int)
- int[][] newBigArray(long)
- void copyToBig(int[], int, int[][], long, long)
- int[][] setLength(int[][], long)
- void copyFromBig(int[][], long, int[], int, int)
- boolean equals(int[][], int[][])
- AtomicIntegerArray[] newBigAtomicArray(long)
- String toString(int[][])
- int[][] ensureCapacity(int[][], long)
- int[][] ensureCapacity(int[][], long, long)
- int[][] shuffle(int[][], long, long, Random)
- int[][] shuffle(int[][], Random)
- int[][] wrap(int[])

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntCollections
Type: Class

Methods:
- IntCollection asCollection(IntIterable)
- IntCollection unmodifiable(IntCollection)
- IntCollection synchronize(IntCollection)
- IntCollection synchronize(IntCollection, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntComparators
Type: Class

Methods:
- IntComparator asIntComparator(Comparator)
- IntComparator oppositeComparator(IntComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntImmutableList
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.IntLists$ImmutableListBase
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntList, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable

Methods:
- IntList subList(int, int)
- List subList(int, int)
- IntSpliterator spliterator()
- Spliterator spliterator()
- void forEach(IntConsumer)
- boolean isEmpty()
- int compareTo(IntImmutableList)
- int compareTo(List)
- int compareTo(Object)
- IntImmutableList toList(IntStream)
- int lastIndexOf(int)
- int getInt(int)
- int size()
- boolean equals(IntImmutableList)
- boolean equals(Object)
- int[] toIntArray()
- void getElements(int, int[], int, int)
- IntImmutableList of()
- IntImmutableList of(int[])
- IntImmutableList clone()
- Object clone() throws CloneNotSupportedException
- int[] toArray(int[])
- IntListIterator listIterator(int)
- ListIterator listIterator(int)
- IntImmutableList toListWithExpectedSize(IntStream, int)
- int indexOf(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntIntImmutablePair
Type: Class
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntIntPair, java.io.Serializable

Methods:
- int rightInt()
- int leftInt()
- int hashCode()
- boolean equals(Object)
- IntIntImmutablePair of(int, int)
- String toString()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntIterators
Type: Class

Methods:
- boolean all(IntIterator, IntPredicate)
- IntListIterator singleton(int)
- IntIterator unmodifiable(IntIterator)
- IntBidirectionalIterator unmodifiable(IntBidirectionalIterator)
- IntListIterator unmodifiable(IntListIterator)
- int pour(IntIterator, IntCollection, int)
- int pour(IntIterator, IntCollection)
- IntList pour(IntIterator, int)
- IntList pour(IntIterator)
- IntIterator asIntIterator(Iterator)
- IntListIterator asIntIterator(ListIterator)
- IntIterator concat(IntIterator[])
- IntIterator concat(IntIterator[], int, int)
- IntListIterator fromTo(int, int)
- int indexOf(IntIterator, IntPredicate)
- boolean any(IntIterator, IntPredicate)
- int[][] unwrapBig(IntIterator, long)
- int[][] unwrapBig(IntIterator)
- IntListIterator wrap(int[], int, int)
- IntListIterator wrap(int[])
- IntIterator wrap(ByteIterator)
- IntIterator wrap(ShortIterator)
- IntIterator wrap(CharIterator)
- int unwrap(IntIterator, int[], int, int)
- int unwrap(IntIterator, int[])
- int[] unwrap(IntIterator, int)
- int[] unwrap(IntIterator)
- long unwrap(IntIterator, int[][], long, long)
- long unwrap(IntIterator, int[][])
- int unwrap(IntIterator, IntCollection, int)
- long unwrap(IntIterator, IntCollection)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntLists
Type: Class

Methods:
- IntList singleton(int)
- IntList singleton(Object)
- IntList emptyList()
- IntList unmodifiable(IntList)
- IntList shuffle(IntList, Random)
- IntList synchronize(IntList)
- IntList synchronize(IntList, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntObjectImmutablePair
Type: Class
Implements: com.sk89q.worldedit.bukkit.fastutil.ints.IntObjectPair, java.io.Serializable

Methods:
- int leftInt()
- int hashCode()
- boolean equals(Object)
- IntObjectImmutablePair of(int, Object)
- String toString()
- Object right()

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntOpenHashSet
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.ints.AbstractIntSet
Implements: java.io.Serializable, java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.Hash

Methods:
- boolean add(int)
- IntSpliterator spliterator()
- Spliterator spliterator()
- void forEach(IntConsumer)
- boolean isEmpty()
- void clear()
- IntOpenHashSet toSetWithExpectedSize(IntStream, int)
- boolean remove(int)
- IntOpenHashSet toSet(IntStream)
- IntIterator iterator()
- Iterator iterator()
- boolean contains(int)
- boolean trim()
- boolean trim(int)
- int size()
- boolean addAll(IntCollection)
- boolean addAll(Collection)
- int hashCode()
- IntOpenHashSet of()
- IntOpenHashSet of(int)
- IntOpenHashSet of(int, int)
- IntOpenHashSet of(int, int, int)
- IntOpenHashSet of(int[])
- IntOpenHashSet clone()
- Object clone() throws CloneNotSupportedException
- void ensureCapacity(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntSets
Type: Class

Methods:
- IntSet singleton(int)
- IntSet singleton(Integer)
- IntSet emptySet()
- IntSet unmodifiable(IntSet)
- IntSet from(int)
- IntSet to(int)
- IntSet fromTo(int, int)
- IntSet synchronize(IntSet)
- IntSet synchronize(IntSet, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntSortedSets
Type: Class

Methods:
- IntSortedSet singleton(int)
- IntSortedSet singleton(int, IntComparator)
- IntSortedSet singleton(Object)
- IntSortedSet singleton(Object, IntComparator)
- IntSortedSet unmodifiable(IntSortedSet)
- IntSortedSet synchronize(IntSortedSet)
- IntSortedSet synchronize(IntSortedSet, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.ints.IntSpliterators
Type: Class

Methods:
- IntSpliterator asSpliteratorFromSortedUnknownSize(IntIterator, int, IntComparator)
- IntSpliterator singleton(int)
- IntSpliterator singleton(int, IntComparator)
- IntSpliterator asIntSpliterator(Spliterator)
- IntSpliterator asIntSpliterator(Spliterator, IntComparator)
- IntSpliterator asSpliteratorUnknownSize(IntIterator, int)
- IntSpliterator asSpliteratorFromSorted(IntIterator, long, int, IntComparator)
- IntIterator asIterator(IntSpliterator)
- IntSpliterator wrapPreSorted(int[], int, int, int, IntComparator)
- IntSpliterator wrapPreSorted(int[], int, int, IntComparator)
- IntSpliterator wrapPreSorted(int[], IntComparator)
- IntSpliterator concat(IntSpliterator[])
- IntSpliterator concat(IntSpliterator[], int, int)
- void onEachMatching(IntSpliterator, IntPredicate, IntConsumer)
- IntSpliterator fromTo(int, int)
- IntSpliterator wrap(int[], int, int)
- IntSpliterator wrap(int[])
- IntSpliterator wrap(int[], int, int, int)
- IntSpliterator wrap(ByteSpliterator)
- IntSpliterator wrap(ShortSpliterator)
- IntSpliterator wrap(CharSpliterator)
- IntSpliterator asSpliterator(IntIterator, long, int)

## Package: com.sk89q.worldedit.bukkit.fastutil.longs

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2BooleanFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.LongPredicate

Methods:
- boolean getOrDefault(long, boolean)
- Boolean getOrDefault(Object, Boolean)
- Object getOrDefault(Object, Object)
- Long2ShortFunction andThenShort(Boolean2ShortFunction)
- Byte2BooleanFunction composeByte(Byte2LongFunction)
- Long2IntFunction andThenInt(Boolean2IntFunction)
- Reference2BooleanFunction composeReference(Reference2LongFunction)
- Function andThen(Function)
- boolean remove(long)
- Boolean remove(Object)
- Object remove(Object)
- boolean put(long, boolean)
- Boolean put(Long, Boolean)
- Object put(Object, Object)
- void defaultReturnValue(boolean)
- boolean defaultReturnValue()
- Long2DoubleFunction andThenDouble(Boolean2DoubleFunction)
- Long2ObjectFunction andThenObject(Boolean2ObjectFunction)
- boolean get(long)
- Boolean get(Object)
- Object get(Object)
- Long2LongFunction andThenLong(Boolean2LongFunction)
- Long2BooleanFunction composeLong(Long2LongFunction)
- Long2ByteFunction andThenByte(Boolean2ByteFunction)
- Long2FloatFunction andThenFloat(Boolean2FloatFunction)
- boolean test(long)
- boolean containsKey(long)
- boolean containsKey(Object)
- Int2BooleanFunction composeInt(Int2LongFunction)
- Float2BooleanFunction composeFloat(Float2LongFunction)
- Long2CharFunction andThenChar(Boolean2CharFunction)
- Object2BooleanFunction composeObject(Object2LongFunction)
- Function compose(Function)
- Short2BooleanFunction composeShort(Short2LongFunction)
- Long2ReferenceFunction andThenReference(Boolean2ReferenceFunction)
- Char2BooleanFunction composeChar(Char2LongFunction)
- Double2BooleanFunction composeDouble(Double2LongFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2ByteFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.LongToIntFunction

Methods:
- byte getOrDefault(long, byte)
- Byte getOrDefault(Object, Byte)
- Object getOrDefault(Object, Object)
- Long2ShortFunction andThenShort(Byte2ShortFunction)
- Byte2ByteFunction composeByte(Byte2LongFunction)
- Long2IntFunction andThenInt(Byte2IntFunction)
- Reference2ByteFunction composeReference(Reference2LongFunction)
- Function andThen(Function)
- byte remove(long)
- Byte remove(Object)
- Object remove(Object)
- byte put(long, byte)
- Byte put(Long, Byte)
- Object put(Object, Object)
- void defaultReturnValue(byte)
- byte defaultReturnValue()
- Long2DoubleFunction andThenDouble(Byte2DoubleFunction)
- Long2ObjectFunction andThenObject(Byte2ObjectFunction)
- byte get(long)
- Byte get(Object)
- Object get(Object)
- Long2LongFunction andThenLong(Byte2LongFunction)
- Long2ByteFunction composeLong(Long2LongFunction)
- Long2ByteFunction andThenByte(Byte2ByteFunction)
- Long2FloatFunction andThenFloat(Byte2FloatFunction)
- int applyAsInt(long)
- boolean containsKey(long)
- boolean containsKey(Object)
- Int2ByteFunction composeInt(Int2LongFunction)
- Float2ByteFunction composeFloat(Float2LongFunction)
- Long2CharFunction andThenChar(Byte2CharFunction)
- Object2ByteFunction composeObject(Object2LongFunction)
- Function compose(Function)
- Short2ByteFunction composeShort(Short2LongFunction)
- Long2ReferenceFunction andThenReference(Byte2ReferenceFunction)
- Char2ByteFunction composeChar(Char2LongFunction)
- Double2ByteFunction composeDouble(Double2LongFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2CharFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.LongToIntFunction

Methods:
- char getOrDefault(long, char)
- Character getOrDefault(Object, Character)
- Object getOrDefault(Object, Object)
- Long2ShortFunction andThenShort(Char2ShortFunction)
- Byte2CharFunction composeByte(Byte2LongFunction)
- Long2IntFunction andThenInt(Char2IntFunction)
- Reference2CharFunction composeReference(Reference2LongFunction)
- Function andThen(Function)
- char remove(long)
- Character remove(Object)
- Object remove(Object)
- char put(long, char)
- Character put(Long, Character)
- Object put(Object, Object)
- void defaultReturnValue(char)
- char defaultReturnValue()
- Long2DoubleFunction andThenDouble(Char2DoubleFunction)
- Long2ObjectFunction andThenObject(Char2ObjectFunction)
- char get(long)
- Character get(Object)
- Object get(Object)
- Long2LongFunction andThenLong(Char2LongFunction)
- Long2CharFunction composeLong(Long2LongFunction)
- Long2ByteFunction andThenByte(Char2ByteFunction)
- Long2FloatFunction andThenFloat(Char2FloatFunction)
- int applyAsInt(long)
- boolean containsKey(long)
- boolean containsKey(Object)
- Int2CharFunction composeInt(Int2LongFunction)
- Float2CharFunction composeFloat(Float2LongFunction)
- Long2CharFunction andThenChar(Char2CharFunction)
- Object2CharFunction composeObject(Object2LongFunction)
- Function compose(Function)
- Short2CharFunction composeShort(Short2LongFunction)
- Long2ReferenceFunction andThenReference(Char2ReferenceFunction)
- Char2CharFunction composeChar(Char2LongFunction)
- Double2CharFunction composeDouble(Double2LongFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2DoubleFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.LongToDoubleFunction

Methods:
- double getOrDefault(long, double)
- Double getOrDefault(Object, Double)
- Object getOrDefault(Object, Object)
- double applyAsDouble(long)
- Long2ShortFunction andThenShort(Double2ShortFunction)
- Byte2DoubleFunction composeByte(Byte2LongFunction)
- Long2IntFunction andThenInt(Double2IntFunction)
- Reference2DoubleFunction composeReference(Reference2LongFunction)
- Function andThen(Function)
- double remove(long)
- Double remove(Object)
- Object remove(Object)
- double put(long, double)
- Double put(Long, Double)
- Object put(Object, Object)
- void defaultReturnValue(double)
- double defaultReturnValue()
- Long2DoubleFunction andThenDouble(Double2DoubleFunction)
- Long2ObjectFunction andThenObject(Double2ObjectFunction)
- double get(long)
- Double get(Object)
- Object get(Object)
- Long2LongFunction andThenLong(Double2LongFunction)
- Long2DoubleFunction composeLong(Long2LongFunction)
- Long2ByteFunction andThenByte(Double2ByteFunction)
- Long2FloatFunction andThenFloat(Double2FloatFunction)
- boolean containsKey(long)
- boolean containsKey(Object)
- Int2DoubleFunction composeInt(Int2LongFunction)
- Float2DoubleFunction composeFloat(Float2LongFunction)
- Long2CharFunction andThenChar(Double2CharFunction)
- Object2DoubleFunction composeObject(Object2LongFunction)
- Function compose(Function)
- Short2DoubleFunction composeShort(Short2LongFunction)
- Long2ReferenceFunction andThenReference(Double2ReferenceFunction)
- Char2DoubleFunction composeChar(Char2LongFunction)
- Double2DoubleFunction composeDouble(Double2LongFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2FloatFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.LongToDoubleFunction

Methods:
- float getOrDefault(long, float)
- Float getOrDefault(Object, Float)
- Object getOrDefault(Object, Object)
- double applyAsDouble(long)
- Long2ShortFunction andThenShort(Float2ShortFunction)
- Byte2FloatFunction composeByte(Byte2LongFunction)
- Long2IntFunction andThenInt(Float2IntFunction)
- Reference2FloatFunction composeReference(Reference2LongFunction)
- Function andThen(Function)
- float remove(long)
- Float remove(Object)
- Object remove(Object)
- float put(long, float)
- Float put(Long, Float)
- Object put(Object, Object)
- void defaultReturnValue(float)
- float defaultReturnValue()
- Long2DoubleFunction andThenDouble(Float2DoubleFunction)
- Long2ObjectFunction andThenObject(Float2ObjectFunction)
- float get(long)
- Float get(Object)
- Object get(Object)
- Long2LongFunction andThenLong(Float2LongFunction)
- Long2FloatFunction composeLong(Long2LongFunction)
- Long2ByteFunction andThenByte(Float2ByteFunction)
- Long2FloatFunction andThenFloat(Float2FloatFunction)
- boolean containsKey(long)
- boolean containsKey(Object)
- Int2FloatFunction composeInt(Int2LongFunction)
- Float2FloatFunction composeFloat(Float2LongFunction)
- Long2CharFunction andThenChar(Float2CharFunction)
- Object2FloatFunction composeObject(Object2LongFunction)
- Function compose(Function)
- Short2FloatFunction composeShort(Short2LongFunction)
- Long2ReferenceFunction andThenReference(Float2ReferenceFunction)
- Char2FloatFunction composeChar(Char2LongFunction)
- Double2FloatFunction composeDouble(Double2LongFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2IntFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.LongToIntFunction

Methods:
- int getOrDefault(long, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- Long2ShortFunction andThenShort(Int2ShortFunction)
- Byte2IntFunction composeByte(Byte2LongFunction)
- Long2IntFunction andThenInt(Int2IntFunction)
- Reference2IntFunction composeReference(Reference2LongFunction)
- Function andThen(Function)
- int remove(long)
- Integer remove(Object)
- Object remove(Object)
- int put(long, int)
- Integer put(Long, Integer)
- Object put(Object, Object)
- void defaultReturnValue(int)
- int defaultReturnValue()
- Long2DoubleFunction andThenDouble(Int2DoubleFunction)
- Long2ObjectFunction andThenObject(Int2ObjectFunction)
- int get(long)
- Integer get(Object)
- Object get(Object)
- Long2LongFunction andThenLong(Int2LongFunction)
- Long2IntFunction composeLong(Long2LongFunction)
- Long2ByteFunction andThenByte(Int2ByteFunction)
- Long2FloatFunction andThenFloat(Int2FloatFunction)
- int applyAsInt(long)
- boolean containsKey(long)
- boolean containsKey(Object)
- Int2IntFunction composeInt(Int2LongFunction)
- Float2IntFunction composeFloat(Float2LongFunction)
- Long2CharFunction andThenChar(Int2CharFunction)
- Object2IntFunction composeObject(Object2LongFunction)
- Function compose(Function)
- Short2IntFunction composeShort(Short2LongFunction)
- Long2ReferenceFunction andThenReference(Int2ReferenceFunction)
- Char2IntFunction composeChar(Char2LongFunction)
- Double2IntFunction composeDouble(Double2LongFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2LongFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.LongUnaryOperator

Methods:
- long getOrDefault(long, long)
- Long getOrDefault(Object, Long)
- Object getOrDefault(Object, Object)
- Long2ShortFunction andThenShort(Long2ShortFunction)
- Byte2LongFunction composeByte(Byte2LongFunction)
- Long2IntFunction andThenInt(Long2IntFunction)
- Reference2LongFunction composeReference(Reference2LongFunction)
- Function andThen(Function)
- long remove(long)
- Long remove(Object)
- Object remove(Object)
- long put(long, long)
- Long put(Long, Long)
- Object put(Object, Object)
- void defaultReturnValue(long)
- long defaultReturnValue()
- Long2DoubleFunction andThenDouble(Long2DoubleFunction)
- Long2ObjectFunction andThenObject(Long2ObjectFunction)
- Long2LongFunction identity()
- long get(long)
- Long get(Object)
- Object get(Object)
- Long2LongFunction andThenLong(Long2LongFunction)
- Long2LongFunction composeLong(Long2LongFunction)
- Long2ByteFunction andThenByte(Long2ByteFunction)
- Long2FloatFunction andThenFloat(Long2FloatFunction)
- boolean containsKey(long)
- boolean containsKey(Object)
- Int2LongFunction composeInt(Int2LongFunction)
- Float2LongFunction composeFloat(Float2LongFunction)
- Long2CharFunction andThenChar(Long2CharFunction)
- long applyAsLong(long)
- Object2LongFunction composeObject(Object2LongFunction)
- Function compose(Function)
- Short2LongFunction composeShort(Short2LongFunction)
- Long2ReferenceFunction andThenReference(Long2ReferenceFunction)
- Char2LongFunction composeChar(Char2LongFunction)
- Double2LongFunction composeDouble(Double2LongFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2ObjectFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.LongFunction

Methods:
- Object getOrDefault(long, Object)
- Object getOrDefault(Object, Object)
- Long2ShortFunction andThenShort(Object2ShortFunction)
- Byte2ObjectFunction composeByte(Byte2LongFunction)
- Long2IntFunction andThenInt(Object2IntFunction)
- Reference2ObjectFunction composeReference(Reference2LongFunction)
- Object remove(long)
- Object remove(Object)
- Object put(long, Object)
- Object put(Long, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Long2DoubleFunction andThenDouble(Object2DoubleFunction)
- Long2ObjectFunction andThenObject(Object2ObjectFunction)
- Object get(long)
- Object get(Object)
- Long2LongFunction andThenLong(Object2LongFunction)
- Long2ObjectFunction composeLong(Long2LongFunction)
- Long2ByteFunction andThenByte(Object2ByteFunction)
- Long2FloatFunction andThenFloat(Object2FloatFunction)
- Object apply(long)
- boolean containsKey(long)
- boolean containsKey(Object)
- Int2ObjectFunction composeInt(Int2LongFunction)
- Float2ObjectFunction composeFloat(Float2LongFunction)
- Long2CharFunction andThenChar(Object2CharFunction)
- Object2ObjectFunction composeObject(Object2LongFunction)
- Function compose(Function)
- Short2ObjectFunction composeShort(Short2LongFunction)
- Long2ReferenceFunction andThenReference(Object2ReferenceFunction)
- Char2ObjectFunction composeChar(Char2LongFunction)
- Double2ObjectFunction composeDouble(Double2LongFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2ObjectMap
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.Long2ObjectFunction, java.util.Map

Methods:
- ObjectSet long2ObjectEntrySet()
- Object getOrDefault(long, Object)
- Object getOrDefault(Object, Object)
- ObjectSet entrySet()
- Set entrySet()
- void forEach(BiConsumer)
- boolean containsKey(long)
- boolean containsKey(Object)
- Object computeIfAbsent(long, LongFunction)
- Object computeIfAbsent(long, Long2ObjectFunction)
- ObjectCollection values()
- Collection values()
- boolean replace(long, Object, Object)
- Object replace(long, Object)
- void clear()
- Object computeIfAbsentPartial(long, Long2ObjectFunction)
- Object remove(Object)
- boolean remove(long, Object)
- Object put(Long, Object)
- Object put(Object, Object)
- Object compute(long, BiFunction)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Object computeIfPresent(long, BiFunction)
- int size()
- Object merge(long, Object, BiFunction)
- Object get(Object)
- Object putIfAbsent(long, Object)
- LongSet keySet()
- Set keySet()

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2ReferenceFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.LongFunction

Methods:
- Object getOrDefault(long, Object)
- Object getOrDefault(Object, Object)
- Long2ShortFunction andThenShort(Reference2ShortFunction)
- Byte2ReferenceFunction composeByte(Byte2LongFunction)
- Long2IntFunction andThenInt(Reference2IntFunction)
- Reference2ReferenceFunction composeReference(Reference2LongFunction)
- Object remove(long)
- Object remove(Object)
- Object put(long, Object)
- Object put(Long, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Long2DoubleFunction andThenDouble(Reference2DoubleFunction)
- Long2ObjectFunction andThenObject(Reference2ObjectFunction)
- Object get(long)
- Object get(Object)
- Long2LongFunction andThenLong(Reference2LongFunction)
- Long2ReferenceFunction composeLong(Long2LongFunction)
- Long2ByteFunction andThenByte(Reference2ByteFunction)
- Long2FloatFunction andThenFloat(Reference2FloatFunction)
- Object apply(long)
- boolean containsKey(long)
- boolean containsKey(Object)
- Int2ReferenceFunction composeInt(Int2LongFunction)
- Float2ReferenceFunction composeFloat(Float2LongFunction)
- Long2CharFunction andThenChar(Reference2CharFunction)
- Object2ReferenceFunction composeObject(Object2LongFunction)
- Function compose(Function)
- Short2ReferenceFunction composeShort(Short2LongFunction)
- Long2ReferenceFunction andThenReference(Reference2ReferenceFunction)
- Char2ReferenceFunction composeChar(Char2LongFunction)
- Double2ReferenceFunction composeDouble(Double2LongFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2ShortFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.LongToIntFunction

Methods:
- short getOrDefault(long, short)
- Short getOrDefault(Object, Short)
- Object getOrDefault(Object, Object)
- Long2ShortFunction andThenShort(Short2ShortFunction)
- Byte2ShortFunction composeByte(Byte2LongFunction)
- Long2IntFunction andThenInt(Short2IntFunction)
- Reference2ShortFunction composeReference(Reference2LongFunction)
- Function andThen(Function)
- short remove(long)
- Short remove(Object)
- Object remove(Object)
- short put(long, short)
- Short put(Long, Short)
- Object put(Object, Object)
- void defaultReturnValue(short)
- short defaultReturnValue()
- Long2DoubleFunction andThenDouble(Short2DoubleFunction)
- Long2ObjectFunction andThenObject(Short2ObjectFunction)
- short get(long)
- Short get(Object)
- Object get(Object)
- Long2LongFunction andThenLong(Short2LongFunction)
- Long2ShortFunction composeLong(Long2LongFunction)
- Long2ByteFunction andThenByte(Short2ByteFunction)
- Long2FloatFunction andThenFloat(Short2FloatFunction)
- int applyAsInt(long)
- boolean containsKey(long)
- boolean containsKey(Object)
- Int2ShortFunction composeInt(Int2LongFunction)
- Float2ShortFunction composeFloat(Float2LongFunction)
- Long2CharFunction andThenChar(Short2CharFunction)
- Object2ShortFunction composeObject(Object2LongFunction)
- Function compose(Function)
- Short2ShortFunction composeShort(Short2LongFunction)
- Long2ReferenceFunction andThenReference(Short2ReferenceFunction)
- Char2ShortFunction composeChar(Char2LongFunction)
- Double2ShortFunction composeDouble(Double2LongFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongBidirectionalIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.LongIterator, com.sk89q.worldedit.bukkit.fastutil.objects.ObjectBidirectionalIterator

Methods:
- long previousLong()
- Long previous()
- Object previous()
- int back(int)
- int skip(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongBigListIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.LongBidirectionalIterator, com.sk89q.worldedit.bukkit.fastutil.BigListIterator

Methods:
- void add(long)
- void add(Long)
- void add(Object)
- void set(long)
- void set(Long)
- void set(Object)
- long back(long)
- long skip(long)
- int skip(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongCollection
Type: Interface
Implements: java.util.Collection, com.sk89q.worldedit.bukkit.fastutil.longs.LongIterable

Methods:
- boolean add(long)
- boolean add(Long)
- boolean add(Object)
- LongSpliterator longSpliterator()
- LongIterator longIterator()
- long[] toLongArray()
- long[] toLongArray(long[])
- LongSpliterator spliterator()
- Spliterator spliterator()
- boolean containsAll(LongCollection)
- boolean remove(Object)
- LongStream longParallelStream()
- boolean removeIf(Predicate)
- boolean removeIf(LongPredicate)
- boolean removeIf(LongPredicate)
- boolean removeAll(LongCollection)
- boolean contains(long)
- boolean contains(Object)
- LongIterator iterator()
- Iterator iterator()
- Stream stream()
- boolean addAll(LongCollection)
- long[] toArray(long[])
- LongStream longStream()
- Stream parallelStream()
- boolean rem(long)
- boolean retainAll(LongCollection)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongComparator
Type: Interface
Implements: java.util.Comparator

Methods:
- LongComparator comparingDouble(Long2DoubleFunction)
- int compare(long, long)
- int compare(Long, Long)
- int compare(Object, Object)
- LongComparator comparingLong(Long2LongFunction)
- LongComparator thenComparing(LongComparator)
- Comparator thenComparing(Comparator)
- LongComparator comparingInt(Long2IntFunction)
- LongComparator comparing(Long2ObjectFunction)
- LongComparator comparing(Long2ObjectFunction, Comparator)
- LongComparator reversed()
- Comparator reversed()

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongConsumer
Type: Interface
Implements: java.util.function.Consumer, java.util.function.LongConsumer

Methods:
- LongConsumer andThen(LongConsumer)
- LongConsumer andThen(LongConsumer)
- Consumer andThen(Consumer)
- LongConsumer andThen(LongConsumer)
- void accept(Long)
- void accept(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongIterable
Type: Interface
Implements: java.lang.Iterable

Methods:
- LongSpliterator longSpliterator()
- LongIterator longIterator()
- LongIterator iterator()
- Iterator iterator()
- LongSpliterator spliterator()
- Spliterator spliterator()
- void forEach(LongConsumer)
- void forEach(LongConsumer)
- void forEach(Consumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongIterator
Type: Interface
Implements: java.util.PrimitiveIterator$OfLong

Methods:
- Long next()
- Object next()
- int skip(int)
- void forEachRemaining(LongConsumer)
- void forEachRemaining(Consumer)
- long nextLong()

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongList
Type: Interface
Implements: java.util.List, java.lang.Comparable, com.sk89q.worldedit.bukkit.fastutil.longs.LongCollection

Methods:
- boolean add(long)
- void add(int, long)
- void add(int, Long)
- boolean add(Long)
- void add(int, Object)
- boolean add(Object)
- LongList subList(int, int)
- List subList(int, int)
- long set(int, long)
- Long set(int, Long)
- Object set(int, Object)
- LongSpliterator spliterator()
- Spliterator spliterator()
- void setElements(long[])
- void setElements(int, long[])
- void setElements(int, long[], int, int)
- void sort(Comparator)
- void sort(LongComparator)
- void removeElements(int, int)
- void replaceAll(LongUnaryOperator)
- void replaceAll(LongUnaryOperator)
- void replaceAll(UnaryOperator)
- boolean remove(Object)
- Long remove(int)
- Object remove(int)
- long getLong(int)
- int lastIndexOf(long)
- int lastIndexOf(Object)
- boolean contains(Object)
- LongListIterator iterator()
- Iterator iterator()
- LongIterator iterator()
- void size(int)
- boolean addAll(int, LongCollection)
- boolean addAll(int, LongList)
- boolean addAll(LongList)
- void addElements(int, long[])
- void addElements(int, long[], int, int)
- LongList of()
- LongList of(long)
- LongList of(long, long)
- LongList of(long, long, long)
- LongList of(long[])
- long removeLong(int)
- Long get(int)
- Object get(int)
- void getElements(int, long[], int, int)
- LongListIterator listIterator()
- LongListIterator listIterator(int)
- ListIterator listIterator(int)
- ListIterator listIterator()
- int indexOf(long)
- int indexOf(Object)
- void unstableSort(Comparator)
- void unstableSort(LongComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongListIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.LongBidirectionalIterator, java.util.ListIterator

Methods:
- Long next()
- Object next()
- void add(long)
- void add(Long)
- void add(Object)
- void set(long)
- void set(Long)
- void set(Object)
- Long previous()
- Object previous()
- void remove()

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongObjectPair
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Pair

Methods:
- Long left()
- LongObjectPair left(long)
- LongObjectPair left(Long)
- Pair left(Object)
- Object left()
- long firstLong()
- LongObjectPair of(long, Object)
- long keyLong()
- long leftLong()
- Comparator lexComparator()
- Long key()
- LongObjectPair key(long)
- LongObjectPair key(Long)
- Object key()
- Pair key(Object)
- Long first()
- LongObjectPair first(long)
- LongObjectPair first(Long)
- Pair first(Object)
- Object first()

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongPredicate
Type: Interface
Implements: java.util.function.Predicate, java.util.function.LongPredicate

Methods:
- LongPredicate or(LongPredicate)
- LongPredicate or(LongPredicate)
- Predicate or(Predicate)
- LongPredicate or(LongPredicate)
- boolean test(Long)
- boolean test(Object)
- LongPredicate negate()
- Predicate negate()
- LongPredicate negate()
- LongPredicate and(LongPredicate)
- LongPredicate and(LongPredicate)
- Predicate and(Predicate)
- LongPredicate and(LongPredicate)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongSet
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.LongCollection, java.util.Set

Methods:
- boolean add(Long)
- boolean add(Object)
- boolean contains(Object)
- LongIterator iterator()
- Iterator iterator()
- LongSpliterator spliterator()
- Spliterator spliterator()
- LongSet of()
- LongSet of(long)
- LongSet of(long, long)
- LongSet of(long, long, long)
- LongSet of(long[])
- boolean rem(long)
- boolean remove(long)
- boolean remove(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongSpliterator
Type: Interface
Implements: java.util.Spliterator$OfLong

Methods:
- LongSpliterator trySplit()
- Spliterator$OfLong trySplit()
- Spliterator$OfPrimitive trySplit()
- Spliterator trySplit()
- boolean tryAdvance(Consumer)
- boolean tryAdvance(LongConsumer)
- LongComparator getComparator()
- Comparator getComparator()
- long skip(long)
- void forEachRemaining(Consumer)
- void forEachRemaining(LongConsumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongStack
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Stack

Methods:
- Long pop()
- Object pop()
- Long top()
- Object top()
- long topLong()
- long peekLong(int)
- void push(long)
- void push(Long)
- void push(Object)
- Long peek(int)
- Object peek(int)
- long popLong()

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongUnaryOperator
Type: Interface
Implements: java.util.function.UnaryOperator, java.util.function.LongUnaryOperator

Methods:
- long applyAsLong(long)
- LongUnaryOperator negation()
- long apply(long)
- Long apply(Long)
- Object apply(Object)
- LongUnaryOperator identity()

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLong2ObjectFunction
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.Long2ObjectFunction, java.io.Serializable

Methods:
- void defaultReturnValue(Object)
- Object defaultReturnValue()

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLong2ObjectMap
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLong2ObjectFunction
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.Long2ObjectMap, java.io.Serializable

Methods:
- int hashCode()
- boolean containsKey(long)
- boolean equals(Object)
- void putAll(Map)
- ObjectCollection values()
- Collection values()
- boolean isEmpty()
- String toString()
- LongSet keySet()
- Set keySet()
- boolean containsValue(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLongCollection
Type: Abstract Class
Extends: java.util.AbstractCollection
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.LongCollection

Methods:
- boolean add(long)
- boolean add(Long)
- boolean add(Object)
- long[] toLongArray()
- long[] toLongArray(long[])
- void forEach(LongConsumer)
- boolean containsAll(LongCollection)
- boolean containsAll(Collection)
- boolean remove(Object)
- boolean removeIf(LongPredicate)
- boolean removeAll(LongCollection)
- boolean removeAll(Collection)
- boolean contains(long)
- boolean contains(Object)
- LongIterator iterator()
- Iterator iterator()
- boolean addAll(LongCollection)
- boolean addAll(Collection)
- long[] toArray(long[])
- String toString()
- boolean rem(long)
- boolean retainAll(LongCollection)
- boolean retainAll(Collection)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLongIterator
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.LongIterator

Methods:
- void forEachRemaining(LongConsumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLongList
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLongCollection
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.LongList, com.sk89q.worldedit.bukkit.fastutil.longs.LongStack

Methods:
- int compareTo(List)
- int compareTo(Object)
- void replaceAll(LongUnaryOperator)
- long peekLong(int)
- LongListIterator iterator()
- LongIterator iterator()
- Iterator iterator()
- int hashCode()
- void addElements(int, long[], int, int)
- void addElements(int, long[])
- long removeLong(int)
- long[] toArray(long[])
- boolean rem(long)
- int indexOf(long)
- long popLong()
- void add(int, long)
- boolean add(long)
- LongList subList(int, int)
- List subList(int, int)
- long set(int, long)
- long[] toLongArray()
- void forEach(LongConsumer)
- void clear()
- void setElements(int, long[], int, int)
- void removeElements(int, int)
- void push(long)
- int lastIndexOf(long)
- boolean contains(long)
- void size(int)
- boolean addAll(int, Collection)
- boolean addAll(Collection)
- boolean addAll(int, LongCollection)
- boolean addAll(LongCollection)
- boolean equals(Object)
- void getElements(int, long[], int, int)
- LongListIterator listIterator()
- LongListIterator listIterator(int)
- ListIterator listIterator(int)
- ListIterator listIterator()
- String toString()
- long topLong()

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLongSet
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLongCollection
Implements: java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.longs.LongSet

Methods:
- LongIterator iterator()
- Iterator iterator()
- int hashCode()
- boolean equals(Object)
- boolean rem(long)
- boolean remove(long)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLongSpliterator
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.LongSpliterator

Methods:
- boolean tryAdvance(LongConsumer)
- void forEachRemaining(LongConsumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2ObjectFunctions
Type: Class

Methods:
- Long2ObjectFunction singleton(long, Object)
- Long2ObjectFunction singleton(Long, Object)
- Long2ObjectFunction unmodifiable(Long2ObjectFunction)
- Long2ObjectFunction primitive(Function)
- Long2ObjectFunction synchronize(Long2ObjectFunction)
- Long2ObjectFunction synchronize(Long2ObjectFunction, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2ObjectMaps
Type: Class

Methods:
- Long2ObjectMap singleton(long, Object)
- Long2ObjectMap singleton(Long, Object)
- void fastForEach(Long2ObjectMap, Consumer)
- Long2ObjectMap unmodifiable(Long2ObjectMap)
- Long2ObjectMap emptyMap()
- ObjectIterable fastIterable(Long2ObjectMap)
- ObjectIterator fastIterator(Long2ObjectMap)
- Long2ObjectMap synchronize(Long2ObjectMap)
- Long2ObjectMap synchronize(Long2ObjectMap, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.Long2ObjectOpenHashMap
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLong2ObjectMap
Implements: java.io.Serializable, java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.Hash

Methods:
- Long2ObjectMap$FastEntrySet long2ObjectEntrySet()
- ObjectSet long2ObjectEntrySet()
- Object getOrDefault(long, Object)
- boolean containsKey(long)
- ObjectCollection values()
- Collection values()
- Object computeIfAbsent(long, LongFunction)
- Object computeIfAbsent(long, Long2ObjectFunction)
- boolean isEmpty()
- void clear()
- boolean replace(long, Object, Object)
- Object replace(long, Object)
- boolean containsValue(Object)
- Object remove(long)
- boolean remove(long, Object)
- Object put(long, Object)
- Object compute(long, BiFunction)
- Object computeIfPresent(long, BiFunction)
- boolean trim()
- boolean trim(int)
- int size()
- int hashCode()
- Object merge(long, Object, BiFunction)
- Object get(long)
- void putAll(Map)
- Long2ObjectOpenHashMap clone()
- Object clone() throws CloneNotSupportedException
- void ensureCapacity(int)
- LongSet keySet()
- Set keySet()
- Object putIfAbsent(long, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongArrayList
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLongList
Implements: java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable

Methods:
- int compareTo(LongArrayList)
- int compareTo(List)
- int compareTo(Object)
- LongArrayList toList(LongStream)
- boolean removeAll(LongCollection)
- void trim()
- void trim(int)
- void addElements(int, long[], int, int)
- long removeLong(int)
- LongArrayList of()
- LongArrayList of(long[])
- long[] toArray(long[])
- boolean rem(long)
- LongArrayList toListWithExpectedSize(LongStream, int)
- int indexOf(long)
- void add(int, long)
- boolean add(long)
- LongList subList(int, int)
- List subList(int, int)
- long set(int, long)
- LongSpliterator spliterator()
- Spliterator spliterator()
- void forEach(LongConsumer)
- boolean isEmpty()
- void clear()
- void setElements(int, long[], int, int)
- void sort(LongComparator)
- void removeElements(int, int)
- boolean removeIf(LongPredicate)
- long getLong(int)
- int lastIndexOf(long)
- int size()
- void size(int)
- boolean addAll(int, LongCollection)
- boolean addAll(int, LongList)
- boolean equals(LongArrayList)
- boolean equals(Object)
- void getElements(int, long[], int, int)
- long[] elements()
- LongArrayList clone()
- Object clone() throws CloneNotSupportedException
- LongListIterator listIterator(int)
- ListIterator listIterator(int)
- void ensureCapacity(int)
- LongArrayList wrap(long[], int)
- LongArrayList wrap(long[])
- void unstableSort(LongComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongArraySet
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLongSet
Implements: java.io.Serializable, java.lang.Cloneable

Methods:
- boolean add(long)
- long[] toLongArray()
- LongSpliterator spliterator()
- Spliterator spliterator()
- boolean isEmpty()
- void clear()
- boolean remove(long)
- boolean contains(long)
- LongIterator iterator()
- Iterator iterator()
- LongArraySet ofUnchecked()
- LongArraySet ofUnchecked(long[])
- int size()
- LongArraySet of()
- LongArraySet of(long)
- LongArraySet of(long[])
- LongArraySet clone()
- Object clone() throws CloneNotSupportedException
- long[] toArray(long[])

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongArrays
Type: Class

Methods:
- int binarySearch(long[], int, int, long)
- int binarySearch(long[], long)
- int binarySearch(long[], int, int, long, LongComparator)
- int binarySearch(long[], long, LongComparator)
- void ensureFromTo(long[], int, int)
- void mergeSort(long[], int, int, long[])
- void mergeSort(long[], int, int)
- void mergeSort(long[])
- void mergeSort(long[], int, int, LongComparator, long[])
- void mergeSort(long[], int, int, LongComparator)
- void mergeSort(long[], LongComparator)
- long[] forceCapacity(long[], int, int)
- void radixSortIndirect(int[], long[], boolean)
- void radixSortIndirect(int[], long[], int, int, boolean)
- void radixSortIndirect(int[], long[], long[], boolean)
- void radixSortIndirect(int[], long[], long[], int, int, boolean)
- void stableSort(long[], int, int)
- void stableSort(long[])
- void stableSort(long[], int, int, LongComparator)
- void stableSort(long[], LongComparator)
- long[] trim(long[], int)
- void parallelQuickSort(long[], int, int, LongComparator)
- void parallelQuickSort(long[], LongComparator)
- void parallelQuickSort(long[], int, int)
- void parallelQuickSort(long[])
- void parallelQuickSort(long[], long[], int, int)
- void parallelQuickSort(long[], long[])
- long[] copy(long[], int, int)
- long[] copy(long[])
- void ensureSameLength(long[], long[])
- long[] grow(long[], int)
- long[] grow(long[], int, int)
- void parallelRadixSort(long[], int, int)
- void parallelRadixSort(long[])
- void parallelRadixSort(long[], long[], int, int)
- void parallelRadixSort(long[], long[])
- void swap(long[], int, int)
- void swap(long[], int, int, int)
- void parallelQuickSortIndirect(int[], long[], int, int)
- void parallelQuickSortIndirect(int[], long[])
- void ensureOffsetLength(long[], int, int)
- void radixSort(long[])
- void radixSort(long[], int, int)
- void radixSort(long[], long[])
- void radixSort(long[], long[], int, int)
- void radixSort(long[][])
- void radixSort(long[][], int, int)
- long[] reverse(long[])
- long[] reverse(long[], int, int)
- void quickSort(long[], int, int, LongComparator)
- void quickSort(long[], LongComparator)
- void quickSort(long[], int, int)
- void quickSort(long[])
- void quickSort(long[], long[], int, int)
- void quickSort(long[], long[])
- void fill(long[], long)
- void fill(long[], int, int, long)
- long[] setLength(long[], int)
- void quickSortIndirect(int[], long[], int, int)
- void quickSortIndirect(int[], long[])
- boolean equals(long[], long[])
- void stabilize(int[], long[], int, int)
- void stabilize(int[], long[])
- void parallelRadixSortIndirect(int[], long[], int, int, boolean)
- void parallelRadixSortIndirect(int[], long[], boolean)
- long[] ensureCapacity(long[], int)
- long[] ensureCapacity(long[], int, int)
- long[] shuffle(long[], int, int, Random)
- long[] shuffle(long[], Random)
- void unstableSort(long[], int, int)
- void unstableSort(long[])
- void unstableSort(long[], int, int, LongComparator)
- void unstableSort(long[], LongComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongBigArrays
Type: Class

Methods:
- void mul(long[][], long, long)
- long binarySearch(long[][], long, long, long)
- long binarySearch(long[][], long)
- long binarySearch(long[][], long, long, long, LongComparator)
- long binarySearch(long[][], long, LongComparator)
- void ensureFromTo(long[][], long, long)
- long[][] forceCapacity(long[][], long, long)
- void radixSortIndirect(long[][], long[][], long[][], boolean)
- void radixSortIndirect(long[][], long[][], long[][], long, long, boolean)
- long[][] trim(long[][], long)
- long get(long[][], long)
- void parallelQuickSort(long[][], long, long)
- void parallelQuickSort(long[][])
- void parallelQuickSort(long[][], long, long, LongComparator)
- void parallelQuickSort(long[][], LongComparator)
- void copy(long[][], long, long[][], long, long)
- long[][] copy(long[][], long, long)
- long[][] copy(long[][])
- void ensureSameLength(long[][], long[][])
- void decr(long[][], long)
- void add(long[][], long, long)
- long[][] grow(long[][], long)
- long[][] grow(long[][], long, long)
- void set(long[][], long, long)
- void incr(long[][], long)
- void swap(long[][], long, long)
- long length(long[][])
- void ensureOffsetLength(long[][], long, long)
- void radixSort(long[][])
- void radixSort(long[][], long, long)
- void radixSort(long[][], long[][])
- void radixSort(long[][], long[][], long, long)
- void quickSort(long[][], long, long, LongComparator)
- void quickSort(long[][], LongComparator)
- void quickSort(long[][], long, long)
- void quickSort(long[][])
- void fill(long[][], long)
- void fill(long[][], long, long, long)
- long[][] newBigArray(long)
- void copyToBig(long[], int, long[][], long, long)
- long[][] setLength(long[][], long)
- void copyFromBig(long[][], long, long[], int, int)
- boolean equals(long[][], long[][])
- AtomicLongArray[] newBigAtomicArray(long)
- String toString(long[][])
- long[][] ensureCapacity(long[][], long)
- long[][] ensureCapacity(long[][], long, long)
- long[][] shuffle(long[][], long, long, Random)
- long[][] shuffle(long[][], Random)
- long[][] wrap(long[])

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongCollections
Type: Class

Methods:
- LongCollection asCollection(LongIterable)
- LongCollection unmodifiable(LongCollection)
- LongCollection synchronize(LongCollection)
- LongCollection synchronize(LongCollection, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongComparators
Type: Class

Methods:
- LongComparator oppositeComparator(LongComparator)
- LongComparator asLongComparator(Comparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongImmutableList
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.longs.LongLists$ImmutableListBase
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.LongList, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable

Methods:
- LongList subList(int, int)
- List subList(int, int)
- long[] toLongArray()
- LongSpliterator spliterator()
- Spliterator spliterator()
- void forEach(LongConsumer)
- boolean isEmpty()
- int compareTo(LongImmutableList)
- int compareTo(List)
- int compareTo(Object)
- LongImmutableList toList(LongStream)
- long getLong(int)
- int lastIndexOf(long)
- int size()
- boolean equals(LongImmutableList)
- boolean equals(Object)
- void getElements(int, long[], int, int)
- LongImmutableList of()
- LongImmutableList of(long[])
- LongImmutableList clone()
- Object clone() throws CloneNotSupportedException
- long[] toArray(long[])
- LongListIterator listIterator(int)
- ListIterator listIterator(int)
- LongImmutableList toListWithExpectedSize(LongStream, int)
- int indexOf(long)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongIterators
Type: Class

Methods:
- boolean all(LongIterator, LongPredicate)
- LongListIterator singleton(long)
- LongIterator unmodifiable(LongIterator)
- LongBidirectionalIterator unmodifiable(LongBidirectionalIterator)
- LongListIterator unmodifiable(LongListIterator)
- LongIterator asLongIterator(Iterator)
- LongListIterator asLongIterator(ListIterator)
- int pour(LongIterator, LongCollection, int)
- int pour(LongIterator, LongCollection)
- LongList pour(LongIterator, int)
- LongList pour(LongIterator)
- LongIterator concat(LongIterator[])
- LongIterator concat(LongIterator[], int, int)
- LongBidirectionalIterator fromTo(long, long)
- int indexOf(LongIterator, LongPredicate)
- boolean any(LongIterator, LongPredicate)
- long[][] unwrapBig(LongIterator, long)
- long[][] unwrapBig(LongIterator)
- LongListIterator wrap(long[], int, int)
- LongListIterator wrap(long[])
- LongIterator wrap(ByteIterator)
- LongIterator wrap(ShortIterator)
- LongIterator wrap(CharIterator)
- LongIterator wrap(IntIterator)
- int unwrap(LongIterator, long[], int, int)
- int unwrap(LongIterator, long[])
- long[] unwrap(LongIterator, int)
- long[] unwrap(LongIterator)
- long unwrap(LongIterator, long[][], long, long)
- long unwrap(LongIterator, long[][])
- int unwrap(LongIterator, LongCollection, int)
- long unwrap(LongIterator, LongCollection)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongLists
Type: Class

Methods:
- LongList singleton(long)
- LongList singleton(Object)
- LongList emptyList()
- LongList unmodifiable(LongList)
- LongList shuffle(LongList, Random)
- LongList synchronize(LongList)
- LongList synchronize(LongList, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongObjectImmutablePair
Type: Class
Implements: com.sk89q.worldedit.bukkit.fastutil.longs.LongObjectPair, java.io.Serializable

Methods:
- int hashCode()
- boolean equals(Object)
- LongObjectImmutablePair of(long, Object)
- String toString()
- long leftLong()
- Object right()

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongOpenHashSet
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.longs.AbstractLongSet
Implements: java.io.Serializable, java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.Hash

Methods:
- boolean add(long)
- LongSpliterator spliterator()
- Spliterator spliterator()
- void forEach(LongConsumer)
- boolean isEmpty()
- void clear()
- LongOpenHashSet toSetWithExpectedSize(LongStream, int)
- boolean remove(long)
- LongOpenHashSet toSet(LongStream)
- LongIterator iterator()
- Iterator iterator()
- boolean contains(long)
- boolean trim()
- boolean trim(int)
- int size()
- boolean addAll(LongCollection)
- boolean addAll(Collection)
- int hashCode()
- LongOpenHashSet of()
- LongOpenHashSet of(long)
- LongOpenHashSet of(long, long)
- LongOpenHashSet of(long, long, long)
- LongOpenHashSet of(long[])
- LongOpenHashSet clone()
- Object clone() throws CloneNotSupportedException
- void ensureCapacity(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongSets
Type: Class

Methods:
- LongSet singleton(long)
- LongSet singleton(Long)
- LongSet emptySet()
- LongSet unmodifiable(LongSet)
- LongSet from(long)
- LongSet to(long)
- LongSet fromTo(long, long)
- LongSet synchronize(LongSet)
- LongSet synchronize(LongSet, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.longs.LongSpliterators
Type: Class

Methods:
- LongSpliterator asSpliteratorFromSortedUnknownSize(LongIterator, int, LongComparator)
- LongSpliterator singleton(long)
- LongSpliterator singleton(long, LongComparator)
- LongSpliterator asSpliteratorUnknownSize(LongIterator, int)
- LongSpliterator asSpliteratorFromSorted(LongIterator, long, int, LongComparator)
- LongSpliterator asLongSpliterator(Spliterator)
- LongSpliterator asLongSpliterator(Spliterator, LongComparator)
- LongIterator asIterator(LongSpliterator)
- LongSpliterator wrapPreSorted(long[], int, int, int, LongComparator)
- LongSpliterator wrapPreSorted(long[], int, int, LongComparator)
- LongSpliterator wrapPreSorted(long[], LongComparator)
- LongSpliterator concat(LongSpliterator[])
- LongSpliterator concat(LongSpliterator[], int, int)
- void onEachMatching(LongSpliterator, LongPredicate, LongConsumer)
- LongSpliterator fromTo(long, long)
- LongSpliterator wrap(long[], int, int)
- LongSpliterator wrap(long[])
- LongSpliterator wrap(long[], int, int, int)
- LongSpliterator wrap(ByteSpliterator)
- LongSpliterator wrap(ShortSpliterator)
- LongSpliterator wrap(CharSpliterator)
- LongSpliterator wrap(IntSpliterator)
- LongSpliterator asSpliterator(LongIterator, long, int)

## Package: com.sk89q.worldedit.bukkit.fastutil.objects

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2BooleanFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.Predicate

Methods:
- boolean getOrDefault(Object, boolean)
- Boolean getOrDefault(Object, Boolean)
- Object getOrDefault(Object, Object)
- Object2ShortFunction andThenShort(Boolean2ShortFunction)
- Byte2BooleanFunction composeByte(Byte2ObjectFunction)
- Object2IntFunction andThenInt(Boolean2IntFunction)
- Reference2BooleanFunction composeReference(Reference2ObjectFunction)
- Function andThen(Function)
- Boolean remove(Object)
- Object remove(Object)
- boolean put(Object, boolean)
- Boolean put(Object, Boolean)
- Object put(Object, Object)
- void defaultReturnValue(boolean)
- boolean defaultReturnValue()
- Object2DoubleFunction andThenDouble(Boolean2DoubleFunction)
- Object2ObjectFunction andThenObject(Boolean2ObjectFunction)
- Boolean get(Object)
- Object get(Object)
- Object2LongFunction andThenLong(Boolean2LongFunction)
- boolean removeBoolean(Object)
- Long2BooleanFunction composeLong(Long2ObjectFunction)
- boolean getBoolean(Object)
- Object2ByteFunction andThenByte(Boolean2ByteFunction)
- Object2FloatFunction andThenFloat(Boolean2FloatFunction)
- boolean test(Object)
- Int2BooleanFunction composeInt(Int2ObjectFunction)
- Float2BooleanFunction composeFloat(Float2ObjectFunction)
- Object2CharFunction andThenChar(Boolean2CharFunction)
- Object2BooleanFunction composeObject(Object2ObjectFunction)
- Short2BooleanFunction composeShort(Short2ObjectFunction)
- Object2ReferenceFunction andThenReference(Boolean2ReferenceFunction)
- Char2BooleanFunction composeChar(Char2ObjectFunction)
- Double2BooleanFunction composeDouble(Double2ObjectFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2ByteFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToIntFunction

Methods:
- byte getOrDefault(Object, byte)
- Byte getOrDefault(Object, Byte)
- Object getOrDefault(Object, Object)
- byte getByte(Object)
- Object2ShortFunction andThenShort(Byte2ShortFunction)
- Byte2ByteFunction composeByte(Byte2ObjectFunction)
- Object2IntFunction andThenInt(Byte2IntFunction)
- Reference2ByteFunction composeReference(Reference2ObjectFunction)
- Function andThen(Function)
- Byte remove(Object)
- Object remove(Object)
- byte put(Object, byte)
- Byte put(Object, Byte)
- Object put(Object, Object)
- void defaultReturnValue(byte)
- byte defaultReturnValue()
- Object2DoubleFunction andThenDouble(Byte2DoubleFunction)
- Object2ObjectFunction andThenObject(Byte2ObjectFunction)
- Byte get(Object)
- Object get(Object)
- Object2LongFunction andThenLong(Byte2LongFunction)
- Long2ByteFunction composeLong(Long2ObjectFunction)
- byte removeByte(Object)
- Object2ByteFunction andThenByte(Byte2ByteFunction)
- Object2FloatFunction andThenFloat(Byte2FloatFunction)
- int applyAsInt(Object)
- Int2ByteFunction composeInt(Int2ObjectFunction)
- Float2ByteFunction composeFloat(Float2ObjectFunction)
- Object2CharFunction andThenChar(Byte2CharFunction)
- Object2ByteFunction composeObject(Object2ObjectFunction)
- Short2ByteFunction composeShort(Short2ObjectFunction)
- Object2ReferenceFunction andThenReference(Byte2ReferenceFunction)
- Char2ByteFunction composeChar(Char2ObjectFunction)
- Double2ByteFunction composeDouble(Double2ObjectFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2CharFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToIntFunction

Methods:
- char getOrDefault(Object, char)
- Character getOrDefault(Object, Character)
- Object getOrDefault(Object, Object)
- Object2ShortFunction andThenShort(Char2ShortFunction)
- char removeChar(Object)
- Byte2CharFunction composeByte(Byte2ObjectFunction)
- Object2IntFunction andThenInt(Char2IntFunction)
- Reference2CharFunction composeReference(Reference2ObjectFunction)
- Function andThen(Function)
- Character remove(Object)
- Object remove(Object)
- char put(Object, char)
- Character put(Object, Character)
- Object put(Object, Object)
- void defaultReturnValue(char)
- char defaultReturnValue()
- Object2DoubleFunction andThenDouble(Char2DoubleFunction)
- Object2ObjectFunction andThenObject(Char2ObjectFunction)
- Character get(Object)
- Object get(Object)
- Object2LongFunction andThenLong(Char2LongFunction)
- Long2CharFunction composeLong(Long2ObjectFunction)
- Object2ByteFunction andThenByte(Char2ByteFunction)
- Object2FloatFunction andThenFloat(Char2FloatFunction)
- int applyAsInt(Object)
- Int2CharFunction composeInt(Int2ObjectFunction)
- Float2CharFunction composeFloat(Float2ObjectFunction)
- Object2CharFunction andThenChar(Char2CharFunction)
- char getChar(Object)
- Object2CharFunction composeObject(Object2ObjectFunction)
- Short2CharFunction composeShort(Short2ObjectFunction)
- Object2ReferenceFunction andThenReference(Char2ReferenceFunction)
- Char2CharFunction composeChar(Char2ObjectFunction)
- Double2CharFunction composeDouble(Double2ObjectFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2DoubleFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToDoubleFunction

Methods:
- double getOrDefault(Object, double)
- Double getOrDefault(Object, Double)
- Object getOrDefault(Object, Object)
- double applyAsDouble(Object)
- Object2ShortFunction andThenShort(Double2ShortFunction)
- double getDouble(Object)
- Byte2DoubleFunction composeByte(Byte2ObjectFunction)
- Object2IntFunction andThenInt(Double2IntFunction)
- Reference2DoubleFunction composeReference(Reference2ObjectFunction)
- Function andThen(Function)
- Double remove(Object)
- Object remove(Object)
- double put(Object, double)
- Double put(Object, Double)
- Object put(Object, Object)
- void defaultReturnValue(double)
- double defaultReturnValue()
- Object2DoubleFunction andThenDouble(Double2DoubleFunction)
- Object2ObjectFunction andThenObject(Double2ObjectFunction)
- Double get(Object)
- Object get(Object)
- Object2LongFunction andThenLong(Double2LongFunction)
- Long2DoubleFunction composeLong(Long2ObjectFunction)
- Object2ByteFunction andThenByte(Double2ByteFunction)
- Object2FloatFunction andThenFloat(Double2FloatFunction)
- Int2DoubleFunction composeInt(Int2ObjectFunction)
- Float2DoubleFunction composeFloat(Float2ObjectFunction)
- Object2CharFunction andThenChar(Double2CharFunction)
- Object2DoubleFunction composeObject(Object2ObjectFunction)
- double removeDouble(Object)
- Short2DoubleFunction composeShort(Short2ObjectFunction)
- Object2ReferenceFunction andThenReference(Double2ReferenceFunction)
- Char2DoubleFunction composeChar(Char2ObjectFunction)
- Double2DoubleFunction composeDouble(Double2ObjectFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2FloatFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToDoubleFunction

Methods:
- float getOrDefault(Object, float)
- Float getOrDefault(Object, Float)
- Object getOrDefault(Object, Object)
- double applyAsDouble(Object)
- Object2ShortFunction andThenShort(Float2ShortFunction)
- Byte2FloatFunction composeByte(Byte2ObjectFunction)
- float getFloat(Object)
- Object2IntFunction andThenInt(Float2IntFunction)
- Reference2FloatFunction composeReference(Reference2ObjectFunction)
- Function andThen(Function)
- Float remove(Object)
- Object remove(Object)
- float put(Object, float)
- Float put(Object, Float)
- Object put(Object, Object)
- void defaultReturnValue(float)
- float defaultReturnValue()
- Object2DoubleFunction andThenDouble(Float2DoubleFunction)
- Object2ObjectFunction andThenObject(Float2ObjectFunction)
- Float get(Object)
- Object get(Object)
- Object2LongFunction andThenLong(Float2LongFunction)
- Long2FloatFunction composeLong(Long2ObjectFunction)
- Object2ByteFunction andThenByte(Float2ByteFunction)
- Object2FloatFunction andThenFloat(Float2FloatFunction)
- float removeFloat(Object)
- Int2FloatFunction composeInt(Int2ObjectFunction)
- Float2FloatFunction composeFloat(Float2ObjectFunction)
- Object2CharFunction andThenChar(Float2CharFunction)
- Object2FloatFunction composeObject(Object2ObjectFunction)
- Short2FloatFunction composeShort(Short2ObjectFunction)
- Object2ReferenceFunction andThenReference(Float2ReferenceFunction)
- Char2FloatFunction composeChar(Char2ObjectFunction)
- Double2FloatFunction composeDouble(Double2ObjectFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToIntFunction

Methods:
- int getOrDefault(Object, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- Object2ShortFunction andThenShort(Int2ShortFunction)
- Byte2IntFunction composeByte(Byte2ObjectFunction)
- Object2IntFunction andThenInt(Int2IntFunction)
- Reference2IntFunction composeReference(Reference2ObjectFunction)
- Function andThen(Function)
- Integer remove(Object)
- Object remove(Object)
- int put(Object, int)
- Integer put(Object, Integer)
- Object put(Object, Object)
- void defaultReturnValue(int)
- int defaultReturnValue()
- Object2DoubleFunction andThenDouble(Int2DoubleFunction)
- Object2ObjectFunction andThenObject(Int2ObjectFunction)
- Integer get(Object)
- Object get(Object)
- Object2LongFunction andThenLong(Int2LongFunction)
- Long2IntFunction composeLong(Long2ObjectFunction)
- Object2ByteFunction andThenByte(Int2ByteFunction)
- Object2FloatFunction andThenFloat(Int2FloatFunction)
- int applyAsInt(Object)
- int removeInt(Object)
- Int2IntFunction composeInt(Int2ObjectFunction)
- Float2IntFunction composeFloat(Float2ObjectFunction)
- Object2CharFunction andThenChar(Int2CharFunction)
- int getInt(Object)
- Object2IntFunction composeObject(Object2ObjectFunction)
- Short2IntFunction composeShort(Short2ObjectFunction)
- Object2ReferenceFunction andThenReference(Int2ReferenceFunction)
- Char2IntFunction composeChar(Char2ObjectFunction)
- Double2IntFunction composeDouble(Double2ObjectFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntMap
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntFunction, java.util.Map

Methods:
- ObjectSet object2IntEntrySet()
- int computeIntIfAbsentPartial(Object, Object2IntFunction)
- int getOrDefault(Object, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- ObjectSet entrySet()
- Set entrySet()
- void forEach(BiConsumer)
- boolean containsKey(Object)
- int computeIfAbsent(Object, ToIntFunction)
- int computeIfAbsent(Object, Object2IntFunction)
- IntCollection values()
- Collection values()
- boolean replace(Object, int, int)
- int replace(Object, int)
- boolean replace(Object, Integer, Integer)
- Integer replace(Object, Integer)
- Object replace(Object, Object)
- boolean replace(Object, Object, Object)
- void clear()
- boolean containsValue(int)
- boolean containsValue(Object)
- Integer remove(Object)
- boolean remove(Object, int)
- boolean remove(Object, Object)
- Object remove(Object)
- Integer put(Object, Integer)
- Object put(Object, Object)
- int mergeInt(Object, int, IntBinaryOperator)
- int mergeInt(Object, int, IntBinaryOperator)
- int mergeInt(Object, int, BiFunction)
- void defaultReturnValue(int)
- int defaultReturnValue()
- int computeIntIfAbsent(Object, ToIntFunction)
- int size()
- int merge(Object, int, BiFunction)
- Integer merge(Object, Integer, BiFunction)
- Object merge(Object, Object, BiFunction)
- int computeIntIfPresent(Object, BiFunction)
- Integer get(Object)
- Object get(Object)
- int computeInt(Object, BiFunction)
- int putIfAbsent(Object, int)
- Integer putIfAbsent(Object, Integer)
- Object putIfAbsent(Object, Object)
- ObjectSet keySet()
- Set keySet()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntSortedMap
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntMap, java.util.SortedMap

Methods:
- ObjectSortedSet object2IntEntrySet()
- ObjectSet object2IntEntrySet()
- Comparator comparator()
- ObjectSortedSet entrySet()
- ObjectSet entrySet()
- Set entrySet()
- IntCollection values()
- Collection values()
- Object2IntSortedMap subMap(Object, Object)
- SortedMap subMap(Object, Object)
- Object2IntSortedMap headMap(Object)
- SortedMap headMap(Object)
- ObjectSortedSet keySet()
- ObjectSet keySet()
- Set keySet()
- Object2IntSortedMap tailMap(Object)
- SortedMap tailMap(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2LongFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToLongFunction

Methods:
- long getOrDefault(Object, long)
- Long getOrDefault(Object, Long)
- Object getOrDefault(Object, Object)
- Object2ShortFunction andThenShort(Long2ShortFunction)
- Byte2LongFunction composeByte(Byte2ObjectFunction)
- Object2IntFunction andThenInt(Long2IntFunction)
- Reference2LongFunction composeReference(Reference2ObjectFunction)
- Function andThen(Function)
- Long remove(Object)
- Object remove(Object)
- long put(Object, long)
- Long put(Object, Long)
- Object put(Object, Object)
- void defaultReturnValue(long)
- long defaultReturnValue()
- Object2DoubleFunction andThenDouble(Long2DoubleFunction)
- Object2ObjectFunction andThenObject(Long2ObjectFunction)
- Long get(Object)
- Object get(Object)
- long removeLong(Object)
- Object2LongFunction andThenLong(Long2LongFunction)
- Long2LongFunction composeLong(Long2ObjectFunction)
- Object2ByteFunction andThenByte(Long2ByteFunction)
- Object2FloatFunction andThenFloat(Long2FloatFunction)
- Int2LongFunction composeInt(Int2ObjectFunction)
- Float2LongFunction composeFloat(Float2ObjectFunction)
- Object2CharFunction andThenChar(Long2CharFunction)
- long getLong(Object)
- long applyAsLong(Object)
- Object2LongFunction composeObject(Object2ObjectFunction)
- Short2LongFunction composeShort(Short2ObjectFunction)
- Object2ReferenceFunction andThenReference(Long2ReferenceFunction)
- Char2LongFunction composeChar(Char2ObjectFunction)
- Double2LongFunction composeDouble(Double2ObjectFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2ObjectFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- Object2FloatFunction andThenFloat(Object2FloatFunction)
- Object getOrDefault(Object, Object)
- Int2ObjectFunction composeInt(Int2ObjectFunction)
- Object2ShortFunction andThenShort(Object2ShortFunction)
- Byte2ObjectFunction composeByte(Byte2ObjectFunction)
- Float2ObjectFunction composeFloat(Float2ObjectFunction)
- Object2IntFunction andThenInt(Object2IntFunction)
- Reference2ObjectFunction composeReference(Reference2ObjectFunction)
- Object2CharFunction andThenChar(Object2CharFunction)
- Object remove(Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Object2DoubleFunction andThenDouble(Object2DoubleFunction)
- Object2ObjectFunction composeObject(Object2ObjectFunction)
- Object2ObjectFunction andThenObject(Object2ObjectFunction)
- Short2ObjectFunction composeShort(Short2ObjectFunction)
- Object get(Object)
- Object2ReferenceFunction andThenReference(Object2ReferenceFunction)
- Char2ObjectFunction composeChar(Char2ObjectFunction)
- Object2LongFunction andThenLong(Object2LongFunction)
- Long2ObjectFunction composeLong(Long2ObjectFunction)
- Double2ObjectFunction composeDouble(Double2ObjectFunction)
- Object2ByteFunction andThenByte(Object2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2ReferenceFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- Object2FloatFunction andThenFloat(Reference2FloatFunction)
- Object getOrDefault(Object, Object)
- Int2ReferenceFunction composeInt(Int2ObjectFunction)
- Object2ShortFunction andThenShort(Reference2ShortFunction)
- Byte2ReferenceFunction composeByte(Byte2ObjectFunction)
- Float2ReferenceFunction composeFloat(Float2ObjectFunction)
- Object2IntFunction andThenInt(Reference2IntFunction)
- Reference2ReferenceFunction composeReference(Reference2ObjectFunction)
- Object2CharFunction andThenChar(Reference2CharFunction)
- Object remove(Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Object2DoubleFunction andThenDouble(Reference2DoubleFunction)
- Object2ReferenceFunction composeObject(Object2ObjectFunction)
- Object2ObjectFunction andThenObject(Reference2ObjectFunction)
- Short2ReferenceFunction composeShort(Short2ObjectFunction)
- Object get(Object)
- Object2ReferenceFunction andThenReference(Reference2ReferenceFunction)
- Char2ReferenceFunction composeChar(Char2ObjectFunction)
- Object2LongFunction andThenLong(Reference2LongFunction)
- Long2ReferenceFunction composeLong(Long2ObjectFunction)
- Double2ReferenceFunction composeDouble(Double2ObjectFunction)
- Object2ByteFunction andThenByte(Reference2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2ShortFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToIntFunction

Methods:
- short getOrDefault(Object, short)
- Short getOrDefault(Object, Short)
- Object getOrDefault(Object, Object)
- Object2ShortFunction andThenShort(Short2ShortFunction)
- Byte2ShortFunction composeByte(Byte2ObjectFunction)
- short removeShort(Object)
- Object2IntFunction andThenInt(Short2IntFunction)
- Reference2ShortFunction composeReference(Reference2ObjectFunction)
- Function andThen(Function)
- Short remove(Object)
- Object remove(Object)
- short put(Object, short)
- Short put(Object, Short)
- Object put(Object, Object)
- void defaultReturnValue(short)
- short defaultReturnValue()
- Object2DoubleFunction andThenDouble(Short2DoubleFunction)
- Object2ObjectFunction andThenObject(Short2ObjectFunction)
- Short get(Object)
- Object get(Object)
- Object2LongFunction andThenLong(Short2LongFunction)
- Long2ShortFunction composeLong(Long2ObjectFunction)
- Object2ByteFunction andThenByte(Short2ByteFunction)
- Object2FloatFunction andThenFloat(Short2FloatFunction)
- int applyAsInt(Object)
- short getShort(Object)
- Int2ShortFunction composeInt(Int2ObjectFunction)
- Float2ShortFunction composeFloat(Float2ObjectFunction)
- Object2CharFunction andThenChar(Short2CharFunction)
- Object2ShortFunction composeObject(Object2ObjectFunction)
- Short2ShortFunction composeShort(Short2ObjectFunction)
- Object2ReferenceFunction andThenReference(Short2ReferenceFunction)
- Char2ShortFunction composeChar(Char2ObjectFunction)
- Double2ShortFunction composeDouble(Double2ObjectFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectBidirectionalIterable
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectIterable

Methods:
- ObjectBidirectionalIterator iterator()
- ObjectIterator iterator()
- Iterator iterator()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectBidirectionalIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectIterator, com.sk89q.worldedit.bukkit.fastutil.BidirectionalIterator

Methods:
- int back(int)
- int skip(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectBigListIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectBidirectionalIterator, com.sk89q.worldedit.bukkit.fastutil.BigListIterator

Methods:
- void add(Object)
- void set(Object)
- long back(long)
- long skip(long)
- int skip(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectCollection
Type: Interface
Implements: java.util.Collection, com.sk89q.worldedit.bukkit.fastutil.objects.ObjectIterable

Methods:
- ObjectIterator iterator()
- Iterator iterator()
- ObjectSpliterator spliterator()
- Spliterator spliterator()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectIntPair
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Pair

Methods:
- int rightInt()
- ObjectIntPair of(Object, int)
- Integer right()
- ObjectIntPair right(int)
- ObjectIntPair right(Integer)
- Pair right(Object)
- Object right()
- Comparator lexComparator()
- int valueInt()
- Integer value()
- ObjectIntPair value(int)
- ObjectIntPair value(Integer)
- Object value()
- Pair value(Object)
- Integer second()
- ObjectIntPair second(int)
- ObjectIntPair second(Integer)
- Pair second(Object)
- Object second()
- int secondInt()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectIterable
Type: Interface
Implements: java.lang.Iterable

Methods:
- ObjectIterator iterator()
- Iterator iterator()
- ObjectSpliterator spliterator()
- Spliterator spliterator()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectIterator
Type: Interface
Implements: java.util.Iterator

Methods:
- int skip(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectList
Type: Interface
Implements: java.util.List, java.lang.Comparable, com.sk89q.worldedit.bukkit.fastutil.objects.ObjectCollection

Methods:
- ObjectList subList(int, int)
- List subList(int, int)
- ObjectSpliterator spliterator()
- Spliterator spliterator()
- void setElements(Object[])
- void setElements(int, Object[])
- void setElements(int, Object[], int, int)
- void sort(Comparator)
- void removeElements(int, int)
- ObjectListIterator iterator()
- Iterator iterator()
- ObjectIterator iterator()
- void size(int)
- boolean addAll(int, ObjectList)
- boolean addAll(ObjectList)
- void addElements(int, Object[])
- void addElements(int, Object[], int, int)
- ObjectList of()
- ObjectList of(Object)
- ObjectList of(Object, Object)
- ObjectList of(Object, Object, Object)
- ObjectList of(Object[])
- void getElements(int, Object[], int, int)
- ObjectListIterator listIterator()
- ObjectListIterator listIterator(int)
- ListIterator listIterator(int)
- ListIterator listIterator()
- void unstableSort(Comparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectListIterator
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectBidirectionalIterator, java.util.ListIterator

Methods:
- void add(Object)
- void set(Object)
- void remove()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectSet
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectCollection, java.util.Set

Methods:
- ObjectIterator iterator()
- Iterator iterator()
- ObjectSpliterator spliterator()
- Spliterator spliterator()
- ObjectSet of()
- ObjectSet of(Object)
- ObjectSet of(Object, Object)
- ObjectSet of(Object, Object, Object)
- ObjectSet of(Object[])

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectSortedSet
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectSet, java.util.SortedSet, com.sk89q.worldedit.bukkit.fastutil.objects.ObjectBidirectionalIterable

Methods:
- ObjectSortedSet tailSet(Object)
- SortedSet tailSet(Object)
- ObjectBidirectionalIterator iterator(Object)
- ObjectBidirectionalIterator iterator()
- ObjectIterator iterator()
- Iterator iterator()
- ObjectSortedSet headSet(Object)
- SortedSet headSet(Object)
- ObjectSpliterator spliterator()
- Spliterator spliterator()
- ObjectSortedSet subSet(Object, Object)
- SortedSet subSet(Object, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectSpliterator
Type: Interface
Implements: java.util.Spliterator

Methods:
- ObjectSpliterator trySplit()
- Spliterator trySplit()
- long skip(long)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Reference2BooleanFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.Predicate

Methods:
- boolean getOrDefault(Object, boolean)
- Boolean getOrDefault(Object, Boolean)
- Object getOrDefault(Object, Object)
- Reference2ShortFunction andThenShort(Boolean2ShortFunction)
- Byte2BooleanFunction composeByte(Byte2ReferenceFunction)
- Reference2IntFunction andThenInt(Boolean2IntFunction)
- Reference2BooleanFunction composeReference(Reference2ReferenceFunction)
- Function andThen(Function)
- Boolean remove(Object)
- Object remove(Object)
- boolean put(Object, boolean)
- Boolean put(Object, Boolean)
- Object put(Object, Object)
- void defaultReturnValue(boolean)
- boolean defaultReturnValue()
- Reference2DoubleFunction andThenDouble(Boolean2DoubleFunction)
- Reference2ObjectFunction andThenObject(Boolean2ObjectFunction)
- Boolean get(Object)
- Object get(Object)
- Reference2LongFunction andThenLong(Boolean2LongFunction)
- boolean removeBoolean(Object)
- Long2BooleanFunction composeLong(Long2ReferenceFunction)
- boolean getBoolean(Object)
- Reference2ByteFunction andThenByte(Boolean2ByteFunction)
- Reference2FloatFunction andThenFloat(Boolean2FloatFunction)
- boolean test(Object)
- Int2BooleanFunction composeInt(Int2ReferenceFunction)
- Float2BooleanFunction composeFloat(Float2ReferenceFunction)
- Reference2CharFunction andThenChar(Boolean2CharFunction)
- Object2BooleanFunction composeObject(Object2ReferenceFunction)
- Short2BooleanFunction composeShort(Short2ReferenceFunction)
- Reference2ReferenceFunction andThenReference(Boolean2ReferenceFunction)
- Char2BooleanFunction composeChar(Char2ReferenceFunction)
- Double2BooleanFunction composeDouble(Double2ReferenceFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Reference2ByteFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToIntFunction

Methods:
- byte getOrDefault(Object, byte)
- Byte getOrDefault(Object, Byte)
- Object getOrDefault(Object, Object)
- byte getByte(Object)
- Reference2ShortFunction andThenShort(Byte2ShortFunction)
- Byte2ByteFunction composeByte(Byte2ReferenceFunction)
- Reference2IntFunction andThenInt(Byte2IntFunction)
- Reference2ByteFunction composeReference(Reference2ReferenceFunction)
- Function andThen(Function)
- Byte remove(Object)
- Object remove(Object)
- byte put(Object, byte)
- Byte put(Object, Byte)
- Object put(Object, Object)
- void defaultReturnValue(byte)
- byte defaultReturnValue()
- Reference2DoubleFunction andThenDouble(Byte2DoubleFunction)
- Reference2ObjectFunction andThenObject(Byte2ObjectFunction)
- Byte get(Object)
- Object get(Object)
- Reference2LongFunction andThenLong(Byte2LongFunction)
- Long2ByteFunction composeLong(Long2ReferenceFunction)
- byte removeByte(Object)
- Reference2ByteFunction andThenByte(Byte2ByteFunction)
- Reference2FloatFunction andThenFloat(Byte2FloatFunction)
- int applyAsInt(Object)
- Int2ByteFunction composeInt(Int2ReferenceFunction)
- Float2ByteFunction composeFloat(Float2ReferenceFunction)
- Reference2CharFunction andThenChar(Byte2CharFunction)
- Object2ByteFunction composeObject(Object2ReferenceFunction)
- Short2ByteFunction composeShort(Short2ReferenceFunction)
- Reference2ReferenceFunction andThenReference(Byte2ReferenceFunction)
- Char2ByteFunction composeChar(Char2ReferenceFunction)
- Double2ByteFunction composeDouble(Double2ReferenceFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Reference2CharFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToIntFunction

Methods:
- char getOrDefault(Object, char)
- Character getOrDefault(Object, Character)
- Object getOrDefault(Object, Object)
- Reference2ShortFunction andThenShort(Char2ShortFunction)
- char removeChar(Object)
- Byte2CharFunction composeByte(Byte2ReferenceFunction)
- Reference2IntFunction andThenInt(Char2IntFunction)
- Reference2CharFunction composeReference(Reference2ReferenceFunction)
- Function andThen(Function)
- Character remove(Object)
- Object remove(Object)
- char put(Object, char)
- Character put(Object, Character)
- Object put(Object, Object)
- void defaultReturnValue(char)
- char defaultReturnValue()
- Reference2DoubleFunction andThenDouble(Char2DoubleFunction)
- Reference2ObjectFunction andThenObject(Char2ObjectFunction)
- Character get(Object)
- Object get(Object)
- Reference2LongFunction andThenLong(Char2LongFunction)
- Long2CharFunction composeLong(Long2ReferenceFunction)
- Reference2ByteFunction andThenByte(Char2ByteFunction)
- Reference2FloatFunction andThenFloat(Char2FloatFunction)
- int applyAsInt(Object)
- Int2CharFunction composeInt(Int2ReferenceFunction)
- Float2CharFunction composeFloat(Float2ReferenceFunction)
- Reference2CharFunction andThenChar(Char2CharFunction)
- char getChar(Object)
- Object2CharFunction composeObject(Object2ReferenceFunction)
- Short2CharFunction composeShort(Short2ReferenceFunction)
- Reference2ReferenceFunction andThenReference(Char2ReferenceFunction)
- Char2CharFunction composeChar(Char2ReferenceFunction)
- Double2CharFunction composeDouble(Double2ReferenceFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Reference2DoubleFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToDoubleFunction

Methods:
- double getOrDefault(Object, double)
- Double getOrDefault(Object, Double)
- Object getOrDefault(Object, Object)
- double applyAsDouble(Object)
- Reference2ShortFunction andThenShort(Double2ShortFunction)
- double getDouble(Object)
- Byte2DoubleFunction composeByte(Byte2ReferenceFunction)
- Reference2IntFunction andThenInt(Double2IntFunction)
- Reference2DoubleFunction composeReference(Reference2ReferenceFunction)
- Function andThen(Function)
- Double remove(Object)
- Object remove(Object)
- double put(Object, double)
- Double put(Object, Double)
- Object put(Object, Object)
- void defaultReturnValue(double)
- double defaultReturnValue()
- Reference2DoubleFunction andThenDouble(Double2DoubleFunction)
- Reference2ObjectFunction andThenObject(Double2ObjectFunction)
- Double get(Object)
- Object get(Object)
- Reference2LongFunction andThenLong(Double2LongFunction)
- Long2DoubleFunction composeLong(Long2ReferenceFunction)
- Reference2ByteFunction andThenByte(Double2ByteFunction)
- Reference2FloatFunction andThenFloat(Double2FloatFunction)
- Int2DoubleFunction composeInt(Int2ReferenceFunction)
- Float2DoubleFunction composeFloat(Float2ReferenceFunction)
- Reference2CharFunction andThenChar(Double2CharFunction)
- Object2DoubleFunction composeObject(Object2ReferenceFunction)
- double removeDouble(Object)
- Short2DoubleFunction composeShort(Short2ReferenceFunction)
- Reference2ReferenceFunction andThenReference(Double2ReferenceFunction)
- Char2DoubleFunction composeChar(Char2ReferenceFunction)
- Double2DoubleFunction composeDouble(Double2ReferenceFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Reference2FloatFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToDoubleFunction

Methods:
- float getOrDefault(Object, float)
- Float getOrDefault(Object, Float)
- Object getOrDefault(Object, Object)
- double applyAsDouble(Object)
- Reference2ShortFunction andThenShort(Float2ShortFunction)
- Byte2FloatFunction composeByte(Byte2ReferenceFunction)
- float getFloat(Object)
- Reference2IntFunction andThenInt(Float2IntFunction)
- Reference2FloatFunction composeReference(Reference2ReferenceFunction)
- Function andThen(Function)
- Float remove(Object)
- Object remove(Object)
- float put(Object, float)
- Float put(Object, Float)
- Object put(Object, Object)
- void defaultReturnValue(float)
- float defaultReturnValue()
- Reference2DoubleFunction andThenDouble(Float2DoubleFunction)
- Reference2ObjectFunction andThenObject(Float2ObjectFunction)
- Float get(Object)
- Object get(Object)
- Reference2LongFunction andThenLong(Float2LongFunction)
- Long2FloatFunction composeLong(Long2ReferenceFunction)
- Reference2ByteFunction andThenByte(Float2ByteFunction)
- Reference2FloatFunction andThenFloat(Float2FloatFunction)
- float removeFloat(Object)
- Int2FloatFunction composeInt(Int2ReferenceFunction)
- Float2FloatFunction composeFloat(Float2ReferenceFunction)
- Reference2CharFunction andThenChar(Float2CharFunction)
- Object2FloatFunction composeObject(Object2ReferenceFunction)
- Short2FloatFunction composeShort(Short2ReferenceFunction)
- Reference2ReferenceFunction andThenReference(Float2ReferenceFunction)
- Char2FloatFunction composeChar(Char2ReferenceFunction)
- Double2FloatFunction composeDouble(Double2ReferenceFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Reference2IntFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToIntFunction

Methods:
- int getOrDefault(Object, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- Reference2ShortFunction andThenShort(Int2ShortFunction)
- Byte2IntFunction composeByte(Byte2ReferenceFunction)
- Reference2IntFunction andThenInt(Int2IntFunction)
- Reference2IntFunction composeReference(Reference2ReferenceFunction)
- Function andThen(Function)
- Integer remove(Object)
- Object remove(Object)
- int put(Object, int)
- Integer put(Object, Integer)
- Object put(Object, Object)
- void defaultReturnValue(int)
- int defaultReturnValue()
- Reference2DoubleFunction andThenDouble(Int2DoubleFunction)
- Reference2ObjectFunction andThenObject(Int2ObjectFunction)
- Integer get(Object)
- Object get(Object)
- Reference2LongFunction andThenLong(Int2LongFunction)
- Long2IntFunction composeLong(Long2ReferenceFunction)
- Reference2ByteFunction andThenByte(Int2ByteFunction)
- Reference2FloatFunction andThenFloat(Int2FloatFunction)
- int applyAsInt(Object)
- int removeInt(Object)
- Int2IntFunction composeInt(Int2ReferenceFunction)
- Float2IntFunction composeFloat(Float2ReferenceFunction)
- Reference2CharFunction andThenChar(Int2CharFunction)
- int getInt(Object)
- Object2IntFunction composeObject(Object2ReferenceFunction)
- Short2IntFunction composeShort(Short2ReferenceFunction)
- Reference2ReferenceFunction andThenReference(Int2ReferenceFunction)
- Char2IntFunction composeChar(Char2ReferenceFunction)
- Double2IntFunction composeDouble(Double2ReferenceFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Reference2LongFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToLongFunction

Methods:
- long getOrDefault(Object, long)
- Long getOrDefault(Object, Long)
- Object getOrDefault(Object, Object)
- Reference2ShortFunction andThenShort(Long2ShortFunction)
- Byte2LongFunction composeByte(Byte2ReferenceFunction)
- Reference2IntFunction andThenInt(Long2IntFunction)
- Reference2LongFunction composeReference(Reference2ReferenceFunction)
- Function andThen(Function)
- Long remove(Object)
- Object remove(Object)
- long put(Object, long)
- Long put(Object, Long)
- Object put(Object, Object)
- void defaultReturnValue(long)
- long defaultReturnValue()
- Reference2DoubleFunction andThenDouble(Long2DoubleFunction)
- Reference2ObjectFunction andThenObject(Long2ObjectFunction)
- Long get(Object)
- Object get(Object)
- long removeLong(Object)
- Reference2LongFunction andThenLong(Long2LongFunction)
- Long2LongFunction composeLong(Long2ReferenceFunction)
- Reference2ByteFunction andThenByte(Long2ByteFunction)
- Reference2FloatFunction andThenFloat(Long2FloatFunction)
- Int2LongFunction composeInt(Int2ReferenceFunction)
- Float2LongFunction composeFloat(Float2ReferenceFunction)
- Reference2CharFunction andThenChar(Long2CharFunction)
- long getLong(Object)
- long applyAsLong(Object)
- Object2LongFunction composeObject(Object2ReferenceFunction)
- Short2LongFunction composeShort(Short2ReferenceFunction)
- Reference2ReferenceFunction andThenReference(Long2ReferenceFunction)
- Char2LongFunction composeChar(Char2ReferenceFunction)
- Double2LongFunction composeDouble(Double2ReferenceFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Reference2ObjectFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- Reference2FloatFunction andThenFloat(Object2FloatFunction)
- Object getOrDefault(Object, Object)
- Int2ObjectFunction composeInt(Int2ReferenceFunction)
- Reference2ShortFunction andThenShort(Object2ShortFunction)
- Byte2ObjectFunction composeByte(Byte2ReferenceFunction)
- Float2ObjectFunction composeFloat(Float2ReferenceFunction)
- Reference2IntFunction andThenInt(Object2IntFunction)
- Reference2ObjectFunction composeReference(Reference2ReferenceFunction)
- Reference2CharFunction andThenChar(Object2CharFunction)
- Object remove(Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Reference2DoubleFunction andThenDouble(Object2DoubleFunction)
- Object2ObjectFunction composeObject(Object2ReferenceFunction)
- Reference2ObjectFunction andThenObject(Object2ObjectFunction)
- Short2ObjectFunction composeShort(Short2ReferenceFunction)
- Object get(Object)
- Reference2ReferenceFunction andThenReference(Object2ReferenceFunction)
- Char2ObjectFunction composeChar(Char2ReferenceFunction)
- Reference2LongFunction andThenLong(Object2LongFunction)
- Long2ObjectFunction composeLong(Long2ReferenceFunction)
- Double2ObjectFunction composeDouble(Double2ReferenceFunction)
- Reference2ByteFunction andThenByte(Object2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Reference2ReferenceFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function

Methods:
- Reference2FloatFunction andThenFloat(Reference2FloatFunction)
- Object getOrDefault(Object, Object)
- Int2ReferenceFunction composeInt(Int2ReferenceFunction)
- Reference2ShortFunction andThenShort(Reference2ShortFunction)
- Byte2ReferenceFunction composeByte(Byte2ReferenceFunction)
- Float2ReferenceFunction composeFloat(Float2ReferenceFunction)
- Reference2IntFunction andThenInt(Reference2IntFunction)
- Reference2ReferenceFunction composeReference(Reference2ReferenceFunction)
- Reference2CharFunction andThenChar(Reference2CharFunction)
- Object remove(Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Reference2DoubleFunction andThenDouble(Reference2DoubleFunction)
- Object2ReferenceFunction composeObject(Object2ReferenceFunction)
- Reference2ObjectFunction andThenObject(Reference2ObjectFunction)
- Short2ReferenceFunction composeShort(Short2ReferenceFunction)
- Object get(Object)
- Reference2ReferenceFunction andThenReference(Reference2ReferenceFunction)
- Char2ReferenceFunction composeChar(Char2ReferenceFunction)
- Reference2LongFunction andThenLong(Reference2LongFunction)
- Long2ReferenceFunction composeLong(Long2ReferenceFunction)
- Double2ReferenceFunction composeDouble(Double2ReferenceFunction)
- Reference2ByteFunction andThenByte(Reference2ByteFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Reference2ShortFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.ToIntFunction

Methods:
- short getOrDefault(Object, short)
- Short getOrDefault(Object, Short)
- Object getOrDefault(Object, Object)
- Reference2ShortFunction andThenShort(Short2ShortFunction)
- Byte2ShortFunction composeByte(Byte2ReferenceFunction)
- short removeShort(Object)
- Reference2IntFunction andThenInt(Short2IntFunction)
- Reference2ShortFunction composeReference(Reference2ReferenceFunction)
- Function andThen(Function)
- Short remove(Object)
- Object remove(Object)
- short put(Object, short)
- Short put(Object, Short)
- Object put(Object, Object)
- void defaultReturnValue(short)
- short defaultReturnValue()
- Reference2DoubleFunction andThenDouble(Short2DoubleFunction)
- Reference2ObjectFunction andThenObject(Short2ObjectFunction)
- Short get(Object)
- Object get(Object)
- Reference2LongFunction andThenLong(Short2LongFunction)
- Long2ShortFunction composeLong(Long2ReferenceFunction)
- Reference2ByteFunction andThenByte(Short2ByteFunction)
- Reference2FloatFunction andThenFloat(Short2FloatFunction)
- int applyAsInt(Object)
- short getShort(Object)
- Int2ShortFunction composeInt(Int2ReferenceFunction)
- Float2ShortFunction composeFloat(Float2ReferenceFunction)
- Reference2CharFunction andThenChar(Short2CharFunction)
- Object2ShortFunction composeObject(Object2ReferenceFunction)
- Short2ShortFunction composeShort(Short2ReferenceFunction)
- Reference2ReferenceFunction andThenReference(Short2ReferenceFunction)
- Char2ShortFunction composeChar(Char2ReferenceFunction)
- Double2ShortFunction composeDouble(Double2ReferenceFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObject2IntFunction
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntFunction, java.io.Serializable

Methods:
- void defaultReturnValue(int)
- int defaultReturnValue()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObject2IntMap
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObject2IntFunction
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntMap, java.io.Serializable

Methods:
- int hashCode()
- boolean containsKey(Object)
- boolean equals(Object)
- void putAll(Map)
- IntCollection values()
- Collection values()
- boolean isEmpty()
- String toString()
- ObjectSet keySet()
- Set keySet()
- boolean containsValue(int)
- int mergeInt(Object, int, IntBinaryOperator)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObject2IntSortedMap
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObject2IntMap
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntSortedMap

Methods:
- IntCollection values()
- Collection values()
- ObjectSortedSet keySet()
- ObjectSet keySet()
- Set keySet()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectCollection
Type: Abstract Class
Extends: java.util.AbstractCollection
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectCollection

Methods:
- ObjectIterator iterator()
- Iterator iterator()
- String toString()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectIterator
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectIterator

No public methods found

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectList
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectCollection
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectList, com.sk89q.worldedit.bukkit.fastutil.Stack

Methods:
- int compareTo(List)
- int compareTo(Object)
- Object remove(int)
- Object pop()
- ObjectListIterator iterator()
- ObjectIterator iterator()
- Iterator iterator()
- Object top()
- int hashCode()
- void addElements(int, Object[], int, int)
- void addElements(int, Object[])
- Object[] toArray()
- Object[] toArray(Object[])
- int indexOf(Object)
- void add(int, Object)
- boolean add(Object)
- ObjectList subList(int, int)
- List subList(int, int)
- Object set(int, Object)
- void forEach(Consumer)
- void clear()
- void setElements(int, Object[], int, int)
- void removeElements(int, int)
- void push(Object)
- Object peek(int)
- int lastIndexOf(Object)
- boolean contains(Object)
- void size(int)
- boolean addAll(int, Collection)
- boolean addAll(Collection)
- boolean equals(Object)
- void getElements(int, Object[], int, int)
- ObjectListIterator listIterator()
- ObjectListIterator listIterator(int)
- ListIterator listIterator(int)
- ListIterator listIterator()
- String toString()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectSet
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectCollection
Implements: java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.objects.ObjectSet

Methods:
- ObjectIterator iterator()
- Iterator iterator()
- int hashCode()
- boolean equals(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectSortedSet
Type: Abstract Class
Extends: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectSet
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectSortedSet

Methods:
- ObjectBidirectionalIterator iterator()
- ObjectIterator iterator()
- Iterator iterator()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectSpliterator
Type: Abstract Class
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectSpliterator

No public methods found

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntFunctions
Type: Class

Methods:
- Object2IntFunction singleton(Object, int)
- Object2IntFunction singleton(Object, Integer)
- Object2IntFunction unmodifiable(Object2IntFunction)
- Object2IntFunction primitive(Function)
- Object2IntFunction synchronize(Object2IntFunction)
- Object2IntFunction synchronize(Object2IntFunction, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntLinkedOpenHashMap
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObject2IntSortedMap
Implements: java.io.Serializable, java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.Hash

Methods:
- int getOrDefault(Object, int)
- IntCollection values()
- Collection values()
- int computeIfAbsent(Object, ToIntFunction)
- int computeIfAbsent(Object, Object2IntFunction)
- boolean replace(Object, int, int)
- int replace(Object, int)
- int putAndMoveToLast(Object, int)
- int getAndMoveToLast(Object)
- boolean remove(Object, int)
- boolean containsValue(int)
- int put(Object, int)
- int putAndMoveToFirst(Object, int)
- boolean trim()
- boolean trim(int)
- int getAndMoveToFirst(Object)
- int hashCode()
- int merge(Object, int, BiFunction)
- void putAll(Map)
- Object lastKey()
- ObjectSortedSet keySet()
- ObjectSet keySet()
- Set keySet()
- int computeInt(Object, BiFunction)
- Object2IntSortedMap$FastSortedEntrySet object2IntEntrySet()
- ObjectSortedSet object2IntEntrySet()
- ObjectSet object2IntEntrySet()
- int removeInt(Object)
- boolean containsKey(Object)
- int removeLastInt()
- Object2IntSortedMap subMap(Object, Object)
- SortedMap subMap(Object, Object)
- boolean isEmpty()
- void clear()
- int removeFirstInt()
- Comparator comparator()
- int getInt(Object)
- int size()
- Object firstKey()
- int computeIntIfPresent(Object, BiFunction)
- Object2IntLinkedOpenHashMap clone()
- Object clone() throws CloneNotSupportedException
- int addTo(Object, int)
- Object2IntSortedMap headMap(Object)
- SortedMap headMap(Object)
- void ensureCapacity(int)
- int putIfAbsent(Object, int)
- Object2IntSortedMap tailMap(Object)
- SortedMap tailMap(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntMaps
Type: Class

Methods:
- Object2IntMap singleton(Object, int)
- Object2IntMap singleton(Object, Integer)
- void fastForEach(Object2IntMap, Consumer)
- Object2IntMap unmodifiable(Object2IntMap)
- Object2IntMap emptyMap()
- ObjectIterable fastIterable(Object2IntMap)
- ObjectIterator fastIterator(Object2IntMap)
- Object2IntMap synchronize(Object2IntMap)
- Object2IntMap synchronize(Object2IntMap, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.Object2IntSortedMaps
Type: Class

Methods:
- Object2IntSortedMap singleton(Object, Integer)
- Object2IntSortedMap singleton(Object, Integer, Comparator)
- Object2IntSortedMap singleton(Object, int)
- Object2IntSortedMap singleton(Object, int, Comparator)
- Comparator entryComparator(Comparator)
- Object2IntSortedMap unmodifiable(Object2IntSortedMap)
- Object2IntSortedMap emptyMap()
- ObjectBidirectionalIterable fastIterable(Object2IntSortedMap)
- ObjectBidirectionalIterator fastIterator(Object2IntSortedMap)
- Object2IntSortedMap synchronize(Object2IntSortedMap)
- Object2IntSortedMap synchronize(Object2IntSortedMap, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectArrayList
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectList
Implements: java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable

Methods:
- int compareTo(ObjectArrayList)
- int compareTo(List)
- int compareTo(Object)
- Collector toList()
- Object remove(int)
- boolean remove(Object)
- boolean removeAll(Collection)
- void trim()
- void trim(int)
- void addElements(int, Object[], int, int)
- Object get(int)
- ObjectArrayList of()
- ObjectArrayList of(Object[])
- Object[] toArray()
- Object[] toArray(Object[])
- Collector toListWithExpectedSize(int)
- int indexOf(Object)
- void add(int, Object)
- boolean add(Object)
- ObjectList subList(int, int)
- List subList(int, int)
- Object set(int, Object)
- ObjectSpliterator spliterator()
- Spliterator spliterator()
- void forEach(Consumer)
- boolean isEmpty()
- void clear()
- void setElements(int, Object[], int, int)
- void sort(Comparator)
- void removeElements(int, int)
- boolean removeIf(Predicate)
- int lastIndexOf(Object)
- int size()
- void size(int)
- boolean addAll(int, Collection)
- boolean addAll(int, ObjectList)
- boolean equals(ObjectArrayList)
- boolean equals(Object)
- void getElements(int, Object[], int, int)
- Object[] elements()
- ObjectArrayList clone()
- Object clone() throws CloneNotSupportedException
- ObjectListIterator listIterator(int)
- ListIterator listIterator(int)
- void ensureCapacity(int)
- ObjectArrayList wrap(Object[], int)
- ObjectArrayList wrap(Object[])
- void unstableSort(Comparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectArraySet
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectSet
Implements: java.io.Serializable, java.lang.Cloneable

Methods:
- boolean add(Object)
- boolean contains(Object)
- ObjectIterator iterator()
- Iterator iterator()
- ObjectArraySet ofUnchecked()
- ObjectArraySet ofUnchecked(Object[])
- int size()
- ObjectSpliterator spliterator()
- Spliterator spliterator()
- ObjectArraySet of()
- ObjectArraySet of(Object)
- ObjectArraySet of(Object[])
- ObjectArraySet clone()
- Object clone() throws CloneNotSupportedException
- Object[] toArray()
- Object[] toArray(Object[])
- boolean isEmpty()
- void clear()
- boolean remove(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectArrays
Type: Class

Methods:
- Object[] grow(Object[], int)
- Object[] grow(Object[], int, int)
- void swap(Object[], int, int)
- void swap(Object[], int, int, int)
- void parallelQuickSortIndirect(int[], Object[], int, int)
- void parallelQuickSortIndirect(int[], Object[])
- void ensureOffsetLength(Object[], int, int)
- int binarySearch(Object[], int, int, Object)
- int binarySearch(Object[], Object)
- int binarySearch(Object[], int, int, Object, Comparator)
- int binarySearch(Object[], Object, Comparator)
- void ensureFromTo(Object[], int, int)
- Object[] reverse(Object[])
- Object[] reverse(Object[], int, int)
- void mergeSort(Object[], int, int, Object[])
- void mergeSort(Object[], int, int)
- void mergeSort(Object[])
- void mergeSort(Object[], int, int, Comparator, Object[])
- void mergeSort(Object[], int, int, Comparator)
- void mergeSort(Object[], Comparator)
- void quickSort(Object[], int, int, Comparator)
- void quickSort(Object[], Comparator)
- void quickSort(Object[], int, int)
- void quickSort(Object[])
- void quickSort(Object[], Object[], int, int)
- void quickSort(Object[], Object[])
- void fill(Object[], Object)
- void fill(Object[], int, int, Object)
- Object[] forceCapacity(Object[], int, int)
- void stableSort(Object[], int, int)
- void stableSort(Object[])
- void stableSort(Object[], int, int, Comparator)
- void stableSort(Object[], Comparator)
- Object[] setLength(Object[], int)
- void quickSortIndirect(int[], Object[], int, int)
- void quickSortIndirect(int[], Object[])
- Object[] trim(Object[], int)
- boolean equals(Object[], Object[])
- void stabilize(int[], Object[], int, int)
- void stabilize(int[], Object[])
- void parallelQuickSort(Object[], int, int, Comparator)
- void parallelQuickSort(Object[], Comparator)
- void parallelQuickSort(Object[], int, int)
- void parallelQuickSort(Object[])
- void parallelQuickSort(Object[], Object[], int, int)
- void parallelQuickSort(Object[], Object[])
- Object[] copy(Object[], int, int)
- Object[] copy(Object[])
- Object[] ensureCapacity(Object[], int)
- Object[] ensureCapacity(Object[], int, int)
- Object[] shuffle(Object[], int, int, Random)
- Object[] shuffle(Object[], Random)
- void unstableSort(Object[], int, int)
- void unstableSort(Object[])
- void unstableSort(Object[], int, int, Comparator)
- void unstableSort(Object[], Comparator)
- void ensureSameLength(Object[], Object[])

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectBigArrays
Type: Class

Methods:
- Object[][] grow(Object[][], long)
- Object[][] grow(Object[][], long, long)
- void set(Object[][], long, Object)
- void swap(Object[][], long, long)
- long length(Object[][])
- void ensureOffsetLength(Object[][], long, long)
- long binarySearch(Object[][], long, long, Object)
- long binarySearch(Object[][], Object)
- long binarySearch(Object[][], long, long, Object, Comparator)
- long binarySearch(Object[][], Object, Comparator)
- void ensureFromTo(Object[][], long, long)
- void quickSort(Object[][], long, long, Comparator)
- void quickSort(Object[][], Comparator)
- void quickSort(Object[][], long, long)
- void quickSort(Object[][])
- void fill(Object[][], Object)
- void fill(Object[][], long, long, Object)
- Object[][] forceCapacity(Object[][], long, long)
- Object[][] newBigArray(Object[][], long)
- Object[][] newBigArray(Class, long)
- Object[][] newBigArray(long)
- void copyToBig(Object[], int, Object[][], long, long)
- Object[][] setLength(Object[][], long)
- void copyFromBig(Object[][], long, Object[], int, int)
- Object[][] trim(Object[][], long)
- boolean equals(Object[][], Object[][])
- Object get(Object[][], long)
- void parallelQuickSort(Object[][], long, long)
- void parallelQuickSort(Object[][])
- void parallelQuickSort(Object[][], long, long, Comparator)
- void parallelQuickSort(Object[][], Comparator)
- String toString(Object[][])
- Object[][] ensureCapacity(Object[][], long)
- Object[][] ensureCapacity(Object[][], long, long)
- void copy(Object[][], long, Object[][], long, long)
- Object[][] copy(Object[][], long, long)
- Object[][] copy(Object[][])
- Object[][] shuffle(Object[][], long, long, Random)
- Object[][] shuffle(Object[][], Random)
- Object[][] wrap(Object[])
- void ensureSameLength(Object[][], Object[][])

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectCollections
Type: Class

Methods:
- ObjectCollection asCollection(ObjectIterable)
- ObjectCollection unmodifiable(ObjectCollection)
- ObjectCollection synchronize(ObjectCollection)
- ObjectCollection synchronize(ObjectCollection, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectComparators
Type: Class

Methods:
- Comparator oppositeComparator(Comparator)
- Comparator asObjectComparator(Comparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectImmutableList
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectLists$ImmutableListBase
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectList, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable

Methods:
- ObjectList subList(int, int)
- List subList(int, int)
- ObjectSpliterator spliterator()
- Spliterator spliterator()
- void forEach(Consumer)
- boolean isEmpty()
- int compareTo(ObjectImmutableList)
- int compareTo(List)
- int compareTo(Object)
- Collector toList()
- int lastIndexOf(Object)
- int size()
- boolean equals(ObjectImmutableList)
- boolean equals(Object)
- void getElements(int, Object[], int, int)
- Object get(int)
- ObjectImmutableList of()
- ObjectImmutableList of(Object[])
- ObjectImmutableList clone()
- Object clone() throws CloneNotSupportedException
- Object[] toArray()
- Object[] toArray(Object[])
- ObjectListIterator listIterator(int)
- ListIterator listIterator(int)
- Collector toListWithExpectedSize(int)
- int indexOf(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectIntImmutablePair
Type: Class
Implements: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectIntPair, java.io.Serializable

Methods:
- int rightInt()
- Object left()
- int hashCode()
- boolean equals(Object)
- ObjectIntImmutablePair of(Object, int)
- String toString()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectIterators
Type: Class

Methods:
- boolean all(Iterator, Predicate)
- ObjectListIterator singleton(Object)
- ObjectIterator emptyIterator()
- ObjectIterator unmodifiable(ObjectIterator)
- ObjectBidirectionalIterator unmodifiable(ObjectBidirectionalIterator)
- ObjectListIterator unmodifiable(ObjectListIterator)
- ObjectIterator asObjectIterator(Iterator)
- ObjectListIterator asObjectIterator(ListIterator)
- int pour(Iterator, ObjectCollection, int)
- int pour(Iterator, ObjectCollection)
- ObjectList pour(Iterator, int)
- ObjectList pour(Iterator)
- ObjectIterator concat(ObjectIterator[])
- ObjectIterator concat(ObjectIterator[], int, int)
- int indexOf(Iterator, Predicate)
- boolean any(Iterator, Predicate)
- Object[][] unwrapBig(Iterator, long)
- Object[][] unwrapBig(Iterator)
- ObjectListIterator wrap(Object[], int, int)
- ObjectListIterator wrap(Object[])
- int unwrap(Iterator, Object[], int, int)
- int unwrap(Iterator, Object[])
- Object[] unwrap(Iterator, int)
- Object[] unwrap(Iterator)
- long unwrap(Iterator, Object[][], long, long)
- long unwrap(Iterator, Object[][])
- int unwrap(Iterator, ObjectCollection, int)
- long unwrap(Iterator, ObjectCollection)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectLists
Type: Class

Methods:
- ObjectList singleton(Object)
- ObjectList emptyList()
- ObjectList unmodifiable(ObjectList)
- ObjectList shuffle(ObjectList, Random)
- ObjectList synchronize(ObjectList)
- ObjectList synchronize(ObjectList, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectObjectImmutablePair
Type: Class
Implements: com.sk89q.worldedit.bukkit.fastutil.Pair, java.io.Serializable

Methods:
- Object left()
- int hashCode()
- boolean equals(Object)
- ObjectObjectImmutablePair of(Object, Object)
- String toString()
- Object right()

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectOpenHashSet
Type: Class
Extends: com.sk89q.worldedit.bukkit.fastutil.objects.AbstractObjectSet
Implements: java.io.Serializable, java.lang.Cloneable, com.sk89q.worldedit.bukkit.fastutil.Hash

Methods:
- boolean add(Object)
- Object addOrGet(Object)
- ObjectSpliterator spliterator()
- Spliterator spliterator()
- void forEach(Consumer)
- boolean isEmpty()
- void clear()
- Collector toSetWithExpectedSize(int)
- boolean remove(Object)
- Collector toSet()
- ObjectIterator iterator()
- Iterator iterator()
- boolean contains(Object)
- boolean trim()
- boolean trim(int)
- int size()
- boolean addAll(Collection)
- int hashCode()
- Object get(Object)
- ObjectOpenHashSet of()
- ObjectOpenHashSet of(Object)
- ObjectOpenHashSet of(Object, Object)
- ObjectOpenHashSet of(Object, Object, Object)
- ObjectOpenHashSet of(Object[])
- ObjectOpenHashSet clone()
- Object clone() throws CloneNotSupportedException
- void ensureCapacity(int)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectSets
Type: Class

Methods:
- ObjectSet singleton(Object)
- ObjectSet emptySet()
- ObjectSet unmodifiable(ObjectSet)
- ObjectSet synchronize(ObjectSet)
- ObjectSet synchronize(ObjectSet, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectSortedSets
Type: Class

Methods:
- ObjectSortedSet singleton(Object)
- ObjectSortedSet singleton(Object, Comparator)
- ObjectSortedSet emptySet()
- ObjectSortedSet unmodifiable(ObjectSortedSet)
- ObjectSortedSet synchronize(ObjectSortedSet)
- ObjectSortedSet synchronize(ObjectSortedSet, Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.objects.ObjectSpliterators
Type: Class

Methods:
- ObjectSpliterator asSpliteratorFromSortedUnknownSize(ObjectIterator, int, Comparator)
- ObjectSpliterator singleton(Object)
- ObjectSpliterator singleton(Object, Comparator)
- ObjectSpliterator asSpliteratorUnknownSize(ObjectIterator, int)
- ObjectSpliterator asSpliteratorFromSorted(ObjectIterator, long, int, Comparator)
- ObjectIterator asIterator(ObjectSpliterator)
- ObjectSpliterator wrapPreSorted(Object[], int, int, int, Comparator)
- ObjectSpliterator wrapPreSorted(Object[], int, int, Comparator)
- ObjectSpliterator wrapPreSorted(Object[], Comparator)
- ObjectSpliterator emptySpliterator()
- ObjectSpliterator concat(ObjectSpliterator[])
- ObjectSpliterator concat(ObjectSpliterator[], int, int)
- void onEachMatching(Spliterator, Predicate, Consumer)
- ObjectSpliterator asObjectSpliterator(Spliterator)
- ObjectSpliterator asObjectSpliterator(Spliterator, Comparator)
- ObjectSpliterator wrap(Object[], int, int)
- ObjectSpliterator wrap(Object[])
- ObjectSpliterator wrap(Object[], int, int, int)
- ObjectSpliterator asSpliterator(ObjectIterator, long, int)

## Package: com.sk89q.worldedit.bukkit.fastutil.shorts

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.Short2BooleanFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntPredicate

Methods:
- boolean getOrDefault(short, boolean)
- Boolean getOrDefault(Object, Boolean)
- Object getOrDefault(Object, Object)
- Short2ShortFunction andThenShort(Boolean2ShortFunction)
- Byte2BooleanFunction composeByte(Byte2ShortFunction)
- Short2IntFunction andThenInt(Boolean2IntFunction)
- Reference2BooleanFunction composeReference(Reference2ShortFunction)
- Function andThen(Function)
- boolean remove(short)
- Boolean remove(Object)
- Object remove(Object)
- boolean put(short, boolean)
- Boolean put(Short, Boolean)
- Object put(Object, Object)
- void defaultReturnValue(boolean)
- boolean defaultReturnValue()
- Short2DoubleFunction andThenDouble(Boolean2DoubleFunction)
- Short2ObjectFunction andThenObject(Boolean2ObjectFunction)
- boolean get(short)
- Boolean get(Object)
- Object get(Object)
- Short2LongFunction andThenLong(Boolean2LongFunction)
- Long2BooleanFunction composeLong(Long2ShortFunction)
- Short2ByteFunction andThenByte(Boolean2ByteFunction)
- Short2FloatFunction andThenFloat(Boolean2FloatFunction)
- boolean test(int)
- boolean containsKey(short)
- boolean containsKey(Object)
- Int2BooleanFunction composeInt(Int2ShortFunction)
- Float2BooleanFunction composeFloat(Float2ShortFunction)
- Short2CharFunction andThenChar(Boolean2CharFunction)
- Object2BooleanFunction composeObject(Object2ShortFunction)
- Function compose(Function)
- Short2BooleanFunction composeShort(Short2ShortFunction)
- Short2ReferenceFunction andThenReference(Boolean2ReferenceFunction)
- Char2BooleanFunction composeChar(Char2ShortFunction)
- Double2BooleanFunction composeDouble(Double2ShortFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.Short2ByteFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- byte getOrDefault(short, byte)
- Byte getOrDefault(Object, Byte)
- Object getOrDefault(Object, Object)
- Short2ShortFunction andThenShort(Byte2ShortFunction)
- Byte2ByteFunction composeByte(Byte2ShortFunction)
- Short2IntFunction andThenInt(Byte2IntFunction)
- Reference2ByteFunction composeReference(Reference2ShortFunction)
- Function andThen(Function)
- byte remove(short)
- Byte remove(Object)
- Object remove(Object)
- byte put(short, byte)
- Byte put(Short, Byte)
- Object put(Object, Object)
- void defaultReturnValue(byte)
- byte defaultReturnValue()
- Short2DoubleFunction andThenDouble(Byte2DoubleFunction)
- Short2ObjectFunction andThenObject(Byte2ObjectFunction)
- byte get(short)
- Byte get(Object)
- Object get(Object)
- Short2LongFunction andThenLong(Byte2LongFunction)
- Long2ByteFunction composeLong(Long2ShortFunction)
- Short2ByteFunction andThenByte(Byte2ByteFunction)
- Short2FloatFunction andThenFloat(Byte2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(short)
- boolean containsKey(Object)
- Int2ByteFunction composeInt(Int2ShortFunction)
- Float2ByteFunction composeFloat(Float2ShortFunction)
- Short2CharFunction andThenChar(Byte2CharFunction)
- Object2ByteFunction composeObject(Object2ShortFunction)
- Function compose(Function)
- Short2ByteFunction composeShort(Short2ShortFunction)
- Short2ReferenceFunction andThenReference(Byte2ReferenceFunction)
- Char2ByteFunction composeChar(Char2ShortFunction)
- Double2ByteFunction composeDouble(Double2ShortFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.Short2CharFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- char getOrDefault(short, char)
- Character getOrDefault(Object, Character)
- Object getOrDefault(Object, Object)
- Short2ShortFunction andThenShort(Char2ShortFunction)
- Byte2CharFunction composeByte(Byte2ShortFunction)
- Short2IntFunction andThenInt(Char2IntFunction)
- Reference2CharFunction composeReference(Reference2ShortFunction)
- Function andThen(Function)
- char remove(short)
- Character remove(Object)
- Object remove(Object)
- char put(short, char)
- Character put(Short, Character)
- Object put(Object, Object)
- void defaultReturnValue(char)
- char defaultReturnValue()
- Short2DoubleFunction andThenDouble(Char2DoubleFunction)
- Short2ObjectFunction andThenObject(Char2ObjectFunction)
- char get(short)
- Character get(Object)
- Object get(Object)
- Short2LongFunction andThenLong(Char2LongFunction)
- Long2CharFunction composeLong(Long2ShortFunction)
- Short2ByteFunction andThenByte(Char2ByteFunction)
- Short2FloatFunction andThenFloat(Char2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(short)
- boolean containsKey(Object)
- Int2CharFunction composeInt(Int2ShortFunction)
- Float2CharFunction composeFloat(Float2ShortFunction)
- Short2CharFunction andThenChar(Char2CharFunction)
- Object2CharFunction composeObject(Object2ShortFunction)
- Function compose(Function)
- Short2CharFunction composeShort(Short2ShortFunction)
- Short2ReferenceFunction andThenReference(Char2ReferenceFunction)
- Char2CharFunction composeChar(Char2ShortFunction)
- Double2CharFunction composeDouble(Double2ShortFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.Short2DoubleFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToDoubleFunction

Methods:
- double getOrDefault(short, double)
- Double getOrDefault(Object, Double)
- Object getOrDefault(Object, Object)
- double applyAsDouble(int)
- Short2ShortFunction andThenShort(Double2ShortFunction)
- Byte2DoubleFunction composeByte(Byte2ShortFunction)
- Short2IntFunction andThenInt(Double2IntFunction)
- Reference2DoubleFunction composeReference(Reference2ShortFunction)
- Function andThen(Function)
- double remove(short)
- Double remove(Object)
- Object remove(Object)
- double put(short, double)
- Double put(Short, Double)
- Object put(Object, Object)
- void defaultReturnValue(double)
- double defaultReturnValue()
- Short2DoubleFunction andThenDouble(Double2DoubleFunction)
- Short2ObjectFunction andThenObject(Double2ObjectFunction)
- double get(short)
- Double get(Object)
- Object get(Object)
- Short2LongFunction andThenLong(Double2LongFunction)
- Long2DoubleFunction composeLong(Long2ShortFunction)
- Short2ByteFunction andThenByte(Double2ByteFunction)
- Short2FloatFunction andThenFloat(Double2FloatFunction)
- boolean containsKey(short)
- boolean containsKey(Object)
- Int2DoubleFunction composeInt(Int2ShortFunction)
- Float2DoubleFunction composeFloat(Float2ShortFunction)
- Short2CharFunction andThenChar(Double2CharFunction)
- Object2DoubleFunction composeObject(Object2ShortFunction)
- Function compose(Function)
- Short2DoubleFunction composeShort(Short2ShortFunction)
- Short2ReferenceFunction andThenReference(Double2ReferenceFunction)
- Char2DoubleFunction composeChar(Char2ShortFunction)
- Double2DoubleFunction composeDouble(Double2ShortFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.Short2FloatFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToDoubleFunction

Methods:
- float getOrDefault(short, float)
- Float getOrDefault(Object, Float)
- Object getOrDefault(Object, Object)
- double applyAsDouble(int)
- Short2ShortFunction andThenShort(Float2ShortFunction)
- Byte2FloatFunction composeByte(Byte2ShortFunction)
- Short2IntFunction andThenInt(Float2IntFunction)
- Reference2FloatFunction composeReference(Reference2ShortFunction)
- Function andThen(Function)
- float remove(short)
- Float remove(Object)
- Object remove(Object)
- float put(short, float)
- Float put(Short, Float)
- Object put(Object, Object)
- void defaultReturnValue(float)
- float defaultReturnValue()
- Short2DoubleFunction andThenDouble(Float2DoubleFunction)
- Short2ObjectFunction andThenObject(Float2ObjectFunction)
- float get(short)
- Float get(Object)
- Object get(Object)
- Short2LongFunction andThenLong(Float2LongFunction)
- Long2FloatFunction composeLong(Long2ShortFunction)
- Short2ByteFunction andThenByte(Float2ByteFunction)
- Short2FloatFunction andThenFloat(Float2FloatFunction)
- boolean containsKey(short)
- boolean containsKey(Object)
- Int2FloatFunction composeInt(Int2ShortFunction)
- Float2FloatFunction composeFloat(Float2ShortFunction)
- Short2CharFunction andThenChar(Float2CharFunction)
- Object2FloatFunction composeObject(Object2ShortFunction)
- Function compose(Function)
- Short2FloatFunction composeShort(Short2ShortFunction)
- Short2ReferenceFunction andThenReference(Float2ReferenceFunction)
- Char2FloatFunction composeChar(Char2ShortFunction)
- Double2FloatFunction composeDouble(Double2ShortFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.Short2IntFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- int getOrDefault(short, int)
- Integer getOrDefault(Object, Integer)
- Object getOrDefault(Object, Object)
- Short2ShortFunction andThenShort(Int2ShortFunction)
- Byte2IntFunction composeByte(Byte2ShortFunction)
- Short2IntFunction andThenInt(Int2IntFunction)
- Reference2IntFunction composeReference(Reference2ShortFunction)
- Function andThen(Function)
- int remove(short)
- Integer remove(Object)
- Object remove(Object)
- int put(short, int)
- Integer put(Short, Integer)
- Object put(Object, Object)
- void defaultReturnValue(int)
- int defaultReturnValue()
- Short2DoubleFunction andThenDouble(Int2DoubleFunction)
- Short2ObjectFunction andThenObject(Int2ObjectFunction)
- int get(short)
- Integer get(Object)
- Object get(Object)
- Short2LongFunction andThenLong(Int2LongFunction)
- Long2IntFunction composeLong(Long2ShortFunction)
- Short2ByteFunction andThenByte(Int2ByteFunction)
- Short2FloatFunction andThenFloat(Int2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(short)
- boolean containsKey(Object)
- Int2IntFunction composeInt(Int2ShortFunction)
- Float2IntFunction composeFloat(Float2ShortFunction)
- Short2CharFunction andThenChar(Int2CharFunction)
- Object2IntFunction composeObject(Object2ShortFunction)
- Function compose(Function)
- Short2IntFunction composeShort(Short2ShortFunction)
- Short2ReferenceFunction andThenReference(Int2ReferenceFunction)
- Char2IntFunction composeChar(Char2ShortFunction)
- Double2IntFunction composeDouble(Double2ShortFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.Short2LongFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntToLongFunction

Methods:
- long getOrDefault(short, long)
- Long getOrDefault(Object, Long)
- Object getOrDefault(Object, Object)
- Short2ShortFunction andThenShort(Long2ShortFunction)
- Byte2LongFunction composeByte(Byte2ShortFunction)
- Short2IntFunction andThenInt(Long2IntFunction)
- Reference2LongFunction composeReference(Reference2ShortFunction)
- Function andThen(Function)
- long remove(short)
- Long remove(Object)
- Object remove(Object)
- long put(short, long)
- Long put(Short, Long)
- Object put(Object, Object)
- void defaultReturnValue(long)
- long defaultReturnValue()
- Short2DoubleFunction andThenDouble(Long2DoubleFunction)
- Short2ObjectFunction andThenObject(Long2ObjectFunction)
- long get(short)
- Long get(Object)
- Object get(Object)
- Short2LongFunction andThenLong(Long2LongFunction)
- Long2LongFunction composeLong(Long2ShortFunction)
- Short2ByteFunction andThenByte(Long2ByteFunction)
- Short2FloatFunction andThenFloat(Long2FloatFunction)
- boolean containsKey(short)
- boolean containsKey(Object)
- Int2LongFunction composeInt(Int2ShortFunction)
- Float2LongFunction composeFloat(Float2ShortFunction)
- Short2CharFunction andThenChar(Long2CharFunction)
- long applyAsLong(int)
- Object2LongFunction composeObject(Object2ShortFunction)
- Function compose(Function)
- Short2LongFunction composeShort(Short2ShortFunction)
- Short2ReferenceFunction andThenReference(Long2ReferenceFunction)
- Char2LongFunction composeChar(Char2ShortFunction)
- Double2LongFunction composeDouble(Double2ShortFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.Short2ObjectFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntFunction

Methods:
- Object getOrDefault(short, Object)
- Object getOrDefault(Object, Object)
- Short2ShortFunction andThenShort(Object2ShortFunction)
- Byte2ObjectFunction composeByte(Byte2ShortFunction)
- Short2IntFunction andThenInt(Object2IntFunction)
- Reference2ObjectFunction composeReference(Reference2ShortFunction)
- Object remove(short)
- Object remove(Object)
- Object put(short, Object)
- Object put(Short, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Short2DoubleFunction andThenDouble(Object2DoubleFunction)
- Short2ObjectFunction andThenObject(Object2ObjectFunction)
- Object get(short)
- Object get(Object)
- Short2LongFunction andThenLong(Object2LongFunction)
- Long2ObjectFunction composeLong(Long2ShortFunction)
- Short2ByteFunction andThenByte(Object2ByteFunction)
- Short2FloatFunction andThenFloat(Object2FloatFunction)
- Object apply(int)
- boolean containsKey(short)
- boolean containsKey(Object)
- Int2ObjectFunction composeInt(Int2ShortFunction)
- Float2ObjectFunction composeFloat(Float2ShortFunction)
- Short2CharFunction andThenChar(Object2CharFunction)
- Object2ObjectFunction composeObject(Object2ShortFunction)
- Function compose(Function)
- Short2ObjectFunction composeShort(Short2ShortFunction)
- Short2ReferenceFunction andThenReference(Object2ReferenceFunction)
- Char2ObjectFunction composeChar(Char2ShortFunction)
- Double2ObjectFunction composeDouble(Double2ShortFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.Short2ReferenceFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntFunction

Methods:
- Object getOrDefault(short, Object)
- Object getOrDefault(Object, Object)
- Short2ShortFunction andThenShort(Reference2ShortFunction)
- Byte2ReferenceFunction composeByte(Byte2ShortFunction)
- Short2IntFunction andThenInt(Reference2IntFunction)
- Reference2ReferenceFunction composeReference(Reference2ShortFunction)
- Object remove(short)
- Object remove(Object)
- Object put(short, Object)
- Object put(Short, Object)
- Object put(Object, Object)
- void defaultReturnValue(Object)
- Object defaultReturnValue()
- Short2DoubleFunction andThenDouble(Reference2DoubleFunction)
- Short2ObjectFunction andThenObject(Reference2ObjectFunction)
- Object get(short)
- Object get(Object)
- Short2LongFunction andThenLong(Reference2LongFunction)
- Long2ReferenceFunction composeLong(Long2ShortFunction)
- Short2ByteFunction andThenByte(Reference2ByteFunction)
- Short2FloatFunction andThenFloat(Reference2FloatFunction)
- Object apply(int)
- boolean containsKey(short)
- boolean containsKey(Object)
- Int2ReferenceFunction composeInt(Int2ShortFunction)
- Float2ReferenceFunction composeFloat(Float2ShortFunction)
- Short2CharFunction andThenChar(Reference2CharFunction)
- Object2ReferenceFunction composeObject(Object2ShortFunction)
- Function compose(Function)
- Short2ReferenceFunction composeShort(Short2ShortFunction)
- Short2ReferenceFunction andThenReference(Reference2ReferenceFunction)
- Char2ReferenceFunction composeChar(Char2ShortFunction)
- Double2ReferenceFunction composeDouble(Double2ShortFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.Short2ShortFunction
Type: Interface
Implements: com.sk89q.worldedit.bukkit.fastutil.Function, java.util.function.IntUnaryOperator

Methods:
- short getOrDefault(short, short)
- Short getOrDefault(Object, Short)
- Object getOrDefault(Object, Object)
- Short2ShortFunction andThenShort(Short2ShortFunction)
- Byte2ShortFunction composeByte(Byte2ShortFunction)
- Short2IntFunction andThenInt(Short2IntFunction)
- Reference2ShortFunction composeReference(Reference2ShortFunction)
- Function andThen(Function)
- short remove(short)
- Short remove(Object)
- Object remove(Object)
- short put(short, short)
- Short put(Short, Short)
- Object put(Object, Object)
- void defaultReturnValue(short)
- short defaultReturnValue()
- Short2DoubleFunction andThenDouble(Short2DoubleFunction)
- Short2ObjectFunction andThenObject(Short2ObjectFunction)
- Short2ShortFunction identity()
- short get(short)
- Short get(Object)
- Object get(Object)
- Short2LongFunction andThenLong(Short2LongFunction)
- Long2ShortFunction composeLong(Long2ShortFunction)
- Short2ByteFunction andThenByte(Short2ByteFunction)
- Short2FloatFunction andThenFloat(Short2FloatFunction)
- int applyAsInt(int)
- boolean containsKey(short)
- boolean containsKey(Object)
- Int2ShortFunction composeInt(Int2ShortFunction)
- Float2ShortFunction composeFloat(Float2ShortFunction)
- Short2CharFunction andThenChar(Short2CharFunction)
- Object2ShortFunction composeObject(Object2ShortFunction)
- Function compose(Function)
- Short2ShortFunction composeShort(Short2ShortFunction)
- Short2ReferenceFunction andThenReference(Short2ReferenceFunction)
- Char2ShortFunction composeChar(Char2ShortFunction)
- Double2ShortFunction composeDouble(Double2ShortFunction)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.ShortComparator
Type: Interface
Implements: java.util.Comparator

Methods:
- ShortComparator comparingDouble(Short2DoubleFunction)
- int compare(short, short)
- int compare(Short, Short)
- int compare(Object, Object)
- ShortComparator comparingLong(Short2LongFunction)
- ShortComparator thenComparing(ShortComparator)
- Comparator thenComparing(Comparator)
- ShortComparator comparingInt(Short2IntFunction)
- ShortComparator comparing(Short2ObjectFunction)
- ShortComparator comparing(Short2ObjectFunction, Comparator)
- ShortComparator reversed()
- Comparator reversed()

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.ShortConsumer
Type: Interface
Implements: java.util.function.Consumer, java.util.function.IntConsumer

Methods:
- ShortConsumer andThen(ShortConsumer)
- ShortConsumer andThen(IntConsumer)
- Consumer andThen(Consumer)
- IntConsumer andThen(IntConsumer)
- void accept(short)
- void accept(int)
- void accept(Short)
- void accept(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.ShortIterator
Type: Interface
Implements: java.util.PrimitiveIterator

Methods:
- Short next()
- Object next()
- short nextShort()
- int skip(int)
- void forEachRemaining(ShortConsumer)
- void forEachRemaining(IntConsumer)
- void forEachRemaining(Consumer)
- void forEachRemaining(Object)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.ShortSpliterator
Type: Interface
Implements: java.util.Spliterator$OfPrimitive

Methods:
- ShortSpliterator trySplit()
- Spliterator$OfPrimitive trySplit()
- Spliterator trySplit()
- boolean tryAdvance(Consumer)
- ShortComparator getComparator()
- Comparator getComparator()
- long skip(long)
- void forEachRemaining(Consumer)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.ShortArrays
Type: Class

Methods:
- int binarySearch(short[], int, int, short)
- int binarySearch(short[], short)
- int binarySearch(short[], int, int, short, ShortComparator)
- int binarySearch(short[], short, ShortComparator)
- void ensureFromTo(short[], int, int)
- void mergeSort(short[], int, int, short[])
- void mergeSort(short[], int, int)
- void mergeSort(short[])
- void mergeSort(short[], int, int, ShortComparator, short[])
- void mergeSort(short[], int, int, ShortComparator)
- void mergeSort(short[], ShortComparator)
- short[] forceCapacity(short[], int, int)
- void radixSortIndirect(int[], short[], boolean)
- void radixSortIndirect(int[], short[], int, int, boolean)
- void radixSortIndirect(int[], short[], short[], boolean)
- void radixSortIndirect(int[], short[], short[], int, int, boolean)
- void stableSort(short[], int, int)
- void stableSort(short[])
- void stableSort(short[], int, int, ShortComparator)
- void stableSort(short[], ShortComparator)
- short[] trim(short[], int)
- void parallelQuickSort(short[], int, int, ShortComparator)
- void parallelQuickSort(short[], ShortComparator)
- void parallelQuickSort(short[], int, int)
- void parallelQuickSort(short[])
- void parallelQuickSort(short[], short[], int, int)
- void parallelQuickSort(short[], short[])
- short[] copy(short[], int, int)
- short[] copy(short[])
- void ensureSameLength(short[], short[])
- short[] grow(short[], int)
- short[] grow(short[], int, int)
- void parallelRadixSort(short[], int, int)
- void parallelRadixSort(short[])
- void parallelRadixSort(short[], short[], int, int)
- void parallelRadixSort(short[], short[])
- void swap(short[], int, int)
- void swap(short[], int, int, int)
- void parallelQuickSortIndirect(int[], short[], int, int)
- void parallelQuickSortIndirect(int[], short[])
- void ensureOffsetLength(short[], int, int)
- void radixSort(short[])
- void radixSort(short[], int, int)
- void radixSort(short[], short[])
- void radixSort(short[], short[], int, int)
- void radixSort(short[][])
- void radixSort(short[][], int, int)
- short[] reverse(short[])
- short[] reverse(short[], int, int)
- void quickSort(short[], int, int, ShortComparator)
- void quickSort(short[], ShortComparator)
- void quickSort(short[], int, int)
- void quickSort(short[])
- void quickSort(short[], short[], int, int)
- void quickSort(short[], short[])
- void fill(short[], short)
- void fill(short[], int, int, short)
- short[] setLength(short[], int)
- void quickSortIndirect(int[], short[], int, int)
- void quickSortIndirect(int[], short[])
- boolean equals(short[], short[])
- void stabilize(int[], short[], int, int)
- void stabilize(int[], short[])
- void parallelRadixSortIndirect(int[], short[], int, int, boolean)
- void parallelRadixSortIndirect(int[], short[], boolean)
- short[] ensureCapacity(short[], int)
- short[] ensureCapacity(short[], int, int)
- short[] shuffle(short[], int, int, Random)
- short[] shuffle(short[], Random)
- void unstableSort(short[], int, int)
- void unstableSort(short[])
- void unstableSort(short[], int, int, ShortComparator)
- void unstableSort(short[], ShortComparator)

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.ShortBigArrays
Type: Class

Methods:
- void mul(short[][], long, short)
- long binarySearch(short[][], long, long, short)
- long binarySearch(short[][], short)
- long binarySearch(short[][], long, long, short, ShortComparator)
- long binarySearch(short[][], short, ShortComparator)
- void ensureFromTo(short[][], long, long)
- short[][] forceCapacity(short[][], long, long)
- void radixSortIndirect(long[][], short[][], short[][], boolean)
- void radixSortIndirect(long[][], short[][], short[][], long, long, boolean)
- short[][] trim(short[][], long)
- short get(short[][], long)
- void parallelQuickSort(short[][], long, long)
- void parallelQuickSort(short[][])
- void parallelQuickSort(short[][], long, long, ShortComparator)
- void parallelQuickSort(short[][], ShortComparator)
- void copy(short[][], long, short[][], long, long)
- short[][] copy(short[][], long, long)
- short[][] copy(short[][])
- void ensureSameLength(short[][], short[][])
- void decr(short[][], long)
- void add(short[][], long, short)
- short[][] grow(short[][], long)
- short[][] grow(short[][], long, long)
- void set(short[][], long, short)
- void incr(short[][], long)
- void swap(short[][], long, long)
- long length(short[][])
- void ensureOffsetLength(short[][], long, long)
- void radixSort(short[][])
- void radixSort(short[][], long, long)
- void radixSort(short[][], short[][])
- void radixSort(short[][], short[][], long, long)
- void quickSort(short[][], long, long, ShortComparator)
- void quickSort(short[][], ShortComparator)
- void quickSort(short[][], long, long)
- void quickSort(short[][])
- void fill(short[][], short)
- void fill(short[][], long, long, short)
- short[][] newBigArray(long)
- void copyToBig(short[], int, short[][], long, long)
- short[][] setLength(short[][], long)
- void copyFromBig(short[][], long, short[], int, int)
- boolean equals(short[][], short[][])
- String toString(short[][])
- short[][] ensureCapacity(short[][], long)
- short[][] ensureCapacity(short[][], long, long)
- short[][] shuffle(short[][], long, long, Random)
- short[][] shuffle(short[][], Random)
- short[][] wrap(short[])

### Class: com.sk89q.worldedit.bukkit.fastutil.shorts.ShortComparators
Type: Class

Methods:
- ShortComparator oppositeComparator(ShortComparator)
- ShortComparator asShortComparator(Comparator)

## Package: com.sk89q.worldedit.bukkit.paperlib

### Class: com.sk89q.worldedit.bukkit.paperlib.PaperLib
Type: Class

Methods:
- boolean isPaper()
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)
- CompletableFuture getChunkAtAsync(Location)
- CompletableFuture getChunkAtAsync(Location, boolean)
- CompletableFuture getChunkAtAsync(World, int, int)
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)
- int getMinecraftVersion()
- boolean isVersion(int)
- boolean isVersion(int, int)
- Environment getEnvironment()
- int getMinecraftReleaseCandidateVersion()
- int getMinecraftPatchVersion()
- CompletableFuture teleportAsync(Entity, Location)
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)
- boolean isSpigot()
- CompletableFuture getChunkAtAsyncUrgently(World, int, int, boolean)
- boolean isChunkGenerated(Location)
- boolean isChunkGenerated(World, int, int)
- void setCustomEnvironment(Environment)
- void suggestPaper(Plugin)
- void suggestPaper(Plugin, Level)
- BlockStateSnapshotResult getBlockState(Block, boolean)
- int getMinecraftPreReleaseVersion()
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

## Package: com.sk89q.worldedit.bukkit.paperlib.environments

### Class: com.sk89q.worldedit.bukkit.paperlib.environments.CraftBukkitEnvironment
Type: Class
Extends: com.sk89q.worldedit.bukkit.paperlib.environments.Environment

Methods:
- String getName()

### Class: com.sk89q.worldedit.bukkit.paperlib.environments.Environment
Type: Abstract Class

Methods:
- boolean isPaper()
- String getName()
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)
- CompletableFuture teleport(Entity, Location, PlayerTeleportEvent$TeleportCause)
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)
- int getMinecraftVersion()
- boolean isVersion(int)
- boolean isVersion(int, int)
- int getMinecraftReleaseCandidateVersion()
- int getMinecraftPatchVersion()
- boolean isSpigot()
- CompletableFuture getChunkAtAsyncUrgently(World, int, int, boolean)
- boolean isChunkGenerated(World, int, int)
- BlockStateSnapshotResult getBlockState(Block, boolean)
- int getMinecraftPreReleaseVersion()
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.environments.PaperEnvironment
Type: Class
Extends: com.sk89q.worldedit.bukkit.paperlib.environments.SpigotEnvironment

Methods:
- boolean isPaper()
- String getName()

### Class: com.sk89q.worldedit.bukkit.paperlib.environments.SpigotEnvironment
Type: Class
Extends: com.sk89q.worldedit.bukkit.paperlib.environments.CraftBukkitEnvironment

Methods:
- String getName()
- boolean isSpigot()

## Package: com.sk89q.worldedit.bukkit.paperlib.features.asyncchunks

### Class: com.sk89q.worldedit.bukkit.paperlib.features.asyncchunks.AsyncChunks
Type: Interface

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean)
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.asyncchunks.AsyncChunksPaper_13
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.asyncchunks.AsyncChunksPaper_15
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.asyncchunks.AsyncChunksPaper_9_12
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.asyncchunks.AsyncChunksSync
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture getChunkAtAsync(World, int, int, boolean, boolean)

## Package: com.sk89q.worldedit.bukkit.paperlib.features.asyncteleport

### Class: com.sk89q.worldedit.bukkit.paperlib.features.asyncteleport.AsyncTeleport
Type: Interface

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.asyncteleport.AsyncTeleportPaper
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.asyncteleport.AsyncTeleportPaper_13
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.asyncteleport.AsyncTeleportSync
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

## Package: com.sk89q.worldedit.bukkit.paperlib.features.bedspawnlocation

### Class: com.sk89q.worldedit.bukkit.paperlib.features.bedspawnlocation.BedSpawnLocation
Type: Interface

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.bedspawnlocation.BedSpawnLocationPaper
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.bedspawnlocation.BedSpawnLocation

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.bedspawnlocation.BedSpawnLocationSync
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.bedspawnlocation.BedSpawnLocation

Methods:
- CompletableFuture getBedSpawnLocationAsync(Player, boolean)

## Package: com.sk89q.worldedit.bukkit.paperlib.features.blockstatesnapshot

### Class: com.sk89q.worldedit.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshot
Type: Interface

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshotBeforeSnapshots
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshotNoOption
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshotOptionalSnapshots
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.blockstatesnapshot.BlockStateSnapshotResult
Type: Class

Methods:
- BlockState getState()
- boolean isSnapshot()

## Package: com.sk89q.worldedit.bukkit.paperlib.features.chunkisgenerated

### Class: com.sk89q.worldedit.bukkit.paperlib.features.chunkisgenerated.ChunkIsGenerated
Type: Interface

Methods:
- boolean isChunkGenerated(World, int, int)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.chunkisgenerated.ChunkIsGeneratedApiExists
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.chunkisgenerated.ChunkIsGenerated

Methods:
- boolean isChunkGenerated(World, int, int)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.chunkisgenerated.ChunkIsGeneratedUnknown
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.chunkisgenerated.ChunkIsGenerated

Methods:
- boolean isChunkGenerated(World, int, int)

## Package: com.sk89q.worldedit.bukkit.paperlib.features.inventoryholdersnapshot

### Class: com.sk89q.worldedit.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot
Type: Interface

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotBeforeSnapshots
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotNoOption
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotOptionalSnapshots
Type: Class
Implements: com.sk89q.worldedit.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: com.sk89q.worldedit.bukkit.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotResult
Type: Class

Methods:
- boolean isSnapshot()
- InventoryHolder getHolder()

## Package: com.sk89q.worldedit.command

### Class: com.sk89q.worldedit.command.ApplyBrushCommands
Type: Class

Methods:
- void item(CommandParameters, Player, LocalSession, BaseItem, Direction) throws WorldEditException
- void forest(CommandParameters, Player, LocalSession, TreeGenerator$TreeType) throws WorldEditException
- void set(CommandParameters, Player, LocalSession, Pattern) throws WorldEditException
- void register(CommandManagerService, CommandManager, CommandRegistrationHandler)

### Class: com.sk89q.worldedit.command.ApplyBrushCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- ApplyBrushCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- ApplyBrushCommandsRegistration containerInstance(ApplyBrushCommands)
- CommandRegistration containerInstance(Object)
- void build()
- ApplyBrushCommandsRegistration builder()
- ApplyBrushCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- ApplyBrushCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.BiomeCommands
Type: Class

Methods:
- void biomeList(Actor, int)
- void setBiome(Actor, World, LocalSession, EditSession, BiomeType, boolean) throws WorldEditException
- void biomeInfo(Actor, World, LocalSession, boolean, boolean) throws WorldEditException

### Class: com.sk89q.worldedit.command.BiomeCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- BiomeCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- BiomeCommandsRegistration containerInstance(BiomeCommands)
- CommandRegistration containerInstance(Object)
- void build()
- BiomeCommandsRegistration builder()
- BiomeCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- BiomeCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.BrushCommands
Type: Class

Methods:
- void forest(Player, LocalSession, RegionFactory, double, double, TreeGenerator$TreeType) throws WorldEditException
- void extinguishBrush(Player, LocalSession, double) throws WorldEditException
- void set(Player, LocalSession, RegionFactory, double, Pattern) throws WorldEditException
- void deform(Player, LocalSession, RegionFactory, double, String, boolean, boolean) throws WorldEditException
- void erode(Player, LocalSession, double) throws WorldEditException
- void lower(Player, LocalSession, RegionFactory, double) throws WorldEditException
- void clipboardBrush(Player, LocalSession, boolean, boolean, boolean, boolean, boolean, Mask) throws WorldEditException
- void butcherBrush(Player, LocalSession, double, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean) throws WorldEditException
- void feature(Player, LocalSession, RegionFactory, double, double, ConfiguredFeatureType) throws WorldEditException
- void snowSmoothBrush(Player, LocalSession, double, int, int, Mask) throws WorldEditException
- void cylinderBrush(Player, LocalSession, Pattern, double, int, boolean) throws WorldEditException
- void sphereBrush(Player, LocalSession, Pattern, double, boolean) throws WorldEditException
- void dilate(Player, LocalSession, double) throws WorldEditException
- void biome(Player, LocalSession, RegionFactory, double, BiomeType, boolean) throws WorldEditException
- void snow(Player, LocalSession, RegionFactory, double, boolean) throws WorldEditException
- void raise(Player, LocalSession, RegionFactory, double) throws WorldEditException
- void splatterBrush(Player, LocalSession, Pattern, double, int) throws WorldEditException
- void morph(Player, LocalSession, double, int, int, int, int) throws WorldEditException
- void gravityBrush(Player, LocalSession, double, Integer) throws WorldEditException
- void smoothBrush(Player, LocalSession, double, int, Mask) throws WorldEditException

### Class: com.sk89q.worldedit.command.BrushCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- BrushCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- BrushCommandsRegistration containerInstance(BrushCommands)
- CommandRegistration containerInstance(Object)
- void build()
- BrushCommandsRegistration builder()
- BrushCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- BrushCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.ChunkCommands
Type: Class

Methods:
- void listChunks(Actor, World, LocalSession, int) throws WorldEditException
- void deleteChunks(Actor, World, LocalSession, ZonedDateTime) throws WorldEditException
- void chunkInfo(Player)

### Class: com.sk89q.worldedit.command.ChunkCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- ChunkCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- ChunkCommandsRegistration containerInstance(ChunkCommands)
- CommandRegistration containerInstance(Object)
- void build()
- ChunkCommandsRegistration builder()
- ChunkCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- ChunkCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.ClipboardCommands
Type: Class

Methods:
- void rotate(Actor, LocalSession, double, double, double) throws WorldEditException
- void cut(Actor, LocalSession, EditSession, Region, Pattern, boolean, boolean, Mask) throws WorldEditException
- void clearClipboard(Actor, LocalSession)
- void paste(Actor, World, LocalSession, EditSession, boolean, boolean, boolean, boolean, boolean, boolean, boolean, Mask) throws WorldEditException
- void copy(Actor, LocalSession, EditSession, Region, boolean, boolean, Mask) throws WorldEditException
- void flip(Actor, LocalSession, BlockVector3) throws WorldEditException

### Class: com.sk89q.worldedit.command.ClipboardCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- ClipboardCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- ClipboardCommandsRegistration containerInstance(ClipboardCommands)
- CommandRegistration containerInstance(Object)
- void build()
- ClipboardCommandsRegistration builder()
- ClipboardCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- ClipboardCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.ExpandCommands
Type: Class

Methods:
- void expand(Actor, World, LocalSession, int, int, List) throws WorldEditException
- void register(CommandRegistrationHandler, CommandManager, CommandManagerService)

### Class: com.sk89q.worldedit.command.ExpandCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration

Methods:
- ExpandCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- ExpandCommandsRegistration containerInstance(ExpandCommands)
- CommandRegistration containerInstance(Object)
- void build()
- ExpandCommandsRegistration builder()
- ExpandCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)

### Class: com.sk89q.worldedit.command.GeneralCommands
Type: Class

Methods:
- void watchdog(Actor, LocalSession, HookMode)
- void world(Actor, LocalSession, World)
- void drawSelection(Player, LocalSession, Boolean) throws WorldEditException
- void limit(Actor, LocalSession, Integer)
- void searchItem(Actor, boolean, boolean, int, List)
- void reorderMode(Actor, LocalSession, EditSession$ReorderMode)
- void placement(Actor, LocalSession, PlacementType, int, BlockVector3)
- void togglePlace(Actor, LocalSession)
- void gmask(Actor, LocalSession, Mask)
- void timeout(Actor, LocalSession, Integer)
- void register(CommandRegistrationHandler, CommandManager, CommandManagerService, WorldEdit)

### Class: com.sk89q.worldedit.command.GeneralCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- GeneralCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- GeneralCommandsRegistration containerInstance(GeneralCommands)
- CommandRegistration containerInstance(Object)
- void build()
- GeneralCommandsRegistration builder()
- GeneralCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- GeneralCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.GenerationCommands
Type: Class

Methods:
- int hollowPyramid(Actor, LocalSession, EditSession, Pattern, int) throws WorldEditException
- int pumpkins(Actor, LocalSession, EditSession, int) throws WorldEditException
- int forestGen(Actor, LocalSession, EditSession, int, TreeGenerator$TreeType, double) throws WorldEditException
- int feature(Actor, LocalSession, EditSession, ConfiguredFeatureType) throws WorldEditException
- int sphere(Actor, LocalSession, EditSession, Pattern, List, boolean, boolean) throws WorldEditException
- int hsphere(Actor, LocalSession, EditSession, Pattern, List, boolean) throws WorldEditException
- int cyl(Actor, LocalSession, EditSession, Pattern, List, int, boolean) throws WorldEditException
- int pyramid(Actor, LocalSession, EditSession, Pattern, int, boolean) throws WorldEditException
- int generateBiome(Actor, LocalSession, EditSession, Region, BiomeType, List, boolean, boolean, boolean, boolean) throws WorldEditException
- int generate(Actor, LocalSession, EditSession, Region, Pattern, List, boolean, boolean, boolean, boolean) throws WorldEditException
- int cone(Actor, LocalSession, EditSession, Pattern, List, int, boolean, double) throws WorldEditException
- int structure(Actor, LocalSession, EditSession, StructureType) throws WorldEditException
- int hcyl(Actor, LocalSession, EditSession, Pattern, List, int) throws WorldEditException

### Class: com.sk89q.worldedit.command.GenerationCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- GenerationCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- GenerationCommandsRegistration containerInstance(GenerationCommands)
- CommandRegistration containerInstance(Object)
- void build()
- GenerationCommandsRegistration builder()
- GenerationCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- GenerationCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.HistoryCommands
Type: Class

Methods:
- void undo(Actor, LocalSession, int, String) throws WorldEditException
- void clearHistory(Actor, LocalSession)
- void redo(Actor, LocalSession, int, String) throws WorldEditException

### Class: com.sk89q.worldedit.command.HistoryCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- HistoryCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- HistoryCommandsRegistration containerInstance(HistoryCommands)
- CommandRegistration containerInstance(Object)
- void build()
- HistoryCommandsRegistration builder()
- HistoryCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- HistoryCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.InsufficientArgumentsException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

### Class: com.sk89q.worldedit.command.NavigationCommands
Type: Class

Methods:
- void thru(Player) throws WorldEditException
- void ceiling(Player, int, boolean, boolean) throws WorldEditException
- void descend(Player, int) throws WorldEditException
- void ascend(Player, int) throws WorldEditException
- void unstuck(Player) throws WorldEditException
- void up(Player, int, boolean, boolean) throws WorldEditException
- void jumpTo(Player) throws WorldEditException

### Class: com.sk89q.worldedit.command.NavigationCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- NavigationCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- NavigationCommandsRegistration containerInstance(NavigationCommands)
- CommandRegistration containerInstance(Object)
- void build()
- NavigationCommandsRegistration builder()
- NavigationCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- NavigationCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.PaintBrushCommands
Type: Class

Methods:
- void item(CommandParameters, Player, LocalSession, BaseItem, Direction) throws WorldEditException
- void forest(CommandParameters, Player, LocalSession, TreeGenerator$TreeType) throws WorldEditException
- void set(CommandParameters, Player, LocalSession, Pattern) throws WorldEditException
- void register(CommandManagerService, CommandManager, CommandRegistrationHandler)

### Class: com.sk89q.worldedit.command.PaintBrushCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- PaintBrushCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- PaintBrushCommandsRegistration containerInstance(PaintBrushCommands)
- CommandRegistration containerInstance(Object)
- void build()
- PaintBrushCommandsRegistration builder()
- PaintBrushCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- PaintBrushCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.RegionCommands
Type: Class

Methods:
- int forest(Actor, EditSession, Region, TreeGenerator$TreeType, double) throws WorldEditException
- int stack(Actor, World, EditSession, LocalSession, Region, int, BlockVector3, boolean, boolean, boolean, boolean, boolean, Mask) throws WorldEditException
- int move(Actor, World, EditSession, LocalSession, Region, int, BlockVector3, Pattern, boolean, boolean, boolean, boolean, Mask) throws WorldEditException
- int set(Actor, EditSession, Region, Pattern)
- int overlay(Actor, EditSession, Region, Pattern) throws WorldEditException
- int curve(Actor, EditSession, Region, Pattern, double, boolean) throws WorldEditException
- int deform(Actor, LocalSession, EditSession, Region, List, boolean, boolean, boolean) throws WorldEditException
- int line(Actor, EditSession, Region, Pattern, double, boolean) throws WorldEditException
- int center(Actor, EditSession, Region, Pattern) throws WorldEditException
- int flora(Actor, EditSession, Region, double) throws WorldEditException
- int replace(Actor, EditSession, Region, Mask, Pattern) throws WorldEditException
- int hollow(Actor, EditSession, Region, int, Pattern) throws WorldEditException
- int snowSmooth(Actor, EditSession, Region, int, int, Mask) throws WorldEditException
- int walls(Actor, EditSession, Region, Pattern) throws WorldEditException
- int naturalize(Actor, EditSession, Region) throws WorldEditException
- int faces(Actor, EditSession, Region, Pattern) throws WorldEditException
- int smooth(Actor, EditSession, Region, int, Mask) throws WorldEditException

### Class: com.sk89q.worldedit.command.RegionCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- RegionCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- RegionCommandsRegistration containerInstance(RegionCommands)
- CommandRegistration containerInstance(Object)
- void build()
- RegionCommandsRegistration builder()
- RegionCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- RegionCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.SchematicCommands
Type: Class

Methods:
- void formats(Actor)
- void load(Actor, LocalSession, String, ClipboardFormat) throws FilenameException
- void save(Actor, LocalSession, String, ClipboardFormat, boolean) throws WorldEditException
- void share(Actor, LocalSession, String, ClipboardShareDestination, ClipboardFormat) throws WorldEditException
- void list(Actor, int, boolean, boolean)
- void delete(Actor, String) throws WorldEditException

### Class: com.sk89q.worldedit.command.SchematicCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- SchematicCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- SchematicCommandsRegistration containerInstance(SchematicCommands)
- CommandRegistration containerInstance(Object)
- void build()
- SchematicCommandsRegistration builder()
- SchematicCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- SchematicCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.ScriptingCommands
Type: Class

Methods:
- void executeLast(Player, LocalSession, List) throws WorldEditException
- void execute(Player, LocalSession, String, List) throws WorldEditException

### Class: com.sk89q.worldedit.command.ScriptingCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- ScriptingCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- ScriptingCommandsRegistration containerInstance(ScriptingCommands)
- CommandRegistration containerInstance(Object)
- void build()
- ScriptingCommandsRegistration builder()
- ScriptingCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- ScriptingCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.SelectionCommands
Type: Class

Methods:
- void select(Actor, World, LocalSession, SelectorChoiceOrList, boolean) throws WorldEditException
- void outset(Actor, World, LocalSession, int, boolean, boolean) throws WorldEditException
- void toggleWand(Player)
- void inset(Actor, World, LocalSession, int, boolean, boolean) throws WorldEditException
- void shift(Actor, World, LocalSession, int, List) throws WorldEditException
- void contract(Actor, World, LocalSession, int, int, List) throws WorldEditException
- int count(Actor, World, LocalSession, EditSession, Mask) throws WorldEditException
- void hpos2(Player, LocalSession)
- void chunk(Actor, World, LocalSession, BlockVector3, boolean, boolean) throws WorldEditException
- void pos1(Actor, World, LocalSession, BlockVector3)
- void pos2(Actor, World, LocalSession, BlockVector3)
- void hpos1(Player, LocalSession)
- void size(Actor, World, LocalSession, boolean) throws WorldEditException
- void trim(Actor, World, LocalSession, Mask) throws WorldEditException
- void pos(Actor, World, LocalSession, BlockVector3, List, SelectorChoice) throws WorldEditException
- void wand(Player, LocalSession, boolean) throws WorldEditException
- void distr(Actor, World, LocalSession, boolean, boolean, Integer) throws WorldEditException

### Class: com.sk89q.worldedit.command.SelectionCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- SelectionCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- SelectionCommandsRegistration containerInstance(SelectionCommands)
- CommandRegistration containerInstance(Object)
- void build()
- SelectionCommandsRegistration builder()
- SelectionCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- SelectionCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.SnapshotCommands
Type: Class

No public methods found

### Class: com.sk89q.worldedit.command.SnapshotCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- SnapshotCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- SnapshotCommandsRegistration containerInstance(SnapshotCommands)
- CommandRegistration containerInstance(Object)
- void build()
- SnapshotCommandsRegistration builder()
- SnapshotCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- SnapshotCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.SnapshotUtilCommands
Type: Class

Methods:
- void restore(Actor, World, LocalSession, EditSession, String) throws WorldEditException, IOException

### Class: com.sk89q.worldedit.command.SnapshotUtilCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- SnapshotUtilCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- SnapshotUtilCommandsRegistration containerInstance(SnapshotUtilCommands)
- CommandRegistration containerInstance(Object)
- void build()
- SnapshotUtilCommandsRegistration builder()
- SnapshotUtilCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- SnapshotUtilCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.SuperPickaxeCommands
Type: Class

Methods:
- void area(Player, LocalSession, int) throws WorldEditException
- void single(Player, LocalSession) throws WorldEditException
- void recursive(Player, LocalSession, double) throws WorldEditException

### Class: com.sk89q.worldedit.command.SuperPickaxeCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- SuperPickaxeCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- SuperPickaxeCommandsRegistration containerInstance(SuperPickaxeCommands)
- CommandRegistration containerInstance(Object)
- void build()
- SuperPickaxeCommandsRegistration builder()
- SuperPickaxeCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- SuperPickaxeCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.ToolCommands
Type: Class

Methods:
- void stacker(Player, LocalSession, int, Mask) throws WorldEditException
- void floodFill(Player, LocalSession, Pattern, int) throws WorldEditException
- void longrangebuildtool(Player, LocalSession, Pattern, Pattern) throws WorldEditException
- void selwand(Player, LocalSession) throws WorldEditException
- void farwand(Player, LocalSession) throws WorldEditException
- void tree(Player, LocalSession, TreeGenerator$TreeType) throws WorldEditException
- void deltree(Player, LocalSession) throws WorldEditException
- void repl(Player, LocalSession, Pattern) throws WorldEditException
- void navwand(Player, LocalSession) throws WorldEditException
- void cycler(Player, LocalSession) throws WorldEditException
- void none(Player, LocalSession) throws WorldEditException
- void info(Player, LocalSession) throws WorldEditException
- void register(CommandRegistrationHandler, CommandManager, CommandManagerService, WorldEdit)

### Class: com.sk89q.worldedit.command.ToolCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- ToolCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- ToolCommandsRegistration containerInstance(ToolCommands)
- CommandRegistration containerInstance(Object)
- void build()
- ToolCommandsRegistration builder()
- ToolCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- ToolCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.ToolUtilCommands
Type: Class

Methods:
- void size(Player, LocalSession, int) throws WorldEditException
- void material(Player, LocalSession, Pattern) throws WorldEditException
- void traceMask(Player, LocalSession, Mask) throws WorldEditException
- void range(Player, LocalSession, int) throws WorldEditException
- void togglePickaxe(Player, LocalSession, Boolean)
- void mask(Player, LocalSession, Mask) throws WorldEditException

### Class: com.sk89q.worldedit.command.ToolUtilCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- ToolUtilCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- ToolUtilCommandsRegistration containerInstance(ToolUtilCommands)
- CommandRegistration containerInstance(Object)
- void build()
- ToolUtilCommandsRegistration builder()
- ToolUtilCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- ToolUtilCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.UtilityCommands
Type: Class

Methods:
- int fixWater(Actor, LocalSession, EditSession, double) throws WorldEditException
- int fillr(Actor, LocalSession, EditSession, Pattern, double, Integer) throws WorldEditException
- int green(Actor, LocalSession, EditSession, double, int, boolean) throws WorldEditException
- int removeAbove(Actor, LocalSession, EditSession, int, int) throws WorldEditException
- int butcher(Actor, Integer, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean) throws WorldEditException
- int removeBelow(Actor, LocalSession, EditSession, int, int) throws WorldEditException
- int fill(Actor, LocalSession, EditSession, Pattern, double, int) throws WorldEditException
- int remove(Actor, EntityRemover, int) throws WorldEditException
- int drain(Actor, LocalSession, EditSession, double, boolean) throws WorldEditException
- void help(Actor, boolean, int, List) throws WorldEditException
- int extinguish(Actor, LocalSession, EditSession, Integer) throws WorldEditException
- int fixLava(Actor, LocalSession, EditSession, double) throws WorldEditException
- int removeNear(Actor, LocalSession, EditSession, Mask, int) throws WorldEditException
- int snow(Actor, LocalSession, EditSession, double, int, boolean) throws WorldEditException
- void calc(Actor, List)
- int thaw(Actor, LocalSession, EditSession, double, int) throws WorldEditException
- int replaceNear(Actor, World, LocalSession, EditSession, int, Mask, Pattern) throws WorldEditException

### Class: com.sk89q.worldedit.command.UtilityCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- UtilityCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- UtilityCommandsRegistration containerInstance(UtilityCommands)
- CommandRegistration containerInstance(Object)
- void build()
- UtilityCommandsRegistration builder()
- UtilityCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- UtilityCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

### Class: com.sk89q.worldedit.command.WorldEditCommands
Type: Class

Methods:
- void help(Actor, boolean, int, List) throws WorldEditException
- void reload(Actor)
- void tz(Actor, LocalSession, String)
- void cui(Player, LocalSession)
- void report(Actor, boolean) throws WorldEditException
- void version(Actor)

### Class: com.sk89q.worldedit.command.WorldEditCommandsRegistration
Type: Class
Implements: org.enginehub.piston.gen.CommandRegistration, com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator$Registration

Methods:
- WorldEditCommandsRegistration listeners(Collection)
- CommandRegistration listeners(Collection)
- WorldEditCommandsRegistration containerInstance(WorldEditCommands)
- CommandRegistration containerInstance(Object)
- void build()
- WorldEditCommandsRegistration builder()
- WorldEditCommandsRegistration commandManager(CommandManager)
- CommandRegistration commandManager(CommandManager)
- WorldEditCommandsRegistration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)
- CommandPermissionsConditionGenerator$Registration commandPermissionsConditionGenerator(CommandPermissionsConditionGenerator)

## Package: com.sk89q.worldedit.command.argument

### Class: com.sk89q.worldedit.command.argument.Arguments
Type: Interface

Methods:
- String get()

### Class: com.sk89q.worldedit.command.argument.SelectorChoiceOrList
Type: Interface

No public methods found

### Class: com.sk89q.worldedit.command.argument.AbstractDirectionConverter
Type: Abstract Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)

### Class: com.sk89q.worldedit.command.argument.BooleanConverter
Type: Class

Methods:
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.Chunk3dVectorConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.ClipboardFormatConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.ClipboardShareDestinationConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.CommaSeparatedValuesConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- CommaSeparatedValuesConverter wrapAndLimit(ArgumentConverter, int)
- List getSuggestions(String, InjectedValueAccess)
- CommaSeparatedValuesConverter wrapAndLimitNoRepeats(ArgumentConverter, int)
- Component describeAcceptableArguments()
- CommaSeparatedValuesConverter wrapNoRepeats(ArgumentConverter)
- ConversionResult convert(String, InjectedValueAccess)
- CommaSeparatedValuesConverter wrap(ArgumentConverter)

### Class: com.sk89q.worldedit.command.argument.DirectionConverter
Type: Class
Extends: com.sk89q.worldedit.command.argument.AbstractDirectionConverter

Methods:
- void register(WorldEdit, CommandManager)

### Class: com.sk89q.worldedit.command.argument.DirectionVectorConverter
Type: Class
Extends: com.sk89q.worldedit.command.argument.AbstractDirectionConverter

Methods:
- void register(WorldEdit, CommandManager)

### Class: com.sk89q.worldedit.command.argument.EntityRemoverConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.EnumConverter
Type: Class

Methods:
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.FactoryConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(WorldEdit, CommandManager)

### Class: com.sk89q.worldedit.command.argument.HeightConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.OffsetConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(WorldEdit, CommandManager)

### Class: com.sk89q.worldedit.command.argument.RegionFactoryConverter
Type: Class

Methods:
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.RegistryConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.SelectorChoice
Type: Enum
Extends: java.lang.Enum
Implements: com.sk89q.worldedit.command.argument.SelectorChoiceOrList

Methods:
- SelectorChoice valueOf(String)
- SelectorChoice[] values()
- void explainNewSelector(Actor)
- RegionSelector createNewSelector(World)
- RegionSelector createNewSelector(RegionSelector)

### Class: com.sk89q.worldedit.command.argument.SelectorChoiceConverter
Type: Class

Methods:
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.SelectorChoiceList
Type: Class
Implements: com.sk89q.worldedit.command.argument.SelectorChoiceOrList

No public methods found

### Class: com.sk89q.worldedit.command.argument.SideEffectConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.SideEffectSetConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.VectorConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.WorldConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(CommandManager)

### Class: com.sk89q.worldedit.command.argument.ZonedDateTimeConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)
- void register(CommandManager)

## Package: com.sk89q.worldedit.command.factory

### Class: com.sk89q.worldedit.command.factory.FeatureGeneratorFactory
Type: Class
Implements: com.sk89q.worldedit.function.Contextual

Methods:
- RegionMaskingFilter createFromContext(EditContext)
- Object createFromContext(EditContext)
- String toString()

### Class: com.sk89q.worldedit.command.factory.ItemUseFactory
Type: Class
Implements: com.sk89q.worldedit.function.Contextual

Methods:
- RegionFunction createFromContext(EditContext)
- Object createFromContext(EditContext)
- String toString()

### Class: com.sk89q.worldedit.command.factory.ReplaceFactory
Type: Class
Implements: com.sk89q.worldedit.function.Contextual

Methods:
- RegionFunction createFromContext(EditContext)
- Object createFromContext(EditContext)
- String toString()

### Class: com.sk89q.worldedit.command.factory.TreeGeneratorFactory
Type: Class
Implements: com.sk89q.worldedit.function.Contextual

Methods:
- ForestGenerator createFromContext(EditContext)
- Object createFromContext(EditContext)
- String toString()

## Package: com.sk89q.worldedit.command.tool

### Class: com.sk89q.worldedit.command.tool.BlockTool
Type: Interface
Implements: com.sk89q.worldedit.command.tool.Tool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location)
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- EditSession createEditSession(Player, LocalSession, Location)
- World requireWorld(Location)

### Class: com.sk89q.worldedit.command.tool.DoubleActionBlockTool
Type: Interface
Implements: com.sk89q.worldedit.command.tool.BlockTool

Methods:
- boolean actSecondary(Platform, LocalConfiguration, Player, LocalSession, Location)
- boolean actSecondary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)

### Class: com.sk89q.worldedit.command.tool.DoubleActionTraceTool
Type: Interface
Implements: com.sk89q.worldedit.command.tool.TraceTool

Methods:
- boolean actSecondary(Platform, LocalConfiguration, Player, LocalSession)

### Class: com.sk89q.worldedit.command.tool.Tool
Type: Interface

Methods:
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.TraceTool
Type: Interface
Implements: com.sk89q.worldedit.command.tool.Tool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession)

### Class: com.sk89q.worldedit.command.tool.AreaPickaxe
Type: Class
Implements: com.sk89q.worldedit.command.tool.BlockTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.BlockDataCyler
Type: Class
Implements: com.sk89q.worldedit.command.tool.DoubleActionBlockTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean actSecondary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.BlockReplacer
Type: Class
Implements: com.sk89q.worldedit.command.tool.DoubleActionBlockTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean actSecondary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.BrushTool
Type: Class
Implements: com.sk89q.worldedit.command.tool.TraceTool

Methods:
- Mask getMask()
- void setMask(Mask)
- void setRange(int)
- void setTraceMask(Mask)
- Mask getTraceMask()
- boolean canUse(Actor)
- void setFill(Pattern)
- Pattern getMaterial()
- double getSize()
- void setSize(double)
- int getRange()
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession)
- Brush getBrush()
- void setBrush(Brush, String)

### Class: com.sk89q.worldedit.command.tool.DistanceWand
Type: Class
Extends: com.sk89q.worldedit.command.tool.BrushTool
Implements: com.sk89q.worldedit.command.tool.DoubleActionTraceTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession)
- boolean actSecondary(Platform, LocalConfiguration, Player, LocalSession)

### Class: com.sk89q.worldedit.command.tool.FloatingTreeRemover
Type: Class
Implements: com.sk89q.worldedit.command.tool.BlockTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.FloodFillTool
Type: Class
Implements: com.sk89q.worldedit.command.tool.BlockTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.InvalidToolBindException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

Methods:
- ItemType getItemType()

### Class: com.sk89q.worldedit.command.tool.LongRangeBuildTool
Type: Class
Extends: com.sk89q.worldedit.command.tool.BrushTool
Implements: com.sk89q.worldedit.command.tool.DoubleActionTraceTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession)
- boolean actSecondary(Platform, LocalConfiguration, Player, LocalSession)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.NavigationWand
Type: Class
Implements: com.sk89q.worldedit.command.tool.DoubleActionTraceTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession)
- boolean actSecondary(Platform, LocalConfiguration, Player, LocalSession)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.QueryTool
Type: Class
Implements: com.sk89q.worldedit.command.tool.BlockTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.RecursivePickaxe
Type: Class
Implements: com.sk89q.worldedit.command.tool.BlockTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.SelectionWand
Type: Class
Implements: com.sk89q.worldedit.command.tool.DoubleActionBlockTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean actSecondary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.SinglePickaxe
Type: Class
Implements: com.sk89q.worldedit.command.tool.BlockTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.StackTool
Type: Class
Implements: com.sk89q.worldedit.command.tool.BlockTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean canUse(Actor)

### Class: com.sk89q.worldedit.command.tool.TreePlanter
Type: Class
Implements: com.sk89q.worldedit.command.tool.BlockTool

Methods:
- boolean actPrimary(Platform, LocalConfiguration, Player, LocalSession, Location, Direction)
- boolean canUse(Actor)

## Package: com.sk89q.worldedit.command.tool.brush

### Class: com.sk89q.worldedit.command.tool.brush.Brush
Type: Interface

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.ButcherBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.ClipboardBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.CylinderBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.GravityBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.HollowCylinderBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.HollowSphereBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.ImageHeightmapBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.MorphBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.OperationFactoryBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.SmoothBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.SnowSmoothBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.SphereBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.command.tool.brush.SplatterBrush
Type: Class
Implements: com.sk89q.worldedit.command.tool.brush.Brush

Methods:
- void build(EditSession, BlockVector3, Pattern, double) throws MaxChangedBlocksException

## Package: com.sk89q.worldedit.command.util

### Class: com.sk89q.worldedit.command.util.CommandPermissions
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: com.sk89q.worldedit.command.util.Logging
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Logging$LogMode value()

### Class: com.sk89q.worldedit.command.util.AsyncCommandBuilder
Type: Class

Methods:
- AsyncCommandBuilder setDelayMessage(Component)
- AsyncCommandBuilder setWorkingMessage(Component)
- AsyncCommandBuilder registerWithSupervisor(Supervisor, String)
- AsyncCommandBuilder sendMessageAfterDelay(String)
- AsyncCommandBuilder sendMessageAfterDelay(Component)
- AsyncCommandBuilder onFailure(Component, ExceptionConverter)
- AsyncCommandBuilder onFailure(String, ExceptionConverter)
- ListenableFuture buildAndExec(ListeningExecutorService)
- AsyncCommandBuilder wrap(Callable, Actor)
- AsyncCommandBuilder onSuccess(Component, Consumer)
- AsyncCommandBuilder onSuccess(String, Consumer)

### Class: com.sk89q.worldedit.command.util.CommandPermissionsConditionGenerator
Type: Class
Implements: org.enginehub.piston.gen.CommandConditionGenerator

Methods:
- Command$Condition generateCondition(Method)

### Class: com.sk89q.worldedit.command.util.CreatureButcher
Type: Class

Methods:
- void or(int, boolean)
- void or(int, boolean, String)
- EntityFunction createFunction()

### Class: com.sk89q.worldedit.command.util.EntityRemover
Type: Class

Methods:
- EntityFunction createFunction()
- EntityRemover fromString(String)

### Class: com.sk89q.worldedit.command.util.FutureProgressListener
Type: Class
Implements: java.lang.Runnable

Methods:
- void addProgressListener(ListenableFuture, Actor, String)
- void addProgressListener(ListenableFuture, Actor, Component)
- void addProgressListener(ListenableFuture, Actor, Component, Component)
- void run()

### Class: com.sk89q.worldedit.command.util.HookMode
Type: Enum
Extends: java.lang.Enum

Methods:
- HookMode valueOf(String)
- HookMode[] values()

### Class: com.sk89q.worldedit.command.util.MessageTimerTask
Type: Class
Extends: java.util.TimerTask

Methods:
- void run()

### Class: com.sk89q.worldedit.command.util.PermissionCondition
Type: Class
Implements: org.enginehub.piston.Command$Condition

Methods:
- boolean satisfied(InjectedValueAccess)
- Set getPermissions()

### Class: com.sk89q.worldedit.command.util.PrintCommandHelp
Type: Class

Methods:
- void help(List, int, boolean, CommandManager, Actor, String) throws InvalidComponentException

### Class: com.sk89q.worldedit.command.util.SubCommandPermissionCondition
Type: Class
Extends: com.sk89q.worldedit.command.util.PermissionCondition

Methods:
- boolean satisfied(InjectedValueAccess)

### Class: com.sk89q.worldedit.command.util.SuggestionHelper
Type: Class

Methods:
- Stream getBlockPropertySuggestions(String, BlockType, String)
- Stream getBlockCategorySuggestions(String, boolean)
- Stream getRegistrySuggestions(Registry, String)
- Stream getNamespacedRegistrySuggestions(NamespacedRegistry, String)

### Class: com.sk89q.worldedit.command.util.WorldEditAsyncCommandBuilder
Type: Class

Methods:
- void createAndSendMessage(Actor, Callable, String)
- void createAndSendMessage(Actor, Callable, Component)

## Package: com.sk89q.worldedit.entity

### Class: com.sk89q.worldedit.entity.Entity
Type: Interface
Implements: com.sk89q.worldedit.util.Faceted, com.sk89q.worldedit.extension.platform.Locatable

Methods:
- BaseEntity getState()
- boolean remove()

### Class: com.sk89q.worldedit.entity.Player
Type: Interface
Implements: com.sk89q.worldedit.entity.Entity, com.sk89q.worldedit.extension.platform.Actor

Methods:
- boolean descendLevel()
- World getWorld()
- Direction getCardinalDirection(int)
- Direction getCardinalDirection()
- void findFreePosition(Location)
- void findFreePosition()
- void sendFakeBlock(BlockVector3, BlockStateHolder)
- GameMode getGameMode()
- void setGameMode(GameMode)
- Location getBlockTraceFace(int, boolean)
- Location getBlockTraceFace(int, boolean, Mask)
- void setOnGround(Location)
- boolean trySetPosition(Vector3, float, float)
- void setPosition(Vector3, float, float)
- Location getBlockOn()
- BaseBlock getBlockInHand(HandSide) throws WorldEditException
- BlockBag getInventoryBlockBag()
- void giveItem(BaseItemStack)
- boolean isHoldingPickAxe()
- Location getSolidBlockTrace(int)
- boolean ascendUpwards(int)
- boolean ascendUpwards(int, boolean)
- boolean ascendLevel()
- boolean passThroughForwardWall(int)
- Location getBlockIn()
- Location getBlockTrace(int, boolean)
- Location getBlockTrace(int, boolean, Mask)
- Location getBlockTrace(int)
- void floatAt(int, int, int, boolean)
- boolean ascendToCeiling(int)
- boolean ascendToCeiling(int, boolean)
- BaseItemStack getItemInHand(HandSide)

### Class: com.sk89q.worldedit.entity.BaseEntity
Type: Class
Implements: com.sk89q.worldedit.world.NbtValued

Methods:
- EntityType getType()
- LazyReference getNbtReference()
- void setNbtReference(LazyReference)

## Package: com.sk89q.worldedit.entity.metadata

### Class: com.sk89q.worldedit.entity.metadata.EntityProperties
Type: Interface

Methods:
- boolean isLiving()
- boolean isMinecart()
- boolean isPainting()
- boolean isGolem()
- boolean isNPC()
- boolean isAmbient()
- boolean isWaterCreature()
- boolean isBoat()
- boolean isTamed()
- boolean isItemFrame()
- boolean isProjectile()
- boolean isTNT()
- boolean isTagged()
- boolean isPlayerDerived()
- boolean isAnimal()
- boolean isExperienceOrb()
- boolean isPasteable()
- boolean isFallingBlock()
- boolean isItem()
- boolean isArmorStand()

## Package: com.sk89q.worldedit.event

### Class: com.sk89q.worldedit.event.Cancellable
Type: Interface

Methods:
- boolean isCancelled()
- void setCancelled(boolean)

### Class: com.sk89q.worldedit.event.AbstractCancellable
Type: Abstract Class
Implements: com.sk89q.worldedit.event.Cancellable

Methods:
- boolean isCancelled()
- void setCancelled(boolean)

### Class: com.sk89q.worldedit.event.Event
Type: Abstract Class

No public methods found

## Package: com.sk89q.worldedit.event.extent

### Class: com.sk89q.worldedit.event.extent.EditSessionEvent
Type: Class
Extends: com.sk89q.worldedit.event.Event

Methods:
- EditSession$Stage getStage()
- int getMaxBlocks()
- Extent getExtent()
- World getWorld()
- EditSessionEvent clone(EditSession$Stage)
- List getTracingExtents()
- void setExtent(Extent)
- Actor getActor()
- void setTracing(boolean)

## Package: com.sk89q.worldedit.event.platform

### Class: com.sk89q.worldedit.event.platform.BlockInteractEvent
Type: Class
Extends: com.sk89q.worldedit.event.Event
Implements: com.sk89q.worldedit.event.Cancellable

Methods:
- boolean isCancelled()
- Location getLocation()
- Interaction getType()
- void setCancelled(boolean)
- Direction getFace()
- Actor getCause()

### Class: com.sk89q.worldedit.event.platform.CommandEvent
Type: Class
Extends: com.sk89q.worldedit.event.AbstractCancellable

Methods:
- String getArguments()
- Actor getActor()

### Class: com.sk89q.worldedit.event.platform.CommandSuggestionEvent
Type: Class
Extends: com.sk89q.worldedit.event.Event

Methods:
- List getSuggestions()
- String getArguments()
- void setSuggestions(List)
- Actor getActor()

### Class: com.sk89q.worldedit.event.platform.ConfigurationLoadEvent
Type: Class
Extends: com.sk89q.worldedit.event.Event

Methods:
- LocalConfiguration getConfiguration()

### Class: com.sk89q.worldedit.event.platform.InputType
Type: Enum
Extends: java.lang.Enum

Methods:
- InputType valueOf(String)
- InputType[] values()

### Class: com.sk89q.worldedit.event.platform.Interaction
Type: Enum
Extends: java.lang.Enum

Methods:
- Interaction valueOf(String)
- Interaction[] values()

### Class: com.sk89q.worldedit.event.platform.PlatformEvent
Type: Abstract Class
Extends: com.sk89q.worldedit.event.Event

Methods:
- Platform getPlatform()

### Class: com.sk89q.worldedit.event.platform.PlatformInitializeEvent
Type: Class
Extends: com.sk89q.worldedit.event.Event

No public methods found

### Class: com.sk89q.worldedit.event.platform.PlatformReadyEvent
Type: Class
Extends: com.sk89q.worldedit.event.platform.PlatformEvent

No public methods found

### Class: com.sk89q.worldedit.event.platform.PlatformUnreadyEvent
Type: Class
Extends: com.sk89q.worldedit.event.platform.PlatformEvent

No public methods found

### Class: com.sk89q.worldedit.event.platform.PlatformsRegisteredEvent
Type: Class
Extends: com.sk89q.worldedit.event.Event

No public methods found

### Class: com.sk89q.worldedit.event.platform.PlayerInputEvent
Type: Class
Extends: com.sk89q.worldedit.event.Event
Implements: com.sk89q.worldedit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- InputType getInputType()
- void setCancelled(boolean)

### Class: com.sk89q.worldedit.event.platform.SessionIdleEvent
Type: Class
Extends: com.sk89q.worldedit.event.Event

Methods:
- SessionKey getKey()

## Package: com.sk89q.worldedit.extension.factory

### Class: com.sk89q.worldedit.extension.factory.BlockFactory
Type: Class
Extends: com.sk89q.worldedit.internal.registry.AbstractFactory

Methods:
- Set parseFromListInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.ItemFactory
Type: Class
Extends: com.sk89q.worldedit.internal.registry.AbstractFactory

No public methods found

### Class: com.sk89q.worldedit.extension.factory.MaskFactory
Type: Class
Extends: com.sk89q.worldedit.internal.registry.AbstractFactory

Methods:
- List getSuggestions(String, ParserContext)
- Mask parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.PatternFactory
Type: Class
Extends: com.sk89q.worldedit.internal.registry.AbstractFactory

No public methods found

## Package: com.sk89q.worldedit.extension.factory.parser

### Class: com.sk89q.worldedit.extension.factory.parser.DefaultBlockParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- BaseBlock parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.DefaultItemParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- BaseItem parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

## Package: com.sk89q.worldedit.extension.factory.parser.mask

### Class: com.sk89q.worldedit.extension.factory.parser.mask.AirMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.SimpleInputParser

Methods:
- Mask parseFromSimpleInput(String, ParserContext) throws InputParseException
- Object parseFromSimpleInput(String, ParserContext) throws InputParseException
- List getMatchedAliases()

### Class: com.sk89q.worldedit.extension.factory.parser.mask.BiomeMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Mask parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.mask.BlockCategoryMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Mask parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.mask.BlockStateMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Mask parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.mask.BlocksMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Mask parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.mask.ExistingMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.SimpleInputParser

Methods:
- Mask parseFromSimpleInput(String, ParserContext) throws InputParseException
- Object parseFromSimpleInput(String, ParserContext) throws InputParseException
- List getMatchedAliases()

### Class: com.sk89q.worldedit.extension.factory.parser.mask.ExposedMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.SimpleInputParser

Methods:
- Mask parseFromSimpleInput(String, ParserContext) throws InputParseException
- Object parseFromSimpleInput(String, ParserContext) throws InputParseException
- List getMatchedAliases()

### Class: com.sk89q.worldedit.extension.factory.parser.mask.ExpressionMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Mask parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.mask.LazyRegionMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.SimpleInputParser

Methods:
- Mask parseFromSimpleInput(String, ParserContext)
- Object parseFromSimpleInput(String, ParserContext) throws InputParseException
- List getMatchedAliases()

### Class: com.sk89q.worldedit.extension.factory.parser.mask.NegateMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Mask parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.mask.NoiseMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Mask parseFromInput(String, ParserContext)
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.mask.OffsetMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Mask parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.mask.RegionMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.SimpleInputParser

Methods:
- Mask parseFromSimpleInput(String, ParserContext) throws InputParseException
- Object parseFromSimpleInput(String, ParserContext) throws InputParseException
- List getMatchedAliases()

### Class: com.sk89q.worldedit.extension.factory.parser.mask.SolidMaskParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.SimpleInputParser

Methods:
- Mask parseFromSimpleInput(String, ParserContext) throws InputParseException
- Object parseFromSimpleInput(String, ParserContext) throws InputParseException
- List getMatchedAliases()

## Package: com.sk89q.worldedit.extension.factory.parser.pattern

### Class: com.sk89q.worldedit.extension.factory.parser.pattern.BlockCategoryPatternParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Pattern parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.pattern.ClipboardPatternParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Pattern parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.pattern.RandomPatternParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Pattern parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.pattern.RandomStatePatternParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Pattern parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.pattern.SingleBlockPatternParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Pattern parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.extension.factory.parser.pattern.TypeOrStateApplyingPatternParser
Type: Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Pattern parseFromInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException

## Package: com.sk89q.worldedit.extension.input

### Class: com.sk89q.worldedit.extension.input.DisallowedUsageException
Type: Class
Extends: com.sk89q.worldedit.extension.input.InputParseException

No public methods found

### Class: com.sk89q.worldedit.extension.input.InputParseException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

### Class: com.sk89q.worldedit.extension.input.NoMatchException
Type: Class
Extends: com.sk89q.worldedit.extension.input.InputParseException

No public methods found

### Class: com.sk89q.worldedit.extension.input.ParserContext
Type: Class

Methods:
- Extent requireExtent() throws InputParseException
- Extent getExtent()
- void setActor(Actor)
- World getWorld()
- void setTryLegacy(boolean)
- boolean isTryingLegacy()
- boolean isPreferringWildcard()
- World requireWorld() throws InputParseException
- LocalSession requireSession() throws InputParseException
- void setRestricted(boolean)
- Actor requireActor() throws InputParseException
- void setSession(LocalSession)
- void setExtent(Extent)
- Actor getActor()
- void setWorld(World)
- void setPreferringWildcard(boolean)
- boolean isRestricted()
- LocalSession getSession()

## Package: com.sk89q.worldedit.extension.platform

### Class: com.sk89q.worldedit.extension.platform.Actor
Type: Interface
Implements: com.sk89q.worldedit.util.Identifiable, com.sk89q.worldedit.session.SessionOwner, com.sk89q.worldedit.util.auth.Subject

Methods:
- boolean isPlayer()
- void printRaw(String)
- String getName()
- void printInfo(Component)
- void printDebug(String)
- void printDebug(Component)
- File openFileOpenDialog(String[])
- void printError(String)
- void printError(Component)
- void sendAnnouncements()
- void print(String)
- void print(Component)
- String getDisplayName()
- File openFileSaveDialog(String[])
- void dispatchCUIEvent(CUIEvent)
- Locale getLocale()
- boolean canDestroyBedrock()

### Class: com.sk89q.worldedit.extension.platform.Locatable
Type: Interface

Methods:
- Extent getExtent()
- Location getBlockLocation()
- Location getLocation()
- boolean setLocation(Location)
- boolean trySetPosition(Vector3)
- void setPosition(Vector3)

### Class: com.sk89q.worldedit.extension.platform.MultiUserPlatform
Type: Interface
Implements: com.sk89q.worldedit.extension.platform.Platform

Methods:
- Collection getConnectedUsers()

### Class: com.sk89q.worldedit.extension.platform.Platform
Type: Interface
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- String getVersion()
- Registries getRegistries()
- String getPlatformName()
- ResourceLoader getResourceLoader()
- void registerGameHooks()
- boolean isValidMobType(String)
- Map getCapabilities()
- List getWorlds()
- void setGameHooksEnabled(boolean)
- Player matchPlayer(Player)
- int schedule(long, long, Runnable)
- long getTickCount()
- LocalConfiguration getConfiguration()
- void reload()
- World matchWorld(World)
- int getDataVersion()
- void registerCommands(CommandManager)
- String id()
- String getPlatformVersion()
- Watchdog getWatchdog()
- DataFixer getDataFixer()
- TranslationManager getTranslationManager()
- Set getSupportedSideEffects()

### Class: com.sk89q.worldedit.extension.platform.Watchdog
Type: Interface

Methods:
- void tick()

### Class: com.sk89q.worldedit.extension.platform.AbstractCommandBlockActor
Type: Abstract Class
Extends: com.sk89q.worldedit.extension.platform.AbstractNonPlayerActor
Implements: com.sk89q.worldedit.extension.platform.Locatable

Methods:
- Extent getExtent()
- Location getLocation()
- boolean setLocation(Location)

### Class: com.sk89q.worldedit.extension.platform.AbstractNonPlayerActor
Type: Abstract Class
Implements: com.sk89q.worldedit.extension.platform.Actor

Methods:
- boolean isPlayer()
- File openFileSaveDialog(String[])
- void dispatchCUIEvent(CUIEvent)
- File openFileOpenDialog(String[])
- boolean canDestroyBedrock()

### Class: com.sk89q.worldedit.extension.platform.AbstractPlatform
Type: Abstract Class
Implements: com.sk89q.worldedit.extension.platform.Platform

Methods:
- int schedule(long, long, Runnable)
- long getTickCount()
- void reload()
- ResourceLoader getResourceLoader()
- DataFixer getDataFixer()
- TranslationManager getTranslationManager()
- List getWorlds()

### Class: com.sk89q.worldedit.extension.platform.AbstractPlayerActor
Type: Abstract Class
Implements: com.sk89q.worldedit.extension.platform.Actor, com.sk89q.worldedit.entity.Player, java.lang.Cloneable

Methods:
- boolean isPlayer()
- Direction getCardinalDirection()
- Direction getCardinalDirection(int)
- void sendFakeBlock(BlockVector3, BlockStateHolder)
- GameMode getGameMode()
- void setOnGround(Location)
- boolean remove()
- Location getBlockOn()
- void checkPermission(String) throws AuthorizationException
- int hashCode()
- boolean ascendUpwards(int)
- boolean ascendUpwards(int, boolean)
- boolean descendLevel()
- Extent getExtent()
- void findFreePosition(Location)
- void findFreePosition()
- File openFileOpenDialog(String[])
- void setGameMode(GameMode)
- Location getBlockTraceFace(int, boolean)
- Location getBlockTraceFace(int, boolean, Mask)
- boolean trySetPosition(Vector3)
- BaseBlock getBlockInHand(HandSide) throws WorldEditException
- boolean isHoldingPickAxe()
- Location getSolidBlockTrace(int)
- boolean equals(Object)
- Object clone() throws CloneNotSupportedException
- File openFileSaveDialog(String[])
- boolean ascendLevel()
- void dispatchCUIEvent(CUIEvent)
- boolean passThroughForwardWall(int)
- boolean canDestroyBedrock()
- Location getBlockTrace(int, boolean)
- Location getBlockTrace(int, boolean, Mask)
- Location getBlockTrace(int)
- void floatAt(int, int, int, boolean)
- boolean ascendToCeiling(int)
- boolean ascendToCeiling(int, boolean)

### Class: com.sk89q.worldedit.extension.platform.Capability
Type: Enum
Extends: java.lang.Enum

Methods:
- Capability valueOf(String)
- Capability[] values()

### Class: com.sk89q.worldedit.extension.platform.NoCapablePlatformException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: com.sk89q.worldedit.extension.platform.PlatformCommandManager
Type: Class

Methods:
- void handleCommand(CommandEvent)
- void registerSubCommands(String, List, String, CommandRegistration, Object)
- CommandManager getCommandManager()
- ExceptionConverter getExceptionConverter()
- void handleCommandSuggestion(CommandSuggestionEvent)

### Class: com.sk89q.worldedit.extension.platform.PlatformManager
Type: Class

Methods:
- void handleNewPlatformUnready(PlatformUnreadyEvent)
- ListeningExecutorService getExecutorService()
- void handleNewPlatformReady(PlatformReadyEvent)
- boolean isInitialized()
- boolean unregister(Platform)
- World getWorldForEditing(World)
- void handlePlatformsRegistered(PlatformsRegisteredEvent)
- void handlePlatformReady(PlatformReadyEvent)
- LocalConfiguration getConfiguration()
- PlatformCommandManager getPlatformCommandManager()
- void handlePlayerInput(PlayerInputEvent)
- Actor createProxyActor(Actor)
- List getPlatforms()
- Platform queryCapability(Capability) throws NoCapablePlatformException
- void handleBlockInteract(BlockInteractEvent)
- Collection getSupportedSideEffects()
- void register(Platform)

### Class: com.sk89q.worldedit.extension.platform.Preference
Type: Enum
Extends: java.lang.Enum

Methods:
- Preference valueOf(String)
- Preference[] values()
- boolean isPreferredOver(Preference)

## Package: com.sk89q.worldedit.extension.platform.permission

### Class: com.sk89q.worldedit.extension.platform.permission.ActorSelectorLimits
Type: Class
Implements: com.sk89q.worldedit.regions.selector.limit.SelectorLimits

Methods:
- Optional getPolygonVertexLimit()
- Optional getPolyhedronVertexLimit()
- ActorSelectorLimits forActor(Actor)

### Class: com.sk89q.worldedit.extension.platform.permission.OverridePermissions
Type: Class

No public methods found

## Package: com.sk89q.worldedit.extent

### Class: com.sk89q.worldedit.extent.Extent
Type: Interface
Implements: com.sk89q.worldedit.extent.InputExtent, com.sk89q.worldedit.extent.OutputExtent

Methods:
- BlockVector3 getMinimumPoint()
- BlockVector3 getMaximumPoint()
- List getEntities(Region)
- List getEntities()
- Entity createEntity(Location, BaseEntity)

### Class: com.sk89q.worldedit.extent.InputExtent
Type: Interface

Methods:
- BlockState getBlock(BlockVector3)
- BaseBlock getFullBlock(BlockVector3)
- BiomeType getBiome(BlockVector2)
- BiomeType getBiome(BlockVector3)

### Class: com.sk89q.worldedit.extent.OutputExtent
Type: Interface

Methods:
- Operation commit()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- boolean setBiome(BlockVector2, BiomeType)
- boolean setBiome(BlockVector3, BiomeType)
- boolean fullySupports3DBiomes()

### Class: com.sk89q.worldedit.extent.AbstractBufferingExtent
Type: Abstract Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- BlockState getBlock(BlockVector3)
- BaseBlock getFullBlock(BlockVector3)
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException

### Class: com.sk89q.worldedit.extent.AbstractDelegateExtent
Type: Abstract Class
Implements: com.sk89q.worldedit.extent.Extent

Methods:
- BlockVector3 getMinimumPoint()
- Extent getExtent()
- BlockState getBlock(BlockVector3)
- BaseBlock getFullBlock(BlockVector3)
- BlockVector3 getMaximumPoint()
- Operation commit()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- List getEntities()
- List getEntities(Region)
- boolean setBiome(BlockVector3, BiomeType)
- boolean fullySupports3DBiomes()
- Entity createEntity(Location, BaseEntity)
- BiomeType getBiome(BlockVector3)

### Class: com.sk89q.worldedit.extent.ChangeSetExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- void setEnabled(boolean)
- boolean isEnabled()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- List getEntities()
- List getEntities(Region)
- boolean setBiome(BlockVector3, BiomeType)
- Entity createEntity(Location, BaseEntity)

### Class: com.sk89q.worldedit.extent.MaskingExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- Mask getMask()
- void setMask(Mask)
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- boolean setBiome(BlockVector3, BiomeType)

### Class: com.sk89q.worldedit.extent.NullExtent
Type: Class
Implements: com.sk89q.worldedit.extent.Extent

Methods:
- BlockVector3 getMinimumPoint()
- BlockState getBlock(BlockVector3)
- BaseBlock getFullBlock(BlockVector3)
- BlockVector3 getMaximumPoint()
- Operation commit()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- List getEntities(Region)
- List getEntities()
- boolean setBiome(BlockVector3, BiomeType)
- boolean fullySupports3DBiomes()
- Entity createEntity(Location, BaseEntity)
- BiomeType getBiome(BlockVector3)

### Class: com.sk89q.worldedit.extent.TracingExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- SetMultimap getFailedActions()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- String toString()
- boolean setBiome(BlockVector3, BiomeType)
- boolean isActive()
- Entity createEntity(Location, BaseEntity)
- Set getTouchedLocations()

## Package: com.sk89q.worldedit.extent.buffer

### Class: com.sk89q.worldedit.extent.buffer.ExtentBuffer
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractBufferingExtent

Methods:
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException

### Class: com.sk89q.worldedit.extent.buffer.ForgetfulExtentBuffer
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent
Implements: com.sk89q.worldedit.function.pattern.Pattern, com.sk89q.worldedit.function.pattern.BiomePattern

Methods:
- BiomeType applyBiome(BlockVector3)
- BaseBlock applyBlock(BlockVector3)
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- boolean setBiome(BlockVector3, BiomeType)
- Region asRegion()

## Package: com.sk89q.worldedit.extent.buffer.internal

### Class: com.sk89q.worldedit.extent.buffer.internal.BatchingExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractBufferingExtent

Methods:
- void setEnabled(boolean)
- boolean commitRequired()
- boolean isEnabled()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException

## Package: com.sk89q.worldedit.extent.cache

### Class: com.sk89q.worldedit.extent.cache.LastAccessExtentCache
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- BlockState getBlock(BlockVector3)
- BaseBlock getFullBlock(BlockVector3)
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException

## Package: com.sk89q.worldedit.extent.clipboard

### Class: com.sk89q.worldedit.extent.clipboard.Clipboard
Type: Interface
Implements: com.sk89q.worldedit.extent.Extent

Methods:
- BlockVector3 getDimensions()
- Clipboard transform(Transform) throws WorldEditException
- BlockVector3 getOrigin()
- Region getRegion()
- void setOrigin(BlockVector3)
- boolean hasBiomes()

### Class: com.sk89q.worldedit.extent.clipboard.BlockArrayClipboard
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.Clipboard

Methods:
- BlockVector3 getMinimumPoint()
- BlockState getBlock(BlockVector3)
- BlockVector3 getOrigin()
- void setOrigin(BlockVector3)
- Operation commit()
- boolean setBlock(BlockVector3, BlockStateHolder)
- boolean hasBiomes()
- Entity createEntity(Location, BaseEntity)
- BlockVector3 getDimensions()
- BaseBlock getFullBlock(BlockVector3)
- Region getRegion()
- BlockVector3 getMaximumPoint()
- List getEntities(Region)
- List getEntities()
- boolean setBiome(BlockVector3, BiomeType)
- BiomeType getBiome(BlockVector3)

## Package: com.sk89q.worldedit.extent.clipboard.io

### Class: com.sk89q.worldedit.extent.clipboard.io.ClipboardFormat
Type: Interface

Methods:
- String getPrimaryFileExtension()
- Set getAliases()
- String getName()
- ClipboardReader getReader(InputStream) throws IOException
- ClipboardWriter getWriter(OutputStream) throws IOException
- boolean isFormat(File)
- boolean isFormat(InputStream)
- Set getFileExtensions()

### Class: com.sk89q.worldedit.extent.clipboard.io.ClipboardReader
Type: Interface
Implements: java.io.Closeable

Methods:
- Clipboard read() throws IOException
- OptionalInt getDataVersion()

### Class: com.sk89q.worldedit.extent.clipboard.io.ClipboardWriter
Type: Interface
Implements: java.io.Closeable

Methods:
- void write(Clipboard) throws IOException

### Class: com.sk89q.worldedit.extent.clipboard.io.BuiltInClipboardFormat
Type: Enum
Extends: java.lang.Enum
Implements: com.sk89q.worldedit.extent.clipboard.io.ClipboardFormat

Methods:
- Set getAliases()
- String getName()
- BuiltInClipboardFormat valueOf(String)
- BuiltInClipboardFormat[] values()
- Set getFileExtensions()

### Class: com.sk89q.worldedit.extent.clipboard.io.ClipboardFormats
Type: Class

Methods:
- Multimap getFileExtensionMap()
- ClipboardFormat findByInputStream(Supplier)
- Collection getAll()
- ClipboardFormat findByFile(File)
- String[] getFileExtensionArray()
- ClipboardFormat findByAlias(String)
- void registerClipboardFormat(ClipboardFormat)

### Class: com.sk89q.worldedit.extent.clipboard.io.MCEditSchematicReader
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.ClipboardReader

Methods:
- Clipboard read() throws IOException
- void close() throws IOException

### Class: com.sk89q.worldedit.extent.clipboard.io.NBTSchematicReader
Type: Abstract Class
Implements: com.sk89q.worldedit.extent.clipboard.io.ClipboardReader

No public methods found

### Class: com.sk89q.worldedit.extent.clipboard.io.SchematicLoadException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- Component getRichMessage()

### Class: com.sk89q.worldedit.extent.clipboard.io.SpongeSchematicReader
Type: Class
Extends: com.sk89q.worldedit.extent.clipboard.io.NBTSchematicReader

Methods:
- Clipboard read() throws IOException
- OptionalInt getDataVersion()
- void close() throws IOException

### Class: com.sk89q.worldedit.extent.clipboard.io.SpongeSchematicWriter
Type: Class
Extends: com.sk89q.worldedit.extent.clipboard.io.sponge.SpongeSchematicV2Writer
Implements: com.sk89q.worldedit.extent.clipboard.io.ClipboardWriter

No public methods found

## Package: com.sk89q.worldedit.extent.clipboard.io.legacycompat

### Class: com.sk89q.worldedit.extent.clipboard.io.legacycompat.EntityNBTCompatibilityHandler
Type: Interface

Methods:
- LinCompoundTag updateNbt(EntityType, LinCompoundTag)
- CompoundTag updateNBT(EntityType, CompoundTag)
- boolean isAffectedEntity(EntityType, CompoundTag)

### Class: com.sk89q.worldedit.extent.clipboard.io.legacycompat.NBTCompatibilityHandler
Type: Interface

Methods:
- BaseBlock updateNbt(BaseBlock)
- BlockStateHolder updateNBT(BlockStateHolder, Map)
- boolean isAffectedBlock(BlockStateHolder)

### Class: com.sk89q.worldedit.extent.clipboard.io.legacycompat.BannerBlockCompatibilityHandler
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.legacycompat.NBTCompatibilityHandler

Methods:
- BaseBlock updateNbt(BaseBlock)

### Class: com.sk89q.worldedit.extent.clipboard.io.legacycompat.BedBlockCompatibilityHandler
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.legacycompat.NBTCompatibilityHandler

Methods:
- BaseBlock updateNbt(BaseBlock)

### Class: com.sk89q.worldedit.extent.clipboard.io.legacycompat.FlowerPotCompatibilityHandler
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.legacycompat.NBTCompatibilityHandler

Methods:
- BaseBlock updateNbt(BaseBlock)

### Class: com.sk89q.worldedit.extent.clipboard.io.legacycompat.NoteBlockCompatibilityHandler
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.legacycompat.NBTCompatibilityHandler

Methods:
- BaseBlock updateNbt(BaseBlock)

### Class: com.sk89q.worldedit.extent.clipboard.io.legacycompat.Pre13HangingCompatibilityHandler
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.legacycompat.EntityNBTCompatibilityHandler

Methods:
- LinCompoundTag updateNbt(EntityType, LinCompoundTag)

### Class: com.sk89q.worldedit.extent.clipboard.io.legacycompat.SignCompatibilityHandler
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.legacycompat.NBTCompatibilityHandler

Methods:
- BaseBlock updateNbt(BaseBlock)

### Class: com.sk89q.worldedit.extent.clipboard.io.legacycompat.SkullBlockCompatibilityHandler
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.legacycompat.NBTCompatibilityHandler

Methods:
- BaseBlock updateNbt(BaseBlock)

## Package: com.sk89q.worldedit.extent.clipboard.io.share

### Class: com.sk89q.worldedit.extent.clipboard.io.share.ClipboardShareDestination
Type: Interface

Methods:
- Set getAliases()
- String getName()
- ClipboardFormat getDefaultFormat()
- Consumer share(ClipboardShareMetadata, ShareOutputProvider) throws Exception
- boolean supportsFormat(ClipboardFormat)

### Class: com.sk89q.worldedit.extent.clipboard.io.share.ShareOutputProvider
Type: Interface

Methods:
- void writeTo(OutputStream) throws IOException, WorldEditException

### Class: com.sk89q.worldedit.extent.clipboard.io.share.BuiltInClipboardShareDestinations
Type: Enum
Extends: java.lang.Enum
Implements: com.sk89q.worldedit.extent.clipboard.io.share.ClipboardShareDestination

Methods:
- ImmutableSet getAliases()
- Set getAliases()
- String getName()
- BuiltInClipboardShareDestinations valueOf(String)
- BuiltInClipboardShareDestinations[] values()

### Class: com.sk89q.worldedit.extent.clipboard.io.share.ClipboardShareDestinations
Type: Class

Methods:
- Collection getAll()
- ClipboardShareDestination findByAlias(String)
- void registerClipboardShareDestination(ClipboardShareDestination)

### Class: com.sk89q.worldedit.extent.clipboard.io.share.ClipboardShareMetadata
Type: Class
Extends: java.lang.Record

Methods:
- String author()
- int hashCode()
- boolean equals(Object)
- String name()
- ClipboardFormat format()
- String toString()

## Package: com.sk89q.worldedit.extent.clipboard.io.sponge

### Class: com.sk89q.worldedit.extent.clipboard.io.sponge.ReaderUtil
Type: Class

Methods:
- int getSchematicVersion(LinCompoundTag) throws IOException

### Class: com.sk89q.worldedit.extent.clipboard.io.sponge.SpongeSchematicV1Reader
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.ClipboardReader

Methods:
- Clipboard read() throws IOException
- BlockArrayClipboard doRead(LinCompoundTag) throws IOException
- OptionalInt getDataVersion()
- void close() throws IOException

### Class: com.sk89q.worldedit.extent.clipboard.io.sponge.SpongeSchematicV2Reader
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.ClipboardReader

Methods:
- Clipboard read() throws IOException
- Clipboard doRead(LinCompoundTag) throws IOException
- OptionalInt getDataVersion()
- void close() throws IOException

### Class: com.sk89q.worldedit.extent.clipboard.io.sponge.SpongeSchematicV2Writer
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.ClipboardWriter

Methods:
- void close() throws IOException
- void write(Clipboard) throws IOException

### Class: com.sk89q.worldedit.extent.clipboard.io.sponge.SpongeSchematicV3Reader
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.ClipboardReader

Methods:
- Clipboard read() throws IOException
- OptionalInt getDataVersion()
- void close() throws IOException

### Class: com.sk89q.worldedit.extent.clipboard.io.sponge.SpongeSchematicV3Writer
Type: Class
Implements: com.sk89q.worldedit.extent.clipboard.io.ClipboardWriter

Methods:
- void close() throws IOException
- void write(Clipboard) throws IOException

## Package: com.sk89q.worldedit.extent.inventory

### Class: com.sk89q.worldedit.extent.inventory.BlockBag
Type: Abstract Class

Methods:
- void fetchBlock(BlockState) throws BlockBagException
- void addSourcePosition(Location)
- void addSingleSourcePosition(Location)
- boolean peekBlock(BlockState)
- void storeBlock(BlockState) throws BlockBagException
- void storeBlock(BlockState, int) throws BlockBagException
- void fetchPlacedBlock(BlockState) throws BlockBagException
- void storeDroppedBlock(BlockState) throws BlockBagException
- void flushChanges()

### Class: com.sk89q.worldedit.extent.inventory.BlockBagException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.sk89q.worldedit.extent.inventory.BlockBagExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- void setBlockBag(BlockBag)
- BlockBag getBlockBag()
- Map popMissing()

### Class: com.sk89q.worldedit.extent.inventory.OutOfBlocksException
Type: Class
Extends: com.sk89q.worldedit.extent.inventory.BlockBagException

No public methods found

### Class: com.sk89q.worldedit.extent.inventory.OutOfSpaceException
Type: Class
Extends: com.sk89q.worldedit.extent.inventory.BlockBagException

Methods:
- BlockType getType()

### Class: com.sk89q.worldedit.extent.inventory.UnplaceableBlockException
Type: Class
Extends: com.sk89q.worldedit.extent.inventory.BlockBagException

No public methods found

## Package: com.sk89q.worldedit.extent.reorder

### Class: com.sk89q.worldedit.extent.reorder.ReorderingExtent
Type: Interface
Implements: com.sk89q.worldedit.extent.Extent

No public methods found

### Class: com.sk89q.worldedit.extent.reorder.ChunkBatchingExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractBufferingExtent

Methods:
- void setEnabled(boolean)
- boolean commitRequired()
- boolean isEnabled()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException

### Class: com.sk89q.worldedit.extent.reorder.MultiStageReorder
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractBufferingExtent
Implements: com.sk89q.worldedit.extent.reorder.ReorderingExtent

Methods:
- void setEnabled(boolean)
- boolean commitRequired()
- Operation commitBefore()
- boolean isEnabled()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException

## Package: com.sk89q.worldedit.extent.transform

### Class: com.sk89q.worldedit.extent.transform.BlockTransformExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- BlockStateHolder transform(BlockStateHolder, Transform)
- BlockState getBlock(BlockVector3)
- BaseBlock getFullBlock(BlockVector3)
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- Transform getTransform()

## Package: com.sk89q.worldedit.extent.validation

### Class: com.sk89q.worldedit.extent.validation.BlockChangeLimiter
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- int getLimit()
- void setLimit(int)
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- int getCount()

### Class: com.sk89q.worldedit.extent.validation.DataValidatorExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- boolean setBiome(BlockVector3, BiomeType)

## Package: com.sk89q.worldedit.extent.world

### Class: com.sk89q.worldedit.extent.world.BiomeQuirkExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- boolean setBiome(BlockVector3, BiomeType)

### Class: com.sk89q.worldedit.extent.world.BlockQuirkExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException

### Class: com.sk89q.worldedit.extent.world.ChunkLoadingExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- boolean setBiome(BlockVector3, BiomeType)

### Class: com.sk89q.worldedit.extent.world.SideEffectExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- void setPostEditSimulationEnabled(boolean)
- boolean commitRequired()
- boolean isPostEditSimulationEnabled()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- SideEffectSet getSideEffectSet()
- boolean setBiome(BlockVector3, BiomeType)
- void setSideEffectSet(SideEffectSet)

### Class: com.sk89q.worldedit.extent.world.SurvivalModeExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- boolean hasStripNbt()
- void setToolUse(boolean)
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- void setStripNbt(boolean)
- boolean hasToolUse()

### Class: com.sk89q.worldedit.extent.world.WatchdogTickingExtent
Type: Class
Extends: com.sk89q.worldedit.extent.AbstractDelegateExtent

Methods:
- void setEnabled(boolean)
- BlockState getBlock(BlockVector3)
- BaseBlock getFullBlock(BlockVector3)
- boolean isEnabled()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- List getEntities()
- List getEntities(Region)
- boolean setBiome(BlockVector3, BiomeType)
- Entity createEntity(Location, BaseEntity)
- BiomeType getBiome(BlockVector3)

## Package: com.sk89q.worldedit.function

### Class: com.sk89q.worldedit.function.Contextual
Type: Interface

Methods:
- Object createFromContext(EditContext)

### Class: com.sk89q.worldedit.function.EntityFunction
Type: Interface

Methods:
- boolean apply(Entity) throws WorldEditException

### Class: com.sk89q.worldedit.function.FlatRegionFunction
Type: Interface

Methods:
- boolean apply(BlockVector2) throws WorldEditException

### Class: com.sk89q.worldedit.function.LayerFunction
Type: Interface

Methods:
- boolean apply(BlockVector3, int) throws WorldEditException
- boolean isGround(BlockVector3)

### Class: com.sk89q.worldedit.function.RegionFunction
Type: Interface

Methods:
- boolean apply(BlockVector3) throws WorldEditException

### Class: com.sk89q.worldedit.function.CombinedRegionFunction
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- void add(Collection)
- void add(RegionFunction[])
- boolean apply(BlockVector3) throws WorldEditException

### Class: com.sk89q.worldedit.function.EditContext
Type: Class

Methods:
- void setRegion(Region)
- Extent getDestination()
- Region getRegion()
- Pattern getFill()
- void setSession(LocalSession)
- LocalSession getSession()
- void setDestination(Extent)
- void setFill(Pattern)

### Class: com.sk89q.worldedit.function.FlatRegionMaskingFilter
Type: Class
Implements: com.sk89q.worldedit.function.FlatRegionFunction

Methods:
- boolean apply(BlockVector2) throws WorldEditException

### Class: com.sk89q.worldedit.function.GroundFunction
Type: Class
Implements: com.sk89q.worldedit.function.LayerFunction

Methods:
- Mask getMask()
- void setMask(Mask)
- boolean apply(BlockVector3, int) throws WorldEditException
- boolean isGround(BlockVector3)
- int getAffected()

### Class: com.sk89q.worldedit.function.ItemUseFunction
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean apply(BlockVector3) throws WorldEditException

### Class: com.sk89q.worldedit.function.RegionMaskingFilter
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean apply(BlockVector3) throws WorldEditException

## Package: com.sk89q.worldedit.function.biome

### Class: com.sk89q.worldedit.function.biome.BiomeReplace
Type: Class
Implements: com.sk89q.worldedit.function.FlatRegionFunction, com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean apply(BlockVector3) throws WorldEditException
- boolean apply(BlockVector2) throws WorldEditException

### Class: com.sk89q.worldedit.function.biome.ExtentBiomeCopy
Type: Class
Implements: com.sk89q.worldedit.function.FlatRegionFunction, com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean apply(BlockVector3) throws WorldEditException
- boolean apply(BlockVector2) throws WorldEditException

## Package: com.sk89q.worldedit.function.block

### Class: com.sk89q.worldedit.function.block.ApplySideEffect
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean apply(BlockVector3) throws WorldEditException

### Class: com.sk89q.worldedit.function.block.BlockDistributionCounter
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- List getDistribution()
- boolean apply(BlockVector3) throws WorldEditException

### Class: com.sk89q.worldedit.function.block.BlockReplace
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean apply(BlockVector3) throws WorldEditException

### Class: com.sk89q.worldedit.function.block.Counter
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean apply(BlockVector3) throws WorldEditException
- int getCount()

### Class: com.sk89q.worldedit.function.block.ExtentBlockCopy
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean apply(BlockVector3) throws WorldEditException

### Class: com.sk89q.worldedit.function.block.Naturalizer
Type: Class
Implements: com.sk89q.worldedit.function.LayerFunction

Methods:
- boolean apply(BlockVector3, int) throws WorldEditException
- boolean isGround(BlockVector3)
- int getAffected()

### Class: com.sk89q.worldedit.function.block.SnowSimulator
Type: Class
Implements: com.sk89q.worldedit.function.LayerFunction

Methods:
- boolean apply(BlockVector3, int) throws WorldEditException
- boolean isGround(BlockVector3)
- int getAffected()

## Package: com.sk89q.worldedit.function.entity

### Class: com.sk89q.worldedit.function.entity.ExtentEntityCopy
Type: Class
Implements: com.sk89q.worldedit.function.EntityFunction

Methods:
- void setRemoving(boolean)
- boolean apply(Entity) throws WorldEditException
- boolean isRemoving()

## Package: com.sk89q.worldedit.function.factory

### Class: com.sk89q.worldedit.function.factory.Apply
Type: Class
Implements: com.sk89q.worldedit.function.Contextual

Methods:
- Operation createFromContext(EditContext)
- Object createFromContext(EditContext)
- String toString()

### Class: com.sk89q.worldedit.function.factory.ApplyLayer
Type: Class
Implements: com.sk89q.worldedit.function.Contextual

Methods:
- Operation createFromContext(EditContext)
- Object createFromContext(EditContext)
- String toString()

### Class: com.sk89q.worldedit.function.factory.ApplyRegion
Type: Class
Implements: com.sk89q.worldedit.function.Contextual

Methods:
- Operation createFromContext(EditContext)
- Object createFromContext(EditContext)
- String toString()

### Class: com.sk89q.worldedit.function.factory.BiomeFactory
Type: Class
Implements: com.sk89q.worldedit.function.Contextual

Methods:
- RegionFunction createFromContext(EditContext)
- Object createFromContext(EditContext)
- String toString()

### Class: com.sk89q.worldedit.function.factory.Deform
Type: Class
Implements: com.sk89q.worldedit.function.Contextual

Methods:
- void setRegion(Region)
- Extent getDestination()
- Region getRegion()
- void setOffset(Vector3)
- Operation createFromContext(EditContext)
- Object createFromContext(EditContext)
- Vector3 getOffset()
- void setMode(Deform$Mode)
- String toString()
- Deform$Mode getMode()
- void setDestination(Extent)

### Class: com.sk89q.worldedit.function.factory.Paint
Type: Class
Implements: com.sk89q.worldedit.function.Contextual

Methods:
- Operation createFromContext(EditContext)
- Object createFromContext(EditContext)
- String toString()

### Class: com.sk89q.worldedit.function.factory.Snow
Type: Class
Implements: com.sk89q.worldedit.function.Contextual

Methods:
- LayerFunction createFromContext(EditContext)
- Object createFromContext(EditContext)
- String toString()

## Package: com.sk89q.worldedit.function.generator

### Class: com.sk89q.worldedit.function.generator.FeatureGenerator
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean apply(BlockVector3) throws WorldEditException

### Class: com.sk89q.worldedit.function.generator.FloraGenerator
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean isBiomeAware()
- void setBiomeAware(boolean)
- boolean apply(BlockVector3) throws WorldEditException
- Pattern getDesertPattern()
- Pattern getTemperatePattern()

### Class: com.sk89q.worldedit.function.generator.ForestGenerator
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean apply(BlockVector3) throws WorldEditException

### Class: com.sk89q.worldedit.function.generator.GardenPatchGenerator
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- void setPlant(Pattern)
- Pattern getPumpkinPattern()
- boolean apply(BlockVector3) throws WorldEditException
- Pattern getMelonPattern()
- int getAffected()
- Pattern getPlant()

## Package: com.sk89q.worldedit.function.mask

### Class: com.sk89q.worldedit.function.mask.Mask
Type: Interface

Methods:
- Mask2D toMask2D()
- boolean test(BlockVector3)

### Class: com.sk89q.worldedit.function.mask.Mask2D
Type: Interface

Methods:
- boolean test(BlockVector2)

### Class: com.sk89q.worldedit.function.mask.AbstractExtentMask
Type: Abstract Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask

Methods:
- Extent getExtent()
- void setExtent(Extent)

### Class: com.sk89q.worldedit.function.mask.AbstractMask
Type: Abstract Class
Implements: com.sk89q.worldedit.function.mask.Mask

No public methods found

### Class: com.sk89q.worldedit.function.mask.AbstractMask2D
Type: Abstract Class
Implements: com.sk89q.worldedit.function.mask.Mask2D

No public methods found

### Class: com.sk89q.worldedit.function.mask.BiomeMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask

Methods:
- void add(Collection)
- void add(BiomeType[])
- boolean test(BlockVector3)
- Collection getBiomes()

### Class: com.sk89q.worldedit.function.mask.BiomeMask2D
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask2D

Methods:
- void add(Collection)
- void add(BiomeType[])
- boolean test(BlockVector2)
- Collection getBiomes()

### Class: com.sk89q.worldedit.function.mask.BlockCategoryMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractExtentMask

Methods:
- boolean test(BlockVector3)

### Class: com.sk89q.worldedit.function.mask.BlockMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractExtentMask

Methods:
- void add(Collection)
- void add(BaseBlock[])
- boolean test(BlockVector3)
- Collection getBlocks()

### Class: com.sk89q.worldedit.function.mask.BlockStateMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractExtentMask

Methods:
- Mask2D toMask2D()
- boolean test(BlockVector3)

### Class: com.sk89q.worldedit.function.mask.BlockTypeMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractExtentMask

Methods:
- void add(Collection)
- void add(BlockType[])
- boolean test(BlockVector3)
- Collection getBlocks()

### Class: com.sk89q.worldedit.function.mask.BoundedHeightMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask

Methods:
- boolean test(BlockVector3)

### Class: com.sk89q.worldedit.function.mask.ExistingBlockMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractExtentMask

Methods:
- boolean test(BlockVector3)

### Class: com.sk89q.worldedit.function.mask.ExpressionMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask

Methods:
- Mask2D toMask2D()
- boolean test(BlockVector3)

### Class: com.sk89q.worldedit.function.mask.ExpressionMask2D
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask2D

Methods:
- boolean test(BlockVector2)

### Class: com.sk89q.worldedit.function.mask.MaskIntersection
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask

Methods:
- void add(Collection)
- void add(Mask[])
- Mask2D toMask2D()
- boolean test(BlockVector3)
- Collection getMasks()

### Class: com.sk89q.worldedit.function.mask.MaskIntersection2D
Type: Class
Implements: com.sk89q.worldedit.function.mask.Mask2D

Methods:
- void add(Collection)
- void add(Mask2D[])
- boolean test(BlockVector2)
- Collection getMasks()

### Class: com.sk89q.worldedit.function.mask.MaskMemoizer
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask
Implements: java.lang.AutoCloseable

Methods:
- Mask2D toMask2D()
- boolean test(BlockVector3)
- void clear()
- void close()

### Class: com.sk89q.worldedit.function.mask.MaskMemoizer2D
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask2D
Implements: java.lang.AutoCloseable

Methods:
- boolean test(BlockVector2)
- void clear()
- void close()

### Class: com.sk89q.worldedit.function.mask.MaskUnion
Type: Class
Extends: com.sk89q.worldedit.function.mask.MaskIntersection

Methods:
- Mask2D toMask2D()
- boolean test(BlockVector3)

### Class: com.sk89q.worldedit.function.mask.MaskUnion2D
Type: Class
Extends: com.sk89q.worldedit.function.mask.MaskIntersection2D

Methods:
- boolean test(BlockVector2)

### Class: com.sk89q.worldedit.function.mask.Masks
Type: Class

Methods:
- Mask asMask(Mask2D)
- Mask2D alwaysTrue2D()
- Mask negate(Mask)
- Mask2D negate(Mask2D)
- Mask alwaysTrue()
- Mask memoize(Mask)
- Mask2D memoize(Mask2D)

### Class: com.sk89q.worldedit.function.mask.NoiseFilter
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask

Methods:
- void setNoiseGenerator(NoiseGenerator)
- Mask2D toMask2D()
- boolean test(BlockVector3)
- double getDensity()
- NoiseGenerator getNoiseGenerator()
- void setDensity(double)

### Class: com.sk89q.worldedit.function.mask.NoiseFilter2D
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask2D

Methods:
- void setNoiseGenerator(NoiseGenerator)
- boolean test(BlockVector2)
- double getDensity()
- NoiseGenerator getNoiseGenerator()
- void setDensity(double)

### Class: com.sk89q.worldedit.function.mask.OffsetMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask

Methods:
- Mask getMask()
- void setMask(Mask)
- Mask2D toMask2D()
- boolean test(BlockVector3)
- void setOffset(BlockVector3)
- BlockVector3 getOffset()

### Class: com.sk89q.worldedit.function.mask.OffsetMask2D
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask2D

Methods:
- Mask2D getMask()
- void setMask(Mask2D)
- boolean test(BlockVector2)
- void setOffset(BlockVector2)
- BlockVector2 getOffset()

### Class: com.sk89q.worldedit.function.mask.OffsetsMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask

Methods:
- Mask getMask()
- OffsetsMask single(Mask, BlockVector3)
- Mask2D toMask2D()
- boolean test(BlockVector3)
- boolean getExcludeSelf()
- ImmutableSet getOffsets()
- int getMinMatches()
- OffsetsMask$Builder builder(Mask)
- int getMaxMatches()

### Class: com.sk89q.worldedit.function.mask.OffsetsMask2D
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask2D

Methods:
- Mask2D getMask()
- OffsetsMask2D single(Mask2D, BlockVector2)
- boolean test(BlockVector2)
- boolean getExcludeSelf()
- ImmutableSet getOffsets()
- int getMinMatches()
- OffsetsMask2D$Builder builder(Mask2D)
- int getMaxMatches()

### Class: com.sk89q.worldedit.function.mask.RegionMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask

Methods:
- void setRegion(Region)
- boolean test(BlockVector3)
- Region getRegion()

### Class: com.sk89q.worldedit.function.mask.SolidBlockMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractExtentMask

Methods:
- boolean test(BlockVector3)

### Class: com.sk89q.worldedit.function.mask.SplatterMask
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask

Methods:
- Mask2D toMask2D()
- boolean test(BlockVector3)

### Class: com.sk89q.worldedit.function.mask.SplatterMask2D
Type: Class
Extends: com.sk89q.worldedit.function.mask.AbstractMask2D

Methods:
- boolean test(BlockVector2)

## Package: com.sk89q.worldedit.function.operation

### Class: com.sk89q.worldedit.function.operation.Operation
Type: Interface

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException
- Iterable getStatusMessages()
- void addStatusMessages(List)

### Class: com.sk89q.worldedit.function.operation.ChangeSetExecutor
Type: Class
Implements: com.sk89q.worldedit.function.operation.Operation

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException
- ChangeSetExecutor createRedo(ChangeSet, UndoContext)
- ChangeSetExecutor createUndo(ChangeSet, UndoContext)

### Class: com.sk89q.worldedit.function.operation.DelegateOperation
Type: Class
Implements: com.sk89q.worldedit.function.operation.Operation

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException
- Iterable getStatusMessages()

### Class: com.sk89q.worldedit.function.operation.ForwardExtentCopy
Type: Class
Implements: com.sk89q.worldedit.function.operation.Operation

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException
- void setCopyingBiomes(boolean)
- boolean isCopyingEntities()
- Mask getSourceMask()
- void setRepetitions(int)
- RegionFunction getSourceFunction()
- void setRemovingEntities(boolean)
- void setSourceMask(Mask)
- void setSourceFunction(RegionFunction)
- boolean isRemovingEntities()
- int getRepetitions()
- boolean isCopyingBiomes()
- Iterable getStatusMessages()
- void setTransform(Transform)
- void setCopyingEntities(boolean)
- Transform getTransform()
- int getAffected()

### Class: com.sk89q.worldedit.function.operation.OperationQueue
Type: Class
Implements: com.sk89q.worldedit.function.operation.Operation

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException
- void offer(Operation)
- Iterable getStatusMessages()

### Class: com.sk89q.worldedit.function.operation.Operations
Type: Class

Methods:
- void complete(Operation) throws WorldEditException
- void completeLegacy(Operation) throws MaxChangedBlocksException
- void completeBlindly(Operation)

### Class: com.sk89q.worldedit.function.operation.RunContext
Type: Class

Methods:
- boolean shouldContinue()

### Class: com.sk89q.worldedit.function.operation.SetBlockMap
Type: Class
Implements: com.sk89q.worldedit.function.operation.Operation

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException

### Class: com.sk89q.worldedit.function.operation.SetLocatedBlocks
Type: Class
Implements: com.sk89q.worldedit.function.operation.Operation

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException

## Package: com.sk89q.worldedit.function.pattern

### Class: com.sk89q.worldedit.function.pattern.BiomePattern
Type: Interface

Methods:
- BiomeType applyBiome(BlockVector3)
- BiomeType apply(BlockVector2)

### Class: com.sk89q.worldedit.function.pattern.ExtentPattern
Type: Interface
Implements: com.sk89q.worldedit.function.pattern.Pattern

Methods:
- Extent getExtent()

### Class: com.sk89q.worldedit.function.pattern.Pattern
Type: Interface

Methods:
- BaseBlock apply(BlockVector3)
- BaseBlock applyBlock(BlockVector3)

### Class: com.sk89q.worldedit.function.pattern.AbstractExtentPattern
Type: Abstract Class
Extends: com.sk89q.worldedit.function.pattern.AbstractPattern
Implements: com.sk89q.worldedit.function.pattern.ExtentPattern

Methods:
- Extent getExtent()

### Class: com.sk89q.worldedit.function.pattern.AbstractPattern
Type: Abstract Class
Implements: com.sk89q.worldedit.function.pattern.Pattern

No public methods found

### Class: com.sk89q.worldedit.function.pattern.BlockPattern
Type: Class
Extends: com.sk89q.worldedit.function.pattern.AbstractPattern

Methods:
- BaseBlock getBlock()
- BaseBlock applyBlock(BlockVector3)
- void setBlock(BlockStateHolder)

### Class: com.sk89q.worldedit.function.pattern.ClipboardPattern
Type: Class
Extends: com.sk89q.worldedit.function.pattern.RepeatingExtentPattern

No public methods found

### Class: com.sk89q.worldedit.function.pattern.ExtentBufferedCompositePattern
Type: Class
Extends: com.sk89q.worldedit.function.pattern.AbstractExtentPattern

Methods:
- BaseBlock applyBlock(BlockVector3)

### Class: com.sk89q.worldedit.function.pattern.RandomPattern
Type: Class
Extends: com.sk89q.worldedit.function.pattern.AbstractPattern

Methods:
- void add(Pattern, double)
- BaseBlock applyBlock(BlockVector3)

### Class: com.sk89q.worldedit.function.pattern.RandomStatePattern
Type: Class
Implements: com.sk89q.worldedit.function.pattern.Pattern

Methods:
- BaseBlock applyBlock(BlockVector3)

### Class: com.sk89q.worldedit.function.pattern.RepeatingExtentPattern
Type: Class
Extends: com.sk89q.worldedit.function.pattern.AbstractExtentPattern

Methods:
- BlockVector3 getOrigin()
- void setOrigin(BlockVector3)
- void setOffset(BlockVector3)
- BaseBlock applyBlock(BlockVector3)
- BlockVector3 getOffset()

### Class: com.sk89q.worldedit.function.pattern.StateApplyingPattern
Type: Class
Extends: com.sk89q.worldedit.function.pattern.AbstractExtentPattern

Methods:
- BaseBlock applyBlock(BlockVector3)

### Class: com.sk89q.worldedit.function.pattern.TypeApplyingPattern
Type: Class
Extends: com.sk89q.worldedit.function.pattern.AbstractExtentPattern

Methods:
- BaseBlock applyBlock(BlockVector3)

### Class: com.sk89q.worldedit.function.pattern.WaterloggedRemover
Type: Class
Extends: com.sk89q.worldedit.function.pattern.AbstractExtentPattern

Methods:
- BaseBlock applyBlock(BlockVector3)

## Package: com.sk89q.worldedit.function.util

### Class: com.sk89q.worldedit.function.util.FlatRegionOffset
Type: Class
Implements: com.sk89q.worldedit.function.FlatRegionFunction

Methods:
- boolean apply(BlockVector2) throws WorldEditException
- void setOffset(BlockVector2)
- BlockVector2 getOffset()

### Class: com.sk89q.worldedit.function.util.RegionOffset
Type: Class
Implements: com.sk89q.worldedit.function.RegionFunction

Methods:
- boolean apply(BlockVector3) throws WorldEditException
- void setOffset(BlockVector3)
- BlockVector3 getOffset()

## Package: com.sk89q.worldedit.function.visitor

### Class: com.sk89q.worldedit.function.visitor.BreadthFirstSearch
Type: Abstract Class
Implements: com.sk89q.worldedit.function.operation.Operation

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException
- Iterable getStatusMessages()
- void visit(BlockVector3)
- int getAffected()

### Class: com.sk89q.worldedit.function.visitor.DownwardVisitor
Type: Class
Extends: com.sk89q.worldedit.function.visitor.RecursiveVisitor

No public methods found

### Class: com.sk89q.worldedit.function.visitor.EntityVisitor
Type: Class
Implements: com.sk89q.worldedit.function.operation.Operation

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException
- Iterable getStatusMessages()
- int getAffected()

### Class: com.sk89q.worldedit.function.visitor.FlatRegionVisitor
Type: Class
Implements: com.sk89q.worldedit.function.operation.Operation

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException
- Iterable getStatusMessages()
- int getAffected()

### Class: com.sk89q.worldedit.function.visitor.LayerVisitor
Type: Class
Implements: com.sk89q.worldedit.function.operation.Operation

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException
- Mask2D getMask()
- void setMask(Mask2D)

### Class: com.sk89q.worldedit.function.visitor.NonRisingVisitor
Type: Class
Extends: com.sk89q.worldedit.function.visitor.RecursiveVisitor

No public methods found

### Class: com.sk89q.worldedit.function.visitor.RecursiveVisitor
Type: Class
Extends: com.sk89q.worldedit.function.visitor.BreadthFirstSearch

No public methods found

### Class: com.sk89q.worldedit.function.visitor.RegionVisitor
Type: Class
Implements: com.sk89q.worldedit.function.operation.Operation

Methods:
- void cancel()
- Operation resume(RunContext) throws WorldEditException
- Iterable getStatusMessages()
- int getAffected()

## Package: com.sk89q.worldedit.history

### Class: com.sk89q.worldedit.history.UndoContext
Type: Class

Methods:
- Extent getExtent()
- void setExtent(Extent)

## Package: com.sk89q.worldedit.history.change

### Class: com.sk89q.worldedit.history.change.Change
Type: Interface

Methods:
- void undo(UndoContext) throws WorldEditException
- void redo(UndoContext) throws WorldEditException

### Class: com.sk89q.worldedit.history.change.BiomeChange
Type: Class
Implements: com.sk89q.worldedit.history.change.Change

Methods:
- BiomeType getPrevious()
- void undo(UndoContext) throws WorldEditException
- BlockVector2 getPosition()
- void redo(UndoContext) throws WorldEditException
- BiomeType getCurrent()

### Class: com.sk89q.worldedit.history.change.BiomeChange3D
Type: Class
Extends: java.lang.Record
Implements: com.sk89q.worldedit.history.change.Change

Methods:
- BiomeType getPrevious()
- BiomeType current()
- void undo(UndoContext) throws WorldEditException
- BlockVector3 getPosition()
- BiomeType previous()
- int hashCode()
- boolean equals(Object)
- String toString()
- BlockVector3 position()
- void redo(UndoContext) throws WorldEditException
- BiomeType getCurrent()

### Class: com.sk89q.worldedit.history.change.BlockChange
Type: Class
Extends: java.lang.Record
Implements: com.sk89q.worldedit.history.change.Change

Methods:
- BaseBlock getPrevious()
- BaseBlock current()
- void undo(UndoContext) throws WorldEditException
- BlockVector3 getPosition()
- BaseBlock previous()
- int hashCode()
- boolean equals(Object)
- String toString()
- BlockVector3 position()
- void redo(UndoContext) throws WorldEditException
- BaseBlock getCurrent()

### Class: com.sk89q.worldedit.history.change.EntityCreate
Type: Class
Implements: com.sk89q.worldedit.history.change.Change

Methods:
- void undo(UndoContext) throws WorldEditException
- void redo(UndoContext) throws WorldEditException

### Class: com.sk89q.worldedit.history.change.EntityRemove
Type: Class
Implements: com.sk89q.worldedit.history.change.Change

Methods:
- void undo(UndoContext) throws WorldEditException
- void redo(UndoContext) throws WorldEditException

## Package: com.sk89q.worldedit.history.changeset

### Class: com.sk89q.worldedit.history.changeset.ChangeSet
Type: Interface

Methods:
- void add(Change)
- void setRecordChanges(boolean)
- Iterator forwardIterator()
- int size()
- boolean isRecordingChanges()
- Iterator backwardIterator()

### Class: com.sk89q.worldedit.history.changeset.ArrayListHistory
Type: Class
Implements: com.sk89q.worldedit.history.changeset.ChangeSet

Methods:
- void add(Change)
- void setRecordChanges(boolean)
- Iterator forwardIterator()
- int size()
- boolean isRecordingChanges()
- Iterator backwardIterator()

### Class: com.sk89q.worldedit.history.changeset.BlockOptimizedHistory
Type: Class
Extends: com.sk89q.worldedit.history.changeset.ArrayListHistory

Methods:
- void add(Change)
- Iterator forwardIterator()
- int size()
- Iterator backwardIterator()

## Package: com.sk89q.worldedit.internal

### Class: com.sk89q.worldedit.internal.Constants
Type: Class

No public methods found

### Class: com.sk89q.worldedit.internal.SchematicsEventListener
Type: Class

Methods:
- void onConfigLoad(ConfigurationLoadEvent)

## Package: com.sk89q.worldedit.internal.annotation

### Class: com.sk89q.worldedit.internal.annotation.Chunk3d
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.sk89q.worldedit.internal.annotation.ClipboardMask
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.sk89q.worldedit.internal.annotation.Direction
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean includeDiagonals()

### Class: com.sk89q.worldedit.internal.annotation.MultiDirection
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean includeDiagonals()

### Class: com.sk89q.worldedit.internal.annotation.Offset
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.sk89q.worldedit.internal.annotation.OptionalArg
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.sk89q.worldedit.internal.annotation.Radii
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- int value()

### Class: com.sk89q.worldedit.internal.annotation.Selection
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.sk89q.worldedit.internal.annotation.VertHeight
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

## Package: com.sk89q.worldedit.internal.anvil

### Class: com.sk89q.worldedit.internal.anvil.ChunkDeleter
Type: Class

Methods:
- ChunkDeletionInfo readInfo(Path) throws IOException, JsonSyntaxException
- void runFromFile(Path, boolean)
- int getDeletionsRequested()
- void writeInfo(ChunkDeletionInfo, Path) throws IOException, JsonIOException
- int getDeletedChunkCount()

### Class: com.sk89q.worldedit.internal.anvil.ChunkDeletionInfo
Type: Class

No public methods found

## Package: com.sk89q.worldedit.internal.block

### Class: com.sk89q.worldedit.internal.block.BlockStateIdAccess
Type: Class

Methods:
- void setBlockStateInternalId(BlockStateIdAccess$BlockStateInternalId)
- int getBlockStateId(BlockState)
- void clear()
- BlockState getBlockStateById(int)
- int invalidId()
- boolean isValidInternalId(int)
- void register(BlockState, int)

## Package: com.sk89q.worldedit.internal.command

### Class: com.sk89q.worldedit.internal.command.CommandArgParser
Type: Class

Methods:
- Stream parseArgs()
- CommandArgParser forArgString(String)
- ImmutableList spaceSplit(String)

### Class: com.sk89q.worldedit.internal.command.CommandLoggingHandler
Type: Class
Implements: org.enginehub.piston.gen.CommandCallListener, java.lang.AutoCloseable

Methods:
- void close()
- void beforeCall(Method, CommandParameters)

### Class: com.sk89q.worldedit.internal.command.CommandRegistrationHandler
Type: Class

Methods:
- void register(CommandManager, CommandRegistration, Object)

### Class: com.sk89q.worldedit.internal.command.CommandUtil
Type: Class

Methods:
- boolean isDeprecated(Command)
- Command deprecate(Command, String, CommandUtil$ReplacementMessageGenerator)
- void checkCommandArgument(boolean, String)
- void checkCommandArgument(boolean, Component)
- Comparator byCleanName()
- Map getSubCommands(Command)
- Object requireIV(Key, String, InjectedValueAccess)
- Optional deprecationWarning(Command)
- List fixSuggestions(String, List)
- Optional footerWithoutDeprecation(Command)
- Component createNewCommandReplacementText(String)

## Package: com.sk89q.worldedit.internal.command.exception

### Class: com.sk89q.worldedit.internal.command.exception.ExceptionConverter
Type: Interface

Methods:
- void convert(Throwable) throws CommandException

### Class: com.sk89q.worldedit.internal.command.exception.ExceptionMatch
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.sk89q.worldedit.internal.command.exception.ExceptionConverterHelper
Type: Abstract Class
Implements: com.sk89q.worldedit.internal.command.exception.ExceptionConverter

Methods:
- void convert(Throwable) throws CommandException

### Class: com.sk89q.worldedit.internal.command.exception.WorldEditExceptionConverter
Type: Class
Extends: com.sk89q.worldedit.internal.command.exception.ExceptionConverterHelper

Methods:
- void convert(NumberFormatException) throws CommandException
- void convert(IncompleteRegionException) throws CommandException
- void convert(MissingWorldException) throws CommandException
- void convert(NoMatchException) throws CommandException
- void convert(InvalidItemException) throws CommandException
- void convert(DisallowedUsageException) throws CommandException
- void convert(MaxChangedBlocksException) throws CommandException
- void convert(MaxBrushRadiusException) throws CommandException
- void convert(MaxRadiusException) throws CommandException
- void convert(UnknownDirectionException) throws CommandException
- void convert(InsufficientArgumentsException) throws CommandException
- void convert(RegionOperationException) throws CommandException
- void convert(ExpressionException) throws CommandException
- void convert(EmptyClipboardException) throws CommandException
- void convert(InvalidFilenameException) throws CommandException
- void convert(FilenameResolutionException) throws CommandException
- void convert(InvalidToolBindException) throws CommandException
- void convert(FileSelectionAbortedException) throws CommandException
- void convert(SchematicLoadException) throws CommandException
- void convert(WorldEditException) throws CommandException
- void convert(UsageException) throws CommandException

## Package: com.sk89q.worldedit.internal.cui

### Class: com.sk89q.worldedit.internal.cui.CUIEvent
Type: Interface

Methods:
- String[] getParameters()
- String getTypeId()

### Class: com.sk89q.worldedit.internal.cui.CUIRegion
Type: Interface

Methods:
- String getLegacyTypeID()
- void describeLegacyCUI(LocalSession, Actor)
- int getProtocolVersion()
- void describeCUI(LocalSession, Actor)
- String getTypeID()

### Class: com.sk89q.worldedit.internal.cui.SelectionCylinderEvent
Type: Class
Implements: com.sk89q.worldedit.internal.cui.CUIEvent

Methods:
- String[] getParameters()
- String getTypeId()

### Class: com.sk89q.worldedit.internal.cui.SelectionEllipsoidPointEvent
Type: Class
Implements: com.sk89q.worldedit.internal.cui.CUIEvent

Methods:
- String[] getParameters()
- String getTypeId()

### Class: com.sk89q.worldedit.internal.cui.SelectionMinMaxEvent
Type: Class
Implements: com.sk89q.worldedit.internal.cui.CUIEvent

Methods:
- String[] getParameters()
- String getTypeId()

### Class: com.sk89q.worldedit.internal.cui.SelectionPoint2DEvent
Type: Class
Implements: com.sk89q.worldedit.internal.cui.CUIEvent

Methods:
- String[] getParameters()
- String getTypeId()

### Class: com.sk89q.worldedit.internal.cui.SelectionPointEvent
Type: Class
Implements: com.sk89q.worldedit.internal.cui.CUIEvent

Methods:
- String[] getParameters()
- String getTypeId()

### Class: com.sk89q.worldedit.internal.cui.SelectionPolygonEvent
Type: Class
Implements: com.sk89q.worldedit.internal.cui.CUIEvent

Methods:
- String[] getParameters()
- String getTypeId()

### Class: com.sk89q.worldedit.internal.cui.SelectionShapeEvent
Type: Class
Implements: com.sk89q.worldedit.internal.cui.CUIEvent

Methods:
- String[] getParameters()
- String getTypeId()

### Class: com.sk89q.worldedit.internal.cui.ServerCUIHandler
Type: Class

Methods:
- int getMaxServerCuiSize()
- BaseBlock createStructureBlock(Player)

## Package: com.sk89q.worldedit.internal.event

### Class: com.sk89q.worldedit.internal.event.InteractionDebouncer
Type: Class

Methods:
- void clearInteraction(Identifiable)
- void setLastInteraction(Identifiable, boolean)
- Optional getDuplicateInteractionResult(Identifiable)

## Package: com.sk89q.worldedit.internal.expression

### Class: com.sk89q.worldedit.internal.expression.CompiledExpression
Type: Interface

Methods:
- Double execute(ExecutionData)

### Class: com.sk89q.worldedit.internal.expression.ExpressionEnvironment
Type: Interface

Methods:
- int getBlockDataRel(double, double, double)
- int getBlockTypeRel(double, double, double)
- int getBlockData(double, double, double)
- int getBlockDataAbs(double, double, double)
- int getBlockTypeAbs(double, double, double)
- int getBlockType(double, double, double)

### Class: com.sk89q.worldedit.internal.expression.ExpressionFunction
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.sk89q.worldedit.internal.expression.Identifiable
Type: Interface

Methods:
- int getPosition()
- char id()

### Class: com.sk89q.worldedit.internal.expression.LocalSlot
Type: Interface

Methods:
- double value()

### Class: com.sk89q.worldedit.internal.expression.EvaluationException
Type: Class
Extends: com.sk89q.worldedit.internal.expression.ExpressionException

No public methods found

### Class: com.sk89q.worldedit.internal.expression.ExecutionData
Type: Class
Extends: java.lang.Record

Methods:
- void checkDeadline()
- SlotTable slots()
- Functions functions()
- int hashCode()
- boolean equals(Object)
- String toString()
- Instant deadline()

### Class: com.sk89q.worldedit.internal.expression.Expression
Type: Class

Methods:
- void optimize()
- Expression compile(String, String[]) throws ExpressionException
- String getSource()
- ExpressionEnvironment getEnvironment()
- String toString()
- SlotTable getSlots()
- void setEnvironment(ExpressionEnvironment)
- double evaluate(double[]) throws EvaluationException
- double evaluate(double[], int) throws EvaluationException

### Class: com.sk89q.worldedit.internal.expression.ExpressionException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- int getPosition()

### Class: com.sk89q.worldedit.internal.expression.ExpressionHelper
Type: Class

Methods:
- MethodHandle resolveFunction(Functions, ExpressionParser$FunctionCallContext)
- void checkIterations(int, int)
- int getErrorPosition(Token)
- String getArgumentHandleName(String, MethodType, int, ParserRuleContext)
- EvaluationException evalException(ParserRuleContext, String)
- EvaluationException evalException(Token, String)
- EvaluationException evalException(int, String)
- void check(boolean, ParserRuleContext, String)
- void check(boolean, int, String)

### Class: com.sk89q.worldedit.internal.expression.ExpressionTimeoutException
Type: Class
Extends: com.sk89q.worldedit.internal.expression.EvaluationException

No public methods found

### Class: com.sk89q.worldedit.internal.expression.Functions
Type: Class

Methods:
- ExpressionEnvironment getEnvironment()
- void setEnvironment(ExpressionEnvironment)
- SetMultimap getMap()

### Class: com.sk89q.worldedit.internal.expression.LexerException
Type: Class
Extends: com.sk89q.worldedit.internal.expression.ExpressionException

No public methods found

### Class: com.sk89q.worldedit.internal.expression.ParserException
Type: Class
Extends: com.sk89q.worldedit.internal.expression.ExpressionException

No public methods found

### Class: com.sk89q.worldedit.internal.expression.SlotTable
Type: Class

Methods:
- Optional getSlot(String)
- boolean containsSlot(String)
- OptionalDouble getSlotValue(String)
- void putSlot(String, LocalSlot)
- Optional getVariable(String)
- Set keySet()
- Optional initVariable(String)

## Package: com.sk89q.worldedit.internal.expression.invoke

### Class: com.sk89q.worldedit.internal.expression.invoke.ExpressionCompiler
Type: Class

Methods:
- CompiledExpression compileExpression(ExpressionParser$AllStatementsContext, Functions)

### Class: com.sk89q.worldedit.internal.expression.invoke.ReturnException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- Double getResult()

## Package: com.sk89q.worldedit.internal.helper

### Class: com.sk89q.worldedit.internal.helper.MCDirections
Type: Class

Methods:
- Direction fromPre13Hanging(int)
- Direction fromHanging(int)
- Direction fromRotation(int)
- Direction fromHorizontalHanging(int)
- int fromLegacyHanging(byte)
- int toRotation(Direction)
- int toHorizontalHanging(Direction)
- int toHanging(Direction)

## Package: com.sk89q.worldedit.internal.registry

### Class: com.sk89q.worldedit.internal.registry.AbstractFactory
Type: Abstract Class

Methods:
- List getSuggestions(String)
- List getSuggestions(String, ParserContext)
- List getParsers()
- Object parseFromInput(String, ParserContext) throws InputParseException
- void register(InputParser)

### Class: com.sk89q.worldedit.internal.registry.InputParser
Type: Abstract Class

Methods:
- Stream getSuggestions(String)
- Stream getSuggestions(String, ParserContext)
- Object parseFromInput(String, ParserContext) throws InputParseException

### Class: com.sk89q.worldedit.internal.registry.SimpleInputParser
Type: Abstract Class
Extends: com.sk89q.worldedit.internal.registry.InputParser

Methods:
- Stream getSuggestions(String, ParserContext)
- Object parseFromSimpleInput(String, ParserContext) throws InputParseException
- Object parseFromInput(String, ParserContext) throws InputParseException
- List getMatchedAliases()
- String getPrimaryMatcher()

## Package: com.sk89q.worldedit.internal.util

### Class: com.sk89q.worldedit.internal.util.NonAbstractForCompatibility
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class[] delegateParams()
- String delegateName()

### Class: com.sk89q.worldedit.internal.util.ClipboardTransformBaker
Type: Class

Methods:
- Clipboard bakeTransform(Clipboard, Transform) throws WorldEditException

### Class: com.sk89q.worldedit.internal.util.DeprecationUtil
Type: Class

Methods:
- String getHeadOwnerKey()
- void checkDelegatingOverride(Class)
- boolean isSign(BlockType)

### Class: com.sk89q.worldedit.internal.util.ErrorReporting
Type: Class

Methods:
- void trigger(Actor, Throwable)

### Class: com.sk89q.worldedit.internal.util.InfoEntryPoint
Type: Class

Methods:
- void main(String[])

### Class: com.sk89q.worldedit.internal.util.LogManagerCompat
Type: Class

Methods:
- Logger getLogger()

### Class: com.sk89q.worldedit.internal.util.RegionOptimizedVectorSorter
Type: Class

Methods:
- void sort(List)
- void sort(boolean, List)

### Class: com.sk89q.worldedit.internal.util.Substring
Type: Class

Methods:
- int getStart()
- int hashCode()
- boolean equals(Object)
- String getSubstring()
- String toString()
- Substring from(String, int)
- Substring from(String, int, int)
- int getEnd()
- Substring wrap(String, int, int)

### Class: com.sk89q.worldedit.internal.util.VarIntIterator
Type: Class
Implements: java.util.PrimitiveIterator$OfInt

Methods:
- boolean hasNext()
- int nextInt()

## Package: com.sk89q.worldedit.internal.wna

### Class: com.sk89q.worldedit.internal.wna.WorldNativeAccess
Type: Interface

Methods:
- void updateLightingForBlock(Object)
- void onBlockStateChange(Object, Object, Object)
- boolean setBlock(BlockVector3, BlockStateHolder, SideEffectSet) throws WorldEditException
- void updateNeighbors(Object, Object, Object, int)
- void markBlockChanged(Object, Object)
- boolean isChunkTicking(Object)
- Object setBlockState(Object, Object, Object)
- void markAndNotifyBlock(Object, Object, Object, Object, SideEffectSet)
- void updateBlock(Object, Object, Object)
- Object getValidBlockForPosition(Object, Object)
- Object toNative(BlockState)
- void setCurrentSideEffectSet(SideEffectSet)
- void notifyBlockUpdate(Object, Object, Object, Object)
- Object getPosition(int, int, int)
- void notifyNeighbors(Object, Object, Object)
- boolean updateTileEntity(Object, LinCompoundTag)
- Object getChunk(int, int)
- void applySideEffects(BlockVector3, BlockState, SideEffectSet)
- Object getBlockState(Object, Object)

## Package: com.sk89q.worldedit.jchronic

### Class: com.sk89q.worldedit.jchronic.Chronic
Type: Class

Methods:
- Span guess(Span)
- Span parse(String)
- Span parse(String, Options)

### Class: com.sk89q.worldedit.jchronic.Options
Type: Class

Methods:
- boolean isDebug()
- void setNow(Calendar)
- void setAmbiguousTimeRange(int)
- boolean isGuess()
- void setGuess(boolean)
- Calendar getNow()
- void setContext(Pointer$PointerType)
- boolean isCompatibilityMode()
- int getAmbiguousTimeRange()
- Pointer$PointerType getContext()
- void setCompatibilityMode(boolean)
- void setDebug(boolean)

## Package: com.sk89q.worldedit.jchronic.handlers

### Class: com.sk89q.worldedit.jchronic.handlers.IHandler
Type: Interface

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.DummyHandler
Type: Class
Implements: com.sk89q.worldedit.jchronic.handlers.IHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.Handler
Type: Class

Methods:
- Span dayOrTime(Calendar, List, Options)
- List dealiasAndDisambiguateTimes(List, Options)
- Span getAnchor(List, Options)
- boolean match(List, Map)
- String toString()
- List getRepeaters(List)
- Span findWithin(List, Span, Pointer$PointerType, Options)
- Span tokensToSpan(List, Options)
- IHandler getHandler()
- Map definitions()
- boolean isCompatible(Options)

### Class: com.sk89q.worldedit.jchronic.handlers.HandlerPattern
Type: Class

Methods:
- boolean isOptional()

### Class: com.sk89q.worldedit.jchronic.handlers.HandlerTypePattern
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.HandlerPattern

Methods:
- Handler$HandlerType getType()

### Class: com.sk89q.worldedit.jchronic.handlers.MDHandler
Type: Abstract Class
Implements: com.sk89q.worldedit.jchronic.handlers.IHandler

Methods:
- Span handle(Repeater, Tag, List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.ORGRHandler
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.ORRHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.ORRHandler
Type: Abstract Class
Implements: com.sk89q.worldedit.jchronic.handlers.IHandler

Methods:
- Span handle(List, Span, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.ORSRHandler
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.ORRHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.PSRHandler
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.SRPHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.RGRHandler
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.RHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.RHandler
Type: Class
Implements: com.sk89q.worldedit.jchronic.handlers.IHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.RdnRmnSdTTzSyHandler
Type: Class
Implements: com.sk89q.worldedit.jchronic.handlers.IHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.RmnOdHandler
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.MDHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.RmnSdHandler
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.MDHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.RmnSdSyHandler
Type: Class
Implements: com.sk89q.worldedit.jchronic.handlers.IHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.RmnSyHandler
Type: Class
Implements: com.sk89q.worldedit.jchronic.handlers.IHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.SRPAHandler
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.SRPHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.SRPHandler
Type: Class
Implements: com.sk89q.worldedit.jchronic.handlers.IHandler

Methods:
- Span handle(List, Span, Options)
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.SdRmnSyHandler
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.RmnSdSyHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.SdSmSyHandler
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.SmSdSyHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.SmSdHandler
Type: Class
Implements: com.sk89q.worldedit.jchronic.handlers.IHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.SmSdSyHandler
Type: Class
Implements: com.sk89q.worldedit.jchronic.handlers.IHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.SmSyHandler
Type: Class
Implements: com.sk89q.worldedit.jchronic.handlers.IHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.SySmSdHandler
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.SmSdSyHandler

Methods:
- Span handle(List, Options)

### Class: com.sk89q.worldedit.jchronic.handlers.TagPattern
Type: Class
Extends: com.sk89q.worldedit.jchronic.handlers.HandlerPattern

Methods:
- Class getTagClass()
- String toString()

## Package: com.sk89q.worldedit.jchronic.numerizer

### Class: com.sk89q.worldedit.jchronic.numerizer.Numerizer
Type: Class

Methods:
- String andition(String)
- String numerize(String)

## Package: com.sk89q.worldedit.jchronic.repeaters

### Class: com.sk89q.worldedit.jchronic.repeaters.EnumRepeaterDayPortion
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterDayPortion

No public methods found

### Class: com.sk89q.worldedit.jchronic.repeaters.IntegerRepeaterDayPortion
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterDayPortion

No public methods found

### Class: com.sk89q.worldedit.jchronic.repeaters.Repeater
Type: Abstract Class
Extends: com.sk89q.worldedit.jchronic.tags.Tag
Implements: java.lang.Comparable

Methods:
- Span thisSpan(Pointer$PointerType)
- Span getOffset(Span, int, Pointer$PointerType)
- List scan(List)
- List scan(List, Options)
- String toString()
- Span nextSpan(Pointer$PointerType)
- int getWidth()
- int compareTo(Repeater)
- int compareTo(Object)

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterDay
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterUnit

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterDayName
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.Repeater

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- RepeaterDayName scan(Token)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterDayPortion
Type: Abstract Class
Extends: com.sk89q.worldedit.jchronic.repeaters.Repeater

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- EnumRepeaterDayPortion scan(Token)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterFortnight
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterUnit

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterHour
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterUnit

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterMinute
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterUnit

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterMonth
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterUnit

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterMonthName
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.Repeater

Methods:
- int getIndex()
- Span getOffset(Span, int, Pointer$PointerType)
- RepeaterMonthName scan(Token)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterSeason
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterUnit

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterSeasonName
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.Repeater

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterSecond
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterUnit

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterTime
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.Repeater

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- RepeaterTime scan(Token, List, Options)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterUnit
Type: Abstract Class
Extends: com.sk89q.worldedit.jchronic.repeaters.Repeater

Methods:
- RepeaterUnit scan(Token)

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterWeek
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterUnit

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterWeekend
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterUnit

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- String toString()
- int getWidth()

### Class: com.sk89q.worldedit.jchronic.repeaters.RepeaterYear
Type: Class
Extends: com.sk89q.worldedit.jchronic.repeaters.RepeaterUnit

Methods:
- Span getOffset(Span, int, Pointer$PointerType)
- String toString()
- int getWidth()

## Package: com.sk89q.worldedit.jchronic.tags

### Class: com.sk89q.worldedit.jchronic.tags.Grabber
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Tag

Methods:
- List scan(List, Options)
- String toString()
- Grabber scanForAll(Token, Options)

### Class: com.sk89q.worldedit.jchronic.tags.Ordinal
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Tag

Methods:
- List scan(List, Options)
- Ordinal scan(Token, Options)
- String toString()

### Class: com.sk89q.worldedit.jchronic.tags.OrdinalDay
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Ordinal

Methods:
- OrdinalDay scan(Token)
- String toString()

### Class: com.sk89q.worldedit.jchronic.tags.Pointer
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Tag

Methods:
- List scan(List, Options)
- String toString()
- Pointer scanForAll(Token, Options)

### Class: com.sk89q.worldedit.jchronic.tags.Scalar
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Tag

Methods:
- List scan(List, Options)
- Scalar scan(Token, Token, Options)
- String toString()

### Class: com.sk89q.worldedit.jchronic.tags.ScalarDay
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Scalar

Methods:
- ScalarDay scan(Token, Token, Options)
- Scalar scan(Token, Token, Options)
- String toString()

### Class: com.sk89q.worldedit.jchronic.tags.ScalarMonth
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Scalar

Methods:
- ScalarMonth scan(Token, Token, Options)
- Scalar scan(Token, Token, Options)
- String toString()

### Class: com.sk89q.worldedit.jchronic.tags.ScalarYear
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Scalar

Methods:
- ScalarYear scan(Token, Token, Options)
- Scalar scan(Token, Token, Options)
- String toString()

### Class: com.sk89q.worldedit.jchronic.tags.Separator
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Tag

Methods:
- List scan(List, Options)
- String toString()

### Class: com.sk89q.worldedit.jchronic.tags.SeparatorAt
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Separator

Methods:
- SeparatorAt scan(Token, Options)
- String toString()

### Class: com.sk89q.worldedit.jchronic.tags.SeparatorComma
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Separator

Methods:
- SeparatorComma scan(Token, Options)
- String toString()

### Class: com.sk89q.worldedit.jchronic.tags.SeparatorIn
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Separator

Methods:
- SeparatorIn scan(Token, Options)
- String toString()

### Class: com.sk89q.worldedit.jchronic.tags.SeparatorSlashOrDash
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Separator

Methods:
- SeparatorSlashOrDash scan(Token, Options)
- String toString()

### Class: com.sk89q.worldedit.jchronic.tags.StringTag
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Tag

No public methods found

### Class: com.sk89q.worldedit.jchronic.tags.Tag
Type: Class

Methods:
- Object getType()
- void setStart(Calendar)
- Calendar getNow()
- void setType(Object)

### Class: com.sk89q.worldedit.jchronic.tags.TimeZone
Type: Class
Extends: com.sk89q.worldedit.jchronic.tags.Tag

Methods:
- List scan(List, Options)
- String toString()
- TimeZone scanForAll(Token, Options)

## Package: com.sk89q.worldedit.jchronic.utils

### Class: com.sk89q.worldedit.jchronic.utils.Range
Type: Class

Methods:
- long getBegin()
- boolean contains(long)
- int hashCode()
- boolean equals(Object)
- long getWidth()
- boolean isSingularity()
- long getEnd()

### Class: com.sk89q.worldedit.jchronic.utils.Span
Type: Class
Extends: com.sk89q.worldedit.jchronic.utils.Range

Methods:
- Span add(long)
- Calendar getBeginCalendar()
- Span subtract(long)
- Calendar getEndCalendar()
- String toString()

### Class: com.sk89q.worldedit.jchronic.utils.StringUtils
Type: Class

Methods:
- Integer integerValue(String)

### Class: com.sk89q.worldedit.jchronic.utils.Tick
Type: Class

Methods:
- Tick times(int)
- int intValue()
- float floatValue()
- String toString()
- void setTime(int)
- boolean isAmbiguous()

### Class: com.sk89q.worldedit.jchronic.utils.Time
Type: Class

Methods:
- Calendar cloneAndAdd(Calendar, int, long)
- Calendar ymdh(Calendar)
- Calendar ymd(Calendar)
- Calendar ym(Calendar)
- TimeZone getTimeZone()
- void setTimeZone(TimeZone)
- Calendar ymdhm(Calendar)
- Calendar y(Calendar)
- Calendar y(Calendar, int)
- Calendar y(Calendar, int, int)
- Calendar construct(int, int)
- Calendar construct(int, int, int)
- Calendar construct(int, int, int, int)
- Calendar construct(int, int, int, int, int)
- Calendar construct(int, int, int, int, int, int)
- Calendar construct(int, int, int, int, int, int, int)
- Calendar yJan1(Calendar)

### Class: com.sk89q.worldedit.jchronic.utils.Token
Type: Class

Methods:
- boolean isTagged()
- void untag(Class)
- String getWord()
- String toString()
- List getTags()
- List getTags(Class)
- void tag(Tag)
- Tag getTag(Class)

## Package: com.sk89q.worldedit.jlibnoise

### Class: com.sk89q.worldedit.jlibnoise.MathHelper
Type: Class

Methods:
- int roundUpPow2(int)
- double lerp(double, double, double)
- float lerp(float, float, float)
- int lerp(int, int, double)
- Color lerp(Color, Color, double)
- double cos(double)
- Color blend(Color, Color)
- double inverseSqrt(double)
- double atan(double)
- Long castLong(Object)
- double getRadianDifference(double, double)
- float wrapAngle(float)
- double sqrt(double)
- Short castShort(Object)
- double wrapRadian(double)
- double sin(double)
- Double castDouble(Object)
- int floor(double)
- int floor(float)
- double clamp(double, double, double)
- int clamp(int, int, int)
- double tan(double)
- double lengthSquared(double[])
- byte max(byte, byte)
- double length(double[])
- Integer castInt(Object)
- Float castFloat(Object)
- double acos(double)
- byte wrapByte(int)
- double round(double, int)
- int mean(int[])
- double mean(double[])
- Boolean castBoolean(Object)
- float getAngleDifference(float, float)
- Byte castByte(Object)
- double asin(double)

### Class: com.sk89q.worldedit.jlibnoise.Noise
Type: Class

Methods:
- double ValueNoise3D(int, int, int, int)
- int IntValueNoise3D(int, int, int, int)
- double GradientCoherentNoise3D(double, double, double, int, NoiseQuality)
- double ValueCoherentNoise3D(double, double, double, int, NoiseQuality)
- double GradientNoise3D(double, double, double, int, int, int, int)

### Class: com.sk89q.worldedit.jlibnoise.NoiseQuality
Type: Enum
Extends: java.lang.Enum

Methods:
- NoiseQuality valueOf(String)
- NoiseQuality[] values()

### Class: com.sk89q.worldedit.jlibnoise.Utils
Type: Class

Methods:
- double GetMin(double, double)
- int GetMin(int, int)
- double[] LatLonToXYZ(double, double)
- int GetMax(int, int)
- double GetMax(double, double)
- double MakeInt32Range(double)
- double CubicInterp(double, double, double, double, double)
- double SCurve3(double)
- double SCurve5(double)
- double LinearInterp(double, double, double)
- int ClampValue(int, int, int)

## Package: com.sk89q.worldedit.jlibnoise.exception

### Class: com.sk89q.worldedit.jlibnoise.exception.NoModuleException
Type: Class
Extends: com.sk89q.worldedit.jlibnoise.exception.NoiseException

No public methods found

### Class: com.sk89q.worldedit.jlibnoise.exception.NoiseException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: com.sk89q.worldedit.jlibnoise.module

### Class: com.sk89q.worldedit.jlibnoise.module.Module
Type: Abstract Class

Methods:
- void SetSourceModule(int, Module)
- Module getSourceModule(int)
- int GetSourceModuleCount()
- double GetValue(double, double, double)

## Package: com.sk89q.worldedit.jlibnoise.module.source

### Class: com.sk89q.worldedit.jlibnoise.module.source.Perlin
Type: Class
Extends: com.sk89q.worldedit.jlibnoise.module.Module

Methods:
- void setOctaveCount(int)
- int getSeed()
- void setLacunarity(double)
- double getFrequency()
- int GetSourceModuleCount()
- void setFrequency(double)
- void setNoiseQuality(NoiseQuality)
- double getPersistence()
- NoiseQuality getNoiseQuality()
- double getLacunarity()
- void setSeed(int)
- void setPersistence(double)
- int getOctaveCount()
- double GetValue(double, double, double)

### Class: com.sk89q.worldedit.jlibnoise.module.source.RidgedMulti
Type: Class
Extends: com.sk89q.worldedit.jlibnoise.module.Module

Methods:
- void setOctaveCount(int)
- void setNoiseQuality(NoiseQuality)
- int getSeed()
- NoiseQuality getNoiseQuality()
- void setLacunarity(double)
- double getLacunarity()
- double getFrequency()
- int GetSourceModuleCount()
- void setSeed(int)
- int getOctaveCount()
- void setFrequency(double)
- double GetValue(double, double, double)

### Class: com.sk89q.worldedit.jlibnoise.module.source.Voronoi
Type: Class
Extends: com.sk89q.worldedit.jlibnoise.module.Module

Methods:
- void setDisplacement(double)
- int getSeed()
- void setEnableDistance(boolean)
- double getFrequency()
- int GetSourceModuleCount()
- void setSeed(int)
- double getDisplacement()
- void setFrequency(double)
- boolean isEnableDistance()
- double GetValue(double, double, double)

## Package: com.sk89q.worldedit.math

### Class: com.sk89q.worldedit.math.BitMath
Type: Class

Methods:
- int unpackX(long)
- int extractSigned(long, int, int)
- int unpackY(long)
- int fixSign(int, int)
- int unpackZ(long)
- int mask(int)

### Class: com.sk89q.worldedit.math.BlockVector2
Type: Class
Extends: java.lang.Record

Methods:
- BlockVector3 toBlockVector3()
- BlockVector3 toBlockVector3(int)
- double distance(BlockVector2)
- boolean containedWithin(BlockVector2, BlockVector2)
- int dot(BlockVector2)
- BlockVector2 getMaximum(BlockVector2)
- int distanceSq(BlockVector2)
- int lengthSq()
- int getBlockZ()
- int hashCode()
- int getBlockX()
- BlockVector2 normalize()
- BlockVector2 getMinimum(BlockVector2)
- BlockVector2 divide(BlockVector2)
- BlockVector2 divide(int, int)
- BlockVector2 divide(int)
- BlockVector2 floor()
- BlockVector2 multiply(BlockVector2)
- BlockVector2 multiply(int, int)
- BlockVector2 multiply(BlockVector2[])
- BlockVector2 multiply(int)
- BlockVector2 add(BlockVector2)
- BlockVector2 add(int, int)
- BlockVector2 add(BlockVector2[])
- BlockVector2 subtract(BlockVector2)
- BlockVector2 subtract(int, int)
- BlockVector2 subtract(BlockVector2[])
- double length()
- Vector3 toVector3()
- Vector3 toVector3(double)
- BlockVector2 withZ(int)
- Vector2 toVector2()
- BlockVector2 ceil()
- BlockVector2 withX(int)
- String toParserString()
- BlockVector2 transform2D(double, double, double, double, double)
- int getX()
- BlockVector2 abs()
- BlockVector2 at(double, double)
- BlockVector2 at(int, int)
- BlockVector2 round()
- int getZ()
- boolean equals(Object)
- int x()
- int z()
- String toString()
- BlockVector2 shr(int, int)
- BlockVector2 shr(int)

### Class: com.sk89q.worldedit.math.BlockVector3
Type: Class
Extends: java.lang.Record

Methods:
- BlockVector2 toBlockVector2()
- double distance(BlockVector3)
- boolean containedWithin(BlockVector3, BlockVector3)
- double dot(BlockVector3)
- BlockVector3 getMaximum(BlockVector3)
- int distanceSq(BlockVector3)
- int lengthSq()
- double toPitch()
- void checkLongPackable(BlockVector3)
- int getBlockZ()
- int getBlockY()
- int hashCode()
- int getBlockX()
- BlockVector3 normalize()
- BlockVector3 getMinimum(BlockVector3)
- BlockVector3 divide(BlockVector3)
- BlockVector3 divide(int, int, int)
- BlockVector3 divide(int)
- BlockVector3 floor()
- BlockVector3 multiply(BlockVector3)
- BlockVector3 multiply(int, int, int)
- BlockVector3 multiply(BlockVector3[])
- BlockVector3 multiply(int)
- BlockVector3 fromLongPackedForm(long)
- BlockVector3 add(BlockVector3)
- BlockVector3 add(int, int, int)
- BlockVector3 add(BlockVector3[])
- double toYaw()
- BlockVector3 subtract(BlockVector3)
- BlockVector3 subtract(int, int, int)
- BlockVector3 subtract(BlockVector3[])
- BlockVector3 cross(BlockVector3)
- double length()
- Vector3 toVector3()
- BlockVector3 withZ(int)
- BlockVector3 ceil()
- BlockVector3 withX(int)
- BlockVector3 withY(int)
- String toParserString()
- BlockVector3 transform2D(double, double, double, double, double)
- BlockVector3 clampY(int, int)
- int getX()
- BlockVector3 abs()
- int getY()
- BlockVector3 at(double, double, double)
- BlockVector3 at(int, int, int)
- BlockVector3 round()
- int getZ()
- boolean isLongPackable(BlockVector3)
- BlockVector3 shl(int, int, int)
- BlockVector3 shl(int)
- boolean equals(Object)
- int x()
- int y()
- int z()
- String toString()
- Comparator sortByCoordsYzx()
- long toLongPackedForm()
- BlockVector3 shr(int, int, int)
- BlockVector3 shr(int)

### Class: com.sk89q.worldedit.math.MathUtils
Type: Class

Methods:
- double roundHalfUp(double)
- double dSin(double)
- double dCos(double)
- int divisorMod(int, int)

### Class: com.sk89q.worldedit.math.RegionOptimizedChunkComparator
Type: Class

No public methods found

### Class: com.sk89q.worldedit.math.RegionOptimizedComparator
Type: Class

No public methods found

### Class: com.sk89q.worldedit.math.Vector2
Type: Class
Extends: java.lang.Record

Methods:
- double distance(Vector2)
- boolean containedWithin(Vector2, Vector2)
- double dot(Vector2)
- int blockX()
- Vector2 getMaximum(Vector2)
- BlockVector2 toBlockPoint(double, double)
- BlockVector2 toBlockPoint()
- double distanceSq(Vector2)
- int blockZ()
- double lengthSq()
- int hashCode()
- Vector2 normalize()
- Vector2 getMinimum(Vector2)
- Vector2 divide(Vector2)
- Vector2 divide(double, double)
- Vector2 divide(double)
- Vector2 floor()
- Vector2 multiply(Vector2)
- Vector2 multiply(double, double)
- Vector2 multiply(Vector2[])
- Vector2 multiply(double)
- Vector2 add(Vector2)
- Vector2 add(double, double)
- Vector2 add(Vector2[])
- Vector2 subtract(Vector2)
- Vector2 subtract(double, double)
- Vector2 subtract(Vector2[])
- double length()
- Vector3 toVector3()
- Vector3 toVector3(double)
- Vector2 withZ(double)
- Vector2 ceil()
- Vector2 withX(double)
- String toParserString()
- Vector2 transform2D(double, double, double, double, double)
- double getX()
- Vector2 abs()
- Vector2 at(double, double)
- Vector2 round()
- double getZ()
- boolean equals(Object)
- double x()
- double z()
- String toString()

### Class: com.sk89q.worldedit.math.Vector3
Type: Class
Extends: java.lang.Record

Methods:
- double distance(Vector3)
- boolean containedWithin(Vector3, Vector3)
- double dot(Vector3)
- int blockX()
- Vector3 getMaximum(Vector3)
- int blockY()
- BlockVector3 toBlockPoint(double, double, double)
- BlockVector3 toBlockPoint()
- double distanceSq(Vector3)
- int blockZ()
- double lengthSq()
- double toPitch()
- int hashCode()
- Vector3 normalize()
- Vector3 getMinimum(Vector3)
- Vector3 divide(Vector3)
- Vector3 divide(double, double, double)
- Vector3 divide(double)
- Vector3 floor()
- Vector3 multiply(Vector3)
- Vector3 multiply(double, double, double)
- Vector3 multiply(Vector3[])
- Vector3 multiply(double)
- Vector3 add(Vector3)
- Vector3 add(double, double, double)
- Vector3 add(Vector3[])
- double toYaw()
- Vector3 subtract(Vector3)
- Vector3 subtract(double, double, double)
- Vector3 subtract(Vector3[])
- Vector3 cross(Vector3)
- double length()
- Vector3 withZ(double)
- Vector2 toVector2()
- Vector3 ceil()
- Vector3 withX(double)
- Vector3 withY(double)
- String toParserString()
- Vector3 transform2D(double, double, double, double, double)
- Vector3 clampY(int, int)
- double getX()
- Vector3 abs()
- double getY()
- Vector3 at(double, double, double)
- Vector3 round()
- double getZ()
- boolean equals(Object)
- double x()
- double y()
- double z()
- String toString()
- Comparator sortByCoordsYzx()

## Package: com.sk89q.worldedit.math.convolution

### Class: com.sk89q.worldedit.math.convolution.GaussianKernel
Type: Class
Extends: com.sk89q.worldedit.math.convolution.Kernel

No public methods found

### Class: com.sk89q.worldedit.math.convolution.HeightMap
Type: Class

Methods:
- int apply(int[]) throws MaxChangedBlocksException
- int applyFilter(HeightMapFilter, int) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.math.convolution.HeightMapFilter
Type: Class

Methods:
- int[] filter(int[], int, int)
- int[] filter(int[], int, int, float)
- float[] filter(float[], int, int, float)
- Kernel getKernel()
- void setKernel(Kernel)

### Class: com.sk89q.worldedit.math.convolution.Kernel
Type: Class

Methods:
- int getHeight()
- int getXOrigin()
- int getWidth()
- int getYOrigin()
- float[] getKernelData(float[])

### Class: com.sk89q.worldedit.math.convolution.LinearKernel
Type: Class
Extends: com.sk89q.worldedit.math.convolution.Kernel

No public methods found

### Class: com.sk89q.worldedit.math.convolution.SnowHeightMap
Type: Class

Methods:
- int applyChanges(float[], int) throws MaxChangedBlocksException
- float[] applyFilter(HeightMapFilter, int)

## Package: com.sk89q.worldedit.math.geom

### Class: com.sk89q.worldedit.math.geom.Polygons
Type: Class

Methods:
- List polygonizeCylinder(BlockVector2, Vector2, int)

## Package: com.sk89q.worldedit.math.interpolation

### Class: com.sk89q.worldedit.math.interpolation.Interpolation
Type: Interface

Methods:
- Vector3 get1stDerivative(double)
- void setNodes(List)
- Vector3 getPosition(double)
- double arcLength(double, double)
- int getSegment(double)

### Class: com.sk89q.worldedit.math.interpolation.KochanekBartelsInterpolation
Type: Class
Implements: com.sk89q.worldedit.math.interpolation.Interpolation

Methods:
- Vector3 get1stDerivative(double)
- void setNodes(List)
- Vector3 getPosition(double)
- double arcLength(double, double)
- int getSegment(double)

### Class: com.sk89q.worldedit.math.interpolation.LinearInterpolation
Type: Class
Implements: com.sk89q.worldedit.math.interpolation.Interpolation

Methods:
- Vector3 get1stDerivative(double)
- void setNodes(List)
- Vector3 getPosition(double)
- double arcLength(double, double)
- int getSegment(double)

### Class: com.sk89q.worldedit.math.interpolation.Node
Type: Class

Methods:
- double getTension()
- double getBias()
- void setBias(double)
- Vector3 getPosition()
- void setTension(double)
- void setPosition(Vector3)
- void setContinuity(double)
- double getContinuity()

### Class: com.sk89q.worldedit.math.interpolation.ReparametrisingInterpolation
Type: Class
Implements: com.sk89q.worldedit.math.interpolation.Interpolation

Methods:
- Vector3 get1stDerivative(double)
- void setNodes(List)
- Vector3 getPosition(double)
- double arcLength(double, double)
- Interpolation getBaseInterpolation()
- int getSegment(double)

## Package: com.sk89q.worldedit.math.noise

### Class: com.sk89q.worldedit.math.noise.NoiseGenerator
Type: Interface

Methods:
- float noise(Vector2)
- float noise(Vector3)

### Class: com.sk89q.worldedit.math.noise.PerlinNoise
Type: Class
Extends: com.sk89q.worldedit.math.noise.JLibNoiseGenerator

Methods:
- void setOctaveCount(int)
- int getSeed()
- double getPersistence()
- void setLacunarity(double)
- double getLacunarity()
- double getFrequency()
- float noise(Vector3)
- float noise(Vector2)
- void setSeed(int)
- void setPersistence(double)
- int getOctaveCount()
- void setFrequency(double)

### Class: com.sk89q.worldedit.math.noise.RandomNoise
Type: Class
Implements: com.sk89q.worldedit.math.noise.NoiseGenerator

Methods:
- float noise(Vector2)
- float noise(Vector3)

### Class: com.sk89q.worldedit.math.noise.RidgedMultiFractalNoise
Type: Class
Extends: com.sk89q.worldedit.math.noise.JLibNoiseGenerator

Methods:
- void setOctaveCount(int)
- int getSeed()
- void setLacunarity(double)
- double getLacunarity()
- double getFrequency()
- float noise(Vector3)
- float noise(Vector2)
- void setSeed(int)
- int getOctaveCount()
- void setFrequency(double)

### Class: com.sk89q.worldedit.math.noise.VoronoiNoise
Type: Class
Extends: com.sk89q.worldedit.math.noise.JLibNoiseGenerator

Methods:
- int getSeed()
- double getFrequency()
- float noise(Vector3)
- float noise(Vector2)
- void setSeed(int)
- void setFrequency(double)

## Package: com.sk89q.worldedit.math.transform

### Class: com.sk89q.worldedit.math.transform.Transform
Type: Interface

Methods:
- Transform inverse()
- Vector3 apply(Vector3)
- boolean isIdentity()
- Transform combine(Transform)

### Class: com.sk89q.worldedit.math.transform.AffineTransform
Type: Class
Extends: java.lang.Record
Implements: com.sk89q.worldedit.math.transform.Transform

Methods:
- AffineTransform concatenate(double, double, double, double, double, double, double, double, double, double, double, double)
- AffineTransform concatenate(AffineTransform)
- AffineTransform preConcatenate(AffineTransform)
- AffineTransform scale(double)
- AffineTransform scale(double, double, double)
- AffineTransform scale(Vector3)
- double m11()
- double m10()
- double m13()
- AffineTransform translate(Vector3)
- AffineTransform translate(BlockVector3)
- AffineTransform translate(double, double, double)
- double m12()
- int hashCode()
- AffineTransform rotateX(double)
- AffineTransform rotateY(double)
- AffineTransform combine(AffineTransform)
- Transform combine(Transform)
- AffineTransform rotateZ(double)
- AffineTransform inverse()
- Transform inverse()
- Vector3 apply(Vector3)
- boolean isIdentity()
- double m20()
- double m22()
- double m00()
- boolean isHorizontalFlip()
- double m21()
- double m02()
- double m23()
- double m01()
- double m03()
- boolean equals(Object)
- double[] coefficients()
- String toString()
- boolean isVerticalFlip()

### Class: com.sk89q.worldedit.math.transform.CombinedTransform
Type: Class
Implements: com.sk89q.worldedit.math.transform.Transform

Methods:
- Transform inverse()
- Vector3 apply(Vector3)
- boolean isIdentity()
- Transform combine(Transform)

### Class: com.sk89q.worldedit.math.transform.Identity
Type: Class
Implements: com.sk89q.worldedit.math.transform.Transform

Methods:
- Transform inverse()
- Vector3 apply(Vector3)
- boolean isIdentity()
- Transform combine(Transform)

### Class: com.sk89q.worldedit.math.transform.Transforms
Type: Class

Methods:
- Location transform(Location, Transform)

## Package: com.sk89q.worldedit.regions

### Class: com.sk89q.worldedit.regions.FlatRegion
Type: Interface
Implements: com.sk89q.worldedit.regions.Region

Methods:
- int getMaximumY()
- int getMinimumY()
- Iterable asFlatRegion()

### Class: com.sk89q.worldedit.regions.Region
Type: Interface
Implements: java.lang.Iterable, java.lang.Cloneable

Methods:
- BlockVector3 getMinimumPoint()
- World getWorld()
- Vector3 getCenter()
- void shift(BlockVector3) throws RegionOperationException
- void contract(BlockVector3[]) throws RegionOperationException
- List polygonize(int)
- Set getChunks()
- int getWidth()
- CuboidRegion getBoundingBox()
- Set getChunkCubes()
- boolean contains(BlockVector3)
- void expand(BlockVector3[]) throws RegionOperationException
- int getHeight()
- long getVolume()
- BlockVector3 getMaximumPoint()
- Region clone()
- int getLength()
- void setWorld(World)
- int getArea()

### Class: com.sk89q.worldedit.regions.RegionSelector
Type: Interface

Methods:
- void learnChanges()
- World getWorld()
- boolean selectSecondary(BlockVector3, SelectorLimits)
- void clear()
- Region getIncompleteRegion()
- void explainPrimarySelection(Actor, LocalSession, BlockVector3)
- void explainRegionAdjust(Actor, LocalSession)
- List getInformationLines()
- long getVolume()
- BlockVector3 getPrimaryPosition() throws IncompleteRegionException
- Region getRegion() throws IncompleteRegionException
- boolean isDefined()
- boolean selectPrimary(BlockVector3, SelectorLimits)
- List getSelectionInfoLines()
- String getTypeName()
- void explainSecondarySelection(Actor, LocalSession, BlockVector3)
- void setWorld(World)
- int getArea()

### Class: com.sk89q.worldedit.regions.AbstractFlatRegion
Type: Abstract Class
Extends: com.sk89q.worldedit.regions.AbstractRegion
Implements: com.sk89q.worldedit.regions.FlatRegion

Methods:
- int getMaximumY()
- int getMinimumY()

### Class: com.sk89q.worldedit.regions.AbstractRegion
Type: Abstract Class
Implements: com.sk89q.worldedit.regions.Region

Methods:
- World getWorld()
- Vector3 getCenter()
- void shift(BlockVector3) throws RegionOperationException
- Set getChunks()
- int getWidth()
- List polygonize(int)
- Set getChunkCubes()
- int getHeight()
- long getVolume()
- Iterator iterator()
- AbstractRegion clone()
- Object clone() throws CloneNotSupportedException
- Region clone()
- int getLength()
- void setWorld(World)

### Class: com.sk89q.worldedit.regions.ConvexPolyhedralRegion
Type: Class
Extends: com.sk89q.worldedit.regions.AbstractRegion

Methods:
- BlockVector3 getMinimumPoint()
- Vector3 getCenter()
- void shift(BlockVector3) throws RegionOperationException
- void contract(BlockVector3[]) throws RegionOperationException
- void clear()
- boolean contains(BlockVector3)
- void expand(BlockVector3[]) throws RegionOperationException
- BlockVector3 getMaximumPoint()
- boolean isDefined()
- AbstractRegion clone()
- Region clone()
- Object clone() throws CloneNotSupportedException
- Collection getVertices()
- Collection getTriangles()
- boolean addVertex(BlockVector3)

### Class: com.sk89q.worldedit.regions.CuboidRegion
Type: Class
Extends: com.sk89q.worldedit.regions.AbstractRegion
Implements: com.sk89q.worldedit.regions.FlatRegion

Methods:
- BlockVector3 getMinimumPoint()
- CuboidRegion fromCenter(BlockVector3, int)
- void shift(BlockVector3) throws RegionOperationException
- void contract(BlockVector3[])
- Region getFaces()
- Set getChunks()
- Region getWalls()
- CuboidRegion getBoundingBox()
- Iterable asFlatRegion()
- void setPos2(BlockVector3)
- Set getChunkCubes()
- BlockVector3 getPos2()
- void setPos1(BlockVector3)
- CuboidRegion makeCuboid(Region)
- Iterator iterator()
- boolean contains(BlockVector3)
- void expand(BlockVector3[])
- BlockVector3 getMaximumPoint()
- BlockVector3 getPos1()
- CuboidRegion clone()
- AbstractRegion clone()
- Region clone()
- Object clone() throws CloneNotSupportedException
- int getMaximumY()
- int getMinimumY()
- String toString()

### Class: com.sk89q.worldedit.regions.CylinderRegion
Type: Class
Extends: com.sk89q.worldedit.regions.AbstractRegion
Implements: com.sk89q.worldedit.regions.FlatRegion

Methods:
- boolean setY(int)
- Vector3 getCenter()
- void shift(BlockVector3) throws RegionOperationException
- int getWidth()
- Iterable asFlatRegion()
- void setRadius(Vector2)
- Iterator iterator()
- int getHeight()
- long getVolume()
- void setMaximumY(int)
- int getMaximumY()
- int getMinimumY()
- void setMinimumY(int)
- BlockVector3 getMinimumPoint()
- void contract(BlockVector3[]) throws RegionOperationException
- void setCenter(BlockVector2)
- List polygonize(int)
- CylinderRegion createRadius(Extent, BlockVector3, double)
- Vector2 getRadius()
- boolean contains(BlockVector3)
- void expand(BlockVector3[]) throws RegionOperationException
- BlockVector3 getMaximumPoint()
- CylinderRegion clone()
- AbstractRegion clone()
- Region clone()
- Object clone() throws CloneNotSupportedException
- void extendRadius(Vector2)
- int getLength()
- String toString()

### Class: com.sk89q.worldedit.regions.EllipsoidRegion
Type: Class
Extends: com.sk89q.worldedit.regions.AbstractRegion

Methods:
- BlockVector3 getMinimumPoint()
- Vector3 getCenter()
- void shift(BlockVector3) throws RegionOperationException
- void contract(BlockVector3[]) throws RegionOperationException
- void setCenter(BlockVector3)
- Set getChunks()
- int getWidth()
- Vector3 getRadius()
- void setRadius(Vector3)
- boolean contains(BlockVector3)
- void expand(BlockVector3[]) throws RegionOperationException
- int getHeight()
- long getVolume()
- BlockVector3 getMaximumPoint()
- EllipsoidRegion clone()
- AbstractRegion clone()
- Region clone()
- Object clone() throws CloneNotSupportedException
- void extendRadius(Vector3)
- int getLength()
- String toString()

### Class: com.sk89q.worldedit.regions.NullRegion
Type: Class
Implements: com.sk89q.worldedit.regions.Region

Methods:
- BlockVector3 getMinimumPoint()
- World getWorld()
- Vector3 getCenter()
- void shift(BlockVector3) throws RegionOperationException
- void contract(BlockVector3[]) throws RegionOperationException
- List polygonize(int)
- Set getChunks()
- int getWidth()
- Set getChunkCubes()
- Iterator iterator()
- boolean contains(BlockVector3)
- void expand(BlockVector3[]) throws RegionOperationException
- int getHeight()
- long getVolume()
- BlockVector3 getMaximumPoint()
- NullRegion clone()
- Object clone() throws CloneNotSupportedException
- Region clone()
- int getLength()
- void setWorld(World)

### Class: com.sk89q.worldedit.regions.Polygonal2DRegion
Type: Class
Extends: com.sk89q.worldedit.regions.AbstractRegion
Implements: com.sk89q.worldedit.regions.FlatRegion

Methods:
- BlockVector3 getMinimumPoint()
- void shift(BlockVector3) throws RegionOperationException
- void contract(BlockVector3[]) throws RegionOperationException
- List polygonize(int)
- int getWidth()
- boolean expandY(int)
- Iterable asFlatRegion()
- void addPoint(BlockVector2)
- void addPoint(BlockVector3)
- Iterator iterator()
- boolean contains(BlockVector3)
- boolean contains(List, int, int, BlockVector3)
- void expand(BlockVector3[]) throws RegionOperationException
- int getHeight()
- long getVolume()
- int size()
- void setMaximumY(int)
- BlockVector3 getMaximumPoint()
- Polygonal2DRegion clone()
- AbstractRegion clone()
- Region clone()
- Object clone() throws CloneNotSupportedException
- int getMaximumY()
- int getLength()
- int getMinimumY()
- String toString()
- List getPoints()
- void setMinimumY(int)

### Class: com.sk89q.worldedit.regions.RegionIntersection
Type: Class
Extends: com.sk89q.worldedit.regions.AbstractRegion

Methods:
- BlockVector3 getMinimumPoint()
- Iterator iterator()
- boolean contains(BlockVector3)
- void expand(BlockVector3[]) throws RegionOperationException
- void contract(BlockVector3[]) throws RegionOperationException
- BlockVector3 getMaximumPoint()

### Class: com.sk89q.worldedit.regions.RegionOperationException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

### Class: com.sk89q.worldedit.regions.Regions
Type: Class

Methods:
- double maximumY(Region)
- double minimumY(Region)
- int maximumBlockY(Region)
- FlatRegion asFlatRegion(Region)
- int minimumBlockY(Region)

### Class: com.sk89q.worldedit.regions.TransformRegion
Type: Class
Extends: com.sk89q.worldedit.regions.AbstractRegion

Methods:
- BlockVector3 getMinimumPoint()
- Vector3 getCenter()
- void shift(BlockVector3) throws RegionOperationException
- void contract(BlockVector3[]) throws RegionOperationException
- List polygonize(int)
- int getWidth()
- Iterator iterator()
- boolean contains(BlockVector3)
- void expand(BlockVector3[]) throws RegionOperationException
- int getHeight()
- long getVolume()
- void setTransform(Transform)
- Region getRegion()
- BlockVector3 getMaximumPoint()
- int getLength()
- Transform getTransform()

## Package: com.sk89q.worldedit.regions.factory

### Class: com.sk89q.worldedit.regions.factory.RegionFactory
Type: Interface

Methods:
- Region createCenteredAt(BlockVector3, double)

### Class: com.sk89q.worldedit.regions.factory.CuboidRegionFactory
Type: Class
Implements: com.sk89q.worldedit.regions.factory.RegionFactory

Methods:
- Region createCenteredAt(BlockVector3, double)

### Class: com.sk89q.worldedit.regions.factory.CylinderRegionFactory
Type: Class
Implements: com.sk89q.worldedit.regions.factory.RegionFactory

Methods:
- Region createCenteredAt(BlockVector3, double)

### Class: com.sk89q.worldedit.regions.factory.FixedHeightCuboidRegionFactory
Type: Class
Implements: com.sk89q.worldedit.regions.factory.RegionFactory

Methods:
- Region createCenteredAt(BlockVector3, double)

### Class: com.sk89q.worldedit.regions.factory.FixedHeightCylinderRegionFactory
Type: Class
Implements: com.sk89q.worldedit.regions.factory.RegionFactory

Methods:
- Region createCenteredAt(BlockVector3, double)

### Class: com.sk89q.worldedit.regions.factory.SphereRegionFactory
Type: Class
Implements: com.sk89q.worldedit.regions.factory.RegionFactory

Methods:
- Region createCenteredAt(BlockVector3, double)

## Package: com.sk89q.worldedit.regions.iterator

### Class: com.sk89q.worldedit.regions.iterator.FlatRegion3DIterator
Type: Class
Implements: java.util.Iterator

Methods:
- BlockVector3 next()
- Object next()
- boolean hasNext()
- void remove()

### Class: com.sk89q.worldedit.regions.iterator.FlatRegionIterator
Type: Class
Implements: java.util.Iterator

Methods:
- BlockVector2 next()
- Object next()
- boolean hasNext()

### Class: com.sk89q.worldedit.regions.iterator.RegionIterator
Type: Class
Implements: java.util.Iterator

Methods:
- BlockVector3 next()
- Object next()
- boolean hasNext()
- void remove()

## Package: com.sk89q.worldedit.regions.polyhedron

### Class: com.sk89q.worldedit.regions.polyhedron.Edge
Type: Class

Methods:
- int hashCode()
- Triangle createTriangle(Vector3)
- boolean equals(Object)
- Triangle createTriangle2(Vector3)
- String toString()

### Class: com.sk89q.worldedit.regions.polyhedron.Triangle
Type: Class

Methods:
- boolean below(Vector3)
- boolean above(Vector3)
- String toString()
- Triangle tag(String)
- Edge getEdge(int)
- Vector3 getVertex(int)

## Package: com.sk89q.worldedit.regions.selector

### Class: com.sk89q.worldedit.regions.selector.ConvexPolyhedralRegionSelector
Type: Class
Implements: com.sk89q.worldedit.regions.RegionSelector, com.sk89q.worldedit.internal.cui.CUIRegion

Methods:
- String getLegacyTypeID()
- void learnChanges()
- World getWorld()
- void describeCUI(LocalSession, Actor)
- boolean selectSecondary(BlockVector3, SelectorLimits)
- void explainPrimarySelection(Actor, LocalSession, BlockVector3)
- void clear()
- Region getIncompleteRegion()
- String getTypeID()
- void describeLegacyCUI(LocalSession, Actor)
- void explainRegionAdjust(Actor, LocalSession)
- int getProtocolVersion()
- long getVolume()
- BlockVector3 getPrimaryPosition() throws IncompleteRegionException
- Region getRegion() throws IncompleteRegionException
- boolean isDefined()
- boolean selectPrimary(BlockVector3, SelectorLimits)
- void explainSecondarySelection(Actor, LocalSession, BlockVector3)
- List getSelectionInfoLines()
- String getTypeName()
- void setWorld(World)

### Class: com.sk89q.worldedit.regions.selector.CuboidRegionSelector
Type: Class
Implements: com.sk89q.worldedit.regions.RegionSelector, com.sk89q.worldedit.internal.cui.CUIRegion

Methods:
- String getLegacyTypeID()
- void learnChanges()
- World getWorld()
- void describeCUI(LocalSession, Actor)
- boolean selectSecondary(BlockVector3, SelectorLimits)
- void clear()
- CuboidRegion getIncompleteRegion()
- Region getIncompleteRegion()
- void explainPrimarySelection(Actor, LocalSession, BlockVector3)
- String getTypeID()
- void describeLegacyCUI(LocalSession, Actor)
- void explainRegionAdjust(Actor, LocalSession)
- int getProtocolVersion()
- long getVolume()
- BlockVector3 getPrimaryPosition() throws IncompleteRegionException
- CuboidRegion getRegion() throws IncompleteRegionException
- Region getRegion() throws IncompleteRegionException
- boolean isDefined()
- boolean selectPrimary(BlockVector3, SelectorLimits)
- List getSelectionInfoLines()
- String getTypeName()
- void explainSecondarySelection(Actor, LocalSession, BlockVector3)
- void setWorld(World)

### Class: com.sk89q.worldedit.regions.selector.CylinderRegionSelector
Type: Class
Implements: com.sk89q.worldedit.regions.RegionSelector, com.sk89q.worldedit.internal.cui.CUIRegion

Methods:
- String getLegacyTypeID()
- void learnChanges()
- World getWorld()
- void describeCUI(LocalSession, Actor)
- boolean selectSecondary(BlockVector3, SelectorLimits)
- void clear()
- CylinderRegion getIncompleteRegion()
- Region getIncompleteRegion()
- void explainPrimarySelection(Actor, LocalSession, BlockVector3)
- String getTypeID()
- void describeLegacyCUI(LocalSession, Actor)
- void explainRegionAdjust(Actor, LocalSession)
- int getProtocolVersion()
- long getVolume()
- BlockVector3 getPrimaryPosition() throws IncompleteRegionException
- CylinderRegion getRegion() throws IncompleteRegionException
- Region getRegion() throws IncompleteRegionException
- boolean isDefined()
- boolean selectPrimary(BlockVector3, SelectorLimits)
- List getSelectionInfoLines()
- String getTypeName()
- void explainSecondarySelection(Actor, LocalSession, BlockVector3)
- void setWorld(World)

### Class: com.sk89q.worldedit.regions.selector.EllipsoidRegionSelector
Type: Class
Implements: com.sk89q.worldedit.regions.RegionSelector, com.sk89q.worldedit.internal.cui.CUIRegion

Methods:
- String getLegacyTypeID()
- void learnChanges()
- World getWorld()
- void describeCUI(LocalSession, Actor)
- boolean selectSecondary(BlockVector3, SelectorLimits)
- void clear()
- EllipsoidRegion getIncompleteRegion()
- Region getIncompleteRegion()
- void explainPrimarySelection(Actor, LocalSession, BlockVector3)
- String getTypeID()
- void describeLegacyCUI(LocalSession, Actor)
- void explainRegionAdjust(Actor, LocalSession)
- int getProtocolVersion()
- long getVolume()
- BlockVector3 getPrimaryPosition() throws IncompleteRegionException
- EllipsoidRegion getRegion() throws IncompleteRegionException
- Region getRegion() throws IncompleteRegionException
- boolean isDefined()
- boolean selectPrimary(BlockVector3, SelectorLimits)
- List getSelectionInfoLines()
- String getTypeName()
- void explainSecondarySelection(Actor, LocalSession, BlockVector3)
- void setWorld(World)

### Class: com.sk89q.worldedit.regions.selector.ExtendingCuboidRegionSelector
Type: Class
Extends: com.sk89q.worldedit.regions.selector.CuboidRegionSelector

Methods:
- boolean selectSecondary(BlockVector3, SelectorLimits)
- void explainPrimarySelection(Actor, LocalSession, BlockVector3)
- boolean selectPrimary(BlockVector3, SelectorLimits)
- void explainSecondarySelection(Actor, LocalSession, BlockVector3)

### Class: com.sk89q.worldedit.regions.selector.Polygonal2DRegionSelector
Type: Class
Implements: com.sk89q.worldedit.regions.RegionSelector, com.sk89q.worldedit.internal.cui.CUIRegion

Methods:
- String getLegacyTypeID()
- void learnChanges()
- World getWorld()
- void describeCUI(LocalSession, Actor)
- boolean selectSecondary(BlockVector3, SelectorLimits)
- void clear()
- Polygonal2DRegion getIncompleteRegion()
- Region getIncompleteRegion()
- void explainPrimarySelection(Actor, LocalSession, BlockVector3)
- String getTypeID()
- void describeLegacyCUI(LocalSession, Actor)
- void explainRegionAdjust(Actor, LocalSession)
- int getProtocolVersion()
- long getVolume()
- BlockVector3 getPrimaryPosition() throws IncompleteRegionException
- Polygonal2DRegion getRegion() throws IncompleteRegionException
- Region getRegion() throws IncompleteRegionException
- boolean isDefined()
- int getPointCount()
- boolean selectPrimary(BlockVector3, SelectorLimits)
- List getSelectionInfoLines()
- String getTypeName()
- void explainSecondarySelection(Actor, LocalSession, BlockVector3)
- void setWorld(World)

### Class: com.sk89q.worldedit.regions.selector.RegionSelectorType
Type: Enum
Extends: java.lang.Enum

Methods:
- Class getSelectorClass()
- RegionSelectorType valueOf(String)
- RegionSelectorType[] values()
- RegionSelector createSelector()

### Class: com.sk89q.worldedit.regions.selector.SphereRegionSelector
Type: Class
Extends: com.sk89q.worldedit.regions.selector.EllipsoidRegionSelector

Methods:
- boolean selectSecondary(BlockVector3, SelectorLimits)
- String getTypeName()
- void explainSecondarySelection(Actor, LocalSession, BlockVector3)

## Package: com.sk89q.worldedit.regions.selector.limit

### Class: com.sk89q.worldedit.regions.selector.limit.SelectorLimits
Type: Interface

Methods:
- Optional getPolygonVertexLimit()
- Optional getPolyhedronVertexLimit()

### Class: com.sk89q.worldedit.regions.selector.limit.PermissiveSelectorLimits
Type: Class
Implements: com.sk89q.worldedit.regions.selector.limit.SelectorLimits

Methods:
- Optional getPolygonVertexLimit()
- Optional getPolyhedronVertexLimit()
- PermissiveSelectorLimits getInstance()

## Package: com.sk89q.worldedit.regions.shape

### Class: com.sk89q.worldedit.regions.shape.ArbitraryBiomeShape
Type: Abstract Class

Methods:
- int generate(EditSession, BiomeType, boolean)

### Class: com.sk89q.worldedit.regions.shape.ArbitraryShape
Type: Abstract Class

Methods:
- int generate(EditSession, Pattern, boolean) throws MaxChangedBlocksException

### Class: com.sk89q.worldedit.regions.shape.RegionShape
Type: Class
Extends: com.sk89q.worldedit.regions.shape.ArbitraryShape

No public methods found

### Class: com.sk89q.worldedit.regions.shape.WorldEditExpressionEnvironment
Type: Class
Implements: com.sk89q.worldedit.internal.expression.ExpressionEnvironment

Methods:
- int getBlockDataRel(double, double, double)
- int getBlockTypeRel(double, double, double)
- Vector3 toWorldRel(double, double, double)
- int getBlockData(double, double, double)
- int getBlockDataAbs(double, double, double)
- int getBlockTypeAbs(double, double, double)
- void setCurrentBlock(Vector3)
- BlockVector3 toWorld(double, double, double)
- int getBlockType(double, double, double)

## Package: com.sk89q.worldedit.registry

### Class: com.sk89q.worldedit.registry.Keyed
Type: Interface

Methods:
- String getId()
- String id()

### Class: com.sk89q.worldedit.registry.Category
Type: Abstract Class
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- boolean contains(Keyed)
- Set getAll()
- void invalidateCache()
- String toString()
- String id()

### Class: com.sk89q.worldedit.registry.NamespacedRegistry
Type: Class
Extends: com.sk89q.worldedit.registry.Registry

Methods:
- String getDefaultNamespace()
- Set getKnownNamespaces()
- Keyed get(String)
- Keyed register(String, Keyed)

### Class: com.sk89q.worldedit.registry.Registry
Type: Class
Implements: java.lang.Iterable

Methods:
- Iterator iterator()
- String getName()
- Collection values()
- Keyed get(String)
- void clear()
- Set keySet()
- Keyed register(String, Keyed)

## Package: com.sk89q.worldedit.registry.state

### Class: com.sk89q.worldedit.registry.state.Property
Type: Interface

Methods:
- Object getValueFor(String) throws IllegalArgumentException
- String getName()
- List getValues()

### Class: com.sk89q.worldedit.registry.state.AbstractProperty
Type: Abstract Class
Implements: com.sk89q.worldedit.registry.state.Property

Methods:
- String getName()
- List getValues()
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: com.sk89q.worldedit.registry.state.BooleanProperty
Type: Class
Extends: com.sk89q.worldedit.registry.state.AbstractProperty

Methods:
- Boolean getValueFor(String)
- Object getValueFor(String) throws IllegalArgumentException

### Class: com.sk89q.worldedit.registry.state.DirectionalProperty
Type: Class
Extends: com.sk89q.worldedit.registry.state.AbstractProperty

Methods:
- Direction getValueFor(String)
- Object getValueFor(String) throws IllegalArgumentException

### Class: com.sk89q.worldedit.registry.state.EnumProperty
Type: Class
Extends: com.sk89q.worldedit.registry.state.AbstractProperty

Methods:
- String getValueFor(String)
- Object getValueFor(String) throws IllegalArgumentException

### Class: com.sk89q.worldedit.registry.state.IntegerProperty
Type: Class
Extends: com.sk89q.worldedit.registry.state.AbstractProperty

Methods:
- Integer getValueFor(String)
- Object getValueFor(String) throws IllegalArgumentException

## Package: com.sk89q.worldedit.scripting

### Class: com.sk89q.worldedit.scripting.CraftScriptEngine
Type: Interface

Methods:
- void setTimeLimit(int)
- int getTimeLimit()
- Object evaluate(String, String, Map) throws ScriptException, Throwable

### Class: com.sk89q.worldedit.scripting.CraftScriptContext
Type: Class
Extends: com.sk89q.worldedit.scripting.CraftScriptEnvironment

Methods:
- void printRaw(String)
- BaseBlock getBlock(String, boolean) throws WorldEditException
- BaseBlock getBlock(String) throws WorldEditException
- Player getPlayer()
- File getSafeOpenFile(String, String, String, String[]) throws FilenameException
- List getEditSessions()
- File getSafeSaveFile(String, String, String, String[]) throws FilenameException
- Set getBlocks(String, boolean) throws WorldEditException
- void error(String)
- EditSession remember()
- void exit()
- void print(String)
- LocalConfiguration getConfiguration()
- Pattern getBlockPattern(String) throws WorldEditException
- void checkArgs(int, int, String) throws InsufficientArgumentsException
- LocalSession getSession()

### Class: com.sk89q.worldedit.scripting.CraftScriptEnvironment
Type: Abstract Class

No public methods found

### Class: com.sk89q.worldedit.scripting.RhinoContextFactory
Type: Class
Extends: org.mozilla.javascript.ContextFactory

No public methods found

### Class: com.sk89q.worldedit.scripting.RhinoCraftScriptEngine
Type: Class
Implements: com.sk89q.worldedit.scripting.CraftScriptEngine

Methods:
- void setTimeLimit(int)
- int getTimeLimit()
- Object evaluate(String, String, Map) throws Throwable

## Package: com.sk89q.worldedit.session

### Class: com.sk89q.worldedit.session.SessionKey
Type: Interface
Implements: com.sk89q.worldedit.util.Identifiable

Methods:
- String getName()
- boolean isPersistent()
- boolean isActive()

### Class: com.sk89q.worldedit.session.SessionOwner
Type: Interface
Implements: com.sk89q.worldedit.util.auth.Subject

Methods:
- SessionKey getSessionKey()

### Class: com.sk89q.worldedit.session.ClipboardHolder
Type: Class

Methods:
- void setTransform(Transform)
- Clipboard getClipboard()
- Transform getTransform()
- PasteBuilder createPaste(Extent)

### Class: com.sk89q.worldedit.session.MissingSessionException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.sk89q.worldedit.session.PasteBuilder
Type: Class

Methods:
- PasteBuilder copyEntities(boolean)
- Operation build()
- PasteBuilder ignoreAirBlocks(boolean)
- PasteBuilder to(BlockVector3)
- PasteBuilder copyBiomes(boolean)
- PasteBuilder maskSource(Mask)
- PasteBuilder ignoreStructureVoidBlocks(boolean)

### Class: com.sk89q.worldedit.session.Placement
Type: Class
Extends: java.lang.Record

Methods:
- BlockVector3 offset()
- Component getInfo()
- int hashCode()
- PlacementType placementType()
- boolean equals(Object)
- boolean canBeUsedBy(Actor)
- String toString()
- BlockVector3 getPlacementPosition(RegionSelector, Actor) throws IncompleteRegionException

### Class: com.sk89q.worldedit.session.PlacementType
Type: Enum
Extends: java.lang.Enum

Methods:
- String getTranslationKeyWithOffset()
- String getTranslationKey()
- PlacementType valueOf(String)
- PlacementType[] values()
- boolean canBeUsedBy(Actor)
- BlockVector3 getPlacementPosition(RegionSelector, Actor) throws IncompleteRegionException

### Class: com.sk89q.worldedit.session.SessionManager
Type: Class

Methods:
- void onConfigurationLoad(ConfigurationLoadEvent)
- boolean contains(SessionOwner)
- LocalSession get(SessionOwner)
- void clear()
- void unload()
- void onSessionIdle(SessionIdleEvent)
- LocalSession findByName(String)
- void remove(SessionOwner)
- LocalSession getIfPresent(SessionOwner)

### Class: com.sk89q.worldedit.session.TransientSessionException
Type: Class
Extends: java.lang.Exception

No public methods found

## Package: com.sk89q.worldedit.session.request

### Class: com.sk89q.worldedit.session.request.Request
Type: Class

Methods:
- Request request()
- World getWorld()
- void setEditSession(EditSession)
- EditSession getEditSession()
- boolean isValid()
- void reset()
- void setSession(LocalSession)
- void setWorld(World)
- LocalSession getSession()

### Class: com.sk89q.worldedit.session.request.RequestExtent
Type: Class
Implements: com.sk89q.worldedit.extent.Extent

Methods:
- BlockVector3 getMinimumPoint()
- BlockState getBlock(BlockVector3)
- BaseBlock getFullBlock(BlockVector3)
- BlockVector3 getMaximumPoint()
- Operation commit()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- List getEntities(Region)
- List getEntities()
- boolean setBiome(BlockVector3, BiomeType)
- boolean fullySupports3DBiomes()
- Entity createEntity(Location, BaseEntity)
- BiomeType getBiome(BlockVector3)

### Class: com.sk89q.worldedit.session.request.RequestSelection
Type: Class
Implements: com.sk89q.worldedit.regions.Region

Methods:
- BlockVector3 getMinimumPoint()
- World getWorld()
- Vector3 getCenter()
- void shift(BlockVector3) throws RegionOperationException
- void contract(BlockVector3[]) throws RegionOperationException
- List polygonize(int)
- Set getChunks()
- int getWidth()
- Set getChunkCubes()
- Iterator iterator()
- boolean contains(BlockVector3)
- void expand(BlockVector3[]) throws RegionOperationException
- int getHeight()
- long getVolume()
- BlockVector3 getMaximumPoint()
- Region clone()
- Object clone() throws CloneNotSupportedException
- int getLength()
- void setWorld(World)

## Package: com.sk89q.worldedit.session.storage

### Class: com.sk89q.worldedit.session.storage.SessionStore
Type: Interface

Methods:
- LocalSession load(UUID) throws IOException
- void save(UUID, LocalSession) throws IOException

### Class: com.sk89q.worldedit.session.storage.JsonFileSessionStore
Type: Class
Implements: com.sk89q.worldedit.session.storage.SessionStore

Methods:
- LocalSession load(UUID) throws IOException
- void save(UUID, LocalSession) throws IOException

### Class: com.sk89q.worldedit.session.storage.VoidStore
Type: Class
Implements: com.sk89q.worldedit.session.storage.SessionStore

Methods:
- LocalSession load(UUID) throws IOException
- void save(UUID, LocalSession) throws IOException

## Package: com.sk89q.worldedit.util

### Class: com.sk89q.worldedit.util.Faceted
Type: Interface

Methods:
- Object getFacet(Class)

### Class: com.sk89q.worldedit.util.Identifiable
Type: Interface

Methods:
- UUID getUniqueId()

### Class: com.sk89q.worldedit.util.Countable
Type: Class
Implements: java.lang.Comparable

Methods:
- void decrement()
- void increment()
- void setID(Object)
- Object getID()
- int compareTo(Countable)
- int compareTo(Object)
- void setAmount(int)
- int getAmount()

### Class: com.sk89q.worldedit.util.Direction
Type: Enum
Extends: java.lang.Enum

Methods:
- OptionalInt toRotationIndex()
- BlockVector3 toBlockVector()
- Vector3 toVector()
- boolean isSecondaryOrdinal()
- Direction valueOf(String)
- boolean isUpright()
- boolean isOrdinal()
- Direction[] values()
- boolean isCardinal()
- Direction findClosest(Vector3, int)
- List valuesOf(int)
- Optional fromRotationIndex(int)

### Class: com.sk89q.worldedit.util.Enums
Type: Class

Methods:
- Enum findByValue(Class, String[])

### Class: com.sk89q.worldedit.util.FileDialogUtil
Type: Class

Methods:
- File showOpenDialog(String[])
- File showSaveDialog(String[])

### Class: com.sk89q.worldedit.util.GuavaUtil
Type: Class

Methods:
- Object firstNonNull(Object, Object)

### Class: com.sk89q.worldedit.util.HandSide
Type: Enum
Extends: java.lang.Enum

Methods:
- HandSide valueOf(String)
- HandSide[] values()

### Class: com.sk89q.worldedit.util.LocatedBlock
Type: Class
Extends: java.lang.Record

Methods:
- BaseBlock getBlock()
- BlockVector3 getLocation()
- int hashCode()
- boolean equals(Object)
- BaseBlock block()
- BlockVector3 location()
- String toString()

### Class: com.sk89q.worldedit.util.Location
Type: Class

Methods:
- Extent getExtent()
- Location setY(double)
- Location setX(double)
- Vector3 toVector()
- Vector3 getDirection()
- Direction getDirectionEnum()
- Location setZ(double)
- Location setPosition(Vector3)
- Location setYaw(float)
- float getYaw()
- double getX()
- double getY()
- float getPitch()
- int getBlockZ()
- double getZ()
- int getBlockY()
- int hashCode()
- int getBlockX()
- boolean equals(Object)
- Location setPitch(float)
- Location setExtent(Extent)
- Location setDirection(float, float)
- Location setDirection(Vector3)

### Class: com.sk89q.worldedit.util.PropertiesConfiguration
Type: Class
Extends: com.sk89q.worldedit.LocalConfiguration

Methods:
- void load()

### Class: com.sk89q.worldedit.util.SideEffect
Type: Enum
Extends: java.lang.Enum

Methods:
- String getDisplayName()
- SideEffect valueOf(String)
- SideEffect[] values()
- boolean isExposed()
- String getDescription()
- SideEffect$State getDefaultValue()

### Class: com.sk89q.worldedit.util.SideEffectSet
Type: Class

Methods:
- SideEffectSet with(SideEffect, SideEffect$State)
- SideEffect$State getState(SideEffect)
- boolean doesApplyAny()
- SideEffectSet defaults()
- Set getSideEffectsToApply()
- SideEffectSet none()
- boolean shouldApply(SideEffect)

### Class: com.sk89q.worldedit.util.TargetBlock
Type: Class

Methods:
- void setSolidMask(Mask)
- Location getPreviousBlock()
- Location getTargetBlockFace()
- Location getAnyTargetBlock()
- Location getSolidTargetBlock()
- void setStopMask(Mask)
- Location getAnyTargetBlockFace()
- Location getNextBlock()
- Location getCurrentBlock()
- Location getTargetBlock()

### Class: com.sk89q.worldedit.util.TreeGenerator
Type: Class

Methods:
- TreeGenerator$TreeType lookup(String)

### Class: com.sk89q.worldedit.util.WeightedChoice
Type: Class

Methods:
- Optional getChoice()
- void consider(Object)

### Class: com.sk89q.worldedit.util.YAMLConfiguration
Type: Class
Extends: com.sk89q.worldedit.LocalConfiguration

Methods:
- void load()
- void unload()

## Package: com.sk89q.worldedit.util.asset

### Class: com.sk89q.worldedit.util.asset.AssetLoadTask
Type: Class
Implements: java.util.concurrent.Callable

Methods:
- Object call()

### Class: com.sk89q.worldedit.util.asset.AssetLoader
Type: Abstract Class

Methods:
- Object getAsset(String)
- Set getAllowedExtensions()

### Class: com.sk89q.worldedit.util.asset.AssetLoaders
Type: Class

Methods:
- Optional getAssetLoader(Class, String)
- void init()
- List getFilesForAsset(Class)
- void registerAssetLoader(AssetLoader, Class)
- List getAssetLoaders(Class)
- List getAssetLoaders()
- void uninit()

### Class: com.sk89q.worldedit.util.asset.ImageHeightmapLoader
Type: Class
Extends: com.sk89q.worldedit.util.asset.AssetLoader

Methods:
- Set getAllowedExtensions()
- ImageHeightmap loadAssetFromPath(Path) throws Exception
- Object loadAssetFromPath(Path) throws Exception

## Package: com.sk89q.worldedit.util.asset.holder

### Class: com.sk89q.worldedit.util.asset.holder.ImageHeightmap
Type: Class

Methods:
- double getHeightAt(int, int, int)

## Package: com.sk89q.worldedit.util.auth

### Class: com.sk89q.worldedit.util.auth.Subject
Type: Interface

Methods:
- void checkPermission(String) throws AuthorizationException
- boolean hasPermission(String)
- String[] getGroups()

### Class: com.sk89q.worldedit.util.auth.AuthorizationException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

## Package: com.sk89q.worldedit.util.collection

### Class: com.sk89q.worldedit.util.collection.BlockMap
Type: Class
Extends: java.util.AbstractMap

Methods:
- Object getOrDefault(Object, Object)
- Set entrySet()
- boolean containsKey(Object)
- void forEach(BiConsumer)
- Collection values()
- Object computeIfAbsent(BlockVector3, Function)
- Object computeIfAbsent(Object, Function)
- void clear()
- boolean replace(BlockVector3, Object, Object)
- Object replace(BlockVector3, Object)
- Object replace(Object, Object)
- boolean replace(Object, Object, Object)
- BlockMap copyOf(Map)
- void replaceAll(BiFunction)
- boolean containsValue(Object)
- boolean remove(Object, Object)
- Object remove(Object)
- Object put(BlockVector3, Object)
- Object put(Object, Object)
- Object compute(BlockVector3, BiFunction)
- Object compute(Object, BiFunction)
- Object computeIfPresent(BlockVector3, BiFunction)
- Object computeIfPresent(Object, BiFunction)
- int size()
- int hashCode()
- boolean equals(Object)
- void putAll(Map)
- Object get(Object)
- Object merge(BlockVector3, Object, BiFunction)
- Object merge(Object, Object, BiFunction)
- BlockMap create()
- Object putIfAbsent(BlockVector3, Object)
- Object putIfAbsent(Object, Object)
- BlockMap createForBaseBlock()

### Class: com.sk89q.worldedit.util.collection.DoubleArrayList
Type: Class
Implements: java.lang.Iterable

Methods:
- Iterator iterator(boolean)
- Iterator iterator()
- int size()
- void clear()
- void put(Object, Object)

### Class: com.sk89q.worldedit.util.collection.LocatedBlockList
Type: Class
Implements: java.lang.Iterable

Methods:
- void add(LocatedBlock)
- void add(BlockVector3, BlockStateHolder)
- Iterator iterator()
- int size()
- BaseBlock get(BlockVector3)
- void clear()
- Iterator reverseIterator()
- boolean containsLocation(BlockVector3)

### Class: com.sk89q.worldedit.util.collection.MoreStreams
Type: Class

Methods:
- IntStream bufferStream(ByteBuffer)
- IntStream bufferStream(IntBuffer)
- LongStream bufferStream(LongBuffer)
- Stream takeWhile(Stream, Predicate)
- Stream takeUntil(Stream, Predicate)

## Package: com.sk89q.worldedit.util.concurrency

### Class: com.sk89q.worldedit.util.concurrency.EvenMoreExecutors
Type: Class

Methods:
- ExecutorService newBoundedCachedThreadPool(int, int, int)
- ExecutorService newBoundedCachedThreadPool(int, int, int, String)

### Class: com.sk89q.worldedit.util.concurrency.LazyReference
Type: Class

Methods:
- Object getValue()
- LazyReference computed(Object)
- LazyReference from(Supplier)

## Package: com.sk89q.worldedit.util.eventbus

### Class: com.sk89q.worldedit.util.eventbus.Subscribe
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- EventHandler$Priority priority()

### Class: com.sk89q.worldedit.util.eventbus.EventBus
Type: Class

Methods:
- void unsubscribeAll(Multimap)
- void post(Object)
- void unsubscribe(Class, EventHandler)
- void subscribe(Class, EventHandler)
- void unregister(Object)
- void subscribeAll(Multimap)
- void register(Object)

### Class: com.sk89q.worldedit.util.eventbus.EventHandler
Type: Abstract Class
Implements: java.lang.Comparable

Methods:
- void dispatch(Object) throws Exception
- void handleEvent(Object) throws InvocationTargetException
- int hashCode()
- boolean equals(Object)
- EventHandler$Priority getPriority()
- String toString()
- int compareTo(EventHandler)
- int compareTo(Object)

### Class: com.sk89q.worldedit.util.eventbus.MethodEventHandler
Type: Class
Extends: com.sk89q.worldedit.util.eventbus.EventHandler

Methods:
- void dispatch(Object) throws Exception
- int hashCode()
- boolean equals(Object)
- Method getMethod()

### Class: com.sk89q.worldedit.util.eventbus.MethodHandleEventHandler
Type: Class
Extends: com.sk89q.worldedit.util.eventbus.EventHandler

Methods:
- void dispatch(Object) throws Exception
- int hashCode()
- boolean equals(Object)

## Package: com.sk89q.worldedit.util.formatting

### Class: com.sk89q.worldedit.util.formatting.WorldEditText
Type: Class

Methods:
- Component format(Component, Locale)
- String reduceToText(Component, Locale)

## Package: com.sk89q.worldedit.util.formatting.component

### Class: com.sk89q.worldedit.util.formatting.component.CodeFormat
Type: Class
Extends: com.sk89q.worldedit.util.formatting.component.TextComponentProducer

Methods:
- TextComponent wrap(String[])

### Class: com.sk89q.worldedit.util.formatting.component.CommandListBox
Type: Class
Extends: com.sk89q.worldedit.util.formatting.component.PaginationBox

Methods:
- void appendCommand(String, Component)
- void appendCommand(String, String, String)
- void appendCommand(String, Component, String)
- void setHidingHelp(boolean)
- boolean isHidingHelp()
- Component getComponent(int)
- int getComponentsSize()

### Class: com.sk89q.worldedit.util.formatting.component.CommandUsageBox
Type: Class
Extends: com.sk89q.worldedit.util.formatting.component.TextComponentProducer

No public methods found

### Class: com.sk89q.worldedit.util.formatting.component.ErrorFormat
Type: Class
Extends: com.sk89q.worldedit.util.formatting.component.TextComponentProducer

Methods:
- TextComponent wrap(String[])

### Class: com.sk89q.worldedit.util.formatting.component.InvalidComponentException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

### Class: com.sk89q.worldedit.util.formatting.component.LabelFormat
Type: Class
Extends: com.sk89q.worldedit.util.formatting.component.TextComponentProducer

Methods:
- TextComponent wrap(String[])

### Class: com.sk89q.worldedit.util.formatting.component.MessageBox
Type: Class
Extends: com.sk89q.worldedit.util.formatting.component.TextComponentProducer

Methods:
- TextComponent create()
- TextComponentProducer getContents()

### Class: com.sk89q.worldedit.util.formatting.component.PaginationBox
Type: Abstract Class
Extends: com.sk89q.worldedit.util.formatting.component.MessageBox

Methods:
- void formatForConsole()
- PaginationBox fromComponents(String, String, List)
- PaginationBox fromStrings(String, String, List)
- Component create(int) throws InvalidComponentException
- TextComponent create()
- void setComponentsPerPage(int)
- Component getComponent(int)
- int getComponentsSize()

### Class: com.sk89q.worldedit.util.formatting.component.SideEffectBox
Type: Class
Extends: com.sk89q.worldedit.util.formatting.component.PaginationBox

Methods:
- Component getComponent(int)
- int getComponentsSize()

### Class: com.sk89q.worldedit.util.formatting.component.SubtleFormat
Type: Class
Extends: com.sk89q.worldedit.util.formatting.component.TextComponentProducer

Methods:
- TextComponent wrap(String[])

### Class: com.sk89q.worldedit.util.formatting.component.TextComponentProducer
Type: Class

Methods:
- TextComponentProducer newline()
- TextComponent$Builder getBuilder()
- TextComponentProducer reset()
- TextComponent create()
- TextComponentProducer append(Component)
- TextComponentProducer append(String)

### Class: com.sk89q.worldedit.util.formatting.component.TextUtils
Type: Class

Methods:
- Locale getLocaleByMinecraftTag(String)
- Component join(List, Component)

## Package: com.sk89q.worldedit.util.formatting.text

### Class: com.sk89q.worldedit.util.formatting.text.BlockNbtComponent
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.NbtComponent, com.sk89q.worldedit.util.formatting.text.ScopedComponent

Methods:
- BlockNbtComponent localPos(double, double, double)
- BlockNbtComponent$Pos pos()
- BlockNbtComponent pos(BlockNbtComponent$Pos)
- BlockNbtComponent of(String, BlockNbtComponent$Pos)
- BlockNbtComponent$Builder builder()
- BlockNbtComponent worldPos(BlockNbtComponent$WorldPos$Coordinate, BlockNbtComponent$WorldPos$Coordinate, BlockNbtComponent$WorldPos$Coordinate)
- BlockNbtComponent relativeWorldPos(int, int, int)
- BlockNbtComponent make(Consumer)
- BlockNbtComponent absoluteWorldPos(int, int, int)

### Class: com.sk89q.worldedit.util.formatting.text.BuildableComponent
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.Component

Methods:
- ComponentBuilder toBuilder()

### Class: com.sk89q.worldedit.util.formatting.text.Component
Type: Interface

Methods:
- Component mergeColor(Component)
- TextColor color()
- Component color(TextColor)
- boolean hasStyling()
- Set decorations()
- Set decorations(Set)
- boolean hasDecoration(TextDecoration)
- Component colorIfAbsent(TextColor)
- void detectCycle(Component)
- HoverEvent hoverEvent()
- Component hoverEvent(HoverEvent)
- ClickEvent clickEvent()
- Component clickEvent(ClickEvent)
- boolean contains(Component)
- List children()
- Component children(List)
- Component mergeStyle(Component)
- Component mergeStyle(Component, Style$Merge[])
- Component mergeStyle(Component, Set)
- Component mergeDecorations(Component)
- String insertion()
- Component insertion(String)
- Style style()
- Component style(Style)
- Component style(Consumer)
- Component style(Consumer, Style$Merge$Strategy)
- Component style(Style$Builder)
- TextDecoration$State decoration(TextDecoration)
- Component decoration(TextDecoration, boolean)
- Component decoration(TextDecoration, TextDecoration$State)
- Component append(Component)
- Component append(ComponentBuilder)
- Component mergeEvents(Component)

### Class: com.sk89q.worldedit.util.formatting.text.ComponentBuilder
Type: Interface

Methods:
- ComponentBuilder mergeColor(Component)
- ComponentBuilder color(TextColor)
- ComponentBuilder apply(Consumer)
- ComponentBuilder resetStyle()
- ComponentBuilder decorations(Set, boolean)
- ComponentBuilder colorIfAbsent(TextColor)
- ComponentBuilder hoverEvent(HoverEvent)
- ComponentBuilder clickEvent(ClickEvent)
- ComponentBuilder mapChildren(Function)
- BuildableComponent build()
- ComponentBuilder mapChildrenDeep(Function)
- ComponentBuilder mergeStyle(Component)
- ComponentBuilder mergeStyle(Component, Style$Merge[])
- ComponentBuilder mergeStyle(Component, Set)
- ComponentBuilder mergeDecorations(Component)
- ComponentBuilder insertion(String)
- ComponentBuilder style(Style)
- ComponentBuilder style(Consumer)
- ComponentBuilder applyDeep(Consumer)
- ComponentBuilder decoration(TextDecoration, boolean)
- ComponentBuilder decoration(TextDecoration, TextDecoration$State)
- ComponentBuilder append(String)
- ComponentBuilder append(String, TextColor)
- ComponentBuilder append(String, TextColor, TextDecoration[])
- ComponentBuilder append(String, Consumer)
- ComponentBuilder append(Component)
- ComponentBuilder append(ComponentBuilder)
- ComponentBuilder append(Component[])
- ComponentBuilder append(Iterable)
- ComponentBuilder mergeEvents(Component)

### Class: com.sk89q.worldedit.util.formatting.text.ComponentBuilders
Type: Interface

Methods:
- BlockNbtComponent$Builder blockNbt()
- TranslatableComponent$Builder translatable()
- TranslatableComponent$Builder translatable(String)
- ScoreComponent$Builder score()
- ScoreComponent$Builder score(String, String)
- EntityNbtComponent$Builder entityNbt()
- KeybindComponent$Builder keybind()
- KeybindComponent$Builder keybind(String)
- SelectorComponent$Builder selector()
- SelectorComponent$Builder selector(String)
- TextComponent$Builder text()
- TextComponent$Builder text(String, TextColor)
- TextComponent$Builder text(char)
- TextComponent$Builder text(double)
- TextComponent$Builder text(float)
- TextComponent$Builder text(int)
- TextComponent$Builder text(long)
- TextComponent$Builder text(String)
- StorageNbtComponent$Builder storageNbt()

### Class: com.sk89q.worldedit.util.formatting.text.EntityNbtComponent
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.NbtComponent, com.sk89q.worldedit.util.formatting.text.ScopedComponent

Methods:
- EntityNbtComponent of(String, String)
- EntityNbtComponent$Builder builder()
- String selector()
- EntityNbtComponent selector(String)
- EntityNbtComponent make(Consumer)

### Class: com.sk89q.worldedit.util.formatting.text.KeybindComponent
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.BuildableComponent, com.sk89q.worldedit.util.formatting.text.ScopedComponent

Methods:
- String keybind()
- KeybindComponent keybind(String)
- KeybindComponent of(String)
- KeybindComponent of(String, TextColor)
- KeybindComponent of(String, TextColor, TextDecoration[])
- KeybindComponent of(String, TextColor, Set)
- KeybindComponent$Builder builder()
- KeybindComponent$Builder builder(String)
- KeybindComponent make(Consumer)
- KeybindComponent make(String, Consumer)

### Class: com.sk89q.worldedit.util.formatting.text.NbtComponent
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.BuildableComponent

Methods:
- String nbtPath()
- NbtComponent nbtPath(String)
- boolean interpret()
- NbtComponent interpret(boolean)

### Class: com.sk89q.worldedit.util.formatting.text.NbtComponentBuilder
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.ComponentBuilder

Methods:
- NbtComponentBuilder nbtPath(String)
- NbtComponentBuilder interpret(boolean)

### Class: com.sk89q.worldedit.util.formatting.text.ScopedComponent
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.Component

Methods:
- Component hoverEvent(HoverEvent)
- Component mergeColor(Component)
- Component clickEvent(ClickEvent)
- Component color(TextColor)
- Component children(List)
- Component mergeStyle(Component)
- Component mergeStyle(Component, Style$Merge[])
- Component mergeStyle(Component, Set)
- Component mergeDecorations(Component)
- Component insertion(String)
- Component style(Style)
- Component style(Consumer)
- Component style(Style$Builder)
- Component decoration(TextDecoration, boolean)
- Component decoration(TextDecoration, TextDecoration$State)
- Component append(Component)
- Component append(ComponentBuilder)
- Component mergeEvents(Component)
- Component colorIfAbsent(TextColor)

### Class: com.sk89q.worldedit.util.formatting.text.ScoreComponent
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.BuildableComponent, com.sk89q.worldedit.util.formatting.text.ScopedComponent

Methods:
- ScoreComponent of(String, String)
- ScoreComponent of(String, String, String)
- String name()
- ScoreComponent name(String)
- ScoreComponent$Builder builder()
- ScoreComponent$Builder builder(String, String)
- String value()
- ScoreComponent value(String)
- ScoreComponent make(Consumer)
- ScoreComponent make(String, String, Consumer)
- String objective()
- ScoreComponent objective(String)

### Class: com.sk89q.worldedit.util.formatting.text.SelectorComponent
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.BuildableComponent, com.sk89q.worldedit.util.formatting.text.ScopedComponent

Methods:
- SelectorComponent of(String)
- String pattern()
- SelectorComponent pattern(String)
- SelectorComponent$Builder builder()
- SelectorComponent$Builder builder(String)
- SelectorComponent make(Consumer)
- SelectorComponent make(String, Consumer)

### Class: com.sk89q.worldedit.util.formatting.text.StorageNbtComponent
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.NbtComponent, com.sk89q.worldedit.util.formatting.text.ScopedComponent

Methods:
- StorageNbtComponent of(String, Key)
- StorageNbtComponent$Builder builder()
- Key storage()
- StorageNbtComponent storage(Key)
- StorageNbtComponent make(Consumer)

### Class: com.sk89q.worldedit.util.formatting.text.TextComponent
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.BuildableComponent, com.sk89q.worldedit.util.formatting.text.ScopedComponent

Methods:
- TextComponent newline()
- TextComponent of(String)
- TextComponent of(String, TextColor)
- TextComponent of(String, TextColor, TextDecoration[])
- TextComponent of(String, TextColor, Set)
- TextComponent of(String, Style)
- TextComponent of(boolean)
- TextComponent of(boolean, TextColor)
- TextComponent of(boolean, TextColor, TextDecoration[])
- TextComponent of(boolean, TextColor, Set)
- TextComponent of(boolean, Style)
- TextComponent of(char)
- TextComponent of(char, TextColor)
- TextComponent of(char, TextColor, TextDecoration[])
- TextComponent of(char, TextColor, Set)
- TextComponent of(char, Style)
- TextComponent of(double)
- TextComponent of(double, TextColor)
- TextComponent of(double, TextColor, TextDecoration[])
- TextComponent of(double, TextColor, Set)
- TextComponent of(double, Style)
- TextComponent of(float)
- TextComponent of(float, TextColor)
- TextComponent of(float, TextColor, TextDecoration[])
- TextComponent of(float, TextColor, Set)
- TextComponent of(float, Style)
- TextComponent of(int)
- TextComponent of(int, TextColor)
- TextComponent of(int, TextColor, TextDecoration[])
- TextComponent of(int, TextColor, Set)
- TextComponent of(int, Style)
- TextComponent of(long)
- TextComponent of(long, TextColor)
- TextComponent of(long, TextColor, TextDecoration[])
- TextComponent of(long, TextColor, Set)
- TextComponent of(long, Style)
- boolean isEmpty()
- TextComponent$Builder builder()
- TextComponent$Builder builder(String)
- TextComponent$Builder builder(String, TextColor)
- TextComponent join(Component, Component[])
- TextComponent join(Component, Iterable)
- TextComponent make(Consumer)
- TextComponent make(String, Consumer)
- String content()
- TextComponent content(String)
- TextComponent space()
- TextComponent empty()

### Class: com.sk89q.worldedit.util.formatting.text.TranslatableComponent
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.BuildableComponent, com.sk89q.worldedit.util.formatting.text.ScopedComponent

Methods:
- List args()
- TranslatableComponent args(Component[])
- TranslatableComponent args(List)
- TranslatableComponent of(String)
- TranslatableComponent of(String, TextColor)
- TranslatableComponent of(String, TextColor, TextDecoration[])
- TranslatableComponent of(String, TextColor, Set)
- TranslatableComponent of(String, Component[])
- TranslatableComponent of(String, TextColor, Component[])
- TranslatableComponent of(String, TextColor, Set, Component[])
- TranslatableComponent of(String, List)
- TranslatableComponent of(String, TextColor, List)
- TranslatableComponent of(String, TextColor, Set, List)
- TranslatableComponent$Builder builder()
- TranslatableComponent$Builder builder(String)
- TranslatableComponent make(Consumer)
- TranslatableComponent make(String, Consumer)
- TranslatableComponent make(String, List, Consumer)
- String key()
- TranslatableComponent key(String)

### Class: com.sk89q.worldedit.util.formatting.text.AbstractComponent
Type: Abstract Class
Implements: com.sk89q.worldedit.util.formatting.text.Component

Methods:
- List children()
- int hashCode()
- boolean equals(Object)
- String toString()
- Style style()

## Package: com.sk89q.worldedit.util.formatting.text.adapter.bukkit

### Class: com.sk89q.worldedit.util.formatting.text.adapter.bukkit.SpigotTextAdapter
Type: Interface

Methods:
- BaseComponent[] toBungeeCord(Component)

### Class: com.sk89q.worldedit.util.formatting.text.adapter.bukkit.TextAdapter
Type: Interface

Methods:
- void sendMessage(CommandSender, Component)
- void sendMessage(Iterable, Component)
- void sendComponent(CommandSender, Component)
- void sendComponent(Iterable, Component)
- void sendActionBar(CommandSender, Component)
- void sendActionBar(Iterable, Component)

## Package: com.sk89q.worldedit.util.formatting.text.event

### Class: com.sk89q.worldedit.util.formatting.text.event.ClickEvent
Type: Class

Methods:
- ClickEvent openUrl(String)
- ClickEvent openFile(String)
- ClickEvent changePage(String)
- ClickEvent changePage(int)
- int hashCode()
- boolean equals(Object)
- ClickEvent of(ClickEvent$Action, String)
- ClickEvent suggestCommand(String)
- ClickEvent$Action action()
- ClickEvent copyToClipboard(String)
- String toString()
- ClickEvent runCommand(String)
- String value()

### Class: com.sk89q.worldedit.util.formatting.text.event.HoverEvent
Type: Class

Methods:
- HoverEvent showEntity(Component)
- int hashCode()
- boolean equals(Object)
- HoverEvent showText(Component)
- HoverEvent of(HoverEvent$Action, Component)
- HoverEvent$Action action()
- HoverEvent showItem(Component)
- String toString()
- Component value()

## Package: com.sk89q.worldedit.util.formatting.text.format

### Class: com.sk89q.worldedit.util.formatting.text.format.TextFormat
Type: Interface

No public methods found

### Class: com.sk89q.worldedit.util.formatting.text.format.Style
Type: Class

Methods:
- Style$Builder toBuilder()
- Style mergeColor(Style)
- TextColor color()
- Style color(TextColor)
- Style edit(Consumer)
- Style edit(Consumer, Style$Merge$Strategy)
- boolean isEmpty()
- Set decorations()
- Set decorations(Set)
- boolean hasDecoration(TextDecoration)
- Style colorIfAbsent(TextColor)
- Style empty()
- HoverEvent hoverEvent()
- Style hoverEvent(HoverEvent)
- ClickEvent clickEvent()
- Style clickEvent(ClickEvent)
- int hashCode()
- boolean equals(Object)
- Style merge(Style)
- Style merge(Style, Style$Merge$Strategy)
- Style merge(Style, Style$Merge)
- Style merge(Style, Style$Merge$Strategy, Style$Merge)
- Style merge(Style, Style$Merge[])
- Style merge(Style, Style$Merge$Strategy, Style$Merge[])
- Style merge(Style, Set)
- Style merge(Style, Style$Merge$Strategy, Set)
- Style of(TextColor)
- Style of(TextDecoration)
- Style of(TextDecoration[])
- Style of(TextColor, TextDecoration[])
- Style of(TextColor, Set)
- Style of(Consumer)
- Style$Builder builder()
- String toString()
- Style mergeDecorations(Style)
- String insertion()
- Style insertion(String)
- TextDecoration$State decoration(TextDecoration)
- Style decoration(TextDecoration, boolean)
- Style decoration(TextDecoration, TextDecoration$State)
- Style make(Consumer)
- Style mergeEvents(Style)

### Class: com.sk89q.worldedit.util.formatting.text.format.TextColor
Type: Enum
Extends: java.lang.Enum
Implements: com.sk89q.worldedit.util.formatting.text.format.TextFormat

Methods:
- TextColor valueOf(String)
- TextColor[] values()
- String toString()

### Class: com.sk89q.worldedit.util.formatting.text.format.TextDecoration
Type: Enum
Extends: java.lang.Enum
Implements: com.sk89q.worldedit.util.formatting.text.format.TextFormat

Methods:
- TextDecoration valueOf(String)
- TextDecoration[] values()
- String toString()
- Set setOf(TextDecoration[])

## Package: com.sk89q.worldedit.util.formatting.text.renderer

### Class: com.sk89q.worldedit.util.formatting.text.renderer.ComponentRenderer
Type: Interface

Methods:
- Component render(Component, Object)

### Class: com.sk89q.worldedit.util.formatting.text.renderer.AbstractComponentRenderer
Type: Abstract Class
Implements: com.sk89q.worldedit.util.formatting.text.renderer.ComponentRenderer

Methods:
- Component render(Component, Object)

### Class: com.sk89q.worldedit.util.formatting.text.renderer.FriendlyComponentRenderer
Type: Abstract Class
Implements: com.sk89q.worldedit.util.formatting.text.renderer.ComponentRenderer

Methods:
- FriendlyComponentRenderer from(BiFunction)
- Component render(Component, Object)

### Class: com.sk89q.worldedit.util.formatting.text.renderer.TranslatableComponentRenderer
Type: Abstract Class
Extends: com.sk89q.worldedit.util.formatting.text.renderer.AbstractComponentRenderer

Methods:
- TranslatableComponentRenderer from(BiFunction)

## Package: com.sk89q.worldedit.util.formatting.text.serializer

### Class: com.sk89q.worldedit.util.formatting.text.serializer.ComponentSerializer
Type: Interface

Methods:
- Object serialize(Component)
- Component deserialize(Object)

## Package: com.sk89q.worldedit.util.formatting.text.serializer.gson

### Class: com.sk89q.worldedit.util.formatting.text.serializer.gson.BlockNbtComponentPosSerializer
Type: Class
Implements: com.google.gson.JsonDeserializer, com.google.gson.JsonSerializer

Methods:
- JsonElement serialize(BlockNbtComponent$Pos, Type, JsonSerializationContext)
- JsonElement serialize(Object, Type, JsonSerializationContext)
- BlockNbtComponent$Pos deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.sk89q.worldedit.util.formatting.text.serializer.gson.GsonComponentSerializer
Type: Class
Implements: com.sk89q.worldedit.util.formatting.text.serializer.ComponentSerializer, com.google.gson.JsonDeserializer, com.google.gson.JsonSerializer

Methods:
- String serialize(Component)
- JsonElement serialize(Component, Type, JsonSerializationContext)
- Object serialize(Component)
- JsonElement serialize(Object, Type, JsonSerializationContext)
- GsonBuilder populate(GsonBuilder)
- Component deserialize(String)
- Component deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Component deserialize(Object)
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.sk89q.worldedit.util.formatting.text.serializer.gson.NameMapSerializer
Type: Class
Implements: com.google.gson.JsonDeserializer, com.google.gson.JsonSerializer

Methods:
- JsonElement serialize(Enum, Type, JsonSerializationContext)
- JsonElement serialize(Object, Type, JsonSerializationContext)
- Enum deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.sk89q.worldedit.util.formatting.text.serializer.gson.StyleSerializer
Type: Class
Implements: com.google.gson.JsonDeserializer, com.google.gson.JsonSerializer

Methods:
- JsonElement serialize(Style, Type, JsonSerializationContext)
- JsonElement serialize(Object, Type, JsonSerializationContext)
- Style deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

## Package: com.sk89q.worldedit.util.formatting.text.serializer.legacy

### Class: com.sk89q.worldedit.util.formatting.text.serializer.legacy.LegacyComponentSerializer
Type: Interface
Implements: com.sk89q.worldedit.util.formatting.text.serializer.ComponentSerializer

Methods:
- String serialize(Component)
- String serialize(Component, char)
- Object serialize(Component)
- LegacyComponentSerializer legacy()
- TextComponent deserialize(String)
- TextComponent deserialize(String, char)
- Component deserialize(Object)
- LegacyComponentSerializer legacyLinking()
- LegacyComponentSerializer legacyLinking(Style)

## Package: com.sk89q.worldedit.util.formatting.text.serializer.plain

### Class: com.sk89q.worldedit.util.formatting.text.serializer.plain.PlainComponentSerializer
Type: Class
Implements: com.sk89q.worldedit.util.formatting.text.serializer.ComponentSerializer

Methods:
- String serialize(Component)
- void serialize(StringBuilder, Component)
- Object serialize(Component)
- TextComponent deserialize(String)
- Component deserialize(Object)

## Package: com.sk89q.worldedit.util.formatting.text.util

### Class: com.sk89q.worldedit.util.formatting.text.util.ToStringer
Type: Interface

Methods:
- String toString(Object, Map)

### Class: com.sk89q.worldedit.util.formatting.text.util.NameMap
Type: Class

Methods:
- Optional get(String)
- String name(Enum)
- NameMap create(Class, Function)
- NameMap create(Enum[], Function)
- Optional value(String)

### Class: com.sk89q.worldedit.util.formatting.text.util.ShadyPines
Type: Class

Methods:
- String toString(Object, Consumer)
- String toString(Object, Map)
- Set enumSet(Class, Enum[])

## Package: com.sk89q.worldedit.util.function

### Class: com.sk89q.worldedit.util.function.IOFunction
Type: Interface

Methods:
- Object apply(Object) throws IOException
- Function unchecked(IOFunction)

### Class: com.sk89q.worldedit.util.function.IORunnable
Type: Interface

Methods:
- Runnable unchecked(IORunnable)
- void run() throws IOException

### Class: com.sk89q.worldedit.util.function.LevenshteinDistance
Type: Class
Implements: com.google.common.base.Function

Methods:
- int distance(String, String)
- Integer apply(String)
- Object apply(Object)

## Package: com.sk89q.worldedit.util.gson

### Class: com.sk89q.worldedit.util.gson.BlockVectorAdapter
Type: Class
Implements: com.google.gson.JsonDeserializer

Methods:
- BlockVector3 deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: com.sk89q.worldedit.util.gson.GsonUtil
Type: Class

Methods:
- String stringValue(String)
- GsonBuilder createBuilder()

### Class: com.sk89q.worldedit.util.gson.VectorAdapter
Type: Class
Implements: com.google.gson.JsonDeserializer

Methods:
- Vector3 deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException
- Object deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

## Package: com.sk89q.worldedit.util.io

### Class: com.sk89q.worldedit.util.io.ResourceLoader
Type: Interface

Methods:
- URL getResource(Class, String) throws IOException
- Path getLocalResource(String)
- URL getRootResource(String) throws IOException

### Class: com.sk89q.worldedit.util.io.Closer
Type: Class
Implements: java.io.Closeable

Methods:
- RuntimeException rethrow(Throwable) throws IOException
- RuntimeException rethrow(Throwable, Class) throws IOException, Exception
- RuntimeException rethrow(Throwable, Class, Class) throws IOException, Exception, Exception
- RuntimeException rethrowAndClose(Throwable) throws IOException
- Closer create()
- void close() throws IOException
- Closeable register(Closeable)
- ZipFile register(ZipFile)

### Class: com.sk89q.worldedit.util.io.ForwardSeekableInputStream
Type: Class
Extends: java.io.InputStream

Methods:
- int read() throws IOException
- int read(byte[], int, int) throws IOException
- int read(byte[]) throws IOException
- boolean markSupported()
- int available() throws IOException
- void reset() throws IOException
- long skip(long) throws IOException
- void seek(long) throws IOException
- void close() throws IOException
- void mark(int)

### Class: com.sk89q.worldedit.util.io.WorldEditResourceLoader
Type: Class
Implements: com.sk89q.worldedit.util.io.ResourceLoader

Methods:
- Path getLocalResource(String)

## Package: com.sk89q.worldedit.util.io.file

### Class: com.sk89q.worldedit.util.io.file.ArchiveDir
Type: Interface
Implements: java.io.Closeable

Methods:
- Path getPath()

### Class: com.sk89q.worldedit.util.io.file.ArchiveNioSupport
Type: Interface

Methods:
- Optional tryOpenAsDir(Path) throws IOException

### Class: com.sk89q.worldedit.util.io.file.ArchiveNioSupports
Type: Class

Methods:
- Path skipRootSameName(Path, String) throws IOException
- Optional tryOpenAsDir(Path) throws IOException
- ArchiveNioSupport combined()

### Class: com.sk89q.worldedit.util.io.file.ArchiveUnpacker
Type: Class

Methods:
- Path unpackArchive(URL) throws IOException

### Class: com.sk89q.worldedit.util.io.file.AttributeTarget
Type: Enum
Extends: java.lang.Enum

Methods:
- AttributeTarget valueOf(String)
- AttributeTarget[] values()

### Class: com.sk89q.worldedit.util.io.file.FileSelectionAbortedException
Type: Class
Extends: com.sk89q.worldedit.util.io.file.FilenameException

No public methods found

### Class: com.sk89q.worldedit.util.io.file.FilenameException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

Methods:
- String getFilename()

### Class: com.sk89q.worldedit.util.io.file.FilenameResolutionException
Type: Class
Extends: com.sk89q.worldedit.util.io.file.FilenameException

No public methods found

### Class: com.sk89q.worldedit.util.io.file.InvalidFilenameException
Type: Class
Extends: com.sk89q.worldedit.util.io.file.FilenameException

No public methods found

### Class: com.sk89q.worldedit.util.io.file.MorePaths
Type: Class

Methods:
- Comparator oldestFirst()
- Comparator newestFirst()
- Spliterator optimizedSpliterator(Path)
- Stream iterPaths(Path)

### Class: com.sk89q.worldedit.util.io.file.SafeFiles
Type: Class

Methods:
- FileAttribute[] getOwnerOnlyFileAttributes(AttributeTarget)
- void tryHardToDelete(Path) throws IOException
- void tryHardToDeleteDir(Path) throws IOException
- String canonicalFileName(Path)
- Stream noLeakFileList(Path) throws IOException

### Class: com.sk89q.worldedit.util.io.file.ZipArchiveNioSupport
Type: Class
Implements: com.sk89q.worldedit.util.io.file.ArchiveNioSupport

Methods:
- Optional tryOpenAsDir(Path) throws IOException
- ZipArchiveNioSupport getInstance()

## Package: com.sk89q.worldedit.util.kyori

### Class: com.sk89q.worldedit.util.kyori.Key
Type: Interface
Implements: java.lang.Comparable

Methods:
- Key of(String)
- Key of(String, char)
- Key of(String, String)
- String namespace()
- String asString()
- String value()

## Package: com.sk89q.worldedit.util.lifecycle

### Class: com.sk89q.worldedit.util.lifecycle.Lifecycled
Type: Interface

Methods:
- Lifecycled flatMap(Function)
- Lifecycled filter(Predicate)
- boolean isValid()
- Object valueOrThrow() throws IllegalStateException
- Lifecycled map(Function)
- Optional value()
- Lifecycled$Events events()

### Class: com.sk89q.worldedit.util.lifecycle.ConstantLifecycled
Type: Class
Implements: com.sk89q.worldedit.util.lifecycle.Lifecycled

Methods:
- Optional value()
- Lifecycled$Events events()

### Class: com.sk89q.worldedit.util.lifecycle.LifecycledCallbackHandler
Type: Class
Implements: com.sk89q.worldedit.util.lifecycle.Lifecycled$Events

Methods:
- void fireInvalidated()
- void fireOnNewValue()
- void onNewValue(Object, BiConsumer)
- void onInvalidated(Object, BiConsumer)

### Class: com.sk89q.worldedit.util.lifecycle.SimpleLifecycled
Type: Class
Implements: com.sk89q.worldedit.util.lifecycle.Lifecycled

Methods:
- SimpleLifecycled valid(Object)
- void newValue(Object)
- SimpleLifecycled invalid()
- void invalidate()
- Optional value()
- Lifecycled$Events events()

## Package: com.sk89q.worldedit.util.logging

### Class: com.sk89q.worldedit.util.logging.DynamicStreamHandler
Type: Class
Extends: java.util.logging.StreamHandler

Methods:
- boolean isLoggable(LogRecord)
- void setHandler(StreamHandler)
- void setEncoding(String) throws SecurityException, UnsupportedEncodingException
- StreamHandler getHandler()
- void setLevel(Level) throws SecurityException
- void setFilter(Filter) throws SecurityException
- String getEncoding()
- Level getLevel()
- Filter getFilter()
- void setFormatter(Formatter) throws SecurityException
- void flush()
- void publish(LogRecord)
- Formatter getFormatter()
- void close() throws SecurityException

### Class: com.sk89q.worldedit.util.logging.LogFormat
Type: Class
Extends: java.util.logging.Formatter

Methods:
- String format(LogRecord)

## Package: com.sk89q.worldedit.util.net

### Class: com.sk89q.worldedit.util.net.HttpRequest
Type: Class
Implements: java.io.Closeable

Methods:
- HttpRequest request(String, URL)
- HttpRequest$BufferedResponse returnContent() throws IOException, InterruptedException
- HttpRequest bodyMultipartForm(HttpRequest$Form)
- HttpRequest expectResponseCode(int[]) throws IOException
- HttpRequest body(String)
- InputStream getInputStream()
- HttpRequest execute() throws IOException
- URL url(String)
- HttpRequest bodyUrlEncodedForm(HttpRequest$Form)
- HttpRequest post(URL)
- HttpRequest get(URL)
- int getResponseCode() throws IOException
- HttpRequest header(String, String)
- void close()
- HttpRequest saveContent(File) throws IOException, InterruptedException
- HttpRequest saveContent(OutputStream) throws IOException, InterruptedException

## Package: com.sk89q.worldedit.util.paste

### Class: com.sk89q.worldedit.util.paste.Paster
Type: Interface

Methods:
- Callable paste(String)
- Callable paste(String, PasteMetadata)

### Class: com.sk89q.worldedit.util.paste.ActorCallbackPaste
Type: Class

Methods:
- void pastebin(Supervisor, Actor, String, String)
- void pastebin(Supervisor, Actor, String, TranslatableComponent$Builder)
- void pastebin(Supervisor, Actor, String, PasteMetadata, TranslatableComponent$Builder)

### Class: com.sk89q.worldedit.util.paste.EngineHubPaste
Type: Class
Implements: com.sk89q.worldedit.util.paste.Paster

Methods:
- Callable paste(String, PasteMetadata)

### Class: com.sk89q.worldedit.util.paste.PasteMetadata
Type: Class

No public methods found

## Package: com.sk89q.worldedit.util.report

### Class: com.sk89q.worldedit.util.report.Report
Type: Interface

Methods:
- String getTitle()

### Class: com.sk89q.worldedit.util.report.Unreported
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.sk89q.worldedit.util.report.ConfigReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

### Class: com.sk89q.worldedit.util.report.DataReport
Type: Class
Implements: com.sk89q.worldedit.util.report.Report

Methods:
- String getTitle()
- String toString()
- void append(String, String)
- void append(String, String, Object[])
- void append(String, byte)
- void append(String, short)
- void append(String, int)
- void append(String, long)
- void append(String, float)
- void append(String, double)
- void append(String, boolean)
- void append(String, char)
- void append(String, Object)

### Class: com.sk89q.worldedit.util.report.HierarchyObjectReport
Type: Class
Extends: com.sk89q.worldedit.util.report.ShallowObjectReport

No public methods found

### Class: com.sk89q.worldedit.util.report.ReportList
Type: Class
Implements: com.sk89q.worldedit.util.report.Report, java.util.List

Methods:
- boolean add(Report)
- void add(int, Report)
- void add(int, Object)
- boolean add(Object)
- List subList(int, int)
- Report set(int, Report)
- Object set(int, Object)
- boolean containsAll(Collection)
- void clear()
- boolean isEmpty()
- boolean remove(Object)
- Report remove(int)
- Object remove(int)
- int lastIndexOf(Object)
- boolean removeAll(Collection)
- Iterator iterator()
- boolean contains(Object)
- String getTitle()
- int size()
- boolean addAll(Collection)
- boolean addAll(int, Collection)
- int hashCode()
- Report get(int)
- Object get(int)
- boolean equals(Object)
- Object[] toArray()
- Object[] toArray(Object[])
- ListIterator listIterator()
- ListIterator listIterator(int)
- String toString()
- int indexOf(Object)
- boolean retainAll(Collection)

### Class: com.sk89q.worldedit.util.report.ShallowObjectReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

### Class: com.sk89q.worldedit.util.report.StackTraceReport
Type: Class
Implements: com.sk89q.worldedit.util.report.Report

Methods:
- String getTitle()
- String toString()

### Class: com.sk89q.worldedit.util.report.SystemInfoReport
Type: Class
Extends: com.sk89q.worldedit.util.report.DataReport

No public methods found

## Package: com.sk89q.worldedit.util.task

### Class: com.sk89q.worldedit.util.task.Supervisor
Type: Interface

Methods:
- List getTasks()
- void monitor(Task)

### Class: com.sk89q.worldedit.util.task.Task
Type: Interface
Implements: com.google.common.util.concurrent.ListenableFuture, com.sk89q.worldedit.util.task.progress.ProgressObservable

Methods:
- Date getCreationDate()
- Task$State getState()
- String getName()
- Object getOwner()
- UUID getUniqueId()

### Class: com.sk89q.worldedit.util.task.AbstractTask
Type: Abstract Class
Extends: com.google.common.util.concurrent.AbstractFuture
Implements: com.sk89q.worldedit.util.task.Task

Methods:
- Date getCreationDate()
- String getName()
- Object getOwner()
- UUID getUniqueId()

### Class: com.sk89q.worldedit.util.task.FutureForwardingTask
Type: Class
Extends: com.sk89q.worldedit.util.task.AbstractTask

Methods:
- boolean cancel(boolean)
- boolean isCancelled()
- Task$State getState()
- Object get() throws InterruptedException, ExecutionException
- Object get(long, TimeUnit) throws InterruptedException, ExecutionException, TimeoutException
- FutureForwardingTask create(ListenableFuture, String, Object)
- Progress getProgress()
- boolean isDone()
- void addListener(Runnable, Executor)

### Class: com.sk89q.worldedit.util.task.SimpleSupervisor
Type: Class
Implements: com.sk89q.worldedit.util.task.Supervisor

Methods:
- List getTasks()
- void monitor(Task)

### Class: com.sk89q.worldedit.util.task.TaskStateComparator
Type: Class
Implements: java.util.Comparator

Methods:
- int compare(Task, Task)
- int compare(Object, Object)

## Package: com.sk89q.worldedit.util.task.progress

### Class: com.sk89q.worldedit.util.task.progress.ProgressObservable
Type: Interface

Methods:
- Progress getProgress()

### Class: com.sk89q.worldedit.util.task.progress.Progress
Type: Abstract Class

Methods:
- Progress split(Progress[])
- Progress split(Collection)
- Progress of(double)
- Progress indeterminate()
- Progress splitObservables(ProgressObservable[])
- Progress splitObservables(Collection)
- Progress completed()
- double getProgress()
- boolean isIndeterminate()

### Class: com.sk89q.worldedit.util.task.progress.ProgressIterator
Type: Class
Implements: java.util.Iterator, com.sk89q.worldedit.util.task.progress.ProgressObservable

Methods:
- Object next()
- ProgressIterator create(Iterator, int)
- ProgressIterator create(List)
- boolean hasNext()
- Progress getProgress()
- void remove()

## Package: com.sk89q.worldedit.util.time

### Class: com.sk89q.worldedit.util.time.SnapshotDateTimeParser
Type: Interface

Methods:
- ZonedDateTime detectDateTime(Path)

### Class: com.sk89q.worldedit.util.time.FileNameDateTimeParser
Type: Class
Implements: com.sk89q.worldedit.util.time.SnapshotDateTimeParser

Methods:
- ZonedDateTime detectDateTime(Path)
- FileNameDateTimeParser getInstance()

### Class: com.sk89q.worldedit.util.time.ModificationDateTimeParser
Type: Class
Implements: com.sk89q.worldedit.util.time.SnapshotDateTimeParser

Methods:
- ZonedDateTime detectDateTime(Path)
- ModificationDateTimeParser getInstance()

## Package: com.sk89q.worldedit.util.translation

### Class: com.sk89q.worldedit.util.translation.TranslationManager
Type: Class

Methods:
- Component convertText(Component, Locale)
- void reload()
- void setDefaultLocale(Locale)
- String makeTranslationKey(String, String)

## Package: com.sk89q.worldedit.world

### Class: com.sk89q.worldedit.world.DataFixer
Type: Interface

Methods:
- Object fixUp(DataFixer$FixType, Object)
- Object fixUp(DataFixer$FixType, Object, int)

### Class: com.sk89q.worldedit.world.NbtValued
Type: Interface

Methods:
- void setNbtData(CompoundTag)
- LinCompoundTag getNbt()
- LazyReference getNbtReference()
- void setNbt(LinCompoundTag)
- void setNbtReference(LazyReference)
- CompoundTag getNbtData()
- boolean hasNbtData()

### Class: com.sk89q.worldedit.world.World
Type: Interface
Implements: com.sk89q.worldedit.extent.Extent, com.sk89q.worldedit.registry.Keyed

Methods:
- void fixAfterFastMode(Iterable)
- boolean generateStructure(StructureType, EditSession, BlockVector3)
- String getName()
- boolean clearContainerBlockContents(BlockVector3)
- WeatherType getWeather()
- boolean setBlock(BlockVector3, BlockStateHolder, boolean) throws WorldEditException
- boolean setBlock(BlockVector3, BlockStateHolder, SideEffectSet) throws WorldEditException
- boolean playEffect(Vector3, int, int)
- Path getStoragePath()
- boolean generateFeature(ConfiguredFeatureType, EditSession, BlockVector3)
- void fixLighting(Iterable)
- void sendBiomeUpdates(Iterable)
- void dropItem(Vector3, BaseItemStack, int)
- void dropItem(Vector3, BaseItemStack)
- boolean useItem(BlockVector3, BaseItem, Direction)
- int hashCode()
- Set applySideEffects(BlockVector3, BlockState, SideEffectSet) throws WorldEditException
- void setWeather(WeatherType)
- void setWeather(WeatherType, long)
- int getBlockLightLevel(BlockVector3)
- BlockVector3 getSpawnPosition()
- boolean generateTree(TreeGenerator$TreeType, EditSession, BlockVector3) throws MaxChangedBlocksException
- Mask createLiquidMask()
- int getMaxY()
- void simulateBlockMine(BlockVector3)
- boolean canPlaceAt(BlockVector3, BlockState)
- void checkLoadedChunk(BlockVector3)
- boolean regenerate(Region, EditSession)
- boolean regenerate(Region, Extent)
- boolean regenerate(Region, Extent, RegenOptions)
- boolean equals(Object)
- long getRemainingWeatherDuration()
- boolean queueBlockBreakEffect(Platform, BlockVector3, BlockType, double)
- boolean notifyAndLightBlock(BlockVector3, BlockState) throws WorldEditException
- int getMinY()

### Class: com.sk89q.worldedit.world.AbstractWorld
Type: Abstract Class
Implements: com.sk89q.worldedit.world.World

Methods:
- BlockVector3 getMinimumPoint()
- void fixAfterFastMode(Iterable)
- WeatherType getWeather()
- Operation commit()
- boolean setBlock(BlockVector3, BlockStateHolder) throws WorldEditException
- Mask createLiquidMask()
- int getMaxY()
- boolean playEffect(Vector3, int, int)
- Path getStoragePath()
- void fixLighting(Iterable)
- void sendBiomeUpdates(Iterable)
- void dropItem(Vector3, BaseItemStack, int)
- boolean useItem(BlockVector3, BaseItem, Direction)
- void checkLoadedChunk(BlockVector3)
- long getRemainingWeatherDuration()
- BlockVector3 getMaximumPoint()
- void setWeather(WeatherType)
- void setWeather(WeatherType, long)
- boolean queueBlockBreakEffect(Platform, BlockVector3, BlockType, double)
- int getMinY()

### Class: com.sk89q.worldedit.world.DataException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.sk89q.worldedit.world.NullWorld
Type: Class
Extends: com.sk89q.worldedit.world.AbstractWorld

Methods:
- BlockState getBlock(BlockVector3)
- String getName()
- boolean clearContainerBlockContents(BlockVector3)
- WeatherType getWeather()
- boolean setBlock(BlockVector3, BlockStateHolder, SideEffectSet) throws WorldEditException
- Entity createEntity(Location, BaseEntity)
- void simulateBlockMine(BlockVector3)
- void dropItem(Vector3, BaseItemStack)
- BaseBlock getFullBlock(BlockVector3)
- boolean regenerate(Region, Extent, RegenOptions)
- long getRemainingWeatherDuration()
- Set applySideEffects(BlockVector3, BlockState, SideEffectSet) throws WorldEditException
- void setWeather(WeatherType)
- void setWeather(WeatherType, long)
- List getEntities(Region)
- List getEntities()
- int getBlockLightLevel(BlockVector3)
- BlockVector3 getSpawnPosition()
- NullWorld getInstance()
- String id()
- boolean setBiome(BlockVector3, BiomeType)
- boolean generateTree(TreeGenerator$TreeType, EditSession, BlockVector3) throws MaxChangedBlocksException
- boolean fullySupports3DBiomes()
- BiomeType getBiome(BlockVector3)

### Class: com.sk89q.worldedit.world.RegenOptions
Type: Abstract Class

Methods:
- boolean shouldRegenBiomes()
- OptionalLong getSeed()
- RegenOptions$Builder builder()

### Class: com.sk89q.worldedit.world.WorldUnloadedException
Type: Class
Extends: com.sk89q.worldedit.WorldEditException

No public methods found

## Package: com.sk89q.worldedit.world.biome

### Class: com.sk89q.worldedit.world.biome.BiomeData
Type: Interface

Methods:
- String getName()

### Class: com.sk89q.worldedit.world.biome.BiomeCategories
Type: Class

Methods:
- BiomeCategory get(String)

### Class: com.sk89q.worldedit.world.biome.BiomeCategory
Type: Class
Extends: com.sk89q.worldedit.registry.Category
Implements: com.sk89q.worldedit.registry.Keyed

No public methods found

### Class: com.sk89q.worldedit.world.biome.BiomeType
Type: Class
Extends: java.lang.Record
Implements: com.sk89q.worldedit.registry.Keyed, com.sk89q.worldedit.function.pattern.BiomePattern

Methods:
- BiomeType applyBiome(BlockVector3)
- int hashCode()
- boolean equals(Object)
- String toString()
- String id()

### Class: com.sk89q.worldedit.world.biome.BiomeTypes
Type: Class

Methods:
- BiomeType get(String)

### Class: com.sk89q.worldedit.world.biome.Biomes
Type: Class

Methods:
- BiomeType findBiomeByName(Collection, String, BiomeRegistry)

## Package: com.sk89q.worldedit.world.block

### Class: com.sk89q.worldedit.world.block.BlockStateHolder
Type: Interface
Implements: com.sk89q.worldedit.function.pattern.Pattern

Methods:
- BlockStateHolder with(Property, Object)
- Object getState(Property)
- boolean equalsFuzzy(BlockStateHolder)
- BaseBlock applyBlock(BlockVector3)
- String getAsString()
- BaseBlock toBaseBlock()
- BaseBlock toBaseBlock(CompoundTag)
- BaseBlock toBaseBlock(LazyReference)
- BaseBlock toBaseBlock(LinCompoundTag)
- Map getStates()
- BlockState toImmutableState()
- BlockType getBlockType()

### Class: com.sk89q.worldedit.world.block.BaseBlock
Type: Class
Implements: com.sk89q.worldedit.world.block.BlockStateHolder, com.sk89q.worldedit.blocks.TileEntityBlock

Methods:
- boolean equalsFuzzy(BlockStateHolder)
- LazyReference getNbtReference()
- String getAsString()
- BaseBlock toBaseBlock()
- BaseBlock toBaseBlock(LazyReference)
- BaseBlock with(Property, Object)
- BlockStateHolder with(Property, Object)
- Object getState(Property)
- int hashCode()
- boolean equals(Object)
- String toString()
- void setNbtReference(LazyReference)
- Map getStates()
- BlockState toImmutableState()
- String getNbtId()
- BlockType getBlockType()

### Class: com.sk89q.worldedit.world.block.BlockCategories
Type: Class

Methods:
- BlockCategory get(String)

### Class: com.sk89q.worldedit.world.block.BlockCategory
Type: Class
Extends: com.sk89q.worldedit.registry.Category
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- boolean contains(BlockStateHolder)

### Class: com.sk89q.worldedit.world.block.BlockState
Type: Class
Implements: com.sk89q.worldedit.world.block.BlockStateHolder

Methods:
- BlockState with(Property, Object)
- BlockStateHolder with(Property, Object)
- Object getState(Property)
- int hashCode()
- boolean equalsFuzzy(BlockStateHolder)
- boolean equals(Object)
- String toString()
- String getAsString()
- BaseBlock toBaseBlock()
- BaseBlock toBaseBlock(LazyReference)
- Map getStates()
- BlockState toImmutableState()
- BlockType getBlockType()

### Class: com.sk89q.worldedit.world.block.BlockType
Type: Class
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- BlockState getDefaultState()
- Component getRichName()
- int getLegacyData()
- boolean hasItemType()
- List getAllStates()
- Property getProperty(String)
- String getName()
- List getProperties()
- ItemType getItemType()
- int getLegacyId()
- BlockMaterial getMaterial()
- Map getPropertyMap()
- BlockState getState(Map)
- int hashCode()
- boolean equals(Object)
- String toString()
- String id()
- FuzzyBlockState getFuzzyMatcher()

### Class: com.sk89q.worldedit.world.block.BlockTypes
Type: Class

Methods:
- BlockType get(String)

### Class: com.sk89q.worldedit.world.block.FuzzyBlockState
Type: Class
Extends: com.sk89q.worldedit.world.block.BlockState

Methods:
- BlockState getFullState()
- FuzzyBlockState$Builder builder()
- BlockState toImmutableState()

## Package: com.sk89q.worldedit.world.chunk

### Class: com.sk89q.worldedit.world.chunk.Chunk
Type: Interface

Methods:
- BaseBlock getBlock(BlockVector3) throws DataException

### Class: com.sk89q.worldedit.world.chunk.AnvilChunk
Type: Class
Implements: com.sk89q.worldedit.world.chunk.Chunk

Methods:
- BaseBlock getBlock(BlockVector3) throws DataException

### Class: com.sk89q.worldedit.world.chunk.AnvilChunk13
Type: Class
Implements: com.sk89q.worldedit.world.chunk.Chunk

Methods:
- BaseBlock getBlock(BlockVector3) throws DataException

### Class: com.sk89q.worldedit.world.chunk.AnvilChunk16
Type: Class
Extends: com.sk89q.worldedit.world.chunk.AnvilChunk13

No public methods found

### Class: com.sk89q.worldedit.world.chunk.AnvilChunk18
Type: Class
Implements: com.sk89q.worldedit.world.chunk.Chunk

Methods:
- BaseBlock getBlock(BlockVector3) throws DataException

### Class: com.sk89q.worldedit.world.chunk.OldChunk
Type: Class
Implements: com.sk89q.worldedit.world.chunk.Chunk

Methods:
- BaseBlock getBlock(BlockVector3) throws DataException

### Class: com.sk89q.worldedit.world.chunk.PackedIntArrayReader
Type: Class

Methods:
- int get(int)

## Package: com.sk89q.worldedit.world.entity

### Class: com.sk89q.worldedit.world.entity.EntityType
Type: Class
Extends: java.lang.Record
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- String getName()
- int hashCode()
- boolean equals(Object)
- String toString()
- String id()

### Class: com.sk89q.worldedit.world.entity.EntityTypes
Type: Class

Methods:
- EntityType get(String)

## Package: com.sk89q.worldedit.world.fluid

### Class: com.sk89q.worldedit.world.fluid.FluidCategories
Type: Class

Methods:
- FluidCategory get(String)
- FluidCategory register(FluidCategory)

### Class: com.sk89q.worldedit.world.fluid.FluidCategory
Type: Class
Extends: com.sk89q.worldedit.registry.Category
Implements: com.sk89q.worldedit.registry.Keyed

No public methods found

### Class: com.sk89q.worldedit.world.fluid.FluidType
Type: Class
Extends: java.lang.Record
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()
- String id()

### Class: com.sk89q.worldedit.world.fluid.FluidTypes
Type: Class

Methods:
- FluidType get(String)
- FluidType register(FluidType)

## Package: com.sk89q.worldedit.world.gamemode

### Class: com.sk89q.worldedit.world.gamemode.GameMode
Type: Class
Extends: java.lang.Record
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- String getName()
- int hashCode()
- boolean equals(Object)
- String toString()
- String id()

### Class: com.sk89q.worldedit.world.gamemode.GameModes
Type: Class

Methods:
- GameMode get(String)
- GameMode register(GameMode)

## Package: com.sk89q.worldedit.world.generation

### Class: com.sk89q.worldedit.world.generation.ConfiguredFeatureType
Type: Class
Extends: java.lang.Record
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()
- String id()

### Class: com.sk89q.worldedit.world.generation.StructureType
Type: Class
Extends: java.lang.Record
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()
- String id()

## Package: com.sk89q.worldedit.world.item

### Class: com.sk89q.worldedit.world.item.ItemCategories
Type: Class

Methods:
- ItemCategory get(String)

### Class: com.sk89q.worldedit.world.item.ItemCategory
Type: Class
Extends: com.sk89q.worldedit.registry.Category
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- boolean contains(BaseItem)

### Class: com.sk89q.worldedit.world.item.ItemType
Type: Class
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- ItemMaterial getMaterial()
- Component getRichName()
- String getName()
- int hashCode()
- boolean equals(Object)
- String toString()
- String id()
- boolean hasBlockType()
- BlockType getBlockType()

### Class: com.sk89q.worldedit.world.item.ItemTypes
Type: Class

Methods:
- ItemType get(String)

## Package: com.sk89q.worldedit.world.registry

### Class: com.sk89q.worldedit.world.registry.BiomeRegistry
Type: Interface

Methods:
- Component getRichName(BiomeType)
- BiomeData getData(BiomeType)

### Class: com.sk89q.worldedit.world.registry.BlockCategoryRegistry
Type: Interface
Implements: com.sk89q.worldedit.world.registry.CategoryRegistry

No public methods found

### Class: com.sk89q.worldedit.world.registry.BlockMaterial
Type: Interface

Methods:
- boolean hasContainer()
- boolean isReplacedDuringPlacement()
- boolean isOpaque()
- boolean isToolRequired()
- boolean isFullCube()
- boolean isPowerSource()
- boolean isSolid()
- boolean isMovementBlocker()
- boolean isUnpushable()
- boolean isLiquid()
- boolean isFragileWhenPushed()
- float getHardness()
- float getResistance()
- boolean isBurnable()
- int getLightValue()
- boolean isAir()
- float getSlipperiness()
- boolean isTranslucent()
- boolean isTicksRandomly()

### Class: com.sk89q.worldedit.world.registry.BlockRegistry
Type: Interface

Methods:
- BlockMaterial getMaterial(BlockType)
- Component getRichName(BlockType)
- String getName(BlockType)
- OptionalInt getInternalBlockStateId(BlockState)
- Map getProperties(BlockType)

### Class: com.sk89q.worldedit.world.registry.CategoryRegistry
Type: Interface

Methods:
- Set getAll(Category)
- Set getCategorisedByName(String)

### Class: com.sk89q.worldedit.world.registry.EntityRegistry
Type: Interface

Methods:
- BaseEntity createFromId(String)

### Class: com.sk89q.worldedit.world.registry.ItemCategoryRegistry
Type: Interface
Implements: com.sk89q.worldedit.world.registry.CategoryRegistry

No public methods found

### Class: com.sk89q.worldedit.world.registry.ItemMaterial
Type: Interface

Methods:
- int getMaxStackSize()
- int maxStackSize()
- int maxDamage()
- int getMaxDamage()

### Class: com.sk89q.worldedit.world.registry.ItemRegistry
Type: Interface

Methods:
- ItemMaterial getMaterial(ItemType)
- Component getRichName(ItemType)
- Component getRichName(BaseItemStack)
- String getName(ItemType)

### Class: com.sk89q.worldedit.world.registry.Registries
Type: Interface

Methods:
- BlockCategoryRegistry getBlockCategoryRegistry()
- EntityRegistry getEntityRegistry()
- ItemRegistry getItemRegistry()
- BiomeRegistry getBiomeRegistry()
- ItemCategoryRegistry getItemCategoryRegistry()
- BlockRegistry getBlockRegistry()

### Class: com.sk89q.worldedit.world.registry.BundledBlockData
Type: Class

Methods:
- BundledBlockData$BlockEntry findById(String)
- BundledBlockData getInstance()
- BlockMaterial getMaterialById(String)

### Class: com.sk89q.worldedit.world.registry.BundledBlockRegistry
Type: Class
Implements: com.sk89q.worldedit.world.registry.BlockRegistry

Methods:
- BlockMaterial getMaterial(BlockType)
- Component getRichName(BlockType)
- String getName(BlockType)
- OptionalInt getInternalBlockStateId(BlockState)
- Map getProperties(BlockType)

### Class: com.sk89q.worldedit.world.registry.BundledItemData
Type: Class

Methods:
- BundledItemData$ItemEntry findById(String)
- BundledItemData getInstance()
- ItemMaterial getMaterialById(String)

### Class: com.sk89q.worldedit.world.registry.BundledItemRegistry
Type: Class
Implements: com.sk89q.worldedit.world.registry.ItemRegistry

Methods:
- ItemMaterial getMaterial(ItemType)
- Component getRichName(ItemType)
- String getName(ItemType)

### Class: com.sk89q.worldedit.world.registry.BundledRegistries
Type: Class
Implements: com.sk89q.worldedit.world.registry.Registries

Methods:
- BlockCategoryRegistry getBlockCategoryRegistry()
- EntityRegistry getEntityRegistry()
- ItemRegistry getItemRegistry()
- BundledRegistries getInstance()
- BiomeRegistry getBiomeRegistry()
- ItemCategoryRegistry getItemCategoryRegistry()
- BlockRegistry getBlockRegistry()

### Class: com.sk89q.worldedit.world.registry.LegacyMapper
Type: Class

Methods:
- ItemType getItemFromLegacy(int)
- ItemType getItemFromLegacy(int, int)
- int[] getLegacyFromBlock(BlockState)
- BlockState getBlockFromLegacy(int)
- BlockState getBlockFromLegacy(int, int)
- LegacyMapper getInstance()
- int[] getLegacyFromItem(ItemType)

### Class: com.sk89q.worldedit.world.registry.NullBiomeRegistry
Type: Class
Implements: com.sk89q.worldedit.world.registry.BiomeRegistry

Methods:
- Component getRichName(BiomeType)
- BiomeData getData(BiomeType)

### Class: com.sk89q.worldedit.world.registry.NullBlockCategoryRegistry
Type: Class
Implements: com.sk89q.worldedit.world.registry.BlockCategoryRegistry

Methods:
- Set getCategorisedByName(String)

### Class: com.sk89q.worldedit.world.registry.NullEntityRegistry
Type: Class
Implements: com.sk89q.worldedit.world.registry.EntityRegistry

Methods:
- BaseEntity createFromId(String)

### Class: com.sk89q.worldedit.world.registry.NullItemCategoryRegistry
Type: Class
Implements: com.sk89q.worldedit.world.registry.ItemCategoryRegistry

Methods:
- Set getCategorisedByName(String)

### Class: com.sk89q.worldedit.world.registry.PassthroughBlockMaterial
Type: Class
Implements: com.sk89q.worldedit.world.registry.BlockMaterial

Methods:
- boolean hasContainer()
- boolean isReplacedDuringPlacement()
- boolean isOpaque()
- boolean isToolRequired()
- boolean isFullCube()
- boolean isPowerSource()
- boolean isSolid()
- boolean isMovementBlocker()
- boolean isUnpushable()
- boolean isLiquid()
- boolean isFragileWhenPushed()
- float getHardness()
- float getResistance()
- boolean isBurnable()
- int getLightValue()
- boolean isAir()
- float getSlipperiness()
- boolean isTranslucent()
- boolean isTicksRandomly()

### Class: com.sk89q.worldedit.world.registry.PassthroughItemMaterial
Type: Class
Implements: com.sk89q.worldedit.world.registry.ItemMaterial

Methods:
- int maxStackSize()
- int maxDamage()

### Class: com.sk89q.worldedit.world.registry.SimpleItemMaterial
Type: Class
Extends: java.lang.Record
Implements: com.sk89q.worldedit.world.registry.ItemMaterial

Methods:
- int maxStackSize()
- int hashCode()
- int maxDamage()
- boolean equals(Object)
- String toString()

## Package: com.sk89q.worldedit.world.snapshot

### Class: com.sk89q.worldedit.world.snapshot.SnapshotDateParser
Type: Interface

Methods:
- Calendar detectDate(File)

### Class: com.sk89q.worldedit.world.snapshot.InvalidSnapshotException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.sk89q.worldedit.world.snapshot.ModificationTimerParser
Type: Class
Implements: com.sk89q.worldedit.world.snapshot.SnapshotDateParser

Methods:
- Calendar detectDate(File)

### Class: com.sk89q.worldedit.world.snapshot.Snapshot
Type: Class
Implements: java.lang.Comparable

Methods:
- ChunkStore getChunkStore() throws IOException, DataException
- String getName()
- boolean containsWorld(String)
- int hashCode()
- boolean equals(Object)
- void setDate(ZonedDateTime)
- ZonedDateTime getDate()
- int compareTo(Snapshot)
- int compareTo(Object)
- File getFile()

### Class: com.sk89q.worldedit.world.snapshot.SnapshotRepository
Type: Class

Methods:
- List getSnapshots(boolean, String) throws MissingWorldException
- boolean isValidSnapshotName(String)
- Snapshot getSnapshotAfter(ZonedDateTime, String) throws MissingWorldException
- File getDirectory()
- Snapshot getDefaultSnapshot(String) throws MissingWorldException
- Snapshot getSnapshotBefore(ZonedDateTime, String) throws MissingWorldException
- Snapshot getSnapshot(String) throws InvalidSnapshotException

### Class: com.sk89q.worldedit.world.snapshot.SnapshotRestore
Type: Class

Methods:
- int getChunksAffected()
- String getLastErrorMessage()
- List getErrorChunks()
- void restore() throws MaxChangedBlocksException
- boolean hadTotalFailure()
- List getMissingChunks()

### Class: com.sk89q.worldedit.world.snapshot.YYMMDDHHIISSParser
Type: Class
Implements: com.sk89q.worldedit.world.snapshot.SnapshotDateParser

Methods:
- Calendar detectDate(File)

## Package: com.sk89q.worldedit.world.snapshot.experimental

### Class: com.sk89q.worldedit.world.snapshot.experimental.Snapshot
Type: Interface
Implements: java.io.Closeable

Methods:
- SnapshotInfo getInfo()
- Chunk getChunk(BlockVector3) throws DataException, IOException
- void close() throws IOException
- LinCompoundTag getChunkTag(BlockVector3) throws DataException, IOException

### Class: com.sk89q.worldedit.world.snapshot.experimental.SnapshotDatabase
Type: Interface

Methods:
- Stream getSnapshotsOldestFirst(String) throws IOException
- String getScheme()
- Stream getSnapshots(String) throws IOException
- Stream getSnapshotsAfter(String, ZonedDateTime) throws IOException
- Stream getSnapshotsBefore(String, ZonedDateTime) throws IOException
- Stream getSnapshotsNewestFirst(String) throws IOException
- Optional getSnapshot(URI) throws IOException

### Class: com.sk89q.worldedit.world.snapshot.experimental.SnapshotComparator
Type: Class

Methods:
- Comparator getInstance()

### Class: com.sk89q.worldedit.world.snapshot.experimental.SnapshotInfo
Type: Class
Implements: java.lang.Comparable

Methods:
- URI getName()
- ZonedDateTime getDateTime()
- String getDisplayName()
- int hashCode()
- boolean equals(Object)
- SnapshotInfo create(URI, ZonedDateTime)
- String toString()
- int compareTo(SnapshotInfo)
- int compareTo(Object)

### Class: com.sk89q.worldedit.world.snapshot.experimental.SnapshotRestore
Type: Class

Methods:
- int getChunksAffected()
- String getLastErrorMessage()
- List getErrorChunks()
- void restore() throws MaxChangedBlocksException
- boolean hadTotalFailure()
- List getMissingChunks()

## Package: com.sk89q.worldedit.world.snapshot.experimental.fs

### Class: com.sk89q.worldedit.world.snapshot.experimental.fs.FileSystemSnapshotDatabase
Type: Class
Implements: com.sk89q.worldedit.world.snapshot.experimental.SnapshotDatabase

Methods:
- String getScheme()
- ZonedDateTime tryParseDate(Path)
- Stream getSnapshots(String) throws IOException
- URI createUri(String)
- FileSystemSnapshotDatabase maybeCreate(Path, ArchiveNioSupport) throws IOException
- Path getRoot()
- Optional getSnapshot(URI) throws IOException

### Class: com.sk89q.worldedit.world.snapshot.experimental.fs.FolderSnapshot
Type: Class
Implements: com.sk89q.worldedit.world.snapshot.experimental.Snapshot

Methods:
- Path getFolder()
- SnapshotInfo getInfo()
- void close() throws IOException
- LinCompoundTag getChunkTag(BlockVector3) throws DataException, IOException

## Package: com.sk89q.worldedit.world.storage

### Class: com.sk89q.worldedit.world.storage.ChunkStore
Type: Abstract Class
Implements: java.io.Closeable

Methods:
- LinCompoundTag getChunkData(BlockVector2, World) throws DataException, IOException
- BlockVector3 toChunk3d(BlockVector3)
- Chunk getChunk(BlockVector2, World) throws DataException, IOException
- boolean isValid()
- void close() throws IOException
- CompoundTag getChunkTag(BlockVector2, World) throws DataException, IOException
- BlockVector2 toChunk(BlockVector3)

### Class: com.sk89q.worldedit.world.storage.ChunkStoreException
Type: Class
Extends: com.sk89q.worldedit.world.DataException

No public methods found

### Class: com.sk89q.worldedit.world.storage.ChunkStoreHelper
Type: Class

Methods:
- Chunk getChunk(CompoundTag) throws DataException
- Chunk getChunk(LinCompoundTag) throws DataException
- CompoundTag readCompoundTag(ChunkStoreHelper$ChunkDataInputSupplier) throws DataException, IOException

### Class: com.sk89q.worldedit.world.storage.FileLegacyChunkStore
Type: Class
Extends: com.sk89q.worldedit.world.storage.LegacyChunkStore

Methods:
- boolean isValid()

### Class: com.sk89q.worldedit.world.storage.FileMcRegionChunkStore
Type: Class
Extends: com.sk89q.worldedit.world.storage.McRegionChunkStore

Methods:
- boolean isValid()

### Class: com.sk89q.worldedit.world.storage.InvalidFormatException
Type: Class
Extends: com.sk89q.worldedit.world.DataException

No public methods found

### Class: com.sk89q.worldedit.world.storage.LegacyChunkStore
Type: Abstract Class
Extends: com.sk89q.worldedit.world.storage.ChunkStore

Methods:
- LinCompoundTag getChunkData(BlockVector2, World) throws DataException, IOException
- String getFilename(BlockVector2, String)
- String getFilename(BlockVector2)

### Class: com.sk89q.worldedit.world.storage.McRegionChunkStore
Type: Abstract Class
Extends: com.sk89q.worldedit.world.storage.ChunkStore

Methods:
- LinCompoundTag getChunkData(BlockVector2, World) throws DataException, IOException
- String getFilename(BlockVector2)

### Class: com.sk89q.worldedit.world.storage.McRegionReader
Type: Class
Implements: java.io.Closeable

Methods:
- boolean hasChunk(int, int)
- InputStream getChunkInputStream(BlockVector2) throws IOException, DataException
- void close() throws IOException

### Class: com.sk89q.worldedit.world.storage.MissingChunkException
Type: Class
Extends: com.sk89q.worldedit.world.storage.ChunkStoreException

Methods:
- Vector2 getChunkPosition()

### Class: com.sk89q.worldedit.world.storage.MissingWorldException
Type: Class
Extends: com.sk89q.worldedit.world.storage.ChunkStoreException

Methods:
- String getWorldName()

### Class: com.sk89q.worldedit.world.storage.NBTConversions
Type: Class

Methods:
- Location toLocation(Extent, ListTag, ListTag)
- Location toLocation(Extent, LinListTag, LinListTag)

### Class: com.sk89q.worldedit.world.storage.TrueZipLegacyChunkStore
Type: Class
Extends: com.sk89q.worldedit.world.storage.LegacyChunkStore

Methods:
- boolean isValid()
- void close() throws IOException

### Class: com.sk89q.worldedit.world.storage.TrueZipMcRegionChunkStore
Type: Class
Extends: com.sk89q.worldedit.world.storage.McRegionChunkStore

Methods:
- boolean isValid()
- void close() throws IOException

### Class: com.sk89q.worldedit.world.storage.ZippedLegacyChunkStore
Type: Class
Extends: com.sk89q.worldedit.world.storage.LegacyChunkStore

Methods:
- boolean isValid()
- void close() throws IOException

### Class: com.sk89q.worldedit.world.storage.ZippedMcRegionChunkStore
Type: Class
Extends: com.sk89q.worldedit.world.storage.McRegionChunkStore

Methods:
- boolean isValid()
- void close() throws IOException

## Package: com.sk89q.worldedit.world.weather

### Class: com.sk89q.worldedit.world.weather.WeatherType
Type: Class
Extends: java.lang.Record
Implements: com.sk89q.worldedit.registry.Keyed

Methods:
- String getName()
- int hashCode()
- boolean equals(Object)
- String toString()
- String id()

### Class: com.sk89q.worldedit.world.weather.WeatherTypes
Type: Class

Methods:
- WeatherType get(String)
- WeatherType register(WeatherType)

## Package: org.enginehub.linbus.common

### Class: org.enginehub.linbus.common.IOFunction
Type: Interface

Methods:
- Object apply(Object) throws IOException

### Class: org.enginehub.linbus.common.LinTagId
Type: Enum
Extends: java.lang.Enum

Methods:
- LinTagId valueOf(String)
- LinTagId[] values()
- String toString()
- int id()
- LinTagId fromId(int)

## Package: org.enginehub.linbus.common.internal

### Class: org.enginehub.linbus.common.internal.AbstractIterator
Type: Abstract Class
Implements: java.util.Iterator

Methods:
- Object next()
- boolean hasNext()
- void forEachRemaining(Consumer)
- void remove()

## Package: org.enginehub.linbus.format.snbt

### Class: org.enginehub.linbus.format.snbt.LinStringIO
Type: Class

Methods:
- Object readFromStringUsing(String, IOFunction)
- String writeToString(LinStreamable)
- LinStream read(Reader)
- Object readUsing(Reader, IOFunction) throws IOException
- LinStream readFromString(String)
- void write(Appendable, LinStreamable) throws IOException

## Package: org.enginehub.linbus.format.snbt.impl

### Class: org.enginehub.linbus.format.snbt.impl.Elusion
Type: Class

Methods:
- CharSequence escapeIfNeeded(String)
- boolean isSafeCharacter(char)

### Class: org.enginehub.linbus.format.snbt.impl.LinSnbtWriter
Type: Class

Methods:
- void write(Appendable, LinStream) throws IOException

## Package: org.enginehub.linbus.format.snbt.impl.reader

### Class: org.enginehub.linbus.format.snbt.impl.reader.SnbtToken
Type: Interface

No public methods found

### Class: org.enginehub.linbus.format.snbt.impl.reader.LinSnbtReader
Type: Class
Implements: org.enginehub.linbus.stream.LinStream

Methods:
- LinToken nextOrNull()

### Class: org.enginehub.linbus.format.snbt.impl.reader.LinSnbtTokenizer
Type: Class
Extends: org.enginehub.linbus.common.internal.AbstractIterator

No public methods found

### Class: org.enginehub.linbus.format.snbt.impl.reader.SnbtTokenWithMetadata
Type: Class
Extends: java.lang.Record

Methods:
- int charIndex()
- int hashCode()
- boolean equals(Object)
- String toString()
- SnbtToken token()

## Package: org.enginehub.linbus.stream

### Class: org.enginehub.linbus.stream.LinStream
Type: Interface
Implements: org.enginehub.linbus.stream.LinStreamable

Methods:
- LinStream linStream()
- Optional next() throws IOException
- LinToken nextOrNull() throws IOException
- LinStream of()
- LinStream of(LinToken)
- LinStream of(LinToken[])
- Iterator asIterator()
- LinStream calculateOptionalInfo()

### Class: org.enginehub.linbus.stream.LinStreamable
Type: Interface

Methods:
- LinStream linStream()

### Class: org.enginehub.linbus.stream.LinBinaryIO
Type: Class

Methods:
- LinStream read(DataInput)
- LinStream read(DataInput, LinReadOptions)
- Object readUsing(DataInput, IOFunction) throws IOException
- Object readUsing(DataInput, LinReadOptions, IOFunction) throws IOException
- void write(DataOutput, LinStreamable) throws IOException

### Class: org.enginehub.linbus.stream.LinReadOptions
Type: Class

Methods:
- LinReadOptions$Builder builder()
- String toString()
- boolean allowNormalUtf8Encoding()

## Package: org.enginehub.linbus.stream.exception

### Class: org.enginehub.linbus.stream.exception.NbtParseException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: org.enginehub.linbus.stream.exception.NbtWriteException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: org.enginehub.linbus.stream.impl

### Class: org.enginehub.linbus.stream.impl.LinNbtReader
Type: Class
Implements: org.enginehub.linbus.stream.LinStream

Methods:
- LinToken nextOrNull() throws IOException

### Class: org.enginehub.linbus.stream.impl.OptionalInfoCalculator
Type: Class
Implements: org.enginehub.linbus.stream.LinStream

Methods:
- LinToken nextOrNull() throws IOException
- LinStream calculateOptionalInfo()

### Class: org.enginehub.linbus.stream.impl.ValueCounter
Type: Class

Methods:
- void add(LinToken)
- boolean isNested()
- int count()

## Package: org.enginehub.linbus.stream.internal

### Class: org.enginehub.linbus.stream.internal.FlatteningLinStream
Type: Class
Implements: org.enginehub.linbus.stream.LinStream

Methods:
- LinToken nextOrNull() throws IOException

### Class: org.enginehub.linbus.stream.internal.SurroundingLinStream
Type: Class
Implements: org.enginehub.linbus.stream.LinStream

Methods:
- LinToken nextOrNull() throws IOException

## Package: org.enginehub.linbus.stream.token

### Class: org.enginehub.linbus.stream.token.LinToken
Type: Interface

Methods:
- Optional tagId()
- boolean isSimpleValue()

## Package: org.enginehub.linbus.tree

### Class: org.enginehub.linbus.tree.ToLinTag
Type: Interface

Methods:
- LinTag toLinTag()

### Class: org.enginehub.linbus.tree.LinByteArrayTag
Type: Class
Extends: org.enginehub.linbus.tree.LinTag

Methods:
- LinStream linStream()
- ByteBuffer view()
- int hashCode()
- boolean equals(Object)
- LinByteArrayTag of(byte[])
- String toString()
- LinTagType type()
- byte[] value()
- Object value()

### Class: org.enginehub.linbus.tree.LinByteTag
Type: Class
Extends: org.enginehub.linbus.tree.LinNumberTag

Methods:
- LinStream linStream()
- byte valueAsByte()
- LinByteTag of(byte)
- LinByteTag fromInt(int)
- LinTagType type()
- Byte value()
- Object value()

### Class: org.enginehub.linbus.tree.LinCompoundTag
Type: Class
Extends: org.enginehub.linbus.tree.LinTag

Methods:
- LinStream linStream()
- LinCompoundTag$Builder toBuilder()
- LinListTag getListTag(String, LinTagType)
- LinTag findTag(String, LinTagType)
- LinCompoundTag readFrom(LinStream) throws IOException
- LinCompoundTag of(Map)
- LinCompoundTag$Builder builder()
- String toString()
- LinTag getTag(String, LinTagType)
- LinTagType type()
- Map value()
- Object value()
- LinListTag findListTag(String, LinTagType)

### Class: org.enginehub.linbus.tree.LinDoubleTag
Type: Class
Extends: org.enginehub.linbus.tree.LinNumberTag

Methods:
- LinStream linStream()
- double valueAsDouble()
- LinDoubleTag of(double)
- LinTagType type()
- Double value()
- Object value()

### Class: org.enginehub.linbus.tree.LinEndTag
Type: Class
Extends: org.enginehub.linbus.tree.LinTag

Methods:
- LinStream linStream()
- LinEndTag instance()
- int hashCode()
- String toString()
- LinTagType type()
- Void value()
- Object value()

### Class: org.enginehub.linbus.tree.LinFloatTag
Type: Class
Extends: org.enginehub.linbus.tree.LinNumberTag

Methods:
- LinStream linStream()
- LinFloatTag of(float)
- float valueAsFloat()
- LinTagType type()
- Float value()
- Object value()

### Class: org.enginehub.linbus.tree.LinIntArrayTag
Type: Class
Extends: org.enginehub.linbus.tree.LinTag

Methods:
- LinStream linStream()
- IntBuffer view()
- int hashCode()
- boolean equals(Object)
- LinIntArrayTag of(int[])
- String toString()
- LinTagType type()
- int[] value()
- Object value()

### Class: org.enginehub.linbus.tree.LinIntTag
Type: Class
Extends: org.enginehub.linbus.tree.LinNumberTag

Methods:
- LinStream linStream()
- LinIntTag of(int)
- LinTagType type()
- Integer value()
- Object value()
- int valueAsInt()

### Class: org.enginehub.linbus.tree.LinListTag
Type: Class
Extends: org.enginehub.linbus.tree.LinTag

Methods:
- LinStream linStream()
- LinListTag$Builder toBuilder()
- LinTag get(int)
- LinListTag of(LinTagType, List)
- LinListTag$Builder builder(LinTagType)
- LinListTag asTypeChecked(LinTagType)
- String toString()
- LinTagType type()
- List value()
- Object value()
- LinTagType elementType()
- LinListTag empty(LinTagType)

### Class: org.enginehub.linbus.tree.LinLongArrayTag
Type: Class
Extends: org.enginehub.linbus.tree.LinTag

Methods:
- LinStream linStream()
- LongBuffer view()
- int hashCode()
- boolean equals(Object)
- LinLongArrayTag of(long[])
- String toString()
- LinTagType type()
- long[] value()
- Object value()

### Class: org.enginehub.linbus.tree.LinLongTag
Type: Class
Extends: org.enginehub.linbus.tree.LinNumberTag

Methods:
- LinStream linStream()
- long valueAsLong()
- LinLongTag of(long)
- LinTagType type()
- Long value()
- Object value()

### Class: org.enginehub.linbus.tree.LinNumberTag
Type: Abstract Class
Extends: org.enginehub.linbus.tree.LinTag

No public methods found

### Class: org.enginehub.linbus.tree.LinRootEntry
Type: Class
Extends: java.lang.Record
Implements: org.enginehub.linbus.tree.ToLinTag, org.enginehub.linbus.stream.LinStreamable

Methods:
- LinStream linStream()
- LinCompoundTag toLinTag()
- LinTag toLinTag()
- LinRootEntry readFrom(LinStream) throws IOException
- int hashCode()
- boolean equals(Object)
- String name()
- String toString()
- LinCompoundTag value()
- byte[] writeToArray()

### Class: org.enginehub.linbus.tree.LinShortTag
Type: Class
Extends: org.enginehub.linbus.tree.LinNumberTag

Methods:
- LinStream linStream()
- short valueAsShort()
- LinShortTag of(short)
- LinTagType type()
- Short value()
- Object value()

### Class: org.enginehub.linbus.tree.LinStringTag
Type: Class
Extends: org.enginehub.linbus.tree.LinTag

Methods:
- LinStream linStream()
- LinStringTag of(String)
- LinTagType type()
- String value()
- Object value()

### Class: org.enginehub.linbus.tree.LinTag
Type: Abstract Class
Implements: org.enginehub.linbus.tree.ToLinTag, org.enginehub.linbus.stream.LinStreamable

Methods:
- LinTag toLinTag()
- int hashCode()
- boolean equals(Object)
- String toString()
- LinTagType type()
- Object value()

### Class: org.enginehub.linbus.tree.LinTagType
Type: Class

Methods:
- LinTagType longArrayTag()
- LinTagType byteArrayTag()
- LinTagType listTag()
- LinTagType compoundTag()
- LinTagType endTag()
- LinTagType shortTag()
- LinTagType fromId(LinTagId)
- LinTag cast(LinTag)
- LinTagType floatTag()
- int hashCode()
- LinTagType longTag()
- String name()
- LinTagType intArrayTag()
- String toString()
- LinTagId id()
- LinTagType doubleTag()
- LinTagType intTag()
- LinTagType byteTag()
- LinTagType stringTag()

## Package: org.enginehub.linbus.tree.impl

### Class: org.enginehub.linbus.tree.impl.LinTagReader
Type: Class

Methods:
- LinRootEntry readRoot(LinStream) throws IOException
- LinCompoundTag readCompound(LinStream) throws IOException

## Package: org.enginehub.piston

### Class: org.enginehub.piston.ArgBinding
Type: Interface

Methods:
- boolean isExactMatch(CommandPart)
- String getInput()
- ImmutableSet getParts()

### Class: org.enginehub.piston.Command
Type: Interface

Methods:
- Command$Builder toBuilder()
- ImmutableList getAliases()
- Command$Condition getCondition()
- String getName()
- SuggestionProvider getSuggester()
- Optional getFooter()
- Command$Action getAction()
- Component getFullHelp()
- Component getDescription()
- Component getUsage()
- ImmutableList getParts()

### Class: org.enginehub.piston.CommandManager
Type: Interface
Implements: org.enginehub.piston.converter.ArgumentConverterStore

Methods:
- ImmutableSet getSuggestions(InjectedValueAccess, List)
- Command$Builder newCommand(String)
- Optional getCommand(String)
- boolean containsCommand(String)
- CommandParseResult parse(InjectedValueAccess, List)
- Stream getAllCommands()
- int execute(InjectedValueAccess, List)
- void registerManager(CommandManager)
- void register(Command)
- void register(String, Consumer)

### Class: org.enginehub.piston.CommandManagerService
Type: Interface

Methods:
- Command$Builder newCommand(String)
- CommandManager newCommandManager()
- String id()

### Class: org.enginehub.piston.CommandMetadata
Type: Interface

Methods:
- ImmutableList getArguments()
- String getCalledName()

### Class: org.enginehub.piston.CommandParameters
Type: Interface
Implements: org.enginehub.piston.inject.InjectedValueAccess

Methods:
- CommandMetadata getMetadata()
- ArgumentConverterAccess getConverters()
- CommandValue valueOf(ArgAcceptingCommandPart)
- boolean has(CommandPart)

### Class: org.enginehub.piston.CommandParseResult
Type: Interface

Methods:
- Command getPrimaryCommand()
- ImmutableList getExecutionPath()
- CommandParameters getParameters()
- ImmutableList getBoundArguments()
- List getOriginalArguments()

### Class: org.enginehub.piston.CommandValue
Type: Interface

Methods:
- ImmutableList asStrings()
- Object asSingle(Class)
- Object asSingle(Key)
- ImmutableList asMultiple(Class)
- ImmutableList asMultiple(Key)
- String asString()

### Class: org.enginehub.piston.DefaultCommandManagerService
Type: Class
Implements: org.enginehub.piston.CommandManagerService

Methods:
- void setDefaultService(CommandManagerService)
- Command$Builder newCommand(String)
- CommandManager newCommandManager()
- String id()
- DefaultCommandManagerService getInstance()

### Class: org.enginehub.piston.NoInputCommandParameters
Type: Abstract Class
Implements: org.enginehub.piston.CommandParameters

Methods:
- Optional injectedValue(Key, InjectedValueAccess)
- CommandMetadata getMetadata()
- ArgumentConverterAccess getConverters()
- CommandValue valueOf(ArgAcceptingCommandPart)
- NoInputCommandParameters$Builder builder()
- boolean has(CommandPart)

## Package: org.enginehub.piston.config

### Class: org.enginehub.piston.config.ColorConfig
Type: Class
Extends: org.enginehub.piston.config.Config

Methods:
- ColorConfig helpText()
- ColorConfig partWrapping()
- ColorConfig textModifier()
- ColorConfig mainText()
- Component wrap(String)
- Component wrap(Component[])
- Component wrap(List)
- ColorConfig value(TextColor)
- Config value(Object)

### Class: org.enginehub.piston.config.Config
Type: Abstract Class

Methods:
- Object getValue()
- String getKey()
- void setValue(Object)
- Config value(Object)
- Component value()

### Class: org.enginehub.piston.config.ConfigHolder
Type: Class

Methods:
- void addConfig(Config)
- Map getConfigs()
- Component replace(Component)
- ConfigHolder create()
- Config getConfig(Config)

### Class: org.enginehub.piston.config.ConfigRenderer
Type: Class
Implements: com.sk89q.worldedit.util.formatting.text.renderer.ComponentRenderer

Methods:
- ConfigRenderer getInstance()
- Component render(Component, ConfigHolder)
- Component render(Component, Object)

### Class: org.enginehub.piston.config.TextConfig
Type: Class
Extends: org.enginehub.piston.config.Config

Methods:
- Component commandPrefixValue()
- TextConfig commandPrefix()
- TextConfig value(String)
- Config value(Object)

## Package: org.enginehub.piston.converter

### Class: org.enginehub.piston.converter.ArgumentConverter
Type: Interface
Implements: org.enginehub.piston.converter.Converter, org.enginehub.piston.converter.SuggestionProvider

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()

### Class: org.enginehub.piston.converter.ArgumentConverterAccess
Type: Interface

Methods:
- Set keySet()
- Optional getConverter(Key)

### Class: org.enginehub.piston.converter.ArgumentConverterStore
Type: Interface
Implements: org.enginehub.piston.converter.ArgumentConverterAccess

Methods:
- void registerConverters(ArgumentConverterAccess)
- void registerConverter(Key, ArgumentConverter)

### Class: org.enginehub.piston.converter.Converter
Type: Interface

Methods:
- ConversionResult convert(String, InjectedValueAccess)

### Class: org.enginehub.piston.converter.SuggestionProvider
Type: Interface

Methods:
- List getSuggestions(String, InjectedValueAccess)

### Class: org.enginehub.piston.converter.ArgumentConverters
Type: Class

Methods:
- ArgumentConverter get(TypeToken)
- ArgumentConverter forString()

### Class: org.enginehub.piston.converter.ConversionResult
Type: Abstract Class

Methods:
- ConversionResult failureAsAny()
- boolean isSuccessful()
- Collection get()
- ConversionResult mapSingle(Function)
- ConversionResult map(Function)
- ConversionResult orElse(ConversionResult)
- Collection orElse(Collection)

### Class: org.enginehub.piston.converter.FailedConversion
Type: Class
Extends: org.enginehub.piston.converter.ConversionResult

Methods:
- Throwable getError()
- ConversionResult failureAsAny()
- boolean isSuccessful()
- int hashCode()
- boolean equals(Object)
- Collection get()
- FailedConversion from(Throwable)
- FailedConversion from(Throwable, Collection)
- ImmutableSet getOtherFailures()
- ConversionResult map(Function)
- ConversionResult orElse(ConversionResult)

### Class: org.enginehub.piston.converter.FailedConversionMapper
Type: Class

Methods:
- Throwable mapOnto(Supplier, FailedConversion)

### Class: org.enginehub.piston.converter.ForwardingArgumentConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- ConversionResult convert(String, InjectedValueAccess)

### Class: org.enginehub.piston.converter.MapArgumentConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- MapArgumentConverter forChoices(Set)
- Component describeAcceptableArguments()
- MapArgumentConverter from(Map)
- ConversionResult convert(String, InjectedValueAccess)

### Class: org.enginehub.piston.converter.MultiKeyConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- List getSuggestions(String, InjectedValueAccess)
- Component describeAcceptableArguments()
- MultiKeyConverter$Builder builder(SetMultimap)
- MultiKeyConverter$Builder builder(Collection, Function)
- MultiKeyConverter from(SetMultimap)
- MultiKeyConverter from(Collection, Function)
- MultiKeyConverter from(SetMultimap, Object)
- MultiKeyConverter from(Collection, Function, Object)
- ConversionResult convert(String, InjectedValueAccess)

### Class: org.enginehub.piston.converter.SimpleArgumentConverter
Type: Class
Implements: org.enginehub.piston.converter.ArgumentConverter

Methods:
- ArgumentConverter withSuggestions(SuggestionProvider)
- Component describeAcceptableArguments()
- SimpleArgumentConverter from(Converter, String)
- SimpleArgumentConverter from(Converter, Component)
- ConversionResult convert(String, InjectedValueAccess)

### Class: org.enginehub.piston.converter.SuccessfulConversion
Type: Class
Extends: org.enginehub.piston.converter.ConversionResult

Methods:
- ConversionResult failureAsAny()
- boolean isExactMatch()
- SuccessfulConversion fromSingle(Object)
- SuccessfulConversion fromSingle(Object, boolean)
- boolean isSuccessful()
- int hashCode()
- boolean equals(Object)
- Collection get()
- SuccessfulConversion from(Collection)
- SuccessfulConversion from(Collection, boolean)
- ConversionResult map(Function)
- ConversionResult orElse(ConversionResult)

### Class: org.enginehub.piston.converter.SuggestionHelper
Type: Class

Methods:
- Predicate byPrefix(String)
- List limitByPrefix(Stream, String)

## Package: org.enginehub.piston.exception

### Class: org.enginehub.piston.exception.CommandException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- Component getRichMessage()
- ImmutableList getCommands()

### Class: org.enginehub.piston.exception.CommandExecutionException
Type: Class
Extends: org.enginehub.piston.exception.CommandException

No public methods found

### Class: org.enginehub.piston.exception.ConditionFailedException
Type: Class
Extends: org.enginehub.piston.exception.CommandException

Methods:
- Command$Condition getCondition()

### Class: org.enginehub.piston.exception.ConversionFailedException
Type: Class
Extends: org.enginehub.piston.exception.UsageException

Methods:
- Stream getAllErrors()
- FailedConversion getConversion()
- ArgumentConverter getConverter()

### Class: org.enginehub.piston.exception.NoSuchCommandException
Type: Class
Extends: org.enginehub.piston.exception.CommandException

Methods:
- String getRequestedCommand()

### Class: org.enginehub.piston.exception.NoSuchFlagException
Type: Class
Extends: org.enginehub.piston.exception.UsageException

Methods:
- char getRequestedFlag()

### Class: org.enginehub.piston.exception.StopExecutionException
Type: Class
Extends: org.enginehub.piston.exception.CommandException

No public methods found

### Class: org.enginehub.piston.exception.UsageException
Type: Class
Extends: org.enginehub.piston.exception.CommandException

Methods:
- CommandParseResult getCommandParseResult()

## Package: org.enginehub.piston.gen

### Class: org.enginehub.piston.gen.CommandCallListener
Type: Interface

Methods:
- void afterCall(Method, CommandParameters)
- void afterThrow(Method, CommandParameters, Throwable)
- void beforeCall(Method, CommandParameters)

### Class: org.enginehub.piston.gen.CommandConditionGenerator
Type: Interface

Methods:
- Command$Condition generateCondition(Method)

### Class: org.enginehub.piston.gen.CommandRegistration
Type: Interface

Methods:
- CommandRegistration listeners(Collection)
- CommandRegistration containerInstance(Object)
- void build()
- CommandRegistration commandManager(CommandManager)

## Package: org.enginehub.piston.impl

### Class: org.enginehub.piston.impl.CommandManagerImpl
Type: Class
Implements: org.enginehub.piston.CommandManager

Methods:
- ImmutableSet getSuggestions(InjectedValueAccess, List)
- Command$Builder newCommand(String)
- Optional getCommand(String)
- void registerConverter(Key, ArgumentConverter)
- CommandParseResult parse(InjectedValueAccess, List)
- Stream getAllCommands()
- Set keySet()
- Optional getConverter(Key)
- void register(Command)

### Class: org.enginehub.piston.impl.CommandManagerServiceImpl
Type: Class
Implements: org.enginehub.piston.CommandManagerService

Methods:
- Command$Builder newCommand(String)
- CommandManager newCommandManager()
- String id()

### Class: org.enginehub.piston.impl.LogManagerCompat
Type: Class

Methods:
- Logger getLogger()

## Package: org.enginehub.piston.inject

### Class: org.enginehub.piston.inject.InjectAnnotation
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.enginehub.piston.inject.InjectedValueAccess
Type: Interface

Methods:
- Optional injectedValue(Key)
- Optional injectedValue(Key, InjectedValueAccess)

### Class: org.enginehub.piston.inject.InjectedValueStore
Type: Interface
Implements: org.enginehub.piston.inject.InjectedValueAccess

Methods:
- void injectValue(Key, ValueProvider)

### Class: org.enginehub.piston.inject.ForwardingValueStore
Type: Class
Implements: org.enginehub.piston.inject.InjectedValueStore

Methods:
- Optional injectedValue(Key, InjectedValueAccess)
- void injectValue(Key, ValueProvider)

### Class: org.enginehub.piston.inject.Key
Type: Abstract Class

Methods:
- Annotation getAnnotation()
- Class getAnnotationType()
- Key of(Class)
- Key of(TypeToken)
- Key of(Class, Annotation)
- Key of(Class, Class)
- Key of(TypeToken, Annotation)
- Key of(TypeToken, Class)
- String toString()
- TypeToken getTypeToken()

### Class: org.enginehub.piston.inject.MapBackedValueStore
Type: Class
Implements: org.enginehub.piston.inject.InjectedValueStore

Methods:
- Optional injectedValue(Key, InjectedValueAccess)
- MapBackedValueStore create()
- MapBackedValueStore create(Map)
- void injectValue(Key, ValueProvider)

### Class: org.enginehub.piston.inject.MemoizingValueAccess
Type: Class
Implements: org.enginehub.piston.inject.InjectedValueAccess

Methods:
- Optional injectedValue(Key, InjectedValueAccess)
- InjectedValueAccess snapshotMemory()
- MemoizingValueAccess wrap(InjectedValueAccess)

### Class: org.enginehub.piston.inject.MergedValueAccess
Type: Class
Implements: org.enginehub.piston.inject.InjectedValueAccess

Methods:
- Optional injectedValue(Key, InjectedValueAccess)
- MergedValueAccess of(InjectedValueAccess[])
- MergedValueAccess of(Collection)

## Package: org.enginehub.piston.internal

### Class: org.enginehub.piston.internal.RegistrationUtil
Type: Class

Methods:
- void listenersAfterCall(List, Method, CommandParameters)
- Method getCommandMethod(Class, String, Class[])
- Object requireOptional(Key, String, Optional)
- void listenersBeforeCall(List, Method, CommandParameters)
- void listenersAfterThrow(List, Method, CommandParameters, Throwable)

## Package: org.enginehub.piston.part

### Class: org.enginehub.piston.part.ArgAcceptingCommandPart
Type: Interface
Implements: org.enginehub.piston.part.ArgConsumingCommandPart

Methods:
- ImmutableList getDefaults()
- ImmutableSet getTypes()
- CommandValue value(CommandParameters)

### Class: org.enginehub.piston.part.ArgConsumingCommandPart
Type: Interface
Implements: org.enginehub.piston.part.CommandPart

Methods:
- TranslatableComponent getArgumentName()

### Class: org.enginehub.piston.part.CommandFlag
Type: Interface
Implements: org.enginehub.piston.part.CommandPart

Methods:
- boolean isRequired()
- char getName()

### Class: org.enginehub.piston.part.CommandPart
Type: Interface

Methods:
- boolean isRequired()
- boolean in(CommandParameters)
- Component getDescription()
- Component getTextRepresentation()

### Class: org.enginehub.piston.part.ArgAcceptingCommandFlag
Type: Abstract Class
Implements: org.enginehub.piston.part.CommandFlag, org.enginehub.piston.part.ArgAcceptingCommandPart

Methods:
- ArgAcceptingCommandFlag$Builder builder(char, Component)
- Component getTextRepresentation()

### Class: org.enginehub.piston.part.CommandArgument
Type: Abstract Class
Implements: org.enginehub.piston.part.ArgAcceptingCommandPart

Methods:
- boolean isRequired()
- CommandArgument$Builder builder(TranslatableComponent, Component)
- boolean isVariable()
- Component getTextRepresentation()

### Class: org.enginehub.piston.part.CommandParts
Type: Class

Methods:
- NoArgCommandFlag$Builder flag(char, Component)
- CommandArgument$Builder arg(TranslatableComponent, Component)

### Class: org.enginehub.piston.part.NoArgCommandFlag
Type: Abstract Class
Implements: org.enginehub.piston.part.CommandFlag

Methods:
- NoArgCommandFlag$Builder builder(char, String)
- NoArgCommandFlag$Builder builder(char, Component)
- Component getTextRepresentation()

### Class: org.enginehub.piston.part.SubCommandPart
Type: Abstract Class
Implements: org.enginehub.piston.part.ArgConsumingCommandPart

Methods:
- SubCommandPart$Builder builder(TranslatableComponent, Component)
- Component getTextRepresentation()
- ImmutableList getCommands()

## Package: org.enginehub.piston.suggestion

### Class: org.enginehub.piston.suggestion.SuggestionProvider
Type: Interface

Methods:
- ImmutableSet provideSuggestions(List, CommandParseResult)

### Class: org.enginehub.piston.suggestion.DefaultSuggestionProvider
Type: Class
Implements: org.enginehub.piston.suggestion.SuggestionProvider

Methods:
- ImmutableSet provideSuggestions(List, CommandParseResult)
- SuggestionProvider getInstance()

### Class: org.enginehub.piston.suggestion.Suggestion
Type: Abstract Class

Methods:
- Suggestion$Builder toBuilder()
- Suggestion$Builder builder()
- String getSuggestion()
- int getReplacedArgument()

## Package: org.enginehub.piston.util

### Class: org.enginehub.piston.util.NonnullByDefault
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.enginehub.piston.util.ValueProvider
Type: Interface

Methods:
- ValueProvider constant(Object)
- Optional value(Object)

### Class: org.enginehub.piston.util.CaseHelper
Type: Class

Methods:
- String camelToTitle(String)
- String titleToSpacedLower(String)
- String titleToCamel(String)

### Class: org.enginehub.piston.util.ComponentHelper
Type: Class

Methods:
- Collector joiningWithBar()
- Collector joiningTexts(Component, Component, Component)

### Class: org.enginehub.piston.util.HelpGenerator
Type: Class

Methods:
- HelpGenerator create(Iterable)
- HelpGenerator create(CommandParseResult)
- Component getFullHelp()
- Component getFullName()
- Component getUsage()

### Class: org.enginehub.piston.util.PartHelper
Type: Class

Methods:
- void appendUsage(Stream, TextComponent$Builder)

### Class: org.enginehub.piston.util.StreamHelper
Type: Class

Methods:
- Stream cast(Stream, Class)

### Class: org.enginehub.piston.util.TextHelper
Type: Class

Methods:
- String reduceToText(Component)

