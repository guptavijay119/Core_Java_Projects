package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class Bahvan_Cyber_Tech {

	public static void main(String[] args) {

		Integer[] arr= {1,2,4,6,7};
		
		
		HashSet<Integer> set=new HashSet<>(Arrays.asList(arr));
		
		//System.out.println(set);
		IntStream.rangeClosed(1, 7).filter(x->!set.contains(x)).forEach(System.out::println);
		

	}

}
