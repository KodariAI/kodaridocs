About Scripting
BetonQuest's quests do not have a predefined structure and can be freely designed. This is made possible by a powerful quest scripting language.

Quest Structure with a Traditional Quest Plugin


Rebel Quest
Explanation
Quest Starts

Spy on Rebels

Inform King

Quest Ends


Quest Structure with BetonQuest


Rebel Quest
Explanation
Dragon Hunter Quest
Too slow

In Time

Quest Starts

Spy on Rebels

Decision: Inform King

Decision: Betray King

King rewards you

Hunt the King down

Quest Fails

You become King


Building Blocks🔗
The BetonQuest scripting language is based on a few basic building blocks which are outlined in the following sections. They can be freely combined to create any quest you want. All of these are defined using an instruction text.

Instruction Text Example

conditions: 
  myCondition: "health 10" 
events:
  myEvent: "hunger set 20"
objectives:
  myObjective: "mobkill ZOMBIE 10"
Events🔗
In certain moments you will want something to happen. Updating the journal, setting tags, giving rewards, all these are done using events. You define them by specifying a name and instruction string like shown above. At the end of the instruction string you can add the conditions: (with or without s at the end) attribute followed by a list of condition names separated by commas, like conditions:angry,!quest_started. This will make an event fire only when these conditions are met.

Explore all Events

Objectives🔗
Objective are goals that player must complete. At first, they must be started for a player with the objective event. When the player completes the objective, all defined events are run. For example, you could reward the player by giving them an item.

You define them in the objectives section as shown above. At the end of the instruction text you can add conditions and events for the objective. Conditions will limit when the objective can be completed (e.g. killing zombies only at given location), and events will fire when the objective is completed (e.g. giving a reward, or setting a tag which will enable collecting a reward from an NPC). You define these like that: conditions:con1,con2 events:event1,event2 at the end of instruction text. Separate them by commas and never use spaces!

If you want to start an objective right after it was completed you can add the persistent argument at the end of its instruction string. For example, you could create a custom respawn system with a die objective. When the player dies, they will be teleported to the spawnpoint and the die objective will be started again. The persistent argument prevents the objective from being completed, although it will run all its events. To cancel such an objective you need to use objective delete event.

Example

objectives:
  mineDiamonds: 'block DIAMONDS -10 events:reward'
  die: 'die cancel respawn:100;200;300;world;90;0 events:sendRespawnMessage conditions:hasCustomTotem'
Global objectives🔗
If you want an objective to be active for every player right after joining, you can create a global objective. This is done by adding global argument to the instruction of the objective. When you then reload BetonQuest it is started for all online players and also will be started for every player who joins.

Possible use cases would be a quest which starts if a player reaches a specific location or breaks a specific block.

To prevent the objective from being started every time a player joins, a tag is set for the player whenever the objective is started. With this tag, the objective will not be started again.
These tags follow the syntax <package>.global-<id>, where <id> is the objectives id and <package> the package where the objective is located.

Example

objectives:
  startQuestByMining: 'location 100;200;300;world 5 events:start_quest_mine_folder global'
Variables🔗
Use with caution!

The updating behaviour of already started objectives might change in BetonQuest 3. Perhaps variable changes will be reflected in the amount of an active objective. This is not the case right now.

Objectives support variables for their amount options. When the objective is started for a player, the amount is set to the variable's current value. The amount of an active objective will not be updated if the variable changes. Also, when the variable contains an invalid value for the given objective (e.g. a negative value) a default value of 1 is used.

Examples

objectives:
  killMonsters: 'mobkill ZOMBIE %math.calc:(100-{point.reputation.amount})*2% events:endSiege'
  breakObsidian: 'block OBSIDIAN %randomnumber.whole.-60~-40% events:dailyReward'
  eatSteak: 'consume steak amount:%randomnumber.whole.2~6% events:health_boost'
Explore all Objectives

Conditions🔗
Conditions allow you to control what options are available to players in conversations, how the NPC responds or if the objective will be completed. They check if a given in-game state is present and return true or false as a result.

You can negate the condition (revert its output) by adding an exclamation mark (!) at the beginning of its name. This only works in the place where conditions are used (i.e. in conversations, not in the conditions section). If you do so, make sure to enclose the condition in quotes, otherwise YAML will give you a syntax error.

Example

conditions:
  hasFullHealth: "health 20"
events:
  helpWithHealing: "hunger set 20 conditions:!hasFullHealth"
Explore all Conditions

Tags🔗
Tags are little pieces of text you can assign to player. They are particularly useful to determine if player has started or completed quest. They are given with tag event and checked with tag condition. All tags are bound to a package, so if you add the questCompleted tag from within a package named monsterQuest, the tag will look like monsterQuest.questCompleted.

Read working across packages to learn how to work with tags across packages.

Points🔗
Points are numbers that can be assigned to a player. You can set them with the point event. you want. You can also take the points away, even to negative numbers. Of course then you can check if player has (or doesn't have) certain amount with the point condition. They can be used as counter for specific number of quest done, as a reputation system in villages or even an NPC's attitude to player.

Packages & Templates
Packages🔗
All quests you create are organized into packages. A single package can contain one or multiple quests - it's up to your liking. It is very important to have a good understand of packages. Read the packages chapter carefully.

Structure🔗
A package is a folder with a "package.yml" file. It must be placed inside the "BetonQuest/QuestPackages" directory.
Additionally, you can create extra files or sub-folders inside a package to organize your quest the way you want. Sub-folders of packages that contain a "package.yml" are separate packages, they do not belong to the surrounding package in any way.

Let's take a look at a few examples:

Structure Examples

Every quest package is surrounded with a blue box.


Simple Package
Complex Package
Nested Packages
A very simple package. It's defined by the package.yml and has two additional files.



Defining features🔗
You can freely define features (events, conversations, items etc.) in all files of a quest package. However, they need to be defined in a section that defines their type.

The names of these features must be unique in that package, no matter which file they are in.

Example
Working across Packages🔗
Accessing features from other packages can be very helpful to link quests together. All events, conditions, objectives, items and conversations can be accessed.

You never need to access a specific file since feature names are unique within a package.

Top-Level Packages🔗
You can access top-level packages (placed directly in "QuestPackages") by prefixing the feature's name with a greater than (>) and the package name.

Example
Packages in Sub-folders🔗
You can access packages in sub-folders by prefixing the feature's name with the package name and the path from the "QuestPackages" folder to the package.

Example
Relative paths🔗
You can specify relative paths to a package instead of full paths. The underscore (_) means "one folder up" from the current packages "package.yml". In turn, a leading dash (-) combined with a folder name navigates "one folder down" into the given folder. Each package in the path must be separated by a dash.

This can be useful when distributing or moving packages. Instead of rewriting every package path to match the current location, relative paths will still work.

Example
Disabling Packages🔗
Packages are enabled by default, you can disable a package if you don't want it to be loaded. Set enabled inside the package section to true or false to enable or disable the package.


package:
  ## Optionally add this to the package.yml
  enabled: false
Package Version🔗
Each package has a version inside the package section that is used by the automatic migrator. When no version is set the newest version will be set on loading. Any new package section will be added at the end of the file, so you probably want to move that to the file's top.

Info

When updating from a version before versioning see Migration to BQ 3.0.


package:
  version: 3.0.0-QUEST-1 # Don't change this! The plugin's automatic quest updater handles it.
Templates🔗
You should have experience creating and using packages before you start using templates. Templates are a way to create packages that can be used as a base for other packages to reduce the amount of repetitive work. Therefore, they are a great way to centralize logic or create utilities.

Using Templates🔗
Templates work exactly like packages, except that they are placed in the "BetonQuest/QuestTemplates" folder instead of the "BetonQuest/QuestPackages" folder and that they are not loaded as a ready to use package. Instead, they are used as a base for other packages by referring to them in the templates section inside the package section.


package:
  templates:
    - MyTemplate
    - SecondTemplate
If you use the above in a package, the MyTemplate and SecondTemplate templates would be used as a base for the package. This means that all the events, objectives, conditions, etc. from the templates would be added to the package. If the package already contains an event/objective/condition with the same name as one from the template, the package's events, objectives, conditions, etc. will be used instead of the one from the template.

If the same events, objectives, conditions, etc. is defined in multiple templates, the one from the lists first template will be used.

You can also use templates in templates. Also in this case, the events, objectives, conditions, etc. that are defined in the current template will be used instead of the ones from the template that is being used as a base.

Events List🔗
Burn: burn🔗
Parameter	Syntax	Default Value	Explanation
duration	duration:number		The duration the player will burn (in seconds). Can be a variable.
Example

events:
  burn: "burn duration:4"
  punishing_fire: "burn duration:%point.punishment.amount%"
Cancel a quest: cancel🔗
This event works in the same way as a quest canceler in the backpack.

Running this event is equal to the player canceling a quest using the backpack.

Parameter	Syntax	Default Value	Explanation
canceler	CancelerID		The Quest Canceler to execute.
bypass	Keyword (bypass)	Disabled	If the canceler conditions should be ignored. If enabled the canceler will be executed, even when its conditions are not met.
Example

cancelQuest: "cancel woodQuest bypass"
Cancel the Conversation: cancelconversation🔗
Cancels the active conversation of the player.

Example

  events:
    cancel: "cancelconversation"
Chat player message chat🔗
This event will send the given message as the player. Therefore, it will look like as if the player did send the message. The instruction string is the command, without leading slash. You can only use %player% as a variable in this event. Additional messages can be defined by separating them with | character. If you want to use a | character in the message use \|.

If a plugin does not work with the sudo / command event you need to use this event.

Example


sendMSG: "chat Hello!"
sendMultipleMSGs: "chat Hi %player%|ban %player%|pardon %player%"
sendPluginCommand: "chat /someCommand x y z"
Chest Clear: chestclear🔗
persistent, static

This event removes all items from a chest at specified location. The only argument is a location.

Example


chestclear 100;200;300;world
Chest Give: chestgive🔗
persistent, static

This works the same as give event, but it puts the items in a chest at specified location. The first argument is a location, the second argument is a list of items, like in give event. If the chest is full, the items will be dropped on the ground. The chest can be any other block with inventory, i.e. a hopper or a dispenser. BetonQuest will log an error to the console when this event is fired but there is no chest at specified location.

Example


chestgive 100;200;300;world emerald:5,sword
Chest Take: chesttake🔗
persistent, static

This event works the same as take event, but it takes items from a chest at specified location. The instruction string is defined in the same way as in chestgive event.

Example


chesttake 100;200;300;world emerald:5,sword
Compass: compass🔗
When you run this event, you can add or remove a compass destination for the player. You may also directly set the player's compass destination as well. When a destination is added the player will be able to select a specified location as a target of his compass. To select the target the player must open his backpack and click on the compass icon. The first argument is add,del or set, and second one is the name of the target, as defined in the compass section. Note that if you set a target the player will not automatically have it added to their choices.

The destination must be defined in compass section. You can specify a name for the target in each language or just give a general name, and optionally add a custom item (from items section) to be displayed in the backpack. Example of a compass target:


compass:
  beton:
    name:
      en-US: Target
      pl-PL: Cel
    location: 100;200;300;world
    item: scroll
Example


compass add beton
Command: command🔗
persistent, static

Runs specified command from the console. The instruction string is the command, without leading slash. You can use variables here, but variables other than %player% won't resolve if the event is fired from delayed folder and the player is offline now. You can define additional commands by separating them with | character. If you want to use a | character in the command use \|.

Looking for run command as player?

Example


command kill %player%|ban %player%
Conversation: conversation🔗
Starts a conversation at location of the player. The first argument is ID of the conversation. This bypasses the conversation permission!

The optional option argument is a NPC option where the conversation will start. When using this argument the conversation will start without its header.

Example


conversation village_smith
conversation tutorial option:explain_world
Damage player: damage🔗
Damages the player by specified amount of damage. The only argument is a number (can have floating point).

Example


damage 20
Delete Point: deletepoint🔗
persistent, static

Clear all player points in a specified category.

Example


deletepoint npc_attitude
Delete Globalpoint: deleteglobalpoint🔗
persistent, static

Removes the specified category from the global points list.


deleteBonus: "deleteglobalpoint bonus"
Door: door🔗
persistent, static

This event can open and close doors, trapdoors and fence gates. The syntax is exactly the same as in lever event above.

Example


door 100;200;300;world off
Drop Item: drop🔗
static

Drops the defined items at a defined location. The event takes two parameters: items and location. Items is a list of items to be dropped. Every item can optionally be followed by a colon to define an amount <item>:<amount> otherwise the amount is 1. The optional location defines where the items will be dropped. It must be specified in the unified location format. If no location is given then the items will be dropped at the player's current location.

If the drop event is used in a schedule then the items will be dropped at the given location. If no location is given then the items will be dropped for every player at their respective locations.


drop items:magical_sword location:200;17;300;world
drop items:loot_rare,loot_common:3
drop items:myItem location:%objective.MyQuestVariables.DropLocation%
Remove Potion Effect: deleffect🔗
Removes the specified potion effects from the player. Use any instead of a list of types to remove all potion effects from the player. Alternatively to any, you just can leave it blank.

Example


deleffect ABSORPTION,BLINDNESS
deleffect any
deleffect
Potion Effect: effect🔗
Adds a specified potion effect to player. First argument is potion type. You can find all available types here. Second is integer defining how long the effect will last in seconds. Third argument, also integer, defines level of the effect (1 means first level). Add a parameter ambient to make potion particles appear more invisible (just like beacon effects). To hide particles add a parameter hidden. To hide the icon for the effect add noicon.

Example


effect BLINDNESS 30 1 ambient icon
Eval Event: eval🔗
This event allows you to resolve an expression containing variables, and the result will then be interpreted again as an event.

Example

events:
  simpleEval: eval notify "This is actually an eval event evaluating to a notify event."
  complexEval: eval point ranking 5 action:add %objective.settings.notify% 
Give experience: experience🔗
This event allows you to manipulate player's experience. First you specify a number as the amount, then the modification action. You can use action:addExperience, action:addLevel, action:setExperienceBar and action:setLevel as modification types.

To use this correctly, you need to understand this:

A player has experience points.
Experience levels, shown are shown as a number in the experience bar. Every level requires more experience points than the previous.
The experience bar itself shows the percentage of the experience points needed to reach the next level.
While action:addExperience only adds experience points, action:addLevel adds a level and keeps the current percentage. action:setExperienceBar sets the progress of the bar. Decimal values between 0 and 1 represent the fill level. This changes the underlying experience points, it's not just a visual change. action:setLevel sets only the level, expect if you specify a decimal number, then the experience bar will be set to the specified percentage.

Example

add15XP: "experience 15 action:addExperience"
add4andAHalfLevel: "experience 4.5 action:addLevel"
remove2Level: "experience -2 action:addLevel"
setXPBar: "experience 0.5 action:setExperienceBar"
resetLevel: "experience 0.01 action:setLevel"
Explosion: explosion🔗
persistent, static

Creates an explosion. It can make fire and destroy blocks. You can also define power, so be careful not to blow your server away. Default TNT power is 4, while Wither on creation is 7. First argument can be 0 or 1 and states if explosion will generate fire (like Ghast's fireball). Second is also 0 or 1 but this defines if block will be destroyed or not. Third argument is the power (float number). At the end (4th attribute) there is location.

Example


explosion 0 1 4 100;64;-100;survival
 Run multiple events: folder🔗
persistent, static

This event wraps multiple events inside itself. Once triggered, it simply executes it's events. This is usefully to easily refer to a bunch of events at once, e.g. in a conversation.

Events marked as persistent will be fired even after the player logs out. Beware though, all conditions are false when the player is offline (even inverted ones), so those events should not be blocked by any conditions!
You can use the cancelOnLogout argument to stop the folder executing any remaining events if the player disconnects.

Parameter	Syntax	Default Value	Explanation
events to run	eventName1,event2		One or multiple events to run. Contains event names seperated by commas.
delay	Keyword	without delay	The delay before the folder starts executing it's events.
period	period:number	without delay	The time between each event of the folder.
time unit	unit:unit	Seconds	The unit of time to use for delay and period. Either ticks, minutes or seconds.
random	random:number	Disabled	Enables "random mode". Will randomly pick the defined amount of events .
cancelOnLogout	Keyword	Disabled	If enabled, the folder will stop executing events if the player disconnects.
cancelConditions	cancelConditions:cond1,cond2	Disabled	If enabled, the folder will stop executing events if the conditions are true.
Examples

events:
  simpleFolder: "folder event1,event2,event3" 
  runEvents: "folder event1,event2,event3 delay:5 period:1" 
  troll: "folder killPlayer,banPlayer,kickPlayer delay:5 random:1" 
  wait: "folder messagePlayer,giveReward delay:1 unit:minutes" 
If-else through a list of events: first🔗
This event wraps multiple events inside itself, similar folder. Unlike folder, it attempts to execute each event, starting from the first onward. Once it successfully executes one event, it stops executing the rest. This is useful for collapsing long if-else chains into single events.

This event is especially powerful when it is used in conjunction with the conditions: keyword, which can be used with any event.

Example

events: 
  firstExample: "first event1,event2,event3"
  event1: "point carry boxes 10 action:add conditions:firstCondition"
  event2: "point carry boxes 20 action:add conditions:secondCondition"
  event3: "point carry boxes 40 action:add conditions:thirdCondition"
Equivalent using if-else

events:
  firstExample: "if firstCondition event1 else firstExample2"
  firstExample2: "if secondCondition event2 else firstExample3"
  firstExample3: "if thirdCondition event3"
  event1: "point carry boxes 10 action:add"
  event2: "point carry boxes 20 action:add"
  event3: "point carry boxes 40 action:add"
Give Items: give🔗
Gives the player predefined items. They are specified exactly as in item condition - list separated by commas, every item can have amount separated by colon. Default amount is 1. If the player doesn't have required space in the inventory, the items are dropped on the ground, unless they are quest items. Then they will be put into the backpack. You can also specify notify keyword to display a simple message to the player about receiving items. The optional backpack argument forces quest items to be placed in the backpack.

Example


give emerald:5,emerald_block:9
give important_sign notify backpack
Give journal: givejournal🔗
This event simply gives the player his journal. It acts the same way as /j command would.

Example


givejournal
Global point: globalpoint🔗
persistent, static

This works the same way as the normal point event but instead to manipulating the points for a category of a specific player it manipulates points in a global category. These global categories are player independent, so you could for example add a point to such a global category every time a player does a quest and give some special rewards for the 100th player who does the quest.

Example


globalpoint global_knownusers 1 action:add
globalpoint daily_login 0 action:set
globalpoint reputaion 2 action:multiply
Global tag: globaltag🔗
persistent, static

Works the same way as a normal tag event, but instead of setting a tag for one player it sets it globally for all players.

Example


globaltag add global_areNPCsAgressive
Hunger: hunger🔗
This event changes the food level of the player. The second argument is the modification type. There are give, take and set. The second argument is the amount. With set can the food level be anything. If give or take is specified the final amount won't be more than 20 or less than 0. If the hunger level is below 7, the player cannot sprint.

Example


hunger set 20
hunger give 5
If else: if🔗
persistent, static

This event will check a condition, and based on the outcome it will run the first or second event. The instruction string is if condition event1 else event2, where condition is a condition ID and event1 and event2 are event IDs. else keyword is mandatory between events for no practical reason. Keep in mind that this event is persistent and static but probably the condition or the events are not.

Example


if sun rain else sun
Item durability: itemdurability🔗
Adds or removes durability from an item in the slot. The first argument is the slot, the second the change of durability and the third the amount. Optional arguments are ignoreUnbreakable to ignore the unbreakable flag and unbreaking enchantment and ignoreEvents to bypass event logic, so other plugins will not be able to interfere. Available slot types: HAND, OFF_HAND, HEAD, CHEST, LEGS, FEET.

Info

Both increasing and decreasing durability will be affected by the unbreaking enchantment. To prevent this behaviour use the ignoreUnbreakable argument.

Example


itemdurability HAND ADD 1
itemdurability CHEST SUBTRACT %randomnumber.whole.15~30% ignoreUnbreakable ignoreEvents
Journal: journal🔗
static

Adds or deletes an entry to/from a player's journal. Journal entries have to be defined in the journal section. The first argument is the action to perform, the second one is the name of the entry if required. Changing journal entries will also reload the journal.

Possible actions are: - add: Adds a page to the journal. - delete: Deletes a page from the journal. - update: Refreshes the journal. This is especially useful when you need to update the main page.

Example


journal add quest_started
journal delete quest_available
journal update
Kill: kill🔗
Kills the player. Nothing else.

Language Event: language🔗
persistent

This event changes player's language to the specified one. There is only one argument, the language name.

Example


language en
Lever: lever🔗
persistent, static

This event can switch a lever. The first argument is a location and the second one is state: on, off or toggle.

Example


lever 100;200;300;world toggle
Lightning: lightning🔗
static

Strikes a lightning at given location. The first argument is the location. By adding noDamage the lightning is only an effect and therefor does no damage.

Examples

events:
  strikeLightning: lightning 100;64;-100;survival
  showEntrance: lightning 200;65;100;survival noDamage
Sending Notifications: notify🔗
You can send notifications using the notify event. This is how to use it:

Warning

All colons (:) in the message part of the notification need to be escaped, including those inside variables. One backslash (\) is required when using no quoting at all (...) or single quotes ('...'). Two backslashes are required (\\) when using double quotes ("...").
You also need to escape the backslash itself, if you use double quotes for some things like \n.

Examples:
eventName: notify Peter:Heya %player%! ➡ eventName: notify Peter\:Heya %player%!
eventName: 'notify Peter:Heya %player%!' ➡ eventName: 'notify Peter\:Heya %player%!'
eventName: "notify Peter:Heya %player%!" ➡ eventName: "notify Peter\\:Heya %player%!"
otherEvent: notify You own %math.calc:5% fish! ➡ otherEvent: You own %math.calc\:5% fish!
newLine: "notify Some multiline \n message" ➡ newLine: "notify Some multiline \\n message"

Parameter	Syntax	Default Value	Explanation
message	Any text with spaces!		The message that will be displayed. Supports variables and translations. Must be first
category	category:info	None	Will load all settings from that Notification Category. Can be a comma-seperated list. The first existent category will be used.
io	io:bossbar	io:chat	Any NotifyIO Overrides the "category". settings.
any io specific settings	setting:value	None	Some notifyIO's provide specific settings. Can be used multiple times. Overrides the "category" settings.
Usage Examples🔗
Check out the notify IO specific options if you haven't yet. You must understand these two if you want to use the Notify system to it's full extend. Advanced users may also use Notify Categories to make their lives easier.


#The simplest of all notify events. Just a chat message:
customEvent: "notify Hello %player%!"  

#It's the same as this one since 'chat' is the default IO.
theSame: "notify Hello %player%! io:chat"

#This one displays a title and a subtitle:
myTitle: "notify This is a title.\\nThis is a subtitle. io:title"

#Plays a sound:
mySound: "notify io:sound sound:x.y.z"

#This one explicitly defines an io (bossbar) and adds one bossbarIO option + one soundIO option:
myBar: "notify This is a custom message. io:bossbar barColor:red sound:block.anvil.use"

#Some events with categories.
myEvent1: "notify This is a custom message! category:info"
myEvent2: "notify This is a custom message! category:firstChoice,secondChoice"

#You can also override category settings:
myEvent3: "notify Another message! category:info io:advancement frame:challenge"

#Use multiple languages:
multilanguage: "notify {en} Hello english person! {de} Hello german person! {es} Hello spanish person!"
Translations🔗
Notifications can be translated with this syntax:


example: "notify {en} ABC {de} DEF"
The value in {} is a language key from messages.yml. Any text after the language key until the next language key belongs to the specified language. There must be a space between the language key and the message. In this example, english users would see ABC and german ones would see DEF.
Broadcasts🔗
persistent, static

You can broadcast notifications to all players on the server using the notifyall event. It works just like the notify event. Variables are resolved for each online player, not for the player the event is executed for.

Example

events:
  announceDungeon: "notifyall A new dungeon has opened!"
Log message to console: log🔗
persistent, static

Prints a provided message to the server log. Any variables used in the message will be resolved. Note that when used in static context (by schedules) replacing player dependent variables won't work as the event is player independent.

Parameter	Syntax	Default Value	Explanation
level	level:logLevel	INFO	Optionally the log level can be specified but only before the message.
There are 4 levels: debug, info, warning and error
Example

  events:
    logPlayer: "log %player% completed first quest."
    debug: "log level:DEBUG daily quests have been reset"
NPC Teleport: npcteleport🔗
persistent, static

This event will teleport the Npc to the given location.

Parameter	Syntax	Default Value	Explanation
Npc	Npc		The ID of the Npc
Location	Unified Location Formatting		The location to which the Npc will be teleported
Spawn	Keyword (spawn)	Disabled	If the NPC should be spawned if not in the world
Example

teleportToSpawn: npcteleport mayorHans 100;200;300;world
Objective: objective🔗
persistent, static

Adds, removes or completes the specified objective(s).

Parameter	Syntax	Default Value	Explanation
action	Keyword: add,remove,complete		The action to do with the objective(s).
objective(s)	objectiveName or obj1,obj2		The objective(s) to run the action on.
Using this in static contexts only works when removing objectives!


events:
  startQuest: "objective add killTheDragon,goToDungeon"
  progressQuest: "objective complete killTheDragon"
OPsudo: opsudo🔗
This event is similar to the sudo event, the only difference is that it will fire a command as the player with temporary OP permissions. Additional commands can be defined by separating them with | character. If you want to use a | character in the message use \|. Variables are supported.

Looking for run as normal player? Looking for console commands?

Example


opsudo spawn
Party event: party🔗
This is part of the party system. Runs the specified list of events (third argument) for every player in the party. The last optional argument amount specifies a maximum number of players to select. Selected players will be picked from the party if they are in range and meet the conditions. Players are selected according to their distance from the player who triggered the event. For example, if the 'amount' is two, the player who triggered the event and the player closest to that player will be selected. A negative amount will select all players and therefore act as if there was no amount given.

Example


party 10 has_tag1,!has_tag2 give_reward
party 10 has_tag1,!has_tag2 give_special_reward amount:3
Pick random: pickrandom🔗
persistent, static

Another container for events. It picks one (or multiple) of the given events and runs it. You must specify how likely it is that each event is picked by adding the weighting before the event's id. The weighting is a floating point number, that is the ratio of the event's chance to be picked.

It picks one event from the list by default, but you can add an optional amount: if you want more to be picked. Note that only as many events as specified can be picked and amount:0 will do nothing.

Example


pickrandom 20.5~event1,0.5~event2,79~event3 amount:2
pickrandom %point.factionXP.amount%~event1,0.5~event2,79~event3,1~event4 amount:3
Point: point🔗
persistent

This event allows you to manipulate player's points in a specified category. First you can specify a number of points, then the modification action. For that, you can use action:add, action:subtract, action:set and action:multiply as modification types. This event also supports an optional notify argument that will display information about the change using the notification system.

Example

gainAttitude: "point npc_attitude 5 action:add"
loseAttitude: "point npc_attitude 2 action:subtract"
resetCombo: "point combo 0 action:set"
boostPoints: "point points 1.25 action:multiply notify"
Remove entity: removeentity🔗
persistent, static

Removes or kill all entities (mobs) of given type at the location. Here you can look up all type's of entity's.

Can only effect loaded entities!

Parameter	Syntax	Default Value	Explanation
entity(s)	entity,entity		Required. List of entity's (separated by ,).
location	Unified Location Formatting		Required. The center location of the target entity's.
radius	Number		Required. The radius around the location. Can be a variable.
name	name:name		Name of the entity. All _ will be replaced with spaces.
marked	marked:mark		Mark of the entity (from the spawn event for example). Can be a variable.
kill	kill		Whether to remove or actually kill the entity (if possible).
Example

killArenaMobs: "removeentity ZOMBIE 100;200;300;world 10 name:Monster kill"
clearGameArea: "removeentity ARROW,SNOWBALL,WOLF,ARMOR_STAND 100;200;300;world 50 marked:minigame"
Run events: run🔗
persistent, static

This event allows you to specify multiple instructions in one, long instruction. Each instruction must be started with the ^ character (it divides all the instructions). It's not the same as the folder event, because you have to specify the actual instruction, not an event name. Don't use conditions here, it behaves strangely.

Example


run ^tag add beton ^give emerald:5 ^entry add beton ^kill
Run events for all online players: runForAll🔗
persistent, static

Runs the specified event (or list of events) once for each player on the server.

The most common use case is to run an event for all online players from a schedule. But you can also use it in conversations, objectives or other events.

To run the events only for a selection of players, use the where: option to filter for players that meet specific conditions.

Parameter	Syntax	Default Value	Explanation
events	events:events		Required. The events to be run, separated by ,.
where	where:conditions		A list of optional conditions (separated by ,) that are checked for every player.
The events supplied in events: are only executed for the players that meet all the given conditions.
Example

events:
    kickAll: "runForAll where:!isOp events:kickPlayer,restartQuest"
Warning

You can still append conditions to the runForAll event (e.g. runForAll events:kickPlayer conditions:!isOp).
This won't check the conditions for each player!
Instead it will check the conditions for the player that triggered the event or check them player independent if triggered player independent (e.g. by a schedule).

Run events player independent: runIndependent🔗
persistent, static

Runs the specified event (or list of events) player independent (as if it was run from a schedule).

This is usefully for events that behave differently when run player independent.

Events that behave different if run player independent
Parameter	Syntax	Default Value	Explanation
events	events:events		Required. The events to be run, separated by ,.
Example

events:
    resetQuestForAll: "runIndependent events:removeObjective,clearTags,resetJournal"
Warning

There are a lot of events and conditions that cannot be run (or checked) player independent.
If you try to run such an event player independent (or check such a condition) this won't work, and you will get an error message in the console.

For more information on player independent events check this.

Scoreboard: score🔗
persistent

This event works in the same way as point, the only difference being that it uses scoreboards instead of points. You can use action:add, action:subtract, action:set and action:multiply to change the value. It's only possible to change the value, you have to create the scoreboard target first.

Example

gotKill: "score kill 1 action:add"
gotKilled: "score kill 1 action:subtract"
resetKill: "score kill 0 action:set"
applyBonus: "score kill 1.2 action:multiply"
Scoreboard Tag: scoretag🔗
This scoreboard event adds or remove the scoreboard tag from a player. The kind of tags that are used by vanilla Minecraft and not the betonquest tags.

Parameter	Syntax	Default Value	Explanation
modifier	add or remove		Whether to add or remove the tag.
scoreboard tag	Tag name		The name of the scoreboard tag.
Example

addVanillaTag: "scoretag add vanilla_tag"
removeVanillaTag: "scoretag remove vanilla_tag"
Set Block: setblock🔗
persistent, static

Changes the block at the given position. The first argument is a Block Selector, the second a location. It's possible to deactivate the physics of the block by adding ignorePhysics at the end. Very powerful if used to trigger redstone contraptions.

Example


setblock REDSTONE_BLOCK 100;200;300;world
setblock SAND 100;200;300;world ignorePhysics
Modify Stage: stage🔗
You can set, increase or decrease the player's stage. The objective will not automatically complete when using set. By increasing it the player will be able to complete the objective. When increasing or decreasing the stage you can optionally specify an amount to increase or decrease by.
When decreasing the objective it will do nothing when the first stage is reached.
When the conditions of the stage objective are not met, the stage of the player can not be modified.
For more take a look at the stage objective.

Parameter	Syntax	Default Value	Explanation
stage objective	Objective		The name of the stage objective
action	set, increase or decrease		The action to perform
stage	Stage		The name of the stage to set when set is used
amount	Number	1	The amount to increase or decrease by
Example

events:
  setCookCookies: "stage bakeCookies set cookCookies"
  increase: "stage bakeCookies increase"
  decrease2: "stage bakeCookies decrease 2"
Spawn Mob: spawn🔗
persistent, static

Spawns specified amount of mobs of given type at the location. First argument is a location. Next is type of the mob. The last, third argument is integer for amount of mobs to be spawned. You can also specify name: argument, followed by the name of the mob. All _ characters will be replaced with spaces. You can also mark the spawned mob with a keyword using marked: argument supporting variables. It won't show anywhere, and you can check for only marked mobs in mobkill objective.

You can specify armor which the mob will wear and items it will hold with h: (helmet), c: (chestplate), l: (leggings), b: (boots), m: (main hand) and o: (off hand) optional arguments. These take a single item without amount, as defined in the items section. You can also add a list of drops with drops: argument, followed by a list of items with amounts after colons, separated by commas.

Example


spawn 100;200;300;world SKELETON 5 marked:targets
Example


spawn 100;200;300;world ZOMBIE name:Bolec 1 h:blue_hat c:red_vest drops:emerald:10,bread:2
Sudo: sudo🔗
This event is similar to command event, the only difference is that it will fire a command as the player (often referred to as player commands). Additional commands can be defined by separating them with | character. If you want to use a | character in the message use \|. Variables are supported.

Looking for run as op? Looking for console commands?

Example


sudo spawn
Tag: tag🔗
persistent, static

This event adds a tag to or deletes a tag from the player. The first argument after event's name must be add or delete. Next goes the tag name. It can't contain spaces (though _ is fine). Multiple tags can be added and deleted separated by commas (without spaces).

Example


tag add quest_started,new_entry
Take Items: take🔗
Removes items from the player’s inventory, armor slots or backpack. The items itself must be defined in the items section, optionally with an amount after a colon. Which inventory types are checked is defined by the invOrder: option. You can use Backpack, Inventory, Offhand and Armor there. One after another will be checked if multiple types are defined.

Note: If the items aren't quest items don't use takeevent with player options in conversations! The player can drop items before selecting the option and pickup them after the event fires. Validate it on the NPC’s reaction!

You can also specify notify keyword to display a simple message to the player about loosing items.

Example


take emerald:120,sword
take nugget:6 notify
take wand notify invOrder:Backpack
take money:50 invOrder:Backpack,Inventory
take armor invOrder:Armor,Offhand,Inventory,Backpack
Time: time🔗
persistent, static

Changes the time of the world. The time is represented in 24 hours format as a float number, so 0 is midnight, 12 is noon and 23 is 11 PM. For minutes, you can use floating point numbers, so 0.5 is half past midnight, 0.25 is quarter past midnight and so on. (0.1 hours is 6 minutes). It's possible to add or subtract time by using + or - prefix or to set the time by setting no prefix. Additionally, you can specify the world in which the time will be changed, by adding world:. Using the ticks argument changes the time like the vanilla command.

Example


time 6
time +0.1
time -12 world:rpgworld
time +%randomnumber.whole.100~2000% world:pvpworld ticks
 Teleport: teleport🔗
Teleports the player to the specified location. Ends any active conversations.

Do you only want to cancel the conversation?

Parameter	Syntax	Default Value	Explanation
location	Unified Location Formatting		The location to which the player will be teleported.
Example

events:
  toCity: "teleport 432;121;532;world" 
  toHell: "teleport 123;32;-789;world_the_nether;180;45" 
Variable: variable🔗
This event has only one purpose: Change values that are stored in variable objective variables. The first argument is the ID of the variable objective. The second argument is the name of the variable to set. The third argument is the value to set. Both the name and value can use %...% variables. To delete a variable you can use "". To store more complex values you can use quoting. Refer to the variable objective documentation for more information about storing variables. This event will do nothing if the player does not already have a variable objective assigned to them.

Example


variable CustomVariable MyFirstVariable Goodbye!
variable variable_objectiveID name %player%
variable other_var_obj desc ""
 Move the player: velocity🔗
Parameter	Syntax	Default Value	Explanation
vector	vector:(x;y;z)		The values of the vector, which are decimal numbers, can be interpreted as absolute numbers like the coordinate or as relative directions. For more understanding the relative direction is similar to ^ ^ ^ in minecraft or in other words (sideways;upwards;forwards). Can be a variable.
direction	direction:directionType	absolute	There are 3 types how the vector can get applied to the player:
absolute won't change the vector at all.
relative will redirect the vector to the view of the player.
relative_y is a mix between absolute and relative. It will still direct to the view but only horizontally, so y will be absolute.
modification	modification:modificationType	set	Possible modifications are set and add. The modification type determines how the vector should be merged with the player's velocity. The player's velocity is the external force applied on the player.
Visual Explanation
Example

events:
  jumppad: "velocity vector:(2;0.8;4)"
  dash: "velocity vector:(0;0.1;1.3) direction:relative_y"
  variable_dash: "velocity vector:%objective.customVariable.dashLength% direction:relative_y"
  fly: "velocity vector:(0;0.1;2) direction:relative modification:add"
 Weather: weather🔗
persistent, static

Sets the weather in the world the player is currently in. The argument is sun for clear, sunny weather, rain for pure rain, storm for storm with rain, lightning and thunder. Durations less than 1 is equal to no duration.

Parameter	Syntax	Default Value	Explanation
type	Keyword		The type of weather to set. Either sun, rain or storm.
duration	duration:number	Minecraft decides randomly.	The duration the weather will last (in seconds). Can be a variable.
Is handled from minecraft afterwards.
world	world:worldName	The player's current world.	The world to change the weather in.
Example

events:
  setSun: "weather sun"
  setShortRain: "weather rain duration:60 world:rpgworld"
  setStorm: "weather storm duration:%point.tribute.left:150%"

  Objectives List🔗
Action: action🔗
This objective completes when the player clicks on the given block type. It works great with the location condition and the item in hand condition to further limit the counted clicks.

Parameter	Syntax	Default Value	Explanation
Click Type	right, left or any		What type of click should be handled
Block Type	Block Selector or any		The block which must be clicked, or any for even air
Location	loc:Location	Optional. Default: none	Adds an optional location to the objective, only counting blocks clicked at the specific location.
range	range:number	0	The range around the location where to count the clicks.
cancel	Keyword (cancel)	Not Set	Prevents the player from interacting with the block.
hand	hand:(hand,off_hand, any)	hand	The hand the player must use to click the block, any can the objective cause to be completed multiple times
Example

action right DOOR conditions:holding_key loc:100;200;300;world range:5
action any any conditions:holding_magicWand events:fireSpell #Custom click listener for a wand
Variable Properties
The objective contains one property, location. It's a string formatted like X: 100, Y: 200, Z:300. It does not show the radius.

Arrow Shooting: arrow🔗
To complete this objective the player needs to shoot the arrow into the target. There are two arguments, location of the target and precision number (radius around location where the arrow must land, should be small). Note that the position of an arrow after hit is on the wall of a full block, which means that shooting not full blocks (like heads) won't give accurate results. Experiment with this objective a bit to make sure you've set the numbers correctly.

Example

arrow 100.5;200.5;300.5;world 1.1 events:reward conditions:correct_player_position
 Break or Place Blocks: block🔗
To complete this objective the player must break or place the specified amount of blocks.

Parameter	Syntax	Default Value	Explanation
Block Type	Block Selector		The block which must be broken / placed.
Amount	Number		The amount of blocks to break / place. Less than 0 for breaking and more than 0 for placing blocks.
Safety Check	Keyword (noSafety)	Safety Check Enabled	The Safety Check prevents faking the objective. The progress will be reduced when the player does to opposite of what they are supposed to do. Example: Player must break 10 blocks. They place 10 of their stored blocks. Now the total amount of blocks to break is 20.
Notifications	Keyword (notify)	Disabled	Displays messages to the player each time they progress the objective. Optionally with the notification interval after colon.
Location	loc:location	Optional. Default: none	Adds an optional location to the objective, only counting blocks broken/placed at the specific location.
Region definer	region:location	Optional. Default: none	Adds an optional second location to only count blocks broken/placed in a rectangle between the specified location and this location. This won't have an effect if parameter location isn't set.
ignorecancel	Keyword (ignorecancel)	Protected blocks will not affect the objective	Allows the objective to progress, even if the event is cancelled by the Server. For example if the player is not allowed to build.
Example

objectives:
  breakLogs: "block .*_LOG -16 events:reward notify"
  placeBricks: "block BRICKS 64 events:epicReward notify:5"
  breakIron: "block IRON_ORE -16 noSafety notify events:dailyReward"
Variable Properties
Note that these follow the same rules as the amount argument, meaning that blocks to break are a negative number!

Name	Example Output	Explanation
amount	-6 / 6	Shows the amount of blocks already broken / placed.
left	-4 / 4	Shows the amount of blocks that still need to be broken / placed for the objective to be completed.
total	-10 / 10	Shows the initial amount of blocks that needed to be broken / placed.
You can use these variables to always get positive values:

Name	Example Output	Explanation
absoluteAmount	6	Shows the absolute amount of blocks already broken / placed.
absoluteLeft	4	Shows the absolute amount of blocks that still need to be broken / placed for the objective to be completed.
absoluteTotal	10	Shows the initial absolute amount of blocks that needed to be broken / placed.
Breed animals: breed🔗
This objective is completed by breeding animals of specified type. The first argument is the animal type and the second argument is the amount (positive integer). You can add the notify argument to display a message with the remaining amount each time the animal is bred, optionally with the notification interval after a colon. While you can specify any entity, the objective will be completable only for breedable ones.

This objective has three properties: amount, left and total. amount is the amount of animals already breed, left is the amount of animals still needed to breed and total is the amount of animals initially required.

Example

breed cow 10 notify:2 events:reward
Put items in a chest: chestput🔗
This objective requires the player to put specified items in a specified chest. First argument is a location of the chest, second argument is a list of items (from items section), separated with a comma. You can also add amount of items after a colon. The items will be removed upon completing the objective unless you add items-stay optional argument. By default, only one player can look into the chest at the same time. You can change it by adding the key multipleaccess.

Example

chestput 100;200;300;world emerald:5,sword events:tag,message
chestput 0;50;100;world apple:42 events:message multipleaccess:true
 Eat/drink: consume🔗
This objective is completed by eating the specified food or drinking the specified potion.

Parameter	Syntax	Default Value	Explanation
Item	Quest Item		The item or potion that must be consumed.
Amount	amount:number	1	The amount of items to consume.
Example

objectives:
  eatApple: "consume apple events:faster_endurance_regen"
  eatSteak: "consume steak amount:4 events:health_boost"
Variable Properties
Name	Example Output	Explanation
amount	6	Shows the amount of items already consumed.
left	4	Shows the amount of items that still need to be consumed for the objective to be completed.
total	10	Shows the initial amount of items that needed to be consumed.
Crafting: craft🔗
To complete this objective the player must craft specified item. First argument is ID of the item, as in the items section. Next is amount (integer). You can use the notify keyword to display a message each time the player advances the objective, optionally with the notification interval after a colon.

This objective has three properties: amount, left and total. amount is the amount of items already crafted, left is the amount of items still needed to craft and total is the amount of items initially required.

Example

craft saddle 5 events:reward
 Enchant item: enchant🔗
This objective is completed when the player enchants the specified quest item with the specified enchantment.

Parameter	Syntax	Default Value	Explanation
item	Quest Item		The quest item that must be enchanted.
enchants	enchantment:level		The enchants that must be added to the item. Enchantment names are different from the vanilla ones. If a level is present, the enchanted level must be equal or bigger then the specified one. Multiple enchants are supported: ARROW_DAMAGE:1,ARROW_FIRE:1
requirementMode	requirementMode:mode	all	Use one if any enchantment from enchants should complete the objective. Use all if all are required at the same time.
amount	amount:number	1	The amount of items to enchant.
Example

lordSword: "enchant lordsSword damage_all,knockback events:rewardLord"
kingSword: "enchant kingsSword damage_all:2,knockback:1 events:rewardKing"
massProduction: "enchant ironSword sharpness amount:10 events:blacksmithLevel2Reward"
Variable Properties
Name	Example Output	Explanation
amount	6	Shows the amount of items already enchanted.
left	4	Shows the amount of items that still need to be enchanted for the objective to be completed.
total	10	Shows the initial amount of items that needed to be enchanted.
Experience: experience🔗
This objective can be completed by reaching the specified amount of experience levels. You can also define decimal numbers, for example experience 1.5 will complete when the player reaches 1.5 experience levels or more. If you want to check for an absolute amount of experience points you can convert it to decimal levels. The objective is checked every time the player gets experience naturally, such as killing mobs or mining blocks. Additionally, it is checked if the player reaches a new level in any way (vanilla level up, commands or other plugins). The objective will also imminently complete if the player already has the experience level or more. And it will also be completed if the player joins the game with the specified amount of experience levels or more. You can use the notify keyword to display a message each time the player advances the objective, optionally with the notification interval after a colon.

This objective has three properties: amount, left and total. amount is the current amount of experience levels, left is the amount of experience levels still needed and total is the amount of experience required.

Example

experience 25 level events:reward
 Wait: delay🔗
This objective completes itself after certain amount of time. The player must be online and meet all conditions. If the player is not online the objective is completed on the player's next login.

Parameter	Syntax	Default Value	Explanation
time	Any Number		The time after which the objective is completed.
unit	Keyword	minutes	The unit of time. Either minutes, seconds or ticks.
precision	interval:number	interval:200	The interval in which the objective checks if the time is up. Measured in ticks. Low values cost more performance but make the objective preciser.
Example

objectives:
  waitDay: "delay 1440 events:resetDaily" 
  wait50sec: "delay 1000 ticks interval:5 events:failQuest" 
Variable Properties
Name	Example Output	Explanation
left	23 days 5 hours 45 minutes 17 seconds	Shows the time left until the objective is completed.
date	17.04.2022 16:14	Shows the date the objective is completed at using the config's date_format setting.
rawSeconds	5482	Shows the amount of seconds until objective completion.
Death: die🔗
The death objective is completed when a player dies while fulfilling all conditions. If you set the respawn location the player will spawn at that location, after pressing respawn, and the objective will be completed then, not immediately on death.

Optionally you can also add the cancel argument to prevent the player from dying. In this case, the player will be healed and all status effects will be removed. You can also specify the respawn location to which the player will be teleported to.

Example

die respawn:100;200;300;world;90;0 events:respawned
die cancel respawn:100;200;300;world;90;0 events:respawned
 Fishing: fish🔗
Requires the player to catch something with the fishing rod. It doesn't have to be a fish, it can also be any other item.

Parameter	Syntax	Default Value	Explanation
Item	Quest Item		The item that must be caught.
amount	Any Number		The amount that must be caught.
notifications	notify:number	notify:0	Add notify to display a notification when a fish is caught. Optionally with the notification interval after a colon.
hookLocation	hookLocation:Location	Everywhere	The location at which the item must be caught. Range must also be defined.
range	range:number	Everywhere	The range around the hookLocation.
Example

objectives:
  fisherman: "fish SALMON 5 notify events:tag_fish_caught" 
  fishAtPond: "fish COD 5 hookLocation:123;456;789;fishWorld range:10 events:giveSpecialFish" 
Variable Properties
Name	Example Output	Explanation
left	4	The amount of fish still left to be caught.
amount	6	The amount of already caught fish.
total	10	The initially required amount of fish needed to be caught.
Interact with entity: interact🔗
The player must click on entities to complete this objective.

Parameter	Syntax	Default Value	Explanation
Click Type	right, left or any		What type of click should be handled
Entity Type	EntityType type		The entity which must be clicked
amount	number		The amount of different entities which must be interacted with.
name	name:text	Disabled	Only count named mobs.
realname	realname:text	Disabled	To check for the real name (e.g. if you renamed players to include their rank).
marked	marked:text	Disabled	If the clicked entity needs to be marked by the spawn event (see its description for marking explanation)
hand	hand:(hand,off_hand, any)	hand	The hand the player must use to click the block, any can the objective cause to be completed multiple times
Notifications	Keyword (notify)	Disabled	Displays messages to the player each time they progress the objective. Optionally with the notification interval after colon.
Cancel	Keyword (cancel)	Disabled	if the click shouldn't do what it usually does (i.e. left click won't hurt the entity).
Location	loc:Location	Everywhere	The location at which the entity must be interacted.
range	range:number	1	The range around the loc. Requires defined loc.
Example

interact right creeper 1 marked:sick conditions:syringeInHand cancel
Variable Properties
Name	Example Output	Explanation
amount	7	The amount of already interacted entities.
left	13	The amount of entities still needed to be interacted with.
total	20	The initially required amount of entities to interact.
Resource pack state: resourcepack🔗
To complete this objective the player must have the specified resource pack state. The first argument is the state of the resource pack. It can be successfully_loaded, declined, failed_download and accepted.

Example

resourcepack successfully_loaded events:reward
resourcepack declined events:declined
Kill player: kill🔗
To complete this objective the player needs to kill another player. The first argument is amount of players to kill. You can also specify additional arguments: name: followed by the name will only accept killing players with this name, required: followed by a list of conditions separated with commas will only accept killing players meeting these conditions and notify will display notifications when a player is killed, optionally with the notification interval after a colon.

The kill objective has three properties: left is the amount of players still left to kill, amount is the amount of already killed players and total is the initially required amount to kill.

Example

kill 5 required:team_B
Location: location🔗
The specified location where the player needs to be. It is not required to specify entry or exit then the objective also completes if the player just moves inside the location's range.

Parameter	Syntax	Default Value	Explanation
location	ULF		The location to go to
range	number		The range around the location where the player must be.
entry	entry	Disabled	The player must enter (go from outside to inside) the location to complete the objective.
exit	exit	Disabled	The player must exit (go from inside to outside) the location to complete the objective.
Example


location 100;200;300;world 5 conditions:started events:notifyWelcome,start
location 100;200;300;world 5 exit conditions:started events:notifyBye
Variable Properties
Name	Example Output	Explanation
location	X: 100, Y: 200, Z:300	The target location of this objective
Login: login🔗
To complete this objective the player simply needs to login to the server. If you use global this objective will be also completed directly when a new player joins for the first time. If you use persistent it will be permanent. Don't forget that if you use global and persistent you can still remove the objective explicitly.

Example

login events:welcome_message
Logout: logout🔗
To complete this objective the player simply needs to leave the server. Keep in mind that running a folder event here will make it run in "persistent" mode, since the player is offline on the next tick.

Example


logout events:delete_objective
NPC Interact: npcinteract🔗
The player has to interact with a Npc.

Parameter	Syntax	Default Value	Explanation
Npc	Npc		The ID of the Npc.
Cancel	cancel	False	If the interaction with the Npc should be cancelled, so a conversation won't start.
Interaction	interaction:Keyword	right	The interaction type. Either left, right or any.
Example

stealItem: npcinteract mayor cancel conditions:sneak events:steal
punchThief: npcinteract thief interaction:left events:poke
NPC Range: npcrange🔗
The player has to enter/leave a circle with the given radius around the NPC to complete this objective. It is also possible to define multiple NPCs separated with ,. The objective will be completed as soon as you meet the requirement of just one npc.

Parameter	Syntax	Default Value	Explanation
Npcs	Npc List		The IDs of the Npcs
Action	Keyword		The required action. Either enter, leave, inside or outside.
Range	Number		The maximum distance to a Npc
Info

The types enter, leave force the player to actually enter the radius after you were outside of it and vice versa. This means that enter is not completed when the player gets the objective and is already in the range, while inside is instantly completed.

Example

goToVillage: npcrange farmer,guard enter 20 events:master_inRange
Password: password🔗
This objective requires the player to write a certain password in chat. All attempts of a player will be hidden from public chat. The password consists of a prefix followed by the actual secret word:


Solution: The Cake is a lie!     
^prefix   ^secret word(s)
The objective's instruction string is defined as follows:

The first argument is the password, use quoting for spaces The password is a regular expression.

The prefix can be changed: The default (when no prefix is set) is the translated prefix from the messages.yml config in the user's language.
Note that every custom prefix is suffixed with :⠀, so prefix:Library_password will require the user to enter Library password: myfancypassword.
To disable the prefix use an empty prefix: declaration, e.g. password myfancypassword prefix: events:success. Be aware of these side effects that come with disabling the prefix:

Nothing will be hidden on failure, so tries will be visible in chat and commands will get executed!
If a command was used to enter the password, the command will not be canceled on success and thus still be executed!
This ensures that even if your password is quest you can still execute the /quest command.
You can also add the ignoreCase argument if you want a password's capitalization to be ignored. This is especially important for regex matching.

If you want to trigger one or more events when the player failed to guess the password you can use the argument fail with a list of events (comma separated). With disabled prefix every command or chat message will trigger these events!

Example

objectives:
  theBetonPassword: 'password beton ignoreCase prefix:secret fail:failEvent1,failEvent2 events:message,reward'
  theBetonPasswordSpaced: 'password "beton quest" ignoreCase prefix:secret fail:failEvent1,failEvent2 events:message,reward'
Pickup item: pickup🔗
To complete this objective you need to pickup the specified amount of items. The first argument must be the internal name of an item defined in the items section. This can also be a comma-separated list of multiple items. You can optionally add the amount: argument to specify how many of these items the player needs to pickup. This amount is a total amount though, it does not count per each individual item. You can use the notify keyword to display a message each time the player advances the objective, optionally with the notification interval after a colon.

You can also add the notify keyword to display how many items are left to pickup.

This objective has three properties: amount, left and total. amount is the amount of items already picked up, left is the amount of items still needed to pick up and total is the amount of items initially required.

Example

pickup emerald amount:3 events:reward notify
pickup emerald,diamond amount:6 events:reward notify
 Entity Kill: mobkill🔗
The player must kill the specified amount of entities (living creatures). All entities work, make sure to use their correct types.

Parameter	Syntax	Default Value	Explanation
type	ENTITY_TYPE,ENTITY_TYPE		A list of entities, e.g. ZOMBIE,SKELETON.
amount	Positive Number		Amount of mobs to kill in total.
name	name:text	Disabled	Only count named mobs.
marked	marked:keyword	Disabled	Only count marked mobs. See the spawn event for more information. Supports variables.
notify	notify:interval	Disabled	Display a message to the player each time they kill a mob. Optionally with the notification interval after colon.
Example

objectives:
  monsterHunter: "mobkill ZOMBIE,SKELETON,SPIDER 10 notify" 
  specialMob: "mobkill PIG 1 marked:special" 
  bossZombie: "mobkill ZOMBIE 1 name:Uber_Zombie" 
Variable Properties
Name	Example Output	Explanation
amount	2	Shows the amount of mobs already killed.
left	8	Shows the amount of mobs that still need to be killed.
total	10	Shows the amount of mobs initially required to kill.
Potion brewing: brew🔗
To complete this objective the player needs to brew specified amount of specified potions. The first argument is a potion ID from the items section. Second argument is amount of potions. You can optionally add notify argument to make the objective display progress to players, optionally with the notification interval after a colon.

Progress will be counted for the player who last added or changed an item before the brew process completed. Only newly created potions are counted.

This objective has three properties: amount, left and total. amount is the amount of potions already brewed, left is the amount of potions still needed to brew and total is the amount of potions initially required.

Example

brew weird_concoction 4 events:add_tag
Sheep shearing: shear🔗
To complete this objective the player has to shear specified amount of sheep, optionally with specified color and/or name. The first, required argument is amount (integer). Optionally, you can add a name: argument to only count specific sheep. If you want to use spaces use quoting syntax. You can also check for the sheep's color: using these color names. You can use the notify keyword to display a message each time the player advances the objective, optionally with the notification interval after a colon.

This objective has three properties: amount, left and total. amount is the amount of sheep already sheared, left is the amount of sheep still needed to shear and total is the amount of sheep initially required.

Example

shear 1 name:Bob color:black
shear 1 name:jeb
shear 1 "name:jeb 2"
Smelting: smelt🔗
To complete this objective the player must smelt the specified item. Note that you must define the output item, not the ingredient. The first argument is the name of a Quest Item. The second one is the amount (integer).

You can use the notify keyword to display a message each time the player advances the objective, optionally with the notification interval after a colon.

This objective has three properties: amount, left and total. amount is the amount of items already smelted, left is the amount of items still needed to smelt and total is the amount of items initially required.

Example

smeltIron: "smelt ironIngot 5 events:reward"
Stages: stage🔗
The Stage objective is a special objective that can be used to track the progress of a quest or a part of a quest. It can be completed in two ways, the first one is by increasing the stage more than there are stages defined and the second one is by completing the objective with the objective event. The behaviour of completing the objective by increasing the stage can be disabled by setting the preventCompletion flag.

When the conditions of the stage objective are not met, the stage of the player can not be modified.
You can modify the stages with the stage event and check it's state with the stage condition.

Parameter	Syntax	Default Value	Explanation
stages	List of stage names		The stages that must be completed.
preventCompletion	Keyword	Completion Enabled	Prevents the objective from being completed by increasing the stage.
Example

objectives:
  questProgress: "stage part1,part2,part3"
  bakeCookies: "stage collectIngredients,cookCookies,deliverCookies preventCompletion"
Variable Properties
Name	Example Output	Explanation
index	2	The index of the players current stage beginning at 0.
current	cookCookies	The current stage name of the player or empty if the objective is not active.
next	deliverCookies	The next stage name of the player or empty if the objective is not active.
previous	collectIngredients	The previous stage name of the player or empty if the objective is not active.
Step on pressure plate: step🔗
To complete this objective the player has to step on a pressure plate at a given location. The type of plate does not matter. The first and only required argument is a location. If the pressure plate is not present at that location, the objective will not be completable and will log errors in the console.

Step objective contains one property, location. It shows the exact location of the pressure plate in a string formatted like X: 100, Y: 200, Z:300.

Example

step 100;200;300;world events:done
Taming: tame🔗
To complete this objective player must tame some amount of mobs. First argument is type, second is amount. The mob must be tamable for the objective to be valid, e.g.: CAT, DONKEY, HORSE, LLAMA, PARROT or WOLF. You can use the notify keyword to display a message each time the player advances the objective, optionally with the notification interval after a colon.

This objective has three properties: amount, left and total. amount is the amount of animals already tamed, left is the amount of animals still needed to tame and total is the amount of animals initially required.

Example

tame WOLF 2 events:wolfs_tamed
Track time: timer🔗
Tracks time in seconds from the start of the objective to the completion of the objective. If you simply want to have something like wait for 10 minutes, you can use the amount argument. If you don't define the amount, the objective will run indefinitely until you complete it with the objective event.

Parameter	Syntax	Default Value	Explanation
name	name:text	Disabled	A display name for the objective that can be accessed as property.
interval	interval:number	interval:20	How often the objective checks the conditions and adds time, in seconds.
amount	amount:number	Disabled	The amount of time in seconds to track before the objective is completed.
done	done:events	Disabled	Events that will be executed when the objective is done, but before it is removed.
If you want to access the time tracked by this objective in seconds, you can use the amount, left and total properties. They are only available while the objective is active, this is still the case in the done events, but not in the normal events as they are executed after the objective is already removed.

Example

objectives:
    track: timer "name:This is the Display Name" interval:10 done:done_in events:done conditions:in_region
Player must Jump: jump🔗
To complete this objective the player must jump. The only argument is amount. You can use the notify keyword to display a message each time the player advances the objective, optionally with the notification interval after a colon.

This objective has three properties: amount, left and total. amount is the amount of jumps already done, left is the amount of jumps still needed and total is the amount of jumps initially required.

Example

jump 15 events:legExerciseDone
Ride an entity: ride🔗
This objective can be completed by riding the specified entity. any is also a valid input and matches any entity.

Example

ride horse
ride any
Run a Command: command🔗
To complete this objective the player must execute a specified command. It can be both an existing or a new, custom command. The first argument is the command text. To allow spaces use quoting syntax. The command argument is case-sensitive and also supports using placeholders. The second required argument is a list of events to execute when the objective ismet.

Example

command "/warp %player% farms" events:event1,event2
command //replace_oak\_wood events:event1,event2
With this configuration, the command objective requires the player to execute /warp MyName farms to be completed. The command objective matches from the start of the command that was executed, therefore if the player executed /warp MyName farms other arguments it would still be completed.

Optional arguments:

ignoreCase: If provided, instructs the objective to ignore case for the command to match.
exact: If provided, requires an exact command match, not just the command start.
cancel: If provided, the objective will cancel the execution of the command on a match. This needs to be enabled to suppress the Unknown Command message when using custom commands.
failEvents: If provided, specifies a list of events to execute if a non-matching command is run and conditions are met.
Complex Example

command "/warp %player% farms" ignoreCase exact cancel failEvents:failEvent1,failEvent2 events:event1,event2
Equip Armor Item: equip🔗
The player must equip the specified quest item in the specified slot. The item must be any quest item as defined in the items section. Available slot types: HEAD, CHEST, LEGS, FEET.

Example

eqHelm: equip HEAD amazing_helmet events:event1,event2
equipBody: equip CHEST amazing_armor events:event1,event2
Variable: variable🔗
This objective is different. You cannot complete it, it will also ignore defined events and conditions. You can start it and that's it. While this objective is active though, everything the player types in chat (and matches a special pattern) will become a variable. The pattern is key: value. So if the player types MyFirstVariable: Hello!, it will create a variable called MyFirstVariable, which will resolve as a Hello! string. You can access them as objective properties. Let's say you defined this objective as CustomVariable in your objectives.yml file. You can access the variable in any conversation, event or condition with %objective.CustomVariable.MyFirstVariable% - and in the case of this example, it will resolve to Hello!. The player can type something else and the variable will change its value. Variables are per-player, so the value of one player's MyFirstVariable will be different from other players' MyFirstVariable values, depending on what they typed in chat. There is no limit to the amount of variables that can be created and assigned to players. To remove this objective, use objective delete event - there is no other way.

You can also use variable event to change variables stored in this objective. There is one optional argument, no-chat. If you use it, the objective won't be modified by what players type in chat which is only useful when you're also using the variable event.

Also, the key is interpreted in lower case. That means there is no difference between MyFirstVariable, myfirstvariable or MYfirstVARIABLE.

Example

storage: variable
storeChat: variable no-chat

Conditions List🔗
Advancement: advancement🔗
This condition checks if the player has specified advancement. The only argument is the full name of the advancement. This includes the namespace, the tab and the name of the advancement as configured on your server. List of all vanilla advancements.

Example


advancement minecraft:adventure/kill_a_mob
Conjunction: and🔗
static

Conjunction of specified conditions. This means that every condition has to be met in order for conjunction to be true. Used only in complex alternatives, because conditions generally work as conjunction. Instruction string is exactly the same as in alternative.

Example


and has_helmet,has_chestplate,has_leggings,has_boots
Armor: armor🔗
The armor condition requires the player to wear an armor that has been specified in the items section.

Example


armor helmet_of_concrete
Biome: biome🔗
This condition will check if the player is in specified biome. The only argument is the biome type.

Example


biome savanna_rock
Burning: burning🔗
This condition will check if the player is on fire.

Example

conditions:
  isOnFire: "burning"
Check conditions: check🔗
persistent, static

This condition allow for specifying multiple instruction strings in one, longer string. Each instruction must be started with ^ character and no other dividers should be used. The condition will be met if all inner conditions are met. It's not the same as and condition, because you can specify an instruction string, not a condition name.

Example


check ^tag beton ^item emerald:5 ^location 100;200;300;survival_nether;5 ^experience 20
Chest Item: chestitem🔗
persistent, static

This condition works in the same way as item condition, but it checks the specified chest instead of a player. The first argument is a location of the chest and the second one is the list of items defined in the same way as in item condition. If there is no chest at specified location the condition won't be met.

Example


chestitem 100;200;300;world emerald:5,sword
Conversation: conversation🔗
This condition will check if a conversation has an available starting option. If no starting option has a condition that returns true then this will return false.

Example


conversation innkeeper
Day of week: dayofweek🔗
It must be a specific day of the week that this condition returns true. You can specify either the english name of the day or the number of the day (1 being monday, 7 sunday,...).

Example


dayofweek sunday
Potion Effect: effect🔗
To meet this condition the player must have an active potion effect. There is only one argument and it takes values from this page: potion types.

Example


effect SPEED
Empty inventory slots: empty🔗
To meet this condition the players inventory must have the specified amount of empty slots or more. If you want to check for a specific amount (for example for a full inventory with 0 empty slots) you can append the equal argument.

Example


empty 5
Entities in area: entities🔗
persistent, static

This condition will return true only if there is a specified amount (or more) of specified entities in the specified area. There are three required arguments - entity type, location and range. Entities are defined as a list separated by commas. Each entity type (taken from here) can have an additional amount suffix, for example ZOMBIE:5,SKELETON:2 means 5 or more zombies and 2 or more skeletons. The location is defined as usual. The number after the location is the range around the location in which will be checked for these entities. You can also specify additional name: argument, with the name of the required entity. Replace all spaces with _ here. You can use marked: argument to check only for entities marked in spawn event.

Example


entities ZOMBIE:2 100;200;300;world 10 name:Deamon
Eval Condition: eval🔗
This condition allows you to resolve an expression containing variables, and the result will then be interpreted again as an condition.

Example

events:
  simpleEval: eval chestitem -288;64;357;World emerald:5
  complexEval: eval point ranking 5 %objective.settings.equal% 
Experience: experience🔗
This condition is met when the player has the specified amount of experience levels. You can also define decimal numbers, for example experience 1.5 will be met when the player has 1.5 or more experience levels. If you want to check for an absolute amount of experience points you can convert it to decimal levels.

Example


experience 30
experience 5.5
Facing direction: facing🔗
Checks if the player is looking in the given direction. Valid directions are UP, DOWN, NORTH, EAST, WEST and SOUTH. Up and down start at a pitch of 60°.

Example


facing EAST
Fly: fly🔗
This will check if the player is currently flying (Elytra type of flight).

Example


fly
Game mode: gamemode🔗
This condition checks if the player is in a specified game mode. The first argument is the game mode, i.e. survival, creative, adventure.

Example


gamemode survival
Global point: globalpoint🔗
persistent, static

The same as point condition but it checks the amount for a global point category which has the same value for all players.

Example


globalpoint global_knownusers 100
Global tag: globaltag🔗
persistent, static

This requires a specific global tag to be set and works the same as normal tag condition.

Example


globaltag global_areNPCsAgressive
Item in Hand: hand🔗
This condition is met only when the player holds the specified quest item in their hand. The offhand will be checked instead of the main hand if the offhand keyword is added. Amount cannot be set here, though it may be checked with the item condition.

Example


hand SpecialSword
hand QuestShield offhand
Health: health🔗
Requires the player to have equal or more health than specified amount. The only argument is a number (double). Players can have 0 to 20 health by default (there are some plugins and commands which change the maximum) (0 means dead, don't use that since it will only be met when the player sees the red respawn screen).

Example


health 5.6
Height: height🔗
This condition requires the player to be below specific Y height. The required argument is a number or a location (for example 100;200;300;world). In case of location it will take the height from it and use it as regular height.

Example


height 16
Hunger: hunger🔗
Requires the player to have equal or more hunger points, the condition is the same as health just for hunger. If the hunger level is below 7, the player cannot sprint.

Example


hunger 15
In Conversation: inconversation🔗
This condition checks, if the player is in a conversation.

Parameter	Syntax	Default Value	Explanation
conversation	conversation:name		Optional name of the conversation. If specified, it will only check for the conversation with this name.
Example

conditions:
  isInConversation: "inconversation"
  talksToInnkeeper: "inconversation conversation:innkeeper"
Item in Inventory: item🔗
This condition requires the player to have all specified items in his inventory or backpack. You specify items in a list separated by commas (without spaces between!) Each item consists of its name and amount, separated by a colon. Amount is optional, so if you specify just item's name the plugin will assume there should be only one item.

Example


item emerald:5,gold:10
Durability of item: itemdurability🔗
This condition requires the player to have a certain amount of durability on an item. The first argument is the slot, the second the amount. Optional relative argument sets 0 to broken and 1 to the maximum durability the item can have. This condition returns false when no item is in the given slot or does not have durability, like stone or sticks. Available slot types: HAND, OFF_HAND, HEAD, CHEST, LEGS, FEET.

Example


itemdurability HAND 50
itemdurability CHEST 0.5 relative
Journal entry: journal🔗
This condition will return true if the player has specified entry in his journal (internal name of the entry, like in journal section). The only argument is name of the entry.

Example


journal wood_started
Language: language🔗
persistent

This condition is fulfilled as long as the player has one of the specified languages selected as their quest language.

Example


language en,de,fr
Location: location🔗
It returns true only when the player is closer to specified location than the specified distance. Just two mandatory attributes - location and radius around it (can be a variable).

Example


location 100;200;300;survival_nether 5
Looking at a block: looking🔗
Checks if the player is looking at a block with the given location or material. You must specify either loc: optional (the location of the block) or type: optional as a block selector. You can also specify both.

Example


looking loc:12.0;14.0;-15.0;world type:STONE
Moon Phase: moonphase🔗
static

This condition checks the moon phase in the given world or the player's world.

Parameter	Syntax	Default Value	Explanation
MoonPhase	Keyword		The moon phase to check for. Can be a list and variables.
world	world:name	player location	The world to check for the moon phase. Can be a variable.
Example

fullMoon: "moonphase FULL_MOON"
darkInHub: "moonphase WANING_CRESCENT,NEW_MOON,WAXING_CRESCENT world:hub"
playersFirstJoinMoon: "moonphase %ph.player_first_join_moon%"
NPC distance: npcdistance🔗
This condition will check if a Npc is close to the player.

Parameter	Syntax	Default Value	Explanation
Npc	Npc		The ID of the Npc
Distance	Variable		The maximum distance
Example

canHearBandit: npcdistance bandit 22
NPC location: npclocation🔗
persistent, static

This condition will check if a Npc is close to a location.

Parameter	Syntax	Default Value	Explanation
Npc	Npc		The ID of the Npc
Location	Location		The location
Distance	Number		The maximum distance
Example

nearTarget: npclocation merchant 4.0;14.0;-20.0;world 22
Number compare: numbercompare🔗
This condition compares two numbers. The valid operations are: <, <=, =, !=, >=, >.

Example


numbercompare %ph.other_plugin:points% >= 100
Objective: objective🔗
This condition is very simple: it's true only when the player has an active objective. The only argument is the name of the objective, as defined in the objectives section.

Example


objective wood
Alternative: or🔗
persistent, static

Alternative of specified conditions. This means that only one of conditions has to be met in order for alternative to be true. You just define one mandatory argument, condition names separated by commas. ! prefix works as always.

Example


or night,rain,!has_armor
Partial date: partialdate🔗
The current date must match the given pattern. You can specify the day of the month, the month or the year it must be that this condition returns true or combine them. You can also specify multiple days/months/years by just separating them by , or an interval by using -. If you have trouble understanding how this works have a look at the example.

The example is true between the 1st and the 5th or on the 20th of each month, but only in the year 2017.

Example


partialdate day:1-5,20 year:2017
Party: party🔗
static

This is part of the party system. This condition takes three optional arguments: every:, any:, count: and location:.
"Every" is a list of conditions that must be met by every player in the party.
Any is a list of conditions that must be met by at least one player in a party (it doesn't have to be the same player, one can meet first condition, another one can meet the rest, and it will work).
Count is just a number, minimal amount of players in the party. Location can be used to create a party without the need of a player that is the center of the party. You don't have to specify all those arguments, you can use only one if you want.

Example


party 10 has_tag1,!has_tag2 every:some_item any:some_location,some_other_item count:5
Permission: permission🔗
The player must have a specified permission for this condition to be met. The instruction string must contain permission node as the required argument.

Example


permission essentials.tpa
Point: point🔗
Requires the player to have amount of points equal to the specified category or more. There are two required arguments, first is the category (string), second is the amount (integer). You can also add optional argument equal to accept only players with exactly equal amount of points.

Example


point beton 20
Ride an entity: ride🔗
This condition checks if the player rides the specified entity. any is also a valid input and matches any entity.

Example


ride horse
ride any
Random: random🔗
persistent, static

This condition is met randomly. There is one argument: two positive numbers like 5-12. They mean something like that: "It will be true 5 times out of 12".

Example


random 12-100
Armor Rating: rating🔗
This one requires the player to wear armor which gives him specified amount of protection (armor icons). The first and only argument should be an integer. One armor point is equal to half armor icon in-game (10 means half of the bar filled).

Example


rating 10
Real time: realtime🔗
static, persistent

There must a specific (real) time for this condition to return true.

Parameter	Syntax	Default Value	Explanation
Timespan	startTime-endTime		Two points of time separated by dash in the 24-hour format (0 - 24). The minutes are optional (hh or hh:mm).
Example

allDayReal: "realtime 6-19"
midnightReal: "realtime 23:30-0:30"
knoppersTimeReal: "realtime 9:30-10"
Scoreboard: score🔗
persistent

With this condition you can check if the score in a specified objective on a scoreboard is greater or equal to specified amount.

Parameter	Syntax	Default Value	Explanation
scoreboard objective	Objective name		The name of the scoreboard objective
count	Number		The minimum whole number of the objective
Example

hasAtLeastTenKills: "score kills 10"
Scoreboard Tag: scoretag🔗
This scoreboard condition checks if the player has a specified scoreboard tag. The kind of tags that are used by vanilla Minecraft and not the betonquest tags.

Parameter	Syntax	Default Value	Explanation
scoreboard tag	Tag name		The name of the scoreboard tag.
Example

hasVanillaTag: "scoretag vanilla_tag"
Sneaking: sneak🔗
Sneak condition is only true when the player is sneaking. This would probably be useful for creating traps, I'm not sure. There are no arguments for this one.

Example


sneak
Check Stage: stage🔗
This condition compares the players current stage with the given stage by its index numbers. For more take a look at the stage objective.
The valid operations are: <, <=, =, !=, >=, >.

Parameter	Syntax	Default Value	Explanation
stage objective	Objective		The name of the stage objective
comparator	Comparator		The comparator to use for the comparison
stage	Stage		The name of the stage to compare
Example

conditions:
  isDeliverCookies: "stage bakeCookies = deliverCookies"
  isDeliverCookiesOrAbove: "stage bakeCookies > cookCookies"
Tag: tag🔗
This one requires the player to have a specified tag. Together with ! negation it is one of the most powerful tools when creating conversations. The instruction string must contain tag name.

Example


tag quest_completed
Test for block: testforblock🔗
persistent, static

This condition is met if the block at specified location matches the given material. First argument is a location, and the second one is a block selector.

Example


testforblock 100;200;300;world STONE
Time: time🔗
static

There must be specific (Minecraft) time on the world for this condition to return true.

Parameter	Syntax	Default Value	Explanation
Timespan	startTime-endTime		Two points of time separated by dash in the 24-hour format (0 - 24). The minutes are optional (hh or hh:mm).
world	world:name	player location	The world to check for the time. Can be a variable.
Example

allDay: "time 6-19"
midnightInOverworld: "time 23:30-0:30 world:overworld"
knoppersTime: "time 9:30-10"
exactAtTwelveAtPlayersHome: "time 12-12 world:%ph.player_home_world%"
Variable: variable🔗
static

This condition checks if a variable value matches given regular expression

Parameter	Syntax	Default Value	Explanation
Variable	Any variable		The variable (surrounded by % characters).
Regex	A regex pattern		The regex that the variables value must match. The regex can also be stored in a variable.
forceSync	Keyword	False	Forces the variables to be resolved on the main thread. This may be required by some third party variables.
Example

anyNumber: "variable %objective.var.price% -?\\d+" 
isPlayer: "variable %ph.parties_members_1% %player%" 
denizenVariable: "variable %ph.denizen_<server.match_player[SomeName].has_flag[flag_name]>% true forceSync" 
denizenVariableThis: "variable %ph.denizen_<player.has_flag[flag_name]>% true forceSync" 
Weather: weather🔗
static

There must be a specific weather for this condition to return true. There are three possible options: sun, rain and storm. Note that /toggledownfall does not change the weather, it just does what the name suggests: toggles downfall. The rain toggled off will still be considered as rain! Use /weather clear instead.

Parameter	Syntax	Default Value	Explanation
weather	Keyword		The weather to check for.
world	world:name	player location	The world to check for the weather.
Example

isSunny: "weather sun"
weatherInPlayerWorld: "weather rain world:%ph.player_home_world%"
overworldIsRainy: "weather rain world:overworld"
World: world🔗
This conditions checks if the player is in a specified world. The first argument is the name of a world.

Example


world world

Variables List🔗
This page lists all the variables that are available in BetonQuest. Some of them are only useful when exported for use in other plugins through the support for PlaceHolderAPI.

Variables marked as static can be resolved without a player specified.

BetonQuest Elements🔗
Objective Property Variable🔗
Using this variable you can display a property of an objective. The first argument is an ID of the objective as defined in the objectives section (not the type). Make sure that the player has this objective active or it will be replaced with nothing (""). Second argument is the name of a property you want to display. All properties are described in "Objectives List" chapter.


%objective.kill_zombies.left%
Condition Variable🔗
You can expose BetonQuest's conditions to 3rd party plugins by using the condition variable together with the PAPI support. The variable will return true or false by default. If you add papiMode to the instruction it will return yes or no.
You can translate the papiMode's result by changing the values of condition_variable_met condition_variable_not_met in the messages.yml config.


%condition.myCondition%
%condition.myCondition.papiMode%
Constant Variable🔗
Constants are a bit different from other variables, as you can freely define the values of them. They are defined in the constants section like this:


constants:
  village_location: 100;200;300;world
  village_name: Concrete
To use a constant variable, you must use %constant.constantName%:


%constant.village_location%
%constant.village_name%
If you want to parse a variable from a different package, follow the same syntax as you would working across packages. The proper syntax is %questPackage>constant.constantName%.

BetonQuest Data Types🔗
Point Variable🔗
This variable displays the amount of points you have in some category or amount of points you need to have to reach a number. The first argument is the name of a category and the second argument is either amount or left:x, where x is a number.


%point.reputation.amount%
%point.reputation.left:15%
Global Point Variable🔗
static

This variable displays the amount of global points in some category or the amount of points needed to reach a number. The first argument is the name of a category and the second argument is either amount or left:x, where x is a number.


%globalpoint.global_knownusers.amount%
%globalpoint.global_knownusers.left:100%
Tag Variable🔗
This variable displays whether the player has a tag or not. The variable will return true or false by default. If you add papiMode to the instruction it will return yes or no. You can translate the papiMode's result by changing the values of condition_variable_met and condition_variable_not_met in the messages.yml config.


%tag.test%
%tag.test.papiMode%
Global Tag Variable🔗
static

This variable displays whether a global tag is set or not. The variable will return true or false by default. If you add papiMode to the instruction it will return yes or no. You can translate the papiMode's result by changing the values of condition_variable_met and condition_variable_not_met in the messages.yml config.


%globaltag.test%
%globaltag.test.papiMode%
Custom Text Variable🔗
It is possible to save text per player. This works by using the variable objective and the variable event.

Other Variables🔗
Eval Variable🔗
static

This variable allows you to resolve an expression containing variables, and the result will then be interpreted again as a variable. You need to escape the % inside eval with a backslash \ to prevent it from being interpreted as a delimiter. You can nest multiple evals, but this leads you to an escape hell. If you do so, you need to add one escape level with each nesting level, this means normally you write \% and in the next level you need to write \\\%.


%eval.player.\%objective.variableStore.displayType\%%
%eval.player.\%eval.objective.\\\%objective.otherStore.targetStore\\\%.displayType\%%
Item Variable🔗
With this variable you can display different properties of a specific QuestItem. The first argument is the name of the item (as defined in the items section). The amount argument displays the number of items in the players inventory and backpack, the left:x gives the difference to the x value (when the amount is higher than the value it will be negative). The name argument simply gives the defined name or an empty String, when not set and lore:x displays the lore row with index x (starting with 0). Both name and lore supports the raw subargument to get the text without formatting.


%item.stick.amount%
%item.stick.left:32%
%item.epic_sword.name%
%item.epic_sword.lore:0.raw%
Item durability variable🔗
With this variable you can display the durability of an item. The first argument is the slot. An optional argument is relative which will display the durability of the item relative to the maximum from 0 to 1, where 1 is the maximum. You can specify the amount of digits with the argument digits:x, where x is a whole number. This default is 2 digits. Additionally, you get the output in percent (inclusive the '%' symbol).


%itemdurability.HAND%
%itemdurability.CHEST.relative%
%itemdurability.CHEST.relative.percent%
%itemdurability.HEAD.relative.digits:5%
Location Variable🔗
This variable resolves to all aspects of the player's location. The x, y and z coordinates, the world name, the yaw and pitch (head rotation). There are also modes for the Unified Location Formatting (ULF from now on) which means that this variable can also be used in events, conditions etc. If you just specify %location% the variables will resolve to a ULF with yaw and pitch. You can add two options to that base, one will give back parts of the ULF and the other will set to how many decimal places the variable will resolve.


%location%           # -> 325;121;814;myWorldName;12;6
%location.xyz%       # -> 325 121 814 
%location.x%         # -> 325
%location.y%         # -> 121
%location.z%         # -> 814
%location.yaw%       # -> 12
%location.pitch%     # -> 6
%location.world%     # -> myWorldName
%location.ulfShort%  # -> 325;121;814;myWorldName
%location.ulfLong%   # -> 325;121;814;myWorldName;12;6

%location.x.2%       # -> 325.16
%location.ulfLong.5% # -> 325.54268;121.32186;814.45824;myWorldName;12.0;6.0
Math Variable🔗
static

This variable allows you to perform a calculation based on other variables (for example point or objective variables) and resolves to the result of the specified calculation. The variable always starts with math.calc:, followed by the calculation which should be calculated. Supported operations are +, -, *, /, ^ and %. You can use ( ) and [ ] braces and also calculate absolute values with | |. But be careful, don't use absolute values in the command event as it splits the commands at every | and don't nest them without parenthesis (|4*|3-5|| won't work, but |4*(|3-5|)| does). Additionally, you can use the round operator ~ to round everything left of it to the number of decimal digits given on the right. So 4+0.35~1 will produce 4.4 and 4.2~0 will produce 4.

To use variables in the calculation you have two options: First just write the variable, but without % around them; In cases where this doesn't work, e.g. if the variable contains mathematical operators, you can surround it with curly braces { }. Inside the curly braces you have to escape with \, so to have a \ in your variable you need to write \\, to have a } inside your variable you need to write \}.

When the calculation fails 0 will be returned and the reason logged.

Warning

The modulo operator needs to be escaped with a backslash \ to prevent it from being interpreted as a placeholder delimiter. If you don't want to escape the percentage and actually want to write a backslash you can use \\%. Don't forget to escape the backslash itself with another backslash if you are inside a double-quoted string ".


%math.calc:100*(15-point.reputation.amount)%
%math.calc:objective.kill_zombies.left/objective.kill_zombies.total*100~2%
%math.calc:-{ph.myplugin_stragee+placeholder}%
%math.calc:64\%32%
Npc Variable🔗
static

This variable resolves information about a Npc. Specifying an argument determines the return: the Npc name, or full name (with formatting).

Arguments:
* name - Return Npc name
* full_name - Return Npc name with formatting

Example

%npc.bob.name%        # Bob
%npc.bob.full_name%   # &eBob
Npc Location Variable🔗
This variable resolves to all Npc location. For details see the location variable. The general syntax is %npc.<id>.location.<mode>.<precision>%.

Example

%npc.mayor.location%           # -> 325;121;814;npcWorldName;12;6
%npc.mayor.location.xyz%       # -> 325 121 814 
%npc.mayor.location.ulfLong.5% # -> 325.54268;121.32186;814.45824;npcWorldName;12.0;6.0
Player Name Variable🔗
The variable %player% is the same as %player.name% and will display the name of the player. %player.display% will use the display name used in chat and %player.uuid% will display the UUID of the player.


%player%
%player.name%
%player.display%
%player.uuid%
Quester Name (Conversation)🔗
When the player is in a conversation, this variable will contain the quester's name in the player's quest language. If the player is not in a conversation, the variable is empty.


%quester%
Random Number Variable🔗
static

This variable gives a random number from the first value to the second. The first argument is whole or decimal, the second and third arguments are numbers or variables, separated by a ~. Like the math variable you can round the decimal value by using instead of decimal the argument decimal~x where x is the maximal amount of decimal places. Variables can be used with {} instead of %%. Note that the first value is returned when it is higher than the second.


%randomnumber.whole.0~10%
%randomnumber.whole.-70~70%
%randomnumber.decimal~3.3.112~100%
%randomnumber.decimal~1.0~{location.y}%
Version Variable🔗
static

This variable displays the version of the plugin. You can optionally add the name of the plugin as an argument to display version of another plugin.


%version.Citizens%

Schedules🔗
Schedules allow you to run events periodically at specific times for the entire server.

Player independent events🔗
Whenever events are run from a conversation or an objective, they are always run for a specific player. For events run from a schedule this is not the case as there is no specific player involved.
This means you can only use events that are player independent, like setblock or globaltag, in schedules. The same applies to the conditions used by these events.

To determine if an event is player independent (and can be used in schedules), look for the static flag in the docs.

Example

Set Block: setblock
persistent, static 

Changes the block at the given position.

Some events behave differently when called from a schedule in independent mode. For example, tag delete will include offline players. A list of all events that act differently can be found in the runIndependent docs.

But sometimes you might want your schedule to run a player dependent event, like message or give for all players on the server. To do this you can use the runforall event. It will run the given events for all players on the server. You can even use conditions to filter out players.

Realtime schedules🔗
Realtime schedules are, as the name already says, schedules that run at a specific real world time, for example at 12 o'clock each day. Do not confuse these with Minecraft's ingame time!

The time is provided by the system time of the computer your minecraft server is running on, in the systems time zone.

Daily realtime schedule: realtime-daily🔗
A super simple to use type of schedule, but also limited in its functionality.
Just specify the time of the day when the events should run, and they will run every day at that same time.


Simple Example
Full Example

schedules:
  sayGoodNight: 
    type: realtime-daily 
    time: '22:00' 
    events: bell_ring,notify_goodNight 
Runs every day at 10pm, will ring a bell and wish everyone a good night.


Warning

The time must always be in '' to avoid problems. It needs leading zero if less than 10.

Cron realtime schedule: realtime-cron🔗
The cron realtime schedule is an incredibly flexible tool to define when events shall run.
It is similar to the realtime-daily schedule but the time is defined as a cron expression.
The supported syntax is identical to the original unix crontab syntax.

Tip

Crontab Guru is a great tool for learning and testing cron expressions. It also provides a long list of examples. BetonQuest supports all features listed there, even the non-standard ones!


Simple Example
Full Example

schedules:
  sayGoodNight: 
    type: realtime-cron 
    time: '0 22 * * *' 
    events: bell_ring,notify_goodNight 
Runs every day at 10pm, will ring a bell and wish everyone a good night.


The following special expressions were added for extended functionality or simpler usage:

Expression	Description	Equivalent to
@reboot	Run at server startup, before catching up any missed schedules	-
@hourly	Run once an hour at the beginning of the hour	0 * * * *
@daily / @midnight	Run once a day at 00:00	0 0 * * *
@weekly	Run once a week at 00:00 on Sunday morning	0 0 * * 0
@monthly	Run once a month at 00:00 of the first day of the month	0 0 1 * *
@yearly / @annually	Run once a year at 00:00 of 1 January	0 0 1 1 *
Catchup Strategies🔗
Obviously, scheduled events can't be run while the server is shut down.
If you want to be sure that a schedule will nevertheless be run, you can define a catchup strategy.

On startup, BetonQuest checks which schedules have been missed and (if needed) they will be run on the first tick.
Schedules of the same type will be run in the order they were missed. For mixed types the order can not be guaranteed.


NONE
ONE
ALL
Example

schedules:
  sayGoodNight: 
    type: realtime-daily
    time: '22:00'
    events: bell_ring,notify_goodNight
    catchup: none 
As it's just an announcement we don't need to repeat it. The right time has passed.


Danger

If the server was shut down for a long time, running all missed schedules can be a too heavy task for the server to handle.

For example using realtime-daily type with a syntax like * * * * * (run every minute) and catchup strategy ALL will create 86 400 missed shedules per day!

So be very cautious when using ALL catchup strategy!

By deleting .cache/schedules.yml before startup you can make BetonQuest forget about any missed schedules 

Conversations
In this tutorial, you will learn the basics of the conversations. These allow you to create a dialog between the player and a NPC. Therefore, these are the basic tool for story telling.

Requirements

Setup Guide
Related Docs

Conversations
Download Tutorial Setup

Enter this command in the chat to download the pre-made setup for this tutorial:


/bq download BetonQuest/Quest-Tutorials 59a315b91279827533555e36b37dbea2f3238409 QuestPackages /Basics/Conversations/1-DirectoryStructure /tutorialQuest overwrite
You can now find all files needed for this tutorial in this location: "YOUR-SERVER-LOCATION/plugins/BetonQuest/QuestPackages/tutorialQuest"
1. Linking a conversation to a NPC🔗
Usually, conversations happen between a NPC and the player. Therefore, we need to create the npcs and npc_conversations sections in the package.yml so that the plugin knows which NPC uses which conversation. In this tutorial we will use Citizens. This is how it works:

package.yml

npcs:
  JackNpc: "citizens 1"
npc_conversations:
  JackNpc: "Jack"
This links the NPC with the given Citizens ID (1) to the conversation with the given identifier (Jack). Save the file after editing.
How to create a Citizens NPC? Where do I find the NPC's ID?
2. Creating your first conversation🔗
It's time to create the first conversation with Jack! This chapter will teach you the basic structure of a conversation.

Let's take a look at how a conversation is defined in the plugin's files:

Tip: Click the plus buttons next to the text for explanations!

jack.yml

conversations:
  Jack: 
    quester: "Jack" 
    first: "firstGreeting" 
    NPC_options: 
      firstGreeting:
        text: "Hello and welcome to my town traveler! Nice to see you. Where are you from?"
        pointers: "whereYouFrom" 

    player_options: 
      whereYouFrom:
        text: "First I want to know who you are!"
A BetonQuest conversation is a cycle of responses between the NPC and the player. Anything the NPC says is called NPC_options, everything the player answers is called player_options.

A conversation always starts with an NPC_option. Now the player must answer the NPC using a player_option.

Options point to each other using the pointer argument. In the case of an NPC_option, the pointer argument would contain the name of a player_option. Usually, a player has more than one answer to choose from. This is done by adding multiple player_option names to a NPC_option.

After the player responded, they are shown another NPC_option that the previously chosen player_option points to.

Whenever either a player_option or a NPC_option point to no other option the conversation ends as there are no more responses or answers.

The Conversation Cycle

Pointer

Pointer

No pointer present

No pointer present

Conversation Starts

First NPC_option

player_option

NPC_option

Conversation Ends

3. Trying the Conversation ingame🔗
You can easily check if your quest is working on the server. Open the file "jack.yml" in the "conversations" folder. Copy the above conversation into it and save the file.

Now type /bq reload in the chat and right-click the NPC.

You can select the answer by pressing the jump key (Space by default).

4. Conversations with multiple choices🔗
Let's see how to create multiple responses for the player to choose from using the pointer argument.

A NPC_option can point to multiple player options at the same time. As soon as a pointer argument contains more than one player_option, the player can choose.

Tip: Highlighted lines in blue are new compared with the previous example.

jack.yml

conversations:
  Jack:
    quester: "Jack"
    first: "firstGreeting"
    NPC_options:
      firstGreeting:
        text: "Hello and welcome to my town traveler! Nice to see you. Where are you from?"
        pointers: "whereYouFrom"
      whoAmI:
        text: "I am &6Jack&r. The mayor of this beautiful town. We have some big farms and good old taverns well worth checking out! So now where are you from?"
        pointers: "smallIsland,bigCity" 
      islandAnswer: 
        text: "That sounds familiar! I grew up in a small town with few people. So we already have something in common! Do you want something to eat?"
      cityAnswer: 
        text: "Oh I know! I think you're from Kayra, right? Nice city but to be honest I prefer country life... You look a bit hungry. Do you want something to eat?"

    player_options:
      whereYouFrom: 
        text: "First I want to know who you are!"
        pointers: "whoAmI" 
      smallIsland: 
        text: "From a small island located east."
        pointers: "islandAnswer" 
      bigCity:  
        text: "From a big city located west."
        pointers: "cityAnswer" 
With these changes, the mayor asks the player where he is from. The player can either say that they are from a smallIsland or from a bigCity. This creates two different paths through the conversation.

5. Joining conversation paths🔗
Let's join these paths again to show the same ending:
Add the same pointer argument to both paths' NPC_options. They point to the new yesPlease player_option.

jack.yml

conversations:
  Jack:
    quester: "Jack"
    first: "firstGreeting"
    NPC_options:
      firstGreeting:
        text: "Hello and welcome to my town traveler! Nice to see you. Where are you from?"
        pointers: "whereYouFrom"
      whoAmI:
        text: "I am &6Jack&r. The mayor of this beautiful town. We have some big farms and good old taverns well worth checking out! So now where are you from?"
        pointers: "smallIsland,bigCity"
      islandAnswer:
        text: "That sounds familiar! I grew up in a small town with few people. So we already have something in common! Do you want something to eat?"
        pointers: "yesPlease" 
      cityAnswer:
        text: "Oh I know! I think you're from Kayra, right? Nice city but to be honest I prefer country life... You look a bit hungry. Do you want something to eat?"
        pointers: "yesPlease" 
      foodAnswer:
        text: "You're welcome! Take it... &7*gives food*"

    player_options:
      whereYouFrom:
        text: "First I want to know who you are!"
        pointers: "whoAmI"
      smallIsland:
        text: "From a small island located east."
        pointers: "islandAnswer"
      bigCity:
        text: "From a big city located west."
        pointers: "cityAnswer"
      yesPlease: 
        text: "Oh yes I'm starving! Thank you."
        pointers: "foodAnswer"
The following graph shows the paths through the conversation. Since there are two pointers assigned to the whoAmI option, the player can choose between one of the paths.

Conversation Flow Graph

Interaction with NPC

points to

points to

points to

points to

points to

points to

points to

points to

points to

firstGreeting

whereYouFrom

whoAmI

smallIsland

bigCity

islandAnswer

cityAnswer

yesPlease

foodAnswer

Try the conversation ingame by saving the file and executing the /bq reload command! Then right-click Jack. Select different options by using the keys for walking forwards and backwards (W and S by default). Confirm options by jumping (Space by default).

Is the example not working?
Summary🔗
You've learned how to create simple conversations in which the player can choose different paths. In the next part of the basics tutorial you will learn how Jack the mayor can give food to the player using events!

Conversations
Conversations are the main way to interact with players in BetonQuest. They are used to display text, ask questions and execute commands. This page contains the reference documentation for all conversation related features. Consider doing the conversation tutorial if you are just getting started.

General Information🔗
A conversation is a sequence of questions and answers. It is started by a NPC and can be ended by both the player or the NPC.

Example conversation

conversations: 
  mayorHans: 
    quester: "Hans the Mayor" 
    first: "welcome,blacksmithReminder" 
    stop: "true"  
    final_events: "setCityState" 
    interceptor: "simple" 
    NPC_options: 
      welcome:
        text: "Good day, dear %player%! Welcome back to my town." 
        events: "playSound,giveMoney" 
        conditions: "firstVisit,!criminal" 
        pointers: "friendly,hostile" 
      blacksmithReminder:
        text: "Please visit the blacksmith, he has a task for you."
        conditions: "!criminal"
      howDareYou:
        text: "How dare you to talk to me like that?! Get out of my sight!"
    player_options: 
      friendly:
        text: "Thank you your honor, I'm happy to be here."
        events: "givePresent"
        pointers: "blacksmithReminder"
      hostile:
        text: "Your Honor, I come bearing a ultimatum letter from the people. They have grown tired of your corruption and greed."
        conditions: 'hasUltimatumLetter'
        pointers: "howDareYou"
When an NPC wants to say something he will check conditions for the first option (in this case welcome). If they are met, he will choose it. Otherwise, he will skip to next option (note: conversation ends when there are no options left to choose). After choosing an option the NPC will execute any events defined in it and say it's text. Then the player will see options defined in the player_options branch to which the pointers setting points, in this case friendly and hostile. If the conditions for a player options is not met, the option is simply not displayed, similar to texts from NPC. The player will choose the option they want, and it will point back to other NPC text, which points to next player options and so on.

If there are no possible options for player or NPC (either from not meeting any conditions or being not defined) the conversations ends. If the conversation ends unexpectedly, check the console - it could be an error in the configuration.

This can and will be a little confusing, so you should name your options, conditions and events in a way which you will understand in the future. Don't worry though, if you make some mistake in configuration, the plugin will tell you this when running /q reload.

Binding Conversations to NPCs🔗
Conversations can be assigned to NPCs. This is done in the npc_conversations section:

Example

npc_conversations:
  Hans: mayorHans 
A NPC will only react to right clicks by default. This can be changed by setting npcs.accept_left_click in the "config.yml" to true.

You can assign the same conversation to multiple NPCs. It is not possible to assign multiple conversations to one NPC. For this purpose, have a look at cross-conversation-pointers though.

Conversation displaying🔗
BetonQuest provides different conversation styles, so called "conversationIO's". They differ in their visual style and the way the player interacts with them.

BetonQuest uses the menu style by default. If ProtocolLib is not installed, the chest style will be used. You can change this setting globally by changing the default_io option in the "config.yml" file.

It is also possible to override this setting per conversation. Add a conversationIO: <type> setting to the conversation file at the top of the YAML hierarchy (which is the same level as quester or first options).

In both cases, you can choose from the following conversation styles:

Conversation Styles


menu
chest
combined
simple
tellraw
slowtellraw
A modern conversation style that works with some of Minecraft's native controls.

Requires ProtocolLib

Customizing the Menu Style
 The blue overlay shows the player's key presses.


Cross-Conversation Pointers🔗
If you want to create a conversation with multiple NPCs at once or split a huge conversation into smaller, more focused files, you can point to both NPC and player options in other conversations. Use the cross-package syntax to do so.

There is one special case when you want to refer to the starting options of another conversation. In this case you do not specify an option name after the point (package>conversation.).

Cross-conversation Pointers Examples

myConversationOption:
  text: "Look carefully at that guard over there..."
  pointers: "lookCareful,guardConv.lookDetected,mainStory>Mirko.interrupt" 
specialOption:
  text: "This option points to the starting options of the conversation 'guardConv' in the package 'myPackage'."
  pointers: "myPackage>guardConv."
Conversation Variables🔗
You can use variables in the conversations. They will be resolved and displayed to the player when he starts a conversation. Check the variables list for more information about which variables exist.

Note

If you use a variable incorrectly (for example trying to get a property of an objective which isn't active for the player, or using %quester% in message event), the variable will be replaced with empty string ("").

Translations🔗
Conversation can be fully translated into multiple languages. A players can choose their preferred language with the /questlang command. You can translate every NPC option, player option and the NPC's name. This is how it's done:


quester:
  en-US: "Innkeeper"
  pl-PL: "Karczmarz"
  de-DE: "Gastwirt"
first: "example1" 
NPC_options:
  example1:
    text:
      en-US: "Good day, dear %player%! Welcome back to my town."
      de-DE: "Guten Tag, lieber %player%! Willkommen zurück in meiner Stadt." 
player_options:
  example2:
    text:
      en-US: "Thank you your honor, I'm happy to be here."
      de-DE: "Danke, Euer Ehren, ich bin froh, hier zu sein."
en-US and de-DE are identifiers of languages present in the lang folder. If the conversation is not translated in the players' language, the plugin will fall back to the default language, as defined in "config.yml".
The same syntax can be applied in a few other features, e.g. the journal entries, quest cancelers and notify events.

Chat Interceptors🔗
While engaged in a conversation, it can be distracting when messages from other players or system messages interfere with the dialogue. A chat interceptor provides a method of intercepting those messages and then sending them after the conversation has ended.

You can specify the default chat interceptor by setting default_interceptor inside the "config.yml". Additionally, you can overwrite the default for each conversation by setting the interceptor key inside your conversation file.

The default configuration of BetonQuest sets the default_interceptor option to packet,simple. This means that it first tries to use the packet interceptor. If that fails it falls back to using the simple interceptor.

BetonQuest adds following interceptors: simple, packet and none:

The simple interceptor works with every server but only supports very basic functionality and may not work with plugins like Herochat.

The packet interceptor requires the ProtocolLib plugin to be installed. It will work well in any kind of situation.

The none interceptor is an interceptor that won't intercept messages. That sounds useless until you have a conversation that you want to be excluded from interception. In this case you can just set interceptor: none inside your conversation file.

Advanced: Extends🔗
Conversations also support the concept of inheritance. Any option can include the key extends with a comma delimited list of other options of the same time. The first option that does not have any false conditions will have its text, pointers and events merged with the extending option. The extended option may itself extend other options. Infinite loops are detected.


NPC_options:

  ## Normal Conversation Start
  start:
    text: 'What can I do for you'
    extends: tonight,today

  ## Useless addition as example
  tonight:
    # Always false
    conditions: random_0-1
    text: ' tonight?'
    extends: main_menu

  today:
    text: ' today?'
    extends: main_menu

  ## Main main_menu
  main_menu:
    pointers: i_have_questions,bye
In the above example, the option start is extended by both tonight and today, both of whom are extended by main_menu. As tonight has a false condition the today option will win. The start option will have the pointers in main_menu added to it just as if they were defined directly in it and the text will be joined together from today. If you structure your conversation correctly you can make use of this to minimize duplication.

Text Formatting
Work in Progress

This feature is still in development and does not work for every feature at the moment. Some features are marked as limited, that means that things like hover and click events are not supported. Currently supported are:

Notify and NotifyAll Event
Compass Names
Conversation
Journal
NPC Name Variable (limited)
Quest Cancler (limited)
Plugin Messages / Translations (limited)
Every string in BetonQuest can be formatted with a formatter. A formatter is a way to format a string with colors, styles, and more, while each formatter has its own syntax.

In the "config.yml" file, you can set the default formatter with the text_parser setting. The default formatter is legacyminimessage.

Anyway each string can set an individual formatter by prefixing the string with @[FormatterName].

Formatter🔗
Legacy🔗

legacy
The legacy formatter is the old common way to format strings. It's a really simple formatter that has a lot of limitations, but it is still used by the community as it is the most known one. It uses the & or § character followed by a color code or a style code character.

You can read everything about minecraft formatting here.

This formatter actually can parse a bit more as normally, like links get clickable, and colors in the adventure format §#a25981 or the BungeeCord RGB format §x§a§2§5§9§8§1.

You can read everything about these formats here.

Example


text1: '&cHello &e&lWorld'
text2: '@[legacy]&cHello &e&lWorld'
MiniMessage🔗

minimessage
MiniMessage is the new standard for formatting strings. It's a really advanced formatter that has a lot of features. The formatting is based on tags like <red> and <bold>. You don't need to close them like </red>, but that sometimes make it clear what exactly you are formatting.

Everything about this format can be read here.

Example


text1: '<red>Hello <yellow><bold>World</bold>'
text2: '@[minimessage]<red>Hello <yellow><bold>World</bold>'
Legacy & MiniMessage🔗

legacyminimessage
This formatter is a combination of the legacy and MiniMessage formatter. It allows you to use both formats. In that way, you can use the format that fits the best for every string. You can also use both formats in one string, but you need to be careful with that, as it can lead to unexpected results.

Example


text1: '&cHello <yellow><bold>World</bold>'
text2: '@[legacyminimessage]&cHello <yellow><bold>World</bold>'
MineDown🔗

minedown
This formatter is a perfect alternative to MiniMessage. Mainly, it still supports the old legacy format, but also the new RGB format, as well as some more simple formatting. You don't need to write these tags like in MiniMessage, instead you write more advanced formats like this [Text](format).

You can read everything about this format here.

Example


text1: '[Hello](red) [World](yellow bold)'
text2: '@[minedown][Hello](red) [World](yellow bold)

NPCs
NPCs are an essential part of every RPG for player ingame interaction. In BetonQuest NPCs can be used to start conversations or interact with them otherwise, as shown in the Scripting and Visual Effects section of the documentation.

Info

This NPC is not related to the NPC/Quester in Conversations

Provided Integrations🔗
BetonQuest provides Integrations for the following Npc plugins:

Citizens
MythicMobs
FancyNpcs
ZNPCsPlus
Referring an NPC🔗
Npcs are defined in the npcs section.


Citizens
MythicMobs
FancyNpcs
ZNPCsPlus
Example

npcs:
  innkeeper: citizens 0
  mayorHans: citizens 4
  guard: citizens Guard byName
You simply use the Citizens NPC id as argument. To acquire the NPCs ID select the NPC using /npc select, then run /npc id.

You can also get a NPC by its name with the byName argument. That is useful when you have many NPCs with the same name which should all start the same conversation or count together in the npcinteract and npckill objectives.


Warning

If there are more NPCs than one NPC with the same name, and you select multiple NPCs by name (like by using Citizens byName option) certain events like npcteleport or objectives like npcrange might throw an exception.

Conversations🔗
You can start Conversations with NPC interaction by assigning them in the npc_conversations section of a quest package.

NPC Hiding: hide_npcs🔗
You can hide NPCs for certain players using conditions. You can find information about it here.

Menus🔗
BetonQuest allows the creation of fully custom GUIs using the events and items system.
Nearly everything can be done with these, from guis listing open quests over simple warp systems to information GUIs that display player stats.

Menu example

 Try the working example for a quick overview.

Creating a menu🔗
To create a new menu just create a menus section in any file inside a quest package. The name which can be used to identify each menu will be the name of another section as shown below.

Menu Definition Example

menus:
  myMenuName:
    title: "My Menu Title"
    slots: #...
menu_items: #...
items: #...
General Menu Settings🔗
These are general settings for customizing a menu.

Required Settings🔗
Setting Name	
Example
Description
title	title: "&6&lQuests"	Will be displayed in the top left corner of your menu. You can use color codes to color the title. Variables and defining languages are supported.
height	height: 3	How many lines of slots your menu will have. Minimum 1, Maximum 6.
Optional Settings🔗
Setting Name
Example	Description
open_conditions	open_conditions: "unlockedMenu,!sneaking"	One or multiple conditions (separated by a ,) which all have to be true to open the menu with a bound item or a bound command.
open_events	open_events: "menuOpenSound"	One or multiple events (separated by a ,) which will be fired when the menu is opened.
close_events	close_events: "menuCloseSound"	One or multiple events (separated by a ,) which will be fired when the menu is closed.
bind	bind: "openMenuItem"	Clicking with this quest item in hand will open the menu. You can create this item in the items section of your package.
command	command: "/quests"	This command can be executed to open the menu.
The menu_items section🔗
The items section contains all items which should be displayed in the menu, defined as individual sections of the config.

A basic item section looks like this:

Item Section Example

menus:
  myMenuName:
    title: "My Menu Title"
    slots: #...
menu_items: 
  skeletonQuestDone: 
    item: "questDoneItem" 
  goldQuestDone: 
    item: "questDone"
Optional Item Settings🔗
The three basic optional settings.

Name
Example	Description
amount	amount: 30	The size of the stack that will be displayed in the menu. Variables are supported.
conditions	conditions: "questDone"	One or multiple conditions (separated by a ,) which all have to be true to display the item.
close	close: true	If set to true the menu will be closed after clicking the item. If this is not set the default_close value from the plugins config will be used.
The optional text setting🔗
By default, the name and description of the quest item is displayed when hovering over the item. You can overwrite this by using the text setting. If you only define one line, only the name will be overwritten. Both color codes and variables are supported and carried into the next line, if not overridden. The text can be provided as a single string with newlines, a multi-line string, or a list of strings, see examples.


List
String with Newlines
Multi-line String
List Example

skeletonQuestDone:
  item: "questDoneItem"
  text:
    - "&2Reputation: &6&l%point.quest_reputation.amount%"
    - "Make quests to gain reputation!"

Just like the text in conversations you can provide translations for all languages:

Translation Example

menu_items:
  skeletonQuestDone:
    item: "questDoneItem"
    text:
       en-US: 
         - "&7[Quest] &6&lThe lost amulet"
         - "&4&o"
         - "&eLeft click to locate npc"
         - "&eRight click to cancel quest"
       de-DE: 
         - "&7[Quest] &6&lDas verlorene Amulet"
         - "&4&o"
         - "&eLinksclick um den NPC zu finden"
         - "&eRechstclick um die Quest abzubrechen"
The optional click setting🔗
You can define one or multiple events (separated by ,) that are run whenever the item is clicked.

Example

items:
  skeletonQuestDone:
    item: "simple questDoneItem"
    click: "simple startQuest,closeMenu"
Click Types🔗
Different types of clicks can be distinguished:

Click Types Example

items:
  skeletonQuestDone:
    item: "questDoneItem"
    click:
      left: "give_xp,msg_give_xp" 
      shiftLeft: "give_xp,take_xp" 
      right: "take_xp,msg_take_xp" 
      shiftRight: "take_xp,msg_take_xp" 
      middleMouse: "msg_beautifull_text" 
The slots section🔗
The slots section defines where the items from the items section should be displayed.
You can also assign multiple items to the same slot and use conditions in the items section to specify which one should be used. If you assign multiple items the first one for which all conditions are true will be displayed.


menus:
  myMenuName:
    title: "My Menu Title"
    slots:
      8: "reputation" 
      9: "questStarted,questCompleted" 
Slot Numbers
Row Assignment🔗
You can also assign multiple items to a row of slots. Now the slots are filled up one by one using the items whose conditions are true:


10-12: "quest1,quest2,quest3" 
Rectangle Assignment🔗
Additionally, you can also assign items to a rectangle of slots. Just like with the row, the slots in this rectangle are filled up one by one using the items whose conditions are true


14*25: "quest1,quest2,quest3"
RectangleExample

Basic Menu Example🔗
This is an example of a basic menu that displays the progress of two quests.

Example

Usage🔗
You can copy and paste this example into any file in a package. Then reload and execute the command /q give YOUR_PACKAGE>openMenuItem to get the item that opens the menu.

Read the related docs in the menu section to learn more about these configuration options.

Menu Definition🔗

menus:
  questMenu:
    height: 4
    title: "&6&lQuests"
    bind: "openMenuItem"
    command: "/quests"
    slots:
      0-3: "filler,filler,filler,filler"
      4: "reputation"
      5-8: "filler,filler,filler,filler"
      9: "skeletonQuestActive,skeletonQuestDone"
      10: "goldQuestActive,goldQuestDone"
      27-35: "filler,filler,filler,filler,filler,filler,filler,filler,filler"

menu_items:
  skeletonQuestActive:
    item: "skeletonQuestActiveItem"
    amount: 1
    conditions: "!skeletonQuestDone"
    text:
        - "&7[Quest] &f&lBone ripper"
        - "&f&oRipp some skeletons off"
        - "&f&otheir bones to complete"
        - "&f&othis quest."
        - "&f&o"
        - "&eLeft click to locate NPC."
    click:
      left: "locationNotify"
    close: true
  skeletonQuestDone:
    item: "questDone"
    amount: 1
    conditions: "skeletonQuestDone"
    text:
        - "&2[Quest] &f&lBone ripper"
        - "&f&oRipp some skeletons off"
        - "&f&otheir bones to complete"
        - "&f&othis quest."
        - "&f&o"
        - "&2Quest completed!"
    close: false
  goldQuestActive:
    item: "goldQuestActiveItem"
    amount: 1
    conditions: "!goldQuestDone"
    text:
        - "&7[Quest] &f&lGold rush"
        - "&f&oMine some gold"
        - "&f&oto complete this quest."
    click:
      left: "locationNotify"
    close: true
  goldQuestDone:
    item: "questDone"
    amount: 1
    conditions: "goldQuestDone"
    text:
        - "&2[Quest] &f&lGold rush"
        - "&f&oMine some gold"
        - "&f&oto complete this quest."
        - "&2Quest completed!"
    close: false
  reputation:
    item: "xpBottle" 
    amount: 1
    text:
        - "&2Quest Level: &6&l%point.quest_reputation.amount%"
    close: true
  filler: 
    text: "&a "
    item: "filler"

conditions:
  skeletonQuestDone: "tag skeletonQuestDone"
  goldQuestDone: "tag goldQuestDone"
events:
  locationNotify: "notify &cThe skeletons roam at x\\:123 z\\:456!"
items:
  openMenuItem: "simple BOOK title:Quests"

  xpBottle: "simple EXPERIENCE_BOTTLE"
  filler: "simple GRAY_STAINED_GLASS_PANE"

  skeletonQuestActiveItem: "simple BONE"
  goldQuestActiveItem: "simple RAW_GOLD"
  questDone: "simple LIME_CONCRETE"


Elements
Events🔗
Menu Event: menu🔗
This event can be used to open, close or update menus. The first argument is the type of action that should be done. It is either open to open a new menu, close to close the currently opened menu, or update to update the content of the currently opened menu.
If you want to open a menu you have to add a second argument which should be the id of a menu. If you want to open menus from other packages just use the cross package format.

Example: menu open quest_gui

Example: menu close

Example: menu update

Conditions🔗
Menu Condition: menu🔗
This condition can be used to check if the player has currently opened any menu. You can add id: optional and specify the id of a menu to check if the player has opened the menu with this id. If you want to check for menus from other packages just use the cross package format.

Example: menu id:quest_gui

Objectives🔗
Menu Objective: menu🔗
This objective is completed when the player opens the menu with the given id. The only required argument is the id of the menu. If you want to use menus from other packages just use the cross package format.

The objective also has the property menu which can be used by the objective variable. It returns the title of the menu which should be opened.

Example: menu quest_gui

Variables🔗
Menu Variable: menu🔗
This variable displays the title of the menu that is currently opened by the player. If no menu is opened it will be just empty.

Example: %menu%