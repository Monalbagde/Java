package com.forloop;

public class Pre_Post {

	public static void main(String[] args) {
		
		//i++  -> check then increment->Post increment
		//++i  -> increment then check->Pre increment
		
		//i--  -> check then decrement->Post decrement
		//--i  -> decrement then check->Pre decrement
		
	
		/*
		 for( int i=1; i<5; ++i) 
		 
			{
				System.out.println("hello"+i);
			}
		*/
		

		int a=10;
		System.out.println(a++); //10
		System.out.println(++a);
		
		
		for( int i=1;i<=5; i++) 
			{
				for( int j=0;j<5; j++) 
				{
		System.out.print("Hello ("+i+","+j+")"+"   "); //Hello (1,1)
				}
				System.out.println();
			}
		
		
}
}
