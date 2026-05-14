package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.List;

public class FindAny {

	public static void main(String[] args) {
		
		/*
		 * Easy Interview Definition
		 * 
		 * findAny() is a terminal operation in Java Stream API used to return any
		 * element from the stream wrapped inside an Optional object. It is mainly
		 * optimized for parallel stream processing.
		 */
		
		Integer value=Arrays.asList(10,20,30,40,50).parallelStream().findAny().get();
		
		System.out.println(value);
		
		System.out.println("-----------------------------------------------------");
		
		List<Double> list=Arrays.asList(10.23,12.36,56.39);
		
		Double double1 = list.parallelStream().findAny().get();
		System.out.println(double1);
		
 		
		
		

	}

}
