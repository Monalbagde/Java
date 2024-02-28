package com.logicaloperator;

public class Logical_operators {

	public static void main(String[] args) {
		int age=40;
		if(age<12)
		{
			System.out.println("Underage");
		}
		else if(age>=12 && age<=30)
		{
			System.out.println("Correct age");
		}
		else
		{
			System.out.println("Over age");
		}

	}

}
