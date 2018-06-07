# PathfinderNPCGenerator
Generates nearly completely random level 1 NPCs for Pathfinder RPG.

This is just meant to be a quick, dirty and functional implementation. There's a hundred better ways to do it, and this is only designed for the specific use-case.
* There are 5 NPC classes you can get: Adept, Aristocrat, Commoner, Expert, Warrior
* There are 9 races you can get: Dwarf, Elf, Gnome, Goblin, Half-Elf, Half-Orc, Human, Orc
* Each character gets a drawback! There are lots of them.
* Assigns random feats (from a very small list)
* Facial traits that always apply are applied to the character sheet
* Random names, genders, heights and weights according to the regular old boring random tables (with room to add whatever we want).

Drunk Pathfinder Rules!
* Generate 25-50 random NPC character sheets
* Get a party of 4-5 players together to go through a dungeon
* If their character dies they finish their drink and get another character
* If they take damage they take a drink
* If they role a natural 1 they take a drink
* If they role a natural 20 they can assign a drink to someone
* The dungeon is extremely deadly! Full of traps and mobs of monsters.
* Oh and did I mention you go spawn with no equipment at all? Have fun punching things to death until you find some!

Examples
Caladrel 
Gender:Male
Race:Elf
Height:5 ft. 7 in.
Weight:143 lbs.
Class:Warrior
HP:11
AC:12
Touch AC:12
Flat-footed AC:10
STR:10(0), DEX:15(2), CON:12(1), WIS:10(0), INT:15(2), CHA:12(1) 
FORT:3, REF:2, WILL:0, 
Initiative:6
Melee Attack Bonus:1
Ranged Attack Bonus:3
CMB:1
CMD:13
Feats:[Improved Initiative]
Skill Points:4
Skills:
(Str)Climb:0
(Int)Craft:2
(Cha)Handle Animal:1
(Cha)Intimidate:1
(Wis)Profession:0
(Dex)Ride:2
(Str)Swim:0
(Wis)Perception:3
(Dex)Acrobatics:2
(Int)Appraise:2
(Cha)Bluff:1
(Cha)Diplomacy:1
(Dex)Disable Device:2
(Cha)Disguise:1
(Dex)Escape Artist:3
(Wis)Heal:0
(Int)Knowledge Arcana:2
(Int)Knowledge Dungeoneering:2
(Int)Knowledge Engineering:2
(Int)Knowledge Geography:2
(Int)Knowledge History:2
(Int)Knowledge Local:2
(Int)Knowledge Nature:3
(Int)Knowledge Nobility:2
(Int)Knowledge Planes:2
(Int)Knowledge Religion:2
(Int)Linguistics:3
(Cha)Perform:1
(Wis)Sense Motive:0
(Dex)Sleight of Hand:2
(Int)Spellcraft:2
(Dex)Stealth:2
(Wis)Survival:0
(Cha)Use Magic Device:1

Racial Traits:[Medium, 30 ft, Elven Immunities, Keen Senses, Elven Magic, Low-Light Vision]
Drawbacks:[Shadow-Scarred: You were touched by terrible horrors that live in the darkness just outside the human sphere and feel your life-force ebb away ever so slightly whenever you return to the shadows.
Effect:Whenever you are in an area of dim light or darkness, you take a –1 penalty on saving throws.]

Majet 
Gender:Other
Race:Gnome
Height:3 ft. 4 in.
Weight:40 lbs.
Class:Aristocrat
HP:10
AC:10
Touch AC:10
Flat-footed AC:11
STR:7(-2), DEX:9(-1), CON:14(2), WIS:17(3), INT:10(0), CHA:12(1) 
FORT:2, REF:-1, WILL:5, 
Initiative:-1
Melee Attack Bonus:-1
Ranged Attack Bonus:0
CMB:-3
CMD:6
Feats:[Prone Slinger]
Skill Points:4
Skills:
(Int)Appraise:0
(Cha)Bluff:1
(Int)Craft:2
(Cha)Diplomacy:1
(Cha)Disguise:1
(Cha)Handle Animal:4
(Cha)Intimidate:1
(Int)Knowledge Arcana:0
(Int)Knowledge Dungeoneering:0
(Int)Knowledge Engineering:0
(Int)Knowledge Geography:0
(Int)Knowledge History:0
(Int)Knowledge Local:0
(Int)Knowledge Nature:0
(Int)Knowledge Nobility:0
(Int)Knowledge Planes:0
(Int)Knowledge Religion:0
(Int)Linguistics:0
(Wis)Perception:5
(Cha)Perform:1
(Wis)Profession:3
(Dex)Ride:2
(Wis)Sense Motive:6
(Wis)Survival:3
(Str)Swim:-2
(Dex)Acrobatics:-1
(Str)Climb:-2
(Dex)Disable Device:0
(Dex)Escape Artist:-1
(Wis)Heal:3
(Dex)Sleight of Hand:-1
(Int)Spellcraft:0
(Dex)Stealth:3
(Cha)Use Magic Device:1

Racial Traits:[Small, 20 ft, Defensive Training, Illusion Resistance, Keen Senses, Obsessive, Gnome Magic, Hatred, Low-Light Vision]
Drawbacks:[Forgetful: You are easily distracted and prone to forgetting important things.
Effect:Whenever you leave a location you have been at for longer than 1 hour, you must attempt a DC 10 Wisdom check. If you fail, you leave behind one random mundane item (a purse of money counts as an item).]

Zirul 
Gender:Other
Race:Half-elf
Height:6 ft. 4 in.
Weight:140 lbs.
Class:Commoner
HP:5
AC:10
Touch AC:10
Flat-footed AC:10
STR:9(-1), DEX:11(0), CON:9(-1), WIS:11(0), INT:12(1), CHA:15(2) 
FORT:-1, REF:0, WILL:2, 
Initiative:0
Melee Attack Bonus:-1
Ranged Attack Bonus:0
CMB:-1
CMD:9
Feats:[Iron Will]
Skill Points:3
Skills:
(Str)Climb:-1
(Int)Craft:1
(Cha)Handle Animal:2
(Wis)Perception:2
(Wis)Profession:0
(Dex)Ride:0
(Str)Swim:-1
(Dex)Acrobatics:0
(Int)Appraise:1
(Cha)Bluff:2
(Cha)Diplomacy:2
(Dex)Disable Device:0
(Cha)Disguise:5
(Dex)Escape Artist:0
(Wis)Heal:0
(Cha)Intimidate:3
(Int)Knowledge Arcana:1
(Int)Knowledge Dungeoneering:1
(Int)Knowledge Engineering:1
(Int)Knowledge Geography:1
(Int)Knowledge History:1
(Int)Knowledge Local:1
(Int)Knowledge Nature:1
(Int)Knowledge Nobility:1
(Int)Knowledge Planes:1
(Int)Knowledge Religion:1
(Int)Linguistics:1
(Cha)Perform:2
(Wis)Sense Motive:0
(Dex)Sleight of Hand:0
(Int)Spellcraft:1
(Dex)Stealth:1
(Wis)Survival:1
(Cha)Use Magic Device:2

Racial Traits:[Medium, 30 ft, Elven Immunities, Adaptability, Keen Senses, Low-Light Vision, Elf Blood, Multitalented]
Drawbacks:[Misbegotten: Whether due to the influence of malign magic, disease, or the scorn of the gods, you were born with a troublesome deformity that interferes with your movement.
Effect:You take a –2 penalty on all Dexterity-based skill checks.]

Abroshtor 
Gender:Male
Race:Gnome
Height:3 ft. 4 in.
Weight:41 lbs.
Class:Expert
HP:14
AC:12
Touch AC:12
Flat-footed AC:11
STR:10(0), DEX:12(1), CON:16(3), WIS:11(0), INT:11(0), CHA:10(0) 
FORT:3, REF:1, WILL:2, 
Initiative:1
Melee Attack Bonus:1
Ranged Attack Bonus:2
CMB:-1
CMD:10
Feats:[Toughness]
Skill Points:6
Skills:
(Int)Craft:2
(Int)Knowledge History:0
(Wis)Heal:0
(Int)Appraise:3
(Int)Linguistics:0
(Wis)Sense Motive:0
(Int)Knowledge Arcana:0
(Str)Swim:0
(Int)Knowledge Dungeoneering:3
(Wis)Profession:0
(Wis)Perception:2
(Dex)Acrobatics:1
(Cha)Bluff:0
(Str)Climb:0
(Cha)Diplomacy:0
(Dex)Disable Device:1
(Cha)Disguise:0
(Dex)Escape Artist:1
(Cha)Handle Animal:0
(Cha)Intimidate:1
(Int)Knowledge Engineering:0
(Int)Knowledge Geography:0
(Int)Knowledge Local:1
(Int)Knowledge Nature:1
(Int)Knowledge Nobility:0
(Int)Knowledge Planes:0
(Int)Knowledge Religion:0
(Cha)Perform:1
(Dex)Ride:1
(Dex)Sleight of Hand:1
(Int)Spellcraft:0
(Dex)Stealth:5
(Wis)Survival:0
(Cha)Use Magic Device:0

Racial Traits:[Small, 20 ft, Defensive Training, Illusion Resistance, Keen Senses, Obsessive, Gnome Magic, Hatred, Low-Light Vision]
Drawbacks:[Righteous Indignation: You have difficulty controlling your temper after living in inhuman conditions. 
Effect:Whenever a foe provokes an attack of opportunity from you, you must take it unless you succeed at a Will save against a DC equal to 10 + your level. You take a –1 penalty on Will saving throws against spells with the emotion descriptor that do not also have the fear descriptor.]

Besh 
Gender:Female
Race:Gnome
Height:3 ft. 0 in.
Weight:36 lbs.
Class:Aristocrat
HP:7
AC:10
Touch AC:10
Flat-footed AC:11
STR:7(-2), DEX:8(-1), CON:8(-1), WIS:9(-1), INT:13(1), CHA:14(2) 
FORT:-1, REF:-1, WILL:3, 
Initiative:-1
Melee Attack Bonus:-1
Ranged Attack Bonus:0
CMB:-3
CMD:6
Feats:[Iron Will]
Skill Points:5
Skills:
(Int)Appraise:4
(Cha)Bluff:2
(Int)Craft:3
(Cha)Diplomacy:2
(Cha)Disguise:2
(Cha)Handle Animal:2
(Cha)Intimidate:2
(Int)Knowledge Arcana:1
(Int)Knowledge Dungeoneering:1
(Int)Knowledge Engineering:1
(Int)Knowledge Geography:1
(Int)Knowledge History:1
(Int)Knowledge Local:1
(Int)Knowledge Nature:1
(Int)Knowledge Nobility:4
(Int)Knowledge Planes:1
(Int)Knowledge Religion:1
(Int)Linguistics:1
(Wis)Perception:4
(Cha)Perform:2
(Wis)Profession:2
(Dex)Ride:-1
(Wis)Sense Motive:-1
(Wis)Survival:-1
(Str)Swim:-2
(Dex)Acrobatics:-1
(Str)Climb:-2
(Dex)Disable Device:-1
(Dex)Escape Artist:-1
(Wis)Heal:0
(Dex)Sleight of Hand:-1
(Int)Spellcraft:1
(Dex)Stealth:3
(Cha)Use Magic Device:2

Racial Traits:[Small, 20 ft, Defensive Training, Illusion Resistance, Keen Senses, Obsessive, Gnome Magic, Hatred, Low-Light Vision]
Drawbacks:[Secret Shame: You have a terrible fear of the public at large, a group, or an important person (such as your order of knights, your liege lord, your family, or your lover) learning a shameful truth about you.
Effect:You take a –1 penalty on saving throws against fear effects, and the DC of any Intimidate check to demoralize you is reduced by 1. If you would normally be immune to fear, you do not take these penalties, but instead lose your immunity to fear (regardless of its source).]

Kjell 
Gender:Male
Race:Human
Height:4 ft. 1 in.
Weight:170 lbs.
Class:Warrior
HP:15
AC:10
Touch AC:10
Flat-footed AC:10
STR:12(1), DEX:11(0), CON:15(2), WIS:11(0), INT:13(1), CHA:14(2) 
FORT:4, REF:0, WILL:0, 
Initiative:0
Melee Attack Bonus:2
Ranged Attack Bonus:1
CMB:2
CMD:12
Feats:[Toughness, Catch Off Guard]
Skill Points:4
Skills:
(Str)Climb:1
(Int)Craft:1
(Cha)Handle Animal:5
(Cha)Intimidate:2
(Wis)Profession:0
(Dex)Ride:0
(Str)Swim:1
(Wis)Perception:0
(Dex)Acrobatics:0
(Int)Appraise:1
(Cha)Bluff:2
(Cha)Diplomacy:2
(Dex)Disable Device:0
(Cha)Disguise:2
(Dex)Escape Artist:0
(Wis)Heal:0
(Int)Knowledge Arcana:1
(Int)Knowledge Dungeoneering:1
(Int)Knowledge Engineering:2
(Int)Knowledge Geography:1
(Int)Knowledge History:3
(Int)Knowledge Local:1
(Int)Knowledge Nature:1
(Int)Knowledge Nobility:1
(Int)Knowledge Planes:1
(Int)Knowledge Religion:1
(Int)Linguistics:1
(Cha)Perform:2
(Wis)Sense Motive:0
(Dex)Sleight of Hand:0
(Int)Spellcraft:1
(Dex)Stealth:0
(Wis)Survival:0
(Cha)Use Magic Device:2

Racial Traits:[Medium, 30 ft, Bonus Feat, Skilled]
Drawbacks:[Cowardly: You might face dangerous situations with bravado, but you are constantly afraid.
Effect:Your base speed when frightened and fleeing increases by 5 feet, and the penalties you take from having the cowering, frightened, panicked, or shaken conditions increase by 1. If you would normally be immune to fear, you do not take these penalties but instead lose your immunity to fear (regardless of its source).]

Bellis 
Gender:Female
Race:Halfling
Height:3 ft. 0 in.
Weight:30 lbs.
Class:Aristocrat
HP:9
AC:12
Touch AC:12
Flat-footed AC:11
STR:11(0), DEX:12(1), CON:12(1), WIS:15(2), INT:9(-1), CHA:10(0) 
FORT:2, REF:2, WILL:5, 
Initiative:1
Melee Attack Bonus:1
Ranged Attack Bonus:2
CMB:-1
CMD:10
Feats:[Combat Reflexes]
Skill Points:3
Skills:
(Int)Appraise:-1
(Cha)Bluff:3
(Int)Craft:-1
(Cha)Diplomacy:0
(Cha)Disguise:0
(Cha)Handle Animal:0
(Cha)Intimidate:0
(Int)Knowledge Arcana:-1
(Int)Knowledge Dungeoneering:-1
(Int)Knowledge Engineering:-1
(Int)Knowledge Geography:-1
(Int)Knowledge History:-1
(Int)Knowledge Local:-1
(Int)Knowledge Nature:-1
(Int)Knowledge Nobility:-1
(Int)Knowledge Planes:-1
(Int)Knowledge Religion:2
(Int)Linguistics:-1
(Wis)Perception:4
(Cha)Perform:0
(Wis)Profession:2
(Dex)Ride:1
(Wis)Sense Motive:2
(Wis)Survival:2
(Str)Swim:0
(Dex)Acrobatics:4
(Str)Climb:2
(Dex)Disable Device:1
(Dex)Escape Artist:1
(Wis)Heal:2
(Dex)Sleight of Hand:1
(Int)Spellcraft:-1
(Dex)Stealth:5
(Cha)Use Magic Device:0

Racial Traits:[Small, 20 ft, Fearless, Halfling Luck, Sure-Footed, Keen Senses]
Drawbacks:[Haunted: Something from your past—or a dark secret you presently hold—makes it difficult for you to ever be at peace, and your chronic worry that you might fall to evil influence has become a self-fulfilling prophecy.
Effect:You take a –2 penalty on saves against spells with the evil descriptor.]

Makoa 
Gender:Other
Race:Half-orc
Height:6 ft. 7 in.
Weight:185 lbs.
Class:Commoner
HP:7
AC:10
Touch AC:10
Flat-footed AC:10
STR:7(-2), DEX:10(0), CON:13(1), WIS:7(-2), INT:11(0), CHA:14(2) 
FORT:1, REF:0, WILL:-2, 
Initiative:0
Melee Attack Bonus:-2
Ranged Attack Bonus:0
CMB:-2
CMD:8
Feats:[Prone Slinger]
Skill Points:2
Skills:
(Str)Climb:-2
(Int)Craft:0
(Cha)Handle Animal:2
(Wis)Perception:-2
(Wis)Profession:-2
(Dex)Ride:0
(Str)Swim:-2
(Dex)Acrobatics:0
(Int)Appraise:0
(Cha)Bluff:2
(Cha)Diplomacy:2
(Dex)Disable Device:0
(Cha)Disguise:2
(Dex)Escape Artist:0
(Wis)Heal:-2
(Cha)Intimidate:4
(Int)Knowledge Arcana:0
(Int)Knowledge Dungeoneering:0
(Int)Knowledge Engineering:0
(Int)Knowledge Geography:0
(Int)Knowledge History:0
(Int)Knowledge Local:0
(Int)Knowledge Nature:1
(Int)Knowledge Nobility:0
(Int)Knowledge Planes:0
(Int)Knowledge Religion:0
(Int)Linguistics:0
(Cha)Perform:2
(Wis)Sense Motive:-2
(Dex)Sleight of Hand:1
(Int)Spellcraft:0
(Dex)Stealth:0
(Wis)Survival:-2
(Cha)Use Magic Device:2

Racial Traits:[Medium, 30 ft, Intimidating, Orc Ferocity, Darkvision 60 ft., Orc Blood]
Drawbacks:[Oblivious: Whether because you are an avid daydreamer or you are accustomed to everything being handed to you and spelled out for your benefit, you pay little attention to your surroundings and other people.
Effect:You take a –2 penalty on Sense Motive and sight-based Perception checks.]

Canan 
Gender:Female
Race:Half-orc
Height:5 ft. 10 in.
Weight:208 lbs.
Class:Adept
HP:4
AC:11
Touch AC:11
Flat-footed AC:10
STR:10(0), DEX:12(1), CON:7(-2), WIS:15(2), INT:13(1), CHA:9(-1) 
FORT:-2, REF:1, WILL:4, 
Initiative:1
Melee Attack Bonus (Str):0
Melee Attack Bonus (Dex):1
Ranged Attack Bonus:1
CMB:0
CMD:11
Feats:[Weapon Finesse]
Cantrips:[stabilize, create water]
1st level Spells (2/day):[protection from evil]
Skill Points:3
Skills:
(Int)Craft:4
(Cha)Handle Animal:-1
(Wis)Heal:2
(Int)Knowledge Arcana:1
(Int)Knowledge Dungeoneering:1
(Int)Knowledge Engineering:1
(Int)Knowledge Geography:1
(Int)Knowledge History:1
(Int)Knowledge Local:1
(Int)Knowledge Nature:1
(Int)Knowledge Nobility:1
(Int)Knowledge Planes:1
(Int)Knowledge Religion:1
(Wis)Profession:2
(Int)Spellcraft:1
(Wis)Survival:2
(Wis)Perception:2
(Dex)Acrobatics:1
(Int)Appraise:1
(Cha)Bluff:0
(Str)Climb:0
(Cha)Diplomacy:-1
(Dex)Disable Device:1
(Cha)Disguise:-1
(Dex)Escape Artist:1
(Cha)Intimidate:1
(Int)Linguistics:1
(Cha)Perform:0
(Dex)Ride:1
(Wis)Sense Motive:2
(Dex)Sleight of Hand:1
(Dex)Stealth:1
(Str)Swim:0
(Cha)Use Magic Device:-1

Racial Traits:[Medium, 30 ft, Intimidating, Orc Ferocity, Darkvision 60 ft., Orc Blood]
Drawbacks:[Headstrong: You feel compelled to correct every action and argument that contradicts your worldview.
Effect:Whenever you witness an action or hear an argument that contradicts your alignment, you must attempt to stop or correct that action or argument. If you either don’t try to stop it or fail in your attempt to stop it (as adjudicated by the GM), you are shaken for 1 hour.]

Hyrgan 
Gender:Other
Race:Halfling
Height:3 ft. 1 in.
Weight:35 lbs.
Class:Warrior
HP:11
AC:12
Touch AC:12
Flat-footed AC:11
STR:9(-1), DEX:13(1), CON:12(1), WIS:12(1), INT:18(4), CHA:12(1) 
FORT:4, REF:2, WILL:2, 
Initiative:1
Melee Attack Bonus:1
Ranged Attack Bonus:3
CMB:-1
CMD:10
Feats:[Blind Fight]
Skill Points:6
Skills:
(Str)Climb:7
(Int)Craft:4
(Cha)Handle Animal:1
(Cha)Intimidate:1
(Wis)Profession:1
(Dex)Ride:1
(Str)Swim:2
(Wis)Perception:3
(Dex)Acrobatics:3
(Int)Appraise:4
(Cha)Bluff:1
(Cha)Diplomacy:1
(Dex)Disable Device:1
(Cha)Disguise:1
(Dex)Escape Artist:1
(Wis)Heal:1
(Int)Knowledge Arcana:4
(Int)Knowledge Dungeoneering:4
(Int)Knowledge Engineering:5
(Int)Knowledge Geography:4
(Int)Knowledge History:4
(Int)Knowledge Local:4
(Int)Knowledge Nature:4
(Int)Knowledge Nobility:5
(Int)Knowledge Planes:4
(Int)Knowledge Religion:4
(Int)Linguistics:4
(Cha)Perform:1
(Wis)Sense Motive:1
(Dex)Sleight of Hand:1
(Int)Spellcraft:4
(Dex)Stealth:5
(Wis)Survival:2
(Cha)Use Magic Device:1

Racial Traits:[Small, 20 ft, Fearless, Halfling Luck, Sure-Footed, Keen Senses]
Drawbacks:[Sleepy: You must sleep or rest for at least 12 hours each night to get the benefits of a full night’s rest.
Effect:You take a –2 penalty on saving throws against sleep effects.]

