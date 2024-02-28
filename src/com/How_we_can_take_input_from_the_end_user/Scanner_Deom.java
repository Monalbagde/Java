
package com.How_we_can_take_input_from_the_end_user;
import java.util.Scanner;

public class Scanner_Deom {

	public static void main(String[] args) {
		//In java we can use Scanner class to take input from the end user.

		Scanner s=new Scanner(System.in);     //Scanner class object is now created
		System.out.println("Enter your age");
		int a=s.nextInt(); //method calling
		System.out.println("you have entered:"+a);
		
	}
}
