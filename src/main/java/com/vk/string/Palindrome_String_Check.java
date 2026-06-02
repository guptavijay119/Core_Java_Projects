package com.vk.string;

import java.util.Iterator;

public class Palindrome_String_Check {

	public static void main(String[] args) {
		
	String str="madam";
	
   //	first trick
	StringBuilder sb=new StringBuilder(str); 
	
	String   reverse=sb.reverse().toString();
	System.out.println(reverse);
	
	if (reverse.equals(str)) {
		System.out.println("palindrome");
		
	}
	else {
		System.out.println("not palindromw");
	}
	
	
     //	second trick
      String revstr="";	
	
	for(int a=str.length()-1;a>=0;a--) {
		
		revstr=revstr+str.charAt(a);
		
		
	}
	if (str.equalsIgnoreCase(revstr)) {
		System.out.println("palindrome--");
		
	}
	else {
		System.out.println("not palindromw--");
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
