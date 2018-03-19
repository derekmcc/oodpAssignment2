package com.command;

import javax.swing.JFrame;
import com.abstract_factory.JuniorTeam;
import com.abstract_factory.TeamFactory;
import com.gui.PlayerPanel;

public class juniorTeamButtonCommand implements Command {
	
	JFrame frame;
	
	public juniorTeamButtonCommand(JFrame fr) {
		fr = frame;
	}//end constructor
	
	public void Execute() {
		TeamFactory team = new JuniorTeam();
		new PlayerPanel(team, "Under 18's Team");
    }//end execute method
}//end class
