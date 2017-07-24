package com.cdprojectblue.alicante.starwarsbattlesimulator.menu;

import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClasses.BattleParticipant;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant.*;

/**
 * Created by emingora on 24/07/2017.
 */
public class BattleParticipantsFactory {
    public static BattleParticipant createBattleParticipants(final String mainOption, final String battlerParticipanSubMenu) {
        switch (mainOption) {
            case "1.1":
                switch (battlerParticipanSubMenu) {
                    case "1":
                        return new Jedi();
                    case "2":
                        return new TurboTank();
                    case "3":
                        return new Xwing();
                    default:
                        return null;
                }
            case "1.2":
                switch (battlerParticipanSubMenu) {
                    case "1":
                        return new Sith();
                    case "2":
                        return new Atat();
                    case "3":
                        return new Tie();
                    default:
                        return null;
                }
            default:
                return null;
        }
    }
}
