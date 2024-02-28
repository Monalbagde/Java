package com.this_thisMethod;

public class Demo_This {

	int p=10;  // instant variable
	
	public void abc(int a)  // parameter me bhi local variable hi hota hai 
	{	
		int p=20;    // local variable
		System.out.println(this);   // ye or object ya id same hota h 
		System.out.println(p);       // without this keyword call local variable
		System.out.println(this.p); // with this keyword call instant variable
		System.out.println(a);      // local variable 
	}
	
}
