package com.vk.string;

import java.util.Iterator;

import org.apache.logging.log4j.util.Chars;

public class toCharArray {

	public static void main(String[] args) {
		
		
		String word = "ChatGPT";
		
		for (char c : word.toCharArray()) {
			
			if(c=='a'||c=='e'|| c=='i'||c=='o'|| c=='u') {
				System.out.println("this is vowels :   " +  c);
				
			}
			else {
				System.out.println(c);	
			}
			
		}

	}

}
