package com.composite;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

public class Composite extends Leaf {

	Vector leaves;

    public Composite(String name, int numFixtures) {
        super(name, numFixtures);
        leaf = false;
        leaves = new Vector();
    }//end constructor

    public Composite(Leaf initParent, String initName, int initFixtures) {
        super(initParent, initName, initFixtures);
        leaf = false;
        leaves = new Vector();
    }//end constructor

    public Composite(Leaf l) {
        super(l.getName (), l.getNumFixtures());
        leaves = new Vector();
        leaf = false;
    }//end constructor

    public boolean add(Leaf l) throws NoSuchElementException {
    	leaves.add(l);
        return true;
    }//end add method

    public void remove(Leaf l) throws NoSuchElementException {
    	leaves.removeElement(l);
    }//end remove method

    public Enumeration subordinates() {
        return leaves.elements ();
    }//end subordinates method

    public Leaf getChild(String s) throws NoSuchElementException {

        Leaf newLeaf = null;

        if (getName().equals(s)) {
        	return this;
        }//end if    
        else {
            boolean found = false;
            Enumeration e = subordinates();
            while (e.hasMoreElements() && (! found)) {
                newLeaf = (Leaf)e.nextElement();
                found = newLeaf.getName().equals(s);
                if (! found) {
                    if (! newLeaf.isLeaf ()) {
                        newLeaf = newLeaf.getChild(s);
                    }//end inner if 
                    else {
                        newLeaf = null;
                    }//end else
                    found =(newLeaf != null);
                }//end if
            }//end while
            if (found) {
                return newLeaf;
            }//end if
            else {
                return null;
            }//end inner else
        }//end else
    }//end getChild
}//end class
