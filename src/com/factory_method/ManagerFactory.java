package com.factory_method;

public class ManagerFactory {
	
	public Manager getManager(String manager) {
		if (manager == null) {
			return null;
		}//end if
		else if (manager.equalsIgnoreCase("FirstTeamManager")) {
			return new FirstTeamManager();
		}//end else if
		else if (manager.equalsIgnoreCase("ReserveTeamManager")) {
			return new ReserveTeamManager();
		}//end else if
		else if (manager.equalsIgnoreCase("JuniorTeamManager")) {
			return new JuniorTeamManager();
		}//end else if
		return null;
	}//end getManager
}//end class
