package com.shrikegames.pathfinder.tools.coreclasses;

public class Aristocrat extends CoreClass {
	
	public Aristocrat() {
		super("Aristocrat");
		setHitDie(8);
		setBab(0);
		setFortSave(0);
		setRefSave(0);
		setWillSave(2);
		setSkillCountBase(4);
		classSkills.add("(Int)Appraise");
		classSkills.add("(Cha)Bluff");
		classSkills.add("(Int)Craft");
		classSkills.add("(Cha)Diplomacy");
		classSkills.add("(Cha)Disguise");
		classSkills.add("(Cha)Handle Animal");
		classSkills.add("(Cha)Intimidate");
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
		classSkills.add("(Int)Linguistics");
		classSkills.add("(Wis)Perception");
		classSkills.add("(Cha)Perform");
		classSkills.add("(Wis)Profession");
		classSkills.add("(Dex)Ride");
		classSkills.add("(Wis)Sense Motive");
		classSkills.add("(Wis)Survival");
		classSkills.add("(Str)Swim");
		
	}
	
}
