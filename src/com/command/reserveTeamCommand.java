package com.command;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.abstract_factory.ReserveTeam;
import com.abstract_factory.TeamFactory;
import com.gui.PlayerPanel;

public class reserveTeamCommand implements Command {
	
	JFrame frame;
	
	public reserveTeamCommand(JFrame fr) {
		fr = frame;
	}//end constructor
	
	public void Execute() {
		TeamFactory team = new ReserveTeam();
		new PlayerPanel(team, "Reserve Team");
    }//end execute method
}//end class
