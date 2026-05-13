package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.List;

public class for_each {

	public static void main(String[] args) {
	
		List<Integer> li=Arrays.asList(10,20,30,40,40,50,10,20,30,99,98,97,101,97);
		
		
		li.stream().forEach(
				System.out::println);
		

	}

}
