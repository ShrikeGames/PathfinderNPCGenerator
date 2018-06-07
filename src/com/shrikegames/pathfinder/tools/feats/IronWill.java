package com.shrikegames.pathfinder.tools.feats;

import com.shrikegames.pathfinder.tools.npcgen.NPC;

public class IronWill extends Feat {
	
	public IronWill() {
		super("Iron Will");
	}
	
	public void apply(NPC npc) {
		npc.setWillSave(npc.getWillSave() + 2);
	}
	
}
