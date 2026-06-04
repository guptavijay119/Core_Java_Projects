package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		//Q2. Find the largest and second largest number in an array.
		
		Integer[] num= {10,3,7,1};
		
		
		List<Integer>  list=   Arrays.asList(num);
		
	int num1=list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	
	System.out.println(num1);
		
		
		
		
		
		
	
		
		
		
	   
		
		
		

	}

}
