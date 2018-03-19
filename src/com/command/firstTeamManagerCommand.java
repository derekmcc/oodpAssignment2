package com.command;

import javax.swing.JFrame;
import com.abstract_factory.FirstTeam;
import com.abstract_factory.TeamFactory;
import com.factory_method.ManagerFactory;
import com.gui.ManagerPanel;
import com.gui.PlayerPanel;

public class firstTeamManagerCommand implements Command {
	
	JFrame frame;
	
	public firstTeamManagerCommand(JFrame fr) {
		fr = frame;
	}//constructor
	
	public void Execute() {
		new ManagerPanel("FirstTeamManager");
    }//end execute method
}//end class
