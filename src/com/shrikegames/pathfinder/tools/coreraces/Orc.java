package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class Orc extends CoreRace {
	
	public Orc() {
		super("Orc");
		setStrengthMod(4);
		setDexterityMod(0);
		setConstitutionMod(0);
		setIntelligenceMod(-2);
		setWisdomMod(-2);
		setCharismaMod(-2);
		racialTraits.add("Medium");
		racialTraits.add("30 ft");
		racialTraits.add("Ferocity");
		racialTraits.add("Darkvision 60 ft.");
		racialTraits.add("Light sensitivity");
		
		maleFirstNames = new String[] { "Arkus", "Carrug", "Felzak", "Murdut", "Prabur" };
		femaleFirstNames = new String[] { "Durra", "Grillgiss", "Ilyat", "Krugga", "Leffit", "Olbin", "Trisgrak" };
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((5 * 12) + 1, 2, 12);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((4 * 12) + 9, 2, 12);
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
			return CharacterUtils.getRandomWeight(160, 2, 12, 7);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(120, 2, 12, 7);
		}
		return "";
	}
}
