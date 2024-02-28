package com.string;

public class Immutable_String {

	public static void main(String[] args) {
		
		/*
		 we cant change it (Ex. DOB,gender,name,adhar_no..etc)
                 # With new keyword
                 # Without new keyword

                 In Java String is a non primitive data type
                 String is an object in Java
		 */

		//immutable String: without new keyword
				String s="hello"; 		
				String k=s.concat("ji");
				System.out.println("Real string:- "+s);
				System.out.println("Concat string:- "+k+"\n");
		
				
		//immutable String : with new keyword
				String s1 = new String("cat");	
				String k2 = s1.concat("dog");
				System.out.println("Real string using new keyword:-"+s1);
				System.out.println("Concat string using new keyword:-"+k2);
	}
}
