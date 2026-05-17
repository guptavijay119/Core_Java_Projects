package com.example.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestDemo {

	

	public static void main(String[] args) {
		String str="vijay vijay vijay manoj vinay";
		
		List<String> stringasc=Arrays.asList(str.split(" "));
		
		Collections.sort(stringasc);
		
		
		Map<String, Long> collect = stringasc.stream().collect(Collectors.groupingBy(x-> x ,Collectors.counting()));
		
		
		System.out.println(collect);
		
		
		
		
		
		
		
		
		
		

	}

}
