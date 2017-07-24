package com.cdprojectblue.alicante.starwarsbattlesimulator.dao;

import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClasses.BattleParticipant;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Faction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Battle participant dao.
 */
public class BattleParticipantDAO {

    private static BattleParticipantDAO instance;

    private List<BattleParticipant> battleParticipants = new ArrayList<>();

    private BattleParticipantDAO() {
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static BattleParticipantDAO getInstance() {
        if (instance == null) {
            instance = new BattleParticipantDAO();
        }
        return instance;
    }

    /**
     * Find all iterable.
     *
     * @return the iterable
     */
    public List<BattleParticipant> findAll() {
        return this.battleParticipants;
    }

    /**
     * Find by faction iterable.
     *
     * @param faction the faction
     *
     * @return the iterable
     */
    public List<BattleParticipant> findByFaction(final Faction faction) {
        return this.battleParticipants.stream().filter(bp -> bp.getFaction() == faction).collect(Collectors.toList());
    }

    /**
     * Gets total power.
     *
     * @param faction the faction
     *
     * @return the total power
     */
    public int getTotalPointCost(final Faction faction) {
        int totalPointCost = 0;
        for (BattleParticipant bp : this.findByFaction(faction)) {
            totalPointCost += bp.getPointCost();
        }
        return totalPointCost;
    }

    /**
     * Delete.
     */
    public void delete(final BattleParticipant oldBattleParticipant) {
        battleParticipants.remove(oldBattleParticipant);

    }

    /**
     * Save battle participant.
     *
     * @param newBattleParticipant the new battle participant
     *
     * @return the battle participant
     */
    public BattleParticipant save(final BattleParticipant newBattleParticipant) {
        battleParticipants.add(newBattleParticipant);
        return newBattleParticipant;
    }
}
