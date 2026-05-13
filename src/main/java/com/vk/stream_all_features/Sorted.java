package com.vk.stream_all_features;

import java.util.*;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		
		/* sorted() in Java Stream API

		sorted() method is used to sort the elements of a stream.
		
		1. Default Sorting (Ascending Order)

        Used for numbers and strings. */
		
		
		List<Integer>  list=Arrays.asList(10,50,80,70,40);
		
	     List<Integer>   sortedli=	list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedli);
		
		
		
		
		
		
		

	}

}
