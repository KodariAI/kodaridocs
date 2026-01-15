# Skript-2.13.2 API Reference

## Package: ch.njol.skript

### Class: ch.njol.skript.ScriptLoader$LoaderEvent
Type: Interface
Implements: org.skriptlang.skript.util.event.Event

No public methods found

### Class: ch.njol.skript.ScriptLoader$ScriptInitEvent
Type: Interface
Implements: ch.njol.skript.ScriptLoader$LoaderEvent

Methods:
- void onInit(Script)

### Class: ch.njol.skript.ScriptLoader$ScriptLoadEvent
Type: Interface
Implements: ch.njol.skript.ScriptLoader$LoaderEvent, org.skriptlang.skript.lang.script.Script$Event

Methods:
- void onLoad(ParserInstance, Script)

### Class: ch.njol.skript.ScriptLoader$ScriptPreInitEvent
Type: Interface
Implements: ch.njol.skript.ScriptLoader$LoaderEvent

Methods:
- V onPreInit(Collection<Config>)

### Class: ch.njol.skript.ScriptLoader$ScriptUnloadEvent
Type: Interface
Implements: ch.njol.skript.ScriptLoader$LoaderEvent, org.skriptlang.skript.lang.script.Script$Event

Methods:
- void onUnload(ParserInstance, Script)

### Class: ch.njol.skript.SkriptConfig$Event
Type: Interface
Implements: org.skriptlang.skript.util.event.Event

No public methods found

### Class: ch.njol.skript.SkriptConfig$ReloadEvent
Type: Interface
Implements: ch.njol.skript.SkriptConfig$Event

Methods:
- void onReload()

### Class: ch.njol.skript.ModernSkriptBridge$SpecialUnmodifiableSkript
Type: Class
Implements: org.skriptlang.skript.Skript

Constructors:
- ModernSkriptBridge$SpecialUnmodifiableSkript(Skript skript)

Methods:
- TR registry(Class<TR> registryClass)
- TR registry(Class<TR> registryClass, Supplier<TR> putIfAbsent)
- V storeRegistry(Class<TR> registryClass, T registry)
- V removeRegistry(Class<Registry<*>> registryClass)
- SyntaxRegistry syntaxRegistry()
- SkriptAddon registerAddon(Class<*> source, String name)
- Collection<SkriptAddon> addons()
- Z hasRegistry(Class<Registry<*>> registryClass)
- String name()
- Localizer localizer()
- Class<*> source()

### Class: ch.njol.skript.PatcherTool
Type: Class

Methods:
- **static** void main(String[] args) throws IOException, URISyntaxException

### Class: ch.njol.skript.ScriptLoader
Type: Class

Methods:
- **static** CompletableFuture<ScriptLoader$ScriptInfo> loadScripts(File file, OpenCloseable openCloseable)
- **static** CompletableFuture<ScriptLoader$ScriptInfo> loadScripts(Set<File> files, OpenCloseable openCloseable)
- **static** EventRegistry<ScriptLoader$LoaderEvent> eventRegistry()
- **static** String replaceOptions(String string)
- **static** ScriptLoader$ScriptInfo unloadScript(Script script)
- **static** ArrayList<TriggerItem> loadItems(SectionNode node)
- **static** boolean isAsync()
- **static** Executor getExecutor()
- **static** Set<Script> getLoadedScripts()
- **static** CompletableFuture<ScriptLoader$ScriptInfo> reloadScript(Script script, OpenCloseable openCloseable)
- **static** File getScriptFromName(String script)
- **static** File getScriptFromName(String script, File directory)
- **static** FileFilter getLoadedScriptsFilter()
- **static** Set<File> getDisabledScripts()
- **static** Script createDummyScript(String name, File file)
- **static** ScriptLoader$ScriptInfo unloadScripts(Set<Script> scripts)
- **static** Set<Script> getScripts(File directory)
- **static** FileFilter getDisabledScriptsFilter()
- **static** boolean isParallel()
- **static** CompletableFuture<ScriptLoader$ScriptInfo> reloadScripts(Set<Script> scripts, OpenCloseable openCloseable)
- **static** void setAsyncLoaderSize(int size) throws IllegalStateException
- **static** Script getScript(File file)

### Class: ch.njol.skript.ScriptLoader$ScriptInfo
Type: Class

Constructors:
- ScriptLoader$ScriptInfo(int files, int structures)
- ScriptLoader$ScriptInfo(ScriptLoader$ScriptInfo files)

Methods:
- void add(ScriptLoader$ScriptInfo other)
- void subtract(ScriptLoader$ScriptInfo other)
- String toString()

### Class: ch.njol.skript.ServerPlatform
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BUKKIT_UNKNOWN
- BUKKIT_CRAFTBUKKIT
- BUKKIT_SPIGOT
- BUKKIT_PAPER
- BUKKIT_GLOWSTONE
- SPONGE

Methods:
- **static** ServerPlatform valueOf(String name)
- **static** ServerPlatform[] values()

### Class: ch.njol.skript.Skript
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin
Implements: org.bukkit.event.Listener

Methods:
- **static** EmptyStacktraceException exception(String[] info)
- **static** EmptyStacktraceException exception(Throwable cause, String[] info)
- **static** EmptyStacktraceException exception(Throwable cause, Thread thread, String[] info)
- **static** EmptyStacktraceException exception(Throwable cause, TriggerItem item, String[] info)
- **static** EmptyStacktraceException exception(Throwable cause, Thread thread, TriggerItem item, String[] info)
- **static** Skript instance()
- **static** SkriptEventInfo<TE> registerEvent(String name, Class<TE> c, Class<Event> event, String patterns)
- **static** SkriptEventInfo<TE> registerEvent(String name, Class<TE> eventClass, Class<Event> events, String patterns)
- **static** boolean classExists(String className)
- **static** void closeOnDisable(Closeable closeable)
- **static** Collection<SkriptEventInfo<*>> getEvents()
- **static** Z methodExists(Class<*> c, String methodName, Class<*> parameterTypes)
- **static** Z methodExists(Class<*> c, String methodName, Class<*> parameterTypes, Class<*> returnType)
- **static** RuntimeErrorManager getRuntimeErrorManager()
- **static** void adminBroadcast(String message)
- **static** void warning(String warning)
- void onPluginDisable(PluginDisableEvent event)
- **static** String getRestartMessage()
- **static** void info(String info)
- **static** void info(CommandSender sender, String info)
- **static** List<StructureInfo<Structure>> getStructures()
- **static** boolean isFinishedLoadingHooks()
- **static** SkriptAddon registerAddon(JavaPlugin plugin)
- **static** boolean testing()
- **static** Version getMinecraftVersion()
- **static** SkriptAddon getAddon(JavaPlugin plugin)
- **static** SkriptAddon getAddon(String name)
- **static** Collection<SyntaxElementInfo<Effect>> getEffects()
- **static** V registerEffect(Class<TE> effectClass, String patterns) throws IllegalArgumentException
- **static** SyntaxOrigin getSyntaxOrigin(Class<*> source)
- **static** Collection<SyntaxElementInfo<Statement>> getStatements()
- **static** boolean isRunningMinecraft(int major, int minor)
- **static** boolean isRunningMinecraft(int major, int minor, int revision)
- **static** boolean isRunningMinecraft(Version v)
- **static** ServerPlatform getServerPlatform()
- **static** String getWarningMessage()
- **static** V registerSimpleStructure(Class<TE> structureClass, String patterns)
- **static** void broadcast(String message, String permission)
- **static** Z fieldExists(Class<*> c, String fieldName)
- **static** Thread newThread(Runnable r, String name)
- **static** void outdatedError()
- **static** void outdatedError(Exception e)
- **static** boolean log(Verbosity minVerb)
- **static** boolean logNormal()
- **static** void checkAcceptRegistrations()
- **static** void markErrored()
- SkriptUpdater getUpdater()
- **static** ExperimentRegistry experiments()
- **static** Metrics getMetrics()
- void onEnable()
- **static** void error(String error)
- **static** void error(String message, Object[] objects)
- **static** void error(String error, ErrorQuality quality)
- **static** void error(CommandSender sender, String error)
- void onDisable()
- **static** SkriptAddon getAddonInstance()
- **static** Z isHookEnabled(Class<Hook<*>> hook)
- **static** String getSkriptPrefix()
- **static** boolean isAcceptRegistrations()
- **static** V registerStructure(Class<TE> structureClass, String patterns)
- **static** V registerStructure(Class<TE> structureClass, EntryValidator entryValidator, String patterns)
- **static** V registerStructure(Class<TE> structureClass, EntryValidator entryValidator, DefaultSyntaxInfos$Structure$NodeType nodeType, String patterns)
- **static** boolean logHigh()
- **static** Version getVersion()
- **static** boolean debug()
- **static** void debug(String info)
- **static** void debug(String message, Object[] objects)
- **static** Collection<SkriptAddon> getAddons()
- **static** Iterator<ExpressionInfo<**>> getExpressions()
- **static** Iterator<ExpressionInfo<**>> getExpressions(Class<*> returnTypes)
- **static** Collection<SyntaxElementInfo<Condition>> getConditions()
- **static** void message(CommandSender sender, String info)
- **static** boolean isRunningCraftBukkit()
- File getScriptsFolder()
- **static** V registerCondition(Class<TE> conditionClass, String patterns) throws IllegalArgumentException
- **static** V registerCondition(Class<TE> conditionClass, Condition$ConditionType type, String patterns) throws IllegalArgumentException
- **static** void updateMinecraftVersion()
- **static** boolean dispatchCommand(CommandSender sender, String command)
- **static** boolean logVeryHigh()
- **static** V disableHookRegistration(Class<Hook<*>> hooks)
- **static** V registerSection(Class<TE> sectionClass, String patterns) throws IllegalArgumentException
- **static** String toString(double n)
- **static** Skript getInstance()
- **static** V registerExpression(Class<TE> expressionClass, Class<TT> returnType, ExpressionType type, String patterns) throws IllegalArgumentException
- **static** Collection<SyntaxElementInfo<Section>> getSections()

### Class: ch.njol.skript.SkriptAPIException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- SkriptAPIException(String message)
- SkriptAPIException(String message, Throwable cause)

Methods:
- **static** V inaccessibleConstructor(Class<*> c, IllegalAccessException e) throws SkriptAPIException
- **static** V instantiationException(Class<*> c, InstantiationException e) throws SkriptAPIException
- **static** V instantiationException(String desc, Class<*> c, InstantiationException e) throws SkriptAPIException

### Class: ch.njol.skript.SkriptAddon
Type: Class
Implements: org.skriptlang.skript.addon.SkriptAddon

Methods:
- TR registry(Class<TR> registryClass)
- TR registry(Class<TR> registryClass, Supplier<TR> putIfAbsent)
- String getName()
- SyntaxRegistry syntaxRegistry()
- Z hasRegistry(Class<Registry<*>> registryClass)
- Class<*> source()
- File getFile()
- SkriptAddon loadClasses(String basePackage, String[] subPackages) throws IOException
- V storeRegistry(Class<TR> registryClass, T registry)
- V removeRegistry(Class<Registry<*>> registryClass)
- String getLanguageFileDirectory()
- String name()
- Localizer localizer()
- String toString()
- SkriptAddon setLanguageFileDirectory(String directory)

### Class: ch.njol.skript.SkriptCommand
Type: Class
Implements: org.bukkit.command.CommandExecutor

Methods:
- boolean onCommand(CommandSender sender, Command command, String label, String[] args)
- **static** File getScriptFromName(String script)

### Class: ch.njol.skript.SkriptCommandTabCompleter
Type: Class
Implements: org.bukkit.command.TabCompleter

Methods:
- List<String> onTabComplete(CommandSender sender, Command command, String alias, String args)

### Class: ch.njol.skript.SkriptConfig
Type: Class

Methods:
- **static** String formatDate(long timestamp)
- **static** EventRegistry<SkriptConfig$Event> eventRegistry()
- **static** Config getConfig()

### Class: ch.njol.skript.SkriptEventHandler
Type: Class

Methods:
- **static** V registerBukkitEvent(Trigger trigger, Class<Event> event)
- **static** V registerBukkitEvents(Trigger trigger, Class<Event> events)
- **static** void unregisterBukkitEvents(Trigger trigger)
- **static** void logTriggerStart(Trigger trigger)
- **static** void addSelfRegisteringTrigger(Trigger t)
- **static** void logEventStart(Event event)
- **static** void logEventStart(Event event, EventPriority priority)
- **static** void logEventEnd()
- **static** void logTriggerEnd(Trigger t)

### Class: ch.njol.skript.SkriptEventHandler$PriorityListener
Type: Class
Implements: org.bukkit.event.Listener

Constructors:
- SkriptEventHandler$PriorityListener(EventPriority priority)

No public methods found

### Class: ch.njol.skript.SkriptUpdater
Type: Class
Extends: ch.njol.skript.update.Updater

Methods:
- CompletableFuture<Void> changesCheck(CommandSender sender)
- CompletableFuture<Void> updateCheck(CommandSender sender)

## Package: ch.njol.skript.aliases

### Class: ch.njol.skript.aliases.Aliases
Type: Abstract Class

Methods:
- **static** ItemType parseItemType(String s)
- **static** AliasesProvider getAddonProvider(SkriptAddon addon)
- **static** ItemType javaItemType(String name)
- **static** void clear()
- **static** ScriptAliases getScriptAliases(Script script)
- **static** int getGender(ItemData item)
- **static** void loadDirectory(Path dir) throws IOException
- **static** EntityData<*> getRelatedEntity(ItemData data)
- **static** ScriptAliases createScriptAliases(Script script)
- **static** void load()
- **static** void load(Path f) throws IOException
- **static** void load(Config config)
- **static** CompletableFuture<Boolean> loadAsync()
- **static** String getMaterialName(ItemData type, boolean plural)
- **static** String getMinecraftId(ItemData data)
- **static** ItemType parseAlias(String s)

### Class: ch.njol.skript.aliases.AliasesMap
Type: Class

Methods:
- AliasesMap$Match exactMatch(ItemData item)
- void addAlias(AliasesMap$AliasData data)
- void clear()
- AliasesMap$Match matchAlias(ItemData item)

### Class: ch.njol.skript.aliases.AliasesMap$AliasData
Type: Class

Constructors:
- AliasesMap$AliasData(ItemData item, MaterialName name, String minecraftId, EntityData<*> relatedEntity)

Methods:
- EntityData<*> getRelatedEntity()
- MaterialName getName()
- ItemData getItem()
- String getMinecraftId()

### Class: ch.njol.skript.aliases.AliasesMap$Match
Type: Class

Constructors:
- AliasesMap$Match(MatchQuality quality, AliasesMap$AliasData data)

Methods:
- MatchQuality getQuality()
- AliasesMap$AliasData getData()

### Class: ch.njol.skript.aliases.AliasesParser
Type: Class

Constructors:
- AliasesParser(AliasesProvider provider)

Methods:
- void load(SectionNode root)
- V registerCondition(String name, Function<String, Boolean> condition)

### Class: ch.njol.skript.aliases.AliasesParser$PatternSlot
Type: Class

Constructors:
- AliasesParser$PatternSlot(String content)

No public methods found

### Class: ch.njol.skript.aliases.AliasesParser$VariationSlot
Type: Class
Extends: ch.njol.skript.aliases.AliasesParser$PatternSlot

Constructors:
- AliasesParser$VariationSlot(AliasesProvider$VariationGroup vars)

Methods:
- String getName()
- AliasesProvider$Variation getVariation()
- boolean increment()

### Class: ch.njol.skript.aliases.AliasesProvider
Type: Class

Constructors:
- AliasesProvider(int aliases, AliasesProvider parent)

Methods:
- void clearAliases()
- I applyTags(ItemStack stack, Map<String, Object> tags)
- EntityData<*> getRelatedEntity(ItemData item)
- boolean hasAliasForMaterial(Material material)
- V addAlias(AliasesProvider$AliasName name, String id, Map<String, Object> tags, Map<String, String> blockStates)
- AliasesMap$AliasData getAliasData(ItemData item)
- void addVariationGroup(String name, AliasesProvider$VariationGroup group)
- int getAliasCount()
- AliasesProvider$VariationGroup getVariationGroup(String name)
- MaterialName getMaterialName(ItemData item)
- ItemType getAlias(String alias)
- Map<String, Object> parseMojangson(String raw)
- String getMinecraftId(ItemData item)

### Class: ch.njol.skript.aliases.AliasesProvider$AliasName
Type: Class

Constructors:
- AliasesProvider$AliasName(String singular, String plural, int gender)

No public methods found

### Class: ch.njol.skript.aliases.AliasesProvider$Variation
Type: Class

Constructors:
- AliasesProvider$Variation(String id, int insertPoint, Map<String, Object> tags, Map<String, String> states)

Methods:
- Map<String, String> getBlockStates()
- AliasesProvider$Variation merge(AliasesProvider$Variation other)
- Map<String, Object> getTags()
- String getId()
- int getInsertPoint()
- String insertId(String inserted)

### Class: ch.njol.skript.aliases.AliasesProvider$VariationGroup
Type: Class

Methods:
- void put(String key, AliasesProvider$Variation value)

### Class: ch.njol.skript.aliases.InvalidMinecraftIdException
Type: Class
Extends: java.lang.IllegalArgumentException

Constructors:
- InvalidMinecraftIdException(String id)

Methods:
- String getId()

### Class: ch.njol.skript.aliases.ItemData
Type: Class
Implements: java.lang.Cloneable, ch.njol.yggdrasil.YggdrasilSerializable$YggdrasilExtendedSerializable

Constructors:
- ItemData(Material type, String tags)
- ItemData(Material type, int stack)
- ItemData(Material type)
- ItemData(ItemData stack)
- ItemData(Material type, BlockValues blockValues)
- ItemData(ItemStack stack, BlockValues blockValues)
- ItemData(ItemStack itemForm)
- ItemData(BlockState blockState)
- ItemData(BlockData type)
- ItemData(Block block)

Methods:
- void applyTags(String tags)
- void setPlain(boolean plain)
- void setItemMeta(ItemMeta meta)
- boolean isPlain()
- boolean isOfType(ItemStack item)
- ItemMeta getItemMeta()
- MatchQuality matchAlias(ItemData item)
- int getGender()
- int getDurability()
- Fields serialize() throws NotSerializableException
- boolean isDefault()
- ItemData aliasCopy()
- boolean matchPlain(ItemData other)
- boolean isAlias()
- Material getType()
- int hashCode()
- ItemData intersection(ItemData other)
- boolean equals(Object obj)
- void setDurability(int durability)
- ItemData clone()
- Object clone() throws CloneNotSupportedException
- ItemStack getStack()
- String toString()
- String toString(boolean debug, boolean plural)
- BlockValues getBlockValues()
- void deserialize(Fields fields) throws StreamCorruptedException, NotSerializableException

### Class: ch.njol.skript.aliases.ItemData$OldItemData
Type: Class

No public methods found

### Class: ch.njol.skript.aliases.ItemFlags
Type: Class

No public methods found

### Class: ch.njol.skript.aliases.ItemType
Type: Class
Implements: ch.njol.skript.lang.Unit, java.lang.Iterable, ch.njol.skript.util.Container, ch.njol.yggdrasil.YggdrasilSerializable$YggdrasilExtendedSerializable, ch.njol.skript.lang.util.common.AnyNamed, ch.njol.skript.lang.util.common.AnyAmount

Constructors:
- ItemType(Material id)
- ItemType(Material[] ids)
- ItemType(Tag<Material> tag)
- ItemType(Material id, String tags)
- ItemType(ItemData d)
- ItemType(ItemStack amount)
- ItemType(BlockState blockState)
- ItemType(BlockData blockData)
- ItemType(Block block)

Methods:
- void setItemMeta(ItemMeta meta)
- **static** ItemStack[] getCopiedContents(Inventory invi)
- boolean setBlock(Block block, boolean applyPhysics)
- ItemType getItem()
- void clearItemMeta()
- List<String> getRawNames()
- boolean hasEnchantmentsOrWorse(EnchantmentType[] enchantments)
- boolean hasEnchantmentsOrWorse(boolean all, EnchantmentType[] enchantments)
- Iterator<ItemData> iterator()
- ItemStack removeAll(ItemStack item)
- boolean removeAll(Inventory invi)
- Z removeAll(List<ItemStack> lists)
- Z removeAll(boolean replaceWithNull, List<ItemStack> lists)
- ItemStack getRandom()
- boolean hasEnchantments()
- boolean hasEnchantments(Enchantment[] enchantments)
- boolean hasEnchantments(EnchantmentType[] enchantments)
- boolean hasEnchantments(boolean all, EnchantmentType[] enchantments)
- ItemType intersection(ItemType other)
- EnchantmentType getEnchantmentType(Enchantment enchantment)
- String getDebugMessage()
- void modified()
- void sendBlockChange(Player player, Location location)
- ItemType getBaseType()
- int getAmount()
- void add(ItemData type)
- void removeEnchantments(EnchantmentType[] enchantments)
- boolean supportsAmountChange()
- boolean isOfType(ItemStack item)
- boolean isOfType(BlockState blockState)
- boolean isOfType(BlockData blockData)
- boolean isOfType(Block block)
- boolean isOfType(ItemData type)
- boolean isOfType(Material id, String tags)
- boolean isOfType(Material id)
- ItemMeta getItemMeta()
- Object getRandomStackOrMaterial()
- int getInternalAmount()
- Material getMaterial()
- Fields serialize() throws NotSerializableException
- boolean hasSpace(Inventory invi)
- String name()
- Z isContainedIn(Iterable<ItemStack> items)
- boolean isContainedIn(ItemStack[] items)
- ItemStack removeFrom(ItemStack item)
- boolean removeFrom(Inventory invi)
- Z removeFrom(List<ItemStack> lists)
- Z removeFrom(boolean replaceWithNull, List<ItemStack> lists)
- boolean isSupertypeOf(ItemType other)
- void setName(String name)
- int numTypes()
- boolean hasEnchantmentsOrBetter(EnchantmentType[] enchantments)
- boolean hasEnchantmentsOrBetter(boolean all, EnchantmentType[] enchantments)
- EnchantmentType[] getEnchantmentTypes()
- boolean hasExactEnchantments(EnchantmentType[] enchantments)
- boolean hasExactEnchantments(boolean all, EnchantmentType[] enchantments)
- boolean supportsNameChange()
- Iterator<ItemStack> containerIterator()
- boolean hasItem()
- Material getBlockMaterial()
- void remove(ItemData type)
- Z satisfies(Predicate<ItemStack> predicate)
- int hashCode()
- boolean hasBlock()
- void setAmount(double amount)
- void setAmount(int amount)
- void setAmount(Number amount) throws UnsupportedOperationException
- boolean isSimilar(ItemType other)
- void setAll(boolean all)
- void deserialize(Fields fields) throws StreamCorruptedException, NotSerializableException
- void clearEnchantments()
- Number amount()
- ItemType getBlock()
- Iterable<ItemStack> getAll()
- **static** ItemStack[] getStorageContents(Inventory inventory)
- **static** boolean isSubset(ItemType[] set, ItemType[] sub)
- boolean isAll()
- int numItems()
- Material[] getMaterials()
- Map<Enchantment, Integer> getEnchantments()
- V addEnchantments(Map<Enchantment, Integer> enchantments)
- void addEnchantments(EnchantmentType[] enchantments)
- V addAll(Collection<ItemData> types)
- boolean equals(Object obj)
- ItemType clone()
- Object clone() throws CloneNotSupportedException
- Unit clone()
- ItemStack addTo(ItemStack item)
- V addTo(List<ItemStack> list)
- boolean addTo(Inventory inventory)
- boolean addTo(ItemStack[] buf)
- void setTo(ItemType i)
- String toString()
- String toString(int flags)
- String toString(int flags, Adjective a)
- **static** String toString(ItemStack i)
- **static** String toString(ItemStack i, int flags)
- **static** String toString(Block b, int flags)
- List<ItemData> getTypes()
- boolean hasAnyEnchantments(Enchantment[] enchantments)
- boolean hasType()

### Class: ch.njol.skript.aliases.MatchQuality
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- EXACT
- SAME_ITEM
- SAME_MATERIAL
- DIFFERENT

Methods:
- boolean isAtLeast(MatchQuality another)
- **static** MatchQuality valueOf(String name)
- boolean isBetter(MatchQuality another)
- **static** MatchQuality[] values()

### Class: ch.njol.skript.aliases.ScriptAliases
Type: Class
Implements: org.skriptlang.skript.lang.script.ScriptData

No public methods found

## Package: ch.njol.skript.bstats

### Class: ch.njol.skript.bstats.MetricsBase
Type: Class

Constructors:
- MetricsBase(String platform, String serverUuid, int serviceId, boolean enabled, Consumer<JsonObjectBuilder> appendPlatformDataConsumer, Consumer<JsonObjectBuilder> appendServiceDataConsumer, Consumer<Runnable> submitTaskConsumer, Supplier<Boolean> checkServiceEnabledSupplier, BiConsumer<String, Throwable> errorLogger, Consumer<String> infoLogger, boolean logErrors, boolean logSentData, boolean logResponseStatusText, boolean skipRelocateCheck)

Methods:
- void shutdown()
- void addCustomChart(CustomChart chart)

## Package: ch.njol.skript.bstats.bukkit

### Class: ch.njol.skript.bstats.bukkit.Metrics
Type: Class

Constructors:
- Metrics(Plugin plugin, int serviceId)

Methods:
- void shutdown()
- void addCustomChart(CustomChart chart)

## Package: ch.njol.skript.bstats.charts

### Class: ch.njol.skript.bstats.charts.AdvancedBarChart
Type: Class
Extends: ch.njol.skript.bstats.charts.CustomChart

Constructors:
- AdvancedBarChart(String chartId, Callable<Map<String, [I>> callable)

No public methods found

### Class: ch.njol.skript.bstats.charts.AdvancedPie
Type: Class
Extends: ch.njol.skript.bstats.charts.CustomChart

Constructors:
- AdvancedPie(String chartId, Callable<Map<String, Integer>> callable)

No public methods found

### Class: ch.njol.skript.bstats.charts.CustomChart
Type: Abstract Class

Methods:
- JsonObjectBuilder$JsonObject getRequestJsonObject(BiConsumer<String, Throwable> errorLogger, boolean logErrors)

### Class: ch.njol.skript.bstats.charts.DrilldownPie
Type: Class
Extends: ch.njol.skript.bstats.charts.CustomChart

Constructors:
- DrilldownPie(String chartId, Callable<Map<String, Map<String, Integer>>> callable)

Methods:
- JsonObjectBuilder$JsonObject getChartData() throws Exception

### Class: ch.njol.skript.bstats.charts.MultiLineChart
Type: Class
Extends: ch.njol.skript.bstats.charts.CustomChart

Constructors:
- MultiLineChart(String chartId, Callable<Map<String, Integer>> callable)

No public methods found

### Class: ch.njol.skript.bstats.charts.SimpleBarChart
Type: Class
Extends: ch.njol.skript.bstats.charts.CustomChart

Constructors:
- SimpleBarChart(String chartId, Callable<Map<String, Integer>> callable)

No public methods found

### Class: ch.njol.skript.bstats.charts.SimplePie
Type: Class
Extends: ch.njol.skript.bstats.charts.CustomChart

Constructors:
- SimplePie(String chartId, Callable<String> callable)

No public methods found

### Class: ch.njol.skript.bstats.charts.SingleLineChart
Type: Class
Extends: ch.njol.skript.bstats.charts.CustomChart

Constructors:
- SingleLineChart(String chartId, Callable<Integer> callable)

No public methods found

## Package: ch.njol.skript.bstats.config

### Class: ch.njol.skript.bstats.config.MetricsConfig
Type: Class

Constructors:
- MetricsConfig(File file, boolean defaultEnabled) throws IOException

Methods:
- boolean isLogResponseStatusTextEnabled()
- boolean isLogSentDataEnabled()
- boolean didExistBefore()
- boolean isEnabled()
- boolean isLogErrorsEnabled()
- String getServerUUID()

## Package: ch.njol.skript.bstats.json

### Class: ch.njol.skript.bstats.json.JsonObjectBuilder
Type: Class

Methods:
- JsonObjectBuilder$JsonObject build()
- JsonObjectBuilder appendNull(String key)
- JsonObjectBuilder appendField(String key, String value)
- JsonObjectBuilder appendField(String key, int value)
- JsonObjectBuilder appendField(String key, JsonObjectBuilder$JsonObject object)
- JsonObjectBuilder appendField(String key, String[] values)
- JsonObjectBuilder appendField(String key, int[] values)
- JsonObjectBuilder appendField(String key, JsonObjectBuilder$JsonObject[] values)

### Class: ch.njol.skript.bstats.json.JsonObjectBuilder$JsonObject
Type: Class

Methods:
- String toString()

## Package: ch.njol.skript.bukkitutil

### Class: ch.njol.skript.bukkitutil.BukkitUnsafe
Type: Class

Methods:
- **static** Material getMaterialFromNamespacedId(String id)
- **static** Material getMaterialFromMinecraftId(String id)
- **static** void modifyItemStack(ItemStack stack, String arguments)
- **static** Material getMaterialFromId(int id)

### Class: ch.njol.skript.bukkitutil.BukkitUtils
Type: Class

Methods:
- **static** Registry<PotionEffectType> getPotionEffectTypeRegistry()
- **static** Integer getEquipmentSlotIndex(EquipmentSlot equipmentSlot)
- **static** RegistryClassInfo<*> getRegistryClassInfo(String classPath, String registryName, String codeName, String languageNode)
- **static** boolean registryExists(String registry)
- **static** EquipmentSlot getEquipmentSlotFromIndex(int slotIndex)

### Class: ch.njol.skript.bukkitutil.BurgerHelper
Type: Class

Constructors:
- BurgerHelper(String burger)

Methods:
- **static** Map<Integer, Material> mapIds()
- Map<String, Material> mapMaterials()

### Class: ch.njol.skript.bukkitutil.BurgerHelper$Blocks
Type: Class

No public methods found

### Class: ch.njol.skript.bukkitutil.BurgerHelper$Burger
Type: Class

No public methods found

### Class: ch.njol.skript.bukkitutil.BurgerHelper$ItemOrBlock
Type: Class

No public methods found

### Class: ch.njol.skript.bukkitutil.BurgerHelper$Items
Type: Class

No public methods found

### Class: ch.njol.skript.bukkitutil.BurgerHelper$Source
Type: Class

No public methods found

### Class: ch.njol.skript.bukkitutil.ClickEventTracker
Type: Class

Constructors:
- ClickEventTracker(JavaPlugin plugin)

Methods:
- void eventModified(Cancellable event)
- boolean checkEvent(Player player, Cancellable event, EquipmentSlot hand)

### Class: ch.njol.skript.bukkitutil.CommandReloader
Type: Class

Methods:
- **static** boolean syncCommands(Server server)

### Class: ch.njol.skript.bukkitutil.DamageUtils
Type: Class

Methods:
- **static** DamageSource getDamageSourceFromCause(EntityDamageEvent$DamageCause cause)

### Class: ch.njol.skript.bukkitutil.EntityUtils
Type: Class

Methods:
- **static** EntityType toBukkitEntityType(EntityData<*> e)
- **static** EntityType toBukkitEntityType(Class<Entity> entityClass)
- **static** void setBaby(Entity entity)
- **static** int getAge(Entity entity)
- **static** boolean isAgeable(Entity entity)
- **static** void teleport(Entity entity, Location location)
- **static** EntityData<*> toSkriptEntityData(EntityType e)
- **static** void setAdult(Entity entity)
- **static** boolean isAdult(Entity entity)
- **static** void setAge(Entity entity, int age)

### Class: ch.njol.skript.bukkitutil.HealthUtils
Type: Class

Methods:
- **static** double getDamage(EntityDamageEvent event)
- **static** void damage(Damageable damageable, double damage)
- **static** void damage(Damageable damageable, double damage, DamageSource)
- **static** void setMaxHealth(Damageable damageable, double health)
- **static** double getMaxHealth(Damageable damageable)
- **static** void heal(Damageable damageable, double health)
- **static** void setDamage(EntityDamageEvent event, double damage)
- **static** void setDamageCause(Damageable damageable, EntityDamageEvent$DamageCause cause)
- **static** double getFinalDamage(EntityDamageEvent event)
- **static** double getHealth(Damageable damageable)
- **static** void setHealth(Damageable damageable, double health)

### Class: ch.njol.skript.bukkitutil.InventoryUtils
Type: Class

Methods:
- **static** Inventory getBottomInventory(InventoryView inventoryView)
- **static** Integer convertSlot(InventoryView inventoryView, int rawSlot)
- **static** Inventory getTopInventory(InventoryView inventoryView)
- **static** String getTitle(InventoryView inventoryView)
- **static** Inventory getInventory(InventoryView inventoryView, int rawSlot)

### Class: ch.njol.skript.bukkitutil.ItemUtils
Type: Class

Methods:
- **static** int getDamage(ItemStack itemStack)
- **static** int getDamage(ItemMeta itemMeta)
- **static** int getDamage(ItemType itemType)
- **static** void setItemMeta(Object object, ItemMeta itemMeta)
- **static** void setMaxDamage(ItemStack itemStack, int maxDamage)
- **static** void setHeadOwner(ItemType skull, OfflinePlayer player)
- **static** boolean itemStacksEqual(ItemStack itemStack1, ItemStack itemStack2)
- **static** void setDamage(ItemStack itemStack, int damage)
- **static** void setDamage(ItemType itemType, int damage)
- **static** ItemStack asItemStack(Object object)
- **static** Material getTreeSapling(TreeType treeType)
- **static** ItemStack changeItemMeta(Class<TT> metaClass, ItemStack itemStack, Consumer<TT> metaChanger)
- **static** boolean isFence(Block block)
- **static** boolean isGlass(Material material)
- **static** Material asBlock(Material type)
- **static** Material asItem(Material type)
- **static** boolean isAir(Material type)
- **static** int getMaxDamage(ItemStack itemStack)
- **static** int getMaxDamage(ItemType itemType)

### Class: ch.njol.skript.bukkitutil.NamespacedUtils
Type: Class

Methods:
- **static** boolean isValidKeyChar(char character)
- **static** boolean isValid(String string)
- **static** boolean isValidNamespaceChar(char character)
- **static** ValidationResult<NamespacedKey> checkValidation(String string)

### Class: ch.njol.skript.bukkitutil.PaperEntityUtils
Type: Class

Methods:
- **static** void lookAt(Object target, LivingEntity[] entities)
- **static** void lookAt(Object target, Float headRotationSpeed, Float maxHeadPitch, LivingEntity[] entities)
- **static** void lookAt(LookAnchor entityAnchor, Object target, Float headRotationSpeed, Float maxHeadPitch, LivingEntity[] entities)

### Class: ch.njol.skript.bukkitutil.PaperEntityUtils$LookGoal
Type: Class
Implements: com.destroystokyo.paper.entity.ai.Goal

Methods:
- GoalKey<Mob> getKey()
- boolean shouldActivate()
- EnumSet<GoalType> getTypes()
- void tick()

### Class: ch.njol.skript.bukkitutil.PassengerUtils
Type: Abstract Class

Methods:
- **static** boolean hasMultiplePassenger()
- **static** Entity[] getPassenger(Entity e)
- **static** void removePassenger(Entity vehicle, Entity passenger)
- **static** void addPassenger(Entity vehicle, Entity passenger)

### Class: ch.njol.skript.bukkitutil.PlayerUtils
Type: Abstract Class

Methods:
- **static** int getLevelXP(int level)
- **static** void setTotalXP(Player player, int experience)
- **static** boolean canEat(Player p, Material food)
- **static** int getCumulativeXP(int level)
- **static** Collection<Player> getOnlinePlayers()
- **static** void updateInventory(Player player)
- **static** int getTotalXP(int level, double progress)
- **static** int getTotalXP(Player player)

### Class: ch.njol.skript.bukkitutil.SkriptTeleportFlag
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- RETAIN_OPEN_INVENTORY
- RETAIN_PASSENGERS
- RETAIN_VEHICLE
- RETAIN_DIRECTION
- RETAIN_PITCH
- RETAIN_YAW
- RETAIN_MOVEMENT
- RETAIN_X
- RETAIN_Y
- RETAIN_Z

Methods:
- TeleportFlag[] getTeleportFlags()
- **static** SkriptTeleportFlag valueOf(String name)
- **static** SkriptTeleportFlag[] values()

### Class: ch.njol.skript.bukkitutil.SoundUtils
Type: Class

Methods:
- **static** NamespacedKey getKey(String soundString)
- **static** NamespacedKey getKey(Sound sound)
- **static** Sound getSound(String soundString)

### Class: ch.njol.skript.bukkitutil.UUIDUtils
Type: Class

Methods:
- **static** UUID asUUID(Object object)

## Package: ch.njol.skript.bukkitutil.block

### Class: ch.njol.skript.bukkitutil.block.BlockCompat
Type: Interface

Methods:
- BlockState fallingBlockToState(FallingBlock)
- boolean isLiquid(Material)
- boolean isEmpty(Material)
- BlockValues getBlockValues(BlockState)
- BlockValues getBlockValues(Block block)
- BlockValues getBlockValues(Material)
- BlockValues getBlockValues(BlockData)
- BlockValues getBlockValues(ItemStack)
- BlockValues getBlockValues(FallingBlock entity)
- BlockSetter getSetter()
- BlockValues createBlockValues(Material, Map<String, String>, ItemStack, int)
- BlockValues createBlockValues(Material type, Map<String, String> states)

### Class: ch.njol.skript.bukkitutil.block.BlockSetter
Type: Interface

Methods:
- void setBlock(Block, Material, BlockValues, int)
- void sendBlockChange(Player, Location, Material, BlockValues)

### Class: ch.njol.skript.bukkitutil.block.BlockValues
Type: Abstract Class
Implements: ch.njol.yggdrasil.YggdrasilSerializable$YggdrasilExtendedSerializable

Methods:
- boolean isDefault()
- int hashCode()
- boolean equals(Object)
- MatchQuality match(BlockValues)

### Class: ch.njol.skript.bukkitutil.block.NewBlockCompat
Type: Class
Implements: ch.njol.skript.bukkitutil.block.BlockCompat

Methods:
- BlockState fallingBlockToState(FallingBlock entity)
- boolean isLiquid(Material type)
- boolean isEmpty(Material type)
- BlockValues getBlockValues(BlockState blockState)
- BlockValues getBlockValues(Material material)
- BlockValues getBlockValues(BlockData blockData)
- BlockValues getBlockValues(ItemStack stack)
- BlockValues createBlockValues(Material type, Map<String, String> states, ItemStack item, int itemFlags)
- BlockSetter getSetter()

## Package: ch.njol.skript.bukkitutil.sounds

### Class: ch.njol.skript.bukkitutil.sounds.SoundReceiver
Type: Interface

Methods:
- **static** SoundReceiver of(Player player)
- **static** SoundReceiver of(World world)
- void playSound(Location, NamespacedKey, SoundCategory, float, float, OptionalLong)
- void playSound(Entity, NamespacedKey, SoundCategory, float, float, OptionalLong)

### Class: ch.njol.skript.bukkitutil.sounds.AdventureSoundUtils
Type: Class

Methods:
- **static** void playSound(World world, Location location, NamespacedKey sound, SoundCategory category, float volume, float pitch, OptionalLong seed)
- **static** void playSound(World world, Entity entity, NamespacedKey sound, SoundCategory category, float volume, float pitch, OptionalLong seed)
- **static** void playSound(Player player, Location location, NamespacedKey sound, SoundCategory category, float volume, float pitch, OptionalLong seed)
- **static** void playSound(Player player, Entity entity, NamespacedKey sound, SoundCategory category, float volume, float pitch, OptionalLong seed)
- **static** Sound getAdventureSound(NamespacedKey key, SoundCategory category, float volume, float pitch, OptionalLong seed)

### Class: ch.njol.skript.bukkitutil.sounds.SoundReceiver$PlayerSoundReceiver
Type: Class
Implements: ch.njol.skript.bukkitutil.sounds.SoundReceiver

Methods:
- void playSound(Location location, NamespacedKey sound, SoundCategory category, float volume, float pitch, OptionalLong seed)
- void playSound(Entity entity, NamespacedKey sound, SoundCategory category, float volume, float pitch, OptionalLong seed)

### Class: ch.njol.skript.bukkitutil.sounds.SoundReceiver$WorldSoundReceiver
Type: Class
Implements: ch.njol.skript.bukkitutil.sounds.SoundReceiver

Methods:
- void playSound(Location location, NamespacedKey sound, SoundCategory category, float volume, float pitch, OptionalLong seed)
- void playSound(Entity entity, NamespacedKey sound, SoundCategory category, float volume, float pitch, OptionalLong seed)

## Package: ch.njol.skript.classes

### Class: ch.njol.skript.classes.Changer
Type: Interface

Methods:
- Class<*> acceptChange(Changer$ChangeMode)
- V change([T, T, ;)

### Class: ch.njol.skript.classes.Cloner
Type: Interface

Methods:
- TT clone(T)

### Class: ch.njol.skript.classes.Converter
Type: Interface
Implements: org.skriptlang.skript.lang.converter.Converter

Methods:
- TT convert(T)

### Class: ch.njol.skript.classes.SerializableChecker
Type: Interface
Implements: ch.njol.util.Checker, java.util.function.Predicate

No public methods found

### Class: ch.njol.skript.classes.AnyInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

Constructors:
- AnyInfo(Class<TType> c, String codeName)

Methods:
- ClassInfo<TType> user(String userInputPatterns) throws PatternSyntaxException

### Class: ch.njol.skript.classes.Changer$ChangeMode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ADD
- SET
- REMOVE
- REMOVE_ALL
- DELETE
- RESET

Methods:
- boolean supportsKeyedChange()
- **static** Changer$ChangeMode valueOf(String name)
- **static** Changer$ChangeMode[] values()

### Class: ch.njol.skript.classes.Changer$ChangerUtils
Type: Abstract Class

Methods:
- **static** Z acceptsChangeTypes(Class<*> validTypes, Class<*> types)
- **static** V change(Changer<TT> changer, Object what, Object delta, Changer$ChangeMode mode)
- **static** Z acceptsChange(Expression<*> expression, Changer$ChangeMode mode, Class<*> types)

### Class: ch.njol.skript.classes.ClassInfo
Type: Class
Implements: ch.njol.skript.lang.Debuggable

Constructors:
- ClassInfo(Class<TT> c, String codeName)

Methods:
- Noun getName()
- ClassInfo<TT> before(String before)
- Set<String> before()
- ClassInfo<TT> documentationId(String id)
- Cloner<+TT> getCloner()
- ClassInfo<TT> usage(String usage)
- ClassInfo<TT> description(String description)
- ClassInfo<TT> changer(Changer<-TT> changer)
- ClassInfo<TT> serializer(Serializer<-TT> serializer)
- String[] getDescription()
- String getDocumentationID()
- boolean matchesUserInput(String input)
- **static** boolean isValidCodeName(String name)
- DefaultExpression<TT> getDefaultExpression()
- String getDocName()
- ClassInfo<TT> requiredPlugins(String pluginNames)
- Serializer<-TT> getSerializer()
- Changer<-TT> getChanger()
- Class<*> getSerializeAs()
- String getCodeName()
- Parser<+TT> getParser()
- ClassInfo<TT> supplier(Supplier<Iterator<TT>> supplier)
- ClassInfo<TT> supplier([T values)
- ClassInfo<TT> property(Property<-THandler> property, String description, SkriptAddon addon, T handler)
- ClassInfo<TT> after(String after)
- Set<String> after()
- Class<TT> getC()
- ClassInfo<TT> cloner(Cloner<TT> cloner)
- ClassInfo<TT> serializeAs(Class<*> serializeAs)
- ClassInfo<TT> defaultExpression(DefaultExpression<TT> defaultExpression)
- String getSince()
- String[] getExamples()
- Pattern[] getUserInputPatterns()
- Z hasProperty(Property<*> property)
- Collection<Property<*>> getAllProperties()
- String[] getUsage()
- Supplier<Iterator<TT>> getSupplier()
- ClassInfo<TT> examples(String examples)
- ClassInfo<TT> parser(Parser<+TT> parser)
- boolean hasDocs()
- TT clone(T t)
- ClassInfo<TT> name(String name)
- String toString()
- String toString(int flags)
- String toString(Event event, boolean debug)
- ClassInfo$PropertyDocs getPropertyDocumentation(Property<*> property)
- ClassInfo<TT> user(String userInputPatterns) throws PatternSyntaxException
- Property$PropertyInfo<THandler> getPropertyInfo(Property<THandler> property)
- String[] getRequiredPlugins()
- ClassInfo<TT> since(String since)

### Class: ch.njol.skript.classes.ClassInfo$PropertyDocs
Type: Class
Extends: java.lang.Record

Constructors:
- ClassInfo$PropertyDocs(Property<*> property, String description, SkriptAddon provider)

Methods:
- SkriptAddon provider()
- int hashCode()
- boolean equals(Object o)
- Property<*> property()
- String description()
- String toString()

### Class: ch.njol.skript.classes.ConfigurationSerializer
Type: Class
Extends: ch.njol.skript.classes.Serializer

Methods:
- Fields serialize(T o) throws NotSerializableException
- Fields serialize(Object) throws NotSerializableException
- boolean mustSyncDeserialization()
- **static** String serializeCS(ConfigurationSerializable o)
- **static** TT deserializeCSOld(String s, Class<TT> c)
- **static** TT deserializeCS(String s, Class<TT> c)
- TE newInstance(Class<TE> c)
- Object newInstance(Class)
- boolean canBeInstantiated()
- V deserialize(T o, T fields) throws StreamCorruptedException
- TT deserialize(String s)
- Object deserialize(String)
- void deserialize(Object, Fields) throws StreamCorruptedException, NotSerializableException

### Class: ch.njol.skript.classes.Converter$ConverterUtils
Type: Class

Methods:
- **static** Converter<*TT> createInstanceofConverter(Class<TF> from, Converter<TF, TT> conv)
- **static** Converter<TF, TT> createInstanceofConverter(Converter<TF, *> conv, Class<TT> to)
- **static** Converter<*TT> createDoubleInstanceofConverter(Class<TF> from, Converter<TF, *> conv, Class<TT> to)

### Class: ch.njol.skript.classes.EnumClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

Constructors:
- EnumClassInfo(Class<TT> enumClass, String codeName, String languageNode)
- EnumClassInfo(Class<TT> enumClass, String codeName, String languageNode, boolean registerComparator)
- EnumClassInfo(Class<TT> enumClass, String codeName, String languageNode, DefaultExpression<TT> defaultExpression)
- EnumClassInfo(Class<TT> enumClass, String codeName, String languageNode, DefaultExpression<TT> defaultExpression, boolean registerComparator)

No public methods found

### Class: ch.njol.skript.classes.EnumParser
Type: Class
Extends: ch.njol.skript.classes.PatternedParser
Implements: org.skriptlang.skript.lang.converter.Converter

Constructors:
- EnumParser(Class<TE> enumClass, String languageNode)

Methods:
- String[] getPatterns()
- String toVariableNameString(T object)
- String toVariableNameString(Object)
- String toString(T object, E flags)
- String toString(Object, int)
- TE convert(String string)
- Object convert(Object)
- TE parse(String string, ParseContext context)
- Object parse(String, ParseContext)

### Class: ch.njol.skript.classes.EnumSerializer
Type: Class
Extends: ch.njol.skript.classes.Serializer

Constructors:
- EnumSerializer(Class<TT> c)

Methods:
- Fields serialize(T e)
- Fields serialize(Object) throws NotSerializableException
- boolean mustSyncDeserialization()
- boolean canBeInstantiated()
- TT deserialize(String s)
- TT deserialize(Fields fields)
- V deserialize(T o, T f)
- Object deserialize(String)
- Object deserialize(Fields) throws StreamCorruptedException, NotSerializableException
- void deserialize(Object, Fields) throws StreamCorruptedException, NotSerializableException

### Class: ch.njol.skript.classes.Parser
Type: Abstract Class

Methods:
- String toVariableNameString(T)
- String toCommandString(T o)
- String getDebugMessage(T o)
- boolean canParse(ParseContext context)
- String toString(T, T)
- String toString(T o, T mode)
- TT parse(String s, ParseContext context)

### Class: ch.njol.skript.classes.PatternedParser
Type: Abstract Class
Extends: ch.njol.skript.classes.Parser

Methods:
- String[] getPatterns()
- String getCombinedPatterns()

### Class: ch.njol.skript.classes.Serializer
Type: Abstract Class
Extends: ch.njol.yggdrasil.YggdrasilSerializer

Methods:
- Fields serialize(T) throws NotSerializableException
- Class<+TT> getClass(String id)
- boolean mustSyncDeserialization()
- TE newInstance(Class<TE> c)
- String getID(Class<*> c)
- Z canBeInstantiated(Class<+TT> c)
- V deserialize(T, T) throws StreamCorruptedException, NotSerializableException
- TE deserialize(Class<TE> c, Fields fields) throws StreamCorruptedException, NotSerializableException
- TT deserialize(String s)

### Class: ch.njol.skript.classes.YggdrasilSerializer
Type: Class
Extends: ch.njol.skript.classes.Serializer

Methods:
- Fields serialize(T o) throws NotSerializableException
- Fields serialize(Object) throws NotSerializableException
- boolean mustSyncDeserialization()
- boolean canBeInstantiated()
- V deserialize(T o, T f) throws StreamCorruptedException, NotSerializableException
- TT deserialize(String s)
- Object deserialize(String)
- void deserialize(Object, Fields) throws StreamCorruptedException, NotSerializableException

## Package: ch.njol.skript.classes.data

### Class: ch.njol.skript.classes.data.BukkitClasses
Type: Class

No public methods found

### Class: ch.njol.skript.classes.data.BukkitEventValues
Type: Class

No public methods found

### Class: ch.njol.skript.classes.data.DefaultChangers
Type: Class

No public methods found

### Class: ch.njol.skript.classes.data.DefaultComparators
Type: Class

No public methods found

### Class: ch.njol.skript.classes.data.DefaultConverters
Type: Class

No public methods found

### Class: ch.njol.skript.classes.data.DefaultFunctions
Type: Class

No public methods found

### Class: ch.njol.skript.classes.data.DefaultOperations
Type: Class

No public methods found

### Class: ch.njol.skript.classes.data.JavaClasses
Type: Class

No public methods found

### Class: ch.njol.skript.classes.data.SkriptClasses
Type: Class

No public methods found

## Package: ch.njol.skript.classes.registry

### Class: ch.njol.skript.classes.registry.RegistryClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

Constructors:
- RegistryClassInfo(Class<TR> registryClass, Registry<TR> registry, String codeName, String languageNode)
- RegistryClassInfo(Class<TR> registryClass, Registry<TR> registry, String codeName, String languageNode, boolean registerComparator)
- RegistryClassInfo(Class<TR> registryClass, Registry<TR> registry, String codeName, String languageNode, DefaultExpression<TR> defaultExpression)
- RegistryClassInfo(Class<TR> registryClass, Registry<TR> registry, String codeName, String languageNode, DefaultExpression<TR> defaultExpression, boolean registerComparator)

No public methods found

### Class: ch.njol.skript.classes.registry.RegistryParser
Type: Class
Extends: ch.njol.skript.classes.PatternedParser

Constructors:
- RegistryParser(Registry<TR> registry, String languageNode)

Methods:
- String[] getPatterns()
- String toVariableNameString(T object)
- String toVariableNameString(Object)
- String toString(T object, R flags)
- String toString(Object, int)
- TR parse(String input, ParseContext context)
- Object parse(String, ParseContext)

### Class: ch.njol.skript.classes.registry.RegistrySerializer
Type: Class
Extends: ch.njol.skript.classes.Serializer

Constructors:
- RegistrySerializer(Registry<TR> registry)

Methods:
- Fields serialize(T o)
- Fields serialize(Object) throws NotSerializableException
- boolean mustSyncDeserialization()
- V deserialize(T o, R f)
- void deserialize(Object, Fields) throws StreamCorruptedException, NotSerializableException

## Package: ch.njol.skript.command

### Class: ch.njol.skript.command.Argument
Type: Class

Methods:
- String getName()
- void set(ScriptCommandEvent e, Object[] o)
- int getIndex()
- Class<TT> getType()
- void setToDefault(ScriptCommandEvent event)
- boolean isSingle()
- String toString()
- **static** Argument<TT> newInstance(String name, ClassInfo<TT> type, String def, int index, boolean single, boolean forceOptional)
- [TT getCurrent(Event e)
- boolean isOptional()

### Class: ch.njol.skript.command.CommandEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- CommandEvent(CommandSender sender, String command, String[] args)

Methods:
- HandlerList getHandlers()
- String getCommand()
- **static** HandlerList getHandlerList()
- CommandSender getSender()
- String[] getArgs()

### Class: ch.njol.skript.command.CommandHelp
Type: Class

Constructors:
- CommandHelp(String command, SkriptColor argsColor, String langNode)
- CommandHelp(String command, SkriptColor argsColor)

Methods:
- CommandHelp add(String argument)
- CommandHelp add(CommandHelp help)
- boolean test(CommandSender sender, String[] args)
- void showHelp(CommandSender sender)
- String toString()

### Class: ch.njol.skript.command.CommandUsage
Type: Class

Constructors:
- CommandUsage(VariableString usage, String defaultUsage)

Methods:
- String toString()
- String getUsage()
- String getUsage(Event event)
- VariableString getRawUsage()

### Class: ch.njol.skript.command.Commands
Type: Abstract Class

Methods:
- **static** void registerListeners()
- **static** ScriptCommand getScriptCommand(String key)
- **static** boolean scriptCommandExists(String command)
- **static** String unescape(String string)
- **static** void registerCommand(ScriptCommand command)
- **static** SimpleCommandMap getCommandMap()
- **static** Set<String> getScriptCommands()
- **static** String escape(String string)
- **static** void unregisterCommand(ScriptCommand scriptCommand)
- **static** boolean skriptCommandExists(String command)
- **static** int unregisterCommands(File script)

### Class: ch.njol.skript.command.Commands$CommandAliasHelpTopic
Type: Class
Extends: org.bukkit.help.HelpTopic

Constructors:
- Commands$CommandAliasHelpTopic(String alias, String aliasFor, HelpMap helpMap)

Methods:
- String getFullText(CommandSender forWho)
- boolean canSee(CommandSender commandSender)

### Class: ch.njol.skript.command.EffectCommandEvent
Type: Class
Extends: ch.njol.skript.command.CommandEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- EffectCommandEvent(CommandSender sender, String command)

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- void setCommand(String command)

### Class: ch.njol.skript.command.ScriptCommand
Type: Class
Implements: org.bukkit.command.TabExecutor

Constructors:
- ScriptCommand(Script script, String name, String pattern, List<Argument<*>> arguments, String description, String prefix, String usage, List<String> aliases, String permission, VariableString permissionMessage, Timespan cooldown, VariableString cooldownMessage, String cooldownBypass, VariableString cooldownStorage, int executableBy, SectionNode node)
- ScriptCommand(Script script, String name, String pattern, List<Argument<*>> arguments, String description, String prefix, CommandUsage usage, List<String> aliases, String permission, VariableString permissionMessage, Timespan cooldown, VariableString cooldownMessage, String cooldownBypass, VariableString cooldownStorage, int executableBy, SectionNode trigger)

Methods:
- List<String> getAliases()
- long getRemainingMilliseconds(UUID uuid, Event event)
- String getLabel()
- String getName()
- void unregisterHelp()
- String getCooldownBypass()
- Date getLastUsage(UUID uuid, Event event)
- List<String> onTabComplete(CommandSender sender, Command command, String alias, String args)
- void setLastUsage(UUID uuid, Event event, Date date)
- String getPrefix()
- void setRemainingMilliseconds(UUID uuid, Event event, long milliseconds)
- boolean onCommand(CommandSender sender, Command command, String label, String[] args)
- V unregister(SimpleCommandMap commandMap, Map<String, Command> knownCommands, Set<String> aliases)
- boolean checkPermissions(CommandSender sender, String commandLabel, String arguments)
- boolean checkPermissions(CommandSender sender, Event event)
- Timespan getCooldown()
- PluginCommand getBukkitCommand()
- boolean execute(CommandSender sender, String commandLabel, String rest)
- List<String> getActiveAliases()
- void setElapsedMilliSeconds(UUID uuid, Event event, long milliseconds)
- void registerHelp()
- long getElapsedMilliseconds(UUID uuid, Event event)
- List<Argument<*>> getArguments()
- String getPattern()
- void sendHelp(CommandSender sender)
- Script getScript()
- V register(SimpleCommandMap commandMap, Map<String, Command> knownCommands, Set<String> aliases)

### Class: ch.njol.skript.command.ScriptCommandEvent
Type: Class
Extends: ch.njol.skript.command.CommandEvent

Constructors:
- ScriptCommandEvent(ScriptCommand scriptCommand, CommandSender sender, String commandLabel, String executionDate)

Methods:
- HandlerList getHandlers()
- ScriptCommand getScriptCommand()
- **static** HandlerList getHandlerList()
- String getCommandLabel()
- String getArgsString()
- boolean isCooldownCancelled()
- void setCooldownCancelled(boolean cooldownCancelled)

## Package: ch.njol.skript.conditions

### Class: ch.njol.skript.conditions.CondAI
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondAllayCanDuplicate
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondAlphanumeric
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- Condition simplify()
- SyntaxElement simplify()
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondAnchorWorks
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondCanFly
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Player player)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondCanHold
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondCanPickUpItems
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity livingEntity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondCanSee
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult result)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondCancelled
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondChance
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondChatColors
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Player player)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondChatFiltering
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Player player)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondChatVisibility
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondCompare
Type: Class
Extends: ch.njol.skript.lang.Condition
Implements: ch.njol.skript.lang.VerboseAssert

Methods:
- Z init(Expression<*> vars, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- **static** String f(Expression<*> e)
- String getReceivedMessage(Event event)
- String toString(Event event, boolean debug)
- String getExpectedMessage(Event event)
- Condition simplify()
- SyntaxElement simplify()
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondContains
Type: Class
Extends: ch.njol.skript.lang.Condition
Implements: ch.njol.skript.lang.VerboseAssert

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String getReceivedMessage(Event event)
- String toString(Event e, boolean debug)
- String getExpectedMessage(Event event)
- Condition simplify()
- SyntaxElement simplify()
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondDamageCause
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondDate
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- Condition simplify()
- SyntaxElement simplify()
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondElytraBoostConsume
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondEndermanStaredAt
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondEntityIsInLiquid
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(Entity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondEntityIsWet
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Entity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondEntityStorageIsFull
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exrps, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondEntityUnload
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondFromMobSpawner
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(Entity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondGlowingText
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Object obj)

### Class: ch.njol.skript.conditions.CondGoatHasHorns
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondHasClientWeather
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Player player)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondHasCustomModelData
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(ItemType item)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondHasItemCooldown
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondHasLineOfSight
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondHasMetadata
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondHasPotion
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondHasResourcePack
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Player player)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondHasScoreboardTag
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIgnitionProcess
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIncendiary
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondIsAlive
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(Entity e)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsBanned
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(Object obj)

### Class: ch.njol.skript.conditions.CondIsBlock
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(ItemType itemType)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsBlockRedstonePowered
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondIsBlocking
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Player player)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsBurning
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Entity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsCharged
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Entity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsChargingFireball
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsClimbing
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsCommandBlockConditional
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(Block block)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsCustomNameVisible
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(Entity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsDancing
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsDashing
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsDivisibleBy
Type: Class
Extends: ch.njol.skript.lang.Condition
Implements: org.skriptlang.skript.log.runtime.SyntaxRuntimeErrorProducer

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- Node getNode()
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIsEating
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsEdible
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(ItemType itemType)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsEmpty
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Object object)

### Class: ch.njol.skript.conditions.CondIsEnchanted
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIsFireResistant
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(ItemType item)
- boolean check(Object)
- String getPropertyName()

### Class: ch.njol.skript.conditions.CondIsFlammable
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(ItemType itemType)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsFlying
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Player player)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsFrozen
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Entity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsFuel
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Condition simplify()
- SyntaxElement simplify()
- boolean check(ItemType item)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsGliding
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsHandRaised
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIsInfinite
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Condition simplify()
- SyntaxElement simplify()
- boolean check(Object object)

### Class: ch.njol.skript.conditions.CondIsInteractable
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(ItemType item)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsInvisible
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(LivingEntity livingEntity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsInvulnerable
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Object object)

### Class: ch.njol.skript.conditions.CondIsJumping
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(LivingEntity livingEntity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsLeftHanded
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean init(Expression[] exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(LivingEntity livingEntity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsLoaded
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean d)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondIsOccluding
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(ItemType item)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsOfType
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIsOnGround
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Entity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsOnline
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(OfflinePlayer op)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsOp
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(OfflinePlayer player)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsPassable
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Block block)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsPathfinding
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIsPersistent
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Object object)

### Class: ch.njol.skript.conditions.CondIsPlayingDead
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsPluginEnabled
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondIsPoisoned
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsPreferredTool
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIsResonating
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Block value)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsRiding
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIsRinging
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Block value)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsRiptiding
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsSaddled
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsScreaming
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsSedated
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Block block)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsSet
Type: Class
Extends: ch.njol.skript.lang.Condition
Implements: ch.njol.skript.lang.VerboseAssert

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String getReceivedMessage(Event event)
- String toString(Event e, boolean debug)
- String getExpectedMessage(Event event)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondIsSheared
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsSilent
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Entity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsSkriptCommand
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(String cmd)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsSleeping
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsSlimeChunk
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Chunk chunk)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsSneaking
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Player player)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsSolid
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(ItemType itemType)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsSpawnable
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIsSprinting
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Player player)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsStackable
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(ItemStack item)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsSwimming
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsTameable
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsTamed
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Entity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsTicking
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Entity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsTransparent
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(ItemType itemType)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsUnbreakable
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(ItemType item)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsUsingFeature
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> expressions, int pattern, Kleenean delayed, SkriptParser$ParseResult result)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIsValid
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Object value)

### Class: ch.njol.skript.conditions.CondIsVectorNormalized
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Condition simplify()
- SyntaxElement simplify()
- boolean check(Vector vector)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondIsWearing
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> vars, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIsWhitelisted
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondIsWithin
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondItemDespawn
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Item item)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondItemEnchantmentGlint
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(ItemType itemType)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondItemInHand
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondLeashWillDrop
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondLeashed
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondLidState
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Block block)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondMatches
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- Condition simplify()
- SyntaxElement simplify()
- boolean check(Event e)
- boolean matches(String str, Pattern pattern)

### Class: ch.njol.skript.conditions.CondMinecraftVersion
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- Condition simplify()
- SyntaxElement simplify()
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondPandaIsOnBack
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondPandaIsRolling
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondPandaIsScared
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondPandaIsSneezing
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondPastFuture
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- Condition simplify()
- SyntaxElement simplify()
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondPermission
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondPlayedBefore
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondPvP
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondResourcePack
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondRespawnLocation
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondScriptLoaded
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondStartsEndsWith
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- Condition simplify()
- SyntaxElement simplify()
- boolean check(Event e)

### Class: ch.njol.skript.conditions.CondStriderIsShivering
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: ch.njol.skript.conditions.CondTooltip
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondWillHatch
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.conditions.CondWithinRadius
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

## Package: ch.njol.skript.conditions.base

### Class: ch.njol.skript.conditions.base.PropertyCondition
Type: Abstract Class
Extends: ch.njol.skript.lang.Condition
Implements: java.util.function.Predicate

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- **static** SyntaxInfo$Builder<SyntaxInfo$Builder<*TE>, TE> infoBuilder(Class<TE> condition, PropertyCondition$PropertyType propertyType, String property, String type)
- Predicate<TT> or(Predicate<-TT> other)
- Expression<+TT> getExpr()
- Z test(T value)
- Predicate<TT> negate()
- Predicate<TT> and(Predicate<-TT> other)
- **static** String[] getPatterns(PropertyCondition$PropertyType propertyType, String property, String type)
- String toString(Event event, boolean debug)
- **static** String toString(Condition condition, PropertyCondition$PropertyType propertyType, Event event, boolean debug, Expression<*> expr, String property)
- boolean check(Event event)
- Z check(T)
- **static** SyntaxInfo<TE> register(SyntaxRegistry registry, Class<TE> condition, String property, String type)
- **static** SyntaxInfo<TE> register(SyntaxRegistry registry, Class<TE> condition, PropertyCondition$PropertyType propertyType, String property, String type)
- **static** V register(Class<Condition> condition, String property, String type)
- **static** V register(Class<Condition> condition, PropertyCondition$PropertyType propertyType, String property, String type)

### Class: ch.njol.skript.conditions.base.PropertyCondition$PropertyType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BE
- CAN
- HAVE
- WILL

Methods:
- **static** PropertyCondition$PropertyType valueOf(String name)
- **static** PropertyCondition$PropertyType[] values()

## Package: ch.njol.skript.config

### Class: ch.njol.skript.config.NodeNavigator
Type: Interface
Implements: java.lang.Iterable

Methods:
- String getValue(String path)
- Iterator<Node> iterator()
- Node get(String)
- Node getNodeAt(String[] steps)
- Node getNodeAt(String path)
- Node getCurrentNode()

### Class: ch.njol.skript.config.Config
Type: Class
Implements: java.lang.Comparable, org.skriptlang.skript.util.Validated, ch.njol.skript.config.NodeNavigator, ch.njol.skript.lang.util.common.AnyNamed

Constructors:
- Config(InputStream main, String fileName, File file, boolean simple, boolean allowEmptySections, String defaultSeparator) throws IOException
- Config(InputStream source, String fileName, boolean simple, boolean allowEmptySections, String defaultSeparator) throws IOException
- Config(File file, boolean simple, boolean allowEmptySections, String defaultSeparator) throws IOException
- Config(Path file, boolean simple, boolean allowEmptySections, String defaultSeparator) throws IOException
- Config(String fileName, File file)

Methods:
- boolean compareValues(Config other, String[] excluded)
- SectionNode getMainNode()
- boolean isEmpty()
- void save(File file) throws IOException
- void invalidate()
- int compareTo(Config other)
- int compareTo(Object)
- Node getCurrentNode()
- File getFile()
- boolean valid()
- Iterator<Node> iterator()
- String getByPath(String path)
- void load(Object object)
- V load(Class<*> clazz)
- boolean setValues(Config other)
- boolean setValues(Config other, String[] excluded)
- Map<String, String> toMap(String separator)
- String get(String[] path)
- Node get(String step)
- boolean updateNodes(Config newer)
- String name()
- String getSaveSeparator()
- Path getPath()
- String getSeparator()
- Node getNodeAt(String[] steps)
- String getFileName()
- boolean validate(SectionValidator validator)

### Class: ch.njol.skript.config.ConfigReader
Type: Class
Extends: java.io.BufferedReader

Constructors:
- ConfigReader(InputStream reset)

Methods:
- int getLineNum()
- boolean markSupported()
- String getLine()
- void reset()
- String readLine() throws IOException
- void mark(int readAheadLimit) throws IOException

### Class: ch.njol.skript.config.EntryNode
Type: Class
Extends: ch.njol.skript.config.Node
Implements: java.util.Map$Entry, ch.njol.skript.lang.util.common.AnyValued

Constructors:
- EntryNode(String key, String value, String comment, SectionNode parent, int lineNum)
- EntryNode(String key, String value, SectionNode parent)

Methods:
- boolean supportsValueChange()
- String getValue()
- Object getValue()
- String getKey()
- Object getKey()
- int hashCode()
- boolean equals(Object object)
- Node get(String step)
- Class<String> valueType()
- String setValue(String v)
- Object setValue(Object)
- void changeValue(String value) throws UnsupportedOperationException
- void changeValue(Object) throws UnsupportedOperationException
- String value()
- Object value()

### Class: ch.njol.skript.config.EnumParser
Type: Class
Implements: org.skriptlang.skript.lang.converter.Converter

Constructors:
- EnumParser(Class<TE> enumType, String type)

Methods:
- String toString()
- TE convert(String s)
- Object convert(Object)

### Class: ch.njol.skript.config.InvalidNode
Type: Class
Extends: ch.njol.skript.config.VoidNode

Constructors:
- InvalidNode(String value, String comment, SectionNode parent, int lineNum)

No public methods found

### Class: ch.njol.skript.config.Node
Type: Abstract Class
Implements: ch.njol.skript.lang.util.common.AnyNamed, org.skriptlang.skript.util.Validated, ch.njol.skript.config.NodeNavigator

Methods:
- String getKey()
- SectionNode getParent()
- void move(SectionNode newParent)
- boolean debug()
- int getLine()
- String save()
- void save(PrintWriter w)
- void invalidate() throws UnsupportedOperationException
- Node getCurrentNode()
- String[] getPathSteps()
- void remove()
- Config getConfig()
- boolean valid()
- boolean isVoid()
- void rename(String newname)
- int hashCode()
- boolean equals(Object object)
- String name()
- String getPath()
- **static** NonNullPair<String, String> splitLine(String line)
- **static** NonNullPair<String, String> splitLine(String line, AtomicBoolean inBlockComment)
- String toString()

### Class: ch.njol.skript.config.NodeMap
Type: Class

Methods:
- Node get(String key)
- **static** boolean inMap(Node n)
- Node remove(Node n)
- Node remove(String key)
- void put(Node n)

### Class: ch.njol.skript.config.Option
Type: Class

Constructors:
- Option(String key, T defaultValue)
- Option(String key, T defaultValue, T parser)

Methods:
- void set(Config config, String path)
- TT defaultValue()
- Option<TT> optional(boolean optional)
- boolean isOptional()
- Option<TT> setter(Consumer<-TT> setter)
- TT value()

### Class: ch.njol.skript.config.OptionSection
Type: Class

Constructors:
- OptionSection(String key)

Methods:
- TT get(String key)

### Class: ch.njol.skript.config.SectionNode
Type: Class
Extends: ch.njol.skript.config.Node
Implements: java.lang.Iterable

Constructors:
- SectionNode(String key, String comment, SectionNode parent, int nodes)

Methods:
- boolean compareValues(SectionNode other, String[] excluded)
- void add(Node n)
- void add(int index, Node node)
- void set(String key, String value)
- void set(String key, Node node)
- Iterator<Node> fullIterator()
- void convertToEntries(int levels)
- void convertToEntries(int levels, String separator)
- boolean isValid()
- void save(PrintWriter w)
- boolean isEmpty()
- void insert(Node node, int index)
- void remove(Node n)
- Node remove(String key)
- String getValue(String key)
- Iterator<Node> iterator()
- int size()
- boolean setValues(SectionNode other, String[] excluded)
- Node get(String key)
- String get(String name, String def)
- Node getNodeAt(String[] keys)
- boolean validate(SectionValidator validator)

### Class: ch.njol.skript.config.SimpleNode
Type: Class
Extends: ch.njol.skript.config.Node

Constructors:
- SimpleNode(String value, String comment, int lineNum, SectionNode parent)
- SimpleNode(Config c)

Methods:
- void set(String s)
- Node get(String key)

### Class: ch.njol.skript.config.VoidNode
Type: Class
Extends: ch.njol.skript.config.Node

Methods:
- String getKey()
- void set(String s)
- Node get(String key)

## Package: ch.njol.skript.config.validate

### Class: ch.njol.skript.config.validate.NodeValidator
Type: Interface

Methods:
- boolean validate(Node)

### Class: ch.njol.skript.config.validate.EntryValidator
Type: Class
Implements: ch.njol.skript.config.validate.NodeValidator

Constructors:
- EntryValidator(Consumer<String> setter)

Methods:
- **static** void notAnEntryError(Node node)
- **static** void notAnEntryError(Node node, String separator)
- boolean validate(Node node)

### Class: ch.njol.skript.config.validate.EnumEntryValidator
Type: Class
Extends: ch.njol.skript.config.validate.EntryValidator

Constructors:
- EnumEntryValidator(Class<TE> enumType, Consumer<TE> setter)
- EnumEntryValidator(Class<TE> enumType, Consumer<TE> setter, String allowedValues)

Methods:
- boolean validate(Node node)

### Class: ch.njol.skript.config.validate.ParsedEntryValidator
Type: Class
Extends: ch.njol.skript.config.validate.EntryValidator

Constructors:
- ParsedEntryValidator(Parser<+TT> parser, Consumer<TT> setter)

Methods:
- boolean validate(Node node)

### Class: ch.njol.skript.config.validate.SectionValidator
Type: Class
Implements: ch.njol.skript.config.validate.NodeValidator

Methods:
- SectionValidator addEntry(String name, boolean optional)
- SectionValidator addEntry(String name, Consumer<String> setter, boolean optional)
- SectionValidator addEntry(String name, Parser<+TT> parser, Consumer<TT> setter, boolean optional)
- SectionValidator addNode(String name, NodeValidator v, boolean optional)
- SectionValidator setAllowUndefinedEntries(boolean b)
- **static** void notASectionError(Node node)
- SectionValidator addSection(String name, boolean optional)
- SectionValidator setAllowUndefinedSections(boolean b)
- boolean validate(Node node)

## Package: ch.njol.skript.doc

### Class: ch.njol.skript.doc.Description
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: ch.njol.skript.doc.Documentable
Type: Interface

Methods:
- List<String> keywords()
- List<String> examples()
- String name()
- List<String> description()
- List<String> requires()
- List<String> since()

### Class: ch.njol.skript.doc.DocumentationId
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: ch.njol.skript.doc.Events
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: ch.njol.skript.doc.Example
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- boolean inTrigger()
- String value()

### Class: ch.njol.skript.doc.Example$Examples
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Example[] value()

### Class: ch.njol.skript.doc.Examples
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: ch.njol.skript.doc.Keywords
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: ch.njol.skript.doc.Name
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: ch.njol.skript.doc.NoDoc
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: ch.njol.skript.doc.RelatedProperty
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: ch.njol.skript.doc.RequiredPlugins
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: ch.njol.skript.doc.Since
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String[] value()

### Class: ch.njol.skript.doc.Documentation
Type: Class

Methods:
- **static** boolean canGenerateUnsafeDocs()
- **static** String escapeHTML(String value)
- **static** String[] escapeHTML(String[] values)
- **static** boolean isDocsTemplateFound()
- **static** File getDocsTemplateDirectory()
- **static** File getDocsOutputDirectory()
- **static** void generate()

### Class: ch.njol.skript.doc.DocumentationGenerator
Type: Abstract Class

Constructors:
- DocumentationGenerator(File templateDir, File outputDir)

Methods:
- void generate()

### Class: ch.njol.skript.doc.DocumentationIdProvider
Type: Class

Methods:
- **static** String getId(SyntaxElementInfo<+TT> syntaxInfo)
- **static** String getId(SyntaxInfo<+TT> syntaxInfo)
- **static** String getId(Function<*> function)
- **static** String getId(ClassInfo<*> classInfo)
- **static** String getId(SkriptEventInfo<*> eventInfo)
- **static** String getId(Property<*> property)

### Class: ch.njol.skript.doc.HTMLGenerator
Type: Class
Extends: ch.njol.skript.doc.DocumentationGenerator

Constructors:
- HTMLGenerator(File templateDir, File skeleton)

Methods:
- String getDefaultIfNullOrEmpty(String string, String message)
- String[] getDefaultIfNullOrEmpty(String[] string, String message)
- void generate()

### Class: ch.njol.skript.doc.JSONGenerator
Type: Class
Extends: ch.njol.skript.doc.DocumentationGenerator

Constructors:
- JSONGenerator(File templateDir, File source)

Methods:
- **static** JSONGenerator of(SkriptAddon source)
- void generate(Path path) throws IOException
- void generate()

## Package: ch.njol.skript.effects

### Class: ch.njol.skript.effects.Delay
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- **static** boolean isDelayed(Event event)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- **static** void addDelayedEvent(Event event)

### Class: ch.njol.skript.effects.EffActionBar
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffAllayCanDuplicate
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffAllayDuplicate
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffApplyBoneMeal
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffBan
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffBlockUpdate
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffBreakNaturally
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffBroadcast
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- void execute(Event event)

### Class: ch.njol.skript.effects.EffCancelCooldown
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffCancelDrops
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- Class<Event> supportedEvents()

### Class: ch.njol.skript.effects.EffCancelEvent
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- void execute(Event event)

### Class: ch.njol.skript.effects.EffCancelItemUse
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffChange
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffCharge
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffClearEntityStorage
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffColorItems
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffCommand
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- void execute(Event event)

### Class: ch.njol.skript.effects.EffCommandBlockConditional
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffConnect
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffContinue
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- ExecutionIntent executionIntent()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffCopy
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffCustomName
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffDancing
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffDetonate
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffDoIf
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- TriggerItem walk(Event e)

### Class: ch.njol.skript.effects.EffDrop
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- void execute(Event e)

### Class: ch.njol.skript.effects.EffDropLeash
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffEating
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffElytraBoostConsume
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffEnchant
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffEndermanTeleport
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffEnforceWhitelist
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- **static** void reloadWhitelist()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffEntityUnload
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffEntityVisibility
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult result)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffEquip
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffExceptionDebug
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffExit
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- ExecutionIntent executionIntent()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffExplodeCreeper
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffExplosion
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- void execute(Event e)

### Class: ch.njol.skript.effects.EffFeed
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffFireResistant
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffFireworkLaunch
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffForceAttack
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: org.skriptlang.skript.log.runtime.SyntaxRuntimeErrorProducer

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- Node getNode()

### Class: ch.njol.skript.effects.EffForceEnchantmentGlint
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffGlowingText
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffGoatHorns
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffGoatHorns$GoatHorn
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LEFT
- RIGHT
- BOTH
- ANY

Methods:
- **static** EffGoatHorns$GoatHorn valueOf(String name)
- **static** EffGoatHorns$GoatHorn[] values()

### Class: ch.njol.skript.effects.EffGoatRam
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffHandedness
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffHealth
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: org.skriptlang.skript.log.runtime.SyntaxRuntimeErrorProducer

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- Node getNode()

### Class: ch.njol.skript.effects.EffHidePlayerFromServerList
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffIgnite
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffIncendiary
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffInsertEntityStorage
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffInvisible
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffInvulnerability
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffItemDespawn
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffKeepInventory
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffKick
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffKill
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffKnockback
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffLeash
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffLidState
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffLightning
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffLoadServerIcon
Type: Class
Extends: ch.njol.skript.util.AsyncEffect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffLog
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffLook
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffMakeEggHatch
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffMakeFly
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffMakeSay
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffMessage
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffOp
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffOpenBook
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffOpenInventory
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffPandaOnBack
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffPandaRolling
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffPandaSneezing
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffPathfind
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffPersistent
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffPlaySound
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffPlayerInfoVisibility
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffPlayingDead
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffPoison
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffPotion
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffPush
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffPvP
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffReleaseEntityStorage
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffReplace
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffResetTitle
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffRespawn
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffReturn
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- ExecutionIntent executionIntent()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffRing
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffRun
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: ch.njol.skript.registrations.experiments.ReflectionExperimentSyntax

Methods:
- Z init(Expression<*> expressions, int pattern, Kleenean isDelayed, SkriptParser$ParseResult result)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffScreaming
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffScriptFile
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffSendBlockChange
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffSendResourcePack
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffSendTitle
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffShear
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffSilence
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffSort
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: ch.njol.skript.lang.InputSource

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean hasIndices()
- Object getCurrentValue()
- String getCurrentIndex()
- String toString(Event event, boolean debug)
- Set<ExprInput<*>> getDependentInputs()

### Class: ch.njol.skript.effects.EffSprinting
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffStopServer
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffStopSound
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffStriderShivering
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffSuppressTypeHints
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: org.skriptlang.skript.lang.experiment.SimpleExperimentalSyntax

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- ExperimentData getExperimentData()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffSuppressWarnings
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffSwingHand
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffTame
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffTeleport
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffToggle
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffToggleCanPickUpItems
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffToggleFlight
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffTooltip
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffTransform
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: ch.njol.skript.lang.InputSource

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean hasIndices()
- Object getCurrentValue()
- String getCurrentIndex()
- String toString(Event event, boolean debug)
- Set<ExprInput<*>> getDependentInputs()

### Class: ch.njol.skript.effects.EffTree
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- void execute(Event e)

### Class: ch.njol.skript.effects.EffVehicle
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffVisualEffect
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.effects.EffWakeupSleep
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffWardenDisturbance
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffWorldBorderExpand
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffWorldLoad
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffWorldSave
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.EffZombify
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.effects.IndeterminateDelay
Type: Class
Extends: ch.njol.skript.effects.Delay

Methods:
- String toString(Event event, boolean debug)

## Package: ch.njol.skript.entity

### Class: ch.njol.skript.entity.AxolotlData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- AxolotlData(Axolotl$Variant variant)

Methods:
- void set(Axolotl axolotl)
- void set(Entity)
- Class<Axolotl> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.BeeData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- BeeData(Kleenean isAngry, Kleenean hasNectar)
- BeeData(BeeData$BeeState isAngry)

Methods:
- void set(Bee bee)
- void set(Entity)
- Class<Bee> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.BeeData$BeeState
Type: Class
Extends: java.lang.Record

Constructors:
- BeeData$BeeState(Kleenean angry, Kleenean nectar)

Methods:
- int hashCode()
- boolean equals(Object o)
- Kleenean nectar()
- String toString()
- Kleenean angry()

### Class: ch.njol.skript.entity.BoatChestData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- BoatChestData(Boat$Type type)

Methods:
- void set(ChestBoat chestBoat)
- void set(Entity)
- Class<ChestBoat> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)
- boolean isOfItemType(ItemType itemType)

### Class: ch.njol.skript.entity.BoatData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- BoatData(Boat$Type type)

Methods:
- void set(Boat boat)
- void set(Entity)
- Class<Boat> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)
- boolean isOfItemType(ItemType itemType)

### Class: ch.njol.skript.entity.CatData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Methods:
- void set(Cat cat)
- void set(Entity)
- Class<Cat> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.ChickenData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- ChickenData(Object variant)

Methods:
- void set(Chicken chicken)
- void set(Entity)
- Class<Chicken> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.ChickenData$ChickenVariantDummy
Type: Class

No public methods found

### Class: ch.njol.skript.entity.CowData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- CowData(Object variant)

Methods:
- void set(Cow cow)
- void set(Entity)
- Object getVariant(Cow cow)
- Class<Cow> getType()
- void setVariant(Cow cow)
- void setVariant(Cow cow, Object object)
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.CowData$CowVariantDummy
Type: Class

No public methods found

### Class: ch.njol.skript.entity.CreeperData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- CreeperData(Kleenean powered)

Methods:
- void set(Creeper creeper)
- void set(Entity)
- Class<Creeper> getType()
- boolean match(Creeper creeper)
- boolean match(Entity)
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.DroppedItemData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- DroppedItemData(ItemType[] types)

Methods:
- boolean canSpawn(World world)
- Item spawn(Location location, Consumer<Item> consumer)
- Entity spawn(Location, Consumer)
- void set(Item item)
- void set(Entity)
- Class<Item> getType()
- EntityData<*> getSuperType()
- String toString(int flags)
- Z isSupertypeOf(EntityData<*> otherData)

### Class: ch.njol.skript.entity.EndermanData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- EndermanData(ItemType[] hand)

Methods:
- void set(Enderman enderman)
- void set(Entity)
- Class<Enderman> getType()
- boolean match(Enderman enderman)
- boolean match(Entity)
- EntityData<*> getSuperType()
- String toString(int flags)
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.EntityData
Type: Abstract Class
Implements: ch.njol.skript.lang.SyntaxElement, ch.njol.yggdrasil.YggdrasilSerializable$YggdrasilExtendedSerializable

Methods:
- boolean canSpawn(World world)
- Kleenean isBaby()
- **static** EntityData<-TE> fromEntity(T entity)
- EntityData<*> getSuperType()
- boolean isInstance(Entity entity)
- String getSyntaxTypeName()
- int hashCode()
- TE create()
- TE create(Location location)
- void deserialize(Fields fields) throws StreamCorruptedException, NotSerializableException
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- [TE getAll(World worlds)
- **static** [TE getAll(EntityData<*> types, Class<TE> type, World worlds)
- **static** [TE getAll(EntityData<*> types, Class<TE> type, Chunk chunks)
- V set(T)
- **static** EntityData$EntityDataInfo<*> getInfo(Class<EntityData<*>> entityDataClass)
- **static** EntityData$EntityDataInfo<*> getInfo(String codeName)
- **static** EntityData<*> parseWithoutIndefiniteArticle(String string)
- **static** EntityData<*> parse(String string)
- **static** EntityData<-TE> fromClass(Class<TE> entityClass)
- Fields serialize() throws NotSerializableException
- TE spawn(Location location)
- TE spawn(Location location, Consumer<TE> consumer)
- **static** void onRegistrationStop()
- Class<+TE> getType()
- boolean equals(Object obj)
- Kleenean isPlural()
- String toString()
- String toString(int flags)
- **static** String toString(Entity entity)
- **static** String toString(Class<Entity> entityClass)
- **static** String toString(Entity entity, int flags)
- **static** String toString(Class<Entity> entityClass, int flags)
- Z isSupertypeOf(EntityData<*>)
- **static** V register(Class<TT> dataClass, String name, Class<TE> entityClass, String codeName) throws IllegalArgumentException
- **static** V register(Class<TT> dataClass, String name, Class<TE> entityClass, int defaultName, String codeNames) throws IllegalArgumentException

### Class: ch.njol.skript.entity.EntityType
Type: Class
Implements: java.lang.Cloneable, ch.njol.yggdrasil.YggdrasilSerializable

Constructors:
- EntityType(EntityData<*> data, int amount)
- EntityType(Class<Entity> data, int amount)
- EntityType(Entity data)
- EntityType(EntityType amount)

Methods:
- boolean isInstance(Entity entity)
- int hashCode()
- boolean equals(Object obj)
- EntityType clone()
- Object clone() throws CloneNotSupportedException
- String toString()
- String toString(int flags)
- **static** EntityType parse(String s)
- boolean sameType(EntityType other)
- int getAmount()

### Class: ch.njol.skript.entity.FallingBlockData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- FallingBlockData(ItemType[] types)

Methods:
- FallingBlock spawn(Location loc, Consumer<FallingBlock> consumer)
- Entity spawn(Location, Consumer)
- void set(FallingBlock fallingBlock)
- void set(Entity)
- Class<FallingBlock> getType()
- EntityData<*> getSuperType()
- String toString(int flags)
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.FoxData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- FoxData(Fox$Type type)

Methods:
- void set(Fox fox)
- void set(Entity)
- Class<Fox> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.FrogData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- FrogData(Frog$Variant variant)

Methods:
- void set(Frog frog)
- void set(Entity)
- Class<Frog> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.GoatData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- GoatData(Kleenean screaming)

Methods:
- void set(Goat goat)
- void set(Entity)
- Class<Goat> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.LlamaData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- LlamaData(Llama$Color color, boolean isTrader)
- LlamaData(LlamaData$LlamaState color)

Methods:
- void set(Llama llama)
- void set(Entity)
- Class<Llama> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.LlamaData$LlamaState
Type: Class
Extends: java.lang.Record

Constructors:
- LlamaData$LlamaState(Llama$Color color, boolean trader)

Methods:
- Llama$Color color()
- int hashCode()
- boolean equals(Object o)
- boolean trader()
- String toString()

### Class: ch.njol.skript.entity.MinecartData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- MinecartData(MinecartData$MinecartType type)

Methods:
- void set(Minecart minecart)
- void set(Entity)
- Class<Minecart> getType()
- boolean match(Minecart minecart)
- boolean match(Entity)
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.MinecartData$MinecartType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ANY
- NORMAL
- STORAGE
- POWERED
- HOPPER
- EXPLOSIVE
- SPAWNER
- COMMAND

Methods:
- **static** MinecartData$MinecartType valueOf(String name)
- **static** MinecartData$MinecartType[] values()

### Class: ch.njol.skript.entity.MooshroomData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- MooshroomData(MushroomCow$Variant variant)

Methods:
- void set(MushroomCow mushroomCow)
- void set(Entity)
- Class<MushroomCow> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.PandaData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- PandaData(Panda$Gene mainGene, Panda$Gene hiddenGene)

Methods:
- void set(Panda panda)
- void set(Entity)
- Class<Panda> getType()
- EntityData<*> getSuperType()
- String toString(int flags)
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.ParrotData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- ParrotData(Parrot$Variant variant)

Methods:
- void set(Parrot parrot)
- void set(Entity)
- Class<Parrot> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.PigData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- PigData(Kleenean saddled, Object variant)

Methods:
- void set(Pig pig)
- void set(Entity)
- Class<Pig> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.PigData$PigVariantDummy
Type: Class

No public methods found

### Class: ch.njol.skript.entity.RabbitData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- RabbitData(Rabbit$Type type)

Methods:
- void set(Rabbit rabbit)
- void set(Entity)
- Class<Rabbit> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.SalmonData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- SalmonData(Object variant)

Methods:
- void set(Salmon entity)
- void set(Entity)
- Class<Salmon> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.SheepData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- SheepData(Kleenean sheared, Color[] colors)

Methods:
- void set(Sheep sheep)
- void set(Entity)
- Class<Sheep> getType()
- boolean match(Sheep sheep)
- boolean match(Entity)
- EntityData<*> getSuperType()
- String toString(int flags)
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.SimpleEntityData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- SimpleEntityData(Class<Entity> simpleInfo)
- SimpleEntityData(Entity simpleInfo)

Methods:
- boolean canSpawn(World world)
- Fields serialize() throws NotSerializableException
- void set(Entity entity)
- Class<Entity> getType()
- boolean match(Entity entity)
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)
- void deserialize(Fields fields) throws StreamCorruptedException, NotSerializableException

### Class: ch.njol.skript.entity.SimpleEntityData$SimpleEntityDataInfo
Type: Class

Methods:
- int hashCode()
- boolean equals(Object obj)

### Class: ch.njol.skript.entity.StriderData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- StriderData(Kleenean shivering)

Methods:
- void set(Strider entity)
- void set(Entity)
- Class<Strider> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.ThrownPotionData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Methods:
- ThrownPotion spawn(Location location, Consumer<ThrownPotion> consumer)
- Entity spawn(Location, Consumer)
- void set(ThrownPotion thrownPotion)
- void set(Entity)
- Class<ThrownPotion> getType()
- EntityData<*> getSuperType()
- String toString(int flags)
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.TropicalFishData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- TropicalFishData(TropicalFish$Pattern fishPattern, DyeColor bodyColor, DyeColor patternColor)

Methods:
- void set(TropicalFish tropicalFish)
- void set(Entity)
- Class<TropicalFish> getType()
- EntityData<TropicalFish> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.VillagerData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- VillagerData(Villager$Profession profession)

Methods:
- void set(Villager villager)
- void set(Entity)
- Class<Villager> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.WolfData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- WolfData(Kleenean isAngry, Kleenean isTamed)
- WolfData(WolfData$WolfStates isAngry)

Methods:
- void set(Wolf wolf)
- void set(Entity)
- Class<Wolf> getType()
- boolean match(Wolf wolf)
- boolean match(Entity)
- EntityData<Wolf> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.WolfData$WolfStates
Type: Class
Extends: java.lang.Record

Constructors:
- WolfData$WolfStates(Kleenean angry, Kleenean tamed)

Methods:
- int hashCode()
- boolean equals(Object o)
- String toString()
- Kleenean angry()
- Kleenean tamed()

### Class: ch.njol.skript.entity.WolfData$WolfVariantDummy
Type: Class

No public methods found

### Class: ch.njol.skript.entity.XpOrbData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- XpOrbData(int xp)

Methods:
- int getInternalExperience()
- ExperienceOrb spawn(Location loc, Consumer<ExperienceOrb> consumer)
- Entity spawn(Location, Consumer)
- void set(ExperienceOrb orb)
- void set(Entity)
- Class<ExperienceOrb> getType()
- int getExperience()
- EntityData<*> getSuperType()
- String toString(int flags)
- Z isSupertypeOf(EntityData<*> entityData)

### Class: ch.njol.skript.entity.ZombieVillagerData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- ZombieVillagerData(Villager$Profession profession)

Methods:
- void set(ZombieVillager zombieVillager)
- void set(Entity)
- Class<ZombieVillager> getType()
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

## Package: ch.njol.skript.events

### Class: ch.njol.skript.events.EvtAtTime
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent
Implements: java.lang.Comparable

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- void unload()
- String toString(Event event, boolean debug)
- int compareTo(EvtAtTime event)
- int compareTo(Object)
- boolean check(Event event)
- boolean isEventPrioritySupported()
- boolean postLoad()

### Class: ch.njol.skript.events.EvtBeaconEffect
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> exprs, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtBeaconToggle
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> exprs, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtBlock
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtBookEdit
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.events.EvtBookSign
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.events.EvtClick
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtCommand
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtDamage
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- boolean check(Event evt)

### Class: ch.njol.skript.events.EvtEntity
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.events.EvtEntityBlockChange
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtEntityPotion
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtEntityShootBow
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtEntityTarget
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.events.EvtEntityTransform
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtExperienceChange
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtExperienceSpawn
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- void unload()
- String toString(Event event, boolean debug)
- boolean check(Event event)
- boolean isEventPrioritySupported()
- boolean postLoad()

### Class: ch.njol.skript.events.EvtFirework
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtFirstJoin
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.events.EvtGameMode
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.events.EvtGrow
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtHarvestBlock
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtHealing
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtItem
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtLeash
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtLevel
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.events.EvtMove
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- Class<Event> getEventClasses()
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtMoveOn
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- void unload()
- String toString(Event event, boolean debug)
- boolean check(Event event)
- boolean isEventPrioritySupported()
- boolean postLoad()

### Class: ch.njol.skript.events.EvtPeriodical
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- void unload()
- String toString(Event event, boolean debug)
- boolean check(Event event)
- boolean isEventPrioritySupported()
- boolean postLoad()

### Class: ch.njol.skript.events.EvtPlantGrowth
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.events.EvtPlayerArmorChange
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtPlayerChunkEnter
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtPlayerCommandSend
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)
- ImmutableCollection<String> getOriginalCommands()

### Class: ch.njol.skript.events.EvtPortal
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtPressurePlate
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtRealTime
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- void unload()
- String toString(Event event, boolean debug)
- boolean check(Event event)
- boolean isEventPrioritySupported()
- boolean postLoad()

### Class: ch.njol.skript.events.EvtRealTime$RealTimeEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()

### Class: ch.njol.skript.events.EvtResourcePackResponse
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.events.EvtScript
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- void unload()
- String toString(Event event, boolean debug)
- boolean check(Event event)
- boolean isEventPrioritySupported()
- boolean postLoad()

### Class: ch.njol.skript.events.EvtSkript
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- **static** void onSkriptStart()
- **static** void onSkriptStop()
- void unload()
- String toString(Event event, boolean debug)
- boolean check(Event event)
- boolean isEventPrioritySupported()
- boolean postLoad()

### Class: ch.njol.skript.events.EvtSpectate
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtTeleport
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtVehicleCollision
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.EvtWeatherChange
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)
- boolean check(Event e)

### Class: ch.njol.skript.events.EvtWorld
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.events.SimpleEvents
Type: Class

No public methods found

## Package: ch.njol.skript.events.bukkit

### Class: ch.njol.skript.events.bukkit.ExperienceSpawnEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- ExperienceSpawnEvent(int exp, Location location)

Methods:
- boolean isCancelled()
- Location getLocation()
- int getSpawnedXP()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- void setSpawnedXP(int xp)

### Class: ch.njol.skript.events.bukkit.PreScriptLoadEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- PreScriptLoadEvent(List<Config> scripts)

Methods:
- List<Config> getScripts()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: ch.njol.skript.events.bukkit.ScheduledEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- ScheduledEvent(World world)

Methods:
- World getWorld()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: ch.njol.skript.events.bukkit.ScheduledNoWorldEvent
Type: Class
Extends: ch.njol.skript.events.bukkit.ScheduledEvent

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: ch.njol.skript.events.bukkit.ScriptEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: ch.njol.skript.events.bukkit.SkriptStartEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: ch.njol.skript.events.bukkit.SkriptStopEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

## Package: ch.njol.skript.expressions

### Class: ch.njol.skript.expressions.ExprAI
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Boolean> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Boolean convert(LivingEntity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprARGB
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- Expression<Integer> simplify()
- SyntaxElement simplify()
- Integer convert(Color from)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprAbsorbedBlocks
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Iterator<BlockStateBlock> iterator(Event e)
- Class<BlockStateBlock> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprActiveItem
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<ItemStack> getReturnType()
- ItemStack convert(LivingEntity livingEntity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprAffectedEntities
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- boolean isDefault()
- Iterator<LivingEntity> iterator(Event event)
- Class<LivingEntity> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprAge
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Object obj)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprAllBannedEntries
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprAllCommands
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprAllayJukebox
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Location> getReturnType()
- Location convert(LivingEntity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprAlphabetList
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<String> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprAltitude
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Number> getReturnType()
- Expression<Number> simplify()
- SyntaxElement simplify()
- Number convert(Location l)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprAmount
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprAmountOfItems
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprAngle
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Number> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprAnvilRepairCost
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Inventory inventory)
- Object convert(Object)
- String getPropertyName()

### Class: ch.njol.skript.expressions.ExprAnvilText
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<String> getReturnType()
- String convert(Inventory inv)
- Object convert(Object)
- String getPropertyName()

### Class: ch.njol.skript.expressions.ExprAnyOf
Type: Class
Extends: ch.njol.skript.expressions.base.WrapperExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean isSingle()
- boolean getAnd()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprAppliedEffect
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<PotionEffectType> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprAppliedEnchantments
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<EnchantmentType> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprArgument
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- boolean couldCauseArithmeticConfusion()
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- Class<Event> supportedEvents()
- boolean isLoopOf(String s)

### Class: ch.njol.skript.expressions.ExprArmorChangeItem
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event event, boolean debug)
- Class<Event> supportedEvents()
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprArmorSlot
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Slot> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprArrowKnockbackStrength
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Long> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Long convert(Projectile arrow)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprArrowPierceLevel
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Long> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Long convert(Projectile arrow)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprArrowsStuck
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Long> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Long convert(LivingEntity le)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprAttachedBlock
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Block> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprAttackCooldown
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Float> getReturnType()
- Float convert(HumanEntity e)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprAttacked
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Z init(Expression<*> vars, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<Entity> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- Class<Event> supportedEvents()

### Class: ch.njol.skript.expressions.ExprAttacker
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<Entity> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- Class<Event> supportedEvents()

### Class: ch.njol.skript.expressions.ExprBannerItem
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprBannerPatterns
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Pattern> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprBarterDrops
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult result)
- Class<ItemType> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprBarterInput
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult result)
- Class<ItemType> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprBeaconEffects
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<PotionEffectType> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprBeaconRange
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Double> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Double convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprBeaconTier
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Integer> getReturnType()
- Integer convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprBed
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Location> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Location convert(OfflinePlayer p)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprBeehiveFlower
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Location> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Location convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprBeehiveHoneyLevel
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprBiome
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Biome> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- Expression<Biome> simplify()
- SyntaxElement simplify()
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprBlock
Type: Class
Extends: ch.njol.skript.expressions.base.WrapperExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprBlockData
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<BlockData> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- BlockData convert(Object object)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprBlockHardness
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Number> getReturnType()
- Number convert(ItemType itemType)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprBlockSound
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprBlockSound$SoundType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BREAK
- FALL
- HIT
- PLACE
- STEP

Methods:
- **static** ExprBlockSound$SoundType valueOf(String name)
- **static** ExprBlockSound$SoundType[] values()
- Sound getSound(SoundGroup)

### Class: ch.njol.skript.expressions.ExprBlockSphere
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Iterator<Block> iterator(Event e)
- Class<Block> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- boolean isLoopOf(String s)

### Class: ch.njol.skript.expressions.ExprBlocks
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Iterator<Block> iterator(Event event)
- Class<Block> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprBookAuthor
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<String> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String convert(ItemType item)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprBookPages
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprBookTitle
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<String> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String convert(ItemType item)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprBreakSpeed
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Float> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprBrushableItem
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<ItemStack> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- ItemStack convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprCarryingBlockData
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<BlockData> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- BlockData convert(LivingEntity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprCaughtErrors
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprCharacterFromCodepoint
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<String> getReturnType()
- String toString(Event event, boolean debug)
- Expression<String> simplify()
- SyntaxElement simplify()
- String convert(Integer integer)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprCharacters
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<String> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprCharges
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprChatFormat
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<String> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprChatRecipients
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Player> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprChestInventory
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Inventory> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprChunk
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Chunk> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprClicked
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Object> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprClientViewDistance
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Long> getReturnType()
- Long convert(Player player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprCmdCooldownInfo
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprCodepoint
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Integer> getReturnType()
- Expression<Integer> simplify()
- SyntaxElement simplify()
- Integer convert(String string)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprColorOf
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Color> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprColoured
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isUnsafeFormat()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprCommand
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- Class<Event> supportedEvents()

### Class: ch.njol.skript.expressions.ExprCommandBlockCommand
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<String> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String convert(Object holder)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprCommandInfo
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprCommandSender
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

No public methods found

### Class: ch.njol.skript.expressions.ExprCompassTarget
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Location> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- Location convert(Player p)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprConfig
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.registrations.experiments.ReflectionExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Config> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprConsumedItem
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemStack> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- Class<Event> supportedEvents()

### Class: ch.njol.skript.expressions.ExprCoordinate
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- Expression<Number> simplify()
- SyntaxElement simplify()
- Number convert(Location l)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprCreeperMaxFuseTicks
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Long> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Long convert(LivingEntity e)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprCursorSlot
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Slot> getReturnType()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprCustomModelData
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprDamage
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprDamageCause
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

Methods:
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprDamagedItem
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprDateAgoLater
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Date> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- Expression<Date> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprDebugInfo
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<String> getReturnType()
- String convert(Object from)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprDefaultValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<*> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprDequeuedQueue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.registrations.experiments.QueueExperimentSyntax

Methods:
- Z init(Expression<*> expressions, int pattern, Kleenean delayed, SkriptParser$ParseResult result)
- Class<Object> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprDifference
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<*> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprDifficulty
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Difficulty> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Difficulty convert(World world)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprDirection
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Direction> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprDistance
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> vars, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Number> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprDomestication
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(LivingEntity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprDrops
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- Class<Event> supportedEvents()

### Class: ch.njol.skript.expressions.ExprDropsOfBlock
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprDuplicateCooldown
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(LivingEntity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprDurability
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Object object)
- Object convert(Object)
- String getPropertyName()

### Class: ch.njol.skript.expressions.ExprDustedStage
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprEgg
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

Methods:
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprElement
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<+TT> getReturnType()
- Class<+TT> possibleReturnTypes()
- boolean isSingle()
- Z canReturn(Class<*> returnType)
- String toString(Event event, boolean debug)
- Expression<+TT> simplify()
- SyntaxElement simplify()
- Expression<+TR> getConvertedExpression(Class<TR> to)

### Class: ch.njol.skript.expressions.ExprEnchantItem
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprEnchantingExpCost
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprEnchantmentBonus
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprEnchantmentLevel
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprEnchantmentOffer
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<EnchantmentOffer> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)
- int getCost(int slot, int bookshelves)

### Class: ch.njol.skript.expressions.ExprEnchantmentOfferCost
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Long> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Long convert(EnchantmentOffer offer)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprEnchantments
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<EnchantmentType> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprEnderChest
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Inventory> getReturnType()
- Inventory convert(Player p)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprEntities
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Iterator<Entity> iterator(Event event)
- Class<Entity> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- boolean isLoopOf(String s)

### Class: ch.njol.skript.expressions.ExprEntity
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Entity> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- boolean setTime(int time)
- Expression<+TR> getConvertedExpression(Class<TR> to)

### Class: ch.njol.skript.expressions.ExprEntityAttribute
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprEntityItemUseTime
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Timespan> getReturnType()
- Timespan convert(LivingEntity livingEntity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprEntityOwner
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<OfflinePlayer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- OfflinePlayer convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprEntitySize
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(LivingEntity from)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprEntitySnapshot
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<EntitySnapshot> getReturnType()
- EntitySnapshot convert(Object object)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprEntitySound
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprEntitySound$SoundType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DAMAGE
- DEATH
- FALL
- SWIM
- SPLASH
- EAT
- DRINK
- AMBIENT

Methods:
- **static** ExprEntitySound$SoundType valueOf(String name)
- **static** ExprEntitySound$SoundType[] values()
- Sound getSound(LivingEntity, int, ItemStack, boolean)

### Class: ch.njol.skript.expressions.ExprEntityStorageEntityCount
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprEventExpression
Type: Class
Extends: ch.njol.skript.expressions.base.WrapperExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprEvtInitiator
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Inventory> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprExactItem
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<ItemStack> getReturnType()
- ItemStack convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprExcept
Type: Class
Extends: ch.njol.skript.expressions.base.WrapperExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- Expression<*> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprExhaustion
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Number> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Number convert(Player player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprExperience
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Experience> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprExperienceCooldown
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(Player player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprExperienceCooldownChangeReason
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

Methods:
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprExplodedBlocks
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Block> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean d)
- Class<Event> supportedEvents()

### Class: ch.njol.skript.expressions.ExprExplosionBlockYield
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprExplosionYield
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprExplosiveYield
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Number> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Number convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprEyeLocation
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Location> getReturnType()
- Location convert(LivingEntity e)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprFacing
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Direction> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- Direction convert(Object o)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprFallDistance
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Number> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Number convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprFertilizedBlocks
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Iterator<BlockStateBlock> iterator(Event e)
- Class<BlockStateBlock> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprFilter
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.InputSource, ch.njol.skript.lang.KeyProviderExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> possibleReturnTypes()
- String getCurrentIndex()
- Z canReturn(Class<*> returnType)
- boolean areKeysRecommended()
- Set<ExprInput<*>> getDependentInputs()
- boolean isLoopOf(String candidateString)
- String[] getArrayKeys(Event event) throws IllegalStateException
- Iterator<KeyedValue<Object>> keyedIterator(Event event)
- Iterator<*> iterator(Event event)
- boolean hasIndices()
- Class<*> getReturnType()
- boolean canReturnKeys()
- Object getCurrentValue()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprFinalDamage
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprFireTicks
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprFireworkEffect
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<FireworkEffect> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprFirstEmptySlot
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Slot> getReturnType()
- Slot convert(Inventory from)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprFlightMode
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Boolean> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Boolean convert(Player player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprFoodLevel
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> vars, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<Number> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprFormatDate
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- String toString(Event e, boolean debug)
- Expression<String> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprFreezeTicks
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprFromUUID
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprFunction
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.registrations.experiments.ReflectionExperimentSyntax

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult result)
- Class<DynamicFunctionReference> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprGameMode
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> vars, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<GameMode> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- String toString(Event e, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprGameRule
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<GameruleValue> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprGlidingState
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Boolean> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- Boolean convert(LivingEntity e)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprGlowing
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Boolean> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- Boolean convert(Entity e)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprGravity
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Boolean> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- Boolean convert(Entity e)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprHanging
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Entity> getReturnType()
- boolean isSingle()
- Entity[] get(Event e)
- Object[] get(Event)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprHash
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- String toString(Event event, boolean debug)
- Expression<String> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprHatchingNumber
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Byte> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprHatchingType
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<EntityData<*>> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprHealAmount
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Double> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprHealReason
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

Methods:
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprHealth
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> vars, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<Number> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprHiddenPlayers
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult result)
- Class<Player> getReturnType()
- boolean isSingle()
- Player[] get(Event event)
- Object[] get(Event)
- String toString(Event event, boolean debug)
- Expression<Player> getViewers()

### Class: ch.njol.skript.expressions.ExprHostname
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprHotbarButton
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<Long> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprHotbarSlot
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Slot> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprHoverList
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String[] get(Event event)
- Object[] get(Event)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprHumidity
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Number> getReturnType()
- Number convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprIP
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprIndices
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprIndicesOfValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<*> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprInput
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Constructors:
- ExprInput(ExprInput<*> source, Class<+TT> types)

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<+TT> getReturnType()
- Class<+TT> possibleReturnTypes()
- Expression<*> getSource()
- boolean isSingle()
- String toString(Event event, boolean debug)
- ClassInfo<*> getSpecifiedType()
- Expression<+TR> getConvertedExpression(Class<TR> to)

### Class: ch.njol.skript.expressions.ExprInventory
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprInventoryAction
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

No public methods found

### Class: ch.njol.skript.expressions.ExprInventoryCloseReason
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprInventoryInfo
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprInventorySlot
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Slot> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprInverse
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Boolean> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprItem
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- void change(Event event, Object[] delta, Changer$ChangeMode mode)

### Class: ch.njol.skript.expressions.ExprItemAmount
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Long> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Long convert(Object item)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprItemCooldown
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Timespan> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprItemFlags
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemFlag> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprItemOwner
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<UUID> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- UUID convert(Item item)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprItemThrower
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<UUID> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- UUID convert(Item item)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprItemWithCustomModelData
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean kleenean, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprItemWithEnchantmentGlint
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprItemWithLore
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean kleenean, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprItemWithTooltip
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprItems
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Iterator<ItemType> iterator(Event event)
- Class<ItemType> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- boolean isLoopOf(String input)

### Class: ch.njol.skript.expressions.ExprItemsIn
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Iterator<Slot> iterator(Event event)
- Class<Slot> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- boolean isLoopOf(String s)

### Class: ch.njol.skript.expressions.ExprJoinSplit
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<String> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprKeyed
Type: Class
Extends: ch.njol.skript.expressions.base.WrapperExpression
Implements: ch.njol.skript.lang.KeyProviderExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String[] getAllKeys(Event event)
- String toString(Event event, boolean debug)
- boolean isLoopOf(String input)
- String[] getArrayKeys(Event event) throws IllegalStateException

### Class: ch.njol.skript.expressions.ExprLanguage
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<String> getReturnType()
- String convert(Player p)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprLastAttacker
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Entity> getReturnType()
- Entity convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprLastDamage
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Number> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Number convert(LivingEntity livingEntity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprLastDamageCause
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<EntityDamageEvent$DamageCause> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprLastDeathLocation
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Location> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Location convert(OfflinePlayer offlinePlayer)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprLastLoadedServerIcon
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<CachedServerIcon> getReturnType()
- boolean isSingle()
- CachedServerIcon[] get(Event e)
- Object[] get(Event)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprLastLoginTime
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Date> getReturnType()
- Date convert(OfflinePlayer player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprLastResourcePackResponse
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<PlayerResourcePackStatusEvent$Status> getReturnType()
- PlayerResourcePackStatusEvent$Status convert(Player p)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprLastSpawnedEntity
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Entity> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprLeashHolder
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Entity> getReturnType()
- Entity convert(LivingEntity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprLength
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Long> getReturnType()
- Expression<Long> simplify()
- SyntaxElement simplify()
- Long convert(String s)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprLevel
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Long> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Long convert(Player player)
- Object convert(Object)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprLevelProgress
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Number> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Number convert(Player p)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprLightLevel
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Byte> getReturnType()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprLocation
Type: Class
Extends: ch.njol.skript.expressions.base.WrapperExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprLocationAt
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Location> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprLocationFromVector
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Location> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprLocationOf
Type: Class
Extends: ch.njol.skript.expressions.base.WrapperExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprLocationVectorOffset
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Location> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- Expression<Location> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprLoopIteration
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprLoopValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> vars, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- Z canReturn(Class<*> returnType)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprLore
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprLowestHighestSolidBlock
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Block> getReturnType()
- Block convert(Location location)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprMOTD
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String[] get(Event e)
- Object[] get(Event)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprMaxDurability
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Object object)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprMaxFreezeTicks
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Timespan> getReturnType()
- Timespan convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprMaxHealth
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Number> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Number convert(LivingEntity e)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprMaxItemUseTime
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Timespan> getReturnType()
- Timespan convert(ItemStack item)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprMaxMinecartSpeed
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Number> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Number convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprMaxPlayers
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer[] get(Event event)
- Object[] get(Event)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprMaxStack
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Object from)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprMe
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Player> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprMemory
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Double> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprMendingRepairAmount
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprMessage
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprMetadata
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<+TT> getReturnType()
- Expression<*> getSource()
- Class<+TT> possibleReturnTypes()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- Expression<+TR> getConvertedExpression(Class<TR> to)

### Class: ch.njol.skript.expressions.ExprMiddleOfLocation
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Location> getReturnType()
- Expression<Location> simplify()
- SyntaxElement simplify()
- Location convert(Location loc)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprMidpoint
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: org.skriptlang.skript.log.runtime.SyntaxRuntimeErrorProducer

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Node getNode()

### Class: ch.njol.skript.expressions.ExprMinecartDerailedFlyingVelocity
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Vector convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprMoonPhase
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<MoonPhase> getReturnType()
- MoonPhase convert(World world)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprName
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String convert(Object object)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprNamed
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprNearestEntity
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Entity> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprNewBannerPattern
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Pattern> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Pattern> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprNoDamageTicks
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Long convert(LivingEntity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprNoDamageTime
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(LivingEntity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprNode
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression
Implements: ch.njol.skript.registrations.experiments.ReflectionExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int pattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Iterator<Node> iterator(Event event)
- Class<Node> getReturnType()
- Class<Node> possibleReturnTypes()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprNow
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Date> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprNumberOfCharacters
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- Expression<Long> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprNumbers
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Iterator<Number> iterator(Event event)
- Class<Number> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- Expression<Number> simplify()
- SyntaxElement simplify()
- boolean isLoopOf(String s)

### Class: ch.njol.skript.expressions.ExprOfflinePlayers
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<OfflinePlayer> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprOnScreenKickMessage
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- Class<Event> supportedEvents()

### Class: ch.njol.skript.expressions.ExprOnlinePlayersCount
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Long[] get(Event e)
- Object[] get(Event)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprOpenedInventory
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<Inventory> getReturnType()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprOps
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<OfflinePlayer> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprPandaGene
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Panda$Gene> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Panda$Gene convert(LivingEntity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprParse
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprParseError
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprPassenger
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Entity> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprPercent
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Number> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprPermissions
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprPickupDelay
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprPing
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- Long convert(Player player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprPlain
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprPlayerChatCompletions
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<String> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String convert(Player player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprPlayerProtocolVersion
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Integer> getReturnType()
- Integer convert(Player player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprPlayerlistHeaderFooter
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String convert(Player player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprPlugins
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprPortal
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- boolean isDefault()
- Iterator<Block> iterator(Event e)
- Class<Block> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprPortalCooldown
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprPotionEffect
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<PotionEffect> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprPotionEffectTier
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprPotionEffects
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<PotionEffect> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean d)

### Class: ch.njol.skript.expressions.ExprProjectileCriticalState
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Boolean> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Boolean convert(Projectile arrow)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprProjectileForce
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Float> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Class<Event> supportedEvents()

### Class: ch.njol.skript.expressions.ExprProtocolVersion
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Long[] get(Event e)
- Object[] get(Event)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprPushedBlocks
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Block> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- Class<Event> supportedEvents()

### Class: ch.njol.skript.expressions.ExprQueue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.registrations.experiments.QueueExperimentSyntax

Methods:
- Z init(Expression<*> expressions, int pattern, Kleenean delayed, SkriptParser$ParseResult result)
- Class<SkriptQueue> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprQueueStartEnd
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: ch.njol.skript.registrations.experiments.QueueExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int pattern, Kleenean delayed, SkriptParser$ParseResult result)
- Class<*> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Object convert(SkriptQueue from)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprQuitReason
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

Methods:
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprRandom
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Object> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprRandomCharacter
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprRandomNumber
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprRandomUUID
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<UUID> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprRawName
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprRawString
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprReadiedArrow
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemStack> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprRedstoneBlockPower
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Long> getReturnType()
- Long convert(Block b)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprRemainingAir
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(LivingEntity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprRepeat
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<String> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprResonatingTime
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Timespan> getReturnType()
- Timespan convert(Block from)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprRespawnLocation
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Location> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprResult
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression
Implements: ch.njol.skript.registrations.experiments.ReflectionExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult result)
- Class<Object> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprReversedList
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Constructors:
- ExprReversedList(Expression<*> list)

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- Z canReturn(Class<*> returnType)
- String toString(Event e, boolean debug)
- Expression<*> simplify()
- SyntaxElement simplify()
- Expression<+TR> getConvertedExpression(Class<TR> to)

### Class: ch.njol.skript.expressions.ExprRingingTime
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Timespan> getReturnType()
- Timespan convert(Block from)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprRound
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- String toString(Event event, boolean debug)
- Expression<Long> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprSaturation
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Number> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Number convert(Player player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprScoreboardTags
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String[] get(Event e)
- Object[] get(Event)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprScript
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Script> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprScripts
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.registrations.experiments.ReflectionExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Script> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprScriptsOld
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: org.skriptlang.skript.lang.experiment.SimpleExperimentalSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- ExperimentData getExperimentData()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprSeaLevel
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Long> getReturnType()
- Long convert(World world)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprSeaPickles
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprSeed
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<Long> getReturnType()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprSentCommands
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprServerIcon
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<CachedServerIcon> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- CachedServerIcon[] get(Event e)
- Object[] get(Event)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprSets
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Iterator<*> iterator(Event event)
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprShooter
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<LivingEntity> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprShuffledList
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Constructors:
- ExprShuffledList(Expression<*> list)

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- Z canReturn(Class<*> returnType)
- String toString(Event e, boolean debug)
- Expression<+TR> getConvertedExpression(Class<TR> to)

### Class: ch.njol.skript.expressions.ExprSignText
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- boolean isSingle()
- String toString(Event e, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprSimulationDistance
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Object object)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprSkull
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<ItemType> getReturnType()
- ItemType convert(OfflinePlayer player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprSkullOwner
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<OfflinePlayer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- OfflinePlayer convert(Object object)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprSlotIndex
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- Long convert(Slot slot)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprSortedList
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Constructors:
- ExprSortedList(Expression<*> list)

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- **static** I compare(T a, A b) throws IllegalArgumentException, ClassCastException
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- Z canReturn(Class<*> returnType)
- String toString(Event e, boolean debug)
- Expression<*> simplify()
- SyntaxElement simplify()
- Expression<+TR> getConvertedExpression(Class<TR> to)

### Class: ch.njol.skript.expressions.ExprSourceBlock
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Block> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprSpawn
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Location> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprSpawnEggEntity
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<EntitySnapshot> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- EntitySnapshot convert(Object object)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprSpawnReason
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

No public methods found

### Class: ch.njol.skript.expressions.ExprSpawnerType
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<EntityData> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- EntityData convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprSpectatorTarget
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Entity> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprSpeed
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- Number convert(Player p)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprStringCase
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<String> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprStringColor
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<*> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprSubnodeValue
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> expressions, int pattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Object convert(Node node)
- Object convert(Object)
- **static** TConverted convertedValue(Object value, ClassInfo<TConverted> expected)

### Class: ch.njol.skript.expressions.ExprSubstring
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- Expression<String> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprTPS
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprTablistName
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<String> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String convert(Player player)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprTablistedPlayers
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Player> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprTamer
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<Player> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprTarget
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- **static** TT getTarget(LivingEntity origin, EntityData<TT> type, double raysize)
- Class<Entity> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprTargetedBlock
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<Block> getReturnType()
- String toString(Event event, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprTeleportCause
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

No public methods found

### Class: ch.njol.skript.expressions.ExprTemperature
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Number> getReturnType()
- Number convert(Block block)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprTernary
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprTime
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<Time> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprTimeLived
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprTimePlayed
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(OfflinePlayer offlinePlayer)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprTimeSince
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Timespan> getReturnType()
- String toString(Event event, boolean debug)
- Timespan convert(Date date)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprTimeState
Type: Class
Extends: ch.njol.skript.expressions.base.WrapperExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprTimes
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Iterator<Long> iterator(Event e)
- Class<Long> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)
- Expression<Long> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprTimespanDetails
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- Expression<Long> simplify()
- SyntaxElement simplify()
- Long convert(Timespan time)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprTool
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<Slot> getReturnType()
- String toString(Event event, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprTotalExperience
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Entity entity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprTransform
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.InputSource, ch.njol.skript.lang.KeyProviderExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> possibleReturnTypes()
- String getCurrentIndex()
- Z canReturn(Class<*> returnType)
- boolean areKeysRecommended()
- Set<ExprInput<*>> getDependentInputs()
- boolean isLoopOf(String candidateString)
- String[] getArrayKeys(Event event) throws IllegalStateException
- Iterator<KeyedValue<Object>> keyedIterator(Event event)
- Iterator<*> iterator(Event event)
- boolean hasIndices()
- Class<*> getReturnType()
- boolean canReturnKeys()
- Object getCurrentValue()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprTransformReason
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

Methods:
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprTypeOf
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- Object convert(Object object)

### Class: ch.njol.skript.expressions.ExprUUID
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<UUID> getReturnType()
- UUID convert(Object object)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprUnbreakable
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- ItemType convert(ItemType itemType)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprUnixDate
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Date> getReturnType()
- Expression<Date> simplify()
- SyntaxElement simplify()
- Date convert(Number n)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprUnixTicks
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Number> getReturnType()
- Expression<Number> simplify()
- SyntaxElement simplify()
- Number convert(Date f)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprUnleashReason
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<EntityUnleashEvent$UnleashReason> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprValue
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int pattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Object convert(Object object)

### Class: ch.njol.skript.expressions.ExprValueWithin
Type: Class
Extends: ch.njol.skript.expressions.base.WrapperExpression
Implements: ch.njol.skript.lang.KeyProviderExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean canReturnKeys()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- boolean areKeysRecommended()
- String toString(Event event, boolean debug)
- boolean isLoopOf(String input)
- String[] getArrayKeys(Event event) throws IllegalStateException

### Class: ch.njol.skript.expressions.ExprVectorAngleBetween
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Number> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprVectorBetweenLocations
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Vector> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprVectorCrossProduct
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Vector> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprVectorCylindrical
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- boolean isSingle()
- **static** Vector fromCylindricalCoordinates(double radius, double, double phi)
- String toString(Event event, boolean debug)
- Expression<Vector> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprVectorDotProduct
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Number> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprVectorFromDirection
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprVectorFromXYZ
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Vector> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprVectorFromYawAndPitch
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- **static** float wrapAngleDeg(float angle)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Vector> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprVectorLength
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Number> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Expression<Number> simplify()
- SyntaxElement simplify()
- Number convert(Vector vector)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprVectorNormalize
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Vector> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprVectorOfLocation
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Vector> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprVectorProjection
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Vector> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprVectorRandom
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprVectorSpherical
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- **static** Vector fromSphericalCoordinates(double radius, double, double theta)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<Vector> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprVectorSquaredLength
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Number> getReturnType()
- Expression<Number> simplify()
- SyntaxElement simplify()
- Number convert(Vector vector)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprVehicle
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Entity> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprVelocity
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Vector> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- Vector convert(Entity e)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprVersion
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprVersionString
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String[] get(Event event)
- Object[] get(Event)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprViewDistance
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Object object)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprVillagerLevel
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Number convert(LivingEntity from)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprVillagerProfession
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Villager$Profession> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Villager$Profession convert(LivingEntity from)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprVillagerType
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Villager$Type> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Villager$Type convert(LivingEntity from)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprWardenAngryAt
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<LivingEntity> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- LivingEntity convert(LivingEntity livingEntity)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprWardenEntityAnger
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprWeather
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<WeatherType> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprWhether
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int pattern, Kleenean delayed, SkriptParser$ParseResult result)
- Class<Boolean> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprWhitelist
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<OfflinePlayer> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprWithFireResistance
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprWithItemFlags
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemType> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.expressions.ExprWorld
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- Class<World> getReturnType()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String toString(Event e, boolean debug)
- boolean setTime(int time)

### Class: ch.njol.skript.expressions.ExprWorldBorder
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<WorldBorder> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- WorldBorder convert(Object object)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprWorldBorderCenter
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Location> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Location convert(WorldBorder worldBorder)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprWorldBorderDamageAmount
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Double> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Double convert(WorldBorder worldBorder)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprWorldBorderDamageBuffer
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Double> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Double convert(WorldBorder worldBorder)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprWorldBorderSize
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Double> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- Double convert(WorldBorder worldBorder)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprWorldBorderWarningDistance
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(WorldBorder worldBorder)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprWorldBorderWarningTime
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(WorldBorder worldBorder)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprWorldEnvironment
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<World$Environment> getReturnType()
- World$Environment convert(World world)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprWorldFromName
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<World> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprWorlds
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Iterator<World> iterator(Event e)
- Class<World> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.expressions.ExprXOf
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- String toString(Event event, boolean debug)
- Expression<*> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.expressions.ExprXYZComponent
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Expression<Number> simplify()
- SyntaxElement simplify()
- Number convert(Object object)
- Object convert(Object)

### Class: ch.njol.skript.expressions.ExprYawPitch
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- **static** float getYaw(Vector vector)
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- **static** float fromSkriptYaw(float yaw)
- **static** float skriptYaw(float yaw)
- **static** float getPitch(Vector vector)
- Class<Float> getReturnType()
- **static** float skriptPitch(float pitch)
- **static** float fromSkriptPitch(float pitch)
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Float convert(Object object)
- Object convert(Object)
- **static** Vector fromYawAndPitch(float yaw, float pitch)

## Package: ch.njol.skript.expressions.arithmetic

### Class: ch.njol.skript.expressions.arithmetic.ArithmeticGettable
Type: Interface

Methods:
- Class<+TT> getReturnType()
- TT get(Event)

### Class: ch.njol.skript.expressions.arithmetic.ArithmeticChain
Type: Class
Implements: ch.njol.skript.expressions.arithmetic.ArithmeticGettable

Constructors:
- ArithmeticChain(ArithmeticGettable<TL> left, Operator operator, ArithmeticGettable<TR> right, OperationInfo<TL, TR, TT> operationInfo)

Methods:
- Class<+TT> getReturnType()
- TT get(Event event)
- **static** ArithmeticGettable<TT> parse(List<*> chain)

### Class: ch.njol.skript.expressions.arithmetic.ArithmeticExpressionInfo
Type: Class
Extends: java.lang.Record
Implements: ch.njol.skript.expressions.arithmetic.ArithmeticGettable

Constructors:
- ArithmeticExpressionInfo(Expression<+TT> expression)

Methods:
- Expression<+TT> expression()
- Class<+TT> getReturnType()
- int hashCode()
- boolean equals(Object o)
- TT get(Event event)
- String toString()

### Class: ch.njol.skript.expressions.arithmetic.ExprArithmetic
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<+TT> getReturnType()
- Class<+TT> possibleReturnTypes()
- boolean isSingle()
- Z canReturn(Class<*> returnType)
- String toString(Event event, boolean debug)
- Expression<TT> simplify()
- SyntaxElement simplify()
- **static** void registerExpression()

## Package: ch.njol.skript.expressions.base

### Class: ch.njol.skript.expressions.base.EventValueExpression
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.DefaultExpression

Constructors:
- EventValueExpression(Class<+TT> type)
- EventValueExpression(Class<+TT> type, boolean exact)
- EventValueExpression(Class<+TT> type, Changer<-TT> changer)
- EventValueExpression(Class<+TT> type, Changer<-TT> changer, boolean exact)

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parser)
- boolean init()
- boolean isDefault()
- **static** DefaultSyntaxInfos$Expression$Builder<DefaultSyntaxInfos$Expression$Builder<*TE, TT>, TE, TT> infoBuilder(Class<TE> expressionClass, Class<TT> returnType, String patterns)
- Class<+TT> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- boolean setTime(int time)
- **static** DefaultSyntaxInfos$Expression<TE, TT> register(SyntaxRegistry registry, Class<TE> expressionClass, Class<TT> returnType, String pattern)
- **static** DefaultSyntaxInfos$Expression<TE, TT> register(SyntaxRegistry registry, Class<TE> expressionClass, Class<TT> returnType, String patterns)
- **static** V register(Class<EventValueExpression<TT>> expression, Class<TT> type, String pattern)
- **static** V register(Class<EventValueExpression<TT>> expression, Class<TT> type, String patterns)

### Class: ch.njol.skript.expressions.base.PropertyExpression
Type: Abstract Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- **static** String[] getDefaultPatterns(String property, String fromType)
- **static** DefaultSyntaxInfos$Expression$Builder<DefaultSyntaxInfos$Expression$Builder<*TE, TT>, TE, TT> infoBuilder(Class<TE> expressionClass, Class<TT> returnType, String property, String type, boolean isDefault)
- [TT getAll(Event event)
- Expression<+TF> getExpr()
- boolean isSingle()
- **static** String[] getPatterns(String property, String fromType)
- boolean getAnd()
- Expression<+TT> simplify()
- SyntaxElement simplify()
- **static** DefaultSyntaxInfos$Expression<TE, TT> registerDefault(SyntaxRegistry registry, Class<TE> expressionClass, Class<TT> returnType, String property, String fromType)
- **static** V registerDefault(Class<Expression<TT>> expressionClass, Class<TT> type, String property, String fromType)
- **static** DefaultSyntaxInfos$Expression<TE, TT> register(SyntaxRegistry registry, Class<TE> expressionClass, Class<TT> returnType, String property, String fromType)
- **static** V register(Class<Expression<TT>> expressionClass, Class<TT> type, String property, String fromType)

### Class: ch.njol.skript.expressions.base.SectionExpression
Type: Abstract Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*>, int, Kleenean, SkriptParser$ParseResult, SectionNode, List<TriggerItem>)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean isSectionOnly()
- Section getAsSection()

### Class: ch.njol.skript.expressions.base.SimplePropertyExpression
Type: Abstract Class
Extends: ch.njol.skript.expressions.base.PropertyExpression
Implements: org.skriptlang.skript.lang.converter.Converter

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- TT convert(T)

### Class: ch.njol.skript.expressions.base.WrapperExpression
Type: Abstract Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Constructors:
- WrapperExpression(SimpleExpression<+TT> expr)

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<+TT> possibleReturnTypes()
- int getTime()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Z canReturn(Class<*> returnType)
- boolean getAnd()
- Object beforeChange(Expression<*> changed, Object delta)
- boolean isDefault()
- Iterator<+TT> iterator(Event event)
- Class<+TT> getReturnType()
- Expression<*> getExpr()
- boolean isSingle()
- Expression<+TT> simplify()
- SyntaxElement simplify()
- boolean setTime(int time)

## Package: ch.njol.skript.hooks

### Class: ch.njol.skript.hooks.Hook
Type: Abstract Class

Methods:
- String getName()
- TP getPlugin()

### Class: ch.njol.skript.hooks.VaultHook
Type: Class
Extends: ch.njol.skript.hooks.Hook

Methods:
- String getName()

## Package: ch.njol.skript.hooks.chat.expressions

### Class: ch.njol.skript.hooks.chat.expressions.ExprPrefixSuffix
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String convert(Player player)
- Object convert(Object)

## Package: ch.njol.skript.hooks.economy.classes

### Class: ch.njol.skript.hooks.economy.classes.Money
Type: Class

Constructors:
- Money(double amount)

Methods:
- String toString()
- **static** Money parse(String s)
- double getAmount()

## Package: ch.njol.skript.hooks.economy.expressions

### Class: ch.njol.skript.hooks.economy.expressions.ExprBalance
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Money> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Money convert(OfflinePlayer player)
- Object convert(Object)

## Package: ch.njol.skript.hooks.permission.expressions

### Class: ch.njol.skript.hooks.permission.expressions.ExprAllGroups
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.hooks.permission.expressions.ExprGroup
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- void change(Event e, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

## Package: ch.njol.skript.hooks.regions

### Class: ch.njol.skript.hooks.regions.GriefPreventionHook
Type: Class
Extends: ch.njol.skript.hooks.regions.RegionsPlugin

Methods:
- Region getRegion_i(World world, String name)
- boolean hasMultipleOwners_i()
- String getName()
- boolean canBuild_i(Player p, Location l)
- Collection<Region> getRegionsAt_i(Location l)

### Class: ch.njol.skript.hooks.regions.GriefPreventionHook$GriefPreventionRegion
Type: Class
Extends: ch.njol.skript.hooks.regions.classes.Region

Constructors:
- GriefPreventionHook$GriefPreventionRegion(GriefPreventionHook this$0, Claim claim)

Methods:
- Fields serialize()
- boolean contains(Location l)
- boolean isOwner(OfflinePlayer p)
- int hashCode()
- boolean equals(Object o)
- RegionsPlugin<*> getPlugin()
- Collection<OfflinePlayer> getOwners()
- String toString()
- Iterator<Block> getBlocks()
- boolean isMember(OfflinePlayer p)
- void deserialize(Fields fields) throws StreamCorruptedException
- Collection<OfflinePlayer> getMembers()

### Class: ch.njol.skript.hooks.regions.PreciousStonesHook
Type: Class
Extends: ch.njol.skript.hooks.regions.RegionsPlugin

Methods:
- Region getRegion_i(World world, String name)
- boolean hasMultipleOwners_i()
- String getName()
- boolean canBuild_i(Player p, Location l)
- Collection<Region> getRegionsAt_i(Location l)

### Class: ch.njol.skript.hooks.regions.PreciousStonesHook$PreciousStonesRegion
Type: Class
Extends: ch.njol.skript.hooks.regions.classes.Region

Constructors:
- PreciousStonesHook$PreciousStonesRegion(PreciousStonesHook this$0, Field field)

Methods:
- Fields serialize() throws NotSerializableException
- boolean contains(Location l)
- boolean isOwner(OfflinePlayer p)
- int hashCode()
- boolean equals(Object o)
- RegionsPlugin<*> getPlugin()
- Collection<OfflinePlayer> getOwners()
- String toString()
- Iterator<Block> getBlocks()
- boolean isMember(OfflinePlayer p)
- void deserialize(Fields fields) throws StreamCorruptedException, NotSerializableException
- Collection<OfflinePlayer> getMembers()

### Class: ch.njol.skript.hooks.regions.RegionsPlugin
Type: Abstract Class
Extends: ch.njol.skript.hooks.Hook

Methods:
- Region getRegion_i(World, String)
- **static** Set<Region> getRegionsAt(Location l)
- **static** boolean canBuild(Player p, Location l)
- boolean hasMultipleOwners_i()
- **static** Region getRegion(World world, String name)
- **static** RegionsPlugin<*> getPlugin(String name)
- boolean canBuild_i(Player, Location)
- Collection<Region> getRegionsAt_i(Location)
- **static** boolean hasMultipleOwners()

### Class: ch.njol.skript.hooks.regions.ResidenceHook
Type: Class
Extends: ch.njol.skript.hooks.regions.RegionsPlugin

Methods:
- Region getRegion_i(World world, String name)
- boolean hasMultipleOwners_i()
- String getName()
- boolean canBuild_i(Player p, Location l)
- Collection<Region> getRegionsAt_i(Location l)

### Class: ch.njol.skript.hooks.regions.ResidenceHook$ResidenceRegion
Type: Class
Extends: ch.njol.skript.hooks.regions.classes.Region

Constructors:
- ResidenceHook$ResidenceRegion(ResidenceHook this$0, World world, ClaimedResidence res)

Methods:
- Fields serialize() throws NotSerializableException
- boolean contains(Location l)
- boolean isOwner(OfflinePlayer p)
- int hashCode()
- boolean equals(Object o)
- RegionsPlugin<*> getPlugin()
- Collection<OfflinePlayer> getOwners()
- String toString()
- Iterator<Block> getBlocks()
- boolean isMember(OfflinePlayer p)
- Collection<OfflinePlayer> getMembers()
- void deserialize(Fields fields) throws StreamCorruptedException, NotSerializableException

### Class: ch.njol.skript.hooks.regions.WorldGuardHook
Type: Class
Extends: ch.njol.skript.hooks.regions.RegionsPlugin

Methods:
- Region getRegion_i(World world, String name)
- boolean hasMultipleOwners_i()
- String getName()
- boolean canBuild_i(Player p, Location l)
- Collection<Region> getRegionsAt_i(Location l)

### Class: ch.njol.skript.hooks.regions.WorldGuardHook$WorldGuardRegion
Type: Class
Extends: ch.njol.skript.hooks.regions.classes.Region

Constructors:
- WorldGuardHook$WorldGuardRegion(WorldGuardHook this$0, World world, ProtectedRegion region)

Methods:
- Fields serialize() throws NotSerializableException
- boolean contains(Location l)
- boolean isOwner(OfflinePlayer p)
- int hashCode()
- boolean equals(Object o)
- RegionsPlugin<*> getPlugin()
- Collection<OfflinePlayer> getOwners()
- String toString()
- Iterator<Block> getBlocks()
- boolean isMember(OfflinePlayer p)
- void deserialize(Fields fields) throws StreamCorruptedException, NotSerializableException
- Collection<OfflinePlayer> getMembers()

## Package: ch.njol.skript.hooks.regions.classes

### Class: ch.njol.skript.hooks.regions.classes.Region
Type: Abstract Class
Implements: ch.njol.yggdrasil.YggdrasilSerializable$YggdrasilExtendedSerializable

Methods:
- boolean contains(Location)
- boolean isOwner(OfflinePlayer)
- int hashCode()
- boolean equals(Object)
- RegionsPlugin<*> getPlugin()
- Collection<OfflinePlayer> getOwners()
- String toString()
- Iterator<Block> getBlocks()
- boolean isMember(OfflinePlayer)
- Collection<OfflinePlayer> getMembers()

## Package: ch.njol.skript.hooks.regions.conditions

### Class: ch.njol.skript.hooks.regions.conditions.CondCanBuild
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.hooks.regions.conditions.CondIsMember
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.hooks.regions.conditions.CondRegionContains
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)
- boolean check(Event event)

## Package: ch.njol.skript.hooks.regions.events

### Class: ch.njol.skript.hooks.regions.events.EvtRegionBorder
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- void unload()
- String toString(Event event, boolean debug)
- boolean check(Event event)
- boolean isEventPrioritySupported()
- boolean postLoad()

### Class: ch.njol.skript.hooks.regions.events.RegionBorderEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- RegionBorderEvent(Region region, Player player, boolean enter)

Methods:
- boolean isCancelled()
- Player getPlayer()
- Region getRegion()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- boolean isEntering()
- **static** HandlerList getHandlerList()

## Package: ch.njol.skript.hooks.regions.expressions

### Class: ch.njol.skript.hooks.regions.expressions.ExprBlocksInRegion
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Iterator<Block> iterator(Event e)
- Class<Block> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.hooks.regions.expressions.ExprMembersOfRegion
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<OfflinePlayer> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.hooks.regions.expressions.ExprRegion
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

No public methods found

### Class: ch.njol.skript.hooks.regions.expressions.ExprRegionsAt
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Region> getReturnType()
- boolean isSingle()
- String toString(Event e, boolean debug)

## Package: ch.njol.skript.lang

### Class: ch.njol.skript.lang.Debuggable
Type: Interface

Methods:
- String toString(Event, boolean)
- String toString()

### Class: ch.njol.skript.lang.DefaultExpression
Type: Interface
Implements: ch.njol.skript.lang.Expression

Methods:
- boolean init()
- boolean isDefault()

### Class: ch.njol.skript.lang.EventRestrictedSyntax
Type: Interface

Methods:
- Class<Event> supportedEvents()

### Class: ch.njol.skript.lang.ExecutionIntent
Type: Interface
Implements: java.lang.Comparable

Methods:
- **static** ExecutionIntent$StopSections stopSections(int levels)
- ExecutionIntent use()
- **static** ExecutionIntent$StopSections stopSection()
- **static** ExecutionIntent$StopTrigger stopTrigger()

### Class: ch.njol.skript.lang.Expression
Type: Interface
Implements: ch.njol.skript.lang.SyntaxElement, ch.njol.skript.lang.Debuggable, ch.njol.skript.lang.Loopable, ch.njol.skript.lang.simplification.Simplifiable

Methods:
- Map<Changer$ChangeMode, Class<*>> getAcceptedChangeModes()
- int getTime()
- Z canReturn(Class<*> returnType)
- [TT getArray(Event)
- Object beforeChange(Expression<*> changed, Object delta)
- Optional<TT> getOptionalSingle(Event event)
- String getSyntaxTypeName()
- Stream<+TT> stream(Event event)
- boolean setTime(int)
- Class<*> acceptChange(Changer$ChangeMode)
- [TT getAll(Event)
- Class<+TT> possibleReturnTypes()
- void change(Event, Object[], Changer$ChangeMode)
- boolean getAnd()
- Z check(Event, Predicate<-TT>, boolean)
- Z check(Event, Predicate<-TT>)
- Stream<+TT> streamAll(Event event)
- Expression<+TR> getConvertedExpression(Class<TR>)
- V changeInPlace(Event event, Function<TT, TR> changeFunction)
- V changeInPlace(Event event, Function<TT, TR> changeFunction, boolean getAll)
- TT getSingle(Event)
- boolean isDefault()
- Class<+TT> getReturnType()
- Expression<*> getSource()
- boolean canBeSingle()
- boolean isSingle()
- Expression<+TT> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.lang.InputSource
Type: Interface

Methods:
- boolean hasIndices()
- Object getCurrentValue()
- String getCurrentIndex()
- Set<ExprInput<*>> getDependentInputs()
- Expression<*> parseExpression(String expr, ParserInstance parser, int flags)

### Class: ch.njol.skript.lang.KeyProviderExpression
Type: Interface
Implements: ch.njol.skript.lang.Expression

Methods:
- Iterator<KeyedValue<TT>> keyedIterator(Event event)
- boolean canReturnKeys()
- **static** Z canReturnKeys(Expression<*> expression)
- String[] getAllKeys(Event event)
- boolean isSingle()
- boolean areKeysRecommended()
- **static** Z areKeysRecommended(Expression<*> expression)
- boolean isIndexLoop(String input)
- boolean isLoopOf(String input)
- String[] getArrayKeys(Event) throws IllegalStateException

### Class: ch.njol.skript.lang.KeyReceiverExpression
Type: Interface
Implements: ch.njol.skript.lang.Expression

Methods:
- void change(Event, Object[], Changer$ChangeMode, String[])

### Class: ch.njol.skript.lang.Literal
Type: Interface
Implements: ch.njol.skript.lang.Expression

Methods:
- TT getSingle()
- [TT getAll()
- [TT getArray()
- Literal<+TR> getConvertedExpression(Class<TR>)
- Expression getConvertedExpression(Class[])

### Class: ch.njol.skript.lang.Loopable
Type: Interface

Methods:
- Iterator<+TT> iterator(Event)
- boolean supportsLoopPeeking()
- boolean isLoopOf(String)

### Class: ch.njol.skript.lang.ReturnHandler
Type: Interface

Methods:
- V returnValues(Event, Expression<+TT>)
- Class<+TT> returnValueType()
- boolean isSingleReturnValue()
- ReturnableTrigger<TT> loadReturnableTrigger(SectionNode node, String name, SkriptEvent event)
- void loadReturnableSectionCode(SectionNode node)
- ReturnableTrigger<TT> loadReturnableSectionCode(SectionNode node, String name, Class<Event> events)

### Class: ch.njol.skript.lang.SectionExitHandler
Type: Interface

Methods:
- void exit(Event)

### Class: ch.njol.skript.lang.SyntaxElement
Type: Interface

Methods:
- Z init(Expression<*>, int, Kleenean, SkriptParser$ParseResult)
- String getSyntaxTypeName()
- ParserInstance getParser()
- boolean preInit()

### Class: ch.njol.skript.lang.Unit
Type: Interface
Implements: java.lang.Cloneable

Methods:
- Unit clone()
- String toString()
- String toString(int)
- void setAmount(double)
- int getAmount()

### Class: ch.njol.skript.lang.VerboseAssert
Type: Interface

Methods:
- **static** String getExpressionValue(Expression<*> expression, Event event)
- String getReceivedMessage(Event)
- String getExpectedMessage(Event)

### Class: ch.njol.skript.lang.Condition
Type: Abstract Class
Extends: ch.njol.skript.lang.Statement
Implements: org.skriptlang.skript.lang.condition.Conditional, org.skriptlang.skript.log.runtime.SyntaxRuntimeErrorProducer, ch.njol.skript.lang.simplification.Simplifiable

Methods:
- String getSyntaxTypeName()
- boolean preInit()
- boolean isNegated()
- boolean run(Event event)
- **static** Condition parse(String input, String defaultError)
- Condition simplify()
- SyntaxElement simplify()
- Node getNode()
- boolean check(Event)
- Kleenean evaluate(Event event)
- Kleenean evaluate(Object)

### Class: ch.njol.skript.lang.Condition$ConditionType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- COMBINED
- PROPERTY
- PATTERN_MATCHES_EVERYTHING

Methods:
- **static** Condition$ConditionType valueOf(String name)
- **static** Condition$ConditionType[] values()
- Priority priority()

### Class: ch.njol.skript.lang.Effect
Type: Abstract Class
Extends: ch.njol.skript.lang.Statement
Implements: org.skriptlang.skript.log.runtime.SyntaxRuntimeErrorProducer

Methods:
- String getSyntaxTypeName()
- boolean preInit()
- boolean run(Event event)
- Node getNode()
- **static** Effect parse(String input, String defaultError)

### Class: ch.njol.skript.lang.EffectSection
Type: Abstract Class
Extends: ch.njol.skript.lang.Section

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Z init(Expression<*>, int, Kleenean, SkriptParser$ParseResult, SectionNode, List<TriggerItem>)
- boolean hasSection()
- **static** EffectSection parse(String input, String defaultError, SectionNode sectionNode, List<TriggerItem> triggerItems)
- **static** EffectSection parse(String input, String defaultError, SectionNode sectionNode, boolean isNodeForEffectSection, List<TriggerItem> triggerItems)

### Class: ch.njol.skript.lang.EffectSectionEffect
Type: Class
Extends: ch.njol.skript.lang.Effect

Constructors:
- EffectSectionEffect(EffectSection effectSection)

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String getIndentation()
- TriggerItem setNext(TriggerItem next)
- String toString(Event event, boolean debug)
- TriggerItem getNext()
- TriggerItem setParent(TriggerSection parent)

### Class: ch.njol.skript.lang.ExecutionIntent$StopSections
Type: Class
Implements: ch.njol.skript.lang.ExecutionIntent

Methods:
- int hashCode()
- ExecutionIntent$StopSections use()
- ExecutionIntent use()
- boolean equals(Object obj)
- String toString()
- int compareTo(ExecutionIntent other)
- int compareTo(Object)
- int levels()

### Class: ch.njol.skript.lang.ExecutionIntent$StopTrigger
Type: Class
Implements: ch.njol.skript.lang.ExecutionIntent

Methods:
- ExecutionIntent$StopTrigger use()
- ExecutionIntent use()
- String toString()
- int compareTo(ExecutionIntent other)
- int compareTo(Object)

### Class: ch.njol.skript.lang.ExpressionInfo
Type: Class
Extends: ch.njol.skript.lang.SyntaxElementInfo

Constructors:
- ExpressionInfo(String patterns, Class<TT> returnType, Class<TE> expressionClass, String originClassPath) throws IllegalArgumentException
- ExpressionInfo(String patterns, Class<TT> returnType, Class<TE> expressionClass, String originClassPath, ExpressionType expressionType) throws IllegalArgumentException

Methods:
- Class<TT> getReturnType()
- ExpressionType getExpressionType()

### Class: ch.njol.skript.lang.ExpressionList
Type: Class
Implements: ch.njol.skript.lang.Expression

Constructors:
- ExpressionList(Expression<+TT> expressions, Class<TT> returnType, boolean and)
- ExpressionList(Expression<+TT> expressions, Class<TT> returnType, Class<*> possibleReturnTypes, boolean and)

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- [TT getAll(Event event)
- int getTime()
- void invertAnd()
- Class<+TT> possibleReturnTypes()
- void change(Event event, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- Expression<+TT> getExpressions()
- boolean getAnd()
- [TT getArray(Event event)
- List<Expression<+TT>> getAllExpressions()
- Z check(Event event, Predicate<-TT> checker, boolean negated)
- Z check(Event event, Predicate<-TT> checker)
- boolean isLoopOf(String input)
- Expression<+TR> getConvertedExpression(Class<TR> to)
- V changeInPlace(Event event, Function<TT, TR> changeFunction, boolean getAll)
- TT getSingle(Event event)
- boolean isDefault()
- Iterator<+TT> iterator(Event event)
- Class<TT> getReturnType()
- Expression<*> getSource()
- boolean isSingle()
- String toString(Event event, boolean debug)
- String toString()
- Expression<TT> simplify()
- SyntaxElement simplify()
- boolean setTime(int time)

### Class: ch.njol.skript.lang.ExpressionSection
Type: Class
Extends: ch.njol.skript.lang.Section

Constructors:
- ExpressionSection(SectionExpression<*> expression)

Methods:
- Trigger loadCodeTask(SectionNode sectionNode, String name, Runnable beforeLoading, Runnable afterLoading, Class<Event> events)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- V setTriggerItems(List<TriggerItem> items)
- void loadOptionalCode(SectionNode sectionNode)
- void loadCode(SectionNode sectionNode)
- String toString(Event event, boolean debug)
- SectionExpression<*> getAsExpression()
- boolean runSection(Event event)

### Class: ch.njol.skript.lang.ExpressionType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SIMPLE
- EVENT
- COMBINED
- PROPERTY
- PATTERN_MATCHES_EVERYTHING

Methods:
- **static** ExpressionType valueOf(String name)
- **static** ExpressionType[] values()
- Priority priority()
- **static** ExpressionType fromModern(Priority priority)

### Class: ch.njol.skript.lang.InputSource$InputData
Type: Class
Extends: ch.njol.skript.lang.parser.ParserInstance$Data

Constructors:
- InputSource$InputData(ParserInstance parserInstance)

Methods:
- void setSource(InputSource source)
- InputSource getSource()

### Class: ch.njol.skript.lang.KeyedValue
Type: Class
Extends: java.lang.Record
Implements: java.util.Map$Entry

Constructors:
- KeyedValue(String key, T value)
- KeyedValue(Map$Entry<String, TT> entry)

Methods:
- **static** KeyedValue<TT> zip([T values, T keys)
- TT getValue()
- String getKey()
- Object getKey()
- KeyedValue<TU> withValue(T newValue)
- int hashCode()
- boolean equals(Object o)
- TT setValue(T value)
- String toString()
- **static** KeyedValue$UnzippedKeyValues<TT> unzip(KeyedValue<TT> keyedValues)
- **static** KeyedValue$UnzippedKeyValues<TT> unzip(Iterator<KeyedValue<TT>> keyedValues)
- KeyedValue<TT> withKey(String newKey)
- TT value()
- String key()

### Class: ch.njol.skript.lang.KeyedValue$UnzippedKeyValues
Type: Class
Extends: java.lang.Record

Constructors:
- KeyedValue$UnzippedKeyValues(List<String> keys, List<TT> values)
- KeyedValue$UnzippedKeyValues(String keys, [T values)

Methods:
- List<String> keys()
- int hashCode()
- List<TT> values()
- boolean equals(Object o)
- String toString()

### Class: ch.njol.skript.lang.LiteralList
Type: Class
Extends: ch.njol.skript.lang.ExpressionList
Implements: ch.njol.skript.lang.Literal

Constructors:
- LiteralList(Literal<+TT> literals, Class<TT> returnType, boolean and)
- LiteralList(Literal<+TT> literals, Class<TT> returnType, Class<*> possibleReturnTypes, boolean and)
- LiteralList(Literal<+TT> literals, Class<TT> returnType, boolean and, LiteralList<*> source)
- LiteralList(Literal<+TT> literals, Class<TT> returnType, Class<*> possibleReturnTypes, boolean and, LiteralList<*> source)

Methods:
- TT getSingle()
- [TT getAll()
- Literal<+TT> getExpressions()
- Expression[] getExpressions()
- [TT getArray()
- Expression<TT> simplify()
- SyntaxElement simplify()
- Literal<+TR> getConvertedExpression(Class<TR> to)
- Expression getConvertedExpression(Class[])

### Class: ch.njol.skript.lang.LiteralString
Type: Class
Extends: ch.njol.skript.lang.VariableString
Implements: ch.njol.skript.lang.Literal

Methods:
- String getSingle()
- Object getSingle()
- String[] getAll()
- Object[] getAll()
- String[] getArray()
- Object[] getArray()
- String toString(Event event, boolean debug)
- Literal<+TR> getConvertedExpression(Class<TR> to)
- Expression getConvertedExpression(Class[])
- Optional<String> getOptionalSingle(Event event)

### Class: ch.njol.skript.lang.LoopSection
Type: Abstract Class
Extends: ch.njol.skript.lang.Section
Implements: ch.njol.skript.lang.SyntaxElement, ch.njol.skript.lang.Debuggable, ch.njol.skript.lang.SectionExitHandler

Methods:
- void exit(Event event)
- long getLoopCounter(Event event)
- TriggerItem getActualNext()

### Class: ch.njol.skript.lang.ParseContext
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DEFAULT
- EVENT
- COMMAND
- PARSE
- CONFIG
- SCRIPT

Methods:
- **static** ParseContext valueOf(String name)
- **static** ParseContext[] values()

### Class: ch.njol.skript.lang.ReturnHandler$ReturnHandlerStack
Type: Class
Extends: ch.njol.skript.lang.parser.ParserInstance$Data

Constructors:
- ReturnHandler$ReturnHandlerStack(ParserInstance stack)

Methods:
- ReturnHandler<*> pop()
- ReturnHandler<*> getCurrentHandler()
- Deque<ReturnHandler<*>> getStack()
- V push(ReturnHandler<*> handler)

### Class: ch.njol.skript.lang.ReturnableTrigger
Type: Class
Extends: ch.njol.skript.lang.Trigger
Implements: ch.njol.skript.lang.ReturnHandler

Constructors:
- ReturnableTrigger(ReturnHandler<TT> handler, Script script, String name, SkriptEvent event, Function<ReturnHandler<TT>, List<TriggerItem>> loadItems)

Methods:
- V returnValues(Event event, Expression<+TT> value)
- Class<+TT> returnValueType()
- boolean isSingleReturnValue()

### Class: ch.njol.skript.lang.Section
Type: Abstract Class
Extends: ch.njol.skript.lang.TriggerSection
Implements: ch.njol.skript.lang.SyntaxElement, org.skriptlang.skript.log.runtime.SyntaxRuntimeErrorProducer

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Z init(Expression<*>, int, Kleenean, SkriptParser$ParseResult, SectionNode, List<TriggerItem>)
- String getSyntaxTypeName()
- boolean preInit()
- Node getNode()
- **static** Section parse(String expr, String defaultError, SectionNode sectionNode, List<TriggerItem> triggerItems)

### Class: ch.njol.skript.lang.Section$SectionContext
Type: Class
Extends: ch.njol.skript.lang.parser.ParserInstance$Data

Constructors:
- Section$SectionContext(ParserInstance parserInstance)

Methods:
- TT modify(SectionNode sectionNode, List<TriggerItem> triggerItems, Supplier<TT> supplier)
- boolean claimed()
- Z claim(T syntax)

### Class: ch.njol.skript.lang.SectionSkriptEvent
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Constructors:
- SectionSkriptEvent(String name, Section section)

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- Section getSection()
- String toString(Event event, boolean debug)
- boolean check(Event event)
- Z isSection(Class<Section> section)
- Z isSection(Class<Section> sections)

### Class: ch.njol.skript.lang.SelfRegisteringSkriptEvent
Type: Abstract Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- void afterParse(Config config)
- boolean load()
- void unload()
- void unregister(Trigger)
- void unregisterAll()
- boolean check(Event e)
- boolean isEventPrioritySupported()
- boolean postLoad()
- void register(Trigger)

### Class: ch.njol.skript.lang.SimplifiedCondition
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Condition getSource()
- boolean getResult()
- String toString(Event event, boolean debug)
- boolean check(Event event)
- **static** Condition fromCondition(Condition original)
- **static** Condition fromCondition(Condition original, boolean warn)

### Class: ch.njol.skript.lang.SkriptEvent
Type: Abstract Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- SkriptEvent$ListeningBehavior getListeningBehavior()
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult, EntryContainer entryContainer)
- Z init(Literal<*>, int, SkriptParser$ParseResult)
- boolean canExecuteAsynchronously()
- **static** String fixPattern(String pattern)
- EventPriority getEventPriority()
- **static** SkriptEvent parse(String expr, SectionNode sectionNode, String defaultError)
- boolean check(Event)
- void postUnload()
- boolean shouldLoadEvent()
- Class<Event> getEventClasses()
- boolean load()
- Structure$Priority getPriority()
- void unload()
- boolean isEventPrioritySupported()
- boolean preLoad()
- boolean postLoad()
- boolean isListeningBehaviorSupported()

### Class: ch.njol.skript.lang.SkriptEvent$ListeningBehavior
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UNCANCELLED
- CANCELLED
- ANY

Methods:
- **static** SkriptEvent$ListeningBehavior valueOf(String name)
- **static** SkriptEvent$ListeningBehavior[] values()
- boolean matches(boolean cancelled)

### Class: ch.njol.skript.lang.SkriptEventInfo
Type: Class
Extends: org.skriptlang.skript.lang.structure.StructureInfo

Constructors:
- SkriptEventInfo(String name, String patterns, Class<TE> eventClass, String documentationID, Class<Event> events)

Methods:
- SkriptEvent$ListeningBehavior getListeningBehavior()
- String getName()
- SkriptEventInfo<TE> keywords(String keywords)
- SkriptEventInfo<TE> documentationID(String id)
- String[] getSince()
- String[] getKeywords()
- String[] getExamples()
- SkriptEventInfo<TE> description(String description)
- String getId()
- String[] getDescription()
- String getDocumentationID()
- SkriptEventInfo<TE> listeningBehavior(SkriptEvent$ListeningBehavior listeningBehavior)
- SkriptEventInfo<TE> requiredPlugins(String pluginNames)
- SkriptEventInfo<TE> examples(String examples)
- String[] getRequiredPlugins()
- SkriptEventInfo<TE> since(String since)
- SkriptEventInfo<TE> since(String since)

### Class: ch.njol.skript.lang.SkriptEventInfo$ModernSkriptEventInfo
Type: Class
Extends: ch.njol.skript.lang.SkriptEventInfo
Implements: org.skriptlang.skript.bukkit.registration.BukkitSyntaxInfos$Event

Constructors:
- SkriptEventInfo$ModernSkriptEventInfo(String name, String patterns, Class<TE> origin, String originClassPath, Class<Event> events)

Methods:
- BukkitSyntaxInfos$Event$Builder<BukkitSyntaxInfos$Event$Builder<*TE>, TE> toBuilder()
- SyntaxInfo$Builder toBuilder()
- Collection<String> requiredPlugins()
- Collection<String> keywords()
- Collection<String> examples()
- String documentationId()
- String name()
- Collection<String> description()
- String id()
- Collection<Class<Event>> events()
- Collection<String> since()
- SkriptEvent$ListeningBehavior listeningBehavior()

### Class: ch.njol.skript.lang.SkriptParser
Type: Class

Constructors:
- SkriptParser(String expr)
- SkriptParser(String expr, int flags)
- SkriptParser(String expr, int flags, ParseContext context)
- SkriptParser(SkriptParser other, String expr)

Methods:
- **static** int next(String expr, int startIndex, ParseContext context)
- **static** int nextBracket(String pattern, char closingBracket, char openingBracket, int start, boolean isGroup) throws MalformedPatternException
- **static** boolean validateLine(String line)
- **static** int nextOccurrence(String haystack, String needle, int startIndex, ParseContext parseContext, boolean caseSensitive)
- **static** String notOfType(Class<*> types)
- **static** String notOfType(ClassInfo<*> types)
- FunctionReference<TT> parseFunction(Class<+TT> types)
- **static** TT parseStatic(String expr, Iterator<SyntaxInfo<+TT>> source, String defaultError)
- **static** TT parseStatic(String expr, Iterator<SyntaxInfo<+TT>> source, ParseContext parseContext, String defaultError)
- **static** TT parse(String expr, Iterator<SyntaxInfo<TT>> source, String defaultError)
- **static** SkriptParser$ParseResult parse(String text, String pattern)
- **static** SkriptParser$ParseResult parse(String text, String pattern, int parseFlags, ParseContext parseContext)
- **static** SkriptParser$ParseResult parse(String text, SkriptPattern pattern, int parseFlags, ParseContext parseContext)
- Expression<+TT> parseExpression(Class<+TT> types)
- Expression<*> parseExpression(SkriptParser$ExprInfo exprInfo)
- **static** Literal<+TT> parseLiteral(String expr, Class<TT> expectedClass, ParseContext context)
- **static** NonNullPair<String, NonNullPair<ClassInfo<*>, Boolean>> validatePattern(String pattern)
- **static** boolean parseArguments(String args, ScriptCommand command, ScriptCommandEvent event)

### Class: ch.njol.skript.lang.SkriptParser$ExprInfo
Type: Class

Constructors:
- SkriptParser$ExprInfo(int length)
- SkriptParser$ExprInfo(ClassInfo<*> classes, [Z isPlural)

No public methods found

### Class: ch.njol.skript.lang.SkriptParser$ParseResult
Type: Class

Constructors:
- SkriptParser$ParseResult(SkriptParser expr, String exprs)
- SkriptParser$ParseResult(String expr, Expression<*> exprs)

Methods:
- boolean hasTag(String tag)

### Class: ch.njol.skript.lang.Statement
Type: Abstract Class
Extends: ch.njol.skript.lang.TriggerItem
Implements: ch.njol.skript.lang.SyntaxElement

Methods:
- **static** Statement parse(String input, String defaultError)
- **static** Statement parse(String input, List<TriggerItem> items, String defaultError)
- **static** Statement parse(String input, String defaultError, SectionNode node, List<TriggerItem> items)

### Class: ch.njol.skript.lang.SyntaxElementInfo
Type: Class
Implements: org.skriptlang.skript.registration.SyntaxInfo

Constructors:
- SyntaxElementInfo(String patterns, Class<TE> source, String originClassPath) throws IllegalArgumentException

Methods:
- SyntaxInfo$Builder<SyntaxInfo$Builder<*TE>, TE> toBuilder()
- TE instance()
- String getOriginClassPath()
- Collection<String> patterns()
- SyntaxOrigin origin()
- String[] getPatterns()
- Class<TE> getElementClass()
- Priority priority()
- Class<TE> type()
- **static** TI fromModern(SyntaxInfo<+TE> info)

### Class: ch.njol.skript.lang.SyntaxStringBuilder
Type: Class

Constructors:
- SyntaxStringBuilder(Event event, boolean debug)

Methods:
- String toString()
- SyntaxStringBuilder append(Object object)
- SyntaxStringBuilder append(Object[] objects)

### Class: ch.njol.skript.lang.Trigger
Type: Class
Extends: ch.njol.skript.lang.TriggerSection

Constructors:
- Trigger(Script script, String name, SkriptEvent event, List<TriggerItem> line)

Methods:
- SkriptEvent getEvent()
- int getLineNumber()
- void setDebugLabel(String label)
- String getName()
- void setLineNumber(int line)
- String toString(Event event, boolean debug)
- String getDebugLabel()
- Script getScript()
- boolean execute(Event event)

### Class: ch.njol.skript.lang.TriggerItem
Type: Abstract Class
Implements: ch.njol.skript.lang.Debuggable

Methods:
- Trigger getTrigger()
- TriggerSection getParent()
- String getIndentation()
- ExecutionIntent executionIntent()
- TriggerItem setNext(TriggerItem next)
- String toString()
- TriggerItem getNext()
- TriggerItem setParent(TriggerSection parent)
- TriggerItem getActualNext()
- **static** boolean walk(TriggerItem start, Event event)

### Class: ch.njol.skript.lang.TriggerSection
Type: Abstract Class
Extends: ch.njol.skript.lang.TriggerItem

Methods:
- TriggerSection setNext(TriggerItem next)
- TriggerItem setNext(TriggerItem)
- TriggerSection setParent(TriggerSection parent)
- TriggerItem setParent(TriggerSection)

### Class: ch.njol.skript.lang.UnparsedLiteral
Type: Class
Implements: ch.njol.skript.lang.Literal

Constructors:
- UnparsedLiteral(String data)
- UnparsedLiteral(String data, LogEntry error)

Methods:
- int getTime()
- Object[] getArray()
- Object[] getArray(Event event)
- boolean wasReparsed()
- NonNullIterator<Object> iterator(Event event)
- Iterator iterator(Event)
- SimpleLiteral<TT> reparse(Class<TT> type)
- boolean multipleWarning()
- String getData()
- boolean setTime(int time)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> acceptChange(Changer$ChangeMode mode)
- Object[] getAll()
- Object[] getAll(Event event)
- void change(Event event, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- boolean getAnd()
- Z check(Event event, Predicate<Object> checker)
- Z check(Event event, Predicate<Object> checker, boolean negated)
- boolean isLoopOf(String input)
- Literal<+TR> getConvertedExpression(Class<TR> to)
- Literal<+TR> getConvertedExpression(ParseContext context, Class<+TR> to)
- Expression getConvertedExpression(Class[])
- Object getSingle()
- Object getSingle(Event event)
- boolean isDefault()
- List<ClassInfo<*>> getPossibleInfos()
- Class<*> getReturnType()
- Expression<*> getSource()
- boolean isSingle()
- boolean wasConverted()
- String toString(Event event, boolean debug)
- String toString()
- Expression<*> simplify()
- SyntaxElement simplify()

### Class: ch.njol.skript.lang.Variable
Type: Class
Implements: ch.njol.skript.lang.Expression, ch.njol.skript.lang.KeyReceiverExpression, ch.njol.skript.lang.KeyProviderExpression

Methods:
- boolean isEphemeral()
- VariableString getName()
- int getTime()
- [TT getArray(Event event)
- boolean areKeysRecommended()
- String[] getArrayKeys(Event event) throws SkriptAPIException
- boolean isList()
- Iterator<TT> iterator(Event event)
- String[] getAllKeys(Event event)
- boolean supportsLoopPeeking()
- boolean setTime(int time)
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- [TT getAll(Event event)
- Class<+TT> possibleReturnTypes()
- void change(Event event, Object[] delta, Changer$ChangeMode mode, String[] keys)
- void change(Event event, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- boolean getAnd()
- **static** Variable<TT> newInstance(String name, Class<+TT> types)
- Z check(Event event, Predicate<-TT> checker, boolean negated)
- Z check(Event event, Predicate<-TT> checker)
- Iterator<Pair<String, Object>> variablesIterator(Event event)
- boolean isLoopOf(String input)
- Variable<TR> getConvertedExpression(Class<TR> to)
- Expression getConvertedExpression(Class[])
- boolean isLocal()
- V changeInPlace(Event event, Function<TT, TR> changeFunction, boolean getAll)
- V changeInPlace(Event event, Function<TT, TR> changeFunction)
- TT getSingle(Event event)
- Iterator<KeyedValue<TT>> keyedIterator(Event event)
- boolean isDefault()
- Class<+TT> getReturnType()
- boolean canReturnKeys()
- Expression<*> getSource()
- boolean isSingle()
- Object getRaw(Event event)
- String toString(Event event, boolean debug)
- String toString()
- Expression<+TT> simplify()
- SyntaxElement simplify()
- **static** TT convertIfOldPlayer(String key, boolean local, Event event, T object)
- **static** boolean isValidVariableName(String name, boolean allowListVariable, boolean printErrors)

### Class: ch.njol.skript.lang.VariableString
Type: Class
Implements: ch.njol.skript.lang.Expression

Methods:
- **static** VariableString[] makeStrings(String[] args)
- List<MessageComponent> getMessageComponents(Event event)
- List<MessageComponent> getMessageComponents(Event event, StringBuilder unformattedBuilder)
- int getTime()
- **static** Expression<TT> setStringMode(Expression<TT> expression, StringMode mode)
- String[] getArray(Event event)
- Object[] getArray(Event)
- **static** int nextVariableBracket(String string, int start)
- Iterator<String> iterator(Event event)
- **static** String quote(String string)
- boolean isSimple()
- StringMode getMode()
- List<MessageComponent> getMessageComponentsUnsafe(Event event)
- **static** String unquote(String string, boolean surroundingQuotes)
- boolean setTime(int time)
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String[] getAll(Event event)
- Object[] getAll(Event)
- void change(Event event, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- VariableString setMode(StringMode mode)
- boolean getAnd()
- String toChatString(Event event)
- **static** VariableString newInstance(String input)
- **static** VariableString newInstance(String original, StringMode mode)
- Z check(Event event, Predicate<String> checker, boolean negated)
- Z check(Event event, Predicate<String> checker)
- **static** boolean isQuotedCorrectly(String string, boolean withQuotes)
- boolean isLoopOf(String input)
- **static** VariableString makeStringsFromQuoted(List<String> args)
- Expression<+TR> getConvertedExpression(Class<TR> to)
- String getSingle(Event event)
- Object getSingle(Event)
- boolean isDefault()
- List<String> getDefaultVariableNames(String variableName, Event event)
- Class<String> getReturnType()
- String toUnformattedString(Event event)
- Expression<*> getSource()
- boolean isSingle()
- String toString()
- String toString(Event event)
- String toString(Event event, boolean debug)
- Expression<String> simplify()
- SyntaxElement simplify()

## Package: ch.njol.skript.lang.function

### Class: ch.njol.skript.lang.function.DynamicFunctionReference
Type: Class
Implements: ch.njol.skript.util.Contract, org.skriptlang.skript.util.Executable, org.skriptlang.skript.util.Validated, ch.njol.skript.lang.util.common.AnyNamed

Constructors:
- DynamicFunctionReference(Function<+TResult> function)
- DynamicFunctionReference(String name)
- DynamicFunctionReference(String name, Script source)

Methods:
- boolean valid()
- **static** DynamicFunctionReference<*> resolveFunction(String name, Script script)
- Class<*> getReturnType(Expression<*> arguments)
- Z isSingle(Expression<*> arguments)
- String name()
- **static** DynamicFunctionReference<*> parseFunction(String name)
- String toString()
- void invalidate()
- Script source()
- [TResult execute(Event event, Object arguments)
- Object execute(Object, Object[])
- Expression<*> validate(Expression<*> parameters)
- Expression<*> validate(DynamicFunctionReference$Input input)

### Class: ch.njol.skript.lang.function.DynamicFunctionReference$Input
Type: Class

Constructors:
- DynamicFunctionReference$Input(Expression<*> parameters)

Methods:
- int hashCode()
- boolean equals(Object object)

### Class: ch.njol.skript.lang.function.EffFunctionCall
Type: Class
Extends: ch.njol.skript.lang.Effect

Constructors:
- EffFunctionCall(FunctionReference<*> function)

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- **static** EffFunctionCall parse(String line)

### Class: ch.njol.skript.lang.function.ExprFunctionCall
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.KeyProviderExpression

Constructors:
- ExprFunctionCall(FunctionReference<TT> function)
- ExprFunctionCall(FunctionReference<*> function, Class<+TT> returnTypes)

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<+TT> getReturnType()
- Class<+TT> possibleReturnTypes()
- boolean isSingle()
- boolean areKeysRecommended()
- String toString(Event event, boolean debug)
- boolean isLoopOf(String input)
- String[] getArrayKeys(Event event) throws IllegalStateException
- Expression<+TR> getConvertedExpression(Class<TR> to)

### Class: ch.njol.skript.lang.function.Function
Type: Abstract Class
Implements: org.skriptlang.skript.common.function.Function

Constructors:
- Function(Signature<TT> sign)

Methods:
- boolean resetReturnValue()
- String getName()
- ClassInfo<TT> getReturnType()
- Signature<TT> signature()
- String[] returnedKeys()
- boolean isSingle()
- Parameter<*> getParameters()
- Signature<TT> getSignature()
- String toString()
- [TT execute(Object params)
- [TT execute(FunctionEvent<*>, Object)
- Parameter<*> getParameter(int index)

### Class: ch.njol.skript.lang.function.FunctionEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- FunctionEvent(Function<+TT> function)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Function<+TT> getFunction()

### Class: ch.njol.skript.lang.function.FunctionReference
Type: Class
Implements: ch.njol.skript.util.Contract, org.skriptlang.skript.util.Executable

Constructors:
- FunctionReference(String functionName, Node node, String script, Class<+TT> returnTypes, Expression<*> parameters)

Methods:
- boolean resetReturnValue()
- Class<+TT> getReturnType()
- Class<*> getReturnType(Expression<*> arguments)
- boolean validateFunction(boolean first)
- String[] returnedKeys()
- Contract getContract()
- boolean isSingle()
- Z isSingle(Expression<*> arguments)
- Function<+TT> getFunction()
- String toString(Event event, boolean debug)
- boolean validateParameterArity(boolean first)
- [TT execute(Event event, Object arguments)
- Object execute(Object, Object[])

### Class: ch.njol.skript.lang.function.FunctionRegistry
Type: Class
Implements: org.skriptlang.skript.util.Registry

Methods:
- **static** FunctionRegistry getRegistry()
- Set<Signature<*>> getSignatures(String namespace, String name)
- FunctionRegistry$Retrieval<Function<*>> getFunction(String namespace, String name, Class<*> args)
- Collection<Function<*>> elements()
- FunctionRegistry$Retrieval<Signature<*>> getSignature(String namespace, String name, Class<*> args)
- V remove(Signature<*> signature)
- V register(String namespace, Signature<*> signature)
- V register(String namespace, Function<*> function)

### Class: ch.njol.skript.lang.function.Functions
Type: Abstract Class

Methods:
- **static** V unregisterFunction(Signature<*> signature)
- **static** int clearFunctions(String script)
- **static** void clearFunctions()
- **static** Signature<*> getGlobalSignature(String name)
- **static** Namespace getScriptNamespace(String script)
- **static** void validateFunctions()
- **static** Function<*> getFunction(String name)
- **static** Function<*> getFunction(String name, String script)
- **static** Collection<Function<*>> getFunctions()
- **static** Signature<*> getSignature(String name)
- **static** Signature<*> getSignature(String name, String script)
- **static** Function<*> loadFunction(Script script, SectionNode node, Signature<*> signature)
- **static** Signature<*> parseSignature(String script, String name, String args, String returnType, boolean local)
- **static** void enableFunctionEvents(SkriptAddon addon)
- **static** JavaFunction<*> registerFunction(JavaFunction<*> function)
- **static** Function<*> getLocalFunction(String name, String script)
- **static** Function<*> getGlobalFunction(String name)
- **static** Collection<JavaFunction<*>> getJavaFunctions()
- **static** Signature<*> getLocalSignature(String name, String script)
- **static** Signature<*> registerSignature(Signature<*> signature)
- **static** DefaultFunction<*> register(DefaultFunction<*> function)

### Class: ch.njol.skript.lang.function.JavaFunction
Type: Abstract Class
Extends: ch.njol.skript.lang.function.Function
Implements: ch.njol.skript.doc.Documentable

Constructors:
- JavaFunction(Signature<TT> description)
- JavaFunction(String name, Parameter<*> parameters, ClassInfo<TT> returnType, boolean single)
- JavaFunction(String name, Parameter<*> parameters, ClassInfo<TT> returnType, boolean single, Contract contract)

Methods:
- JavaFunction<TT> keywords(String keywords)
- List<String> keywords()
- String getSince()
- String[] getKeywords()
- String[] getExamples()
- JavaFunction<TT> description(String description)
- List<String> description()
- String[] getDescription()
- [TT execute(FunctionEvent<*>, Object)
- boolean resetReturnValue()
- JavaFunction<TT> examples(String examples)
- List<String> examples()
- void setReturnedKeys(String[] keys)
- String[] returnedKeys()
- String name()
- List<String> requires()
- JavaFunction<TT> since(String since)
- List<String> since()

### Class: ch.njol.skript.lang.function.Namespace
Type: Class

Methods:
- V addSignature(Signature<*> sign)
- V addFunction(Function<*> func)
- Function<*> getFunction(String name, boolean local)
- Function<*> getFunction(String name)
- Collection<Signature<*>> getSignatures()
- Collection<Function<*>> getFunctions()
- Signature<*> getSignature(String name, boolean local)
- Signature<*> getSignature(String name)
- Z removeSignature(Signature<*> sign)

### Class: ch.njol.skript.lang.function.Namespace$Key
Type: Class

Constructors:
- Namespace$Key(Namespace$Origin origin, String scriptName)

Methods:
- Namespace$Origin getOrigin()
- int hashCode()
- boolean equals(Object object)
- String getScriptName()

### Class: ch.njol.skript.lang.function.Namespace$Origin
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- JAVA
- SCRIPT

Methods:
- **static** Namespace$Origin valueOf(String name)
- **static** Namespace$Origin[] values()

### Class: ch.njol.skript.lang.function.Parameter
Type: Class
Implements: org.skriptlang.skript.common.function.Parameter

Constructors:
- Parameter(String name, ClassInfo<TT> type, boolean single, Expression<+TT> def)
- Parameter(String name, ClassInfo<TT> type, boolean single, Expression<+TT> def, boolean keyed)
- Parameter(String name, ClassInfo<TT> type, boolean single, Expression<+TT> def, boolean keyed, boolean optional)

Methods:
- Expression<+TT> getDefaultExpression()
- String getName()
- ClassInfo<TT> getType()
- boolean equals(Object o)
- String name()
- String toString()
- String toString(boolean debug)
- boolean isSingleValue()
- **static** Parameter<TT> newInstance(String name, ClassInfo<TT> type, boolean single, String def)
- **static** List<Parameter<*>> parse(String args)
- boolean isOptional()
- Set<Parameter$Modifier> modifiers()
- Class<TT> type()

### Class: ch.njol.skript.lang.function.ScriptFunction
Type: Class
Extends: ch.njol.skript.lang.function.Function
Implements: ch.njol.skript.lang.ReturnHandler

Constructors:
- ScriptFunction(Signature<TT> sign, Script script, SectionNode node)
- ScriptFunction(Signature<TT> returnValueSet, SectionNode node)

Methods:
- V returnValues(Event event, Expression<+TT> value)
- Class<+TT> returnValueType()
- boolean isSingleReturnValue()
- boolean resetReturnValue()
- V setReturnValue([T values)
- String[] returnedKeys()
- [TT execute(FunctionEvent<*> event, Object params)

### Class: ch.njol.skript.lang.function.Signature
Type: Class
Implements: org.skriptlang.skript.common.function.Signature

Constructors:
- Signature(String script, String name, Parameter<*> parameters, boolean local, ClassInfo<TT> returnType, boolean single, String originClassPath, Contract contract)
- Signature(String script, String name, Parameter<*> parameters, Class<TT> returnType, boolean single, Contract contract)
- Signature(String script, String name, Parameter<*> parameters, boolean local, ClassInfo<TT> returnType, boolean single, String originClassPath)
- Signature(String script, String name, Parameter<*> parameters, boolean local, ClassInfo<TT> returnType, boolean single)

Methods:
- int getMinParameters()
- String getName()
- ClassInfo<TT> getReturnType()
- int hashCode()
- String getOriginClassPath()
- Contract getContract()
- boolean isSingle()
- Parameter<*> getParameters()
- String toString()
- String toString(boolean includeReturnType, boolean debug)
- int getMaxParameters()
- boolean isLocal()
- Parameter<*> getParameter(int index)

### Class: ch.njol.skript.lang.function.SimpleJavaFunction
Type: Abstract Class
Extends: ch.njol.skript.lang.function.JavaFunction

Constructors:
- SimpleJavaFunction(Signature<TT> sign)
- SimpleJavaFunction(String name, Parameter<*> parameters, ClassInfo<TT> returnType, boolean single)
- SimpleJavaFunction(String name, Parameter<*> parameters, ClassInfo<TT> returnType, boolean single, Contract contract)

Methods:
- [TT execute(FunctionEvent<*> event, Object params)
- [TT executeSimple(Object)

## Package: ch.njol.skript.lang.parser

### Class: ch.njol.skript.lang.parser.ParserInstance$ScriptActivityChangeEvent
Type: Interface
Implements: ch.njol.skript.ScriptLoader$LoaderEvent, org.skriptlang.skript.lang.script.Script$Event

Methods:
- void onActivityChange(ParserInstance, Script, boolean, Script)

### Class: ch.njol.skript.lang.parser.DefaultValueData
Type: Class
Extends: ch.njol.skript.lang.parser.ParserInstance$Data

Constructors:
- DefaultValueData(ParserInstance defaults)

Methods:
- V addDefaultValue(Class<TT> type, DefaultExpression<TT> value)
- V removeDefaultValue(Class<*> type)
- DefaultExpression<TT> getDefaultValue(Class<TT> type)

### Class: ch.njol.skript.lang.parser.ParseStackOverflowException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- ParseStackOverflowException(StackOverflowError cause, ParsingStack parsingStack)

No public methods found

### Class: ch.njol.skript.lang.parser.ParserInstance
Type: Class
Implements: org.skriptlang.skript.lang.experiment.Experimented

Methods:
- HashMap<String, String> getCurrentOptions()
- ParserInstance$Backup backup()
- **static** V registerData(Class<TT> dataClass, Function<ParserInstance, TT> dataFunction)
- Script getCurrentScript()
- void setNode(Node node)
- boolean isActive()
- V setCurrentSections(List<TriggerSection> currentSections)
- List<TriggerSection> getSectionsUntil(TriggerSection section)
- void setIndentation(String indentation)
- Z isCurrentEvent(Class<Event> event)
- Z isCurrentEvent(Class<Event> events)
- String getCurrentEventName()
- **static** ParserInstance get()
- void deleteCurrentEvent()
- void setCurrentEventName(String currentEventName)
- void setCurrentScript(Config currentScript)
- TT getData(Class<TT> dataClass)
- void setHasDelayBefore(Kleenean hasDelayBefore)
- Kleenean getHasDelayBefore()
- Z isCurrentSection(Class<TriggerSection> sectionClass)
- Z isCurrentSection(Class<TriggerSection> sectionClasses)
- TT getCurrentSection(Class<TT> sectionClass)
- String getIndentation()
- List<TriggerSection> getCurrentSections()
- List<TT> getCurrentSections(Class<TT> sectionClass)
- Z isCurrentStructure(Class<Structure> structureClass)
- Z isCurrentStructure(Class<Structure> structureClasses)
- void addExperiment(Experiment experiment)
- HandlerList getHandlers()
- Structure getCurrentStructure()
- void setInactive()
- V setCurrentEvents(Class<Event> currentEvents)
- void restoreBackup(ParserInstance$Backup backup)
- void setCurrentStructure(Structure structure)
- void setActive(Script script)
- Experimented experimentSnapshot()
- Class<Event> getCurrentEvents()
- boolean hasExperiment(String featureName)
- boolean hasExperiment(Experiment experiment)
- ParsingStack getParsingStack()
- void setCurrentSkriptEvent(SkriptEvent currentSkriptEvent)
- ExperimentSet getExperimentSet()
- SkriptEvent getCurrentSkriptEvent()
- V setCurrentEvent(String name, Class<Event> events)
- void reset()
- **static** Z isRegistered(Class<ParserInstance$Data> dataClass)
- void deleteCurrentSkriptEvent()
- Node getNode()
- void removeExperiment(Experiment experiment)
- List<TriggerSection> getSections(int levels)
- List<TriggerSection> getSections(int levels, Class<TriggerSection> type)
- HintManager getHintManager()

### Class: ch.njol.skript.lang.parser.ParserInstance$Backup
Type: Class

No public methods found

### Class: ch.njol.skript.lang.parser.ParserInstance$Data
Type: Abstract Class

Constructors:
- ParserInstance$Data(ParserInstance parserInstance)

Methods:
- V onCurrentEventsChange(Class<Event> currentEvents)
- void onCurrentScriptChange(Config currentScript)

### Class: ch.njol.skript.lang.parser.ParsingStack
Type: Class
Implements: java.lang.Iterable

Constructors:
- ParsingStack(ParsingStack stack)

Methods:
- ParsingStack$Element pop() throws IllegalStateException
- Iterator<ParsingStack$Element> iterator()
- void print(PrintStream printStream)
- int size()
- boolean isEmpty()
- void push(ParsingStack$Element element)
- ParsingStack$Element peek(int index) throws IndexOutOfBoundsException
- ParsingStack$Element peek() throws IllegalStateException

### Class: ch.njol.skript.lang.parser.ParsingStack$Element
Type: Class
Extends: java.lang.Record

Constructors:
- ParsingStack$Element(SyntaxInfo<*> syntaxElementInfo, int patternIndex)

Methods:
- SyntaxInfo<*> syntaxElementInfo()
- int hashCode()
- int patternIndex()
- boolean equals(Object o)
- String[] getPatterns()
- String toString()
- Class<SyntaxElement> getSyntaxElementClass()
- String getPattern()
- SyntaxInfo<*> syntaxInfo()

## Package: ch.njol.skript.lang.simplification

### Class: ch.njol.skript.lang.simplification.Simplifiable
Type: Interface

Methods:
- TS simplify()

### Class: ch.njol.skript.lang.simplification.SimplifiedLiteral
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Constructors:
- SimplifiedLiteral([T data, T type, ; and, Class<TT> source)

Methods:
- V changeInPlace(Event event, Function<TT, TR> changeFunction)
- V changeInPlace(Event event, Function<TT, TR> changeFunction, boolean getAll)
- Class<*> acceptChange(Changer$ChangeMode mode)
- Expression<TT> getSource()
- void change(Event event, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- **static** SimplifiedLiteral<TT> fromExpression(Expression<TT> original)
- String toString(Event event, boolean debug)
- boolean isLoopOf(String input)
- Object beforeChange(Expression<*> changed, Object delta)

## Package: ch.njol.skript.lang.util

### Class: ch.njol.skript.lang.util.ContainerExpression
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Constructors:
- ContainerExpression(Expression<Container<*>> expr, Class<*> type)

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Iterator<Object> iterator(Event event)
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.lang.util.ContextlessEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** ContextlessEvent get()

### Class: ch.njol.skript.lang.util.ConvertedExpression
Type: Class
Implements: ch.njol.skript.lang.Expression

Constructors:
- ConvertedExpression(Expression<+TF> source, Class<TT> to, ConverterInfo<-TF, +TT> converter)
- ConvertedExpression(Expression<+TF> source, Class<TT> to, Collection<ConverterInfo<-TF, +TT>> infos, boolean performFromCheck)
- ConvertedExpression(Expression<+TF> source, Class<TT> to, Collection<ConverterInfo<-TF, +TT>> converterInfos, boolean converter)

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> vars, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult matcher)
- [TT getAll(Event event)
- int getTime()
- Class<+TT> possibleReturnTypes()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- boolean getAnd()
- [TT getArray(Event event)
- **static** ConvertedExpression<TF, TT> newInstance(Expression<TF> from, Class<TT> to)
- Z check(Event event, Predicate<-TT> checker, boolean negated)
- Z check(Event event, Predicate<-TT> checker)
- Object beforeChange(Expression<*> changed, Object delta)
- boolean isLoopOf(String input)
- Expression<+TR> getConvertedExpression(Class<TR> to)
- TT getSingle(Event event)
- Iterator<TT> iterator(Event event)
- boolean isDefault()
- Class<TT> getReturnType()
- Expression<+TF> getSource()
- boolean isSingle()
- String toString(Event event, boolean debug)
- String toString()
- Expression<+TT> simplify()
- SyntaxElement simplify()
- boolean setTime(int time)

### Class: ch.njol.skript.lang.util.ConvertedKeyProviderExpression
Type: Class
Extends: ch.njol.skript.lang.util.ConvertedExpression
Implements: ch.njol.skript.lang.KeyProviderExpression, ch.njol.skript.lang.KeyReceiverExpression

Constructors:
- ConvertedKeyProviderExpression(KeyProviderExpression<+TF> supportsKeyedChange, Class<TT> to, ConverterInfo<-TF, +TT> arrayKeysCache)
- ConvertedKeyProviderExpression(KeyProviderExpression<+TF> supportsKeyedChange, Class<TT> toExact, Collection<ConverterInfo<-TF, +TT>> converterInfos, boolean arrayKeysCache)

Methods:
- [TT getAll(Event event)
- boolean canReturnKeys()
- String[] getAllKeys(Event event)
- KeyProviderExpression<+TF> getSource()
- Expression getSource()
- void change(Event event, Object[] delta, Changer$ChangeMode mode, String[] keys)
- boolean areKeysRecommended()
- [TT getArray(Event event)
- boolean isLoopOf(String input)
- String[] getArrayKeys(Event event) throws IllegalStateException

### Class: ch.njol.skript.lang.util.ConvertedLiteral
Type: Class
Extends: ch.njol.skript.lang.util.ConvertedExpression
Implements: ch.njol.skript.lang.Literal

Constructors:
- ConvertedLiteral(Literal<TF> source, [T data, T to)

Methods:
- TT getSingle()
- TT getSingle(Event event)
- Iterator<TT> iterator(Event event)
- [TT getAll()
- [TT getArray()
- [TT getArray(Event event)
- String toString(Event event, boolean debug)
- Z check(Event event, Predicate<-TT> checker)
- Z check(Event event, Predicate<-TT> checker, boolean negated)
- Literal<+TR> getConvertedExpression(Class<TR> to)
- Expression getConvertedExpression(Class[])

### Class: ch.njol.skript.lang.util.SectionUtils
Type: Class

Methods:
- **static** Trigger loadLinkedCode(String name, BiFunction<Runnable, Runnable, Trigger> triggerSupplier)

### Class: ch.njol.skript.lang.util.SimpleEvent
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parser)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.lang.util.SimpleExpression
Type: Abstract Class
Implements: ch.njol.skript.lang.Expression, org.skriptlang.skript.log.runtime.SyntaxRuntimeErrorProducer

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- [TT getAll(Event event)
- int getTime()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- boolean preInit()
- boolean getAnd()
- [TT getArray(Event event)
- Z check(Event event, Predicate<-TT> checker)
- Z check(Event event, Predicate<-TT> checker, boolean negated)
- **static** Z check([T values, T checker, ; invert, Predicate<-TT> and)
- boolean isLoopOf(String input)
- Expression<+TR> getConvertedExpression(Class<TR> to)
- TT getSingle(Event event)
- Iterator<+TT> iterator(Event event)
- boolean isDefault()
- Expression<*> getSource()
- boolean supportsLoopPeeking()
- String toString()
- Expression<+TT> simplify()
- SyntaxElement simplify()
- Node getNode()
- boolean setTime(int time)

### Class: ch.njol.skript.lang.util.SimpleLiteral
Type: Class
Implements: ch.njol.skript.lang.Literal, ch.njol.skript.lang.DefaultExpression

Constructors:
- SimpleLiteral([T data, T type, ; and)
- SimpleLiteral([T data, T type, ; and, Class<TT> source)
- SimpleLiteral([T data, T type, ; and, Class<TT> isDefault, boolean source)
- SimpleLiteral(T data, T isDefault)
- SimpleLiteral(T data, T isDefault, ; source)

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean init()
- [TT getAll()
- [TT getAll(Event event)
- int getTime()
- void change(Event event, Object[] delta, Changer$ChangeMode mode) throws UnsupportedOperationException
- boolean getAnd()
- [TT getArray()
- [TT getArray(Event event)
- Z check(Event event, Predicate<-TT> checker, boolean negated)
- Z check(Event event, Predicate<-TT> checker)
- boolean isLoopOf(String input)
- Literal<+TR> getConvertedExpression(Class<TR> to)
- Expression getConvertedExpression(Class[])
- TT getSingle()
- TT getSingle(Event event)
- NonNullIterator<TT> iterator(Event event)
- Iterator iterator(Event)
- boolean isDefault()
- Class<TT> getReturnType()
- Expression<*> getSource()
- boolean isSingle()
- String toString(Event event, boolean debug)
- String toString()
- Expression<TT> simplify()
- SyntaxElement simplify()
- boolean setTime(int time)

## Package: ch.njol.skript.lang.util.common

### Class: ch.njol.skript.lang.util.common.AnyAmount
Type: Interface
Implements: ch.njol.skript.lang.util.common.AnyProvider

Methods:
- Number amount()
- boolean supportsAmountChange()
- boolean isEmpty()
- void setAmount(Number amount) throws UnsupportedOperationException

### Class: ch.njol.skript.lang.util.common.AnyContains
Type: Interface
Implements: ch.njol.skript.lang.util.common.AnyProvider

Methods:
- boolean isSafeToCheck(Object value)
- Z contains(T)
- boolean checkSafely(Object value)

### Class: ch.njol.skript.lang.util.common.AnyNamed
Type: Interface
Implements: ch.njol.skript.lang.util.common.AnyProvider

Methods:
- void setName(String name) throws UnsupportedOperationException
- boolean supportsNameChange()
- String name()

### Class: ch.njol.skript.lang.util.common.AnyProvider
Type: Interface

No public methods found

### Class: ch.njol.skript.lang.util.common.AnyValued
Type: Interface
Implements: ch.njol.skript.lang.util.common.AnyProvider

Methods:
- boolean supportsValueChange()
- void changeValueSafely(Object value) throws UnsupportedOperationException
- Class<TType> valueType()
- V changeValue(T value) throws UnsupportedOperationException
- TConverted convertedValue(ClassInfo<TConverted> expected)
- TType value()
- void resetValue() throws UnsupportedOperationException

## Package: ch.njol.skript.literals

### Class: ch.njol.skript.literals.LitAt
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.literals.LitConsole
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.literals.LitDoubleMaxValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitDoubleMinValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitEternity
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitFloatMaxValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitFloatMinValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitInfinity
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitIntMaxValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitIntMinValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitLongMaxValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitLongMinValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitNaN
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitNegativeInfinity
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitNewLine
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult result)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.literals.LitPi
Type: Class
Extends: ch.njol.skript.lang.util.SimpleLiteral

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

## Package: ch.njol.skript.localization

### Class: ch.njol.skript.localization.LanguageChangeListener
Type: Interface

Methods:
- void onLanguageChange()

### Class: ch.njol.skript.localization.Adjective
Type: Class
Extends: ch.njol.skript.localization.Message

Constructors:
- Adjective(String genders)

Methods:
- String toString()
- String toString(int gender, int flags)
- **static** String toString(Adjective[] adjectives, int gender, int flags, boolean and)
- String toString(Noun n, int flags)

### Class: ch.njol.skript.localization.ArgsMessage
Type: Class
Extends: ch.njol.skript.localization.Message

Constructors:
- ArgsMessage(String key)

Methods:
- String toString()
- String toString(Object[] args)

### Class: ch.njol.skript.localization.FormattedMessage
Type: Class
Extends: ch.njol.skript.localization.Message

Constructors:
- FormattedMessage(String key, Object[] args)

Methods:
- String toString()

### Class: ch.njol.skript.localization.GeneralWords
Type: Class

No public methods found

### Class: ch.njol.skript.localization.Language
Type: Class

Methods:
- **static** String getName()
- **static** boolean isInitialized()
- **static** String format(String key, Object[] args)
- **static** boolean keyExistsDefault(String key)
- **static** void missingEntryError(String key)
- **static** boolean load(String name)
- **static** boolean keyExists(String key)
- **static** String[] getList(String key)
- **static** String get(String key)
- **static** void loadDefault(SkriptAddon addon)
- **static** String getSpaced(String key)
- **static** String get_(String key)
- **static** void addListener(LanguageChangeListener listener)
- **static** void addListener(LanguageChangeListener listener, Language$LanguageListenerPriority priority)

### Class: ch.njol.skript.localization.Language$LanguageListenerPriority
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- EARLIEST
- NORMAL
- LATEST

Methods:
- **static** Language$LanguageListenerPriority valueOf(String name)
- **static** Language$LanguageListenerPriority[] values()

### Class: ch.njol.skript.localization.Message
Type: Class

Constructors:
- Message(String key)

Methods:
- String getValue()
- boolean isSet()
- String getValueOrDefault(String defaultValue)
- String toString()

### Class: ch.njol.skript.localization.Noun
Type: Class
Extends: ch.njol.skript.localization.Message

Constructors:
- Noun(String gender)

Methods:
- **static** NonNullPair<String, Integer> stripGender(String s, String key)
- String getPlural()
- **static** NonNullPair<String, String> getPlural(String s)
- **static** String getArticleWithSpace(int gender, int flags)
- String getArticleWithSpace(int flags)
- **static** boolean isDefiniteArticle(String s)
- String getDefiniteArticle()
- String getIndefiniteArticle()
- **static** boolean isIndefiniteArticle(String s)
- **static** String stripDefiniteArticle(String string)
- String getSingular()
- int getGender()
- **static** int getGender(String gender, String key)
- **static** String normalizePluralMarkers(String s)
- String withDefiniteArticle()
- String withDefiniteArticle(boolean plural)
- **static** String stripIndefiniteArticle(String s)
- String withAmount(double amount)
- String withAmount(double amount, int)
- String toString()
- String toString(boolean plural)
- String toString(int flags)
- String toString(Adjective a, int flags)
- String toString(Adjective[] adjectives, int flags, boolean and)
- **static** String toString(String singular, String plural, int gender, int flags)
- **static** String getGenderID(int gender)
- String withIndefiniteArticle()

### Class: ch.njol.skript.localization.PluralizingArgsMessage
Type: Class
Extends: ch.njol.skript.localization.Message

Constructors:
- PluralizingArgsMessage(String key)

Methods:
- **static** String format(String s)
- String toString(Object[] args)

### Class: ch.njol.skript.localization.RegexMessage
Type: Class
Extends: ch.njol.skript.localization.Message

Constructors:
- RegexMessage(String pattern, String prefix, String suffix, int flags)
- RegexMessage(String key, String prefix, String suffix)
- RegexMessage(String key, int flags)
- RegexMessage(String key)

Methods:
- boolean find(String s)
- String toString()
- Matcher matcher(String s)
- Pattern getPattern()
- boolean matches(String s)

## Package: ch.njol.skript.log

### Class: ch.njol.skript.log.BlockingLogHandler
Type: Class
Extends: ch.njol.skript.log.LogHandler

Methods:
- LogHandler$LogResult log(LogEntry entry)
- BlockingLogHandler start()
- LogHandler start()

### Class: ch.njol.skript.log.BukkitLoggerFilter
Type: Class

Methods:
- **static** boolean removeFilter(Filter f)
- **static** void addFilter(Filter f)

### Class: ch.njol.skript.log.CountingLogHandler
Type: Class
Extends: ch.njol.skript.log.LogHandler

Constructors:
- CountingLogHandler(Level minimum)

Methods:
- LogHandler$LogResult log(LogEntry entry)
- CountingLogHandler start()
- LogHandler start()
- int getCount()

### Class: ch.njol.skript.log.ErrorDescLogHandler
Type: Class
Extends: ch.njol.skript.log.LogHandler

Constructors:
- ErrorDescLogHandler(String before, String after, String success)

Methods:
- LogHandler$LogResult log(LogEntry entry)
- ErrorDescLogHandler start()
- LogHandler start()

### Class: ch.njol.skript.log.ErrorQuality
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NONE
- NOT_AN_EXPRESSION
- SEMANTIC_ERROR

Methods:
- **static** ErrorQuality valueOf(String name)
- **static** ErrorQuality get(int quality)
- **static** ErrorQuality[] values()
- int quality()

### Class: ch.njol.skript.log.FilteringLogHandler
Type: Class
Extends: ch.njol.skript.log.LogHandler

Constructors:
- FilteringLogHandler(Level minimum)

Methods:
- LogHandler$LogResult log(LogEntry entry)
- FilteringLogHandler start()
- LogHandler start()

### Class: ch.njol.skript.log.HandlerList
Type: Class
Implements: java.lang.Iterable

Methods:
- void add(LogHandler h)
- boolean contains(LogHandler h)
- Iterator<LogHandler> iterator()
- LogHandler remove()

### Class: ch.njol.skript.log.LogEntry
Type: Class

Constructors:
- LogEntry(Level level, String message)
- LogEntry(Level level, int quality, String message)
- LogEntry(Level level, ErrorQuality quality, String message)
- LogEntry(Level level, String message, Node node)
- LogEntry(Level level, ErrorQuality quality, String message, Node node)
- LogEntry(Level level, int quality, String message, Node node)
- LogEntry(Level level, int quality, String message, Node node, boolean tracked)

Methods:
- Level getLevel()
- int getQuality()
- String getMessage()
- String toString()
- String toFormattedString()

### Class: ch.njol.skript.log.LogHandler
Type: Abstract Class
Implements: java.io.Closeable, ch.njol.util.OpenCloseable

Methods:
- boolean isStopped()
- void stop()
- LogHandler$LogResult log(LogEntry)
- LogHandler start()
- void close()
- void open()

### Class: ch.njol.skript.log.LogHandler$LogResult
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LOG
- CACHED
- DO_NOT_LOG

Methods:
- **static** LogHandler$LogResult valueOf(String name)
- **static** LogHandler$LogResult[] values()

### Class: ch.njol.skript.log.ParseLogHandler
Type: Class
Extends: ch.njol.skript.log.LogHandler

Methods:
- LogEntry getError()
- ParseLogHandler backup()
- void restore(ParseLogHandler parseLogHandler)
- LogHandler$LogResult log(LogEntry entry)
- void clearError()
- void clear()
- ParseLogHandler start()
- LogHandler start()
- boolean hasError()
- int getNumErrors()
- void printError()
- void printError(String def)
- void printError(String def, ErrorQuality quality)
- void error(String error, ErrorQuality quality)
- void printLog()
- void printLog(boolean includeErrors)

### Class: ch.njol.skript.log.RedirectingLogHandler
Type: Class
Extends: ch.njol.skript.log.LogHandler

Constructors:
- RedirectingLogHandler(CommandSender recipient, String prefix)
- RedirectingLogHandler(Collection<CommandSender> recipients, String prefix)

Methods:
- int numErrors()
- LogHandler$LogResult log(LogEntry entry)
- LogHandler$LogResult log(LogEntry entry, CommandSender ignore)
- RedirectingLogHandler start()
- LogHandler start()

### Class: ch.njol.skript.log.RetainingLogHandler
Type: Class
Extends: ch.njol.skript.log.LogHandler

Methods:
- RetainingLogHandler backup()
- boolean hasErrors()
- void restore(RetainingLogHandler copy)
- LogHandler$LogResult log(LogEntry entry)
- Collection<LogEntry> getLog()
- void clear()
- RetainingLogHandler start()
- LogHandler start()
- Collection<LogEntry> getErrors()
- void printLog()
- int size()
- LogEntry getFirstError()
- LogEntry getFirstError(String def)
- boolean printErrors()
- boolean printErrors(String def)
- boolean printErrors(String def, ErrorQuality quality)
- boolean printErrors(CommandSender recipient, String def)
- int getNumErrors()
- void onStop()

### Class: ch.njol.skript.log.SkriptLogger
Type: Abstract Class

Methods:
- **static** TT startLogHandler(T h)
- **static** boolean debug()
- **static** void log(Level level, String message)
- **static** void log(LogEntry entry)
- **static** boolean log(Verbosity minVerb)
- **static** void sendFormatted(CommandSender commandSender, String message)
- **static** void setNode(Node node)
- **static** V logAll(Collection<LogEntry> entries)
- **static** ParseLogHandler startParseLogHandler()
- **static** Node getNode()
- **static** void logTracked(Level level, String message, ErrorQuality quality)
- **static** RetainingLogHandler startRetainingLog()
- **static** void setVerbosity(Verbosity v)

### Class: ch.njol.skript.log.TestingLogHandler
Type: Class
Extends: ch.njol.skript.log.LogHandler

Constructors:
- TestingLogHandler(Level minimum)

Methods:
- LogHandler$LogResult log(LogEntry entry)
- TestingLogHandler start()
- LogHandler start()
- int getCount()

### Class: ch.njol.skript.log.TimingLogHandler
Type: Class
Extends: ch.njol.skript.log.LogHandler

Methods:
- long getStart()
- LogHandler$LogResult log(LogEntry entry)
- TimingLogHandler start()
- LogHandler start()
- long getTimeTaken()

### Class: ch.njol.skript.log.Verbosity
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LOW
- NORMAL
- HIGH
- VERY_HIGH
- DEBUG

Methods:
- **static** Verbosity valueOf(String name)
- **static** Verbosity[] values()

## Package: ch.njol.skript.paperlib

### Class: ch.njol.skript.paperlib.PaperLib
Type: Class

Methods:
- **static** boolean isPaper()
- **static** CompletableFuture<Location> getBedSpawnLocationAsync(Player player, boolean isUrgent)
- **static** CompletableFuture<Chunk> getChunkAtAsync(Location loc)
- **static** CompletableFuture<Chunk> getChunkAtAsync(Location loc, boolean gen)
- **static** CompletableFuture<Chunk> getChunkAtAsync(World world, int x, int z)
- **static** CompletableFuture<Chunk> getChunkAtAsync(World world, int x, int z, boolean gen)
- **static** CompletableFuture<Chunk> getChunkAtAsync(World world, int x, int z, boolean gen, boolean isUrgent)
- **static** int getMinecraftVersion()
- **static** boolean isVersion(int minor)
- **static** boolean isVersion(int minor, int patch)
- **static** Environment getEnvironment()
- **static** int getMinecraftReleaseCandidateVersion()
- **static** int getMinecraftPatchVersion()
- **static** CompletableFuture<Boolean> teleportAsync(Entity entity, Location location)
- **static** CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent$TeleportCause cause)
- **static** boolean isSpigot()
- **static** CompletableFuture<Chunk> getChunkAtAsyncUrgently(World world, int x, int z, boolean gen)
- **static** boolean isChunkGenerated(Location loc)
- **static** boolean isChunkGenerated(World world, int x, int z)
- **static** void setCustomEnvironment(Environment environment)
- **static** void suggestPaper(Plugin plugin)
- **static** void suggestPaper(Plugin plugin, Level logLevel)
- **static** BlockStateSnapshotResult getBlockState(Block block, boolean useSnapshot)
- **static** int getMinecraftPreReleaseVersion()
- **static** InventoryHolderSnapshotResult getHolder(Inventory inventory, boolean useSnapshot)

## Package: ch.njol.skript.paperlib.environments

### Class: ch.njol.skript.paperlib.environments.CraftBukkitEnvironment
Type: Class
Extends: ch.njol.skript.paperlib.environments.Environment

Methods:
- String getName()

### Class: ch.njol.skript.paperlib.environments.Environment
Type: Abstract Class

Methods:
- boolean isPaper()
- String getName()
- CompletableFuture<Location> getBedSpawnLocationAsync(Player player, boolean isUrgent)
- CompletableFuture<Boolean> teleport(Entity entity, Location location, PlayerTeleportEvent$TeleportCause cause)
- CompletableFuture<Chunk> getChunkAtAsync(World world, int x, int z, boolean gen)
- CompletableFuture<Chunk> getChunkAtAsync(World world, int x, int z, boolean gen, boolean isUrgent)
- int getMinecraftVersion()
- boolean isVersion(int minor)
- boolean isVersion(int minor, int patch)
- int getMinecraftReleaseCandidateVersion()
- int getMinecraftPatchVersion()
- boolean isSpigot()
- CompletableFuture<Chunk> getChunkAtAsyncUrgently(World world, int x, int z, boolean gen)
- boolean isChunkGenerated(World world, int x, int z)
- BlockStateSnapshotResult getBlockState(Block block, boolean useSnapshot)
- int getMinecraftPreReleaseVersion()
- InventoryHolderSnapshotResult getHolder(Inventory inventory, boolean useSnapshot)

### Class: ch.njol.skript.paperlib.environments.PaperEnvironment
Type: Class
Extends: ch.njol.skript.paperlib.environments.SpigotEnvironment

Methods:
- boolean isPaper()
- String getName()

### Class: ch.njol.skript.paperlib.environments.SpigotEnvironment
Type: Class
Extends: ch.njol.skript.paperlib.environments.CraftBukkitEnvironment

Methods:
- String getName()
- boolean isSpigot()

## Package: ch.njol.skript.paperlib.features.asyncchunks

### Class: ch.njol.skript.paperlib.features.asyncchunks.AsyncChunks
Type: Interface

Methods:
- CompletableFuture<Chunk> getChunkAtAsync(World world, int x, int z, boolean gen)
- CompletableFuture<Chunk> getChunkAtAsync(World, int, int, boolean, boolean)

### Class: ch.njol.skript.paperlib.features.asyncchunks.AsyncChunksPaper_13
Type: Class
Implements: ch.njol.skript.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture<Chunk> getChunkAtAsync(World world, int x, int z, boolean gen, boolean isUrgent)

### Class: ch.njol.skript.paperlib.features.asyncchunks.AsyncChunksPaper_15
Type: Class
Implements: ch.njol.skript.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture<Chunk> getChunkAtAsync(World world, int x, int z, boolean gen, boolean isUrgent)

### Class: ch.njol.skript.paperlib.features.asyncchunks.AsyncChunksPaper_9_12
Type: Class
Implements: ch.njol.skript.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture<Chunk> getChunkAtAsync(World world, int x, int z, boolean gen, boolean isUrgent)

### Class: ch.njol.skript.paperlib.features.asyncchunks.AsyncChunksSync
Type: Class
Implements: ch.njol.skript.paperlib.features.asyncchunks.AsyncChunks

Methods:
- CompletableFuture<Chunk> getChunkAtAsync(World world, int x, int z, boolean gen, boolean isUrgent)

## Package: ch.njol.skript.paperlib.features.asyncteleport

### Class: ch.njol.skript.paperlib.features.asyncteleport.AsyncTeleport
Type: Interface

Methods:
- CompletableFuture<Boolean> teleportAsync(Entity, Location, PlayerTeleportEvent$TeleportCause)

### Class: ch.njol.skript.paperlib.features.asyncteleport.AsyncTeleportPaper
Type: Class
Implements: ch.njol.skript.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent$TeleportCause cause)

### Class: ch.njol.skript.paperlib.features.asyncteleport.AsyncTeleportPaper_13
Type: Class
Implements: ch.njol.skript.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent$TeleportCause cause)

### Class: ch.njol.skript.paperlib.features.asyncteleport.AsyncTeleportSync
Type: Class
Implements: ch.njol.skript.paperlib.features.asyncteleport.AsyncTeleport

Methods:
- CompletableFuture<Boolean> teleportAsync(Entity entity, Location location, PlayerTeleportEvent$TeleportCause cause)

## Package: ch.njol.skript.paperlib.features.bedspawnlocation

### Class: ch.njol.skript.paperlib.features.bedspawnlocation.BedSpawnLocation
Type: Interface

Methods:
- CompletableFuture<Location> getBedSpawnLocationAsync(Player, boolean)

### Class: ch.njol.skript.paperlib.features.bedspawnlocation.BedSpawnLocationPaper
Type: Class
Implements: ch.njol.skript.paperlib.features.bedspawnlocation.BedSpawnLocation

Methods:
- CompletableFuture<Location> getBedSpawnLocationAsync(Player player, boolean isUrgent)

### Class: ch.njol.skript.paperlib.features.bedspawnlocation.BedSpawnLocationSync
Type: Class
Implements: ch.njol.skript.paperlib.features.bedspawnlocation.BedSpawnLocation

Methods:
- CompletableFuture<Location> getBedSpawnLocationAsync(Player player, boolean isUrgent)

## Package: ch.njol.skript.paperlib.features.blockstatesnapshot

### Class: ch.njol.skript.paperlib.features.blockstatesnapshot.BlockStateSnapshot
Type: Interface

Methods:
- BlockStateSnapshotResult getBlockState(Block, boolean)

### Class: ch.njol.skript.paperlib.features.blockstatesnapshot.BlockStateSnapshotBeforeSnapshots
Type: Class
Implements: ch.njol.skript.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block block, boolean useSnapshot)

### Class: ch.njol.skript.paperlib.features.blockstatesnapshot.BlockStateSnapshotNoOption
Type: Class
Implements: ch.njol.skript.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block block, boolean useSnapshot)

### Class: ch.njol.skript.paperlib.features.blockstatesnapshot.BlockStateSnapshotOptionalSnapshots
Type: Class
Implements: ch.njol.skript.paperlib.features.blockstatesnapshot.BlockStateSnapshot

Methods:
- BlockStateSnapshotResult getBlockState(Block block, boolean useSnapshot)

### Class: ch.njol.skript.paperlib.features.blockstatesnapshot.BlockStateSnapshotResult
Type: Class

Constructors:
- BlockStateSnapshotResult(boolean isSnapshot, BlockState state)

Methods:
- BlockState getState()
- boolean isSnapshot()

## Package: ch.njol.skript.paperlib.features.chunkisgenerated

### Class: ch.njol.skript.paperlib.features.chunkisgenerated.ChunkIsGenerated
Type: Interface

Methods:
- boolean isChunkGenerated(World, int, int)

### Class: ch.njol.skript.paperlib.features.chunkisgenerated.ChunkIsGeneratedApiExists
Type: Class
Implements: ch.njol.skript.paperlib.features.chunkisgenerated.ChunkIsGenerated

Methods:
- boolean isChunkGenerated(World world, int x, int z)

### Class: ch.njol.skript.paperlib.features.chunkisgenerated.ChunkIsGeneratedUnknown
Type: Class
Implements: ch.njol.skript.paperlib.features.chunkisgenerated.ChunkIsGenerated

Methods:
- boolean isChunkGenerated(World world, int x, int z)

## Package: ch.njol.skript.paperlib.features.inventoryholdersnapshot

### Class: ch.njol.skript.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot
Type: Interface

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory, boolean)

### Class: ch.njol.skript.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotBeforeSnapshots
Type: Class
Implements: ch.njol.skript.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory inventory, boolean useSnapshot)

### Class: ch.njol.skript.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotNoOption
Type: Class
Implements: ch.njol.skript.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory inventory, boolean useSnapshot)

### Class: ch.njol.skript.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotOptionalSnapshots
Type: Class
Implements: ch.njol.skript.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshot

Methods:
- InventoryHolderSnapshotResult getHolder(Inventory inventory, boolean useSnapshot)

### Class: ch.njol.skript.paperlib.features.inventoryholdersnapshot.InventoryHolderSnapshotResult
Type: Class

Constructors:
- InventoryHolderSnapshotResult(boolean isSnapshot, InventoryHolder holder)

Methods:
- boolean isSnapshot()
- InventoryHolder getHolder()

## Package: ch.njol.skript.patterns

### Class: ch.njol.skript.patterns.ChoicePatternElement
Type: Class
Extends: ch.njol.skript.patterns.PatternElement

Methods:
- void add(PatternElement patternElement)
- Set<String> getCombinations(boolean clean)
- void setLast(PatternElement patternElement)
- MatchResult match(String expr, MatchResult matchResult)
- List<PatternElement> getPatternElements()
- String toString()
- PatternElement getLast()

### Class: ch.njol.skript.patterns.GroupPatternElement
Type: Class
Extends: ch.njol.skript.patterns.PatternElement

Constructors:
- GroupPatternElement(PatternElement patternElement)

Methods:
- Set<String> getCombinations(boolean clean)
- PatternElement getPatternElement()
- MatchResult match(String expr, MatchResult matchResult)
- String toString()

### Class: ch.njol.skript.patterns.LiteralPatternElement
Type: Class
Extends: ch.njol.skript.patterns.PatternElement

Constructors:
- LiteralPatternElement(String literal)

Methods:
- Set<String> getCombinations(boolean clean)
- MatchResult match(String expr, MatchResult matchResult)
- boolean isEmpty()
- String toString()

### Class: ch.njol.skript.patterns.MalformedPatternException
Type: Class
Extends: java.lang.IllegalArgumentException

Constructors:
- MalformedPatternException(String pattern, String message)
- MalformedPatternException(String pattern, String message, Throwable cause)

No public methods found

### Class: ch.njol.skript.patterns.MatchResult
Type: Class

Methods:
- List<MatchResult> getRegexResults()
- int getMark()
- String getExpr()
- Expression<*> getExpressions()
- String toString()
- List<String> getTags()
- MatchResult copy()
- SkriptParser$ParseResult toParseResult()

### Class: ch.njol.skript.patterns.OptionalPatternElement
Type: Class
Extends: ch.njol.skript.patterns.PatternElement

Constructors:
- OptionalPatternElement(PatternElement patternElement)

Methods:
- Set<String> getCombinations(boolean clean)
- PatternElement getPatternElement()
- MatchResult match(String expr, MatchResult matchResult)
- String toString()

### Class: ch.njol.skript.patterns.ParseTagPatternElement
Type: Class
Extends: ch.njol.skript.patterns.PatternElement

Constructors:
- ParseTagPatternElement(int mark)
- ParseTagPatternElement(String tag)

Methods:
- Set<String> getCombinations(boolean clean)
- MatchResult match(String expr, MatchResult matchResult)
- String toString()

### Class: ch.njol.skript.patterns.PatternCompiler
Type: Class

Methods:
- **static** SkriptPattern compile(String pattern) throws MalformedPatternException

### Class: ch.njol.skript.patterns.PatternElement
Type: Abstract Class

Methods:
- Set<String> getAllCombinations(boolean clean)
- Set<String> getCombinations(boolean)
- String toFullString()
- MatchResult match(String, MatchResult)
- String toString()

### Class: ch.njol.skript.patterns.RegexPatternElement
Type: Class
Extends: ch.njol.skript.patterns.PatternElement

Constructors:
- RegexPatternElement(Pattern pattern)

Methods:
- Set<String> getCombinations(boolean clean)
- MatchResult match(String expr, MatchResult matchResult)
- String toString()

### Class: ch.njol.skript.patterns.SkriptPattern
Type: Class

Constructors:
- SkriptPattern(PatternElement first, int expressionAmount)

Methods:
- List<TT> getElements(Class<TT> type)
- int countNonNullTypes()
- MatchResult match(String expr, int flags, ParseContext parseContext)
- MatchResult match(String expr)
- String toString()
- int countTypes()

### Class: ch.njol.skript.patterns.TypePatternElement
Type: Class
Extends: ch.njol.skript.patterns.PatternElement

Constructors:
- TypePatternElement(ClassInfo<*> classes, [Z isPlural, boolean isNullable, int flagMask, int time, int expressionIndex)

Methods:
- Set<String> getCombinations(boolean clean)
- MatchResult match(String expr, MatchResult matchResult)
- String toString()
- **static** TypePatternElement fromString(String string, int expressionIndex)
- SkriptParser$ExprInfo getExprInfo()

## Package: ch.njol.skript.registrations

### Class: ch.njol.skript.registrations.EventConverter
Type: Interface
Implements: org.skriptlang.skript.lang.converter.Converter

Methods:
- V set(T, E)

### Class: ch.njol.skript.registrations.Classes
Type: Abstract Class

Methods:
- **static** Class<*> getClass(String codeName)
- **static** ClassInfo<*> getClassInfo(String codeName)
- **static** V registerClass(ClassInfo<TT> info)
- **static** DefaultExpression<*> getDefaultExpression(String codeName)
- **static** DefaultExpression<TT> getDefaultExpression(Class<TT> c)
- **static** ClassInfo<*> getClassInfoNoError(String codeName)
- **static** Parser<+TT> getParser(Class<TT> to)
- **static** String getDebugMessage(Object o)
- **static** ClassInfo<TT> getExactClassInfo(Class<TT> c)
- **static** List<ClassInfo<*>> getClassInfos()
- **static** ClassInfo<-TT> getSuperClassInfo(Class<TT> c)
- **static** ClassInfo<*> getSuperClassInfo(Class<*> classes)
- **static** Object deserialize(ClassInfo<*> type, [B value)
- **static** Object deserialize(String type, byte[] value)
- **static** Object deserialize(ClassInfo<*> type, InputStream value)
- **static** Object deserialize(String type, String value)
- **static** Parser<+TT> getExactParser(Class<TT> c)
- **static** TT parse(String s, Class<TT> c, ParseContext context)
- **static** Set<ClassInfo<*>> getClassInfosByProperty(Property<*> property)
- **static** V hasProperty(Property<*> property, ClassInfo<*> classInfo)
- **static** List<ClassInfo<*>> getPatternInfos(String pattern)
- **static** Class<*> getClassFromUserInput(String name)
- **static** TT parseSimple(String s, Class<TT> c, ParseContext context)
- **static** void onRegistrationsStop()
- **static** SerializedVariable$Value serialize(Object object)
- **static** Object clone(Object obj)
- **static** String toString(Object o)
- **static** String toString(T o, T mode)
- **static** String toString(Object[] os, int flags, boolean and)
- **static** String toString(Object[] os, int flags, ChatColor c)
- **static** String toString(Object[] os, boolean and)
- **static** String toString(Object[] os, boolean and, StringMode mode)
- **static** String getExactClassName(Class<*> c)
- **static** List<ClassInfo<-TT>> getAllSuperClassInfos(Class<TT> c)
- **static** ClassInfo<*> getClassInfoFromUserInput(String name)

### Class: ch.njol.skript.registrations.Converters
Type: Abstract Class

Methods:
- **static** [TT convertUnsafe([T from, float to, ; conv)
- **static** Z converterExists(Class<*> from, Class<*> to)
- **static** Z converterExists(Class<*> from, Class<*> to)
- **static** List<ConverterInfo<**>> getConverters()
- **static** ConverterInfo<-TF, +TT> getConverterInfo(Class<TF> from, Class<TT> to)
- **static** [TT convertArray(Object o, Class<TT> to)
- **static** [TT convertArray(Object o, Class<+TT> to, Class<TT> superType)
- **static** V registerConverter(Class<TF> from, Class<TT> to, Converter<TF, TT> converter)
- **static** V registerConverter(Class<TF> from, Class<TT> to, Converter<TF, TT> converter, int options)
- **static** TT convert(T o, float to)
- **static** TT convert(T o, float to)
- **static** [TT convert([T from, float to, ; conv)
- **static** Converter<-TF, +TT> getConverter(Class<TF> from, Class<TT> to)
- **static** [TT convertStrictly(Object original, Class<TT> to) throws ClassCastException
- **static** TT convertStrictly(Object original, Class<TT> to) throws ClassCastException

### Class: ch.njol.skript.registrations.DefaultClasses
Type: Class

No public methods found

### Class: ch.njol.skript.registrations.EventValues
Type: Class

Methods:
- **static** Z doesEventValueHaveTimeStates(Class<Event> eventClass, Class<*> valueClass)
- **static** Multimap<Class<Event>, EventValues$EventValueInfo<**>> getPerEventEventValues()
- **static** int[] getTimeStates()
- **static** Kleenean hasMultipleGetters(Class<TE> eventClass, Class<TT> valueClass, int time)
- **static** Converter<-TE, +TT> getEventValueConverter(Class<TE> eventClass, Class<TT> valueClass, int time)
- **static** V registerEventValue(Class<TE> eventClass, Class<TT> valueClass, Converter<TE, TT> converter)
- **static** V registerEventValue(Class<TE> eventClass, Class<TT> valueClass, Converter<TE, TT> converter, int time)
- **static** V registerEventValue(Class<TE> eventClass, Class<TT> valueClass, Converter<TE, TT> converter, int time, String excludeErrorMessage, Class<+TE> excludes)
- **static** V registerEventValue(Class<TE> eventClass, Class<TT> valueClass, Getter<TT, TE> getter, int time, String excludeErrorMessage, Class<+TE> excludes)
- **static** V registerEventValue(Class<TE> eventClass, Class<TT> valueClass, Getter<TT, TE> getter, int time)
- **static** Kleenean hasMultipleConverters(Class<TE> eventClass, Class<TT> valueClass, int time)
- **static** List<EventValues$EventValueInfo<**>> getEventValuesListForTime(int time)
- **static** TT getEventValue(T event, E valueClass, ; time)
- **static** Converter<-TE, +TT> getExactEventValueConverter(Class<TE> eventClass, Class<TT> valueClass, int time)
- **static** Getter<+TT, -TE> getExactEventValueGetter(Class<TE> eventClass, Class<TT> valueClass, int time)
- **static** Z doesExactEventValueHaveTimeStates(Class<Event> eventClass, Class<*> valueClass)
- **static** Getter<+TT, -TE> getEventValueGetter(Class<TE> eventClass, Class<TT> valueClass, int time)

### Class: ch.njol.skript.registrations.EventValues$EventValueInfo
Type: Class
Extends: java.lang.Record

Constructors:
- EventValues$EventValueInfo(Class<TE> eventClass, Class<TT> valueClass, Converter<TE, TT> converter, String excludeErrorMessage, Class<+TE> excludes, int time)

Methods:
- Class<+TE> excludes()
- Class<TE> eventClass()
- int hashCode()
- Converter<TE, TT> converter()
- boolean equals(Object o)
- String toString()
- int time()
- Class<TT> valueClass()
- String excludeErrorMessage()

### Class: ch.njol.skript.registrations.Feature
Type: Enum
Extends: java.lang.Enum
Implements: org.skriptlang.skript.lang.experiment.Experiment

Enum Constants:
- EXAMPLES
- QUEUES
- FOR_EACH_LOOPS
- SCRIPT_REFLECTION
- CATCH_ERRORS
- TYPE_HINTS
- DAMAGE_SOURCE
- EQUIPPABLE_COMPONENTS

Methods:
- LifeCycle phase()
- **static** void registerAll(SkriptAddon addon, ExperimentRegistry manager)
- **static** Feature valueOf(String name)
- **static** Feature[] values()
- SkriptPattern pattern()
- String codeName()

## Package: ch.njol.skript.registrations.experiments

### Class: ch.njol.skript.registrations.experiments.QueueExperimentSyntax
Type: Interface
Implements: org.skriptlang.skript.lang.experiment.SimpleExperimentalSyntax

Methods:
- ExperimentData getExperimentData()

### Class: ch.njol.skript.registrations.experiments.ReflectionExperimentSyntax
Type: Interface
Implements: org.skriptlang.skript.lang.experiment.SimpleExperimentalSyntax

Methods:
- ExperimentData getExperimentData()

## Package: ch.njol.skript.sections

### Class: ch.njol.skript.sections.EffSecShoot
Type: Class
Extends: ch.njol.skript.lang.EffectSection

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.sections.EffSecShoot$ShootEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- EffSecShoot$ShootEvent(Entity projectile, LivingEntity shooter)

Methods:
- LivingEntity getShooter()
- HandlerList getHandlers()
- Entity getProjectile()

### Class: ch.njol.skript.sections.EffSecSpawn
Type: Class
Extends: ch.njol.skript.lang.EffectSection

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.sections.EffSecSpawn$SpawnEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- EffSecSpawn$SpawnEvent(Entity entity)

Methods:
- HandlerList getHandlers()
- Entity getEntity()

### Class: ch.njol.skript.sections.ExprSecCreateWorldBorder
Type: Class
Extends: ch.njol.skript.expressions.base.SectionExpression

Methods:
- Z init(Expression<*> expressions, int pattern, Kleenean delayed, SkriptParser$ParseResult result, SectionNode node, List<TriggerItem> triggerItems)
- Class<WorldBorder> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.sections.ExprSecCreateWorldBorder$CreateWorldborderEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- ExprSecCreateWorldBorder$CreateWorldborderEvent(WorldBorder worldborder)

Methods:
- HandlerList getHandlers()
- WorldBorder getWorldBorder()

### Class: ch.njol.skript.sections.SecCatchErrors
Type: Class
Extends: ch.njol.skript.lang.Section
Implements: org.skriptlang.skript.lang.experiment.ExperimentalSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- String toString(Event event, boolean debug)
- boolean isSatisfiedBy(ExperimentSet experimentSet)

### Class: ch.njol.skript.sections.SecConditional
Type: Class
Extends: ch.njol.skript.lang.Section

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- ExecutionIntent executionIntent()
- String toString(Event event, boolean debug)
- TriggerItem getNext()
- ExecutionIntent triggerExecutionIntent()

### Class: ch.njol.skript.sections.SecFilter
Type: Class
Extends: ch.njol.skript.lang.Section
Implements: ch.njol.skript.lang.InputSource

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- Object getCurrentValue()
- String getCurrentIndex()
- String toString(Event event, boolean debug)
- Set<ExprInput<*>> getDependentInputs()

### Class: ch.njol.skript.sections.SecFor
Type: Class
Extends: ch.njol.skript.sections.SecLoop
Implements: org.skriptlang.skript.lang.experiment.SimpleExperimentalSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- ExperimentData getExperimentData()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.sections.SecLoop
Type: Class
Extends: ch.njol.skript.lang.LoopSection

Methods:
- Object getPrevious(Event event)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- ExecutionIntent executionIntent()
- boolean isKeyedLoop()
- Expression<*> getLoopedExpression()
- Object getNext(Event event)
- boolean supportsPeeking()
- void exit(Event event)
- Expression<*> getExpression()
- SecLoop setNext(TriggerItem next)
- TriggerSection setNext(TriggerItem)
- TriggerItem setNext(TriggerItem)
- String toString(Event event, boolean debug)
- Object getCurrent(Event event)
- TriggerItem getActualNext()

### Class: ch.njol.skript.sections.SecWhile
Type: Class
Extends: ch.njol.skript.lang.LoopSection

Methods:
- void exit(Event event)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- ExecutionIntent executionIntent()
- SecWhile setNext(TriggerItem next)
- TriggerSection setNext(TriggerItem)
- TriggerItem setNext(TriggerItem)
- String toString(Event event, boolean debug)
- TriggerItem getActualNext()

## Package: ch.njol.skript.structures

### Class: ch.njol.skript.structures.StructAliases
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult, EntryContainer entryContainer)
- boolean load()
- Structure$Priority getPriority()
- String toString(Event e, boolean debug)

### Class: ch.njol.skript.structures.StructAutoReload
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- Z init(Literal<*> arguments, int pattern, SkriptParser$ParseResult result, EntryContainer container)
- boolean load()
- Structure$Priority getPriority()
- void unload()
- String toString(Event event, boolean debug)
- boolean postLoad()

### Class: ch.njol.skript.structures.StructAutoReload$AutoReload
Type: Class
Implements: org.skriptlang.skript.lang.script.ScriptData

Methods:
- void setLastReloadTime(long lastReload)
- long getLastReloadTime()
- List<CommandSender> getRecipients()

### Class: ch.njol.skript.structures.StructCommand
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult, EntryContainer entryContainer)
- boolean load()
- Structure$Priority getPriority()
- void unload()
- String toString(Event event, boolean debug)
- void postUnload()
- boolean postLoad()

### Class: ch.njol.skript.structures.StructEvent
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult, EntryContainer entryContainer)
- boolean load()
- SkriptEvent getSkriptEvent()
- Structure$Priority getPriority()
- void unload()
- String toString(Event event, boolean debug)
- void postUnload()
- boolean preLoad()
- boolean postLoad()

### Class: ch.njol.skript.structures.StructEvent$EventData
Type: Class
Extends: ch.njol.skript.lang.parser.ParserInstance$Data

Constructors:
- StructEvent$EventData(ParserInstance parserInstance)

Methods:
- SkriptEvent$ListeningBehavior getListenerBehavior()
- void clear()
- EventPriority getPriority()

### Class: ch.njol.skript.structures.StructExample
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure
Implements: org.skriptlang.skript.lang.experiment.SimpleExperimentalSyntax

Methods:
- Z init(Literal<*> literals, int matchedPattern, SkriptParser$ParseResult parseResult, EntryContainer entryContainer)
- boolean load()
- ExperimentData getExperimentData()
- Structure$Priority getPriority()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.structures.StructFunction
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- Z init(Literal<*> literals, int matchedPattern, SkriptParser$ParseResult parseResult, EntryContainer entryContainer)
- boolean load()
- Structure$Priority getPriority()
- void unload()
- String toString(Event event, boolean debug)
- boolean preLoad()
- boolean postLoad()

### Class: ch.njol.skript.structures.StructOptions
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult, EntryContainer entryContainer)
- boolean load()
- Structure$Priority getPriority()
- void unload()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.structures.StructOptions$OptionsData
Type: Class
Implements: org.skriptlang.skript.lang.script.ScriptData

Methods:
- String replaceOptions(String string)
- Map<String, String> getOptions()

### Class: ch.njol.skript.structures.StructUsing
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- Z init(Literal<*> arguments, int pattern, SkriptParser$ParseResult result, EntryContainer container)
- boolean load()
- Structure$Priority getPriority()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.structures.StructVariables
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult, EntryContainer entryContainer)
- boolean load()
- Structure$Priority getPriority()
- String toString(Event event, boolean debug)
- void postUnload()

### Class: ch.njol.skript.structures.StructVariables$DefaultVariables
Type: Class
Implements: org.skriptlang.skript.lang.script.ScriptData

Constructors:
- StructVariables$DefaultVariables(Collection<NonNullPair<String, Object>> variables)

Methods:
- V add(String variable, Class<*> hints)
- List<NonNullPair<String, Object>> getVariables()
- Class<*> get(String variable)
- boolean hasDefaultVariables()
- void exitScope()
- void enterScope()

## Package: ch.njol.skript.test.platform

### Class: ch.njol.skript.test.platform.Environment
Type: Class

Constructors:
- Environment(String name, List<Environment$Resource> resources, List<Environment$Resource> downloads, List<Environment$PaperResource> paperDownloads, String skriptTarget, String commandLine)

Methods:
- String getName()
- TestResults runTests(Path runnerRoot, Path testsRoot, boolean devMode, boolean genDocs, boolean jUnit, boolean debug, String verbosity, long timeout, Set<String>) throws IOException, InterruptedException
- void initialize(Path dataRoot, Path runnerRoot, boolean remake) throws IOException

### Class: ch.njol.skript.test.platform.Environment$PaperResource
Type: Class
Extends: ch.njol.skript.test.platform.Environment$Resource

Constructors:
- Environment$PaperResource(String version, String target)

Methods:
- String getSource()

### Class: ch.njol.skript.test.platform.Environment$Resource
Type: Class

Constructors:
- Environment$Resource(String source, String target)

Methods:
- String getTarget()
- String getSource()

### Class: ch.njol.skript.test.platform.PlatformMain
Type: Class

Methods:
- **static** void main(String[] args) throws IOException, InterruptedException

## Package: ch.njol.skript.test.runner

### Class: ch.njol.skript.test.runner.CondHasDelayBefore
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.test.runner.CondMethodExists
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- Condition simplify()
- SyntaxElement simplify()
- boolean check(String signature)
- boolean check(Object)

### Class: ch.njol.skript.test.runner.CondRunningJUnit
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: ch.njol.skript.test.runner.CustomTestOperators
Type: Class

No public methods found

### Class: ch.njol.skript.test.runner.EffAssert
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- TriggerItem walk(Event event)

### Class: ch.njol.skript.test.runner.EffDebug
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.EffObjectives
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- **static** void fail()
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- **static** boolean isJUnitComplete()

### Class: ch.njol.skript.test.runner.EffRunRunnable
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int pattern, Kleenean delayed, SkriptParser$ParseResult result)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.EffTestExprList
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.EffTestPluralClassInfos
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.EvtTestCase
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)
- String getTestName()
- boolean shouldLoadEvent()

### Class: ch.njol.skript.test.runner.ExprDefaultNumberValue
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Number> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.ExprExperimentalOnly
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Boolean> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.ExprKeyValueSet
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.KeyProviderExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- Z canReturn(Class<*> returnType)
- String toString(Event event, boolean debug)
- String[] getArrayKeys(Event event) throws IllegalStateException

### Class: ch.njol.skript.test.runner.ExprParseLogs
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.ExprSecRunnable
Type: Class
Extends: ch.njol.skript.expressions.base.SectionExpression

Methods:
- Z init(Expression<*> expressions, int pattern, Kleenean delayed, SkriptParser$ParseResult result, SectionNode node, List<TriggerItem> triggerItems)
- boolean isSectionOnly()
- Class<*> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.ExprSecRunnable$RunnableEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()

### Class: ch.njol.skript.test.runner.ExprTestBlock
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Block> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.ExprTestLocation
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Location> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.ExprTestLoopPeeking
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- boolean supportsLoopPeeking()

### Class: ch.njol.skript.test.runner.ExprTestOfflinePlayer
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<OfflinePlayer> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.ExprTestStringLiteral
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<String> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.ExprTestWorld
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<World> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.SecCustomDefault
Type: Class
Extends: ch.njol.skript.lang.Section

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.SecParse
Type: Class
Extends: ch.njol.skript.lang.Section

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.SecReturnable
Type: Class
Extends: ch.njol.skript.lang.Section
Implements: ch.njol.skript.lang.ReturnHandler

Methods:
- V returnValues(Event event, Expression<*> value)
- Class<*> returnValueType()
- boolean isSingleReturnValue()
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult, SectionNode sectionNode, List<TriggerItem> triggerItems)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.SecReturnable$ExprLastReturnValues
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- boolean isSingle()
- Object[] get(Event event)
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.SkriptAsyncJUnitTest
Type: Abstract Class
Extends: ch.njol.skript.test.runner.SkriptJUnitTest

No public methods found

### Class: ch.njol.skript.test.runner.SkriptJUnitTest
Type: Abstract Class

Methods:
- **static** Block getBlock()
- **static** String getCurrentJUnitTest()
- void cleanup()
- **static** Block setBlock(Material material)
- **static** World getTestWorld()
- **static** Location getTestLocation()
- **static** void setShutdownDelay(long delay)
- **static** void setCurrentJUnitTest(String currentJUnitTest)
- **static** TE spawnTestEntity(EntityType entityType)
- **static** void clearJUnitTest()
- **static** long getShutdownDelay()
- **static** Pig spawnTestPig()

### Class: ch.njol.skript.test.runner.SkriptTestEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: ch.njol.skript.test.runner.StructParse
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult, EntryContainer entryContainer)
- boolean load()
- String toString(Event event, boolean debug)
- boolean postLoad()

### Class: ch.njol.skript.test.runner.StructTestEntryContainer
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult, EntryContainer entryContainer)
- boolean load()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.StructTestSubValidators
Type: Class
Extends: org.skriptlang.skript.lang.structure.Structure

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult, EntryContainer entryContainer)
- boolean load()
- String toString(Event event, boolean debug)

### Class: ch.njol.skript.test.runner.TestFeatures
Type: Enum
Extends: java.lang.Enum
Implements: org.skriptlang.skript.lang.experiment.Experiment

Enum Constants:
- EXAMPLE_FEATURE
- DEPRECATED_FEATURE
- TEST_FEATURE

Methods:
- LifeCycle phase()
- **static** void registerAll(SkriptAddon addon, ExperimentRegistry manager)
- **static** TestFeatures valueOf(String name)
- **static** TestFeatures[] values()
- SkriptPattern pattern()
- String codeName()

### Class: ch.njol.skript.test.runner.TestFunctions
Type: Class

No public methods found

### Class: ch.njol.skript.test.runner.TestMode
Type: Class

No public methods found

### Class: ch.njol.skript.test.runner.TestTracker
Type: Class

Methods:
- **static** Set<String> getSucceededTests()
- **static** TestResults collectResults()
- **static** void testFailed(String msg)
- **static** void testFailed(String msg, Script script)
- **static** void testFailed(String msg, Script script, int line)
- **static** void JUnitTestFailed(String currentTest, String msg)
- **static** void parsingStarted(String name)
- **static** void testStarted(String name)
- **static** Map<String, String> getFailedTests()
- **static** void junitTestFailed(String junit, String msg)

## Package: ch.njol.skript.test.utils

### Class: ch.njol.skript.test.utils.TestOfflinePlayer
Type: Class
Implements: org.bukkit.OfflinePlayer

Methods:
- Location getLocation()
- Player getPlayer()
- String getName()
- int getStatistic(Statistic statistic) throws IllegalArgumentException
- int getStatistic(Statistic statistic, Material material) throws IllegalArgumentException
- int getStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException
- long getFirstPlayed()
- boolean isConnected()
- boolean isOnline()
- void decrementStatistic(Statistic statistic) throws IllegalArgumentException
- void decrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException
- void decrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException
- void decrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException
- void decrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException
- void decrementStatistic(Statistic statistic, EntityType entityType, int amount)
- boolean isWhitelisted()
- TE ban(String reason, Date expires, String source)
- TE ban(String reason, Instant expires, String source)
- TE ban(String reason, Duration duration, String source)
- Location getRespawnLocation(boolean loadLocationAndValidate)
- UUID getUniqueId()
- boolean isOp()
- boolean isBanned()
- long getLastLogin()
- PlayerProfile getPlayerProfile()
- Location getLastDeathLocation()
- void incrementStatistic(Statistic statistic) throws IllegalArgumentException
- void incrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException
- void incrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException
- void incrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException
- void incrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException
- void incrementStatistic(Statistic statistic, EntityType entityType, int amount) throws IllegalArgumentException
- void setOp(boolean value)
- PersistentDataContainerView getPersistentDataContainer()
- Map<String, Object> serialize()
- boolean hasPlayedBefore()
- long getLastPlayed()
- long getLastSeen()
- **static** TestOfflinePlayer getInstance()
- void setStatistic(Statistic statistic, int newValue) throws IllegalArgumentException
- void setStatistic(Statistic statistic, Material material, int newValue) throws IllegalArgumentException
- void setStatistic(Statistic statistic, EntityType entityType, int newValue)
- void setWhitelisted(boolean value)

### Class: ch.njol.skript.test.utils.TestResults
Type: Class

Constructors:
- TestResults(Set<String> succeeded, Map<String, String> failed, boolean docsFailed)

Methods:
- boolean docsFailed()
- String createReport()
- Set<String> getSucceeded()
- Map<String, String> getFailed()

## Package: ch.njol.skript.timings

### Class: ch.njol.skript.timings.SkriptTimings
Type: Class

Methods:
- **static** void setEnabled(boolean flag)
- **static** void stop(Object timing)
- **static** void setSkript(Skript plugin)
- **static** Object start(String name)
- **static** boolean enabled()

## Package: ch.njol.skript.update

### Class: ch.njol.skript.update.UpdateChecker
Type: Interface

Methods:
- CompletableFuture<UpdateManifest> check(ReleaseManifest, ReleaseChannel)

### Class: ch.njol.skript.update.GithubChecker
Type: Class
Implements: ch.njol.skript.update.UpdateChecker

Methods:
- CompletableFuture<UpdateManifest> check(ReleaseManifest manifest, ReleaseChannel channel)

### Class: ch.njol.skript.update.GithubChecker$ResponseEntry
Type: Class

Methods:
- String toString()

### Class: ch.njol.skript.update.GithubChecker$ResponseEntry$AssetsEntry
Type: Class

No public methods found

### Class: ch.njol.skript.update.GithubChecker$ResponseEntry$Author
Type: Class

No public methods found

### Class: ch.njol.skript.update.NoUpdateChecker
Type: Class
Implements: ch.njol.skript.update.UpdateChecker

Methods:
- CompletableFuture<UpdateManifest> check(ReleaseManifest manifest, ReleaseChannel channel)

### Class: ch.njol.skript.update.ReleaseChannel
Type: Class

Constructors:
- ReleaseChannel(Function<String, Boolean> checker, String name)

Methods:
- String getName()
- boolean check(String release)

### Class: ch.njol.skript.update.ReleaseManifest
Type: Class

Constructors:
- ReleaseManifest(String id, String date, String flavor, Class<UpdateChecker> updateCheckerType, String updateSource, String downloadSource)

Methods:
- UpdateChecker createUpdateChecker()
- **static** ReleaseManifest load(String json) throws JsonParseException

### Class: ch.njol.skript.update.ReleaseStatus
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- LATEST
- OUTDATED
- UNKNOWN
- CUSTOM
- DEVELOPMENT

Methods:
- **static** ReleaseStatus valueOf(String name)
- **static** ReleaseStatus[] values()
- String toString()

### Class: ch.njol.skript.update.UpdateManifest
Type: Class

Constructors:
- UpdateManifest(String id, String date, String patchNotes, URL downloadUrl)

No public methods found

### Class: ch.njol.skript.update.Updater
Type: Abstract Class

Methods:
- UpdateManifest getUpdateManifest()
- void setEnabled(boolean enabled)
- ReleaseManifest getCurrentRelease()
- CompletableFuture<UpdateManifest> fetchUpdateManifest()
- ReleaseStatus getReleaseStatus()
- void setReleaseChannel(ReleaseChannel channel)
- UpdaterState getState()
- boolean isEnabled()
- void setCheckFrequency(long ticks)
- CompletableFuture<Void> checkUpdates()

### Class: ch.njol.skript.update.UpdaterState
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- NOT_STARTED
- CHECKING
- DOWNLOADING
- INACTIVE
- ERROR

Methods:
- **static** UpdaterState valueOf(String name)
- **static** UpdaterState[] values()

## Package: ch.njol.skript.util

### Class: ch.njol.skript.util.Color
Type: Interface
Implements: ch.njol.yggdrasil.YggdrasilSerializable$YggdrasilExtendedSerializable

Methods:
- String getName()
- int getGreen()
- int getRed()
- DyeColor asDyeColor()
- Color asBukkitColor()
- int asARGB()
- int getBlue()
- int getAlpha()

### Class: ch.njol.skript.util.Container
Type: Interface

Methods:
- Iterator<TT> containerIterator()

### Class: ch.njol.skript.util.Container$ContainerType
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- Class<*> value()

### Class: ch.njol.skript.util.Contract
Type: Interface

Methods:
- Class<*> getReturnType(Expression<*>)
- Z isSingle(Expression<*>)

### Class: ch.njol.skript.util.AABB
Type: Class
Implements: java.lang.Iterable

Constructors:
- AABB(Location world, Location lowerBound)
- AABB(Block world, Block lowerBound)
- AABB(Location world, double rX, double rY, double lowerBound)
- AABB(World world, Vector v1, Vector lowerBound)
- AABB(Chunk world)

Methods:
- Vector getDimensions()
- Iterator<Block> iterator()
- World getWorld()
- boolean contains(Location l)
- boolean contains(Block b)
- int hashCode()
- boolean equals(Object obj)

### Class: ch.njol.skript.util.AsyncEffect
Type: Abstract Class
Extends: ch.njol.skript.lang.Effect

No public methods found

### Class: ch.njol.skript.util.BlockInventoryHolder
Type: Class
Extends: ch.njol.skript.util.BlockStateBlock
Implements: org.bukkit.inventory.InventoryHolder

Constructors:
- BlockInventoryHolder(BlockState state)

Methods:
- Inventory getInventory()

### Class: ch.njol.skript.util.BlockLineIterator
Type: Class
Implements: java.util.Iterator

Constructors:
- BlockLineIterator(Location current, Location end)
- BlockLineIterator(Block start, Block end)
- BlockLineIterator(Location start, Vector direction, double distance)
- BlockLineIterator(Block start, Vector direction, double distance)

Methods:
- Block next()
- Object next()
- boolean hasNext()

### Class: ch.njol.skript.util.BlockSphereIterator
Type: Class
Extends: ch.njol.util.coll.iterator.CheckedIterator

Constructors:
- BlockSphereIterator(Location center, double radius)

No public methods found

### Class: ch.njol.skript.util.BlockStateBlock
Type: Class
Implements: org.bukkit.block.Block

Constructors:
- BlockStateBlock(BlockState state)
- BlockStateBlock(BlockState state, boolean delayChanges)

Methods:
- boolean isSuffocating()
- boolean isPassable()
- Location getLocation()
- Location getLocation(Location loc)
- World getWorld()
- String translationKey()
- boolean canPlace(BlockData data)
- float getDestroySpeed(ItemStack itemStack)
- float getDestroySpeed(ItemStack itemStack, boolean considerEnchants)
- boolean isBlockIndirectlyPowered()
- Block getRelative(int modX, int modY, int modZ)
- Block getRelative(BlockFace face)
- Block getRelative(BlockFace face, int distance)
- VoxelShape getCollisionShape()
- boolean isReplaceable()
- boolean isBurnable()
- void setBiome(Biome bio)
- BlockSoundGroup getSoundGroup()
- List<MetadataValue> getMetadata(String metadataKey)
- void tick()
- BlockFace getFace(Block block)
- double getHumidity()
- void setBlockData(BlockData data)
- void setBlockData(BlockData data, boolean applyPhysics)
- Material getType()
- float getBreakSpeed(Player player)
- boolean isValidTool(ItemStack itemStack)
- byte getLightFromBlocks()
- byte getLightLevel()
- double getTemperature()
- boolean applyBoneMeal(BlockFace blockFace)
- boolean isBlockPowered()
- SoundGroup getBlockSoundGroup()
- BlockData getBlockData()
- byte getLightFromSky()
- BoundingBox getBoundingBox()
- boolean isSolid()
- boolean isCollidable()
- boolean isPreferredTool(ItemStack tool)
- void fluidTick()
- boolean isBlockFaceIndirectlyPowered(BlockFace face)
- Biome getBiome()
- byte getData()
- void randomTick()
- String getTranslationKey()
- boolean isEmpty()
- RayTraceResult rayTrace(Location start, Vector direction, double maxDistance, FluidCollisionMode)
- boolean hasMetadata(String metadataKey)
- void setType(Material type)
- void setType(Material type, boolean applyPhysics)
- boolean isBlockFacePowered(BlockFace face)
- Biome getComputedBiome()
- void setMetadata(String metadataKey, MetadataValue newMetadataValue)
- int getX()
- boolean isLiquid()
- BlockState getState()
- BlockState getState(boolean useSnapshot)
- int getY()
- int getBlockPower(BlockFace face)
- int getBlockPower()
- int getZ()
- PistonMoveReaction getPistonMoveReaction()
- Chunk getChunk()
- void removeMetadata(String metadataKey, Plugin owningPlugin)
- Collection<ItemStack> getDrops()
- Collection<ItemStack> getDrops(ItemStack tool)
- Collection<ItemStack> getDrops(ItemStack tool, Entity entity)
- boolean breakNaturally()
- boolean breakNaturally(ItemStack tool)
- boolean breakNaturally(boolean triggerEffect)
- boolean breakNaturally(ItemStack tool, boolean triggerEffect)
- boolean breakNaturally(ItemStack tool, boolean triggerEffect, boolean dropExperience, boolean forceEffect)
- boolean breakNaturally(boolean triggerEffect, boolean dropExperience)
- boolean breakNaturally(ItemStack tool, boolean triggerEffect, boolean dropExperience)
- boolean isBuildable()

### Class: ch.njol.skript.util.BlockUtils
Type: Class

Methods:
- **static** Block extractBlock(Block block)
- **static** Location getLocation(Block b)
- **static** boolean set(Block block, Material type, BlockValues blockValues, boolean applyPhysics)
- **static** boolean set(Block block, ItemData type, boolean applyPhysics)
- **static** Iterable<Block> getBlocksAround(Block b)
- **static** Iterable<BlockFace> getFaces()
- **static** String blockToString(Block block, int flags)
- **static** void sendBlockChange(Player player, Location location, Material type, BlockValues blockValues)
- **static** BlockData createBlockData(String dataString)

### Class: ch.njol.skript.util.ClassInfoReference
Type: Class

Constructors:
- ClassInfoReference(ClassInfo<*> classInfo)
- ClassInfoReference(ClassInfo<*> classInfo, Kleenean plural)

Methods:
- ClassInfo<*> getClassInfo()
- void setPlural(Kleenean plural)
- Kleenean isPlural()
- V setClassInfo(ClassInfo<*> classInfo)
- **static** Expression<ClassInfoReference> wrap(Expression<ClassInfo<*>> classInfoExpression)

### Class: ch.njol.skript.util.ColorRGB
Type: Class
Implements: ch.njol.skript.util.Color

Constructors:
- ColorRGB(int red, int green, int blue)
- ColorRGB(Color dye)

Methods:
- **static** ColorRGB fromRGB(int red, int green, int blue)
- **static** ColorRGB fromRGBA(int red, int green, int blue, int alpha)
- Fields serialize() throws NotSerializableException
- String getName()
- int getGreen()
- int getRed()
- DyeColor asDyeColor()
- Color asBukkitColor()
- **static** ColorRGB fromString(String string)
- int getBlue()
- **static** ColorRGB fromBukkitColor(Color bukkit)
- void deserialize(Fields fields) throws StreamCorruptedException, NotSerializableException
- int getAlpha()

### Class: ch.njol.skript.util.Date
Type: Class
Extends: java.util.Date
Implements: ch.njol.yggdrasil.YggdrasilSerializable

Constructors:
- Date(long timestamp)
- Date(long timestamp, TimeZone zone)

Methods:
- void add(Timespan other)
- Date minus(Timespan other)
- int hashCode()
- long getTimestamp()
- boolean equals(Object obj)
- void subtract(Timespan other)
- **static** Date now()
- Timespan difference(Date other)
- String toString()
- **static** Date fromJavaDate(Date date)
- Date plus(Timespan other)

### Class: ch.njol.skript.util.DelayedChangeBlock
Type: Class
Implements: org.bukkit.block.Block

Constructors:
- DelayedChangeBlock(Block block)
- DelayedChangeBlock(Block block, BlockState newState)

Methods:
- boolean isSuffocating()
- boolean isPassable()
- Location getLocation()
- Location getLocation(Location loc)
- World getWorld()
- String translationKey()
- boolean canPlace(BlockData data)
- float getDestroySpeed(ItemStack itemStack)
- float getDestroySpeed(ItemStack itemStack, boolean considerEnchants)
- boolean isBlockIndirectlyPowered()
- Block getRelative(int modX, int modY, int modZ)
- Block getRelative(BlockFace face)
- Block getRelative(BlockFace face, int distance)
- VoxelShape getCollisionShape()
- boolean isReplaceable()
- boolean isBurnable()
- void setBiome(Biome bio)
- BlockSoundGroup getSoundGroup()
- List<MetadataValue> getMetadata(String metadataKey)
- void tick()
- BlockFace getFace(Block block)
- double getHumidity()
- void setBlockData(BlockData data)
- void setBlockData(BlockData data, boolean applyPhysics)
- Material getType()
- float getBreakSpeed(Player player)
- boolean isValidTool(ItemStack itemStack)
- byte getLightFromBlocks()
- byte getLightLevel()
- double getTemperature()
- boolean applyBoneMeal(BlockFace blockFace)
- boolean isBlockPowered()
- SoundGroup getBlockSoundGroup()
- BlockData getBlockData()
- byte getLightFromSky()
- BoundingBox getBoundingBox()
- boolean isSolid()
- boolean isCollidable()
- boolean isPreferredTool(ItemStack tool)
- void fluidTick()
- boolean isBlockFaceIndirectlyPowered(BlockFace face)
- Biome getBiome()
- byte getData()
- void randomTick()
- String getTranslationKey()
- boolean isEmpty()
- RayTraceResult rayTrace(Location start, Vector direction, double maxDistance, FluidCollisionMode)
- boolean hasMetadata(String metadataKey)
- void setType(Material type)
- void setType(Material type, boolean applyPhysics)
- boolean isBlockFacePowered(BlockFace face)
- Biome getComputedBiome()
- void setMetadata(String metadataKey, MetadataValue newMetadataValue)
- int getX()
- boolean isLiquid()
- BlockState getState()
- BlockState getState(boolean useSnapshot)
- int getY()
- int getBlockPower(BlockFace face)
- int getBlockPower()
- int getZ()
- PistonMoveReaction getPistonMoveReaction()
- Chunk getChunk()
- void removeMetadata(String metadataKey, Plugin owningPlugin)
- Collection<ItemStack> getDrops()
- Collection<ItemStack> getDrops(ItemStack tool)
- Collection<ItemStack> getDrops(ItemStack tool, Entity entity)
- boolean breakNaturally()
- boolean breakNaturally(ItemStack tool)
- boolean breakNaturally(boolean triggerEffect)
- boolean breakNaturally(ItemStack tool, boolean triggerEffect)
- boolean breakNaturally(ItemStack tool, boolean triggerEffect, boolean dropExperience, boolean forceEffect)
- boolean breakNaturally(boolean triggerEffect, boolean dropExperience)
- boolean breakNaturally(ItemStack tool, boolean triggerEffect, boolean dropExperience)
- boolean isBuildable()

### Class: ch.njol.skript.util.Direction
Type: Class
Implements: ch.njol.yggdrasil.YggdrasilSerializable$YggdrasilRobustSerializable

Constructors:
- Direction(double[] relative)
- Direction(double pitchOrX, double yawOrY, double lengthOrZ)
- Direction(BlockFace f, double length)
- Direction(Vector pitchOrX)

Methods:
- boolean excessiveField(Fields$FieldContext field) throws StreamCorruptedException
- Vector getDirection()
- Vector getDirection(Location l)
- Vector getDirection(Entity e)
- Vector getDirection(Block b)
- **static** Location[] getRelatives(Block[] blocks, Direction[] directions)
- **static** Location[] getRelatives(Location[] locations, Direction[] directions)
- Location getRelative(Location l)
- Location getRelative(Entity e)
- Location getRelative(Block b)
- **static** double pitchToRadians(float pitch)
- boolean missingField(Field field) throws StreamCorruptedException
- **static** float getYaw(double yaw)
- **static** float getPitch(double pitch)
- int hashCode()
- boolean equals(Object obj)
- boolean incompatibleField(Field f, Fields$FieldContext value) throws StreamCorruptedException
- **static** double yawToRadians(float yaw)
- String toString()
- **static** String toString(double pitch, double, double yaw)
- **static** String toString(double[] mod)
- **static** String toString(Vector dir)
- **static** BlockFace getFacing(Block b)
- **static** BlockFace getFacing(double yaw, double)
- **static** BlockFace getFacing(Location l, boolean horizontal)
- **static** BlockFace getFacing(Vector v, boolean horizontal)
- boolean isRelative()
- **static** Expression<Location> combine(Expression<Direction> dirs, Expression<Location> locs)
- **static** Direction deserialize(String s)

### Class: ch.njol.skript.util.EmptyStacktraceException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: ch.njol.skript.util.EnchantmentType
Type: Class
Implements: ch.njol.yggdrasil.YggdrasilSerializable

Constructors:
- EnchantmentType(Enchantment type)
- EnchantmentType(Enchantment type, int level)

Methods:
- int getLevel()
- Enchantment getType()
- int hashCode()
- boolean equals(Object obj)
- String toString()
- **static** EnchantmentType parse(String s)
- boolean has(ItemType item)
- int getInternalLevel()

### Class: ch.njol.skript.util.EnumUtils
Type: Class

Constructors:
- EnumUtils(Class<TE> enumClass, String languageNode)

Methods:
- String toString(T enumerator, E flags)
- String toString(T enumerator, E flag)
- TE parse(String input)
- String getAllNames()

### Class: ch.njol.skript.util.ExceptionUtils
Type: Abstract Class

Methods:
- **static** String toString(IOException e)

### Class: ch.njol.skript.util.Experience
Type: Class
Implements: ch.njol.yggdrasil.YggdrasilSerializable

Constructors:
- Experience(int xp)

Methods:
- int getInternalXP()
- int getXP()
- int hashCode()
- boolean equals(Object obj)
- String toString()

### Class: ch.njol.skript.util.FileUtils
Type: Abstract Class

Methods:
- **static** Collection<File> renameAll(File directory, Converter<String, String> renamer) throws IOException
- **static** File move(File from, File to, boolean replace) throws IOException
- **static** File backup(File f) throws IOException
- **static** void backupPurge(File varFile, int toKeep) throws IOException, IllegalArgumentException
- **static** void save(InputStream in, File file) throws IOException
- **static** String getBackupSuffix()
- **static** void copy(File from, File to) throws IOException

### Class: ch.njol.skript.util.GameruleValue
Type: Class
Implements: ch.njol.yggdrasil.YggdrasilSerializable

Constructors:
- GameruleValue(T gameruleValue)

Methods:
- boolean equals(Object other)
- String toString()
- TT getGameruleValue()

### Class: ch.njol.skript.util.Getter
Type: Abstract Class
Implements: org.skriptlang.skript.lang.converter.Converter

Methods:
- TR get(T)
- TR convert(T a)

### Class: ch.njol.skript.util.ItemSource
Type: Class

Constructors:
- ItemSource(T source)

Methods:
- void setItemMeta(ItemMeta itemMeta)
- TT getSource()
- **static** ItemSource<Slot> fromSlot(Slot slot)
- ItemMeta getItemMeta()
- ItemStack getItemStack()

### Class: ch.njol.skript.util.LiteralUtils
Type: Class

Methods:
- **static** Z canInitSafely(Expression<*> expressions)
- **static** Expression<TT> defendExpression(Expression<*> expr)
- **static** Z hasUnparsedLiteral(Expression<*> expr)

### Class: ch.njol.skript.util.PaperUtils
Type: Class

Methods:
- **static** Registry<TT> getBukkitRegistry(String registry)
- **static** boolean registryExists(String registry)

### Class: ch.njol.skript.util.Patterns
Type: Class

Constructors:
- Patterns(Object[][] patterns)

Methods:
- Integer getMatchedPatterns(T type)
- TT getInfo(int matchedPattern)
- String[] getPatterns()
- Optional<Integer> getMatchedPattern(T type, T arrayIndex)

### Class: ch.njol.skript.util.PotionDataUtils
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FIRE_RESISTANCE
- FIRE_RESISTANCE_LONG
- HARMING
- HARMING_STRONG
- HEALING
- HEALING_STRONG
- INVISIBILITY
- INVISIBILITY_LONG
- LEAPING
- LEAPING_LONG
- LEAPING_STRONG
- LUCK
- NIGHT_VISION
- NIGHT_VISION_LONG
- POISON
- POISON_LONG
- POISON_STRONG
- REGENERATION
- REGENERATION_LONG
- REGENERATION_STRONG
- SLOW_FALLING
- SLOW_FALLING_LONG
- SLOWNESS
- SLOWNESS_LONG
- SLOWNESS_STRONG
- SWIFTNESS
- SWIFTNESS_LONG
- SWIFTNESS_STRONG
- STRENGTH
- STRENGTH_LONG
- STRENGTH_STRONG
- TURTLE_MASTER
- TURTLE_MASTER_LONG
- TURTLE_MASTER_STRONG
- WATER_BREATHING
- WATER_BREATHING_LONG
- WEAKNESS
- WEAKNESS_LONG

Methods:
- **static** PotionDataUtils valueOf(String name)
- **static** PotionDataUtils[] values()
- **static** List<PotionEffect> getPotionEffects(PotionData potionData)

### Class: ch.njol.skript.util.PotionEffectUtils
Type: Abstract Class

Methods:
- **static** PotionType checkPotionType(String name)
- **static** PotionEffectType parseType(String s)
- **static** List<PotionEffect> getEffects(ItemType itemType)
- **static** String getPotionName(PotionEffectType effect, boolean extended, boolean strong)
- **static** String toString(PotionEffectType t)
- **static** String toString(PotionEffectType t, int flags)
- **static** String toString(PotionEffect potionEffect)
- **static** String[] getNames()
- **static** ClassInfo<PotionEffectType> getLegacyClassInfo()
- **static** void removeEffects(LivingEntity entity, Object[] effects)
- **static** void removeEffects(ItemType itemType, Object[] effects)
- **static** void addEffects(LivingEntity entity, Object[] effects)
- **static** void addEffects(ItemType itemType, Object[] effects)
- **static** PotionType effectToType(PotionEffectType effect)
- **static** void clearAllEffects(LivingEntity entity)
- **static** void clearAllEffects(ItemType itemType)
- **static** PotionEffectType parseByEffectType(PotionEffectType t)

### Class: ch.njol.skript.util.SkriptColor
Type: Enum
Extends: java.lang.Enum
Implements: ch.njol.skript.util.Color

Enum Constants:
- BLACK
- DARK_GREY
- LIGHT_GREY
- WHITE
- DARK_BLUE
- BROWN
- DARK_CYAN
- LIGHT_CYAN
- DARK_GREEN
- LIGHT_GREEN
- YELLOW
- ORANGE
- DARK_RED
- LIGHT_RED
- DARK_PURPLE
- LIGHT_PURPLE

Methods:
- **static** SkriptColor fromDyeData(short data)
- byte getDyeData()
- ChatColor asChatColor()
- byte getWoolData()
- String getName()
- String getFormattedChat()
- Color asBukkitColor()
- **static** SkriptColor valueOf(String name)
- **static** SkriptColor fromDyeColor(DyeColor dye)
- **static** SkriptColor[] values()
- **static** String replaceColorChar(String s)
- int getBlue()
- int getAlpha()
- Fields serialize() throws NotSerializableException
- int getGreen()
- int getRed()
- **static** SkriptColor fromColorChar(char character)
- DyeColor asDyeColor()
- **static** SkriptColor fromName(String name)
- **static** SkriptColor fromWoolData(short data)
- String toString()
- Adjective getAdjective()
- **static** SkriptColor fromBukkitColor(Color color)
- void deserialize(Fields fields) throws StreamCorruptedException

### Class: ch.njol.skript.util.StringMode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- MESSAGE
- VARIABLE_NAME
- COMMAND
- DEBUG

Methods:
- **static** StringMode valueOf(String name)
- **static** StringMode[] values()

### Class: ch.njol.skript.util.StructureType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- TREE
- REGULAR
- SMALL_REGULAR
- BIG_REGULAR
- REDWOOD
- SMALL_REDWOOD
- BIG_REDWOOD
- MEGA_REDWOOD
- BIRCH
- TALL_BIRCH
- JUNGLE
- SMALL_JUNGLE
- BIG_JUNGLE
- JUNGLE_BUSH
- COCOA_TREE
- ACACIA
- DARK_OAK
- SWAMP
- MUSHROOM
- RED_MUSHROOM
- BROWN_MUSHROOM

Methods:
- Noun getName()
- void grow(Location loc)
- void grow(Block b)
- **static** StructureType valueOf(String name)
- **static** StructureType[] values()
- **static** StructureType fromName(String s)
- boolean is(TreeType type)
- String toString()
- String toString(int flags)
- TreeType[] getTypes()

### Class: ch.njol.skript.util.Task
Type: Abstract Class
Implements: java.lang.Runnable, ch.njol.util.Closeable

Constructors:
- Task(Plugin plugin, long delay, long period)
- Task(Plugin plugin, long delay, long period, boolean async)
- Task(Plugin plugin, long delay)
- Task(Plugin plugin, boolean useScriptLoaderExecutor)
- Task(Plugin plugin, long delay, boolean async)
- Task(Plugin plugin, boolean useScriptLoaderExecutor, long delay)

Methods:
- void cancel()
- boolean isAlive()
- **static** TT callSync(Callable<TT> c)
- **static** TT callSync(Callable<TT> c, Plugin p)
- void setPeriod(long period)
- void setNextExecution(long delay)
- void close()

### Class: ch.njol.skript.util.Time
Type: Class
Implements: ch.njol.yggdrasil.YggdrasilSerializable, org.skriptlang.skript.lang.util.Cyclical

Constructors:
- Time(int time)

Methods:
- int getTicks()
- int hashCode()
- int getTime()
- boolean equals(Object obj)
- Integer getMinimum()
- Number getMinimum()
- int getMinute()
- String toString()
- **static** String toString(int ticks)
- int getHour()
- **static** Time parse(String s)
- Integer getMaximum()
- Number getMaximum()

### Class: ch.njol.skript.util.Timeperiod
Type: Class
Implements: ch.njol.yggdrasil.YggdrasilSerializable

Constructors:
- Timeperiod(int start, int end)
- Timeperiod(int end)

Methods:
- boolean contains(int time)
- boolean contains(Time t)
- int hashCode()
- boolean equals(Object obj)
- String toString()

### Class: ch.njol.skript.util.Timespan
Type: Class
Implements: ch.njol.yggdrasil.YggdrasilSerializable, java.lang.Comparable, java.time.temporal.TemporalAmount

Constructors:
- Timespan(long millis)
- Timespan(Timespan$TimePeriod millis, long time)

Methods:
- Timespan add(Timespan timespan)
- **static** Timespan fromTicks(long ticks)
- **static** Timespan infinite()
- Timespan subtract(Timespan timespan)
- **static** Timespan fromDuration(Duration duration)
- int compareTo(Timespan time)
- int compareTo(Object)
- **static** Timespan fromTicks_i(long ticks)
- **static** Timespan parse(String value)
- **static** Timespan parse(String value, ParseContext context)
- long getTicks()
- long getAs(Timespan$TimePeriod timePeriod)
- Duration getDuration()
- boolean isInfinite()
- int hashCode()
- Temporal subtractFrom(Temporal temporal)
- boolean equals(Object obj)
- long get(TemporalUnit unit)
- long getMilliSeconds()
- List<TemporalUnit> getUnits()
- long getTicks_i()
- Temporal addTo(Temporal temporal)
- Timespan difference(Timespan timespan)
- Timespan divide(double scalar)
- double divide(Timespan other)
- **static** String toString(long millis)
- **static** String toString(long millis, int)
- String toString()
- String toString(int flags)
- Timespan multiply(double scalar)

### Class: ch.njol.skript.util.Timespan$TimePeriod
Type: Enum
Extends: java.lang.Enum
Implements: java.time.temporal.TemporalUnit

Enum Constants:
- MILLISECOND
- TICK
- SECOND
- MINUTE
- HOUR
- DAY
- WEEK
- MONTH
- YEAR

Methods:
- boolean isDurationEstimated()
- String getFullForm()
- Duration getDuration()
- long getTime()
- **static** Timespan$TimePeriod valueOf(String name)
- boolean isTimeBased()
- **static** Timespan$TimePeriod[] values()
- TR addTo(T temporal, R amount)
- boolean isDateBased()
- long between(Temporal temporal1Inclusive, Temporal temporal2Exclusive)
- String getShortForm()

### Class: ch.njol.skript.util.Utils
Type: Abstract Class

Methods:
- **static** String A(String s)
- **static** Class<*> getSuperType(Class<*> classes)
- **static** Z isEither(T compared, T types)
- **static** NonNullPair<String, Boolean> getEnglishPlural(String word)
- **static** File getFile(Plugin plugin)
- **static** ChatColor parseHexColor(String string)
- **static** int random(int start, int end)
- **static** boolean isInteger(Number[] numbers)
- **static** String replaceChatStyles(String message)
- **static** String getChatStyle(String s)
- **static** String join(Object[] objects)
- **static** String join(Iterable<*> objects)
- **static** CompletableFuture<ByteArrayDataInput> sendPluginMessage(String channel, String data)
- **static** CompletableFuture<ByteArrayDataInput> sendPluginMessage(Player player, String channel, String data)
- **static** CompletableFuture<ByteArrayDataInput> sendPluginMessage(String channel, Predicate<ByteArrayDataInput> messageVerifier, String data) throws IllegalStateException
- **static** CompletableFuture<ByteArrayDataInput> sendPluginMessage(Player player, String channel, Predicate<ByteArrayDataInput> messageVerifier, String data)
- **static** Class<*> getClasses(Plugin plugin, String basePackage, String subPackages) throws IOException
- **static** Pair<String, Integer> getAmount(String s)
- **static** String a(String s)
- **static** String a(String s, boolean capA)
- **static** I loadedRemovedClassWarning(Class<*> source)
- **static** I findLastIndex(List<TT> list, Predicate<TT> checker)
- **static** double getBlockHeight(int type, byte data)
- **static** Class<*> classForName(String name)
- **static** String parseUnicode(String string)
- **static** String replaceEnglishChatStyles(String message)
- **static** int parseInt(String s)
- **static** Class<TFound> highestDenominator(Class<-TFound> bestGuess, Class<+TType> classes)
- **static** String toEnglishPlural(String word)
- **static** String toEnglishPlural(String s, boolean p)
- **static** long parseLong(String s)
- **static** boolean isValidUUID(String uuid)
- **static** void addPluralOverride(String singular, String plural)

### Class: ch.njol.skript.util.Utils$WordEnding
Type: Class
Extends: java.lang.Record

Constructors:
- Utils$WordEnding(String singular, String plural)

Methods:
- String plural()
- int hashCode()
- boolean equals(Object object)
- String toString()
- String singular()
- boolean isCompleteWord()

### Class: ch.njol.skript.util.ValidationResult
Type: Class
Extends: java.lang.Record

Constructors:
- ValidationResult(boolean valid)
- ValidationResult(boolean valid, String message)
- ValidationResult(boolean valid, T data)
- ValidationResult(boolean valid, String message, T data)

Methods:
- boolean valid()
- TT data()
- int hashCode()
- boolean equals(Object o)
- String toString()
- String message()

### Class: ch.njol.skript.util.Version
Type: Class
Implements: java.io.Serializable, java.lang.Comparable

Constructors:
- Version(int[] postfix)
- Version(int major, int minor, String postfix)
- Version(String postfix)

Methods:
- int getMinor()
- boolean isSmallerThan(Version other)
- **static** int compare(String v1, String v2)
- boolean isLargerThan(Version other)
- int hashCode()
- boolean equals(Object obj)
- int getMajor()
- String toString()
- int compareTo(Version other)
- int compareTo(int[] other)
- int compareTo(Object)
- int getRevision()
- boolean isStable()

### Class: ch.njol.skript.util.WeatherType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CLEAR
- RAIN
- THUNDER

Methods:
- **static** WeatherType fromEvent(WeatherEvent e)
- **static** WeatherType fromEvent(WeatherChangeEvent e)
- **static** WeatherType fromEvent(ThunderChangeEvent e)
- String adjective()
- **static** WeatherType fromPlayer(Player player)
- **static** WeatherType fromWorld(World world)
- **static** WeatherType valueOf(String name)
- boolean isWeather(World w)
- boolean isWeather(boolean rain, boolean thunder)
- **static** WeatherType[] values()
- void setWeather(Player player)
- void setWeather(World w)
- String toString()
- String toString(int flags)
- **static** WeatherType parse(String s)

## Package: ch.njol.skript.util.chat

### Class: ch.njol.skript.util.chat.ChatCode
Type: Interface

Methods:
- boolean isLocalized()
- String getColorCode()
- String getLangName()
- boolean hasParam()
- char getColorChar()
- void updateComponent(MessageComponent, String)

### Class: ch.njol.skript.util.chat.BungeeConverter
Type: Class

Methods:
- **static** BaseComponent convert(MessageComponent origin)
- **static** BaseComponent convert(List<MessageComponent> origins)
- **static** BaseComponent[] convert(MessageComponent[] origins)

### Class: ch.njol.skript.util.chat.ChatMessages
Type: Class

Methods:
- **static** void copyStyles(MessageComponent from, MessageComponent to)
- **static** String toJson(String msg)
- **static** String toJson(List<MessageComponent> components)
- **static** void registerListeners()
- **static** String stripStyles(String text)
- **static** void shareStyles(MessageComponent[] components)
- **static** MessageComponent plainText(String str)
- **static** List<MessageComponent> fromParsedString(String msg)
- **static** List<MessageComponent> parse(String msg)
- **static** MessageComponent[] parseToArray(String msg)
- **static** void registerAddonCode(SkriptAddon addon, ChatCode code)

### Class: ch.njol.skript.util.chat.LinkParseMode
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DISABLED
- STRICT
- LENIENT

Methods:
- **static** LinkParseMode valueOf(String name)
- **static** LinkParseMode[] values()

### Class: ch.njol.skript.util.chat.MessageComponent
Type: Class

Methods:
- MessageComponent copy()

### Class: ch.njol.skript.util.chat.MessageComponent$BooleanSerializer
Type: Class
Implements: com.google.gson.JsonSerializer

Methods:
- JsonElement serialize(Boolean src, Type typeOfSrc, JsonSerializationContext context)
- JsonElement serialize(Object, Type, JsonSerializationContext)

### Class: ch.njol.skript.util.chat.MessageComponent$ClickEvent
Type: Class

Constructors:
- MessageComponent$ClickEvent(MessageComponent$ClickEvent$Action action, String value)

No public methods found

### Class: ch.njol.skript.util.chat.MessageComponent$ClickEvent$Action
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- open_url
- run_command
- suggest_command
- change_page
- copy_to_clipboard

Methods:
- **static** MessageComponent$ClickEvent$Action valueOf(String name)
- **static** MessageComponent$ClickEvent$Action[] values()

### Class: ch.njol.skript.util.chat.MessageComponent$HoverEvent
Type: Class

Constructors:
- MessageComponent$HoverEvent(MessageComponent$HoverEvent$Action action, String value)

No public methods found

### Class: ch.njol.skript.util.chat.MessageComponent$HoverEvent$Action
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- show_text
- show_item
- show_entity
- show_achievement

Methods:
- **static** MessageComponent$HoverEvent$Action valueOf(String name)
- **static** MessageComponent$HoverEvent$Action[] values()

### Class: ch.njol.skript.util.chat.SkriptChatCode
Type: Enum
Extends: java.lang.Enum
Implements: ch.njol.skript.util.chat.ChatCode

Enum Constants:
- reset
- black
- dark_blue
- dark_green
- dark_aqua
- dark_red
- dark_purple
- gold
- gray
- dark_gray
- blue
- green
- aqua
- red
- light_purple
- yellow
- white
- bold
- italic
- underlined
- strikethrough
- obfuscated
- open_url
- run_command
- suggest_command
- change_page
- copy_to_clipboard
- show_text
- font
- insertion
- translate
- keybind

Methods:
- boolean isLocalized()
- String getColorCode()
- String getLangName()
- **static** SkriptChatCode valueOf(String name)
- **static** SkriptChatCode[] values()
- boolean hasParam()
- char getColorChar()
- void updateComponent(MessageComponent component, String param)

## Package: ch.njol.skript.util.slot

### Class: ch.njol.skript.util.slot.CursorSlot
Type: Class
Extends: ch.njol.skript.util.slot.Slot

Constructors:
- CursorSlot(Player player)
- CursorSlot(Player player, ItemStack eventItemStack)

Methods:
- Player getPlayer()
- boolean isInventoryClick()
- ItemStack getItem()
- String toString(Event event, boolean debug)
- boolean isSameSlot(Slot slot)
- void setAmount(int amount)
- void setItem(ItemStack item)
- int getAmount()

### Class: ch.njol.skript.util.slot.DisplayEntitySlot
Type: Class
Extends: ch.njol.skript.util.slot.Slot

Constructors:
- DisplayEntitySlot(ItemDisplay display)

Methods:
- ItemDisplay getItemDisplay()
- ItemStack getItem()
- String toString(Event event, boolean debug)
- boolean isSameSlot(Slot slot)
- void setAmount(int amount)
- void setItem(ItemStack item)
- int getAmount()

### Class: ch.njol.skript.util.slot.DroppedItemSlot
Type: Class
Extends: ch.njol.skript.util.slot.Slot

Constructors:
- DroppedItemSlot(Item entity)

Methods:
- ItemStack getItem()
- String toString(Event event, boolean debug)
- boolean isSameSlot(Slot slot)
- void setAmount(int amount)
- void setItem(ItemStack item)
- Item getItemEntity()
- int getAmount()

### Class: ch.njol.skript.util.slot.EquipmentSlot
Type: Class
Extends: ch.njol.skript.util.slot.SlotWithIndex

Constructors:
- EquipmentSlot(EntityEquipment entityEquipment, EquipmentSlot$EquipSlot skriptSlot, boolean slotToString)
- EquipmentSlot(EntityEquipment entityEquipment, EquipmentSlot$EquipSlot skriptSlot)
- EquipmentSlot(EntityEquipment entityEquipment, EquipmentSlot bukkitSlot, boolean slotToString)
- EquipmentSlot(EntityEquipment equipment, EquipmentSlot bukkitSlot)
- EquipmentSlot(HumanEntity holder, int index)
- EquipmentSlot(HumanEntity holder, EquipmentSlot bukkitSlot)

Methods:
- EquipmentSlot$EquipSlot getEquipSlot()
- EquipmentSlot getEquipmentSlot()
- int getIndex()
- ItemStack getItem()
- String toString(Event event, boolean debug)
- void setAmount(int amount)
- void setItem(ItemStack item)
- int getAmount()

### Class: ch.njol.skript.util.slot.EquipmentSlot$EquipSlot
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- TOOL
- OFF_HAND
- HELMET
- CHESTPLATE
- LEGGINGS
- BOOTS
- BODY

Methods:
- void set(EntityEquipment, ItemStack)
- **static** EquipmentSlot$EquipSlot valueOf(String name)
- ItemStack get(EntityEquipment)
- **static** EquipmentSlot$EquipSlot[] values()

### Class: ch.njol.skript.util.slot.InventorySlot
Type: Class
Extends: ch.njol.skript.util.slot.SlotWithIndex

Constructors:
- InventorySlot(Inventory inventory, int index, int rawIndex)
- InventorySlot(Inventory inventory, int rawIndex)

Methods:
- int getIndex()
- int getRawIndex()
- ItemStack getItem()
- String toString(Event event, boolean debug)
- Inventory getInventory()
- boolean isSameSlot(Slot slot)
- void setAmount(int amount)
- void setItem(ItemStack item)
- int getAmount()

### Class: ch.njol.skript.util.slot.ItemFrameSlot
Type: Class
Extends: ch.njol.skript.util.slot.Slot

Constructors:
- ItemFrameSlot(ItemFrame frame)

Methods:
- ItemFrame getItemFrame()
- ItemStack getItem()
- String toString(Event event, boolean debug)
- boolean isSameSlot(Slot slot)
- void setAmount(int amount)
- void setItem(ItemStack item)
- int getAmount()

### Class: ch.njol.skript.util.slot.Slot
Type: Abstract Class
Implements: ch.njol.skript.lang.Debuggable, ch.njol.skript.lang.util.common.AnyNamed, ch.njol.skript.lang.util.common.AnyAmount

Methods:
- void setName(String name)
- Number amount()
- boolean supportsAmountChange()
- boolean supportsNameChange()
- String name()
- ItemStack getItem()
- String toString()
- boolean isSameSlot(Slot)
- void setAmount(int)
- void setAmount(Number amount)
- void setItem(ItemStack)
- int getAmount()

### Class: ch.njol.skript.util.slot.SlotWithIndex
Type: Abstract Class
Extends: ch.njol.skript.util.slot.Slot

Methods:
- int getIndex()
- int getRawIndex()
- boolean isSameSlot(Slot slot)

### Class: ch.njol.skript.util.slot.ThrowableProjectileSlot
Type: Class
Extends: ch.njol.skript.util.slot.Slot

Constructors:
- ThrowableProjectileSlot(ThrowableProjectile projectile)

Methods:
- ItemStack getItem()
- String toString(Event event, boolean debug)
- ThrowableProjectile getProjectile()
- boolean isSameSlot(Slot slot)
- void setAmount(int amount)
- void setItem(ItemStack item)
- int getAmount()

## Package: ch.njol.skript.util.visual

### Class: ch.njol.skript.util.visual.ParticleOption
Type: Class

Constructors:
- ParticleOption(Color color, float size)

Methods:
- float getGreen()
- float getRed()
- String toString()
- float getBlue()
- Color getBukkitColor()

### Class: ch.njol.skript.util.visual.VisualEffect
Type: Class
Implements: ch.njol.skript.lang.SyntaxElement, ch.njol.yggdrasil.YggdrasilSerializable

Methods:
- void play(Player[] ps, Location l, Entity e, int count, int radius)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String getSyntaxTypeName()
- VisualEffectType getType()
- int hashCode()
- boolean equals(Object o)
- String toString()
- String toString(int flags)

### Class: ch.njol.skript.util.visual.VisualEffectType
Type: Class

Methods:
- void setColorable()
- Noun getName()
- boolean isParticle()
- EntityEffect getEntityEffect()
- boolean isEntityEffect()
- V withData(BiFunction<Object, Location, Object> dataSupplier)
- boolean isColorable()
- boolean isEffect()
- Particle getParticle()
- Effect getEffect()
- String getId()
- String getPattern()
- Object getData(Object raw, Location location)

### Class: ch.njol.skript.util.visual.VisualEffects
Type: Class

Methods:
- **static** VisualEffectType get(int i)
- **static** VisualEffect parse(String s)
- **static** String getAllNames()

## Package: ch.njol.skript.variables

### Class: ch.njol.skript.variables.FlatFileStorage
Type: Class
Extends: ch.njol.skript.variables.VariablesStorage

Methods:
- **static** void setRequiredChangesForResave(int value)
- void saveVariables(boolean finalSave)
- void close()

### Class: ch.njol.skript.variables.HintManager
Type: Class

Constructors:
- HintManager(boolean isActive)

Methods:
- V add(Variable<*> variable, Class<*> hints)
- V add(String variableName, Class<*> hints)
- HintManager$Backup backup()
- V set(Variable<*> variable, Class<*> hints)
- V set(String variableName, Class<*> hints)
- void restore(HintManager$Backup backup)
- void clearScope(int level, boolean sectionOnly)
- **static** Z canUseHints(Variable<*> variable)
- boolean isActive()
- V delete(Variable<*> variable)
- void delete(String variableName)
- V remove(Variable<*> variable, Class<*> hints)
- V remove(String variableName, Class<*> hints)
- void setActive(boolean active)
- Set<Class<*>> get(Variable<*> variable)
- Set<Class<*>> get(String variableName)
- void mergeScope(int from, int to, boolean sectionOnly)
- void exitScope()
- void enterScope(boolean isSection)

### Class: ch.njol.skript.variables.HintManager$Backup
Type: Class

No public methods found

### Class: ch.njol.skript.variables.MySQLStorage
Type: Class
Extends: ch.njol.skript.variables.SQLStorage

Methods:
- Database initialize(SectionNode config)

### Class: ch.njol.skript.variables.SQLStorage
Type: Abstract Class
Extends: ch.njol.skript.variables.VariablesStorage

Constructors:
- SQLStorage(String db, String createTableQuery)

Methods:
- void setTableName(String tableName)
- String getFormattedCreateQuery()
- String getTableName()
- Database initialize(SectionNode)
- void close()

### Class: ch.njol.skript.variables.SQLiteStorage
Type: Class
Extends: ch.njol.skript.variables.SQLStorage

Methods:
- Database initialize(SectionNode config)

### Class: ch.njol.skript.variables.SerializedVariable
Type: Class

Constructors:
- SerializedVariable(String name, SerializedVariable$Value value)

No public methods found

### Class: ch.njol.skript.variables.SerializedVariable$Value
Type: Class

Constructors:
- SerializedVariable$Value(String type, byte[] data)

No public methods found

### Class: ch.njol.skript.variables.TypeHints
Type: Class

Methods:
- **static** V add(String variable, Class<*> hint)
- **static** Class<*> get(String variable)
- **static** void clear()
- **static** void exitScope()
- **static** void enterScope()

### Class: ch.njol.skript.variables.Variables
Type: Class

Methods:
- **static** void deleteVariable(String name, Event event, boolean local)
- **static** void setLocalVariables(Event event, Object map)
- **static** List<VariablesStorage> getStores()
- **static** Z registerStorage(Class<TT> storage, String names)
- **static** Iterator<Pair<String, Object>> getVariableIterator(String name, boolean local, Event event)
- **static** void setVariable(String name, Object value, Event event, boolean local)
- **static** Object getVariable(String name, Event event, boolean local)
- **static** VariablesMap removeLocals(Event event)
- **static** void withLocalVariables(Event provider, Event user, Runnable action)
- **static** SerializedVariable serialize(String name, Object value)
- **static** SerializedVariable$Value serialize(Object value)
- **static** boolean load()
- **static** int numVariables()
- **static** String[] splitVariableName(String name)
- **static** Object copyLocalVariables(Event event)
- **static** void close()

### Class: ch.njol.skript.variables.VariablesStorage
Type: Abstract Class
Implements: ch.njol.util.Closeable

Methods:
- boolean load(SectionNode sectionNode)
- Pattern getNamePattern()
- void close()
- void startBackupTask(Timespan backupInterval, boolean removeBackups, int toKeep)

## Package: ch.njol.util

### Class: ch.njol.util.Callback
Type: Interface
Implements: java.util.function.Function

Methods:
- TR apply(T a)
- TR run(T)

### Class: ch.njol.util.Checker
Type: Interface
Implements: java.util.function.Predicate

Methods:
- Z test(T t)
- Z check(T)

### Class: ch.njol.util.Closeable
Type: Interface
Implements: java.lang.AutoCloseable

Methods:
- void close()

### Class: ch.njol.util.NullableChecker
Type: Interface
Implements: ch.njol.util.Checker, java.util.function.Predicate

Methods:
- Z test(T t)
- Z check(T)

### Class: ch.njol.util.OpenCloseable
Type: Interface
Implements: java.lang.AutoCloseable

Methods:
- void close()
- void open()
- **static** OpenCloseable combine(OpenCloseable[] openCloseableArray)

### Class: ch.njol.util.Predicate
Type: Interface
Implements: java.util.function.Predicate

Methods:
- Z test(T)

### Class: ch.njol.util.Setter
Type: Interface
Implements: java.util.function.Consumer

Methods:
- V set(T)
- V accept(T t)

### Class: ch.njol.util.CaseInsensitiveString
Type: Class
Implements: java.io.Serializable, java.lang.Comparable, java.lang.CharSequence

Constructors:
- CaseInsensitiveString(String s)
- CaseInsensitiveString(String s, Locale locale)

Methods:
- int hashCode()
- boolean equals(Object o)
- int length()
- String toString()
- int compareTo(CharSequence s)
- int compareTo(Object)
- CaseInsensitiveString subSequence(int start, int end)
- CharSequence subSequence(int, int)
- char charAt(int i)

### Class: ch.njol.util.EnumTypeAdapter
Type: Class
Extends: com.google.gson.TypeAdapter

Constructors:
- EnumTypeAdapter(Class<TT> classOfT)

Methods:
- TT read(JsonReader in) throws IOException
- Object read(JsonReader) throws IOException
- V write(JsonWriter out, T value) throws IOException
- void write(JsonWriter, Object) throws IOException

### Class: ch.njol.util.Kleenean
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FALSE
- UNKNOWN
- TRUE

Methods:
- boolean isTrue()
- Kleenean not()
- Kleenean or(Kleenean other)
- boolean isUnknown()
- Kleenean and(Kleenean other)
- **static** Kleenean valueOf(String name)
- **static** Kleenean get(boolean b)
- **static** Kleenean get(int i)
- **static** Kleenean get(double d)
- **static** Kleenean[] values()
- boolean isFalse()
- Kleenean is(Kleenean other)
- String toString()
- Kleenean implies(Kleenean other)

### Class: ch.njol.util.LoggerFilter
Type: Class
Implements: java.util.logging.Filter, ch.njol.util.Closeable

Constructors:
- LoggerFilter(Logger l)

Methods:
- boolean isLoggable(LogRecord record)
- boolean removeFilter(Filter f)
- void addFilter(Filter f)
- void close()

### Class: ch.njol.util.Math2
Type: Class

Methods:
- **static** int fit(int min, int value, int max)
- **static** long fit(long min, long, long value)
- **static** float fit(float min, float value, float max)
- **static** double fit(double min, double, double value)
- **static** long addClamped(long x, long)
- **static** int mod(int value, int mod)
- **static** long mod(long value, long)
- **static** float mod(float value, float mod)
- **static** double mod(double value, double)
- **static** int round(float value)
- **static** long round(double value)
- **static** long multiplyClamped(long x, long)
- **static** float safe(float value)
- **static** int ceil(float value)
- **static** long ceil(double value)
- **static** long floor(double value)

### Class: ch.njol.util.NonNullPair
Type: Class
Extends: ch.njol.util.Pair

Constructors:
- NonNullPair(T first, T second)
- NonNullPair(NonNullPair<TT1, TT2> other)

Methods:
- TT2 getValue()
- TT1 getKey()
- V setSecond(T second)
- V setFirst(T first)
- TT1 getFirst()
- TT2 setValue(T value)
- NonNullPair<TT1, TT2> clone()
- Pair clone()
- Object clone() throws CloneNotSupportedException
- TT2 getSecond()

### Class: ch.njol.util.NotifyingReference
Type: Class

Constructors:
- NotifyingReference(T value, void notifyAll)
- NotifyingReference(T value)

Methods:
- V set(T newValue)
- TV get()

### Class: ch.njol.util.Pair
Type: Class
Implements: java.util.Map$Entry, java.lang.Cloneable, java.io.Serializable

Constructors:
- Pair(T first, T second)
- Pair(Map$Entry<TT1, TT2> first)

Methods:
- TT2 getValue()
- TT1 getKey()
- V setSecond(T second)
- V setFirst(T first)
- int hashCode()
- TT1 getFirst()
- TT2 setValue(T value)
- boolean equals(Object obj)
- Pair<TT1, TT2> clone()
- Object clone() throws CloneNotSupportedException
- TT2 getSecond()
- String toString()

### Class: ch.njol.util.StringUtils
Type: Abstract Class

Methods:
- **static** String fancyOrderNumber(int i)
- **static** boolean endsWithIgnoreCase(String string, String end)
- **static** String fixCapitalization(String string)
- **static** double numberBefore(CharSequence s, int index)
- **static** void checkIndices(String s, int start, int end)
- **static** String replace(String haystack, String needle, String replacement, boolean caseSensitive)
- **static** boolean containsAny(String s, String chars)
- **static** int count(String s, char c)
- **static** int count(String s, char c, int start)
- **static** int count(String s, char c, int start, int end)
- **static** byte[] hexStringToByteArray(String s)
- **static** int findLastDigit(String s, int start)
- **static** String replaceFirst(String haystack, String needle, String replacement, boolean caseSensitive)
- **static** String replaceAll(CharSequence string, String regex, Function<Matcher, String> callback)
- **static** String replaceAll(CharSequence string, Pattern regex, Function<Matcher, String> callback)
- **static** String substring(String s, int start, int end)
- **static** String firstToUpper(String s)
- **static** int lastIndexOf(String haystack, String needle, boolean caseSensitive)
- **static** boolean contains(String s, char c, int start, int end)
- **static** boolean contains(String haystack, String needle, boolean caseSensitive)
- **static** double numberAt(CharSequence s, int index, boolean forward)
- **static** int indexOfOutsideGroup(String string, char find, char groupOpen, char groupClose, int i)
- **static** boolean equals(String s1, String s2, boolean caseSensitive)
- **static** String toString(double d, int)
- **static** String join(Object[] strings)
- **static** String join(Object[] strings, String delimiter)
- **static** String join(Object[] strings, String delimiter, int start, int end)
- **static** String join(Iterable<*> strings)
- **static** String join(Iterable<*> strings, String delimiter)
- **static** String join(Iterator<*> strings, String delimiter)
- **static** String join(Iterator<*> strings, String delimiter, String lastDelimiter)
- **static** String join(Iterable<*> strings, String delimiter, String lastDelimiter)
- **static** String multiply(String s, int amount)
- **static** String multiply(char c, int amount)
- **static** int indexOf(String haystack, String needle, boolean caseSensitive)
- **static** int indexOf(String haystack, String needle, int fromIndex, boolean caseSensitive)
- **static** boolean startsWithIgnoreCase(String string, String start)
- **static** boolean startsWithIgnoreCase(String string, String start, int offset)
- **static** double numberAfter(CharSequence s, int index)

### Class: ch.njol.util.SynchronizedReference
Type: Class

Constructors:
- SynchronizedReference(T value)

Methods:
- V set(T newValue)
- TV get()

### Class: ch.njol.util.Validate
Type: Class

Methods:
- **static** void isTrue(boolean value, String error)
- **static** void notNull(Object[] objects)
- **static** void notNull(Object object, String name)
- **static** void isFalse(boolean value, String error)
- **static** void notEmpty(String value, String name)
- **static** void notEmpty(Object[] array, String name)
- **static** void notEmpty(int[] array, String name)
- **static** void notNullOrEmpty(String value, String name)
- **static** void notNullOrEmpty(Object[] array, String name)
- **static** V notNullOrEmpty(Collection<*> collection, String name)

### Class: ch.njol.util.VectorMath
Type: Class

Methods:
- **static** Vector fromSphericalCoordinates(double radius, double, double theta)
- **static** float skriptPitch(float pitch)
- **static** Vector fromYawAndPitch(float yaw, float pitch)
- **static** float wrapAngleDeg(float angle)
- **static** float getYaw(Vector vector)
- **static** float fromSkriptYaw(float yaw)
- **static** float skriptYaw(float yaw)
- **static** float getPitch(Vector vector)
- **static** Vector rotX(Vector vector, double angle)
- **static** float fromSkriptPitch(float pitch)
- **static** Vector rot(Vector vector, Vector axis, double angle)
- **static** Vector rotZ(Vector vector, double angle)
- **static** Vector rotY(Vector vector, double angle)
- **static** Vector fromCylindricalCoordinates(double radius, double, double phi)
- **static** boolean isZero(Vector vector)
- **static** void copyVector(Vector vector1, Vector vector2)

## Package: ch.njol.util.coll

### Class: ch.njol.util.coll.BidiMap
Type: Interface
Implements: java.util.Map

Methods:
- TT2 getValue(T)
- TT1 getKey(T)
- Set<TT2> valueSet()
- BidiMap<TT2, TT1> getReverseView()

### Class: ch.njol.util.coll.BidiHashMap
Type: Class
Extends: java.util.HashMap
Implements: ch.njol.util.coll.BidiMap

Constructors:
- BidiHashMap(Map<+TT1, +TT2> values)

Methods:
- TT1 getKey(T value)
- Set<TT2> valueSet()
- Set<Map$Entry<TT1, TT2>> entrySet()
- Set<TT2> values()
- Collection values()
- void clear()
- boolean containsValue(Object value)
- TT2 remove(Object key)
- TT2 put(T key, T value)
- TT2 getValue(T key)
- BidiHashMap<TT2, TT1> getReverseView()
- BidiMap getReverseView()
- V putAll(Map<+TT1, +TT2> m)
- BidiHashMap<TT1, TT2> clone()
- Object clone()
- Set<TT1> keySet()

### Class: ch.njol.util.coll.CollectionUtils
Type: Abstract Class

Methods:
- **static** Class<[TT> arrayType(Class<TT> c)
- **static** boolean isSubset(Object[] set, Object[] sub)
- **static** Z isAnyInstanceOf(Object object, Class<*> classes)
- **static** Map$Entry<TT, TU> containsKey(Map<TT, TU> map, T key)
- **static** float[] toFloats(double[] doubles)
- **static** Z containsAnySuperclass(Class<*> classes, Class<*> cs)
- **static** Z containsAll([T array, T os)
- **static** Z containsAny([T array, T os)
- **static** Set<TE> union(Set<TE> sets)
- **static** boolean containsIgnoreCase(String[] array, String s)
- **static** Z check([T array, T predicate, ; and)
- **static** I lastIndexOf([T array, T t)
- **static** Z contains([T array, T o)
- **static** boolean contains(int[] array, int num)
- **static** TT getRandom([T os)
- **static** TT getRandom([T os, T start)
- **static** TT getRandom(List<TT> os)
- **static** [TT array([T array)
- **static** Set<TE> intersection(Set<TE> sets)
- **static** Map$Entry<String, TU> containsKeyIgnoreCase(Map<String, TU> map, String key)
- **static** [I toArray(Collection<Integer> ints)
- **static** int indexOfIgnoreCase(String[] array, String s)
- **static** I indexOfIgnoreCase(Iterable<String> iter, String s)
- **static** Double[] wrap(double[] primitive)
- **static** Z containsSuperclass(Class<*> classes, Class<*> c)
- **static** I indexOf([T array, T t)
- **static** I indexOf([T array, T t, ; start, T end)
- **static** int indexOf(int[] array, int num)
- **static** int indexOf(int[] array, int num, int start)
- **static** int indexOf(int[] array, int num, int start, int end)
- **static** I indexOf(Iterable<TT> iter, T o)
- **static** [TT subarray([T array, T startIndex, ; endIndex)
- **static** int[] permutation(int start, int end)
- **static** byte[] permutation(byte start, byte end)
- **static** int[] permutation(int length)

### Class: ch.njol.util.coll.CyclicList
Type: Class
Extends: java.util.AbstractList

Constructors:
- CyclicList(int items)
- CyclicList([T items)
- CyclicList(Collection<TE> items)

Methods:
- Z add(T e)
- V add(int index, T e)
- TE set(int index, T e)
- boolean isEmpty()
- void clear()
- boolean remove(Object o)
- TE remove(int index)
- int lastIndexOf(Object o)
- V addLast(T e)
- Z removeAll(Collection<*> c)
- int size()
- Z addAll(Collection<+TE> c)
- Z addAll(int index, Collection<+TE> c)
- TE get(int index)
- Object[] toArray()
- [TT toArray([T array)
- int indexOf(Object o)
- V addFirst(T e)
- Z retainAll(Collection<*> c)

### Class: ch.njol.util.coll.ReversedListView
Type: Class
Implements: java.util.List

Constructors:
- ReversedListView(List<TT> list)

Methods:
- Z add(T e)
- V add(int index, T element)
- ReversedListView<TT> subList(int fromIndex, int toIndex)
- List subList(int, int)
- TT set(int index, T element)
- Z containsAll(Collection<*> c)
- void clear()
- boolean isEmpty()
- boolean remove(Object o)
- TT remove(int index)
- int lastIndexOf(Object o)
- Z removeAll(Collection<*> c)
- Iterator<TT> iterator()
- boolean contains(Object o)
- int size()
- Z addAll(Collection<+TT> c)
- Z addAll(int index, Collection<+TT> c)
- int hashCode()
- boolean equals(Object obj)
- TT get(int index)
- Object[] toArray()
- [TR toArray([T a)
- ListIterator<TT> listIterator()
- ListIterator<TT> listIterator(int index)
- int indexOf(Object o)
- Z retainAll(Collection<*> c)

## Package: ch.njol.util.coll.iterator

### Class: ch.njol.util.coll.iterator.ArrayIterator
Type: Class
Implements: com.google.common.collect.PeekingIterator

Constructors:
- ArrayIterator([T array)
- ArrayIterator([T array, T index)

Methods:
- TT next()
- boolean hasNext()
- void remove()
- TT peek()

### Class: ch.njol.util.coll.iterator.CheckedIterator
Type: Class
Implements: java.util.Iterator

Constructors:
- CheckedIterator(Iterator<TT> iter, NullableChecker<TT> checker)

Methods:
- TT next()
- boolean hasNext()
- void remove()

### Class: ch.njol.util.coll.iterator.CombinedIterator
Type: Class
Implements: java.util.Iterator

Constructors:
- CombinedIterator(Iterator<Iterable<TT>> iterators)
- CombinedIterator(Iterator<Iterable<TT>> iterators, boolean removable)

Methods:
- TT next()
- boolean hasNext()
- void remove()

### Class: ch.njol.util.coll.iterator.ConsumingIterator
Type: Class
Implements: java.util.Iterator

Constructors:
- ConsumingIterator(Iterator<TE> iterator, Consumer<TE> consumer)

Methods:
- TE next()
- boolean hasNext()
- void remove()

### Class: ch.njol.util.coll.iterator.EmptyIterable
Type: Class
Implements: java.lang.Iterable

Methods:
- Iterator<TT> iterator()
- int hashCode()
- boolean equals(Object obj)
- **static** EmptyIterable<TT> get()

### Class: ch.njol.util.coll.iterator.EmptyIterator
Type: Class
Implements: java.util.Iterator

Methods:
- TT next()
- int hashCode()
- boolean equals(Object obj)
- **static** EmptyIterator<TT> get()
- boolean hasNext()
- void remove()

### Class: ch.njol.util.coll.iterator.EnumerationIterable
Type: Class
Implements: java.lang.Iterable

Constructors:
- EnumerationIterable(Enumeration<+TT> e)

Methods:
- Iterator<TT> iterator()

### Class: ch.njol.util.coll.iterator.ImprovedIterator
Type: Class
Implements: java.util.Iterator

Constructors:
- ImprovedIterator(Iterator<TT> iter)

Methods:
- TT next()
- TT current()
- boolean hasNext()
- void remove()

### Class: ch.njol.util.coll.iterator.IteratorIterable
Type: Class
Implements: java.lang.Iterable

Constructors:
- IteratorIterable(Iterator<TT> iter)

Methods:
- Iterator<TT> iterator()

### Class: ch.njol.util.coll.iterator.ListRangeIterator
Type: Class
Implements: java.util.Iterator

Constructors:
- ListRangeIterator(List<TT> iter, int start, int end)

Methods:
- TT next()
- boolean hasNext()
- void remove()

### Class: ch.njol.util.coll.iterator.NonNullIterator
Type: Abstract Class
Implements: java.util.Iterator

Methods:
- TT next()
- boolean hasNext()
- void remove()

### Class: ch.njol.util.coll.iterator.ReversedListIterator
Type: Class
Implements: java.util.ListIterator

Constructors:
- ReversedListIterator(List<TT> iter)
- ReversedListIterator(List<TT> iter, int index)
- ReversedListIterator(ListIterator<TT> iter)

Methods:
- V add(T e)
- TT next()
- V set(T e)
- TT previous()
- boolean hasPrevious()
- boolean hasNext()
- int nextIndex()
- void remove()
- int previousIndex()

### Class: ch.njol.util.coll.iterator.SingleItemIterable
Type: Class
Implements: java.lang.Iterable

Constructors:
- SingleItemIterable(T item)

Methods:
- Iterator<TT> iterator()

### Class: ch.njol.util.coll.iterator.SingleItemIterator
Type: Class
Implements: java.util.Iterator

Constructors:
- SingleItemIterator(T item)

Methods:
- TT next()
- boolean hasNext()
- void remove()

### Class: ch.njol.util.coll.iterator.StoppableIterator
Type: Class
Implements: java.util.Iterator

Constructors:
- StoppableIterator(Iterator<TT> iter, NullableChecker<TT> stopper, boolean returnLast)

Methods:
- TT next()
- void stop()
- boolean hasNext()
- void remove()

## Package: ch.njol.yggdrasil

### Class: ch.njol.yggdrasil.ClassResolver
Type: Interface

Methods:
- Class<*> getClass(String)
- String getID(Class<*>)

### Class: ch.njol.yggdrasil.FieldHandler
Type: Interface

Methods:
- boolean missingField(Object, Field) throws StreamCorruptedException
- boolean excessiveField(Object, Fields$FieldContext) throws StreamCorruptedException
- boolean incompatibleField(Object, Field, Fields$FieldContext) throws StreamCorruptedException

### Class: ch.njol.yggdrasil.YggdrasilID
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- String value()

### Class: ch.njol.yggdrasil.YggdrasilSerializable
Type: Interface

No public methods found

### Class: ch.njol.yggdrasil.YggdrasilSerializable$YggdrasilExtendedSerializable
Type: Interface
Implements: ch.njol.yggdrasil.YggdrasilSerializable

Methods:
- Fields serialize() throws NotSerializableException
- void deserialize(Fields) throws StreamCorruptedException, NotSerializableException

### Class: ch.njol.yggdrasil.YggdrasilSerializable$YggdrasilRobustEnum
Type: Interface

Methods:
- Enum<*> excessiveConstant(String)

### Class: ch.njol.yggdrasil.YggdrasilSerializable$YggdrasilRobustSerializable
Type: Interface
Implements: ch.njol.yggdrasil.YggdrasilSerializable

Methods:
- boolean missingField(Field) throws StreamCorruptedException
- boolean excessiveField(Fields$FieldContext) throws StreamCorruptedException
- boolean incompatibleField(Field, Fields$FieldContext) throws StreamCorruptedException

### Class: ch.njol.yggdrasil.DefaultYggdrasilInputStream
Type: Class
Extends: ch.njol.yggdrasil.YggdrasilInputStream

Constructors:
- DefaultYggdrasilInputStream(Yggdrasil readShortStrings, InputStream in) throws IOException

Methods:
- void close() throws IOException

### Class: ch.njol.yggdrasil.DefaultYggdrasilOutputStream
Type: Class
Extends: ch.njol.yggdrasil.YggdrasilOutputStream

Constructors:
- DefaultYggdrasilOutputStream(Yggdrasil writtenShortStrings, OutputStream out) throws IOException

Methods:
- void flush() throws IOException
- void close() throws IOException

### Class: ch.njol.yggdrasil.Fields
Type: Class
Implements: java.lang.Iterable

Constructors:
- Fields(Yggdrasil yggdrasil)
- Fields(Class<*> type, Yggdrasil yggdrasil) throws NotSerializableException
- Fields(Object object) throws NotSerializableException
- Fields(Object object, Yggdrasil yggdrasil) throws NotSerializableException

Methods:
- Object getPrimitive(String fieldID) throws StreamCorruptedException
- TT getPrimitive(String fieldID, Class<TT> expectedType) throws StreamCorruptedException
- Iterator<Fields$FieldContext> iterator()
- Object getObject(String field) throws StreamCorruptedException
- TT getObject(String fieldID, Class<TT> expectedType) throws StreamCorruptedException
- boolean contains(String fieldID)
- void putPrimitive(String fieldID, Object value)
- **static** Collection<Field> getFields(Class<*> type) throws NotSerializableException
- int size()
- void setFields(Object object) throws StreamCorruptedException, NotSerializableException
- void setFields(Object object, Yggdrasil yggdrasil) throws StreamCorruptedException, NotSerializableException
- TT getAndRemoveObject(String field, Class<TT> expectedType) throws StreamCorruptedException
- void putObject(String fieldID, Object value)
- boolean removeField(String fieldID)
- TT getAndRemovePrimitive(String field, Class<TT> expectedType) throws StreamCorruptedException
- boolean hasField(String fieldID)

### Class: ch.njol.yggdrasil.Fields$FieldContext
Type: Class

Methods:
- void setPrimitive(Object value)
- Object getPrimitive() throws StreamCorruptedException
- TT getPrimitive(Class<TT> expectedType) throws StreamCorruptedException
- void setField(Object object, Field field, Yggdrasil yggdrasil) throws StreamCorruptedException
- Object getObject() throws StreamCorruptedException
- TT getObject(Class<TT> expectedType) throws StreamCorruptedException
- Class<*> getType()
- int hashCode()
- boolean equals(Object object)
- String getID()
- void setObject(Object value)
- boolean isPrimitive()

### Class: ch.njol.yggdrasil.JRESerializer
Type: Class
Extends: ch.njol.yggdrasil.YggdrasilSerializer

Methods:
- Fields serialize(Object object)
- Class<*> getClass(String id)
- TT newInstance(Class<TT> type)
- String getID(Class<*> type)
- Z canBeInstantiated(Class<*> type)
- void deserialize(Object object, Fields fields) throws StreamCorruptedException
- TE deserialize(Class<TE> type, Fields fields) throws StreamCorruptedException, NotSerializableException

### Class: ch.njol.yggdrasil.PseudoEnum
Type: Abstract Class

Methods:
- Class<TT> getDeclaringClass()
- **static** Class<-TT> getDeclaringClass(Class<TT> type)
- TT valueOf(String name)
- **static** TT valueOf(Class<TT> type, String name)
- int hashCode()
- List<TT> values()
- **static** List<TT> values(Class<TT> type) throws IllegalArgumentException
- boolean equals(Object object)
- TT getConstant(int id) throws IndexOutOfBoundsException
- String name()
- String toString()
- int numConstants()
- int ordinal()

### Class: ch.njol.yggdrasil.SimpleClassResolver
Type: Class
Implements: ch.njol.yggdrasil.ClassResolver

Methods:
- Class<*> getClass(String id)
- String getID(Class<*> type)
- V registerClass(Class<*> type, String id)

### Class: ch.njol.yggdrasil.Tag
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- T_NULL
- T_BYTE
- T_SHORT
- T_INT
- T_LONG
- T_FLOAT
- T_DOUBLE
- T_CHAR
- T_BOOLEAN
- T_BYTE_OBJ
- T_SHORT_OBJ
- T_INT_OBJ
- T_LONG_OBJ
- T_FLOAT_OBJ
- T_DOUBLE_OBJ
- T_CHAR_OBJ
- T_BOOLEAN_OBJ
- T_STRING
- T_ARRAY
- T_ENUM
- T_CLASS
- T_OBJECT
- T_REFERENCE

Methods:
- Tag getPrimitive()
- boolean isWrapper()
- **static** Z isWrapper(Class<*> type)
- **static** Tag getType(Class<*> type)
- **static** Tag valueOf(String name)
- **static** Tag[] values()
- **static** Tag getPrimitiveFromWrapper(Class<*> wrapper)
- **static** Tag byName(String name)
- String toString()
- Tag getWrapper()
- **static** Tag byID(byte tag)
- **static** Tag byID(int tag)
- **static** Class<*> getWrapperClass(Class<*> primitive)
- boolean isPrimitive()

### Class: ch.njol.yggdrasil.Yggdrasil
Type: Class

Constructors:
- Yggdrasil(short version)

Methods:
- Class<*> getClass(String id) throws StreamCorruptedException
- TT loadFromFile(File file, Class<TT> expectedType) throws IOException
- void excessiveField(Object object, Fields$FieldContext field) throws StreamCorruptedException
- String getID(Class<*> type) throws NotSerializableException
- **static** String getID(Field field)
- **static** String getID(Enum<*> e)
- void registerClassResolver(ClassResolver resolver)
- void missingField(Object object, Field field) throws StreamCorruptedException
- void saveToFile(Object object, File file) throws IOException
- YggdrasilInputStream newInputStream(InputStream in) throws IOException
- void registerFieldHandler(FieldHandler handler)
- V registerSingleClass(Class<*> type, String id)
- V registerSingleClass(Class<*> type)
- YggdrasilOutputStream newOutputStream(OutputStream out) throws IOException
- void incompatibleField(Object object, Field field, Fields$FieldContext context) throws StreamCorruptedException
- **static** Enum<TT> getEnumConstant(Class<TT> type, String id) throws StreamCorruptedException
- Z isSerializable(Class<*> type)

### Class: ch.njol.yggdrasil.YggdrasilException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- YggdrasilException(String message)
- YggdrasilException(String message, Throwable cause)
- YggdrasilException(Throwable cause)

No public methods found

### Class: ch.njol.yggdrasil.YggdrasilInputStream
Type: Abstract Class
Implements: java.io.Closeable

Methods:
- Object readObject() throws IOException
- TT readObject(Class<TT> expectedType) throws IOException

### Class: ch.njol.yggdrasil.YggdrasilOutputStream
Type: Abstract Class
Implements: java.io.Flushable, java.io.Closeable

Methods:
- void writeObject(Object object) throws IOException

### Class: ch.njol.yggdrasil.YggdrasilSerializer
Type: Abstract Class
Implements: ch.njol.yggdrasil.ClassResolver

Methods:
- Fields serialize(T) throws NotSerializableException
- Class<+TT> getClass(String)
- TE newInstance(Class<TE>)
- Z canBeInstantiated(Class<+TT> type)
- V deserialize(T, T) throws StreamCorruptedException, NotSerializableException
- TE deserialize(Class<TE> type, Fields fields) throws StreamCorruptedException, NotSerializableException

## Package: net.kyori.adventure.text.serializer.bungeecord

### Class: net.kyori.adventure.text.serializer.bungeecord.BungeeComponentSerializer
Type: Class
Implements: net.kyori.adventure.text.serializer.ComponentSerializer

Methods:
- BaseComponent[] serialize(Component component)
- Object serialize(Component component)
- **static** BungeeComponentSerializer legacy()
- **static** BungeeComponentSerializer of(GsonComponentSerializer serializer, LegacyComponentSerializer legacySerializer)
- **static** BungeeComponentSerializer get()
- **static** boolean inject(Gson existing)
- **static** boolean isNative()
- Component deserialize(BaseComponent[] input)
- Component deserialize(Object input)

### Class: net.kyori.adventure.text.serializer.bungeecord.SelfSerializable$AdapterFactory
Type: Class
Implements: com.google.gson.TypeAdapterFactory

Methods:
- TypeAdapter<TT> create(Gson gson, TypeToken<TT> type)

## Package: org.skriptlang.skript

### Class: org.skriptlang.skript.Skript
Type: Interface
Implements: org.skriptlang.skript.addon.SkriptAddon

Methods:
- SkriptAddon registerAddon(Class<*>, String)
- Collection<SkriptAddon> addons()
- **static** Skript of(Class<*> source, String name)
- Skript unmodifiableView()
- SkriptAddon unmodifiableView()
- Object unmodifiableView()

## Package: org.skriptlang.skript.addon

### Class: org.skriptlang.skript.addon.AddonModule
Type: Interface

Methods:
- void init(SkriptAddon addon)
- void load(SkriptAddon)
- boolean canLoad(SkriptAddon addon)

### Class: org.skriptlang.skript.addon.SkriptAddon
Type: Interface
Implements: org.skriptlang.skript.util.ViewProvider

Methods:
- TR registry(Class<TR>)
- TR registry(Class<TR>, Supplier<TR>)
- V storeRegistry(Class<TR>, T)
- V removeRegistry(Class<Registry<*>>)
- SyntaxRegistry syntaxRegistry()
- Z hasRegistry(Class<Registry<*>>)
- String name()
- void loadModules(AddonModule[] modules)
- Localizer localizer()
- Class<*> source()
- SkriptAddon unmodifiableView()
- Object unmodifiableView()

## Package: org.skriptlang.skript.bukkit

### Class: org.skriptlang.skript.bukkit.SkriptMetrics
Type: Class

Methods:
- **static** void setupMetrics(Metrics metrics)

## Package: org.skriptlang.skript.bukkit.base.types

### Class: org.skriptlang.skript.bukkit.base.types.BlockClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

No public methods found

### Class: org.skriptlang.skript.bukkit.base.types.BlockClassInfo$BlockChanger
Type: Class
Implements: ch.njol.skript.classes.Changer

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- void change(Block[] blocks, Object[] delta, Changer$ChangeMode mode)
- void change(Object[], Object[], Changer$ChangeMode)

### Class: org.skriptlang.skript.bukkit.base.types.EntityClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

No public methods found

### Class: org.skriptlang.skript.bukkit.base.types.EntityClassInfo$EntityChanger
Type: Class
Implements: ch.njol.skript.classes.Changer

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- void change(Entity[] entities, Object[] delta, Changer$ChangeMode mode)
- void change(Object[], Object[], Changer$ChangeMode)

### Class: org.skriptlang.skript.bukkit.base.types.InventoryClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

No public methods found

### Class: org.skriptlang.skript.bukkit.base.types.InventoryClassInfo$InventoryChanger
Type: Class
Implements: ch.njol.skript.classes.Changer

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- void change(Inventory[] inventories, Object[] delta, Changer$ChangeMode mode)
- void change(Object[], Object[], Changer$ChangeMode)

### Class: org.skriptlang.skript.bukkit.base.types.ItemStackClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

No public methods found

### Class: org.skriptlang.skript.bukkit.base.types.ItemTypeClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

No public methods found

### Class: org.skriptlang.skript.bukkit.base.types.NameableClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

No public methods found

### Class: org.skriptlang.skript.bukkit.base.types.OfflinePlayerClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

No public methods found

### Class: org.skriptlang.skript.bukkit.base.types.PlayerClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

No public methods found

### Class: org.skriptlang.skript.bukkit.base.types.PlayerClassInfo$PlayerChanger
Type: Class
Implements: ch.njol.skript.classes.Changer

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- void change(Player[] players, Object[] delta, Changer$ChangeMode mode)
- void change(Object[], Object[], Changer$ChangeMode)

### Class: org.skriptlang.skript.bukkit.base.types.PlayerClassInfo$PlayerDisplayNameHandler
Type: Class
Implements: org.skriptlang.skript.lang.properties.PropertyHandler$ExpressionPropertyHandler

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- void change(Player player, Object[] delta, Changer$ChangeMode mode)
- void change(Object, Object[], Changer$ChangeMode)
- String convert(Player named)
- Object convert(Object)
- Class<String> returnType()

### Class: org.skriptlang.skript.bukkit.base.types.PlayerClassInfo$PlayerParser
Type: Class
Extends: ch.njol.skript.classes.Parser

Methods:
- String toVariableNameString(Player player)
- String toVariableNameString(Object)
- String getDebugMessage(Player player)
- String getDebugMessage(Object)
- boolean canParse(ParseContext context)
- String toString(Player player, int flags)
- String toString(Object, int)
- Player parse(String string, ParseContext context)
- Object parse(String, ParseContext)

### Class: org.skriptlang.skript.bukkit.base.types.SlotClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

No public methods found

### Class: org.skriptlang.skript.bukkit.base.types.SlotClassInfo$SlotChanger
Type: Class
Implements: ch.njol.skript.classes.Changer

Methods:
- Class<Object> acceptChange(Changer$ChangeMode mode)
- void change(Slot[] slots, Object[] deltas, Changer$ChangeMode mode)
- void change(Object[], Object[], Changer$ChangeMode)

## Package: org.skriptlang.skript.bukkit.breeding

### Class: org.skriptlang.skript.bukkit.breeding.BreedingModule
Type: Class

Methods:
- **static** void load() throws IOException

## Package: org.skriptlang.skript.bukkit.breeding.elements

### Class: org.skriptlang.skript.bukkit.breeding.elements.CondCanAge
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: org.skriptlang.skript.bukkit.breeding.elements.CondCanBreed
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: org.skriptlang.skript.bukkit.breeding.elements.CondIsAdult
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: org.skriptlang.skript.bukkit.breeding.elements.CondIsBaby
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: org.skriptlang.skript.bukkit.breeding.elements.CondIsInLove
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(LivingEntity entity)
- boolean check(Object)

### Class: org.skriptlang.skript.bukkit.breeding.elements.EffAllowAging
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.breeding.elements.EffBreedable
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.breeding.elements.EffMakeAdultOrBaby
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.breeding.elements.EvtBreed
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: org.skriptlang.skript.bukkit.breeding.elements.ExprBreedingFamily
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<LivingEntity> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.breeding.elements.ExprLoveTime
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(LivingEntity entity)
- Object convert(Object)

## Package: org.skriptlang.skript.bukkit.brewing

### Class: org.skriptlang.skript.bukkit.brewing.BrewingModule
Type: Class
Implements: org.skriptlang.skript.addon.AddonModule

Methods:
- void load(SkriptAddon addon)

## Package: org.skriptlang.skript.bukkit.brewing.elements

### Class: org.skriptlang.skript.bukkit.brewing.elements.CondBrewingConsume
Type: Class
Extends: ch.njol.skript.lang.Condition
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)
- Class<Event> supportedEvents()
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.brewing.elements.EffBrewingConsume
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- Class<Event> supportedEvents()
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.brewing.elements.EvtBrewingComplete
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.brewing.elements.EvtBrewingFuel
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.brewing.elements.EvtBrewingStart
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.brewing.elements.ExprBrewingFuelLevel
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Block block)
- Object convert(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.brewing.elements.ExprBrewingResults
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemStack> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- Class<Event> supportedEvents()
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.brewing.elements.ExprBrewingSlot
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Slot> getReturnType()
- String toString(Event event, boolean debug)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.brewing.elements.ExprBrewingTime
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- **static** void register(SyntaxRegistry registry)

## Package: org.skriptlang.skript.bukkit.damagesource

### Class: org.skriptlang.skript.bukkit.damagesource.DamageSourceExperimentSyntax
Type: Interface
Implements: org.skriptlang.skript.lang.experiment.SimpleExperimentalSyntax

Methods:
- ExperimentData getExperimentData()

### Class: org.skriptlang.skript.bukkit.damagesource.DamageSourceModule
Type: Class
Implements: org.skriptlang.skript.addon.AddonModule

Methods:
- void init(SkriptAddon addon)
- void load(SkriptAddon addon)
- boolean canLoad(SkriptAddon addon)

## Package: org.skriptlang.skript.bukkit.damagesource.elements

### Class: org.skriptlang.skript.bukkit.damagesource.elements.CondScalesWithDifficulty
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition
Implements: org.skriptlang.skript.bukkit.damagesource.DamageSourceExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(DamageSource damageSource)
- boolean check(Object)

### Class: org.skriptlang.skript.bukkit.damagesource.elements.CondWasIndirect
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition
Implements: org.skriptlang.skript.bukkit.damagesource.DamageSourceExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(DamageSource damageSource)
- boolean check(Object)

### Class: org.skriptlang.skript.bukkit.damagesource.elements.ExprCausingEntity
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.damagesource.DamageSourceExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Entity> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Entity convert(DamageSource damageSource)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.damagesource.elements.ExprCreatedDamageSource
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression
Implements: ch.njol.skript.lang.EventRestrictedSyntax

Methods:
- Class<Event> supportedEvents()

### Class: org.skriptlang.skript.bukkit.damagesource.elements.ExprDamageLocation
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.damagesource.DamageSourceExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Location> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Location convert(DamageSource damageSource)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.damagesource.elements.ExprDamageType
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.damagesource.DamageSourceExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<DamageType> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- DamageType convert(DamageSource damageSource)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.damagesource.elements.ExprDirectEntity
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.damagesource.DamageSourceExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Entity> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Entity convert(DamageSource damageSource)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.damagesource.elements.ExprFoodExhaustion
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.damagesource.DamageSourceExperimentSyntax

Methods:
- Class<Float> getReturnType()
- Float convert(DamageSource damageSource)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.damagesource.elements.ExprSecDamageSource
Type: Class
Extends: ch.njol.skript.expressions.base.SectionExpression
Implements: org.skriptlang.skript.bukkit.damagesource.DamageSourceExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int pattern, Kleenean delayed, SkriptParser$ParseResult result, SectionNode node, List<TriggerItem> triggerItems)
- Class<DamageSource> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.damagesource.elements.ExprSourceLocation
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.damagesource.DamageSourceExperimentSyntax

Methods:
- Class<Location> getReturnType()
- Location convert(DamageSource damageSource)
- Object convert(Object)

## Package: org.skriptlang.skript.bukkit.displays

### Class: org.skriptlang.skript.bukkit.displays.DisplayData
Type: Class
Extends: ch.njol.skript.entity.EntityData

Constructors:
- DisplayData(DisplayData$DisplayType type)

Methods:
- boolean canSpawn(World world)
- void set(Display entity)
- void set(Entity)
- Class<Display> getType()
- boolean match(Display entity)
- boolean match(Entity)
- EntityData<*> getSuperType()
- Z isSupertypeOf(EntityData<*> entityData)

### Class: org.skriptlang.skript.bukkit.displays.DisplayModule
Type: Class

Methods:
- **static** void load() throws IOException

## Package: org.skriptlang.skript.bukkit.displays.generic

### Class: org.skriptlang.skript.bukkit.displays.generic.ExprDisplayBillboard
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Display$Billboard> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Display$Billboard convert(Display display)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.displays.generic.ExprDisplayBrightness
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Integer> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.displays.generic.ExprDisplayGlowOverride
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Color> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Color convert(Display display)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.displays.generic.ExprDisplayHeightWidth
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Float> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Float convert(Display display)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.displays.generic.ExprDisplayInterpolation
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(Display display)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.displays.generic.ExprDisplayShadow
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Float> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Float convert(Display display)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.displays.generic.ExprDisplayTeleportDuration
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Timespan> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Timespan convert(Display display)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.displays.generic.ExprDisplayTransformationRotation
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Quaternionf> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Quaternionf convert(Display display)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.displays.generic.ExprDisplayTransformationScaleTranslation
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Vector> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Vector convert(Display display)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.displays.generic.ExprDisplayViewRange
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Float> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Float convert(Display display)
- Object convert(Object)

## Package: org.skriptlang.skript.bukkit.displays.item

### Class: org.skriptlang.skript.bukkit.displays.item.ExprItemDisplayTransform
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<ItemDisplay$ItemDisplayTransform> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- ItemDisplay$ItemDisplayTransform convert(Display display)
- Object convert(Object)

## Package: org.skriptlang.skript.bukkit.displays.text

### Class: org.skriptlang.skript.bukkit.displays.text.CondTextDisplayHasDropShadow
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- boolean check(Display value)
- boolean check(Object)

### Class: org.skriptlang.skript.bukkit.displays.text.CondTextDisplaySeeThroughBlocks
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Display value)
- boolean check(Object)

### Class: org.skriptlang.skript.bukkit.displays.text.EffTextDisplayDropShadow
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.displays.text.EffTextDisplaySeeThroughBlocks
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.displays.text.ExprTextDisplayAlignment
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<TextDisplay$TextAlignment> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- TextDisplay$TextAlignment convert(Display display)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.displays.text.ExprTextDisplayLineWidth
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Integer> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Integer convert(Display display)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.displays.text.ExprTextDisplayOpacity
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Byte> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Byte convert(Display display)
- Object convert(Object)

## Package: org.skriptlang.skript.bukkit.fishing

### Class: org.skriptlang.skript.bukkit.fishing.FishingModule
Type: Class

Methods:
- **static** void load() throws IOException

## Package: org.skriptlang.skript.bukkit.fishing.elements

### Class: org.skriptlang.skript.bukkit.fishing.elements.CondFishingLure
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: org.skriptlang.skript.bukkit.fishing.elements.CondIsInOpenWater
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Entity entity)
- boolean check(Object)

### Class: org.skriptlang.skript.bukkit.fishing.elements.EffFishingLure
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.fishing.elements.EffPullHookedEntity
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.fishing.elements.EvtBucketEntity
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: org.skriptlang.skript.bukkit.fishing.elements.EvtFish
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: org.skriptlang.skript.bukkit.fishing.elements.ExprFishingApproachAngle
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Float> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.fishing.elements.ExprFishingBiteTime
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Timespan> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.fishing.elements.ExprFishingHook
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

Methods:
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.fishing.elements.ExprFishingHookEntity
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Entity> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.fishing.elements.ExprFishingWaitTime
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Timespan> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

## Package: org.skriptlang.skript.bukkit.furnace

### Class: org.skriptlang.skript.bukkit.furnace.FurnaceModule
Type: Class

Methods:
- **static** void load() throws IOException

## Package: org.skriptlang.skript.bukkit.furnace.elements

### Class: org.skriptlang.skript.bukkit.furnace.elements.EvtFurnace
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> exprs, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: org.skriptlang.skript.bukkit.furnace.elements.ExprFurnaceEventItems
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemStack> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.furnace.elements.ExprFurnaceSlot
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Slot> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- boolean setTime(int time)

### Class: org.skriptlang.skript.bukkit.furnace.elements.ExprFurnaceTime
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Timespan> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

## Package: org.skriptlang.skript.bukkit.input

### Class: org.skriptlang.skript.bukkit.input.InputKey
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- FORWARD
- BACKWARD
- RIGHT
- LEFT
- JUMP
- SNEAK
- SPRINT

Methods:
- **static** Set<InputKey> fromInput(Input input)
- **static** InputKey valueOf(String name)
- **static** InputKey[] values()
- boolean check(Input input)

### Class: org.skriptlang.skript.bukkit.input.InputModule
Type: Class

Methods:
- **static** void load() throws IOException

## Package: org.skriptlang.skript.bukkit.input.elements.conditions

### Class: org.skriptlang.skript.bukkit.input.elements.conditions.CondIsPressingKey
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

## Package: org.skriptlang.skript.bukkit.input.elements.events

### Class: org.skriptlang.skript.bukkit.input.elements.events.EvtPlayerInput
Type: Class
Extends: ch.njol.skript.lang.SkriptEvent

Methods:
- Z init(Literal<*> args, int matchedPattern, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

## Package: org.skriptlang.skript.bukkit.input.elements.expressions

### Class: org.skriptlang.skript.bukkit.input.elements.expressions.ExprCurrentInputKeys
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<InputKey> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- boolean setTime(int time)

## Package: org.skriptlang.skript.bukkit.itemcomponents

### Class: org.skriptlang.skript.bukkit.itemcomponents.ComponentUtils
Type: Class

Methods:
- **static** Collection<TT> registryKeySetToCollection(RegistryKeySet<TT> registryKeySet, Registry<TT> registry)
- **static** RegistryKeySet<TT> collectionToRegistryKeySet(Collection<TT> collection, RegistryKey<TT> registryKey)

### Class: org.skriptlang.skript.bukkit.itemcomponents.ComponentWrapper
Type: Abstract Class
Implements: java.lang.Cloneable

Constructors:
- ComponentWrapper(ItemStack itemStack)
- ComponentWrapper(ItemSource<*> itemSource)
- ComponentWrapper(T component)
- ComponentWrapper(T component)

Methods:
- V applyBuilder(T builder)
- void applyComponent()
- V applyComponent(T component)
- DataComponentType$Valued<TT> getDataComponentType()
- TT newComponent()
- TB newBuilder()
- V editBuilder(Consumer<TB> consumer)
- ItemSource<*> getItemSource()
- TB getBuilder()
- boolean equals(Object obj)
- ComponentWrapper<TT, TB> clone()
- Object clone() throws CloneNotSupportedException
- String toString()
- ItemStack getItemStack()
- TT getComponent()
- ComponentWrapper<TT, TB> newWrapper()

### Class: org.skriptlang.skript.bukkit.itemcomponents.ItemComponentModule
Type: Class
Implements: org.skriptlang.skript.addon.AddonModule

Methods:
- void init(SkriptAddon addon)
- void load(SkriptAddon addon)
- boolean canLoad(SkriptAddon addon)

## Package: org.skriptlang.skript.bukkit.itemcomponents.equippable

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax
Type: Interface
Implements: org.skriptlang.skript.lang.experiment.SimpleExperimentalSyntax

Methods:
- ExperimentData getExperimentData()

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableModule
Type: Class
Implements: org.skriptlang.skript.addon.AddonModule

Methods:
- void init(SkriptAddon addon)
- void load(SkriptAddon addon)
- boolean canLoad(SkriptAddon addon)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableWrapper
Type: Class
Extends: org.skriptlang.skript.bukkit.itemcomponents.ComponentWrapper

Constructors:
- EquippableWrapper(ItemStack itemStack)
- EquippableWrapper(ItemSource<*> itemSource)
- EquippableWrapper(Equippable component)
- EquippableWrapper(Equippable$Builder builder)

Methods:
- void setAssetId(Key key)
- **static** Equippable$Builder setAssetId(Equippable$Builder builder, Key key)
- Collection<EntityType> getAllowedEntities()
- **static** Collection<EntityType> getAllowedEntities(Equippable component)
- EquippableWrapper clone()
- Equippable clone(EquipmentSlot slot)
- ComponentWrapper clone()
- Object clone() throws CloneNotSupportedException
- DataComponentType$Valued<Equippable> getDataComponentType()
- **static** RegistryKeySet<EntityType> convertAllowedEntities(Collection<EntityType> entityTypes)
- Equippable newComponent()
- Object newComponent()
- **static** EquippableWrapper newInstance()
- Equippable$Builder newBuilder()
- DataComponentBuilder newBuilder()
- Key getAssetId()
- **static** Key getAssetId(Equippable component)
- EquippableWrapper newWrapper()
- ComponentWrapper newWrapper()

## Package: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.CondEquipCompDamage
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- String toString(Event event, boolean debug)
- boolean check(EquippableWrapper wrapper)
- boolean check(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.CondEquipCompDispensable
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(EquippableWrapper wrapper)
- boolean check(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.CondEquipCompInteract
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- boolean check(EquippableWrapper wrapper)
- boolean check(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.CondEquipCompShearable
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- boolean check(EquippableWrapper wrapper)
- boolean check(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.CondEquipCompSwapEquipment
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- boolean check(EquippableWrapper wrapper)
- boolean check(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.EffEquipCompDamageable
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.EffEquipCompDispensable
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.EffEquipCompInteract
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.EffEquipCompShearable
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.EffEquipCompSwapEquipment
Type: Class
Extends: ch.njol.skript.lang.Effect
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.ExprEquipCompCameraOverlay
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<String> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String convert(EquippableWrapper wrapper)
- Object convert(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.ExprEquipCompEntities
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<EntityData> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.ExprEquipCompEquipSound
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<String> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String convert(EquippableWrapper wrapper)
- Object convert(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.ExprEquipCompModel
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<String> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String convert(EquippableWrapper wrapper)
- Object convert(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.ExprEquipCompShearSound
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<String> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String convert(EquippableWrapper wrapper)
- Object convert(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.ExprEquipCompSlot
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<EquipmentSlot> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- EquipmentSlot convert(EquippableWrapper wrapper)
- Object convert(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.ExprEquippableComponent
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- ItemStack changeItemStack(ItemStack itemStack, Changer$ChangeMode mode, Equippable component)
- Class<*> acceptChange(Changer$ChangeMode mode)
- void changeSlot(Slot slot, Changer$ChangeMode mode, Equippable component)
- Class<EquippableWrapper> getReturnType()
- void changeItemType(ItemType itemType, Changer$ChangeMode mode, Equippable component)
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- EquippableWrapper convert(Object object)
- Object convert(Object)
- **static** void register(SyntaxRegistry registry)

### Class: org.skriptlang.skript.bukkit.itemcomponents.equippable.elements.ExprSecBlankEquipComp
Type: Class
Extends: ch.njol.skript.expressions.base.SectionExpression
Implements: org.skriptlang.skript.bukkit.itemcomponents.equippable.EquippableExperimentSyntax

Methods:
- Z init(Expression<*> exprs, int pattern, Kleenean delayed, SkriptParser$ParseResult result, SectionNode node, List<TriggerItem> triggerItems)
- Class<EquippableWrapper> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- **static** void register(SyntaxRegistry registry)

## Package: org.skriptlang.skript.bukkit.itemcomponents.generic

### Class: org.skriptlang.skript.bukkit.itemcomponents.generic.ExprItemCompCopy
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<ComponentWrapper> getReturnType()
- String toString(Event event, boolean debug)
- ComponentWrapper convert(ComponentWrapper wrapper)
- Object convert(Object)
- **static** void register(SyntaxRegistry registry)

## Package: org.skriptlang.skript.bukkit.log.runtime

### Class: org.skriptlang.skript.bukkit.log.runtime.BukkitRuntimeErrorConsumer
Type: Class
Implements: org.skriptlang.skript.log.runtime.RuntimeErrorConsumer

Methods:
- void printFrameOutput(Frame$FrameOutput output, Level level)
- void printError(RuntimeError error)

## Package: org.skriptlang.skript.bukkit.loottables

### Class: org.skriptlang.skript.bukkit.loottables.LootContextCreateEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- LootContextCreateEvent(LootContextWrapper contextWrapper)

Methods:
- LootContextWrapper getContextWrapper()
- HandlerList getHandlers()

### Class: org.skriptlang.skript.bukkit.loottables.LootContextWrapper
Type: Class

Constructors:
- LootContextWrapper(Location location)

Methods:
- void setKiller(Player killer)
- Location getLocation()
- float getLuck()
- void setLocation(Location location)
- Player getKiller()
- Entity getEntity()
- LootContext getContext()
- void setLuck(float luck)
- void setEntity(Entity entity)

### Class: org.skriptlang.skript.bukkit.loottables.LootTableModule
Type: Class

Methods:
- **static** void load() throws IOException

### Class: org.skriptlang.skript.bukkit.loottables.LootTableUtils
Type: Class

Methods:
- **static** void updateState(Lootable lootable)
- **static** LootTable getLootTable(Object object)
- **static** Lootable getAsLootable(Object object)
- **static** boolean isLootable(Object object)

## Package: org.skriptlang.skript.bukkit.loottables.elements.conditions

### Class: org.skriptlang.skript.bukkit.loottables.elements.conditions.CondHasLootTable
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Object object)

### Class: org.skriptlang.skript.bukkit.loottables.elements.conditions.CondIsLootable
Type: Class
Extends: ch.njol.skript.conditions.base.PropertyCondition

Methods:
- boolean check(Object object)

## Package: org.skriptlang.skript.bukkit.loottables.elements.effects

### Class: org.skriptlang.skript.bukkit.loottables.elements.effects.EffGenerateLoot
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

## Package: org.skriptlang.skript.bukkit.loottables.elements.expressions

### Class: org.skriptlang.skript.bukkit.loottables.elements.expressions.ExprLoot
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemStack> getReturnType()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.loottables.elements.expressions.ExprLootContext
Type: Class
Extends: ch.njol.skript.expressions.base.EventValueExpression

Methods:
- String toString()

### Class: org.skriptlang.skript.bukkit.loottables.elements.expressions.ExprLootContextEntity
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Entity> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Entity convert(LootContext context)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.loottables.elements.expressions.ExprLootContextLocation
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Location> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Location convert(LootContext context)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.loottables.elements.expressions.ExprLootContextLooter
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Player> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Player convert(LootContext context)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.loottables.elements.expressions.ExprLootContextLuck
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Float> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Float convert(LootContext context)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.loottables.elements.expressions.ExprLootItems
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<ItemStack> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.loottables.elements.expressions.ExprLootTable
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<LootTable> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- LootTable convert(Object object)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.loottables.elements.expressions.ExprLootTableFromString
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<LootTable> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.loottables.elements.expressions.ExprLootTableSeed
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<Long> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Long convert(Object object)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.loottables.elements.expressions.ExprSecCreateLootContext
Type: Class
Extends: ch.njol.skript.expressions.base.SectionExpression

Methods:
- Z init(Expression<*> exprs, int pattern, Kleenean isDelayed, SkriptParser$ParseResult result, SectionNode node, List<TriggerItem> triggerItems)
- Class<LootContext> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

## Package: org.skriptlang.skript.bukkit.misc.effects

### Class: org.skriptlang.skript.bukkit.misc.effects.EffRotate
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

## Package: org.skriptlang.skript.bukkit.misc.expressions

### Class: org.skriptlang.skript.bukkit.misc.expressions.ExprItemOfEntity
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<Slot> getReturnType()
- Slot convert(Entity entity)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.misc.expressions.ExprQuaternionAxisAngle
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- Expression<*> simplify()
- SyntaxElement simplify()
- Object convert(Quaternionf from)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.misc.expressions.ExprRotate
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> exprs, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Expression<*> simplify()
- SyntaxElement simplify()

### Class: org.skriptlang.skript.bukkit.misc.expressions.ExprTextOf
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<String> getReturnType()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String convert(Object object)
- Object convert(Object)

## Package: org.skriptlang.skript.bukkit.misc.rotation

### Class: org.skriptlang.skript.bukkit.misc.rotation.Rotator
Type: Interface

Methods:
- TT rotate(T)

### Class: org.skriptlang.skript.bukkit.misc.rotation.DisplayRotator
Type: Class
Implements: org.skriptlang.skript.bukkit.misc.rotation.Rotator

Constructors:
- DisplayRotator(Rotator$Axis axis, float qRotator)
- DisplayRotator(Rotator$Axis axis, Vector3f vector, float qRotator)

Methods:
- Display rotate(Display input)
- Object rotate(Object)

### Class: org.skriptlang.skript.bukkit.misc.rotation.NonMutatingQuaternionRotator
Type: Class
Implements: org.skriptlang.skript.bukkit.misc.rotation.Rotator

Constructors:
- NonMutatingQuaternionRotator(Rotator$Axis rotator, float angle)
- NonMutatingQuaternionRotator(Rotator$Axis axis, Vector3f rotator, float angle)

Methods:
- Quaternionf rotate(Quaternionf input)
- Object rotate(Object)

### Class: org.skriptlang.skript.bukkit.misc.rotation.NonMutatingVectorRotator
Type: Class
Implements: org.skriptlang.skript.bukkit.misc.rotation.Rotator

Constructors:
- NonMutatingVectorRotator(Rotator$Axis rotator, double angle)
- NonMutatingVectorRotator(Rotator$Axis axis, Vector vector, double rotator)

Methods:
- Vector rotate(Vector input)
- Object rotate(Object)

### Class: org.skriptlang.skript.bukkit.misc.rotation.QuaternionRotator
Type: Class
Implements: org.skriptlang.skript.bukkit.misc.rotation.Rotator

Constructors:
- QuaternionRotator(Rotator$Axis rotator, float angle)
- QuaternionRotator(Rotator$Axis axis, Vector3f rotator, float angle)

Methods:
- Quaternionf rotate(Quaternionf input)
- Object rotate(Object)

### Class: org.skriptlang.skript.bukkit.misc.rotation.Rotator$Axis
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- X
- LOCAL_X
- Y
- LOCAL_Y
- Z
- LOCAL_Z
- ARBITRARY
- LOCAL_ARBITRARY

Methods:
- **static** Rotator$Axis fromBukkit(Axis axis)
- **static** Rotator$Axis valueOf(String name)
- **static** Rotator$Axis[] values()
- String toString()

### Class: org.skriptlang.skript.bukkit.misc.rotation.VectorRotator
Type: Class
Implements: org.skriptlang.skript.bukkit.misc.rotation.Rotator

Constructors:
- VectorRotator(Rotator$Axis rotator, double angle)
- VectorRotator(Rotator$Axis axis, Vector vector, double rotator)

Methods:
- Vector rotate(Vector input)
- Object rotate(Object)

## Package: org.skriptlang.skript.bukkit.registration

### Class: org.skriptlang.skript.bukkit.registration.BukkitSyntaxInfos$Event
Type: Interface
Implements: org.skriptlang.skript.registration.SyntaxInfo

Methods:
- BukkitSyntaxInfos$Event$Builder<BukkitSyntaxInfos$Event$Builder<*TE>, TE> toBuilder()
- SyntaxInfo$Builder toBuilder()
- Collection<String> requiredPlugins()
- Collection<String> keywords()
- Collection<String> examples()
- String documentationId()
- String name()
- **static** BukkitSyntaxInfos$Event$Builder<BukkitSyntaxInfos$Event$Builder<*TE>, TE> builder(Class<TE> eventClass, String name)
- Collection<String> description()
- String id()
- Collection<Class<Event>> events()
- Collection<String> since()
- SkriptEvent$ListeningBehavior listeningBehavior()

### Class: org.skriptlang.skript.bukkit.registration.BukkitSyntaxInfos$Event$Builder
Type: Interface
Implements: org.skriptlang.skript.registration.SyntaxInfo$Builder

Methods:
- TB addExamples(String)
- TB addExamples(Collection<String>)
- TB addDescription(String)
- TB addDescription(String)
- TB addDescription(Collection<String>)
- TB addRequiredPlugins(String)
- TB addRequiredPlugins(Collection<String>)
- TB addEvents(Class<Event>)
- TB addEvents(Collection<Class<Event>>)
- TB documentationId(String)
- TB clearRequiredPlugins()
- TB clearSince()
- TB clearExamples()
- TB addExample(String)
- TB listeningBehavior(SkriptEvent$ListeningBehavior)
- TB addEvent(Class<Event>)
- TB addSince(String)
- TB addSince(String)
- TB addSince(Collection<String>)
- BukkitSyntaxInfos$Event<TE> build()
- SyntaxInfo build()
- TB clearDescription()
- TB clearEvents()
- TB addRequiredPlugin(String)
- TB addKeywords(String)
- TB addKeywords(Collection<String>)
- TB clearKeywords()
- TB addKeyword(String)

### Class: org.skriptlang.skript.bukkit.registration.BukkitRegistryKeys
Type: Class

No public methods found

### Class: org.skriptlang.skript.bukkit.registration.BukkitSyntaxInfos
Type: Class

Methods:
- **static** String fixPattern(String pattern)

## Package: org.skriptlang.skript.bukkit.tags

### Class: org.skriptlang.skript.bukkit.tags.SkriptTag
Type: Class
Implements: org.bukkit.Tag

Constructors:
- SkriptTag(NamespacedKey key, Collection<TT> contents)

Methods:
- Z isTagged(T item)
- NamespacedKey getKey()
- Set<TT> getValues()

### Class: org.skriptlang.skript.bukkit.tags.TagModule
Type: Class

Methods:
- **static** void load() throws IOException
- **static** Keyed[] getKeyed(Object input)

### Class: org.skriptlang.skript.bukkit.tags.TagRegistry
Type: Class

Methods:
- Iterable<Tag<TT>> getMatchingTags(TagOrigin origin, TagType<TT> type, Predicate<Tag<TT>> predicate)
- Iterable<Tag<TT>> getTags(TagOrigin origin, Class<TT> typeClass, TagType<*> types)
- Iterable<Tag<TT>> getTags(TagOrigin origin, TagType<TT> type)
- Tag<TT> getTag(TagOrigin origin, TagType<TT> type, NamespacedKey key)

### Class: org.skriptlang.skript.bukkit.tags.TagType
Type: Class

Constructors:
- TagType(String pattern, Class<TT> type)
- TagType(String pattern, String toString, Class<TT> type)

Methods:
- **static** V addType(TagType<*> type)
- **static** TagType<*> getType(int i)
- String pattern()
- String toString()
- **static** List<TagType<*>> getTypes()
- Class<TT> type()
- **static** TagType<*> fromParseMark(int i)
- **static** String getFullPattern()
- **static** String getFullPattern(boolean required)

## Package: org.skriptlang.skript.bukkit.tags.elements

### Class: org.skriptlang.skript.bukkit.tags.elements.CondIsTagged
Type: Class
Extends: ch.njol.skript.lang.Condition

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)

### Class: org.skriptlang.skript.bukkit.tags.elements.EffRegisterTag
Type: Class
Extends: ch.njol.skript.lang.Effect

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.tags.elements.ExprTag
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Tag> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.tags.elements.ExprTagContents
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Stream<*> stream(Event event)
- Class<*> possibleReturnTypes()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.bukkit.tags.elements.ExprTagKey
Type: Class
Extends: ch.njol.skript.expressions.base.SimplePropertyExpression

Methods:
- Class<String> getReturnType()
- String convert(Tag<*> from)
- Object convert(Object)

### Class: org.skriptlang.skript.bukkit.tags.elements.ExprTagsOf
Type: Class
Extends: ch.njol.skript.expressions.base.PropertyExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Tag> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)
- Collection<Tag<TT>> getTags(T value)

### Class: org.skriptlang.skript.bukkit.tags.elements.ExprTagsOfType
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Tag> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

## Package: org.skriptlang.skript.bukkit.tags.sources

### Class: org.skriptlang.skript.bukkit.tags.sources.BukkitTagSource
Type: Class
Extends: org.skriptlang.skript.bukkit.tags.sources.TagSource

Constructors:
- BukkitTagSource(String registry, TagType<TT> type)

Methods:
- Iterable<Tag<TT>> getAllTags()
- Tag<TT> getTag(NamespacedKey key)

### Class: org.skriptlang.skript.bukkit.tags.sources.CustomTagSource
Type: Class
Extends: org.skriptlang.skript.bukkit.tags.sources.TagSource

Methods:
- Iterable<Tag<TT>> getAllTags()
- Tag<TT> getTag(NamespacedKey key)

### Class: org.skriptlang.skript.bukkit.tags.sources.PaperTagSource
Type: Class
Extends: org.skriptlang.skript.bukkit.tags.sources.CustomTagSource

Constructors:
- PaperTagSource(Iterable<Tag<TT>> tags, TagType<TT> types)

No public methods found

### Class: org.skriptlang.skript.bukkit.tags.sources.SkriptTagSource
Type: Class
Extends: org.skriptlang.skript.bukkit.tags.sources.CustomTagSource

Methods:
- **static** SkriptTagSource<Material> BLOCKS()
- **static** SkriptTagSource<EntityType> ENTITIES()
- **static** SkriptTagSource<Material> ITEMS()
- V addTag(Tag<TT> tag)
- **static** void makeDefaultSources()

### Class: org.skriptlang.skript.bukkit.tags.sources.TagOrigin
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- BUKKIT
- PAPER
- SKRIPT
- ANY

Methods:
- **static** TagOrigin valueOf(String name)
- **static** TagOrigin[] values()
- String toString(boolean datapackOnly)
- **static** TagOrigin fromParseTags(Collection<String> tags)
- boolean matches(TagOrigin other)
- **static** String getFullPattern()

### Class: org.skriptlang.skript.bukkit.tags.sources.TagSource
Type: Abstract Class

Methods:
- TagOrigin getOrigin()
- Iterable<Tag<TT>> getAllTagsMatching(Predicate<Tag<TT>> predicate)
- Iterable<Tag<TT>> getAllTags()
- TagType<TT> getTypes()
- Tag<TT> getTag(NamespacedKey)

## Package: org.skriptlang.skript.common

### Class: org.skriptlang.skript.common.CommonModule
Type: Class
Implements: org.skriptlang.skript.addon.AddonModule

Methods:
- void load(SkriptAddon addon)

## Package: org.skriptlang.skript.common.expressions

### Class: org.skriptlang.skript.common.expressions.ExprRecursiveSize
Type: Class
Extends: ch.njol.skript.lang.util.SimpleExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<Long> getReturnType()
- boolean isSingle()
- String toString(Event event, boolean debug)

## Package: org.skriptlang.skript.common.function

### Class: org.skriptlang.skript.common.function.DefaultFunction
Type: Interface
Implements: org.skriptlang.skript.common.function.Function, ch.njol.skript.doc.Documentable

Methods:
- **static** DefaultFunction$Builder<TT> builder(SkriptAddon source, String name, Class<TT> returnType)
- SkriptAddon source()

### Class: org.skriptlang.skript.common.function.DefaultFunction$Builder
Type: Interface

Methods:
- DefaultFunction$Builder<TT> keywords(String)
- DefaultFunction$Builder<TT> examples(String)
- DefaultFunction<TT> build(Function<FunctionArguments, TT>)
- DefaultFunction$Builder<TT> parameter(String, Class<*>, Parameter$Modifier)
- DefaultFunction$Builder<TT> contract(Contract)
- DefaultFunction$Builder<TT> description(String)
- DefaultFunction$Builder<TT> requires(String)
- DefaultFunction$Builder<TT> since(String)

### Class: org.skriptlang.skript.common.function.Function
Type: Interface

Methods:
- Signature<TT> signature()

### Class: org.skriptlang.skript.common.function.FunctionArguments
Type: Interface

Methods:
- Set<String> names()
- TT getOrDefault(String, T)
- TT getOrDefault(String, Supplier<TT>)
- TT get(String)

### Class: org.skriptlang.skript.common.function.Parameter
Type: Interface

Methods:
- boolean single()
- boolean hasModifier(Parameter$Modifier modifier)
- String name()
- Set<Parameter$Modifier> modifiers()
- Class<TT> type()

### Class: org.skriptlang.skript.common.function.Parameter$Modifier
Type: Interface

Methods:
- **static** Parameter$Modifier of()

### Class: org.skriptlang.skript.common.function.Signature
Type: Interface

No public methods found

## Package: org.skriptlang.skript.common.properties

### Class: org.skriptlang.skript.common.properties.PropertiesModule
Type: Class
Implements: org.skriptlang.skript.addon.AddonModule

Methods:
- void load(SkriptAddon addon)
- boolean canLoad(SkriptAddon addon)

## Package: org.skriptlang.skript.common.properties.conditions

### Class: org.skriptlang.skript.common.properties.conditions.PropCondContains
Type: Class
Extends: ch.njol.skript.lang.Condition
Implements: org.skriptlang.skript.lang.properties.PropertyBaseSyntax, ch.njol.skript.lang.VerboseAssert

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Property<PropertyHandler$ContainsHandler<**>> getProperty()
- String getReceivedMessage(Event event)
- String toString(Event event, boolean debug)
- String getExpectedMessage(Event event)
- boolean check(Event event)

### Class: org.skriptlang.skript.common.properties.conditions.PropCondIsEmpty
Type: Class
Extends: org.skriptlang.skript.lang.properties.PropertyBaseCondition

Methods:
- Property<PropertyHandler$ConditionPropertyHandler<*>> getProperty()

## Package: org.skriptlang.skript.common.properties.expressions

### Class: org.skriptlang.skript.common.properties.expressions.PropExprAmount
Type: Class
Extends: org.skriptlang.skript.lang.properties.PropertyBaseExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- **static** ExpressionList<*> asExprList(Expression<*> expr)
- Property<PropertyHandler$ExpressionPropertyHandler<**>> getProperty()
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.common.properties.expressions.PropExprCustomName
Type: Class
Extends: org.skriptlang.skript.lang.properties.PropertyBaseExpression

Methods:
- Property<PropertyHandler$ExpressionPropertyHandler<**>> getProperty()

### Class: org.skriptlang.skript.common.properties.expressions.PropExprName
Type: Class
Extends: org.skriptlang.skript.lang.properties.PropertyBaseExpression

Methods:
- Property<PropertyHandler$ExpressionPropertyHandler<**>> getProperty()

### Class: org.skriptlang.skript.common.properties.expressions.PropExprNumber
Type: Class
Extends: org.skriptlang.skript.lang.properties.PropertyBaseExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Property<PropertyHandler$ExpressionPropertyHandler<**>> getProperty()
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.common.properties.expressions.PropExprSize
Type: Class
Extends: org.skriptlang.skript.lang.properties.PropertyBaseExpression

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Property<PropertyHandler$ExpressionPropertyHandler<**>> getProperty()
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.common.properties.expressions.PropExprValueOf
Type: Class
Extends: org.skriptlang.skript.lang.properties.PropertyBaseExpression

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Property<PropertyHandler$TypedValuePropertyHandler<**>> getProperty()

## Package: org.skriptlang.skript.common.types

### Class: org.skriptlang.skript.common.types.QueueClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

No public methods found

### Class: org.skriptlang.skript.common.types.ScriptClassInfo
Type: Class
Extends: ch.njol.skript.classes.ClassInfo

No public methods found

## Package: org.skriptlang.skript.lang.arithmetic

### Class: org.skriptlang.skript.lang.arithmetic.Operation
Type: Interface
Implements: java.util.function.BiFunction

Methods:
- TT apply(T l,  r)
- TT calculate(T, )

### Class: org.skriptlang.skript.lang.arithmetic.Arithmetics
Type: Class

Methods:
- **static** Set<Operator> getAllOperators()
- **static** List<OperationInfo<***>> getOperations(Operator operator)
- **static** List<OperationInfo<TT, **>> getOperations(Operator operator, Class<TT> type)
- **static** Z exactDifferenceExists(Class<*> type)
- **static** V registerOperation(Operator operator, Class<TT> type, Operation<TT, TT, TT> operation)
- **static** V registerOperation(Operator operator, Class<TL> leftClass, Class<TR> rightClass, Operation<TL, TR, TL> operation)
- **static** V registerOperation(Operator operator, Class<TL> leftClass, Class<TR> rightClass, Operation<TL, TR, TL> operation, Operation<TR, TL, TL> commutativeOperation)
- **static** V registerOperation(Operator operator, Class<TL> leftClass, Class<TR> rightClass, Class<TT> returnType, Operation<TL, TR, TT> operation, Operation<TR, TL, TT> commutativeOperation)
- **static** V registerOperation(Operator operator, Class<TL> leftClass, Class<TR> rightClass, Class<TT> returnType, Operation<TL, TR, TT> operation)
- **static** V registerDefaultValue(Class<TT> type, Supplier<TT> supplier)
- **static** OperationInfo<TL, TR, TT> getOperationInfo(Operator operator, Class<TL> leftClass, Class<TR> rightClass, Class<TT> returnType)
- **static** OperationInfo<TL, TR, *> getOperationInfo(Operator operator, Class<TL> leftClass, Class<TR> rightClass)
- **static** Z exactOperationExists(Operator operator, Class<*> leftClass, Class<*> rightClass)
- **static** Collection<Class<*>> getAllReturnTypes(Operator operator)
- **static** TR getDefaultValue(Class<TT> type)
- **static** V registerDifference(Class<TT> type, Operation<TT, TT, TT> operation)
- **static** V registerDifference(Class<TT> type, Class<TR> returnType, Operation<TT, TT, TR> operation)
- **static** Z operationExists(Operator operator, Class<*> leftClass, Class<*> rightClass)
- **static** Operation<TT, TT, TR> getDifference(Class<TT> type, Class<TR> returnType)
- **static** Operation<TT, TT, *> getDifference(Class<TT> type)
- **static** Z differenceExists(Class<*> type)
- **static** TT calculateUnsafe(Operator operator, T left,  right)
- **static** TR differenceUnsafe(T left, T right)
- **static** List<OperationInfo<*TR, *>> lookupRightOperations(Operator operator, Class<TR> rightClass)
- **static** TR difference(T left, T right, ; returnType)
- **static** DifferenceInfo<TT, TR> getDifferenceInfo(Class<TT> type, Class<TR> returnType)
- **static** DifferenceInfo<TT, *> getDifferenceInfo(Class<TT> type)
- **static** Operation<TL, TR, TT> getOperation(Operator operator, Class<TL> leftClass, Class<TR> rightClass, Class<TT> returnType)
- **static** Operation<TL, TR, *> getOperation(Operator operator, Class<TL> leftClass, Class<TR> rightClass)
- **static** List<OperationInfo<TL, **>> lookupLeftOperations(Operator operator, Class<TL> leftClass)
- **static** TT calculate(Operator operator, T left,  right, T returnType)
- **static** OperationInfo<TL, TR, TT> lookupOperationInfo(Operator operator, Class<TL> leftClass, Class<TR> rightClass, Class<TT> returnType)
- **static** OperationInfo<TL, TR, *> lookupOperationInfo(Operator operator, Class<TL> leftClass, Class<TR> rightClass)

### Class: org.skriptlang.skript.lang.arithmetic.DifferenceInfo
Type: Class
Extends: java.lang.Record

Constructors:
- DifferenceInfo(Class<TT> type, Class<TR> returnType, Operation<TT, TT, TR> operation)

Methods:
- Class<TR> getReturnType()
- Class<TT> getType()
- int hashCode()
- boolean equals(Object o)
- Operation<TT, TT, TR> getOperation()
- String toString()
- Class<TT> type()
- Operation<TT, TT, TR> operation()
- Class<TR> returnType()

### Class: org.skriptlang.skript.lang.arithmetic.OperationInfo
Type: Class
Extends: java.lang.Record

Constructors:
- OperationInfo(Class<TL> left, Class<TR> right, Class<TT> returnType, Operation<TL, TR, TT> operation)

Methods:
- Class<TR> getRight()
- Class<TT> getReturnType()
- Class<TL> left()
- int hashCode()
- boolean equals(Object o)
- OperationInfo<TL2, TR2, TT> getConverted(Class<TL2> fromLeft, Class<TR2> fromRight)
- OperationInfo<TL2, TR2, TT2> getConverted(Class<TL2> fromLeft, Class<TR2> fromRight, Class<TT2> toReturnType)
- Operation<TL, TR, TT> getOperation()
- String toString()
- Class<TR> right()
- Operation<TL, TR, TT> operation()
- Class<TT> returnType()
- Class<TL> getLeft()

### Class: org.skriptlang.skript.lang.arithmetic.Operator
Type: Class
Extends: java.lang.Record
Implements: java.lang.Comparable

Constructors:
- Operator(String sign, Priority priority, String node)
- Operator(char sign, Priority priority, Noun node)
- Operator(char sign, Priority priority, String node)
- Operator(String sign, Priority priority, Noun node)

Methods:
- Noun node()
- String getName()
- int hashCode()
- boolean equals(Object o)
- String sign()
- String toString()
- int compareTo(Operator o)
- int compareTo(Object)
- Priority priority()

## Package: org.skriptlang.skript.lang.comparator

### Class: org.skriptlang.skript.lang.comparator.Comparator
Type: Interface

Methods:
- boolean supportsOrdering()
- Relation compare(T, T)
- boolean supportsInversion()

### Class: org.skriptlang.skript.lang.comparator.ComparatorInfo
Type: Class

Methods:
- Class<TT2> getSecondType()
- Comparator<TT1, TT2> getComparator()
- String toString()
- Class<TT1> getFirstType()

### Class: org.skriptlang.skript.lang.comparator.Comparators
Type: Class

Methods:
- **static** Relation compare(T first, T second)
- **static** Comparator<TT1, TT2> getComparator(Class<TT1> firstType, Class<TT2> secondType)
- **static** List<ComparatorInfo<**>> getComparatorInfos()
- **static** V registerComparator(Class<TT1> firstType, Class<TT2> secondType, Comparator<TT1, TT2> comparator)
- **static** ComparatorInfo<TT1, TT2> getComparatorInfo(Class<TT1> firstType, Class<TT2> secondType)
- **static** Z exactComparatorExists(Class<*> firstType, Class<*> secondType)
- **static** Z comparatorExists(Class<*> firstType, Class<*> secondType)

### Class: org.skriptlang.skript.lang.comparator.Relation
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- EQUAL
- NOT_EQUAL
- GREATER
- GREATER_OR_EQUAL
- SMALLER
- SMALLER_OR_EQUAL

Methods:
- Relation getInverse()
- **static** Relation valueOf(String name)
- **static** Relation get(boolean b)
- **static** Relation get(int i)
- **static** Relation get(double d)
- **static** Relation[] values()
- String toString()
- int getRelation()
- Relation getSwitched()
- boolean isImpliedBy(Relation other)
- boolean isImpliedBy(Relation[] others)

## Package: org.skriptlang.skript.lang.condition

### Class: org.skriptlang.skript.lang.condition.Conditional
Type: Interface
Implements: ch.njol.skript.lang.Debuggable

Methods:
- **static** Conditional<TT> negate(Conditional<TT> conditional)
- Kleenean evaluateOr(Conditional<TT> other, T context)
- Kleenean evaluateOr(Conditional<TT> other, T context, T cache)
- Kleenean evaluateOr(Kleenean other, T context)
- Kleenean evaluateOr(Kleenean other, T context, T cache)
- **static** DNFConditionalBuilder<TT> builderDNF(Class<TT> ignoredContextClass)
- **static** DNFConditionalBuilder<TT> builderDNF(Conditional<TT> conditional)
- Kleenean evaluateNot(T context)
- Kleenean evaluateNot(T context, T cache)
- Kleenean evaluateAnd(Conditional<TT> other, T context)
- Kleenean evaluateAnd(Conditional<TT> other, T context, T cache)
- Kleenean evaluateAnd(Kleenean other, T context)
- Kleenean evaluateAnd(Kleenean other, T context, T cache)
- **static** Conditional<TT> compound(Conditional$Operator operator, Collection<Conditional<TT>> conditionals)
- **static** Conditional<TT> compound(Conditional$Operator operator, Conditional<TT> conditionals)
- Kleenean evaluate(T)
- Kleenean evaluate(T context, T cache)

### Class: org.skriptlang.skript.lang.condition.Conditional$Operator
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- AND
- OR
- NOT

Methods:
- **static** Conditional$Operator valueOf(String name)
- **static** Conditional$Operator[] values()

### Class: org.skriptlang.skript.lang.condition.DNFConditionalBuilder
Type: Class

Methods:
- DNFConditionalBuilder<TT> add(boolean or, Conditional<TT> conditionals)
- DNFConditionalBuilder<TT> orNot(Conditional<TT> conditional)
- DNFConditionalBuilder<TT> or(Conditional<TT> orConditionals)
- Conditional<TT> build()
- DNFConditionalBuilder<TT> and(Conditional<TT> andConditionals)
- DNFConditionalBuilder<TT> andNot(Conditional<TT> conditional)

## Package: org.skriptlang.skript.lang.converter

### Class: org.skriptlang.skript.lang.converter.Converter
Type: Interface

Methods:
- TT convert(T)

### Class: org.skriptlang.skript.lang.converter.ConverterInfo
Type: Class

Constructors:
- ConverterInfo(Class<TF> from, Class<TT> to, Converter<TF, TT> converter, int flags)

Methods:
- String toString()
- Class<TT> getTo()
- int getFlags()
- Converter<TF, TT> getConverter()
- Class<TF> getFrom()

### Class: org.skriptlang.skript.lang.converter.Converters
Type: Class

Methods:
- **static** [TTo convertUnsafe([T from, float toType, r converter)
- **static** Z converterExists(Class<*> fromType, Class<*> toType)
- **static** Z converterExists(Class<*> fromType, Class<*> toTypes)
- **static** ConverterInfo<TF, TT> getConverterInfo(Class<TF> fromType, Class<TT> toType)
- **static** List<ConverterInfo<**>> getConverterInfos()
- **static** V createChainedConverters()
- **static** V registerConverter(Class<TF> fromType, Class<TT> toType, Converter<TF, TT> converter)
- **static** V registerConverter(Class<TF> fromType, Class<TT> toType, Converter<TF, TT> converter, int flags)
- **static** TTo convert(T from, float toType)
- **static** TTo convert(T from, float toTypes)
- **static** V convert([T from, float destination, r toTypes)
- **static** [TTo convert(Object from, Class<TTo> toType)
- **static** [TTo convert(Object from, Class<+TTo> toTypes, Class<TTo> superType)
- **static** [TTo convert([T from, float toType, r converter)
- **static** V convert([T from, float destination, r converter)
- **static** Z exactConverterExists(Class<*> fromType, Class<*> toType)
- **static** TTo convertStrictly(Object from, Class<TTo> toType)
- **static** [TTo convertStrictly(Object from, Class<TTo> toType)
- **static** Converter<TF, TT> getConverter(Class<TF> fromType, Class<TT> toType)

## Package: org.skriptlang.skript.lang.entry

### Class: org.skriptlang.skript.lang.entry.ContainerEntryData
Type: Class
Extends: org.skriptlang.skript.lang.entry.EntryData

Constructors:
- ContainerEntryData(String key, boolean optional, EntryValidator entryValidator)
- ContainerEntryData(String key, boolean optional, EntryValidator$EntryValidatorBuilder entryValidator)
- ContainerEntryData(String key, boolean optional, boolean multiple, EntryValidator entryValidator)
- ContainerEntryData(String key, boolean optional, boolean multiple, EntryValidator$EntryValidatorBuilder entryValidator)

Methods:
- EntryContainer getValue(Node node)
- Object getValue(Node)
- EntryValidator getEntryValidator()
- boolean canCreateWith(Node node)

### Class: org.skriptlang.skript.lang.entry.EntryContainer
Type: Class

Methods:
- TR getOptional(String key, Class<TE> expectedType, boolean useDefaultValue)
- Object getOptional(String key, boolean useDefaultValue)
- List<Node> getUnhandledNodes()
- List<TR> getAll(String key, Class<TE> expectedType, boolean useDefaultValue)
- List<Object> getAll(String key, boolean useDefaultValue)
- SectionNode getSource()
- TR get(String key, Class<TE> expectedType, boolean useDefaultValue)
- Object get(String key, boolean useDefaultValue)
- boolean hasEntry(String key)
- **static** EntryContainer withoutValidator(SectionNode source)

### Class: org.skriptlang.skript.lang.entry.EntryData
Type: Abstract Class

Constructors:
- EntryData(String key, T defaultValue, T optional)
- EntryData(String key, T defaultValue, T optional, ; multiple)

Methods:
- TT getValue(Node)
- String getKey()
- boolean supportsMultiple()
- boolean isOptional()
- boolean canCreateWith(Node)
- TT getDefaultValue()

### Class: org.skriptlang.skript.lang.entry.EntryValidator
Type: Class

Methods:
- List<EntryData<*>> getEntryData()
- **static** EntryValidator$EntryValidatorBuilder builder()
- EntryContainer validate(SectionNode sectionNode)

### Class: org.skriptlang.skript.lang.entry.EntryValidator$EntryValidatorBuilder
Type: Class

Methods:
- EntryValidator$EntryValidatorBuilder unexpectedNodeTester(Predicate<Node> unexpectedNodeTester)
- EntryValidator$EntryValidatorBuilder addEntry(String key, String defaultValue, boolean optional)
- EntryValidator$EntryValidatorBuilder addEntry(String key, String defaultValue, boolean optional, boolean multiple)
- EntryValidator build()
- EntryValidator$EntryValidatorBuilder unexpectedEntryMessage(Function<String, String> unexpectedEntryMessage)
- EntryValidator$EntryValidatorBuilder addEntryData(EntryData<*> entryData)
- EntryValidator$EntryValidatorBuilder entrySeparator(String separator)
- EntryValidator$EntryValidatorBuilder missingRequiredEntryMessage(Function<String, String> message)
- EntryValidator$EntryValidatorBuilder addSection(String key, boolean optional)
- EntryValidator$EntryValidatorBuilder addSection(String key, boolean optional, boolean multiple)

### Class: org.skriptlang.skript.lang.entry.KeyValueEntryData
Type: Abstract Class
Extends: org.skriptlang.skript.lang.entry.EntryData

Constructors:
- KeyValueEntryData(String key, T defaultValue, T optional)
- KeyValueEntryData(String key, T defaultValue, T optional, ; multiple)

Methods:
- TT getValue(Node node)
- String getSeparator()
- boolean canCreateWith(Node node)

### Class: org.skriptlang.skript.lang.entry.SectionEntryData
Type: Class
Extends: org.skriptlang.skript.lang.entry.EntryData

Constructors:
- SectionEntryData(String key, SectionNode defaultValue, boolean optional)
- SectionEntryData(String key, SectionNode defaultValue, boolean optional, boolean multiple)

Methods:
- SectionNode getValue(Node node)
- Object getValue(Node)
- boolean canCreateWith(Node node)

## Package: org.skriptlang.skript.lang.entry.util

### Class: org.skriptlang.skript.lang.entry.util.ExpressionEntryData
Type: Class
Extends: org.skriptlang.skript.lang.entry.KeyValueEntryData

Constructors:
- ExpressionEntryData(String key, Expression<+TT> defaultValue, boolean optional, Class<+TT> returnType)
- ExpressionEntryData(String key, Expression<+TT> defaultValue, boolean optional, Class<+TT> returnType, int flags)
- ExpressionEntryData(String key, Expression<+TT> defaultValue, boolean optional, Class<+TT> returnTypes)
- ExpressionEntryData(String key, Expression<+TT> defaultValue, boolean optional, int flags, Class<+TT> returnTypes)

No public methods found

### Class: org.skriptlang.skript.lang.entry.util.LiteralEntryData
Type: Class
Extends: org.skriptlang.skript.lang.entry.KeyValueEntryData

Constructors:
- LiteralEntryData(String key, T defaultValue, T optional, ; type)

Methods:
- TT getValue(String value)

### Class: org.skriptlang.skript.lang.entry.util.TriggerEntryData
Type: Class
Extends: org.skriptlang.skript.lang.entry.EntryData

Constructors:
- TriggerEntryData(String key, Trigger defaultValue, boolean optional)
- TriggerEntryData(String key, Trigger defaultValue, boolean optional, boolean multiple)

Methods:
- Trigger getValue(Node node)
- Object getValue(Node)
- boolean canCreateWith(Node node)

### Class: org.skriptlang.skript.lang.entry.util.VariableStringEntryData
Type: Class
Extends: org.skriptlang.skript.lang.entry.KeyValueEntryData

Constructors:
- VariableStringEntryData(String key, VariableString defaultValue, boolean optional)
- VariableStringEntryData(String key, VariableString defaultValue, boolean optional, StringMode stringMode)

No public methods found

## Package: org.skriptlang.skript.lang.experiment

### Class: org.skriptlang.skript.lang.experiment.Experiment
Type: Interface

Methods:
- LifeCycle phase()
- **static** Experiment constant(String codeName, LifeCycle phase, String[] patterns)
- SkriptPattern pattern()
- String codeName()
- boolean isKnown()
- boolean matches(String text)
- **static** Experiment unknown(String text)

### Class: org.skriptlang.skript.lang.experiment.ExperimentalSyntax
Type: Interface
Implements: ch.njol.skript.lang.SyntaxElement

Methods:
- boolean isSatisfiedBy(ExperimentSet)

### Class: org.skriptlang.skript.lang.experiment.Experimented
Type: Interface

Methods:
- boolean hasExperiment(Experiment)
- boolean hasExperiment(String featureName)

### Class: org.skriptlang.skript.lang.experiment.SimpleExperimentalSyntax
Type: Interface
Implements: org.skriptlang.skript.lang.experiment.ExperimentalSyntax

Methods:
- ExperimentData getExperimentData()
- boolean isSatisfiedBy(ExperimentSet experimentSet)

### Class: org.skriptlang.skript.lang.experiment.ExperimentData
Type: Class

Methods:
- ExperimentData$Builder toBuilder()
- boolean checkRequirements(ExperimentSet experiments)
- Set<Experiment> getDisallowed()
- boolean checkRequirementsAndError(ExperimentSet experiments)
- **static** ExperimentData$Builder builder()
- **static** ExperimentData createSingularData(Experiment experiment)
- String constructError()
- Set<Experiment> getRequired()
- String getErrorMessage()

### Class: org.skriptlang.skript.lang.experiment.ExperimentData$Builder
Type: Class

Methods:
- ExperimentData build()
- ExperimentData$Builder errorMessage(String errorMessage)
- ExperimentData$Builder disallowed(Experiment[] disallowed)
- ExperimentData$Builder required(Experiment[] required)

### Class: org.skriptlang.skript.lang.experiment.ExperimentRegistry
Type: Class
Implements: org.skriptlang.skript.lang.experiment.Experimented

Constructors:
- ExperimentRegistry(Skript skript)

Methods:
- boolean isUsing(Script script, Experiment experiment)
- boolean isUsing(Script script, String featureName)
- boolean hasExperiment(Experiment experiment)
- boolean hasExperiment(String featureName)
- void registerAll(SkriptAddon addon, Experiment[] experiments)
- Experiment find(String text)
- void unregister(SkriptAddon addon, Experiment experiment)
- Experiment[] registered()
- void register(SkriptAddon addon, Experiment experiment)
- Experiment register(SkriptAddon addon, String codeName, LifeCycle phase, String[] patterns)

### Class: org.skriptlang.skript.lang.experiment.ExperimentSet
Type: Class
Extends: java.util.LinkedHashSet
Implements: org.skriptlang.skript.lang.script.ScriptData, org.skriptlang.skript.lang.experiment.Experimented

Constructors:
- ExperimentSet(Collection<Experiment> collection)

Methods:
- boolean hasExperiment(Experiment experiment)
- boolean hasExperiment(String featureName)

### Class: org.skriptlang.skript.lang.experiment.LifeCycle
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- STABLE
- EXPERIMENTAL
- DEPRECATED
- MAINSTREAM
- UNKNOWN

Methods:
- boolean warn()
- **static** LifeCycle valueOf(String name)
- **static** LifeCycle[] values()

## Package: org.skriptlang.skript.lang.properties

### Class: org.skriptlang.skript.lang.properties.PropertyBaseSyntax
Type: Interface

Methods:
- String getBadTypesErrorMessage(Expression<*> expr)
- Property<THandler> getProperty()
- **static** PropertyMap<THandler> getPossiblePropertyInfos(Property<THandler> property, Expression<*> expr)
- **static** Expression<*> asProperty(Property<*> property, Expression<*> expr)
- String getPropertyName()

### Class: org.skriptlang.skript.lang.properties.PropertyHandler
Type: Interface

Methods:
- Z init(Expression<*> parentExpression, ParserInstance parser)
- PropertyHandler<TType> newInstance()

### Class: org.skriptlang.skript.lang.properties.PropertyHandler$ConditionPropertyHandler
Type: Interface
Implements: org.skriptlang.skript.lang.properties.PropertyHandler

Methods:
- **static** PropertyHandler$ConditionPropertyHandler<TType> of(Predicate<TType> predicate)
- Z check(T)

### Class: org.skriptlang.skript.lang.properties.PropertyHandler$ContainsHandler
Type: Interface
Implements: org.skriptlang.skript.lang.properties.PropertyHandler

Methods:
- Class<+TElement> elementTypes()
- Z canContain(Class<*> type)
- Z contains(T, char)

### Class: org.skriptlang.skript.lang.properties.PropertyHandler$ExpressionPropertyHandler
Type: Interface
Implements: org.skriptlang.skript.lang.properties.PropertyHandler

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Class<*> possibleReturnTypes()
- **static** PropertyHandler$ExpressionPropertyHandler<TType, TReturnType> of(Function<TType, TReturnType> converter, Class<TReturnType> returnType)
- V change(T propertyHolder, T delta, y mode)
- boolean requiresSourceExprChange()
- TReturnType convert(T)
- Class<TReturnType> returnType()

### Class: org.skriptlang.skript.lang.properties.PropertyHandler$TypedValuePropertyHandler
Type: Interface
Implements: org.skriptlang.skript.lang.properties.PropertyHandler$ExpressionPropertyHandler

Methods:
- TValueType convertChangeValue(Object value) throws UnsupportedOperationException
- TValueType convert(T)
- TConverted convert(T propertyHolder, T expected)

### Class: org.skriptlang.skript.lang.properties.Property
Type: Class
Extends: java.lang.Record

Constructors:
- Property(String name, String description, String since, SkriptAddon provider, Class<+THandler> handler)

Methods:
- Class<+THandler> handler()
- SkriptAddon provider()
- int hashCode()
- boolean equals(Object o)
- **static** Property<THandler> of(String name, String description, String since, SkriptAddon provider, Class<THandlerClass> handler)
- **static** Property<THandler> of(String name, String description, String since, SkriptAddon provider, Class<THandlerClass> handler)
- String name()
- String description()
- String toString()
- **static** void registerDefaultProperties()
- String getDocumentationID()
- String[] since()

### Class: org.skriptlang.skript.lang.properties.Property$PropertyInfo
Type: Class
Extends: java.lang.Record

Constructors:
- Property$PropertyInfo(Property<THandler> property, T handler)

Methods:
- THandler handler()
- int hashCode()
- boolean equals(Object o)
- Property<THandler> property()
- String toString()

### Class: org.skriptlang.skript.lang.properties.PropertyBaseCondition
Type: Abstract Class
Extends: ch.njol.skript.lang.Condition
Implements: org.skriptlang.skript.lang.properties.PropertyBaseSyntax

Methods:
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- String toString(Event event, boolean debug)
- boolean check(Event event)
- **static** V register(Class<Condition> condition, String property, String type)
- **static** V register(Class<Condition> condition, PropertyCondition$PropertyType propertyType, String property, String type)

### Class: org.skriptlang.skript.lang.properties.PropertyBaseExpression
Type: Abstract Class
Extends: ch.njol.skript.lang.util.SimpleExpression
Implements: org.skriptlang.skript.lang.properties.PropertyBaseSyntax

Methods:
- Class<*> acceptChange(Changer$ChangeMode mode)
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Class<*> getReturnType()
- Class<*> possibleReturnTypes()
- boolean isSingle()
- void change(Event event, Object[] delta, Changer$ChangeMode mode)
- String toString(Event event, boolean debug)

### Class: org.skriptlang.skript.lang.properties.PropertyMap
Type: Class
Extends: java.util.HashMap

Methods:
- Property$PropertyInfo<THandler> get(Class<*> actualClass)
- THandler getHandler(Class<*> inputClass)

### Class: org.skriptlang.skript.lang.properties.PropertyRegistry
Type: Class
Implements: org.skriptlang.skript.util.Registry

Constructors:
- PropertyRegistry(Skript skript)

Methods:
- Property<*> get(String name)
- Collection<Property<*>> elements()
- Z unregister(Property<*> property)
- boolean unregister(String name)
- Z isRegistered(Property<*> property)
- boolean isRegistered(String name)
- Z register(Property<*> property)

## Package: org.skriptlang.skript.lang.script

### Class: org.skriptlang.skript.lang.script.Script$Event
Type: Interface
Implements: org.skriptlang.skript.util.event.Event

No public methods found

### Class: org.skriptlang.skript.lang.script.ScriptData
Type: Interface

No public methods found

### Class: org.skriptlang.skript.lang.script.Script
Type: Class
Implements: org.skriptlang.skript.util.Validated, ch.njol.skript.lang.util.common.AnyNamed

Constructors:
- Script(Config config, List<Structure> structures)

Methods:
- EventRegistry<Script$Event> eventRegistry()
- void addData(ScriptData data)
- void suppressWarning(ScriptWarning warning)
- void invalidate()
- void allowWarning(ScriptWarning warning)
- Config getConfig()
- void clearData()
- boolean valid()
- String nameAndPath()
- boolean suppressesWarning(ScriptWarning warning)
- String name()
- V removeData(Class<ScriptData> dataType)
- TType getData(Class<TType> dataType)
- TValue getData(Class<+TValue> dataType, Supplier<TValue> mapper)
- List<Structure> getStructures()

### Class: org.skriptlang.skript.lang.script.ScriptWarning
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- VARIABLE_CONFLICT
- VARIABLE_SAVE
- MISSING_CONJUNCTION
- VARIABLE_STARTS_WITH_EXPRESSION
- DEPRECATED_SYNTAX
- UNREACHABLE_CODE
- CONSTANT_CONDITION

Methods:
- boolean isDeprecated()
- String getWarningName()
- **static** ScriptWarning valueOf(String name)
- **static** ScriptWarning[] values()
- String getDeprecationMessage()
- **static** void printDeprecationWarning(String message)
- String getPattern()

## Package: org.skriptlang.skript.lang.structure

### Class: org.skriptlang.skript.lang.structure.Structure
Type: Abstract Class
Implements: ch.njol.skript.lang.SyntaxElement, ch.njol.skript.lang.Debuggable

Methods:
- EntryContainer getEntryContainer()
- Z init(Expression<*> expressions, int matchedPattern, Kleenean isDelayed, SkriptParser$ParseResult parseResult)
- Z init(Literal<*>, int, SkriptParser$ParseResult, EntryContainer)
- String getSyntaxTypeName()
- boolean load()
- Structure$Priority getPriority()
- void unload()
- String toString()
- **static** Structure parse(String expr, Node node, String defaultError)
- **static** Structure parse(String expr, Node node, String defaultError, Iterator<StructureInfo<Structure>> iterator)
- void postUnload()
- boolean preLoad()
- boolean postLoad()

### Class: org.skriptlang.skript.lang.structure.Structure$Priority
Type: Class
Implements: java.lang.Comparable

Constructors:
- Structure$Priority(int priority)

Methods:
- int getPriority()
- int compareTo(Structure$Priority o)
- int compareTo(Object)

### Class: org.skriptlang.skript.lang.structure.Structure$StructureData
Type: Class
Extends: ch.njol.skript.lang.parser.ParserInstance$Data

Constructors:
- Structure$StructureData(ParserInstance parserInstance)

Methods:
- StructureInfo<Structure> getStructureInfo()

### Class: org.skriptlang.skript.lang.structure.StructureInfo
Type: Class
Extends: ch.njol.skript.lang.SyntaxElementInfo

Constructors:
- StructureInfo(String patterns, Class<TE> c, String originClassPath) throws IllegalArgumentException
- StructureInfo(String patterns, Class<TE> elementClass, String originClassPath, boolean simple) throws IllegalArgumentException
- StructureInfo(String patterns, Class<TE> elementClass, String originClassPath, EntryValidator entryValidator) throws IllegalArgumentException
- StructureInfo(String patterns, Class<TE> elementClass, String originClassPath, EntryValidator entryValidator, DefaultSyntaxInfos$Structure$NodeType nodeType) throws IllegalArgumentException
- StructureInfo(DefaultSyntaxInfos$Structure<TE> entryValidator)

No public methods found

## Package: org.skriptlang.skript.lang.util

### Class: org.skriptlang.skript.lang.util.Cyclical
Type: Interface

Methods:
- TValue getMinimum()
- TValue getMaximum()

### Class: org.skriptlang.skript.lang.util.SkriptQueue
Type: Class
Extends: java.util.LinkedList
Implements: java.util.Deque, java.util.Queue, ch.njol.skript.lang.util.common.AnyAmount, ch.njol.skript.util.Container

Methods:
- boolean add(Object element)
- void add(int index, Object element)
- void addLast(Object element)
- Number amount()
- boolean contains(Object o)
- Object set(int index, Object element)
- Object[] removeRangeSafely(int fromIndex, int toIndex)
- Z addAll(int index, Collection<*> list)
- Iterator<Object> containerIterator()
- Object[] toArray()
- Object removeSafely(int i)
- void addFirst(Object element)

## Package: org.skriptlang.skript.localization

### Class: org.skriptlang.skript.localization.Localizer
Type: Interface
Implements: org.skriptlang.skript.util.ViewProvider

Methods:
- String languageFileDirectory()
- **static** Localizer of(SkriptAddon addon)
- String dataFileDirectory()
- Localizer unmodifiableView()
- Object unmodifiableView()
- String translate(String)
- void setSourceDirectories(String, String)

## Package: org.skriptlang.skript.log.runtime

### Class: org.skriptlang.skript.log.runtime.RuntimeErrorConsumer
Type: Interface

Methods:
- void printFrameOutput(Frame$FrameOutput, Level)
- RuntimeErrorFilter getFilter()
- void printError(RuntimeError)

### Class: org.skriptlang.skript.log.runtime.RuntimeErrorProducer
Type: Interface

Methods:
- ErrorSource getErrorSource()
- RuntimeErrorManager getRuntimeErrorManager()
- void warning(String message)
- void warning(String message, String highlight)
- void error(String message)
- void error(String message, String highlight)

### Class: org.skriptlang.skript.log.runtime.SyntaxRuntimeErrorProducer
Type: Interface
Implements: org.skriptlang.skript.log.runtime.RuntimeErrorProducer

Methods:
- ErrorSource getErrorSource()
- Node getNode()

### Class: org.skriptlang.skript.log.runtime.ErrorSource
Type: Class
Extends: java.lang.Record

Constructors:
- ErrorSource(String syntaxType, String syntaxName, int lineNumber, String lineText, String script)

Methods:
- **static** ErrorSource fromNodeAndElement(Node node, SyntaxElement element)
- int hashCode()
- boolean equals(Object o)
- String lineText()
- String toString()
- ErrorSource$Location location()
- int lineNumber()
- String script()
- String syntaxName()
- String syntaxType()

### Class: org.skriptlang.skript.log.runtime.ErrorSource$Location
Type: Class
Extends: java.lang.Record

Constructors:
- ErrorSource$Location(String script, int lineNumber)

Methods:
- int hashCode()
- boolean equals(Object o)
- String toString()
- int lineNumber()
- String script()

### Class: org.skriptlang.skript.log.runtime.Frame
Type: Class

Constructors:
- Frame(Frame$FrameLimit limits)

Methods:
- boolean add(RuntimeError error)
- void nextFrame()
- Frame$FrameOutput getFrameOutput()

### Class: org.skriptlang.skript.log.runtime.Frame$FrameLimit
Type: Class
Extends: java.lang.Record

Constructors:
- Frame$FrameLimit(int totalLimit, int lineLimit, int lineTimeoutLimit, int timeoutDuration)

Methods:
- int totalLimit()
- int lineLimit()
- int hashCode()
- boolean equals(Object o)
- int timeoutDuration()
- String toString()
- int lineTimeoutLimit()

### Class: org.skriptlang.skript.log.runtime.Frame$FrameOutput
Type: Class
Extends: java.lang.Record

Constructors:
- Frame$FrameOutput(Map<ErrorSource$Location, Integer> totalErrors, Map<ErrorSource$Location, Integer> skippedErrors, Set<ErrorSource$Location> newTimeouts, Frame$FrameLimit frameLimits)

Methods:
- Set<ErrorSource$Location> newTimeouts()
- Map<ErrorSource$Location, Integer> skippedErrors()
- int hashCode()
- Frame$FrameLimit frameLimits()
- Map<ErrorSource$Location, Integer> totalErrors()
- boolean equals(Object o)
- String toString()

### Class: org.skriptlang.skript.log.runtime.RuntimeError
Type: Class
Extends: java.lang.Record

Constructors:
- RuntimeError(Level level, ErrorSource source, String error, String toHighlight)

Methods:
- Level level()
- int hashCode()
- boolean equals(Object o)
- String toHighlight()
- String toString()
- ErrorSource source()
- String error()

### Class: org.skriptlang.skript.log.runtime.RuntimeErrorCatcher
Type: Class
Implements: org.skriptlang.skript.log.runtime.RuntimeErrorConsumer

Methods:
- void printFrameOutput(Frame$FrameOutput output, Level level)
- RuntimeErrorFilter getFilter()
- List<RuntimeError> getCachedErrors()
- void stop()
- RuntimeErrorCatcher start()
- void printError(RuntimeError error)
- RuntimeErrorCatcher clearCachedErrors()

### Class: org.skriptlang.skript.log.runtime.RuntimeErrorFilter
Type: Class

Constructors:
- RuntimeErrorFilter(Frame$FrameLimit errorFrame, Frame$FrameLimit warningFrame)

Methods:
- void setWarningFrameLimits(Frame$FrameLimit limits)
- Frame getWarningFrame()
- boolean test(RuntimeError error)
- Frame getErrorFrame()
- void setErrorFrameLimits(Frame$FrameLimit limits)

### Class: org.skriptlang.skript.log.runtime.RuntimeErrorManager
Type: Class
Implements: java.io.Closeable

Constructors:
- RuntimeErrorManager(long task)

Methods:
- void addConsumer(RuntimeErrorConsumer consumer)
- List<RuntimeErrorConsumer> removeAllConsumers()
- Frame getWarningFrame()
- void addConsumers(RuntimeErrorConsumer[] newConsumers)
- boolean removeConsumer(RuntimeErrorConsumer consumer)
- **static** void refresh()
- **static** RuntimeErrorManager getInstance()
- void error(RuntimeError error)
- void close()
- Frame getErrorFrame()

## Package: org.skriptlang.skript.registration

### Class: org.skriptlang.skript.registration.DefaultSyntaxInfos
Type: Interface

No public methods found

### Class: org.skriptlang.skript.registration.DefaultSyntaxInfos$Expression
Type: Interface
Implements: org.skriptlang.skript.registration.SyntaxInfo

Methods:
- DefaultSyntaxInfos$Expression$Builder<DefaultSyntaxInfos$Expression$Builder<*TE, TR>, TE, TR> toBuilder()
- SyntaxInfo$Builder toBuilder()
- **static** DefaultSyntaxInfos$Expression$Builder<DefaultSyntaxInfos$Expression$Builder<*TE, TR>, TE, TR> builder(Class<TE> expressionClass, Class<TR> returnType)
- Class<TR> returnType()

### Class: org.skriptlang.skript.registration.DefaultSyntaxInfos$Expression$Builder
Type: Interface
Implements: org.skriptlang.skript.registration.SyntaxInfo$Builder

Methods:
- DefaultSyntaxInfos$Expression<TE, TR> build()
- SyntaxInfo build()

### Class: org.skriptlang.skript.registration.DefaultSyntaxInfos$Structure
Type: Interface
Implements: org.skriptlang.skript.registration.SyntaxInfo

Methods:
- DefaultSyntaxInfos$Structure$Builder<DefaultSyntaxInfos$Structure$Builder<*TE>, TE> toBuilder()
- SyntaxInfo$Builder toBuilder()
- EntryValidator entryValidator()
- **static** DefaultSyntaxInfos$Structure$Builder<DefaultSyntaxInfos$Structure$Builder<*TE>, TE> builder(Class<TE> structureClass)
- DefaultSyntaxInfos$Structure$NodeType nodeType()

### Class: org.skriptlang.skript.registration.DefaultSyntaxInfos$Structure$Builder
Type: Interface
Implements: org.skriptlang.skript.registration.SyntaxInfo$Builder

Methods:
- DefaultSyntaxInfos$Structure<TE> build()
- SyntaxInfo build()
- TB entryValidator(EntryValidator)
- TB nodeType(DefaultSyntaxInfos$Structure$NodeType)

### Class: org.skriptlang.skript.registration.SyntaxInfo
Type: Interface
Implements: org.skriptlang.skript.registration.DefaultSyntaxInfos

Methods:
- SyntaxInfo$Builder<SyntaxInfo$Builder<*TE>, TE> toBuilder()
- TE instance()
- Collection<String> patterns()
- SyntaxOrigin origin()
- **static** SyntaxInfo$Builder<SyntaxInfo$Builder<*TE>, TE> builder(Class<TE> type)
- Priority priority()
- Class<TE> type()

### Class: org.skriptlang.skript.registration.SyntaxInfo$Builder
Type: Interface

Methods:
- V applyTo(SyntaxInfo$Builder<**>)
- TB clearPatterns()
- SyntaxInfo<TE> build()
- TB addPatterns(String)
- TB addPatterns(Collection<String>)
- TB supplier(Supplier<TE>)
- TB origin(SyntaxOrigin)
- TB addPattern(String)
- TB priority(Priority)

### Class: org.skriptlang.skript.registration.SyntaxOrigin
Type: Interface

Methods:
- **static** SyntaxOrigin of(SkriptAddon addon)
- String name()

### Class: org.skriptlang.skript.registration.SyntaxRegistry
Type: Interface
Implements: org.skriptlang.skript.util.ViewProvider, org.skriptlang.skript.util.Registry

Methods:
- Collection<SyntaxInfo<*>> elements()
- V unregister(SyntaxInfo<*>)
- V unregister(SyntaxRegistry$Key<TI>, T)
- SyntaxRegistry unmodifiableView()
- Object unmodifiableView()
- V register(SyntaxRegistry$Key<TI>, T)
- Collection<TI> syntaxes(SyntaxRegistry$Key<TI>)
- **static** SyntaxRegistry empty()

### Class: org.skriptlang.skript.registration.SyntaxRegistry$ChildKey
Type: Interface
Implements: org.skriptlang.skript.registration.SyntaxRegistry$Key

Methods:
- SyntaxRegistry$Key<TP> parent()
- **static** SyntaxRegistry$ChildKey<TI, TP> of(SyntaxRegistry$Key<TP> parent, String name)

### Class: org.skriptlang.skript.registration.SyntaxRegistry$Key
Type: Interface

Methods:
- **static** SyntaxRegistry$Key<TI> of(String name)
- String name()

### Class: org.skriptlang.skript.registration.DefaultSyntaxInfos$Structure$NodeType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SIMPLE
- SECTION
- BOTH

Methods:
- **static** DefaultSyntaxInfos$Structure$NodeType valueOf(String name)
- **static** DefaultSyntaxInfos$Structure$NodeType[] values()
- boolean canBeSimple()
- boolean canBeSection()

### Class: org.skriptlang.skript.registration.SyntaxOrigin$AddonOrigin
Type: Class
Implements: org.skriptlang.skript.registration.SyntaxOrigin

Methods:
- SkriptAddon addon()
- String name()

## Package: org.skriptlang.skript.util

### Class: org.skriptlang.skript.util.Executable
Type: Interface

Methods:
- TResult execute(T, char)

### Class: org.skriptlang.skript.util.Priority
Type: Interface
Implements: java.lang.Comparable

Methods:
- **static** Priority before(Priority priority)
- Collection<Priority> before()
- **static** Priority after(Priority priority)
- Collection<Priority> after()
- **static** Priority base()

### Class: org.skriptlang.skript.util.Registry
Type: Interface
Implements: java.lang.Iterable

Methods:
- Iterator<TT> iterator()
- Collection<TT> elements()

### Class: org.skriptlang.skript.util.Validated
Type: Interface

Methods:
- boolean valid()
- **static** Validated validator()
- void invalidate() throws UnsupportedOperationException

### Class: org.skriptlang.skript.util.ViewProvider
Type: Interface

Methods:
- TT unmodifiableView()

### Class: org.skriptlang.skript.util.ClassLoader
Type: Class

Methods:
- **static** V loadClasses(Class<*> source, File jarFile, String basePackage, String subPackages)
- V loadClasses(Class<*> source)
- V loadClasses(Class<*> source, File jarFile)
- V loadClasses(Class<*> source, JarFile jar)
- ClassLoader$Builder toBuilder()
- **static** ClassLoader$Builder builder()
- String toString()

### Class: org.skriptlang.skript.util.ClassLoader$Builder
Type: Class

Methods:
- ClassLoader$Builder filter(Predicate<String> filter)
- ClassLoader$Builder addSubPackage(String subPackage)
- ClassLoader$Builder deep(boolean deep)
- ClassLoader$Builder forEachClass(Consumer<Class<*>> forEachClass)
- ClassLoader build()
- ClassLoader$Builder basePackage(String basePackage)
- ClassLoader$Builder excludeSubPackage(String subPackage)
- ClassLoader$Builder initialize(boolean initialize)
- ClassLoader$Builder excludeSubPackages(String[] subPackages)
- ClassLoader$Builder excludeSubPackages(Collection<String> subPackages)
- ClassLoader$Builder addSubPackages(String[] subPackages)
- ClassLoader$Builder addSubPackages(Collection<String> subPackages)

### Class: org.skriptlang.skript.util.ClassUtils
Type: Class

Methods:
- **static** Z isNormalClass(Class<*> clazz)

## Package: org.skriptlang.skript.util.event

### Class: org.skriptlang.skript.util.event.Event
Type: Interface

No public methods found

### Class: org.skriptlang.skript.util.event.EventRegistry
Type: Class

Methods:
- V unregister(T event)
- Set<TE> events()
- Set<TT> events(Class<TT> type)
- V register(T event)
- V register(Class<TT> eventType, T event)

