package com.cdprojectblue.alicante.starwarsbattlesimulator;

import com.cdprojectblue.alicante.starwarsbattlesimulator.battle.Battle;
import com.cdprojectblue.alicante.starwarsbattlesimulator.constants.BattleConstants;
import com.cdprojectblue.alicante.starwarsbattlesimulator.dao.BattleParticipantDAO;
import com.cdprojectblue.alicante.starwarsbattlesimulator.menu.BattleMenu;
import com.cdprojectblue.alicante.starwarsbattlesimulator.menu.BattleParticipantsFactory;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClasses.BattleParticipant;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Faction;
import com.cdprojectblue.alicante.starwarsbattlesimulator.util.UIUtils;

import java.util.List;

public class BattleManager {

    private static BattleMenu battleMenu = BattleMenu.getInstance();
    private static BattleParticipantDAO battleParticipantDAO = BattleParticipantDAO.getInstance();

    public static void main(String[] args) {
        String mainOption;
        do {
            mainOption = battleMenu.play();
            if (mainOption.startsWith("1.")) {
                handleCreateTeams(mainOption);
            } else if (mainOption.startsWith("2.")) {
                handleShowTeams();
            } else if (mainOption.startsWith("3.")) {
                handleDeleteTeams();
            } else if (mainOption.startsWith("3.")) {
                handleDeleteTeams();
            }
        } while (!"0".equals(mainOption));
    }

    private static void handleCreateTeams(String mainOption) {
        String battleParticipantOption;
        do {
            battleParticipantOption = battleMenu.getBatlleParticipantSubMenu(mainOption);
            if (!"0".equals(battleParticipantOption)) {
                final BattleParticipant battleParticipant = BattleParticipantsFactory.createBattleParticipants(mainOption, battleParticipantOption);
                int totalPower = battleParticipantDAO.getTotalPower(battleParticipant.getFaction());
                if (totalPower + battleParticipant.getPower() > BattleConstants.TOTAL_POWER) {
                    System.err.printf("El Participante %s supera el poder máximo permitido por equipo %d \n", battleParticipant, BattleConstants.TOTAL_POWER);
                    System.err.printf("El paricipante no ha sido guardado \n");
                } else {
                    battleParticipantDAO.save(battleParticipant);
                }
            }
        } while (!"0".equals(battleParticipantOption));
    }

    private static void handleShowTeams() {
        UIUtils.printRebelHeader();
        printTeams(Faction.REBELS);
        UIUtils.printEmpireHeader();
        printTeams(Faction.EMPIRE);
    }

    private static void printTeams(Faction rebels) {
        for (BattleParticipant battleParticipant : battleParticipantDAO.findByFaction(rebels)) {
            System.out.println(battleParticipant);
        }
    }

    private static void handleDeleteTeams() {

    }

    private static void handleFight() {
        List<BattleParticipant> rebels = battleParticipantDAO.findByFaction(Faction.REBELS);
        List<BattleParticipant> empires = battleParticipantDAO.findByFaction(Faction.EMPIRE);
        Battle battle = new Battle(empires, rebels);

    }


}
