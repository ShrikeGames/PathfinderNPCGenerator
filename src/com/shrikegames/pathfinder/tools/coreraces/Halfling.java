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
		
		maleFirstNames = new String[] { "Antal", "Boram", "Hyrgan", "Jamir", "Lem", "Miro", "Sumak", "Tribin", "Uldar", "Vraxim", "Drancis", "Fastob", "Gilew", "Exas", "Erard", "Thelrey", "Gundo Rubbairn", "Holfo", "Hado", "Affer Galburr",
				"Gery Dowsell", "Arlew", "Vyncis", "Gyliam", "Hardo Tonell", "Gery Wysav", "Warder", "Thony", "Heric Galboph", "Hildo", "Hamfo", "Bando", "Fastolm Boffairb", "Walter Wellsell", "Isert", "Artis", "Tholes", "James", "Hamse",
				"Cottob Bairnell", "Ames Hylle", "Geoffrey", "Chamas", "Gyles", "Altes", "Ryany", "Roge", "Wyny", "Riado", "Sado", "Hony Pare", "Geoffry", "Hardo Boffairb", "Gyles Exleyn", "Hany", "Ginas", "Manas", "Alalph Koerwe", "Rado",
				"Tolphams Growes", "Graffin", "Jago", "Waltom", "Rumbrug Basi", "Vyncent", "Tharlan", "Ralphye Marte", "Tomes", "Andwin", "Ephen", "Anier", "Gerey Ginte", "Tobo", "Harad", "Ugar Diggly", "Rarder Clowe", "Sengo", "Reder",
				"Ibas Tunnell", "Sado Bairnell", "Folke", "Ginard", "Walteph", "Edmugh", "Ryany Windsell", "Dibras", "Exard", "Robert", "Hamart", "Nathye", "Chughye", "Frewyn", "Gardo", "Gauwill", "Wiso", "Tomath", "Fralphye Cere", "Doco", "Ephes",
				"Halfo", "Wyny Wylcey", "Ismon", "Wisym", "Hardo", "Ewin", "Frobert", "Heric Chille", "Tholex", "Gery", "Ethed Lyne", "Willes", "Halfras Oper", "Alfrert", "Breyny", "Ibard", "Hildo Chinell", "Iser", "Rewill Goodwe", "Geoffry Hyte",
				"Manod Ginsi", "Sonard Grubbuck", "Dalgo Banksi", "Gorme Oper", "Hamso Unner", "Bertolph", "Arryn", "Folco", "Gryany", "Heobo Olges", "Narder Neselw", "Garic Burrow", "Bowme Gamwes", "Gery Nelley", "Reward Hylley", "Walter",
				"Giles Haucey", "Stephye", "Ilin Arrod", "Gaffo", "Baldo Banksi", "Robern", "Hobso Chinell", "Ippic", "Sonas", "Imas", "Baldo", "Ised", "Dodo", "Piersym", "Ahard", "Aniew", "Nichye", "Alert Masev", "Thamart", "Georguy", "Ferdo",
				"Holex", "Ralphye", "Frichye", "Ardim", "Bardo", "Hildo Galboph", "Amer", "Mado Burrow", "Sembo Chubburr", "Riffolk", "Georguy Foxe", "Helrey", "Ahald", "Gery Nysev", "Phughye", "Mesym", "Wilim", "Rewilh Yournell", "Adoc Boffairb",
				"Wilim Gammidg", "Ichond", "Mado Ginsi", "Imast", "Ewis", "Giles", "Gylew Drydye", "Greder Erres", "Arthund", "Grichye", "Eras", "Nieles", "Fastror", "Athyel", "Chany", "Aniert", "Ales Harcey", "Fastolph", "Hamse Bophill", "Ancip",
				"Hughye", "Frime", "Andrer", "Johny", "Ibrast", "Hobso Bophubb", "Rarder Sone", "Homes", "Chelry", "Udim", "Ander", "Finy Pethey", "Andond Ugwort", "Froge", "Brewyn Neve" };
		femaleFirstNames = new String[] { "Anafa", "Bellis", "Etune", "Filiu", "Irlana", "Marra", "Pressi", "Rilka", "Sistra", "Wyssal", "Yamyra", "Joycie", "Sarra", "Fira Galpsi", "Belly", "Even", "Ennel", "Lanta", "Benne", "Efrin", "Phelia",
				"Antarl", "Amot", "Joyce", "Joyce Rynge", "Belia", "Elil", "Ellanth Bairnell", "Drimay", "Suse", "Lane", "Mara Finchey", "Mary", "Belby", "Hera Jordye", "Lilia", "Adan", "Aran", "Merey", "Manta Tunnell", "Elys", "Antanth Growes",
				"Rielia", "Lila", "Esmer", "Marger", "Atet", "Anet", "Phery", "Niny", "Argeth Gliferr", "Elean", "Aldan Fairburr", "Lyne", "Apphilo", "Bela", "Ellan Bophill", "Alin Lewe", "Mentha", "Kater", "Mira", "Dera", "Hanne Ginsi",
				"Peone Mugwich", "Arion", "Marget Warne", "Annan", "Benne Harpyl", "Pervia", "Egine Gammarch", "Rosa", "Joane", "Ridget", "Rione Nete", "Dela", "Amell", "Hily", "Prosy", "Antilly Gamwort", "Perva", "Maly Hoper", "Jane", "Alix Potte",
				"Arior", "Bella Rubbanks", "Mera", "Mara", "Lada", "Phily", "Aldanth Bairnell", "Inarl Bophill", "Maly", "Anel", "Ildanth", "Ellyn", "Phely", "Abet", "Sabeth", "Irier", "Enel", "Rimra", "Alil Garay", "Diamay", "Hone", "Enet",
				"Ener Oper", "Annen Holte", "Ester Rowes", "Elen", "Lota", "Eryn", "Wene", "Mena Gamwes", "Mellia", "Bely Forde", "Rida Diggly", "Avel", "Monda", "Alvian", "Bryne", "Jane Woodye", "Elen Mesell", "Landa", "Prosa", "Jessa",
				"Lana Gamwort", "Prosy Mugwich", "Aneth Dysley", "Tella Cottunn", "Arira", "Atet Neselw", "Cece", "Kater Porte", "Brione", "Loba", "Avell", "Abel Ferre", "Lota Gamgee", "Anor", "Pearla Buck", "Cily", "Hoda Roper", "Mena Fairbuck",
				"Melly", "Cela", "Daldra", "Prida Bolgee", "Pearlia", "Elian Buck", "Malia Pycey", "Hoda", "Ervigo Basi", "Cora Galpsi", "Tine Galboph", "Andida", "Elan", "Egina Bagge", "Annanth", "Belba Chinell", "Elyn", "Ellanth", "Amine Oper",
				"Antanth Gerubb", "Lavia", "Metha", "Lalia", "Raba Ginsi", "Mosa", "Ausan Bexley", "Ellen", "Bella Ginsi", "Mira Gamgee", "Cora Tonell", "Bryellia", "Alfrisy Finell", "Apphimu Gerow", "Jessa Galpsi", "Damay Oldbubb", "Eline",
				"Phera Tery", "Damay", "Eryst", "Peone", "Ilix Spotte", "Marget", "Efril", "Sybel Hyte", "Rose", "Sybel", "Malia Salte", "Aber", "Dora", "Abel Kesav", "Lavy Midgee", "Pralda Galpsi", "Cilia", "Ellyn Carde", "Antarl Gerop", "Sabeatr",
				"Evet", "Bella", "Ippan", "Rigill", "Eryst Banksi", "Malia", "Ellian Bairnell", "Jesse", "Camay Midgee", "Ryellia", "Aman", "Samay" };
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
