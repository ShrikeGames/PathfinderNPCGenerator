package com.shrikegames.pathfinder.tools.coreclasses;

public class Warrior extends CoreClass {
	
	public Warrior() {
		super("Warrior");
		setHitDie(10);
		setBab(1);
		setFortSave(2);
		setRefSave(0);
		setWillSave(0);
		setSkillCountBase(2);
		
		classSkills.add("(Str)Climb");
		classSkills.add("(Int)Craft");
		classSkills.add("(Cha)Handle Animal");
		classSkills.add("(Cha)Intimidate");
		classSkills.add("(Wis)Profession");
		classSkills.add("(Dex)Ride");
		classSkills.add("(Str)Swim");
	}
	
}
