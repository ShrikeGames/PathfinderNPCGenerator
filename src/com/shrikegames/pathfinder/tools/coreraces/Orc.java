package com.shrikegames.pathfinder.tools.coreraces;

import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class Orc extends CoreRace {
	
	public Orc() {
		super("Orc");
		setStrengthMod(4);
		setDexterityMod(0);
		setConstitutionMod(0);
		setIntelligenceMod(-2);
		setWisdomMod(-2);
		setCharismaMod(-2);
		racialTraits.add("Medium");
		racialTraits.add("30 ft");
		racialTraits.add("Ferocity");
		racialTraits.add("Darkvision 60 ft.");
		racialTraits.add("Light sensitivity");
		
		maleFirstNames = new String[] { "Arkus", "Carrug", "Felzak", "Murdut", "Prabur", "Luga", "Orcog", "Bolga", "Muzga", "Lukil", "Baluk", "Balcmuzg", "Uglurtz", "Mega", "Grat", "Agral", "Boldog", "Ugluk", "Ugdul", "Baga", "Snakhagr", "Gashak",
				"Golugd", "Bulagd", "Rat", "Gorkil", "Gashagr", "Adbug", "Balcmeg", "Alcmeg", "Bolduf", "Ufthal", "Shakil", "Boldush", "Lagdog", "Orbakh", "Lagduf", "Mauhak", "Grodog", "Balagd", "Agdul", "Oldog", "Golfimb", "Gashur", "Snaga",
				"Othrog", "Orbal", "Gorbul", "Orgog", "Olfil", "Golagd", "Uglug", "Oldol", "Uhul", "Gorbold", "Lurtzog", "Rodush", "Agrak", "Bulugd", "Gorbal", "Ufthag", "Ufthakh", "Ugdug", "Agrat", "Golurtz", "Orkil", "Ufthat", "Mauhur", "Gorbug",
				"Agdug", "Shurod", "Grishnakh", "Roduf", "Rodog", "Lugdog", "Uhur", "Shagrishn", "Shurishn", "Lugduf", "Ugdur", "Lagdush", "Uhug", "Bulug", "Balcmauh", "Buga", "Gorga", "Radbolg", "Mauhagr", "Gradbag", "Orbash", "Balugd", "Gorbag",
				"Lugdush", "Uzgash", "Orbat", "Balurtz", "Adbuf", "Snakhak", "Balug", "Buluk", "Othrol", "Rishnag", "Agduk", "Grishnag", "Oldod", "Agakh", "Grodush", "Ugduk", "Radbalcm", "Gorbolg", "Shurat", "Orbak", "Agdush" };
		femaleFirstNames = new String[] { "Durra", "Grillgiss", "Ilyat", "Krugga", "Leffit", "Olbin", "Trisgrak", "Orcog", "Uglug", "Golagd", "Golfimb", "Lugdog", "Boldush", "Buga", "Rishnag", "Shagradb", "Lurtzog", "Lagdog", "Gashak", "Grishnag",
				"Snaga", "Golug", "Gorbag", "Gorga", "Oldol", "Mauhak", "Bolga", "Lagduf", "Gashagr", "Uglush", "Adbuk", "Balurtz", "Lagdush", "Gradbul", "Rat", "Gorkil", "Agduk", "Baga", "Lukil", "Radbul", "Uglul", "Snakhur", "Rodush", "Mauhagr",
				"Mega", "Gradbag", "Ufthal", "Gashur", "Ugdug", "Olfil", "Bolduf", "Muzga", "Shurat", "Orgog", "Shurishn", "Obakh", "Balcmeg", "Bulug", "Orbash", "Gorbal", "Ufthash", "Gorbalcm", "Shuradb", "Mauhur", "Snakhak", "Balug", "Uhug",
				"Uzgat", "Luga", "Uglur", "Uzgal", "Gorbold", "Baluk", "Balagd", "Adbug", "Othrog", "Ugdurtz", "Shakil", "Orgolg", "Buluk", "Ugdur", "Orgod", "Balugd", "Shagrod", "Bulurtz", "Bulugd", "Balcmauh", "Orkil", "Lugdush", "Agrakh",
				"Radbal", "Gradbalcm", "Orcol", "Rodog", "Othrolg", "Ufthag", "Ufthat", "Lugduf", "Shurod", "Ufthakh", "Rishnakh", "Orbak", "Uhuk", "Agduf", "Alcmeg", "Uhur", "Orgol", "Uzgakh", "Grodush", "Rat", "Lurtzog", "Agat", "Gashak", "Grodog",
				"Othrol", "Shurat", "Uzgash", "Obash", "Gorga", "Lagdog", "Golfimb", "Gashur", "Lugduf", "Lagdush", "Grat", "Lugdog", "Snakhagr", "Ugduf", "Muzga", "Uhug", "Gorbag", "Uhuk", "Shagrat", "Luga", "Gorbug", "Bulagd", "Bolga", "Agak",
				"Gorkil", "Balcmauh", "Gashagr", "Mauhak", "Buga", "Balug", "Lagduf", "Mauhagr", "Lukil", "Obat", "Adbush", "Gorbul", "Gradbolg", "Balcmeg", "Oldod", "Buluk", "Rodush", "Balugd", "Lugdush", "Orcod", "Shakil", "Uhur", "Mega", "Gorbal",
				"Golagd", "Uglur", "Radbalcm", "Golurtz", "Alcmeg", "Gorbolg", "Golug", "Snaga", "Agral", "Ufthal", "Groduf", "Ugluf", "Agrag", "Uhul", "Agrak", "Uzgag", "Bulug", "Orbat", "Ufthag", "Radbul", "Snakhur", "Bulugd", "Boldog", "Orgog",
				"Mauhur", "Shagrod", "Obakh", "Snakhak", "Orcol", "Baga", "Radbold" };
	}
	
	@Override
	public String getRandomHeight(String gender) {
		String baseGender = gender;
		if (baseGender.equals("Other")) {
			baseGender = CharacterUtils.randomBaseGender();
		}
		
		if (baseGender.equals("Male")) {
			return CharacterUtils.getRandomHeight((5 * 12) + 1, 2, 12);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomHeight((4 * 12) + 9, 2, 12);
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
			return CharacterUtils.getRandomWeight(160, 2, 12, 7);
		} else if (baseGender.equals("Female")) {
			return CharacterUtils.getRandomWeight(120, 2, 12, 7);
		}
		return "";
	}
}
