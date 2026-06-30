package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TCS_TEST1 {

	
	
	public static void main(String[] args) {
		
		//create one list and print it top 3 highest mark using stream api 
		
		List<Integer> list=Arrays.asList(100,70,50,90,20,30,40);
		
	List<Integer> result=	list.stream().sorted((a,b)->b-a).limit(3).collect(Collectors.toList());
	
	System.out.println("top 3 marks : " +result);
		
		
		
		
		

	}

}
