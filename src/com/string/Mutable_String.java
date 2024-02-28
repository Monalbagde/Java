package com.string;

public class Mutable_String {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Buffer---> hello");
		System.out.println(s);
		
		s.append("jiiii");  // concat krta hai
		System.out.println(s);

		
		StringBuilder sc=new StringBuilder("Builder---> hello");
		System.out.println(sc);
		
		sc.append("jiii");
		System.out.println(sc);
	}
}
