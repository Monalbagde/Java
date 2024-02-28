package com.encapsulation;

import java.util.Scanner;

public class Demo_update_Password {
	private int password=1441;
	
	Scanner s=new Scanner(System.in);
	
	int get()
	{
		
		System.out.println("enter secret key/OTP");
		int otp=s.nextInt();
		
		if(otp==1234)
		{
			return this.password;   // update password return q nh kr rha hai 
		}
		else
		{
			System.out.println("enter the correct OTP");
			return 0;
		}
	}
	
	void update()
	{
		System.out.println("enter new password");
		int newpass=s.nextInt();
		this.password=newpass;
		
		
		System.out.println("enter secret key/OTP");
		int otp=s.nextInt();
		if(otp==4321)
		{
			System.out.println("password updated!!!");
		}
		else
		{
			System.out.println("invalid OTP");
		}
		
	}

}
