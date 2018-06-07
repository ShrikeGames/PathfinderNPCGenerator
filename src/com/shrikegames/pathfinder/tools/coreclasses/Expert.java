package com.shrikegames.pathfinder.tools.coreclasses;

public class Expert extends CoreClass {
	
	public Expert() {
		super("Expert");
		setHitDie(8);
		setBab(0);
		setFortSave(0);
		setRefSave(0);
		setWillSave(2);
		setSkillCountBase(6);
		//Experts pick 10 class skills randomly to be class skills
		for (int i = 0; i < 10; i++) {
			int random = (int) (Math.random() * skillsAvailable.size());
			classSkills.add(skillsAvailable.get(random));
		}
	}
	
}
