package com.this_thisMethod;

public class Demo_ThisMethod {
      //1 constructor is a special type of method whose name is same as class name 
	  //2 the main purpose of constructor is initialize the object  ... same id print krta h mtlb hi initilize hota h error nh detya or waise bhi instant variable object ka hi part hota hai  
	  //3 every java class has a constructor (default constructor)
	  //4 A constructor is automatically called at the object creation
	  //5 constructor never contain any return type (ex. including void)
	 
	int a;
	String name;
	
	/*
	  Demo_ThisMethod()  //3 or 1 or 5
	 
	{
		a=0;
		name="Monal";    // with initilize
	}
	*/
	  
	//without initilize   
	//proved 2 or 4
	void show()
	{
		System.out.println(a+" "+name);
	}
}
