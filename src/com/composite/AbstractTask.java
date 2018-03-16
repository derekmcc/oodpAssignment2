package com.composite;
import java.util.Enumeration;
import java.util.NoSuchElementException;

public abstract class AbstractTask {
	
	protected String name;
	protected int numFixtures;
	protected Leaf parent = null;
	protected boolean leaf = true;
	
	public abstract int getNumFixtures();
	public abstract String getName();
	public abstract boolean add(Leaf l)
	        throws NoSuchElementException;
	public abstract void remove(Leaf l)
	        throws NoSuchElementException;
    public abstract Enumeration subordinates();
    public abstract Leaf getChild(String s);
    public abstract int getTotalFixtures();
    public boolean isLeaf() {
        return leaf;
    }
}//end class
