package com.switchcase;

public class Switch_Case {

	public static void main(String[] args) {
		
		System.out.println(" a->Addition\n b->Substraction\n c->exit");
		char key='a';  //You can take int or char as your key value
		
		int a=10,b=20;
		System.out.println("\nANSWER IS:-");
		switch (key) 
		{
		    case 'a':System.out.println(a+b);
			       break;
		    case 'b':System.out.println(a-b);
			       break;
		    case 'c':System.out.println("thanks for using...");
		           break;
		    default:
		    	   System.out.println("Please enter correct key");
			       break;
		}
		
	}

}
