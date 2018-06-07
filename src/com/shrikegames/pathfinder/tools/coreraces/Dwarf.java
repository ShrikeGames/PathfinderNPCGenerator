package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class Dwarf extends CoreRace {
	
	public Dwarf() {
		super("Dwarf");
		setStrengthMod(0);
		setDexterityMod(0);
		setConstitutionMod(2);
		setIntelligenceMod(0);
		setWisdomMod(2);
		setCharismaMod(-2);
		
		racialTraits.add("Medium");
		racialTraits.add("20 ft");
		racialTraits.add("Slow and Steady");
		racialTraits.add("Defensive Training");
		racialTraits.add("Hardy");
		racialTraits.add("Stability");
		racialTraits.add("Greed");
		racialTraits.add("Stonecunning");
		racialTraits.add("Darkvision 60 ft.");
		racialTraits.add("Hatred");
		
		maleFirstNames = new String[] { "Dolgrin", "Grunyar", "Harsk", "Kazmuk", "Morgrym", "Roga" };
		femaleFirstNames = new String[] { "Agna", "Bodill", "Ingra", "Kotri", "Rusilka", "Yangrit" };
		
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((3 * 12) + 9, 2);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((3 * 12) + 7, 2);
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
			return CharacterUtils.getRandomWeight(150, 2, 4, 7);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(120, 2, 4, 7);
		}
		return "";
	}
}
