package com.abstract_factory;
public class ReserveTeam extends TeamFactory {

	@Override
	public Team getGoalkeeper() {
		return new Team("Max Johnstone","images/reserveTeam/johnstone.jpg","English",1,20,"0");

	}

	@Override
	public Team getRightBack() {
		return new Team("Jake Kenyon","images/reserveTeam/kenyon.jpg","English",2,19,"1");

	}

	@Override
	public Team getRightCenterBack() {
		return new Team("Matt Olosunde","images/reserveTeam/olosunde.jpg","American",3,20,"1");

	}

	@Override
	public Team getLeftCenterBack() {
		return new Team("Regan Poole","images/reserveTeam/poole.jpg","Welsh",4,20,"1");

	}

	@Override
	public Team getLeftBack() {
		return new Team("Charlie Scott","images/reserveTeam/scott.jpg","English",5,21,"2");

	}

	@Override
	public Team getRightCenterMid() {
		return new Team("Callum Whelan","images/reserveTeam/whelan.jpg","English",6,20,"7");

	}

	@Override
	public Team getCenterMid() {
		return new Team("Tom Sang","images/reserveTeam/sang.jpg","English",7,19,"4");

	}

	@Override
	public Team getLeftCenterMid() {
		return new Team("Tosin Kehinde","images/reserveTeam/kehinde.jpg","Nigerian",8,20,"1");

	}

	@Override
	public Team getRightAttackMid() {
		return new Team("Ethan Hamilton","images/reserveTeam/hamilton.jpg","Scotish",9,20,"0");

	}

	@Override
	public Team getForward() {
		return new Team("James Wilson","images/reserveTeam/wilson.jpg","English",10,23,"43");

	}

	@Override
	public Team getLeftAttackMid() {
		return new Team("Joshua Bohui","images/reserveTeam/bohui.jpg","English",11,19,"18");

	}
}//end class
