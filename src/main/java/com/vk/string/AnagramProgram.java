package com.vk.string;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		
		String s3="night";
		String s4="thing";
		
		char[] s1char=s1.toCharArray();
	    char[] s2char = s2.toCharArray();
	    
	    Arrays.sort(s1char);
	    Arrays.sort(s2char);
	    
	    if (Arrays.equals(s1char, s2char)) {
	    	System.out.println("this is the anargram words : " +s1 +" "+ s2);
			
		}
	    else {
	    	System.out.println("this is not anargram words : ");
	    }
		          
		          
		
		
		
		
		
		
		
		
	}

}
