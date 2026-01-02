# BedWars1058-API-Complete-Documentation

**Plugin:** BedWars1058
**Package:** com.andrei1058.bedwars.api

## Getting Started

### Plugin Setup

#### Step 1: Add Dependency
Add BedWars1058 as soft dependency in plugin.yml:
softdepend: [BedWars1058]

#### Step 2: Check Plugin Availability
@Override
public void onEnable() {
    // Disable if plugin not found
    if (Bukkit.getPluginManager().getPlugin("BedWars1058") == null) {
        getLogger().severe("BedWars1058 was not found. Disabling...");
        Bukkit.getPluginManager().disablePlugin(this);
        return;
    }
}

#### Step 3: Initialize API
BedWars bedwarsAPI = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider();

### Maven Configuration

#### Repository
<repositories>
    <repository>
        <id>andrei1058-repo</id>
        <url>https://repo.andrei1058.dev/releases/</url>
    </repository>
</repositories>

#### Dependency
<dependency>
    <groupId>com.andrei1058.bedwars</groupId>
    <artifactId>bedwars-api</artifactId>
    <version>VERSION-HERE</version>
</dependency>

### Configuration Standards
Create addon configs at: plugins/BedWars1058/Addons/AddonName/config.yml

## Events System

### Event Usage Examples
@EventHandler
public void onEnemyEnter(EnemyBaseEnterEvent e) {
    // Handle enemy entering base
}

@EventHandler
public void onTeamAssign(TeamAssignEvent e) {
    // Handle team assignment
}

@EventHandler
public void onArenaJoin(PlayerJoinArenaEvent e) {
    // Handle player joining arena
}

## Creating Custom Commands

### Step 1: Extend SubCommand
public class TutorialCommand extends SubCommand {
    
    public TutorialCommand(ParentCommand parent, String name) {
        super(parent, name);
    }
    
    @Override
    public boolean execute(String[] args, CommandSender s) {
        return false;
    }
}

### Step 2: Configure Command Properties
public TutorialCommand(ParentCommand parent, String name) {
    super(parent, name);

    // Set if command is for ops only
    setOpCommand(true); // false for public command

    // Show in /bw command list (only ops see the list)
    showInList(true);

    // Set command description (requires TextComponent)
    setDisplayInfo(Misc.msgHoverClick("description", "hover description",
            "run this on click", ClickEvent.Action.RUN_COMMAND));

    // Set display priority (1-20, lower = higher position)
    setPriority(14);
    
    // Set if command is for arena setup
    setArenaSetupCommand(false);
}

### Step 3: Implement Execute Method
@Override
public boolean execute(String[] args, CommandSender s) {
    // Return false sends "cmd not found" to console
    if (!(s instanceof Player)) return false;
    
    Player p = (Player) s;
    
    if (args[0].equalsIgnoreCase("apple")){
        p.getInventory().addItem(new ItemStack(Material.APPLE));
    }
    
    // Return true = command executed successfully
    // Return false = command not found message
    return true;
}

### Step 4: Register Command
@Override
public void onEnable() {
    if (Bukkit.getPluginManager().isPluginEnabled("BedWars1058")) {
        getLogger().severe("BedWars1058 was not found. Disabling...");
        setEnabled(false);
        return;
    }
    
    // Creates command: /bw tutorial apple
    BedWars bedwarsAPI = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider();
    new TutorialCommand(bedwarsAPI.getBedWarsCommand(), "tutorial");
}

## Custom Ore Generators

### IGenerator Interface Implementation
public class ExampleGenerator implements IGenerator {

    @Override
    public void setHologram(@Nullable Hologram hologram) {
        // Set a hologram above your generator
    }

    @Override
    public @Nullable Hologram getHologram() {
        // Get the hologram above your generator
        return hologram;
    }

    @Override
    public void disable() {
        // Disable generator
        // Called when game ends, at restarting phase
    }

    @Override
    public void upgrade() {
        // Called when arena upgrades generator based on Arena#updateNextEvent()
        // For regular behavior, register as arena generator: arena.getOreGenerators().add(myCustomGenerator)
        // Fire event when upgraded:
        // Bukkit.getPluginManager().callEvent(new GeneratorUpgradeEvent(this));
    }

    @Override
    public void spawnTry() {
        // Attempts to spawn items every second
        // Consider: #getSpawnDelay, #getSpawnAtOnce
        // Handle logistics and spawn behavior, then spawn items with #dropItem(loc)
        // Requires registration as team or arena generator
        // Code example: https://pastebin.com/VAsVH6MM
    }

    @Override
    public void dropItem(Location location) {
        // Track getGeneratorsCfg().getBoolean(ConfigPath.GENERATOR_STACK_ITEMS)
        // If items mustn't stack, give custom name:
        // myItem.setCustomName("custom" + id); // unique id prevents stacking
        // Item name automatically removed on pickup if starts with "custom"
        // Code example: https://pastebin.com/64vKUiCr
    }

    @Override
    public void setSpawnOre(ItemStack spawnOre) {
        // Set generator drop item
    }

    @Override
    public IArena getArena() {
        // Get arena where generator is placed
        return arena;
    }

    @Override
    public void rotate() {
        // Rotate generator preview-item if applicable
        // Requires registration as team or arena generator
    }

    @Override
    public void setSpawnDelay(int spawnDelay) {
        // Change spawn delay between drops
    }

    @Override
    public void setSpawnAtOnce(int spawnAtOnce) {
        // Set amount of items spawned at once
    }

    @Override
    public void enableRotation() {
        // Called by BedWars1058 when game starts
        // Requires registered generator
    }

    @Override
    public void setSpawnLimit(int value) {
        // Set max items at generator before pausing drops
    }

    @Override
    public ITeam getOwnerTeam() {
        // Get owning team for team generators
        // Returns null if not team-owned
        return team;
    }

    @Override
    public ArmorStand getHologramHolder() {
        return null;
    }

    @Override
    public void setNextSpawn(int nextSpawn) {
        // Set seconds till next #dropItems
    }

    @Override
    public void setStackDroppedItems(boolean stackDroppedItems) {
        // Change item-stacking rule
    }

    @Override
    public void setType(GeneratorType type) {
        // Change generator type
    }

    @Override
    public void destroyData() {
        // Destroy generator data when arena restarts
    }

    @Override
    public void setTier(int tier) {
        // Change generator tier
    }
}

### Registering Custom Generators
- For EMERALD/DIAMOND type with no team (regular emerald/diamond generator): Add to IArena#getOreGenerators()
- For team generator (refreshed by BedWars1058): Add to ITeam#getGenerators()
- For custom behavior: Handle manually

## Custom Level System

### Level Interface Implementation
public class CustomLevelsManager implements Level {
    @Override
    public String getLevel(Player p) {
        return PlayerLevel.getLevelByPlayer(p.getUniqueId()).getLevelName();
    }

    @Override
    public int getPlayerLevel(Player p) {
        return PlayerLevel.getLevelByPlayer(p.getUniqueId()).getPlayerLevel();
    }

    @Override
    public String getRequiredXpFormatted(Player p) {
        return PlayerLevel.getLevelByPlayer(p.getUniqueId()).getFormattedRequiredXp();
    }

    @Override
    public String getProgressBar(Player p) {
        return PlayerLevel.getLevelByPlayer(p.getUniqueId()).getProgress();
    }

    @Override
    public int getCurrentXp(Player p) {
        return PlayerLevel.getLevelByPlayer(p.getUniqueId()).getCurrentXp();
    }

    @Override
    public String getCurrentXpFormatted(Player p) {
        return PlayerLevel.getLevelByPlayer(p.getUniqueId()).getFormattedCurrentXp();
    }

    @Override
    public int getRequiredXp(Player p) {
        return PlayerLevel.getLevelByPlayer(p.getUniqueId()).getNextLevelCost();
    }
}

### Registering Custom Level System
Disables BedWars1058 internal level system and registers custom one:
BedWars bedwarsAPI = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider();
bedwarsAPI.setLevelAdapter(new CustomLevelsManager());

## Platform and Version Support

### Custom Platform Support (Since v25.2.1)
Create implementation of: dev.andrei1058.bedwars.platform.common.ServerPlatform

Register as service before BedWars1058 loads:
Bukkit.getServicesManager().register(ServerPlatform.class, myImplementation, myPlugin, ServicePriority.Normal);

## API Components Documentation

### Core Interfaces

#### BedWars (Main API Interface)
- getBedWarsCommand(): ParentCommand - Access main command system
- setLevelAdapter(Level): void - Register custom level system
- getArenaUtil(): IArenaUtil - Arena management utilities
- getVersionSupport(): VersionSupport - Version compatibility layer
- getShopManager(): ShopManager - Shop system access
- getTeamUpgradesUtil(): TeamUpgradesUtil - Team upgrade management
- getGeneratorsCfg(): GeneratorConfig - Generator configuration
- getRestoreAdapter(): RestoreAdapter - World restoration system
- getPlayerStats(): IPlayerStats - Player statistics
- getArena(String): IArena - Get arena by name
- getArena(Player): IArena - Get player's current arena

#### IArena (Arena Management)
- getOreGenerators(): List<IGenerator> - Arena ore generators
- getTeams(): List<ITeam> - Arena teams
- getPlayers(): List<Player> - Players in arena
- getSpectators(): List<Player> - Spectators
- getStatus(): GameState - Current game state
- getDisplayStatus(): String - Display status
- getGroup(): String - Arena group
- getWorldName(): String - Arena world
- updateNextEvent(): void - Progress to next event
- addPlayer(Player, boolean): boolean - Add player to arena
- removePlayer(Player, boolean): void - Remove player
- reJoin(Player): boolean - Handle rejoin

#### ITeam (Team Management)
- getGenerators(): List<IGenerator> - Team generators
- getMembers(): List<Player> - Team members
- getName(): String - Team name
- getColor(): TeamColor - Team color
- getBed(): ITeamAssigner - Bed location
- getArena(): IArena - Parent arena
- isBedDestroyed(): boolean - Bed status
- destroyBed(): void - Destroy team bed
- respawnMember(Player): void - Respawn player

#### IGenerator (Generator System)
- See Custom Ore Generators section for full interface

#### Level (Player Levels)
- See Custom Level System section for full interface

### Event System

#### Arena Events
- ArenaDisableEvent - Arena disabled
- ArenaEnableEvent - Arena enabled  
- ArenaRestartEvent - Arena restarting
- GameEndEvent - Game ended
- GameStateChangeEvent - State changed
- NextEventChangeEvent - Event progression

#### Player Events
- PlayerJoinArenaEvent - Player joins
- PlayerLeaveArenaEvent - Player leaves
- PlayerReJoinEvent - Player rejoins
- PlayerKillEvent - Player killed
- PlayerFirstSpawnEvent - First spawn
- PlayerRespawnEvent - Respawn
- PlayerBedBreakEvent - Bed broken
- PlayerBedBugEvent - Bed bug placed

#### Team Events
- TeamAssignEvent - Team assignment
- TeamEliminatedEvent - Team eliminated
- EnemyBaseEnterEvent - Enemy enters base
- IslandProtectionStartEvent - Protection starts

#### Generator Events
- GeneratorUpgradeEvent - Generator upgraded
- GeneratorDropEvent - Item dropped

#### Shop Events
- ShopOpenEvent - Shop opened
- ShopBuyEvent - Item purchased

### Configuration System
- Uses YamlConfiguration
- Standard location: plugins/BedWars1058/
- Addon configs: plugins/BedWars1058/Addons/AddonName/

### Command System
- ParentCommand - Main command handler
- SubCommand - Command implementation base
- Command properties: priority, permission, visibility, setup mode

### Shop System
- ShopManager - Shop management
- ShopCategory - Shop categories
- ShopContent - Shop items
- QuickBuyElement - Quick buy items

### Arena Setup
- SetupSession - Arena setup session
- SetupType - Setup types
- ConfigPath - Configuration paths

### JavaDoc

# bedwars-plugin-25.2-com-andrei1058-bedwars-api API Reference

**Package Filter:** `com.andrei1058.bedwars.api`

## Package: com.andrei1058.bedwars.api

### Class: com.andrei1058.bedwars.api.BedWars
Type: Interface

Methods:
- boolean isAutoScale()
- BedWars$Configs getConfigs()
- void setLevelAdapter(Level)
- BedWars$ShopUtil getShopUtil()
- BedWars$TeamUpgradesUtil getTeamUpgradesUtil()
- BedWars$AFKUtil getAFKUtil()
- BedWars$IStats getStatsUtil()
- ParentCommand getBedWarsCommand()
- BedWars$ArenaUtil getArenaUtil()
- VersionSupport getVersionSupport()
- ISetupSession getSetupSession(UUID)
- void setRestoreAdapter(RestoreAdapter) throws IllegalAccessError
- String getForCurrentVersion(String, String, String)
- Language getDefaultLang()
- RestoreAdapter getRestoreAdapter()
- Language getPlayerLanguage(Player)
- Level getLevelsUtil()
- String getLobbyWorld()
- File getAddonsPath()
- Party getPartyUtil()
- BedWars$ScoreboardUtil getScoreboardUtil()
- void setPartyAdapter(Party)
- ISidebarService getScoreboardManager()
- boolean isShuttingDown()
- String getLangIso(Player)
- Language getLanguageByIso(String)
- boolean isInSetupSession(UUID)
- ServerType getServerType()

### Class: com.andrei1058.bedwars.api.BedWars$AFKUtil
Type: Interface

Methods:
- void setPlayerAFK(Player, boolean)
- boolean isPlayerAFK(Player)
- int getPlayerTimeAFK(Player)

### Class: com.andrei1058.bedwars.api.BedWars$ArenaUtil
Type: Interface

Methods:
- boolean isPlaying(Player)
- void setArenaByName(IArena)
- int getGamesBeforeRestart()
- boolean canAutoScale(String)
- void removeArenaByPlayer(Player, IArena)
- void loadArena(String, Player)
- void setArenaByPlayer(Player, IArena)
- void removeFromEnableQueue(IArena)
- boolean joinRandomFromGroup(Player, String)
- IArena getArenaByName(String)
- void addToEnableQueue(IArena)
- void sendLobbyCommandItems(Player)
- LinkedList getArenas()
- void removeArenaByName(String)
- IArena getArenaByPlayer(Player)
- IArena getArenaByIdentifier(String)
- boolean isSpectating(Player)
- boolean joinRandomArena(Player)
- void setGamesBeforeRestart(int)
- int getPlayers(String)
- boolean vipJoin(Player)
- LinkedList getEnableQueue()

### Class: com.andrei1058.bedwars.api.BedWars$Configs
Type: Interface

Methods:
- ConfigManager getUpgradesConfig()
- ConfigManager getMainConfig()
- ConfigManager getShopConfig()
- ConfigManager getGeneratorsConfig()
- ConfigManager getSignsConfig()

### Class: com.andrei1058.bedwars.api.BedWars$IStats
Type: Interface

Methods:
- int getPlayerDeaths(UUID)
- int getPlayerWins(UUID)
- int getPlayerGamesPlayed(UUID)
- int getPlayerKills(UUID)
- int getPlayerFinalDeaths(UUID)
- int getPlayerFinalKills(UUID)
- Timestamp getPlayerFirstPlay(UUID)
- int getPlayerBedsDestroyed(UUID)
- int getPlayerLoses(UUID)
- Timestamp getPlayerLastPlay(UUID)
- int getPlayerTotalKills(UUID)

### Class: com.andrei1058.bedwars.api.BedWars$ScoreboardUtil
Type: Interface

Methods:
- void removePlayerScoreboard(Player)
- void givePlayerScoreboard(Player, boolean)

### Class: com.andrei1058.bedwars.api.BedWars$ShopUtil
Type: Interface

Methods:
- void takeMoney(Player, Material, int)
- Material getCurrency(String)
- String getCurrencyMsgPath(IContentTier)
- String getRomanNumber(int)
- int calculateMoney(Player, Material)
- ChatColor getCurrencyColor(Material)

### Class: com.andrei1058.bedwars.api.BedWars$TeamUpgradesUtil
Type: Interface

Methods:
- int getTotalUpgradeTiers(IArena)
- void removeWatchingUpgrades(UUID)
- void setWatchingGUI(Player)
- boolean isWatchingGUI(Player)

## Package: com.andrei1058.bedwars.api.arena

### Class: com.andrei1058.bedwars.api.arena.IArena
Type: Interface

Methods:
- World getWorld()
- List getSigns()
- boolean isAllowMapBreak()
- void addPlayerDeath(Player)
- boolean isReSpawning(UUID)
- boolean isReSpawning(Player)
- ITeam getBedsTeam(Location)
- void sendEmeraldsUpgradeMessages()
- int getYKillHeight()
- List getRegionsList()
- void destroyData()
- GameState getStatus()
- void addPlacedBlock(Block)
- void removePlayer(Player, boolean)
- Location getReSpawnLocation()
- boolean isAllowSpectate()
- boolean addSpectator(Player, boolean, Location)
- boolean addPlayer(Player, boolean)
- ITeam getExTeam(UUID)
- ITeam getWinner()
- int getRenderDistance()
- Instant getStartTime()
- GameStatsHolder getStatsHolder()
- List getPlayers()
- void init(World)
- void removePlacedBlock(Block)
- void refreshSigns()
- void setAllowSpectate(boolean)
- PlayingTask getPlayingTask()
- List getTeams()
- void setGroup(String)
- boolean isSpectator(Player)
- boolean isSpectator(UUID)
- String getDisplayGroup(Player)
- String getDisplayGroup(Language)
- String getDisplayName()
- String getGroup()
- void removeSpectator(Player, boolean)
- int getUpgradeEmeraldsCount()
- void changeStatus(GameState)
- boolean isBlockPlaced(Block)
- NextEvent getNextEvent()
- ITeamAssigner getTeamAssigner()
- int getPlayerDeaths(Player, boolean)
- boolean isPlayer(Player)
- Map getFireballCooldowns()
- boolean isRespawning(Player)
- boolean startReSpawnSession(Player, int)
- void setNextEvent(NextEvent)
- boolean reJoin(Player)
- ConcurrentHashMap getShowTime()
- RestartingTask getRestartingTask()
- String getWorldName()
- void setWorldName(String)
- int getPlayerKills(Player, boolean)
- boolean isProtected(Location)
- List getSpectators()
- List getLeavingPlayers()
- ConcurrentHashMap getRespawnSessions()
- ITeam getTeam(Player)
- ITeam getTeam(String)
- Location getWaitingLocation()
- void updateSpectatorCollideRule(Player, boolean)
- String getArenaName()
- List getOreGenerators()
- void sendSpectatorCommandItems(Player)
- int getUpgradeDiamondsCount()
- String getDisplayStatus(Language)
- void setTeamAssigner(ITeamAssigner)
- void checkWinner()
- int getIslandRadius()
- void updateNextEvent()
- void restart()
- LinkedList getPlaced()
- int getMaxInTeam()
- int getPlayerBedsDestroyed(Player)
- int getMaxPlayers()
- void setStatus(GameState)
- ConfigManager getConfig()
- void disable()
- void setAllowMapBreak(boolean)
- void sendDiamondsUpgradeMessages()
- StartingTask getStartingTask()
- void addSign(Location)
- ITeam getPlayerTeam(String)
- List getNextEvents()
- void addPlayerKill(Player, boolean, Player)
- void abandonGame(Player)
- Location getSpectatorLocation()
- boolean isTeamBed(Location)
- void addPlayerBedDestroyed(Player)
- void sendPreGameCommandItems(Player)

### Class: com.andrei1058.bedwars.api.arena.GameState
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** GameState valueOf(String)
- **static** GameState[] values()

### Class: com.andrei1058.bedwars.api.arena.NextEvent
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** NextEvent valueOf(String)
- **static** NextEvent[] values()
- String getSoundPath()

## Package: com.andrei1058.bedwars.api.arena.generator

### Class: com.andrei1058.bedwars.api.arena.generator.IGenHolo
Type: Interface

Methods:
- void setTierName(String)
- void setTimerName(String)
- String getIso()
- void destroy()
- void updateForPlayer(Player, String)
- void updateForAll()

### Class: com.andrei1058.bedwars.api.arena.generator.IGenerator
Type: Interface

Methods:
- ITeam getBwt()
- void rotate()
- void setSpawnLimit(int)
- Location getLocation()
- int getDelay()
- ArmorStand getHologramHolder()
- void destroyData()
- boolean isStack()
- void dropItem(Location)
- void updateHolograms(Player, String)
- void setAmount(int)
- int getNextSpawn()
- void setDelay(int)
- int getAmount()
- void setOre(ItemStack)
- ItemStack getOre()
- void upgrade()
- void setNextSpawn(int)
- HashMap getLanguageHolograms()
- int getSpawnLimit()
- void setType(GeneratorType)
- void setStack(boolean)
- void spawn()
- GeneratorType getType()
- void disable()
- IArena getArena()
- void enableRotation()

### Class: com.andrei1058.bedwars.api.arena.generator.GeneratorType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** GeneratorType valueOf(String)
- **static** GeneratorType[] values()

## Package: com.andrei1058.bedwars.api.arena.shop

### Class: com.andrei1058.bedwars.api.arena.shop.IBuyItem
Type: Interface

Methods:
- boolean isPermanent()
- void give(Player, IArena)
- boolean isAutoEquip()
- void setPermanent(boolean)
- boolean isUnbreakable()
- void setAutoEquip(boolean)
- void setUnbreakable(boolean)
- void setItemStack(ItemStack)
- ItemStack getItemStack()
- String getUpgradeIdentifier()
- boolean isLoaded()

### Class: com.andrei1058.bedwars.api.arena.shop.ICategoryContent
Type: Interface

Methods:
- boolean isPermanent()
- int getSlot()
- boolean hasQuick(Player)
- String getIdentifier()
- boolean isDowngradable()
- List getContentTiers()
- ItemStack getItemStack(Player)

### Class: com.andrei1058.bedwars.api.arena.shop.IContentTier
Type: Interface

Methods:
- int getValue()
- Material getCurrency()
- List getBuyItemsList()
- void setBuyItemsList(List)
- ItemStack getItemStack()
- void setItemStack(ItemStack)
- void setPrice(int)
- void setCurrency(Material)
- int getPrice()

### Class: com.andrei1058.bedwars.api.arena.shop.ShopHolo
Type: Class

Methods:
- **static** List getShopHolo()
- String getIso()
- **static** void clearForArena(IArena)
- void update()
- void updateForPlayer(Player, String)
- IArena getA()

## Package: com.andrei1058.bedwars.api.arena.stats

### Class: com.andrei1058.bedwars.api.arena.stats.GameStatistic
Type: Interface
Implements: java.lang.Comparable

Methods:
- Object getValue()
- String getDisplayValue(Language)
- int compareTo(GameStatistic)
- int compareTo(Object)

### Class: com.andrei1058.bedwars.api.arena.stats.GameStatisticProvider
Type: Interface

Methods:
- String getVoidReplacement(Language)
- String getIdentifier()
- GameStatistic getDefault()
- Plugin getOwner()

### Class: com.andrei1058.bedwars.api.arena.stats.GameStatsHolder
Type: Interface

Methods:
- Collection getOrderedBy(DefaultStatistics)
- List getOrderedBy(String)
- PlayerGameStats init(Player)
- List getRegistered()
- boolean hasStatistic(String)
- void unregisterPlayer(UUID)
- Optional get(UUID)
- Optional get(Player)
- IArena getArena()
- GameStatisticProvider getProvider(String)
- Collection getTrackedPlayers()
- PlayerGameStats getCreate(Player)
- void register(GameStatisticProvider)

### Class: com.andrei1058.bedwars.api.arena.stats.Incrementable
Type: Interface

Methods:
- void increment()

### Class: com.andrei1058.bedwars.api.arena.stats.PlayerGameStats
Type: Interface

Methods:
- void registerStatistic(String, GameStatistic)
- String getDisplayPlayer()
- UUID getPlayer()
- List getRegistered()
- Optional getStatistic(String)
- Optional getStatistic(DefaultStatistics)
- String getUsername()

### Class: com.andrei1058.bedwars.api.arena.stats.DefaultStatistics
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** DefaultStatistics valueOf(String)
- **static** DefaultStatistics[] values()
- String toString()
- boolean isIncrementable()

## Package: com.andrei1058.bedwars.api.arena.team

### Class: com.andrei1058.bedwars.api.arena.team.ITeam
Type: Interface

Methods:
- List getSwordsEnchantments()
- Vector getKillDropsLocation()
- void setDragons(int)
- void addPlayers(Player[])
- Location getBed()
- String getName()
- void onBedDestroy(Location)
- void addBowEnchantment(Enchantment, int)
- int getDragons()
- void addBaseEffect(PotionEffectType, int, int)
- void reJoin(Player)
- void reJoin(Player, int)
- IGenerator getIronGenerator()
- boolean isBedDestroyed()
- boolean isBed(Location)
- void destroyData()
- IGenerator getGoldGenerator()
- boolean isMember(Player)
- void spawnNPCs()
- List getGenerators()
- List getBaseEffects()
- Location getTeamUpgrades()
- void addTeamEffect(PotionEffectType, int, int)
- void addArmorEnchantment(Enchantment, int)
- void firstSpawn(Player)
- boolean wasMember(UUID)
- ConcurrentHashMap getTeamUpgradeTiers()
- void respawnMember(Player)
- List getBowsEnchantments()
- LinkedList getActiveTraps()
- List getMembersCache()
- void setBedDestroyed(boolean)
- Location getSpawn()
- void setKillDropsLocation(Vector)
- void sendArmor(Player)
- List getArmorsEnchantments()
- Location getShop()
- TeamColor getColor()
- void defaultSword(Player, boolean)
- int getSize()
- String getDisplayName(Language)
- UUID getIdentity()
- IGenerator getEmeraldGenerator()
- void destroyBedHolo(Player)
- IArena getArena()
- void addSwordEnchantment(Enchantment, int)
- void sendDefaultInventory(Player, boolean)
- void setEmeraldGenerator(IGenerator)
- List getMembers()

### Class: com.andrei1058.bedwars.api.arena.team.ITeamAssigner
Type: Interface

Methods:
- void assignTeams(IArena)

### Class: com.andrei1058.bedwars.api.arena.team.TeamEnchant
Type: Interface

Methods:
- int getAmplifier()
- Enchantment getEnchantment()

### Class: com.andrei1058.bedwars.api.arena.team.TeamColor
Type: Enum
Extends: java.lang.Enum

Methods:
- Material glassPaneMaterial()
- **static** byte itemColor(TeamColor)
- **static** ChatColor getChatColor(String)
- **static** ChatColor getChatColor(TeamColor)
- **static** TeamColor valueOf(String)
- **static** Material getGlassPane(TeamColor)
- Material bedMaterial()
- **static** TeamColor[] values()
- **static** Color getColor(TeamColor)
- **static** Material getGlazedTerracotta(TeamColor)
- **static** Material getWool(TeamColor)
- DyeColor dye()
- **static** DyeColor getDyeColor(String)
- ChatColor chat()
- **static** String enName(String)
- **static** String enName(byte)
- Material glassMaterial()
- Material glazedTerracottaMaterial()
- Color bukkitColor()
- byte itemByte()
- **static** Material getGlass(TeamColor)
- Material woolMaterial()
- **static** Material getBedBlock(TeamColor)

## Package: com.andrei1058.bedwars.api.command

### Class: com.andrei1058.bedwars.api.command.ParentCommand
Type: Interface

Methods:
- String getName()
- List getSubCommands()
- void addSubCommand(SubCommand)
- boolean hasSubCommand(String)
- void sendSubCommands(Player)

### Class: com.andrei1058.bedwars.api.command.SubCommand
Type: Abstract Class

Methods:
- ParentCommand getParent()
- List getTabComplete()
- String getSubCommandName()
- void setDisplayInfo(TextComponent)
- boolean isArenaSetupCommand()
- boolean execute(String[], CommandSender)
- boolean isShow()
- void setArenaSetupCommand(boolean)
- void showInList(boolean)
- boolean hasPermission(CommandSender)
- int getPriority()
- boolean canSee(CommandSender, BedWars)
- TextComponent getDisplayInfo()
- void setPermission(String)
- void setPriority(int)

## Package: com.andrei1058.bedwars.api.configuration

### Class: com.andrei1058.bedwars.api.configuration.GameMainOverridable
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: com.andrei1058.bedwars.api.configuration.ConfigManager
Type: Class

Methods:
- void setName(String)
- void saveArenaLoc(String, Location)
- String getName()
- void set(String, Object)
- void save()
- Location getArenaLoc(String)
- double getDouble(String)
- YamlConfiguration getYml()
- String getString(String)
- void saveConfigLoc(String, Location)
- int getInt(String)
- List getArenaLocations(String)
- Location getConfigLoc(String)
- String stringLocationArenaFormat(Location)
- String stringLocationConfigFormat(Location)
- void reload()
- boolean compareArenaLoc(Location, Location)
- List getList(String)
- boolean isFirstTime()
- boolean getBoolean(String)
- Location convertStringToArenaLocation(String)

### Class: com.andrei1058.bedwars.api.configuration.ConfigPath
Type: Class

No public methods found

## Package: com.andrei1058.bedwars.api.entity

### Class: com.andrei1058.bedwars.api.entity.Despawnable
Type: Class

Methods:
- PlayerKillEvent$PlayerKillCause getDeathFinalCause()
- PlayerKillEvent$PlayerKillCause getDeathRegularCause()
- ITeam getTeam()
- boolean equals(Object)
- void destroy()
- void refresh()
- int getDespawn()
- LivingEntity getEntity()

## Package: com.andrei1058.bedwars.api.events.gameplay

### Class: com.andrei1058.bedwars.api.events.gameplay.EggBridgeBuildEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Block getBlock()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- TeamColor getTeamColor()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.gameplay.EggBridgeThrowEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- boolean isCancelled()
- Player getPlayer()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.gameplay.GameEndEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- ITeam getTeamWinner()
- HandlerList getHandlers()
- List getAliveWinners()
- **static** HandlerList getHandlerList()
- IArena getArena()
- List getLosers()
- List getWinners()

### Class: com.andrei1058.bedwars.api.events.gameplay.GameStateChangeEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- IArena getArena()
- GameState getOldState()
- GameState getNewState()

### Class: com.andrei1058.bedwars.api.events.gameplay.GeneratorUpgradeEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- IGenerator getGenerator()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: com.andrei1058.bedwars.api.events.gameplay.NextEventChangeEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- NextEvent getNewEvent()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- IArena getArena()
- NextEvent getOldEvent()

### Class: com.andrei1058.bedwars.api.events.gameplay.TeamAssignEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- boolean isCancelled()
- Player getPlayer()
- HandlerList getHandlers()
- void setCancelled(boolean)
- ITeam getTeam()
- **static** HandlerList getHandlerList()
- IArena getArena()

## Package: com.andrei1058.bedwars.api.events.player

### Class: com.andrei1058.bedwars.api.events.player.PlayerAfkEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- PlayerAfkEvent$AFKType getAfkType()

### Class: com.andrei1058.bedwars.api.events.player.PlayerAfkEvent$AFKType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PlayerAfkEvent$AFKType valueOf(String)
- **static** PlayerAfkEvent$AFKType[] values()

### Class: com.andrei1058.bedwars.api.events.player.PlayerBaseEnterEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- ITeam getTeam()
- **static** HandlerList getHandlerList()

### Class: com.andrei1058.bedwars.api.events.player.PlayerBaseLeaveEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- ITeam getTeam()
- **static** HandlerList getHandlerList()

### Class: com.andrei1058.bedwars.api.events.player.PlayerBedBreakEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- Function getTitle()
- ITeam getVictimTeam()
- void setSubTitle(Function)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Function getSubTitle()
- IArena getArena()
- ITeam getPlayerTeam()
- void setTitle(Function)
- Function getMessage()
- void setMessage(Function)

### Class: com.andrei1058.bedwars.api.events.player.PlayerBedBugSpawnEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ITeam getPlayerTeam()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.player.PlayerDreamDefenderSpawnEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ITeam getPlayerTeam()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.player.PlayerFirstSpawnEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- ITeam getTeam()
- **static** HandlerList getHandlerList()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.player.PlayerGeneratorCollectEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- boolean isCancelled()
- Player getPlayer()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- IArena getArena()
- Item getItem()
- ItemStack getItemStack()

### Class: com.andrei1058.bedwars.api.events.player.PlayerInvisibilityPotionEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- PlayerInvisibilityPotionEvent$Type getType()
- HandlerList getHandlers()
- ITeam getTeam()
- **static** HandlerList getHandlerList()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.player.PlayerInvisibilityPotionEvent$Type
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PlayerInvisibilityPotionEvent$Type valueOf(String)
- **static** PlayerInvisibilityPotionEvent$Type[] values()

### Class: com.andrei1058.bedwars.api.events.player.PlayerJoinArenaEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- boolean isSpectator()
- boolean isCancelled()
- Player getPlayer()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.player.PlayerKillEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Function getMessage()
- Player getKiller()
- void setVictimTeam(ITeam)
- void setMessage(Function)
- PlayerKillEvent$PlayerKillCause getCause()
- ITeam getKillerTeam()
- ITeam getVictimTeam()
- void setPlaySound(boolean)
- boolean playSound()
- Player getVictim()
- IArena getArena()
- void setKillerTeam(ITeam)

### Class: com.andrei1058.bedwars.api.events.player.PlayerKillEvent$PlayerKillCause
Type: Enum
Extends: java.lang.Enum

Methods:
- boolean isPvpLogOut()
- boolean isDespawnable()
- **static** PlayerKillEvent$PlayerKillCause valueOf(String)
- **static** PlayerKillEvent$PlayerKillCause[] values()
- boolean isFinalKill()

### Class: com.andrei1058.bedwars.api.events.player.PlayerLangChangeEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- boolean isCancelled()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- String getNewLang()
- String getOldLang()

### Class: com.andrei1058.bedwars.api.events.player.PlayerLeaveArenaEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getLastDamager()
- boolean isSpectator()
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.player.PlayerLevelUpEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- int getNewXpTarget()
- int getNewLevel()

### Class: com.andrei1058.bedwars.api.events.player.PlayerReJoinEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- boolean isCancelled()
- void setRespawnTime(int)
- Player getPlayer()
- int getRespawnTime()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.player.PlayerReSpawnEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- ITeam getTeam()
- **static** HandlerList getHandlerList()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.player.PlayerXpGainEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- PlayerXpGainEvent$XpSource getXpSource()
- int getAmount()

### Class: com.andrei1058.bedwars.api.events.player.PlayerXpGainEvent$XpSource
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** PlayerXpGainEvent$XpSource valueOf(String)
- **static** PlayerXpGainEvent$XpSource[] values()

## Package: com.andrei1058.bedwars.api.events.server

### Class: com.andrei1058.bedwars.api.events.server.ArenaDisableEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- String getWorldName()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getArenaName()

### Class: com.andrei1058.bedwars.api.events.server.ArenaEnableEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.server.ArenaRestartEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- String getWorldName()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- String getArenaName()

### Class: com.andrei1058.bedwars.api.events.server.SetupSessionCloseEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ISetupSession getSetupSession()

### Class: com.andrei1058.bedwars.api.events.server.SetupSessionStartEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ISetupSession getSetupSession()

## Package: com.andrei1058.bedwars.api.events.shop

### Class: com.andrei1058.bedwars.api.events.shop.ShopBuyEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getBuyer()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- ICategoryContent getCategoryContent()
- IArena getArena()

### Class: com.andrei1058.bedwars.api.events.shop.ShopOpenEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- boolean isCancelled()
- Player getPlayer()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- IArena getArena()

## Package: com.andrei1058.bedwars.api.events.sidebar

### Class: com.andrei1058.bedwars.api.events.sidebar.PlayerSidebarInitEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- ISidebar getSidebar()
- void setSidebar(ISidebar)
- Player getPlayer()
- boolean isCancelled()
- void setCancelled(boolean)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- void setPlayer(Player)

## Package: com.andrei1058.bedwars.api.events.spectator

### Class: com.andrei1058.bedwars.api.events.spectator.SpectatorFirstPersonEnterEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- void setFadeOut(int)
- boolean isCancelled()
- void setFadeIn(int)
- int getFadeOut()
- void setSubTitle(Function)
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- Function getSubTitle()
- void setTitle(Function)
- int getStay()
- void setStay(int)
- Player getTarget()
- Function getTitle()
- IArena getArena()
- int getFadeIn()
- Player getSpectator()

### Class: com.andrei1058.bedwars.api.events.spectator.SpectatorFirstPersonLeaveEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- void setFadeOut(int)
- void setFadeIn(int)
- int getFadeOut()
- void setSubTitle(Function)
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()
- Function getSubTitle()
- void setTitle(Function)
- int getStay()
- void setStay(int)
- Function getTitle()
- IArena getArena()
- int getFadeIn()
- Player getSpectator()

### Class: com.andrei1058.bedwars.api.events.spectator.SpectatorTeleportToPlayerEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- boolean isCancelled()
- Player getTarget()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- IArena getArena()
- Player getSpectator()

## Package: com.andrei1058.bedwars.api.events.team

### Class: com.andrei1058.bedwars.api.events.team.TeamEliminatedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- HandlerList getHandlers()
- ITeam getTeam()
- **static** HandlerList getHandlerList()
- IArena getArena()

## Package: com.andrei1058.bedwars.api.events.upgrades

### Class: com.andrei1058.bedwars.api.events.upgrades.UpgradeBuyEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- void setCancelled(boolean)
- HandlerList getHandlers()
- ITeam getTeam()
- **static** HandlerList getHandlerList()
- IArena getArena()
- TeamUpgrade getTeamUpgrade()

## Package: com.andrei1058.bedwars.api.exceptions

### Class: com.andrei1058.bedwars.api.exceptions.InvalidEffectException
Type: Class
Extends: java.lang.Throwable

No public methods found

### Class: com.andrei1058.bedwars.api.exceptions.InvalidMaterialException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: com.andrei1058.bedwars.api.exceptions.InvalidSoundException
Type: Class
Extends: java.lang.Throwable

No public methods found

## Package: com.andrei1058.bedwars.api.language

### Class: com.andrei1058.bedwars.api.language.Language
Type: Class
Extends: com.andrei1058.bedwars.api.configuration.ConfigManager

Methods:
- **static** void addDefaultMessagesCommandItems(Language)
- **static** String getMsg(Player, String)
- String getIso()
- **static** List getLanguages()
- **static** boolean isLanguageExist(String)
- **static** void addCategoryMessages(YamlConfiguration, String, String, String, List)
- **static** Language getDefaultLanguage()
- **static** void setDefaultLanguage(Language)
- String getLangName()
- **static** List getList(Player, String)
- **static** List getScoreboard(Player, String, String)
- **static** void setupCustomStatsMessages()
- **static** void saveIfNotExists(String, Object)
- **static** void addContentMessages(YamlConfiguration, String, String, String, List)
- **static** Language getPlayerLanguage(Player)
- **static** Language getPlayerLanguage(UUID)
- void setPrefixStatic(String)
- void setupUnSetCategories()
- **static** Language getLang(String)
- List l(String)
- String m(String)
- void relocate(String, String)
- void setPrefix(String)
- **static** String[] getCountDownTitle(Language, int)
- boolean exists(String)
- **static** HashMap getLangByPlayer()
- void addDefaultStatsMsg(YamlConfiguration, String, String, String[])
- **static** boolean setPlayerLanguage(UUID, String)

### Class: com.andrei1058.bedwars.api.language.Messages
Type: Class

No public methods found

## Package: com.andrei1058.bedwars.api.levels

### Class: com.andrei1058.bedwars.api.levels.Level
Type: Interface

Methods:
- String getLevel(Player)
- int getCurrentXp(Player)
- int getPlayerLevel(Player)
- String getProgressBar(Player)
- int getRequiredXp(Player)
- String getRequiredXpFormatted(Player)
- String getCurrentXpFormatted(Player)
- void addXp(Player, int, PlayerXpGainEvent$XpSource)
- void setXp(Player, int)
- void setLevel(Player, int)

## Package: com.andrei1058.bedwars.api.party

### Class: com.andrei1058.bedwars.api.party.Party
Type: Interface

Methods:
- boolean isInternal()
- void promote(Player, Player)
- void addMember(Player, Player)
- void createParty(Player, Player[])
- boolean isOwner(Player)
- boolean hasParty(Player)
- void removeFromParty(Player)
- boolean isMember(Player, Player)
- Player getOwner(Player)
- int partySize(Player)
- void disband(Player)
- void removePlayer(Player, Player)
- List getMembers(Player)

## Package: com.andrei1058.bedwars.api.region

### Class: com.andrei1058.bedwars.api.region.Region
Type: Interface

Methods:
- boolean isProtected()
- boolean isInRegion(Location)

### Class: com.andrei1058.bedwars.api.region.Cuboid
Type: Class
Implements: com.andrei1058.bedwars.api.region.Region

Methods:
- boolean isProtected()
- void setMinY(int)
- int getMaxY()
- void setMaxY(int)
- void setProtect(boolean)
- boolean isInRegion(Location)
- int getMinY()

## Package: com.andrei1058.bedwars.api.server

### Class: com.andrei1058.bedwars.api.server.ISetupSession
Type: Interface

Methods:
- String getWorldName()
- Player getPlayer()
- void teleportPlayer()
- void close()
- ConfigManager getConfig()
- SetupType getSetupType()

### Class: com.andrei1058.bedwars.api.server.RestoreAdapter
Type: Abstract Class

Methods:
- void onRestart(IArena)
- List getWorldsList()
- boolean isWorld(String)
- void onSetupSessionClose(ISetupSession)
- void convertWorlds()
- void deleteWorld(String)
- void onEnable(IArena)
- void onSetupSessionStart(ISetupSession)
- Plugin getOwner()
- void onDisable(IArena)
- void clearItems(World)
- void cloneArena(String, String)
- String getDisplayName()
- void foreachBlockInRegion(Location, Location, Consumer)
- void onLobbyRemoval(IArena)

### Class: com.andrei1058.bedwars.api.server.ServerType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** ServerType valueOf(String)
- **static** ServerType[] values()

### Class: com.andrei1058.bedwars.api.server.SetupType
Type: Enum
Extends: java.lang.Enum

Methods:
- **static** SetupType valueOf(String)
- **static** SetupType[] values()

### Class: com.andrei1058.bedwars.api.server.VersionSupport
Type: Abstract Class

Methods:
- **static** String getName()
- ItemStack setShopUpgradeIdentifier(ItemStack, String)
- boolean isSword(ItemStack)
- ItemStack colourItem(ItemStack, ITeam)
- boolean isBed(Material)
- Material materialNetheriteChestPlate()
- Fireball setFireballDirection(Fireball, Vector)
- boolean itemStackDataCompare(ItemStack, short)
- void spawnDragon(Location, ITeam)
- Material materialGoldenChestPlate()
- void setJoinSignBackground(BlockState, Material)
- void spawnIronGolem(Location, ITeam, double, double, int)
- void colorBed(ITeam)
- void playRedStoneDot(Player)
- boolean isInvisibilityPotion(ItemStack)
- void placeLadder(Block, int, int, int, IArena, int)
- ItemStack getItemInHand(Player)
- double getDamage(ItemStack)
- String getInventoryName(InventoryEvent)
- Material materialCake()
- void playVillagerEffect(Player, Location)
- void spawnSilverfish(Location, ITeam, double, double, int, double)
- void showArmor(Player, Player)
- void hideArmor(Player, Player)
- ConcurrentHashMap getDespawnablesList()
- void setCollide(Player, IArena, boolean)
- void setBlockTeamColor(Block, TeamColor)
- void setUnbreakable(ItemMeta)
- Material materialGoldenLeggings()
- Material materialFireball()
- void playAction(Player, String)
- void minusAmount(Player, ItemStack, int)
- boolean isGlass(Material)
- void clearArrowsFromPlayerBody(Player)
- Effect eggBridge()
- boolean isBow(ItemStack)
- void setJoinSignBackgroundBlockData(BlockState, byte)
- void spigotHidePlayer(Player, Player)
- Material materialPlayerHead()
- boolean isArmor(ItemStack)
- void setSource(TNTPrimed, Player)
- String getCustomData(ItemStack)
- void sendTitle(Player, String, String, int, int, int)
- Material materialCraftingTable()
- boolean isTool(ItemStack)
- boolean isProjectile(ItemStack)
- boolean isBukkitCommandRegistered(String)
- void spawnShop(Location, String, List, IArena)
- Material materialSnowball()
- Material materialElytra()
- void sendPlayerSpawnPackets(Player, IArena)
- Material materialNetheriteHelmet()
- Material materialEnchantingTable()
- void registerTntWhitelist(float, float)
- ItemStack setTag(ItemStack, String, String)
- void registerCommand(String, Command)
- Material woolMaterial()
- boolean isCustomBedWarsItem(ItemStack)
- ItemStack addCustomData(ItemStack, String)
- int getVersion()
- void voidKill(Player)
- Material materialNetheriteLeggings()
- boolean isDespawnable(Entity)
- void placeTowerBlocks(Block, IArena, TeamColor, int, int, int)
- void setEggBridgeEffect(String) throws InvalidEffectException
- void registerEntities()
- String getTag(ItemStack, String)
- String getShopUpgradeIdentifier(ItemStack)
- ItemStack getPlayerHead(Player, ItemStack)
- void hideEntity(Entity, Player)
- String getMainLevel()
- void registerVersionListeners()
- Plugin getPlugin()
- boolean isAxe(ItemStack)
- void spigotShowPlayer(Player, Player)
- boolean isPlayerHead(String, int)
- ItemStack createItemStack(String, int, short)
- byte getCompressedAngle(float)
- Material materialGoldenHelmet()

## Package: com.andrei1058.bedwars.api.sidebar

### Class: com.andrei1058.bedwars.api.sidebar.ISidebar
Type: Interface

Methods:
- SidebarLine normalizeTitle(List)
- void setContent(List, List, IArena)
- Player getPlayer()
- boolean isTabFormattingDisabled()
- boolean registerPersistentPlaceholder(PlaceholderProvider)
- void giveUpdateTabFormat(Player, boolean, Boolean)
- void giveUpdateTabFormat(Player, boolean)
- Sidebar getHandle()
- IArena getArena()
- List normalizeLines(List)

### Class: com.andrei1058.bedwars.api.sidebar.ISidebarService
Type: Interface

Methods:
- void refreshTitles()
- ISidebar getSidebar(Player)
- void refreshTabList()
- void refreshPlaceholders()
- void refreshPlaceholders(IArena)
- void refreshHealth()
- void giveSidebar(Player, IArena, boolean)
- void remove(Player)

## Package: com.andrei1058.bedwars.api.tasks

### Class: com.andrei1058.bedwars.api.tasks.PlayingTask
Type: Interface

Methods:
- void cancel()
- int getGameEndCountdown()
- int getDragonSpawnCountdown()
- int getBedsDestroyCountdown()
- IArena getArena()
- BukkitTask getBukkitTask()
- int getTask()

### Class: com.andrei1058.bedwars.api.tasks.RestartingTask
Type: Interface

Methods:
- void cancel()
- int getRestarting()
- IArena getArena()
- BukkitTask getBukkitTask()
- int getTask()

### Class: com.andrei1058.bedwars.api.tasks.StartingTask
Type: Interface

Methods:
- void cancel()
- void setCountdown(int)
- IArena getArena()
- BukkitTask getBukkitTask()
- int getCountdown()
- int getTask()

## Package: com.andrei1058.bedwars.api.upgrades

### Class: com.andrei1058.bedwars.api.upgrades.EnemyBaseEnterTrap
Type: Interface

Methods:
- String getLoreMsgPath()
- String getNameMsgPath()
- void trigger(ITeam, Player)
- ItemStack getItemStack()

### Class: com.andrei1058.bedwars.api.upgrades.MenuContent
Type: Interface

Methods:
- void onClick(Player, ClickType, ITeam)
- String getName()
- ItemStack getDisplayItem(Player, ITeam)

### Class: com.andrei1058.bedwars.api.upgrades.TeamUpgrade
Type: Interface

Methods:
- String getName()
- int getTierCount()

### Class: com.andrei1058.bedwars.api.upgrades.TrapAction
Type: Interface

Methods:
- void onTrigger(Player, ITeam, ITeam)
- String getName()

### Class: com.andrei1058.bedwars.api.upgrades.UpgradeAction
Type: Interface

Methods:
- void onBuy(ITeam)
- void onBuy(Player, ITeam)

### Class: com.andrei1058.bedwars.api.upgrades.UpgradesIndex
Type: Interface

Methods:
- ImmutableMap getMenuContentBySlot()
- String getName()
- boolean addContent(MenuContent, int)
- int countTiers()
- void open(Player)

## Package: com.andrei1058.bedwars.api.util

### Class: com.andrei1058.bedwars.api.util.BlastProtectionUtil
Type: Class

Methods:
- boolean isProtected(IArena, Location, Block, double)

### Class: com.andrei1058.bedwars.api.util.BlockRay
Type: Class
Implements: java.util.Iterator

Methods:
- Block next()
- Object next()
- boolean hasNext()

### Class: com.andrei1058.bedwars.api.util.FileUtil
Type: Class

Methods:
- **static** void setMainLevel(String, VersionSupport)
- **static** void delete(File)

### Class: com.andrei1058.bedwars.api.util.ZipFileUtil
Type: Class

Methods:
- **static** void zipDirectory(File, File) throws IOException
- **static** void unzipFileIntoDirectory(File, File) throws IOException

