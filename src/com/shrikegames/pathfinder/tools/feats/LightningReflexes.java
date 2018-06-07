package com.shrikegames.pathfinder.tools.feats;

import com.shrikegames.pathfinder.tools.npcgen.NPC;

public class LightningReflexes extends Feat {
	
	public LightningReflexes() {
		super("Lightning Reflexes");
	}
	
	public void apply(NPC npc) {
		npc.setRefSave(npc.getRefSave() + 2);
	}
	
}
