# Slimefun-6719984-Dev-io-github-thebusybiscuit-slimefun4-api API Reference

**Package Filter:** `io.github.thebusybiscuit.slimefun4.api`

## Package: io.github.thebusybiscuit.slimefun4.api

### Class: io.github.thebusybiscuit.slimefun4.api.SlimefunAddon
Type: Interface

Methods:
- String getBugTrackerURL()
- JavaPlugin getJavaPlugin()
- boolean hasDependency(String dependency)
- String getName()
- String getPluginVersion()
- Logger getLogger()
- String getWikiURL()

### Class: io.github.thebusybiscuit.slimefun4.api.ErrorReport
Type: Class

Constructors:
- ErrorReport(T throwable, T addon, ; printer)
- ErrorReport(T throwable, T l, ; item)
- ErrorReport(T throwable, T item)

Methods:
- TT getThrown()
- **static** V tryCatch(Function<Exception, ErrorReport<Exception>> function, Runnable runnable)
- **static** int count()
- File getFile()

### Class: io.github.thebusybiscuit.slimefun4.api.MinecraftVersion
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- MINECRAFT_1_16
- MINECRAFT_1_17
- MINECRAFT_1_18
- MINECRAFT_1_19
- MINECRAFT_1_20
- MINECRAFT_1_20_5
- MINECRAFT_1_21
- UNKNOWN
- UNIT_TEST

Methods:
- boolean isAtLeast(MinecraftVersion version)
- boolean isAtLeast(int majorVersion, int minorVersion)
- String getName()
- **static** MinecraftVersion valueOf(String name)
- **static** MinecraftVersion[] values()
- boolean isVirtual()
- boolean isMinecraftVersion(int minecraftVersion)
- boolean isMinecraftVersion(int minecraftVersion, int patchVersion)
- boolean isBefore(MinecraftVersion version)
- boolean isBefore(int majorVersion, int minorVersion)

### Class: io.github.thebusybiscuit.slimefun4.api.SlimefunBranch
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DEVELOPMENT
- STABLE
- UNOFFICIAL
- UNKNOWN

Methods:
- String getName()
- **static** SlimefunBranch valueOf(String name)
- **static** SlimefunBranch[] values()
- boolean isOfficial()

## Package: io.github.thebusybiscuit.slimefun4.api.events

### Class: io.github.thebusybiscuit.slimefun4.api.events.AncientAltarCraftEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- AncientAltarCraftEvent(ItemStack output, Block block, Player player)

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- ItemStack getItem()
- Block getAltarBlock()
- void setItem(ItemStack output)

### Class: io.github.thebusybiscuit.slimefun4.api.events.AndroidFarmEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- AndroidFarmEvent(Block block, AndroidInstance android, boolean isAdvanced, ItemStack drop)

Methods:
- boolean isCancelled()
- Block getBlock()
- boolean isAdvanced()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- void setDrop(ItemStack drop)
- ItemStack getDrop()
- AndroidInstance getAndroid()

### Class: io.github.thebusybiscuit.slimefun4.api.events.AndroidMineEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- AndroidMineEvent(Block block, AndroidInstance android)

Methods:
- boolean isCancelled()
- Block getBlock()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- AndroidInstance getAndroid()

### Class: io.github.thebusybiscuit.slimefun4.api.events.AsyncAutoEnchanterProcessEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- AsyncAutoEnchanterProcessEvent(ItemStack item, ItemStack enchantedBook, BlockMenu menu)

Methods:
- boolean isCancelled()
- ItemStack getEnchantedBook()
- void setCancelled(boolean cancel)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- BlockMenu getMenu()
- ItemStack getItem()

### Class: io.github.thebusybiscuit.slimefun4.api.events.AsyncMachineOperationFinishEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- AsyncMachineOperationFinishEvent(BlockPosition position, MachineProcessor<TT> machineProcessor, T machineOperation)

Methods:
- MachineProcessor<*> getProcessor()
- BlockPosition getPosition()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- MachineOperation getOperation()

### Class: io.github.thebusybiscuit.slimefun4.api.events.AsyncProfileLoadEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- AsyncProfileLoadEvent(PlayerProfile uniqueId)

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- PlayerProfile getProfile()
- void setProfile(PlayerProfile profile)
- UUID getPlayerUUID()

### Class: io.github.thebusybiscuit.slimefun4.api.events.AutoDisenchantEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- AutoDisenchantEvent(ItemStack item)
- AutoDisenchantEvent(ItemStack item, Block block)

Methods:
- boolean isCancelled()
- Block getBlock()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- ItemStack getItem()

### Class: io.github.thebusybiscuit.slimefun4.api.events.AutoEnchantEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- AutoEnchantEvent(ItemStack item)
- AutoEnchantEvent(ItemStack item, Block block)

Methods:
- boolean isCancelled()
- Block getBlock()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- ItemStack getItem()

### Class: io.github.thebusybiscuit.slimefun4.api.events.BlockPlacerPlaceEvent
Type: Class
Extends: org.bukkit.event.block.BlockEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- BlockPlacerPlaceEvent(Block blockPlacer, ItemStack placedItem, Block cancelled)

Methods:
- void setImmutable()
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- void setItemStack(ItemStack item)
- ItemStack getItemStack()
- Block getBlockPlacer()

### Class: io.github.thebusybiscuit.slimefun4.api.events.ClimbingPickLaunchEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- ClimbingPickLaunchEvent(Player player, Vector velocity, ClimbingPick pick, ItemStack itemStack, Block block)

Methods:
- boolean isCancelled()
- Block getBlock()
- Vector getVelocity()
- ClimbingPick getPick()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- void setVelocity(Vector velocity)
- ItemStack getItemStack()

### Class: io.github.thebusybiscuit.slimefun4.api.events.CoolerFeedPlayerEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- CoolerFeedPlayerEvent(Player player, Cooler cooler, ItemStack coolerItem, ItemStack consumedItem)

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- ItemStack getCoolerItem()
- **static** HandlerList getHandlerList()
- ItemStack getConsumedItem()
- Cooler getCooler()
- void setConsumedItem(ItemStack item)

### Class: io.github.thebusybiscuit.slimefun4.api.events.ExplosiveToolBreakBlocksEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- ExplosiveToolBreakBlocksEvent(Player player, Block mainBlock, List<Block> additionalBlocks, ItemStack itemInHand, ExplosiveTool explosiveTool)

Methods:
- boolean isCancelled()
- ExplosiveTool getExplosiveTool()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- List<Block> getAdditionalBlocks()
- Block getPrimaryBlock()
- ItemStack getItemInHand()

### Class: io.github.thebusybiscuit.slimefun4.api.events.GEOResourceGenerationEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- GEOResourceGenerationEvent(World world, Biome biome, int x, int z, GEOResource resource, int value)

Methods:
- int getValue()
- GEOResource getResource()
- World getWorld()
- int getChunkZ()
- HandlerList getHandlers()
- int getChunkX()
- **static** HandlerList getHandlerList()
- void setValue(int value)
- World$Environment getEnvironment()
- Biome getBiome()

### Class: io.github.thebusybiscuit.slimefun4.api.events.MultiBlockCraftEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- MultiBlockCraftEvent(Player p, MultiBlockMachine machine, ItemStack[] input, ItemStack output)
- MultiBlockCraftEvent(Player p, MultiBlockMachine machine, ItemStack input, ItemStack output)

Methods:
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- ItemStack[] getInput()
- ItemStack setOutput(ItemStack output)
- ItemStack getOutput()
- MultiBlockMachine getMachine()

### Class: io.github.thebusybiscuit.slimefun4.api.events.MultiBlockInteractEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- MultiBlockInteractEvent(Player p, MultiBlock multiBlock, Block clickedBlock, BlockFace clickedFace)

Methods:
- BlockFace getClickedFace()
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- MultiBlock getMultiBlock()
- Block getClickedBlock()

### Class: io.github.thebusybiscuit.slimefun4.api.events.PlayerLanguageChangeEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- PlayerLanguageChangeEvent(Player player, Language from, Language to)

Methods:
- Player getPlayer()
- Language getNewLanguage()
- Language getPreviousLanguage()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: io.github.thebusybiscuit.slimefun4.api.events.PlayerPreResearchEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- PlayerPreResearchEvent(Player player, Research research, SlimefunItem slimefunItem)

Methods:
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean cancelled)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- SlimefunItem getSlimefunItem()
- Research getResearch()

### Class: io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent

Constructors:
- PlayerRightClickEvent(PlayerInteractEvent slimefunItem)

Methods:
- void cancel()
- Event$Result useBlock()
- EquipmentSlot getHand()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Optional<SlimefunItem> getSlimefunItem()
- ItemStack getItem()
- BlockFace getClickedFace()
- Event$Result useItem()
- PlayerInteractEvent getInteractEvent()
- Optional<SlimefunItem> getSlimefunBlock()
- void setUseBlock(Event$Result result)
- void setUseItem(Event$Result result)
- Optional<Block> getClickedBlock()

### Class: io.github.thebusybiscuit.slimefun4.api.events.ReactorExplodeEvent
Type: Class
Extends: org.bukkit.event.Event

Constructors:
- ReactorExplodeEvent(Location location, Reactor reactor)

Methods:
- Location getLocation()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Reactor getReactor()

### Class: io.github.thebusybiscuit.slimefun4.api.events.ResearchUnlockEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- ResearchUnlockEvent(Player player, Research research)

Methods:
- boolean isCancelled()
- Player getPlayer()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- Research getResearch()

### Class: io.github.thebusybiscuit.slimefun4.api.events.SlimefunBlockBreakEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- SlimefunBlockBreakEvent(Player player, ItemStack heldItem, Block blockBroken, SlimefunItem slimefunItem)

Methods:
- boolean isCancelled()
- Player getPlayer()
- HandlerList getHandlers()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- ItemStack getHeldItem()
- SlimefunItem getSlimefunItem()
- Block getBlockBroken()

### Class: io.github.thebusybiscuit.slimefun4.api.events.SlimefunBlockPlaceEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- SlimefunBlockPlaceEvent(Player player, ItemStack placedItem, Block blockPlaced, SlimefunItem slimefunItem)

Methods:
- boolean isCancelled()
- Player getPlayer()
- HandlerList getHandlers()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- SlimefunItem getSlimefunItem()
- Block getBlockPlaced()
- ItemStack getItemStack()

### Class: io.github.thebusybiscuit.slimefun4.api.events.SlimefunGuideOpenEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- SlimefunGuideOpenEvent(Player player, ItemStack guide, SlimefunGuideMode layout)

Methods:
- boolean isCancelled()
- Player getPlayer()
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- SlimefunGuideMode getGuideLayout()
- void setGuideLayout(SlimefunGuideMode layout)
- ItemStack getGuide()

### Class: io.github.thebusybiscuit.slimefun4.api.events.SlimefunItemRegistryFinalizedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: io.github.thebusybiscuit.slimefun4.api.events.SlimefunItemSpawnEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Constructors:
- SlimefunItemSpawnEvent(Player player, Location location, ItemStack itemStack, ItemSpawnReason itemSpawnReason)
- SlimefunItemSpawnEvent(Location location, ItemStack itemStack, ItemSpawnReason itemSpawnReason)

Methods:
- boolean isCancelled()
- Location getLocation()
- Optional<Player> getPlayer()
- void setLocation(Location location)
- HandlerList getHandlers()
- void setCancelled(boolean cancelled)
- **static** HandlerList getHandlerList()
- ItemSpawnReason getItemSpawnReason()
- void setItemStack(ItemStack itemStack)
- ItemStack getItemStack()

### Class: io.github.thebusybiscuit.slimefun4.api.events.TalismanActivateEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- TalismanActivateEvent(Player preventConsumption, Talisman talisman, ItemStack talismanItemStack)

Methods:
- Talisman getTalisman()
- ItemStack getTalismanItem()
- boolean isCancelled()
- void setPreventConsumption(boolean preventConsumption)
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()
- boolean preventsConsumption()

### Class: io.github.thebusybiscuit.slimefun4.api.events.WaypointCreateEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable

Constructors:
- WaypointCreateEvent(Player player, String name, Location location)

Methods:
- boolean isDeathpoint()
- void setName(String name)
- boolean isCancelled()
- Location getLocation()
- String getName()
- void setLocation(Location loc)
- HandlerList getHandlers()
- void setCancelled(boolean cancel)
- **static** HandlerList getHandlerList()

## Package: io.github.thebusybiscuit.slimefun4.api.exceptions

### Class: io.github.thebusybiscuit.slimefun4.api.exceptions.BiomeMapException
Type: Class
Extends: java.lang.Exception

Constructors:
- BiomeMapException(NamespacedKey key, String message)
- BiomeMapException(NamespacedKey key, Throwable cause)

No public methods found

### Class: io.github.thebusybiscuit.slimefun4.api.exceptions.IdConflictException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- IdConflictException(SlimefunItem item1, SlimefunItem item2)

No public methods found

### Class: io.github.thebusybiscuit.slimefun4.api.exceptions.IncompatibleItemHandlerException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- IncompatibleItemHandlerException(String message, SlimefunItem item, ItemHandler handler)

No public methods found

### Class: io.github.thebusybiscuit.slimefun4.api.exceptions.MissingDependencyException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- MissingDependencyException(SlimefunAddon addon, String dependency)

No public methods found

### Class: io.github.thebusybiscuit.slimefun4.api.exceptions.PrematureCodeException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- PrematureCodeException(String message)

No public methods found

### Class: io.github.thebusybiscuit.slimefun4.api.exceptions.TagMisconfigurationException
Type: Class
Extends: java.lang.Exception

Constructors:
- TagMisconfigurationException(NamespacedKey key, String message)
- TagMisconfigurationException(NamespacedKey key, Throwable cause)

No public methods found

### Class: io.github.thebusybiscuit.slimefun4.api.exceptions.UnregisteredItemException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- UnregisteredItemException(SlimefunItem item)

No public methods found

### Class: io.github.thebusybiscuit.slimefun4.api.exceptions.WrongItemStackException
Type: Class
Extends: java.lang.RuntimeException

Constructors:
- WrongItemStackException(String message)

No public methods found

## Package: io.github.thebusybiscuit.slimefun4.api.geo

### Class: io.github.thebusybiscuit.slimefun4.api.geo.GEOResource
Type: Interface
Implements: org.bukkit.Keyed

Methods:
- boolean isObtainableFromGEOMiner()
- String getName()
- String getName(Player p)
- ItemStack getItem()
- int getMaxDeviation()
- int getDefaultSupply(World$Environment, Biome)
- void register()

### Class: io.github.thebusybiscuit.slimefun4.api.geo.ResourceManager
Type: Class

Constructors:
- ResourceManager(Slimefun config)

Methods:
- void setSupplies(GEOResource resource, World world, int x, int z, int value)
- OptionalInt getSupplies(GEOResource resource, World world, int x, int z)
- void scan(Player p, Block block, int page)
- V getSuppliesAsync(GEOResource resource, Chunk chunk, IAsyncReadCallback<Integer> callback)

## Package: io.github.thebusybiscuit.slimefun4.api.gps

### Class: io.github.thebusybiscuit.slimefun4.api.gps.GPSNetwork
Type: Class

Constructors:
- GPSNetwork(Slimefun resourceManager)

Methods:
- Set<Location> getTransmitters(UUID uuid)
- int getNetworkComplexity(UUID uuid)
- void createWaypoint(Player p, Location l)
- void openTransmitterControlPanel(Player p)
- int countTransmitters(UUID uuid)
- TeleportationManager getTeleportationManager()
- void updateTransmitter(Location l, UUID uuid, boolean online)
- ResourceManager getResourceManager()
- void addWaypoint(Player p, String name, Location l)
- void openWaypointControlPanel(Player p)
- ItemStack getIcon(String name, World$Environment environment)

### Class: io.github.thebusybiscuit.slimefun4.api.gps.TeleportationManager
Type: Class

Methods:
- int getTeleportationTime(int complexity, Location source, Location destination)
- void openTeleporterGUI(Player p, UUID ownerUUID, Block b)
- void openTeleporterGUI(Player p, UUID ownerUUID, Block b, int complexity)
- void teleport(UUID uuid, int complexity, Location source, Location destination, boolean resistance)

### Class: io.github.thebusybiscuit.slimefun4.api.gps.Waypoint
Type: Class

Constructors:
- Waypoint(PlayerProfile profile, String id, Location loc, String name)
- Waypoint(UUID ownerId, String id, Location location, String name)

Methods:
- boolean isDeathpoint()
- Location getLocation()
- String getName()
- int hashCode()
- boolean equals(Object obj)
- UUID getOwnerId()
- String getId()
- PlayerProfile getOwner()
- ItemStack getIcon()

## Package: io.github.thebusybiscuit.slimefun4.api.items

### Class: io.github.thebusybiscuit.slimefun4.api.items.ItemHandler
Type: Interface

Methods:
- Class<ItemHandler> getIdentifier()
- Optional<IncompatibleItemHandlerException> validate(SlimefunItem item)

### Class: io.github.thebusybiscuit.slimefun4.api.items.HashedArmorpiece
Type: Class

Methods:
- Optional<SlimefunArmorPiece> getItem()
- void update(ItemStack stack, SlimefunItem item)
- String toString()
- boolean hasDiverged(ItemStack stack)

### Class: io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
Type: Class
Implements: org.bukkit.Keyed

Constructors:
- ItemGroup(NamespacedKey key, ItemStack item)
- ItemGroup(NamespacedKey key, ItemStack item, int tier)

Methods:
- void add(SlimefunItem item)
- NamespacedKey getKey()
- void setCrossAddonItemGroup(boolean crossAddonItemGroup)
- boolean isAccessible(Player p)
- ItemStack getItem(Player p)
- SlimefunAddon getAddon()
- boolean isVisible(Player p)
- String getUnlocalizedName()
- void remove(SlimefunItem item)
- boolean isHidden(Player p)
- List<SlimefunItem> getItems()
- boolean contains(SlimefunItem item)
- void setTier(int tier)
- boolean isCrossAddonItemGroup()
- String getDisplayName(Player p)
- int hashCode()
- boolean equals(Object obj)
- String toString()
- boolean isRegistered()
- int getTier()
- void register(SlimefunAddon addon)

### Class: io.github.thebusybiscuit.slimefun4.api.items.ItemSetting
Type: Class

Constructors:
- ItemSetting(SlimefunItem item, String key, T defaultValue)

Methods:
- TT getValue()
- String getKey()
- void reload()
- Z validateInput(T input)
- int hashCode()
- boolean equals(Object obj)
- V update(T newValue)
- String toString()
- Z isType(Class<*> c)
- TT getDefaultValue()

### Class: io.github.thebusybiscuit.slimefun4.api.items.ItemSpawnReason
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ANCIENT_PEDESTAL_PLACE_ITEM
- BROKEN_SPAWNER_DROP
- CARGO_OVERFLOW
- MULTIBLOCK_MACHINE_OVERFLOW
- CHRISTMAS_PRESENT_OPENED
- EASTER_EGG_OPENED
- GOLD_PAN_USE
- MISC

Methods:
- **static** ItemSpawnReason valueOf(String name)
- **static** ItemSpawnReason[] values()

### Class: io.github.thebusybiscuit.slimefun4.api.items.ItemState
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UNREGISTERED
- ENABLED
- DISABLED
- VANILLA_FALLBACK

Methods:
- **static** ItemState valueOf(String name)
- **static** ItemState[] values()

### Class: io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem
Type: Class
Implements: io.github.thebusybiscuit.slimefun4.core.attributes.Placeable

Constructors:
- SlimefunItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe)
- SlimefunItem(ItemGroup itemGroup, SlimefunItemStack itemStackTemplate, RecipeType recipeType, ItemStack[] recipe, ItemStack recipeOutput)

Methods:
- void setRecipe(ItemStack[] recipe)
- void sendDeprecationWarning(Player player)
- Z callItemHandler(Class<TT> c, Consumer<TT> callable)
- ItemStack getItem()
- ItemGroup getItemGroup()
- boolean isTicking()
- RecipeType getRecipeType()
- void enable()
- void setHidden(boolean hidden)
- boolean isEnchantable()
- void setRecipeType(RecipeType type)
- boolean isDisabled()
- **static** SlimefunItem getByItem(ItemStack item)
- void preRegister()
- void info(String message)
- void addOfficialWikipage(String page)
- void setItemGroup(ItemGroup itemGroup)
- Collection<ItemHandler> getHandlers()
- Set<ItemSetting<*>> getItemSettings()
- void addItemHandler(ItemHandler[] handlers)
- SlimefunItem setUseableInWorkbench(boolean useable)
- SlimefunAddon getAddon()
- void addWikiPage(String page)
- void warn(String message)
- String getItemName()
- Optional<String> getWikipage()
- **static** SlimefunItem getById(String id)
- void setResearch(Research research)
- ItemStack getRecipeOutput()
- boolean loadDataByDefault()
- boolean isDisenchantable()
- boolean isUseableInWorkbench()
- boolean hasResearch()
- String getId()
- void error(String message, Throwable throwable)
- V addItemSetting(ItemSetting<*> settings)
- **static** Optional<SlimefunItem> getOptionalById(String id)
- void load()
- int hashCode()
- ItemStack[] getRecipe()
- Optional<ItemSetting<TT>> getItemSetting(String key, Class<TT> c)
- BlockTicker getBlockTicker()
- boolean isDisabledIn(World world)
- void setRecipeOutput(ItemStack output)
- boolean canUse(Player p, boolean sendMessage)
- boolean isHidden()
- ItemState getState()
- void disable()
- boolean equals(Object obj)
- boolean isItem(ItemStack item)
- Collection<ItemStack> getDrops()
- Collection<ItemStack> getDrops(Player p)
- String toString()
- void postRegister()
- Research getResearch()
- **static** Optional<SlimefunItem> getOptionalByItem(ItemStack item)
- void register(SlimefunAddon addon)

### Class: io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
Type: Class
Extends: org.bukkit.inventory.ItemStack

Constructors:
- SlimefunItemStack(String id, ItemStack locked)
- SlimefunItemStack(String id, ItemStack item, Consumer<ItemMeta> consumer)
- SlimefunItemStack(String id, Material type, Consumer<ItemMeta> consumer)
- SlimefunItemStack(String id, Material type, String name, Consumer<ItemMeta> consumer)
- SlimefunItemStack(String id, ItemStack item, String name, String[] lore)
- SlimefunItemStack(String id, Material type, String name, String[] lore)
- SlimefunItemStack(String id, Material type, Color color, String name, String[] lore)
- SlimefunItemStack(String id, Color color, PotionEffect effect, String name, String[] lore)
- SlimefunItemStack(SlimefunItemStack item, int amount)
- SlimefunItemStack(String id, String texture, String name, String[] lore)
- SlimefunItemStack(String id, HeadTexture head, String name, String[] lore)
- SlimefunItemStack(String id, String texture, String name, Consumer<ItemMeta> consumer)
- SlimefunItemStack(String id, String texture, Consumer<ItemMeta> consumer)

Methods:
- boolean setItemMeta(ItemMeta meta)
- ItemMetaSnapshot getItemMetaSnapshot()
- SlimefunItem getItem()
- TT getItem(Class<TT> type)
- void setType(Material type)
- Optional<String> getSkullTexture()
- String getItemId()
- String getDisplayName()
- int hashCode()
- boolean equals(Object obj)
- ItemStack clone()
- Object clone() throws CloneNotSupportedException
- void lock()
- String toString()
- void setAmount(int amount)

## Package: io.github.thebusybiscuit.slimefun4.api.items.groups

### Class: io.github.thebusybiscuit.slimefun4.api.items.groups.FlexItemGroup
Type: Abstract Class
Extends: io.github.thebusybiscuit.slimefun4.api.items.ItemGroup

Methods:
- void add(SlimefunItem item)
- List<SlimefunItem> getItems()
- boolean contains(SlimefunItem item)
- boolean isVisible(Player p)
- boolean isVisible(Player, PlayerProfile, SlimefunGuideMode)
- void remove(SlimefunItem item)
- void open(Player, PlayerProfile, SlimefunGuideMode)

### Class: io.github.thebusybiscuit.slimefun4.api.items.groups.LockedItemGroup
Type: Class
Extends: io.github.thebusybiscuit.slimefun4.api.items.ItemGroup

Constructors:
- LockedItemGroup(NamespacedKey key, ItemStack item, NamespacedKey[] parents)
- LockedItemGroup(NamespacedKey key, ItemStack item, int parents, NamespacedKey[] keys)

Methods:
- Set<ItemGroup> getParents()
- void removeParent(ItemGroup group)
- void addParent(ItemGroup group)
- boolean hasUnlocked(Player p, PlayerProfile profile)
- void register(SlimefunAddon addon)

### Class: io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup
Type: Class
Extends: io.github.thebusybiscuit.slimefun4.api.items.groups.FlexItemGroup

Constructors:
- NestedItemGroup(NamespacedKey key, ItemStack item)
- NestedItemGroup(NamespacedKey key, ItemStack item, int subGroups)

Methods:
- void addSubGroup(SubItemGroup group)
- boolean isVisible(Player p, PlayerProfile profile, SlimefunGuideMode mode)
- void removeSubGroup(SubItemGroup group)
- void open(Player p, PlayerProfile profile, SlimefunGuideMode mode)

### Class: io.github.thebusybiscuit.slimefun4.api.items.groups.SeasonalItemGroup
Type: Class
Extends: io.github.thebusybiscuit.slimefun4.api.items.ItemGroup

Constructors:
- SeasonalItemGroup(NamespacedKey key, Month month, int tier, ItemStack item)

Methods:
- boolean isAccessible(Player p)
- Month getMonth()

### Class: io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup
Type: Class
Extends: io.github.thebusybiscuit.slimefun4.api.items.ItemGroup

Constructors:
- SubItemGroup(NamespacedKey key, NestedItemGroup parent, ItemStack item)
- SubItemGroup(NamespacedKey key, NestedItemGroup parentItemGroup, ItemStack item, int tier)

Methods:
- NestedItemGroup getParent()
- boolean isAccessible(Player p)
- boolean isVisibleInNested(Player p)
- boolean isVisible(Player p)
- void register(SlimefunAddon addon)

## Package: io.github.thebusybiscuit.slimefun4.api.items.settings

### Class: io.github.thebusybiscuit.slimefun4.api.items.settings.DoubleRangeSetting
Type: Class
Extends: io.github.thebusybiscuit.slimefun4.api.items.ItemSetting

Constructors:
- DoubleRangeSetting(SlimefunItem item, String key, double min, double defaultValue, double max)

Methods:
- boolean validateInput(Double input)
- boolean validateInput(Object)
- double getMinimum()
- double getMaximum()

### Class: io.github.thebusybiscuit.slimefun4.api.items.settings.EnumSetting
Type: Class
Extends: io.github.thebusybiscuit.slimefun4.api.items.ItemSetting

Constructors:
- EnumSetting(SlimefunItem item, String key, Class<TT> enumClass, T defaultValue)

Methods:
- TT getAsEnumConstant()
- boolean validateInput(String input)
- boolean validateInput(Object)
- [TT getAllowedValues()

### Class: io.github.thebusybiscuit.slimefun4.api.items.settings.IntRangeSetting
Type: Class
Extends: io.github.thebusybiscuit.slimefun4.api.items.ItemSetting

Constructors:
- IntRangeSetting(SlimefunItem item, String key, int min, int defaultValue, int max)

Methods:
- boolean validateInput(Integer input)
- boolean validateInput(Object)
- int getMinimum()
- int getMaximum()

### Class: io.github.thebusybiscuit.slimefun4.api.items.settings.MaterialTagSetting
Type: Class
Extends: io.github.thebusybiscuit.slimefun4.api.items.ItemSetting

Constructors:
- MaterialTagSetting(SlimefunItem item, String key, Tag<Material> defaultTag)

Methods:
- Z validateInput(List<String> input)
- boolean validateInput(Object)
- Tag<Material> getDefaultTag()

## Package: io.github.thebusybiscuit.slimefun4.api.network

### Class: io.github.thebusybiscuit.slimefun4.api.network.Network
Type: Abstract Class

Methods:
- boolean connectsTo(Location l)
- int getSize()
- void onClassificationChange(Location, NetworkComponent, NetworkComponent)
- void markDirty(Location l)
- NetworkComponent classifyLocation(Location)
- int getRange()
- void display()
- void tick()
- Location getRegulator()

### Class: io.github.thebusybiscuit.slimefun4.api.network.NetworkComponent
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- CONNECTOR
- REGULATOR
- TERMINUS

Methods:
- **static** NetworkComponent valueOf(String name)
- **static** NetworkComponent[] values()

## Package: io.github.thebusybiscuit.slimefun4.api.player

### Class: io.github.thebusybiscuit.slimefun4.api.player.PlayerBackpack
Type: Class
Extends: city.norain.slimefun4.holder.SlimefunInventoryHolder

Constructors:
- PlayerBackpack(OfflinePlayer owner, UUID uuid, String name, int id, int size, ItemStack[] contents)

Methods:
- void setName(String name)
- **static** Optional<String> getOwnerUUID(ItemMeta meta)
- String getName()
- **static** void setItemDisplayInfo(ItemStack item, PlayerBackpack bp)
- **static** Optional<String> getBackpackUUID(ItemMeta meta)
- int getId()
- **static** boolean isOwnerOnline(ItemMeta meta)
- **static** void bindItem(ItemStack item, PlayerBackpack bp)
- boolean isInvalid()
- OfflinePlayer getOwner()
- **static** V getAsync(ItemStack item, Consumer<PlayerBackpack> callback, boolean runCbOnMainThread)
- **static** OptionalInt getBackpackID(ItemMeta meta)
- UUID getUniqueId()
- int getSize()
- void setSize(int size)
- void markInvalid()
- Inventory getInventory()
- **static** void setItemPdc(ItemStack item, String bpUuid, String ownerUuid)
- void open(Player p)

### Class: io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile
Type: Class

Constructors:
- PlayerProfile(OfflinePlayer p, int backpackNum)
- PlayerProfile(OfflinePlayer owner, int backpackNum, Set<Research> researches)

Methods:
- **static** boolean request(OfflinePlayer p)
- Player getPlayer()
- void markDirty()
- int nextBackpackNum()
- void save()
- OfflinePlayer getOwner()
- List<Waypoint> getWaypoints()
- **static** Iterator<PlayerProfile> iterator()
- void removeWaypoint(Waypoint waypoint)
- String getTitle()
- Set<Research> getResearches()
- boolean isDirty()
- UUID getUUID()
- int hashCode()
- **static** Optional<PlayerProfile> find(OfflinePlayer p)
- **static** Z get(OfflinePlayer p, Consumer<PlayerProfile> callback)
- void sendStats(CommandSender sender)
- boolean hasUnlocked(Research research)
- boolean hasUnlockedEverything()
- HashedArmorpiece[] getArmor()
- boolean hasFullProtectionAgainst(ProtectionType type)
- void addWaypoint(Waypoint waypoint)
- void setResearched(Research research, boolean unlock)
- void saveAsync()
- **static** Z fromUUID(UUID uuid, Consumer<PlayerProfile> callback)
- GuideHistory getGuideHistory()
- void setBackpackCount(int count)
- void markForDeletion()
- boolean equals(Object obj)
- boolean isMarkedForDeletion()
- int getBackpackCount()
- String toString()

### Class: io.github.thebusybiscuit.slimefun4.api.player.StatusEffect
Type: Class
Implements: org.bukkit.Keyed

Constructors:
- StatusEffect(NamespacedKey key)

Methods:
- void add(Player p, int duration, TimeUnit unit)
- void add(Player p, int level, int duration, TimeUnit unit)
- OptionalInt getLevel(Player p)
- NamespacedKey getKey()
- void clear(Player p)
- boolean isPresent(Player p)
- void addPermanent(Player p, int level)

## Package: io.github.thebusybiscuit.slimefun4.api.recipes

### Class: io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
Type: Class
Implements: org.bukkit.Keyed

Constructors:
- RecipeType(ItemStack item, String machine)
- RecipeType(NamespacedKey key, SlimefunItemStack slimefunItem, String[] lore)
- RecipeType(NamespacedKey key, ItemStack machine, BiConsumer<ItemStack, ItemStack> registerConsumer, String item)
- RecipeType(NamespacedKey key, ItemStack machine, BiConsumer<ItemStack, ItemStack> registerConsumer, BiConsumer<ItemStack, ItemStack> unregisterConsumer, String item)
- RecipeType(NamespacedKey key, ItemStack item)
- RecipeType(MinecraftRecipe<*> item)

Methods:
- **static** List<ItemStack> getRecipeInputList(MultiBlockMachine machine)
- NamespacedKey getKey()
- **static** List<ItemStack> getRecipeInputs(MultiBlockMachine machine)
- **static** ItemStack getRecipeOutput(MultiBlockMachine machine, ItemStack input)
- int hashCode()
- **static** ItemStack getRecipeOutputList(MultiBlockMachine machine, ItemStack[] input)
- boolean equals(Object obj)
- void unregister(ItemStack[] recipe, ItemStack result)
- ItemStack getItem(Player p)
- SlimefunItem getMachine()
- ItemStack toItem()
- void register(ItemStack[] recipe, ItemStack result)

## Package: io.github.thebusybiscuit.slimefun4.api.researches

### Class: io.github.thebusybiscuit.slimefun4.api.researches.PlayerResearchTask
Type: Class
Implements: java.util.function.Consumer

Methods:
- void accept(PlayerProfile profile)
- void accept(Object)

### Class: io.github.thebusybiscuit.slimefun4.api.researches.Research
Type: Class
Implements: org.bukkit.Keyed

Constructors:
- Research(NamespacedKey key, int id, String name, int levelCost, double currencyCost)
- Research(NamespacedKey key, int id, String name, int levelCost)

Methods:
- NamespacedKey getKey()
- double getCurrencyCost()
- void unlock(Player p, boolean instant)
- V unlock(Player p, boolean isInstant, Consumer<Player> callback)
- String getName(Player p)
- **static** Optional<Research> getResearchByID(Integer oldID)
- void setCost(int cost)
- int getID()
- List<SlimefunItem> getAffectedItems()
- String getUnlocalizedName()
- void setLevelCost(int levelCost)
- boolean hasEnabledItems()
- void disable()
- int getLevelCost()
- boolean canUnlock(Player p)
- boolean isEnabled()
- String toString()
- void unlockFromGuide(SlimefunGuideImplementation guide, Player player, PlayerProfile profile, SlimefunItem sfItem, ItemGroup itemGroup, int page)
- int getCost()
- **static** Optional<Research> getResearch(NamespacedKey key)
- void setCurrencyCost(double currencyCost)
- void register()
- void addItems(SlimefunItem[] items)
- Research addItems(ItemStack[] items)

