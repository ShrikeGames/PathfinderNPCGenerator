package com.shrikegames.pathfinder.tools.coreraces;

import java.util.ArrayList;

import com.shrikegames.pathfinder.tools.npcgen.NPC;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;
import com.shrikegames.pathfinder.tools.npcgen.utils.DiceUtils;

public class CoreRace {
	private String name;
	private int strengthMod;
	private int dexterityMod;
	private int constitutionMod;
	private int wisdomMod;
	private int intelligenceMod;
	private int charismaMod;
	private int featCount;
	private int skillPointBonus;
	protected ArrayList<String> racialTraits;
	protected String[] maleFirstNames;
	protected String[] femaleFirstNames;
	
	public CoreRace(String name) {
		super();
		this.name = name;
		strengthMod = 0;
		dexterityMod = 0;
		constitutionMod = 0;
		wisdomMod = 0;
		intelligenceMod = 0;
		charismaMod = 0;
		featCount = 1;
		skillPointBonus = 0;
		racialTraits = new ArrayList<String>();
		maleFirstNames = new String[] {};
		femaleFirstNames = new String[] {};
	}
	
	public String[] getFirstNameList(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return maleFirstNames;
		} else if (baseGender.equals("Female")) {
			return femaleFirstNames;
		}
		return new String[] {};
	}
	
	public void apply(NPC npc) {
		
	}
	
	public int getSkillPointBonus() {
		return skillPointBonus;
	}
	
	public ArrayList<String> getRacialTraits() {
		return racialTraits;
	}
	
	public void setSkillPointBonus(int skillPointBonus) {
		this.skillPointBonus = skillPointBonus;
	}
	
	public void setRacialTraits(ArrayList<String> racialTraits) {
		this.racialTraits = racialTraits;
	}
	
	public int getFeatCount() {
		return featCount;
	}
	
	public void setFeatCount(int featCount) {
		this.featCount = featCount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStrengthMod() {
		return strengthMod;
	}
	
	public int getDexterityMod() {
		return dexterityMod;
	}
	
	public int getConstitutionMod() {
		return constitutionMod;
	}
	
	public int getWisdomMod() {
		return wisdomMod;
	}
	
	public int getIntelligenceMod() {
		return intelligenceMod;
	}
	
	public int getCharismaMod() {
		return charismaMod;
	}
	
	public void setStrengthMod(int strengthMod) {
		this.strengthMod = strengthMod;
	}
	
	public void setDexterityMod(int dexterityMod) {
		this.dexterityMod = dexterityMod;
	}
	
	public void setConstitutionMod(int constitutionMod) {
		this.constitutionMod = constitutionMod;
	}
	
	public void setWisdomMod(int wisdomMod) {
		this.wisdomMod = wisdomMod;
	}
	
	public void setIntelligenceMod(int intelligenceMod) {
		this.intelligenceMod = intelligenceMod;
	}
	
	public void setCharismaMod(int charismaMod) {
		this.charismaMod = charismaMod;
	}
	
	public String getFirstName(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male") && maleFirstNames != null && maleFirstNames.length > 0) {
			int random = DiceUtils.random(0, maleFirstNames.length);
			return maleFirstNames[random];
		} else if (baseGender.equals("Female") && femaleFirstNames != null && femaleFirstNames.length > 0) {
			int random = DiceUtils.random(0, femaleFirstNames.length);
			return femaleFirstNames[random];
		}
		return "";
	}
	
	public String getLastName(String gender) {
		return "";
	}
	
	public String getRandomHeight(String gender) {
		return "";
	}
	
	public String getRandomWeight(String gender) {
		return "";
	}
	
}
