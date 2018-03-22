package com.composite;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

//swing classes
import javax.swing.text.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import javax.swing.tree.*;

import com.gui.MainMenu;
import com.singleton.Singleton;


public class FixtureTree extends Windoze implements TreeSelectionListener {
   
	Leaf fixtures, march, april, may;
    Leaf league, faCup, ecl;
    JScrollPane sp;
    JPanel treePanel;
    JTree tree;
    DefaultMutableTreeNode troot;
    JLabel cost;
    Container contentPane = getContentPane();
    Singleton s1;
    int flag = 0;
    
    public FixtureTree() {
        super("Fixture List");
        
        makeLeaves();
        setGUI();
    }//end constructor
    
    private void setGUI() {
        treePanel = new JPanel();
        getContentPane().add(treePanel);
        treePanel.setLayout(new BorderLayout());

        sp = new JScrollPane();
        treePanel.add("Center", sp);
        treePanel.add("South", cost = new JLabel("          "));
        
        treePanel.add("North",new JButton(new AbstractAction("Back To Main") {
            public void actionPerformed(ActionEvent e) {
            	flag++;
            	if (flag == 1) {
	            	Object obj = new Object();
	    			obj = null;
	    			/************************************************************
	    			 * ---------- COMMENT OUT TO SHOW SINGLETON WORKING ---------
	    			 ************************************************************/
	    			//s1.setFixtureTree(obj);
	    			/************************************************************/
	                new MainMenu();
	                //dispose();
            	}//end if
            }//end inner class actionListener
        }));
        
        treePanel.setBorder(new BevelBorder(BevelBorder.RAISED));
        troot = new DefaultMutableTreeNode(fixtures.getName());
        tree= new JTree(troot);
        tree.setBackground(Color.lightGray);
        loadTree(fixtures);

        sp.getViewport().add(tree);
        setSize(new Dimension(300, 350));
        setVisible(true);
    }//end setGUI
    
    public void loadTree(Leaf root) {
        DefaultMutableTreeNode troot;
        troot = new DefaultMutableTreeNode(root.getName());
        treePanel.remove(tree);
        tree= new JTree(troot);
        tree.addTreeSelectionListener(this);
        sp.getViewport().add(tree);

        addNodes(troot, root);
        tree.expandRow(0);
        repaint();
    }//end loadTree

    private void addNodes(DefaultMutableTreeNode pnode, Leaf l) {
        DefaultMutableTreeNode node;

        Enumeration e = l.subordinates();
        if (e != null) {
            while (e.hasMoreElements()) {
                Leaf newLeaf = (Leaf)e.nextElement();
                node = new DefaultMutableTreeNode(newLeaf.getName());
                pnode.add(node);
                addNodes(node, newLeaf);
            }//end while
        }//end if
    }//end addNodes

    private void makeLeaves() {
        fixtures = new Composite("Fixture List", 11);
        fixtures.add(march = new Composite("March", 5));
        fixtures.add(april = new Composite("April", 4));
        fixtures.add(may = new Composite("May", 2));
        
        march.add(league = new Composite("Premier League", 3));
        march.add(faCup = new Composite("FA Cup", 1));
        march.add(ecl = new Composite("Champions League", 1));
        
        league.add(new Leaf("5th - Crystal Palace",1));
        league.add(new Leaf("10th - Liverpool",1));
        league.add(new Leaf("31st - Swansea City",1));
        
        faCup.add(new Leaf("17th - Brighton",1));
        
        ecl.add(new Leaf("13th - Sevilla",1));
       
        april.add(league = new Composite("Premier League", 4));
      
        league.add(new Leaf("7th - Man City",1));
        league.add(new Leaf("15th - West Brom",1));
        league.add(new Leaf("21st - Bournemouth",1));
        league.add(new Leaf("29th - Arsenal",1));
        
        may.add(league = new Composite("Premier League", 2));
        
        league.add(new Leaf("5th - Brighton",1));
        league.add(new Leaf("13th - Watford",1));  
    }//end makeLeaves

    public void valueChanged(TreeSelectionEvent evt) {
        TreePath path = evt.getPath();
        String selectedTerm = path.getLastPathComponent().toString();

        Leaf lea = fixtures.getChild(selectedTerm);
        if (lea != null)
            cost.setText(new Integer(lea.getTotalFixtures()).toString() + " Fixtures");
    }//end valueChanged
}//end class