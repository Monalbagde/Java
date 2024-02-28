package com.constructor;

public class Demo_constructor_changing extends Demo1_constructor_changing
{
	public Demo_constructor_changing(int a)
    {
		this("l");
    	System.out.println("Demo hello1");
    }
    
    public Demo_constructor_changing(String b)
    {
    	super();
    	System.out.println("Demo hello2");
    }
    
    public Demo_constructor_changing()
    {
    
    	this(1);
    	System.out.println("Demo hello3");
    }
}
