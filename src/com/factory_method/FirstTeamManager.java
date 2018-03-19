package com.factory_method;

public class FirstTeamManager extends Manager {

	@Override
	public String getName() {
		return "José Mourinho";
	}//end getName

	@Override
	public String getImage() {
		return "images/managers/jm.jpg";
	}//end getImage

	@Override
	public String getNationality() {
		return "Portuguese";
	}//end getNationality

	@Override
	public int getAge() {
		return 56;
	}//end getAge	
}//end class
