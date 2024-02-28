package com.task_calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	System.out.println("Welcome on my calculator program");
		
		while (true) {
			
		System.out.println("Press 1->Add\nPress 2->Sub\nPress 3->Div\nPress 4->Mul\nPress 5->exit\n");
		Scanner s=new Scanner(System.in); 
		
		System.out.print("Enter your choice: ");
		int choice=s.nextInt();
		
		if(choice==5)
		{
			System.out.println("Thanks for using...");
			break;
		}
		System.out.print("Enter first digit: ");
		float a=s.nextFloat();
		System.out.print("Enter second digit: ");
		float b=s.nextFloat();
		
		System.out.println();
		switch (choice) {
		case 1:
			System.out.println("Result="+(a+b));
			break;
		case 2:
			System.out.println("Result="+(a-b));
			break;
		case 3:
			System.out.println("Result="+(a/b));
			break;
		case 4:
			System.out.println("Result="+(a*b));
			break;

		default:
			break;
		}
		System.out.println();
		
		}//while loop end point

	}

}
