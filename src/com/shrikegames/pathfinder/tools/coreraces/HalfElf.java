package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.NPC;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;
import com.shrikegames.pathfinder.tools.npcgen.utils.DiceUtils;

public class HalfElf extends CoreRace {
	
	public HalfElf() {
		super("Half-elf");
		setStrengthMod(0);
		setDexterityMod(0);
		setConstitutionMod(0);
		setIntelligenceMod(0);
		setWisdomMod(0);
		setCharismaMod(0);
		
		racialTraits.add("Medium");
		racialTraits.add("30 ft");
		racialTraits.add("Elven Immunities");
		racialTraits.add("Adaptability");
		racialTraits.add("Keen Senses");
		racialTraits.add("Low-Light Vision");
		racialTraits.add("Elf Blood");
		racialTraits.add("Multitalented");
		
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
		
		maleFirstNames = new String[] { "Calathes", "Encinal", "Iradli", "Kyras", "Narciso", "Quinray", "Seltyiel", "Zirul" };
		femaleFirstNames = new String[] { "Cathran", "Elsbeth", "Iandoli", "Kieyanna", "Lialda", "Maddela", "Reda", "Tamarie" };
		
	}
	
	@Override
	public void apply(NPC npc) {
		
		int random = (int) (Math.random() * npc.getCoreClass().getSkillsAvailable().size());
		String randomClass = npc.getCoreClass().getSkillsAvailable().get(random);
		npc.getCoreClass().addSkillBonus(randomClass, 3);
		npc.getCoreClass().addSkillBonus("(Wis)Perception", 2);
		
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((5 * 12) + 2, 2, 8);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((5 * 12) + 0, 2, 8);
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
			return CharacterUtils.getRandomWeight(100, 2, 8, 5);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(90, 2, 8, 5);
		}
		return "";
	}
}
