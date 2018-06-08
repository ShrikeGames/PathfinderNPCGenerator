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
				"Tuong Kinh", "Ursion", "Vachedi", "Viorec", "Yekskya", "Zaiho", "Zhen", "Aenbeorht", "Orstan", "Narder", "Friffin", "Walde", "Stomond", "Etbert", "Reder", "Bertio", "Roguy", "Wulfa", "Bertio", "Chamart", "Sige", "Narder", "Athard",
				"Cemund", "Richye", "Jamath", "Selre", "Balde", "Gyles", "Finy", "Ororht", "Sige", "Walchelm", "Giles", "Gery", "Narder", "Balda", "Behrtio", "Vyncent", "Ancrelm", "Wigfa", "Helmund", "Rarder", "Hamund Mesalt", "Cyne", "Gery",
				"Harlip", "Here", "George", "Munder", "Tilbehrt", "Drewis", "Berny", "Gaenbert", "Anthond", "Sige", "Lany", "Aldelm", "Nathye", "Bertio", "Erelm", "Rewill Neray", "Droguy", "Exas", "Withwiu", "Driffin Lewe", "Reyny", "Gilew Payne",
				"Lewalt Elwyns", "Ames", "Aebald", "Afan", "Freda", "Heardu", "Elrew", "Cyne", "Amar", "Ware", "Warder", "Helmund", "Arthur", "Gilas Parry", "Rida", "Sige", "Nothelh", "Beornfre", "Eawin", "Elrith", "Aethelm", "Anthond Yourner",
				"Driffin Lardaye", "Dryany", "Gauwill Rawley", "Athas", "Ceolfre", "Beorhtio", "Brewyn", "Hearda", "Mesym", "Egard", "George Mesav", "Jamath Nere", "Richye", "Nichye Selley", "Heahre", "Edward", "Here", "Tricio", "Bade", "Nichye",
				"Wisym", "Baldu", "Munder", "Gery Dyley", "Wisym Borne", "Amer", "Hege", "Hearde", "Chames", "Wulfa", "Lulla", "Eadnoth", "Ernam Mere", "Rorda", "Ceolswy", "Arryn", "Uced", "Waegda", "Aced", "Grewilh Neselw", "Aerelm", "Behrtio",
				"Ealdrert", "Symes Grysalt", "Piersym", "Gauwyn", "Hamas", "Fraffolk", "Gery", "Stephye", "Berteph", "Ered", "Wyny", "Aiged", "Erard", "Alel", "Geoffry", "Aerert", "Orhtsin", "Helwy", "Eonweald", "Anthohn Garre", "Symas Goodwe",
				"Elbric", "Hurey", "Gery Page", "Baldwy", "Wearda", "Athest", "Narder Meson", "Arler", "Ilehrt", "Alard", "Cenfa", "Aethel", "Athard", "Anies Mery", "Andel", "Gauwalt", "Geoffry Glyne", "Eadrith", "Hermund", "Conbehrt", "Gylas",
				"Wynfre", "Hury", "Johny", "Eorwald", "Gauwis", "Wartcio", "Ealhhed", "Enryn Pycey", "Gerey Porte", "Gulfa", "Aerin", "Ordgac", "Masym None", "Phelry", "Aldher", "Adwyn", "Rancent Weson", "Reder Wyarde", "Gery Knynselw", "Grarder",
				"Conwiu", "Ancin", "Balda", "Pharder", "Piersym Hammoor", "Regnher", "James Quinte", "William Ratcle", "Aerer", "Gauward Dratcley", "Rancent", "Cone", "Lesym Haley", "Theore", "There", "Aelwyth", "Olfeiulf", "Johny Folcey", "Rumwy",
				"Altes Fane", "Henry Jene", "Anies Tesalt", "Altes", "Gauwilh", "Lacio", "Cyni", "Narder", "Gerey Jorde", "Finy", "Erert", "Alhmund", "Gauward", "Athalph", "Gelda", "Cytio", "Arlers", "Edwam", "Ryany", "Aldthald", "Leony Rythey",
				"Helmaeg", "Aethert", "Alfgald", "Hrither", "Gere", "Berny", "Cuthsi", "Eadulf", "Athyes", "Hrede", "Gileon Steray", "Symas Porte", "Aercthund", "Robern Hopott", "Wicher", "Hamath", "Warder Norray", "Monder", "Gelbead", "Holew",
				"Gery Thiley", "Vyncis", "Hore" };
		femaleFirstNames = new String[] { "Alerdene", "Alinza", "Aula", "Bach Hien", "Belka", "Beshkee", "Chammady", "Chao", "Do Quyen", "Eshe", "Eudomia", "Gerda", "Hiriko", "Ilinica", "Indah", "Ingirt", "Izora", "Jalket", "Jayazi", "Kaede",
				"Kalizama", "Kamshi", "Lestari", "Leyli", "Marisan", "Me’amesa", "Meilin", "Mirelinda", "Mpaandi", "Nalmida", "Nanya", "Narantuyaa", "Ntisi", "Pasara", "Pontia", "Que Xuan", "Revhi", "Runa", "Sahba", "Shirin", "Shivkah", "Sinkitah",
				"Surenchinua", "Udara", "Umie", "Valki", "Waajida", "Xemne", "Xue", "Zalika", "Zova", "Elen", "Tidhiue", "Witha", "Hilia", "Malia", "Joane", "Earcorn", "Erys", "Ellel", "Ceolburg", "Beatrey", "Kathon", "Enen", "Warieua", "Brime",
				"Suse", "Sane", "Cwena", "Argel", "Tanga", "Brictha", "Brytha", "Touillda", "Wene", "Gifu", "Lyne", "Bethon", "Jane", "Elys", "Huswe", "Sarry", "Phily", "Kather", "Sane", "Cwitha", "Wene", "Breda", "Hone", "Jane", "Joycie", "Wleofwe",
				"Mary", "Burgeua", "Abeth", "Touillda", "Sueta", "Burguia", "Burgiue", "Brytha", "Auciel", "Eomeld", "Aled", "Helburw", "Ausan Hawte", "Sybel", "Aedild", "Breda", "Aevad", "Burga", "Hilde", "Mary", "Hone Balley", "Lene", "Wene",
				"Audreys Parry", "Joycie Vinte", "Egyth", "Cyna", "Gifu", "Burha", "Ecil", "Burhuia", "Gota", "Wynne", "Erys Ferray", "Suse", "Burhe", "Aehild", "Elyn", "Berga", "Aben Porte", "Heahga", "Bryne", "Erix", "Annen", "Eryn", "Elean Hyte",
				"Joane Byne", "Kater", "Rione Byne", "Leoftiue", "Bricta", "Lise", "Kathon", "Wara", "Rione Lipson", "Heswe", "Arran", "Frithiue", "Iden", "Cece", "Bilia Bardaye", "Sybil", "Lyne", "Gythiue", "Aelurg", "Alfild", "Marger", "Eveth",
				"Witha", "Brione", "Brichtru", "Kater Ryde", "Burhuie", "Cecie Eldyll", "Elhurg", "Ealdthrynn", "Ethed", "Mara Ewyn", "Sarry Wythey", "Aelith", "Ealchflead", "Cece Knere", "Efrith", "Abeth", "Coenburh", "Hrethiua", "Ecil Drete",
				"Aethed", "Aben Carley", "Elleth", "Abet", "Eodwynn", "Withiue", "Jane", "Ennell", "Joane Seve", "Bride Lerke", "Edwad", "Heve", "Eryel Cote", "Ealdguiad", "Aelild", "Sybeth", "Earen", "Athell", "Stouilda", "Elel", "Erin", "Elean",
				"Arget", "Mara", "Burgwe", "Sida", "Aldeth", "Heathiue", "Kather", "Elen", "Huna", "Wynna", "Gytha", "Hely", "Wyna", "Elen Knette", "Wlithuia", "Enen", "Lyne Villey", "Enet Wyne", "Lucie Quinte", "Brythiue", "Alin", "Githe", "Sabil",
				"Suse Nyson", "Mery", "Frilda", "Lice Lipsor", "Aenburg", "Coenburg", "Marget Wythey", "Eagen", "Edorn", "Eadet", "Burguia", "Hilda", "Eryel", "Malia", "Bryde", "Wena", "Earad", "Corna", "Malia Rete", "Ethryth", "Aldhild", "Lethuia",
				"Ennel", "Alin Knesell", "Benne", "Arun", "Sunna", "Elys", "Sabeth", "Aenged", "Brictha", "Belia", "Joane", "Eosthryd", "Line", "Eodrun", "Touilta", "Wlankild", "Athel", "Bota", "Wene Payne", "Eafed", "Briga", "Sybenn",
				"Ellyn Folcey", "Frythuie", "Ennen", "Sueta", "Leda", "Alin Wake", "Thilda", "Marey Mythey", "Merey Parre", "Bega", "Waerhe", "Heru", "Britha", "Phery", "Sturga", "Everg", "Auciel", "Goldru", "Elean Cote", "Tona", "Eanchith",
				"Aenbun" };
		
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
