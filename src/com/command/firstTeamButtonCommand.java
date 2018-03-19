package com.command;

import javax.swing.JFrame;

import com.abstract_factory.FirstTeam;
import com.abstract_factory.TeamFactory;
import com.gui.PlayerPanel;

public class firstTeamButtonCommand implements Command {
	
	JFrame frame;
	
	public firstTeamButtonCommand(JFrame fr) {
		fr = frame;
	}//constructor
	
	public void Execute() {
		TeamFactory team = new FirstTeam();
		new PlayerPanel(team, "First Team");
    }//end execute method
}//end class
