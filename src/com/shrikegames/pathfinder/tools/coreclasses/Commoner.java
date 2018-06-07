package com.shrikegames.pathfinder.tools.coreclasses;

public class Commoner extends CoreClass {
	
	public Commoner() {
		super("Commoner");
		setHitDie(6);
		setBab(0);
		setFortSave(0);
		setRefSave(0);
		setWillSave(0);
		setSkillCountBase(2);
		
		classSkills.add("(Str)Climb");
		classSkills.add("(Int)Craft");
		classSkills.add("(Cha)Handle Animal");
		classSkills.add("(Wis)Perception");
		classSkills.add("(Wis)Profession");
		classSkills.add("(Dex)Ride");
		classSkills.add("(Str)Swim");
		
	}
	
}
