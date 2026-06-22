package com.vk.interview.question.practice;

import java.util.Arrays;

public class Palindrome_String {

	public static void main(String[] args) {
		String str1= "babad";
		String str2= "cbbd";
		
	   String reverse="";
	   
	   char[] charArray1 = str1.toCharArray();
	   char[] charArray2 = str2.toCharArray();
	   
	   Arrays.sort(charArray1);
	   Arrays.sort(charArray2);
	   
	   if(Arrays.equals(charArray1, charArray2)) {
		   System.out.println("this is the palindrome string");
		   
		   
	   }
	   
	   else {
		   System.out.println("this is not palindrome string");
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	
	
			
		
		
		
		
		/*Given a string s, return the longestpalindromicsubstring in s.
		 
		Example 1:
		Input: s = "babad"
		Output: "bab"
		Explanation: "aba" is also a valid answer.
		Example 2:
		Input: s = "cbbd"
		Output: "bb" 
		
		 */	
		
		
		
		
		

	}

}
