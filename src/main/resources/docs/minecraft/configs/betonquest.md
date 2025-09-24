Overview
This is the complete reference documentation for BetonQuest. It has in depth explanations for all of BetonQuest's features, config options and permissions.

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

Intstruction Text Example

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

You define them in the objectives section as shown above. At the end of the instruction text you can add conditions and events for the objective. Conditions will limit when the objective can be completed (e.g. killing zombies only at given location), and events will fire when the objective is completed (e.g. giving a reward, or setting a tag which will enable collecting a reward from an NPC). You define these like that: conditions:con1,con2 events:event1,event2 at the end of instruction text. Separate them by commas and never use spaces! You can also use the singular forms of these arguments: condition: and event:.

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

You can negate the condition (revert its output) by adding an exclamation mark (!) at the beginning of its name. This only works in the place where conditions are used, i.e. in conversations, not in the conditions section). If you do so, make sure to enclose the condition in quotes, otherwise YAML will give you a syntax error.

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
Accessing features from other packages can be very helpful to link quests together. All events, conditions, objectives, items and conversations can be accessed. Just journal entries only work in their own package.

You never need to access a specific file since feature names are unique within a package.

Top-Level Packages🔗
You can access top-level packages (placed directly in "QuestPackages") by prefixing the feature's name with a dot and the package name.

Example
Packages in Sub-folders🔗
You can access packages in sub-folders by prefixing the feature's name with the package name and the path from the "QuestPackages" folder to the package.

Example
Relative paths🔗
You can specify relative paths to a package instead of full paths. The underscore (_) means "one folder up" from the current packages "package.yml". In turn, a leading dash (-) combined with a folder name navigates "one folder down" into the given folder. Each package in the path must be seperated by a dash.

This can be useful when distributing or moving packages. Instead of rewriting every package path to match the current location, relative paths will still work.

Example
Disabling Packages🔗
Each package can optionally be disabled/enabled by setting enabled inside the package section to true or false.


package:
  ## Optionally add this to the package.yml
  enabled: false
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
Cancel a quest: cancel🔗
This event works in the same way as a quest canceler in the backpack.

Running this event is equal to the player canceling a quest using the backpack. The only argument is the identifier of a quest canceler, as defined in the cancel section.

Example

cancelQuest: "cancel woodQuest"
Burn: burn🔗
Parameter	Syntax	Default Value	Explanation
duration	duration:number		The duration the player will burn (in seconds). Can be a variable.
Example

events:
  burn: "burn duration:4"
  punishing_fire: "burn duration:%point.punishment.amount%"
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
      en: Target
      pl: Cel
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
time unit	Keyword	Seconds	The unit of time to use for delay and period. Either ticks or minutes. Omit to use seconds.
random	random:number	Disabled	Enables "random mode". Will randomly pick the defined amount of events .
cancelOnLogout	Keyword	Disabled	If enabled, the folder will stop executing events if the player disconnects.
cancelConditions	cancelConditions:cond1,cond2	Disabled	If enabled, the folder will stop executing events if the conditions are true.
Examples

events:
  simpleFolder: "folder event1,event2,event3" 
  runEvents: "folder event1,event2,event3 delay:5 period:1" 
  troll: "folder killPlayer,banPlayer,kickPlayer delay:5 random:1" 
  wait: "folder messagePlayer,giveReward delay:1 minutes" 
If-else through a list of events: first🔗
This event wraps multiple events inside itself, similar folder. Unlike folder, it attempts to execute each event, starting from the first onward. Once it successfully executes one event, it stops executing the rest. This is useful for collapsing long if-else chains into single events.

This event is especially powerful when it is used in conjunction with the condition: keyword, which can be used with any event.

Example

events: 
  firstExample: "first event1,event2,event3"
  event1: "point carry boxes 10 action:add condition:firstCondition"
  event2: "point carry boxes 20 action:add condition:secondCondition"
  event3: "point carry boxes 40 action:add condition:thirdCondition"
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

Another container for events. It picks one (or multiple) of the given events and runs it. You must specify how likely it is that each event is picked by adding the percentage before the event's id. The event won't break if your total percentages are above 100%.

It picks one event from the list by default, but you can add an optional amount: if you want more to be picked. Note that only as many events as specified can be picked and amount:0 will do nothing.

There must be two %% before the event's name if variables are used, one is from the variable and the other one from the event's syntax.

Example


pickrandom 20.5%event1,0.5%event2,79%event3 amount:2
pickrandom %point.factionXP.amount%%event1,0.5%event2,79%event3,1%event4 amount:3
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
It must be a specific day of the week that this condition returns true. You can specify either the english name of the day or the number of the day (1 being monday, 7 sunday,..).

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
Moon Cycle: mooncycle🔗
static

This condition checks the moon cycle (1 is full moon, 8 is Waxing Gibbous) in the given world or the players world. A list of phases can be found here.

Parameter	Syntax	Default Value	Explanation
MoonPhase	Number		The MoonPhase to check for. Can be a variable.
world	world:name	player location	The world to check for the moon phase. Can be a variable.
Example

fullMoon: "mooncycle 1"
newMoonHub: "mooncycle 5 world:hub"
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
The current date must match the given pattern. You can specify the day of the month, the month or the year it must be that this condition returns true or combine them. You can also specify multiple days/months/years by just separating them by , or a interval by using -. If you have trouble understanding how this works have a look at the example.

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
static****persistent

There must a specific (real) time for this condition to return true.

Parameter	Syntax	Default Value	Explanation
Timespan	startTime-endTime		Two points of time seperated by dash in the 24-hour format (0 - 24). The minutes are optional (hh or hh:mm).
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
Timespan	startTime-endTime		Two points of time seperated by dash in the 24-hour format (0 - 24). The minutes are optional (hh or hh:mm).
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

Integration List🔗
This page contains documentation for known integrations that exist for third party plugins. Some integrations also have dedicated pages in the documentation. In total 38 plugins have dedicated support for BetonQuest.

Provided by BetonQuest🔗
BetonQuest hooks into other plugins by itself to provide more events, conditions and objectives or other features.
AuraSkills, Brewery, Citizens, DecentHolograms, Denizen, EffectLib, FakeBlock, Heroes, HolographicDisplays, JobsReborn, LuckPerms, Magic, mcMMO, MythicLib, MMOCore, MMOItems, MythicMobs, PlaceholderAPI, ProtocolLib, Quests, RedisChat, Shopkeepers, TrainCarts, ProSkillAPI, Skript, Vault, WorldEdit, FastAsyncWorldEdit and WorldGuard.

Provided by other plugins🔗
Some plugins also hook into BetonQuest and provide support by themselves:
nuNPCDestinations, CalebCompass, Depenizen, NotQuests, HonnyCompass MythicDungeons JourneyBetonQuest

There are also plugins that hook into BetonQuest that require a clientside mod:
BetonQuestGUI, NGVexJournal

AuraSkills🔗
Conditions🔗
Skill level: auraskillslevel🔗
Checks if the player has the specified skill level. The amount can be a variable or a number. The player needs to be on that level or higher to meet the condition. You can disable this behaviour by adding the equal argument, then the player must match the specified level exactly.


auraskillslevel fighting 5
auraskillslevel farming 10 equal
Stat level: auraskillsstatslevel🔗
Checks if the player has the specified stat level. The amount can be a variable or a number. The player needs to be on that level or higher to meet the condition. You can disable this behaviour by adding the equal argument, then the player must match the specified level exactly.


auraskillsstatslevel luck 5
auraskillsstatslevel luck 10 equal
Events🔗
Give Skill Xp : auraskillsxp🔗
Adds experience to the players skill. The amount can be a variable or a number. The level argument is optional and would convert the amount to levels instead of XP points.


auraskillsxp farming 5
auraskillsxp farming 10 level
Brewery & BreweryX🔗
Conditions🔗
Drunk: drunk🔗
This condition is true if the player is drunken. Only argument is the minimal drunkness (0-100).


drunk 50
Drunk Quality: drunkquality🔗
This condition is true if the player has the given drunk quality. Only argument is the minimal drunk quality (1-10).


drunkquality 3
Has Brew: hasbrew🔗
This condition is true if the player has the given brew with the specified amount in his inventory.


hasbrew 2 MY_BREW
Events🔗
Give Brew: givebrew🔗
Gives the player the specified drink. The first number is the amount, and the second number is the quality of the drink.


givebrew 1 10 MY_BREW
Take Brew: takebrew🔗
Removes the specified drink from the players inventory. An amount needs to be specified.


takebrew 2 MY_OTHER_BREW 
Citizens🔗
If you have this plugin you can use it's NPCs for conversations. I highly recommend you installing it, it's NPCs are way more immersive. Having Citizens also allows you to use NPCKill objective and to have moving NPC's.

A Citizen NPC will only react to right clicks by default. This can be changed by setting acceptNPCLeftClick in the config.yml to true.

Notice

You need to specify the ID of the NPC instead of it's name in the package.yml when using Citizens!

Conditions🔗
NPC distance: npcdistance🔗
This condition will return true if the player is closer to the NPC with the given ID than the given distance. The NPCs ID is the first argument, the distance is the second. If the npc is despawned the condition will return false.

Example


npcdistance 16 22
NPC location: npclocation🔗
persistent, static

This condition will return true if a npc is close to a location. First argument is the id of the NPC, second the location and third the maximum distance to the location that the npc is allowed to have.

Example


npclocation 16 4.0;14.0;-20.0;world 22
NPC region: npcregion🔗
persistent, static

Notice

This condition also requires WorldGuard to work.

This condition will return true if a npc is inside a region. First argument is the id of the npc second is the name of the region.

Example


npcregion 16 spawn
Events🔗
Move NPC: movenpc🔗
This event will make the NPC move to a specified location. It will not return on its own, so you have to set a single path point with /npc path command - it will then return to that point every time. If you make it move too far away, it will teleport or break, so beware. You can change maximum pathfinding range in Citizens configuration files. The first argument in this event is ID of the NPC to move. Second one is a location in a standard format (like in teleport event). You can also specify multiple locations separated by colons to let the npc follow a path of locations. You can also specify additional arguments: block will block the NPC so you won't be able to start a conversation with him while he is moving, wait: is a number of tick the NPC will wait at its destination before firing events, done: is a list of events fired after reaching the destination, fail: is a list of events fired if this event fails. Move event can fail if the NPC is already moving for another player.

Example


movenpc 121 100;200;300;world,105;200;280;world block wait:20 done:msg_were_here,give_reward fail:msg_cant_go,give_reward
Stop moving NPC: stopnpc🔗
This will stop all current move tasks for the npc with the given ID.

Example


stopnpc 16
Teleport NPC: teleportnpc🔗
This event will teleport the NPC with the given ID to the given location.

Example


teleportnpc 53 100;200;300;world
Objectives🔗
NPC Interact: npcinteract🔗
The player has to right-click on the NPC with specified ID. It can also optionally cancel the action, so the conversation won't start. The first argument is number (ID of the NPC). You can add the optional argument cancel to cancel the actual interaction with the NPC. With interaction you can also define the type of interaction that is required, you can define left, right or any.

Example


npcinteract 3 cancel conditions:sneak events:steal
npcinteract 54 interaction:left events:poke
NPC Kill: npckill🔗
The NPC kill objective requires the player to kill a NPC with the given ID. You can also define how many times the NPC has to be killed. Right after the objective's name there must be the ID of the NPC. You can also add an amount with the amount keyword. You can use the notify keyword to display a message each time the player advances the objective, optionally with the notification interval after a colon.

This objective has three properties: amount, left and total. amount is the amount of NPCs already killed, left is the amount of NPCs still needed to kill and total is the amount of NPCs initially required.

Example


npckill 16 amount:3 events:reward notify
NPC Range: npcrange🔗
The player has to enter/leave a circle with the given radius around the NPC to complete this objective. It is also possible to define multiple NPCs separated with ,. The objective will be completed as soon as you meet the requirement of just one npc. First argument is the ID of the NPC, second one is the type: Either enter, leave, inside or outside and the third one is the range. The types enter, leave force the player to actually enter the radius after you were outside of it and vice versa. This means that enter is not completed when the player gets the objective and is already in the range, while inside is instantly completed.

Example


npcrange 3,5 enter 20 events:master_inRange
Variables🔗
Citizen Variable: %citizen.<id>.<argument>%🔗
This variable resolves information about a Citizen NPC by id. Specifying an argument determines the return: the NPC name, or full name.

Arguments: * name - Return citizen name * full_name - Full Citizen name

Example


%citizen.15.name%        # Bob
%citizen.15.full_name%   # &eBob
Citizen Location Variable: %citizen.<id>.location.<mode>.<precision>%🔗
This variable resolves to all Citizen location arguments: the x, y and z coordinates, the world name, the yaw and pitch (head rotation). The first argument is citizen, followed by the citizen ID, then location. It also supports the BetonQuest Unified Location Formatting modes which can optionally be added to the end.

Example


%citizen.15.location%           # -> 325;121;814;npcWorldName;12;6
%citizen.15.location.xyz%       # -> 325 121 814 
%citizen.15.location.x%         # -> 325
%citizen.15.location.y%         # -> 121
%citizen.15.location.z%         # -> 814
%citizen.15.location.yaw%       # -> 12
%citizen.15.location.pitch%     # -> 6
%citizen.15.location.world%     # -> npcWorldName
%citizen.15.location.ulfShort%  # -> 325;121;814;npcWorldName
%citizen.15.location.ulfLong%   # -> 325;121;814;npcWorldName;12;6

%citizen.15.location.x.2%       # -> 325.16
%citizen.15.location.ulfLong.5% # -> 325.54268;121.32186;814.45824;npcWorldName;12.0;6.0
Denizen🔗
Depenizen is also integrated with BetonQuest! Discover available features on the meta documentation.

Events🔗
Script: script🔗
With this event you can fire Denizen task scripts. Don't confuse it with skript event, these are different. The first and only argument is the name of the script.

Example

runDenizenScript: "script beton"
EffectLib🔗
If you install this plugin on your server you will be able to play particle effects on NPCs and locations. You can also use the particle event to trigger particle.

Info

EffectLib is not a normal plugin, it's a powerful developer tool - there are no official docs. However, the Magic plugin has a wiki for EffectLib. It does contain a few magic specific settings though so please don't be confused if some stuff does not work. There is also a magic editor with autocompletion for EffectLib.

Example

effectlib: 
   farmer: 
      class: VortexEffect 
      iterations: 20 
      particle: crit_magic 
      helixes: 3
      circles: 1
      grow: 0.1
      radius: 0.5
      pitch: -60 
      yaw: 90 
      interval: 30 
      checkinterval: 80 
      npcs: 
         - 1 
      locations: 
         - 171;72;-127;world
      conditions: 
         - '!con_tag_started'
         - '!con_tag_finished'
Events🔗
Particle: particle🔗
This event will load an effect defined in effects section and display it on player's location. The only argument is the name of the effect. You can optionally add loc: argument followed by a location written like 100;200;300;world;180;-90 to put it on that location. If you add private argument the effect will only be displayed to the player for which you ran the event.

Example


effects:
  beton:
    class: HelixEffect
    iterations: 100
    particle: smoke
    helixes: 5
    circles: 20
    grow: 3
    radius: 30

events:
  playEffect: particle beton loc:100;200;300;world;180;-90 private
FakeBlock🔗
If you have the FakeBlock integration installed, you will be able to view and hide the block groups created in FakeBlock on a player-specific basis.

Events🔗
Show and hide block groups: fakeblock🔗
Shows or hides the block group for the player. The block group can be specified as a comma-separated list. The groups are case-sensitive. To show a group the showgroup argument is required. To hide a group the hidegroup argument is required.


events:
  showBridge: "fakeblock showgroup bridge"
  hideCityBorder: "fakeblock hidegroup gate,wall,door"
Heroes🔗
When you install Heroes, all kills done via this plugin's skills will be counted in MobKill objectives.

Conditions🔗
Heroes Class: heroesclass🔗
This condition checks the classes of the player. The first argument must be primary, secondary or mastered. Second is the name of a class or any. You can optionally specify level: argument followed by the required level of the player.

Example


heroesclass mastered warrior
Heroes Attribute: heroesattribute🔗
This condition check's the level of a player's attribute. The first argument must be strength, constitution, endurance, dexterity, intellect, wisdom, or charisma. Second argument is the required level of the attribute. Must be greater than or equal the specified number.

Example


heroesattribute strength 5
Skill: heroesskill🔗
This condition checks if the player can use specified skill. The first argument is the name of the skill.

Example


heroesskill charge
Events🔗
Heroes experience: heroesexp🔗
This event simply gives the player specified amount of Heroes experience. The first argument is either primary or secondary and it means player's class. Second one is the amount of experience to add.

Example


heroesexp primary 1000
JobsReborn🔗
Requires adding the following to config.yml:


hook:
  jobs: 'true'
Conditions🔗
Can Level up: nujobs_canlevel {jobname}🔗
Returns true if the player can level up

Has Job: nujobs_hasjob {jobname}🔗
Returns true if the player has this job

Example


nujobs_hasjob Woodcutter
Job Full: nujobs_jobfull {jobname}🔗
Returns true if the job is at the maximum slots

Job Level: nujobs_joblevel {jobname} {min} {max}🔗
Returns true if the player has this job, and at a level equal to or between the min/max

Example


nujobs_joblevel Woodcutter 5 10
Events🔗
Add Jobs Experience: nujobs_addexp {jobname} {exp}🔗
Gives the player experience

Increase Jobs Level: nujobs_addlevel {jobname} {amount}🔗
Increases the player level by amount.

Decrease Jobs Level: nujobs_dellevel {jobname} {amount}🔗
Decreases the players level by amount.

Join Jobs Job Event: nujobs_joinjob {jobname}🔗
Joins the player to job.

Leave Jobs Job Event: nujobs_leavejob {jobname}🔗
Removes the player from job.

Set Jobs Level: nujobs_setlevel {jobname} {level}🔗
Set the player to level.

Objectives🔗
Join Jobs Job Objective: nujobs_joinjob {jobname}🔗
Triggers when player joins job.

Leave Jobs Job Objective: nujobs_leavejob {jobname}🔗
Triggers when player leaves job.

Notice

This is not triggered by '/jobs leaveall'

Jobs Job Levelup: nujobs_levelup {jobname}🔗
Triggers when player levels up.

Jobs Job Payment: nujobs_payment {amount}🔗
Triggers when player makes {amount} of money from jobs. You can use the notify keyword to display a message each time the player advances the objective, optionally with the notification interval after a colon.

This objective has three properties: amount, left and total. amount is the amount of money already received, left is the amount of money still needed to receive and total is the amount of money initially required.

LuckPerms🔗
Context Integration🔗
Any BetonQuest tag (global and per-player) can be used as a LuckPerms context. This means that a player needs the specified tag for a permission to be true - this removes the need for tons of permission add ... events as you can hook your existing quest progress tags right into LuckPerms permission contexts. The syntax is as follows:

key	value
betonquest:tag:PACKAGE_NAME.TAG_NAME	true
betonquest:globaltag:PACKAGE_NAME.TAG_NAME	true
betonquest:tag:myPackage.tagName	true
betonquest:globaltag:myQuest.someTag	true
Check the Luck Perms documentation for an in-depth explanation on what contexts are and how to add them to permissions.

Permissions🔗
If you prefer to directly add or remove permissions without triggering the LuckPerms changelog chat notifications, you can utilize the luckperms addPermission and luckperms removePermission events. You also have the possibility to assign groups to the player via the group.<GroupName> permission.

Example

events:
  addDefaultGroup: "luckperms addPermission permission:group.default,group.quester" 
  addNegated: "luckperms addPermission permission:tutorial.done value:false" 
  addWithContext: "luckperms addPermission permission:group.legend context:server;lobby" 
  addTemporary: "luckperms addPermission permission:donator.level.one expiry:20 unit:MINUTES" 
  removeTutorial: "luckperms removePermission permission:tutorial.done"
  removeMultiple: "luckperms removePermission permission:tutorial.done,group.default" 
You can also add context, value and expiry to the removePermission event but its not recommended as it only removes exact matches. Instead only use the permission to remove.

Magic🔗
Conditions🔗
Wand: wand🔗
This condition can check wands. The first argument is either hand, inventory or lost. If you choose lost, the condition will check if the player has lost a wand. If you choose hand, the condition will check if you're holding a wand in your hand. inventory will check your whole inventory instead of just the hand. In case of hand and inventory arguments you can also add optional name: argument followed by the name of the wand (as defined in wands.yml in Magic plugin) to check if it's the specific type of the wand. In the case of inventory you can specify an amount with amount and this will only return true if a player has that amount. You can also use optional spells: argument, followed by a list of spells separated with a comma. Each spell in this list must have a minimal level defined after a colon.

Example


wand hand name:master spells:flare:3,missile:2
McMMO🔗
Conditions🔗
McMMO Level: mcmmolevel🔗
This conditions checks if the player has high enough level in the specified skill. The first argument is the name of the skill, second one is the minimum level the player needs to have to pass this condition.

Example


mcmmolevel woodcutting 50
Events🔗
Add MCMMO Experience: mcmmoexp🔗
This event adds experience points in a specified skill. The first argument is the name of the skill, second one is the amount of experience to add.

Example


mcmmoexp swords 1500
MMOCore & MMOItems & MythicLib🔗
Conditions🔗
MMOCore class: mmoclass🔗
Checks if a player has the given MMOCore class. You can check for any class that is not the default class by writing * instead of a class name. If a level has been specified the player needs to be on that level or higher to meet the condition. You can disable this behaviour by adding the equal argument.


mmoclass * 5
mmoclass WARRIOR
mmoclass MAGE 5
mmoclass MAGE 5 equal
MMOCore attribute: mmoattribute🔗
Checks if a player has the specified attribute on the given level or higher. You can disable this behaviour by adding the equal argument.


mmoclass mmoattribute strength 2 
mmoclass mmoattribute strength 2 equal
MMOCore profession: mmoprofession🔗
Checks if a player has the specified profession on the given level or higher. You can disable this behaviour by adding the equal argument.


mmoprofession mining 2 
mmoprofession mining 2 equal
MMOItems item: mmoitem🔗
Checks if a player has the specified amount of MMOItems or more in his inventory. If no amount has been defined the default amount is one.


mmoitem ARMOR SKELETON_CROWN
mmoitem GEMS SPEED_GEM 3
MMOItems hand: mmohand🔗
Checks if a player holds the specified MMOItem in his hand. Checks the main hand if not specified otherwise using the offhand argument. If no amount has been defined the default amount is one.


mmohand ARMOR SKELETON_CROWN
mmohand GEMS SPEED_GEM 3 offhand
MythicLib stat: mmostat🔗
Checks these stats that combine all sorts of stats from MMOCore and MMOItems. The player needs to be on the specified level or higher in order to meet this condition. You can disable this behaviour by adding the equal argument.


mmostat DAMAGE_REDUCTION 3
Objectives🔗
Break Special Blocks: mmocorebreakblock🔗
This objective requires the player to break special blocks from MMOCore. Please note that you must use this objective over block if you are using MMOCore's custom mining system. All three different block types and an amount can be defined. You can also send notifications to the player by appending the notify keyword optionally with the notification interval after a colon.

This objective has three properties: amount, left and total. amount is the amount of blocks already broken, left is the amount of blocks still left to break and total is the amount of blocks initially required.


mmocorebreakblock 5 block:1      #A custom block's block ID
mmocorebreakblock 64 block:STONE  #vanilla material
mmocorebreakblock 1 block:eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVy #... this is a heads texture data
Change MMOCore class: mmochangeclass🔗
This objective requires the player to change their class.

Example

objectives:
    selectAnyClass: "mmochangeclass events:pickedClass"
    selectMage: "mmochangeclass class:MAGE events:startMageIntroQuest"
MMOCore Profession levelup: mmoprofessionlevelup🔗
This objective requires the player to level the given profession to the specified level. Use main to check for class level ups.


mmoprofessionlevelup MINING 10
Craft item: mmoitemcraft🔗
This objective requires the player to craft the item with the given type and id. It supports any MMOItem that was crafted using vanilla crafting methods, MMOItems "recipe-amounts" crafting and MMOItems station crafting. An amount can also be set if it shall differ from the default (which is one) by adding the amount: argument. The amount is based on how many items have actually been crafted, not how often a specific recipe has been used! Therefore, a recipe that makes four items at once will let the objective progress by four steps. You can use the notify keyword to display a message each time the player advances the objective, optionally with the notification interval after a colon.

This objective has three properties: amount, left and total. amount is the amount of items already crafted, left is the amount of items still needed to craft and total is the amount of items initially required.


mmoitemcraft SWORD STEEL_SWORD
mmoitemcraft HEALTH_POTION_RECIPE amount:5
Upgrade Item: mmoitemupgrade🔗
This objective tracks if a player upgrades the given item with an upgrade consumable.


mmoitemupgrade SWORD FALCON_BLADE
Apply gemstone: mmoitemapplygem🔗
This objective is completed when the player applies the gemstone with the given gemstoneID to an item with the given itemType and itemID.


mmoitemapplygem SWORD CUTLASS GEM_OF_ACCURACY
Activate MythicLib skill: mmoskill🔗
This objective requires the player to activate a MythicLib skill (e.g. with MMOItems or MMOCore).

Parameter	Syntax	Default Value	Explanation
skill	SKILL_ID		The ID of the skill.
trigger	name:level	All trigger types.	The types of triggers that can be used to activate the skill. If not specified, all triggers are allowed.
Example

triggerSkill: "mmoskill LIFE_ENDER event:updateStatistics"
castSkillWithMMOCore: "mmoskill DEEP_WOUND trigger:CAST event:completeTutorial"
itemSkill: "mmoskill DEEP_WOUND trigger:RIGHT_CLICK,LEFT_CLICK event:giveReward"
Events🔗
Give MMOCore class experience: mmoclassexperience🔗
Adds experience to the players class. The amount can be a variable or a number. The level argument is optional and would convert the amount to levels instead of XP points.


mmoclassexperience 150
mmoclassexperience 1 level
Give MMOCore profession experience: mmoprofessionexperience🔗
Adds experience in the specified player profession. The amount can be a variable or a number. The level argument is optional and would convert the amount to levels instead of XP points.


mmoprofessionexperience MINING 100
mmoprofessionexperience CUSTOM_PROFESSION_NAME 1 level
Give class points: mmocoreclasspoints🔗
Gives the player class points. The amount can be a variable or a number.


mmocoreclasspoints 1
Give skill points: mmocoreskillpoints🔗
Gives the player skill points. The amount can be a variable or a number.


mmocoreskillpoints 10
Give attribute points: mmocoreattributepoints🔗
Gives the player attribute points. The amount can be a variable or a number.


mmocoreattributepoints 2
Give attribute reallocation points: mmocoreattributereallocationpoints🔗
Gives the player attribute reallocation points. The amount can be a variable or a number.


mmocoreattributereallocationpoints 1
Give MMOItem: mmoitemgive🔗
Gives the player predefined item. Default amount is one and can be set manually to a higher amount or a variable. The item can be adjusted to the players level by adding the scale option. If you want all items to be stacked together the singleStack option can be set. If the player doesn't have required space in the inventory, the items will be dropped on the ground. You can also specify the notify keyword to display a message to the player about what items have been received.


mmoitemgive CONSUMABLE MANA_POTION
Take MMOItem: mmoitemtake🔗
Removes the specified item from the players inventory. Optional arguments are an amount and notify to send a notification to the player.

Which inventory types are checked is defined by the invOrder: option. You can use Backpack, Inventory and Armor there. One after another will be checked if multiple types are defined. The backpack will not work before 2.0's item rework since the current item system does not safe custom NBT data.

You can also specify notify keyword to display a simple message to the player about loosing items.

Amount can be a variable.


mmoitemtake SWORD STEEL_SWORD
mmoitemtake SWORD STEEL_SWORD notify
mmoitemtake CONSUMABLE HEALTH_POTION amount:5
mmoitemtake CONSUMABLE BAKED_APPLES amount:2 invOrder:Backpack,Inventory
mmoitemtake ARMOR KINGS_CHESTPLATE invOrder:Armor,Backpack
MythicMobs🔗
Required MythicMobs version: 5.3.5 or above

Objectives🔗
MobKill: mmobkill🔗
You need to kill the specified amount of MythicMobs to complete this objective. The first argument must be the mob's internal name (the one defined in your MythicMobs configuration). Multiple mob names must be comma seperated. You can optionally add the amount: argument to specify how many of these mobs need to be killed. It's also possible to add the optional arguments minLevel and maxLevel to further customize what mobs need to be killed. You can also add an optional neutralDeathRadiusAllPlayers argument to complete the objective for each nearby player within the defined radius when the mob is killed by any non-player source. Alternatively, you could use the deathRadiusAllPlayers argument to count all deaths of the specified mythic mob(s), no matter if it was killed by a non-player source or not. You can add a notify keyword if you want to send a notification to players whenever the objective progresses. You can also add an optional marked argument to only count kills marked with the mspawn event. Variables are supported.

This objective has three properties: amount, left and total. amount is the amount of mythic mobs already killed, left is the amount of mythic mobs still needed to kill and total is the amount of mythic mobs initially required.

Example


mmobkill SkeletalKnight amount:2 events:reward
mmobkill SnekBoss,SnailBoss,SunBoss amount:10 events:reward
mmobkill SnekBoss amount:2 minlevel:4 maxlevel:6 events:reward marked:DungeonBoss3
mmobkill dungeonDevil deathRadiusAllPlayers:30 events:reward
Conditions🔗
MythicMob distance: mythicmobdistance🔗
Check whether the player is near a specific MythicMobs entity. The first argument is the internal name of the mob (the one defined in MythicMobs' configuration). The second argument is the distance to check, measured in block lengths in a circular radius.

Example


mythicmobdistance SkeletalKnight 7
Events🔗
 Spawn MythicMob: mspawnmob🔗
persistent, static

Parameter	Syntax	Default Value	Explanation
location	ULF		The location to spawn the mob at.
name	name:level		MythicMobs mob name. A level must be specifed after a colon.
amount	Positive Number		Amount of mobs to spawn.
target	Keyword	False	Will make the mob target the player.
private	Keyword	Disabled	Will hide the mob from all other players until restart. This does not hide particles or block sound from the mob. Also see notes below.
marked	marked:text	None	Marks the mob, supporting variables. You can check for marked mobs in mmobkill objective.
Example

events:
  spawnBoss: mspawnmob 100;200;300;world MegaBoss:1 1 target
  spawnKnights: mspawnmob 100;200;300;world SkeletalKnight:3 5
  spawnPrivateDevil: mspawnmob 100;200;300;world Mephisto:1 5 target private marked:DungeonBoss3
Private Argument

The private argument requires some MythicMob setup for optimal use. It's best to use the private argument in combination with the target argument so the mob does not attack players that cannot see it. Additionally, the mob should be configured to never change its AI target using MythicMobs.

Private & Target Arguments

The private and target arguments are ignored when the event is used in a static context like Schedules.

PlaceholderAPI🔗
If you have this plugin, BetonQuest will add a betonquest placeholder to it and you will be able to use ph variable in your conversations.

Placeholder: betonquest🔗
You can use all BetonQuest variables in any other plugin that supports PlaceholderAPI. You can even use BetonQuests conditions using the condition variable!
This works using the %betonquest_package:variable% placeholder. The package: part is the name of a package. The variable part is just a BetonQuest variable without percentage characters, like point.beton.amount.

Testing your placeholder is easy using this command:
/papi parse <PlayerName> %betonquest_<PackageName>:<VariableType>.<Property>%


%betonquest_someGreatQuest:objective.killZombies.left%
Variable: ph🔗
persistent, static

You can also use placeholders from other plugins in BetonQuest. Simply insert a variable starting with ph, the second argument should be the placeholder without percentage characters.

Example


%ph.player_item_in_hand%
ProtocolLib🔗
Events🔗
Freeze players: 'freeze'🔗
This event allows you to freeze player for the given amount of ticks:


freezeMe: "freeze 100" #Freezes the player for 5 seconds
Chat Interceptor🔗
Packet interceptor: packet🔗
This interceptor works on network package level and is thus much more reliable than the simple interceptor when working with advanced Chat plugins.

Quests🔗
Quests is another questing plugin, which offers very simple creation of quests. If you don't want to spend a lot of time to write advanced quests in BetonQuest but you need a specific thing from this plugin you can use Custom Event Reward or Custom Condition Requirement. Alternatively, if you have a lot of quests written in Quests, but want to integrate them with the conversation system, you can use quest event and quest condition.

Condition Requirement (Quests)🔗
When adding requirements to a quest, choose "Custom requirement" and then select "BetonQuest condition". Now specify condition's name and it's package (like package.conditionName). Quests will check BetonQuest condition when starting the quest.

Event Reward (Quests)🔗
When adding rewards to a quest or a stage, choose "Custom reward" and then select "BetonQuest event". Now specify event's name and it's package (like package.eventName). Quests will fire BetonQuest event when this reward will run.

Conditions🔗
Quest condition: quest🔗
This condition is met when the player has completed the specified quest. The first and only argument is the name of the quest. It it contains any spaces replace them with _.

Example


quest stone_miner
Events🔗
Quest: quest🔗
This event will start the quest for the player. The first argument must be the name of the quest, as defined in name option in the quest. If the name contains any spaces replace them with _. You can optionally add check-requirements argument if you want the event to respect this quest's requirements (otherwise the quest will be forced to be started).

Example


quest stone_miner check-requirements
RedisChat🔗
Chat Interceptor🔗
RedisChat interceptor: redischat🔗
This chat interceptor works directly with RedisChat to pause the chat during conversations.

Shopkeepers🔗
Conditions🔗
Shop amount: shopamount🔗
This condition checks if the player owns specified (or greater) amount of shops. It doesn't matter what type these shops are. The only argument is a number - minimum amount of shops.

Example


shopamount 2
Events🔗
Open shop window: shopkeeper🔗
This event opens a trading window of a Villager. The only argument is the uniqueID of the shop. You can find it in Shopkeepers/saves.yml file, under uniqueID option.

Example


shopkeeper b687538e-14ce-4b77-ae9f-e83b12f0b929
Fabled🔗
Conditions🔗
Fabled Class: fabledclass🔗
This condition checks if the player has specified class or a child class of the specified one. The first argument is simply the name of a class. You can add exact argument if you want to check for that exact class, without checking child classes.

Example


fabledclass warrior
Fabled Level: fabledlevel🔗
This condition checks if the player has specified or greater level than the specified class level. The first argument is class name, the second one is the required level.

Example


fabledlevel warrior 3
Skript🔗
BetonQuest can also hook into Skript. Firstly, to avoid any confusion, I will refere to everything here by name of the plugin (Skript event is something else than BetonQuest event). Having Skript on your server will enable using BetonQuest events and conditions in scripts, and also trigger them by BetonQuest event.

You can use cross-package paths using - between the packages. Example: player meets condition "default-Forest-Jack.Completed"

Skript event triggered by BetonQuest skript event🔗
This entry will describe two things: Skript event and BetonQuest event.

Skript event - on [betonquest] event "id" - this is the line you use in your scripts to trigger the code. betonquest part is optional, and id is just some string, which must be equal to the one you specified in BetonQuest event.
BetonQuest event - skript - this event will trigger the above Skript event in your scripts. The instruction string accepts only one argument, id of the event. It have to be the same as the one defined in Skript event for it to be triggered.
Example

In your script


on betonquest event "concrete":
In BetonQuest

events:
  fire_concrete_script: skript concrete
Skript condition🔗
You can check BetonQuest conditions in your scripts by using the syntax player meets [betonquest] condition "id". betonquest is optional, and id is the name of the condition, as defined in the conditions section.

Example

In your script


player meets condition "has_ore"
In BetonQuest

has_ore: item iron_ore:5
Skript event🔗
You can also fire BetonQuest events with scripts. The syntax for Skript effect is fire [betonquest] event "id" for player. Everything else works just like in condition above.

Example

In your script


fire event "give_emeralds" for player
In BetonQuest

events:
  give_emeralds: give emerald:5
TrainCarts🔗
TrainCarts is a plugin that allows you to create trains with advanced features.

Conditions🔗
TrainCarts ride condition: traincartsride🔗
Checks if the player is riding a specific named train.

Example


traincartsride train1
Objectives🔗
TrainCarts location objective: traincartslocation🔗
This objective requires the player to be at a specific location while sitting in a train. It works similarly to the location objective, but the player must be in a TrainCarts train to complete it.

Parameter	Syntax	Default Value	Explanation
location	x;y;z;world		The Location the player has to pass whiles sitting in the train.
range	range:double	1	The optional range around the location where the player must be.
entry	entry	Disabled	The player must enter (go from outside to inside) the location to complete the objective.
exit	exit	Disabled	The player must exit (go from inside to outside) the location to complete the objective.
name	name:Train1		The optional Name of the Train.
Example


traincartslocation 100;60;100;world
traincartslocation name:Train1 100;60;100;world range:2
traincartslocation 100;60;100;world entry range:2
TrainCarts ride objective: traincartsride🔗
This objective requires the player to ride a train for a specific time. The time starts after the player enters the train and stops when the player exits the train. The conditions are checked every time the player enters or leaves the train or completes the objective. If the conditions are not met, the time will not be counted.

Parameter	Syntax	Default Value	Explanation
name	name:Train1		The optional Name of the Train.
amount	amount:20	0	The optional amount of time in seconds, the player has to ride a specific train.
Example


traincartsride
traincartsride name:Train1
traincartsride name:Train1 amount:20
TrainCarts ride objective: traincartsexit🔗
This objective requires the player to exit a train.

Example


traincartsexit
traincartsexit name:Train1
Vault🔗
Conditions🔗
Vault Money Condition: money🔗
Checks if the player has the specified amount of money.


conditions:
  hasMoney: "money 1"
  canAffordPlot: "money 10000"
  isRich: "money 1000000"
Tip

Invert this condition if you want to check if the player has less money than specified. Example:


conditions:
  isRich: "money 100000"
events:
  giveSubsidy: "money +500 conditions:!isRich" 
Events🔗
Vault Money Event: money🔗
Deposits, withdraws or multiplies money in the player's account.

Parameter	Syntax	Default Value	Explanation
amount	Number		The amount of money to add or remove. Use * to multiply.
notify	Keyword: notify	Disabled	Display a message to the player when their balance is changed.

events:
  sellItem: "money +100"
  buyPlot: "money -10000"
  winLottery: "money *7 notify"
Change Permission (Groups): permission🔗
Adds or removes a permission or a group.

Parameter	Syntax	Default Value	Explanation
action	add or remove		Whether to add or remove the thing specified using the following arguments.
type	perm or group		Whether to use a permission or permission group.
name	The name of the permission.		The name of the permission or group to add.
world	The name of the world.	Global	You can limit permissions to certain worlds only. If no world is set the permission will be set everywhere (global).

events:
  allowFly: "permission add perm essentials.fly"
  joinBandit: "permission add group bandit"
  leaveBandit: "permission remove group bandit"
Variables🔗
Vault Money Variable: money🔗
Use %money.amount% for showing the player's balance. Use %money.left:500% for showing the difference between the player's balance and the specified amount of money.


events:
  notifyBalance: "notify You have %money.amount%$!"
  notifyNotEnough: "notify You still need %money.left:10000%$ to buy this plot."
WorldEdit or FastAsyncWorldEdit🔗
Events🔗
Paste schematic: paste🔗
persistent, static

This event will paste a schematic at the given location. The first argument is a location and the second one is the name of a schematic file. The file must be located in WorldEdit/schematics or FastAsyncWorldEdit/schematics and must have a name like some_building.schematic. If WorldEdit saves .schem schematic files, simply append .schem to the schematic name in the event's instruction.

The optional noair keyword can be added to ignore air blocks while pasting. You can also rotate the schematic by adding rotation:90 where 90 is the angle in degrees.

Example

events:
  pasteCastle: "paste 100;200;300;world castle noair" 
  pasteTree: "paste 100;200;300;world tree.schem noair" 
WorldGuard🔗
Conditions🔗
Inside Region: region🔗
This condition is met when the player is inside the specified region. The only argument is the name of the region.

Example

conditions:
  inCastle: "region castle"
Objectives🔗
Enter Region: region🔗
To complete this objective you need to enter WorldGuard region with specified name. A required argument is the name of the region and you may also pass an optional entry and/or exit to only trigger when entering or exiting a region instead of anytime inside a region.

Example

objectives:
  deathZone: "region deathZone entry events:kill"

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

Global variables🔗
You can insert a global variable in any instruction text. It looks like this: $beton$ (and this one would be called "beton"). When the plugin loads that instruction string it will replace those variables with values assigned to them in the variables: section before all instructions are parsed. This is useful for example when installing a package containing a WorldEdit schematic of the quest building. Instead of going through the whole code to set those locations, names or texts you will only have to specify a few variables (that is, of course, if the author of the package used those variables properly in his code).

Note that these variables are something entirely different from other variables. Global ones use $ characters and conversation ones use % characters. The former is resolved before the instruction text is parsed while the latter is resolved when the quests are running, usually on a per-player basis.


variables:
  village_location: 100;200;300;world
  village_name: Concrete
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

This variable allows you to perform a calculation based on other variables (for example point or objective variables) and resolves to the result of the specified calculation. The variable always starts with math.calc:, followed by the calculation which should be calculated. Supported operations are +, -, *, /, ^ and %. You can use ( ) and [ ] braces and also calculate absolute values with | |. But be careful, don't use absolute values in the command event as it splits the commands at every | and don't nest them without parenthesis (|4*|3-5|| wont work, but |4*(|3-5|)| does). Additionally, you can use the round operator ~ to round everything left of it to the number of decimal digits given on the right. So 4+0.35~1 will produce 4.4 and 4.2~0 will produce 4.

To use variables in the calculation you have two options: First just write the variable, but without % around them; In cases where this doesn't work, e.g. if the variable contains mathematical operators, you can surround it with curly braces { }. Inside the curly braces you have to escape with \, so to have a \ in your variable you need to write \\, to have a } inside your variable you need to write \}.

Warning

The modulo operator needs to be escaped with a backslash \ to prevent it from being interpreted as a placeholder delimiter. If you don't want to escape the percentage and actually want to write a backslash you can use \\%. Don't forget to escape the backslash itself with another backslash if you are inside a double-quoted string ".


%math.calc:100*(15-point.reputation.amount)%
%math.calc:objective.kill_zombies.left/objective.kill_zombies.total*100~2%
%math.calc:-{ph.myplugin_stragee+placeholder}%
%math.calc:64\%32%
NPC Name Variable🔗
When the player is in a conversation, this variable will contain the questers name in the player's quest language. If the player is not in a conversation, the variable is empty.


%npc%
Player Name Variable🔗
The variable %player% is the same as %player.name% and will display the name of the player. %player.display% will use the display name used in chat and %player.uuid% will display the UUID of the player.


%player%
%player.name%
%player.display%
%player.uuid%
Random Number Variable🔗
static

This variable gives a random number from the first value to the second. The first argument is whole or decimal, the second and third arguments are numbers or variables, seperated by a ~. Like the math variable you can round the decimal value by using instead of decimal the argument decimal~x where x is the maximal amount of decimal places. Variables can be used with {} instead of %%. Note that the first value is returned when it is higher than the second.


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

By deleting .cache/schedules.yml before startup you can make BetonQuest forget about any missed schedules 😉
Quest Parties🔗
Parties are very simple. So simple, that they are hard to understand if you already know some other party system. Basically, they don't even have to be created before using them. Parties are defined directly in the party event or the party condition.
In such instruction strings the first argument is a number - range. It defines the radius where the party members will be looked for. A range of 0 will look for all players in the same world as the player who triggered the event. And a range of -1 will look for all players in all worlds.
Second is a list of conditions. Only the players that meet those conditions will be considered as members of the party. It's most intuitive for players, as they don't have to do anything to be in a party - no commands, no GUIs, just starting the same quest or having the same item - you choose what and when makes the party.

To understand better how it works I will show you an example of party event. Let's say that every player has an objective of pressing a button. When one of them presses it, this event is fired:


party_reward: party 50 quest_started cancel_button,teleport_to_dungeon
Now, it means that all players that: are in radius of 50 blocks around the player who pressed the button AND meet quest_started condition will receive cancel_button and teleport_to_dungeon events. The first one will cancel the quest for pressing the button for the others (it's no longer needed), the second one will teleport them somewhere. Now, imagine there is a player on the other side of the world who also meets quest_started condition - he won't be teleported into the dungeon, because he was not with the other players (not in 50 blocks range). Now, there were a bunch of other players running around the button, but they didn't meet the quest_started condition. They also won't be teleported (they didn't start this quest).

Data Formats
 Unified location formating🔗
Whenever you want to define some location in your events, conditions, objectives or any other things, you will define it with this specific format. The location consists of 2 things: base and vector. Only the base is always required.

Base Location🔗
The base is a core location. There are two types: absolute coordinates and variables. Absolute coordinates are defined like 100;200;300;world, where 100 is X coordinate, 200 is Y, 300 is Z and world is the name of the world. These can have decimal values. If you want you can also add two more numbers at the end, yaw and pitch (these are controlling the rotation, for example in teleportation event, both are needed if you decide to add them; example: 0.5;64;0.5;world;90;-270).

Variables as Base Location🔗
To use a variable as the location's base it must resolve to valid absolute coordinates. An example of such variable is %location%, which shows player's exact location. Simply place it instead of coordinates. There is one rule though: you can't use variable base types in events running without players (for example static events or the ones run from folder event after the player left the server). BetonQuest won't be able to resolve the location variable without the player!

Vectors🔗
The vector is a modification of the location. Vectors look like ->(10;2.5;-13) and are added to the end of the base. This will modify the location, X by 10, Y by 2.5 and Z by -13. For example, location written as 100;200;300;world_nether->(10;2.5;-13) will generate a location with X=110, Y=202.5 and Z=287 in the world world_nether.

Block Selectors🔗
When specifying a way of matching a block, a block selector is used.

Format🔗
The format of a block selector is: namespace:material[state=value,...]

Where:

namespace - (optional) The material namespace. If left out then it will be assumed to be 'minecraft'. Can be a regex.

material - The material the block is made of. All materials can be found in Spigots Javadocs. It can be a regex. If the regex ends with square brackets you have to add another pair of empty square brackets even if you don't want to use the state argument ([regex][]).
Instead of using a regex to match multiple materials you can also define a tag. Every tag matches a special group of blocks or items that can be grouped together logically. They can be used using this format :blocks:flowers or minecraft:blocks:flowers. Be aware that a tag always starts with either : or a namespace.

state - (optional) The block states can be provided in a comma separated key=value list surrounded by square brackets. You can look up states in the Minecraft wiki. Any states left out will be ignored when matching. Values can be a regex.

Examples:

minecraft:stone - Matches all blocks of type STONE

redstone_wire - Matches all blocks of type REDSTONE_WIRE

redstone_wire[power=5] - Matches all blocks of type REDSTONE_WIRE and which have a power of 5

redstone_wire[power=5,facing=1] - Matches all blocks of type REDSTONE_WIRE and which have both a power of 5 and are facing 1

.*_LOG - Matches all LOGS

.* - Matches everything

.*[waterlogged=true] - Matches all waterlogged blocks

minecraft:blocks:flowers - Matches all flowers

:blocks:crops[age=0] - Matches all crops with an age of 0 meaning, not grown / just planted

Setting behaviour🔗
A block selector with a regex or tag as it's material name results in a random block out of all blocks that match that regex or tag. You cannot use a regex in block states when the block selector is used for placing blocks.

Matching behaviour🔗
The block state will ignore all additional block states on the block it's compared with by default. Example: fence[facing=north] matches fence[facing=north] and fence[facing=north,waterlogged=true] You can add an exactMatch argument if you only want to match blocks that exactly match the block state. A regex is allowed in any block state value when the block selector is used to match blocks.

Regex (Regular Expressions)🔗
A regular expression is a sequence of characters that specifies a search pattern for text. It's used in BetonQuest to check if game objects match a user-defined input. For example, Block Selectors use a regex to match multiple materials or block states. You can also use regular expressions in the variable condition or the password objective to match player names, item names, etc. These expressions are a very powerful tool, but can be confusing at first.

Common Use Cases🔗
Use Case	Regex
A specific text e.g. STONE	STONE
A text starting with STONE	STONE.*
A text ending with _LOG	.*_LOG
A specific number e.g. 42	^42$
A specific range of numbers, e.g. any number between 0 and 99	[0-9]{1,2}
Positive numbers only	^\d+$
Negative numbers only	^-\d+$
Any number	[-+]?[0-9]+\.?[0-9]+
More complex use cases🔗
If you want to use complex patterns you must learn more about regular expressions. There are countless resources online, for example you could read this cheatsheet.

Quoting & advanced YAML
Quoting🔗
Sometimes it is important to pass an argument that contains spaces or even a newline as an argument. For those cases you can use quotes.

Quoting examples

events:
  multiline: "notify \"This is the first line.\nAnd here is the second line!\"" 
  quotes_in_quotes: 'notify "And he said: \"I have to tell you something!\""' 
  backslash: notify "\\o/" 
YAML🔗
Using YAML multiline syntax🔗
Very long instructions can be hard to read, but to improve readability there is a YAML feature that allows you to write easily readable formatted text that will work perfectly fine with instructions.

Folded multi-line block example

events:
  long_text: >-
    notify
    This is a very long text.
    It will still be displayed as one single line in chat,
    no matter where you insert a newline.
    Even combined with "quoting
    there will be no newline" unless you "use a double linebreak,"

    as that is interpreted as a normal newline by YAML."
There is also an excellent reference for YAML Multiline written by Wolfgang Faust.

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
        event: "givePresent"
        pointer: "blacksmithReminder"
      hostile:
        text: "Your Honor, I come bearing a ultimatum letter from the people. They have grown tired of your corruption and greed."
        condition: 'hasUltimatumLetter'
        pointers: "howDareYou"
When an NPC wants to say something he will check conditions for the first option (in this case welcome). If they are met, he will choose it. Otherwise, he will skip to next option (note: conversation ends when there are no options left to choose). After choosing an option the NPC will execute any events defined in it and say it's text. Then the player will see options defined in the player_options branch to which the pointers setting points, in this case friendly and hostile. If the conditions for a player options is not met, the option is simply not displayed, similar to texts from NPC. The player will choose the option they want, and it will point back to other NPC text, which points to next player options and so on.

If there are no possible options for player or NPC (either from not meeting any conditions or being not defined) the conversations ends. If the conversation ends unexpectedly, check the console - it could be an error in the configuration.

This can and will be a little confusing, so you should name your options, conditions and events in a way which you will understand in the future. Don't worry though, if you make some mistake in configuration, the plugin will tell you this when running /q reload.

Binding Conversations to NPCs🔗
Conversations can be assigned to NPCs created with Citizens. This is done in the npcs section:

Example

npcs:
  0: innkeeper
  4: mayorHans
The first part is the ID of the NPC. To acquire the NPCs ID select the NPC using /npc select, then run /npc id. The second part is the identifier of the corresponding conversation name as defined in the conversations section. You can assign the same conversation to multiple NPCs. It is not possible to assign multiple conversations to one npc. For this purpose, have a look at cross-conversation-pointers though.

Conversation displaying🔗
BetonQuest provides different conversation styles, so called "conversationIO's". They differ in their visual style and the way the player interacts with them.

BetonQuest uses the menu style by default. If ProtocolLib is not installed, the chest style will be used. You can change this setting globally by changing the default_conversation_IO option in the config.yml file.

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
If you want to create a conversation with multiple NPCs at once or split a huge conversation into smaller, more focused files, you can point to both npc and player options in other conversations. Use the cross-package syntax to do so.

There is one special case when you want to refer to the starting options of another conversation. In this case you do not specify an option name after the second point (package.conversation.).

Cross-conversation Pointers Examples

myConversationOption:
  text: "Look carefully at that guard over there..."
  pointers: "lookCareful,guardConv.lookDetected,mainStory.Mirko.interrupt" 
specialOption:
  text: "This option points to the starting options of the conversation 'guardConv' in the package 'myPackage'."
  pointers: "myPackage.guardConv."
Conversation Variables🔗
You can use variables in the conversations. They will be resolved and displayed to the player when he starts a conversation. Check the variables list for more information about which variables exist.

Note

If you use a variable incorrectly (for example trying to get a property of an objective which isn't active for the player, or using %npc% in message event), the variable will be replaced with empty string ("").

Translations🔗
Conversation can be fully translated into multiple languages. A players can choose their preferred language with the /questlang command. You can translate every NPC option, player option and the NPC's name. This is how it's done:


quester:
  en: "Innkeeper"
  pl: "Karczmarz"
  de: "Gastwirt"
first: "example1" 
NPC_options:
  example1:
    text:
      en: "Good day, dear %player%! Welcome back to my town."
      de: "Guten Tag, lieber %player%! Willkommen zurück in meiner Stadt." 
player_options:
  example2:
    text:
      en: "Thank you your honor, I'm happy to be here."
      de: "Danke, Euer Ehren, ich bin froh, hier zu sein."
en and de are identifiers of languages present in the messages.yml config. If the conversation is not translated in the players' language, the plugin will fall back to the default language, as defined in config.yml.
The same syntax can be applied in a few other features, e.g. the journal entries, quest cancelers and notify events.

Chat Interceptors🔗
While engaged in a conversation, it can be distracting when messages from other players or system messages interfere with the dialogue. A chat interceptor provides a method of intercepting those messages and then sending them after the conversation has ended.

You can specify the default chat interceptor by setting default_interceptor inside the config.yml. Additionally, you can overwrite the default for each conversation by setting the interceptor key inside your conversation file.

The default configuration of BetonQuest sets the default_interceptor option to packet,simple. This means that it first tries to use the packet interceptor. If that fails it falls back to using the simple interceptor.

BetonQuest adds following interceptors: simple, packet and none:

The simple interceptor works with every Spigot server but only supports very basic functionality and may not work with plugins like Herochat.

The packet interceptor requires the ProtocolLib plugin to be installed. It will work well in any kind of situation.

The none interceptor is an interceptor that won't intercept messages. That sounds useless until you have a conversation that you want to be excluded from interception. In this case you can just set interceptor: none inside your conversation file.

Advanced: Extends🔗
Conversations also support the concept of inheritance. Any option can include the key extends with a comma delimited list of other options of the same time. The first option that does not have any false conditions will have its text, pointers and events merged with the extending option. The extended option may itself extend other options. Infinite loops are detected.


NPC_options:

  ## Normal Conversation Start
  start:
    text: 'What can I do for you'
    extends: tonight, today

  ## Useless addition as example
  tonight:
    # Always false
    condition: random 0-1
    text: ' tonight?'
    extends: main_menu

  today:
    text: ' today?'
    extends: main_menu

  ## Main main_menu
  main_menu:
    pointers: i_have_questions, bye
In the above example, the option start is extended by both tonight and today, both of whom are extended by main_menu. As tonight has a false condition the today option will win. The start option will have the pointers in main_menu added to it just as if they were defined directly in it and the text will be joined together from today. If you structure your conversation correctly you can make use of this to minimize duplication.

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
    items: #...
General Menu Settings🔗
These are general settings for customizing a menu.

Required Settings🔗
Setting Name	
Example
Description
title	title: "&6&lQuests"	Will be displayed in the top left corner of your menu. You can use color codes to color the title. Variables are supported.
height	height: 3	How many lines of slots your menu will have. Minimum 1, Maximum 6.
Optional Settings🔗
Setting Name
Example	Description
open_conditions	open_conditions: "unlockedMenu,!sneaking"	One or multiple conditions (separated by a ,) which all have to be true to open the menu with a bound item or a bound command.
open_events	open_events: "menuOpenSound"	One or multiple events (separated by a ,) which will be fired when the menu is opened.
close_events	close_events: "menuCloseSound"	One or multiple events (separated by a ,) which will be fired when the menu is closed.
bind	bind: "openMenuItem"	Clicking with this quest item in hand will open the menu. You can create this item in the items section of your package.
command	command: "/quests"	This command can be executed to open the menu. The server must be restarted to unregister command tab completions.
The items section🔗
The items section contains all items which should be displayed in the menu, defined as individual sections of the config.

A basic item section looks like this:

Item Section Example

menus:
  myMenuName:
    title: "My Menu Title"
    slots: #...
    items: 
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
By default, the name and description of the quest item is displayed when hovering over the item. You can overwrite this by using the text setting. Both color codes and variables are supported. The text can be provided as a single string with newlines, a multi-line string, or a list of strings, see examples.

List Example

skeletonQuestDone:
  item: "questDoneItem"
  text:
    - "&2Reputation: &6&l%point.quest_reputation.amount%"
    - "Make quests to gain reputation!"
String with Newlines Example

skeletonQuestDone:
  item: "questDoneItem"
  text: "&2Reputation: &6&l%point.quest_reputation.amount% \nMake quests to gain reputation!"
Multi-line String Example

skeletonQuestDone:
  item: "questDoneItem"
  text: |-
    &2Reputation: &6&l%point.quest_reputation.amount%
    Make quests to gain reputation!
Just like the text in conversations you can provide translations for all languages:

Translation Example

items: 
  skeletonQuestDone: 
    item: "questDoneItem"
    text:
       en: 
         - "&7[Quest] &6&lThe lost amulet"
         - "&4&o"
         - "&eLeft click to locate npc"
         - "&eRight click to cancel quest"
       de: 
         - "&7[Quest] &6&lDas verlorene Amulet"
         - "&4&o"
         - "&eLinksclick um den NPC zu finden"
         - "&eRechstclick um die Quest abzubrechen"
The optional click setting🔗
You can define one or multiple events (separated by ,) that are run whenever the item is clicked.

Example

items:
  skeletonQuestDone: 
    item: "questDoneItem"
    click: "startQuest,closeMenu"
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
You can copy and paste this example into any file in a package. Then reload and execute the command /q give YOUR_PACKAGE.openMenuItem to get the item that opens the menu.

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

    items:
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
  openMenuItem: "BOOK title:Quests"

  xpBottle: "EXPERIENCE_BOTTLE"
  filler: "GRAY_STAINED_GLASS_PANE"

  skeletonQuestActiveItem: "BONE"
  goldQuestActiveItem: "RAW_GOLD"
  questDone: "LIME_CONCRETE"

Elements
Events🔗
Menu Event: menu🔗
This event can be used to open and close menus. The first argument is the type of action that should be done. It is either open to open a new menu or close to close the currently opened menu of the player. If you want to open a menu you have to add a second argument which should be the id of a menu. If you want to open menus from other packages just use packageName.id format.

Example: menu open quest_gui

Example: menu close

Conditions🔗
Menu Condition: menu🔗
This condition can be used to check if the player has currently opened any menu. You can add id: optional and specify the id of a menu to check if the player has opened the menu with this id. If you want to check for menus from other packages just use packageName.id format.

Example: menu id:quest_gui

Objectives🔗
Menu Objective: menu🔗
This objective is completed when the player opens the menu with the given id. The only required argument is the id of the menu. If you want to use menus from other packages just use packageName.id format.

The objective also has the property menu which can be used by the objective variable. It returns the title of the menu which should be opened.

Example: menu quest_gui

Variables🔗
Menu Variable: menu🔗
This variable displays the title of the menu that is currently opened by the player. If no menu is opened it will be just empty.

Example: %menu%

Plugin configuration🔗
The plugin's config is stored in a file called menuConfig.yml which is located in the plugin folder of BetonQuest, right near the config file of BetonQuest.
It contains some default settings as well as all messages which are sent to the player by the plugin.
On first start of the plugin the default config file will be created including all default settings which you are then able to change to customize the plugin.

The config options🔗
default_close: (boolean)
Sets if menus should close by default when an item is clicked (true) or if they should stay open (false).
This can also be overridden by each individual menu.
Default value: true
The messages section🔗
This section contains all messages which are displayed to the player by the plugin.
You can change them to fit all your needs.
It's also possible to add additional languages, it works the same way as with BetonQuests messages.yml:
Just add another section with the short name of your language as key and the translated messages.
It's not required to specify all messages, if a message is missing for your language it will just pick the message in BetonQuests default language.

Journal
The journal is a book which can be used to display any quest related information in an immersive way.

Basic Information🔗
The journal can be obtained with the /journal command or by selecting it from the quest item backpack (/backpack). It's a quest item, so you cannot put it into any chests, item frames and so on. If you ever feel the need to get rid of your journal: Just drop it! It will safely return to your backpack.

The journal is updated with the journal event, based on the text entries written inside a journal section. The entries can use color codes, but the color will be lost between pages. If you update these texts and reload the plugin, all players' journals will reflect changes.

If you want to translate the entry do the same thing as with conversation options - go to new line, add language ID and the journal text for every language you want to include.

Main Page🔗
You can also add a main page to the journal. It's a list of texts, which will show only if specified conditions are met. You can define them in the journal_main_page section:


journal_main_page:
  title:
    priority: 1
    text:
      en: '&eThe Journal'
      pl: '&eDziennik'
    conditions: 'quest_started,!quest_completed'
Each string can have text in different languages, list of conditions separated by commas (these must be met for the text to show in the journal) and priority, which controls the order of texts. You can use conversation variables in the texts, but they will only be updated when the player gets his journal with the /journal command. Color codes are supported.

If you want your main page take a separate page (so entries will be displayed on next free page), set full_main_page in config.yml to "true". If you want to manually wrap the page, use the pipe | character. Use \n to create a new line.

Configuration🔗
You can control behavior of the journal in config.yml file, in the journal section. chars_per_page specifies how many characters will be placed on a single page. If you set it too high, the text will overflow outside the page, too low, there will be too many pages. one_entry_per_page allows you to place every entry on a single page. The chars_per_page setting is in this case ignored, BetonQuest will put entire entry on that page. reversed_order allows you to reverse order of entries and hide_date lets you remove the date from journal entries.

The journal by default appears in the last slot of the hotbar. If you want to change that use default_journal_slot option in config.yml, experiment with different settings until you're ok with it.

You can control colors in the journal in journal_colors section in config.yml: date is a color of date of every entry, line is a color of lines separating entries and text is just a color of a text. You need to use standard color codes without & (eg. '4' for dark red).

Quest Items
Item Basics🔗
Items in BetonQuest are defined in the items section. Each item has an instruction string, similarly to events, conditions etc. Basic syntax is very simple:


item: BLOCK_SELECTOR other arguments...
BLOCK_SELECTOR is a type of the item. It doesn't have to be all in uppercase. Other arguments specify data like name of the item, lore, enchantments or potion effects. There are two categories of these arguments: the ones you can apply to every item and type specific arguments. Examples would be name (for every item type) and text (only in books).

Every argument is used in two ways: when creating an item and when checking if some existing item matches the instruction. The first case is pretty straightforward - BetonQuest takes all data you specified and creates an item, simple as that. Second case is more complicated. You can require some property of the item to exist, other not to exist, or skip this property check altogether. You can also accept an item only if some value (like enchantment level) is greater/less than x. You can use wildcards in the BLOCK_SELECTOR to match multiple types of items.

These are arguments that can be applied to every item:

name - the display name of the item. Underscores will be replaced with spaces. You can escape them with \_ and you can also escape the \ with \\_. You can also use & color codes. If you want to specifically say that the item must not have any name, use none keyword.

lore - text under the item's name. Default styling of lore is purple and italic. You can escape them with \_ and you can also escape the \ with \\_. You can also use & color codes. To make a new line use ; character. If you require the item not to have a lore at all, use none keyword. By default, lore will match only if all lines are exactly the same. If you want to accept all items that contain specified lines (and/or more lines), add lore-containing argument to the instruction string.

enchants - a list of enchantments and their levels. Each enchantment consists of these things, separated by colons:

name
level (only positive numbers, including zero)
For example damage_all:3 is Sharpness III. You can specify additional enchantments by separating them with commas.

You can require the item not to have any enchantments by using none keyword. You can also add +/- character to the enchantment level to make the check require levels greater/less (and equal) than specified. If you don't care about the level, replace the number with a question mark.

By default, all specified enchantments are required. If you want to check if the item contains a matching enchantment (and/or more enchants), add enchants-containing argument to the instruction string. Each specified enchantment will be required on the item by default unless you prefix its name with none-, for example none-knockback means that the item must not have any knockback enchantment. Do not use none- prefix unless you're using enchants-containing argument, it doesn't make any sense and will break the check!

unbreakable - this makes the item unbreakable. You can specify it either as unbreakable or unbreakable:true to require an item to be unbreakable. If you want to check if the item is breakable, use unbreakable:false.

custom-model-data - set the custom model data of the item. You have to specify the data value: custom-model-data:3. To check that an item does not have custom model data set no-custom-model-data.

flags - item flags that govern the visibility of some item info (comma delimited) including:

HIDE_ENCHANTS: Hide the item's enchants
HIDE_ATTRIBUTES: Hide attributes like damage
HIDE_UNBREAKABLE: Hide the unbreakable of the item state
HIDE_DESTROYS: Hide what the item can break or destroy
HIDE_PLACED_ON: Hide where the item can be placed
HIDE_POTION_EFFECTS: Hide potion effects, book and firework info, map tool tips, banner patters, and enchantments
HIDE_DYE: Hide the dye labels on colored leather armor
Examples

name:&4Sword_made_of_Holy_Concrete
name:none
lore:&cOnly_this_sword_can_kill_the_Lord_Ruler
lore:&2Quest_Item lore-containing
lore:none
enchants:damage_all:3+,none-knockback
enchants:power:? enchants-containing
enchants:none
unbreakable
unbreakable:false
flags:HIDE_ENCHANTS,HIDE_ATTRIBUTES,HIDE_UNBREAKABLE
Special Item Types🔗
Books🔗
This applies to a written book and a book and quill.

title - the title of a book. All underscores will be replaced with spaces and you can use & color codes. If you want to specifically say that the book must not have any title, use none keyword.

author - the author of a book. All underscores will be replaced with spaces, you cannot use color codes here. If you want to specifically say that the book must not have any author, use none keyword.

text - the text of the book. All underscores will be replaced with spaces and you can use & color codes. The text will wrap to the next page if amount of characters exceeds journal.chars_per_page setting in config.yml. If you want to manually wrap the page, use | character. To go to new line use \n. Keep in mind that you can't use any spaces here, you must only use underscores (_). This needs to be a single argument, even if it's really long. If you don't want the book to have any text, use none keyword instead.

Examples

title:Malleus_Maleficarum
author:&eGallus_Anonymus
text:Lorem_ipsum_dolor_sit_amet,\nconsectetur_adipiscing_elit.|Pellentesque_ligula_urna(...)
Potions🔗
This applies to potions, splash potions and lingering potions.

type - type of a potion. Here's the list of possible types. Do not mistake this for a custom effect, this argument corresponds to the default vanilla potion types.

extended - extended property of the potion (you can achieve it in-game by adding redstone). It can be specified as extended or extended:true. If you want to check the potion that is NOT extended, use extended:false.

upgraded - upgraded property of the potion (you can achieve it in-game by adding glowstone). It can be specified as upgraded or upgraded:true. If you want to check the potion that is NOT upgraded, use upgraded:false.

effects - a list of custom effects. These are independent of the potion type. The effects must be separated by commas. Each effect consists of these things, separated by colons:

type (this is different stuff that the link above!)
power
duration (in seconds)
An example would be WITHER:2:30, which is a wither effect of level 2 for 30 seconds.

If you want to target only potions without custom effects, use none keyword. You can target potions with level and time greater/less (and equal) than specified with +/- character after the number. If you don't care about the level/time, you can replace them with question mark.

By default, all specified effects are required. If you want to check if the potion contains these effects among others, add effects-containing argument to the instruction string. Now if you want to make sure the potion doesn't contain a specific effect, prefix the effect name with none-. Don't use that prefix unless you're also using effects-containing argument, it doesn't make any sense and it will break the check.

Examples:


type:instant_heal
extended
upgraded:false
effects:poison:1+:?,slow:?:45-
effects:none-weakness,invisibility:?:? effects-containing
Heads🔗
Player Heads🔗
owner - this is the name of the head owner. It will not use color codes nor replace underscores with spaces. If you want to check for heads without any owner, use none keyword.
Use %player% to get the current players head.
Examples

owner:Co0sh
owner:none
Custom Heads🔗
This applies to heads with custom texture (Base64 encoded).

player-id - this is the UUID of the head owner.
texture - this is the Base64 encoded JSON for the texture metadata.
Examples:

On Paper, the metadata will be automatically extracted from an item in your hand when using the item command and produce something like the following item data:


player-id:66ab473e-d118-4e55-9717-431dfe7a69bc
texture:eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmIwNmIxOGQzZGZlZGFiNDQ0NjZlMGE3NGUxNTVhOGYyMTc4NzIwNDBhMDg1NTIwYTVhMGYzMGU4Y2QxODg1YyJ9fX0=
On Spigot/Bukkit, player-id and texture must be manually configured in the item.yml file. It must be in the same format as the example above.

Note: The texture data is Base64 encoded version of the following JSON, which is the same as the minecraft built-in give command and what is available on heads websites:


{"textures":{"SKIN":{"url":"http://textures.minecraft.net/texture/bb06b18d3dfedab44466e0a74e155a8f217872040a085520a5a0f30e8cd1885c"}}}
Leather armor🔗
This applies to all parts of leather armor.

color - this is the color of the armor piece. It can be either one of these values, a hexadecimal RGB value prefixed with # character or its decimal representation without the prefix. You can also check if the armor piece doesn't have any color with none keyword.
Examples:


color:light_blue
color:#ff00ff
color:none
Fireworks🔗
This applies to fireworks.

firework - this is a list of effects of the firework rocket. They are separated by commas. Each effect consists of these things separated by colons:

effect type
a list of main colors (refer to leather armor colors above for syntax) separated by semicolons
a list of fade colors
true/false keyword for trail effect
true/false keyword for flicker.
Note the separation characters, this is important: commas separate effects, colons separate effect properties, semicolons separate colors.

If you want to target fireworks without any effects, use none keyword. If you want to target any effect type, use question mark instead of the effect name. If you don't want the effect to have any main/fade colors, use none keyword in the place of colors. If you don't care about main/fade colors, use question marks in that place. If you don't care about trail/flicker effect, use question marks instead of true/false keyword.

By default, the check will require all specified effects to be present on the firework. You can check if the firework contains specified effects among others by adding firework-containing argument to the instruction string. To match the item which must not have an effect, prefix the effect name with none- keyword. Don't use that prefix unless you're also using firework-containing argument, it doesn't make any sense and will break the check.

power - flight duration of the firework, in levels. You can use +/- character to target greater/less (and equal) levels.

Examples

firework:ball:red;white:green;blue:true:true,ball_large:green;yellow:pink;black:false:false
firework:burst:?:none:?:? firework-containing
firework:none-creeper firework-containing
firework:none
power:3
power:2+
Firework charges🔗
This applies to firework charges.

firework - this is almost the same as fireworks. You can only specify a single effect and the power argument has no effects.
Backpack🔗
Sometimes you'll want some items to be persistent over death. The quest could be broken if the player loses them. Such an item wouldn't be dropped (on death), instead it would be placed in the player's backpack.

You can add a specific line to an item's lore to make it persistent. It's &2Quest_Item (_ is a space in an item's definition) if your default language is english. The translation of the line can be found in messages.yml if a different default language is configured. It's also possible to change the translation.

Note that this must be an entirely new line in the lore!

Example

important_sword: "DIAMOND_SWORD name:Sword_for_destroying__The_Concrete lore:Made_of_pure_Mithril;&2Quest_Item"
The backpack can be opened with the /backpack command. The inventory window will open, displaying your stored items. The first slot is always the journal, and if you get it, the slot will stay empty. You can transfer quest items back and forth between inventories by clicking on them. Left click will transfer just one item, right click will try to transfer all items. Normal items cannot be stored into the backpack, so it's not an infinite inventory.

If you will ever have more than one page of quest items, the buttons will appear. You can customize those buttons by creating previous_button and next_button items in the items section. Their name will be overwritten with the one defined in messages.yml.

Quest items cannot be dropped in any way other than using them. This way you can create a quest for eating cookies by giving the player a stack of cookies flagged as quest items and not continuing until there are no more cookies in his inventory/backpack. The player cannot drop the cookies, so he must eat every one of them to complete the quest.

Creative Mode

Don't worry if the item-dropping filter isn't working for your items when you're in creative mode - it's not a bug. It's a feature. Creative-mode players should be able to easily put quest items in containers like TreasureChests.

Quest Cancelers🔗
You can easily let players cancel their quests using the cancel option in the quest backpack (or /cancelquest). Cancelers also provide an easy way to clean up all the data that was created during the quest. They can also be triggered by events.

Setup🔗
Define a cancel section anywhere in your quest package. This section will contain all cancelers. Each canceler has an identifier.

Example

cancel:
  woodQuest:
    name: "&2Wood for the Innkeeper" 
    conditions: "wood_started,!wood_paid" 
    objectives: "farmWood" 
    tags: "wood_started,wood_done,wood_paid" 
    points: "wood" 
    journal: "wood_started,wood_done,wood_paid" 
    events: "punishPlayer,sendMessage" 
    location: "100;200;300;world" 
  dragonQuest:
    name: "&4Dragon Slayer"
    conditions: "dragon_started,!dragon_done"
    objectives: "killDragon"
Related Events🔗
Cancel a quest: cancel🔗
This event works in the same way as a quest canceler in the backpack.

Running this event is equal to the player canceling a quest using the backpack. The only argument is the identifier of a quest canceler, as defined in the cancel section.

Example

cancelQuest: "cancel woodQuest"