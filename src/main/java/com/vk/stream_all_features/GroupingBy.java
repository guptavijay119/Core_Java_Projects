package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		
		//syntax
		
		//collect(Collectors.groupingBy(condition))
		
		 List<String> names =
	                Arrays.asList("Java","Spring","Java","SQL","sql");
		 
		 
		 Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(x -> x,Collectors.counting()));
		 
		 
		 System.out.println(collect);
		
		 
		 
		 
		

	}

}
