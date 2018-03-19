package com.command;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.singleton.FixtureTreeLimitException;
import com.singleton.Singleton;

public class fixturesButtonCommand implements Command {
	
	JFrame frame;
	
	public fixturesButtonCommand(JFrame fr) {
		fr = frame;
	}//constructor
	
	public void Execute() {
		try {
			Singleton fixtureTree = Singleton.getFixtureTree();
			
		} catch (FixtureTreeLimitException e1) {
			JOptionPane.showMessageDialog(frame, "ERROR ONLY ONE instance of the Fixture list can be created","ERROR",JOptionPane.ERROR_MESSAGE);
		}//end catch
    }//end execute method
}//end class
