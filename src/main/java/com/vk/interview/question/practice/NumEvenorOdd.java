package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumEvenorOdd {

	public static void main(String[] args) {
		
	//	int num=5;
		
	  String str="India";
	  List<String> list=Arrays.asList(str.split(""));
	  
    
	 Map<String, Long> collect = list.stream().map(String::toLowerCase).collect(Collectors.groupingBy(s-> s,Collectors.counting()));
    
     System.out.println(collect);
	  
		
		
		
		

	}

}
