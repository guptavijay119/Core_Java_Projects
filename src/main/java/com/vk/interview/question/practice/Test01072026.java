package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test01072026 {

	public static void main(String[] args) {
		
	List<Integer> list=Arrays.asList(10,20,30,10,20,40,50,40);
	
	Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
	
	System.out.println(collect);
	
	for (Map.Entry<Integer, Long> map:collect.entrySet()) {
		
		if(map.getValue()>1) {
			System.out.println(map.getKey());
			
			
		}
		
	}
	
	
	

	}

}
