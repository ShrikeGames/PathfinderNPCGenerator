package com.shrikegames.pathfinder.tools.npcgen;

import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class NPCGenerator {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			NPC npc = new NPC(CharacterUtils.randomCoreRace(), CharacterUtils.randomCoreClass());
			System.out.println(npc);
			System.out.println("---------------------------------");
		}
		
	}
	
}
