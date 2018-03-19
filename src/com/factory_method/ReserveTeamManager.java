package com.factory_method;

public class ReserveTeamManager extends Manager {

	@Override
	public String getName() {
		return "Ricky Sbragia";
	}//end getName

	@Override
	public String getImage() {
		return "images/managers/rs.jpg";
	}//end getImage

	@Override
	public String getNationality() {
		return "Scotish";
	}//end getNationality

	@Override
	public int getAge() {
		return 61;
	}//end getAge
}//end class
