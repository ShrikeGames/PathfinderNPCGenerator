package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.NPC;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class Elf extends CoreRace {
	
	public Elf() {
		super("Elf");
		setStrengthMod(0);
		setDexterityMod(2);
		setConstitutionMod(-2);
		setIntelligenceMod(2);
		setWisdomMod(0);
		setCharismaMod(0);
		
		racialTraits.add("Medium");
		racialTraits.add("30 ft");
		racialTraits.add("Elven Immunities");
		racialTraits.add("Keen Senses");
		racialTraits.add("Elven Magic");
		racialTraits.add("Low-Light Vision");
		
		maleFirstNames = new String[] { "Caladrel", "Heldalel", "Lanliss", "Meirdrarel", "Seldlon", "Talathel", "Variel", "Zordlon" };
		femaleFirstNames = new String[] { "Amrunelara", "Dardlara", "Faunra", "Jathal", "Merisiel", "Oparal", "Soumral", "Tessara", "Yalandlara" };
	}
	
	@Override
	public void apply(NPC npc) {
		
		npc.getCoreClass().addSkillBonus("(Wis)Perception", 2);
		
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((5 * 12) + 4, 2, 8);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((5 * 12) + 4, 2, 6);
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
			return CharacterUtils.getRandomWeight(110, 2, 8, 3);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(90, 2, 8, 3);
		}
		return "";
	}
}
