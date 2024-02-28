package com.encapsulation;

import java.util.Scanner;

public class Launch_update_Password {

	public static void main(String[] args) {
		while(true){
			
		System.out.println("Press 1->get\nPress 2->update\nPress 3->exit\n");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=s.nextInt();
		
		if(choice==3)
		{
			System.out.println("thank you");
			break;
		}
		
		Demo_update_Password d=new Demo_update_Password();
		switch(choice)
		{
		       case 1:
		    	    int pass=d.get();
		    	    System.out.println("ur password is :-  "+pass);
		    	     break;
		    	     
		    	     
		       case 2:d.update();
		    	     break;
		    	
		      
		       default: 
		    	       System.out.println("enter correct choice");
		             break;
		
		}
	}

}
}
