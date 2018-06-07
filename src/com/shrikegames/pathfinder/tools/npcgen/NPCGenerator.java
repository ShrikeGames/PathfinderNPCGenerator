package com.shrikegames.pathfinder.tools.npcgen;

import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;

public class NPCGenerator {
	/**
	 * TODO skill points, profession, weapons, traits + flaws, armor, items TODO
	 * assign random names and descriptions
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			NPC npc = new NPC(CharacterUtils.randomCoreRace(), CharacterUtils.randomCoreClass());
			System.out.println(npc);
			
		}
		
	}
	
}
