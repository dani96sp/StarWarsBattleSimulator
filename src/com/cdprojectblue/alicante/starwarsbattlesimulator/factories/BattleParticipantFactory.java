package com.cdprojectblue.alicante.starwarsbattlesimulator.factories;

import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClasses.BattleParticipant;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant.Atat;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant.Jedi;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant.Sith;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant.Tie;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant.TurboTank;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant.Xwing;

public class BattleParticipantFactory {

	public static BattleParticipant createBattleParticipants(final String optionMenu) {
		switch (optionMenu) {
		case "1.1":
			return new Sith();
		case "1.2":
			return new Tie();
		case "1.3":
			return new Atat();
		case "1.4":
			return new Jedi();
		case "2.1":
			return new Xwing();
		case "2.2":
			return new TurboTank();
		default:
			return null;
		}

	}

}
