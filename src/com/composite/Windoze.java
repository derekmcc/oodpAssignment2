package com.composite;

import java.awt.event.*;
import com.gui.MainMenu;
import com.singleton.Singleton;
import javax.swing.*;

public class Windoze extends JFrame {
	Singleton s1;
	
	public Windoze(String title) {
		super(title);
		setCloseClick();
	}//end constructor
    
	private void setCloseClick() {
		//create window listener to respond to window close click
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Object obj = new Object();
				obj = null;
				s1.setFixtureTree(obj);
				//new MainMenu();
				if (MainMenu.getFrames() == null) {
					new MainMenu();
				}//end if
	    	}//end window closing
	    });//end windowListener
	}//end setCloseClick
}//end class