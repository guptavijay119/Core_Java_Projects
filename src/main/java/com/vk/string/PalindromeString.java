package com.vk.string;

import java.util.stream.Stream;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s1="madamf";
	   String result=	Stream.of(s1.split("")).reduce("",(a,b) -> b+a);
	   
	   if (s1.equals(result)) {
		   System.out.println("palindrome ");
		
	}
	   else
		   System.out.println("not palindrome");
	   
	 
		

	}

}
