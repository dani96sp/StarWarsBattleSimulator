package com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant;

import com.cdprojectblue.alicante.starwarsbattlesimulator.constants.BattleConstants;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClasses.AirMachine;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Faction;

public class Tie extends AirMachine{
	public Tie() {
		super();
		
		this.setHealth(BattleConstants.AIR_HEALTH);
		this.setPower(BattleConstants.AIR_POWER);
		this.setPointCost(BattleConstants.AIR_COST);
		this.setFaction(Faction.REBELS);
		
	}
}
