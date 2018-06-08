package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class Dwarf extends CoreRace {
	
	public Dwarf() {
		super("Dwarf");
		setStrengthMod(0);
		setDexterityMod(0);
		setConstitutionMod(2);
		setIntelligenceMod(0);
		setWisdomMod(2);
		setCharismaMod(-2);
		
		racialTraits.add("Medium");
		racialTraits.add("20 ft");
		racialTraits.add("Slow and Steady");
		racialTraits.add("Defensive Training");
		racialTraits.add("Hardy");
		racialTraits.add("Stability");
		racialTraits.add("Greed");
		racialTraits.add("Stonecunning");
		racialTraits.add("Darkvision 60 ft.");
		racialTraits.add("Hatred");
		
		maleFirstNames = new String[] { "Dolgrin", "Grunyar", "Harsk", "Kazmuk", "Morgrym", "Roga", "Gili", "Bari", "Kari", "Zaghark", "Umrag", "Thainarv", "Thrinarv", "Narvi", "Kurda", "Glinarv", "Gili", "Azan", "Fundu", "Urdud", "Glinan", "Gamah",
				"Umrad", "Zuri", "Igin", "Bali", "Iras", "Ukrag", "Zigiml", "Umral", "Gili", "Geda", "Thali", "Sanzir", "Thrakad", "Thrimul", "Disanz", "Azar", "Bali", "Furi", "Froda", "Thrinan", "Ukrar", "Tharkal", "Nanarv", "Bari", "Urin",
				"Nainarv", "Throri", "Dwari", "Askan", "Rumal", "Sanzur", "Rukar", "Mali", "Ziri", "Alin", "Kadu", "Teni", "Bari", "Ukhur", "Rinain", "Hrinbja", "Berglja Eydundson", "Ifin Ennirson", "Baugi", "Throri", "Steinni", "Frodi Asteindrson",
				"Gimli", "Hrami Svigison", "Bali", "Andlaid", "Duri", "Kari", "Hnokkvi", "Kada", "Frazir", "Umraz", "Furi", "Shari", "Thialmi", "Tharkilm", "Ukhun", "Alkail Horgrison", "Orrend Gotison", "Raene", "Eidin Dulfrison", "Sketi", "Ukhlal",
				"Frinarv", "Thorke", "Disanz", "Skrane Finnbason", "Gisle", "Linan", "Hari Landison", "Imun", "Adard", "Gamal", "Heri Thorison", "Gesti", "Alis", "Svifi", "Gili", "Omand Horlison", "Styrki Horgison", "Shunda", "Thuda", "Umral",
				"Turi", "Locki", "Horgri", "Throda", "Khari", "Sanzur", "Almund Hraudrison", "Alvir", "Undin", "Eyrkakr", "Heri Geitison", "Gasvi", "Hrimi", "Amad", "Thriari", "Bjorni Thavveson", "Shimah", "Bardri", "Hraedi Aranson", "Khudu",
				"Narvi", "Irir", "Mingi Kolbjuson", "Fari", "Olin", "Gauti", "Frinain", "Odnig", "Bifund", "Leikri", "Thrumin", "Ukaz", "Akak", "Unnvand", "Hurgi", "Thori", "Hroaldri", "Gini Amkerson", "Halle", "Ivar Evardson", "Horgi Horkeson",
				"Hoski", "Horge", "Aznan", "Trelli", "Asmulfr", "Veini", "Grane Thireson", "Altir", "Holdba", "Urin", "Ziri", "Udlar", "Arar", "Otilfr", "Duli", "Bori", "Hnolfi", "Gari Gauteson", "Samre Gefeson", "Shatelch", "Alpher Skakleson",
				"Leifi", "Geirie", "Beini", "Hrygvi Baldvison", "Thugi Aundirson", "Gudre Sivison", "Khali", "Thainan", "Akat", "Dwari", "Gedu", "Gwari", "Arin", "Sumi", "Azan", "Albrid", "Zigil", "Otulf", "Thrinan", "Hori", "Lifste Orkerthson",
				"Asolf Herison", "Banarv", "Aghar", "Mahark", "Asbjorn", "Vifi", "Geri", "Khatelch", "Thrinarv", "Bardi Askelson", "Aisleinnr", "Alil", "Geda", "Zaghark", "Mundri Adbakkrson", "Modi", "Arund", "Umras", "Kali", "Geiri", "Dainarv",
				"Tharkal", "Estgein Thorwarson", "Goffi", "Agif", "Maki Gerison", "Sigvi Vidfison", "Sudri", "Aral", "Dwali", "Imlin", "Rinan", "Thorward Hrikison", "Thaugre", "Thrazagh", "Etir", "Kela", "Hrosle", "Randi", "Gosli Horison", "Dari",
				"Umrak", "Horfri", "Viri", "Efrer", "Kheli", "Teini", "Dainan", "Gari", "Pire", "Ahat", "Altid", "Gamul", "Otken", "Serki", "Hrani", "Gudle", "Ukhlas", "Ukan", "Sigi", "Tjosti", "Nainarv", "Runa Hallason" };
		femaleFirstNames = new String[] { "Agna", "Bodill", "Ingra", "Kotri", "Rusilka", "Yangrit", "Ukhlal", "Kada", "Dwali", "Banain", "Fari", "Thakurd", "Loinain", "Arrar", "Aban", "Grinarv", "Gili", "Telchark", "Bari", "Sanzir", "Zaghain",
				"Thrinan", "Kada", "Banan", "Shali", "Fari", "Khatur", "Ziged", "Kilmin", "Thrinan", "Gili", "Bori", "Kari", "Azar", "Arvin", "Gedu", "Alin", "Sanzir", "Ugmar", "Kurda", "Ukras", "Gimli", "Arim", "Geda", "Khunda", "Banain",
				"Glatelch", "Duri", "Throda", "Bori", "Khakun", "Ahag", "Kilmin", "Duli", "Thari", "Arraz", "Ingerdg", "Sanzir", "Khali", "Horhe", "Frazig", "Arel Uscastdotr", "Rida", "Asgerdg Horidotr", "Turi", "Narvi", "Umund", "Bifur",
				"Gere Udreyardotr", "Ginla", "Jorga Modidotr", "Aldildg", "Gamal", "Jafla", "Gamul", "Thildga Gautridotr", "Dwoinain", "Thoreya", "Akal", "Gega", "Sigga", "Gynga", "Dinan", "Amil", "Dwari", "Gedu", "Kilmal", "Gerdga", "Borghe",
				"Ingild", "Vaga Horidotr", "Ridga", "Thilde", "Runga", "Undin", "Khori", "Frida Axirdotr", "Alin", "Telchar", "Ogneth", "Ederdg", "Thari", "Arran", "Ridga Ohtheldotr", "Kali", "Albokkg Gudridotr", "Frinarv", "Graga", "Allag", "Algel",
				"Usidg", "Uril", "Urur", "Arul", "Nainarv", "Frinain", "Thainan", "Agneg", "Thali", "Sela", "Geda", "Horda", "Sigra", "Hidga Arkafdotr", "Hallborgg Thoredotr", "Helga Hemidotr", "Saga Mundidotr", "Theli", "Atund", "Bori",
				"Ifugg Hrappidotr", "Rithe Sigbadotr", "Bari", "Rukam", "Kunain", "Ingethg", "Akat", "Gili", "Sueuilda Horgidotr", "Borgga", "Horva", "Duli", "Throinain", "Frodu", "Anag Kaklidotr", "Gloinain", "Illaunng Lifidotr", "Svigga", "Muli",
				"Gwali", "Thrazir", "Aerild", "Igris", "Dinain", "Hildra Beitidotr", "Raga", "Kadu", "Gjorga Gudlidotr", "Thildga Sigwithdotr", "Thorkatl Imardotr", "Kurdu", "Banan", "Solva", "Khatur", "Otag Andindotr", "Latelch", "Bifar",
				"Thialpga", "Aslaugg", "Olmfrild", "Thilda", "Astrid", "Hilda", "Doreya", "Disga", "Ingeg Hedidotr", "Gaga", "Sigra Sigedotr", "Svorga Theridotr", "Duri", "Dainarv", "Rede", "Urdul", "Ukhud", "Herve", "Kari", "Thrinarv",
				"Sigra Secgidotr", "Adorg", "Ageg Havvidotr", "Olveg Geiridotr", "Grinan", "Itag Hramidotr", "Innag Adalvdotr", "Gifu", "Groda", "Fari", "Sanzur", "Laga", "Umrar", "Laga Gimidotr", "Dwoinan", "Bali", "Ukhlat", "Hyra", "Anzin",
				"Gunnhe", "Kharkurd", "Loinan", "Bergthe", "Bjaga", "Thrinain", "Rinain", "Thrinan", "Zuri", "Ukhlag", "Maga", "Oddbjotg", "Fundu", "Thaga", "Alfith", "Odag", "Herda", "Thunda", "Khainan", "Hora Audifrdotr", "Ukral", "Kurda", "Gimli",
				"Kamin", "Tharkad", "Diga", "Efnag", "Gerdga Herridotr", "Ingeg", "Ukhlar", "Fastve", "Gwari", "Aveg", "Ottag", "Gudfu Kolidotr", "Giga", "Urin", "Thimin", "Gela Katidotr", "Gunrga Hornidotr", "Glili", "Otag", "Adreng", "Alvidg",
				"Umur", "Kada", "Addild", "Ynjag", "Anag Friktedotr", "Glimin" };
		
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((3 * 12) + 9, 2);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((3 * 12) + 7, 2);
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
			return CharacterUtils.getRandomWeight(150, 2, 4, 7);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(120, 2, 4, 7);
		}
		return "";
	}
}
