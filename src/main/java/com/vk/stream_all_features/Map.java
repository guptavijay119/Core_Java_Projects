package com.vk.stream_all_features;

import java.util.*;


public class Map {

	public static void main(String[] args) {

	   /*	2. map()
		Purpose

		Transforms each element.
		
		
		
		Difference Between filter() and map()
		
		filter()	          map()
		1. Removes data	      1. Modifies data
		2. Returns boolean	  2. Returns transformed value */
		
		List<String> names =
				Arrays.asList("java","spring","boot");

				names.stream()
				     .map(x -> x.toUpperCase())
				     .forEach(System.out::println);
				
				
				System.out.println("-------------------------------");
				List<Integer> nums =
						Arrays.asList(1,2,3,4);

						nums.stream()
						    .map(x -> x * x)
						    .forEach(System.out::println);
						
						List<Integer> list =
								Arrays.asList(40,10,30,20,20);

						
		
		

	}

}
