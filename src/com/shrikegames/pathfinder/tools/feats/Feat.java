package com.shrikegames.pathfinder.tools.feats;

import com.shrikegames.pathfinder.tools.npcgen.NPC;

public class Feat {
	private String name;
	
	public Feat(String name) {
		super();
		this.name = name;
	}
	
	public void apply(NPC npc) {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}
