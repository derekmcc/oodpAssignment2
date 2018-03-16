package com.composite;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

public class Composite extends Leaf{


	Vector leaves;

    public Composite(String name, int numFixtures) {
        super(name, numFixtures);
        leaf = false;
        leaves = new Vector();
    }

    public Composite(Leaf initParent, String initName, int initFixtures) {
        super(initParent, initName, initFixtures);
        leaf = false;
        leaves = new Vector();
    }

    public Composite(Leaf l) {
        super(l.getName (), l.getNumFixtures());
        leaves = new Vector();
        leaf = false;
    }

    public boolean add(Leaf l) throws NoSuchElementException {
    	leaves.add(l);
        return true;
    }

    public void remove(Leaf l) throws NoSuchElementException {
    	leaves.removeElement(l);
    }

    public Enumeration subordinates () {
        return leaves.elements ();
    }

    public Leaf getChild(String s) throws NoSuchElementException {

        Leaf newLeaf = null;

        if (getName().equals(s))
            return this;
        else {
            boolean found = false;
            Enumeration e = subordinates();
            while (e.hasMoreElements() && (! found)) {
                newLeaf = (Leaf)e.nextElement();
                found = newLeaf.getName().equals(s);
                if (! found) {
                    if (! newLeaf.isLeaf ()) {
                        newLeaf = newLeaf.getChild(s);
                    } else
                        newLeaf = null;
                    found =(newLeaf != null);
                }
            }
            if (found)
                return newLeaf;
            else
                return null;
        }
    }

    public int getTimes() {
        int sum = numFixtures;
        for (int i = 0; i < leaves.size(); i++) {
            sum += ((Leaf)leaves.elementAt(i)).getTotalFixtures();
        }
        return sum;
    }

}
