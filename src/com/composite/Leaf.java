package com.composite;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

public class Leaf extends AbstractTask{

	public Leaf(String initName, int initFixtures) {
        name = initName;
        numFixtures = initFixtures;
        leaf = true;
    }
    
    public Leaf(Leaf initParent, String initName, int initFixtures) {
        name = initName;
        numFixtures = initFixtures;
        parent = initParent;
        leaf = true;
    }

    public int getNumFixtures() {
        return numFixtures;
    }

    public String getName() {
        return name;
    }

    public boolean add(Leaf l) throws NoSuchElementException {
        throw new NoSuchElementException("No subordinates");
    }

    public void remove(Leaf l) throws NoSuchElementException {
        throw new NoSuchElementException("No subordinates");
    }

    public Enumeration subordinates () {
        Vector v = new Vector();
        return v.elements ();
    }

    public Leaf getChild(String s) throws NoSuchElementException {
        throw new NoSuchElementException("No children");
    }

    public int getTotalFixtures() {
        return numFixtures;
    }

    public Leaf getParent() {
        return parent;
    }
}
