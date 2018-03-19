package com.abstract_factory;

public class JuniorTeam extends TeamFactory {

	@Override
	public Team getGoalkeeper() {
		return new Team("Alex Fojticek","images/juniorTeam/fojticek.jpg","Slovakian",1,18,"0");
	}//end getGoalkeeper

	@Override
	public Team getRightBack() {
		return new Team("Brandon Williams","images/juniorTeam/williams.jpg","English",2,18,"1");
	}//end getRightBack

	@Override
	public Team getRightCenterBack() {
		return new Team("Di'Shon Bernard","images/juniorTeam/bernard.jpg","English",3,18,"2");
	}//end getRightCenterBack

	@Override
	public Team getLeftCenterBack() {
		return new Team("Ethan Laird","images/juniorTeam/laird.jpg","English",4,17,"5");
	}//end getLeftCenterBack

	@Override
	public Team getLeftBack() {
		return new Team("Lee O'Connor","images/juniorTeam/oConnor.jpg","English",5,18,"2");
	}//end getLeftBack

	@Override
	public Team getRightCenterMid() {
		return new Team("Aliou Traore","images/juniorTeam/traore.jpg","French",6,17,"7");
	}//end getRightCenterBack

	@Override
	public Team getCenterMid() {
		return new Team("Arnau Puigmal","images/juniorTeam/puigmal.jpg","Spanish",7,17,"16");
	}//end getCenterMid

	@Override
	public Team getLeftCenterMid() {
		return new Team("Dion Mcghee","images/juniorTeam/mcghee.jpg","English",8,18,"8");
	}//end getLeftCenterMid

	@Override
	public Team getRightAttackMid() {
		return new Team("Aidan Barlow","images/juniorTeam/barlow.jpg","English",9,18,"33");
	}//end getRightAttackMid

	@Override
	public Team getForward() {
		return new Team("Angel Gomes","images/juniorTeam/gomes.jpg","English",10,18,"44");
	}//end getForward

	@Override
	public Team getLeftAttackMid() {
		return new Team("D'mani Mellor","images/juniorTeam/mellor.jpg","English",11,18,"55");
	}//end getLeftAttackMid
}//end class
