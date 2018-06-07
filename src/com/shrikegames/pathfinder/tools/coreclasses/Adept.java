package com.shrikegames.pathfinder.tools.coreclasses;

import com.shrikegames.pathfinder.tools.npcgen.utils.DiceUtils;

public class Adept extends CoreClass {
	private String[] availableCantrips = new String[] { "create water", "detect magic", "ghost sound", "guidance", "light", "mending", "purify food and drink", "read magic", "stabilize", "touch of fatigue" };
	private String[] availableFirstLevelSpells = new String[] { "bless", "burning hands", "cause fear", "command", "comprehend languages", "cure light wounds", "detect chaos", "detect evil", "detect good", "detect law", "endure elements",
			"obscuring mist", "protection from chaos", "protection from evil", "protection from good", "protection from law", "sleep" };
	
	public Adept() {
		super("Adept");
		setHitDie(6);
		setBab(0);
		setFortSave(0);
		setRefSave(0);
		setWillSave(2);
		setCantripCount(3);
		setFirstLevelSpellCount(1);
		setSkillCountBase(2);
		
		for (int i = 0; i < cantripCount; i++) {
			String spell = randomDivineCantrip();
			if (!cantrips.contains(spell)) {
				cantrips.add(spell);
			}
		}
		for (int i = 0; i < firstLevelSpellCount; i++) {
			String spell = randomDivineSpell();
			if (!firstLevelSpells.contains(spell)) {
				firstLevelSpells.add(spell);
			}
		}
		
		classSkills.add("(Int)Craft");
		classSkills.add("(Cha)Handle Animal");
		classSkills.add("(Wis)Heal");
		classSkills.add("(Int)Knowledge Arcana");
		classSkills.add("(Int)Knowledge Dungeoneering");
		classSkills.add("(Int)Knowledge Engineering");
		classSkills.add("(Int)Knowledge Geography");
		classSkills.add("(Int)Knowledge History");
		classSkills.add("(Int)Knowledge Local");
		classSkills.add("(Int)Knowledge Nature");
		classSkills.add("(Int)Knowledge Nobility");
		classSkills.add("(Int)Knowledge Planes");
		classSkills.add("(Int)Knowledge Religion");
		classSkills.add("(Wis)Profession");
		classSkills.add("(Int)Spellcraft");
		classSkills.add("(Wis)Survival");
	}
	
	private String randomDivineSpell() {
		int random = DiceUtils.random(0, availableFirstLevelSpells.length - 1);
		return availableFirstLevelSpells[random];
	}
	
	private String randomDivineCantrip() {
		int random = DiceUtils.random(0, availableCantrips.length - 1);
		return availableCantrips[random];
	}
	
}
