package com.Vasili;

public abstract class Person {
	
	protected String name;
	
	public abstract String  getName();
	
	public abstract void setName(String name);
}
//It was a public class, but since it has abstract method, we have to say public abstract class
