package com.forloop;

public class Pattern {

	public static void main(String[] args) {
		
		for(int j=1;j<=5;j++)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.print("*");
			} 
			System.out.println();
		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			} 
			System.out.println();
		}	
		
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(k+"  ");
				k++;
			} 
			System.out.println();
		}
	}
}
