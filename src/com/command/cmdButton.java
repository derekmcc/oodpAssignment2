package com.command;

import javax.swing.*;

public class cmdButton extends JButton implements CommandHolder {
	private Command btnCommand;

	public cmdButton(String name) {
		super(name);
  	}//end cmdButton
	
	public void setCommand(Command comd) {
		btnCommand = comd;
	}//end setCommand
	
	public Command getCommand() {
		return btnCommand;
	}//end getCommand
}//end class
