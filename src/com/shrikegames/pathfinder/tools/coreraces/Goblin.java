package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.NPC;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class Goblin extends CoreRace {
	
	public Goblin() {
		super("Goblin");
		setStrengthMod(-2);
		setDexterityMod(4);
		setConstitutionMod(0);
		setIntelligenceMod(0);
		setWisdomMod(0);
		setCharismaMod(-2);
		racialTraits.add("Small");
		racialTraits.add("30 ft");
		racialTraits.add("Skilled");
		racialTraits.add("Fast Movement");
		racialTraits.add("Darkvision 60 ft.");
		
		maleFirstNames = new String[] { "Boorgub", "Chuffy", "Churkus", "Drubbus", "Gawg", "Ghorg", "Gogmurch", "Irnk", "Kavak", "Lunthus", "Mogmurch", "Mogawg", "Murch", "Nurpus", "Pogus", "Poog", "Ronk", "Rotfoot", "Unk", "Vogun", "Zobmaggle",
				"Zord", "Crakz", "Iact", "Jaakt", "Joig", "Glerk", "Gneazgiagz", "Wasmarm", "Brygneark", "Wiamvuits", "Wytbolx", "Cleasz", "Okt", "Srard", "Klonk", "Esz", "Zoirbasz", "Blagneec", "Plaamzulb", "Gebtong", "Bozmilx", "Ghok", "Keff",
				"Chun", "Dresh", "Kroumis", "Ongben", "Nudzurk", "Kotvorg", "Muvnadrab", "Bindomgob", "Driz", "Nab", "Bin", "Bernk", "Narda", "Wurgu", "Oadge", "Nogva", "Kadzobmarg", "Rumzorgerk", "Zash", "Bork", "Fleb", "Nert", "Wumbink",
				"Ghavdert", "Voudra", "Chibnu", "Irguvga", "Ghovgardo", "Jert", "Chorch", "Junk", "Won", "Chugbo", "Ragmub", "Drotgirt", "Nargord", "Kobzindek", "Nemedzurch", "Purk", "Purk", "Kink", "Girnk", "Droarpus", "Wogdard", "Goovgo",
				"Govdurg", "Rangoudzord", "Zurpagglarnk", "Ghork", "Wiz", "Gheb", "Drig", "Drugglart", "Untha", "Bavmub", "Magnus", "Norsotgon", "Gagevnord", "Mash", "Resh", "Joush", "Voort", "Arpug", "Banglurg", "Krargib", "Namkon", "Chotfumba",
				"Gatgebbuwg", "Wash", "Veg", "Geb", "Perg", "Nadrard", "Guntherch", "Notgawg", "Choangek", "Nenthoardork", "Drutvuvmonk", "Zeb", "Kank", "Nord", "Bot", "Drunvas", "Itgurch", "Poodguk", "Jubne", "Chindarkaff", "Krunvaggla", "Kon",
				"Chirk", "Rirnk", "Nirch", "Poagbeg", "Drouffoo", "Navgub", "Rungob", "Addugglo", "Mobzoortou", "Karg", "Chun", "Krart", "Ghus", "Choudouz", "Drourtus", "Gurpo", "Adgu", "Otvagon", "Krugurpowg", "Zank", "Nurt", "Krurk", "Rosh",
				"Nuvmert", "Kavgurt", "Ghadrerch", "Bangboat", "Ghubrougtit", "Kundebzorch", "Barch", "Chork", "Pet", "Larnk", "Zirsenk", "Midu", "Kugbit", "Jursak", "Vegvebna", "Rovmagdart" };
		femaleFirstNames = new String[] { "Aka", "Chee", "Fevva", "Geedra", "Goomluga", "Gretcha", "Hoglob", "Janka", "Klongy", "Luckums", "Lupi", "Medge", "Namby", "Olba", "Rempy", "Reta", "Ruxi", "Vruta", "Yalla", "Ziku", "Rurboo", "Chudkok",
				"Pollouh", "Yetcho", "Ghambush", "Ukle", "Fashinga", "Grulbinche", "Hotlostol", "Noophotas", "Goaxo", "Aske", "Yirko", "Adkun", "Klotrok", "Noukens", "Hodgango", "Pockelgob", "Gavvophlush", "Estorduk", "Ghaglou", "Arko", "Kloambash",
				"Vumlu", "Ukme", "Yaketh", "Omloonchins", "Hemkosku", "Puglago", "Ekchanchun", "Goandeh", "Mimdu", "Judresh", "Anga", "Mekko", "Gholvish", "Alvatchou", "Graglekeb", "Vuxodnoas", "Jilvoapi", "Vombuth", "Lindas", "Joongo", "Kloogla",
				"Zugnoa", "Zokla", "Zoparblo", "Akmolde", "Ruknarble", "Chaphlomru", "Charkak", "Imlans", "Ghumra", "Groovvoa", "Handi", "Klarko", "Yousamda", "Groskorkuns", "Klashonke", "Vutrorbash", "Emra", "Inku", "Hodkons", "Gotlush", "Orbo",
				"Handi", "Oarkike", "Ralvarblu", "Vekmednuk", "Yeknokna", "Odnu", "Ghurda", "Zumlub", "Nodki", "Groompu", "Juckob", "Houllotra", "Hiknagle", "Vrolvovva", "Oktidlo", "Grakle", "Ate", "Yurkoa", "Gromdath", "Ullo", "Osti", "Ghakturgo",
				"Choadlombe", "Ghiphrassu", "Ladgupo", "Mekchu", "Foglek", "Vroulko", "Jugnu", "Kludgab", "Vrurdans", "Chomrerblu", "Ondimkih", "Lugurdash", "Klitchudlu", "Adno", "Ghuvva", "Ashe", "Mardins", "Lumdu", "Roadlu", "Zorbomlu",
				"Yeskoaglu", "Galdephroosh", "Klellakmi", "Gastush", "Ophlins", "Yurbish", "Vrimpa", "Nisath", "Ollo", "Egnednu", "Chephutlosh", "Alvaphrus", "Japhroaldo", "Vomlo", "Ghimbu", "Arblul", "Ghumkak", "Nuphre", "Zushab", "Rorbadle",
				"Nudgovvah", "Vradlanka", "Vrigloapoo", "Unchil", "Ghugni", "Lulbu", "Jipa", "Ghurblal", "Unchi", "Andumkin", "Zumboldon", "Ghotlegmus", "Atchilli", "Gapik", "Vuxu", "Unbuth", "Charga", "Outou", "Odru", "Ulgenbal", "Olvumdo",
				"Fomdadrooh", "Motoukno" };
	}
	
	@Override
	public void apply(NPC npc) {
		npc.getCoreClass().addSkillBonus("(Dex)Ride", 4);
		npc.getCoreClass().addSkillBonus("(Dex)Stealth", 8);
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
