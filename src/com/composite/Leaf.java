package com.composite;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

public class Leaf extends AbstractTask{

	public Leaf(String initName, int initFixtures) {
        name = initName;
        numFixtures = initFixtures;
        leaf = true;
    }//end constructor
    
    public Leaf(Leaf initParent, String initName, int initFixtures) {
        name = initName;
        numFixtures = initFixtures;
        parent = initParent;
        leaf = true;
    }//end constructor

    public int getNumFixtures() {
        return numFixtures;
    }//end getNumFixtures

    public String getName() {
        return name;
    }//end getName

    public boolean add(Leaf l) throws NoSuchElementException {
        throw new NoSuchElementException("No subordinates");
    }//end add method

    public void remove(Leaf l) throws NoSuchElementException {
        throw new NoSuchElementException("No subordinates");
    }//end remove method

    public Enumeration subordinates () {
        Vector v = new Vector();
        return v.elements ();
    }//end subordinates

    public Leaf getChild(String s) throws NoSuchElementException {
        throw new NoSuchElementException("No children");
    }//end getChild

    public int getTotalFixtures() {
        return numFixtures;
    }//end getTotalFixtures

    public Leaf getParent() {
        return parent;
    }//end getParent
}//end class
