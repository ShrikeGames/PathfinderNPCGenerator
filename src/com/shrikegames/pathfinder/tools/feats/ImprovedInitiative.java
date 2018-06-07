package com.shrikegames.pathfinder.tools.feats;

import com.shrikegames.pathfinder.tools.npcgen.NPC;

public class ImprovedInitiative extends Feat {
	
	public ImprovedInitiative() {
		super("Improved Initiative");
	}
	
	public void apply(NPC npc) {
		npc.setInit(npc.getInit() + 4);
	}
	
}
