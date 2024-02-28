package com.types_of_variable;

public class Demo_variable {

    int a=10; // instant variable
    static int b=20; // static variable
	
	public void pqr(int d)  // argument bhi local variable hi hota hai 
	{
		int c=30;  // local variable
		
		System.out.println("instant variable :- "+a);
		System.out.println("static variable :- "+b);
		System.out.println("local variable :- "+c);
		System.out.println("local variable :- "+d);
	}
}
