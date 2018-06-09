package com.shrikegames.pathfinder.tools.npcgen;

import java.util.ArrayList;

import com.shrikegames.pathfinder.tools.coreclasses.CoreClass;
import com.shrikegames.pathfinder.tools.coreraces.CoreRace;
import com.shrikegames.pathfinder.tools.drawbacks.Drawback;
import com.shrikegames.pathfinder.tools.feats.Feat;
import com.shrikegames.pathfinder.tools.npcgen.utils.CharacterUtils;
import com.shrikegames.pathfinder.tools.npcgen.utils.DiceUtils;

public class NPC {
	private Alignment alignment;
	private String firstName;
	private String lastName;
	private String gender;
	private String height;
	private String weight;
	private String profession;
	
	private int health;
	private int strength;
	private int dexterity;
	private int constitution;
	private int wisdom;
	private int intelligence;
	private int charisma;
	private int fortSave;
	private int willSave;
	private int refSave;
	
	private int strengthMod;
	private int dexterityMod;
	private int constitutionMod;
	private int wisdomMod;
	private int intelligenceMod;
	private int charismaMod;
	private CoreClass coreClass;
	private CoreRace coreRace;
	private ArrayList<Feat> feats;
	private ArrayList<Drawback> drawbacks;
	
	private int ac;
	private int touchAC;
	private int flatAC;
	private int acArmorBonus;
	private int acShieldBonus;
	private int acSizeBonus;
	private int acDodgeBonus;
	private int acNaturalBonus;
	private int acDeflectBonus;
	private int acOtherBonus;
	
	private int init;
	
	private int cmb;
	private int cmd;
	
	private boolean useDexForMelee = false;
	
	public NPC(CoreRace coreRace, CoreClass coreClass) {
		this.coreClass = coreClass;
		this.coreRace = coreRace;
		gender = CharacterUtils.randomGender();
		alignment = CharacterUtils.randomAlignment();
		firstName = coreRace.getFirstName(gender);
		lastName = coreRace.getLastName(gender);
		height = coreRace.getRandomHeight(gender);
		weight = coreRace.getRandomWeight(gender);
		profession = CharacterUtils.randomProfession();
		
		drawbacks = new ArrayList<Drawback>();
		
		strength = DiceUtils.randomStat(0) + coreRace.getStrengthMod();
		dexterity = DiceUtils.randomStat(0) + coreRace.getDexterityMod();
		constitution = DiceUtils.randomStat(0) + coreRace.getConstitutionMod();
		wisdom = DiceUtils.randomStat(0) + coreRace.getWisdomMod();
		intelligence = DiceUtils.randomStat(0) + coreRace.getIntelligenceMod();
		charisma = DiceUtils.randomStat(0) + coreRace.getCharismaMod();
		
		strengthMod = CharacterUtils.statModifier(strength);
		dexterityMod = CharacterUtils.statModifier(dexterity);
		constitutionMod = CharacterUtils.statModifier(constitution);
		wisdomMod = CharacterUtils.statModifier(wisdom);
		intelligenceMod = CharacterUtils.statModifier(intelligence);
		charismaMod = CharacterUtils.statModifier(charisma);
		health = coreClass.getHitDie() + constitutionMod;
		
		fortSave = coreClass.getFortSave() + constitutionMod;
		refSave = coreClass.getRefSave() + dexterityMod;
		willSave = coreClass.getWillSave() + wisdomMod;
		
		init = dexterityMod;
		acArmorBonus = 0;
		acShieldBonus = 0;
		acSizeBonus = 0;
		acDodgeBonus = 0;
		acNaturalBonus = 0;
		acDeflectBonus = 0;
		acOtherBonus = 0;
		
		coreClass.initSkillPoints(this);
		coreRace.apply(this);
		feats = new ArrayList<Feat>();
		for (int i = 0; i < coreRace.getFeatCount(); i++) {
			Feat randomFeat = CharacterUtils.randomFeat();
			randomFeat.apply(this);
			feats.add(randomFeat);
		}
		
		int randomDrawback = (int) (Math.random() * Drawback.values().length);
		drawbacks.add(Drawback.values()[randomDrawback]);
		
		ac = 10 + dexterityMod + acArmorBonus + acShieldBonus + acSizeBonus + acDodgeBonus + acNaturalBonus + acDeflectBonus + acOtherBonus;
		touchAC = 10 + dexterityMod + acSizeBonus + acDodgeBonus + acNaturalBonus + acDeflectBonus + acOtherBonus;
		flatAC = 10 + acArmorBonus + acShieldBonus + acSizeBonus + acDeflectBonus + acOtherBonus;
		cmb = 0 + coreClass.getBab() - acSizeBonus + strengthMod;
		cmd = 10 + coreClass.getBab() - acSizeBonus + dexterityMod + strengthMod;
		
	}
	
	public String toString() {
		String statBlock = firstName + " " + lastName + " (" + alignment + ")" + "\n";
		statBlock += "Gender:" + gender + "\n";
		statBlock += "Race:" + coreRace.getName() + "\n";
		statBlock += "Height:" + height + "\n";
		statBlock += "Weight:" + weight + "\n";
		statBlock += "Class:" + coreClass.getName() + "\n";
		statBlock += "Profession:" + profession + "\n";
		statBlock += "HP:" + health + "\n";
		statBlock += "AC:" + ac + "\n";
		statBlock += "Touch AC:" + touchAC + "\n";
		statBlock += "Flat-footed AC:" + flatAC + "\n";
		
		statBlock += "STR:" + strength + "(" + strengthMod + "), ";
		statBlock += "DEX:" + dexterity + "(" + dexterityMod + "), ";
		statBlock += "CON:" + constitution + "(" + constitutionMod + "), ";
		statBlock += "WIS:" + wisdom + "(" + wisdomMod + "), ";
		statBlock += "INT:" + intelligence + "(" + intelligenceMod + "), ";
		statBlock += "CHA:" + charisma + "(" + charismaMod + ") ";
		statBlock += "\n";
		statBlock += "FORT:" + fortSave + ", ";
		statBlock += "REF:" + refSave + ", ";
		statBlock += "WILL:" + willSave + ", ";
		statBlock += "\n";
		statBlock += "Initiative:" + init + "\n";
		if (useDexForMelee) {
			statBlock += "Melee Attack Bonus (Str):" + (coreClass.getBab() + strengthMod + acSizeBonus) + "\n";
			statBlock += "Melee Attack Bonus (Dex):" + (coreClass.getBab() + dexterityMod + acSizeBonus) + "\n";
		} else {
			statBlock += "Melee Attack Bonus:" + (coreClass.getBab() + strengthMod + acSizeBonus) + "\n";
		}
		statBlock += "Ranged Attack Bonus:" + (coreClass.getBab() + dexterityMod + acSizeBonus) + "\n";
		statBlock += "CMB:" + cmb + "\n";
		statBlock += "CMD:" + cmd + "\n";
		
		statBlock += "Feats:" + feats + "\n";
		
		if (!coreClass.getCantrips().isEmpty()) {
			statBlock += "Cantrips (DC" + (10 + wisdomMod) + "):" + coreClass.getCantrips() + "\n";
			if (wisdom < 10) {
				statBlock += "*You lack the wisdom to prepare or cast cantrips.\n";
			}
		}
		
		if (!coreClass.getFirstLevelSpells().isEmpty()) {
			if (wisdomMod > 0) {
				statBlock += "1st level Spells (DC" + (11 + wisdomMod) + " 2/day):" + coreClass.getFirstLevelSpells() + "\n";
			} else if (wisdomMod <= 0) {
				statBlock += "1st level Spells (DC" + (11 + wisdomMod) + " 1/day):" + coreClass.getFirstLevelSpells() + "\n";
			}
			if (wisdom < 11) {
				statBlock += "*You lack the wisdom to prepare or cast 1st level spells.\n";
			}
		}
		
		statBlock += "Skill Points:" + getSkillPoints() + "\n";
		statBlock += "Skills:" + coreClass.getSkillList() + "\n";
		statBlock += "Racial Traits:" + coreRace.getRacialTraits() + "\n";
		statBlock += "Drawbacks:" + drawbacks + "\n";
		
		return statBlock;
	}
	
	public int getCmb() {
		return cmb;
	}
	
	public int getCmd() {
		return cmd;
	}
	
	public void setCmb(int cmb) {
		this.cmb = cmb;
	}
	
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	
	public void setAc(int ac) {
		this.ac = ac;
	}
	
	public void setTouchAC(int touchAC) {
		this.touchAC = touchAC;
	}
	
	public void setFlatAC(int flatAC) {
		this.flatAC = flatAC;
	}
	
	public void setAcArmorBonus(int acArmorBonus) {
		this.acArmorBonus = acArmorBonus;
	}
	
	public void setAcShieldBonus(int acShieldBonus) {
		this.acShieldBonus = acShieldBonus;
	}
	
	public void setAcSizeBonus(int acSizeBonus) {
		this.acSizeBonus = acSizeBonus;
	}
	
	public void setAcDodgeBonus(int acDodgeBonus) {
		this.acDodgeBonus = acDodgeBonus;
	}
	
	public void setAcNaturalBonus(int acNaturalBonus) {
		this.acNaturalBonus = acNaturalBonus;
	}
	
	public void setAcDeflectBonus(int acDeflectBonus) {
		this.acDeflectBonus = acDeflectBonus;
	}
	
	public void setAcOtherBonus(int acOtherBonus) {
		this.acOtherBonus = acOtherBonus;
	}
	
	public ArrayList<Drawback> getDrawbacks() {
		return drawbacks;
	}
	
	public int getAc() {
		return ac;
	}
	
	public int getTouchAC() {
		return touchAC;
	}
	
	public int getFlatAC() {
		return flatAC;
	}
	
	public int getAcArmorBonus() {
		return acArmorBonus;
	}
	
	public int getAcShieldBonus() {
		return acShieldBonus;
	}
	
	public int getAcSizeBonus() {
		return acSizeBonus;
	}
	
	public int getAcDodgeBonus() {
		return acDodgeBonus;
	}
	
	public int getAcNaturalBonus() {
		return acNaturalBonus;
	}
	
	public int getAcDeflectBonus() {
		return acDeflectBonus;
	}
	
	public int getAcOtherBonus() {
		return acOtherBonus;
	}
	
	public int getSkillPoints() {
		return Math.max(1, coreClass.getSkillCountBase() + CharacterUtils.statModifier(intelligence) + coreRace.getSkillPointBonus());
	}
	
	public void setFortSave(int fortSave) {
		this.fortSave = fortSave;
	}
	
	public void setWillSave(int willSave) {
		this.willSave = willSave;
	}
	
	public void setRefSave(int refSave) {
		this.refSave = refSave;
	}
	
	public int getFortSave() {
		return fortSave;
	}
	
	public int getRefSave() {
		return refSave;
	}
	
	public int getWillSave() {
		return willSave;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getDexterity() {
		return dexterity;
	}
	
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	
	public int getConstitution() {
		return constitution;
	}
	
	public void setConstitution(int constituion) {
		this.constitution = constituion;
	}
	
	public int getWisdom() {
		return wisdom;
	}
	
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public int getCharisma() {
		return charisma;
	}
	
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	
	public int getStrengthMod() {
		return strengthMod;
	}
	
	public int getDexterityMod() {
		return dexterityMod;
	}
	
	public int getConstitutionMod() {
		return constitutionMod;
	}
	
	public int getWisdomMod() {
		return wisdomMod;
	}
	
	public int getIntelligenceMod() {
		return intelligenceMod;
	}
	
	public int getCharismaMod() {
		return charismaMod;
	}
	
	public CoreClass getCoreClass() {
		return coreClass;
	}
	
	public CoreRace getCoreRace() {
		return coreRace;
	}
	
	public ArrayList<Feat> getFeats() {
		return feats;
	}
	
	public int getInit() {
		return init;
	}
	
	public void setInit(int init) {
		this.init = init;
	}
	
	public boolean isUseDexForMelee() {
		return useDexForMelee;
	}
	
	public void setUseDexForMelee(boolean useDexForMelee) {
		this.useDexForMelee = useDexForMelee;
	}
	
}
