package com.vk.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_anargrams {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList(
				 "listen", "silent", "enlist", "google", "elbow", "below"
	        );

		 list.stream()
         .collect(Collectors.groupingBy(str -> {

             char[] ch = str.toCharArray();
             Arrays.sort(ch);
        	// Collections.sort(list);
             return new String(ch);
            

         }))
         .values()
         .stream()
         .filter(x -> x.size() > 1)
         .forEach(System.out::println);
	        
	        
	        
	        
		
		
		
		
		
		

	}

}
