package com.vk.stream_all_features;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class Reduce {

	public static void main(String[] args) {
		
		/* reduce() in Java Stream API

		reduce() is used to combine all elements of a stream into a single result.

		It performs a reduction operation means reducing many values into one value.

		Examples:

		Sum of numbers
		Multiplication
		Maximum value
		Concatenate strings
		Build custom result  
		
		
		Syntax of reduce()
        1. Basic Syntax
		Optional<T> reduce(BinaryOperator<T> accumulator)
		
		
		
		
		List<Integer> list = Arrays.asList(10, 20, 30, 40);

		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
		                           
		System.out.println(sum);  */
		
		List<Integer>  s1=Arrays.asList(10,20,30,40,50);
		
	    int sum= s1.stream().reduce(0, (a,b) -> a+b);
		
		System.out.println(sum); 
		
		
		
		
		
		
		
		
		                            
		                            
		
		
		
		
		
		

	}

}
