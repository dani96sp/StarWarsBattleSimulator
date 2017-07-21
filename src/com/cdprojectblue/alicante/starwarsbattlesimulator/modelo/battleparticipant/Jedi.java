package com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant;

import com.cdprojectblue.alicante.starwarsbattlesimulator.constants.BattleConstants;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClasses.Infantry;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Factions;

public class Jedi extends Infantry {
	public Jedi() {
		super();

		this.setHealth(BattleConstants.INFANTRY_HEALTH);
		this.setPower(BattleConstants.INFANTRY_POWER);
		this.setPointCost(BattleConstants.INFANTRY_COST);
		this.setFaction(Factions.REBELS);

	}
}
