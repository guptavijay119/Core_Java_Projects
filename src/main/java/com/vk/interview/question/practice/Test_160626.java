package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test_160626 {

	private static List<Integer> collect;

	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(5,4,3,2,1);
		
		//Collections.sort(null);
		
	List<Integer> resuIntegers	= list.stream().sorted()
				.collect(Collectors.toList());
		
		System.out.println(resuIntegers);
		
		//<List<Integer>> asList = Arrays.asList(list);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);
		
		
		
		
		
		

	}

}
