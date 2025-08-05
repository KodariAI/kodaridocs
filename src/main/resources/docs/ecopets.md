# EcoPets-2.75.0-com-willfp-ecopets-api API Reference

**Package Filter:** `com.willfp.ecopets.api`

## Package: com.willfp.ecopets.api

### Class: com.willfp.ecopets.api.EcoPetsAPI
Type: Interface

Methods:
- boolean hasPet(OfflinePlayer, Pet)
- double getPetXP(OfflinePlayer, Pet)
- int getPetXPRequired(OfflinePlayer, Pet)
- void setActivePet(OfflinePlayer, Pet)
- double getPetProgress(OfflinePlayer, Pet)
- void givePetExperience(Player, Pet, double)
- void givePetExperience(Player, Pet, double, boolean)
- **static** EcoPetsAPI getInstance()
- Pet getActivePet(OfflinePlayer)
- int getPetLevel(OfflinePlayer, Pet)

### Class: com.willfp.ecopets.api.EcoPetsAPI$Companion
Type: Class

Methods:
- **static** void getInstance$annotations()
- EcoPetsAPI getInstance()

## Package: com.willfp.ecopets.api.event

### Class: com.willfp.ecopets.api.event.PetEvent
Type: Interface

Methods:
- Pet getPet()

### Class: com.willfp.ecopets.api.event.PlayerPetExpGainEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: org.bukkit.event.Cancellable, com.willfp.ecopets.api.event.PetEvent

Methods:
- Pet getPet()
- boolean isCancelled()
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- void setCancelled(boolean)
- **static** HandlerList getHandlerList()
- void setAmount(double)
- boolean isMultiply()
- double getAmount()

### Class: com.willfp.ecopets.api.event.PlayerPetExpGainEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

### Class: com.willfp.ecopets.api.event.PlayerPetLevelUpEvent
Type: Class
Extends: org.bukkit.event.player.PlayerEvent
Implements: com.willfp.ecopets.api.event.PetEvent

Methods:
- int getLevel()
- Pet getPet()
- **static** HandlerList access$getHandlerList$cp()
- HandlerList getHandlers()
- **static** HandlerList getHandlerList()

### Class: com.willfp.ecopets.api.event.PlayerPetLevelUpEvent$Companion
Type: Class

Methods:
- HandlerList getHandlerList()
- **static** void getHandlerList$annotations()

