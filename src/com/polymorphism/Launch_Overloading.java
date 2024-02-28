package com.polymorphism;

public class Launch_Overloading {

	public static void main(String[] args) {
		/* 
		  If a class has more than one method with same name but different in parameter.
          There is no impact of return type in order to achieve method overloading
          1.diff number of parameter
          2.diff data types
          3.diff sequence
     
       // Compile time Polymorphism (method overloading)
          
         It is also known as static polymorphism or early binding
         We can achieve compile time polymorphism through method overloading
          
          */
         
		Demo_Overloading d=new Demo_Overloading();
		d.abc(11);
		
	}
}
