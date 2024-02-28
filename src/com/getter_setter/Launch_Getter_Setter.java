package com.getter_setter;

public class Launch_Getter_Setter {

	public static void main(String[] args) {
		
          Demo_Getter_Setter d=new Demo_Getter_Setter();
          d.setSeedID(10);
          d.setSName("Monal");
          d.setSPay(33600);
          d.setSMam("Koi toh tha");
          
          System.out.println("Student ID:-  "+d.getSeedID()+"\nStudent name:-  "+d.getSName()+"\nPay money:-  "+d.getSPay()+"\ncounselor:-  "+d.getSMam());
	}

}
