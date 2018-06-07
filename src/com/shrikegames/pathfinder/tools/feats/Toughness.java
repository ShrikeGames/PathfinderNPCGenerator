package com.shrikegames.pathfinder.tools.feats;

import com.shrikegames.pathfinder.tools.npcgen.NPC;

public class Toughness extends Feat {
	
	public Toughness() {
		super("Toughness");
	}
	
	public void apply(NPC npc) {
		npc.setHealth(npc.getHealth() + 3);
	}
	
}
