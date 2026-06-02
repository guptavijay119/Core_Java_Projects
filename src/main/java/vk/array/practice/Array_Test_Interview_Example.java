package vk.array.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Array_Test_Interview_Example {

	public static void main(String[] args) {
		
		
	/*	You are given two lists: one contains all transactions recorded by the bank, 
		and the other contains transactions reported by the payment gateway. 
		Find transactions that are missing in the bank records.
		 
		 
		 
		Sample Input:
		 
		 
		 
		Bank: [1001, 1002, 1004, 1006]
		 
		 
		 
		Gateway: [1001, 1002, 1003, 1004, 1005, 1006]  */
		
		
		
	
		//strem().sorted().collect(Collectors.filtering(bank, Gateway).equals(Collectors.counting()));
		
		
		
		
		
		
		
	/*
	 * 	1.Given an array, rotate the elements to the right by K positions.
		Example
		Input: [1,2,3,4,5], K = 2
		Output: [4,5,1,2,3]
		*/
		
		Integer[] arr= {1,2,3,4,5};
		List<Integer> listarr=Arrays.asList(arr);
		
		
		Collections.rotate(listarr, -2);
		
		System.out.println(listarr);
		

		 /*
		2.Given an array, move all zero values to the end while maintaining the order of non-zero elements.
		Example
		Input: [0,1,0,3,12]
		Output: [1,3,12,0,0]  */
		
		
		Integer[] array= {0,1,0,3,12};
		List<Integer> list=Arrays.asList(array);
		
		List<Integer> list2 = Stream.concat(
				list.stream().filter(x -> x > 0),
				list.stream().filter(x-> x <=0)
				
).toList();
		
		
		System.out.println(list2);
		
		
     
		
		
		

	}

}
