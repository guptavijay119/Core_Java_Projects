package com.vk.stream_all_features;

import java.util.Arrays;

public class NoneMatch {

	public static void main(String[] args) {
		
//		noneMatch() in Java Stream API
//
//		noneMatch() checks whether no element matches the given condition.
//
//		If no element satisfies condition → returns true
//
//		If at least one element matches → returns false
//		
		boolean result =
                Arrays.asList(10,20,30)
                      .stream()
                      .noneMatch(n -> n > 100);

        System.out.println(result);
        
        
        
		
		

		
	}

}
