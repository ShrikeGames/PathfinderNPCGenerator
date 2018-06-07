package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.NPC;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class Gnome extends CoreRace {
	
	public Gnome() {
		super("Gnome");
		setStrengthMod(-2);
		setDexterityMod(0);
		setConstitutionMod(2);
		setIntelligenceMod(0);
		setWisdomMod(0);
		setCharismaMod(2);
		
		racialTraits.add("Small");
		racialTraits.add("20 ft");
		racialTraits.add("Defensive Training");
		racialTraits.add("Illusion Resistance");
		racialTraits.add("Keen Senses");
		racialTraits.add("Obsessive");
		racialTraits.add("Gnome Magic");
		racialTraits.add("Hatred");
		racialTraits.add("Low-Light Vision");
		maleFirstNames = new String[] { "Abroshtor", "Bastargre", "Halungalom", "Krolmnite", "Poshment", "Zarzuket", "Zatqualmie" };
		femaleFirstNames = new String[] { "Besh", "Fijit", "Lini", "Majet", "Neji", "Pai", "Queck", "Trig" };
	}
	
	@Override
	public void apply(NPC npc) {
		
		npc.getCoreClass().addSkillBonus("(Wis)Perception", 2);
		npc.getCoreClass().addSkillBonus("(Int)Craft", 2);
		npc.setAcSizeBonus(1);
		npc.getCoreClass().addSkillBonus("(Dex)Stealth", 4);
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((3 * 12) + 0, 2);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((2 * 12) + 10, 2);
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
			return CharacterUtils.getRandomWeight(35, 2, 4, 1);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(30, 2, 4, 1);
		}
		return "";
	}
}
