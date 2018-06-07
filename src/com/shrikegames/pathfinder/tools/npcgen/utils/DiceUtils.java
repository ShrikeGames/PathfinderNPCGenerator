package com.shrikegames.pathfinder.tools.npcgen.utils;

public class DiceUtils {
	
	public static int randomStat(int bonus) {
		int d1 = randomD6(0);
		int d2 = randomD6(0);
		int d3 = randomD6(0);
		return d1 + d2 + d3 + bonus;
	}
	
	public static int randomD6(int bonus) {
		int randomNum = 1 + (int) (Math.random() * 6);
		return randomNum;
	}
	
	public static int randomD4(int bonus) {
		int randomNum = 1 + (int) (Math.random() * 4);
		return randomNum;
	}
	
	public static int random(int base, int max) {
		int randomNum = base + (int) (Math.random() * max);
		return randomNum;
	}
}
