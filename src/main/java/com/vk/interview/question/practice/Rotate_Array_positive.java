package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rotate_Array_positive {

	public static void main(String[] args) {
		
		Integer[] array= {1,2,3,4,5,6};
		int k=2;
		
		List<Integer> list=Arrays.asList(array);
		
		Collections.rotate(list, k);
		System.out.println(list);
		
		
		

	}

}
