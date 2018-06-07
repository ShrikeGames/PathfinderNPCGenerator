package com.shrikegames.pathfinder.tools.npcgen.utils;

import java.util.ArrayList;

import com.shrikegames.pathfinder.tools.coreclasses.Adept;
import com.shrikegames.pathfinder.tools.coreclasses.Aristocrat;
import com.shrikegames.pathfinder.tools.coreclasses.Commoner;
import com.shrikegames.pathfinder.tools.coreclasses.CoreClass;
import com.shrikegames.pathfinder.tools.coreclasses.Expert;
import com.shrikegames.pathfinder.tools.coreclasses.Warrior;
import com.shrikegames.pathfinder.tools.coreraces.CoreRace;
import com.shrikegames.pathfinder.tools.coreraces.Dwarf;
import com.shrikegames.pathfinder.tools.coreraces.Elf;
import com.shrikegames.pathfinder.tools.coreraces.Gnome;
import com.shrikegames.pathfinder.tools.coreraces.Goblin;
import com.shrikegames.pathfinder.tools.coreraces.HalfElf;
import com.shrikegames.pathfinder.tools.coreraces.HalfOrc;
import com.shrikegames.pathfinder.tools.coreraces.Halfling;
import com.shrikegames.pathfinder.tools.coreraces.Human;
import com.shrikegames.pathfinder.tools.coreraces.Orc;
import com.shrikegames.pathfinder.tools.feats.Feat;
import com.shrikegames.pathfinder.tools.feats.GreatFortitude;
import com.shrikegames.pathfinder.tools.feats.ImprovedInitiative;
import com.shrikegames.pathfinder.tools.feats.IronWill;
import com.shrikegames.pathfinder.tools.feats.LightningReflexes;
import com.shrikegames.pathfinder.tools.feats.Toughness;

public class CharacterUtils {
	private static ArrayList<CoreClass> coreClasses = new ArrayList<CoreClass>();
	private static ArrayList<CoreRace> coreRaces = new ArrayList<CoreRace>();
	private static ArrayList<Feat> feats = new ArrayList<Feat>();
	
	private static String[] genders = new String[] { "Male", "Female", "Other" };
	
	public static Feat randomFeat() {
		if (feats.isEmpty()) {
			initFeats();
		}
		int random = DiceUtils.random(0, feats.size());
		return feats.get(random);
	}
	
	public static CoreClass randomCoreClass() {
		if (coreClasses.isEmpty()) {
			initCoreClasses();
		}
		int random = DiceUtils.random(0, coreClasses.size());
		return coreClasses.get(random);
	}
	
	private static void initFeats() {
		feats.add(new Toughness());
		feats.add(new GreatFortitude());
		feats.add(new LightningReflexes());
		feats.add(new IronWill());
		feats.add(new ImprovedInitiative());
	}
	
	private static void initCoreClasses() {
		coreClasses.add(new Adept());
		coreClasses.add(new Aristocrat());
		coreClasses.add(new Commoner());
		coreClasses.add(new Expert());
		coreClasses.add(new Warrior());
		
	}
	
	private static void initCoreRaces() {
		coreRaces.add(new Dwarf());
		coreRaces.add(new Elf());
		coreRaces.add(new Gnome());
		coreRaces.add(new HalfElf());
		coreRaces.add(new Halfling());
		coreRaces.add(new HalfOrc());
		coreRaces.add(new Human());
		coreRaces.add(new Goblin());
		coreRaces.add(new Orc());
	}
	
	public static CoreRace randomCoreRace() {
		if (coreRaces.isEmpty()) {
			initCoreRaces();
		}
		int random = DiceUtils.random(0, coreRaces.size());
		return coreRaces.get(random);
	}
	
	public static int statModifier(int value) {
		switch (value) {
			case 0:
				return -5;
			case 1:
				return -5;
			case 2:
				return -4;
			case 3:
				return -4;
			case 4:
				return -3;
			case 5:
				return -3;
			case 6:
				return -2;
			case 7:
				return -2;
			case 8:
				return -1;
			case 9:
				return -1;
			case 10:
				return 0;
			case 11:
				return 0;
			case 12:
				return 1;
			case 13:
				return 1;
			case 14:
				return 2;
			case 15:
				return 2;
			case 16:
				return 3;
			case 17:
				return 3;
			case 18:
				return 4;
			case 19:
				return 4;
			case 20:
				return 5;
			case 21:
				return 5;
			case 22:
				return 6;
			case 23:
				return 6;
		}
		return 0;
	}
	
	public static String randomGender() {
		int randomGender = (int) (Math.random() * genders.length);
		return genders[randomGender];
	}
	
	public static String randomBaseGender() {
		int randomGender = (int) (Math.random() * 2);
		return genders[randomGender];
	}
	
	public static String getRandomHeight(int baseInches, int numD4s) {
		int height = baseInches;
		for (int i = 0; i < numD4s; i++) {
			height += DiceUtils.randomD4(0);
		}
		int feet = (int) (height / 12);
		int inches = (int) (height % 12);
		return feet + " ft. " + inches + " in.";
	}
	
	public static String getRandomHeight(int baseInches, int numD, int diceSize) {
		int height = baseInches;
		for (int i = 0; i < numD; i++) {
			height += DiceUtils.random(1, diceSize);
		}
		int feet = (int) (height / 12);
		int inches = (int) (height % 12);
		return feet + " ft. " + inches + " in.";
	}
	
	public static String getRandomWeight(int baseLbs, int numD, int diceSize, int multiplier) {
		int weight = baseLbs;
		for (int i = 0; i < numD; i++) {
			weight += DiceUtils.random(1, diceSize) * multiplier;
		}
		return weight + " lbs.";
	}
}
