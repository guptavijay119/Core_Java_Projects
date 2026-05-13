package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		
		//12. count()

		//Counts elements.
		
		 long count =
	                Arrays.asList(10,20,30)
	                      .stream()
	                      .count();

	        System.out.println(count);
		
		

	}

}
