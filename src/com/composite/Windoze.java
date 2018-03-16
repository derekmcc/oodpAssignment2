package com.composite;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

//swing classes
import javax.swing.text.*;
import javax.swing.*;
import javax.swing.event.*;


public class Windoze extends JFrame {
   public Windoze(String title) {
      super(title);
      setCloseClick();
      
   }
   private void setCloseClick() {
      //create window listener to respond to window close click
      addWindowListener(new WindowAdapter()
       {
	    public void windowClosing(WindowEvent e) {System.exit(0);}
	    });
   }
}