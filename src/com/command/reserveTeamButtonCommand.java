package com.command;

import javax.swing.JFrame;
import com.abstract_factory.ReserveTeam;
import com.abstract_factory.TeamFactory;
import com.gui.PlayerPanel;

public class reserveTeamButtonCommand implements Command {
	
	JFrame frame;
	
	public reserveTeamButtonCommand(JFrame fr) {
		fr = frame;
	}//end constructor
	
	public void Execute() {
		TeamFactory team = new ReserveTeam();
		new PlayerPanel(team, "Reserve Team");
    }//end execute method
}//end class
