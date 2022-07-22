package org.string;

public class Task2 {
 public static void main(String[] args) {
	 String s = "PreethiParkkavi";
	 String[] c = s.split(" ");
	// System.out.println(c.length());
	 System.out.println(c.length);
	  
	 
	// String s1 = "PreethiParkkavi";
	 
	 String[] s1 = s.split("i");
	 System.out.println(s1.length);
	 
	 for (int i = 0; i < c.length; i++) {
		 System.out.println(c[i]);
		
	}
	 for (String xx : s1) {
		 System.out.println(xx);
		 
		
	}
	 String z = s.toLowerCase();
	 System.out.println(z);
	 
	 String v = s.toUpperCase();
	 System.out.println(v);
	 
}
}
