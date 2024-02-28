package com.conditional.If.elseeee;

public class Nested_if_else {
	public static void main(String[] args) {
		
		int age=11;
		if(age<12)
		{
			System.out.println("under age");
		}
		else //age>=12
		{
			if(age>30)
			{
				System.out.println("over age");
			}
			else
			{
				//correct age-> 12-30
				System.out.println("correct age");
			}
		}
	}

}
