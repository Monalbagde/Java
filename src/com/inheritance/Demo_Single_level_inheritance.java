package com.inheritance;

public class Demo_Single_level_inheritance extends Demo1_Single_level_inheritance // ye sub class h mtlb ye extend kr rha h (child)
{
    
	// It reduces the line code
	// extent     extents     extends      extend
	// Every class extends Object class internally except child class
    //when one class access the all properties of another class is called inheritance.
	// in java extends keyword is used to perform inheritance
	// we cant access private member of class through inheritance
	// method overriding only possible through inheritance
	
	public void multi()
	{
		System.out.println("multi number");
	}
	
	public void div()
	{
		System.out.println("div number");
	}
	
	public void allinone()
	{
		System.out.println("total number");
	}
}