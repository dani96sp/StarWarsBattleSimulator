package com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant;

import com.cdprojectblue.alicante.starwarsbattlesimulator.constants.BattleConstants;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClasses.Infantry;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Faction;

public class Sith extends Infantry {

	public Sith() {
		super();

		this.setHealth(BattleConstants.INFANTRY_HEALTH);
		this.setPower(BattleConstants.INFANTRY_POWER);
		this.setPointCost(BattleConstants.INFANTRY_COST);
		this.setFaction(Faction.EMPIRE);

	}
}
