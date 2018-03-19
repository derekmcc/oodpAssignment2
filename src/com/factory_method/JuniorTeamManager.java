package com.factory_method;

public class JuniorTeamManager extends Manager{

	@Override
	public String getName() {
		return "Kieran McKenna";
	}//end getName

	@Override
	public String getImage() {
		return "images/managers/km.jpg";
	}//end getImage

	@Override
	public String getNationality() {
		return "Irish";
	}//end getNationality

	@Override
	public int getAge() {
		return 32;
	}//end getAge
}//end class
