package com.command;

import javax.swing.JFrame;
import com.factory_method.ManagerFactory;
import com.gui.ManagerPanel;

public class reserveTeamManagerCommand implements Command {

	JFrame frame;
	
	public reserveTeamManagerCommand(JFrame fr) {
		fr = frame;
	}//constructor
	
	public void Execute() {
		new ManagerPanel("ReserveTeamManager");
    }//end execute method
}//end class
