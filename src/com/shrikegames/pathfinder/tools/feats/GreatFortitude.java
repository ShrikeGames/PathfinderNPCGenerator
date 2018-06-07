package com.shrikegames.pathfinder.tools.feats;

import com.shrikegames.pathfinder.tools.npcgen.NPC;

public class GreatFortitude extends Feat {
	
	public GreatFortitude() {
		super("Great Fortitude");
	}
	
	public void apply(NPC npc) {
		npc.setFortSave(npc.getFortSave() + 2);
	}
	
}
