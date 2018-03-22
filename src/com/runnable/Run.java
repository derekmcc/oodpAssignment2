package com.runnable;

import javax.swing.JFrame;
import javax.swing.UIManager;
import com.gui.MainMenu;

public class Run extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main (String args[]) {
		//try set the look & feel 
		try {
            //set the look and feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException e) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        } catch (InstantiationException e) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        } catch (IllegalAccessException e) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        } catch (javax.swing.UnsupportedLookAndFeelException e) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }//end catch
		
		//instantiate the run class
		new Run();
	}//end main method

	public Run() {
		//create the frame
    	JFrame frame = new MainMenu();
    	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}//end constructor
}//end class
