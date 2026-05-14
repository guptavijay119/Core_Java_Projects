package com.vk.stream_all_features;

import java.util.Arrays;

public class AllMatch {

	public static void main(String[] args) {
		
		/*
		 * allMatch() in Java Stream API
		 * 
		 * allMatch() checks whether all elements satisfy the given condition.
		 * 
		 * If every element matches → returns true
		 * 
		 * If even one element fails → returns false
		 */
		
		//syntax
   //		boolean allMatch(Predicate<T> predicate)
		
		boolean result =
                Arrays.asList(10,20,30)
                      .stream()
                      .allMatch(n -> n > 90);
		
		if(result==true) {
			System.out.println("all matches elements are fine according to given checks");
		}
		
		else {
			System.out.println("not matches---");
		}
		
		
		System.out.println(result==true);
		

	}

}
