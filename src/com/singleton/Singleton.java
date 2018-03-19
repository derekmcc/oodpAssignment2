package com.singleton;

import com.composite.FixtureTree;

public class Singleton {
	
	private static Singleton fixtureTree;
	
	public static void setFixtureTree(Object fixtureTree) {
		Singleton.fixtureTree = (Singleton) fixtureTree;
	}//end setFixtureTree

	private Singleton() {
		new FixtureTree();
	}//end constructor
	
	public static synchronized Singleton getFixtureTree() throws FixtureTreeLimitException {
		if (fixtureTree == null) {
			fixtureTree = new Singleton();
			return fixtureTree;
		}//end if
		else {
			throw new FixtureTreeLimitException("The program can only have one fixture list");
		}//end else
	}//end method
}//end class
