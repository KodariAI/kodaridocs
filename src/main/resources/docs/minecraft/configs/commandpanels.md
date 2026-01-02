# CommandPanels-Complete-Documentation

**Plugin Version:** MC 1.21.4 - 1.21.5
**Configuration Files:** `config.yml`, `panels/*.yml`, `blocks.yml`

## Main Configuration: config.yml

### Section: config

#### Setting: config.refresh-panels
Type: Boolean
Default: true
Description: If set to true, placeholders in panels will refresh. A server restart is necessary after changing this

#### Setting: config.refresh-delay
Type: Integer
Default: 20
Unit: ticks
Description: Global default value for how often panels refresh

#### Setting: config.panel-blocks
Type: Boolean
Default: true
Description: Disables /cpb if it is not required (optimisation purposes). A server restart is necessary after changing this

#### Setting: config.hotbar-items
Type: Boolean
Default: true
Description: If set to false, this will disable hotbar items. A server restart is necessary after changing this

#### Setting: config.custom-commands
Type: Boolean
Default: true
Description: If set to false, this will disable custom commands. A server restart is necessary after changing this

#### Setting: config.auto-register-commands
Type: Boolean
Default: true
Description: This will stop the plugin from registering panel custom commands

#### Setting: config.auto-update-panels
Type: Boolean
Default: false
Description: If enabled, panels will update from file automatically when opened. Keep disabled if other plugins depend on CommandPanels

#### Setting: config.server-ping-timeout
Type: Integer
Default: 10
Unit: milliseconds
Description: Time before %cp-server-<IP>:<PORT>% will timeout. For local networks use 10. Higher numbers delay panel opening

#### Setting: config.stop-sound
Type: Boolean
Default: true
Description: If you want the "sound-on-open" sound to stop when a panel is closed

#### Setting: config.disabled-world-message
Type: Boolean
Default: true
Description: Determines if the plugin should send a message when a panel is trying to be opened in the wrong world

#### Setting: config.panel-snooper
Type: Boolean
Default: false
Description: Set to true if you would like the console to send messages when players open or close panels

#### Setting: config.enable-import-command
Type: Boolean
Default: false
Description: Enables the use of the /cpi command to import panels from online

#### Setting: config.outside-commands
Type: List<String>
Default: ['msg= Example Message!']
Description: Execute commands if clicked outside the inventory boundaries while a panel is not open

### Section: format

#### Setting: format.tag
Type: String
Default: '&6[&bCommandPanels&6] '
Description: The tag Format before all the commands

#### Setting: format.perms
Type: String
Default: '&cNo permission.'
Description: Format of the no permission command

#### Setting: format.reload
Type: String
Default: '&aReloaded.'
Description: Format of the Reload command

#### Setting: format.nopanel
Type: String
Default: '&cPanel not found.'
Description: Format when a panel isn't found

#### Setting: format.noitem
Type: String
Default: '&cPanel doesn''t have clickable item.'
Description: If there is no open-with-item in the config for that Panel

#### Setting: format.notitem
Type: String
Default: '&cPlayer not found.'
Description: If the player name isn't found

#### Setting: format.error
Type: String
Default: '&cError found in config at'
Description: The default error code message

#### Setting: format.offline
Type: String
Default: 'Offline'
Description: Name shown when player is offline when using %cp-player-online-1%

#### Setting: format.offlineHeadValue
Type: String
Default: 'eyJ0ZXh0dfy7e8w...'
Description: Head value shown when player is offline when using %cp-player-online-1%

### Section: open-on-join

#### Setting: open-on-first-login
Type: String
Example: 'example'
Description: Open a panel when a player joins the server for the very first time

#### Setting: open-on-join.[worldname]
Type: String
Example: 'world1: example'
Description: Opens panel when player changes worlds. These will only run when the player changes worlds

#### Setting: open-on-login.[worldname]
Type: String
Example: 'world1: example'
Description: Opens panel when player logs into the server. Only runs when the player logs into the server

### Section: input

#### Setting: input.input-cancel
Type: String
Default: 'cancel'
Description: What players type to cancel the %cp-player-input% input

#### Setting: input.max-input-length
Type: Integer
Default: -1
Range: -1 to unlimited
Description: Maximum input length. Use -1 for no maximum

#### Setting: input.input-message
Type: List<String>
Default: ['%cp-tag%&aEnter Input for Command', '&cType &4%cp-args% &cto Cancel the command']
Description: Message that appears when asking for player input. Use %cp-tag% for plugin tag and %cp-args% for input-cancel value

### Section: hexcodes

#### Setting: hexcodes.start_tag
Type: String
Default: '&#'
Description: Starting tag for hex color codes (e.g., &#ff0000 for red)

#### Setting: hexcodes.end_tag
Type: String
Default: ''
Description: Ending tag for hex color codes. Change to '}' if using {#ff0000} format

### Section: placeholders

#### Setting: placeholders.primary.start
Type: String
Default: '%'
Description: Start symbol for primary placeholders

#### Setting: placeholders.primary.end
Type: String
Default: '%'
Description: End symbol for primary placeholders

#### Setting: placeholders.secondary.start
Type: String
Default: '{'
Description: Start symbol for secondary placeholders (used inside other placeholders)

#### Setting: placeholders.secondary.end
Type: String
Default: '}'
Description: End symbol for secondary placeholders

Note: Can be overridden per panel for panel-specific custom placeholders

### Section: updater

#### Setting: updater.auto-update
Type: Boolean
Default: false
Description: Automatically update plugin on server shutdown. Only auto updates minor versions (e.g., 3.22.1 -> 3.22.2 but NOT 3.22.1 -> 3.23.0)

#### Setting: updater.update-checks
Type: Boolean
Default: true
Description: Send update message on join if plugin needs updating. Restart server for changes to take effect

### Section: purchase

#### Setting: purchase.currency.enable
Type: Boolean
Default: true
Description: Enable currency purchase messages

#### Setting: purchase.currency.success
Type: String
Default: '&aSuccessfully Bought For $%cp-args%'
Description: Success message for currency purchases. %cp-args% replaced with money amount

#### Setting: purchase.currency.failure
Type: String
Default: '&cInsufficient Funds!'
Description: Failure message for currency purchases

#### Setting: purchase.data.enable
Type: Boolean
Default: true
Description: Enable data purchase messages

#### Setting: purchase.data.success
Type: String
Default: '&aSuccessfully Bought For $%cp-args%'
Description: Success message for data purchases

#### Setting: purchase.data.failure
Type: String
Default: '&cInsufficient Funds!'
Description: Failure message for data purchases

#### Setting: purchase.tokens.enable
Type: Boolean
Default: true
Description: Enable token purchase messages

#### Setting: purchase.tokens.success
Type: String
Default: '&aSuccessfully Bought For %cp-args% Tokens.'
Description: Success message for token purchases

#### Setting: purchase.tokens.failure
Type: String
Default: '&cInsufficient Tokens!'
Description: Failure message for token purchases

#### Setting: purchase.item.enable
Type: Boolean
Default: true
Description: Enable item purchase messages

#### Setting: purchase.item.success
Type: String
Default: '&aSuccessfully Sold %cp-args%.'
Description: Success message for item sales

#### Setting: purchase.item.failure
Type: String
Default: '&cInsufficient Items!'
Description: Failure message for item sales

#### Setting: purchase.xp.enable
Type: Boolean
Default: true
Description: Enable XP purchase messages

#### Setting: purchase.xp.success
Type: String
Default: '&aSuccessfully Bought For %cp-args% Experience.'
Description: Success message for XP purchases

#### Setting: purchase.xp.failure
Type: String
Default: '&cInsufficient Experience!'
Description: Failure message for XP purchases

## Panel Configuration: panels/*.yml

### Section: panels.[panel-name]

#### Setting: perm
Type: String
Default: 'default'
Description: Permission needed to open panel. Use "default" for everyone, custom values create permission node: commandpanel.panel.[value]

#### Setting: rows
Type: Integer/String
Range: 1-6 or InventoryType
Examples: 3, 6, 'HOPPER', 'FURNACE'
Description: Panel rows. 3 = standard chest, 6 = double chest. Can use special GUI types from Spigot API (some may not work)

#### Setting: condition
Type: String
Example: '%player_name% $EQUALS RockyHawk $AND %player_name% $HASPERM gamemode.creative'
Operators: $NOT, $AND, $OR, $EQUALS, $ATLEAST, $HASPERM
Description: Custom logic conditions that must be met to open panel. Brackets supported for one depth at a time. Spacing and format are important

#### Setting: title
Type: String
Example: '&8Example GUI'
Description: Title on top of panel, supports placeholders and colors. Some legacy MC versions have shorter length limits

#### Setting: custom-title
Type: Object
Structure:
  title: String (fallback title)
  has[n]:
    value[n]: String
    compare[n]: String
    title: String
  animate[n]:
    title: String
Description: Custom conditional or animated titles. Can remove regular title if using custom-title

#### Setting: animatevalue
Type: Integer
Example: 2
Description: Number of animation frames (0 to n). Loops through animate0 to animateN

#### Setting: panelType
Type: List<String>
Options: 
- static: Disable items from changing once panel is opened
- nocommand: Disable panel from /cp <panel name> command
- nocommandregister: Stop custom commands from auto-registering in commands.yml
- unmovable: Prevent players from moving items in their inventory while panel open
- unclosable: Prevent players from closing panel (need cpc command item)
Description: Special panel behaviors

#### Setting: custom-messages
Type: Object
Structure:
  player-input: List<String>
  input: String (for max character message)
  perms: String (no permission message)
Description: Custom messages for various panel interactions

#### Setting: refresh-delay
Type: Integer
Unit: ticks
Description: Override global refresh-delay for specific panel

#### Setting: sound-on-open
Type: String
Format: 'SOUND_NAME [volume] [pitch]'
Example: 'BLOCK_NOTE_BLOCK_PLING 0.3 0.6'
Range: volume (0.0-1.0), pitch (0.5-2.0)
Description: Sound played when panel opens. Music tracks can be played and will stop when panel closes

#### Setting: outside-commands
Type: List<String>
Description: Commands executed when clicking outside panel (empty area around GUI)

#### Setting: pre-load-commands
Type: List<String>
Description: Commands executed before panel loads (before setting item names). Use for setting panel placeholder values

#### Setting: commands-on-open
Type: List<String>
Description: Commands executed after panel opens. Recommended over pre-load unless needed

#### Setting: commands-on-close
Type: List<String>
Description: Commands executed when panel closes. Do not open panels here

#### Setting: custom-item
Type: Object
Structure:
  [item-name]:
    material: String
    name: String
    lore: List<String>
    stack: Integer
Description: Custom items for paywalls or setitem=. Only items without CommandPanels NBT that players can receive

#### Setting: disabled-worlds
Type: List<String>
Example: ['world_nether', 'world_the_end']
Description: Worlds where panel is disabled. Hotbar items won't show with multiverse-inventories

#### Setting: enabled-worlds
Type: List<String>
Example: ['world']
Description: Only these worlds can access panel (disables all others)

#### Setting: empty
Type: String
Examples: 'STAINED_GLASS_PANE', 'custom_item_name'
Description: Item placed in empty slots. Can use custom item names

#### Setting: commands
Type: List<String>
Example: ['example', 'ex', 'e']
Variables: 'ban %chosenPlayer%' creates %cp-chosenPlayer% placeholder
Description: Commands to open panel. Restart server to register for autocomplete

#### Setting: open-with-item
Type: Object
Structure:
  material: String
  name: String
  lore: List<String>
  stationary: Integer (0-35)
  commands: List<String>
  pre-load-commands: List<String>
Description: Hotbar/inventory item to open panel. 0-8 = hotbar, 9-35 = inventory. Without commands section, auto-opens panel

### Section: panels.[panel-name].item.[slot]

#### Setting: material
Type: String
Tags:
  Regular: 'IRON_INGOT'
  Custom head: 'cps= self' / 'cps= <username>' / 'cps= <base64>'
  Panel custom item: 'cpi= <custom_item>'
  Nexo: 'nexo= <itemName>'
  Oraxen: 'oraxen= <itemName>'
  ItemsAdder: 'itemsadder= <namespace:ID>'
  HeadDatabase: 'hdb= <number>'
  MMOItems: 'mmo= <item_type> <id>'
  Book: 'book= <author>'
  Player head: '%cp-player-online-1%'
Description: Item material or special material tag

#### Setting: itemType
Type: List<String>
Options: 
- placeable: Allow taking item and placing others in slot
- noAttributes: Hide item attributes
- hideTooltip: Hide all hover info (needs empty name)
- dropItem: Always drop when panel closes
- returnItem: Return to player inventory when panel closes
Description: Special item type behaviors

#### Setting: name
Type: String
Example: '&aSurvival'
Description: Item display name. Use '&f' for empty/no name

#### Setting: stack
Type: Integer
Default: 1
Range: 1-64
Description: Item stack size. If removed, item won't be stacked

#### Setting: enchanted
Type: List<String/Boolean>
Examples: 
- ['true'] (hidden enchantment)
- ['KNOCKBACK 2'] (visible)
- ['minecraft:SHARPNESS 4'] (with namespace)
Description: Item enchantments

#### Setting: nbt
Type: Object
Format: 'key: valueType_value'
Types: string, integer, double, float, long, short, boolean, byte
Examples:
  example: 'test'
  number: '1L'
  stats:
    damage: '6.5L'
    name: 'Dagger Item'
    is_obtainable: 'true'
Description: NBT values for item. Can be structured

#### Setting: itemmodel
Type: String/Integer
Example: 'template:sword'
Description: Item model value for resource packs

#### Setting: tooltip
Type: String
Example: 'style'
Description: Custom tooltip style

#### Setting: damage
Type: Integer
Special: -1 for unbreakable
Description: Item damage value

#### Setting: leatherarmor
Type: String
Format: 'R,G,B' or 'COLOR_NAME'
Examples: '136,0,255', 'CYAN'
Description: Leather armor color from Spigot API

#### Setting: trim
Type: String
Format: '[Material] [Pattern]'
Example: 'EMERALD COAST'
Description: Armor trim settings

#### Setting: potion
Type: String
Example: 'STRONG_HEALING'
Description: Potion effect type from Spigot API. Works for tipped arrows too

#### Setting: lore
Type: List<String>
Alternative: Use \n for new lines in single string
Description: Item lore lines

#### Setting: multi-paywall
Type: List<String>
Examples: ['item-paywall= item', 'paywall= 100', 'hasperm=']
Description: Multiple conditions required for commands to run. All must be met

#### Setting: commands
Type: List<String>
Format: '[click-tag] [command-tag] [command]'
Click tags: 'right=', 'rightshift=', 'left=', 'leftshift=', 'middle='
Example: 'right= msg= Right clicked!'
Description: Commands executed on item click. Click tags must come first

#### Setting: player-input
Type: List<String>
Description: Commands executed after player provides input via %cp-player-input%

#### Setting: player-input-cancel
Type: List<String>
Description: Commands executed if player cancels input

#### Setting: refresh-commands
Type: List<String>
Description: Commands executed on panel refresh. Won't run behind Has Sections unless allowed

#### Setting: duplicate
Type: String
Format: 'slot-range,slot,slot-range'
Example: '0-9,13,17-27'
Description: Duplicate item to multiple slots

#### Setting: banner
Type: List<String>
Format: 'COLOR,PATTERN'
Example: ['WHITE,STRIPE_MIDDLE', 'BLACK,SKULL']
Description: Custom banner patterns from PatternTypes. Order is top to bottom

#### Setting: has[n]
Type: Object
Structure:
  value[n]: String
  compare[n]: String
  [all item settings]
Operators: 'OR', 'NOT', 'AND', 'HASPERM', 'ISGREATER'
Description: Logic sections with requirements. Lower numbers have priority

#### Setting: animate[n]
Type: Object
Structure:
  [all item settings]
Description: Animation frame settings. Missing frames show default item

#### Setting: write
Type: List<String>
Description: Contents for writable book items (with book= material tag)

### Section: panels.[panel-name].floodgate

#### Setting: simple
Type: String
Description: Text at top of SimpleForm. Presence defines form as SimpleForm for Bedrock players

#### Setting: floodgate.[slot]
Type: Object
Structure:
  text: String
  commands: List<String>
  icon:
    type: String ('PATH' or 'URL')
    texture: String
  has[n]: Object (logic sections work same as regular panels)
Description: Floodgate button configuration for Bedrock. Java players see normal GUI

#### Setting: floodgate.[slot].type
Type: String
Options: 'dropdown', 'input', 'slider', 'toggle'
Description: CustomForm element type. Outputs to %cp-input% placeholder

#### Setting: floodgate.[slot].options
Type: List<String>
Required: For dropdown type
Example: ['survival', 'creative']
Description: Dropdown options

#### Setting: floodgate.[slot].placeholder
Type: String
Required: For input type
Default: ''
Description: Input placeholder text

#### Setting: floodgate.[slot].default
Type: String/Integer/Boolean
Required: For all CustomForm types
Description: Default value. Must be included or form won't work

#### Setting: floodgate.[slot].text
Type: String
Description: Label text for form element

#### Setting: floodgate.[slot].min
Type: Integer
Required: For slider type
Description: Minimum slider value

#### Setting: floodgate.[slot].max
Type: Integer
Required: For slider type
Description: Maximum slider value

#### Setting: floodgate.[slot].step
Type: Integer
Required: For slider type
Default: 1
Description: Slider step increment

## Block Configuration: blocks.yml

### Section: [world_x_y_z]

Format: worldName_X_Y_Z (use %dash% if world name contains underscore)

#### Setting: panel
Type: String
Description: Panel name to open when block is right-clicked

#### Setting: commands
Type: List<String>
Description: Commands to execute when block clicked. Add 'open= panelName' to also open panel

## FAQ & Troubleshooting

### My custom panel commands are showing help page?
CommandPanels auto-registers commands which may conflict with other plugins. Fix:
1. Add to your panel:
   panelType:
   - nocommandregister
2. Edit commands.yml in server root and delete the conflicting command (e.g., /kit)
3. Run /cpr and restart server

### How to properly update CommandPanels?
Small updates may not be on Spigot. Use /cpv latest then restart server to force download latest version.

### How can I close the panel when someone clicks on an item?
Add "commandpanelclose" or "cpc" to the item's commands section.

### I have an error when opening a panel?
Use /cpd to enable debug mode. Detailed errors will appear in console. Discord members can help explain error codes.

### CommandPanels is producing lag, how to fix?
1. Remove hotbar items (open-with-item) temporarily for testing
2. Set panel-blocks: false in config.yml if not using /cpb
3. Set refresh-panels: false if no animations needed, or increase refresh-delay to 40-60
4. Check for panels with many placeholders or external plugin calls

### Can't find your answer?
Contact Discord server for advice: https://discord.gg/eUWBWh7

## Template Panel Example

Location: panels/template.yml

panels:
    template:
        perm: admin
        rows: '6'
        title: '&8New Panel'
        empty: AIR
        item:
            '4':
                material: COBBLESTONE
                stack: 1
                name: '&fClick Me!'
                commands:
                - msg= You clicked the item!
                - cpc

## How-To Guides

### Generating Panels

#### Generate from Chest:
1. Place chest/double chest and fill with items
2. Type /cpg to enter generate mode
3. Open chest to generate panel
4. Edit commands in config/editor. Default name is generated

#### Generate with GUI:
1. Type /cpg [rows] to open blank inventory (1-6 rows)
2. Place items in inventory
3. Panel generates as "Panel-1"
4. Edit commands and rename in config/editor

### Creating Panel Commands
Add to panel configuration:
commands: 
- example
- ex
- e

With variables for arguments:
commands: 
- ban %chosenPlayer%
Creates %cp-chosenPlayer% placeholder in panel

### Setting Up Hotbar Items
Add to panel:
open-with-item:
    material: CLOCK
    name: '&aSurvival Panel'
    lore:
    - '&2Open the panel'
    stationary: '4'  # Slot 0-8 for hotbar, 9-35 for inventory
    commands:
    - open= examplePanel

With pre-load commands for data:
open-with-item:
    material: CLOCK
    name: '&aServer Selector'
    lore:
    - '&7Your Level is %cp-data-playerLevel%'
    pre-load-commands:
    - 'add-data= playerLevel 1'

### Creating Panel Blocks
1. Look at desired block
2. Type /cpb add [panel]
3. Right-click block to open panel
4. If block destroyed, location saved for replacement

In blocks.yml:
world_31_92_-80:
    panel: examplePanel
    commands:
    - open= examplePanel
    - msg= panel opened!

### Making Multi Panels
Create 3 separate panels for Top, Middle, Bottom locations:
- Top: 1-6 rows
- Middle: 1-3 rows  
- Bottom: 1 row

In top panel's commands-on-open:
commands-on-open:
- open= the_middle_panel {Middle}
- open= the_bottom_panel {Bottom}

### Creating Animated Items
In panel config add:
animatevalue: '6'

In item:
'2':
    material: BARRIER
    name: Default item
    animate0:
        material: PURPLE_STAINED_GLASS_PANE
        name: '&5Rainbow Colours!'
    animate1:
        material: RED_STAINED_GLASS_PANE
        name: '&cRainbow Colours!'
    # Continue to animate6

### Using Variables & Data

#### Placeholder Variables:
Create and pass:
commands:
- open= panel-3 [example1:PlaceHolder Value] [mat:STONE]

Use: %cp-example1% and %cp-mat%

Edit in current panel:
commands:
- placeholder= [mat:BEACON]

#### Data Variables:
Set permanent data:
- add-data= [dataName] [value] [optional player]
- set-data= [dataName] [value] [optional player]
- math-data= [dataName] [operation] [optional player]
- del-data= [dataName] [optional player]
- clear-data= [player name]

View data:
%cp-data-[dataName]%
%cp-data-[dataName],[playerName]%

Set via placeholder:
%cp-setdata-[dataName],[newValue]%

### Creating Logic Sections

Basic has section:
'20':
    material: RED_WOOL
    name: "Your username is not RockyHawk"
    has0:
        value0: RockyHawk
        compare0: '%cp-player-name%'
        material: LIME_WOOL
        name: "Your username is RockyHawk"

With nested logic:
has0:
    value0: RockyHawk
    compare0: '%cp-player-name%'
    material: LIME_WOOL
    has0:
        value0: '%cp-player-name% HASPERM'
        compare0: gamemode.creative
        material: BLACK_WOOL
        name: "RockyHawk with gamemode permission"

Using operators:
has0:
    value0: 'RockyHawk OR TinyTank800 OR Notch'
    compare0: '%cp-player-name%'
    material: GOLD_BLOCK

has0:
    value0: 'NOT RockyHawk'
    compare0: '%cp-player-name%'
    material: GOLD_BLOCK

has0:
    value0: '%cp-player-balance% ISGREATER'
    compare0: '500 AND'
    value1: '%cp-player-name%'
    compare1: 'RockyHawk'

## Command Tags Reference

### General Tags

open=: Open panel with placeholders and location
Format: open= <panel> [placeholder:value] {Top/Middle/Bottom}

close=: Close specific panel location
Format: close= <Top/Middle/Bottom>

cpc: Close current panel

refresh: Force refresh panel and hotbar items

server=: BungeeCord server teleport with permission
Format: server= <name> [permission]

force-server=: Force BungeeCord teleport
Format: force-server= <name>

hasperm=/hasnoperm=: Check permissions
Format: hasperm= <permission>

delay=: Delay command execution
Format: delay= <ticks> <command>

eval-delay=: Delay with placeholder check
Format: eval-delay= <ticks> <placeholder> <command>

sudo=: Execute as player
Format: sudo= <command>

console=: Execute in console
Format: console= <command>

skript=: Run Skript command
Format: skript= <command>

broadcast=: Broadcast to all
Format: broadcast= <message>

broadcast-perm=: Broadcast to permission holders
Format: broadcast-perm= <permission> <message>

nopapi=: Disable PlaceholderAPI processing

setitem=: Set panel slot item
Format: setitem= <custom_item> <slot> <Top/Middle/Bottom>

give-item=: Give custom item
Format: give-item= <custom_item> <amount>

enchant=: Modify slot enchantments
Format: enchant= <slot> <position> <ADD/REMOVE/CLEAR> <enchant> <level>

setcustomdata=: Set custom model data
Format: setcustomdata= <slot> <position> <data>

sound=: Play sound
Format: sound= <name> [volume] [pitch]

stopsound=: Stop sound
Format: stopsound= <name>

teleport=: Teleport player
Format: teleport= <x> <y> <z> [world:name] [yaw:value] [pitch:value]

send=: Send chat as player
Format: send= <message>

minimessage=: Use Paper MiniMessage API
Format: minimessage= <text>

msg=: Send message to player
Format: msg= <message>

title=: Display title
Format: title= <player> <fadeIn> <stay> <fadeOut> <title>\n<subtitle>

op=: Execute with OP (use with caution!)
Format: op= <command>

### Economy Tags

paywall=: Require money
Format: paywall= <price>

data-paywall=: Require data value
Format: data-paywall= <data_name> <price>

item-paywall=: Require items
Format: item-paywall= <item> <amount> [IGNORENBT]
Can use custom items: item-paywall= <custom_item_name> <amount>

xp-paywall=: Require XP
Format: xp-paywall= <amount> <level:point>

tokenpaywall=: Require tokens
Format: tokenpaywall= <amount>

### Data Tags

placeholder=: Edit current panel placeholder
Format: placeholder= [name:value]

add-placeholder=: Add if not exists
Format: add-placeholder= [name:value]

set-data=: Set data value
Format: set-data= <name> <value> [player]

add-data=: Add data if not exists
Format: add-data= <name> <value> [player]

math-data=: Math operations (+, -, *, /)
Format: math-data= <name> <operation> [player]
Examples: +1, -15, *3, /5

del-data=: Delete data
Format: del-data= <name> [player]

clear-data=: Clear all data
Format: clear-data= [player]

### Click Tags (must come first)

right=: Right-click only
rightshift=: Right-shift-click only
left=: Left-click only
leftshift=: Left-shift-click only
middle=: Middle-click only

Example:
commands:
- 'msg= &cAny click type'
- 'right= msg= Right clicked!'

## Placeholder Reference

### Player Placeholders
%cp-player-displayname%: Display name
%cp-player-name%: Player name
%cp-player-x%: X position
%cp-player-y%: Y position
%cp-player-z%: Z position
%cp-player-input%: Player input value
%cp-player-world%: Current world
%cp-player-balance%: Economy balance (needs Vault)

### Online Player Placeholders
%cp-player-online-[n]%: Player in slot n
%cp-player-online-[n]-visible%: Non-vanished player in slot n

### Inventory Check Placeholders
%cp-checkinv-<material:amount>%: Check for items
%cp-material-<slot>%: Material in slot
%cp-nbt-<slot:type:key>%: NBT value (types: string, integer, double, float, long, short, boolean, byte)
%cp-stack-<slot>%: Stack size in slot
%cp-name-<slot>%: Item name in slot
%cp-lore-<slot>%: Item lore (uses \n for lines)
%cp-damaged-<slot>%: Is item damaged (true/false)
%cp-potion-<slot>%: Potion type or "empty"
%cp-modeldata-<slot>%: Model data value
%cp-identical-<custom_item>,<slot>%: Compare to custom item

### Data Placeholders
%cp-data-<name>%: Get player data
%cp-data-<name>,<player>%: Get specific player's data
%cp-setdata-<name>,<value>%: Change data
%cp-mathdata-<name>,<operation>%: Math on data

### Utility Placeholders
%cp-random-<min>,<max>%: Random number
%cp-uuid-<player>%: Player UUID or 'unknown'
%cp-online-players%: Players online
%cp-online-players-visible%: Non-vanished players
%cp-panel-position%: Returns Top/Middle/Bottom
%cp-clicked%: Clicked material (commands only)
%cp-tag%: Plugin tag [CommandPanels]
%cp-server-<IP>:<PORT>%: Server online check (true/false)

### Using in Other Placeholders
Use secondary symbols: %cp-data-bans,{cp-player-name}%

### External PlaceholderAPI Format
Convert for use in other plugins:
Before: %cp-data-example%
After: %commandpanels_data-example%

Before: %cp-setdata-example,test1%
After: %commandpanels_setdata-example,test1%

## Commands & Permissions

### Basic Commands
/cp: Display command list
Permission: -

/cp [panel]: Open panel
Permission: commandpanel.panel.[panel_perm]

/cp [panel] [player]: Open for other player
Permission: commandpanel.other

/cp [panel] item [player]: Get hotbar item
Permission: commandpanel.item.[panel_perm]

### Management Commands
/cpl: List loaded panels
Permission: commandpanel.list

/cpg [rows]: Generate panel (1-6 rows or from chest)
Permission: commandpanel.generate

/cpu [player] [position]: Refresh player's panel
Permission: commandpanel.refresh
Positions: top, middle, bottom, all

/cpr: Reload plugin
Permission: commandpanel.reload

### Version & Update Commands
/cpv: Check version
Permission: commandpanel.version

/cpv latest: Auto-update to latest
Permission: commandpanel.update

/cpv [version]: Force specific version
Permission: commandpanel.update
Cancel pending: /cpv cancel

### Import & Data Commands
/cpi [file] [url]: Import panel from URL
Permission: commandpanel.import

/cpdata [operation] [player] [data] [value]: Manage data
Permission: commandpanel.data
Operations: set, add, get, remove, clear
Silent flag: -s

### Debug & Edit Commands
/cpd: Toggle debug mode
Permission: commandpanel.debug

/cpe [panel]: Open editor
Permission: commandpanel.edit

### Block Commands
/cpb add [panel]: Add panel to block
Permission: commandpanel.block.add

/cpb remove: Remove from block
Permission: commandpanel.block.remove

/cpb list: List block panels
Permission: commandpanel.block.list

### Master Permission
commandpanel.*: All CommandPanel permissions

## Floodgate Forms Examples

### SimpleForm (Buttons)
floodgate:
    simple: 'This is a Button GUI'
    '0':
        text: '&dYou can use colours!'
        commands:
        - 'msg= &dColour Works'
        icon:
            type: PATH
            texture: 'textures/items/redstone_dust.png'
    '1':
        text: 'This button has no icon!'
        commands:
        - 'msg= Your name is %cp-player-name%'

### SimpleForm with Logic
floodgate:
    simple: 'Simple Form with Logic'
    '0':
        text: 'Your name is not RockyHawk!'
        commands:
        - 'msg= Not RockyHawk'
        has0:
            compare0: '%cp-player-name%'
            value0: 'RockyHawk'
            text: 'Your name is RockyHawk!'
            commands:
            - 'msg= You are RockyHawk'

### CustomForm (Interactive Elements)
floodgate:
  '0':
    type: dropdown
    options:
    - survival
    - creative
    text: 'Set your gamemode!'
    commands:
    - 'gamemode %cp-input% %cp-player-name%'
  '1':
    type: input
    placeholder: 'Type here'
    default: ''
    text: 'Type something'
    commands:
    - 'msg= You said: %cp-input%'
  '2':
    type: slider
    min: 1
    max: 10
    step: 1
    default: 5
    text: 'Slide the Slider'
    commands:
    - 'msg= You chose: %cp-input%'
  '3':
    type: toggle
    default: true
    text: 'Do you like cats?'
    commands:
    - 'msg= Your choice: %cp-input%'

Note: All default values and required fields must be included or forms won't work. Java players always see normal GUI.