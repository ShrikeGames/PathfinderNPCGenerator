package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.NPC;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;
import com.shrikegames.pathfinder.tools.npcgen.utils.DiceUtils;

public class HalfOrc extends CoreRace {
	
	public HalfOrc() {
		super("Half-orc");
		setStrengthMod(0);
		setDexterityMod(0);
		setConstitutionMod(0);
		setIntelligenceMod(0);
		setWisdomMod(0);
		setCharismaMod(0);
		
		racialTraits.add("Medium");
		racialTraits.add("30 ft");
		racialTraits.add("Intimidating");
		racialTraits.add("Orc Ferocity");
		racialTraits.add("Darkvision 60 ft.");
		racialTraits.add("Orc Blood");
		
		int random = DiceUtils.random(1, 6);
		switch (random) {
			case 1:
				setStrengthMod(2);
				break;
			case 2:
				setDexterityMod(2);
				break;
			case 3:
				setConstitutionMod(2);
				break;
			case 4:
				setIntelligenceMod(2);
				break;
			case 5:
				setWisdomMod(2);
				break;
			case 6:
				setCharismaMod(2);
				break;
		}
		
		maleFirstNames = new String[] { "Ausk", "Davor", "Hakak", "Kizziar", "Makoa", "Nesteruk", "Tsadok" };
		femaleFirstNames = new String[] { "Canan", "Drogheda", "Goruza", "Mazon", "Shirish", "Tevaga", "Zeljka" };
	}
	
	@Override
	public void apply(NPC npc) {
		npc.getCoreClass().addSkillBonus("(Cha)Intimidate", 2);
		
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((4 * 12) + 10, 2, 12);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((4 * 12) + 5, 2, 12);
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
			return CharacterUtils.getRandomWeight(150, 2, 12, 7);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(110, 2, 12, 7);
		}
		return "";
	}
}
