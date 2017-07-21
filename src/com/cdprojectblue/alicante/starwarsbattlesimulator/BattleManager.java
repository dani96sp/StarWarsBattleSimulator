package com.cdprojectblue.alicante.starwarsbattlesimulator;

import com.cdprojectblue.alicante.starwarsbattlesimulator.menu.BattleMenu;

public class BattleManager {

	public static void main(String[] args) {
		BattleMenu menu = BattleMenu.getInstance();
		menu.play();

	}

}
