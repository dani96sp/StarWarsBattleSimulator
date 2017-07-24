package com.cdprojectblue.alicante.starwarsbattlesimulator;

import java.util.Scanner;

import com.cdprojectblue.alicante.starwarsbattlesimulator.constants.*;
import com.cdprojectblue.alicante.starwarsbattlesimulator.factories.BattleParticipantFactory;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClasses.BattleParticipant;

public class BattleManager {

	final String separator = "************************************************************";

	public void createTeams(String mainOption) {
		int pointsLeft = BattleConstants.BATTLE_POINTS;
		BattleParticipant battleParticipant;
		while (pointsLeft > 0) {
			if(mainOption.equals("1.1")) {
				battleParticipant=BattleParticipantFactory.createBattleParticipants(printRebelTeamMenu());
				//TODO DAO
			}else if(mainOption.equals("1.2")) {
				battleParticipant=BattleParticipantFactory.createBattleParticipants(printEmpireTeamMenu());
			
			}
			
		}
	}

	public String printRebelTeamMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(separator);
		System.out.println("Please insert the troop you want to add to your list");
		
		System.out.println("1. Jedi: " + BattleConstants.INFANTRY_COST + " Points, " 
				+ BattleConstants.INFANTRY_POWER + " Power, " 
				+ BattleConstants.INFANTRY_HEALTH + " Health points");
		System.out.println("2. Turbo Tank: "+BattleConstants.EARTH_COST+" Points, "
				+BattleConstants.EARTH_POWER+" Power, "
				+BattleConstants.EARTH_HEALTH+" Health points");
		System.out.println("3. X-Wing: "+BattleConstants.AIR_COST+" Points, "
				+BattleConstants.AIR_POWER+" Power, "
				+BattleConstants.AIR_HEALTH+" Health points");
		
		return sc.nextLine();
	}
	
	public String printEmpireTeamMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(separator);
		System.out.println("Please insert the troop you want to add to your list");
		
		System.out.println("1. Sith: " + BattleConstants.INFANTRY_COST + " Points, " 
				+ BattleConstants.INFANTRY_POWER + " Power, " 
				+ BattleConstants.INFANTRY_HEALTH + " Health points");
		System.out.println("2. AT-AT: "+BattleConstants.EARTH_COST+" Points, "
				+BattleConstants.EARTH_POWER+" Power, "
				+BattleConstants.EARTH_HEALTH+" Health points");
		System.out.println("3. TIE: "+BattleConstants.AIR_COST+" Points, "
				+BattleConstants.AIR_POWER+" Power, "
				+BattleConstants.AIR_HEALTH+" Health points");
		
		return sc.nextLine();
	}
}
