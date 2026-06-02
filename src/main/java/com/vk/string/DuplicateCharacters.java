package com.vk.string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		String str = "programming";
		
		Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		System.out.println("---------------"+collect);
		
		
		for (Map.Entry<String, Long> entry : collect.entrySet()) {
			
			if(entry.getValue() > 1) {
				System.out.println("duplicate characters are "+entry.getKey());
				
			}
			
			
		}
		
		

	}

}
