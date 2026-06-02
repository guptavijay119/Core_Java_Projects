package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List_anargrams {

	public static void main(String[] args) {
		
	//	Detect all anagrams in a list of strings->  ("listen", "silent", "enlist", "google", "elbow", "below")
	//	write a program using java 8 stream api
		
		
		//List<String> list=Arrays.asList("listen", "silent", "enlist", "google", "elbow", "below");
		
		
		//list.stream().filter(x->x);
		
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
