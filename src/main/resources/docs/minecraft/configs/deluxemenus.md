Plugin's files
The plugin's configuration files

Config
config.yml
Copy
# DeluxeMenus 1.13.1-Release main configuration file
# 
# A full wiki on how to use this plugin can be found at:
# https://github.com/help-chat/DeluxeMenus/wiki

debug: HIGHEST
check_updates: true
gui_menus:
basics_menu:
file: basics_menu.yml
advanced_menu:
file: advanced_menu.yml
requirements_menu:
file: requirements_menu.yml
Basics Menu
basics_menu.yml
Copy
#  A DeluxeMenus basic configuration guide for beginners
#=========================================================
#
# This note will help you understand the basic functions and configuring of DeluxeMenus: commands, requirements, items and others, and from then on you can start to work with more advanced stuff. You can delete this note or any note below at any time. But if you are still here anyway, then let's move down below
#

# Open Command
#
# This setting is the command that will be used to open this menu. Supports normal String or a String List
# NOTE: Use "open_command: []" to create a menu with no commands needed
#
# open_command: <command>
# open_command:
#   - <command1>
#   - <command2>
#
open_command: basicsmenu

# Size
#
# This allows you to set the size of the menu inventory. Range from 9-54.
# If this option is not present in the menu configuration, it will default to 54.
#
size: 9

# Menu title
#
# This is the title of the menu. You can change it with your custom name
# Color codes and placeholders are supported
#
menu_title: 'Basics Menu'

# Open requirement
#
# This setting section allows you to define requirements the menu viewer must meet
# to be allowed to open this menu in game.
#
# Any menu you want to restrict access to based on permission
# should have a basic "has permission" requirement
#
# This setting and requirements can be explained more in depth by checking out
# the requirements_menu.yml file in your menus folder.
# For full reference, check https://github.com/help-chat/DeluxeMenus/wiki/Requirements
#
open_requirement:
requirements:
permission:
type: has permission
permission: deluxemenus.admin
deny_commands:
- '[message] &cYou don''t have permission to do that!'

# Item section. This is where you can start add items into menu, and add functions into each items that you did.
# For depth explanation on the functions, you can check on the note given from config.yml
# For full reference, check https://github.com/help-chat/DeluxeMenus/wiki/Item
#
items:
# Here you need to set the name ID of the item. This name however, does not display on the menu. Every item must have a unique name ID.
# In this example, we will call this item name ID: "teststone"
'teststone':
#We will start to create a STONE item,
material: STONE
# with a Block data set to 1, so that you can change stone type from STONE to GRANITE. More informations about the block data can be checked through each items from Minecraft Wikipedia
data: 1
# Slots that you want to put the item. Starts from 0
slot: 0
# Here we will name this item. You can change this at anytime. PlaceholderAPI & Color codes supported
display_name: "&aThis is a special stone"
# This is the lore setting. Referrence of this same with display_name.
# You can create multiple lines of lores like this
lore:
- "&aTest1"
- "&cTest2"
- "&eTest3"


# ==============================================================
#
# Random tips, tricks, and useful info below
#
# ==============================================================
#
# PER ITEM PERMISSION AND PRIORITY INFO:
#
# Per item permissions and priorities are optional.
# High priority = 1, Lowest priority = 2147483647.
# This allows you to show different items for a specific menu slot depending on the highest priority
# item permission a player has. This makes your menus very dynamic :)
#
# You CAN NOT specify a permission without a priority!
# You CAN specify a priority without a permission.
# You should always create a low priority item without a permission which will act as the no permission
# item if a player does not have permission for any of the items that require permission, otherwise
# no item will be set in the slot if a player does not have permission for any of the permission items.
#
# ==============================================================
#
# You specify the command which opens the menu. Make sure this command
# does not conflict with any existing commands on your server!
# A GUI menu without an open command specified will not be loaded!
#
# Menus configuration layout:
# menu_title: '<title of menu goes here>'
# command: <command to open this menu goes here>
# inventory_type: '<add this option if you want to create a menu of a different InventoryType aside from chest>'
# open_requirement:
#   requirements:
#     <unique name for this requirement>:
#    type: <type for this requirement>
#    <unique options per requirement type would go here>
#    deny_commands:
#    - '[message] you do not meet requirements to open this menu'
#   size: <size of this menu, increments of 9, max size is 54>
#   update_interval: <time in seconds this gui should update for a player if an item is set to uodate placeholders>
#   items:
#     <item identifier>:
#       material: <name or id>
#       material: head-<name of player>
#       material: hdb-<HeadDatabase id> (requires plugin HeadDatabase)
#       data: <integer, used for data values for wool etc>
#       amount: <amount of this item to show>
#       slot: <slot number to put this item, slots start at 0 and end at 53 for a size 54 inventory>
#       priority: <this is used if you have multiple items set for the same slot>
#       view_requirement: <see view requirement info below. The lowest priority item a player meets all view requirements for will be shown>
#       update: <true/false if this item should update placeholders on the interval set for the gui menu this item is in>
#       hide_attributes: <true/false if this item should display item attributes>
#       hide_enchantments: <true/false if this item should display item enchantment / level> (useful for 'enchantment glow' items)
#       hide_effects: <true/false if this item should display item effect attributes>
#       hide_unbreakable: <true/false if this item should display item unbreakable attributes>
#       banner_meta: (this is used if you want to display a custom banner with specific patterns)
#       - <dyecolor>;<PatternType> (more information on where to find DyeColor and PatternType names below)
#       - 'RED;BASE'
#       - 'WHITE;CREEPER'
#       display_name: <display name to show for this item>
#       lore:
#       - 'This is the lore of the itemm'
#       - 'placeholders can be used in the display_name or lore.'
#       enchantments: valid enchantment names can be found here: https://hub.spigotmc.org/javadocs/spigot/org/bukkit/enchantments/Enchantment.html
#       - '<ENCHANTMENT>;<LEVEL>'
#       - 'SILK_TOUCH;1'
#       left_click_commands:
#       right_click_commands:
#       shift_left_click_commands:
#       shift_right_click_commands:
#       middle_click_commands:
#       left_click_requirement: <Learn how to use this option in the requirements_menu.yml>
#       right_click_requirement: <Learn how to use this option in the requirements_menu.yml>
#       shift_left_click_requirement: <Learn how to use this option in the requirements_menu.yml>
#       shift_right_click_requirement: <Learn how to use this option in the requirements_menu.yml>
#       middle_click_requirement: <Learn how to use this option in the requirements_menu.yml>
#
#
# You can specify if a GUI menu should be loaded from another file:
#
# gui_menus:
#   <menuName>:
#     file: 'menuName.yml'
#
# This allows you to keep your config clean and not have tons of GUI menus cluttering it.
# The file format the GUI menu is loaded from must end in .yml
# GUI menus loaded from other configuration files must follow a specific format as well...
# To get started loading GUI menus from different files, simply create a GUI menu in this config and specify the file it will load from.
# After that is done, use /dm reload and DeluxeMenus will create a folder and file specific to the GUI menu you specified.
# If the file specified is created by DeluxeMenus (because it did not exist), a default GUI menu layout will be saved to that file.
# From here you can edit it to your liking and use /dm reload to update your GUI menu!
#
# This loading from external config files is only available for gui menus and will not work for click menus yet....
#
# banner_meta must be listed with a specific format:
# banner_meta:
# - <DyeColor>;<PatternType>
#
# Valid DyeColor names can be found here: https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/DyeColor.html
# Valid PatternTypes can be found here: https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/block/banner/PatternType.html
# ==============================================================
#
# Requirement information
#
# Requirements can be set as the following:
#
# open_requirement: This requirement is checked when a menu is opened
# view_requirement: This requirement determines if an item should be set in a menu slot
# left_click_requirement: This requirement is checked when an item is left clicked
# right_click_requirement: This requirement is checked when an item is right clicked
#
# Requirement types:
#   javascript - Evaluates a javascript expression that must return true or false
#     configuration options:
#       expression
#
#   has item - Checks if a player has a specific item
#     configuration options:
#       material
#       amount
#       data
#       name
#       lore
#
#   has money - Checks if a player has enough money (Vault required)
#     configuration options:
#       amount
#
#   has permission - Checks if a player has a specific permission
#     configuration options:
#       permission
#
#   string contains - Checks if a string contains another string
#     configuration options:
#       input
#       output
#
#   string equals - Checks if a string equals another string
#     configuration options:
#       input
#       output
#
#   string equals ignorecase - Checks if a string equals another string ignoring case
#     configuration options:
#       input
#       output
#
#   > - Checks if a number is greater than another number
#     configuration options:
#       input
#       output
#
#   >= - Checks if a number is greater than or equal to another number
#     configuration options:
#       input
#       output
#
#   == - Checks if a number is equal to another number
#     configuration options:
#       input
#       output
#
#   <= - Checks if a number is less than or equal to another number
#     configuration options:
#       input
#       output
#
#   < - Checks if a number is less than another number
#     configuration options:
#       input
#       output
#
#   regex matches - Checks if a placeholder parsed string matches a regex pattern
#     configuration options:
#       input
#       regex
#
#
#
# So why would we want to use requirements?
# By default, DeluxeMenus does not require a player meet any conditions to open your menu.
# If you want to require a menu need a certain permission node for it to be accessed, or a certain amount of money
# for a menu to be opened, You do that with an 'open_requirement'.
# Below is an example of how you would deny opening a menu if the viewer does not have permission:
#
# menu_title: 'Menu that requires permission to open'
# open_command: testmenu
# size: 9
# open_requirement:
#   requirements:
#     this_requirement_name:
#       type: has permission
#       permission: 'testmenu.open'
#       deny_commands:
#       - '[message] you do not have permission to open testmenu'
#
# ==============================================================
#
# Every item in the items list must have a unique <item identifier>
#
# If you choose to update placeholders for a specific item, you must specify update_interval: <time>
# in the menu options for the specific menu.
#
# Every click_command must start with a specific identifier to know what to do for the execution.
# Valid click_command identifiers:
#
# [console] - Execute a command from the console
# Usage: - '[console] <command with no slash>'
#
# [player] - Execute a command for the menu viewer
# Usage: - '[player] <command with no slash>'
#
# [commandevent] - Fire a PlayerCommandPreprocessEvent for commands that do not use the bukkit command system
# Usage: - '[commandevent] <command with no slash>'
#
# [message] - Send a message to the menu viewer
# Usage: - [message] <message to send to the player
#
# [openguimenu] - Open a GUI menu (can only be used in GUI menu click_commands)
# Usage: - '[openguimenu] <guiMenuName>'
#
# [connect] - Connect to the specified bungee server
# Usage: - '[connect] <serverName>'
#
# [close] - Close the viewers open menu
# Usage: - '[close]
#
# [refresh] - Refresh items in the current menu view
# Usage: - '[refresh]
#
# [broadcastsound] - Broadcast a sound to the server
# Usage: - '[broadcastsound]
#
# [sound] - Play a sound for a the specific player
# Usage: - '[sound]
#
# [json] - Send a json message to the menu viewer
# Usage: - '[json] {"text":"message"}'
#
#
#
# You can delay any of the click command being performed by ending the command with
# <delay=(time in TICKS)>
# example:
#     - '[close]'
#     - '[message] it has been 5 seconds since the menu closed!<delay=100>'
#     - '[message] it has been 10 seconds since the menu closed!<delay=200>'
#
Advanced Menu
advanced_menu.yml
Copy
#  A DeluxeMenus advanced configuration guide
#=========================================================
menu_title: '&8> &6&lD&eM &bAdvanced Example'
open_command:
- advancedmenu
- advancedexamplemenu
- themostadvancedmenuintheworld
  open_commands:
- '[sound] BLOCK_BEACON_ACTIVATE'
- '[message] &7Opening Advanced example menu, Plugin created by &bextended_clip&7!'
  size: 27
# as always, only cool people can open this menu :)
open_requirement:
requirements:
permission:
type: has permission
permission: deluxemenus.admin
deny_commands:
- "[message] &8[&bDeluxe&eMenus&8] &cYou don't have perms for this!"
items:
'example':
material: LIME_DYE
slot: 11
priority: 1
update: true
hide_attributes:  true
display_name: '&bExample Kit'
lore:
- ''
- '&7Cooldown : &f3 Days'
- '&7Left Click to Redeem'
view_requirement:
requirements:
kit_requirement:
type: string equals
input: '%essentials_kit_is_available_example%'
output: 'yes'
kit_perm:
type: has permission
permission: essentials.kits.example
left_click_commands:
- '[player] kit example'
- '[close]'
'examplecd':
material: GRAY_DYE
slot: 11
priority: 2
update: true
hide_attributes:  true
display_name: '&cExample Kit Unavailable'
lore:
- '&7This kit is on cooldown!'
- '&7You must wait : &f%essentials_kit_time_until_available_example%'
- '&7Before using this kit again.'
view_requirement:
requirements:
kit_perm:
type: has permission
permission: essentials.kits.example
'examplenoperm':
material: GRAY_DYE
slot: 11
priority: 3
update: true
hide_attributes:  true
display_name: '&7Example Kit'
lore:
- '&7You do not have permission for this kit!'
'shopexample':
material: head-extended_clip
slot: 12
display_name: '&r'
lore:
- '&7Shop example using'
- '&7view requirements!'
- '&fLeft click to purchase.'
priority: 1
view_requirement:
requirements:
shop_perm:
type: has permission
permission: deluxemenus.shopexample
left_click_commands:
- '[sound] ENTITY_FIREWORK_ROCKET_BLAST'
- '[console] give %player_name% skull 1 player:extended_clip name:&bExtended_Clip lore:&8<lore>|&7Example_Shop_Item|&8<lore>'
- '[message] &8[&6&lDeluxeShop&8] &fYou have succesfully purchased &7extended_clips &fhead!'
- '[console] eco take %player_name% 666'
- '[close]'
left_click_requirement:
requirements:
balance_check:
type: has money
amount: 666
'shopnoperm':
material: head-extended_clip
slot: 12
display_name: '&7No permission'
lore:
- '&8You are missing the &bdeluxemenus.shopexample'
- '&8permission which is required to view the item!'
- '&fLeft click to close the menu.'
left_click_commands:
- '[sound] ENTITY_SNOW_GOLEM_DEATH'
- '[close]'
- '[message] &8[&6&lDeluxeShop&8] &fYou have closed the menu! &7(1 Second message delay!) <delay=20>'
'filler_item':
material: GRAY_STAINED_GLASS_PANE
slots:
- 0
- 1
- 2
- 3
- 4
- 5
- 6
- 7
- 8
display_name: ' '
Requirements Menu
requirements_menu.yml
Copy
#
# Requirements tutorial menu v1.0
# authors: clip
#
# contributor: Andre_601
#
# In this tutorial you will learn all about menu requirements
# Requirements allow you to restrict actions or even an entire menu to specific players.
#
# You can read more about requirements here:
#   https://wiki.helpch.at/clips-plugins/deluxemenus/options-and-configurations/requirements
#
menu_title: 'Requirements Menu'
open_command: requirementsmenu
size: 9
#
# as always, only cool people can open this menu :)
#
open_requirement:
requirements:
permission:
#
# "has permission" checks if a player has the required permission
#
# Read more:
#   https://wiki.helpch.at/clips-plugins/deluxemenus/options-and-configurations/requirements#has-permission
#
type: has permission
permission: deluxemenus.shop
deny_commands:
- '[message] &cYou don''t have permission to do that!'
items:
#
# Example 1: Shop Item
#
# This is a gold block, which allows you to buy or sell gold blocks for money.
#
'gold_block':
material: GOLD_BLOCK
slot: 0
lore:
- '&7Buy/Sell GOLD_BLOCK'
- ''
- '&7- Left-click: &bBuy 1 &7for &a$100'
- '&7- Right-click: &bSell 1 &7for &a$50'
- '&7- Shift-left-click: &bBuy 64 &7for &a6,400'
- '&7- Shift-right-click: &bSell 64 &7for &a$3,200'
#
# Requirement(s) when left-clicking an item.
#
left_click_requirement:
requirements:
#
# "has money" checks if the player has enough money. Requires Vault.
# "amount" defines how much the player needs to at least have.
#
# Read more:
#   https://wiki.helpch.at/clips-plugins/deluxemenus/options-and-configurations/requirements#has-money
#
has_money:
type: has money
amount: 100
deny_commands:
- '[message] &cYou don''t have enough money for this!'
#
# Command(s) to execute when left-clicking the item.
# Those commands won't be executed when the above requirements aren't met.
#
# Read more:
#   https://wiki.helpch.at/clips-plugins/deluxemenus/options-and-configurations/item#shift-left-middle-right-click-commands
#
left_click_commands:
- '[console] give %player_name% GOLD_BLOCK 1'
- '[takemoney] 100'
- '[message] &aYou bought 1 &6GOLD_BLOCK &afor $100'
#
# Requirement(s) for right-clicking an item.
#
right_click_requirement:
requirements:
#
# "has item" checks if the player has the specified item in their inventory.
# Except for "material" and "amount" are all other values optional and will default to a specific value.
# We check for if the player has 1 gold block.
#
# Read more:
#   https://wiki.helpch.at/clips-plugins/deluxemenus/options-and-configurations/requirements#has-item
#
has_item:
type: has item
material: 'GOLD_BLOCK'
amount: 1
deny_commands:
- '[message] &cYou don''t have enough &6GOLD_BLOCK &cto sell! Required: 1'
#
# Command(s) to execute when right-clicking the item.
# Those commands won't be executed when the above requirements aren't met.
#
# Read more:
#   https://wiki.helpch.at/clips-plugins/deluxemenus/options-and-configurations/item#shift-left-middle-right-click-commands
#
right_click_commands:
- '[console] clear %player_name% GOLD_BLOCK 1'
- '[console] eco give %player_name% 50'
- '[message] &aYou sold 1 &6GOLD_BLOCK &afor $50'
#
# Requirement(s) when left-clicking an item while holding shift on the keyboard.
#
shift_left_click_requirement:
requirements:
#
# "has money" checks if the player has enough money. Requires Vault.
# "amount" defines how much the player needs to at least have.
#
# Read more:
#   https://wiki.helpch.at/clips-plugins/deluxemenus/options-and-configurations/requirements#has-money
#
has_money:
type: has money
amount: 6400
deny_commands:
- '[message] &cYou don''t have enough money for this!'
#
# Command(s) to execute when left-clicking the item while holding shift.
# Those commands won't be executed when the above requirements aren't met.
#
# Read more:
#   https://wiki.helpch.at/clips-plugins/deluxemenus/options-and-configurations/item#shift-left-middle-right-click-commands
#
shift_left_click_commands:
- '[console] give %player_name% GOLD_BLOCK 64'
- '[takemoney] 6400'
- '[message] &aYou bought 64 &6GOLD_BLOCK &afor $6400'
#
# Requirement(s) when right-clicking an item while holding shift on the keyboard.
#
shift_right_click_requirement:
requirements:
#
# "has item" checks if the player has the specified item in their inventory.
# Except for "material" are all other values optional and will default to a specific value
# which is either nothing (name) or 1 (amount).
# We check for if the player has 64 gold blocks.
#
# Read more:
#   https://wiki.helpch.at/clips-plugins/deluxemenus/options-and-configurations/requirements#has-item
#
has_item:
type: has item
material: GOLD_BLOCK
amount: 64
deny_commands:
- '[message] &cYou don''t have enough &6GOLD_BLOCK &cto sell! Required: 64'
#
# Command(s) to execute when right-clicking the item while holding shift.
# Those commands won't be executed when the above requirements aren't met.
#
# Read more:
#   https://wiki.helpch.at/clips-plugins/deluxemenus/options-and-configurations/item#shift-left-middle-right-click-commands
#
shift_right_click_commands:
- '[console] clear %player_name% GOLD_BLOCK 64'
- '[console] eco give %player_name% 3200'
- '[message] &aYou sold 64 &6GOLD_BLOCK &afor $3200'
#
# Example 2: Free diamonds!
#
# This is a diamond, which will only be visible for people, that don't have the permission deluxemenus.free_diamonds.cooldown
# When you click the item will you get a diamond and a permission is set (using LuckPerms) temporary (acts as cooldown) before
# refreshing the GUI to update the displayed item.
#
'free_diamonds':
material: DIAMOND
slot: 1
lore:
- '&aFREE DIAMOND! [1/day]'
- ''
- '&7Click to get 1 free &bdiamond&7!'
#
# "priority" is used in case you have multiple items on the same slot.
# A lower number equals a higher priority.
#
priority: 0
#
# view_requirement makes it possible to only display the item when the requirements are met.
# When the requirements aren't met and a item with lower priority occupies the same slot, will it be displayed instead.
#
# Read more:
#   https://wiki.helpch.at/clips-plugins/deluxemenus/options-and-configurations/item#view-requirement
#
view_requirement:
requirements:
has_not_perm:
#
# "!has permission" checks if the player does NOT have the specified permission.
#
type: "!has permission"
permission: deluxemenus.free_diamonds.cooldown
#
# We give the item, set the permission with it expiring in 1 day and refresh the GUI to update the item.
#
left_click_commands:
- '[console] give %player_name% DIAMOND 1'
- '[console] lp user %player_name% permission settemp deluxemenus.free_diamonds.cooldown true 1d'
- '[refresh]'
#
# We give the item, set the permission with it expiring in 1 day and refresh the GUI to update the item.
#
right_click_commands:
- '[console] give %player_name% DIAMOND 1'
- '[console] lp user %player_name% permission settemp deluxemenus.free_diamonds.cooldown true 1d'
- '[refresh]'
#
# Example 3: Placeholder item
#
# This is a stone, that will be displayed as long as the player has the permission deluxemenus.free_diamonds.cooldown
#
'free_diamonds_cooldown':
material: STONE
slot: 1
lore:
- '&aFREE DIAMOND! [1/day]'
- ''
- '&cYou''re currently on cooldown. Click to refresh.'
#
# Higher number equals lower priority, meaning this item will only be displayed once the view_requirement of the
# above isn't met anymore.
#
priority: 1
#
# We refresh the GUI to update the item, if the view_requirement no longer matches.
#
left_click_commands:
- '[refresh]'
#
# We refresh the GUI to update the item, if the view_requirement no longer matches.
#
right_click_commands:
- '[refresh]'
Example GUI menus
Few examples to help you make your own!

Kits
A simple example to show you how you can make a Kits menu that displays 3 different items for each kit, when the kit is available to claim, when it's on cooldown and when it's unavailable (Locked).

To make this work fine you have to download Essentials and download the Essentials expansion using:

/papi ecloud download Essentials
/papi reload

Ranks
A simple example to show you how you can make a Ranks menu that displays 2 items for each rank, when the rank is not purchased and when the rank or a higher rank is purchased

To make this work fine you have to download LuckPerms and also download the Player expansions using:

/papi ecloud download Player
/papi reload

Server Selector
A simple example to show you how you can make a Server Selector menu that displays 2 different items for each server, when the server is online and when it's offline.

To make this work fine you have to download Pinger and (optional) Server expansions using:

/papi ecloud download Pinger
/papi ecloud download Server
/papi reload

In this example, we have 2 different servers on one BungeeCord: vanilla and games. We are on the server games in this example.

If we want the player to connect to the vanilla server, we need to setup the right functions in the left_click_commands: _**_section
In our example, we will first close the menu with [close], send a message to the player with [message] and finally connect him to the server with [connect].

To show, how many players are on the server vanilla, we will use the placeholder %pinger_players_<ip>:<port>%
Please keep in mind, that Pinger placeholders have their own update interval, to change it, go to the PlaceholderAPI config file and change the check_interval: (default is 30 seconds).
But what if the server is currently offline?
In this case, we can use a second item with a lower priority, that will be displayed, if the view_requirement: of the first item isn't true.
So now we can show a different item, if the server is offline. But keep in mind that the items don't update automatically, if the view requirement has changed (from Offline to Online). We can update the menu, by letting the player execute [refresh] if he clicks on the item.

The second item is easier. Because we are already connected, so we just need to send a message. And we can show the amount of players on the server with the %server_online% placeholder.

Store
A simple example to show you how you can make a Store/Shop menu that you can buy/sell items from using various economic systems.

To make this work fine you have to download the Player and CheckItem expansions and the expansion of the economic system that you'll use using:

/papi ecloud download Player
/papi ecloud download CheckItem
/papi ecloud download Vault
/papi ecloud download TokenEnchant
/papi reload


****Vault****


****Token Enchant****


****Player Points****


****Player XP****

Meta
A simple example to show you how meta works.
Example GUI menus
Few examples to help you make your own!

Kits
A simple example to show you how you can make a Kits menu that displays 3 different items for each kit, when the kit is available to claim, when it's on cooldown and when it's unavailable (Locked).

To make this work fine you have to download Essentials and download the Essentials expansion using:

/papi ecloud download Essentials
/papi reload

Ranks
A simple example to show you how you can make a Ranks menu that displays 2 items for each rank, when the rank is not purchased and when the rank or a higher rank is purchased

To make this work fine you have to download LuckPerms and also download the Player expansions using:

/papi ecloud download Player
/papi reload

Server Selector
A simple example to show you how you can make a Server Selector menu that displays 2 different items for each server, when the server is online and when it's offline.

To make this work fine you have to download Pinger and (optional) Server expansions using:

/papi ecloud download Pinger
/papi ecloud download Server
/papi reload

In this example, we have 2 different servers on one BungeeCord: vanilla and games. We are on the server games in this example.

If we want the player to connect to the vanilla server, we need to setup the right functions in the left_click_commands: _**_section
In our example, we will first close the menu with [close], send a message to the player with [message] and finally connect him to the server with [connect].

To show, how many players are on the server vanilla, we will use the placeholder %pinger_players_<ip>:<port>%
Please keep in mind, that Pinger placeholders have their own update interval, to change it, go to the PlaceholderAPI config file and change the check_interval: (default is 30 seconds).
But what if the server is currently offline?
In this case, we can use a second item with a lower priority, that will be displayed, if the view_requirement: of the first item isn't true.
So now we can show a different item, if the server is offline. But keep in mind that the items don't update automatically, if the view requirement has changed (from Offline to Online). We can update the menu, by letting the player execute [refresh] if he clicks on the item.

The second item is easier. Because we are already connected, so we just need to send a message. And we can show the amount of players on the server with the %server_online% placeholder.

Store
A simple example to show you how you can make a Store/Shop menu that you can buy/sell items from using various economic systems.

To make this work fine you have to download the Player and CheckItem expansions and the expansion of the economic system that you'll use using:

/papi ecloud download Player
/papi ecloud download CheckItem
/papi ecloud download Vault
/papi ecloud download TokenEnchant
/papi reload


****Vault****


****Token Enchant****


****Player Points****


****Player XP****

Meta
A simple example to show you how meta works.
External menus
Modify each menu in its own file!

Creating a new menu
1. Open the config file plugins/DeluxeMenus/config.yml.
2. Register the new menu by adding the following under the gui_menus: section:

Copy
<MenuName>:
file: <FileName>.yml
<MenuName> is the menu's name (should be unique) .

<FileName> is the menu's file name, it's preferred to use the menu's name to prevent confusion (should be unique).

Note! You can also use file: <Directory>/<FileName>.yml to put menus in Sub Directories(Folders).

So it will be like this:

Copy
gui_menus:
<MenuName>:
file: <FileName>.yml
3. Reload DeluxeMenus plugin (/dm reload).
4. The menu's file will be generated by the plugin and can be found in the gui_menus folder (plugins/DeluxeMenus/gui_menus).
5. You're done! Open the menu's file and modify it as you wish.

Moving a menu from config to its own file
1. Open the config file plugins/DeluxeMenus/config.yml.
2. Go to the menu part in the config and add the following line to it:

Copy
file: <FileName>.yml
<FileName> is the menu's file name, it's preferred to use the menu's name to prevent confusion (should be unique).

So it will be like:

Copy
YourMenuName:
file: <FileName>.yml
menu_title: "Your Title"
size: #
# etc
3. Reload DeluxeMenus plugin (/dm reload).
4. The new menu's file will be generated by the plugin and can be found in the gui_menus folder (plugins/DeluxeMenus/gui_menus). Go and open it.
5. Cut your menu's lines (from the first line after the file: option you added in step 2 to the last line for the menu) in the config file.
6. Go to the menu's external file and replace the content of it with the menu's lines you cut from the config file (from the previous step).
7. Remove 4 spaces before every line in the menu's external file. You can easily do this by selecting all the text in the file (CTRL + A) then press (CTRL + [) twice (This way may not be supported in all text editors, such as Notepad++).
8. Reload DeluxeMenus plugin (/dm reload).
9. You're done! The new file should look like this:

Copy
menu_title: "Your Title"
size: #
# etc
Options & Configurations
About the plugin's options and configurations

DeluxeMenus is a highly customizable plugin, it has many options and configurations to give you the ability to change everything you want to make your custom menus that fits your server's layout.
It has GUI options to manage the GUI menu, and Item options to manage every single item on the GUI menu.

Useful links
Placeholders

Materials

1.8.8

1.12.2

1.13.2

1.14.4

Latest

Enchantments (Be aware that some enchantments are not available on some items.)

Dye Colors

Pattern Types

Sound Types

Values keywords
Keyword

Description

BOOLEAN

Replace this with true or false (If used with a PlaceholderAPI placeholder, this will be yes or no instead of true/false [It's changeable from PlaceholderAPI config file, but yes/no are the default values]).

TEXT

Replace this with any text. Check the description to find out if you can use color/formatting codes.

#

Replace this with a number. Check the description to see if there are limits.

COMMAND

Replace this with a command without slash (/).

SOUND

Replace this with a sound name.

EXPRESSION

Replace this with a java/placeholder expression/comparison. See this page for more information.

RGB/Hex
If you want to use RGB/Hex colors in DeluxeMenus on 1.16+ you can use the following format: "&#aaFF00"

Placeholders
There is one available placeholder from DeluxeMenus:

%deluxemenus_meta_<key>_<dataType>_[default_value]% - Returns the meta value that is saved with the specified key and type. If no value is saved with the given key and type, the default value is returned. If no default value is specified, an empty value is returned.

%deluxemenus_meta_has_value_<key>_[dataType]% - Returns yes/no response. Checks if there is a value with the given key. It also checks the type if specified.

%deluxemenus_opened_menu% - Returns the ID of the menu that the player currently has open

%deluxemenus_is_in_menu% - Returns yes/no if a user has a menu opened

%deluxemenus_last_menu% - Returns the ID of the previous menu the player had opened

General plugin options
Debug
Copy
debug: STRING
Default value: HIGHEST
Available values:
LOWEST, LOW, MEDIUM, HIGH, HIGHEST

Determines which debug messages are going to be shown in console based on their importance.

HIGHEST LEVEL = only debug messages with highest priority are shown
LOWEST LEVEL = all debug messages are shown
Stacktraces are only displayed when the debug level is set to MEDIUM, HIGH or HIGHEST.

Check updates
Copy
check_updates: BOOLEAN
Default value: true

Enables/Disables checking new updates for the plugin.
Notifies any operator if there is an update available.
GUI
All GUI menu related options & configurations

Syntax
Copy
menu_title: "TEXT"
open_command: COMMAND
open_requirement: EXPRESSION
open_commands:
- "[ACTIONTYPE] ACTION"
- "[ACTIONTYPE] ACTION"
  inventory_type: "TEXT"
  size: #
  update_interval: #
  items:
  Menu Title
  Copy
  menu_title: "TEXT"
  The menu title that is shown at the top of the GUI. You can use color and formatting codes here, and PlaceholderAPI placeholders.

Open Command
Copy
open_command: COMMAND
Multiple open commands:

Copy
open_command:
- COMMAND
- COMMAND_2
  The command used to open the GUI menu. It can only be a single word.

To disable the open command, simply delete the line of this option.

Open Requirements
Copy
open_requirement:
requirements:
TEXT:
type: <type>
Sets requirements a player should have to open the GUI menu. Check the Requirements page for more info.

Placeholders Support Arguments
Copy
parse_placeholders_after_arguments: true
In version 1.14.1 of DeluxeMenus, the order of placeholders and arguments being parsed was changed for security reasons. If you know there is no security risk for you, the old order can be reverted by adding this option.

Security Warning!

Some placeholders do more than returning values. To prevent user input from being used directly into placeholders, this option is disabled by default. If you know the placeholders you use inside menus are not doing such things, feel free to enable this option!

Arguments Support Placeholders
Copy
arguments_support_placeholders: true
This option allows placeholders to be used inside arguments. They will automatically be parsed before the arguments are used anywhere inside the menu.

Security Warning!

This allows menu users to parse any placeholders they want. Please only enable this for people you trust!

Open Commands
Copy
open_commands:
- "[ACTIONTYPE] ACTION"
- "[ACTIONTYPE] ACTION"
  Runs the command(s) you set when the player opens the menu.

Close Commands
Copy
close_commands:
- "[ACTIONTYPE] ACTION"
- "[ACTIONTYPE] ACTION"
  Runs the command(s) you set when the player close the menu by clicking an item that have the close action ([close]).

At the moment, it is not possible to run these actions when a menu is closed by other means such as pressing the "ESC" key.

Inventory Type
Copy
inventory_type: "TEXT"
Default value: CHEST
Supported types:

ANVIL

BARREL

BEACON

BLAST_FURNACE

BREWING

CARTOGRAPHY

DISPENSER

DROPPER

ENCHANTING

ENDER_CHEST

FURNACE

GRINDSTONE

HOPPER

LOOM

PLAYER

SHULKER_BOX

SMOKER

WORKBENCH

Allows you to define a different type of Inventory.

Size
Copy
size: #
Default value: 54
Supported values:

9

18

27

36

45

54

Sets the inventory size.

Size option only works for CHEST inventory types. Even for that it is optional and will default to 54.

Register Command
Copy
register_command: true
Registers the open command with the server.

Must be manually added to the menu.

Server will need to be restarted.

Arguments
Copy
args:
- "TEXT"
- "TEXT"
- "TEXT"
  TEXT The argument name (Should be unique).

Gives you the ability to set arguments after the open command, and use them inside the menu by adding the argument placeholder (the argument name inside curly braces {TEXT}).

Arguments can also be specified when the [openguimenu] action is used.

You can have multiple arguments, and they will be set in the same order in the open command.

Copy
/COMMAND FirstArg SecondArg And the rest
Copy
args:
- first
- second
- last
  {first} returns FirstArg

{second} returns SecondArg

{last} returns And the rest

It's highly recommended to add the Args Usage Message option.

Requires Register Command to be enabled!

Arguments Wrong Usage Message
Copy
args_usage_message: "TEXT"
Custom message to be sent to a player when he uses a command to open a menu but does not specify the required arguments. Colors and formatters can be used in this message.

Requires Arguments to be defined.

Argument Requirements
Arguments can have their own requirements and they are checked before the menu is opened.

Copy
args:
player:
requirements:
regex:
type: "regex matches"
input: "{player}"
regex: "^[a-zA-Z]{2,16}$"
deny_commands:
- "[message] That's not a valid player!"
length:
type: "string length"
input: "{player}"
min: 2
max: 32
deny_commands:
- "[message] Player must be between 2 and 32 characters long."
player:
type: "is object"
input: "{player}"
object: "player"
deny_commands:
- "[message] Must be a player's username or UUID."
Update Interval
Copy
update_interval: #
This is for any items that use the update: option (Check it here).
The number defines the delay (in seconds) between each refresh of the placeholders in an item's lore/display name.

Note: This refreshes/updates the placeholders only.

Items
Copy
items:
This line should be left as is. It is merely telling the plugin you are about to begin defining items.
Check the Item page for more information.
Item
All item related options & configurations

Syntax
Copy
items:
"ItemName":
material: TEXT
slot: #
Note:
Each item will have a name, in this example our item is called ItemName. This name should be unique, so there won't be two or more items with the same name.

Material
Copy
material: TEXT
Supported material values:

Material name (STONE).

Player head (head-extended_clip).

Placeholder head (head-%player_name%, basehead-%player_basehead_placeholder%, etc.).

Argument placeholder head (head-{target}).

BaseHead (basehead-<base64 (Value field in the head's give command)>).

Minecraft Texture (texture-<id>)
- The id is what's after https://textures.minecraft.net/textures/

HeadDatabase (hdb-<ID>).

ItemsAdder material (itemsadder-namespace:name)

Oraxen material (oraxen-oraxen_item_id)

Nexo material (nexo-nexo_item_id)

MMOItems material (mmoitems-item_type:item_id)

ExecutableItems material (executableitems-item_id)

ExecutableBlocks material (executableblocks-item_id)

SimpleItemGenerator material (simpleitemgenerator-item_id)

Placeholder material (placeholder-%player_item_in_hand%).

Item in main hand (main_hand).

Item in off hand (off_hand).

Items in armor equipment slots (armor_helmet, armor_chestplate, armor_leggings and armor_boots)

Water bottle material is: water_bottle

Air material is: air

Sets the material of the item in the menu.

AIR is a valid material. The item will be an empty slot with click commands and click requirements working.

Placeholders are supported for head, basehead, texture, hdb, itemsadder, oraxen and all other custom materials!

Damage
Copy
damage: #
Supported damage values:

Number (1).

Placeholder that returns a number (placeholder-%player_item_in_hand_data%).

Sets the durability of the item (depends on the Material option).

The old data option was changed to damage. Please use the new option as the old one will be removed in the future.

Amount
Copy
amount: #
Sets the item's amount in the menu.

Dynamic Amount
Copy
dynamic_amount: '%placeholder%'
Sets the item's amount in the menu using a placeholder.

Model Data
Copy
model_data: #
Allows you to set a CustomModelData for your item. Example of usage:
model_data: 14

DEPRECATED!
Starting with 1.21.4, the new model_data_component should be used!

Model Data Component
Copy
model_data_component:
strings: ["string1", "string2"]
floats: [1, 2, 3]
flags: ["true", "false", "true"]
colors: ["255, 255, 255", "0, 0, 0"]
Allows you to set custom model data component. This is the new replacement for custom model data added by Mojang.

Item Model
Copy
item_model: # Namespaced key. Example minecraft:item_model
Allows you to set a custom Item Model for your item.

This option only works on versions 1.21.2 and higher!

Tooltip Style
Copy
tooltip_style: # Namespaced key. Example minecraft:custom_tooltip
Allows you to set a custom tooltip for your item.

This option only works on versions 1.21.2 and higher!

NBT Tags
Copy
nbt_string: '<Key>:<StringValue>'
nbt_strings:
- '<Key>:<StringValue>'
- '<Key>:<StringValue>'
  nbt_int: '<Key>:<IntegerValue>'
  nbt_ints:
- '<Key>:<IntegerValue>'
- '<Key>:<IntegerValue>'
  nbt_short: '<Key>:<ShortValue>'
  nbt_shorts:
- '<Key>:<ShortValue>'
- '<Key>:<ShortValue>'
  nbt_byte: '<Key>:<ByteValue>'
  nbt_bytes:
- '<Key>:<ByteValue>'
- '<Key>:<ByteValue>'
  Allows you to add custom NBT tags to your items like model data.

Deprecated! Should use the new model_data option instead for CustomModelData.
This option no longer works on 1.21.4 and newer versions!

Banner Meta
Copy
banner_meta:
- <dyecolor>;<patterntype>
- <dyecolor>;<patterntype>
  Dye colors list.

Pattern types list.

Allows you to create your custom banners and shields.

Now with support for SHIELDS! Make sure to also check the new base_color option.

Base Color
Copy
base_color: <dyecolor>
Dye colors list.

Allows you to specify base colors for shields and also for banners on 1.12.2 and lower versions.

Light Level
Copy
light_level: <lightlevel>
Allows to set light level for the new light item. The value can be a number between 1 and 15.

Trim Material
Copy
trim_material: <trimmaterial>
Trim materials list.

Allows you to specify the trim pattern for armors.

Trim Pattern
Copy
trim_pattern: <trimpattern>
Trim patterns list.

Allows you to specify the trim material for armors.

Both options (trim_material and trim_pattern) are required for the trim to work!

Item Flags
Copy
item_flags:
- <ItemFlag>
- <ItemFlag>
Item Flags list.

Allows you to set item flags.

Potion Effects
Copy
potion_effects:
- <PotionEffectType>;<duration>;<amplifier>
- <PotionEffectType>;<duration>;<amplifier>
  Potion effects list.

Allows you to set effects (Used if the material is a potion, splash_potion and tipped arrows).

Potion Effects no longer require the RGB option to be set to work!

Entity Type
Copy
entity_type: <entitytype>
Entity types list.

This is mainly targeted for 1.12.2 and lower server versions and allows you to specify monster egg types and monster spawner types.

Option was removed in versions 1.14.0 and newer of the plugin due to versions 1.13.1 and lower of Minecraft no longer being supported.

RGB
Copy
rgb: #, #, #
Example:

Copy
rgb: 38, 192, 210
Sets the RGB (Red, Green, Blue) color for leather armor, potions, splash potions, tipped arrows and firework stars

For RGB option to work on potions and tipped arrows you also need to give it at least one  potion_effect.

You can find a list of default potion colors HERE. You will have to use an online converter to convert the hex values to rgb.

Display Name
Copy
display_name: "TEXT"
Sets the item's display name. You can use placeholders and color/format codes.

Lore
Copy
lore:
- "TEXT"
- "TEXT"
  Sets the item's lore (the text shown under the item's name). You can use placeholders and color/format codes and the new line character (\n) in this option.

Lore Append Mode
Copy
lore_append_mode: # STRING
Sets a lore append mode. When using custom materials such as material: mmoitems-type:id, some of the items have their own lore. This option allows you to combine that lore with the one specified by you using lore or completely override it. Default value is OVERRIDE

Valid options:

IGNORE - ignores the lore option and only uses the lore specified by the custom item

OVERRIDE - ignores the lore from the custom item and uses the one specified in lore

BOTTOM - appends the lore specified in lore option at the bottom of the one from the custom item

TOP - appends the lore specified in lore option at the top of the one from the custom item

Slot
Copy
slot: #
Multiple slots:

Copy
slots:
- #
- #
- #

# OR

slots:
- #-#
- #-#
  Sets in which slot the item should be inside the menu.

Slots start at 0.

Multiple items can be in the same slot, but you'll have to use view requirement and priority options to work properly.


Slots number in a chest
Priority
Copy
priority: #
Sets the item priority. It's used if you want different items in the same slot (by using the view requirement option).
The item that has the highest priority will be checked first if the player has the required view requirement. It will display the item if they have the requirements and if not, it will check the next item and so on.

The highest priority is 0.

The lowest priority is 2147483647.

View Requirement
Copy
view_requirement: 'EXPRESSION'
Sets the requirements the player should have to see the item. (Check priority option for setting up multiple items in the same slot).
Check the Requirements page for more info about this option's value and how to use it.

Update
Copy
update: BOOLEAN # true or false
If set to true, it will update the placeholders in the item's display name and lore only.
Check the update interval GUI option to set the update speed.


An example showing how the update option works in placeholders
Enchantments
Copy
enchantments:
- enchantmentid;level
- enchantmentid;level
  Enchantments list.

Enchants the item with the specified enchantments. (Check the hide enchantments option to hide the enchantments)

Some items cannot have the enchanting glow effect

Hide Tooltip
Copy
hide_tooltip: BOOLEAN # true or false
If set to true, it will hide the tooltip for the item.

This option only works on versions 1.20.5 and higher!

Enchantment Glint Override
Copy
enchantment_glint_override: BOOLEAN # true or false
If set to true, it will add a glint to the item, as if the item is enchanted, even if it is not enchanted.

This option only works on versions 1.20.5 and higher!

Rarity
Copy
rarity: STRING
Rarities list

Change the item rarity. As far as we understand it, this will only affect the default name color.

This option only works on versions 1.20.5 and higher!

Hide Enchantments
Copy
hide_enchantments: BOOLEAN # true or false
If set to true, it will hide the enchantments you set for the item using the enchantments option from the item's tooltip (lore).
Used to add the enchanting glow effect to the item without showing the enchantments text.

DEPRECATED!
Please use the item_flags options instead! This option will be removed.

Hide Attributes
Copy
hide_attributes: BOOLEAN # true or false
If set to true, it will hide the vanilla attributes of an item/armor (e.g. 7 Attack Damage).

DEPRECATED!
Please use the item_flags options instead! This option will be removed.

Hide Unbreakable
Copy
hide_unbreakable: BOOLEAN # true or false
If set to true, it will hide the unbreakable tag if the "unbreakable:" option is enabled.

DEPRECATED!
Please use the item_flags options instead! This option will be removed.

Unbreakable
Copy
unbreakable: BOOLEAN # true or false
If set to true, it will show the item to be at full durability.

(Shift) Left/Middle/Right click Commands
Copy
# click_commands: or
# left_click_commands: or
# right_click_commands: or
# middle_click_commands: or
# shift_left_click_commands: or
shift_right_click_commands:
- "[ACTIONTYPE] ACTION"
- "[ACTIONTYPE] ACTION"
  Sets the actions/commands that should be executed once the player clicks the item. they get executed in order from top to bottom.
  Check this for all action types and action tags.

Middle clicking was removed by Mojang in 1.18 and newer!

(Shift) Left/Middle/Right click Requirement
Copy
# click_requirement: or
# left_click_requirement: or
# right_click_requirement: or
# middle_click_requirement: or
# shift_left_click_requirement: or
shift_right_click_requirement:
requirements: 'EXPRESSION'
deny_commands:
- "[ACTIONTYPE] ACTION"
- "[ACTIONTYPE] ACTION"
Sets the requirements the player should have to click the item (Check the Requirements page for more info about the EXPRESSION value).
Deny commands (optional) are the actions that are going to be executed if the player doesn't have the required requirements. But if (s)he does, it will execute the actions specified in the click commands option.

You can have deny commands per requirement. Check this page for more information.

Check this for all action types and action tags.
Actions
Actions, also known as commands are the muscles of menus. They are used as interactions for clicks, requirement denies and requirement successes.

Actions types
The full list of actions is as follows:

Tag

Description

[player] <command>

Executes a command as the player.

[console] <command>

Executes a command from the console.

[commandevent] <command>

Executes an unregistered command as the player.

IMPORTANT: Currently, this action is simply an alias for the [player] action.

[placeholder] <papi-placeholders>

Parse placeholders for a player without any chat or console output from DeluxeMenus.

IMPORTANT: If the placeholders have output, it is not hidden!

[message] <text>

Sends a message to the player. You can use placeholders and color/format codes here.

[broadcast] <text>

Sends a message to everyone online including the console.

You can use placeholders and color/format codes here.

[minimessage] <text>

Sends a message to a player using the more modern MiniMessage format!

[minibroadcast] <text>

Sends a message to everyone online using the more modern MiniMessage format!

[openguimenu] <menu-name> [arguments]

Opens another GUI from DeluxeMenus.

All arguments from the current menu are passed to the opened menu by default. If the opened menu also has arguments, they can be specified as well.

[connect] <server-name>

Connects the player to a server on the same BungeeCord.

IMPORTANT: Requires BungeeMessaging. This is present on BungeeCord and WaterFall. On Velocity it might be disabled by default. Check your proxy config.

[close]

Closes the currently opened GUI.

[json] <JSON-text>

Send a json message to the player. Use this website to easily generate the JSON text.

[jsonbroadcast] <JSON-text>

Send a json message to everyone online. Use this website to easily generate the JSON text.

[refresh]

Refresh items in the current menu view. This updates the shown Items themselves.

[broadcastsound] <sound> <volume> <pitch>

Broadcast a sound to all players on the server.

[broadcastsoundworld] <sound> <volume> <pitch>

Broadcast a sound to all players in the world.

[sound] <sound> <volume> <pitch>

Play a sound for the player.

[takemoney] <amount>

Take a certain amount of money from the player. Vault is required for this action to work.

[givemoney] <amount>

Give a certain amount of money to the player. Vault is required for this action to work.(requires Vault)

[takeexp] #L

Take a certain amount of exp levels or points from a player. To give levels, add L at the end, otherwise remove it.

[giveexp] #L

Give a certain amount of exp levels or points to a player. To give levels, add L at the end, otherwise remove it

[givepermission] <perm.node>

Giv a permission to a player. Vault is required for this action to work.

[takepermission] <perm.node>

Take a permission from a player. Vault is required for this action work.

[meta] <set/remove/add/subtract/switch> <key> <type> <value>

Modifies the player's meta. add/subtract are for number types. switch is for boolean, it will swap it from true/false. Check here for more detail.

[chat] <message>

Send a message in chat as the player who this action got executed for.

Action tags
These tags can be added with the action (e.g. - '[message] example<delay=20>').

Tag

Description

<delay=<time>>

Executes the action after the specified delay (in ticks, 20 ticks = 1 second).

<chance=<chance>>

Sets a chance to execute the action. Can be from 0 to 100 where 0 means that the action will never execute and 100 means it will always execute.
Requirements
Everything about DeluxeMenus requirements!

IMPORTANT!

Click requirements do not work without their click commands counterparts! Having success_commands set up will not be enough!

Syntax
Copy
# Other available requirement types:
# open_requirement:
# view_requirement:
# left_click_requirement:
# right_click_requirement:
# shift_left_click_requirement:
# shift_right_click_requirement:
click_requirement:
# Minimum requirements are optional.
# If they are not set, then all
# requirements will be needed for the
# click commands to be executed.
# In this example, only one of the
# requirements will be needed.
minimum_requirements: 1
# This option is good for when you use minimum_requirements.
# Instead of the plugin checking all the requirements,
# it will stop when it has enough.
stop_at_success: true
requirements:
# You can define multiple requirements.
# Each requiremnt should have a unique name.
requirement_name:
type: TYPE
# These commands will be exeucted if
# the requirement they're set for is
# met even if the others are not.
# You should be careful and not confuse
# these with click_commands: !!!
success_commands:
- "[ACTIONTYPE] ACTION"
- "[ACTIONTYPE] ACTION"
# These commands will be executed if
# the requirement they're set for is
# not met even if the others are.
deny_commands:
- "[ACTIONTYPE] ACTION"
- "[ACTIONTYPE] ACTION"
# This option is only required if you
# want ot use minimum_requirements:
# Minimum requirements will only work
# for the optional requirements
optional: true
# This can only be defined for open and
# left/right click requirement
deny_commands:
- "[ACTIONTYPE] ACTION"
- "[ACTIONTYPE] ACTION"
Requirements allow you to restrict certain actions or even an entire menu and only allow certain players to see and/or use the menu.

Requirements
Type
Description
Open Requirement

Defines the requirements to open the menu.

View Requirement

Defines the requirements to see an item in the menu.

(Shift) Left/Right Click Requirements

Defines the requirements to (shift) left/right click an item.

Placeholders and arguments can be used in the requirements.

If you set multiple requirements, all of them should be met (Use JavaScript type or minimum_requirements to add optional requirements).

Deny Commands
Deny commands are used to execute actions when players don't meet requirements. These actions can be set per requirement or per requirement list.

Copy
click_requirement:
requirements:
requirement_name:
type: TYPE
deny_commands:
- "[message] This is a deny command per requirement"
deny_commands:
- "[message] This is deny command per requirements list"
Success Commands
Similar to deny commands, Success commands are used to execute actions when players meet requirements. These actions can be set per requirement or per requirement list.

Copy
click_requirement:
requirements:
requirement_name:
type: TYPE
success_commands:
- "[message] This is a success command per requirement"
success_commands:
- "[message] This is success command per requirements list"
For click requirements, having success_commands is not enough! Click commands are also needed.

Minimum Requirements
If this option is used, not all requirements that have optional: true will be checked. Instead, it will stop when enough requirements are met.

Copy
minimum_requirements: # Number
This option only works for requirements that have optional: true. All the other requirements will still be checked

Stop At Success
When mimimum requirements is used, the requirement validation will not stop when enough requirements are met. Instead it will continue with all requirements check. If this option is enabled, when the number of minimum requirements is met, validation for all remaining requirements will stop.

Copy
stop_at_success: # TRUE or FALSE
Requirement types
When inverting requirements, make sure you put the type in quotation marks. This is because "!" is a special symbol in YAML so it will break the syntax.

ex: type: "!has permission"

Has permission
Copy
type: has permission
permission: TEXT
Checks if the player has the specified permission (Vault is required).

To invert the requirement (Check if the player doesn't have the permission) you can simply add the exclamation mark before the type name (like this type: "!has permission").

Has permissions
Copy
type: has permissions
permissions:
- TEXT
- TEXT
  minimum: # Number
  Checks if the player has all the specified permissions (Vault is required). If minimum: # is specified, it checks if the player has at least # permissions from the list.

To invert the requirement (Check if the player doesn't have the permissions) you can simply add the exclamation mark before the type name (like this type: "!has permissions").

Has money
Copy
type: has money
amount: #
Checks if the player has the specified amount of money (Vault is required).

To invert the requirement (Check if the player doesn't have the amount of money) you can simply add the exclamation mark before the type name (like this type: "!has money").

To use a placeholder as a value for the amount, replace the amount: field with placeholder:.

Has Item
Copy
type: has item
# material option supports material names, placeholders and arguments.
material: "TEXT"
data: #
# represents the CustomModelData the item should have.
modeldata: #
amount: #
name: "TEXT"
# lore can also be one single string: lore: "TEXT"
lore:
- "TEXT"
# if this is enabled then the plugin will look for items that contain the value
# set at the option "name" in their name and not for the exact value
name_contains: boolean
# if this option is enabled then the plugin will check for the item name,
# without caring about the case.
name_ignorecase: boolean
# if this is enabled then the plugin will look for items that contain the value
# set at the option "lore" in their lore and not for the exact value
lore_contains: boolean
# if this option is enabled then the plugin will check for the item lore,
# without caring about the case.
name_ignorecase: boolean
# if this option is enabled, the plugin will consider only the items that
# have no custom model data, no display name and no lore.
strict: boolean
# decides if the plugin should also check the armor slots of the player when
# looking for items
armor: boolean
# decides if the plugin should also check the off hand of the player when
# looking for items
offhand: boolean
Required fields:

Material

Checks if the player has the specified item in the inventory.

To invert the requirement (Check if the player doesn't have the item) you can simply add the exclamation mark before the type name (like this type: "!has item").

Has support for custom materials. Please see here for a list of supported custom materials.

Has Meta
Meta uses Persistent Data Containers which means this feature will only work on servers that are 1.14 or newer!

Copy
type: has meta
key: "TEXT"
meta_type: <STRING, BOOLEAN, DOUBLE, LONG, INTEGER>
value: EXPECTED VALUE
Required fields:

key

meta_type

value

Checks if the player has the specified meta.

If the meta_type is a number format (DOUBLE, LONG, INTEGER) it will check if the player's meta value is greater than or equal to the value

To invert the requirement (Check if the input doesn't match the output) you can simply add the exclamation mark before the type name (like this type: "!has meta").

Has Exp
Copy
type: has exp
amount: #
level: boolean # true if you want to check for exp levels, false for exp points
Required fields:

amount

Checks if the player has the exp level or points.

If the level option does not exist, it will check for exp points by default

To invert the requirement (Check if the input doesn't match the output) you can simply add the exclamation mark before the type name (like this type: "!has exp").

Is Near
Copy
type: is near
location: "WORLDNAME,X,Y,Z"
distance: #
Required fields:

location

distance

Checks if the player is within distance of location.

To invert the requirement (Check if the input doesn't match the output) you can simply add the exclamation mark before the type name (like this type: "!is near").

JavaScript
Copy
type: javascript
expression: 'EXPRESSION'
Example:

Copy
type: javascript
expression: '%vault_eco_balance% >= 100'
Evaluates a JavaScript expression that must return true or false.

String Equals
Copy
type: string equals
input: "TEXT"
output: "TEXT"
Example:

Copy
type: string equals
input: "%server_name%"
output: "HelpChat"
Checks if input: matches output: (Case sensitive).

To invert the requirement (Check if the input doesn't match the output) you can simply add the exclamation mark before the type name (like this type: "!string equals").

String Equals Ignore Case
Copy
type: string equals ignorecase
input: "TEXT"
output: "TEXT"
Example:

Copy
type: string equals ignorecase
input: "%server_name%"
output: "helpchat"
Checks if input: matches output: (Case insensitive).

To invert the requirement (Check if the input doesn't match the output) you can simply add the exclamation mark before the type name (like this type: "!string equals ignorecase").

String Contains
Copy
type: string contains
input: "TEXT"
output: "TEXT"
Example:

Copy
type: string contains
input: "%server_name%"
output: "chat"
Checks if input: contains output: (Case sensitive).

To invert the requirement (Check if the input doesn't contain the output) you can simply add the exclamation mark before the type name (like this type: "!string contains").

String Length
Copy
type: string length
input: "TEXT"
min: # Number
max: # Number
Example:

Copy
type: string length
input: "%player_name%"
min: 3
max: 14
Checks if input: is longer than or equal to min: and shorter than or equal to max:.

This requirement does not have a negative counterpart: !string length

Is Object
Copy
type: is object
input: "TEXT"
object: # INT, DOUBLE, PLAYER or UUID
Example:

Copy
type: string length
input: "Notch"
object: player
Checks if input: can be mapped to the Java Object you specified.

INT - checks if the input can be mapped to an integer

DOUBLE - checks if the input can be mapped to a double-precision floating point number

UUID - checks if the input can be mapped to a UUID

PLAYER - checks if the input matches a player's name or a player's uuid

This requirement does not have a negative counterpart: !string length

Regex matches
Copy
type: regex matches
input: "TEXT"
regex: "EXPRESSION"
Checks if input: contains the regular expression in regex:.
Visit this site to create regular expressions easily.

To invert the requirement (Check if the input doesn't contain the regular expression) you can simply add the exclamation mark before the type name (like this type: "!regex matches").

Comparators
Copy
type: (==, >=, <=, !=, >, <)
input: #
output: #
Compares input: with output:.

Now both the input and the output support floating point values.

Available options
Comparator
Description
==

input: equals to output:

>=

input: greater than or equals to output:

<=

input: less than or equals to output:

!=

input: not equals to output:

>

input: greater than output:

<

input: less than output:

Examples
Open Requirement
Copy
open_requirement:
requirements:
example_1:
type: has permission
permission: open.menu.one
deny_commands:
- "[message] &cYou don't have the permission."
View Requirement
Copy
view_requirement:
requirements:
example_2:
type: string equals
input: "%player_is_op%"
output: "yes"
Left/Right Click Requirement
Copy
# left_click_requirement: or
right_click_requirement:
requirements:
example_3:
type: has money
amount: 100
deny_commands:
- "[message] &7You don't have enough money."
Minimum Requirements
Copy
click_requirement:
minimum_requirements: 1
stop_at_success: true
deny_commands:
- "[message] &7You don't have 1 of the 2 permissions required."
requirements:
perm1:
type: has permission
permission: perm.1
perm2:
type: has permission
permission: perm.2
click_commands:
- "[message] &7You have 1 of the 2 permissions required."
  Meta (Metadata)
  Starting with Spigot (and forks such as PaperMC) 1.14, a new feature called Persistent Data Container (PDC) was added. This is a small document explaining what it is and how DeluxeMenus uses it.

What is it?
The Persistent Data Container is a way to store custom data on a whole range of objects; such as items, entities, and block entities. This data is persistent (DOES NOT disappear on server restart) and is stored in the server files.

DeluxeMenus uses PDC to allow menu creators to store and retrieve custom data for menu users (players). You will find this feature on the wiki usually listed under the names "meta" or "metadata".

Data Types
While PDC allows storage of a wide range of data types and even allows custom implementation, DeluxeMenus only supports 3 of those types: DOUBLE, INTEGER, STRING. Some times you may see that LONG and BOOLEAN are supported as well, but these two are aliases for INTEGER (LONG) and STRING (BOOLEAN).

Name
Aliases
Data Type
INTEGER

LONG

64 bit signed number

STRING

BOOLEAN

String ("true" or "false" when using BOOLEAN)

DOUBLE

Fractional number from 1.7e−308 to 1.7e+308

How to use it?
Setting a value is pretty easy:

You can use the [meta] action which you can read more about here.

You can use the /dm meta <player> <set/remove/add/subtract/switch> command which you can read more about here.

Retrieving a value is just as easy:

You can use the PlaceholderAPI placeholder %deluxemenus_meta_<key>_<data-type>_[default_value]%.

You can use the /dm meta <player> show <key> <type> to see a single value with specified key and type.

You can use the /dm meta <player> list <type> [page] to see a list of all values of one type.

Checking that the player has a value is no harder:

You can use the PlaceholderAPI placeholder %deluxemenus_meta_has_<key>_[data-type]%.

You can use the has meta requirement which you can read more about here.

What else must I know?
Values are stored with a prefix (namespace) even if you don't set one. If you don't specify a namespace, deluxemenus: is used.

Keys (including namespaces) are case-insensitive. This means that my_key will work the same as MY_Key and MY_KEY.

If you want a more in-depth description of PDC, we recommend this amazing post from the PaperMC team: https://docs.papermc.io/paper/dev/pdc
Command Registration
More information about registering menu commands

How to register a command?

Each menu can have 2 options:

open_command
This is used to specify a list of commands that can be used to open the menu.

Note that by using this option alone, you will get no tab completion and other plugins will override this command

register_command
This accepts a boolean value (true or false). If the value is set to true, then on every server restart, DeluxeMenus will make an effort to register the command with the server. This should provide tab completion.

I have another plugin that registers the same command. What can I do?
When a command is registered with the server, an alias is provided: /deluxemenus:<menu-command>.

To better explain this, let's take an example:

We have a menu named randomteleportmenu with open_command: "rtp" and register_command: true. We'll consider that the server was restarted since the menu was created so the command was registered.
We are also using a RandomTeleport plugin that also registers the /rtp command.

Now when we execute /rtp, we get randomly teleported instead of having our menu open.

How do we fix this?
We could use /deluxemenus:rtp to open the menu, but we don't want our players to use prefixed commands as they are too long.

The solution is to use the commands.yml file provided by our server. We can find the file in the server's root directory where we find the the server jar file and the eula.txt file. If you've never modified the file, it will look something like this by default:

Copy
command-block-overrides: []
ignore-vanilla-permissions: false
aliases:
icanhasbukkit:
- version $1-
  Now, we modify the file like this:

Copy
command-block-overrides: []
ignore-vanilla-permissions: false
aliases:
icanhasbukkit:
- version $1-
  rtp:
- deluxemenus:rtp $1-
  Save, restart the server and you're all done!
