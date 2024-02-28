package com.constructor;

public class Demo_Constructor {
	Demo_Constructor(String m)
	{
		this();
		System.out.println("hello4");
	}
	Demo_Constructor()
	{
		this(10);
		System.out.println("hello1");
	}
	Demo_Constructor(int a, String name)
	{
		System.out.println("hello2");
	}
	Demo_Constructor(int b)
	{
		this(10,"Monal");	
		System.out.println("hello3");
	}
	

}
