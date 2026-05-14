package com.vk.stream_all_features;

import java.util.Arrays;

public class AnyMatch {

	public static void main(String[] args) {
		
		/*
		 * 16. anyMatch()
		 * 
		 * Checks condition.
		 */
		
		
		boolean result =
                Arrays.asList(10,20,30)
                      .stream()
                      .anyMatch(n -> n > 25);
		
		
		System.out.println(result);
		
		boolean resultstring =
                Arrays.asList("vijay","ajay")
                      .stream()
                      .anyMatch(n -> n.equalsIgnoreCase("vijay"));
		
		System.out.println(resultstring);
		

      




 		
		
		

	}

}
