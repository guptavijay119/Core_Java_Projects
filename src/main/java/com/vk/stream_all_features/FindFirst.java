package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFirst {

	public static void main(String[] args) {
		
		Integer value=Arrays.asList(10,20,30,40,50).stream().findFirst().get();
		
		System.out.println(value);
		
		System.out.println("-----------------------------------------------------");
		
		List<Double> list=Arrays.asList(10.23,12.36,56.39);
		
		Double double1 = list.stream().findFirst().get();
		System.out.println(double1);
		
		System.out.println("---------find the maximum salary given---------");
		
		
		List<Integer> salary=Arrays.asList(1000,2000,8000,40000,60000);
		
		Collections.reverse(salary);
		
		Integer integer = salary.stream().sorted().findFirst().get();
		
		System.out.println(integer);
		
		
  		
		  
		  
		  
		
 		
		
		

	}

}
