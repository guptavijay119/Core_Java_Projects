package com.vk.Collections.all;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rotate {

	public static void main(String[] args) {
  /*		1.Given an array, rotate the elements to the right by K positions. 
		Example 
		Input: [1,2,3,4,5], K = 2
		Output: [4,5,1,2,3] i want to solve via stream */
		
		
		
		
		Integer[] arr= {1,2,3,4,5};
		int k=2;
		
		List<Integer> list=Arrays.asList(arr);
		
		Collections.rotate(list, k);
		
		System.out.println(list);
		
		
		
		/*		1.Given an array, rotate the elements to the right by K positions. 
		Example 
		Input: [1,2,3,4,5], K = 2
		Output: [4,5,1,2,3] i want to solve via stream */
		
		
		
		
		Integer[] arr1= {1,2,3,4,5};
		//o/p= {3,4,5,1,2}
		 int k1=-2;
		
		
		List<Integer> list1=Arrays.asList(arr1);
		
		Collections.rotate(list1, k1);
		
		System.out.println(list1);
		
		
		
		
		
		
		
		
		
		

	}

}
