package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.NPC;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;
import com.shrikegames.pathfinder.tools.npcgen.utils.DiceUtils;

public class HalfOrc extends CoreRace {
	
	public HalfOrc() {
		super("Half-orc");
		setStrengthMod(0);
		setDexterityMod(0);
		setConstitutionMod(0);
		setIntelligenceMod(0);
		setWisdomMod(0);
		setCharismaMod(0);
		
		racialTraits.add("Medium");
		racialTraits.add("30 ft");
		racialTraits.add("Intimidating");
		racialTraits.add("Orc Ferocity");
		racialTraits.add("Darkvision 60 ft.");
		racialTraits.add("Orc Blood");
		
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
		
		maleFirstNames = new String[] { "Ausk", "Davor", "Hakak", "Kizziar", "Makoa", "Nesteruk", "Tsadok", "Gramanars", "Kuruz", "Hononur", "Mugad", "Garegall", "Tharezar", "Asidak", "Nutur", "Orazur", "Agguz", "Dedash", "Sudak", "Thramar",
				"Urthidim", "Zasadall", "Borotir", "Honugar", "Makomur", "Muken", "Zarirsh", "Uramar", "Malaglar", "Gromudar", "Kulorimm", "Dorurash", "Grersh", "Gromadak", "Koragur", "Arnegash", "Kuroburk", "Zavudar", "Lumobash", "Sagur", "Ronerim",
				"Ronobar", "Cutur", "Gorumash", "Orodar", "Trakun", "Kalagul", "Haronur", "Olligar", "Tedark", "Arorsh", "Hururash", "Huran", "Han", "Baregall", "Dradall", "Kilask", "Sororth", "Crarak", "Karabur", "Dogak", "Zarugall", "Atamar",
				"Ullugar", "Rekiburk", "Damash", "Zevag", "Zurugur", "Atrurall", "Tog", "Mukumir", "Tanunars", "Haz", "Kuludall", "Nudur", "Durozar", "Tagur", "Mogun", "Brakedurk", "Gugar", "Urthagak", "Ulluruk", "Drabar", "Haragur", "Thararsh",
				"Makunars", "Zoridash", "Thudash", "Zaug", "Tharomir", "Thamir", "Gramodark", "Duranars", "Mukabark", "Gnaodar", "Hagid", "Gorumir", "Asagak", "Ged", "Hagin", "Dorurimm", "Oguuz", "Zavonars", "Zusurth", "Trukozur", "Therabash",
				"Brumar", "Ugobak", "Grimutar", "Ukragall", "Gnaurash", "Zusudark", "Tharomak", "Kometar", "Ronaubash", "Bom", "Agubark", "Therarimm", "Hunazall", "Baretir", "Garomar", "Zasodim", "Zusitir", "Grimorash", "Ronubar", "Gotorsh",
				"Trukidurk", "Makobash", "Throgark", "Grudall", "Mokuzur", "Urtrask", "Saroburk", "Atrunur", "Mugudak", "Mugemur", "Urthorth", "Hanebar", "Dorigar", "Kaburk", "Makirall", "Theragar", "Thrim", "Urobur", "Gorurim", "Kurumak", "Grutir",
				"Zurudak", "Ronaugak", "Aggutir", "Durotur", "Grimibar", "Zamak", "Mukatir", "Mahlunar", "Magagash", "Honedur" };
		femaleFirstNames = new String[] { "Canan", "Drogheda", "Goruza", "Mazon", "Shirish", "Tevaga", "Zeljka", "Kotitah", "Sunotur", "Tamoti", "Gajezara", "Gryugu", "Shayigh", "Ootedar", "Rawenir", "Gariner", "Rasimira", "Rohketi", "Shugu",
				"Kotagum", "Nasha", "Fulenchu", "Lageri", "Senetar", "Shone", "Ootemira", "Brud", "Sunigur", "Ubagume", "Merami", "Kategu", "Ekosha", "Zenogar", "Aruner", "Zenonar", "Folomira", "Gyniral", "Meritur", "Seniki", "Kerari", "Sotur",
				"Umagume", "Sumagur", "Rohkasha", "Sumodar", "Gijoki", "Sinogar", "Falonur", "Ketuki", "Temagar", "Rohed", "Sanomira", "Felani", "Rahodur", "Tuomur", "Tamagu", "Umunur", "Zunezura", "Ubaz", "Rashinir", "Mirida", "Karadar", "Tumaner",
				"Puyuwar", "Rohome", "Sanatar", "Zaniz", "Tuidar", "Ruz", "Samanur", "Rohunar", "Puyimi", "Gryoda", "Sanitir", "Kurinar", "Bruzura", "Kutonar", "Sanogar", "Tumome", "Gryirel", "Merari", "Fulonchu", "Kotidar", "Tamigum", "Rawerook",
				"Samatah", "Sozar", "Rasugume", "Nimi", "Rohkesh", "Groner", "Temashi", "Sanedar", "Folini", "Areme", "Uminir", "Ekosha", "Gagri", "Rahamira", "Rasimar", "Karoti", "Gyninchu", "Koterook", "Gorori", "Saminar", "Karamar", "Ketuki",
				"Karozur", "Shayene", "Elotur", "Zenonur", "Zonome", "Sumogume", "Puyemar", "Rashishi", "Kiregur", "Sinanchu", "Gajogri", "Gorook", "Moradur", "Rinchu", "Katitur", "Tuagum", "Alinur", "Gazar", "Folati", "Goruwar", "Sinidar",
				"Ketozara", "Elegum", "Falezura", "Tumazura", "Kirizira", "Meragum", "Nagu", "Tumig", "Zenagume", "Gijugum", "Sinogume", "Ekotur", "Gijada", "Urod", "Gijome", "Zoninur", "Mirishi", "Ekadur", "Rohigri", "Katotur", "Zanini", "Zenazara",
				"Kirimi", "Falarook", "Gajome", "Bridar", "Feligh", "Temotah", "Briwar" };
	}
	
	@Override
	public void apply(NPC npc) {
		npc.getCoreClass().addSkillBonus("(Cha)Intimidate", 2);
		
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((4 * 12) + 10, 2, 12);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((4 * 12) + 5, 2, 12);
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
			return CharacterUtils.getRandomWeight(150, 2, 12, 7);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(110, 2, 12, 7);
		}
		return "";
	}
}
