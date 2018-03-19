package com.command;

import javax.swing.JFrame;
import com.factory_method.ManagerFactory;
import com.gui.ManagerPanel;

public class juniorTeamManagerCommand implements Command {

	JFrame frame;
	
	public juniorTeamManagerCommand(JFrame fr) {
		fr = frame;
	}//constructor
	
	public void Execute() {
		new ManagerPanel("JuniorTeamManager");
    }//end execute method
}//end class
