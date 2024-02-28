package com.encapsulation;

import java.util.Scanner;

public class Demo_get_Password {

	 private int Password=9673;
	 
	 int abc()
	 {
		 
		 Scanner s=new Scanner(System.in);
		 System.out.println("OTP/secret Key");
		 int a=s.nextInt();
		 
		 if(1234==a)  //(1234 is otp/secret key)  system ko otp/ket pta hota h qki o hi generate krta h to dono same hone k baaad password mil jayega 
		 {
			 return Password;
		 }
		 else {
			 System.out.println("write correct key/otp");
			 return 0;
			 
		 }
		 
	 }
}
