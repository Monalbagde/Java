package com.forloop;

public class Addnumberonebyone_TASK {

	public static void main(String[] args) {
		
	     int a=10;
	     int b=15;
	     int sum=0;
	     
	     for(int i=a; i<=b ; i++) //10 11 12 13 14 15 16
	     {
	    	System.out.print(i); 
	    	if(i!=b)
	    	{
	    	 System.out.print("+");
	    	}
	    	sum=sum+i;
	     }
	     System.out.print("="+sum);
			
		}
}
