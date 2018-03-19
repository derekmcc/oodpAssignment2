package com.factory_method;

public abstract class Manager {

	protected String name, image, nationality; 
	protected int age;

	public abstract String getName();
	public abstract String getImage();
	public abstract String getNationality();
	public abstract int getAge();
}//end class
