package com.types_of_variable;

public class Demo_we_can_create_local_and_instant_variable_with_same_name {

	int p=50;
	    // It is used to differentiate between local var and instance var
	public void pqr()
	{
		System.out.println("by this keyword:"+this);      //ye or or object na id same hi print hota hai+ 
		
	}
	public void abc()
	{
		int p=100;
		System.out.println(this.p);	   // this keyword wala instant varible show krta h naki local
		// whenever the name of instant variable and local variable both are same then our runtime environment JVM gets confused that which one is local variable and which one is instant variable to avoid this problem we should use this Keyword
		}
}
