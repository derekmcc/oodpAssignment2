package com.command;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.gui.MainMenu;
import com.singleton.FixtureTreeLimitException;
import com.singleton.Singleton;

public class fixturesButtonCommand implements Command {
	
	JFrame frame;
	
	public fixturesButtonCommand(JFrame fr) {
		fr = frame;
	}//end constructor
	
	public void Execute() {
		try {
			Singleton fixtureTree = Singleton.getFixtureTree();
			
		} catch (FixtureTreeLimitException e1) {
			JOptionPane.showMessageDialog(frame, "ERROR fixture list is already opened","ERROR",JOptionPane.ERROR_MESSAGE);
			new MainMenu();
		}//end catch
    }//end execute method
}//end class
