package com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClasses;

import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Faction;

public abstract class BattleParticipant {
	private int power;
	private int pointCost;
	private Faction faction;
	private int health;

	public int getPower() {
		return power;
	}

	public int getPointCost() {
		return pointCost;
	}

	public boolean isAlive() {
		return this.health > 0;
	}

	public Faction getFaction() {
		return faction;
	}

	public int getHealth() {
		return health;
	}

	public void receiveDamage(int damage) {
		this.health -= damage;
	}

	protected void setPower(int power) {
		this.power = power;
	}

	protected void setPointCost(int pointCost) {
		this.pointCost = pointCost;
	}

	protected void setFaction(Faction faction) {
		this.faction = faction;
	}

	protected void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+": [power=" + power + ", pointCost=" + pointCost + ", health="
				+ health + "]";
	}
	
	

}
