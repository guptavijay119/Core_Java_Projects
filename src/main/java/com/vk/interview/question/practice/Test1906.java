package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1906 {

	public static void main(String[] args) {
		
		//Given a String “india is great”, find the first 
	//	non-repeated character in it using Stream functions?
		
		String s= "india is great";
		
		List<String> list=Arrays.asList(s.split(""));
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(str-> str,Collectors.counting()));
		
		for(Map.Entry<String, Long> map: collect.entrySet()) {
			
			if(map.getValue()==1) {
				System.out.println(map.getKey());
			}
			
			
			
		}
		
		
		
		
		
		

	}

}
