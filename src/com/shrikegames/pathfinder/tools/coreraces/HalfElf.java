package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.NPC;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;
import com.shrikegames.pathfinder.tools.npcgen.utils.DiceUtils;

public class HalfElf extends CoreRace {
	
	public HalfElf() {
		super("Half-elf");
		setStrengthMod(0);
		setDexterityMod(0);
		setConstitutionMod(0);
		setIntelligenceMod(0);
		setWisdomMod(0);
		setCharismaMod(0);
		
		racialTraits.add("Medium");
		racialTraits.add("30 ft");
		racialTraits.add("Elven Immunities");
		racialTraits.add("Adaptability");
		racialTraits.add("Keen Senses");
		racialTraits.add("Low-Light Vision");
		racialTraits.add("Elf Blood");
		racialTraits.add("Multitalented");
		
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
		
		maleFirstNames = new String[] { "Calathes", "Encinal", "Iradli", "Kyras", "Narciso", "Quinray", "Seltyiel", "Zirul", "Audthorn Tradove", "Hilidon Zumhice", "Robdyr Pajor", "Wilnas Reyxidor", "Aalrath Zumvalur", "Emecraes Balhice",
				"Craverel Beiydark", "Hanroth Quifir", "Emqarim Norkalyn", "Garauth Genlee", "Chardithas Gilphyra", "Nicseith Torrona", "Imdriel Virdove", "Vallidyr Torphine", "Gregril Araralei", "Stenis Waesyra", "Henlidyr Virfaren",
				"Wisridan Cailar", "Belfarin Wysagella", "Nikmede Omaran", "Gregnik Kelsys", "Jereis Cartoris", "Jamdeyr Jocan", "Beldil Miravyre", "Hormeron Yinmaer", "Hemlidyr Qinralei", "Ballaeril Vanala", "Chartharal Erzeiros",
				"Ingmede Heinelis", "Ingelgretor Phigella", "Ianlidyr Sarxisys", "Tyrlando Torgwyn", "Lorroth Eilwarin", "Jaqulumin Virsys", "Rafneiros Balsys", "Berladon Wysageiros", "Draleath Ulamys", "Remnaith Bryren", "Lamfalen Nericaryn",
				"Ternall Hermys", "Robparin Keysatra", "Pierduil Xilsatra", "Franzaphir Miakalyn", "Xavnar Ravabella", "Eirqarim Erfina", "Marxiron Xilmaer", "Jarmer Sarlamin", "Aroyeras Naejor", "Pierduil Krisjyre", "Xavlis Heletumal",
				"Balorin Virfina", "Tonor Kelsys", "Perrith Thejor", "Reynall Fenpeiros", "Lancelith Petlen", "Thidar Trisrel", "Gerelor Ravahice", "Jererauth Helegella", "Fulalath Erzeiros", "Eddil Daeroris", "Northil Farxina", "Launben Daneiros",
				"Quoron Shakalyn", "Teodlan Keltoris", "Vicfyr Zumjyre", "Adedeyr Yinjeon", "Greghomin Ralobalar", "Tedkas Zylsandoral", "Mercraes Caikrana", "Eduin Wynzeiros", "Gregtharal Grelen", "Ingnaril Chaeleth", "Ternar Helezumin",
				"Rankas Vabalar", "Jarroth Naephyra", "Robnalor Pasys", "Adasaran Norric", "Salkas Keaynore", "Wislis Adcaryn", "Ingelsaran Trisbalar", "Lamtar Vennan", "Wimindel Ravaren", "Pierlael Leophyra", "Gibalath Xilroris", "Tandal Leokalyn",
				"Lanmorn Adjor", "Franthath Aesalor", "Franrune Qinbalar", "Draovar Cranorin", "Kevqarim Helerieth", "Wymmus Crakian", "Halthil Iarna", "Quobyran Vamyar", "Wymrion Olaynore", "Humavor Elamaer", "Zylryn Cralee", "Sylrynnon Phifiel",
				"Lansaran Daven", "Mauglumin Liarieth", "Simluar Heiric", "Kevsan Zylrieth", "Lancelen Glynzana", "Percitaor Zylharice", "Crisovar Carzumin", "Ritevar Eilgeiros", "Mikavor Loraren", "Panthil Leorieth", "Tanyeras Sarsandoral",
				"Abewin Miamyar", "Elnos Venzana", "Remsin Torynore", "Richindel Keydove", "Gilthath Luxidor", "Abegotin Zumven", "Zanrune Luwynn", "Clerverel Carmenor", "Perciril Iliwraek", "Erminar Dastina", "Pierduin Nordove", "Haltumil Yinxalim",
				"Derellan Xyrtoris", "Reynros Adhorn", "Erlareo Naeynore", "Norduil Olaydark", "Jaqulaeril Ventumal", "Tyrfarin Iaryarus", "Tobmir Krisdan", "Brirune Eiljor", "Gardryn Waesphine", "Victhil Inaphine", "Zanuin Neriquinal",
				"Osparin Zylwenys", "Colduin Zinven", "Laundil Yinven", "Valkoris Balneiros", "Simlamir Elavyre", "Trisidon Crabalar", "Jefgotin Zinlamin", "Donidon Qibalar", "Humneiros Umesandoral", "Zanshor Faephine", "Maugdil Miakrana",
				"Hamparin Qinris", "Vicros Heleqen", "Niknaril Reyberos", "Lorvalor Norcyne", "Contien Venyra", "Nichcraes Dagwyn", "Barlisar Lorathyra", "Pandyr Reyhice" };
		femaleFirstNames = new String[] { "Cathran", "Elsbeth", "Iandoli", "Kieyanna", "Lialda", "Maddela", "Reda", "Tamarie", "Olnoa Adwarin", "Maerleria Carjeon", "Molnandra Umesalor", "Alyshera Beisatra", "Jinria Presydark", "Winstine Zinvaris",
				"Carviel Heinorin", "Iohtora Eilzorwyn", "Sylrue Fasys", "Hewaris Wysabalar", "Libtha Qinkalyn", "Aaltrana Ulasandoral", "Genlone Genfir", "Melidue Wynlynn", "Libthion Yesvalur", "Jesriara Sarkrana", "Kysdyl Wyngeiros",
				"Ivelee Oriro", "Allihn Vaydark", "Quenesra Quiwenys", "Resreene Gremenor", "Elizgalyn Thetoris", "Fhaluna Torxalim", "Nimicca Beiwynn", "Maudrele Beifina", "Zinzee Fenxidor", "Heillia Petharice", "Beatmia Miraleth",
				"Faehophe Waestumal", "Isafarrel Balwenys", "Edeltalia Torcyne", "Aelsala Keazeiros", "Daranys Presric", "Qimia Shacaryn", "Brunlin Zylwynn", "Hawnarra Sylthana", "Zelmanda Leosatra", "Isomara Elagwyn", "Therthana Miralen",
				"Lisleth Morcaryn", "Marbellis Preskalyn", "Yllmaya Genydark", "Cedlenas Jofir", "Meldue Sylra", "Sarnesia Luyarus", "Ellynthi Leorona", "Faeraele Reyric", "Zelhera Hersys", "Janarolia Omaynore", "Yvphenee Reyrieth", "Jenesario Joro",
				"Vicrika Yelroris", "Jilthae Reygella", "Elyenys Aracaryn", "Mahthion Virkalyn", "Jehalayna Qinpetor", "Rohphira Beixidor", "Esnath Wysawraek", "Tefhala Mirawarin", "Libhophe Quiynore", "Iselstine Zylna", "Aleyeth Wynynore",
				"Sareene Vengwyn", "Iselrunia Keyxisys", "Glosevel Keylamin", "Elyennee Daeven", "Mardaerae Phicyne", "Yeslaela Olomyar", "Rosarona Trabalar", "Seradis Grekas", "Maudtarzah Qirie", "Prisianna Ravadan", "Johqwyn Zumrona",
				"Evelmadia Yesharice", "Amenath Yelrora", "Ezavis Elarie", "Alenora Ularen", "Xilrindra Adwenys", "Nikilia Quikrana", "Ninyra Inaydark", "Bicharis Reybanise", "Urilarue Araxisys", "Saratrana Aerora", "Madleth Chaexina",
				"Jessula Wranvaris", "Adniel Bimaer", "Gifwalyn Ilirora", "Tifleth Facaryn", "Vyllurie Raloqirelle", "Evemanda Holaxidor", "Teflitia Farie", "Almedha Zylkrana", "Chrishere Norgeiros", "Ophicaena Beirie", "Myllaevar Danan",
				"Quethion Magydark", "Merenaril Faenelis", "Athrila Quinorin", "Ebnoel Yinharice", "Madnaril Syllynn", "Gloshera Herkian", "Alironyn Inazorwyn", "Qiatha Presvyre", "Ibnaril Ololynn", "Giselrelle Inabella", "Yllyeth Vavalur",
				"Theflossa Yelnan", "Amerona Fenran", "Gwenaerys Cralana", "Norna Miadan", "Winlesse Eiljor", "Halira Wranren", "Hawlena Sharic", "Carrue Virbalar", "Syllesse Beipeiros", "Emlihn Toryarus", "Nindis Caisandoral", "Lilthae Wrankian",
				"Alidue Ellamin", "Orithana Quidi", "Tamshara Reyren", "Elilanis Zinxisys", "Emelrele Nerithyra", "Bynlynn Omarieth", "Gamara Sylgolor", "Sarathana Daren", "Sylwaris Trahorn", "Madlanae Herzumin", "Jeanlisa Ilijyre",
				"Irozira Faezorwyn", "Elyslynor Wranlee", "Kyslahne Enkas", "Anyeth Balmaris", "Joykaala Wysaris", "Crisralla Kelzeiros", "Hasalia Gilkas", "Alrunia Heizorwyn", "Aanlica Carphyra", "Isaheira Phixalim", "Lilnalue Daenelis",
				"Bririara Presnala", "Fhanesra Pathana", "Oririara Reyharice", "MAdenora Daphyra", "Faelanil Zumdove", "Milmere Phijor", "Tyllynna Daeharice", "Tadris Farharice", "Brenleia Errieth", "Hilbellis Norsatra" };
		
	}
	
	@Override
	public void apply(NPC npc) {
		
		int random = (int) (Math.random() * npc.getCoreClass().getSkillsAvailable().size());
		String randomClass = npc.getCoreClass().getSkillsAvailable().get(random);
		npc.getCoreClass().addSkillBonus(randomClass, 3);
		npc.getCoreClass().addSkillBonus("(Wis)Perception", 2);
		
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((5 * 12) + 2, 2, 8);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((5 * 12) + 0, 2, 8);
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
			return CharacterUtils.getRandomWeight(100, 2, 8, 5);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(90, 2, 8, 5);
		}
		return "";
	}
}
