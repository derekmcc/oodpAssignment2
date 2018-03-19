package com.command;
import javax.swing.*;

public class cmdMenu extends JMenuItem implements CommandHolder {
   protected Command menuCommand;
   protected JFrame frame;

   public cmdMenu(String name, JFrame frm) {
      super(name);
      frame = frm;
   }//end cmdMenu

   public void setCommand(Command comd) {
      menuCommand = comd;
   }//end setCommand

   public Command getCommand() {
      return menuCommand;
   }//endgetCommand
}//end class
