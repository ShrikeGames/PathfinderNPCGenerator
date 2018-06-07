package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.NPC;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class Goblin extends CoreRace {
	
	public Goblin() {
		super("Goblin");
		setStrengthMod(-2);
		setDexterityMod(4);
		setConstitutionMod(0);
		setIntelligenceMod(0);
		setWisdomMod(0);
		setCharismaMod(-2);
		racialTraits.add("Small");
		racialTraits.add("30 ft");
		racialTraits.add("Skilled");
		racialTraits.add("Fast Movement");
		racialTraits.add("Darkvision 60 ft.");
		
		maleFirstNames = new String[] { "Boorgub", "Chuffy", "Churkus", "Drubbus", "Gawg", "Ghorg", "Gogmurch", "Irnk", "Kavak", "Lunthus", "Mogmurch", "Mogawg", "Murch", "Nurpus", "Pogus", "Poog", "Ronk", "Rotfoot", "Unk", "Vogun", "Zobmaggle",
				"Zord" };
		femaleFirstNames = new String[] { "Aka", "Chee", "Fevva", "Geedra", "Goomluga", "Gretcha", "Hoglob", "Janka", "Klongy", "Luckums", "Lupi", "Medge", "Namby", "Olba", "Rempy", "Reta", "Ruxi", "Vruta", "Yalla", "Ziku" };
	}
	
	@Override
	public void apply(NPC npc) {
		npc.getCoreClass().addSkillBonus("(Dex)Ride", 4);
		npc.getCoreClass().addSkillBonus("(Dex)Stealth", 8);
		npc.setAcSizeBonus(1);
		
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((2 * 12) + 8, 2);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((2 * 12) + 6, 2);
		}
		return "";
	}
	
	@Override
	public String getRandomWeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomWeight(30, 2, 4, 1);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(25, 2, 4, 1);
		}
		return "";
	}
	
}
