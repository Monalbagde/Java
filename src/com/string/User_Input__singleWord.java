package com.string;

import java.util.Scanner;

public class User_Input__singleWord {

	public static void main(String[] args) {
		
		//Empty String
		//String s="";   ......//empty String
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter name:- ");
		
		String s1=s.next();  // single word input
		System.out.println("you entered:- "+s1);
		

	}

}
