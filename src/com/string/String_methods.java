package com.string;

public class String_methods {

	public static void main(String[] args) {
		/*  
		 STRING:- length() -> method
		 ARRAY:- length -> keyword
		 */

		//1.concat()
		String s="hello"; 		
		String k=s.concat("jiii");
		System.out.println(k);

		//2.length()
		String s1="hello"; 
		System.out.println(s1.length());
		
		//3.charAt()
		String a1="hello"; 
		char c = a1.charAt(2);
		System.out.println(c);
		
		//4.split()
		String sc="this is my car";
		String[] arr = sc.split(" "); //Array of String
		System.out.println(arr[1]);

		//5.substring()
		String scn="knowledge";
		String substring = scn.substring(3);  //index 3 to last
		System.out.println(substring);
			
		String substring1 = scn.substring(3,7);  //index 3 to 6
		System.out.println(substring1);
		
		//6.startsWith() and 7.endsWith()
        String scnn="knowledge";
		
		boolean b = scnn.startsWith("nowledge");
		System.out.println(b);//false
		
		boolean b1 = scnn.endsWith("nowledge");
		System.out.println(b1);//true
		
		//8.toUpperCase() and 9.toLowerCase()
		String scnna="aamACHAR";
		System.out.println(scnna.toUpperCase());
		System.out.println(scnna.toLowerCase());
		
		//10.getBytes()
		String q="abcdeABCDE";
		byte[] p = q.getBytes();
		for (int i = 0; i < p.length; i++) 
		{
			System.out.println(p[i]);
		}
		
		//11. toCharArray()
		String e="abcd";
		char[] charArray = e.toCharArray();
		System.out.println(charArray[2]);
		
		//12. replace()
		String r="this is my car";
		String replace = r.replace("car", "bhangar");
		System.out.println(r);
		System.out.println(replace);
		
		//13. indexOf()
		String t="abcdea";    // koi char ya kuch or ka index check kr rh h or string m wo 2 ya 2 se jada time hai toh output me phle ane wala hi print hoga (ex.  a 1st or last me h so output me 1st wale liya jayega) 
		int i = t.indexOf("e");
		System.out.println(i);
	}
}
