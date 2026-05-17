package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		
		//syntax
		
		//collect(Collectors.groupingBy(condition))
		
		//Your code is correct. It counts how many times each word appears.
		
		 List<String> names =
	                Arrays.asList("Java","Spring","Java","SQL","sql");
		 
		 
		// Map<String,Long> collect= names.stream().collect(Collectors.groupingBy(x -> x , Collectors.counting()));
		 
	   Map<String,Long> collect= names.stream().map(String :: toLowerCase).collect(Collectors.groupingBy(x -> x , Collectors.counting()));
		 
		 
		 System.out.println(collect);
		 
		 System.out.println("------------------------------------------------");
		 
		 List<String> charcount = Arrays.asList("a", "abc", "abcd", "abcdef","ABCD");
		 
		 
		 
	Map<String, Long> result=charcount.stream().map(String ::toLowerCase).collect(Collectors.groupingBy(X -> X,Collectors.counting()));
	
	System.out.println(result);
	
	
	
	
	
	
	
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
		 
		 
		

	}

}
