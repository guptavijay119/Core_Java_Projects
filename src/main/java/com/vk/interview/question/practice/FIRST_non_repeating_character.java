package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FIRST_non_repeating_character {

	public static void main(String[] args) {
		
		
		String str = "jjyywres";
		
		List<String> list=Arrays.asList(str.split(""));
		
		Map<String, Long> collect = list.stream().collect(Collectors.
				groupingBy(str1->str1, LinkedHashMap::new,
				Collectors.counting()));
		
	for(Map.Entry<String, Long> map:collect.entrySet() ) {
		
		if(map.getValue()==1) {
			System.out.println("Non Repeating Character : " +map.getKey());
			break;
			
		}
		
		
	}
		
		
		
		
		

	}

}
