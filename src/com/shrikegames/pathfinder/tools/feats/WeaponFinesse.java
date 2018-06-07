package com.shrikegames.pathfinder.tools.feats;

import com.shrikegames.pathfinder.tools.npcgen.NPC;

public class WeaponFinesse extends Feat {
	
	public WeaponFinesse() {
		super("Weapon Finesse");
	}
	
	public void apply(NPC npc) {
		npc.setUseDexForMelee(true);
	}
	
}
