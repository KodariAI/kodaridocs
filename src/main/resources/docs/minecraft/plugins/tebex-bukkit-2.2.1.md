# tebex-bukkit-2.2.1 API Reference

## Package: io.tebex.plugin

### Class: io.tebex.plugin.TebexPlugin
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin
Implements: io.tebex.sdk.platform.Platform

Methods:
- String getStoreType()
- Player getPlayer(Object)
- void migrateConfig()
- ServerInformation$Store getStore()
- void log(Level, String)
- ServerInformation$Server getStoreServer()
- void onEnable()
- SDK getSDK()
- String getServerIp()
- void setSetup(boolean)
- List<Category> getStoreCategories()
- int getFreeSlots(Object)
- V registerEvents(T)
- V setStoreCategories(List<Category>)
- void executeAsync(Runnable)
- PlaceholderManager getPlaceholderManager()
- boolean isSetup()
- String getVersion()
- boolean isOnlineMode()
- void executeAsyncLater(Runnable, long, TimeUnit)
- ServerInformation getStoreInformation()
- void setBuyGUI(BuyGUI)
- void configure()
- CommandResult dispatchCommand(String)
- void halt()
- BuyGUI getBuyGUI()
- List<ServerEvent> getServerEvents()
- PlatformTelemetry getTelemetry()
- ServerPlatformConfig getPlatformConfig()
- IPlatformConfig getPlatformConfig()
- void registerBuyCommand()
- boolean isPlayerOnline(Object)
- PlatformType getType()
- void setStoreInfo(ServerInformation)
- void executeBlockingLater(Runnable, long, TimeUnit)
- File getDirectory()
- void executeBlocking(Runnable)
- Map<Object, Integer> getQueuedPlayers()

## Package: io.tebex.plugin.command

### Class: io.tebex.plugin.command.BuyCommand
Type: Class
Extends: org.bukkit.command.Command

Methods:
- boolean execute(CommandSender, String, String[])

### Class: io.tebex.plugin.command.SubCommand
Type: Abstract Class

Methods:
- String getPermission()
- String getName()
- String getDescription()
- void execute(CommandSender, String[])
- TebexPlugin getPlatform()
- String getUsage()

### Class: io.tebex.plugin.command.TebexCommand
Type: Class
Implements: org.bukkit.command.TabExecutor

Methods:
- boolean onCommand(CommandSender, Command, String, String[])
- List<String> onTabComplete(CommandSender, Command, String, String)

## Package: io.tebex.plugin.command.sub

### Class: io.tebex.plugin.command.sub.BanCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])
- String getUsage()

### Class: io.tebex.plugin.command.sub.CheckoutCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])
- String getUsage()

### Class: io.tebex.plugin.command.sub.DebugCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])
- String getUsage()

### Class: io.tebex.plugin.command.sub.ForceCheckCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])

### Class: io.tebex.plugin.command.sub.GoalsCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])

### Class: io.tebex.plugin.command.sub.HelpCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])

### Class: io.tebex.plugin.command.sub.InfoCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])

### Class: io.tebex.plugin.command.sub.LookupCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])
- String getUsage()

### Class: io.tebex.plugin.command.sub.ReloadCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])

### Class: io.tebex.plugin.command.sub.ReportCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])
- String getUsage()

### Class: io.tebex.plugin.command.sub.SecretCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])
- String getUsage()

### Class: io.tebex.plugin.command.sub.SendLinkCommand
Type: Class
Extends: io.tebex.plugin.command.SubCommand

Methods:
- String getDescription()
- void execute(CommandSender, String[])
- String getUsage()

## Package: io.tebex.plugin.event

### Class: io.tebex.plugin.event.InventoryClickListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onInventoryClick(InventoryClickEvent)

### Class: io.tebex.plugin.event.JoinListener
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void onPlayerJoin(PlayerJoinEvent)

## Package: io.tebex.plugin.gui

### Class: io.tebex.plugin.gui.TebexGuiAction
Type: Interface

Methods:
- V execute(T)

### Class: io.tebex.plugin.gui.BuyGUI
Type: Class

Methods:
- void open(Player)

### Class: io.tebex.plugin.gui.ListingGui
Type: Class
Implements: org.bukkit.inventory.InventoryHolder

Methods:
- void addItem(TebexGuiItem)
- void addItem(int, TebexGuiItem)
- ListingGui lore(ArrayList<String>)
- ListingGui create()
- TebexGuiItem getItemInSlot(int)
- int getRows()
- Inventory getInventory()
- ListingGui rows(int)
- ListingGui title(String)
- void updateTitle(String)
- void setItem(int, TebexGuiItem)
- void open(Player)

### Class: io.tebex.plugin.gui.TebexGuiItem
Type: Class

Methods:
- TebexGuiAction<InventoryClickEvent> getAction()
- String toString()
- ItemStack getStack()

### Class: io.tebex.plugin.gui.TebexItemBuilder
Type: Class

Methods:
- TebexItemBuilder lore(List<String>)
- void enchant()
- TebexItemBuilder name(String)
- TebexItemBuilder flags(ItemFlag[])
- **static** TebexItemBuilder from(Material)
- ItemStack buildItemStack()
- TebexGuiItem asGuiItem(TebexGuiAction<InventoryClickEvent>)

## Package: io.tebex.plugin.libs.boostedyaml

### Class: io.tebex.plugin.libs.boostedyaml.YamlDocument
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.block.implementation.Section

Methods:
- GeneralSettings getGeneralSettings()
- LoaderSettings getLoaderSettings()
- void setGeneralSettings(GeneralSettings)
- boolean isRoot()
- DumperSettings getDumperSettings()
- boolean save() throws IOException
- void save(File) throws IOException
- void save(OutputStream, Charset) throws IOException
- void save(OutputStreamWriter) throws IOException
- YamlDocument getDefaults()
- Section getDefaults()
- boolean update() throws IOException
- boolean update(UpdaterSettings) throws IOException
- void update(InputStream) throws IOException
- void update(InputStream, UpdaterSettings) throws IOException
- File getFile()
- void setDumperSettings(DumperSettings)
- boolean reload() throws IOException
- void reload(InputStream) throws IOException
- void reload(InputStream, LoaderSettings) throws IOException
- UpdaterSettings getUpdaterSettings()
- **static** YamlDocument create(File, InputStream, GeneralSettings, LoaderSettings, DumperSettings, UpdaterSettings) throws IOException
- **static** YamlDocument create(File, InputStream) throws IOException
- **static** YamlDocument create(InputStream, InputStream, GeneralSettings, LoaderSettings, DumperSettings, UpdaterSettings) throws IOException
- **static** YamlDocument create(InputStream, InputStream) throws IOException
- **static** YamlDocument create(File, GeneralSettings, LoaderSettings, DumperSettings, UpdaterSettings) throws IOException
- **static** YamlDocument create(File) throws IOException
- **static** YamlDocument create(InputStream, GeneralSettings, LoaderSettings, DumperSettings, UpdaterSettings) throws IOException
- **static** YamlDocument create(InputStream) throws IOException
- String dump()
- String dump(DumperSettings)
- void setLoaderSettings(LoaderSettings)
- void setUpdaterSettings(UpdaterSettings)

## Package: io.tebex.plugin.libs.boostedyaml.block

### Class: io.tebex.plugin.libs.boostedyaml.block.Block
Type: Abstract Class

Methods:
- V addComments(List<String>)
- void setIgnored(boolean)
- void removeComments()
- TT getStoredValue()
- List<String> getComments()
- boolean isSection()
- V setComments(List<String>)
- boolean isIgnored()
- void addComment(String)

### Class: io.tebex.plugin.libs.boostedyaml.block.Comments
Type: Class

Methods:
- **static** V add(Block<*>, Comments$NodeType, Comments$Position, List<CommentLine>)
- **static** V add(Block<*>, Comments$NodeType, Comments$Position, CommentLine)
- **static** V set(Block<*>, Comments$NodeType, Comments$Position, List<CommentLine>)
- **static** List<CommentLine> get(Block<*>, Comments$NodeType, Comments$Position)
- **static** CommentLine create(String, Comments$Position)
- **static** V remove(Block<*>, Comments$NodeType, Comments$Position)

### Class: io.tebex.plugin.libs.boostedyaml.block.Comments$NodeType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- KEY
- VALUE

Methods:
- **static** Comments$NodeType valueOf(String)
- **static** Comments$NodeType[] values()

### Class: io.tebex.plugin.libs.boostedyaml.block.Comments$Position
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BEFORE
- INLINE
- AFTER

Methods:
- **static** Comments$Position valueOf(String)
- **static** Comments$Position[] values()

## Package: io.tebex.plugin.libs.boostedyaml.block.implementation

### Class: io.tebex.plugin.libs.boostedyaml.block.implementation.Section
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.block.Block

Methods:
- List<Integer> getIntList(Route, List<Integer>)
- List<Integer> getIntList(String, List<Integer>)
- List<Integer> getIntList(Route)
- List<Integer> getIntList(String)
- List<Long> getLongList(Route, List<Long>)
- List<Long> getLongList(String, List<Long>)
- List<Long> getLongList(Route)
- List<Long> getLongList(String)
- boolean isChar(Route)
- boolean isChar(String)
- Byte getByte(Route)
- Byte getByte(String)
- Byte getByte(Route, Byte)
- Byte getByte(String, Byte)
- String getNameAsString()
- Object getName()
- Optional<List<Double>> getOptionalDoubleList(Route)
- Optional<List<Double>> getOptionalDoubleList(String)
- boolean isRoot()
- TT getEnum(Route, Class<TT>)
- TT getEnum(String, Class<TT>)
- TT getEnum(Route, Class<TT>, T)
- TT getEnum(String, Class<TT>, T)
- Map<Route, Block<*>> getRouteMappedBlocks(boolean)
- Section getDefaults()
- Optional<List<Float>> getOptionalFloatList(Route)
- Optional<List<Float>> getOptionalFloatList(String)
- Route getRoute()
- List<Short> getShortList(Route, List<Short>)
- List<Short> getShortList(String, List<Short>)
- List<Short> getShortList(Route)
- List<Short> getShortList(String)
- Optional<Float> getOptionalFloat(Route)
- Optional<Float> getOptionalFloat(String)
- BigInteger getBigInt(Route)
- BigInteger getBigInt(String)
- BigInteger getBigInt(Route, BigInteger)
- BigInteger getBigInt(String, BigInteger)
- Section getSection(Route)
- Section getSection(String)
- Section getSection(Route, Section)
- Section getSection(String, Section)
- List<*> getList(Route)
- List<*> getList(String)
- List<*> getList(Route, List<*>)
- List<*> getList(String, List<*>)
- boolean isNumber(Route)
- boolean isNumber(String)
- Optional<List<String>> getOptionalStringList(Route)
- Optional<List<String>> getOptionalStringList(String)
- Optional<List<*>> getOptionalList(Route)
- Optional<List<*>> getOptionalList(String)
- boolean isInt(Route)
- boolean isInt(String)
- boolean isDecimal(Route)
- boolean isDecimal(String)
- boolean isShort(Route)
- boolean isShort(String)
- Section createSection(Route)
- Section createSection(String)
- Map<String, Block<*>> getStringRouteMappedBlocks(boolean)
- Map<Route, Object> getRouteMappedValues(boolean)
- Optional<Block<*>> getOptionalBlock(Route)
- Optional<Block<*>> getOptionalBlock(String)
- Route getNameAsRoute()
- Optional<Short> getOptionalShort(Route)
- Optional<Short> getOptionalShort(String)
- Optional<List<Integer>> getOptionalIntList(Route)
- Optional<List<Integer>> getOptionalIntList(String)
- Optional<Integer> getOptionalInt(Route)
- Optional<Integer> getOptionalInt(String)
- Z is(Route, Class<TT>)
- Z is(String, Class<TT>)
- List<Double> getDoubleList(Route, List<Double>)
- List<Double> getDoubleList(String, List<Double>)
- List<Double> getDoubleList(Route)
- List<Double> getDoubleList(String)
- Integer getInt(Route)
- Integer getInt(String)
- Integer getInt(Route, Integer)
- Integer getInt(String, Integer)
- Character getChar(Route)
- Character getChar(String)
- Character getChar(Route, Character)
- Character getChar(String, Character)
- boolean contains(Route)
- boolean contains(String)
- Set<Route> getRoutes(boolean)
- Optional<List<Long>> getOptionalLongList(Route)
- Optional<List<Long>> getOptionalLongList(String)
- Optional<Double> getOptionalDouble(Route)
- Optional<Double> getOptionalDouble(String)
- boolean hasDefaults()
- List<Byte> getByteList(Route, List<Byte>)
- List<Byte> getByteList(String, List<Byte>)
- List<Byte> getByteList(Route)
- List<Byte> getByteList(String)
- Optional<Section> getOptionalSection(Route)
- Optional<Section> getOptionalSection(String)
- boolean isSection()
- boolean isSection(Route)
- boolean isSection(String)
- List<String> getStringList(Route, List<String>)
- List<String> getStringList(String, List<String>)
- List<String> getStringList(Route)
- List<String> getStringList(String)
- boolean isDouble(Route)
- boolean isDouble(String)
- Optional<Character> getOptionalChar(Route)
- Optional<Character> getOptionalChar(String)
- boolean isBigInt(Route)
- boolean isBigInt(String)
- Optional<List<BigInteger>> getOptionalBigIntList(Route)
- Optional<List<BigInteger>> getOptionalBigIntList(String)
- Double getDouble(Route)
- Double getDouble(String)
- Double getDouble(Route, Double)
- Double getDouble(String, Double)
- Optional<String> getOptionalString(Route)
- Optional<String> getOptionalString(String)
- String getRouteAsString()
- Float getFloat(Route)
- Float getFloat(String)
- Float getFloat(Route, Float)
- Float getFloat(String, Float)
- List<Map<**>> getMapList(Route, List<Map<**>>)
- List<Map<**>> getMapList(String, List<Map<**>>)
- List<Map<**>> getMapList(Route)
- List<Map<**>> getMapList(String)
- boolean isList(Route)
- boolean isList(String)
- boolean remove(Route)
- boolean remove(String)
- Number getNumber(Route)
- Number getNumber(String)
- Number getNumber(Route, Number)
- Number getNumber(String, Number)
- V repopulate(Map<Object, Block<*>>)
- boolean isBoolean(Route)
- boolean isBoolean(String)
- Object get(Route)
- Object get(String)
- Object get(Route, Object)
- Object get(String, Object)
- boolean isString(Route)
- boolean isString(String)
- Boolean getBoolean(Route)
- Boolean getBoolean(String)
- Boolean getBoolean(Route, Boolean)
- Boolean getBoolean(String, Boolean)
- YamlDocument getRoot()
- V setAll(Map<Route, Object>)
- Optional<TT> getAsOptional(Route, Class<TT>)
- Optional<TT> getAsOptional(String, Class<TT>)
- Set<String> getRoutesAsStrings(boolean)
- Optional<List<Short>> getOptionalShortList(Route)
- Optional<List<Short>> getOptionalShortList(String)
- Block<*> getBlock(Route)
- Block<*> getBlock(String)
- Section getParent()
- Optional<Section> getParent(Route)
- Optional<Section> getParent(String)
- boolean isLong(Route)
- boolean isLong(String)
- void set(Route, Object)
- void set(String, Object)
- Short getShort(Route)
- Short getShort(String)
- Short getShort(Route, Short)
- Short getShort(String, Short)
- Optional<List<Map<**>>> getOptionalMapList(Route)
- Optional<List<Map<**>>> getOptionalMapList(String)
- List<BigInteger> getBigIntList(Route, List<BigInteger>)
- List<BigInteger> getBigIntList(String, List<BigInteger>)
- List<BigInteger> getBigIntList(Route)
- List<BigInteger> getBigIntList(String)
- void clear()
- boolean isEmpty(boolean)
- Z isEnum(Route, Class<TT>)
- Z isEnum(String, Class<TT>)
- Optional<List<Byte>> getOptionalByteList(Route)
- Optional<List<Byte>> getOptionalByteList(String)
- boolean isFloat(Route)
- boolean isFloat(String)
- String getString(Route)
- String getString(String)
- String getString(Route, String)
- String getString(String, String)
- Set<Object> getKeys()
- Optional<BigInteger> getOptionalBigInt(Route)
- Optional<BigInteger> getOptionalBigInt(String)
- Optional<Number> getOptionalNumber(Route)
- Optional<Number> getOptionalNumber(String)
- Long getLong(Route)
- Long getLong(String)
- Long getLong(Route, Long)
- Long getLong(String, Long)
- Optional<Object> getOptional(Route)
- Optional<Object> getOptional(String)
- Route getSubRoute(Object)
- boolean isByte(Route)
- boolean isByte(String)
- Optional<Boolean> getOptionalBoolean(Route)
- Optional<Boolean> getOptionalBoolean(String)
- TT getAs(Route, Class<TT>)
- TT getAs(String, Class<TT>)
- TT getAs(Route, Class<TT>, T)
- TT getAs(String, Class<TT>, T)
- List<Float> getFloatList(Route, List<Float>)
- List<Float> getFloatList(String, List<Float>)
- List<Float> getFloatList(Route)
- List<Float> getFloatList(String)
- Optional<Byte> getOptionalByte(Route)
- Optional<Byte> getOptionalByte(String)
- Map<String, Object> getStringRouteMappedValues(boolean)
- Object adaptKey(Object)
- Optional<Long> getOptionalLong(Route)
- Optional<Long> getOptionalLong(String)
- Optional<TT> getOptionalEnum(Route, Class<TT>)
- Optional<TT> getOptionalEnum(String, Class<TT>)

### Class: io.tebex.plugin.libs.boostedyaml.block.implementation.TerminatedBlock
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.block.Block

Methods:
- boolean isSection()

## Package: io.tebex.plugin.libs.boostedyaml.dvs

### Class: io.tebex.plugin.libs.boostedyaml.dvs.Pattern
Type: Class

Methods:
- Version getVersion(String)
- String toString()
- Segment getPart(int)
- Segment getSegment(int)
- Version getFirstVersion()

### Class: io.tebex.plugin.libs.boostedyaml.dvs.Version
Type: Class
Implements: java.lang.Comparable

Methods:
- String asID()
- void next()
- int getCursor(int)
- int hashCode()
- boolean equals(Object)
- String toString()
- Version copy()
- int compareTo(Version)
- int compareTo(Object)
- Pattern getPattern()

## Package: io.tebex.plugin.libs.boostedyaml.dvs.segment

### Class: io.tebex.plugin.libs.boostedyaml.dvs.segment.Segment
Type: Interface

Methods:
- int getElementLength(int)
- String getElement(int)
- int length()
- **static** Segment range(int, int, int, int)
- **static** Segment range(int, int, int)
- **static** Segment range(int, int)
- int parse(String, int)
- **static** Segment literal(String[])

### Class: io.tebex.plugin.libs.boostedyaml.dvs.segment.LiteralSegment
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.dvs.segment.Segment

Methods:
- int getElementLength(int)
- String getElement(int)
- int length()
- String toString()
- int parse(String, int)

### Class: io.tebex.plugin.libs.boostedyaml.dvs.segment.RangeSegment
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.dvs.segment.Segment

Methods:
- int getElementLength(int)
- String getElement(int)
- int length()
- String toString()
- int parse(String, int)

## Package: io.tebex.plugin.libs.boostedyaml.dvs.versioning

### Class: io.tebex.plugin.libs.boostedyaml.dvs.versioning.Versioning
Type: Interface

Methods:
- Version getDocumentVersion(Section, boolean)
- void updateVersionID(Section, Section)
- Version getFirstVersion()

### Class: io.tebex.plugin.libs.boostedyaml.dvs.versioning.AutomaticVersioning
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.dvs.versioning.Versioning

Methods:
- Version getDocumentVersion(Section, boolean)
- void updateVersionID(Section, Section)
- String toString()
- Version getFirstVersion()

### Class: io.tebex.plugin.libs.boostedyaml.dvs.versioning.ManualVersioning
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.dvs.versioning.Versioning

Methods:
- Version getDocumentVersion(Section, boolean)
- String toString()
- Version getFirstVersion()

## Package: io.tebex.plugin.libs.boostedyaml.engine

### Class: io.tebex.plugin.libs.boostedyaml.engine.ExtendedConstructor
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor

Methods:
- void clear()
- Object getConstructed(Node)

### Class: io.tebex.plugin.libs.boostedyaml.engine.ExtendedRepresenter
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter

Methods:
- Node applyValueComments(Block<*>, Node)
- Node applyKeyComments(Block<*>, Node)

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.external.com.google.gdata.util.common.base

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.external.com.google.gdata.util.common.base.Escaper
Type: Interface

Methods:
- String escape(String)
- Appendable escape(Appendable)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.external.com.google.gdata.util.common.base.PercentEscaper
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.external.com.google.gdata.util.common.base.UnicodeEscaper

Methods:
- String escape(String)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.external.com.google.gdata.util.common.base.UnicodeEscaper
Type: Abstract Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.external.com.google.gdata.util.common.base.Escaper

Methods:
- String escape(String)
- Appendable escape(Appendable)

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode
Type: Interface

Methods:
- void constructRecursive(Node, Object)
- Object construct(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode
Type: Interface

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.SettingKey
Type: Interface
Implements: java.io.Serializable

No public methods found

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.StreamDataWriter
Type: Interface

Methods:
- void flush()
- void write(String)
- void write(String, int, int)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.DumpSettings
Type: Class

Methods:
- int getIndent()
- FlowStyle getDefaultFlowStyle()
- boolean isMultiLineFlow()
- boolean isExplicitStart()
- boolean getIndentWithIndicator()
- int getWidth()
- Object getCustomProperty(SettingKey)
- NonPrintableStyle getNonPrintableStyle()
- int getIndicatorIndent()
- ScalarStyle getDefaultScalarStyle()
- boolean isUseUnicodeEncoding()
- int getMaxSimpleKeyLength()
- boolean isSplitLines()
- boolean isCanonical()
- ScalarResolver getScalarResolver()
- Optional<Tag> getExplicitRootTag()
- **static** DumpSettingsBuilder builder()
- Optional<SpecVersion> getYamlDirective()
- boolean getDumpComments()
- boolean isExplicitEnd()
- AnchorGenerator getAnchorGenerator()
- Map<String, String> getTagDirective()
- String getBestLineBreak()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.DumpSettingsBuilder
Type: Class

Methods:
- DumpSettingsBuilder setScalarResolver(ScalarResolver)
- DumpSettingsBuilder setBestLineBreak(String)
- DumpSettingsBuilder setDumpComments(boolean)
- DumpSettingsBuilder setYamlDirective(Optional<SpecVersion>)
- DumpSettingsBuilder setExplicitStart(boolean)
- DumpSettingsBuilder setIndentWithIndicator(boolean)
- DumpSettingsBuilder setMultiLineFlow(boolean)
- DumpSettingsBuilder setExplicitEnd(boolean)
- DumpSettingsBuilder setMaxSimpleKeyLength(int)
- DumpSettingsBuilder setWidth(int)
- DumpSettingsBuilder setCustomProperty(SettingKey, Object)
- DumpSettingsBuilder setExplicitRootTag(Optional<Tag>)
- DumpSettingsBuilder setUseUnicodeEncoding(boolean)
- DumpSettingsBuilder setCanonical(boolean)
- DumpSettingsBuilder setDefaultScalarStyle(ScalarStyle)
- DumpSettingsBuilder setSplitLines(boolean)
- DumpSettingsBuilder setIndicatorIndent(int)
- DumpSettings build()
- DumpSettingsBuilder setAnchorGenerator(AnchorGenerator)
- DumpSettingsBuilder setNonPrintableStyle(NonPrintableStyle)
- DumpSettingsBuilder setTagDirective(Map<String, String>)
- DumpSettingsBuilder setIndent(int)
- DumpSettingsBuilder setDefaultFlowStyle(FlowStyle)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.LoadSettings
Type: Class

Methods:
- int getMaxAliasesForCollections()
- boolean getUseMarks()
- IntFunction<Map> getDefaultMap()
- String getLabel()
- IntFunction<Set> getDefaultSet()
- Integer getBufferSize()
- Optional<EnvConfig> getEnvConfig()
- Object getCustomProperty(SettingKey)
- boolean getAllowRecursiveKeys()
- boolean getAllowDuplicateKeys()
- IntFunction<List> getDefaultList()
- ScalarResolver getScalarResolver()
- boolean getParseComments()
- Function<SpecVersion, SpecVersion> getVersionFunction()
- **static** LoadSettingsBuilder builder()
- Map<Tag, ConstructNode> getTagConstructors()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.LoadSettingsBuilder
Type: Class

Methods:
- LoadSettingsBuilder setBufferSize(Integer)
- LoadSettingsBuilder setMaxAliasesForCollections(int)
- LoadSettingsBuilder setScalarResolver(ScalarResolver)
- LoadSettingsBuilder setParseComments(boolean)
- LoadSettingsBuilder setDefaultMap(IntFunction<Map>)
- LoadSettingsBuilder setTagConstructors(Map<Tag, ConstructNode>)
- LoadSettingsBuilder setEnvConfig(Optional<EnvConfig>)
- LoadSettingsBuilder setUseMarks(boolean)
- LoadSettingsBuilder setCustomProperty(SettingKey, Object)
- LoadSettingsBuilder setDefaultList(IntFunction<List>)
- LoadSettingsBuilder setAllowRecursiveKeys(boolean)
- LoadSettings build()
- LoadSettingsBuilder setAllowDuplicateKeys(boolean)
- LoadSettingsBuilder setVersionFunction(UnaryOperator<SpecVersion>)
- LoadSettingsBuilder setLabel(String)
- LoadSettingsBuilder setDefaultSet(IntFunction<Set>)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.YamlUnicodeReader
Type: Class
Extends: java.io.Reader

Methods:
- Charset getEncoding()
- int read(char[], int, int) throws IOException
- void close() throws IOException

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.comments

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.comments.CommentEventsCollector
Type: Class

Methods:
- boolean isEmpty()
- List<CommentLine> consume()
- Event collectEventsAndPoll(Event)
- CommentEventsCollector collectEvents()
- Event collectEvents(Event)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.comments.CommentLine
Type: Class

Methods:
- String getValue()
- CommentType getCommentType()
- Optional<Mark> getStartMark()
- String toString()
- Optional<Mark> getEndMark()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.comments.CommentType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BLANK_LINE
- BLOCK
- IN_LINE

Methods:
- **static** CommentType valueOf(String)
- **static** CommentType[] values()

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.common

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.common.Anchor
Type: Class

Methods:
- String getValue()
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.common.ArrayStack
Type: Class

Methods:
- TT pop()
- boolean isEmpty()
- V push(T)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.common.CharConstants
Type: Class

Methods:
- **static** String escapeChar(String)
- boolean has(int)
- boolean has(int, String)
- boolean hasNo(int)
- boolean hasNo(int, String)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.common.FlowStyle
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FLOW
- BLOCK
- AUTO

Methods:
- **static** FlowStyle valueOf(String)
- **static** FlowStyle[] values()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.common.NonPrintableStyle
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BINARY
- ESCAPE

Methods:
- **static** NonPrintableStyle valueOf(String)
- **static** NonPrintableStyle[] values()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.common.ScalarStyle
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DOUBLE_QUOTED
- SINGLE_QUOTED
- LITERAL
- FOLDED
- PLAIN

Methods:
- **static** ScalarStyle valueOf(String)
- **static** ScalarStyle[] values()
- String toString()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.common.SpecVersion
Type: Class
Implements: java.io.Serializable

Methods:
- int getMinor()
- int getMajor()
- String toString()
- String getRepresentation()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.common.UriEncoder
Type: Abstract Class

Methods:
- **static** String encode(String)
- **static** String decode(ByteBuffer) throws CharacterCodingException
- **static** String decode(String)

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.composer

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.composer.Composer
Type: Class
Implements: java.util.Iterator

Methods:
- Node next()
- Object next()
- Optional<Node> getSingleNode()
- boolean hasNext()

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.BaseConstructor
Type: Abstract Class

Methods:
- Object constructSingleDocument(Optional<Node>)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.BaseConstructor

No public methods found

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructEnv
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- String apply(String, String, String, String)
- Object construct(Node)
- String getEnv(String)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructOptionalClass
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- Object construct(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructUuidClass
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- Object construct(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructYamlBinary
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- Object construct(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructYamlBool
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- Object construct(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructYamlFloat
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- Object construct(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructYamlInt
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- Object construct(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructYamlMap
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- void constructRecursive(Node, Object)
- Object construct(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructYamlNull
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- Object construct(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructYamlSeq
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- void constructRecursive(Node, Object)
- Object construct(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructYamlSet
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- void constructRecursive(Node, Object)
- Object construct(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructYamlStr
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.ConstructNode

Methods:
- Object construct(Node)

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.emitter

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.emitter.Emitable
Type: Interface

Methods:
- void emit(Event)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.emitter.Emitter
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.emitter.Emitable

Methods:
- void emit(Event)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.emitter.ScalarAnalysis
Type: Class

Methods:
- boolean isAllowFlowPlain()
- boolean isMultiline()
- String getScalar()
- boolean isAllowSingleQuoted()
- boolean isEmpty()
- boolean isAllowBlock()
- boolean isAllowBlockPlain()

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.env

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.env.EnvConfig
Type: Interface

Methods:
- Optional<String> getValueFor(String, String, String, String)

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.AliasEvent
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.NodeEvent

Methods:
- String toString()
- Anchor getAlias()
- Event$ID getEventId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.CollectionEndEvent
Type: Abstract Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.Event

No public methods found

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.CollectionStartEvent
Type: Abstract Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.NodeEvent

Methods:
- FlowStyle getFlowStyle()
- boolean isImplicit()
- String toString()
- boolean isFlow()
- Optional<String> getTag()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.CommentEvent
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.Event

Methods:
- String getValue()
- CommentType getCommentType()
- String toString()
- Event$ID getEventId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.DocumentEndEvent
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.Event

Methods:
- boolean isExplicit()
- String toString()
- Event$ID getEventId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.DocumentStartEvent
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.Event

Methods:
- Optional<SpecVersion> getSpecVersion()
- boolean isExplicit()
- String toString()
- Map<String, String> getTags()
- Event$ID getEventId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.Event
Type: Abstract Class

Methods:
- Optional<Mark> getStartMark()
- Event$ID getEventId()
- Optional<Mark> getEndMark()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.Event$ID
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Alias
- Comment
- DocumentEnd
- DocumentStart
- MappingEnd
- MappingStart
- Scalar
- SequenceEnd
- SequenceStart
- StreamEnd
- StreamStart

Methods:
- **static** Event$ID valueOf(String)
- **static** Event$ID[] values()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.ImplicitTuple
Type: Class

Methods:
- boolean bothFalse()
- String toString()
- boolean canOmitTagInPlainScalar()
- boolean canOmitTagInNonPlainScalar()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.MappingEndEvent
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.CollectionEndEvent

Methods:
- String toString()
- Event$ID getEventId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.MappingStartEvent
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.CollectionStartEvent

Methods:
- String toString()
- Event$ID getEventId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.NodeEvent
Type: Abstract Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.Event

Methods:
- Optional<Anchor> getAnchor()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.ScalarEvent
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.NodeEvent

Methods:
- String escapedValue()
- String getValue()
- boolean isPlain()
- ImplicitTuple getImplicit()
- String toString()
- ScalarStyle getScalarStyle()
- Optional<String> getTag()
- Event$ID getEventId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.SequenceEndEvent
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.CollectionEndEvent

Methods:
- String toString()
- Event$ID getEventId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.SequenceStartEvent
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.CollectionStartEvent

Methods:
- String toString()
- Event$ID getEventId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.StreamEndEvent
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.Event

Methods:
- String toString()
- Event$ID getEventId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.StreamStartEvent
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.events.Event

Methods:
- String toString()
- Event$ID getEventId()

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.ComposerException
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.MarkedYamlEngineException

No public methods found

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.ConstructorException
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.MarkedYamlEngineException

No public methods found

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.DuplicateKeyException
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.ConstructorException

No public methods found

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.EmitterException
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.YamlEngineException

No public methods found

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.Mark
Type: Class
Implements: java.io.Serializable

Methods:
- String getName()
- int[] getBuffer()
- int getIndex()
- String createSnippet(int, int)
- String createSnippet()
- int getLine()
- int getColumn()
- String toString()
- int getPointer()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.MarkedYamlEngineException
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.YamlEngineException

Methods:
- String getProblem()
- Optional<Mark> getProblemMark()
- Optional<Mark> getContextMark()
- String getMessage()
- String toString()
- String getContext()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.MissingEnvironmentVariableException
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.YamlEngineException

No public methods found

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.ParserException
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.MarkedYamlEngineException

No public methods found

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.ReaderException
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.YamlEngineException

Methods:
- int getPosition()
- String getName()
- int getCodePoint()
- String toString()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.ScannerException
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.MarkedYamlEngineException

No public methods found

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.YamlEngineException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.YamlVersionException
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.exceptions.YamlEngineException

Methods:
- SpecVersion getSpecVersion()

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.AnchorNode
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.Node

Methods:
- Node getRealNode()
- NodeType getNodeType()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.CollectionNode
Type: Abstract Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.Node

Methods:
- FlowStyle getFlowStyle()
- void setFlowStyle(FlowStyle)
- List<TT> getValue()
- V setEndMark(Optional<Mark>)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.MappingNode
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.CollectionNode

Methods:
- List<NodeTuple> getValue()
- V setValue(List<NodeTuple>)
- NodeType getNodeType()
- String toString()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.Node
Type: Abstract Class

Methods:
- Object getProperty(String)
- List<CommentLine> getInLineComments()
- Optional<Mark> getStartMark()
- Tag getTag()
- void setRecursive(boolean)
- Optional<Mark> getEndMark()
- boolean isRecursive()
- V setBlockComments(List<CommentLine>)
- V setInLineComments(List<CommentLine>)
- Optional<Anchor> getAnchor()
- List<CommentLine> getEndComments()
- int hashCode()
- Object setProperty(String, Object)
- boolean equals(Object)
- V setAnchor(Optional<Anchor>)
- NodeType getNodeType()
- void setTag(Tag)
- List<CommentLine> getBlockComments()
- V setEndComments(List<CommentLine>)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.NodeTuple
Type: Class

Methods:
- Node getKeyNode()
- String toString()
- Node getValueNode()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.NodeType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SCALAR
- SEQUENCE
- MAPPING
- ANCHOR

Methods:
- **static** NodeType valueOf(String)
- **static** NodeType[] values()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.ScalarNode
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.Node

Methods:
- String getValue()
- boolean isPlain()
- NodeType getNodeType()
- String toString()
- ScalarStyle getScalarStyle()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.SequenceNode
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.CollectionNode

Methods:
- List<Node> getValue()
- NodeType getNodeType()
- String toString()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.nodes.Tag
Type: Class

Methods:
- String getValue()
- int hashCode()
- boolean equals(Object)
- String toString()

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.parser

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.parser.Parser
Type: Interface
Implements: java.util.Iterator

Methods:
- Event next()
- Object next()
- Event peekEvent()
- boolean checkEvent(Event$ID)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.parser.ParserImpl
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.parser.Parser

Methods:
- Event next()
- Object next()
- Event peekEvent()
- boolean hasNext()
- boolean checkEvent(Event$ID)

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.BaseRepresenter
Type: Abstract Class

Methods:
- Node represent(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.BaseRepresenter

Methods:
- Tag addClassTag(Class<Object>, Tag)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentArray
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentBoolean
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentByteArray
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentEnum
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentIterator
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentList
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentMap
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentNull
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentNumber
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentOptional
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentPrimitiveArray
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentSet
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentString
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.representer.StandardRepresenter$RepresentUuid
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.api.RepresentToNode

Methods:
- Node representData(Object)

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.resolver

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.resolver.ScalarResolver
Type: Interface

Methods:
- Tag resolve(String, Boolean)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.resolver.JsonScalarResolver
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.resolver.ScalarResolver

Methods:
- Tag resolve(String, Boolean)
- void addImplicitResolver(Tag, Pattern, String)

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.scanner

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.scanner.Scanner
Type: Interface
Implements: java.util.Iterator

Methods:
- Token next()
- Object next()
- Token peekToken()
- boolean checkToken(Token$ID[])

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.scanner.ScannerImpl
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.scanner.Scanner

Methods:
- Token next()
- Object next()
- Token peekToken()
- boolean hasNext()
- boolean checkToken(Token$ID[])

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.scanner.StreamReader
Type: Class

Methods:
- Optional<Mark> getMark()
- int getIndex()
- String prefixForward(int)
- String prefix(int)
- void forward()
- void forward(int)
- int getLine()
- int getColumn()
- **static** boolean isPrintable(String)
- **static** boolean isPrintable(int)
- int peek()
- int peek(int)

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.serializer

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.serializer.AnchorGenerator
Type: Interface

Methods:
- Anchor nextAnchor(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.serializer.NumberAnchorGenerator
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.serializer.AnchorGenerator

Methods:
- Anchor nextAnchor(Node)

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.serializer.Serializer
Type: Class

Methods:
- void emitStreamStart()
- void emitStreamEnd()
- void serializeDocument(Node)

## Package: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.AliasToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Anchor getValue()
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.AnchorToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Anchor getValue()
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.BlockEndToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.BlockEntryToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.BlockMappingStartToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.BlockSequenceStartToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.CommentToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()
- CommentType getCommentType()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.DirectiveToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Optional<List<TT>> getValue()
- Token$ID getTokenId()
- String getName()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.DocumentEndToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.DocumentStartToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.FlowEntryToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.FlowMappingEndToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.FlowMappingStartToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.FlowSequenceEndToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.FlowSequenceStartToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.KeyToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.ScalarToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- String getValue()
- Token$ID getTokenId()
- ScalarStyle getStyle()
- boolean isPlain()
- String toString()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.StreamEndToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.StreamStartToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.TagToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- TagTuple getValue()
- Token$ID getTokenId()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.TagTuple
Type: Class

Methods:
- String getSuffix()
- Optional<String> getHandle()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token
Type: Abstract Class

Methods:
- Token$ID getTokenId()
- Optional<Mark> getStartMark()
- String toString()
- Optional<Mark> getEndMark()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token$ID
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- Alias
- Anchor
- BlockEnd
- BlockEntry
- BlockMappingStart
- BlockSequenceStart
- Directive
- DocumentEnd
- DocumentStart
- FlowEntry
- FlowMappingEnd
- FlowMappingStart
- FlowSequenceEnd
- FlowSequenceStart
- Key
- Scalar
- StreamEnd
- StreamStart
- Tag
- Comment
- Value

Methods:
- **static** Token$ID valueOf(String)
- **static** Token$ID[] values()
- String toString()

### Class: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.ValueToken
Type: Class
Extends: io.tebex.plugin.libs.boostedyaml.libs.org.snakeyaml.engine.v2.tokens.Token

Methods:
- Token$ID getTokenId()

## Package: io.tebex.plugin.libs.boostedyaml.route

### Class: io.tebex.plugin.libs.boostedyaml.route.Route
Type: Interface

Methods:
- Route add(Object)
- Route parent()
- int hashCode()
- **static** Route fromSingleKey(Object)
- boolean equals(Object)
- Object get(int)
- int length()
- **static** Route addTo(Route, Object)
- **static** Route from(Object[])
- **static** Route from(Object)
- String join(char)
- **static** Route fromString(String)
- **static** Route fromString(String, char)
- **static** Route fromString(String, RouteFactory)

### Class: io.tebex.plugin.libs.boostedyaml.route.RouteFactory
Type: Class

Methods:
- String getEscapedSeparator()
- char getSeparator()
- Route create(String)

## Package: io.tebex.plugin.libs.boostedyaml.route.implementation

### Class: io.tebex.plugin.libs.boostedyaml.route.implementation.MultiKeyRoute
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.route.Route

Methods:
- Route add(Object)
- Route parent()
- int hashCode()
- boolean equals(Object)
- Object get(int)
- int length()
- String toString()
- String join(char)

### Class: io.tebex.plugin.libs.boostedyaml.route.implementation.SingleKeyRoute
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.route.Route

Methods:
- Route add(Object)
- Route parent()
- int hashCode()
- boolean equals(Object)
- Object get(int)
- int length()
- String toString()
- String join(char)

## Package: io.tebex.plugin.libs.boostedyaml.serialization

### Class: io.tebex.plugin.libs.boostedyaml.serialization.YamlSerializer
Type: Interface

Methods:
- Map<Object, Object> serialize(T, T)
- Set<Class<*>> getSupportedParentClasses()
- Set<Class<*>> getSupportedClasses()
- Object deserialize(Map<Object, Object>)

## Package: io.tebex.plugin.libs.boostedyaml.serialization.standard

### Class: io.tebex.plugin.libs.boostedyaml.serialization.standard.TypeAdapter
Type: Interface

Methods:
- Map<Object, Object> serialize(T)
- Map<String, Object> toStringKeyedMap(Map<**>)
- TT deserialize(Map<Object, Object>)

### Class: io.tebex.plugin.libs.boostedyaml.serialization.standard.StandardSerializer
Type: Class
Implements: io.tebex.plugin.libs.boostedyaml.serialization.YamlSerializer

Methods:
- Map<Object, Object> serialize(T, T)
- Set<Class<*>> getSupportedParentClasses()
- Set<Class<*>> getSupportedClasses()
- **static** StandardSerializer getDefault()
- Object deserialize(Map<Object, Object>)
- V register(Class<TT>, TypeAdapter<TT>)
- V register(String, Class<TT>)

## Package: io.tebex.plugin.libs.boostedyaml.settings.dumper

### Class: io.tebex.plugin.libs.boostedyaml.settings.dumper.DumperSettings
Type: Class

Methods:
- DumpSettings buildEngineSettings()
- **static** DumperSettings$Builder builder()
- **static** DumperSettings$Builder builder(DumpSettingsBuilder)
- **static** DumperSettings$Builder builder(DumperSettings)

### Class: io.tebex.plugin.libs.boostedyaml.settings.dumper.DumperSettings$Builder
Type: Class

Methods:
- DumperSettings$Builder setEscapeUnprintable(boolean)
- DumperSettings$Builder setScalarResolver(ScalarResolver)
- DumperSettings$Builder setEncoding(DumperSettings$Encoding)
- DumperSettings$Builder setIndicatorIndentation(int)
- DumperSettings$Builder setCanonicalForm(boolean)
- DumperSettings$Builder setTagDirectives(Map<String, String>)
- DumperSettings$Builder setYamlDirective(SpecVersion)
- DumperSettings$Builder setMaxSimpleKeyLength(int)
- DumperSettings$Builder setLineWidth(int)
- DumperSettings$Builder setStartMarker(boolean)
- DumperSettings$Builder setLineBreak(String)
- DumperSettings$Builder setUnprintableStyle(NonPrintableStyle)
- DumperSettings$Builder setIndentation(int)
- DumperSettings$Builder setEndMarker(boolean)
- DumperSettings$Builder setFlowStyle(FlowStyle)
- DumperSettings build()
- DumperSettings$Builder setAnchorGenerator(Supplier<AnchorGenerator>)
- DumperSettings$Builder setRootTag(Tag)
- DumperSettings$Builder setScalarStyle(ScalarStyle)
- DumperSettings$Builder setMultilineStyle(boolean)

### Class: io.tebex.plugin.libs.boostedyaml.settings.dumper.DumperSettings$Encoding
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UNICODE
- ASCII

Methods:
- **static** DumperSettings$Encoding valueOf(String)
- **static** DumperSettings$Encoding[] values()

## Package: io.tebex.plugin.libs.boostedyaml.settings.general

### Class: io.tebex.plugin.libs.boostedyaml.settings.general.GeneralSettings
Type: Class

Methods:
- Map<TK, TV> getDefaultMap(int)
- Map<TK, TV> getDefaultMap()
- Character getDefaultChar()
- char getRouteSeparator()
- Set<TT> getDefaultSet(int)
- Set<TT> getDefaultSet()
- String getEscapedSeparator()
- List<TT> getDefaultList(int)
- List<TT> getDefaultList()
- YamlSerializer getSerializer()
- GeneralSettings$KeyFormat getKeyFormat()
- String getDefaultString()
- boolean isUseDefaults()
- **static** GeneralSettings$Builder builder()
- **static** GeneralSettings$Builder builder(GeneralSettings)
- Number getDefaultNumber()
- Boolean getDefaultBoolean()
- MapSupplier getDefaultMapSupplier()
- Object getDefaultObject()

### Class: io.tebex.plugin.libs.boostedyaml.settings.general.GeneralSettings$Builder
Type: Class

Methods:
- GeneralSettings$Builder setDefaultString(String)
- GeneralSettings$Builder setDefaultList(ListSupplier)
- GeneralSettings$Builder setDefaultObject(Object)
- GeneralSettings$Builder setSerializer(YamlSerializer)
- GeneralSettings build()
- GeneralSettings$Builder setDefaultMap(MapSupplier)
- GeneralSettings$Builder setRouteSeparator(char)
- GeneralSettings$Builder setDefaultBoolean(Boolean)
- GeneralSettings$Builder setUseDefaults(boolean)
- GeneralSettings$Builder setDefaultSet(SetSupplier)
- GeneralSettings$Builder setDefaultNumber(Number)
- GeneralSettings$Builder setDefaultChar(Character)
- GeneralSettings$Builder setKeyFormat(GeneralSettings$KeyFormat)

### Class: io.tebex.plugin.libs.boostedyaml.settings.general.GeneralSettings$KeyFormat
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- STRING
- OBJECT

Methods:
- **static** GeneralSettings$KeyFormat valueOf(String)
- **static** GeneralSettings$KeyFormat[] values()

## Package: io.tebex.plugin.libs.boostedyaml.settings.loader

### Class: io.tebex.plugin.libs.boostedyaml.settings.loader.LoaderSettings
Type: Class

Methods:
- LoadSettings buildEngineSettings(GeneralSettings)
- boolean isAutoUpdate()
- **static** LoaderSettings$Builder builder()
- **static** LoaderSettings$Builder builder(LoadSettingsBuilder)
- **static** LoaderSettings$Builder builder(LoaderSettings)
- boolean isCreateFileIfAbsent()

### Class: io.tebex.plugin.libs.boostedyaml.settings.loader.LoaderSettings$Builder
Type: Class

Methods:
- LoaderSettings$Builder setScalarResolver(ScalarResolver)
- LoaderSettings build()
- LoaderSettings$Builder setAllowDuplicateKeys(boolean)
- LoaderSettings$Builder setTagConstructors(Map<Tag, ConstructNode>)
- LoaderSettings$Builder setMaxCollectionAliases(int)
- LoaderSettings$Builder setErrorLabel(String)
- LoaderSettings$Builder setEnvironmentConfig(EnvConfig)
- LoaderSettings$Builder setDetailedErrors(boolean)
- LoaderSettings$Builder setAutoUpdate(boolean)
- LoaderSettings$Builder setCreateFileIfAbsent(boolean)

## Package: io.tebex.plugin.libs.boostedyaml.settings.updater

### Class: io.tebex.plugin.libs.boostedyaml.settings.updater.ValueMapper
Type: Interface

Methods:
- **static** ValueMapper block(Function<Block<*>, Object>)
- **static** ValueMapper section(BiFunction<Section, Route, Object>)
- **static** ValueMapper value(Function<Object, Object>)
- Object map(Section, Route)
- Object map(Block<*>)
- Object map(Object)

### Class: io.tebex.plugin.libs.boostedyaml.settings.updater.MergeRule
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SECTION_AT_MAPPING
- MAPPING_AT_SECTION
- MAPPINGS

Methods:
- **static** MergeRule valueOf(String)
- **static** MergeRule[] values()
- **static** MergeRule getFor(boolean, boolean)

### Class: io.tebex.plugin.libs.boostedyaml.settings.updater.UpdaterSettings
Type: Class

Methods:
- List<Consumer<YamlDocument>> getCustomLogic(String)
- Map<MergeRule, Boolean> getMergeRules()
- boolean isEnableDowngrading()
- Map<Route, ValueMapper> getMappers(String, char)
- Set<Route> getIgnoredRoutes(String, char)
- **static** UpdaterSettings$Builder builder()
- **static** UpdaterSettings$Builder builder(UpdaterSettings)
- UpdaterSettings$OptionSorting getOptionSorting()
- Versioning getVersioning()
- boolean isKeepAll()
- boolean isAutoSave()
- Map<Route, Route> getRelocations(String, char)

### Class: io.tebex.plugin.libs.boostedyaml.settings.updater.UpdaterSettings$Builder
Type: Class

Methods:
- UpdaterSettings$Builder addMapper(String, Route, ValueMapper)
- UpdaterSettings$Builder addMapper(String, String, ValueMapper, char)
- UpdaterSettings$Builder setVersioning(Versioning)
- UpdaterSettings$Builder setVersioning(Pattern, String, String)
- UpdaterSettings$Builder setVersioning(Pattern, Route)
- UpdaterSettings$Builder setVersioning(Pattern, String)
- UpdaterSettings$Builder setMergeRules(Map<MergeRule, Boolean>)
- UpdaterSettings$Builder setIgnoredStringRoutes(Map<String, Set<String>>)
- UpdaterSettings$Builder setIgnoredStringRoutes(String, Set<String>)
- UpdaterSettings$Builder addCustomLogic(String, Consumer<YamlDocument>)
- UpdaterSettings$Builder addCustomLogic(Map<String, List<Consumer<YamlDocument>>>)
- UpdaterSettings$Builder addCustomLogic(String, Collection<Consumer<YamlDocument>>)
- UpdaterSettings$Builder setMergeRule(MergeRule, boolean)
- UpdaterSettings$Builder addIgnoredRoutes(String, Set<Route>)
- UpdaterSettings$Builder addIgnoredRoutes(Map<String, Set<Route>>)
- UpdaterSettings$Builder addIgnoredRoutes(String, Set<String>, char)
- UpdaterSettings$Builder addIgnoredRoutes(Map<String, Set<String>>, char)
- UpdaterSettings$Builder addIgnoredRoute(String, Route)
- UpdaterSettings$Builder addIgnoredRoute(String, String, char)
- UpdaterSettings$Builder setKeepAll(boolean)
- UpdaterSettings$Builder addRelocations(String, Map<Route, Route>)
- UpdaterSettings$Builder addRelocations(Map<String, Map<Route, Route>>)
- UpdaterSettings$Builder addRelocations(String, Map<String, String>, char)
- UpdaterSettings$Builder addRelocations(Map<String, Map<String, String>>, char)
- UpdaterSettings$Builder setEnableDowngrading(boolean)
- UpdaterSettings$Builder setIgnoredRoutes(Map<String, Set<Route>>)
- UpdaterSettings$Builder setIgnoredRoutes(String, Set<Route>)
- UpdaterSettings build()
- UpdaterSettings$Builder setOptionSorting(UpdaterSettings$OptionSorting)
- UpdaterSettings$Builder addMappers(String, Map<Route, ValueMapper>)
- UpdaterSettings$Builder addMappers(Map<String, Map<Route, ValueMapper>>)
- UpdaterSettings$Builder addMappers(String, Map<String, ValueMapper>, char)
- UpdaterSettings$Builder addMappers(Map<String, Map<String, ValueMapper>>, char)
- UpdaterSettings$Builder setRelocations(Map<String, Map<Route, Route>>)
- UpdaterSettings$Builder setRelocations(String, Map<Route, Route>)
- UpdaterSettings$Builder addRelocation(String, Route, Route)
- UpdaterSettings$Builder addRelocation(String, String, String, char)
- UpdaterSettings$Builder setStringRelocations(Map<String, Map<String, String>>)
- UpdaterSettings$Builder setStringRelocations(String, Map<String, String>)
- UpdaterSettings$Builder setAutoSave(boolean)

### Class: io.tebex.plugin.libs.boostedyaml.settings.updater.UpdaterSettings$OptionSorting
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NONE
- SORT_BY_DEFAULTS

Methods:
- **static** UpdaterSettings$OptionSorting valueOf(String)
- **static** UpdaterSettings$OptionSorting[] values()

## Package: io.tebex.plugin.libs.boostedyaml.updater

### Class: io.tebex.plugin.libs.boostedyaml.updater.Updater
Type: Class

Methods:
- **static** void update(Section, Section, UpdaterSettings, GeneralSettings) throws IOException

### Class: io.tebex.plugin.libs.boostedyaml.updater.VersionedOperations
Type: Class

Methods:
- **static** boolean run(Section, Section, UpdaterSettings, char)

## Package: io.tebex.plugin.libs.boostedyaml.updater.operators

### Class: io.tebex.plugin.libs.boostedyaml.updater.operators.Mapper
Type: Class

Methods:
- **static** V apply(Section, Map<Route, ValueMapper>)

### Class: io.tebex.plugin.libs.boostedyaml.updater.operators.Merger
Type: Class

Methods:
- **static** void merge(Section, Section, UpdaterSettings)

### Class: io.tebex.plugin.libs.boostedyaml.updater.operators.Relocator
Type: Class

Methods:
- **static** V apply(Section, Map<Route, Route>)

## Package: io.tebex.plugin.libs.boostedyaml.utils.conversion

### Class: io.tebex.plugin.libs.boostedyaml.utils.conversion.ListConversions
Type: Class

Methods:
- **static** Optional<List<Long>> toLongList(List<*>)
- **static** Optional<List<Float>> toFloatList(List<*>)
- **static** Optional<List<Integer>> toIntList(List<*>)
- **static** Optional<List<Map<**>>> toMapList(List<*>)
- **static** Optional<List<Short>> toShortList(List<*>)
- **static** Optional<List<Byte>> toByteList(List<*>)
- **static** Optional<List<String>> toStringList(List<*>)
- **static** Optional<List<Double>> toDoubleList(List<*>)
- **static** Optional<List<BigInteger>> toBigIntList(List<*>)

### Class: io.tebex.plugin.libs.boostedyaml.utils.conversion.PrimitiveConversions
Type: Class

Methods:
- **static** Optional<Integer> toInt(Object)
- **static** Optional<Double> toDouble(Object)
- **static** Optional<Long> toLong(Object)
- **static** Z isNumber(Class<*>)
- **static** Optional<Float> toFloat(Object)
- **static** Optional<BigInteger> toBigInt(Object)
- **static** Object convertNumber(Object, Class<*>)
- **static** Optional<Byte> toByte(Object)
- **static** Optional<Short> toShort(Object)

## Package: io.tebex.plugin.libs.boostedyaml.utils.supplier

### Class: io.tebex.plugin.libs.boostedyaml.utils.supplier.ListSupplier
Type: Interface

Methods:
- List<TT> supply(int)

### Class: io.tebex.plugin.libs.boostedyaml.utils.supplier.MapSupplier
Type: Interface

Methods:
- Map<TK, TV> supply(int)

### Class: io.tebex.plugin.libs.boostedyaml.utils.supplier.SetSupplier
Type: Interface

Methods:
- Set<TT> supply(int)

## Package: io.tebex.plugin.libs.gson

### Class: io.tebex.plugin.libs.gson.ExclusionStrategy
Type: Interface

Methods:
- Z shouldSkipClass(Class<*>)
- boolean shouldSkipField(FieldAttributes)

### Class: io.tebex.plugin.libs.gson.FieldNamingStrategy
Type: Interface

Methods:
- String translateName(Field)

### Class: io.tebex.plugin.libs.gson.InstanceCreator
Type: Interface

Methods:
- TT createInstance(Type)

### Class: io.tebex.plugin.libs.gson.JsonDeserializationContext
Type: Interface

Methods:
- TT deserialize(JsonElement, Type) throws JsonParseException

### Class: io.tebex.plugin.libs.gson.JsonDeserializer
Type: Interface

Methods:
- TT deserialize(JsonElement, Type, JsonDeserializationContext) throws JsonParseException

### Class: io.tebex.plugin.libs.gson.JsonSerializationContext
Type: Interface

Methods:
- JsonElement serialize(Object)
- JsonElement serialize(Object, Type)

### Class: io.tebex.plugin.libs.gson.JsonSerializer
Type: Interface

Methods:
- JsonElement serialize(T, T, ;)

### Class: io.tebex.plugin.libs.gson.ReflectionAccessFilter
Type: Interface

Methods:
- ReflectionAccessFilter$FilterResult check(Class<*>)

### Class: io.tebex.plugin.libs.gson.ToNumberStrategy
Type: Interface

Methods:
- Number readNumber(JsonReader) throws IOException

### Class: io.tebex.plugin.libs.gson.TypeAdapterFactory
Type: Interface

Methods:
- TypeAdapter<TT> create(Gson, TypeToken<TT>)

### Class: io.tebex.plugin.libs.gson.FieldAttributes
Type: Class

Methods:
- Class<*> getDeclaringClass()
- String getName()
- boolean hasModifier(int)
- TT getAnnotation(Class<TT>)
- Type getDeclaredType()
- String toString()
- Class<*> getDeclaredClass()
- Collection<Annotation> getAnnotations()

### Class: io.tebex.plugin.libs.gson.FieldNamingPolicy
Type: Enum
Extends: java.lang.Enum
Implements: io.tebex.plugin.libs.gson.FieldNamingStrategy

Enum Constants:
- IDENTITY
- UPPER_CAMEL_CASE
- UPPER_CAMEL_CASE_WITH_SPACES
- UPPER_CASE_WITH_UNDERSCORES
- LOWER_CASE_WITH_UNDERSCORES
- LOWER_CASE_WITH_DASHES
- LOWER_CASE_WITH_DOTS

Methods:
- **static** FieldNamingPolicy valueOf(String)
- **static** FieldNamingPolicy[] values()

### Class: io.tebex.plugin.libs.gson.Gson
Type: Class

Methods:
- TypeAdapter<TT> getAdapter(TypeToken<TT>)
- TypeAdapter<TT> getAdapter(Class<TT>)
- boolean serializeNulls()
- String toJson(Object)
- String toJson(Object, Type)
- void toJson(Object, Appendable) throws JsonIOException
- void toJson(Object, Type, Appendable) throws JsonIOException
- void toJson(Object, Type, JsonWriter) throws JsonIOException
- String toJson(JsonElement)
- void toJson(JsonElement, Appendable) throws JsonIOException
- void toJson(JsonElement, JsonWriter) throws JsonIOException
- FieldNamingStrategy fieldNamingStrategy()
- Excluder excluder()
- JsonWriter newJsonWriter(Writer) throws IOException
- JsonElement toJsonTree(Object)
- JsonElement toJsonTree(Object, Type)
- TT fromJson(String, Class<TT>) throws JsonSyntaxException
- TT fromJson(String, Type) throws JsonSyntaxException
- TT fromJson(String, TypeToken<TT>) throws JsonSyntaxException
- TT fromJson(Reader, Class<TT>) throws JsonSyntaxException, JsonIOException
- TT fromJson(Reader, Type) throws JsonIOException, JsonSyntaxException
- TT fromJson(Reader, TypeToken<TT>) throws JsonIOException, JsonSyntaxException
- TT fromJson(JsonReader, Type) throws JsonIOException, JsonSyntaxException
- TT fromJson(JsonReader, TypeToken<TT>) throws JsonIOException, JsonSyntaxException
- TT fromJson(JsonElement, Class<TT>) throws JsonSyntaxException
- TT fromJson(JsonElement, Type) throws JsonSyntaxException
- TT fromJson(JsonElement, TypeToken<TT>) throws JsonSyntaxException
- String toString()
- GsonBuilder newBuilder()
- TypeAdapter<TT> getDelegateAdapter(TypeAdapterFactory, TypeToken<TT>)
- boolean htmlSafe()
- JsonReader newJsonReader(Reader)

### Class: io.tebex.plugin.libs.gson.GsonBuilder
Type: Class

Methods:
- GsonBuilder setFieldNamingPolicy(FieldNamingPolicy)
- GsonBuilder enableComplexMapKeySerialization()
- GsonBuilder disableInnerClassSerialization()
- GsonBuilder excludeFieldsWithModifiers(int[])
- GsonBuilder setLenient()
- GsonBuilder disableJdkUnsafe()
- GsonBuilder serializeNulls()
- GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy)
- GsonBuilder generateNonExecutableJson()
- GsonBuilder registerTypeHierarchyAdapter(Class<*>, Object)
- GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy)
- GsonBuilder setLongSerializationPolicy(LongSerializationPolicy)
- GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory)
- Gson create()
- GsonBuilder disableHtmlEscaping()
- GsonBuilder addReflectionAccessFilter(ReflectionAccessFilter)
- GsonBuilder setDateFormat(String)
- GsonBuilder setDateFormat(int)
- GsonBuilder setDateFormat(int, int)
- GsonBuilder setObjectToNumberStrategy(ToNumberStrategy)
- GsonBuilder setNumberToNumberStrategy(ToNumberStrategy)
- GsonBuilder setVersion(double)
- GsonBuilder setFieldNamingStrategy(FieldNamingStrategy)
- GsonBuilder serializeSpecialFloatingPointValues()
- GsonBuilder registerTypeAdapter(Type, Object)
- GsonBuilder setPrettyPrinting()
- GsonBuilder setExclusionStrategies(ExclusionStrategy[])
- GsonBuilder excludeFieldsWithoutExposeAnnotation()

### Class: io.tebex.plugin.libs.gson.JsonArray
Type: Class
Extends: io.tebex.plugin.libs.gson.JsonElement
Implements: java.lang.Iterable

Methods:
- float getAsFloat()
- byte getAsByte()
- BigDecimal getAsBigDecimal()
- Number getAsNumber()
- char getAsCharacter()
- String getAsString()
- List<JsonElement> asList()
- int getAsInt()
- boolean remove(JsonElement)
- JsonElement remove(int)
- long getAsLong()
- Iterator<JsonElement> iterator()
- int hashCode()
- JsonElement get(int)
- BigInteger getAsBigInteger()
- void add(Boolean)
- void add(Character)
- void add(Number)
- void add(String)
- void add(JsonElement)
- JsonElement set(int, JsonElement)
- boolean isEmpty()
- double getAsDouble()
- JsonArray deepCopy()
- JsonElement deepCopy()
- boolean contains(JsonElement)
- int size()
- void addAll(JsonArray)
- boolean getAsBoolean()
- boolean equals(Object)
- short getAsShort()

### Class: io.tebex.plugin.libs.gson.JsonElement
Type: Abstract Class

Methods:
- BigInteger getAsBigInteger()
- float getAsFloat()
- byte getAsByte()
- JsonObject getAsJsonObject()
- BigDecimal getAsBigDecimal()
- JsonNull getAsJsonNull()
- Number getAsNumber()
- boolean isJsonNull()
- char getAsCharacter()
- String getAsString()
- boolean isJsonArray()
- double getAsDouble()
- int getAsInt()
- boolean isJsonPrimitive()
- JsonElement deepCopy()
- long getAsLong()
- JsonArray getAsJsonArray()
- boolean getAsBoolean()
- JsonPrimitive getAsJsonPrimitive()
- boolean isJsonObject()
- String toString()
- short getAsShort()

### Class: io.tebex.plugin.libs.gson.JsonIOException
Type: Class
Extends: io.tebex.plugin.libs.gson.JsonParseException

No public methods found

### Class: io.tebex.plugin.libs.gson.JsonNull
Type: Class
Extends: io.tebex.plugin.libs.gson.JsonElement

Methods:
- int hashCode()
- boolean equals(Object)
- JsonNull deepCopy()
- JsonElement deepCopy()

### Class: io.tebex.plugin.libs.gson.JsonObject
Type: Class
Extends: io.tebex.plugin.libs.gson.JsonElement

Methods:
- void add(String, JsonElement)
- JsonObject getAsJsonObject(String)
- Set<Map$Entry<String, JsonElement>> entrySet()
- Map<String, JsonElement> asMap()
- boolean isEmpty()
- void addProperty(String, String)
- void addProperty(String, Number)
- void addProperty(String, Boolean)
- void addProperty(String, Character)
- JsonElement remove(String)
- JsonObject deepCopy()
- JsonElement deepCopy()
- JsonArray getAsJsonArray(String)
- int size()
- int hashCode()
- JsonPrimitive getAsJsonPrimitive(String)
- boolean equals(Object)
- JsonElement get(String)
- boolean has(String)
- Set<String> keySet()

### Class: io.tebex.plugin.libs.gson.JsonParseException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: io.tebex.plugin.libs.gson.JsonPrimitive
Type: Class
Extends: io.tebex.plugin.libs.gson.JsonElement

Methods:
- float getAsFloat()
- BigInteger getAsBigInteger()
- byte getAsByte()
- BigDecimal getAsBigDecimal()
- Number getAsNumber()
- char getAsCharacter()
- String getAsString()
- double getAsDouble()
- int getAsInt()
- JsonPrimitive deepCopy()
- JsonElement deepCopy()
- long getAsLong()
- boolean isBoolean()
- int hashCode()
- boolean isNumber()
- boolean getAsBoolean()
- boolean equals(Object)
- boolean isString()
- short getAsShort()

### Class: io.tebex.plugin.libs.gson.JsonSyntaxException
Type: Class
Extends: io.tebex.plugin.libs.gson.JsonParseException

No public methods found

### Class: io.tebex.plugin.libs.gson.LongSerializationPolicy
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DEFAULT
- STRING

Methods:
- JsonElement serialize(Long)
- **static** LongSerializationPolicy valueOf(String)
- **static** LongSerializationPolicy[] values()

### Class: io.tebex.plugin.libs.gson.ReflectionAccessFilter$FilterResult
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ALLOW
- INDECISIVE
- BLOCK_INACCESSIBLE
- BLOCK_ALL

Methods:
- **static** ReflectionAccessFilter$FilterResult valueOf(String)
- **static** ReflectionAccessFilter$FilterResult[] values()

### Class: io.tebex.plugin.libs.gson.ToNumberPolicy
Type: Enum
Extends: java.lang.Enum
Implements: io.tebex.plugin.libs.gson.ToNumberStrategy

Enum Constants:
- DOUBLE
- LAZILY_PARSED_NUMBER
- LONG_OR_DOUBLE
- BIG_DECIMAL

Methods:
- **static** ToNumberPolicy valueOf(String)
- **static** ToNumberPolicy[] values()

### Class: io.tebex.plugin.libs.gson.TypeAdapter
Type: Abstract Class

Methods:
- V toJson(Writer, T) throws IOException
- String toJson(T)
- TT read(JsonReader) throws IOException
- JsonElement toJsonTree(T)
- TT fromJson(Reader) throws IOException
- TT fromJson(String) throws IOException
- TypeAdapter<TT> nullSafe()
- V write(JsonWriter, T) throws IOException
- TT fromJsonTree(JsonElement)

## Package: io.tebex.plugin.libs.gson.annotations

### Class: io.tebex.plugin.libs.gson.annotations.Expose
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean serialize()
- boolean deserialize()

### Class: io.tebex.plugin.libs.gson.annotations.JsonAdapter
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean nullSafe()
- Class<*> value()

### Class: io.tebex.plugin.libs.gson.annotations.SerializedName
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] alternate()
- String value()

### Class: io.tebex.plugin.libs.gson.annotations.Since
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- double value()

### Class: io.tebex.plugin.libs.gson.annotations.Until
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- double value()

## Package: io.tebex.plugin.libs.gson.internal

### Class: io.tebex.plugin.libs.gson.internal.ObjectConstructor
Type: Interface

Methods:
- TT construct()

### Class: io.tebex.plugin.libs.gson.internal.$Gson$Preconditions
Type: Class

Methods:
- **static** TT checkNotNull(T)
- **static** void checkArgument(boolean)

### Class: io.tebex.plugin.libs.gson.internal.$Gson$Types
Type: Class

Methods:
- **static** Type getMapKeyAndValueTypes(Type, Class<*>)
- **static** Class<*> getRawType(Type)
- **static** Type resolve(Type, Class<*>, Type)
- **static** Type getCollectionElementType(Type, Class<*>)
- **static** WildcardType supertypeOf(Type)
- **static** boolean equals(Type, Type)
- **static** WildcardType subtypeOf(Type)
- **static** GenericArrayType arrayOf(Type)
- **static** ParameterizedType newParameterizedTypeWithOwner(Type, Type, Type[])
- **static** Type getArrayComponentType(Type)
- **static** Type canonicalize(Type)
- **static** String typeToString(Type)

### Class: io.tebex.plugin.libs.gson.internal.ConstructorConstructor
Type: Class

Methods:
- ObjectConstructor<TT> get(TypeToken<TT>)
- String toString()

### Class: io.tebex.plugin.libs.gson.internal.Excluder
Type: Class
Implements: io.tebex.plugin.libs.gson.TypeAdapterFactory, java.lang.Cloneable

Methods:
- Excluder withExclusionStrategy(ExclusionStrategy, boolean, boolean)
- Excluder disableInnerClassSerialization()
- Excluder withModifiers(int[])
- TypeAdapter<TT> create(Gson, TypeToken<TT>)
- Z excludeClass(Class<*>, boolean)
- Excluder withVersion(double)
- boolean excludeField(Field, boolean)
- Excluder excludeFieldsWithoutExposeAnnotation()

### Class: io.tebex.plugin.libs.gson.internal.JavaVersion
Type: Class

Methods:
- **static** int getMajorJavaVersion()
- **static** boolean isJava9OrLater()

### Class: io.tebex.plugin.libs.gson.internal.JsonReaderInternalAccess
Type: Abstract Class

Methods:
- void promoteNameToValue(JsonReader) throws IOException

### Class: io.tebex.plugin.libs.gson.internal.LazilyParsedNumber
Type: Class
Extends: java.lang.Number

Methods:
- int hashCode()
- int intValue()
- boolean equals(Object)
- float floatValue()
- String toString()
- double doubleValue()
- long longValue()

### Class: io.tebex.plugin.libs.gson.internal.LinkedTreeMap
Type: Class
Extends: java.util.AbstractMap
Implements: java.io.Serializable

Methods:
- int size()
- Set<Map$Entry<TK, TV>> entrySet()
- boolean containsKey(Object)
- TV get(Object)
- void clear()
- Set<TK> keySet()
- TV remove(Object)
- TV put(T, K)

### Class: io.tebex.plugin.libs.gson.internal.NonNullElementWrapperList
Type: Class
Extends: java.util.AbstractList
Implements: java.util.RandomAccess

Methods:
- V add(int, T)
- TE set(int, T)
- void clear()
- TE remove(int)
- boolean remove(Object)
- int lastIndexOf(Object)
- boolean contains(Object)
- Z removeAll(Collection<*>)
- int size()
- int hashCode()
- boolean equals(Object)
- TE get(int)
- Object[] toArray()
- [TT toArray([T)
- int indexOf(Object)
- Z retainAll(Collection<*>)

### Class: io.tebex.plugin.libs.gson.internal.PreJava9DateFormatProvider
Type: Class

Methods:
- **static** DateFormat getUSDateFormat(int)
- **static** DateFormat getUSDateTimeFormat(int, int)

### Class: io.tebex.plugin.libs.gson.internal.Primitives
Type: Class

Methods:
- **static** boolean isWrapperType(Type)
- **static** Class<TT> wrap(Class<TT>)
- **static** boolean isPrimitive(Type)
- **static** Class<TT> unwrap(Class<TT>)

### Class: io.tebex.plugin.libs.gson.internal.ReflectionAccessFilterHelper
Type: Class

Methods:
- **static** boolean canAccess(AccessibleObject, Object)
- **static** Z isAndroidType(Class<*>)
- **static** Z isAnyPlatformType(Class<*>)
- **static** Z isJavaType(Class<*>)
- **static** ReflectionAccessFilter$FilterResult getFilterResult(List<ReflectionAccessFilter>, Class<*>)

### Class: io.tebex.plugin.libs.gson.internal.Streams
Type: Class

Methods:
- **static** Writer writerForAppendable(Appendable)
- **static** JsonElement parse(JsonReader) throws JsonParseException
- **static** void write(JsonElement, JsonWriter) throws IOException

### Class: io.tebex.plugin.libs.gson.internal.UnsafeAllocator
Type: Abstract Class

Methods:
- TT newInstance(Class<TT>) throws Exception

## Package: io.tebex.plugin.libs.gson.internal.bind

### Class: io.tebex.plugin.libs.gson.internal.bind.ArrayTypeAdapter
Type: Class
Extends: io.tebex.plugin.libs.gson.TypeAdapter

Methods:
- Object read(JsonReader) throws IOException
- void write(JsonWriter, Object) throws IOException

### Class: io.tebex.plugin.libs.gson.internal.bind.CollectionTypeAdapterFactory
Type: Class
Implements: io.tebex.plugin.libs.gson.TypeAdapterFactory

Methods:
- TypeAdapter<TT> create(Gson, TypeToken<TT>)

### Class: io.tebex.plugin.libs.gson.internal.bind.DateTypeAdapter
Type: Class
Extends: io.tebex.plugin.libs.gson.TypeAdapter

Methods:
- Date read(JsonReader) throws IOException
- Object read(JsonReader) throws IOException
- void write(JsonWriter, Date) throws IOException
- void write(JsonWriter, Object) throws IOException

### Class: io.tebex.plugin.libs.gson.internal.bind.DefaultDateTypeAdapter
Type: Class
Extends: io.tebex.plugin.libs.gson.TypeAdapter

Methods:
- TT read(JsonReader) throws IOException
- Object read(JsonReader) throws IOException
- String toString()
- void write(JsonWriter, Date) throws IOException
- void write(JsonWriter, Object) throws IOException

### Class: io.tebex.plugin.libs.gson.internal.bind.DefaultDateTypeAdapter$DateType
Type: Abstract Class

Methods:
- TypeAdapterFactory createAdapterFactory(String)
- TypeAdapterFactory createAdapterFactory(int)
- TypeAdapterFactory createAdapterFactory(int, int)
- TypeAdapterFactory createDefaultsAdapterFactory()

### Class: io.tebex.plugin.libs.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory
Type: Class
Implements: io.tebex.plugin.libs.gson.TypeAdapterFactory

Methods:
- TypeAdapter<TT> create(Gson, TypeToken<TT>)

### Class: io.tebex.plugin.libs.gson.internal.bind.JsonTreeReader
Type: Class
Extends: io.tebex.plugin.libs.gson.stream.JsonReader

Methods:
- void skipValue() throws IOException
- String getPreviousPath()
- boolean hasNext() throws IOException
- int nextInt() throws IOException
- long nextLong() throws IOException
- String nextString() throws IOException
- void endArray() throws IOException
- double nextDouble() throws IOException
- JsonToken peek() throws IOException
- void endObject() throws IOException
- void beginArray() throws IOException
- void promoteNameToValue() throws IOException
- void beginObject() throws IOException
- String getPath()
- String toString()
- boolean nextBoolean() throws IOException
- void close() throws IOException
- String nextName() throws IOException
- void nextNull() throws IOException

### Class: io.tebex.plugin.libs.gson.internal.bind.JsonTreeWriter
Type: Class
Extends: io.tebex.plugin.libs.gson.stream.JsonWriter

Methods:
- JsonWriter beginArray() throws IOException
- void flush() throws IOException
- JsonWriter beginObject() throws IOException
- JsonWriter jsonValue(String) throws IOException
- JsonElement get()
- JsonWriter name(String) throws IOException
- JsonWriter endArray() throws IOException
- void close() throws IOException
- JsonWriter nullValue() throws IOException
- JsonWriter value(String) throws IOException
- JsonWriter value(boolean) throws IOException
- JsonWriter value(Boolean) throws IOException
- JsonWriter value(float) throws IOException
- JsonWriter value(double) throws IOException
- JsonWriter value(long) throws IOException
- JsonWriter value(Number) throws IOException
- JsonWriter endObject() throws IOException

### Class: io.tebex.plugin.libs.gson.internal.bind.MapTypeAdapterFactory
Type: Class
Implements: io.tebex.plugin.libs.gson.TypeAdapterFactory

Methods:
- TypeAdapter<TT> create(Gson, TypeToken<TT>)

### Class: io.tebex.plugin.libs.gson.internal.bind.NumberTypeAdapter
Type: Class
Extends: io.tebex.plugin.libs.gson.TypeAdapter

Methods:
- Number read(JsonReader) throws IOException
- Object read(JsonReader) throws IOException
- **static** TypeAdapterFactory getFactory(ToNumberStrategy)
- void write(JsonWriter, Number) throws IOException
- void write(JsonWriter, Object) throws IOException

### Class: io.tebex.plugin.libs.gson.internal.bind.ObjectTypeAdapter
Type: Class
Extends: io.tebex.plugin.libs.gson.TypeAdapter

Methods:
- Object read(JsonReader) throws IOException
- **static** TypeAdapterFactory getFactory(ToNumberStrategy)
- void write(JsonWriter, Object) throws IOException

### Class: io.tebex.plugin.libs.gson.internal.bind.ReflectiveTypeAdapterFactory
Type: Class
Implements: io.tebex.plugin.libs.gson.TypeAdapterFactory

Methods:
- TypeAdapter<TT> create(Gson, TypeToken<TT>)

### Class: io.tebex.plugin.libs.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
Type: Abstract Class
Extends: io.tebex.plugin.libs.gson.TypeAdapter

Methods:
- TT read(JsonReader) throws IOException
- V write(JsonWriter, T) throws IOException

### Class: io.tebex.plugin.libs.gson.internal.bind.SerializationDelegatingTypeAdapter
Type: Abstract Class
Extends: io.tebex.plugin.libs.gson.TypeAdapter

Methods:
- TypeAdapter<TT> getSerializationDelegate()

### Class: io.tebex.plugin.libs.gson.internal.bind.TreeTypeAdapter
Type: Class
Extends: io.tebex.plugin.libs.gson.internal.bind.SerializationDelegatingTypeAdapter

Methods:
- TT read(JsonReader) throws IOException
- **static** TypeAdapterFactory newFactory(TypeToken<*>, Object)
- TypeAdapter<TT> getSerializationDelegate()
- **static** TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<*>, Object)
- **static** TypeAdapterFactory newTypeHierarchyFactory(Class<*>, Object)
- V write(JsonWriter, T) throws IOException

### Class: io.tebex.plugin.libs.gson.internal.bind.TypeAdapters
Type: Class

Methods:
- **static** TypeAdapterFactory newFactory(TypeToken<TTT>, TypeAdapter<TTT>)
- **static** TypeAdapterFactory newFactory(Class<TTT>, TypeAdapter<TTT>)
- **static** TypeAdapterFactory newFactory(Class<TTT>, Class<TTT>, TypeAdapter<-TTT>)
- **static** TypeAdapterFactory newFactoryForMultipleTypes(Class<TTT>, Class<+TTT>, TypeAdapter<-TTT>)
- **static** TypeAdapterFactory newTypeHierarchyFactory(Class<TT1>, TypeAdapter<TT1>)

## Package: io.tebex.plugin.libs.gson.internal.bind.util

### Class: io.tebex.plugin.libs.gson.internal.bind.util.ISO8601Utils
Type: Class

Methods:
- **static** String format(Date)
- **static** String format(Date, boolean)
- **static** String format(Date, boolean, TimeZone)
- **static** Date parse(String, ParsePosition) throws ParseException

## Package: io.tebex.plugin.libs.gson.internal.reflect

### Class: io.tebex.plugin.libs.gson.internal.reflect.ReflectionHelper
Type: Class

Methods:
- **static** Constructor<TT> getCanonicalRecordConstructor(Class<TT>)
- **static** String getAccessibleObjectDescription(AccessibleObject, boolean)
- **static** String fieldToString(Field)
- **static** String constructorToString(Constructor<*>)
- **static** Method getAccessor(Class<*>, Field)
- **static** Z isRecord(Class<*>)
- **static** RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException)
- **static** void makeAccessible(AccessibleObject) throws JsonIOException
- **static** String tryMakeAccessible(Constructor<*>)
- **static** String getRecordComponentNames(Class<*>)

## Package: io.tebex.plugin.libs.gson.internal.sql

### Class: io.tebex.plugin.libs.gson.internal.sql.SqlTypesSupport
Type: Class

No public methods found

## Package: io.tebex.plugin.libs.gson.reflect

### Class: io.tebex.plugin.libs.gson.reflect.TypeToken
Type: Class

Methods:
- Class<-TT> getRawType()
- Type getType()
- int hashCode()
- **static** TypeToken<*> get(Type)
- **static** TypeToken<TT> get(Class<TT>)
- boolean equals(Object)
- **static** TypeToken<*> getArray(Type)
- String toString()
- Z isAssignableFrom(Class<*>)
- boolean isAssignableFrom(Type)
- Z isAssignableFrom(TypeToken<*>)
- **static** TypeToken<*> getParameterized(Type, Type)

## Package: io.tebex.plugin.libs.gson.stream

### Class: io.tebex.plugin.libs.gson.stream.JsonReader
Type: Class
Implements: java.io.Closeable

Methods:
- void skipValue() throws IOException
- String getPreviousPath()
- boolean isLenient()
- boolean hasNext() throws IOException
- int nextInt() throws IOException
- long nextLong() throws IOException
- String nextString() throws IOException
- void endArray() throws IOException
- void setLenient(boolean)
- double nextDouble() throws IOException
- JsonToken peek() throws IOException
- void endObject() throws IOException
- void beginArray() throws IOException
- void beginObject() throws IOException
- String getPath()
- String toString()
- boolean nextBoolean() throws IOException
- void close() throws IOException
- String nextName() throws IOException
- void nextNull() throws IOException

### Class: io.tebex.plugin.libs.gson.stream.JsonToken
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BEGIN_ARRAY
- END_ARRAY
- BEGIN_OBJECT
- END_OBJECT
- NAME
- STRING
- NUMBER
- BOOLEAN
- NULL
- END_DOCUMENT

Methods:
- **static** JsonToken valueOf(String)
- **static** JsonToken[] values()

### Class: io.tebex.plugin.libs.gson.stream.JsonWriter
Type: Class
Implements: java.io.Closeable, java.io.Flushable

Methods:
- void setSerializeNulls(boolean)
- void setHtmlSafe(boolean)
- JsonWriter jsonValue(String) throws IOException
- boolean isLenient()
- JsonWriter endArray() throws IOException
- JsonWriter nullValue() throws IOException
- void setLenient(boolean)
- JsonWriter endObject() throws IOException
- JsonWriter beginArray() throws IOException
- void flush() throws IOException
- JsonWriter beginObject() throws IOException
- boolean getSerializeNulls()
- JsonWriter name(String) throws IOException
- void setIndent(String)
- boolean isHtmlSafe()
- void close() throws IOException
- JsonWriter value(String) throws IOException
- JsonWriter value(boolean) throws IOException
- JsonWriter value(Boolean) throws IOException
- JsonWriter value(float) throws IOException
- JsonWriter value(double) throws IOException
- JsonWriter value(long) throws IOException
- JsonWriter value(Number) throws IOException

### Class: io.tebex.plugin.libs.gson.stream.MalformedJsonException
Type: Class
Extends: java.io.IOException

No public methods found

## Package: io.tebex.plugin.libs.jetbrains

### Class: io.tebex.plugin.libs.jetbrains.NonNls
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.jetbrains.NotNull
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class<Exception> exception()
- String value()

### Class: io.tebex.plugin.libs.jetbrains.Nullable
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

## Package: io.tebex.plugin.libs.kotlin

### Class: io.tebex.plugin.libs.kotlin.BuilderInference
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.Deprecated
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- DeprecationLevel level()
- String message()
- ReplaceWith replaceWith()

### Class: io.tebex.plugin.libs.kotlin.DeprecatedSinceKotlin
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String hiddenSince()
- String warningSince()
- String errorSince()

### Class: io.tebex.plugin.libs.kotlin.ExperimentalStdlibApi
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.ExperimentalUnsignedTypes
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.Function
Type: Interface

No public methods found

### Class: io.tebex.plugin.libs.kotlin.Lazy
Type: Interface

Methods:
- TT getValue()
- boolean isInitialized()

### Class: io.tebex.plugin.libs.kotlin.Metadata
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- int xi()
- int[] bv()
- int[] mv()
- String xs()
- int k()
- String[] d1()
- String pn()
- String[] d2()

### Class: io.tebex.plugin.libs.kotlin.OverloadResolutionByLambdaReturnType
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.PublishedApi
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.ReplaceWith
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] imports()
- String expression()

### Class: io.tebex.plugin.libs.kotlin.RequiresOptIn
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- RequiresOptIn$Level level()
- String message()

### Class: io.tebex.plugin.libs.kotlin.SinceKotlin
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String version()

### Class: io.tebex.plugin.libs.kotlin.WasExperimental
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class<Annotation> markerClass()

### Class: io.tebex.plugin.libs.kotlin.DeprecationLevel
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- WARNING
- ERROR
- HIDDEN

Methods:
- **static** EnumEntries<DeprecationLevel> getEntries()
- **static** DeprecationLevel valueOf(String)
- **static** DeprecationLevel[] values()

### Class: io.tebex.plugin.libs.kotlin.ExceptionsKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.ExceptionsKt__ExceptionsKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.InitializedLazyImpl
Type: Class
Implements: io.tebex.plugin.libs.kotlin.Lazy, java.io.Serializable

Methods:
- TT getValue()
- boolean isInitialized()
- String toString()

### Class: io.tebex.plugin.libs.kotlin.KotlinNothingValueException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: io.tebex.plugin.libs.kotlin.KotlinNullPointerException
Type: Class
Extends: java.lang.NullPointerException

No public methods found

### Class: io.tebex.plugin.libs.kotlin.KotlinVersion
Type: Class
Implements: java.lang.Comparable

Methods:
- int getMinor()
- boolean isAtLeast(int, int)
- boolean isAtLeast(int, int, int)
- int hashCode()
- boolean equals(Object)
- int getPatch()
- int getMajor()
- String toString()
- int compareTo(KotlinVersion)
- int compareTo(Object)

### Class: io.tebex.plugin.libs.kotlin.KotlinVersion$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.LazyKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.LazyKt__LazyKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.LazyKt__LazyJVMKt$WhenMappings
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.LazyThreadSafetyMode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SYNCHRONIZED
- PUBLICATION
- NONE

Methods:
- **static** EnumEntries<LazyThreadSafetyMode> getEntries()
- **static** LazyThreadSafetyMode valueOf(String)
- **static** LazyThreadSafetyMode[] values()

### Class: io.tebex.plugin.libs.kotlin.Metadata$DefaultImpls
Type: Class

Methods:
- **static** void bv$annotations()
- **static** void pn$annotations()
- **static** void xi$annotations()

### Class: io.tebex.plugin.libs.kotlin.NoWhenBranchMatchedException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: io.tebex.plugin.libs.kotlin.NotImplementedError
Type: Class
Extends: java.lang.Error

No public methods found

### Class: io.tebex.plugin.libs.kotlin.Pair
Type: Class
Implements: java.io.Serializable

Methods:
- TA component1()
- TB component2()
- int hashCode()
- **static** Pair copy$default(Pair, Object, Object, int, Object)
- TA getFirst()
- boolean equals(Object)
- TB getSecond()
- String toString()
- Pair<TA, TB> copy(T, A)

### Class: io.tebex.plugin.libs.kotlin.RequiresOptIn$Level
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- WARNING
- ERROR

Methods:
- **static** EnumEntries<RequiresOptIn$Level> getEntries()
- **static** RequiresOptIn$Level valueOf(String)
- **static** RequiresOptIn$Level[] values()

### Class: io.tebex.plugin.libs.kotlin.Result
Type: Class
Implements: java.io.Serializable

Methods:
- **static** String toString-impl(Object)
- **static** boolean equals-impl(Object, Object)
- Object unbox-impl()
- **static** boolean isFailure-impl(Object)
- **static** int hashCode-impl(Object)
- **static** boolean isSuccess-impl(Object)
- **static** Object constructor-impl(Object)
- **static** Result box-impl(Object)
- **static** void getValue$annotations()
- int hashCode()
- **static** Throwable exceptionOrNull-impl(Object)
- boolean equals(Object)
- **static** boolean equals-impl0(Object, Object)
- String toString()

### Class: io.tebex.plugin.libs.kotlin.Result$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.Result$Failure
Type: Class
Implements: java.io.Serializable

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: io.tebex.plugin.libs.kotlin.ResultKt
Type: Class

Methods:
- **static** void throwOnFailure(Object)
- **static** Object createFailure(Throwable)

### Class: io.tebex.plugin.libs.kotlin.SafePublicationLazyImpl$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.Triple
Type: Class
Implements: java.io.Serializable

Methods:
- TA component1()
- TC getThird()
- TB component2()
- TC component3()
- int hashCode()
- **static** Triple copy$default(Triple, Object, Object, Object, int, Object)
- TA getFirst()
- boolean equals(Object)
- TB getSecond()
- String toString()
- Triple<TA, TB, TC> copy(T, A, ;)

### Class: io.tebex.plugin.libs.kotlin.TuplesKt
Type: Class

Methods:
- **static** List<TT> toList(Pair<+TT, +TT>)
- **static** List<TT> toList(Triple<+TT, +TT, +TT>)
- **static** Pair<TA, TB> to(T, A)

### Class: io.tebex.plugin.libs.kotlin.UByte
Type: Class
Implements: java.lang.Comparable

Methods:
- **static** byte constructor-impl(byte)
- **static** String toString-impl(byte)
- **static** void getData$annotations()
- **static** UByte box-impl(byte)
- **static** boolean equals-impl(byte, Object)
- int hashCode()
- boolean equals(Object)
- **static** boolean equals-impl0(byte, byte)
- String toString()
- int compareTo(Object)
- byte unbox-impl()
- **static** int hashCode-impl(byte)

### Class: io.tebex.plugin.libs.kotlin.UByte$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.UByteArray
Type: Class
Implements: java.util.Collection, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- **static** boolean contains-7apg3OU(byte[], byte)
- boolean contains-7apg3OU(byte)
- **static** byte get-w2LRezQ(byte[], int)
- byte[] unbox-impl()
- boolean remove(Object)
- **static** int hashCode-impl(byte[])
- Z removeAll(Collection<Object>)
- Iterator<UByte> iterator()
- **static** UByteArray box-impl(byte[])
- int hashCode()
- [TT toArray([T)
- Object[] toArray()
- **static** void set-VurrAj0(byte[], int, byte)
- boolean add(Object)
- **static** String toString-impl(byte[])
- **static** boolean equals-impl(byte[], Object)
- Z containsAll(Collection<Object>)
- void clear()
- boolean isEmpty()
- **static** void getStorage$annotations()
- **static** boolean isEmpty-impl(byte[])
- **static** Z containsAll-impl([B, Collection<UByte>)
- **static** byte[] constructor-impl(int)
- **static** byte[] constructor-impl(byte[])
- boolean contains(Object)
- boolean add-7apg3OU(byte)
- int getSize()
- int size()
- Z addAll(Collection<UByte>)
- **static** int getSize-impl(byte[])
- **static** Iterator<UByte> iterator-impl([B)
- boolean equals(Object)
- **static** boolean equals-impl0(byte[], byte[])
- String toString()
- Z retainAll(Collection<Object>)

### Class: io.tebex.plugin.libs.kotlin.UInt
Type: Class
Implements: java.lang.Comparable

Methods:
- **static** int constructor-impl(int)
- **static** String toString-impl(int)
- **static** void getData$annotations()
- **static** UInt box-impl(int)
- **static** boolean equals-impl(int, Object)
- int hashCode()
- boolean equals(Object)
- **static** boolean equals-impl0(int, int)
- String toString()
- int compareTo(Object)
- int unbox-impl()
- **static** int hashCode-impl(int)

### Class: io.tebex.plugin.libs.kotlin.UInt$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.UIntArray
Type: Class
Implements: java.util.Collection, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- int[] unbox-impl()
- boolean remove(Object)
- **static** int hashCode-impl(int[])
- Z removeAll(Collection<Object>)
- boolean add-WZ4Q5Ns(int)
- Iterator<UInt> iterator()
- **static** UIntArray box-impl(int[])
- int hashCode()
- **static** int get-pVg5ArA(int[], int)
- [TT toArray([T)
- Object[] toArray()
- boolean add(Object)
- **static** String toString-impl(int[])
- **static** boolean equals-impl(int[], Object)
- **static** boolean contains-WZ4Q5Ns(int[], int)
- boolean contains-WZ4Q5Ns(int)
- Z containsAll(Collection<Object>)
- void clear()
- boolean isEmpty()
- **static** void set-VXSXFK8(int[], int, int)
- **static** void getStorage$annotations()
- **static** boolean isEmpty-impl(int[])
- **static** Z containsAll-impl([I, Collection<UInt>)
- **static** int[] constructor-impl(int)
- **static** int[] constructor-impl(int[])
- boolean contains(Object)
- int getSize()
- int size()
- Z addAll(Collection<UInt>)
- **static** int getSize-impl(int[])
- **static** Iterator<UInt> iterator-impl([I)
- boolean equals(Object)
- **static** boolean equals-impl0(int[], int[])
- String toString()
- Z retainAll(Collection<Object>)

### Class: io.tebex.plugin.libs.kotlin.ULong
Type: Class
Implements: java.lang.Comparable

Methods:
- **static** long constructor-impl(long)
- **static** String toString-impl(long)
- **static** void getData$annotations()
- **static** ULong box-impl(long)
- **static** boolean equals-impl(long, Object)
- int hashCode()
- boolean equals(Object)
- **static** boolean equals-impl0(long, long)
- String toString()
- int compareTo(Object)
- long unbox-impl()
- **static** int hashCode-impl(long)

### Class: io.tebex.plugin.libs.kotlin.ULong$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.ULongArray
Type: Class
Implements: java.util.Collection, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- **static** void set-k8EXiF4(long[], int, long)
- boolean add-VKZWuLQ(long)
- long[] unbox-impl()
- boolean remove(Object)
- **static** int hashCode-impl(long[])
- Z removeAll(Collection<Object>)
- Iterator<ULong> iterator()
- **static** ULongArray box-impl(long[])
- int hashCode()
- [TT toArray([T)
- Object[] toArray()
- boolean add(Object)
- **static** String toString-impl(long[])
- **static** boolean equals-impl(long[], Object)
- Z containsAll(Collection<Object>)
- void clear()
- boolean isEmpty()
- **static** void getStorage$annotations()
- **static** boolean isEmpty-impl(long[])
- **static** Z containsAll-impl([J, Collection<ULong>)
- **static** long[] constructor-impl(int)
- **static** long[] constructor-impl(long[])
- boolean contains(Object)
- int getSize()
- int size()
- Z addAll(Collection<ULong>)
- **static** int getSize-impl(long[])
- **static** Iterator<ULong> iterator-impl([J)
- boolean equals(Object)
- **static** long get-s-VKNKU(long[], int)
- **static** boolean equals-impl0(long[], long[])
- String toString()
- **static** boolean contains-VKZWuLQ(long[], long)
- boolean contains-VKZWuLQ(long)
- Z retainAll(Collection<Object>)

### Class: io.tebex.plugin.libs.kotlin.UNINITIALIZED_VALUE
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.UShort
Type: Class
Implements: java.lang.Comparable

Methods:
- **static** short constructor-impl(short)
- **static** String toString-impl(short)
- **static** void getData$annotations()
- **static** UShort box-impl(short)
- **static** boolean equals-impl(short, Object)
- int hashCode()
- boolean equals(Object)
- **static** boolean equals-impl0(short, short)
- String toString()
- int compareTo(Object)
- short unbox-impl()
- **static** int hashCode-impl(short)

### Class: io.tebex.plugin.libs.kotlin.UShort$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.UShortArray
Type: Class
Implements: java.util.Collection, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- short[] unbox-impl()
- boolean add-xj2QHRw(short)
- boolean remove(Object)
- **static** int hashCode-impl(short[])
- Z removeAll(Collection<Object>)
- Iterator<UShort> iterator()
- **static** UShortArray box-impl(short[])
- int hashCode()
- **static** short get-Mh2AYeg(short[], int)
- [TT toArray([T)
- Object[] toArray()
- boolean add(Object)
- **static** String toString-impl(short[])
- **static** boolean equals-impl(short[], Object)
- **static** void set-01HTLdE(short[], int, short)
- Z containsAll(Collection<Object>)
- **static** boolean contains-xj2QHRw(short[], short)
- boolean contains-xj2QHRw(short)
- void clear()
- boolean isEmpty()
- **static** void getStorage$annotations()
- **static** boolean isEmpty-impl(short[])
- **static** Z containsAll-impl([S, Collection<UShort>)
- **static** short[] constructor-impl(int)
- **static** short[] constructor-impl(short[])
- boolean contains(Object)
- int getSize()
- int size()
- Z addAll(Collection<UShort>)
- **static** int getSize-impl(short[])
- **static** Iterator<UShort> iterator-impl([S)
- boolean equals(Object)
- **static** boolean equals-impl0(short[], short[])
- String toString()
- Z retainAll(Collection<Object>)

### Class: io.tebex.plugin.libs.kotlin.UninitializedPropertyAccessException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: io.tebex.plugin.libs.kotlin.Unit
Type: Class

Methods:
- String toString()

### Class: io.tebex.plugin.libs.kotlin.UnsafeLazyImpl
Type: Class
Implements: io.tebex.plugin.libs.kotlin.Lazy, java.io.Serializable

Methods:
- TT getValue()
- boolean isInitialized()
- String toString()

### Class: io.tebex.plugin.libs.kotlin.UnsignedKt
Type: Class

Methods:
- **static** long doubleToULong(double)
- **static** int ulongCompare(long, long)
- **static** long ulongRemainder-eb3DHEI(long, long)
- **static** int doubleToUInt(double)
- **static** double uintToDouble(int)
- **static** String ulongToString(long)
- **static** String ulongToString(long, int)
- **static** double ulongToDouble(long)
- **static** long ulongDivide-eb3DHEI(long, long)
- **static** int uintRemainder-J1ME1BU(int, int)
- **static** int uintDivide-J1ME1BU(int, int)
- **static** int uintCompare(int, int)

## Package: io.tebex.plugin.libs.kotlin.annotation

### Class: io.tebex.plugin.libs.kotlin.annotation.MustBeDocumented
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.annotation.Retention
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- AnnotationRetention value()

### Class: io.tebex.plugin.libs.kotlin.annotation.Target
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- AnnotationTarget[] allowedTargets()

### Class: io.tebex.plugin.libs.kotlin.annotation.AnnotationRetention
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SOURCE
- BINARY
- RUNTIME

Methods:
- **static** EnumEntries<AnnotationRetention> getEntries()
- **static** AnnotationRetention valueOf(String)
- **static** AnnotationRetention[] values()

### Class: io.tebex.plugin.libs.kotlin.annotation.AnnotationTarget
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CLASS
- ANNOTATION_CLASS
- TYPE_PARAMETER
- PROPERTY
- FIELD
- LOCAL_VARIABLE
- VALUE_PARAMETER
- CONSTRUCTOR
- FUNCTION
- PROPERTY_GETTER
- PROPERTY_SETTER
- TYPE
- EXPRESSION
- FILE
- TYPEALIAS

Methods:
- **static** EnumEntries<AnnotationTarget> getEntries()
- **static** AnnotationTarget valueOf(String)
- **static** AnnotationTarget[] values()

## Package: io.tebex.plugin.libs.kotlin.collections

### Class: io.tebex.plugin.libs.kotlin.collections.Grouping
Type: Interface

Methods:
- TK keyOf(T)
- Iterator<TT> sourceIterator()

### Class: io.tebex.plugin.libs.kotlin.collections.AbstractCollection
Type: Abstract Class
Implements: java.util.Collection, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Z add(T)
- Z containsAll(Collection<Object>)
- void clear()
- boolean isEmpty()
- boolean remove(Object)
- Z removeAll(Collection<Object>)
- Z contains(T)
- Iterator<TE> iterator()
- int getSize()
- int size()
- Z addAll(Collection<+TE>)
- Object[] toArray()
- [TT toArray([T)
- String toString()
- Z retainAll(Collection<Object>)

### Class: io.tebex.plugin.libs.kotlin.collections.AbstractIterator
Type: Abstract Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TT next()
- boolean hasNext()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.collections.AbstractIterator$WhenMappings
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.collections.AbstractList
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractCollection
Implements: java.util.List, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- V add(int, T)
- I lastIndexOf(T)
- List<TE> subList(int, int)
- Iterator<TE> iterator()
- int getSize()
- TE set(int, T)
- Z addAll(int, Collection<+TE>)
- int hashCode()
- boolean equals(Object)
- TE get(int)
- ListIterator<TE> listIterator()
- ListIterator<TE> listIterator(int)
- I indexOf(T)
- TE remove(int)

### Class: io.tebex.plugin.libs.kotlin.collections.AbstractList$Companion
Type: Class

Methods:
- void checkElementIndex$kotlin_stdlib(int, int)
- void checkBoundsIndexes$kotlin_stdlib(int, int, int)
- void checkRangeIndexes$kotlin_stdlib(int, int, int)
- Z orderedEquals$kotlin_stdlib(Collection<*>, Collection<*>)
- I orderedHashCode$kotlin_stdlib(Collection<*>)
- void checkPositionIndex$kotlin_stdlib(int, int)

### Class: io.tebex.plugin.libs.kotlin.collections.AbstractMutableCollection
Type: Abstract Class
Extends: java.util.AbstractCollection
Implements: java.util.Collection, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableCollection

Methods:
- Z add(T)
- int getSize()
- int size()

### Class: io.tebex.plugin.libs.kotlin.collections.AbstractMutableList
Type: Abstract Class
Extends: java.util.AbstractList
Implements: java.util.List, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableList

Methods:
- V add(int, T)
- int getSize()
- TE set(int, T)
- int size()
- TE removeAt(int)
- TE remove(int)

### Class: io.tebex.plugin.libs.kotlin.collections.AbstractMutableSet
Type: Abstract Class
Extends: java.util.AbstractSet
Implements: java.util.Set, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableSet

Methods:
- Z add(T)
- int getSize()
- int size()

### Class: io.tebex.plugin.libs.kotlin.collections.ArrayDeque
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractMutableList

Methods:
- V internalStructure$kotlin_stdlib(Function2<Integer, Object, Unit>)
- TE removeLast()
- boolean remove(Object)
- V addLast(T)
- Z removeAll(Collection<Object>)
- TE get(int)
- TE removeFirst()
- [TT toArray([T)
- Object[] toArray()
- int indexOf(Object)
- TE lastOrNull()
- Z add(T)
- V add(int, T)
- TE set(int, T)
- TE last()
- void clear()
- boolean isEmpty()
- TE removeFirstOrNull()
- int lastIndexOf(Object)
- boolean contains(Object)
- int getSize()
- Z addAll(Collection<+TE>)
- Z addAll(int, Collection<+TE>)
- TE removeLastOrNull()
- TE firstOrNull()
- [TT testToArray$kotlin_stdlib([T)
- Object[] testToArray$kotlin_stdlib()
- TE removeAt(int)
- V addFirst(T)
- TE first()
- Z retainAll(Collection<Object>)

### Class: io.tebex.plugin.libs.kotlin.collections.ArrayDeque$Companion
Type: Class

Methods:
- int newCapacity$kotlin_stdlib(int, int)

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysJvmKt$asList$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(byte)
- int lastIndexOf(Object)
- boolean contains(byte)
- boolean contains(Object)
- int getSize()
- Byte get(int)
- Object get(int)
- boolean isEmpty()
- int indexOf(byte)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysJvmKt$asList$2
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(short)
- int lastIndexOf(Object)
- boolean contains(short)
- boolean contains(Object)
- int getSize()
- Short get(int)
- Object get(int)
- boolean isEmpty()
- int indexOf(short)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysJvmKt$asList$3
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(int)
- int lastIndexOf(Object)
- boolean contains(int)
- boolean contains(Object)
- int getSize()
- Integer get(int)
- Object get(int)
- boolean isEmpty()
- int indexOf(int)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysJvmKt$asList$4
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(long)
- int lastIndexOf(Object)
- boolean contains(long)
- boolean contains(Object)
- int getSize()
- Long get(int)
- Object get(int)
- boolean isEmpty()
- int indexOf(long)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysJvmKt$asList$5
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(float)
- int lastIndexOf(Object)
- boolean contains(float)
- boolean contains(Object)
- int getSize()
- Float get(int)
- Object get(int)
- boolean isEmpty()
- int indexOf(float)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysJvmKt$asList$6
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(double)
- int lastIndexOf(Object)
- boolean contains(double)
- boolean contains(Object)
- int getSize()
- Double get(int)
- Object get(int)
- boolean isEmpty()
- int indexOf(double)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysJvmKt$asList$7
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(boolean)
- int lastIndexOf(Object)
- boolean contains(boolean)
- boolean contains(Object)
- int getSize()
- Boolean get(int)
- Object get(int)
- boolean isEmpty()
- int indexOf(boolean)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysJvmKt$asList$8
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(char)
- int lastIndexOf(Object)
- boolean contains(char)
- boolean contains(Object)
- int getSize()
- Character get(int)
- Object get(int)
- boolean isEmpty()
- int indexOf(char)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<Byte> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<Short> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<Integer> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<Long> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<Float> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<Double> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<Boolean> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<Character> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$2
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<Byte> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<Short> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<Integer> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$5
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<Long> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$6
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<Float> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$7
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<Double> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<Boolean> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<Character> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.ArraysKt___ArraysKt$groupingBy$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.collections.Grouping

Methods:
- TK keyOf(T)
- Iterator<TT> sourceIterator()

### Class: io.tebex.plugin.libs.kotlin.collections.BooleanIterator
Type: Abstract Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Boolean next()
- Object next()
- boolean nextBoolean()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.collections.ByteIterator
Type: Abstract Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Byte next()
- Object next()
- byte nextByte()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.collections.CharIterator
Type: Abstract Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Character next()
- Object next()
- char nextChar()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.collections.CollectionsKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.CollectionsKt___CollectionsKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.Lambda
Implements: io.tebex.plugin.libs.kotlin.jvm.functions.Function1

Methods:
- Integer invoke(T)
- Object invoke(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.CollectionsKt__IterablesKt$Iterable$1
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.CollectionsKt__IteratorsJVMKt$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TT next()
- boolean hasNext()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.CollectionsKt___CollectionsKt$groupingBy$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.collections.Grouping

Methods:
- TK keyOf(T)
- Iterator<TT> sourceIterator()

### Class: io.tebex.plugin.libs.kotlin.collections.DoubleIterator
Type: Abstract Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Double next()
- Object next()
- void remove()
- double nextDouble()

### Class: io.tebex.plugin.libs.kotlin.collections.EmptyIterator
Type: Class
Implements: java.util.ListIterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- void add(Void)
- void add(Object)
- Void next()
- Object next()
- void set(Void)
- void set(Object)
- Void previous()
- Object previous()
- boolean hasPrevious()
- boolean hasNext()
- int nextIndex()
- void remove()
- int previousIndex()

### Class: io.tebex.plugin.libs.kotlin.collections.EmptyList
Type: Class
Implements: java.util.List, java.io.Serializable, java.util.RandomAccess, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- boolean add(Void)
- void add(int, Void)
- boolean add(Object)
- void add(int, Object)
- List subList(int, int)
- Void set(int, Void)
- Object set(int, Object)
- boolean containsAll(Collection)
- void clear()
- boolean isEmpty()
- boolean remove(Object)
- Void remove(int)
- Object remove(int)
- int lastIndexOf(Void)
- int lastIndexOf(Object)
- boolean removeAll(Collection)
- Iterator iterator()
- boolean contains(Void)
- boolean contains(Object)
- int getSize()
- int size()
- boolean addAll(int, Collection)
- boolean addAll(Collection)
- int hashCode()
- Void get(int)
- Object get(int)
- boolean equals(Object)
- [TT toArray([T)
- Object[] toArray()
- ListIterator listIterator()
- ListIterator listIterator(int)
- String toString()
- int indexOf(Void)
- int indexOf(Object)
- boolean retainAll(Collection)

### Class: io.tebex.plugin.libs.kotlin.collections.EmptySet
Type: Class
Implements: java.util.Set, java.io.Serializable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- boolean add(Void)
- boolean add(Object)
- boolean containsAll(Collection)
- void clear()
- boolean isEmpty()
- boolean remove(Object)
- boolean removeAll(Collection)
- Iterator iterator()
- boolean contains(Void)
- boolean contains(Object)
- int getSize()
- int size()
- boolean addAll(Collection)
- int hashCode()
- boolean equals(Object)
- [TT toArray([T)
- Object[] toArray()
- String toString()
- boolean retainAll(Collection)

### Class: io.tebex.plugin.libs.kotlin.collections.FloatIterator
Type: Abstract Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- float nextFloat()
- Float next()
- Object next()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.collections.IndexedValue
Type: Class

Methods:
- int component1()
- TT component2()
- TT getValue()
- int getIndex()
- int hashCode()
- **static** IndexedValue copy$default(IndexedValue, int, Object, int, Object)
- boolean equals(Object)
- String toString()
- IndexedValue<TT> copy(int, T)

### Class: io.tebex.plugin.libs.kotlin.collections.IndexingIterable
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<IndexedValue<TT>> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.IndexingIterator
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- IndexedValue<TT> next()
- Object next()
- boolean hasNext()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.collections.IntIterator
Type: Abstract Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Integer next()
- Object next()
- int nextInt()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.collections.LongIterator
Type: Abstract Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Long next()
- Object next()
- long nextLong()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.collections.MapsKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.MapsKt___MapsKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.collections.MovingSubList
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int getSize()
- void move(int, int)
- TE get(int)

### Class: io.tebex.plugin.libs.kotlin.collections.ReversedList$listIterator$1
Type: Class
Implements: java.util.ListIterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableListIterator

Methods:
- V add(T)
- TT next()
- V set(T)
- TT previous()
- boolean hasPrevious()
- boolean hasNext()
- int nextIndex()
- ListIterator<TT> getDelegateIterator()
- void remove()
- int previousIndex()

### Class: io.tebex.plugin.libs.kotlin.collections.ReversedListReadOnly$listIterator$1
Type: Class
Implements: java.util.ListIterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- V add(T)
- TT next()
- V set(T)
- TT previous()
- boolean hasPrevious()
- boolean hasNext()
- int nextIndex()
- ListIterator<TT> getDelegateIterator()
- void remove()
- int previousIndex()

### Class: io.tebex.plugin.libs.kotlin.collections.RingBuffer$iterator$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractIterator

No public methods found

### Class: io.tebex.plugin.libs.kotlin.collections.SetsKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.SetsKt___SetsKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.collections.ShortIterator
Type: Abstract Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Short next()
- Object next()
- short nextShort()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.collections.SlidingWindowKt
Type: Class

Methods:
- **static** Iterator<List<TT>> windowedIterator(Iterator<+TT>, int, int, boolean, boolean)
- **static** void checkWindowSizeStep(int, int)
- **static** Sequence<List<TT>> windowedSequence(Sequence<+TT>, int, int, boolean, boolean)

### Class: io.tebex.plugin.libs.kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<List<+TT>> iterator()

### Class: io.tebex.plugin.libs.kotlin.collections.UArraySortingKt
Type: Class

Methods:
- **static** void sortArray--nroSd4(long[], int, int)
- **static** void sortArray-Aa5vz7o(short[], int, int)
- **static** void sortArray-4UcCI2c(byte[], int, int)
- **static** void sortArray-oBK06Vg(int[], int, int)

## Package: io.tebex.plugin.libs.kotlin.collections.builders

### Class: io.tebex.plugin.libs.kotlin.collections.builders.AbstractMapBuilderEntrySet
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractMutableSet

Methods:
- Z containsEntry(Map$Entry<+TK, +TV>)
- Z contains(T)
- boolean contains(Object)
- Z remove(Map$Entry<**>)
- boolean remove(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.builders.ListBuilder
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractMutableList
Implements: java.util.List, java.util.RandomAccess, java.io.Serializable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableList

Methods:
- Z add(T)
- V add(int, T)
- **static** int access$getOffset$p(ListBuilder)
- List<TE> subList(int, int)
- TE set(int, T)
- **static** int access$getLength$p(ListBuilder)
- void clear()
- boolean isEmpty()
- boolean remove(Object)
- int lastIndexOf(Object)
- Z removeAll(Collection<Object>)
- Iterator<TE> iterator()
- int getSize()
- Z addAll(Collection<+TE>)
- Z addAll(int, Collection<+TE>)
- List<TE> build()
- **static** Object[] access$getArray$p(ListBuilder)
- int hashCode()
- boolean equals(Object)
- TE get(int)
- [TT toArray([T)
- Object[] toArray()
- TE removeAt(int)
- ListIterator<TE> listIterator()
- ListIterator<TE> listIterator(int)
- String toString()
- int indexOf(Object)
- Z retainAll(Collection<Object>)

### Class: io.tebex.plugin.libs.kotlin.collections.builders.ListBuilderKt
Type: Class

Methods:
- **static** boolean access$subarrayContentEquals(Object[], int, int, List)
- **static** [TE arrayOfUninitializedElements(int)
- **static** String access$subarrayContentToString(Object[], int, int)
- **static** V resetAt([T, E)
- **static** V resetRange([T, E, ;)
- **static** int access$subarrayContentHashCode(Object[], int, int)
- **static** [TT copyOfUninitializedElements([T, T)

### Class: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilder
Type: Class
Implements: java.util.Map, java.io.Serializable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableMap

Methods:
- **static** MapBuilder access$getEmpty$cp()
- **static** void access$removeKeyAt(MapBuilder, int)
- **static** int access$getLength$p(MapBuilder)
- Collection<TV> values()
- TV remove(Object)
- TV put(T, K)
- boolean containsValue(Object)
- Z removeValue$kotlin_stdlib(T)
- I addKey$kotlin_stdlib(T)
- Z removeEntry$kotlin_stdlib(Map$Entry<+TK, +TV>)
- int hashCode()
- **static** int[] access$getPresenceArray$p(MapBuilder)
- V putAll(Map<+TK, +TV>)
- TV get(Object)
- **static** Object[] access$getValuesArray$p(MapBuilder)
- Set<TK> keySet()
- void checkIsMutable$kotlin_stdlib()
- **static** Object[] access$getKeysArray$p(MapBuilder)
- Collection<TV> getValues()
- Set<Map$Entry<TK, TV>> entrySet()
- boolean containsKey(Object)
- void clear()
- boolean isEmpty()
- Z containsAllEntries$kotlin_stdlib(Collection<*>)
- int getCapacity$kotlin_stdlib()
- Set<TK> getKeys()
- Z containsEntry$kotlin_stdlib(Map$Entry<+TK, +TV>)
- boolean isReadOnly$kotlin_stdlib()
- MapBuilder$KeysItr<TK, TV> keysIterator$kotlin_stdlib()
- MapBuilder$EntriesItr<TK, TV> entriesIterator$kotlin_stdlib()
- int getSize()
- MapBuilder$ValuesItr<TK, TV> valuesIterator$kotlin_stdlib()
- int size()
- Set<Map$Entry<TK, TV>> getEntries()
- Map<TK, TV> build()
- boolean equals(Object)
- String toString()
- I removeKey$kotlin_stdlib(T)
- **static** Object[] access$allocateValuesArray(MapBuilder)

### Class: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilder$Companion
Type: Class

Methods:
- **static** int access$computeHashSize(MapBuilder$Companion, int)
- **static** int access$computeShift(MapBuilder$Companion, int)
- MapBuilder getEmpty$kotlin_stdlib()

### Class: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilder$EntriesItr
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilder$Itr
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableIterator

Methods:
- MapBuilder$EntryRef<TK, TV> next()
- Object next()
- int nextHashCode$kotlin_stdlib()
- void nextAppendString(StringBuilder)

### Class: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilder$EntryRef
Type: Class
Implements: java.util.Map$Entry, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableMap$Entry

Methods:
- TV getValue()
- TK getKey()
- int hashCode()
- boolean equals(Object)
- TV setValue(T)
- String toString()

### Class: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilder$Itr
Type: Class

Methods:
- int getLastIndex$kotlin_stdlib()
- int getIndex$kotlin_stdlib()
- void setLastIndex$kotlin_stdlib(int)
- MapBuilder<TK, TV> getMap$kotlin_stdlib()
- boolean hasNext()
- void initNext$kotlin_stdlib()
- void setIndex$kotlin_stdlib(int)
- void remove()

### Class: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilder$KeysItr
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilder$Itr
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableIterator

Methods:
- TK next()

### Class: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilder$ValuesItr
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilder$Itr
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableIterator

Methods:
- TV next()

### Class: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilderEntries
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.builders.AbstractMapBuilderEntrySet

Methods:
- Z add(Map$Entry<TK, TV>)
- boolean add(Object)
- Z containsEntry(Map$Entry<+TK, +TV>)
- Z removeAll(Collection<Object>)
- Iterator<Map$Entry<TK, TV>> iterator()
- int getSize()
- Z addAll(Collection<Map$Entry<TK, TV>>)
- Z containsAll(Collection<Object>)
- void clear()
- boolean isEmpty()
- boolean remove(Map$Entry)
- MapBuilder<TK, TV> getBacking()
- Z retainAll(Collection<Object>)

### Class: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilderKeys
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractMutableSet
Implements: java.util.Set, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableSet

Methods:
- Z add(T)
- Z removeAll(Collection<Object>)
- Iterator<TE> iterator()
- boolean contains(Object)
- int getSize()
- Z addAll(Collection<+TE>)
- void clear()
- boolean isEmpty()
- boolean remove(Object)
- Z retainAll(Collection<Object>)

### Class: io.tebex.plugin.libs.kotlin.collections.builders.MapBuilderValues
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractMutableCollection
Implements: java.util.Collection, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableCollection

Methods:
- Z add(T)
- Z removeAll(Collection<Object>)
- Iterator<TV> iterator()
- boolean contains(Object)
- int getSize()
- Z addAll(Collection<+TV>)
- void clear()
- boolean isEmpty()
- boolean remove(Object)
- MapBuilder<*TV> getBacking()
- Z retainAll(Collection<Object>)

### Class: io.tebex.plugin.libs.kotlin.collections.builders.SerializedCollection
Type: Class
Implements: java.io.Externalizable

Methods:
- void writeExternal(ObjectOutput)
- void readExternal(ObjectInput)

### Class: io.tebex.plugin.libs.kotlin.collections.builders.SerializedCollection$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.collections.builders.SerializedMap$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.collections.builders.SetBuilder
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractMutableSet
Implements: java.util.Set, java.io.Serializable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableSet

Methods:
- Z add(T)
- Z removeAll(Collection<Object>)
- Iterator<TE> iterator()
- boolean contains(Object)
- int getSize()
- Z addAll(Collection<+TE>)
- Set<TE> build()
- void clear()
- boolean isEmpty()
- boolean remove(Object)
- Z retainAll(Collection<Object>)

## Package: io.tebex.plugin.libs.kotlin.collections.unsigned

### Class: io.tebex.plugin.libs.kotlin.collections.unsigned.UArraysKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.unsigned.UArraysKt___UArraysKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(Object)
- boolean contains(Object)
- int getSize()
- int get-pVg5ArA(int)
- boolean contains-WZ4Q5Ns(int)
- Object get(int)
- boolean isEmpty()
- int indexOf(Object)
- int lastIndexOf-WZ4Q5Ns(int)
- int indexOf-WZ4Q5Ns(int)

### Class: io.tebex.plugin.libs.kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$2
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(Object)
- boolean contains(Object)
- int getSize()
- int indexOf-VKZWuLQ(long)
- Object get(int)
- int lastIndexOf-VKZWuLQ(long)
- long get-s-VKNKU(int)
- boolean isEmpty()
- boolean contains-VKZWuLQ(long)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$3
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(Object)
- int lastIndexOf-7apg3OU(byte)
- boolean contains(Object)
- int getSize()
- byte get-w2LRezQ(int)
- boolean contains-7apg3OU(byte)
- Object get(int)
- boolean isEmpty()
- int indexOf-7apg3OU(byte)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$4
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(Object)
- boolean contains(Object)
- int indexOf-xj2QHRw(short)
- int getSize()
- short get-Mh2AYeg(int)
- Object get(int)
- boolean contains-xj2QHRw(short)
- boolean isEmpty()
- int indexOf(Object)
- int lastIndexOf-xj2QHRw(short)

## Package: io.tebex.plugin.libs.kotlin.comparisons

### Class: io.tebex.plugin.libs.kotlin.comparisons.ComparisonsKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.comparisons.ComparisonsKt___ComparisonsKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2
Type: Class
Implements: java.util.Comparator

Methods:
- I compare(T, T)

### Class: io.tebex.plugin.libs.kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$3
Type: Class
Implements: java.util.Comparator

Methods:
- I compare(T, T)

### Class: io.tebex.plugin.libs.kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1
Type: Class
Implements: java.util.Comparator

Methods:
- I compare(T, T)

### Class: io.tebex.plugin.libs.kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$2
Type: Class
Implements: java.util.Comparator

Methods:
- I compare(T, T)

### Class: io.tebex.plugin.libs.kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$1
Type: Class
Implements: java.util.Comparator

Methods:
- I compare(T, T)

### Class: io.tebex.plugin.libs.kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$2
Type: Class
Implements: java.util.Comparator

Methods:
- I compare(T, T)

### Class: io.tebex.plugin.libs.kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$1
Type: Class
Implements: java.util.Comparator

Methods:
- I compare(T, T)

### Class: io.tebex.plugin.libs.kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$2
Type: Class
Implements: java.util.Comparator

Methods:
- I compare(T, T)

### Class: io.tebex.plugin.libs.kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenComparator$1
Type: Class
Implements: java.util.Comparator

Methods:
- I compare(T, T)

## Package: io.tebex.plugin.libs.kotlin.coroutines

### Class: io.tebex.plugin.libs.kotlin.coroutines.Continuation
Type: Interface

Methods:
- CoroutineContext getContext()
- void resumeWith(Object)

### Class: io.tebex.plugin.libs.kotlin.coroutines.ContinuationInterceptor
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.coroutines.CoroutineContext$Element

Methods:
- V releaseInterceptedContinuation(Continuation<*>)
- CoroutineContext minusKey(CoroutineContext$Key<*>)
- TE get(CoroutineContext$Key<TE>)
- Continuation<TT> interceptContinuation(Continuation<-TT>)

### Class: io.tebex.plugin.libs.kotlin.coroutines.CoroutineContext
Type: Interface

Methods:
- TR fold(T, R)
- CoroutineContext minusKey(CoroutineContext$Key<*>)
- TE get(CoroutineContext$Key<TE>)
- CoroutineContext plus(CoroutineContext)

### Class: io.tebex.plugin.libs.kotlin.coroutines.CoroutineContext$Element
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.coroutines.CoroutineContext

Methods:
- TR fold(T, R)
- CoroutineContext$Key<*> getKey()
- CoroutineContext minusKey(CoroutineContext$Key<*>)
- TE get(CoroutineContext$Key<TE>)

### Class: io.tebex.plugin.libs.kotlin.coroutines.CoroutineContext$Key
Type: Interface

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.RestrictsSuspension
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.AbstractCoroutineContextKey
Type: Abstract Class
Implements: io.tebex.plugin.libs.kotlin.coroutines.CoroutineContext$Key

Methods:
- TE tryCast$kotlin_stdlib(CoroutineContext$Element)
- Z isSubKey$kotlin_stdlib(CoroutineContext$Key<*>)

### Class: io.tebex.plugin.libs.kotlin.coroutines.CombinedContext
Type: Class
Implements: io.tebex.plugin.libs.kotlin.coroutines.CoroutineContext, java.io.Serializable

Methods:
- TR fold(T, R)
- int hashCode()
- CoroutineContext minusKey(CoroutineContext$Key<*>)
- boolean equals(Object)
- TE get(CoroutineContext$Key<TE>)
- String toString()
- CoroutineContext plus(CoroutineContext)

### Class: io.tebex.plugin.libs.kotlin.coroutines.CombinedContext$Serialized$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.ContinuationInterceptor$DefaultImpls
Type: Class

Methods:
- **static** V releaseInterceptedContinuation(ContinuationInterceptor, Continuation<*>)
- **static** TR fold(ContinuationInterceptor, T, R)
- **static** CoroutineContext minusKey(ContinuationInterceptor, CoroutineContext$Key<*>)
- **static** TE get(ContinuationInterceptor, CoroutineContext$Key<TE>)
- **static** CoroutineContext plus(ContinuationInterceptor, CoroutineContext)

### Class: io.tebex.plugin.libs.kotlin.coroutines.ContinuationInterceptor$Key
Type: Class
Implements: io.tebex.plugin.libs.kotlin.coroutines.CoroutineContext$Key

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.CoroutineContext$DefaultImpls
Type: Class

Methods:
- **static** CoroutineContext plus(CoroutineContext, CoroutineContext)

### Class: io.tebex.plugin.libs.kotlin.coroutines.CoroutineContext$Element$DefaultImpls
Type: Class

Methods:
- **static** TR fold(CoroutineContext$Element, T, R)
- **static** CoroutineContext minusKey(CoroutineContext$Element, CoroutineContext$Key<*>)
- **static** TE get(CoroutineContext$Element, CoroutineContext$Key<TE>)
- **static** CoroutineContext plus(CoroutineContext$Element, CoroutineContext)

### Class: io.tebex.plugin.libs.kotlin.coroutines.EmptyCoroutineContext
Type: Class
Implements: io.tebex.plugin.libs.kotlin.coroutines.CoroutineContext, java.io.Serializable

Methods:
- TR fold(T, R)
- int hashCode()
- CoroutineContext minusKey(CoroutineContext$Key<*>)
- TE get(CoroutineContext$Key<TE>)
- String toString()
- CoroutineContext plus(CoroutineContext)

## Package: io.tebex.plugin.libs.kotlin.coroutines.intrinsics

### Class: io.tebex.plugin.libs.kotlin.coroutines.intrinsics.CoroutineSingletons
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- COROUTINE_SUSPENDED
- UNDECIDED
- RESUMED

Methods:
- **static** EnumEntries<CoroutineSingletons> getEntries()
- **static** CoroutineSingletons valueOf(String)
- **static** CoroutineSingletons[] values()

### Class: io.tebex.plugin.libs.kotlin.coroutines.intrinsics.IntrinsicsKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.RestrictedContinuationImpl

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2
Type: Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.ContinuationImpl

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.RestrictedContinuationImpl

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
Type: Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.ContinuationImpl

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
Type: Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.RestrictedContinuationImpl

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
Type: Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.ContinuationImpl

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.RestrictedContinuationImpl

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
Type: Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.ContinuationImpl

No public methods found

## Package: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal

### Class: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.CoroutineStackFrame
Type: Interface

Methods:
- CoroutineStackFrame getCallerFrame()
- StackTraceElement getStackTraceElement()

### Class: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.DebugMetadata
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String c()
- String[] s()
- String f()
- int v()
- int[] i()
- int[] l()
- String m()
- String[] n()

### Class: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.SuspendFunction
Type: Interface

No public methods found

### Class: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.BaseContinuationImpl
Type: Abstract Class
Implements: io.tebex.plugin.libs.kotlin.coroutines.Continuation, io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.CoroutineStackFrame, java.io.Serializable

Methods:
- Continuation<Unit> create(Continuation<*>)
- Continuation<Unit> create(Object, Continuation<*>)
- CoroutineStackFrame getCallerFrame()
- String toString()
- Continuation<Object> getCompletion()
- void resumeWith(Object)
- StackTraceElement getStackTraceElement()

### Class: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.Boxing
Type: Class

Methods:
- **static** Double boxDouble(double)
- **static** Byte boxByte(byte)
- **static** Character boxChar(char)
- **static** Boolean boxBoolean(boolean)
- **static** Float boxFloat(float)
- **static** Integer boxInt(int)
- **static** Long boxLong(long)
- **static** Short boxShort(short)

### Class: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.CompletedContinuation
Type: Class
Implements: io.tebex.plugin.libs.kotlin.coroutines.Continuation

Methods:
- String toString()
- CoroutineContext getContext()
- void resumeWith(Object)

### Class: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.ContinuationImpl
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.BaseContinuationImpl

Methods:
- CoroutineContext getContext()
- Continuation<Object> intercepted()

### Class: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.DebugMetadataKt
Type: Class

Methods:
- **static** String[] getSpilledVariableFieldMapping(BaseContinuationImpl)
- **static** StackTraceElement getStackTraceElement(BaseContinuationImpl)

### Class: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.DebugProbesKt
Type: Class

Methods:
- **static** Continuation<TT> probeCoroutineCreated(Continuation<-TT>)
- **static** V probeCoroutineSuspended(Continuation<*>)
- **static** V probeCoroutineResumed(Continuation<*>)

### Class: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.RestrictedContinuationImpl
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.BaseContinuationImpl

Methods:
- CoroutineContext getContext()

### Class: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.RestrictedContinuationImpl
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.FunctionBase, io.tebex.plugin.libs.kotlin.coroutines.jvm.internal.SuspendFunction

Methods:
- String toString()
- int getArity()

## Package: io.tebex.plugin.libs.kotlin.enums

### Class: io.tebex.plugin.libs.kotlin.enums.EnumEntries
Type: Interface
Implements: java.util.List, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

No public methods found

### Class: io.tebex.plugin.libs.kotlin.enums.EnumEntriesKt
Type: Class

Methods:
- **static** EnumEntries<TE> enumEntries(Function0<[TE>)
- **static** EnumEntries<TE> enumEntries([T)

### Class: io.tebex.plugin.libs.kotlin.enums.EnumEntriesSerializationProxy
Type: Class
Implements: java.io.Serializable

No public methods found

## Package: io.tebex.plugin.libs.kotlin.experimental

### Class: io.tebex.plugin.libs.kotlin.experimental.ExperimentalTypeInference
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

## Package: io.tebex.plugin.libs.kotlin.internal

### Class: io.tebex.plugin.libs.kotlin.internal.HidesMembers
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.internal.InlineOnly
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.internal.IntrinsicConstEvaluation
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.internal.LowPriorityInOverloadResolution
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.internal.OnlyInputTypes
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.internal.PlatformImplementations
Type: Class

Methods:
- Random defaultPlatformRandom()
- MatchGroup getMatchResultNamedGroup(MatchResult, String)
- void addSuppressed(Throwable, Throwable)
- List<Throwable> getSuppressed(Throwable)

### Class: io.tebex.plugin.libs.kotlin.internal.PlatformImplementationsKt
Type: Class

Methods:
- **static** boolean apiVersionIsAtLeast(int, int, int)

### Class: io.tebex.plugin.libs.kotlin.internal.ProgressionUtilKt
Type: Class

Methods:
- **static** int getProgressionLastElement(int, int, int)
- **static** long getProgressionLastElement(long, long, long)

### Class: io.tebex.plugin.libs.kotlin.internal.UProgressionUtilKt
Type: Class

Methods:
- **static** long getProgressionLastElement-7ftBX0g(long, long, long)
- **static** int getProgressionLastElement-Nkh28Cs(int, int, int)

## Package: io.tebex.plugin.libs.kotlin.internal.jdk7

### Class: io.tebex.plugin.libs.kotlin.internal.jdk7.JDK7PlatformImplementations
Type: Class
Extends: io.tebex.plugin.libs.kotlin.internal.PlatformImplementations

Methods:
- void addSuppressed(Throwable, Throwable)
- List<Throwable> getSuppressed(Throwable)

## Package: io.tebex.plugin.libs.kotlin.internal.jdk8

### Class: io.tebex.plugin.libs.kotlin.internal.jdk8.JDK8PlatformImplementations
Type: Class
Extends: io.tebex.plugin.libs.kotlin.internal.jdk7.JDK7PlatformImplementations

Methods:
- Random defaultPlatformRandom()
- MatchGroup getMatchResultNamedGroup(MatchResult, String)

## Package: io.tebex.plugin.libs.kotlin.io

### Class: io.tebex.plugin.libs.kotlin.io.ByteStreamsKt
Type: Class

Methods:
- **static** long copyTo(InputStream, OutputStream, int)
- **static** ByteIterator iterator(BufferedInputStream)
- **static** long copyTo$default(InputStream, OutputStream, int, int, Object)
- **static** byte[] readBytes(InputStream, int)
- **static** byte[] readBytes(InputStream)
- **static** byte[] readBytes$default(InputStream, int, int, Object)

### Class: io.tebex.plugin.libs.kotlin.io.ByteStreamsKt$iterator$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.ByteIterator

Methods:
- boolean getNextPrepared()
- void setNextPrepared(boolean)
- byte nextByte()
- int getNextByte()
- boolean hasNext()
- boolean getFinished()
- void setNextByte(int)
- void setFinished(boolean)

### Class: io.tebex.plugin.libs.kotlin.io.CloseableKt
Type: Class

Methods:
- **static** void closeFinally(Closeable, Throwable)

### Class: io.tebex.plugin.libs.kotlin.io.LinesSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- String next()
- Object next()
- boolean hasNext()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.io.TextStreamsKt
Type: Class

Methods:
- **static** long copyTo(Reader, Writer, int)
- **static** long copyTo$default(Reader, Writer, int, int, Object)
- **static** V forEachLine(Reader, Function1<String, Unit>)
- **static** TT useLines(Reader, Function1<Sequence<String>, +TT>)
- **static** List<String> readLines(Reader)
- **static** byte[] readBytes(URL)
- **static** String readText(Reader)
- **static** Sequence<String> lineSequence(BufferedReader)

## Package: io.tebex.plugin.libs.kotlin.io.path

### Class: io.tebex.plugin.libs.kotlin.io.path.CopyActionContext
Type: Interface

Methods:
- CopyActionResult copyToIgnoringExistingDirectory(Path, Path, boolean)

### Class: io.tebex.plugin.libs.kotlin.io.path.ExperimentalPathApi
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.io.path.FileVisitorBuilder
Type: Interface

Methods:
- V onVisitFile(Function2<Path, BasicFileAttributes, FileVisitResult>)
- V onPostVisitDirectory(Function2<Path, IOException, FileVisitResult>)
- V onVisitFileFailed(Function2<Path, IOException, FileVisitResult>)
- V onPreVisitDirectory(Function2<Path, BasicFileAttributes, FileVisitResult>)

### Class: io.tebex.plugin.libs.kotlin.io.path.CopyActionResult
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CONTINUE
- SKIP_SUBTREE
- TERMINATE

Methods:
- **static** EnumEntries<CopyActionResult> getEntries()
- **static** CopyActionResult valueOf(String)
- **static** CopyActionResult[] values()

### Class: io.tebex.plugin.libs.kotlin.io.path.FileVisitorBuilderImpl
Type: Class
Implements: io.tebex.plugin.libs.kotlin.io.path.FileVisitorBuilder

Methods:
- FileVisitor<Path> build()
- V onVisitFile(Function2<Path, BasicFileAttributes, FileVisitResult>)
- V onPostVisitDirectory(Function2<Path, IOException, FileVisitResult>)
- V onVisitFileFailed(Function2<Path, IOException, FileVisitResult>)
- V onPreVisitDirectory(Function2<Path, BasicFileAttributes, FileVisitResult>)

### Class: io.tebex.plugin.libs.kotlin.io.path.LinkFollowing
Type: Class

Methods:
- LinkOption[] toLinkOptions(boolean)
- Set<FileVisitOption> toVisitOptions(boolean)

### Class: io.tebex.plugin.libs.kotlin.io.path.OnErrorResult
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SKIP_SUBTREE
- TERMINATE

Methods:
- **static** EnumEntries<OnErrorResult> getEntries()
- **static** OnErrorResult valueOf(String)
- **static** OnErrorResult[] values()

### Class: io.tebex.plugin.libs.kotlin.io.path.PathTreeWalk
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<Path> iterator()
- **static** Path access$getStart$p(PathTreeWalk)
- **static** LinkOption[] access$getLinkOptions(PathTreeWalk)
- **static** boolean access$getFollowLinks(PathTreeWalk)
- **static** boolean access$getIncludeDirectories(PathTreeWalk)

### Class: io.tebex.plugin.libs.kotlin.io.path.PathTreeWalkKt
Type: Class

Methods:
- **static** boolean access$createsCycle(PathNode)
- **static** Object access$keyOf(Path, LinkOption[])

### Class: io.tebex.plugin.libs.kotlin.io.path.PathWalkOption
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- INCLUDE_DIRECTORIES
- BREADTH_FIRST
- FOLLOW_LINKS

Methods:
- **static** EnumEntries<PathWalkOption> getEntries()
- **static** PathWalkOption valueOf(String)
- **static** PathWalkOption[] values()

### Class: io.tebex.plugin.libs.kotlin.io.path.PathsKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.io.path.PathsKt__PathUtilsKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$WhenMappings
Type: Class

No public methods found

## Package: io.tebex.plugin.libs.kotlin.jvm

### Class: io.tebex.plugin.libs.kotlin.jvm.JvmField
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.JvmInline
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.JvmName
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String name()

### Class: io.tebex.plugin.libs.kotlin.jvm.JvmOverloads
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.JvmStatic
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.JvmClassMappingKt
Type: Class

Methods:
- **static** KClass<+TT> getAnnotationClass(T)
- **static** Class<TT> getJavaObjectType(KClass<TT>)
- **static** void getRuntimeClassOfKClassInstance$annotations(KClass)
- **static** Class<KClass<TT>> getRuntimeClassOfKClassInstance(KClass<TT>)
- **static** void getJavaClass$annotations(KClass)
- **static** void getDeclaringJavaClass$annotations(Enum)
- **static** boolean isArrayOf(Object[])
- **static** KClass<TT> getKotlinClass(Class<TT>)
- **static** Class<TT> getJavaClass(KClass<TT>)
- **static** Class<TT> getJavaClass(T)
- **static** Class<TT> getJavaPrimitiveType(KClass<TT>)

### Class: io.tebex.plugin.libs.kotlin.jvm.KotlinReflectionNotSupportedError
Type: Class
Extends: java.lang.Error

No public methods found

## Package: io.tebex.plugin.libs.kotlin.jvm.functions

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function0
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke()

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function1
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function10
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function11
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function12
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3, ;)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function13
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3, ;, T)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function14
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3, ;, T, P)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function15
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3, ;, T, P, 4)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function16
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3, ;, T, P, 4, ;)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function17
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3, ;, T, P, 4, ;, T)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function18
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3, ;, T, P, 4, ;, T, P)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function19
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3, ;, T, P, 4, ;, T, P, 5)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function2
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function20
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3, ;, T, P, 4, ;, T, P, 5, ;)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function21
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3, ;, T, P, 4, ;, T, P, 5, ;, T)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function22
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T, P, 3, ;, T, P, 4, ;, T, P, 5, ;, T, P)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function3
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function4
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function5
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function6
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function7
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function8
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;)

### Class: io.tebex.plugin.libs.kotlin.jvm.functions.Function9
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- TR invoke(T, P, 1, ;, T, P, 2, ;, T)

## Package: io.tebex.plugin.libs.kotlin.jvm.internal

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.ClassBasedDeclarationContainer
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KDeclarationContainer

Methods:
- Class<*> getJClass()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.FunctionBase
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.Function

Methods:
- int getArity()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.SourceDebugExtension
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.ArrayIteratorKt
Type: Class

Methods:
- **static** Iterator<TT> iterator([T)

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.ArrayIteratorsKt
Type: Class

Methods:
- **static** ByteIterator iterator(byte[])
- **static** CharIterator iterator(char[])
- **static** ShortIterator iterator(short[])
- **static** IntIterator iterator(int[])
- **static** LongIterator iterator(long[])
- **static** FloatIterator iterator(float[])
- **static** DoubleIterator iterator(double[])
- **static** BooleanIterator iterator(boolean[])

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.CallableReference
Type: Abstract Class
Implements: io.tebex.plugin.libs.kotlin.reflect.KCallable, java.io.Serializable

Methods:
- String getName()
- String getSignature()
- Object callBy(Map)
- KDeclarationContainer getOwner()
- boolean isAbstract()
- List<Annotation> getAnnotations()
- Object call(Object[])
- KCallable compute()
- boolean isOpen()
- Object getBoundReceiver()
- KType getReturnType()
- List<KParameter> getParameters()
- boolean isFinal()
- List<KTypeParameter> getTypeParameters()
- boolean isSuspend()
- KVisibility getVisibility()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.ClassReference
Type: Class
Implements: io.tebex.plugin.libs.kotlin.reflect.KClass, io.tebex.plugin.libs.kotlin.jvm.internal.ClassBasedDeclarationContainer

Methods:
- boolean isSealed()
- boolean isCompanion()
- **static** Map access$getSimpleNames$cp()
- **static** void isOpen$annotations()
- boolean isFun()
- **static** void getSealedSubclasses$annotations()
- **static** HashMap access$getClassFqNames$cp()
- **static** void isSealed$annotations()
- List<KClass<Object>> getSealedSubclasses()
- boolean isInstance(Object)
- String getQualifiedName()
- boolean isData()
- **static** void getTypeParameters$annotations()
- Collection<KFunction<Object>> getConstructors()
- int hashCode()
- List<KType> getSupertypes()
- boolean isFinal()
- List<KTypeParameter> getTypeParameters()
- **static** void isFinal$annotations()
- **static** void isInner$annotations()
- **static** void isData$annotations()
- **static** void getSupertypes$annotations()
- **static** Map access$getFUNCTION_CLASSES$cp()
- **static** void isCompanion$annotations()
- Object getObjectInstance()
- **static** void isAbstract$annotations()
- Collection<KClass<*>> getNestedClasses()
- boolean isAbstract()
- List<Annotation> getAnnotations()
- **static** void isValue$annotations()
- boolean isInner()
- **static** void getVisibility$annotations()
- **static** void isFun$annotations()
- boolean isValue()
- boolean isOpen()
- boolean equals(Object)
- String toString()
- String getSimpleName()
- KVisibility getVisibility()
- Collection<KCallable<*>> getMembers()
- Class<*> getJClass()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.ClassReference$Companion
Type: Class

Methods:
- Z isInstance(Object, Class<*>)
- String getClassSimpleName(Class<*>)
- String getClassQualifiedName(Class<*>)

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.CollectionToArray
Type: Class

Methods:
- **static** Object toArray(Collection<*>)
- **static** Object toArray(Collection<*>, Object)

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.DefaultConstructorMarker
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.FunctionReference
Type: Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.CallableReference
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.FunctionBase, io.tebex.plugin.libs.kotlin.reflect.KFunction

Methods:
- boolean isExternal()
- boolean isInfix()
- int hashCode()
- boolean equals(Object)
- boolean isInline()
- String toString()
- int getArity()
- boolean isSuspend()
- boolean isOperator()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.FunctionReferenceImpl
Type: Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.FunctionReference

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.InlineMarker
Type: Class

Methods:
- **static** void beforeInlineCall()
- **static** void finallyStart(int)
- **static** void afterInlineCall()
- **static** void mark(int)
- **static** void mark(String)
- **static** void finallyEnd(int)

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Intrinsics
Type: Class

Methods:
- **static** void throwAssert()
- **static** void throwAssert(String)
- **static** void needClassReification()
- **static** void needClassReification(String)
- **static** void reifiedOperationMarker(int, String)
- **static** void reifiedOperationMarker(int, String, String)
- **static** int compare(long, long)
- **static** int compare(int, int)
- **static** void throwUninitializedPropertyAccessException(String)
- **static** void checkNotNullExpressionValue(Object, String)
- **static** void checkHasClass(String) throws ClassNotFoundException
- **static** void checkHasClass(String, String) throws ClassNotFoundException
- **static** void throwIllegalArgument()
- **static** void throwIllegalArgument(String)
- **static** void throwJavaNpe()
- **static** void throwJavaNpe(String)
- **static** void throwUndefinedForReified()
- **static** void throwUndefinedForReified(String)
- **static** void checkParameterIsNotNull(Object, String)
- **static** void throwIllegalState()
- **static** void throwIllegalState(String)
- **static** void checkReturnedValueIsNotNull(Object, String, String)
- **static** void checkReturnedValueIsNotNull(Object, String)
- **static** void checkFieldIsNotNull(Object, String, String)
- **static** void checkFieldIsNotNull(Object, String)
- **static** void throwUninitializedProperty(String)
- **static** void throwNpe()
- **static** void throwNpe(String)
- **static** String stringPlus(String, Object)
- **static** boolean areEqual(Object, Object)
- **static** boolean areEqual(Double, Double)
- **static** boolean areEqual(Double, double)
- **static** boolean areEqual(double, Double)
- **static** boolean areEqual(Float, Float)
- **static** boolean areEqual(Float, float)
- **static** boolean areEqual(float, Float)
- **static** void checkNotNull(Object)
- **static** void checkNotNull(Object, String)
- **static** void checkExpressionValueIsNotNull(Object, String)
- **static** void checkNotNullParameter(Object, String)

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Intrinsics$Kotlin
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Lambda
Type: Abstract Class
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.FunctionBase, java.io.Serializable

Methods:
- String toString()
- int getArity()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.MutablePropertyReference
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.PropertyReference
Implements: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.MutablePropertyReference0
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.MutablePropertyReference
Implements: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty0

Methods:
- KProperty0$Getter getGetter()
- KProperty$Getter getGetter()
- Object invoke()
- Object getDelegate()
- KMutableProperty0$Setter getSetter()
- KMutableProperty$Setter getSetter()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.MutablePropertyReference1
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.MutablePropertyReference
Implements: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty1

Methods:
- KProperty1$Getter getGetter()
- KProperty$Getter getGetter()
- Object invoke(Object)
- Object getDelegate(Object)
- KMutableProperty1$Setter getSetter()
- KMutableProperty$Setter getSetter()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.MutablePropertyReference2
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.MutablePropertyReference
Implements: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty2

Methods:
- KProperty2$Getter getGetter()
- KProperty$Getter getGetter()
- Object invoke(Object, Object)
- Object getDelegate(Object, Object)
- KMutableProperty2$Setter getSetter()
- KMutableProperty$Setter getSetter()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.PackageReference
Type: Class
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.ClassBasedDeclarationContainer

Methods:
- int hashCode()
- boolean equals(Object)
- String toString()
- Collection<KCallable<*>> getMembers()
- Class<*> getJClass()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.PropertyReference
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.CallableReference
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty

Methods:
- KCallable compute()
- boolean isLateinit()
- int hashCode()
- boolean isConst()
- boolean equals(Object)
- String toString()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.PropertyReference0
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.PropertyReference
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty0

Methods:
- KProperty0$Getter getGetter()
- KProperty$Getter getGetter()
- Object invoke()
- Object getDelegate()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.PropertyReference1
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.PropertyReference
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty1

Methods:
- KProperty1$Getter getGetter()
- KProperty$Getter getGetter()
- Object invoke(Object)
- Object getDelegate(Object)

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.PropertyReference2
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.PropertyReference
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty2

Methods:
- KProperty2$Getter getGetter()
- KProperty$Getter getGetter()
- Object invoke(Object, Object)
- Object getDelegate(Object, Object)

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Ref
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Ref$BooleanRef
Type: Class
Implements: java.io.Serializable

Methods:
- String toString()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Ref$ByteRef
Type: Class
Implements: java.io.Serializable

Methods:
- String toString()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Ref$CharRef
Type: Class
Implements: java.io.Serializable

Methods:
- String toString()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Ref$DoubleRef
Type: Class
Implements: java.io.Serializable

Methods:
- String toString()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Ref$FloatRef
Type: Class
Implements: java.io.Serializable

Methods:
- String toString()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Ref$IntRef
Type: Class
Implements: java.io.Serializable

Methods:
- String toString()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Ref$LongRef
Type: Class
Implements: java.io.Serializable

Methods:
- String toString()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Ref$ObjectRef
Type: Class
Implements: java.io.Serializable

Methods:
- String toString()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Ref$ShortRef
Type: Class
Implements: java.io.Serializable

Methods:
- String toString()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.Reflection
Type: Class

Methods:
- **static** KTypeParameter typeParameter(Object, String, KVariance, boolean)
- **static** KClass getOrCreateKotlinClass(Class)
- **static** KClass getOrCreateKotlinClass(Class, String)
- **static** KType platformType(KType, KType)
- **static** KMutableProperty1 mutableProperty1(MutablePropertyReference1)
- **static** KMutableProperty2 mutableProperty2(MutablePropertyReference2)
- **static** KMutableProperty0 mutableProperty0(MutablePropertyReference0)
- **static** KClass createKotlinClass(Class)
- **static** KClass createKotlinClass(Class, String)
- **static** KProperty2 property2(PropertyReference2)
- **static** KProperty1 property1(PropertyReference1)
- **static** void setUpperBounds(KTypeParameter, KType)
- **static** void setUpperBounds(KTypeParameter, KType[])
- **static** KProperty0 property0(PropertyReference0)
- **static** KType nothingType(KType)
- **static** KFunction function(FunctionReference)
- **static** KClass[] getOrCreateKotlinClasses(Class[])
- **static** String renderLambdaToString(Lambda)
- **static** String renderLambdaToString(FunctionBase)
- **static** KType nullableTypeOf(KClassifier)
- **static** KType nullableTypeOf(Class)
- **static** KType nullableTypeOf(Class, KTypeProjection)
- **static** KType nullableTypeOf(Class, KTypeProjection, KTypeProjection)
- **static** KType nullableTypeOf(Class, KTypeProjection[])
- **static** KDeclarationContainer getOrCreateKotlinPackage(Class)
- **static** KDeclarationContainer getOrCreateKotlinPackage(Class, String)
- **static** KType mutableCollectionType(KType)
- **static** KType typeOf(KClassifier)
- **static** KType typeOf(Class)
- **static** KType typeOf(Class, KTypeProjection)
- **static** KType typeOf(Class, KTypeProjection, KTypeProjection)
- **static** KType typeOf(Class, KTypeProjection[])

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.ReflectionFactory
Type: Class

Methods:
- KTypeParameter typeParameter(Object, String, KVariance, boolean)
- KClass getOrCreateKotlinClass(Class)
- KClass getOrCreateKotlinClass(Class, String)
- KType platformType(KType, KType)
- KMutableProperty1 mutableProperty1(MutablePropertyReference1)
- KMutableProperty2 mutableProperty2(MutablePropertyReference2)
- KMutableProperty0 mutableProperty0(MutablePropertyReference0)
- KClass createKotlinClass(Class)
- KClass createKotlinClass(Class, String)
- KProperty2 property2(PropertyReference2)
- KProperty1 property1(PropertyReference1)
- V setUpperBounds(KTypeParameter, List<KType>)
- KProperty0 property0(PropertyReference0)
- KType nothingType(KType)
- KFunction function(FunctionReference)
- String renderLambdaToString(Lambda)
- String renderLambdaToString(FunctionBase)
- KDeclarationContainer getOrCreateKotlinPackage(Class, String)
- KType mutableCollectionType(KType)
- KType typeOf(KClassifier, List<KTypeProjection>, boolean)

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.SpreadBuilder
Type: Class

Methods:
- void add(Object)
- void addSpread(Object)
- int size()
- Object[] toArray(Object[])

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.StringCompanionObject
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.TypeIntrinsics
Type: Class

Methods:
- **static** boolean isMutableList(Object)
- **static** Map$Entry castToMapEntry(Object)
- **static** int getFunctionArity(Object)
- **static** List asMutableList(Object)
- **static** List asMutableList(Object, String)
- **static** Set castToSet(Object)
- **static** ListIterator asMutableListIterator(Object)
- **static** ListIterator asMutableListIterator(Object, String)
- **static** boolean isMutableListIterator(Object)
- **static** void throwCce(Object, String)
- **static** void throwCce(String)
- **static** ClassCastException throwCce(ClassCastException)
- **static** ListIterator castToListIterator(Object)
- **static** Iterable castToIterable(Object)
- **static** Map castToMap(Object)
- **static** Iterator castToIterator(Object)
- **static** Collection castToCollection(Object)
- **static** Map asMutableMap(Object)
- **static** Map asMutableMap(Object, String)
- **static** Object beforeCheckcastToFunctionOfArity(Object, int)
- **static** Object beforeCheckcastToFunctionOfArity(Object, int, String)
- **static** boolean isFunctionOfArity(Object, int)
- **static** Set asMutableSet(Object)
- **static** Set asMutableSet(Object, String)
- **static** boolean isMutableCollection(Object)
- **static** Map$Entry asMutableMapEntry(Object)
- **static** Map$Entry asMutableMapEntry(Object, String)
- **static** boolean isMutableMapEntry(Object)
- **static** Iterable asMutableIterable(Object)
- **static** Iterable asMutableIterable(Object, String)
- **static** Iterator asMutableIterator(Object)
- **static** Iterator asMutableIterator(Object, String)
- **static** boolean isMutableSet(Object)
- **static** boolean isMutableIterator(Object)
- **static** boolean isMutableIterable(Object)
- **static** boolean isMutableMap(Object)
- **static** Collection asMutableCollection(Object)
- **static** Collection asMutableCollection(Object, String)
- **static** List castToList(Object)

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.TypeParameterReference
Type: Class
Implements: io.tebex.plugin.libs.kotlin.reflect.KTypeParameter

Methods:
- String getName()
- int hashCode()
- V setUpperBounds(List<KType>)
- boolean isReified()
- boolean equals(Object)
- KVariance getVariance()
- String toString()
- **static** void getUpperBounds$annotations()
- List<KType> getUpperBounds()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.TypeParameterReference$Companion
Type: Class

Methods:
- String toString(KTypeParameter)

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.TypeParameterReference$Companion$WhenMappings
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.TypeReference
Type: Class
Implements: io.tebex.plugin.libs.kotlin.reflect.KType

Methods:
- boolean isMarkedNullable()
- KType getPlatformTypeUpperBound$kotlin_stdlib()
- int hashCode()
- boolean equals(Object)
- int getFlags$kotlin_stdlib()
- **static** void getPlatformTypeUpperBound$kotlin_stdlib$annotations()
- List<KTypeProjection> getArguments()
- String toString()
- List<Annotation> getAnnotations()
- KClassifier getClassifier()
- **static** String access$asString(TypeReference, KTypeProjection)
- **static** void getFlags$kotlin_stdlib$annotations()

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.TypeReference$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.TypeReference$WhenMappings
Type: Class

No public methods found

## Package: io.tebex.plugin.libs.kotlin.jvm.internal.markers

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker
Type: Interface

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableCollection
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableIterable

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableIterable
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableIterator
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableList
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableCollection

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableListIterator
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableIterator

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableMap
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableMap$Entry
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

No public methods found

### Class: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableSet
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableCollection

No public methods found

## Package: io.tebex.plugin.libs.kotlin.random

### Class: io.tebex.plugin.libs.kotlin.random.AbstractPlatformRandom
Type: Abstract Class
Extends: io.tebex.plugin.libs.kotlin.random.Random

Methods:
- float nextFloat()
- Random getImpl()
- int nextBits(int)
- boolean nextBoolean()
- int nextInt()
- int nextInt(int)
- long nextLong()
- double nextDouble()
- byte[] nextBytes(byte[])

### Class: io.tebex.plugin.libs.kotlin.random.FallbackThreadLocalRandom
Type: Class
Extends: io.tebex.plugin.libs.kotlin.random.AbstractPlatformRandom

Methods:
- Random getImpl()

### Class: io.tebex.plugin.libs.kotlin.random.FallbackThreadLocalRandom$implStorage$1
Type: Class
Extends: java.lang.ThreadLocal

Methods:
- Object initialValue()

### Class: io.tebex.plugin.libs.kotlin.random.PlatformRandomKt
Type: Class

Methods:
- **static** Random asJavaRandom(Random)
- **static** Random asKotlinRandom(Random)
- **static** double doubleFromParts(int, int)

### Class: io.tebex.plugin.libs.kotlin.random.Random
Type: Abstract Class

Methods:
- float nextFloat()
- **static** Random access$getDefaultRandom$cp()
- int nextBits(int)
- boolean nextBoolean()
- int nextInt()
- int nextInt(int)
- int nextInt(int, int)
- long nextLong()
- long nextLong(long)
- long nextLong(long, long)
- **static** byte[] nextBytes$default(Random, byte[], int, int, int, Object)
- double nextDouble()
- double nextDouble(double)
- double nextDouble(double, double)
- byte[] nextBytes(byte[], int, int)
- byte[] nextBytes(byte[])
- byte[] nextBytes(int)

### Class: io.tebex.plugin.libs.kotlin.random.Random$Default
Type: Class
Extends: io.tebex.plugin.libs.kotlin.random.Random
Implements: java.io.Serializable

Methods:
- float nextFloat()
- int nextBits(int)
- boolean nextBoolean()
- int nextInt()
- int nextInt(int)
- int nextInt(int, int)
- long nextLong()
- long nextLong(long)
- long nextLong(long, long)
- double nextDouble()
- double nextDouble(double)
- double nextDouble(double, double)
- byte[] nextBytes(byte[])
- byte[] nextBytes(int)
- byte[] nextBytes(byte[], int, int)

### Class: io.tebex.plugin.libs.kotlin.random.RandomKt
Type: Class

Methods:
- **static** int fastLog2(int)
- **static** Random Random(int)
- **static** Random Random(long)
- **static** int takeUpperBits(int, int)
- **static** String boundsErrorMessage(Object, Object)
- **static** int nextInt(Random, IntRange)
- **static** void checkRangeBounds(int, int)
- **static** void checkRangeBounds(long, long)
- **static** void checkRangeBounds(double, double)
- **static** long nextLong(Random, LongRange)

### Class: io.tebex.plugin.libs.kotlin.random.URandomKt
Type: Class

Methods:
- **static** long nextULong(Random)
- **static** long nextULong(Random, ULongRange)
- **static** byte[] nextUBytes-Wvrt4B4$default(Random, byte[], int, int, int, Object)
- **static** int nextUInt-a8DCA5k(Random, int, int)
- **static** byte[] nextUBytes-Wvrt4B4(Random, byte[], int, int)
- **static** int nextUInt-qCasIEU(Random, int)
- **static** byte[] nextUBytes-EVgfTAA(Random, byte[])
- **static** long nextULong-jmpaW-c(Random, long, long)
- **static** long nextULong-V1Xi4fY(Random, long)
- **static** int nextUInt(Random)
- **static** int nextUInt(Random, UIntRange)
- **static** byte[] nextUBytes(Random, int)
- **static** void checkUIntRangeBounds-J1ME1BU(int, int)
- **static** void checkULongRangeBounds-eb3DHEI(long, long)

### Class: io.tebex.plugin.libs.kotlin.random.XorWowRandom
Type: Class
Extends: io.tebex.plugin.libs.kotlin.random.Random
Implements: java.io.Serializable

Methods:
- int nextBits(int)
- int nextInt()

## Package: io.tebex.plugin.libs.kotlin.random.jdk8

### Class: io.tebex.plugin.libs.kotlin.random.jdk8.PlatformThreadLocalRandom
Type: Class
Extends: io.tebex.plugin.libs.kotlin.random.AbstractPlatformRandom

Methods:
- Random getImpl()
- int nextInt(int, int)
- long nextLong(long)
- long nextLong(long, long)
- double nextDouble(double)

## Package: io.tebex.plugin.libs.kotlin.ranges

### Class: io.tebex.plugin.libs.kotlin.ranges.ClosedFloatingPointRange
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.ranges.ClosedRange

Methods:
- Z contains(T)
- boolean isEmpty()
- Z lessThanOrEquals(T, T)

### Class: io.tebex.plugin.libs.kotlin.ranges.ClosedRange
Type: Interface

Methods:
- Z contains(T)
- TT getStart()
- boolean isEmpty()
- TT getEndInclusive()

### Class: io.tebex.plugin.libs.kotlin.ranges.OpenEndRange
Type: Interface

Methods:
- Z contains(T)
- TT getStart()
- boolean isEmpty()
- TT getEndExclusive()

### Class: io.tebex.plugin.libs.kotlin.ranges.CharProgression
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- CharIterator iterator()
- Iterator iterator()
- int hashCode()
- char getFirst()
- boolean equals(Object)
- int getStep()
- boolean isEmpty()
- String toString()
- char getLast()

### Class: io.tebex.plugin.libs.kotlin.ranges.CharProgression$Companion
Type: Class

Methods:
- CharProgression fromClosedRange(char, char, int)

### Class: io.tebex.plugin.libs.kotlin.ranges.CharProgressionIterator
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.CharIterator

Methods:
- char nextChar()
- int getStep()
- boolean hasNext()

### Class: io.tebex.plugin.libs.kotlin.ranges.CharRange
Type: Class
Extends: io.tebex.plugin.libs.kotlin.ranges.CharProgression
Implements: io.tebex.plugin.libs.kotlin.ranges.ClosedRange, io.tebex.plugin.libs.kotlin.ranges.OpenEndRange

Methods:
- **static** void getEndExclusive$annotations()
- boolean contains(char)
- boolean contains(Comparable)
- Character getStart()
- Comparable getStart()
- int hashCode()
- boolean equals(Object)
- boolean isEmpty()
- String toString()
- Character getEndInclusive()
- Comparable getEndInclusive()
- **static** CharRange access$getEMPTY$cp()
- Character getEndExclusive()
- Comparable getEndExclusive()

### Class: io.tebex.plugin.libs.kotlin.ranges.CharRange$Companion
Type: Class

Methods:
- CharRange getEMPTY()

### Class: io.tebex.plugin.libs.kotlin.ranges.ClosedFloatingPointRange$DefaultImpls
Type: Class

Methods:
- **static** Z contains(ClosedFloatingPointRange<TT>, T)
- **static** Z isEmpty(ClosedFloatingPointRange<TT>)

### Class: io.tebex.plugin.libs.kotlin.ranges.ClosedRange$DefaultImpls
Type: Class

Methods:
- **static** Z contains(ClosedRange<TT>, T)
- **static** Z isEmpty(ClosedRange<TT>)

### Class: io.tebex.plugin.libs.kotlin.ranges.IntProgression
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- IntIterator iterator()
- Iterator iterator()
- int hashCode()
- int getFirst()
- boolean equals(Object)
- int getStep()
- boolean isEmpty()
- String toString()
- int getLast()

### Class: io.tebex.plugin.libs.kotlin.ranges.IntProgression$Companion
Type: Class

Methods:
- IntProgression fromClosedRange(int, int, int)

### Class: io.tebex.plugin.libs.kotlin.ranges.IntProgressionIterator
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.IntIterator

Methods:
- int getStep()
- boolean hasNext()
- int nextInt()

### Class: io.tebex.plugin.libs.kotlin.ranges.IntRange
Type: Class
Extends: io.tebex.plugin.libs.kotlin.ranges.IntProgression
Implements: io.tebex.plugin.libs.kotlin.ranges.ClosedRange, io.tebex.plugin.libs.kotlin.ranges.OpenEndRange

Methods:
- **static** void getEndExclusive$annotations()
- boolean contains(int)
- boolean contains(Comparable)
- Integer getStart()
- Comparable getStart()
- int hashCode()
- boolean equals(Object)
- boolean isEmpty()
- String toString()
- Integer getEndInclusive()
- Comparable getEndInclusive()
- **static** IntRange access$getEMPTY$cp()
- Integer getEndExclusive()
- Comparable getEndExclusive()

### Class: io.tebex.plugin.libs.kotlin.ranges.IntRange$Companion
Type: Class

Methods:
- IntRange getEMPTY()

### Class: io.tebex.plugin.libs.kotlin.ranges.LongProgression
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- LongIterator iterator()
- Iterator iterator()
- int hashCode()
- long getFirst()
- boolean equals(Object)
- long getStep()
- boolean isEmpty()
- String toString()
- long getLast()

### Class: io.tebex.plugin.libs.kotlin.ranges.LongProgression$Companion
Type: Class

Methods:
- LongProgression fromClosedRange(long, long, long)

### Class: io.tebex.plugin.libs.kotlin.ranges.LongProgressionIterator
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.LongIterator

Methods:
- long getStep()
- boolean hasNext()
- long nextLong()

### Class: io.tebex.plugin.libs.kotlin.ranges.LongRange
Type: Class
Extends: io.tebex.plugin.libs.kotlin.ranges.LongProgression
Implements: io.tebex.plugin.libs.kotlin.ranges.ClosedRange, io.tebex.plugin.libs.kotlin.ranges.OpenEndRange

Methods:
- **static** void getEndExclusive$annotations()
- boolean contains(long)
- boolean contains(Comparable)
- Long getStart()
- Comparable getStart()
- int hashCode()
- boolean equals(Object)
- boolean isEmpty()
- String toString()
- Long getEndInclusive()
- Comparable getEndInclusive()
- **static** LongRange access$getEMPTY$cp()
- Long getEndExclusive()
- Comparable getEndExclusive()

### Class: io.tebex.plugin.libs.kotlin.ranges.LongRange$Companion
Type: Class

Methods:
- LongRange getEMPTY()

### Class: io.tebex.plugin.libs.kotlin.ranges.OpenEndRange$DefaultImpls
Type: Class

Methods:
- **static** Z contains(OpenEndRange<TT>, T)
- **static** Z isEmpty(OpenEndRange<TT>)

### Class: io.tebex.plugin.libs.kotlin.ranges.RangesKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.ranges.RangesKt___RangesKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.ranges.UIntProgression
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<UInt> iterator()
- int getFirst-pVg5ArA()
- int hashCode()
- boolean equals(Object)
- int getStep()
- boolean isEmpty()
- String toString()
- int getLast-pVg5ArA()

### Class: io.tebex.plugin.libs.kotlin.ranges.UIntProgression$Companion
Type: Class

Methods:
- UIntProgression fromClosedRange-Nkh28Cs(int, int, int)

### Class: io.tebex.plugin.libs.kotlin.ranges.UIntRange
Type: Class
Extends: io.tebex.plugin.libs.kotlin.ranges.UIntProgression
Implements: io.tebex.plugin.libs.kotlin.ranges.ClosedRange, io.tebex.plugin.libs.kotlin.ranges.OpenEndRange

Methods:
- Comparable getStart()
- boolean contains-WZ4Q5Ns(int)
- boolean isEmpty()
- Comparable getEndExclusive()
- boolean contains(Comparable)
- int hashCode()
- int getStart-pVg5ArA()
- boolean equals(Object)
- Comparable getEndInclusive()
- String toString()
- **static** void getEndExclusive-pVg5ArA$annotations()
- **static** UIntRange access$getEMPTY$cp()
- int getEndInclusive-pVg5ArA()
- int getEndExclusive-pVg5ArA()

### Class: io.tebex.plugin.libs.kotlin.ranges.UIntRange$Companion
Type: Class

Methods:
- UIntRange getEMPTY()

### Class: io.tebex.plugin.libs.kotlin.ranges.ULongProgression
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<ULong> iterator()
- long getFirst-s-VKNKU()
- int hashCode()
- boolean equals(Object)
- long getStep()
- boolean isEmpty()
- String toString()
- long getLast-s-VKNKU()

### Class: io.tebex.plugin.libs.kotlin.ranges.ULongProgression$Companion
Type: Class

Methods:
- ULongProgression fromClosedRange-7ftBX0g(long, long, long)

### Class: io.tebex.plugin.libs.kotlin.ranges.ULongRange
Type: Class
Extends: io.tebex.plugin.libs.kotlin.ranges.ULongProgression
Implements: io.tebex.plugin.libs.kotlin.ranges.ClosedRange, io.tebex.plugin.libs.kotlin.ranges.OpenEndRange

Methods:
- long getEndInclusive-s-VKNKU()
- Comparable getStart()
- boolean isEmpty()
- long getStart-s-VKNKU()
- Comparable getEndExclusive()
- boolean contains(Comparable)
- int hashCode()
- boolean equals(Object)
- **static** void getEndExclusive-s-VKNKU$annotations()
- long getEndExclusive-s-VKNKU()
- Comparable getEndInclusive()
- String toString()
- boolean contains-VKZWuLQ(long)
- **static** ULongRange access$getEMPTY$cp()

### Class: io.tebex.plugin.libs.kotlin.ranges.ULongRange$Companion
Type: Class

Methods:
- ULongRange getEMPTY()

### Class: io.tebex.plugin.libs.kotlin.ranges.URangesKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.ranges.URangesKt___URangesKt

No public methods found

## Package: io.tebex.plugin.libs.kotlin.reflect

### Class: io.tebex.plugin.libs.kotlin.reflect.KAnnotatedElement
Type: Interface

Methods:
- List<Annotation> getAnnotations()

### Class: io.tebex.plugin.libs.kotlin.reflect.KCallable
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KAnnotatedElement

Methods:
- TR call(Object)
- boolean isOpen()
- String getName()
- KType getReturnType()
- List<KParameter> getParameters()
- boolean isFinal()
- List<KTypeParameter> getTypeParameters()
- TR callBy(Map<KParameter, Object>)
- boolean isAbstract()
- boolean isSuspend()
- KVisibility getVisibility()

### Class: io.tebex.plugin.libs.kotlin.reflect.KClass
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KDeclarationContainer, io.tebex.plugin.libs.kotlin.reflect.KAnnotatedElement, io.tebex.plugin.libs.kotlin.reflect.KClassifier

Methods:
- boolean isSealed()
- boolean isCompanion()
- TT getObjectInstance()
- boolean isFun()
- Collection<KClass<*>> getNestedClasses()
- boolean isAbstract()
- boolean isInner()
- List<KClass<+TT>> getSealedSubclasses()
- boolean isInstance(Object)
- String getQualifiedName()
- boolean isValue()
- boolean isOpen()
- boolean isData()
- Collection<KFunction<TT>> getConstructors()
- int hashCode()
- List<KType> getSupertypes()
- boolean equals(Object)
- String getSimpleName()
- boolean isFinal()
- List<KTypeParameter> getTypeParameters()
- KVisibility getVisibility()
- Collection<KCallable<*>> getMembers()

### Class: io.tebex.plugin.libs.kotlin.reflect.KClassifier
Type: Interface

No public methods found

### Class: io.tebex.plugin.libs.kotlin.reflect.KDeclarationContainer
Type: Interface

Methods:
- Collection<KCallable<*>> getMembers()

### Class: io.tebex.plugin.libs.kotlin.reflect.KFunction
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KCallable, io.tebex.plugin.libs.kotlin.Function

Methods:
- boolean isExternal()
- boolean isInfix()
- boolean isInline()
- boolean isSuspend()
- boolean isOperator()

### Class: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty

Methods:
- KMutableProperty$Setter<TV> getSetter()

### Class: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty$Setter
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty$Accessor, io.tebex.plugin.libs.kotlin.reflect.KFunction

No public methods found

### Class: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty0
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty0, io.tebex.plugin.libs.kotlin.reflect.KMutableProperty

Methods:
- V set(T)
- KMutableProperty0$Setter<TV> getSetter()

### Class: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty0$Setter
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty$Setter, io.tebex.plugin.libs.kotlin.jvm.functions.Function1

No public methods found

### Class: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty1
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty1, io.tebex.plugin.libs.kotlin.reflect.KMutableProperty

Methods:
- V set(T, T)
- KMutableProperty1$Setter<TT, TV> getSetter()

### Class: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty1$Setter
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty$Setter, io.tebex.plugin.libs.kotlin.jvm.functions.Function2

No public methods found

### Class: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty2
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty2, io.tebex.plugin.libs.kotlin.reflect.KMutableProperty

Methods:
- V set(T, double, ;)
- KMutableProperty2$Setter<TD, TE, TV> getSetter()

### Class: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty2$Setter
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KMutableProperty$Setter, io.tebex.plugin.libs.kotlin.jvm.functions.Function3

No public methods found

### Class: io.tebex.plugin.libs.kotlin.reflect.KParameter
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KAnnotatedElement

Methods:
- String getName()
- int getIndex()
- KType getType()
- boolean isOptional()
- KParameter$Kind getKind()
- boolean isVararg()

### Class: io.tebex.plugin.libs.kotlin.reflect.KProperty
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KCallable

Methods:
- KProperty$Getter<TV> getGetter()
- boolean isLateinit()
- boolean isConst()

### Class: io.tebex.plugin.libs.kotlin.reflect.KProperty$Accessor
Type: Interface

Methods:
- KProperty<TV> getProperty()

### Class: io.tebex.plugin.libs.kotlin.reflect.KProperty$Getter
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty$Accessor, io.tebex.plugin.libs.kotlin.reflect.KFunction

No public methods found

### Class: io.tebex.plugin.libs.kotlin.reflect.KProperty0
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty, io.tebex.plugin.libs.kotlin.jvm.functions.Function0

Methods:
- KProperty0$Getter<TV> getGetter()
- TV get()
- Object getDelegate()

### Class: io.tebex.plugin.libs.kotlin.reflect.KProperty0$Getter
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty$Getter, io.tebex.plugin.libs.kotlin.jvm.functions.Function0

No public methods found

### Class: io.tebex.plugin.libs.kotlin.reflect.KProperty1
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty, io.tebex.plugin.libs.kotlin.jvm.functions.Function1

Methods:
- KProperty1$Getter<TT, TV> getGetter()
- TV get(T)
- Object getDelegate(T)

### Class: io.tebex.plugin.libs.kotlin.reflect.KProperty1$Getter
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty$Getter, io.tebex.plugin.libs.kotlin.jvm.functions.Function1

No public methods found

### Class: io.tebex.plugin.libs.kotlin.reflect.KProperty2
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty, io.tebex.plugin.libs.kotlin.jvm.functions.Function2

Methods:
- KProperty2$Getter<TD, TE, TV> getGetter()
- TV get(T, double)
- Object getDelegate(T, double)

### Class: io.tebex.plugin.libs.kotlin.reflect.KProperty2$Getter
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KProperty$Getter, io.tebex.plugin.libs.kotlin.jvm.functions.Function2

No public methods found

### Class: io.tebex.plugin.libs.kotlin.reflect.KType
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KAnnotatedElement

Methods:
- boolean isMarkedNullable()
- List<KTypeProjection> getArguments()
- KClassifier getClassifier()

### Class: io.tebex.plugin.libs.kotlin.reflect.KTypeParameter
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.reflect.KClassifier

Methods:
- String getName()
- boolean isReified()
- KVariance getVariance()
- List<KType> getUpperBounds()

### Class: io.tebex.plugin.libs.kotlin.reflect.KCallable$DefaultImpls
Type: Class

Methods:
- **static** void getName$annotations()
- **static** void getTypeParameters$annotations()
- **static** void isOpen$annotations()
- **static** void isAbstract$annotations()
- **static** void isSuspend$annotations()
- **static** void isFinal$annotations()
- **static** void getVisibility$annotations()

### Class: io.tebex.plugin.libs.kotlin.reflect.KClass$DefaultImpls
Type: Class

Methods:
- **static** void isData$annotations()
- **static** void getSupertypes$annotations()
- **static** void isFun$annotations()
- **static** void isCompanion$annotations()
- **static** void getTypeParameters$annotations()
- **static** void isOpen$annotations()
- **static** void isAbstract$annotations()
- **static** void getSealedSubclasses$annotations()
- **static** void isFinal$annotations()
- **static** void isInner$annotations()
- **static** void isValue$annotations()
- **static** void isSealed$annotations()
- **static** void getVisibility$annotations()

### Class: io.tebex.plugin.libs.kotlin.reflect.KClasses
Type: Class

Methods:
- **static** TT cast(KClass<TT>, Object)
- **static** TT safeCast(KClass<TT>, Object)

### Class: io.tebex.plugin.libs.kotlin.reflect.KFunction$DefaultImpls
Type: Class

Methods:
- **static** void isOperator$annotations()
- **static** void isInline$annotations()
- **static** void isExternal$annotations()
- **static** void isInfix$annotations()
- **static** void isSuspend$annotations()

### Class: io.tebex.plugin.libs.kotlin.reflect.KParameter$DefaultImpls
Type: Class

Methods:
- **static** void isVararg$annotations()

### Class: io.tebex.plugin.libs.kotlin.reflect.KParameter$Kind
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- INSTANCE
- EXTENSION_RECEIVER
- VALUE

Methods:
- **static** EnumEntries<KParameter$Kind> getEntries()
- **static** KParameter$Kind valueOf(String)
- **static** KParameter$Kind[] values()

### Class: io.tebex.plugin.libs.kotlin.reflect.KProperty$DefaultImpls
Type: Class

Methods:
- **static** void isLateinit$annotations()
- **static** void isConst$annotations()

### Class: io.tebex.plugin.libs.kotlin.reflect.KType$DefaultImpls
Type: Class

Methods:
- **static** void getArguments$annotations()
- **static** void getClassifier$annotations()

### Class: io.tebex.plugin.libs.kotlin.reflect.KTypeProjection
Type: Class

Methods:
- KVariance component1()
- KType component2()
- **static** KTypeProjection contravariant(KType)
- KType getType()
- int hashCode()
- **static** KTypeProjection copy$default(KTypeProjection, KVariance, KType, int, Object)
- boolean equals(Object)
- KVariance getVariance()
- String toString()
- KTypeProjection copy(KVariance, KType)
- **static** KTypeProjection covariant(KType)
- **static** KTypeProjection invariant(KType)

### Class: io.tebex.plugin.libs.kotlin.reflect.KTypeProjection$Companion
Type: Class

Methods:
- KTypeProjection contravariant(KType)
- KTypeProjection getSTAR()
- **static** void getStar$annotations()
- KTypeProjection covariant(KType)
- KTypeProjection invariant(KType)

### Class: io.tebex.plugin.libs.kotlin.reflect.KTypeProjection$WhenMappings
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.reflect.KVariance
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- INVARIANT
- IN
- OUT

Methods:
- **static** EnumEntries<KVariance> getEntries()
- **static** KVariance valueOf(String)
- **static** KVariance[] values()

### Class: io.tebex.plugin.libs.kotlin.reflect.KVisibility
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PUBLIC
- PROTECTED
- INTERNAL
- PRIVATE

Methods:
- **static** EnumEntries<KVisibility> getEntries()
- **static** KVisibility valueOf(String)
- **static** KVisibility[] values()

## Package: io.tebex.plugin.libs.kotlin.sequences

### Class: io.tebex.plugin.libs.kotlin.sequences.DropTakeSequence
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Sequence<TT> drop(int)
- Sequence<TT> take(int)

### Class: io.tebex.plugin.libs.kotlin.sequences.Sequence
Type: Interface

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.ConstrainedOnceSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.DistinctSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.DropSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence, io.tebex.plugin.libs.kotlin.sequences.DropTakeSequence

Methods:
- Sequence<TT> drop(int)
- Sequence<TT> take(int)
- **static** int access$getCount$p(DropSequence)
- Iterator<TT> iterator()
- **static** Sequence access$getSequence$p(DropSequence)

### Class: io.tebex.plugin.libs.kotlin.sequences.DropSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TT next()
- Iterator<TT> getIterator()
- void setLeft(int)
- boolean hasNext()
- void remove()
- int getLeft()

### Class: io.tebex.plugin.libs.kotlin.sequences.DropWhileSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()
- **static** Function1 access$getPredicate$p(DropWhileSequence)
- **static** Sequence access$getSequence$p(DropWhileSequence)

### Class: io.tebex.plugin.libs.kotlin.sequences.DropWhileSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TT next()
- TT getNextItem()
- Iterator<TT> getIterator()
- int getDropState()
- boolean hasNext()
- V setNextItem(T)
- void setDropState(int)
- void remove()

### Class: io.tebex.plugin.libs.kotlin.sequences.FilteringSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()
- **static** Function1 access$getPredicate$p(FilteringSequence)
- **static** Sequence access$getSequence$p(FilteringSequence)
- **static** boolean access$getSendWhen$p(FilteringSequence)

### Class: io.tebex.plugin.libs.kotlin.sequences.FilteringSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TT next()
- TT getNextItem()
- Iterator<TT> getIterator()
- void setNextState(int)
- int getNextState()
- boolean hasNext()
- V setNextItem(T)
- void remove()

### Class: io.tebex.plugin.libs.kotlin.sequences.FlatteningSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TE> iterator()
- **static** Function1 access$getTransformer$p(FlatteningSequence)
- **static** Function1 access$getIterator$p(FlatteningSequence)
- **static** Sequence access$getSequence$p(FlatteningSequence)

### Class: io.tebex.plugin.libs.kotlin.sequences.FlatteningSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TE next()
- Iterator<TT> getIterator()
- Iterator<TE> getItemIterator()
- boolean hasNext()
- void remove()
- V setItemIterator(Iterator<+TE>)

### Class: io.tebex.plugin.libs.kotlin.sequences.GeneratorSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TT next()
- TT getNextItem()
- void setNextState(int)
- int getNextState()
- boolean hasNext()
- V setNextItem(T)
- void remove()

### Class: io.tebex.plugin.libs.kotlin.sequences.IndexingSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<IndexedValue<TT>> iterator()
- **static** Sequence access$getSequence$p(IndexingSequence)

### Class: io.tebex.plugin.libs.kotlin.sequences.IndexingSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- IndexedValue<TT> next()
- Object next()
- Iterator<TT> getIterator()
- int getIndex()
- void setIndex(int)
- boolean hasNext()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.sequences.MergingSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- **static** Sequence access$getSequence1$p(MergingSequence)
- Iterator<TV> iterator()
- **static** Sequence access$getSequence2$p(MergingSequence)
- **static** Function2 access$getTransform$p(MergingSequence)

### Class: io.tebex.plugin.libs.kotlin.sequences.MergingSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TV next()
- boolean hasNext()
- Iterator<TT2> getIterator2()
- void remove()
- Iterator<TT1> getIterator1()

### Class: io.tebex.plugin.libs.kotlin.sequences.SequenceScope
Type: Abstract Class

Methods:
- Object yieldAll(Iterator<+TT>, Continuation<Unit>)
- Object yieldAll(Iterable<+TT>, Continuation<Unit>)
- Object yieldAll(Sequence<+TT>, Continuation<Unit>)
- Object yield(T, T)

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.sequences.SequencesKt___SequencesKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt__SequencesKt$Sequence$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt___SequencesKt$filterIsInstance$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.Lambda
Implements: io.tebex.plugin.libs.kotlin.jvm.functions.Function1

Methods:
- Boolean invoke(Object)
- Object invoke(Object)

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt___SequencesKt$groupingBy$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.collections.Grouping

Methods:
- TK keyOf(T)
- Iterator<TT> sourceIterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt___SequencesKt$minus$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt___SequencesKt$minus$2
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt___SequencesKt$minus$3
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt___SequencesKt$minus$4
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt___SequencesKt$sorted$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.SequencesKt___SequencesKt$sortedWith$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()

### Class: io.tebex.plugin.libs.kotlin.sequences.SubSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence, io.tebex.plugin.libs.kotlin.sequences.DropTakeSequence

Methods:
- Sequence<TT> drop(int)
- Sequence<TT> take(int)
- Iterator<TT> iterator()
- **static** int access$getEndIndex$p(SubSequence)
- **static** int access$getStartIndex$p(SubSequence)
- **static** Sequence access$getSequence$p(SubSequence)

### Class: io.tebex.plugin.libs.kotlin.sequences.SubSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TT next()
- Iterator<TT> getIterator()
- int getPosition()
- boolean hasNext()
- void remove()
- void setPosition(int)

### Class: io.tebex.plugin.libs.kotlin.sequences.TakeSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence, io.tebex.plugin.libs.kotlin.sequences.DropTakeSequence

Methods:
- Sequence<TT> drop(int)
- Sequence<TT> take(int)
- **static** int access$getCount$p(TakeSequence)
- Iterator<TT> iterator()
- **static** Sequence access$getSequence$p(TakeSequence)

### Class: io.tebex.plugin.libs.kotlin.sequences.TakeSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TT next()
- Iterator<TT> getIterator()
- void setLeft(int)
- boolean hasNext()
- void remove()
- int getLeft()

### Class: io.tebex.plugin.libs.kotlin.sequences.TakeWhileSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TT> iterator()
- **static** Function1 access$getPredicate$p(TakeWhileSequence)
- **static** Sequence access$getSequence$p(TakeWhileSequence)

### Class: io.tebex.plugin.libs.kotlin.sequences.TakeWhileSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TT next()
- TT getNextItem()
- Iterator<TT> getIterator()
- void setNextState(int)
- int getNextState()
- boolean hasNext()
- V setNextItem(T)
- void remove()

### Class: io.tebex.plugin.libs.kotlin.sequences.TransformingIndexedSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TR> iterator()
- **static** Function2 access$getTransformer$p(TransformingIndexedSequence)
- **static** Sequence access$getSequence$p(TransformingIndexedSequence)

### Class: io.tebex.plugin.libs.kotlin.sequences.TransformingIndexedSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TR next()
- Iterator<TT> getIterator()
- int getIndex()
- void setIndex(int)
- boolean hasNext()
- void remove()

### Class: io.tebex.plugin.libs.kotlin.sequences.TransformingSequence
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<TR> iterator()
- **static** Function1 access$getTransformer$p(TransformingSequence)
- Sequence<TE> flatten$kotlin_stdlib(Function1<-TR, Iterator<+TE>>)
- **static** Sequence access$getSequence$p(TransformingSequence)

### Class: io.tebex.plugin.libs.kotlin.sequences.TransformingSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- TR next()
- Iterator<TT> getIterator()
- boolean hasNext()
- void remove()

## Package: io.tebex.plugin.libs.kotlin.text

### Class: io.tebex.plugin.libs.kotlin.text.MatchGroupCollection
Type: Interface
Implements: java.util.Collection, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- MatchGroup get(int)

### Class: io.tebex.plugin.libs.kotlin.text.MatchNamedGroupCollection
Type: Interface
Implements: io.tebex.plugin.libs.kotlin.text.MatchGroupCollection

Methods:
- MatchGroup get(String)

### Class: io.tebex.plugin.libs.kotlin.text.MatchResult
Type: Interface

Methods:
- MatchResult next()
- String getValue()
- MatchResult$Destructured getDestructured()
- List<String> getGroupValues()
- IntRange getRange()
- MatchGroupCollection getGroups()

### Class: io.tebex.plugin.libs.kotlin.text.CharCategory
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UNASSIGNED
- UPPERCASE_LETTER
- LOWERCASE_LETTER
- TITLECASE_LETTER
- MODIFIER_LETTER
- OTHER_LETTER
- NON_SPACING_MARK
- ENCLOSING_MARK
- COMBINING_SPACING_MARK
- DECIMAL_DIGIT_NUMBER
- LETTER_NUMBER
- OTHER_NUMBER
- SPACE_SEPARATOR
- LINE_SEPARATOR
- PARAGRAPH_SEPARATOR
- CONTROL
- FORMAT
- PRIVATE_USE
- SURROGATE
- DASH_PUNCTUATION
- START_PUNCTUATION
- END_PUNCTUATION
- CONNECTOR_PUNCTUATION
- OTHER_PUNCTUATION
- MATH_SYMBOL
- CURRENCY_SYMBOL
- MODIFIER_SYMBOL
- OTHER_SYMBOL
- INITIAL_QUOTE_PUNCTUATION
- FINAL_QUOTE_PUNCTUATION

Methods:
- int getValue()
- boolean contains(char)
- **static** EnumEntries<CharCategory> getEntries()
- **static** CharCategory valueOf(String)
- **static** CharCategory[] values()
- String getCode()

### Class: io.tebex.plugin.libs.kotlin.text.CharCategory$Companion
Type: Class

Methods:
- CharCategory valueOf(int)

### Class: io.tebex.plugin.libs.kotlin.text.CharDirectionality
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UNDEFINED
- LEFT_TO_RIGHT
- RIGHT_TO_LEFT
- RIGHT_TO_LEFT_ARABIC
- EUROPEAN_NUMBER
- EUROPEAN_NUMBER_SEPARATOR
- EUROPEAN_NUMBER_TERMINATOR
- ARABIC_NUMBER
- COMMON_NUMBER_SEPARATOR
- NONSPACING_MARK
- BOUNDARY_NEUTRAL
- PARAGRAPH_SEPARATOR
- SEGMENT_SEPARATOR
- WHITESPACE
- OTHER_NEUTRALS
- LEFT_TO_RIGHT_EMBEDDING
- LEFT_TO_RIGHT_OVERRIDE
- RIGHT_TO_LEFT_EMBEDDING
- RIGHT_TO_LEFT_OVERRIDE
- POP_DIRECTIONAL_FORMAT

Methods:
- int getValue()
- **static** EnumEntries<CharDirectionality> getEntries()
- **static** CharDirectionality valueOf(String)
- **static** CharDirectionality[] values()
- **static** Lazy access$getDirectionalityMap$delegate$cp()

### Class: io.tebex.plugin.libs.kotlin.text.CharDirectionality$Companion
Type: Class

Methods:
- CharDirectionality valueOf(int)

### Class: io.tebex.plugin.libs.kotlin.text.CharsKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.text.CharsKt__CharKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.text.Charsets
Type: Class

Methods:
- Charset UTF32()
- Charset UTF32_BE()
- Charset UTF32_LE()

### Class: io.tebex.plugin.libs.kotlin.text.DelimitedRangesSequence$iterator$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- IntRange next()
- Object next()
- IntRange getNextItem()
- int getNextSearchIndex()
- int getCounter()
- void setNextSearchIndex(int)
- boolean hasNext()
- void remove()
- void setCounter(int)
- int getCurrentStartIndex()
- void setNextState(int)
- int getNextState()
- void setNextItem(IntRange)
- void setCurrentStartIndex(int)

### Class: io.tebex.plugin.libs.kotlin.text.MatchGroup
Type: Class

Methods:
- String component1()
- IntRange component2()
- String getValue()
- int hashCode()
- **static** MatchGroup copy$default(MatchGroup, String, IntRange, int, Object)
- IntRange getRange()
- boolean equals(Object)
- String toString()
- MatchGroup copy(String, IntRange)

### Class: io.tebex.plugin.libs.kotlin.text.MatchResult$DefaultImpls
Type: Class

Methods:
- **static** MatchResult$Destructured getDestructured(MatchResult)

### Class: io.tebex.plugin.libs.kotlin.text.MatchResult$Destructured
Type: Class

Methods:
- MatchResult getMatch()
- List<String> toList()

### Class: io.tebex.plugin.libs.kotlin.text.MatcherMatchResult$groupValues$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList

Methods:
- int lastIndexOf(String)
- int lastIndexOf(Object)
- boolean contains(String)
- boolean contains(Object)
- int getSize()
- String get(int)
- Object get(int)
- int indexOf(String)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.kotlin.text.MatcherMatchResult$groups$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractCollection
Implements: io.tebex.plugin.libs.kotlin.text.MatchNamedGroupCollection

Methods:
- boolean contains(MatchGroup)
- boolean contains(Object)
- Iterator<MatchGroup> iterator()
- int getSize()
- MatchGroup get(int)
- MatchGroup get(String)
- boolean isEmpty()

### Class: io.tebex.plugin.libs.kotlin.text.Regex
Type: Class
Implements: java.io.Serializable

Methods:
- Pattern toPattern()
- MatchResult matchEntire(CharSequence)
- MatchResult matchAt(CharSequence, int)
- **static** Pattern access$getNativePattern$p(Regex)
- boolean matchesAt(CharSequence, int)
- String replace(CharSequence, String)
- String replace(CharSequence, Function1<MatchResult, CharSequence>)
- String replaceFirst(CharSequence, String)
- **static** MatchResult find$default(Regex, CharSequence, int, int, Object)
- Sequence<MatchResult> findAll(CharSequence, int)
- boolean matches(CharSequence)
- List<String> split(CharSequence, int)
- MatchResult find(CharSequence, int)
- boolean containsMatchIn(CharSequence)
- **static** List split$default(Regex, CharSequence, int, int, Object)
- String toString()
- **static** Sequence findAll$default(Regex, CharSequence, int, int, Object)
- Sequence<String> splitToSequence(CharSequence, int)
- Set<RegexOption> getOptions()
- **static** Sequence splitToSequence$default(Regex, CharSequence, int, int, Object)
- String getPattern()

### Class: io.tebex.plugin.libs.kotlin.text.Regex$Companion
Type: Class

Methods:
- String escapeReplacement(String)
- String escape(String)
- Regex fromLiteral(String)
- **static** int access$ensureUnicodeCase(Regex$Companion, int)

### Class: io.tebex.plugin.libs.kotlin.text.Regex$Serialized$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.kotlin.text.Regex$special$$inlined$fromInt$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.Lambda
Implements: io.tebex.plugin.libs.kotlin.jvm.functions.Function1

Methods:
- Boolean invoke(RegexOption)
- Object invoke(Object)

### Class: io.tebex.plugin.libs.kotlin.text.RegexKt
Type: Class

Methods:
- **static** IntRange access$range(MatchResult)
- **static** IntRange access$range(MatchResult, int)
- **static** MatchResult access$matchEntire(Matcher, CharSequence)
- **static** MatchResult access$findNext(Matcher, int, CharSequence)
- **static** int access$toInt(Iterable)

### Class: io.tebex.plugin.libs.kotlin.text.RegexKt$fromInt$1$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.jvm.internal.Lambda
Implements: io.tebex.plugin.libs.kotlin.jvm.functions.Function1

Methods:
- Boolean invoke(T)
- Object invoke(Object)

### Class: io.tebex.plugin.libs.kotlin.text.RegexOption
Type: Enum
Extends: java.lang.Enum
Implements: io.tebex.plugin.libs.kotlin.text.FlagEnum

Enum Constants:
- IGNORE_CASE
- MULTILINE
- LITERAL
- UNIX_LINES
- COMMENTS
- DOT_MATCHES_ALL
- CANON_EQ

Methods:
- int getMask()
- int getValue()
- **static** EnumEntries<RegexOption> getEntries()
- **static** RegexOption valueOf(String)
- **static** RegexOption[] values()

### Class: io.tebex.plugin.libs.kotlin.text.StringsKt
Type: Class
Extends: io.tebex.plugin.libs.kotlin.text.StringsKt___StringsKt

No public methods found

### Class: io.tebex.plugin.libs.kotlin.text.StringsKt__StringsKt$iterator$1
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.CharIterator

Methods:
- char nextChar()
- boolean hasNext()

### Class: io.tebex.plugin.libs.kotlin.text.StringsKt___StringsKt$asIterable$$inlined$Iterable$1
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- Iterator<Character> iterator()

### Class: io.tebex.plugin.libs.kotlin.text.StringsKt___StringsKt$asSequence$$inlined$Sequence$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.sequences.Sequence

Methods:
- Iterator<Character> iterator()

### Class: io.tebex.plugin.libs.kotlin.text.StringsKt___StringsKt$groupingBy$1
Type: Class
Implements: io.tebex.plugin.libs.kotlin.collections.Grouping

Methods:
- TK keyOf(char)
- Object keyOf(Object)
- Iterator<Character> sourceIterator()

### Class: io.tebex.plugin.libs.kotlin.text._OneToManyTitlecaseMappingsKt
Type: Class

Methods:
- **static** String titlecaseImpl(char)

## Package: io.tebex.plugin.libs.okhttp3

### Class: io.tebex.plugin.libs.okhttp3.Authenticator
Type: Interface

Methods:
- Request authenticate(Route, Response) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.Call
Type: Interface
Implements: java.lang.Cloneable

Methods:
- void cancel()
- void enqueue(Callback)
- Request request()
- boolean isCanceled()
- boolean isExecuted()
- Call clone()
- Response execute() throws IOException
- Timeout timeout()

### Class: io.tebex.plugin.libs.okhttp3.Call$Factory
Type: Interface

Methods:
- Call newCall(Request)

### Class: io.tebex.plugin.libs.okhttp3.Callback
Type: Interface

Methods:
- void onResponse(Call, Response) throws IOException
- void onFailure(Call, IOException)

### Class: io.tebex.plugin.libs.okhttp3.Connection
Type: Interface

Methods:
- Handshake handshake()
- Protocol protocol()
- Route route()
- Socket socket()

### Class: io.tebex.plugin.libs.okhttp3.CookieJar
Type: Interface

Methods:
- V saveFromResponse(HttpUrl, List<Cookie>)
- List<Cookie> loadForRequest(HttpUrl)

### Class: io.tebex.plugin.libs.okhttp3.Dns
Type: Interface

Methods:
- List<InetAddress> lookup(String) throws UnknownHostException

### Class: io.tebex.plugin.libs.okhttp3.EventListener$Factory
Type: Interface

Methods:
- EventListener create(Call)

### Class: io.tebex.plugin.libs.okhttp3.Interceptor
Type: Interface

Methods:
- Response intercept(Interceptor$Chain) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.Interceptor$Chain
Type: Interface

Methods:
- Call call()
- Request request()
- Interceptor$Chain withReadTimeout(int, TimeUnit)
- Interceptor$Chain withConnectTimeout(int, TimeUnit)
- Response proceed(Request) throws IOException
- Interceptor$Chain withWriteTimeout(int, TimeUnit)
- int readTimeoutMillis()
- int connectTimeoutMillis()
- int writeTimeoutMillis()
- Connection connection()

### Class: io.tebex.plugin.libs.okhttp3.WebSocket
Type: Interface

Methods:
- void cancel()
- Request request()
- long queueSize()
- boolean close(int, String)
- boolean send(String)
- boolean send(ByteString)

### Class: io.tebex.plugin.libs.okhttp3.WebSocket$Factory
Type: Interface

Methods:
- WebSocket newWebSocket(Request, WebSocketListener)

### Class: io.tebex.plugin.libs.okhttp3.Address
Type: Class

Methods:
- HttpUrl -deprecated_url()
- HostnameVerifier -deprecated_hostnameVerifier()
- boolean equalsNonHost$okhttp(Address)
- HostnameVerifier hostnameVerifier()
- ProxySelector proxySelector()
- SSLSocketFactory sslSocketFactory()
- int hashCode()
- Authenticator proxyAuthenticator()
- Dns -deprecated_dns()
- ProxySelector -deprecated_proxySelector()
- List<Protocol> protocols()
- List<ConnectionSpec> -deprecated_connectionSpecs()
- SocketFactory socketFactory()
- Proxy -deprecated_proxy()
- Dns dns()
- Authenticator -deprecated_proxyAuthenticator()
- CertificatePinner certificatePinner()
- SSLSocketFactory -deprecated_sslSocketFactory()
- List<ConnectionSpec> connectionSpecs()
- HttpUrl url()
- SocketFactory -deprecated_socketFactory()
- Proxy proxy()
- CertificatePinner -deprecated_certificatePinner()
- List<Protocol> -deprecated_protocols()
- boolean equals(Object)
- String toString()

### Class: io.tebex.plugin.libs.okhttp3.Authenticator$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.Cache
Type: Class
Implements: java.io.Closeable, java.io.Flushable

Methods:
- Response get$okhttp(Request)
- int hitCount()
- long maxSize()
- DiskLruCache getCache$okhttp()
- int networkCount()
- File directory()
- void delete() throws IOException
- void setWriteAbortCount$okhttp(int)
- Iterator<String> urls() throws IOException
- void evictAll() throws IOException
- void flush() throws IOException
- CacheRequest put$okhttp(Response)
- void setWriteSuccessCount$okhttp(int)
- void close() throws IOException
- **static** String key(HttpUrl)
- void trackConditionalCacheHit$okhttp()
- int requestCount()
- void update$okhttp(Response, Response)
- File -deprecated_directory()
- int getWriteSuccessCount$okhttp()
- void remove$okhttp(Request) throws IOException
- int writeAbortCount()
- void trackResponse$okhttp(CacheStrategy)
- int writeSuccessCount()
- long size() throws IOException
- boolean isClosed()
- void initialize() throws IOException
- int getWriteAbortCount$okhttp()

### Class: io.tebex.plugin.libs.okhttp3.Cache$CacheResponseBody$1
Type: Class
Extends: io.tebex.plugin.libs.okio.ForwardingSource

Methods:
- void close() throws IOException

### Class: io.tebex.plugin.libs.okhttp3.Cache$Companion
Type: Class

Methods:
- Headers varyHeaders(Response)
- boolean hasVaryAll(Response)
- int readInt$okhttp(BufferedSource) throws IOException
- boolean varyMatches(Response, Headers, Request)
- String key(HttpUrl)

### Class: io.tebex.plugin.libs.okhttp3.Cache$Entry$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.Cache$RealCacheRequest$1
Type: Class
Extends: io.tebex.plugin.libs.okio.ForwardingSink

Methods:
- void close() throws IOException

### Class: io.tebex.plugin.libs.okhttp3.Cache$urls$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableIterator

Methods:
- String next()
- Object next()
- boolean hasNext()
- void remove()

### Class: io.tebex.plugin.libs.okhttp3.CacheControl
Type: Class

Methods:
- boolean onlyIfCached()
- int -deprecated_minFreshSeconds()
- int maxStaleSeconds()
- boolean noTransform()
- int sMaxAgeSeconds()
- **static** CacheControl parse(Headers)
- int -deprecated_maxAgeSeconds()
- boolean isPrivate()
- int -deprecated_maxStaleSeconds()
- boolean -deprecated_mustRevalidate()
- int minFreshSeconds()
- boolean -deprecated_noCache()
- boolean immutable()
- boolean -deprecated_immutable()
- boolean noCache()
- boolean -deprecated_onlyIfCached()
- boolean -deprecated_noTransform()
- boolean isPublic()
- String toString()
- boolean -deprecated_noStore()
- int -deprecated_sMaxAgeSeconds()
- boolean mustRevalidate()
- int maxAgeSeconds()
- boolean noStore()

### Class: io.tebex.plugin.libs.okhttp3.CacheControl$Builder
Type: Class

Methods:
- CacheControl$Builder onlyIfCached()
- CacheControl$Builder immutable()
- CacheControl$Builder noCache()
- CacheControl build()
- CacheControl$Builder maxAge(int, TimeUnit)
- CacheControl$Builder noTransform()
- CacheControl$Builder maxStale(int, TimeUnit)
- CacheControl$Builder minFresh(int, TimeUnit)
- CacheControl$Builder noStore()

### Class: io.tebex.plugin.libs.okhttp3.CacheControl$Companion
Type: Class

Methods:
- CacheControl parse(Headers)

### Class: io.tebex.plugin.libs.okhttp3.CertificatePinner
Type: Class

Methods:
- **static** String pin(Certificate)
- **static** ByteString sha256Hash(X509Certificate)
- CertificateChainCleaner getCertificateChainCleaner$okhttp()
- int hashCode()
- boolean equals(Object)
- CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner)
- Set<CertificatePinner$Pin> getPins()
- V check$okhttp(String, Function0<List<X509Certificate>>)
- **static** ByteString sha1Hash(X509Certificate)
- V check(String, List<Certificate>) throws SSLPeerUnverifiedException
- void check(String, Certificate[]) throws SSLPeerUnverifiedException
- List<CertificatePinner$Pin> findMatchingPins(String)

### Class: io.tebex.plugin.libs.okhttp3.CertificatePinner$Builder
Type: Class

Methods:
- CertificatePinner$Builder add(String, String[])
- CertificatePinner build()
- List<CertificatePinner$Pin> getPins()

### Class: io.tebex.plugin.libs.okhttp3.CertificatePinner$Companion
Type: Class

Methods:
- String pin(Certificate)
- ByteString sha256Hash(X509Certificate)
- ByteString sha1Hash(X509Certificate)

### Class: io.tebex.plugin.libs.okhttp3.CertificatePinner$Pin
Type: Class

Methods:
- ByteString getHash()
- String getHashAlgorithm()
- boolean matchesHostname(String)
- int hashCode()
- boolean equals(Object)
- String toString()
- boolean matchesCertificate(X509Certificate)
- String getPattern()

### Class: io.tebex.plugin.libs.okhttp3.Challenge
Type: Class

Methods:
- Map<String, String> -deprecated_authParams()
- Charset charset()
- Charset -deprecated_charset()
- Map<String, String> authParams()
- String scheme()
- int hashCode()
- Challenge withCharset(Charset)
- boolean equals(Object)
- String toString()
- String realm()
- String -deprecated_scheme()
- String -deprecated_realm()

### Class: io.tebex.plugin.libs.okhttp3.CipherSuite
Type: Class

Methods:
- String -deprecated_javaName()
- **static** Comparator access$getORDER_BY_NAME$cp()
- String toString()
- **static** CipherSuite forJavaName(String)
- String javaName()
- **static** Map access$getINSTANCES$cp()

### Class: io.tebex.plugin.libs.okhttp3.CipherSuite$Companion
Type: Class

Methods:
- **static** CipherSuite access$init(CipherSuite$Companion, String, int)
- Comparator<String> getORDER_BY_NAME$okhttp()
- CipherSuite forJavaName(String)

### Class: io.tebex.plugin.libs.okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1
Type: Class
Implements: java.util.Comparator

Methods:
- int compare(String, String)
- int compare(Object, Object)

### Class: io.tebex.plugin.libs.okhttp3.ConnectionPool
Type: Class

Methods:
- void evictAll()
- int connectionCount()
- int idleConnectionCount()
- RealConnectionPool getDelegate$okhttp()

### Class: io.tebex.plugin.libs.okhttp3.ConnectionSpec
Type: Class

Methods:
- **static** String[] access$getCipherSuitesAsString$p(ConnectionSpec)
- List<CipherSuite> -deprecated_cipherSuites()
- boolean isTls()
- boolean isCompatible(SSLSocket)
- void apply$okhttp(SSLSocket, boolean)
- boolean -deprecated_supportsTlsExtensions()
- boolean supportsTlsExtensions()
- List<TlsVersion> tlsVersions()
- **static** String[] access$getTlsVersionsAsString$p(ConnectionSpec)
- int hashCode()
- List<CipherSuite> cipherSuites()
- boolean equals(Object)
- String toString()
- List<TlsVersion> -deprecated_tlsVersions()

### Class: io.tebex.plugin.libs.okhttp3.ConnectionSpec$Builder
Type: Class

Methods:
- ConnectionSpec$Builder allEnabledCipherSuites()
- boolean getSupportsTlsExtensions$okhttp()
- boolean getTls$okhttp()
- ConnectionSpec$Builder supportsTlsExtensions(boolean)
- ConnectionSpec$Builder allEnabledTlsVersions()
- ConnectionSpec build()
- ConnectionSpec$Builder tlsVersions(TlsVersion[])
- ConnectionSpec$Builder tlsVersions(String[])
- ConnectionSpec$Builder cipherSuites(CipherSuite[])
- ConnectionSpec$Builder cipherSuites(String[])
- void setTlsVersions$okhttp(String[])
- void setSupportsTlsExtensions$okhttp(boolean)
- String[] getCipherSuites$okhttp()
- void setCipherSuites$okhttp(String[])
- String[] getTlsVersions$okhttp()
- void setTls$okhttp(boolean)

### Class: io.tebex.plugin.libs.okhttp3.ConnectionSpec$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.Cookie
Type: Class

Methods:
- boolean -deprecated_hostOnly()
- **static** Pattern access$getMONTH_PATTERN$cp()
- String -deprecated_name()
- **static** Pattern access$getYEAR_PATTERN$cp()
- boolean secure()
- String path()
- int hashCode()
- long -deprecated_expiresAt()
- boolean httpOnly()
- boolean persistent()
- String value()
- **static** Pattern access$getDAY_OF_MONTH_PATTERN$cp()
- **static** List<Cookie> parseAll(HttpUrl, Headers)
- String -deprecated_value()
- boolean hostOnly()
- **static** Pattern access$getTIME_PATTERN$cp()
- **static** Cookie parse(HttpUrl, String)
- String -deprecated_path()
- boolean matches(HttpUrl)
- long expiresAt()
- boolean -deprecated_secure()
- boolean equals(Object)
- String domain()
- String name()
- String -deprecated_domain()
- boolean -deprecated_persistent()
- String toString()
- String toString$okhttp(boolean)
- boolean -deprecated_httpOnly()

### Class: io.tebex.plugin.libs.okhttp3.Cookie$Builder
Type: Class

Methods:
- Cookie$Builder path(String)
- Cookie build()
- Cookie$Builder domain(String)
- Cookie$Builder name(String)
- Cookie$Builder httpOnly()
- Cookie$Builder hostOnlyDomain(String)
- Cookie$Builder secure()
- Cookie$Builder value(String)
- Cookie$Builder expiresAt(long)

### Class: io.tebex.plugin.libs.okhttp3.Cookie$Companion
Type: Class

Methods:
- List<Cookie> parseAll(HttpUrl, Headers)
- **static** boolean access$domainMatch(Cookie$Companion, String, String)
- **static** boolean access$pathMatch(Cookie$Companion, HttpUrl, String)
- Cookie parse(HttpUrl, String)
- Cookie parse$okhttp(long, HttpUrl, String)

### Class: io.tebex.plugin.libs.okhttp3.CookieJar$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.Credentials
Type: Class

Methods:
- **static** String basic$default(String, String, Charset, int, Object)
- **static** String basic(String, String, Charset)
- **static** String basic(String, String)

### Class: io.tebex.plugin.libs.okhttp3.Dispatcher
Type: Class

Methods:
- void cancelAll()
- void finished$okhttp(RealCall$AsyncCall)
- void finished$okhttp(RealCall)
- ExecutorService executorService()
- List<Call> queuedCalls()
- void setMaxRequests(int)
- int queuedCallsCount()
- int getMaxRequestsPerHost()
- void enqueue$okhttp(RealCall$AsyncCall)
- void executed$okhttp(RealCall)
- List<Call> runningCalls()
- Runnable getIdleCallback()
- void setMaxRequestsPerHost(int)
- ExecutorService -deprecated_executorService()
- int getMaxRequests()
- int runningCallsCount()
- void setIdleCallback(Runnable)

### Class: io.tebex.plugin.libs.okhttp3.Dns$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.EventListener
Type: Abstract Class

Methods:
- void responseBodyStart(Call)
- void secureConnectEnd(Call, Handshake)
- void requestFailed(Call, IOException)
- void secureConnectStart(Call)
- void connectionReleased(Call, Connection)
- void callFailed(Call, IOException)
- void cacheConditionalHit(Call, Response)
- void responseBodyEnd(Call, long)
- V proxySelectEnd(Call, HttpUrl, List<Proxy>)
- void requestBodyStart(Call)
- void dnsStart(Call, String)
- void connectEnd(Call, InetSocketAddress, Proxy, Protocol)
- void proxySelectStart(Call, HttpUrl)
- void responseFailed(Call, IOException)
- void cacheHit(Call, Response)
- void satisfactionFailure(Call, Response)
- void callStart(Call)
- V dnsEnd(Call, String, List<InetAddress>)
- void requestHeadersEnd(Call, Request)
- void cacheMiss(Call)
- void connectionAcquired(Call, Connection)
- void requestBodyEnd(Call, long)
- void responseHeadersEnd(Call, Response)
- void requestHeadersStart(Call)
- void callEnd(Call)
- void connectFailed(Call, InetSocketAddress, Proxy, Protocol, IOException)
- void canceled(Call)
- void connectStart(Call, InetSocketAddress, Proxy)
- void responseHeadersStart(Call)

### Class: io.tebex.plugin.libs.okhttp3.EventListener$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.EventListener$Companion$NONE$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.EventListener

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.Handshake
Type: Class

Methods:
- TlsVersion -deprecated_tlsVersion()
- List<Certificate> localCertificates()
- Principal localPrincipal()
- Principal peerPrincipal()
- CipherSuite -deprecated_cipherSuite()
- List<Certificate> -deprecated_peerCertificates()
- TlsVersion tlsVersion()
- CipherSuite cipherSuite()
- List<Certificate> peerCertificates()
- Principal -deprecated_peerPrincipal()
- List<Certificate> -deprecated_localCertificates()
- int hashCode()
- **static** Handshake get(SSLSession) throws IOException
- **static** Handshake get(TlsVersion, CipherSuite, List<Certificate>, List<Certificate>)
- boolean equals(Object)
- Principal -deprecated_localPrincipal()
- String toString()

### Class: io.tebex.plugin.libs.okhttp3.Handshake$Companion
Type: Class

Methods:
- Handshake -deprecated_get(SSLSession) throws IOException
- Handshake get(SSLSession) throws IOException
- Handshake get(TlsVersion, CipherSuite, List<Certificate>, List<Certificate>)

### Class: io.tebex.plugin.libs.okhttp3.Headers
Type: Class
Implements: java.lang.Iterable, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMappedMarker

Methods:
- List<String> values(String)
- int -deprecated_size()
- Headers$Builder newBuilder()
- Instant getInstant(String)
- Iterator<Pair<String, String>> iterator()
- Set<String> names()
- int size()
- int hashCode()
- long byteCount()
- **static** Headers of(String[])
- **static** Headers of(Map<String, String>)
- boolean equals(Object)
- String get(String)
- Map<String, List<String>> toMultimap()
- String name(int)
- String toString()
- Date getDate(String)
- String value(int)

### Class: io.tebex.plugin.libs.okhttp3.Headers$Builder
Type: Class

Methods:
- Headers$Builder add(String)
- Headers$Builder add(String, String)
- Headers$Builder add(String, Date)
- Headers$Builder add(String, Instant)
- Headers$Builder removeAll(String)
- Headers$Builder set(String, Date)
- Headers$Builder set(String, Instant)
- Headers$Builder set(String, String)
- Headers$Builder addLenient$okhttp(String)
- Headers$Builder addLenient$okhttp(String, String)
- Headers build()
- Headers$Builder addAll(Headers)
- String get(String)
- List<String> getNamesAndValues$okhttp()
- Headers$Builder addUnsafeNonAscii(String, String)

### Class: io.tebex.plugin.libs.okhttp3.Headers$Companion
Type: Class

Methods:
- **static** void access$checkName(Headers$Companion, String)
- Headers -deprecated_of(String[])
- Headers -deprecated_of(Map<String, String>)
- Headers of(String[])
- Headers of(Map<String, String>)
- **static** String access$get(Headers$Companion, String[], String)
- **static** void access$checkValue(Headers$Companion, String, String)

### Class: io.tebex.plugin.libs.okhttp3.HttpUrl
Type: Class

Methods:
- Set<String> -deprecated_queryParameterNames()
- String encodedPath()
- HttpUrl resolve(String)
- int -deprecated_port()
- **static** int defaultPort(String)
- String password()
- String host()
- String encodedUsername()
- String queryParameter(String)
- int -deprecated_querySize()
- String -deprecated_query()
- String -deprecated_host()
- int querySize()
- String redact()
- String query()
- List<String> -deprecated_pathSegments()
- int port()
- List<String> -deprecated_encodedPathSegments()
- int -deprecated_pathSize()
- String encodedPassword()
- **static** char[] access$getHEX_DIGITS$cp()
- boolean isHttps()
- URL -deprecated_url()
- String -deprecated_encodedQuery()
- String scheme()
- String -deprecated_scheme()
- String -deprecated_fragment()
- String topPrivateDomain()
- String encodedQuery()
- int pathSize()
- String -deprecated_encodedFragment()
- int hashCode()
- List<String> encodedPathSegments()
- **static** HttpUrl get(String)
- **static** HttpUrl get(URL)
- **static** HttpUrl get(URI)
- String -deprecated_encodedPassword()
- List<String> pathSegments()
- String -deprecated_username()
- URI -deprecated_uri()
- String encodedFragment()
- **static** HttpUrl parse(String)
- String -deprecated_encodedPath()
- String queryParameterValue(int)
- Set<String> queryParameterNames()
- HttpUrl$Builder newBuilder()
- HttpUrl$Builder newBuilder(String)
- URI uri()
- URL url()
- String queryParameterName(int)
- String -deprecated_password()
- String fragment()
- String -deprecated_encodedUsername()
- boolean equals(Object)
- List<String> queryParameterValues(String)
- String toString()
- String username()

### Class: io.tebex.plugin.libs.okhttp3.HttpUrl$Builder
Type: Class

Methods:
- HttpUrl$Builder encodedPath(String)
- void setScheme$okhttp(String)
- HttpUrl$Builder removePathSegment(int)
- HttpUrl$Builder scheme(String)
- void setEncodedFragment$okhttp(String)
- String getEncodedFragment$okhttp()
- String getEncodedUsername$okhttp()
- HttpUrl$Builder password(String)
- HttpUrl$Builder addEncodedQueryParameter(String, String)
- HttpUrl$Builder encodedQuery(String)
- HttpUrl$Builder addEncodedPathSegment(String)
- String getHost$okhttp()
- HttpUrl$Builder host(String)
- void setEncodedPassword$okhttp(String)
- HttpUrl$Builder encodedUsername(String)
- HttpUrl$Builder addPathSegments(String)
- HttpUrl$Builder setEncodedPathSegment(int, String)
- String getEncodedPassword$okhttp()
- V setEncodedQueryNamesAndValues$okhttp(List<String>)
- List<String> getEncodedQueryNamesAndValues$okhttp()
- String getScheme$okhttp()
- HttpUrl$Builder query(String)
- void setPort$okhttp(int)
- HttpUrl$Builder setQueryParameter(String, String)
- HttpUrl$Builder encodedFragment(String)
- HttpUrl$Builder setEncodedQueryParameter(String, String)
- HttpUrl$Builder addPathSegment(String)
- int getPort$okhttp()
- List<String> getEncodedPathSegments$okhttp()
- HttpUrl$Builder addEncodedPathSegments(String)
- HttpUrl$Builder reencodeForUri$okhttp()
- HttpUrl$Builder fragment(String)
- HttpUrl$Builder removeAllEncodedQueryParameters(String)
- HttpUrl$Builder addQueryParameter(String, String)
- HttpUrl build()
- HttpUrl$Builder port(int)
- HttpUrl$Builder encodedPassword(String)
- String toString()
- HttpUrl$Builder removeAllQueryParameters(String)
- HttpUrl$Builder setPathSegment(int, String)
- void setEncodedUsername$okhttp(String)
- HttpUrl$Builder parse$okhttp(HttpUrl, String)
- HttpUrl$Builder username(String)
- void setHost$okhttp(String)

### Class: io.tebex.plugin.libs.okhttp3.HttpUrl$Builder$Companion
Type: Class

Methods:
- **static** int access$slashCount(HttpUrl$Builder$Companion, String, int, int)
- **static** int access$parsePort(HttpUrl$Builder$Companion, String, int, int)
- **static** int access$portColonOffset(HttpUrl$Builder$Companion, String, int, int)
- **static** int access$schemeDelimiterOffset(HttpUrl$Builder$Companion, String, int, int)

### Class: io.tebex.plugin.libs.okhttp3.HttpUrl$Companion
Type: Class

Methods:
- **static** String canonicalize$okhttp$default(HttpUrl$Companion, String, int, int, String, boolean, boolean, boolean, boolean, Charset, int, Object)
- int defaultPort(String)
- V toPathString$okhttp(List<String>, StringBuilder)
- HttpUrl -deprecated_parse(String)
- HttpUrl -deprecated_get(String)
- HttpUrl -deprecated_get(URL)
- HttpUrl -deprecated_get(URI)
- List<String> toQueryNamesAndValues$okhttp(String)
- String canonicalize$okhttp(String, int, int, String, boolean, boolean, boolean, boolean, Charset)
- HttpUrl get(String)
- HttpUrl get(URL)
- HttpUrl get(URI)
- **static** String percentDecode$okhttp$default(HttpUrl$Companion, String, int, int, boolean, int, Object)
- String percentDecode$okhttp(String, int, int, boolean)
- HttpUrl parse(String)
- V toQueryString$okhttp(List<String>, StringBuilder)

### Class: io.tebex.plugin.libs.okhttp3.Interceptor$Companion
Type: Class

Methods:
- Interceptor invoke(Function1<Interceptor$Chain, Response>)

### Class: io.tebex.plugin.libs.okhttp3.Interceptor$Companion$invoke$1
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Interceptor

Methods:
- Response intercept(Interceptor$Chain)

### Class: io.tebex.plugin.libs.okhttp3.MediaType
Type: Class

Methods:
- Charset charset(Charset)
- Charset charset()
- **static** Charset charset$default(MediaType, Charset, int, Object)
- **static** MediaType parse(String)
- String type()
- **static** Pattern access$getPARAMETER$cp()
- String -deprecated_subtype()
- String -deprecated_type()
- String subtype()
- int hashCode()
- **static** MediaType get(String)
- boolean equals(Object)
- String parameter(String)
- String toString()
- **static** Pattern access$getTYPE_SUBTYPE$cp()

### Class: io.tebex.plugin.libs.okhttp3.MediaType$Companion
Type: Class

Methods:
- MediaType -deprecated_parse(String)
- MediaType -deprecated_get(String)
- MediaType get(String)
- MediaType parse(String)

### Class: io.tebex.plugin.libs.okhttp3.OkHttpClient
Type: Class
Implements: java.lang.Cloneable, io.tebex.plugin.libs.okhttp3.Call$Factory, io.tebex.plugin.libs.okhttp3.WebSocket$Factory

Methods:
- boolean -deprecated_retryOnConnectionFailure()
- HostnameVerifier -deprecated_hostnameVerifier()
- HostnameVerifier hostnameVerifier()
- Cache -deprecated_cache()
- **static** List access$getDEFAULT_PROTOCOLS$cp()
- boolean -deprecated_followSslRedirects()
- Authenticator -deprecated_authenticator()
- SSLSocketFactory sslSocketFactory()
- EventListener$Factory eventListenerFactory()
- boolean followRedirects()
- Authenticator proxyAuthenticator()
- Dns -deprecated_dns()
- ProxySelector -deprecated_proxySelector()
- int -deprecated_pingIntervalMillis()
- List<Protocol> protocols()
- Dispatcher dispatcher()
- List<Interceptor> interceptors()
- RouteDatabase getRouteDatabase()
- Cache cache()
- boolean -deprecated_followRedirects()
- boolean followSslRedirects()
- SocketFactory socketFactory()
- EventListener$Factory -deprecated_eventListenerFactory()
- int -deprecated_writeTimeoutMillis()
- Dns dns()
- ConnectionPool connectionPool()
- CertificatePinner certificatePinner()
- List<ConnectionSpec> connectionSpecs()
- SocketFactory -deprecated_socketFactory()
- Proxy proxy()
- int pingIntervalMillis()
- int connectTimeoutMillis()
- int -deprecated_readTimeoutMillis()
- **static** SSLSocketFactory access$getSslSocketFactoryOrNull$p(OkHttpClient)
- ConnectionPool -deprecated_connectionPool()
- int -deprecated_callTimeoutMillis()
- CertificateChainCleaner certificateChainCleaner()
- int -deprecated_connectTimeoutMillis()
- List<Interceptor> networkInterceptors()
- ProxySelector proxySelector()
- X509TrustManager x509TrustManager()
- int writeTimeoutMillis()
- List<ConnectionSpec> -deprecated_connectionSpecs()
- int callTimeoutMillis()
- Authenticator authenticator()
- int readTimeoutMillis()
- Proxy -deprecated_proxy()
- Authenticator -deprecated_proxyAuthenticator()
- OkHttpClient$Builder newBuilder()
- Call newCall(Request)
- CookieJar cookieJar()
- SSLSocketFactory -deprecated_sslSocketFactory()
- List<Interceptor> -deprecated_interceptors()
- boolean retryOnConnectionFailure()
- long minWebSocketMessageToCompress()
- CertificatePinner -deprecated_certificatePinner()
- List<Protocol> -deprecated_protocols()
- List<Interceptor> -deprecated_networkInterceptors()
- **static** List access$getDEFAULT_CONNECTION_SPECS$cp()
- Object clone()
- CookieJar -deprecated_cookieJar()
- WebSocket newWebSocket(Request, WebSocketListener)
- Dispatcher -deprecated_dispatcher()

### Class: io.tebex.plugin.libs.okhttp3.OkHttpClient$Builder
Type: Class

Methods:
- List<Interceptor> getNetworkInterceptors$okhttp()
- void setMinWebSocketMessageToCompress$okhttp(long)
- int getWriteTimeout$okhttp()
- List<Interceptor> getInterceptors$okhttp()
- OkHttpClient$Builder hostnameVerifier(HostnameVerifier)
- int getReadTimeout$okhttp()
- void setCertificateChainCleaner$okhttp(CertificateChainCleaner)
- Cache getCache$okhttp()
- void setFollowSslRedirects$okhttp(boolean)
- OkHttpClient$Builder sslSocketFactory(SSLSocketFactory)
- OkHttpClient$Builder sslSocketFactory(SSLSocketFactory, X509TrustManager)
- SSLSocketFactory getSslSocketFactoryOrNull$okhttp()
- OkHttpClient$Builder eventListenerFactory(EventListener$Factory)
- int getPingInterval$okhttp()
- OkHttpClient$Builder followRedirects(boolean)
- OkHttpClient$Builder proxyAuthenticator(Authenticator)
- OkHttpClient$Builder connectTimeout(long, TimeUnit)
- OkHttpClient$Builder connectTimeout(Duration)
- OkHttpClient$Builder eventListener(EventListener)
- OkHttpClient$Builder protocols(List<Protocol>)
- OkHttpClient$Builder dispatcher(Dispatcher)
- long getMinWebSocketMessageToCompress$okhttp()
- void setDispatcher$okhttp(Dispatcher)
- List<Interceptor> interceptors()
- void setFollowRedirects$okhttp(boolean)
- OkHttpClient$Builder pingInterval(long, TimeUnit)
- OkHttpClient$Builder pingInterval(Duration)
- void setRetryOnConnectionFailure$okhttp(boolean)
- OkHttpClient$Builder cache(Cache)
- boolean getFollowSslRedirects$okhttp()
- OkHttpClient$Builder followSslRedirects(boolean)
- OkHttpClient$Builder socketFactory(SocketFactory)
- ProxySelector getProxySelector$okhttp()
- void setCookieJar$okhttp(CookieJar)
- OkHttpClient$Builder dns(Dns)
- OkHttpClient$Builder callTimeout(long, TimeUnit)
- OkHttpClient$Builder callTimeout(Duration)
- OkHttpClient$Builder connectionPool(ConnectionPool)
- void setCertificatePinner$okhttp(CertificatePinner)
- boolean getRetryOnConnectionFailure$okhttp()
- void setConnectionPool$okhttp(ConnectionPool)
- OkHttpClient$Builder certificatePinner(CertificatePinner)
- OkHttpClient$Builder connectionSpecs(List<ConnectionSpec>)
- void setRouteDatabase$okhttp(RouteDatabase)
- CookieJar getCookieJar$okhttp()
- OkHttpClient$Builder proxy(Proxy)
- OkHttpClient$Builder addInterceptor(Interceptor)
- V setConnectionSpecs$okhttp(List<ConnectionSpec>)
- Authenticator getAuthenticator$okhttp()
- OkHttpClient$Builder -addInterceptor(Function1<Interceptor$Chain, Response>)
- void setCache$okhttp(Cache)
- void setProxyAuthenticator$okhttp(Authenticator)
- void setSocketFactory$okhttp(SocketFactory)
- void setDns$okhttp(Dns)
- void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory)
- void setAuthenticator$okhttp(Authenticator)
- EventListener$Factory getEventListenerFactory$okhttp()
- Dispatcher getDispatcher$okhttp()
- OkHttpClient$Builder writeTimeout(long, TimeUnit)
- OkHttpClient$Builder writeTimeout(Duration)
- ConnectionPool getConnectionPool$okhttp()
- List<Interceptor> networkInterceptors()
- OkHttpClient$Builder proxySelector(ProxySelector)
- HostnameVerifier getHostnameVerifier$okhttp()
- X509TrustManager getX509TrustManagerOrNull$okhttp()
- void setProxySelector$okhttp(ProxySelector)
- void setCallTimeout$okhttp(int)
- V setProtocols$okhttp(List<Protocol>)
- void setWriteTimeout$okhttp(int)
- void setProxy$okhttp(Proxy)
- RouteDatabase getRouteDatabase$okhttp()
- CertificatePinner getCertificatePinner$okhttp()
- void setReadTimeout$okhttp(int)
- void setPingInterval$okhttp(int)
- OkHttpClient$Builder authenticator(Authenticator)
- int getCallTimeout$okhttp()
- List<Protocol> getProtocols$okhttp()
- void setX509TrustManagerOrNull$okhttp(X509TrustManager)
- Authenticator getProxyAuthenticator$okhttp()
- boolean getFollowRedirects$okhttp()
- void setEventListenerFactory$okhttp(EventListener$Factory)
- CertificateChainCleaner getCertificateChainCleaner$okhttp()
- List<ConnectionSpec> getConnectionSpecs$okhttp()
- Proxy getProxy$okhttp()
- Dns getDns$okhttp()
- OkHttpClient$Builder -addNetworkInterceptor(Function1<Interceptor$Chain, Response>)
- OkHttpClient$Builder cookieJar(CookieJar)
- OkHttpClient$Builder retryOnConnectionFailure(boolean)
- OkHttpClient$Builder minWebSocketMessageToCompress(long)
- OkHttpClient build()
- OkHttpClient$Builder readTimeout(long, TimeUnit)
- OkHttpClient$Builder readTimeout(Duration)
- void setConnectTimeout$okhttp(int)
- void setHostnameVerifier$okhttp(HostnameVerifier)
- SocketFactory getSocketFactory$okhttp()
- OkHttpClient$Builder addNetworkInterceptor(Interceptor)
- int getConnectTimeout$okhttp()

### Class: io.tebex.plugin.libs.okhttp3.OkHttpClient$Builder$addInterceptor$2
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Interceptor

Methods:
- Response intercept(Interceptor$Chain)

### Class: io.tebex.plugin.libs.okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Interceptor

Methods:
- Response intercept(Interceptor$Chain)

### Class: io.tebex.plugin.libs.okhttp3.OkHttpClient$Companion
Type: Class

Methods:
- List<Protocol> getDEFAULT_PROTOCOLS$okhttp()
- List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp()

### Class: io.tebex.plugin.libs.okhttp3.Protocol
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- HTTP_1_0
- HTTP_1_1
- SPDY_3
- HTTP_2
- H2_PRIOR_KNOWLEDGE
- QUIC

Methods:
- **static** String access$getProtocol$p(Protocol)
- **static** Protocol valueOf(String)
- **static** Protocol get(String) throws IOException
- **static** Protocol[] values()
- String toString()

### Class: io.tebex.plugin.libs.okhttp3.Protocol$Companion
Type: Class

Methods:
- Protocol get(String) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.Request
Type: Class

Methods:
- Headers headers()
- List<String> headers(String)
- RequestBody -deprecated_body()
- HttpUrl -deprecated_url()
- Map<Class<*>, Object> getTags$okhttp()
- Headers -deprecated_headers()
- String method()
- String -deprecated_method()
- RequestBody body()
- Request$Builder newBuilder()
- CacheControl cacheControl()
- HttpUrl url()
- String header(String)
- boolean isHttps()
- String toString()
- Object tag()
- TT tag(Class<+TT>)
- CacheControl -deprecated_cacheControl()

### Class: io.tebex.plugin.libs.okhttp3.Request$Builder
Type: Class

Methods:
- Map<Class<*>, Object> getTags$okhttp()
- HttpUrl getUrl$okhttp()
- void setMethod$okhttp(String)
- void setBody$okhttp(RequestBody)
- **static** Request$Builder delete$default(Request$Builder, RequestBody, int, Object)
- Request$Builder delete(RequestBody)
- Request$Builder delete()
- Request$Builder put(RequestBody)
- Request$Builder patch(RequestBody)
- Request$Builder head()
- Request$Builder post(RequestBody)
- Request$Builder get()
- Request$Builder tag(Object)
- Request$Builder tag(Class<-TT>, T)
- Request$Builder headers(Headers)
- Request$Builder addHeader(String, String)
- Request$Builder method(String, RequestBody)
- String getMethod$okhttp()
- Request$Builder cacheControl(CacheControl)
- Request$Builder url(HttpUrl)
- Request$Builder url(String)
- Request$Builder url(URL)
- Request$Builder removeHeader(String)
- V setTags$okhttp(Map<Class<*>, Object>)
- RequestBody getBody$okhttp()
- Request build()
- void setUrl$okhttp(HttpUrl)
- Request$Builder header(String, String)
- Headers$Builder getHeaders$okhttp()
- void setHeaders$okhttp(Headers$Builder)

### Class: io.tebex.plugin.libs.okhttp3.RequestBody
Type: Abstract Class

Methods:
- void writeTo(BufferedSink) throws IOException
- boolean isOneShot()
- **static** RequestBody create(String, MediaType)
- **static** RequestBody create(ByteString, MediaType)
- **static** RequestBody create(byte[], MediaType, int, int)
- **static** RequestBody create(File, MediaType)
- **static** RequestBody create(MediaType, String)
- **static** RequestBody create(MediaType, ByteString)
- **static** RequestBody create(MediaType, byte[], int, int)
- **static** RequestBody create(MediaType, File)
- **static** RequestBody create(byte[], MediaType, int)
- **static** RequestBody create(byte[], MediaType)
- **static** RequestBody create(byte[])
- **static** RequestBody create(MediaType, byte[], int)
- **static** RequestBody create(MediaType, byte[])
- long contentLength() throws IOException
- boolean isDuplex()
- MediaType contentType()

### Class: io.tebex.plugin.libs.okhttp3.RequestBody$Companion
Type: Class

Methods:
- **static** RequestBody create$default(RequestBody$Companion, String, MediaType, int, Object)
- **static** RequestBody create$default(RequestBody$Companion, ByteString, MediaType, int, Object)
- **static** RequestBody create$default(RequestBody$Companion, byte[], MediaType, int, int, int, Object)
- **static** RequestBody create$default(RequestBody$Companion, File, MediaType, int, Object)
- **static** RequestBody create$default(RequestBody$Companion, MediaType, byte[], int, int, int, Object)
- RequestBody create(String, MediaType)
- RequestBody create(ByteString, MediaType)
- RequestBody create(byte[], MediaType, int, int)
- RequestBody create(File, MediaType)
- RequestBody create(MediaType, String)
- RequestBody create(MediaType, ByteString)
- RequestBody create(MediaType, byte[], int, int)
- RequestBody create(MediaType, File)
- RequestBody create(byte[], MediaType, int)
- RequestBody create(byte[], MediaType)
- RequestBody create(byte[])
- RequestBody create(MediaType, byte[], int)
- RequestBody create(MediaType, byte[])

### Class: io.tebex.plugin.libs.okhttp3.RequestBody$Companion$asRequestBody$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.RequestBody

Methods:
- void writeTo(BufferedSink)
- long contentLength()
- MediaType contentType()

### Class: io.tebex.plugin.libs.okhttp3.RequestBody$Companion$toRequestBody$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.RequestBody

Methods:
- void writeTo(BufferedSink)
- long contentLength()
- MediaType contentType()

### Class: io.tebex.plugin.libs.okhttp3.RequestBody$Companion$toRequestBody$2
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.RequestBody

Methods:
- void writeTo(BufferedSink)
- long contentLength()
- MediaType contentType()

### Class: io.tebex.plugin.libs.okhttp3.Response
Type: Class
Implements: java.io.Closeable

Methods:
- Handshake handshake()
- Request request()
- int code()
- List<Challenge> challenges()
- Response -deprecated_networkResponse()
- long sentRequestAtMillis()
- **static** String header$default(Response, String, String, int, Object)
- Response networkResponse()
- ResponseBody body()
- boolean isRedirect()
- Protocol protocol()
- boolean isSuccessful()
- long -deprecated_receivedResponseAtMillis()
- Request -deprecated_request()
- CacheControl -deprecated_cacheControl()
- void close()
- Headers headers()
- List<String> headers(String)
- long -deprecated_sentRequestAtMillis()
- ResponseBody -deprecated_body()
- Headers -deprecated_headers()
- Handshake -deprecated_handshake()
- ResponseBody peekBody(long) throws IOException
- String message()
- Response -deprecated_cacheResponse()
- Response$Builder newBuilder()
- CacheControl cacheControl()
- String -deprecated_message()
- Headers trailers() throws IOException
- int -deprecated_code()
- Response cacheResponse()
- Response priorResponse()
- long receivedResponseAtMillis()
- Response -deprecated_priorResponse()
- String header(String, String)
- String header(String)
- String toString()
- Exchange exchange()
- Protocol -deprecated_protocol()

### Class: io.tebex.plugin.libs.okhttp3.Response$Builder
Type: Class

Methods:
- Response getPriorResponse$okhttp()
- Response$Builder handshake(Handshake)
- Response$Builder request(Request)
- void setCacheResponse$okhttp(Response)
- Response$Builder code(int)
- Response getNetworkResponse$okhttp()
- String getMessage$okhttp()
- Response$Builder sentRequestAtMillis(long)
- void setSentRequestAtMillis$okhttp(long)
- void setExchange$okhttp(Exchange)
- Response getCacheResponse$okhttp()
- void setRequest$okhttp(Request)
- Response$Builder networkResponse(Response)
- Response$Builder body(ResponseBody)
- void setBody$okhttp(ResponseBody)
- void setProtocol$okhttp(Protocol)
- void setCode$okhttp(int)
- long getSentRequestAtMillis$okhttp()
- Response$Builder protocol(Protocol)
- void setNetworkResponse$okhttp(Response)
- Request getRequest$okhttp()
- int getCode$okhttp()
- Response$Builder headers(Headers)
- Response$Builder addHeader(String, String)
- void setMessage$okhttp(String)
- void setReceivedResponseAtMillis$okhttp(long)
- Response$Builder message(String)
- void initExchange$okhttp(Exchange)
- Response$Builder cacheResponse(Response)
- Response$Builder removeHeader(String)
- long getReceivedResponseAtMillis$okhttp()
- ResponseBody getBody$okhttp()
- Response build()
- Response$Builder priorResponse(Response)
- Handshake getHandshake$okhttp()
- Response$Builder receivedResponseAtMillis(long)
- Protocol getProtocol$okhttp()
- Response$Builder header(String, String)
- void setPriorResponse$okhttp(Response)
- Headers$Builder getHeaders$okhttp()
- Exchange getExchange$okhttp()
- void setHeaders$okhttp(Headers$Builder)
- void setHandshake$okhttp(Handshake)

### Class: io.tebex.plugin.libs.okhttp3.ResponseBody
Type: Abstract Class
Implements: java.io.Closeable

Methods:
- Reader charStream()
- String string() throws IOException
- ByteString byteString() throws IOException
- InputStream byteStream()
- byte[] bytes() throws IOException
- **static** ResponseBody create(String, MediaType)
- **static** ResponseBody create(byte[], MediaType)
- **static** ResponseBody create(ByteString, MediaType)
- **static** ResponseBody create(BufferedSource, MediaType, long)
- **static** ResponseBody create(MediaType, String)
- **static** ResponseBody create(MediaType, byte[])
- **static** ResponseBody create(MediaType, ByteString)
- **static** ResponseBody create(MediaType, long, BufferedSource)
- long contentLength()
- BufferedSource source()
- void close()
- MediaType contentType()

### Class: io.tebex.plugin.libs.okhttp3.ResponseBody$BomAwareReader
Type: Class
Extends: java.io.Reader

Methods:
- int read(char[], int, int) throws IOException
- void close() throws IOException

### Class: io.tebex.plugin.libs.okhttp3.ResponseBody$Companion
Type: Class

Methods:
- **static** ResponseBody create$default(ResponseBody$Companion, String, MediaType, int, Object)
- **static** ResponseBody create$default(ResponseBody$Companion, byte[], MediaType, int, Object)
- **static** ResponseBody create$default(ResponseBody$Companion, ByteString, MediaType, int, Object)
- **static** ResponseBody create$default(ResponseBody$Companion, BufferedSource, MediaType, long, int, Object)
- ResponseBody create(String, MediaType)
- ResponseBody create(byte[], MediaType)
- ResponseBody create(ByteString, MediaType)
- ResponseBody create(BufferedSource, MediaType, long)
- ResponseBody create(MediaType, String)
- ResponseBody create(MediaType, byte[])
- ResponseBody create(MediaType, ByteString)
- ResponseBody create(MediaType, long, BufferedSource)

### Class: io.tebex.plugin.libs.okhttp3.ResponseBody$Companion$asResponseBody$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.ResponseBody

Methods:
- long contentLength()
- BufferedSource source()
- MediaType contentType()

### Class: io.tebex.plugin.libs.okhttp3.Route
Type: Class

Methods:
- Proxy proxy()
- Address address()
- int hashCode()
- InetSocketAddress -deprecated_socketAddress()
- Address -deprecated_address()
- boolean equals(Object)
- Proxy -deprecated_proxy()
- String toString()
- boolean requiresTunnel()
- InetSocketAddress socketAddress()

### Class: io.tebex.plugin.libs.okhttp3.TlsVersion
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- TLS_1_3
- TLS_1_2
- TLS_1_1
- TLS_1_0
- SSL_3_0

Methods:
- String -deprecated_javaName()
- **static** TlsVersion valueOf(String)
- **static** TlsVersion[] values()
- **static** TlsVersion forJavaName(String)
- String javaName()

### Class: io.tebex.plugin.libs.okhttp3.TlsVersion$Companion
Type: Class

Methods:
- TlsVersion forJavaName(String)

### Class: io.tebex.plugin.libs.okhttp3.WebSocketListener
Type: Abstract Class

Methods:
- void onClosed(WebSocket, int, String)
- void onOpen(WebSocket, Response)
- void onFailure(WebSocket, Throwable, Response)
- void onMessage(WebSocket, String)
- void onMessage(WebSocket, ByteString)
- void onClosing(WebSocket, int, String)

## Package: io.tebex.plugin.libs.okhttp3.internal

### Class: io.tebex.plugin.libs.okhttp3.internal.SuppressSignatureCheck
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.HostnamesKt
Type: Class

Methods:
- **static** String toCanonicalHost(String)

### Class: io.tebex.plugin.libs.okhttp3.internal.Util
Type: Class

Methods:
- **static** boolean discard(Source, int, TimeUnit)
- **static** long toLongOrDefault(String, long)
- **static** boolean canParseAsIpAddress(String)
- **static** boolean isCivilized(FileSystem, File)
- **static** int indexOfFirstNonAsciiWhitespace(String, int, int)
- **static** int checkDuration(String, long, TimeUnit)
- **static** String toHostHeader$default(HttpUrl, boolean, int, Object)
- **static** void assertThreadDoesntHoldLock(Object)
- **static** String peerName(Socket)
- **static** Map<TK, TV> toImmutableMap(Map<TK, +TV>)
- **static** int delimiterOffset$default(String, String, int, int, int, Object)
- **static** int delimiterOffset$default(String, char, int, int, int, Object)
- **static** I indexOf(String, String, Comparator<String>)
- **static** String toHostHeader(HttpUrl, boolean)
- **static** void writeMedium(BufferedSink, int) throws IOException
- **static** Throwable withSuppressed(Exception, List<Exception>)
- **static** List<TT> immutableListOf([T)
- **static** String format(String, Object[])
- **static** String[] concat(String[], String)
- **static** int delimiterOffset(String, String, int, int)
- **static** int delimiterOffset(String, char, int, int)
- **static** int indexOfFirstNonAsciiWhitespace$default(String, int, int, int, Object)
- **static** void assertThreadHoldsLock(Object)
- **static** Z hasIntersection(String, String, Comparator<String>)
- **static** int readMedium(BufferedSource) throws IOException
- **static** String trimSubstring$default(String, int, int, int, Object)
- **static** long headersContentLength(Response)
- **static** int indexOfLastNonAsciiWhitespace(String, int, int)
- **static** void closeQuietly(Closeable)
- **static** void closeQuietly(Socket)
- **static** void closeQuietly(ServerSocket)
- **static** TT readFieldOrNull(Object, Class<TT>, String)
- **static** void checkOffsetAndCount(long, long, long)
- **static** EventListener$Factory asFactory(EventListener)
- **static** void wait(Object)
- **static** ThreadFactory threadFactory(String, boolean)
- **static** void notifyAll(Object)
- **static** void notify(Object)
- **static** boolean isHealthy(Socket, BufferedSource)
- **static** Headers toHeaders(List<Header>)
- **static** String trimSubstring(String, int, int)
- **static** int and(byte, int)
- **static** int and(short, int)
- **static** long and(int, long)
- **static** boolean canReuseConnectionFor(HttpUrl, HttpUrl)
- **static** Charset readBomAsCharset(BufferedSource, Charset) throws IOException
- **static** List<TT> filterList(Iterable<+TT>, Function1<-TT, Boolean>)
- **static** boolean skipAll(Source, int, TimeUnit) throws IOException
- **static** int skipAll(Buffer, byte)
- **static** int indexOfLastNonAsciiWhitespace$default(String, int, int, int, Object)
- **static** String toHexString(long)
- **static** String toHexString(int)
- **static** String intersect(String, String, Comparator<String>)
- **static** boolean isSensitiveHeader(String)
- **static** int toNonNegativeInt(String, int)
- **static** V threadName(String, Function0<Unit>)
- **static** List<Header> toHeaderList(Headers)
- **static** int parseHexDigit(char)
- **static** int indexOfNonWhitespace$default(String, int, int, Object)
- **static** int indexOfNonWhitespace(String, int)
- **static** List<TT> toImmutableList(List<+TT>)
- **static** int indexOfControlOrNonAscii(String)
- **static** V addIfAbsent(List<TE>, T)
- **static** V ignoreIoExceptions(Function0<Unit>)

## Package: io.tebex.plugin.libs.okhttp3.internal.authenticator

### Class: io.tebex.plugin.libs.okhttp3.internal.authenticator.JavaNetAuthenticator
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Authenticator

Methods:
- Request authenticate(Route, Response) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.authenticator.JavaNetAuthenticator$WhenMappings
Type: Class

No public methods found

## Package: io.tebex.plugin.libs.okhttp3.internal.cache

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.CacheRequest
Type: Interface

Methods:
- void abort()
- Sink body() throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.CacheInterceptor
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Interceptor

Methods:
- Response intercept(Interceptor$Chain) throws IOException
- Cache getCache$okhttp()

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.CacheInterceptor$Companion
Type: Class

Methods:
- **static** Headers access$combine(CacheInterceptor$Companion, Headers, Headers)
- **static** Response access$stripBody(CacheInterceptor$Companion, Response)

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
Type: Class
Implements: io.tebex.plugin.libs.okio.Source

Methods:
- long read(Buffer, long) throws IOException
- void close() throws IOException
- Timeout timeout()

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.CacheStrategy
Type: Class

Methods:
- Request getNetworkRequest()
- Response getCacheResponse()

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.CacheStrategy$Companion
Type: Class

Methods:
- boolean isCacheable(Response, Request)

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.CacheStrategy$Factory
Type: Class

Methods:
- CacheStrategy compute()
- Request getRequest$okhttp()

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.DiskLruCache
Type: Class
Implements: java.io.Closeable, java.io.Flushable

Methods:
- void delete() throws IOException
- void setMaxSize(long)
- boolean remove(String) throws IOException
- void evictAll() throws IOException
- long getMaxSize()
- void flush() throws IOException
- void setClosed$okhttp(boolean)
- DiskLruCache$Snapshot get(String) throws IOException
- void completeEdit$okhttp(DiskLruCache$Editor, boolean) throws IOException
- int getValueCount$okhttp()
- FileSystem getFileSystem$okhttp()
- void close() throws IOException
- boolean getClosed$okhttp()
- boolean removeEntry$okhttp(DiskLruCache$Entry) throws IOException
- **static** void access$setJournalWriter$p(DiskLruCache, BufferedSink)
- **static** boolean access$journalRebuildRequired(DiskLruCache)
- void trimToSize() throws IOException
- DiskLruCache$Editor edit(String, long) throws IOException
- DiskLruCache$Editor edit(String) throws IOException
- **static** void access$setHasJournalErrors$p(DiskLruCache, boolean)
- **static** DiskLruCache$Editor edit$default(DiskLruCache, String, long, int, Object) throws IOException
- **static** void access$setMostRecentTrimFailed$p(DiskLruCache, boolean)
- Iterator<DiskLruCache$Snapshot> snapshots() throws IOException
- **static** void access$setRedundantOpCount$p(DiskLruCache, int)
- boolean isClosed()
- long size() throws IOException
- **static** void access$setMostRecentRebuildFailed$p(DiskLruCache, boolean)
- **static** boolean access$getCivilizedFileSystem$p(DiskLruCache)
- void rebuildJournal$okhttp() throws IOException
- File getDirectory()
- void initialize() throws IOException
- LinkedHashMap<String, DiskLruCache$Entry> getLruEntries$okhttp()
- **static** boolean access$getInitialized$p(DiskLruCache)

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.DiskLruCache$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.DiskLruCache$Editor
Type: Class

Methods:
- Source newSource(int)
- void abort() throws IOException
- DiskLruCache$Entry getEntry$okhttp()
- void commit() throws IOException
- Sink newSink(int)
- boolean[] getWritten$okhttp()
- void detach$okhttp()

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.DiskLruCache$Entry
Type: Class

Methods:
- long getSequenceNumber$okhttp()
- void setReadable$okhttp(boolean)
- DiskLruCache$Snapshot snapshot$okhttp()
- List<File> getDirtyFiles$okhttp()
- void writeLengths$okhttp(BufferedSink) throws IOException
- void setSequenceNumber$okhttp(long)
- boolean getZombie$okhttp()
- void setLockingSourceCount$okhttp(int)
- DiskLruCache$Editor getCurrentEditor$okhttp()
- void setZombie$okhttp(boolean)
- V setLengths$okhttp(List<String>) throws IOException
- void setCurrentEditor$okhttp(DiskLruCache$Editor)
- boolean getReadable$okhttp()
- List<File> getCleanFiles$okhttp()
- int getLockingSourceCount$okhttp()
- long[] getLengths$okhttp()
- String getKey$okhttp()

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
Type: Class
Extends: io.tebex.plugin.libs.okio.ForwardingSource

Methods:
- void close()

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.DiskLruCache$Snapshot
Type: Class
Implements: java.io.Closeable

Methods:
- DiskLruCache$Editor edit() throws IOException
- Source getSource(int)
- long getLength(int)
- void close()
- String key()

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.DiskLruCache$cleanupTask$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.DiskLruCache$snapshots$1
Type: Class
Implements: java.util.Iterator, io.tebex.plugin.libs.kotlin.jvm.internal.markers.KMutableIterator

Methods:
- DiskLruCache$Snapshot next()
- Object next()
- boolean hasNext()
- void remove()

### Class: io.tebex.plugin.libs.okhttp3.internal.cache.FaultHidingSink
Type: Class
Extends: io.tebex.plugin.libs.okio.ForwardingSink

Methods:
- void flush()
- Function1<IOException, Unit> getOnException()
- void close()
- void write(Buffer, long)

## Package: io.tebex.plugin.libs.okhttp3.internal.concurrent

### Class: io.tebex.plugin.libs.okhttp3.internal.concurrent.TaskRunner$Backend
Type: Interface

Methods:
- long nanoTime()
- void coordinatorNotify(TaskRunner)
- void beforeTask(TaskRunner)
- void execute(Runnable)
- void coordinatorWait(TaskRunner, long)

### Class: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task
Type: Abstract Class

Methods:
- long getNextExecuteNanoTime$okhttp()
- boolean getCancelable()
- String getName()
- void initQueue$okhttp(TaskQueue)
- TaskQueue getQueue$okhttp()
- void setQueue$okhttp(TaskQueue)
- String toString()
- long runOnce()
- void setNextExecuteNanoTime$okhttp(long)

### Class: io.tebex.plugin.libs.okhttp3.internal.concurrent.TaskLoggerKt
Type: Class

Methods:
- **static** V taskLog(Task, TaskQueue, Function0<String>)
- **static** String formatDuration(long)
- **static** void access$log(Task, TaskQueue, String)
- **static** TT logElapsed(Task, TaskQueue, Function0<+TT>)

### Class: io.tebex.plugin.libs.okhttp3.internal.concurrent.TaskQueue
Type: Class

Methods:
- void cancelAll()
- void setCancelActiveTask$okhttp(boolean)
- **static** void execute$default(TaskQueue, String, long, boolean, Function0, int, Object)
- **static** void schedule$default(TaskQueue, Task, long, int, Object)
- **static** void schedule$default(TaskQueue, String, long, Function0, int, Object)
- TaskRunner getTaskRunner$okhttp()
- boolean cancelAllAndDecide$okhttp()
- boolean scheduleAndDecide$okhttp(Task, long, boolean)
- V execute(String, long, boolean, Function0<Unit>)
- CountDownLatch idleLatch()
- String getName$okhttp()
- List<Task> getScheduledTasks()
- void schedule(Task, long)
- V schedule(String, long, Function0<Long>)
- void setShutdown$okhttp(boolean)
- void setActiveTask$okhttp(Task)
- Task getActiveTask$okhttp()
- List<Task> getFutureTasks$okhttp()
- boolean getShutdown$okhttp()
- String toString()
- boolean getCancelActiveTask$okhttp()
- void shutdown()

### Class: io.tebex.plugin.libs.okhttp3.internal.concurrent.TaskQueue$execute$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.concurrent.TaskQueue$schedule$2
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.concurrent.TaskRunner
Type: Class

Methods:
- void cancelAll()
- void kickCoordinator$okhttp(TaskQueue)
- TaskQueue newQueue()
- TaskRunner$Backend getBackend()
- **static** Logger access$getLogger$cp()
- Task awaitTaskToRun()
- List<TaskQueue> activeQueues()
- **static** void access$runTask(TaskRunner, Task)

### Class: io.tebex.plugin.libs.okhttp3.internal.concurrent.TaskRunner$Companion
Type: Class

Methods:
- Logger getLogger()

### Class: io.tebex.plugin.libs.okhttp3.internal.concurrent.TaskRunner$RealBackend
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.concurrent.TaskRunner$Backend

Methods:
- long nanoTime()
- void coordinatorNotify(TaskRunner)
- void beforeTask(TaskRunner)
- void execute(Runnable)
- void shutdown()
- void coordinatorWait(TaskRunner, long) throws InterruptedException

### Class: io.tebex.plugin.libs.okhttp3.internal.concurrent.TaskRunner$runnable$1
Type: Class
Implements: java.lang.Runnable

Methods:
- void run()

## Package: io.tebex.plugin.libs.okhttp3.internal.connection

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.ConnectInterceptor
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Interceptor

Methods:
- Response intercept(Interceptor$Chain) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.ConnectionSpecSelector
Type: Class

Methods:
- boolean connectionFailed(IOException)
- ConnectionSpec configureSecureSocket(SSLSocket) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.Exchange
Type: Class

Methods:
- void cancel()
- Response$Builder readResponseHeaders(boolean) throws IOException
- void webSocketUpgradeFailed()
- EventListener getEventListener$okhttp()
- ExchangeFinder getFinder$okhttp()
- TE bodyComplete(long, boolean, boolean, T)
- void finishRequest() throws IOException
- boolean isDuplex$okhttp()
- void responseHeadersEnd(Response)
- void noNewExchangesOnConnection()
- RealCall getCall$okhttp()
- boolean isCoalescedConnection$okhttp()
- boolean getHasFailure$okhttp()
- void detachWithViolence()
- Headers trailers() throws IOException
- void noRequestBody()
- RealWebSocket$Streams newWebSocketStreams() throws SocketException
- Sink createRequestBody(Request, boolean) throws IOException
- void flushRequest() throws IOException
- ResponseBody openResponseBody(Response) throws IOException
- void responseHeadersStart()
- void writeRequestHeaders(Request) throws IOException
- RealConnection getConnection$okhttp()

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.Exchange$ResponseBodySource
Type: Class
Extends: io.tebex.plugin.libs.okio.ForwardingSource

Methods:
- long read(Buffer, long) throws IOException
- TE complete(T)
- void close() throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.ExchangeFinder
Type: Class

Methods:
- Address getAddress$okhttp()
- boolean sameHostAndPort(HttpUrl)
- ExchangeCodec find(OkHttpClient, RealInterceptorChain)
- void trackFailure(IOException)
- boolean retryAfterFailure()

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RealCall
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Call

Methods:
- void cancel()
- Request request()
- boolean isCanceled()
- void exitNetworkInterceptorExchange$okhttp(boolean)
- Exchange getInterceptorScopedExchange$okhttp()
- void setConnectionToCancel(RealConnection)
- Response getResponseWithInterceptorChain$okhttp() throws IOException
- IOException noMoreExchanges$okhttp(IOException)
- AsyncTimeout timeout()
- Timeout timeout()
- RealConnection getConnection()
- boolean getForWebSocket()
- Request getOriginalRequest()
- boolean retryAfterFailure()
- void acquireConnectionNoEvents(RealConnection)
- **static** RealCall$timeout$1 access$getTimeout$p(RealCall)
- boolean isExecuted()
- EventListener getEventListener$okhttp()
- **static** String access$toLoggableString(RealCall)
- void timeoutEarlyExit()
- OkHttpClient getClient()
- Response execute()
- Exchange initExchange$okhttp(RealInterceptorChain)
- void enqueue(Callback)
- Socket releaseConnectionNoEvents$okhttp()
- RealCall clone()
- Call clone()
- Object clone()
- RealConnection getConnectionToCancel()
- String redactedUrl$okhttp()
- TE messageDone$okhttp(Exchange, boolean, boolean, T)
- void enterNetworkInterceptorExchange(Request, boolean)

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RealCall$AsyncCall
Type: Class
Implements: java.lang.Runnable

Methods:
- void reuseCallsPerHostFrom(RealCall$AsyncCall)
- Request getRequest()
- AtomicInteger getCallsPerHost()
- RealCall getCall()
- void run()
- void executeOn(ExecutorService)
- String getHost()

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RealCall$CallReference
Type: Class
Extends: java.lang.ref.WeakReference

Methods:
- Object getCallStackTrace()

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RealCall$timeout$1
Type: Class
Extends: io.tebex.plugin.libs.okio.AsyncTimeout

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RealConnection
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$Listener
Implements: io.tebex.plugin.libs.okhttp3.Connection

Methods:
- void cancel()
- Handshake handshake()
- **static** Handshake access$getHandshake$p(RealConnection)
- void incrementSuccessCount$okhttp()
- ExchangeCodec newCodec$okhttp(OkHttpClient, RealInterceptorChain) throws SocketException
- boolean isHealthy(boolean)
- Protocol protocol()
- void noCoalescedConnections$okhttp()
- void setIdleAtNs$okhttp(long)
- RealWebSocket$Streams newWebSocketStreams$okhttp(Exchange) throws SocketException
- void setRouteFailureCount$okhttp(int)
- Z isEligible$okhttp(Address, List<Route>)
- RealConnectionPool getConnectionPool()
- void connect(int, int, int, int, boolean, Call, EventListener)
- long getIdleAtNs$okhttp()
- void trackFailure$okhttp(RealCall, IOException)
- void setNoNewExchanges(boolean)
- List<Reference<RealCall>> getCalls()
- void connectFailed$okhttp(OkHttpClient, Route, IOException)
- int getRouteFailureCount$okhttp()
- Route route()
- void noNewExchanges$okhttp()
- void onStream(Http2Stream) throws IOException
- boolean isMultiplexed$okhttp()
- String toString()
- boolean getNoNewExchanges()
- **static** void access$setSocket$p(RealConnection, Socket)
- Socket socket()
- void onSettings(Http2Connection, Settings)

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RealConnection$Companion
Type: Class

Methods:
- RealConnection newTestConnection(RealConnectionPool, Route, Socket, long)

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RealConnection$WhenMappings
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.ws.RealWebSocket$Streams

Methods:
- void close()

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RealConnectionPool
Type: Class

Methods:
- void evictAll()
- int connectionCount()
- int idleConnectionCount()
- long cleanup(long)
- boolean connectionBecameIdle(RealConnection)
- void put(RealConnection)
- Z callAcquirePooledConnection(Address, RealCall, List<Route>, boolean)

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RealConnectionPool$Companion
Type: Class

Methods:
- RealConnectionPool get(ConnectionPool)

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RouteDatabase
Type: Class

Methods:
- void connected(Route)
- void failed(Route)
- boolean shouldPostpone(Route)

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RouteException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- void addConnectException(IOException)
- IOException getFirstConnectException()
- IOException getLastConnectException()

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RouteSelector
Type: Class

Methods:
- RouteSelector$Selection next() throws IOException
- boolean hasNext()

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RouteSelector$Companion
Type: Class

Methods:
- String getSocketHost(InetSocketAddress)

### Class: io.tebex.plugin.libs.okhttp3.internal.connection.RouteSelector$Selection
Type: Class

Methods:
- Route next()
- List<Route> getRoutes()
- boolean hasNext()

## Package: io.tebex.plugin.libs.okhttp3.internal.http

### Class: io.tebex.plugin.libs.okhttp3.internal.http.ExchangeCodec
Type: Interface

Methods:
- void cancel()
- Response$Builder readResponseHeaders(boolean) throws IOException
- RealConnection getConnection()
- long reportedContentLength(Response) throws IOException
- Sink createRequestBody(Request, long) throws IOException
- void flushRequest() throws IOException
- void finishRequest() throws IOException
- Source openResponseBodySource(Response) throws IOException
- void writeRequestHeaders(Request) throws IOException
- Headers trailers() throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.http.BridgeInterceptor
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Interceptor

Methods:
- Response intercept(Interceptor$Chain) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.http.CallServerInterceptor
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Interceptor

Methods:
- Response intercept(Interceptor$Chain) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.http.DatesKt
Type: Class

Methods:
- **static** String toHttpDateString(Date)
- **static** Date toHttpDateOrNull(String)

### Class: io.tebex.plugin.libs.okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
Type: Class
Extends: java.lang.ThreadLocal

Methods:
- Object initialValue()

### Class: io.tebex.plugin.libs.okhttp3.internal.http.ExchangeCodec$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.http.HttpHeaders
Type: Class

Methods:
- **static** void receiveHeaders(CookieJar, HttpUrl, Headers)
- **static** boolean promisesBody(Response)
- **static** List<Challenge> parseChallenges(Headers, String)
- **static** boolean hasBody(Response)

### Class: io.tebex.plugin.libs.okhttp3.internal.http.HttpMethod
Type: Class

Methods:
- **static** boolean requiresRequestBody(String)
- **static** boolean permitsRequestBody(String)
- boolean redirectsToGet(String)
- boolean invalidatesCache(String)
- boolean redirectsWithBody(String)

### Class: io.tebex.plugin.libs.okhttp3.internal.http.RealInterceptorChain
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Interceptor$Chain

Methods:
- Request request()
- Response proceed(Request) throws IOException
- Interceptor$Chain withReadTimeout(int, TimeUnit)
- **static** RealInterceptorChain copy$okhttp$default(RealInterceptorChain, int, Exchange, Request, int, int, int, int, Object)
- int readTimeoutMillis()
- int getWriteTimeoutMillis$okhttp()
- RealCall getCall$okhttp()
- Call call()
- int getConnectTimeoutMillis$okhttp()
- Interceptor$Chain withConnectTimeout(int, TimeUnit)
- RealInterceptorChain copy$okhttp(int, Exchange, Request, int, int, int)
- Request getRequest$okhttp()
- Interceptor$Chain withWriteTimeout(int, TimeUnit)
- int connectTimeoutMillis()
- int getReadTimeoutMillis$okhttp()
- int writeTimeoutMillis()
- Connection connection()
- Exchange getExchange$okhttp()

### Class: io.tebex.plugin.libs.okhttp3.internal.http.RealResponseBody
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.ResponseBody

Methods:
- long contentLength()
- BufferedSource source()
- MediaType contentType()

### Class: io.tebex.plugin.libs.okhttp3.internal.http.RequestLine
Type: Class

Methods:
- String get(Request, Proxy$Type)
- String requestPath(HttpUrl)

### Class: io.tebex.plugin.libs.okhttp3.internal.http.RetryAndFollowUpInterceptor
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Interceptor

Methods:
- Response intercept(Interceptor$Chain) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.http.RetryAndFollowUpInterceptor$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.http.StatusLine
Type: Class

Methods:
- String toString()

### Class: io.tebex.plugin.libs.okhttp3.internal.http.StatusLine$Companion
Type: Class

Methods:
- StatusLine get(Response)
- StatusLine parse(String) throws IOException

## Package: io.tebex.plugin.libs.okhttp3.internal.http1

### Class: io.tebex.plugin.libs.okhttp3.internal.http1.HeadersReader
Type: Class

Methods:
- Headers readHeaders()
- BufferedSource getSource()
- String readLine()

### Class: io.tebex.plugin.libs.okhttp3.internal.http1.HeadersReader$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.http1.Http1ExchangeCodec
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.http.ExchangeCodec

Methods:
- Response$Builder readResponseHeaders(boolean)
- void cancel()
- **static** OkHttpClient access$getClient$p(Http1ExchangeCodec)
- **static** BufferedSource access$getSource$p(Http1ExchangeCodec)
- **static** void access$setState$p(Http1ExchangeCodec, int)
- void finishRequest()
- **static** int access$getState$p(Http1ExchangeCodec)
- **static** void access$setTrailers$p(Http1ExchangeCodec, Headers)
- Headers trailers()
- void skipConnectBody(Response)
- **static** void access$detachTimeout(Http1ExchangeCodec, ForwardingTimeout)
- RealConnection getConnection()
- long reportedContentLength(Response)
- boolean isClosed()
- Sink createRequestBody(Request, long)
- **static** BufferedSink access$getSink$p(Http1ExchangeCodec)
- void flushRequest()
- Source openResponseBodySource(Response)
- void writeRequest(Headers, String)
- **static** Headers access$getTrailers$p(Http1ExchangeCodec)
- void writeRequestHeaders(Request)
- **static** HeadersReader access$getHeadersReader$p(Http1ExchangeCodec)

### Class: io.tebex.plugin.libs.okhttp3.internal.http1.Http1ExchangeCodec$Companion
Type: Class

No public methods found

## Package: io.tebex.plugin.libs.okhttp3.internal.http2

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Reader$Handler
Type: Interface

Methods:
- V pushPromise(int, int, List<Header>) throws IOException
- void windowUpdate(int, long)
- void settings(boolean, Settings)
- V headers(boolean, int, int, List<Header>)
- void data(boolean, int, BufferedSource, int) throws IOException
- void ping(boolean, int, int)
- void goAway(int, ErrorCode, ByteString)
- void ackSettings()
- void alternateService(int, String, ByteString, String, int, long)
- void priority(int, int, int, boolean)
- void rstStream(int, ErrorCode)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.PushObserver
Type: Interface

Methods:
- boolean onData(int, BufferedSource, int, boolean) throws IOException
- Z onRequest(int, List<Header>)
- Z onHeaders(int, List<Header>, boolean)
- void onReset(int, ErrorCode)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.ConnectionShutdownException
Type: Class
Extends: java.io.IOException

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.ErrorCode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NO_ERROR
- PROTOCOL_ERROR
- INTERNAL_ERROR
- FLOW_CONTROL_ERROR
- SETTINGS_TIMEOUT
- STREAM_CLOSED
- FRAME_SIZE_ERROR
- REFUSED_STREAM
- CANCEL
- COMPRESSION_ERROR
- CONNECT_ERROR
- ENHANCE_YOUR_CALM
- INADEQUATE_SECURITY
- HTTP_1_1_REQUIRED

Methods:
- **static** ErrorCode valueOf(String)
- **static** ErrorCode[] values()
- int getHttpCode()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.ErrorCode$Companion
Type: Class

Methods:
- ErrorCode fromHttp2(int)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Header
Type: Class

Methods:
- ByteString component1()
- ByteString component2()
- int hashCode()
- **static** Header copy$default(Header, ByteString, ByteString, int, Object)
- boolean equals(Object)
- String toString()
- Header copy(ByteString, ByteString)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Header$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Hpack
Type: Class

Methods:
- Map<ByteString, Integer> getNAME_TO_FIRST_INDEX()
- ByteString checkLowercase(ByteString) throws IOException
- Header[] getSTATIC_HEADER_TABLE()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Hpack$Reader
Type: Class

Methods:
- int maxDynamicTableByteCount()
- void readHeaders() throws IOException
- ByteString readByteString() throws IOException
- List<Header> getAndResetHeaderList()
- int readInt(int, int) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Hpack$Writer
Type: Class

Methods:
- void writeByteString(ByteString) throws IOException
- void writeInt(int, int, int)
- V writeHeaders(List<Header>) throws IOException
- void resizeHeaderTable(int)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2
Type: Class

Methods:
- String frameLog(boolean, int, int, int, int)
- String formattedType$okhttp(int)
- String formatFlags(int, int)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection
Type: Class
Implements: java.io.Closeable

Methods:
- **static** void access$setDegradedPongsReceived$p(Http2Connection, long)
- **static** void start$default(Http2Connection, boolean, TaskRunner, int, Object) throws IOException
- **static** long access$getIntervalPongsReceived$p(Http2Connection)
- void writeData(int, boolean, Buffer, long) throws IOException
- void pushDataLater$okhttp(int, BufferedSource, int, boolean) throws IOException
- Settings getOkHttpSettings()
- **static** TaskQueue access$getSettingsListenerQueue$p(Http2Connection)
- void pushResetLater$okhttp(int, ErrorCode)
- Http2Connection$ReaderRunnable getReaderRunnable()
- Http2Stream getStream(int)
- String getConnectionName$okhttp()
- void writeWindowUpdateLater$okhttp(int, long)
- void writeSynReset$okhttp(int, ErrorCode) throws IOException
- long getReadBytesAcknowledged()
- long getReadBytesTotal()
- Http2Connection$Listener getListener$okhttp()
- **static** TaskRunner access$getTaskRunner$p(Http2Connection)
- Settings getPeerSettings()
- **static** void access$setIntervalPongsReceived$p(Http2Connection, long)
- void setSettings(Settings) throws IOException
- V pushHeadersLater$okhttp(int, List<Header>, boolean)
- V writeHeaders$okhttp(int, boolean, List<Header>) throws IOException
- Socket getSocket$okhttp()
- **static** void access$setAwaitPongsReceived$p(Http2Connection, long)
- boolean getClient$okhttp()
- **static** void access$setShutdown$p(Http2Connection, boolean)
- void writePingAndAwaitPong() throws InterruptedException
- boolean pushedStream$okhttp(int)
- void shutdown(ErrorCode) throws IOException
- Http2Stream newStream(List<Header>, boolean) throws IOException
- void sendDegradedPingLater$okhttp()
- Map<Integer, Http2Stream> getStreams$okhttp()
- V pushRequestLater$okhttp(int, List<Header>)
- **static** long access$getIntervalPingsSent$p(Http2Connection)
- **static** void access$failConnection(Http2Connection, IOException)
- int getNextStreamId$okhttp()
- **static** Settings access$getDEFAULT_SETTINGS$cp()
- long getWriteBytesMaximum()
- **static** long access$getDegradedPongsReceived$p(Http2Connection)
- **static** PushObserver access$getPushObserver$p(Http2Connection)
- **static** TaskQueue access$getWriterQueue$p(Http2Connection)
- boolean isHealthy(long)
- void updateConnectionFlowControl$okhttp(long)
- void flush() throws IOException
- int openStreamCount()
- void writeSynResetLater$okhttp(int, ErrorCode)
- void setPeerSettings(Settings)
- void writePing(boolean, int, int)
- void writePing() throws InterruptedException
- int getLastGoodStreamId$okhttp()
- **static** long access$getAwaitPongsReceived$p(Http2Connection)
- void close()
- void awaitPong() throws InterruptedException
- void start(boolean, TaskRunner) throws IOException
- void start(boolean) throws IOException
- void start() throws IOException
- void close$okhttp(ErrorCode, ErrorCode, IOException)
- Http2Stream pushStream(int, List<Header>, boolean) throws IOException
- **static** boolean access$isShutdown$p(Http2Connection)
- **static** void access$setWriteBytesMaximum$p(Http2Connection, long)
- **static** void access$setIntervalPingsSent$p(Http2Connection, long)
- void setNextStreamId$okhttp(int)
- long getWriteBytesTotal()
- Http2Writer getWriter()
- **static** Set access$getCurrentPushRequests$p(Http2Connection)
- void setLastGoodStreamId$okhttp(int)
- Http2Stream removeStream$okhttp(int)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$Builder
Type: Class

Methods:
- void setPingIntervalMillis$okhttp(int)
- **static** Http2Connection$Builder socket$default(Http2Connection$Builder, Socket, String, BufferedSource, BufferedSink, int, Object) throws IOException
- Http2Connection$Builder listener(Http2Connection$Listener)
- int getPingIntervalMillis$okhttp()
- void setSink$okhttp(BufferedSink)
- BufferedSink getSink$okhttp()
- TaskRunner getTaskRunner$okhttp()
- Http2Connection$Listener getListener$okhttp()
- void setSocket$okhttp(Socket)
- Socket getSocket$okhttp()
- void setClient$okhttp(boolean)
- void setPushObserver$okhttp(PushObserver)
- void setSource$okhttp(BufferedSource)
- boolean getClient$okhttp()
- Http2Connection build()
- void setConnectionName$okhttp(String)
- Http2Connection$Builder pingIntervalMillis(int)
- Http2Connection$Builder pushObserver(PushObserver)
- Http2Connection$Builder socket(Socket, String, BufferedSource, BufferedSink) throws IOException
- Http2Connection$Builder socket(Socket, String, BufferedSource) throws IOException
- Http2Connection$Builder socket(Socket, String) throws IOException
- Http2Connection$Builder socket(Socket) throws IOException
- void setListener$okhttp(Http2Connection$Listener)
- String getConnectionName$okhttp()
- BufferedSource getSource$okhttp()
- PushObserver getPushObserver$okhttp()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$Companion
Type: Class

Methods:
- Settings getDEFAULT_SETTINGS()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$Listener
Type: Abstract Class

Methods:
- void onStream(Http2Stream) throws IOException
- void onSettings(Http2Connection, Settings)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$Listener$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$Listener

Methods:
- void onStream(Http2Stream) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$ReaderRunnable
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Reader$Handler, io.tebex.plugin.libs.kotlin.jvm.functions.Function0

Methods:
- V pushPromise(int, int, List<Header>)
- void applyAndAckSettings(boolean, Settings)
- void windowUpdate(int, long)
- void settings(boolean, Settings)
- V headers(boolean, int, int, List<Header>)
- void data(boolean, int, BufferedSource, int) throws IOException
- Http2Reader getReader$okhttp()
- void ping(boolean, int, int)
- void goAway(int, ErrorCode, ByteString)
- void ackSettings()
- void invoke()
- Object invoke()
- void alternateService(int, String, ByteString, String, int, long)
- void priority(int, int, int, boolean)
- void rstStream(int, ErrorCode)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2ExchangeCodec
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.http.ExchangeCodec

Methods:
- void cancel()
- Response$Builder readResponseHeaders(boolean)
- RealConnection getConnection()
- long reportedContentLength(Response)
- **static** List access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp()
- Sink createRequestBody(Request, long)
- void flushRequest()
- void finishRequest()
- Source openResponseBodySource(Response)
- **static** List access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp()
- void writeRequestHeaders(Request)
- Headers trailers()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2ExchangeCodec$Companion
Type: Class

Methods:
- List<Header> http2HeadersList(Request)
- Response$Builder readHttp2HeadersList(Headers, Protocol)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Reader
Type: Class
Implements: java.io.Closeable

Methods:
- **static** Logger access$getLogger$cp()
- boolean nextFrame(boolean, Http2Reader$Handler) throws IOException
- void readConnectionPreface(Http2Reader$Handler) throws IOException
- void close() throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Reader$Companion
Type: Class

Methods:
- int lengthWithoutPadding(int, int, int) throws IOException
- Logger getLogger()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Reader$ContinuationSource
Type: Class
Implements: io.tebex.plugin.libs.okio.Source

Methods:
- void setPadding(int)
- void setLength(int)
- long read(Buffer, long) throws IOException
- void setLeft(int)
- int getPadding()
- int getStreamId()
- int getLength()
- int getFlags()
- void close() throws IOException
- Timeout timeout()
- void setFlags(int)
- int getLeft()
- void setStreamId(int)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Stream
Type: Class

Methods:
- Http2Stream$StreamTimeout getWriteTimeout$okhttp()
- Timeout writeTimeout()
- Http2Stream$StreamTimeout getReadTimeout$okhttp()
- Http2Stream$FramingSink getSink$okhttp()
- IOException getErrorException$okhttp()
- long getWriteBytesMaximum()
- int getId()
- void receiveRstStream(ErrorCode)
- Sink getSink()
- void setWriteBytesMaximum$okhttp(long)
- void waitForIo$okhttp() throws InterruptedIOException
- void enqueueTrailers(Headers)
- Http2Connection getConnection()
- void setReadBytesTotal$okhttp(long)
- void checkOutNotClosed$okhttp() throws IOException
- void close(ErrorCode, IOException) throws IOException
- boolean isLocallyInitiated()
- V writeHeaders(List<Header>, boolean, boolean) throws IOException
- ErrorCode getErrorCode$okhttp()
- void receiveHeaders(Headers, boolean)
- void cancelStreamIfNecessary$okhttp() throws IOException
- void setErrorException$okhttp(IOException)
- long getReadBytesAcknowledged()
- long getReadBytesTotal()
- Headers trailers() throws IOException
- boolean isOpen()
- long getWriteBytesTotal()
- void addBytesToWriteWindow(long)
- void receiveData(BufferedSource, int) throws IOException
- Source getSource()
- Timeout readTimeout()
- Headers takeHeaders() throws IOException
- void setWriteBytesTotal$okhttp(long)
- void closeLater(ErrorCode)
- Http2Stream$FramingSource getSource$okhttp()
- void setErrorCode$okhttp(ErrorCode)
- void setReadBytesAcknowledged$okhttp(long)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Stream$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Stream$FramingSink
Type: Class
Implements: io.tebex.plugin.libs.okio.Sink

Methods:
- void setTrailers(Headers)
- void flush() throws IOException
- boolean getFinished()
- void setClosed(boolean)
- void close() throws IOException
- void write(Buffer, long) throws IOException
- Timeout timeout()
- boolean getClosed()
- Headers getTrailers()
- void setFinished(boolean)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Stream$FramingSource
Type: Class
Implements: io.tebex.plugin.libs.okio.Source

Methods:
- long read(Buffer, long) throws IOException
- void setTrailers(Headers)
- void setClosed$okhttp(boolean)
- void receive$okhttp(BufferedSource, long) throws IOException
- Buffer getReceiveBuffer()
- boolean getFinished$okhttp()
- void setFinished$okhttp(boolean)
- Buffer getReadBuffer()
- void close() throws IOException
- Timeout timeout()
- boolean getClosed$okhttp()
- Headers getTrailers()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Stream$StreamTimeout
Type: Class
Extends: io.tebex.plugin.libs.okio.AsyncTimeout

Methods:
- void exitAndThrowIfTimedOut() throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Writer
Type: Class
Implements: java.io.Closeable

Methods:
- V pushPromise(int, int, List<Header>) throws IOException
- void applyAndAckSettings(Settings) throws IOException
- V headers(boolean, int, List<Header>) throws IOException
- void windowUpdate(int, long) throws IOException
- void settings(Settings) throws IOException
- int maxDataLength()
- void data(boolean, int, Buffer, int) throws IOException
- void ping(boolean, int, int) throws IOException
- void goAway(int, ErrorCode, byte[]) throws IOException
- void frameHeader(int, int, int, int) throws IOException
- void connectionPreface() throws IOException
- void flush() throws IOException
- void dataFrame(int, int, Buffer, int) throws IOException
- Hpack$Writer getHpackWriter()
- void close() throws IOException
- void rstStream(int, ErrorCode) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Http2Writer$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Huffman
Type: Class

Methods:
- int encodedLength(ByteString)
- void encode(ByteString, BufferedSink) throws IOException
- void decode(BufferedSource, long, BufferedSink)

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.PushObserver$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Settings
Type: Class

Methods:
- Settings set(int, int)
- boolean getEnablePush(boolean)
- int size()
- boolean isSet(int)
- int getInitialWindowSize()
- int getHeaderTableSize()
- void merge(Settings)
- int get(int)
- void clear()
- int getMaxHeaderListSize(int)
- int getMaxFrameSize(int)
- int getMaxConcurrentStreams()

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.Settings$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.http2.StreamResetException
Type: Class
Extends: java.io.IOException

No public methods found

## Package: io.tebex.plugin.libs.okhttp3.internal.io

### Class: io.tebex.plugin.libs.okhttp3.internal.io.FileSystem
Type: Interface

Methods:
- Sink appendingSink(File) throws FileNotFoundException
- void deleteContents(File) throws IOException
- long size(File)
- void rename(File, File) throws IOException
- Sink sink(File) throws FileNotFoundException
- boolean exists(File)
- Source source(File) throws FileNotFoundException
- void delete(File) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.io.FileSystem$Companion
Type: Class

No public methods found

## Package: io.tebex.plugin.libs.okhttp3.internal.platform

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.Android10Platform
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.platform.Platform

Methods:
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- boolean isCleartextTrafficPermitted(String)
- **static** boolean access$isSupported$cp()
- String getSelectedProtocol(SSLSocket)
- X509TrustManager trustManager(SSLSocketFactory)
- CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.Android10Platform$Companion
Type: Class

Methods:
- boolean isSupported()
- Platform buildIfSupported()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.AndroidPlatform
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.platform.Platform

Methods:
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- boolean isCleartextTrafficPermitted(String)
- **static** boolean access$isSupported$cp()
- void connectSocket(Socket, InetSocketAddress, int) throws IOException
- TrustRootIndex buildTrustRootIndex(X509TrustManager)
- String getSelectedProtocol(SSLSocket)
- X509TrustManager trustManager(SSLSocketFactory)
- CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager)
- void logCloseableLeak(String, Object)
- Object getStackTraceForCloseable(String)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.AndroidPlatform$Companion
Type: Class

Methods:
- boolean isSupported()
- Platform buildIfSupported()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.tls.TrustRootIndex

Methods:
- int hashCode()
- **static** AndroidPlatform$CustomTrustRootIndex copy$default(AndroidPlatform$CustomTrustRootIndex, X509TrustManager, Method, int, Object)
- boolean equals(Object)
- X509Certificate findByIssuerAndSignature(X509Certificate)
- String toString()
- AndroidPlatform$CustomTrustRootIndex copy(X509TrustManager, Method)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.BouncyCastlePlatform
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.platform.Platform

Methods:
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- **static** boolean access$isSupported$cp()
- String getSelectedProtocol(SSLSocket)
- SSLContext newSSLContext()
- X509TrustManager trustManager(SSLSocketFactory)
- X509TrustManager platformTrustManager()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.BouncyCastlePlatform$Companion
Type: Class

Methods:
- boolean isSupported()
- BouncyCastlePlatform buildIfSupported()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.ConscryptPlatform
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.platform.Platform

Methods:
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- SSLSocketFactory newSslSocketFactory(X509TrustManager)
- **static** boolean access$isSupported$cp()
- String getSelectedProtocol(SSLSocket)
- SSLContext newSSLContext()
- X509TrustManager trustManager(SSLSocketFactory)
- X509TrustManager platformTrustManager()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.ConscryptPlatform$Companion
Type: Class

Methods:
- boolean atLeastVersion(int, int, int)
- **static** boolean atLeastVersion$default(ConscryptPlatform$Companion, int, int, int, int, Object)
- boolean isSupported()
- ConscryptPlatform buildIfSupported()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.ConscryptPlatform$DisabledHostnameVerifier
Type: Class
Implements: org.conscrypt.ConscryptHostnameVerifier

Methods:
- boolean verify(String, SSLSession)
- boolean verify(X509Certificate[], String, SSLSession)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.Jdk8WithJettyBootPlatform
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.platform.Platform

Methods:
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- String getSelectedProtocol(SSLSocket)
- void afterHandshake(SSLSocket)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.Jdk8WithJettyBootPlatform$Companion
Type: Class

Methods:
- Platform buildIfSupported()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.Jdk9Platform
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.platform.Platform

Methods:
- **static** boolean access$isAvailable$cp()
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- String getSelectedProtocol(SSLSocket)
- X509TrustManager trustManager(SSLSocketFactory)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.Jdk9Platform$Companion
Type: Class

Methods:
- boolean isAvailable()
- Jdk9Platform buildIfSupported()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.OpenJSSEPlatform
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.platform.Platform

Methods:
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- **static** boolean access$isSupported$cp()
- String getSelectedProtocol(SSLSocket)
- SSLContext newSSLContext()
- X509TrustManager trustManager(SSLSocketFactory)
- X509TrustManager platformTrustManager()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.OpenJSSEPlatform$Companion
Type: Class

Methods:
- boolean isSupported()
- OpenJSSEPlatform buildIfSupported()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.Platform
Type: Class

Methods:
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- String getPrefix()
- void connectSocket(Socket, InetSocketAddress, int) throws IOException
- void log(String, int, Throwable)
- String getSelectedProtocol(SSLSocket)
- **static** Platform access$getPlatform$cp()
- void logCloseableLeak(String, Object)
- Object getStackTraceForCloseable(String)
- void afterHandshake(SSLSocket)
- boolean isCleartextTrafficPermitted(String)
- SSLSocketFactory newSslSocketFactory(X509TrustManager)
- TrustRootIndex buildTrustRootIndex(X509TrustManager)
- **static** Platform get()
- SSLContext newSSLContext()
- String toString()
- X509TrustManager trustManager(SSLSocketFactory)
- **static** void access$setPlatform$cp(Platform)
- **static** void log$default(Platform, String, int, Throwable, int, Object)
- CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager)
- X509TrustManager platformTrustManager()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.Platform$Companion
Type: Class

Methods:
- [B concatLengthPrefixed(List<Protocol>)
- **static** Platform access$findPlatform(Platform$Companion)
- **static** void resetForTests$default(Platform$Companion, Platform, int, Object)
- void resetForTests(Platform)
- Platform get()
- boolean isAndroid()
- List<String> alpnProtocolNames(List<Protocol>)

## Package: io.tebex.plugin.libs.okhttp3.internal.platform.android

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
Type: Interface

Methods:
- boolean matchesSocket(SSLSocket)
- SocketAdapter create(SSLSocket)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.SocketAdapter
Type: Interface

Methods:
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- boolean matchesSocket(SSLSocket)
- String getSelectedProtocol(SSLSocket)
- X509TrustManager trustManager(SSLSocketFactory)
- boolean isSupported()
- boolean matchesSocketFactory(SSLSocketFactory)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.Android10SocketAdapter
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.platform.android.SocketAdapter

Methods:
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- boolean matchesSocket(SSLSocket)
- String getSelectedProtocol(SSLSocket)
- X509TrustManager trustManager(SSLSocketFactory)
- boolean isSupported()
- boolean matchesSocketFactory(SSLSocketFactory)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.Android10SocketAdapter$Companion
Type: Class

Methods:
- boolean isSupported()
- SocketAdapter buildIfSupported()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.AndroidCertificateChainCleaner
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.tls.CertificateChainCleaner

Methods:
- int hashCode()
- boolean equals(Object)
- List<Certificate> clean(List<Certificate>, String) throws SSLPeerUnverifiedException

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion
Type: Class

Methods:
- AndroidCertificateChainCleaner buildIfSupported(X509TrustManager)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.AndroidLog
Type: Class

Methods:
- void enable()
- void androidLog$okhttp(String, int, String, Throwable)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.AndroidLogHandler
Type: Class
Extends: java.util.logging.Handler

Methods:
- void flush()
- void publish(LogRecord)
- void close()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.AndroidLogKt
Type: Class

Methods:
- **static** int access$getAndroidLevel(LogRecord)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.AndroidSocketAdapter
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.platform.android.SocketAdapter

Methods:
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- boolean matchesSocket(SSLSocket)
- String getSelectedProtocol(SSLSocket)
- X509TrustManager trustManager(SSLSocketFactory)
- boolean isSupported()
- boolean matchesSocketFactory(SSLSocketFactory)
- **static** DeferredSocketAdapter$Factory access$getPlayProviderFactory$cp()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.AndroidSocketAdapter$Companion
Type: Class

Methods:
- DeferredSocketAdapter$Factory factory(String)
- **static** AndroidSocketAdapter access$build(AndroidSocketAdapter$Companion, Class)
- DeferredSocketAdapter$Factory getPlayProviderFactory()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.platform.android.DeferredSocketAdapter$Factory

Methods:
- boolean matchesSocket(SSLSocket)
- SocketAdapter create(SSLSocket)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.BouncyCastleSocketAdapter
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.platform.android.SocketAdapter

Methods:
- **static** DeferredSocketAdapter$Factory access$getFactory$cp()
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- boolean matchesSocket(SSLSocket)
- String getSelectedProtocol(SSLSocket)
- X509TrustManager trustManager(SSLSocketFactory)
- boolean isSupported()
- boolean matchesSocketFactory(SSLSocketFactory)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion
Type: Class

Methods:
- DeferredSocketAdapter$Factory getFactory()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.platform.android.DeferredSocketAdapter$Factory

Methods:
- boolean matchesSocket(SSLSocket)
- SocketAdapter create(SSLSocket)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.CloseGuard
Type: Class

Methods:
- boolean warnIfOpen(Object)
- Object createAndOpen(String)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.CloseGuard$Companion
Type: Class

Methods:
- CloseGuard get()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.ConscryptSocketAdapter
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.platform.android.SocketAdapter

Methods:
- **static** DeferredSocketAdapter$Factory access$getFactory$cp()
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- boolean matchesSocket(SSLSocket)
- String getSelectedProtocol(SSLSocket)
- X509TrustManager trustManager(SSLSocketFactory)
- boolean isSupported()
- boolean matchesSocketFactory(SSLSocketFactory)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion
Type: Class

Methods:
- DeferredSocketAdapter$Factory getFactory()

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.platform.android.DeferredSocketAdapter$Factory

Methods:
- boolean matchesSocket(SSLSocket)
- SocketAdapter create(SSLSocket)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.DeferredSocketAdapter
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.platform.android.SocketAdapter

Methods:
- V configureTlsExtensions(SSLSocket, String, List<Protocol>)
- boolean matchesSocket(SSLSocket)
- String getSelectedProtocol(SSLSocket)
- X509TrustManager trustManager(SSLSocketFactory)
- boolean isSupported()
- boolean matchesSocketFactory(SSLSocketFactory)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.SocketAdapter$DefaultImpls
Type: Class

Methods:
- **static** X509TrustManager trustManager(SocketAdapter, SSLSocketFactory)
- **static** boolean matchesSocketFactory(SocketAdapter, SSLSocketFactory)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.StandardAndroidSocketAdapter
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.platform.android.AndroidSocketAdapter

Methods:
- X509TrustManager trustManager(SSLSocketFactory)
- boolean matchesSocketFactory(SSLSocketFactory)

### Class: io.tebex.plugin.libs.okhttp3.internal.platform.android.StandardAndroidSocketAdapter$Companion
Type: Class

Methods:
- **static** SocketAdapter buildIfSupported$default(StandardAndroidSocketAdapter$Companion, String, int, Object)
- SocketAdapter buildIfSupported(String)

## Package: io.tebex.plugin.libs.okhttp3.internal.proxy

### Class: io.tebex.plugin.libs.okhttp3.internal.proxy.NullProxySelector
Type: Class
Extends: java.net.ProxySelector

Methods:
- List<Proxy> select(URI)
- void connectFailed(URI, SocketAddress, IOException)

## Package: io.tebex.plugin.libs.okhttp3.internal.publicsuffix

### Class: io.tebex.plugin.libs.okhttp3.internal.publicsuffix.PublicSuffixDatabase
Type: Class

Methods:
- String getEffectiveTldPlusOne(String)
- **static** PublicSuffixDatabase access$getInstance$cp()
- void setListBytes(byte[], byte[])

### Class: io.tebex.plugin.libs.okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion
Type: Class

Methods:
- **static** String access$binarySearch(PublicSuffixDatabase$Companion, byte[], byte[][], int)
- PublicSuffixDatabase get()

## Package: io.tebex.plugin.libs.okhttp3.internal.tls

### Class: io.tebex.plugin.libs.okhttp3.internal.tls.TrustRootIndex
Type: Interface

Methods:
- X509Certificate findByIssuerAndSignature(X509Certificate)

### Class: io.tebex.plugin.libs.okhttp3.internal.tls.BasicCertificateChainCleaner
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.tls.CertificateChainCleaner

Methods:
- int hashCode()
- boolean equals(Object)
- List<Certificate> clean(List<Certificate>, String) throws SSLPeerUnverifiedException

### Class: io.tebex.plugin.libs.okhttp3.internal.tls.BasicCertificateChainCleaner$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.tls.BasicTrustRootIndex
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.internal.tls.TrustRootIndex

Methods:
- int hashCode()
- boolean equals(Object)
- X509Certificate findByIssuerAndSignature(X509Certificate)

### Class: io.tebex.plugin.libs.okhttp3.internal.tls.CertificateChainCleaner
Type: Abstract Class

Methods:
- List<Certificate> clean(List<Certificate>, String) throws SSLPeerUnverifiedException

### Class: io.tebex.plugin.libs.okhttp3.internal.tls.CertificateChainCleaner$Companion
Type: Class

Methods:
- CertificateChainCleaner get(X509TrustManager)
- CertificateChainCleaner get(X509Certificate[])

### Class: io.tebex.plugin.libs.okhttp3.internal.tls.OkHostnameVerifier
Type: Class
Implements: javax.net.ssl.HostnameVerifier

Methods:
- List<String> allSubjectAltNames(X509Certificate)
- boolean verify(String, SSLSession)
- boolean verify(String, X509Certificate)

## Package: io.tebex.plugin.libs.okhttp3.internal.ws

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.WebSocketReader$FrameCallback
Type: Interface

Methods:
- void onReadMessage(String) throws IOException
- void onReadMessage(ByteString) throws IOException
- void onReadPing(ByteString)
- void onReadClose(int, String)
- void onReadPong(ByteString)

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.MessageDeflater
Type: Class
Implements: java.io.Closeable

Methods:
- void deflate(Buffer) throws IOException
- void close() throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.MessageDeflaterKt
Type: Class

Methods:
- **static** ByteString access$getEMPTY_DEFLATE_BLOCK$p()

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.MessageInflater
Type: Class
Implements: java.io.Closeable

Methods:
- void inflate(Buffer) throws IOException
- void close() throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.RealWebSocket
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.WebSocket, io.tebex.plugin.libs.okhttp3.internal.ws.WebSocketReader$FrameCallback

Methods:
- void cancel()
- boolean processNextFrame() throws IOException
- Request request()
- **static** String access$getName$p(RealWebSocket)
- void onReadPing(ByteString)
- boolean pong(ByteString)
- void onReadPong(ByteString)
- **static** void access$setExtensions$p(RealWebSocket, WebSocketExtensions)
- void writePingFrame$okhttp()
- void onReadMessage(String) throws IOException
- void onReadMessage(ByteString) throws IOException
- int sentPingCount()
- void awaitTermination(long, TimeUnit) throws InterruptedException
- void failWebSocket(Exception, Response)
- boolean close(int, String)
- boolean close(int, String, long)
- void onReadClose(int, String)
- void connect(OkHttpClient)
- boolean writeOneFrame$okhttp() throws IOException
- void initReaderAndWriter(String, RealWebSocket$Streams) throws IOException
- long queueSize()
- int receivedPongCount()
- void loopReader() throws IOException
- WebSocketListener getListener$okhttp()
- void tearDown() throws InterruptedException
- **static** boolean access$isValid(RealWebSocket, WebSocketExtensions)
- void checkUpgradeSuccess$okhttp(Response, Exchange) throws IOException
- int receivedPingCount()
- **static** ArrayDeque access$getMessageAndCloseQueue$p(RealWebSocket)
- boolean send(String)
- boolean send(ByteString)

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.RealWebSocket$Close
Type: Class

Methods:
- long getCancelAfterCloseMillis()
- ByteString getReason()
- int getCode()

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.RealWebSocket$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.RealWebSocket$Message
Type: Class

Methods:
- int getFormatOpcode()
- ByteString getData()

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.RealWebSocket$Streams
Type: Abstract Class
Implements: java.io.Closeable

Methods:
- BufferedSource getSource()
- boolean getClient()
- BufferedSink getSink()

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.RealWebSocket$connect$1
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Callback

Methods:
- void onResponse(Call, Response)
- void onFailure(Call, IOException)

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
Type: Class
Extends: io.tebex.plugin.libs.okhttp3.internal.concurrent.Task

Methods:
- long runOnce()

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.WebSocketExtensions
Type: Class

Methods:
- boolean component1()
- Integer component2()
- boolean component3()
- Integer component4()
- int hashCode()
- **static** WebSocketExtensions copy$default(WebSocketExtensions, boolean, Integer, boolean, Integer, boolean, boolean, int, Object)
- boolean equals(Object)
- String toString()
- WebSocketExtensions copy(boolean, Integer, boolean, Integer, boolean, boolean)
- boolean noContextTakeover(boolean)
- boolean component5()
- boolean component6()

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.WebSocketExtensions$Companion
Type: Class

Methods:
- WebSocketExtensions parse(Headers) throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.WebSocketProtocol
Type: Class

Methods:
- String acceptHeader(String)
- void validateCloseCode(int)
- String closeCodeExceptionMessage(int)
- void toggleMask(Buffer$UnsafeCursor, byte[])

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.WebSocketReader
Type: Class
Implements: java.io.Closeable

Methods:
- void processNextFrame() throws IOException
- BufferedSource getSource()
- void close() throws IOException

### Class: io.tebex.plugin.libs.okhttp3.internal.ws.WebSocketWriter
Type: Class
Implements: java.io.Closeable

Methods:
- Random getRandom()
- void writeMessageFrame(int, ByteString) throws IOException
- void writePing(ByteString) throws IOException
- void writePong(ByteString) throws IOException
- BufferedSink getSink()
- void close()
- void writeClose(int, ByteString) throws IOException

## Package: io.tebex.plugin.libs.okio

### Class: io.tebex.plugin.libs.okio.BufferedSink
Type: Interface
Implements: io.tebex.plugin.libs.okio.Sink, java.nio.channels.WritableByteChannel

Methods:
- BufferedSink writeInt(int) throws IOException
- BufferedSink writeByte(int) throws IOException
- BufferedSink writeShortLe(int) throws IOException
- Buffer getBuffer()
- BufferedSink writeLongLe(long) throws IOException
- BufferedSink writeUtf8CodePoint(int) throws IOException
- BufferedSink writeHexadecimalUnsignedLong(long) throws IOException
- BufferedSink emitCompleteSegments() throws IOException
- BufferedSink writeDecimalLong(long) throws IOException
- BufferedSink writeLong(long) throws IOException
- long writeAll(Source) throws IOException
- void flush() throws IOException
- BufferedSink writeIntLe(int) throws IOException
- BufferedSink writeShort(int) throws IOException
- OutputStream outputStream()
- Buffer buffer()
- BufferedSink emit() throws IOException
- BufferedSink writeString(String, Charset) throws IOException
- BufferedSink writeString(String, int, int, Charset) throws IOException
- BufferedSink writeUtf8(String) throws IOException
- BufferedSink writeUtf8(String, int, int) throws IOException
- BufferedSink write(ByteString) throws IOException
- BufferedSink write(ByteString, int, int) throws IOException
- BufferedSink write(byte[]) throws IOException
- BufferedSink write(byte[], int, int) throws IOException
- BufferedSink write(Source, long) throws IOException

### Class: io.tebex.plugin.libs.okio.BufferedSource
Type: Interface
Implements: io.tebex.plugin.libs.okio.Source, java.nio.channels.ReadableByteChannel

Methods:
- boolean request(long) throws IOException
- int select(Options) throws IOException
- Buffer getBuffer()
- long readHexadecimalUnsignedLong() throws IOException
- boolean exhausted() throws IOException
- void skip(long) throws IOException
- long readAll(Sink) throws IOException
- String readUtf8LineStrict() throws IOException
- String readUtf8LineStrict(long) throws IOException
- ByteString readByteString() throws IOException
- ByteString readByteString(long) throws IOException
- void readFully(byte[]) throws IOException
- void readFully(Buffer, long) throws IOException
- long readDecimalLong() throws IOException
- Buffer buffer()
- int readInt() throws IOException
- long indexOf(byte) throws IOException
- long indexOf(byte, long) throws IOException
- long indexOf(byte, long, long) throws IOException
- long indexOf(ByteString) throws IOException
- long indexOf(ByteString, long) throws IOException
- int read(byte[]) throws IOException
- int read(byte[], int, int) throws IOException
- String readString(Charset) throws IOException
- String readString(long, Charset) throws IOException
- InputStream inputStream()
- int readUtf8CodePoint() throws IOException
- void require(long) throws IOException
- String readUtf8() throws IOException
- String readUtf8(long) throws IOException
- BufferedSource peek()
- long indexOfElement(ByteString) throws IOException
- long indexOfElement(ByteString, long) throws IOException
- boolean rangeEquals(long, ByteString) throws IOException
- boolean rangeEquals(long, ByteString, int, int) throws IOException
- byte[] readByteArray() throws IOException
- byte[] readByteArray(long) throws IOException
- long readLong() throws IOException
- short readShort() throws IOException
- String readUtf8Line() throws IOException
- int readIntLe() throws IOException
- short readShortLe() throws IOException
- byte readByte() throws IOException
- long readLongLe() throws IOException

### Class: io.tebex.plugin.libs.okio.Sink
Type: Interface
Implements: java.io.Closeable, java.io.Flushable

Methods:
- void flush() throws IOException
- void close() throws IOException
- void write(Buffer, long) throws IOException
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.Source
Type: Interface
Implements: java.io.Closeable

Methods:
- long read(Buffer, long) throws IOException
- void close() throws IOException
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.-Base64
Type: Class

Methods:
- **static** String encodeBase64(byte[], byte[])
- **static** void getBASE64$annotations()
- **static** String encodeBase64$default(byte[], byte[], int, Object)
- **static** byte[] getBASE64_URL_SAFE()
- **static** byte[] getBASE64()
- **static** byte[] decodeBase64ToArray(String)
- **static** void getBASE64_URL_SAFE$annotations()

### Class: io.tebex.plugin.libs.okio.-DeflaterSinkExtensions
Type: Class

Methods:
- **static** DeflaterSink deflate$default(Sink, Deflater, int, Object)
- **static** DeflaterSink deflate(Sink, Deflater)

### Class: io.tebex.plugin.libs.okio.-DeprecatedOkio
Type: Class

Methods:
- Sink appendingSink(File)
- Sink sink(File)
- Sink sink(OutputStream)
- Sink sink(Path, OpenOption[])
- Sink sink(Socket)
- Source source(File)
- Source source(InputStream)
- Source source(Path, OpenOption[])
- Source source(Socket)
- BufferedSink buffer(Sink)
- BufferedSource buffer(Source)
- Sink blackhole()

### Class: io.tebex.plugin.libs.okio.-DeprecatedUpgrade
Type: Class

Methods:
- **static** -DeprecatedUtf8 getUtf8()
- **static** -DeprecatedOkio getOkio()

### Class: io.tebex.plugin.libs.okio.-DeprecatedUtf8
Type: Class

Methods:
- long size(String)
- long size(String, int, int)

### Class: io.tebex.plugin.libs.okio.-GzipSinkExtensions
Type: Class

Methods:
- **static** GzipSink gzip(Sink)

### Class: io.tebex.plugin.libs.okio.-GzipSourceExtensions
Type: Class

Methods:
- **static** GzipSource gzip(Source)

### Class: io.tebex.plugin.libs.okio.-InflaterSourceExtensions
Type: Class

Methods:
- **static** InflaterSource inflate(Source, Inflater)
- **static** InflaterSource inflate$default(Source, Inflater, int, Object)

### Class: io.tebex.plugin.libs.okio.-SegmentedByteString
Type: Class

Methods:
- **static** void checkOffsetAndCount(long, long, long)
- **static** Buffer$UnsafeCursor resolveDefaultParameter(Buffer$UnsafeCursor)
- **static** int resolveDefaultParameter(ByteString, int)
- **static** int resolveDefaultParameter(byte[], int)
- **static** String toHexString(byte)
- **static** String toHexString(int)
- **static** String toHexString(long)
- **static** int leftRotate(int, int)
- **static** Buffer$UnsafeCursor getDEFAULT__new_UnsafeCursor()
- **static** boolean arrayRangeEquals(byte[], int, byte[], int, int)
- **static** void getDEFAULT__new_UnsafeCursor$annotations()
- **static** int and(byte, int)
- **static** long and(byte, long)
- **static** long and(int, long)
- **static** int shl(byte, int)
- **static** long minOf(long, int)
- **static** long minOf(int, long)
- **static** int getDEFAULT__ByteString_size()
- **static** byte xor(byte, byte)
- **static** long rightRotate(long, int)
- **static** int shr(byte, int)
- **static** short reverseBytes(short)
- **static** int reverseBytes(int)
- **static** long reverseBytes(long)

### Class: io.tebex.plugin.libs.okio.AsyncTimeout
Type: Class
Extends: io.tebex.plugin.libs.okio.Timeout

Methods:
- **static** void access$setTimeoutAt$p(AsyncTimeout, long)
- **static** long access$getIDLE_TIMEOUT_NANOS$cp()
- Sink sink(Sink)
- IOException access$newTimeoutException(IOException)
- TT withTimeout(Function0<+TT>)
- Source source(Source)
- **static** long access$remainingNanos(AsyncTimeout, long)
- boolean exit()
- **static** Condition access$getCondition$cp()
- **static** AsyncTimeout access$getNext$p(AsyncTimeout)
- **static** long access$getIDLE_TIMEOUT_MILLIS$cp()
- **static** void access$setHead$cp(AsyncTimeout)
- **static** void access$setInQueue$p(AsyncTimeout, boolean)
- void enter()
- **static** void access$setNext$p(AsyncTimeout, AsyncTimeout)
- **static** AsyncTimeout access$getHead$cp()
- **static** boolean access$getInQueue$p(AsyncTimeout)
- **static** ReentrantLock access$getLock$cp()

### Class: io.tebex.plugin.libs.okio.AsyncTimeout$Companion
Type: Class

Methods:
- Condition getCondition()
- ReentrantLock getLock()
- AsyncTimeout awaitTimeout$okio() throws InterruptedException
- **static** boolean access$cancelScheduledTimeout(AsyncTimeout$Companion, AsyncTimeout)
- **static** void access$scheduleTimeout(AsyncTimeout$Companion, AsyncTimeout, long, boolean)

### Class: io.tebex.plugin.libs.okio.AsyncTimeout$sink$1
Type: Class
Implements: io.tebex.plugin.libs.okio.Sink

Methods:
- void flush()
- String toString()
- void close()
- void write(Buffer, long)
- AsyncTimeout timeout()
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.AsyncTimeout$source$1
Type: Class
Implements: io.tebex.plugin.libs.okio.Source

Methods:
- long read(Buffer, long)
- String toString()
- void close()
- AsyncTimeout timeout()
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.Buffer
Type: Class
Implements: io.tebex.plugin.libs.okio.BufferedSource, io.tebex.plugin.libs.okio.BufferedSink, java.lang.Cloneable, java.nio.channels.ByteChannel

Methods:
- int select(Options)
- byte getByte(long)
- ByteString sha256()
- **static** Buffer copyTo$default(Buffer, OutputStream, long, long, int, Object) throws IOException
- **static** Buffer copyTo$default(Buffer, Buffer, long, long, int, Object)
- **static** Buffer copyTo$default(Buffer, Buffer, long, int, Object)
- byte -deprecated_getByte(long)
- long readHexadecimalUnsignedLong() throws EOFException
- boolean exhausted()
- long -deprecated_size()
- Buffer copyTo(OutputStream, long, long) throws IOException
- Buffer copyTo(Buffer, long, long)
- Buffer copyTo(Buffer, long)
- Buffer copyTo(OutputStream, long) throws IOException
- Buffer copyTo(OutputStream) throws IOException
- Buffer writeDecimalLong(long)
- BufferedSink writeDecimalLong(long)
- String readUtf8LineStrict() throws EOFException
- String readUtf8LineStrict(long) throws EOFException
- ByteString readByteString()
- ByteString readByteString(long) throws EOFException
- void readFully(Buffer, long) throws EOFException
- void readFully(byte[]) throws EOFException
- void setSize$okio(long)
- Buffer$UnsafeCursor readUnsafe(Buffer$UnsafeCursor)
- Buffer$UnsafeCursor readUnsafe()
- long readDecimalLong() throws EOFException
- Buffer buffer()
- int readInt() throws EOFException
- long indexOf(byte)
- long indexOf(byte, long)
- long indexOf(byte, long, long)
- long indexOf(ByteString) throws IOException
- long indexOf(ByteString, long) throws IOException
- Buffer write(ByteString)
- Buffer write(ByteString, int, int)
- Buffer write(byte[])
- Buffer write(byte[], int, int)
- int write(ByteBuffer) throws IOException
- Buffer write(Source, long) throws IOException
- void write(Buffer, long)
- BufferedSink write(ByteString)
- BufferedSink write(ByteString, int, int)
- BufferedSink write(byte[])
- BufferedSink write(byte[], int, int)
- BufferedSink write(Source, long)
- Buffer writeByte(int)
- BufferedSink writeByte(int)
- int read(byte[])
- int read(byte[], int, int)
- int read(ByteBuffer) throws IOException
- long read(Buffer, long)
- Buffer readFrom(InputStream) throws IOException
- Buffer readFrom(InputStream, long) throws IOException
- **static** Buffer$UnsafeCursor readUnsafe$default(Buffer, Buffer$UnsafeCursor, int, Object)
- Buffer writeLongLe(long)
- BufferedSink writeLongLe(long)
- InputStream inputStream()
- int readUtf8CodePoint() throws EOFException
- void require(long) throws EOFException
- **static** Buffer$UnsafeCursor readAndWriteUnsafe$default(Buffer, Buffer$UnsafeCursor, int, Object)
- ByteString hmacSha1(ByteString)
- ByteString sha1()
- long indexOfElement(ByteString)
- long indexOfElement(ByteString, long)
- Buffer writeTo(OutputStream, long) throws IOException
- Buffer writeTo(OutputStream) throws IOException
- ByteString hmacSha256(ByteString)
- long writeAll(Source) throws IOException
- boolean isOpen()
- long size()
- Buffer writeShort(int)
- BufferedSink writeShort(int)
- int readIntLe() throws EOFException
- short readShortLe() throws EOFException
- ByteString snapshot()
- ByteString snapshot(int)
- long readLongLe() throws EOFException
- boolean request(long)
- Segment writableSegment$okio(int)
- Buffer getBuffer()
- Buffer writeUtf8CodePoint(int)
- BufferedSink writeUtf8CodePoint(int)
- ByteString sha512()
- void skip(long) throws EOFException
- Timeout timeout()
- long readAll(Sink) throws IOException
- Buffer writeLong(long)
- BufferedSink writeLong(long)
- void flush()
- int hashCode()
- Buffer copy()
- OutputStream outputStream()
- void close()
- Buffer writeUtf8(String)
- Buffer writeUtf8(String, int, int)
- BufferedSink writeUtf8(String)
- BufferedSink writeUtf8(String, int, int)
- Buffer writeInt(int)
- BufferedSink writeInt(int)
- Buffer writeShortLe(int)
- BufferedSink writeShortLe(int)
- Buffer$UnsafeCursor readAndWriteUnsafe(Buffer$UnsafeCursor)
- Buffer$UnsafeCursor readAndWriteUnsafe()
- Buffer writeHexadecimalUnsignedLong(long)
- BufferedSink writeHexadecimalUnsignedLong(long)
- void clear()
- String readString(Charset)
- String readString(long, Charset) throws EOFException
- **static** Buffer writeTo$default(Buffer, OutputStream, long, int, Object) throws IOException
- String readUtf8()
- String readUtf8(long) throws EOFException
- ByteString hmacSha512(ByteString)
- Buffer emitCompleteSegments()
- BufferedSink emitCompleteSegments()
- BufferedSource peek()
- long completeSegmentByteCount()
- boolean rangeEquals(long, ByteString)
- boolean rangeEquals(long, ByteString, int, int)
- Buffer writeIntLe(int)
- BufferedSink writeIntLe(int)
- byte[] readByteArray()
- byte[] readByteArray(long) throws EOFException
- long readLong() throws EOFException
- short readShort() throws EOFException
- boolean equals(Object)
- Buffer clone()
- Object clone()
- String readUtf8Line() throws EOFException
- String toString()
- byte readByte() throws EOFException
- Buffer emit()
- BufferedSink emit()
- Buffer writeString(String, Charset)
- Buffer writeString(String, int, int, Charset)
- BufferedSink writeString(String, Charset)
- BufferedSink writeString(String, int, int, Charset)
- ByteString md5()

### Class: io.tebex.plugin.libs.okio.Buffer$UnsafeCursor
Type: Class
Implements: java.io.Closeable

Methods:
- long expandBuffer(int)
- int next()
- Segment getSegment$okio()
- void close()
- int seek(long)
- void setSegment$okio(Segment)
- long resizeBuffer(long)

### Class: io.tebex.plugin.libs.okio.Buffer$inputStream$1
Type: Class
Extends: java.io.InputStream

Methods:
- int read()
- int read(byte[], int, int)
- int available()
- String toString()
- void close()

### Class: io.tebex.plugin.libs.okio.Buffer$outputStream$1
Type: Class
Extends: java.io.OutputStream

Methods:
- void flush()
- String toString()
- void close()
- void write(int)
- void write(byte[], int, int)

### Class: io.tebex.plugin.libs.okio.ByteString
Type: Class
Implements: java.io.Serializable, java.lang.Comparable

Methods:
- ByteString digest$okio(String)
- **static** ByteString encodeUtf8(String)
- byte getByte(int)
- ByteString sha256()
- byte[] getData$okio()
- byte -deprecated_getByte(int)
- String base64()
- int -deprecated_size()
- int compareTo(ByteString)
- int compareTo(Object)
- ByteString toAsciiUppercase()
- **static** int indexOf$default(ByteString, ByteString, int, int, Object)
- **static** int indexOf$default(ByteString, byte[], int, int, Object)
- ByteString hmac$okio(String, ByteString)
- void setUtf8$okio(String)
- String hex()
- int indexOf(ByteString, int)
- int indexOf(byte[], int)
- int indexOf(ByteString)
- int indexOf(byte[])
- void write(OutputStream) throws IOException
- **static** ByteString read(InputStream, int) throws IOException
- void copyInto(int, byte[], int, int)
- byte internalGet$okio(int)
- byte[] internalArray$okio()
- String getUtf8$okio()
- ByteString hmacSha1(ByteString)
- ByteString sha1()
- **static** void copyInto$default(ByteString, int, byte[], int, int, int, Object)
- ByteString hmacSha256(ByteString)
- **static** ByteString encodeString(String, Charset)
- int size()
- boolean endsWith(ByteString)
- boolean endsWith(byte[])
- String string(Charset)
- String utf8()
- int getSize$okio()
- ByteString sha512()
- int getHashCode$okio()
- ByteBuffer asByteBuffer()
- ByteString substring(int, int)
- ByteString substring(int)
- ByteString substring()
- int hashCode()
- **static** ByteString of(byte[])
- **static** ByteString of(byte[], int, int)
- **static** ByteString of(ByteBuffer)
- **static** ByteString substring$default(ByteString, int, int, int, Object)
- **static** int lastIndexOf$default(ByteString, ByteString, int, int, Object)
- **static** int lastIndexOf$default(ByteString, byte[], int, int, Object)
- ByteString hmacSha512(ByteString)
- int lastIndexOf(ByteString, int)
- int lastIndexOf(byte[], int)
- int lastIndexOf(ByteString)
- int lastIndexOf(byte[])
- boolean rangeEquals(int, ByteString, int, int)
- boolean rangeEquals(int, byte[], int, int)
- void write$okio(Buffer, int, int)
- **static** ByteString decodeBase64(String)
- ByteString toAsciiLowercase()
- boolean equals(Object)
- byte[] toByteArray()
- **static** ByteString decodeHex(String)
- String toString()
- String base64Url()
- boolean startsWith(ByteString)
- boolean startsWith(byte[])
- ByteString md5()
- void setHashCode$okio(int)

### Class: io.tebex.plugin.libs.okio.ByteString$Companion
Type: Class

Methods:
- ByteString -deprecated_encodeUtf8(String)
- ByteString -deprecated_encodeString(String, Charset)
- ByteString encodeUtf8(String)
- ByteString read(InputStream, int) throws IOException
- ByteString -deprecated_decodeBase64(String)
- **static** ByteString of$default(ByteString$Companion, byte[], int, int, int, Object)
- ByteString -deprecated_of(ByteBuffer)
- ByteString -deprecated_of(byte[], int, int)
- ByteString -deprecated_decodeHex(String)
- ByteString decodeBase64(String)
- ByteString encodeString(String, Charset)
- **static** ByteString encodeString$default(ByteString$Companion, String, Charset, int, Object)
- ByteString of(byte[])
- ByteString of(byte[], int, int)
- ByteString of(ByteBuffer)
- ByteString decodeHex(String)
- ByteString -deprecated_read(InputStream, int)

### Class: io.tebex.plugin.libs.okio.CipherSink
Type: Class
Implements: io.tebex.plugin.libs.okio.Sink

Methods:
- Cipher getCipher()
- void flush()
- void close() throws IOException
- void write(Buffer, long) throws IOException
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.CipherSource
Type: Class
Implements: io.tebex.plugin.libs.okio.Source

Methods:
- Cipher getCipher()
- long read(Buffer, long) throws IOException
- void close() throws IOException
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.DeflaterSink
Type: Class
Implements: io.tebex.plugin.libs.okio.Sink

Methods:
- void finishDeflate$okio()
- void flush() throws IOException
- String toString()
- void close() throws IOException
- void write(Buffer, long) throws IOException
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.FileHandle
Type: Abstract Class
Implements: java.io.Closeable

Methods:
- Sink appendingSink() throws IOException
- int read(long, byte[], int, int) throws IOException
- long read(long, Buffer, long) throws IOException
- ReentrantLock getLock()
- **static** int access$getOpenStreamCount$p(FileHandle)
- Sink sink(long) throws IOException
- **static** Source source$default(FileHandle, long, int, Object) throws IOException
- **static** long access$readNoCloseCheck(FileHandle, long, Buffer, long)
- **static** boolean access$getClosed$p(FileHandle)
- **static** void access$writeNoCloseCheck(FileHandle, long, Buffer, long)
- Source source(long) throws IOException
- boolean getReadWrite()
- **static** Sink sink$default(FileHandle, long, int, Object) throws IOException
- void flush() throws IOException
- long size() throws IOException
- void resize(long) throws IOException
- void reposition(Source, long) throws IOException
- void reposition(Sink, long) throws IOException
- **static** void access$setOpenStreamCount$p(FileHandle, int)
- long position(Source) throws IOException
- long position(Sink) throws IOException
- void close() throws IOException
- void write(long, byte[], int, int)
- void write(long, Buffer, long) throws IOException

### Class: io.tebex.plugin.libs.okio.FileMetadata
Type: Class

Methods:
- Long getLastModifiedAtMillis()
- Long getLastAccessedAtMillis()
- Long getSize()
- Path getSymlinkTarget()
- **static** FileMetadata copy$default(FileMetadata, boolean, boolean, Path, Long, Long, Long, Long, Map, int, Object)
- TT extra(KClass<+TT>)
- boolean isRegularFile()
- String toString()
- FileMetadata copy(boolean, boolean, Path, Long, Long, Long, Long, Map<KClass<*>, Object>)
- Map<KClass<*>, Object> getExtras()
- Long getCreatedAtMillis()
- boolean isDirectory()

### Class: io.tebex.plugin.libs.okio.FileSystem
Type: Abstract Class

Methods:
- Sequence<Path> listRecursively(Path, boolean)
- Sequence<Path> listRecursively(Path)
- Sink appendingSink(Path, boolean) throws IOException
- Sink appendingSink(Path) throws IOException
- FileMetadata metadata(Path) throws IOException
- List<Path> listOrNull(Path)
- Source source(Path) throws IOException
- FileHandle openReadWrite(Path, boolean, boolean) throws IOException
- FileHandle openReadWrite(Path) throws IOException
- **static** Sequence listRecursively$default(FileSystem, Path, boolean, int, Object)
- **static** void delete$default(FileSystem, Path, boolean, int, Object) throws IOException
- void delete(Path, boolean) throws IOException
- void delete(Path) throws IOException
- FileHandle openReadOnly(Path) throws IOException
- **static** FileSystem get(FileSystem)
- void atomicMove(Path, Path) throws IOException
- **static** void createDirectories$default(FileSystem, Path, boolean, int, Object) throws IOException
- void createDirectory(Path, boolean) throws IOException
- void createDirectory(Path) throws IOException
- void copy(Path, Path) throws IOException
- **static** void createDirectory$default(FileSystem, Path, boolean, int, Object) throws IOException
- TT -write(Path, boolean, Function1<BufferedSink, +TT>) throws IOException
- Path canonicalize(Path) throws IOException
- void deleteRecursively(Path, boolean) throws IOException
- void deleteRecursively(Path) throws IOException
- void createDirectories(Path, boolean) throws IOException
- void createDirectories(Path) throws IOException
- **static** void deleteRecursively$default(FileSystem, Path, boolean, int, Object) throws IOException
- **static** FileHandle openReadWrite$default(FileSystem, Path, boolean, boolean, int, Object) throws IOException
- void createSymlink(Path, Path) throws IOException
- Sink sink(Path, boolean) throws IOException
- Sink sink(Path) throws IOException
- TT -read(Path, Function1<BufferedSource, +TT>) throws IOException
- List<Path> list(Path) throws IOException
- **static** Sink sink$default(FileSystem, Path, boolean, int, Object) throws IOException
- boolean exists(Path) throws IOException
- **static** Sink appendingSink$default(FileSystem, Path, boolean, int, Object) throws IOException
- **static** Object -write$default(FileSystem, Path, boolean, Function1, int, Object) throws IOException
- FileMetadata metadataOrNull(Path) throws IOException

### Class: io.tebex.plugin.libs.okio.FileSystem$Companion
Type: Class

Methods:
- FileSystem get(FileSystem)

### Class: io.tebex.plugin.libs.okio.ForwardingSink
Type: Abstract Class
Implements: io.tebex.plugin.libs.okio.Sink

Methods:
- Sink delegate()
- Sink -deprecated_delegate()
- void flush() throws IOException
- String toString()
- void close() throws IOException
- void write(Buffer, long) throws IOException
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.ForwardingSource
Type: Abstract Class
Implements: io.tebex.plugin.libs.okio.Source

Methods:
- Source delegate()
- Source -deprecated_delegate()
- long read(Buffer, long) throws IOException
- String toString()
- void close() throws IOException
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.ForwardingTimeout
Type: Class
Extends: io.tebex.plugin.libs.okio.Timeout

Methods:
- Timeout delegate()
- Timeout clearDeadline()
- void throwIfReached() throws IOException
- Timeout clearTimeout()
- long timeoutNanos()
- long deadlineNanoTime()
- Timeout deadlineNanoTime(long)
- boolean hasDeadline()
- Timeout timeout(long, TimeUnit)
- void setDelegate(Timeout)
- ForwardingTimeout setDelegate(Timeout)

### Class: io.tebex.plugin.libs.okio.GzipSource
Type: Class
Implements: io.tebex.plugin.libs.okio.Source

Methods:
- long read(Buffer, long) throws IOException
- void close() throws IOException
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.HashingSink
Type: Class
Extends: io.tebex.plugin.libs.okio.ForwardingSink
Implements: io.tebex.plugin.libs.okio.Sink

Methods:
- **static** HashingSink sha1(Sink)
- **static** HashingSink hmacSha256(Sink, ByteString)
- **static** HashingSink sha256(Sink)
- ByteString -deprecated_hash()
- **static** HashingSink sha512(Sink)
- **static** HashingSink hmacSha512(Sink, ByteString)
- **static** HashingSink hmacSha1(Sink, ByteString)
- void write(Buffer, long) throws IOException
- ByteString hash()
- **static** HashingSink md5(Sink)

### Class: io.tebex.plugin.libs.okio.HashingSink$Companion
Type: Class

Methods:
- HashingSink sha1(Sink)
- HashingSink hmacSha256(Sink, ByteString)
- HashingSink sha256(Sink)
- HashingSink sha512(Sink)
- HashingSink hmacSha512(Sink, ByteString)
- HashingSink hmacSha1(Sink, ByteString)
- HashingSink md5(Sink)

### Class: io.tebex.plugin.libs.okio.HashingSource
Type: Class
Extends: io.tebex.plugin.libs.okio.ForwardingSource
Implements: io.tebex.plugin.libs.okio.Source

Methods:
- **static** HashingSource sha1(Source)
- **static** HashingSource hmacSha256(Source, ByteString)
- long read(Buffer, long) throws IOException
- **static** HashingSource sha256(Source)
- ByteString -deprecated_hash()
- **static** HashingSource sha512(Source)
- **static** HashingSource hmacSha512(Source, ByteString)
- **static** HashingSource hmacSha1(Source, ByteString)
- ByteString hash()
- **static** HashingSource md5(Source)

### Class: io.tebex.plugin.libs.okio.HashingSource$Companion
Type: Class

Methods:
- HashingSource sha1(Source)
- HashingSource hmacSha256(Source, ByteString)
- HashingSource sha256(Source)
- HashingSource sha512(Source)
- HashingSource hmacSha512(Source, ByteString)
- HashingSource hmacSha1(Source, ByteString)
- HashingSource md5(Source)

### Class: io.tebex.plugin.libs.okio.InflaterSource
Type: Class
Implements: io.tebex.plugin.libs.okio.Source

Methods:
- boolean refill() throws IOException
- long read(Buffer, long) throws IOException
- long readOrInflate(Buffer, long) throws IOException
- void close() throws IOException
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.JvmFileHandle
Type: Class
Extends: io.tebex.plugin.libs.okio.FileHandle

No public methods found

### Class: io.tebex.plugin.libs.okio.JvmSystemFileSystem
Type: Class
Extends: io.tebex.plugin.libs.okio.FileSystem

Methods:
- Sink appendingSink(Path, boolean)
- void createSymlink(Path, Path)
- Sink sink(Path, boolean)
- List<Path> listOrNull(Path)
- Source source(Path)
- FileHandle openReadWrite(Path, boolean, boolean)
- List<Path> list(Path)
- void delete(Path, boolean)
- FileHandle openReadOnly(Path)
- void atomicMove(Path, Path)
- String toString()
- void createDirectory(Path, boolean)
- FileMetadata metadataOrNull(Path)
- Path canonicalize(Path)

### Class: io.tebex.plugin.libs.okio.NioFileSystemFileHandle
Type: Class
Extends: io.tebex.plugin.libs.okio.FileHandle

No public methods found

### Class: io.tebex.plugin.libs.okio.NioFileSystemWrappingFileSystem
Type: Class
Extends: io.tebex.plugin.libs.okio.NioSystemFileSystem

Methods:
- Sink appendingSink(Path, boolean)
- void createSymlink(Path, Path)
- Sink sink(Path, boolean)
- List<Path> listOrNull(Path)
- Source source(Path)
- FileHandle openReadWrite(Path, boolean, boolean)
- List<Path> list(Path)
- void delete(Path, boolean)
- FileHandle openReadOnly(Path)
- void atomicMove(Path, Path)
- String toString()
- void createDirectory(Path, boolean)
- FileMetadata metadataOrNull(Path)
- Path canonicalize(Path)

### Class: io.tebex.plugin.libs.okio.NioSystemFileSystem
Type: Class
Extends: io.tebex.plugin.libs.okio.JvmSystemFileSystem

Methods:
- void createSymlink(Path, Path)
- void atomicMove(Path, Path)
- String toString()
- FileMetadata metadataOrNull(Path)

### Class: io.tebex.plugin.libs.okio.Okio
Type: Class

Methods:
- **static** FileSystem openZip(FileSystem, Path) throws IOException
- **static** Sink appendingSink(File) throws FileNotFoundException
- **static** TR use(T, T)
- **static** Sink sink(OutputStream)
- **static** Sink sink(Socket) throws IOException
- **static** Sink sink(File, boolean) throws FileNotFoundException
- **static** Sink sink(Path, OpenOption[]) throws IOException
- **static** Sink sink(File) throws FileNotFoundException
- **static** CipherSource cipherSource(Source, Cipher)
- **static** HashingSource hashingSource(Source, Mac)
- **static** HashingSource hashingSource(Source, MessageDigest)
- **static** Source source(InputStream)
- **static** Source source(Socket) throws IOException
- **static** Source source(File) throws FileNotFoundException
- **static** Source source(Path, OpenOption[]) throws IOException
- **static** Sink blackhole()
- **static** HashingSink hashingSink(Sink, Mac)
- **static** HashingSink hashingSink(Sink, MessageDigest)
- **static** FileSystem asResourceFileSystem(ClassLoader)
- **static** Sink sink$default(File, boolean, int, Object) throws FileNotFoundException
- **static** boolean isAndroidGetsocknameError(AssertionError)
- **static** CipherSink cipherSink(Sink, Cipher)
- **static** BufferedSource buffer(Source)
- **static** BufferedSink buffer(Sink)

### Class: io.tebex.plugin.libs.okio.Options
Type: Class
Extends: io.tebex.plugin.libs.kotlin.collections.AbstractList
Implements: java.util.RandomAccess

Methods:
- int lastIndexOf(ByteString)
- int lastIndexOf(Object)
- boolean contains(ByteString)
- boolean contains(Object)
- int getSize()
- ByteString[] getByteStrings$okio()
- **static** Options of(ByteString[])
- ByteString get(int)
- Object get(int)
- int[] getTrie$okio()
- int indexOf(ByteString)
- int indexOf(Object)

### Class: io.tebex.plugin.libs.okio.Options$Companion
Type: Class

Methods:
- Options of(ByteString[])

### Class: io.tebex.plugin.libs.okio.Path
Type: Class
Implements: java.lang.Comparable

Methods:
- Path parent()
- **static** Path resolve$default(Path, String, boolean, int, Object)
- **static** Path resolve$default(Path, ByteString, boolean, int, Object)
- **static** Path resolve$default(Path, Path, boolean, int, Object)
- Path resolve(String)
- Path resolve(ByteString)
- Path resolve(Path)
- Path resolve(String, boolean)
- Path resolve(ByteString, boolean)
- Path resolve(Path, boolean)
- boolean isRoot()
- Path normalized()
- Path toNioPath()
- Path relativeTo(Path)
- int compareTo(Path)
- int compareTo(Object)
- ByteString getBytes$okio()
- List<ByteString> getSegmentsBytes()
- ByteString nameBytes()
- int hashCode()
- **static** Path get(String, boolean)
- **static** Path get(File, boolean)
- **static** Path get(Path, boolean)
- **static** Path get(String)
- **static** Path get(File)
- **static** Path get(Path)
- boolean equals(Object)
- File toFile()
- String name()
- Character volumeLetter()
- boolean isAbsolute()
- String toString()
- Path getRoot()
- boolean isRelative()
- List<String> getSegments()

### Class: io.tebex.plugin.libs.okio.Path$Companion
Type: Class

Methods:
- Path get(String, boolean)
- Path get(File, boolean)
- Path get(Path, boolean)
- Path get(String)
- Path get(File)
- Path get(Path)
- **static** Path get$default(Path$Companion, String, boolean, int, Object)
- **static** Path get$default(Path$Companion, File, boolean, int, Object)
- **static** Path get$default(Path$Companion, Path, boolean, int, Object)

### Class: io.tebex.plugin.libs.okio.PeekSource
Type: Class
Implements: io.tebex.plugin.libs.okio.Source

Methods:
- long read(Buffer, long)
- void close()
- Timeout timeout()

### Class: io.tebex.plugin.libs.okio.RealBufferedSink
Type: Class
Implements: io.tebex.plugin.libs.okio.BufferedSink

Methods:
- BufferedSink writeInt(int)
- BufferedSink writeByte(int)
- BufferedSink writeShortLe(int)
- Buffer getBuffer()
- BufferedSink writeLongLe(long)
- BufferedSink writeUtf8CodePoint(int)
- BufferedSink writeHexadecimalUnsignedLong(long)
- Timeout timeout()
- BufferedSink emitCompleteSegments()
- BufferedSink writeDecimalLong(long)
- BufferedSink writeLong(long)
- long writeAll(Source)
- **static** void getBuffer$annotations()
- boolean isOpen()
- void flush()
- BufferedSink writeIntLe(int)
- String toString()
- BufferedSink writeShort(int)
- OutputStream outputStream()
- Buffer buffer()
- BufferedSink emit()
- void close()
- BufferedSink writeString(String, Charset)
- BufferedSink writeString(String, int, int, Charset)
- BufferedSink writeUtf8(String)
- BufferedSink writeUtf8(String, int, int)
- void write(Buffer, long)
- BufferedSink write(ByteString)
- BufferedSink write(ByteString, int, int)
- BufferedSink write(byte[])
- BufferedSink write(byte[], int, int)
- int write(ByteBuffer)
- BufferedSink write(Source, long)

### Class: io.tebex.plugin.libs.okio.RealBufferedSink$outputStream$1
Type: Class
Extends: java.io.OutputStream

Methods:
- void flush()
- String toString()
- void close()
- void write(int)
- void write(byte[], int, int)

### Class: io.tebex.plugin.libs.okio.RealBufferedSource
Type: Class
Implements: io.tebex.plugin.libs.okio.BufferedSource

Methods:
- boolean request(long)
- int select(Options)
- Buffer getBuffer()
- long readHexadecimalUnsignedLong()
- boolean exhausted()
- void skip(long)
- Timeout timeout()
- long readAll(Sink)
- **static** void getBuffer$annotations()
- String readUtf8LineStrict()
- String readUtf8LineStrict(long)
- ByteString readByteString()
- ByteString readByteString(long)
- void readFully(byte[])
- void readFully(Buffer, long)
- long readDecimalLong()
- Buffer buffer()
- int readInt()
- void close()
- long indexOf(byte)
- long indexOf(byte, long)
- long indexOf(byte, long, long)
- long indexOf(ByteString)
- long indexOf(ByteString, long)
- long read(Buffer, long)
- int read(byte[])
- int read(byte[], int, int)
- int read(ByteBuffer)
- String readString(Charset)
- String readString(long, Charset)
- InputStream inputStream()
- int readUtf8CodePoint()
- void require(long)
- String readUtf8()
- String readUtf8(long)
- BufferedSource peek()
- long indexOfElement(ByteString)
- long indexOfElement(ByteString, long)
- boolean isOpen()
- boolean rangeEquals(long, ByteString)
- boolean rangeEquals(long, ByteString, int, int)
- long readLong()
- byte[] readByteArray()
- byte[] readByteArray(long)
- short readShort()
- String readUtf8Line()
- String toString()
- int readIntLe()
- short readShortLe()
- byte readByte()
- long readLongLe()

### Class: io.tebex.plugin.libs.okio.RealBufferedSource$inputStream$1
Type: Class
Extends: java.io.InputStream

Methods:
- int read()
- int read(byte[], int, int)
- int available()
- String toString()
- void close()

### Class: io.tebex.plugin.libs.okio.Segment
Type: Class

Methods:
- Segment pop()
- Segment unsharedCopy()
- void writeTo(Segment, int)
- Segment split(int)
- void compact()
- Segment sharedCopy()
- Segment push(Segment)

### Class: io.tebex.plugin.libs.okio.Segment$Companion
Type: Class

No public methods found

### Class: io.tebex.plugin.libs.okio.SegmentPool
Type: Class

Methods:
- **static** Segment take()
- **static** void recycle(Segment)
- int getMAX_SIZE()
- int getByteCount()

### Class: io.tebex.plugin.libs.okio.SegmentedByteString
Type: Class
Extends: io.tebex.plugin.libs.okio.ByteString

Methods:
- ByteString digest$okio(String)
- String string(Charset)
- int[] getDirectory$okio()
- void copyInto(int, byte[], int, int)
- byte internalGet$okio(int)
- int getSize$okio()
- String base64()
- byte[] internalArray$okio()
- ByteBuffer asByteBuffer()
- byte[][] getSegments$okio()
- ByteString substring(int, int)
- ByteString toAsciiUppercase()
- int lastIndexOf(byte[], int)
- boolean rangeEquals(int, ByteString, int, int)
- boolean rangeEquals(int, byte[], int, int)
- void write$okio(Buffer, int, int)
- ByteString toAsciiLowercase()
- int hashCode()
- boolean equals(Object)
- byte[] toByteArray()
- ByteString hmac$okio(String, ByteString)
- String toString()
- String hex()
- String base64Url()
- int indexOf(byte[], int)
- void write(OutputStream) throws IOException

### Class: io.tebex.plugin.libs.okio.Timeout
Type: Class

Methods:
- Timeout clearDeadline()
- void throwIfReached() throws IOException
- void waitUntilNotified(Object) throws InterruptedIOException
- Timeout clearTimeout()
- long timeoutNanos()
- TT intersectWith(Timeout, Function0<+TT>)
- long deadlineNanoTime()
- Timeout deadlineNanoTime(long)
- boolean hasDeadline()
- Timeout deadline(long, TimeUnit)
- Timeout timeout(long, TimeUnit)
- void awaitSignal(Condition) throws InterruptedIOException

### Class: io.tebex.plugin.libs.okio.Timeout$Companion
Type: Class

Methods:
- long minTimeout(long, long)

### Class: io.tebex.plugin.libs.okio.Timeout$Companion$NONE$1
Type: Class
Extends: io.tebex.plugin.libs.okio.Timeout

Methods:
- void throwIfReached()
- Timeout deadlineNanoTime(long)
- Timeout timeout(long, TimeUnit)

### Class: io.tebex.plugin.libs.okio.Utf8
Type: Class

Methods:
- **static** long size(String, int, int)
- **static** long size(String, int)
- **static** long size(String)
- **static** V processUtf8CodePoints([B, int, int, Function1<Integer, Unit>)
- **static** long size$default(String, int, int, int, Object)
- **static** I process3Utf8Bytes([B, int, int, Function1<Integer, Unit>)
- **static** V processUtf8Bytes(String, int, int, Function1<Byte, Unit>)
- **static** boolean isIsoControl(int)
- **static** V processUtf16Chars([B, int, int, Function1<Character, Unit>)
- **static** I process4Utf8Bytes([B, int, int, Function1<Integer, Unit>)
- **static** boolean isUtf8Continuation(byte)
- **static** I process2Utf8Bytes([B, int, int, Function1<Integer, Unit>)

### Class: io.tebex.plugin.libs.okio.ZipFileSystem
Type: Class
Extends: io.tebex.plugin.libs.okio.FileSystem

Methods:
- Sink appendingSink(Path, boolean)
- void createSymlink(Path, Path)
- Sink sink(Path, boolean)
- List<Path> listOrNull(Path)
- Source source(Path) throws IOException
- FileHandle openReadWrite(Path, boolean, boolean)
- **static** Path access$getROOT$cp()
- List<Path> list(Path)
- void delete(Path, boolean)
- FileHandle openReadOnly(Path)
- void atomicMove(Path, Path)
- void createDirectory(Path, boolean)
- FileMetadata metadataOrNull(Path)
- Path canonicalize(Path)

### Class: io.tebex.plugin.libs.okio._JvmPlatformKt
Type: Class

Methods:
- **static** String toUtf8String(byte[])
- **static** ReentrantLock newLock()
- **static** byte[] asUtf8ToByteArray(String)
- **static** TT withLock(ReentrantLock, Function0<+TT>)

## Package: io.tebex.plugin.libs.okio.internal

### Class: io.tebex.plugin.libs.okio.internal.-Buffer
Type: Class

Methods:
- **static** Buffer$UnsafeCursor commonReadUnsafe(Buffer, Buffer$UnsafeCursor)
- **static** Buffer commonWriteDecimalLong(Buffer, long)
- **static** boolean commonEquals(Buffer, Object)
- **static** Buffer commonWriteUtf8(Buffer, String, int, int)
- **static** int commonReadUtf8CodePoint(Buffer)
- **static** long commonIndexOf(Buffer, byte, long, long)
- **static** long commonIndexOf(Buffer, ByteString, long)
- **static** Buffer commonCopy(Buffer)
- **static** void commonSkip(Buffer, long)
- **static** Buffer commonWriteLong(Buffer, long)
- **static** ByteString commonReadByteString(Buffer)
- **static** ByteString commonReadByteString(Buffer, long)
- **static** int commonSeek(Buffer$UnsafeCursor, long)
- **static** void commonClear(Buffer)
- **static** byte commonGet(Buffer, long)
- **static** Buffer commonWriteByte(Buffer, int)
- **static** long commonReadAll(Buffer, Sink)
- **static** long commonExpandBuffer(Buffer$UnsafeCursor, int)
- **static** void getHEX_DIGIT_BYTES$annotations()
- **static** int commonHashCode(Buffer)
- **static** byte[] getHEX_DIGIT_BYTES()
- **static** Buffer commonWrite$default(Buffer, ByteString, int, int, int, Object)
- **static** Buffer commonWriteHexadecimalUnsignedLong(Buffer, long)
- **static** long commonCompleteSegmentByteCount(Buffer)
- **static** Segment commonWritableSegment(Buffer, int)
- **static** Buffer commonWriteInt(Buffer, int)
- **static** int commonRead(Buffer, byte[])
- **static** int commonRead(Buffer, byte[], int, int)
- **static** long commonRead(Buffer, Buffer, long)
- **static** long commonResizeBuffer(Buffer$UnsafeCursor, long)
- **static** byte commonReadByte(Buffer)
- **static** long commonReadLong(Buffer)
- **static** long commonReadHexadecimalUnsignedLong(Buffer)
- **static** long commonIndexOfElement(Buffer, ByteString, long)
- **static** int selectPrefix(Buffer, Options, boolean)
- **static** TT seek(Buffer, long, Function2<Segment, Long, +TT>)
- **static** String commonReadUtf8(Buffer, long)
- **static** short commonReadShort(Buffer)
- **static** int selectPrefix$default(Buffer, Options, boolean, int, Object)
- **static** String commonReadUtf8Line(Buffer)
- **static** long commonReadDecimalLong(Buffer)
- **static** Buffer commonWrite(Buffer, ByteString, int, int)
- **static** Buffer commonWrite(Buffer, byte[])
- **static** Buffer commonWrite(Buffer, byte[], int, int)
- **static** Buffer commonWrite(Buffer, Source, long)
- **static** void commonWrite(Buffer, Buffer, long)
- **static** Buffer commonWriteShort(Buffer, int)
- **static** Buffer commonCopyTo(Buffer, Buffer, long, long)
- **static** ByteString commonSnapshot(Buffer)
- **static** ByteString commonSnapshot(Buffer, int)
- **static** byte[] commonReadByteArray(Buffer)
- **static** byte[] commonReadByteArray(Buffer, long)
- **static** String commonReadUtf8LineStrict(Buffer, long)
- **static** int commonNext(Buffer$UnsafeCursor)
- **static** int commonReadInt(Buffer)
- **static** long commonWriteAll(Buffer, Source)
- **static** boolean rangeEquals(Segment, int, byte[], int, int)
- **static** void commonClose(Buffer$UnsafeCursor)
- **static** void commonReadFully(Buffer, byte[])
- **static** void commonReadFully(Buffer, Buffer, long)
- **static** String readUtf8Line(Buffer, long)
- **static** boolean commonRangeEquals(Buffer, long, ByteString, int, int)
- **static** Buffer commonWriteUtf8CodePoint(Buffer, int)
- **static** Buffer$UnsafeCursor commonReadAndWriteUnsafe(Buffer, Buffer$UnsafeCursor)
- **static** int commonSelect(Buffer, Options)

### Class: io.tebex.plugin.libs.okio.internal.-ByteString
Type: Class

Methods:
- **static** String commonHex(ByteString)
- **static** int access$codePointIndexToCharIndex(byte[], int)
- **static** void commonCopyInto(ByteString, int, byte[], int, int)
- **static** boolean commonEquals(ByteString, Object)
- **static** ByteString commonToAsciiLowercase(ByteString)
- **static** int access$decodeHexDigit(char)
- **static** String commonBase64Url(ByteString)
- **static** int commonGetSize(ByteString)
- **static** int commonIndexOf(ByteString, byte[], int)
- **static** byte[] commonToByteArray(ByteString)
- **static** int commonLastIndexOf(ByteString, ByteString, int)
- **static** int commonLastIndexOf(ByteString, byte[], int)
- **static** String commonBase64(ByteString)
- **static** ByteString commonSubstring(ByteString, int, int)
- **static** void commonWrite(ByteString, Buffer, int, int)
- **static** void getHEX_DIGIT_CHARS$annotations()
- **static** int commonHashCode(ByteString)
- **static** String commonUtf8(ByteString)
- **static** boolean commonStartsWith(ByteString, ByteString)
- **static** boolean commonStartsWith(ByteString, byte[])
- **static** byte commonGetByte(ByteString, int)
- **static** ByteString commonToAsciiUppercase(ByteString)
- **static** char[] getHEX_DIGIT_CHARS()
- **static** ByteString commonDecodeBase64(String)
- **static** byte[] commonInternalArray(ByteString)
- **static** boolean commonEndsWith(ByteString, ByteString)
- **static** boolean commonEndsWith(ByteString, byte[])
- **static** int commonCompareTo(ByteString, ByteString)
- **static** ByteString commonDecodeHex(String)
- **static** ByteString commonEncodeUtf8(String)
- **static** boolean commonRangeEquals(ByteString, int, ByteString, int, int)
- **static** boolean commonRangeEquals(ByteString, int, byte[], int, int)
- **static** ByteString commonToByteString(byte[], int, int)
- **static** ByteString commonOf(byte[])
- **static** String commonToString(ByteString)

### Class: io.tebex.plugin.libs.okio.internal.-FileSystem
Type: Class

Methods:
- **static** Object collectRecursively(SequenceScope<Path>, FileSystem, ArrayDeque<Path>, Path, boolean, boolean, Continuation<Unit>)
- **static** Sequence<Path> commonListRecursively(FileSystem, Path, boolean) throws IOException
- **static** void commonCopy(FileSystem, Path, Path) throws IOException
- **static** void commonCreateDirectories(FileSystem, Path, boolean) throws IOException
- **static** FileMetadata commonMetadata(FileSystem, Path) throws IOException
- **static** boolean commonExists(FileSystem, Path) throws IOException
- **static** void commonDeleteRecursively(FileSystem, Path, boolean) throws IOException
- **static** Path symlinkTarget(FileSystem, Path) throws IOException

### Class: io.tebex.plugin.libs.okio.internal.-Path
Type: Class

Methods:
- **static** String commonName(Path)
- **static** ByteString access$getSLASH$p()
- **static** boolean commonEquals(Path, Object)
- **static** List<ByteString> commonSegmentsBytes(Path)
- **static** List<String> commonSegments(Path)
- **static** ByteString access$toSlash(String)
- **static** ByteString access$getDOT_DOT$p()
- **static** Path commonNormalized(Path)
- **static** Path commonParent(Path)
- **static** int access$getIndexOfLastSlash(Path)
- **static** int access$rootLength(Path)
- **static** boolean commonIsRoot(Path)
- **static** boolean commonIsAbsolute(Path)
- **static** ByteString access$getDOT$p()
- **static** ByteString commonNameBytes(Path)
- **static** Path commonToPath(String, boolean)
- **static** int commonHashCode(Path)
- **static** Path commonResolve(Path, String, boolean)
- **static** Path commonResolve(Path, ByteString, boolean)
- **static** Path commonResolve(Path, Buffer, boolean)
- **static** Path commonResolve(Path, Path, boolean)
- **static** ByteString access$getBACKSLASH$p()
- **static** boolean commonIsRelative(Path)
- **static** ByteString access$getSlash(Path)
- **static** Path commonRelativeTo(Path, Path)
- **static** int commonCompareTo(Path, Path)
- **static** boolean access$lastSegmentIsDotDot(Path)
- **static** Path toPath(Buffer, boolean)
- **static** Path commonRoot(Path)
- **static** Character commonVolumeLetter(Path)
- **static** String commonToString(Path)

### Class: io.tebex.plugin.libs.okio.internal.-RealBufferedSink
Type: Class

Methods:
- **static** void commonWrite(RealBufferedSink, Buffer, long)
- **static** BufferedSink commonWrite(RealBufferedSink, ByteString)
- **static** BufferedSink commonWrite(RealBufferedSink, ByteString, int, int)
- **static** BufferedSink commonWrite(RealBufferedSink, byte[])
- **static** BufferedSink commonWrite(RealBufferedSink, byte[], int, int)
- **static** BufferedSink commonWrite(RealBufferedSink, Source, long)
- **static** BufferedSink commonWriteShort(RealBufferedSink, int)
- **static** BufferedSink commonWriteLongLe(RealBufferedSink, long)
- **static** BufferedSink commonWriteDecimalLong(RealBufferedSink, long)
- **static** BufferedSink commonWriteHexadecimalUnsignedLong(RealBufferedSink, long)
- **static** BufferedSink commonWriteIntLe(RealBufferedSink, int)
- **static** BufferedSink commonWriteUtf8(RealBufferedSink, String)
- **static** BufferedSink commonWriteUtf8(RealBufferedSink, String, int, int)
- **static** BufferedSink commonEmit(RealBufferedSink)
- **static** long commonWriteAll(RealBufferedSink, Source)
- **static** BufferedSink commonWriteShortLe(RealBufferedSink, int)
- **static** void commonClose(RealBufferedSink)
- **static** BufferedSink commonWriteLong(RealBufferedSink, long)
- **static** BufferedSink commonEmitCompleteSegments(RealBufferedSink)
- **static** BufferedSink commonWriteInt(RealBufferedSink, int)
- **static** BufferedSink commonWriteUtf8CodePoint(RealBufferedSink, int)
- **static** Timeout commonTimeout(RealBufferedSink)
- **static** void commonFlush(RealBufferedSink)
- **static** BufferedSink commonWriteByte(RealBufferedSink, int)
- **static** String commonToString(RealBufferedSink)

### Class: io.tebex.plugin.libs.okio.internal.-RealBufferedSource
Type: Class

Methods:
- **static** long commonReadLongLe(RealBufferedSource)
- **static** boolean commonExhausted(RealBufferedSource)
- **static** long commonReadLong(RealBufferedSource)
- **static** long commonReadHexadecimalUnsignedLong(RealBufferedSource)
- **static** long commonIndexOfElement(RealBufferedSource, ByteString, long)
- **static** short commonReadShortLe(RealBufferedSource)
- **static** int commonReadUtf8CodePoint(RealBufferedSource)
- **static** long commonIndexOf(RealBufferedSource, byte, long, long)
- **static** long commonIndexOf(RealBufferedSource, ByteString, long)
- **static** String commonReadUtf8(RealBufferedSource)
- **static** String commonReadUtf8(RealBufferedSource, long)
- **static** void commonSkip(RealBufferedSource, long)
- **static** short commonReadShort(RealBufferedSource)
- **static** ByteString commonReadByteString(RealBufferedSource)
- **static** ByteString commonReadByteString(RealBufferedSource, long)
- **static** String commonReadUtf8Line(RealBufferedSource)
- **static** Timeout commonTimeout(RealBufferedSource)
- **static** long commonReadDecimalLong(RealBufferedSource)
- **static** int commonReadIntLe(RealBufferedSource)
- **static** long commonReadAll(RealBufferedSource, Sink)
- **static** byte[] commonReadByteArray(RealBufferedSource)
- **static** byte[] commonReadByteArray(RealBufferedSource, long)
- **static** String commonReadUtf8LineStrict(RealBufferedSource, long)
- **static** boolean commonRequest(RealBufferedSource, long)
- **static** int commonReadInt(RealBufferedSource)
- **static** void commonClose(RealBufferedSource)
- **static** void commonRequire(RealBufferedSource, long)
- **static** void commonReadFully(RealBufferedSource, byte[])
- **static** void commonReadFully(RealBufferedSource, Buffer, long)
- **static** long commonRead(RealBufferedSource, Buffer, long)
- **static** int commonRead(RealBufferedSource, byte[], int, int)
- **static** boolean commonRangeEquals(RealBufferedSource, long, ByteString, int, int)
- **static** byte commonReadByte(RealBufferedSource)
- **static** BufferedSource commonPeek(RealBufferedSource)
- **static** String commonToString(RealBufferedSource)
- **static** int commonSelect(RealBufferedSource, Options)

### Class: io.tebex.plugin.libs.okio.internal.-SegmentedByteString
Type: Class

Methods:
- **static** void commonWrite(SegmentedByteString, Buffer, int, int)
- **static** byte[] commonToByteArray(SegmentedByteString)
- **static** void commonCopyInto(SegmentedByteString, int, byte[], int, int)
- **static** int commonHashCode(SegmentedByteString)
- **static** int segment(SegmentedByteString, int)
- **static** boolean commonEquals(SegmentedByteString, Object)
- **static** boolean commonRangeEquals(SegmentedByteString, int, ByteString, int, int)
- **static** boolean commonRangeEquals(SegmentedByteString, int, byte[], int, int)
- **static** V forEachSegment(SegmentedByteString, Function3<Integer, Integer, Unit>)
- **static** int binarySearch(int[], int, int, int)
- **static** byte commonInternalGet(SegmentedByteString, int)
- **static** ByteString commonSubstring(SegmentedByteString, int, int)
- **static** int commonGetSize(SegmentedByteString)

### Class: io.tebex.plugin.libs.okio.internal.FixedLengthSource
Type: Class
Extends: io.tebex.plugin.libs.okio.ForwardingSource

Methods:
- long read(Buffer, long)

### Class: io.tebex.plugin.libs.okio.internal.ResourceFileSystem
Type: Class
Extends: io.tebex.plugin.libs.okio.FileSystem

Methods:
- **static** ResourceFileSystem$Companion access$getCompanion$p()
- Sink appendingSink(Path, boolean)
- void createSymlink(Path, Path)
- Sink sink(Path, boolean)
- List<Path> listOrNull(Path)
- Source source(Path)
- FileHandle openReadWrite(Path, boolean, boolean)
- **static** Path access$getROOT$cp()
- List<Path> list(Path)
- void delete(Path, boolean)
- FileHandle openReadOnly(Path)
- void atomicMove(Path, Path)
- **static** List access$toClasspathRoots(ResourceFileSystem, ClassLoader)
- void createDirectory(Path, boolean)
- **static** ClassLoader access$getClassLoader$p(ResourceFileSystem)
- FileMetadata metadataOrNull(Path)
- Path canonicalize(Path)

### Class: io.tebex.plugin.libs.okio.internal.ZipEntry
Type: Class

Methods:
- Long getLastModifiedAtMillis()
- long getCompressedSize()
- List<Path> getChildren()
- long getSize()
- Path getCanonicalPath()
- long getCrc()
- long getOffset()
- String getComment()
- boolean isDirectory()
- int getCompressionMethod()

### Class: io.tebex.plugin.libs.okio.internal.ZipFilesKt
Type: Class

Methods:
- **static** FileMetadata readLocalHeader(BufferedSource, FileMetadata)
- **static** ZipFileSystem openZip$default(Path, FileSystem, Function1, int, Object) throws IOException
- **static** ZipFileSystem openZip(Path, FileSystem, Function1<ZipEntry, Boolean>) throws IOException
- **static** void skipLocalHeader(BufferedSource)
- **static** ZipEntry readEntry(BufferedSource) throws IOException

### Class: io.tebex.plugin.libs.okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
Type: Class
Implements: java.util.Comparator

Methods:
- I compare(T, T)

## Package: io.tebex.plugin.libs.xseries

### Class: io.tebex.plugin.libs.xseries.XMaterial
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ACACIA_BOAT
- ACACIA_BUTTON
- ACACIA_CHEST_BOAT
- ACACIA_DOOR
- ACACIA_FENCE
- ACACIA_FENCE_GATE
- ACACIA_HANGING_SIGN
- ACACIA_LEAVES
- ACACIA_LOG
- ACACIA_PLANKS
- ACACIA_PRESSURE_PLATE
- ACACIA_SAPLING
- ACACIA_SIGN
- ACACIA_SLAB
- ACACIA_STAIRS
- ACACIA_TRAPDOOR
- ACACIA_WALL_HANGING_SIGN
- ACACIA_WALL_SIGN
- ACACIA_WOOD
- ACTIVATOR_RAIL
- AIR
- ALLAY_SPAWN_EGG
- ALLIUM
- AMETHYST_BLOCK
- AMETHYST_CLUSTER
- AMETHYST_SHARD
- ANCIENT_DEBRIS
- ANDESITE
- ANDESITE_SLAB
- ANDESITE_STAIRS
- ANDESITE_WALL
- ANVIL
- APPLE
- ARMOR_STAND
- ARROW
- ATTACHED_MELON_STEM
- ATTACHED_PUMPKIN_STEM
- AXOLOTL_BUCKET
- AXOLOTL_SPAWN_EGG
- AZALEA
- AZALEA_LEAVES
- AZURE_BLUET
- BAKED_POTATO
- BAMBOO
- BAMBOO_BLOCK
- BAMBOO_BUTTON
- BAMBOO_CHEST_RAFT
- BAMBOO_DOOR
- BAMBOO_FENCE
- BAMBOO_FENCE_GATE
- BAMBOO_HANGING_SIGN
- BAMBOO_MOSAIC
- BAMBOO_MOSAIC_SLAB
- BAMBOO_MOSAIC_STAIRS
- BAMBOO_PLANKS
- BAMBOO_PRESSURE_PLATE
- BAMBOO_RAFT
- BAMBOO_SAPLING
- BAMBOO_SIGN
- BAMBOO_SLAB
- BAMBOO_STAIRS
- BAMBOO_TRAPDOOR
- BAMBOO_WALL_HANGING_SIGN
- BAMBOO_WALL_SIGN
- BARREL
- BARRIER
- BASALT
- BAT_SPAWN_EGG
- BEACON
- BEDROCK
- BEEF
- BEEHIVE
- BEETROOT
- BEETROOTS
- BEETROOT_SEEDS
- BEETROOT_SOUP
- BEE_NEST
- BEE_SPAWN_EGG
- BELL
- BIG_DRIPLEAF
- BIG_DRIPLEAF_STEM
- BIRCH_BOAT
- BIRCH_BUTTON
- BIRCH_CHEST_BOAT
- BIRCH_DOOR
- BIRCH_FENCE
- BIRCH_FENCE_GATE
- BIRCH_HANGING_SIGN
- BIRCH_LEAVES
- BIRCH_LOG
- BIRCH_PLANKS
- BIRCH_PRESSURE_PLATE
- BIRCH_SAPLING
- BIRCH_SIGN
- BIRCH_SLAB
- BIRCH_STAIRS
- BIRCH_TRAPDOOR
- BIRCH_WALL_HANGING_SIGN
- BIRCH_WALL_SIGN
- BIRCH_WOOD
- BLACKSTONE
- BLACKSTONE_SLAB
- BLACKSTONE_STAIRS
- BLACKSTONE_WALL
- BLACK_BANNER
- BLACK_BED
- BLACK_CANDLE
- BLACK_CANDLE_CAKE
- BLACK_CARPET
- BLACK_CONCRETE
- BLACK_CONCRETE_POWDER
- BLACK_DYE
- BLACK_GLAZED_TERRACOTTA
- BLACK_SHULKER_BOX
- BLACK_STAINED_GLASS
- BLACK_STAINED_GLASS_PANE
- BLACK_TERRACOTTA
- BLACK_WALL_BANNER
- BLACK_WOOL
- BLAST_FURNACE
- BLAZE_POWDER
- BLAZE_ROD
- BLAZE_SPAWN_EGG
- BLUE_BANNER
- BLUE_BED
- BLUE_CANDLE
- BLUE_CANDLE_CAKE
- BLUE_CARPET
- BLUE_CONCRETE
- BLUE_CONCRETE_POWDER
- BLUE_DYE
- BLUE_GLAZED_TERRACOTTA
- BLUE_ICE
- BLUE_ORCHID
- BLUE_SHULKER_BOX
- BLUE_STAINED_GLASS
- BLUE_STAINED_GLASS_PANE
- BLUE_TERRACOTTA
- BLUE_WALL_BANNER
- BLUE_WOOL
- BONE
- BONE_BLOCK
- BONE_MEAL
- BOOK
- BOOKSHELF
- BOW
- BOWL
- BRAIN_CORAL
- BRAIN_CORAL_BLOCK
- BRAIN_CORAL_FAN
- BRAIN_CORAL_WALL_FAN
- BREAD
- BREWING_STAND
- BRICK
- BRICKS
- BRICK_SLAB
- BRICK_STAIRS
- BRICK_WALL
- BROWN_BANNER
- BROWN_BED
- BROWN_CANDLE
- BROWN_CANDLE_CAKE
- BROWN_CARPET
- BROWN_CONCRETE
- BROWN_CONCRETE_POWDER
- BROWN_DYE
- BROWN_GLAZED_TERRACOTTA
- BROWN_MUSHROOM
- BROWN_MUSHROOM_BLOCK
- BROWN_SHULKER_BOX
- BROWN_STAINED_GLASS
- BROWN_STAINED_GLASS_PANE
- BROWN_TERRACOTTA
- BROWN_WALL_BANNER
- BROWN_WOOL
- BRUSH
- BUBBLE_COLUMN
- BUBBLE_CORAL
- BUBBLE_CORAL_BLOCK
- BUBBLE_CORAL_FAN
- BUBBLE_CORAL_WALL_FAN
- BUCKET
- BUDDING_AMETHYST
- BUNDLE
- CACTUS
- CAKE
- CALCITE
- CAMEL_SPAWN_EGG
- CAMPFIRE
- CANDLE
- CANDLE_CAKE
- CARROT
- CARROTS
- CARROT_ON_A_STICK
- CARTOGRAPHY_TABLE
- CARVED_PUMPKIN
- CAT_SPAWN_EGG
- CAULDRON
- CAVE_AIR
- CAVE_SPIDER_SPAWN_EGG
- CAVE_VINES
- CAVE_VINES_PLANT
- CHAIN
- CHAINMAIL_BOOTS
- CHAINMAIL_CHESTPLATE
- CHAINMAIL_HELMET
- CHAINMAIL_LEGGINGS
- CHAIN_COMMAND_BLOCK
- CHARCOAL
- CHERRY_BOAT
- CHERRY_BUTTON
- CHERRY_CHEST_BOAT
- CHERRY_DOOR
- CHERRY_FENCE
- CHERRY_FENCE_GATE
- CHERRY_HANGING_SIGN
- CHERRY_LEAVES
- CHERRY_LOG
- CHERRY_PLANKS
- CHERRY_PRESSURE_PLATE
- CHERRY_SAPLING
- CHERRY_SIGN
- CHERRY_SLAB
- CHERRY_STAIRS
- CHERRY_TRAPDOOR
- CHERRY_WALL_HANGING_SIGN
- CHERRY_WALL_SIGN
- CHERRY_WOOD
- CHEST
- CHEST_MINECART
- CHICKEN
- CHICKEN_SPAWN_EGG
- CHIPPED_ANVIL
- CHISELED_BOOKSHELF
- CHISELED_DEEPSLATE
- CHISELED_NETHER_BRICKS
- CHISELED_POLISHED_BLACKSTONE
- CHISELED_QUARTZ_BLOCK
- CHISELED_RED_SANDSTONE
- CHISELED_SANDSTONE
- CHISELED_STONE_BRICKS
- CHORUS_FLOWER
- CHORUS_FRUIT
- CHORUS_PLANT
- CLAY
- CLAY_BALL
- CLOCK
- COAL
- COAL_BLOCK
- COAL_ORE
- COARSE_DIRT
- COAST_ARMOR_TRIM_SMITHING_TEMPLATE
- COBBLED_DEEPSLATE
- COBBLED_DEEPSLATE_SLAB
- COBBLED_DEEPSLATE_STAIRS
- COBBLED_DEEPSLATE_WALL
- COBBLESTONE
- COBBLESTONE_SLAB
- COBBLESTONE_STAIRS
- COBBLESTONE_WALL
- COBWEB
- COCOA
- COCOA_BEANS
- COD
- COD_BUCKET
- COD_SPAWN_EGG
- COMMAND_BLOCK
- COMMAND_BLOCK_MINECART
- COMPARATOR
- COMPASS
- COMPOSTER
- CONDUIT
- COOKED_BEEF
- COOKED_CHICKEN
- COOKED_COD
- COOKED_MUTTON
- COOKED_PORKCHOP
- COOKED_RABBIT
- COOKED_SALMON
- COOKIE
- COPPER_BLOCK
- COPPER_INGOT
- COPPER_ORE
- CORNFLOWER
- COW_SPAWN_EGG
- CRACKED_DEEPSLATE_BRICKS
- CRACKED_DEEPSLATE_TILES
- CRACKED_NETHER_BRICKS
- CRACKED_POLISHED_BLACKSTONE_BRICKS
- CRACKED_STONE_BRICKS
- CRAFTING_TABLE
- CREEPER_BANNER_PATTERN
- CREEPER_HEAD
- CREEPER_SPAWN_EGG
- CREEPER_WALL_HEAD
- CRIMSON_BUTTON
- CRIMSON_DOOR
- CRIMSON_FENCE
- CRIMSON_FENCE_GATE
- CRIMSON_FUNGUS
- CRIMSON_HANGING_SIGN
- CRIMSON_HYPHAE
- CRIMSON_NYLIUM
- CRIMSON_PLANKS
- CRIMSON_PRESSURE_PLATE
- CRIMSON_ROOTS
- CRIMSON_SIGN
- CRIMSON_SLAB
- CRIMSON_STAIRS
- CRIMSON_STEM
- CRIMSON_TRAPDOOR
- CRIMSON_WALL_HANGING_SIGN
- CRIMSON_WALL_SIGN
- CROSSBOW
- CRYING_OBSIDIAN
- CUT_COPPER
- CUT_COPPER_SLAB
- CUT_COPPER_STAIRS
- CUT_RED_SANDSTONE
- CUT_RED_SANDSTONE_SLAB
- CUT_SANDSTONE
- CUT_SANDSTONE_SLAB
- CYAN_BANNER
- CYAN_BED
- CYAN_CANDLE
- CYAN_CANDLE_CAKE
- CYAN_CARPET
- CYAN_CONCRETE
- CYAN_CONCRETE_POWDER
- CYAN_DYE
- CYAN_GLAZED_TERRACOTTA
- CYAN_SHULKER_BOX
- CYAN_STAINED_GLASS
- CYAN_STAINED_GLASS_PANE
- CYAN_TERRACOTTA
- CYAN_WALL_BANNER
- CYAN_WOOL
- DAMAGED_ANVIL
- DANDELION
- DARK_OAK_BOAT
- DARK_OAK_BUTTON
- DARK_OAK_CHEST_BOAT
- DARK_OAK_DOOR
- DARK_OAK_FENCE
- DARK_OAK_FENCE_GATE
- DARK_OAK_HANGING_SIGN
- DARK_OAK_LEAVES
- DARK_OAK_LOG
- DARK_OAK_PLANKS
- DARK_OAK_PRESSURE_PLATE
- DARK_OAK_SAPLING
- DARK_OAK_SIGN
- DARK_OAK_SLAB
- DARK_OAK_STAIRS
- DARK_OAK_TRAPDOOR
- DARK_OAK_WALL_HANGING_SIGN
- DARK_OAK_WALL_SIGN
- DARK_OAK_WOOD
- DARK_PRISMARINE
- DARK_PRISMARINE_SLAB
- DARK_PRISMARINE_STAIRS
- DAYLIGHT_DETECTOR
- DEAD_BRAIN_CORAL
- DEAD_BRAIN_CORAL_BLOCK
- DEAD_BRAIN_CORAL_FAN
- DEAD_BRAIN_CORAL_WALL_FAN
- DEAD_BUBBLE_CORAL
- DEAD_BUBBLE_CORAL_BLOCK
- DEAD_BUBBLE_CORAL_FAN
- DEAD_BUBBLE_CORAL_WALL_FAN
- DEAD_BUSH
- DEAD_FIRE_CORAL
- DEAD_FIRE_CORAL_BLOCK
- DEAD_FIRE_CORAL_FAN
- DEAD_FIRE_CORAL_WALL_FAN
- DEAD_HORN_CORAL
- DEAD_HORN_CORAL_BLOCK
- DEAD_HORN_CORAL_FAN
- DEAD_HORN_CORAL_WALL_FAN
- DEAD_TUBE_CORAL
- DEAD_TUBE_CORAL_BLOCK
- DEAD_TUBE_CORAL_FAN
- DEAD_TUBE_CORAL_WALL_FAN
- DEBUG_STICK
- DECORATED_POT
- DEEPSLATE
- DEEPSLATE_BRICKS
- DEEPSLATE_BRICK_SLAB
- DEEPSLATE_BRICK_STAIRS
- DEEPSLATE_BRICK_WALL
- DEEPSLATE_COAL_ORE
- DEEPSLATE_COPPER_ORE
- DEEPSLATE_DIAMOND_ORE
- DEEPSLATE_EMERALD_ORE
- DEEPSLATE_GOLD_ORE
- DEEPSLATE_IRON_ORE
- DEEPSLATE_LAPIS_ORE
- DEEPSLATE_REDSTONE_ORE
- DEEPSLATE_TILES
- DEEPSLATE_TILE_SLAB
- DEEPSLATE_TILE_STAIRS
- DEEPSLATE_TILE_WALL
- DETECTOR_RAIL
- DIAMOND
- DIAMOND_AXE
- DIAMOND_BLOCK
- DIAMOND_BOOTS
- DIAMOND_CHESTPLATE
- DIAMOND_HELMET
- DIAMOND_HOE
- DIAMOND_HORSE_ARMOR
- DIAMOND_LEGGINGS
- DIAMOND_ORE
- DIAMOND_PICKAXE
- DIAMOND_SHOVEL
- DIAMOND_SWORD
- DIORITE
- DIORITE_SLAB
- DIORITE_STAIRS
- DIORITE_WALL
- DIRT
- DIRT_PATH
- DISC_FRAGMENT_5
- DISPENSER
- DOLPHIN_SPAWN_EGG
- DONKEY_SPAWN_EGG
- DRAGON_BREATH
- DRAGON_EGG
- DRAGON_HEAD
- DRAGON_WALL_HEAD
- DRIED_KELP
- DRIED_KELP_BLOCK
- DRIPSTONE_BLOCK
- DROPPER
- DROWNED_SPAWN_EGG
- DUNE_ARMOR_TRIM_SMITHING_TEMPLATE
- ECHO_SHARD
- EGG
- ELDER_GUARDIAN_SPAWN_EGG
- ELYTRA
- EMERALD
- EMERALD_BLOCK
- EMERALD_ORE
- ENCHANTED_BOOK
- ENCHANTED_GOLDEN_APPLE
- ENCHANTING_TABLE
- ENDERMAN_SPAWN_EGG
- ENDERMITE_SPAWN_EGG
- ENDER_CHEST
- ENDER_DRAGON_SPAWN_EGG
- ENDER_EYE
- ENDER_PEARL
- END_CRYSTAL
- END_GATEWAY
- END_PORTAL
- END_PORTAL_FRAME
- END_ROD
- END_STONE
- END_STONE_BRICKS
- END_STONE_BRICK_SLAB
- END_STONE_BRICK_STAIRS
- END_STONE_BRICK_WALL
- EVOKER_SPAWN_EGG
- EXPERIENCE_BOTTLE
- EXPOSED_COPPER
- EXPOSED_CUT_COPPER
- EXPOSED_CUT_COPPER_SLAB
- EXPOSED_CUT_COPPER_STAIRS
- EYE_ARMOR_TRIM_SMITHING_TEMPLATE
- FARMLAND
- FEATHER
- FERMENTED_SPIDER_EYE
- FERN
- FILLED_MAP
- FIRE
- FIREWORK_ROCKET
- FIREWORK_STAR
- FIRE_CHARGE
- FIRE_CORAL
- FIRE_CORAL_BLOCK
- FIRE_CORAL_FAN
- FIRE_CORAL_WALL_FAN
- FISHING_ROD
- FLETCHING_TABLE
- FLINT
- FLINT_AND_STEEL
- FLOWERING_AZALEA
- FLOWERING_AZALEA_LEAVES
- FLOWER_BANNER_PATTERN
- FLOWER_POT
- FOX_SPAWN_EGG
- FROGSPAWN
- FROG_SPAWN_EGG
- FROSTED_ICE
- FURNACE
- FURNACE_MINECART
- GHAST_SPAWN_EGG
- GHAST_TEAR
- GILDED_BLACKSTONE
- GLASS
- GLASS_BOTTLE
- GLASS_PANE
- GLISTERING_MELON_SLICE
- GLOBE_BANNER_PATTERN
- GLOWSTONE
- GLOWSTONE_DUST
- GLOW_BERRIES
- GLOW_INK_SAC
- GLOW_ITEM_FRAME
- GLOW_LICHEN
- GLOW_SQUID_SPAWN_EGG
- GOAT_HORN
- GOAT_SPAWN_EGG
- GOLDEN_APPLE
- GOLDEN_AXE
- GOLDEN_BOOTS
- GOLDEN_CARROT
- GOLDEN_CHESTPLATE
- GOLDEN_HELMET
- GOLDEN_HOE
- GOLDEN_HORSE_ARMOR
- GOLDEN_LEGGINGS
- GOLDEN_PICKAXE
- GOLDEN_SHOVEL
- GOLDEN_SWORD
- GOLD_BLOCK
- GOLD_INGOT
- GOLD_NUGGET
- GOLD_ORE
- GRANITE
- GRANITE_SLAB
- GRANITE_STAIRS
- GRANITE_WALL
- GRASS
- GRASS_BLOCK
- GRAVEL
- GRAY_BANNER
- GRAY_BED
- GRAY_CANDLE
- GRAY_CANDLE_CAKE
- GRAY_CARPET
- GRAY_CONCRETE
- GRAY_CONCRETE_POWDER
- GRAY_DYE
- GRAY_GLAZED_TERRACOTTA
- GRAY_SHULKER_BOX
- GRAY_STAINED_GLASS
- GRAY_STAINED_GLASS_PANE
- GRAY_TERRACOTTA
- GRAY_WALL_BANNER
- GRAY_WOOL
- GREEN_BANNER
- GREEN_BED
- GREEN_CANDLE
- GREEN_CANDLE_CAKE
- GREEN_CARPET
- GREEN_CONCRETE
- GREEN_CONCRETE_POWDER
- GREEN_DYE
- GREEN_GLAZED_TERRACOTTA
- GREEN_SHULKER_BOX
- GREEN_STAINED_GLASS
- GREEN_STAINED_GLASS_PANE
- GREEN_TERRACOTTA
- GREEN_WALL_BANNER
- GREEN_WOOL
- GRINDSTONE
- GUARDIAN_SPAWN_EGG
- GUNPOWDER
- HANGING_ROOTS
- HAY_BLOCK
- HEART_OF_THE_SEA
- HEAVY_WEIGHTED_PRESSURE_PLATE
- HOGLIN_SPAWN_EGG
- HONEYCOMB
- HONEYCOMB_BLOCK
- HONEY_BLOCK
- HONEY_BOTTLE
- HOPPER
- HOPPER_MINECART
- HORN_CORAL
- HORN_CORAL_BLOCK
- HORN_CORAL_FAN
- HORN_CORAL_WALL_FAN
- HORSE_SPAWN_EGG
- HUSK_SPAWN_EGG
- ICE
- INFESTED_CHISELED_STONE_BRICKS
- INFESTED_COBBLESTONE
- INFESTED_CRACKED_STONE_BRICKS
- INFESTED_DEEPSLATE
- INFESTED_MOSSY_STONE_BRICKS
- INFESTED_STONE
- INFESTED_STONE_BRICKS
- INK_SAC
- IRON_AXE
- IRON_BARS
- IRON_BLOCK
- IRON_BOOTS
- IRON_CHESTPLATE
- IRON_DOOR
- IRON_GOLEM_SPAWN_EGG
- IRON_HELMET
- IRON_HOE
- IRON_HORSE_ARMOR
- IRON_INGOT
- IRON_LEGGINGS
- IRON_NUGGET
- IRON_ORE
- IRON_PICKAXE
- IRON_SHOVEL
- IRON_SWORD
- IRON_TRAPDOOR
- ITEM_FRAME
- JACK_O_LANTERN
- JIGSAW
- JUKEBOX
- JUNGLE_BOAT
- JUNGLE_BUTTON
- JUNGLE_CHEST_BOAT
- JUNGLE_DOOR
- JUNGLE_FENCE
- JUNGLE_FENCE_GATE
- JUNGLE_HANGING_SIGN
- JUNGLE_LEAVES
- JUNGLE_LOG
- JUNGLE_PLANKS
- JUNGLE_PRESSURE_PLATE
- JUNGLE_SAPLING
- JUNGLE_SIGN
- JUNGLE_SLAB
- JUNGLE_STAIRS
- JUNGLE_TRAPDOOR
- JUNGLE_WALL_HANGING_SIGN
- JUNGLE_WALL_SIGN
- JUNGLE_WOOD
- KELP
- KELP_PLANT
- KNOWLEDGE_BOOK
- LADDER
- LANTERN
- LAPIS_BLOCK
- LAPIS_LAZULI
- LAPIS_ORE
- LARGE_AMETHYST_BUD
- LARGE_FERN
- LAVA
- LAVA_BUCKET
- LAVA_CAULDRON
- LEAD
- LEATHER
- LEATHER_BOOTS
- LEATHER_CHESTPLATE
- LEATHER_HELMET
- LEATHER_HORSE_ARMOR
- LEATHER_LEGGINGS
- LECTERN
- LEVER
- LIGHT
- LIGHTNING_ROD
- LIGHT_BLUE_BANNER
- LIGHT_BLUE_BED
- LIGHT_BLUE_CANDLE
- LIGHT_BLUE_CANDLE_CAKE
- LIGHT_BLUE_CARPET
- LIGHT_BLUE_CONCRETE
- LIGHT_BLUE_CONCRETE_POWDER
- LIGHT_BLUE_DYE
- LIGHT_BLUE_GLAZED_TERRACOTTA
- LIGHT_BLUE_SHULKER_BOX
- LIGHT_BLUE_STAINED_GLASS
- LIGHT_BLUE_STAINED_GLASS_PANE
- LIGHT_BLUE_TERRACOTTA
- LIGHT_BLUE_WALL_BANNER
- LIGHT_BLUE_WOOL
- LIGHT_GRAY_BANNER
- LIGHT_GRAY_BED
- LIGHT_GRAY_CANDLE
- LIGHT_GRAY_CANDLE_CAKE
- LIGHT_GRAY_CARPET
- LIGHT_GRAY_CONCRETE
- LIGHT_GRAY_CONCRETE_POWDER
- LIGHT_GRAY_DYE
- LIGHT_GRAY_GLAZED_TERRACOTTA
- LIGHT_GRAY_SHULKER_BOX
- LIGHT_GRAY_STAINED_GLASS
- LIGHT_GRAY_STAINED_GLASS_PANE
- LIGHT_GRAY_TERRACOTTA
- LIGHT_GRAY_WALL_BANNER
- LIGHT_GRAY_WOOL
- LIGHT_WEIGHTED_PRESSURE_PLATE
- LILAC
- LILY_OF_THE_VALLEY
- LILY_PAD
- LIME_BANNER
- LIME_BED
- LIME_CANDLE
- LIME_CANDLE_CAKE
- LIME_CARPET
- LIME_CONCRETE
- LIME_CONCRETE_POWDER
- LIME_DYE
- LIME_GLAZED_TERRACOTTA
- LIME_SHULKER_BOX
- LIME_STAINED_GLASS
- LIME_STAINED_GLASS_PANE
- LIME_TERRACOTTA
- LIME_WALL_BANNER
- LIME_WOOL
- LINGERING_POTION
- LLAMA_SPAWN_EGG
- LODESTONE
- LOOM
- MAGENTA_BANNER
- MAGENTA_BED
- MAGENTA_CANDLE
- MAGENTA_CANDLE_CAKE
- MAGENTA_CARPET
- MAGENTA_CONCRETE
- MAGENTA_CONCRETE_POWDER
- MAGENTA_DYE
- MAGENTA_GLAZED_TERRACOTTA
- MAGENTA_SHULKER_BOX
- MAGENTA_STAINED_GLASS
- MAGENTA_STAINED_GLASS_PANE
- MAGENTA_TERRACOTTA
- MAGENTA_WALL_BANNER
- MAGENTA_WOOL
- MAGMA_BLOCK
- MAGMA_CREAM
- MAGMA_CUBE_SPAWN_EGG
- MANGROVE_BOAT
- MANGROVE_BUTTON
- MANGROVE_CHEST_BOAT
- MANGROVE_DOOR
- MANGROVE_FENCE
- MANGROVE_FENCE_GATE
- MANGROVE_HANGING_SIGN
- MANGROVE_LEAVES
- MANGROVE_LOG
- MANGROVE_PLANKS
- MANGROVE_PRESSURE_PLATE
- MANGROVE_PROPAGULE
- MANGROVE_ROOTS
- MANGROVE_SIGN
- MANGROVE_SLAB
- MANGROVE_STAIRS
- MANGROVE_TRAPDOOR
- MANGROVE_WALL_HANGING_SIGN
- MANGROVE_WALL_SIGN
- MANGROVE_WOOD
- MAP
- MEDIUM_AMETHYST_BUD
- MELON
- MELON_SEEDS
- MELON_SLICE
- MELON_STEM
- MILK_BUCKET
- MINECART
- MOJANG_BANNER_PATTERN
- MOOSHROOM_SPAWN_EGG
- MOSSY_COBBLESTONE
- MOSSY_COBBLESTONE_SLAB
- MOSSY_COBBLESTONE_STAIRS
- MOSSY_COBBLESTONE_WALL
- MOSSY_STONE_BRICKS
- MOSSY_STONE_BRICK_SLAB
- MOSSY_STONE_BRICK_STAIRS
- MOSSY_STONE_BRICK_WALL
- MOSS_BLOCK
- MOSS_CARPET
- MOVING_PISTON
- MUD
- MUDDY_MANGROVE_ROOTS
- MUD_BRICKS
- MUD_BRICK_SLAB
- MUD_BRICK_STAIRS
- MUD_BRICK_WALL
- MULE_SPAWN_EGG
- MUSHROOM_STEM
- MUSHROOM_STEW
- MUSIC_DISC_11
- MUSIC_DISC_13
- MUSIC_DISC_5
- MUSIC_DISC_BLOCKS
- MUSIC_DISC_CAT
- MUSIC_DISC_CHIRP
- MUSIC_DISC_FAR
- MUSIC_DISC_MALL
- MUSIC_DISC_MELLOHI
- MUSIC_DISC_OTHERSIDE
- MUSIC_DISC_PIGSTEP
- MUSIC_DISC_STAL
- MUSIC_DISC_STRAD
- MUSIC_DISC_WAIT
- MUSIC_DISC_WARD
- MUTTON
- MYCELIUM
- NAME_TAG
- NAUTILUS_SHELL
- NETHERITE_AXE
- NETHERITE_BLOCK
- NETHERITE_BOOTS
- NETHERITE_CHESTPLATE
- NETHERITE_HELMET
- NETHERITE_HOE
- NETHERITE_INGOT
- NETHERITE_LEGGINGS
- NETHERITE_PICKAXE
- NETHERITE_SCRAP
- NETHERITE_SHOVEL
- NETHERITE_SWORD
- NETHERITE_UPGRADE_SMITHING_TEMPLATE
- NETHERRACK
- NETHER_BRICK
- NETHER_BRICKS
- NETHER_BRICK_FENCE
- NETHER_BRICK_SLAB
- NETHER_BRICK_STAIRS
- NETHER_BRICK_WALL
- NETHER_GOLD_ORE
- NETHER_PORTAL
- NETHER_QUARTZ_ORE
- NETHER_SPROUTS
- NETHER_STAR
- NETHER_WART
- NETHER_WART_BLOCK
- NOTE_BLOCK
- OAK_BOAT
- OAK_BUTTON
- OAK_CHEST_BOAT
- OAK_DOOR
- OAK_FENCE
- OAK_FENCE_GATE
- OAK_HANGING_SIGN
- OAK_LEAVES
- OAK_LOG
- OAK_PLANKS
- OAK_PRESSURE_PLATE
- OAK_SAPLING
- OAK_SIGN
- OAK_SLAB
- OAK_STAIRS
- OAK_TRAPDOOR
- OAK_WALL_HANGING_SIGN
- OAK_WALL_SIGN
- OAK_WOOD
- OBSERVER
- OBSIDIAN
- OCELOT_SPAWN_EGG
- OCHRE_FROGLIGHT
- ORANGE_BANNER
- ORANGE_BED
- ORANGE_CANDLE
- ORANGE_CANDLE_CAKE
- ORANGE_CARPET
- ORANGE_CONCRETE
- ORANGE_CONCRETE_POWDER
- ORANGE_DYE
- ORANGE_GLAZED_TERRACOTTA
- ORANGE_SHULKER_BOX
- ORANGE_STAINED_GLASS
- ORANGE_STAINED_GLASS_PANE
- ORANGE_TERRACOTTA
- ORANGE_TULIP
- ORANGE_WALL_BANNER
- ORANGE_WOOL
- OXEYE_DAISY
- OXIDIZED_COPPER
- OXIDIZED_CUT_COPPER
- OXIDIZED_CUT_COPPER_SLAB
- OXIDIZED_CUT_COPPER_STAIRS
- PACKED_ICE
- PACKED_MUD
- PAINTING
- PANDA_SPAWN_EGG
- PAPER
- PARROT_SPAWN_EGG
- PEARLESCENT_FROGLIGHT
- PEONY
- PETRIFIED_OAK_SLAB
- PHANTOM_MEMBRANE
- PHANTOM_SPAWN_EGG
- PIGLIN_BANNER_PATTERN
- PIGLIN_BRUTE_SPAWN_EGG
- PIGLIN_HEAD
- PIGLIN_SPAWN_EGG
- PIGLIN_WALL_HEAD
- PIG_SPAWN_EGG
- PILLAGER_SPAWN_EGG
- PINK_BANNER
- PINK_BED
- PINK_CANDLE
- PINK_CANDLE_CAKE
- PINK_CARPET
- PINK_CONCRETE
- PINK_CONCRETE_POWDER
- PINK_DYE
- PINK_GLAZED_TERRACOTTA
- PINK_PETALS
- PINK_SHULKER_BOX
- PINK_STAINED_GLASS
- PINK_STAINED_GLASS_PANE
- PINK_TERRACOTTA
- PINK_TULIP
- PINK_WALL_BANNER
- PINK_WOOL
- PISTON
- PISTON_HEAD
- PLAYER_HEAD
- PLAYER_WALL_HEAD
- PODZOL
- POINTED_DRIPSTONE
- POISONOUS_POTATO
- POLAR_BEAR_SPAWN_EGG
- POLISHED_ANDESITE
- POLISHED_ANDESITE_SLAB
- POLISHED_ANDESITE_STAIRS
- POLISHED_BASALT
- POLISHED_BLACKSTONE
- POLISHED_BLACKSTONE_BRICKS
- POLISHED_BLACKSTONE_BRICK_SLAB
- POLISHED_BLACKSTONE_BRICK_STAIRS
- POLISHED_BLACKSTONE_BRICK_WALL
- POLISHED_BLACKSTONE_BUTTON
- POLISHED_BLACKSTONE_PRESSURE_PLATE
- POLISHED_BLACKSTONE_SLAB
- POLISHED_BLACKSTONE_STAIRS
- POLISHED_BLACKSTONE_WALL
- POLISHED_DEEPSLATE
- POLISHED_DEEPSLATE_SLAB
- POLISHED_DEEPSLATE_STAIRS
- POLISHED_DEEPSLATE_WALL
- POLISHED_DIORITE
- POLISHED_DIORITE_SLAB
- POLISHED_DIORITE_STAIRS
- POLISHED_GRANITE
- POLISHED_GRANITE_SLAB
- POLISHED_GRANITE_STAIRS
- POPPED_CHORUS_FRUIT
- POPPY
- PORKCHOP
- POTATO
- POTATOES
- POTION
- POTTED_ACACIA_SAPLING
- POTTED_ALLIUM
- POTTED_AZALEA_BUSH
- POTTED_AZURE_BLUET
- POTTED_BAMBOO
- POTTED_BIRCH_SAPLING
- POTTED_BLUE_ORCHID
- POTTED_BROWN_MUSHROOM
- POTTED_CACTUS
- POTTED_CHERRY_SAPLING
- POTTED_CORNFLOWER
- POTTED_CRIMSON_FUNGUS
- POTTED_CRIMSON_ROOTS
- POTTED_DANDELION
- POTTED_DARK_OAK_SAPLING
- POTTED_DEAD_BUSH
- POTTED_FERN
- POTTED_FLOWERING_AZALEA_BUSH
- POTTED_JUNGLE_SAPLING
- POTTED_LILY_OF_THE_VALLEY
- POTTED_MANGROVE_PROPAGULE
- POTTED_OAK_SAPLING
- POTTED_ORANGE_TULIP
- POTTED_OXEYE_DAISY
- POTTED_PINK_TULIP
- POTTED_POPPY
- POTTED_RED_MUSHROOM
- POTTED_RED_TULIP
- POTTED_SPRUCE_SAPLING
- POTTED_TORCHFLOWER
- POTTED_WARPED_FUNGUS
- POTTED_WARPED_ROOTS
- POTTED_WHITE_TULIP
- POTTED_WITHER_ROSE
- POTTERY_SHARD_ARCHER
- POTTERY_SHARD_ARMS_UP
- POTTERY_SHARD_PRIZE
- POTTERY_SHARD_SKULL
- POWDER_SNOW
- POWDER_SNOW_BUCKET
- POWDER_SNOW_CAULDRON
- POWERED_RAIL
- PRISMARINE
- PRISMARINE_BRICKS
- PRISMARINE_BRICK_SLAB
- PRISMARINE_BRICK_STAIRS
- PRISMARINE_CRYSTALS
- PRISMARINE_SHARD
- PRISMARINE_SLAB
- PRISMARINE_STAIRS
- PRISMARINE_WALL
- PUFFERFISH
- PUFFERFISH_BUCKET
- PUFFERFISH_SPAWN_EGG
- PUMPKIN
- PUMPKIN_PIE
- PUMPKIN_SEEDS
- PUMPKIN_STEM
- PURPLE_BANNER
- PURPLE_BED
- PURPLE_CANDLE
- PURPLE_CANDLE_CAKE
- PURPLE_CARPET
- PURPLE_CONCRETE
- PURPLE_CONCRETE_POWDER
- PURPLE_DYE
- PURPLE_GLAZED_TERRACOTTA
- PURPLE_SHULKER_BOX
- PURPLE_STAINED_GLASS
- PURPLE_STAINED_GLASS_PANE
- PURPLE_TERRACOTTA
- PURPLE_WALL_BANNER
- PURPLE_WOOL
- PURPUR_BLOCK
- PURPUR_PILLAR
- PURPUR_SLAB
- PURPUR_STAIRS
- QUARTZ
- QUARTZ_BLOCK
- QUARTZ_BRICKS
- QUARTZ_PILLAR
- QUARTZ_SLAB
- QUARTZ_STAIRS
- RABBIT
- RABBIT_FOOT
- RABBIT_HIDE
- RABBIT_SPAWN_EGG
- RABBIT_STEW
- RAIL
- RAVAGER_SPAWN_EGG
- RAW_COPPER
- RAW_COPPER_BLOCK
- RAW_GOLD
- RAW_GOLD_BLOCK
- RAW_IRON
- RAW_IRON_BLOCK
- RECOVERY_COMPASS
- REDSTONE
- REDSTONE_BLOCK
- REDSTONE_LAMP
- REDSTONE_ORE
- REDSTONE_TORCH
- REDSTONE_WALL_TORCH
- REDSTONE_WIRE
- RED_BANNER
- RED_BED
- RED_CANDLE
- RED_CANDLE_CAKE
- RED_CARPET
- RED_CONCRETE
- RED_CONCRETE_POWDER
- RED_DYE
- RED_GLAZED_TERRACOTTA
- RED_MUSHROOM
- RED_MUSHROOM_BLOCK
- RED_NETHER_BRICKS
- RED_NETHER_BRICK_SLAB
- RED_NETHER_BRICK_STAIRS
- RED_NETHER_BRICK_WALL
- RED_SAND
- RED_SANDSTONE
- RED_SANDSTONE_SLAB
- RED_SANDSTONE_STAIRS
- RED_SANDSTONE_WALL
- RED_SHULKER_BOX
- RED_STAINED_GLASS
- RED_STAINED_GLASS_PANE
- RED_TERRACOTTA
- RED_TULIP
- RED_WALL_BANNER
- RED_WOOL
- REINFORCED_DEEPSLATE
- REPEATER
- REPEATING_COMMAND_BLOCK
- RESPAWN_ANCHOR
- RIB_ARMOR_TRIM_SMITHING_TEMPLATE
- ROOTED_DIRT
- ROSE_BUSH
- ROTTEN_FLESH
- SADDLE
- SALMON
- SALMON_BUCKET
- SALMON_SPAWN_EGG
- SAND
- SANDSTONE
- SANDSTONE_SLAB
- SANDSTONE_STAIRS
- SANDSTONE_WALL
- SCAFFOLDING
- SCULK
- SCULK_CATALYST
- SCULK_SENSOR
- SCULK_SHRIEKER
- SCULK_VEIN
- SCUTE
- SEAGRASS
- SEA_LANTERN
- SEA_PICKLE
- SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE
- SHEARS
- SHEEP_SPAWN_EGG
- SHIELD
- SHROOMLIGHT
- SHULKER_BOX
- SHULKER_SHELL
- SHULKER_SPAWN_EGG
- SILVERFISH_SPAWN_EGG
- SKELETON_HORSE_SPAWN_EGG
- SKELETON_SKULL
- SKELETON_SPAWN_EGG
- SKELETON_WALL_SKULL
- SKULL_BANNER_PATTERN
- SLIME_BALL
- SLIME_BLOCK
- SLIME_SPAWN_EGG
- SMALL_AMETHYST_BUD
- SMALL_DRIPLEAF
- SMITHING_TABLE
- SMOKER
- SMOOTH_BASALT
- SMOOTH_QUARTZ
- SMOOTH_QUARTZ_SLAB
- SMOOTH_QUARTZ_STAIRS
- SMOOTH_RED_SANDSTONE
- SMOOTH_RED_SANDSTONE_SLAB
- SMOOTH_RED_SANDSTONE_STAIRS
- SMOOTH_SANDSTONE
- SMOOTH_SANDSTONE_SLAB
- SMOOTH_SANDSTONE_STAIRS
- SMOOTH_STONE
- SMOOTH_STONE_SLAB
- SNIFFER_SPAWN_EGG
- SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE
- SNOW
- SNOWBALL
- SNOW_BLOCK
- SNOW_GOLEM_SPAWN_EGG
- SOUL_CAMPFIRE
- SOUL_FIRE
- SOUL_LANTERN
- SOUL_SAND
- SOUL_SOIL
- SOUL_TORCH
- SOUL_WALL_TORCH
- SPAWNER
- SPECTRAL_ARROW
- SPIDER_EYE
- SPIDER_SPAWN_EGG
- SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE
- SPLASH_POTION
- SPONGE
- SPORE_BLOSSOM
- SPRUCE_BOAT
- SPRUCE_BUTTON
- SPRUCE_CHEST_BOAT
- SPRUCE_DOOR
- SPRUCE_FENCE
- SPRUCE_FENCE_GATE
- SPRUCE_HANGING_SIGN
- SPRUCE_LEAVES
- SPRUCE_LOG
- SPRUCE_PLANKS
- SPRUCE_PRESSURE_PLATE
- SPRUCE_SAPLING
- SPRUCE_SIGN
- SPRUCE_SLAB
- SPRUCE_STAIRS
- SPRUCE_TRAPDOOR
- SPRUCE_WALL_HANGING_SIGN
- SPRUCE_WALL_SIGN
- SPRUCE_WOOD
- SPYGLASS
- SQUID_SPAWN_EGG
- STICK
- STICKY_PISTON
- STONE
- STONECUTTER
- STONE_AXE
- STONE_BRICKS
- STONE_BRICK_SLAB
- STONE_BRICK_STAIRS
- STONE_BRICK_WALL
- STONE_BUTTON
- STONE_HOE
- STONE_PICKAXE
- STONE_PRESSURE_PLATE
- STONE_SHOVEL
- STONE_SLAB
- STONE_STAIRS
- STONE_SWORD
- STRAY_SPAWN_EGG
- STRIDER_SPAWN_EGG
- STRING
- STRIPPED_ACACIA_LOG
- STRIPPED_ACACIA_WOOD
- STRIPPED_BAMBOO_BLOCK
- STRIPPED_BIRCH_LOG
- STRIPPED_BIRCH_WOOD
- STRIPPED_CHERRY_LOG
- STRIPPED_CHERRY_WOOD
- STRIPPED_CRIMSON_HYPHAE
- STRIPPED_CRIMSON_STEM
- STRIPPED_DARK_OAK_LOG
- STRIPPED_DARK_OAK_WOOD
- STRIPPED_JUNGLE_LOG
- STRIPPED_JUNGLE_WOOD
- STRIPPED_MANGROVE_LOG
- STRIPPED_MANGROVE_WOOD
- STRIPPED_OAK_LOG
- STRIPPED_OAK_WOOD
- STRIPPED_SPRUCE_LOG
- STRIPPED_SPRUCE_WOOD
- STRIPPED_WARPED_HYPHAE
- STRIPPED_WARPED_STEM
- STRUCTURE_BLOCK
- STRUCTURE_VOID
- SUGAR
- SUGAR_CANE
- SUNFLOWER
- SUSPICIOUS_SAND
- SUSPICIOUS_STEW
- SWEET_BERRIES
- SWEET_BERRY_BUSH
- TADPOLE_BUCKET
- TADPOLE_SPAWN_EGG
- TALL_GRASS
- TALL_SEAGRASS
- TARGET
- TERRACOTTA
- TIDE_ARMOR_TRIM_SMITHING_TEMPLATE
- TINTED_GLASS
- TIPPED_ARROW
- TNT
- TNT_MINECART
- TORCH
- TORCHFLOWER
- TORCHFLOWER_CROP
- TORCHFLOWER_SEEDS
- TOTEM_OF_UNDYING
- TRADER_LLAMA_SPAWN_EGG
- TRAPPED_CHEST
- TRIDENT
- TRIPWIRE
- TRIPWIRE_HOOK
- TROPICAL_FISH
- TROPICAL_FISH_BUCKET
- TROPICAL_FISH_SPAWN_EGG
- TUBE_CORAL
- TUBE_CORAL_BLOCK
- TUBE_CORAL_FAN
- TUBE_CORAL_WALL_FAN
- TUFF
- TURTLE_EGG
- TURTLE_HELMET
- TURTLE_SPAWN_EGG
- TWISTING_VINES
- TWISTING_VINES_PLANT
- VERDANT_FROGLIGHT
- VEX_ARMOR_TRIM_SMITHING_TEMPLATE
- VEX_SPAWN_EGG
- VILLAGER_SPAWN_EGG
- VINDICATOR_SPAWN_EGG
- VINE
- VOID_AIR
- WALL_TORCH
- WANDERING_TRADER_SPAWN_EGG
- WARDEN_SPAWN_EGG
- WARD_ARMOR_TRIM_SMITHING_TEMPLATE
- WARPED_BUTTON
- WARPED_DOOR
- WARPED_FENCE
- WARPED_FENCE_GATE
- WARPED_FUNGUS
- WARPED_FUNGUS_ON_A_STICK
- WARPED_HANGING_SIGN
- WARPED_HYPHAE
- WARPED_NYLIUM
- WARPED_PLANKS
- WARPED_PRESSURE_PLATE
- WARPED_ROOTS
- WARPED_SIGN
- WARPED_SLAB
- WARPED_STAIRS
- WARPED_STEM
- WARPED_TRAPDOOR
- WARPED_WALL_HANGING_SIGN
- WARPED_WALL_SIGN
- WARPED_WART_BLOCK
- WATER
- WATER_BUCKET
- WATER_CAULDRON
- WAXED_COPPER_BLOCK
- WAXED_CUT_COPPER
- WAXED_CUT_COPPER_SLAB
- WAXED_CUT_COPPER_STAIRS
- WAXED_EXPOSED_COPPER
- WAXED_EXPOSED_CUT_COPPER
- WAXED_EXPOSED_CUT_COPPER_SLAB
- WAXED_EXPOSED_CUT_COPPER_STAIRS
- WAXED_OXIDIZED_COPPER
- WAXED_OXIDIZED_CUT_COPPER
- WAXED_OXIDIZED_CUT_COPPER_SLAB
- WAXED_OXIDIZED_CUT_COPPER_STAIRS
- WAXED_WEATHERED_COPPER
- WAXED_WEATHERED_CUT_COPPER
- WAXED_WEATHERED_CUT_COPPER_SLAB
- WAXED_WEATHERED_CUT_COPPER_STAIRS
- WEATHERED_COPPER
- WEATHERED_CUT_COPPER
- WEATHERED_CUT_COPPER_SLAB
- WEATHERED_CUT_COPPER_STAIRS
- WEEPING_VINES
- WEEPING_VINES_PLANT
- WET_SPONGE
- WHEAT
- WHEAT_SEEDS
- WHITE_BANNER
- WHITE_BED
- WHITE_CANDLE
- WHITE_CANDLE_CAKE
- WHITE_CARPET
- WHITE_CONCRETE
- WHITE_CONCRETE_POWDER
- WHITE_DYE
- WHITE_GLAZED_TERRACOTTA
- WHITE_SHULKER_BOX
- WHITE_STAINED_GLASS
- WHITE_STAINED_GLASS_PANE
- WHITE_TERRACOTTA
- WHITE_TULIP
- WHITE_WALL_BANNER
- WHITE_WOOL
- WILD_ARMOR_TRIM_SMITHING_TEMPLATE
- WITCH_SPAWN_EGG
- WITHER_ROSE
- WITHER_SKELETON_SKULL
- WITHER_SKELETON_SPAWN_EGG
- WITHER_SKELETON_WALL_SKULL
- WITHER_SPAWN_EGG
- WOLF_SPAWN_EGG
- WOODEN_AXE
- WOODEN_HOE
- WOODEN_PICKAXE
- WOODEN_SHOVEL
- WOODEN_SWORD
- WRITABLE_BOOK
- WRITTEN_BOOK
- YELLOW_BANNER
- YELLOW_BED
- YELLOW_CANDLE
- YELLOW_CANDLE_CAKE
- YELLOW_CARPET
- YELLOW_CONCRETE
- YELLOW_CONCRETE_POWDER
- YELLOW_DYE
- YELLOW_GLAZED_TERRACOTTA
- YELLOW_SHULKER_BOX
- YELLOW_STAINED_GLASS
- YELLOW_STAINED_GLASS_PANE
- YELLOW_TERRACOTTA
- YELLOW_WALL_BANNER
- YELLOW_WOOL
- ZOGLIN_SPAWN_EGG
- ZOMBIE_HEAD
- ZOMBIE_HORSE_SPAWN_EGG
- ZOMBIE_SPAWN_EGG
- ZOMBIE_VILLAGER_SPAWN_EGG
- ZOMBIE_WALL_HEAD
- ZOMBIFIED_PIGLIN_SPAWN_EGG

Methods:
- **static** int getVersion()
- XMaterial or(XMaterial)
- **static** XMaterial valueOf(String)
- **static** XMaterial[] values()
- int getId()
- boolean isSupported()
- Z isOneOf(Collection<String>)
- ItemStack setType(ItemStack)
- **static** Optional<XMaterial> matchXMaterial(String)
- **static** XMaterial matchXMaterial(Material)
- **static** XMaterial matchXMaterial(ItemStack)
- **static** Optional<XMaterial> matchXMaterial(int, byte)
- **static** boolean supports(int)
- String toString()
- boolean isSimilar(ItemStack)
- String[] getLegacy()
- ItemStack parseItem()
- byte getData()
- Material parseMaterial()

## Package: io.tebex.plugin.manager

### Class: io.tebex.plugin.manager.CommandManager
Type: Class

Methods:
- TebexPlugin getPlatform()
- Map<String, SubCommand> getCommands()
- void register()

## Package: io.tebex.plugin.placeholder

### Class: io.tebex.plugin.placeholder.BukkitNamePlaceholder
Type: Class
Implements: io.tebex.sdk.placeholder.Placeholder

Methods:
- String handle(QueuedPlayer, String)

## Package: io.tebex.plugin.util

### Class: io.tebex.plugin.util.MaterialUtil
Type: Class

Methods:
- **static** Optional<XMaterial> fromString(String)

## Package: io.tebex.sdk

### Class: io.tebex.sdk.SDK
Type: Class

Methods:
- CompletableFuture<List<CommunityGoal>> getCommunityGoals()
- CompletableFuture<OfflineCommandsResponse> getOfflineCommands()
- TebexRequest request(String)
- TebexRequest request(String, boolean)
- void setSecretKey(String)
- String getSecretKey()
- CompletableFuture<Package> getPackage(int)
- CompletableFuture<Coupon> getCoupon(int)
- CompletableFuture<CheckoutUrl> createCheckoutUrl(int, String)
- CompletableFuture<List<Category>> getListing()
- CompletableFuture<Boolean> deleteCommands(List<Integer>)
- CompletableFuture<CommunityGoal> getCommunityGoal(int)
- CompletableFuture<Boolean> sendTelemetry()
- CompletableFuture<DuePlayersResponse> getDuePlayers()
- CompletableFuture<Boolean> sendJoinEvents(List<ServerEvent>)
- CompletableFuture<Boolean> deleteCoupon(int)
- CompletableFuture<PaginatedResponse<Coupon>> getCoupons()
- boolean isKeyUnset()
- CompletableFuture<Boolean> sendPluginEvents()
- CompletableFuture<PlayerLookupInfo> getPlayerLookupInfo(String)
- CompletableFuture<Coupon> createCoupon(CreateCouponRequest)
- CompletableFuture<List<Package>> getPackages()
- CompletableFuture<Boolean> createBan(String, String, String)
- CompletableFuture<List<QueuedCommand>> getOnlineCommands(QueuedPlayer)
- CompletableFuture<ServerInformation> getServerInformation()
- void shutdown()

### Class: io.tebex.sdk.Tebex
Type: Class

Methods:
- **static** void init(Platform)
- **static** Platform get()

## Package: io.tebex.sdk.exception

### Class: io.tebex.sdk.exception.ServerNotFoundException
Type: Class
Extends: java.lang.Throwable

Methods:
- String getMessage()

### Class: io.tebex.sdk.exception.ServerNotSetupException
Type: Class
Extends: java.lang.Throwable

Methods:
- String getMessage()

## Package: io.tebex.sdk.obj

### Class: io.tebex.sdk.obj.ICategory
Type: Interface

Methods:
- String getName()
- int getOrder()
- List<CategoryPackage> getPackages()
- String getGuiItem()
- int getId()

### Class: io.tebex.sdk.obj.BasketType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SINGLE
- SUBSCRIPTION
- BOTH

Methods:
- **static** BasketType valueOf(String)
- **static** BasketType[] values()

### Class: io.tebex.sdk.obj.Category
Type: Class
Implements: io.tebex.sdk.obj.ICategory

Methods:
- V setSubCategories(List<SubCategory>)
- String getName()
- List<SubCategory> getSubCategories()
- int getOrder()
- List<CategoryPackage> getPackages()
- String getGuiItem()
- String toString()
- int getId()
- **static** Category fromJsonObject(JsonObject)
- boolean isOnlySubcategories()

### Class: io.tebex.sdk.obj.CategoryPackage
Type: Class

Methods:
- String getName()
- int getOrder()
- boolean hasSale()
- CategoryPackage$Sale getSale()
- String getGuiItem()
- String toString()
- int getId()
- **static** CategoryPackage fromJsonObject(JsonObject)
- String getImage()
- double getPrice()

### Class: io.tebex.sdk.obj.CategoryPackage$Sale
Type: Class

Methods:
- double getDiscount()
- String toString()
- boolean isActive()

### Class: io.tebex.sdk.obj.CheckoutUrl
Type: Class

Methods:
- String getUrl()
- Date getExpiry()
- String toString()

### Class: io.tebex.sdk.obj.CommunityGoal
Type: Class

Methods:
- String getName()
- ZonedDateTime getUpdatedAt()
- boolean hasSale()
- int getId()
- CommunityGoal$Status getStatus()
- String getDescription()
- ZonedDateTime getLastAchieved()
- boolean isRepeatable()
- double getTarget()
- ZonedDateTime getCreatedAt()
- int getTimesAchieved()
- int getAccountId()
- String toString()
- double getCurrent()
- **static** CommunityGoal fromJsonObject(JsonObject)
- String getImage()

### Class: io.tebex.sdk.obj.CommunityGoal$Status
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ACTIVE
- COMPLETED
- DISABLED

Methods:
- **static** CommunityGoal$Status valueOf(String)
- **static** CommunityGoal$Status[] values()

### Class: io.tebex.sdk.obj.Coupon
Type: Class

Methods:
- ZonedDateTime getStartDate()
- Coupon$Effective getEffective()
- int getUserLimit()
- BasketType getBasketType()
- Coupon$Discount getDiscount()
- int getMinimum()
- Coupon$Expiry getExpiry()
- String toString()
- int getId()
- String getNote()
- **static** Coupon fromJsonObject(JsonObject)
- String getCode()
- String getUsername()

### Class: io.tebex.sdk.obj.Coupon$Discount
Type: Class

Methods:
- int getValue()
- DiscountType getType()
- String toString()
- double getPercentage()

### Class: io.tebex.sdk.obj.Coupon$Effective
Type: Class

Methods:
- List<Integer> getCategories()
- Coupon$Effective$EffectiveType getType()
- List<Integer> getPackages()
- String toString()

### Class: io.tebex.sdk.obj.Coupon$Effective$EffectiveType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PACKAGE
- CATEGORY

Methods:
- **static** Coupon$Effective$EffectiveType valueOf(String)
- **static** Coupon$Effective$EffectiveType[] values()

### Class: io.tebex.sdk.obj.Coupon$Expiry
Type: Class

Methods:
- int getLimit()
- String toString()
- ZonedDateTime getDate()
- boolean canExpire()
- boolean canRedeemUnlimited()

### Class: io.tebex.sdk.obj.DiscountType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PERCENTAGE
- VALUE

Methods:
- **static** DiscountType valueOf(String)
- **static** DiscountType[] values()

### Class: io.tebex.sdk.obj.Package
Type: Class

Methods:
- boolean doesLimitExpire()
- boolean requiresAnyPackages()
- String getName()
- boolean isVariableGiftcard()
- String getExpiryPeriod()
- List<Integer> getRequiredPackages()
- List<Package$Server> getServers()
- int getId()
- String getItemId()
- boolean canChooseServer()
- String getGlobalLimitPeriod()
- int getExpiryLength()
- boolean canShowUtil()
- boolean isDisabled()
- **static** Package fromJsonObject(JsonObject)
- int getUserLimit()
- boolean canCreateGiftcard()
- boolean isQuantityDisabled()
- Package$Category getCategory()
- String getUserLimitPeriod()
- double getPrice()
- boolean hasCustomPrice()
- String getType()
- String toString()
- String getImage()
- boolean canInheritCommands()
- int getGlobalLimit()

### Class: io.tebex.sdk.obj.Package$Category
Type: Class

Methods:
- String getName()
- String toString()
- int getId()

### Class: io.tebex.sdk.obj.Package$Server
Type: Class

Methods:
- String getName()
- String toString()
- int getId()

### Class: io.tebex.sdk.obj.PlayerLookupInfo
Type: Class

Methods:
- int getChargebackRate()
- int getBanCount()
- PlayerLookupInfo$Player getLookupPlayer()
- List<PlayerLookupInfo$Payment> getPayments()
- **static** PlayerLookupInfo fromJsonObject(JsonObject)
- Map<String, Double> getPurchaseTotals()

### Class: io.tebex.sdk.obj.PlayerLookupInfo$Payment
Type: Class

Methods:
- String getCurrency()
- long getTime()
- String getTxnId()
- int getStatus()
- double getPrice()

### Class: io.tebex.sdk.obj.PlayerLookupInfo$Player
Type: Class

Methods:
- int getPluginUsernameId()
- String getMeta()
- String getId()
- String getUsername()

### Class: io.tebex.sdk.obj.QueuedCommand
Type: Class

Methods:
- QueuedPlayer getPlayer()
- int getDelay()
- String getCommand()
- int getRequiredSlots()
- int getPayment()
- String toString()
- boolean isOnline()
- int getId()
- int getPackageId()
- String getParsedCommand()

### Class: io.tebex.sdk.obj.QueuedPlayer
Type: Class

Methods:
- String getName()
- String getUuid()
- **static** QueuedPlayer fromJson(JsonObject)
- int getId()

### Class: io.tebex.sdk.obj.ServerEvent
Type: Class

Methods:
- String getEventType()
- String getIp()
- String getEventDate()
- String getUuid()
- String toString()
- String getUsername()

### Class: io.tebex.sdk.obj.ServerEventType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- JOIN
- LEAVE

Methods:
- String getName()
- **static** ServerEventType valueOf(String)
- **static** ServerEventType[] values()

### Class: io.tebex.sdk.obj.SubCategory
Type: Class
Implements: io.tebex.sdk.obj.ICategory

Methods:
- Category getParent()
- String getName()
- int getOrder()
- List<CategoryPackage> getPackages()
- String getGuiItem()
- String toString()
- int getId()
- **static** SubCategory fromJsonObject(JsonObject, Category)

## Package: io.tebex.sdk.placeholder

### Class: io.tebex.sdk.placeholder.Placeholder
Type: Interface

Methods:
- String handle(QueuedPlayer, String)

### Class: io.tebex.sdk.placeholder.PlaceholderManager
Type: Class

Methods:
- Pattern getUsernameRegex()
- String handlePlaceholders(QueuedPlayer, String)
- void registerDefaults()
- Pattern getUniqueIdRegex()
- void register(Placeholder)

## Package: io.tebex.sdk.placeholder.defaults

### Class: io.tebex.sdk.placeholder.defaults.NamePlaceholder
Type: Class
Implements: io.tebex.sdk.placeholder.Placeholder

Methods:
- String handle(QueuedPlayer, String)

### Class: io.tebex.sdk.placeholder.defaults.UuidPlaceholder
Type: Class
Implements: io.tebex.sdk.placeholder.Placeholder

Methods:
- String handle(QueuedPlayer, String)

## Package: io.tebex.sdk.platform

### Class: io.tebex.sdk.platform.Platform
Type: Interface

Methods:
- String getStoreType()
- ServerInformation$Store getStore()
- int getVersionNumber()
- void log(Level, String)
- ServerInformation$Server getStoreServer()
- ServerPlatformConfig loadServerPlatformConfig(YamlDocument)
- void error(String)
- void error(String, Throwable)
- SDK getSDK()
- String getServerIp()
- void refreshListings()
- Object getPlayerId(String, UUID)
- void performCheck()
- void performCheck(boolean)
- void setSetup(boolean)
- V processOnlineCommands(String, Object, List<QueuedCommand>)
- boolean isGeyser()
- void warning(String, String)
- void warning(String, String, Throwable)
- int getFreeSlots(Object)
- V deleteCompletedCommands(List<Integer>)
- V setStoreCategories(List<Category>)
- void executeAsync(Runnable)
- PlaceholderManager getPlaceholderManager()
- void info(String)
- boolean isSetup()
- String getVersion()
- boolean isOnlineMode()
- void init()
- void debug(String)
- void executeAsyncLater(Runnable, long, TimeUnit)
- void handleOfflineCommands()
- void configure()
- void handleOnlineCommands(QueuedPlayer)
- CommandResult dispatchCommand(String)
- void halt()
- PlatformTelemetry getTelemetry()
- IPlatformConfig getPlatformConfig()
- ProxyPlatformConfig loadProxyPlatformConfig(YamlDocument)
- boolean isPlayerOnline(Object)
- PlatformType getType()
- void setStoreInfo(ServerInformation)
- void executeBlockingLater(Runnable, long, TimeUnit)
- File getDirectory()
- void executeBlocking(Runnable)
- Map<Object, Integer> getQueuedPlayers()
- YamlDocument initPlatformConfig() throws IOException

### Class: io.tebex.sdk.platform.PlatformTelemetry
Type: Class

Methods:
- boolean isOnlineMode()
- String getServerSoftware()
- String getSystemArch()
- String getJavaVersion()
- String getServerVersion()
- String getPluginVersion()
- String toString()

### Class: io.tebex.sdk.platform.PlatformType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BUKKIT
- BUNGEECORD
- VELOCITY
- FABRIC

Methods:
- **static** PlatformType valueOf(String)
- **static** PlatformType[] values()

## Package: io.tebex.sdk.platform.config

### Class: io.tebex.sdk.platform.config.IPlatformConfig
Type: Interface

Methods:
- String getSecretKey()
- int getConfigVersion()
- YamlDocument getYamlDocument()
- boolean isVerbose()
- boolean isAutoReportEnabled()

### Class: io.tebex.sdk.platform.config.ProxyPlatformConfig
Type: Class
Implements: io.tebex.sdk.platform.config.IPlatformConfig

Methods:
- String getSecretKey()
- void setYamlDocument(YamlDocument)
- void setSecretKey(String)
- int getConfigVersion()
- YamlDocument getYamlDocument()
- boolean isVerbose()
- String toString()
- void setAutoReportEnabled(boolean)
- void setVerbose(boolean)
- boolean isAutoReportEnabled()

### Class: io.tebex.sdk.platform.config.ServerPlatformConfig
Type: Class
Implements: io.tebex.sdk.platform.config.IPlatformConfig

Methods:
- String getSecretKey()
- void setSecretKey(String)
- String getBuyCommandName()
- boolean isCheckForUpdates()
- boolean isVerbose()
- void setCheckForUpdates(boolean)
- void setVerbose(boolean)
- void setBuyCommandName(String)
- void setYamlDocument(YamlDocument)
- void setProxyMode(boolean)
- int getConfigVersion()
- void setBuyCommandEnabled(boolean)
- YamlDocument getYamlDocument()
- String toString()
- void setAutoReportEnabled(boolean)
- boolean isProxyMode()
- boolean isAutoReportEnabled()
- boolean isBuyCommandEnabled()

## Package: io.tebex.sdk.request

### Class: io.tebex.sdk.request.TebexRequest
Type: Class

Methods:
- TebexRequest withSecretKey(String)
- CompletableFuture<Response> sendAsync()
- Call build()
- **static** void shutdownNow()
- TebexRequest withHeader(String, String)
- Response send() throws IOException
- TebexRequest delete()
- TebexRequest withBody(String)
- TebexRequest withBody(String, String)

## Package: io.tebex.sdk.request.builder

### Class: io.tebex.sdk.request.builder.CreateCouponRequest
Type: Class

Methods:
- LocalDate getStartDate()
- void setUsername(String)
- BasketType getBasketType()
- LocalDate getExpiryDate()
- DiscountType getDiscountType()
- void setCanExpire(boolean)
- String getNote()
- boolean canExpire()
- List<Integer> getEffectiveIds()
- CreateCouponRequest$DiscountMethod getDiscountMethod()
- void setDiscountMethod(CreateCouponRequest$DiscountMethod)
- boolean canRedeemUnlimited()
- String getUsername()
- void setUnlimitedRedeems(boolean)
- void setExpiryDate(LocalDate)
- void setExpiryLimit(int)
- void setMinimumBasketValue(int)
- int getDiscountValue()
- int getExpiryLimit()
- int getMinimum()
- CreateCouponRequest$EffectiveOn getEffectiveOn()
- void setNote(String)
- String getCode()

### Class: io.tebex.sdk.request.builder.CreateCouponRequest$DiscountMethod
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- EACH_PACKAGE
- BASKET_BEFORE_SALES
- BASKET_AFTER_SALES

Methods:
- int getValue()
- **static** CreateCouponRequest$DiscountMethod valueOf(String)
- **static** CreateCouponRequest$DiscountMethod[] values()

### Class: io.tebex.sdk.request.builder.CreateCouponRequest$EffectiveOn
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PACKAGE
- CATEGORY
- CART

Methods:
- **static** CreateCouponRequest$EffectiveOn valueOf(String)
- **static** CreateCouponRequest$EffectiveOn[] values()

## Package: io.tebex.sdk.request.interceptor

### Class: io.tebex.sdk.request.interceptor.LoggingInterceptor
Type: Class
Implements: io.tebex.plugin.libs.okhttp3.Interceptor

Methods:
- Response intercept(Interceptor$Chain) throws IOException

## Package: io.tebex.sdk.request.response

### Class: io.tebex.sdk.request.response.DuePlayersResponse
Type: Class

Methods:
- int getNextCheck()
- boolean canExecuteOffline()
- boolean isMore()
- List<QueuedPlayer> getPlayers()

### Class: io.tebex.sdk.request.response.OfflineCommandsResponse
Type: Class

Methods:
- boolean isLimited()
- List<QueuedCommand> getCommands()

### Class: io.tebex.sdk.request.response.PaginatedResponse
Type: Class

Methods:
- Pagination getPagination()
- String toString()
- List<TT> getData()

### Class: io.tebex.sdk.request.response.ServerInformation
Type: Class

Methods:
- ServerInformation$Server getServer()
- ServerInformation$Store getStore()

### Class: io.tebex.sdk.request.response.ServerInformation$Server
Type: Class

Methods:
- String getName()
- int getId()

### Class: io.tebex.sdk.request.response.ServerInformation$Store
Type: Class

Methods:
- boolean isOnlineMode()
- String getDomain()
- ServerInformation$Store$Currency getCurrency()
- String getName()
- String getGameType()
- int getId()
- boolean isLogEvents()

### Class: io.tebex.sdk.request.response.ServerInformation$Store$Currency
Type: Class

Methods:
- String getSymbol()
- String getIso4217()

## Package: io.tebex.sdk.triage

### Class: io.tebex.sdk.triage.EnumEventLevel
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- WARNING
- ERROR
- INFO

Methods:
- **static** EnumEventLevel valueOf(String)
- **static** EnumEventLevel[] values()

### Class: io.tebex.sdk.triage.PluginEvent
Type: Class

Methods:
- PluginEvent onStore(ServerInformation$Store)
- PluginEvent withTrace(String)
- PluginEvent withTrace(Throwable)
- PluginEvent withTrace()
- PluginEvent onServer(ServerInformation$Server)
- String toJsonString()

## Package: io.tebex.sdk.util

### Class: io.tebex.sdk.util.CommandResult
Type: Class

Methods:
- boolean getIsSuccess()
- Throwable getException()
- CommandResult withException(Throwable)
- String getMessage()
- **static** CommandResult from(boolean)
- CommandResult withMessage(String)

### Class: io.tebex.sdk.util.GsonUtil
Type: Class

Methods:
- **static** List<Integer> arrayToList(JsonArray)

### Class: io.tebex.sdk.util.Pagination
Type: Class

Methods:
- String getPrevious()
- int getLastPage()
- int getCurrentPage()
- boolean hasPrevious()
- String toString()
- boolean hasNext()
- String getNext()
- int getTotalResults()
- **static** Pagination fromJsonObject(JsonObject)

### Class: io.tebex.sdk.util.ResourceUtil
Type: Class

Methods:
- **static** File getBundledFile(Platform, File, String)

### Class: io.tebex.sdk.util.StringUtil
Type: Class

Methods:
- **static** boolean isTruthy(String)
- **static** ZonedDateTime toModernDate(String)
- **static** ZonedDateTime toLegacyDate(String)
- **static** String pluralise(int, String, String)
- **static** String pluralise(int, String)
- **static** boolean isFalsy(String)

### Class: io.tebex.sdk.util.UUIDUtil
Type: Class

Methods:
- **static** UUID mojangIdToJavaId(String)

