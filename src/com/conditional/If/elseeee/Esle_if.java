package com.conditional.If.elseeee;

public class Esle_if {

	public static void main(String[] args) {
		
		int per=5000;
		/*
		 * age>12 per>60 ->eligible ->Nested
		 */
		if(per<40)
		{
			System.out.println("backup class");
		}
		else if(per<60)
		{
			System.out.println("revision");
		}
		else if(per>60)
		{
			System.out.println("higher class");
		}
	}

}
