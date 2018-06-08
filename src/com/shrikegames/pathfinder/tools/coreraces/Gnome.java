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
		maleFirstNames = new String[] { "Abroshtor", "Bastargre", "Halungalom", "Krolmnite", "Poshment", "Zarzuket", "Zatqualmie", "Sakur", "Hisfan", "Quahim", "Jegim", "Manser", "Jepip", "Manziver", "Nihim", "Tradri", "Hisser", "Warkur", "Brilin",
				"Vorziver", "Yoslin", "Yejin", "Aljin", "Wildri", "Valdon", "Xobar", "Warlin", "Vorcryn", "Tanmorn", "Yeston", "Trajin", "Rasben", "Xopos", "Brinan", "Xalzu", "Manlen", "Quocorin", "Wremop", "Yetor", "Horni", "Valgim", "Sinrug",
				"Sarick", "Saser", "Brini", "Vorcorin", "Rondri", "Kaslin", "Tanzu", "Valhik", "Lankur", "Calpip", "Wilrug", "Toner", "Togim", "Xaldon", "Xofan", "Kasros", "Lanben", "Ronkas", "Erlen", "Grakur", "Hisston", "Felben", "Vorfiz", "Samin",
				"Ianxif", "Horgrim", "Bilmorn", "Manbar", "Saxif", "Jorpos", "Quanan", "Oruxim", "Rasgim", "Yosner", "Logim", "Quaver", "Felji", "Vorner", "Yosfan", "Salni", "Jenan", "Ornan", "Manros", "Grahik", "Orulen", "Mandri", "Torug", "Oruben",
				"Ziltor", "Vorcryn", "Umlen", "Gacryn", "Warjin", "Tolin", "Horkur", "Rasfiz", "Davdon", "Salpip", "Quocryn", "Vorryn", "Ziljin", "Valmorn", "Manyur", "Hisrug", "Wildri", "Niston", "Jorkas", "Bilybar", "Nesdon", "Sinmop", "Grajin",
				"Farcorin", "Xolen", "Neswor", "Nizu" };
		femaleFirstNames = new String[] { "Besh", "Fijit", "Lini", "Majet", "Neji", "Pai", "Queck", "Trig", "Yozyre", "Elpine", "Urina", "Spisys", "Orphina", "Takini", "Kloci", "Tanove", "Folmila", "Folbys", "Lorifi", "Zingyra", "Xyronoa",
				"Breedira", "Odakasys", "Zanimiphi", "Orkasys", "Ufena", "Loribys", "Renoa", "Faewyn", "Venwyse", "Tifapine", "Folnoa", "Isomyra", "Mysany", "Urihani", "Arihani", "Breeyaris", "Faetina", "Zanimila", "Inabys", "Helna", "Myla",
				"Xyrossa", "Wroxi", "Foltina", "Refyx", "Hesla", "Selgyra", "Zanimila", "Inabys", "Helna", "Myla", "Xyrossa", "Wroxi", "Foltina", "Refyx", "Hesla", "Selgyra", "Zanimila", "Inabys", "Helna", "Myla", "Xyrossa", "Wroxi", "Foltina",
				"Refyx", "Hesla", "Selgyra", "Venlin", "Eilidysa", "Quegani", "Myla", "Doqaryn", "Orwyn", "Dobi", "Jelbi", "Lilmyra", "Xahana", "Lilsany", "Elgyra", "Myla", "Sadysa", "Wrorhana", "Orrhana", "Odatina", "Breekini", "Dowyse", "Xyrogyra",
				"Folyaris", "Loritra", "Ylossa", "Wella", "Folgani", "Faepine", "Minwyse", "Mysany", "Jeldira", "Orceli", "Helgyra", "Lorinoa", "Saxis", "Dosany", "Mytra", "Faeniana", "Nygyra", "Jorhana", "Aluyore", "Isohani", "Xaxi", "Isoxis",
				"Tifaphina", "Mytina", "Tifayaris", "Alulys", "Breedysa", "Ylobys", "Jellin", "Zanisys" };
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
