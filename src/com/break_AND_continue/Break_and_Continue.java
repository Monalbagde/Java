package com.break_AND_continue;

public class Break_and_Continue {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}

		System.out.println("\n");
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
		
		System.out.println("\n");
		
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0) //reminder
			{
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
