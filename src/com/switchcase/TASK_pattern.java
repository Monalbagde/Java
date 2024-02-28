package com.switchcase;

public class TASK_pattern {

	public static void main(String[] args) {
		
		//System.out.println("Press 1->Addition\nPress 2->Substraction\nPress 3->exit");
		char key='b';  //You can take int or char as your key value
		int a=10,b=20;
		switch (key) 
		{
		    case 'a':
		   
		    for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=i;j++) 
				{
					System.out.print("*");
				} 
				System.out.println();
			}	
            break;
            
		    case 'b':	
		    for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=i;j++) 
				{
					System.out.print(i);
				} 
				System.out.println();
			}	
		    break;
		    
		    default:
		    	   System.out.println("Please enter correct key");
			       break;
		}

	}

}
