package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.NPC;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class Halfling extends CoreRace {
	
	public Halfling() {
		super("Halfling");
		setStrengthMod(-2);
		setDexterityMod(2);
		setConstitutionMod(0);
		setIntelligenceMod(0);
		setWisdomMod(0);
		setCharismaMod(2);
		
		racialTraits.add("Small");
		racialTraits.add("20 ft");
		racialTraits.add("Fearless");
		racialTraits.add("Halfling Luck");
		racialTraits.add("Sure-Footed");
		racialTraits.add("Keen Senses");
		
		maleFirstNames = new String[] { "Antal", "Boram", "Hyrgan", "Jamir", "Lem", "Miro", "Sumak", "Tribin", "Uldar", "Vraxim" };
		femaleFirstNames = new String[] { "Anafa", "Bellis", "Etune", "Filiu", "Irlana", "Marra", "Pressi", "Rilka", "Sistra", "Wyssal", "Yamyra" };
	}
	
	@Override
	public void apply(NPC npc) {
		npc.setRefSave(npc.getRefSave() + 1);
		npc.setWillSave(npc.getWillSave() + 1);
		npc.setFortSave(npc.getFortSave() + 1);
		
		npc.getCoreClass().addSkillBonus("(Dex)Stealth", 4);
		npc.getCoreClass().addSkillBonus("(Dex)Acrobatics", 2);
		npc.getCoreClass().addSkillBonus("(Str)Climb", 2);
		npc.getCoreClass().addSkillBonus("(Wis)Perception", 2);
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
