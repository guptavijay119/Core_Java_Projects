package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Min_max {

	public static void main(String[] args) {
		
		/*
		 * Syntax :
		 * 
		 * Optional<T> min(Comparator<? super T> comparator)
		 */
		
//		min() in Java Stream API
//
//		min() is used to find the minimum (smallest) element from the stream.
//		
		
		Optional<Integer> min = Arrays.asList(10,20,30,40).stream().min(Comparator.naturalOrder());
		
		
		System.out.println(min.toString());
		
		
		Optional<Integer> max = Arrays.asList(10,20,30,40).stream().max(Comparator.naturalOrder());
		
		
		System.out.println(max.toString());
		
		
		
		
		

	}

}
