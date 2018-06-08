package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.NPC;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class Elf extends CoreRace {
	
	public Elf() {
		super("Elf");
		setStrengthMod(0);
		setDexterityMod(2);
		setConstitutionMod(-2);
		setIntelligenceMod(2);
		setWisdomMod(0);
		setCharismaMod(0);
		
		racialTraits.add("Medium");
		racialTraits.add("30 ft");
		racialTraits.add("Elven Immunities");
		racialTraits.add("Keen Senses");
		racialTraits.add("Elven Magic");
		racialTraits.add("Low-Light Vision");
		
		maleFirstNames = new String[] { "Caladrel", "Heldalel", "Lanliss", "Meirdrarel", "Seldlon", "Talathel", "Variel", "Zordlon", "Pengali", "Curethil", "Elurel", "Alan", "Maeglinduil", "Aldir", "Golenwe", "Galure", "Finasaer", "Ados", "Aldor",
				"Galdire", "Elenel", "Findore", "Armingor", "Odrebril", "Cirdore", "Amdithin", "Eglin", "Eneler", "Duilure", "Armirel", "Mothilbor", "Enelel", "Eleneg", "Herodor", "Alanduin", "Tata", "Amros", "Argoror", "Curanthald", "Gonore",
				"Anon", "Miresta", "Earfildos", "Alaldon", "Ilireg", "Cirdili", "Egnoroth", "Eohimir", "Curoduil", "Elerdhil", "Finethald", "Indeled", "Glegolfinr", "Finwindor", "Emmirel", "Celemmir", "Latheli", "Finare", "Pillie", "Enwecthel",
				"Galure", "Ferda", "Bure", "Denba", "Emac", "Muilla", "Celegon", "Fochli", "Blobre", "Masa", "Bore", "Cuthli", "Eleston", "Gimlorfing", "Elmin", "Sici", "Lungonarf", "Legildir", "Caedmi", "Ellil", "Comme", "Milador", "Laune",
				"Egalar", "Lache", "Areled", "Domi", "Cela", "Athgen", "Maglia", "Dure", "Domne", "Adduid", "Inwestos", "Onweleth", "Celungal", "Cealli", "Caoilta", "Gormaegli", "Cogi", "Egnorod", "Saerineth", "Aecan", "Fithe", "Dirodel", "Mila",
				"Gonore", "Celorfin", "Nachi", "Aradhond", "Belinarf", "Ealier", "Lodheli", "Cosa", "Cune", "Summe", "Subse", "Milindir", "Germi", "Gelmalgal", "Eledhror", "Pengoli", "Thinerdhald", "Duni", "Celadhon", "Anthir", "Rone", "Laduili",
				"Fingildan", "Adon", "Irgren", "Arvin", "Feidle", "Mirendor", "Tadgo", "Galegal", "Cinti", "Corbe", "Gonethin", "Daighre", "Galmaegli", "Amror", "Eomal", "Mionaeli", "Conu", "Abram", "Oron", "Dorondior", "Bella", "Mironwe", "Tane",
				"Pengonael", "Celtchui", "Onwel", "Aelin", "Golore", "Ildoth", "Cainne", "Bodvi", "Tici", "Ingolas", "Galmionerdh", "Cate", "Midhu", "Dire", "Thrahire", "Goladuil", "Ealail", "Gene", "Legilden", "Conda", "Bana", "Saerodir", "Elror",
				"Galdire", "Dorinael", "Brocmi", "Adan", "Gone", "Lemmothing", "Lunni", "Cracha", "Dola", "Anad", "Feanaeli", "Ebrinad", "More", "Ilir", "Celure", "Galador", "Guilioneth", "Curesta", "Seni", "Anthindeth", "Foicha", "Nane", "Finwe",
				"Arahtar", "Anoron", "Magli", "Cuni", "Leddfai", "Pengali", "Feanethon", "Alior", "Gonaeli", "Celinas", "Enelror", "Gome", "Finarfinw", "Maile", "Hineli", "Aldon", "Molli", "Denaeli", "Ciana", "Armir", "Penlasaer", "Elrod", "Elroth",
				"Milinar", "Inror", "Turgonor", "Minarfin", "Mide", "Ciabhu", "Diane", "Magla", "Vorophald", "Dorahil", "Gospa", "Inel", "Mala", "Finne", "Celeguil", "Olod", "Lorosaer", "Galadior", "Maeglathel", "Moenga", "Solle", "Gildeli",
				"Adduig", "Legolfing", "Iredhros", "Connle", "Illan", "Gaidha", "Mudda", "Lodhere", "Mirodre", "Eoban", "Macba", "Cumma", "Morio", "Hirandan", "Elerdhin", "Comgi" };
		femaleFirstNames = new String[] { "Amrunelara", "Dardlara", "Faunra", "Jathal", "Merisiel", "Oparal", "Soumral", "Tessara", "Yalandlara", "Serellye", "Nerdanye", "Adrierwel", "Inyellas", "Altalan", "Anen", "Serinde", "Ellaltas", "Mithrinde",
				"Nellebrie", "Ebrian", "Alwel", "Lalwingal", "Elyen", "Inyen", "Arien", "Serielye", "Elwimroth", "Nelaser", "Nimrode", "Elwis", "Arwel", "Laserie", "Gilmarie", "Ealoth", "Finduilye", "Tanerde", "Niserie", "Celaser", "Galadrie",
				"Ellas", "Endellas", "Erinduing", "Imlotel", "Imen", "Eanimroth", "Niserie", "Endel", "Imroden", "Erinyen", "Galebrie", "Altanis", "Galalwe", "Nerwingilm", "Idrindis", "Mirielye", "Nerde", "Findiser", "Irinden", "Nimrellye",
				"Idrindith", "Keelta", "Dicca", "Irien", "Gula", "Caelia", "Vaca", "Naisa", "Nelote", "Laserie", "Edhendel", "Enderil", "Aiccath", "Nelebrie", "Ithrenel", "Aicenn", "Thira", "Ealweldan", "Mithrime", "Ilan", "Atiel", "Cora", "Cathna",
				"Anellas", "Ceithla", "Dealbha", "Deocha", "Cuilla", "Edir", "Serime", "Mona", "Idrimis", "Anen", "Ianath", "Betha", "Nerdiser", "Vole", "Findalye", "Minimlye", "Mori", "Edheris", "Mora", "Brita", "Finda", "Luthienye", "Sala",
				"Aninduis", "Imel", "Dara", "Trica", "Gilmithrie", "Vera", "Gilmarie", "Tiabha", "Iriel", "Ebrialwel", "Nelye", "Amas", "Indel", "Nerde", "Cotta", "Mithrianye", "Sane", "Udix", "Ebrias", "Brixa", "Nelaser", "Aninyen", "Endeldan",
				"Adrien", "Findiser", "Caelao", "Idriris", "Ionath", "Nellaser", "Alarwen", "Nimluthien", "Derge", "Bari", "Bara", "Ticca", "Serellye", "Erith", "Beara", "Tanelye", "Eatis", "Nelothien", "Galaser", "Gwinne", "Boada", "Erdariel",
				"Luage", "Mana", "Induindis", "Luchri", "Laina", "Ithler", "Hlocha", "Fianneu", "Brissa", "Eariel", "Altas", "Faisa", "Nerdelye", "Cena", "Induis", "Ellatien", "Marellye", "Sene", "Leri", "Arwelel", "Marime", "Enelyel", "Lenna",
				"Aicawst", "Tate", "Udir", "Tuga", "Nimlenwe", "Brila", "Faila", "Daalne", "Nimrielye", "Sana", "Lainia", "Aloten", "Elel", "Imlotel", "Serie", "Induilas", "Maera", "Aixad", "Ticia", "Deorgra", "Malla", "Endel", "Forna", "Uman",
				"Sabra", "Nata", "Velda", "Inndeath", "Lenia", "Icer", "Arienwel", "Imellas", "Aloden", "Edhel", "Candia", "Ealariel", "Groma", "Cardia", "Fianna", "Sinna", "Elyenwel", "Serinde", "Nimlothel", "Nimlebrie", "Nimluthel", "Inalb",
				"Lera", "Mallia", "Alwel", "Lendua", "Alwen", "Fiannia", "Einnan", "Media", "Ilarien", "Ladrielye", "Liba", "Hlochi", "Therna", "Alas", "Lida", "Lena", "Serielye", "Cillai", "Rhuma", "Gilminye", "Sata", "Arielel", "Findelye", "Enden",
				"Ixach", "Dixa", "Snatu", "Saba", "Nidda", "Nimrellye", "Nerwenye", "Niserie", "Imloten", "Ufoch", "Erwel", "Nimlaser", "Eltan", "Vercha", "Lothelye", "Galebrie" };
	}
	
	@Override
	public void apply(NPC npc) {
		
		npc.getCoreClass().addSkillBonus("(Wis)Perception", 2);
		
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((5 * 12) + 4, 2, 8);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((5 * 12) + 4, 2, 6);
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
			return CharacterUtils.getRandomWeight(110, 2, 8, 3);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(90, 2, 8, 3);
		}
		return "";
	}
}
