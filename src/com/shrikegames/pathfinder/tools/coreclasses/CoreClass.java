package com.shrikegames.pathfinder.tools.coreclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.shrikegames.pathfinder.tools.npcgen.NPC;

public class CoreClass {
	protected String name;
	protected int skillCountBase;
	protected int bab;
	protected int fortSave;
	protected int refSave;
	protected int willSave;
	protected ArrayList<String> specials;
	protected int hitDie;
	protected int cantripCount = 0;
	protected int firstLevelSpellCount = 0;
	
	protected ArrayList<String> cantrips;
	protected ArrayList<String> firstLevelSpells;
	
	private HashMap<String, Integer> skills = new HashMap<String, Integer>();
	protected ArrayList<String> classSkills = new ArrayList<String>();
	
	protected ArrayList<String> skillsAvailable = new ArrayList<String>();
	
	public CoreClass(String name) {
		super();
		this.name = name;
		this.specials = new ArrayList<String>();
		this.classSkills = new ArrayList<String>();
		this.skillsAvailable = new ArrayList<String>();
		
		cantrips = new ArrayList<String>();
		firstLevelSpells = new ArrayList<String>();
		
		skillsAvailable.add("(Wis)Perception");
		skillsAvailable.add("(Dex)Acrobatics");
		skillsAvailable.add("(Int)Appraise");
		skillsAvailable.add("(Cha)Bluff");
		skillsAvailable.add("(Str)Climb");
		skillsAvailable.add("(Int)Craft");
		skillsAvailable.add("(Cha)Diplomacy");
		skillsAvailable.add("(Dex)Disable Device");
		skillsAvailable.add("(Cha)Disguise");
		skillsAvailable.add("(Dex)Escape Artist");
		skillsAvailable.add("(Cha)Handle Animal");
		skillsAvailable.add("(Wis)Heal");
		skillsAvailable.add("(Cha)Intimidate");
		skillsAvailable.add("(Int)Knowledge Arcana");
		skillsAvailable.add("(Int)Knowledge Dungeoneering");
		skillsAvailable.add("(Int)Knowledge Engineering");
		skillsAvailable.add("(Int)Knowledge Geography");
		skillsAvailable.add("(Int)Knowledge History");
		skillsAvailable.add("(Int)Knowledge Local");
		skillsAvailable.add("(Int)Knowledge Nature");
		skillsAvailable.add("(Int)Knowledge Nobility");
		skillsAvailable.add("(Int)Knowledge Planes");
		skillsAvailable.add("(Int)Knowledge Religion");
		skillsAvailable.add("(Int)Linguistics");
		skillsAvailable.add("(Cha)Perform");
		skillsAvailable.add("(Wis)Profession");
		skillsAvailable.add("(Dex)Ride");
		skillsAvailable.add("(Wis)Sense Motive");
		skillsAvailable.add("(Dex)Sleight of Hand");
		skillsAvailable.add("(Int)Spellcraft");
		skillsAvailable.add("(Dex)Stealth");
		skillsAvailable.add("(Wis)Survival");
		skillsAvailable.add("(Str)Swim");
		skillsAvailable.add("(Cha)Use Magic Device");
		
		for (String skill : skillsAvailable) {
			skills.put(skill, 0);
		}
		
	}
	
	public ArrayList<String> getSkillsAvailable() {
		return skillsAvailable;
	}
	
	public String getSkillList() {
		String skillsString = "\n";
		ArrayList<String> skillsToCheck = new ArrayList<String>();
		
		for (String classSkill : classSkills) {
			skillsToCheck.add(classSkill);
		}
		for (String skill : skillsAvailable) {
			if (!skillsToCheck.contains(skill)) {
				skillsToCheck.add(skill);
			}
		}
		for (String skill : skillsToCheck) {
			int score = skills.get(skill);
			//			if (score != 0) {
			skillsString += skill + ":" + score + "\n";
			//			}
		}
		return skillsString;
	}
	
	public void addSkillBonus(String skill, int amount) {
		skills.put(skill, skills.get(skill) + amount);
	}
	
	public void initSkillPoints(NPC npc) {
		//add stat mods for all skills
		for (String classSkill : skills.keySet()) {
			int skillValue = skills.get(classSkill);
			
			if (classSkill.startsWith("(Dex)")) {
				skillValue = npc.getDexterityMod();
			} else if (classSkill.startsWith("(Wis)")) {
				skillValue = npc.getWisdomMod();
			} else if (classSkill.startsWith("(Int)")) {
				skillValue = npc.getIntelligenceMod();
			} else if (classSkill.startsWith("(Cha)")) {
				skillValue = npc.getCharismaMod();
			} else if (classSkill.startsWith("(Str)")) {
				skillValue = npc.getStrengthMod();
			}
			skills.put(classSkill, skillValue);
		}
		
		//add skill rank scores
		Object[] skillsObjectArray = skills.keySet().toArray();
		String[] keys = Arrays.copyOf(skillsObjectArray, skillsObjectArray.length, String[].class);
		for (int i = 0; i < npc.getSkillPoints(); i++) {
			int random = (int) (Math.random() * skills.keySet().size());
			String classSkill = keys[random];
			int skillValue = 1;
			if (classSkills.contains(classSkill)) {
				skillValue = 3;
			}
			
			skills.put(classSkill, skills.get(classSkill) + skillValue);
		}
	}
	
	public ArrayList<String> getCantrips() {
		return cantrips;
	}
	
	public ArrayList<String> getFirstLevelSpells() {
		return firstLevelSpells;
	}
	
	public void setCantrips(ArrayList<String> cantrips) {
		this.cantrips = cantrips;
	}
	
	public void setFirstLevelSpells(ArrayList<String> firstLevelSpells) {
		this.firstLevelSpells = firstLevelSpells;
	}
	
	public void addSpecial(String special) {
		this.specials.add(special);
	}
	
	public String getName() {
		return name;
	}
	
	public int getSkillCountBase() {
		return skillCountBase;
	}
	
	public int getBab() {
		return bab;
	}
	
	public int getFortSave() {
		return fortSave;
	}
	
	public int getRefSave() {
		return refSave;
	}
	
	public int getWillSave() {
		return willSave;
	}
	
	public ArrayList<String> getSpecials() {
		return specials;
	}
	
	public int getHitDie() {
		return hitDie;
	}
	
	public int getCantripCount() {
		return cantripCount;
	}
	
	public int getFirstLevelSpellCount() {
		return firstLevelSpellCount;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSkillCountBase(int skillCountBase) {
		this.skillCountBase = skillCountBase;
	}
	
	public void setBab(int bab) {
		this.bab = bab;
	}
	
	public void setFortSave(int fortSave) {
		this.fortSave = fortSave;
	}
	
	public void setRefSave(int refSave) {
		this.refSave = refSave;
	}
	
	public void setWillSave(int willSave) {
		this.willSave = willSave;
	}
	
	public void setSpecials(ArrayList<String> specials) {
		this.specials = specials;
	}
	
	public void setHitDie(int hitDie) {
		this.hitDie = hitDie;
	}
	
	public void setCantripCount(int cantripCount) {
		this.cantripCount = cantripCount;
	}
	
	public void setFirstLevelSpellCount(int firstLevelSpellCount) {
		this.firstLevelSpellCount = firstLevelSpellCount;
	}
	
}
