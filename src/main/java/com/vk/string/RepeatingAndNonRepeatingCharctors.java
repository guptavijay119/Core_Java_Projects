package com.vk.string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatingAndNonRepeatingCharctors {

	public static void main(String[] args) {
		String str = "programming";
		Map<String, Long> collect = Arrays.stream(str.split("")).
				collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println("---------------"+collect);
		
		for (Map.Entry<String, Long> entry : collect.entrySet()) {
			if(entry.getValue() <= 1) {
				System.out.println("Non Repeating Charcters"+entry.getKey());
			}
			else {
				System.out.println("Repeating Charcters "+entry.getKey());
			}
		}
		
		

	}

}
