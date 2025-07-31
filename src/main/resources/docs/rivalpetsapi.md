# RivalPetsAPI API Reference

## Package: me.rivaldev.rivalpets

### Class: me.rivaldev.rivalpets.ModelEngineHook
Type: Interface

Methods:
- void spawn(Player, String, ArmorStand)

### Class: me.rivaldev.rivalpets.ModelEngineV3Hook
Type: Class
Implements: me.rivaldev.rivalpets.ModelEngineHook

Methods:
- void spawn(Player, String, ArmorStand)

### Class: me.rivaldev.rivalpets.ModelEngineV5Hook
Type: Class
Implements: me.rivaldev.rivalpets.ModelEngineHook

Methods:
- void spawn(Player, String, ArmorStand)

### Class: me.rivaldev.rivalpets.RivalPets
Type: Class
Extends: org.bukkit.plugin.java.JavaPlugin

Methods:
- ActivePetsChest getActivePetsChest()
- double getPlayerOffset()
- void setupPlaceholderAPI()
- void onReload()
- void teleport(Location, Entity)
- void onEnable()
- void setupModelEngine()
- void onDisable()
- void generateFiles()
- boolean isBuffDisabledInWorld(String, String)
- void setupProtocolLib()
- String timeAsString(long)
- void registerListeners()
- BuffManager getBuffManager()
- PluginType getType()
- List getBlacklistedWorlds(String)
- void registerCommand()
- RivalPets getInstance()
- PetsChest getPetChest()
- String getFormattedDouble(double)

## Package: me.rivaldev.rivalpets.api

### Class: me.rivaldev.rivalpets.api.RivalPetsAPI
Type: Class

Methods:
- RPet getRPetByItem(ItemStack)
- int getPetStorage(Player)
- boolean isPetItem(ItemStack)
- long LevelItemAmount(ItemStack)
- boolean isOwnerScroll(ItemStack)
- String getCandyName(ItemStack)
- long getUpgradeLevel(Player, String)
- UUID getPetUUID(ItemStack)
- ActivatedPet activatePet(UUID, RPet, UUID)
- boolean hasBuff(Player, String)
- boolean isVanished(Player)
- boolean isRarityItem(ItemStack)
- String getPetBoxName(ItemStack)
- int getOnlyPetSlots(Player)
- String getBuffPercentage(Player, String)
- int getPetSlots(Player)
- boolean isPetBox(ItemStack)
- boolean isCandyItem(ItemStack)
- RivalPetsAPI getApi()
- boolean isLevelItem(ItemStack)
- int getPetSlot(Player, UUID)
- StoredPet getStoredPetByItem(ItemStack)
- RPet getRPetByString(String)
- double getBuffBoost(Player, String)
- void addExperience(Player, String)
- void registerBuff(PetBuffRegister)
- void registerBuff(PetBuffRegister, String)
- void registerUpgrade(PetUpgradeRegister, String, String)

## Package: me.rivaldev.rivalpets.api.events

### Class: me.rivaldev.rivalpets.api.events.RivalPetsCandyApplyEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- String getCandy()
- Player getPlayer()
- double getXp()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setAmount(int)
- void setXp(double)
- int getAmount()

### Class: me.rivaldev.rivalpets.api.events.RivalPetsCandyReceiveEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- String getCandy()
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setAmount(long)
- long getAmount()

### Class: me.rivaldev.rivalpets.api.events.RivalPetsLevelUpEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- long getLevel()
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.rivaldev.rivalpets.api.events.RivalPetsPetActivatedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- String getPet()
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.rivaldev.rivalpets.api.events.RivalPetsPetBoxOpenEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- String getType()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- long getAmount()

### Class: me.rivaldev.rivalpets.api.events.RivalPetsPetDeactivatedEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- String getPet()
- Player getPlayer()
- HandlerList getHandlers()
- HandlerList getHandlerList()

### Class: me.rivaldev.rivalpets.api.events.RivalPetsUpgradeEvent
Type: Class
Extends: org.bukkit.event.Event

Methods:
- Player getPlayer()
- String getUpgrade()
- HandlerList getHandlers()
- HandlerList getHandlerList()
- void setCost(double)
- double getCost()
- long getLevels()
- boolean isSendMessage()
- void setSendMessage(boolean)

### Class: me.rivaldev.rivalpets.api.events.RivalPetsXPGainEvent
Type: Class
Extends: org.bukkit.event.Event
Implements: org.bukkit.event.Cancellable

Methods:
- boolean isCancelled()
- Player getPlayer()
- void setBoost(double)
- void setCancelled(boolean)
- HandlerList getHandlers()
- HandlerList getHandlerList()
- double getBoost()

## Package: me.rivaldev.rivalpets.buffs

### Class: me.rivaldev.rivalpets.buffs.Buff
Type: Class

Methods:
- void setName(String)
- double getDefaultMultiplier()
- String getName()
- void setDefaultMultiplier(double)
- void setExpPercentageIncrease(double)
- double getExpPerLevel()
- void setPercentageIncrease(double)
- double getPercentageIncrease()
- double getExpPercentageIncrease()
- void setExpPerLevel(double)

### Class: me.rivaldev.rivalpets.buffs.BuffManager
Type: Class

Methods:
- Map getUpgradeTypes()
- Map getBuffTypes()
- void registerBuff(PetBuffRegister)
- void registerBuff(PetBuffRegister, String)
- void registerUpgrade(PetUpgradeRegister)
- void registerBuffNoEvent(PetBuffRegister, String)

### Class: me.rivaldev.rivalpets.buffs.EnhancementHandler
Type: Class

Methods:
- double getBoostValueFromBuff(String)
- EnhancementInfo getEnhancementByName(String)
- double getBuffBoostForEnhancement(String, String)
- Map loadEnhancements()

### Class: me.rivaldev.rivalpets.buffs.EnhancementInfo
Type: Class

Methods:
- ConfigurationSection getGuiDisplay()
- int getSlot()
- String getKey()
- List getBuffs()
- double getChance()
- String getPlaceholderDisplay()

### Class: me.rivaldev.rivalpets.buffs.PetBuffRegister
Type: Abstract Class
Implements: org.bukkit.event.Listener

Methods:
- void init()
- void addExperienceMulti(ActivatedPet, long)
- String getBuffName()
- boolean hasBuffMatching(ActivatedPet, String)
- void addExperienceNoEvent(ActivatedPet)
- String getBuffMatching(ActivatedPet, String)
- Buff getBuffByName(ActivatedPet, String)
- boolean hasBuff(ActivatedPet)
- void setPluginName(String)
- void addExperience(ActivatedPet)
- void addExperience(ActivatedPet, String)
- Buff getBuff(ActivatedPet)
- Buff getBuff(ActivatedPet, String)
- String pluginName()
- double getMulti(ActivatedPet)
- boolean hasBuffWithNamePlaceholder(ActivatedPet, String)
- boolean hasBuffWithName(ActivatedPet, String)
- void onDeactivatePet(Player)
- void onActivatePet(Player)
- void register()
- double getMultiplier(ActivatedPet, String)

### Class: me.rivaldev.rivalpets.buffs.PetUpgradeRegister
Type: Abstract Class
Implements: org.bukkit.event.Listener

Methods:
- void setPluginName(String)
- void init()
- long getLevel(Player)
- String pluginName()
- void setupgradeName(String)
- void onUpgradeProc()
- String upgradeName()
- void register()

## Package: me.rivaldev.rivalpets.handlers

### Class: me.rivaldev.rivalpets.handlers.ActivatedPet
Type: Class
Implements: java.io.Serializable

Methods:
- double getGradeExperience()
- Location getLocation()
- Player getPlayer()
- String getEnhancement()
- void setEnhancement(String)
- void addEXP(double)
- void setGradeLevel(double)
- boolean isActive()
- UUID getOwner()
- void setLevel(long)
- void deactivate(boolean)
- void deactivate()
- void checkVisiblity()
- int getPetnumber()
- UUID getUniqueBaseUUID()
- void setGradeBuff(double)
- void createArmorStands()
- UUID getUniqueNameUUID()
- void refreshVisibility()
- void setUniqueNameUUID(UUID)
- void teleportStands()
- void setGradeExperience(double)
- double getNeededExperience()
- void setVisible(boolean)
- void setExperience(double)
- void addLevel(int)
- void setUniqueBaseUUID(UUID)
- long getCooldown()
- void updateName()
- OfflinePlayer getOfflinePlayer()
- void deactivateForce()
- void setNextUsageTime(long)
- void setDistance()
- boolean isPlayerOnline()
- void updateYaw()
- void activate(boolean)
- void activate()
- void respawn(int)
- void setPrestige(long)
- double getExperience()
- void setNameUpdate(long)
- boolean isOnCooldown()
- void addCooldown(int)
- UUID getPetUUID()
- void setRunning(boolean)
- void setPetnumber(int)
- boolean isRunning()
- double getGradeBuff()
- double getGradeLevel()
- void checkDeactivation()
- void addEXPNoEvent(double)
- void setPet(RPet)
- RPet getPet()
- void loadChunk()
- void toggleSilent()
- void clear()
- void start()
- void toggle()
- long getNextUsageTime()
- long getPrestige()
- long getLevel()
- long getNameUpdate()
- void setActive(boolean)
- void addExperience(double)
- void setPetVisually()

### Class: me.rivaldev.rivalpets.handlers.EnchantToggler
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void saveDisabledEnchantsSync(UUID, List)
- void onQuit(PlayerQuitEvent)
- void saveDisabledEnchants(UUID, List)
- void onJoin(PlayerJoinEvent)
- boolean isEnabled(Player, String)
- boolean isDisabled(Player, String)
- void enableEnchant(Player, String)
- void disableEnchant(Player, String)

### Class: me.rivaldev.rivalpets.handlers.LuckPermsListener
Type: Class

Methods:
- void init()

### Class: me.rivaldev.rivalpets.handlers.MessageToggler
Type: Class
Implements: org.bukkit.event.Listener

Methods:
- void saveDisabledEnchantsSync(UUID, List)
- void onQuit(PlayerQuitEvent)
- void saveDisabledEnchants(UUID, List)
- void onJoin(PlayerJoinEvent)
- boolean isEnabled(Player, String)
- boolean isDisabled(Player, String)
- void enableEnchant(Player, String)
- void disableEnchant(Player, String)

### Class: me.rivaldev.rivalpets.handlers.StoragePet
Type: Class

Methods:
- List getActivePets()
- void setNormalPets(List)
- List getNormalPets()
- void setActivePets(List)
- void addNormalPets(StoredPet)
- UUID getOwner()
- void addActivePets(ActiveStoredPet)

## Package: me.rivaldev.rivalpets.handlers.currencies

### Class: me.rivaldev.rivalpets.handlers.currencies.CacheKey
Type: Class

Methods:
- int hashCode()
- boolean equals(Object)

### Class: me.rivaldev.rivalpets.handlers.currencies.CurrenciesHandler
Type: Class

Methods:
- CompletableFuture getBalance(Player, String)
- CompletableFuture setBalance(Player, String, double)

### Class: me.rivaldev.rivalpets.handlers.currencies.Currency
Type: Class

Methods:
- String getSingularUnit()
- String getName()
- String getPluralUnit()

## Package: me.rivaldev.rivalpets.objects

### Class: me.rivaldev.rivalpets.objects.ActiveStoredPet
Type: Class
Implements: java.io.Serializable

Methods:
- double getGradeExperience()
- void setPetUUID(UUID)
- long getPetPrestige()
- String getEnhancement()
- void setCooldown(long)
- void setEnhancement(String)
- void setGradeLevel(double)
- long getCooldown()
- void setType(String)
- UUID getOwner()
- void setPetPrestige(long)
- void setOwner(UUID)
- UUID getPetUUID()
- void setPetxp(double)
- String getType()
- double getPetxp()
- int hashCode()
- void setGradeBuff(double)
- boolean equals(Object)
- double getGradeBuff()
- void setPetLevel(long)
- double getGradeLevel()
- void setGradeExperience(double)
- long getPetLevel()

### Class: me.rivaldev.rivalpets.objects.StoredPet
Type: Class
Implements: java.io.Serializable

Methods:
- double getGradeExperience()
- void setPetUUID(UUID)
- String getEnhancement()
- void setEnhancement(String)
- void setGradeLevel(double)
- UUID getOwner()
- void setPetPrestige(long)
- void setOwner(UUID)
- UUID getPetUUID()
- void setPetxp(double)
- long getLastUsage()
- double getPetxp()
- int hashCode()
- void setGradeBuff(double)
- double getGradeBuff()
- void setPetLevel(long)
- double getGradeLevel()
- void setLastUsage(long)
- void setGradeExperience(double)
- long getPetLevel()
- long getPetPrestige()
- void setCooldown(long)
- long getCooldown()
- void setType(String)
- String getType()
- boolean equals(Object)

## Package: me.rivaldev.rivalpets.types

### Class: me.rivaldev.rivalpets.types.ModeType
Type: Enum
Extends: java.lang.Enum

Methods:
- ModeType valueOf(String)
- ModeType[] values()

### Class: me.rivaldev.rivalpets.types.PetType
Type: Enum
Extends: java.lang.Enum

Methods:
- PetType valueOf(String)
- PetType[] values()

### Class: me.rivaldev.rivalpets.types.PluginType
Type: Enum
Extends: java.lang.Enum

Methods:
- PluginType valueOf(String)
- PluginType[] values()

## Package: me.rivaldev.rivalpets.user

### Class: me.rivaldev.rivalpets.user.ActivePetsChest
Type: Class

Methods:
- List getAllActivePets()
- void removePet(UUID, ActivatedPet)
- void removeActivePet(UUID, ActivatedPet, boolean)
- void addPet(UUID, ActivatedPet)
- ArrayList getPetsByUUID(UUID)
- void clearPets(UUID)
- ActivatedPet getActivePetID(UUID)

### Class: me.rivaldev.rivalpets.user.PetsChest
Type: Class

Methods:
- boolean hasPet(String)
- RPet getPet(String)
- Map getPetMap()
- void addPet(RPet)

### Class: me.rivaldev.rivalpets.user.UserData
Type: Class
Extends: org.bukkit.configuration.file.YamlConfiguration

Methods:
- void discard()
- void discard(boolean)
- void reload()
- void save()
- void saveSync()
- UserData getConfig(Player)
- UserData getConfig(OfflinePlayer)
- UserData getConfig(UUID)
- void removeConfigs()

