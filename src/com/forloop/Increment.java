package com.forloop;

public class Increment {
	public static void main(String[] args) {
		
	for(int i=2;i<5;i++)
		{
			System.out.println("hello1");
	    }
	
	
	
	for(int i=2;i<5;) //infinite loop
	{
		System.out.println("hello2");
	}
	
	
	
	for(int i=20;i>5;i++) //infinite loop
	{
		System.out.println("hello3");
	}
	
	
	
	int i=1;
	for( ;i<5;i++) 
	{
		System.out.println("hello4");
	}
	
	
	
//	int i=1;
	for( ;i<5;) 
	{
		System.out.println("hello");
		i++;
	}
	
	
	
//	int i=1;
	for( ;i<5;) 
	{
		i++;
		System.out.println("hello");
	}
	
	
	
//	int i=1;
	for( ;i<5;) 
	{
		i++;
		System.out.println("hello"+i);
	}
	
	
	
//	int i=1;
	for( ;i<5;) 
	{
		i=i+2; 
		System.out.println("hello"+i);
	}
	
	
	

}}
