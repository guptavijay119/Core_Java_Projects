package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.List;

public class Test27062026 {

	public static void main(String[] args) {

		//total average i need to solve
		List<Integer> list=Arrays.asList(10,20,30,50,40,30,20);
		double unique=list.stream().distinct().
				mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(unique);
		
		
		
	}

}
