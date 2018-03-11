package com.command;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.abstract_factory.FirstTeam;
import com.abstract_factory.TeamFactory;
import com.gui.PlayerPanel;

public class firstTeamCommand implements Command {
	
	JFrame frame;
	
	public firstTeamCommand(JFrame fr) {
		fr = frame;
	}//constructor
	
	public void Execute() {
		TeamFactory team = new FirstTeam();
		new PlayerPanel(team, "First Team");
    }//end execute method
}//end class
