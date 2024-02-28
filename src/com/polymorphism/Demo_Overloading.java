package com.polymorphism;

public class Demo_Overloading {

	public void abc(int a)
	{
		System.out.println("abc 1:-"+a);
	}
	
	public void abc(int a, int b)
	{
		int c=a+b;
		System.out.println("abc 2:"+c);
	}
	
	public void abc(float a)
	{
		System.out.println("abc 3:-"+a);
	}
	
	public void abc(float a , float b)
	{
		float c=a+b;
		System.out.println("abc 4:-"+c);
	}
	
	public void abc(float a,int b)
	{
		float c=a+b;
		System.out.println("abc 5:-"+c);
	}
}
