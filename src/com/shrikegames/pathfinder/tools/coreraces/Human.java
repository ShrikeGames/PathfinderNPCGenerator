package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;
import com.shrikegames.pathfinder.tools.npcgen.utils.DiceUtils;

public class Human extends CoreRace {
	
	public Human() {
		super("Human");
		setStrengthMod(0);
		setDexterityMod(0);
		setConstitutionMod(0);
		setIntelligenceMod(0);
		setWisdomMod(0);
		setCharismaMod(0);
		setFeatCount(2);
		setSkillPointBonus(1);
		racialTraits.add("Medium");
		racialTraits.add("30 ft");
		racialTraits.add("Bonus Feat");
		racialTraits.add("Skilled");
		
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
		
		maleFirstNames = new String[] { "Aakif", "Andrezi", "Arasmes", "Bahram", "Baolo", "Barid", "Batsaikhan", "Belor", "Budi", "Darvan", "Dolok", "Eilif", "Garidan", "Gellius", "Hadzi", "Hamengku", "Harisko", "Iacobus", "Jaali", "Jianguo",
				"Kjell", "Kousei", "Kronug", "Menas", "Mitabu", "Narsius", "Nonek", "Pateba", "Pratavh", "Qorchi", "Ragnar", "Rubani", "Seckor", "Shokamb", "Shuo", "Sunaki", "Suryo", "Tabansi", "Teruawa", "Thanh Liem", "Toan Hao", "Tomorbataar",
				"Tuong Kinh", "Ursion", "Vachedi", "Viorec", "Yekskya", "Zaiho", "Zhen" };
		femaleFirstNames = new String[] { "Alerdene", "Alinza", "Aula", "Bach Hien", "Belka", "Beshkee", "Chammady", "Chao", "Do Quyen", "Eshe", "Eudomia", "Gerda", "Hiriko", "Ilinica", "Indah", "Ingirt", "Izora", "Jalket", "Jayazi", "Kaede",
				"Kalizama", "Kamshi", "Lestari", "Leyli", "Marisan", "Me’amesa", "Meilin", "Mirelinda", "Mpaandi", "Nalmida", "Nanya", "Narantuyaa", "Ntisi", "Pasara", "Pontia", "Que Xuan", "Revhi", "Runa", "Sahba", "Shirin", "Shivkah", "Sinkitah",
				"Surenchinua", "Udara", "Umie", "Valki", "Waajida", "Xemne", "Xue", "Zalika", "Zova" };
		
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((4 * 10) + 1, 2, 10);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((4 * 5) + 9, 2, 10);
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
			return CharacterUtils.getRandomWeight(120, 2, 10, 5);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(85, 2, 10, 5);
		}
		return "";
	}
	
}
