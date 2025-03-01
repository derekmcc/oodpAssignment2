package com.abstract_factory;

public class FirstTeam extends TeamFactory {
	
	@Override
	public Team getGoalkeeper() {
		return new Team("David De Gea","images/firstTeam/degea.jpg","Spanish",1,28,"0");
	}//end getGoalkeeper

	@Override
	public Team getRightBack() {
		return new Team("Valencia","images/firstTeam/valencia.jpg","Ecuador",25,32,"25");
	}//end getRightBack

	@Override
	public Team getRightCenterBack() {
		return new Team("Eric Bailly","images/firstTeam/bailly.jpg","Ivory Coast",3,24,"1");
	}//end getRightCenterBack

	@Override
	public Team getLeftCenterBack() {
		return new Team("Marcos Rojo","images/firstTeam/rojo.jpg","Argintinan",5,28,"2");
	}//end getLeftCenterBack

	@Override
	public Team getLeftBack() {
		return new Team("Luke Shaw","images/firstTeam/shaw.jpg","English",23,23,"0");
	}//end getLeftBack

	@Override
	public Team getRightCenterMid() {
		return new Team("Paul Pogba","images/firstTeam/pogba.jpg","French",6,25,"12");
	}//end getRightCenterBack

	@Override
	public Team getCenterMid() {
		return new Team("Nemanja Matic","images/firstTeam/matic.jpg","Serbian",31,30,"1");
	}//end getCenterMid

	@Override
	public Team getLeftCenterMid() {
		return new Team("Ander Herrera","images/firstTeam/herrera.jpg","Spanish",21,29,"16");
	}//end getLeftCenterMid

	@Override
	public Team getRightAttackMid() {
		return new Team("Anthony Martial","images/firstTeam/martial.jpg","French",11,23,"36");
	}//end getRightAttackMid

	@Override
	public Team getForward() {
		return new Team("Romelu Lukaku","images/firstTeam/lukaku.jpg","Belgian",9,25,"23");
	}//end getForward

	@Override
	public Team getLeftAttackMid() {
		return new Team("Alexis Sanchez","images/firstTeam/alexis.jpg","Chilian",7,30,"1");
	}//end getLeftAttackMid
}//end class
