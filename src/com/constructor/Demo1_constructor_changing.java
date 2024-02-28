package com.constructor;

public class Demo1_constructor_changing 
{
    public Demo1_constructor_changing(String a ,int b)
    {
    	this("hh","hhh");
    	System.out.println("Demo1 hello1");
    }
    
    public Demo1_constructor_changing(String a, String b)
    {
    	
    	System.out.println("Demo1 hello2");
    }
    
    public Demo1_constructor_changing()
    {
    	this("H",1);
    	System.out.println("Demo1 hello3");
    }
}
