package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.Collections;

public class ToArray {

	public static void main(String[] args) {
		
		
		 Object[] arr =
	                Arrays.asList(10,20,30)
	                      .stream()
	                      .toArray();
		 
		 
		 

	        System.out.println(Arrays.toString(arr));

	}

}
