package com.cdprojectblue.alicante.starwarsbattlesimulator.battle;

import java.util.List;

import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClasses.BattleParticipant;

public class Battle {
	private List<BattleParticipant> empire;
	private List<BattleParticipant> rebels;
	
	public Battle(List<BattleParticipant> empire, List<BattleParticipant> rebels) {
		this.empire = empire;
		this.rebels = rebels;
	}

	public void fight() {}

	
}
